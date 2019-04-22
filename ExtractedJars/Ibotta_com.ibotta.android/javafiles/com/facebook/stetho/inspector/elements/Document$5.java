// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.inspector.elements;

import com.facebook.stetho.common.Accumulator;
import com.facebook.stetho.inspector.helper.ObjectIdMapper;
import java.util.*;

// Referenced classes of package com.facebook.stetho.inspector.elements:
//			Document, ShadowDocument, ElementInfo

class Document$5
	implements Accumulator
{

	public void store(Object obj)
	{
		if(!Document.access$500(Document.this).containsObject(obj))
	//*   0    0:aload_0         
	//*   1    1:getfield        #28  <Field Document this$0>
	//*   2    4:invokestatic    #52  <Method ObjectIdMapper Document.access$500(Document)>
	//*   3    7:aload_1         
	//*   4    8:invokevirtual   #58  <Method boolean ObjectIdMapper.containsObject(Object)>
	//*   5   11:ifne            15
			return;
	//    6   14:return          
		if(listenerInsertedElements.contains(obj))
	//*   7   15:aload_0         
	//*   8   16:getfield        #38  <Field HashSet listenerInsertedElements>
	//*   9   19:aload_1         
	//*  10   20:invokevirtual   #61  <Method boolean HashSet.contains(Object)>
	//*  11   23:ifeq            27
			return;
	//   12   26:return          
		Object obj1 = ((Object) (Document.access$100(Document.this).getElementInfo(obj)));
	//   13   27:aload_0         
	//   14   28:getfield        #28  <Field Document this$0>
	//   15   31:invokestatic    #65  <Method ShadowDocument Document.access$100(Document)>
	//   16   34:aload_1         
	//   17   35:invokevirtual   #71  <Method ElementInfo ShadowDocument.getElementInfo(Object)>
	//   18   38:astore          4
		Object obj2 = ((Object) (val$docUpdate.getElementInfo(obj)));
	//   19   40:aload_0         
	//   20   41:getfield        #30  <Field ShadowDocument$Update val$docUpdate>
	//   21   44:aload_1         
	//   22   45:invokevirtual   #74  <Method ElementInfo ShadowDocument$Update.getElementInfo(Object)>
	//   23   48:astore          5
		if(obj1 != null)
	//*  24   50:aload           4
	//*  25   52:ifnull          65
			obj1 = ((Object) (((ElementInfo) (obj1)).children));
	//   26   55:aload           4
	//   27   57:getfield        #80  <Field List ElementInfo.children>
	//   28   60:astore          4
		else
	//*  29   62:goto            70
			obj1 = ((Object) (Collections.emptyList()));
	//   30   65:invokestatic    #86  <Method List Collections.emptyList()>
	//   31   68:astore          4
		obj2 = ((Object) (((ElementInfo) (obj2)).children));
	//   32   70:aload           5
	//   33   72:getfield        #80  <Field List ElementInfo.children>
	//   34   75:astore          5
		ildEventingList ildeventinglist = Document.access$900(Document.this, obj, ((DocumentView) (val$docUpdate)));
	//   35   77:aload_0         
	//   36   78:getfield        #28  <Field Document this$0>
	//   37   81:aload_1         
	//   38   82:aload_0         
	//   39   83:getfield        #30  <Field ShadowDocument$Update val$docUpdate>
	//   40   86:invokestatic    #90  <Method Document$ChildEventingList Document.access$900(Document, Object, DocumentView)>
	//   41   89:astore          6
		int i = 0;
	//   42   91:iconst_0        
	//   43   92:istore_2        
		for(int j = ((List) (obj1)).size(); i < j; i++)
	//*  44   93:aload           4
	//*  45   95:invokeinterface #96  <Method int List.size()>
	//*  46  100:istore_3        
	//*  47  101:iload_2         
	//*  48  102:iload_3         
	//*  49  103:icmpge          174
		{
			Object obj3 = ((List) (obj1)).get(i);
	//   50  106:aload           4
	//   51  108:iload_2         
	//   52  109:invokeinterface #100 <Method Object List.get(int)>
	//   53  114:astore          7
			if(!Document.access$500(Document.this).containsObject(obj3))
				continue;
	//   54  116:aload_0         
	//   55  117:getfield        #28  <Field Document this$0>
	//   56  120:invokestatic    #52  <Method ObjectIdMapper Document.access$500(Document)>
	//   57  123:aload           7
	//   58  125:invokevirtual   #58  <Method boolean ObjectIdMapper.containsObject(Object)>
	//   59  128:ifeq            167
			ElementInfo elementinfo = val$docUpdate.getElementInfo(obj3);
	//   60  131:aload_0         
	//   61  132:getfield        #30  <Field ShadowDocument$Update val$docUpdate>
	//   62  135:aload           7
	//   63  137:invokevirtual   #74  <Method ElementInfo ShadowDocument$Update.getElementInfo(Object)>
	//   64  140:astore          8
			if(elementinfo == null || elementinfo.parentElement == obj)
	//*  65  142:aload           8
	//*  66  144:ifnull          159
	//*  67  147:aload           8
	//*  68  149:getfield        #104 <Field Object ElementInfo.parentElement>
	//*  69  152:aload_1         
	//*  70  153:if_acmpeq       159
	//*  71  156:goto            167
				ildeventinglist.add(obj3);
	//   72  159:aload           6
	//   73  161:aload           7
	//   74  163:invokevirtual   #109 <Method boolean Document$ChildEventingList.add(Object)>
	//   75  166:pop             
		}

	//   76  167:iload_2         
	//   77  168:iconst_1        
	//   78  169:iadd            
	//   79  170:istore_2        
	//*  80  171:goto            101
		Document.access$1000(ildeventinglist, ((List) (obj2)), insertedElements);
	//   81  174:aload           6
	//   82  176:aload           5
	//   83  178:aload_0         
	//   84  179:getfield        #43  <Field Accumulator insertedElements>
	//   85  182:invokestatic    #113 <Method void Document.access$1000(Document$ChildEventingList, List, Accumulator)>
		Document.access$1100(Document.this, ildeventinglist);
	//   86  185:aload_0         
	//   87  186:getfield        #28  <Field Document this$0>
	//   88  189:aload           6
	//   89  191:invokestatic    #117 <Method void Document.access$1100(Document, Document$ChildEventingList)>
	//   90  194:return          
	}

	private Accumulator insertedElements;
	private final HashSet listenerInsertedElements = new HashSet();
	final Document this$0;
	final ent.Update val$docUpdate;


/*
	static HashSet access$800(Document$5 document$5)
	{
		return document$5.listenerInsertedElements;
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field HashSet listenerInsertedElements>
	//    2    4:areturn         
	}

*/

	Document$5()
	{
		this$0 = final_document;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #28  <Field Document this$0>
		val$docUpdate = ent.Update.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #30  <Field ShadowDocument$Update val$docUpdate>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #33  <Method void Object()>
	//    8   14:aload_0         
	//    9   15:new             #35  <Class HashSet>
	//   10   18:dup             
	//   11   19:invokespecial   #36  <Method void HashSet()>
	//   12   22:putfield        #38  <Field HashSet listenerInsertedElements>
		insertedElements = new Accumulator() {

			public void store(Object obj)
			{
				if(docUpdate.isElementChanged(obj))
			//*   0    0:aload_0         
			//*   1    1:getfield        #15  <Field Document$5 this$1>
			//*   2    4:getfield        #25  <Field ShadowDocument$Update Document$5.val$docUpdate>
			//*   3    7:aload_1         
			//*   4    8:invokevirtual   #31  <Method boolean ShadowDocument$Update.isElementChanged(Object)>
			//*   5   11:ifeq            26
					listenerInsertedElements.add(obj);
			//    6   14:aload_0         
			//    7   15:getfield        #15  <Field Document$5 this$1>
			//    8   18:invokestatic    #35  <Method HashSet Document$5.access$800(Document$5)>
			//    9   21:aload_1         
			//   10   22:invokevirtual   #40  <Method boolean HashSet.add(Object)>
			//   11   25:pop             
			//   12   26:return          
			}

			final Document._cls5 this$1;

			
			{
				this$1 = Document._cls5.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #15  <Field Document$5 this$1>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #18  <Method void Object()>
			//    5    9:return          
			}
		}
;
	//   13   25:aload_0         
	//   14   26:new             #14  <Class Document$5$1>
	//   15   29:dup             
	//   16   30:aload_0         
	//   17   31:invokespecial   #41  <Method void Document$5$1(Document$5)>
	//   18   34:putfield        #43  <Field Accumulator insertedElements>
	//   19   37:return          
	}
}
