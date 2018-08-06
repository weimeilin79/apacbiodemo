package org.mycompany;

import org.apache.camel.dataformat.bindy.annotation.CsvRecord;
import org.apache.camel.dataformat.bindy.annotation.DataField;

@CsvRecord(separator = ",")
public class Drug {
	
	@DataField(pos = 1)
	String drugSKUNo           ;
	@DataField(pos = 2)
	String drugClass           ;
	@DataField(pos = 3)
	String drugName            ;
	@DataField(pos = 4)
	String activeIngredient    ;
	@DataField(pos = 5)
	String administrationRoute ;
	@DataField(pos = 6)
	String alcoholWarning      ;
	@DataField(pos = 7)
	String availableStrength   ;
	@DataField(pos = 8)
	String breastfeedingWarning;
	@DataField(pos = 9)
	String dosageForm          ;
	@DataField(pos = 10)
	String doseSchedule        ;
	@DataField(pos = 11)
	String drugUnit            ;
	@DataField(pos = 12)
	String foodWarning         ;
	@DataField(pos = 13)
	String interactingDrug     ;
	@DataField(pos = 14)
	String manufacturer        ;
	@DataField(pos = 15)
	String nonProprietaryName  ;
	@DataField(pos = 16)
	String overdosage          ;
	@DataField(pos = 17)
	String pregnancyWarning    ;
	
	public String getDrugSKUNo() {
		return drugSKUNo;
	}
	public void setDrugSKUNo(String drugSKUNo) {
		this.drugSKUNo = drugSKUNo;
	}
	public String getDrugClass() {
		return drugClass;
	}
	public void setDrugClass(String drugClass) {
		this.drugClass = drugClass;
	}
	public String getDrugName() {
		return drugName;
	}
	public void setDrugName(String drugName) {
		this.drugName = drugName;
	}
	public String getActiveIngredient() {
		return activeIngredient;
	}
	public void setActiveIngredient(String activeIngredient) {
		this.activeIngredient = activeIngredient;
	}
	public String getAdministrationRoute() {
		return administrationRoute;
	}
	public void setAdministrationRoute(String administrationRoute) {
		this.administrationRoute = administrationRoute;
	}
	public String getAlcoholWarning() {
		return alcoholWarning;
	}
	public void setAlcoholWarning(String alcoholWarning) {
		this.alcoholWarning = alcoholWarning;
	}
	public String getAvailableStrength() {
		return availableStrength;
	}
	public void setAvailableStrength(String availableStrength) {
		this.availableStrength = availableStrength;
	}
	public String getBreastfeedingWarning() {
		return breastfeedingWarning;
	}
	public void setBreastfeedingWarning(String breastfeedingWarning) {
		this.breastfeedingWarning = breastfeedingWarning;
	}
	public String getDosageForm() {
		return dosageForm;
	}
	public void setDosageForm(String dosageForm) {
		this.dosageForm = dosageForm;
	}
	public String getDoseSchedule() {
		return doseSchedule;
	}
	public void setDoseSchedule(String doseSchedule) {
		this.doseSchedule = doseSchedule;
	}
	public String getDrugUnit() {
		return drugUnit;
	}
	public void setDrugUnit(String drugUnit) {
		this.drugUnit = drugUnit;
	}
	public String getFoodWarning() {
		return foodWarning;
	}
	public void setFoodWarning(String foodWarning) {
		this.foodWarning = foodWarning;
	}
	public String getInteractingDrug() {
		return interactingDrug;
	}
	public void setInteractingDrug(String interactingDrug) {
		this.interactingDrug = interactingDrug;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public String getNonProprietaryName() {
		return nonProprietaryName;
	}
	public void setNonProprietaryName(String nonProprietaryName) {
		this.nonProprietaryName = nonProprietaryName;
	}
	public String getOverdosage() {
		return overdosage;
	}
	public void setOverdosage(String overdosage) {
		this.overdosage = overdosage;
	}
	public String getPregnancyWarning() {
		return pregnancyWarning;
	}
	public void setPregnancyWarning(String pregnancyWarning) {
		this.pregnancyWarning = pregnancyWarning;
	}
	
	
	
	
	
}
