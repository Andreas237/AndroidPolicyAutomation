// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			asr, axq

final class ayb
	implements asr
{

	private ayb()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
	//    2    4:return          
	}

	public final boolean a(int i)
	{
		return axq.a(i) != null;
	//    0    0:iload_1         
	//    1    1:invokestatic    #23  <Method axq axq.a(int)>
	//    2    4:ifnull          9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	static final asr a = new ayb();

	static 
	{
	//    0    0:new             #2   <Class ayb>
	//    1    3:dup             
	//    2    4:invokespecial   #13  <Method void ayb()>
	//    3    7:putstatic       #15  <Field asr a>
	//*   4   10:return          
	}
}
