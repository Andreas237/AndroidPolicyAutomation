// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.introspect.AnnotatedParameter;
import com.fasterxml.jackson.databind.introspect.AnnotatedWithParams;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;

public class StdValueInstantiator extends ValueInstantiator
	implements Serializable
{

	public StdValueInstantiator(DeserializationConfig deserializationconfig, JavaType javatype)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #40  <Method void ValueInstantiator()>
		if(javatype == null)
	//*   2    4:aload_2         
	//*   3    5:ifnonnull       14
			deserializationconfig = "UNKNOWN TYPE";
	//    4    8:ldc1            #42  <String "UNKNOWN TYPE">
	//    5   10:astore_1        
		else
	//*   6   11:goto            19
			deserializationconfig = ((DeserializationConfig) (javatype.toString()));
	//    7   14:aload_2         
	//    8   15:invokevirtual   #48  <Method String JavaType.toString()>
	//    9   18:astore_1        
		_valueTypeDesc = ((String) (deserializationconfig));
	//   10   19:aload_0         
	//   11   20:aload_1         
	//   12   21:putfield        #50  <Field String _valueTypeDesc>
		if(javatype == null)
	//*  13   24:aload_2         
	//*  14   25:ifnonnull       34
			deserializationconfig = java/lang/Object;
	//   15   28:ldc1            #52  <Class Object>
	//   16   30:astore_1        
		else
	//*  17   31:goto            39
			deserializationconfig = ((DeserializationConfig) (javatype.getRawClass()));
	//   18   34:aload_2         
	//   19   35:invokevirtual   #56  <Method Class JavaType.getRawClass()>
	//   20   38:astore_1        
		_valueClass = ((Class) (deserializationconfig));
	//   21   39:aload_0         
	//   22   40:aload_1         
	//   23   41:putfield        #58  <Field Class _valueClass>
	//   24   44:return          
	}

	private Object _createUsingDelegate(AnnotatedWithParams annotatedwithparams, SettableBeanProperty asettablebeanproperty[], DeserializationContext deserializationcontext, Object obj)
		throws IOException
	{
		if(annotatedwithparams == null) goto _L2; else goto _L1
	//    0    0:aload_1         
	//    1    1:ifnull          69
_L1:
		if(asettablebeanproperty != null)
			break MISSING_BLOCK_LABEL_15;
	//    2    4:aload_2         
	//    3    5:ifnonnull       15
		return annotatedwithparams.call1(obj);
	//    4    8:aload_1         
	//    5    9:aload           4
	//    6   11:invokevirtual   #71  <Method Object AnnotatedWithParams.call1(Object)>
	//    7   14:areturn         
		int j;
		Object aobj[];
		j = asettablebeanproperty.length;
	//    8   15:aload_2         
	//    9   16:arraylength     
	//   10   17:istore          6
		aobj = new Object[j];
	//   11   19:iload           6
	//   12   21:anewarray       Object[]
	//   13   24:astore          7
		int i = 0;
	//   14   26:iconst_0        
	//   15   27:istore          5
		  goto _L3
	//*  16   29:goto            105
_L7:
		SettableBeanProperty settablebeanproperty;
		try
		{
			aobj[i] = deserializationcontext.findInjectableValue(settablebeanproperty.getInjectableValueId(), ((com.fasterxml.jackson.databind.BeanProperty) (settablebeanproperty)), ((Object) (null)));
	//   17   32:aload           7
	//   18   34:iload           5
	//   19   36:aload_3         
	//   20   37:aload           8
	//   21   39:invokevirtual   #77  <Method Object SettableBeanProperty.getInjectableValueId()>
	//   22   42:aload           8
	//   23   44:aconst_null     
	//   24   45:invokevirtual   #83  <Method Object DeserializationContext.findInjectableValue(Object, com.fasterxml.jackson.databind.BeanProperty, Object)>
	//   25   48:aastore         
		}
	//*  26   49:goto            130
	//*  27   52:aload_1         
	//*  28   53:aload           7
	//*  29   55:invokevirtual   #87  <Method Object AnnotatedWithParams.call(Object[])>
	//*  30   58:astore_1        
	//*  31   59:aload_1         
	//*  32   60:areturn         
		// Misplaced declaration of an exception variable
		catch(AnnotatedWithParams annotatedwithparams)
	//*  33   61:astore_1        
		{
			throw rewrapCtorProblem(deserializationcontext, ((Throwable) (annotatedwithparams)));
	//   34   62:aload_0         
	//   35   63:aload_3         
	//   36   64:aload_1         
	//   37   65:invokevirtual   #91  <Method JsonMappingException rewrapCtorProblem(DeserializationContext, Throwable)>
	//   38   68:athrow          
		}
		break MISSING_BLOCK_LABEL_130;
_L5:
		annotatedwithparams = ((AnnotatedWithParams) (annotatedwithparams.call(aobj)));
		return ((Object) (annotatedwithparams));
_L2:
		annotatedwithparams = ((AnnotatedWithParams) (new StringBuilder()));
	//   39   69:new             #93  <Class StringBuilder>
	//   40   72:dup             
	//   41   73:invokespecial   #94  <Method void StringBuilder()>
	//   42   76:astore_1        
		((StringBuilder) (annotatedwithparams)).append("No delegate constructor for ");
	//   43   77:aload_1         
	//   44   78:ldc1            #96  <String "No delegate constructor for ">
	//   45   80:invokevirtual   #100 <Method StringBuilder StringBuilder.append(String)>
	//   46   83:pop             
		((StringBuilder) (annotatedwithparams)).append(getValueTypeDesc());
	//   47   84:aload_1         
	//   48   85:aload_0         
	//   49   86:invokevirtual   #103 <Method String getValueTypeDesc()>
	//   50   89:invokevirtual   #100 <Method StringBuilder StringBuilder.append(String)>
	//   51   92:pop             
		throw new IllegalStateException(((StringBuilder) (annotatedwithparams)).toString());
	//   52   93:new             #105 <Class IllegalStateException>
	//   53   96:dup             
	//   54   97:aload_1         
	//   55   98:invokevirtual   #106 <Method String StringBuilder.toString()>
	//   56  101:invokespecial   #109 <Method void IllegalStateException(String)>
	//   57  104:athrow          
_L3:
		if(i >= j) goto _L5; else goto _L4
	//   58  105:iload           5
	//   59  107:iload           6
	//   60  109:icmpge          52
	//*  61  112:aload_2         
	//*  62  113:iload           5
	//*  63  115:aaload          
	//*  64  116:astore          8
_L4:
		if((settablebeanproperty = asettablebeanproperty[i]) != null) goto _L7; else goto _L6
	//   65  118:aload           8
	//   66  120:ifnonnull       32
_L6:
		aobj[i] = obj;
	//   67  123:aload           7
	//   68  125:iload           5
	//   69  127:aload           4
	//   70  129:aastore         
		i++;
	//   71  130:iload           5
	//   72  132:iconst_1        
	//   73  133:iadd            
	//   74  134:istore          5
		  goto _L3
	//*  75  136:goto            105
	}

	public boolean canCreateFromBoolean()
	{
		return _fromBooleanCreator != null;
	//    0    0:aload_0         
	//    1    1:getfield        #114 <Field AnnotatedWithParams _fromBooleanCreator>
	//    2    4:ifnull          9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	public boolean canCreateFromDouble()
	{
		return _fromDoubleCreator != null;
	//    0    0:aload_0         
	//    1    1:getfield        #117 <Field AnnotatedWithParams _fromDoubleCreator>
	//    2    4:ifnull          9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	public boolean canCreateFromInt()
	{
		return _fromIntCreator != null;
	//    0    0:aload_0         
	//    1    1:getfield        #120 <Field AnnotatedWithParams _fromIntCreator>
	//    2    4:ifnull          9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	public boolean canCreateFromLong()
	{
		return _fromLongCreator != null;
	//    0    0:aload_0         
	//    1    1:getfield        #123 <Field AnnotatedWithParams _fromLongCreator>
	//    2    4:ifnull          9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	public boolean canCreateFromObjectWith()
	{
		return _withArgsCreator != null;
	//    0    0:aload_0         
	//    1    1:getfield        #126 <Field AnnotatedWithParams _withArgsCreator>
	//    2    4:ifnull          9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	public boolean canCreateFromString()
	{
		return _fromStringCreator != null;
	//    0    0:aload_0         
	//    1    1:getfield        #129 <Field AnnotatedWithParams _fromStringCreator>
	//    2    4:ifnull          9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	public boolean canCreateUsingArrayDelegate()
	{
		return _arrayDelegateType != null;
	//    0    0:aload_0         
	//    1    1:getfield        #132 <Field JavaType _arrayDelegateType>
	//    2    4:ifnull          9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	public boolean canCreateUsingDefault()
	{
		return _defaultCreator != null;
	//    0    0:aload_0         
	//    1    1:getfield        #135 <Field AnnotatedWithParams _defaultCreator>
	//    2    4:ifnull          9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	public boolean canCreateUsingDelegate()
	{
		return _delegateType != null;
	//    0    0:aload_0         
	//    1    1:getfield        #138 <Field JavaType _delegateType>
	//    2    4:ifnull          9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	public boolean canInstantiate()
	{
		return canCreateUsingDefault() || canCreateUsingDelegate() || canCreateUsingArrayDelegate() || canCreateFromObjectWith() || canCreateFromString() || canCreateFromInt() || canCreateFromLong() || canCreateFromDouble() || canCreateFromBoolean();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #141 <Method boolean canCreateUsingDefault()>
	//    2    4:ifne            68
	//    3    7:aload_0         
	//    4    8:invokevirtual   #143 <Method boolean canCreateUsingDelegate()>
	//    5   11:ifne            68
	//    6   14:aload_0         
	//    7   15:invokevirtual   #145 <Method boolean canCreateUsingArrayDelegate()>
	//    8   18:ifne            68
	//    9   21:aload_0         
	//   10   22:invokevirtual   #147 <Method boolean canCreateFromObjectWith()>
	//   11   25:ifne            68
	//   12   28:aload_0         
	//   13   29:invokevirtual   #149 <Method boolean canCreateFromString()>
	//   14   32:ifne            68
	//   15   35:aload_0         
	//   16   36:invokevirtual   #151 <Method boolean canCreateFromInt()>
	//   17   39:ifne            68
	//   18   42:aload_0         
	//   19   43:invokevirtual   #153 <Method boolean canCreateFromLong()>
	//   20   46:ifne            68
	//   21   49:aload_0         
	//   22   50:invokevirtual   #155 <Method boolean canCreateFromDouble()>
	//   23   53:ifne            68
	//   24   56:aload_0         
	//   25   57:invokevirtual   #157 <Method boolean canCreateFromBoolean()>
	//   26   60:ifeq            66
	//   27   63:goto            68
	//   28   66:iconst_0        
	//   29   67:ireturn         
	//   30   68:iconst_1        
	//   31   69:ireturn         
	}

	public void configureFromArraySettings(AnnotatedWithParams annotatedwithparams, JavaType javatype, SettableBeanProperty asettablebeanproperty[])
	{
		_arrayDelegateCreator = annotatedwithparams;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #161 <Field AnnotatedWithParams _arrayDelegateCreator>
		_arrayDelegateType = javatype;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #132 <Field JavaType _arrayDelegateType>
		_arrayDelegateArguments = asettablebeanproperty;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #163 <Field SettableBeanProperty[] _arrayDelegateArguments>
	//    9   15:return          
	}

	public void configureFromBooleanCreator(AnnotatedWithParams annotatedwithparams)
	{
		_fromBooleanCreator = annotatedwithparams;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #114 <Field AnnotatedWithParams _fromBooleanCreator>
	//    3    5:return          
	}

	public void configureFromDoubleCreator(AnnotatedWithParams annotatedwithparams)
	{
		_fromDoubleCreator = annotatedwithparams;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #117 <Field AnnotatedWithParams _fromDoubleCreator>
	//    3    5:return          
	}

	public void configureFromIntCreator(AnnotatedWithParams annotatedwithparams)
	{
		_fromIntCreator = annotatedwithparams;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #120 <Field AnnotatedWithParams _fromIntCreator>
	//    3    5:return          
	}

	public void configureFromLongCreator(AnnotatedWithParams annotatedwithparams)
	{
		_fromLongCreator = annotatedwithparams;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #123 <Field AnnotatedWithParams _fromLongCreator>
	//    3    5:return          
	}

	public void configureFromObjectSettings(AnnotatedWithParams annotatedwithparams, AnnotatedWithParams annotatedwithparams1, JavaType javatype, SettableBeanProperty asettablebeanproperty[], AnnotatedWithParams annotatedwithparams2, SettableBeanProperty asettablebeanproperty1[])
	{
		_defaultCreator = annotatedwithparams;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #135 <Field AnnotatedWithParams _defaultCreator>
		_delegateCreator = annotatedwithparams1;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #172 <Field AnnotatedWithParams _delegateCreator>
		_delegateType = javatype;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #138 <Field JavaType _delegateType>
		_delegateArguments = asettablebeanproperty;
	//    9   15:aload_0         
	//   10   16:aload           4
	//   11   18:putfield        #174 <Field SettableBeanProperty[] _delegateArguments>
		_withArgsCreator = annotatedwithparams2;
	//   12   21:aload_0         
	//   13   22:aload           5
	//   14   24:putfield        #126 <Field AnnotatedWithParams _withArgsCreator>
		_constructorArguments = asettablebeanproperty1;
	//   15   27:aload_0         
	//   16   28:aload           6
	//   17   30:putfield        #176 <Field SettableBeanProperty[] _constructorArguments>
	//   18   33:return          
	}

	public void configureFromStringCreator(AnnotatedWithParams annotatedwithparams)
	{
		_fromStringCreator = annotatedwithparams;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #129 <Field AnnotatedWithParams _fromStringCreator>
	//    3    5:return          
	}

	public void configureIncompleteParameter(AnnotatedParameter annotatedparameter)
	{
		_incompleteParameter = annotatedparameter;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #181 <Field AnnotatedParameter _incompleteParameter>
	//    3    5:return          
	}

	public Object createFromBoolean(DeserializationContext deserializationcontext, boolean flag)
		throws IOException
	{
		if(_fromBooleanCreator == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #114 <Field AnnotatedWithParams _fromBooleanCreator>
	//*   2    4:ifnonnull       14
			return super.createFromBoolean(deserializationcontext, flag);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:iload_2         
	//    6   10:invokespecial   #185 <Method Object ValueInstantiator.createFromBoolean(DeserializationContext, boolean)>
	//    7   13:areturn         
		Boolean boolean1 = Boolean.valueOf(flag);
	//    8   14:iload_2         
	//    9   15:invokestatic    #191 <Method Boolean Boolean.valueOf(boolean)>
	//   10   18:astore_3        
		Object obj;
		try
		{
			obj = _fromBooleanCreator.call1(((Object) (boolean1)));
	//   11   19:aload_0         
	//   12   20:getfield        #114 <Field AnnotatedWithParams _fromBooleanCreator>
	//   13   23:aload_3         
	//   14   24:invokevirtual   #71  <Method Object AnnotatedWithParams.call1(Object)>
	//   15   27:astore          4
		}
	//*  16   29:aload           4
	//*  17   31:areturn         
		catch(Throwable throwable)
	//*  18   32:astore          4
		{
			return deserializationcontext.handleInstantiationProblem(_fromBooleanCreator.getDeclaringClass(), ((Object) (boolean1)), ((Throwable) (rewrapCtorProblem(deserializationcontext, throwable))));
	//   19   34:aload_1         
	//   20   35:aload_0         
	//   21   36:getfield        #114 <Field AnnotatedWithParams _fromBooleanCreator>
	//   22   39:invokevirtual   #194 <Method Class AnnotatedWithParams.getDeclaringClass()>
	//   23   42:aload_3         
	//   24   43:aload_0         
	//   25   44:aload_1         
	//   26   45:aload           4
	//   27   47:invokevirtual   #91  <Method JsonMappingException rewrapCtorProblem(DeserializationContext, Throwable)>
	//   28   50:invokevirtual   #198 <Method Object DeserializationContext.handleInstantiationProblem(Class, Object, Throwable)>
	//   29   53:areturn         
		}
		return obj;
	}

	public Object createFromDouble(DeserializationContext deserializationcontext, double d)
		throws IOException
	{
		if(_fromDoubleCreator == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #117 <Field AnnotatedWithParams _fromDoubleCreator>
	//*   2    4:ifnonnull       14
			return super.createFromDouble(deserializationcontext, d);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:dload_2         
	//    6   10:invokespecial   #202 <Method Object ValueInstantiator.createFromDouble(DeserializationContext, double)>
	//    7   13:areturn         
		Double double1 = Double.valueOf(d);
	//    8   14:dload_2         
	//    9   15:invokestatic    #207 <Method Double Double.valueOf(double)>
	//   10   18:astore          4
		Object obj;
		try
		{
			obj = _fromDoubleCreator.call1(((Object) (double1)));
	//   11   20:aload_0         
	//   12   21:getfield        #117 <Field AnnotatedWithParams _fromDoubleCreator>
	//   13   24:aload           4
	//   14   26:invokevirtual   #71  <Method Object AnnotatedWithParams.call1(Object)>
	//   15   29:astore          5
		}
	//*  16   31:aload           5
	//*  17   33:areturn         
		catch(Throwable throwable)
	//*  18   34:astore          5
		{
			return deserializationcontext.handleInstantiationProblem(_fromDoubleCreator.getDeclaringClass(), ((Object) (double1)), ((Throwable) (rewrapCtorProblem(deserializationcontext, throwable))));
	//   19   36:aload_1         
	//   20   37:aload_0         
	//   21   38:getfield        #117 <Field AnnotatedWithParams _fromDoubleCreator>
	//   22   41:invokevirtual   #194 <Method Class AnnotatedWithParams.getDeclaringClass()>
	//   23   44:aload           4
	//   24   46:aload_0         
	//   25   47:aload_1         
	//   26   48:aload           5
	//   27   50:invokevirtual   #91  <Method JsonMappingException rewrapCtorProblem(DeserializationContext, Throwable)>
	//   28   53:invokevirtual   #198 <Method Object DeserializationContext.handleInstantiationProblem(Class, Object, Throwable)>
	//   29   56:areturn         
		}
		return obj;
	}

	public Object createFromInt(DeserializationContext deserializationcontext, int i)
		throws IOException
	{
		if(_fromIntCreator != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #120 <Field AnnotatedWithParams _fromIntCreator>
	//*   2    4:ifnull          47
		{
			Integer integer = Integer.valueOf(i);
	//    3    7:iload_2         
	//    4    8:invokestatic    #214 <Method Integer Integer.valueOf(int)>
	//    5   11:astore_3        
			Object obj;
			try
			{
				obj = _fromIntCreator.call1(((Object) (integer)));
	//    6   12:aload_0         
	//    7   13:getfield        #120 <Field AnnotatedWithParams _fromIntCreator>
	//    8   16:aload_3         
	//    9   17:invokevirtual   #71  <Method Object AnnotatedWithParams.call1(Object)>
	//   10   20:astore          4
			}
	//*  11   22:aload           4
	//*  12   24:areturn         
			catch(Throwable throwable)
	//*  13   25:astore          4
			{
				return deserializationcontext.handleInstantiationProblem(_fromIntCreator.getDeclaringClass(), ((Object) (integer)), ((Throwable) (rewrapCtorProblem(deserializationcontext, throwable))));
	//   14   27:aload_1         
	//   15   28:aload_0         
	//   16   29:getfield        #120 <Field AnnotatedWithParams _fromIntCreator>
	//   17   32:invokevirtual   #194 <Method Class AnnotatedWithParams.getDeclaringClass()>
	//   18   35:aload_3         
	//   19   36:aload_0         
	//   20   37:aload_1         
	//   21   38:aload           4
	//   22   40:invokevirtual   #91  <Method JsonMappingException rewrapCtorProblem(DeserializationContext, Throwable)>
	//   23   43:invokevirtual   #198 <Method Object DeserializationContext.handleInstantiationProblem(Class, Object, Throwable)>
	//   24   46:areturn         
			}
			return obj;
		}
		if(_fromLongCreator != null)
	//*  25   47:aload_0         
	//*  26   48:getfield        #123 <Field AnnotatedWithParams _fromLongCreator>
	//*  27   51:ifnull          95
		{
			Long long1 = Long.valueOf(i);
	//   28   54:iload_2         
	//   29   55:i2l             
	//   30   56:invokestatic    #219 <Method Long Long.valueOf(long)>
	//   31   59:astore_3        
			Object obj1;
			try
			{
				obj1 = _fromLongCreator.call1(((Object) (long1)));
	//   32   60:aload_0         
	//   33   61:getfield        #123 <Field AnnotatedWithParams _fromLongCreator>
	//   34   64:aload_3         
	//   35   65:invokevirtual   #71  <Method Object AnnotatedWithParams.call1(Object)>
	//   36   68:astore          4
			}
	//*  37   70:aload           4
	//*  38   72:areturn         
			catch(Throwable throwable1)
	//*  39   73:astore          4
			{
				return deserializationcontext.handleInstantiationProblem(_fromLongCreator.getDeclaringClass(), ((Object) (long1)), ((Throwable) (rewrapCtorProblem(deserializationcontext, throwable1))));
	//   40   75:aload_1         
	//   41   76:aload_0         
	//   42   77:getfield        #123 <Field AnnotatedWithParams _fromLongCreator>
	//   43   80:invokevirtual   #194 <Method Class AnnotatedWithParams.getDeclaringClass()>
	//   44   83:aload_3         
	//   45   84:aload_0         
	//   46   85:aload_1         
	//   47   86:aload           4
	//   48   88:invokevirtual   #91  <Method JsonMappingException rewrapCtorProblem(DeserializationContext, Throwable)>
	//   49   91:invokevirtual   #198 <Method Object DeserializationContext.handleInstantiationProblem(Class, Object, Throwable)>
	//   50   94:areturn         
			}
			return obj1;
		} else
		{
			return super.createFromInt(deserializationcontext, i);
	//   51   95:aload_0         
	//   52   96:aload_1         
	//   53   97:iload_2         
	//   54   98:invokespecial   #221 <Method Object ValueInstantiator.createFromInt(DeserializationContext, int)>
	//   55  101:areturn         
		}
	}

	public Object createFromLong(DeserializationContext deserializationcontext, long l)
		throws IOException
	{
		if(_fromLongCreator == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #123 <Field AnnotatedWithParams _fromLongCreator>
	//*   2    4:ifnonnull       14
			return super.createFromLong(deserializationcontext, l);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:lload_2         
	//    6   10:invokespecial   #225 <Method Object ValueInstantiator.createFromLong(DeserializationContext, long)>
	//    7   13:areturn         
		Long long1 = Long.valueOf(l);
	//    8   14:lload_2         
	//    9   15:invokestatic    #219 <Method Long Long.valueOf(long)>
	//   10   18:astore          4
		Object obj;
		try
		{
			obj = _fromLongCreator.call1(((Object) (long1)));
	//   11   20:aload_0         
	//   12   21:getfield        #123 <Field AnnotatedWithParams _fromLongCreator>
	//   13   24:aload           4
	//   14   26:invokevirtual   #71  <Method Object AnnotatedWithParams.call1(Object)>
	//   15   29:astore          5
		}
	//*  16   31:aload           5
	//*  17   33:areturn         
		catch(Throwable throwable)
	//*  18   34:astore          5
		{
			return deserializationcontext.handleInstantiationProblem(_fromLongCreator.getDeclaringClass(), ((Object) (long1)), ((Throwable) (rewrapCtorProblem(deserializationcontext, throwable))));
	//   19   36:aload_1         
	//   20   37:aload_0         
	//   21   38:getfield        #123 <Field AnnotatedWithParams _fromLongCreator>
	//   22   41:invokevirtual   #194 <Method Class AnnotatedWithParams.getDeclaringClass()>
	//   23   44:aload           4
	//   24   46:aload_0         
	//   25   47:aload_1         
	//   26   48:aload           5
	//   27   50:invokevirtual   #91  <Method JsonMappingException rewrapCtorProblem(DeserializationContext, Throwable)>
	//   28   53:invokevirtual   #198 <Method Object DeserializationContext.handleInstantiationProblem(Class, Object, Throwable)>
	//   29   56:areturn         
		}
		return obj;
	}

	public Object createFromObjectWith(DeserializationContext deserializationcontext, Object aobj[])
		throws IOException
	{
		Object obj = ((Object) (_withArgsCreator));
	//    0    0:aload_0         
	//    1    1:getfield        #126 <Field AnnotatedWithParams _withArgsCreator>
	//    2    4:astore_3        
		if(obj == null)
	//*   3    5:aload_3         
	//*   4    6:ifnonnull       16
			return super.createFromObjectWith(deserializationcontext, aobj);
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:aload_2         
	//    8   12:invokespecial   #231 <Method Object ValueInstantiator.createFromObjectWith(DeserializationContext, Object[])>
	//    9   15:areturn         
		try
		{
			obj = ((AnnotatedWithParams) (obj)).call(aobj);
	//   10   16:aload_3         
	//   11   17:aload_2         
	//   12   18:invokevirtual   #87  <Method Object AnnotatedWithParams.call(Object[])>
	//   13   21:astore_3        
		}
	//*  14   22:aload_3         
	//*  15   23:areturn         
		catch(Exception exception)
	//*  16   24:astore_3        
		{
			return deserializationcontext.handleInstantiationProblem(_valueClass, ((Object) (aobj)), ((Throwable) (rewrapCtorProblem(deserializationcontext, ((Throwable) (exception))))));
	//   17   25:aload_1         
	//   18   26:aload_0         
	//   19   27:getfield        #58  <Field Class _valueClass>
	//   20   30:aload_2         
	//   21   31:aload_0         
	//   22   32:aload_1         
	//   23   33:aload_3         
	//   24   34:invokevirtual   #91  <Method JsonMappingException rewrapCtorProblem(DeserializationContext, Throwable)>
	//   25   37:invokevirtual   #198 <Method Object DeserializationContext.handleInstantiationProblem(Class, Object, Throwable)>
	//   26   40:areturn         
		}
		return obj;
	}

	public Object createFromString(DeserializationContext deserializationcontext, String s)
		throws IOException
	{
		Object obj = ((Object) (_fromStringCreator));
	//    0    0:aload_0         
	//    1    1:getfield        #129 <Field AnnotatedWithParams _fromStringCreator>
	//    2    4:astore_3        
		if(obj == null)
	//*   3    5:aload_3         
	//*   4    6:ifnonnull       16
			return _createFromStringFallbacks(deserializationcontext, s);
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:aload_2         
	//    8   12:invokevirtual   #236 <Method Object _createFromStringFallbacks(DeserializationContext, String)>
	//    9   15:areturn         
		try
		{
			obj = ((AnnotatedWithParams) (obj)).call1(((Object) (s)));
	//   10   16:aload_3         
	//   11   17:aload_2         
	//   12   18:invokevirtual   #71  <Method Object AnnotatedWithParams.call1(Object)>
	//   13   21:astore_3        
		}
	//*  14   22:aload_3         
	//*  15   23:areturn         
		catch(Throwable throwable)
	//*  16   24:astore_3        
		{
			return deserializationcontext.handleInstantiationProblem(_fromStringCreator.getDeclaringClass(), ((Object) (s)), ((Throwable) (rewrapCtorProblem(deserializationcontext, throwable))));
	//   17   25:aload_1         
	//   18   26:aload_0         
	//   19   27:getfield        #129 <Field AnnotatedWithParams _fromStringCreator>
	//   20   30:invokevirtual   #194 <Method Class AnnotatedWithParams.getDeclaringClass()>
	//   21   33:aload_2         
	//   22   34:aload_0         
	//   23   35:aload_1         
	//   24   36:aload_3         
	//   25   37:invokevirtual   #91  <Method JsonMappingException rewrapCtorProblem(DeserializationContext, Throwable)>
	//   26   40:invokevirtual   #198 <Method Object DeserializationContext.handleInstantiationProblem(Class, Object, Throwable)>
	//   27   43:areturn         
		}
		return obj;
	}

	public Object createUsingArrayDelegate(DeserializationContext deserializationcontext, Object obj)
		throws IOException
	{
		if(_arrayDelegateCreator == null && _delegateCreator != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #161 <Field AnnotatedWithParams _arrayDelegateCreator>
	//*   2    4:ifnonnull       21
	//*   3    7:aload_0         
	//*   4    8:getfield        #172 <Field AnnotatedWithParams _delegateCreator>
	//*   5   11:ifnull          21
			return createUsingDelegate(deserializationcontext, obj);
	//    6   14:aload_0         
	//    7   15:aload_1         
	//    8   16:aload_2         
	//    9   17:invokevirtual   #241 <Method Object createUsingDelegate(DeserializationContext, Object)>
	//   10   20:areturn         
		else
			return _createUsingDelegate(_arrayDelegateCreator, _arrayDelegateArguments, deserializationcontext, obj);
	//   11   21:aload_0         
	//   12   22:aload_0         
	//   13   23:getfield        #161 <Field AnnotatedWithParams _arrayDelegateCreator>
	//   14   26:aload_0         
	//   15   27:getfield        #163 <Field SettableBeanProperty[] _arrayDelegateArguments>
	//   16   30:aload_1         
	//   17   31:aload_2         
	//   18   32:invokespecial   #243 <Method Object _createUsingDelegate(AnnotatedWithParams, SettableBeanProperty[], DeserializationContext, Object)>
	//   19   35:areturn         
	}

	public Object createUsingDefault(DeserializationContext deserializationcontext)
		throws IOException
	{
		Object obj = ((Object) (_defaultCreator));
	//    0    0:aload_0         
	//    1    1:getfield        #135 <Field AnnotatedWithParams _defaultCreator>
	//    2    4:astore_2        
		if(obj == null)
	//*   3    5:aload_2         
	//*   4    6:ifnonnull       15
			return super.createUsingDefault(deserializationcontext);
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:invokespecial   #247 <Method Object ValueInstantiator.createUsingDefault(DeserializationContext)>
	//    8   14:areturn         
		try
		{
			obj = ((AnnotatedWithParams) (obj)).call();
	//    9   15:aload_2         
	//   10   16:invokevirtual   #249 <Method Object AnnotatedWithParams.call()>
	//   11   19:astore_2        
		}
	//*  12   20:aload_2         
	//*  13   21:areturn         
		catch(Exception exception)
	//*  14   22:astore_2        
		{
			return deserializationcontext.handleInstantiationProblem(_valueClass, ((Object) (null)), ((Throwable) (rewrapCtorProblem(deserializationcontext, ((Throwable) (exception))))));
	//   15   23:aload_1         
	//   16   24:aload_0         
	//   17   25:getfield        #58  <Field Class _valueClass>
	//   18   28:aconst_null     
	//   19   29:aload_0         
	//   20   30:aload_1         
	//   21   31:aload_2         
	//   22   32:invokevirtual   #91  <Method JsonMappingException rewrapCtorProblem(DeserializationContext, Throwable)>
	//   23   35:invokevirtual   #198 <Method Object DeserializationContext.handleInstantiationProblem(Class, Object, Throwable)>
	//   24   38:areturn         
		}
		return obj;
	}

	public Object createUsingDelegate(DeserializationContext deserializationcontext, Object obj)
		throws IOException
	{
		if(_delegateCreator == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #172 <Field AnnotatedWithParams _delegateCreator>
	//*   2    4:ifnonnull       28
		{
			AnnotatedWithParams annotatedwithparams = _arrayDelegateCreator;
	//    3    7:aload_0         
	//    4    8:getfield        #161 <Field AnnotatedWithParams _arrayDelegateCreator>
	//    5   11:astore_3        
			if(annotatedwithparams != null)
	//*   6   12:aload_3         
	//*   7   13:ifnull          28
				return _createUsingDelegate(annotatedwithparams, _arrayDelegateArguments, deserializationcontext, obj);
	//    8   16:aload_0         
	//    9   17:aload_3         
	//   10   18:aload_0         
	//   11   19:getfield        #163 <Field SettableBeanProperty[] _arrayDelegateArguments>
	//   12   22:aload_1         
	//   13   23:aload_2         
	//   14   24:invokespecial   #243 <Method Object _createUsingDelegate(AnnotatedWithParams, SettableBeanProperty[], DeserializationContext, Object)>
	//   15   27:areturn         
		}
		return _createUsingDelegate(_delegateCreator, _delegateArguments, deserializationcontext, obj);
	//   16   28:aload_0         
	//   17   29:aload_0         
	//   18   30:getfield        #172 <Field AnnotatedWithParams _delegateCreator>
	//   19   33:aload_0         
	//   20   34:getfield        #174 <Field SettableBeanProperty[] _delegateArguments>
	//   21   37:aload_1         
	//   22   38:aload_2         
	//   23   39:invokespecial   #243 <Method Object _createUsingDelegate(AnnotatedWithParams, SettableBeanProperty[], DeserializationContext, Object)>
	//   24   42:areturn         
	}

	public AnnotatedWithParams getArrayDelegateCreator()
	{
		return _arrayDelegateCreator;
	//    0    0:aload_0         
	//    1    1:getfield        #161 <Field AnnotatedWithParams _arrayDelegateCreator>
	//    2    4:areturn         
	}

	public JavaType getArrayDelegateType(DeserializationConfig deserializationconfig)
	{
		return _arrayDelegateType;
	//    0    0:aload_0         
	//    1    1:getfield        #132 <Field JavaType _arrayDelegateType>
	//    2    4:areturn         
	}

	public AnnotatedWithParams getDefaultCreator()
	{
		return _defaultCreator;
	//    0    0:aload_0         
	//    1    1:getfield        #135 <Field AnnotatedWithParams _defaultCreator>
	//    2    4:areturn         
	}

	public AnnotatedWithParams getDelegateCreator()
	{
		return _delegateCreator;
	//    0    0:aload_0         
	//    1    1:getfield        #172 <Field AnnotatedWithParams _delegateCreator>
	//    2    4:areturn         
	}

	public JavaType getDelegateType(DeserializationConfig deserializationconfig)
	{
		return _delegateType;
	//    0    0:aload_0         
	//    1    1:getfield        #138 <Field JavaType _delegateType>
	//    2    4:areturn         
	}

	public SettableBeanProperty[] getFromObjectArguments(DeserializationConfig deserializationconfig)
	{
		return _constructorArguments;
	//    0    0:aload_0         
	//    1    1:getfield        #176 <Field SettableBeanProperty[] _constructorArguments>
	//    2    4:areturn         
	}

	public AnnotatedParameter getIncompleteParameter()
	{
		return _incompleteParameter;
	//    0    0:aload_0         
	//    1    1:getfield        #181 <Field AnnotatedParameter _incompleteParameter>
	//    2    4:areturn         
	}

	public Class getValueClass()
	{
		return _valueClass;
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field Class _valueClass>
	//    2    4:areturn         
	}

	public String getValueTypeDesc()
	{
		return _valueTypeDesc;
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field String _valueTypeDesc>
	//    2    4:areturn         
	}

	protected JsonMappingException rewrapCtorProblem(DeserializationContext deserializationcontext, Throwable throwable)
	{
		Throwable throwable1;
label0:
		{
			if(!(throwable instanceof ExceptionInInitializerError))
	//*   0    0:aload_2         
	//*   1    1:instanceof      #265 <Class ExceptionInInitializerError>
	//*   2    4:ifne            16
			{
				throwable1 = throwable;
	//    3    7:aload_2         
	//    4    8:astore_3        
				if(!(throwable instanceof InvocationTargetException))
					break label0;
	//    5    9:aload_2         
	//    6   10:instanceof      #267 <Class InvocationTargetException>
	//    7   13:ifeq            32
			}
			Throwable throwable2 = throwable.getCause();
	//    8   16:aload_2         
	//    9   17:invokevirtual   #271 <Method Throwable Throwable.getCause()>
	//   10   20:astore          4
			throwable1 = throwable;
	//   11   22:aload_2         
	//   12   23:astore_3        
			if(throwable2 != null)
	//*  13   24:aload           4
	//*  14   26:ifnull          32
				throwable1 = throwable2;
	//   15   29:aload           4
	//   16   31:astore_3        
		}
		return wrapAsJsonMappingException(deserializationcontext, throwable1);
	//   17   32:aload_0         
	//   18   33:aload_1         
	//   19   34:aload_3         
	//   20   35:invokevirtual   #274 <Method JsonMappingException wrapAsJsonMappingException(DeserializationContext, Throwable)>
	//   21   38:areturn         
	}

	protected JsonMappingException wrapAsJsonMappingException(DeserializationContext deserializationcontext, Throwable throwable)
	{
		if(throwable instanceof JsonMappingException)
	//*   0    0:aload_2         
	//*   1    1:instanceof      #276 <Class JsonMappingException>
	//*   2    4:ifeq            12
			return (JsonMappingException)throwable;
	//    3    7:aload_2         
	//    4    8:checkcast       #276 <Class JsonMappingException>
	//    5   11:areturn         
		else
			return deserializationcontext.instantiationException(getValueClass(), throwable);
	//    6   12:aload_1         
	//    7   13:aload_0         
	//    8   14:invokevirtual   #278 <Method Class getValueClass()>
	//    9   17:aload_2         
	//   10   18:invokevirtual   #282 <Method JsonMappingException DeserializationContext.instantiationException(Class, Throwable)>
	//   11   21:areturn         
	}

	private static final long serialVersionUID = 1L;
	protected SettableBeanProperty _arrayDelegateArguments[];
	protected AnnotatedWithParams _arrayDelegateCreator;
	protected JavaType _arrayDelegateType;
	protected SettableBeanProperty _constructorArguments[];
	protected AnnotatedWithParams _defaultCreator;
	protected SettableBeanProperty _delegateArguments[];
	protected AnnotatedWithParams _delegateCreator;
	protected JavaType _delegateType;
	protected AnnotatedWithParams _fromBooleanCreator;
	protected AnnotatedWithParams _fromDoubleCreator;
	protected AnnotatedWithParams _fromIntCreator;
	protected AnnotatedWithParams _fromLongCreator;
	protected AnnotatedWithParams _fromStringCreator;
	protected AnnotatedParameter _incompleteParameter;
	protected final Class _valueClass;
	protected final String _valueTypeDesc;
	protected AnnotatedWithParams _withArgsCreator;
}
