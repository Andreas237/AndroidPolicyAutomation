// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.deser.impl.ReadableObjectId;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.Method;

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
			if(!hasId(obj))
		//*   0    0:aload_0         
		//*   1    1:aload_1         
		//*   2    2:invokevirtual   #35  <Method boolean hasId(Object)>
		//*   3    5:ifne            43
			{
				throw new IllegalArgumentException((new StringBuilder()).append("Trying to resolve a forward reference with id [").append(obj.toString()).append("] that wasn't previously registered.").toString());
		//    4    8:new             #37  <Class IllegalArgumentException>
		//    5   11:dup             
		//    6   12:new             #39  <Class StringBuilder>
		//    7   15:dup             
		//    8   16:invokespecial   #42  <Method void StringBuilder()>
		//    9   19:ldc1            #44  <String "Trying to resolve a forward reference with id [">
		//   10   21:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
		//   11   24:aload_1         
		//   12   25:invokevirtual   #54  <Method String Object.toString()>
		//   13   28:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
		//   14   31:ldc1            #56  <String "] that wasn't previously registered.">
		//   15   33:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
		//   16   36:invokevirtual   #57  <Method String StringBuilder.toString()>
		//   17   39:invokespecial   #60  <Method void IllegalArgumentException(String)>
		//   18   42:athrow          
			} else
			{
				_parent.set(_pojo, _propName, obj1);
		//   19   43:aload_0         
		//   20   44:getfield        #20  <Field SettableAnyProperty _parent>
		//   21   47:aload_0         
		//   22   48:getfield        #22  <Field Object _pojo>
		//   23   51:aload_0         
		//   24   52:getfield        #24  <Field String _propName>
		//   25   55:aload_2         
		//   26   56:invokevirtual   #64  <Method void SettableAnyProperty.set(Object, String, Object)>
				return;
		//   27   59:return          
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


	public SettableAnyProperty(BeanProperty beanproperty, AnnotatedMethod annotatedmethod, JavaType javatype, JsonDeserializer jsondeserializer, TypeDeserializer typedeserializer)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #29  <Method void Object()>
		_property = beanproperty;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #31  <Field BeanProperty _property>
		_setter = annotatedmethod;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #33  <Field AnnotatedMethod _setter>
		_type = javatype;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #35  <Field JavaType _type>
		_valueDeserializer = jsondeserializer;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #37  <Field JsonDeserializer _valueDeserializer>
		_valueTypeDeserializer = typedeserializer;
	//   14   25:aload_0         
	//   15   26:aload           5
	//   16   28:putfield        #39  <Field TypeDeserializer _valueTypeDeserializer>
	//   17   31:return          
	}

	protected SettableAnyProperty(SettableAnyProperty settableanyproperty)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #29  <Method void Object()>
		_property = settableanyproperty._property;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:getfield        #31  <Field BeanProperty _property>
	//    5    9:putfield        #31  <Field BeanProperty _property>
		_setter = settableanyproperty._setter;
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:getfield        #33  <Field AnnotatedMethod _setter>
	//    9   17:putfield        #33  <Field AnnotatedMethod _setter>
		_type = settableanyproperty._type;
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:getfield        #35  <Field JavaType _type>
	//   13   25:putfield        #35  <Field JavaType _type>
		_valueDeserializer = settableanyproperty._valueDeserializer;
	//   14   28:aload_0         
	//   15   29:aload_1         
	//   16   30:getfield        #37  <Field JsonDeserializer _valueDeserializer>
	//   17   33:putfield        #37  <Field JsonDeserializer _valueDeserializer>
		_valueTypeDeserializer = settableanyproperty._valueTypeDeserializer;
	//   18   36:aload_0         
	//   19   37:aload_1         
	//   20   38:getfield        #39  <Field TypeDeserializer _valueTypeDeserializer>
	//   21   41:putfield        #39  <Field TypeDeserializer _valueTypeDeserializer>
	//   22   44:return          
	}

	private String getClassName()
	{
		return _setter.getDeclaringClass().getName();
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field AnnotatedMethod _setter>
	//    2    4:invokevirtual   #51  <Method Class AnnotatedMethod.getDeclaringClass()>
	//    3    7:invokevirtual   #56  <Method String Class.getName()>
	//    4   10:areturn         
	}

	protected void _throwAsIOE(Exception exception, String s, Object obj)
		throws IOException
	{
		if(exception instanceof IllegalArgumentException)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #62  <Class IllegalArgumentException>
	//*   2    4:ifeq            138
		{
			if(obj == null)
	//*   3    7:aload_3         
	//*   4    8:ifnonnull       117
				obj = "[NULL]";
	//    5   11:ldc1            #64  <String "[NULL]">
	//    6   13:astore_3        
			else
	//*   7   14:new             #66  <Class StringBuilder>
	//*   8   17:dup             
	//*   9   18:ldc1            #68  <String "Problem deserializing \"any\" property '">
	//*  10   20:invokespecial   #71  <Method void StringBuilder(String)>
	//*  11   23:aload_2         
	//*  12   24:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//*  13   27:astore_2        
	//*  14   28:aload_2         
	//*  15   29:new             #66  <Class StringBuilder>
	//*  16   32:dup             
	//*  17   33:invokespecial   #76  <Method void StringBuilder()>
	//*  18   36:ldc1            #78  <String "' of class ">
	//*  19   38:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//*  20   41:aload_0         
	//*  21   42:invokespecial   #80  <Method String getClassName()>
	//*  22   45:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//*  23   48:ldc1            #82  <String " (expected type: ">
	//*  24   50:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//*  25   53:invokevirtual   #85  <Method String StringBuilder.toString()>
	//*  26   56:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//*  27   59:aload_0         
	//*  28   60:getfield        #35  <Field JavaType _type>
	//*  29   63:invokevirtual   #88  <Method StringBuilder StringBuilder.append(Object)>
	//*  30   66:pop             
	//*  31   67:aload_2         
	//*  32   68:ldc1            #90  <String "; actual type: ">
	//*  33   70:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//*  34   73:aload_3         
	//*  35   74:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//*  36   77:ldc1            #92  <String ")">
	//*  37   79:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//*  38   82:pop             
	//*  39   83:aload_1         
	//*  40   84:invokevirtual   #97  <Method String Exception.getMessage()>
	//*  41   87:astore_3        
	//*  42   88:aload_3         
	//*  43   89:ifnull          128
	//*  44   92:aload_2         
	//*  45   93:ldc1            #99  <String ", problem: ">
	//*  46   95:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//*  47   98:aload_3         
	//*  48   99:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//*  49  102:pop             
	//*  50  103:new             #101 <Class JsonMappingException>
	//*  51  106:dup             
	//*  52  107:aconst_null     
	//*  53  108:aload_2         
	//*  54  109:invokevirtual   #85  <Method String StringBuilder.toString()>
	//*  55  112:aload_1         
	//*  56  113:invokespecial   #104 <Method void JsonMappingException(java.io.Closeable, String, Throwable)>
	//*  57  116:athrow          
				obj = ((Object) (obj.getClass().getName()));
	//   58  117:aload_3         
	//   59  118:invokevirtual   #107 <Method Class Object.getClass()>
	//   60  121:invokevirtual   #56  <Method String Class.getName()>
	//   61  124:astore_3        
			s = ((String) ((new StringBuilder("Problem deserializing \"any\" property '")).append(s)));
			((StringBuilder) (s)).append((new StringBuilder()).append("' of class ").append(getClassName()).append(" (expected type: ").toString()).append(((Object) (_type)));
			((StringBuilder) (s)).append("; actual type: ").append(((String) (obj))).append(")");
			obj = ((Object) (exception.getMessage()));
			if(obj != null)
				((StringBuilder) (s)).append(", problem: ").append(((String) (obj)));
			else
	//*  62  125:goto            14
				((StringBuilder) (s)).append(" (no error message provided)");
	//   63  128:aload_2         
	//   64  129:ldc1            #109 <String " (no error message provided)">
	//   65  131:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//   66  134:pop             
			throw new JsonMappingException(((java.io.Closeable) (null)), ((StringBuilder) (s)).toString(), ((Throwable) (exception)));
		}
	//*  67  135:goto            103
		if(exception instanceof IOException)
	//*  68  138:aload_1         
	//*  69  139:instanceof      #60  <Class IOException>
	//*  70  142:ifeq            150
			throw (IOException)exception;
	//   71  145:aload_1         
	//   72  146:checkcast       #60  <Class IOException>
	//   73  149:athrow          
		if(exception instanceof RuntimeException)
	//*  74  150:aload_1         
	//*  75  151:instanceof      #111 <Class RuntimeException>
	//*  76  154:ifeq            162
			throw (RuntimeException)exception;
	//   77  157:aload_1         
	//   78  158:checkcast       #111 <Class RuntimeException>
	//   79  161:athrow          
		for(; ((Throwable) (exception)).getCause() != null; exception = ((Exception) (((Throwable) (exception)).getCause())));
	//   80  162:aload_1         
	//   81  163:invokevirtual   #117 <Method Throwable Throwable.getCause()>
	//   82  166:ifnull          177
	//   83  169:aload_1         
	//   84  170:invokevirtual   #117 <Method Throwable Throwable.getCause()>
	//   85  173:astore_1        
	//*  86  174:goto            162
		throw new JsonMappingException(((java.io.Closeable) (null)), ((Throwable) (exception)).getMessage(), ((Throwable) (exception)));
	//   87  177:new             #101 <Class JsonMappingException>
	//   88  180:dup             
	//   89  181:aconst_null     
	//   90  182:aload_1         
	//   91  183:invokevirtual   #118 <Method String Throwable.getMessage()>
	//   92  186:aload_1         
	//   93  187:invokespecial   #104 <Method void JsonMappingException(java.io.Closeable, String, Throwable)>
	//   94  190:athrow          
	}

	public Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException
	{
		if(jsonparser.getCurrentToken() == JsonToken.VALUE_NULL)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #127 <Method JsonToken JsonParser.getCurrentToken()>
	//*   2    4:getstatic       #133 <Field JsonToken JsonToken.VALUE_NULL>
	//*   3    7:if_acmpne       12
			return ((Object) (null));
	//    4   10:aconst_null     
	//    5   11:areturn         
		if(_valueTypeDeserializer != null)
	//*   6   12:aload_0         
	//*   7   13:getfield        #39  <Field TypeDeserializer _valueTypeDeserializer>
	//*   8   16:ifnull          33
			return _valueDeserializer.deserializeWithType(jsonparser, deserializationcontext, _valueTypeDeserializer);
	//    9   19:aload_0         
	//   10   20:getfield        #37  <Field JsonDeserializer _valueDeserializer>
	//   11   23:aload_1         
	//   12   24:aload_2         
	//   13   25:aload_0         
	//   14   26:getfield        #39  <Field TypeDeserializer _valueTypeDeserializer>
	//   15   29:invokevirtual   #139 <Method Object JsonDeserializer.deserializeWithType(JsonParser, DeserializationContext, TypeDeserializer)>
	//   16   32:areturn         
		else
			return _valueDeserializer.deserialize(jsonparser, deserializationcontext);
	//   17   33:aload_0         
	//   18   34:getfield        #37  <Field JsonDeserializer _valueDeserializer>
	//   19   37:aload_1         
	//   20   38:aload_2         
	//   21   39:invokevirtual   #141 <Method Object JsonDeserializer.deserialize(JsonParser, DeserializationContext)>
	//   22   42:areturn         
	}

	public final void deserializeAndSet(JsonParser jsonparser, DeserializationContext deserializationcontext, Object obj, String s)
		throws IOException
	{
		try
		{
			set(obj, s, deserialize(jsonparser, deserializationcontext));
	//    0    0:aload_0         
	//    1    1:aload_3         
	//    2    2:aload           4
	//    3    4:aload_0         
	//    4    5:aload_1         
	//    5    6:aload_2         
	//    6    7:invokevirtual   #146 <Method Object deserialize(JsonParser, DeserializationContext)>
	//    7   10:invokevirtual   #150 <Method void set(Object, String, Object)>
			return;
	//    8   13:return          
		}
		// Misplaced declaration of an exception variable
		catch(DeserializationContext deserializationcontext) { }
	//    9   14:astore_2        
		if(_valueDeserializer.getObjectIdReader() == null)
	//*  10   15:aload_0         
	//*  11   16:getfield        #37  <Field JsonDeserializer _valueDeserializer>
	//*  12   19:invokevirtual   #154 <Method com.fasterxml.jackson.databind.deser.impl.ObjectIdReader JsonDeserializer.getObjectIdReader()>
	//*  13   22:ifnonnull       33
		{
			throw JsonMappingException.from(jsonparser, "Unresolved forward reference but no identity info.", ((Throwable) (deserializationcontext)));
	//   14   25:aload_1         
	//   15   26:ldc1            #156 <String "Unresolved forward reference but no identity info.">
	//   16   28:aload_2         
	//   17   29:invokestatic    #160 <Method JsonMappingException JsonMappingException.from(JsonParser, String, Throwable)>
	//   18   32:athrow          
		} else
		{
			jsonparser = ((JsonParser) (new AnySetterReferring(this, ((UnresolvedForwardReference) (deserializationcontext)), _type.getRawClass(), obj, s)));
	//   19   33:new             #8   <Class SettableAnyProperty$AnySetterReferring>
	//   20   36:dup             
	//   21   37:aload_0         
	//   22   38:aload_2         
	//   23   39:aload_0         
	//   24   40:getfield        #35  <Field JavaType _type>
	//   25   43:invokevirtual   #165 <Method Class JavaType.getRawClass()>
	//   26   46:aload_3         
	//   27   47:aload           4
	//   28   49:invokespecial   #168 <Method void SettableAnyProperty$AnySetterReferring(SettableAnyProperty, UnresolvedForwardReference, Class, Object, String)>
	//   29   52:astore_1        
			((UnresolvedForwardReference) (deserializationcontext)).getRoid().appendReferring(((com.fasterxml.jackson.databind.deser.impl.ReadableObjectId.Referring) (jsonparser)));
	//   30   53:aload_2         
	//   31   54:invokevirtual   #172 <Method ReadableObjectId UnresolvedForwardReference.getRoid()>
	//   32   57:aload_1         
	//   33   58:invokevirtual   #178 <Method void ReadableObjectId.appendReferring(com.fasterxml.jackson.databind.deser.impl.ReadableObjectId$Referring)>
			return;
	//   34   61:return          
		}
	}

	public BeanProperty getProperty()
	{
		return _property;
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field BeanProperty _property>
	//    2    4:areturn         
	}

	public JavaType getType()
	{
		return _type;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field JavaType _type>
	//    2    4:areturn         
	}

	public boolean hasValueDeserializer()
	{
		return _valueDeserializer != null;
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field JsonDeserializer _valueDeserializer>
	//    2    4:ifnull          9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	Object readResolve()
	{
		if(_setter == null || _setter.getAnnotated() == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #33  <Field AnnotatedMethod _setter>
	//*   2    4:ifnull          17
	//*   3    7:aload_0         
	//*   4    8:getfield        #33  <Field AnnotatedMethod _setter>
	//*   5   11:invokevirtual   #190 <Method Method AnnotatedMethod.getAnnotated()>
	//*   6   14:ifnonnull       27
			throw new IllegalArgumentException("Missing method (broken JDK (de)serialization?)");
	//    7   17:new             #62  <Class IllegalArgumentException>
	//    8   20:dup             
	//    9   21:ldc1            #192 <String "Missing method (broken JDK (de)serialization?)">
	//   10   23:invokespecial   #193 <Method void IllegalArgumentException(String)>
	//   11   26:athrow          
		else
			return ((Object) (this));
	//   12   27:aload_0         
	//   13   28:areturn         
	}

	public void set(Object obj, String s, Object obj1)
		throws IOException
	{
		try
		{
			_setter.getAnnotated().invoke(obj, new Object[] {
				s, obj1
			});
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field AnnotatedMethod _setter>
	//    2    4:invokevirtual   #190 <Method Method AnnotatedMethod.getAnnotated()>
	//    3    7:aload_1         
	//    4    8:iconst_2        
	//    5    9:anewarray       Object[]
	//    6   12:dup             
	//    7   13:iconst_0        
	//    8   14:aload_2         
	//    9   15:aastore         
	//   10   16:dup             
	//   11   17:iconst_1        
	//   12   18:aload_3         
	//   13   19:aastore         
	//   14   20:invokevirtual   #199 <Method Object Method.invoke(Object, Object[])>
	//   15   23:pop             
			return;
	//   16   24:return          
		}
		// Misplaced declaration of an exception variable
		catch(Object obj)
	//*  17   25:astore_1        
		{
			_throwAsIOE(((Exception) (obj)), s, obj1);
	//   18   26:aload_0         
	//   19   27:aload_1         
	//   20   28:aload_2         
	//   21   29:aload_3         
	//   22   30:invokevirtual   #201 <Method void _throwAsIOE(Exception, String, Object)>
		}
	//   23   33:return          
	}

	public String toString()
	{
		return (new StringBuilder()).append("[any property on class ").append(getClassName()).append("]").toString();
	//    0    0:new             #66  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #76  <Method void StringBuilder()>
	//    3    7:ldc1            #203 <String "[any property on class ">
	//    4    9:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//    5   12:aload_0         
	//    6   13:invokespecial   #80  <Method String getClassName()>
	//    7   16:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//    8   19:ldc1            #205 <String "]">
	//    9   21:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//   10   24:invokevirtual   #85  <Method String StringBuilder.toString()>
	//   11   27:areturn         
	}

	public SettableAnyProperty withValueDeserializer(JsonDeserializer jsondeserializer)
	{
		return new SettableAnyProperty(_property, _setter, _type, jsondeserializer, _valueTypeDeserializer);
	//    0    0:new             #2   <Class SettableAnyProperty>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #31  <Field BeanProperty _property>
	//    4    8:aload_0         
	//    5    9:getfield        #33  <Field AnnotatedMethod _setter>
	//    6   12:aload_0         
	//    7   13:getfield        #35  <Field JavaType _type>
	//    8   16:aload_1         
	//    9   17:aload_0         
	//   10   18:getfield        #39  <Field TypeDeserializer _valueTypeDeserializer>
	//   11   21:invokespecial   #209 <Method void SettableAnyProperty(BeanProperty, AnnotatedMethod, JavaType, JsonDeserializer, TypeDeserializer)>
	//   12   24:areturn         
	}

	private static final long serialVersionUID = 1L;
	protected final BeanProperty _property;
	protected final AnnotatedMethod _setter;
	protected final JavaType _type;
	protected JsonDeserializer _valueDeserializer;
	protected final TypeDeserializer _valueTypeDeserializer;
}
