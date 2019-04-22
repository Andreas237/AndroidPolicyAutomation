// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.deser.impl.ReadableObjectId;
import com.fasterxml.jackson.databind.introspect.*;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.io.IOException;
import java.io.Serializable;
import java.util.Map;

// Referenced classes of package com.fasterxml.jackson.databind.deser:
//			UnresolvedForwardReference

public class SettableAnyProperty
	implements Serializable
{
	private static class AnySetterReferring extends com.fasterxml.jackson.databind.deser.impl.ReadableObjectId.Referring
	{

		public void handleResolvedForwardReference(Object obj, Object obj1)
			throws IOException
		{
			if(hasId(obj))
		//*   0    0:aload_0         
		//*   1    1:aload_1         
		//*   2    2:invokevirtual   #35  <Method boolean hasId(Object)>
		//*   3    5:ifeq            25
			{
				_parent.set(_pojo, ((Object) (_propName)), obj1);
		//    4    8:aload_0         
		//    5    9:getfield        #20  <Field SettableAnyProperty _parent>
		//    6   12:aload_0         
		//    7   13:getfield        #22  <Field Object _pojo>
		//    8   16:aload_0         
		//    9   17:getfield        #24  <Field String _propName>
		//   10   20:aload_2         
		//   11   21:invokevirtual   #39  <Method void SettableAnyProperty.set(Object, Object, Object)>
				return;
		//   12   24:return          
			} else
			{
				obj1 = ((Object) (new StringBuilder()));
		//   13   25:new             #41  <Class StringBuilder>
		//   14   28:dup             
		//   15   29:invokespecial   #44  <Method void StringBuilder()>
		//   16   32:astore_2        
				((StringBuilder) (obj1)).append("Trying to resolve a forward reference with id [");
		//   17   33:aload_2         
		//   18   34:ldc1            #46  <String "Trying to resolve a forward reference with id [">
		//   19   36:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
		//   20   39:pop             
				((StringBuilder) (obj1)).append(obj.toString());
		//   21   40:aload_2         
		//   22   41:aload_1         
		//   23   42:invokevirtual   #56  <Method String Object.toString()>
		//   24   45:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
		//   25   48:pop             
				((StringBuilder) (obj1)).append("] that wasn't previously registered.");
		//   26   49:aload_2         
		//   27   50:ldc1            #58  <String "] that wasn't previously registered.">
		//   28   52:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
		//   29   55:pop             
				throw new IllegalArgumentException(((StringBuilder) (obj1)).toString());
		//   30   56:new             #60  <Class IllegalArgumentException>
		//   31   59:dup             
		//   32   60:aload_2         
		//   33   61:invokevirtual   #61  <Method String StringBuilder.toString()>
		//   34   64:invokespecial   #64  <Method void IllegalArgumentException(String)>
		//   35   67:athrow          
			}
		}

		private final SettableAnyProperty _parent;
		private final Object _pojo;
		private final String _propName;

		public AnySetterReferring(SettableAnyProperty settableanyproperty, UnresolvedForwardReference unresolvedforwardreference, Class class1, Object obj, String s)
		{
			super(unresolvedforwardreference, class1);
		//    0    0:aload_0         
		//    1    1:aload_2         
		//    2    2:aload_3         
		//    3    3:invokespecial   #18  <Method void com.fasterxml.jackson.databind.deser.impl.ReadableObjectId$Referring(UnresolvedForwardReference, Class)>
			_parent = settableanyproperty;
		//    4    6:aload_0         
		//    5    7:aload_1         
		//    6    8:putfield        #20  <Field SettableAnyProperty _parent>
			_pojo = obj;
		//    7   11:aload_0         
		//    8   12:aload           4
		//    9   14:putfield        #22  <Field Object _pojo>
			_propName = s;
		//   10   17:aload_0         
		//   11   18:aload           5
		//   12   20:putfield        #24  <Field String _propName>
		//   13   23:return          
		}
	}


	public SettableAnyProperty(BeanProperty beanproperty, AnnotatedMember annotatedmember, JavaType javatype, KeyDeserializer keydeserializer, JsonDeserializer jsondeserializer, TypeDeserializer typedeserializer)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #33  <Method void Object()>
		_property = beanproperty;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #35  <Field BeanProperty _property>
		_setter = annotatedmember;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #37  <Field AnnotatedMember _setter>
		_type = javatype;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #39  <Field JavaType _type>
		_valueDeserializer = jsondeserializer;
	//   11   19:aload_0         
	//   12   20:aload           5
	//   13   22:putfield        #41  <Field JsonDeserializer _valueDeserializer>
		_valueTypeDeserializer = typedeserializer;
	//   14   25:aload_0         
	//   15   26:aload           6
	//   16   28:putfield        #43  <Field TypeDeserializer _valueTypeDeserializer>
		_keyDeserializer = keydeserializer;
	//   17   31:aload_0         
	//   18   32:aload           4
	//   19   34:putfield        #45  <Field KeyDeserializer _keyDeserializer>
		_setterIsField = annotatedmember instanceof AnnotatedField;
	//   20   37:aload_0         
	//   21   38:aload_2         
	//   22   39:instanceof      #47  <Class AnnotatedField>
	//   23   42:putfield        #49  <Field boolean _setterIsField>
	//   24   45:return          
	}

	private String getClassName()
	{
		return _setter.getDeclaringClass().getName();
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field AnnotatedMember _setter>
	//    2    4:invokevirtual   #60  <Method Class AnnotatedMember.getDeclaringClass()>
	//    3    7:invokevirtual   #65  <Method String Class.getName()>
	//    4   10:areturn         
	}

	protected void _throwAsIOE(Exception exception, Object obj, Object obj1)
		throws IOException
	{
		if(exception instanceof IllegalArgumentException)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #71  <Class IllegalArgumentException>
	//*   2    4:ifeq            145
		{
			String s = ClassUtil.classNameOf(obj1);
	//    3    7:aload_3         
	//    4    8:invokestatic    #77  <Method String ClassUtil.classNameOf(Object)>
	//    5   11:astore          4
			obj1 = ((Object) (new StringBuilder("Problem deserializing \"any\" property '")));
	//    6   13:new             #79  <Class StringBuilder>
	//    7   16:dup             
	//    8   17:ldc1            #81  <String "Problem deserializing \"any\" property '">
	//    9   19:invokespecial   #84  <Method void StringBuilder(String)>
	//   10   22:astore_3        
			((StringBuilder) (obj1)).append(obj);
	//   11   23:aload_3         
	//   12   24:aload_2         
	//   13   25:invokevirtual   #88  <Method StringBuilder StringBuilder.append(Object)>
	//   14   28:pop             
			obj = ((Object) (new StringBuilder()));
	//   15   29:new             #79  <Class StringBuilder>
	//   16   32:dup             
	//   17   33:invokespecial   #89  <Method void StringBuilder()>
	//   18   36:astore_2        
			((StringBuilder) (obj)).append("' of class ");
	//   19   37:aload_2         
	//   20   38:ldc1            #91  <String "' of class ">
	//   21   40:invokevirtual   #94  <Method StringBuilder StringBuilder.append(String)>
	//   22   43:pop             
			((StringBuilder) (obj)).append(getClassName());
	//   23   44:aload_2         
	//   24   45:aload_0         
	//   25   46:invokespecial   #96  <Method String getClassName()>
	//   26   49:invokevirtual   #94  <Method StringBuilder StringBuilder.append(String)>
	//   27   52:pop             
			((StringBuilder) (obj)).append(" (expected type: ");
	//   28   53:aload_2         
	//   29   54:ldc1            #98  <String " (expected type: ">
	//   30   56:invokevirtual   #94  <Method StringBuilder StringBuilder.append(String)>
	//   31   59:pop             
			((StringBuilder) (obj1)).append(((StringBuilder) (obj)).toString());
	//   32   60:aload_3         
	//   33   61:aload_2         
	//   34   62:invokevirtual   #101 <Method String StringBuilder.toString()>
	//   35   65:invokevirtual   #94  <Method StringBuilder StringBuilder.append(String)>
	//   36   68:pop             
			((StringBuilder) (obj1)).append(((Object) (_type)));
	//   37   69:aload_3         
	//   38   70:aload_0         
	//   39   71:getfield        #39  <Field JavaType _type>
	//   40   74:invokevirtual   #88  <Method StringBuilder StringBuilder.append(Object)>
	//   41   77:pop             
			((StringBuilder) (obj1)).append("; actual type: ");
	//   42   78:aload_3         
	//   43   79:ldc1            #103 <String "; actual type: ">
	//   44   81:invokevirtual   #94  <Method StringBuilder StringBuilder.append(String)>
	//   45   84:pop             
			((StringBuilder) (obj1)).append(s);
	//   46   85:aload_3         
	//   47   86:aload           4
	//   48   88:invokevirtual   #94  <Method StringBuilder StringBuilder.append(String)>
	//   49   91:pop             
			((StringBuilder) (obj1)).append(")");
	//   50   92:aload_3         
	//   51   93:ldc1            #105 <String ")">
	//   52   95:invokevirtual   #94  <Method StringBuilder StringBuilder.append(String)>
	//   53   98:pop             
			obj = ((Object) (exception.getMessage()));
	//   54   99:aload_1         
	//   55  100:invokevirtual   #110 <Method String Exception.getMessage()>
	//   56  103:astore_2        
			if(obj != null)
	//*  57  104:aload_2         
	//*  58  105:ifnull          124
			{
				((StringBuilder) (obj1)).append(", problem: ");
	//   59  108:aload_3         
	//   60  109:ldc1            #112 <String ", problem: ">
	//   61  111:invokevirtual   #94  <Method StringBuilder StringBuilder.append(String)>
	//   62  114:pop             
				((StringBuilder) (obj1)).append(((String) (obj)));
	//   63  115:aload_3         
	//   64  116:aload_2         
	//   65  117:invokevirtual   #94  <Method StringBuilder StringBuilder.append(String)>
	//   66  120:pop             
			} else
	//*  67  121:goto            131
			{
				((StringBuilder) (obj1)).append(" (no error message provided)");
	//   68  124:aload_3         
	//   69  125:ldc1            #114 <String " (no error message provided)">
	//   70  127:invokevirtual   #94  <Method StringBuilder StringBuilder.append(String)>
	//   71  130:pop             
			}
			throw new JsonMappingException(((java.io.Closeable) (null)), ((StringBuilder) (obj1)).toString(), ((Throwable) (exception)));
	//   72  131:new             #116 <Class JsonMappingException>
	//   73  134:dup             
	//   74  135:aconst_null     
	//   75  136:aload_3         
	//   76  137:invokevirtual   #101 <Method String StringBuilder.toString()>
	//   77  140:aload_1         
	//   78  141:invokespecial   #119 <Method void JsonMappingException(java.io.Closeable, String, Throwable)>
	//   79  144:athrow          
		} else
		{
			ClassUtil.throwIfIOE(((Throwable) (exception)));
	//   80  145:aload_1         
	//   81  146:invokestatic    #123 <Method Throwable ClassUtil.throwIfIOE(Throwable)>
	//   82  149:pop             
			ClassUtil.throwIfRTE(((Throwable) (exception)));
	//   83  150:aload_1         
	//   84  151:invokestatic    #126 <Method Throwable ClassUtil.throwIfRTE(Throwable)>
	//   85  154:pop             
			exception = ((Exception) (ClassUtil.getRootCause(((Throwable) (exception)))));
	//   86  155:aload_1         
	//   87  156:invokestatic    #129 <Method Throwable ClassUtil.getRootCause(Throwable)>
	//   88  159:astore_1        
			throw new JsonMappingException(((java.io.Closeable) (null)), ((Throwable) (exception)).getMessage(), ((Throwable) (exception)));
	//   89  160:new             #116 <Class JsonMappingException>
	//   90  163:dup             
	//   91  164:aconst_null     
	//   92  165:aload_1         
	//   93  166:invokevirtual   #132 <Method String Throwable.getMessage()>
	//   94  169:aload_1         
	//   95  170:invokespecial   #119 <Method void JsonMappingException(java.io.Closeable, String, Throwable)>
	//   96  173:athrow          
		}
	}

	public Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException
	{
		if(jsonparser.getCurrentToken() == JsonToken.VALUE_NULL)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #141 <Method JsonToken JsonParser.getCurrentToken()>
	//*   2    4:getstatic       #147 <Field JsonToken JsonToken.VALUE_NULL>
	//*   3    7:if_acmpne       19
			return _valueDeserializer.getNullValue(deserializationcontext);
	//    4   10:aload_0         
	//    5   11:getfield        #41  <Field JsonDeserializer _valueDeserializer>
	//    6   14:aload_2         
	//    7   15:invokevirtual   #153 <Method Object JsonDeserializer.getNullValue(DeserializationContext)>
	//    8   18:areturn         
		TypeDeserializer typedeserializer = _valueTypeDeserializer;
	//    9   19:aload_0         
	//   10   20:getfield        #43  <Field TypeDeserializer _valueTypeDeserializer>
	//   11   23:astore_3        
		if(typedeserializer != null)
	//*  12   24:aload_3         
	//*  13   25:ifnull          39
			return _valueDeserializer.deserializeWithType(jsonparser, deserializationcontext, typedeserializer);
	//   14   28:aload_0         
	//   15   29:getfield        #41  <Field JsonDeserializer _valueDeserializer>
	//   16   32:aload_1         
	//   17   33:aload_2         
	//   18   34:aload_3         
	//   19   35:invokevirtual   #157 <Method Object JsonDeserializer.deserializeWithType(JsonParser, DeserializationContext, TypeDeserializer)>
	//   20   38:areturn         
		else
			return _valueDeserializer.deserialize(jsonparser, deserializationcontext);
	//   21   39:aload_0         
	//   22   40:getfield        #41  <Field JsonDeserializer _valueDeserializer>
	//   23   43:aload_1         
	//   24   44:aload_2         
	//   25   45:invokevirtual   #159 <Method Object JsonDeserializer.deserialize(JsonParser, DeserializationContext)>
	//   26   48:areturn         
	}

	public final void deserializeAndSet(JsonParser jsonparser, DeserializationContext deserializationcontext, Object obj, String s)
		throws IOException
	{
		Object obj1;
		if(_keyDeserializer == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #45  <Field KeyDeserializer _keyDeserializer>
	//*   2    4:ifnonnull       14
		{
			obj1 = ((Object) (s));
	//    3    7:aload           4
	//    4    9:astore          5
			break MISSING_BLOCK_LABEL_26;
	//    5   11:goto            26
		}
		obj1 = _keyDeserializer.deserializeKey(s, deserializationcontext);
	//    6   14:aload_0         
	//    7   15:getfield        #45  <Field KeyDeserializer _keyDeserializer>
	//    8   18:aload           4
	//    9   20:aload_2         
	//   10   21:invokevirtual   #169 <Method Object KeyDeserializer.deserializeKey(String, DeserializationContext)>
	//   11   24:astore          5
		set(obj, obj1, deserialize(jsonparser, deserializationcontext));
	//   12   26:aload_0         
	//   13   27:aload_3         
	//   14   28:aload           5
	//   15   30:aload_0         
	//   16   31:aload_1         
	//   17   32:aload_2         
	//   18   33:invokevirtual   #170 <Method Object deserialize(JsonParser, DeserializationContext)>
	//   19   36:invokevirtual   #174 <Method void set(Object, Object, Object)>
		return;
	//   20   39:return          
		deserializationcontext;
	//   21   40:astore_2        
		if(_valueDeserializer.getObjectIdReader() != null)
	//*  22   41:aload_0         
	//*  23   42:getfield        #41  <Field JsonDeserializer _valueDeserializer>
	//*  24   45:invokevirtual   #178 <Method com.fasterxml.jackson.databind.deser.impl.ObjectIdReader JsonDeserializer.getObjectIdReader()>
	//*  25   48:ifnull          80
		{
			jsonparser = ((JsonParser) (new AnySetterReferring(this, ((UnresolvedForwardReference) (deserializationcontext)), _type.getRawClass(), obj, s)));
	//   26   51:new             #8   <Class SettableAnyProperty$AnySetterReferring>
	//   27   54:dup             
	//   28   55:aload_0         
	//   29   56:aload_2         
	//   30   57:aload_0         
	//   31   58:getfield        #39  <Field JavaType _type>
	//   32   61:invokevirtual   #183 <Method Class JavaType.getRawClass()>
	//   33   64:aload_3         
	//   34   65:aload           4
	//   35   67:invokespecial   #186 <Method void SettableAnyProperty$AnySetterReferring(SettableAnyProperty, UnresolvedForwardReference, Class, Object, String)>
	//   36   70:astore_1        
			((UnresolvedForwardReference) (deserializationcontext)).getRoid().appendReferring(((com.fasterxml.jackson.databind.deser.impl.ReadableObjectId.Referring) (jsonparser)));
	//   37   71:aload_2         
	//   38   72:invokevirtual   #190 <Method ReadableObjectId UnresolvedForwardReference.getRoid()>
	//   39   75:aload_1         
	//   40   76:invokevirtual   #196 <Method void ReadableObjectId.appendReferring(com.fasterxml.jackson.databind.deser.impl.ReadableObjectId$Referring)>
			return;
	//   41   79:return          
		} else
		{
			throw JsonMappingException.from(jsonparser, "Unresolved forward reference but no identity info.", ((Throwable) (deserializationcontext)));
	//   42   80:aload_1         
	//   43   81:ldc1            #198 <String "Unresolved forward reference but no identity info.">
	//   44   83:aload_2         
	//   45   84:invokestatic    #202 <Method JsonMappingException JsonMappingException.from(JsonParser, String, Throwable)>
	//   46   87:athrow          
		}
	}

	public void fixAccess(DeserializationConfig deserializationconfig)
	{
		_setter.fixAccess(deserializationconfig.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field AnnotatedMember _setter>
	//    2    4:aload_1         
	//    3    5:getstatic       #210 <Field MapperFeature MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS>
	//    4    8:invokevirtual   #216 <Method boolean DeserializationConfig.isEnabled(MapperFeature)>
	//    5   11:invokevirtual   #219 <Method void AnnotatedMember.fixAccess(boolean)>
	//    6   14:return          
	}

	public BeanProperty getProperty()
	{
		return _property;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field BeanProperty _property>
	//    2    4:areturn         
	}

	public JavaType getType()
	{
		return _type;
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field JavaType _type>
	//    2    4:areturn         
	}

	public boolean hasValueDeserializer()
	{
		return _valueDeserializer != null;
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field JsonDeserializer _valueDeserializer>
	//    2    4:ifnull          9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	Object readResolve()
	{
		AnnotatedMember annotatedmember = _setter;
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field AnnotatedMember _setter>
	//    2    4:astore_1        
		if(annotatedmember != null && annotatedmember.getAnnotated() != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          18
	//*   5    9:aload_1         
	//*   6   10:invokevirtual   #231 <Method java.lang.reflect.AnnotatedElement AnnotatedMember.getAnnotated()>
	//*   7   13:ifnull          18
			return ((Object) (this));
	//    8   16:aload_0         
	//    9   17:areturn         
		else
			throw new IllegalArgumentException("Missing method (broken JDK (de)serialization?)");
	//   10   18:new             #71  <Class IllegalArgumentException>
	//   11   21:dup             
	//   12   22:ldc1            #233 <String "Missing method (broken JDK (de)serialization?)">
	//   13   24:invokespecial   #234 <Method void IllegalArgumentException(String)>
	//   14   27:athrow          
	}

	public void set(Object obj, Object obj1, Object obj2)
		throws IOException
	{
		if(!_setterIsField)
			break MISSING_BLOCK_LABEL_36;
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field boolean _setterIsField>
	//    2    4:ifeq            36
		obj = ((Object) ((Map)((AnnotatedField)_setter).getValue(obj)));
	//    3    7:aload_0         
	//    4    8:getfield        #37  <Field AnnotatedMember _setter>
	//    5   11:checkcast       #47  <Class AnnotatedField>
	//    6   14:aload_1         
	//    7   15:invokevirtual   #238 <Method Object AnnotatedField.getValue(Object)>
	//    8   18:checkcast       #240 <Class Map>
	//    9   21:astore_1        
		if(obj != null)
	//*  10   22:aload_1         
	//*  11   23:ifnull          69
			try
			{
				((Map) (obj)).put(obj1, obj2);
	//   12   26:aload_1         
	//   13   27:aload_2         
	//   14   28:aload_3         
	//   15   29:invokeinterface #244 <Method Object Map.put(Object, Object)>
	//   16   34:pop             
				return;
	//   17   35:return          
			}
	//*  18   36:aload_0         
	//*  19   37:getfield        #37  <Field AnnotatedMember _setter>
	//*  20   40:checkcast       #246 <Class AnnotatedMethod>
	//*  21   43:aload_1         
	//*  22   44:iconst_2        
	//*  23   45:anewarray       Object[]
	//*  24   48:dup             
	//*  25   49:iconst_0        
	//*  26   50:aload_2         
	//*  27   51:aastore         
	//*  28   52:dup             
	//*  29   53:iconst_1        
	//*  30   54:aload_3         
	//*  31   55:aastore         
	//*  32   56:invokevirtual   #250 <Method Object AnnotatedMethod.callOnWith(Object, Object[])>
	//*  33   59:pop             
	//*  34   60:return          
			// Misplaced declaration of an exception variable
			catch(Object obj)
	//*  35   61:astore_1        
			{
				_throwAsIOE(((Exception) (obj)), obj1, obj2);
	//   36   62:aload_0         
	//   37   63:aload_1         
	//   38   64:aload_2         
	//   39   65:aload_3         
	//   40   66:invokevirtual   #252 <Method void _throwAsIOE(Exception, Object, Object)>
			}
		break MISSING_BLOCK_LABEL_69;
		((AnnotatedMethod)_setter).callOnWith(obj, new Object[] {
			obj1, obj2
		});
		return;
	//   41   69:return          
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #79  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #89  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("[any property on class ");
	//    4    8:aload_1         
	//    5    9:ldc1            #254 <String "[any property on class ">
	//    6   11:invokevirtual   #94  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(getClassName());
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:invokespecial   #96  <Method String getClassName()>
	//   11   20:invokevirtual   #94  <Method StringBuilder StringBuilder.append(String)>
	//   12   23:pop             
		stringbuilder.append("]");
	//   13   24:aload_1         
	//   14   25:ldc2            #256 <String "]">
	//   15   28:invokevirtual   #94  <Method StringBuilder StringBuilder.append(String)>
	//   16   31:pop             
		return stringbuilder.toString();
	//   17   32:aload_1         
	//   18   33:invokevirtual   #101 <Method String StringBuilder.toString()>
	//   19   36:areturn         
	}

	public SettableAnyProperty withValueDeserializer(JsonDeserializer jsondeserializer)
	{
		return new SettableAnyProperty(_property, _setter, _type, _keyDeserializer, jsondeserializer, _valueTypeDeserializer);
	//    0    0:new             #2   <Class SettableAnyProperty>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #35  <Field BeanProperty _property>
	//    4    8:aload_0         
	//    5    9:getfield        #37  <Field AnnotatedMember _setter>
	//    6   12:aload_0         
	//    7   13:getfield        #39  <Field JavaType _type>
	//    8   16:aload_0         
	//    9   17:getfield        #45  <Field KeyDeserializer _keyDeserializer>
	//   10   20:aload_1         
	//   11   21:aload_0         
	//   12   22:getfield        #43  <Field TypeDeserializer _valueTypeDeserializer>
	//   13   25:invokespecial   #260 <Method void SettableAnyProperty(BeanProperty, AnnotatedMember, JavaType, KeyDeserializer, JsonDeserializer, TypeDeserializer)>
	//   14   28:areturn         
	}

	private static final long serialVersionUID = 1L;
	protected final KeyDeserializer _keyDeserializer;
	protected final BeanProperty _property;
	protected final AnnotatedMember _setter;
	final boolean _setterIsField;
	protected final JavaType _type;
	protected JsonDeserializer _valueDeserializer;
	protected final TypeDeserializer _valueTypeDeserializer;
}
