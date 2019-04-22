// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.inspector.protocol.module;

import com.facebook.stetho.common.UncheckedCallable;
import com.facebook.stetho.inspector.elements.Document;

// Referenced classes of package com.facebook.stetho.inspector.protocol.module:
//			DOM

class DOM$4
	implements UncheckedCallable
{

	public Object call()
	{
		return DOM.access$300(DOM.this).getElementForNodeId(val$request.nodeId);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field DOM this$0>
	//    2    4:invokestatic    #32  <Method Document DOM.access$300(DOM)>
	//    3    7:aload_0         
	//    4    8:getfield        #22  <Field DOM$ResolveNodeRequest val$request>
	//    5   11:getfield        #38  <Field int DOM$ResolveNodeRequest.nodeId>
	//    6   14:invokevirtual   #44  <Method Object Document.getElementForNodeId(int)>
	//    7   17:areturn         
	}

	final DOM this$0;
	final solveNodeRequest val$request;

	DOM$4()
	{
		this$0 = final_dom;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #20  <Field DOM this$0>
		val$request = solveNodeRequest.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #22  <Field DOM$ResolveNodeRequest val$request>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #25  <Method void Object()>
	//    8   14:return          
	}
}
