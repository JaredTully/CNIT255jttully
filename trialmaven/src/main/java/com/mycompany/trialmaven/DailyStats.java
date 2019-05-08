/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.trialmaven;

import pl.zankowski.iextrading4j.client.*;
import pl.zankowski.iextrading4j.client.rest.request.marketdata.HistRequestBuilder;
import pl.zankowski.iextrading4j.api.marketdata.HIST;
import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author Jared
 */
public class DailyStats {
    
    final IEXTradingClient iexTradingClient = IEXTradingClient.create();
    final List<HIST> histList = iexTradingClient.executeRequest(new HistRequestBuilder()
                    .withDate(LocalDate.of(2018, 11, 29))
                    .build());

    //System.out.println();
    
    
    
}
