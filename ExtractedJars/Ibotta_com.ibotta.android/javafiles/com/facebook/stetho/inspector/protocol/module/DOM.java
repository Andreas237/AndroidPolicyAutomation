// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.inspector.protocol.module;

import android.graphics.Color;
import com.facebook.stetho.common.*;
import com.facebook.stetho.inspector.elements.*;
import com.facebook.stetho.inspector.helper.ChromePeerManager;
import com.facebook.stetho.inspector.helper.PeersRegisteredListener;
import com.facebook.stetho.inspector.jsonrpc.*;
import com.facebook.stetho.inspector.jsonrpc.protocol.JsonRpcError;
import com.facebook.stetho.inspector.protocol.ChromeDevtoolsDomain;
import com.facebook.stetho.json.ObjectMapper;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

// Referenced classes of package com.facebook.stetho.inspector.protocol.module:
//			Runtime

public class DOM
	implements ChromeDevtoolsDomain
{
	private static class AttributeModifiedEvent
	{

		public String name;
		public int nodeId;
		public String value;

		private AttributeModifiedEvent()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #19  <Method void Object()>
		//    2    4:return          
		}

	}

	private static class AttributeRemovedEvent
	{

		public String name;
		public int nodeId;

		private AttributeRemovedEvent()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #18  <Method void Object()>
		//    2    4:return          
		}

	}

	private static class ChildNodeInsertedEvent
	{

		public Node node;
		public int parentNodeId;
		public int previousNodeId;

		private ChildNodeInsertedEvent()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #19  <Method void Object()>
		//    2    4:return          
		}

	}

	private static class ChildNodeRemovedEvent
	{

		public int nodeId;
		public int parentNodeId;

		private ChildNodeRemovedEvent()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #17  <Method void Object()>
		//    2    4:return          
		}

	}

	private static class DiscardSearchResultsRequest
	{

		public String searchId;

		private DiscardSearchResultsRequest()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #16  <Method void Object()>
		//    2    4:return          
		}
	}

	private final class DocumentUpdateListener
		implements com.facebook.stetho.inspector.elements.Document.UpdateListener
	{

		public void onAttributeModified(Object obj, String s, String s1)
		{
			AttributeModifiedEvent attributemodifiedevent = new AttributeModifiedEvent();
		//    0    0:new             #26  <Class DOM$AttributeModifiedEvent>
		//    1    3:dup             
		//    2    4:aconst_null     
		//    3    5:invokespecial   #29  <Method void DOM$AttributeModifiedEvent(DOM$1)>
		//    4    8:astore          4
			attributemodifiedevent.nodeId = mDocument.getNodeIdForElement(obj).intValue();
		//    5   10:aload           4
		//    6   12:aload_0         
		//    7   13:getfield        #15  <Field DOM this$0>
		//    8   16:invokestatic    #33  <Method Document DOM.access$300(DOM)>
		//    9   19:aload_1         
		//   10   20:invokevirtual   #39  <Method Integer Document.getNodeIdForElement(Object)>
		//   11   23:invokevirtual   #45  <Method int Integer.intValue()>
		//   12   26:putfield        #49  <Field int DOM$AttributeModifiedEvent.nodeId>
			attributemodifiedevent.name = s;
		//   13   29:aload           4
		//   14   31:aload_2         
		//   15   32:putfield        #53  <Field String DOM$AttributeModifiedEvent.name>
			attributemodifiedevent.value = s1;
		//   16   35:aload           4
		//   17   37:aload_3         
		//   18   38:putfield        #56  <Field String DOM$AttributeModifiedEvent.value>
			mPeerManager.sendNotificationToPeers("DOM.onAttributeModified", ((Object) (attributemodifiedevent)));
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
			AttributeRemovedEvent attributeremovedevent = new AttributeRemovedEvent();
		//    0    0:new             #72  <Class DOM$AttributeRemovedEvent>
		//    1    3:dup             
		//    2    4:aconst_null     
		//    3    5:invokespecial   #73  <Method void DOM$AttributeRemovedEvent(DOM$1)>
		//    4    8:astore_3        
			attributeremovedevent.nodeId = mDocument.getNodeIdForElement(obj).intValue();
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
			mPeerManager.sendNotificationToPeers("DOM.attributeRemoved", ((Object) (attributeremovedevent)));
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
			ChildNodeInsertedEvent childnodeinsertedevent = acquireChildNodeInsertedEvent();
		//    0    0:aload_0         
		//    1    1:getfield        #15  <Field DOM this$0>
		//    2    4:invokestatic    #83  <Method DOM$ChildNodeInsertedEvent DOM.access$1700(DOM)>
		//    3    7:astore          6
			childnodeinsertedevent.parentNodeId = i;
		//    4    9:aload           6
		//    5   11:iload_3         
		//    6   12:putfield        #88  <Field int DOM$ChildNodeInsertedEvent.parentNodeId>
			childnodeinsertedevent.previousNodeId = j;
		//    7   15:aload           6
		//    8   17:iload           4
		//    9   19:putfield        #91  <Field int DOM$ChildNodeInsertedEvent.previousNodeId>
			childnodeinsertedevent.node = createNodeForElement(obj, documentview, accumulator);
		//   10   22:aload           6
		//   11   24:aload_0         
		//   12   25:getfield        #15  <Field DOM this$0>
		//   13   28:aload_2         
		//   14   29:aload_1         
		//   15   30:aload           5
		//   16   32:invokestatic    #95  <Method DOM$Node DOM.access$400(DOM, Object, DocumentView, Accumulator)>
		//   17   35:putfield        #99  <Field DOM$Node DOM$ChildNodeInsertedEvent.node>
			mPeerManager.sendNotificationToPeers("DOM.childNodeInserted", ((Object) (childnodeinsertedevent)));
		//   18   38:aload_0         
		//   19   39:getfield        #15  <Field DOM this$0>
		//   20   42:invokestatic    #60  <Method ChromePeerManager DOM.access$1200(DOM)>
		//   21   45:ldc1            #101 <String "DOM.childNodeInserted">
		//   22   47:aload           6
		//   23   49:invokevirtual   #68  <Method void ChromePeerManager.sendNotificationToPeers(String, Object)>
			releaseChildNodeInsertedEvent(childnodeinsertedevent);
		//   24   52:aload_0         
		//   25   53:getfield        #15  <Field DOM this$0>
		//   26   56:aload           6
		//   27   58:invokestatic    #105 <Method void DOM.access$1800(DOM, DOM$ChildNodeInsertedEvent)>
		//   28   61:return          
		}

		public void onChildNodeRemoved(int i, int j)
		{
			ChildNodeRemovedEvent childnoderemovedevent = acquireChildNodeRemovedEvent();
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
			mPeerManager.sendNotificationToPeers("DOM.childNodeRemoved", ((Object) (childnoderemovedevent)));
		//   10   18:aload_0         
		//   11   19:getfield        #15  <Field DOM this$0>
		//   12   22:invokestatic    #60  <Method ChromePeerManager DOM.access$1200(DOM)>
		//   13   25:ldc1            #119 <String "DOM.childNodeRemoved">
		//   14   27:aload_3         
		//   15   28:invokevirtual   #68  <Method void ChromePeerManager.sendNotificationToPeers(String, Object)>
			releaseChildNodeRemovedEvent(childnoderemovedevent);
		//   16   31:aload_0         
		//   17   32:getfield        #15  <Field DOM this$0>
		//   18   35:aload_3         
		//   19   36:invokestatic    #123 <Method void DOM.access$1600(DOM, DOM$ChildNodeRemovedEvent)>
		//   20   39:return          
		}

		public void onInspectRequested(Object obj)
		{
			Integer integer = mDocument.getNodeIdForElement(obj);
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
				obj = ((Object) (new InspectNodeRequestedEvent()));
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
				mPeerManager.sendNotificationToPeers("DOM.inspectNodeRequested", obj);
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

		private DocumentUpdateListener()
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

	}

	private static class GetDocumentResponse
		implements JsonRpcResult
	{

		public Node root;

		private GetDocumentResponse()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #18  <Method void Object()>
		//    2    4:return          
		}

	}

	private static class GetSearchResultsRequest
	{

		public int fromIndex;
		public String searchId;
		public int toIndex;

		private GetSearchResultsRequest()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #19  <Method void Object()>
		//    2    4:return          
		}
	}

	private static class GetSearchResultsResponse
		implements JsonRpcResult
	{

		public List nodeIds;

		private GetSearchResultsResponse()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #19  <Method void Object()>
		//    2    4:return          
		}

	}

	private static class HighlightConfig
	{

		public RGBAColor contentColor;

		private HighlightConfig()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #14  <Method void Object()>
		//    2    4:return          
		}
	}

	private static class HighlightNodeRequest
	{

		public HighlightConfig highlightConfig;
		public Integer nodeId;
		public String objectId;

		private HighlightNodeRequest()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #20  <Method void Object()>
		//    2    4:return          
		}
	}

	private static class InspectNodeRequestedEvent
	{

		public int nodeId;

		private InspectNodeRequestedEvent()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #14  <Method void Object()>
		//    2    4:return          
		}

	}

	private static class Node
		implements JsonRpcResult
	{

		public List attributes;
		public Integer childNodeCount;
		public List children;
		public String localName;
		public int nodeId;
		public String nodeName;
		public NodeType nodeType;
		public String nodeValue;

		private Node()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #31  <Method void Object()>
		//    2    4:return          
		}

	}

	private final class PeerManagerListener extends PeersRegisteredListener
	{

		protected void onFirstPeerRegistered()
		{
			this;
		//    0    0:aload_0         
			JVM INSTR monitorenter ;
		//    1    1:monitorenter    
			mDocument.addRef();
		//    2    2:aload_0         
		//    3    3:getfield        #13  <Field DOM this$0>
		//    4    6:invokestatic    #25  <Method Document DOM.access$300(DOM)>
		//    5    9:invokevirtual   #30  <Method void Document.addRef()>
			mDocument.addUpdateListener(((com.facebook.stetho.inspector.elements.Document.UpdateListener) (mListener)));
		//    6   12:aload_0         
		//    7   13:getfield        #13  <Field DOM this$0>
		//    8   16:invokestatic    #25  <Method Document DOM.access$300(DOM)>
		//    9   19:aload_0         
		//   10   20:getfield        #13  <Field DOM this$0>
		//   11   23:invokestatic    #34  <Method DOM$DocumentUpdateListener DOM.access$1900(DOM)>
		//   12   26:invokevirtual   #38  <Method void Document.addUpdateListener(com.facebook.stetho.inspector.elements.Document$UpdateListener)>
			this;
		//   13   29:aload_0         
			JVM INSTR monitorexit ;
		//   14   30:monitorexit     
			return;
		//   15   31:return          
			Exception exception;
			exception;
		//   16   32:astore_1        
		//*  17   33:aload_0         
			throw exception;
		//   18   34:monitorexit     
		//   19   35:aload_1         
		//   20   36:athrow          
		}

		protected void onLastPeerUnregistered()
		{
			this;
		//    0    0:aload_0         
			JVM INSTR monitorenter ;
		//    1    1:monitorenter    
			mSearchResults.clear();
		//    2    2:aload_0         
		//    3    3:getfield        #13  <Field DOM this$0>
		//    4    6:invokestatic    #43  <Method Map DOM.access$2000(DOM)>
		//    5    9:invokeinterface #48  <Method void Map.clear()>
			mDocument.removeUpdateListener(((com.facebook.stetho.inspector.elements.Document.UpdateListener) (mListener)));
		//    6   14:aload_0         
		//    7   15:getfield        #13  <Field DOM this$0>
		//    8   18:invokestatic    #25  <Method Document DOM.access$300(DOM)>
		//    9   21:aload_0         
		//   10   22:getfield        #13  <Field DOM this$0>
		//   11   25:invokestatic    #34  <Method DOM$DocumentUpdateListener DOM.access$1900(DOM)>
		//   12   28:invokevirtual   #51  <Method void Document.removeUpdateListener(com.facebook.stetho.inspector.elements.Document$UpdateListener)>
			mDocument.release();
		//   13   31:aload_0         
		//   14   32:getfield        #13  <Field DOM this$0>
		//   15   35:invokestatic    #25  <Method Document DOM.access$300(DOM)>
		//   16   38:invokevirtual   #54  <Method void Document.release()>
			this;
		//   17   41:aload_0         
			JVM INSTR monitorexit ;
		//   18   42:monitorexit     
			return;
		//   19   43:return          
			Exception exception;
			exception;
		//   20   44:astore_1        
		//*  21   45:aload_0         
			throw exception;
		//   22   46:monitorexit     
		//   23   47:aload_1         
		//   24   48:athrow          
		}

		final DOM this$0;

		private PeerManagerListener()
		{
			this$0 = DOM.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #13  <Field DOM this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #16  <Method void PeersRegisteredListener()>
		//    5    9:return          
		}

	}

	private static class PerformSearchRequest
	{

		public Boolean includeUserAgentShadowDOM;
		public String query;

		private PerformSearchRequest()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #18  <Method void Object()>
		//    2    4:return          
		}
	}

	private static class PerformSearchResponse
		implements JsonRpcResult
	{

		public int resultCount;
		public String searchId;

		private PerformSearchResponse()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #20  <Method void Object()>
		//    2    4:return          
		}

	}

	private static class RGBAColor
	{

		public int getColor()
		{
			Double double1 = a;
		//    0    0:aload_0         
		//    1    1:getfield        #25  <Field Double a>
		//    2    4:astore          4
			byte byte0 = -1;
		//    3    6:iconst_m1       
		//    4    7:istore_1        
			if(double1 != null)
		//*   5    8:aload           4
		//*   6   10:ifnonnull       16
		//*   7   13:goto            55
			{
				long l = Math.round(double1.doubleValue() * 255D);
		//    8   16:aload           4
		//    9   18:invokevirtual   #31  <Method double Double.doubleValue()>
		//   10   21:ldc2w           #32  <Double 255D>
		//   11   24:dmul            
		//   12   25:invokestatic    #39  <Method long Math.round(double)>
		//   13   28:lstore_2        
				if(l < 0L)
		//*  14   29:lload_2         
		//*  15   30:lconst_0        
		//*  16   31:lcmp            
		//*  17   32:ifge            40
					byte0 = 0;
		//   18   35:iconst_0        
		//   19   36:istore_1        
				else
		//*  20   37:goto            55
				if(l < 255L)
		//*  21   40:lload_2         
		//*  22   41:ldc2w           #40  <Long 255L>
		//*  23   44:lcmp            
		//*  24   45:iflt            51
		//*  25   48:goto            55
					byte0 = (byte)(int)l;
		//   26   51:lload_2         
		//   27   52:l2i             
		//   28   53:int2byte        
		//   29   54:istore_1        
			}
			return Color.argb(((int) (byte0)), r, g, b);
		//   30   55:iload_1         
		//   31   56:aload_0         
		//   32   57:getfield        #43  <Field int r>
		//   33   60:aload_0         
		//   34   61:getfield        #45  <Field int g>
		//   35   64:aload_0         
		//   36   65:getfield        #47  <Field int b>
		//   37   68:invokestatic    #53  <Method int Color.argb(int, int, int, int)>
		//   38   71:ireturn         
		}

		public Double a;
		public int b;
		public int g;
		public int r;

		private RGBAColor()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #20  <Method void Object()>
		//    2    4:return          
		}
	}

	private static class ResolveNodeRequest
	{

		public int nodeId;
		public String objectGroup;

		private ResolveNodeRequest()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #18  <Method void Object()>
		//    2    4:return          
		}
	}

	private static class ResolveNodeResponse
		implements JsonRpcResult
	{

		public Runtime.RemoteObject object;

		private ResolveNodeResponse()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #18  <Method void Object()>
		//    2    4:return          
		}

	}

	private static class SetAttributesAsTextRequest
	{

		public int nodeId;
		public String text;

		private SetAttributesAsTextRequest()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #18  <Method void Object()>
		//    2    4:return          
		}
	}

	private static class SetInspectModeEnabledRequest
	{

		public boolean enabled;
		public HighlightConfig highlightConfig;
		public Boolean inspectShadowDOM;

		private SetInspectModeEnabledRequest()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #20  <Method void Object()>
		//    2    4:return          
		}
	}


	public DOM(Document document)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #105 <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #107 <Class ObjectMapper>
	//    4    8:dup             
	//    5    9:invokespecial   #108 <Method void ObjectMapper()>
	//    6   12:putfield        #110 <Field ObjectMapper mObjectMapper>
		mDocument = (Document)Util.throwIfNull(((Object) (document)));
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:invokestatic    #116 <Method Object Util.throwIfNull(Object)>
	//   10   20:checkcast       #118 <Class Document>
	//   11   23:putfield        #120 <Field Document mDocument>
	//   12   26:aload_0         
	//   13   27:new             #122 <Class HashMap>
	//   14   30:dup             
	//   15   31:invokespecial   #123 <Method void HashMap()>
	//   16   34:invokestatic    #129 <Method Map Collections.synchronizedMap(Map)>
	//   17   37:putfield        #131 <Field Map mSearchResults>
	//   18   40:aload_0         
	//   19   41:new             #133 <Class AtomicInteger>
	//   20   44:dup             
	//   21   45:iconst_0        
	//   22   46:invokespecial   #136 <Method void AtomicInteger(int)>
	//   23   49:putfield        #138 <Field AtomicInteger mResultCounter>
	//   24   52:aload_0         
	//   25   53:new             #140 <Class ChromePeerManager>
	//   26   56:dup             
	//   27   57:invokespecial   #141 <Method void ChromePeerManager()>
	//   28   60:putfield        #143 <Field ChromePeerManager mPeerManager>
		mPeerManager.setListener(((com.facebook.stetho.inspector.helper.PeerRegistrationListener) (new PeerManagerListener())));
	//   29   63:aload_0         
	//   30   64:getfield        #143 <Field ChromePeerManager mPeerManager>
	//   31   67:new             #61  <Class DOM$PeerManagerListener>
	//   32   70:dup             
	//   33   71:aload_0         
	//   34   72:aconst_null     
	//   35   73:invokespecial   #146 <Method void DOM$PeerManagerListener(DOM, DOM$1)>
	//   36   76:invokevirtual   #150 <Method void ChromePeerManager.setListener(com.facebook.stetho.inspector.helper.PeerRegistrationListener)>
	//   37   79:aload_0         
	//   38   80:new             #37  <Class DOM$DocumentUpdateListener>
	//   39   83:dup             
	//   40   84:aload_0         
	//   41   85:aconst_null     
	//   42   86:invokespecial   #151 <Method void DOM$DocumentUpdateListener(DOM, DOM$1)>
	//   43   89:putfield        #153 <Field DOM$DocumentUpdateListener mListener>
	//   44   92:return          
	}

	private ChildNodeInsertedEvent acquireChildNodeInsertedEvent()
	{
		ChildNodeInsertedEvent childnodeinsertedevent1 = mCachedChildNodeInsertedEvent;
	//    0    0:aload_0         
	//    1    1:getfield        #194 <Field DOM$ChildNodeInsertedEvent mCachedChildNodeInsertedEvent>
	//    2    4:astore_2        
		ChildNodeInsertedEvent childnodeinsertedevent = childnodeinsertedevent1;
	//    3    5:aload_2         
	//    4    6:astore_1        
		if(childnodeinsertedevent1 == null)
	//*   5    7:aload_2         
	//*   6    8:ifnonnull       20
			childnodeinsertedevent = new ChildNodeInsertedEvent();
	//    7   11:new             #28  <Class DOM$ChildNodeInsertedEvent>
	//    8   14:dup             
	//    9   15:aconst_null     
	//   10   16:invokespecial   #197 <Method void DOM$ChildNodeInsertedEvent(DOM$1)>
	//   11   19:astore_1        
		mCachedChildNodeInsertedEvent = null;
	//   12   20:aload_0         
	//   13   21:aconst_null     
	//   14   22:putfield        #194 <Field DOM$ChildNodeInsertedEvent mCachedChildNodeInsertedEvent>
		return childnodeinsertedevent;
	//   15   25:aload_1         
	//   16   26:areturn         
	}

	private ChildNodeRemovedEvent acquireChildNodeRemovedEvent()
	{
		ChildNodeRemovedEvent childnoderemovedevent1 = mCachedChildNodeRemovedEvent;
	//    0    0:aload_0         
	//    1    1:getfield        #199 <Field DOM$ChildNodeRemovedEvent mCachedChildNodeRemovedEvent>
	//    2    4:astore_2        
		ChildNodeRemovedEvent childnoderemovedevent = childnoderemovedevent1;
	//    3    5:aload_2         
	//    4    6:astore_1        
		if(childnoderemovedevent1 == null)
	//*   5    7:aload_2         
	//*   6    8:ifnonnull       20
			childnoderemovedevent = new ChildNodeRemovedEvent();
	//    7   11:new             #31  <Class DOM$ChildNodeRemovedEvent>
	//    8   14:dup             
	//    9   15:aconst_null     
	//   10   16:invokespecial   #200 <Method void DOM$ChildNodeRemovedEvent(DOM$1)>
	//   11   19:astore_1        
		mCachedChildNodeRemovedEvent = null;
	//   12   20:aload_0         
	//   13   21:aconst_null     
	//   14   22:putfield        #199 <Field DOM$ChildNodeRemovedEvent mCachedChildNodeRemovedEvent>
		return childnoderemovedevent;
	//   15   25:aload_1         
	//   16   26:areturn         
	}

	private Node createNodeForElement(Object obj, DocumentView documentview, Accumulator accumulator)
	{
		if(accumulator != null)
	//*   0    0:aload_3         
	//*   1    1:ifnull          11
			accumulator.store(obj);
	//    2    4:aload_3         
	//    3    5:aload_1         
	//    4    6:invokeinterface #207 <Method void Accumulator.store(Object)>
		Object obj1 = ((Object) (mDocument.getNodeDescriptor(obj)));
	//    5   11:aload_0         
	//    6   12:getfield        #120 <Field Document mDocument>
	//    7   15:aload_1         
	//    8   16:invokevirtual   #211 <Method NodeDescriptor Document.getNodeDescriptor(Object)>
	//    9   19:astore          7
		Node node = new Node();
	//   10   21:new             #58  <Class DOM$Node>
	//   11   24:dup             
	//   12   25:aconst_null     
	//   13   26:invokespecial   #212 <Method void DOM$Node(DOM$1)>
	//   14   29:astore          6
		node.nodeId = mDocument.getNodeIdForElement(obj).intValue();
	//   15   31:aload           6
	//   16   33:aload_0         
	//   17   34:getfield        #120 <Field Document mDocument>
	//   18   37:aload_1         
	//   19   38:invokevirtual   #216 <Method Integer Document.getNodeIdForElement(Object)>
	//   20   41:invokevirtual   #222 <Method int Integer.intValue()>
	//   21   44:putfield        #226 <Field int DOM$Node.nodeId>
		node.nodeType = ((NodeDescriptor) (obj1)).getNodeType(obj);
	//   22   47:aload           6
	//   23   49:aload           7
	//   24   51:aload_1         
	//   25   52:invokeinterface #232 <Method NodeType NodeDescriptor.getNodeType(Object)>
	//   26   57:putfield        #236 <Field NodeType DOM$Node.nodeType>
		node.nodeName = ((NodeDescriptor) (obj1)).getNodeName(obj);
	//   27   60:aload           6
	//   28   62:aload           7
	//   29   64:aload_1         
	//   30   65:invokeinterface #240 <Method String NodeDescriptor.getNodeName(Object)>
	//   31   70:putfield        #244 <Field String DOM$Node.nodeName>
		node.localName = ((NodeDescriptor) (obj1)).getLocalName(obj);
	//   32   73:aload           6
	//   33   75:aload           7
	//   34   77:aload_1         
	//   35   78:invokeinterface #247 <Method String NodeDescriptor.getLocalName(Object)>
	//   36   83:putfield        #250 <Field String DOM$Node.localName>
		node.nodeValue = ((NodeDescriptor) (obj1)).getNodeValue(obj);
	//   37   86:aload           6
	//   38   88:aload           7
	//   39   90:aload_1         
	//   40   91:invokeinterface #253 <Method String NodeDescriptor.getNodeValue(Object)>
	//   41   96:putfield        #256 <Field String DOM$Node.nodeValue>
		com.facebook.stetho.inspector.elements.Document.AttributeListAccumulator attributelistaccumulator = new com.facebook.stetho.inspector.elements.Document.AttributeListAccumulator();
	//   42   99:new             #258 <Class com.facebook.stetho.inspector.elements.Document$AttributeListAccumulator>
	//   43  102:dup             
	//   44  103:invokespecial   #259 <Method void com.facebook.stetho.inspector.elements.Document$AttributeListAccumulator()>
	//   45  106:astore          8
		((NodeDescriptor) (obj1)).getAttributes(obj, ((com.facebook.stetho.inspector.elements.AttributeAccumulator) (attributelistaccumulator)));
	//   46  108:aload           7
	//   47  110:aload_1         
	//   48  111:aload           8
	//   49  113:invokeinterface #263 <Method void NodeDescriptor.getAttributes(Object, com.facebook.stetho.inspector.elements.AttributeAccumulator)>
		node.attributes = ((List) (attributelistaccumulator));
	//   50  118:aload           6
	//   51  120:aload           8
	//   52  122:putfield        #267 <Field List DOM$Node.attributes>
		obj1 = ((Object) (documentview.getElementInfo(obj)));
	//   53  125:aload_2         
	//   54  126:aload_1         
	//   55  127:invokeinterface #273 <Method ElementInfo DocumentView.getElementInfo(Object)>
	//   56  132:astore          7
		if(((ElementInfo) (obj1)).children.size() == 0)
	//*  57  134:aload           7
	//*  58  136:getfield        #278 <Field List ElementInfo.children>
	//*  59  139:invokeinterface #283 <Method int List.size()>
	//*  60  144:ifne            154
			obj = ((Object) (Collections.emptyList()));
	//   61  147:invokestatic    #287 <Method List Collections.emptyList()>
	//   62  150:astore_1        
		else
	//*  63  151:goto            172
			obj = ((Object) (new ArrayList(((ElementInfo) (obj1)).children.size())));
	//   64  154:new             #289 <Class ArrayList>
	//   65  157:dup             
	//   66  158:aload           7
	//   67  160:getfield        #278 <Field List ElementInfo.children>
	//   68  163:invokeinterface #283 <Method int List.size()>
	//   69  168:invokespecial   #290 <Method void ArrayList(int)>
	//   70  171:astore_1        
		int i = 0;
	//   71  172:iconst_0        
	//   72  173:istore          4
		for(int j = ((ElementInfo) (obj1)).children.size(); i < j; i++)
	//*  73  175:aload           7
	//*  74  177:getfield        #278 <Field List ElementInfo.children>
	//*  75  180:invokeinterface #283 <Method int List.size()>
	//*  76  185:istore          5
	//*  77  187:iload           4
	//*  78  189:iload           5
	//*  79  191:icmpge          228
			((List) (obj)).add(((Object) (createNodeForElement(((ElementInfo) (obj1)).children.get(i), documentview, accumulator))));
	//   80  194:aload_1         
	//   81  195:aload_0         
	//   82  196:aload           7
	//   83  198:getfield        #278 <Field List ElementInfo.children>
	//   84  201:iload           4
	//   85  203:invokeinterface #294 <Method Object List.get(int)>
	//   86  208:aload_2         
	//   87  209:aload_3         
	//   88  210:invokespecial   #192 <Method DOM$Node createNodeForElement(Object, DocumentView, Accumulator)>
	//   89  213:invokeinterface #298 <Method boolean List.add(Object)>
	//   90  218:pop             

	//   91  219:iload           4
	//   92  221:iconst_1        
	//   93  222:iadd            
	//   94  223:istore          4
	//*  95  225:goto            187
		node.children = ((List) (obj));
	//   96  228:aload           6
	//   97  230:aload_1         
	//   98  231:putfield        #299 <Field List DOM$Node.children>
		node.childNodeCount = Integer.valueOf(((List) (obj)).size());
	//   99  234:aload           6
	//  100  236:aload_1         
	//  101  237:invokeinterface #283 <Method int List.size()>
	//  102  242:invokestatic    #303 <Method Integer Integer.valueOf(int)>
	//  103  245:putfield        #307 <Field Integer DOM$Node.childNodeCount>
		return node;
	//  104  248:aload           6
	//  105  250:areturn         
	}

	private void releaseChildNodeInsertedEvent(ChildNodeInsertedEvent childnodeinsertedevent)
	{
		childnodeinsertedevent.parentNodeId = -1;
	//    0    0:aload_1         
	//    1    1:iconst_m1       
	//    2    2:putfield        #313 <Field int DOM$ChildNodeInsertedEvent.parentNodeId>
		childnodeinsertedevent.previousNodeId = -1;
	//    3    5:aload_1         
	//    4    6:iconst_m1       
	//    5    7:putfield        #316 <Field int DOM$ChildNodeInsertedEvent.previousNodeId>
		childnodeinsertedevent.node = null;
	//    6   10:aload_1         
	//    7   11:aconst_null     
	//    8   12:putfield        #320 <Field DOM$Node DOM$ChildNodeInsertedEvent.node>
		if(mCachedChildNodeInsertedEvent == null)
	//*   9   15:aload_0         
	//*  10   16:getfield        #194 <Field DOM$ChildNodeInsertedEvent mCachedChildNodeInsertedEvent>
	//*  11   19:ifnonnull       27
			mCachedChildNodeInsertedEvent = childnodeinsertedevent;
	//   12   22:aload_0         
	//   13   23:aload_1         
	//   14   24:putfield        #194 <Field DOM$ChildNodeInsertedEvent mCachedChildNodeInsertedEvent>
	//   15   27:return          
	}

	private void releaseChildNodeRemovedEvent(ChildNodeRemovedEvent childnoderemovedevent)
	{
		childnoderemovedevent.parentNodeId = -1;
	//    0    0:aload_1         
	//    1    1:iconst_m1       
	//    2    2:putfield        #321 <Field int DOM$ChildNodeRemovedEvent.parentNodeId>
		childnoderemovedevent.nodeId = -1;
	//    3    5:aload_1         
	//    4    6:iconst_m1       
	//    5    7:putfield        #322 <Field int DOM$ChildNodeRemovedEvent.nodeId>
		if(mCachedChildNodeRemovedEvent == null)
	//*   6   10:aload_0         
	//*   7   11:getfield        #199 <Field DOM$ChildNodeRemovedEvent mCachedChildNodeRemovedEvent>
	//*   8   14:ifnonnull       22
			mCachedChildNodeRemovedEvent = childnoderemovedevent;
	//    9   17:aload_0         
	//   10   18:aload_1         
	//   11   19:putfield        #199 <Field DOM$ChildNodeRemovedEvent mCachedChildNodeRemovedEvent>
	//   12   22:return          
	}

	public void disable(JsonRpcPeer jsonrpcpeer, JSONObject jsonobject)
	{
		mPeerManager.removePeer(jsonrpcpeer);
	//    0    0:aload_0         
	//    1    1:getfield        #143 <Field ChromePeerManager mPeerManager>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #329 <Method void ChromePeerManager.removePeer(JsonRpcPeer)>
	//    4    8:return          
	}

	public void discardSearchResults(JsonRpcPeer jsonrpcpeer, JSONObject jsonobject)
	{
		jsonrpcpeer = ((JsonRpcPeer) ((DiscardSearchResultsRequest)mObjectMapper.convertValue(((Object) (jsonobject)), com/facebook/stetho/inspector/protocol/module/DOM$DiscardSearchResultsRequest)));
	//    0    0:aload_0         
	//    1    1:getfield        #110 <Field ObjectMapper mObjectMapper>
	//    2    4:aload_2         
	//    3    5:ldc1            #34  <Class DOM$DiscardSearchResultsRequest>
	//    4    7:invokevirtual   #335 <Method Object ObjectMapper.convertValue(Object, Class)>
	//    5   10:checkcast       #34  <Class DOM$DiscardSearchResultsRequest>
	//    6   13:astore_1        
		if(((DiscardSearchResultsRequest) (jsonrpcpeer)).searchId != null)
	//*   7   14:aload_1         
	//*   8   15:getfield        #338 <Field String DOM$DiscardSearchResultsRequest.searchId>
	//*   9   18:ifnull          35
			mSearchResults.remove(((Object) (((DiscardSearchResultsRequest) (jsonrpcpeer)).searchId)));
	//   10   21:aload_0         
	//   11   22:getfield        #131 <Field Map mSearchResults>
	//   12   25:aload_1         
	//   13   26:getfield        #338 <Field String DOM$DiscardSearchResultsRequest.searchId>
	//   14   29:invokeinterface #343 <Method Object Map.remove(Object)>
	//   15   34:pop             
	//   16   35:return          
	}

	public void enable(JsonRpcPeer jsonrpcpeer, JSONObject jsonobject)
	{
		mPeerManager.addPeer(jsonrpcpeer);
	//    0    0:aload_0         
	//    1    1:getfield        #143 <Field ChromePeerManager mPeerManager>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #348 <Method boolean ChromePeerManager.addPeer(JsonRpcPeer)>
	//    4    8:pop             
	//    5    9:return          
	}

	public JsonRpcResult getDocument(JsonRpcPeer jsonrpcpeer, JSONObject jsonobject)
	{
		jsonrpcpeer = ((JsonRpcPeer) (new GetDocumentResponse()));
	//    0    0:new             #40  <Class DOM$GetDocumentResponse>
	//    1    3:dup             
	//    2    4:aconst_null     
	//    3    5:invokespecial   #351 <Method void DOM$GetDocumentResponse(DOM$1)>
	//    4    8:astore_1        
		jsonrpcpeer.root = (Node)mDocument.postAndWait(new UncheckedCallable() {

			public Node call()
			{
				Object obj = mDocument.getRootElement();
			//    0    0:aload_0         
			//    1    1:getfield        #18  <Field DOM this$0>
			//    2    4:invokestatic    #28  <Method Document DOM.access$300(DOM)>
			//    3    7:invokevirtual   #34  <Method Object Document.getRootElement()>
			//    4   10:astore_1        
				DOM dom = DOM.this;
			//    5   11:aload_0         
			//    6   12:getfield        #18  <Field DOM this$0>
			//    7   15:astore_2        
				return dom.createNodeForElement(obj, dom.mDocument.getDocumentView(), ((Accumulator) (null)));
			//    8   16:aload_2         
			//    9   17:aload_1         
			//   10   18:aload_2         
			//   11   19:invokestatic    #28  <Method Document DOM.access$300(DOM)>
			//   12   22:invokevirtual   #38  <Method DocumentView Document.getDocumentView()>
			//   13   25:aconst_null     
			//   14   26:invokestatic    #42  <Method DOM$Node DOM.access$400(DOM, Object, DocumentView, Accumulator)>
			//   15   29:areturn         
			}

			public volatile Object call()
			{
				return ((Object) (call()));
			//    0    0:aload_0         
			//    1    1:invokevirtual   #44  <Method DOM$Node call()>
			//    2    4:areturn         
			}

			final DOM this$0;

			
			{
				this$0 = DOM.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field DOM this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #21  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//    5    9:aload_1         
	//    6   10:aload_0         
	//    7   11:getfield        #120 <Field Document mDocument>
	//    8   14:new             #8   <Class DOM$1>
	//    9   17:dup             
	//   10   18:aload_0         
	//   11   19:invokespecial   #354 <Method void DOM$1(DOM)>
	//   12   22:invokevirtual   #358 <Method Object Document.postAndWait(UncheckedCallable)>
	//   13   25:checkcast       #58  <Class DOM$Node>
	//   14   28:putfield        #361 <Field DOM$Node DOM$GetDocumentResponse.root>
		return ((JsonRpcResult) (jsonrpcpeer));
	//   15   31:aload_1         
	//   16   32:areturn         
	}

	public GetSearchResultsResponse getSearchResults(JsonRpcPeer jsonrpcpeer, JSONObject jsonobject)
	{
		jsonrpcpeer = ((JsonRpcPeer) ((GetSearchResultsRequest)mObjectMapper.convertValue(((Object) (jsonobject)), com/facebook/stetho/inspector/protocol/module/DOM$GetSearchResultsRequest)));
	//    0    0:aload_0         
	//    1    1:getfield        #110 <Field ObjectMapper mObjectMapper>
	//    2    4:aload_2         
	//    3    5:ldc1            #43  <Class DOM$GetSearchResultsRequest>
	//    4    7:invokevirtual   #335 <Method Object ObjectMapper.convertValue(Object, Class)>
	//    5   10:checkcast       #43  <Class DOM$GetSearchResultsRequest>
	//    6   13:astore_1        
		if(((GetSearchResultsRequest) (jsonrpcpeer)).searchId == null)
	//*   7   14:aload_1         
	//*   8   15:getfield        #364 <Field String DOM$GetSearchResultsRequest.searchId>
	//*   9   18:ifnonnull       29
		{
			LogUtil.w("searchId may not be null");
	//   10   21:ldc2            #366 <String "searchId may not be null">
	//   11   24:invokestatic    #372 <Method void LogUtil.w(String)>
			return null;
	//   12   27:aconst_null     
	//   13   28:areturn         
		}
		jsonobject = ((JSONObject) ((List)mSearchResults.get(((Object) (((GetSearchResultsRequest) (jsonrpcpeer)).searchId)))));
	//   14   29:aload_0         
	//   15   30:getfield        #131 <Field Map mSearchResults>
	//   16   33:aload_1         
	//   17   34:getfield        #364 <Field String DOM$GetSearchResultsRequest.searchId>
	//   18   37:invokeinterface #374 <Method Object Map.get(Object)>
	//   19   42:checkcast       #280 <Class List>
	//   20   45:astore_2        
		if(jsonobject == null)
	//*  21   46:aload_2         
	//*  22   47:ifnonnull       92
		{
			jsonobject = ((JSONObject) (new StringBuilder()));
	//   23   50:new             #376 <Class StringBuilder>
	//   24   53:dup             
	//   25   54:invokespecial   #377 <Method void StringBuilder()>
	//   26   57:astore_2        
			((StringBuilder) (jsonobject)).append("\"");
	//   27   58:aload_2         
	//   28   59:ldc2            #379 <String "\"">
	//   29   62:invokevirtual   #383 <Method StringBuilder StringBuilder.append(String)>
	//   30   65:pop             
			((StringBuilder) (jsonobject)).append(((GetSearchResultsRequest) (jsonrpcpeer)).searchId);
	//   31   66:aload_2         
	//   32   67:aload_1         
	//   33   68:getfield        #364 <Field String DOM$GetSearchResultsRequest.searchId>
	//   34   71:invokevirtual   #383 <Method StringBuilder StringBuilder.append(String)>
	//   35   74:pop             
			((StringBuilder) (jsonobject)).append("\" is not a valid reference to a search result");
	//   36   75:aload_2         
	//   37   76:ldc2            #385 <String "\" is not a valid reference to a search result">
	//   38   79:invokevirtual   #383 <Method StringBuilder StringBuilder.append(String)>
	//   39   82:pop             
			LogUtil.w(((StringBuilder) (jsonobject)).toString());
	//   40   83:aload_2         
	//   41   84:invokevirtual   #389 <Method String StringBuilder.toString()>
	//   42   87:invokestatic    #372 <Method void LogUtil.w(String)>
			return null;
	//   43   90:aconst_null     
	//   44   91:areturn         
		} else
		{
			jsonrpcpeer = ((JsonRpcPeer) (((List) (jsonobject)).subList(((GetSearchResultsRequest) (jsonrpcpeer)).fromIndex, ((GetSearchResultsRequest) (jsonrpcpeer)).toIndex)));
	//   45   92:aload_2         
	//   46   93:aload_1         
	//   47   94:getfield        #392 <Field int DOM$GetSearchResultsRequest.fromIndex>
	//   48   97:aload_1         
	//   49   98:getfield        #395 <Field int DOM$GetSearchResultsRequest.toIndex>
	//   50  101:invokeinterface #399 <Method List List.subList(int, int)>
	//   51  106:astore_1        
			jsonobject = ((JSONObject) (new GetSearchResultsResponse()));
	//   52  107:new             #46  <Class DOM$GetSearchResultsResponse>
	//   53  110:dup             
	//   54  111:aconst_null     
	//   55  112:invokespecial   #400 <Method void DOM$GetSearchResultsResponse(DOM$1)>
	//   56  115:astore_2        
			jsonobject.nodeIds = ((List) (jsonrpcpeer));
	//   57  116:aload_2         
	//   58  117:aload_1         
	//   59  118:putfield        #403 <Field List DOM$GetSearchResultsResponse.nodeIds>
			return ((GetSearchResultsResponse) (jsonobject));
	//   60  121:aload_2         
	//   61  122:areturn         
		}
	}

	public void hideHighlight(JsonRpcPeer jsonrpcpeer, JSONObject jsonobject)
	{
		mDocument.postAndWait(new Runnable() {

			public void run()
			{
				mDocument.hideHighlight();
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field DOM this$0>
			//    2    4:invokestatic    #26  <Method Document DOM.access$300(DOM)>
			//    3    7:invokevirtual   #30  <Method void Document.hideHighlight()>
			//    4   10:return          
			}

			final DOM this$0;

			
			{
				this$0 = DOM.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field DOM this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//    0    0:aload_0         
	//    1    1:getfield        #120 <Field Document mDocument>
	//    2    4:new             #12  <Class DOM$3>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:invokespecial   #405 <Method void DOM$3(DOM)>
	//    6   12:invokevirtual   #408 <Method void Document.postAndWait(Runnable)>
	//    7   15:return          
	}

	public void highlightNode(final JsonRpcPeer request, final JSONObject contentColor)
	{
		request = ((JsonRpcPeer) ((HighlightNodeRequest)mObjectMapper.convertValue(((Object) (contentColor)), com/facebook/stetho/inspector/protocol/module/DOM$HighlightNodeRequest)));
	//    0    0:aload_0         
	//    1    1:getfield        #110 <Field ObjectMapper mObjectMapper>
	//    2    4:aload_2         
	//    3    5:ldc1            #52  <Class DOM$HighlightNodeRequest>
	//    4    7:invokevirtual   #335 <Method Object ObjectMapper.convertValue(Object, Class)>
	//    5   10:checkcast       #52  <Class DOM$HighlightNodeRequest>
	//    6   13:astore_1        
		if(((HighlightNodeRequest) (request)).nodeId == null)
	//*   7   14:aload_1         
	//*   8   15:getfield        #411 <Field Integer DOM$HighlightNodeRequest.nodeId>
	//*   9   18:ifnonnull       28
		{
			LogUtil.w("DOM.highlightNode was not given a nodeId; JS objectId is not supported");
	//   10   21:ldc2            #413 <String "DOM.highlightNode was not given a nodeId; JS objectId is not supported">
	//   11   24:invokestatic    #372 <Method void LogUtil.w(String)>
			return;
	//   12   27:return          
		}
		contentColor = ((JSONObject) (((HighlightNodeRequest) (request)).highlightConfig.contentColor));
	//   13   28:aload_1         
	//   14   29:getfield        #417 <Field DOM$HighlightConfig DOM$HighlightNodeRequest.highlightConfig>
	//   15   32:getfield        #421 <Field DOM$RGBAColor DOM$HighlightConfig.contentColor>
	//   16   35:astore_2        
		if(contentColor == null)
	//*  17   36:aload_2         
	//*  18   37:ifnonnull       47
		{
			LogUtil.w("DOM.highlightNode was not given a color to highlight with");
	//   19   40:ldc2            #423 <String "DOM.highlightNode was not given a color to highlight with">
	//   20   43:invokestatic    #372 <Method void LogUtil.w(String)>
			return;
	//   21   46:return          
		} else
		{
			mDocument.postAndWait(new Runnable() {

				public void run()
				{
					Object obj = mDocument.getElementForNodeId(request.nodeId.intValue());
				//    0    0:aload_0         
				//    1    1:getfield        #21  <Field DOM this$0>
				//    2    4:invokestatic    #34  <Method Document DOM.access$300(DOM)>
				//    3    7:aload_0         
				//    4    8:getfield        #23  <Field DOM$HighlightNodeRequest val$request>
				//    5   11:getfield        #40  <Field Integer DOM$HighlightNodeRequest.nodeId>
				//    6   14:invokevirtual   #46  <Method int Integer.intValue()>
				//    7   17:invokevirtual   #52  <Method Object Document.getElementForNodeId(int)>
				//    8   20:astore_1        
					if(obj != null)
				//*   9   21:aload_1         
				//*  10   22:ifnull          43
						mDocument.highlightElement(obj, contentColor.getColor());
				//   11   25:aload_0         
				//   12   26:getfield        #21  <Field DOM this$0>
				//   13   29:invokestatic    #34  <Method Document DOM.access$300(DOM)>
				//   14   32:aload_1         
				//   15   33:aload_0         
				//   16   34:getfield        #25  <Field DOM$RGBAColor val$contentColor>
				//   17   37:invokevirtual   #57  <Method int DOM$RGBAColor.getColor()>
				//   18   40:invokevirtual   #61  <Method void Document.highlightElement(Object, int)>
				//   19   43:return          
				}

				final DOM this$0;
				final RGBAColor val$contentColor;
				final HighlightNodeRequest val$request;

			
			{
				this$0 = DOM.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #21  <Field DOM this$0>
				request = highlightnoderequest;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #23  <Field DOM$HighlightNodeRequest val$request>
				contentColor = rgbacolor;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #25  <Field DOM$RGBAColor val$contentColor>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #28  <Method void Object()>
			//   11   19:return          
			}
			}
);
	//   22   47:aload_0         
	//   23   48:getfield        #120 <Field Document mDocument>
	//   24   51:new             #10  <Class DOM$2>
	//   25   54:dup             
	//   26   55:aload_0         
	//   27   56:aload_1         
	//   28   57:aload_2         
	//   29   58:invokespecial   #426 <Method void DOM$2(DOM, DOM$HighlightNodeRequest, DOM$RGBAColor)>
	//   30   61:invokevirtual   #408 <Method void Document.postAndWait(Runnable)>
			return;
	//   31   64:return          
		}
	}

	public PerformSearchResponse performSearch(final JsonRpcPeer resultNodeIds, final JSONObject request)
	{
		request = ((JSONObject) ((PerformSearchRequest)mObjectMapper.convertValue(((Object) (request)), com/facebook/stetho/inspector/protocol/module/DOM$PerformSearchRequest)));
	//    0    0:aload_0         
	//    1    1:getfield        #110 <Field ObjectMapper mObjectMapper>
	//    2    4:aload_2         
	//    3    5:ldc1            #64  <Class DOM$PerformSearchRequest>
	//    4    7:invokevirtual   #335 <Method Object ObjectMapper.convertValue(Object, Class)>
	//    5   10:checkcast       #64  <Class DOM$PerformSearchRequest>
	//    6   13:astore_2        
		resultNodeIds = ((JsonRpcPeer) (new ArrayListAccumulator()));
	//    7   14:new             #430 <Class ArrayListAccumulator>
	//    8   17:dup             
	//    9   18:invokespecial   #431 <Method void ArrayListAccumulator()>
	//   10   21:astore_1        
		mDocument.postAndWait(new Runnable() {

			public void run()
			{
				mDocument.findMatchingElements(request.query, ((Accumulator) (resultNodeIds)));
			//    0    0:aload_0         
			//    1    1:getfield        #21  <Field DOM this$0>
			//    2    4:invokestatic    #34  <Method Document DOM.access$300(DOM)>
			//    3    7:aload_0         
			//    4    8:getfield        #23  <Field DOM$PerformSearchRequest val$request>
			//    5   11:getfield        #40  <Field String DOM$PerformSearchRequest.query>
			//    6   14:aload_0         
			//    7   15:getfield        #25  <Field ArrayListAccumulator val$resultNodeIds>
			//    8   18:invokevirtual   #46  <Method void Document.findMatchingElements(String, Accumulator)>
			//    9   21:return          
			}

			final DOM this$0;
			final PerformSearchRequest val$request;
			final ArrayListAccumulator val$resultNodeIds;

			
			{
				this$0 = DOM.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #21  <Field DOM this$0>
				request = performsearchrequest;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #23  <Field DOM$PerformSearchRequest val$request>
				resultNodeIds = arraylistaccumulator;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #25  <Field ArrayListAccumulator val$resultNodeIds>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #28  <Method void Object()>
			//   11   19:return          
			}
		}
);
	//   11   22:aload_0         
	//   12   23:getfield        #120 <Field Document mDocument>
	//   13   26:new             #20  <Class DOM$7>
	//   14   29:dup             
	//   15   30:aload_0         
	//   16   31:aload_2         
	//   17   32:aload_1         
	//   18   33:invokespecial   #434 <Method void DOM$7(DOM, DOM$PerformSearchRequest, ArrayListAccumulator)>
	//   19   36:invokevirtual   #408 <Method void Document.postAndWait(Runnable)>
		request = ((JSONObject) (String.valueOf(mResultCounter.getAndIncrement())));
	//   20   39:aload_0         
	//   21   40:getfield        #138 <Field AtomicInteger mResultCounter>
	//   22   43:invokevirtual   #437 <Method int AtomicInteger.getAndIncrement()>
	//   23   46:invokestatic    #442 <Method String String.valueOf(int)>
	//   24   49:astore_2        
		mSearchResults.put(((Object) (request)), ((Object) (resultNodeIds)));
	//   25   50:aload_0         
	//   26   51:getfield        #131 <Field Map mSearchResults>
	//   27   54:aload_2         
	//   28   55:aload_1         
	//   29   56:invokeinterface #446 <Method Object Map.put(Object, Object)>
	//   30   61:pop             
		PerformSearchResponse performsearchresponse = new PerformSearchResponse();
	//   31   62:new             #67  <Class DOM$PerformSearchResponse>
	//   32   65:dup             
	//   33   66:aconst_null     
	//   34   67:invokespecial   #447 <Method void DOM$PerformSearchResponse(DOM$1)>
	//   35   70:astore_3        
		performsearchresponse.searchId = ((String) (request));
	//   36   71:aload_3         
	//   37   72:aload_2         
	//   38   73:putfield        #448 <Field String DOM$PerformSearchResponse.searchId>
		performsearchresponse.resultCount = ((ArrayListAccumulator) (resultNodeIds)).size();
	//   39   76:aload_3         
	//   40   77:aload_1         
	//   41   78:invokevirtual   #449 <Method int ArrayListAccumulator.size()>
	//   42   81:putfield        #452 <Field int DOM$PerformSearchResponse.resultCount>
		return performsearchresponse;
	//   43   84:aload_3         
	//   44   85:areturn         
	}

	public ResolveNodeResponse resolveNode(JsonRpcPeer jsonrpcpeer, final JSONObject request)
		throws JsonRpcException
	{
		request = ((JSONObject) ((ResolveNodeRequest)mObjectMapper.convertValue(((Object) (request)), com/facebook/stetho/inspector/protocol/module/DOM$ResolveNodeRequest)));
	//    0    0:aload_0         
	//    1    1:getfield        #110 <Field ObjectMapper mObjectMapper>
	//    2    4:aload_2         
	//    3    5:ldc1            #73  <Class DOM$ResolveNodeRequest>
	//    4    7:invokevirtual   #335 <Method Object ObjectMapper.convertValue(Object, Class)>
	//    5   10:checkcast       #73  <Class DOM$ResolveNodeRequest>
	//    6   13:astore_2        
		Object obj = mDocument.postAndWait(new UncheckedCallable() {

			public Object call()
			{
				return mDocument.getElementForNodeId(request.nodeId);
			//    0    0:aload_0         
			//    1    1:getfield        #20  <Field DOM this$0>
			//    2    4:invokestatic    #32  <Method Document DOM.access$300(DOM)>
			//    3    7:aload_0         
			//    4    8:getfield        #22  <Field DOM$ResolveNodeRequest val$request>
			//    5   11:getfield        #38  <Field int DOM$ResolveNodeRequest.nodeId>
			//    6   14:invokevirtual   #44  <Method Object Document.getElementForNodeId(int)>
			//    7   17:areturn         
			}

			final DOM this$0;
			final ResolveNodeRequest val$request;

			
			{
				this$0 = DOM.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #20  <Field DOM this$0>
				request = resolvenoderequest;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #22  <Field DOM$ResolveNodeRequest val$request>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #25  <Method void Object()>
			//    8   14:return          
			}
		}
);
	//    7   14:aload_0         
	//    8   15:getfield        #120 <Field Document mDocument>
	//    9   18:new             #14  <Class DOM$4>
	//   10   21:dup             
	//   11   22:aload_0         
	//   12   23:aload_2         
	//   13   24:invokespecial   #459 <Method void DOM$4(DOM, DOM$ResolveNodeRequest)>
	//   14   27:invokevirtual   #358 <Method Object Document.postAndWait(UncheckedCallable)>
	//   15   30:astore          4
		if(obj != null)
	//*  16   32:aload           4
	//*  17   34:ifnull          112
		{
			int i = Runtime.mapObject(jsonrpcpeer, obj);
	//   18   37:aload_1         
	//   19   38:aload           4
	//   20   40:invokestatic    #465 <Method int Runtime.mapObject(JsonRpcPeer, Object)>
	//   21   43:istore_3        
			jsonrpcpeer = ((JsonRpcPeer) (new Runtime.RemoteObject()));
	//   22   44:new             #467 <Class Runtime$RemoteObject>
	//   23   47:dup             
	//   24   48:invokespecial   #468 <Method void Runtime$RemoteObject()>
	//   25   51:astore_1        
			jsonrpcpeer.type = Runtime.ObjectType.OBJECT;
	//   26   52:aload_1         
	//   27   53:getstatic       #474 <Field Runtime$ObjectType Runtime$ObjectType.OBJECT>
	//   28   56:putfield        #477 <Field Runtime$ObjectType Runtime$RemoteObject.type>
			jsonrpcpeer.subtype = Runtime.ObjectSubType.NODE;
	//   29   59:aload_1         
	//   30   60:getstatic       #483 <Field Runtime$ObjectSubType Runtime$ObjectSubType.NODE>
	//   31   63:putfield        #486 <Field Runtime$ObjectSubType Runtime$RemoteObject.subtype>
			jsonrpcpeer.className = obj.getClass().getName();
	//   32   66:aload_1         
	//   33   67:aload           4
	//   34   69:invokevirtual   #490 <Method Class Object.getClass()>
	//   35   72:invokevirtual   #495 <Method String Class.getName()>
	//   36   75:putfield        #498 <Field String Runtime$RemoteObject.className>
			jsonrpcpeer.value = null;
	//   37   78:aload_1         
	//   38   79:aconst_null     
	//   39   80:putfield        #502 <Field Object Runtime$RemoteObject.value>
			jsonrpcpeer.description = null;
	//   40   83:aload_1         
	//   41   84:aconst_null     
	//   42   85:putfield        #505 <Field String Runtime$RemoteObject.description>
			jsonrpcpeer.objectId = String.valueOf(i);
	//   43   88:aload_1         
	//   44   89:iload_3         
	//   45   90:invokestatic    #442 <Method String String.valueOf(int)>
	//   46   93:putfield        #508 <Field String Runtime$RemoteObject.objectId>
			request = ((JSONObject) (new ResolveNodeResponse()));
	//   47   96:new             #76  <Class DOM$ResolveNodeResponse>
	//   48   99:dup             
	//   49  100:aconst_null     
	//   50  101:invokespecial   #509 <Method void DOM$ResolveNodeResponse(DOM$1)>
	//   51  104:astore_2        
			request.object = ((Runtime.RemoteObject) (jsonrpcpeer));
	//   52  105:aload_2         
	//   53  106:aload_1         
	//   54  107:putfield        #513 <Field Runtime$RemoteObject DOM$ResolveNodeResponse.object>
			return ((ResolveNodeResponse) (request));
	//   55  110:aload_2         
	//   56  111:areturn         
		} else
		{
			jsonrpcpeer = ((JsonRpcPeer) (com.facebook.stetho.inspector.jsonrpc.protocol.JsonRpcError.ErrorCode.INVALID_PARAMS));
	//   57  112:getstatic       #519 <Field com.facebook.stetho.inspector.jsonrpc.protocol.JsonRpcError$ErrorCode com.facebook.stetho.inspector.jsonrpc.protocol.JsonRpcError$ErrorCode.INVALID_PARAMS>
	//   58  115:astore_1        
			StringBuilder stringbuilder = new StringBuilder();
	//   59  116:new             #376 <Class StringBuilder>
	//   60  119:dup             
	//   61  120:invokespecial   #377 <Method void StringBuilder()>
	//   62  123:astore          4
			stringbuilder.append("No known nodeId=");
	//   63  125:aload           4
	//   64  127:ldc2            #521 <String "No known nodeId=">
	//   65  130:invokevirtual   #383 <Method StringBuilder StringBuilder.append(String)>
	//   66  133:pop             
			stringbuilder.append(((ResolveNodeRequest) (request)).nodeId);
	//   67  134:aload           4
	//   68  136:aload_2         
	//   69  137:getfield        #522 <Field int DOM$ResolveNodeRequest.nodeId>
	//   70  140:invokevirtual   #525 <Method StringBuilder StringBuilder.append(int)>
	//   71  143:pop             
			throw new JsonRpcException(new JsonRpcError(((com.facebook.stetho.inspector.jsonrpc.protocol.JsonRpcError.ErrorCode) (jsonrpcpeer)), stringbuilder.toString(), ((JSONObject) (null))));
	//   72  144:new             #456 <Class JsonRpcException>
	//   73  147:dup             
	//   74  148:new             #527 <Class JsonRpcError>
	//   75  151:dup             
	//   76  152:aload_1         
	//   77  153:aload           4
	//   78  155:invokevirtual   #389 <Method String StringBuilder.toString()>
	//   79  158:aconst_null     
	//   80  159:invokespecial   #530 <Method void JsonRpcError(com.facebook.stetho.inspector.jsonrpc.protocol.JsonRpcError$ErrorCode, String, JSONObject)>
	//   81  162:invokespecial   #533 <Method void JsonRpcException(JsonRpcError)>
	//   82  165:athrow          
		}
	}

	public void setAttributesAsText(final JsonRpcPeer request, JSONObject jsonobject)
	{
		request = ((JsonRpcPeer) ((SetAttributesAsTextRequest)mObjectMapper.convertValue(((Object) (jsonobject)), com/facebook/stetho/inspector/protocol/module/DOM$SetAttributesAsTextRequest)));
	//    0    0:aload_0         
	//    1    1:getfield        #110 <Field ObjectMapper mObjectMapper>
	//    2    4:aload_2         
	//    3    5:ldc1            #79  <Class DOM$SetAttributesAsTextRequest>
	//    4    7:invokevirtual   #335 <Method Object ObjectMapper.convertValue(Object, Class)>
	//    5   10:checkcast       #79  <Class DOM$SetAttributesAsTextRequest>
	//    6   13:astore_1        
		mDocument.postAndWait(new Runnable() {

			public void run()
			{
				Object obj = mDocument.getElementForNodeId(request.nodeId);
			//    0    0:aload_0         
			//    1    1:getfield        #19  <Field DOM this$0>
			//    2    4:invokestatic    #30  <Method Document DOM.access$300(DOM)>
			//    3    7:aload_0         
			//    4    8:getfield        #21  <Field DOM$SetAttributesAsTextRequest val$request>
			//    5   11:getfield        #36  <Field int DOM$SetAttributesAsTextRequest.nodeId>
			//    6   14:invokevirtual   #42  <Method Object Document.getElementForNodeId(int)>
			//    7   17:astore_1        
				if(obj != null)
			//*   8   18:aload_1         
			//*   9   19:ifnull          40
					mDocument.setAttributesAsText(obj, request.text);
			//   10   22:aload_0         
			//   11   23:getfield        #19  <Field DOM this$0>
			//   12   26:invokestatic    #30  <Method Document DOM.access$300(DOM)>
			//   13   29:aload_1         
			//   14   30:aload_0         
			//   15   31:getfield        #21  <Field DOM$SetAttributesAsTextRequest val$request>
			//   16   34:getfield        #46  <Field String DOM$SetAttributesAsTextRequest.text>
			//   17   37:invokevirtual   #49  <Method void Document.setAttributesAsText(Object, String)>
			//   18   40:return          
			}

			final DOM this$0;
			final SetAttributesAsTextRequest val$request;

			
			{
				this$0 = DOM.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field DOM this$0>
				request = setattributesastextrequest;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field DOM$SetAttributesAsTextRequest val$request>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
		}
);
	//    7   14:aload_0         
	//    8   15:getfield        #120 <Field Document mDocument>
	//    9   18:new             #16  <Class DOM$5>
	//   10   21:dup             
	//   11   22:aload_0         
	//   12   23:aload_1         
	//   13   24:invokespecial   #538 <Method void DOM$5(DOM, DOM$SetAttributesAsTextRequest)>
	//   14   27:invokevirtual   #408 <Method void Document.postAndWait(Runnable)>
	//   15   30:return          
	}

	public void setInspectModeEnabled(final JsonRpcPeer request, JSONObject jsonobject)
	{
		request = ((JsonRpcPeer) ((SetInspectModeEnabledRequest)mObjectMapper.convertValue(((Object) (jsonobject)), com/facebook/stetho/inspector/protocol/module/DOM$SetInspectModeEnabledRequest)));
	//    0    0:aload_0         
	//    1    1:getfield        #110 <Field ObjectMapper mObjectMapper>
	//    2    4:aload_2         
	//    3    5:ldc1            #82  <Class DOM$SetInspectModeEnabledRequest>
	//    4    7:invokevirtual   #335 <Method Object ObjectMapper.convertValue(Object, Class)>
	//    5   10:checkcast       #82  <Class DOM$SetInspectModeEnabledRequest>
	//    6   13:astore_1        
		mDocument.postAndWait(new Runnable() {

			public void run()
			{
				mDocument.setInspectModeEnabled(request.enabled);
			//    0    0:aload_0         
			//    1    1:getfield        #19  <Field DOM this$0>
			//    2    4:invokestatic    #30  <Method Document DOM.access$300(DOM)>
			//    3    7:aload_0         
			//    4    8:getfield        #21  <Field DOM$SetInspectModeEnabledRequest val$request>
			//    5   11:getfield        #36  <Field boolean DOM$SetInspectModeEnabledRequest.enabled>
			//    6   14:invokevirtual   #41  <Method void Document.setInspectModeEnabled(boolean)>
			//    7   17:return          
			}

			final DOM this$0;
			final SetInspectModeEnabledRequest val$request;

			
			{
				this$0 = DOM.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field DOM this$0>
				request = setinspectmodeenabledrequest;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field DOM$SetInspectModeEnabledRequest val$request>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
		}
);
	//    7   14:aload_0         
	//    8   15:getfield        #120 <Field Document mDocument>
	//    9   18:new             #18  <Class DOM$6>
	//   10   21:dup             
	//   11   22:aload_0         
	//   12   23:aload_1         
	//   13   24:invokespecial   #542 <Method void DOM$6(DOM, DOM$SetInspectModeEnabledRequest)>
	//   14   27:invokevirtual   #408 <Method void Document.postAndWait(Runnable)>
	//   15   30:return          
	}

	private ChildNodeInsertedEvent mCachedChildNodeInsertedEvent;
	private ChildNodeRemovedEvent mCachedChildNodeRemovedEvent;
	private final Document mDocument;
	private final DocumentUpdateListener mListener = new DocumentUpdateListener();
	private final ObjectMapper mObjectMapper = new ObjectMapper();
	private final ChromePeerManager mPeerManager = new ChromePeerManager();
	private final AtomicInteger mResultCounter = new AtomicInteger(0);
	private final Map mSearchResults = Collections.synchronizedMap(((Map) (new HashMap())));


/*
	static ChromePeerManager access$1200(DOM dom)
	{
		return dom.mPeerManager;
	//    0    0:aload_0         
	//    1    1:getfield        #143 <Field ChromePeerManager mPeerManager>
	//    2    4:areturn         
	}

*/


/*
	static ChildNodeRemovedEvent access$1500(DOM dom)
	{
		return dom.acquireChildNodeRemovedEvent();
	//    0    0:aload_0         
	//    1    1:invokespecial   #162 <Method DOM$ChildNodeRemovedEvent acquireChildNodeRemovedEvent()>
	//    2    4:areturn         
	}

*/


/*
	static void access$1600(DOM dom, ChildNodeRemovedEvent childnoderemovedevent)
	{
		dom.releaseChildNodeRemovedEvent(childnoderemovedevent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #168 <Method void releaseChildNodeRemovedEvent(DOM$ChildNodeRemovedEvent)>
		return;
	//    3    5:return          
	}

*/


/*
	static ChildNodeInsertedEvent access$1700(DOM dom)
	{
		return dom.acquireChildNodeInsertedEvent();
	//    0    0:aload_0         
	//    1    1:invokespecial   #174 <Method DOM$ChildNodeInsertedEvent acquireChildNodeInsertedEvent()>
	//    2    4:areturn         
	}

*/


/*
	static void access$1800(DOM dom, ChildNodeInsertedEvent childnodeinsertedevent)
	{
		dom.releaseChildNodeInsertedEvent(childnodeinsertedevent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #180 <Method void releaseChildNodeInsertedEvent(DOM$ChildNodeInsertedEvent)>
		return;
	//    3    5:return          
	}

*/


/*
	static DocumentUpdateListener access$1900(DOM dom)
	{
		return dom.mListener;
	//    0    0:aload_0         
	//    1    1:getfield        #153 <Field DOM$DocumentUpdateListener mListener>
	//    2    4:areturn         
	}

*/


/*
	static Map access$2000(DOM dom)
	{
		return dom.mSearchResults;
	//    0    0:aload_0         
	//    1    1:getfield        #131 <Field Map mSearchResults>
	//    2    4:areturn         
	}

*/


/*
	static Document access$300(DOM dom)
	{
		return dom.mDocument;
	//    0    0:aload_0         
	//    1    1:getfield        #120 <Field Document mDocument>
	//    2    4:areturn         
	}

*/


/*
	static Node access$400(DOM dom, Object obj, DocumentView documentview, Accumulator accumulator)
	{
		return dom.createNodeForElement(obj, documentview, accumulator);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #192 <Method DOM$Node createNodeForElement(Object, DocumentView, Accumulator)>
	//    5    7:areturn         
	}

*/
}
