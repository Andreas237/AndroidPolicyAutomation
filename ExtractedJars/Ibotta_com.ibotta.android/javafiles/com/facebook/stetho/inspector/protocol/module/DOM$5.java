// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.inspector.protocol.module;

import com.facebook.stetho.inspector.elements.Document;

// Referenced classes of package com.facebook.stetho.inspector.protocol.module:
//			DOM

class DOM$5
	implements Runnable
{

	public void run()
	{
		Object obj = DOM.access$300(DOM.this).getElementForNodeId(val$request.nodeId);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field DOM this$0>
	//    2    4:invokestatic    #30  <Method Document DOM.access$300(DOM)>
	//    3    7:aload_0         
	//    4    8:getfield        #21  <Field DOM$SetAttributesAsTextRequest val$request>
	//    5   11:getfield        #36  <Field int DOM$SetAttributesAsTextRequest.nodeId>
	//    6   14:invokevirtual   #42  <Method Object Document.getElementForNodeId(int)>
	//    7   17:astore_1        
		if(obj != null)
	//*   8   18:aload_1         
	//*   9   19:ifnull          40
			DOM.access$300(DOM.this).setAttributesAsText(obj, val$request.text);
	//   10   22:aload_0         
	//   11   23:getfield        #19  <Field DOM this$0>
	//   12   26:invokestatic    #30  <Method Document DOM.access$300(DOM)>
	//   13   29:aload_1         
	//   14   30:aload_0         
	//   15   31:getfield        #21  <Field DOM$SetAttributesAsTextRequest val$request>
	//   16   34:getfield        #46  <Field String DOM$SetAttributesAsTextRequest.text>
	//   17   37:invokevirtual   #49  <Method void Document.setAttributesAsText(Object, String)>
	//   18   40:return          
	}

	final DOM this$0;
	final tAttributesAsTextRequest val$request;

	DOM$5()
	{
		this$0 = final_dom;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field DOM this$0>
		val$request = tAttributesAsTextRequest.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field DOM$SetAttributesAsTextRequest val$request>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #24  <Method void Object()>
	//    8   14:return          
	}
}
