// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.deser.*;
import com.fasterxml.jackson.databind.deser.std.StdValueInstantiator;
import com.fasterxml.jackson.databind.introspect.*;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.Member;
import java.util.*;

public class CreatorCollector
{
	protected static final class Vanilla extends ValueInstantiator
		implements Serializable
	{

		public boolean canCreateUsingDefault()
		{
			return true;
		//    0    0:iconst_1        
		//    1    1:ireturn         
		}

		public boolean canInstantiate()
		{
			return true;
		//    0    0:iconst_1        
		//    1    1:ireturn         
		}

		public Object createUsingDefault(DeserializationContext deserializationcontext)
			throws IOException
		{
			switch(_type)
		//*   0    0:aload_0         
		//*   1    1:getfield        #28  <Field int _type>
			{
		//*   2    4:tableswitch     1 3: default 32
		//		               1 62
		//		               2 70
		//		               3 78
			default:
				throw new IllegalStateException((new StringBuilder()).append("Unknown type ").append(_type).toString());
		//    3   32:new             #38  <Class IllegalStateException>
		//    4   35:dup             
		//    5   36:new             #40  <Class StringBuilder>
		//    6   39:dup             
		//    7   40:invokespecial   #41  <Method void StringBuilder()>
		//    8   43:ldc1            #43  <String "Unknown type ">
		//    9   45:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
		//   10   48:aload_0         
		//   11   49:getfield        #28  <Field int _type>
		//   12   52:invokevirtual   #50  <Method StringBuilder StringBuilder.append(int)>
		//   13   55:invokevirtual   #54  <Method String StringBuilder.toString()>
		//   14   58:invokespecial   #57  <Method void IllegalStateException(String)>
		//   15   61:athrow          

			case 1: // '\001'
				return ((Object) (new ArrayList()));
		//   16   62:new             #59  <Class ArrayList>
		//   17   65:dup             
		//   18   66:invokespecial   #60  <Method void ArrayList()>
		//   19   69:areturn         

			case 2: // '\002'
				return ((Object) (new LinkedHashMap()));
		//   20   70:new             #62  <Class LinkedHashMap>
		//   21   73:dup             
		//   22   74:invokespecial   #63  <Method void LinkedHashMap()>
		//   23   77:areturn         

			case 3: // '\003'
				return ((Object) (new HashMap()));
		//   24   78:new             #65  <Class HashMap>
		//   25   81:dup             
		//   26   82:invokespecial   #66  <Method void HashMap()>
		//   27   85:areturn         
			}
		}

		public String getValueTypeDesc()
		{
			switch(_type)
		//*   0    0:aload_0         
		//*   1    1:getfield        #28  <Field int _type>
			{
		//*   2    4:tableswitch     1 3: default 32
		//		               1 38
		//		               2 44
		//		               3 50
			default:
				return ((Class) (java/lang/Object)).getName();
		//    3   32:ldc1            #70  <Class Object>
		//    4   34:invokevirtual   #75  <Method String Class.getName()>
		//    5   37:areturn         

			case 1: // '\001'
				return ((Class) (java/util/ArrayList)).getName();
		//    6   38:ldc1            #59  <Class ArrayList>
		//    7   40:invokevirtual   #75  <Method String Class.getName()>
		//    8   43:areturn         

			case 2: // '\002'
				return ((Class) (java/util/LinkedHashMap)).getName();
		//    9   44:ldc1            #62  <Class LinkedHashMap>
		//   10   46:invokevirtual   #75  <Method String Class.getName()>
		//   11   49:areturn         

			case 3: // '\003'
				return ((Class) (java/util/HashMap)).getName();
		//   12   50:ldc1            #65  <Class HashMap>
		//   13   52:invokevirtual   #75  <Method String Class.getName()>
		//   14   55:areturn         
			}
		}

		public static final int TYPE_COLLECTION = 1;
		public static final int TYPE_HASH_MAP = 3;
		public static final int TYPE_MAP = 2;
		private static final long serialVersionUID = 1L;
		private final int _type;

		public Vanilla(int i)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #26  <Method void ValueInstantiator()>
			_type = i;
		//    2    4:aload_0         
		//    3    5:iload_1         
		//    4    6:putfield        #28  <Field int _type>
		//    5    9:return          
		}
	}


	public CreatorCollector(BeanDescription beandescription, MapperConfig mapperconfig)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #70  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:bipush          9
	//    4    7:anewarray       AnnotatedWithParams[]
	//    5   10:putfield        #74  <Field AnnotatedWithParams[] _creators>
		_explicitCreators = 0;
	//    6   13:aload_0         
	//    7   14:iconst_0        
	//    8   15:putfield        #76  <Field int _explicitCreators>
		_hasNonDefaultCreator = false;
	//    9   18:aload_0         
	//   10   19:iconst_0        
	//   11   20:putfield        #78  <Field boolean _hasNonDefaultCreator>
		_beanDesc = beandescription;
	//   12   23:aload_0         
	//   13   24:aload_1         
	//   14   25:putfield        #80  <Field BeanDescription _beanDesc>
		_canFixAccess = mapperconfig.canOverrideAccessModifiers();
	//   15   28:aload_0         
	//   16   29:aload_2         
	//   17   30:invokevirtual   #86  <Method boolean MapperConfig.canOverrideAccessModifiers()>
	//   18   33:putfield        #88  <Field boolean _canFixAccess>
		_forceAccess = mapperconfig.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS);
	//   19   36:aload_0         
	//   20   37:aload_2         
	//   21   38:getstatic       #94  <Field MapperFeature MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS>
	//   22   41:invokevirtual   #98  <Method boolean MapperConfig.isEnabled(MapperFeature)>
	//   23   44:putfield        #100 <Field boolean _forceAccess>
	//   24   47:return          
	}

	private JavaType _computeDelegateType(AnnotatedWithParams annotatedwithparams, SettableBeanProperty asettablebeanproperty[])
	{
		int j;
		boolean flag;
		if(!_hasNonDefaultCreator || annotatedwithparams == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #78  <Field boolean _hasNonDefaultCreator>
	//*   2    4:ifeq            11
	//*   3    7:aload_1         
	//*   4    8:ifnonnull       13
			return null;
	//    5   11:aconst_null     
	//    6   12:areturn         
		flag = false;
	//    7   13:iconst_0        
	//    8   14:istore          5
		j = ((int) (flag));
	//    9   16:iload           5
	//   10   18:istore          4
		if(asettablebeanproperty == null) goto _L2; else goto _L1
	//   11   20:aload_2         
	//   12   21:ifnull          49
_L1:
		int i;
		int k;
		i = 0;
	//   13   24:iconst_0        
	//   14   25:istore_3        
		k = asettablebeanproperty.length;
	//   15   26:aload_2         
	//   16   27:arraylength     
	//   17   28:istore          6
_L7:
		j = ((int) (flag));
	//   18   30:iload           5
	//   19   32:istore          4
		if(i >= k) goto _L2; else goto _L3
	//   20   34:iload_3         
	//   21   35:iload           6
	//   22   37:icmpge          49
_L3:
		if(asettablebeanproperty[i] != null) goto _L5; else goto _L4
	//   23   40:aload_2         
	//   24   41:iload_3         
	//   25   42:aaload          
	//   26   43:ifnonnull       56
_L4:
		j = i;
	//   27   46:iload_3         
	//   28   47:istore          4
_L2:
		return annotatedwithparams.getParameterType(j);
	//   29   49:aload_1         
	//   30   50:iload           4
	//   31   52:invokevirtual   #108 <Method JavaType AnnotatedWithParams.getParameterType(int)>
	//   32   55:areturn         
_L5:
		i++;
	//   33   56:iload_3         
	//   34   57:iconst_1        
	//   35   58:iadd            
	//   36   59:istore_3        
		if(true) goto _L7; else goto _L6
	//   37   60:goto            30
_L6:
	}

	private AnnotatedMember _fixAccess(AnnotatedMember annotatedmember)
	{
		if(annotatedmember != null && _canFixAccess)
	//*   0    0:aload_1         
	//*   1    1:ifnull          25
	//*   2    4:aload_0         
	//*   3    5:getfield        #88  <Field boolean _canFixAccess>
	//*   4    8:ifeq            25
			ClassUtil.checkAndFixAccess((Member)annotatedmember.getAnnotated(), _forceAccess);
	//    5   11:aload_1         
	//    6   12:invokevirtual   #116 <Method java.lang.reflect.AnnotatedElement AnnotatedMember.getAnnotated()>
	//    7   15:checkcast       #118 <Class Member>
	//    8   18:aload_0         
	//    9   19:getfield        #100 <Field boolean _forceAccess>
	//   10   22:invokestatic    #124 <Method void ClassUtil.checkAndFixAccess(Member, boolean)>
		return annotatedmember;
	//   11   25:aload_1         
	//   12   26:areturn         
	}

	public void addBooleanCreator(AnnotatedWithParams annotatedwithparams)
	{
		addBooleanCreator(annotatedwithparams, false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:invokevirtual   #131 <Method void addBooleanCreator(AnnotatedWithParams, boolean)>
	//    4    6:return          
	}

	public void addBooleanCreator(AnnotatedWithParams annotatedwithparams, boolean flag)
	{
		verifyNonDup(annotatedwithparams, 5, flag);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_5        
	//    3    3:iload_2         
	//    4    4:invokevirtual   #136 <Method void verifyNonDup(AnnotatedWithParams, int, boolean)>
	//    5    7:return          
	}

	public void addDelegatingCreator(AnnotatedWithParams annotatedwithparams, boolean flag, SettableBeanProperty asettablebeanproperty[])
	{
		if(annotatedwithparams.getParameterType(0).isCollectionLikeType())
	//*   0    0:aload_1         
	//*   1    1:iconst_0        
	//*   2    2:invokevirtual   #108 <Method JavaType AnnotatedWithParams.getParameterType(int)>
	//*   3    5:invokevirtual   #143 <Method boolean JavaType.isCollectionLikeType()>
	//*   4    8:ifeq            25
		{
			verifyNonDup(annotatedwithparams, 8, flag);
	//    5   11:aload_0         
	//    6   12:aload_1         
	//    7   13:bipush          8
	//    8   15:iload_2         
	//    9   16:invokevirtual   #136 <Method void verifyNonDup(AnnotatedWithParams, int, boolean)>
			_arrayDelegateArgs = asettablebeanproperty;
	//   10   19:aload_0         
	//   11   20:aload_3         
	//   12   21:putfield        #145 <Field SettableBeanProperty[] _arrayDelegateArgs>
			return;
	//   13   24:return          
		} else
		{
			verifyNonDup(annotatedwithparams, 6, flag);
	//   14   25:aload_0         
	//   15   26:aload_1         
	//   16   27:bipush          6
	//   17   29:iload_2         
	//   18   30:invokevirtual   #136 <Method void verifyNonDup(AnnotatedWithParams, int, boolean)>
			_delegateArgs = asettablebeanproperty;
	//   19   33:aload_0         
	//   20   34:aload_3         
	//   21   35:putfield        #147 <Field SettableBeanProperty[] _delegateArgs>
			return;
	//   22   38:return          
		}
	}

	public void addDelegatingCreator(AnnotatedWithParams annotatedwithparams, CreatorProperty acreatorproperty[])
	{
		addDelegatingCreator(annotatedwithparams, false, ((SettableBeanProperty []) (acreatorproperty)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:aload_2         
	//    4    4:invokevirtual   #150 <Method void addDelegatingCreator(AnnotatedWithParams, boolean, SettableBeanProperty[])>
	//    5    7:return          
	}

	public void addDoubleCreator(AnnotatedWithParams annotatedwithparams)
	{
		addBooleanCreator(annotatedwithparams, false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:invokevirtual   #131 <Method void addBooleanCreator(AnnotatedWithParams, boolean)>
	//    4    6:return          
	}

	public void addDoubleCreator(AnnotatedWithParams annotatedwithparams, boolean flag)
	{
		verifyNonDup(annotatedwithparams, 4, flag);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_4        
	//    3    3:iload_2         
	//    4    4:invokevirtual   #136 <Method void verifyNonDup(AnnotatedWithParams, int, boolean)>
	//    5    7:return          
	}

	public void addIncompeteParameter(AnnotatedParameter annotatedparameter)
	{
		if(_incompleteParameter == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #155 <Field AnnotatedParameter _incompleteParameter>
	//*   2    4:ifnonnull       12
			_incompleteParameter = annotatedparameter;
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:putfield        #155 <Field AnnotatedParameter _incompleteParameter>
	//    6   12:return          
	}

	public void addIntCreator(AnnotatedWithParams annotatedwithparams)
	{
		addBooleanCreator(annotatedwithparams, false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:invokevirtual   #131 <Method void addBooleanCreator(AnnotatedWithParams, boolean)>
	//    4    6:return          
	}

	public void addIntCreator(AnnotatedWithParams annotatedwithparams, boolean flag)
	{
		verifyNonDup(annotatedwithparams, 2, flag);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_2        
	//    3    3:iload_2         
	//    4    4:invokevirtual   #136 <Method void verifyNonDup(AnnotatedWithParams, int, boolean)>
	//    5    7:return          
	}

	public void addLongCreator(AnnotatedWithParams annotatedwithparams)
	{
		addBooleanCreator(annotatedwithparams, false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:invokevirtual   #131 <Method void addBooleanCreator(AnnotatedWithParams, boolean)>
	//    4    6:return          
	}

	public void addLongCreator(AnnotatedWithParams annotatedwithparams, boolean flag)
	{
		verifyNonDup(annotatedwithparams, 3, flag);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_3        
	//    3    3:iload_2         
	//    4    4:invokevirtual   #136 <Method void verifyNonDup(AnnotatedWithParams, int, boolean)>
	//    5    7:return          
	}

	public void addPropertyCreator(AnnotatedWithParams annotatedwithparams, boolean flag, SettableBeanProperty asettablebeanproperty[])
	{
		int i;
		int j;
		verifyNonDup(annotatedwithparams, 7, flag);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:bipush          7
	//    3    4:iload_2         
	//    4    5:invokevirtual   #136 <Method void verifyNonDup(AnnotatedWithParams, int, boolean)>
		if(asettablebeanproperty.length <= 1)
			break MISSING_BLOCK_LABEL_146;
	//    5    8:aload_3         
	//    6    9:arraylength     
	//    7   10:iconst_1        
	//    8   11:icmple          146
		annotatedwithparams = ((AnnotatedWithParams) (new HashMap()));
	//    9   14:new             #160 <Class HashMap>
	//   10   17:dup             
	//   11   18:invokespecial   #161 <Method void HashMap()>
	//   12   21:astore_1        
		i = 0;
	//   13   22:iconst_0        
	//   14   23:istore          4
		j = asettablebeanproperty.length;
	//   15   25:aload_3         
	//   16   26:arraylength     
	//   17   27:istore          5
_L2:
		String s;
		if(i >= j)
			break MISSING_BLOCK_LABEL_146;
	//   18   29:iload           4
	//   19   31:iload           5
	//   20   33:icmpge          146
		s = asettablebeanproperty[i].getName();
	//   21   36:aload_3         
	//   22   37:iload           4
	//   23   39:aaload          
	//   24   40:invokevirtual   #167 <Method String SettableBeanProperty.getName()>
	//   25   43:astore          6
		if(s.length() != 0 || asettablebeanproperty[i].getInjectableValueId() == null)
			break; /* Loop/switch isn't completed */
	//   26   45:aload           6
	//   27   47:invokevirtual   #171 <Method int String.length()>
	//   28   50:ifne            72
	//   29   53:aload_3         
	//   30   54:iload           4
	//   31   56:aaload          
	//   32   57:invokevirtual   #175 <Method Object SettableBeanProperty.getInjectableValueId()>
	//   33   60:ifnull          72
_L4:
		i++;
	//   34   63:iload           4
	//   35   65:iconst_1        
	//   36   66:iadd            
	//   37   67:istore          4
		Integer integer;
		if(true) goto _L2; else goto _L1
	//   38   69:goto            29
	//*  39   72:aload_1         
	//*  40   73:aload           6
	//*  41   75:iload           4
	//*  42   77:invokestatic    #181 <Method Integer Integer.valueOf(int)>
	//*  43   80:invokevirtual   #185 <Method Object HashMap.put(Object, Object)>
	//*  44   83:checkcast       #177 <Class Integer>
	//*  45   86:astore          7
_L1:
		if((integer = (Integer)((HashMap) (annotatedwithparams)).put(((Object) (s)), ((Object) (Integer.valueOf(i))))) == null) goto _L4; else goto _L3
	//   46   88:aload           7
	//   47   90:ifnull          63
_L3:
		throw new IllegalArgumentException((new StringBuilder()).append("Duplicate creator property \"").append(s).append("\" (index ").append(((Object) (integer))).append(" vs ").append(i).append(")").toString());
	//   48   93:new             #187 <Class IllegalArgumentException>
	//   49   96:dup             
	//   50   97:new             #189 <Class StringBuilder>
	//   51  100:dup             
	//   52  101:invokespecial   #190 <Method void StringBuilder()>
	//   53  104:ldc1            #192 <String "Duplicate creator property \"">
	//   54  106:invokevirtual   #196 <Method StringBuilder StringBuilder.append(String)>
	//   55  109:aload           6
	//   56  111:invokevirtual   #196 <Method StringBuilder StringBuilder.append(String)>
	//   57  114:ldc1            #198 <String "\" (index ">
	//   58  116:invokevirtual   #196 <Method StringBuilder StringBuilder.append(String)>
	//   59  119:aload           7
	//   60  121:invokevirtual   #201 <Method StringBuilder StringBuilder.append(Object)>
	//   61  124:ldc1            #203 <String " vs ">
	//   62  126:invokevirtual   #196 <Method StringBuilder StringBuilder.append(String)>
	//   63  129:iload           4
	//   64  131:invokevirtual   #206 <Method StringBuilder StringBuilder.append(int)>
	//   65  134:ldc1            #208 <String ")">
	//   66  136:invokevirtual   #196 <Method StringBuilder StringBuilder.append(String)>
	//   67  139:invokevirtual   #211 <Method String StringBuilder.toString()>
	//   68  142:invokespecial   #214 <Method void IllegalArgumentException(String)>
	//   69  145:athrow          
		_propertyBasedArgs = asettablebeanproperty;
	//   70  146:aload_0         
	//   71  147:aload_3         
	//   72  148:putfield        #216 <Field SettableBeanProperty[] _propertyBasedArgs>
		return;
	//   73  151:return          
	}

	public void addPropertyCreator(AnnotatedWithParams annotatedwithparams, CreatorProperty acreatorproperty[])
	{
		addPropertyCreator(annotatedwithparams, false, ((SettableBeanProperty []) (acreatorproperty)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:aload_2         
	//    4    4:invokevirtual   #218 <Method void addPropertyCreator(AnnotatedWithParams, boolean, SettableBeanProperty[])>
	//    5    7:return          
	}

	public void addStringCreator(AnnotatedWithParams annotatedwithparams)
	{
		addStringCreator(annotatedwithparams, false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:invokevirtual   #221 <Method void addStringCreator(AnnotatedWithParams, boolean)>
	//    4    6:return          
	}

	public void addStringCreator(AnnotatedWithParams annotatedwithparams, boolean flag)
	{
		verifyNonDup(annotatedwithparams, 1, flag);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_1        
	//    3    3:iload_2         
	//    4    4:invokevirtual   #136 <Method void verifyNonDup(AnnotatedWithParams, int, boolean)>
	//    5    7:return          
	}

	public ValueInstantiator constructValueInstantiator(DeserializationConfig deserializationconfig)
	{
		JavaType javatype = _computeDelegateType(_creators[6], _delegateArgs);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #74  <Field AnnotatedWithParams[] _creators>
	//    3    5:bipush          6
	//    4    7:aaload          
	//    5    8:aload_0         
	//    6    9:getfield        #147 <Field SettableBeanProperty[] _delegateArgs>
	//    7   12:invokespecial   #225 <Method JavaType _computeDelegateType(AnnotatedWithParams, SettableBeanProperty[])>
	//    8   15:astore_2        
		JavaType javatype1 = _computeDelegateType(_creators[8], _arrayDelegateArgs);
	//    9   16:aload_0         
	//   10   17:aload_0         
	//   11   18:getfield        #74  <Field AnnotatedWithParams[] _creators>
	//   12   21:bipush          8
	//   13   23:aaload          
	//   14   24:aload_0         
	//   15   25:getfield        #145 <Field SettableBeanProperty[] _arrayDelegateArgs>
	//   16   28:invokespecial   #225 <Method JavaType _computeDelegateType(AnnotatedWithParams, SettableBeanProperty[])>
	//   17   31:astore_3        
		JavaType javatype2 = _beanDesc.getType();
	//   18   32:aload_0         
	//   19   33:getfield        #80  <Field BeanDescription _beanDesc>
	//   20   36:invokevirtual   #231 <Method JavaType BeanDescription.getType()>
	//   21   39:astore          4
		if(!_hasNonDefaultCreator)
	//*  22   41:aload_0         
	//*  23   42:getfield        #78  <Field boolean _hasNonDefaultCreator>
	//*  24   45:ifne            124
		{
			Class class1 = javatype2.getRawClass();
	//   25   48:aload           4
	//   26   50:invokevirtual   #235 <Method Class JavaType.getRawClass()>
	//   27   53:astore          5
			if(class1 == java/util/Collection || class1 == java/util/List || class1 == java/util/ArrayList)
	//*  28   55:aload           5
	//*  29   57:ldc1            #237 <Class Collection>
	//*  30   59:if_acmpeq       76
	//*  31   62:aload           5
	//*  32   64:ldc1            #239 <Class List>
	//*  33   66:if_acmpeq       76
	//*  34   69:aload           5
	//*  35   71:ldc1            #241 <Class ArrayList>
	//*  36   73:if_acmpne       85
				return ((ValueInstantiator) (new Vanilla(1)));
	//   37   76:new             #6   <Class CreatorCollector$Vanilla>
	//   38   79:dup             
	//   39   80:iconst_1        
	//   40   81:invokespecial   #244 <Method void CreatorCollector$Vanilla(int)>
	//   41   84:areturn         
			if(class1 == java/util/Map || class1 == java/util/LinkedHashMap)
	//*  42   85:aload           5
	//*  43   87:ldc1            #246 <Class Map>
	//*  44   89:if_acmpeq       99
	//*  45   92:aload           5
	//*  46   94:ldc1            #248 <Class LinkedHashMap>
	//*  47   96:if_acmpne       108
				return ((ValueInstantiator) (new Vanilla(2)));
	//   48   99:new             #6   <Class CreatorCollector$Vanilla>
	//   49  102:dup             
	//   50  103:iconst_2        
	//   51  104:invokespecial   #244 <Method void CreatorCollector$Vanilla(int)>
	//   52  107:areturn         
			if(class1 == java/util/HashMap)
	//*  53  108:aload           5
	//*  54  110:ldc1            #160 <Class HashMap>
	//*  55  112:if_acmpne       124
				return ((ValueInstantiator) (new Vanilla(3)));
	//   56  115:new             #6   <Class CreatorCollector$Vanilla>
	//   57  118:dup             
	//   58  119:iconst_3        
	//   59  120:invokespecial   #244 <Method void CreatorCollector$Vanilla(int)>
	//   60  123:areturn         
		}
		deserializationconfig = ((DeserializationConfig) (new StdValueInstantiator(deserializationconfig, javatype2)));
	//   61  124:new             #250 <Class StdValueInstantiator>
	//   62  127:dup             
	//   63  128:aload_1         
	//   64  129:aload           4
	//   65  131:invokespecial   #253 <Method void StdValueInstantiator(DeserializationConfig, JavaType)>
	//   66  134:astore_1        
		((StdValueInstantiator) (deserializationconfig)).configureFromObjectSettings(_creators[0], _creators[6], javatype, _delegateArgs, _creators[7], _propertyBasedArgs);
	//   67  135:aload_1         
	//   68  136:aload_0         
	//   69  137:getfield        #74  <Field AnnotatedWithParams[] _creators>
	//   70  140:iconst_0        
	//   71  141:aaload          
	//   72  142:aload_0         
	//   73  143:getfield        #74  <Field AnnotatedWithParams[] _creators>
	//   74  146:bipush          6
	//   75  148:aaload          
	//   76  149:aload_2         
	//   77  150:aload_0         
	//   78  151:getfield        #147 <Field SettableBeanProperty[] _delegateArgs>
	//   79  154:aload_0         
	//   80  155:getfield        #74  <Field AnnotatedWithParams[] _creators>
	//   81  158:bipush          7
	//   82  160:aaload          
	//   83  161:aload_0         
	//   84  162:getfield        #216 <Field SettableBeanProperty[] _propertyBasedArgs>
	//   85  165:invokevirtual   #257 <Method void StdValueInstantiator.configureFromObjectSettings(AnnotatedWithParams, AnnotatedWithParams, JavaType, SettableBeanProperty[], AnnotatedWithParams, SettableBeanProperty[])>
		((StdValueInstantiator) (deserializationconfig)).configureFromArraySettings(_creators[8], javatype1, _arrayDelegateArgs);
	//   86  168:aload_1         
	//   87  169:aload_0         
	//   88  170:getfield        #74  <Field AnnotatedWithParams[] _creators>
	//   89  173:bipush          8
	//   90  175:aaload          
	//   91  176:aload_3         
	//   92  177:aload_0         
	//   93  178:getfield        #145 <Field SettableBeanProperty[] _arrayDelegateArgs>
	//   94  181:invokevirtual   #261 <Method void StdValueInstantiator.configureFromArraySettings(AnnotatedWithParams, JavaType, SettableBeanProperty[])>
		((StdValueInstantiator) (deserializationconfig)).configureFromStringCreator(_creators[1]);
	//   95  184:aload_1         
	//   96  185:aload_0         
	//   97  186:getfield        #74  <Field AnnotatedWithParams[] _creators>
	//   98  189:iconst_1        
	//   99  190:aaload          
	//  100  191:invokevirtual   #264 <Method void StdValueInstantiator.configureFromStringCreator(AnnotatedWithParams)>
		((StdValueInstantiator) (deserializationconfig)).configureFromIntCreator(_creators[2]);
	//  101  194:aload_1         
	//  102  195:aload_0         
	//  103  196:getfield        #74  <Field AnnotatedWithParams[] _creators>
	//  104  199:iconst_2        
	//  105  200:aaload          
	//  106  201:invokevirtual   #267 <Method void StdValueInstantiator.configureFromIntCreator(AnnotatedWithParams)>
		((StdValueInstantiator) (deserializationconfig)).configureFromLongCreator(_creators[3]);
	//  107  204:aload_1         
	//  108  205:aload_0         
	//  109  206:getfield        #74  <Field AnnotatedWithParams[] _creators>
	//  110  209:iconst_3        
	//  111  210:aaload          
	//  112  211:invokevirtual   #270 <Method void StdValueInstantiator.configureFromLongCreator(AnnotatedWithParams)>
		((StdValueInstantiator) (deserializationconfig)).configureFromDoubleCreator(_creators[4]);
	//  113  214:aload_1         
	//  114  215:aload_0         
	//  115  216:getfield        #74  <Field AnnotatedWithParams[] _creators>
	//  116  219:iconst_4        
	//  117  220:aaload          
	//  118  221:invokevirtual   #273 <Method void StdValueInstantiator.configureFromDoubleCreator(AnnotatedWithParams)>
		((StdValueInstantiator) (deserializationconfig)).configureFromBooleanCreator(_creators[5]);
	//  119  224:aload_1         
	//  120  225:aload_0         
	//  121  226:getfield        #74  <Field AnnotatedWithParams[] _creators>
	//  122  229:iconst_5        
	//  123  230:aaload          
	//  124  231:invokevirtual   #276 <Method void StdValueInstantiator.configureFromBooleanCreator(AnnotatedWithParams)>
		((StdValueInstantiator) (deserializationconfig)).configureIncompleteParameter(_incompleteParameter);
	//  125  234:aload_1         
	//  126  235:aload_0         
	//  127  236:getfield        #155 <Field AnnotatedParameter _incompleteParameter>
	//  128  239:invokevirtual   #279 <Method void StdValueInstantiator.configureIncompleteParameter(AnnotatedParameter)>
		return ((ValueInstantiator) (deserializationconfig));
	//  129  242:aload_1         
	//  130  243:areturn         
	}

	public boolean hasDefaultCreator()
	{
		boolean flag = false;
	//    0    0:iconst_0        
	//    1    1:istore_1        
		if(_creators[0] != null)
	//*   2    2:aload_0         
	//*   3    3:getfield        #74  <Field AnnotatedWithParams[] _creators>
	//*   4    6:iconst_0        
	//*   5    7:aaload          
	//*   6    8:ifnull          13
			flag = true;
	//    7   11:iconst_1        
	//    8   12:istore_1        
		return flag;
	//    9   13:iload_1         
	//   10   14:ireturn         
	}

	public boolean hasDelegatingCreator()
	{
		return _creators[6] != null;
	//    0    0:aload_0         
	//    1    1:getfield        #74  <Field AnnotatedWithParams[] _creators>
	//    2    4:bipush          6
	//    3    6:aaload          
	//    4    7:ifnull          12
	//    5   10:iconst_1        
	//    6   11:ireturn         
	//    7   12:iconst_0        
	//    8   13:ireturn         
	}

	public boolean hasPropertyBasedCreator()
	{
		return _creators[7] != null;
	//    0    0:aload_0         
	//    1    1:getfield        #74  <Field AnnotatedWithParams[] _creators>
	//    2    4:bipush          7
	//    3    6:aaload          
	//    4    7:ifnull          12
	//    5   10:iconst_1        
	//    6   11:ireturn         
	//    7   12:iconst_0        
	//    8   13:ireturn         
	}

	public void setDefaultCreator(AnnotatedWithParams annotatedwithparams)
	{
		_creators[0] = (AnnotatedWithParams)_fixAccess(((AnnotatedMember) (annotatedwithparams)));
	//    0    0:aload_0         
	//    1    1:getfield        #74  <Field AnnotatedWithParams[] _creators>
	//    2    4:iconst_0        
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokespecial   #285 <Method AnnotatedMember _fixAccess(AnnotatedMember)>
	//    6   10:checkcast       #72  <Class AnnotatedWithParams>
	//    7   13:aastore         
	//    8   14:return          
	}

	protected void verifyNonDup(AnnotatedWithParams annotatedwithparams, int i, boolean flag)
	{
		boolean flag1;
		int j;
		AnnotatedWithParams annotatedwithparams1;
		flag1 = true;
	//    0    0:iconst_1        
	//    1    1:istore          4
		j = 1 << i;
	//    2    3:iconst_1        
	//    3    4:iload_2         
	//    4    5:ishl            
	//    5    6:istore          5
		_hasNonDefaultCreator = true;
	//    6    8:aload_0         
	//    7    9:iconst_1        
	//    8   10:putfield        #78  <Field boolean _hasNonDefaultCreator>
		annotatedwithparams1 = _creators[i];
	//    9   13:aload_0         
	//   10   14:getfield        #74  <Field AnnotatedWithParams[] _creators>
	//   11   17:iload_2         
	//   12   18:aaload          
	//   13   19:astore          6
		if(annotatedwithparams1 == null) goto _L2; else goto _L1
	//   14   21:aload           6
	//   15   23:ifnull          159
_L1:
		if((_explicitCreators & j) == 0) goto _L4; else goto _L3
	//   16   26:aload_0         
	//   17   27:getfield        #76  <Field int _explicitCreators>
	//   18   30:iload           5
	//   19   32:iand            
	//   20   33:ifeq            136
_L3:
		if(flag) goto _L6; else goto _L5
	//   21   36:iload_3         
	//   22   37:ifne            41
_L5:
		return;
	//   23   40:return          
_L6:
		flag1 = true;
	//   24   41:iconst_1        
	//   25   42:istore          4
_L8:
		Class class1;
		Class class2;
		if(!flag1 || ((Object) (annotatedwithparams1)).getClass() != ((Object) (annotatedwithparams)).getClass())
			break; /* Loop/switch isn't completed */
	//   26   44:iload           4
	//   27   46:ifeq            159
	//   28   49:aload           6
	//   29   51:invokevirtual   #288 <Method Class Object.getClass()>
	//   30   54:aload_1         
	//   31   55:invokevirtual   #288 <Method Class Object.getClass()>
	//   32   58:if_acmpne       159
		class1 = annotatedwithparams1.getRawParameterType(0);
	//   33   61:aload           6
	//   34   63:iconst_0        
	//   35   64:invokevirtual   #292 <Method Class AnnotatedWithParams.getRawParameterType(int)>
	//   36   67:astore          7
		class2 = annotatedwithparams.getRawParameterType(0);
	//   37   69:aload_1         
	//   38   70:iconst_0        
	//   39   71:invokevirtual   #292 <Method Class AnnotatedWithParams.getRawParameterType(int)>
	//   40   74:astore          8
		if(class1 == class2)
	//*  41   76:aload           7
	//*  42   78:aload           8
	//*  43   80:if_acmpne       149
			throw new IllegalArgumentException((new StringBuilder()).append("Conflicting ").append(TYPE_DESCS[i]).append(" creators: already had explicitly marked ").append(((Object) (annotatedwithparams1))).append(", encountered ").append(((Object) (annotatedwithparams))).toString());
	//   44   83:new             #187 <Class IllegalArgumentException>
	//   45   86:dup             
	//   46   87:new             #189 <Class StringBuilder>
	//   47   90:dup             
	//   48   91:invokespecial   #190 <Method void StringBuilder()>
	//   49   94:ldc2            #294 <String "Conflicting ">
	//   50   97:invokevirtual   #196 <Method StringBuilder StringBuilder.append(String)>
	//   51  100:getstatic       #65  <Field String[] TYPE_DESCS>
	//   52  103:iload_2         
	//   53  104:aaload          
	//   54  105:invokevirtual   #196 <Method StringBuilder StringBuilder.append(String)>
	//   55  108:ldc2            #296 <String " creators: already had explicitly marked ">
	//   56  111:invokevirtual   #196 <Method StringBuilder StringBuilder.append(String)>
	//   57  114:aload           6
	//   58  116:invokevirtual   #201 <Method StringBuilder StringBuilder.append(Object)>
	//   59  119:ldc2            #298 <String ", encountered ">
	//   60  122:invokevirtual   #196 <Method StringBuilder StringBuilder.append(String)>
	//   61  125:aload_1         
	//   62  126:invokevirtual   #201 <Method StringBuilder StringBuilder.append(Object)>
	//   63  129:invokevirtual   #211 <Method String StringBuilder.toString()>
	//   64  132:invokespecial   #214 <Method void IllegalArgumentException(String)>
	//   65  135:athrow          
		continue; /* Loop/switch isn't completed */
_L4:
		if(flag)
	//*  66  136:iload_3         
	//*  67  137:ifne            143
	//*  68  140:goto            44
			flag1 = false;
	//   69  143:iconst_0        
	//   70  144:istore          4
		if(true) goto _L8; else goto _L7
	//   71  146:goto            140
_L7:
		if(class2.isAssignableFrom(class1)) goto _L5; else goto _L2
	//   72  149:aload           8
	//   73  151:aload           7
	//   74  153:invokevirtual   #304 <Method boolean Class.isAssignableFrom(Class)>
	//   75  156:ifne            40
_L2:
		if(flag)
	//*  76  159:iload_3         
	//*  77  160:ifeq            174
			_explicitCreators = _explicitCreators | j;
	//   78  163:aload_0         
	//   79  164:aload_0         
	//   80  165:getfield        #76  <Field int _explicitCreators>
	//   81  168:iload           5
	//   82  170:ior             
	//   83  171:putfield        #76  <Field int _explicitCreators>
		_creators[i] = (AnnotatedWithParams)_fixAccess(((AnnotatedMember) (annotatedwithparams)));
	//   84  174:aload_0         
	//   85  175:getfield        #74  <Field AnnotatedWithParams[] _creators>
	//   86  178:iload_2         
	//   87  179:aload_0         
	//   88  180:aload_1         
	//   89  181:invokespecial   #285 <Method AnnotatedMember _fixAccess(AnnotatedMember)>
	//   90  184:checkcast       #72  <Class AnnotatedWithParams>
	//   91  187:aastore         
		return;
	//   92  188:return          
	}

	protected static final int C_ARRAY_DELEGATE = 8;
	protected static final int C_BOOLEAN = 5;
	protected static final int C_DEFAULT = 0;
	protected static final int C_DELEGATE = 6;
	protected static final int C_DOUBLE = 4;
	protected static final int C_INT = 2;
	protected static final int C_LONG = 3;
	protected static final int C_PROPS = 7;
	protected static final int C_STRING = 1;
	protected static final String TYPE_DESCS[] = {
		"default", "String", "int", "long", "double", "boolean", "delegate", "property-based"
	};
	protected SettableBeanProperty _arrayDelegateArgs[];
	protected final BeanDescription _beanDesc;
	protected final boolean _canFixAccess;
	protected final AnnotatedWithParams _creators[] = new AnnotatedWithParams[9];
	protected SettableBeanProperty _delegateArgs[];
	protected int _explicitCreators;
	protected final boolean _forceAccess;
	protected boolean _hasNonDefaultCreator;
	protected AnnotatedParameter _incompleteParameter;
	protected SettableBeanProperty _propertyBasedArgs[];

	static 
	{
	//    0    0:bipush          8
	//    1    2:anewarray       String[]
	//    2    5:dup             
	//    3    6:iconst_0        
	//    4    7:ldc1            #49  <String "default">
	//    5    9:aastore         
	//    6   10:dup             
	//    7   11:iconst_1        
	//    8   12:ldc1            #51  <String "String">
	//    9   14:aastore         
	//   10   15:dup             
	//   11   16:iconst_2        
	//   12   17:ldc1            #53  <String "int">
	//   13   19:aastore         
	//   14   20:dup             
	//   15   21:iconst_3        
	//   16   22:ldc1            #55  <String "long">
	//   17   24:aastore         
	//   18   25:dup             
	//   19   26:iconst_4        
	//   20   27:ldc1            #57  <String "double">
	//   21   29:aastore         
	//   22   30:dup             
	//   23   31:iconst_5        
	//   24   32:ldc1            #59  <String "boolean">
	//   25   34:aastore         
	//   26   35:dup             
	//   27   36:bipush          6
	//   28   38:ldc1            #61  <String "delegate">
	//   29   40:aastore         
	//   30   41:dup             
	//   31   42:bipush          7
	//   32   44:ldc1            #63  <String "property-based">
	//   33   46:aastore         
	//   34   47:putstatic       #65  <Field String[] TYPE_DESCS>
	//*  35   50:return          
	}
}
