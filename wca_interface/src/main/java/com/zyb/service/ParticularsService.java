package com.zyb.service;

import com.zyb.pojo.Persons;

import java.util.List;

public interface ParticularsService {

    List allParticulars(String id);

    Persons personsMessage(String id);
}
