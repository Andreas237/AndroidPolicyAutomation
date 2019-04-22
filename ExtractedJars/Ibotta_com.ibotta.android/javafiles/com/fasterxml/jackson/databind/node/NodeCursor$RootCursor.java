// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.JsonStreamContext;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.JsonNode;

// Referenced classes of package com.fasterxml.jackson.databind.node:
//			NodeCursor

protected static final class NodeCursor$RootCursor extends NodeCursor
{

	public boolean currentHasChildren()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public JsonNode currentNode()
	{
		return _node;
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field JsonNode _node>
	//    2    4:areturn         
	}

	public JsonToken endToken()
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public volatile JsonStreamContext getParent()
	{
		return ((JsonStreamContext) (super.getParent()));
	//    0    0:aload_0         
	//    1    1:invokespecial   #30  <Method NodeCursor NodeCursor.getParent()>
	//    2    4:areturn         
	}

	public JsonToken nextToken()
	{
		if(!_done)
	//*   0    0:aload_0         
	//*   1    1:getfield        #16  <Field boolean _done>
	//*   2    4:ifne            20
		{
			_done = true;
	//    3    7:aload_0         
	//    4    8:iconst_1        
	//    5    9:putfield        #16  <Field boolean _done>
			return _node.asToken();
	//    6   12:aload_0         
	//    7   13:getfield        #18  <Field JsonNode _node>
	//    8   16:invokevirtual   #36  <Method JsonToken JsonNode.asToken()>
	//    9   19:areturn         
		} else
		{
			_node = null;
	//   10   20:aload_0         
	//   11   21:aconst_null     
	//   12   22:putfield        #18  <Field JsonNode _node>
			return null;
	//   13   25:aconst_null     
	//   14   26:areturn         
		}
	}

	protected boolean _done;
	protected JsonNode _node;

	public NodeCursor$RootCursor(JsonNode jsonnode, NodeCursor nodecursor)
	{
		super(0, nodecursor);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:aload_2         
	//    3    3:invokespecial   #14  <Method void NodeCursor(int, NodeCursor)>
		_done = false;
	//    4    6:aload_0         
	//    5    7:iconst_0        
	//    6    8:putfield        #16  <Field boolean _done>
		_node = jsonnode;
	//    7   11:aload_0         
	//    8   12:aload_1         
	//    9   13:putfield        #18  <Field JsonNode _node>
	//   10   16:return          
	}
}
