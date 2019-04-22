// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.inspector.protocol.module;

import com.facebook.stetho.inspector.elements.Document;

// Referenced classes of package com.facebook.stetho.inspector.protocol.module:
//			DOM

class DOM$2
	implements Runnable
{

	public void run()
	{
		Object obj = DOM.access$300(DOM.this).getElementForNodeId(val$request.nodeId.intValue());
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field DOM this$0>
	//    2    4:invokestatic    #34  <Method Document DOM.access$300(DOM)>
	//    3    7:aload_0         
	//    4    8:getfield        #23  <Field DOM$HighlightNodeRequest val$request>
	//    5   11:getfield        #40  <Field Integer DOM$HighlightNodeRequest.nodeId>
	//    6   14:invokevirtual   #46  <Method int Integer.intValue()>
	//    7   17:invokevirtual   #52  <Method Object Document.getElementForNodeId(int)>
	//    8   20:astore_1        
		if(obj != null)
	//*   9   21:aload_1         
	//*  10   22:ifnull          43
			DOM.access$300(DOM.this).highlightElement(obj, val$contentColor.getColor());
	//   11   25:aload_0         
	//   12   26:getfield        #21  <Field DOM this$0>
	//   13   29:invokestatic    #34  <Method Document DOM.access$300(DOM)>
	//   14   32:aload_1         
	//   15   33:aload_0         
	//   16   34:getfield        #25  <Field DOM$RGBAColor val$contentColor>
	//   17   37:invokevirtual   #57  <Method int DOM$RGBAColor.getColor()>
	//   18   40:invokevirtual   #61  <Method void Document.highlightElement(Object, int)>
	//   19   43:return          
	}

	final DOM this$0;
	final BAColor val$contentColor;
	final ghlightNodeRequest val$request;

	DOM$2()
	{
		this$0 = final_dom;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #21  <Field DOM this$0>
		val$request = ghlightnoderequest;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #23  <Field DOM$HighlightNodeRequest val$request>
		val$contentColor = BAColor.this;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #25  <Field DOM$RGBAColor val$contentColor>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #28  <Method void Object()>
	//   11   19:return          
	}
}
