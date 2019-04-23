// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.measurement;


// Referenced classes of package com.google.android.gms.internal.measurement:
//			zzsi, zzso

final class zzsn extends zzsi
{

	zzsn(zzso zzso, String s, String s1)
	{
		super(zzso, s, ((Object) (s1)), ((zzsj) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aconst_null     
	//    5    5:invokespecial   #10  <Method void zzsi(zzso, String, Object, zzsj)>
	//    6    8:return          
	}

	final Object zzs(Object obj)
	{
		if(obj instanceof String)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #15  <Class String>
	//*   2    4:ifeq            12
			return ((Object) ((String)obj));
	//    3    7:aload_1         
	//    4    8:checkcast       #15  <Class String>
	//    5   11:areturn         
		else
			return ((Object) (null));
	//    6   12:aconst_null     
	//    7   13:areturn         
	}
}
