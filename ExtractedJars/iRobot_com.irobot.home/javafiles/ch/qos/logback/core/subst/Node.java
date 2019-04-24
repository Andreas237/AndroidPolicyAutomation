// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.core.subst;

import java.io.PrintStream;

public class Node
{
	static final class Type extends Enum
	{

		public static Type valueOf(String s)
		{
			return (Type)Enum.valueOf(ch/qos/logback/core/subst/Node$Type, s);
		//    0    0:ldc1            #2   <Class Node$Type>
		//    1    2:aload_0         
		//    2    3:invokestatic    #35  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class Node$Type>
		//    4    9:areturn         
		}

		public static Type[] values()
		{
			return (Type[])((Type []) ($VALUES)).clone();
		//    0    0:getstatic       #27  <Field Node$Type[] $VALUES>
		//    1    3:invokevirtual   #42  <Method Object _5B_Lch.qos.logback.core.subst.Node$Type_3B_.clone()>
		//    2    6:checkcast       #38  <Class Node$Type[]>
		//    3    9:areturn         
		}

		private static final Type $VALUES[];
		public static final Type LITERAL;
		public static final Type VARIABLE;

		static 
		{
			LITERAL = new Type("LITERAL", 0);
		//    0    0:new             #2   <Class Node$Type>
		//    1    3:dup             
		//    2    4:ldc1            #16  <String "LITERAL">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #20  <Method void Node$Type(String, int)>
		//    5   10:putstatic       #22  <Field Node$Type LITERAL>
			VARIABLE = new Type("VARIABLE", 1);
		//    6   13:new             #2   <Class Node$Type>
		//    7   16:dup             
		//    8   17:ldc1            #23  <String "VARIABLE">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #20  <Method void Node$Type(String, int)>
		//   11   23:putstatic       #25  <Field Node$Type VARIABLE>
			$VALUES = (new Type[] {
				LITERAL, VARIABLE
			});
		//   12   26:iconst_2        
		//   13   27:anewarray       Type[]
		//   14   30:dup             
		//   15   31:iconst_0        
		//   16   32:getstatic       #22  <Field Node$Type LITERAL>
		//   17   35:aastore         
		//   18   36:dup             
		//   19   37:iconst_1        
		//   20   38:getstatic       #25  <Field Node$Type VARIABLE>
		//   21   41:aastore         
		//   22   42:putstatic       #27  <Field Node$Type[] $VALUES>
		//*  23   45:return          
		}

		private Type(String s, int i)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #29  <Method void Enum(String, int)>
		//    4    6:return          
		}
	}


	public Node(Type type1, Object obj)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
		type = type1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #23  <Field Node$Type type>
		payload = obj;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #25  <Field Object payload>
	//    8   14:return          
	}

	public Node(Type type1, Object obj, Object obj1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
		type = type1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #23  <Field Node$Type type>
		payload = obj;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #25  <Field Object payload>
		defaultPart = obj1;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #29  <Field Object defaultPart>
	//   11   19:return          
	}

	void append(Node node)
	{
		if(node == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       5
			return;
	//    2    4:return          
		Node node1 = this;
	//    3    5:aload_0         
	//    4    6:astore_2        
		do
		{
			if(node1.next == null)
	//*   5    7:aload_2         
	//*   6    8:getfield        #33  <Field Node next>
	//*   7   11:ifnonnull       20
			{
				node1.next = node;
	//    8   14:aload_2         
	//    9   15:aload_1         
	//   10   16:putfield        #33  <Field Node next>
				return;
	//   11   19:return          
			}
			node1 = node1.next;
	//   12   20:aload_2         
	//   13   21:getfield        #33  <Field Node next>
	//   14   24:astore_2        
		} while(true);
	//   15   25:goto            7
	}

	public void dump()
	{
		System.out.print(toString());
	//    0    0:getstatic       #40  <Field PrintStream System.out>
	//    1    3:aload_0         
	//    2    4:invokevirtual   #44  <Method String toString()>
	//    3    7:invokevirtual   #50  <Method void PrintStream.print(String)>
		System.out.print(" -> ");
	//    4   10:getstatic       #40  <Field PrintStream System.out>
	//    5   13:ldc1            #52  <String " -> ">
	//    6   15:invokevirtual   #50  <Method void PrintStream.print(String)>
		if(next != null)
	//*   7   18:aload_0         
	//*   8   19:getfield        #33  <Field Node next>
	//*   9   22:ifnull          33
		{
			next.dump();
	//   10   25:aload_0         
	//   11   26:getfield        #33  <Field Node next>
	//   12   29:invokevirtual   #54  <Method void dump()>
			return;
	//   13   32:return          
		} else
		{
			System.out.print(" null");
	//   14   33:getstatic       #40  <Field PrintStream System.out>
	//   15   36:ldc1            #56  <String " null">
	//   16   38:invokevirtual   #50  <Method void PrintStream.print(String)>
			return;
	//   17   41:return          
		}
	}

	public boolean equals(Object obj)
	{
		if(this == obj)
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:if_acmpne       7
			return true;
	//    3    5:iconst_1        
	//    4    6:ireturn         
		if(obj != null)
	//*   5    7:aload_1         
	//*   6    8:ifnull          140
		{
			if(((Object)this).getClass() != obj.getClass())
	//*   7   11:aload_0         
	//*   8   12:invokevirtual   #62  <Method Class Object.getClass()>
	//*   9   15:aload_1         
	//*  10   16:invokevirtual   #62  <Method Class Object.getClass()>
	//*  11   19:if_acmpeq       24
				return false;
	//   12   22:iconst_0        
	//   13   23:ireturn         
			obj = ((Object) ((Node)obj));
	//   14   24:aload_1         
	//   15   25:checkcast       #2   <Class Node>
	//   16   28:astore_1        
			if(type != ((Node) (obj)).type)
	//*  17   29:aload_0         
	//*  18   30:getfield        #23  <Field Node$Type type>
	//*  19   33:aload_1         
	//*  20   34:getfield        #23  <Field Node$Type type>
	//*  21   37:if_acmpeq       42
				return false;
	//   22   40:iconst_0        
	//   23   41:ireturn         
			if(payload != null)
	//*  24   42:aload_0         
	//*  25   43:getfield        #25  <Field Object payload>
	//*  26   46:ifnull          65
			{
				if(!payload.equals(((Node) (obj)).payload))
	//*  27   49:aload_0         
	//*  28   50:getfield        #25  <Field Object payload>
	//*  29   53:aload_1         
	//*  30   54:getfield        #25  <Field Object payload>
	//*  31   57:invokevirtual   #64  <Method boolean Object.equals(Object)>
	//*  32   60:ifne            74
					return false;
	//   33   63:iconst_0        
	//   34   64:ireturn         
			} else
			if(((Node) (obj)).payload != null)
	//*  35   65:aload_1         
	//*  36   66:getfield        #25  <Field Object payload>
	//*  37   69:ifnull          74
				return false;
	//   38   72:iconst_0        
	//   39   73:ireturn         
			if(defaultPart != null)
	//*  40   74:aload_0         
	//*  41   75:getfield        #29  <Field Object defaultPart>
	//*  42   78:ifnull          97
			{
				if(!defaultPart.equals(((Node) (obj)).defaultPart))
	//*  43   81:aload_0         
	//*  44   82:getfield        #29  <Field Object defaultPart>
	//*  45   85:aload_1         
	//*  46   86:getfield        #29  <Field Object defaultPart>
	//*  47   89:invokevirtual   #64  <Method boolean Object.equals(Object)>
	//*  48   92:ifne            106
					return false;
	//   49   95:iconst_0        
	//   50   96:ireturn         
			} else
			if(((Node) (obj)).defaultPart != null)
	//*  51   97:aload_1         
	//*  52   98:getfield        #29  <Field Object defaultPart>
	//*  53  101:ifnull          106
				return false;
	//   54  104:iconst_0        
	//   55  105:ireturn         
			if(next != null)
	//*  56  106:aload_0         
	//*  57  107:getfield        #33  <Field Node next>
	//*  58  110:ifnull          129
			{
				if(!next.equals(((Object) (((Node) (obj)).next))))
	//*  59  113:aload_0         
	//*  60  114:getfield        #33  <Field Node next>
	//*  61  117:aload_1         
	//*  62  118:getfield        #33  <Field Node next>
	//*  63  121:invokevirtual   #65  <Method boolean equals(Object)>
	//*  64  124:ifne            138
					return false;
	//   65  127:iconst_0        
	//   66  128:ireturn         
			} else
			if(((Node) (obj)).next != null)
	//*  67  129:aload_1         
	//*  68  130:getfield        #33  <Field Node next>
	//*  69  133:ifnull          138
				return false;
	//   70  136:iconst_0        
	//   71  137:ireturn         
			return true;
	//   72  138:iconst_1        
	//   73  139:ireturn         
		} else
		{
			return false;
	//   74  140:iconst_0        
	//   75  141:ireturn         
		}
	}

	public int hashCode()
	{
		Type type1 = type;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field Node$Type type>
	//    2    4:astore          5
		int l = 0;
	//    3    6:iconst_0        
	//    4    7:istore          4
		int i;
		if(type1 != null)
	//*   5    9:aload           5
	//*   6   11:ifnull          25
			i = type.hashCode();
	//    7   14:aload_0         
	//    8   15:getfield        #23  <Field Node$Type type>
	//    9   18:invokevirtual   #69  <Method int Node$Type.hashCode()>
	//   10   21:istore_1        
		else
	//*  11   22:goto            27
			i = 0;
	//   12   25:iconst_0        
	//   13   26:istore_1        
		int j;
		if(payload != null)
	//*  14   27:aload_0         
	//*  15   28:getfield        #25  <Field Object payload>
	//*  16   31:ifnull          45
			j = payload.hashCode();
	//   17   34:aload_0         
	//   18   35:getfield        #25  <Field Object payload>
	//   19   38:invokevirtual   #70  <Method int Object.hashCode()>
	//   20   41:istore_2        
		else
	//*  21   42:goto            47
			j = 0;
	//   22   45:iconst_0        
	//   23   46:istore_2        
		int k;
		if(defaultPart != null)
	//*  24   47:aload_0         
	//*  25   48:getfield        #29  <Field Object defaultPart>
	//*  26   51:ifnull          65
			k = defaultPart.hashCode();
	//   27   54:aload_0         
	//   28   55:getfield        #29  <Field Object defaultPart>
	//   29   58:invokevirtual   #70  <Method int Object.hashCode()>
	//   30   61:istore_3        
		else
	//*  31   62:goto            67
			k = 0;
	//   32   65:iconst_0        
	//   33   66:istore_3        
		if(next != null)
	//*  34   67:aload_0         
	//*  35   68:getfield        #33  <Field Node next>
	//*  36   71:ifnull          83
			l = next.hashCode();
	//   37   74:aload_0         
	//   38   75:getfield        #33  <Field Node next>
	//   39   78:invokevirtual   #71  <Method int hashCode()>
	//   40   81:istore          4
		return ((i * 31 + j) * 31 + k) * 31 + l;
	//   41   83:iload_1         
	//   42   84:bipush          31
	//   43   86:imul            
	//   44   87:iload_2         
	//   45   88:iadd            
	//   46   89:bipush          31
	//   47   91:imul            
	//   48   92:iload_3         
	//   49   93:iadd            
	//   50   94:bipush          31
	//   51   96:imul            
	//   52   97:iload           4
	//   53   99:iadd            
	//   54  100:ireturn         
	}

	void recursive(Node node, StringBuilder stringbuilder)
	{
		for(; node != null; node = node.next)
	//*   0    0:aload_1         
	//*   1    1:ifnull          28
		{
			stringbuilder.append(node.toString());
	//    2    4:aload_2         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #44  <Method String toString()>
	//    5    9:invokevirtual   #78  <Method StringBuilder StringBuilder.append(String)>
	//    6   12:pop             
			stringbuilder.append(" --> ");
	//    7   13:aload_2         
	//    8   14:ldc1            #80  <String " --> ">
	//    9   16:invokevirtual   #78  <Method StringBuilder StringBuilder.append(String)>
	//   10   19:pop             
		}

	//   11   20:aload_1         
	//   12   21:getfield        #33  <Field Node next>
	//   13   24:astore_1        
	//*  14   25:goto            0
		stringbuilder.append("null ");
	//   15   28:aload_2         
	//   16   29:ldc1            #82  <String "null ">
	//   17   31:invokevirtual   #78  <Method StringBuilder StringBuilder.append(String)>
	//   18   34:pop             
	//   19   35:return          
	}

	public void setNext(Node node)
	{
		next = node;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #33  <Field Node next>
	//    3    5:return          
	}

	public String toString()
	{
		static class _cls1
		{

			static final int $SwitchMap$ch$qos$logback$core$subst$Node$Type[];

			static 
			{
				$SwitchMap$ch$qos$logback$core$subst$Node$Type = new int[Type.values().length];
			//    0    0:invokestatic    #18  <Method Node$Type[] Node$Type.values()>
			//    1    3:arraylength     
			//    2    4:newarray        int[]
			//    3    6:putstatic       #20  <Field int[] $SwitchMap$ch$qos$logback$core$subst$Node$Type>
				try
				{
					$SwitchMap$ch$qos$logback$core$subst$Node$Type[Type.LITERAL.ordinal()] = 1;
			//    4    9:getstatic       #20  <Field int[] $SwitchMap$ch$qos$logback$core$subst$Node$Type>
			//    5   12:getstatic       #24  <Field Node$Type Node$Type.LITERAL>
			//    6   15:invokevirtual   #28  <Method int Node$Type.ordinal()>
			//    7   18:iconst_1        
			//    8   19:iastore         
				}
			//*   9   20:getstatic       #20  <Field int[] $SwitchMap$ch$qos$logback$core$subst$Node$Type>
			//*  10   23:getstatic       #31  <Field Node$Type Node$Type.VARIABLE>
			//*  11   26:invokevirtual   #28  <Method int Node$Type.ordinal()>
			//*  12   29:iconst_2        
			//*  13   30:iastore         
			//*  14   31:return          
				catch(NoSuchFieldError nosuchfielderror) { }
			//   15   32:astore_0        
				try
				{
					$SwitchMap$ch$qos$logback$core$subst$Node$Type[Type.VARIABLE.ordinal()] = 2;
				}
			//*  16   33:goto            20
				catch(NoSuchFieldError nosuchfielderror1) { }
			//   17   36:astore_0        
			//*  18   37:return          
			}
		}

		switch(_cls1..SwitchMap.ch.qos.logback.core.subst.Node.Type[type.ordinal()])
	//*   0    0:getstatic       #87  <Field int[] Node$1.$SwitchMap$ch$qos$logback$core$subst$Node$Type>
	//*   1    3:aload_0         
	//*   2    4:getfield        #23  <Field Node$Type type>
	//*   3    7:invokevirtual   #90  <Method int Node$Type.ordinal()>
	//*   4   10:iaload          
		{
	//*   5   11:tableswitch     1 2: default 32
	//	               1 203
	//	               2 34
		default:
			return null;
	//    6   32:aconst_null     
	//    7   33:areturn         

		case 2: // '\002'
			Object obj = ((Object) (new StringBuilder()));
	//    8   34:new             #75  <Class StringBuilder>
	//    9   37:dup             
	//   10   38:invokespecial   #91  <Method void StringBuilder()>
	//   11   41:astore_1        
			StringBuilder stringbuilder1 = new StringBuilder();
	//   12   42:new             #75  <Class StringBuilder>
	//   13   45:dup             
	//   14   46:invokespecial   #91  <Method void StringBuilder()>
	//   15   49:astore_3        
			if(defaultPart != null)
	//*  16   50:aload_0         
	//*  17   51:getfield        #29  <Field Object defaultPart>
	//*  18   54:ifnull          69
				recursive((Node)defaultPart, stringbuilder1);
	//   19   57:aload_0         
	//   20   58:aload_0         
	//   21   59:getfield        #29  <Field Object defaultPart>
	//   22   62:checkcast       #2   <Class Node>
	//   23   65:aload_3         
	//   24   66:invokevirtual   #93  <Method void recursive(Node, StringBuilder)>
			recursive((Node)payload, ((StringBuilder) (obj)));
	//   25   69:aload_0         
	//   26   70:aload_0         
	//   27   71:getfield        #25  <Field Object payload>
	//   28   74:checkcast       #2   <Class Node>
	//   29   77:aload_1         
	//   30   78:invokevirtual   #93  <Method void recursive(Node, StringBuilder)>
			Object obj1 = ((Object) (new StringBuilder()));
	//   31   81:new             #75  <Class StringBuilder>
	//   32   84:dup             
	//   33   85:invokespecial   #91  <Method void StringBuilder()>
	//   34   88:astore_2        
			((StringBuilder) (obj1)).append("Node{type=");
	//   35   89:aload_2         
	//   36   90:ldc1            #95  <String "Node{type=">
	//   37   92:invokevirtual   #78  <Method StringBuilder StringBuilder.append(String)>
	//   38   95:pop             
			((StringBuilder) (obj1)).append(((Object) (type)));
	//   39   96:aload_2         
	//   40   97:aload_0         
	//   41   98:getfield        #23  <Field Node$Type type>
	//   42  101:invokevirtual   #98  <Method StringBuilder StringBuilder.append(Object)>
	//   43  104:pop             
			((StringBuilder) (obj1)).append(", payload='");
	//   44  105:aload_2         
	//   45  106:ldc1            #100 <String ", payload='">
	//   46  108:invokevirtual   #78  <Method StringBuilder StringBuilder.append(String)>
	//   47  111:pop             
			((StringBuilder) (obj1)).append(((StringBuilder) (obj)).toString());
	//   48  112:aload_2         
	//   49  113:aload_1         
	//   50  114:invokevirtual   #101 <Method String StringBuilder.toString()>
	//   51  117:invokevirtual   #78  <Method StringBuilder StringBuilder.append(String)>
	//   52  120:pop             
			((StringBuilder) (obj1)).append("'");
	//   53  121:aload_2         
	//   54  122:ldc1            #103 <String "'">
	//   55  124:invokevirtual   #78  <Method StringBuilder StringBuilder.append(String)>
	//   56  127:pop             
			obj1 = ((Object) (((StringBuilder) (obj1)).toString()));
	//   57  128:aload_2         
	//   58  129:invokevirtual   #101 <Method String StringBuilder.toString()>
	//   59  132:astore_2        
			obj = obj1;
	//   60  133:aload_2         
	//   61  134:astore_1        
			if(defaultPart != null)
	//*  62  135:aload_0         
	//*  63  136:getfield        #29  <Field Object defaultPart>
	//*  64  139:ifnull          177
			{
				obj = ((Object) (new StringBuilder()));
	//   65  142:new             #75  <Class StringBuilder>
	//   66  145:dup             
	//   67  146:invokespecial   #91  <Method void StringBuilder()>
	//   68  149:astore_1        
				((StringBuilder) (obj)).append(((String) (obj1)));
	//   69  150:aload_1         
	//   70  151:aload_2         
	//   71  152:invokevirtual   #78  <Method StringBuilder StringBuilder.append(String)>
	//   72  155:pop             
				((StringBuilder) (obj)).append(", defaultPart=");
	//   73  156:aload_1         
	//   74  157:ldc1            #105 <String ", defaultPart=">
	//   75  159:invokevirtual   #78  <Method StringBuilder StringBuilder.append(String)>
	//   76  162:pop             
				((StringBuilder) (obj)).append(stringbuilder1.toString());
	//   77  163:aload_1         
	//   78  164:aload_3         
	//   79  165:invokevirtual   #101 <Method String StringBuilder.toString()>
	//   80  168:invokevirtual   #78  <Method StringBuilder StringBuilder.append(String)>
	//   81  171:pop             
				obj = ((Object) (((StringBuilder) (obj)).toString()));
	//   82  172:aload_1         
	//   83  173:invokevirtual   #101 <Method String StringBuilder.toString()>
	//   84  176:astore_1        
			}
			obj1 = ((Object) (new StringBuilder()));
	//   85  177:new             #75  <Class StringBuilder>
	//   86  180:dup             
	//   87  181:invokespecial   #91  <Method void StringBuilder()>
	//   88  184:astore_2        
			((StringBuilder) (obj1)).append(((String) (obj)));
	//   89  185:aload_2         
	//   90  186:aload_1         
	//   91  187:invokevirtual   #78  <Method StringBuilder StringBuilder.append(String)>
	//   92  190:pop             
			((StringBuilder) (obj1)).append('}');
	//   93  191:aload_2         
	//   94  192:bipush          125
	//   95  194:invokevirtual   #108 <Method StringBuilder StringBuilder.append(char)>
	//   96  197:pop             
			return ((StringBuilder) (obj1)).toString();
	//   97  198:aload_2         
	//   98  199:invokevirtual   #101 <Method String StringBuilder.toString()>
	//   99  202:areturn         

		case 1: // '\001'
			StringBuilder stringbuilder = new StringBuilder();
	//  100  203:new             #75  <Class StringBuilder>
	//  101  206:dup             
	//  102  207:invokespecial   #91  <Method void StringBuilder()>
	//  103  210:astore_1        
			stringbuilder.append("Node{type=");
	//  104  211:aload_1         
	//  105  212:ldc1            #95  <String "Node{type=">
	//  106  214:invokevirtual   #78  <Method StringBuilder StringBuilder.append(String)>
	//  107  217:pop             
			stringbuilder.append(((Object) (type)));
	//  108  218:aload_1         
	//  109  219:aload_0         
	//  110  220:getfield        #23  <Field Node$Type type>
	//  111  223:invokevirtual   #98  <Method StringBuilder StringBuilder.append(Object)>
	//  112  226:pop             
			stringbuilder.append(", payload='");
	//  113  227:aload_1         
	//  114  228:ldc1            #100 <String ", payload='">
	//  115  230:invokevirtual   #78  <Method StringBuilder StringBuilder.append(String)>
	//  116  233:pop             
			stringbuilder.append(payload);
	//  117  234:aload_1         
	//  118  235:aload_0         
	//  119  236:getfield        #25  <Field Object payload>
	//  120  239:invokevirtual   #98  <Method StringBuilder StringBuilder.append(Object)>
	//  121  242:pop             
			stringbuilder.append("'}");
	//  122  243:aload_1         
	//  123  244:ldc1            #110 <String "'}">
	//  124  246:invokevirtual   #78  <Method StringBuilder StringBuilder.append(String)>
	//  125  249:pop             
			return stringbuilder.toString();
	//  126  250:aload_1         
	//  127  251:invokevirtual   #101 <Method String StringBuilder.toString()>
	//  128  254:areturn         
		}
	}

	Object defaultPart;
	Node next;
	Object payload;
	Type type;
}
