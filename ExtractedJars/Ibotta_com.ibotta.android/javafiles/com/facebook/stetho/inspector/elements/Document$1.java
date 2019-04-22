// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.inspector.elements;


// Referenced classes of package com.facebook.stetho.inspector.elements:
//			Document, ShadowDocument, DocumentProvider

class Document$1
	implements Runnable
{

	public void run()
	{
		Document document = Document.this;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field Document this$0>
	//    2    4:astore_1        
		Document.access$102(document, new ShadowDocument(Document.access$200(document).getRootElement()));
	//    3    5:aload_1         
	//    4    6:new             #23  <Class ShadowDocument>
	//    5    9:dup             
	//    6   10:aload_1         
	//    7   11:invokestatic    #27  <Method DocumentProvider Document.access$200(Document)>
	//    8   14:invokeinterface #33  <Method Object DocumentProvider.getRootElement()>
	//    9   19:invokespecial   #36  <Method void ShadowDocument(Object)>
	//   10   22:invokestatic    #40  <Method ShadowDocument Document.access$102(Document, ShadowDocument)>
	//   11   25:pop             
		Document.access$300(Document.this).commit();
	//   12   26:aload_0         
	//   13   27:getfield        #17  <Field Document this$0>
	//   14   30:invokestatic    #44  <Method ShadowDocument$Update Document.access$300(Document)>
	//   15   33:invokevirtual   #49  <Method void ShadowDocument$Update.commit()>
		Document.access$200(Document.this).setListener(((DocumentProviderListener) (new oviderListener(Document.this, ((Document$1) (null))))));
	//   16   36:aload_0         
	//   17   37:getfield        #17  <Field Document this$0>
	//   18   40:invokestatic    #27  <Method DocumentProvider Document.access$200(Document)>
	//   19   43:new             #51  <Class Document$ProviderListener>
	//   20   46:dup             
	//   21   47:aload_0         
	//   22   48:getfield        #17  <Field Document this$0>
	//   23   51:aconst_null     
	//   24   52:invokespecial   #54  <Method void Document$ProviderListener(Document, Document$1)>
	//   25   55:invokeinterface #58  <Method void DocumentProvider.setListener(DocumentProviderListener)>
	//   26   60:return          
	}

	final Document this$0;

	Document$1()
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
