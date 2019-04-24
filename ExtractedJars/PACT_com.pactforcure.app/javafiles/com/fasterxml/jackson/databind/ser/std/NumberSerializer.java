// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import java.io.IOException;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;

// Referenced classes of package com.fasterxml.jackson.databind.ser.std:
//			StdScalarSerializer

public class NumberSerializer extends StdScalarSerializer
{

	public NumberSerializer(Class class1)
	{
		boolean flag = false;
	//    0    0:iconst_0        
	//    1    1:istore_2        
		super(class1, false);
	//    2    2:aload_0         
	//    3    3:aload_1         
	//    4    4:iconst_0        
	//    5    5:invokespecial   #24  <Method void StdScalarSerializer(Class, boolean)>
		if(class1 == java/math/BigInteger)
	//*   6    8:aload_1         
	//*   7    9:ldc1            #26  <Class BigInteger>
	//*   8   11:if_acmpne       16
			flag = true;
	//    9   14:iconst_1        
	//   10   15:istore_2        
		_isInt = flag;
	//   11   16:aload_0         
	//   12   17:iload_2         
	//   13   18:putfield        #28  <Field boolean _isInt>
	//   14   21:return          
	}

	public void acceptJsonFormatVisitor(JsonFormatVisitorWrapper jsonformatvisitorwrapper, JavaType javatype)
		throws JsonMappingException
	{
		if(_isInt)
	//*   0    0:aload_0         
	//*   1    1:getfield        #28  <Field boolean _isInt>
	//*   2    4:ifeq            17
		{
			visitIntFormat(jsonformatvisitorwrapper, javatype, com.fasterxml.jackson.core.JsonParser.NumberType.BIG_INTEGER);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:getstatic       #40  <Field com.fasterxml.jackson.core.JsonParser$NumberType com.fasterxml.jackson.core.JsonParser$NumberType.BIG_INTEGER>
	//    7   13:invokevirtual   #44  <Method void visitIntFormat(JsonFormatVisitorWrapper, JavaType, com.fasterxml.jackson.core.JsonParser$NumberType)>
			return;
	//    8   16:return          
		}
		if(handledType() == java/math/BigDecimal)
	//*   9   17:aload_0         
	//*  10   18:invokevirtual   #48  <Method Class handledType()>
	//*  11   21:ldc1            #50  <Class BigDecimal>
	//*  12   23:if_acmpne       36
		{
			visitFloatFormat(jsonformatvisitorwrapper, javatype, com.fasterxml.jackson.core.JsonParser.NumberType.BIG_DECIMAL);
	//   13   26:aload_0         
	//   14   27:aload_1         
	//   15   28:aload_2         
	//   16   29:getstatic       #53  <Field com.fasterxml.jackson.core.JsonParser$NumberType com.fasterxml.jackson.core.JsonParser$NumberType.BIG_DECIMAL>
	//   17   32:invokevirtual   #56  <Method void visitFloatFormat(JsonFormatVisitorWrapper, JavaType, com.fasterxml.jackson.core.JsonParser$NumberType)>
			return;
	//   18   35:return          
		} else
		{
			jsonformatvisitorwrapper.expectNumberFormat(javatype);
	//   19   36:aload_1         
	//   20   37:aload_2         
	//   21   38:invokeinterface #62  <Method com.fasterxml.jackson.databind.jsonFormatVisitors.JsonNumberFormatVisitor JsonFormatVisitorWrapper.expectNumberFormat(JavaType)>
	//   22   43:pop             
			return;
	//   23   44:return          
		}
	}

	public JsonNode getSchema(SerializerProvider serializerprovider, Type type)
	{
		if(_isInt)
	//*   0    0:aload_0         
	//*   1    1:getfield        #28  <Field boolean _isInt>
	//*   2    4:ifeq            17
			serializerprovider = "integer";
	//    3    7:ldc1            #67  <String "integer">
	//    4    9:astore_1        
		else
	//*   5   10:aload_0         
	//*   6   11:aload_1         
	//*   7   12:iconst_1        
	//*   8   13:invokevirtual   #71  <Method com.fasterxml.jackson.databind.node.ObjectNode createSchemaNode(String, boolean)>
	//*   9   16:areturn         
			serializerprovider = "number";
	//   10   17:ldc1            #73  <String "number">
	//   11   19:astore_1        
		return ((JsonNode) (createSchemaNode(((String) (serializerprovider)), true)));
	//*  12   20:goto            10
	}

	public void serialize(Number number, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws IOException
	{
		if(number instanceof BigDecimal)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #50  <Class BigDecimal>
	//*   2    4:ifeq            16
		{
			jsongenerator.writeNumber((BigDecimal)number);
	//    3    7:aload_2         
	//    4    8:aload_1         
	//    5    9:checkcast       #50  <Class BigDecimal>
	//    6   12:invokevirtual   #83  <Method void JsonGenerator.writeNumber(BigDecimal)>
			return;
	//    7   15:return          
		}
		if(number instanceof BigInteger)
	//*   8   16:aload_1         
	//*   9   17:instanceof      #26  <Class BigInteger>
	//*  10   20:ifeq            32
		{
			jsongenerator.writeNumber((BigInteger)number);
	//   11   23:aload_2         
	//   12   24:aload_1         
	//   13   25:checkcast       #26  <Class BigInteger>
	//   14   28:invokevirtual   #86  <Method void JsonGenerator.writeNumber(BigInteger)>
			return;
	//   15   31:return          
		}
		if(number instanceof Long)
	//*  16   32:aload_1         
	//*  17   33:instanceof      #88  <Class Long>
	//*  18   36:ifeq            48
		{
			jsongenerator.writeNumber(number.longValue());
	//   19   39:aload_2         
	//   20   40:aload_1         
	//   21   41:invokevirtual   #92  <Method long Number.longValue()>
	//   22   44:invokevirtual   #95  <Method void JsonGenerator.writeNumber(long)>
			return;
	//   23   47:return          
		}
		if(number instanceof Double)
	//*  24   48:aload_1         
	//*  25   49:instanceof      #97  <Class Double>
	//*  26   52:ifeq            64
		{
			jsongenerator.writeNumber(number.doubleValue());
	//   27   55:aload_2         
	//   28   56:aload_1         
	//   29   57:invokevirtual   #101 <Method double Number.doubleValue()>
	//   30   60:invokevirtual   #104 <Method void JsonGenerator.writeNumber(double)>
			return;
	//   31   63:return          
		}
		if(number instanceof Float)
	//*  32   64:aload_1         
	//*  33   65:instanceof      #106 <Class Float>
	//*  34   68:ifeq            80
		{
			jsongenerator.writeNumber(number.floatValue());
	//   35   71:aload_2         
	//   36   72:aload_1         
	//   37   73:invokevirtual   #110 <Method float Number.floatValue()>
	//   38   76:invokevirtual   #113 <Method void JsonGenerator.writeNumber(float)>
			return;
	//   39   79:return          
		}
		if((number instanceof Integer) || (number instanceof Byte) || (number instanceof Short))
	//*  40   80:aload_1         
	//*  41   81:instanceof      #115 <Class Integer>
	//*  42   84:ifne            101
	//*  43   87:aload_1         
	//*  44   88:instanceof      #117 <Class Byte>
	//*  45   91:ifne            101
	//*  46   94:aload_1         
	//*  47   95:instanceof      #119 <Class Short>
	//*  48   98:ifeq            110
		{
			jsongenerator.writeNumber(number.intValue());
	//   49  101:aload_2         
	//   50  102:aload_1         
	//   51  103:invokevirtual   #123 <Method int Number.intValue()>
	//   52  106:invokevirtual   #126 <Method void JsonGenerator.writeNumber(int)>
			return;
	//   53  109:return          
		} else
		{
			jsongenerator.writeNumber(((Object) (number)).toString());
	//   54  110:aload_2         
	//   55  111:aload_1         
	//   56  112:invokevirtual   #132 <Method String Object.toString()>
	//   57  115:invokevirtual   #135 <Method void JsonGenerator.writeNumber(String)>
			return;
	//   58  118:return          
		}
	}

	public volatile void serialize(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws IOException
	{
		serialize((Number)obj, jsongenerator, serializerprovider);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #14  <Class Number>
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:invokevirtual   #138 <Method void serialize(Number, JsonGenerator, SerializerProvider)>
	//    6   10:return          
	}

	public static final NumberSerializer instance = new NumberSerializer(java/lang/Number);
	protected final boolean _isInt;

	static 
	{
	//    0    0:new             #2   <Class NumberSerializer>
	//    1    3:dup             
	//    2    4:ldc1            #14  <Class Number>
	//    3    6:invokespecial   #18  <Method void NumberSerializer(Class)>
	//    4    9:putstatic       #20  <Field NumberSerializer instance>
	//*   5   12:return          
	}
}
