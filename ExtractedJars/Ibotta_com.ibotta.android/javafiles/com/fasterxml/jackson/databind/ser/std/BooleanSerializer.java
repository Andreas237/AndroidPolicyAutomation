// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.ContextualSerializer;
import java.io.IOException;
import java.lang.reflect.Type;

// Referenced classes of package com.fasterxml.jackson.databind.ser.std:
//			StdScalarSerializer

public final class BooleanSerializer extends StdScalarSerializer
	implements ContextualSerializer
{
	static final class AsNumber extends StdScalarSerializer
		implements ContextualSerializer
	{

		public void acceptJsonFormatVisitor(JsonFormatVisitorWrapper jsonformatvisitorwrapper, JavaType javatype)
			throws JsonMappingException
		{
			visitIntFormat(jsonformatvisitorwrapper, javatype, com.fasterxml.jackson.core.JsonParser.NumberType.INT);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:getstatic       #40  <Field com.fasterxml.jackson.core.JsonParser$NumberType com.fasterxml.jackson.core.JsonParser$NumberType.INT>
		//    4    6:invokevirtual   #44  <Method void visitIntFormat(JsonFormatVisitorWrapper, JavaType, com.fasterxml.jackson.core.JsonParser$NumberType)>
		//    5    9:return          
		}

		public JsonSerializer createContextual(SerializerProvider serializerprovider, BeanProperty beanproperty)
			throws JsonMappingException
		{
			serializerprovider = ((SerializerProvider) (findFormatOverrides(serializerprovider, beanproperty, java/lang/Boolean)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:ldc1            #20  <Class Boolean>
		//    4    5:invokevirtual   #51  <Method com.fasterxml.jackson.annotation.JsonFormat$Value findFormatOverrides(SerializerProvider, BeanProperty, Class)>
		//    5    8:astore_1        
			if(serializerprovider != null && !((com.fasterxml.jackson.annotation.JsonFormat.Value) (serializerprovider)).getShape().isNumeric())
		//*   6    9:aload_1         
		//*   7   10:ifnull          35
		//*   8   13:aload_1         
		//*   9   14:invokevirtual   #57  <Method com.fasterxml.jackson.annotation.JsonFormat$Shape com.fasterxml.jackson.annotation.JsonFormat$Value.getShape()>
		//*  10   17:invokevirtual   #63  <Method boolean com.fasterxml.jackson.annotation.JsonFormat$Shape.isNumeric()>
		//*  11   20:ifne            35
				return ((JsonSerializer) (new BooleanSerializer(_forPrimitive)));
		//   12   23:new             #9   <Class BooleanSerializer>
		//   13   26:dup             
		//   14   27:aload_0         
		//   15   28:getfield        #29  <Field boolean _forPrimitive>
		//   16   31:invokespecial   #65  <Method void BooleanSerializer(boolean)>
		//   17   34:areturn         
			else
				return ((JsonSerializer) (this));
		//   18   35:aload_0         
		//   19   36:areturn         
		}

		public void serialize(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
			throws IOException
		{
			jsongenerator.writeNumber(((int) (Boolean.FALSE.equals(obj) ^ true)));
		//    0    0:aload_2         
		//    1    1:getstatic       #75  <Field Boolean Boolean.FALSE>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #79  <Method boolean Boolean.equals(Object)>
		//    4    8:iconst_1        
		//    5    9:ixor            
		//    6   10:invokevirtual   #85  <Method void JsonGenerator.writeNumber(int)>
		//    7   13:return          
		}

		public final void serializeWithType(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider, TypeSerializer typeserializer)
			throws IOException
		{
			jsongenerator.writeBoolean(Boolean.TRUE.equals(obj));
		//    0    0:aload_2         
		//    1    1:getstatic       #90  <Field Boolean Boolean.TRUE>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #79  <Method boolean Boolean.equals(Object)>
		//    4    8:invokevirtual   #93  <Method void JsonGenerator.writeBoolean(boolean)>
		//    5   11:return          
		}

		private static final long serialVersionUID = 1L;
		protected final boolean _forPrimitive;

		public AsNumber(boolean flag)
		{
			Object obj;
			if(flag)
		//*   0    0:iload_1         
		//*   1    1:ifeq            11
				obj = ((Object) (Boolean.TYPE));
		//    2    4:getstatic       #24  <Field Class Boolean.TYPE>
		//    3    7:astore_2        
			else
		//*   4    8:goto            14
				obj = java/lang/Boolean;
		//    5   11:ldc1            #20  <Class Boolean>
		//    6   13:astore_2        
			super(((Class) (obj)), false);
		//    7   14:aload_0         
		//    8   15:aload_2         
		//    9   16:iconst_0        
		//   10   17:invokespecial   #27  <Method void StdScalarSerializer(Class, boolean)>
			_forPrimitive = flag;
		//   11   20:aload_0         
		//   12   21:iload_1         
		//   13   22:putfield        #29  <Field boolean _forPrimitive>
		//   14   25:return          
		}
	}


	public BooleanSerializer(boolean flag)
	{
		Object obj;
		if(flag)
	//*   0    0:iload_1         
	//*   1    1:ifeq            11
			obj = ((Object) (Boolean.TYPE));
	//    2    4:getstatic       #25  <Field Class Boolean.TYPE>
	//    3    7:astore_2        
		else
	//*   4    8:goto            14
			obj = java/lang/Boolean;
	//    5   11:ldc1            #21  <Class Boolean>
	//    6   13:astore_2        
		super(((Class) (obj)), false);
	//    7   14:aload_0         
	//    8   15:aload_2         
	//    9   16:iconst_0        
	//   10   17:invokespecial   #28  <Method void StdScalarSerializer(Class, boolean)>
		_forPrimitive = flag;
	//   11   20:aload_0         
	//   12   21:iload_1         
	//   13   22:putfield        #30  <Field boolean _forPrimitive>
	//   14   25:return          
	}

	public void acceptJsonFormatVisitor(JsonFormatVisitorWrapper jsonformatvisitorwrapper, JavaType javatype)
		throws JsonMappingException
	{
		jsonformatvisitorwrapper.expectBooleanFormat(javatype);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokeinterface #41  <Method com.fasterxml.jackson.databind.jsonFormatVisitors.JsonBooleanFormatVisitor JsonFormatVisitorWrapper.expectBooleanFormat(JavaType)>
	//    3    7:pop             
	//    4    8:return          
	}

	public JsonSerializer createContextual(SerializerProvider serializerprovider, BeanProperty beanproperty)
		throws JsonMappingException
	{
		serializerprovider = ((SerializerProvider) (findFormatOverrides(serializerprovider, beanproperty, java/lang/Boolean)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:ldc1            #21  <Class Boolean>
	//    4    5:invokevirtual   #48  <Method com.fasterxml.jackson.annotation.JsonFormat$Value findFormatOverrides(SerializerProvider, BeanProperty, Class)>
	//    5    8:astore_1        
		if(serializerprovider != null && ((com.fasterxml.jackson.annotation.JsonFormat.Value) (serializerprovider)).getShape().isNumeric())
	//*   6    9:aload_1         
	//*   7   10:ifnull          35
	//*   8   13:aload_1         
	//*   9   14:invokevirtual   #54  <Method com.fasterxml.jackson.annotation.JsonFormat$Shape com.fasterxml.jackson.annotation.JsonFormat$Value.getShape()>
	//*  10   17:invokevirtual   #60  <Method boolean com.fasterxml.jackson.annotation.JsonFormat$Shape.isNumeric()>
	//*  11   20:ifeq            35
			return ((JsonSerializer) (new AsNumber(_forPrimitive)));
	//   12   23:new             #9   <Class BooleanSerializer$AsNumber>
	//   13   26:dup             
	//   14   27:aload_0         
	//   15   28:getfield        #30  <Field boolean _forPrimitive>
	//   16   31:invokespecial   #62  <Method void BooleanSerializer$AsNumber(boolean)>
	//   17   34:areturn         
		else
			return ((JsonSerializer) (this));
	//   18   35:aload_0         
	//   19   36:areturn         
	}

	public JsonNode getSchema(SerializerProvider serializerprovider, Type type)
	{
		return ((JsonNode) (createSchemaNode("boolean", _forPrimitive ^ true)));
	//    0    0:aload_0         
	//    1    1:ldc1            #68  <String "boolean">
	//    2    3:aload_0         
	//    3    4:getfield        #30  <Field boolean _forPrimitive>
	//    4    7:iconst_1        
	//    5    8:ixor            
	//    6    9:invokevirtual   #72  <Method com.fasterxml.jackson.databind.node.ObjectNode createSchemaNode(String, boolean)>
	//    7   12:areturn         
	}

	public void serialize(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws IOException
	{
		jsongenerator.writeBoolean(Boolean.TRUE.equals(obj));
	//    0    0:aload_2         
	//    1    1:getstatic       #80  <Field Boolean Boolean.TRUE>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #84  <Method boolean Boolean.equals(Object)>
	//    4    8:invokevirtual   #89  <Method void JsonGenerator.writeBoolean(boolean)>
	//    5   11:return          
	}

	public final void serializeWithType(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider, TypeSerializer typeserializer)
		throws IOException
	{
		jsongenerator.writeBoolean(Boolean.TRUE.equals(obj));
	//    0    0:aload_2         
	//    1    1:getstatic       #80  <Field Boolean Boolean.TRUE>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #84  <Method boolean Boolean.equals(Object)>
	//    4    8:invokevirtual   #89  <Method void JsonGenerator.writeBoolean(boolean)>
	//    5   11:return          
	}

	private static final long serialVersionUID = 1L;
	protected final boolean _forPrimitive;
}
