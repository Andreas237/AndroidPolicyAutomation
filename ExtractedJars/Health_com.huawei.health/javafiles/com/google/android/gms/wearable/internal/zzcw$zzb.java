// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.wearable.internal;


// Referenced classes of package com.google.android.gms.wearable.internal:
//			zza, zzcw

static abstract class zzcw$zzb extends zza
{

	public void zzaa(Object obj)
	{
		com.google.android.gms.internal.  = zzahW;
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field com.google.android.gms.internal.zzaad$zzb zzahW>
	//    2    4:astore_2        
		if( != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          21
		{
			.setResult(obj);
	//    5    9:aload_2         
	//    6   10:aload_1         
	//    7   11:invokeinterface #28  <Method void com.google.android.gms.internal.zzaad$zzb.setResult(Object)>
			zzahW = null;
	//    8   16:aload_0         
	//    9   17:aconst_null     
	//   10   18:putfield        #18  <Field com.google.android.gms.internal.zzaad$zzb zzahW>
		}
	//   11   21:return          
	}

	private com.google.android.gms.internal. zzahW;

	public zzcw$zzb(com.google.android.gms.internal. )
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void zza()>
		zzahW = ;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #18  <Field com.google.android.gms.internal.zzaad$zzb zzahW>
	//    5    9:return          
	}
}
