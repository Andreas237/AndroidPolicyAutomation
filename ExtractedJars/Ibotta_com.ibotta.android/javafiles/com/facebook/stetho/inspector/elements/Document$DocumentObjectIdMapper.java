// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.inspector.elements;

import com.facebook.stetho.inspector.helper.ObjectIdMapper;

// Referenced classes of package com.facebook.stetho.inspector.elements:
//			Document, DocumentProvider, NodeDescriptor

private final class Document$DocumentObjectIdMapper extends ObjectIdMapper
{

	protected void onMapped(Object obj, int i)
	{
		verifyThreadAccess();
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field Document this$0>
	//    2    4:invokevirtual   #25  <Method void Document.verifyThreadAccess()>
		Document.access$200(Document.this).getNodeDescriptor(obj).hook(obj);
	//    3    7:aload_0         
	//    4    8:getfield        #13  <Field Document this$0>
	//    5   11:invokestatic    #29  <Method DocumentProvider Document.access$200(Document)>
	//    6   14:aload_1         
	//    7   15:invokeinterface #35  <Method NodeDescriptor DocumentProvider.getNodeDescriptor(Object)>
	//    8   20:aload_1         
	//    9   21:invokeinterface #41  <Method void NodeDescriptor.hook(Object)>
	//   10   26:return          
	}

	protected void onUnmapped(Object obj, int i)
	{
		verifyThreadAccess();
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field Document this$0>
	//    2    4:invokevirtual   #25  <Method void Document.verifyThreadAccess()>
		Document.access$200(Document.this).getNodeDescriptor(obj).unhook(obj);
	//    3    7:aload_0         
	//    4    8:getfield        #13  <Field Document this$0>
	//    5   11:invokestatic    #29  <Method DocumentProvider Document.access$200(Document)>
	//    6   14:aload_1         
	//    7   15:invokeinterface #35  <Method NodeDescriptor DocumentProvider.getNodeDescriptor(Object)>
	//    8   20:aload_1         
	//    9   21:invokeinterface #45  <Method void NodeDescriptor.unhook(Object)>
	//   10   26:return          
	}

	final Document this$0;

	private Document$DocumentObjectIdMapper()
	{
		this$0 = Document.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #13  <Field Document this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #16  <Method void ObjectIdMapper()>
	//    5    9:return          
	}

	Document$DocumentObjectIdMapper(Document._cls1 _pcls1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #20  <Method void Document$DocumentObjectIdMapper(Document)>
	//    3    5:return          
	}
}
