package com.example.components;

import org.apache.tapestry5.*;
import org.apache.tapestry5.annotations.*;
import org.apache.tapestry5.ioc.annotations.*;
import org.apache.tapestry5.BindingConstants;

/**
 * Layout component for pages of daniels application.
 */
@Import(stylesheet = "context:layout/styles.css")
public class Layout
{
    /** The page title, for the <title> element and the <h1> element. */
    @Property
    @Parameter(required = true, defaultPrefix = BindingConstants.LITERAL)
    private String pageTitle;

    @Property
    private String pageName;


    @Inject
    private ComponentResources resources;

    public String getClassForPageName()
    {
      return resources.getPageName().equalsIgnoreCase(pageName)
             ? "selected"
             : null;
    }

    public String[] getPageNames()
    {
      return new String[] { "Index", "About"};
    }
}
