// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.JsonStreamContext;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.JsonNode;
import java.util.Iterator;

// Referenced classes of package com.fasterxml.jackson.databind.node:
//			NodeCursor, ObjectNode, ContainerNode

protected static final class NodeCursor$ObjectCursor extends NodeCursor
{

	public boolean currentHasChildren()
	{
		return ((ContainerNode)currentNode()).size() > 0;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #35  <Method JsonNode currentNode()>
	//    2    4:checkcast       #37  <Class ContainerNode>
	//    3    7:invokevirtual   #41  <Method int ContainerNode.size()>
	//    4   10:ifle            15
	//    5   13:iconst_1        
	//    6   14:ireturn         
	//    7   15:iconst_0        
	//    8   16:ireturn         
	}

	public JsonNode currentNode()
	{
		java.util.Map.Entry entry = _current;
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field java.util.Map$Entry _current>
	//    2    4:astore_1        
		if(entry == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       11
			return null;
	//    5    9:aconst_null     
	//    6   10:areturn         
		else
			return (JsonNode)entry.getValue();
	//    7   11:aload_1         
	//    8   12:invokeinterface #49  <Method Object java.util.Map$Entry.getValue()>
	//    9   17:checkcast       #51  <Class JsonNode>
	//   10   20:areturn         
	}

	public JsonToken endToken()
	{
		return JsonToken.END_OBJECT;
	//    0    0:getstatic       #59  <Field JsonToken JsonToken.END_OBJECT>
	//    1    3:areturn         
	}

	public volatile JsonStreamContext getParent()
	{
		return ((JsonStreamContext) (super.getParent()));
	//    0    0:aload_0         
	//    1    1:invokespecial   #64  <Method NodeCursor NodeCursor.getParent()>
	//    2    4:areturn         
	}

	public JsonToken nextToken()
	{
		if(_needEntry)
	//*   0    0:aload_0         
	//*   1    1:getfield        #28  <Field boolean _needEntry>
	//*   2    4:ifeq            87
		{
			boolean flag = _contents.hasNext();
	//    3    7:aload_0         
	//    4    8:getfield        #26  <Field Iterator _contents>
	//    5   11:invokeinterface #70  <Method boolean Iterator.hasNext()>
	//    6   16:istore_1        
			String s = null;
	//    7   17:aconst_null     
	//    8   18:astore_2        
			if(!flag)
	//*   9   19:iload_1         
	//*  10   20:ifne            35
			{
				_currentName = null;
	//   11   23:aload_0         
	//   12   24:aconst_null     
	//   13   25:putfield        #74  <Field String _currentName>
				_current = null;
	//   14   28:aload_0         
	//   15   29:aconst_null     
	//   16   30:putfield        #43  <Field java.util.Map$Entry _current>
				return null;
	//   17   33:aconst_null     
	//   18   34:areturn         
			}
			_needEntry = false;
	//   19   35:aload_0         
	//   20   36:iconst_0        
	//   21   37:putfield        #28  <Field boolean _needEntry>
			_current = (java.util.Map.Entry)_contents.next();
	//   22   40:aload_0         
	//   23   41:aload_0         
	//   24   42:getfield        #26  <Field Iterator _contents>
	//   25   45:invokeinterface #77  <Method Object Iterator.next()>
	//   26   50:checkcast       #45  <Class java.util.Map$Entry>
	//   27   53:putfield        #43  <Field java.util.Map$Entry _current>
			java.util.Map.Entry entry = _current;
	//   28   56:aload_0         
	//   29   57:getfield        #43  <Field java.util.Map$Entry _current>
	//   30   60:astore_3        
			if(entry != null)
	//*  31   61:aload_3         
	//*  32   62:ifnonnull       68
	//*  33   65:goto            78
				s = (String)entry.getKey();
	//   34   68:aload_3         
	//   35   69:invokeinterface #80  <Method Object java.util.Map$Entry.getKey()>
	//   36   74:checkcast       #82  <Class String>
	//   37   77:astore_2        
			_currentName = s;
	//   38   78:aload_0         
	//   39   79:aload_2         
	//   40   80:putfield        #74  <Field String _currentName>
			return JsonToken.FIELD_NAME;
	//   41   83:getstatic       #85  <Field JsonToken JsonToken.FIELD_NAME>
	//   42   86:areturn         
		} else
		{
			_needEntry = true;
	//   43   87:aload_0         
	//   44   88:iconst_1        
	//   45   89:putfield        #28  <Field boolean _needEntry>
			return ((JsonNode)_current.getValue()).asToken();
	//   46   92:aload_0         
	//   47   93:getfield        #43  <Field java.util.Map$Entry _current>
	//   48   96:invokeinterface #49  <Method Object java.util.Map$Entry.getValue()>
	//   49  101:checkcast       #51  <Class JsonNode>
	//   50  104:invokevirtual   #88  <Method JsonToken JsonNode.asToken()>
	//   51  107:areturn         
		}
	}

	protected Iterator _contents;
	protected java.util.Map.Entry _current;
	protected boolean _needEntry;

	public NodeCursor$ObjectCursor(JsonNode jsonnode, NodeCursor nodecursor)
	{
		super(2, nodecursor);
	//    0    0:aload_0         
	//    1    1:iconst_2        
	//    2    2:aload_2         
	//    3    3:invokespecial   #18  <Method void NodeCursor(int, NodeCursor)>
		_contents = ((ObjectNode)jsonnode).fields();
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:checkcast       #20  <Class ObjectNode>
	//    7   11:invokevirtual   #24  <Method Iterator ObjectNode.fields()>
	//    8   14:putfield        #26  <Field Iterator _contents>
		_needEntry = true;
	//    9   17:aload_0         
	//   10   18:iconst_1        
	//   11   19:putfield        #28  <Field boolean _needEntry>
	//   12   22:return          
	}
}
