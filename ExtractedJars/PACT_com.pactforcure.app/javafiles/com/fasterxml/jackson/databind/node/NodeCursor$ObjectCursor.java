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
		if(_current == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #43  <Field java.util.Map$Entry _current>
	//*   2    4:ifnonnull       9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		else
			return (JsonNode)_current.getValue();
	//    5    9:aload_0         
	//    6   10:getfield        #43  <Field java.util.Map$Entry _current>
	//    7   13:invokeinterface #49  <Method Object java.util.Map$Entry.getValue()>
	//    8   18:checkcast       #51  <Class JsonNode>
	//    9   21:areturn         
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
	//*   2    4:ifeq            86
		{
			if(!_contents.hasNext())
	//*   3    7:aload_0         
	//*   4    8:getfield        #26  <Field Iterator _contents>
	//*   5   11:invokeinterface #70  <Method boolean Iterator.hasNext()>
	//*   6   16:ifne            31
			{
				_currentName = null;
	//    7   19:aload_0         
	//    8   20:aconst_null     
	//    9   21:putfield        #74  <Field String _currentName>
				_current = null;
	//   10   24:aload_0         
	//   11   25:aconst_null     
	//   12   26:putfield        #43  <Field java.util.Map$Entry _current>
				return null;
	//   13   29:aconst_null     
	//   14   30:areturn         
			}
			_needEntry = false;
	//   15   31:aload_0         
	//   16   32:iconst_0        
	//   17   33:putfield        #28  <Field boolean _needEntry>
			_current = (java.util.Map.Entry)_contents.next();
	//   18   36:aload_0         
	//   19   37:aload_0         
	//   20   38:getfield        #26  <Field Iterator _contents>
	//   21   41:invokeinterface #77  <Method Object Iterator.next()>
	//   22   46:checkcast       #45  <Class java.util.Map$Entry>
	//   23   49:putfield        #43  <Field java.util.Map$Entry _current>
			String s;
			if(_current == null)
	//*  24   52:aload_0         
	//*  25   53:getfield        #43  <Field java.util.Map$Entry _current>
	//*  26   56:ifnonnull       70
				s = null;
	//   27   59:aconst_null     
	//   28   60:astore_1        
			else
	//*  29   61:aload_0         
	//*  30   62:aload_1         
	//*  31   63:putfield        #74  <Field String _currentName>
	//*  32   66:getstatic       #80  <Field JsonToken JsonToken.FIELD_NAME>
	//*  33   69:areturn         
				s = (String)_current.getKey();
	//   34   70:aload_0         
	//   35   71:getfield        #43  <Field java.util.Map$Entry _current>
	//   36   74:invokeinterface #83  <Method Object java.util.Map$Entry.getKey()>
	//   37   79:checkcast       #85  <Class String>
	//   38   82:astore_1        
			_currentName = s;
			return JsonToken.FIELD_NAME;
		} else
	//*  39   83:goto            61
		{
			_needEntry = true;
	//   40   86:aload_0         
	//   41   87:iconst_1        
	//   42   88:putfield        #28  <Field boolean _needEntry>
			return ((JsonNode)_current.getValue()).asToken();
	//   43   91:aload_0         
	//   44   92:getfield        #43  <Field java.util.Map$Entry _current>
	//   45   95:invokeinterface #49  <Method Object java.util.Map$Entry.getValue()>
	//   46  100:checkcast       #51  <Class JsonNode>
	//   47  103:invokevirtual   #88  <Method JsonToken JsonNode.asToken()>
	//   48  106:areturn         
		}
	}

	public JsonToken nextValue()
	{
		JsonToken jsontoken1 = nextToken();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #91  <Method JsonToken nextToken()>
	//    2    4:astore_2        
		JsonToken jsontoken = jsontoken1;
	//    3    5:aload_2         
	//    4    6:astore_1        
		if(jsontoken1 == JsonToken.FIELD_NAME)
	//*   5    7:aload_2         
	//*   6    8:getstatic       #80  <Field JsonToken JsonToken.FIELD_NAME>
	//*   7   11:if_acmpne       19
			jsontoken = nextToken();
	//    8   14:aload_0         
	//    9   15:invokevirtual   #91  <Method JsonToken nextToken()>
	//   10   18:astore_1        
		return jsontoken;
	//   11   19:aload_1         
	//   12   20:areturn         
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
