package com.itheima.domain;

import java.util.Objects;

public class Customer {
    private String custId;
    private String custName;
    private String custSource;
    private String custLevel;
    private String custIndustry;

    private String custPhone;

    public String getCustId() {
        return custId;
    }

    public void setCustId(String custId) {
        this.custId = custId;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getCustSource() {
        return custSource;
    }

    public void setCustSource(String custSource) {
        this.custSource = custSource;
    }

    public String getCustLevel() {
        return custLevel;
    }

    public void setCustLevel(String custLevel) {
        this.custLevel = custLevel;
    }

    public String getCustIndustry() {
        return custIndustry;
    }

    public void setCustIndustry(String custIndustry) {
        this.custIndustry = custIndustry;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Customer customer = (Customer) o;
        return Objects.equals(getCustId(), customer.getCustId()) &&
               Objects.equals(getCustName(), customer.getCustName()) &&
               Objects
                       .equals(getCustSource(), customer.getCustSource()) &&
               Objects.equals(getCustLevel(), customer.getCustLevel()) &&
               Objects
                       .equals(getCustIndustry(), customer.getCustIndustry()) &&
               Objects.equals(getCustPhone(), customer.getCustPhone());
    }

    @Override
    public int hashCode() {

        return Objects
                .hash(getCustId(), getCustName(), getCustSource(),
                      getCustLevel(),
                      getCustIndustry(), getCustPhone());
    }

    public String getCustPhone() {
        return custPhone;
    }

    public void setCustPhone(String custPhone) {
        this.custPhone = custPhone;
    }
}
