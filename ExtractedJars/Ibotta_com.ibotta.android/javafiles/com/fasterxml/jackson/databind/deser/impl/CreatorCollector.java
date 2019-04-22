// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.deser.std.StdValueInstantiator;
import com.fasterxml.jackson.databind.introspect.*;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.io.Serializable;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Member;
import java.util.*;

public class CreatorCollector
{
	protected static final class StdTypeConstructor extends AnnotatedWithParams
		implements Serializable
	{

		public static AnnotatedWithParams tryToOptimize(AnnotatedWithParams annotatedwithparams)
		{
			if(annotatedwithparams != null)
		//*   0    0:aload_0         
		//*   1    1:ifnull          66
			{
				Class class1 = annotatedwithparams.getDeclaringClass();
		//    2    4:aload_0         
		//    3    5:invokevirtual   #33  <Method Class AnnotatedWithParams.getDeclaringClass()>
		//    4    8:astore_1        
				if(class1 != java/util/List && class1 != java/util/ArrayList)
		//*   5    9:aload_1         
		//*   6   10:ldc1            #35  <Class List>
		//*   7   12:if_acmpeq       56
		//*   8   15:aload_1         
		//*   9   16:ldc1            #37  <Class ArrayList>
		//*  10   18:if_acmpne       24
		//*  11   21:goto            56
				{
					if(class1 == java/util/LinkedHashMap)
		//*  12   24:aload_1         
		//*  13   25:ldc1            #39  <Class LinkedHashMap>
		//*  14   27:if_acmpne       40
						return ((AnnotatedWithParams) (new StdTypeConstructor(annotatedwithparams, 3)));
		//   15   30:new             #2   <Class CreatorCollector$StdTypeConstructor>
		//   16   33:dup             
		//   17   34:aload_0         
		//   18   35:iconst_3        
		//   19   36:invokespecial   #41  <Method void CreatorCollector$StdTypeConstructor(AnnotatedWithParams, int)>
		//   20   39:areturn         
					if(class1 == java/util/HashMap)
		//*  21   40:aload_1         
		//*  22   41:ldc1            #43  <Class HashMap>
		//*  23   43:if_acmpne       66
						return ((AnnotatedWithParams) (new StdTypeConstructor(annotatedwithparams, 2)));
		//   24   46:new             #2   <Class CreatorCollector$StdTypeConstructor>
		//   25   49:dup             
		//   26   50:aload_0         
		//   27   51:iconst_2        
		//   28   52:invokespecial   #41  <Method void CreatorCollector$StdTypeConstructor(AnnotatedWithParams, int)>
		//   29   55:areturn         
				} else
				{
					return ((AnnotatedWithParams) (new StdTypeConstructor(annotatedwithparams, 1)));
		//   30   56:new             #2   <Class CreatorCollector$StdTypeConstructor>
		//   31   59:dup             
		//   32   60:aload_0         
		//   33   61:iconst_1        
		//   34   62:invokespecial   #41  <Method void CreatorCollector$StdTypeConstructor(AnnotatedWithParams, int)>
		//   35   65:areturn         
				}
			}
			return annotatedwithparams;
		//   36   66:aload_0         
		//   37   67:areturn         
		}

		protected final Object _construct()
		{
			switch(_type)
		//*   0    0:aload_0         
		//*   1    1:getfield        #26  <Field int _type>
			{
		//*   2    4:tableswitch     1 3: default 32
		//		               1 84
		//		               2 76
		//		               3 68
			default:
				StringBuilder stringbuilder = new StringBuilder();
		//    3   32:new             #47  <Class StringBuilder>
		//    4   35:dup             
		//    5   36:invokespecial   #50  <Method void StringBuilder()>
		//    6   39:astore_1        
				stringbuilder.append("Unknown type ");
		//    7   40:aload_1         
		//    8   41:ldc1            #52  <String "Unknown type ">
		//    9   43:invokevirtual   #56  <Method StringBuilder StringBuilder.append(String)>
		//   10   46:pop             
				stringbuilder.append(_type);
		//   11   47:aload_1         
		//   12   48:aload_0         
		//   13   49:getfield        #26  <Field int _type>
		//   14   52:invokevirtual   #59  <Method StringBuilder StringBuilder.append(int)>
		//   15   55:pop             
				throw new IllegalStateException(stringbuilder.toString());
		//   16   56:new             #61  <Class IllegalStateException>
		//   17   59:dup             
		//   18   60:aload_1         
		//   19   61:invokevirtual   #65  <Method String StringBuilder.toString()>
		//   20   64:invokespecial   #68  <Method void IllegalStateException(String)>
		//   21   67:athrow          

			case 3: // '\003'
				return ((Object) (new LinkedHashMap()));
		//   22   68:new             #39  <Class LinkedHashMap>
		//   23   71:dup             
		//   24   72:invokespecial   #69  <Method void LinkedHashMap()>
		//   25   75:areturn         

			case 2: // '\002'
				return ((Object) (new HashMap()));
		//   26   76:new             #43  <Class HashMap>
		//   27   79:dup             
		//   28   80:invokespecial   #70  <Method void HashMap()>
		//   29   83:areturn         

			case 1: // '\001'
				return ((Object) (new ArrayList()));
		//   30   84:new             #37  <Class ArrayList>
		//   31   87:dup             
		//   32   88:invokespecial   #71  <Method void ArrayList()>
		//   33   91:areturn         
			}
		}

		public Object call()
			throws Exception
		{
			return _construct();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #76  <Method Object _construct()>
		//    2    4:areturn         
		}

		public Object call(Object aobj[])
			throws Exception
		{
			return _construct();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #76  <Method Object _construct()>
		//    2    4:areturn         
		}

		public Object call1(Object obj)
			throws Exception
		{
			return _construct();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #76  <Method Object _construct()>
		//    2    4:areturn         
		}

		public boolean equals(Object obj)
		{
			return obj == this;
		//    0    0:aload_1         
		//    1    1:aload_0         
		//    2    2:if_acmpne       7
		//    3    5:iconst_1        
		//    4    6:ireturn         
		//    5    7:iconst_0        
		//    6    8:ireturn         
		}

		public AnnotatedElement getAnnotated()
		{
			return _base.getAnnotated();
		//    0    0:aload_0         
		//    1    1:getfield        #24  <Field AnnotatedWithParams _base>
		//    2    4:invokevirtual   #86  <Method AnnotatedElement AnnotatedWithParams.getAnnotated()>
		//    3    7:areturn         
		}

		public Class getDeclaringClass()
		{
			return _base.getDeclaringClass();
		//    0    0:aload_0         
		//    1    1:getfield        #24  <Field AnnotatedWithParams _base>
		//    2    4:invokevirtual   #33  <Method Class AnnotatedWithParams.getDeclaringClass()>
		//    3    7:areturn         
		}

		public Member getMember()
		{
			return _base.getMember();
		//    0    0:aload_0         
		//    1    1:getfield        #24  <Field AnnotatedWithParams _base>
		//    2    4:invokevirtual   #92  <Method Member AnnotatedWithParams.getMember()>
		//    3    7:areturn         
		}

		public String getName()
		{
			return _base.getName();
		//    0    0:aload_0         
		//    1    1:getfield        #24  <Field AnnotatedWithParams _base>
		//    2    4:invokevirtual   #95  <Method String AnnotatedWithParams.getName()>
		//    3    7:areturn         
		}

		public int getParameterCount()
		{
			return _base.getParameterCount();
		//    0    0:aload_0         
		//    1    1:getfield        #24  <Field AnnotatedWithParams _base>
		//    2    4:invokevirtual   #99  <Method int AnnotatedWithParams.getParameterCount()>
		//    3    7:ireturn         
		}

		public JavaType getParameterType(int i)
		{
			return _base.getParameterType(i);
		//    0    0:aload_0         
		//    1    1:getfield        #24  <Field AnnotatedWithParams _base>
		//    2    4:iload_1         
		//    3    5:invokevirtual   #103 <Method JavaType AnnotatedWithParams.getParameterType(int)>
		//    4    8:areturn         
		}

		public Class getRawParameterType(int i)
		{
			return _base.getRawParameterType(i);
		//    0    0:aload_0         
		//    1    1:getfield        #24  <Field AnnotatedWithParams _base>
		//    2    4:iload_1         
		//    3    5:invokevirtual   #107 <Method Class AnnotatedWithParams.getRawParameterType(int)>
		//    4    8:areturn         
		}

		public Class getRawType()
		{
			return _base.getRawType();
		//    0    0:aload_0         
		//    1    1:getfield        #24  <Field AnnotatedWithParams _base>
		//    2    4:invokevirtual   #111 <Method Class AnnotatedWithParams.getRawType()>
		//    3    7:areturn         
		}

		public JavaType getType()
		{
			return _base.getType();
		//    0    0:aload_0         
		//    1    1:getfield        #24  <Field AnnotatedWithParams _base>
		//    2    4:invokevirtual   #115 <Method JavaType AnnotatedWithParams.getType()>
		//    3    7:areturn         
		}

		public Object getValue(Object obj)
			throws UnsupportedOperationException, IllegalArgumentException
		{
			throw new UnsupportedOperationException();
		//    0    0:new             #118 <Class UnsupportedOperationException>
		//    1    3:dup             
		//    2    4:invokespecial   #121 <Method void UnsupportedOperationException()>
		//    3    7:athrow          
		}

		public int hashCode()
		{
			return _base.hashCode();
		//    0    0:aload_0         
		//    1    1:getfield        #24  <Field AnnotatedWithParams _base>
		//    2    4:invokevirtual   #124 <Method int AnnotatedWithParams.hashCode()>
		//    3    7:ireturn         
		}

		public void setValue(Object obj, Object obj1)
			throws UnsupportedOperationException, IllegalArgumentException
		{
			throw new UnsupportedOperationException();
		//    0    0:new             #118 <Class UnsupportedOperationException>
		//    1    3:dup             
		//    2    4:invokespecial   #121 <Method void UnsupportedOperationException()>
		//    3    7:athrow          
		}

		public String toString()
		{
			return _base.toString();
		//    0    0:aload_0         
		//    1    1:getfield        #24  <Field AnnotatedWithParams _base>
		//    2    4:invokevirtual   #127 <Method String AnnotatedWithParams.toString()>
		//    3    7:areturn         
		}

		public Annotated withAnnotations(AnnotationMap annotationmap)
		{
			throw new UnsupportedOperationException();
		//    0    0:new             #118 <Class UnsupportedOperationException>
		//    1    3:dup             
		//    2    4:invokespecial   #121 <Method void UnsupportedOperationException()>
		//    3    7:athrow          
		}

		private static final long serialVersionUID = 1L;
		private final AnnotatedWithParams _base;
		private final int _type;

		public StdTypeConstructor(AnnotatedWithParams annotatedwithparams, int i)
		{
			super(annotatedwithparams, ((AnnotationMap []) (null)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aconst_null     
		//    3    3:invokespecial   #22  <Method void AnnotatedWithParams(AnnotatedWithParams, AnnotationMap[])>
			_base = annotatedwithparams;
		//    4    6:aload_0         
		//    5    7:aload_1         
		//    6    8:putfield        #24  <Field AnnotatedWithParams _base>
			_type = i;
		//    7   11:aload_0         
		//    8   12:iload_2         
		//    9   13:putfield        #26  <Field int _type>
		//   10   16:return          
		}
	}


	public CreatorCollector(BeanDescription beandescription, MapperConfig mapperconfig)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #52  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:bipush          9
	//    4    7:anewarray       AnnotatedWithParams[]
	//    5   10:putfield        #56  <Field AnnotatedWithParams[] _creators>
		_explicitCreators = 0;
	//    6   13:aload_0         
	//    7   14:iconst_0        
	//    8   15:putfield        #58  <Field int _explicitCreators>
		_hasNonDefaultCreator = false;
	//    9   18:aload_0         
	//   10   19:iconst_0        
	//   11   20:putfield        #60  <Field boolean _hasNonDefaultCreator>
		_beanDesc = beandescription;
	//   12   23:aload_0         
	//   13   24:aload_1         
	//   14   25:putfield        #62  <Field BeanDescription _beanDesc>
		_canFixAccess = mapperconfig.canOverrideAccessModifiers();
	//   15   28:aload_0         
	//   16   29:aload_2         
	//   17   30:invokevirtual   #68  <Method boolean MapperConfig.canOverrideAccessModifiers()>
	//   18   33:putfield        #70  <Field boolean _canFixAccess>
		_forceAccess = mapperconfig.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS);
	//   19   36:aload_0         
	//   20   37:aload_2         
	//   21   38:getstatic       #76  <Field MapperFeature MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS>
	//   22   41:invokevirtual   #80  <Method boolean MapperConfig.isEnabled(MapperFeature)>
	//   23   44:putfield        #82  <Field boolean _forceAccess>
	//   24   47:return          
	}

	private JavaType _computeDelegateType(AnnotatedWithParams annotatedwithparams, SettableBeanProperty asettablebeanproperty[])
	{
		if(_hasNonDefaultCreator && annotatedwithparams != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #60  <Field boolean _hasNonDefaultCreator>
	//*   2    4:ifeq            67
	//*   3    7:aload_1         
	//*   4    8:ifnonnull       14
	//*   5   11:goto            67
		{
			boolean flag = false;
	//    6   14:iconst_0        
	//    7   15:istore          5
			int j = ((int) (flag));
	//    8   17:iload           5
	//    9   19:istore          4
			if(asettablebeanproperty != null)
	//*  10   21:aload_2         
	//*  11   22:ifnull          60
			{
				int k = asettablebeanproperty.length;
	//   12   25:aload_2         
	//   13   26:arraylength     
	//   14   27:istore          6
				int i = 0;
	//   15   29:iconst_0        
	//   16   30:istore_3        
				do
				{
					j = ((int) (flag));
	//   17   31:iload           5
	//   18   33:istore          4
					if(i >= k)
						break;
	//   19   35:iload_3         
	//   20   36:iload           6
	//   21   38:icmpge          60
					if(asettablebeanproperty[i] == null)
	//*  22   41:aload_2         
	//*  23   42:iload_3         
	//*  24   43:aaload          
	//*  25   44:ifnonnull       53
					{
						j = i;
	//   26   47:iload_3         
	//   27   48:istore          4
						break;
	//   28   50:goto            60
					}
					i++;
	//   29   53:iload_3         
	//   30   54:iconst_1        
	//   31   55:iadd            
	//   32   56:istore_3        
				} while(true);
	//   33   57:goto            31
			}
			return annotatedwithparams.getParameterType(j);
	//   34   60:aload_1         
	//   35   61:iload           4
	//   36   63:invokevirtual   #90  <Method JavaType AnnotatedWithParams.getParameterType(int)>
	//   37   66:areturn         
		} else
		{
			return null;
	//   38   67:aconst_null     
	//   39   68:areturn         
		}
	}

	private AnnotatedMember _fixAccess(AnnotatedMember annotatedmember)
	{
		if(annotatedmember != null && _canFixAccess)
	//*   0    0:aload_1         
	//*   1    1:ifnull          25
	//*   2    4:aload_0         
	//*   3    5:getfield        #70  <Field boolean _canFixAccess>
	//*   4    8:ifeq            25
			ClassUtil.checkAndFixAccess((Member)annotatedmember.getAnnotated(), _forceAccess);
	//    5   11:aload_1         
	//    6   12:invokevirtual   #98  <Method AnnotatedElement AnnotatedMember.getAnnotated()>
	//    7   15:checkcast       #100 <Class Member>
	//    8   18:aload_0         
	//    9   19:getfield        #82  <Field boolean _forceAccess>
	//   10   22:invokestatic    #106 <Method void ClassUtil.checkAndFixAccess(Member, boolean)>
		return annotatedmember;
	//   11   25:aload_1         
	//   12   26:areturn         
	}

	protected boolean _isEnumValueOf(AnnotatedWithParams annotatedwithparams)
	{
		return annotatedwithparams.getDeclaringClass().isEnum() && "valueOf".equals(((Object) (annotatedwithparams.getName())));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #113 <Method Class AnnotatedWithParams.getDeclaringClass()>
	//    2    4:invokevirtual   #118 <Method boolean Class.isEnum()>
	//    3    7:ifeq            24
	//    4   10:ldc1            #120 <String "valueOf">
	//    5   12:aload_1         
	//    6   13:invokevirtual   #124 <Method String AnnotatedWithParams.getName()>
	//    7   16:invokevirtual   #128 <Method boolean String.equals(Object)>
	//    8   19:ifeq            24
	//    9   22:iconst_1        
	//   10   23:ireturn         
	//   11   24:iconst_0        
	//   12   25:ireturn         
	}

	public void addBooleanCreator(AnnotatedWithParams annotatedwithparams, boolean flag)
	{
		verifyNonDup(annotatedwithparams, 5, flag);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_5        
	//    3    3:iload_2         
	//    4    4:invokevirtual   #134 <Method boolean verifyNonDup(AnnotatedWithParams, int, boolean)>
	//    5    7:pop             
	//    6    8:return          
	}

	public void addDelegatingCreator(AnnotatedWithParams annotatedwithparams, boolean flag, SettableBeanProperty asettablebeanproperty[], int i)
	{
		if(annotatedwithparams.getParameterType(i).isCollectionLikeType())
	//*   0    0:aload_1         
	//*   1    1:iload           4
	//*   2    3:invokevirtual   #90  <Method JavaType AnnotatedWithParams.getParameterType(int)>
	//*   3    6:invokevirtual   #141 <Method boolean JavaType.isCollectionLikeType()>
	//*   4    9:ifeq            29
		{
			if(verifyNonDup(annotatedwithparams, 8, flag))
	//*   5   12:aload_0         
	//*   6   13:aload_1         
	//*   7   14:bipush          8
	//*   8   16:iload_2         
	//*   9   17:invokevirtual   #134 <Method boolean verifyNonDup(AnnotatedWithParams, int, boolean)>
	//*  10   20:ifeq            45
			{
				_arrayDelegateArgs = asettablebeanproperty;
	//   11   23:aload_0         
	//   12   24:aload_3         
	//   13   25:putfield        #143 <Field SettableBeanProperty[] _arrayDelegateArgs>
				return;
	//   14   28:return          
			}
		} else
		if(verifyNonDup(annotatedwithparams, 6, flag))
	//*  15   29:aload_0         
	//*  16   30:aload_1         
	//*  17   31:bipush          6
	//*  18   33:iload_2         
	//*  19   34:invokevirtual   #134 <Method boolean verifyNonDup(AnnotatedWithParams, int, boolean)>
	//*  20   37:ifeq            45
			_delegateArgs = asettablebeanproperty;
	//   21   40:aload_0         
	//   22   41:aload_3         
	//   23   42:putfield        #145 <Field SettableBeanProperty[] _delegateArgs>
	//   24   45:return          
	}

	public void addDoubleCreator(AnnotatedWithParams annotatedwithparams, boolean flag)
	{
		verifyNonDup(annotatedwithparams, 4, flag);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_4        
	//    3    3:iload_2         
	//    4    4:invokevirtual   #134 <Method boolean verifyNonDup(AnnotatedWithParams, int, boolean)>
	//    5    7:pop             
	//    6    8:return          
	}

	public void addIntCreator(AnnotatedWithParams annotatedwithparams, boolean flag)
	{
		verifyNonDup(annotatedwithparams, 2, flag);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_2        
	//    3    3:iload_2         
	//    4    4:invokevirtual   #134 <Method boolean verifyNonDup(AnnotatedWithParams, int, boolean)>
	//    5    7:pop             
	//    6    8:return          
	}

	public void addLongCreator(AnnotatedWithParams annotatedwithparams, boolean flag)
	{
		verifyNonDup(annotatedwithparams, 3, flag);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_3        
	//    3    3:iload_2         
	//    4    4:invokevirtual   #134 <Method boolean verifyNonDup(AnnotatedWithParams, int, boolean)>
	//    5    7:pop             
	//    6    8:return          
	}

	public void addPropertyCreator(AnnotatedWithParams annotatedwithparams, boolean flag, SettableBeanProperty asettablebeanproperty[])
	{
label0:
		{
label1:
			{
				if(!verifyNonDup(annotatedwithparams, 7, flag))
					break label0;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:bipush          7
	//    3    4:iload_2         
	//    4    5:invokevirtual   #134 <Method boolean verifyNonDup(AnnotatedWithParams, int, boolean)>
	//    5    8:ifeq            139
				if(asettablebeanproperty.length <= 1)
					break label1;
	//    6   11:aload_3         
	//    7   12:arraylength     
	//    8   13:iconst_1        
	//    9   14:icmple          134
				annotatedwithparams = ((AnnotatedWithParams) (new HashMap()));
	//   10   17:new             #152 <Class HashMap>
	//   11   20:dup             
	//   12   21:invokespecial   #153 <Method void HashMap()>
	//   13   24:astore_1        
				int j = asettablebeanproperty.length;
	//   14   25:aload_3         
	//   15   26:arraylength     
	//   16   27:istore          5
				int i = 0;
	//   17   29:iconst_0        
	//   18   30:istore          4
				String s;
				Integer integer;
				do
				{
					if(i >= j)
						break label1;
	//   19   32:iload           4
	//   20   34:iload           5
	//   21   36:icmpge          134
					s = asettablebeanproperty[i].getName();
	//   22   39:aload_3         
	//   23   40:iload           4
	//   24   42:aaload          
	//   25   43:invokevirtual   #156 <Method String SettableBeanProperty.getName()>
	//   26   46:astore          6
					if(!s.isEmpty() || asettablebeanproperty[i].getInjectableValueId() == null)
	//*  27   48:aload           6
	//*  28   50:invokevirtual   #159 <Method boolean String.isEmpty()>
	//*  29   53:ifeq            69
	//*  30   56:aload_3         
	//*  31   57:iload           4
	//*  32   59:aaload          
	//*  33   60:invokevirtual   #163 <Method Object SettableBeanProperty.getInjectableValueId()>
	//*  34   63:ifnull          69
	//*  35   66:goto            90
					{
						integer = (Integer)((HashMap) (annotatedwithparams)).put(((Object) (s)), ((Object) (Integer.valueOf(i))));
	//   36   69:aload_1         
	//   37   70:aload           6
	//   38   72:iload           4
	//   39   74:invokestatic    #168 <Method Integer Integer.valueOf(int)>
	//   40   77:invokevirtual   #172 <Method Object HashMap.put(Object, Object)>
	//   41   80:checkcast       #165 <Class Integer>
	//   42   83:astore          7
						if(integer != null)
							break;
	//   43   85:aload           7
	//   44   87:ifnonnull       99
					}
					i++;
	//   45   90:iload           4
	//   46   92:iconst_1        
	//   47   93:iadd            
	//   48   94:istore          4
				} while(true);
	//   49   96:goto            32
				throw new IllegalArgumentException(String.format("Duplicate creator property \"%s\" (index %s vs %d)", new Object[] {
					s, integer, Integer.valueOf(i)
				}));
	//   50   99:new             #174 <Class IllegalArgumentException>
	//   51  102:dup             
	//   52  103:ldc1            #176 <String "Duplicate creator property \"%s\" (index %s vs %d)">
	//   53  105:iconst_3        
	//   54  106:anewarray       Object[]
	//   55  109:dup             
	//   56  110:iconst_0        
	//   57  111:aload           6
	//   58  113:aastore         
	//   59  114:dup             
	//   60  115:iconst_1        
	//   61  116:aload           7
	//   62  118:aastore         
	//   63  119:dup             
	//   64  120:iconst_2        
	//   65  121:iload           4
	//   66  123:invokestatic    #168 <Method Integer Integer.valueOf(int)>
	//   67  126:aastore         
	//   68  127:invokestatic    #180 <Method String String.format(String, Object[])>
	//   69  130:invokespecial   #183 <Method void IllegalArgumentException(String)>
	//   70  133:athrow          
			}
			_propertyBasedArgs = asettablebeanproperty;
	//   71  134:aload_0         
	//   72  135:aload_3         
	//   73  136:putfield        #185 <Field SettableBeanProperty[] _propertyBasedArgs>
		}
	//   74  139:return          
	}

	public void addStringCreator(AnnotatedWithParams annotatedwithparams, boolean flag)
	{
		verifyNonDup(annotatedwithparams, 1, flag);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_1        
	//    3    3:iload_2         
	//    4    4:invokevirtual   #134 <Method boolean verifyNonDup(AnnotatedWithParams, int, boolean)>
	//    5    7:pop             
	//    6    8:return          
	}

	public ValueInstantiator constructValueInstantiator(DeserializationConfig deserializationconfig)
	{
		JavaType javatype = _computeDelegateType(_creators[6], _delegateArgs);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #56  <Field AnnotatedWithParams[] _creators>
	//    3    5:bipush          6
	//    4    7:aaload          
	//    5    8:aload_0         
	//    6    9:getfield        #145 <Field SettableBeanProperty[] _delegateArgs>
	//    7   12:invokespecial   #190 <Method JavaType _computeDelegateType(AnnotatedWithParams, SettableBeanProperty[])>
	//    8   15:astore_2        
		JavaType javatype1 = _computeDelegateType(_creators[8], _arrayDelegateArgs);
	//    9   16:aload_0         
	//   10   17:aload_0         
	//   11   18:getfield        #56  <Field AnnotatedWithParams[] _creators>
	//   12   21:bipush          8
	//   13   23:aaload          
	//   14   24:aload_0         
	//   15   25:getfield        #143 <Field SettableBeanProperty[] _arrayDelegateArgs>
	//   16   28:invokespecial   #190 <Method JavaType _computeDelegateType(AnnotatedWithParams, SettableBeanProperty[])>
	//   17   31:astore_3        
		JavaType javatype2 = _beanDesc.getType();
	//   18   32:aload_0         
	//   19   33:getfield        #62  <Field BeanDescription _beanDesc>
	//   20   36:invokevirtual   #196 <Method JavaType BeanDescription.getType()>
	//   21   39:astore          5
		AnnotatedWithParams annotatedwithparams = StdTypeConstructor.tryToOptimize(_creators[0]);
	//   22   41:aload_0         
	//   23   42:getfield        #56  <Field AnnotatedWithParams[] _creators>
	//   24   45:iconst_0        
	//   25   46:aaload          
	//   26   47:invokestatic    #200 <Method AnnotatedWithParams CreatorCollector$StdTypeConstructor.tryToOptimize(AnnotatedWithParams)>
	//   27   50:astore          4
		deserializationconfig = ((DeserializationConfig) (new StdValueInstantiator(deserializationconfig, javatype2)));
	//   28   52:new             #202 <Class StdValueInstantiator>
	//   29   55:dup             
	//   30   56:aload_1         
	//   31   57:aload           5
	//   32   59:invokespecial   #205 <Method void StdValueInstantiator(DeserializationConfig, JavaType)>
	//   33   62:astore_1        
		AnnotatedWithParams aannotatedwithparams[] = _creators;
	//   34   63:aload_0         
	//   35   64:getfield        #56  <Field AnnotatedWithParams[] _creators>
	//   36   67:astore          5
		((StdValueInstantiator) (deserializationconfig)).configureFromObjectSettings(annotatedwithparams, aannotatedwithparams[6], javatype, _delegateArgs, aannotatedwithparams[7], _propertyBasedArgs);
	//   37   69:aload_1         
	//   38   70:aload           4
	//   39   72:aload           5
	//   40   74:bipush          6
	//   41   76:aaload          
	//   42   77:aload_2         
	//   43   78:aload_0         
	//   44   79:getfield        #145 <Field SettableBeanProperty[] _delegateArgs>
	//   45   82:aload           5
	//   46   84:bipush          7
	//   47   86:aaload          
	//   48   87:aload_0         
	//   49   88:getfield        #185 <Field SettableBeanProperty[] _propertyBasedArgs>
	//   50   91:invokevirtual   #209 <Method void StdValueInstantiator.configureFromObjectSettings(AnnotatedWithParams, AnnotatedWithParams, JavaType, SettableBeanProperty[], AnnotatedWithParams, SettableBeanProperty[])>
		((StdValueInstantiator) (deserializationconfig)).configureFromArraySettings(_creators[8], javatype1, _arrayDelegateArgs);
	//   51   94:aload_1         
	//   52   95:aload_0         
	//   53   96:getfield        #56  <Field AnnotatedWithParams[] _creators>
	//   54   99:bipush          8
	//   55  101:aaload          
	//   56  102:aload_3         
	//   57  103:aload_0         
	//   58  104:getfield        #143 <Field SettableBeanProperty[] _arrayDelegateArgs>
	//   59  107:invokevirtual   #213 <Method void StdValueInstantiator.configureFromArraySettings(AnnotatedWithParams, JavaType, SettableBeanProperty[])>
		((StdValueInstantiator) (deserializationconfig)).configureFromStringCreator(_creators[1]);
	//   60  110:aload_1         
	//   61  111:aload_0         
	//   62  112:getfield        #56  <Field AnnotatedWithParams[] _creators>
	//   63  115:iconst_1        
	//   64  116:aaload          
	//   65  117:invokevirtual   #217 <Method void StdValueInstantiator.configureFromStringCreator(AnnotatedWithParams)>
		((StdValueInstantiator) (deserializationconfig)).configureFromIntCreator(_creators[2]);
	//   66  120:aload_1         
	//   67  121:aload_0         
	//   68  122:getfield        #56  <Field AnnotatedWithParams[] _creators>
	//   69  125:iconst_2        
	//   70  126:aaload          
	//   71  127:invokevirtual   #220 <Method void StdValueInstantiator.configureFromIntCreator(AnnotatedWithParams)>
		((StdValueInstantiator) (deserializationconfig)).configureFromLongCreator(_creators[3]);
	//   72  130:aload_1         
	//   73  131:aload_0         
	//   74  132:getfield        #56  <Field AnnotatedWithParams[] _creators>
	//   75  135:iconst_3        
	//   76  136:aaload          
	//   77  137:invokevirtual   #223 <Method void StdValueInstantiator.configureFromLongCreator(AnnotatedWithParams)>
		((StdValueInstantiator) (deserializationconfig)).configureFromDoubleCreator(_creators[4]);
	//   78  140:aload_1         
	//   79  141:aload_0         
	//   80  142:getfield        #56  <Field AnnotatedWithParams[] _creators>
	//   81  145:iconst_4        
	//   82  146:aaload          
	//   83  147:invokevirtual   #226 <Method void StdValueInstantiator.configureFromDoubleCreator(AnnotatedWithParams)>
		((StdValueInstantiator) (deserializationconfig)).configureFromBooleanCreator(_creators[5]);
	//   84  150:aload_1         
	//   85  151:aload_0         
	//   86  152:getfield        #56  <Field AnnotatedWithParams[] _creators>
	//   87  155:iconst_5        
	//   88  156:aaload          
	//   89  157:invokevirtual   #229 <Method void StdValueInstantiator.configureFromBooleanCreator(AnnotatedWithParams)>
		((StdValueInstantiator) (deserializationconfig)).configureIncompleteParameter(_incompleteParameter);
	//   90  160:aload_1         
	//   91  161:aload_0         
	//   92  162:getfield        #231 <Field AnnotatedParameter _incompleteParameter>
	//   93  165:invokevirtual   #235 <Method void StdValueInstantiator.configureIncompleteParameter(AnnotatedParameter)>
		return ((ValueInstantiator) (deserializationconfig));
	//   94  168:aload_1         
	//   95  169:areturn         
	}

	public boolean hasDefaultCreator()
	{
		AnnotatedWithParams aannotatedwithparams[] = _creators;
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field AnnotatedWithParams[] _creators>
	//    2    4:astore_2        
		boolean flag = false;
	//    3    5:iconst_0        
	//    4    6:istore_1        
		if(aannotatedwithparams[0] != null)
	//*   5    7:aload_2         
	//*   6    8:iconst_0        
	//*   7    9:aaload          
	//*   8   10:ifnull          15
			flag = true;
	//    9   13:iconst_1        
	//   10   14:istore_1        
		return flag;
	//   11   15:iload_1         
	//   12   16:ireturn         
	}

	public boolean hasDelegatingCreator()
	{
		return _creators[6] != null;
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field AnnotatedWithParams[] _creators>
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
	//    1    1:getfield        #56  <Field AnnotatedWithParams[] _creators>
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
	//    1    1:getfield        #56  <Field AnnotatedWithParams[] _creators>
	//    2    4:iconst_0        
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokespecial   #241 <Method AnnotatedMember _fixAccess(AnnotatedMember)>
	//    6   10:checkcast       #54  <Class AnnotatedWithParams>
	//    7   13:aastore         
	//    8   14:return          
	}

	protected boolean verifyNonDup(AnnotatedWithParams annotatedwithparams, int i, boolean flag)
	{
		int j = 1 << i;
	//    0    0:iconst_1        
	//    1    1:iload_2         
	//    2    2:ishl            
	//    3    3:istore          5
		_hasNonDefaultCreator = true;
	//    4    5:aload_0         
	//    5    6:iconst_1        
	//    6    7:putfield        #60  <Field boolean _hasNonDefaultCreator>
		AnnotatedWithParams annotatedwithparams1 = _creators[i];
	//    7   10:aload_0         
	//    8   11:getfield        #56  <Field AnnotatedWithParams[] _creators>
	//    9   14:iload_2         
	//   10   15:aaload          
	//   11   16:astore          7
		if(annotatedwithparams1 != null)
	//*  12   18:aload           7
	//*  13   20:ifnull          182
		{
			boolean flag1;
			if((_explicitCreators & j) != 0)
	//*  14   23:aload_0         
	//*  15   24:getfield        #58  <Field int _explicitCreators>
	//*  16   27:iload           5
	//*  17   29:iand            
	//*  18   30:ifeq            45
			{
				if(!flag)
	//*  19   33:iload_3         
	//*  20   34:ifne            39
					return false;
	//   21   37:iconst_0        
	//   22   38:ireturn         
				flag1 = true;
	//   23   39:iconst_1        
	//   24   40:istore          4
			} else
	//*  25   42:goto            50
			{
				flag1 = flag ^ true;
	//   26   45:iload_3         
	//   27   46:iconst_1        
	//   28   47:ixor            
	//   29   48:istore          4
			}
			if(flag1 && ((Object) (annotatedwithparams1)).getClass() == ((Object) (annotatedwithparams)).getClass())
	//*  30   50:iload           4
	//*  31   52:ifeq            182
	//*  32   55:aload           7
	//*  33   57:invokevirtual   #244 <Method Class Object.getClass()>
	//*  34   60:aload_1         
	//*  35   61:invokevirtual   #244 <Method Class Object.getClass()>
	//*  36   64:if_acmpne       182
			{
				Object obj = ((Object) (annotatedwithparams1.getRawParameterType(0)));
	//   37   67:aload           7
	//   38   69:iconst_0        
	//   39   70:invokevirtual   #248 <Method Class AnnotatedWithParams.getRawParameterType(int)>
	//   40   73:astore          6
				Object obj1 = ((Object) (annotatedwithparams.getRawParameterType(0)));
	//   41   75:aload_1         
	//   42   76:iconst_0        
	//   43   77:invokevirtual   #248 <Method Class AnnotatedWithParams.getRawParameterType(int)>
	//   44   80:astore          8
				if(obj == obj1)
	//*  45   82:aload           6
	//*  46   84:aload           8
	//*  47   86:if_acmpne       170
				{
					if(_isEnumValueOf(annotatedwithparams))
	//*  48   89:aload_0         
	//*  49   90:aload_1         
	//*  50   91:invokevirtual   #250 <Method boolean _isEnumValueOf(AnnotatedWithParams)>
	//*  51   94:ifeq            99
						return false;
	//   52   97:iconst_0        
	//   53   98:ireturn         
					if(!_isEnumValueOf(annotatedwithparams1))
	//*  54   99:aload_0         
	//*  55  100:aload           7
	//*  56  102:invokevirtual   #250 <Method boolean _isEnumValueOf(AnnotatedWithParams)>
	//*  57  105:ifeq            111
	//*  58  108:goto            182
					{
						obj1 = ((Object) (TYPE_DESCS[i]));
	//   59  111:getstatic       #47  <Field String[] TYPE_DESCS>
	//   60  114:iload_2         
	//   61  115:aaload          
	//   62  116:astore          8
						if(flag)
	//*  63  118:iload_3         
	//*  64  119:ifeq            129
							obj = "explicitly marked";
	//   65  122:ldc1            #252 <String "explicitly marked">
	//   66  124:astore          6
						else
	//*  67  126:goto            133
							obj = "implicitly discovered";
	//   68  129:ldc1            #254 <String "implicitly discovered">
	//   69  131:astore          6
						throw new IllegalArgumentException(String.format("Conflicting %s creators: already had %s creator %s, encountered another: %s", new Object[] {
							obj1, obj, annotatedwithparams1, annotatedwithparams
						}));
	//   70  133:new             #174 <Class IllegalArgumentException>
	//   71  136:dup             
	//   72  137:ldc2            #256 <String "Conflicting %s creators: already had %s creator %s, encountered another: %s">
	//   73  140:iconst_4        
	//   74  141:anewarray       Object[]
	//   75  144:dup             
	//   76  145:iconst_0        
	//   77  146:aload           8
	//   78  148:aastore         
	//   79  149:dup             
	//   80  150:iconst_1        
	//   81  151:aload           6
	//   82  153:aastore         
	//   83  154:dup             
	//   84  155:iconst_2        
	//   85  156:aload           7
	//   86  158:aastore         
	//   87  159:dup             
	//   88  160:iconst_3        
	//   89  161:aload_1         
	//   90  162:aastore         
	//   91  163:invokestatic    #180 <Method String String.format(String, Object[])>
	//   92  166:invokespecial   #183 <Method void IllegalArgumentException(String)>
	//   93  169:athrow          
					}
				} else
				if(((Class) (obj1)).isAssignableFrom(((Class) (obj))))
	//*  94  170:aload           8
	//*  95  172:aload           6
	//*  96  174:invokevirtual   #260 <Method boolean Class.isAssignableFrom(Class)>
	//*  97  177:ifeq            182
					return false;
	//   98  180:iconst_0        
	//   99  181:ireturn         
			}
		}
		if(flag)
	//* 100  182:iload_3         
	//* 101  183:ifeq            197
			_explicitCreators = _explicitCreators | j;
	//  102  186:aload_0         
	//  103  187:aload_0         
	//  104  188:getfield        #58  <Field int _explicitCreators>
	//  105  191:iload           5
	//  106  193:ior             
	//  107  194:putfield        #58  <Field int _explicitCreators>
		_creators[i] = (AnnotatedWithParams)_fixAccess(((AnnotatedMember) (annotatedwithparams)));
	//  108  197:aload_0         
	//  109  198:getfield        #56  <Field AnnotatedWithParams[] _creators>
	//  110  201:iload_2         
	//  111  202:aload_0         
	//  112  203:aload_1         
	//  113  204:invokespecial   #241 <Method AnnotatedMember _fixAccess(AnnotatedMember)>
	//  114  207:checkcast       #54  <Class AnnotatedWithParams>
	//  115  210:aastore         
		return true;
	//  116  211:iconst_1        
	//  117  212:ireturn         
	}

	protected static final String TYPE_DESCS[] = {
		"default", "from-String", "from-int", "from-long", "from-double", "from-boolean", "delegate", "property-based"
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
	//    4    7:ldc1            #31  <String "default">
	//    5    9:aastore         
	//    6   10:dup             
	//    7   11:iconst_1        
	//    8   12:ldc1            #33  <String "from-String">
	//    9   14:aastore         
	//   10   15:dup             
	//   11   16:iconst_2        
	//   12   17:ldc1            #35  <String "from-int">
	//   13   19:aastore         
	//   14   20:dup             
	//   15   21:iconst_3        
	//   16   22:ldc1            #37  <String "from-long">
	//   17   24:aastore         
	//   18   25:dup             
	//   19   26:iconst_4        
	//   20   27:ldc1            #39  <String "from-double">
	//   21   29:aastore         
	//   22   30:dup             
	//   23   31:iconst_5        
	//   24   32:ldc1            #41  <String "from-boolean">
	//   25   34:aastore         
	//   26   35:dup             
	//   27   36:bipush          6
	//   28   38:ldc1            #43  <String "delegate">
	//   29   40:aastore         
	//   30   41:dup             
	//   31   42:bipush          7
	//   32   44:ldc1            #45  <String "property-based">
	//   33   46:aastore         
	//   34   47:putstatic       #47  <Field String[] TYPE_DESCS>
	//*  35   50:return          
	}
}
