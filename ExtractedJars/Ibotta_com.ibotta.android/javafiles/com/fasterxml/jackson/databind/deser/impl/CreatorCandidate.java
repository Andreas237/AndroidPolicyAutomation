// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.introspect.*;

public final class CreatorCandidate
{
	public static final class Param
	{

		public final AnnotatedParameter annotated;
		public final com.fasterxml.jackson.annotation.JacksonInject.Value injection;
		public final BeanPropertyDefinition propDef;

		public Param(AnnotatedParameter annotatedparameter, BeanPropertyDefinition beanpropertydefinition, com.fasterxml.jackson.annotation.JacksonInject.Value value)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #18  <Method void Object()>
			annotated = annotatedparameter;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #20  <Field AnnotatedParameter annotated>
			propDef = beanpropertydefinition;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #22  <Field BeanPropertyDefinition propDef>
			injection = value;
		//    8   14:aload_0         
		//    9   15:aload_3         
		//   10   16:putfield        #24  <Field com.fasterxml.jackson.annotation.JacksonInject$Value injection>
		//   11   19:return          
		}
	}


	protected CreatorCandidate(AnnotationIntrospector annotationintrospector, AnnotatedWithParams annotatedwithparams, Param aparam[], int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
		_intr = annotationintrospector;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #22  <Field AnnotationIntrospector _intr>
		_creator = annotatedwithparams;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #24  <Field AnnotatedWithParams _creator>
		_params = aparam;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #26  <Field CreatorCandidate$Param[] _params>
		_paramCount = i;
	//   11   19:aload_0         
	//   12   20:iload           4
	//   13   22:putfield        #28  <Field int _paramCount>
	//   14   25:return          
	}

	public static CreatorCandidate construct(AnnotationIntrospector annotationintrospector, AnnotatedWithParams annotatedwithparams, BeanPropertyDefinition abeanpropertydefinition[])
	{
		int j = annotatedwithparams.getParameterCount();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #37  <Method int AnnotatedWithParams.getParameterCount()>
	//    2    4:istore          4
		Param aparam[] = new Param[j];
	//    3    6:iload           4
	//    4    8:anewarray       Param[]
	//    5   11:astore          6
		for(int i = 0; i < j; i++)
	//*   6   13:iconst_0        
	//*   7   14:istore_3        
	//*   8   15:iload_3         
	//*   9   16:iload           4
	//*  10   18:icmpge          75
		{
			AnnotatedParameter annotatedparameter = annotatedwithparams.getParameter(i);
	//   11   21:aload_1         
	//   12   22:iload_3         
	//   13   23:invokevirtual   #41  <Method AnnotatedParameter AnnotatedWithParams.getParameter(int)>
	//   14   26:astore          7
			com.fasterxml.jackson.annotation.JacksonInject.Value value = annotationintrospector.findInjectableValue(((com.fasterxml.jackson.databind.introspect.AnnotatedMember) (annotatedparameter)));
	//   15   28:aload_0         
	//   16   29:aload           7
	//   17   31:invokevirtual   #47  <Method com.fasterxml.jackson.annotation.JacksonInject$Value AnnotationIntrospector.findInjectableValue(com.fasterxml.jackson.databind.introspect.AnnotatedMember)>
	//   18   34:astore          8
			BeanPropertyDefinition beanpropertydefinition;
			if(abeanpropertydefinition == null)
	//*  19   36:aload_2         
	//*  20   37:ifnonnull       46
				beanpropertydefinition = null;
	//   21   40:aconst_null     
	//   22   41:astore          5
			else
	//*  23   43:goto            51
				beanpropertydefinition = abeanpropertydefinition[i];
	//   24   46:aload_2         
	//   25   47:iload_3         
	//   26   48:aaload          
	//   27   49:astore          5
			aparam[i] = new Param(annotatedparameter, beanpropertydefinition, value);
	//   28   51:aload           6
	//   29   53:iload_3         
	//   30   54:new             #6   <Class CreatorCandidate$Param>
	//   31   57:dup             
	//   32   58:aload           7
	//   33   60:aload           5
	//   34   62:aload           8
	//   35   64:invokespecial   #50  <Method void CreatorCandidate$Param(AnnotatedParameter, BeanPropertyDefinition, com.fasterxml.jackson.annotation.JacksonInject$Value)>
	//   36   67:aastore         
		}

	//   37   68:iload_3         
	//   38   69:iconst_1        
	//   39   70:iadd            
	//   40   71:istore_3        
	//*  41   72:goto            15
		return new CreatorCandidate(annotationintrospector, annotatedwithparams, aparam, j);
	//   42   75:new             #2   <Class CreatorCandidate>
	//   43   78:dup             
	//   44   79:aload_0         
	//   45   80:aload_1         
	//   46   81:aload           6
	//   47   83:iload           4
	//   48   85:invokespecial   #52  <Method void CreatorCandidate(AnnotationIntrospector, AnnotatedWithParams, CreatorCandidate$Param[], int)>
	//   49   88:areturn         
	}

	public AnnotatedWithParams creator()
	{
		return _creator;
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field AnnotatedWithParams _creator>
	//    2    4:areturn         
	}

	public PropertyName explicitParamName(int i)
	{
		BeanPropertyDefinition beanpropertydefinition = _params[i].propDef;
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field CreatorCandidate$Param[] _params>
	//    2    4:iload_1         
	//    3    5:aaload          
	//    4    6:getfield        #60  <Field BeanPropertyDefinition CreatorCandidate$Param.propDef>
	//    5    9:astore_2        
		if(beanpropertydefinition != null && beanpropertydefinition.isExplicitlyNamed())
	//*   6   10:aload_2         
	//*   7   11:ifnull          26
	//*   8   14:aload_2         
	//*   9   15:invokevirtual   #66  <Method boolean BeanPropertyDefinition.isExplicitlyNamed()>
	//*  10   18:ifeq            26
			return beanpropertydefinition.getFullName();
	//   11   21:aload_2         
	//   12   22:invokevirtual   #70  <Method PropertyName BeanPropertyDefinition.getFullName()>
	//   13   25:areturn         
		else
			return null;
	//   14   26:aconst_null     
	//   15   27:areturn         
	}

	public PropertyName findImplicitParamName(int i)
	{
		String s = _intr.findImplicitPropertyName(((com.fasterxml.jackson.databind.introspect.AnnotatedMember) (_params[i].annotated)));
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field AnnotationIntrospector _intr>
	//    2    4:aload_0         
	//    3    5:getfield        #26  <Field CreatorCandidate$Param[] _params>
	//    4    8:iload_1         
	//    5    9:aaload          
	//    6   10:getfield        #75  <Field AnnotatedParameter CreatorCandidate$Param.annotated>
	//    7   13:invokevirtual   #79  <Method String AnnotationIntrospector.findImplicitPropertyName(com.fasterxml.jackson.databind.introspect.AnnotatedMember)>
	//    8   16:astore_2        
		if(s != null && !s.isEmpty())
	//*   9   17:aload_2         
	//*  10   18:ifnull          33
	//*  11   21:aload_2         
	//*  12   22:invokevirtual   #84  <Method boolean String.isEmpty()>
	//*  13   25:ifne            33
			return PropertyName.construct(s);
	//   14   28:aload_2         
	//   15   29:invokestatic    #89  <Method PropertyName PropertyName.construct(String)>
	//   16   32:areturn         
		else
			return null;
	//   17   33:aconst_null     
	//   18   34:areturn         
	}

	public int findOnlyParamWithoutInjection()
	{
		int i = 0;
	//    0    0:iconst_0        
	//    1    1:istore_1        
		int j;
		int k;
		for(j = -1; i < _paramCount; j = k)
	//*   2    2:iconst_m1       
	//*   3    3:istore_2        
	//*   4    4:iload_1         
	//*   5    5:aload_0         
	//*   6    6:getfield        #28  <Field int _paramCount>
	//*   7    9:icmpge          43
		{
			k = j;
	//    8   12:iload_2         
	//    9   13:istore_3        
			if(_params[i].injection == null)
	//*  10   14:aload_0         
	//*  11   15:getfield        #26  <Field CreatorCandidate$Param[] _params>
	//*  12   18:iload_1         
	//*  13   19:aaload          
	//*  14   20:getfield        #94  <Field com.fasterxml.jackson.annotation.JacksonInject$Value CreatorCandidate$Param.injection>
	//*  15   23:ifnonnull       34
			{
				if(j >= 0)
	//*  16   26:iload_2         
	//*  17   27:iflt            32
					return -1;
	//   18   30:iconst_m1       
	//   19   31:ireturn         
				k = i;
	//   20   32:iload_1         
	//   21   33:istore_3        
			}
			i++;
	//   22   34:iload_1         
	//   23   35:iconst_1        
	//   24   36:iadd            
	//   25   37:istore_1        
		}

	//   26   38:iload_3         
	//   27   39:istore_2        
	//*  28   40:goto            4
		return j;
	//   29   43:iload_2         
	//   30   44:ireturn         
	}

	public com.fasterxml.jackson.annotation.JacksonInject.Value injection(int i)
	{
		return _params[i].injection;
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field CreatorCandidate$Param[] _params>
	//    2    4:iload_1         
	//    3    5:aaload          
	//    4    6:getfield        #94  <Field com.fasterxml.jackson.annotation.JacksonInject$Value CreatorCandidate$Param.injection>
	//    5    9:areturn         
	}

	public int paramCount()
	{
		return _paramCount;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field int _paramCount>
	//    2    4:ireturn         
	}

	public PropertyName paramName(int i)
	{
		BeanPropertyDefinition beanpropertydefinition = _params[i].propDef;
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field CreatorCandidate$Param[] _params>
	//    2    4:iload_1         
	//    3    5:aaload          
	//    4    6:getfield        #60  <Field BeanPropertyDefinition CreatorCandidate$Param.propDef>
	//    5    9:astore_2        
		if(beanpropertydefinition != null)
	//*   6   10:aload_2         
	//*   7   11:ifnull          19
			return beanpropertydefinition.getFullName();
	//    8   14:aload_2         
	//    9   15:invokevirtual   #70  <Method PropertyName BeanPropertyDefinition.getFullName()>
	//   10   18:areturn         
		else
			return null;
	//   11   19:aconst_null     
	//   12   20:areturn         
	}

	public AnnotatedParameter parameter(int i)
	{
		return _params[i].annotated;
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field CreatorCandidate$Param[] _params>
	//    2    4:iload_1         
	//    3    5:aaload          
	//    4    6:getfield        #75  <Field AnnotatedParameter CreatorCandidate$Param.annotated>
	//    5    9:areturn         
	}

	public BeanPropertyDefinition propertyDef(int i)
	{
		return _params[i].propDef;
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field CreatorCandidate$Param[] _params>
	//    2    4:iload_1         
	//    3    5:aaload          
	//    4    6:getfield        #60  <Field BeanPropertyDefinition CreatorCandidate$Param.propDef>
	//    5    9:areturn         
	}

	public String toString()
	{
		return _creator.toString();
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field AnnotatedWithParams _creator>
	//    2    4:invokevirtual   #104 <Method String AnnotatedWithParams.toString()>
	//    3    7:areturn         
	}

	protected final AnnotatedWithParams _creator;
	protected final AnnotationIntrospector _intr;
	protected final int _paramCount;
	protected final Param _params[];
}
