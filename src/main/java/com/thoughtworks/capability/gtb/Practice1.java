package com.thoughtworks.capability.gtb;

import java.time.LocalDate;

/**
 * 计算任意日期与下一个劳动节相差多少天
 *
 * @author itutry
 * @create 2020-05-15_16:33
 */
public class Practice1 {
  public static long getDaysBetweenNextLaborDay(LocalDate date) {
    LocalDate thisLaborDay = LocalDate.of(date.getYear(), 5, 1);
    if (date.isBefore(thisLaborDay)) {
      return thisLaborDay.toEpochDay() - date.toEpochDay();
    } else {
      return thisLaborDay.plusYears(1).toEpochDay() - date.toEpochDay();
    }
  }
}
