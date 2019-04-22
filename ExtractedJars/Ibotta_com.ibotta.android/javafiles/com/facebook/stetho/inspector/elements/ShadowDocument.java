// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.inspector.elements;

import com.facebook.stetho.common.*;
import java.util.*;

// Referenced classes of package com.facebook.stetho.inspector.elements:
//			DocumentView, ElementInfo

public final class ShadowDocument
	implements DocumentView
{
	public final class Update
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
			if(mIsUpdating)
		//*   0    0:aload_0         
		//*   1    1:getfield        #21  <Field ShadowDocument this$0>
		//*   2    4:invokestatic    #65  <Method boolean ShadowDocument.access$200(ShadowDocument)>
		//*   3    7:ifeq            20
			{
				mIsUpdating = false;
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
			if(mIsUpdating)
		//*   0    0:aload_0         
		//*   1    1:getfield        #21  <Field ShadowDocument this$0>
		//*   2    4:invokestatic    #65  <Method boolean ShadowDocument.access$200(ShadowDocument)>
		//*   3    7:ifeq            75
			{
				mElementToInfoMap.putAll(mElementToInfoChangesMap);
		//    4   10:aload_0         
		//    5   11:getfield        #21  <Field ShadowDocument this$0>
		//    6   14:invokestatic    #77  <Method IdentityHashMap ShadowDocument.access$000(ShadowDocument)>
		//    7   17:aload_0         
		//    8   18:getfield        #26  <Field Map mElementToInfoChangesMap>
		//    9   21:invokevirtual   #83  <Method void IdentityHashMap.putAll(Map)>
				Object obj;
				for(Iterator iterator = mRootElementChangesSet.iterator(); iterator.hasNext(); removeSubTree(((Map) (mElementToInfoMap)), obj))
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
				mIsUpdating = false;
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
				return (ElementInfo)mElementToInfoMap.get(obj);
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
				if(obj1 != mRootElement && elementinfo1.parentElement == null)
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

		public Update(Map map, Set set)
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

	public final class UpdateBuilder
	{

		private HashSet acquireNotNewChildrenHashSet()
		{
			HashSet hashset1 = mCachedNotNewChildrenSet;
		//    0    0:aload_0         
		//    1    1:getfield        #38  <Field HashSet mCachedNotNewChildrenSet>
		//    2    4:astore_2        
			HashSet hashset = hashset1;
		//    3    5:aload_2         
		//    4    6:astore_1        
			if(hashset1 == null)
		//*   5    7:aload_2         
		//*   6    8:ifnonnull       19
				hashset = new HashSet();
		//    7   11:new             #30  <Class HashSet>
		//    8   14:dup             
		//    9   15:invokespecial   #31  <Method void HashSet()>
		//   10   18:astore_1        
			mCachedNotNewChildrenSet = null;
		//   11   19:aload_0         
		//   12   20:aconst_null     
		//   13   21:putfield        #38  <Field HashSet mCachedNotNewChildrenSet>
			return hashset;
		//   14   24:aload_1         
		//   15   25:areturn         
		}

		private void releaseNotNewChildrenHashSet(HashSet hashset)
		{
			hashset.clear();
		//    0    0:aload_1         
		//    1    1:invokevirtual   #45  <Method void HashSet.clear()>
			if(mCachedNotNewChildrenSet == null)
		//*   2    4:aload_0         
		//*   3    5:getfield        #38  <Field HashSet mCachedNotNewChildrenSet>
		//*   4    8:ifnonnull       16
				mCachedNotNewChildrenSet = hashset;
		//    5   11:aload_0         
		//    6   12:aload_1         
		//    7   13:putfield        #38  <Field HashSet mCachedNotNewChildrenSet>
		//    8   16:return          
		}

		private void setElementParent(Object obj, Object obj1)
		{
			Object obj2 = ((Object) ((ElementInfo)mElementToInfoChangesMap.get(obj)));
		//    0    0:aload_0         
		//    1    1:getfield        #28  <Field Map mElementToInfoChangesMap>
		//    2    4:aload_1         
		//    3    5:invokeinterface #54  <Method Object Map.get(Object)>
		//    4   10:checkcast       #56  <Class ElementInfo>
		//    5   13:astore_3        
			if(obj2 != null && obj1 == ((ElementInfo) (obj2)).parentElement)
		//*   6   14:aload_3         
		//*   7   15:ifnull          27
		//*   8   18:aload_2         
		//*   9   19:aload_3         
		//*  10   20:getfield        #60  <Field Object ElementInfo.parentElement>
		//*  11   23:if_acmpne       27
				return;
		//   12   26:return          
			ElementInfo elementinfo = (ElementInfo)mElementToInfoMap.get(obj);
		//   13   27:aload_0         
		//   14   28:getfield        #20  <Field ShadowDocument this$0>
		//   15   31:invokestatic    #64  <Method IdentityHashMap ShadowDocument.access$000(ShadowDocument)>
		//   16   34:aload_1         
		//   17   35:invokevirtual   #67  <Method Object IdentityHashMap.get(Object)>
		//   18   38:checkcast       #56  <Class ElementInfo>
		//   19   41:astore          4
			if(obj2 == null && elementinfo != null && obj1 == elementinfo.parentElement)
		//*  20   43:aload_3         
		//*  21   44:ifnonnull       62
		//*  22   47:aload           4
		//*  23   49:ifnull          62
		//*  24   52:aload_2         
		//*  25   53:aload           4
		//*  26   55:getfield        #60  <Field Object ElementInfo.parentElement>
		//*  27   58:if_acmpne       62
				return;
		//   28   61:return          
			if(obj2 != null && elementinfo != null && obj1 == elementinfo.parentElement && ListUtil.identityEquals(elementinfo.children, ((ElementInfo) (obj2)).children))
		//*  29   62:aload_3         
		//*  30   63:ifnull          120
		//*  31   66:aload           4
		//*  32   68:ifnull          120
		//*  33   71:aload_2         
		//*  34   72:aload           4
		//*  35   74:getfield        #60  <Field Object ElementInfo.parentElement>
		//*  36   77:if_acmpne       120
		//*  37   80:aload           4
		//*  38   82:getfield        #71  <Field List ElementInfo.children>
		//*  39   85:aload_3         
		//*  40   86:getfield        #71  <Field List ElementInfo.children>
		//*  41   89:invokestatic    #77  <Method boolean ListUtil.identityEquals(List, List)>
		//*  42   92:ifeq            120
			{
				mElementToInfoChangesMap.remove(obj);
		//   43   95:aload_0         
		//   44   96:getfield        #28  <Field Map mElementToInfoChangesMap>
		//   45   99:aload_1         
		//   46  100:invokeinterface #80  <Method Object Map.remove(Object)>
		//   47  105:pop             
				if(obj1 == null)
		//*  48  106:aload_2         
		//*  49  107:ifnonnull       119
					mRootElementChanges.remove(obj);
		//   50  110:aload_0         
		//   51  111:getfield        #33  <Field HashSet mRootElementChanges>
		//   52  114:aload_1         
		//   53  115:invokevirtual   #83  <Method boolean HashSet.remove(Object)>
		//   54  118:pop             
				return;
		//   55  119:return          
			}
			if(obj2 != null)
		//*  56  120:aload_3         
		//*  57  121:ifnull          132
				obj2 = ((Object) (((ElementInfo) (obj2)).children));
		//   58  124:aload_3         
		//   59  125:getfield        #71  <Field List ElementInfo.children>
		//   60  128:astore_3        
			else
		//*  61  129:goto            150
			if(elementinfo != null)
		//*  62  132:aload           4
		//*  63  134:ifnull          146
				obj2 = ((Object) (elementinfo.children));
		//   64  137:aload           4
		//   65  139:getfield        #71  <Field List ElementInfo.children>
		//   66  142:astore_3        
			else
		//*  67  143:goto            150
				obj2 = ((Object) (Collections.emptyList()));
		//   68  146:invokestatic    #89  <Method List Collections.emptyList()>
		//   69  149:astore_3        
			obj2 = ((Object) (new ElementInfo(obj, obj1, ((List) (obj2)))));
		//   70  150:new             #56  <Class ElementInfo>
		//   71  153:dup             
		//   72  154:aload_1         
		//   73  155:aload_2         
		//   74  156:aload_3         
		//   75  157:invokespecial   #92  <Method void ElementInfo(Object, Object, List)>
		//   76  160:astore_3        
			mElementToInfoChangesMap.put(obj, obj2);
		//   77  161:aload_0         
		//   78  162:getfield        #28  <Field Map mElementToInfoChangesMap>
		//   79  165:aload_1         
		//   80  166:aload_3         
		//   81  167:invokeinterface #96  <Method Object Map.put(Object, Object)>
		//   82  172:pop             
			if(obj1 == null)
		//*  83  173:aload_2         
		//*  84  174:ifnonnull       187
			{
				mRootElementChanges.add(obj);
		//   85  177:aload_0         
		//   86  178:getfield        #33  <Field HashSet mRootElementChanges>
		//   87  181:aload_1         
		//   88  182:invokevirtual   #99  <Method boolean HashSet.add(Object)>
		//   89  185:pop             
				return;
		//   90  186:return          
			} else
			{
				mRootElementChanges.remove(obj);
		//   91  187:aload_0         
		//   92  188:getfield        #33  <Field HashSet mRootElementChanges>
		//   93  191:aload_1         
		//   94  192:invokevirtual   #83  <Method boolean HashSet.remove(Object)>
		//   95  195:pop             
				return;
		//   96  196:return          
			}
		}

		public Update build()
		{
			return new Update(mElementToInfoChangesMap, ((Set) (mRootElementChanges)));
		//    0    0:new             #103 <Class ShadowDocument$Update>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:getfield        #20  <Field ShadowDocument this$0>
		//    4    8:aload_0         
		//    5    9:getfield        #28  <Field Map mElementToInfoChangesMap>
		//    6   12:aload_0         
		//    7   13:getfield        #33  <Field HashSet mRootElementChanges>
		//    8   16:invokespecial   #106 <Method void ShadowDocument$Update(ShadowDocument, Map, Set)>
		//    9   19:areturn         
		}

		public void setElementChildren(Object obj, List list)
		{
			ElementInfo elementinfo = (ElementInfo)mElementToInfoChangesMap.get(obj);
		//    0    0:aload_0         
		//    1    1:getfield        #28  <Field Map mElementToInfoChangesMap>
		//    2    4:aload_1         
		//    3    5:invokeinterface #54  <Method Object Map.get(Object)>
		//    4   10:checkcast       #56  <Class ElementInfo>
		//    5   13:astore          7
			if(elementinfo != null && ListUtil.identityEquals(list, elementinfo.children))
		//*   6   15:aload           7
		//*   7   17:ifnull          33
		//*   8   20:aload_2         
		//*   9   21:aload           7
		//*  10   23:getfield        #71  <Field List ElementInfo.children>
		//*  11   26:invokestatic    #77  <Method boolean ListUtil.identityEquals(List, List)>
		//*  12   29:ifeq            33
				return;
		//   13   32:return          
			ElementInfo elementinfo1 = (ElementInfo)mElementToInfoMap.get(obj);
		//   14   33:aload_0         
		//   15   34:getfield        #20  <Field ShadowDocument this$0>
		//   16   37:invokestatic    #64  <Method IdentityHashMap ShadowDocument.access$000(ShadowDocument)>
		//   17   40:aload_1         
		//   18   41:invokevirtual   #67  <Method Object IdentityHashMap.get(Object)>
		//   19   44:checkcast       #56  <Class ElementInfo>
		//   20   47:astore          8
			if(elementinfo == null && elementinfo1 != null && ListUtil.identityEquals(list, elementinfo1.children))
		//*  21   49:aload           7
		//*  22   51:ifnonnull       72
		//*  23   54:aload           8
		//*  24   56:ifnull          72
		//*  25   59:aload_2         
		//*  26   60:aload           8
		//*  27   62:getfield        #71  <Field List ElementInfo.children>
		//*  28   65:invokestatic    #77  <Method boolean ListUtil.identityEquals(List, List)>
		//*  29   68:ifeq            72
				return;
		//   30   71:return          
			if(elementinfo != null && elementinfo1 != null && elementinfo1.parentElement == elementinfo.parentElement && ListUtil.identityEquals(list, elementinfo1.children))
		//*  31   72:aload           7
		//*  32   74:ifnull          136
		//*  33   77:aload           8
		//*  34   79:ifnull          136
		//*  35   82:aload           8
		//*  36   84:getfield        #60  <Field Object ElementInfo.parentElement>
		//*  37   87:aload           7
		//*  38   89:getfield        #60  <Field Object ElementInfo.parentElement>
		//*  39   92:if_acmpne       136
		//*  40   95:aload_2         
		//*  41   96:aload           8
		//*  42   98:getfield        #71  <Field List ElementInfo.children>
		//*  43  101:invokestatic    #77  <Method boolean ListUtil.identityEquals(List, List)>
		//*  44  104:ifeq            136
			{
				list = ((List) ((ElementInfo)mElementToInfoMap.get(obj)));
		//   45  107:aload_0         
		//   46  108:getfield        #20  <Field ShadowDocument this$0>
		//   47  111:invokestatic    #64  <Method IdentityHashMap ShadowDocument.access$000(ShadowDocument)>
		//   48  114:aload_1         
		//   49  115:invokevirtual   #67  <Method Object IdentityHashMap.get(Object)>
		//   50  118:checkcast       #56  <Class ElementInfo>
		//   51  121:astore_2        
				mElementToInfoChangesMap.remove(obj);
		//   52  122:aload_0         
		//   53  123:getfield        #28  <Field Map mElementToInfoChangesMap>
		//   54  126:aload_1         
		//   55  127:invokeinterface #80  <Method Object Map.remove(Object)>
		//   56  132:pop             
			} else
		//*  57  133:goto            193
			{
				Object obj1;
				if(elementinfo != null)
		//*  58  136:aload           7
		//*  59  138:ifnull          151
					obj1 = elementinfo.parentElement;
		//   60  141:aload           7
		//   61  143:getfield        #60  <Field Object ElementInfo.parentElement>
		//   62  146:astore          6
				else
		//*  63  148:goto            169
				if(elementinfo1 != null)
		//*  64  151:aload           8
		//*  65  153:ifnull          166
					obj1 = elementinfo1.parentElement;
		//   66  156:aload           8
		//   67  158:getfield        #60  <Field Object ElementInfo.parentElement>
		//   68  161:astore          6
				else
		//*  69  163:goto            169
					obj1 = null;
		//   70  166:aconst_null     
		//   71  167:astore          6
				list = ((List) (new ElementInfo(obj, obj1, list)));
		//   72  169:new             #56  <Class ElementInfo>
		//   73  172:dup             
		//   74  173:aload_1         
		//   75  174:aload           6
		//   76  176:aload_2         
		//   77  177:invokespecial   #92  <Method void ElementInfo(Object, Object, List)>
		//   78  180:astore_2        
				mElementToInfoChangesMap.put(obj, ((Object) (list)));
		//   79  181:aload_0         
		//   80  182:getfield        #28  <Field Map mElementToInfoChangesMap>
		//   81  185:aload_1         
		//   82  186:aload_2         
		//   83  187:invokeinterface #96  <Method Object Map.put(Object, Object)>
		//   84  192:pop             
			}
			HashSet hashset = acquireNotNewChildrenHashSet();
		//   85  193:aload_0         
		//   86  194:invokespecial   #110 <Method HashSet acquireNotNewChildrenHashSet()>
		//   87  197:astore          6
			boolean flag = false;
		//   88  199:iconst_0        
		//   89  200:istore          4
			if(elementinfo1 != null && elementinfo1.children != ((ElementInfo) (list)).children)
		//*  90  202:aload           8
		//*  91  204:ifnull          263
		//*  92  207:aload           8
		//*  93  209:getfield        #71  <Field List ElementInfo.children>
		//*  94  212:aload_2         
		//*  95  213:getfield        #71  <Field List ElementInfo.children>
		//*  96  216:if_acmpeq       263
			{
				int l = elementinfo1.children.size();
		//   97  219:aload           8
		//   98  221:getfield        #71  <Field List ElementInfo.children>
		//   99  224:invokeinterface #116 <Method int List.size()>
		//  100  229:istore          5
				for(int i = 0; i < l; i++)
		//* 101  231:iconst_0        
		//* 102  232:istore_3        
		//* 103  233:iload_3         
		//* 104  234:iload           5
		//* 105  236:icmpge          263
					hashset.add(elementinfo1.children.get(i));
		//  106  239:aload           6
		//  107  241:aload           8
		//  108  243:getfield        #71  <Field List ElementInfo.children>
		//  109  246:iload_3         
		//  110  247:invokeinterface #119 <Method Object List.get(int)>
		//  111  252:invokevirtual   #99  <Method boolean HashSet.add(Object)>
		//  112  255:pop             

		//  113  256:iload_3         
		//  114  257:iconst_1        
		//  115  258:iadd            
		//  116  259:istore_3        
			}
		//* 117  260:goto            233
			if(elementinfo != null && elementinfo.children != ((ElementInfo) (list)).children)
		//* 118  263:aload           7
		//* 119  265:ifnull          324
		//* 120  268:aload           7
		//* 121  270:getfield        #71  <Field List ElementInfo.children>
		//* 122  273:aload_2         
		//* 123  274:getfield        #71  <Field List ElementInfo.children>
		//* 124  277:if_acmpeq       324
			{
				int i1 = elementinfo.children.size();
		//  125  280:aload           7
		//  126  282:getfield        #71  <Field List ElementInfo.children>
		//  127  285:invokeinterface #116 <Method int List.size()>
		//  128  290:istore          5
				for(int j = 0; j < i1; j++)
		//* 129  292:iconst_0        
		//* 130  293:istore_3        
		//* 131  294:iload_3         
		//* 132  295:iload           5
		//* 133  297:icmpge          324
					hashset.add(elementinfo.children.get(j));
		//  134  300:aload           6
		//  135  302:aload           7
		//  136  304:getfield        #71  <Field List ElementInfo.children>
		//  137  307:iload_3         
		//  138  308:invokeinterface #119 <Method Object List.get(int)>
		//  139  313:invokevirtual   #99  <Method boolean HashSet.add(Object)>
		//  140  316:pop             

		//  141  317:iload_3         
		//  142  318:iconst_1        
		//  143  319:iadd            
		//  144  320:istore_3        
			}
		//* 145  321:goto            294
			int j1 = ((ElementInfo) (list)).children.size();
		//  146  324:aload_2         
		//  147  325:getfield        #71  <Field List ElementInfo.children>
		//  148  328:invokeinterface #116 <Method int List.size()>
		//  149  333:istore          5
			for(int k = ((int) (flag)); k < j1; k++)
		//* 150  335:iload           4
		//* 151  337:istore_3        
		//* 152  338:iload_3         
		//* 153  339:iload           5
		//* 154  341:icmpge          378
			{
				Object obj2 = ((ElementInfo) (list)).children.get(k);
		//  155  344:aload_2         
		//  156  345:getfield        #71  <Field List ElementInfo.children>
		//  157  348:iload_3         
		//  158  349:invokeinterface #119 <Method Object List.get(int)>
		//  159  354:astore          7
				setElementParent(obj2, obj);
		//  160  356:aload_0         
		//  161  357:aload           7
		//  162  359:aload_1         
		//  163  360:invokespecial   #121 <Method void setElementParent(Object, Object)>
				hashset.remove(obj2);
		//  164  363:aload           6
		//  165  365:aload           7
		//  166  367:invokevirtual   #83  <Method boolean HashSet.remove(Object)>
		//  167  370:pop             
			}

		//  168  371:iload_3         
		//  169  372:iconst_1        
		//  170  373:iadd            
		//  171  374:istore_3        
		//* 172  375:goto            338
			list = ((List) (hashset.iterator()));
		//  173  378:aload           6
		//  174  380:invokevirtual   #125 <Method Iterator HashSet.iterator()>
		//  175  383:astore_2        
			do
			{
				if(!((Iterator) (list)).hasNext())
					break;
		//  176  384:aload_2         
		//  177  385:invokeinterface #131 <Method boolean Iterator.hasNext()>
		//  178  390:ifeq            475
				Object obj3 = ((Iterator) (list)).next();
		//  179  393:aload_2         
		//  180  394:invokeinterface #135 <Method Object Iterator.next()>
		//  181  399:astore          7
				ElementInfo elementinfo2 = (ElementInfo)mElementToInfoChangesMap.get(obj3);
		//  182  401:aload_0         
		//  183  402:getfield        #28  <Field Map mElementToInfoChangesMap>
		//  184  405:aload           7
		//  185  407:invokeinterface #54  <Method Object Map.get(Object)>
		//  186  412:checkcast       #56  <Class ElementInfo>
		//  187  415:astore          8
				if(elementinfo2 == null || elementinfo2.parentElement == obj)
		//* 188  417:aload           8
		//* 189  419:ifnull          434
		//* 190  422:aload           8
		//* 191  424:getfield        #60  <Field Object ElementInfo.parentElement>
		//* 192  427:aload_1         
		//* 193  428:if_acmpeq       434
		//* 194  431:goto            384
				{
					ElementInfo elementinfo3 = (ElementInfo)mElementToInfoMap.get(obj3);
		//  195  434:aload_0         
		//  196  435:getfield        #20  <Field ShadowDocument this$0>
		//  197  438:invokestatic    #64  <Method IdentityHashMap ShadowDocument.access$000(ShadowDocument)>
		//  198  441:aload           7
		//  199  443:invokevirtual   #67  <Method Object IdentityHashMap.get(Object)>
		//  200  446:checkcast       #56  <Class ElementInfo>
		//  201  449:astore          8
					if(elementinfo3 != null && elementinfo3.parentElement == obj)
		//* 202  451:aload           8
		//* 203  453:ifnull          384
		//* 204  456:aload           8
		//* 205  458:getfield        #60  <Field Object ElementInfo.parentElement>
		//* 206  461:aload_1         
		//* 207  462:if_acmpne       384
						setElementParent(obj3, ((Object) (null)));
		//  208  465:aload_0         
		//  209  466:aload           7
		//  210  468:aconst_null     
		//  211  469:invokespecial   #121 <Method void setElementParent(Object, Object)>
				}
			} while(true);
		//  212  472:goto            384
			releaseNotNewChildrenHashSet(hashset);
		//  213  475:aload_0         
		//  214  476:aload           6
		//  215  478:invokespecial   #137 <Method void releaseNotNewChildrenHashSet(HashSet)>
		//  216  481:return          
		}

		private HashSet mCachedNotNewChildrenSet;
		private final Map mElementToInfoChangesMap = new LinkedHashMap();
		private final HashSet mRootElementChanges = new HashSet();
		final ShadowDocument this$0;

		public UpdateBuilder()
		{
			this$0 = ShadowDocument.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #20  <Field ShadowDocument this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #23  <Method void Object()>
		//    5    9:aload_0         
		//    6   10:new             #25  <Class LinkedHashMap>
		//    7   13:dup             
		//    8   14:invokespecial   #26  <Method void LinkedHashMap()>
		//    9   17:putfield        #28  <Field Map mElementToInfoChangesMap>
		//   10   20:aload_0         
		//   11   21:new             #30  <Class HashSet>
		//   12   24:dup             
		//   13   25:invokespecial   #31  <Method void HashSet()>
		//   14   28:putfield        #33  <Field HashSet mRootElementChanges>
		//   15   31:return          
		}
	}


	public ShadowDocument(Object obj)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #26  <Class IdentityHashMap>
	//    4    8:dup             
	//    5    9:invokespecial   #27  <Method void IdentityHashMap()>
	//    6   12:putfield        #29  <Field IdentityHashMap mElementToInfoMap>
		mRootElement = Util.throwIfNull(obj);
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:invokestatic    #35  <Method Object Util.throwIfNull(Object)>
	//   10   20:putfield        #37  <Field Object mRootElement>
	//   11   23:return          
	}

	public UpdateBuilder beginUpdate()
	{
		if(!mIsUpdating)
	//*   0    0:aload_0         
	//*   1    1:getfield        #46  <Field boolean mIsUpdating>
	//*   2    4:ifne            21
		{
			mIsUpdating = true;
	//    3    7:aload_0         
	//    4    8:iconst_1        
	//    5    9:putfield        #46  <Field boolean mIsUpdating>
			return new UpdateBuilder();
	//    6   12:new             #11  <Class ShadowDocument$UpdateBuilder>
	//    7   15:dup             
	//    8   16:aload_0         
	//    9   17:invokespecial   #53  <Method void ShadowDocument$UpdateBuilder(ShadowDocument)>
	//   10   20:areturn         
		} else
		{
			throw new IllegalStateException();
	//   11   21:new             #55  <Class IllegalStateException>
	//   12   24:dup             
	//   13   25:invokespecial   #56  <Method void IllegalStateException()>
	//   14   28:athrow          
		}
	}

	public ElementInfo getElementInfo(Object obj)
	{
		return (ElementInfo)mElementToInfoMap.get(obj);
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field IdentityHashMap mElementToInfoMap>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #61  <Method Object IdentityHashMap.get(Object)>
	//    4    8:checkcast       #63  <Class ElementInfo>
	//    5   11:areturn         
	}

	public Object getRootElement()
	{
		return mRootElement;
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field Object mRootElement>
	//    2    4:areturn         
	}

	private final IdentityHashMap mElementToInfoMap = new IdentityHashMap();
	private boolean mIsUpdating;
	private final Object mRootElement;


/*
	static IdentityHashMap access$000(ShadowDocument shadowdocument)
	{
		return shadowdocument.mElementToInfoMap;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field IdentityHashMap mElementToInfoMap>
	//    2    4:areturn         
	}

*/


/*
	static Object access$100(ShadowDocument shadowdocument)
	{
		return shadowdocument.mRootElement;
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field Object mRootElement>
	//    2    4:areturn         
	}

*/


/*
	static boolean access$200(ShadowDocument shadowdocument)
	{
		return shadowdocument.mIsUpdating;
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field boolean mIsUpdating>
	//    2    4:ireturn         
	}

*/


/*
	static boolean access$202(ShadowDocument shadowdocument, boolean flag)
	{
		shadowdocument.mIsUpdating = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #46  <Field boolean mIsUpdating>
		return flag;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

*/
}
