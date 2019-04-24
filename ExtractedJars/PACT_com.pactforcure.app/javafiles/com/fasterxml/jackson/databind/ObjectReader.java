// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.core.filter.*;
import com.fasterxml.jackson.core.type.ResolvedType;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.cfg.ContextAttributes;
import com.fasterxml.jackson.databind.cfg.PackageVersion;
import com.fasterxml.jackson.databind.deser.DataFormatReaders;
import com.fasterxml.jackson.databind.deser.DefaultDeserializationContext;
import com.fasterxml.jackson.databind.deser.DeserializationProblemHandler;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.NullNode;
import com.fasterxml.jackson.databind.node.TreeTraversingParser;
import com.fasterxml.jackson.databind.type.SimpleType;
import com.fasterxml.jackson.databind.type.TypeFactory;
import java.io.*;
import java.lang.reflect.Type;
import java.net.URL;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

// Referenced classes of package com.fasterxml.jackson.databind:
//			JsonNode, ObjectMapper, JavaType, DeserializationConfig, 
//			MapperFeature, JsonDeserializer, JsonMappingException, DeserializationContext, 
//			MappingIterator, DeserializationFeature, PropertyName, InjectableValues

public class ObjectReader extends ObjectCodec
	implements Versioned, Serializable
{

	protected ObjectReader(ObjectMapper objectmapper, DeserializationConfig deserializationconfig)
	{
		this(objectmapper, deserializationconfig, ((JavaType) (null)), ((Object) (null)), ((FormatSchema) (null)), ((InjectableValues) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aconst_null     
	//    4    4:aconst_null     
	//    5    5:aconst_null     
	//    6    6:aconst_null     
	//    7    7:invokespecial   #57  <Method void ObjectReader(ObjectMapper, DeserializationConfig, JavaType, Object, FormatSchema, InjectableValues)>
	//    8   10:return          
	}

	protected ObjectReader(ObjectMapper objectmapper, DeserializationConfig deserializationconfig, JavaType javatype, Object obj, FormatSchema formatschema, InjectableValues injectablevalues)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #59  <Method void ObjectCodec()>
		_config = deserializationconfig;
	//    2    4:aload_0         
	//    3    5:aload_2         
	//    4    6:putfield        #61  <Field DeserializationConfig _config>
		_context = objectmapper._deserializationContext;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:getfield        #66  <Field DefaultDeserializationContext ObjectMapper._deserializationContext>
	//    8   14:putfield        #68  <Field DefaultDeserializationContext _context>
		_rootDeserializers = objectmapper._rootDeserializers;
	//    9   17:aload_0         
	//   10   18:aload_1         
	//   11   19:getfield        #70  <Field ConcurrentHashMap ObjectMapper._rootDeserializers>
	//   12   22:putfield        #71  <Field ConcurrentHashMap _rootDeserializers>
		_parserFactory = objectmapper._jsonFactory;
	//   13   25:aload_0         
	//   14   26:aload_1         
	//   15   27:getfield        #74  <Field JsonFactory ObjectMapper._jsonFactory>
	//   16   30:putfield        #76  <Field JsonFactory _parserFactory>
		_valueType = javatype;
	//   17   33:aload_0         
	//   18   34:aload_3         
	//   19   35:putfield        #78  <Field JavaType _valueType>
		_valueToUpdate = obj;
	//   20   38:aload_0         
	//   21   39:aload           4
	//   22   41:putfield        #80  <Field Object _valueToUpdate>
		if(obj != null && javatype.isArrayType())
	//*  23   44:aload           4
	//*  24   46:ifnull          66
	//*  25   49:aload_3         
	//*  26   50:invokevirtual   #86  <Method boolean JavaType.isArrayType()>
	//*  27   53:ifeq            66
		{
			throw new IllegalArgumentException("Can not update an array value");
	//   28   56:new             #88  <Class IllegalArgumentException>
	//   29   59:dup             
	//   30   60:ldc1            #90  <String "Can not update an array value">
	//   31   62:invokespecial   #93  <Method void IllegalArgumentException(String)>
	//   32   65:athrow          
		} else
		{
			_schema = formatschema;
	//   33   66:aload_0         
	//   34   67:aload           5
	//   35   69:putfield        #95  <Field FormatSchema _schema>
			_injectableValues = injectablevalues;
	//   36   72:aload_0         
	//   37   73:aload           6
	//   38   75:putfield        #97  <Field InjectableValues _injectableValues>
			_unwrapRoot = deserializationconfig.useRootWrapping();
	//   39   78:aload_0         
	//   40   79:aload_2         
	//   41   80:invokevirtual   #102 <Method boolean DeserializationConfig.useRootWrapping()>
	//   42   83:putfield        #104 <Field boolean _unwrapRoot>
			_rootDeserializer = _prefetchRootDeserializer(javatype);
	//   43   86:aload_0         
	//   44   87:aload_0         
	//   45   88:aload_3         
	//   46   89:invokevirtual   #108 <Method JsonDeserializer _prefetchRootDeserializer(JavaType)>
	//   47   92:putfield        #110 <Field JsonDeserializer _rootDeserializer>
			_dataFormatReaders = null;
	//   48   95:aload_0         
	//   49   96:aconst_null     
	//   50   97:putfield        #112 <Field DataFormatReaders _dataFormatReaders>
			_filter = null;
	//   51  100:aload_0         
	//   52  101:aconst_null     
	//   53  102:putfield        #114 <Field TokenFilter _filter>
			return;
	//   54  105:return          
		}
	}

	protected ObjectReader(ObjectReader objectreader, JsonFactory jsonfactory)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #59  <Method void ObjectCodec()>
		_config = objectreader._config.with(MapperFeature.SORT_PROPERTIES_ALPHABETICALLY, jsonfactory.requiresPropertyOrdering());
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:getfield        #61  <Field DeserializationConfig _config>
	//    5    9:getstatic       #121 <Field MapperFeature MapperFeature.SORT_PROPERTIES_ALPHABETICALLY>
	//    6   12:aload_2         
	//    7   13:invokevirtual   #126 <Method boolean JsonFactory.requiresPropertyOrdering()>
	//    8   16:invokevirtual   #130 <Method DeserializationConfig DeserializationConfig.with(MapperFeature, boolean)>
	//    9   19:putfield        #61  <Field DeserializationConfig _config>
		_context = objectreader._context;
	//   10   22:aload_0         
	//   11   23:aload_1         
	//   12   24:getfield        #68  <Field DefaultDeserializationContext _context>
	//   13   27:putfield        #68  <Field DefaultDeserializationContext _context>
		_rootDeserializers = objectreader._rootDeserializers;
	//   14   30:aload_0         
	//   15   31:aload_1         
	//   16   32:getfield        #71  <Field ConcurrentHashMap _rootDeserializers>
	//   17   35:putfield        #71  <Field ConcurrentHashMap _rootDeserializers>
		_parserFactory = jsonfactory;
	//   18   38:aload_0         
	//   19   39:aload_2         
	//   20   40:putfield        #76  <Field JsonFactory _parserFactory>
		_valueType = objectreader._valueType;
	//   21   43:aload_0         
	//   22   44:aload_1         
	//   23   45:getfield        #78  <Field JavaType _valueType>
	//   24   48:putfield        #78  <Field JavaType _valueType>
		_rootDeserializer = objectreader._rootDeserializer;
	//   25   51:aload_0         
	//   26   52:aload_1         
	//   27   53:getfield        #110 <Field JsonDeserializer _rootDeserializer>
	//   28   56:putfield        #110 <Field JsonDeserializer _rootDeserializer>
		_valueToUpdate = objectreader._valueToUpdate;
	//   29   59:aload_0         
	//   30   60:aload_1         
	//   31   61:getfield        #80  <Field Object _valueToUpdate>
	//   32   64:putfield        #80  <Field Object _valueToUpdate>
		_schema = objectreader._schema;
	//   33   67:aload_0         
	//   34   68:aload_1         
	//   35   69:getfield        #95  <Field FormatSchema _schema>
	//   36   72:putfield        #95  <Field FormatSchema _schema>
		_injectableValues = objectreader._injectableValues;
	//   37   75:aload_0         
	//   38   76:aload_1         
	//   39   77:getfield        #97  <Field InjectableValues _injectableValues>
	//   40   80:putfield        #97  <Field InjectableValues _injectableValues>
		_unwrapRoot = objectreader._unwrapRoot;
	//   41   83:aload_0         
	//   42   84:aload_1         
	//   43   85:getfield        #104 <Field boolean _unwrapRoot>
	//   44   88:putfield        #104 <Field boolean _unwrapRoot>
		_dataFormatReaders = objectreader._dataFormatReaders;
	//   45   91:aload_0         
	//   46   92:aload_1         
	//   47   93:getfield        #112 <Field DataFormatReaders _dataFormatReaders>
	//   48   96:putfield        #112 <Field DataFormatReaders _dataFormatReaders>
		_filter = objectreader._filter;
	//   49   99:aload_0         
	//   50  100:aload_1         
	//   51  101:getfield        #114 <Field TokenFilter _filter>
	//   52  104:putfield        #114 <Field TokenFilter _filter>
	//   53  107:return          
	}

	protected ObjectReader(ObjectReader objectreader, TokenFilter tokenfilter)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #59  <Method void ObjectCodec()>
		_config = objectreader._config;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:getfield        #61  <Field DeserializationConfig _config>
	//    5    9:putfield        #61  <Field DeserializationConfig _config>
		_context = objectreader._context;
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:getfield        #68  <Field DefaultDeserializationContext _context>
	//    9   17:putfield        #68  <Field DefaultDeserializationContext _context>
		_rootDeserializers = objectreader._rootDeserializers;
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:getfield        #71  <Field ConcurrentHashMap _rootDeserializers>
	//   13   25:putfield        #71  <Field ConcurrentHashMap _rootDeserializers>
		_parserFactory = objectreader._parserFactory;
	//   14   28:aload_0         
	//   15   29:aload_1         
	//   16   30:getfield        #76  <Field JsonFactory _parserFactory>
	//   17   33:putfield        #76  <Field JsonFactory _parserFactory>
		_valueType = objectreader._valueType;
	//   18   36:aload_0         
	//   19   37:aload_1         
	//   20   38:getfield        #78  <Field JavaType _valueType>
	//   21   41:putfield        #78  <Field JavaType _valueType>
		_rootDeserializer = objectreader._rootDeserializer;
	//   22   44:aload_0         
	//   23   45:aload_1         
	//   24   46:getfield        #110 <Field JsonDeserializer _rootDeserializer>
	//   25   49:putfield        #110 <Field JsonDeserializer _rootDeserializer>
		_valueToUpdate = objectreader._valueToUpdate;
	//   26   52:aload_0         
	//   27   53:aload_1         
	//   28   54:getfield        #80  <Field Object _valueToUpdate>
	//   29   57:putfield        #80  <Field Object _valueToUpdate>
		_schema = objectreader._schema;
	//   30   60:aload_0         
	//   31   61:aload_1         
	//   32   62:getfield        #95  <Field FormatSchema _schema>
	//   33   65:putfield        #95  <Field FormatSchema _schema>
		_injectableValues = objectreader._injectableValues;
	//   34   68:aload_0         
	//   35   69:aload_1         
	//   36   70:getfield        #97  <Field InjectableValues _injectableValues>
	//   37   73:putfield        #97  <Field InjectableValues _injectableValues>
		_unwrapRoot = objectreader._unwrapRoot;
	//   38   76:aload_0         
	//   39   77:aload_1         
	//   40   78:getfield        #104 <Field boolean _unwrapRoot>
	//   41   81:putfield        #104 <Field boolean _unwrapRoot>
		_dataFormatReaders = objectreader._dataFormatReaders;
	//   42   84:aload_0         
	//   43   85:aload_1         
	//   44   86:getfield        #112 <Field DataFormatReaders _dataFormatReaders>
	//   45   89:putfield        #112 <Field DataFormatReaders _dataFormatReaders>
		_filter = tokenfilter;
	//   46   92:aload_0         
	//   47   93:aload_2         
	//   48   94:putfield        #114 <Field TokenFilter _filter>
	//   49   97:return          
	}

	protected ObjectReader(ObjectReader objectreader, DeserializationConfig deserializationconfig)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #59  <Method void ObjectCodec()>
		_config = deserializationconfig;
	//    2    4:aload_0         
	//    3    5:aload_2         
	//    4    6:putfield        #61  <Field DeserializationConfig _config>
		_context = objectreader._context;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:getfield        #68  <Field DefaultDeserializationContext _context>
	//    8   14:putfield        #68  <Field DefaultDeserializationContext _context>
		_rootDeserializers = objectreader._rootDeserializers;
	//    9   17:aload_0         
	//   10   18:aload_1         
	//   11   19:getfield        #71  <Field ConcurrentHashMap _rootDeserializers>
	//   12   22:putfield        #71  <Field ConcurrentHashMap _rootDeserializers>
		_parserFactory = objectreader._parserFactory;
	//   13   25:aload_0         
	//   14   26:aload_1         
	//   15   27:getfield        #76  <Field JsonFactory _parserFactory>
	//   16   30:putfield        #76  <Field JsonFactory _parserFactory>
		_valueType = objectreader._valueType;
	//   17   33:aload_0         
	//   18   34:aload_1         
	//   19   35:getfield        #78  <Field JavaType _valueType>
	//   20   38:putfield        #78  <Field JavaType _valueType>
		_rootDeserializer = objectreader._rootDeserializer;
	//   21   41:aload_0         
	//   22   42:aload_1         
	//   23   43:getfield        #110 <Field JsonDeserializer _rootDeserializer>
	//   24   46:putfield        #110 <Field JsonDeserializer _rootDeserializer>
		_valueToUpdate = objectreader._valueToUpdate;
	//   25   49:aload_0         
	//   26   50:aload_1         
	//   27   51:getfield        #80  <Field Object _valueToUpdate>
	//   28   54:putfield        #80  <Field Object _valueToUpdate>
		_schema = objectreader._schema;
	//   29   57:aload_0         
	//   30   58:aload_1         
	//   31   59:getfield        #95  <Field FormatSchema _schema>
	//   32   62:putfield        #95  <Field FormatSchema _schema>
		_injectableValues = objectreader._injectableValues;
	//   33   65:aload_0         
	//   34   66:aload_1         
	//   35   67:getfield        #97  <Field InjectableValues _injectableValues>
	//   36   70:putfield        #97  <Field InjectableValues _injectableValues>
		_unwrapRoot = deserializationconfig.useRootWrapping();
	//   37   73:aload_0         
	//   38   74:aload_2         
	//   39   75:invokevirtual   #102 <Method boolean DeserializationConfig.useRootWrapping()>
	//   40   78:putfield        #104 <Field boolean _unwrapRoot>
		_dataFormatReaders = objectreader._dataFormatReaders;
	//   41   81:aload_0         
	//   42   82:aload_1         
	//   43   83:getfield        #112 <Field DataFormatReaders _dataFormatReaders>
	//   44   86:putfield        #112 <Field DataFormatReaders _dataFormatReaders>
		_filter = objectreader._filter;
	//   45   89:aload_0         
	//   46   90:aload_1         
	//   47   91:getfield        #114 <Field TokenFilter _filter>
	//   48   94:putfield        #114 <Field TokenFilter _filter>
	//   49   97:return          
	}

	protected ObjectReader(ObjectReader objectreader, DeserializationConfig deserializationconfig, JavaType javatype, JsonDeserializer jsondeserializer, Object obj, FormatSchema formatschema, InjectableValues injectablevalues, 
			DataFormatReaders dataformatreaders)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #59  <Method void ObjectCodec()>
		_config = deserializationconfig;
	//    2    4:aload_0         
	//    3    5:aload_2         
	//    4    6:putfield        #61  <Field DeserializationConfig _config>
		_context = objectreader._context;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:getfield        #68  <Field DefaultDeserializationContext _context>
	//    8   14:putfield        #68  <Field DefaultDeserializationContext _context>
		_rootDeserializers = objectreader._rootDeserializers;
	//    9   17:aload_0         
	//   10   18:aload_1         
	//   11   19:getfield        #71  <Field ConcurrentHashMap _rootDeserializers>
	//   12   22:putfield        #71  <Field ConcurrentHashMap _rootDeserializers>
		_parserFactory = objectreader._parserFactory;
	//   13   25:aload_0         
	//   14   26:aload_1         
	//   15   27:getfield        #76  <Field JsonFactory _parserFactory>
	//   16   30:putfield        #76  <Field JsonFactory _parserFactory>
		_valueType = javatype;
	//   17   33:aload_0         
	//   18   34:aload_3         
	//   19   35:putfield        #78  <Field JavaType _valueType>
		_rootDeserializer = jsondeserializer;
	//   20   38:aload_0         
	//   21   39:aload           4
	//   22   41:putfield        #110 <Field JsonDeserializer _rootDeserializer>
		_valueToUpdate = obj;
	//   23   44:aload_0         
	//   24   45:aload           5
	//   25   47:putfield        #80  <Field Object _valueToUpdate>
		if(obj != null && javatype.isArrayType())
	//*  26   50:aload           5
	//*  27   52:ifnull          72
	//*  28   55:aload_3         
	//*  29   56:invokevirtual   #86  <Method boolean JavaType.isArrayType()>
	//*  30   59:ifeq            72
		{
			throw new IllegalArgumentException("Can not update an array value");
	//   31   62:new             #88  <Class IllegalArgumentException>
	//   32   65:dup             
	//   33   66:ldc1            #90  <String "Can not update an array value">
	//   34   68:invokespecial   #93  <Method void IllegalArgumentException(String)>
	//   35   71:athrow          
		} else
		{
			_schema = formatschema;
	//   36   72:aload_0         
	//   37   73:aload           6
	//   38   75:putfield        #95  <Field FormatSchema _schema>
			_injectableValues = injectablevalues;
	//   39   78:aload_0         
	//   40   79:aload           7
	//   41   81:putfield        #97  <Field InjectableValues _injectableValues>
			_unwrapRoot = deserializationconfig.useRootWrapping();
	//   42   84:aload_0         
	//   43   85:aload_2         
	//   44   86:invokevirtual   #102 <Method boolean DeserializationConfig.useRootWrapping()>
	//   45   89:putfield        #104 <Field boolean _unwrapRoot>
			_dataFormatReaders = dataformatreaders;
	//   46   92:aload_0         
	//   47   93:aload           8
	//   48   95:putfield        #112 <Field DataFormatReaders _dataFormatReaders>
			_filter = objectreader._filter;
	//   49   98:aload_0         
	//   50   99:aload_1         
	//   51  100:getfield        #114 <Field TokenFilter _filter>
	//   52  103:putfield        #114 <Field TokenFilter _filter>
			return;
	//   53  106:return          
		}
	}

	protected Object _bind(JsonParser jsonparser, Object obj)
		throws IOException
	{
		JsonToken jsontoken = _initForReading(jsonparser);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #143 <Method JsonToken _initForReading(JsonParser)>
	//    3    5:astore_3        
		if(jsontoken != JsonToken.VALUE_NULL) goto _L2; else goto _L1
	//    4    6:aload_3         
	//    5    7:getstatic       #149 <Field JsonToken JsonToken.VALUE_NULL>
	//    6   10:if_acmpne       42
_L1:
		if(obj == null)
	//*   7   13:aload_2         
	//*   8   14:ifnonnull       39
		{
			obj = ((Object) (createDeserializationContext(jsonparser)));
	//    9   17:aload_0         
	//   10   18:aload_1         
	//   11   19:invokevirtual   #153 <Method DefaultDeserializationContext createDeserializationContext(JsonParser)>
	//   12   22:astore_2        
			obj = _findRootDeserializer(((DeserializationContext) (obj))).getNullValue(((DeserializationContext) (obj)));
	//   13   23:aload_0         
	//   14   24:aload_2         
	//   15   25:invokevirtual   #157 <Method JsonDeserializer _findRootDeserializer(DeserializationContext)>
	//   16   28:aload_2         
	//   17   29:invokevirtual   #163 <Method Object JsonDeserializer.getNullValue(DeserializationContext)>
	//   18   32:astore_2        
		}
_L4:
		jsonparser.clearCurrentToken();
	//   19   33:aload_1         
	//   20   34:invokevirtual   #168 <Method void JsonParser.clearCurrentToken()>
		return obj;
	//   21   37:aload_2         
	//   22   38:areturn         
	//*  23   39:goto            33
_L2:
		if(jsontoken != JsonToken.END_ARRAY && jsontoken != JsonToken.END_OBJECT)
	//*  24   42:aload_3         
	//*  25   43:getstatic       #171 <Field JsonToken JsonToken.END_ARRAY>
	//*  26   46:if_acmpeq       56
	//*  27   49:aload_3         
	//*  28   50:getstatic       #174 <Field JsonToken JsonToken.END_OBJECT>
	//*  29   53:if_acmpne       59
	//*  30   56:goto            33
		{
			DefaultDeserializationContext defaultdeserializationcontext = createDeserializationContext(jsonparser);
	//   31   59:aload_0         
	//   32   60:aload_1         
	//   33   61:invokevirtual   #153 <Method DefaultDeserializationContext createDeserializationContext(JsonParser)>
	//   34   64:astore_3        
			JsonDeserializer jsondeserializer = _findRootDeserializer(((DeserializationContext) (defaultdeserializationcontext)));
	//   35   65:aload_0         
	//   36   66:aload_3         
	//   37   67:invokevirtual   #157 <Method JsonDeserializer _findRootDeserializer(DeserializationContext)>
	//   38   70:astore          4
			if(_unwrapRoot)
	//*  39   72:aload_0         
	//*  40   73:getfield        #104 <Field boolean _unwrapRoot>
	//*  41   76:ifeq            95
				obj = _unwrapAndDeserialize(jsonparser, ((DeserializationContext) (defaultdeserializationcontext)), _valueType, jsondeserializer);
	//   42   79:aload_0         
	//   43   80:aload_1         
	//   44   81:aload_3         
	//   45   82:aload_0         
	//   46   83:getfield        #78  <Field JavaType _valueType>
	//   47   86:aload           4
	//   48   88:invokevirtual   #178 <Method Object _unwrapAndDeserialize(JsonParser, DeserializationContext, JavaType, JsonDeserializer)>
	//   49   91:astore_2        
			else
	//*  50   92:goto            33
			if(obj == null)
	//*  51   95:aload_2         
	//*  52   96:ifnonnull       110
				obj = jsondeserializer.deserialize(jsonparser, ((DeserializationContext) (defaultdeserializationcontext)));
	//   53   99:aload           4
	//   54  101:aload_1         
	//   55  102:aload_3         
	//   56  103:invokevirtual   #182 <Method Object JsonDeserializer.deserialize(JsonParser, DeserializationContext)>
	//   57  106:astore_2        
			else
	//*  58  107:goto            33
				jsondeserializer.deserialize(jsonparser, ((DeserializationContext) (defaultdeserializationcontext)), obj);
	//   59  110:aload           4
	//   60  112:aload_1         
	//   61  113:aload_3         
	//   62  114:aload_2         
	//   63  115:invokevirtual   #185 <Method Object JsonDeserializer.deserialize(JsonParser, DeserializationContext, Object)>
	//   64  118:pop             
		}
		if(true) goto _L4; else goto _L3
	//   65  119:goto            33
_L3:
	}

	protected Object _bindAndClose(JsonParser jsonparser)
		throws IOException
	{
		Object obj = ((Object) (_initForReading(jsonparser)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #143 <Method JsonToken _initForReading(JsonParser)>
	//    3    5:astore_2        
		if(obj != JsonToken.VALUE_NULL) goto _L2; else goto _L1
	//    4    6:aload_2         
	//    5    7:getstatic       #149 <Field JsonToken JsonToken.VALUE_NULL>
	//    6   10:if_acmpne       50
_L1:
		if(_valueToUpdate != null) goto _L4; else goto _L3
	//    7   13:aload_0         
	//    8   14:getfield        #80  <Field Object _valueToUpdate>
	//    9   17:ifnonnull       42
_L3:
		obj = ((Object) (createDeserializationContext(jsonparser)));
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:invokevirtual   #153 <Method DefaultDeserializationContext createDeserializationContext(JsonParser)>
	//   13   25:astore_2        
		obj = _findRootDeserializer(((DeserializationContext) (obj))).getNullValue(((DeserializationContext) (obj)));
	//   14   26:aload_0         
	//   15   27:aload_2         
	//   16   28:invokevirtual   #157 <Method JsonDeserializer _findRootDeserializer(DeserializationContext)>
	//   17   31:aload_2         
	//   18   32:invokevirtual   #163 <Method Object JsonDeserializer.getNullValue(DeserializationContext)>
	//   19   35:astore_2        
_L5:
		JsonDeserializer jsondeserializer;
		try
		{
			jsonparser.close();
	//   20   36:aload_1         
	//   21   37:invokevirtual   #191 <Method void JsonParser.close()>
		}
	//*  22   40:aload_2         
	//*  23   41:areturn         
	//*  24   42:aload_0         
	//*  25   43:getfield        #80  <Field Object _valueToUpdate>
	//*  26   46:astore_2        
	//*  27   47:goto            36
	//*  28   50:aload_2         
	//*  29   51:getstatic       #171 <Field JsonToken JsonToken.END_ARRAY>
	//*  30   54:if_acmpeq       64
	//*  31   57:aload_2         
	//*  32   58:getstatic       #174 <Field JsonToken JsonToken.END_OBJECT>
	//*  33   61:if_acmpne       72
	//*  34   64:aload_0         
	//*  35   65:getfield        #80  <Field Object _valueToUpdate>
	//*  36   68:astore_2        
	//*  37   69:goto            36
	//*  38   72:aload_0         
	//*  39   73:aload_1         
	//*  40   74:invokevirtual   #153 <Method DefaultDeserializationContext createDeserializationContext(JsonParser)>
	//*  41   77:astore_2        
	//*  42   78:aload_0         
	//*  43   79:aload_2         
	//*  44   80:invokevirtual   #157 <Method JsonDeserializer _findRootDeserializer(DeserializationContext)>
	//*  45   83:astore_3        
	//*  46   84:aload_0         
	//*  47   85:getfield        #104 <Field boolean _unwrapRoot>
	//*  48   88:ifeq            106
	//*  49   91:aload_0         
	//*  50   92:aload_1         
	//*  51   93:aload_2         
	//*  52   94:aload_0         
	//*  53   95:getfield        #78  <Field JavaType _valueType>
	//*  54   98:aload_3         
	//*  55   99:invokevirtual   #178 <Method Object _unwrapAndDeserialize(JsonParser, DeserializationContext, JavaType, JsonDeserializer)>
	//*  56  102:astore_2        
	//*  57  103:goto            36
	//*  58  106:aload_0         
	//*  59  107:getfield        #80  <Field Object _valueToUpdate>
	//*  60  110:ifnonnull       123
	//*  61  113:aload_3         
	//*  62  114:aload_1         
	//*  63  115:aload_2         
	//*  64  116:invokevirtual   #182 <Method Object JsonDeserializer.deserialize(JsonParser, DeserializationContext)>
	//*  65  119:astore_2        
	//*  66  120:goto            36
	//*  67  123:aload_3         
	//*  68  124:aload_1         
	//*  69  125:aload_2         
	//*  70  126:aload_0         
	//*  71  127:getfield        #80  <Field Object _valueToUpdate>
	//*  72  130:invokevirtual   #185 <Method Object JsonDeserializer.deserialize(JsonParser, DeserializationContext, Object)>
	//*  73  133:pop             
	//*  74  134:aload_0         
	//*  75  135:getfield        #80  <Field Object _valueToUpdate>
	//*  76  138:astore_2        
	//*  77  139:goto            36
	//*  78  142:astore_2        
	//*  79  143:aload_1         
	//*  80  144:invokevirtual   #191 <Method void JsonParser.close()>
	//*  81  147:aload_2         
	//*  82  148:athrow          
		// Misplaced declaration of an exception variable
		catch(JsonParser jsonparser)
	//*  83  149:astore_1        
		{
			return obj;
	//   84  150:aload_2         
	//   85  151:areturn         
		}
		return obj;
_L4:
		obj = _valueToUpdate;
		  goto _L5
_L2:
label0:
		{
			if(obj != JsonToken.END_ARRAY && obj != JsonToken.END_OBJECT)
				break label0;
			obj = _valueToUpdate;
		}
		  goto _L5
label1:
		{
			obj = ((Object) (createDeserializationContext(jsonparser)));
			jsondeserializer = _findRootDeserializer(((DeserializationContext) (obj)));
			if(!_unwrapRoot)
				break label1;
			obj = _unwrapAndDeserialize(jsonparser, ((DeserializationContext) (obj)), _valueType, jsondeserializer);
		}
		  goto _L5
label2:
		{
			if(_valueToUpdate != null)
				break label2;
			obj = jsondeserializer.deserialize(jsonparser, ((DeserializationContext) (obj)));
		}
		  goto _L5
		jsondeserializer.deserialize(jsonparser, ((DeserializationContext) (obj)), _valueToUpdate);
		obj = _valueToUpdate;
		  goto _L5
		obj;
		try
		{
			jsonparser.close();
		}
		// Misplaced declaration of an exception variable
		catch(JsonParser jsonparser) { }
	//   86  152:astore_1        
		throw obj;
	//*  87  153:goto            147
	}

	protected JsonNode _bindAndCloseAsTree(JsonParser jsonparser)
		throws IOException
	{
		Object obj = ((Object) (_bindAsTree(jsonparser)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #196 <Method JsonNode _bindAsTree(JsonParser)>
	//    3    5:astore_2        
		try
		{
			jsonparser.close();
	//    4    6:aload_1         
	//    5    7:invokevirtual   #191 <Method void JsonParser.close()>
		}
	//*   6   10:aload_2         
	//*   7   11:areturn         
	//*   8   12:astore_2        
	//*   9   13:aload_1         
	//*  10   14:invokevirtual   #191 <Method void JsonParser.close()>
	//*  11   17:aload_2         
	//*  12   18:athrow          
		// Misplaced declaration of an exception variable
		catch(JsonParser jsonparser)
	//*  13   19:astore_1        
		{
			return ((JsonNode) (obj));
	//   14   20:aload_2         
	//   15   21:areturn         
		}
		return ((JsonNode) (obj));
		obj;
		try
		{
			jsonparser.close();
		}
		// Misplaced declaration of an exception variable
		catch(JsonParser jsonparser) { }
	//   16   22:astore_1        
		throw obj;
	//*  17   23:goto            17
	}

	protected MappingIterator _bindAndReadValues(JsonParser jsonparser)
		throws IOException
	{
		_initForMultiRead(jsonparser);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #202 <Method void _initForMultiRead(JsonParser)>
		jsonparser.nextToken();
	//    3    5:aload_1         
	//    4    6:invokevirtual   #206 <Method JsonToken JsonParser.nextToken()>
	//    5    9:pop             
		DefaultDeserializationContext defaultdeserializationcontext = createDeserializationContext(jsonparser);
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:invokevirtual   #153 <Method DefaultDeserializationContext createDeserializationContext(JsonParser)>
	//    9   15:astore_2        
		return _newIterator(jsonparser, ((DeserializationContext) (defaultdeserializationcontext)), _findRootDeserializer(((DeserializationContext) (defaultdeserializationcontext))), true);
	//   10   16:aload_0         
	//   11   17:aload_1         
	//   12   18:aload_2         
	//   13   19:aload_0         
	//   14   20:aload_2         
	//   15   21:invokevirtual   #157 <Method JsonDeserializer _findRootDeserializer(DeserializationContext)>
	//   16   24:iconst_1        
	//   17   25:invokevirtual   #210 <Method MappingIterator _newIterator(JsonParser, DeserializationContext, JsonDeserializer, boolean)>
	//   18   28:areturn         
	}

	protected JsonNode _bindAsTree(JsonParser jsonparser)
		throws IOException
	{
		Object obj = ((Object) (_initForReading(jsonparser)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #143 <Method JsonToken _initForReading(JsonParser)>
	//    3    5:astore_2        
		if(obj == JsonToken.VALUE_NULL || obj == JsonToken.END_ARRAY || obj == JsonToken.END_OBJECT)
	//*   4    6:aload_2         
	//*   5    7:getstatic       #149 <Field JsonToken JsonToken.VALUE_NULL>
	//*   6   10:if_acmpeq       27
	//*   7   13:aload_2         
	//*   8   14:getstatic       #171 <Field JsonToken JsonToken.END_ARRAY>
	//*   9   17:if_acmpeq       27
	//*  10   20:aload_2         
	//*  11   21:getstatic       #174 <Field JsonToken JsonToken.END_OBJECT>
	//*  12   24:if_acmpne       37
		{
			obj = ((Object) (NullNode.instance));
	//   13   27:getstatic       #217 <Field NullNode NullNode.instance>
	//   14   30:astore_2        
		} else
	//*  15   31:aload_1         
	//*  16   32:invokevirtual   #168 <Method void JsonParser.clearCurrentToken()>
	//*  17   35:aload_2         
	//*  18   36:areturn         
		{
			obj = ((Object) (createDeserializationContext(jsonparser)));
	//   19   37:aload_0         
	//   20   38:aload_1         
	//   21   39:invokevirtual   #153 <Method DefaultDeserializationContext createDeserializationContext(JsonParser)>
	//   22   42:astore_2        
			JsonDeserializer jsondeserializer = _findTreeDeserializer(((DeserializationContext) (obj)));
	//   23   43:aload_0         
	//   24   44:aload_2         
	//   25   45:invokevirtual   #220 <Method JsonDeserializer _findTreeDeserializer(DeserializationContext)>
	//   26   48:astore_3        
			if(_unwrapRoot)
	//*  27   49:aload_0         
	//*  28   50:getfield        #104 <Field boolean _unwrapRoot>
	//*  29   53:ifeq            73
				obj = ((Object) ((JsonNode)_unwrapAndDeserialize(jsonparser, ((DeserializationContext) (obj)), JSON_NODE_TYPE, jsondeserializer)));
	//   30   56:aload_0         
	//   31   57:aload_1         
	//   32   58:aload_2         
	//   33   59:getstatic       #51  <Field JavaType JSON_NODE_TYPE>
	//   34   62:aload_3         
	//   35   63:invokevirtual   #178 <Method Object _unwrapAndDeserialize(JsonParser, DeserializationContext, JavaType, JsonDeserializer)>
	//   36   66:checkcast       #43  <Class JsonNode>
	//   37   69:astore_2        
			else
	//*  38   70:goto            31
				obj = ((Object) ((JsonNode)jsondeserializer.deserialize(jsonparser, ((DeserializationContext) (obj)))));
	//   39   73:aload_3         
	//   40   74:aload_1         
	//   41   75:aload_2         
	//   42   76:invokevirtual   #182 <Method Object JsonDeserializer.deserialize(JsonParser, DeserializationContext)>
	//   43   79:checkcast       #43  <Class JsonNode>
	//   44   82:astore_2        
		}
		jsonparser.clearCurrentToken();
		return ((JsonNode) (obj));
	//*  45   83:goto            31
	}

	protected JsonParser _considerFilter(JsonParser jsonparser)
	{
		if(_filter == null || ((Class) (com/fasterxml/jackson/core/filter/FilteringParserDelegate)).isInstance(((Object) (jsonparser))))
	//*   0    0:aload_0         
	//*   1    1:getfield        #114 <Field TokenFilter _filter>
	//*   2    4:ifnull          16
	//*   3    7:ldc1            #224 <Class FilteringParserDelegate>
	//*   4    9:aload_1         
	//*   5   10:invokevirtual   #230 <Method boolean Class.isInstance(Object)>
	//*   6   13:ifeq            18
			return jsonparser;
	//    7   16:aload_1         
	//    8   17:areturn         
		else
			return ((JsonParser) (new FilteringParserDelegate(jsonparser, _filter, false, false)));
	//    9   18:new             #224 <Class FilteringParserDelegate>
	//   10   21:dup             
	//   11   22:aload_1         
	//   12   23:aload_0         
	//   13   24:getfield        #114 <Field TokenFilter _filter>
	//   14   27:iconst_0        
	//   15   28:iconst_0        
	//   16   29:invokespecial   #233 <Method void FilteringParserDelegate(JsonParser, TokenFilter, boolean, boolean)>
	//   17   32:areturn         
	}

	protected Object _detectBindAndClose(com.fasterxml.jackson.databind.deser.DataFormatReaders.Match match, boolean flag)
		throws IOException
	{
		if(!match.hasMatch())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #240 <Method boolean com.fasterxml.jackson.databind.deser.DataFormatReaders$Match.hasMatch()>
	//*   2    4:ifne            16
			_reportUnkownFormat(_dataFormatReaders, match);
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #112 <Field DataFormatReaders _dataFormatReaders>
	//    6   12:aload_1         
	//    7   13:invokevirtual   #244 <Method void _reportUnkownFormat(DataFormatReaders, com.fasterxml.jackson.databind.deser.DataFormatReaders$Match)>
		JsonParser jsonparser = match.createParserWithMatch();
	//    8   16:aload_1         
	//    9   17:invokevirtual   #248 <Method JsonParser com.fasterxml.jackson.databind.deser.DataFormatReaders$Match.createParserWithMatch()>
	//   10   20:astore_3        
		if(flag)
	//*  11   21:iload_2         
	//*  12   22:ifeq            33
			jsonparser.enable(com.fasterxml.jackson.core.JsonParser.Feature.AUTO_CLOSE_SOURCE);
	//   13   25:aload_3         
	//   14   26:getstatic       #254 <Field com.fasterxml.jackson.core.JsonParser$Feature com.fasterxml.jackson.core.JsonParser$Feature.AUTO_CLOSE_SOURCE>
	//   15   29:invokevirtual   #258 <Method JsonParser JsonParser.enable(com.fasterxml.jackson.core.JsonParser$Feature)>
	//   16   32:pop             
		return match.getReader()._bindAndClose(jsonparser);
	//   17   33:aload_1         
	//   18   34:invokevirtual   #262 <Method ObjectReader com.fasterxml.jackson.databind.deser.DataFormatReaders$Match.getReader()>
	//   19   37:aload_3         
	//   20   38:invokevirtual   #264 <Method Object _bindAndClose(JsonParser)>
	//   21   41:areturn         
	}

	protected Object _detectBindAndClose(byte abyte0[], int i, int j)
		throws IOException
	{
		abyte0 = ((byte []) (_dataFormatReaders.findFormat(abyte0, i, j)));
	//    0    0:aload_0         
	//    1    1:getfield        #112 <Field DataFormatReaders _dataFormatReaders>
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:iload_3         
	//    5    7:invokevirtual   #271 <Method com.fasterxml.jackson.databind.deser.DataFormatReaders$Match DataFormatReaders.findFormat(byte[], int, int)>
	//    6   10:astore_1        
		if(!((com.fasterxml.jackson.databind.deser.DataFormatReaders.Match) (abyte0)).hasMatch())
	//*   7   11:aload_1         
	//*   8   12:invokevirtual   #240 <Method boolean com.fasterxml.jackson.databind.deser.DataFormatReaders$Match.hasMatch()>
	//*   9   15:ifne            27
			_reportUnkownFormat(_dataFormatReaders, ((com.fasterxml.jackson.databind.deser.DataFormatReaders.Match) (abyte0)));
	//   10   18:aload_0         
	//   11   19:aload_0         
	//   12   20:getfield        #112 <Field DataFormatReaders _dataFormatReaders>
	//   13   23:aload_1         
	//   14   24:invokevirtual   #244 <Method void _reportUnkownFormat(DataFormatReaders, com.fasterxml.jackson.databind.deser.DataFormatReaders$Match)>
		JsonParser jsonparser = ((com.fasterxml.jackson.databind.deser.DataFormatReaders.Match) (abyte0)).createParserWithMatch();
	//   15   27:aload_1         
	//   16   28:invokevirtual   #248 <Method JsonParser com.fasterxml.jackson.databind.deser.DataFormatReaders$Match.createParserWithMatch()>
	//   17   31:astore          4
		return ((com.fasterxml.jackson.databind.deser.DataFormatReaders.Match) (abyte0)).getReader()._bindAndClose(jsonparser);
	//   18   33:aload_1         
	//   19   34:invokevirtual   #262 <Method ObjectReader com.fasterxml.jackson.databind.deser.DataFormatReaders$Match.getReader()>
	//   20   37:aload           4
	//   21   39:invokevirtual   #264 <Method Object _bindAndClose(JsonParser)>
	//   22   42:areturn         
	}

	protected JsonNode _detectBindAndCloseAsTree(InputStream inputstream)
		throws IOException
	{
		inputstream = ((InputStream) (_dataFormatReaders.findFormat(inputstream)));
	//    0    0:aload_0         
	//    1    1:getfield        #112 <Field DataFormatReaders _dataFormatReaders>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #276 <Method com.fasterxml.jackson.databind.deser.DataFormatReaders$Match DataFormatReaders.findFormat(InputStream)>
	//    4    8:astore_1        
		if(!((com.fasterxml.jackson.databind.deser.DataFormatReaders.Match) (inputstream)).hasMatch())
	//*   5    9:aload_1         
	//*   6   10:invokevirtual   #240 <Method boolean com.fasterxml.jackson.databind.deser.DataFormatReaders$Match.hasMatch()>
	//*   7   13:ifne            25
			_reportUnkownFormat(_dataFormatReaders, ((com.fasterxml.jackson.databind.deser.DataFormatReaders.Match) (inputstream)));
	//    8   16:aload_0         
	//    9   17:aload_0         
	//   10   18:getfield        #112 <Field DataFormatReaders _dataFormatReaders>
	//   11   21:aload_1         
	//   12   22:invokevirtual   #244 <Method void _reportUnkownFormat(DataFormatReaders, com.fasterxml.jackson.databind.deser.DataFormatReaders$Match)>
		JsonParser jsonparser = ((com.fasterxml.jackson.databind.deser.DataFormatReaders.Match) (inputstream)).createParserWithMatch();
	//   13   25:aload_1         
	//   14   26:invokevirtual   #248 <Method JsonParser com.fasterxml.jackson.databind.deser.DataFormatReaders$Match.createParserWithMatch()>
	//   15   29:astore_2        
		jsonparser.enable(com.fasterxml.jackson.core.JsonParser.Feature.AUTO_CLOSE_SOURCE);
	//   16   30:aload_2         
	//   17   31:getstatic       #254 <Field com.fasterxml.jackson.core.JsonParser$Feature com.fasterxml.jackson.core.JsonParser$Feature.AUTO_CLOSE_SOURCE>
	//   18   34:invokevirtual   #258 <Method JsonParser JsonParser.enable(com.fasterxml.jackson.core.JsonParser$Feature)>
	//   19   37:pop             
		return ((com.fasterxml.jackson.databind.deser.DataFormatReaders.Match) (inputstream)).getReader()._bindAndCloseAsTree(jsonparser);
	//   20   38:aload_1         
	//   21   39:invokevirtual   #262 <Method ObjectReader com.fasterxml.jackson.databind.deser.DataFormatReaders$Match.getReader()>
	//   22   42:aload_2         
	//   23   43:invokevirtual   #278 <Method JsonNode _bindAndCloseAsTree(JsonParser)>
	//   24   46:areturn         
	}

	protected MappingIterator _detectBindAndReadValues(com.fasterxml.jackson.databind.deser.DataFormatReaders.Match match, boolean flag)
		throws IOException, JsonProcessingException
	{
		if(!match.hasMatch())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #240 <Method boolean com.fasterxml.jackson.databind.deser.DataFormatReaders$Match.hasMatch()>
	//*   2    4:ifne            16
			_reportUnkownFormat(_dataFormatReaders, match);
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #112 <Field DataFormatReaders _dataFormatReaders>
	//    6   12:aload_1         
	//    7   13:invokevirtual   #244 <Method void _reportUnkownFormat(DataFormatReaders, com.fasterxml.jackson.databind.deser.DataFormatReaders$Match)>
		JsonParser jsonparser = match.createParserWithMatch();
	//    8   16:aload_1         
	//    9   17:invokevirtual   #248 <Method JsonParser com.fasterxml.jackson.databind.deser.DataFormatReaders$Match.createParserWithMatch()>
	//   10   20:astore_3        
		if(flag)
	//*  11   21:iload_2         
	//*  12   22:ifeq            33
			jsonparser.enable(com.fasterxml.jackson.core.JsonParser.Feature.AUTO_CLOSE_SOURCE);
	//   13   25:aload_3         
	//   14   26:getstatic       #254 <Field com.fasterxml.jackson.core.JsonParser$Feature com.fasterxml.jackson.core.JsonParser$Feature.AUTO_CLOSE_SOURCE>
	//   15   29:invokevirtual   #258 <Method JsonParser JsonParser.enable(com.fasterxml.jackson.core.JsonParser$Feature)>
	//   16   32:pop             
		return match.getReader()._bindAndReadValues(jsonparser);
	//   17   33:aload_1         
	//   18   34:invokevirtual   #262 <Method ObjectReader com.fasterxml.jackson.databind.deser.DataFormatReaders$Match.getReader()>
	//   19   37:aload_3         
	//   20   38:invokevirtual   #284 <Method MappingIterator _bindAndReadValues(JsonParser)>
	//   21   41:areturn         
	}

	protected JsonDeserializer _findRootDeserializer(DeserializationContext deserializationcontext)
		throws JsonMappingException
	{
		JsonDeserializer jsondeserializer;
		if(_rootDeserializer != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #110 <Field JsonDeserializer _rootDeserializer>
	//*   2    4:ifnull          14
		{
			jsondeserializer = _rootDeserializer;
	//    3    7:aload_0         
	//    4    8:getfield        #110 <Field JsonDeserializer _rootDeserializer>
	//    5   11:astore_2        
		} else
	//*   6   12:aload_2         
	//*   7   13:areturn         
		{
			JavaType javatype = _valueType;
	//    8   14:aload_0         
	//    9   15:getfield        #78  <Field JavaType _valueType>
	//   10   18:astore          4
			if(javatype == null)
	//*  11   20:aload           4
	//*  12   22:ifnonnull       33
				throw JsonMappingException.from(deserializationcontext, "No value type configured for ObjectReader");
	//   13   25:aload_1         
	//   14   26:ldc2            #289 <String "No value type configured for ObjectReader">
	//   15   29:invokestatic    #293 <Method JsonMappingException JsonMappingException.from(DeserializationContext, String)>
	//   16   32:athrow          
			JsonDeserializer jsondeserializer2 = (JsonDeserializer)_rootDeserializers.get(((Object) (javatype)));
	//   17   33:aload_0         
	//   18   34:getfield        #71  <Field ConcurrentHashMap _rootDeserializers>
	//   19   37:aload           4
	//   20   39:invokevirtual   #299 <Method Object ConcurrentHashMap.get(Object)>
	//   21   42:checkcast       #159 <Class JsonDeserializer>
	//   22   45:astore_3        
			jsondeserializer = jsondeserializer2;
	//   23   46:aload_3         
	//   24   47:astore_2        
			if(jsondeserializer2 == null)
	//*  25   48:aload_3         
	//*  26   49:ifnonnull       12
			{
				JsonDeserializer jsondeserializer1 = deserializationcontext.findRootValueDeserializer(javatype);
	//   27   52:aload_1         
	//   28   53:aload           4
	//   29   55:invokevirtual   #304 <Method JsonDeserializer DeserializationContext.findRootValueDeserializer(JavaType)>
	//   30   58:astore_2        
				if(jsondeserializer1 == null)
	//*  31   59:aload_2         
	//*  32   60:ifnonnull       89
				{
					throw JsonMappingException.from(deserializationcontext, (new StringBuilder()).append("Can not find a deserializer for type ").append(((Object) (javatype))).toString());
	//   33   63:aload_1         
	//   34   64:new             #306 <Class StringBuilder>
	//   35   67:dup             
	//   36   68:invokespecial   #307 <Method void StringBuilder()>
	//   37   71:ldc2            #309 <String "Can not find a deserializer for type ">
	//   38   74:invokevirtual   #313 <Method StringBuilder StringBuilder.append(String)>
	//   39   77:aload           4
	//   40   79:invokevirtual   #316 <Method StringBuilder StringBuilder.append(Object)>
	//   41   82:invokevirtual   #320 <Method String StringBuilder.toString()>
	//   42   85:invokestatic    #293 <Method JsonMappingException JsonMappingException.from(DeserializationContext, String)>
	//   43   88:athrow          
				} else
				{
					_rootDeserializers.put(((Object) (javatype)), ((Object) (jsondeserializer1)));
	//   44   89:aload_0         
	//   45   90:getfield        #71  <Field ConcurrentHashMap _rootDeserializers>
	//   46   93:aload           4
	//   47   95:aload_2         
	//   48   96:invokevirtual   #324 <Method Object ConcurrentHashMap.put(Object, Object)>
	//   49   99:pop             
					return jsondeserializer1;
	//   50  100:aload_2         
	//   51  101:areturn         
				}
			}
		}
		return jsondeserializer;
	}

	protected JsonDeserializer _findTreeDeserializer(DeserializationContext deserializationcontext)
		throws JsonMappingException
	{
		JsonDeserializer jsondeserializer1 = (JsonDeserializer)_rootDeserializers.get(((Object) (JSON_NODE_TYPE)));
	//    0    0:aload_0         
	//    1    1:getfield        #71  <Field ConcurrentHashMap _rootDeserializers>
	//    2    4:getstatic       #51  <Field JavaType JSON_NODE_TYPE>
	//    3    7:invokevirtual   #299 <Method Object ConcurrentHashMap.get(Object)>
	//    4   10:checkcast       #159 <Class JsonDeserializer>
	//    5   13:astore_3        
		JsonDeserializer jsondeserializer = jsondeserializer1;
	//    6   14:aload_3         
	//    7   15:astore_2        
		if(jsondeserializer1 == null)
	//*   8   16:aload_3         
	//*   9   17:ifnonnull       71
		{
			jsondeserializer = deserializationcontext.findRootValueDeserializer(JSON_NODE_TYPE);
	//   10   20:aload_1         
	//   11   21:getstatic       #51  <Field JavaType JSON_NODE_TYPE>
	//   12   24:invokevirtual   #304 <Method JsonDeserializer DeserializationContext.findRootValueDeserializer(JavaType)>
	//   13   27:astore_2        
			if(jsondeserializer == null)
	//*  14   28:aload_2         
	//*  15   29:ifnonnull       59
				throw JsonMappingException.from(deserializationcontext, (new StringBuilder()).append("Can not find a deserializer for type ").append(((Object) (JSON_NODE_TYPE))).toString());
	//   16   32:aload_1         
	//   17   33:new             #306 <Class StringBuilder>
	//   18   36:dup             
	//   19   37:invokespecial   #307 <Method void StringBuilder()>
	//   20   40:ldc2            #309 <String "Can not find a deserializer for type ">
	//   21   43:invokevirtual   #313 <Method StringBuilder StringBuilder.append(String)>
	//   22   46:getstatic       #51  <Field JavaType JSON_NODE_TYPE>
	//   23   49:invokevirtual   #316 <Method StringBuilder StringBuilder.append(Object)>
	//   24   52:invokevirtual   #320 <Method String StringBuilder.toString()>
	//   25   55:invokestatic    #293 <Method JsonMappingException JsonMappingException.from(DeserializationContext, String)>
	//   26   58:athrow          
			_rootDeserializers.put(((Object) (JSON_NODE_TYPE)), ((Object) (jsondeserializer)));
	//   27   59:aload_0         
	//   28   60:getfield        #71  <Field ConcurrentHashMap _rootDeserializers>
	//   29   63:getstatic       #51  <Field JavaType JSON_NODE_TYPE>
	//   30   66:aload_2         
	//   31   67:invokevirtual   #324 <Method Object ConcurrentHashMap.put(Object, Object)>
	//   32   70:pop             
		}
		return jsondeserializer;
	//   33   71:aload_2         
	//   34   72:areturn         
	}

	protected void _initForMultiRead(JsonParser jsonparser)
		throws IOException
	{
		if(_schema != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #95  <Field FormatSchema _schema>
	//*   2    4:ifnull          15
			jsonparser.setSchema(_schema);
	//    3    7:aload_1         
	//    4    8:aload_0         
	//    5    9:getfield        #95  <Field FormatSchema _schema>
	//    6   12:invokevirtual   #329 <Method void JsonParser.setSchema(FormatSchema)>
		_config.initialize(jsonparser);
	//    7   15:aload_0         
	//    8   16:getfield        #61  <Field DeserializationConfig _config>
	//    9   19:aload_1         
	//   10   20:invokevirtual   #332 <Method void DeserializationConfig.initialize(JsonParser)>
	//   11   23:return          
	}

	protected JsonToken _initForReading(JsonParser jsonparser)
		throws IOException
	{
		if(_schema != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #95  <Field FormatSchema _schema>
	//*   2    4:ifnull          15
			jsonparser.setSchema(_schema);
	//    3    7:aload_1         
	//    4    8:aload_0         
	//    5    9:getfield        #95  <Field FormatSchema _schema>
	//    6   12:invokevirtual   #329 <Method void JsonParser.setSchema(FormatSchema)>
		_config.initialize(jsonparser);
	//    7   15:aload_0         
	//    8   16:getfield        #61  <Field DeserializationConfig _config>
	//    9   19:aload_1         
	//   10   20:invokevirtual   #332 <Method void DeserializationConfig.initialize(JsonParser)>
		JsonToken jsontoken1 = jsonparser.getCurrentToken();
	//   11   23:aload_1         
	//   12   24:invokevirtual   #335 <Method JsonToken JsonParser.getCurrentToken()>
	//   13   27:astore_3        
		JsonToken jsontoken = jsontoken1;
	//   14   28:aload_3         
	//   15   29:astore_2        
		if(jsontoken1 == null)
	//*  16   30:aload_3         
	//*  17   31:ifnonnull       53
		{
			JsonToken jsontoken2 = jsonparser.nextToken();
	//   18   34:aload_1         
	//   19   35:invokevirtual   #206 <Method JsonToken JsonParser.nextToken()>
	//   20   38:astore_3        
			jsontoken = jsontoken2;
	//   21   39:aload_3         
	//   22   40:astore_2        
			if(jsontoken2 == null)
	//*  23   41:aload_3         
	//*  24   42:ifnonnull       53
				throw JsonMappingException.from(jsonparser, "No content to map due to end-of-input");
	//   25   45:aload_1         
	//   26   46:ldc2            #337 <String "No content to map due to end-of-input">
	//   27   49:invokestatic    #340 <Method JsonMappingException JsonMappingException.from(JsonParser, String)>
	//   28   52:athrow          
		}
		return jsontoken;
	//   29   53:aload_2         
	//   30   54:areturn         
	}

	protected InputStream _inputStream(File file)
		throws IOException
	{
		return ((InputStream) (new FileInputStream(file)));
	//    0    0:new             #344 <Class FileInputStream>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #347 <Method void FileInputStream(File)>
	//    4    8:areturn         
	}

	protected InputStream _inputStream(URL url)
		throws IOException
	{
		return url.openStream();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #354 <Method InputStream URL.openStream()>
	//    2    4:areturn         
	}

	protected ObjectReader _new(ObjectReader objectreader, JsonFactory jsonfactory)
	{
		return new ObjectReader(objectreader, jsonfactory);
	//    0    0:new             #2   <Class ObjectReader>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokespecial   #358 <Method void ObjectReader(ObjectReader, JsonFactory)>
	//    5    9:areturn         
	}

	protected ObjectReader _new(ObjectReader objectreader, DeserializationConfig deserializationconfig)
	{
		return new ObjectReader(objectreader, deserializationconfig);
	//    0    0:new             #2   <Class ObjectReader>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokespecial   #361 <Method void ObjectReader(ObjectReader, DeserializationConfig)>
	//    5    9:areturn         
	}

	protected ObjectReader _new(ObjectReader objectreader, DeserializationConfig deserializationconfig, JavaType javatype, JsonDeserializer jsondeserializer, Object obj, FormatSchema formatschema, InjectableValues injectablevalues, 
			DataFormatReaders dataformatreaders)
	{
		return new ObjectReader(objectreader, deserializationconfig, javatype, jsondeserializer, obj, formatschema, injectablevalues, dataformatreaders);
	//    0    0:new             #2   <Class ObjectReader>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:aload           4
	//    6    9:aload           5
	//    7   11:aload           6
	//    8   13:aload           7
	//    9   15:aload           8
	//   10   17:invokespecial   #364 <Method void ObjectReader(ObjectReader, DeserializationConfig, JavaType, JsonDeserializer, Object, FormatSchema, InjectableValues, DataFormatReaders)>
	//   11   20:areturn         
	}

	protected MappingIterator _newIterator(JsonParser jsonparser, DeserializationContext deserializationcontext, JsonDeserializer jsondeserializer, boolean flag)
	{
		return new MappingIterator(_valueType, jsonparser, deserializationcontext, jsondeserializer, flag, _valueToUpdate);
	//    0    0:new             #367 <Class MappingIterator>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #78  <Field JavaType _valueType>
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:aload_3         
	//    7   11:iload           4
	//    8   13:aload_0         
	//    9   14:getfield        #80  <Field Object _valueToUpdate>
	//   10   17:invokespecial   #370 <Method void MappingIterator(JavaType, JsonParser, DeserializationContext, JsonDeserializer, boolean, Object)>
	//   11   20:areturn         
	}

	protected JsonDeserializer _prefetchRootDeserializer(JavaType javatype)
	{
		JsonDeserializer jsondeserializer;
		JsonDeserializer jsondeserializer1;
		jsondeserializer1 = null;
	//    0    0:aconst_null     
	//    1    1:astore_3        
		jsondeserializer = jsondeserializer1;
	//    2    2:aload_3         
	//    3    3:astore_2        
		if(javatype == null) goto _L2; else goto _L1
	//    4    4:aload_1         
	//    5    5:ifnull          23
_L1:
		if(_config.isEnabled(DeserializationFeature.EAGER_DESERIALIZER_FETCH)) goto _L4; else goto _L3
	//    6    8:aload_0         
	//    7    9:getfield        #61  <Field DeserializationConfig _config>
	//    8   12:getstatic       #377 <Field DeserializationFeature DeserializationFeature.EAGER_DESERIALIZER_FETCH>
	//    9   15:invokevirtual   #381 <Method boolean DeserializationConfig.isEnabled(DeserializationFeature)>
	//   10   18:ifne            25
_L3:
		jsondeserializer = jsondeserializer1;
	//   11   21:aload_3         
	//   12   22:astore_2        
_L2:
		return jsondeserializer;
	//   13   23:aload_2         
	//   14   24:areturn         
_L4:
		jsondeserializer1 = (JsonDeserializer)_rootDeserializers.get(((Object) (javatype)));
	//   15   25:aload_0         
	//   16   26:getfield        #71  <Field ConcurrentHashMap _rootDeserializers>
	//   17   29:aload_1         
	//   18   30:invokevirtual   #299 <Method Object ConcurrentHashMap.get(Object)>
	//   19   33:checkcast       #159 <Class JsonDeserializer>
	//   20   36:astore_3        
		jsondeserializer = jsondeserializer1;
	//   21   37:aload_3         
	//   22   38:astore_2        
		if(jsondeserializer1 != null) goto _L2; else goto _L5
	//   23   39:aload_3         
	//   24   40:ifnonnull       23
_L5:
		jsondeserializer = jsondeserializer1;
	//   25   43:aload_3         
	//   26   44:astore_2        
		try
		{
			jsondeserializer1 = ((DeserializationContext) (createDeserializationContext(((JsonParser) (null))))).findRootValueDeserializer(javatype);
	//   27   45:aload_0         
	//   28   46:aconst_null     
	//   29   47:invokevirtual   #153 <Method DefaultDeserializationContext createDeserializationContext(JsonParser)>
	//   30   50:aload_1         
	//   31   51:invokevirtual   #304 <Method JsonDeserializer DeserializationContext.findRootValueDeserializer(JavaType)>
	//   32   54:astore_3        
		}
	//*  33   55:aload_3         
	//*  34   56:astore_2        
	//*  35   57:aload_3         
	//*  36   58:ifnull          23
	//*  37   61:aload_3         
	//*  38   62:astore_2        
	//*  39   63:aload_0         
	//*  40   64:getfield        #71  <Field ConcurrentHashMap _rootDeserializers>
	//*  41   67:aload_1         
	//*  42   68:aload_3         
	//*  43   69:invokevirtual   #324 <Method Object ConcurrentHashMap.put(Object, Object)>
	//*  44   72:pop             
	//*  45   73:aload_3         
	//*  46   74:areturn         
		// Misplaced declaration of an exception variable
		catch(JavaType javatype)
	//*  47   75:astore_1        
		{
			return jsondeserializer;
	//   48   76:aload_2         
	//   49   77:areturn         
		}
		jsondeserializer = jsondeserializer1;
		if(jsondeserializer1 == null) goto _L2; else goto _L6
_L6:
		jsondeserializer = jsondeserializer1;
		_rootDeserializers.put(((Object) (javatype)), ((Object) (jsondeserializer1)));
		return jsondeserializer1;
	}

	protected void _reportUndetectableSource(Object obj)
		throws JsonProcessingException
	{
		throw new JsonParseException(((JsonParser) (null)), (new StringBuilder()).append("Can not use source of type ").append(obj.getClass().getName()).append(" with format auto-detection: must be byte- not char-based").toString());
	//    0    0:new             #386 <Class JsonParseException>
	//    1    3:dup             
	//    2    4:aconst_null     
	//    3    5:new             #306 <Class StringBuilder>
	//    4    8:dup             
	//    5    9:invokespecial   #307 <Method void StringBuilder()>
	//    6   12:ldc2            #388 <String "Can not use source of type ">
	//    7   15:invokevirtual   #313 <Method StringBuilder StringBuilder.append(String)>
	//    8   18:aload_1         
	//    9   19:invokevirtual   #394 <Method Class Object.getClass()>
	//   10   22:invokevirtual   #397 <Method String Class.getName()>
	//   11   25:invokevirtual   #313 <Method StringBuilder StringBuilder.append(String)>
	//   12   28:ldc2            #399 <String " with format auto-detection: must be byte- not char-based">
	//   13   31:invokevirtual   #313 <Method StringBuilder StringBuilder.append(String)>
	//   14   34:invokevirtual   #320 <Method String StringBuilder.toString()>
	//   15   37:invokespecial   #402 <Method void JsonParseException(JsonParser, String)>
	//   16   40:athrow          
	}

	protected void _reportUnkownFormat(DataFormatReaders dataformatreaders, com.fasterxml.jackson.databind.deser.DataFormatReaders.Match match)
		throws JsonProcessingException
	{
		throw new JsonParseException(((JsonParser) (null)), (new StringBuilder()).append("Can not detect format from input, does not look like any of detectable formats ").append(dataformatreaders.toString()).toString());
	//    0    0:new             #386 <Class JsonParseException>
	//    1    3:dup             
	//    2    4:aconst_null     
	//    3    5:new             #306 <Class StringBuilder>
	//    4    8:dup             
	//    5    9:invokespecial   #307 <Method void StringBuilder()>
	//    6   12:ldc2            #404 <String "Can not detect format from input, does not look like any of detectable formats ">
	//    7   15:invokevirtual   #313 <Method StringBuilder StringBuilder.append(String)>
	//    8   18:aload_1         
	//    9   19:invokevirtual   #405 <Method String DataFormatReaders.toString()>
	//   10   22:invokevirtual   #313 <Method StringBuilder StringBuilder.append(String)>
	//   11   25:invokevirtual   #320 <Method String StringBuilder.toString()>
	//   12   28:invokespecial   #402 <Method void JsonParseException(JsonParser, String)>
	//   13   31:athrow          
	}

	protected Object _unwrapAndDeserialize(JsonParser jsonparser, DeserializationContext deserializationcontext, JavaType javatype, JsonDeserializer jsondeserializer)
		throws IOException
	{
		String s = _config.findRootName(javatype).getSimpleName();
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field DeserializationConfig _config>
	//    2    4:aload_3         
	//    3    5:invokevirtual   #409 <Method PropertyName DeserializationConfig.findRootName(JavaType)>
	//    4    8:invokevirtual   #414 <Method String PropertyName.getSimpleName()>
	//    5   11:astore          5
		if(jsonparser.getCurrentToken() != JsonToken.START_OBJECT)
	//*   6   13:aload_1         
	//*   7   14:invokevirtual   #335 <Method JsonToken JsonParser.getCurrentToken()>
	//*   8   17:getstatic       #417 <Field JsonToken JsonToken.START_OBJECT>
	//*   9   20:if_acmpeq       62
			throw JsonMappingException.from(jsonparser, (new StringBuilder()).append("Current token not START_OBJECT (needed to unwrap root name '").append(s).append("'), but ").append(((Object) (jsonparser.getCurrentToken()))).toString());
	//   10   23:aload_1         
	//   11   24:new             #306 <Class StringBuilder>
	//   12   27:dup             
	//   13   28:invokespecial   #307 <Method void StringBuilder()>
	//   14   31:ldc2            #419 <String "Current token not START_OBJECT (needed to unwrap root name '">
	//   15   34:invokevirtual   #313 <Method StringBuilder StringBuilder.append(String)>
	//   16   37:aload           5
	//   17   39:invokevirtual   #313 <Method StringBuilder StringBuilder.append(String)>
	//   18   42:ldc2            #421 <String "'), but ">
	//   19   45:invokevirtual   #313 <Method StringBuilder StringBuilder.append(String)>
	//   20   48:aload_1         
	//   21   49:invokevirtual   #335 <Method JsonToken JsonParser.getCurrentToken()>
	//   22   52:invokevirtual   #316 <Method StringBuilder StringBuilder.append(Object)>
	//   23   55:invokevirtual   #320 <Method String StringBuilder.toString()>
	//   24   58:invokestatic    #340 <Method JsonMappingException JsonMappingException.from(JsonParser, String)>
	//   25   61:athrow          
		if(jsonparser.nextToken() != JsonToken.FIELD_NAME)
	//*  26   62:aload_1         
	//*  27   63:invokevirtual   #206 <Method JsonToken JsonParser.nextToken()>
	//*  28   66:getstatic       #424 <Field JsonToken JsonToken.FIELD_NAME>
	//*  29   69:if_acmpeq       111
			throw JsonMappingException.from(jsonparser, (new StringBuilder()).append("Current token not FIELD_NAME (to contain expected root name '").append(s).append("'), but ").append(((Object) (jsonparser.getCurrentToken()))).toString());
	//   30   72:aload_1         
	//   31   73:new             #306 <Class StringBuilder>
	//   32   76:dup             
	//   33   77:invokespecial   #307 <Method void StringBuilder()>
	//   34   80:ldc2            #426 <String "Current token not FIELD_NAME (to contain expected root name '">
	//   35   83:invokevirtual   #313 <Method StringBuilder StringBuilder.append(String)>
	//   36   86:aload           5
	//   37   88:invokevirtual   #313 <Method StringBuilder StringBuilder.append(String)>
	//   38   91:ldc2            #421 <String "'), but ">
	//   39   94:invokevirtual   #313 <Method StringBuilder StringBuilder.append(String)>
	//   40   97:aload_1         
	//   41   98:invokevirtual   #335 <Method JsonToken JsonParser.getCurrentToken()>
	//   42  101:invokevirtual   #316 <Method StringBuilder StringBuilder.append(Object)>
	//   43  104:invokevirtual   #320 <Method String StringBuilder.toString()>
	//   44  107:invokestatic    #340 <Method JsonMappingException JsonMappingException.from(JsonParser, String)>
	//   45  110:athrow          
		String s1 = jsonparser.getCurrentName();
	//   46  111:aload_1         
	//   47  112:invokevirtual   #429 <Method String JsonParser.getCurrentName()>
	//   48  115:astore          6
		if(!s.equals(((Object) (s1))))
	//*  49  117:aload           5
	//*  50  119:aload           6
	//*  51  121:invokevirtual   #434 <Method boolean String.equals(Object)>
	//*  52  124:ifne            174
			throw JsonMappingException.from(jsonparser, (new StringBuilder()).append("Root name '").append(s1).append("' does not match expected ('").append(s).append("') for type ").append(((Object) (javatype))).toString());
	//   53  127:aload_1         
	//   54  128:new             #306 <Class StringBuilder>
	//   55  131:dup             
	//   56  132:invokespecial   #307 <Method void StringBuilder()>
	//   57  135:ldc2            #436 <String "Root name '">
	//   58  138:invokevirtual   #313 <Method StringBuilder StringBuilder.append(String)>
	//   59  141:aload           6
	//   60  143:invokevirtual   #313 <Method StringBuilder StringBuilder.append(String)>
	//   61  146:ldc2            #438 <String "' does not match expected ('">
	//   62  149:invokevirtual   #313 <Method StringBuilder StringBuilder.append(String)>
	//   63  152:aload           5
	//   64  154:invokevirtual   #313 <Method StringBuilder StringBuilder.append(String)>
	//   65  157:ldc2            #440 <String "') for type ">
	//   66  160:invokevirtual   #313 <Method StringBuilder StringBuilder.append(String)>
	//   67  163:aload_3         
	//   68  164:invokevirtual   #316 <Method StringBuilder StringBuilder.append(Object)>
	//   69  167:invokevirtual   #320 <Method String StringBuilder.toString()>
	//   70  170:invokestatic    #340 <Method JsonMappingException JsonMappingException.from(JsonParser, String)>
	//   71  173:athrow          
		jsonparser.nextToken();
	//   72  174:aload_1         
	//   73  175:invokevirtual   #206 <Method JsonToken JsonParser.nextToken()>
	//   74  178:pop             
		if(_valueToUpdate == null)
	//*  75  179:aload_0         
	//*  76  180:getfield        #80  <Field Object _valueToUpdate>
	//*  77  183:ifnonnull       243
		{
			deserializationcontext = ((DeserializationContext) (jsondeserializer.deserialize(jsonparser, deserializationcontext)));
	//   78  186:aload           4
	//   79  188:aload_1         
	//   80  189:aload_2         
	//   81  190:invokevirtual   #182 <Method Object JsonDeserializer.deserialize(JsonParser, DeserializationContext)>
	//   82  193:astore_2        
		} else
	//*  83  194:aload_1         
	//*  84  195:invokevirtual   #206 <Method JsonToken JsonParser.nextToken()>
	//*  85  198:getstatic       #174 <Field JsonToken JsonToken.END_OBJECT>
	//*  86  201:if_acmpeq       263
	//*  87  204:aload_1         
	//*  88  205:new             #306 <Class StringBuilder>
	//*  89  208:dup             
	//*  90  209:invokespecial   #307 <Method void StringBuilder()>
	//*  91  212:ldc2            #442 <String "Current token not END_OBJECT (to match wrapper object with root name '">
	//*  92  215:invokevirtual   #313 <Method StringBuilder StringBuilder.append(String)>
	//*  93  218:aload           5
	//*  94  220:invokevirtual   #313 <Method StringBuilder StringBuilder.append(String)>
	//*  95  223:ldc2            #421 <String "'), but ">
	//*  96  226:invokevirtual   #313 <Method StringBuilder StringBuilder.append(String)>
	//*  97  229:aload_1         
	//*  98  230:invokevirtual   #335 <Method JsonToken JsonParser.getCurrentToken()>
	//*  99  233:invokevirtual   #316 <Method StringBuilder StringBuilder.append(Object)>
	//* 100  236:invokevirtual   #320 <Method String StringBuilder.toString()>
	//* 101  239:invokestatic    #340 <Method JsonMappingException JsonMappingException.from(JsonParser, String)>
	//* 102  242:athrow          
		{
			jsondeserializer.deserialize(jsonparser, deserializationcontext, _valueToUpdate);
	//  103  243:aload           4
	//  104  245:aload_1         
	//  105  246:aload_2         
	//  106  247:aload_0         
	//  107  248:getfield        #80  <Field Object _valueToUpdate>
	//  108  251:invokevirtual   #185 <Method Object JsonDeserializer.deserialize(JsonParser, DeserializationContext, Object)>
	//  109  254:pop             
			deserializationcontext = ((DeserializationContext) (_valueToUpdate));
	//  110  255:aload_0         
	//  111  256:getfield        #80  <Field Object _valueToUpdate>
	//  112  259:astore_2        
		}
		if(jsonparser.nextToken() != JsonToken.END_OBJECT)
			throw JsonMappingException.from(jsonparser, (new StringBuilder()).append("Current token not END_OBJECT (to match wrapper object with root name '").append(s).append("'), but ").append(((Object) (jsonparser.getCurrentToken()))).toString());
		else
	//* 113  260:goto            194
			return ((Object) (deserializationcontext));
	//  114  263:aload_2         
	//  115  264:areturn         
	}

	protected void _verifySchemaType(FormatSchema formatschema)
	{
		if(formatschema != null && !_parserFactory.canUseSchema(formatschema))
	//*   0    0:aload_1         
	//*   1    1:ifnull          65
	//*   2    4:aload_0         
	//*   3    5:getfield        #76  <Field JsonFactory _parserFactory>
	//*   4    8:aload_1         
	//*   5    9:invokevirtual   #448 <Method boolean JsonFactory.canUseSchema(FormatSchema)>
	//*   6   12:ifne            65
			throw new IllegalArgumentException((new StringBuilder()).append("Can not use FormatSchema of type ").append(((Object) (formatschema)).getClass().getName()).append(" for format ").append(_parserFactory.getFormatName()).toString());
	//    7   15:new             #88  <Class IllegalArgumentException>
	//    8   18:dup             
	//    9   19:new             #306 <Class StringBuilder>
	//   10   22:dup             
	//   11   23:invokespecial   #307 <Method void StringBuilder()>
	//   12   26:ldc2            #450 <String "Can not use FormatSchema of type ">
	//   13   29:invokevirtual   #313 <Method StringBuilder StringBuilder.append(String)>
	//   14   32:aload_1         
	//   15   33:invokevirtual   #394 <Method Class Object.getClass()>
	//   16   36:invokevirtual   #397 <Method String Class.getName()>
	//   17   39:invokevirtual   #313 <Method StringBuilder StringBuilder.append(String)>
	//   18   42:ldc2            #452 <String " for format ">
	//   19   45:invokevirtual   #313 <Method StringBuilder StringBuilder.append(String)>
	//   20   48:aload_0         
	//   21   49:getfield        #76  <Field JsonFactory _parserFactory>
	//   22   52:invokevirtual   #455 <Method String JsonFactory.getFormatName()>
	//   23   55:invokevirtual   #313 <Method StringBuilder StringBuilder.append(String)>
	//   24   58:invokevirtual   #320 <Method String StringBuilder.toString()>
	//   25   61:invokespecial   #93  <Method void IllegalArgumentException(String)>
	//   26   64:athrow          
		else
			return;
	//   27   65:return          
	}

	protected ObjectReader _with(DeserializationConfig deserializationconfig)
	{
		if(deserializationconfig == _config)
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #61  <Field DeserializationConfig _config>
	//*   3    5:if_acmpne       10
			return this;
	//    4    8:aload_0         
	//    5    9:areturn         
		ObjectReader objectreader1 = _new(this, deserializationconfig);
	//    6   10:aload_0         
	//    7   11:aload_0         
	//    8   12:aload_1         
	//    9   13:invokevirtual   #459 <Method ObjectReader _new(ObjectReader, DeserializationConfig)>
	//   10   16:astore_3        
		ObjectReader objectreader = objectreader1;
	//   11   17:aload_3         
	//   12   18:astore_2        
		if(_dataFormatReaders != null)
	//*  13   19:aload_0         
	//*  14   20:getfield        #112 <Field DataFormatReaders _dataFormatReaders>
	//*  15   23:ifnull          39
			objectreader = objectreader1.withFormatDetection(_dataFormatReaders.with(deserializationconfig));
	//   16   26:aload_3         
	//   17   27:aload_0         
	//   18   28:getfield        #112 <Field DataFormatReaders _dataFormatReaders>
	//   19   31:aload_1         
	//   20   32:invokevirtual   #462 <Method DataFormatReaders DataFormatReaders.with(DeserializationConfig)>
	//   21   35:invokevirtual   #466 <Method ObjectReader withFormatDetection(DataFormatReaders)>
	//   22   38:astore_2        
		return objectreader;
	//   23   39:aload_2         
	//   24   40:areturn         
	}

	public ObjectReader at(JsonPointer jsonpointer)
	{
		return new ObjectReader(this, ((TokenFilter) (new JsonPointerBasedFilter(jsonpointer))));
	//    0    0:new             #2   <Class ObjectReader>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:new             #470 <Class JsonPointerBasedFilter>
	//    4    8:dup             
	//    5    9:aload_1         
	//    6   10:invokespecial   #473 <Method void JsonPointerBasedFilter(JsonPointer)>
	//    7   13:invokespecial   #475 <Method void ObjectReader(ObjectReader, TokenFilter)>
	//    8   16:areturn         
	}

	public ObjectReader at(String s)
	{
		return new ObjectReader(this, ((TokenFilter) (new JsonPointerBasedFilter(s))));
	//    0    0:new             #2   <Class ObjectReader>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:new             #470 <Class JsonPointerBasedFilter>
	//    4    8:dup             
	//    5    9:aload_1         
	//    6   10:invokespecial   #477 <Method void JsonPointerBasedFilter(String)>
	//    7   13:invokespecial   #475 <Method void ObjectReader(ObjectReader, TokenFilter)>
	//    8   16:areturn         
	}

	public volatile TreeNode createArrayNode()
	{
		return ((TreeNode) (createArrayNode()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #482 <Method JsonNode createArrayNode()>
	//    2    4:areturn         
	}

	public JsonNode createArrayNode()
	{
		return ((JsonNode) (_config.getNodeFactory().arrayNode()));
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field DeserializationConfig _config>
	//    2    4:invokevirtual   #486 <Method JsonNodeFactory DeserializationConfig.getNodeFactory()>
	//    3    7:invokevirtual   #492 <Method com.fasterxml.jackson.databind.node.ArrayNode JsonNodeFactory.arrayNode()>
	//    4   10:areturn         
	}

	protected DefaultDeserializationContext createDeserializationContext(JsonParser jsonparser)
	{
		return _context.createInstance(_config, jsonparser, _injectableValues);
	//    0    0:aload_0         
	//    1    1:getfield        #68  <Field DefaultDeserializationContext _context>
	//    2    4:aload_0         
	//    3    5:getfield        #61  <Field DeserializationConfig _config>
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #97  <Field InjectableValues _injectableValues>
	//    7   13:invokevirtual   #498 <Method DefaultDeserializationContext DefaultDeserializationContext.createInstance(DeserializationConfig, JsonParser, InjectableValues)>
	//    8   16:areturn         
	}

	public volatile TreeNode createObjectNode()
	{
		return ((TreeNode) (createObjectNode()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #501 <Method JsonNode createObjectNode()>
	//    2    4:areturn         
	}

	public JsonNode createObjectNode()
	{
		return ((JsonNode) (_config.getNodeFactory().objectNode()));
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field DeserializationConfig _config>
	//    2    4:invokevirtual   #486 <Method JsonNodeFactory DeserializationConfig.getNodeFactory()>
	//    3    7:invokevirtual   #505 <Method com.fasterxml.jackson.databind.node.ObjectNode JsonNodeFactory.objectNode()>
	//    4   10:areturn         
	}

	public ObjectReader forType(TypeReference typereference)
	{
		return forType(_config.getTypeFactory().constructType(typereference.getType()));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #61  <Field DeserializationConfig _config>
	//    3    5:invokevirtual   #511 <Method TypeFactory DeserializationConfig.getTypeFactory()>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #517 <Method Type TypeReference.getType()>
	//    6   12:invokevirtual   #523 <Method JavaType TypeFactory.constructType(Type)>
	//    7   15:invokevirtual   #526 <Method ObjectReader forType(JavaType)>
	//    8   18:areturn         
	}

	public ObjectReader forType(JavaType javatype)
	{
		if(javatype != null && javatype.equals(((Object) (_valueType))))
	//*   0    0:aload_1         
	//*   1    1:ifnull          17
	//*   2    4:aload_1         
	//*   3    5:aload_0         
	//*   4    6:getfield        #78  <Field JavaType _valueType>
	//*   5    9:invokevirtual   #528 <Method boolean JavaType.equals(Object)>
	//*   6   12:ifeq            17
			return this;
	//    7   15:aload_0         
	//    8   16:areturn         
		JsonDeserializer jsondeserializer = _prefetchRootDeserializer(javatype);
	//    9   17:aload_0         
	//   10   18:aload_1         
	//   11   19:invokevirtual   #108 <Method JsonDeserializer _prefetchRootDeserializer(JavaType)>
	//   12   22:astore          4
		DataFormatReaders dataformatreaders1 = _dataFormatReaders;
	//   13   24:aload_0         
	//   14   25:getfield        #112 <Field DataFormatReaders _dataFormatReaders>
	//   15   28:astore_3        
		DataFormatReaders dataformatreaders = dataformatreaders1;
	//   16   29:aload_3         
	//   17   30:astore_2        
		if(dataformatreaders1 != null)
	//*  18   31:aload_3         
	//*  19   32:ifnull          41
			dataformatreaders = dataformatreaders1.withType(javatype);
	//   20   35:aload_3         
	//   21   36:aload_1         
	//   22   37:invokevirtual   #532 <Method DataFormatReaders DataFormatReaders.withType(JavaType)>
	//   23   40:astore_2        
		return _new(this, _config, javatype, jsondeserializer, _valueToUpdate, _schema, _injectableValues, dataformatreaders);
	//   24   41:aload_0         
	//   25   42:aload_0         
	//   26   43:aload_0         
	//   27   44:getfield        #61  <Field DeserializationConfig _config>
	//   28   47:aload_1         
	//   29   48:aload           4
	//   30   50:aload_0         
	//   31   51:getfield        #80  <Field Object _valueToUpdate>
	//   32   54:aload_0         
	//   33   55:getfield        #95  <Field FormatSchema _schema>
	//   34   58:aload_0         
	//   35   59:getfield        #97  <Field InjectableValues _injectableValues>
	//   36   62:aload_2         
	//   37   63:invokevirtual   #534 <Method ObjectReader _new(ObjectReader, DeserializationConfig, JavaType, JsonDeserializer, Object, FormatSchema, InjectableValues, DataFormatReaders)>
	//   38   66:areturn         
	}

	public ObjectReader forType(Class class1)
	{
		return forType(_config.constructType(class1));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #61  <Field DeserializationConfig _config>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #538 <Method JavaType DeserializationConfig.constructType(Class)>
	//    5    9:invokevirtual   #526 <Method ObjectReader forType(JavaType)>
	//    6   12:areturn         
	}

	public ContextAttributes getAttributes()
	{
		return _config.getAttributes();
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field DeserializationConfig _config>
	//    2    4:invokevirtual   #543 <Method ContextAttributes DeserializationConfig.getAttributes()>
	//    3    7:areturn         
	}

	public DeserializationConfig getConfig()
	{
		return _config;
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field DeserializationConfig _config>
	//    2    4:areturn         
	}

	public JsonFactory getFactory()
	{
		return _parserFactory;
	//    0    0:aload_0         
	//    1    1:getfield        #76  <Field JsonFactory _parserFactory>
	//    2    4:areturn         
	}

	public InjectableValues getInjectableValues()
	{
		return _injectableValues;
	//    0    0:aload_0         
	//    1    1:getfield        #97  <Field InjectableValues _injectableValues>
	//    2    4:areturn         
	}

	public TypeFactory getTypeFactory()
	{
		return _config.getTypeFactory();
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field DeserializationConfig _config>
	//    2    4:invokevirtual   #511 <Method TypeFactory DeserializationConfig.getTypeFactory()>
	//    3    7:areturn         
	}

	public boolean isEnabled(com.fasterxml.jackson.core.JsonParser.Feature feature)
	{
		return _parserFactory.isEnabled(feature);
	//    0    0:aload_0         
	//    1    1:getfield        #76  <Field JsonFactory _parserFactory>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #552 <Method boolean JsonFactory.isEnabled(com.fasterxml.jackson.core.JsonParser$Feature)>
	//    4    8:ireturn         
	}

	public boolean isEnabled(DeserializationFeature deserializationfeature)
	{
		return _config.isEnabled(deserializationfeature);
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field DeserializationConfig _config>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #381 <Method boolean DeserializationConfig.isEnabled(DeserializationFeature)>
	//    4    8:ireturn         
	}

	public boolean isEnabled(MapperFeature mapperfeature)
	{
		return _config.isEnabled(mapperfeature);
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field DeserializationConfig _config>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #555 <Method boolean DeserializationConfig.isEnabled(MapperFeature)>
	//    4    8:ireturn         
	}

	public TreeNode readTree(JsonParser jsonparser)
		throws IOException
	{
		return ((TreeNode) (_bindAsTree(jsonparser)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #196 <Method JsonNode _bindAsTree(JsonParser)>
	//    3    5:areturn         
	}

	public JsonNode readTree(InputStream inputstream)
		throws IOException, JsonProcessingException
	{
		if(_dataFormatReaders != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #112 <Field DataFormatReaders _dataFormatReaders>
	//*   2    4:ifnull          13
			return _detectBindAndCloseAsTree(inputstream);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokevirtual   #560 <Method JsonNode _detectBindAndCloseAsTree(InputStream)>
	//    6   12:areturn         
		else
			return _bindAndCloseAsTree(_considerFilter(_parserFactory.createParser(inputstream)));
	//    7   13:aload_0         
	//    8   14:aload_0         
	//    9   15:aload_0         
	//   10   16:getfield        #76  <Field JsonFactory _parserFactory>
	//   11   19:aload_1         
	//   12   20:invokevirtual   #564 <Method JsonParser JsonFactory.createParser(InputStream)>
	//   13   23:invokevirtual   #566 <Method JsonParser _considerFilter(JsonParser)>
	//   14   26:invokevirtual   #278 <Method JsonNode _bindAndCloseAsTree(JsonParser)>
	//   15   29:areturn         
	}

	public JsonNode readTree(Reader reader)
		throws IOException, JsonProcessingException
	{
		if(_dataFormatReaders != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #112 <Field DataFormatReaders _dataFormatReaders>
	//*   2    4:ifnull          12
			_reportUndetectableSource(((Object) (reader)));
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokevirtual   #569 <Method void _reportUndetectableSource(Object)>
		return _bindAndCloseAsTree(_considerFilter(_parserFactory.createParser(reader)));
	//    6   12:aload_0         
	//    7   13:aload_0         
	//    8   14:aload_0         
	//    9   15:getfield        #76  <Field JsonFactory _parserFactory>
	//   10   18:aload_1         
	//   11   19:invokevirtual   #572 <Method JsonParser JsonFactory.createParser(Reader)>
	//   12   22:invokevirtual   #566 <Method JsonParser _considerFilter(JsonParser)>
	//   13   25:invokevirtual   #278 <Method JsonNode _bindAndCloseAsTree(JsonParser)>
	//   14   28:areturn         
	}

	public JsonNode readTree(String s)
		throws IOException, JsonProcessingException
	{
		if(_dataFormatReaders != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #112 <Field DataFormatReaders _dataFormatReaders>
	//*   2    4:ifnull          12
			_reportUndetectableSource(((Object) (s)));
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokevirtual   #569 <Method void _reportUndetectableSource(Object)>
		return _bindAndCloseAsTree(_considerFilter(_parserFactory.createParser(s)));
	//    6   12:aload_0         
	//    7   13:aload_0         
	//    8   14:aload_0         
	//    9   15:getfield        #76  <Field JsonFactory _parserFactory>
	//   10   18:aload_1         
	//   11   19:invokevirtual   #576 <Method JsonParser JsonFactory.createParser(String)>
	//   12   22:invokevirtual   #566 <Method JsonParser _considerFilter(JsonParser)>
	//   13   25:invokevirtual   #278 <Method JsonNode _bindAndCloseAsTree(JsonParser)>
	//   14   28:areturn         
	}

	public Object readValue(JsonParser jsonparser)
		throws IOException
	{
		return _bind(jsonparser, _valueToUpdate);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_0         
	//    3    3:getfield        #80  <Field Object _valueToUpdate>
	//    4    6:invokevirtual   #579 <Method Object _bind(JsonParser, Object)>
	//    5    9:areturn         
	}

	public Object readValue(JsonParser jsonparser, ResolvedType resolvedtype)
		throws IOException, JsonProcessingException
	{
		return forType((JavaType)resolvedtype).readValue(jsonparser);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:checkcast       #82  <Class JavaType>
	//    3    5:invokevirtual   #526 <Method ObjectReader forType(JavaType)>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #583 <Method Object readValue(JsonParser)>
	//    6   12:areturn         
	}

	public Object readValue(JsonParser jsonparser, TypeReference typereference)
		throws IOException
	{
		return forType(typereference).readValue(jsonparser);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #587 <Method ObjectReader forType(TypeReference)>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #583 <Method Object readValue(JsonParser)>
	//    5    9:areturn         
	}

	public Object readValue(JsonParser jsonparser, JavaType javatype)
		throws IOException
	{
		return forType(javatype).readValue(jsonparser);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #526 <Method ObjectReader forType(JavaType)>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #583 <Method Object readValue(JsonParser)>
	//    5    9:areturn         
	}

	public Object readValue(JsonParser jsonparser, Class class1)
		throws IOException
	{
		return forType(class1).readValue(jsonparser);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #593 <Method ObjectReader forType(Class)>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #583 <Method Object readValue(JsonParser)>
	//    5    9:areturn         
	}

	public Object readValue(JsonNode jsonnode)
		throws IOException, JsonProcessingException
	{
		if(_dataFormatReaders != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #112 <Field DataFormatReaders _dataFormatReaders>
	//*   2    4:ifnull          12
			_reportUndetectableSource(((Object) (jsonnode)));
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokevirtual   #569 <Method void _reportUndetectableSource(Object)>
		return _bindAndClose(_considerFilter(treeAsTokens(((TreeNode) (jsonnode)))));
	//    6   12:aload_0         
	//    7   13:aload_0         
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:invokevirtual   #599 <Method JsonParser treeAsTokens(TreeNode)>
	//   11   19:invokevirtual   #566 <Method JsonParser _considerFilter(JsonParser)>
	//   12   22:invokevirtual   #264 <Method Object _bindAndClose(JsonParser)>
	//   13   25:areturn         
	}

	public Object readValue(File file)
		throws IOException, JsonProcessingException
	{
		if(_dataFormatReaders != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #112 <Field DataFormatReaders _dataFormatReaders>
	//*   2    4:ifnull          25
			return _detectBindAndClose(_dataFormatReaders.findFormat(_inputStream(file)), true);
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #112 <Field DataFormatReaders _dataFormatReaders>
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:invokevirtual   #603 <Method InputStream _inputStream(File)>
	//    9   17:invokevirtual   #276 <Method com.fasterxml.jackson.databind.deser.DataFormatReaders$Match DataFormatReaders.findFormat(InputStream)>
	//   10   20:iconst_1        
	//   11   21:invokevirtual   #605 <Method Object _detectBindAndClose(com.fasterxml.jackson.databind.deser.DataFormatReaders$Match, boolean)>
	//   12   24:areturn         
		else
			return _bindAndClose(_considerFilter(_parserFactory.createParser(file)));
	//   13   25:aload_0         
	//   14   26:aload_0         
	//   15   27:aload_0         
	//   16   28:getfield        #76  <Field JsonFactory _parserFactory>
	//   17   31:aload_1         
	//   18   32:invokevirtual   #608 <Method JsonParser JsonFactory.createParser(File)>
	//   19   35:invokevirtual   #566 <Method JsonParser _considerFilter(JsonParser)>
	//   20   38:invokevirtual   #264 <Method Object _bindAndClose(JsonParser)>
	//   21   41:areturn         
	}

	public Object readValue(InputStream inputstream)
		throws IOException, JsonProcessingException
	{
		if(_dataFormatReaders != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #112 <Field DataFormatReaders _dataFormatReaders>
	//*   2    4:ifnull          21
			return _detectBindAndClose(_dataFormatReaders.findFormat(inputstream), false);
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #112 <Field DataFormatReaders _dataFormatReaders>
	//    6   12:aload_1         
	//    7   13:invokevirtual   #276 <Method com.fasterxml.jackson.databind.deser.DataFormatReaders$Match DataFormatReaders.findFormat(InputStream)>
	//    8   16:iconst_0        
	//    9   17:invokevirtual   #605 <Method Object _detectBindAndClose(com.fasterxml.jackson.databind.deser.DataFormatReaders$Match, boolean)>
	//   10   20:areturn         
		else
			return _bindAndClose(_considerFilter(_parserFactory.createParser(inputstream)));
	//   11   21:aload_0         
	//   12   22:aload_0         
	//   13   23:aload_0         
	//   14   24:getfield        #76  <Field JsonFactory _parserFactory>
	//   15   27:aload_1         
	//   16   28:invokevirtual   #564 <Method JsonParser JsonFactory.createParser(InputStream)>
	//   17   31:invokevirtual   #566 <Method JsonParser _considerFilter(JsonParser)>
	//   18   34:invokevirtual   #264 <Method Object _bindAndClose(JsonParser)>
	//   19   37:areturn         
	}

	public Object readValue(Reader reader)
		throws IOException, JsonProcessingException
	{
		if(_dataFormatReaders != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #112 <Field DataFormatReaders _dataFormatReaders>
	//*   2    4:ifnull          12
			_reportUndetectableSource(((Object) (reader)));
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokevirtual   #569 <Method void _reportUndetectableSource(Object)>
		return _bindAndClose(_considerFilter(_parserFactory.createParser(reader)));
	//    6   12:aload_0         
	//    7   13:aload_0         
	//    8   14:aload_0         
	//    9   15:getfield        #76  <Field JsonFactory _parserFactory>
	//   10   18:aload_1         
	//   11   19:invokevirtual   #572 <Method JsonParser JsonFactory.createParser(Reader)>
	//   12   22:invokevirtual   #566 <Method JsonParser _considerFilter(JsonParser)>
	//   13   25:invokevirtual   #264 <Method Object _bindAndClose(JsonParser)>
	//   14   28:areturn         
	}

	public Object readValue(String s)
		throws IOException, JsonProcessingException
	{
		if(_dataFormatReaders != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #112 <Field DataFormatReaders _dataFormatReaders>
	//*   2    4:ifnull          12
			_reportUndetectableSource(((Object) (s)));
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokevirtual   #569 <Method void _reportUndetectableSource(Object)>
		return _bindAndClose(_considerFilter(_parserFactory.createParser(s)));
	//    6   12:aload_0         
	//    7   13:aload_0         
	//    8   14:aload_0         
	//    9   15:getfield        #76  <Field JsonFactory _parserFactory>
	//   10   18:aload_1         
	//   11   19:invokevirtual   #576 <Method JsonParser JsonFactory.createParser(String)>
	//   12   22:invokevirtual   #566 <Method JsonParser _considerFilter(JsonParser)>
	//   13   25:invokevirtual   #264 <Method Object _bindAndClose(JsonParser)>
	//   14   28:areturn         
	}

	public Object readValue(URL url)
		throws IOException, JsonProcessingException
	{
		if(_dataFormatReaders != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #112 <Field DataFormatReaders _dataFormatReaders>
	//*   2    4:ifnull          25
			return _detectBindAndClose(_dataFormatReaders.findFormat(_inputStream(url)), true);
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #112 <Field DataFormatReaders _dataFormatReaders>
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:invokevirtual   #618 <Method InputStream _inputStream(URL)>
	//    9   17:invokevirtual   #276 <Method com.fasterxml.jackson.databind.deser.DataFormatReaders$Match DataFormatReaders.findFormat(InputStream)>
	//   10   20:iconst_1        
	//   11   21:invokevirtual   #605 <Method Object _detectBindAndClose(com.fasterxml.jackson.databind.deser.DataFormatReaders$Match, boolean)>
	//   12   24:areturn         
		else
			return _bindAndClose(_considerFilter(_parserFactory.createParser(url)));
	//   13   25:aload_0         
	//   14   26:aload_0         
	//   15   27:aload_0         
	//   16   28:getfield        #76  <Field JsonFactory _parserFactory>
	//   17   31:aload_1         
	//   18   32:invokevirtual   #621 <Method JsonParser JsonFactory.createParser(URL)>
	//   19   35:invokevirtual   #566 <Method JsonParser _considerFilter(JsonParser)>
	//   20   38:invokevirtual   #264 <Method Object _bindAndClose(JsonParser)>
	//   21   41:areturn         
	}

	public Object readValue(byte abyte0[])
		throws IOException, JsonProcessingException
	{
		if(_dataFormatReaders != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #112 <Field DataFormatReaders _dataFormatReaders>
	//*   2    4:ifnull          16
			return _detectBindAndClose(abyte0, 0, abyte0.length);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:iconst_0        
	//    6   10:aload_1         
	//    7   11:arraylength     
	//    8   12:invokevirtual   #625 <Method Object _detectBindAndClose(byte[], int, int)>
	//    9   15:areturn         
		else
			return _bindAndClose(_considerFilter(_parserFactory.createParser(abyte0)));
	//   10   16:aload_0         
	//   11   17:aload_0         
	//   12   18:aload_0         
	//   13   19:getfield        #76  <Field JsonFactory _parserFactory>
	//   14   22:aload_1         
	//   15   23:invokevirtual   #628 <Method JsonParser JsonFactory.createParser(byte[])>
	//   16   26:invokevirtual   #566 <Method JsonParser _considerFilter(JsonParser)>
	//   17   29:invokevirtual   #264 <Method Object _bindAndClose(JsonParser)>
	//   18   32:areturn         
	}

	public Object readValue(byte abyte0[], int i, int j)
		throws IOException, JsonProcessingException
	{
		if(_dataFormatReaders != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #112 <Field DataFormatReaders _dataFormatReaders>
	//*   2    4:ifnull          15
			return _detectBindAndClose(abyte0, i, j);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:iload_2         
	//    6   10:iload_3         
	//    7   11:invokevirtual   #625 <Method Object _detectBindAndClose(byte[], int, int)>
	//    8   14:areturn         
		else
			return _bindAndClose(_considerFilter(_parserFactory.createParser(abyte0, i, j)));
	//    9   15:aload_0         
	//   10   16:aload_0         
	//   11   17:aload_0         
	//   12   18:getfield        #76  <Field JsonFactory _parserFactory>
	//   13   21:aload_1         
	//   14   22:iload_2         
	//   15   23:iload_3         
	//   16   24:invokevirtual   #632 <Method JsonParser JsonFactory.createParser(byte[], int, int)>
	//   17   27:invokevirtual   #566 <Method JsonParser _considerFilter(JsonParser)>
	//   18   30:invokevirtual   #264 <Method Object _bindAndClose(JsonParser)>
	//   19   33:areturn         
	}

	public MappingIterator readValues(JsonParser jsonparser)
		throws IOException, JsonProcessingException
	{
		DefaultDeserializationContext defaultdeserializationcontext = createDeserializationContext(jsonparser);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #153 <Method DefaultDeserializationContext createDeserializationContext(JsonParser)>
	//    3    5:astore_2        
		return _newIterator(jsonparser, ((DeserializationContext) (defaultdeserializationcontext)), _findRootDeserializer(((DeserializationContext) (defaultdeserializationcontext))), false);
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:aload_2         
	//    7    9:aload_0         
	//    8   10:aload_2         
	//    9   11:invokevirtual   #157 <Method JsonDeserializer _findRootDeserializer(DeserializationContext)>
	//   10   14:iconst_0        
	//   11   15:invokevirtual   #210 <Method MappingIterator _newIterator(JsonParser, DeserializationContext, JsonDeserializer, boolean)>
	//   12   18:areturn         
	}

	public MappingIterator readValues(File file)
		throws IOException, JsonProcessingException
	{
		if(_dataFormatReaders != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #112 <Field DataFormatReaders _dataFormatReaders>
	//*   2    4:ifnull          25
			return _detectBindAndReadValues(_dataFormatReaders.findFormat(_inputStream(file)), false);
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #112 <Field DataFormatReaders _dataFormatReaders>
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:invokevirtual   #603 <Method InputStream _inputStream(File)>
	//    9   17:invokevirtual   #276 <Method com.fasterxml.jackson.databind.deser.DataFormatReaders$Match DataFormatReaders.findFormat(InputStream)>
	//   10   20:iconst_0        
	//   11   21:invokevirtual   #637 <Method MappingIterator _detectBindAndReadValues(com.fasterxml.jackson.databind.deser.DataFormatReaders$Match, boolean)>
	//   12   24:areturn         
		else
			return _bindAndReadValues(_considerFilter(_parserFactory.createParser(file)));
	//   13   25:aload_0         
	//   14   26:aload_0         
	//   15   27:aload_0         
	//   16   28:getfield        #76  <Field JsonFactory _parserFactory>
	//   17   31:aload_1         
	//   18   32:invokevirtual   #608 <Method JsonParser JsonFactory.createParser(File)>
	//   19   35:invokevirtual   #566 <Method JsonParser _considerFilter(JsonParser)>
	//   20   38:invokevirtual   #284 <Method MappingIterator _bindAndReadValues(JsonParser)>
	//   21   41:areturn         
	}

	public MappingIterator readValues(InputStream inputstream)
		throws IOException, JsonProcessingException
	{
		if(_dataFormatReaders != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #112 <Field DataFormatReaders _dataFormatReaders>
	//*   2    4:ifnull          21
			return _detectBindAndReadValues(_dataFormatReaders.findFormat(inputstream), false);
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #112 <Field DataFormatReaders _dataFormatReaders>
	//    6   12:aload_1         
	//    7   13:invokevirtual   #276 <Method com.fasterxml.jackson.databind.deser.DataFormatReaders$Match DataFormatReaders.findFormat(InputStream)>
	//    8   16:iconst_0        
	//    9   17:invokevirtual   #637 <Method MappingIterator _detectBindAndReadValues(com.fasterxml.jackson.databind.deser.DataFormatReaders$Match, boolean)>
	//   10   20:areturn         
		else
			return _bindAndReadValues(_considerFilter(_parserFactory.createParser(inputstream)));
	//   11   21:aload_0         
	//   12   22:aload_0         
	//   13   23:aload_0         
	//   14   24:getfield        #76  <Field JsonFactory _parserFactory>
	//   15   27:aload_1         
	//   16   28:invokevirtual   #564 <Method JsonParser JsonFactory.createParser(InputStream)>
	//   17   31:invokevirtual   #566 <Method JsonParser _considerFilter(JsonParser)>
	//   18   34:invokevirtual   #284 <Method MappingIterator _bindAndReadValues(JsonParser)>
	//   19   37:areturn         
	}

	public MappingIterator readValues(Reader reader)
		throws IOException, JsonProcessingException
	{
		if(_dataFormatReaders != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #112 <Field DataFormatReaders _dataFormatReaders>
	//*   2    4:ifnull          12
			_reportUndetectableSource(((Object) (reader)));
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokevirtual   #569 <Method void _reportUndetectableSource(Object)>
		reader = ((Reader) (_considerFilter(_parserFactory.createParser(reader))));
	//    6   12:aload_0         
	//    7   13:aload_0         
	//    8   14:getfield        #76  <Field JsonFactory _parserFactory>
	//    9   17:aload_1         
	//   10   18:invokevirtual   #572 <Method JsonParser JsonFactory.createParser(Reader)>
	//   11   21:invokevirtual   #566 <Method JsonParser _considerFilter(JsonParser)>
	//   12   24:astore_1        
		_initForMultiRead(((JsonParser) (reader)));
	//   13   25:aload_0         
	//   14   26:aload_1         
	//   15   27:invokevirtual   #202 <Method void _initForMultiRead(JsonParser)>
		((JsonParser) (reader)).nextToken();
	//   16   30:aload_1         
	//   17   31:invokevirtual   #206 <Method JsonToken JsonParser.nextToken()>
	//   18   34:pop             
		DefaultDeserializationContext defaultdeserializationcontext = createDeserializationContext(((JsonParser) (reader)));
	//   19   35:aload_0         
	//   20   36:aload_1         
	//   21   37:invokevirtual   #153 <Method DefaultDeserializationContext createDeserializationContext(JsonParser)>
	//   22   40:astore_2        
		return _newIterator(((JsonParser) (reader)), ((DeserializationContext) (defaultdeserializationcontext)), _findRootDeserializer(((DeserializationContext) (defaultdeserializationcontext))), true);
	//   23   41:aload_0         
	//   24   42:aload_1         
	//   25   43:aload_2         
	//   26   44:aload_0         
	//   27   45:aload_2         
	//   28   46:invokevirtual   #157 <Method JsonDeserializer _findRootDeserializer(DeserializationContext)>
	//   29   49:iconst_1        
	//   30   50:invokevirtual   #210 <Method MappingIterator _newIterator(JsonParser, DeserializationContext, JsonDeserializer, boolean)>
	//   31   53:areturn         
	}

	public MappingIterator readValues(String s)
		throws IOException, JsonProcessingException
	{
		if(_dataFormatReaders != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #112 <Field DataFormatReaders _dataFormatReaders>
	//*   2    4:ifnull          12
			_reportUndetectableSource(((Object) (s)));
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokevirtual   #569 <Method void _reportUndetectableSource(Object)>
		s = ((String) (_considerFilter(_parserFactory.createParser(s))));
	//    6   12:aload_0         
	//    7   13:aload_0         
	//    8   14:getfield        #76  <Field JsonFactory _parserFactory>
	//    9   17:aload_1         
	//   10   18:invokevirtual   #576 <Method JsonParser JsonFactory.createParser(String)>
	//   11   21:invokevirtual   #566 <Method JsonParser _considerFilter(JsonParser)>
	//   12   24:astore_1        
		_initForMultiRead(((JsonParser) (s)));
	//   13   25:aload_0         
	//   14   26:aload_1         
	//   15   27:invokevirtual   #202 <Method void _initForMultiRead(JsonParser)>
		((JsonParser) (s)).nextToken();
	//   16   30:aload_1         
	//   17   31:invokevirtual   #206 <Method JsonToken JsonParser.nextToken()>
	//   18   34:pop             
		DefaultDeserializationContext defaultdeserializationcontext = createDeserializationContext(((JsonParser) (s)));
	//   19   35:aload_0         
	//   20   36:aload_1         
	//   21   37:invokevirtual   #153 <Method DefaultDeserializationContext createDeserializationContext(JsonParser)>
	//   22   40:astore_2        
		return _newIterator(((JsonParser) (s)), ((DeserializationContext) (defaultdeserializationcontext)), _findRootDeserializer(((DeserializationContext) (defaultdeserializationcontext))), true);
	//   23   41:aload_0         
	//   24   42:aload_1         
	//   25   43:aload_2         
	//   26   44:aload_0         
	//   27   45:aload_2         
	//   28   46:invokevirtual   #157 <Method JsonDeserializer _findRootDeserializer(DeserializationContext)>
	//   29   49:iconst_1        
	//   30   50:invokevirtual   #210 <Method MappingIterator _newIterator(JsonParser, DeserializationContext, JsonDeserializer, boolean)>
	//   31   53:areturn         
	}

	public MappingIterator readValues(URL url)
		throws IOException, JsonProcessingException
	{
		if(_dataFormatReaders != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #112 <Field DataFormatReaders _dataFormatReaders>
	//*   2    4:ifnull          25
			return _detectBindAndReadValues(_dataFormatReaders.findFormat(_inputStream(url)), true);
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #112 <Field DataFormatReaders _dataFormatReaders>
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:invokevirtual   #618 <Method InputStream _inputStream(URL)>
	//    9   17:invokevirtual   #276 <Method com.fasterxml.jackson.databind.deser.DataFormatReaders$Match DataFormatReaders.findFormat(InputStream)>
	//   10   20:iconst_1        
	//   11   21:invokevirtual   #637 <Method MappingIterator _detectBindAndReadValues(com.fasterxml.jackson.databind.deser.DataFormatReaders$Match, boolean)>
	//   12   24:areturn         
		else
			return _bindAndReadValues(_considerFilter(_parserFactory.createParser(url)));
	//   13   25:aload_0         
	//   14   26:aload_0         
	//   15   27:aload_0         
	//   16   28:getfield        #76  <Field JsonFactory _parserFactory>
	//   17   31:aload_1         
	//   18   32:invokevirtual   #621 <Method JsonParser JsonFactory.createParser(URL)>
	//   19   35:invokevirtual   #566 <Method JsonParser _considerFilter(JsonParser)>
	//   20   38:invokevirtual   #284 <Method MappingIterator _bindAndReadValues(JsonParser)>
	//   21   41:areturn         
	}

	public final MappingIterator readValues(byte abyte0[])
		throws IOException, JsonProcessingException
	{
		return readValues(abyte0, 0, abyte0.length);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:aload_1         
	//    4    4:arraylength     
	//    5    5:invokevirtual   #650 <Method MappingIterator readValues(byte[], int, int)>
	//    6    8:areturn         
	}

	public MappingIterator readValues(byte abyte0[], int i, int j)
		throws IOException, JsonProcessingException
	{
		if(_dataFormatReaders != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #112 <Field DataFormatReaders _dataFormatReaders>
	//*   2    4:ifnull          23
			return _detectBindAndReadValues(_dataFormatReaders.findFormat(abyte0, i, j), false);
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #112 <Field DataFormatReaders _dataFormatReaders>
	//    6   12:aload_1         
	//    7   13:iload_2         
	//    8   14:iload_3         
	//    9   15:invokevirtual   #271 <Method com.fasterxml.jackson.databind.deser.DataFormatReaders$Match DataFormatReaders.findFormat(byte[], int, int)>
	//   10   18:iconst_0        
	//   11   19:invokevirtual   #637 <Method MappingIterator _detectBindAndReadValues(com.fasterxml.jackson.databind.deser.DataFormatReaders$Match, boolean)>
	//   12   22:areturn         
		else
			return _bindAndReadValues(_considerFilter(_parserFactory.createParser(abyte0)));
	//   13   23:aload_0         
	//   14   24:aload_0         
	//   15   25:aload_0         
	//   16   26:getfield        #76  <Field JsonFactory _parserFactory>
	//   17   29:aload_1         
	//   18   30:invokevirtual   #628 <Method JsonParser JsonFactory.createParser(byte[])>
	//   19   33:invokevirtual   #566 <Method JsonParser _considerFilter(JsonParser)>
	//   20   36:invokevirtual   #284 <Method MappingIterator _bindAndReadValues(JsonParser)>
	//   21   39:areturn         
	}

	public Iterator readValues(JsonParser jsonparser, ResolvedType resolvedtype)
		throws IOException
	{
		return readValues(jsonparser, (JavaType)resolvedtype);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:checkcast       #82  <Class JavaType>
	//    4    6:invokevirtual   #656 <Method Iterator readValues(JsonParser, JavaType)>
	//    5    9:areturn         
	}

	public Iterator readValues(JsonParser jsonparser, TypeReference typereference)
		throws IOException
	{
		return ((Iterator) (forType(typereference).readValues(jsonparser)));
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #587 <Method ObjectReader forType(TypeReference)>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #660 <Method MappingIterator readValues(JsonParser)>
	//    5    9:areturn         
	}

	public Iterator readValues(JsonParser jsonparser, JavaType javatype)
		throws IOException
	{
		return ((Iterator) (forType(javatype).readValues(jsonparser)));
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #526 <Method ObjectReader forType(JavaType)>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #660 <Method MappingIterator readValues(JsonParser)>
	//    5    9:areturn         
	}

	public Iterator readValues(JsonParser jsonparser, Class class1)
		throws IOException
	{
		return ((Iterator) (forType(class1).readValues(jsonparser)));
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #593 <Method ObjectReader forType(Class)>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #660 <Method MappingIterator readValues(JsonParser)>
	//    5    9:areturn         
	}

	public JsonParser treeAsTokens(TreeNode treenode)
	{
		return ((JsonParser) (new TreeTraversingParser((JsonNode)treenode, ((ObjectCodec) (this)))));
	//    0    0:new             #666 <Class TreeTraversingParser>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:checkcast       #43  <Class JsonNode>
	//    4    8:aload_0         
	//    5    9:invokespecial   #669 <Method void TreeTraversingParser(JsonNode, ObjectCodec)>
	//    6   12:areturn         
	}

	public Object treeToValue(TreeNode treenode, Class class1)
		throws JsonProcessingException
	{
		try
		{
			treenode = ((TreeNode) (readValue(treeAsTokens(treenode), class1)));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:aload_1         
	//    3    3:invokevirtual   #599 <Method JsonParser treeAsTokens(TreeNode)>
	//    4    6:aload_2         
	//    5    7:invokevirtual   #673 <Method Object readValue(JsonParser, Class)>
	//    6   10:astore_1        
		}
	//*   7   11:aload_1         
	//*   8   12:areturn         
		// Misplaced declaration of an exception variable
		catch(TreeNode treenode)
	//*   9   13:astore_1        
		{
			throw treenode;
	//   10   14:aload_1         
	//   11   15:athrow          
		}
		// Misplaced declaration of an exception variable
		catch(TreeNode treenode)
	//*  12   16:astore_1        
		{
			throw new IllegalArgumentException(((IOException) (treenode)).getMessage(), ((Throwable) (treenode)));
	//   13   17:new             #88  <Class IllegalArgumentException>
	//   14   20:dup             
	//   15   21:aload_1         
	//   16   22:invokevirtual   #676 <Method String IOException.getMessage()>
	//   17   25:aload_1         
	//   18   26:invokespecial   #679 <Method void IllegalArgumentException(String, Throwable)>
	//   19   29:athrow          
		}
		return ((Object) (treenode));
	}

	public Version version()
	{
		return PackageVersion.VERSION;
	//    0    0:getstatic       #688 <Field Version PackageVersion.VERSION>
	//    1    3:areturn         
	}

	public ObjectReader with(Base64Variant base64variant)
	{
		return _with(_config.with(base64variant));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #61  <Field DeserializationConfig _config>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #692 <Method DeserializationConfig DeserializationConfig.with(Base64Variant)>
	//    5    9:invokevirtual   #694 <Method ObjectReader _with(DeserializationConfig)>
	//    6   12:areturn         
	}

	public ObjectReader with(FormatFeature formatfeature)
	{
		return _with(_config.with(formatfeature));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #61  <Field DeserializationConfig _config>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #698 <Method DeserializationConfig DeserializationConfig.with(FormatFeature)>
	//    5    9:invokevirtual   #694 <Method ObjectReader _with(DeserializationConfig)>
	//    6   12:areturn         
	}

	public ObjectReader with(FormatSchema formatschema)
	{
		if(_schema == formatschema)
	//*   0    0:aload_0         
	//*   1    1:getfield        #95  <Field FormatSchema _schema>
	//*   2    4:aload_1         
	//*   3    5:if_acmpne       10
		{
			return this;
	//    4    8:aload_0         
	//    5    9:areturn         
		} else
		{
			_verifySchemaType(formatschema);
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:invokevirtual   #701 <Method void _verifySchemaType(FormatSchema)>
			return _new(this, _config, _valueType, _rootDeserializer, _valueToUpdate, formatschema, _injectableValues, _dataFormatReaders);
	//    9   15:aload_0         
	//   10   16:aload_0         
	//   11   17:aload_0         
	//   12   18:getfield        #61  <Field DeserializationConfig _config>
	//   13   21:aload_0         
	//   14   22:getfield        #78  <Field JavaType _valueType>
	//   15   25:aload_0         
	//   16   26:getfield        #110 <Field JsonDeserializer _rootDeserializer>
	//   17   29:aload_0         
	//   18   30:getfield        #80  <Field Object _valueToUpdate>
	//   19   33:aload_1         
	//   20   34:aload_0         
	//   21   35:getfield        #97  <Field InjectableValues _injectableValues>
	//   22   38:aload_0         
	//   23   39:getfield        #112 <Field DataFormatReaders _dataFormatReaders>
	//   24   42:invokevirtual   #534 <Method ObjectReader _new(ObjectReader, DeserializationConfig, JavaType, JsonDeserializer, Object, FormatSchema, InjectableValues, DataFormatReaders)>
	//   25   45:areturn         
		}
	}

	public ObjectReader with(JsonFactory jsonfactory)
	{
		if(jsonfactory == _parserFactory)
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #76  <Field JsonFactory _parserFactory>
	//*   3    5:if_acmpne       10
			return this;
	//    4    8:aload_0         
	//    5    9:areturn         
		ObjectReader objectreader = _new(this, jsonfactory);
	//    6   10:aload_0         
	//    7   11:aload_0         
	//    8   12:aload_1         
	//    9   13:invokevirtual   #704 <Method ObjectReader _new(ObjectReader, JsonFactory)>
	//   10   16:astore_2        
		if(jsonfactory.getCodec() == null)
	//*  11   17:aload_1         
	//*  12   18:invokevirtual   #708 <Method ObjectCodec JsonFactory.getCodec()>
	//*  13   21:ifnonnull       30
			jsonfactory.setCodec(((ObjectCodec) (objectreader)));
	//   14   24:aload_1         
	//   15   25:aload_2         
	//   16   26:invokevirtual   #712 <Method JsonFactory JsonFactory.setCodec(ObjectCodec)>
	//   17   29:pop             
		return objectreader;
	//   18   30:aload_2         
	//   19   31:areturn         
	}

	public ObjectReader with(com.fasterxml.jackson.core.JsonParser.Feature feature)
	{
		return _with(_config.with(feature));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #61  <Field DeserializationConfig _config>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #716 <Method DeserializationConfig DeserializationConfig.with(com.fasterxml.jackson.core.JsonParser$Feature)>
	//    5    9:invokevirtual   #694 <Method ObjectReader _with(DeserializationConfig)>
	//    6   12:areturn         
	}

	public ObjectReader with(DeserializationConfig deserializationconfig)
	{
		return _with(deserializationconfig);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #694 <Method ObjectReader _with(DeserializationConfig)>
	//    3    5:areturn         
	}

	public ObjectReader with(DeserializationFeature deserializationfeature)
	{
		return _with(_config.with(deserializationfeature));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #61  <Field DeserializationConfig _config>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #720 <Method DeserializationConfig DeserializationConfig.with(DeserializationFeature)>
	//    5    9:invokevirtual   #694 <Method ObjectReader _with(DeserializationConfig)>
	//    6   12:areturn         
	}

	public transient ObjectReader with(DeserializationFeature deserializationfeature, DeserializationFeature adeserializationfeature[])
	{
		return _with(_config.with(deserializationfeature, adeserializationfeature));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #61  <Field DeserializationConfig _config>
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:invokevirtual   #724 <Method DeserializationConfig DeserializationConfig.with(DeserializationFeature, DeserializationFeature[])>
	//    6   10:invokevirtual   #694 <Method ObjectReader _with(DeserializationConfig)>
	//    7   13:areturn         
	}

	public ObjectReader with(InjectableValues injectablevalues)
	{
		if(_injectableValues == injectablevalues)
	//*   0    0:aload_0         
	//*   1    1:getfield        #97  <Field InjectableValues _injectableValues>
	//*   2    4:aload_1         
	//*   3    5:if_acmpne       10
			return this;
	//    4    8:aload_0         
	//    5    9:areturn         
		else
			return _new(this, _config, _valueType, _rootDeserializer, _valueToUpdate, _schema, injectablevalues, _dataFormatReaders);
	//    6   10:aload_0         
	//    7   11:aload_0         
	//    8   12:aload_0         
	//    9   13:getfield        #61  <Field DeserializationConfig _config>
	//   10   16:aload_0         
	//   11   17:getfield        #78  <Field JavaType _valueType>
	//   12   20:aload_0         
	//   13   21:getfield        #110 <Field JsonDeserializer _rootDeserializer>
	//   14   24:aload_0         
	//   15   25:getfield        #80  <Field Object _valueToUpdate>
	//   16   28:aload_0         
	//   17   29:getfield        #95  <Field FormatSchema _schema>
	//   18   32:aload_1         
	//   19   33:aload_0         
	//   20   34:getfield        #112 <Field DataFormatReaders _dataFormatReaders>
	//   21   37:invokevirtual   #534 <Method ObjectReader _new(ObjectReader, DeserializationConfig, JavaType, JsonDeserializer, Object, FormatSchema, InjectableValues, DataFormatReaders)>
	//   22   40:areturn         
	}

	public ObjectReader with(ContextAttributes contextattributes)
	{
		return _with(_config.with(contextattributes));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #61  <Field DeserializationConfig _config>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #729 <Method DeserializationConfig DeserializationConfig.with(ContextAttributes)>
	//    5    9:invokevirtual   #694 <Method ObjectReader _with(DeserializationConfig)>
	//    6   12:areturn         
	}

	public ObjectReader with(JsonNodeFactory jsonnodefactory)
	{
		return _with(_config.with(jsonnodefactory));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #61  <Field DeserializationConfig _config>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #733 <Method DeserializationConfig DeserializationConfig.with(JsonNodeFactory)>
	//    5    9:invokevirtual   #694 <Method ObjectReader _with(DeserializationConfig)>
	//    6   12:areturn         
	}

	public ObjectReader with(Locale locale)
	{
		return _with(_config.with(locale));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #61  <Field DeserializationConfig _config>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #737 <Method DeserializationConfig DeserializationConfig.with(Locale)>
	//    5    9:invokevirtual   #694 <Method ObjectReader _with(DeserializationConfig)>
	//    6   12:areturn         
	}

	public ObjectReader with(TimeZone timezone)
	{
		return _with(_config.with(timezone));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #61  <Field DeserializationConfig _config>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #741 <Method DeserializationConfig DeserializationConfig.with(TimeZone)>
	//    5    9:invokevirtual   #694 <Method ObjectReader _with(DeserializationConfig)>
	//    6   12:areturn         
	}

	public ObjectReader withAttribute(Object obj, Object obj1)
	{
		return _with((DeserializationConfig)_config.withAttribute(obj, obj1));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #61  <Field DeserializationConfig _config>
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:invokevirtual   #746 <Method com.fasterxml.jackson.databind.cfg.MapperConfigBase DeserializationConfig.withAttribute(Object, Object)>
	//    6   10:checkcast       #99  <Class DeserializationConfig>
	//    7   13:invokevirtual   #694 <Method ObjectReader _with(DeserializationConfig)>
	//    8   16:areturn         
	}

	public ObjectReader withAttributes(Map map)
	{
		return _with((DeserializationConfig)_config.withAttributes(map));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #61  <Field DeserializationConfig _config>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #751 <Method com.fasterxml.jackson.databind.cfg.MapperConfigBase DeserializationConfig.withAttributes(Map)>
	//    5    9:checkcast       #99  <Class DeserializationConfig>
	//    6   12:invokevirtual   #694 <Method ObjectReader _with(DeserializationConfig)>
	//    7   15:areturn         
	}

	public transient ObjectReader withFeatures(FormatFeature aformatfeature[])
	{
		return _with(_config.withFeatures(aformatfeature));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #61  <Field DeserializationConfig _config>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #757 <Method DeserializationConfig DeserializationConfig.withFeatures(FormatFeature[])>
	//    5    9:invokevirtual   #694 <Method ObjectReader _with(DeserializationConfig)>
	//    6   12:areturn         
	}

	public transient ObjectReader withFeatures(com.fasterxml.jackson.core.JsonParser.Feature afeature[])
	{
		return _with(_config.withFeatures(afeature));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #61  <Field DeserializationConfig _config>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #761 <Method DeserializationConfig DeserializationConfig.withFeatures(com.fasterxml.jackson.core.JsonParser$Feature[])>
	//    5    9:invokevirtual   #694 <Method ObjectReader _with(DeserializationConfig)>
	//    6   12:areturn         
	}

	public transient ObjectReader withFeatures(DeserializationFeature adeserializationfeature[])
	{
		return _with(_config.withFeatures(adeserializationfeature));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #61  <Field DeserializationConfig _config>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #765 <Method DeserializationConfig DeserializationConfig.withFeatures(DeserializationFeature[])>
	//    5    9:invokevirtual   #694 <Method ObjectReader _with(DeserializationConfig)>
	//    6   12:areturn         
	}

	public ObjectReader withFormatDetection(DataFormatReaders dataformatreaders)
	{
		return _new(this, _config, _valueType, _rootDeserializer, _valueToUpdate, _schema, _injectableValues, dataformatreaders);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:aload_0         
	//    3    3:getfield        #61  <Field DeserializationConfig _config>
	//    4    6:aload_0         
	//    5    7:getfield        #78  <Field JavaType _valueType>
	//    6   10:aload_0         
	//    7   11:getfield        #110 <Field JsonDeserializer _rootDeserializer>
	//    8   14:aload_0         
	//    9   15:getfield        #80  <Field Object _valueToUpdate>
	//   10   18:aload_0         
	//   11   19:getfield        #95  <Field FormatSchema _schema>
	//   12   22:aload_0         
	//   13   23:getfield        #97  <Field InjectableValues _injectableValues>
	//   14   26:aload_1         
	//   15   27:invokevirtual   #534 <Method ObjectReader _new(ObjectReader, DeserializationConfig, JavaType, JsonDeserializer, Object, FormatSchema, InjectableValues, DataFormatReaders)>
	//   16   30:areturn         
	}

	public transient ObjectReader withFormatDetection(ObjectReader aobjectreader[])
	{
		return withFormatDetection(new DataFormatReaders(aobjectreader));
	//    0    0:aload_0         
	//    1    1:new             #267 <Class DataFormatReaders>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:invokespecial   #769 <Method void DataFormatReaders(ObjectReader[])>
	//    5    9:invokevirtual   #466 <Method ObjectReader withFormatDetection(DataFormatReaders)>
	//    6   12:areturn         
	}

	public ObjectReader withHandler(DeserializationProblemHandler deserializationproblemhandler)
	{
		return _with(_config.withHandler(deserializationproblemhandler));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #61  <Field DeserializationConfig _config>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #774 <Method DeserializationConfig DeserializationConfig.withHandler(DeserializationProblemHandler)>
	//    5    9:invokevirtual   #694 <Method ObjectReader _with(DeserializationConfig)>
	//    6   12:areturn         
	}

	public ObjectReader withRootName(PropertyName propertyname)
	{
		return _with(_config.withRootName(propertyname));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #61  <Field DeserializationConfig _config>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #779 <Method DeserializationConfig DeserializationConfig.withRootName(PropertyName)>
	//    5    9:invokevirtual   #694 <Method ObjectReader _with(DeserializationConfig)>
	//    6   12:areturn         
	}

	public ObjectReader withRootName(String s)
	{
		return _with((DeserializationConfig)_config.withRootName(s));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #61  <Field DeserializationConfig _config>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #782 <Method com.fasterxml.jackson.databind.cfg.MapperConfigBase DeserializationConfig.withRootName(String)>
	//    5    9:checkcast       #99  <Class DeserializationConfig>
	//    6   12:invokevirtual   #694 <Method ObjectReader _with(DeserializationConfig)>
	//    7   15:areturn         
	}

	public ObjectReader withType(TypeReference typereference)
	{
		return forType(_config.getTypeFactory().constructType(typereference.getType()));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #61  <Field DeserializationConfig _config>
	//    3    5:invokevirtual   #511 <Method TypeFactory DeserializationConfig.getTypeFactory()>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #517 <Method Type TypeReference.getType()>
	//    6   12:invokevirtual   #523 <Method JavaType TypeFactory.constructType(Type)>
	//    7   15:invokevirtual   #526 <Method ObjectReader forType(JavaType)>
	//    8   18:areturn         
	}

	public ObjectReader withType(JavaType javatype)
	{
		return forType(javatype);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #526 <Method ObjectReader forType(JavaType)>
	//    3    5:areturn         
	}

	public ObjectReader withType(Class class1)
	{
		return forType(_config.constructType(class1));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #61  <Field DeserializationConfig _config>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #538 <Method JavaType DeserializationConfig.constructType(Class)>
	//    5    9:invokevirtual   #526 <Method ObjectReader forType(JavaType)>
	//    6   12:areturn         
	}

	public ObjectReader withType(Type type)
	{
		return forType(_config.getTypeFactory().constructType(type));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #61  <Field DeserializationConfig _config>
	//    3    5:invokevirtual   #511 <Method TypeFactory DeserializationConfig.getTypeFactory()>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #523 <Method JavaType TypeFactory.constructType(Type)>
	//    6   12:invokevirtual   #526 <Method ObjectReader forType(JavaType)>
	//    7   15:areturn         
	}

	public ObjectReader withValueToUpdate(Object obj)
	{
		if(obj == _valueToUpdate)
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #80  <Field Object _valueToUpdate>
	//*   3    5:if_acmpne       10
			return this;
	//    4    8:aload_0         
	//    5    9:areturn         
		if(obj == null)
	//*   6   10:aload_1         
	//*   7   11:ifnonnull       25
			throw new IllegalArgumentException("cat not update null value");
	//    8   14:new             #88  <Class IllegalArgumentException>
	//    9   17:dup             
	//   10   18:ldc2            #789 <String "cat not update null value">
	//   11   21:invokespecial   #93  <Method void IllegalArgumentException(String)>
	//   12   24:athrow          
		JavaType javatype;
		if(_valueType == null)
	//*  13   25:aload_0         
	//*  14   26:getfield        #78  <Field JavaType _valueType>
	//*  15   29:ifnonnull       72
			javatype = _config.constructType(obj.getClass());
	//   16   32:aload_0         
	//   17   33:getfield        #61  <Field DeserializationConfig _config>
	//   18   36:aload_1         
	//   19   37:invokevirtual   #394 <Method Class Object.getClass()>
	//   20   40:invokevirtual   #538 <Method JavaType DeserializationConfig.constructType(Class)>
	//   21   43:astore_2        
		else
	//*  22   44:aload_0         
	//*  23   45:aload_0         
	//*  24   46:aload_0         
	//*  25   47:getfield        #61  <Field DeserializationConfig _config>
	//*  26   50:aload_2         
	//*  27   51:aload_0         
	//*  28   52:getfield        #110 <Field JsonDeserializer _rootDeserializer>
	//*  29   55:aload_1         
	//*  30   56:aload_0         
	//*  31   57:getfield        #95  <Field FormatSchema _schema>
	//*  32   60:aload_0         
	//*  33   61:getfield        #97  <Field InjectableValues _injectableValues>
	//*  34   64:aload_0         
	//*  35   65:getfield        #112 <Field DataFormatReaders _dataFormatReaders>
	//*  36   68:invokevirtual   #534 <Method ObjectReader _new(ObjectReader, DeserializationConfig, JavaType, JsonDeserializer, Object, FormatSchema, InjectableValues, DataFormatReaders)>
	//*  37   71:areturn         
			javatype = _valueType;
	//   38   72:aload_0         
	//   39   73:getfield        #78  <Field JavaType _valueType>
	//   40   76:astore_2        
		return _new(this, _config, javatype, _rootDeserializer, obj, _schema, _injectableValues, _dataFormatReaders);
	//*  41   77:goto            44
	}

	public ObjectReader withView(Class class1)
	{
		return _with(_config.withView(class1));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #61  <Field DeserializationConfig _config>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #793 <Method DeserializationConfig DeserializationConfig.withView(Class)>
	//    5    9:invokevirtual   #694 <Method ObjectReader _with(DeserializationConfig)>
	//    6   12:areturn         
	}

	public ObjectReader without(FormatFeature formatfeature)
	{
		return _with(_config.without(formatfeature));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #61  <Field DeserializationConfig _config>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #796 <Method DeserializationConfig DeserializationConfig.without(FormatFeature)>
	//    5    9:invokevirtual   #694 <Method ObjectReader _with(DeserializationConfig)>
	//    6   12:areturn         
	}

	public ObjectReader without(com.fasterxml.jackson.core.JsonParser.Feature feature)
	{
		return _with(_config.without(feature));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #61  <Field DeserializationConfig _config>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #798 <Method DeserializationConfig DeserializationConfig.without(com.fasterxml.jackson.core.JsonParser$Feature)>
	//    5    9:invokevirtual   #694 <Method ObjectReader _with(DeserializationConfig)>
	//    6   12:areturn         
	}

	public ObjectReader without(DeserializationFeature deserializationfeature)
	{
		return _with(_config.without(deserializationfeature));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #61  <Field DeserializationConfig _config>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #800 <Method DeserializationConfig DeserializationConfig.without(DeserializationFeature)>
	//    5    9:invokevirtual   #694 <Method ObjectReader _with(DeserializationConfig)>
	//    6   12:areturn         
	}

	public transient ObjectReader without(DeserializationFeature deserializationfeature, DeserializationFeature adeserializationfeature[])
	{
		return _with(_config.without(deserializationfeature, adeserializationfeature));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #61  <Field DeserializationConfig _config>
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:invokevirtual   #802 <Method DeserializationConfig DeserializationConfig.without(DeserializationFeature, DeserializationFeature[])>
	//    6   10:invokevirtual   #694 <Method ObjectReader _with(DeserializationConfig)>
	//    7   13:areturn         
	}

	public ObjectReader withoutAttribute(Object obj)
	{
		return _with((DeserializationConfig)_config.withoutAttribute(obj));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #61  <Field DeserializationConfig _config>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #806 <Method com.fasterxml.jackson.databind.cfg.MapperConfigBase DeserializationConfig.withoutAttribute(Object)>
	//    5    9:checkcast       #99  <Class DeserializationConfig>
	//    6   12:invokevirtual   #694 <Method ObjectReader _with(DeserializationConfig)>
	//    7   15:areturn         
	}

	public transient ObjectReader withoutFeatures(FormatFeature aformatfeature[])
	{
		return _with(_config.withoutFeatures(aformatfeature));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #61  <Field DeserializationConfig _config>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #809 <Method DeserializationConfig DeserializationConfig.withoutFeatures(FormatFeature[])>
	//    5    9:invokevirtual   #694 <Method ObjectReader _with(DeserializationConfig)>
	//    6   12:areturn         
	}

	public transient ObjectReader withoutFeatures(com.fasterxml.jackson.core.JsonParser.Feature afeature[])
	{
		return _with(_config.withoutFeatures(afeature));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #61  <Field DeserializationConfig _config>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #811 <Method DeserializationConfig DeserializationConfig.withoutFeatures(com.fasterxml.jackson.core.JsonParser$Feature[])>
	//    5    9:invokevirtual   #694 <Method ObjectReader _with(DeserializationConfig)>
	//    6   12:areturn         
	}

	public transient ObjectReader withoutFeatures(DeserializationFeature adeserializationfeature[])
	{
		return _with(_config.withoutFeatures(adeserializationfeature));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #61  <Field DeserializationConfig _config>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #813 <Method DeserializationConfig DeserializationConfig.withoutFeatures(DeserializationFeature[])>
	//    5    9:invokevirtual   #694 <Method ObjectReader _with(DeserializationConfig)>
	//    6   12:areturn         
	}

	public ObjectReader withoutRootName()
	{
		return _with(_config.withRootName(PropertyName.NO_NAME));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #61  <Field DeserializationConfig _config>
	//    3    5:getstatic       #818 <Field PropertyName PropertyName.NO_NAME>
	//    4    8:invokevirtual   #779 <Method DeserializationConfig DeserializationConfig.withRootName(PropertyName)>
	//    5   11:invokevirtual   #694 <Method ObjectReader _with(DeserializationConfig)>
	//    6   14:areturn         
	}

	public void writeTree(JsonGenerator jsongenerator, TreeNode treenode)
	{
		throw new UnsupportedOperationException();
	//    0    0:new             #822 <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:invokespecial   #823 <Method void UnsupportedOperationException()>
	//    3    7:athrow          
	}

	public void writeValue(JsonGenerator jsongenerator, Object obj)
		throws IOException, JsonProcessingException
	{
		throw new UnsupportedOperationException("Not implemented for ObjectReader");
	//    0    0:new             #822 <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:ldc2            #827 <String "Not implemented for ObjectReader">
	//    3    7:invokespecial   #828 <Method void UnsupportedOperationException(String)>
	//    4   10:athrow          
	}

	private static final JavaType JSON_NODE_TYPE = SimpleType.constructUnsafe(com/fasterxml/jackson/databind/JsonNode);
	private static final long serialVersionUID = 1L;
	protected final DeserializationConfig _config;
	protected final DefaultDeserializationContext _context;
	protected final DataFormatReaders _dataFormatReaders;
	private final TokenFilter _filter;
	protected final InjectableValues _injectableValues;
	protected final JsonFactory _parserFactory;
	protected final JsonDeserializer _rootDeserializer;
	protected final ConcurrentHashMap _rootDeserializers;
	protected final FormatSchema _schema;
	protected final boolean _unwrapRoot;
	protected final Object _valueToUpdate;
	protected final JavaType _valueType;

	static 
	{
	//    0    0:ldc1            #43  <Class JsonNode>
	//    1    2:invokestatic    #49  <Method SimpleType SimpleType.constructUnsafe(Class)>
	//    2    5:putstatic       #51  <Field JavaType JSON_NODE_TYPE>
	//*   3    8:return          
	}
}
