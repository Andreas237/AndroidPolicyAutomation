// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.io.SerializedString;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.ser.BeanPropertyWriter;
import com.fasterxml.jackson.databind.util.NameTransformer;
import java.io.Serializable;
import java.util.Iterator;

// Referenced classes of package com.fasterxml.jackson.databind.ser.impl:
//			UnwrappingBeanSerializer, PropertySerializerMap

public class UnwrappingBeanPropertyWriter extends BeanPropertyWriter
	implements Serializable
{

	public UnwrappingBeanPropertyWriter(BeanPropertyWriter beanpropertywriter, NameTransformer nametransformer)
	{
		super(beanpropertywriter);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #19  <Method void BeanPropertyWriter(BeanPropertyWriter)>
		_nameTransformer = nametransformer;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field NameTransformer _nameTransformer>
	//    6   10:return          
	}

	protected UnwrappingBeanPropertyWriter(UnwrappingBeanPropertyWriter unwrappingbeanpropertywriter, NameTransformer nametransformer, SerializedString serializedstring)
	{
		super(((BeanPropertyWriter) (unwrappingbeanpropertywriter)), serializedstring);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_3         
	//    3    3:invokespecial   #26  <Method void BeanPropertyWriter(BeanPropertyWriter, SerializedString)>
		_nameTransformer = nametransformer;
	//    4    6:aload_0         
	//    5    7:aload_2         
	//    6    8:putfield        #21  <Field NameTransformer _nameTransformer>
	//    7   11:return          
	}

	protected void _depositSchemaProperty(ObjectNode objectnode, JsonNode jsonnode)
	{
		jsonnode = jsonnode.get("properties");
	//    0    0:aload_2         
	//    1    1:ldc1            #30  <String "properties">
	//    2    3:invokevirtual   #36  <Method JsonNode JsonNode.get(String)>
	//    3    6:astore_2        
		if(jsonnode != null)
	//*   4    7:aload_2         
	//*   5    8:ifnull          89
		{
			java.util.Map.Entry entry;
			for(Iterator iterator = jsonnode.fields(); iterator.hasNext(); objectnode.set(((String) (jsonnode)), (JsonNode)entry.getValue()))
	//*   6   11:aload_2         
	//*   7   12:invokevirtual   #40  <Method Iterator JsonNode.fields()>
	//*   8   15:astore          4
	//*   9   17:aload           4
	//*  10   19:invokeinterface #46  <Method boolean Iterator.hasNext()>
	//*  11   24:ifeq            89
			{
				entry = (java.util.Map.Entry)iterator.next();
	//   12   27:aload           4
	//   13   29:invokeinterface #50  <Method Object Iterator.next()>
	//   14   34:checkcast       #52  <Class java.util.Map$Entry>
	//   15   37:astore          5
				String s = (String)entry.getKey();
	//   16   39:aload           5
	//   17   41:invokeinterface #55  <Method Object java.util.Map$Entry.getKey()>
	//   18   46:checkcast       #57  <Class String>
	//   19   49:astore_3        
				NameTransformer nametransformer = _nameTransformer;
	//   20   50:aload_0         
	//   21   51:getfield        #21  <Field NameTransformer _nameTransformer>
	//   22   54:astore          6
				jsonnode = ((JsonNode) (s));
	//   23   56:aload_3         
	//   24   57:astore_2        
				if(nametransformer != null)
	//*  25   58:aload           6
	//*  26   60:ifnull          70
					jsonnode = ((JsonNode) (nametransformer.transform(s)));
	//   27   63:aload           6
	//   28   65:aload_3         
	//   29   66:invokevirtual   #63  <Method String NameTransformer.transform(String)>
	//   30   69:astore_2        
			}

	//   31   70:aload_1         
	//   32   71:aload_2         
	//   33   72:aload           5
	//   34   74:invokeinterface #66  <Method Object java.util.Map$Entry.getValue()>
	//   35   79:checkcast       #32  <Class JsonNode>
	//   36   82:invokevirtual   #72  <Method JsonNode ObjectNode.set(String, JsonNode)>
	//   37   85:pop             
		}
	//*  38   86:goto            17
	//   39   89:return          
	}

	protected JsonSerializer _findAndAddDynamic(PropertySerializerMap propertyserializermap, Class class1, SerializerProvider serializerprovider)
		throws JsonMappingException
	{
		if(_nonTrivialBaseType != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #80  <Field JavaType _nonTrivialBaseType>
	//*   2    4:ifnull          25
			propertyserializermap = ((PropertySerializerMap) (serializerprovider.findValueSerializer(serializerprovider.constructSpecializedType(_nonTrivialBaseType, class1), ((com.fasterxml.jackson.databind.BeanProperty) (this)))));
	//    3    7:aload_3         
	//    4    8:aload_3         
	//    5    9:aload_0         
	//    6   10:getfield        #80  <Field JavaType _nonTrivialBaseType>
	//    7   13:aload_2         
	//    8   14:invokevirtual   #86  <Method JavaType SerializerProvider.constructSpecializedType(JavaType, Class)>
	//    9   17:aload_0         
	//   10   18:invokevirtual   #90  <Method JsonSerializer SerializerProvider.findValueSerializer(JavaType, com.fasterxml.jackson.databind.BeanProperty)>
	//   11   21:astore_1        
		else
	//*  12   22:goto            32
			propertyserializermap = ((PropertySerializerMap) (serializerprovider.findValueSerializer(class1, ((com.fasterxml.jackson.databind.BeanProperty) (this)))));
	//   13   25:aload_3         
	//   14   26:aload_2         
	//   15   27:aload_0         
	//   16   28:invokevirtual   #93  <Method JsonSerializer SerializerProvider.findValueSerializer(Class, com.fasterxml.jackson.databind.BeanProperty)>
	//   17   31:astore_1        
		NameTransformer nametransformer = _nameTransformer;
	//   18   32:aload_0         
	//   19   33:getfield        #21  <Field NameTransformer _nameTransformer>
	//   20   36:astore          4
		serializerprovider = ((SerializerProvider) (nametransformer));
	//   21   38:aload           4
	//   22   40:astore_3        
		if(((JsonSerializer) (propertyserializermap)).isUnwrappingSerializer())
	//*  23   41:aload_1         
	//*  24   42:invokevirtual   #98  <Method boolean JsonSerializer.isUnwrappingSerializer()>
	//*  25   45:ifeq            61
			serializerprovider = ((SerializerProvider) (NameTransformer.chainedTransformer(nametransformer, ((UnwrappingBeanSerializer)propertyserializermap)._nameTransformer)));
	//   26   48:aload           4
	//   27   50:aload_1         
	//   28   51:checkcast       #100 <Class UnwrappingBeanSerializer>
	//   29   54:getfield        #101 <Field NameTransformer UnwrappingBeanSerializer._nameTransformer>
	//   30   57:invokestatic    #105 <Method NameTransformer NameTransformer.chainedTransformer(NameTransformer, NameTransformer)>
	//   31   60:astore_3        
		propertyserializermap = ((PropertySerializerMap) (((JsonSerializer) (propertyserializermap)).unwrappingSerializer(((NameTransformer) (serializerprovider)))));
	//   32   61:aload_1         
	//   33   62:aload_3         
	//   34   63:invokevirtual   #109 <Method JsonSerializer JsonSerializer.unwrappingSerializer(NameTransformer)>
	//   35   66:astore_1        
		_dynamicSerializers = _dynamicSerializers.newWith(class1, ((JsonSerializer) (propertyserializermap)));
	//   36   67:aload_0         
	//   37   68:aload_0         
	//   38   69:getfield        #113 <Field PropertySerializerMap _dynamicSerializers>
	//   39   72:aload_2         
	//   40   73:aload_1         
	//   41   74:invokevirtual   #119 <Method PropertySerializerMap PropertySerializerMap.newWith(Class, JsonSerializer)>
	//   42   77:putfield        #113 <Field PropertySerializerMap _dynamicSerializers>
		return ((JsonSerializer) (propertyserializermap));
	//   43   80:aload_1         
	//   44   81:areturn         
	}

	protected UnwrappingBeanPropertyWriter _new(NameTransformer nametransformer, SerializedString serializedstring)
	{
		return new UnwrappingBeanPropertyWriter(this, nametransformer, serializedstring);
	//    0    0:new             #2   <Class UnwrappingBeanPropertyWriter>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:invokespecial   #126 <Method void UnwrappingBeanPropertyWriter(UnwrappingBeanPropertyWriter, NameTransformer, SerializedString)>
	//    6   10:areturn         
	}

	public void assignSerializer(JsonSerializer jsonserializer)
	{
		Object obj = ((Object) (jsonserializer));
	//    0    0:aload_1         
	//    1    1:astore_2        
		if(jsonserializer != null)
	//*   2    2:aload_1         
	//*   3    3:ifnull          38
		{
			NameTransformer nametransformer = _nameTransformer;
	//    4    6:aload_0         
	//    5    7:getfield        #21  <Field NameTransformer _nameTransformer>
	//    6   10:astore_3        
			obj = ((Object) (nametransformer));
	//    7   11:aload_3         
	//    8   12:astore_2        
			if(jsonserializer.isUnwrappingSerializer())
	//*   9   13:aload_1         
	//*  10   14:invokevirtual   #98  <Method boolean JsonSerializer.isUnwrappingSerializer()>
	//*  11   17:ifeq            32
				obj = ((Object) (NameTransformer.chainedTransformer(nametransformer, ((UnwrappingBeanSerializer)jsonserializer)._nameTransformer)));
	//   12   20:aload_3         
	//   13   21:aload_1         
	//   14   22:checkcast       #100 <Class UnwrappingBeanSerializer>
	//   15   25:getfield        #101 <Field NameTransformer UnwrappingBeanSerializer._nameTransformer>
	//   16   28:invokestatic    #105 <Method NameTransformer NameTransformer.chainedTransformer(NameTransformer, NameTransformer)>
	//   17   31:astore_2        
			obj = ((Object) (jsonserializer.unwrappingSerializer(((NameTransformer) (obj)))));
	//   18   32:aload_1         
	//   19   33:aload_2         
	//   20   34:invokevirtual   #109 <Method JsonSerializer JsonSerializer.unwrappingSerializer(NameTransformer)>
	//   21   37:astore_2        
		}
		super.assignSerializer(((JsonSerializer) (obj)));
	//   22   38:aload_0         
	//   23   39:aload_2         
	//   24   40:invokespecial   #130 <Method void BeanPropertyWriter.assignSerializer(JsonSerializer)>
	//   25   43:return          
	}

	public void depositSchemaProperty(JsonObjectFormatVisitor jsonobjectformatvisitor, final SerializerProvider final_serializerprovider)
		throws JsonMappingException
	{
		JsonSerializer jsonserializer = final_serializerprovider.findValueSerializer(getType(), ((com.fasterxml.jackson.databind.BeanProperty) (this))).unwrappingSerializer(_nameTransformer);
	//    0    0:aload_2         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #137 <Method JavaType getType()>
	//    3    5:aload_0         
	//    4    6:invokevirtual   #90  <Method JsonSerializer SerializerProvider.findValueSerializer(JavaType, com.fasterxml.jackson.databind.BeanProperty)>
	//    5    9:aload_0         
	//    6   10:getfield        #21  <Field NameTransformer _nameTransformer>
	//    7   13:invokevirtual   #109 <Method JsonSerializer JsonSerializer.unwrappingSerializer(NameTransformer)>
	//    8   16:astore_3        
		if(jsonserializer.isUnwrappingSerializer())
	//*   9   17:aload_3         
	//*  10   18:invokevirtual   #98  <Method boolean JsonSerializer.isUnwrappingSerializer()>
	//*  11   21:ifeq            43
		{
			jsonserializer.acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper) (new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base(jsonobjectformatvisitor) {

				public JsonObjectFormatVisitor expectObjectFormat(JavaType javatype)
					throws JsonMappingException
				{
					return visitor;
				//    0    0:aload_0         
				//    1    1:getfield        #19  <Field JsonObjectFormatVisitor val$visitor>
				//    2    4:areturn         
				}

				final UnwrappingBeanPropertyWriter this$0;
				final JsonObjectFormatVisitor val$visitor;

			
			{
				this$0 = UnwrappingBeanPropertyWriter.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field UnwrappingBeanPropertyWriter this$0>
				visitor = jsonobjectformatvisitor;
			//    3    5:aload_0         
			//    4    6:aload_3         
			//    5    7:putfield        #19  <Field JsonObjectFormatVisitor val$visitor>
				super(final_serializerprovider);
			//    6   10:aload_0         
			//    7   11:aload_2         
			//    8   12:invokespecial   #22  <Method void com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper$Base(SerializerProvider)>
			//    9   15:return          
			}
			}
)), getType());
	//   12   24:aload_3         
	//   13   25:new             #8   <Class UnwrappingBeanPropertyWriter$1>
	//   14   28:dup             
	//   15   29:aload_0         
	//   16   30:aload_2         
	//   17   31:aload_1         
	//   18   32:invokespecial   #140 <Method void UnwrappingBeanPropertyWriter$1(UnwrappingBeanPropertyWriter, SerializerProvider, JsonObjectFormatVisitor)>
	//   19   35:aload_0         
	//   20   36:invokevirtual   #137 <Method JavaType getType()>
	//   21   39:invokevirtual   #144 <Method void JsonSerializer.acceptJsonFormatVisitor(com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper, JavaType)>
			return;
	//   22   42:return          
		} else
		{
			super.depositSchemaProperty(jsonobjectformatvisitor, final_serializerprovider);
	//   23   43:aload_0         
	//   24   44:aload_1         
	//   25   45:aload_2         
	//   26   46:invokespecial   #146 <Method void BeanPropertyWriter.depositSchemaProperty(JsonObjectFormatVisitor, SerializerProvider)>
			return;
	//   27   49:return          
		}
	}

	public volatile BeanPropertyWriter rename(NameTransformer nametransformer)
	{
		return ((BeanPropertyWriter) (rename(nametransformer)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #151 <Method UnwrappingBeanPropertyWriter rename(NameTransformer)>
	//    3    5:areturn         
	}

	public UnwrappingBeanPropertyWriter rename(NameTransformer nametransformer)
	{
		String s = nametransformer.transform(_name.getValue());
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #155 <Field SerializedString _name>
	//    3    5:invokevirtual   #160 <Method String SerializedString.getValue()>
	//    4    8:invokevirtual   #63  <Method String NameTransformer.transform(String)>
	//    5   11:astore_2        
		return _new(NameTransformer.chainedTransformer(nametransformer, _nameTransformer), new SerializedString(s));
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:aload_0         
	//    9   15:getfield        #21  <Field NameTransformer _nameTransformer>
	//   10   18:invokestatic    #105 <Method NameTransformer NameTransformer.chainedTransformer(NameTransformer, NameTransformer)>
	//   11   21:new             #157 <Class SerializedString>
	//   12   24:dup             
	//   13   25:aload_2         
	//   14   26:invokespecial   #163 <Method void SerializedString(String)>
	//   15   29:invokevirtual   #165 <Method UnwrappingBeanPropertyWriter _new(NameTransformer, SerializedString)>
	//   16   32:areturn         
	}

	public void serializeAsField(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws Exception
	{
		Object obj1 = get(obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #172 <Method Object get(Object)>
	//    3    5:astore          6
		if(obj1 == null)
	//*   4    7:aload           6
	//*   5    9:ifnonnull       13
			return;
	//    6   12:return          
		JsonSerializer jsonserializer1 = _serializer;
	//    7   13:aload_0         
	//    8   14:getfield        #176 <Field JsonSerializer _serializer>
	//    9   17:astore          5
		JsonSerializer jsonserializer = jsonserializer1;
	//   10   19:aload           5
	//   11   21:astore          4
		if(jsonserializer1 == null)
	//*  12   23:aload           5
	//*  13   25:ifnonnull       69
		{
			Class class1 = obj1.getClass();
	//   14   28:aload           6
	//   15   30:invokevirtual   #182 <Method Class Object.getClass()>
	//   16   33:astore          5
			PropertySerializerMap propertyserializermap = _dynamicSerializers;
	//   17   35:aload_0         
	//   18   36:getfield        #113 <Field PropertySerializerMap _dynamicSerializers>
	//   19   39:astore          7
			jsonserializer = propertyserializermap.serializerFor(class1);
	//   20   41:aload           7
	//   21   43:aload           5
	//   22   45:invokevirtual   #186 <Method JsonSerializer PropertySerializerMap.serializerFor(Class)>
	//   23   48:astore          4
			if(jsonserializer == null)
	//*  24   50:aload           4
	//*  25   52:ifnonnull       69
				jsonserializer = _findAndAddDynamic(propertyserializermap, class1, serializerprovider);
	//   26   55:aload_0         
	//   27   56:aload           7
	//   28   58:aload           5
	//   29   60:aload_3         
	//   30   61:invokevirtual   #188 <Method JsonSerializer _findAndAddDynamic(PropertySerializerMap, Class, SerializerProvider)>
	//   31   64:astore          4
		}
	//*  32   66:goto            69
		if(_suppressableValue != null)
	//*  33   69:aload_0         
	//*  34   70:getfield        #192 <Field Object _suppressableValue>
	//*  35   73:ifnull          111
			if(MARKER_FOR_EMPTY == _suppressableValue)
	//*  36   76:getstatic       #195 <Field Object MARKER_FOR_EMPTY>
	//*  37   79:aload_0         
	//*  38   80:getfield        #192 <Field Object _suppressableValue>
	//*  39   83:if_acmpne       98
			{
				if(jsonserializer.isEmpty(serializerprovider, obj1))
	//*  40   86:aload           4
	//*  41   88:aload_3         
	//*  42   89:aload           6
	//*  43   91:invokevirtual   #199 <Method boolean JsonSerializer.isEmpty(SerializerProvider, Object)>
	//*  44   94:ifeq            111
					return;
	//   45   97:return          
			} else
			if(_suppressableValue.equals(obj1))
	//*  46   98:aload_0         
	//*  47   99:getfield        #192 <Field Object _suppressableValue>
	//*  48  102:aload           6
	//*  49  104:invokevirtual   #203 <Method boolean Object.equals(Object)>
	//*  50  107:ifeq            111
				return;
	//   51  110:return          
		if(obj1 == obj && _handleSelfReference(obj, jsongenerator, serializerprovider, jsonserializer))
	//*  52  111:aload           6
	//*  53  113:aload_1         
	//*  54  114:if_acmpne       130
	//*  55  117:aload_0         
	//*  56  118:aload_1         
	//*  57  119:aload_2         
	//*  58  120:aload_3         
	//*  59  121:aload           4
	//*  60  123:invokevirtual   #207 <Method boolean _handleSelfReference(Object, JsonGenerator, SerializerProvider, JsonSerializer)>
	//*  61  126:ifeq            130
			return;
	//   62  129:return          
		if(!jsonserializer.isUnwrappingSerializer())
	//*  63  130:aload           4
	//*  64  132:invokevirtual   #98  <Method boolean JsonSerializer.isUnwrappingSerializer()>
	//*  65  135:ifne            146
			jsongenerator.writeFieldName(((com.fasterxml.jackson.core.SerializableString) (_name)));
	//   66  138:aload_2         
	//   67  139:aload_0         
	//   68  140:getfield        #155 <Field SerializedString _name>
	//   69  143:invokevirtual   #213 <Method void JsonGenerator.writeFieldName(com.fasterxml.jackson.core.SerializableString)>
		if(_typeSerializer == null)
	//*  70  146:aload_0         
	//*  71  147:getfield        #217 <Field com.fasterxml.jackson.databind.jsontype.TypeSerializer _typeSerializer>
	//*  72  150:ifnonnull       163
		{
			jsonserializer.serialize(obj1, jsongenerator, serializerprovider);
	//   73  153:aload           4
	//   74  155:aload           6
	//   75  157:aload_2         
	//   76  158:aload_3         
	//   77  159:invokevirtual   #220 <Method void JsonSerializer.serialize(Object, JsonGenerator, SerializerProvider)>
			return;
	//   78  162:return          
		} else
		{
			jsonserializer.serializeWithType(obj1, jsongenerator, serializerprovider, _typeSerializer);
	//   79  163:aload           4
	//   80  165:aload           6
	//   81  167:aload_2         
	//   82  168:aload_3         
	//   83  169:aload_0         
	//   84  170:getfield        #217 <Field com.fasterxml.jackson.databind.jsontype.TypeSerializer _typeSerializer>
	//   85  173:invokevirtual   #224 <Method void JsonSerializer.serializeWithType(Object, JsonGenerator, SerializerProvider, com.fasterxml.jackson.databind.jsontype.TypeSerializer)>
			return;
	//   86  176:return          
		}
	}

	private static final long serialVersionUID = 1L;
	protected final NameTransformer _nameTransformer;
}
