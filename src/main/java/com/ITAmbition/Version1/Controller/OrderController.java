package com.ITAmbition.Version1.Controller;

import java.io.InputStream;
import java.net.URL;
import java.net.URLClassLoader;
import java.sql.Timestamp;
import java.util.*;

import com.ITAmbition.Version1.Entity.OrderID;
import com.ITAmbition.Version1.Service.OrderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ITAmbition.Version1.Entity.OrderEnitiy;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import org.springframework.beans.factory.annotation.Value;


import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import org.apache.logging.log4j.LogManager;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.ui.jasperreports.JasperReportsUtils;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.ResourceBundle;


@RequestMapping(value = "/api")
public class OrderController {
//    @Autowired
//    OrderService orderService;
//
//    final Logger log = LoggerFactory.getLogger(this.getClass());
//    final ModelAndView model = new ModelAndView();
//
//
//
//    @Value("${invoice.logo.path}")
//    private String logo_path;
//
//    @Value("${invoice.template.path}")
//    private String invoice_template;
//
//    @GetMapping(value= "/welcome")
//    public ModelAndView index() {
//        log.info("Showing the welcome page.");
//        model.setViewName("welcome");
//        return model;
//    }
//
//    @GetMapping(value = "/view")
//    public ModelAndView viewReport() {
//        log.info("Preparing the pdf report via jasper.");
//        try {
//            createPdfReport(orderService.getOrder(3));
//            log.info("Invoice successfully saved at the given path.");
//        } catch (final Exception e) {
//            log.error("Some error has occurred while preparing the Invoice pdf.");
//            e.printStackTrace();
//        }
//        // Returning the view name as the index page for ease.
//        model.setViewName("welcome");
//        return model;
//    }
//
//
//    private void createPdfReport(final List<OrderEnitiy> orderEnitiys) throws JRException {
//        // Fetching the .jrxml file from the resources folder.
//        final InputStream stream = this.getClass().getResourceAsStream(invoice_template);
//
//        final JasperDesign jasperDesign = JRXmlLoader.load(stream);
//
//        // Compile the Jasper report from .jrxml to .japser
//        final JasperReport report = JasperCompileManager.compileReport(jasperDesign);
//        ///////////////////////////////////////////////////////////////////////////
//        // Fetching the employees from the data source.
//        final JRBeanCollectionDataSource source = new JRBeanCollectionDataSource(orderEnitiys);
//
//
//        // Adding the additional parameters to the pdf.
//        final Map<String, Object> parameters = new HashMap<>();
//        parameters.put("order_id", 1);
//        parameters.put("logo",getClass().getResourceAsStream(logo_path));
//        parameters.put("REPORT_LOCALE", Locale.GERMAN);
//
//        // Filling the report with the employee data and additional parameters information.
//        final JasperPrint print = JasperFillManager.fillReport(report, parameters, source);
//
//        final String filePath = ".\\src\\main\\resources\\jasper\\Reports\\";
//        JasperExportManager.exportReportToPdfFile(print, filePath + "Invoive.pdf");
//    }

}
