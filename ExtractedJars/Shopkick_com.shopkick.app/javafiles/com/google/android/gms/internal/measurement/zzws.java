// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.measurement;

import java.util.Iterator;

// Referenced classes of package com.google.android.gms.internal.measurement:
//			zzwt, zzwu

final class zzws
{

	static Iterable zzyi()
	{
		return zzcca;
	//    0    0:getstatic       #24  <Field Iterable zzcca>
	//    1    3:areturn         
	}

	static Iterator zzyj()
	{
		return zzcbz;
	//    0    0:getstatic       #19  <Field Iterator zzcbz>
	//    1    3:areturn         
	}

	private static final Iterator zzcbz = new zzwt();
	private static final Iterable zzcca = new zzwu();

	static 
	{
	//    0    0:new             #14  <Class zzwt>
	//    1    3:dup             
	//    2    4:invokespecial   #17  <Method void zzwt()>
	//    3    7:putstatic       #19  <Field Iterator zzcbz>
	//    4   10:new             #21  <Class zzwu>
	//    5   13:dup             
	//    6   14:invokespecial   #22  <Method void zzwu()>
	//    7   17:putstatic       #24  <Field Iterable zzcca>
	//*   8   20:return          
	}
}
