package net.unnnn.products;

import java.io.Serializable;
import java.util.Date;

public class ProductCategory implements Serializable {
    private Long categoryid;

    private String name;

    private String iconurl;

    private Long parentid;

    private Integer sortorder;

    private String description;

    private Date createdtime;

    private Byte isleaf;

    private Byte isdeleted;

    public Long getCategoryid() {
        return categoryid;
    }

    public String getName() {
        return name;
    }

    public String getIconurl() {
        return iconurl;
    }

    public Long getParentid() {
        return parentid;
    }

    public Integer getSortorder() {
        return sortorder;
    }

    public String getDescription() {
        return description;
    }

    public Date getCreatedtime() {
        return createdtime;
    }

    public Byte getIsleaf() {
        return isleaf;
    }

    public Byte getIsdeleted() {
        return isdeleted;
    }
}
