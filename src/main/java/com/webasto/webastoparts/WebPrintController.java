/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.webasto.webastoparts;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.print.PageLayout;
import javafx.print.PageOrientation;
import javafx.print.Paper;
import javafx.print.Printer;
import javafx.print.PrinterJob;
import javafx.scene.Node;
import javafx.scene.transform.Scale;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

/**
 *
 * @author FilipKrat
 */
public class WebPrintController implements Initializable {

    @FXML
    private WebView webBrowser;

    private WebEngine webengine;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        try {
            this.webengine = this.webBrowser.getEngine();
            File f = new File("index.html");
            this.webengine.load(f.toURI().toURL().toString());
        } catch (MalformedURLException ex) {
            Logger.getLogger(WebPrintController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void handlePrinterButtonAction(ActionEvent event) {
        print(this.webBrowser);
    }

    public void print(final Node node) {
        //PageLayout pageLayout = printer.createPageLayout(Paper.A4, PageOrientation.PORTRAIT, Printer.MarginType.DEFAULT);
        //double scaleX = pageLayout.getPrintableWidth() / node.getBoundsInParent().getWidth();
        //double scaleY = pageLayout.getPrintableHeight() / node.getBoundsInParent().getHeight();
        //node.getTransforms().add(new Scale(scaleX, scaleY));
        PrinterJob job = PrinterJob.createPrinterJob();
        if (job != null && job.showPrintDialog(node.getScene().getWindow())) {
            boolean success = job.printPage(node);
            if (success) {
                job.endJob();
            }
        }
//        
//
//        PrinterJob job = PrinterJob.createPrinterJob();
//        if (job != null) {
//            boolean success = job.printPage(node);
//            if (success) {
//                job.endJob();
//            }
//        }
    }
}
