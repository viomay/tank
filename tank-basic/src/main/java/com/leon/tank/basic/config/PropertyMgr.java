package com.leon.tank.basic.config;

import java.util.Properties;

/**
 * 配置管理类
 *
 * @author : lihuiming
 * @version : 2021/1/18 20:11
 * @modified:
 */
public class PropertyMgr {

  private static Properties props = new Properties();

  static {
    try {
      props.load(PropertyMgr.class.getClassLoader().getResourceAsStream("config"));
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public static Object get(String key) {
    if (props == null) {
      return null;
    }
    return props.get(key);
  }

  public static void main(String[] args) {
    System.out.println(PropertyMgr.get("initEnemiesCount"));
  }
}
