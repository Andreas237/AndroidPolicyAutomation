// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.core.subst;

import ch.qos.logback.core.spi.PropertyContainer;
import ch.qos.logback.core.util.OptionHelper;
import java.util.Iterator;
import java.util.Stack;

// Referenced classes of package ch.qos.logback.core.subst:
//			Node, Parser, Tokenizer

public class NodeToStringTransformer
{

	public NodeToStringTransformer(Node node1, PropertyContainer propertycontainer)
	{
		this(node1, propertycontainer, ((PropertyContainer) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aconst_null     
	//    4    4:invokespecial   #16  <Method void NodeToStringTransformer(Node, PropertyContainer, PropertyContainer)>
	//    5    7:return          
	}

	public NodeToStringTransformer(Node node1, PropertyContainer propertycontainer, PropertyContainer propertycontainer1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
		node = node1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #22  <Field Node node>
		propertyContainer0 = propertycontainer;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #24  <Field PropertyContainer propertyContainer0>
		propertyContainer1 = propertycontainer1;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #26  <Field PropertyContainer propertyContainer1>
	//   11   19:return          
	}

	private void compileNode(Node node1, StringBuilder stringbuilder, Stack stack)
	{
		for(; node1 != null; node1 = node1.next)
	//*   0    0:aload_1         
	//*   1    1:ifnull          63
		{
			static class _cls1
			{

				static final int $SwitchMap$ch$qos$logback$core$subst$Node$Type[];

				static 
				{
					$SwitchMap$ch$qos$logback$core$subst$Node$Type = new int[Node.Type.values().length];
				//    0    0:invokestatic    #18  <Method Node$Type[] Node$Type.values()>
				//    1    3:arraylength     
				//    2    4:newarray        int[]
				//    3    6:putstatic       #20  <Field int[] $SwitchMap$ch$qos$logback$core$subst$Node$Type>
					try
					{
						$SwitchMap$ch$qos$logback$core$subst$Node$Type[Node.Type.LITERAL.ordinal()] = 1;
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
						$SwitchMap$ch$qos$logback$core$subst$Node$Type[Node.Type.VARIABLE.ordinal()] = 2;
					}
				//*  16   33:goto            20
					catch(NoSuchFieldError nosuchfielderror1) { }
				//   17   36:astore_0        
				//*  18   37:return          
				}
			}

			switch(_cls1..SwitchMap.ch.qos.logback.core.subst.Node.Type[node1.type.ordinal()])
	//*   2    4:getstatic       #32  <Field int[] NodeToStringTransformer$1.$SwitchMap$ch$qos$logback$core$subst$Node$Type>
	//*   3    7:aload_1         
	//*   4    8:getfield        #38  <Field Node$Type Node.type>
	//*   5   11:invokevirtual   #44  <Method int Node$Type.ordinal()>
	//*   6   14:iaload          
			{
	//*   7   15:tableswitch     1 2: default 36
	//	               1 49
	//	               2 39
	//*   8   36:goto            55
			case 2: // '\002'
				handleVariable(node1, stringbuilder, stack);
	//    9   39:aload_0         
	//   10   40:aload_1         
	//   11   41:aload_2         
	//   12   42:aload_3         
	//   13   43:invokespecial   #47  <Method void handleVariable(Node, StringBuilder, Stack)>
				break;

	//*  14   46:goto            55
			case 1: // '\001'
				handleLiteral(node1, stringbuilder);
	//   15   49:aload_0         
	//   16   50:aload_1         
	//   17   51:aload_2         
	//   18   52:invokespecial   #51  <Method void handleLiteral(Node, StringBuilder)>
				break;
			}
		}

	//   19   55:aload_1         
	//   20   56:getfield        #54  <Field Node Node.next>
	//   21   59:astore_1        
	//*  22   60:goto            0
	//   23   63:return          
	}

	private String constructRecursionErrorMessage(Stack stack)
	{
		StringBuilder stringbuilder = new StringBuilder("Circular variable reference detected while parsing input [");
	//    0    0:new             #60  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:ldc1            #62  <String "Circular variable reference detected while parsing input [">
	//    3    6:invokespecial   #65  <Method void StringBuilder(String)>
	//    4    9:astore_2        
		Iterator iterator = stack.iterator();
	//    5   10:aload_1         
	//    6   11:invokevirtual   #71  <Method Iterator Stack.iterator()>
	//    7   14:astore_3        
		do
		{
			if(!iterator.hasNext())
				break;
	//    8   15:aload_3         
	//    9   16:invokeinterface #77  <Method boolean Iterator.hasNext()>
	//   10   21:ifeq            79
			Node node1 = (Node)iterator.next();
	//   11   24:aload_3         
	//   12   25:invokeinterface #80  <Method Object Iterator.next()>
	//   13   30:checkcast       #34  <Class Node>
	//   14   33:astore          4
			stringbuilder.append("${");
	//   15   35:aload_2         
	//   16   36:ldc1            #82  <String "${">
	//   17   38:invokevirtual   #86  <Method StringBuilder StringBuilder.append(String)>
	//   18   41:pop             
			stringbuilder.append(variableNodeValue(node1));
	//   19   42:aload_2         
	//   20   43:aload_0         
	//   21   44:aload           4
	//   22   46:invokespecial   #90  <Method String variableNodeValue(Node)>
	//   23   49:invokevirtual   #86  <Method StringBuilder StringBuilder.append(String)>
	//   24   52:pop             
			stringbuilder.append("}");
	//   25   53:aload_2         
	//   26   54:ldc1            #92  <String "}">
	//   27   56:invokevirtual   #86  <Method StringBuilder StringBuilder.append(String)>
	//   28   59:pop             
			if(stack.lastElement() != node1)
	//*  29   60:aload_1         
	//*  30   61:invokevirtual   #95  <Method Object Stack.lastElement()>
	//*  31   64:aload           4
	//*  32   66:if_acmpeq       15
				stringbuilder.append(" --> ");
	//   33   69:aload_2         
	//   34   70:ldc1            #97  <String " --> ">
	//   35   72:invokevirtual   #86  <Method StringBuilder StringBuilder.append(String)>
	//   36   75:pop             
		} while(true);
	//   37   76:goto            15
		stringbuilder.append("]");
	//   38   79:aload_2         
	//   39   80:ldc1            #99  <String "]">
	//   40   82:invokevirtual   #86  <Method StringBuilder StringBuilder.append(String)>
	//   41   85:pop             
		return stringbuilder.toString();
	//   42   86:aload_2         
	//   43   87:invokevirtual   #103 <Method String StringBuilder.toString()>
	//   44   90:areturn         
	}

	private boolean equalNodes(Node node1, Node node2)
	{
		if(node1.type != null && !node1.type.equals(((Object) (node2.type))))
	//*   0    0:aload_1         
	//*   1    1:getfield        #38  <Field Node$Type Node.type>
	//*   2    4:ifnull          23
	//*   3    7:aload_1         
	//*   4    8:getfield        #38  <Field Node$Type Node.type>
	//*   5   11:aload_2         
	//*   6   12:getfield        #38  <Field Node$Type Node.type>
	//*   7   15:invokevirtual   #110 <Method boolean Node$Type.equals(Object)>
	//*   8   18:ifne            23
			return false;
	//    9   21:iconst_0        
	//   10   22:ireturn         
		if(node1.payload != null && !node1.payload.equals(node2.payload))
	//*  11   23:aload_1         
	//*  12   24:getfield        #114 <Field Object Node.payload>
	//*  13   27:ifnull          46
	//*  14   30:aload_1         
	//*  15   31:getfield        #114 <Field Object Node.payload>
	//*  16   34:aload_2         
	//*  17   35:getfield        #114 <Field Object Node.payload>
	//*  18   38:invokevirtual   #115 <Method boolean Object.equals(Object)>
	//*  19   41:ifne            46
			return false;
	//   20   44:iconst_0        
	//   21   45:ireturn         
		return node1.defaultPart == null || node1.defaultPart.equals(node2.defaultPart);
	//   22   46:aload_1         
	//   23   47:getfield        #118 <Field Object Node.defaultPart>
	//   24   50:ifnull          69
	//   25   53:aload_1         
	//   26   54:getfield        #118 <Field Object Node.defaultPart>
	//   27   57:aload_2         
	//   28   58:getfield        #118 <Field Object Node.defaultPart>
	//   29   61:invokevirtual   #115 <Method boolean Object.equals(Object)>
	//   30   64:ifne            69
	//   31   67:iconst_0        
	//   32   68:ireturn         
	//   33   69:iconst_1        
	//   34   70:ireturn         
	}

	private void handleLiteral(Node node1, StringBuilder stringbuilder)
	{
		stringbuilder.append((String)node1.payload);
	//    0    0:aload_2         
	//    1    1:aload_1         
	//    2    2:getfield        #114 <Field Object Node.payload>
	//    3    5:checkcast       #120 <Class String>
	//    4    8:invokevirtual   #86  <Method StringBuilder StringBuilder.append(String)>
	//    5   11:pop             
	//    6   12:return          
	}

	private void handleVariable(Node node1, StringBuilder stringbuilder, Stack stack)
	{
		if(haveVisitedNodeAlready(node1, stack))
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:aload_3         
	//*   3    3:invokespecial   #124 <Method boolean haveVisitedNodeAlready(Node, Stack)>
	//*   4    6:ifeq            28
		{
			stack.push(((Object) (node1)));
	//    5    9:aload_3         
	//    6   10:aload_1         
	//    7   11:invokevirtual   #128 <Method Object Stack.push(Object)>
	//    8   14:pop             
			throw new IllegalArgumentException(constructRecursionErrorMessage(stack));
	//    9   15:new             #130 <Class IllegalArgumentException>
	//   10   18:dup             
	//   11   19:aload_0         
	//   12   20:aload_3         
	//   13   21:invokespecial   #132 <Method String constructRecursionErrorMessage(Stack)>
	//   14   24:invokespecial   #133 <Method void IllegalArgumentException(String)>
	//   15   27:athrow          
		}
		stack.push(((Object) (node1)));
	//   16   28:aload_3         
	//   17   29:aload_1         
	//   18   30:invokevirtual   #128 <Method Object Stack.push(Object)>
	//   19   33:pop             
		Object obj = ((Object) (new StringBuilder()));
	//   20   34:new             #60  <Class StringBuilder>
	//   21   37:dup             
	//   22   38:invokespecial   #134 <Method void StringBuilder()>
	//   23   41:astore          4
		compileNode((Node)node1.payload, ((StringBuilder) (obj)), stack);
	//   24   43:aload_0         
	//   25   44:aload_1         
	//   26   45:getfield        #114 <Field Object Node.payload>
	//   27   48:checkcast       #34  <Class Node>
	//   28   51:aload           4
	//   29   53:aload_3         
	//   30   54:invokespecial   #136 <Method void compileNode(Node, StringBuilder, Stack)>
		obj = ((Object) (((StringBuilder) (obj)).toString()));
	//   31   57:aload           4
	//   32   59:invokevirtual   #103 <Method String StringBuilder.toString()>
	//   33   62:astore          4
		String s = lookupKey(((String) (obj)));
	//   34   64:aload_0         
	//   35   65:aload           4
	//   36   67:invokespecial   #140 <Method String lookupKey(String)>
	//   37   70:astore          5
		if(s != null)
	//*  38   72:aload           5
	//*  39   74:ifnull          94
		{
			compileNode(tokenizeAndParseString(s), stringbuilder, stack);
	//   40   77:aload_0         
	//   41   78:aload           5
	//   42   80:invokestatic    #144 <Method Node tokenizeAndParseString(String)>
	//   43   83:aload_2         
	//   44   84:aload_3         
	//   45   85:invokespecial   #136 <Method void compileNode(Node, StringBuilder, Stack)>
			stack.pop();
	//   46   88:aload_3         
	//   47   89:invokevirtual   #147 <Method Object Stack.pop()>
	//   48   92:pop             
			return;
	//   49   93:return          
		}
		if(node1.defaultPart == null)
	//*  50   94:aload_1         
	//*  51   95:getfield        #118 <Field Object Node.defaultPart>
	//*  52   98:ifnonnull       138
		{
			node1 = ((Node) (new StringBuilder()));
	//   53  101:new             #60  <Class StringBuilder>
	//   54  104:dup             
	//   55  105:invokespecial   #134 <Method void StringBuilder()>
	//   56  108:astore_1        
			((StringBuilder) (node1)).append(((String) (obj)));
	//   57  109:aload_1         
	//   58  110:aload           4
	//   59  112:invokevirtual   #86  <Method StringBuilder StringBuilder.append(String)>
	//   60  115:pop             
			((StringBuilder) (node1)).append("_IS_UNDEFINED");
	//   61  116:aload_1         
	//   62  117:ldc1            #149 <String "_IS_UNDEFINED">
	//   63  119:invokevirtual   #86  <Method StringBuilder StringBuilder.append(String)>
	//   64  122:pop             
			stringbuilder.append(((StringBuilder) (node1)).toString());
	//   65  123:aload_2         
	//   66  124:aload_1         
	//   67  125:invokevirtual   #103 <Method String StringBuilder.toString()>
	//   68  128:invokevirtual   #86  <Method StringBuilder StringBuilder.append(String)>
	//   69  131:pop             
			stack.pop();
	//   70  132:aload_3         
	//   71  133:invokevirtual   #147 <Method Object Stack.pop()>
	//   72  136:pop             
			return;
	//   73  137:return          
		} else
		{
			node1 = (Node)node1.defaultPart;
	//   74  138:aload_1         
	//   75  139:getfield        #118 <Field Object Node.defaultPart>
	//   76  142:checkcast       #34  <Class Node>
	//   77  145:astore_1        
			StringBuilder stringbuilder1 = new StringBuilder();
	//   78  146:new             #60  <Class StringBuilder>
	//   79  149:dup             
	//   80  150:invokespecial   #134 <Method void StringBuilder()>
	//   81  153:astore          4
			compileNode(node1, stringbuilder1, stack);
	//   82  155:aload_0         
	//   83  156:aload_1         
	//   84  157:aload           4
	//   85  159:aload_3         
	//   86  160:invokespecial   #136 <Method void compileNode(Node, StringBuilder, Stack)>
			stack.pop();
	//   87  163:aload_3         
	//   88  164:invokevirtual   #147 <Method Object Stack.pop()>
	//   89  167:pop             
			stringbuilder.append(stringbuilder1.toString());
	//   90  168:aload_2         
	//   91  169:aload           4
	//   92  171:invokevirtual   #103 <Method String StringBuilder.toString()>
	//   93  174:invokevirtual   #86  <Method StringBuilder StringBuilder.append(String)>
	//   94  177:pop             
			return;
	//   95  178:return          
		}
	}

	private boolean haveVisitedNodeAlready(Node node1, Stack stack)
	{
		for(stack = ((Stack) (stack.iterator())); ((Iterator) (stack)).hasNext();)
	//*   0    0:aload_2         
	//*   1    1:invokevirtual   #71  <Method Iterator Stack.iterator()>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:invokeinterface #77  <Method boolean Iterator.hasNext()>
	//*   5   11:ifeq            33
			if(equalNodes(node1, (Node)((Iterator) (stack)).next()))
	//*   6   14:aload_0         
	//*   7   15:aload_1         
	//*   8   16:aload_2         
	//*   9   17:invokeinterface #80  <Method Object Iterator.next()>
	//*  10   22:checkcast       #34  <Class Node>
	//*  11   25:invokespecial   #151 <Method boolean equalNodes(Node, Node)>
	//*  12   28:ifeq            5
				return true;
	//   13   31:iconst_1        
	//   14   32:ireturn         

		return false;
	//   15   33:iconst_0        
	//   16   34:ireturn         
	}

	private String lookupKey(String s)
	{
		String s1 = propertyContainer0.getProperty(s);
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field PropertyContainer propertyContainer0>
	//    2    4:aload_1         
	//    3    5:invokeinterface #157 <Method String PropertyContainer.getProperty(String)>
	//    4   10:astore_2        
		if(s1 != null)
	//*   5   11:aload_2         
	//*   6   12:ifnull          17
			return s1;
	//    7   15:aload_2         
	//    8   16:areturn         
		if(propertyContainer1 != null)
	//*   9   17:aload_0         
	//*  10   18:getfield        #26  <Field PropertyContainer propertyContainer1>
	//*  11   21:ifnull          41
		{
			s1 = propertyContainer1.getProperty(s);
	//   12   24:aload_0         
	//   13   25:getfield        #26  <Field PropertyContainer propertyContainer1>
	//   14   28:aload_1         
	//   15   29:invokeinterface #157 <Method String PropertyContainer.getProperty(String)>
	//   16   34:astore_2        
			if(s1 != null)
	//*  17   35:aload_2         
	//*  18   36:ifnull          41
				return s1;
	//   19   39:aload_2         
	//   20   40:areturn         
		}
		s1 = OptionHelper.getSystemProperty(s, ((String) (null)));
	//   21   41:aload_1         
	//   22   42:aconst_null     
	//   23   43:invokestatic    #163 <Method String OptionHelper.getSystemProperty(String, String)>
	//   24   46:astore_2        
		if(s1 != null)
	//*  25   47:aload_2         
	//*  26   48:ifnull          53
			return s1;
	//   27   51:aload_2         
	//   28   52:areturn         
		s = OptionHelper.getEnv(s);
	//   29   53:aload_1         
	//   30   54:invokestatic    #166 <Method String OptionHelper.getEnv(String)>
	//   31   57:astore_1        
		if(s != null)
	//*  32   58:aload_1         
	//*  33   59:ifnull          64
			return s;
	//   34   62:aload_1         
	//   35   63:areturn         
		else
			return null;
	//   36   64:aconst_null     
	//   37   65:areturn         
	}

	public static String substituteVariable(String s, PropertyContainer propertycontainer, PropertyContainer propertycontainer1)
	{
		return (new NodeToStringTransformer(tokenizeAndParseString(s), propertycontainer, propertycontainer1)).transform();
	//    0    0:new             #2   <Class NodeToStringTransformer>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokestatic    #144 <Method Node tokenizeAndParseString(String)>
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:invokespecial   #16  <Method void NodeToStringTransformer(Node, PropertyContainer, PropertyContainer)>
	//    7   13:invokevirtual   #171 <Method String transform()>
	//    8   16:areturn         
	}

	private static Node tokenizeAndParseString(String s)
	{
		return (new Parser((new Tokenizer(s)).tokenize())).parse();
	//    0    0:new             #173 <Class Parser>
	//    1    3:dup             
	//    2    4:new             #175 <Class Tokenizer>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:invokespecial   #176 <Method void Tokenizer(String)>
	//    6   12:invokevirtual   #180 <Method java.util.List Tokenizer.tokenize()>
	//    7   15:invokespecial   #183 <Method void Parser(java.util.List)>
	//    8   18:invokevirtual   #187 <Method Node Parser.parse()>
	//    9   21:areturn         
	}

	private String variableNodeValue(Node node1)
	{
		return (String)((Node)node1.payload).payload;
	//    0    0:aload_1         
	//    1    1:getfield        #114 <Field Object Node.payload>
	//    2    4:checkcast       #34  <Class Node>
	//    3    7:getfield        #114 <Field Object Node.payload>
	//    4   10:checkcast       #120 <Class String>
	//    5   13:areturn         
	}

	public String transform()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #60  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #134 <Method void StringBuilder()>
	//    3    7:astore_1        
		compileNode(node, stringbuilder, new Stack());
	//    4    8:aload_0         
	//    5    9:aload_0         
	//    6   10:getfield        #22  <Field Node node>
	//    7   13:aload_1         
	//    8   14:new             #67  <Class Stack>
	//    9   17:dup             
	//   10   18:invokespecial   #188 <Method void Stack()>
	//   11   21:invokespecial   #136 <Method void compileNode(Node, StringBuilder, Stack)>
		return stringbuilder.toString();
	//   12   24:aload_1         
	//   13   25:invokevirtual   #103 <Method String StringBuilder.toString()>
	//   14   28:areturn         
	}

	final Node node;
	final PropertyContainer propertyContainer0;
	final PropertyContainer propertyContainer1;
}
