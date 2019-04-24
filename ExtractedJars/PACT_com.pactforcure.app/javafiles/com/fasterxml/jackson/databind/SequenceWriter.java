// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.cfg.PackageVersion;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.DefaultSerializerProvider;
import com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap;
import com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer;
import java.io.*;
import java.util.Collection;
import java.util.Iterator;

// Referenced classes of package com.fasterxml.jackson.databind:
//			SerializationFeature, SerializationConfig, JsonMappingException, JavaType, 
//			JsonSerializer

public class SequenceWriter
	implements Versioned, Closeable, Flushable
{

	public SequenceWriter(DefaultSerializerProvider defaultserializerprovider, JsonGenerator jsongenerator, boolean flag, ObjectWriter.Prefetch prefetch)
		throws IOException
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #36  <Method void Object()>
		_provider = defaultserializerprovider;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #38  <Field DefaultSerializerProvider _provider>
		_generator = jsongenerator;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #40  <Field JsonGenerator _generator>
		_closeGenerator = flag;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #42  <Field boolean _closeGenerator>
		_rootSerializer = prefetch.getValueSerializer();
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:invokevirtual   #48  <Method JsonSerializer ObjectWriter$Prefetch.getValueSerializer()>
	//   14   25:putfield        #50  <Field JsonSerializer _rootSerializer>
		_typeSerializer = prefetch.getTypeSerializer();
	//   15   28:aload_0         
	//   16   29:aload           4
	//   17   31:invokevirtual   #54  <Method TypeSerializer ObjectWriter$Prefetch.getTypeSerializer()>
	//   18   34:putfield        #56  <Field TypeSerializer _typeSerializer>
		_config = defaultserializerprovider.getConfig();
	//   19   37:aload_0         
	//   20   38:aload_1         
	//   21   39:invokevirtual   #62  <Method SerializationConfig DefaultSerializerProvider.getConfig()>
	//   22   42:putfield        #64  <Field SerializationConfig _config>
		_cfgFlush = _config.isEnabled(SerializationFeature.FLUSH_AFTER_WRITE_VALUE);
	//   23   45:aload_0         
	//   24   46:aload_0         
	//   25   47:getfield        #64  <Field SerializationConfig _config>
	//   26   50:getstatic       #70  <Field SerializationFeature SerializationFeature.FLUSH_AFTER_WRITE_VALUE>
	//   27   53:invokevirtual   #76  <Method boolean SerializationConfig.isEnabled(SerializationFeature)>
	//   28   56:putfield        #78  <Field boolean _cfgFlush>
		_cfgCloseCloseable = _config.isEnabled(SerializationFeature.CLOSE_CLOSEABLE);
	//   29   59:aload_0         
	//   30   60:aload_0         
	//   31   61:getfield        #64  <Field SerializationConfig _config>
	//   32   64:getstatic       #81  <Field SerializationFeature SerializationFeature.CLOSE_CLOSEABLE>
	//   33   67:invokevirtual   #76  <Method boolean SerializationConfig.isEnabled(SerializationFeature)>
	//   34   70:putfield        #83  <Field boolean _cfgCloseCloseable>
		_dynamicSerializers = PropertySerializerMap.emptyForRootValues();
	//   35   73:aload_0         
	//   36   74:invokestatic    #89  <Method PropertySerializerMap PropertySerializerMap.emptyForRootValues()>
	//   37   77:putfield        #91  <Field PropertySerializerMap _dynamicSerializers>
	//   38   80:return          
	}

	private final JsonSerializer _findAndAddDynamic(JavaType javatype)
		throws JsonMappingException
	{
		if(_typeSerializer == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #56  <Field TypeSerializer _typeSerializer>
	//*   2    4:ifnonnull       33
			javatype = ((JavaType) (_dynamicSerializers.findAndAddRootValueSerializer(javatype, ((SerializerProvider) (_provider)))));
	//    3    7:aload_0         
	//    4    8:getfield        #91  <Field PropertySerializerMap _dynamicSerializers>
	//    5   11:aload_1         
	//    6   12:aload_0         
	//    7   13:getfield        #38  <Field DefaultSerializerProvider _provider>
	//    8   16:invokevirtual   #101 <Method com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap$SerializerAndMapResult PropertySerializerMap.findAndAddRootValueSerializer(JavaType, SerializerProvider)>
	//    9   19:astore_1        
		else
	//*  10   20:aload_0         
	//*  11   21:aload_1         
	//*  12   22:getfield        #106 <Field PropertySerializerMap com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap$SerializerAndMapResult.map>
	//*  13   25:putfield        #91  <Field PropertySerializerMap _dynamicSerializers>
	//*  14   28:aload_1         
	//*  15   29:getfield        #109 <Field JsonSerializer com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap$SerializerAndMapResult.serializer>
	//*  16   32:areturn         
			javatype = ((JavaType) (_dynamicSerializers.addSerializer(javatype, ((JsonSerializer) (new TypeWrappedSerializer(_typeSerializer, _provider.findValueSerializer(javatype, ((BeanProperty) (null)))))))));
	//   17   33:aload_0         
	//   18   34:getfield        #91  <Field PropertySerializerMap _dynamicSerializers>
	//   19   37:aload_1         
	//   20   38:new             #111 <Class TypeWrappedSerializer>
	//   21   41:dup             
	//   22   42:aload_0         
	//   23   43:getfield        #56  <Field TypeSerializer _typeSerializer>
	//   24   46:aload_0         
	//   25   47:getfield        #38  <Field DefaultSerializerProvider _provider>
	//   26   50:aload_1         
	//   27   51:aconst_null     
	//   28   52:invokevirtual   #115 <Method JsonSerializer DefaultSerializerProvider.findValueSerializer(JavaType, BeanProperty)>
	//   29   55:invokespecial   #118 <Method void TypeWrappedSerializer(TypeSerializer, JsonSerializer)>
	//   30   58:invokevirtual   #122 <Method com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap$SerializerAndMapResult PropertySerializerMap.addSerializer(JavaType, JsonSerializer)>
	//   31   61:astore_1        
		_dynamicSerializers = ((com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap.SerializerAndMapResult) (javatype)).map;
		return ((com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap.SerializerAndMapResult) (javatype)).serializer;
	//*  32   62:goto            20
	}

	private final JsonSerializer _findAndAddDynamic(Class class1)
		throws JsonMappingException
	{
		if(_typeSerializer == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #56  <Field TypeSerializer _typeSerializer>
	//*   2    4:ifnonnull       33
			class1 = ((Class) (_dynamicSerializers.findAndAddRootValueSerializer(class1, ((SerializerProvider) (_provider)))));
	//    3    7:aload_0         
	//    4    8:getfield        #91  <Field PropertySerializerMap _dynamicSerializers>
	//    5   11:aload_1         
	//    6   12:aload_0         
	//    7   13:getfield        #38  <Field DefaultSerializerProvider _provider>
	//    8   16:invokevirtual   #128 <Method com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap$SerializerAndMapResult PropertySerializerMap.findAndAddRootValueSerializer(Class, SerializerProvider)>
	//    9   19:astore_1        
		else
	//*  10   20:aload_0         
	//*  11   21:aload_1         
	//*  12   22:getfield        #106 <Field PropertySerializerMap com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap$SerializerAndMapResult.map>
	//*  13   25:putfield        #91  <Field PropertySerializerMap _dynamicSerializers>
	//*  14   28:aload_1         
	//*  15   29:getfield        #109 <Field JsonSerializer com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap$SerializerAndMapResult.serializer>
	//*  16   32:areturn         
			class1 = ((Class) (_dynamicSerializers.addSerializer(class1, ((JsonSerializer) (new TypeWrappedSerializer(_typeSerializer, _provider.findValueSerializer(class1, ((BeanProperty) (null)))))))));
	//   17   33:aload_0         
	//   18   34:getfield        #91  <Field PropertySerializerMap _dynamicSerializers>
	//   19   37:aload_1         
	//   20   38:new             #111 <Class TypeWrappedSerializer>
	//   21   41:dup             
	//   22   42:aload_0         
	//   23   43:getfield        #56  <Field TypeSerializer _typeSerializer>
	//   24   46:aload_0         
	//   25   47:getfield        #38  <Field DefaultSerializerProvider _provider>
	//   26   50:aload_1         
	//   27   51:aconst_null     
	//   28   52:invokevirtual   #131 <Method JsonSerializer DefaultSerializerProvider.findValueSerializer(Class, BeanProperty)>
	//   29   55:invokespecial   #118 <Method void TypeWrappedSerializer(TypeSerializer, JsonSerializer)>
	//   30   58:invokevirtual   #134 <Method com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap$SerializerAndMapResult PropertySerializerMap.addSerializer(Class, JsonSerializer)>
	//   31   61:astore_1        
		_dynamicSerializers = ((com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap.SerializerAndMapResult) (class1)).map;
		return ((com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap.SerializerAndMapResult) (class1)).serializer;
	//*  32   62:goto            20
	}

	protected SequenceWriter _writeCloseableValue(Object obj)
		throws IOException
	{
		Closeable closeable;
		Closeable closeable1;
		closeable1 = (Closeable)obj;
	//    0    0:aload_1         
	//    1    1:checkcast       #8   <Class Closeable>
	//    2    4:astore          4
		closeable = closeable1;
	//    3    6:aload           4
	//    4    8:astore_3        
		JsonSerializer jsonserializer1 = _rootSerializer;
	//    5    9:aload_0         
	//    6   10:getfield        #50  <Field JsonSerializer _rootSerializer>
	//    7   13:astore          5
		JsonSerializer jsonserializer;
		jsonserializer = jsonserializer1;
	//    8   15:aload           5
	//    9   17:astore_2        
		if(jsonserializer1 != null)
			break MISSING_BLOCK_LABEL_64;
	//   10   18:aload           5
	//   11   20:ifnonnull       64
		closeable = closeable1;
	//   12   23:aload           4
	//   13   25:astore_3        
		Class class1 = obj.getClass();
	//   14   26:aload_1         
	//   15   27:invokevirtual   #141 <Method Class Object.getClass()>
	//   16   30:astore          6
		closeable = closeable1;
	//   17   32:aload           4
	//   18   34:astore_3        
		jsonserializer1 = _dynamicSerializers.serializerFor(class1);
	//   19   35:aload_0         
	//   20   36:getfield        #91  <Field PropertySerializerMap _dynamicSerializers>
	//   21   39:aload           6
	//   22   41:invokevirtual   #144 <Method JsonSerializer PropertySerializerMap.serializerFor(Class)>
	//   23   44:astore          5
		jsonserializer = jsonserializer1;
	//   24   46:aload           5
	//   25   48:astore_2        
		if(jsonserializer1 != null)
			break MISSING_BLOCK_LABEL_64;
	//   26   49:aload           5
	//   27   51:ifnonnull       64
		closeable = closeable1;
	//   28   54:aload           4
	//   29   56:astore_3        
		jsonserializer = _findAndAddDynamic(class1);
	//   30   57:aload_0         
	//   31   58:aload           6
	//   32   60:invokespecial   #146 <Method JsonSerializer _findAndAddDynamic(Class)>
	//   33   63:astore_2        
		closeable = closeable1;
	//   34   64:aload           4
	//   35   66:astore_3        
		_provider.serializeValue(_generator, obj, ((JavaType) (null)), jsonserializer);
	//   36   67:aload_0         
	//   37   68:getfield        #38  <Field DefaultSerializerProvider _provider>
	//   38   71:aload_0         
	//   39   72:getfield        #40  <Field JsonGenerator _generator>
	//   40   75:aload_1         
	//   41   76:aconst_null     
	//   42   77:aload_2         
	//   43   78:invokevirtual   #150 <Method void DefaultSerializerProvider.serializeValue(JsonGenerator, Object, JavaType, JsonSerializer)>
		closeable = closeable1;
	//   44   81:aload           4
	//   45   83:astore_3        
		if(!_cfgFlush)
			break MISSING_BLOCK_LABEL_101;
	//   46   84:aload_0         
	//   47   85:getfield        #78  <Field boolean _cfgFlush>
	//   48   88:ifeq            101
		closeable = closeable1;
	//   49   91:aload           4
	//   50   93:astore_3        
		_generator.flush();
	//   51   94:aload_0         
	//   52   95:getfield        #40  <Field JsonGenerator _generator>
	//   53   98:invokevirtual   #155 <Method void JsonGenerator.flush()>
		closeable = null;
	//   54  101:aconst_null     
	//   55  102:astore_3        
		closeable1.close();
	//   56  103:aload           4
	//   57  105:invokeinterface #158 <Method void Closeable.close()>
		if(false)
	//*  58  110:iconst_0        
	//*  59  111:ifeq            122
			try
			{
				throw new NullPointerException();
	//   60  114:new             #160 <Class NullPointerException>
	//   61  117:dup             
	//   62  118:invokespecial   #161 <Method void NullPointerException()>
	//   63  121:athrow          
			}
	//*  64  122:aload_0         
	//*  65  123:areturn         
	//*  66  124:astore_1        
	//*  67  125:aload_3         
	//*  68  126:ifnull          135
	//*  69  129:aload_3         
	//*  70  130:invokeinterface #158 <Method void Closeable.close()>
	//*  71  135:aload_1         
	//*  72  136:athrow          
			// Misplaced declaration of an exception variable
			catch(Object obj)
	//*  73  137:astore_1        
			{
				return this;
	//   74  138:aload_0         
	//   75  139:areturn         
			}
		else
			return this;
		obj;
		if(closeable != null)
			try
			{
				closeable.close();
			}
			catch(IOException ioexception) { }
	//   76  140:astore_2        
		throw obj;
	//*  77  141:goto            135
	}

	protected SequenceWriter _writeCloseableValue(Object obj, JavaType javatype)
		throws IOException
	{
		Closeable closeable;
		Closeable closeable1;
		closeable1 = (Closeable)obj;
	//    0    0:aload_1         
	//    1    1:checkcast       #8   <Class Closeable>
	//    2    4:astore          5
		closeable = closeable1;
	//    3    6:aload           5
	//    4    8:astore_3        
		JsonSerializer jsonserializer1 = _dynamicSerializers.serializerFor(javatype.getRawClass());
	//    5    9:aload_0         
	//    6   10:getfield        #91  <Field PropertySerializerMap _dynamicSerializers>
	//    7   13:aload_2         
	//    8   14:invokevirtual   #167 <Method Class JavaType.getRawClass()>
	//    9   17:invokevirtual   #144 <Method JsonSerializer PropertySerializerMap.serializerFor(Class)>
	//   10   20:astore          6
		JsonSerializer jsonserializer;
		jsonserializer = jsonserializer1;
	//   11   22:aload           6
	//   12   24:astore          4
		if(jsonserializer1 != null)
			break MISSING_BLOCK_LABEL_41;
	//   13   26:aload           6
	//   14   28:ifnonnull       41
		closeable = closeable1;
	//   15   31:aload           5
	//   16   33:astore_3        
		jsonserializer = _findAndAddDynamic(javatype);
	//   17   34:aload_0         
	//   18   35:aload_2         
	//   19   36:invokespecial   #169 <Method JsonSerializer _findAndAddDynamic(JavaType)>
	//   20   39:astore          4
		closeable = closeable1;
	//   21   41:aload           5
	//   22   43:astore_3        
		_provider.serializeValue(_generator, obj, javatype, jsonserializer);
	//   23   44:aload_0         
	//   24   45:getfield        #38  <Field DefaultSerializerProvider _provider>
	//   25   48:aload_0         
	//   26   49:getfield        #40  <Field JsonGenerator _generator>
	//   27   52:aload_1         
	//   28   53:aload_2         
	//   29   54:aload           4
	//   30   56:invokevirtual   #150 <Method void DefaultSerializerProvider.serializeValue(JsonGenerator, Object, JavaType, JsonSerializer)>
		closeable = closeable1;
	//   31   59:aload           5
	//   32   61:astore_3        
		if(!_cfgFlush)
			break MISSING_BLOCK_LABEL_79;
	//   33   62:aload_0         
	//   34   63:getfield        #78  <Field boolean _cfgFlush>
	//   35   66:ifeq            79
		closeable = closeable1;
	//   36   69:aload           5
	//   37   71:astore_3        
		_generator.flush();
	//   38   72:aload_0         
	//   39   73:getfield        #40  <Field JsonGenerator _generator>
	//   40   76:invokevirtual   #155 <Method void JsonGenerator.flush()>
		closeable = null;
	//   41   79:aconst_null     
	//   42   80:astore_3        
		closeable1.close();
	//   43   81:aload           5
	//   44   83:invokeinterface #158 <Method void Closeable.close()>
		if(false)
	//*  45   88:iconst_0        
	//*  46   89:ifeq            100
			try
			{
				throw new NullPointerException();
	//   47   92:new             #160 <Class NullPointerException>
	//   48   95:dup             
	//   49   96:invokespecial   #161 <Method void NullPointerException()>
	//   50   99:athrow          
			}
	//*  51  100:aload_0         
	//*  52  101:areturn         
	//*  53  102:astore_1        
	//*  54  103:aload_3         
	//*  55  104:ifnull          113
	//*  56  107:aload_3         
	//*  57  108:invokeinterface #158 <Method void Closeable.close()>
	//*  58  113:aload_1         
	//*  59  114:athrow          
			// Misplaced declaration of an exception variable
			catch(Object obj)
	//*  60  115:astore_1        
			{
				return this;
	//   61  116:aload_0         
	//   62  117:areturn         
			}
		else
			return this;
		obj;
		if(closeable != null)
			try
			{
				closeable.close();
			}
			// Misplaced declaration of an exception variable
			catch(JavaType javatype) { }
	//   63  118:astore_2        
		throw obj;
	//*  64  119:goto            113
	}

	public void close()
		throws IOException
	{
		if(!_closed)
	//*   0    0:aload_0         
	//*   1    1:getfield        #171 <Field boolean _closed>
	//*   2    4:ifne            45
		{
			_closed = true;
	//    3    7:aload_0         
	//    4    8:iconst_1        
	//    5    9:putfield        #171 <Field boolean _closed>
			if(_openArray)
	//*   6   12:aload_0         
	//*   7   13:getfield        #173 <Field boolean _openArray>
	//*   8   16:ifeq            31
			{
				_openArray = false;
	//    9   19:aload_0         
	//   10   20:iconst_0        
	//   11   21:putfield        #173 <Field boolean _openArray>
				_generator.writeEndArray();
	//   12   24:aload_0         
	//   13   25:getfield        #40  <Field JsonGenerator _generator>
	//   14   28:invokevirtual   #176 <Method void JsonGenerator.writeEndArray()>
			}
			if(_closeGenerator)
	//*  15   31:aload_0         
	//*  16   32:getfield        #42  <Field boolean _closeGenerator>
	//*  17   35:ifeq            45
				_generator.close();
	//   18   38:aload_0         
	//   19   39:getfield        #40  <Field JsonGenerator _generator>
	//   20   42:invokevirtual   #177 <Method void JsonGenerator.close()>
		}
	//   21   45:return          
	}

	public void flush()
		throws IOException
	{
		if(!_closed)
	//*   0    0:aload_0         
	//*   1    1:getfield        #171 <Field boolean _closed>
	//*   2    4:ifne            14
			_generator.flush();
	//    3    7:aload_0         
	//    4    8:getfield        #40  <Field JsonGenerator _generator>
	//    5   11:invokevirtual   #155 <Method void JsonGenerator.flush()>
	//    6   14:return          
	}

	public SequenceWriter init(boolean flag)
		throws IOException
	{
		if(flag)
	//*   0    0:iload_1         
	//*   1    1:ifeq            16
		{
			_generator.writeStartArray();
	//    2    4:aload_0         
	//    3    5:getfield        #40  <Field JsonGenerator _generator>
	//    4    8:invokevirtual   #182 <Method void JsonGenerator.writeStartArray()>
			_openArray = true;
	//    5   11:aload_0         
	//    6   12:iconst_1        
	//    7   13:putfield        #173 <Field boolean _openArray>
		}
		return this;
	//    8   16:aload_0         
	//    9   17:areturn         
	}

	public Version version()
	{
		return PackageVersion.VERSION;
	//    0    0:getstatic       #190 <Field Version PackageVersion.VERSION>
	//    1    3:areturn         
	}

	public SequenceWriter write(Object obj)
		throws IOException
	{
		if(obj == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       18
		{
			_provider.serializeValue(_generator, ((Object) (null)));
	//    2    4:aload_0         
	//    3    5:getfield        #38  <Field DefaultSerializerProvider _provider>
	//    4    8:aload_0         
	//    5    9:getfield        #40  <Field JsonGenerator _generator>
	//    6   12:aconst_null     
	//    7   13:invokevirtual   #194 <Method void DefaultSerializerProvider.serializeValue(JsonGenerator, Object)>
		} else
	//*   8   16:aload_0         
	//*   9   17:areturn         
		{
			if(_cfgCloseCloseable && (obj instanceof Closeable))
	//*  10   18:aload_0         
	//*  11   19:getfield        #83  <Field boolean _cfgCloseCloseable>
	//*  12   22:ifeq            38
	//*  13   25:aload_1         
	//*  14   26:instanceof      #8   <Class Closeable>
	//*  15   29:ifeq            38
				return _writeCloseableValue(obj);
	//   16   32:aload_0         
	//   17   33:aload_1         
	//   18   34:invokevirtual   #196 <Method SequenceWriter _writeCloseableValue(Object)>
	//   19   37:areturn         
			JsonSerializer jsonserializer1 = _rootSerializer;
	//   20   38:aload_0         
	//   21   39:getfield        #50  <Field JsonSerializer _rootSerializer>
	//   22   42:astore_3        
			JsonSerializer jsonserializer = jsonserializer1;
	//   23   43:aload_3         
	//   24   44:astore_2        
			if(jsonserializer1 == null)
	//*  25   45:aload_3         
	//*  26   46:ifnonnull       78
			{
				Class class1 = obj.getClass();
	//   27   49:aload_1         
	//   28   50:invokevirtual   #141 <Method Class Object.getClass()>
	//   29   53:astore          4
				JsonSerializer jsonserializer2 = _dynamicSerializers.serializerFor(class1);
	//   30   55:aload_0         
	//   31   56:getfield        #91  <Field PropertySerializerMap _dynamicSerializers>
	//   32   59:aload           4
	//   33   61:invokevirtual   #144 <Method JsonSerializer PropertySerializerMap.serializerFor(Class)>
	//   34   64:astore_3        
				jsonserializer = jsonserializer2;
	//   35   65:aload_3         
	//   36   66:astore_2        
				if(jsonserializer2 == null)
	//*  37   67:aload_3         
	//*  38   68:ifnonnull       78
					jsonserializer = _findAndAddDynamic(class1);
	//   39   71:aload_0         
	//   40   72:aload           4
	//   41   74:invokespecial   #146 <Method JsonSerializer _findAndAddDynamic(Class)>
	//   42   77:astore_2        
			}
			_provider.serializeValue(_generator, obj, ((JavaType) (null)), jsonserializer);
	//   43   78:aload_0         
	//   44   79:getfield        #38  <Field DefaultSerializerProvider _provider>
	//   45   82:aload_0         
	//   46   83:getfield        #40  <Field JsonGenerator _generator>
	//   47   86:aload_1         
	//   48   87:aconst_null     
	//   49   88:aload_2         
	//   50   89:invokevirtual   #150 <Method void DefaultSerializerProvider.serializeValue(JsonGenerator, Object, JavaType, JsonSerializer)>
			if(_cfgFlush)
	//*  51   92:aload_0         
	//*  52   93:getfield        #78  <Field boolean _cfgFlush>
	//*  53   96:ifeq            16
			{
				_generator.flush();
	//   54   99:aload_0         
	//   55  100:getfield        #40  <Field JsonGenerator _generator>
	//   56  103:invokevirtual   #155 <Method void JsonGenerator.flush()>
				return this;
	//   57  106:aload_0         
	//   58  107:areturn         
			}
		}
		return this;
	}

	public SequenceWriter write(Object obj, JavaType javatype)
		throws IOException
	{
		if(obj == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       18
		{
			_provider.serializeValue(_generator, ((Object) (null)));
	//    2    4:aload_0         
	//    3    5:getfield        #38  <Field DefaultSerializerProvider _provider>
	//    4    8:aload_0         
	//    5    9:getfield        #40  <Field JsonGenerator _generator>
	//    6   12:aconst_null     
	//    7   13:invokevirtual   #194 <Method void DefaultSerializerProvider.serializeValue(JsonGenerator, Object)>
		} else
	//*   8   16:aload_0         
	//*   9   17:areturn         
		{
			if(_cfgCloseCloseable && (obj instanceof Closeable))
	//*  10   18:aload_0         
	//*  11   19:getfield        #83  <Field boolean _cfgCloseCloseable>
	//*  12   22:ifeq            39
	//*  13   25:aload_1         
	//*  14   26:instanceof      #8   <Class Closeable>
	//*  15   29:ifeq            39
				return _writeCloseableValue(obj, javatype);
	//   16   32:aload_0         
	//   17   33:aload_1         
	//   18   34:aload_2         
	//   19   35:invokevirtual   #198 <Method SequenceWriter _writeCloseableValue(Object, JavaType)>
	//   20   38:areturn         
			JsonSerializer jsonserializer1 = _dynamicSerializers.serializerFor(javatype.getRawClass());
	//   21   39:aload_0         
	//   22   40:getfield        #91  <Field PropertySerializerMap _dynamicSerializers>
	//   23   43:aload_2         
	//   24   44:invokevirtual   #167 <Method Class JavaType.getRawClass()>
	//   25   47:invokevirtual   #144 <Method JsonSerializer PropertySerializerMap.serializerFor(Class)>
	//   26   50:astore          4
			JsonSerializer jsonserializer = jsonserializer1;
	//   27   52:aload           4
	//   28   54:astore_3        
			if(jsonserializer1 == null)
	//*  29   55:aload           4
	//*  30   57:ifnonnull       66
				jsonserializer = _findAndAddDynamic(javatype);
	//   31   60:aload_0         
	//   32   61:aload_2         
	//   33   62:invokespecial   #169 <Method JsonSerializer _findAndAddDynamic(JavaType)>
	//   34   65:astore_3        
			_provider.serializeValue(_generator, obj, javatype, jsonserializer);
	//   35   66:aload_0         
	//   36   67:getfield        #38  <Field DefaultSerializerProvider _provider>
	//   37   70:aload_0         
	//   38   71:getfield        #40  <Field JsonGenerator _generator>
	//   39   74:aload_1         
	//   40   75:aload_2         
	//   41   76:aload_3         
	//   42   77:invokevirtual   #150 <Method void DefaultSerializerProvider.serializeValue(JsonGenerator, Object, JavaType, JsonSerializer)>
			if(_cfgFlush)
	//*  43   80:aload_0         
	//*  44   81:getfield        #78  <Field boolean _cfgFlush>
	//*  45   84:ifeq            16
			{
				_generator.flush();
	//   46   87:aload_0         
	//   47   88:getfield        #40  <Field JsonGenerator _generator>
	//   48   91:invokevirtual   #155 <Method void JsonGenerator.flush()>
				return this;
	//   49   94:aload_0         
	//   50   95:areturn         
			}
		}
		return this;
	}

	public SequenceWriter writeAll(Iterable iterable)
		throws IOException
	{
		for(iterable = ((Iterable) (iterable.iterator())); ((Iterator) (iterable)).hasNext(); write(((Iterator) (iterable)).next()));
	//    0    0:aload_1         
	//    1    1:invokeinterface #206 <Method Iterator Iterable.iterator()>
	//    2    6:astore_1        
	//    3    7:aload_1         
	//    4    8:invokeinterface #212 <Method boolean Iterator.hasNext()>
	//    5   13:ifeq            30
	//    6   16:aload_0         
	//    7   17:aload_1         
	//    8   18:invokeinterface #216 <Method Object Iterator.next()>
	//    9   23:invokevirtual   #218 <Method SequenceWriter write(Object)>
	//   10   26:pop             
	//*  11   27:goto            7
		return this;
	//   12   30:aload_0         
	//   13   31:areturn         
	}

	public SequenceWriter writeAll(Collection collection)
		throws IOException
	{
		for(collection = ((Collection) (collection.iterator())); ((Iterator) (collection)).hasNext(); write(((Iterator) (collection)).next()));
	//    0    0:aload_1         
	//    1    1:invokeinterface #223 <Method Iterator Collection.iterator()>
	//    2    6:astore_1        
	//    3    7:aload_1         
	//    4    8:invokeinterface #212 <Method boolean Iterator.hasNext()>
	//    5   13:ifeq            30
	//    6   16:aload_0         
	//    7   17:aload_1         
	//    8   18:invokeinterface #216 <Method Object Iterator.next()>
	//    9   23:invokevirtual   #218 <Method SequenceWriter write(Object)>
	//   10   26:pop             
	//*  11   27:goto            7
		return this;
	//   12   30:aload_0         
	//   13   31:areturn         
	}

	public SequenceWriter writeAll(Object aobj[])
		throws IOException
	{
		int i = 0;
	//    0    0:iconst_0        
	//    1    1:istore_2        
		for(int j = aobj.length; i < j; i++)
	//*   2    2:aload_1         
	//*   3    3:arraylength     
	//*   4    4:istore_3        
	//*   5    5:iload_2         
	//*   6    6:iload_3         
	//*   7    7:icmpge          25
			write(aobj[i]);
	//    8   10:aload_0         
	//    9   11:aload_1         
	//   10   12:iload_2         
	//   11   13:aaload          
	//   12   14:invokevirtual   #218 <Method SequenceWriter write(Object)>
	//   13   17:pop             

	//   14   18:iload_2         
	//   15   19:iconst_1        
	//   16   20:iadd            
	//   17   21:istore_2        
	//*  18   22:goto            5
		return this;
	//   19   25:aload_0         
	//   20   26:areturn         
	}

	protected final boolean _cfgCloseCloseable;
	protected final boolean _cfgFlush;
	protected final boolean _closeGenerator;
	protected boolean _closed;
	protected final SerializationConfig _config;
	protected PropertySerializerMap _dynamicSerializers;
	protected final JsonGenerator _generator;
	protected boolean _openArray;
	protected final DefaultSerializerProvider _provider;
	protected final JsonSerializer _rootSerializer;
	protected final TypeSerializer _typeSerializer;
}
