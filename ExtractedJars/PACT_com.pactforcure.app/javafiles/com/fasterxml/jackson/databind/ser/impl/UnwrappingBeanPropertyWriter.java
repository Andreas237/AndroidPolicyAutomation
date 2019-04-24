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
	//*   5    8:ifnull          87
		{
			java.util.Map.Entry entry;
			for(Iterator iterator = jsonnode.fields(); iterator.hasNext(); objectnode.set(((String) (jsonnode)), (JsonNode)entry.getValue()))
	//*   6   11:aload_2         
	//*   7   12:invokevirtual   #40  <Method Iterator JsonNode.fields()>
	//*   8   15:astore          4
	//*   9   17:aload           4
	//*  10   19:invokeinterface #46  <Method boolean Iterator.hasNext()>
	//*  11   24:ifeq            87
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
				jsonnode = ((JsonNode) (s));
	//   20   50:aload_3         
	//   21   51:astore_2        
				if(_nameTransformer != null)
	//*  22   52:aload_0         
	//*  23   53:getfield        #21  <Field NameTransformer _nameTransformer>
	//*  24   56:ifnull          68
					jsonnode = ((JsonNode) (_nameTransformer.transform(s)));
	//   25   59:aload_0         
	//   26   60:getfield        #21  <Field NameTransformer _nameTransformer>
	//   27   63:aload_3         
	//   28   64:invokevirtual   #63  <Method String NameTransformer.transform(String)>
	//   29   67:astore_2        
			}

	//   30   68:aload_1         
	//   31   69:aload_2         
	//   32   70:aload           5
	//   33   72:invokeinterface #66  <Method Object java.util.Map$Entry.getValue()>
	//   34   77:checkcast       #32  <Class JsonNode>
	//   35   80:invokevirtual   #72  <Method JsonNode ObjectNode.set(String, JsonNode)>
	//   36   83:pop             
		}
	//*  37   84:goto            17
	//   38   87:return          
	}

	protected JsonSerializer _findAndAddDynamic(PropertySerializerMap propertyserializermap, Class class1, SerializerProvider serializerprovider)
		throws JsonMappingException
	{
		NameTransformer nametransformer;
		if(_nonTrivialBaseType != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #80  <Field JavaType _nonTrivialBaseType>
	//*   2    4:ifnull          72
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
	//*  12   22:aload_0         
	//*  13   23:getfield        #21  <Field NameTransformer _nameTransformer>
	//*  14   26:astore          4
	//*  15   28:aload           4
	//*  16   30:astore_3        
	//*  17   31:aload_1         
	//*  18   32:invokevirtual   #95  <Method boolean JsonSerializer.isUnwrappingSerializer()>
	//*  19   35:ifeq            51
	//*  20   38:aload           4
	//*  21   40:aload_1         
	//*  22   41:checkcast       #97  <Class UnwrappingBeanSerializer>
	//*  23   44:getfield        #98  <Field NameTransformer UnwrappingBeanSerializer._nameTransformer>
	//*  24   47:invokestatic    #102 <Method NameTransformer NameTransformer.chainedTransformer(NameTransformer, NameTransformer)>
	//*  25   50:astore_3        
	//*  26   51:aload_1         
	//*  27   52:aload_3         
	//*  28   53:invokevirtual   #106 <Method JsonSerializer JsonSerializer.unwrappingSerializer(NameTransformer)>
	//*  29   56:astore_1        
	//*  30   57:aload_0         
	//*  31   58:aload_0         
	//*  32   59:getfield        #110 <Field PropertySerializerMap _dynamicSerializers>
	//*  33   62:aload_2         
	//*  34   63:aload_1         
	//*  35   64:invokevirtual   #116 <Method PropertySerializerMap PropertySerializerMap.newWith(Class, JsonSerializer)>
	//*  36   67:putfield        #110 <Field PropertySerializerMap _dynamicSerializers>
	//*  37   70:aload_1         
	//*  38   71:areturn         
			propertyserializermap = ((PropertySerializerMap) (serializerprovider.findValueSerializer(class1, ((com.fasterxml.jackson.databind.BeanProperty) (this)))));
	//   39   72:aload_3         
	//   40   73:aload_2         
	//   41   74:aload_0         
	//   42   75:invokevirtual   #119 <Method JsonSerializer SerializerProvider.findValueSerializer(Class, com.fasterxml.jackson.databind.BeanProperty)>
	//   43   78:astore_1        
		nametransformer = _nameTransformer;
		serializerprovider = ((SerializerProvider) (nametransformer));
		if(((JsonSerializer) (propertyserializermap)).isUnwrappingSerializer())
			serializerprovider = ((SerializerProvider) (NameTransformer.chainedTransformer(nametransformer, ((UnwrappingBeanSerializer)propertyserializermap)._nameTransformer)));
		propertyserializermap = ((PropertySerializerMap) (((JsonSerializer) (propertyserializermap)).unwrappingSerializer(((NameTransformer) (serializerprovider)))));
		_dynamicSerializers = _dynamicSerializers.newWith(class1, ((JsonSerializer) (propertyserializermap)));
		return ((JsonSerializer) (propertyserializermap));
	//*  44   79:goto            22
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
		super.assignSerializer(jsonserializer);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #130 <Method void BeanPropertyWriter.assignSerializer(JsonSerializer)>
		if(_serializer != null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #134 <Field JsonSerializer _serializer>
	//*   5    9:ifnull          56
		{
			NameTransformer nametransformer = _nameTransformer;
	//    6   12:aload_0         
	//    7   13:getfield        #21  <Field NameTransformer _nameTransformer>
	//    8   16:astore_2        
			jsonserializer = ((JsonSerializer) (nametransformer));
	//    9   17:aload_2         
	//   10   18:astore_1        
			if(_serializer.isUnwrappingSerializer())
	//*  11   19:aload_0         
	//*  12   20:getfield        #134 <Field JsonSerializer _serializer>
	//*  13   23:invokevirtual   #95  <Method boolean JsonSerializer.isUnwrappingSerializer()>
	//*  14   26:ifeq            44
				jsonserializer = ((JsonSerializer) (NameTransformer.chainedTransformer(nametransformer, ((UnwrappingBeanSerializer)_serializer)._nameTransformer)));
	//   15   29:aload_2         
	//   16   30:aload_0         
	//   17   31:getfield        #134 <Field JsonSerializer _serializer>
	//   18   34:checkcast       #97  <Class UnwrappingBeanSerializer>
	//   19   37:getfield        #98  <Field NameTransformer UnwrappingBeanSerializer._nameTransformer>
	//   20   40:invokestatic    #102 <Method NameTransformer NameTransformer.chainedTransformer(NameTransformer, NameTransformer)>
	//   21   43:astore_1        
			_serializer = _serializer.unwrappingSerializer(((NameTransformer) (jsonserializer)));
	//   22   44:aload_0         
	//   23   45:aload_0         
	//   24   46:getfield        #134 <Field JsonSerializer _serializer>
	//   25   49:aload_1         
	//   26   50:invokevirtual   #106 <Method JsonSerializer JsonSerializer.unwrappingSerializer(NameTransformer)>
	//   27   53:putfield        #134 <Field JsonSerializer _serializer>
		}
	//   28   56:return          
	}

	public void depositSchemaProperty(JsonObjectFormatVisitor jsonobjectformatvisitor, final SerializerProvider final_serializerprovider)
		throws JsonMappingException
	{
		JsonSerializer jsonserializer = final_serializerprovider.findValueSerializer(getType(), ((com.fasterxml.jackson.databind.BeanProperty) (this))).unwrappingSerializer(_nameTransformer);
	//    0    0:aload_2         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #141 <Method JavaType getType()>
	//    3    5:aload_0         
	//    4    6:invokevirtual   #90  <Method JsonSerializer SerializerProvider.findValueSerializer(JavaType, com.fasterxml.jackson.databind.BeanProperty)>
	//    5    9:aload_0         
	//    6   10:getfield        #21  <Field NameTransformer _nameTransformer>
	//    7   13:invokevirtual   #106 <Method JsonSerializer JsonSerializer.unwrappingSerializer(NameTransformer)>
	//    8   16:astore_3        
		if(jsonserializer.isUnwrappingSerializer())
	//*   9   17:aload_3         
	//*  10   18:invokevirtual   #95  <Method boolean JsonSerializer.isUnwrappingSerializer()>
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
	//   18   32:invokespecial   #144 <Method void UnwrappingBeanPropertyWriter$1(UnwrappingBeanPropertyWriter, SerializerProvider, JsonObjectFormatVisitor)>
	//   19   35:aload_0         
	//   20   36:invokevirtual   #141 <Method JavaType getType()>
	//   21   39:invokevirtual   #148 <Method void JsonSerializer.acceptJsonFormatVisitor(com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper, JavaType)>
			return;
	//   22   42:return          
		} else
		{
			super.depositSchemaProperty(jsonobjectformatvisitor, final_serializerprovider);
	//   23   43:aload_0         
	//   24   44:aload_1         
	//   25   45:aload_2         
	//   26   46:invokespecial   #150 <Method void BeanPropertyWriter.depositSchemaProperty(JsonObjectFormatVisitor, SerializerProvider)>
			return;
	//   27   49:return          
		}
	}

	public boolean isUnwrapping()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public volatile BeanPropertyWriter rename(NameTransformer nametransformer)
	{
		return ((BeanPropertyWriter) (rename(nametransformer)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #156 <Method UnwrappingBeanPropertyWriter rename(NameTransformer)>
	//    3    5:areturn         
	}

	public UnwrappingBeanPropertyWriter rename(NameTransformer nametransformer)
	{
		String s = nametransformer.transform(_name.getValue());
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #160 <Field SerializedString _name>
	//    3    5:invokevirtual   #165 <Method String SerializedString.getValue()>
	//    4    8:invokevirtual   #63  <Method String NameTransformer.transform(String)>
	//    5   11:astore_2        
		return _new(NameTransformer.chainedTransformer(nametransformer, _nameTransformer), new SerializedString(s));
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:aload_0         
	//    9   15:getfield        #21  <Field NameTransformer _nameTransformer>
	//   10   18:invokestatic    #102 <Method NameTransformer NameTransformer.chainedTransformer(NameTransformer, NameTransformer)>
	//   11   21:new             #162 <Class SerializedString>
	//   12   24:dup             
	//   13   25:aload_2         
	//   14   26:invokespecial   #168 <Method void SerializedString(String)>
	//   15   29:invokevirtual   #170 <Method UnwrappingBeanPropertyWriter _new(NameTransformer, SerializedString)>
	//   16   32:areturn         
	}

	public void serializeAsField(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws Exception
	{
		Object obj1 = get(obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #177 <Method Object get(Object)>
	//    3    5:astore          6
		if(obj1 != null) goto _L2; else goto _L1
	//    4    7:aload           6
	//    5    9:ifnonnull       13
_L1:
		return;
	//    6   12:return          
_L2:
		JsonSerializer jsonserializer;
		JsonSerializer jsonserializer1 = _serializer;
	//    7   13:aload_0         
	//    8   14:getfield        #134 <Field JsonSerializer _serializer>
	//    9   17:astore          5
		jsonserializer = jsonserializer1;
	//   10   19:aload           5
	//   11   21:astore          4
		if(jsonserializer1 == null)
	//*  12   23:aload           5
	//*  13   25:ifnonnull       70
		{
			Class class1 = obj1.getClass();
	//   14   28:aload           6
	//   15   30:invokevirtual   #183 <Method Class Object.getClass()>
	//   16   33:astore          7
			PropertySerializerMap propertyserializermap = _dynamicSerializers;
	//   17   35:aload_0         
	//   18   36:getfield        #110 <Field PropertySerializerMap _dynamicSerializers>
	//   19   39:astore          8
			JsonSerializer jsonserializer2 = propertyserializermap.serializerFor(class1);
	//   20   41:aload           8
	//   21   43:aload           7
	//   22   45:invokevirtual   #187 <Method JsonSerializer PropertySerializerMap.serializerFor(Class)>
	//   23   48:astore          5
			jsonserializer = jsonserializer2;
	//   24   50:aload           5
	//   25   52:astore          4
			if(jsonserializer2 == null)
	//*  26   54:aload           5
	//*  27   56:ifnonnull       70
				jsonserializer = _findAndAddDynamic(propertyserializermap, class1, serializerprovider);
	//   28   59:aload_0         
	//   29   60:aload           8
	//   30   62:aload           7
	//   31   64:aload_3         
	//   32   65:invokevirtual   #189 <Method JsonSerializer _findAndAddDynamic(PropertySerializerMap, Class, SerializerProvider)>
	//   33   68:astore          4
		}
		if(_suppressableValue == null)
			break; /* Loop/switch isn't completed */
	//   34   70:aload_0         
	//   35   71:getfield        #193 <Field Object _suppressableValue>
	//   36   74:ifnull          98
		if(MARKER_FOR_EMPTY != _suppressableValue)
			break MISSING_BLOCK_LABEL_149;
	//   37   77:getstatic       #196 <Field Object MARKER_FOR_EMPTY>
	//   38   80:aload_0         
	//   39   81:getfield        #193 <Field Object _suppressableValue>
	//   40   84:if_acmpne       149
		if(jsonserializer.isEmpty(serializerprovider, obj1)) goto _L1; else goto _L3
	//   41   87:aload           4
	//   42   89:aload_3         
	//   43   90:aload           6
	//   44   92:invokevirtual   #200 <Method boolean JsonSerializer.isEmpty(SerializerProvider, Object)>
	//   45   95:ifne            12
_L3:
		if(obj1 != obj || !_handleSelfReference(obj, jsongenerator, serializerprovider, jsonserializer))
	//*  46   98:aload           6
	//*  47  100:aload_1         
	//*  48  101:if_acmpne       116
	//*  49  104:aload_0         
	//*  50  105:aload_1         
	//*  51  106:aload_2         
	//*  52  107:aload_3         
	//*  53  108:aload           4
	//*  54  110:invokevirtual   #204 <Method boolean _handleSelfReference(Object, JsonGenerator, SerializerProvider, JsonSerializer)>
	//*  55  113:ifne            12
		{
			if(!jsonserializer.isUnwrappingSerializer())
	//*  56  116:aload           4
	//*  57  118:invokevirtual   #95  <Method boolean JsonSerializer.isUnwrappingSerializer()>
	//*  58  121:ifne            132
				jsongenerator.writeFieldName(((com.fasterxml.jackson.core.SerializableString) (_name)));
	//   59  124:aload_2         
	//   60  125:aload_0         
	//   61  126:getfield        #160 <Field SerializedString _name>
	//   62  129:invokevirtual   #210 <Method void JsonGenerator.writeFieldName(com.fasterxml.jackson.core.SerializableString)>
			if(_typeSerializer == null)
	//*  63  132:aload_0         
	//*  64  133:getfield        #214 <Field com.fasterxml.jackson.databind.jsontype.TypeSerializer _typeSerializer>
	//*  65  136:ifnonnull       162
			{
				jsonserializer.serialize(obj1, jsongenerator, serializerprovider);
	//   66  139:aload           4
	//   67  141:aload           6
	//   68  143:aload_2         
	//   69  144:aload_3         
	//   70  145:invokevirtual   #217 <Method void JsonSerializer.serialize(Object, JsonGenerator, SerializerProvider)>
				return;
	//   71  148:return          
			} else
	//*  72  149:aload_0         
	//*  73  150:getfield        #193 <Field Object _suppressableValue>
	//*  74  153:aload           6
	//*  75  155:invokevirtual   #221 <Method boolean Object.equals(Object)>
	//*  76  158:ifeq            98
	//*  77  161:return          
			{
				jsonserializer.serializeWithType(obj1, jsongenerator, serializerprovider, _typeSerializer);
	//   78  162:aload           4
	//   79  164:aload           6
	//   80  166:aload_2         
	//   81  167:aload_3         
	//   82  168:aload_0         
	//   83  169:getfield        #214 <Field com.fasterxml.jackson.databind.jsontype.TypeSerializer _typeSerializer>
	//   84  172:invokevirtual   #225 <Method void JsonSerializer.serializeWithType(Object, JsonGenerator, SerializerProvider, com.fasterxml.jackson.databind.jsontype.TypeSerializer)>
				return;
	//   85  175:return          
			}
		}
		continue; /* Loop/switch isn't completed */
		if(_suppressableValue.equals(obj1))
			return;
		  goto _L3
		if(true) goto _L1; else goto _L4
_L4:
	}

	private static final long serialVersionUID = 1L;
	protected final NameTransformer _nameTransformer;
}
