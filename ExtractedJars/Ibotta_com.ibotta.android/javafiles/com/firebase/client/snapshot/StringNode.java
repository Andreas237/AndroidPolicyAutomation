// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.snapshot;

import com.firebase.client.utilities.Utilities;

// Referenced classes of package com.firebase.client.snapshot:
//			LeafNode, Node

public class StringNode extends LeafNode
{

	public StringNode(String s, Node node)
	{
		super(node);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:invokespecial   #14  <Method void LeafNode(Node)>
		value = s;
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:putfield        #16  <Field String value>
	//    6   10:return          
	}

	protected volatile int compareLeafValues(LeafNode leafnode)
	{
		return compareLeafValues((StringNode)leafnode);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #2   <Class StringNode>
	//    3    5:invokevirtual   #22  <Method int compareLeafValues(StringNode)>
	//    4    8:ireturn         
	}

	protected int compareLeafValues(StringNode stringnode)
	{
		return value.compareTo(stringnode.value);
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field String value>
	//    2    4:aload_1         
	//    3    5:getfield        #16  <Field String value>
	//    4    8:invokevirtual   #28  <Method int String.compareTo(String)>
	//    5   11:ireturn         
	}

	public boolean equals(Object obj)
	{
		boolean flag = obj instanceof StringNode;
	//    0    0:aload_1         
	//    1    1:instanceof      #2   <Class StringNode>
	//    2    4:istore_2        
		boolean flag1 = false;
	//    3    5:iconst_0        
	//    4    6:istore_3        
		if(!flag)
	//*   5    7:iload_2         
	//*   6    8:ifne            13
			return false;
	//    7   11:iconst_0        
	//    8   12:ireturn         
		obj = ((Object) ((StringNode)obj));
	//    9   13:aload_1         
	//   10   14:checkcast       #2   <Class StringNode>
	//   11   17:astore_1        
		flag = flag1;
	//   12   18:iload_3         
	//   13   19:istore_2        
		if(value.equals(((Object) (((StringNode) (obj)).value))))
	//*  14   20:aload_0         
	//*  15   21:getfield        #16  <Field String value>
	//*  16   24:aload_1         
	//*  17   25:getfield        #16  <Field String value>
	//*  18   28:invokevirtual   #32  <Method boolean String.equals(Object)>
	//*  19   31:ifeq            52
		{
			flag = flag1;
	//   20   34:iload_3         
	//   21   35:istore_2        
			if(((Object) (priority)).equals(((Object) (((StringNode) (obj)).priority))))
	//*  22   36:aload_0         
	//*  23   37:getfield        #36  <Field Node priority>
	//*  24   40:aload_1         
	//*  25   41:getfield        #36  <Field Node priority>
	//*  26   44:invokevirtual   #39  <Method boolean Object.equals(Object)>
	//*  27   47:ifeq            52
				flag = true;
	//   28   50:iconst_1        
	//   29   51:istore_2        
		}
		return flag;
	//   30   52:iload_2         
	//   31   53:ireturn         
	}

	public String getHashRepresentation(Node.HashVersion hashversion)
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
	//*   0    0:getstatic       #45  <Field int[] StringNode$1.$SwitchMap$com$firebase$client$snapshot$Node$HashVersion>
	//*   1    3:aload_1         
	//*   2    4:invokevirtual   #51  <Method int Node$HashVersion.ordinal()>
	//*   3    7:iaload          
		{
	//*   4    8:tableswitch     1 2: default 32
	//	               1 107
	//	               2 65
		default:
			StringBuilder stringbuilder = new StringBuilder();
	//    5   32:new             #53  <Class StringBuilder>
	//    6   35:dup             
	//    7   36:invokespecial   #56  <Method void StringBuilder()>
	//    8   39:astore_2        
			stringbuilder.append("Invalid hash version for string node: ");
	//    9   40:aload_2         
	//   10   41:ldc1            #58  <String "Invalid hash version for string node: ">
	//   11   43:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   12   46:pop             
			stringbuilder.append(((Object) (hashversion)));
	//   13   47:aload_2         
	//   14   48:aload_1         
	//   15   49:invokevirtual   #65  <Method StringBuilder StringBuilder.append(Object)>
	//   16   52:pop             
			throw new IllegalArgumentException(stringbuilder.toString());
	//   17   53:new             #67  <Class IllegalArgumentException>
	//   18   56:dup             
	//   19   57:aload_2         
	//   20   58:invokevirtual   #71  <Method String StringBuilder.toString()>
	//   21   61:invokespecial   #74  <Method void IllegalArgumentException(String)>
	//   22   64:athrow          

		case 2: // '\002'
			StringBuilder stringbuilder1 = new StringBuilder();
	//   23   65:new             #53  <Class StringBuilder>
	//   24   68:dup             
	//   25   69:invokespecial   #56  <Method void StringBuilder()>
	//   26   72:astore_2        
			stringbuilder1.append(getPriorityHash(hashversion));
	//   27   73:aload_2         
	//   28   74:aload_0         
	//   29   75:aload_1         
	//   30   76:invokevirtual   #77  <Method String getPriorityHash(Node$HashVersion)>
	//   31   79:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   32   82:pop             
			stringbuilder1.append("string:");
	//   33   83:aload_2         
	//   34   84:ldc1            #79  <String "string:">
	//   35   86:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   36   89:pop             
			stringbuilder1.append(Utilities.stringHashV2Representation(value));
	//   37   90:aload_2         
	//   38   91:aload_0         
	//   39   92:getfield        #16  <Field String value>
	//   40   95:invokestatic    #85  <Method String Utilities.stringHashV2Representation(String)>
	//   41   98:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   42  101:pop             
			return stringbuilder1.toString();
	//   43  102:aload_2         
	//   44  103:invokevirtual   #71  <Method String StringBuilder.toString()>
	//   45  106:areturn         

		case 1: // '\001'
			StringBuilder stringbuilder2 = new StringBuilder();
	//   46  107:new             #53  <Class StringBuilder>
	//   47  110:dup             
	//   48  111:invokespecial   #56  <Method void StringBuilder()>
	//   49  114:astore_2        
			stringbuilder2.append(getPriorityHash(hashversion));
	//   50  115:aload_2         
	//   51  116:aload_0         
	//   52  117:aload_1         
	//   53  118:invokevirtual   #77  <Method String getPriorityHash(Node$HashVersion)>
	//   54  121:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   55  124:pop             
			stringbuilder2.append("string:");
	//   56  125:aload_2         
	//   57  126:ldc1            #79  <String "string:">
	//   58  128:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   59  131:pop             
			stringbuilder2.append(value);
	//   60  132:aload_2         
	//   61  133:aload_0         
	//   62  134:getfield        #16  <Field String value>
	//   63  137:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   64  140:pop             
			return stringbuilder2.toString();
	//   65  141:aload_2         
	//   66  142:invokevirtual   #71  <Method String StringBuilder.toString()>
	//   67  145:areturn         
		}
	}

	protected LeafNode.LeafType getLeafType()
	{
		return LeafNode.LeafType.String;
	//    0    0:getstatic       #93  <Field LeafNode$LeafType LeafNode$LeafType.String>
	//    1    3:areturn         
	}

	public Object getValue()
	{
		return ((Object) (value));
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field String value>
	//    2    4:areturn         
	}

	public int hashCode()
	{
		return value.hashCode() + ((Object) (priority)).hashCode();
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field String value>
	//    2    4:invokevirtual   #98  <Method int String.hashCode()>
	//    3    7:aload_0         
	//    4    8:getfield        #36  <Field Node priority>
	//    5   11:invokevirtual   #99  <Method int Object.hashCode()>
	//    6   14:iadd            
	//    7   15:ireturn         
	}

	public volatile Node updatePriority(Node node)
	{
		return ((Node) (updatePriority(node)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #104 <Method StringNode updatePriority(Node)>
	//    3    5:areturn         
	}

	public StringNode updatePriority(Node node)
	{
		return new StringNode(value, node);
	//    0    0:new             #2   <Class StringNode>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #16  <Field String value>
	//    4    8:aload_1         
	//    5    9:invokespecial   #106 <Method void StringNode(String, Node)>
	//    6   12:areturn         
	}

	private final String value;
}
