// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.JsonStreamContext;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.JsonNode;
import java.util.Iterator;

// Referenced classes of package com.fasterxml.jackson.databind.node:
//			NodeCursor, ContainerNode

protected static final class NodeCursor$ArrayCursor extends NodeCursor
{

	public boolean currentHasChildren()
	{
		return ((ContainerNode)currentNode()).size() > 0;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #30  <Method JsonNode currentNode()>
	//    2    4:checkcast       #32  <Class ContainerNode>
	//    3    7:invokevirtual   #36  <Method int ContainerNode.size()>
	//    4   10:ifle            15
	//    5   13:iconst_1        
	//    6   14:ireturn         
	//    7   15:iconst_0        
	//    8   16:ireturn         
	}

	public JsonNode currentNode()
	{
		return _currentNode;
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field JsonNode _currentNode>
	//    2    4:areturn         
	}

	public JsonToken endToken()
	{
		return JsonToken.END_ARRAY;
	//    0    0:getstatic       #46  <Field JsonToken JsonToken.END_ARRAY>
	//    1    3:areturn         
	}

	public volatile JsonStreamContext getParent()
	{
		return ((JsonStreamContext) (super.getParent()));
	//    0    0:aload_0         
	//    1    1:invokespecial   #51  <Method NodeCursor NodeCursor.getParent()>
	//    2    4:areturn         
	}

	public JsonToken nextToken()
	{
		if(!_contents.hasNext())
	//*   0    0:aload_0         
	//*   1    1:getfield        #23  <Field Iterator _contents>
	//*   2    4:invokeinterface #57  <Method boolean Iterator.hasNext()>
	//*   3    9:ifne            19
		{
			_currentNode = null;
	//    4   12:aload_0         
	//    5   13:aconst_null     
	//    6   14:putfield        #38  <Field JsonNode _currentNode>
			return null;
	//    7   17:aconst_null     
	//    8   18:areturn         
		} else
		{
			_currentNode = (JsonNode)_contents.next();
	//    9   19:aload_0         
	//   10   20:aload_0         
	//   11   21:getfield        #23  <Field Iterator _contents>
	//   12   24:invokeinterface #61  <Method Object Iterator.next()>
	//   13   29:checkcast       #17  <Class JsonNode>
	//   14   32:putfield        #38  <Field JsonNode _currentNode>
			return _currentNode.asToken();
	//   15   35:aload_0         
	//   16   36:getfield        #38  <Field JsonNode _currentNode>
	//   17   39:invokevirtual   #64  <Method JsonToken JsonNode.asToken()>
	//   18   42:areturn         
		}
	}

	protected Iterator _contents;
	protected JsonNode _currentNode;

	public NodeCursor$ArrayCursor(JsonNode jsonnode, NodeCursor nodecursor)
	{
		super(1, nodecursor);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:aload_2         
	//    3    3:invokespecial   #15  <Method void NodeCursor(int, NodeCursor)>
		_contents = jsonnode.elements();
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:invokevirtual   #21  <Method Iterator JsonNode.elements()>
	//    7   11:putfield        #23  <Field Iterator _contents>
	//    8   14:return          
	}
}
