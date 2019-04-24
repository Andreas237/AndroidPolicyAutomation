// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.core.type;


public abstract class ResolvedType
{

	public ResolvedType()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public abstract ResolvedType containedType(int i);

	public abstract int containedTypeCount();

	public abstract String containedTypeName(int i);

	public abstract ResolvedType getContentType();

	public abstract ResolvedType getKeyType();

	public Class getParameterSource()
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public abstract Class getRawClass();

	public abstract ResolvedType getReferencedType();

	public abstract boolean hasGenericTypes();

	public abstract boolean hasRawClass(Class class1);

	public abstract boolean isAbstract();

	public abstract boolean isArrayType();

	public abstract boolean isCollectionLikeType();

	public abstract boolean isConcrete();

	public abstract boolean isContainerType();

	public abstract boolean isEnumType();

	public abstract boolean isFinal();

	public abstract boolean isInterface();

	public abstract boolean isMapLikeType();

	public abstract boolean isPrimitive();

	public boolean isReferenceType()
	{
		return getReferencedType() != null;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #43  <Method ResolvedType getReferencedType()>
	//    2    4:ifnull          9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	public abstract boolean isThrowable();

	public abstract String toCanonical();
}
