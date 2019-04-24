// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//			zzr

public class zzm
{
	public static interface zza
	{

		public abstract void zze(zzr zzr);
	}

	public static interface zzb
	{

		public abstract void zzb(Object obj);
	}


	private zzm(zzr zzr)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Object()>
		zzag = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #27  <Field boolean zzag>
		result = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #29  <Field Object result>
		zzae = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #31  <Field zzb$zza zzae>
		zzaf = zzr;
	//   11   19:aload_0         
	//   12   20:aload_1         
	//   13   21:putfield        #33  <Field zzr zzaf>
	//   14   24:return          
	}

	private zzm(Object obj, zzb.zza zza1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Object()>
		zzag = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #27  <Field boolean zzag>
		result = obj;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #29  <Field Object result>
		zzae = zza1;
	//    8   14:aload_0         
	//    9   15:aload_2         
	//   10   16:putfield        #31  <Field zzb$zza zzae>
		zzaf = null;
	//   11   19:aload_0         
	//   12   20:aconst_null     
	//   13   21:putfield        #33  <Field zzr zzaf>
	//   14   24:return          
	}

	public static zzm zza(Object obj, zzb.zza zza1)
	{
		return new zzm(obj, zza1);
	//    0    0:new             #2   <Class zzm>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #40  <Method void zzm(Object, zzb$zza)>
	//    5    9:areturn         
	}

	public static zzm zzd(zzr zzr)
	{
		return new zzm(zzr);
	//    0    0:new             #2   <Class zzm>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #45  <Method void zzm(zzr)>
	//    4    8:areturn         
	}

	public boolean isSuccess()
	{
		return zzaf == null;
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field zzr zzaf>
	//    2    4:ifnonnull       9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	public final Object result;
	public final zzb.zza zzae;
	public final zzr zzaf;
	public boolean zzag;
}
