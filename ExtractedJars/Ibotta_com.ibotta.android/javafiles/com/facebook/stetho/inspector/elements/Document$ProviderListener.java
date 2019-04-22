// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.inspector.elements;


// Referenced classes of package com.facebook.stetho.inspector.elements:
//			DocumentProviderListener, Document

private final class Document$ProviderListener
	implements DocumentProviderListener
{

	public void onAttributeModified(Object obj, String s, String s1)
	{
		verifyThreadAccess();
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field Document this$0>
	//    2    4:invokevirtual   #27  <Method void Document.verifyThreadAccess()>
		Document.access$700(Document.this).onAttributeModified(obj, s, s1);
	//    3    7:aload_0         
	//    4    8:getfield        #15  <Field Document this$0>
	//    5   11:invokestatic    #31  <Method Document$UpdateListenerCollection Document.access$700(Document)>
	//    6   14:aload_1         
	//    7   15:aload_2         
	//    8   16:aload_3         
	//    9   17:invokevirtual   #35  <Method void Document$UpdateListenerCollection.onAttributeModified(Object, String, String)>
	//   10   20:return          
	}

	public void onAttributeRemoved(Object obj, String s)
	{
		verifyThreadAccess();
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field Document this$0>
	//    2    4:invokevirtual   #27  <Method void Document.verifyThreadAccess()>
		Document.access$700(Document.this).onAttributeRemoved(obj, s);
	//    3    7:aload_0         
	//    4    8:getfield        #15  <Field Document this$0>
	//    5   11:invokestatic    #31  <Method Document$UpdateListenerCollection Document.access$700(Document)>
	//    6   14:aload_1         
	//    7   15:aload_2         
	//    8   16:invokevirtual   #39  <Method void Document$UpdateListenerCollection.onAttributeRemoved(Object, String)>
	//    9   19:return          
	}

	public void onInspectRequested(Object obj)
	{
		verifyThreadAccess();
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field Document this$0>
	//    2    4:invokevirtual   #27  <Method void Document.verifyThreadAccess()>
		Document.access$700(Document.this).onInspectRequested(obj);
	//    3    7:aload_0         
	//    4    8:getfield        #15  <Field Document this$0>
	//    5   11:invokestatic    #31  <Method Document$UpdateListenerCollection Document.access$700(Document)>
	//    6   14:aload_1         
	//    7   15:invokevirtual   #43  <Method void Document$UpdateListenerCollection.onInspectRequested(Object)>
	//    8   18:return          
	}

	public void onPossiblyChanged()
	{
		Document.access$1200(Document.this);
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field Document this$0>
	//    2    4:invokestatic    #47  <Method void Document.access$1200(Document)>
	//    3    7:return          
	}

	final Document this$0;

	private Document$ProviderListener()
	{
		this$0 = Document.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field Document this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #18  <Method void Object()>
	//    5    9:return          
	}

	Document$ProviderListener(Document._cls1 _pcls1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #22  <Method void Document$ProviderListener(Document)>
	//    3    5:return          
	}
}
