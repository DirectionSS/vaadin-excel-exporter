/*
 * 
 */
package org.vaadin.addons.excelexporter.configuration;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import net.karneim.pojobuilder.GeneratePojoBuilder;

/**
 * The Class ExportExcelConfiguration is used to configure the Excel Worksheet.
 * The filename, extension, generatedBy, and sheet configurations can also be
 * configured.
 *
 * @author Kartik Suba
 */
@GeneratePojoBuilder(intoPackage = "*.builder")
public class ExportExcelConfiguration<BEANTYPE> {

	/** The export file name. */
	private String exportFileName;

	/** The generated by. */
	private String generatedBy;

	/** The sheet configs. */
	private List<ExportExcelSheetConfiguration<BEANTYPE>> sheetConfigs = new ArrayList<>();

	/**
	 * The DateTime that should be added to the filename (use Calendar.YEAR etc
	 * for example)
	 */
	private int maxFilenameCalendarExtension = Calendar.MINUTE;

	/**
	 * Gets the export file name.
	 *
	 * @return the export file name
	 */
	public String getExportFileName() {
		return this.exportFileName;
	}

	/**
	 * Gets the generated by.
	 *
	 * @return the generated by
	 */
	public String getGeneratedBy() {
		return this.generatedBy;
	}

	/**
	 * Sets the export file name.
	 *
	 * @param exportFileName
	 *            the new export file name
	 */
	public void setExportFileName(final String exportFileName) {
		this.exportFileName = exportFileName;
	}

	/**
	 * Sets the generated by.
	 *
	 * @param generatedBy
	 *            the new generated by
	 */
	public void setGeneratedBy(final String generatedBy) {
		this.generatedBy = generatedBy;
	}

	/**
	 * Gets the sheet configs.
	 *
	 * @return the sheet configs
	 */
	public List<ExportExcelSheetConfiguration<BEANTYPE>> getSheetConfigs() {
		return this.sheetConfigs;
	}

	/**
	 * Sets the sheet configs.
	 *
	 * @param sheetConfigs
	 *            the new sheet configs
	 */
	public void setSheetConfigs(final List<ExportExcelSheetConfiguration<BEANTYPE>> sheetConfigs) {
		this.sheetConfigs = sheetConfigs;
		for (ExportExcelSheetConfiguration<BEANTYPE> sheetConfig : sheetConfigs) {
			sheetConfig.setExportExcelConfiguration(this);
		}
	}

	public int getMaxFilenameCalendarExtension() {
		return this.maxFilenameCalendarExtension;
	}

	public void setMaxFilenameCalendarExtension(int maxFilenameCalendarExtension) {
		this.maxFilenameCalendarExtension = maxFilenameCalendarExtension;
	}
}