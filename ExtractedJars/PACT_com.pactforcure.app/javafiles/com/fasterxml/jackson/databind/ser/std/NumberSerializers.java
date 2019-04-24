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
import java.util.Map;

// Referenced classes of package com.fasterxml.jackson.databind.ser.std:
//			StdScalarSerializer, ToStringSerializer

public class NumberSerializers
{
	protected static abstract class Base extends StdScalarSerializer
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
			static class _cls1
			{

				static final int $SwitchMap$com$fasterxml$jackson$annotation$JsonFormat$Shape[];

				static 
				{
					$SwitchMap$com$fasterxml$jackson$annotation$JsonFormat$Shape = new int[com.fasterxml.jackson.annotation.JsonFormat.Shape.values().length];
				//    0    0:invokestatic    #18  <Method com.fasterxml.jackson.annotation.JsonFormat$Shape[] com.fasterxml.jackson.annotation.JsonFormat$Shape.values()>
				//    1    3:arraylength     
				//    2    4:newarray        int[]
				//    3    6:putstatic       #20  <Field int[] $SwitchMap$com$fasterxml$jackson$annotation$JsonFormat$Shape>
					try
					{
						$SwitchMap$com$fasterxml$jackson$annotation$JsonFormat$Shape[com.fasterxml.jackson.annotation.JsonFormat.Shape.STRING.ordinal()] = 1;
				//    4    9:getstatic       #20  <Field int[] $SwitchMap$com$fasterxml$jackson$annotation$JsonFormat$Shape>
				//    5   12:getstatic       #24  <Field com.fasterxml.jackson.annotation.JsonFormat$Shape com.fasterxml.jackson.annotation.JsonFormat$Shape.STRING>
				//    6   15:invokevirtual   #28  <Method int com.fasterxml.jackson.annotation.JsonFormat$Shape.ordinal()>
				//    7   18:iconst_1        
				//    8   19:iastore         
				//    9   20:return          
					}
					catch(NoSuchFieldError nosuchfielderror) { }
				//   10   21:astore_0        
				//*  11   22:return          
				}
			}

			_cls1..SwitchMap.com.fasterxml.jackson.annotation.JsonFormat.Shape[((com.fasterxml.jackson.annotation.JsonFormat.Value) (serializerprovider)).getShape().ordinal()];
		//   14   28:getstatic       #79  <Field int[] NumberSerializers$1.$SwitchMap$com$fasterxml$jackson$annotation$JsonFormat$Shape>
		//   15   31:aload_1         
		//   16   32:invokevirtual   #85  <Method com.fasterxml.jackson.annotation.JsonFormat$Shape com.fasterxml.jackson.annotation.JsonFormat$Value.getShape()>
		//   17   35:invokevirtual   #91  <Method int com.fasterxml.jackson.annotation.JsonFormat$Shape.ordinal()>
		//   18   38:iaload          
			JVM INSTR tableswitch 1 1: default 56
		//		               1 58;
		//   19   39:tableswitch     1 1: default 56
		//		               1 58
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

		protected Base(Class class1, com.fasterxml.jackson.core.JsonParser.NumberType numbertype, String s)
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

	public static final class DoubleSerializer extends Base
	{

		public volatile void acceptJsonFormatVisitor(JsonFormatVisitorWrapper jsonformatvisitorwrapper, JavaType javatype)
			throws JsonMappingException
		{
			super.acceptJsonFormatVisitor(jsonformatvisitorwrapper, javatype);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #38  <Method void NumberSerializers$Base.acceptJsonFormatVisitor(JsonFormatVisitorWrapper, JavaType)>
		//    4    6:return          
		}

		public volatile JsonSerializer createContextual(SerializerProvider serializerprovider, BeanProperty beanproperty)
			throws JsonMappingException
		{
			return super.createContextual(serializerprovider, beanproperty);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #43  <Method JsonSerializer NumberSerializers$Base.createContextual(SerializerProvider, BeanProperty)>
		//    4    6:areturn         
		}

		public volatile JsonNode getSchema(SerializerProvider serializerprovider, Type type)
		{
			return super.getSchema(serializerprovider, type);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #47  <Method JsonNode NumberSerializers$Base.getSchema(SerializerProvider, Type)>
		//    4    6:areturn         
		}

		public void serialize(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
			throws IOException
		{
			jsongenerator.writeNumber(((Double)obj).doubleValue());
		//    0    0:aload_2         
		//    1    1:aload_1         
		//    2    2:checkcast       #21  <Class Double>
		//    3    5:invokevirtual   #55  <Method double Double.doubleValue()>
		//    4    8:invokevirtual   #61  <Method void JsonGenerator.writeNumber(double)>
		//    5   11:return          
		}

		public void serializeWithType(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider, TypeSerializer typeserializer)
			throws IOException
		{
			serialize(obj, jsongenerator, serializerprovider);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:aload_3         
		//    4    4:invokevirtual   #65  <Method void serialize(Object, JsonGenerator, SerializerProvider)>
		//    5    7:return          
		}

		static final DoubleSerializer instance = new DoubleSerializer();

		static 
		{
		//    0    0:new             #2   <Class NumberSerializers$DoubleSerializer>
		//    1    3:dup             
		//    2    4:invokespecial   #16  <Method void NumberSerializers$DoubleSerializer()>
		//    3    7:putstatic       #18  <Field NumberSerializers$DoubleSerializer instance>
		//*   4   10:return          
		}

		public DoubleSerializer()
		{
			super(java/lang/Double, com.fasterxml.jackson.core.JsonParser.NumberType.DOUBLE, "number");
		//    0    0:aload_0         
		//    1    1:ldc1            #21  <Class Double>
		//    2    3:getstatic       #27  <Field com.fasterxml.jackson.core.JsonParser$NumberType com.fasterxml.jackson.core.JsonParser$NumberType.DOUBLE>
		//    3    6:ldc1            #29  <String "number">
		//    4    8:invokespecial   #32  <Method void NumberSerializers$Base(Class, com.fasterxml.jackson.core.JsonParser$NumberType, String)>
		//    5   11:return          
		}
	}

	public static final class FloatSerializer extends Base
	{

		public volatile void acceptJsonFormatVisitor(JsonFormatVisitorWrapper jsonformatvisitorwrapper, JavaType javatype)
			throws JsonMappingException
		{
			super.acceptJsonFormatVisitor(jsonformatvisitorwrapper, javatype);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #38  <Method void NumberSerializers$Base.acceptJsonFormatVisitor(JsonFormatVisitorWrapper, JavaType)>
		//    4    6:return          
		}

		public volatile JsonSerializer createContextual(SerializerProvider serializerprovider, BeanProperty beanproperty)
			throws JsonMappingException
		{
			return super.createContextual(serializerprovider, beanproperty);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #43  <Method JsonSerializer NumberSerializers$Base.createContextual(SerializerProvider, BeanProperty)>
		//    4    6:areturn         
		}

		public volatile JsonNode getSchema(SerializerProvider serializerprovider, Type type)
		{
			return super.getSchema(serializerprovider, type);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #47  <Method JsonNode NumberSerializers$Base.getSchema(SerializerProvider, Type)>
		//    4    6:areturn         
		}

		public void serialize(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
			throws IOException
		{
			jsongenerator.writeNumber(((Float)obj).floatValue());
		//    0    0:aload_2         
		//    1    1:aload_1         
		//    2    2:checkcast       #21  <Class Float>
		//    3    5:invokevirtual   #55  <Method float Float.floatValue()>
		//    4    8:invokevirtual   #61  <Method void JsonGenerator.writeNumber(float)>
		//    5   11:return          
		}

		static final FloatSerializer instance = new FloatSerializer();

		static 
		{
		//    0    0:new             #2   <Class NumberSerializers$FloatSerializer>
		//    1    3:dup             
		//    2    4:invokespecial   #16  <Method void NumberSerializers$FloatSerializer()>
		//    3    7:putstatic       #18  <Field NumberSerializers$FloatSerializer instance>
		//*   4   10:return          
		}

		public FloatSerializer()
		{
			super(java/lang/Float, com.fasterxml.jackson.core.JsonParser.NumberType.FLOAT, "number");
		//    0    0:aload_0         
		//    1    1:ldc1            #21  <Class Float>
		//    2    3:getstatic       #27  <Field com.fasterxml.jackson.core.JsonParser$NumberType com.fasterxml.jackson.core.JsonParser$NumberType.FLOAT>
		//    3    6:ldc1            #29  <String "number">
		//    4    8:invokespecial   #32  <Method void NumberSerializers$Base(Class, com.fasterxml.jackson.core.JsonParser$NumberType, String)>
		//    5   11:return          
		}
	}

	public static final class IntLikeSerializer extends Base
	{

		public volatile void acceptJsonFormatVisitor(JsonFormatVisitorWrapper jsonformatvisitorwrapper, JavaType javatype)
			throws JsonMappingException
		{
			super.acceptJsonFormatVisitor(jsonformatvisitorwrapper, javatype);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #38  <Method void NumberSerializers$Base.acceptJsonFormatVisitor(JsonFormatVisitorWrapper, JavaType)>
		//    4    6:return          
		}

		public volatile JsonSerializer createContextual(SerializerProvider serializerprovider, BeanProperty beanproperty)
			throws JsonMappingException
		{
			return super.createContextual(serializerprovider, beanproperty);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #43  <Method JsonSerializer NumberSerializers$Base.createContextual(SerializerProvider, BeanProperty)>
		//    4    6:areturn         
		}

		public volatile JsonNode getSchema(SerializerProvider serializerprovider, Type type)
		{
			return super.getSchema(serializerprovider, type);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #47  <Method JsonNode NumberSerializers$Base.getSchema(SerializerProvider, Type)>
		//    4    6:areturn         
		}

		public void serialize(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
			throws IOException
		{
			jsongenerator.writeNumber(((Number)obj).intValue());
		//    0    0:aload_2         
		//    1    1:aload_1         
		//    2    2:checkcast       #21  <Class Number>
		//    3    5:invokevirtual   #55  <Method int Number.intValue()>
		//    4    8:invokevirtual   #61  <Method void JsonGenerator.writeNumber(int)>
		//    5   11:return          
		}

		static final IntLikeSerializer instance = new IntLikeSerializer();

		static 
		{
		//    0    0:new             #2   <Class NumberSerializers$IntLikeSerializer>
		//    1    3:dup             
		//    2    4:invokespecial   #16  <Method void NumberSerializers$IntLikeSerializer()>
		//    3    7:putstatic       #18  <Field NumberSerializers$IntLikeSerializer instance>
		//*   4   10:return          
		}

		public IntLikeSerializer()
		{
			super(java/lang/Number, com.fasterxml.jackson.core.JsonParser.NumberType.INT, "integer");
		//    0    0:aload_0         
		//    1    1:ldc1            #21  <Class Number>
		//    2    3:getstatic       #27  <Field com.fasterxml.jackson.core.JsonParser$NumberType com.fasterxml.jackson.core.JsonParser$NumberType.INT>
		//    3    6:ldc1            #29  <String "integer">
		//    4    8:invokespecial   #32  <Method void NumberSerializers$Base(Class, com.fasterxml.jackson.core.JsonParser$NumberType, String)>
		//    5   11:return          
		}
	}

	public static final class IntegerSerializer extends Base
	{

		public volatile void acceptJsonFormatVisitor(JsonFormatVisitorWrapper jsonformatvisitorwrapper, JavaType javatype)
			throws JsonMappingException
		{
			super.acceptJsonFormatVisitor(jsonformatvisitorwrapper, javatype);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #31  <Method void NumberSerializers$Base.acceptJsonFormatVisitor(JsonFormatVisitorWrapper, JavaType)>
		//    4    6:return          
		}

		public volatile JsonSerializer createContextual(SerializerProvider serializerprovider, BeanProperty beanproperty)
			throws JsonMappingException
		{
			return super.createContextual(serializerprovider, beanproperty);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #36  <Method JsonSerializer NumberSerializers$Base.createContextual(SerializerProvider, BeanProperty)>
		//    4    6:areturn         
		}

		public volatile JsonNode getSchema(SerializerProvider serializerprovider, Type type)
		{
			return super.getSchema(serializerprovider, type);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #40  <Method JsonNode NumberSerializers$Base.getSchema(SerializerProvider, Type)>
		//    4    6:areturn         
		}

		public void serialize(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
			throws IOException
		{
			jsongenerator.writeNumber(((Integer)obj).intValue());
		//    0    0:aload_2         
		//    1    1:aload_1         
		//    2    2:checkcast       #13  <Class Integer>
		//    3    5:invokevirtual   #48  <Method int Integer.intValue()>
		//    4    8:invokevirtual   #54  <Method void JsonGenerator.writeNumber(int)>
		//    5   11:return          
		}

		public void serializeWithType(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider, TypeSerializer typeserializer)
			throws IOException
		{
			serialize(obj, jsongenerator, serializerprovider);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:aload_3         
		//    4    4:invokevirtual   #58  <Method void serialize(Object, JsonGenerator, SerializerProvider)>
		//    5    7:return          
		}

		public IntegerSerializer()
		{
			super(java/lang/Integer, com.fasterxml.jackson.core.JsonParser.NumberType.INT, "integer");
		//    0    0:aload_0         
		//    1    1:ldc1            #13  <Class Integer>
		//    2    3:getstatic       #19  <Field com.fasterxml.jackson.core.JsonParser$NumberType com.fasterxml.jackson.core.JsonParser$NumberType.INT>
		//    3    6:ldc1            #21  <String "integer">
		//    4    8:invokespecial   #24  <Method void NumberSerializers$Base(Class, com.fasterxml.jackson.core.JsonParser$NumberType, String)>
		//    5   11:return          
		}
	}

	public static final class LongSerializer extends Base
	{

		public volatile void acceptJsonFormatVisitor(JsonFormatVisitorWrapper jsonformatvisitorwrapper, JavaType javatype)
			throws JsonMappingException
		{
			super.acceptJsonFormatVisitor(jsonformatvisitorwrapper, javatype);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #38  <Method void NumberSerializers$Base.acceptJsonFormatVisitor(JsonFormatVisitorWrapper, JavaType)>
		//    4    6:return          
		}

		public volatile JsonSerializer createContextual(SerializerProvider serializerprovider, BeanProperty beanproperty)
			throws JsonMappingException
		{
			return super.createContextual(serializerprovider, beanproperty);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #43  <Method JsonSerializer NumberSerializers$Base.createContextual(SerializerProvider, BeanProperty)>
		//    4    6:areturn         
		}

		public volatile JsonNode getSchema(SerializerProvider serializerprovider, Type type)
		{
			return super.getSchema(serializerprovider, type);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #47  <Method JsonNode NumberSerializers$Base.getSchema(SerializerProvider, Type)>
		//    4    6:areturn         
		}

		public void serialize(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
			throws IOException
		{
			jsongenerator.writeNumber(((Long)obj).longValue());
		//    0    0:aload_2         
		//    1    1:aload_1         
		//    2    2:checkcast       #21  <Class Long>
		//    3    5:invokevirtual   #55  <Method long Long.longValue()>
		//    4    8:invokevirtual   #61  <Method void JsonGenerator.writeNumber(long)>
		//    5   11:return          
		}

		static final LongSerializer instance = new LongSerializer();

		static 
		{
		//    0    0:new             #2   <Class NumberSerializers$LongSerializer>
		//    1    3:dup             
		//    2    4:invokespecial   #16  <Method void NumberSerializers$LongSerializer()>
		//    3    7:putstatic       #18  <Field NumberSerializers$LongSerializer instance>
		//*   4   10:return          
		}

		public LongSerializer()
		{
			super(java/lang/Long, com.fasterxml.jackson.core.JsonParser.NumberType.LONG, "number");
		//    0    0:aload_0         
		//    1    1:ldc1            #21  <Class Long>
		//    2    3:getstatic       #27  <Field com.fasterxml.jackson.core.JsonParser$NumberType com.fasterxml.jackson.core.JsonParser$NumberType.LONG>
		//    3    6:ldc1            #29  <String "number">
		//    4    8:invokespecial   #32  <Method void NumberSerializers$Base(Class, com.fasterxml.jackson.core.JsonParser$NumberType, String)>
		//    5   11:return          
		}
	}

	public static final class ShortSerializer extends Base
	{

		public volatile void acceptJsonFormatVisitor(JsonFormatVisitorWrapper jsonformatvisitorwrapper, JavaType javatype)
			throws JsonMappingException
		{
			super.acceptJsonFormatVisitor(jsonformatvisitorwrapper, javatype);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #38  <Method void NumberSerializers$Base.acceptJsonFormatVisitor(JsonFormatVisitorWrapper, JavaType)>
		//    4    6:return          
		}

		public volatile JsonSerializer createContextual(SerializerProvider serializerprovider, BeanProperty beanproperty)
			throws JsonMappingException
		{
			return super.createContextual(serializerprovider, beanproperty);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #43  <Method JsonSerializer NumberSerializers$Base.createContextual(SerializerProvider, BeanProperty)>
		//    4    6:areturn         
		}

		public volatile JsonNode getSchema(SerializerProvider serializerprovider, Type type)
		{
			return super.getSchema(serializerprovider, type);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #47  <Method JsonNode NumberSerializers$Base.getSchema(SerializerProvider, Type)>
		//    4    6:areturn         
		}

		public void serialize(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
			throws IOException
		{
			jsongenerator.writeNumber(((Short)obj).shortValue());
		//    0    0:aload_2         
		//    1    1:aload_1         
		//    2    2:checkcast       #21  <Class Short>
		//    3    5:invokevirtual   #55  <Method short Short.shortValue()>
		//    4    8:invokevirtual   #61  <Method void JsonGenerator.writeNumber(short)>
		//    5   11:return          
		}

		static final ShortSerializer instance = new ShortSerializer();

		static 
		{
		//    0    0:new             #2   <Class NumberSerializers$ShortSerializer>
		//    1    3:dup             
		//    2    4:invokespecial   #16  <Method void NumberSerializers$ShortSerializer()>
		//    3    7:putstatic       #18  <Field NumberSerializers$ShortSerializer instance>
		//*   4   10:return          
		}

		public ShortSerializer()
		{
			super(java/lang/Short, com.fasterxml.jackson.core.JsonParser.NumberType.INT, "number");
		//    0    0:aload_0         
		//    1    1:ldc1            #21  <Class Short>
		//    2    3:getstatic       #27  <Field com.fasterxml.jackson.core.JsonParser$NumberType com.fasterxml.jackson.core.JsonParser$NumberType.INT>
		//    3    6:ldc1            #29  <String "number">
		//    4    8:invokespecial   #32  <Method void NumberSerializers$Base(Class, com.fasterxml.jackson.core.JsonParser$NumberType, String)>
		//    5   11:return          
		}
	}


	protected NumberSerializers()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #31  <Method void Object()>
	//    2    4:return          
	}

	public static void addAll(Map map)
	{
		IntegerSerializer integerserializer = new IntegerSerializer();
	//    0    0:new             #20  <Class NumberSerializers$IntegerSerializer>
	//    1    3:dup             
	//    2    4:invokespecial   #35  <Method void NumberSerializers$IntegerSerializer()>
	//    3    7:astore_1        
		map.put(((Object) (((Class) (java/lang/Integer)).getName())), ((Object) (integerserializer)));
	//    4    8:aload_0         
	//    5    9:ldc1            #37  <Class Integer>
	//    6   11:invokevirtual   #43  <Method String Class.getName()>
	//    7   14:aload_1         
	//    8   15:invokeinterface #49  <Method Object Map.put(Object, Object)>
	//    9   20:pop             
		map.put(((Object) (Integer.TYPE.getName())), ((Object) (integerserializer)));
	//   10   21:aload_0         
	//   11   22:getstatic       #53  <Field Class Integer.TYPE>
	//   12   25:invokevirtual   #43  <Method String Class.getName()>
	//   13   28:aload_1         
	//   14   29:invokeinterface #49  <Method Object Map.put(Object, Object)>
	//   15   34:pop             
		map.put(((Object) (((Class) (java/lang/Long)).getName())), ((Object) (LongSerializer.instance)));
	//   16   35:aload_0         
	//   17   36:ldc1            #55  <Class Long>
	//   18   38:invokevirtual   #43  <Method String Class.getName()>
	//   19   41:getstatic       #59  <Field NumberSerializers$LongSerializer NumberSerializers$LongSerializer.instance>
	//   20   44:invokeinterface #49  <Method Object Map.put(Object, Object)>
	//   21   49:pop             
		map.put(((Object) (Long.TYPE.getName())), ((Object) (LongSerializer.instance)));
	//   22   50:aload_0         
	//   23   51:getstatic       #60  <Field Class Long.TYPE>
	//   24   54:invokevirtual   #43  <Method String Class.getName()>
	//   25   57:getstatic       #59  <Field NumberSerializers$LongSerializer NumberSerializers$LongSerializer.instance>
	//   26   60:invokeinterface #49  <Method Object Map.put(Object, Object)>
	//   27   65:pop             
		map.put(((Object) (((Class) (java/lang/Byte)).getName())), ((Object) (IntLikeSerializer.instance)));
	//   28   66:aload_0         
	//   29   67:ldc1            #62  <Class Byte>
	//   30   69:invokevirtual   #43  <Method String Class.getName()>
	//   31   72:getstatic       #65  <Field NumberSerializers$IntLikeSerializer NumberSerializers$IntLikeSerializer.instance>
	//   32   75:invokeinterface #49  <Method Object Map.put(Object, Object)>
	//   33   80:pop             
		map.put(((Object) (Byte.TYPE.getName())), ((Object) (IntLikeSerializer.instance)));
	//   34   81:aload_0         
	//   35   82:getstatic       #66  <Field Class Byte.TYPE>
	//   36   85:invokevirtual   #43  <Method String Class.getName()>
	//   37   88:getstatic       #65  <Field NumberSerializers$IntLikeSerializer NumberSerializers$IntLikeSerializer.instance>
	//   38   91:invokeinterface #49  <Method Object Map.put(Object, Object)>
	//   39   96:pop             
		map.put(((Object) (((Class) (java/lang/Short)).getName())), ((Object) (ShortSerializer.instance)));
	//   40   97:aload_0         
	//   41   98:ldc1            #68  <Class Short>
	//   42  100:invokevirtual   #43  <Method String Class.getName()>
	//   43  103:getstatic       #71  <Field NumberSerializers$ShortSerializer NumberSerializers$ShortSerializer.instance>
	//   44  106:invokeinterface #49  <Method Object Map.put(Object, Object)>
	//   45  111:pop             
		map.put(((Object) (Short.TYPE.getName())), ((Object) (ShortSerializer.instance)));
	//   46  112:aload_0         
	//   47  113:getstatic       #72  <Field Class Short.TYPE>
	//   48  116:invokevirtual   #43  <Method String Class.getName()>
	//   49  119:getstatic       #71  <Field NumberSerializers$ShortSerializer NumberSerializers$ShortSerializer.instance>
	//   50  122:invokeinterface #49  <Method Object Map.put(Object, Object)>
	//   51  127:pop             
		map.put(((Object) (((Class) (java/lang/Float)).getName())), ((Object) (FloatSerializer.instance)));
	//   52  128:aload_0         
	//   53  129:ldc1            #74  <Class Float>
	//   54  131:invokevirtual   #43  <Method String Class.getName()>
	//   55  134:getstatic       #77  <Field NumberSerializers$FloatSerializer NumberSerializers$FloatSerializer.instance>
	//   56  137:invokeinterface #49  <Method Object Map.put(Object, Object)>
	//   57  142:pop             
		map.put(((Object) (Float.TYPE.getName())), ((Object) (FloatSerializer.instance)));
	//   58  143:aload_0         
	//   59  144:getstatic       #78  <Field Class Float.TYPE>
	//   60  147:invokevirtual   #43  <Method String Class.getName()>
	//   61  150:getstatic       #77  <Field NumberSerializers$FloatSerializer NumberSerializers$FloatSerializer.instance>
	//   62  153:invokeinterface #49  <Method Object Map.put(Object, Object)>
	//   63  158:pop             
		map.put(((Object) (((Class) (java/lang/Double)).getName())), ((Object) (DoubleSerializer.instance)));
	//   64  159:aload_0         
	//   65  160:ldc1            #80  <Class Double>
	//   66  162:invokevirtual   #43  <Method String Class.getName()>
	//   67  165:getstatic       #83  <Field NumberSerializers$DoubleSerializer NumberSerializers$DoubleSerializer.instance>
	//   68  168:invokeinterface #49  <Method Object Map.put(Object, Object)>
	//   69  173:pop             
		map.put(((Object) (Double.TYPE.getName())), ((Object) (DoubleSerializer.instance)));
	//   70  174:aload_0         
	//   71  175:getstatic       #84  <Field Class Double.TYPE>
	//   72  178:invokevirtual   #43  <Method String Class.getName()>
	//   73  181:getstatic       #83  <Field NumberSerializers$DoubleSerializer NumberSerializers$DoubleSerializer.instance>
	//   74  184:invokeinterface #49  <Method Object Map.put(Object, Object)>
	//   75  189:pop             
	//   76  190:return          
	}
}
