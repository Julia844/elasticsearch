package com.elastic.beans.es;

import org.springframework.data.elasticsearch.annotations.Field;

import static org.springframework.data.elasticsearch.annotations.FieldType.Text;

/**
 * 用户实体对应的ES实体
 * @Date: 2019/12/19 17:22
 **/
public class UserESEnity extends BaseESEnity {

	private String name;

	@Field(type = Text, store = true, fielddata = true)
	private String type;

}