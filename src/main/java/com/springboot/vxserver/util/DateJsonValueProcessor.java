package com.springboot.vxserver.util;

import net.sf.json.JsonConfig;
import net.sf.json.processors.JsonValueProcessor;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;

/**
 * @author wangshibao
 * @ClassName DateJsonValueProcessor
 * @Description 日期转JSON处理
 * @date 2018/4/23 10:32
 */
public class DateJsonValueProcessor implements JsonValueProcessor {

    private String format = "yyyy-MM-dd HH:mm:ss";

    public DateJsonValueProcessor() {

    }

    public DateJsonValueProcessor(String format) {

        this.format = format;
    }

    public Object processArrayValue(Object value, JsonConfig jsonConfig) {

        String[] obj = {};
        if (value instanceof Timestamp[]) {
            SimpleDateFormat sf = new SimpleDateFormat(format);
            Timestamp[] dates = (Timestamp[]) value;
            obj = new String[dates.length];
            for (int i = 0; i < dates.length; i++) {
                obj[i] = sf.format(dates[i]);
            }
        }
        return obj;
    }

    public Object processObjectValue(String key, Object value, JsonConfig jsonConfig) {

        if (value instanceof Timestamp) {
            String str = new SimpleDateFormat(format).format((Timestamp) value);
            return str;
        }
        return value;
    }

    public String getFormat() {

        return format;
    }

    public void setFormat(String format) {

        this.format = format;
    }

}
