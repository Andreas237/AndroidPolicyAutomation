// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.core.io.*;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.core.util.*;
import com.fasterxml.jackson.databind.cfg.ContextAttributes;
import com.fasterxml.jackson.databind.cfg.PackageVersion;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.DefaultSerializerProvider;
import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.SerializerFactory;
import com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer;
import com.fasterxml.jackson.databind.type.TypeFactory;
import java.io.*;
import java.text.DateFormat;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;

// Referenced classes of package com.fasterxml.jackson.databind:
//			ObjectMapper, JavaType, MapperFeature, SerializationConfig, 
//			SerializationFeature, SequenceWriter, JsonMappingException, PropertyName, 
//			JsonSerializer

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
			if(prettyPrinter != null)
		//*   3    5:aload_0         
		//*   4    6:getfield        #36  <Field PrettyPrinter prettyPrinter>
		//*   5    9:ifnull          25
				if(prettyprinter1 == ObjectWriter.NULL_PRETTY_PRINTER)
		//*   6   12:aload_3         
		//*   7   13:getstatic       #47  <Field PrettyPrinter ObjectWriter.NULL_PRETTY_PRINTER>
		//*   8   16:if_acmpne       73
				{
					jsongenerator.setPrettyPrinter(((PrettyPrinter) (null)));
		//    9   19:aload_1         
		//   10   20:aconst_null     
		//   11   21:invokevirtual   #53  <Method JsonGenerator JsonGenerator.setPrettyPrinter(PrettyPrinter)>
		//   12   24:pop             
				} else
		//*  13   25:aload_0         
		//*  14   26:getfield        #40  <Field CharacterEscapes characterEscapes>
		//*  15   29:ifnull          41
		//*  16   32:aload_1         
		//*  17   33:aload_0         
		//*  18   34:getfield        #40  <Field CharacterEscapes characterEscapes>
		//*  19   37:invokevirtual   #57  <Method JsonGenerator JsonGenerator.setCharacterEscapes(CharacterEscapes)>
		//*  20   40:pop             
		//*  21   41:aload_0         
		//*  22   42:getfield        #38  <Field FormatSchema schema>
		//*  23   45:ifnull          56
		//*  24   48:aload_1         
		//*  25   49:aload_0         
		//*  26   50:getfield        #38  <Field FormatSchema schema>
		//*  27   53:invokevirtual   #61  <Method void JsonGenerator.setSchema(FormatSchema)>
		//*  28   56:aload_0         
		//*  29   57:getfield        #42  <Field SerializableString rootValueSeparator>
		//*  30   60:ifnull          72
		//*  31   63:aload_1         
		//*  32   64:aload_0         
		//*  33   65:getfield        #42  <Field SerializableString rootValueSeparator>
		//*  34   68:invokevirtual   #65  <Method JsonGenerator JsonGenerator.setRootValueSeparator(SerializableString)>
		//*  35   71:pop             
		//*  36   72:return          
				{
					PrettyPrinter prettyprinter = prettyprinter1;
		//   37   73:aload_3         
		//   38   74:astore_2        
					if(prettyprinter1 instanceof Instantiatable)
		//*  39   75:aload_3         
		//*  40   76:instanceof      #67  <Class Instantiatable>
		//*  41   79:ifeq            95
						prettyprinter = (PrettyPrinter)((Instantiatable)prettyprinter1).createInstance();
		//   42   82:aload_3         
		//   43   83:checkcast       #67  <Class Instantiatable>
		//   44   86:invokeinterface #71  <Method Object Instantiatable.createInstance()>
		//   45   91:checkcast       #73  <Class PrettyPrinter>
		//   46   94:astore_2        
					jsongenerator.setPrettyPrinter(prettyprinter);
		//   47   95:aload_1         
		//   48   96:aload_2         
		//   49   97:invokevirtual   #53  <Method JsonGenerator JsonGenerator.setPrettyPrinter(PrettyPrinter)>
		//   50  100:pop             
				}
			if(characterEscapes != null)
				jsongenerator.setCharacterEscapes(characterEscapes);
			if(schema != null)
				jsongenerator.setSchema(schema);
			if(rootValueSeparator != null)
				jsongenerator.setRootValueSeparator(rootValueSeparator);
		//*  51  101:goto            25
		}

		public GeneratorSettings with(FormatSchema formatschema)
		{
			if(schema == formatschema)
		//*   0    0:aload_0         
		//*   1    1:getfield        #38  <Field FormatSchema schema>
		//*   2    4:aload_1         
		//*   3    5:if_acmpne       10
				return this;
		//    4    8:aload_0         
		//    5    9:areturn         
			else
				return new GeneratorSettings(prettyPrinter, formatschema, characterEscapes, rootValueSeparator);
		//    6   10:new             #2   <Class ObjectWriter$GeneratorSettings>
		//    7   13:dup             
		//    8   14:aload_0         
		//    9   15:getfield        #36  <Field PrettyPrinter prettyPrinter>
		//   10   18:aload_1         
		//   11   19:aload_0         
		//   12   20:getfield        #40  <Field CharacterEscapes characterEscapes>
		//   13   23:aload_0         
		//   14   24:getfield        #42  <Field SerializableString rootValueSeparator>
		//   15   27:invokespecial   #29  <Method void ObjectWriter$GeneratorSettings(PrettyPrinter, FormatSchema, CharacterEscapes, SerializableString)>
		//   16   30:areturn         
		}

		public GeneratorSettings with(PrettyPrinter prettyprinter)
		{
			PrettyPrinter prettyprinter1 = prettyprinter;
		//    0    0:aload_1         
		//    1    1:astore_2        
			if(prettyprinter == null)
		//*   2    2:aload_1         
		//*   3    3:ifnonnull       10
				prettyprinter1 = ObjectWriter.NULL_PRETTY_PRINTER;
		//    4    6:getstatic       #47  <Field PrettyPrinter ObjectWriter.NULL_PRETTY_PRINTER>
		//    5    9:astore_2        
			if(prettyprinter1 == prettyPrinter)
		//*   6   10:aload_2         
		//*   7   11:aload_0         
		//*   8   12:getfield        #36  <Field PrettyPrinter prettyPrinter>
		//*   9   15:if_acmpne       20
				return this;
		//   10   18:aload_0         
		//   11   19:areturn         
			else
				return new GeneratorSettings(prettyprinter1, schema, characterEscapes, rootValueSeparator);
		//   12   20:new             #2   <Class ObjectWriter$GeneratorSettings>
		//   13   23:dup             
		//   14   24:aload_2         
		//   15   25:aload_0         
		//   16   26:getfield        #38  <Field FormatSchema schema>
		//   17   29:aload_0         
		//   18   30:getfield        #40  <Field CharacterEscapes characterEscapes>
		//   19   33:aload_0         
		//   20   34:getfield        #42  <Field SerializableString rootValueSeparator>
		//   21   37:invokespecial   #29  <Method void ObjectWriter$GeneratorSettings(PrettyPrinter, FormatSchema, CharacterEscapes, SerializableString)>
		//   22   40:areturn         
		}

		public GeneratorSettings with(CharacterEscapes characterescapes)
		{
			if(characterEscapes == characterescapes)
		//*   0    0:aload_0         
		//*   1    1:getfield        #40  <Field CharacterEscapes characterEscapes>
		//*   2    4:aload_1         
		//*   3    5:if_acmpne       10
				return this;
		//    4    8:aload_0         
		//    5    9:areturn         
			else
				return new GeneratorSettings(prettyPrinter, schema, characterescapes, rootValueSeparator);
		//    6   10:new             #2   <Class ObjectWriter$GeneratorSettings>
		//    7   13:dup             
		//    8   14:aload_0         
		//    9   15:getfield        #36  <Field PrettyPrinter prettyPrinter>
		//   10   18:aload_0         
		//   11   19:getfield        #38  <Field FormatSchema schema>
		//   12   22:aload_1         
		//   13   23:aload_0         
		//   14   24:getfield        #42  <Field SerializableString rootValueSeparator>
		//   15   27:invokespecial   #29  <Method void ObjectWriter$GeneratorSettings(PrettyPrinter, FormatSchema, CharacterEscapes, SerializableString)>
		//   16   30:areturn         
		}

		public GeneratorSettings withRootValueSeparator(SerializableString serializablestring)
		{
			if(serializablestring != null ? rootValueSeparator != null && serializablestring.getValue().equals(((Object) (rootValueSeparator.getValue()))) : rootValueSeparator == null)
		//*   0    0:aload_1         
		//*   1    1:ifnonnull       13
		//*   2    4:aload_0         
		//*   3    5:getfield        #42  <Field SerializableString rootValueSeparator>
		//*   4    8:ifnonnull       41
				return this;
		//    5   11:aload_0         
		//    6   12:areturn         
			else
		//*   7   13:aload_0         
		//*   8   14:getfield        #42  <Field SerializableString rootValueSeparator>
		//*   9   17:ifnull          41
		//*  10   20:aload_1         
		//*  11   21:invokeinterface #85  <Method String SerializableString.getValue()>
		//*  12   26:aload_0         
		//*  13   27:getfield        #42  <Field SerializableString rootValueSeparator>
		//*  14   30:invokeinterface #85  <Method String SerializableString.getValue()>
		//*  15   35:invokevirtual   #91  <Method boolean String.equals(Object)>
		//*  16   38:ifne            11
				return new GeneratorSettings(prettyPrinter, schema, characterEscapes, serializablestring);
		//   17   41:new             #2   <Class ObjectWriter$GeneratorSettings>
		//   18   44:dup             
		//   19   45:aload_0         
		//   20   46:getfield        #36  <Field PrettyPrinter prettyPrinter>
		//   21   49:aload_0         
		//   22   50:getfield        #38  <Field FormatSchema schema>
		//   23   53:aload_0         
		//   24   54:getfield        #40  <Field CharacterEscapes characterEscapes>
		//   25   57:aload_1         
		//   26   58:invokespecial   #29  <Method void ObjectWriter$GeneratorSettings(PrettyPrinter, FormatSchema, CharacterEscapes, SerializableString)>
		//   27   61:areturn         
		}

		public GeneratorSettings withRootValueSeparator(String s)
		{
			if(s != null ? s.equals(((Object) (rootValueSeparator))) : rootValueSeparator == null)
		//*   0    0:aload_1         
		//*   1    1:ifnonnull       13
		//*   2    4:aload_0         
		//*   3    5:getfield        #42  <Field SerializableString rootValueSeparator>
		//*   4    8:ifnonnull       24
				return this;
		//    5   11:aload_0         
		//    6   12:areturn         
		//    7   13:aload_1         
		//    8   14:aload_0         
		//    9   15:getfield        #42  <Field SerializableString rootValueSeparator>
		//   10   18:invokevirtual   #91  <Method boolean String.equals(Object)>
		//   11   21:ifne            11
			PrettyPrinter prettyprinter = prettyPrinter;
		//   12   24:aload_0         
		//   13   25:getfield        #36  <Field PrettyPrinter prettyPrinter>
		//   14   28:astore_2        
			FormatSchema formatschema = schema;
		//   15   29:aload_0         
		//   16   30:getfield        #38  <Field FormatSchema schema>
		//   17   33:astore_3        
			CharacterEscapes characterescapes = characterEscapes;
		//   18   34:aload_0         
		//   19   35:getfield        #40  <Field CharacterEscapes characterEscapes>
		//   20   38:astore          4
			if(s == null)
		//*  21   40:aload_1         
		//*  22   41:ifnonnull       59
				s = null;
		//   23   44:aconst_null     
		//   24   45:astore_1        
			else
		//*  25   46:new             #2   <Class ObjectWriter$GeneratorSettings>
		//*  26   49:dup             
		//*  27   50:aload_2         
		//*  28   51:aload_3         
		//*  29   52:aload           4
		//*  30   54:aload_1         
		//*  31   55:invokespecial   #29  <Method void ObjectWriter$GeneratorSettings(PrettyPrinter, FormatSchema, CharacterEscapes, SerializableString)>
		//*  32   58:areturn         
				s = ((String) (new SerializedString(s)));
		//   33   59:new             #94  <Class SerializedString>
		//   34   62:dup             
		//   35   63:aload_1         
		//   36   64:invokespecial   #97  <Method void SerializedString(String)>
		//   37   67:astore_1        
			return new GeneratorSettings(prettyprinter, formatschema, characterescapes, ((SerializableString) (s)));
		//*  38   68:goto            46
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

		public Prefetch forRootType(ObjectWriter objectwriter, JavaType javatype)
		{
			boolean flag1 = true;
		//    0    0:iconst_1        
		//    1    1:istore          4
			boolean flag = flag1;
		//    2    3:iload           4
		//    3    5:istore_3        
			if(javatype != null)
		//*   4    6:aload_2         
		//*   5    7:ifnull          20
				if(javatype.isJavaLangObject())
		//*   6   10:aload_2         
		//*   7   11:invokevirtual   #51  <Method boolean JavaType.isJavaLangObject()>
		//*   8   14:ifeq            40
					flag = flag1;
		//    9   17:iload           4
		//   10   19:istore_3        
				else
		//*  11   20:iload_3         
		//*  12   21:ifeq            59
		//*  13   24:aload_0         
		//*  14   25:getfield        #35  <Field JavaType rootType>
		//*  15   28:ifnull          38
		//*  16   31:aload_0         
		//*  17   32:getfield        #37  <Field JsonSerializer valueSerializer>
		//*  18   35:ifnonnull       45
		//*  19   38:aload_0         
		//*  20   39:areturn         
					flag = false;
		//   21   40:iconst_0        
		//   22   41:istore_3        
			if(!flag) goto _L2; else goto _L1
_L1:
			if(rootType != null && valueSerializer != null) goto _L4; else goto _L3
_L3:
			return this;
		//*  23   42:goto            20
_L4:
			return new Prefetch(((JavaType) (null)), ((JsonSerializer) (null)), typeSerializer);
		//   24   45:new             #2   <Class ObjectWriter$Prefetch>
		//   25   48:dup             
		//   26   49:aconst_null     
		//   27   50:aconst_null     
		//   28   51:aload_0         
		//   29   52:getfield        #39  <Field TypeSerializer typeSerializer>
		//   30   55:invokespecial   #28  <Method void ObjectWriter$Prefetch(JavaType, JsonSerializer, TypeSerializer)>
		//   31   58:areturn         
_L2:
			if(javatype.equals(((Object) (rootType)))) goto _L3; else goto _L5
		//   32   59:aload_2         
		//   33   60:aload_0         
		//   34   61:getfield        #35  <Field JavaType rootType>
		//   35   64:invokevirtual   #55  <Method boolean JavaType.equals(Object)>
		//   36   67:ifne            38
_L5:
			if(!objectwriter.isEnabled(SerializationFeature.EAGER_SERIALIZER_FETCH))
				break MISSING_BLOCK_LABEL_131;
		//   37   70:aload_1         
		//   38   71:getstatic       #61  <Field SerializationFeature SerializationFeature.EAGER_SERIALIZER_FETCH>
		//   39   74:invokevirtual   #65  <Method boolean ObjectWriter.isEnabled(SerializationFeature)>
		//   40   77:ifeq            131
			objectwriter = ((ObjectWriter) (objectwriter._serializerProvider()));
		//   41   80:aload_1         
		//   42   81:invokevirtual   #69  <Method DefaultSerializerProvider ObjectWriter._serializerProvider()>
		//   43   84:astore_1        
			objectwriter = ((ObjectWriter) (((DefaultSerializerProvider) (objectwriter)).findTypedValueSerializer(javatype, true, ((BeanProperty) (null)))));
		//   44   85:aload_1         
		//   45   86:aload_2         
		//   46   87:iconst_1        
		//   47   88:aconst_null     
		//   48   89:invokevirtual   #75  <Method JsonSerializer DefaultSerializerProvider.findTypedValueSerializer(JavaType, boolean, BeanProperty)>
		//   49   92:astore_1        
			if(objectwriter instanceof TypeWrappedSerializer)
		//*  50   93:aload_1         
		//*  51   94:instanceof      #77  <Class TypeWrappedSerializer>
		//*  52   97:ifeq            117
				return new Prefetch(javatype, ((JsonSerializer) (null)), ((TypeWrappedSerializer)objectwriter).typeSerializer());
		//   53  100:new             #2   <Class ObjectWriter$Prefetch>
		//   54  103:dup             
		//   55  104:aload_2         
		//   56  105:aconst_null     
		//   57  106:aload_1         
		//   58  107:checkcast       #77  <Class TypeWrappedSerializer>
		//   59  110:invokevirtual   #80  <Method TypeSerializer TypeWrappedSerializer.typeSerializer()>
		//   60  113:invokespecial   #28  <Method void ObjectWriter$Prefetch(JavaType, JsonSerializer, TypeSerializer)>
		//   61  116:areturn         
			objectwriter = ((ObjectWriter) (new Prefetch(javatype, ((JsonSerializer) (objectwriter)), ((TypeSerializer) (null)))));
		//   62  117:new             #2   <Class ObjectWriter$Prefetch>
		//   63  120:dup             
		//   64  121:aload_2         
		//   65  122:aload_1         
		//   66  123:aconst_null     
		//   67  124:invokespecial   #28  <Method void ObjectWriter$Prefetch(JavaType, JsonSerializer, TypeSerializer)>
		//   68  127:astore_1        
			return ((Prefetch) (objectwriter));
		//   69  128:aload_1         
		//   70  129:areturn         
			objectwriter;
		//   71  130:astore_1        
			return new Prefetch(((JavaType) (null)), ((JsonSerializer) (null)), typeSerializer);
		//   72  131:new             #2   <Class ObjectWriter$Prefetch>
		//   73  134:dup             
		//   74  135:aconst_null     
		//   75  136:aconst_null     
		//   76  137:aload_0         
		//   77  138:getfield        #39  <Field TypeSerializer typeSerializer>
		//   78  141:invokespecial   #28  <Method void ObjectWriter$Prefetch(JavaType, JsonSerializer, TypeSerializer)>
		//   79  144:areturn         
		}

		public final TypeSerializer getTypeSerializer()
		{
			return typeSerializer;
		//    0    0:aload_0         
		//    1    1:getfield        #39  <Field TypeSerializer typeSerializer>
		//    2    4:areturn         
		}

		public final JsonSerializer getValueSerializer()
		{
			return valueSerializer;
		//    0    0:aload_0         
		//    1    1:getfield        #37  <Field JsonSerializer valueSerializer>
		//    2    4:areturn         
		}

		public boolean hasSerializer()
		{
			return valueSerializer != null || typeSerializer != null;
		//    0    0:aload_0         
		//    1    1:getfield        #37  <Field JsonSerializer valueSerializer>
		//    2    4:ifnonnull       14
		//    3    7:aload_0         
		//    4    8:getfield        #39  <Field TypeSerializer typeSerializer>
		//    5   11:ifnull          16
		//    6   14:iconst_1        
		//    7   15:ireturn         
		//    8   16:iconst_0        
		//    9   17:ireturn         
		}

		public void serialize(JsonGenerator jsongenerator, Object obj, DefaultSerializerProvider defaultserializerprovider)
			throws IOException
		{
			if(typeSerializer != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #39  <Field TypeSerializer typeSerializer>
		//*   2    4:ifnull          26
			{
				defaultserializerprovider.serializePolymorphic(jsongenerator, obj, rootType, valueSerializer, typeSerializer);
		//    3    7:aload_3         
		//    4    8:aload_1         
		//    5    9:aload_2         
		//    6   10:aload_0         
		//    7   11:getfield        #35  <Field JavaType rootType>
		//    8   14:aload_0         
		//    9   15:getfield        #37  <Field JsonSerializer valueSerializer>
		//   10   18:aload_0         
		//   11   19:getfield        #39  <Field TypeSerializer typeSerializer>
		//   12   22:invokevirtual   #93  <Method void DefaultSerializerProvider.serializePolymorphic(JsonGenerator, Object, JavaType, JsonSerializer, TypeSerializer)>
				return;
		//   13   25:return          
			}
			if(valueSerializer != null)
		//*  14   26:aload_0         
		//*  15   27:getfield        #37  <Field JsonSerializer valueSerializer>
		//*  16   30:ifnull          48
			{
				defaultserializerprovider.serializeValue(jsongenerator, obj, rootType, valueSerializer);
		//   17   33:aload_3         
		//   18   34:aload_1         
		//   19   35:aload_2         
		//   20   36:aload_0         
		//   21   37:getfield        #35  <Field JavaType rootType>
		//   22   40:aload_0         
		//   23   41:getfield        #37  <Field JsonSerializer valueSerializer>
		//   24   44:invokevirtual   #97  <Method void DefaultSerializerProvider.serializeValue(JsonGenerator, Object, JavaType, JsonSerializer)>
				return;
		//   25   47:return          
			} else
			{
				defaultserializerprovider.serializeValue(jsongenerator, obj);
		//   26   48:aload_3         
		//   27   49:aload_1         
		//   28   50:aload_2         
		//   29   51:invokevirtual   #100 <Method void DefaultSerializerProvider.serializeValue(JsonGenerator, Object)>
				return;
		//   30   54:return          
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

	protected ObjectWriter(ObjectMapper objectmapper, SerializationConfig serializationconfig, FormatSchema formatschema)
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
		if(formatschema == null)
	//*  17   33:aload_3         
	//*  18   34:ifnonnull       54
			objectmapper = ((ObjectMapper) (GeneratorSettings.empty));
	//   19   37:getstatic       #62  <Field ObjectWriter$GeneratorSettings ObjectWriter$GeneratorSettings.empty>
	//   20   40:astore_1        
		else
	//*  21   41:aload_0         
	//*  22   42:aload_1         
	//*  23   43:putfield        #64  <Field ObjectWriter$GeneratorSettings _generatorSettings>
	//*  24   46:aload_0         
	//*  25   47:getstatic       #66  <Field ObjectWriter$Prefetch ObjectWriter$Prefetch.empty>
	//*  26   50:putfield        #68  <Field ObjectWriter$Prefetch _prefetch>
	//*  27   53:return          
			objectmapper = ((ObjectMapper) (new GeneratorSettings(((PrettyPrinter) (null)), formatschema, ((CharacterEscapes) (null)), ((SerializableString) (null)))));
	//   28   54:new             #10  <Class ObjectWriter$GeneratorSettings>
	//   29   57:dup             
	//   30   58:aconst_null     
	//   31   59:aload_3         
	//   32   60:aconst_null     
	//   33   61:aconst_null     
	//   34   62:invokespecial   #72  <Method void ObjectWriter$GeneratorSettings(PrettyPrinter, FormatSchema, CharacterEscapes, SerializableString)>
	//   35   65:astore_1        
		_generatorSettings = ((GeneratorSettings) (objectmapper));
		_prefetch = Prefetch.empty;
	//*  36   66:goto            41
	}

	protected ObjectWriter(ObjectMapper objectmapper, SerializationConfig serializationconfig, JavaType javatype, PrettyPrinter prettyprinter)
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
		if(prettyprinter == null)
	//*  17   33:aload           4
	//*  18   35:ifnonnull       68
			objectmapper = ((ObjectMapper) (GeneratorSettings.empty));
	//   19   38:getstatic       #62  <Field ObjectWriter$GeneratorSettings ObjectWriter$GeneratorSettings.empty>
	//   20   41:astore_1        
		else
	//*  21   42:aload_0         
	//*  22   43:aload_1         
	//*  23   44:putfield        #64  <Field ObjectWriter$GeneratorSettings _generatorSettings>
	//*  24   47:aload_3         
	//*  25   48:ifnull          60
	//*  26   51:aload_3         
	//*  27   52:ldc1            #4   <Class Object>
	//*  28   54:invokevirtual   #79  <Method boolean JavaType.hasRawClass(Class)>
	//*  29   57:ifeq            84
	//*  30   60:aload_0         
	//*  31   61:getstatic       #66  <Field ObjectWriter$Prefetch ObjectWriter$Prefetch.empty>
	//*  32   64:putfield        #68  <Field ObjectWriter$Prefetch _prefetch>
	//*  33   67:return          
			objectmapper = ((ObjectMapper) (new GeneratorSettings(prettyprinter, ((FormatSchema) (null)), ((CharacterEscapes) (null)), ((SerializableString) (null)))));
	//   34   68:new             #10  <Class ObjectWriter$GeneratorSettings>
	//   35   71:dup             
	//   36   72:aload           4
	//   37   74:aconst_null     
	//   38   75:aconst_null     
	//   39   76:aconst_null     
	//   40   77:invokespecial   #72  <Method void ObjectWriter$GeneratorSettings(PrettyPrinter, FormatSchema, CharacterEscapes, SerializableString)>
	//   41   80:astore_1        
		_generatorSettings = ((GeneratorSettings) (objectmapper));
		if(javatype == null || javatype.hasRawClass(java/lang/Object))
		{
			_prefetch = Prefetch.empty;
			return;
		} else
	//*  42   81:goto            42
		{
			objectmapper = ((ObjectMapper) (javatype.withStaticTyping()));
	//   43   84:aload_3         
	//   44   85:invokevirtual   #83  <Method JavaType JavaType.withStaticTyping()>
	//   45   88:astore_1        
			_prefetch = Prefetch.empty.forRootType(this, ((JavaType) (objectmapper)));
	//   46   89:aload_0         
	//   47   90:getstatic       #66  <Field ObjectWriter$Prefetch ObjectWriter$Prefetch.empty>
	//   48   93:aload_0         
	//   49   94:aload_1         
	//   50   95:invokevirtual   #87  <Method ObjectWriter$Prefetch ObjectWriter$Prefetch.forRootType(ObjectWriter, JavaType)>
	//   51   98:putfield        #68  <Field ObjectWriter$Prefetch _prefetch>
			return;
	//   52  101:return          
		}
	}

	protected ObjectWriter(ObjectWriter objectwriter, JsonFactory jsonfactory)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #44  <Method void Object()>
		_config = objectwriter._config.with(MapperFeature.SORT_PROPERTIES_ALPHABETICALLY, jsonfactory.requiresPropertyOrdering());
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:getfield        #46  <Field SerializationConfig _config>
	//    5    9:getstatic       #94  <Field MapperFeature MapperFeature.SORT_PROPERTIES_ALPHABETICALLY>
	//    6   12:aload_2         
	//    7   13:invokevirtual   #100 <Method boolean JsonFactory.requiresPropertyOrdering()>
	//    8   16:invokevirtual   #106 <Method SerializationConfig SerializationConfig.with(MapperFeature, boolean)>
	//    9   19:putfield        #46  <Field SerializationConfig _config>
		_serializerProvider = objectwriter._serializerProvider;
	//   10   22:aload_0         
	//   11   23:aload_1         
	//   12   24:getfield        #51  <Field DefaultSerializerProvider _serializerProvider>
	//   13   27:putfield        #51  <Field DefaultSerializerProvider _serializerProvider>
		_serializerFactory = objectwriter._serializerFactory;
	//   14   30:aload_0         
	//   15   31:aload_1         
	//   16   32:getfield        #54  <Field SerializerFactory _serializerFactory>
	//   17   35:putfield        #54  <Field SerializerFactory _serializerFactory>
		_generatorFactory = objectwriter._generatorFactory;
	//   18   38:aload_0         
	//   19   39:aload_1         
	//   20   40:getfield        #59  <Field JsonFactory _generatorFactory>
	//   21   43:putfield        #59  <Field JsonFactory _generatorFactory>
		_generatorSettings = objectwriter._generatorSettings;
	//   22   46:aload_0         
	//   23   47:aload_1         
	//   24   48:getfield        #64  <Field ObjectWriter$GeneratorSettings _generatorSettings>
	//   25   51:putfield        #64  <Field ObjectWriter$GeneratorSettings _generatorSettings>
		_prefetch = objectwriter._prefetch;
	//   26   54:aload_0         
	//   27   55:aload_1         
	//   28   56:getfield        #68  <Field ObjectWriter$Prefetch _prefetch>
	//   29   59:putfield        #68  <Field ObjectWriter$Prefetch _prefetch>
	//   30   62:return          
	}

	protected ObjectWriter(ObjectWriter objectwriter, SerializationConfig serializationconfig)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #44  <Method void Object()>
		_config = serializationconfig;
	//    2    4:aload_0         
	//    3    5:aload_2         
	//    4    6:putfield        #46  <Field SerializationConfig _config>
		_serializerProvider = objectwriter._serializerProvider;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:getfield        #51  <Field DefaultSerializerProvider _serializerProvider>
	//    8   14:putfield        #51  <Field DefaultSerializerProvider _serializerProvider>
		_serializerFactory = objectwriter._serializerFactory;
	//    9   17:aload_0         
	//   10   18:aload_1         
	//   11   19:getfield        #54  <Field SerializerFactory _serializerFactory>
	//   12   22:putfield        #54  <Field SerializerFactory _serializerFactory>
		_generatorFactory = objectwriter._generatorFactory;
	//   13   25:aload_0         
	//   14   26:aload_1         
	//   15   27:getfield        #59  <Field JsonFactory _generatorFactory>
	//   16   30:putfield        #59  <Field JsonFactory _generatorFactory>
		_generatorSettings = objectwriter._generatorSettings;
	//   17   33:aload_0         
	//   18   34:aload_1         
	//   19   35:getfield        #64  <Field ObjectWriter$GeneratorSettings _generatorSettings>
	//   20   38:putfield        #64  <Field ObjectWriter$GeneratorSettings _generatorSettings>
		_prefetch = objectwriter._prefetch;
	//   21   41:aload_0         
	//   22   42:aload_1         
	//   23   43:getfield        #68  <Field ObjectWriter$Prefetch _prefetch>
	//   24   46:putfield        #68  <Field ObjectWriter$Prefetch _prefetch>
	//   25   49:return          
	}

	protected ObjectWriter(ObjectWriter objectwriter, SerializationConfig serializationconfig, GeneratorSettings generatorsettings, Prefetch prefetch)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #44  <Method void Object()>
		_config = serializationconfig;
	//    2    4:aload_0         
	//    3    5:aload_2         
	//    4    6:putfield        #46  <Field SerializationConfig _config>
		_serializerProvider = objectwriter._serializerProvider;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:getfield        #51  <Field DefaultSerializerProvider _serializerProvider>
	//    8   14:putfield        #51  <Field DefaultSerializerProvider _serializerProvider>
		_serializerFactory = objectwriter._serializerFactory;
	//    9   17:aload_0         
	//   10   18:aload_1         
	//   11   19:getfield        #54  <Field SerializerFactory _serializerFactory>
	//   12   22:putfield        #54  <Field SerializerFactory _serializerFactory>
		_generatorFactory = objectwriter._generatorFactory;
	//   13   25:aload_0         
	//   14   26:aload_1         
	//   15   27:getfield        #59  <Field JsonFactory _generatorFactory>
	//   16   30:putfield        #59  <Field JsonFactory _generatorFactory>
		_generatorSettings = generatorsettings;
	//   17   33:aload_0         
	//   18   34:aload_3         
	//   19   35:putfield        #64  <Field ObjectWriter$GeneratorSettings _generatorSettings>
		_prefetch = prefetch;
	//   20   38:aload_0         
	//   21   39:aload           4
	//   22   41:putfield        #68  <Field ObjectWriter$Prefetch _prefetch>
	//   23   44:return          
	}

	private final void _writeCloseable(JsonGenerator jsongenerator, Object obj)
		throws IOException
	{
		Closeable closeable;
		Object obj1;
		Closeable closeable1;
		closeable1 = (Closeable)obj;
	//    0    0:aload_2         
	//    1    1:checkcast       #114 <Class Closeable>
	//    2    4:astore          5
		closeable = closeable1;
	//    3    6:aload           5
	//    4    8:astore_3        
		obj1 = ((Object) (jsongenerator));
	//    5    9:aload_1         
	//    6   10:astore          4
		_prefetch.serialize(jsongenerator, obj, _serializerProvider());
	//    7   12:aload_0         
	//    8   13:getfield        #68  <Field ObjectWriter$Prefetch _prefetch>
	//    9   16:aload_1         
	//   10   17:aload_2         
	//   11   18:aload_0         
	//   12   19:invokevirtual   #117 <Method DefaultSerializerProvider _serializerProvider()>
	//   13   22:invokevirtual   #121 <Method void ObjectWriter$Prefetch.serialize(JsonGenerator, Object, DefaultSerializerProvider)>
		obj = null;
	//   14   25:aconst_null     
	//   15   26:astore_2        
		closeable = closeable1;
	//   16   27:aload           5
	//   17   29:astore_3        
		obj1 = obj;
	//   18   30:aload_2         
	//   19   31:astore          4
		jsongenerator.close();
	//   20   33:aload_1         
	//   21   34:invokevirtual   #126 <Method void JsonGenerator.close()>
		closeable = null;
	//   22   37:aconst_null     
	//   23   38:astore_3        
		obj1 = obj;
	//   24   39:aload_2         
	//   25   40:astore          4
		closeable1.close();
	//   26   42:aload           5
	//   27   44:invokeinterface #127 <Method void Closeable.close()>
		if(false)
	//*  28   49:iconst_0        
	//*  29   50:ifeq            65
		{
			jsongenerator = ((JsonGenerator) (com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT));
	//   30   53:getstatic       #133 <Field com.fasterxml.jackson.core.JsonGenerator$Feature com.fasterxml.jackson.core.JsonGenerator$Feature.AUTO_CLOSE_JSON_CONTENT>
	//   31   56:astore_1        
			throw new NullPointerException();
	//   32   57:new             #135 <Class NullPointerException>
	//   33   60:dup             
	//   34   61:invokespecial   #136 <Method void NullPointerException()>
	//   35   64:athrow          
		}
		if(true)
			break MISSING_BLOCK_LABEL_77;
	//   36   65:iconst_0        
	//   37   66:ifeq            77
		throw new NullPointerException();
	//   38   69:new             #135 <Class NullPointerException>
	//   39   72:dup             
	//   40   73:invokespecial   #136 <Method void NullPointerException()>
	//   41   76:athrow          
		return;
	//   42   77:return          
		jsongenerator;
	//   43   78:astore_1        
		if(obj1 != null)
	//*  44   79:aload           4
	//*  45   81:ifnull          98
		{
			((JsonGenerator) (obj1)).disable(com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT);
	//   46   84:aload           4
	//   47   86:getstatic       #133 <Field com.fasterxml.jackson.core.JsonGenerator$Feature com.fasterxml.jackson.core.JsonGenerator$Feature.AUTO_CLOSE_JSON_CONTENT>
	//   48   89:invokevirtual   #140 <Method JsonGenerator JsonGenerator.disable(com.fasterxml.jackson.core.JsonGenerator$Feature)>
	//   49   92:pop             
			try
			{
				((JsonGenerator) (obj1)).close();
	//   50   93:aload           4
	//   51   95:invokevirtual   #126 <Method void JsonGenerator.close()>
			}
	//*  52   98:aload_3         
	//*  53   99:ifnull          108
	//*  54  102:aload_3         
	//*  55  103:invokeinterface #127 <Method void Closeable.close()>
	//*  56  108:aload_1         
	//*  57  109:athrow          
	//*  58  110:astore_1        
	//*  59  111:return          
			// Misplaced declaration of an exception variable
			catch(Object obj) { }
	//   60  112:astore_2        
		}
		if(closeable != null)
			try
			{
				closeable.close();
			}
	//*  61  113:goto            98
			// Misplaced declaration of an exception variable
			catch(Object obj) { }
	//   62  116:astore_2        
		throw jsongenerator;
		jsongenerator;
	//*  63  117:goto            108
	}

	protected final void _configAndWriteValue(JsonGenerator jsongenerator, Object obj)
		throws IOException
	{
		_configureGenerator(jsongenerator);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #146 <Method void _configureGenerator(JsonGenerator)>
		if(!_config.isEnabled(SerializationFeature.CLOSE_CLOSEABLE) || !(obj instanceof Closeable)) goto _L2; else goto _L1
	//    3    5:aload_0         
	//    4    6:getfield        #46  <Field SerializationConfig _config>
	//    5    9:getstatic       #152 <Field SerializationFeature SerializationFeature.CLOSE_CLOSEABLE>
	//    6   12:invokevirtual   #156 <Method boolean SerializationConfig.isEnabled(SerializationFeature)>
	//    7   15:ifeq            32
	//    8   18:aload_2         
	//    9   19:instanceof      #114 <Class Closeable>
	//   10   22:ifeq            32
_L1:
		_writeCloseable(jsongenerator, obj);
	//   11   25:aload_0         
	//   12   26:aload_1         
	//   13   27:aload_2         
	//   14   28:invokespecial   #158 <Method void _writeCloseable(JsonGenerator, Object)>
_L4:
		return;
	//   15   31:return          
_L2:
		boolean flag = false;
	//   16   32:iconst_0        
	//   17   33:istore_3        
		_prefetch.serialize(jsongenerator, obj, _serializerProvider());
	//   18   34:aload_0         
	//   19   35:getfield        #68  <Field ObjectWriter$Prefetch _prefetch>
	//   20   38:aload_1         
	//   21   39:aload_2         
	//   22   40:aload_0         
	//   23   41:invokevirtual   #117 <Method DefaultSerializerProvider _serializerProvider()>
	//   24   44:invokevirtual   #121 <Method void ObjectWriter$Prefetch.serialize(JsonGenerator, Object, DefaultSerializerProvider)>
		flag = true;
	//   25   47:iconst_1        
	//   26   48:istore_3        
		jsongenerator.close();
	//   27   49:aload_1         
	//   28   50:invokevirtual   #126 <Method void JsonGenerator.close()>
		if(true) goto _L4; else goto _L3
	//   29   53:iconst_1        
	//   30   54:ifne            31
_L3:
		jsongenerator.disable(com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT);
	//   31   57:aload_1         
	//   32   58:getstatic       #133 <Field com.fasterxml.jackson.core.JsonGenerator$Feature com.fasterxml.jackson.core.JsonGenerator$Feature.AUTO_CLOSE_JSON_CONTENT>
	//   33   61:invokevirtual   #140 <Method JsonGenerator JsonGenerator.disable(com.fasterxml.jackson.core.JsonGenerator$Feature)>
	//   34   64:pop             
		try
		{
			jsongenerator.close();
	//   35   65:aload_1         
	//   36   66:invokevirtual   #126 <Method void JsonGenerator.close()>
			return;
	//   37   69:return          
		}
		// Misplaced declaration of an exception variable
		catch(JsonGenerator jsongenerator)
	//*  38   70:astore_1        
		{
			return;
	//   39   71:return          
		}
		obj;
	//   40   72:astore_2        
		if(!flag)
	//*  41   73:iload_3         
	//*  42   74:ifne            89
		{
			jsongenerator.disable(com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT);
	//   43   77:aload_1         
	//   44   78:getstatic       #133 <Field com.fasterxml.jackson.core.JsonGenerator$Feature com.fasterxml.jackson.core.JsonGenerator$Feature.AUTO_CLOSE_JSON_CONTENT>
	//   45   81:invokevirtual   #140 <Method JsonGenerator JsonGenerator.disable(com.fasterxml.jackson.core.JsonGenerator$Feature)>
	//   46   84:pop             
			try
			{
				jsongenerator.close();
	//   47   85:aload_1         
	//   48   86:invokevirtual   #126 <Method void JsonGenerator.close()>
			}
	//*  49   89:aload_2         
	//*  50   90:athrow          
			// Misplaced declaration of an exception variable
			catch(JsonGenerator jsongenerator) { }
	//   51   91:astore_1        
		}
		throw obj;
	//*  52   92:goto            89
	}

	protected final void _configureGenerator(JsonGenerator jsongenerator)
	{
		_config.initialize(jsongenerator);
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field SerializationConfig _config>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #161 <Method void SerializationConfig.initialize(JsonGenerator)>
		_generatorSettings.initialize(jsongenerator);
	//    4    8:aload_0         
	//    5    9:getfield        #64  <Field ObjectWriter$GeneratorSettings _generatorSettings>
	//    6   12:aload_1         
	//    7   13:invokevirtual   #162 <Method void ObjectWriter$GeneratorSettings.initialize(JsonGenerator)>
	//    8   16:return          
	}

	protected ObjectWriter _new(GeneratorSettings generatorsettings, Prefetch prefetch)
	{
		return new ObjectWriter(this, _config, generatorsettings, prefetch);
	//    0    0:new             #2   <Class ObjectWriter>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:getfield        #46  <Field SerializationConfig _config>
	//    5    9:aload_1         
	//    6   10:aload_2         
	//    7   11:invokespecial   #166 <Method void ObjectWriter(ObjectWriter, SerializationConfig, ObjectWriter$GeneratorSettings, ObjectWriter$Prefetch)>
	//    8   14:areturn         
	}

	protected ObjectWriter _new(ObjectWriter objectwriter, JsonFactory jsonfactory)
	{
		return new ObjectWriter(objectwriter, jsonfactory);
	//    0    0:new             #2   <Class ObjectWriter>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokespecial   #169 <Method void ObjectWriter(ObjectWriter, JsonFactory)>
	//    5    9:areturn         
	}

	protected ObjectWriter _new(ObjectWriter objectwriter, SerializationConfig serializationconfig)
	{
		return new ObjectWriter(objectwriter, serializationconfig);
	//    0    0:new             #2   <Class ObjectWriter>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokespecial   #172 <Method void ObjectWriter(ObjectWriter, SerializationConfig)>
	//    5    9:areturn         
	}

	protected SequenceWriter _newSequenceWriter(boolean flag, JsonGenerator jsongenerator, boolean flag1)
		throws IOException
	{
		_configureGenerator(jsongenerator);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #146 <Method void _configureGenerator(JsonGenerator)>
		return (new SequenceWriter(_serializerProvider(), jsongenerator, flag1, _prefetch)).init(flag);
	//    3    5:new             #176 <Class SequenceWriter>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:invokevirtual   #117 <Method DefaultSerializerProvider _serializerProvider()>
	//    7   13:aload_2         
	//    8   14:iload_3         
	//    9   15:aload_0         
	//   10   16:getfield        #68  <Field ObjectWriter$Prefetch _prefetch>
	//   11   19:invokespecial   #179 <Method void SequenceWriter(DefaultSerializerProvider, JsonGenerator, boolean, ObjectWriter$Prefetch)>
	//   12   22:iload_1         
	//   13   23:invokevirtual   #183 <Method SequenceWriter SequenceWriter.init(boolean)>
	//   14   26:areturn         
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
	//    6   12:invokevirtual   #189 <Method DefaultSerializerProvider DefaultSerializerProvider.createInstance(SerializationConfig, SerializerFactory)>
	//    7   15:areturn         
	}

	protected void _verifySchemaType(FormatSchema formatschema)
	{
		if(formatschema != null && !_generatorFactory.canUseSchema(formatschema))
	//*   0    0:aload_1         
	//*   1    1:ifnull          63
	//*   2    4:aload_0         
	//*   3    5:getfield        #59  <Field JsonFactory _generatorFactory>
	//*   4    8:aload_1         
	//*   5    9:invokevirtual   #195 <Method boolean JsonFactory.canUseSchema(FormatSchema)>
	//*   6   12:ifne            63
			throw new IllegalArgumentException((new StringBuilder()).append("Can not use FormatSchema of type ").append(((Object) (formatschema)).getClass().getName()).append(" for format ").append(_generatorFactory.getFormatName()).toString());
	//    7   15:new             #197 <Class IllegalArgumentException>
	//    8   18:dup             
	//    9   19:new             #199 <Class StringBuilder>
	//   10   22:dup             
	//   11   23:invokespecial   #200 <Method void StringBuilder()>
	//   12   26:ldc1            #202 <String "Can not use FormatSchema of type ">
	//   13   28:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//   14   31:aload_1         
	//   15   32:invokevirtual   #210 <Method Class Object.getClass()>
	//   16   35:invokevirtual   #216 <Method String Class.getName()>
	//   17   38:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//   18   41:ldc1            #218 <String " for format ">
	//   19   43:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//   20   46:aload_0         
	//   21   47:getfield        #59  <Field JsonFactory _generatorFactory>
	//   22   50:invokevirtual   #221 <Method String JsonFactory.getFormatName()>
	//   23   53:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//   24   56:invokevirtual   #224 <Method String StringBuilder.toString()>
	//   25   59:invokespecial   #227 <Method void IllegalArgumentException(String)>
	//   26   62:athrow          
		else
			return;
	//   27   63:return          
	}

	public void acceptJsonFormatVisitor(JavaType javatype, JsonFormatVisitorWrapper jsonformatvisitorwrapper)
		throws JsonMappingException
	{
		if(javatype == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       14
		{
			throw new IllegalArgumentException("type must be provided");
	//    2    4:new             #197 <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:ldc1            #233 <String "type must be provided">
	//    5   10:invokespecial   #227 <Method void IllegalArgumentException(String)>
	//    6   13:athrow          
		} else
		{
			_serializerProvider().acceptJsonFormatVisitor(javatype, jsonformatvisitorwrapper);
	//    7   14:aload_0         
	//    8   15:invokevirtual   #117 <Method DefaultSerializerProvider _serializerProvider()>
	//    9   18:aload_1         
	//   10   19:aload_2         
	//   11   20:invokevirtual   #235 <Method void DefaultSerializerProvider.acceptJsonFormatVisitor(JavaType, JsonFormatVisitorWrapper)>
			return;
	//   12   23:return          
		}
	}

	public void acceptJsonFormatVisitor(Class class1, JsonFormatVisitorWrapper jsonformatvisitorwrapper)
		throws JsonMappingException
	{
		acceptJsonFormatVisitor(_config.constructType(class1), jsonformatvisitorwrapper);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #46  <Field SerializationConfig _config>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #240 <Method JavaType SerializationConfig.constructType(Class)>
	//    5    9:aload_2         
	//    6   10:invokevirtual   #241 <Method void acceptJsonFormatVisitor(JavaType, JsonFormatVisitorWrapper)>
	//    7   13:return          
	}

	public boolean canSerialize(Class class1)
	{
		return _serializerProvider().hasSerializerFor(class1, ((AtomicReference) (null)));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #117 <Method DefaultSerializerProvider _serializerProvider()>
	//    2    4:aload_1         
	//    3    5:aconst_null     
	//    4    6:invokevirtual   #248 <Method boolean DefaultSerializerProvider.hasSerializerFor(Class, AtomicReference)>
	//    5    9:ireturn         
	}

	public boolean canSerialize(Class class1, AtomicReference atomicreference)
	{
		return _serializerProvider().hasSerializerFor(class1, atomicreference);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #117 <Method DefaultSerializerProvider _serializerProvider()>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #248 <Method boolean DefaultSerializerProvider.hasSerializerFor(Class, AtomicReference)>
	//    5    9:ireturn         
	}

	public ObjectWriter forType(TypeReference typereference)
	{
		return forType(_config.getTypeFactory().constructType(typereference.getType()));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #46  <Field SerializationConfig _config>
	//    3    5:invokevirtual   #256 <Method TypeFactory SerializationConfig.getTypeFactory()>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #262 <Method java.lang.reflect.Type TypeReference.getType()>
	//    6   12:invokevirtual   #267 <Method JavaType TypeFactory.constructType(java.lang.reflect.Type)>
	//    7   15:invokevirtual   #270 <Method ObjectWriter forType(JavaType)>
	//    8   18:areturn         
	}

	public ObjectWriter forType(JavaType javatype)
	{
		javatype = ((JavaType) (_prefetch.forRootType(this, javatype)));
	//    0    0:aload_0         
	//    1    1:getfield        #68  <Field ObjectWriter$Prefetch _prefetch>
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #87  <Method ObjectWriter$Prefetch ObjectWriter$Prefetch.forRootType(ObjectWriter, JavaType)>
	//    5    9:astore_1        
		if(javatype == _prefetch)
	//*   6   10:aload_1         
	//*   7   11:aload_0         
	//*   8   12:getfield        #68  <Field ObjectWriter$Prefetch _prefetch>
	//*   9   15:if_acmpne       20
			return this;
	//   10   18:aload_0         
	//   11   19:areturn         
		else
			return _new(_generatorSettings, ((Prefetch) (javatype)));
	//   12   20:aload_0         
	//   13   21:aload_0         
	//   14   22:getfield        #64  <Field ObjectWriter$GeneratorSettings _generatorSettings>
	//   15   25:aload_1         
	//   16   26:invokevirtual   #273 <Method ObjectWriter _new(ObjectWriter$GeneratorSettings, ObjectWriter$Prefetch)>
	//   17   29:areturn         
	}

	public ObjectWriter forType(Class class1)
	{
		if(class1 == java/lang/Object)
	//*   0    0:aload_1         
	//*   1    1:ldc1            #4   <Class Object>
	//*   2    3:if_acmpne       15
			return forType((JavaType)null);
	//    3    6:aload_0         
	//    4    7:aconst_null     
	//    5    8:checkcast       #75  <Class JavaType>
	//    6   11:invokevirtual   #270 <Method ObjectWriter forType(JavaType)>
	//    7   14:areturn         
		else
			return forType(_config.constructType(class1));
	//    8   15:aload_0         
	//    9   16:aload_0         
	//   10   17:getfield        #46  <Field SerializationConfig _config>
	//   11   20:aload_1         
	//   12   21:invokevirtual   #240 <Method JavaType SerializationConfig.constructType(Class)>
	//   13   24:invokevirtual   #270 <Method ObjectWriter forType(JavaType)>
	//   14   27:areturn         
	}

	public ContextAttributes getAttributes()
	{
		return _config.getAttributes();
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field SerializationConfig _config>
	//    2    4:invokevirtual   #279 <Method ContextAttributes SerializationConfig.getAttributes()>
	//    3    7:areturn         
	}

	public SerializationConfig getConfig()
	{
		return _config;
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field SerializationConfig _config>
	//    2    4:areturn         
	}

	public JsonFactory getFactory()
	{
		return _generatorFactory;
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field JsonFactory _generatorFactory>
	//    2    4:areturn         
	}

	public TypeFactory getTypeFactory()
	{
		return _config.getTypeFactory();
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field SerializationConfig _config>
	//    2    4:invokevirtual   #256 <Method TypeFactory SerializationConfig.getTypeFactory()>
	//    3    7:areturn         
	}

	public boolean hasPrefetchedSerializer()
	{
		return _prefetch.hasSerializer();
	//    0    0:aload_0         
	//    1    1:getfield        #68  <Field ObjectWriter$Prefetch _prefetch>
	//    2    4:invokevirtual   #287 <Method boolean ObjectWriter$Prefetch.hasSerializer()>
	//    3    7:ireturn         
	}

	public boolean isEnabled(com.fasterxml.jackson.core.JsonParser.Feature feature)
	{
		return _generatorFactory.isEnabled(feature);
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field JsonFactory _generatorFactory>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #290 <Method boolean JsonFactory.isEnabled(com.fasterxml.jackson.core.JsonParser$Feature)>
	//    4    8:ireturn         
	}

	public boolean isEnabled(MapperFeature mapperfeature)
	{
		return _config.isEnabled(mapperfeature);
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field SerializationConfig _config>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #293 <Method boolean SerializationConfig.isEnabled(MapperFeature)>
	//    4    8:ireturn         
	}

	public boolean isEnabled(SerializationFeature serializationfeature)
	{
		return _config.isEnabled(serializationfeature);
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field SerializationConfig _config>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #156 <Method boolean SerializationConfig.isEnabled(SerializationFeature)>
	//    4    8:ireturn         
	}

	public Version version()
	{
		return PackageVersion.VERSION;
	//    0    0:getstatic       #301 <Field Version PackageVersion.VERSION>
	//    1    3:areturn         
	}

	public ObjectWriter with(Base64Variant base64variant)
	{
		base64variant = ((Base64Variant) (_config.with(base64variant)));
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field SerializationConfig _config>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #305 <Method SerializationConfig SerializationConfig.with(Base64Variant)>
	//    4    8:astore_1        
		if(base64variant == _config)
	//*   5    9:aload_1         
	//*   6   10:aload_0         
	//*   7   11:getfield        #46  <Field SerializationConfig _config>
	//*   8   14:if_acmpne       19
			return this;
	//    9   17:aload_0         
	//   10   18:areturn         
		else
			return _new(this, ((SerializationConfig) (base64variant)));
	//   11   19:aload_0         
	//   12   20:aload_0         
	//   13   21:aload_1         
	//   14   22:invokevirtual   #307 <Method ObjectWriter _new(ObjectWriter, SerializationConfig)>
	//   15   25:areturn         
	}

	public ObjectWriter with(FormatFeature formatfeature)
	{
		formatfeature = ((FormatFeature) (_config.with(formatfeature)));
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field SerializationConfig _config>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #311 <Method SerializationConfig SerializationConfig.with(FormatFeature)>
	//    4    8:astore_1        
		if(formatfeature == _config)
	//*   5    9:aload_1         
	//*   6   10:aload_0         
	//*   7   11:getfield        #46  <Field SerializationConfig _config>
	//*   8   14:if_acmpne       19
			return this;
	//    9   17:aload_0         
	//   10   18:areturn         
		else
			return _new(this, ((SerializationConfig) (formatfeature)));
	//   11   19:aload_0         
	//   12   20:aload_0         
	//   13   21:aload_1         
	//   14   22:invokevirtual   #307 <Method ObjectWriter _new(ObjectWriter, SerializationConfig)>
	//   15   25:areturn         
	}

	public ObjectWriter with(FormatSchema formatschema)
	{
		GeneratorSettings generatorsettings = _generatorSettings.with(formatschema);
	//    0    0:aload_0         
	//    1    1:getfield        #64  <Field ObjectWriter$GeneratorSettings _generatorSettings>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #315 <Method ObjectWriter$GeneratorSettings ObjectWriter$GeneratorSettings.with(FormatSchema)>
	//    4    8:astore_2        
		if(generatorsettings == _generatorSettings)
	//*   5    9:aload_2         
	//*   6   10:aload_0         
	//*   7   11:getfield        #64  <Field ObjectWriter$GeneratorSettings _generatorSettings>
	//*   8   14:if_acmpne       19
		{
			return this;
	//    9   17:aload_0         
	//   10   18:areturn         
		} else
		{
			_verifySchemaType(formatschema);
	//   11   19:aload_0         
	//   12   20:aload_1         
	//   13   21:invokevirtual   #317 <Method void _verifySchemaType(FormatSchema)>
			return _new(generatorsettings, _prefetch);
	//   14   24:aload_0         
	//   15   25:aload_2         
	//   16   26:aload_0         
	//   17   27:getfield        #68  <Field ObjectWriter$Prefetch _prefetch>
	//   18   30:invokevirtual   #273 <Method ObjectWriter _new(ObjectWriter$GeneratorSettings, ObjectWriter$Prefetch)>
	//   19   33:areturn         
		}
	}

	public ObjectWriter with(JsonFactory jsonfactory)
	{
		if(jsonfactory == _generatorFactory)
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #59  <Field JsonFactory _generatorFactory>
	//*   3    5:if_acmpne       10
			return this;
	//    4    8:aload_0         
	//    5    9:areturn         
		else
			return _new(this, jsonfactory);
	//    6   10:aload_0         
	//    7   11:aload_0         
	//    8   12:aload_1         
	//    9   13:invokevirtual   #320 <Method ObjectWriter _new(ObjectWriter, JsonFactory)>
	//   10   16:areturn         
	}

	public ObjectWriter with(com.fasterxml.jackson.core.JsonGenerator.Feature feature)
	{
		feature = ((com.fasterxml.jackson.core.JsonGenerator.Feature) (_config.with(feature)));
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field SerializationConfig _config>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #324 <Method SerializationConfig SerializationConfig.with(com.fasterxml.jackson.core.JsonGenerator$Feature)>
	//    4    8:astore_1        
		if(feature == _config)
	//*   5    9:aload_1         
	//*   6   10:aload_0         
	//*   7   11:getfield        #46  <Field SerializationConfig _config>
	//*   8   14:if_acmpne       19
			return this;
	//    9   17:aload_0         
	//   10   18:areturn         
		else
			return _new(this, ((SerializationConfig) (feature)));
	//   11   19:aload_0         
	//   12   20:aload_0         
	//   13   21:aload_1         
	//   14   22:invokevirtual   #307 <Method ObjectWriter _new(ObjectWriter, SerializationConfig)>
	//   15   25:areturn         
	}

	public ObjectWriter with(PrettyPrinter prettyprinter)
	{
		prettyprinter = ((PrettyPrinter) (_generatorSettings.with(prettyprinter)));
	//    0    0:aload_0         
	//    1    1:getfield        #64  <Field ObjectWriter$GeneratorSettings _generatorSettings>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #328 <Method ObjectWriter$GeneratorSettings ObjectWriter$GeneratorSettings.with(PrettyPrinter)>
	//    4    8:astore_1        
		if(prettyprinter == _generatorSettings)
	//*   5    9:aload_1         
	//*   6   10:aload_0         
	//*   7   11:getfield        #64  <Field ObjectWriter$GeneratorSettings _generatorSettings>
	//*   8   14:if_acmpne       19
			return this;
	//    9   17:aload_0         
	//   10   18:areturn         
		else
			return _new(((GeneratorSettings) (prettyprinter)), _prefetch);
	//   11   19:aload_0         
	//   12   20:aload_1         
	//   13   21:aload_0         
	//   14   22:getfield        #68  <Field ObjectWriter$Prefetch _prefetch>
	//   15   25:invokevirtual   #273 <Method ObjectWriter _new(ObjectWriter$GeneratorSettings, ObjectWriter$Prefetch)>
	//   16   28:areturn         
	}

	public ObjectWriter with(CharacterEscapes characterescapes)
	{
		characterescapes = ((CharacterEscapes) (_generatorSettings.with(characterescapes)));
	//    0    0:aload_0         
	//    1    1:getfield        #64  <Field ObjectWriter$GeneratorSettings _generatorSettings>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #332 <Method ObjectWriter$GeneratorSettings ObjectWriter$GeneratorSettings.with(CharacterEscapes)>
	//    4    8:astore_1        
		if(characterescapes == _generatorSettings)
	//*   5    9:aload_1         
	//*   6   10:aload_0         
	//*   7   11:getfield        #64  <Field ObjectWriter$GeneratorSettings _generatorSettings>
	//*   8   14:if_acmpne       19
			return this;
	//    9   17:aload_0         
	//   10   18:areturn         
		else
			return _new(((GeneratorSettings) (characterescapes)), _prefetch);
	//   11   19:aload_0         
	//   12   20:aload_1         
	//   13   21:aload_0         
	//   14   22:getfield        #68  <Field ObjectWriter$Prefetch _prefetch>
	//   15   25:invokevirtual   #273 <Method ObjectWriter _new(ObjectWriter$GeneratorSettings, ObjectWriter$Prefetch)>
	//   16   28:areturn         
	}

	public ObjectWriter with(SerializationFeature serializationfeature)
	{
		serializationfeature = ((SerializationFeature) (_config.with(serializationfeature)));
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field SerializationConfig _config>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #336 <Method SerializationConfig SerializationConfig.with(SerializationFeature)>
	//    4    8:astore_1        
		if(serializationfeature == _config)
	//*   5    9:aload_1         
	//*   6   10:aload_0         
	//*   7   11:getfield        #46  <Field SerializationConfig _config>
	//*   8   14:if_acmpne       19
			return this;
	//    9   17:aload_0         
	//   10   18:areturn         
		else
			return _new(this, ((SerializationConfig) (serializationfeature)));
	//   11   19:aload_0         
	//   12   20:aload_0         
	//   13   21:aload_1         
	//   14   22:invokevirtual   #307 <Method ObjectWriter _new(ObjectWriter, SerializationConfig)>
	//   15   25:areturn         
	}

	public transient ObjectWriter with(SerializationFeature serializationfeature, SerializationFeature aserializationfeature[])
	{
		serializationfeature = ((SerializationFeature) (_config.with(serializationfeature, aserializationfeature)));
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field SerializationConfig _config>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #340 <Method SerializationConfig SerializationConfig.with(SerializationFeature, SerializationFeature[])>
	//    5    9:astore_1        
		if(serializationfeature == _config)
	//*   6   10:aload_1         
	//*   7   11:aload_0         
	//*   8   12:getfield        #46  <Field SerializationConfig _config>
	//*   9   15:if_acmpne       20
			return this;
	//   10   18:aload_0         
	//   11   19:areturn         
		else
			return _new(this, ((SerializationConfig) (serializationfeature)));
	//   12   20:aload_0         
	//   13   21:aload_0         
	//   14   22:aload_1         
	//   15   23:invokevirtual   #307 <Method ObjectWriter _new(ObjectWriter, SerializationConfig)>
	//   16   26:areturn         
	}

	public ObjectWriter with(ContextAttributes contextattributes)
	{
		contextattributes = ((ContextAttributes) (_config.with(contextattributes)));
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field SerializationConfig _config>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #344 <Method SerializationConfig SerializationConfig.with(ContextAttributes)>
	//    4    8:astore_1        
		if(contextattributes == _config)
	//*   5    9:aload_1         
	//*   6   10:aload_0         
	//*   7   11:getfield        #46  <Field SerializationConfig _config>
	//*   8   14:if_acmpne       19
			return this;
	//    9   17:aload_0         
	//   10   18:areturn         
		else
			return _new(this, ((SerializationConfig) (contextattributes)));
	//   11   19:aload_0         
	//   12   20:aload_0         
	//   13   21:aload_1         
	//   14   22:invokevirtual   #307 <Method ObjectWriter _new(ObjectWriter, SerializationConfig)>
	//   15   25:areturn         
	}

	public ObjectWriter with(FilterProvider filterprovider)
	{
		if(filterprovider == _config.getFilterProvider())
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #46  <Field SerializationConfig _config>
	//*   3    5:invokevirtual   #349 <Method FilterProvider SerializationConfig.getFilterProvider()>
	//*   4    8:if_acmpne       13
			return this;
	//    5   11:aload_0         
	//    6   12:areturn         
		else
			return _new(this, _config.withFilters(filterprovider));
	//    7   13:aload_0         
	//    8   14:aload_0         
	//    9   15:aload_0         
	//   10   16:getfield        #46  <Field SerializationConfig _config>
	//   11   19:aload_1         
	//   12   20:invokevirtual   #353 <Method SerializationConfig SerializationConfig.withFilters(FilterProvider)>
	//   13   23:invokevirtual   #307 <Method ObjectWriter _new(ObjectWriter, SerializationConfig)>
	//   14   26:areturn         
	}

	public ObjectWriter with(DateFormat dateformat)
	{
		dateformat = ((DateFormat) (_config.with(dateformat)));
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field SerializationConfig _config>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #357 <Method SerializationConfig SerializationConfig.with(DateFormat)>
	//    4    8:astore_1        
		if(dateformat == _config)
	//*   5    9:aload_1         
	//*   6   10:aload_0         
	//*   7   11:getfield        #46  <Field SerializationConfig _config>
	//*   8   14:if_acmpne       19
			return this;
	//    9   17:aload_0         
	//   10   18:areturn         
		else
			return _new(this, ((SerializationConfig) (dateformat)));
	//   11   19:aload_0         
	//   12   20:aload_0         
	//   13   21:aload_1         
	//   14   22:invokevirtual   #307 <Method ObjectWriter _new(ObjectWriter, SerializationConfig)>
	//   15   25:areturn         
	}

	public ObjectWriter with(Locale locale)
	{
		locale = ((Locale) (_config.with(locale)));
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field SerializationConfig _config>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #361 <Method SerializationConfig SerializationConfig.with(Locale)>
	//    4    8:astore_1        
		if(locale == _config)
	//*   5    9:aload_1         
	//*   6   10:aload_0         
	//*   7   11:getfield        #46  <Field SerializationConfig _config>
	//*   8   14:if_acmpne       19
			return this;
	//    9   17:aload_0         
	//   10   18:areturn         
		else
			return _new(this, ((SerializationConfig) (locale)));
	//   11   19:aload_0         
	//   12   20:aload_0         
	//   13   21:aload_1         
	//   14   22:invokevirtual   #307 <Method ObjectWriter _new(ObjectWriter, SerializationConfig)>
	//   15   25:areturn         
	}

	public ObjectWriter with(TimeZone timezone)
	{
		timezone = ((TimeZone) (_config.with(timezone)));
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field SerializationConfig _config>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #365 <Method SerializationConfig SerializationConfig.with(TimeZone)>
	//    4    8:astore_1        
		if(timezone == _config)
	//*   5    9:aload_1         
	//*   6   10:aload_0         
	//*   7   11:getfield        #46  <Field SerializationConfig _config>
	//*   8   14:if_acmpne       19
			return this;
	//    9   17:aload_0         
	//   10   18:areturn         
		else
			return _new(this, ((SerializationConfig) (timezone)));
	//   11   19:aload_0         
	//   12   20:aload_0         
	//   13   21:aload_1         
	//   14   22:invokevirtual   #307 <Method ObjectWriter _new(ObjectWriter, SerializationConfig)>
	//   15   25:areturn         
	}

	public ObjectWriter withAttribute(Object obj, Object obj1)
	{
		obj = ((Object) ((SerializationConfig)_config.withAttribute(obj, obj1)));
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field SerializationConfig _config>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #370 <Method com.fasterxml.jackson.databind.cfg.MapperConfigBase SerializationConfig.withAttribute(Object, Object)>
	//    5    9:checkcast       #102 <Class SerializationConfig>
	//    6   12:astore_1        
		if(obj == _config)
	//*   7   13:aload_1         
	//*   8   14:aload_0         
	//*   9   15:getfield        #46  <Field SerializationConfig _config>
	//*  10   18:if_acmpne       23
			return this;
	//   11   21:aload_0         
	//   12   22:areturn         
		else
			return _new(this, ((SerializationConfig) (obj)));
	//   13   23:aload_0         
	//   14   24:aload_0         
	//   15   25:aload_1         
	//   16   26:invokevirtual   #307 <Method ObjectWriter _new(ObjectWriter, SerializationConfig)>
	//   17   29:areturn         
	}

	public ObjectWriter withAttributes(Map map)
	{
		map = ((Map) ((SerializationConfig)_config.withAttributes(map)));
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field SerializationConfig _config>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #375 <Method com.fasterxml.jackson.databind.cfg.MapperConfigBase SerializationConfig.withAttributes(Map)>
	//    4    8:checkcast       #102 <Class SerializationConfig>
	//    5   11:astore_1        
		if(map == _config)
	//*   6   12:aload_1         
	//*   7   13:aload_0         
	//*   8   14:getfield        #46  <Field SerializationConfig _config>
	//*   9   17:if_acmpne       22
			return this;
	//   10   20:aload_0         
	//   11   21:areturn         
		else
			return _new(this, ((SerializationConfig) (map)));
	//   12   22:aload_0         
	//   13   23:aload_0         
	//   14   24:aload_1         
	//   15   25:invokevirtual   #307 <Method ObjectWriter _new(ObjectWriter, SerializationConfig)>
	//   16   28:areturn         
	}

	public ObjectWriter withDefaultPrettyPrinter()
	{
		return with(_config.getDefaultPrettyPrinter());
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #46  <Field SerializationConfig _config>
	//    3    5:invokevirtual   #382 <Method PrettyPrinter SerializationConfig.getDefaultPrettyPrinter()>
	//    4    8:invokevirtual   #384 <Method ObjectWriter with(PrettyPrinter)>
	//    5   11:areturn         
	}

	public transient ObjectWriter withFeatures(FormatFeature aformatfeature[])
	{
		aformatfeature = ((FormatFeature []) (_config.withFeatures(aformatfeature)));
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field SerializationConfig _config>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #389 <Method SerializationConfig SerializationConfig.withFeatures(FormatFeature[])>
	//    4    8:astore_1        
		if(aformatfeature == _config)
	//*   5    9:aload_1         
	//*   6   10:aload_0         
	//*   7   11:getfield        #46  <Field SerializationConfig _config>
	//*   8   14:if_acmpne       19
			return this;
	//    9   17:aload_0         
	//   10   18:areturn         
		else
			return _new(this, ((SerializationConfig) (aformatfeature)));
	//   11   19:aload_0         
	//   12   20:aload_0         
	//   13   21:aload_1         
	//   14   22:invokevirtual   #307 <Method ObjectWriter _new(ObjectWriter, SerializationConfig)>
	//   15   25:areturn         
	}

	public transient ObjectWriter withFeatures(com.fasterxml.jackson.core.JsonGenerator.Feature afeature[])
	{
		afeature = ((com.fasterxml.jackson.core.JsonGenerator.Feature []) (_config.withFeatures(afeature)));
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field SerializationConfig _config>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #393 <Method SerializationConfig SerializationConfig.withFeatures(com.fasterxml.jackson.core.JsonGenerator$Feature[])>
	//    4    8:astore_1        
		if(afeature == _config)
	//*   5    9:aload_1         
	//*   6   10:aload_0         
	//*   7   11:getfield        #46  <Field SerializationConfig _config>
	//*   8   14:if_acmpne       19
			return this;
	//    9   17:aload_0         
	//   10   18:areturn         
		else
			return _new(this, ((SerializationConfig) (afeature)));
	//   11   19:aload_0         
	//   12   20:aload_0         
	//   13   21:aload_1         
	//   14   22:invokevirtual   #307 <Method ObjectWriter _new(ObjectWriter, SerializationConfig)>
	//   15   25:areturn         
	}

	public transient ObjectWriter withFeatures(SerializationFeature aserializationfeature[])
	{
		aserializationfeature = ((SerializationFeature []) (_config.withFeatures(aserializationfeature)));
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field SerializationConfig _config>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #397 <Method SerializationConfig SerializationConfig.withFeatures(SerializationFeature[])>
	//    4    8:astore_1        
		if(aserializationfeature == _config)
	//*   5    9:aload_1         
	//*   6   10:aload_0         
	//*   7   11:getfield        #46  <Field SerializationConfig _config>
	//*   8   14:if_acmpne       19
			return this;
	//    9   17:aload_0         
	//   10   18:areturn         
		else
			return _new(this, ((SerializationConfig) (aserializationfeature)));
	//   11   19:aload_0         
	//   12   20:aload_0         
	//   13   21:aload_1         
	//   14   22:invokevirtual   #307 <Method ObjectWriter _new(ObjectWriter, SerializationConfig)>
	//   15   25:areturn         
	}

	public ObjectWriter withRootName(PropertyName propertyname)
	{
		propertyname = ((PropertyName) (_config.withRootName(propertyname)));
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field SerializationConfig _config>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #402 <Method SerializationConfig SerializationConfig.withRootName(PropertyName)>
	//    4    8:astore_1        
		if(propertyname == _config)
	//*   5    9:aload_1         
	//*   6   10:aload_0         
	//*   7   11:getfield        #46  <Field SerializationConfig _config>
	//*   8   14:if_acmpne       19
			return this;
	//    9   17:aload_0         
	//   10   18:areturn         
		else
			return _new(this, ((SerializationConfig) (propertyname)));
	//   11   19:aload_0         
	//   12   20:aload_0         
	//   13   21:aload_1         
	//   14   22:invokevirtual   #307 <Method ObjectWriter _new(ObjectWriter, SerializationConfig)>
	//   15   25:areturn         
	}

	public ObjectWriter withRootName(String s)
	{
		s = ((String) ((SerializationConfig)_config.withRootName(s)));
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field SerializationConfig _config>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #406 <Method com.fasterxml.jackson.databind.cfg.MapperConfigBase SerializationConfig.withRootName(String)>
	//    4    8:checkcast       #102 <Class SerializationConfig>
	//    5   11:astore_1        
		if(s == _config)
	//*   6   12:aload_1         
	//*   7   13:aload_0         
	//*   8   14:getfield        #46  <Field SerializationConfig _config>
	//*   9   17:if_acmpne       22
			return this;
	//   10   20:aload_0         
	//   11   21:areturn         
		else
			return _new(this, ((SerializationConfig) (s)));
	//   12   22:aload_0         
	//   13   23:aload_0         
	//   14   24:aload_1         
	//   15   25:invokevirtual   #307 <Method ObjectWriter _new(ObjectWriter, SerializationConfig)>
	//   16   28:areturn         
	}

	public ObjectWriter withRootValueSeparator(SerializableString serializablestring)
	{
		serializablestring = ((SerializableString) (_generatorSettings.withRootValueSeparator(serializablestring)));
	//    0    0:aload_0         
	//    1    1:getfield        #64  <Field ObjectWriter$GeneratorSettings _generatorSettings>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #411 <Method ObjectWriter$GeneratorSettings ObjectWriter$GeneratorSettings.withRootValueSeparator(SerializableString)>
	//    4    8:astore_1        
		if(serializablestring == _generatorSettings)
	//*   5    9:aload_1         
	//*   6   10:aload_0         
	//*   7   11:getfield        #64  <Field ObjectWriter$GeneratorSettings _generatorSettings>
	//*   8   14:if_acmpne       19
			return this;
	//    9   17:aload_0         
	//   10   18:areturn         
		else
			return _new(((GeneratorSettings) (serializablestring)), _prefetch);
	//   11   19:aload_0         
	//   12   20:aload_1         
	//   13   21:aload_0         
	//   14   22:getfield        #68  <Field ObjectWriter$Prefetch _prefetch>
	//   15   25:invokevirtual   #273 <Method ObjectWriter _new(ObjectWriter$GeneratorSettings, ObjectWriter$Prefetch)>
	//   16   28:areturn         
	}

	public ObjectWriter withRootValueSeparator(String s)
	{
		s = ((String) (_generatorSettings.withRootValueSeparator(s)));
	//    0    0:aload_0         
	//    1    1:getfield        #64  <Field ObjectWriter$GeneratorSettings _generatorSettings>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #414 <Method ObjectWriter$GeneratorSettings ObjectWriter$GeneratorSettings.withRootValueSeparator(String)>
	//    4    8:astore_1        
		if(s == _generatorSettings)
	//*   5    9:aload_1         
	//*   6   10:aload_0         
	//*   7   11:getfield        #64  <Field ObjectWriter$GeneratorSettings _generatorSettings>
	//*   8   14:if_acmpne       19
			return this;
	//    9   17:aload_0         
	//   10   18:areturn         
		else
			return _new(((GeneratorSettings) (s)), _prefetch);
	//   11   19:aload_0         
	//   12   20:aload_1         
	//   13   21:aload_0         
	//   14   22:getfield        #68  <Field ObjectWriter$Prefetch _prefetch>
	//   15   25:invokevirtual   #273 <Method ObjectWriter _new(ObjectWriter$GeneratorSettings, ObjectWriter$Prefetch)>
	//   16   28:areturn         
	}

	public ObjectWriter withSchema(FormatSchema formatschema)
	{
		return with(formatschema);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #418 <Method ObjectWriter with(FormatSchema)>
	//    3    5:areturn         
	}

	public ObjectWriter withType(TypeReference typereference)
	{
		return forType(typereference);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #422 <Method ObjectWriter forType(TypeReference)>
	//    3    5:areturn         
	}

	public ObjectWriter withType(JavaType javatype)
	{
		return forType(javatype);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #270 <Method ObjectWriter forType(JavaType)>
	//    3    5:areturn         
	}

	public ObjectWriter withType(Class class1)
	{
		return forType(class1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #424 <Method ObjectWriter forType(Class)>
	//    3    5:areturn         
	}

	public ObjectWriter withView(Class class1)
	{
		class1 = ((Class) (_config.withView(class1)));
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field SerializationConfig _config>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #428 <Method SerializationConfig SerializationConfig.withView(Class)>
	//    4    8:astore_1        
		if(class1 == _config)
	//*   5    9:aload_1         
	//*   6   10:aload_0         
	//*   7   11:getfield        #46  <Field SerializationConfig _config>
	//*   8   14:if_acmpne       19
			return this;
	//    9   17:aload_0         
	//   10   18:areturn         
		else
			return _new(this, ((SerializationConfig) (class1)));
	//   11   19:aload_0         
	//   12   20:aload_0         
	//   13   21:aload_1         
	//   14   22:invokevirtual   #307 <Method ObjectWriter _new(ObjectWriter, SerializationConfig)>
	//   15   25:areturn         
	}

	public ObjectWriter without(FormatFeature formatfeature)
	{
		formatfeature = ((FormatFeature) (_config.without(formatfeature)));
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field SerializationConfig _config>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #431 <Method SerializationConfig SerializationConfig.without(FormatFeature)>
	//    4    8:astore_1        
		if(formatfeature == _config)
	//*   5    9:aload_1         
	//*   6   10:aload_0         
	//*   7   11:getfield        #46  <Field SerializationConfig _config>
	//*   8   14:if_acmpne       19
			return this;
	//    9   17:aload_0         
	//   10   18:areturn         
		else
			return _new(this, ((SerializationConfig) (formatfeature)));
	//   11   19:aload_0         
	//   12   20:aload_0         
	//   13   21:aload_1         
	//   14   22:invokevirtual   #307 <Method ObjectWriter _new(ObjectWriter, SerializationConfig)>
	//   15   25:areturn         
	}

	public ObjectWriter without(com.fasterxml.jackson.core.JsonGenerator.Feature feature)
	{
		feature = ((com.fasterxml.jackson.core.JsonGenerator.Feature) (_config.without(feature)));
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field SerializationConfig _config>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #433 <Method SerializationConfig SerializationConfig.without(com.fasterxml.jackson.core.JsonGenerator$Feature)>
	//    4    8:astore_1        
		if(feature == _config)
	//*   5    9:aload_1         
	//*   6   10:aload_0         
	//*   7   11:getfield        #46  <Field SerializationConfig _config>
	//*   8   14:if_acmpne       19
			return this;
	//    9   17:aload_0         
	//   10   18:areturn         
		else
			return _new(this, ((SerializationConfig) (feature)));
	//   11   19:aload_0         
	//   12   20:aload_0         
	//   13   21:aload_1         
	//   14   22:invokevirtual   #307 <Method ObjectWriter _new(ObjectWriter, SerializationConfig)>
	//   15   25:areturn         
	}

	public ObjectWriter without(SerializationFeature serializationfeature)
	{
		serializationfeature = ((SerializationFeature) (_config.without(serializationfeature)));
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field SerializationConfig _config>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #435 <Method SerializationConfig SerializationConfig.without(SerializationFeature)>
	//    4    8:astore_1        
		if(serializationfeature == _config)
	//*   5    9:aload_1         
	//*   6   10:aload_0         
	//*   7   11:getfield        #46  <Field SerializationConfig _config>
	//*   8   14:if_acmpne       19
			return this;
	//    9   17:aload_0         
	//   10   18:areturn         
		else
			return _new(this, ((SerializationConfig) (serializationfeature)));
	//   11   19:aload_0         
	//   12   20:aload_0         
	//   13   21:aload_1         
	//   14   22:invokevirtual   #307 <Method ObjectWriter _new(ObjectWriter, SerializationConfig)>
	//   15   25:areturn         
	}

	public transient ObjectWriter without(SerializationFeature serializationfeature, SerializationFeature aserializationfeature[])
	{
		serializationfeature = ((SerializationFeature) (_config.without(serializationfeature, aserializationfeature)));
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field SerializationConfig _config>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #437 <Method SerializationConfig SerializationConfig.without(SerializationFeature, SerializationFeature[])>
	//    5    9:astore_1        
		if(serializationfeature == _config)
	//*   6   10:aload_1         
	//*   7   11:aload_0         
	//*   8   12:getfield        #46  <Field SerializationConfig _config>
	//*   9   15:if_acmpne       20
			return this;
	//   10   18:aload_0         
	//   11   19:areturn         
		else
			return _new(this, ((SerializationConfig) (serializationfeature)));
	//   12   20:aload_0         
	//   13   21:aload_0         
	//   14   22:aload_1         
	//   15   23:invokevirtual   #307 <Method ObjectWriter _new(ObjectWriter, SerializationConfig)>
	//   16   26:areturn         
	}

	public ObjectWriter withoutAttribute(Object obj)
	{
		obj = ((Object) ((SerializationConfig)_config.withoutAttribute(obj)));
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field SerializationConfig _config>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #442 <Method com.fasterxml.jackson.databind.cfg.MapperConfigBase SerializationConfig.withoutAttribute(Object)>
	//    4    8:checkcast       #102 <Class SerializationConfig>
	//    5   11:astore_1        
		if(obj == _config)
	//*   6   12:aload_1         
	//*   7   13:aload_0         
	//*   8   14:getfield        #46  <Field SerializationConfig _config>
	//*   9   17:if_acmpne       22
			return this;
	//   10   20:aload_0         
	//   11   21:areturn         
		else
			return _new(this, ((SerializationConfig) (obj)));
	//   12   22:aload_0         
	//   13   23:aload_0         
	//   14   24:aload_1         
	//   15   25:invokevirtual   #307 <Method ObjectWriter _new(ObjectWriter, SerializationConfig)>
	//   16   28:areturn         
	}

	public transient ObjectWriter withoutFeatures(FormatFeature aformatfeature[])
	{
		aformatfeature = ((FormatFeature []) (_config.withoutFeatures(aformatfeature)));
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field SerializationConfig _config>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #445 <Method SerializationConfig SerializationConfig.withoutFeatures(FormatFeature[])>
	//    4    8:astore_1        
		if(aformatfeature == _config)
	//*   5    9:aload_1         
	//*   6   10:aload_0         
	//*   7   11:getfield        #46  <Field SerializationConfig _config>
	//*   8   14:if_acmpne       19
			return this;
	//    9   17:aload_0         
	//   10   18:areturn         
		else
			return _new(this, ((SerializationConfig) (aformatfeature)));
	//   11   19:aload_0         
	//   12   20:aload_0         
	//   13   21:aload_1         
	//   14   22:invokevirtual   #307 <Method ObjectWriter _new(ObjectWriter, SerializationConfig)>
	//   15   25:areturn         
	}

	public transient ObjectWriter withoutFeatures(com.fasterxml.jackson.core.JsonGenerator.Feature afeature[])
	{
		afeature = ((com.fasterxml.jackson.core.JsonGenerator.Feature []) (_config.withoutFeatures(afeature)));
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field SerializationConfig _config>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #447 <Method SerializationConfig SerializationConfig.withoutFeatures(com.fasterxml.jackson.core.JsonGenerator$Feature[])>
	//    4    8:astore_1        
		if(afeature == _config)
	//*   5    9:aload_1         
	//*   6   10:aload_0         
	//*   7   11:getfield        #46  <Field SerializationConfig _config>
	//*   8   14:if_acmpne       19
			return this;
	//    9   17:aload_0         
	//   10   18:areturn         
		else
			return _new(this, ((SerializationConfig) (afeature)));
	//   11   19:aload_0         
	//   12   20:aload_0         
	//   13   21:aload_1         
	//   14   22:invokevirtual   #307 <Method ObjectWriter _new(ObjectWriter, SerializationConfig)>
	//   15   25:areturn         
	}

	public transient ObjectWriter withoutFeatures(SerializationFeature aserializationfeature[])
	{
		aserializationfeature = ((SerializationFeature []) (_config.withoutFeatures(aserializationfeature)));
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field SerializationConfig _config>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #449 <Method SerializationConfig SerializationConfig.withoutFeatures(SerializationFeature[])>
	//    4    8:astore_1        
		if(aserializationfeature == _config)
	//*   5    9:aload_1         
	//*   6   10:aload_0         
	//*   7   11:getfield        #46  <Field SerializationConfig _config>
	//*   8   14:if_acmpne       19
			return this;
	//    9   17:aload_0         
	//   10   18:areturn         
		else
			return _new(this, ((SerializationConfig) (aserializationfeature)));
	//   11   19:aload_0         
	//   12   20:aload_0         
	//   13   21:aload_1         
	//   14   22:invokevirtual   #307 <Method ObjectWriter _new(ObjectWriter, SerializationConfig)>
	//   15   25:areturn         
	}

	public ObjectWriter withoutRootName()
	{
		SerializationConfig serializationconfig = _config.withRootName(PropertyName.NO_NAME);
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field SerializationConfig _config>
	//    2    4:getstatic       #456 <Field PropertyName PropertyName.NO_NAME>
	//    3    7:invokevirtual   #402 <Method SerializationConfig SerializationConfig.withRootName(PropertyName)>
	//    4   10:astore_1        
		if(serializationconfig == _config)
	//*   5   11:aload_1         
	//*   6   12:aload_0         
	//*   7   13:getfield        #46  <Field SerializationConfig _config>
	//*   8   16:if_acmpne       21
			return this;
	//    9   19:aload_0         
	//   10   20:areturn         
		else
			return _new(this, serializationconfig);
	//   11   21:aload_0         
	//   12   22:aload_0         
	//   13   23:aload_1         
	//   14   24:invokevirtual   #307 <Method ObjectWriter _new(ObjectWriter, SerializationConfig)>
	//   15   27:areturn         
	}

	public void writeValue(JsonGenerator jsongenerator, Object obj)
		throws IOException, JsonGenerationException, JsonMappingException
	{
		Closeable closeable;
		Closeable closeable1;
		_configureGenerator(jsongenerator);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #146 <Method void _configureGenerator(JsonGenerator)>
		if(!_config.isEnabled(SerializationFeature.CLOSE_CLOSEABLE) || !(obj instanceof Closeable))
			break MISSING_BLOCK_LABEL_105;
	//    3    5:aload_0         
	//    4    6:getfield        #46  <Field SerializationConfig _config>
	//    5    9:getstatic       #152 <Field SerializationFeature SerializationFeature.CLOSE_CLOSEABLE>
	//    6   12:invokevirtual   #156 <Method boolean SerializationConfig.isEnabled(SerializationFeature)>
	//    7   15:ifeq            105
	//    8   18:aload_2         
	//    9   19:instanceof      #114 <Class Closeable>
	//   10   22:ifeq            105
		closeable1 = (Closeable)obj;
	//   11   25:aload_2         
	//   12   26:checkcast       #114 <Class Closeable>
	//   13   29:astore          4
		closeable = closeable1;
	//   14   31:aload           4
	//   15   33:astore_3        
		_prefetch.serialize(jsongenerator, obj, _serializerProvider());
	//   16   34:aload_0         
	//   17   35:getfield        #68  <Field ObjectWriter$Prefetch _prefetch>
	//   18   38:aload_1         
	//   19   39:aload_2         
	//   20   40:aload_0         
	//   21   41:invokevirtual   #117 <Method DefaultSerializerProvider _serializerProvider()>
	//   22   44:invokevirtual   #121 <Method void ObjectWriter$Prefetch.serialize(JsonGenerator, Object, DefaultSerializerProvider)>
		closeable = closeable1;
	//   23   47:aload           4
	//   24   49:astore_3        
		if(!_config.isEnabled(SerializationFeature.FLUSH_AFTER_WRITE_VALUE))
			break MISSING_BLOCK_LABEL_70;
	//   25   50:aload_0         
	//   26   51:getfield        #46  <Field SerializationConfig _config>
	//   27   54:getstatic       #462 <Field SerializationFeature SerializationFeature.FLUSH_AFTER_WRITE_VALUE>
	//   28   57:invokevirtual   #156 <Method boolean SerializationConfig.isEnabled(SerializationFeature)>
	//   29   60:ifeq            70
		closeable = closeable1;
	//   30   63:aload           4
	//   31   65:astore_3        
		jsongenerator.flush();
	//   32   66:aload_1         
	//   33   67:invokevirtual   #465 <Method void JsonGenerator.flush()>
		closeable = null;
	//   34   70:aconst_null     
	//   35   71:astore_3        
		closeable1.close();
	//   36   72:aload           4
	//   37   74:invokeinterface #127 <Method void Closeable.close()>
		if(true)
			break MISSING_BLOCK_LABEL_91;
	//   38   79:iconst_0        
	//   39   80:ifeq            91
		throw new NullPointerException();
	//   40   83:new             #135 <Class NullPointerException>
	//   41   86:dup             
	//   42   87:invokespecial   #136 <Method void NullPointerException()>
	//   43   90:athrow          
_L1:
		return;
	//   44   91:return          
		jsongenerator;
	//   45   92:astore_1        
		if(closeable != null)
	//*  46   93:aload_3         
	//*  47   94:ifnull          103
			try
			{
				closeable.close();
	//   48   97:aload_3         
	//   49   98:invokeinterface #127 <Method void Closeable.close()>
			}
	//*  50  103:aload_1         
	//*  51  104:athrow          
	//*  52  105:aload_0         
	//*  53  106:getfield        #68  <Field ObjectWriter$Prefetch _prefetch>
	//*  54  109:aload_1         
	//*  55  110:aload_2         
	//*  56  111:aload_0         
	//*  57  112:invokevirtual   #117 <Method DefaultSerializerProvider _serializerProvider()>
	//*  58  115:invokevirtual   #121 <Method void ObjectWriter$Prefetch.serialize(JsonGenerator, Object, DefaultSerializerProvider)>
	//*  59  118:aload_0         
	//*  60  119:getfield        #46  <Field SerializationConfig _config>
	//*  61  122:getstatic       #462 <Field SerializationFeature SerializationFeature.FLUSH_AFTER_WRITE_VALUE>
	//*  62  125:invokevirtual   #156 <Method boolean SerializationConfig.isEnabled(SerializationFeature)>
	//*  63  128:ifeq            91
	//*  64  131:aload_1         
	//*  65  132:invokevirtual   #465 <Method void JsonGenerator.flush()>
	//*  66  135:return          
	//*  67  136:astore_1        
	//*  68  137:return          
			// Misplaced declaration of an exception variable
			catch(Object obj) { }
	//   69  138:astore_2        
		throw jsongenerator;
		_prefetch.serialize(jsongenerator, obj, _serializerProvider());
		if(_config.isEnabled(SerializationFeature.FLUSH_AFTER_WRITE_VALUE))
		{
			jsongenerator.flush();
			return;
		}
		  goto _L1
		jsongenerator;
	//*  70  139:goto            103
	}

	public void writeValue(File file, Object obj)
		throws IOException, JsonGenerationException, JsonMappingException
	{
		_configAndWriteValue(_generatorFactory.createGenerator(file, JsonEncoding.UTF8), obj);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #59  <Field JsonFactory _generatorFactory>
	//    3    5:aload_1         
	//    4    6:getstatic       #472 <Field JsonEncoding JsonEncoding.UTF8>
	//    5    9:invokevirtual   #476 <Method JsonGenerator JsonFactory.createGenerator(File, JsonEncoding)>
	//    6   12:aload_2         
	//    7   13:invokevirtual   #478 <Method void _configAndWriteValue(JsonGenerator, Object)>
	//    8   16:return          
	}

	public void writeValue(OutputStream outputstream, Object obj)
		throws IOException, JsonGenerationException, JsonMappingException
	{
		_configAndWriteValue(_generatorFactory.createGenerator(outputstream, JsonEncoding.UTF8), obj);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #59  <Field JsonFactory _generatorFactory>
	//    3    5:aload_1         
	//    4    6:getstatic       #472 <Field JsonEncoding JsonEncoding.UTF8>
	//    5    9:invokevirtual   #482 <Method JsonGenerator JsonFactory.createGenerator(OutputStream, JsonEncoding)>
	//    6   12:aload_2         
	//    7   13:invokevirtual   #478 <Method void _configAndWriteValue(JsonGenerator, Object)>
	//    8   16:return          
	}

	public void writeValue(Writer writer, Object obj)
		throws IOException, JsonGenerationException, JsonMappingException
	{
		_configAndWriteValue(_generatorFactory.createGenerator(writer), obj);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #59  <Field JsonFactory _generatorFactory>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #486 <Method JsonGenerator JsonFactory.createGenerator(Writer)>
	//    5    9:aload_2         
	//    6   10:invokevirtual   #478 <Method void _configAndWriteValue(JsonGenerator, Object)>
	//    7   13:return          
	}

	public byte[] writeValueAsBytes(Object obj)
		throws JsonProcessingException
	{
		ByteArrayBuilder bytearraybuilder = new ByteArrayBuilder(_generatorFactory._getBufferRecycler());
	//    0    0:new             #492 <Class ByteArrayBuilder>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #59  <Field JsonFactory _generatorFactory>
	//    4    8:invokevirtual   #496 <Method com.fasterxml.jackson.core.util.BufferRecycler JsonFactory._getBufferRecycler()>
	//    5   11:invokespecial   #499 <Method void ByteArrayBuilder(com.fasterxml.jackson.core.util.BufferRecycler)>
	//    6   14:astore_2        
		try
		{
			_configAndWriteValue(_generatorFactory.createGenerator(((OutputStream) (bytearraybuilder)), JsonEncoding.UTF8), obj);
	//    7   15:aload_0         
	//    8   16:aload_0         
	//    9   17:getfield        #59  <Field JsonFactory _generatorFactory>
	//   10   20:aload_2         
	//   11   21:getstatic       #472 <Field JsonEncoding JsonEncoding.UTF8>
	//   12   24:invokevirtual   #482 <Method JsonGenerator JsonFactory.createGenerator(OutputStream, JsonEncoding)>
	//   13   27:aload_1         
	//   14   28:invokevirtual   #478 <Method void _configAndWriteValue(JsonGenerator, Object)>
		}
	//*  15   31:aload_2         
	//*  16   32:invokevirtual   #503 <Method byte[] ByteArrayBuilder.toByteArray()>
	//*  17   35:astore_1        
	//*  18   36:aload_2         
	//*  19   37:invokevirtual   #506 <Method void ByteArrayBuilder.release()>
	//*  20   40:aload_1         
	//*  21   41:areturn         
		// Misplaced declaration of an exception variable
		catch(Object obj)
	//*  22   42:astore_1        
		{
			throw obj;
	//   23   43:aload_1         
	//   24   44:athrow          
		}
		// Misplaced declaration of an exception variable
		catch(Object obj)
	//*  25   45:astore_1        
		{
			throw JsonMappingException.fromUnexpectedIOE(((IOException) (obj)));
	//   26   46:aload_1         
	//   27   47:invokestatic    #510 <Method JsonMappingException JsonMappingException.fromUnexpectedIOE(IOException)>
	//   28   50:athrow          
		}
		obj = ((Object) (bytearraybuilder.toByteArray()));
		bytearraybuilder.release();
		return ((byte []) (obj));
	}

	public String writeValueAsString(Object obj)
		throws JsonProcessingException
	{
		SegmentedStringWriter segmentedstringwriter = new SegmentedStringWriter(_generatorFactory._getBufferRecycler());
	//    0    0:new             #514 <Class SegmentedStringWriter>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #59  <Field JsonFactory _generatorFactory>
	//    4    8:invokevirtual   #496 <Method com.fasterxml.jackson.core.util.BufferRecycler JsonFactory._getBufferRecycler()>
	//    5   11:invokespecial   #515 <Method void SegmentedStringWriter(com.fasterxml.jackson.core.util.BufferRecycler)>
	//    6   14:astore_2        
		try
		{
			_configAndWriteValue(_generatorFactory.createGenerator(((Writer) (segmentedstringwriter))), obj);
	//    7   15:aload_0         
	//    8   16:aload_0         
	//    9   17:getfield        #59  <Field JsonFactory _generatorFactory>
	//   10   20:aload_2         
	//   11   21:invokevirtual   #486 <Method JsonGenerator JsonFactory.createGenerator(Writer)>
	//   12   24:aload_1         
	//   13   25:invokevirtual   #478 <Method void _configAndWriteValue(JsonGenerator, Object)>
		}
	//*  14   28:aload_2         
	//*  15   29:invokevirtual   #518 <Method String SegmentedStringWriter.getAndClear()>
	//*  16   32:areturn         
		// Misplaced declaration of an exception variable
		catch(Object obj)
	//*  17   33:astore_1        
		{
			throw obj;
	//   18   34:aload_1         
	//   19   35:athrow          
		}
		// Misplaced declaration of an exception variable
		catch(Object obj)
	//*  20   36:astore_1        
		{
			throw JsonMappingException.fromUnexpectedIOE(((IOException) (obj)));
	//   21   37:aload_1         
	//   22   38:invokestatic    #510 <Method JsonMappingException JsonMappingException.fromUnexpectedIOE(IOException)>
	//   23   41:athrow          
		}
		return segmentedstringwriter.getAndClear();
	}

	public SequenceWriter writeValues(JsonGenerator jsongenerator)
		throws IOException
	{
		_configureGenerator(jsongenerator);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #146 <Method void _configureGenerator(JsonGenerator)>
		return _newSequenceWriter(false, jsongenerator, false);
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:aload_1         
	//    6    8:iconst_0        
	//    7    9:invokevirtual   #522 <Method SequenceWriter _newSequenceWriter(boolean, JsonGenerator, boolean)>
	//    8   12:areturn         
	}

	public SequenceWriter writeValues(File file)
		throws IOException
	{
		return _newSequenceWriter(false, _generatorFactory.createGenerator(file, JsonEncoding.UTF8), true);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:aload_0         
	//    3    3:getfield        #59  <Field JsonFactory _generatorFactory>
	//    4    6:aload_1         
	//    5    7:getstatic       #472 <Field JsonEncoding JsonEncoding.UTF8>
	//    6   10:invokevirtual   #476 <Method JsonGenerator JsonFactory.createGenerator(File, JsonEncoding)>
	//    7   13:iconst_1        
	//    8   14:invokevirtual   #522 <Method SequenceWriter _newSequenceWriter(boolean, JsonGenerator, boolean)>
	//    9   17:areturn         
	}

	public SequenceWriter writeValues(OutputStream outputstream)
		throws IOException
	{
		return _newSequenceWriter(false, _generatorFactory.createGenerator(outputstream, JsonEncoding.UTF8), true);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:aload_0         
	//    3    3:getfield        #59  <Field JsonFactory _generatorFactory>
	//    4    6:aload_1         
	//    5    7:getstatic       #472 <Field JsonEncoding JsonEncoding.UTF8>
	//    6   10:invokevirtual   #482 <Method JsonGenerator JsonFactory.createGenerator(OutputStream, JsonEncoding)>
	//    7   13:iconst_1        
	//    8   14:invokevirtual   #522 <Method SequenceWriter _newSequenceWriter(boolean, JsonGenerator, boolean)>
	//    9   17:areturn         
	}

	public SequenceWriter writeValues(Writer writer)
		throws IOException
	{
		return _newSequenceWriter(false, _generatorFactory.createGenerator(writer), true);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:aload_0         
	//    3    3:getfield        #59  <Field JsonFactory _generatorFactory>
	//    4    6:aload_1         
	//    5    7:invokevirtual   #486 <Method JsonGenerator JsonFactory.createGenerator(Writer)>
	//    6   10:iconst_1        
	//    7   11:invokevirtual   #522 <Method SequenceWriter _newSequenceWriter(boolean, JsonGenerator, boolean)>
	//    8   14:areturn         
	}

	public SequenceWriter writeValuesAsArray(JsonGenerator jsongenerator)
		throws IOException
	{
		return _newSequenceWriter(true, jsongenerator, false);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:aload_1         
	//    3    3:iconst_0        
	//    4    4:invokevirtual   #522 <Method SequenceWriter _newSequenceWriter(boolean, JsonGenerator, boolean)>
	//    5    7:areturn         
	}

	public SequenceWriter writeValuesAsArray(File file)
		throws IOException
	{
		return _newSequenceWriter(true, _generatorFactory.createGenerator(file, JsonEncoding.UTF8), true);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:aload_0         
	//    3    3:getfield        #59  <Field JsonFactory _generatorFactory>
	//    4    6:aload_1         
	//    5    7:getstatic       #472 <Field JsonEncoding JsonEncoding.UTF8>
	//    6   10:invokevirtual   #476 <Method JsonGenerator JsonFactory.createGenerator(File, JsonEncoding)>
	//    7   13:iconst_1        
	//    8   14:invokevirtual   #522 <Method SequenceWriter _newSequenceWriter(boolean, JsonGenerator, boolean)>
	//    9   17:areturn         
	}

	public SequenceWriter writeValuesAsArray(OutputStream outputstream)
		throws IOException
	{
		return _newSequenceWriter(true, _generatorFactory.createGenerator(outputstream, JsonEncoding.UTF8), true);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:aload_0         
	//    3    3:getfield        #59  <Field JsonFactory _generatorFactory>
	//    4    6:aload_1         
	//    5    7:getstatic       #472 <Field JsonEncoding JsonEncoding.UTF8>
	//    6   10:invokevirtual   #482 <Method JsonGenerator JsonFactory.createGenerator(OutputStream, JsonEncoding)>
	//    7   13:iconst_1        
	//    8   14:invokevirtual   #522 <Method SequenceWriter _newSequenceWriter(boolean, JsonGenerator, boolean)>
	//    9   17:areturn         
	}

	public SequenceWriter writeValuesAsArray(Writer writer)
		throws IOException
	{
		return _newSequenceWriter(true, _generatorFactory.createGenerator(writer), true);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:aload_0         
	//    3    3:getfield        #59  <Field JsonFactory _generatorFactory>
	//    4    6:aload_1         
	//    5    7:invokevirtual   #486 <Method JsonGenerator JsonFactory.createGenerator(Writer)>
	//    6   10:iconst_1        
	//    7   11:invokevirtual   #522 <Method SequenceWriter _newSequenceWriter(boolean, JsonGenerator, boolean)>
	//    8   14:areturn         
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
