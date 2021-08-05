package com.zerer.springframework.beans;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhuangjw
 * @description:
 */
public class PropertyValues {

    private List<PropertyValue> propertyValueList = new ArrayList<>();

    public PropertyValue[] getPropertyValueList() {
        return propertyValueList.toArray(new PropertyValue[0]);
    }

    public void addPropertyValue(PropertyValue pv) {
        this.propertyValueList.add(pv);
    }

    public PropertyValue getPropertyValue(String propertyName) {
        for (PropertyValue pv : this.propertyValueList) {
            if (pv.getName().equals(propertyName)) {
                return pv;
            }
        }
        return null;
    }

}
