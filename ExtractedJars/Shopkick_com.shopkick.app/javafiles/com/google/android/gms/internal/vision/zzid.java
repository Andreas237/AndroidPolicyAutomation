// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.vision;

import java.util.Iterator;

// Referenced classes of package com.google.android.gms.internal.vision:
//			zzie, zzif

final class zzid
{

	static Iterable zzha()
	{
		return zzaan;
	//    0    0:getstatic       #24  <Field Iterable zzaan>
	//    1    3:areturn         
	}

	static Iterator zzhb()
	{
		return zzaam;
	//    0    0:getstatic       #19  <Field Iterator zzaam>
	//    1    3:areturn         
	}

	private static final Iterator zzaam = new zzie();
	private static final Iterable zzaan = new zzif();

	static 
	{
	//    0    0:new             #14  <Class zzie>
	//    1    3:dup             
	//    2    4:invokespecial   #17  <Method void zzie()>
	//    3    7:putstatic       #19  <Field Iterator zzaam>
	//    4   10:new             #21  <Class zzif>
	//    5   13:dup             
	//    6   14:invokespecial   #22  <Method void zzif()>
	//    7   17:putstatic       #24  <Field Iterable zzaan>
	//*   8   20:return          
	}
}
