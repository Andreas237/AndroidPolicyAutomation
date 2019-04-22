// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.snapshot;

import com.firebase.client.core.Path;
import com.firebase.client.utilities.Utilities;
import java.util.*;

// Referenced classes of package com.firebase.client.snapshot:
//			Node, LongNode, DoubleNode, ChildrenNode, 
//			ChildKey, EmptyNode

public abstract class LeafNode
	implements Node
{
	protected static final class LeafType extends Enum
	{

		public static LeafType valueOf(String s)
		{
			return (LeafType)Enum.valueOf(com/firebase/client/snapshot/LeafNode$LeafType, s);
		//    0    0:ldc1            #2   <Class LeafNode$LeafType>
		//    1    2:aload_0         
		//    2    3:invokestatic    #43  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class LeafNode$LeafType>
		//    4    9:areturn         
		}

		public static LeafType[] values()
		{
			return (LeafType[])((LeafType []) ($VALUES)).clone();
		//    0    0:getstatic       #35  <Field LeafNode$LeafType[] $VALUES>
		//    1    3:invokevirtual   #50  <Method Object _5B_Lcom.firebase.client.snapshot.LeafNode$LeafType_3B_.clone()>
		//    2    6:checkcast       #46  <Class LeafNode$LeafType[]>
		//    3    9:areturn         
		}

		private static final LeafType $VALUES[];
		public static final LeafType Boolean;
		public static final LeafType DeferredValue;
		public static final LeafType Number;
		public static final LeafType String;

		static 
		{
			DeferredValue = new LeafType("DeferredValue", 0);
		//    0    0:new             #2   <Class LeafNode$LeafType>
		//    1    3:dup             
		//    2    4:ldc1            #18  <String "DeferredValue">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #22  <Method void LeafNode$LeafType(String, int)>
		//    5   10:putstatic       #24  <Field LeafNode$LeafType DeferredValue>
			Boolean = new LeafType("Boolean", 1);
		//    6   13:new             #2   <Class LeafNode$LeafType>
		//    7   16:dup             
		//    8   17:ldc1            #25  <String "Boolean">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #22  <Method void LeafNode$LeafType(String, int)>
		//   11   23:putstatic       #27  <Field LeafNode$LeafType Boolean>
			Number = new LeafType("Number", 2);
		//   12   26:new             #2   <Class LeafNode$LeafType>
		//   13   29:dup             
		//   14   30:ldc1            #28  <String "Number">
		//   15   32:iconst_2        
		//   16   33:invokespecial   #22  <Method void LeafNode$LeafType(String, int)>
		//   17   36:putstatic       #30  <Field LeafNode$LeafType Number>
			String = new LeafType("String", 3);
		//   18   39:new             #2   <Class LeafNode$LeafType>
		//   19   42:dup             
		//   20   43:ldc1            #31  <String "String">
		//   21   45:iconst_3        
		//   22   46:invokespecial   #22  <Method void LeafNode$LeafType(String, int)>
		//   23   49:putstatic       #33  <Field LeafNode$LeafType String>
			$VALUES = (new LeafType[] {
				DeferredValue, Boolean, Number, String
			});
		//   24   52:iconst_4        
		//   25   53:anewarray       LeafType[]
		//   26   56:dup             
		//   27   57:iconst_0        
		//   28   58:getstatic       #24  <Field LeafNode$LeafType DeferredValue>
		//   29   61:aastore         
		//   30   62:dup             
		//   31   63:iconst_1        
		//   32   64:getstatic       #27  <Field LeafNode$LeafType Boolean>
		//   33   67:aastore         
		//   34   68:dup             
		//   35   69:iconst_2        
		//   36   70:getstatic       #30  <Field LeafNode$LeafType Number>
		//   37   73:aastore         
		//   38   74:dup             
		//   39   75:iconst_3        
		//   40   76:getstatic       #33  <Field LeafNode$LeafType String>
		//   41   79:aastore         
		//   42   80:putstatic       #35  <Field LeafNode$LeafType[] $VALUES>
		//*  43   83:return          
		}

		private LeafType(String s, int i)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #37  <Method void Enum(String, int)>
		//    4    6:return          
		}
	}


	LeafNode(Node node)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void Object()>
		priority = node;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #28  <Field Node priority>
	//    5    9:return          
	}

	private static int compareLongDoubleNodes(LongNode longnode, DoubleNode doublenode)
	{
		return Double.valueOf(((Long)longnode.getValue()).longValue()).compareTo((Double)doublenode.getValue());
	//    0    0:aload_0         
	//    1    1:invokevirtual   #36  <Method Object LongNode.getValue()>
	//    2    4:checkcast       #38  <Class Long>
	//    3    7:invokevirtual   #42  <Method long Long.longValue()>
	//    4   10:l2d             
	//    5   11:invokestatic    #48  <Method Double Double.valueOf(double)>
	//    6   14:aload_1         
	//    7   15:invokevirtual   #51  <Method Object DoubleNode.getValue()>
	//    8   18:checkcast       #44  <Class Double>
	//    9   21:invokevirtual   #55  <Method int Double.compareTo(Double)>
	//   10   24:ireturn         
	}

	protected abstract int compareLeafValues(LeafNode leafnode);

	public int compareTo(Node node)
	{
		if(node.isEmpty())
	//*   0    0:aload_1         
	//*   1    1:invokeinterface #62  <Method boolean Node.isEmpty()>
	//*   2    6:ifeq            11
			return 1;
	//    3    9:iconst_1        
	//    4   10:ireturn         
		if(node instanceof ChildrenNode)
	//*   5   11:aload_1         
	//*   6   12:instanceof      #64  <Class ChildrenNode>
	//*   7   15:ifeq            20
			return -1;
	//    8   18:iconst_m1       
	//    9   19:ireturn         
		if((this instanceof LongNode) && (node instanceof DoubleNode))
	//*  10   20:aload_0         
	//*  11   21:instanceof      #32  <Class LongNode>
	//*  12   24:ifeq            46
	//*  13   27:aload_1         
	//*  14   28:instanceof      #50  <Class DoubleNode>
	//*  15   31:ifeq            46
			return compareLongDoubleNodes((LongNode)this, (DoubleNode)node);
	//   16   34:aload_0         
	//   17   35:checkcast       #32  <Class LongNode>
	//   18   38:aload_1         
	//   19   39:checkcast       #50  <Class DoubleNode>
	//   20   42:invokestatic    #66  <Method int compareLongDoubleNodes(LongNode, DoubleNode)>
	//   21   45:ireturn         
		if((this instanceof DoubleNode) && (node instanceof LongNode))
	//*  22   46:aload_0         
	//*  23   47:instanceof      #50  <Class DoubleNode>
	//*  24   50:ifeq            74
	//*  25   53:aload_1         
	//*  26   54:instanceof      #32  <Class LongNode>
	//*  27   57:ifeq            74
			return compareLongDoubleNodes((LongNode)node, (DoubleNode)this) * -1;
	//   28   60:aload_1         
	//   29   61:checkcast       #32  <Class LongNode>
	//   30   64:aload_0         
	//   31   65:checkcast       #50  <Class DoubleNode>
	//   32   68:invokestatic    #66  <Method int compareLongDoubleNodes(LongNode, DoubleNode)>
	//   33   71:iconst_m1       
	//   34   72:imul            
	//   35   73:ireturn         
		else
			return leafCompare((LeafNode)node);
	//   36   74:aload_0         
	//   37   75:aload_1         
	//   38   76:checkcast       #2   <Class LeafNode>
	//   39   79:invokevirtual   #69  <Method int leafCompare(LeafNode)>
	//   40   82:ireturn         
	}

	public volatile int compareTo(Object obj)
	{
		return compareTo((Node)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #7   <Class Node>
	//    3    5:invokevirtual   #72  <Method int compareTo(Node)>
	//    4    8:ireturn         
	}

	public abstract boolean equals(Object obj);

	public Node getChild(Path path)
	{
		if(path.isEmpty())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #79  <Method boolean Path.isEmpty()>
	//*   2    4:ifeq            9
			return ((Node) (this));
	//    3    7:aload_0         
	//    4    8:areturn         
		if(path.getFront().isPriorityChildName())
	//*   5    9:aload_1         
	//*   6   10:invokevirtual   #83  <Method ChildKey Path.getFront()>
	//*   7   13:invokevirtual   #88  <Method boolean ChildKey.isPriorityChildName()>
	//*   8   16:ifeq            24
			return priority;
	//    9   19:aload_0         
	//   10   20:getfield        #28  <Field Node priority>
	//   11   23:areturn         
		else
			return ((Node) (EmptyNode.Empty()));
	//   12   24:invokestatic    #94  <Method EmptyNode EmptyNode.Empty()>
	//   13   27:areturn         
	}

	public int getChildCount()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public String getHash()
	{
		if(lazyHash == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #100 <Field String lazyHash>
	//*   2    4:ifnonnull       21
			lazyHash = Utilities.sha1HexDigest(getHashRepresentation(Node.HashVersion.V1));
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getstatic       #106 <Field Node$HashVersion Node$HashVersion.V1>
	//    6   12:invokevirtual   #110 <Method String getHashRepresentation(Node$HashVersion)>
	//    7   15:invokestatic    #116 <Method String Utilities.sha1HexDigest(String)>
	//    8   18:putfield        #100 <Field String lazyHash>
		return lazyHash;
	//    9   21:aload_0         
	//   10   22:getfield        #100 <Field String lazyHash>
	//   11   25:areturn         
	}

	public Node getImmediateChild(ChildKey childkey)
	{
		if(childkey.isPriorityChildName())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #88  <Method boolean ChildKey.isPriorityChildName()>
	//*   2    4:ifeq            12
			return priority;
	//    3    7:aload_0         
	//    4    8:getfield        #28  <Field Node priority>
	//    5   11:areturn         
		else
			return ((Node) (EmptyNode.Empty()));
	//    6   12:invokestatic    #94  <Method EmptyNode EmptyNode.Empty()>
	//    7   15:areturn         
	}

	protected abstract LeafType getLeafType();

	public ChildKey getPredecessorChildKey(ChildKey childkey)
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public Node getPriority()
	{
		return priority;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field Node priority>
	//    2    4:areturn         
	}

	protected String getPriorityHash(Node.HashVersion hashversion)
	{
		static class _cls1
		{

			static final int $SwitchMap$com$firebase$client$snapshot$Node$HashVersion[];

			static 
			{
				$SwitchMap$com$firebase$client$snapshot$Node$HashVersion = new int[Node.HashVersion.values().length];
			//    0    0:invokestatic    #18  <Method Node$HashVersion[] Node$HashVersion.values()>
			//    1    3:arraylength     
			//    2    4:newarray        int[]
			//    3    6:putstatic       #20  <Field int[] $SwitchMap$com$firebase$client$snapshot$Node$HashVersion>
				try
				{
					$SwitchMap$com$firebase$client$snapshot$Node$HashVersion[Node.HashVersion.V1.ordinal()] = 1;
			//    4    9:getstatic       #20  <Field int[] $SwitchMap$com$firebase$client$snapshot$Node$HashVersion>
			//    5   12:getstatic       #24  <Field Node$HashVersion Node$HashVersion.V1>
			//    6   15:invokevirtual   #28  <Method int Node$HashVersion.ordinal()>
			//    7   18:iconst_1        
			//    8   19:iastore         
				}
			//*   9   20:getstatic       #20  <Field int[] $SwitchMap$com$firebase$client$snapshot$Node$HashVersion>
			//*  10   23:getstatic       #31  <Field Node$HashVersion Node$HashVersion.V2>
			//*  11   26:invokevirtual   #28  <Method int Node$HashVersion.ordinal()>
			//*  12   29:iconst_2        
			//*  13   30:iastore         
			//*  14   31:return          
				catch(NoSuchFieldError nosuchfielderror) { }
			//   15   32:astore_0        
				try
				{
					$SwitchMap$com$firebase$client$snapshot$Node$HashVersion[Node.HashVersion.V2.ordinal()] = 2;
				}
			//*  16   33:goto            20
				catch(NoSuchFieldError nosuchfielderror1) { }
			//   17   36:astore_0        
			//*  18   37:return          
			}
		}

		switch(_cls1..SwitchMap.com.firebase.client.snapshot.Node.HashVersion[hashversion.ordinal()])
	//*   0    0:getstatic       #129 <Field int[] LeafNode$1.$SwitchMap$com$firebase$client$snapshot$Node$HashVersion>
	//*   1    3:aload_1         
	//*   2    4:invokevirtual   #132 <Method int Node$HashVersion.ordinal()>
	//*   3    7:iaload          
		{
	//*   4    8:tableswitch     1 2: default 32
	//	               1 65
	//	               2 65
		default:
			StringBuilder stringbuilder = new StringBuilder();
	//    5   32:new             #134 <Class StringBuilder>
	//    6   35:dup             
	//    7   36:invokespecial   #135 <Method void StringBuilder()>
	//    8   39:astore_2        
			stringbuilder.append("Unknown hash version: ");
	//    9   40:aload_2         
	//   10   41:ldc1            #137 <String "Unknown hash version: ">
	//   11   43:invokevirtual   #141 <Method StringBuilder StringBuilder.append(String)>
	//   12   46:pop             
			stringbuilder.append(((Object) (hashversion)));
	//   13   47:aload_2         
	//   14   48:aload_1         
	//   15   49:invokevirtual   #144 <Method StringBuilder StringBuilder.append(Object)>
	//   16   52:pop             
			throw new IllegalArgumentException(stringbuilder.toString());
	//   17   53:new             #146 <Class IllegalArgumentException>
	//   18   56:dup             
	//   19   57:aload_2         
	//   20   58:invokevirtual   #149 <Method String StringBuilder.toString()>
	//   21   61:invokespecial   #152 <Method void IllegalArgumentException(String)>
	//   22   64:athrow          

		case 1: // '\001'
		case 2: // '\002'
			break;
		}
		if(priority.isEmpty())
	//*  23   65:aload_0         
	//*  24   66:getfield        #28  <Field Node priority>
	//*  25   69:invokeinterface #62  <Method boolean Node.isEmpty()>
	//*  26   74:ifeq            80
		{
			return "";
	//   27   77:ldc1            #154 <String "">
	//   28   79:areturn         
		} else
		{
			StringBuilder stringbuilder1 = new StringBuilder();
	//   29   80:new             #134 <Class StringBuilder>
	//   30   83:dup             
	//   31   84:invokespecial   #135 <Method void StringBuilder()>
	//   32   87:astore_2        
			stringbuilder1.append("priority:");
	//   33   88:aload_2         
	//   34   89:ldc1            #156 <String "priority:">
	//   35   91:invokevirtual   #141 <Method StringBuilder StringBuilder.append(String)>
	//   36   94:pop             
			stringbuilder1.append(priority.getHashRepresentation(hashversion));
	//   37   95:aload_2         
	//   38   96:aload_0         
	//   39   97:getfield        #28  <Field Node priority>
	//   40  100:aload_1         
	//   41  101:invokeinterface #157 <Method String Node.getHashRepresentation(Node$HashVersion)>
	//   42  106:invokevirtual   #141 <Method StringBuilder StringBuilder.append(String)>
	//   43  109:pop             
			stringbuilder1.append(":");
	//   44  110:aload_2         
	//   45  111:ldc1            #159 <String ":">
	//   46  113:invokevirtual   #141 <Method StringBuilder StringBuilder.append(String)>
	//   47  116:pop             
			return stringbuilder1.toString();
	//   48  117:aload_2         
	//   49  118:invokevirtual   #149 <Method String StringBuilder.toString()>
	//   50  121:areturn         
		}
	}

	public ChildKey getSuccessorChildKey(ChildKey childkey)
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public Object getValue(boolean flag)
	{
		if(flag && !priority.isEmpty())
	//*   0    0:iload_1         
	//*   1    1:ifeq            60
	//*   2    4:aload_0         
	//*   3    5:getfield        #28  <Field Node priority>
	//*   4    8:invokeinterface #62  <Method boolean Node.isEmpty()>
	//*   5   13:ifeq            19
	//*   6   16:goto            60
		{
			HashMap hashmap = new HashMap();
	//    7   19:new             #163 <Class HashMap>
	//    8   22:dup             
	//    9   23:invokespecial   #164 <Method void HashMap()>
	//   10   26:astore_2        
			((Map) (hashmap)).put(".value", getValue());
	//   11   27:aload_2         
	//   12   28:ldc1            #166 <String ".value">
	//   13   30:aload_0         
	//   14   31:invokevirtual   #167 <Method Object getValue()>
	//   15   34:invokeinterface #173 <Method Object Map.put(Object, Object)>
	//   16   39:pop             
			((Map) (hashmap)).put(".priority", priority.getValue());
	//   17   40:aload_2         
	//   18   41:ldc1            #175 <String ".priority">
	//   19   43:aload_0         
	//   20   44:getfield        #28  <Field Node priority>
	//   21   47:invokeinterface #176 <Method Object Node.getValue()>
	//   22   52:invokeinterface #173 <Method Object Map.put(Object, Object)>
	//   23   57:pop             
			return ((Object) (hashmap));
	//   24   58:aload_2         
	//   25   59:areturn         
		} else
		{
			return getValue();
	//   26   60:aload_0         
	//   27   61:invokevirtual   #167 <Method Object getValue()>
	//   28   64:areturn         
		}
	}

	public boolean hasChild(ChildKey childkey)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public abstract int hashCode();

	public boolean isEmpty()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public boolean isLeafNode()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public Iterator iterator()
	{
		return Collections.emptyList().iterator();
	//    0    0:invokestatic    #188 <Method List Collections.emptyList()>
	//    1    3:invokeinterface #192 <Method Iterator List.iterator()>
	//    2    8:areturn         
	}

	protected int leafCompare(LeafNode leafnode)
	{
		LeafType leaftype = getLeafType();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #196 <Method LeafNode$LeafType getLeafType()>
	//    2    4:astore_2        
		LeafType leaftype1 = leafnode.getLeafType();
	//    3    5:aload_1         
	//    4    6:invokevirtual   #196 <Method LeafNode$LeafType getLeafType()>
	//    5    9:astore_3        
		if(leaftype.equals(((Object) (leaftype1))))
	//*   6   10:aload_2         
	//*   7   11:aload_3         
	//*   8   12:invokevirtual   #198 <Method boolean LeafNode$LeafType.equals(Object)>
	//*   9   15:ifeq            24
			return compareLeafValues(leafnode);
	//   10   18:aload_0         
	//   11   19:aload_1         
	//   12   20:invokevirtual   #200 <Method int compareLeafValues(LeafNode)>
	//   13   23:ireturn         
		else
			return leaftype.compareTo(((Enum) (leaftype1)));
	//   14   24:aload_2         
	//   15   25:aload_3         
	//   16   26:invokevirtual   #203 <Method int LeafNode$LeafType.compareTo(Enum)>
	//   17   29:ireturn         
	}

	public Iterator reverseIterator()
	{
		return Collections.emptyList().iterator();
	//    0    0:invokestatic    #188 <Method List Collections.emptyList()>
	//    1    3:invokeinterface #192 <Method Iterator List.iterator()>
	//    2    8:areturn         
	}

	public String toString()
	{
		String s = getValue(true).toString();
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:invokevirtual   #207 <Method Object getValue(boolean)>
	//    3    5:invokevirtual   #208 <Method String Object.toString()>
	//    4    8:astore_1        
		if(s.length() <= 100)
	//*   5    9:aload_1         
	//*   6   10:invokevirtual   #213 <Method int String.length()>
	//*   7   13:bipush          100
	//*   8   15:icmpgt          20
		{
			return s;
	//    9   18:aload_1         
	//   10   19:areturn         
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   11   20:new             #134 <Class StringBuilder>
	//   12   23:dup             
	//   13   24:invokespecial   #135 <Method void StringBuilder()>
	//   14   27:astore_2        
			stringbuilder.append(s.substring(0, 100));
	//   15   28:aload_2         
	//   16   29:aload_1         
	//   17   30:iconst_0        
	//   18   31:bipush          100
	//   19   33:invokevirtual   #217 <Method String String.substring(int, int)>
	//   20   36:invokevirtual   #141 <Method StringBuilder StringBuilder.append(String)>
	//   21   39:pop             
			stringbuilder.append("...");
	//   22   40:aload_2         
	//   23   41:ldc1            #219 <String "...">
	//   24   43:invokevirtual   #141 <Method StringBuilder StringBuilder.append(String)>
	//   25   46:pop             
			return stringbuilder.toString();
	//   26   47:aload_2         
	//   27   48:invokevirtual   #149 <Method String StringBuilder.toString()>
	//   28   51:areturn         
		}
	}

	public Node updateChild(Path path, Node node)
	{
		ChildKey childkey = path.getFront();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #83  <Method ChildKey Path.getFront()>
	//    2    4:astore_3        
		if(childkey == null)
	//*   3    5:aload_3         
	//*   4    6:ifnonnull       11
			return node;
	//    5    9:aload_2         
	//    6   10:areturn         
		if(node.isEmpty() && !childkey.isPriorityChildName())
	//*   7   11:aload_2         
	//*   8   12:invokeinterface #62  <Method boolean Node.isEmpty()>
	//*   9   17:ifeq            29
	//*  10   20:aload_3         
	//*  11   21:invokevirtual   #88  <Method boolean ChildKey.isPriorityChildName()>
	//*  12   24:ifne            29
			return ((Node) (this));
	//   13   27:aload_0         
	//   14   28:areturn         
		else
			return updateImmediateChild(childkey, EmptyNode.Empty().updateChild(path.popFront(), node));
	//   15   29:aload_0         
	//   16   30:aload_3         
	//   17   31:invokestatic    #94  <Method EmptyNode EmptyNode.Empty()>
	//   18   34:aload_1         
	//   19   35:invokevirtual   #225 <Method Path Path.popFront()>
	//   20   38:aload_2         
	//   21   39:invokevirtual   #227 <Method Node EmptyNode.updateChild(Path, Node)>
	//   22   42:invokevirtual   #231 <Method Node updateImmediateChild(ChildKey, Node)>
	//   23   45:areturn         
	}

	public Node updateImmediateChild(ChildKey childkey, Node node)
	{
		if(childkey.isPriorityChildName())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #88  <Method boolean ChildKey.isPriorityChildName()>
	//*   2    4:ifeq            13
			return updatePriority(node);
	//    3    7:aload_0         
	//    4    8:aload_2         
	//    5    9:invokevirtual   #235 <Method Node updatePriority(Node)>
	//    6   12:areturn         
		if(node.isEmpty())
	//*   7   13:aload_2         
	//*   8   14:invokeinterface #62  <Method boolean Node.isEmpty()>
	//*   9   19:ifeq            24
			return ((Node) (this));
	//   10   22:aload_0         
	//   11   23:areturn         
		else
			return EmptyNode.Empty().updateImmediateChild(childkey, node).updatePriority(priority);
	//   12   24:invokestatic    #94  <Method EmptyNode EmptyNode.Empty()>
	//   13   27:aload_1         
	//   14   28:aload_2         
	//   15   29:invokevirtual   #236 <Method Node EmptyNode.updateImmediateChild(ChildKey, Node)>
	//   16   32:aload_0         
	//   17   33:getfield        #28  <Field Node priority>
	//   18   36:invokeinterface #237 <Method Node Node.updatePriority(Node)>
	//   19   41:areturn         
	}

	static final boolean $assertionsDisabled = false;
	private String lazyHash;
	protected final Node priority;

	static 
	{
	//    0    0:return          
	}
}
