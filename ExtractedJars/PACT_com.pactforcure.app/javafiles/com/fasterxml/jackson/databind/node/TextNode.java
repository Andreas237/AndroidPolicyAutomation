// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.core.io.CharTypes;
import com.fasterxml.jackson.core.io.NumberInput;
import com.fasterxml.jackson.core.util.ByteArrayBuilder;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.io.IOException;

// Referenced classes of package com.fasterxml.jackson.databind.node:
//			ValueNode, JsonNodeType

public class TextNode extends ValueNode
{

	public TextNode(String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void ValueNode()>
		_value = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #23  <Field String _value>
	//    5    9:return          
	}

	protected static void appendQuoted(StringBuilder stringbuilder, String s)
	{
		stringbuilder.append('"');
	//    0    0:aload_0         
	//    1    1:bipush          34
	//    2    3:invokevirtual   #31  <Method StringBuilder StringBuilder.append(char)>
	//    3    6:pop             
		CharTypes.appendQuoted(stringbuilder, s);
	//    4    7:aload_0         
	//    5    8:aload_1         
	//    6    9:invokestatic    #35  <Method void CharTypes.appendQuoted(StringBuilder, String)>
		stringbuilder.append('"');
	//    7   12:aload_0         
	//    8   13:bipush          34
	//    9   15:invokevirtual   #31  <Method StringBuilder StringBuilder.append(char)>
	//   10   18:pop             
	//   11   19:return          
	}

	public static TextNode valueOf(String s)
	{
		if(s == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		if(s.length() == 0)
	//*   4    6:aload_0         
	//*   5    7:invokevirtual   #43  <Method int String.length()>
	//*   6   10:ifne            17
			return EMPTY_STRING_NODE;
	//    7   13:getstatic       #18  <Field TextNode EMPTY_STRING_NODE>
	//    8   16:areturn         
		else
			return new TextNode(s);
	//    9   17:new             #2   <Class TextNode>
	//   10   20:dup             
	//   11   21:aload_0         
	//   12   22:invokespecial   #16  <Method void TextNode(String)>
	//   13   25:areturn         
	}

	protected void _reportBase64EOF()
		throws JsonParseException
	{
		throw new JsonParseException(((com.fasterxml.jackson.core.JsonParser) (null)), "Unexpected end-of-String when base64 content");
	//    0    0:new             #46  <Class JsonParseException>
	//    1    3:dup             
	//    2    4:aconst_null     
	//    3    5:ldc1            #48  <String "Unexpected end-of-String when base64 content">
	//    4    7:invokespecial   #51  <Method void JsonParseException(com.fasterxml.jackson.core.JsonParser, String)>
	//    5   10:athrow          
	}

	protected void _reportInvalidBase64(Base64Variant base64variant, char c, int i)
		throws JsonParseException
	{
		_reportInvalidBase64(base64variant, c, i, ((String) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:aconst_null     
	//    5    5:invokevirtual   #57  <Method void _reportInvalidBase64(Base64Variant, char, int, String)>
	//    6    8:return          
	}

	protected void _reportInvalidBase64(Base64Variant base64variant, char c, int i, String s)
		throws JsonParseException
	{
		Object obj;
		if(c <= ' ')
	//*   0    0:iload_2         
	//*   1    1:bipush          32
	//*   2    3:icmpgt          93
			base64variant = ((Base64Variant) ((new StringBuilder()).append("Illegal white space character (code 0x").append(Integer.toHexString(((int) (c)))).append(") as character #").append(i + 1).append(" of 4-char base64 unit: can only used between units").toString()));
	//    3    6:new             #27  <Class StringBuilder>
	//    4    9:dup             
	//    5   10:invokespecial   #58  <Method void StringBuilder()>
	//    6   13:ldc1            #60  <String "Illegal white space character (code 0x">
	//    7   15:invokevirtual   #63  <Method StringBuilder StringBuilder.append(String)>
	//    8   18:iload_2         
	//    9   19:invokestatic    #69  <Method String Integer.toHexString(int)>
	//   10   22:invokevirtual   #63  <Method StringBuilder StringBuilder.append(String)>
	//   11   25:ldc1            #71  <String ") as character #">
	//   12   27:invokevirtual   #63  <Method StringBuilder StringBuilder.append(String)>
	//   13   30:iload_3         
	//   14   31:iconst_1        
	//   15   32:iadd            
	//   16   33:invokevirtual   #74  <Method StringBuilder StringBuilder.append(int)>
	//   17   36:ldc1            #76  <String " of 4-char base64 unit: can only used between units">
	//   18   38:invokevirtual   #63  <Method StringBuilder StringBuilder.append(String)>
	//   19   41:invokevirtual   #80  <Method String StringBuilder.toString()>
	//   20   44:astore_1        
		else
	//*  21   45:aload_1         
	//*  22   46:astore          5
	//*  23   48:aload           4
	//*  24   50:ifnull          79
	//*  25   53:new             #27  <Class StringBuilder>
	//*  26   56:dup             
	//*  27   57:invokespecial   #58  <Method void StringBuilder()>
	//*  28   60:aload_1         
	//*  29   61:invokevirtual   #63  <Method StringBuilder StringBuilder.append(String)>
	//*  30   64:ldc1            #82  <String ": ">
	//*  31   66:invokevirtual   #63  <Method StringBuilder StringBuilder.append(String)>
	//*  32   69:aload           4
	//*  33   71:invokevirtual   #63  <Method StringBuilder StringBuilder.append(String)>
	//*  34   74:invokevirtual   #80  <Method String StringBuilder.toString()>
	//*  35   77:astore          5
	//*  36   79:new             #46  <Class JsonParseException>
	//*  37   82:dup             
	//*  38   83:aconst_null     
	//*  39   84:aload           5
	//*  40   86:getstatic       #88  <Field JsonLocation JsonLocation.NA>
	//*  41   89:invokespecial   #91  <Method void JsonParseException(com.fasterxml.jackson.core.JsonParser, String, JsonLocation)>
	//*  42   92:athrow          
		if(base64variant.usesPaddingChar(c))
	//*  43   93:aload_1         
	//*  44   94:iload_2         
	//*  45   95:invokevirtual   #97  <Method boolean Base64Variant.usesPaddingChar(char)>
	//*  46   98:ifeq            143
			base64variant = ((Base64Variant) ((new StringBuilder()).append("Unexpected padding character ('").append(base64variant.getPaddingChar()).append("') as character #").append(i + 1).append(" of 4-char base64 unit: padding only legal as 3rd or 4th character").toString()));
	//   47  101:new             #27  <Class StringBuilder>
	//   48  104:dup             
	//   49  105:invokespecial   #58  <Method void StringBuilder()>
	//   50  108:ldc1            #99  <String "Unexpected padding character ('">
	//   51  110:invokevirtual   #63  <Method StringBuilder StringBuilder.append(String)>
	//   52  113:aload_1         
	//   53  114:invokevirtual   #103 <Method char Base64Variant.getPaddingChar()>
	//   54  117:invokevirtual   #31  <Method StringBuilder StringBuilder.append(char)>
	//   55  120:ldc1            #105 <String "') as character #">
	//   56  122:invokevirtual   #63  <Method StringBuilder StringBuilder.append(String)>
	//   57  125:iload_3         
	//   58  126:iconst_1        
	//   59  127:iadd            
	//   60  128:invokevirtual   #74  <Method StringBuilder StringBuilder.append(int)>
	//   61  131:ldc1            #107 <String " of 4-char base64 unit: padding only legal as 3rd or 4th character">
	//   62  133:invokevirtual   #63  <Method StringBuilder StringBuilder.append(String)>
	//   63  136:invokevirtual   #80  <Method String StringBuilder.toString()>
	//   64  139:astore_1        
		else
	//*  65  140:goto            45
		if(!Character.isDefined(c) || Character.isISOControl(c))
	//*  66  143:iload_2         
	//*  67  144:invokestatic    #112 <Method boolean Character.isDefined(char)>
	//*  68  147:ifeq            157
	//*  69  150:iload_2         
	//*  70  151:invokestatic    #115 <Method boolean Character.isISOControl(char)>
	//*  71  154:ifeq            188
			base64variant = ((Base64Variant) ((new StringBuilder()).append("Illegal character (code 0x").append(Integer.toHexString(((int) (c)))).append(") in base64 content").toString()));
	//   72  157:new             #27  <Class StringBuilder>
	//   73  160:dup             
	//   74  161:invokespecial   #58  <Method void StringBuilder()>
	//   75  164:ldc1            #117 <String "Illegal character (code 0x">
	//   76  166:invokevirtual   #63  <Method StringBuilder StringBuilder.append(String)>
	//   77  169:iload_2         
	//   78  170:invokestatic    #69  <Method String Integer.toHexString(int)>
	//   79  173:invokevirtual   #63  <Method StringBuilder StringBuilder.append(String)>
	//   80  176:ldc1            #119 <String ") in base64 content">
	//   81  178:invokevirtual   #63  <Method StringBuilder StringBuilder.append(String)>
	//   82  181:invokevirtual   #80  <Method String StringBuilder.toString()>
	//   83  184:astore_1        
		else
	//*  84  185:goto            45
			base64variant = ((Base64Variant) ((new StringBuilder()).append("Illegal character '").append(c).append("' (code 0x").append(Integer.toHexString(((int) (c)))).append(") in base64 content").toString()));
	//   85  188:new             #27  <Class StringBuilder>
	//   86  191:dup             
	//   87  192:invokespecial   #58  <Method void StringBuilder()>
	//   88  195:ldc1            #121 <String "Illegal character '">
	//   89  197:invokevirtual   #63  <Method StringBuilder StringBuilder.append(String)>
	//   90  200:iload_2         
	//   91  201:invokevirtual   #31  <Method StringBuilder StringBuilder.append(char)>
	//   92  204:ldc1            #123 <String "' (code 0x">
	//   93  206:invokevirtual   #63  <Method StringBuilder StringBuilder.append(String)>
	//   94  209:iload_2         
	//   95  210:invokestatic    #69  <Method String Integer.toHexString(int)>
	//   96  213:invokevirtual   #63  <Method StringBuilder StringBuilder.append(String)>
	//   97  216:ldc1            #119 <String ") in base64 content">
	//   98  218:invokevirtual   #63  <Method StringBuilder StringBuilder.append(String)>
	//   99  221:invokevirtual   #80  <Method String StringBuilder.toString()>
	//  100  224:astore_1        
		obj = ((Object) (base64variant));
		if(s != null)
			obj = ((Object) ((new StringBuilder()).append(((String) (base64variant))).append(": ").append(s).toString()));
		throw new JsonParseException(((com.fasterxml.jackson.core.JsonParser) (null)), ((String) (obj)), JsonLocation.NA);
	//* 101  225:goto            45
	}

	public boolean asBoolean(boolean flag)
	{
		boolean flag1 = flag;
	//    0    0:iload_1         
	//    1    1:istore_2        
		if(_value != null)
	//*   2    2:aload_0         
	//*   3    3:getfield        #23  <Field String _value>
	//*   4    6:ifnull          28
		{
			String s = _value.trim();
	//    5    9:aload_0         
	//    6   10:getfield        #23  <Field String _value>
	//    7   13:invokevirtual   #128 <Method String String.trim()>
	//    8   16:astore_3        
			if("true".equals(((Object) (s))))
	//*   9   17:ldc1            #130 <String "true">
	//*  10   19:aload_3         
	//*  11   20:invokevirtual   #134 <Method boolean String.equals(Object)>
	//*  12   23:ifeq            30
			{
				flag1 = true;
	//   13   26:iconst_1        
	//   14   27:istore_2        
			} else
	//*  15   28:iload_2         
	//*  16   29:ireturn         
			{
				flag1 = flag;
	//   17   30:iload_1         
	//   18   31:istore_2        
				if("false".equals(((Object) (s))))
	//*  19   32:ldc1            #136 <String "false">
	//*  20   34:aload_3         
	//*  21   35:invokevirtual   #134 <Method boolean String.equals(Object)>
	//*  22   38:ifeq            28
					return false;
	//   23   41:iconst_0        
	//   24   42:ireturn         
			}
		}
		return flag1;
	}

	public double asDouble(double d)
	{
		return NumberInput.parseAsDouble(_value, d);
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field String _value>
	//    2    4:dload_1         
	//    3    5:invokestatic    #144 <Method double NumberInput.parseAsDouble(String, double)>
	//    4    8:dreturn         
	}

	public int asInt(int i)
	{
		return NumberInput.parseAsInt(_value, i);
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field String _value>
	//    2    4:iload_1         
	//    3    5:invokestatic    #150 <Method int NumberInput.parseAsInt(String, int)>
	//    4    8:ireturn         
	}

	public long asLong(long l)
	{
		return NumberInput.parseAsLong(_value, l);
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field String _value>
	//    2    4:lload_1         
	//    3    5:invokestatic    #156 <Method long NumberInput.parseAsLong(String, long)>
	//    4    8:lreturn         
	}

	public String asText()
	{
		return _value;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field String _value>
	//    2    4:areturn         
	}

	public String asText(String s)
	{
		if(_value == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #23  <Field String _value>
	//*   2    4:ifnonnull       9
			return s;
	//    3    7:aload_1         
	//    4    8:areturn         
		else
			return _value;
	//    5    9:aload_0         
	//    6   10:getfield        #23  <Field String _value>
	//    7   13:areturn         
	}

	public JsonToken asToken()
	{
		return JsonToken.VALUE_STRING;
	//    0    0:getstatic       #166 <Field JsonToken JsonToken.VALUE_STRING>
	//    1    3:areturn         
	}

	public byte[] binaryValue()
		throws IOException
	{
		return getBinaryValue(Base64Variants.getDefaultVariant());
	//    0    0:aload_0         
	//    1    1:invokestatic    #176 <Method Base64Variant Base64Variants.getDefaultVariant()>
	//    2    4:invokevirtual   #180 <Method byte[] getBinaryValue(Base64Variant)>
	//    3    7:areturn         
	}

	public boolean equals(Object obj)
	{
		boolean flag1 = false;
	//    0    0:iconst_0        
	//    1    1:istore_3        
		boolean flag;
		if(obj == this)
	//*   2    2:aload_1         
	//*   3    3:aload_0         
	//*   4    4:if_acmpne       11
		{
			flag = true;
	//    5    7:iconst_1        
	//    6    8:istore_2        
		} else
	//*   7    9:iload_2         
	//*   8   10:ireturn         
		{
			flag = flag1;
	//    9   11:iload_3         
	//   10   12:istore_2        
			if(obj != null)
	//*  11   13:aload_1         
	//*  12   14:ifnull          9
			{
				flag = flag1;
	//   13   17:iload_3         
	//   14   18:istore_2        
				if(obj instanceof TextNode)
	//*  15   19:aload_1         
	//*  16   20:instanceof      #2   <Class TextNode>
	//*  17   23:ifeq            9
					return ((TextNode)obj)._value.equals(((Object) (_value)));
	//   18   26:aload_1         
	//   19   27:checkcast       #2   <Class TextNode>
	//   20   30:getfield        #23  <Field String _value>
	//   21   33:aload_0         
	//   22   34:getfield        #23  <Field String _value>
	//   23   37:invokevirtual   #134 <Method boolean String.equals(Object)>
	//   24   40:ireturn         
			}
		}
		return flag;
	}

	public byte[] getBinaryValue(Base64Variant base64variant)
		throws IOException
	{
		int i;
		int k;
		ByteArrayBuilder bytearraybuilder;
		String s;
		bytearraybuilder = new ByteArrayBuilder(100);
	//    0    0:new             #182 <Class ByteArrayBuilder>
	//    1    3:dup             
	//    2    4:bipush          100
	//    3    6:invokespecial   #185 <Method void ByteArrayBuilder(int)>
	//    4    9:astore          7
		s = _value;
	//    5   11:aload_0         
	//    6   12:getfield        #23  <Field String _value>
	//    7   15:astore          8
		i = 0;
	//    8   17:iconst_0        
	//    9   18:istore_3        
		k = s.length();
	//   10   19:aload           8
	//   11   21:invokevirtual   #43  <Method int String.length()>
	//   12   24:istore          5
_L3:
		if(i >= k) goto _L2; else goto _L1
	//   13   26:iload_3         
	//   14   27:iload           5
	//   15   29:icmpge          51
_L1:
		int j;
		int l;
		j = i + 1;
	//   16   32:iload_3         
	//   17   33:iconst_1        
	//   18   34:iadd            
	//   19   35:istore          4
		char c = s.charAt(i);
	//   20   37:aload           8
	//   21   39:iload_3         
	//   22   40:invokevirtual   #189 <Method char String.charAt(int)>
	//   23   43:istore_2        
		if(j < k)
	//*  24   44:iload           4
	//*  25   46:iload           5
	//*  26   48:icmplt          57
	//*  27   51:aload           7
	//*  28   53:invokevirtual   #192 <Method byte[] ByteArrayBuilder.toByteArray()>
	//*  29   56:areturn         
		{
label0:
			{
				if(c <= ' ')
					break MISSING_BLOCK_LABEL_383;
	//   30   57:iload_2         
	//   31   58:bipush          32
	//   32   60:icmple          383
				l = base64variant.decodeBase64Char(c);
	//   33   63:aload_1         
	//   34   64:iload_2         
	//   35   65:invokevirtual   #196 <Method int Base64Variant.decodeBase64Char(char)>
	//   36   68:istore          6
				if(l < 0)
	//*  37   70:iload           6
	//*  38   72:ifge            82
					_reportInvalidBase64(base64variant, c, 0);
	//   39   75:aload_0         
	//   40   76:aload_1         
	//   41   77:iload_2         
	//   42   78:iconst_0        
	//   43   79:invokevirtual   #198 <Method void _reportInvalidBase64(Base64Variant, char, int)>
				if(j >= k)
	//*  44   82:iload           4
	//*  45   84:iload           5
	//*  46   86:icmplt          93
					_reportBase64EOF();
	//   47   89:aload_0         
	//   48   90:invokevirtual   #200 <Method void _reportBase64EOF()>
				i = j + 1;
	//   49   93:iload           4
	//   50   95:iconst_1        
	//   51   96:iadd            
	//   52   97:istore_3        
				c = s.charAt(j);
	//   53   98:aload           8
	//   54  100:iload           4
	//   55  102:invokevirtual   #189 <Method char String.charAt(int)>
	//   56  105:istore_2        
				j = base64variant.decodeBase64Char(c);
	//   57  106:aload_1         
	//   58  107:iload_2         
	//   59  108:invokevirtual   #196 <Method int Base64Variant.decodeBase64Char(char)>
	//   60  111:istore          4
				if(j < 0)
	//*  61  113:iload           4
	//*  62  115:ifge            125
					_reportInvalidBase64(base64variant, c, 1);
	//   63  118:aload_0         
	//   64  119:aload_1         
	//   65  120:iload_2         
	//   66  121:iconst_1        
	//   67  122:invokevirtual   #198 <Method void _reportInvalidBase64(Base64Variant, char, int)>
				l = l << 6 | j;
	//   68  125:iload           6
	//   69  127:bipush          6
	//   70  129:ishl            
	//   71  130:iload           4
	//   72  132:ior             
	//   73  133:istore          6
				if(i < k)
					break MISSING_BLOCK_LABEL_164;
	//   74  135:iload_3         
	//   75  136:iload           5
	//   76  138:icmplt          164
				if(base64variant.usesPadding())
					break label0;
	//   77  141:aload_1         
	//   78  142:invokevirtual   #204 <Method boolean Base64Variant.usesPadding()>
	//   79  145:ifne            160
				bytearraybuilder.append(l >> 4);
	//   80  148:aload           7
	//   81  150:iload           6
	//   82  152:iconst_4        
	//   83  153:ishr            
	//   84  154:invokevirtual   #206 <Method void ByteArrayBuilder.append(int)>
			}
		}
_L2:
		return bytearraybuilder.toByteArray();
	//*  85  157:goto            51
		_reportBase64EOF();
	//   86  160:aload_0         
	//   87  161:invokevirtual   #200 <Method void _reportBase64EOF()>
label1:
		{
			j = i + 1;
	//   88  164:iload_3         
	//   89  165:iconst_1        
	//   90  166:iadd            
	//   91  167:istore          4
			char c1 = s.charAt(i);
	//   92  169:aload           8
	//   93  171:iload_3         
	//   94  172:invokevirtual   #189 <Method char String.charAt(int)>
	//   95  175:istore_2        
			i = base64variant.decodeBase64Char(c1);
	//   96  176:aload_1         
	//   97  177:iload_2         
	//   98  178:invokevirtual   #196 <Method int Base64Variant.decodeBase64Char(char)>
	//   99  181:istore_3        
			if(i >= 0)
				break label1;
	//  100  182:iload_3         
	//  101  183:ifge            277
			if(i != -2)
	//* 102  186:iload_3         
	//* 103  187:bipush          -2
	//* 104  189:icmpeq          199
				_reportInvalidBase64(base64variant, c1, 2);
	//  105  192:aload_0         
	//  106  193:aload_1         
	//  107  194:iload_2         
	//  108  195:iconst_2        
	//  109  196:invokevirtual   #198 <Method void _reportInvalidBase64(Base64Variant, char, int)>
			if(j >= k)
	//* 110  199:iload           4
	//* 111  201:iload           5
	//* 112  203:icmplt          210
				_reportBase64EOF();
	//  113  206:aload_0         
	//  114  207:invokevirtual   #200 <Method void _reportBase64EOF()>
			i = j + 1;
	//  115  210:iload           4
	//  116  212:iconst_1        
	//  117  213:iadd            
	//  118  214:istore_3        
			c1 = s.charAt(j);
	//  119  215:aload           8
	//  120  217:iload           4
	//  121  219:invokevirtual   #189 <Method char String.charAt(int)>
	//  122  222:istore_2        
			if(!base64variant.usesPaddingChar(c1))
	//* 123  223:aload_1         
	//* 124  224:iload_2         
	//* 125  225:invokevirtual   #97  <Method boolean Base64Variant.usesPaddingChar(char)>
	//* 126  228:ifne            265
				_reportInvalidBase64(base64variant, c1, 3, (new StringBuilder()).append("expected padding character '").append(base64variant.getPaddingChar()).append("'").toString());
	//  127  231:aload_0         
	//  128  232:aload_1         
	//  129  233:iload_2         
	//  130  234:iconst_3        
	//  131  235:new             #27  <Class StringBuilder>
	//  132  238:dup             
	//  133  239:invokespecial   #58  <Method void StringBuilder()>
	//  134  242:ldc1            #208 <String "expected padding character '">
	//  135  244:invokevirtual   #63  <Method StringBuilder StringBuilder.append(String)>
	//  136  247:aload_1         
	//  137  248:invokevirtual   #103 <Method char Base64Variant.getPaddingChar()>
	//  138  251:invokevirtual   #31  <Method StringBuilder StringBuilder.append(char)>
	//  139  254:ldc1            #210 <String "'">
	//  140  256:invokevirtual   #63  <Method StringBuilder StringBuilder.append(String)>
	//  141  259:invokevirtual   #80  <Method String StringBuilder.toString()>
	//  142  262:invokevirtual   #57  <Method void _reportInvalidBase64(Base64Variant, char, int, String)>
			bytearraybuilder.append(l >> 4);
	//  143  265:aload           7
	//  144  267:iload           6
	//  145  269:iconst_4        
	//  146  270:ishr            
	//  147  271:invokevirtual   #206 <Method void ByteArrayBuilder.append(int)>
		}
		  goto _L3
	//* 148  274:goto            26
label2:
		{
			l = l << 6 | i;
	//  149  277:iload           6
	//  150  279:bipush          6
	//  151  281:ishl            
	//  152  282:iload_3         
	//  153  283:ior             
	//  154  284:istore          6
			if(j < k)
				break MISSING_BLOCK_LABEL_316;
	//  155  286:iload           4
	//  156  288:iload           5
	//  157  290:icmplt          316
			if(base64variant.usesPadding())
				break label2;
	//  158  293:aload_1         
	//  159  294:invokevirtual   #204 <Method boolean Base64Variant.usesPadding()>
	//  160  297:ifne            312
			bytearraybuilder.appendTwoBytes(l >> 2);
	//  161  300:aload           7
	//  162  302:iload           6
	//  163  304:iconst_2        
	//  164  305:ishr            
	//  165  306:invokevirtual   #213 <Method void ByteArrayBuilder.appendTwoBytes(int)>
		}
		  goto _L2
	//* 166  309:goto            51
		_reportBase64EOF();
	//  167  312:aload_0         
	//  168  313:invokevirtual   #200 <Method void _reportBase64EOF()>
		i = j + 1;
	//  169  316:iload           4
	//  170  318:iconst_1        
	//  171  319:iadd            
	//  172  320:istore_3        
		char c2 = s.charAt(j);
	//  173  321:aload           8
	//  174  323:iload           4
	//  175  325:invokevirtual   #189 <Method char String.charAt(int)>
	//  176  328:istore_2        
		j = base64variant.decodeBase64Char(c2);
	//  177  329:aload_1         
	//  178  330:iload_2         
	//  179  331:invokevirtual   #196 <Method int Base64Variant.decodeBase64Char(char)>
	//  180  334:istore          4
		if(j < 0)
	//* 181  336:iload           4
	//* 182  338:ifge            367
		{
			if(j != -2)
	//* 183  341:iload           4
	//* 184  343:bipush          -2
	//* 185  345:icmpeq          355
				_reportInvalidBase64(base64variant, c2, 3);
	//  186  348:aload_0         
	//  187  349:aload_1         
	//  188  350:iload_2         
	//  189  351:iconst_3        
	//  190  352:invokevirtual   #198 <Method void _reportInvalidBase64(Base64Variant, char, int)>
			bytearraybuilder.appendTwoBytes(l >> 2);
	//  191  355:aload           7
	//  192  357:iload           6
	//  193  359:iconst_2        
	//  194  360:ishr            
	//  195  361:invokevirtual   #213 <Method void ByteArrayBuilder.appendTwoBytes(int)>
		} else
	//* 196  364:goto            26
		{
			bytearraybuilder.appendThreeBytes(l << 6 | j);
	//  197  367:aload           7
	//  198  369:iload           6
	//  199  371:bipush          6
	//  200  373:ishl            
	//  201  374:iload           4
	//  202  376:ior             
	//  203  377:invokevirtual   #216 <Method void ByteArrayBuilder.appendThreeBytes(int)>
		}
		  goto _L3
	//* 204  380:goto            26
		i = j;
	//  205  383:iload           4
	//  206  385:istore_3        
		  goto _L1
	//* 207  386:goto            32
	}

	public JsonNodeType getNodeType()
	{
		return JsonNodeType.STRING;
	//    0    0:getstatic       #224 <Field JsonNodeType JsonNodeType.STRING>
	//    1    3:areturn         
	}

	public int hashCode()
	{
		return _value.hashCode();
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field String _value>
	//    2    4:invokevirtual   #227 <Method int String.hashCode()>
	//    3    7:ireturn         
	}

	public final void serialize(JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws IOException
	{
		if(_value == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #23  <Field String _value>
	//*   2    4:ifnonnull       12
		{
			jsongenerator.writeNull();
	//    3    7:aload_1         
	//    4    8:invokevirtual   #234 <Method void JsonGenerator.writeNull()>
			return;
	//    5   11:return          
		} else
		{
			jsongenerator.writeString(_value);
	//    6   12:aload_1         
	//    7   13:aload_0         
	//    8   14:getfield        #23  <Field String _value>
	//    9   17:invokevirtual   #237 <Method void JsonGenerator.writeString(String)>
			return;
	//   10   20:return          
		}
	}

	public String textValue()
	{
		return _value;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field String _value>
	//    2    4:areturn         
	}

	public String toString()
	{
		int i = _value.length();
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field String _value>
	//    2    4:invokevirtual   #43  <Method int String.length()>
	//    3    7:istore_1        
		StringBuilder stringbuilder = new StringBuilder(i + 2 + (i >> 4));
	//    4    8:new             #27  <Class StringBuilder>
	//    5   11:dup             
	//    6   12:iload_1         
	//    7   13:iconst_2        
	//    8   14:iadd            
	//    9   15:iload_1         
	//   10   16:iconst_4        
	//   11   17:ishr            
	//   12   18:iadd            
	//   13   19:invokespecial   #239 <Method void StringBuilder(int)>
	//   14   22:astore_2        
		appendQuoted(stringbuilder, _value);
	//   15   23:aload_2         
	//   16   24:aload_0         
	//   17   25:getfield        #23  <Field String _value>
	//   18   28:invokestatic    #240 <Method void appendQuoted(StringBuilder, String)>
		return stringbuilder.toString();
	//   19   31:aload_2         
	//   20   32:invokevirtual   #80  <Method String StringBuilder.toString()>
	//   21   35:areturn         
	}

	static final TextNode EMPTY_STRING_NODE = new TextNode("");
	protected final String _value;

	static 
	{
	//    0    0:new             #2   <Class TextNode>
	//    1    3:dup             
	//    2    4:ldc1            #12  <String "">
	//    3    6:invokespecial   #16  <Method void TextNode(String)>
	//    4    9:putstatic       #18  <Field TextNode EMPTY_STRING_NODE>
	//*   5   12:return          
	}
}
