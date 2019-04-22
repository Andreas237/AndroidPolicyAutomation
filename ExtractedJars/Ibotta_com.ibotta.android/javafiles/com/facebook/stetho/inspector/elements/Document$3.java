// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.inspector.elements;

import com.facebook.stetho.common.Accumulator;
import com.facebook.stetho.inspector.helper.ObjectIdMapper;

// Referenced classes of package com.facebook.stetho.inspector.elements:
//			Document, ElementInfo, ShadowDocument

class Document$3
	implements Accumulator
{

	public void store(Object obj)
	{
		if(Document.access$500(Document.this).containsObject(obj))
	//*   0    0:aload_0         
	//*   1    1:getfield        #20  <Field Document this$0>
	//*   2    4:invokestatic    #32  <Method ObjectIdMapper Document.access$500(Document)>
	//*   3    7:aload_1         
	//*   4    8:invokevirtual   #38  <Method boolean ObjectIdMapper.containsObject(Object)>
	//*   5   11:ifeq            100
		{
			if(val$docUpdate.getElementInfo(obj).parentElement == null)
	//*   6   14:aload_0         
	//*   7   15:getfield        #22  <Field ShadowDocument$Update val$docUpdate>
	//*   8   18:aload_1         
	//*   9   19:invokevirtual   #44  <Method ElementInfo ShadowDocument$Update.getElementInfo(Object)>
	//*  10   22:getfield        #50  <Field Object ElementInfo.parentElement>
	//*  11   25:ifnonnull       87
			{
				ElementInfo elementinfo = Document.access$100(Document.this).getElementInfo(obj);
	//   12   28:aload_0         
	//   13   29:getfield        #20  <Field Document this$0>
	//   14   32:invokestatic    #54  <Method ShadowDocument Document.access$100(Document)>
	//   15   35:aload_1         
	//   16   36:invokevirtual   #57  <Method ElementInfo ShadowDocument.getElementInfo(Object)>
	//   17   39:astore          4
				int i = Document.access$500(Document.this).getIdForObject(elementinfo.parentElement).intValue();
	//   18   41:aload_0         
	//   19   42:getfield        #20  <Field Document this$0>
	//   20   45:invokestatic    #32  <Method ObjectIdMapper Document.access$500(Document)>
	//   21   48:aload           4
	//   22   50:getfield        #50  <Field Object ElementInfo.parentElement>
	//   23   53:invokevirtual   #61  <Method Integer ObjectIdMapper.getIdForObject(Object)>
	//   24   56:invokevirtual   #67  <Method int Integer.intValue()>
	//   25   59:istore_2        
				int j = Document.access$500(Document.this).getIdForObject(obj).intValue();
	//   26   60:aload_0         
	//   27   61:getfield        #20  <Field Document this$0>
	//   28   64:invokestatic    #32  <Method ObjectIdMapper Document.access$500(Document)>
	//   29   67:aload_1         
	//   30   68:invokevirtual   #61  <Method Integer ObjectIdMapper.getIdForObject(Object)>
	//   31   71:invokevirtual   #67  <Method int Integer.intValue()>
	//   32   74:istore_3        
				Document.access$700(Document.this).onChildNodeRemoved(i, j);
	//   33   75:aload_0         
	//   34   76:getfield        #20  <Field Document this$0>
	//   35   79:invokestatic    #71  <Method Document$UpdateListenerCollection Document.access$700(Document)>
	//   36   82:iload_2         
	//   37   83:iload_3         
	//   38   84:invokevirtual   #77  <Method void Document$UpdateListenerCollection.onChildNodeRemoved(int, int)>
			}
			Document.access$500(Document.this).removeObject(obj);
	//   39   87:aload_0         
	//   40   88:getfield        #20  <Field Document this$0>
	//   41   91:invokestatic    #32  <Method ObjectIdMapper Document.access$500(Document)>
	//   42   94:aload_1         
	//   43   95:invokevirtual   #80  <Method Integer ObjectIdMapper.removeObject(Object)>
	//   44   98:pop             
			return;
	//   45   99:return          
		} else
		{
			throw new IllegalStateException();
	//   46  100:new             #82  <Class IllegalStateException>
	//   47  103:dup             
	//   48  104:invokespecial   #83  <Method void IllegalStateException()>
	//   49  107:athrow          
		}
	}

	final Document this$0;
	final ent.Update val$docUpdate;

	Document$3()
	{
		this$0 = final_document;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #20  <Field Document this$0>
		val$docUpdate = ent.Update.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #22  <Field ShadowDocument$Update val$docUpdate>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #25  <Method void Object()>
	//    8   14:return          
	}
}
