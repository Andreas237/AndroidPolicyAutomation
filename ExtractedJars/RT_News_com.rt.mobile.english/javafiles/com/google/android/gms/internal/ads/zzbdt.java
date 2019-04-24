// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.util.Iterator;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzbdu, zzbdv

final class zzbdt
{

	static Iterable zzafy()
	{
		return zzdys;
	//    0    0:getstatic       #24  <Field Iterable zzdys>
	//    1    3:areturn         
	}

	static Iterator zzafz()
	{
		return zzdyr;
	//    0    0:getstatic       #19  <Field Iterator zzdyr>
	//    1    3:areturn         
	}

	private static final Iterator zzdyr = new zzbdu();
	private static final Iterable zzdys = new zzbdv();

	static 
	{
	//    0    0:new             #14  <Class zzbdu>
	//    1    3:dup             
	//    2    4:invokespecial   #17  <Method void zzbdu()>
	//    3    7:putstatic       #19  <Field Iterator zzdyr>
	//    4   10:new             #21  <Class zzbdv>
	//    5   13:dup             
	//    6   14:invokespecial   #22  <Method void zzbdv()>
	//    7   17:putstatic       #24  <Field Iterable zzdys>
	//*   8   20:return          
	}
}
