// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.JsonStreamContext;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.JsonNode;
import java.util.Iterator;

// Referenced classes of package com.fasterxml.jackson.databind.node:
//			ContainerNode, ObjectNode

abstract class NodeCursor extends JsonStreamContext
{
	protected static final class ArrayCursor extends NodeCursor
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
			return ((JsonStreamContext) (getParent()));
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

		public JsonToken nextValue()
		{
			return nextToken();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #67  <Method JsonToken nextToken()>
		//    2    4:areturn         
		}

		protected Iterator _contents;
		protected JsonNode _currentNode;

		public ArrayCursor(JsonNode jsonnode, NodeCursor nodecursor)
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

	protected static final class ObjectCursor extends NodeCursor
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
			return ((JsonStreamContext) (getParent()));
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

		public ObjectCursor(JsonNode jsonnode, NodeCursor nodecursor)
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

	protected static final class RootCursor extends NodeCursor
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
			return ((JsonStreamContext) (getParent()));
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

		public JsonToken nextValue()
		{
			return nextToken();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #39  <Method JsonToken nextToken()>
		//    2    4:areturn         
		}

		public void overrideCurrentName(String s)
		{
		//    0    0:return          
		}

		protected boolean _done;
		protected JsonNode _node;

		public RootCursor(JsonNode jsonnode, NodeCursor nodecursor)
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


	public NodeCursor(int i, NodeCursor nodecursor)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void JsonStreamContext()>
		_type = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #28  <Field int _type>
		_index = -1;
	//    5    9:aload_0         
	//    6   10:iconst_m1       
	//    7   11:putfield        #31  <Field int _index>
		_parent = nodecursor;
	//    8   14:aload_0         
	//    9   15:aload_2         
	//   10   16:putfield        #33  <Field NodeCursor _parent>
	//   11   19:return          
	}

	public abstract boolean currentHasChildren();

	public abstract JsonNode currentNode();

	public abstract JsonToken endToken();

	public final String getCurrentName()
	{
		return _currentName;
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field String _currentName>
	//    2    4:areturn         
	}

	public Object getCurrentValue()
	{
		return _currentValue;
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field Object _currentValue>
	//    2    4:areturn         
	}

	public volatile JsonStreamContext getParent()
	{
		return ((JsonStreamContext) (getParent()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #53  <Method NodeCursor getParent()>
	//    2    4:areturn         
	}

	public final NodeCursor getParent()
	{
		return _parent;
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field NodeCursor _parent>
	//    2    4:areturn         
	}

	public final NodeCursor iterateChildren()
	{
		JsonNode jsonnode = currentNode();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #56  <Method JsonNode currentNode()>
	//    2    4:astore_1        
		if(jsonnode == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       19
			throw new IllegalStateException("No current node");
	//    5    9:new             #58  <Class IllegalStateException>
	//    6   12:dup             
	//    7   13:ldc1            #60  <String "No current node">
	//    8   15:invokespecial   #63  <Method void IllegalStateException(String)>
	//    9   18:athrow          
		if(jsonnode.isArray())
	//*  10   19:aload_1         
	//*  11   20:invokevirtual   #68  <Method boolean JsonNode.isArray()>
	//*  12   23:ifeq            36
			return ((NodeCursor) (new ArrayCursor(jsonnode, this)));
	//   13   26:new             #6   <Class NodeCursor$ArrayCursor>
	//   14   29:dup             
	//   15   30:aload_1         
	//   16   31:aload_0         
	//   17   32:invokespecial   #71  <Method void NodeCursor$ArrayCursor(JsonNode, NodeCursor)>
	//   18   35:areturn         
		if(jsonnode.isObject())
	//*  19   36:aload_1         
	//*  20   37:invokevirtual   #74  <Method boolean JsonNode.isObject()>
	//*  21   40:ifeq            53
			return ((NodeCursor) (new ObjectCursor(jsonnode, this)));
	//   22   43:new             #9   <Class NodeCursor$ObjectCursor>
	//   23   46:dup             
	//   24   47:aload_1         
	//   25   48:aload_0         
	//   26   49:invokespecial   #75  <Method void NodeCursor$ObjectCursor(JsonNode, NodeCursor)>
	//   27   52:areturn         
		else
			throw new IllegalStateException((new StringBuilder()).append("Current node of type ").append(((Object) (jsonnode)).getClass().getName()).toString());
	//   28   53:new             #58  <Class IllegalStateException>
	//   29   56:dup             
	//   30   57:new             #77  <Class StringBuilder>
	//   31   60:dup             
	//   32   61:invokespecial   #78  <Method void StringBuilder()>
	//   33   64:ldc1            #80  <String "Current node of type ">
	//   34   66:invokevirtual   #84  <Method StringBuilder StringBuilder.append(String)>
	//   35   69:aload_1         
	//   36   70:invokevirtual   #90  <Method Class Object.getClass()>
	//   37   73:invokevirtual   #95  <Method String Class.getName()>
	//   38   76:invokevirtual   #84  <Method StringBuilder StringBuilder.append(String)>
	//   39   79:invokevirtual   #98  <Method String StringBuilder.toString()>
	//   40   82:invokespecial   #63  <Method void IllegalStateException(String)>
	//   41   85:athrow          
	}

	public abstract JsonToken nextToken();

	public abstract JsonToken nextValue();

	public void overrideCurrentName(String s)
	{
		_currentName = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #44  <Field String _currentName>
	//    3    5:return          
	}

	public void setCurrentValue(Object obj)
	{
		_currentValue = obj;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #48  <Field Object _currentValue>
	//    3    5:return          
	}

	protected String _currentName;
	protected Object _currentValue;
	protected final NodeCursor _parent;
}
