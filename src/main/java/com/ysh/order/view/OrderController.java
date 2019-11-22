package com.ysh.order.view;

import com.ysh.order.service.IOrderService;
import com.ysh.order.service.pojo.MyOrder;
import com.ysh.sys.temppojo.Temp;
import com.ysh.user.service.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/order")
public class OrderController {
    @Autowired
    private IOrderService orderService;

    @Autowired
    private Temp temp;

    @RequestMapping("/add")
    @ResponseBody
    public Temp add(@RequestParam Map<String, String> condition, HttpSession session) {
        User user = (User) session.getAttribute("user");

        HashMap<String, Object> map = new HashMap<>();

        map.put("uId", user.getUserId());
        map.put("cId", condition.get("cid"));
        map.put("getId", condition.get("getCityId"));
        map.put("backId", condition.get("backCityId"));
        map.put("oprice", condition.get("carPrice"));
        map.put("status", "已预定");

        orderService.addService(map);

        temp.setCondition("1");
        return temp;
    }

    @RequestMapping("/list")
    @ResponseBody
    public Temp list(HttpSession session, @RequestParam Map<String, String> condition) {
        User user = (User) session.getAttribute("user");
        int userId = user.getUserId();

        String page = condition.get("page");

        HashMap<String, Object> map = new HashMap<>();

        map.put("userId", userId);


        map.put("page", Integer.parseInt(page));


        List<MyOrder> list = orderService.listService(map);

        if (list == null) {
            temp.setCondition("您还没预定车辆呢，请返回继续预定车辆");
        } else {
            temp.setMyOrders(list);
            temp.setSize(String.valueOf(orderService.pageCountService(userId)));
            temp.setCondition("1");
        }

        return temp;
    }

    @RequestMapping("/delete")
    public String delete(int id) {
        Integer i = orderService.deleteService(id);

        return "forward:/myMain";
    }
}
