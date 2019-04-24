// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.tagmanager;


// Referenced classes of package com.google.android.gms.tagmanager:
//			zzba, zzdj

public final class zzdi
{

	public static void e(String s)
	{
		zzbdo.e(s);
	//    0    0:getstatic       #19  <Field zzdj zzbdo>
	//    1    3:aload_0         
	//    2    4:invokeinterface #26  <Method void zzdj.e(String)>
	//    3    9:return          
	}

	public static void setLogLevel(int i)
	{
		zzyn = i;
	//    0    0:iload_0         
	//    1    1:putstatic       #30  <Field int zzyn>
		zzbdo.setLogLevel(i);
	//    2    4:getstatic       #19  <Field zzdj zzbdo>
	//    3    7:iload_0         
	//    4    8:invokeinterface #32  <Method void zzdj.setLogLevel(int)>
	//    5   13:return          
	}

	public static void v(String s)
	{
		zzbdo.v(s);
	//    0    0:getstatic       #19  <Field zzdj zzbdo>
	//    1    3:aload_0         
	//    2    4:invokeinterface #35  <Method void zzdj.v(String)>
	//    3    9:return          
	}

	public static void zza(String s, Throwable throwable)
	{
		zzbdo.zza(s, throwable);
	//    0    0:getstatic       #19  <Field zzdj zzbdo>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:invokeinterface #39  <Method void zzdj.zza(String, Throwable)>
	//    4   10:return          
	}

	public static void zzab(String s)
	{
		zzbdo.zzab(s);
	//    0    0:getstatic       #19  <Field zzdj zzbdo>
	//    1    3:aload_0         
	//    2    4:invokeinterface #42  <Method void zzdj.zzab(String)>
	//    3    9:return          
	}

	public static void zzb(String s, Throwable throwable)
	{
		zzbdo.zzb(s, throwable);
	//    0    0:getstatic       #19  <Field zzdj zzbdo>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:invokeinterface #45  <Method void zzdj.zzb(String, Throwable)>
	//    4   10:return          
	}

	public static void zzdm(String s)
	{
		zzbdo.zzdm(s);
	//    0    0:getstatic       #19  <Field zzdj zzbdo>
	//    1    3:aload_0         
	//    2    4:invokeinterface #48  <Method void zzdj.zzdm(String)>
	//    3    9:return          
	}

	public static void zzdn(String s)
	{
		zzbdo.zzdn(s);
	//    0    0:getstatic       #19  <Field zzdj zzbdo>
	//    1    3:aload_0         
	//    2    4:invokeinterface #51  <Method void zzdj.zzdn(String)>
	//    3    9:return          
	}

	private static zzdj zzbdo = new zzba();
	static int zzyn;

	static 
	{
	//    0    0:new             #14  <Class zzba>
	//    1    3:dup             
	//    2    4:invokespecial   #17  <Method void zzba()>
	//    3    7:putstatic       #19  <Field zzdj zzbdo>
	//*   4   10:return          
	}
}
