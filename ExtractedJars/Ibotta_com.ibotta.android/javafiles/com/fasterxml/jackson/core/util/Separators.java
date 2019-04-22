// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.core.util;

import java.io.Serializable;

public class Separators
	implements Serializable
{

	public Separators()
	{
		this(':', ',', ',');
	//    0    0:aload_0         
	//    1    1:bipush          58
	//    2    3:bipush          44
	//    3    5:bipush          44
	//    4    7:invokespecial   #19  <Method void Separators(char, char, char)>
	//    5   10:return          
	}

	public Separators(char c, char c1, char c2)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void Object()>
		objectFieldValueSeparator = c;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #24  <Field char objectFieldValueSeparator>
		objectEntrySeparator = c1;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #26  <Field char objectEntrySeparator>
		arrayValueSeparator = c2;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #28  <Field char arrayValueSeparator>
	//   11   19:return          
	}

	public static Separators createDefaultInstance()
	{
		return new Separators();
	//    0    0:new             #2   <Class Separators>
	//    1    3:dup             
	//    2    4:invokespecial   #31  <Method void Separators()>
	//    3    7:areturn         
	}

	public char getArrayValueSeparator()
	{
		return arrayValueSeparator;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field char arrayValueSeparator>
	//    2    4:ireturn         
	}

	public char getObjectEntrySeparator()
	{
		return objectEntrySeparator;
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field char objectEntrySeparator>
	//    2    4:ireturn         
	}

	public char getObjectFieldValueSeparator()
	{
		return objectFieldValueSeparator;
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field char objectFieldValueSeparator>
	//    2    4:ireturn         
	}

	private static final long serialVersionUID = 1L;
	private final char arrayValueSeparator;
	private final char objectEntrySeparator;
	private final char objectFieldValueSeparator;
}
