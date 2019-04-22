// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.inspector.protocol.module;

import com.facebook.stetho.common.UncheckedCallable;
import com.facebook.stetho.inspector.elements.Document;

// Referenced classes of package com.facebook.stetho.inspector.protocol.module:
//			DOM

class DOM$1
	implements UncheckedCallable
{

	public de call()
	{
		Object obj = DOM.access$300(DOM.this).getRootElement();
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field DOM this$0>
	//    2    4:invokestatic    #28  <Method Document DOM.access$300(DOM)>
	//    3    7:invokevirtual   #34  <Method Object Document.getRootElement()>
	//    4   10:astore_1        
		DOM dom = DOM.this;
	//    5   11:aload_0         
	//    6   12:getfield        #18  <Field DOM this$0>
	//    7   15:astore_2        
		return DOM.access$400(dom, obj, DOM.access$300(dom).getDocumentView(), ((com.facebook.stetho.common.Accumulator) (null)));
	//    8   16:aload_2         
	//    9   17:aload_1         
	//   10   18:aload_2         
	//   11   19:invokestatic    #28  <Method Document DOM.access$300(DOM)>
	//   12   22:invokevirtual   #38  <Method com.facebook.stetho.inspector.elements.DocumentView Document.getDocumentView()>
	//   13   25:aconst_null     
	//   14   26:invokestatic    #42  <Method DOM$Node DOM.access$400(DOM, Object, com.facebook.stetho.inspector.elements.DocumentView, com.facebook.stetho.common.Accumulator)>
	//   15   29:areturn         
	}

	public volatile Object call()
	{
		return ((Object) (call()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #44  <Method DOM$Node call()>
	//    2    4:areturn         
	}

	final DOM this$0;

	DOM$1()
	{
		this$0 = DOM.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field DOM this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #21  <Method void Object()>
	//    5    9:return          
	}
}
