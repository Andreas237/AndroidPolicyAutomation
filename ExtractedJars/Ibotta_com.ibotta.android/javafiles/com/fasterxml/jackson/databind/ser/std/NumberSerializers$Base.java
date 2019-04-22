// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.databind.ser.ContextualSerializer;
import java.lang.reflect.Type;

// Referenced classes of package com.fasterxml.jackson.databind.ser.std:
//			StdScalarSerializer, NumberSerializers, ToStringSerializer

protected static abstract class NumberSerializers$Base extends StdScalarSerializer
	implements ContextualSerializer
{

	public void acceptJsonFormatVisitor(JsonFormatVisitorWrapper jsonformatvisitorwrapper, JavaType javatype)
		throws JsonMappingException
	{
		if(_isInt)
	//*   0    0:aload_0         
	//*   1    1:getfield        #38  <Field boolean _isInt>
	//*   2    4:ifeq            18
		{
			visitIntFormat(jsonformatvisitorwrapper, javatype, _numberType);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:aload_0         
	//    7   11:getfield        #23  <Field com.fasterxml.jackson.core.JsonParser$NumberType _numberType>
	//    8   14:invokevirtual   #49  <Method void visitIntFormat(JsonFormatVisitorWrapper, JavaType, com.fasterxml.jackson.core.JsonParser$NumberType)>
			return;
	//    9   17:return          
		} else
		{
			visitFloatFormat(jsonformatvisitorwrapper, javatype, _numberType);
	//   10   18:aload_0         
	//   11   19:aload_1         
	//   12   20:aload_2         
	//   13   21:aload_0         
	//   14   22:getfield        #23  <Field com.fasterxml.jackson.core.JsonParser$NumberType _numberType>
	//   15   25:invokevirtual   #52  <Method void visitFloatFormat(JsonFormatVisitorWrapper, JavaType, com.fasterxml.jackson.core.JsonParser$NumberType)>
			return;
	//   16   28:return          
		}
	}

	public JsonSerializer createContextual(SerializerProvider serializerprovider, BeanProperty beanproperty)
		throws JsonMappingException
	{
		serializerprovider = ((SerializerProvider) (findFormatOverrides(serializerprovider, beanproperty, handledType())));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_0         
	//    4    4:invokevirtual   #59  <Method Class handledType()>
	//    5    7:invokevirtual   #63  <Method com.fasterxml.jackson.annotation.JsonFormat$Value findFormatOverrides(SerializerProvider, BeanProperty, Class)>
	//    6   10:astore_1        
		if(serializerprovider != null)
	//*   7   11:aload_1         
	//*   8   12:ifnull          36
		{
			if(NumberSerializers._cls1.$SwitchMap$com$fasterxml$jackson$annotation$JsonFormat$Shape[((com.fasterxml.jackson.annotation.JsonFormat.Value) (serializerprovider)).getShape().ordinal()] != 1)
	//*   9   15:getstatic       #69  <Field int[] NumberSerializers$1.$SwitchMap$com$fasterxml$jackson$annotation$JsonFormat$Shape>
	//*  10   18:aload_1         
	//*  11   19:invokevirtual   #75  <Method com.fasterxml.jackson.annotation.JsonFormat$Shape com.fasterxml.jackson.annotation.JsonFormat$Value.getShape()>
	//*  12   22:invokevirtual   #81  <Method int com.fasterxml.jackson.annotation.JsonFormat$Shape.ordinal()>
	//*  13   25:iaload          
	//*  14   26:iconst_1        
	//*  15   27:icmpeq          32
				return ((JsonSerializer) (this));
	//   16   30:aload_0         
	//   17   31:areturn         
			else
				return ((JsonSerializer) (ToStringSerializer.instance));
	//   18   32:getstatic       #87  <Field ToStringSerializer ToStringSerializer.instance>
	//   19   35:areturn         
		} else
		{
			return ((JsonSerializer) (this));
	//   20   36:aload_0         
	//   21   37:areturn         
		}
	}

	public JsonNode getSchema(SerializerProvider serializerprovider, Type type)
	{
		return ((JsonNode) (createSchemaNode(_schemaType, true)));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #25  <Field String _schemaType>
	//    3    5:iconst_1        
	//    4    6:invokevirtual   #94  <Method com.fasterxml.jackson.databind.node.ObjectNode createSchemaNode(String, boolean)>
	//    5    9:areturn         
	}

	protected final boolean _isInt;
	protected final com.fasterxml.jackson.core.JsonParser.NumberType _numberType;
	protected final String _schemaType;

	protected NumberSerializers$Base(Class class1, com.fasterxml.jackson.core.JsonParser.NumberType numbertype, String s)
	{
		boolean flag = false;
	//    0    0:iconst_0        
	//    1    1:istore          4
		super(class1, false);
	//    2    3:aload_0         
	//    3    4:aload_1         
	//    4    5:iconst_0        
	//    5    6:invokespecial   #21  <Method void StdScalarSerializer(Class, boolean)>
		_numberType = numbertype;
	//    6    9:aload_0         
	//    7   10:aload_2         
	//    8   11:putfield        #23  <Field com.fasterxml.jackson.core.JsonParser$NumberType _numberType>
		_schemaType = s;
	//    9   14:aload_0         
	//   10   15:aload_3         
	//   11   16:putfield        #25  <Field String _schemaType>
		if(numbertype == com.fasterxml.jackson.core.JsonParser.NumberType.INT || numbertype == com.fasterxml.jackson.core.JsonParser.NumberType.LONG || numbertype == com.fasterxml.jackson.core.JsonParser.NumberType.BIG_INTEGER)
	//*  12   19:aload_2         
	//*  13   20:getstatic       #30  <Field com.fasterxml.jackson.core.JsonParser$NumberType com.fasterxml.jackson.core.JsonParser$NumberType.INT>
	//*  14   23:if_acmpeq       40
	//*  15   26:aload_2         
	//*  16   27:getstatic       #33  <Field com.fasterxml.jackson.core.JsonParser$NumberType com.fasterxml.jackson.core.JsonParser$NumberType.LONG>
	//*  17   30:if_acmpeq       40
	//*  18   33:aload_2         
	//*  19   34:getstatic       #36  <Field com.fasterxml.jackson.core.JsonParser$NumberType com.fasterxml.jackson.core.JsonParser$NumberType.BIG_INTEGER>
	//*  20   37:if_acmpne       43
			flag = true;
	//   21   40:iconst_1        
	//   22   41:istore          4
		_isInt = flag;
	//   23   43:aload_0         
	//   24   44:iload           4
	//   25   46:putfield        #38  <Field boolean _isInt>
	//   26   49:return          
	}
}
