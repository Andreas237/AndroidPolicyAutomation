// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer;
import com.fasterxml.jackson.databind.introspect.AnnotatedParameter;
import com.fasterxml.jackson.databind.introspect.AnnotatedWithParams;
import java.io.IOException;

// Referenced classes of package com.fasterxml.jackson.databind.deser:
//			SettableBeanProperty

public abstract class ValueInstantiator
{
	public static class Base extends ValueInstantiator
	{

		public Class getValueClass()
		{
			return _valueType;
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field Class _valueType>
		//    2    4:areturn         
		}

		public String getValueTypeDesc()
		{
			return _valueType.getName();
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field Class _valueType>
		//    2    4:invokevirtual   #34  <Method String Class.getName()>
		//    3    7:areturn         
		}

		protected final Class _valueType;

		public Base(JavaType javatype)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #13  <Method void ValueInstantiator()>
			_valueType = javatype.getRawClass();
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:invokevirtual   #19  <Method Class JavaType.getRawClass()>
		//    5    9:putfield        #21  <Field Class _valueType>
		//    6   12:return          
		}

		public Base(Class class1)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #13  <Method void ValueInstantiator()>
			_valueType = class1;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #21  <Field Class _valueType>
		//    5    9:return          
		}
	}

	public static interface Gettable
	{

		public abstract ValueInstantiator getValueInstantiator();
	}


	public ValueInstantiator()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
	//    2    4:return          
	}

	protected Object _createFromStringFallbacks(DeserializationContext deserializationcontext, String s)
		throws IOException
	{
		if(canCreateFromBoolean())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #23  <Method boolean canCreateFromBoolean()>
	//*   2    4:ifeq            44
		{
			String s1 = s.trim();
	//    3    7:aload_2         
	//    4    8:invokevirtual   #29  <Method String String.trim()>
	//    5   11:astore_3        
			if("true".equals(((Object) (s1))))
	//*   6   12:ldc1            #31  <String "true">
	//*   7   14:aload_3         
	//*   8   15:invokevirtual   #35  <Method boolean String.equals(Object)>
	//*   9   18:ifeq            28
				return createFromBoolean(deserializationcontext, true);
	//   10   21:aload_0         
	//   11   22:aload_1         
	//   12   23:iconst_1        
	//   13   24:invokevirtual   #39  <Method Object createFromBoolean(DeserializationContext, boolean)>
	//   14   27:areturn         
			if("false".equals(((Object) (s1))))
	//*  15   28:ldc1            #41  <String "false">
	//*  16   30:aload_3         
	//*  17   31:invokevirtual   #35  <Method boolean String.equals(Object)>
	//*  18   34:ifeq            44
				return createFromBoolean(deserializationcontext, false);
	//   19   37:aload_0         
	//   20   38:aload_1         
	//   21   39:iconst_0        
	//   22   40:invokevirtual   #39  <Method Object createFromBoolean(DeserializationContext, boolean)>
	//   23   43:areturn         
		}
		if(s.length() == 0 && deserializationcontext.isEnabled(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT))
	//*  24   44:aload_2         
	//*  25   45:invokevirtual   #45  <Method int String.length()>
	//*  26   48:ifne            63
	//*  27   51:aload_1         
	//*  28   52:getstatic       #51  <Field DeserializationFeature DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT>
	//*  29   55:invokevirtual   #57  <Method boolean DeserializationContext.isEnabled(DeserializationFeature)>
	//*  30   58:ifeq            63
			return ((Object) (null));
	//   31   61:aconst_null     
	//   32   62:areturn         
		else
			return deserializationcontext.handleMissingInstantiator(getValueClass(), this, deserializationcontext.getParser(), "no String-argument constructor/factory method to deserialize from String value ('%s')", new Object[] {
				s
			});
	//   33   63:aload_1         
	//   34   64:aload_0         
	//   35   65:invokevirtual   #61  <Method Class getValueClass()>
	//   36   68:aload_0         
	//   37   69:aload_1         
	//   38   70:invokevirtual   #65  <Method com.fasterxml.jackson.core.JsonParser DeserializationContext.getParser()>
	//   39   73:ldc1            #67  <String "no String-argument constructor/factory method to deserialize from String value ('%s')">
	//   40   75:iconst_1        
	//   41   76:anewarray       Object[]
	//   42   79:dup             
	//   43   80:iconst_0        
	//   44   81:aload_2         
	//   45   82:aastore         
	//   46   83:invokevirtual   #71  <Method Object DeserializationContext.handleMissingInstantiator(Class, ValueInstantiator, com.fasterxml.jackson.core.JsonParser, String, Object[])>
	//   47   86:areturn         
	}

	public boolean canCreateFromBoolean()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public boolean canCreateFromDouble()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public boolean canCreateFromInt()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public boolean canCreateFromLong()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public boolean canCreateFromObjectWith()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public boolean canCreateFromString()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public boolean canCreateUsingArrayDelegate()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public boolean canCreateUsingDefault()
	{
		return getDefaultCreator() != null;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #83  <Method AnnotatedWithParams getDefaultCreator()>
	//    2    4:ifnull          9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	public boolean canCreateUsingDelegate()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public boolean canInstantiate()
	{
		return canCreateUsingDefault() || canCreateUsingDelegate() || canCreateUsingArrayDelegate() || canCreateFromObjectWith() || canCreateFromString() || canCreateFromInt() || canCreateFromLong() || canCreateFromDouble() || canCreateFromBoolean();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #87  <Method boolean canCreateUsingDefault()>
	//    2    4:ifne            68
	//    3    7:aload_0         
	//    4    8:invokevirtual   #89  <Method boolean canCreateUsingDelegate()>
	//    5   11:ifne            68
	//    6   14:aload_0         
	//    7   15:invokevirtual   #91  <Method boolean canCreateUsingArrayDelegate()>
	//    8   18:ifne            68
	//    9   21:aload_0         
	//   10   22:invokevirtual   #93  <Method boolean canCreateFromObjectWith()>
	//   11   25:ifne            68
	//   12   28:aload_0         
	//   13   29:invokevirtual   #95  <Method boolean canCreateFromString()>
	//   14   32:ifne            68
	//   15   35:aload_0         
	//   16   36:invokevirtual   #97  <Method boolean canCreateFromInt()>
	//   17   39:ifne            68
	//   18   42:aload_0         
	//   19   43:invokevirtual   #99  <Method boolean canCreateFromLong()>
	//   20   46:ifne            68
	//   21   49:aload_0         
	//   22   50:invokevirtual   #101 <Method boolean canCreateFromDouble()>
	//   23   53:ifne            68
	//   24   56:aload_0         
	//   25   57:invokevirtual   #23  <Method boolean canCreateFromBoolean()>
	//   26   60:ifeq            66
	//   27   63:goto            68
	//   28   66:iconst_0        
	//   29   67:ireturn         
	//   30   68:iconst_1        
	//   31   69:ireturn         
	}

	public Object createFromBoolean(DeserializationContext deserializationcontext, boolean flag)
		throws IOException
	{
		return deserializationcontext.handleMissingInstantiator(getValueClass(), this, ((com.fasterxml.jackson.core.JsonParser) (null)), "no boolean/Boolean-argument constructor/factory method to deserialize from boolean value (%s)", new Object[] {
			Boolean.valueOf(flag)
		});
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #61  <Method Class getValueClass()>
	//    3    5:aload_0         
	//    4    6:aconst_null     
	//    5    7:ldc1            #103 <String "no boolean/Boolean-argument constructor/factory method to deserialize from boolean value (%s)">
	//    6    9:iconst_1        
	//    7   10:anewarray       Object[]
	//    8   13:dup             
	//    9   14:iconst_0        
	//   10   15:iload_2         
	//   11   16:invokestatic    #109 <Method Boolean Boolean.valueOf(boolean)>
	//   12   19:aastore         
	//   13   20:invokevirtual   #71  <Method Object DeserializationContext.handleMissingInstantiator(Class, ValueInstantiator, com.fasterxml.jackson.core.JsonParser, String, Object[])>
	//   14   23:areturn         
	}

	public Object createFromDouble(DeserializationContext deserializationcontext, double d)
		throws IOException
	{
		return deserializationcontext.handleMissingInstantiator(getValueClass(), this, ((com.fasterxml.jackson.core.JsonParser) (null)), "no double/Double-argument constructor/factory method to deserialize from Number value (%s)", new Object[] {
			Double.valueOf(d)
		});
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #61  <Method Class getValueClass()>
	//    3    5:aload_0         
	//    4    6:aconst_null     
	//    5    7:ldc1            #113 <String "no double/Double-argument constructor/factory method to deserialize from Number value (%s)">
	//    6    9:iconst_1        
	//    7   10:anewarray       Object[]
	//    8   13:dup             
	//    9   14:iconst_0        
	//   10   15:dload_2         
	//   11   16:invokestatic    #118 <Method Double Double.valueOf(double)>
	//   12   19:aastore         
	//   13   20:invokevirtual   #71  <Method Object DeserializationContext.handleMissingInstantiator(Class, ValueInstantiator, com.fasterxml.jackson.core.JsonParser, String, Object[])>
	//   14   23:areturn         
	}

	public Object createFromInt(DeserializationContext deserializationcontext, int i)
		throws IOException
	{
		return deserializationcontext.handleMissingInstantiator(getValueClass(), this, ((com.fasterxml.jackson.core.JsonParser) (null)), "no int/Int-argument constructor/factory method to deserialize from Number value (%s)", new Object[] {
			Integer.valueOf(i)
		});
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #61  <Method Class getValueClass()>
	//    3    5:aload_0         
	//    4    6:aconst_null     
	//    5    7:ldc1            #122 <String "no int/Int-argument constructor/factory method to deserialize from Number value (%s)">
	//    6    9:iconst_1        
	//    7   10:anewarray       Object[]
	//    8   13:dup             
	//    9   14:iconst_0        
	//   10   15:iload_2         
	//   11   16:invokestatic    #127 <Method Integer Integer.valueOf(int)>
	//   12   19:aastore         
	//   13   20:invokevirtual   #71  <Method Object DeserializationContext.handleMissingInstantiator(Class, ValueInstantiator, com.fasterxml.jackson.core.JsonParser, String, Object[])>
	//   14   23:areturn         
	}

	public Object createFromLong(DeserializationContext deserializationcontext, long l)
		throws IOException
	{
		return deserializationcontext.handleMissingInstantiator(getValueClass(), this, ((com.fasterxml.jackson.core.JsonParser) (null)), "no long/Long-argument constructor/factory method to deserialize from Number value (%s)", new Object[] {
			Long.valueOf(l)
		});
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #61  <Method Class getValueClass()>
	//    3    5:aload_0         
	//    4    6:aconst_null     
	//    5    7:ldc1            #131 <String "no long/Long-argument constructor/factory method to deserialize from Number value (%s)">
	//    6    9:iconst_1        
	//    7   10:anewarray       Object[]
	//    8   13:dup             
	//    9   14:iconst_0        
	//   10   15:lload_2         
	//   11   16:invokestatic    #136 <Method Long Long.valueOf(long)>
	//   12   19:aastore         
	//   13   20:invokevirtual   #71  <Method Object DeserializationContext.handleMissingInstantiator(Class, ValueInstantiator, com.fasterxml.jackson.core.JsonParser, String, Object[])>
	//   14   23:areturn         
	}

	public Object createFromObjectWith(DeserializationContext deserializationcontext, SettableBeanProperty asettablebeanproperty[], PropertyValueBuffer propertyvaluebuffer)
		throws IOException
	{
		return createFromObjectWith(deserializationcontext, propertyvaluebuffer.getParameters(asettablebeanproperty));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_3         
	//    3    3:aload_2         
	//    4    4:invokevirtual   #144 <Method Object[] PropertyValueBuffer.getParameters(SettableBeanProperty[])>
	//    5    7:invokevirtual   #147 <Method Object createFromObjectWith(DeserializationContext, Object[])>
	//    6   10:areturn         
	}

	public Object createFromObjectWith(DeserializationContext deserializationcontext, Object aobj[])
		throws IOException
	{
		return deserializationcontext.handleMissingInstantiator(getValueClass(), this, ((com.fasterxml.jackson.core.JsonParser) (null)), "no creator with arguments specified", new Object[0]);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #61  <Method Class getValueClass()>
	//    3    5:aload_0         
	//    4    6:aconst_null     
	//    5    7:ldc1            #149 <String "no creator with arguments specified">
	//    6    9:iconst_0        
	//    7   10:anewarray       Object[]
	//    8   13:invokevirtual   #71  <Method Object DeserializationContext.handleMissingInstantiator(Class, ValueInstantiator, com.fasterxml.jackson.core.JsonParser, String, Object[])>
	//    9   16:areturn         
	}

	public Object createFromString(DeserializationContext deserializationcontext, String s)
		throws IOException
	{
		return _createFromStringFallbacks(deserializationcontext, s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #152 <Method Object _createFromStringFallbacks(DeserializationContext, String)>
	//    4    6:areturn         
	}

	public Object createUsingArrayDelegate(DeserializationContext deserializationcontext, Object obj)
		throws IOException
	{
		return deserializationcontext.handleMissingInstantiator(getValueClass(), this, ((com.fasterxml.jackson.core.JsonParser) (null)), "no array delegate creator specified", new Object[0]);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #61  <Method Class getValueClass()>
	//    3    5:aload_0         
	//    4    6:aconst_null     
	//    5    7:ldc1            #156 <String "no array delegate creator specified">
	//    6    9:iconst_0        
	//    7   10:anewarray       Object[]
	//    8   13:invokevirtual   #71  <Method Object DeserializationContext.handleMissingInstantiator(Class, ValueInstantiator, com.fasterxml.jackson.core.JsonParser, String, Object[])>
	//    9   16:areturn         
	}

	public Object createUsingDefault(DeserializationContext deserializationcontext)
		throws IOException
	{
		return deserializationcontext.handleMissingInstantiator(getValueClass(), this, ((com.fasterxml.jackson.core.JsonParser) (null)), "no default no-arguments constructor found", new Object[0]);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #61  <Method Class getValueClass()>
	//    3    5:aload_0         
	//    4    6:aconst_null     
	//    5    7:ldc1            #160 <String "no default no-arguments constructor found">
	//    6    9:iconst_0        
	//    7   10:anewarray       Object[]
	//    8   13:invokevirtual   #71  <Method Object DeserializationContext.handleMissingInstantiator(Class, ValueInstantiator, com.fasterxml.jackson.core.JsonParser, String, Object[])>
	//    9   16:areturn         
	}

	public Object createUsingDelegate(DeserializationContext deserializationcontext, Object obj)
		throws IOException
	{
		return deserializationcontext.handleMissingInstantiator(getValueClass(), this, ((com.fasterxml.jackson.core.JsonParser) (null)), "no delegate creator specified", new Object[0]);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #61  <Method Class getValueClass()>
	//    3    5:aload_0         
	//    4    6:aconst_null     
	//    5    7:ldc1            #163 <String "no delegate creator specified">
	//    6    9:iconst_0        
	//    7   10:anewarray       Object[]
	//    8   13:invokevirtual   #71  <Method Object DeserializationContext.handleMissingInstantiator(Class, ValueInstantiator, com.fasterxml.jackson.core.JsonParser, String, Object[])>
	//    9   16:areturn         
	}

	public AnnotatedWithParams getArrayDelegateCreator()
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public JavaType getArrayDelegateType(DeserializationConfig deserializationconfig)
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public AnnotatedWithParams getDefaultCreator()
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public AnnotatedWithParams getDelegateCreator()
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public JavaType getDelegateType(DeserializationConfig deserializationconfig)
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public SettableBeanProperty[] getFromObjectArguments(DeserializationConfig deserializationconfig)
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public AnnotatedParameter getIncompleteParameter()
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public Class getValueClass()
	{
		return java/lang/Object;
	//    0    0:ldc1            #4   <Class Object>
	//    1    2:areturn         
	}

	public String getValueTypeDesc()
	{
		Class class1 = getValueClass();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #61  <Method Class getValueClass()>
	//    2    4:astore_1        
		if(class1 == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       12
			return "UNKNOWN";
	//    5    9:ldc1            #177 <String "UNKNOWN">
	//    6   11:areturn         
		else
			return class1.getName();
	//    7   12:aload_1         
	//    8   13:invokevirtual   #182 <Method String Class.getName()>
	//    9   16:areturn         
	}
}
