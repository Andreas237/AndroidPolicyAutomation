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
		if(jsonnode != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          82
		{
			if(jsonnode.isArray())
	//*   5    9:aload_1         
	//*   6   10:invokevirtual   #61  <Method boolean JsonNode.isArray()>
	//*   7   13:ifeq            26
				return ((NodeCursor) (new ArrayCursor(jsonnode, this)));
	//    8   16:new             #6   <Class NodeCursor$ArrayCursor>
	//    9   19:dup             
	//   10   20:aload_1         
	//   11   21:aload_0         
	//   12   22:invokespecial   #64  <Method void NodeCursor$ArrayCursor(JsonNode, NodeCursor)>
	//   13   25:areturn         
			if(jsonnode.isObject())
	//*  14   26:aload_1         
	//*  15   27:invokevirtual   #67  <Method boolean JsonNode.isObject()>
	//*  16   30:ifeq            43
			{
				return ((NodeCursor) (new ObjectCursor(jsonnode, this)));
	//   17   33:new             #9   <Class NodeCursor$ObjectCursor>
	//   18   36:dup             
	//   19   37:aload_1         
	//   20   38:aload_0         
	//   21   39:invokespecial   #68  <Method void NodeCursor$ObjectCursor(JsonNode, NodeCursor)>
	//   22   42:areturn         
			} else
			{
				StringBuilder stringbuilder = new StringBuilder();
	//   23   43:new             #70  <Class StringBuilder>
	//   24   46:dup             
	//   25   47:invokespecial   #71  <Method void StringBuilder()>
	//   26   50:astore_2        
				stringbuilder.append("Current node of type ");
	//   27   51:aload_2         
	//   28   52:ldc1            #73  <String "Current node of type ">
	//   29   54:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
	//   30   57:pop             
				stringbuilder.append(((Object) (jsonnode)).getClass().getName());
	//   31   58:aload_2         
	//   32   59:aload_1         
	//   33   60:invokevirtual   #83  <Method Class Object.getClass()>
	//   34   63:invokevirtual   #88  <Method String Class.getName()>
	//   35   66:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
	//   36   69:pop             
				throw new IllegalStateException(stringbuilder.toString());
	//   37   70:new             #90  <Class IllegalStateException>
	//   38   73:dup             
	//   39   74:aload_2         
	//   40   75:invokevirtual   #93  <Method String StringBuilder.toString()>
	//   41   78:invokespecial   #96  <Method void IllegalStateException(String)>
	//   42   81:athrow          
			}
		} else
		{
			throw new IllegalStateException("No current node");
	//   43   82:new             #90  <Class IllegalStateException>
	//   44   85:dup             
	//   45   86:ldc1            #98  <String "No current node">
	//   46   88:invokespecial   #96  <Method void IllegalStateException(String)>
	//   47   91:athrow          
		}
	}

	public abstract JsonToken nextToken();

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
