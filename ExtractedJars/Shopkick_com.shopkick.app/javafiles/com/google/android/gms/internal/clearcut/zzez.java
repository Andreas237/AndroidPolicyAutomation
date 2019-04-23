// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.clearcut;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal.clearcut:
//			zzex, zzcg, zzey, zzbb, 
//			zzfr

final class zzez extends zzex
{

	zzez()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #9   <Method void zzex()>
	//    2    4:return          
	}

	private static void zza(Object obj, zzey zzey1)
	{
		((zzcg)obj).zzjp = zzey1;
	//    0    0:aload_0         
	//    1    1:checkcast       #14  <Class zzcg>
	//    2    4:aload_1         
	//    3    5:putfield        #18  <Field zzey zzcg.zzjp>
	//    4    8:return          
	}

	final void zza(Object obj, int i, long l)
	{
		((zzey)obj).zzb(i << 3, ((Object) (Long.valueOf(l))));
	//    0    0:aload_1         
	//    1    1:checkcast       #21  <Class zzey>
	//    2    4:iload_2         
	//    3    5:iconst_3        
	//    4    6:ishl            
	//    5    7:lload_3         
	//    6    8:invokestatic    #27  <Method Long Long.valueOf(long)>
	//    7   11:invokevirtual   #31  <Method void zzey.zzb(int, Object)>
	//    8   14:return          
	}

	final void zza(Object obj, int i, zzbb zzbb)
	{
		((zzey)obj).zzb(i << 3 | 2, ((Object) (zzbb)));
	//    0    0:aload_1         
	//    1    1:checkcast       #21  <Class zzey>
	//    2    4:iload_2         
	//    3    5:iconst_3        
	//    4    6:ishl            
	//    5    7:iconst_2        
	//    6    8:ior             
	//    7    9:aload_3         
	//    8   10:invokevirtual   #31  <Method void zzey.zzb(int, Object)>
	//    9   13:return          
	}

	final void zza(Object obj, zzfr zzfr)
		throws IOException
	{
		((zzey)obj).zzb(zzfr);
	//    0    0:aload_1         
	//    1    1:checkcast       #21  <Class zzey>
	//    2    4:aload_2         
	//    3    5:invokevirtual   #38  <Method void zzey.zzb(zzfr)>
	//    4    8:return          
	}

	final void zzc(Object obj)
	{
		((zzcg)obj).zzjp.zzv();
	//    0    0:aload_1         
	//    1    1:checkcast       #14  <Class zzcg>
	//    2    4:getfield        #18  <Field zzey zzcg.zzjp>
	//    3    7:invokevirtual   #44  <Method void zzey.zzv()>
	//    4   10:return          
	}

	final void zzc(Object obj, zzfr zzfr)
		throws IOException
	{
		((zzey)obj).zza(zzfr);
	//    0    0:aload_1         
	//    1    1:checkcast       #21  <Class zzey>
	//    2    4:aload_2         
	//    3    5:invokevirtual   #46  <Method void zzey.zza(zzfr)>
	//    4    8:return          
	}

	final Object zzdz()
	{
		return ((Object) (zzey.zzeb()));
	//    0    0:invokestatic    #52  <Method zzey zzey.zzeb()>
	//    1    3:areturn         
	}

	final void zze(Object obj, Object obj1)
	{
		zza(obj, (zzey)obj1);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:checkcast       #21  <Class zzey>
	//    3    5:invokestatic    #56  <Method void zza(Object, zzey)>
	//    4    8:return          
	}

	final void zzf(Object obj, Object obj1)
	{
		zza(obj, (zzey)obj1);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:checkcast       #21  <Class zzey>
	//    3    5:invokestatic    #56  <Method void zza(Object, zzey)>
	//    4    8:return          
	}

	final Object zzg(Object obj, Object obj1)
	{
		obj = ((Object) ((zzey)obj));
	//    0    0:aload_1         
	//    1    1:checkcast       #21  <Class zzey>
	//    2    4:astore_1        
		obj1 = ((Object) ((zzey)obj1));
	//    3    5:aload_2         
	//    4    6:checkcast       #21  <Class zzey>
	//    5    9:astore_2        
		if(((zzey) (obj1)).equals(((Object) (zzey.zzea()))))
	//*   6   10:aload_2         
	//*   7   11:invokestatic    #62  <Method zzey zzey.zzea()>
	//*   8   14:invokevirtual   #66  <Method boolean zzey.equals(Object)>
	//*   9   17:ifeq            22
			return obj;
	//   10   20:aload_1         
	//   11   21:areturn         
		else
			return ((Object) (zzey.zza(((zzey) (obj)), ((zzey) (obj1)))));
	//   12   22:aload_1         
	//   13   23:aload_2         
	//   14   24:invokestatic    #69  <Method zzey zzey.zza(zzey, zzey)>
	//   15   27:areturn         
	}

	final int zzm(Object obj)
	{
		return ((zzey)obj).zzas();
	//    0    0:aload_1         
	//    1    1:checkcast       #21  <Class zzey>
	//    2    4:invokevirtual   #75  <Method int zzey.zzas()>
	//    3    7:ireturn         
	}

	final Object zzq(Object obj)
	{
		return ((Object) (((zzcg)obj).zzjp));
	//    0    0:aload_1         
	//    1    1:checkcast       #14  <Class zzcg>
	//    2    4:getfield        #18  <Field zzey zzcg.zzjp>
	//    3    7:areturn         
	}

	final int zzr(Object obj)
	{
		return ((zzey)obj).zzec();
	//    0    0:aload_1         
	//    1    1:checkcast       #21  <Class zzey>
	//    2    4:invokevirtual   #81  <Method int zzey.zzec()>
	//    3    7:ireturn         
	}
}
