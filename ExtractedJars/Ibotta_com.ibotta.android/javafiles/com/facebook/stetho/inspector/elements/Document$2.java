// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.inspector.elements;

import com.facebook.stetho.inspector.helper.ObjectIdMapper;

// Referenced classes of package com.facebook.stetho.inspector.elements:
//			Document, DocumentProvider

class Document$2
	implements Runnable
{

	public void run()
	{
		Document.access$200(Document.this).setListener(((DocumentProviderListener) (null)));
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field Document this$0>
	//    2    4:invokestatic    #25  <Method DocumentProvider Document.access$200(Document)>
	//    3    7:aconst_null     
	//    4    8:invokeinterface #31  <Method void DocumentProvider.setListener(DocumentProviderListener)>
		Document.access$102(Document.this, ((ShadowDocument) (null)));
	//    5   13:aload_0         
	//    6   14:getfield        #17  <Field Document this$0>
	//    7   17:aconst_null     
	//    8   18:invokestatic    #35  <Method ShadowDocument Document.access$102(Document, ShadowDocument)>
	//    9   21:pop             
		Document.access$500(Document.this).clear();
	//   10   22:aload_0         
	//   11   23:getfield        #17  <Field Document this$0>
	//   12   26:invokestatic    #39  <Method ObjectIdMapper Document.access$500(Document)>
	//   13   29:invokevirtual   #44  <Method void ObjectIdMapper.clear()>
		Document.access$200(Document.this).dispose();
	//   14   32:aload_0         
	//   15   33:getfield        #17  <Field Document this$0>
	//   16   36:invokestatic    #25  <Method DocumentProvider Document.access$200(Document)>
	//   17   39:invokeinterface #47  <Method void DocumentProvider.dispose()>
		Document.access$202(Document.this, ((DocumentProvider) (null)));
	//   18   44:aload_0         
	//   19   45:getfield        #17  <Field Document this$0>
	//   20   48:aconst_null     
	//   21   49:invokestatic    #51  <Method DocumentProvider Document.access$202(Document, DocumentProvider)>
	//   22   52:pop             
	//   23   53:return          
	}

	final Document this$0;

	Document$2()
	{
		this$0 = Document.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field Document this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}
}
