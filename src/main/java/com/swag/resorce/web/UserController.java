package com.swag.resorce.web;

import com.swag.entity.JsonResult;
import com.swag.entity.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * @author leo
 * @ClassName com.swag.resorce.web.UserController
 * @Description
 */
@RestController
@RequestMapping("/user")
@Api("根据ID获取用户详情")
public class UserController {
    //创建线程安全的map
    static Map<Integer,User> users = Collections.synchronizedMap(new HashMap<Integer,User>());

    /**
     * 根据ID查询用户
     * @param id
     * @return
     */
    @ApiOperation(value = "获取用户信息",notes = "根据url的id来获取用户详细信息")
    @ApiImplicitParam(name = "id",value = "用户ID",required = true,dataType = "Integer",paramType = "path")
    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public ResponseEntity<JsonResult> getUserJsonById(@PathVariable(value = "id") Integer id){
        JsonResult r = new JsonResult();
        try {
            User user = users.get(id);
            r.setResult(user);
            r.setStatus("ok");
        }catch (Exception e){
            //设置异常信息
            r.setResult(e.getClass().getName()+":"+e.getMessage());
            r.setStatus("error");
            e.printStackTrace();
        }
        return ResponseEntity.ok(r);
    }


}
