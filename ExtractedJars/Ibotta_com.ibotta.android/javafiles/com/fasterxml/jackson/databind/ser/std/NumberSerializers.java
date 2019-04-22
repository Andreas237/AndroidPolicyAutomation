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
			serializerprovider = ((SerializerProvider) (findFormatOverrides(serializerprovider, beanproperty, handledType())));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:aload_0         
		//    4    4:invokevirtual   #59  <Method Class handledType()>
		//    5    7:invokevirtual   #63  <Method com.fasterxml.jackson.annotation.JsonFormat$Value findFormatOverrides(SerializerProvider, BeanProperty, Class)>
		//    6   10:astore_1        
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

			if(serializerprovider != null)
		//*   7   11:aload_1         
		//*   8   12:ifnull          36
			{
				if(_cls1..SwitchMap.com.fasterxml.jackson.annotation.JsonFormat.Shape[((com.fasterxml.jackson.annotation.JsonFormat.Value) (serializerprovider)).getShape().ordinal()] != 1)
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
			jsongenerator.writeNumber(((Double)obj).doubleValue());
		//    0    0:aload_2         
		//    1    1:aload_1         
		//    2    2:checkcast       #46  <Class Double>
		//    3    5:invokevirtual   #50  <Method double Double.doubleValue()>
		//    4    8:invokevirtual   #56  <Method void JsonGenerator.writeNumber(double)>
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
		//    4    4:invokevirtual   #60  <Method void serialize(Object, JsonGenerator, SerializerProvider)>
		//    5    7:return          
		}

		public DoubleSerializer(Class class1)
		{
			super(class1, com.fasterxml.jackson.core.JsonParser.NumberType.DOUBLE, "number");
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:getstatic       #17  <Field com.fasterxml.jackson.core.JsonParser$NumberType com.fasterxml.jackson.core.JsonParser$NumberType.DOUBLE>
		//    3    5:ldc1            #19  <String "number">
		//    4    7:invokespecial   #22  <Method void NumberSerializers$Base(Class, com.fasterxml.jackson.core.JsonParser$NumberType, String)>
		//    5   10:return          
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
		//    2    2:checkcast       #46  <Class Integer>
		//    3    5:invokevirtual   #50  <Method int Integer.intValue()>
		//    4    8:invokevirtual   #56  <Method void JsonGenerator.writeNumber(int)>
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
		//    4    4:invokevirtual   #60  <Method void serialize(Object, JsonGenerator, SerializerProvider)>
		//    5    7:return          
		}

		public IntegerSerializer(Class class1)
		{
			super(class1, com.fasterxml.jackson.core.JsonParser.NumberType.INT, "integer");
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:getstatic       #17  <Field com.fasterxml.jackson.core.JsonParser$NumberType com.fasterxml.jackson.core.JsonParser$NumberType.INT>
		//    3    5:ldc1            #19  <String "integer">
		//    4    7:invokespecial   #22  <Method void NumberSerializers$Base(Class, com.fasterxml.jackson.core.JsonParser$NumberType, String)>
		//    5   10:return          
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
			jsongenerator.writeNumber(((Long)obj).longValue());
		//    0    0:aload_2         
		//    1    1:aload_1         
		//    2    2:checkcast       #46  <Class Long>
		//    3    5:invokevirtual   #50  <Method long Long.longValue()>
		//    4    8:invokevirtual   #56  <Method void JsonGenerator.writeNumber(long)>
		//    5   11:return          
		}

		public LongSerializer(Class class1)
		{
			super(class1, com.fasterxml.jackson.core.JsonParser.NumberType.LONG, "number");
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:getstatic       #17  <Field com.fasterxml.jackson.core.JsonParser$NumberType com.fasterxml.jackson.core.JsonParser$NumberType.LONG>
		//    3    5:ldc1            #19  <String "number">
		//    4    7:invokespecial   #22  <Method void NumberSerializers$Base(Class, com.fasterxml.jackson.core.JsonParser$NumberType, String)>
		//    5   10:return          
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


	public static void addAll(Map map)
	{
		map.put(((Object) (((Class) (java/lang/Integer)).getName())), ((Object) (new IntegerSerializer(java/lang/Integer))));
	//    0    0:aload_0         
	//    1    1:ldc1            #31  <Class Integer>
	//    2    3:invokevirtual   #37  <Method String Class.getName()>
	//    3    6:new             #20  <Class NumberSerializers$IntegerSerializer>
	//    4    9:dup             
	//    5   10:ldc1            #31  <Class Integer>
	//    6   12:invokespecial   #41  <Method void NumberSerializers$IntegerSerializer(Class)>
	//    7   15:invokeinterface #47  <Method Object Map.put(Object, Object)>
	//    8   20:pop             
		map.put(((Object) (Integer.TYPE.getName())), ((Object) (new IntegerSerializer(Integer.TYPE))));
	//    9   21:aload_0         
	//   10   22:getstatic       #51  <Field Class Integer.TYPE>
	//   11   25:invokevirtual   #37  <Method String Class.getName()>
	//   12   28:new             #20  <Class NumberSerializers$IntegerSerializer>
	//   13   31:dup             
	//   14   32:getstatic       #51  <Field Class Integer.TYPE>
	//   15   35:invokespecial   #41  <Method void NumberSerializers$IntegerSerializer(Class)>
	//   16   38:invokeinterface #47  <Method Object Map.put(Object, Object)>
	//   17   43:pop             
		map.put(((Object) (((Class) (java/lang/Long)).getName())), ((Object) (new LongSerializer(java/lang/Long))));
	//   18   44:aload_0         
	//   19   45:ldc1            #53  <Class Long>
	//   20   47:invokevirtual   #37  <Method String Class.getName()>
	//   21   50:new             #23  <Class NumberSerializers$LongSerializer>
	//   22   53:dup             
	//   23   54:ldc1            #53  <Class Long>
	//   24   56:invokespecial   #54  <Method void NumberSerializers$LongSerializer(Class)>
	//   25   59:invokeinterface #47  <Method Object Map.put(Object, Object)>
	//   26   64:pop             
		map.put(((Object) (Long.TYPE.getName())), ((Object) (new LongSerializer(Long.TYPE))));
	//   27   65:aload_0         
	//   28   66:getstatic       #55  <Field Class Long.TYPE>
	//   29   69:invokevirtual   #37  <Method String Class.getName()>
	//   30   72:new             #23  <Class NumberSerializers$LongSerializer>
	//   31   75:dup             
	//   32   76:getstatic       #55  <Field Class Long.TYPE>
	//   33   79:invokespecial   #54  <Method void NumberSerializers$LongSerializer(Class)>
	//   34   82:invokeinterface #47  <Method Object Map.put(Object, Object)>
	//   35   87:pop             
		map.put(((Object) (((Class) (java/lang/Byte)).getName())), ((Object) (IntLikeSerializer.instance)));
	//   36   88:aload_0         
	//   37   89:ldc1            #57  <Class Byte>
	//   38   91:invokevirtual   #37  <Method String Class.getName()>
	//   39   94:getstatic       #61  <Field NumberSerializers$IntLikeSerializer NumberSerializers$IntLikeSerializer.instance>
	//   40   97:invokeinterface #47  <Method Object Map.put(Object, Object)>
	//   41  102:pop             
		map.put(((Object) (Byte.TYPE.getName())), ((Object) (IntLikeSerializer.instance)));
	//   42  103:aload_0         
	//   43  104:getstatic       #62  <Field Class Byte.TYPE>
	//   44  107:invokevirtual   #37  <Method String Class.getName()>
	//   45  110:getstatic       #61  <Field NumberSerializers$IntLikeSerializer NumberSerializers$IntLikeSerializer.instance>
	//   46  113:invokeinterface #47  <Method Object Map.put(Object, Object)>
	//   47  118:pop             
		map.put(((Object) (((Class) (java/lang/Short)).getName())), ((Object) (ShortSerializer.instance)));
	//   48  119:aload_0         
	//   49  120:ldc1            #64  <Class Short>
	//   50  122:invokevirtual   #37  <Method String Class.getName()>
	//   51  125:getstatic       #67  <Field NumberSerializers$ShortSerializer NumberSerializers$ShortSerializer.instance>
	//   52  128:invokeinterface #47  <Method Object Map.put(Object, Object)>
	//   53  133:pop             
		map.put(((Object) (Short.TYPE.getName())), ((Object) (ShortSerializer.instance)));
	//   54  134:aload_0         
	//   55  135:getstatic       #68  <Field Class Short.TYPE>
	//   56  138:invokevirtual   #37  <Method String Class.getName()>
	//   57  141:getstatic       #67  <Field NumberSerializers$ShortSerializer NumberSerializers$ShortSerializer.instance>
	//   58  144:invokeinterface #47  <Method Object Map.put(Object, Object)>
	//   59  149:pop             
		map.put(((Object) (((Class) (java/lang/Double)).getName())), ((Object) (new DoubleSerializer(java/lang/Double))));
	//   60  150:aload_0         
	//   61  151:ldc1            #70  <Class Double>
	//   62  153:invokevirtual   #37  <Method String Class.getName()>
	//   63  156:new             #11  <Class NumberSerializers$DoubleSerializer>
	//   64  159:dup             
	//   65  160:ldc1            #70  <Class Double>
	//   66  162:invokespecial   #71  <Method void NumberSerializers$DoubleSerializer(Class)>
	//   67  165:invokeinterface #47  <Method Object Map.put(Object, Object)>
	//   68  170:pop             
		map.put(((Object) (Double.TYPE.getName())), ((Object) (new DoubleSerializer(Double.TYPE))));
	//   69  171:aload_0         
	//   70  172:getstatic       #72  <Field Class Double.TYPE>
	//   71  175:invokevirtual   #37  <Method String Class.getName()>
	//   72  178:new             #11  <Class NumberSerializers$DoubleSerializer>
	//   73  181:dup             
	//   74  182:getstatic       #72  <Field Class Double.TYPE>
	//   75  185:invokespecial   #71  <Method void NumberSerializers$DoubleSerializer(Class)>
	//   76  188:invokeinterface #47  <Method Object Map.put(Object, Object)>
	//   77  193:pop             
		map.put(((Object) (((Class) (java/lang/Float)).getName())), ((Object) (FloatSerializer.instance)));
	//   78  194:aload_0         
	//   79  195:ldc1            #74  <Class Float>
	//   80  197:invokevirtual   #37  <Method String Class.getName()>
	//   81  200:getstatic       #77  <Field NumberSerializers$FloatSerializer NumberSerializers$FloatSerializer.instance>
	//   82  203:invokeinterface #47  <Method Object Map.put(Object, Object)>
	//   83  208:pop             
		map.put(((Object) (Float.TYPE.getName())), ((Object) (FloatSerializer.instance)));
	//   84  209:aload_0         
	//   85  210:getstatic       #78  <Field Class Float.TYPE>
	//   86  213:invokevirtual   #37  <Method String Class.getName()>
	//   87  216:getstatic       #77  <Field NumberSerializers$FloatSerializer NumberSerializers$FloatSerializer.instance>
	//   88  219:invokeinterface #47  <Method Object Map.put(Object, Object)>
	//   89  224:pop             
	//   90  225:return          
	}
}
