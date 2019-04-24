// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.gson;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Collection;

public final class FieldAttributes
{

	public FieldAttributes(Field field1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
		com.google.gson.internal..Gson.Preconditions.checkNotNull(((Object) (field1)));
	//    2    4:aload_1         
	//    3    5:invokestatic    #17  <Method Object com.google.gson.internal.$Gson$Preconditions.checkNotNull(Object)>
	//    4    8:pop             
		field = field1;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #19  <Field Field field>
	//    8   14:return          
	}

	Object get(Object obj)
		throws IllegalAccessException
	{
		return field.get(obj);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field Field field>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #27  <Method Object Field.get(Object)>
	//    4    8:areturn         
	}

	public Annotation getAnnotation(Class class1)
	{
		return field.getAnnotation(class1);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field Field field>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #32  <Method Annotation Field.getAnnotation(Class)>
	//    4    8:areturn         
	}

	public Collection getAnnotations()
	{
		return ((Collection) (Arrays.asList(((Object []) (field.getAnnotations())))));
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field Field field>
	//    2    4:invokevirtual   #39  <Method Annotation[] Field.getAnnotations()>
	//    3    7:invokestatic    #45  <Method java.util.List Arrays.asList(Object[])>
	//    4   10:areturn         
	}

	public Class getDeclaredClass()
	{
		return field.getType();
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field Field field>
	//    2    4:invokevirtual   #51  <Method Class Field.getType()>
	//    3    7:areturn         
	}

	public Type getDeclaredType()
	{
		return field.getGenericType();
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field Field field>
	//    2    4:invokevirtual   #57  <Method Type Field.getGenericType()>
	//    3    7:areturn         
	}

	public Class getDeclaringClass()
	{
		return field.getDeclaringClass();
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field Field field>
	//    2    4:invokevirtual   #60  <Method Class Field.getDeclaringClass()>
	//    3    7:areturn         
	}

	public String getName()
	{
		return field.getName();
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field Field field>
	//    2    4:invokevirtual   #64  <Method String Field.getName()>
	//    3    7:areturn         
	}

	public boolean hasModifier(int i)
	{
		return (field.getModifiers() & i) != 0;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field Field field>
	//    2    4:invokevirtual   #70  <Method int Field.getModifiers()>
	//    3    7:iload_1         
	//    4    8:iand            
	//    5    9:ifeq            14
	//    6   12:iconst_1        
	//    7   13:ireturn         
	//    8   14:iconst_0        
	//    9   15:ireturn         
	}

	boolean isSynthetic()
	{
		return field.isSynthetic();
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field Field field>
	//    2    4:invokevirtual   #74  <Method boolean Field.isSynthetic()>
	//    3    7:ireturn         
	}

	private final Field field;
}
