package com.ioverlap.dojo.consumingsoapwebservice.consuming;

import com.dataaccess.webservicesserver.NumberToWords;
import com.dataaccess.webservicesserver.NumberToWordsResponse;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

import java.math.BigInteger;

public class NumberClient extends WebServiceGatewaySupport {

    public NumberToWordsResponse getWords(String numbers) {

        String uri = "https://www.dataaccess.com/webservicesserver/NumberConversion.wso";
        NumberToWords numberRequest = new NumberToWords();
        numberRequest.setUbiNum(new BigInteger(numbers));
        NumberToWordsResponse response =
                (NumberToWordsResponse) getWebServiceTemplate().marshalSendAndReceive(uri, numberRequest);
        return response;
    }
}
