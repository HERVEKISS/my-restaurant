/*-----------------------------------------------------------------------------
 - Developed by Herve Bilomba                                              -
 - Last modified 4/7/19 5:49 PM                                            -
 -----------------------------------------------------------------------------*/
package com.example.foodd_app.view.detail;

import com.example.foodd_app.model.Meals;

public interface DetailView {
    void showLoading();
    void hideLoading();
    void setMeal(Meals.Meal meal);
    void onErrorLoading(String message);
}
