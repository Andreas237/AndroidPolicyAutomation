// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.inspector.elements;

import com.facebook.stetho.common.Accumulator;
import com.facebook.stetho.inspector.helper.ObjectIdMapper;
import java.util.ArrayList;

// Referenced classes of package com.facebook.stetho.inspector.elements:
//			Document, DocumentView

private final class Document$ChildEventingList extends ArrayList
{

	public void acquire(Object obj, DocumentView documentview)
	{
		mParentElement = obj;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #25  <Field Object mParentElement>
		int i;
		if(mParentElement == null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #25  <Field Object mParentElement>
	//*   5    9:ifnonnull       17
			i = -1;
	//    6   12:iconst_m1       
	//    7   13:istore_3        
		else
	//*   8   14:goto            35
			i = Document.access$500(Document.this).getIdForObject(mParentElement).intValue();
	//    9   17:aload_0         
	//   10   18:getfield        #20  <Field Document this$0>
	//   11   21:invokestatic    #37  <Method ObjectIdMapper Document.access$500(Document)>
	//   12   24:aload_0         
	//   13   25:getfield        #25  <Field Object mParentElement>
	//   14   28:invokevirtual   #43  <Method Integer ObjectIdMapper.getIdForObject(Object)>
	//   15   31:invokevirtual   #49  <Method int Integer.intValue()>
	//   16   34:istore_3        
		mParentNodeId = i;
	//   17   35:aload_0         
	//   18   36:iload_3         
	//   19   37:putfield        #27  <Field int mParentNodeId>
		mDocumentView = documentview;
	//   20   40:aload_0         
	//   21   41:aload_2         
	//   22   42:putfield        #51  <Field DocumentView mDocumentView>
	//   23   45:return          
	}

	public void addWithEvent(int i, Object obj, Accumulator accumulator)
	{
		Object obj1;
		if(i == 0)
	//*   0    0:iload_1         
	//*   1    1:ifne            10
			obj1 = null;
	//    2    4:aconst_null     
	//    3    5:astore          5
		else
	//*   4    7:goto            19
			obj1 = get(i - 1);
	//    5   10:aload_0         
	//    6   11:iload_1         
	//    7   12:iconst_1        
	//    8   13:isub            
	//    9   14:invokevirtual   #57  <Method Object get(int)>
	//   10   17:astore          5
		int j;
		if(obj1 == null)
	//*  11   19:aload           5
	//*  12   21:ifnonnull       30
			j = -1;
	//   13   24:iconst_m1       
	//   14   25:istore          4
		else
	//*  15   27:goto            47
			j = Document.access$500(Document.this).getIdForObject(obj1).intValue();
	//   16   30:aload_0         
	//   17   31:getfield        #20  <Field Document this$0>
	//   18   34:invokestatic    #37  <Method ObjectIdMapper Document.access$500(Document)>
	//   19   37:aload           5
	//   20   39:invokevirtual   #43  <Method Integer ObjectIdMapper.getIdForObject(Object)>
	//   21   42:invokevirtual   #49  <Method int Integer.intValue()>
	//   22   45:istore          4
		add(i, obj);
	//   23   47:aload_0         
	//   24   48:iload_1         
	//   25   49:aload_2         
	//   26   50:invokevirtual   #61  <Method void add(int, Object)>
		Document.access$700(Document.this).onChildNodeInserted(mDocumentView, obj, mParentNodeId, j, accumulator);
	//   27   53:aload_0         
	//   28   54:getfield        #20  <Field Document this$0>
	//   29   57:invokestatic    #65  <Method Document$UpdateListenerCollection Document.access$700(Document)>
	//   30   60:aload_0         
	//   31   61:getfield        #51  <Field DocumentView mDocumentView>
	//   32   64:aload_2         
	//   33   65:aload_0         
	//   34   66:getfield        #27  <Field int mParentNodeId>
	//   35   69:iload           4
	//   36   71:aload_3         
	//   37   72:invokevirtual   #71  <Method void Document$UpdateListenerCollection.onChildNodeInserted(DocumentView, Object, int, int, Accumulator)>
	//   38   75:return          
	}

	public void release()
	{
		clear();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #77  <Method void clear()>
		mParentElement = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #25  <Field Object mParentElement>
		mParentNodeId = -1;
	//    5    9:aload_0         
	//    6   10:iconst_m1       
	//    7   11:putfield        #27  <Field int mParentNodeId>
		mDocumentView = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #51  <Field DocumentView mDocumentView>
	//   11   19:return          
	}

	public void removeWithEvent(int i)
	{
		Object obj = remove(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #82  <Method Object remove(int)>
	//    3    5:astore_2        
		i = Document.access$500(Document.this).getIdForObject(obj).intValue();
	//    4    6:aload_0         
	//    5    7:getfield        #20  <Field Document this$0>
	//    6   10:invokestatic    #37  <Method ObjectIdMapper Document.access$500(Document)>
	//    7   13:aload_2         
	//    8   14:invokevirtual   #43  <Method Integer ObjectIdMapper.getIdForObject(Object)>
	//    9   17:invokevirtual   #49  <Method int Integer.intValue()>
	//   10   20:istore_1        
		Document.access$700(Document.this).onChildNodeRemoved(mParentNodeId, i);
	//   11   21:aload_0         
	//   12   22:getfield        #20  <Field Document this$0>
	//   13   25:invokestatic    #65  <Method Document$UpdateListenerCollection Document.access$700(Document)>
	//   14   28:aload_0         
	//   15   29:getfield        #27  <Field int mParentNodeId>
	//   16   32:iload_1         
	//   17   33:invokevirtual   #86  <Method void Document$UpdateListenerCollection.onChildNodeRemoved(int, int)>
	//   18   36:return          
	}

	private DocumentView mDocumentView;
	private Object mParentElement;
	private int mParentNodeId;
	final Document this$0;

	private Document$ChildEventingList()
	{
		this$0 = Document.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #20  <Field Document this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #23  <Method void ArrayList()>
		mParentElement = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #25  <Field Object mParentElement>
		mParentNodeId = -1;
	//    8   14:aload_0         
	//    9   15:iconst_m1       
	//   10   16:putfield        #27  <Field int mParentNodeId>
	//   11   19:return          
	}

	Document$ChildEventingList(Document._cls1 _pcls1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #31  <Method void Document$ChildEventingList(Document)>
	//    3    5:return          
	}
}
