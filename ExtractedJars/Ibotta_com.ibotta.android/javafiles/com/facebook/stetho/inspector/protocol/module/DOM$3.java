// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.inspector.protocol.module;

import com.facebook.stetho.inspector.elements.Document;

// Referenced classes of package com.facebook.stetho.inspector.protocol.module:
//			DOM

class DOM$3
	implements Runnable
{

	public void run()
	{
		DOM.access$300(DOM.this).hideHighlight();
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field DOM this$0>
	//    2    4:invokestatic    #26  <Method Document DOM.access$300(DOM)>
	//    3    7:invokevirtual   #30  <Method void Document.hideHighlight()>
	//    4   10:return          
	}

	final DOM this$0;

	DOM$3()
	{
		this$0 = DOM.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field DOM this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void Object()>
	//    5    9:return          
	}
}
