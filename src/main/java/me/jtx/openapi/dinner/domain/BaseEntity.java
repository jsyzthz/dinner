package me.jtx.openapi.dinner.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Transient;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Base entity.
 * 
 * @author huazhong
 * @date 2018/05/17
 */
@Getter
@Setter
@ToString
@MappedSuperclass
public class BaseEntity implements Serializable {

    private static final long serialVersionUID = 3655178731177922437L;

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "create_date")
    private Date createDate;

    @Column(name = "update_date")
    private Date updateDate;

    @Transient
    private Integer page = 1;

    @Transient
    private Integer rows = 10;
}