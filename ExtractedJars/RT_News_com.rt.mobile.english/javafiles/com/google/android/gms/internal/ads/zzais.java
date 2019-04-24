// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			zznk, zzkb, zzni, zzakb

public final class zzais
{

	public static boolean isEnabled()
	{
		zzna zzna = zznk.zzbdi;
	//    0    0:getstatic       #13  <Field zzna zznk.zzbdi>
	//    1    3:astore_0        
		return ((Boolean)zzkb.zzik().zzd(zzna)).booleanValue();
	//    2    4:invokestatic    #19  <Method zzni zzkb.zzik()>
	//    3    7:aload_0         
	//    4    8:invokevirtual   #25  <Method Object zzni.zzd(zzna)>
	//    5   11:checkcast       #27  <Class Boolean>
	//    6   14:invokevirtual   #30  <Method boolean Boolean.booleanValue()>
	//    7   17:ireturn         
	}

	public static void zzck(String s)
	{
		zzna zzna = zznk.zzbdi;
	//    0    0:getstatic       #13  <Field zzna zznk.zzbdi>
	//    1    3:astore_1        
		if(((Boolean)zzkb.zzik().zzd(zzna)).booleanValue())
	//*   2    4:invokestatic    #19  <Method zzni zzkb.zzik()>
	//*   3    7:aload_1         
	//*   4    8:invokevirtual   #25  <Method Object zzni.zzd(zzna)>
	//*   5   11:checkcast       #27  <Class Boolean>
	//*   6   14:invokevirtual   #30  <Method boolean Boolean.booleanValue()>
	//*   7   17:ifeq            24
			zzakb.zzck(s);
	//    8   20:aload_0         
	//    9   21:invokestatic    #37  <Method void zzakb.zzck(String)>
	//   10   24:return          
	}
}
