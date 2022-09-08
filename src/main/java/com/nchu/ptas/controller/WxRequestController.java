package com.nchu.ptas.controller;

import com.nchu.ptas.entity.Token;
import com.nchu.ptas.service.WxRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @author Ginger
 * @date 2022-09-08
 *
 * 该控制层仅用于需要与微信服务器交互的 api 接口
 */
@RestController
@RequestMapping("/ptas")
public class WxRequestController {
    @Autowired
    WxRequestService wxRequestService;

    @GetMapping("/wx/onLogin")
    @ResponseBody
    public Token onLogin(HttpServletRequest httpServletRequest){
        return wxRequestService.onLogin(httpServletRequest);
    }

}
