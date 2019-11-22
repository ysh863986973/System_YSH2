package com.ysh.car.view;

import com.ysh.car.service.ICarService;
import com.ysh.car.service.pojo.Car;
import com.ysh.city.service.ICityService;
import com.ysh.city.service.pojo.City;
import com.ysh.sys.temppojo.Temp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/car")
public class CarController {
    @Autowired
    private ICarService carService;

    @Autowired
    private ICityService cityService;

    @Autowired
    private Temp temp;

    @RequestMapping(value = "/getAndBackCity", method = RequestMethod.GET)
    @ResponseBody
    public Temp getAndBackCity(@RequestParam(value = "getCityId") int getCityId, int backCityId) {

//        根据借车的城市Id获取对应的城市
        City getCity = cityService.findByIdService(getCityId);
//        根据还车的城市Id获取对应的城市
        City backCity = cityService.findByIdService(backCityId);

        temp.setCondition("1");
        temp.setGetCity(getCity);
        temp.setBackCity(backCity);

        return temp;
    }

    @RequestMapping(value = "/listCar", method = RequestMethod.GET)
    @ResponseBody
    public Temp listCar(@RequestParam Map<String, String> condition) {
        String carPrice = condition.get("carPrice");
        String carNumber = condition.get("carNumber");

//        根据城市Id获取该城市所有的可租用车辆
        HashMap<String, Object> map = new HashMap<>();

        map.put("carCid", Integer.parseInt(condition.get("getCityId")));

        if (carPrice != null) {

            map.put("carPrice", Integer.parseInt(carPrice));
        }

        if (carNumber != null) {
            map.put("carNumber", Integer.parseInt(carNumber));
        }


        List<Car> cars = carService.findByCidService(map);
        if (cars == null) {
            temp.setCondition("该城市车辆已全被租完了，加急配车中");
        } else {
            temp.setCondition("1");
            temp.setCars(cars);
        }

        return temp;
    }

    @RequestMapping("/findById")
    @ResponseBody
    public Temp findById(int cid) {
        List<Car> cars = carService.findByIdService(cid);

        if (cars != null) {
            temp.setCondition("1");
            temp.setCars(cars);
        } else {
            temp.setCondition("该车已被其他用户租用，请重新选择车辆");
        }
        return temp;
    }
}
