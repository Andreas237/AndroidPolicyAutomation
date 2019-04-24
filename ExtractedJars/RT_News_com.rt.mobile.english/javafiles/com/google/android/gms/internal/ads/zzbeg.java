// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzbee, zzbbo, zzbef, zzbah, 
//			zzbey, zzbdl

final class zzbeg extends zzbee
{

	zzbeg()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #9   <Method void zzbee()>
	//    2    4:return          
	}

	private static void zza(Object obj, zzbef zzbef1)
	{
		((zzbbo)obj).zzdtt = zzbef1;
	//    0    0:aload_0         
	//    1    1:checkcast       #14  <Class zzbbo>
	//    2    4:aload_1         
	//    3    5:putfield        #18  <Field zzbef zzbbo.zzdtt>
	//    4    8:return          
	}

	final void zza(Object obj, int i, long l)
	{
		((zzbef)obj).zzb(i << 3, ((Object) (Long.valueOf(l))));
	//    0    0:aload_1         
	//    1    1:checkcast       #21  <Class zzbef>
	//    2    4:iload_2         
	//    3    5:iconst_3        
	//    4    6:ishl            
	//    5    7:lload_3         
	//    6    8:invokestatic    #27  <Method Long Long.valueOf(long)>
	//    7   11:invokevirtual   #31  <Method void zzbef.zzb(int, Object)>
	//    8   14:return          
	}

	final void zza(Object obj, int i, zzbah zzbah)
	{
		((zzbef)obj).zzb(i << 3 | 2, ((Object) (zzbah)));
	//    0    0:aload_1         
	//    1    1:checkcast       #21  <Class zzbef>
	//    2    4:iload_2         
	//    3    5:iconst_3        
	//    4    6:ishl            
	//    5    7:iconst_2        
	//    6    8:ior             
	//    7    9:aload_3         
	//    8   10:invokevirtual   #31  <Method void zzbef.zzb(int, Object)>
	//    9   13:return          
	}

	final void zza(Object obj, int i, Object obj1)
	{
		((zzbef)obj).zzb(i << 3 | 3, ((Object) ((zzbef)obj1)));
	//    0    0:aload_1         
	//    1    1:checkcast       #21  <Class zzbef>
	//    2    4:iload_2         
	//    3    5:iconst_3        
	//    4    6:ishl            
	//    5    7:iconst_3        
	//    6    8:ior             
	//    7    9:aload_3         
	//    8   10:checkcast       #21  <Class zzbef>
	//    9   13:invokevirtual   #31  <Method void zzbef.zzb(int, Object)>
	//   10   16:return          
	}

	final void zza(Object obj, zzbey zzbey)
		throws IOException
	{
		((zzbef)obj).zzb(zzbey);
	//    0    0:aload_1         
	//    1    1:checkcast       #21  <Class zzbef>
	//    2    4:aload_2         
	//    3    5:invokevirtual   #39  <Method void zzbef.zzb(zzbey)>
	//    4    8:return          
	}

	final boolean zza(zzbdl zzbdl)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	final Object zzac(Object obj)
	{
		return ((Object) (((zzbbo)obj).zzdtt));
	//    0    0:aload_1         
	//    1    1:checkcast       #14  <Class zzbbo>
	//    2    4:getfield        #18  <Field zzbef zzbbo.zzdtt>
	//    3    7:areturn         
	}

	final Object zzad(Object obj)
	{
		zzbef zzbef2 = ((zzbbo)obj).zzdtt;
	//    0    0:aload_1         
	//    1    1:checkcast       #14  <Class zzbbo>
	//    2    4:getfield        #18  <Field zzbef zzbbo.zzdtt>
	//    3    7:astore_3        
		zzbef zzbef1 = zzbef2;
	//    4    8:aload_3         
	//    5    9:astore_2        
		if(zzbef2 == zzbef.zzagc())
	//*   6   10:aload_3         
	//*   7   11:invokestatic    #48  <Method zzbef zzbef.zzagc()>
	//*   8   14:if_acmpne       26
		{
			zzbef1 = zzbef.zzagd();
	//    9   17:invokestatic    #51  <Method zzbef zzbef.zzagd()>
	//   10   20:astore_2        
			zza(obj, zzbef1);
	//   11   21:aload_1         
	//   12   22:aload_2         
	//   13   23:invokestatic    #53  <Method void zza(Object, zzbef)>
		}
		return ((Object) (zzbef1));
	//   14   26:aload_2         
	//   15   27:areturn         
	}

	final int zzae(Object obj)
	{
		return ((zzbef)obj).zzage();
	//    0    0:aload_1         
	//    1    1:checkcast       #21  <Class zzbef>
	//    2    4:invokevirtual   #59  <Method int zzbef.zzage()>
	//    3    7:ireturn         
	}

	final Object zzagb()
	{
		return ((Object) (zzbef.zzagd()));
	//    0    0:invokestatic    #51  <Method zzbef zzbef.zzagd()>
	//    1    3:areturn         
	}

	final void zzb(Object obj, int i, long l)
	{
		((zzbef)obj).zzb(i << 3 | 1, ((Object) (Long.valueOf(l))));
	//    0    0:aload_1         
	//    1    1:checkcast       #21  <Class zzbef>
	//    2    4:iload_2         
	//    3    5:iconst_3        
	//    4    6:ishl            
	//    5    7:iconst_1        
	//    6    8:ior             
	//    7    9:lload_3         
	//    8   10:invokestatic    #27  <Method Long Long.valueOf(long)>
	//    9   13:invokevirtual   #31  <Method void zzbef.zzb(int, Object)>
	//   10   16:return          
	}

	final void zzc(Object obj, int i, int j)
	{
		((zzbef)obj).zzb(i << 3 | 5, ((Object) (Integer.valueOf(j))));
	//    0    0:aload_1         
	//    1    1:checkcast       #21  <Class zzbef>
	//    2    4:iload_2         
	//    3    5:iconst_3        
	//    4    6:ishl            
	//    5    7:iconst_5        
	//    6    8:ior             
	//    7    9:iload_3         
	//    8   10:invokestatic    #68  <Method Integer Integer.valueOf(int)>
	//    9   13:invokevirtual   #31  <Method void zzbef.zzb(int, Object)>
	//   10   16:return          
	}

	final void zzc(Object obj, zzbey zzbey)
		throws IOException
	{
		((zzbef)obj).zza(zzbey);
	//    0    0:aload_1         
	//    1    1:checkcast       #21  <Class zzbef>
	//    2    4:aload_2         
	//    3    5:invokevirtual   #70  <Method void zzbef.zza(zzbey)>
	//    4    8:return          
	}

	final void zze(Object obj, Object obj1)
	{
		zza(obj, (zzbef)obj1);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:checkcast       #21  <Class zzbef>
	//    3    5:invokestatic    #53  <Method void zza(Object, zzbef)>
	//    4    8:return          
	}

	final void zzf(Object obj, Object obj1)
	{
		zza(obj, (zzbef)obj1);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:checkcast       #21  <Class zzbef>
	//    3    5:invokestatic    #53  <Method void zza(Object, zzbef)>
	//    4    8:return          
	}

	final Object zzg(Object obj, Object obj1)
	{
		obj = ((Object) ((zzbef)obj));
	//    0    0:aload_1         
	//    1    1:checkcast       #21  <Class zzbef>
	//    2    4:astore_1        
		obj1 = ((Object) ((zzbef)obj1));
	//    3    5:aload_2         
	//    4    6:checkcast       #21  <Class zzbef>
	//    5    9:astore_2        
		if(((zzbef) (obj1)).equals(((Object) (zzbef.zzagc()))))
	//*   6   10:aload_2         
	//*   7   11:invokestatic    #48  <Method zzbef zzbef.zzagc()>
	//*   8   14:invokevirtual   #79  <Method boolean zzbef.equals(Object)>
	//*   9   17:ifeq            22
			return obj;
	//   10   20:aload_1         
	//   11   21:areturn         
		else
			return ((Object) (zzbef.zza(((zzbef) (obj)), ((zzbef) (obj1)))));
	//   12   22:aload_1         
	//   13   23:aload_2         
	//   14   24:invokestatic    #82  <Method zzbef zzbef.zza(zzbef, zzbef)>
	//   15   27:areturn         
	}

	final void zzo(Object obj)
	{
		((zzbbo)obj).zzdtt.zzaaz();
	//    0    0:aload_1         
	//    1    1:checkcast       #14  <Class zzbbo>
	//    2    4:getfield        #18  <Field zzbef zzbbo.zzdtt>
	//    3    7:invokevirtual   #87  <Method void zzbef.zzaaz()>
	//    4   10:return          
	}

	final Object zzv(Object obj)
	{
		obj = ((Object) ((zzbef)obj));
	//    0    0:aload_1         
	//    1    1:checkcast       #21  <Class zzbef>
	//    2    4:astore_1        
		((zzbef) (obj)).zzaaz();
	//    3    5:aload_1         
	//    4    6:invokevirtual   #87  <Method void zzbef.zzaaz()>
		return obj;
	//    5    9:aload_1         
	//    6   10:areturn         
	}

	final int zzy(Object obj)
	{
		return ((zzbef)obj).zzacw();
	//    0    0:aload_1         
	//    1    1:checkcast       #21  <Class zzbef>
	//    2    4:invokevirtual   #92  <Method int zzbef.zzacw()>
	//    3    7:ireturn         
	}
}
