// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.core.pattern.parser;

import ch.qos.logback.core.pattern.*;
import ch.qos.logback.core.pattern.util.IEscapeUtil;
import ch.qos.logback.core.pattern.util.RegularEscapeUtil;
import ch.qos.logback.core.spi.ContextAwareBase;
import ch.qos.logback.core.spi.ScanException;
import java.util.*;

// Referenced classes of package ch.qos.logback.core.pattern.parser:
//			Token, TokenStream, CompositeNode, Node, 
//			SimpleKeywordNode, FormattingNode, Compiler

public class Parser extends ContextAwareBase
{

	Parser(TokenStream tokenstream)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #62  <Method void ContextAwareBase()>
		pointer = 0;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #64  <Field int pointer>
		tokenList = tokenstream.tokenize();
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:invokevirtual   #70  <Method List TokenStream.tokenize()>
	//    8   14:putfield        #72  <Field List tokenList>
	//    9   17:return          
	}

	public Parser(String s)
	{
		this(s, ((IEscapeUtil) (new RegularEscapeUtil())));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:new             #75  <Class RegularEscapeUtil>
	//    3    5:dup             
	//    4    6:invokespecial   #76  <Method void RegularEscapeUtil()>
	//    5    9:invokespecial   #79  <Method void Parser(String, IEscapeUtil)>
	//    6   12:return          
	}

	public Parser(String s, IEscapeUtil iescapeutil)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #62  <Method void ContextAwareBase()>
		pointer = 0;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #64  <Field int pointer>
		try
		{
			tokenList = (new TokenStream(s, iescapeutil)).tokenize();
	//    5    9:aload_0         
	//    6   10:new             #66  <Class TokenStream>
	//    7   13:dup             
	//    8   14:aload_1         
	//    9   15:aload_2         
	//   10   16:invokespecial   #82  <Method void TokenStream(String, IEscapeUtil)>
	//   11   19:invokevirtual   #70  <Method List TokenStream.tokenize()>
	//   12   22:putfield        #72  <Field List tokenList>
			return;
	//   13   25:return          
		}
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  14   26:astore_1        
		{
			throw new ScanException("Failed to initialize Parser", ((Throwable) (s)));
	//   15   27:new             #84  <Class ScanException>
	//   16   30:dup             
	//   17   31:ldc1            #86  <String "Failed to initialize Parser">
	//   18   33:aload_1         
	//   19   34:invokespecial   #89  <Method void ScanException(String, Throwable)>
	//   20   37:athrow          
		}
	}

	FormattingNode C()
	{
		Token token = getCurentToken();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #95  <Method Token getCurentToken()>
	//    2    4:astore_1        
		expectNotNull(token, "a LEFT_PARENTHESIS or KEYWORD");
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:ldc1            #97  <String "a LEFT_PARENTHESIS or KEYWORD">
	//    6    9:invokevirtual   #101 <Method void expectNotNull(Token, String)>
		switch(token.getType())
	//*   7   12:aload_1         
	//*   8   13:invokevirtual   #105 <Method int Token.getType()>
		{
	//*   9   16:tableswitch     1004 1005: default 40
	//	               1004 89
	//	               1005 73
		default:
			StringBuilder stringbuilder = new StringBuilder();
	//   10   40:new             #107 <Class StringBuilder>
	//   11   43:dup             
	//   12   44:invokespecial   #108 <Method void StringBuilder()>
	//   13   47:astore_2        
			stringbuilder.append("Unexpected token ");
	//   14   48:aload_2         
	//   15   49:ldc1            #110 <String "Unexpected token ">
	//   16   51:invokevirtual   #114 <Method StringBuilder StringBuilder.append(String)>
	//   17   54:pop             
			stringbuilder.append(((Object) (token)));
	//   18   55:aload_2         
	//   19   56:aload_1         
	//   20   57:invokevirtual   #117 <Method StringBuilder StringBuilder.append(Object)>
	//   21   60:pop             
			throw new IllegalStateException(stringbuilder.toString());
	//   22   61:new             #119 <Class IllegalStateException>
	//   23   64:dup             
	//   24   65:aload_2         
	//   25   66:invokevirtual   #120 <Method String StringBuilder.toString()>
	//   26   69:invokespecial   #122 <Method void IllegalStateException(String)>
	//   27   72:athrow          

		case 1005: 
			advanceTokenPointer();
	//   28   73:aload_0         
	//   29   74:invokevirtual   #125 <Method void advanceTokenPointer()>
			return COMPOSITE(token.getValue().toString());
	//   30   77:aload_0         
	//   31   78:aload_1         
	//   32   79:invokevirtual   #38  <Method Object Token.getValue()>
	//   33   82:invokevirtual   #44  <Method String Object.toString()>
	//   34   85:invokevirtual   #129 <Method FormattingNode COMPOSITE(String)>
	//   35   88:areturn         

		case 1004: 
			return SINGLE();
	//   36   89:aload_0         
	//   37   90:invokevirtual   #132 <Method FormattingNode SINGLE()>
	//   38   93:areturn         
		}
	}

	FormattingNode COMPOSITE(String s)
	{
		s = ((String) (new CompositeNode(s)));
	//    0    0:new             #134 <Class CompositeNode>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #135 <Method void CompositeNode(String)>
	//    4    8:astore_1        
		((CompositeNode) (s)).setChildNode(E());
	//    5    9:aload_1         
	//    6   10:aload_0         
	//    7   11:invokevirtual   #139 <Method Node E()>
	//    8   14:invokevirtual   #143 <Method void CompositeNode.setChildNode(Node)>
		Token token = getNextToken();
	//    9   17:aload_0         
	//   10   18:invokevirtual   #146 <Method Token getNextToken()>
	//   11   21:astore_2        
		if(token != null && token.getType() == 41)
	//*  12   22:aload_2         
	//*  13   23:ifnull          74
	//*  14   26:aload_2         
	//*  15   27:invokevirtual   #105 <Method int Token.getType()>
	//*  16   30:bipush          41
	//*  17   32:icmpeq          38
	//*  18   35:goto            74
		{
			token = getCurentToken();
	//   19   38:aload_0         
	//   20   39:invokevirtual   #95  <Method Token getCurentToken()>
	//   21   42:astore_2        
			if(token != null && token.getType() == 1006)
	//*  22   43:aload_2         
	//*  23   44:ifnull          72
	//*  24   47:aload_2         
	//*  25   48:invokevirtual   #105 <Method int Token.getType()>
	//*  26   51:sipush          1006
	//*  27   54:icmpne          72
			{
				((CompositeNode) (s)).setOptions((List)token.getValue());
	//   28   57:aload_1         
	//   29   58:aload_2         
	//   30   59:invokevirtual   #38  <Method Object Token.getValue()>
	//   31   62:checkcast       #148 <Class List>
	//   32   65:invokevirtual   #152 <Method void CompositeNode.setOptions(List)>
				advanceTokenPointer();
	//   33   68:aload_0         
	//   34   69:invokevirtual   #125 <Method void advanceTokenPointer()>
			}
			return ((FormattingNode) (s));
	//   35   72:aload_1         
	//   36   73:areturn         
		} else
		{
			s = ((String) (new StringBuilder()));
	//   37   74:new             #107 <Class StringBuilder>
	//   38   77:dup             
	//   39   78:invokespecial   #108 <Method void StringBuilder()>
	//   40   81:astore_1        
			((StringBuilder) (s)).append("Expecting RIGHT_PARENTHESIS token but got ");
	//   41   82:aload_1         
	//   42   83:ldc1            #154 <String "Expecting RIGHT_PARENTHESIS token but got ">
	//   43   85:invokevirtual   #114 <Method StringBuilder StringBuilder.append(String)>
	//   44   88:pop             
			((StringBuilder) (s)).append(((Object) (token)));
	//   45   89:aload_1         
	//   46   90:aload_2         
	//   47   91:invokevirtual   #117 <Method StringBuilder StringBuilder.append(Object)>
	//   48   94:pop             
			s = ((StringBuilder) (s)).toString();
	//   49   95:aload_1         
	//   50   96:invokevirtual   #120 <Method String StringBuilder.toString()>
	//   51   99:astore_1        
			addError(s);
	//   52  100:aload_0         
	//   53  101:aload_1         
	//   54  102:invokevirtual   #157 <Method void addError(String)>
			addError("See also http://logback.qos.ch/codes.html#missingRightParenthesis");
	//   55  105:aload_0         
	//   56  106:ldc1            #159 <String "See also http://logback.qos.ch/codes.html#missingRightParenthesis">
	//   57  108:invokevirtual   #157 <Method void addError(String)>
			throw new ScanException(s);
	//   58  111:new             #84  <Class ScanException>
	//   59  114:dup             
	//   60  115:aload_1         
	//   61  116:invokespecial   #160 <Method void ScanException(String)>
	//   62  119:athrow          
		}
	}

	Node E()
	{
		Node node = T();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #163 <Method Node T()>
	//    2    4:astore_1        
		if(node == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       11
			return null;
	//    5    9:aconst_null     
	//    6   10:areturn         
		Node node1 = Eopt();
	//    7   11:aload_0         
	//    8   12:invokevirtual   #166 <Method Node Eopt()>
	//    9   15:astore_2        
		if(node1 != null)
	//*  10   16:aload_2         
	//*  11   17:ifnull          25
			node.setNext(node1);
	//   12   20:aload_1         
	//   13   21:aload_2         
	//   14   22:invokevirtual   #171 <Method void Node.setNext(Node)>
		return node;
	//   15   25:aload_1         
	//   16   26:areturn         
	}

	Node Eopt()
	{
		if(getCurentToken() == null)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #95  <Method Token getCurentToken()>
	//*   2    4:ifnonnull       9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		else
			return E();
	//    5    9:aload_0         
	//    6   10:invokevirtual   #139 <Method Node E()>
	//    7   13:areturn         
	}

	FormattingNode SINGLE()
	{
		SimpleKeywordNode simplekeywordnode = new SimpleKeywordNode(getNextToken().getValue());
	//    0    0:new             #173 <Class SimpleKeywordNode>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #146 <Method Token getNextToken()>
	//    4    8:invokevirtual   #38  <Method Object Token.getValue()>
	//    5   11:invokespecial   #176 <Method void SimpleKeywordNode(Object)>
	//    6   14:astore_1        
		Token token = getCurentToken();
	//    7   15:aload_0         
	//    8   16:invokevirtual   #95  <Method Token getCurentToken()>
	//    9   19:astore_2        
		if(token != null && token.getType() == 1006)
	//*  10   20:aload_2         
	//*  11   21:ifnull          49
	//*  12   24:aload_2         
	//*  13   25:invokevirtual   #105 <Method int Token.getType()>
	//*  14   28:sipush          1006
	//*  15   31:icmpne          49
		{
			simplekeywordnode.setOptions((List)token.getValue());
	//   16   34:aload_1         
	//   17   35:aload_2         
	//   18   36:invokevirtual   #38  <Method Object Token.getValue()>
	//   19   39:checkcast       #148 <Class List>
	//   20   42:invokevirtual   #177 <Method void SimpleKeywordNode.setOptions(List)>
			advanceTokenPointer();
	//   21   45:aload_0         
	//   22   46:invokevirtual   #125 <Method void advanceTokenPointer()>
		}
		return ((FormattingNode) (simplekeywordnode));
	//   23   49:aload_1         
	//   24   50:areturn         
	}

	Node T()
	{
		Object obj = ((Object) (getCurentToken()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #95  <Method Token getCurentToken()>
	//    2    4:astore_2        
		expectNotNull(((Token) (obj)), "a LITERAL or '%'");
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:ldc1            #179 <String "a LITERAL or '%'">
	//    6    9:invokevirtual   #101 <Method void expectNotNull(Token, String)>
		int i = ((Token) (obj)).getType();
	//    7   12:aload_2         
	//    8   13:invokevirtual   #105 <Method int Token.getType()>
	//    9   16:istore_1        
		if(i != 37)
	//*  10   17:iload_1         
	//*  11   18:bipush          37
	//*  12   20:icmpeq          49
			if(i != 1000)
	//*  13   23:iload_1         
	//*  14   24:sipush          1000
	//*  15   27:icmpeq          32
			{
				return null;
	//   16   30:aconst_null     
	//   17   31:areturn         
			} else
			{
				advanceTokenPointer();
	//   18   32:aload_0         
	//   19   33:invokevirtual   #125 <Method void advanceTokenPointer()>
				return new Node(0, ((Token) (obj)).getValue());
	//   20   36:new             #168 <Class Node>
	//   21   39:dup             
	//   22   40:iconst_0        
	//   23   41:aload_2         
	//   24   42:invokevirtual   #38  <Method Object Token.getValue()>
	//   25   45:invokespecial   #182 <Method void Node(int, Object)>
	//   26   48:areturn         
			}
		advanceTokenPointer();
	//   27   49:aload_0         
	//   28   50:invokevirtual   #125 <Method void advanceTokenPointer()>
		obj = ((Object) (getCurentToken()));
	//   29   53:aload_0         
	//   30   54:invokevirtual   #95  <Method Token getCurentToken()>
	//   31   57:astore_2        
		expectNotNull(((Token) (obj)), "a FORMAT_MODIFIER, SIMPLE_KEYWORD or COMPOUND_KEYWORD");
	//   32   58:aload_0         
	//   33   59:aload_2         
	//   34   60:ldc1            #184 <String "a FORMAT_MODIFIER, SIMPLE_KEYWORD or COMPOUND_KEYWORD">
	//   35   62:invokevirtual   #101 <Method void expectNotNull(Token, String)>
		if(((Token) (obj)).getType() == 1002)
	//*  36   65:aload_2         
	//*  37   66:invokevirtual   #105 <Method int Token.getType()>
	//*  38   69:sipush          1002
	//*  39   72:icmpne          102
		{
			obj = ((Object) (FormatInfo.valueOf((String)((Token) (obj)).getValue())));
	//   40   75:aload_2         
	//   41   76:invokevirtual   #38  <Method Object Token.getValue()>
	//   42   79:checkcast       #186 <Class String>
	//   43   82:invokestatic    #192 <Method FormatInfo FormatInfo.valueOf(String)>
	//   44   85:astore_2        
			advanceTokenPointer();
	//   45   86:aload_0         
	//   46   87:invokevirtual   #125 <Method void advanceTokenPointer()>
			FormattingNode formattingnode = C();
	//   47   90:aload_0         
	//   48   91:invokevirtual   #194 <Method FormattingNode C()>
	//   49   94:astore_3        
			formattingnode.setFormatInfo(((FormatInfo) (obj)));
	//   50   95:aload_3         
	//   51   96:aload_2         
	//   52   97:invokevirtual   #200 <Method void FormattingNode.setFormatInfo(FormatInfo)>
			return ((Node) (formattingnode));
	//   53  100:aload_3         
	//   54  101:areturn         
		} else
		{
			return ((Node) (C()));
	//   55  102:aload_0         
	//   56  103:invokevirtual   #194 <Method FormattingNode C()>
	//   57  106:areturn         
		}
	}

	void advanceTokenPointer()
	{
		pointer = pointer + 1;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #64  <Field int pointer>
	//    3    5:iconst_1        
	//    4    6:iadd            
	//    5    7:putfield        #64  <Field int pointer>
	//    6   10:return          
	}

	public Converter compile(Node node, Map map)
	{
		node = ((Node) (new Compiler(node, map)));
	//    0    0:new             #204 <Class Compiler>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokespecial   #207 <Method void Compiler(Node, Map)>
	//    5    9:astore_1        
		((Compiler) (node)).setContext(context);
	//    6   10:aload_1         
	//    7   11:aload_0         
	//    8   12:getfield        #211 <Field ch.qos.logback.core.Context context>
	//    9   15:invokevirtual   #215 <Method void Compiler.setContext(ch.qos.logback.core.Context)>
		return ((Compiler) (node)).compile();
	//   10   18:aload_1         
	//   11   19:invokevirtual   #218 <Method Converter Compiler.compile()>
	//   12   22:areturn         
	}

	void expectNotNull(Token token, String s)
	{
		if(token == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       37
		{
			token = ((Token) (new StringBuilder()));
	//    2    4:new             #107 <Class StringBuilder>
	//    3    7:dup             
	//    4    8:invokespecial   #108 <Method void StringBuilder()>
	//    5   11:astore_1        
			((StringBuilder) (token)).append("All tokens consumed but was expecting ");
	//    6   12:aload_1         
	//    7   13:ldc1            #222 <String "All tokens consumed but was expecting ">
	//    8   15:invokevirtual   #114 <Method StringBuilder StringBuilder.append(String)>
	//    9   18:pop             
			((StringBuilder) (token)).append(s);
	//   10   19:aload_1         
	//   11   20:aload_2         
	//   12   21:invokevirtual   #114 <Method StringBuilder StringBuilder.append(String)>
	//   13   24:pop             
			throw new IllegalStateException(((StringBuilder) (token)).toString());
	//   14   25:new             #119 <Class IllegalStateException>
	//   15   28:dup             
	//   16   29:aload_1         
	//   17   30:invokevirtual   #120 <Method String StringBuilder.toString()>
	//   18   33:invokespecial   #122 <Method void IllegalStateException(String)>
	//   19   36:athrow          
		} else
		{
			return;
	//   20   37:return          
		}
	}

	Token getCurentToken()
	{
		if(pointer < tokenList.size())
	//*   0    0:aload_0         
	//*   1    1:getfield        #64  <Field int pointer>
	//*   2    4:aload_0         
	//*   3    5:getfield        #72  <Field List tokenList>
	//*   4    8:invokeinterface #225 <Method int List.size()>
	//*   5   13:icmpge          33
			return (Token)tokenList.get(pointer);
	//    6   16:aload_0         
	//    7   17:getfield        #72  <Field List tokenList>
	//    8   20:aload_0         
	//    9   21:getfield        #64  <Field int pointer>
	//   10   24:invokeinterface #229 <Method Object List.get(int)>
	//   11   29:checkcast       #30  <Class Token>
	//   12   32:areturn         
		else
			return null;
	//   13   33:aconst_null     
	//   14   34:areturn         
	}

	Token getNextToken()
	{
		if(pointer < tokenList.size())
	//*   0    0:aload_0         
	//*   1    1:getfield        #64  <Field int pointer>
	//*   2    4:aload_0         
	//*   3    5:getfield        #72  <Field List tokenList>
	//*   4    8:invokeinterface #225 <Method int List.size()>
	//*   5   13:icmpge          44
		{
			List list = tokenList;
	//    6   16:aload_0         
	//    7   17:getfield        #72  <Field List tokenList>
	//    8   20:astore_2        
			int i = pointer;
	//    9   21:aload_0         
	//   10   22:getfield        #64  <Field int pointer>
	//   11   25:istore_1        
			pointer = i + 1;
	//   12   26:aload_0         
	//   13   27:iload_1         
	//   14   28:iconst_1        
	//   15   29:iadd            
	//   16   30:putfield        #64  <Field int pointer>
			return (Token)list.get(i);
	//   17   33:aload_2         
	//   18   34:iload_1         
	//   19   35:invokeinterface #229 <Method Object List.get(int)>
	//   20   40:checkcast       #30  <Class Token>
	//   21   43:areturn         
		} else
		{
			return null;
	//   22   44:aconst_null     
	//   23   45:areturn         
		}
	}

	public Node parse()
	{
		return E();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #139 <Method Node E()>
	//    2    4:areturn         
	}

	public static final Map DEFAULT_COMPOSITE_CONVERTER_MAP;
	public static final String MISSING_RIGHT_PARENTHESIS = "http://logback.qos.ch/codes.html#missingRightParenthesis";
	public static final String REPLACE_CONVERTER_WORD = "replace";
	int pointer;
	final List tokenList;

	static 
	{
		DEFAULT_COMPOSITE_CONVERTER_MAP = ((Map) (new HashMap()));
	//    0    0:new             #23  <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #26  <Method void HashMap()>
	//    3    7:putstatic       #28  <Field Map DEFAULT_COMPOSITE_CONVERTER_MAP>
		DEFAULT_COMPOSITE_CONVERTER_MAP.put(((Object) (Token.BARE_COMPOSITE_KEYWORD_TOKEN.getValue().toString())), ((Object) (((Class) (ch/qos/logback/core/pattern/IdentityCompositeConverter)).getName())));
	//    4   10:getstatic       #28  <Field Map DEFAULT_COMPOSITE_CONVERTER_MAP>
	//    5   13:getstatic       #34  <Field Token Token.BARE_COMPOSITE_KEYWORD_TOKEN>
	//    6   16:invokevirtual   #38  <Method Object Token.getValue()>
	//    7   19:invokevirtual   #44  <Method String Object.toString()>
	//    8   22:ldc1            #46  <Class IdentityCompositeConverter>
	//    9   24:invokevirtual   #51  <Method String Class.getName()>
	//   10   27:invokeinterface #57  <Method Object Map.put(Object, Object)>
	//   11   32:pop             
		DEFAULT_COMPOSITE_CONVERTER_MAP.put("replace", ((Object) (((Class) (ch/qos/logback/core/pattern/ReplacingCompositeConverter)).getName())));
	//   12   33:getstatic       #28  <Field Map DEFAULT_COMPOSITE_CONVERTER_MAP>
	//   13   36:ldc1            #15  <String "replace">
	//   14   38:ldc1            #59  <Class ReplacingCompositeConverter>
	//   15   40:invokevirtual   #51  <Method String Class.getName()>
	//   16   43:invokeinterface #57  <Method Object Map.put(Object, Object)>
	//   17   48:pop             
	//*  18   49:return          
	}
}
