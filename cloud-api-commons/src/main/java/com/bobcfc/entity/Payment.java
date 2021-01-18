package com.bobcfc.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.io.Serializable;

@Data
public class Payment implements Serializable {
    @TableId(value = "pid")
    private Long pid;
    private String serial;
}
