package com.bjsxt.dao.impl;

import com.bjsxt.dao.UserDAO;
import com.bjsxt.model.User;

import java.util.List;
import java.util.Map;
import java.util.Set;


public class UserDAOImpl implements UserDAO {

    private int daoId;
    private String daoStatus;

    private Set<String> sets;
    private List<String> lists;
    private Map<String, String> maps;

    public Set<String> getSets() {
        return sets;
    }

    public void setSets(Set<String> sets) {
        this.sets = sets;
    }

    public List<String> getLists() {
        return lists;
    }

    public void setLists(List<String> lists) {
        this.lists = lists;
    }

    public Map<String, String> getMaps() {
        return maps;
    }

    public void setMaps(Map<String, String> maps) {
        this.maps = maps;
    }


    @Override
    public String toString() {
        return "sets.size: " + sets.size() + " lists.size: " + lists.size() + " maps.size: " + maps.size();
    }

    public int getDaoId() {
        return daoId;
    }

    public void setDaoId(int daoId) {
        this.daoId = daoId;
    }

    public String getDaoStatus() {
        return daoStatus;
    }

    public void setDaoStatus(String daoStatus) {
        this.daoStatus = daoStatus;
    }

    public void save(User user) {
        //Hibernate
        //JDBC
        //XML
        //NetWork
        System.out.println("user saved!");
    }

}
