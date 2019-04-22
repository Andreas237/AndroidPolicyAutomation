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

	public abstract ResolvedType getReferencedType();

	public boolean isReferenceType()
	{
		return getReferencedType() != null;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #15  <Method ResolvedType getReferencedType()>
	//    2    4:ifnull          9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	public abstract String toCanonical();
}
