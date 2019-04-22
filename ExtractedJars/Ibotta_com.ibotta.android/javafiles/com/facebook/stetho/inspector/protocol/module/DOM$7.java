// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.inspector.protocol.module;

import com.facebook.stetho.common.ArrayListAccumulator;
import com.facebook.stetho.inspector.elements.Document;

// Referenced classes of package com.facebook.stetho.inspector.protocol.module:
//			DOM

class DOM$7
	implements Runnable
{

	public void run()
	{
		DOM.access$300(DOM.this).findMatchingElements(val$request.query, ((com.facebook.stetho.common.Accumulator) (val$resultNodeIds)));
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field DOM this$0>
	//    2    4:invokestatic    #34  <Method Document DOM.access$300(DOM)>
	//    3    7:aload_0         
	//    4    8:getfield        #23  <Field DOM$PerformSearchRequest val$request>
	//    5   11:getfield        #40  <Field String DOM$PerformSearchRequest.query>
	//    6   14:aload_0         
	//    7   15:getfield        #25  <Field ArrayListAccumulator val$resultNodeIds>
	//    8   18:invokevirtual   #46  <Method void Document.findMatchingElements(String, com.facebook.stetho.common.Accumulator)>
	//    9   21:return          
	}

	final DOM this$0;
	final rformSearchRequest val$request;
	final ArrayListAccumulator val$resultNodeIds;

	DOM$7()
	{
		this$0 = final_dom;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #21  <Field DOM this$0>
		val$request = rformsearchrequest;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #23  <Field DOM$PerformSearchRequest val$request>
		val$resultNodeIds = ArrayListAccumulator.this;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #25  <Field ArrayListAccumulator val$resultNodeIds>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #28  <Method void Object()>
	//   11   19:return          
	}
}
