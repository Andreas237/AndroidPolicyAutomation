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

public abstract class TypeDeserializerBase extends TypeDeserializer
	implements Serializable
{

	protected TypeDeserializerBase(JavaType javatype, TypeIdResolver typeidresolver, String s, boolean flag, JavaType javatype1)
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
		_typePropertyName = ClassUtil.nonNullString(s);
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:invokestatic    #42  <Method String ClassUtil.nonNullString(String)>
	//   11   19:putfield        #44  <Field String _typePropertyName>
		_typeIdVisible = flag;
	//   12   22:aload_0         
	//   13   23:iload           4
	//   14   25:putfield        #46  <Field boolean _typeIdVisible>
		_deserializers = ((Map) (new ConcurrentHashMap(16, 0.75F, 2)));
	//   15   28:aload_0         
	//   16   29:new             #48  <Class ConcurrentHashMap>
	//   17   32:dup             
	//   18   33:bipush          16
	//   19   35:ldc1            #49  <Float 0.75F>
	//   20   37:iconst_2        
	//   21   38:invokespecial   #52  <Method void ConcurrentHashMap(int, float, int)>
	//   22   41:putfield        #54  <Field Map _deserializers>
		_defaultImpl = javatype1;
	//   23   44:aload_0         
	//   24   45:aload           5
	//   25   47:putfield        #56  <Field JavaType _defaultImpl>
		_property = null;
	//   26   50:aload_0         
	//   27   51:aconst_null     
	//   28   52:putfield        #58  <Field BeanProperty _property>
	//   29   55:return          
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
	//   12   22:getfield        #44  <Field String _typePropertyName>
	//   13   25:putfield        #44  <Field String _typePropertyName>
		_typeIdVisible = typedeserializerbase._typeIdVisible;
	//   14   28:aload_0         
	//   15   29:aload_1         
	//   16   30:getfield        #46  <Field boolean _typeIdVisible>
	//   17   33:putfield        #46  <Field boolean _typeIdVisible>
		_deserializers = typedeserializerbase._deserializers;
	//   18   36:aload_0         
	//   19   37:aload_1         
	//   20   38:getfield        #54  <Field Map _deserializers>
	//   21   41:putfield        #54  <Field Map _deserializers>
		_defaultImpl = typedeserializerbase._defaultImpl;
	//   22   44:aload_0         
	//   23   45:aload_1         
	//   24   46:getfield        #56  <Field JavaType _defaultImpl>
	//   25   49:putfield        #56  <Field JavaType _defaultImpl>
		_defaultImplDeserializer = typedeserializerbase._defaultImplDeserializer;
	//   26   52:aload_0         
	//   27   53:aload_1         
	//   28   54:getfield        #62  <Field JsonDeserializer _defaultImplDeserializer>
	//   29   57:putfield        #62  <Field JsonDeserializer _defaultImplDeserializer>
		_property = beanproperty;
	//   30   60:aload_0         
	//   31   61:aload_2         
	//   32   62:putfield        #58  <Field BeanProperty _property>
	//   33   65:return          
	}

	protected Object _deserializeWithNativeTypeId(JsonParser jsonparser, DeserializationContext deserializationcontext, Object obj)
		throws IOException
	{
		if(obj == null)
	//*   0    0:aload_3         
	//*   1    1:ifnonnull       34
		{
			JsonDeserializer jsondeserializer = _findDefaultImplDeserializer(deserializationcontext);
	//    2    4:aload_0         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #70  <Method JsonDeserializer _findDefaultImplDeserializer(DeserializationContext)>
	//    5    9:astore          4
			obj = ((Object) (jsondeserializer));
	//    6   11:aload           4
	//    7   13:astore_3        
			if(jsondeserializer == null)
	//*   8   14:aload           4
	//*   9   16:ifnonnull       61
				return deserializationcontext.reportInputMismatch(baseType(), "No (native) type id found when one was expected for polymorphic type handling", new Object[0]);
	//   10   19:aload_2         
	//   11   20:aload_0         
	//   12   21:invokevirtual   #74  <Method JavaType baseType()>
	//   13   24:ldc1            #76  <String "No (native) type id found when one was expected for polymorphic type handling">
	//   14   26:iconst_0        
	//   15   27:anewarray       Object[]
	//   16   30:invokevirtual   #84  <Method Object DeserializationContext.reportInputMismatch(JavaType, String, Object[])>
	//   17   33:areturn         
		} else
		{
			if(obj instanceof String)
	//*  18   34:aload_3         
	//*  19   35:instanceof      #86  <Class String>
	//*  20   38:ifeq            49
				obj = ((Object) ((String)obj));
	//   21   41:aload_3         
	//   22   42:checkcast       #86  <Class String>
	//   23   45:astore_3        
			else
	//*  24   46:goto            54
				obj = ((Object) (String.valueOf(obj)));
	//   25   49:aload_3         
	//   26   50:invokestatic    #90  <Method String String.valueOf(Object)>
	//   27   53:astore_3        
			obj = ((Object) (_findDeserializer(deserializationcontext, ((String) (obj)))));
	//   28   54:aload_0         
	//   29   55:aload_2         
	//   30   56:aload_3         
	//   31   57:invokevirtual   #94  <Method JsonDeserializer _findDeserializer(DeserializationContext, String)>
	//   32   60:astore_3        
		}
		return ((JsonDeserializer) (obj)).deserialize(jsonparser, deserializationcontext);
	//   33   61:aload_3         
	//   34   62:aload_1         
	//   35   63:aload_2         
	//   36   64:invokevirtual   #100 <Method Object JsonDeserializer.deserialize(JsonParser, DeserializationContext)>
	//   37   67:areturn         
	}

	protected final JsonDeserializer _findDefaultImplDeserializer(DeserializationContext deserializationcontext)
		throws IOException
	{
		JavaType javatype = _defaultImpl;
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field JavaType _defaultImpl>
	//    2    4:astore_2        
		if(javatype == null)
	//*   3    5:aload_2         
	//*   4    6:ifnonnull       25
			if(!deserializationcontext.isEnabled(DeserializationFeature.FAIL_ON_INVALID_SUBTYPE))
	//*   5    9:aload_1         
	//*   6   10:getstatic       #107 <Field DeserializationFeature DeserializationFeature.FAIL_ON_INVALID_SUBTYPE>
	//*   7   13:invokevirtual   #111 <Method boolean DeserializationContext.isEnabled(DeserializationFeature)>
	//*   8   16:ifne            23
				return ((JsonDeserializer) (NullifyingDeserializer.instance));
	//    9   19:getstatic       #117 <Field NullifyingDeserializer NullifyingDeserializer.instance>
	//   10   22:areturn         
			else
				return null;
	//   11   23:aconst_null     
	//   12   24:areturn         
		if(ClassUtil.isBogusClass(javatype.getRawClass()))
	//*  13   25:aload_2         
	//*  14   26:invokevirtual   #123 <Method Class JavaType.getRawClass()>
	//*  15   29:invokestatic    #127 <Method boolean ClassUtil.isBogusClass(Class)>
	//*  16   32:ifeq            39
			return ((JsonDeserializer) (NullifyingDeserializer.instance));
	//   17   35:getstatic       #117 <Field NullifyingDeserializer NullifyingDeserializer.instance>
	//   18   38:areturn         
		synchronized(_defaultImpl)
	//*  19   39:aload_0         
	//*  20   40:getfield        #56  <Field JavaType _defaultImpl>
	//*  21   43:astore_2        
	//*  22   44:aload_2         
	//*  23   45:monitorenter    
		{
			if(_defaultImplDeserializer == null)
	//*  24   46:aload_0         
	//*  25   47:getfield        #62  <Field JsonDeserializer _defaultImplDeserializer>
	//*  26   50:ifnonnull       69
				_defaultImplDeserializer = deserializationcontext.findContextualValueDeserializer(_defaultImpl, _property);
	//   27   53:aload_0         
	//   28   54:aload_1         
	//   29   55:aload_0         
	//   30   56:getfield        #56  <Field JavaType _defaultImpl>
	//   31   59:aload_0         
	//   32   60:getfield        #58  <Field BeanProperty _property>
	//   33   63:invokevirtual   #131 <Method JsonDeserializer DeserializationContext.findContextualValueDeserializer(JavaType, BeanProperty)>
	//   34   66:putfield        #62  <Field JsonDeserializer _defaultImplDeserializer>
			deserializationcontext = ((DeserializationContext) (_defaultImplDeserializer));
	//   35   69:aload_0         
	//   36   70:getfield        #62  <Field JsonDeserializer _defaultImplDeserializer>
	//   37   73:astore_1        
		}
	//   38   74:aload_2         
	//   39   75:monitorexit     
		return ((JsonDeserializer) (deserializationcontext));
	//   40   76:aload_1         
	//   41   77:areturn         
		deserializationcontext;
	//   42   78:astore_1        
		javatype1;
	//   43   79:aload_2         
		JVM INSTR monitorexit ;
	//   44   80:monitorexit     
		throw deserializationcontext;
	//   45   81:aload_1         
	//   46   82:athrow          
	}

	protected final JsonDeserializer _findDeserializer(DeserializationContext deserializationcontext, String s)
		throws IOException
	{
		JsonDeserializer jsondeserializer = (JsonDeserializer)_deserializers.get(((Object) (s)));
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field Map _deserializers>
	//    2    4:aload_2         
	//    3    5:invokeinterface #139 <Method Object Map.get(Object)>
	//    4   10:checkcast       #96  <Class JsonDeserializer>
	//    5   13:astore          4
		Object obj = ((Object) (jsondeserializer));
	//    6   15:aload           4
	//    7   17:astore_3        
		if(jsondeserializer == null)
	//*   8   18:aload           4
	//*   9   20:ifnonnull       162
		{
			Object obj1 = ((Object) (_idResolver.typeFromId(((com.fasterxml.jackson.databind.DatabindContext) (deserializationcontext)), s)));
	//   10   23:aload_0         
	//   11   24:getfield        #36  <Field TypeIdResolver _idResolver>
	//   12   27:aload_1         
	//   13   28:aload_2         
	//   14   29:invokeinterface #145 <Method JavaType TypeIdResolver.typeFromId(com.fasterxml.jackson.databind.DatabindContext, String)>
	//   15   34:astore          4
			if(obj1 == null)
	//*  16   36:aload           4
	//*  17   38:ifnonnull       82
			{
				obj1 = ((Object) (_findDefaultImplDeserializer(deserializationcontext)));
	//   18   41:aload_0         
	//   19   42:aload_1         
	//   20   43:invokevirtual   #70  <Method JsonDeserializer _findDefaultImplDeserializer(DeserializationContext)>
	//   21   46:astore          4
				obj = obj1;
	//   22   48:aload           4
	//   23   50:astore_3        
				if(obj1 == null)
	//*  24   51:aload           4
	//*  25   53:ifnonnull       150
				{
					obj = ((Object) (_handleUnknownTypeId(deserializationcontext, s)));
	//   26   56:aload_0         
	//   27   57:aload_1         
	//   28   58:aload_2         
	//   29   59:invokevirtual   #149 <Method JavaType _handleUnknownTypeId(DeserializationContext, String)>
	//   30   62:astore_3        
					if(obj == null)
	//*  31   63:aload_3         
	//*  32   64:ifnonnull       69
						return null;
	//   33   67:aconst_null     
	//   34   68:areturn         
					obj = ((Object) (deserializationcontext.findContextualValueDeserializer(((JavaType) (obj)), _property)));
	//   35   69:aload_1         
	//   36   70:aload_3         
	//   37   71:aload_0         
	//   38   72:getfield        #58  <Field BeanProperty _property>
	//   39   75:invokevirtual   #131 <Method JsonDeserializer DeserializationContext.findContextualValueDeserializer(JavaType, BeanProperty)>
	//   40   78:astore_3        
				}
			} else
	//*  41   79:goto            150
			{
				JavaType javatype = _baseType;
	//   42   82:aload_0         
	//   43   83:getfield        #34  <Field JavaType _baseType>
	//   44   86:astore          5
				obj = obj1;
	//   45   88:aload           4
	//   46   90:astore_3        
				if(javatype != null)
	//*  47   91:aload           5
	//*  48   93:ifnull          140
				{
					obj = obj1;
	//   49   96:aload           4
	//   50   98:astore_3        
					if(((Object) (javatype)).getClass() == obj1.getClass())
	//*  51   99:aload           5
	//*  52  101:invokevirtual   #152 <Method Class Object.getClass()>
	//*  53  104:aload           4
	//*  54  106:invokevirtual   #152 <Method Class Object.getClass()>
	//*  55  109:if_acmpne       140
					{
						obj = obj1;
	//   56  112:aload           4
	//   57  114:astore_3        
						if(!((JavaType) (obj1)).hasGenericTypes())
	//*  58  115:aload           4
	//*  59  117:invokevirtual   #156 <Method boolean JavaType.hasGenericTypes()>
	//*  60  120:ifne            140
							obj = ((Object) (deserializationcontext.getTypeFactory().constructSpecializedType(_baseType, ((JavaType) (obj1)).getRawClass())));
	//   61  123:aload_1         
	//   62  124:invokevirtual   #160 <Method TypeFactory DeserializationContext.getTypeFactory()>
	//   63  127:aload_0         
	//   64  128:getfield        #34  <Field JavaType _baseType>
	//   65  131:aload           4
	//   66  133:invokevirtual   #123 <Method Class JavaType.getRawClass()>
	//   67  136:invokevirtual   #166 <Method JavaType TypeFactory.constructSpecializedType(JavaType, Class)>
	//   68  139:astore_3        
					}
				}
				obj = ((Object) (deserializationcontext.findContextualValueDeserializer(((JavaType) (obj)), _property)));
	//   69  140:aload_1         
	//   70  141:aload_3         
	//   71  142:aload_0         
	//   72  143:getfield        #58  <Field BeanProperty _property>
	//   73  146:invokevirtual   #131 <Method JsonDeserializer DeserializationContext.findContextualValueDeserializer(JavaType, BeanProperty)>
	//   74  149:astore_3        
			}
			_deserializers.put(((Object) (s)), obj);
	//   75  150:aload_0         
	//   76  151:getfield        #54  <Field Map _deserializers>
	//   77  154:aload_2         
	//   78  155:aload_3         
	//   79  156:invokeinterface #170 <Method Object Map.put(Object, Object)>
	//   80  161:pop             
		}
		return ((JsonDeserializer) (obj));
	//   81  162:aload_3         
	//   82  163:areturn         
	}

	protected JavaType _handleMissingTypeId(DeserializationContext deserializationcontext, String s)
		throws IOException
	{
		return deserializationcontext.handleMissingTypeId(_baseType, _idResolver, s);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #34  <Field JavaType _baseType>
	//    3    5:aload_0         
	//    4    6:getfield        #36  <Field TypeIdResolver _idResolver>
	//    5    9:aload_2         
	//    6   10:invokevirtual   #176 <Method JavaType DeserializationContext.handleMissingTypeId(JavaType, TypeIdResolver, String)>
	//    7   13:areturn         
	}

	protected JavaType _handleUnknownTypeId(DeserializationContext deserializationcontext, String s)
		throws IOException
	{
		String s1 = _idResolver.getDescForKnownTypeIds();
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field TypeIdResolver _idResolver>
	//    2    4:invokeinterface #180 <Method String TypeIdResolver.getDescForKnownTypeIds()>
	//    3    9:astore_3        
		if(s1 == null)
	//*   4   10:aload_3         
	//*   5   11:ifnonnull       20
		{
			s1 = "type ids are not statically known";
	//    6   14:ldc1            #182 <String "type ids are not statically known">
	//    7   16:astore_3        
		} else
	//*   8   17:goto            50
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    9   20:new             #184 <Class StringBuilder>
	//   10   23:dup             
	//   11   24:invokespecial   #185 <Method void StringBuilder()>
	//   12   27:astore          4
			stringbuilder.append("known type ids = ");
	//   13   29:aload           4
	//   14   31:ldc1            #187 <String "known type ids = ">
	//   15   33:invokevirtual   #191 <Method StringBuilder StringBuilder.append(String)>
	//   16   36:pop             
			stringbuilder.append(s1);
	//   17   37:aload           4
	//   18   39:aload_3         
	//   19   40:invokevirtual   #191 <Method StringBuilder StringBuilder.append(String)>
	//   20   43:pop             
			s1 = stringbuilder.toString();
	//   21   44:aload           4
	//   22   46:invokevirtual   #194 <Method String StringBuilder.toString()>
	//   23   49:astore_3        
		}
		BeanProperty beanproperty = _property;
	//   24   50:aload_0         
	//   25   51:getfield        #58  <Field BeanProperty _property>
	//   26   54:astore          5
		String s2 = s1;
	//   27   56:aload_3         
	//   28   57:astore          4
		if(beanproperty != null)
	//*  29   59:aload           5
	//*  30   61:ifnull          89
			s2 = String.format("%s (for POJO property '%s')", new Object[] {
				s1, beanproperty.getName()
			});
	//   31   64:ldc1            #196 <String "%s (for POJO property '%s')">
	//   32   66:iconst_2        
	//   33   67:anewarray       Object[]
	//   34   70:dup             
	//   35   71:iconst_0        
	//   36   72:aload_3         
	//   37   73:aastore         
	//   38   74:dup             
	//   39   75:iconst_1        
	//   40   76:aload           5
	//   41   78:invokeinterface #201 <Method String BeanProperty.getName()>
	//   42   83:aastore         
	//   43   84:invokestatic    #205 <Method String String.format(String, Object[])>
	//   44   87:astore          4
		return deserializationcontext.handleUnknownTypeId(_baseType, s, _idResolver, s2);
	//   45   89:aload_1         
	//   46   90:aload_0         
	//   47   91:getfield        #34  <Field JavaType _baseType>
	//   48   94:aload_2         
	//   49   95:aload_0         
	//   50   96:getfield        #36  <Field TypeIdResolver _idResolver>
	//   51   99:aload           4
	//   52  101:invokevirtual   #209 <Method JavaType DeserializationContext.handleUnknownTypeId(JavaType, String, TypeIdResolver, String)>
	//   53  104:areturn         
	}

	public JavaType baseType()
	{
		return _baseType;
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field JavaType _baseType>
	//    2    4:areturn         
	}

	public String baseTypeName()
	{
		return _baseType.getRawClass().getName();
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field JavaType _baseType>
	//    2    4:invokevirtual   #123 <Method Class JavaType.getRawClass()>
	//    3    7:invokevirtual   #213 <Method String Class.getName()>
	//    4   10:areturn         
	}

	public Class getDefaultImpl()
	{
		return ClassUtil.rawClass(_defaultImpl);
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field JavaType _defaultImpl>
	//    2    4:invokestatic    #218 <Method Class ClassUtil.rawClass(JavaType)>
	//    3    7:areturn         
	}

	public final String getPropertyName()
	{
		return _typePropertyName;
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field String _typePropertyName>
	//    2    4:areturn         
	}

	public TypeIdResolver getTypeIdResolver()
	{
		return _idResolver;
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field TypeIdResolver _idResolver>
	//    2    4:areturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #184 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #185 <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append('[');
	//    4    8:aload_1         
	//    5    9:bipush          91
	//    6   11:invokevirtual   #225 <Method StringBuilder StringBuilder.append(char)>
	//    7   14:pop             
		stringbuilder.append(((Object)this).getClass().getName());
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:invokevirtual   #152 <Method Class Object.getClass()>
	//   11   20:invokevirtual   #213 <Method String Class.getName()>
	//   12   23:invokevirtual   #191 <Method StringBuilder StringBuilder.append(String)>
	//   13   26:pop             
		stringbuilder.append("; base-type:");
	//   14   27:aload_1         
	//   15   28:ldc1            #227 <String "; base-type:">
	//   16   30:invokevirtual   #191 <Method StringBuilder StringBuilder.append(String)>
	//   17   33:pop             
		stringbuilder.append(((Object) (_baseType)));
	//   18   34:aload_1         
	//   19   35:aload_0         
	//   20   36:getfield        #34  <Field JavaType _baseType>
	//   21   39:invokevirtual   #230 <Method StringBuilder StringBuilder.append(Object)>
	//   22   42:pop             
		stringbuilder.append("; id-resolver: ");
	//   23   43:aload_1         
	//   24   44:ldc1            #232 <String "; id-resolver: ">
	//   25   46:invokevirtual   #191 <Method StringBuilder StringBuilder.append(String)>
	//   26   49:pop             
		stringbuilder.append(((Object) (_idResolver)));
	//   27   50:aload_1         
	//   28   51:aload_0         
	//   29   52:getfield        #36  <Field TypeIdResolver _idResolver>
	//   30   55:invokevirtual   #230 <Method StringBuilder StringBuilder.append(Object)>
	//   31   58:pop             
		stringbuilder.append(']');
	//   32   59:aload_1         
	//   33   60:bipush          93
	//   34   62:invokevirtual   #225 <Method StringBuilder StringBuilder.append(char)>
	//   35   65:pop             
		return stringbuilder.toString();
	//   36   66:aload_1         
	//   37   67:invokevirtual   #194 <Method String StringBuilder.toString()>
	//   38   70:areturn         
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
