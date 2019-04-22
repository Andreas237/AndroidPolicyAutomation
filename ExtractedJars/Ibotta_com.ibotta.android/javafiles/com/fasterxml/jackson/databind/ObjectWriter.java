// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.core.io.CharacterEscapes;
import com.fasterxml.jackson.core.io.SegmentedStringWriter;
import com.fasterxml.jackson.core.util.Instantiatable;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.fasterxml.jackson.databind.cfg.PackageVersion;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.DefaultSerializerProvider;
import com.fasterxml.jackson.databind.ser.SerializerFactory;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.io.*;

// Referenced classes of package com.fasterxml.jackson.databind:
//			ObjectMapper, SerializationFeature, SerializationConfig, JsonMappingException, 
//			JavaType, JsonSerializer

public class ObjectWriter
	implements Versioned, Serializable
{
	public static final class GeneratorSettings
		implements Serializable
	{

		public void initialize(JsonGenerator jsongenerator)
		{
			PrettyPrinter prettyprinter1 = prettyPrinter;
		//    0    0:aload_0         
		//    1    1:getfield        #36  <Field PrettyPrinter prettyPrinter>
		//    2    4:astore_3        
			if(prettyprinter1 != null)
		//*   3    5:aload_3         
		//*   4    6:ifnull          53
				if(prettyprinter1 == ObjectWriter.NULL_PRETTY_PRINTER)
		//*   5    9:aload_3         
		//*   6   10:getstatic       #47  <Field PrettyPrinter ObjectWriter.NULL_PRETTY_PRINTER>
		//*   7   13:if_acmpne       25
				{
					jsongenerator.setPrettyPrinter(((PrettyPrinter) (null)));
		//    8   16:aload_1         
		//    9   17:aconst_null     
		//   10   18:invokevirtual   #53  <Method JsonGenerator JsonGenerator.setPrettyPrinter(PrettyPrinter)>
		//   11   21:pop             
				} else
		//*  12   22:goto            53
				{
					PrettyPrinter prettyprinter = prettyprinter1;
		//   13   25:aload_3         
		//   14   26:astore_2        
					if(prettyprinter1 instanceof Instantiatable)
		//*  15   27:aload_3         
		//*  16   28:instanceof      #55  <Class Instantiatable>
		//*  17   31:ifeq            47
						prettyprinter = (PrettyPrinter)((Instantiatable)prettyprinter1).createInstance();
		//   18   34:aload_3         
		//   19   35:checkcast       #55  <Class Instantiatable>
		//   20   38:invokeinterface #59  <Method Object Instantiatable.createInstance()>
		//   21   43:checkcast       #61  <Class PrettyPrinter>
		//   22   46:astore_2        
					jsongenerator.setPrettyPrinter(prettyprinter);
		//   23   47:aload_1         
		//   24   48:aload_2         
		//   25   49:invokevirtual   #53  <Method JsonGenerator JsonGenerator.setPrettyPrinter(PrettyPrinter)>
		//   26   52:pop             
				}
			Object obj = ((Object) (characterEscapes));
		//   27   53:aload_0         
		//   28   54:getfield        #40  <Field CharacterEscapes characterEscapes>
		//   29   57:astore_2        
			if(obj != null)
		//*  30   58:aload_2         
		//*  31   59:ifnull          68
				jsongenerator.setCharacterEscapes(((CharacterEscapes) (obj)));
		//   32   62:aload_1         
		//   33   63:aload_2         
		//   34   64:invokevirtual   #65  <Method JsonGenerator JsonGenerator.setCharacterEscapes(CharacterEscapes)>
		//   35   67:pop             
			obj = ((Object) (schema));
		//   36   68:aload_0         
		//   37   69:getfield        #38  <Field FormatSchema schema>
		//   38   72:astore_2        
			if(obj != null)
		//*  39   73:aload_2         
		//*  40   74:ifnull          82
				jsongenerator.setSchema(((FormatSchema) (obj)));
		//   41   77:aload_1         
		//   42   78:aload_2         
		//   43   79:invokevirtual   #69  <Method void JsonGenerator.setSchema(FormatSchema)>
			obj = ((Object) (rootValueSeparator));
		//   44   82:aload_0         
		//   45   83:getfield        #42  <Field SerializableString rootValueSeparator>
		//   46   86:astore_2        
			if(obj != null)
		//*  47   87:aload_2         
		//*  48   88:ifnull          97
				jsongenerator.setRootValueSeparator(((SerializableString) (obj)));
		//   49   91:aload_1         
		//   50   92:aload_2         
		//   51   93:invokevirtual   #73  <Method JsonGenerator JsonGenerator.setRootValueSeparator(SerializableString)>
		//   52   96:pop             
		//   53   97:return          
		}

		public static final GeneratorSettings empty = new GeneratorSettings(((PrettyPrinter) (null)), ((FormatSchema) (null)), ((CharacterEscapes) (null)), ((SerializableString) (null)));
		private static final long serialVersionUID = 1L;
		public final CharacterEscapes characterEscapes;
		public final PrettyPrinter prettyPrinter;
		public final SerializableString rootValueSeparator;
		public final FormatSchema schema;

		static 
		{
		//    0    0:new             #2   <Class ObjectWriter$GeneratorSettings>
		//    1    3:dup             
		//    2    4:aconst_null     
		//    3    5:aconst_null     
		//    4    6:aconst_null     
		//    5    7:aconst_null     
		//    6    8:invokespecial   #29  <Method void ObjectWriter$GeneratorSettings(PrettyPrinter, FormatSchema, CharacterEscapes, SerializableString)>
		//    7   11:putstatic       #31  <Field ObjectWriter$GeneratorSettings empty>
		//*   8   14:return          
		}

		public GeneratorSettings(PrettyPrinter prettyprinter, FormatSchema formatschema, CharacterEscapes characterescapes, SerializableString serializablestring)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #34  <Method void Object()>
			prettyPrinter = prettyprinter;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #36  <Field PrettyPrinter prettyPrinter>
			schema = formatschema;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #38  <Field FormatSchema schema>
			characterEscapes = characterescapes;
		//    8   14:aload_0         
		//    9   15:aload_3         
		//   10   16:putfield        #40  <Field CharacterEscapes characterEscapes>
			rootValueSeparator = serializablestring;
		//   11   19:aload_0         
		//   12   20:aload           4
		//   13   22:putfield        #42  <Field SerializableString rootValueSeparator>
		//   14   25:return          
		}
	}

	public static final class Prefetch
		implements Serializable
	{

		public void serialize(JsonGenerator jsongenerator, Object obj, DefaultSerializerProvider defaultserializerprovider)
			throws IOException
		{
			Object obj1 = ((Object) (typeSerializer));
		//    0    0:aload_0         
		//    1    1:getfield        #39  <Field TypeSerializer typeSerializer>
		//    2    4:astore          4
			if(obj1 != null)
		//*   3    6:aload           4
		//*   4    8:ifnull          28
			{
				defaultserializerprovider.serializePolymorphic(jsongenerator, obj, rootType, valueSerializer, ((TypeSerializer) (obj1)));
		//    5   11:aload_3         
		//    6   12:aload_1         
		//    7   13:aload_2         
		//    8   14:aload_0         
		//    9   15:getfield        #35  <Field JavaType rootType>
		//   10   18:aload_0         
		//   11   19:getfield        #37  <Field JsonSerializer valueSerializer>
		//   12   22:aload           4
		//   13   24:invokevirtual   #51  <Method void DefaultSerializerProvider.serializePolymorphic(JsonGenerator, Object, JavaType, JsonSerializer, TypeSerializer)>
				return;
		//   14   27:return          
			}
			obj1 = ((Object) (valueSerializer));
		//   15   28:aload_0         
		//   16   29:getfield        #37  <Field JsonSerializer valueSerializer>
		//   17   32:astore          4
			if(obj1 != null)
		//*  18   34:aload           4
		//*  19   36:ifnull          52
			{
				defaultserializerprovider.serializeValue(jsongenerator, obj, rootType, ((JsonSerializer) (obj1)));
		//   20   39:aload_3         
		//   21   40:aload_1         
		//   22   41:aload_2         
		//   23   42:aload_0         
		//   24   43:getfield        #35  <Field JavaType rootType>
		//   25   46:aload           4
		//   26   48:invokevirtual   #55  <Method void DefaultSerializerProvider.serializeValue(JsonGenerator, Object, JavaType, JsonSerializer)>
				return;
		//   27   51:return          
			}
			obj1 = ((Object) (rootType));
		//   28   52:aload_0         
		//   29   53:getfield        #35  <Field JavaType rootType>
		//   30   56:astore          4
			if(obj1 != null)
		//*  31   58:aload           4
		//*  32   60:ifnull          72
			{
				defaultserializerprovider.serializeValue(jsongenerator, obj, ((JavaType) (obj1)));
		//   33   63:aload_3         
		//   34   64:aload_1         
		//   35   65:aload_2         
		//   36   66:aload           4
		//   37   68:invokevirtual   #58  <Method void DefaultSerializerProvider.serializeValue(JsonGenerator, Object, JavaType)>
				return;
		//   38   71:return          
			} else
			{
				defaultserializerprovider.serializeValue(jsongenerator, obj);
		//   39   72:aload_3         
		//   40   73:aload_1         
		//   41   74:aload_2         
		//   42   75:invokevirtual   #61  <Method void DefaultSerializerProvider.serializeValue(JsonGenerator, Object)>
				return;
		//   43   78:return          
			}
		}

		public static final Prefetch empty = new Prefetch(((JavaType) (null)), ((JsonSerializer) (null)), ((TypeSerializer) (null)));
		private static final long serialVersionUID = 1L;
		private final JavaType rootType;
		private final TypeSerializer typeSerializer;
		private final JsonSerializer valueSerializer;

		static 
		{
		//    0    0:new             #2   <Class ObjectWriter$Prefetch>
		//    1    3:dup             
		//    2    4:aconst_null     
		//    3    5:aconst_null     
		//    4    6:aconst_null     
		//    5    7:invokespecial   #28  <Method void ObjectWriter$Prefetch(JavaType, JsonSerializer, TypeSerializer)>
		//    6   10:putstatic       #30  <Field ObjectWriter$Prefetch empty>
		//*   7   13:return          
		}

		private Prefetch(JavaType javatype, JsonSerializer jsonserializer, TypeSerializer typeserializer)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #33  <Method void Object()>
			rootType = javatype;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #35  <Field JavaType rootType>
			valueSerializer = jsonserializer;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #37  <Field JsonSerializer valueSerializer>
			typeSerializer = typeserializer;
		//    8   14:aload_0         
		//    9   15:aload_3         
		//   10   16:putfield        #39  <Field TypeSerializer typeSerializer>
		//   11   19:return          
		}
	}


	protected ObjectWriter(ObjectMapper objectmapper, SerializationConfig serializationconfig)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #44  <Method void Object()>
		_config = serializationconfig;
	//    2    4:aload_0         
	//    3    5:aload_2         
	//    4    6:putfield        #46  <Field SerializationConfig _config>
		_serializerProvider = objectmapper._serializerProvider;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:getfield        #50  <Field DefaultSerializerProvider ObjectMapper._serializerProvider>
	//    8   14:putfield        #51  <Field DefaultSerializerProvider _serializerProvider>
		_serializerFactory = objectmapper._serializerFactory;
	//    9   17:aload_0         
	//   10   18:aload_1         
	//   11   19:getfield        #53  <Field SerializerFactory ObjectMapper._serializerFactory>
	//   12   22:putfield        #54  <Field SerializerFactory _serializerFactory>
		_generatorFactory = objectmapper._jsonFactory;
	//   13   25:aload_0         
	//   14   26:aload_1         
	//   15   27:getfield        #57  <Field JsonFactory ObjectMapper._jsonFactory>
	//   16   30:putfield        #59  <Field JsonFactory _generatorFactory>
		_generatorSettings = GeneratorSettings.empty;
	//   17   33:aload_0         
	//   18   34:getstatic       #62  <Field ObjectWriter$GeneratorSettings ObjectWriter$GeneratorSettings.empty>
	//   19   37:putfield        #64  <Field ObjectWriter$GeneratorSettings _generatorSettings>
		_prefetch = Prefetch.empty;
	//   20   40:aload_0         
	//   21   41:getstatic       #66  <Field ObjectWriter$Prefetch ObjectWriter$Prefetch.empty>
	//   22   44:putfield        #68  <Field ObjectWriter$Prefetch _prefetch>
	//   23   47:return          
	}

	private final void _writeCloseable(JsonGenerator jsongenerator, Object obj)
		throws IOException
	{
		Closeable closeable = (Closeable)obj;
	//    0    0:aload_2         
	//    1    1:checkcast       #76  <Class Closeable>
	//    2    4:astore_3        
		_prefetch.serialize(jsongenerator, obj, _serializerProvider());
	//    3    5:aload_0         
	//    4    6:getfield        #68  <Field ObjectWriter$Prefetch _prefetch>
	//    5    9:aload_1         
	//    6   10:aload_2         
	//    7   11:aload_0         
	//    8   12:invokevirtual   #79  <Method DefaultSerializerProvider _serializerProvider()>
	//    9   15:invokevirtual   #83  <Method void ObjectWriter$Prefetch.serialize(JsonGenerator, Object, DefaultSerializerProvider)>
		try
		{
			closeable.close();
	//   10   18:aload_3         
	//   11   19:invokeinterface #86  <Method void Closeable.close()>
		}
	//*  12   24:aload_1         
	//*  13   25:invokevirtual   #89  <Method void JsonGenerator.close()>
	//*  14   28:return          
		// Misplaced declaration of an exception variable
		catch(Object obj)
	//*  15   29:astore_2        
		{
			closeable = null;
	//   16   30:aconst_null     
	//   17   31:astore_3        
			break MISSING_BLOCK_LABEL_36;
	//   18   32:goto            36
		}
		jsongenerator.close();
		return;
		obj;
	//   19   35:astore_2        
		ClassUtil.closeOnFailAndThrowAsIOE(jsongenerator, closeable, ((Exception) (obj)));
	//   20   36:aload_1         
	//   21   37:aload_3         
	//   22   38:aload_2         
	//   23   39:invokestatic    #95  <Method void ClassUtil.closeOnFailAndThrowAsIOE(JsonGenerator, Closeable, Exception)>
		return;
	//   24   42:return          
	}

	protected final void _configAndWriteValue(JsonGenerator jsongenerator, Object obj)
		throws IOException
	{
		_configureGenerator(jsongenerator);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #101 <Method void _configureGenerator(JsonGenerator)>
		if(_config.isEnabled(SerializationFeature.CLOSE_CLOSEABLE) && (obj instanceof Closeable))
	//*   3    5:aload_0         
	//*   4    6:getfield        #46  <Field SerializationConfig _config>
	//*   5    9:getstatic       #107 <Field SerializationFeature SerializationFeature.CLOSE_CLOSEABLE>
	//*   6   12:invokevirtual   #113 <Method boolean SerializationConfig.isEnabled(SerializationFeature)>
	//*   7   15:ifeq            32
	//*   8   18:aload_2         
	//*   9   19:instanceof      #76  <Class Closeable>
	//*  10   22:ifeq            32
		{
			_writeCloseable(jsongenerator, obj);
	//   11   25:aload_0         
	//   12   26:aload_1         
	//   13   27:aload_2         
	//   14   28:invokespecial   #115 <Method void _writeCloseable(JsonGenerator, Object)>
			return;
	//   15   31:return          
		}
		try
		{
			_prefetch.serialize(jsongenerator, obj, _serializerProvider());
	//   16   32:aload_0         
	//   17   33:getfield        #68  <Field ObjectWriter$Prefetch _prefetch>
	//   18   36:aload_1         
	//   19   37:aload_2         
	//   20   38:aload_0         
	//   21   39:invokevirtual   #79  <Method DefaultSerializerProvider _serializerProvider()>
	//   22   42:invokevirtual   #83  <Method void ObjectWriter$Prefetch.serialize(JsonGenerator, Object, DefaultSerializerProvider)>
		}
	//*  23   45:aload_1         
	//*  24   46:invokevirtual   #89  <Method void JsonGenerator.close()>
	//*  25   49:return          
		// Misplaced declaration of an exception variable
		catch(Object obj)
	//*  26   50:astore_2        
		{
			ClassUtil.closeOnFailAndThrowAsIOE(jsongenerator, ((Exception) (obj)));
	//   27   51:aload_1         
	//   28   52:aload_2         
	//   29   53:invokestatic    #118 <Method void ClassUtil.closeOnFailAndThrowAsIOE(JsonGenerator, Exception)>
			return;
	//   30   56:return          
		}
		jsongenerator.close();
	}

	protected final void _configureGenerator(JsonGenerator jsongenerator)
	{
		_config.initialize(jsongenerator);
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field SerializationConfig _config>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #121 <Method void SerializationConfig.initialize(JsonGenerator)>
		_generatorSettings.initialize(jsongenerator);
	//    4    8:aload_0         
	//    5    9:getfield        #64  <Field ObjectWriter$GeneratorSettings _generatorSettings>
	//    6   12:aload_1         
	//    7   13:invokevirtual   #122 <Method void ObjectWriter$GeneratorSettings.initialize(JsonGenerator)>
	//    8   16:return          
	}

	protected DefaultSerializerProvider _serializerProvider()
	{
		return _serializerProvider.createInstance(_config, _serializerFactory);
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field DefaultSerializerProvider _serializerProvider>
	//    2    4:aload_0         
	//    3    5:getfield        #46  <Field SerializationConfig _config>
	//    4    8:aload_0         
	//    5    9:getfield        #54  <Field SerializerFactory _serializerFactory>
	//    6   12:invokevirtual   #128 <Method DefaultSerializerProvider DefaultSerializerProvider.createInstance(SerializationConfig, SerializerFactory)>
	//    7   15:areturn         
	}

	public Version version()
	{
		return PackageVersion.VERSION;
	//    0    0:getstatic       #136 <Field Version PackageVersion.VERSION>
	//    1    3:areturn         
	}

	public void writeValue(OutputStream outputstream, Object obj)
		throws IOException, JsonGenerationException, JsonMappingException
	{
		_configAndWriteValue(_generatorFactory.createGenerator(outputstream, JsonEncoding.UTF8), obj);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #59  <Field JsonFactory _generatorFactory>
	//    3    5:aload_1         
	//    4    6:getstatic       #148 <Field JsonEncoding JsonEncoding.UTF8>
	//    5    9:invokevirtual   #154 <Method JsonGenerator JsonFactory.createGenerator(OutputStream, JsonEncoding)>
	//    6   12:aload_2         
	//    7   13:invokevirtual   #156 <Method void _configAndWriteValue(JsonGenerator, Object)>
	//    8   16:return          
	}

	public String writeValueAsString(Object obj)
		throws JsonProcessingException
	{
		SegmentedStringWriter segmentedstringwriter = new SegmentedStringWriter(_generatorFactory._getBufferRecycler());
	//    0    0:new             #162 <Class SegmentedStringWriter>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #59  <Field JsonFactory _generatorFactory>
	//    4    8:invokevirtual   #166 <Method com.fasterxml.jackson.core.util.BufferRecycler JsonFactory._getBufferRecycler()>
	//    5   11:invokespecial   #169 <Method void SegmentedStringWriter(com.fasterxml.jackson.core.util.BufferRecycler)>
	//    6   14:astore_2        
		try
		{
			_configAndWriteValue(_generatorFactory.createGenerator(((java.io.Writer) (segmentedstringwriter))), obj);
	//    7   15:aload_0         
	//    8   16:aload_0         
	//    9   17:getfield        #59  <Field JsonFactory _generatorFactory>
	//   10   20:aload_2         
	//   11   21:invokevirtual   #172 <Method JsonGenerator JsonFactory.createGenerator(java.io.Writer)>
	//   12   24:aload_1         
	//   13   25:invokevirtual   #156 <Method void _configAndWriteValue(JsonGenerator, Object)>
		}
	//*  14   28:aload_2         
	//*  15   29:invokevirtual   #176 <Method String SegmentedStringWriter.getAndClear()>
	//*  16   32:areturn         
	//*  17   33:astore_1        
	//*  18   34:aload_1         
	//*  19   35:invokestatic    #180 <Method JsonMappingException JsonMappingException.fromUnexpectedIOE(IOException)>
	//*  20   38:athrow          
		// Misplaced declaration of an exception variable
		catch(Object obj)
	//*  21   39:astore_1        
		{
			throw obj;
	//   22   40:aload_1         
	//   23   41:athrow          
		}
		// Misplaced declaration of an exception variable
		catch(Object obj)
		{
			throw JsonMappingException.fromUnexpectedIOE(((IOException) (obj)));
		}
		return segmentedstringwriter.getAndClear();
	}

	protected static final PrettyPrinter NULL_PRETTY_PRINTER = new MinimalPrettyPrinter();
	private static final long serialVersionUID = 1L;
	protected final SerializationConfig _config;
	protected final JsonFactory _generatorFactory;
	protected final GeneratorSettings _generatorSettings;
	protected final Prefetch _prefetch;
	protected final SerializerFactory _serializerFactory;
	protected final DefaultSerializerProvider _serializerProvider;

	static 
	{
	//    0    0:new             #36  <Class MinimalPrettyPrinter>
	//    1    3:dup             
	//    2    4:invokespecial   #39  <Method void MinimalPrettyPrinter()>
	//    3    7:putstatic       #41  <Field PrettyPrinter NULL_PRETTY_PRINTER>
	//*   4   10:return          
	}
}
