package com.iqmsoft.struts2.action.notiles;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;


@Action
public class IndexAction
        extends ActionSupport
{

    @Override
    public String execute() throws Exception
    {
        return SUCCESS;
    }

}
