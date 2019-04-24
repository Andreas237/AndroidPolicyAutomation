// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.jsontype.impl;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeIdResolver;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.io.IOException;
import java.io.Serializable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

// Referenced classes of package com.fasterxml.jackson.databind.jsontype.impl:
//			TypeIdResolverBase

public abstract class TypeDeserializerBase extends TypeDeserializer
	implements Serializable
{

	protected TypeDeserializerBase(JavaType javatype, TypeIdResolver typeidresolver, String s, boolean flag, Class class1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #32  <Method void TypeDeserializer()>
		_baseType = javatype;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #34  <Field JavaType _baseType>
		_idResolver = typeidresolver;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #36  <Field TypeIdResolver _idResolver>
		typeidresolver = ((TypeIdResolver) (s));
	//    8   14:aload_3         
	//    9   15:astore_2        
		if(s == null)
	//*  10   16:aload_3         
	//*  11   17:ifnonnull       23
			typeidresolver = "";
	//   12   20:ldc1            #38  <String "">
	//   13   22:astore_2        
		_typePropertyName = ((String) (typeidresolver));
	//   14   23:aload_0         
	//   15   24:aload_2         
	//   16   25:putfield        #40  <Field String _typePropertyName>
		_typeIdVisible = flag;
	//   17   28:aload_0         
	//   18   29:iload           4
	//   19   31:putfield        #42  <Field boolean _typeIdVisible>
		_deserializers = ((Map) (new ConcurrentHashMap(16, 0.75F, 2)));
	//   20   34:aload_0         
	//   21   35:new             #44  <Class ConcurrentHashMap>
	//   22   38:dup             
	//   23   39:bipush          16
	//   24   41:ldc1            #45  <Float 0.75F>
	//   25   43:iconst_2        
	//   26   44:invokespecial   #48  <Method void ConcurrentHashMap(int, float, int)>
	//   27   47:putfield        #50  <Field Map _deserializers>
		if(class1 == null)
	//*  28   50:aload           5
	//*  29   52:ifnonnull       66
			_defaultImpl = null;
	//   30   55:aload_0         
	//   31   56:aconst_null     
	//   32   57:putfield        #52  <Field JavaType _defaultImpl>
		else
	//*  33   60:aload_0         
	//*  34   61:aconst_null     
	//*  35   62:putfield        #54  <Field BeanProperty _property>
	//*  36   65:return          
			_defaultImpl = javatype.forcedNarrowBy(class1);
	//   37   66:aload_0         
	//   38   67:aload_1         
	//   39   68:aload           5
	//   40   70:invokevirtual   #60  <Method JavaType JavaType.forcedNarrowBy(Class)>
	//   41   73:putfield        #52  <Field JavaType _defaultImpl>
		_property = null;
	//*  42   76:goto            60
	}

	protected TypeDeserializerBase(TypeDeserializerBase typedeserializerbase, BeanProperty beanproperty)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #32  <Method void TypeDeserializer()>
		_baseType = typedeserializerbase._baseType;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:getfield        #34  <Field JavaType _baseType>
	//    5    9:putfield        #34  <Field JavaType _baseType>
		_idResolver = typedeserializerbase._idResolver;
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:getfield        #36  <Field TypeIdResolver _idResolver>
	//    9   17:putfield        #36  <Field TypeIdResolver _idResolver>
		_typePropertyName = typedeserializerbase._typePropertyName;
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:getfield        #40  <Field String _typePropertyName>
	//   13   25:putfield        #40  <Field String _typePropertyName>
		_typeIdVisible = typedeserializerbase._typeIdVisible;
	//   14   28:aload_0         
	//   15   29:aload_1         
	//   16   30:getfield        #42  <Field boolean _typeIdVisible>
	//   17   33:putfield        #42  <Field boolean _typeIdVisible>
		_deserializers = typedeserializerbase._deserializers;
	//   18   36:aload_0         
	//   19   37:aload_1         
	//   20   38:getfield        #50  <Field Map _deserializers>
	//   21   41:putfield        #50  <Field Map _deserializers>
		_defaultImpl = typedeserializerbase._defaultImpl;
	//   22   44:aload_0         
	//   23   45:aload_1         
	//   24   46:getfield        #52  <Field JavaType _defaultImpl>
	//   25   49:putfield        #52  <Field JavaType _defaultImpl>
		_defaultImplDeserializer = typedeserializerbase._defaultImplDeserializer;
	//   26   52:aload_0         
	//   27   53:aload_1         
	//   28   54:getfield        #66  <Field JsonDeserializer _defaultImplDeserializer>
	//   29   57:putfield        #66  <Field JsonDeserializer _defaultImplDeserializer>
		_property = beanproperty;
	//   30   60:aload_0         
	//   31   61:aload_2         
	//   32   62:putfield        #54  <Field BeanProperty _property>
	//   33   65:return          
	}

	protected Object _deserializeWithNativeTypeId(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException
	{
		return _deserializeWithNativeTypeId(jsonparser, deserializationcontext, jsonparser.getTypeId());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_1         
	//    4    4:invokevirtual   #77  <Method Object JsonParser.getTypeId()>
	//    5    7:invokevirtual   #80  <Method Object _deserializeWithNativeTypeId(JsonParser, DeserializationContext, Object)>
	//    6   10:areturn         
	}

	protected Object _deserializeWithNativeTypeId(JsonParser jsonparser, DeserializationContext deserializationcontext, Object obj)
		throws IOException
	{
		if(obj == null)
	//*   0    0:aload_3         
	//*   1    1:ifnonnull       26
		{
			JsonDeserializer jsondeserializer = _findDefaultImplDeserializer(deserializationcontext);
	//    2    4:aload_0         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #86  <Method JsonDeserializer _findDefaultImplDeserializer(DeserializationContext)>
	//    5    9:astore          4
			obj = ((Object) (jsondeserializer));
	//    6   11:aload           4
	//    7   13:astore_3        
			if(jsondeserializer == null)
	//*   8   14:aload           4
	//*   9   16:ifnonnull       45
				throw deserializationcontext.mappingException("No (native) type id found when one was expected for polymorphic type handling");
	//   10   19:aload_2         
	//   11   20:ldc1            #88  <String "No (native) type id found when one was expected for polymorphic type handling">
	//   12   22:invokevirtual   #94  <Method com.fasterxml.jackson.databind.JsonMappingException DeserializationContext.mappingException(String)>
	//   13   25:athrow          
		} else
		{
			if(obj instanceof String)
	//*  14   26:aload_3         
	//*  15   27:instanceof      #96  <Class String>
	//*  16   30:ifeq            52
				obj = ((Object) ((String)obj));
	//   17   33:aload_3         
	//   18   34:checkcast       #96  <Class String>
	//   19   37:astore_3        
			else
	//*  20   38:aload_0         
	//*  21   39:aload_2         
	//*  22   40:aload_3         
	//*  23   41:invokevirtual   #100 <Method JsonDeserializer _findDeserializer(DeserializationContext, String)>
	//*  24   44:astore_3        
	//*  25   45:aload_3         
	//*  26   46:aload_1         
	//*  27   47:aload_2         
	//*  28   48:invokevirtual   #105 <Method Object JsonDeserializer.deserialize(JsonParser, DeserializationContext)>
	//*  29   51:areturn         
				obj = ((Object) (String.valueOf(obj)));
	//   30   52:aload_3         
	//   31   53:invokestatic    #109 <Method String String.valueOf(Object)>
	//   32   56:astore_3        
			obj = ((Object) (_findDeserializer(deserializationcontext, ((String) (obj)))));
		}
		return ((JsonDeserializer) (obj)).deserialize(jsonparser, deserializationcontext);
	//*  33   57:goto            38
	}

	protected final JsonDeserializer _findDefaultImplDeserializer(DeserializationContext deserializationcontext)
		throws IOException
	{
		if(_defaultImpl == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #52  <Field JavaType _defaultImpl>
	//*   2    4:ifnonnull       23
			if(!deserializationcontext.isEnabled(DeserializationFeature.FAIL_ON_INVALID_SUBTYPE))
	//*   3    7:aload_1         
	//*   4    8:getstatic       #115 <Field DeserializationFeature DeserializationFeature.FAIL_ON_INVALID_SUBTYPE>
	//*   5   11:invokevirtual   #119 <Method boolean DeserializationContext.isEnabled(DeserializationFeature)>
	//*   6   14:ifne            21
				return ((JsonDeserializer) (NullifyingDeserializer.instance));
	//    7   17:getstatic       #125 <Field NullifyingDeserializer NullifyingDeserializer.instance>
	//    8   20:areturn         
			else
				return null;
	//    9   21:aconst_null     
	//   10   22:areturn         
		if(ClassUtil.isBogusClass(_defaultImpl.getRawClass()))
	//*  11   23:aload_0         
	//*  12   24:getfield        #52  <Field JavaType _defaultImpl>
	//*  13   27:invokevirtual   #129 <Method Class JavaType.getRawClass()>
	//*  14   30:invokestatic    #135 <Method boolean ClassUtil.isBogusClass(Class)>
	//*  15   33:ifeq            40
			return ((JsonDeserializer) (NullifyingDeserializer.instance));
	//   16   36:getstatic       #125 <Field NullifyingDeserializer NullifyingDeserializer.instance>
	//   17   39:areturn         
		synchronized(_defaultImpl)
	//*  18   40:aload_0         
	//*  19   41:getfield        #52  <Field JavaType _defaultImpl>
	//*  20   44:astore_2        
	//*  21   45:aload_2         
	//*  22   46:monitorenter    
		{
			if(_defaultImplDeserializer == null)
	//*  23   47:aload_0         
	//*  24   48:getfield        #66  <Field JsonDeserializer _defaultImplDeserializer>
	//*  25   51:ifnonnull       70
				_defaultImplDeserializer = deserializationcontext.findContextualValueDeserializer(_defaultImpl, _property);
	//   26   54:aload_0         
	//   27   55:aload_1         
	//   28   56:aload_0         
	//   29   57:getfield        #52  <Field JavaType _defaultImpl>
	//   30   60:aload_0         
	//   31   61:getfield        #54  <Field BeanProperty _property>
	//   32   64:invokevirtual   #139 <Method JsonDeserializer DeserializationContext.findContextualValueDeserializer(JavaType, BeanProperty)>
	//   33   67:putfield        #66  <Field JsonDeserializer _defaultImplDeserializer>
			deserializationcontext = ((DeserializationContext) (_defaultImplDeserializer));
	//   34   70:aload_0         
	//   35   71:getfield        #66  <Field JsonDeserializer _defaultImplDeserializer>
	//   36   74:astore_1        
		}
	//   37   75:aload_2         
	//   38   76:monitorexit     
		return ((JsonDeserializer) (deserializationcontext));
	//   39   77:aload_1         
	//   40   78:areturn         
		deserializationcontext;
	//   41   79:astore_1        
		javatype;
	//   42   80:aload_2         
		JVM INSTR monitorexit ;
	//   43   81:monitorexit     
		throw deserializationcontext;
	//   44   82:aload_1         
	//   45   83:athrow          
	}

	protected final JsonDeserializer _findDeserializer(DeserializationContext deserializationcontext, String s)
		throws IOException
	{
		JsonDeserializer jsondeserializer = (JsonDeserializer)_deserializers.get(((Object) (s)));
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field Map _deserializers>
	//    2    4:aload_2         
	//    3    5:invokeinterface #146 <Method Object Map.get(Object)>
	//    4   10:checkcast       #102 <Class JsonDeserializer>
	//    5   13:astore          4
		Object obj = ((Object) (jsondeserializer));
	//    6   15:aload           4
	//    7   17:astore_3        
		if(jsondeserializer == null)
	//*   8   18:aload           4
	//*   9   20:ifnonnull       83
		{
			Object obj1 = ((Object) (_idResolver.typeFromId(((com.fasterxml.jackson.databind.DatabindContext) (deserializationcontext)), s)));
	//   10   23:aload_0         
	//   11   24:getfield        #36  <Field TypeIdResolver _idResolver>
	//   12   27:aload_1         
	//   13   28:aload_2         
	//   14   29:invokeinterface #152 <Method JavaType TypeIdResolver.typeFromId(com.fasterxml.jackson.databind.DatabindContext, String)>
	//   15   34:astore          4
			if(obj1 == null)
	//*  16   36:aload           4
	//*  17   38:ifnonnull       85
			{
				obj1 = ((Object) (_findDefaultImplDeserializer(deserializationcontext)));
	//   18   41:aload_0         
	//   19   42:aload_1         
	//   20   43:invokevirtual   #86  <Method JsonDeserializer _findDefaultImplDeserializer(DeserializationContext)>
	//   21   46:astore          4
				obj = obj1;
	//   22   48:aload           4
	//   23   50:astore_3        
				if(obj1 == null)
	//*  24   51:aload           4
	//*  25   53:ifnonnull       71
					obj = ((Object) (_handleUnknownTypeId(deserializationcontext, s, _idResolver, _baseType)));
	//   26   56:aload_0         
	//   27   57:aload_1         
	//   28   58:aload_2         
	//   29   59:aload_0         
	//   30   60:getfield        #36  <Field TypeIdResolver _idResolver>
	//   31   63:aload_0         
	//   32   64:getfield        #34  <Field JavaType _baseType>
	//   33   67:invokevirtual   #156 <Method JsonDeserializer _handleUnknownTypeId(DeserializationContext, String, TypeIdResolver, JavaType)>
	//   34   70:astore_3        
			} else
	//*  35   71:aload_0         
	//*  36   72:getfield        #50  <Field Map _deserializers>
	//*  37   75:aload_2         
	//*  38   76:aload_3         
	//*  39   77:invokeinterface #160 <Method Object Map.put(Object, Object)>
	//*  40   82:pop             
	//*  41   83:aload_3         
	//*  42   84:areturn         
			{
				obj = obj1;
	//   43   85:aload           4
	//   44   87:astore_3        
				if(_baseType != null)
	//*  45   88:aload_0         
	//*  46   89:getfield        #34  <Field JavaType _baseType>
	//*  47   92:ifnull          130
				{
					obj = obj1;
	//   48   95:aload           4
	//   49   97:astore_3        
					if(((Object) (_baseType)).getClass() == obj1.getClass())
	//*  50   98:aload_0         
	//*  51   99:getfield        #34  <Field JavaType _baseType>
	//*  52  102:invokevirtual   #165 <Method Class Object.getClass()>
	//*  53  105:aload           4
	//*  54  107:invokevirtual   #165 <Method Class Object.getClass()>
	//*  55  110:if_acmpne       130
						obj = ((Object) (deserializationcontext.getTypeFactory().constructSpecializedType(_baseType, ((JavaType) (obj1)).getRawClass())));
	//   56  113:aload_1         
	//   57  114:invokevirtual   #169 <Method TypeFactory DeserializationContext.getTypeFactory()>
	//   58  117:aload_0         
	//   59  118:getfield        #34  <Field JavaType _baseType>
	//   60  121:aload           4
	//   61  123:invokevirtual   #129 <Method Class JavaType.getRawClass()>
	//   62  126:invokevirtual   #175 <Method JavaType TypeFactory.constructSpecializedType(JavaType, Class)>
	//   63  129:astore_3        
				}
				obj = ((Object) (deserializationcontext.findContextualValueDeserializer(((JavaType) (obj)), _property)));
	//   64  130:aload_1         
	//   65  131:aload_3         
	//   66  132:aload_0         
	//   67  133:getfield        #54  <Field BeanProperty _property>
	//   68  136:invokevirtual   #139 <Method JsonDeserializer DeserializationContext.findContextualValueDeserializer(JavaType, BeanProperty)>
	//   69  139:astore_3        
			}
			_deserializers.put(((Object) (s)), obj);
		}
		return ((JsonDeserializer) (obj));
	//*  70  140:goto            71
	}

	protected JsonDeserializer _handleUnknownTypeId(DeserializationContext deserializationcontext, String s, TypeIdResolver typeidresolver, JavaType javatype)
		throws IOException
	{
		if(typeidresolver instanceof TypeIdResolverBase)
	//*   0    0:aload_3         
	//*   1    1:instanceof      #178 <Class TypeIdResolverBase>
	//*   2    4:ifeq            56
		{
			typeidresolver = ((TypeIdResolver) (((TypeIdResolverBase)typeidresolver).getDescForKnownTypeIds()));
	//    3    7:aload_3         
	//    4    8:checkcast       #178 <Class TypeIdResolverBase>
	//    5   11:invokevirtual   #182 <Method String TypeIdResolverBase.getDescForKnownTypeIds()>
	//    6   14:astore_3        
			if(typeidresolver == null)
	//*   7   15:aload_3         
	//*   8   16:ifnonnull       33
				typeidresolver = "known type ids are not statically known";
	//    9   19:ldc1            #184 <String "known type ids are not statically known">
	//   10   21:astore_3        
			else
	//*  11   22:aload_1         
	//*  12   23:aload_0         
	//*  13   24:getfield        #34  <Field JavaType _baseType>
	//*  14   27:aload_2         
	//*  15   28:aload_3         
	//*  16   29:invokevirtual   #188 <Method com.fasterxml.jackson.databind.JsonMappingException DeserializationContext.unknownTypeException(JavaType, String, String)>
	//*  17   32:athrow          
				typeidresolver = ((TypeIdResolver) ((new StringBuilder()).append("known type ids = ").append(((String) (typeidresolver))).toString()));
	//   18   33:new             #190 <Class StringBuilder>
	//   19   36:dup             
	//   20   37:invokespecial   #191 <Method void StringBuilder()>
	//   21   40:ldc1            #193 <String "known type ids = ">
	//   22   42:invokevirtual   #197 <Method StringBuilder StringBuilder.append(String)>
	//   23   45:aload_3         
	//   24   46:invokevirtual   #197 <Method StringBuilder StringBuilder.append(String)>
	//   25   49:invokevirtual   #200 <Method String StringBuilder.toString()>
	//   26   52:astore_3        
		} else
	//*  27   53:goto            22
		{
			typeidresolver = null;
	//   28   56:aconst_null     
	//   29   57:astore_3        
		}
		throw deserializationcontext.unknownTypeException(_baseType, s, ((String) (typeidresolver)));
	//*  30   58:goto            22
	}

	public String baseTypeName()
	{
		return _baseType.getRawClass().getName();
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field JavaType _baseType>
	//    2    4:invokevirtual   #129 <Method Class JavaType.getRawClass()>
	//    3    7:invokevirtual   #207 <Method String Class.getName()>
	//    4   10:areturn         
	}

	public abstract TypeDeserializer forProperty(BeanProperty beanproperty);

	public Class getDefaultImpl()
	{
		if(_defaultImpl == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #52  <Field JavaType _defaultImpl>
	//*   2    4:ifnonnull       9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		else
			return _defaultImpl.getRawClass();
	//    5    9:aload_0         
	//    6   10:getfield        #52  <Field JavaType _defaultImpl>
	//    7   13:invokevirtual   #129 <Method Class JavaType.getRawClass()>
	//    8   16:areturn         
	}

	public final String getPropertyName()
	{
		return _typePropertyName;
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field String _typePropertyName>
	//    2    4:areturn         
	}

	public TypeIdResolver getTypeIdResolver()
	{
		return _idResolver;
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field TypeIdResolver _idResolver>
	//    2    4:areturn         
	}

	public abstract com.fasterxml.jackson.annotation.JsonTypeInfo.As getTypeInclusion();

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #190 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #191 <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append('[').append(((Object)this).getClass().getName());
	//    4    8:aload_1         
	//    5    9:bipush          91
	//    6   11:invokevirtual   #219 <Method StringBuilder StringBuilder.append(char)>
	//    7   14:aload_0         
	//    8   15:invokevirtual   #165 <Method Class Object.getClass()>
	//    9   18:invokevirtual   #207 <Method String Class.getName()>
	//   10   21:invokevirtual   #197 <Method StringBuilder StringBuilder.append(String)>
	//   11   24:pop             
		stringbuilder.append("; base-type:").append(((Object) (_baseType)));
	//   12   25:aload_1         
	//   13   26:ldc1            #221 <String "; base-type:">
	//   14   28:invokevirtual   #197 <Method StringBuilder StringBuilder.append(String)>
	//   15   31:aload_0         
	//   16   32:getfield        #34  <Field JavaType _baseType>
	//   17   35:invokevirtual   #224 <Method StringBuilder StringBuilder.append(Object)>
	//   18   38:pop             
		stringbuilder.append("; id-resolver: ").append(((Object) (_idResolver)));
	//   19   39:aload_1         
	//   20   40:ldc1            #226 <String "; id-resolver: ">
	//   21   42:invokevirtual   #197 <Method StringBuilder StringBuilder.append(String)>
	//   22   45:aload_0         
	//   23   46:getfield        #36  <Field TypeIdResolver _idResolver>
	//   24   49:invokevirtual   #224 <Method StringBuilder StringBuilder.append(Object)>
	//   25   52:pop             
		stringbuilder.append(']');
	//   26   53:aload_1         
	//   27   54:bipush          93
	//   28   56:invokevirtual   #219 <Method StringBuilder StringBuilder.append(char)>
	//   29   59:pop             
		return stringbuilder.toString();
	//   30   60:aload_1         
	//   31   61:invokevirtual   #200 <Method String StringBuilder.toString()>
	//   32   64:areturn         
	}

	private static final long serialVersionUID = 1L;
	protected final JavaType _baseType;
	protected final JavaType _defaultImpl;
	protected JsonDeserializer _defaultImplDeserializer;
	protected final Map _deserializers;
	protected final TypeIdResolver _idResolver;
	protected final BeanProperty _property;
	protected final boolean _typeIdVisible;
	protected final String _typePropertyName;
}
