// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.inspector.elements;

import com.facebook.stetho.common.Accumulator;
import java.util.*;

// Referenced classes of package com.facebook.stetho.inspector.elements:
//			DocumentView, ShadowDocument, ElementInfo

public final class ShadowDocument$Update
	implements DocumentView
{

	private void removeSubTree(Map map, Object obj)
	{
		ElementInfo elementinfo = (ElementInfo)map.get(obj);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokeinterface #39  <Method Object Map.get(Object)>
	//    3    7:checkcast       #41  <Class ElementInfo>
	//    4   10:astore          5
		map.remove(obj);
	//    5   12:aload_1         
	//    6   13:aload_2         
	//    7   14:invokeinterface #44  <Method Object Map.remove(Object)>
	//    8   19:pop             
		int j = elementinfo.children.size();
	//    9   20:aload           5
	//   10   22:getfield        #48  <Field List ElementInfo.children>
	//   11   25:invokeinterface #54  <Method int List.size()>
	//   12   30:istore          4
		for(int i = 0; i < j; i++)
	//*  13   32:iconst_0        
	//*  14   33:istore_3        
	//*  15   34:iload_3         
	//*  16   35:iload           4
	//*  17   37:icmpge          63
			removeSubTree(map, elementinfo.children.get(i));
	//   18   40:aload_0         
	//   19   41:aload_1         
	//   20   42:aload           5
	//   21   44:getfield        #48  <Field List ElementInfo.children>
	//   22   47:iload_3         
	//   23   48:invokeinterface #57  <Method Object List.get(int)>
	//   24   53:invokespecial   #59  <Method void removeSubTree(Map, Object)>

	//   25   56:iload_3         
	//   26   57:iconst_1        
	//   27   58:iadd            
	//   28   59:istore_3        
	//*  29   60:goto            34
	//   30   63:return          
	}

	public void abandon()
	{
		if(ShadowDocument.access$200(ShadowDocument.this))
	//*   0    0:aload_0         
	//*   1    1:getfield        #21  <Field ShadowDocument this$0>
	//*   2    4:invokestatic    #65  <Method boolean ShadowDocument.access$200(ShadowDocument)>
	//*   3    7:ifeq            20
		{
			ShadowDocument.access$202(ShadowDocument.this, false);
	//    4   10:aload_0         
	//    5   11:getfield        #21  <Field ShadowDocument this$0>
	//    6   14:iconst_0        
	//    7   15:invokestatic    #69  <Method boolean ShadowDocument.access$202(ShadowDocument, boolean)>
	//    8   18:pop             
			return;
	//    9   19:return          
		} else
		{
			throw new IllegalStateException();
	//   10   20:new             #71  <Class IllegalStateException>
	//   11   23:dup             
	//   12   24:invokespecial   #72  <Method void IllegalStateException()>
	//   13   27:athrow          
		}
	}

	public void commit()
	{
		if(ShadowDocument.access$200(ShadowDocument.this))
	//*   0    0:aload_0         
	//*   1    1:getfield        #21  <Field ShadowDocument this$0>
	//*   2    4:invokestatic    #65  <Method boolean ShadowDocument.access$200(ShadowDocument)>
	//*   3    7:ifeq            75
		{
			ShadowDocument.access$000(ShadowDocument.this).putAll(mElementToInfoChangesMap);
	//    4   10:aload_0         
	//    5   11:getfield        #21  <Field ShadowDocument this$0>
	//    6   14:invokestatic    #77  <Method IdentityHashMap ShadowDocument.access$000(ShadowDocument)>
	//    7   17:aload_0         
	//    8   18:getfield        #26  <Field Map mElementToInfoChangesMap>
	//    9   21:invokevirtual   #83  <Method void IdentityHashMap.putAll(Map)>
			Object obj;
			for(Iterator iterator = mRootElementChangesSet.iterator(); iterator.hasNext(); removeSubTree(((Map) (ShadowDocument.access$000(ShadowDocument.this))), obj))
	//*  10   24:aload_0         
	//*  11   25:getfield        #28  <Field Set mRootElementChangesSet>
	//*  12   28:invokeinterface #89  <Method Iterator Set.iterator()>
	//*  13   33:astore_1        
	//*  14   34:aload_1         
	//*  15   35:invokeinterface #95  <Method boolean Iterator.hasNext()>
	//*  16   40:ifeq            65
				obj = iterator.next();
	//   17   43:aload_1         
	//   18   44:invokeinterface #99  <Method Object Iterator.next()>
	//   19   49:astore_2        

	//   20   50:aload_0         
	//   21   51:aload_0         
	//   22   52:getfield        #21  <Field ShadowDocument this$0>
	//   23   55:invokestatic    #77  <Method IdentityHashMap ShadowDocument.access$000(ShadowDocument)>
	//   24   58:aload_2         
	//   25   59:invokespecial   #59  <Method void removeSubTree(Map, Object)>
	//*  26   62:goto            34
			ShadowDocument.access$202(ShadowDocument.this, false);
	//   27   65:aload_0         
	//   28   66:getfield        #21  <Field ShadowDocument this$0>
	//   29   69:iconst_0        
	//   30   70:invokestatic    #69  <Method boolean ShadowDocument.access$202(ShadowDocument, boolean)>
	//   31   73:pop             
			return;
	//   32   74:return          
		} else
		{
			throw new IllegalStateException();
	//   33   75:new             #71  <Class IllegalStateException>
	//   34   78:dup             
	//   35   79:invokespecial   #72  <Method void IllegalStateException()>
	//   36   82:athrow          
		}
	}

	public void getChangedElements(Accumulator accumulator)
	{
		for(Iterator iterator = mElementToInfoChangesMap.keySet().iterator(); iterator.hasNext(); accumulator.store(iterator.next()));
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field Map mElementToInfoChangesMap>
	//    2    4:invokeinterface #105 <Method Set Map.keySet()>
	//    3    9:invokeinterface #89  <Method Iterator Set.iterator()>
	//    4   14:astore_2        
	//    5   15:aload_2         
	//    6   16:invokeinterface #95  <Method boolean Iterator.hasNext()>
	//    7   21:ifeq            39
	//    8   24:aload_1         
	//    9   25:aload_2         
	//   10   26:invokeinterface #99  <Method Object Iterator.next()>
	//   11   31:invokeinterface #111 <Method void Accumulator.store(Object)>
	//*  12   36:goto            15
	//   13   39:return          
	}

	public ElementInfo getElementInfo(Object obj)
	{
		ElementInfo elementinfo = (ElementInfo)mElementToInfoChangesMap.get(obj);
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field Map mElementToInfoChangesMap>
	//    2    4:aload_1         
	//    3    5:invokeinterface #39  <Method Object Map.get(Object)>
	//    4   10:checkcast       #41  <Class ElementInfo>
	//    5   13:astore_2        
		if(elementinfo != null)
	//*   6   14:aload_2         
	//*   7   15:ifnull          20
			return elementinfo;
	//    8   18:aload_2         
	//    9   19:areturn         
		else
			return (ElementInfo)ShadowDocument.access$000(ShadowDocument.this).get(obj);
	//   10   20:aload_0         
	//   11   21:getfield        #21  <Field ShadowDocument this$0>
	//   12   24:invokestatic    #77  <Method IdentityHashMap ShadowDocument.access$000(ShadowDocument)>
	//   13   27:aload_1         
	//   14   28:invokevirtual   #115 <Method Object IdentityHashMap.get(Object)>
	//   15   31:checkcast       #41  <Class ElementInfo>
	//   16   34:areturn         
	}

	public void getGarbageElements(Accumulator accumulator)
	{
		ArrayDeque arraydeque = new ArrayDeque();
	//    0    0:new             #118 <Class ArrayDeque>
	//    1    3:dup             
	//    2    4:invokespecial   #119 <Method void ArrayDeque()>
	//    3    7:astore          6
		Iterator iterator = mRootElementChangesSet.iterator();
	//    4    9:aload_0         
	//    5   10:getfield        #28  <Field Set mRootElementChangesSet>
	//    6   13:invokeinterface #89  <Method Iterator Set.iterator()>
	//    7   18:astore          4
		do
		{
			if(!iterator.hasNext())
				break;
	//    8   20:aload           4
	//    9   22:invokeinterface #95  <Method boolean Iterator.hasNext()>
	//   10   27:ifeq            90
			Object obj1 = iterator.next();
	//   11   30:aload           4
	//   12   32:invokeinterface #99  <Method Object Iterator.next()>
	//   13   37:astore          5
			ElementInfo elementinfo1 = getElementInfo(obj1);
	//   14   39:aload_0         
	//   15   40:aload           5
	//   16   42:invokevirtual   #121 <Method ElementInfo getElementInfo(Object)>
	//   17   45:astore          7
			if(obj1 != ShadowDocument.access$100(ShadowDocument.this) && elementinfo1.parentElement == null)
	//*  18   47:aload           5
	//*  19   49:aload_0         
	//*  20   50:getfield        #21  <Field ShadowDocument this$0>
	//*  21   53:invokestatic    #125 <Method Object ShadowDocument.access$100(ShadowDocument)>
	//*  22   56:if_acmpeq       20
	//*  23   59:aload           7
	//*  24   61:getfield        #129 <Field Object ElementInfo.parentElement>
	//*  25   64:ifnonnull       20
			{
				((Queue) (arraydeque)).add(obj1);
	//   26   67:aload           6
	//   27   69:aload           5
	//   28   71:invokeinterface #135 <Method boolean Queue.add(Object)>
	//   29   76:pop             
				((Queue) (arraydeque)).add(obj1);
	//   30   77:aload           6
	//   31   79:aload           5
	//   32   81:invokeinterface #135 <Method boolean Queue.add(Object)>
	//   33   86:pop             
			}
		} while(true);
	//   34   87:goto            20
		do
		{
			if(((Queue) (arraydeque)).isEmpty())
				break;
	//   35   90:aload           6
	//   36   92:invokeinterface #138 <Method boolean Queue.isEmpty()>
	//   37   97:ifne            224
			Object obj3 = ((Queue) (arraydeque)).remove();
	//   38  100:aload           6
	//   39  102:invokeinterface #140 <Method Object Queue.remove()>
	//   40  107:astore          7
			Object obj2 = ((Queue) (arraydeque)).remove();
	//   41  109:aload           6
	//   42  111:invokeinterface #140 <Method Object Queue.remove()>
	//   43  116:astore          5
			Object obj = obj2;
	//   44  118:aload           5
	//   45  120:astore          4
			if(obj3 == obj2)
	//*  46  122:aload           7
	//*  47  124:aload           5
	//*  48  126:if_acmpne       132
				obj = null;
	//   49  129:aconst_null     
	//   50  130:astore          4
			if(getElementInfo(obj3).parentElement == obj)
	//*  51  132:aload_0         
	//*  52  133:aload           7
	//*  53  135:invokevirtual   #121 <Method ElementInfo getElementInfo(Object)>
	//*  54  138:getfield        #129 <Field Object ElementInfo.parentElement>
	//*  55  141:aload           4
	//*  56  143:if_acmpne       90
			{
				accumulator.store(obj3);
	//   57  146:aload_1         
	//   58  147:aload           7
	//   59  149:invokeinterface #111 <Method void Accumulator.store(Object)>
				ElementInfo elementinfo = ShadowDocument.this.getElementInfo(obj3);
	//   60  154:aload_0         
	//   61  155:getfield        #21  <Field ShadowDocument this$0>
	//   62  158:aload           7
	//   63  160:invokevirtual   #141 <Method ElementInfo ShadowDocument.getElementInfo(Object)>
	//   64  163:astore          4
				if(elementinfo != null)
	//*  65  165:aload           4
	//*  66  167:ifnull          90
				{
					int i = 0;
	//   67  170:iconst_0        
	//   68  171:istore_2        
					int j = elementinfo.children.size();
	//   69  172:aload           4
	//   70  174:getfield        #48  <Field List ElementInfo.children>
	//   71  177:invokeinterface #54  <Method int List.size()>
	//   72  182:istore_3        
					while(i < j) 
	//*  73  183:iload_2         
	//*  74  184:iload_3         
	//*  75  185:icmpge          90
					{
						((Queue) (arraydeque)).add(elementinfo.children.get(i));
	//   76  188:aload           6
	//   77  190:aload           4
	//   78  192:getfield        #48  <Field List ElementInfo.children>
	//   79  195:iload_2         
	//   80  196:invokeinterface #57  <Method Object List.get(int)>
	//   81  201:invokeinterface #135 <Method boolean Queue.add(Object)>
	//   82  206:pop             
						((Queue) (arraydeque)).add(obj3);
	//   83  207:aload           6
	//   84  209:aload           7
	//   85  211:invokeinterface #135 <Method boolean Queue.add(Object)>
	//   86  216:pop             
						i++;
	//   87  217:iload_2         
	//   88  218:iconst_1        
	//   89  219:iadd            
	//   90  220:istore_2        
					}
				}
			}
		} while(true);
	//   91  221:goto            183
	//   92  224:return          
	}

	public Object getRootElement()
	{
		return ShadowDocument.this.getRootElement();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field ShadowDocument this$0>
	//    2    4:invokevirtual   #144 <Method Object ShadowDocument.getRootElement()>
	//    3    7:areturn         
	}

	public boolean isElementChanged(Object obj)
	{
		return mElementToInfoChangesMap.containsKey(obj);
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field Map mElementToInfoChangesMap>
	//    2    4:aload_1         
	//    3    5:invokeinterface #148 <Method boolean Map.containsKey(Object)>
	//    4   10:ireturn         
	}

	public boolean isEmpty()
	{
		return mElementToInfoChangesMap.isEmpty();
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field Map mElementToInfoChangesMap>
	//    2    4:invokeinterface #149 <Method boolean Map.isEmpty()>
	//    3    9:ireturn         
	}

	private final Map mElementToInfoChangesMap;
	private final Set mRootElementChangesSet;
	final ShadowDocument this$0;

	public ShadowDocument$Update(Map map, Set set)
	{
		this$0 = ShadowDocument.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #21  <Field ShadowDocument this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #24  <Method void Object()>
		mElementToInfoChangesMap = map;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #26  <Field Map mElementToInfoChangesMap>
		mRootElementChangesSet = set;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #28  <Field Set mRootElementChangesSet>
	//   11   19:return          
	}
}
