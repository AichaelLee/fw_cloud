package com.imooc.order.entity;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@Data
public class ResultBean {

	Map<Object, Object> modelBeanMap;

	Map<Object, Object> massegeMap;

	Object resultMsg;

	public ResultBean(){

		modelBeanMap = new HashMap<>();

		massegeMap = new HashMap<>();
	}
}
