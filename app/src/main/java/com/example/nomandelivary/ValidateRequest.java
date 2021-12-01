package com.example.nomandelivary;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

public class ValidateRequest extends StringRequest {
    final static private String URL ="https://younsue0825.cafe24.com/UserValidate.php";
    private Map<String, String> parameters;

    public ValidateRequest(String userName, Response.Listener<String> listener) {
        super(Method.POST, URL, listener, null);
        parameters = new HashMap<>();
        parameters.put("userName", userName);
    }

    @Override
    public Map<String, String> getParams() {
        return parameters;
    }

}
