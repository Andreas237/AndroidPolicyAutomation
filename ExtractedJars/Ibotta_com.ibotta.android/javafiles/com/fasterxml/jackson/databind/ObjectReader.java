// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.core.filter.FilteringParserDelegate;
import com.fasterxml.jackson.core.filter.TokenFilter;
import com.fasterxml.jackson.databind.cfg.PackageVersion;
import com.fasterxml.jackson.databind.deser.DataFormatReaders;
import com.fasterxml.jackson.databind.deser.DefaultDeserializationContext;
import com.fasterxml.jackson.databind.node.TreeTraversingParser;
import com.fasterxml.jackson.databind.type.SimpleType;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.io.*;
import java.util.concurrent.ConcurrentHashMap;

// Referenced classes of package com.fasterxml.jackson.databind:
//			JsonNode, ObjectMapper, DeserializationConfig, JsonDeserializer, 
//			DeserializationFeature, JsonMappingException, JavaType, DeserializationContext, 
//			PropertyName, InjectableValues

public class ObjectReader extends ObjectCodec
	implements Versioned, Serializable
{

	protected ObjectReader(ObjectMapper objectmapper, DeserializationConfig deserializationconfig, JavaType javatype, Object obj, FormatSchema formatschema, InjectableValues injectablevalues)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #56  <Method void ObjectCodec()>
		_config = deserializationconfig;
	//    2    4:aload_0         
	//    3    5:aload_2         
	//    4    6:putfield        #58  <Field DeserializationConfig _config>
		_context = objectmapper._deserializationContext;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:getfield        #63  <Field DefaultDeserializationContext ObjectMapper._deserializationContext>
	//    8   14:putfield        #65  <Field DefaultDeserializationContext _context>
		_rootDeserializers = objectmapper._rootDeserializers;
	//    9   17:aload_0         
	//   10   18:aload_1         
	//   11   19:getfield        #67  <Field ConcurrentHashMap ObjectMapper._rootDeserializers>
	//   12   22:putfield        #68  <Field ConcurrentHashMap _rootDeserializers>
		_parserFactory = objectmapper._jsonFactory;
	//   13   25:aload_0         
	//   14   26:aload_1         
	//   15   27:getfield        #71  <Field JsonFactory ObjectMapper._jsonFactory>
	//   16   30:putfield        #73  <Field JsonFactory _parserFactory>
		_valueType = javatype;
	//   17   33:aload_0         
	//   18   34:aload_3         
	//   19   35:putfield        #75  <Field JavaType _valueType>
		_valueToUpdate = obj;
	//   20   38:aload_0         
	//   21   39:aload           4
	//   22   41:putfield        #77  <Field Object _valueToUpdate>
		_schema = formatschema;
	//   23   44:aload_0         
	//   24   45:aload           5
	//   25   47:putfield        #79  <Field FormatSchema _schema>
		_injectableValues = injectablevalues;
	//   26   50:aload_0         
	//   27   51:aload           6
	//   28   53:putfield        #81  <Field InjectableValues _injectableValues>
		_unwrapRoot = deserializationconfig.useRootWrapping();
	//   29   56:aload_0         
	//   30   57:aload_2         
	//   31   58:invokevirtual   #87  <Method boolean DeserializationConfig.useRootWrapping()>
	//   32   61:putfield        #89  <Field boolean _unwrapRoot>
		_rootDeserializer = _prefetchRootDeserializer(javatype);
	//   33   64:aload_0         
	//   34   65:aload_0         
	//   35   66:aload_3         
	//   36   67:invokevirtual   #93  <Method JsonDeserializer _prefetchRootDeserializer(JavaType)>
	//   37   70:putfield        #95  <Field JsonDeserializer _rootDeserializer>
		_dataFormatReaders = null;
	//   38   73:aload_0         
	//   39   74:aconst_null     
	//   40   75:putfield        #97  <Field DataFormatReaders _dataFormatReaders>
		_filter = null;
	//   41   78:aload_0         
	//   42   79:aconst_null     
	//   43   80:putfield        #99  <Field TokenFilter _filter>
	//   44   83:return          
	}

	protected ObjectReader(ObjectReader objectreader, DeserializationConfig deserializationconfig, JavaType javatype, JsonDeserializer jsondeserializer, Object obj, FormatSchema formatschema, InjectableValues injectablevalues, 
			DataFormatReaders dataformatreaders)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #56  <Method void ObjectCodec()>
		_config = deserializationconfig;
	//    2    4:aload_0         
	//    3    5:aload_2         
	//    4    6:putfield        #58  <Field DeserializationConfig _config>
		_context = objectreader._context;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:getfield        #65  <Field DefaultDeserializationContext _context>
	//    8   14:putfield        #65  <Field DefaultDeserializationContext _context>
		_rootDeserializers = objectreader._rootDeserializers;
	//    9   17:aload_0         
	//   10   18:aload_1         
	//   11   19:getfield        #68  <Field ConcurrentHashMap _rootDeserializers>
	//   12   22:putfield        #68  <Field ConcurrentHashMap _rootDeserializers>
		_parserFactory = objectreader._parserFactory;
	//   13   25:aload_0         
	//   14   26:aload_1         
	//   15   27:getfield        #73  <Field JsonFactory _parserFactory>
	//   16   30:putfield        #73  <Field JsonFactory _parserFactory>
		_valueType = javatype;
	//   17   33:aload_0         
	//   18   34:aload_3         
	//   19   35:putfield        #75  <Field JavaType _valueType>
		_rootDeserializer = jsondeserializer;
	//   20   38:aload_0         
	//   21   39:aload           4
	//   22   41:putfield        #95  <Field JsonDeserializer _rootDeserializer>
		_valueToUpdate = obj;
	//   23   44:aload_0         
	//   24   45:aload           5
	//   25   47:putfield        #77  <Field Object _valueToUpdate>
		_schema = formatschema;
	//   26   50:aload_0         
	//   27   51:aload           6
	//   28   53:putfield        #79  <Field FormatSchema _schema>
		_injectableValues = injectablevalues;
	//   29   56:aload_0         
	//   30   57:aload           7
	//   31   59:putfield        #81  <Field InjectableValues _injectableValues>
		_unwrapRoot = deserializationconfig.useRootWrapping();
	//   32   62:aload_0         
	//   33   63:aload_2         
	//   34   64:invokevirtual   #87  <Method boolean DeserializationConfig.useRootWrapping()>
	//   35   67:putfield        #89  <Field boolean _unwrapRoot>
		_dataFormatReaders = dataformatreaders;
	//   36   70:aload_0         
	//   37   71:aload           8
	//   38   73:putfield        #97  <Field DataFormatReaders _dataFormatReaders>
		_filter = objectreader._filter;
	//   39   76:aload_0         
	//   40   77:aload_1         
	//   41   78:getfield        #99  <Field TokenFilter _filter>
	//   42   81:putfield        #99  <Field TokenFilter _filter>
	//   43   84:return          
	}

	protected Object _bind(JsonParser jsonparser, Object obj)
		throws IOException
	{
		DefaultDeserializationContext defaultdeserializationcontext = createDeserializationContext(jsonparser);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #110 <Method DefaultDeserializationContext createDeserializationContext(JsonParser)>
	//    3    5:astore          4
		JsonToken jsontoken = _initForReading(((DeserializationContext) (defaultdeserializationcontext)), jsonparser);
	//    4    7:aload_0         
	//    5    8:aload           4
	//    6   10:aload_1         
	//    7   11:invokevirtual   #114 <Method JsonToken _initForReading(DeserializationContext, JsonParser)>
	//    8   14:astore          5
		Object obj1;
		if(jsontoken == JsonToken.VALUE_NULL)
	//*   9   16:aload           5
	//*  10   18:getstatic       #120 <Field JsonToken JsonToken.VALUE_NULL>
	//*  11   21:if_acmpne       45
		{
			obj1 = obj;
	//   12   24:aload_2         
	//   13   25:astore_3        
			if(obj == null)
	//*  14   26:aload_2         
	//*  15   27:ifnonnull       122
				obj1 = _findRootDeserializer(((DeserializationContext) (defaultdeserializationcontext))).getNullValue(((DeserializationContext) (defaultdeserializationcontext)));
	//   16   30:aload_0         
	//   17   31:aload           4
	//   18   33:invokevirtual   #124 <Method JsonDeserializer _findRootDeserializer(DeserializationContext)>
	//   19   36:aload           4
	//   20   38:invokevirtual   #130 <Method Object JsonDeserializer.getNullValue(DeserializationContext)>
	//   21   41:astore_3        
		} else
	//*  22   42:goto            122
		{
			obj1 = obj;
	//   23   45:aload_2         
	//   24   46:astore_3        
			if(jsontoken != JsonToken.END_ARRAY)
	//*  25   47:aload           5
	//*  26   49:getstatic       #133 <Field JsonToken JsonToken.END_ARRAY>
	//*  27   52:if_acmpeq       122
				if(jsontoken == JsonToken.END_OBJECT)
	//*  28   55:aload           5
	//*  29   57:getstatic       #136 <Field JsonToken JsonToken.END_OBJECT>
	//*  30   60:if_acmpne       68
				{
					obj1 = obj;
	//   31   63:aload_2         
	//   32   64:astore_3        
				} else
	//*  33   65:goto            122
				{
					obj1 = ((Object) (_findRootDeserializer(((DeserializationContext) (defaultdeserializationcontext)))));
	//   34   68:aload_0         
	//   35   69:aload           4
	//   36   71:invokevirtual   #124 <Method JsonDeserializer _findRootDeserializer(DeserializationContext)>
	//   37   74:astore_3        
					if(_unwrapRoot)
	//*  38   75:aload_0         
	//*  39   76:getfield        #89  <Field boolean _unwrapRoot>
	//*  40   79:ifeq            98
						obj1 = _unwrapAndDeserialize(jsonparser, ((DeserializationContext) (defaultdeserializationcontext)), _valueType, ((JsonDeserializer) (obj1)));
	//   41   82:aload_0         
	//   42   83:aload_1         
	//   43   84:aload           4
	//   44   86:aload_0         
	//   45   87:getfield        #75  <Field JavaType _valueType>
	//   46   90:aload_3         
	//   47   91:invokevirtual   #140 <Method Object _unwrapAndDeserialize(JsonParser, DeserializationContext, JavaType, JsonDeserializer)>
	//   48   94:astore_3        
					else
	//*  49   95:goto            122
					if(obj == null)
	//*  50   98:aload_2         
	//*  51   99:ifnonnull       113
						obj1 = ((JsonDeserializer) (obj1)).deserialize(jsonparser, ((DeserializationContext) (defaultdeserializationcontext)));
	//   52  102:aload_3         
	//   53  103:aload_1         
	//   54  104:aload           4
	//   55  106:invokevirtual   #144 <Method Object JsonDeserializer.deserialize(JsonParser, DeserializationContext)>
	//   56  109:astore_3        
					else
	//*  57  110:goto            122
						obj1 = ((JsonDeserializer) (obj1)).deserialize(jsonparser, ((DeserializationContext) (defaultdeserializationcontext)), obj);
	//   58  113:aload_3         
	//   59  114:aload_1         
	//   60  115:aload           4
	//   61  117:aload_2         
	//   62  118:invokevirtual   #147 <Method Object JsonDeserializer.deserialize(JsonParser, DeserializationContext, Object)>
	//   63  121:astore_3        
				}
		}
		jsonparser.clearCurrentToken();
	//   64  122:aload_1         
	//   65  123:invokevirtual   #152 <Method void JsonParser.clearCurrentToken()>
		if(_config.isEnabled(DeserializationFeature.FAIL_ON_TRAILING_TOKENS))
	//*  66  126:aload_0         
	//*  67  127:getfield        #58  <Field DeserializationConfig _config>
	//*  68  130:getstatic       #158 <Field DeserializationFeature DeserializationFeature.FAIL_ON_TRAILING_TOKENS>
	//*  69  133:invokevirtual   #162 <Method boolean DeserializationConfig.isEnabled(DeserializationFeature)>
	//*  70  136:ifeq            150
			_verifyNoTrailingTokens(jsonparser, ((DeserializationContext) (defaultdeserializationcontext)), _valueType);
	//   71  139:aload_0         
	//   72  140:aload_1         
	//   73  141:aload           4
	//   74  143:aload_0         
	//   75  144:getfield        #75  <Field JavaType _valueType>
	//   76  147:invokevirtual   #166 <Method void _verifyNoTrailingTokens(JsonParser, DeserializationContext, JavaType)>
		return obj1;
	//   77  150:aload_3         
	//   78  151:areturn         
	}

	protected Object _bindAndClose(JsonParser jsonparser)
		throws IOException
	{
		Throwable throwable;
		Object obj2;
		obj2 = null;
	//    0    0:aconst_null     
	//    1    1:astore          4
		throwable = ((Throwable) (obj2));
	//    2    3:aload           4
	//    3    5:astore_3        
		DefaultDeserializationContext defaultdeserializationcontext = createDeserializationContext(jsonparser);
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:invokevirtual   #110 <Method DefaultDeserializationContext createDeserializationContext(JsonParser)>
	//    7   11:astore          5
		throwable = ((Throwable) (obj2));
	//    8   13:aload           4
	//    9   15:astore_3        
		Object obj = ((Object) (_initForReading(((DeserializationContext) (defaultdeserializationcontext)), jsonparser)));
	//   10   16:aload_0         
	//   11   17:aload           5
	//   12   19:aload_1         
	//   13   20:invokevirtual   #114 <Method JsonToken _initForReading(DeserializationContext, JsonParser)>
	//   14   23:astore_2        
		throwable = ((Throwable) (obj2));
	//   15   24:aload           4
	//   16   26:astore_3        
		if(obj != JsonToken.VALUE_NULL) goto _L2; else goto _L1
	//   17   27:aload_2         
	//   18   28:getstatic       #120 <Field JsonToken JsonToken.VALUE_NULL>
	//   19   31:if_acmpne       73
_L1:
		throwable = ((Throwable) (obj2));
	//   20   34:aload           4
	//   21   36:astore_3        
		if(_valueToUpdate != null) goto _L4; else goto _L3
	//   22   37:aload_0         
	//   23   38:getfield        #77  <Field Object _valueToUpdate>
	//   24   41:ifnonnull       62
_L3:
		throwable = ((Throwable) (obj2));
	//   25   44:aload           4
	//   26   46:astore_3        
		Object obj1;
		try
		{
			obj = _findRootDeserializer(((DeserializationContext) (defaultdeserializationcontext))).getNullValue(((DeserializationContext) (defaultdeserializationcontext)));
	//   27   47:aload_0         
	//   28   48:aload           5
	//   29   50:invokevirtual   #124 <Method JsonDeserializer _findRootDeserializer(DeserializationContext)>
	//   30   53:aload           5
	//   31   55:invokevirtual   #130 <Method Object JsonDeserializer.getNullValue(DeserializationContext)>
	//   32   58:astore_2        
			break MISSING_BLOCK_LABEL_193;
	//   33   59:goto            193
		}
	//*  34   62:aload           4
	//*  35   64:astore_3        
	//*  36   65:aload_0         
	//*  37   66:getfield        #77  <Field Object _valueToUpdate>
	//*  38   69:astore_2        
	//*  39   70:goto            193
	//*  40   73:aload           4
	//*  41   75:astore_3        
	//*  42   76:aload_2         
	//*  43   77:getstatic       #133 <Field JsonToken JsonToken.END_ARRAY>
	//*  44   80:if_acmpeq       185
	//*  45   83:aload           4
	//*  46   85:astore_3        
	//*  47   86:aload_2         
	//*  48   87:getstatic       #136 <Field JsonToken JsonToken.END_OBJECT>
	//*  49   90:if_acmpne       96
	//*  50   93:goto            185
	//*  51   96:aload           4
	//*  52   98:astore_3        
	//*  53   99:aload_0         
	//*  54  100:aload           5
	//*  55  102:invokevirtual   #124 <Method JsonDeserializer _findRootDeserializer(DeserializationContext)>
	//*  56  105:astore_2        
	//*  57  106:aload           4
	//*  58  108:astore_3        
	//*  59  109:aload_0         
	//*  60  110:getfield        #89  <Field boolean _unwrapRoot>
	//*  61  113:ifeq            135
	//*  62  116:aload           4
	//*  63  118:astore_3        
	//*  64  119:aload_0         
	//*  65  120:aload_1         
	//*  66  121:aload           5
	//*  67  123:aload_0         
	//*  68  124:getfield        #75  <Field JavaType _valueType>
	//*  69  127:aload_2         
	//*  70  128:invokevirtual   #140 <Method Object _unwrapAndDeserialize(JsonParser, DeserializationContext, JavaType, JsonDeserializer)>
	//*  71  131:astore_2        
	//*  72  132:goto            193
	//*  73  135:aload           4
	//*  74  137:astore_3        
	//*  75  138:aload_0         
	//*  76  139:getfield        #77  <Field Object _valueToUpdate>
	//*  77  142:ifnonnull       159
	//*  78  145:aload           4
	//*  79  147:astore_3        
	//*  80  148:aload_2         
	//*  81  149:aload_1         
	//*  82  150:aload           5
	//*  83  152:invokevirtual   #144 <Method Object JsonDeserializer.deserialize(JsonParser, DeserializationContext)>
	//*  84  155:astore_2        
	//*  85  156:goto            193
	//*  86  159:aload           4
	//*  87  161:astore_3        
	//*  88  162:aload_2         
	//*  89  163:aload_1         
	//*  90  164:aload           5
	//*  91  166:aload_0         
	//*  92  167:getfield        #77  <Field Object _valueToUpdate>
	//*  93  170:invokevirtual   #147 <Method Object JsonDeserializer.deserialize(JsonParser, DeserializationContext, Object)>
	//*  94  173:pop             
	//*  95  174:aload           4
	//*  96  176:astore_3        
	//*  97  177:aload_0         
	//*  98  178:getfield        #77  <Field Object _valueToUpdate>
	//*  99  181:astore_2        
	//* 100  182:goto            193
	//* 101  185:aload           4
	//* 102  187:astore_3        
	//* 103  188:aload_0         
	//* 104  189:getfield        #77  <Field Object _valueToUpdate>
	//* 105  192:astore_2        
	//* 106  193:aload           4
	//* 107  195:astore_3        
	//* 108  196:aload_0         
	//* 109  197:getfield        #58  <Field DeserializationConfig _config>
	//* 110  200:getstatic       #158 <Field DeserializationFeature DeserializationFeature.FAIL_ON_TRAILING_TOKENS>
	//* 111  203:invokevirtual   #162 <Method boolean DeserializationConfig.isEnabled(DeserializationFeature)>
	//* 112  206:ifeq            223
	//* 113  209:aload           4
	//* 114  211:astore_3        
	//* 115  212:aload_0         
	//* 116  213:aload_1         
	//* 117  214:aload           5
	//* 118  216:aload_0         
	//* 119  217:getfield        #75  <Field JavaType _valueType>
	//* 120  220:invokevirtual   #166 <Method void _verifyNoTrailingTokens(JsonParser, DeserializationContext, JavaType)>
	//* 121  223:aload_1         
	//* 122  224:ifnull          231
	//* 123  227:aload_1         
	//* 124  228:invokevirtual   #174 <Method void JsonParser.close()>
	//* 125  231:aload_2         
	//* 126  232:areturn         
	//* 127  233:astore_2        
	//* 128  234:goto            242
		// Misplaced declaration of an exception variable
		catch(Object obj1)
	//* 129  237:astore_2        
		{
			throwable = ((Throwable) (obj1));
	//  130  238:aload_2         
	//  131  239:astore_3        
		}
		  goto _L5
_L4:
		throwable = ((Throwable) (obj2));
		obj = _valueToUpdate;
		break MISSING_BLOCK_LABEL_193;
_L2:
		throwable = ((Throwable) (obj2));
		if(obj == JsonToken.END_ARRAY)
			break MISSING_BLOCK_LABEL_185;
		throwable = ((Throwable) (obj2));
		if(obj == JsonToken.END_OBJECT)
			break MISSING_BLOCK_LABEL_185;
		throwable = ((Throwable) (obj2));
		obj = ((Object) (_findRootDeserializer(((DeserializationContext) (defaultdeserializationcontext)))));
		throwable = ((Throwable) (obj2));
		if(!_unwrapRoot)
			break MISSING_BLOCK_LABEL_135;
		throwable = ((Throwable) (obj2));
		obj = _unwrapAndDeserialize(jsonparser, ((DeserializationContext) (defaultdeserializationcontext)), _valueType, ((JsonDeserializer) (obj)));
		break MISSING_BLOCK_LABEL_193;
		throwable = ((Throwable) (obj2));
		if(_valueToUpdate != null)
			break MISSING_BLOCK_LABEL_159;
		throwable = ((Throwable) (obj2));
		obj = ((JsonDeserializer) (obj)).deserialize(jsonparser, ((DeserializationContext) (defaultdeserializationcontext)));
		break MISSING_BLOCK_LABEL_193;
		throwable = ((Throwable) (obj2));
		((JsonDeserializer) (obj)).deserialize(jsonparser, ((DeserializationContext) (defaultdeserializationcontext)), _valueToUpdate);
		throwable = ((Throwable) (obj2));
		obj = _valueToUpdate;
		break MISSING_BLOCK_LABEL_193;
		throwable = ((Throwable) (obj2));
		obj = _valueToUpdate;
		throwable = ((Throwable) (obj2));
		if(!_config.isEnabled(DeserializationFeature.FAIL_ON_TRAILING_TOKENS))
			break MISSING_BLOCK_LABEL_223;
		throwable = ((Throwable) (obj2));
		_verifyNoTrailingTokens(jsonparser, ((DeserializationContext) (defaultdeserializationcontext)), _valueType);
		if(jsonparser != null)
			jsonparser.close();
		return obj;
		obj1;
		break MISSING_BLOCK_LABEL_242;
_L5:
		throw obj1;
	//  132  240:aload_2         
	//  133  241:athrow          
		if(jsonparser != null)
	//* 134  242:aload_1         
	//* 135  243:ifnull          270
			if(throwable != null)
	//* 136  246:aload_3         
	//* 137  247:ifnull          266
				try
				{
					jsonparser.close();
	//  138  250:aload_1         
	//  139  251:invokevirtual   #174 <Method void JsonParser.close()>
				}
	//* 140  254:goto            270
				// Misplaced declaration of an exception variable
				catch(JsonParser jsonparser)
	//* 141  257:astore_1        
				{
					throwable.addSuppressed(((Throwable) (jsonparser)));
	//  142  258:aload_3         
	//  143  259:aload_1         
	//  144  260:invokevirtual   #178 <Method void Throwable.addSuppressed(Throwable)>
				}
			else
	//* 145  263:goto            270
				jsonparser.close();
	//  146  266:aload_1         
	//  147  267:invokevirtual   #174 <Method void JsonParser.close()>
		throw obj1;
	//  148  270:aload_2         
	//  149  271:athrow          
	}

	protected JsonParser _considerFilter(JsonParser jsonparser, boolean flag)
	{
		Object obj = ((Object) (jsonparser));
	//    0    0:aload_1         
	//    1    1:astore_3        
		if(_filter != null)
	//*   2    2:aload_0         
	//*   3    3:getfield        #99  <Field TokenFilter _filter>
	//*   4    6:ifnull          35
		{
			if(((Class) (com/fasterxml/jackson/core/filter/FilteringParserDelegate)).isInstance(((Object) (jsonparser))))
	//*   5    9:ldc1            #182 <Class FilteringParserDelegate>
	//*   6   11:aload_1         
	//*   7   12:invokevirtual   #188 <Method boolean Class.isInstance(Object)>
	//*   8   15:ifeq            20
				return jsonparser;
	//    9   18:aload_1         
	//   10   19:areturn         
			obj = ((Object) (new FilteringParserDelegate(jsonparser, _filter, false, flag)));
	//   11   20:new             #182 <Class FilteringParserDelegate>
	//   12   23:dup             
	//   13   24:aload_1         
	//   14   25:aload_0         
	//   15   26:getfield        #99  <Field TokenFilter _filter>
	//   16   29:iconst_0        
	//   17   30:iload_2         
	//   18   31:invokespecial   #191 <Method void FilteringParserDelegate(JsonParser, TokenFilter, boolean, boolean)>
	//   19   34:astore_3        
		}
		return ((JsonParser) (obj));
	//   20   35:aload_3         
	//   21   36:areturn         
	}

	protected Object _detectBindAndClose(com.fasterxml.jackson.databind.deser.DataFormatReaders.Match match, boolean flag)
		throws IOException
	{
		if(!match.hasMatch())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #198 <Method boolean com.fasterxml.jackson.databind.deser.DataFormatReaders$Match.hasMatch()>
	//*   2    4:ifne            16
			_reportUnkownFormat(_dataFormatReaders, match);
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #97  <Field DataFormatReaders _dataFormatReaders>
	//    6   12:aload_1         
	//    7   13:invokevirtual   #202 <Method void _reportUnkownFormat(DataFormatReaders, com.fasterxml.jackson.databind.deser.DataFormatReaders$Match)>
		JsonParser jsonparser = match.createParserWithMatch();
	//    8   16:aload_1         
	//    9   17:invokevirtual   #206 <Method JsonParser com.fasterxml.jackson.databind.deser.DataFormatReaders$Match.createParserWithMatch()>
	//   10   20:astore_3        
		if(flag)
	//*  11   21:iload_2         
	//*  12   22:ifeq            33
			jsonparser.enable(com.fasterxml.jackson.core.JsonParser.Feature.AUTO_CLOSE_SOURCE);
	//   13   25:aload_3         
	//   14   26:getstatic       #212 <Field com.fasterxml.jackson.core.JsonParser$Feature com.fasterxml.jackson.core.JsonParser$Feature.AUTO_CLOSE_SOURCE>
	//   15   29:invokevirtual   #216 <Method JsonParser JsonParser.enable(com.fasterxml.jackson.core.JsonParser$Feature)>
	//   16   32:pop             
		return match.getReader()._bindAndClose(jsonparser);
	//   17   33:aload_1         
	//   18   34:invokevirtual   #220 <Method ObjectReader com.fasterxml.jackson.databind.deser.DataFormatReaders$Match.getReader()>
	//   19   37:aload_3         
	//   20   38:invokevirtual   #222 <Method Object _bindAndClose(JsonParser)>
	//   21   41:areturn         
	}

	protected JsonDeserializer _findRootDeserializer(DeserializationContext deserializationcontext)
		throws JsonMappingException
	{
		Object obj = ((Object) (_rootDeserializer));
	//    0    0:aload_0         
	//    1    1:getfield        #95  <Field JsonDeserializer _rootDeserializer>
	//    2    4:astore_2        
		if(obj != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          11
			return ((JsonDeserializer) (obj));
	//    5    9:aload_2         
	//    6   10:areturn         
		obj = ((Object) (_valueType));
	//    7   11:aload_0         
	//    8   12:getfield        #75  <Field JavaType _valueType>
	//    9   15:astore_2        
		if(obj == null)
	//*  10   16:aload_2         
	//*  11   17:ifnonnull       31
			deserializationcontext.reportBadDefinition((JavaType)null, "No value type configured for ObjectReader");
	//   12   20:aload_1         
	//   13   21:aconst_null     
	//   14   22:checkcast       #226 <Class JavaType>
	//   15   25:ldc1            #228 <String "No value type configured for ObjectReader">
	//   16   27:invokevirtual   #234 <Method Object DeserializationContext.reportBadDefinition(JavaType, String)>
	//   17   30:pop             
		JsonDeserializer jsondeserializer = (JsonDeserializer)_rootDeserializers.get(obj);
	//   18   31:aload_0         
	//   19   32:getfield        #68  <Field ConcurrentHashMap _rootDeserializers>
	//   20   35:aload_2         
	//   21   36:invokevirtual   #240 <Method Object ConcurrentHashMap.get(Object)>
	//   22   39:checkcast       #126 <Class JsonDeserializer>
	//   23   42:astore_3        
		if(jsondeserializer != null)
	//*  24   43:aload_3         
	//*  25   44:ifnull          49
			return jsondeserializer;
	//   26   47:aload_3         
	//   27   48:areturn         
		jsondeserializer = deserializationcontext.findRootValueDeserializer(((JavaType) (obj)));
	//   28   49:aload_1         
	//   29   50:aload_2         
	//   30   51:invokevirtual   #243 <Method JsonDeserializer DeserializationContext.findRootValueDeserializer(JavaType)>
	//   31   54:astore_3        
		if(jsondeserializer == null)
	//*  32   55:aload_3         
	//*  33   56:ifnonnull       94
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   34   59:new             #245 <Class StringBuilder>
	//   35   62:dup             
	//   36   63:invokespecial   #246 <Method void StringBuilder()>
	//   37   66:astore          4
			stringbuilder.append("Cannot find a deserializer for type ");
	//   38   68:aload           4
	//   39   70:ldc1            #248 <String "Cannot find a deserializer for type ">
	//   40   72:invokevirtual   #252 <Method StringBuilder StringBuilder.append(String)>
	//   41   75:pop             
			stringbuilder.append(obj);
	//   42   76:aload           4
	//   43   78:aload_2         
	//   44   79:invokevirtual   #255 <Method StringBuilder StringBuilder.append(Object)>
	//   45   82:pop             
			deserializationcontext.reportBadDefinition(((JavaType) (obj)), stringbuilder.toString());
	//   46   83:aload_1         
	//   47   84:aload_2         
	//   48   85:aload           4
	//   49   87:invokevirtual   #259 <Method String StringBuilder.toString()>
	//   50   90:invokevirtual   #234 <Method Object DeserializationContext.reportBadDefinition(JavaType, String)>
	//   51   93:pop             
		}
		_rootDeserializers.put(obj, ((Object) (jsondeserializer)));
	//   52   94:aload_0         
	//   53   95:getfield        #68  <Field ConcurrentHashMap _rootDeserializers>
	//   54   98:aload_2         
	//   55   99:aload_3         
	//   56  100:invokevirtual   #263 <Method Object ConcurrentHashMap.put(Object, Object)>
	//   57  103:pop             
		return jsondeserializer;
	//   58  104:aload_3         
	//   59  105:areturn         
	}

	protected JsonToken _initForReading(DeserializationContext deserializationcontext, JsonParser jsonparser)
		throws IOException
	{
		Object obj = ((Object) (_schema));
	//    0    0:aload_0         
	//    1    1:getfield        #79  <Field FormatSchema _schema>
	//    2    4:astore_3        
		if(obj != null)
	//*   3    5:aload_3         
	//*   4    6:ifnull          14
			jsonparser.setSchema(((FormatSchema) (obj)));
	//    5    9:aload_2         
	//    6   10:aload_3         
	//    7   11:invokevirtual   #268 <Method void JsonParser.setSchema(FormatSchema)>
		_config.initialize(jsonparser);
	//    8   14:aload_0         
	//    9   15:getfield        #58  <Field DeserializationConfig _config>
	//   10   18:aload_2         
	//   11   19:invokevirtual   #272 <Method void DeserializationConfig.initialize(JsonParser)>
		JsonToken jsontoken = jsonparser.getCurrentToken();
	//   12   22:aload_2         
	//   13   23:invokevirtual   #276 <Method JsonToken JsonParser.getCurrentToken()>
	//   14   26:astore          4
		obj = ((Object) (jsontoken));
	//   15   28:aload           4
	//   16   30:astore_3        
		if(jsontoken == null)
	//*  17   31:aload           4
	//*  18   33:ifnonnull       65
		{
			jsonparser = ((JsonParser) (jsonparser.nextToken()));
	//   19   36:aload_2         
	//   20   37:invokevirtual   #279 <Method JsonToken JsonParser.nextToken()>
	//   21   40:astore_2        
			obj = ((Object) (jsonparser));
	//   22   41:aload_2         
	//   23   42:astore_3        
			if(jsonparser == null)
	//*  24   43:aload_2         
	//*  25   44:ifnonnull       65
			{
				deserializationcontext.reportInputMismatch(_valueType, "No content to map due to end-of-input", new Object[0]);
	//   26   47:aload_1         
	//   27   48:aload_0         
	//   28   49:getfield        #75  <Field JavaType _valueType>
	//   29   52:ldc2            #281 <String "No content to map due to end-of-input">
	//   30   55:iconst_0        
	//   31   56:anewarray       Object[]
	//   32   59:invokevirtual   #287 <Method Object DeserializationContext.reportInputMismatch(JavaType, String, Object[])>
	//   33   62:pop             
				obj = ((Object) (jsonparser));
	//   34   63:aload_2         
	//   35   64:astore_3        
			}
		}
		return ((JsonToken) (obj));
	//   36   65:aload_3         
	//   37   66:areturn         
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
	//   10   17:invokespecial   #291 <Method void ObjectReader(ObjectReader, DeserializationConfig, JavaType, JsonDeserializer, Object, FormatSchema, InjectableValues, DataFormatReaders)>
	//   11   20:areturn         
	}

	protected JsonDeserializer _prefetchRootDeserializer(JavaType javatype)
	{
		if(javatype != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          67
		{
			if(!_config.isEnabled(DeserializationFeature.EAGER_DESERIALIZER_FETCH))
	//*   2    4:aload_0         
	//*   3    5:getfield        #58  <Field DeserializationConfig _config>
	//*   4    8:getstatic       #297 <Field DeserializationFeature DeserializationFeature.EAGER_DESERIALIZER_FETCH>
	//*   5   11:invokevirtual   #162 <Method boolean DeserializationConfig.isEnabled(DeserializationFeature)>
	//*   6   14:ifne            19
				return null;
	//    7   17:aconst_null     
	//    8   18:areturn         
			JsonDeserializer jsondeserializer = (JsonDeserializer)_rootDeserializers.get(((Object) (javatype)));
	//    9   19:aload_0         
	//   10   20:getfield        #68  <Field ConcurrentHashMap _rootDeserializers>
	//   11   23:aload_1         
	//   12   24:invokevirtual   #240 <Method Object ConcurrentHashMap.get(Object)>
	//   13   27:checkcast       #126 <Class JsonDeserializer>
	//   14   30:astore_2        
			if(jsondeserializer == null)
	//*  15   31:aload_2         
	//*  16   32:ifnonnull       65
			{
				JsonDeserializer jsondeserializer1;
				try
				{
					jsondeserializer1 = ((DeserializationContext) (createDeserializationContext(((JsonParser) (null))))).findRootValueDeserializer(javatype);
	//   17   35:aload_0         
	//   18   36:aconst_null     
	//   19   37:invokevirtual   #110 <Method DefaultDeserializationContext createDeserializationContext(JsonParser)>
	//   20   40:aload_1         
	//   21   41:invokevirtual   #243 <Method JsonDeserializer DeserializationContext.findRootValueDeserializer(JavaType)>
	//   22   44:astore_3        
				}
	//*  23   45:aload_3         
	//*  24   46:ifnull          63
	//*  25   49:aload_0         
	//*  26   50:getfield        #68  <Field ConcurrentHashMap _rootDeserializers>
	//*  27   53:aload_1         
	//*  28   54:aload_3         
	//*  29   55:invokevirtual   #263 <Method Object ConcurrentHashMap.put(Object, Object)>
	//*  30   58:pop             
	//*  31   59:aload_3         
	//*  32   60:areturn         
	//*  33   61:aload_3         
	//*  34   62:areturn         
	//*  35   63:aload_3         
	//*  36   64:areturn         
	//*  37   65:aload_2         
	//*  38   66:areturn         
	//*  39   67:aconst_null     
	//*  40   68:areturn         
				// Misplaced declaration of an exception variable
				catch(JavaType javatype)
	//*  41   69:astore_1        
				{
					return jsondeserializer;
	//   42   70:aload_2         
	//   43   71:areturn         
				}
				if(jsondeserializer1 != null)
				{
					try
					{
						_rootDeserializers.put(((Object) (javatype)), ((Object) (jsondeserializer1)));
					}
					// Misplaced declaration of an exception variable
					catch(JavaType javatype)
					{
						return jsondeserializer1;
					}
					return jsondeserializer1;
				} else
				{
					return jsondeserializer1;
				}
			} else
			{
				return jsondeserializer;
			}
		} else
		{
			return null;
		}
	//*  44   72:astore_1        
	//*  45   73:goto            61
	}

	protected void _reportUndetectableSource(Object obj)
		throws JsonProcessingException
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #245 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #246 <Method void StringBuilder()>
	//    3    7:astore_2        
		stringbuilder.append("Cannot use source of type ");
	//    4    8:aload_2         
	//    5    9:ldc2            #302 <String "Cannot use source of type ">
	//    6   12:invokevirtual   #252 <Method StringBuilder StringBuilder.append(String)>
	//    7   15:pop             
		stringbuilder.append(obj.getClass().getName());
	//    8   16:aload_2         
	//    9   17:aload_1         
	//   10   18:invokevirtual   #306 <Method Class Object.getClass()>
	//   11   21:invokevirtual   #309 <Method String Class.getName()>
	//   12   24:invokevirtual   #252 <Method StringBuilder StringBuilder.append(String)>
	//   13   27:pop             
		stringbuilder.append(" with format auto-detection: must be byte- not char-based");
	//   14   28:aload_2         
	//   15   29:ldc2            #311 <String " with format auto-detection: must be byte- not char-based">
	//   16   32:invokevirtual   #252 <Method StringBuilder StringBuilder.append(String)>
	//   17   35:pop             
		throw new JsonParseException(((JsonParser) (null)), stringbuilder.toString());
	//   18   36:new             #313 <Class JsonParseException>
	//   19   39:dup             
	//   20   40:aconst_null     
	//   21   41:aload_2         
	//   22   42:invokevirtual   #259 <Method String StringBuilder.toString()>
	//   23   45:invokespecial   #316 <Method void JsonParseException(JsonParser, String)>
	//   24   48:athrow          
	}

	protected void _reportUnkownFormat(DataFormatReaders dataformatreaders, com.fasterxml.jackson.databind.deser.DataFormatReaders.Match match)
		throws JsonProcessingException
	{
		match = ((com.fasterxml.jackson.databind.deser.DataFormatReaders.Match) (new StringBuilder()));
	//    0    0:new             #245 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #246 <Method void StringBuilder()>
	//    3    7:astore_2        
		((StringBuilder) (match)).append("Cannot detect format from input, does not look like any of detectable formats ");
	//    4    8:aload_2         
	//    5    9:ldc2            #318 <String "Cannot detect format from input, does not look like any of detectable formats ">
	//    6   12:invokevirtual   #252 <Method StringBuilder StringBuilder.append(String)>
	//    7   15:pop             
		((StringBuilder) (match)).append(dataformatreaders.toString());
	//    8   16:aload_2         
	//    9   17:aload_1         
	//   10   18:invokevirtual   #321 <Method String DataFormatReaders.toString()>
	//   11   21:invokevirtual   #252 <Method StringBuilder StringBuilder.append(String)>
	//   12   24:pop             
		throw new JsonParseException(((JsonParser) (null)), ((StringBuilder) (match)).toString());
	//   13   25:new             #313 <Class JsonParseException>
	//   14   28:dup             
	//   15   29:aconst_null     
	//   16   30:aload_2         
	//   17   31:invokevirtual   #259 <Method String StringBuilder.toString()>
	//   18   34:invokespecial   #316 <Method void JsonParseException(JsonParser, String)>
	//   19   37:athrow          
	}

	protected Object _unwrapAndDeserialize(JsonParser jsonparser, DeserializationContext deserializationcontext, JavaType javatype, JsonDeserializer jsondeserializer)
		throws IOException
	{
		String s = _config.findRootName(javatype).getSimpleName();
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field DeserializationConfig _config>
	//    2    4:aload_3         
	//    3    5:invokevirtual   #325 <Method PropertyName DeserializationConfig.findRootName(JavaType)>
	//    4    8:invokevirtual   #330 <Method String PropertyName.getSimpleName()>
	//    5   11:astore          5
		if(jsonparser.getCurrentToken() != JsonToken.START_OBJECT)
	//*   6   13:aload_1         
	//*   7   14:invokevirtual   #276 <Method JsonToken JsonParser.getCurrentToken()>
	//*   8   17:getstatic       #333 <Field JsonToken JsonToken.START_OBJECT>
	//*   9   20:if_acmpeq       50
			deserializationcontext.reportWrongTokenException(javatype, JsonToken.START_OBJECT, "Current token not START_OBJECT (needed to unwrap root name '%s'), but %s", new Object[] {
				s, jsonparser.getCurrentToken()
			});
	//   10   23:aload_2         
	//   11   24:aload_3         
	//   12   25:getstatic       #333 <Field JsonToken JsonToken.START_OBJECT>
	//   13   28:ldc2            #335 <String "Current token not START_OBJECT (needed to unwrap root name '%s'), but %s">
	//   14   31:iconst_2        
	//   15   32:anewarray       Object[]
	//   16   35:dup             
	//   17   36:iconst_0        
	//   18   37:aload           5
	//   19   39:aastore         
	//   20   40:dup             
	//   21   41:iconst_1        
	//   22   42:aload_1         
	//   23   43:invokevirtual   #276 <Method JsonToken JsonParser.getCurrentToken()>
	//   24   46:aastore         
	//   25   47:invokevirtual   #339 <Method void DeserializationContext.reportWrongTokenException(JavaType, JsonToken, String, Object[])>
		if(jsonparser.nextToken() != JsonToken.FIELD_NAME)
	//*  26   50:aload_1         
	//*  27   51:invokevirtual   #279 <Method JsonToken JsonParser.nextToken()>
	//*  28   54:getstatic       #342 <Field JsonToken JsonToken.FIELD_NAME>
	//*  29   57:if_acmpeq       87
			deserializationcontext.reportWrongTokenException(javatype, JsonToken.FIELD_NAME, "Current token not FIELD_NAME (to contain expected root name '%s'), but %s", new Object[] {
				s, jsonparser.getCurrentToken()
			});
	//   30   60:aload_2         
	//   31   61:aload_3         
	//   32   62:getstatic       #342 <Field JsonToken JsonToken.FIELD_NAME>
	//   33   65:ldc2            #344 <String "Current token not FIELD_NAME (to contain expected root name '%s'), but %s">
	//   34   68:iconst_2        
	//   35   69:anewarray       Object[]
	//   36   72:dup             
	//   37   73:iconst_0        
	//   38   74:aload           5
	//   39   76:aastore         
	//   40   77:dup             
	//   41   78:iconst_1        
	//   42   79:aload_1         
	//   43   80:invokevirtual   #276 <Method JsonToken JsonParser.getCurrentToken()>
	//   44   83:aastore         
	//   45   84:invokevirtual   #339 <Method void DeserializationContext.reportWrongTokenException(JavaType, JsonToken, String, Object[])>
		Object obj = ((Object) (jsonparser.getCurrentName()));
	//   46   87:aload_1         
	//   47   88:invokevirtual   #347 <Method String JsonParser.getCurrentName()>
	//   48   91:astore          6
		if(!s.equals(obj))
	//*  49   93:aload           5
	//*  50   95:aload           6
	//*  51   97:invokevirtual   #352 <Method boolean String.equals(Object)>
	//*  52  100:ifne            130
			deserializationcontext.reportInputMismatch(javatype, "Root name '%s' does not match expected ('%s') for type %s", new Object[] {
				obj, s, javatype
			});
	//   53  103:aload_2         
	//   54  104:aload_3         
	//   55  105:ldc2            #354 <String "Root name '%s' does not match expected ('%s') for type %s">
	//   56  108:iconst_3        
	//   57  109:anewarray       Object[]
	//   58  112:dup             
	//   59  113:iconst_0        
	//   60  114:aload           6
	//   61  116:aastore         
	//   62  117:dup             
	//   63  118:iconst_1        
	//   64  119:aload           5
	//   65  121:aastore         
	//   66  122:dup             
	//   67  123:iconst_2        
	//   68  124:aload_3         
	//   69  125:aastore         
	//   70  126:invokevirtual   #287 <Method Object DeserializationContext.reportInputMismatch(JavaType, String, Object[])>
	//   71  129:pop             
		jsonparser.nextToken();
	//   72  130:aload_1         
	//   73  131:invokevirtual   #279 <Method JsonToken JsonParser.nextToken()>
	//   74  134:pop             
		obj = _valueToUpdate;
	//   75  135:aload_0         
	//   76  136:getfield        #77  <Field Object _valueToUpdate>
	//   77  139:astore          6
		if(obj == null)
	//*  78  141:aload           6
	//*  79  143:ifnonnull       158
		{
			jsondeserializer = ((JsonDeserializer) (jsondeserializer.deserialize(jsonparser, deserializationcontext)));
	//   80  146:aload           4
	//   81  148:aload_1         
	//   82  149:aload_2         
	//   83  150:invokevirtual   #144 <Method Object JsonDeserializer.deserialize(JsonParser, DeserializationContext)>
	//   84  153:astore          4
		} else
	//*  85  155:goto            174
		{
			jsondeserializer.deserialize(jsonparser, deserializationcontext, obj);
	//   86  158:aload           4
	//   87  160:aload_1         
	//   88  161:aload_2         
	//   89  162:aload           6
	//   90  164:invokevirtual   #147 <Method Object JsonDeserializer.deserialize(JsonParser, DeserializationContext, Object)>
	//   91  167:pop             
			jsondeserializer = ((JsonDeserializer) (_valueToUpdate));
	//   92  168:aload_0         
	//   93  169:getfield        #77  <Field Object _valueToUpdate>
	//   94  172:astore          4
		}
		if(jsonparser.nextToken() != JsonToken.END_OBJECT)
	//*  95  174:aload_1         
	//*  96  175:invokevirtual   #279 <Method JsonToken JsonParser.nextToken()>
	//*  97  178:getstatic       #136 <Field JsonToken JsonToken.END_OBJECT>
	//*  98  181:if_acmpeq       211
			deserializationcontext.reportWrongTokenException(javatype, JsonToken.END_OBJECT, "Current token not END_OBJECT (to match wrapper object with root name '%s'), but %s", new Object[] {
				s, jsonparser.getCurrentToken()
			});
	//   99  184:aload_2         
	//  100  185:aload_3         
	//  101  186:getstatic       #136 <Field JsonToken JsonToken.END_OBJECT>
	//  102  189:ldc2            #356 <String "Current token not END_OBJECT (to match wrapper object with root name '%s'), but %s">
	//  103  192:iconst_2        
	//  104  193:anewarray       Object[]
	//  105  196:dup             
	//  106  197:iconst_0        
	//  107  198:aload           5
	//  108  200:aastore         
	//  109  201:dup             
	//  110  202:iconst_1        
	//  111  203:aload_1         
	//  112  204:invokevirtual   #276 <Method JsonToken JsonParser.getCurrentToken()>
	//  113  207:aastore         
	//  114  208:invokevirtual   #339 <Method void DeserializationContext.reportWrongTokenException(JavaType, JsonToken, String, Object[])>
		if(_config.isEnabled(DeserializationFeature.FAIL_ON_TRAILING_TOKENS))
	//* 115  211:aload_0         
	//* 116  212:getfield        #58  <Field DeserializationConfig _config>
	//* 117  215:getstatic       #158 <Field DeserializationFeature DeserializationFeature.FAIL_ON_TRAILING_TOKENS>
	//* 118  218:invokevirtual   #162 <Method boolean DeserializationConfig.isEnabled(DeserializationFeature)>
	//* 119  221:ifeq            234
			_verifyNoTrailingTokens(jsonparser, deserializationcontext, _valueType);
	//  120  224:aload_0         
	//  121  225:aload_1         
	//  122  226:aload_2         
	//  123  227:aload_0         
	//  124  228:getfield        #75  <Field JavaType _valueType>
	//  125  231:invokevirtual   #166 <Method void _verifyNoTrailingTokens(JsonParser, DeserializationContext, JavaType)>
		return ((Object) (jsondeserializer));
	//  126  234:aload           4
	//  127  236:areturn         
	}

	protected final void _verifyNoTrailingTokens(JsonParser jsonparser, DeserializationContext deserializationcontext, JavaType javatype)
		throws IOException
	{
		JsonToken jsontoken = jsonparser.nextToken();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #279 <Method JsonToken JsonParser.nextToken()>
	//    2    4:astore          5
		if(jsontoken != null)
	//*   3    6:aload           5
	//*   4    8:ifnull          54
		{
			Class class1 = ClassUtil.rawClass(javatype);
	//    5   11:aload_3         
	//    6   12:invokestatic    #363 <Method Class ClassUtil.rawClass(JavaType)>
	//    7   15:astore          4
			javatype = ((JavaType) (class1));
	//    8   17:aload           4
	//    9   19:astore_3        
			if(class1 == null)
	//*  10   20:aload           4
	//*  11   22:ifnonnull       45
			{
				Object obj = _valueToUpdate;
	//   12   25:aload_0         
	//   13   26:getfield        #77  <Field Object _valueToUpdate>
	//   14   29:astore          6
				javatype = ((JavaType) (class1));
	//   15   31:aload           4
	//   16   33:astore_3        
				if(obj != null)
	//*  17   34:aload           6
	//*  18   36:ifnull          45
					javatype = ((JavaType) (obj.getClass()));
	//   19   39:aload           6
	//   20   41:invokevirtual   #306 <Method Class Object.getClass()>
	//   21   44:astore_3        
			}
			deserializationcontext.reportTrailingTokens(((Class) (javatype)), jsonparser, jsontoken);
	//   22   45:aload_2         
	//   23   46:aload_3         
	//   24   47:aload_1         
	//   25   48:aload           5
	//   26   50:invokevirtual   #367 <Method Object DeserializationContext.reportTrailingTokens(Class, JsonParser, JsonToken)>
	//   27   53:pop             
		}
	//   28   54:return          
	}

	protected DefaultDeserializationContext createDeserializationContext(JsonParser jsonparser)
	{
		return _context.createInstance(_config, jsonparser, _injectableValues);
	//    0    0:aload_0         
	//    1    1:getfield        #65  <Field DefaultDeserializationContext _context>
	//    2    4:aload_0         
	//    3    5:getfield        #58  <Field DeserializationConfig _config>
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #81  <Field InjectableValues _injectableValues>
	//    7   13:invokevirtual   #373 <Method DefaultDeserializationContext DefaultDeserializationContext.createInstance(DeserializationConfig, JsonParser, InjectableValues)>
	//    8   16:areturn         
	}

	public ObjectReader forType(JavaType javatype)
	{
		if(javatype != null && javatype.equals(((Object) (_valueType))))
	//*   0    0:aload_1         
	//*   1    1:ifnull          17
	//*   2    4:aload_1         
	//*   3    5:aload_0         
	//*   4    6:getfield        #75  <Field JavaType _valueType>
	//*   5    9:invokevirtual   #376 <Method boolean JavaType.equals(Object)>
	//*   6   12:ifeq            17
			return this;
	//    7   15:aload_0         
	//    8   16:areturn         
		JsonDeserializer jsondeserializer = _prefetchRootDeserializer(javatype);
	//    9   17:aload_0         
	//   10   18:aload_1         
	//   11   19:invokevirtual   #93  <Method JsonDeserializer _prefetchRootDeserializer(JavaType)>
	//   12   22:astore_3        
		DataFormatReaders dataformatreaders = _dataFormatReaders;
	//   13   23:aload_0         
	//   14   24:getfield        #97  <Field DataFormatReaders _dataFormatReaders>
	//   15   27:astore_2        
		if(dataformatreaders != null)
	//*  16   28:aload_2         
	//*  17   29:ifnull          41
			dataformatreaders = dataformatreaders.withType(javatype);
	//   18   32:aload_2         
	//   19   33:aload_1         
	//   20   34:invokevirtual   #380 <Method DataFormatReaders DataFormatReaders.withType(JavaType)>
	//   21   37:astore_2        
	//*  22   38:goto            41
		return _new(this, _config, javatype, jsondeserializer, _valueToUpdate, _schema, _injectableValues, dataformatreaders);
	//   23   41:aload_0         
	//   24   42:aload_0         
	//   25   43:aload_0         
	//   26   44:getfield        #58  <Field DeserializationConfig _config>
	//   27   47:aload_1         
	//   28   48:aload_3         
	//   29   49:aload_0         
	//   30   50:getfield        #77  <Field Object _valueToUpdate>
	//   31   53:aload_0         
	//   32   54:getfield        #79  <Field FormatSchema _schema>
	//   33   57:aload_0         
	//   34   58:getfield        #81  <Field InjectableValues _injectableValues>
	//   35   61:aload_2         
	//   36   62:invokevirtual   #382 <Method ObjectReader _new(ObjectReader, DeserializationConfig, JavaType, JsonDeserializer, Object, FormatSchema, InjectableValues, DataFormatReaders)>
	//   37   65:areturn         
	}

	public ObjectReader forType(Class class1)
	{
		return forType(_config.constructType(class1));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #58  <Field DeserializationConfig _config>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #387 <Method JavaType DeserializationConfig.constructType(Class)>
	//    5    9:invokevirtual   #389 <Method ObjectReader forType(JavaType)>
	//    6   12:areturn         
	}

	public JsonFactory getFactory()
	{
		return _parserFactory;
	//    0    0:aload_0         
	//    1    1:getfield        #73  <Field JsonFactory _parserFactory>
	//    2    4:areturn         
	}

	public Object readValue(JsonParser jsonparser)
		throws IOException
	{
		return _bind(jsonparser, _valueToUpdate);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_0         
	//    3    3:getfield        #77  <Field Object _valueToUpdate>
	//    4    6:invokevirtual   #395 <Method Object _bind(JsonParser, Object)>
	//    5    9:areturn         
	}

	public Object readValue(JsonParser jsonparser, Class class1)
		throws IOException
	{
		return forType(class1).readValue(jsonparser);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #399 <Method ObjectReader forType(Class)>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #401 <Method Object readValue(JsonParser)>
	//    5    9:areturn         
	}

	public Object readValue(JsonNode jsonnode)
		throws IOException
	{
		if(_dataFormatReaders != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #97  <Field DataFormatReaders _dataFormatReaders>
	//*   2    4:ifnull          12
			_reportUndetectableSource(((Object) (jsonnode)));
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokevirtual   #405 <Method void _reportUndetectableSource(Object)>
		return _bindAndClose(_considerFilter(treeAsTokens(((TreeNode) (jsonnode))), false));
	//    6   12:aload_0         
	//    7   13:aload_0         
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:invokevirtual   #409 <Method JsonParser treeAsTokens(TreeNode)>
	//   11   19:iconst_0        
	//   12   20:invokevirtual   #411 <Method JsonParser _considerFilter(JsonParser, boolean)>
	//   13   23:invokevirtual   #222 <Method Object _bindAndClose(JsonParser)>
	//   14   26:areturn         
	}

	public Object readValue(InputStream inputstream)
		throws IOException
	{
		DataFormatReaders dataformatreaders = _dataFormatReaders;
	//    0    0:aload_0         
	//    1    1:getfield        #97  <Field DataFormatReaders _dataFormatReaders>
	//    2    4:astore_2        
		if(dataformatreaders != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          20
			return _detectBindAndClose(dataformatreaders.findFormat(inputstream), false);
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:aload_1         
	//    8   12:invokevirtual   #417 <Method com.fasterxml.jackson.databind.deser.DataFormatReaders$Match DataFormatReaders.findFormat(InputStream)>
	//    9   15:iconst_0        
	//   10   16:invokevirtual   #419 <Method Object _detectBindAndClose(com.fasterxml.jackson.databind.deser.DataFormatReaders$Match, boolean)>
	//   11   19:areturn         
		else
			return _bindAndClose(_considerFilter(_parserFactory.createParser(inputstream), false));
	//   12   20:aload_0         
	//   13   21:aload_0         
	//   14   22:aload_0         
	//   15   23:getfield        #73  <Field JsonFactory _parserFactory>
	//   16   26:aload_1         
	//   17   27:invokevirtual   #425 <Method JsonParser JsonFactory.createParser(InputStream)>
	//   18   30:iconst_0        
	//   19   31:invokevirtual   #411 <Method JsonParser _considerFilter(JsonParser, boolean)>
	//   20   34:invokevirtual   #222 <Method Object _bindAndClose(JsonParser)>
	//   21   37:areturn         
	}

	public Object readValue(String s)
		throws IOException
	{
		if(_dataFormatReaders != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #97  <Field DataFormatReaders _dataFormatReaders>
	//*   2    4:ifnull          12
			_reportUndetectableSource(((Object) (s)));
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokevirtual   #405 <Method void _reportUndetectableSource(Object)>
		return _bindAndClose(_considerFilter(_parserFactory.createParser(s), false));
	//    6   12:aload_0         
	//    7   13:aload_0         
	//    8   14:aload_0         
	//    9   15:getfield        #73  <Field JsonFactory _parserFactory>
	//   10   18:aload_1         
	//   11   19:invokevirtual   #430 <Method JsonParser JsonFactory.createParser(String)>
	//   12   22:iconst_0        
	//   13   23:invokevirtual   #411 <Method JsonParser _considerFilter(JsonParser, boolean)>
	//   14   26:invokevirtual   #222 <Method Object _bindAndClose(JsonParser)>
	//   15   29:areturn         
	}

	public JsonParser treeAsTokens(TreeNode treenode)
	{
		ObjectReader objectreader = withValueToUpdate(((Object) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokevirtual   #435 <Method ObjectReader withValueToUpdate(Object)>
	//    3    5:astore_2        
		return ((JsonParser) (new TreeTraversingParser((JsonNode)treenode, ((ObjectCodec) (objectreader)))));
	//    4    6:new             #437 <Class TreeTraversingParser>
	//    5    9:dup             
	//    6   10:aload_1         
	//    7   11:checkcast       #43  <Class JsonNode>
	//    8   14:aload_2         
	//    9   15:invokespecial   #440 <Method void TreeTraversingParser(JsonNode, ObjectCodec)>
	//   10   18:areturn         
	}

	public Version version()
	{
		return PackageVersion.VERSION;
	//    0    0:getstatic       #448 <Field Version PackageVersion.VERSION>
	//    1    3:areturn         
	}

	public ObjectReader withValueToUpdate(Object obj)
	{
		if(obj == _valueToUpdate)
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #77  <Field Object _valueToUpdate>
	//*   3    5:if_acmpne       10
			return this;
	//    4    8:aload_0         
	//    5    9:areturn         
		if(obj == null)
	//*   6   10:aload_1         
	//*   7   11:ifnonnull       45
			return _new(this, _config, _valueType, _rootDeserializer, ((Object) (null)), _schema, _injectableValues, _dataFormatReaders);
	//    8   14:aload_0         
	//    9   15:aload_0         
	//   10   16:aload_0         
	//   11   17:getfield        #58  <Field DeserializationConfig _config>
	//   12   20:aload_0         
	//   13   21:getfield        #75  <Field JavaType _valueType>
	//   14   24:aload_0         
	//   15   25:getfield        #95  <Field JsonDeserializer _rootDeserializer>
	//   16   28:aconst_null     
	//   17   29:aload_0         
	//   18   30:getfield        #79  <Field FormatSchema _schema>
	//   19   33:aload_0         
	//   20   34:getfield        #81  <Field InjectableValues _injectableValues>
	//   21   37:aload_0         
	//   22   38:getfield        #97  <Field DataFormatReaders _dataFormatReaders>
	//   23   41:invokevirtual   #382 <Method ObjectReader _new(ObjectReader, DeserializationConfig, JavaType, JsonDeserializer, Object, FormatSchema, InjectableValues, DataFormatReaders)>
	//   24   44:areturn         
		JavaType javatype = _valueType;
	//   25   45:aload_0         
	//   26   46:getfield        #75  <Field JavaType _valueType>
	//   27   49:astore_2        
		if(javatype == null)
	//*  28   50:aload_2         
	//*  29   51:ifnonnull       69
			javatype = _config.constructType(obj.getClass());
	//   30   54:aload_0         
	//   31   55:getfield        #58  <Field DeserializationConfig _config>
	//   32   58:aload_1         
	//   33   59:invokevirtual   #306 <Method Class Object.getClass()>
	//   34   62:invokevirtual   #387 <Method JavaType DeserializationConfig.constructType(Class)>
	//   35   65:astore_2        
	//*  36   66:goto            69
		return _new(this, _config, javatype, _rootDeserializer, obj, _schema, _injectableValues, _dataFormatReaders);
	//   37   69:aload_0         
	//   38   70:aload_0         
	//   39   71:aload_0         
	//   40   72:getfield        #58  <Field DeserializationConfig _config>
	//   41   75:aload_2         
	//   42   76:aload_0         
	//   43   77:getfield        #95  <Field JsonDeserializer _rootDeserializer>
	//   44   80:aload_1         
	//   45   81:aload_0         
	//   46   82:getfield        #79  <Field FormatSchema _schema>
	//   47   85:aload_0         
	//   48   86:getfield        #81  <Field InjectableValues _injectableValues>
	//   49   89:aload_0         
	//   50   90:getfield        #97  <Field DataFormatReaders _dataFormatReaders>
	//   51   93:invokevirtual   #382 <Method ObjectReader _new(ObjectReader, DeserializationConfig, JavaType, JsonDeserializer, Object, FormatSchema, InjectableValues, DataFormatReaders)>
	//   52   96:areturn         
	}

	public void writeValue(JsonGenerator jsongenerator, Object obj)
		throws IOException
	{
		throw new UnsupportedOperationException("Not implemented for ObjectReader");
	//    0    0:new             #452 <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:ldc2            #454 <String "Not implemented for ObjectReader">
	//    3    7:invokespecial   #457 <Method void UnsupportedOperationException(String)>
	//    4   10:athrow          
	}

	private static final JavaType JSON_NODE_TYPE = SimpleType.constructUnsafe(com/fasterxml/jackson/databind/JsonNode);
	private static final long serialVersionUID = 2L;
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
