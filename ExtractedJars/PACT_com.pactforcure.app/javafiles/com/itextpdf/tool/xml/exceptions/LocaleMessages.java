// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.tool.xml.exceptions;

import java.util.Locale;
import java.util.ResourceBundle;

public class LocaleMessages
{

	public LocaleMessages()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #96  <Method void Object()>
		bundle = ResourceBundle.getBundle("errors/errors", Locale.getDefault());
	//    2    4:aload_0         
	//    3    5:ldc1            #98  <String "errors/errors">
	//    4    7:invokestatic    #104 <Method Locale Locale.getDefault()>
	//    5   10:invokestatic    #110 <Method ResourceBundle ResourceBundle.getBundle(String, Locale)>
	//    6   13:putfield        #112 <Field ResourceBundle bundle>
	//    7   16:return          
	}

	public LocaleMessages(Locale locale)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #96  <Method void Object()>
		bundle = ResourceBundle.getBundle("errors/errors", locale);
	//    2    4:aload_0         
	//    3    5:ldc1            #98  <String "errors/errors">
	//    4    7:aload_1         
	//    5    8:invokestatic    #110 <Method ResourceBundle ResourceBundle.getBundle(String, Locale)>
	//    6   11:putfield        #112 <Field ResourceBundle bundle>
	//    7   14:return          
	}

	public static LocaleMessages getInstance()
	{
		return myself;
	//    0    0:getstatic       #94  <Field LocaleMessages myself>
	//    1    3:areturn         
	}

	public String getMessage(String s)
	{
		return bundle.getString(s);
	//    0    0:aload_0         
	//    1    1:getfield        #112 <Field ResourceBundle bundle>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #120 <Method String ResourceBundle.getString(String)>
	//    4    8:areturn         
	}

	public static final String ADD_HEADER = "html.tag.h.create";
	public static final String A_EXTERNAL = "html.tag.a.external";
	public static final String A_LOCALGOTO = "html.tag.a.local";
	public static final String A_SETLOCALGOTO = "html.tag.a.setlocal";
	public static final String COLSPAN = "html.tag.table.colspan";
	public static final String CUSTOMCONTEXT_404_CONTINUE = "customcontext.404.continue";
	public static final String ELEMENT_NOT_ADDED = "pipeline.pdfwriter.elemnotadded";
	public static final String ELEMENT_NOT_ADDED_EXC = "pipeline.pdfwriter.elemnotaddedexc";
	public static final String HEADER_BM_DISABLED = "html.tag.h.disabled";
	public static final String HTML_IMG_RETRIEVE_FAIL = "html.tag.img.failedretrieve";
	public static final String HTML_IMG_USE = "html.tag.img.try";
	public static final String IMG_SRC_NOTCONVERTED = "exc.img.notconverted";
	public static final String INVALID_NESTED_TAG = "tag.invalidnesting";
	public static final String LINK_404 = "html.tag.link.404";
	public static final String META_404 = "html.tag.meta.404";
	public static final String META_CC = "html.tag.meta.cc";
	public static final String NO_CUSTOM_CONTEXT = "customcontext.404";
	public static final String NO_SIBLING = "tag.nosibling";
	public static final String NO_TAGPROCESSOR = "tag.noprocessor";
	public static final String OWN_CONTEXT_404 = "pipeline.owncontextmissing";
	public static final String PIPELINE_AUTODOC = "pipeline.autodoc.missingdep";
	public static final String SPACEHACK = "html.tag.a.spacehack";
	public static final String STACK_404 = "pipeline.html.missingstack";
	public static final String STYLE_NOTPARSED = "html.tag.style.notparsed";
	public static final String UNSUPPORTED_CHARSET = "unsupported.charset";
	public static final String UNSUPPORTED_CLONING = "unsupported.clone";
	private static LocaleMessages myself = new LocaleMessages();
	private final ResourceBundle bundle;

	static 
	{
	//    0    0:new             #2   <Class LocaleMessages>
	//    1    3:dup             
	//    2    4:invokespecial   #92  <Method void LocaleMessages()>
	//    3    7:putstatic       #94  <Field LocaleMessages myself>
	//*   4   10:return          
	}
}
