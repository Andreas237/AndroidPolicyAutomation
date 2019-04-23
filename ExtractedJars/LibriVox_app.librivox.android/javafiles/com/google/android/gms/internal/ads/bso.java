// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.IBinder;

// Referenced classes of package com.google.android.gms.internal.ads:
//			aai, bco

final class bso
	implements aai
{

	private bso()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
	//    2    4:return          
	}

	public final Object a(Object obj)
	{
		return ((Object) (bco.a((IBinder)obj)));
	//    0    0:aload_1         
	//    1    1:checkcast       #20  <Class IBinder>
	//    2    4:invokestatic    #25  <Method bcn bco.a(IBinder)>
	//    3    7:areturn         
	}

	static final aai a = new bso();

	static 
	{
	//    0    0:new             #2   <Class bso>
	//    1    3:dup             
	//    2    4:invokespecial   #13  <Method void bso()>
	//    3    7:putstatic       #15  <Field aai a>
	//*   4   10:return          
	}
}
