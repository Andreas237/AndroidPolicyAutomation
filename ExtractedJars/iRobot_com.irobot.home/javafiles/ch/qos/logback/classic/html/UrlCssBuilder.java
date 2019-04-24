// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.classic.html;

import ch.qos.logback.core.html.CssBuilder;

public class UrlCssBuilder
	implements CssBuilder
{

	public UrlCssBuilder()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
		url = "http://logback.qos.ch/css/classic.css";
	//    2    4:aload_0         
	//    3    5:ldc1            #14  <String "http://logback.qos.ch/css/classic.css">
	//    4    7:putfield        #16  <Field String url>
	//    5   10:return          
	}

	public void addCss(StringBuilder stringbuilder)
	{
		stringbuilder.append("<link REL=StyleSheet HREF=\"");
	//    0    0:aload_1         
	//    1    1:ldc1            #21  <String "<link REL=StyleSheet HREF=\"">
	//    2    3:invokevirtual   #27  <Method StringBuilder StringBuilder.append(String)>
	//    3    6:pop             
		stringbuilder.append(url);
	//    4    7:aload_1         
	//    5    8:aload_0         
	//    6    9:getfield        #16  <Field String url>
	//    7   12:invokevirtual   #27  <Method StringBuilder StringBuilder.append(String)>
	//    8   15:pop             
		stringbuilder.append("\" TITLE=\"Basic\" />");
	//    9   16:aload_1         
	//   10   17:ldc1            #29  <String "\" TITLE=\"Basic\" />">
	//   11   19:invokevirtual   #27  <Method StringBuilder StringBuilder.append(String)>
	//   12   22:pop             
	//   13   23:return          
	}

	public String getUrl()
	{
		return url;
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field String url>
	//    2    4:areturn         
	}

	public void setUrl(String s)
	{
		url = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field String url>
	//    3    5:return          
	}

	String url;
}
