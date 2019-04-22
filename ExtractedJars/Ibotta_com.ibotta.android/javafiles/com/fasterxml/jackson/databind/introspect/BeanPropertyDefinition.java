// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.Named;
import java.util.Iterator;

// Referenced classes of package com.fasterxml.jackson.databind.introspect:
//			ObjectIdInfo, AnnotatedMember, AnnotatedParameter, AnnotatedField, 
//			AnnotatedMethod

public abstract class BeanPropertyDefinition
	implements Named
{

	public BeanPropertyDefinition()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void Object()>
	//    2    4:return          
	}

	public boolean couldDeserialize()
	{
		return getMutator() != null;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #28  <Method AnnotatedMember getMutator()>
	//    2    4:ifnull          9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	public boolean couldSerialize()
	{
		return getAccessor() != null;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #32  <Method AnnotatedMember getAccessor()>
	//    2    4:ifnull          9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	public abstract com.fasterxml.jackson.annotation.JsonInclude.Value findInclusion();

	public ObjectIdInfo findObjectIdInfo()
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public String findReferenceName()
	{
		com.fasterxml.jackson.databind.AnnotationIntrospector.ReferenceProperty referenceproperty = findReferenceType();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #41  <Method com.fasterxml.jackson.databind.AnnotationIntrospector$ReferenceProperty findReferenceType()>
	//    2    4:astore_1        
		if(referenceproperty == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       11
			return null;
	//    5    9:aconst_null     
	//    6   10:areturn         
		else
			return referenceproperty.getName();
	//    7   11:aload_1         
	//    8   12:invokevirtual   #46  <Method String com.fasterxml.jackson.databind.AnnotationIntrospector$ReferenceProperty.getName()>
	//    9   15:areturn         
	}

	public com.fasterxml.jackson.databind.AnnotationIntrospector.ReferenceProperty findReferenceType()
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public Class[] findViews()
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public AnnotatedMember getAccessor()
	{
		AnnotatedMethod annotatedmethod = getGetter();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #54  <Method AnnotatedMethod getGetter()>
	//    2    4:astore_2        
		Object obj = ((Object) (annotatedmethod));
	//    3    5:aload_2         
	//    4    6:astore_1        
		if(annotatedmethod == null)
	//*   5    7:aload_2         
	//*   6    8:ifnonnull       16
			obj = ((Object) (getField()));
	//    7   11:aload_0         
	//    8   12:invokevirtual   #58  <Method AnnotatedField getField()>
	//    9   15:astore_1        
		return ((AnnotatedMember) (obj));
	//   10   16:aload_1         
	//   11   17:areturn         
	}

	public abstract AnnotatedParameter getConstructorParameter();

	public Iterator getConstructorParameters()
	{
		return ClassUtil.emptyIterator();
	//    0    0:invokestatic    #67  <Method Iterator ClassUtil.emptyIterator()>
	//    1    3:areturn         
	}

	public abstract AnnotatedField getField();

	public abstract PropertyName getFullName();

	public abstract AnnotatedMethod getGetter();

	public abstract PropertyMetadata getMetadata();

	public AnnotatedMember getMutator()
	{
		AnnotatedParameter annotatedparameter = getConstructorParameter();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #74  <Method AnnotatedParameter getConstructorParameter()>
	//    2    4:astore_2        
		Object obj = ((Object) (annotatedparameter));
	//    3    5:aload_2         
	//    4    6:astore_1        
		if(annotatedparameter == null)
	//*   5    7:aload_2         
	//*   6    8:ifnonnull       27
		{
			AnnotatedMethod annotatedmethod = getSetter();
	//    7   11:aload_0         
	//    8   12:invokevirtual   #77  <Method AnnotatedMethod getSetter()>
	//    9   15:astore_2        
			obj = ((Object) (annotatedmethod));
	//   10   16:aload_2         
	//   11   17:astore_1        
			if(annotatedmethod == null)
	//*  12   18:aload_2         
	//*  13   19:ifnonnull       27
				obj = ((Object) (getField()));
	//   14   22:aload_0         
	//   15   23:invokevirtual   #58  <Method AnnotatedField getField()>
	//   16   26:astore_1        
		}
		return ((AnnotatedMember) (obj));
	//   17   27:aload_1         
	//   18   28:areturn         
	}

	public abstract String getName();

	public AnnotatedMember getNonConstructorMutator()
	{
		AnnotatedMethod annotatedmethod = getSetter();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #77  <Method AnnotatedMethod getSetter()>
	//    2    4:astore_2        
		Object obj = ((Object) (annotatedmethod));
	//    3    5:aload_2         
	//    4    6:astore_1        
		if(annotatedmethod == null)
	//*   5    7:aload_2         
	//*   6    8:ifnonnull       16
			obj = ((Object) (getField()));
	//    7   11:aload_0         
	//    8   12:invokevirtual   #58  <Method AnnotatedField getField()>
	//    9   15:astore_1        
		return ((AnnotatedMember) (obj));
	//   10   16:aload_1         
	//   11   17:areturn         
	}

	public abstract AnnotatedMember getPrimaryMember();

	public abstract JavaType getPrimaryType();

	public abstract Class getRawPrimaryType();

	public abstract AnnotatedMethod getSetter();

	public abstract PropertyName getWrapperName();

	public abstract boolean hasConstructorParameter();

	public abstract boolean hasField();

	public boolean hasName(PropertyName propertyname)
	{
		return getFullName().equals(((Object) (propertyname)));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #90  <Method PropertyName getFullName()>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #96  <Method boolean PropertyName.equals(Object)>
	//    4    8:ireturn         
	}

	public abstract boolean hasSetter();

	public abstract boolean isExplicitlyIncluded();

	public boolean isExplicitlyNamed()
	{
		return isExplicitlyIncluded();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #101 <Method boolean isExplicitlyIncluded()>
	//    2    4:ireturn         
	}

	public boolean isTypeId()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	protected static final com.fasterxml.jackson.annotation.JsonInclude.Value EMPTY_INCLUDE = com.fasterxml.jackson.annotation.JsonInclude.Value.empty();

	static 
	{
	//    0    0:invokestatic    #16  <Method com.fasterxml.jackson.annotation.JsonInclude$Value com.fasterxml.jackson.annotation.JsonInclude$Value.empty()>
	//    1    3:putstatic       #18  <Field com.fasterxml.jackson.annotation.JsonInclude$Value EMPTY_INCLUDE>
	//*   2    6:return          
	}
}
