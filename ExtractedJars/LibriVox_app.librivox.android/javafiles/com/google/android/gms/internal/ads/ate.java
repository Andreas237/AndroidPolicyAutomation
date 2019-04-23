// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.util.List;

// Referenced classes of package com.google.android.gms.internal.ads:
//			atg, ath, atf

abstract class ate
{

	private ate()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Object()>
	//    2    4:return          
	}

	ate(atf atf)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void ate()>
	//    2    4:return          
	}

	static ate a()
	{
		return a;
	//    0    0:getstatic       #17  <Field ate a>
	//    1    3:areturn         
	}

	static ate b()
	{
		return b;
	//    0    0:getstatic       #22  <Field ate b>
	//    1    3:areturn         
	}

	abstract List a(Object obj, long l);

	abstract void a(Object obj, Object obj1, long l);

	abstract void b(Object obj, long l);

	private static final ate a = new atg(((atf) (null)));
	private static final ate b = new ath(((atf) (null)));

	static 
	{
	//    0    0:new             #11  <Class atg>
	//    1    3:dup             
	//    2    4:aconst_null     
	//    3    5:invokespecial   #15  <Method void atg(atf)>
	//    4    8:putstatic       #17  <Field ate a>
	//    5   11:new             #19  <Class ath>
	//    6   14:dup             
	//    7   15:aconst_null     
	//    8   16:invokespecial   #20  <Method void ath(atf)>
	//    9   19:putstatic       #22  <Field ate b>
	//*  10   22:return          
	}
}
