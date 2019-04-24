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
		if(beanproperty == null) goto _L2; else goto _L1
	//    0    0:aload_2         
	//    1    1:ifnull          56
_L1:
		beanproperty = ((BeanProperty) (beanproperty.getMember()));
	//    2    4:aload_2         
	//    3    5:invokeinterface #61  <Method com.fasterxml.jackson.databind.introspect.AnnotatedMember BeanProperty.getMember()>
	//    4   10:astore_2        
		if(beanproperty == null) goto _L2; else goto _L3
	//    5   11:aload_2         
	//    6   12:ifnull          56
_L3:
		serializerprovider = ((SerializerProvider) (serializerprovider.getAnnotationIntrospector().findFormat(((com.fasterxml.jackson.databind.introspect.Annotated) (beanproperty)))));
	//    7   15:aload_1         
	//    8   16:invokevirtual   #67  <Method AnnotationIntrospector SerializerProvider.getAnnotationIntrospector()>
	//    9   19:aload_2         
	//   10   20:invokevirtual   #73  <Method com.fasterxml.jackson.annotation.JsonFormat$Value AnnotationIntrospector.findFormat(com.fasterxml.jackson.databind.introspect.Annotated)>
	//   11   23:astore_1        
		if(serializerprovider == null) goto _L2; else goto _L4
	//   12   24:aload_1         
	//   13   25:ifnull          56
_L4:
		NumberSerializers._cls1.$SwitchMap$com$fasterxml$jackson$annotation$JsonFormat$Shape[((com.fasterxml.jackson.annotation.JsonFormat.Value) (serializerprovider)).getShape().ordinal()];
	//   14   28:getstatic       #79  <Field int[] NumberSerializers$1.$SwitchMap$com$fasterxml$jackson$annotation$JsonFormat$Shape>
	//   15   31:aload_1         
	//   16   32:invokevirtual   #85  <Method com.fasterxml.jackson.annotation.JsonFormat$Shape com.fasterxml.jackson.annotation.JsonFormat$Value.getShape()>
	//   17   35:invokevirtual   #91  <Method int com.fasterxml.jackson.annotation.JsonFormat$Shape.ordinal()>
	//   18   38:iaload          
		JVM INSTR tableswitch 1 1: default 56
	//	               1 58;
	//   19   39:tableswitch     1 1: default 56
	//	               1 58
		   goto _L2 _L5
_L2:
		return ((JsonSerializer) (this));
	//   20   56:aload_0         
	//   21   57:areturn         
_L5:
		return ((JsonSerializer) (ToStringSerializer.instance));
	//   22   58:getstatic       #97  <Field ToStringSerializer ToStringSerializer.instance>
	//   23   61:areturn         
	}

	public JsonNode getSchema(SerializerProvider serializerprovider, Type type)
	{
		return ((JsonNode) (createSchemaNode(_schemaType, true)));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #25  <Field String _schemaType>
	//    3    5:iconst_1        
	//    4    6:invokevirtual   #104 <Method com.fasterxml.jackson.databind.node.ObjectNode createSchemaNode(String, boolean)>
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
