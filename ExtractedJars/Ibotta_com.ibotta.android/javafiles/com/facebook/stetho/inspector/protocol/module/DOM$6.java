// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.inspector.protocol.module;

import com.facebook.stetho.inspector.elements.Document;

// Referenced classes of package com.facebook.stetho.inspector.protocol.module:
//			DOM

class DOM$6
	implements Runnable
{

	public void run()
	{
		DOM.access$300(DOM.this).setInspectModeEnabled(val$request.enabled);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field DOM this$0>
	//    2    4:invokestatic    #30  <Method Document DOM.access$300(DOM)>
	//    3    7:aload_0         
	//    4    8:getfield        #21  <Field DOM$SetInspectModeEnabledRequest val$request>
	//    5   11:getfield        #36  <Field boolean DOM$SetInspectModeEnabledRequest.enabled>
	//    6   14:invokevirtual   #41  <Method void Document.setInspectModeEnabled(boolean)>
	//    7   17:return          
	}

	final DOM this$0;
	final tInspectModeEnabledRequest val$request;

	DOM$6()
	{
		this$0 = final_dom;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field DOM this$0>
		val$request = tInspectModeEnabledRequest.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field DOM$SetInspectModeEnabledRequest val$request>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #24  <Method void Object()>
	//    8   14:return          
	}
}
