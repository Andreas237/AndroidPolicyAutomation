// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.core.view;

import com.firebase.client.core.EventRegistration;
import com.firebase.client.snapshot.*;
import java.util.*;

// Referenced classes of package com.firebase.client.core.view:
//			QuerySpec, Change, DataEvent

public class EventGenerator
{

	public EventGenerator(QuerySpec queryspec)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		query = queryspec;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #17  <Field QuerySpec query>
		index = queryspec.getIndex();
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:invokevirtual   #23  <Method Index QuerySpec.getIndex()>
	//    8   14:putfield        #25  <Field Index index>
	//    9   17:return          
	}

	private Comparator changeComparator()
	{
		return new Comparator() {

			public int compare(Change change, Change change1)
			{
				change = ((Change) (new NamedNode(change.getChildKey(), change.getIndexedNode().getNode())));
			//    0    0:new             #30  <Class NamedNode>
			//    1    3:dup             
			//    2    4:aload_1         
			//    3    5:invokevirtual   #36  <Method com.firebase.client.snapshot.ChildKey Change.getChildKey()>
			//    4    8:aload_1         
			//    5    9:invokevirtual   #40  <Method IndexedNode Change.getIndexedNode()>
			//    6   12:invokevirtual   #46  <Method com.firebase.client.snapshot.Node IndexedNode.getNode()>
			//    7   15:invokespecial   #49  <Method void NamedNode(com.firebase.client.snapshot.ChildKey, com.firebase.client.snapshot.Node)>
			//    8   18:astore_1        
				change1 = ((Change) (new NamedNode(change1.getChildKey(), change1.getIndexedNode().getNode())));
			//    9   19:new             #30  <Class NamedNode>
			//   10   22:dup             
			//   11   23:aload_2         
			//   12   24:invokevirtual   #36  <Method com.firebase.client.snapshot.ChildKey Change.getChildKey()>
			//   13   27:aload_2         
			//   14   28:invokevirtual   #40  <Method IndexedNode Change.getIndexedNode()>
			//   15   31:invokevirtual   #46  <Method com.firebase.client.snapshot.Node IndexedNode.getNode()>
			//   16   34:invokespecial   #49  <Method void NamedNode(com.firebase.client.snapshot.ChildKey, com.firebase.client.snapshot.Node)>
			//   17   37:astore_2        
				return index.compare(((Object) (change)), ((Object) (change1)));
			//   18   38:aload_0         
			//   19   39:getfield        #24  <Field EventGenerator this$0>
			//   20   42:invokestatic    #53  <Method Index EventGenerator.access$000(EventGenerator)>
			//   21   45:aload_1         
			//   22   46:aload_2         
			//   23   47:invokevirtual   #58  <Method int Index.compare(Object, Object)>
			//   24   50:ireturn         
			}

			public volatile int compare(Object obj, Object obj1)
			{
				return compare((Change)obj, (Change)obj1);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:checkcast       #32  <Class Change>
			//    3    5:aload_2         
			//    4    6:checkcast       #32  <Class Change>
			//    5    9:invokevirtual   #60  <Method int compare(Change, Change)>
			//    6   12:ireturn         
			}

			static final boolean $assertionsDisabled = false;
			final EventGenerator this$0;

			static 
			{
			//    0    0:return          
			}

			
			{
				this$0 = EventGenerator.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #24  <Field EventGenerator this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #26  <Method void Object()>
			//    5    9:return          
			}
		}
;
	//    0    0:new             #6   <Class EventGenerator$1>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #33  <Method void EventGenerator$1(EventGenerator)>
	//    4    8:areturn         
	}

	private DataEvent generateEvent(Change change, EventRegistration eventregistration, IndexedNode indexednode)
	{
		Change change1 = change;
	//    0    0:aload_1         
	//    1    1:astore          4
		if(!change.getEventType().equals(((Object) (Event.EventType.VALUE))))
	//*   2    3:aload_1         
	//*   3    4:invokevirtual   #43  <Method Event$EventType Change.getEventType()>
	//*   4    7:getstatic       #49  <Field Event$EventType Event$EventType.VALUE>
	//*   5   10:invokevirtual   #53  <Method boolean Event$EventType.equals(Object)>
	//*   6   13:ifne            60
			if(change.getEventType().equals(((Object) (Event.EventType.CHILD_REMOVED))))
	//*   7   16:aload_1         
	//*   8   17:invokevirtual   #43  <Method Event$EventType Change.getEventType()>
	//*   9   20:getstatic       #56  <Field Event$EventType Event$EventType.CHILD_REMOVED>
	//*  10   23:invokevirtual   #53  <Method boolean Event$EventType.equals(Object)>
	//*  11   26:ifeq            35
				change1 = change;
	//   12   29:aload_1         
	//   13   30:astore          4
			else
	//*  14   32:goto            60
				change1 = change.changeWithPrevName(indexednode.getPredecessorChildName(change.getChildKey(), change.getIndexedNode().getNode(), index));
	//   15   35:aload_1         
	//   16   36:aload_3         
	//   17   37:aload_1         
	//   18   38:invokevirtual   #60  <Method com.firebase.client.snapshot.ChildKey Change.getChildKey()>
	//   19   41:aload_1         
	//   20   42:invokevirtual   #64  <Method IndexedNode Change.getIndexedNode()>
	//   21   45:invokevirtual   #70  <Method com.firebase.client.snapshot.Node IndexedNode.getNode()>
	//   22   48:aload_0         
	//   23   49:getfield        #25  <Field Index index>
	//   24   52:invokevirtual   #74  <Method com.firebase.client.snapshot.ChildKey IndexedNode.getPredecessorChildName(com.firebase.client.snapshot.ChildKey, com.firebase.client.snapshot.Node, Index)>
	//   25   55:invokevirtual   #78  <Method Change Change.changeWithPrevName(com.firebase.client.snapshot.ChildKey)>
	//   26   58:astore          4
		return eventregistration.createEvent(change1, query);
	//   27   60:aload_2         
	//   28   61:aload           4
	//   29   63:aload_0         
	//   30   64:getfield        #17  <Field QuerySpec query>
	//   31   67:invokevirtual   #84  <Method DataEvent EventRegistration.createEvent(Change, QuerySpec)>
	//   32   70:areturn         
	}

	private void generateEventsForType(List list, Event.EventType eventtype, List list1, List list2, IndexedNode indexednode)
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #88  <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #89  <Method void ArrayList()>
	//    3    7:astore          6
		list1 = ((List) (list1.iterator()));
	//    4    9:aload_3         
	//    5   10:invokeinterface #95  <Method Iterator List.iterator()>
	//    6   15:astore_3        
		do
		{
			if(!((Iterator) (list1)).hasNext())
				break;
	//    7   16:aload_3         
	//    8   17:invokeinterface #101 <Method boolean Iterator.hasNext()>
	//    9   22:ifeq            61
			Change change1 = (Change)((Iterator) (list1)).next();
	//   10   25:aload_3         
	//   11   26:invokeinterface #105 <Method Object Iterator.next()>
	//   12   31:checkcast       #39  <Class Change>
	//   13   34:astore          7
			if(change1.getEventType().equals(((Object) (eventtype))))
	//*  14   36:aload           7
	//*  15   38:invokevirtual   #43  <Method Event$EventType Change.getEventType()>
	//*  16   41:aload_2         
	//*  17   42:invokevirtual   #53  <Method boolean Event$EventType.equals(Object)>
	//*  18   45:ifeq            16
				((List) (arraylist)).add(((Object) (change1)));
	//   19   48:aload           6
	//   20   50:aload           7
	//   21   52:invokeinterface #108 <Method boolean List.add(Object)>
	//   22   57:pop             
		} while(true);
	//   23   58:goto            16
		Collections.sort(((List) (arraylist)), changeComparator());
	//   24   61:aload           6
	//   25   63:aload_0         
	//   26   64:invokespecial   #110 <Method Comparator changeComparator()>
	//   27   67:invokestatic    #116 <Method void Collections.sort(List, Comparator)>
		for(list1 = ((List) (((List) (arraylist)).iterator())); ((Iterator) (list1)).hasNext();)
	//*  28   70:aload           6
	//*  29   72:invokeinterface #95  <Method Iterator List.iterator()>
	//*  30   77:astore_3        
	//*  31   78:aload_3         
	//*  32   79:invokeinterface #101 <Method boolean Iterator.hasNext()>
	//*  33   84:ifeq            158
		{
			Change change = (Change)((Iterator) (list1)).next();
	//   34   87:aload_3         
	//   35   88:invokeinterface #105 <Method Object Iterator.next()>
	//   36   93:checkcast       #39  <Class Change>
	//   37   96:astore          6
			Iterator iterator = list2.iterator();
	//   38   98:aload           4
	//   39  100:invokeinterface #95  <Method Iterator List.iterator()>
	//   40  105:astore          7
			while(iterator.hasNext()) 
	//*  41  107:aload           7
	//*  42  109:invokeinterface #101 <Method boolean Iterator.hasNext()>
	//*  43  114:ifeq            78
			{
				EventRegistration eventregistration = (EventRegistration)iterator.next();
	//   44  117:aload           7
	//   45  119:invokeinterface #105 <Method Object Iterator.next()>
	//   46  124:checkcast       #80  <Class EventRegistration>
	//   47  127:astore          8
				if(eventregistration.respondsTo(eventtype))
	//*  48  129:aload           8
	//*  49  131:aload_2         
	//*  50  132:invokevirtual   #120 <Method boolean EventRegistration.respondsTo(Event$EventType)>
	//*  51  135:ifeq            107
					list.add(((Object) (generateEvent(change, eventregistration, indexednode))));
	//   52  138:aload_1         
	//   53  139:aload_0         
	//   54  140:aload           6
	//   55  142:aload           8
	//   56  144:aload           5
	//   57  146:invokespecial   #122 <Method DataEvent generateEvent(Change, EventRegistration, IndexedNode)>
	//   58  149:invokeinterface #108 <Method boolean List.add(Object)>
	//   59  154:pop             
			}
		}

	//*  60  155:goto            107
	//   61  158:return          
	}

	public List generateEventsForChanges(List list, IndexedNode indexednode, List list1)
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #88  <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #89  <Method void ArrayList()>
	//    3    7:astore          4
		ArrayList arraylist1 = new ArrayList();
	//    4    9:new             #88  <Class ArrayList>
	//    5   12:dup             
	//    6   13:invokespecial   #89  <Method void ArrayList()>
	//    7   16:astore          5
		Iterator iterator = list.iterator();
	//    8   18:aload_1         
	//    9   19:invokeinterface #95  <Method Iterator List.iterator()>
	//   10   24:astore          6
		do
		{
			if(!iterator.hasNext())
				break;
	//   11   26:aload           6
	//   12   28:invokeinterface #101 <Method boolean Iterator.hasNext()>
	//   13   33:ifeq            112
			Change change = (Change)iterator.next();
	//   14   36:aload           6
	//   15   38:invokeinterface #105 <Method Object Iterator.next()>
	//   16   43:checkcast       #39  <Class Change>
	//   17   46:astore          7
			if(change.getEventType().equals(((Object) (Event.EventType.CHILD_CHANGED))) && index.indexedValueChanged(change.getOldIndexedNode().getNode(), change.getIndexedNode().getNode()))
	//*  18   48:aload           7
	//*  19   50:invokevirtual   #43  <Method Event$EventType Change.getEventType()>
	//*  20   53:getstatic       #128 <Field Event$EventType Event$EventType.CHILD_CHANGED>
	//*  21   56:invokevirtual   #53  <Method boolean Event$EventType.equals(Object)>
	//*  22   59:ifeq            26
	//*  23   62:aload_0         
	//*  24   63:getfield        #25  <Field Index index>
	//*  25   66:aload           7
	//*  26   68:invokevirtual   #131 <Method IndexedNode Change.getOldIndexedNode()>
	//*  27   71:invokevirtual   #70  <Method com.firebase.client.snapshot.Node IndexedNode.getNode()>
	//*  28   74:aload           7
	//*  29   76:invokevirtual   #64  <Method IndexedNode Change.getIndexedNode()>
	//*  30   79:invokevirtual   #70  <Method com.firebase.client.snapshot.Node IndexedNode.getNode()>
	//*  31   82:invokevirtual   #137 <Method boolean Index.indexedValueChanged(com.firebase.client.snapshot.Node, com.firebase.client.snapshot.Node)>
	//*  32   85:ifeq            26
				((List) (arraylist1)).add(((Object) (Change.childMovedChange(change.getChildKey(), change.getIndexedNode()))));
	//   33   88:aload           5
	//   34   90:aload           7
	//   35   92:invokevirtual   #60  <Method com.firebase.client.snapshot.ChildKey Change.getChildKey()>
	//   36   95:aload           7
	//   37   97:invokevirtual   #64  <Method IndexedNode Change.getIndexedNode()>
	//   38  100:invokestatic    #141 <Method Change Change.childMovedChange(com.firebase.client.snapshot.ChildKey, IndexedNode)>
	//   39  103:invokeinterface #108 <Method boolean List.add(Object)>
	//   40  108:pop             
		} while(true);
	//   41  109:goto            26
		generateEventsForType(((List) (arraylist)), Event.EventType.CHILD_REMOVED, list, list1, indexednode);
	//   42  112:aload_0         
	//   43  113:aload           4
	//   44  115:getstatic       #56  <Field Event$EventType Event$EventType.CHILD_REMOVED>
	//   45  118:aload_1         
	//   46  119:aload_3         
	//   47  120:aload_2         
	//   48  121:invokespecial   #143 <Method void generateEventsForType(List, Event$EventType, List, List, IndexedNode)>
		generateEventsForType(((List) (arraylist)), Event.EventType.CHILD_ADDED, list, list1, indexednode);
	//   49  124:aload_0         
	//   50  125:aload           4
	//   51  127:getstatic       #146 <Field Event$EventType Event$EventType.CHILD_ADDED>
	//   52  130:aload_1         
	//   53  131:aload_3         
	//   54  132:aload_2         
	//   55  133:invokespecial   #143 <Method void generateEventsForType(List, Event$EventType, List, List, IndexedNode)>
		generateEventsForType(((List) (arraylist)), Event.EventType.CHILD_MOVED, ((List) (arraylist1)), list1, indexednode);
	//   56  136:aload_0         
	//   57  137:aload           4
	//   58  139:getstatic       #149 <Field Event$EventType Event$EventType.CHILD_MOVED>
	//   59  142:aload           5
	//   60  144:aload_3         
	//   61  145:aload_2         
	//   62  146:invokespecial   #143 <Method void generateEventsForType(List, Event$EventType, List, List, IndexedNode)>
		generateEventsForType(((List) (arraylist)), Event.EventType.CHILD_CHANGED, list, list1, indexednode);
	//   63  149:aload_0         
	//   64  150:aload           4
	//   65  152:getstatic       #128 <Field Event$EventType Event$EventType.CHILD_CHANGED>
	//   66  155:aload_1         
	//   67  156:aload_3         
	//   68  157:aload_2         
	//   69  158:invokespecial   #143 <Method void generateEventsForType(List, Event$EventType, List, List, IndexedNode)>
		generateEventsForType(((List) (arraylist)), Event.EventType.VALUE, list, list1, indexednode);
	//   70  161:aload_0         
	//   71  162:aload           4
	//   72  164:getstatic       #49  <Field Event$EventType Event$EventType.VALUE>
	//   73  167:aload_1         
	//   74  168:aload_3         
	//   75  169:aload_2         
	//   76  170:invokespecial   #143 <Method void generateEventsForType(List, Event$EventType, List, List, IndexedNode)>
		return ((List) (arraylist));
	//   77  173:aload           4
	//   78  175:areturn         
	}

	private final Index index;
	private final QuerySpec query;


/*
	static Index access$000(EventGenerator eventgenerator)
	{
		return eventgenerator.index;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field Index index>
	//    2    4:areturn         
	}

*/
}
