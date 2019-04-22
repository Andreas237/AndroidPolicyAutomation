// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.core.view;

import com.firebase.client.snapshot.*;

public class Change
{

	private Change(Event.EventType eventtype, IndexedNode indexednode, ChildKey childkey, ChildKey childkey1, IndexedNode indexednode1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		eventType = eventtype;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #19  <Field Event$EventType eventType>
		indexedNode = indexednode;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #21  <Field IndexedNode indexedNode>
		childKey = childkey;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #23  <Field ChildKey childKey>
		prevName = childkey1;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #25  <Field ChildKey prevName>
		oldIndexedNode = indexednode1;
	//   14   25:aload_0         
	//   15   26:aload           5
	//   16   28:putfield        #27  <Field IndexedNode oldIndexedNode>
	//   17   31:return          
	}

	public static Change childAddedChange(ChildKey childkey, IndexedNode indexednode)
	{
		return new Change(Event.EventType.CHILD_ADDED, indexednode, childkey, ((ChildKey) (null)), ((IndexedNode) (null)));
	//    0    0:new             #2   <Class Change>
	//    1    3:dup             
	//    2    4:getstatic       #35  <Field Event$EventType Event$EventType.CHILD_ADDED>
	//    3    7:aload_1         
	//    4    8:aload_0         
	//    5    9:aconst_null     
	//    6   10:aconst_null     
	//    7   11:invokespecial   #37  <Method void Change(Event$EventType, IndexedNode, ChildKey, ChildKey, IndexedNode)>
	//    8   14:areturn         
	}

	public static Change childAddedChange(ChildKey childkey, Node node)
	{
		return childAddedChange(childkey, IndexedNode.from(node));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #44  <Method IndexedNode IndexedNode.from(Node)>
	//    3    5:invokestatic    #46  <Method Change childAddedChange(ChildKey, IndexedNode)>
	//    4    8:areturn         
	}

	public static Change childChangedChange(ChildKey childkey, IndexedNode indexednode, IndexedNode indexednode1)
	{
		return new Change(Event.EventType.CHILD_CHANGED, indexednode, childkey, ((ChildKey) (null)), indexednode1);
	//    0    0:new             #2   <Class Change>
	//    1    3:dup             
	//    2    4:getstatic       #51  <Field Event$EventType Event$EventType.CHILD_CHANGED>
	//    3    7:aload_1         
	//    4    8:aload_0         
	//    5    9:aconst_null     
	//    6   10:aload_2         
	//    7   11:invokespecial   #37  <Method void Change(Event$EventType, IndexedNode, ChildKey, ChildKey, IndexedNode)>
	//    8   14:areturn         
	}

	public static Change childChangedChange(ChildKey childkey, Node node, Node node1)
	{
		return childChangedChange(childkey, IndexedNode.from(node), IndexedNode.from(node1));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #44  <Method IndexedNode IndexedNode.from(Node)>
	//    3    5:aload_2         
	//    4    6:invokestatic    #44  <Method IndexedNode IndexedNode.from(Node)>
	//    5    9:invokestatic    #54  <Method Change childChangedChange(ChildKey, IndexedNode, IndexedNode)>
	//    6   12:areturn         
	}

	public static Change childMovedChange(ChildKey childkey, IndexedNode indexednode)
	{
		return new Change(Event.EventType.CHILD_MOVED, indexednode, childkey, ((ChildKey) (null)), ((IndexedNode) (null)));
	//    0    0:new             #2   <Class Change>
	//    1    3:dup             
	//    2    4:getstatic       #58  <Field Event$EventType Event$EventType.CHILD_MOVED>
	//    3    7:aload_1         
	//    4    8:aload_0         
	//    5    9:aconst_null     
	//    6   10:aconst_null     
	//    7   11:invokespecial   #37  <Method void Change(Event$EventType, IndexedNode, ChildKey, ChildKey, IndexedNode)>
	//    8   14:areturn         
	}

	public static Change childMovedChange(ChildKey childkey, Node node)
	{
		return childMovedChange(childkey, IndexedNode.from(node));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #44  <Method IndexedNode IndexedNode.from(Node)>
	//    3    5:invokestatic    #60  <Method Change childMovedChange(ChildKey, IndexedNode)>
	//    4    8:areturn         
	}

	public static Change childRemovedChange(ChildKey childkey, IndexedNode indexednode)
	{
		return new Change(Event.EventType.CHILD_REMOVED, indexednode, childkey, ((ChildKey) (null)), ((IndexedNode) (null)));
	//    0    0:new             #2   <Class Change>
	//    1    3:dup             
	//    2    4:getstatic       #64  <Field Event$EventType Event$EventType.CHILD_REMOVED>
	//    3    7:aload_1         
	//    4    8:aload_0         
	//    5    9:aconst_null     
	//    6   10:aconst_null     
	//    7   11:invokespecial   #37  <Method void Change(Event$EventType, IndexedNode, ChildKey, ChildKey, IndexedNode)>
	//    8   14:areturn         
	}

	public static Change childRemovedChange(ChildKey childkey, Node node)
	{
		return childRemovedChange(childkey, IndexedNode.from(node));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #44  <Method IndexedNode IndexedNode.from(Node)>
	//    3    5:invokestatic    #66  <Method Change childRemovedChange(ChildKey, IndexedNode)>
	//    4    8:areturn         
	}

	public static Change valueChange(IndexedNode indexednode)
	{
		return new Change(Event.EventType.VALUE, indexednode, ((ChildKey) (null)), ((ChildKey) (null)), ((IndexedNode) (null)));
	//    0    0:new             #2   <Class Change>
	//    1    3:dup             
	//    2    4:getstatic       #71  <Field Event$EventType Event$EventType.VALUE>
	//    3    7:aload_0         
	//    4    8:aconst_null     
	//    5    9:aconst_null     
	//    6   10:aconst_null     
	//    7   11:invokespecial   #37  <Method void Change(Event$EventType, IndexedNode, ChildKey, ChildKey, IndexedNode)>
	//    8   14:areturn         
	}

	public Change changeWithPrevName(ChildKey childkey)
	{
		return new Change(eventType, indexedNode, childKey, childkey, oldIndexedNode);
	//    0    0:new             #2   <Class Change>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #19  <Field Event$EventType eventType>
	//    4    8:aload_0         
	//    5    9:getfield        #21  <Field IndexedNode indexedNode>
	//    6   12:aload_0         
	//    7   13:getfield        #23  <Field ChildKey childKey>
	//    8   16:aload_1         
	//    9   17:aload_0         
	//   10   18:getfield        #27  <Field IndexedNode oldIndexedNode>
	//   11   21:invokespecial   #37  <Method void Change(Event$EventType, IndexedNode, ChildKey, ChildKey, IndexedNode)>
	//   12   24:areturn         
	}

	public ChildKey getChildKey()
	{
		return childKey;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field ChildKey childKey>
	//    2    4:areturn         
	}

	public Event.EventType getEventType()
	{
		return eventType;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field Event$EventType eventType>
	//    2    4:areturn         
	}

	public IndexedNode getIndexedNode()
	{
		return indexedNode;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field IndexedNode indexedNode>
	//    2    4:areturn         
	}

	public IndexedNode getOldIndexedNode()
	{
		return oldIndexedNode;
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field IndexedNode oldIndexedNode>
	//    2    4:areturn         
	}

	public ChildKey getPrevName()
	{
		return prevName;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field ChildKey prevName>
	//    2    4:areturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #85  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #86  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("Change: ");
	//    4    8:aload_1         
	//    5    9:ldc1            #88  <String "Change: ">
	//    6   11:invokevirtual   #92  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(((Object) (eventType)));
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:getfield        #19  <Field Event$EventType eventType>
	//   11   20:invokevirtual   #95  <Method StringBuilder StringBuilder.append(Object)>
	//   12   23:pop             
		stringbuilder.append(" ");
	//   13   24:aload_1         
	//   14   25:ldc1            #97  <String " ">
	//   15   27:invokevirtual   #92  <Method StringBuilder StringBuilder.append(String)>
	//   16   30:pop             
		stringbuilder.append(((Object) (childKey)));
	//   17   31:aload_1         
	//   18   32:aload_0         
	//   19   33:getfield        #23  <Field ChildKey childKey>
	//   20   36:invokevirtual   #95  <Method StringBuilder StringBuilder.append(Object)>
	//   21   39:pop             
		return stringbuilder.toString();
	//   22   40:aload_1         
	//   23   41:invokevirtual   #99  <Method String StringBuilder.toString()>
	//   24   44:areturn         
	}

	private final ChildKey childKey;
	private final Event.EventType eventType;
	private final IndexedNode indexedNode;
	private final IndexedNode oldIndexedNode;
	private final ChildKey prevName;
}
