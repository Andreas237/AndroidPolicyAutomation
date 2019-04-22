// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.core.io.CharTypes;
import com.fasterxml.jackson.core.util.ByteArrayBuilder;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.exc.InvalidFormatException;
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

	public boolean asBoolean(boolean flag)
	{
		String s = _value;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field String _value>
	//    2    4:astore_2        
		if(s != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          36
		{
			s = s.trim();
	//    5    9:aload_2         
	//    6   10:invokevirtual   #49  <Method String String.trim()>
	//    7   13:astore_2        
			if("true".equals(((Object) (s))))
	//*   8   14:ldc1            #51  <String "true">
	//*   9   16:aload_2         
	//*  10   17:invokevirtual   #55  <Method boolean String.equals(Object)>
	//*  11   20:ifeq            25
				return true;
	//   12   23:iconst_1        
	//   13   24:ireturn         
			if("false".equals(((Object) (s))))
	//*  14   25:ldc1            #57  <String "false">
	//*  15   27:aload_2         
	//*  16   28:invokevirtual   #55  <Method boolean String.equals(Object)>
	//*  17   31:ifeq            36
				return false;
	//   18   34:iconst_0        
	//   19   35:ireturn         
		}
		return flag;
	//   20   36:iload_1         
	//   21   37:ireturn         
	}

	public String asText()
	{
		return _value;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field String _value>
	//    2    4:areturn         
	}

	public JsonToken asToken()
	{
		return JsonToken.VALUE_STRING;
	//    0    0:getstatic       #66  <Field JsonToken JsonToken.VALUE_STRING>
	//    1    3:areturn         
	}

	public byte[] binaryValue()
		throws IOException
	{
		return getBinaryValue(Base64Variants.getDefaultVariant());
	//    0    0:aload_0         
	//    1    1:invokestatic    #76  <Method Base64Variant Base64Variants.getDefaultVariant()>
	//    2    4:invokevirtual   #80  <Method byte[] getBinaryValue(Base64Variant)>
	//    3    7:areturn         
	}

	public boolean equals(Object obj)
	{
		if(obj == this)
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:if_acmpne       7
			return true;
	//    3    5:iconst_1        
	//    4    6:ireturn         
		if(obj == null)
	//*   5    7:aload_1         
	//*   6    8:ifnonnull       13
			return false;
	//    7   11:iconst_0        
	//    8   12:ireturn         
		if(obj instanceof TextNode)
	//*   9   13:aload_1         
	//*  10   14:instanceof      #2   <Class TextNode>
	//*  11   17:ifeq            35
			return ((TextNode)obj)._value.equals(((Object) (_value)));
	//   12   20:aload_1         
	//   13   21:checkcast       #2   <Class TextNode>
	//   14   24:getfield        #23  <Field String _value>
	//   15   27:aload_0         
	//   16   28:getfield        #23  <Field String _value>
	//   17   31:invokevirtual   #55  <Method boolean String.equals(Object)>
	//   18   34:ireturn         
		else
			return false;
	//   19   35:iconst_0        
	//   20   36:ireturn         
	}

	public byte[] getBinaryValue(Base64Variant base64variant)
		throws IOException
	{
		String s = _value.trim();
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field String _value>
	//    2    4:invokevirtual   #49  <Method String String.trim()>
	//    3    7:astore_2        
		ByteArrayBuilder bytearraybuilder = new ByteArrayBuilder((s.length() * 3 << 2) + 4);
	//    4    8:new             #85  <Class ByteArrayBuilder>
	//    5   11:dup             
	//    6   12:aload_2         
	//    7   13:invokevirtual   #43  <Method int String.length()>
	//    8   16:iconst_3        
	//    9   17:imul            
	//   10   18:iconst_2        
	//   11   19:ishl            
	//   12   20:iconst_4        
	//   13   21:iadd            
	//   14   22:invokespecial   #88  <Method void ByteArrayBuilder(int)>
	//   15   25:astore_3        
		try
		{
			base64variant.decode(s, bytearraybuilder);
	//   16   26:aload_1         
	//   17   27:aload_2         
	//   18   28:aload_3         
	//   19   29:invokevirtual   #94  <Method void Base64Variant.decode(String, ByteArrayBuilder)>
		}
	//*  20   32:aload_3         
	//*  21   33:invokevirtual   #97  <Method byte[] ByteArrayBuilder.toByteArray()>
	//*  22   36:areturn         
		// Misplaced declaration of an exception variable
		catch(Base64Variant base64variant)
	//*  23   37:astore_1        
		{
			throw InvalidFormatException.from(((com.fasterxml.jackson.core.JsonParser) (null)), String.format("Cannot access contents of TextNode as binary due to broken Base64 encoding: %s", new Object[] {
				((IllegalArgumentException) (base64variant)).getMessage()
			}), ((Object) (s)), [B);
	//   24   38:aconst_null     
	//   25   39:ldc1            #99  <String "Cannot access contents of TextNode as binary due to broken Base64 encoding: %s">
	//   26   41:iconst_1        
	//   27   42:anewarray       Object[]
	//   28   45:dup             
	//   29   46:iconst_0        
	//   30   47:aload_1         
	//   31   48:invokevirtual   #104 <Method String IllegalArgumentException.getMessage()>
	//   32   51:aastore         
	//   33   52:invokestatic    #108 <Method String String.format(String, Object[])>
	//   34   55:aload_2         
	//   35   56:ldc1            #110 <Class byte[]>
	//   36   58:invokestatic    #116 <Method InvalidFormatException InvalidFormatException.from(com.fasterxml.jackson.core.JsonParser, String, Object, Class)>
	//   37   61:athrow          
		}
		return bytearraybuilder.toByteArray();
	}

	public JsonNodeType getNodeType()
	{
		return JsonNodeType.STRING;
	//    0    0:getstatic       #124 <Field JsonNodeType JsonNodeType.STRING>
	//    1    3:areturn         
	}

	public int hashCode()
	{
		return _value.hashCode();
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field String _value>
	//    2    4:invokevirtual   #127 <Method int String.hashCode()>
	//    3    7:ireturn         
	}

	public final void serialize(JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws IOException
	{
		serializerprovider = ((SerializerProvider) (_value));
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field String _value>
	//    2    4:astore_2        
		if(serializerprovider == null)
	//*   3    5:aload_2         
	//*   4    6:ifnonnull       14
		{
			jsongenerator.writeNull();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #134 <Method void JsonGenerator.writeNull()>
			return;
	//    7   13:return          
		} else
		{
			jsongenerator.writeString(((String) (serializerprovider)));
	//    8   14:aload_1         
	//    9   15:aload_2         
	//   10   16:invokevirtual   #137 <Method void JsonGenerator.writeString(String)>
			return;
	//   11   19:return          
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
	//   13   19:invokespecial   #140 <Method void StringBuilder(int)>
	//   14   22:astore_2        
		appendQuoted(stringbuilder, _value);
	//   15   23:aload_2         
	//   16   24:aload_0         
	//   17   25:getfield        #23  <Field String _value>
	//   18   28:invokestatic    #141 <Method void appendQuoted(StringBuilder, String)>
		return stringbuilder.toString();
	//   19   31:aload_2         
	//   20   32:invokevirtual   #143 <Method String StringBuilder.toString()>
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
