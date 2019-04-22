// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.core.view.filter;

import com.firebase.client.core.view.Change;
import java.util.*;

public class ChildChangeAccumulator
{

	public ChildChangeAccumulator()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #18  <Class HashMap>
	//    4    8:dup             
	//    5    9:invokespecial   #19  <Method void HashMap()>
	//    6   12:putfield        #21  <Field Map changeMap>
	//    7   15:return          
	}

	public List getChanges()
	{
		return ((List) (new ArrayList(changeMap.values())));
	//    0    0:new             #25  <Class ArrayList>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #21  <Field Map changeMap>
	//    4    8:invokeinterface #31  <Method java.util.Collection Map.values()>
	//    5   13:invokespecial   #34  <Method void ArrayList(java.util.Collection)>
	//    6   16:areturn         
	}

	public void trackChildChange(Change change)
	{
		com.firebase.client.core.view.Event.EventType eventtype = change.getEventType();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #44  <Method com.firebase.client.core.view.Event$EventType Change.getEventType()>
	//    2    4:astore_3        
		com.firebase.client.snapshot.ChildKey childkey = change.getChildKey();
	//    3    5:aload_1         
	//    4    6:invokevirtual   #48  <Method com.firebase.client.snapshot.ChildKey Change.getChildKey()>
	//    5    9:astore          4
		if(changeMap.containsKey(((Object) (childkey))))
	//*   6   11:aload_0         
	//*   7   12:getfield        #21  <Field Map changeMap>
	//*   8   15:aload           4
	//*   9   17:invokeinterface #52  <Method boolean Map.containsKey(Object)>
	//*  10   22:ifeq            278
		{
			Change change1 = (Change)changeMap.get(((Object) (childkey)));
	//   11   25:aload_0         
	//   12   26:getfield        #21  <Field Map changeMap>
	//   13   29:aload           4
	//   14   31:invokeinterface #56  <Method Object Map.get(Object)>
	//   15   36:checkcast       #40  <Class Change>
	//   16   39:astore_2        
			com.firebase.client.core.view.Event.EventType eventtype1 = change1.getEventType();
	//   17   40:aload_2         
	//   18   41:invokevirtual   #44  <Method com.firebase.client.core.view.Event$EventType Change.getEventType()>
	//   19   44:astore          5
			if(eventtype == com.firebase.client.core.view.Event.EventType.CHILD_ADDED && eventtype1 == com.firebase.client.core.view.Event.EventType.CHILD_REMOVED)
	//*  20   46:aload_3         
	//*  21   47:getstatic       #62  <Field com.firebase.client.core.view.Event$EventType com.firebase.client.core.view.Event$EventType.CHILD_ADDED>
	//*  22   50:if_acmpne       89
	//*  23   53:aload           5
	//*  24   55:getstatic       #65  <Field com.firebase.client.core.view.Event$EventType com.firebase.client.core.view.Event$EventType.CHILD_REMOVED>
	//*  25   58:if_acmpne       89
			{
				changeMap.put(((Object) (change.getChildKey())), ((Object) (Change.childChangedChange(childkey, change.getIndexedNode(), change1.getIndexedNode()))));
	//   26   61:aload_0         
	//   27   62:getfield        #21  <Field Map changeMap>
	//   28   65:aload_1         
	//   29   66:invokevirtual   #48  <Method com.firebase.client.snapshot.ChildKey Change.getChildKey()>
	//   30   69:aload           4
	//   31   71:aload_1         
	//   32   72:invokevirtual   #69  <Method com.firebase.client.snapshot.IndexedNode Change.getIndexedNode()>
	//   33   75:aload_2         
	//   34   76:invokevirtual   #69  <Method com.firebase.client.snapshot.IndexedNode Change.getIndexedNode()>
	//   35   79:invokestatic    #73  <Method Change Change.childChangedChange(com.firebase.client.snapshot.ChildKey, com.firebase.client.snapshot.IndexedNode, com.firebase.client.snapshot.IndexedNode)>
	//   36   82:invokeinterface #77  <Method Object Map.put(Object, Object)>
	//   37   87:pop             
				return;
	//   38   88:return          
			}
			if(eventtype == com.firebase.client.core.view.Event.EventType.CHILD_REMOVED && eventtype1 == com.firebase.client.core.view.Event.EventType.CHILD_ADDED)
	//*  39   89:aload_3         
	//*  40   90:getstatic       #65  <Field com.firebase.client.core.view.Event$EventType com.firebase.client.core.view.Event$EventType.CHILD_REMOVED>
	//*  41   93:if_acmpne       117
	//*  42   96:aload           5
	//*  43   98:getstatic       #62  <Field com.firebase.client.core.view.Event$EventType com.firebase.client.core.view.Event$EventType.CHILD_ADDED>
	//*  44  101:if_acmpne       117
			{
				changeMap.remove(((Object) (childkey)));
	//   45  104:aload_0         
	//   46  105:getfield        #21  <Field Map changeMap>
	//   47  108:aload           4
	//   48  110:invokeinterface #80  <Method Object Map.remove(Object)>
	//   49  115:pop             
				return;
	//   50  116:return          
			}
			if(eventtype == com.firebase.client.core.view.Event.EventType.CHILD_REMOVED && eventtype1 == com.firebase.client.core.view.Event.EventType.CHILD_CHANGED)
	//*  51  117:aload_3         
	//*  52  118:getstatic       #65  <Field com.firebase.client.core.view.Event$EventType com.firebase.client.core.view.Event$EventType.CHILD_REMOVED>
	//*  53  121:if_acmpne       154
	//*  54  124:aload           5
	//*  55  126:getstatic       #83  <Field com.firebase.client.core.view.Event$EventType com.firebase.client.core.view.Event$EventType.CHILD_CHANGED>
	//*  56  129:if_acmpne       154
			{
				changeMap.put(((Object) (childkey)), ((Object) (Change.childRemovedChange(childkey, change1.getOldIndexedNode()))));
	//   57  132:aload_0         
	//   58  133:getfield        #21  <Field Map changeMap>
	//   59  136:aload           4
	//   60  138:aload           4
	//   61  140:aload_2         
	//   62  141:invokevirtual   #86  <Method com.firebase.client.snapshot.IndexedNode Change.getOldIndexedNode()>
	//   63  144:invokestatic    #90  <Method Change Change.childRemovedChange(com.firebase.client.snapshot.ChildKey, com.firebase.client.snapshot.IndexedNode)>
	//   64  147:invokeinterface #77  <Method Object Map.put(Object, Object)>
	//   65  152:pop             
				return;
	//   66  153:return          
			}
			if(eventtype == com.firebase.client.core.view.Event.EventType.CHILD_CHANGED && eventtype1 == com.firebase.client.core.view.Event.EventType.CHILD_ADDED)
	//*  67  154:aload_3         
	//*  68  155:getstatic       #83  <Field com.firebase.client.core.view.Event$EventType com.firebase.client.core.view.Event$EventType.CHILD_CHANGED>
	//*  69  158:if_acmpne       191
	//*  70  161:aload           5
	//*  71  163:getstatic       #62  <Field com.firebase.client.core.view.Event$EventType com.firebase.client.core.view.Event$EventType.CHILD_ADDED>
	//*  72  166:if_acmpne       191
			{
				changeMap.put(((Object) (childkey)), ((Object) (Change.childAddedChange(childkey, change.getIndexedNode()))));
	//   73  169:aload_0         
	//   74  170:getfield        #21  <Field Map changeMap>
	//   75  173:aload           4
	//   76  175:aload           4
	//   77  177:aload_1         
	//   78  178:invokevirtual   #69  <Method com.firebase.client.snapshot.IndexedNode Change.getIndexedNode()>
	//   79  181:invokestatic    #93  <Method Change Change.childAddedChange(com.firebase.client.snapshot.ChildKey, com.firebase.client.snapshot.IndexedNode)>
	//   80  184:invokeinterface #77  <Method Object Map.put(Object, Object)>
	//   81  189:pop             
				return;
	//   82  190:return          
			}
			if(eventtype == com.firebase.client.core.view.Event.EventType.CHILD_CHANGED && eventtype1 == com.firebase.client.core.view.Event.EventType.CHILD_CHANGED)
	//*  83  191:aload_3         
	//*  84  192:getstatic       #83  <Field com.firebase.client.core.view.Event$EventType com.firebase.client.core.view.Event$EventType.CHILD_CHANGED>
	//*  85  195:if_acmpne       232
	//*  86  198:aload           5
	//*  87  200:getstatic       #83  <Field com.firebase.client.core.view.Event$EventType com.firebase.client.core.view.Event$EventType.CHILD_CHANGED>
	//*  88  203:if_acmpne       232
			{
				changeMap.put(((Object) (childkey)), ((Object) (Change.childChangedChange(childkey, change.getIndexedNode(), change1.getOldIndexedNode()))));
	//   89  206:aload_0         
	//   90  207:getfield        #21  <Field Map changeMap>
	//   91  210:aload           4
	//   92  212:aload           4
	//   93  214:aload_1         
	//   94  215:invokevirtual   #69  <Method com.firebase.client.snapshot.IndexedNode Change.getIndexedNode()>
	//   95  218:aload_2         
	//   96  219:invokevirtual   #86  <Method com.firebase.client.snapshot.IndexedNode Change.getOldIndexedNode()>
	//   97  222:invokestatic    #73  <Method Change Change.childChangedChange(com.firebase.client.snapshot.ChildKey, com.firebase.client.snapshot.IndexedNode, com.firebase.client.snapshot.IndexedNode)>
	//   98  225:invokeinterface #77  <Method Object Map.put(Object, Object)>
	//   99  230:pop             
				return;
	//  100  231:return          
			} else
			{
				StringBuilder stringbuilder = new StringBuilder();
	//  101  232:new             #95  <Class StringBuilder>
	//  102  235:dup             
	//  103  236:invokespecial   #96  <Method void StringBuilder()>
	//  104  239:astore_3        
				stringbuilder.append("Illegal combination of changes: ");
	//  105  240:aload_3         
	//  106  241:ldc1            #98  <String "Illegal combination of changes: ">
	//  107  243:invokevirtual   #102 <Method StringBuilder StringBuilder.append(String)>
	//  108  246:pop             
				stringbuilder.append(((Object) (change)));
	//  109  247:aload_3         
	//  110  248:aload_1         
	//  111  249:invokevirtual   #105 <Method StringBuilder StringBuilder.append(Object)>
	//  112  252:pop             
				stringbuilder.append(" occurred after ");
	//  113  253:aload_3         
	//  114  254:ldc1            #107 <String " occurred after ">
	//  115  256:invokevirtual   #102 <Method StringBuilder StringBuilder.append(String)>
	//  116  259:pop             
				stringbuilder.append(((Object) (change1)));
	//  117  260:aload_3         
	//  118  261:aload_2         
	//  119  262:invokevirtual   #105 <Method StringBuilder StringBuilder.append(Object)>
	//  120  265:pop             
				throw new IllegalStateException(stringbuilder.toString());
	//  121  266:new             #109 <Class IllegalStateException>
	//  122  269:dup             
	//  123  270:aload_3         
	//  124  271:invokevirtual   #113 <Method String StringBuilder.toString()>
	//  125  274:invokespecial   #116 <Method void IllegalStateException(String)>
	//  126  277:athrow          
			}
		} else
		{
			changeMap.put(((Object) (change.getChildKey())), ((Object) (change)));
	//  127  278:aload_0         
	//  128  279:getfield        #21  <Field Map changeMap>
	//  129  282:aload_1         
	//  130  283:invokevirtual   #48  <Method com.firebase.client.snapshot.ChildKey Change.getChildKey()>
	//  131  286:aload_1         
	//  132  287:invokeinterface #77  <Method Object Map.put(Object, Object)>
	//  133  292:pop             
			return;
	//  134  293:return          
		}
	}

	static final boolean $assertionsDisabled = false;
	private final Map changeMap = new HashMap();

	static 
	{
	//    0    0:return          
	}
}
