// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.inspector.protocol.module;

import com.facebook.stetho.common.Accumulator;
import com.facebook.stetho.common.LogUtil;
import com.facebook.stetho.inspector.elements.Document;
import com.facebook.stetho.inspector.elements.DocumentView;
import com.facebook.stetho.inspector.helper.ChromePeerManager;

// Referenced classes of package com.facebook.stetho.inspector.protocol.module:
//			DOM

private final class DOM$DocumentUpdateListener
	implements com.facebook.stetho.inspector.elements.Document.UpdateListener
{

	public void onAttributeModified(Object obj, String s, String s1)
	{
		DOM$AttributeModifiedEvent dom$attributemodifiedevent = new DOM$AttributeModifiedEvent(((DOM._cls1) (null)));
	//    0    0:new             #26  <Class DOM$AttributeModifiedEvent>
	//    1    3:dup             
	//    2    4:aconst_null     
	//    3    5:invokespecial   #29  <Method void DOM$AttributeModifiedEvent(DOM$1)>
	//    4    8:astore          4
		dom$attributemodifiedevent.nodeId = DOM.access$300(DOM.this).getNodeIdForElement(obj).intValue();
	//    5   10:aload           4
	//    6   12:aload_0         
	//    7   13:getfield        #15  <Field DOM this$0>
	//    8   16:invokestatic    #33  <Method Document DOM.access$300(DOM)>
	//    9   19:aload_1         
	//   10   20:invokevirtual   #39  <Method Integer Document.getNodeIdForElement(Object)>
	//   11   23:invokevirtual   #45  <Method int Integer.intValue()>
	//   12   26:putfield        #49  <Field int DOM$AttributeModifiedEvent.nodeId>
		dom$attributemodifiedevent.name = s;
	//   13   29:aload           4
	//   14   31:aload_2         
	//   15   32:putfield        #53  <Field String DOM$AttributeModifiedEvent.name>
		dom$attributemodifiedevent.value = s1;
	//   16   35:aload           4
	//   17   37:aload_3         
	//   18   38:putfield        #56  <Field String DOM$AttributeModifiedEvent.value>
		DOM.access$1200(DOM.this).sendNotificationToPeers("DOM.onAttributeModified", ((Object) (dom$attributemodifiedevent)));
	//   19   41:aload_0         
	//   20   42:getfield        #15  <Field DOM this$0>
	//   21   45:invokestatic    #60  <Method ChromePeerManager DOM.access$1200(DOM)>
	//   22   48:ldc1            #62  <String "DOM.onAttributeModified">
	//   23   50:aload           4
	//   24   52:invokevirtual   #68  <Method void ChromePeerManager.sendNotificationToPeers(String, Object)>
	//   25   55:return          
	}

	public void onAttributeRemoved(Object obj, String s)
	{
		DOM.AttributeRemovedEvent attributeremovedevent = new DOM.AttributeRemovedEvent(((DOM._cls1) (null)));
	//    0    0:new             #72  <Class DOM$AttributeRemovedEvent>
	//    1    3:dup             
	//    2    4:aconst_null     
	//    3    5:invokespecial   #73  <Method void DOM$AttributeRemovedEvent(DOM$1)>
	//    4    8:astore_3        
		attributeremovedevent.nodeId = DOM.access$300(DOM.this).getNodeIdForElement(obj).intValue();
	//    5    9:aload_3         
	//    6   10:aload_0         
	//    7   11:getfield        #15  <Field DOM this$0>
	//    8   14:invokestatic    #33  <Method Document DOM.access$300(DOM)>
	//    9   17:aload_1         
	//   10   18:invokevirtual   #39  <Method Integer Document.getNodeIdForElement(Object)>
	//   11   21:invokevirtual   #45  <Method int Integer.intValue()>
	//   12   24:putfield        #74  <Field int DOM$AttributeRemovedEvent.nodeId>
		attributeremovedevent.name = s;
	//   13   27:aload_3         
	//   14   28:aload_2         
	//   15   29:putfield        #75  <Field String DOM$AttributeRemovedEvent.name>
		DOM.access$1200(DOM.this).sendNotificationToPeers("DOM.attributeRemoved", ((Object) (attributeremovedevent)));
	//   16   32:aload_0         
	//   17   33:getfield        #15  <Field DOM this$0>
	//   18   36:invokestatic    #60  <Method ChromePeerManager DOM.access$1200(DOM)>
	//   19   39:ldc1            #77  <String "DOM.attributeRemoved">
	//   20   41:aload_3         
	//   21   42:invokevirtual   #68  <Method void ChromePeerManager.sendNotificationToPeers(String, Object)>
	//   22   45:return          
	}

	public void onChildNodeInserted(DocumentView documentview, Object obj, int i, int j, Accumulator accumulator)
	{
		DOM$ChildNodeInsertedEvent dom$childnodeinsertedevent = DOM.access$1700(DOM.this);
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field DOM this$0>
	//    2    4:invokestatic    #83  <Method DOM$ChildNodeInsertedEvent DOM.access$1700(DOM)>
	//    3    7:astore          6
		dom$childnodeinsertedevent.parentNodeId = i;
	//    4    9:aload           6
	//    5   11:iload_3         
	//    6   12:putfield        #88  <Field int DOM$ChildNodeInsertedEvent.parentNodeId>
		dom$childnodeinsertedevent.previousNodeId = j;
	//    7   15:aload           6
	//    8   17:iload           4
	//    9   19:putfield        #91  <Field int DOM$ChildNodeInsertedEvent.previousNodeId>
		dom$childnodeinsertedevent.node = DOM.access$400(DOM.this, obj, documentview, accumulator);
	//   10   22:aload           6
	//   11   24:aload_0         
	//   12   25:getfield        #15  <Field DOM this$0>
	//   13   28:aload_2         
	//   14   29:aload_1         
	//   15   30:aload           5
	//   16   32:invokestatic    #95  <Method DOM$Node DOM.access$400(DOM, Object, DocumentView, Accumulator)>
	//   17   35:putfield        #99  <Field DOM$Node DOM$ChildNodeInsertedEvent.node>
		DOM.access$1200(DOM.this).sendNotificationToPeers("DOM.childNodeInserted", ((Object) (dom$childnodeinsertedevent)));
	//   18   38:aload_0         
	//   19   39:getfield        #15  <Field DOM this$0>
	//   20   42:invokestatic    #60  <Method ChromePeerManager DOM.access$1200(DOM)>
	//   21   45:ldc1            #101 <String "DOM.childNodeInserted">
	//   22   47:aload           6
	//   23   49:invokevirtual   #68  <Method void ChromePeerManager.sendNotificationToPeers(String, Object)>
		DOM.access$1800(DOM.this, dom$childnodeinsertedevent);
	//   24   52:aload_0         
	//   25   53:getfield        #15  <Field DOM this$0>
	//   26   56:aload           6
	//   27   58:invokestatic    #105 <Method void DOM.access$1800(DOM, DOM$ChildNodeInsertedEvent)>
	//   28   61:return          
	}

	public void onChildNodeRemoved(int i, int j)
	{
		DOM.ChildNodeRemovedEvent childnoderemovedevent = DOM.access$1500(DOM.this);
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field DOM this$0>
	//    2    4:invokestatic    #113 <Method DOM$ChildNodeRemovedEvent DOM.access$1500(DOM)>
	//    3    7:astore_3        
		childnoderemovedevent.parentNodeId = i;
	//    4    8:aload_3         
	//    5    9:iload_1         
	//    6   10:putfield        #116 <Field int DOM$ChildNodeRemovedEvent.parentNodeId>
		childnoderemovedevent.nodeId = j;
	//    7   13:aload_3         
	//    8   14:iload_2         
	//    9   15:putfield        #117 <Field int DOM$ChildNodeRemovedEvent.nodeId>
		DOM.access$1200(DOM.this).sendNotificationToPeers("DOM.childNodeRemoved", ((Object) (childnoderemovedevent)));
	//   10   18:aload_0         
	//   11   19:getfield        #15  <Field DOM this$0>
	//   12   22:invokestatic    #60  <Method ChromePeerManager DOM.access$1200(DOM)>
	//   13   25:ldc1            #119 <String "DOM.childNodeRemoved">
	//   14   27:aload_3         
	//   15   28:invokevirtual   #68  <Method void ChromePeerManager.sendNotificationToPeers(String, Object)>
		DOM.access$1600(DOM.this, childnoderemovedevent);
	//   16   31:aload_0         
	//   17   32:getfield        #15  <Field DOM this$0>
	//   18   35:aload_3         
	//   19   36:invokestatic    #123 <Method void DOM.access$1600(DOM, DOM$ChildNodeRemovedEvent)>
	//   20   39:return          
	}

	public void onInspectRequested(Object obj)
	{
		Integer integer = DOM.access$300(DOM.this).getNodeIdForElement(obj);
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field DOM this$0>
	//    2    4:invokestatic    #33  <Method Document DOM.access$300(DOM)>
	//    3    7:aload_1         
	//    4    8:invokevirtual   #39  <Method Integer Document.getNodeIdForElement(Object)>
	//    5   11:astore_2        
		if(integer == null)
	//*   6   12:aload_2         
	//*   7   13:ifnonnull       30
		{
			LogUtil.d("DocumentProvider.Listener.onInspectRequested() called for a non-mapped node: element=%s", new Object[] {
				obj
			});
	//    8   16:ldc1            #127 <String "DocumentProvider.Listener.onInspectRequested() called for a non-mapped node: element=%s">
	//    9   18:iconst_1        
	//   10   19:anewarray       Object[]
	//   11   22:dup             
	//   12   23:iconst_0        
	//   13   24:aload_1         
	//   14   25:aastore         
	//   15   26:invokestatic    #133 <Method void LogUtil.d(String, Object[])>
			return;
	//   16   29:return          
		} else
		{
			obj = ((Object) (new nt(((DOM._cls1) (null)))));
	//   17   30:new             #135 <Class DOM$InspectNodeRequestedEvent>
	//   18   33:dup             
	//   19   34:aconst_null     
	//   20   35:invokespecial   #136 <Method void DOM$InspectNodeRequestedEvent(DOM$1)>
	//   21   38:astore_1        
			obj.nodeId = integer.intValue();
	//   22   39:aload_1         
	//   23   40:aload_2         
	//   24   41:invokevirtual   #45  <Method int Integer.intValue()>
	//   25   44:putfield        #137 <Field int DOM$InspectNodeRequestedEvent.nodeId>
			DOM.access$1200(DOM.this).sendNotificationToPeers("DOM.inspectNodeRequested", obj);
	//   26   47:aload_0         
	//   27   48:getfield        #15  <Field DOM this$0>
	//   28   51:invokestatic    #60  <Method ChromePeerManager DOM.access$1200(DOM)>
	//   29   54:ldc1            #139 <String "DOM.inspectNodeRequested">
	//   30   56:aload_1         
	//   31   57:invokevirtual   #68  <Method void ChromePeerManager.sendNotificationToPeers(String, Object)>
			return;
	//   32   60:return          
		}
	}

	final DOM this$0;

	private DOM$DocumentUpdateListener()
	{
		this$0 = DOM.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field DOM this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #18  <Method void Object()>
	//    5    9:return          
	}

	DOM$DocumentUpdateListener(DOM._cls1 _pcls1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #22  <Method void DOM$DocumentUpdateListener(DOM)>
	//    3    5:return          
	}
}
