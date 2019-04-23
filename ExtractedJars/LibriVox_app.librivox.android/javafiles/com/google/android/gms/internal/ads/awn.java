// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;

// Referenced classes of package com.google.android.gms.internal.ads:
//			awj, awl

public final class awn
{

	public static void a(awj awj1, awj awj2)
	{
		if(awj1.Z != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #38  <Field awl awj.Z>
	//*   2    4:ifnull          21
			awj2.Z = (awl)awj1.Z.clone();
	//    3    7:aload_1         
	//    4    8:aload_0         
	//    5    9:getfield        #38  <Field awl awj.Z>
	//    6   12:invokevirtual   #44  <Method Object awl.clone()>
	//    7   15:checkcast       #40  <Class awl>
	//    8   18:putfield        #38  <Field awl awj.Z>
	//    9   21:return          
	}

	protected static final Charset a = Charset.forName("UTF-8");
	public static final Object b = new Object();
	private static final Charset c = Charset.forName("ISO-8859-1");

	static 
	{
	//    0    0:ldc1            #13  <String "UTF-8">
	//    1    2:invokestatic    #19  <Method Charset Charset.forName(String)>
	//    2    5:putstatic       #21  <Field Charset a>
	//    3    8:ldc1            #23  <String "ISO-8859-1">
	//    4   10:invokestatic    #19  <Method Charset Charset.forName(String)>
	//    5   13:putstatic       #25  <Field Charset c>
	//    6   16:new             #4   <Class Object>
	//    7   19:dup             
	//    8   20:invokespecial   #28  <Method void Object()>
	//    9   23:putstatic       #30  <Field Object b>
	//*  10   26:return          
	}
}
