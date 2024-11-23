package com.dao;



import com.model.CareerOption;
import java.util.List;

public interface CareerOptionDAO {
    void addCareerOption(CareerOption careerOption);
    CareerOption getCareerOptionById(int id);
    List<CareerOption> getAllCareerOptions();
    void updateCareerOption(CareerOption careerOption);
    void deleteCareerOption(int id);
}
