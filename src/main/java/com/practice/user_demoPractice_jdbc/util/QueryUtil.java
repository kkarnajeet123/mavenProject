package com.practice.user_demoPractice_jdbc.util;

public class QueryUtil {

	public static final String INSERT_SQL="insert into user_tbl(user_name, password, address, mobile_num) values(?,?,?,?) ";
	public static final String UPDATE_SQL = "update user_tbl set user_name=? , password=?, address=?, mobile_num=? where id=?";
	public static final String LIST_SQL="select * from user_tbl";
	public static final String DELETE_SQL ="delete from user_tbl where id=?";
	public static final String GET_BY_ID_SQL = "select * from user_tbl where id=?";	
	public static final String CREATE_TABLE="create table user_tbl(id int not null auto_increment, user_name varchar(50), password varchar (50), address varchar (50), mobile_num bigint , primary key(id))";

}
