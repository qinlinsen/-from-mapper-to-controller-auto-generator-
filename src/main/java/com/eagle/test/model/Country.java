package com.eagle.test.model;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "`COUNTRY`")
public class Country {
    @Id
    @Column(name = "`ID`")
    @GeneratedValue(generator = "JDBC")
    private Integer id;

    @Column(name = "`COUNTRYNAME`")
    private String countryname;

    @Column(name = "`COUNTRYCODE`")
    private String countrycode;

    @Column(name = "`DECIMAL_NUM`")
    private BigDecimal decimalNum;

    @Column(name = "`VERSION`")
    private Integer version;

    public static final String ID = "id";

    public static final String DB_ID = "ID";

    public static final String COUNTRYNAME = "countryname";

    public static final String DB_COUNTRYNAME = "COUNTRYNAME";

    public static final String COUNTRYCODE = "countrycode";

    public static final String DB_COUNTRYCODE = "COUNTRYCODE";

    public static final String DECIMAL_NUM = "decimalNum";

    public static final String DB_DECIMAL_NUM = "DECIMAL_NUM";

    public static final String VERSION = "version";

    public static final String DB_VERSION = "VERSION";

    /**
     * @return ID
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return COUNTRYNAME
     */
    public String getCountryname() {
        return countryname;
    }

    /**
     * @param countryname
     */
    public void setCountryname(String countryname) {
        this.countryname = countryname;
    }

    /**
     * @return COUNTRYCODE
     */
    public String getCountrycode() {
        return countrycode;
    }

    /**
     * @param countrycode
     */
    public void setCountrycode(String countrycode) {
        this.countrycode = countrycode;
    }

    /**
     * @return DECIMAL_NUM
     */
    public BigDecimal getDecimalNum() {
        return decimalNum;
    }

    /**
     * @param decimalNum
     */
    public void setDecimalNum(BigDecimal decimalNum) {
        this.decimalNum = decimalNum;
    }

    /**
     * @return VERSION
     */
    public Integer getVersion() {
        return version;
    }

    /**
     * @param version
     */
    public void setVersion(Integer version) {
        this.version = version;
    }

    public static Country defaultInstance() {
        Country instance = new Country();
        instance.countrycode = new String("HH");
        instance.decimalNum = new BigDecimal("0.10000");
        instance.version = new Integer("1");
        return instance;
    }
}