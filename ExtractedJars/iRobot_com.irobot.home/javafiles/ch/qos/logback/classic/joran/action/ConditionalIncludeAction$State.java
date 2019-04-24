// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.classic.joran.action;

import java.net.URL;

// Referenced classes of package ch.qos.logback.classic.joran.action:
//			ConditionalIncludeAction

class ConditionalIncludeAction$State
{

	URL getUrl()
	{
		return url;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field URL url>
	//    2    4:areturn         
	}

	void setUrl(URL url1)
	{
		url = url1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #23  <Field URL url>
	//    3    5:return          
	}

	final ConditionalIncludeAction this$0;
	private URL url;

	ConditionalIncludeAction$State()
	{
		this$0 = ConditionalIncludeAction.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field ConditionalIncludeAction this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #18  <Method void Object()>
	//    5    9:return          
	}
}
