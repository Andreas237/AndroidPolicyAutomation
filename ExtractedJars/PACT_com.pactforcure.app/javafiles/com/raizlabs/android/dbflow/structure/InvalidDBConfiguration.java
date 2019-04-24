// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.raizlabs.android.dbflow.structure;


public class InvalidDBConfiguration extends RuntimeException
{

	public InvalidDBConfiguration()
	{
		super("No Databases were found. Did you create a Database Annotation placeholder class?");
	//    0    0:aload_0         
	//    1    1:ldc1            #8   <String "No Databases were found. Did you create a Database Annotation placeholder class?">
	//    2    3:invokespecial   #11  <Method void RuntimeException(String)>
	//    3    6:return          
	}

	public InvalidDBConfiguration(String s)
	{
		super(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #11  <Method void RuntimeException(String)>
	//    3    5:return          
	}
}
