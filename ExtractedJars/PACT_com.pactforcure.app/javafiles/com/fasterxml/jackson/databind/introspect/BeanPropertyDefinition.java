// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.databind.PropertyName;
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

	public com.fasterxml.jackson.annotation.JsonInclude.Value findInclusion()
	{
		return EMPTY_INCLUDE;
	//    0    0:getstatic       #18  <Field com.fasterxml.jackson.annotation.JsonInclude$Value EMPTY_INCLUDE>
	//    1    3:areturn         
	}

	public ObjectIdInfo findObjectIdInfo()
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
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

	public abstract AnnotatedMember getAccessor();

	public abstract AnnotatedParameter getConstructorParameter();

	public Iterator getConstructorParameters()
	{
		return ClassUtil.emptyIterator();
	//    0    0:invokestatic    #50  <Method Iterator ClassUtil.emptyIterator()>
	//    1    3:areturn         
	}

	public abstract AnnotatedField getField();

	public abstract PropertyName getFullName();

	public abstract AnnotatedMethod getGetter();

	public abstract String getInternalName();

	public abstract PropertyMetadata getMetadata();

	public abstract AnnotatedMember getMutator();

	public abstract String getName();

	public abstract AnnotatedMember getNonConstructorMutator();

	public abstract AnnotatedMember getPrimaryMember();

	public abstract AnnotatedMethod getSetter();

	public abstract PropertyName getWrapperName();

	public abstract boolean hasConstructorParameter();

	public abstract boolean hasField();

	public abstract boolean hasGetter();

	public boolean hasName(PropertyName propertyname)
	{
		return getFullName().equals(((Object) (propertyname)));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #73  <Method PropertyName getFullName()>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #79  <Method boolean PropertyName.equals(Object)>
	//    4    8:ireturn         
	}

	public abstract boolean hasSetter();

	public abstract boolean isExplicitlyIncluded();

	public boolean isExplicitlyNamed()
	{
		return isExplicitlyIncluded();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #84  <Method boolean isExplicitlyIncluded()>
	//    2    4:ireturn         
	}

	public boolean isRequired()
	{
		PropertyMetadata propertymetadata = getMetadata();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #87  <Method PropertyMetadata getMetadata()>
	//    2    4:astore_1        
		return propertymetadata != null && propertymetadata.isRequired();
	//    3    5:aload_1         
	//    4    6:ifnull          18
	//    5    9:aload_1         
	//    6   10:invokevirtual   #91  <Method boolean PropertyMetadata.isRequired()>
	//    7   13:ifeq            18
	//    8   16:iconst_1        
	//    9   17:ireturn         
	//   10   18:iconst_0        
	//   11   19:ireturn         
	}

	public boolean isTypeId()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public abstract BeanPropertyDefinition withName(PropertyName propertyname);

	public abstract BeanPropertyDefinition withSimpleName(String s);

	protected static final com.fasterxml.jackson.annotation.JsonInclude.Value EMPTY_INCLUDE = com.fasterxml.jackson.annotation.JsonInclude.Value.empty();

	static 
	{
	//    0    0:invokestatic    #16  <Method com.fasterxml.jackson.annotation.JsonInclude$Value com.fasterxml.jackson.annotation.JsonInclude$Value.empty()>
	//    1    3:putstatic       #18  <Field com.fasterxml.jackson.annotation.JsonInclude$Value EMPTY_INCLUDE>
	//*   2    6:return          
	}
}
