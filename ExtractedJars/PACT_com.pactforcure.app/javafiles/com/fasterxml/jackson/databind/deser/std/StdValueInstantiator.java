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
	//    1    1:invokespecial   #37  <Method void ValueInstantiator()>
		if(javatype == null)
	//*   2    4:aload_2         
	//*   3    5:ifnonnull       17
			deserializationconfig = "UNKNOWN TYPE";
	//    4    8:ldc1            #39  <String "UNKNOWN TYPE">
	//    5   10:astore_1        
		else
	//*   6   11:aload_0         
	//*   7   12:aload_1         
	//*   8   13:putfield        #41  <Field String _valueTypeDesc>
	//*   9   16:return          
			deserializationconfig = ((DeserializationConfig) (javatype.toString()));
	//   10   17:aload_2         
	//   11   18:invokevirtual   #47  <Method String JavaType.toString()>
	//   12   21:astore_1        
		_valueTypeDesc = ((String) (deserializationconfig));
	//*  13   22:goto            11
	}

	public StdValueInstantiator(DeserializationConfig deserializationconfig, Class class1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #37  <Method void ValueInstantiator()>
		if(class1 == null)
	//*   2    4:aload_2         
	//*   3    5:ifnonnull       17
			deserializationconfig = "UNKNOWN TYPE";
	//    4    8:ldc1            #39  <String "UNKNOWN TYPE">
	//    5   10:astore_1        
		else
	//*   6   11:aload_0         
	//*   7   12:aload_1         
	//*   8   13:putfield        #41  <Field String _valueTypeDesc>
	//*   9   16:return          
			deserializationconfig = ((DeserializationConfig) (class1.getName()));
	//   10   17:aload_2         
	//   11   18:invokevirtual   #54  <Method String Class.getName()>
	//   12   21:astore_1        
		_valueTypeDesc = ((String) (deserializationconfig));
	//*  13   22:goto            11
	}

	protected StdValueInstantiator(StdValueInstantiator stdvalueinstantiator)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #37  <Method void ValueInstantiator()>
		_valueTypeDesc = stdvalueinstantiator._valueTypeDesc;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:getfield        #41  <Field String _valueTypeDesc>
	//    5    9:putfield        #41  <Field String _valueTypeDesc>
		_defaultCreator = stdvalueinstantiator._defaultCreator;
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:getfield        #59  <Field AnnotatedWithParams _defaultCreator>
	//    9   17:putfield        #59  <Field AnnotatedWithParams _defaultCreator>
		_constructorArguments = stdvalueinstantiator._constructorArguments;
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:getfield        #61  <Field SettableBeanProperty[] _constructorArguments>
	//   13   25:putfield        #61  <Field SettableBeanProperty[] _constructorArguments>
		_withArgsCreator = stdvalueinstantiator._withArgsCreator;
	//   14   28:aload_0         
	//   15   29:aload_1         
	//   16   30:getfield        #63  <Field AnnotatedWithParams _withArgsCreator>
	//   17   33:putfield        #63  <Field AnnotatedWithParams _withArgsCreator>
		_delegateType = stdvalueinstantiator._delegateType;
	//   18   36:aload_0         
	//   19   37:aload_1         
	//   20   38:getfield        #65  <Field JavaType _delegateType>
	//   21   41:putfield        #65  <Field JavaType _delegateType>
		_delegateCreator = stdvalueinstantiator._delegateCreator;
	//   22   44:aload_0         
	//   23   45:aload_1         
	//   24   46:getfield        #67  <Field AnnotatedWithParams _delegateCreator>
	//   25   49:putfield        #67  <Field AnnotatedWithParams _delegateCreator>
		_delegateArguments = stdvalueinstantiator._delegateArguments;
	//   26   52:aload_0         
	//   27   53:aload_1         
	//   28   54:getfield        #69  <Field SettableBeanProperty[] _delegateArguments>
	//   29   57:putfield        #69  <Field SettableBeanProperty[] _delegateArguments>
		_arrayDelegateType = stdvalueinstantiator._arrayDelegateType;
	//   30   60:aload_0         
	//   31   61:aload_1         
	//   32   62:getfield        #71  <Field JavaType _arrayDelegateType>
	//   33   65:putfield        #71  <Field JavaType _arrayDelegateType>
		_arrayDelegateCreator = stdvalueinstantiator._arrayDelegateCreator;
	//   34   68:aload_0         
	//   35   69:aload_1         
	//   36   70:getfield        #73  <Field AnnotatedWithParams _arrayDelegateCreator>
	//   37   73:putfield        #73  <Field AnnotatedWithParams _arrayDelegateCreator>
		_arrayDelegateArguments = stdvalueinstantiator._arrayDelegateArguments;
	//   38   76:aload_0         
	//   39   77:aload_1         
	//   40   78:getfield        #75  <Field SettableBeanProperty[] _arrayDelegateArguments>
	//   41   81:putfield        #75  <Field SettableBeanProperty[] _arrayDelegateArguments>
		_fromStringCreator = stdvalueinstantiator._fromStringCreator;
	//   42   84:aload_0         
	//   43   85:aload_1         
	//   44   86:getfield        #77  <Field AnnotatedWithParams _fromStringCreator>
	//   45   89:putfield        #77  <Field AnnotatedWithParams _fromStringCreator>
		_fromIntCreator = stdvalueinstantiator._fromIntCreator;
	//   46   92:aload_0         
	//   47   93:aload_1         
	//   48   94:getfield        #79  <Field AnnotatedWithParams _fromIntCreator>
	//   49   97:putfield        #79  <Field AnnotatedWithParams _fromIntCreator>
		_fromLongCreator = stdvalueinstantiator._fromLongCreator;
	//   50  100:aload_0         
	//   51  101:aload_1         
	//   52  102:getfield        #81  <Field AnnotatedWithParams _fromLongCreator>
	//   53  105:putfield        #81  <Field AnnotatedWithParams _fromLongCreator>
		_fromDoubleCreator = stdvalueinstantiator._fromDoubleCreator;
	//   54  108:aload_0         
	//   55  109:aload_1         
	//   56  110:getfield        #83  <Field AnnotatedWithParams _fromDoubleCreator>
	//   57  113:putfield        #83  <Field AnnotatedWithParams _fromDoubleCreator>
		_fromBooleanCreator = stdvalueinstantiator._fromBooleanCreator;
	//   58  116:aload_0         
	//   59  117:aload_1         
	//   60  118:getfield        #85  <Field AnnotatedWithParams _fromBooleanCreator>
	//   61  121:putfield        #85  <Field AnnotatedWithParams _fromBooleanCreator>
	//   62  124:return          
	}

	private Object _createUsingDelegate(AnnotatedWithParams annotatedwithparams, SettableBeanProperty asettablebeanproperty[], DeserializationContext deserializationcontext, Object obj)
		throws IOException
	{
		if(annotatedwithparams == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       34
			throw new IllegalStateException((new StringBuilder()).append("No delegate constructor for ").append(getValueTypeDesc()).toString());
	//    2    4:new             #93  <Class IllegalStateException>
	//    3    7:dup             
	//    4    8:new             #95  <Class StringBuilder>
	//    5   11:dup             
	//    6   12:invokespecial   #96  <Method void StringBuilder()>
	//    7   15:ldc1            #98  <String "No delegate constructor for ">
	//    8   17:invokevirtual   #102 <Method StringBuilder StringBuilder.append(String)>
	//    9   20:aload_0         
	//   10   21:invokevirtual   #105 <Method String getValueTypeDesc()>
	//   11   24:invokevirtual   #102 <Method StringBuilder StringBuilder.append(String)>
	//   12   27:invokevirtual   #106 <Method String StringBuilder.toString()>
	//   13   30:invokespecial   #109 <Method void IllegalStateException(String)>
	//   14   33:athrow          
		if(asettablebeanproperty != null)
			break MISSING_BLOCK_LABEL_45;
	//   15   34:aload_2         
	//   16   35:ifnonnull       45
		return annotatedwithparams.call1(obj);
	//   17   38:aload_1         
	//   18   39:aload           4
	//   19   41:invokevirtual   #115 <Method Object AnnotatedWithParams.call1(Object)>
	//   20   44:areturn         
		int j;
		Object aobj[];
		j = asettablebeanproperty.length;
	//   21   45:aload_2         
	//   22   46:arraylength     
	//   23   47:istore          6
		aobj = new Object[j];
	//   24   49:iload           6
	//   25   51:anewarray       Object[]
	//   26   54:astore          7
		int i = 0;
	//   27   56:iconst_0        
	//   28   57:istore          5
		  goto _L1
	//*  29   59:goto            99
_L5:
		SettableBeanProperty settablebeanproperty;
		try
		{
			aobj[i] = deserializationcontext.findInjectableValue(settablebeanproperty.getInjectableValueId(), ((com.fasterxml.jackson.databind.BeanProperty) (settablebeanproperty)), ((Object) (null)));
	//   30   62:aload           7
	//   31   64:iload           5
	//   32   66:aload_3         
	//   33   67:aload           8
	//   34   69:invokevirtual   #123 <Method Object SettableBeanProperty.getInjectableValueId()>
	//   35   72:aload           8
	//   36   74:aconst_null     
	//   37   75:invokevirtual   #129 <Method Object DeserializationContext.findInjectableValue(Object, com.fasterxml.jackson.databind.BeanProperty, Object)>
	//   38   78:aastore         
		}
	//*  39   79:goto            124
		// Misplaced declaration of an exception variable
		catch(AnnotatedWithParams annotatedwithparams)
	//*  40   82:astore_1        
		{
			throw rewrapCtorProblem(deserializationcontext, ((Throwable) (annotatedwithparams)));
	//   41   83:aload_0         
	//   42   84:aload_3         
	//   43   85:aload_1         
	//   44   86:invokevirtual   #133 <Method JsonMappingException rewrapCtorProblem(DeserializationContext, Throwable)>
	//   45   89:athrow          
		}
		break MISSING_BLOCK_LABEL_124;
_L3:
		annotatedwithparams = ((AnnotatedWithParams) (annotatedwithparams.call(aobj)));
	//   46   90:aload_1         
	//   47   91:aload           7
	//   48   93:invokevirtual   #137 <Method Object AnnotatedWithParams.call(Object[])>
	//   49   96:astore_1        
		return ((Object) (annotatedwithparams));
	//   50   97:aload_1         
	//   51   98:areturn         
_L1:
		if(i >= j) goto _L3; else goto _L2
	//   52   99:iload           5
	//   53  101:iload           6
	//   54  103:icmpge          90
	//*  55  106:aload_2         
	//*  56  107:iload           5
	//*  57  109:aaload          
	//*  58  110:astore          8
_L2:
		if((settablebeanproperty = asettablebeanproperty[i]) != null) goto _L5; else goto _L4
	//   59  112:aload           8
	//   60  114:ifnonnull       62
_L4:
		aobj[i] = obj;
	//   61  117:aload           7
	//   62  119:iload           5
	//   63  121:aload           4
	//   64  123:aastore         
		i++;
	//   65  124:iload           5
	//   66  126:iconst_1        
	//   67  127:iadd            
	//   68  128:istore          5
		  goto _L1
	//*  69  130:goto            99
	}

	public boolean canCreateFromBoolean()
	{
		return _fromBooleanCreator != null;
	//    0    0:aload_0         
	//    1    1:getfield        #85  <Field AnnotatedWithParams _fromBooleanCreator>
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
	//    1    1:getfield        #83  <Field AnnotatedWithParams _fromDoubleCreator>
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
	//    1    1:getfield        #79  <Field AnnotatedWithParams _fromIntCreator>
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
	//    1    1:getfield        #81  <Field AnnotatedWithParams _fromLongCreator>
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
	//    1    1:getfield        #63  <Field AnnotatedWithParams _withArgsCreator>
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
	//    1    1:getfield        #77  <Field AnnotatedWithParams _fromStringCreator>
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
	//    1    1:getfield        #71  <Field JavaType _arrayDelegateType>
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
	//    1    1:getfield        #59  <Field AnnotatedWithParams _defaultCreator>
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
	//    1    1:getfield        #65  <Field JavaType _delegateType>
	//    2    4:ifnull          9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	public void configureFromArraySettings(AnnotatedWithParams annotatedwithparams, JavaType javatype, SettableBeanProperty asettablebeanproperty[])
	{
		_arrayDelegateCreator = annotatedwithparams;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #73  <Field AnnotatedWithParams _arrayDelegateCreator>
		_arrayDelegateType = javatype;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #71  <Field JavaType _arrayDelegateType>
		_arrayDelegateArguments = asettablebeanproperty;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #75  <Field SettableBeanProperty[] _arrayDelegateArguments>
	//    9   15:return          
	}

	public void configureFromBooleanCreator(AnnotatedWithParams annotatedwithparams)
	{
		_fromBooleanCreator = annotatedwithparams;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #85  <Field AnnotatedWithParams _fromBooleanCreator>
	//    3    5:return          
	}

	public void configureFromDoubleCreator(AnnotatedWithParams annotatedwithparams)
	{
		_fromDoubleCreator = annotatedwithparams;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #83  <Field AnnotatedWithParams _fromDoubleCreator>
	//    3    5:return          
	}

	public void configureFromIntCreator(AnnotatedWithParams annotatedwithparams)
	{
		_fromIntCreator = annotatedwithparams;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #79  <Field AnnotatedWithParams _fromIntCreator>
	//    3    5:return          
	}

	public void configureFromLongCreator(AnnotatedWithParams annotatedwithparams)
	{
		_fromLongCreator = annotatedwithparams;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #81  <Field AnnotatedWithParams _fromLongCreator>
	//    3    5:return          
	}

	public void configureFromObjectSettings(AnnotatedWithParams annotatedwithparams, AnnotatedWithParams annotatedwithparams1, JavaType javatype, SettableBeanProperty asettablebeanproperty[], AnnotatedWithParams annotatedwithparams2, SettableBeanProperty asettablebeanproperty1[])
	{
		_defaultCreator = annotatedwithparams;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #59  <Field AnnotatedWithParams _defaultCreator>
		_delegateCreator = annotatedwithparams1;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #67  <Field AnnotatedWithParams _delegateCreator>
		_delegateType = javatype;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #65  <Field JavaType _delegateType>
		_delegateArguments = asettablebeanproperty;
	//    9   15:aload_0         
	//   10   16:aload           4
	//   11   18:putfield        #69  <Field SettableBeanProperty[] _delegateArguments>
		_withArgsCreator = annotatedwithparams2;
	//   12   21:aload_0         
	//   13   22:aload           5
	//   14   24:putfield        #63  <Field AnnotatedWithParams _withArgsCreator>
		_constructorArguments = asettablebeanproperty1;
	//   15   27:aload_0         
	//   16   28:aload           6
	//   17   30:putfield        #61  <Field SettableBeanProperty[] _constructorArguments>
	//   18   33:return          
	}

	public void configureFromStringCreator(AnnotatedWithParams annotatedwithparams)
	{
		_fromStringCreator = annotatedwithparams;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #77  <Field AnnotatedWithParams _fromStringCreator>
	//    3    5:return          
	}

	public void configureIncompleteParameter(AnnotatedParameter annotatedparameter)
	{
		_incompleteParameter = annotatedparameter;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #162 <Field AnnotatedParameter _incompleteParameter>
	//    3    5:return          
	}

	public Object createFromBoolean(DeserializationContext deserializationcontext, boolean flag)
		throws IOException
	{
		if(_fromBooleanCreator == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #85  <Field AnnotatedWithParams _fromBooleanCreator>
	//*   2    4:ifnonnull       32
			throw deserializationcontext.mappingException("Can not instantiate value of type %s from Boolean value (%s); no single-boolean/Boolean-arg constructor/factory method", new Object[] {
				getValueTypeDesc(), Boolean.valueOf(flag)
			});
	//    3    7:aload_1         
	//    4    8:ldc1            #166 <String "Can not instantiate value of type %s from Boolean value (%s); no single-boolean/Boolean-arg constructor/factory method">
	//    5   10:iconst_2        
	//    6   11:anewarray       Object[]
	//    7   14:dup             
	//    8   15:iconst_0        
	//    9   16:aload_0         
	//   10   17:invokevirtual   #105 <Method String getValueTypeDesc()>
	//   11   20:aastore         
	//   12   21:dup             
	//   13   22:iconst_1        
	//   14   23:iload_2         
	//   15   24:invokestatic    #172 <Method Boolean Boolean.valueOf(boolean)>
	//   16   27:aastore         
	//   17   28:invokevirtual   #176 <Method JsonMappingException DeserializationContext.mappingException(String, Object[])>
	//   18   31:athrow          
		Object obj;
		try
		{
			obj = _fromBooleanCreator.call1(((Object) (Boolean.valueOf(flag))));
	//   19   32:aload_0         
	//   20   33:getfield        #85  <Field AnnotatedWithParams _fromBooleanCreator>
	//   21   36:iload_2         
	//   22   37:invokestatic    #172 <Method Boolean Boolean.valueOf(boolean)>
	//   23   40:invokevirtual   #115 <Method Object AnnotatedWithParams.call1(Object)>
	//   24   43:astore_3        
		}
	//*  25   44:aload_3         
	//*  26   45:areturn         
		catch(Throwable throwable)
	//*  27   46:astore_3        
		{
			throw rewrapCtorProblem(deserializationcontext, throwable);
	//   28   47:aload_0         
	//   29   48:aload_1         
	//   30   49:aload_3         
	//   31   50:invokevirtual   #133 <Method JsonMappingException rewrapCtorProblem(DeserializationContext, Throwable)>
	//   32   53:athrow          
		}
		return obj;
	}

	public Object createFromDouble(DeserializationContext deserializationcontext, double d)
		throws IOException
	{
		if(_fromDoubleCreator == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #83  <Field AnnotatedWithParams _fromDoubleCreator>
	//*   2    4:ifnonnull       32
			throw deserializationcontext.mappingException("Can not instantiate value of type %s from Floating-point number (%s); no one-double/Double-arg constructor/factory method", new Object[] {
				getValueTypeDesc(), Double.valueOf(d)
			});
	//    3    7:aload_1         
	//    4    8:ldc1            #180 <String "Can not instantiate value of type %s from Floating-point number (%s); no one-double/Double-arg constructor/factory method">
	//    5   10:iconst_2        
	//    6   11:anewarray       Object[]
	//    7   14:dup             
	//    8   15:iconst_0        
	//    9   16:aload_0         
	//   10   17:invokevirtual   #105 <Method String getValueTypeDesc()>
	//   11   20:aastore         
	//   12   21:dup             
	//   13   22:iconst_1        
	//   14   23:dload_2         
	//   15   24:invokestatic    #185 <Method Double Double.valueOf(double)>
	//   16   27:aastore         
	//   17   28:invokevirtual   #176 <Method JsonMappingException DeserializationContext.mappingException(String, Object[])>
	//   18   31:athrow          
		Object obj;
		try
		{
			obj = _fromDoubleCreator.call1(((Object) (Double.valueOf(d))));
	//   19   32:aload_0         
	//   20   33:getfield        #83  <Field AnnotatedWithParams _fromDoubleCreator>
	//   21   36:dload_2         
	//   22   37:invokestatic    #185 <Method Double Double.valueOf(double)>
	//   23   40:invokevirtual   #115 <Method Object AnnotatedWithParams.call1(Object)>
	//   24   43:astore          4
		}
	//*  25   45:aload           4
	//*  26   47:areturn         
		catch(Throwable throwable)
	//*  27   48:astore          4
		{
			throw rewrapCtorProblem(deserializationcontext, throwable);
	//   28   50:aload_0         
	//   29   51:aload_1         
	//   30   52:aload           4
	//   31   54:invokevirtual   #133 <Method JsonMappingException rewrapCtorProblem(DeserializationContext, Throwable)>
	//   32   57:athrow          
		}
		return obj;
	}

	public Object createFromInt(DeserializationContext deserializationcontext, int i)
		throws IOException
	{
label0:
		{
			Object obj;
			try
			{
				if(_fromIntCreator != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #79  <Field AnnotatedWithParams _fromIntCreator>
	//*   2    4:ifnull          19
					return _fromIntCreator.call1(((Object) (Integer.valueOf(i))));
	//    3    7:aload_0         
	//    4    8:getfield        #79  <Field AnnotatedWithParams _fromIntCreator>
	//    5   11:iload_2         
	//    6   12:invokestatic    #192 <Method Integer Integer.valueOf(int)>
	//    7   15:invokevirtual   #115 <Method Object AnnotatedWithParams.call1(Object)>
	//    8   18:areturn         
				if(_fromLongCreator == null)
					break label0;
	//    9   19:aload_0         
	//   10   20:getfield        #81  <Field AnnotatedWithParams _fromLongCreator>
	//   11   23:ifnull          49
				obj = _fromLongCreator.call1(((Object) (Long.valueOf(i))));
	//   12   26:aload_0         
	//   13   27:getfield        #81  <Field AnnotatedWithParams _fromLongCreator>
	//   14   30:iload_2         
	//   15   31:i2l             
	//   16   32:invokestatic    #197 <Method Long Long.valueOf(long)>
	//   17   35:invokevirtual   #115 <Method Object AnnotatedWithParams.call1(Object)>
	//   18   38:astore_3        
			}
	//*  19   39:aload_3         
	//*  20   40:areturn         
			catch(Throwable throwable)
	//*  21   41:astore_3        
			{
				throw rewrapCtorProblem(deserializationcontext, throwable);
	//   22   42:aload_0         
	//   23   43:aload_1         
	//   24   44:aload_3         
	//   25   45:invokevirtual   #133 <Method JsonMappingException rewrapCtorProblem(DeserializationContext, Throwable)>
	//   26   48:athrow          
			}
			return obj;
		}
		throw deserializationcontext.mappingException("Can not instantiate value of type %s from Integral number (%s); no single-int-arg constructor/factory method", new Object[] {
			getValueTypeDesc(), Integer.valueOf(i)
		});
	//   27   49:aload_1         
	//   28   50:ldc1            #199 <String "Can not instantiate value of type %s from Integral number (%s); no single-int-arg constructor/factory method">
	//   29   52:iconst_2        
	//   30   53:anewarray       Object[]
	//   31   56:dup             
	//   32   57:iconst_0        
	//   33   58:aload_0         
	//   34   59:invokevirtual   #105 <Method String getValueTypeDesc()>
	//   35   62:aastore         
	//   36   63:dup             
	//   37   64:iconst_1        
	//   38   65:iload_2         
	//   39   66:invokestatic    #192 <Method Integer Integer.valueOf(int)>
	//   40   69:aastore         
	//   41   70:invokevirtual   #176 <Method JsonMappingException DeserializationContext.mappingException(String, Object[])>
	//   42   73:athrow          
	}

	public Object createFromLong(DeserializationContext deserializationcontext, long l)
		throws IOException
	{
		if(_fromLongCreator == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #81  <Field AnnotatedWithParams _fromLongCreator>
	//*   2    4:ifnonnull       32
			throw deserializationcontext.mappingException("Can not instantiate value of type %s from Long integral number (%s); no single-long-arg constructor/factory method", new Object[] {
				getValueTypeDesc(), Long.valueOf(l)
			});
	//    3    7:aload_1         
	//    4    8:ldc1            #203 <String "Can not instantiate value of type %s from Long integral number (%s); no single-long-arg constructor/factory method">
	//    5   10:iconst_2        
	//    6   11:anewarray       Object[]
	//    7   14:dup             
	//    8   15:iconst_0        
	//    9   16:aload_0         
	//   10   17:invokevirtual   #105 <Method String getValueTypeDesc()>
	//   11   20:aastore         
	//   12   21:dup             
	//   13   22:iconst_1        
	//   14   23:lload_2         
	//   15   24:invokestatic    #197 <Method Long Long.valueOf(long)>
	//   16   27:aastore         
	//   17   28:invokevirtual   #176 <Method JsonMappingException DeserializationContext.mappingException(String, Object[])>
	//   18   31:athrow          
		Object obj;
		try
		{
			obj = _fromLongCreator.call1(((Object) (Long.valueOf(l))));
	//   19   32:aload_0         
	//   20   33:getfield        #81  <Field AnnotatedWithParams _fromLongCreator>
	//   21   36:lload_2         
	//   22   37:invokestatic    #197 <Method Long Long.valueOf(long)>
	//   23   40:invokevirtual   #115 <Method Object AnnotatedWithParams.call1(Object)>
	//   24   43:astore          4
		}
	//*  25   45:aload           4
	//*  26   47:areturn         
		catch(Throwable throwable)
	//*  27   48:astore          4
		{
			throw rewrapCtorProblem(deserializationcontext, throwable);
	//   28   50:aload_0         
	//   29   51:aload_1         
	//   30   52:aload           4
	//   31   54:invokevirtual   #133 <Method JsonMappingException rewrapCtorProblem(DeserializationContext, Throwable)>
	//   32   57:athrow          
		}
		return obj;
	}

	public Object createFromObjectWith(DeserializationContext deserializationcontext, Object aobj[])
		throws IOException
	{
		if(_withArgsCreator == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #63  <Field AnnotatedWithParams _withArgsCreator>
	//*   2    4:ifnonnull       37
			throw new IllegalStateException((new StringBuilder()).append("No with-args constructor for ").append(getValueTypeDesc()).toString());
	//    3    7:new             #93  <Class IllegalStateException>
	//    4   10:dup             
	//    5   11:new             #95  <Class StringBuilder>
	//    6   14:dup             
	//    7   15:invokespecial   #96  <Method void StringBuilder()>
	//    8   18:ldc1            #207 <String "No with-args constructor for ">
	//    9   20:invokevirtual   #102 <Method StringBuilder StringBuilder.append(String)>
	//   10   23:aload_0         
	//   11   24:invokevirtual   #105 <Method String getValueTypeDesc()>
	//   12   27:invokevirtual   #102 <Method StringBuilder StringBuilder.append(String)>
	//   13   30:invokevirtual   #106 <Method String StringBuilder.toString()>
	//   14   33:invokespecial   #109 <Method void IllegalStateException(String)>
	//   15   36:athrow          
		try
		{
			aobj = ((Object []) (_withArgsCreator.call(aobj)));
	//   16   37:aload_0         
	//   17   38:getfield        #63  <Field AnnotatedWithParams _withArgsCreator>
	//   18   41:aload_2         
	//   19   42:invokevirtual   #137 <Method Object AnnotatedWithParams.call(Object[])>
	//   20   45:astore_2        
		}
	//*  21   46:aload_2         
	//*  22   47:areturn         
		// Misplaced declaration of an exception variable
		catch(Object aobj[])
	//*  23   48:astore_2        
		{
			throw rewrapCtorProblem(deserializationcontext, ((Throwable) (aobj)));
	//   24   49:aload_0         
	//   25   50:aload_1         
	//   26   51:aload_2         
	//   27   52:invokevirtual   #133 <Method JsonMappingException rewrapCtorProblem(DeserializationContext, Throwable)>
	//   28   55:athrow          
		}
		return ((Object) (aobj));
	}

	public Object createFromString(DeserializationContext deserializationcontext, String s)
		throws IOException
	{
		if(_fromStringCreator == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #77  <Field AnnotatedWithParams _fromStringCreator>
	//*   2    4:ifnonnull       14
			return _createFromStringFallbacks(deserializationcontext, s);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:invokevirtual   #212 <Method Object _createFromStringFallbacks(DeserializationContext, String)>
	//    7   13:areturn         
		try
		{
			s = ((String) (_fromStringCreator.call1(((Object) (s)))));
	//    8   14:aload_0         
	//    9   15:getfield        #77  <Field AnnotatedWithParams _fromStringCreator>
	//   10   18:aload_2         
	//   11   19:invokevirtual   #115 <Method Object AnnotatedWithParams.call1(Object)>
	//   12   22:astore_2        
		}
	//*  13   23:aload_2         
	//*  14   24:areturn         
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  15   25:astore_2        
		{
			throw rewrapCtorProblem(deserializationcontext, ((Throwable) (s)));
	//   16   26:aload_0         
	//   17   27:aload_1         
	//   18   28:aload_2         
	//   19   29:invokevirtual   #133 <Method JsonMappingException rewrapCtorProblem(DeserializationContext, Throwable)>
	//   20   32:athrow          
		}
		return ((Object) (s));
	}

	public Object createUsingArrayDelegate(DeserializationContext deserializationcontext, Object obj)
		throws IOException
	{
		if(_arrayDelegateCreator == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #73  <Field AnnotatedWithParams _arrayDelegateCreator>
	//*   2    4:ifnonnull       14
			return createUsingDelegate(deserializationcontext, obj);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:invokevirtual   #217 <Method Object createUsingDelegate(DeserializationContext, Object)>
	//    7   13:areturn         
		else
			return _createUsingDelegate(_arrayDelegateCreator, _arrayDelegateArguments, deserializationcontext, obj);
	//    8   14:aload_0         
	//    9   15:aload_0         
	//   10   16:getfield        #73  <Field AnnotatedWithParams _arrayDelegateCreator>
	//   11   19:aload_0         
	//   12   20:getfield        #75  <Field SettableBeanProperty[] _arrayDelegateArguments>
	//   13   23:aload_1         
	//   14   24:aload_2         
	//   15   25:invokespecial   #219 <Method Object _createUsingDelegate(AnnotatedWithParams, SettableBeanProperty[], DeserializationContext, Object)>
	//   16   28:areturn         
	}

	public Object createUsingDefault(DeserializationContext deserializationcontext)
		throws IOException
	{
		if(_defaultCreator == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #59  <Field AnnotatedWithParams _defaultCreator>
	//*   2    4:ifnonnull       37
			throw new IllegalStateException((new StringBuilder()).append("No default constructor for ").append(getValueTypeDesc()).toString());
	//    3    7:new             #93  <Class IllegalStateException>
	//    4   10:dup             
	//    5   11:new             #95  <Class StringBuilder>
	//    6   14:dup             
	//    7   15:invokespecial   #96  <Method void StringBuilder()>
	//    8   18:ldc1            #223 <String "No default constructor for ">
	//    9   20:invokevirtual   #102 <Method StringBuilder StringBuilder.append(String)>
	//   10   23:aload_0         
	//   11   24:invokevirtual   #105 <Method String getValueTypeDesc()>
	//   12   27:invokevirtual   #102 <Method StringBuilder StringBuilder.append(String)>
	//   13   30:invokevirtual   #106 <Method String StringBuilder.toString()>
	//   14   33:invokespecial   #109 <Method void IllegalStateException(String)>
	//   15   36:athrow          
		Object obj;
		try
		{
			obj = _defaultCreator.call();
	//   16   37:aload_0         
	//   17   38:getfield        #59  <Field AnnotatedWithParams _defaultCreator>
	//   18   41:invokevirtual   #225 <Method Object AnnotatedWithParams.call()>
	//   19   44:astore_2        
		}
	//*  20   45:aload_2         
	//*  21   46:areturn         
		catch(Throwable throwable)
	//*  22   47:astore_2        
		{
			throw rewrapCtorProblem(deserializationcontext, throwable);
	//   23   48:aload_0         
	//   24   49:aload_1         
	//   25   50:aload_2         
	//   26   51:invokevirtual   #133 <Method JsonMappingException rewrapCtorProblem(DeserializationContext, Throwable)>
	//   27   54:athrow          
		}
		return obj;
	}

	public Object createUsingDelegate(DeserializationContext deserializationcontext, Object obj)
		throws IOException
	{
		return _createUsingDelegate(_delegateCreator, _delegateArguments, deserializationcontext, obj);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #67  <Field AnnotatedWithParams _delegateCreator>
	//    3    5:aload_0         
	//    4    6:getfield        #69  <Field SettableBeanProperty[] _delegateArguments>
	//    5    9:aload_1         
	//    6   10:aload_2         
	//    7   11:invokespecial   #219 <Method Object _createUsingDelegate(AnnotatedWithParams, SettableBeanProperty[], DeserializationContext, Object)>
	//    8   14:areturn         
	}

	public AnnotatedWithParams getArrayDelegateCreator()
	{
		return _arrayDelegateCreator;
	//    0    0:aload_0         
	//    1    1:getfield        #73  <Field AnnotatedWithParams _arrayDelegateCreator>
	//    2    4:areturn         
	}

	public JavaType getArrayDelegateType(DeserializationConfig deserializationconfig)
	{
		return _arrayDelegateType;
	//    0    0:aload_0         
	//    1    1:getfield        #71  <Field JavaType _arrayDelegateType>
	//    2    4:areturn         
	}

	public AnnotatedWithParams getDefaultCreator()
	{
		return _defaultCreator;
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field AnnotatedWithParams _defaultCreator>
	//    2    4:areturn         
	}

	public AnnotatedWithParams getDelegateCreator()
	{
		return _delegateCreator;
	//    0    0:aload_0         
	//    1    1:getfield        #67  <Field AnnotatedWithParams _delegateCreator>
	//    2    4:areturn         
	}

	public JavaType getDelegateType(DeserializationConfig deserializationconfig)
	{
		return _delegateType;
	//    0    0:aload_0         
	//    1    1:getfield        #65  <Field JavaType _delegateType>
	//    2    4:areturn         
	}

	public SettableBeanProperty[] getFromObjectArguments(DeserializationConfig deserializationconfig)
	{
		return _constructorArguments;
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field SettableBeanProperty[] _constructorArguments>
	//    2    4:areturn         
	}

	public AnnotatedParameter getIncompleteParameter()
	{
		return _incompleteParameter;
	//    0    0:aload_0         
	//    1    1:getfield        #162 <Field AnnotatedParameter _incompleteParameter>
	//    2    4:areturn         
	}

	public String getValueTypeDesc()
	{
		return _valueTypeDesc;
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field String _valueTypeDesc>
	//    2    4:areturn         
	}

	public AnnotatedWithParams getWithArgsCreator()
	{
		return _withArgsCreator;
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field AnnotatedWithParams _withArgsCreator>
	//    2    4:areturn         
	}

	protected JsonMappingException rewrapCtorProblem(DeserializationContext deserializationcontext, Throwable throwable)
	{
		Throwable throwable1;
label0:
		{
			if(!(throwable instanceof ExceptionInInitializerError))
	//*   0    0:aload_2         
	//*   1    1:instanceof      #239 <Class ExceptionInInitializerError>
	//*   2    4:ifne            16
			{
				throwable1 = throwable;
	//    3    7:aload_2         
	//    4    8:astore_3        
				if(!(throwable instanceof InvocationTargetException))
					break label0;
	//    5    9:aload_2         
	//    6   10:instanceof      #241 <Class InvocationTargetException>
	//    7   13:ifeq            32
			}
			Throwable throwable2 = throwable.getCause();
	//    8   16:aload_2         
	//    9   17:invokevirtual   #245 <Method Throwable Throwable.getCause()>
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
	//   20   35:invokevirtual   #248 <Method JsonMappingException wrapAsJsonMappingException(DeserializationContext, Throwable)>
	//   21   38:areturn         
	}

	protected JsonMappingException unwrapAndWrapException(DeserializationContext deserializationcontext, Throwable throwable)
	{
		for(Throwable throwable1 = throwable; throwable1 != null; throwable1 = throwable1.getCause())
	//*   0    0:aload_2         
	//*   1    1:astore_3        
	//*   2    2:aload_3         
	//*   3    3:ifnull          26
			if(throwable1 instanceof JsonMappingException)
	//*   4    6:aload_3         
	//*   5    7:instanceof      #251 <Class JsonMappingException>
	//*   6   10:ifeq            18
				return (JsonMappingException)throwable1;
	//    7   13:aload_3         
	//    8   14:checkcast       #251 <Class JsonMappingException>
	//    9   17:areturn         

	//   10   18:aload_3         
	//   11   19:invokevirtual   #245 <Method Throwable Throwable.getCause()>
	//   12   22:astore_3        
	//*  13   23:goto            2
		String s = String.format("Instantiation of %s value failed (%s): %s", new Object[] {
			getValueTypeDesc(), ((Object) (throwable)).getClass().getName(), throwable.getMessage()
		});
	//   14   26:ldc1            #253 <String "Instantiation of %s value failed (%s): %s">
	//   15   28:iconst_3        
	//   16   29:anewarray       Object[]
	//   17   32:dup             
	//   18   33:iconst_0        
	//   19   34:aload_0         
	//   20   35:invokevirtual   #105 <Method String getValueTypeDesc()>
	//   21   38:aastore         
	//   22   39:dup             
	//   23   40:iconst_1        
	//   24   41:aload_2         
	//   25   42:invokevirtual   #257 <Method Class Object.getClass()>
	//   26   45:invokevirtual   #54  <Method String Class.getName()>
	//   27   48:aastore         
	//   28   49:dup             
	//   29   50:iconst_2        
	//   30   51:aload_2         
	//   31   52:invokevirtual   #260 <Method String Throwable.getMessage()>
	//   32   55:aastore         
	//   33   56:invokestatic    #266 <Method String String.format(String, Object[])>
	//   34   59:astore_3        
		return JsonMappingException.from(deserializationcontext.getParser(), s, throwable);
	//   35   60:aload_1         
	//   36   61:invokevirtual   #270 <Method com.fasterxml.jackson.core.JsonParser DeserializationContext.getParser()>
	//   37   64:aload_3         
	//   38   65:aload_2         
	//   39   66:invokestatic    #274 <Method JsonMappingException JsonMappingException.from(com.fasterxml.jackson.core.JsonParser, String, Throwable)>
	//   40   69:areturn         
	}

	protected JsonMappingException wrapAsJsonMappingException(DeserializationContext deserializationcontext, Throwable throwable)
	{
		if(throwable instanceof JsonMappingException)
	//*   0    0:aload_2         
	//*   1    1:instanceof      #251 <Class JsonMappingException>
	//*   2    4:ifeq            12
		{
			return (JsonMappingException)throwable;
	//    3    7:aload_2         
	//    4    8:checkcast       #251 <Class JsonMappingException>
	//    5   11:areturn         
		} else
		{
			String s = String.format("Instantiation of %s value failed (%s): %s", new Object[] {
				getValueTypeDesc(), ((Object) (throwable)).getClass().getName(), throwable.getMessage()
			});
	//    6   12:ldc1            #253 <String "Instantiation of %s value failed (%s): %s">
	//    7   14:iconst_3        
	//    8   15:anewarray       Object[]
	//    9   18:dup             
	//   10   19:iconst_0        
	//   11   20:aload_0         
	//   12   21:invokevirtual   #105 <Method String getValueTypeDesc()>
	//   13   24:aastore         
	//   14   25:dup             
	//   15   26:iconst_1        
	//   16   27:aload_2         
	//   17   28:invokevirtual   #257 <Method Class Object.getClass()>
	//   18   31:invokevirtual   #54  <Method String Class.getName()>
	//   19   34:aastore         
	//   20   35:dup             
	//   21   36:iconst_2        
	//   22   37:aload_2         
	//   23   38:invokevirtual   #260 <Method String Throwable.getMessage()>
	//   24   41:aastore         
	//   25   42:invokestatic    #266 <Method String String.format(String, Object[])>
	//   26   45:astore_3        
			return JsonMappingException.from(deserializationcontext.getParser(), s, throwable);
	//   27   46:aload_1         
	//   28   47:invokevirtual   #270 <Method com.fasterxml.jackson.core.JsonParser DeserializationContext.getParser()>
	//   29   50:aload_3         
	//   30   51:aload_2         
	//   31   52:invokestatic    #274 <Method JsonMappingException JsonMappingException.from(com.fasterxml.jackson.core.JsonParser, String, Throwable)>
	//   32   55:areturn         
		}
	}

	protected JsonMappingException wrapException(Throwable throwable)
	{
		for(Throwable throwable1 = throwable; throwable1 != null; throwable1 = throwable1.getCause())
	//*   0    0:aload_1         
	//*   1    1:astore_2        
	//*   2    2:aload_2         
	//*   3    3:ifnull          26
			if(throwable1 instanceof JsonMappingException)
	//*   4    6:aload_2         
	//*   5    7:instanceof      #251 <Class JsonMappingException>
	//*   6   10:ifeq            18
				return (JsonMappingException)throwable1;
	//    7   13:aload_2         
	//    8   14:checkcast       #251 <Class JsonMappingException>
	//    9   17:areturn         

	//   10   18:aload_2         
	//   11   19:invokevirtual   #245 <Method Throwable Throwable.getCause()>
	//   12   22:astore_2        
	//*  13   23:goto            2
		return new JsonMappingException(((java.io.Closeable) (null)), (new StringBuilder()).append("Instantiation of ").append(getValueTypeDesc()).append(" value failed: ").append(throwable.getMessage()).toString(), throwable);
	//   14   26:new             #251 <Class JsonMappingException>
	//   15   29:dup             
	//   16   30:aconst_null     
	//   17   31:new             #95  <Class StringBuilder>
	//   18   34:dup             
	//   19   35:invokespecial   #96  <Method void StringBuilder()>
	//   20   38:ldc2            #279 <String "Instantiation of ">
	//   21   41:invokevirtual   #102 <Method StringBuilder StringBuilder.append(String)>
	//   22   44:aload_0         
	//   23   45:invokevirtual   #105 <Method String getValueTypeDesc()>
	//   24   48:invokevirtual   #102 <Method StringBuilder StringBuilder.append(String)>
	//   25   51:ldc2            #281 <String " value failed: ">
	//   26   54:invokevirtual   #102 <Method StringBuilder StringBuilder.append(String)>
	//   27   57:aload_1         
	//   28   58:invokevirtual   #260 <Method String Throwable.getMessage()>
	//   29   61:invokevirtual   #102 <Method StringBuilder StringBuilder.append(String)>
	//   30   64:invokevirtual   #106 <Method String StringBuilder.toString()>
	//   31   67:aload_1         
	//   32   68:invokespecial   #284 <Method void JsonMappingException(java.io.Closeable, String, Throwable)>
	//   33   71:areturn         
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
	protected final String _valueTypeDesc;
	protected AnnotatedWithParams _withArgsCreator;
}
