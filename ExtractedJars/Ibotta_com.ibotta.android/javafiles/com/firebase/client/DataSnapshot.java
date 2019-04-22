// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.firebase.client.core.Path;
import com.firebase.client.snapshot.ChildKey;
import com.firebase.client.snapshot.IndexedNode;
import com.firebase.client.snapshot.NamedNode;
import com.firebase.client.snapshot.Node;
import com.firebase.client.utilities.Validation;
import com.firebase.client.utilities.encoding.JsonHelpers;
import java.io.IOException;
import java.util.Iterator;

// Referenced classes of package com.firebase.client:
//			Firebase, FirebaseException, GenericTypeIndicator

public class DataSnapshot
{

	public DataSnapshot(Firebase firebase, IndexedNode indexednode)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		node = indexednode;
	//    2    4:aload_0         
	//    3    5:aload_2         
	//    4    6:putfield        #19  <Field IndexedNode node>
		query = firebase;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #21  <Field Firebase query>
	//    8   14:return          
	}

	public DataSnapshot child(String s)
	{
		return new DataSnapshot(query.child(s), IndexedNode.from(node.getNode().getChild(new Path(s))));
	//    0    0:new             #2   <Class DataSnapshot>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #21  <Field Firebase query>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #31  <Method Firebase Firebase.child(String)>
	//    6   12:aload_0         
	//    7   13:getfield        #19  <Field IndexedNode node>
	//    8   16:invokevirtual   #37  <Method Node IndexedNode.getNode()>
	//    9   19:new             #39  <Class Path>
	//   10   22:dup             
	//   11   23:aload_1         
	//   12   24:invokespecial   #42  <Method void Path(String)>
	//   13   27:invokeinterface #48  <Method Node Node.getChild(Path)>
	//   14   32:invokestatic    #52  <Method IndexedNode IndexedNode.from(Node)>
	//   15   35:invokespecial   #54  <Method void DataSnapshot(Firebase, IndexedNode)>
	//   16   38:areturn         
	}

	public boolean exists()
	{
		return node.getNode().isEmpty() ^ true;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field IndexedNode node>
	//    2    4:invokevirtual   #37  <Method Node IndexedNode.getNode()>
	//    3    7:invokeinterface #59  <Method boolean Node.isEmpty()>
	//    4   12:iconst_1        
	//    5   13:ixor            
	//    6   14:ireturn         
	}

	public Iterable getChildren()
	{
		return new Iterable() {

			public Iterator iterator()
			{
				return new Iterator() {

					public boolean hasNext()
					{
						return iter.hasNext();
					//    0    0:aload_0         
					//    1    1:getfield        #18  <Field DataSnapshot$1 this$1>
					//    2    4:getfield        #28  <Field Iterator DataSnapshot$1.val$iter>
					//    3    7:invokeinterface #30  <Method boolean Iterator.hasNext()>
					//    4   12:ireturn         
					}

					public DataSnapshot next()
					{
						NamedNode namednode = (NamedNode)iter.next();
					//    0    0:aload_0         
					//    1    1:getfield        #18  <Field DataSnapshot$1 this$1>
					//    2    4:getfield        #28  <Field Iterator DataSnapshot$1.val$iter>
					//    3    7:invokeinterface #35  <Method Object Iterator.next()>
					//    4   12:checkcast       #37  <Class NamedNode>
					//    5   15:astore_1        
						return new DataSnapshot(query.child(namednode.getName().asString()), IndexedNode.from(namednode.getNode()));
					//    6   16:new             #39  <Class DataSnapshot>
					//    7   19:dup             
					//    8   20:aload_0         
					//    9   21:getfield        #18  <Field DataSnapshot$1 this$1>
					//   10   24:getfield        #43  <Field DataSnapshot DataSnapshot$1.this$0>
					//   11   27:invokestatic    #47  <Method Firebase DataSnapshot.access$000(DataSnapshot)>
					//   12   30:aload_1         
					//   13   31:invokevirtual   #51  <Method ChildKey NamedNode.getName()>
					//   14   34:invokevirtual   #57  <Method String ChildKey.asString()>
					//   15   37:invokevirtual   #63  <Method Firebase Firebase.child(String)>
					//   16   40:aload_1         
					//   17   41:invokevirtual   #67  <Method Node NamedNode.getNode()>
					//   18   44:invokestatic    #73  <Method IndexedNode IndexedNode.from(Node)>
					//   19   47:invokespecial   #76  <Method void DataSnapshot(Firebase, IndexedNode)>
					//   20   50:areturn         
					}

					public volatile Object next()
					{
						return ((Object) (next()));
					//    0    0:aload_0         
					//    1    1:invokevirtual   #78  <Method DataSnapshot next()>
					//    2    4:areturn         
					}

					public void remove()
					{
						throw new UnsupportedOperationException("remove called on immutable collection");
					//    0    0:new             #81  <Class UnsupportedOperationException>
					//    1    3:dup             
					//    2    4:ldc1            #83  <String "remove called on immutable collection">
					//    3    6:invokespecial   #86  <Method void UnsupportedOperationException(String)>
					//    4    9:athrow          
					}

					final _cls1 this$1;

			
			{
				this$1 = _cls1.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field DataSnapshot$1 this$1>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #21  <Method void Object()>
			//    5    9:return          
			}
				}
;
			//    0    0:new             #14  <Class DataSnapshot$1$1>
			//    1    3:dup             
			//    2    4:aload_0         
			//    3    5:invokespecial   #33  <Method void DataSnapshot$1$1(DataSnapshot$1)>
			//    4    8:areturn         
			}

			final DataSnapshot this$0;
			final Iterator val$iter;

			
			{
				this$0 = DataSnapshot.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #22  <Field DataSnapshot this$0>
				iter = iterator1;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #24  <Field Iterator val$iter>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #27  <Method void Object()>
			//    8   14:return          
			}
		}
;
	//    0    0:new             #6   <Class DataSnapshot$1>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:getfield        #19  <Field IndexedNode node>
	//    5    9:invokevirtual   #65  <Method Iterator IndexedNode.iterator()>
	//    6   12:invokespecial   #68  <Method void DataSnapshot$1(DataSnapshot, Iterator)>
	//    7   15:areturn         
	}

	public long getChildrenCount()
	{
		return (long)node.getNode().getChildCount();
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field IndexedNode node>
	//    2    4:invokevirtual   #37  <Method Node IndexedNode.getNode()>
	//    3    7:invokeinterface #76  <Method int Node.getChildCount()>
	//    4   12:i2l             
	//    5   13:lreturn         
	}

	public String getKey()
	{
		return query.getKey();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field Firebase query>
	//    2    4:invokevirtual   #80  <Method String Firebase.getKey()>
	//    3    7:areturn         
	}

	public Object getPriority()
	{
		Object obj = node.getNode().getPriority().getValue();
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field IndexedNode node>
	//    2    4:invokevirtual   #37  <Method Node IndexedNode.getNode()>
	//    3    7:invokeinterface #84  <Method Node Node.getPriority()>
	//    4   12:invokeinterface #87  <Method Object Node.getValue()>
	//    5   17:astore_1        
		if(obj instanceof Long)
	//*   6   18:aload_1         
	//*   7   19:instanceof      #89  <Class Long>
	//*   8   22:ifeq            37
			return ((Object) (Double.valueOf(((Long)obj).longValue())));
	//    9   25:aload_1         
	//   10   26:checkcast       #89  <Class Long>
	//   11   29:invokevirtual   #92  <Method long Long.longValue()>
	//   12   32:l2d             
	//   13   33:invokestatic    #98  <Method Double Double.valueOf(double)>
	//   14   36:areturn         
		else
			return obj;
	//   15   37:aload_1         
	//   16   38:areturn         
	}

	public Firebase getRef()
	{
		return query;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field Firebase query>
	//    2    4:areturn         
	}

	public Object getValue()
	{
		return node.getNode().getValue();
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field IndexedNode node>
	//    2    4:invokevirtual   #37  <Method Node IndexedNode.getNode()>
	//    3    7:invokeinterface #87  <Method Object Node.getValue()>
	//    4   12:areturn         
	}

	public Object getValue(GenericTypeIndicator generictypeindicator)
	{
		Object obj = node.getNode().getValue();
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field IndexedNode node>
	//    2    4:invokevirtual   #37  <Method Node IndexedNode.getNode()>
	//    3    7:invokeinterface #87  <Method Object Node.getValue()>
	//    4   12:astore_2        
		try
		{
			obj = ((Object) (JsonHelpers.getMapper().writeValueAsString(obj)));
	//    5   13:invokestatic    #109 <Method ObjectMapper JsonHelpers.getMapper()>
	//    6   16:aload_2         
	//    7   17:invokevirtual   #115 <Method String ObjectMapper.writeValueAsString(Object)>
	//    8   20:astore_2        
			generictypeindicator = ((GenericTypeIndicator) (JsonHelpers.getMapper().readValue(((String) (obj)), ((com.fasterxml.jackson.core.type.TypeReference) (generictypeindicator)))));
	//    9   21:invokestatic    #109 <Method ObjectMapper JsonHelpers.getMapper()>
	//   10   24:aload_2         
	//   11   25:aload_1         
	//   12   26:invokevirtual   #119 <Method Object ObjectMapper.readValue(String, com.fasterxml.jackson.core.type.TypeReference)>
	//   13   29:astore_1        
		}
	//*  14   30:aload_1         
	//*  15   31:areturn         
		// Misplaced declaration of an exception variable
		catch(GenericTypeIndicator generictypeindicator)
	//*  16   32:astore_1        
		{
			throw new FirebaseException("Failed to bounce to type", ((Throwable) (generictypeindicator)));
	//   17   33:new             #121 <Class FirebaseException>
	//   18   36:dup             
	//   19   37:ldc1            #123 <String "Failed to bounce to type">
	//   20   39:aload_1         
	//   21   40:invokespecial   #126 <Method void FirebaseException(String, Throwable)>
	//   22   43:athrow          
		}
		return ((Object) (generictypeindicator));
	}

	public Object getValue(Class class1)
	{
		Object obj = node.getNode().getValue();
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field IndexedNode node>
	//    2    4:invokevirtual   #37  <Method Node IndexedNode.getNode()>
	//    3    7:invokeinterface #87  <Method Object Node.getValue()>
	//    4   12:astore_2        
		try
		{
			obj = ((Object) (JsonHelpers.getMapper().writeValueAsString(obj)));
	//    5   13:invokestatic    #109 <Method ObjectMapper JsonHelpers.getMapper()>
	//    6   16:aload_2         
	//    7   17:invokevirtual   #115 <Method String ObjectMapper.writeValueAsString(Object)>
	//    8   20:astore_2        
			class1 = ((Class) (JsonHelpers.getMapper().readValue(((String) (obj)), class1)));
	//    9   21:invokestatic    #109 <Method ObjectMapper JsonHelpers.getMapper()>
	//   10   24:aload_2         
	//   11   25:aload_1         
	//   12   26:invokevirtual   #131 <Method Object ObjectMapper.readValue(String, Class)>
	//   13   29:astore_1        
		}
	//*  14   30:aload_1         
	//*  15   31:areturn         
		// Misplaced declaration of an exception variable
		catch(Class class1)
	//*  16   32:astore_1        
		{
			throw new FirebaseException("Failed to bounce to type", ((Throwable) (class1)));
	//   17   33:new             #121 <Class FirebaseException>
	//   18   36:dup             
	//   19   37:ldc1            #123 <String "Failed to bounce to type">
	//   20   39:aload_1         
	//   21   40:invokespecial   #126 <Method void FirebaseException(String, Throwable)>
	//   22   43:athrow          
		}
		return ((Object) (class1));
	}

	public Object getValue(boolean flag)
	{
		return node.getNode().getValue(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field IndexedNode node>
	//    2    4:invokevirtual   #37  <Method Node IndexedNode.getNode()>
	//    3    7:iload_1         
	//    4    8:invokeinterface #135 <Method Object Node.getValue(boolean)>
	//    5   13:areturn         
	}

	public boolean hasChild(String s)
	{
		if(query.getParent() == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #21  <Field Firebase query>
	//*   2    4:invokevirtual   #140 <Method Firebase Firebase.getParent()>
	//*   3    7:ifnonnull       17
			Validation.validateRootPathString(s);
	//    4   10:aload_1         
	//    5   11:invokestatic    #145 <Method void Validation.validateRootPathString(String)>
		else
	//*   6   14:goto            21
			Validation.validatePathString(s);
	//    7   17:aload_1         
	//    8   18:invokestatic    #148 <Method void Validation.validatePathString(String)>
		return node.getNode().getChild(new Path(s)).isEmpty() ^ true;
	//    9   21:aload_0         
	//   10   22:getfield        #19  <Field IndexedNode node>
	//   11   25:invokevirtual   #37  <Method Node IndexedNode.getNode()>
	//   12   28:new             #39  <Class Path>
	//   13   31:dup             
	//   14   32:aload_1         
	//   15   33:invokespecial   #42  <Method void Path(String)>
	//   16   36:invokeinterface #48  <Method Node Node.getChild(Path)>
	//   17   41:invokeinterface #59  <Method boolean Node.isEmpty()>
	//   18   46:iconst_1        
	//   19   47:ixor            
	//   20   48:ireturn         
	}

	public boolean hasChildren()
	{
		return node.getNode().getChildCount() > 0;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field IndexedNode node>
	//    2    4:invokevirtual   #37  <Method Node IndexedNode.getNode()>
	//    3    7:invokeinterface #76  <Method int Node.getChildCount()>
	//    4   12:ifle            17
	//    5   15:iconst_1        
	//    6   16:ireturn         
	//    7   17:iconst_0        
	//    8   18:ireturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #152 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #153 <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("DataSnapshot { key = ");
	//    4    8:aload_1         
	//    5    9:ldc1            #155 <String "DataSnapshot { key = ">
	//    6   11:invokevirtual   #159 <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(query.getKey());
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:getfield        #21  <Field Firebase query>
	//   11   20:invokevirtual   #80  <Method String Firebase.getKey()>
	//   12   23:invokevirtual   #159 <Method StringBuilder StringBuilder.append(String)>
	//   13   26:pop             
		stringbuilder.append(", value = ");
	//   14   27:aload_1         
	//   15   28:ldc1            #161 <String ", value = ">
	//   16   30:invokevirtual   #159 <Method StringBuilder StringBuilder.append(String)>
	//   17   33:pop             
		stringbuilder.append(node.getNode().getValue(true));
	//   18   34:aload_1         
	//   19   35:aload_0         
	//   20   36:getfield        #19  <Field IndexedNode node>
	//   21   39:invokevirtual   #37  <Method Node IndexedNode.getNode()>
	//   22   42:iconst_1        
	//   23   43:invokeinterface #135 <Method Object Node.getValue(boolean)>
	//   24   48:invokevirtual   #164 <Method StringBuilder StringBuilder.append(Object)>
	//   25   51:pop             
		stringbuilder.append(" }");
	//   26   52:aload_1         
	//   27   53:ldc1            #166 <String " }">
	//   28   55:invokevirtual   #159 <Method StringBuilder StringBuilder.append(String)>
	//   29   58:pop             
		return stringbuilder.toString();
	//   30   59:aload_1         
	//   31   60:invokevirtual   #168 <Method String StringBuilder.toString()>
	//   32   63:areturn         
	}

	private final IndexedNode node;
	private final Firebase query;


/*
	static Firebase access$000(DataSnapshot datasnapshot)
	{
		return datasnapshot.query;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field Firebase query>
	//    2    4:areturn         
	}

*/
}
