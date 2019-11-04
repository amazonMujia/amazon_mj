package com.mujia.amazon_mj.util.responseMsg;

import java.util.HashMap;
import java.util.Map;

public class Msg {
  // 处理状态代码，101成功，102处理失败，103数据重复
  private int code;
  private String msg;
  private Map<String, Object> data = new HashMap<String, Object>();

  public static Msg success() {
    Msg msg = new Msg();
    msg.setCode(101);
    msg.setMsg("处理成功!");
    return msg;
  }

  public static Msg fail() {
    Msg msg = new Msg();
    msg.setCode(102);
    msg.setMsg("处理失败!");
    return msg;
  }

  public static Msg exists() {
    Msg msg = new Msg();
    msg.setCode(201);
    msg.setMsg("数据重复!");
    return msg;
  }

  public static Msg notExists() {
    Msg msg = new Msg();
    msg.setCode(202);
    msg.setMsg("数据未重复!");
    return msg;
  }

  public static Msg paramError() {
    Msg msg = new Msg();
    msg.setCode(500);
    msg.setMsg("参数错误!");
    return msg;
  }

  public static Msg notLogin() {
    Msg msg = new Msg();
    msg.setCode(8888);
    msg.setMsg("用户未登录!");
    return msg;
  }

  public static Msg roleNameError() {
    Msg msg = new Msg();
    msg.setCode(8889);
    msg.setMsg("用户权限错误!");
    return msg;
  }

  public static Msg noRole() {
    Msg msg = new Msg();
    msg.setCode(9004);
    msg.setMsg("权限不足");
    return msg;
  }

  public static Msg pathError() {
    Msg msg = new Msg();
    msg.setCode(7001);
    msg.setMsg("请求路径未找到,请确认");
    return msg;
  }

  public static Msg methodError() {
    Msg msg = new Msg();
    msg.setCode(7002);
    msg.setMsg("方法请求出错");
    return msg;
  }

  public static Msg systemError() {
    Msg msg = new Msg();
    msg.setCode(7003);
    msg.setMsg("系统内部出错");
    return msg;
  }

  public int getCode() {
    return code;
  }

  public void setCode(int code) {
    this.code = code;
  }

  public String getMsg() {
    return msg;
  }

  public void setMsg(String msg) {
    this.msg = msg;
  }

  public Map<String, Object> getData() {
    return data;
  }

  public void setData(Map<String, Object> data) {
    this.data = data;
  }

  public Msg add(String key, Object value) {
    this.getData().put(key, value);
    return this;
  }
}
