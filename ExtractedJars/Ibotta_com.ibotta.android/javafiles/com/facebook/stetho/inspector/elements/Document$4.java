// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.inspector.elements;

import com.facebook.stetho.common.Accumulator;
import com.facebook.stetho.inspector.helper.ObjectIdMapper;

// Referenced classes of package com.facebook.stetho.inspector.elements:
//			Document, ShadowDocument, ElementInfo

class Document$4
	implements Accumulator
{

	public void store(Object obj)
	{
		if(!Document.access$500(Document.this).containsObject(obj))
	//*   0    0:aload_0         
	//*   1    1:getfield        #20  <Field Document this$0>
	//*   2    4:invokestatic    #32  <Method ObjectIdMapper Document.access$500(Document)>
	//*   3    7:aload_1         
	//*   4    8:invokevirtual   #38  <Method boolean ObjectIdMapper.containsObject(Object)>
	//*   5   11:ifne            15
			return;
	//    6   14:return          
		ElementInfo elementinfo = Document.access$100(Document.this).getElementInfo(obj);
	//    7   15:aload_0         
	//    8   16:getfield        #20  <Field Document this$0>
	//    9   19:invokestatic    #42  <Method ShadowDocument Document.access$100(Document)>
	//   10   22:aload_1         
	//   11   23:invokevirtual   #48  <Method ElementInfo ShadowDocument.getElementInfo(Object)>
	//   12   26:astore          4
		if(elementinfo == null)
	//*  13   28:aload           4
	//*  14   30:ifnonnull       34
			return;
	//   15   33:return          
		if(val$docUpdate.getElementInfo(obj).parentElement != elementinfo.parentElement)
	//*  16   34:aload_0         
	//*  17   35:getfield        #22  <Field ShadowDocument$Update val$docUpdate>
	//*  18   38:aload_1         
	//*  19   39:invokevirtual   #51  <Method ElementInfo ShadowDocument$Update.getElementInfo(Object)>
	//*  20   42:getfield        #57  <Field Object ElementInfo.parentElement>
	//*  21   45:aload           4
	//*  22   47:getfield        #57  <Field Object ElementInfo.parentElement>
	//*  23   50:if_acmpeq       99
		{
			int i = Document.access$500(Document.this).getIdForObject(elementinfo.parentElement).intValue();
	//   24   53:aload_0         
	//   25   54:getfield        #20  <Field Document this$0>
	//   26   57:invokestatic    #32  <Method ObjectIdMapper Document.access$500(Document)>
	//   27   60:aload           4
	//   28   62:getfield        #57  <Field Object ElementInfo.parentElement>
	//   29   65:invokevirtual   #61  <Method Integer ObjectIdMapper.getIdForObject(Object)>
	//   30   68:invokevirtual   #67  <Method int Integer.intValue()>
	//   31   71:istore_2        
			int j = Document.access$500(Document.this).getIdForObject(obj).intValue();
	//   32   72:aload_0         
	//   33   73:getfield        #20  <Field Document this$0>
	//   34   76:invokestatic    #32  <Method ObjectIdMapper Document.access$500(Document)>
	//   35   79:aload_1         
	//   36   80:invokevirtual   #61  <Method Integer ObjectIdMapper.getIdForObject(Object)>
	//   37   83:invokevirtual   #67  <Method int Integer.intValue()>
	//   38   86:istore_3        
			Document.access$700(Document.this).onChildNodeRemoved(i, j);
	//   39   87:aload_0         
	//   40   88:getfield        #20  <Field Document this$0>
	//   41   91:invokestatic    #71  <Method Document$UpdateListenerCollection Document.access$700(Document)>
	//   42   94:iload_2         
	//   43   95:iload_3         
	//   44   96:invokevirtual   #77  <Method void Document$UpdateListenerCollection.onChildNodeRemoved(int, int)>
		}
	//   45   99:return          
	}

	final Document this$0;
	final ent.Update val$docUpdate;

	Document$4()
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
