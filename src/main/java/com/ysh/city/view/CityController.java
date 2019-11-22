package com.ysh.city.view;

import com.ysh.city.service.ICityService;
import com.ysh.city.service.pojo.City;
import com.ysh.sys.temppojo.Temp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/city")
public class CityController {

    @Autowired
    private ICityService cityService;

    @RequestMapping(value = "/findByPid", method = RequestMethod.POST)
    @ResponseBody
    public List<City> findByPid(int cityPid) {
        List<City> cities = cityService.findByPidService(cityPid);

        return cities;
    }

}
