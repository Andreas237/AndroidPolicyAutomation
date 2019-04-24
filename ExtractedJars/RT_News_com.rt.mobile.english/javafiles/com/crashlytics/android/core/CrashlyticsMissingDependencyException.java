// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.core;


public class CrashlyticsMissingDependencyException extends RuntimeException
{

	CrashlyticsMissingDependencyException(String s)
	{
		super(buildExceptionMessage(s));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #14  <Method String buildExceptionMessage(String)>
	//    3    5:invokespecial   #16  <Method void RuntimeException(String)>
	//    4    8:return          
	}

	private static String buildExceptionMessage(String s)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #19  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #22  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("\n");
	//    4    8:aload_1         
	//    5    9:ldc1            #24  <String "\n">
	//    6   11:invokevirtual   #28  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(s);
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:invokevirtual   #28  <Method StringBuilder StringBuilder.append(String)>
	//   11   20:pop             
		stringbuilder.append("\n");
	//   12   21:aload_1         
	//   13   22:ldc1            #24  <String "\n">
	//   14   24:invokevirtual   #28  <Method StringBuilder StringBuilder.append(String)>
	//   15   27:pop             
		return stringbuilder.toString();
	//   16   28:aload_1         
	//   17   29:invokevirtual   #32  <Method String StringBuilder.toString()>
	//   18   32:areturn         
	}

	private static final long serialVersionUID = 0xc705cfa5L;
}
