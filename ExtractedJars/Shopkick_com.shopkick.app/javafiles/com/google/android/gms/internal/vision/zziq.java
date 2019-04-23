// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.vision;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal.vision:
//			zzio, zzfy, zzip, zzeo, 
//			zzjj, zzhv

final class zziq extends zzio
{

	zziq()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #9   <Method void zzio()>
	//    2    4:return          
	}

	private static void zza(Object obj, zzip zzip1)
	{
		((zzfy)obj).zzwj = zzip1;
	//    0    0:aload_0         
	//    1    1:checkcast       #14  <Class zzfy>
	//    2    4:aload_1         
	//    3    5:putfield        #18  <Field zzip zzfy.zzwj>
	//    4    8:return          
	}

	final void zza(Object obj, int i, long l)
	{
		((zzip)obj).zzb(i << 3, ((Object) (Long.valueOf(l))));
	//    0    0:aload_1         
	//    1    1:checkcast       #21  <Class zzip>
	//    2    4:iload_2         
	//    3    5:iconst_3        
	//    4    6:ishl            
	//    5    7:lload_3         
	//    6    8:invokestatic    #27  <Method Long Long.valueOf(long)>
	//    7   11:invokevirtual   #31  <Method void zzip.zzb(int, Object)>
	//    8   14:return          
	}

	final void zza(Object obj, int i, zzeo zzeo)
	{
		((zzip)obj).zzb(i << 3 | 2, ((Object) (zzeo)));
	//    0    0:aload_1         
	//    1    1:checkcast       #21  <Class zzip>
	//    2    4:iload_2         
	//    3    5:iconst_3        
	//    4    6:ishl            
	//    5    7:iconst_2        
	//    6    8:ior             
	//    7    9:aload_3         
	//    8   10:invokevirtual   #31  <Method void zzip.zzb(int, Object)>
	//    9   13:return          
	}

	final void zza(Object obj, int i, Object obj1)
	{
		((zzip)obj).zzb(i << 3 | 3, ((Object) ((zzip)obj1)));
	//    0    0:aload_1         
	//    1    1:checkcast       #21  <Class zzip>
	//    2    4:iload_2         
	//    3    5:iconst_3        
	//    4    6:ishl            
	//    5    7:iconst_3        
	//    6    8:ior             
	//    7    9:aload_3         
	//    8   10:checkcast       #21  <Class zzip>
	//    9   13:invokevirtual   #31  <Method void zzip.zzb(int, Object)>
	//   10   16:return          
	}

	final void zza(Object obj, zzjj zzjj)
		throws IOException
	{
		((zzip)obj).zzb(zzjj);
	//    0    0:aload_1         
	//    1    1:checkcast       #21  <Class zzip>
	//    2    4:aload_2         
	//    3    5:invokevirtual   #39  <Method void zzip.zzb(zzjj)>
	//    4    8:return          
	}

	final boolean zza(zzhv zzhv)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	final void zzb(Object obj, int i, long l)
	{
		((zzip)obj).zzb(i << 3 | 1, ((Object) (Long.valueOf(l))));
	//    0    0:aload_1         
	//    1    1:checkcast       #21  <Class zzip>
	//    2    4:iload_2         
	//    3    5:iconst_3        
	//    4    6:ishl            
	//    5    7:iconst_1        
	//    6    8:ior             
	//    7    9:lload_3         
	//    8   10:invokestatic    #27  <Method Long Long.valueOf(long)>
	//    9   13:invokevirtual   #31  <Method void zzip.zzb(int, Object)>
	//   10   16:return          
	}

	final void zzc(Object obj, int i, int j)
	{
		((zzip)obj).zzb(i << 3 | 5, ((Object) (Integer.valueOf(j))));
	//    0    0:aload_1         
	//    1    1:checkcast       #21  <Class zzip>
	//    2    4:iload_2         
	//    3    5:iconst_3        
	//    4    6:ishl            
	//    5    7:iconst_5        
	//    6    8:ior             
	//    7    9:iload_3         
	//    8   10:invokestatic    #48  <Method Integer Integer.valueOf(int)>
	//    9   13:invokevirtual   #31  <Method void zzip.zzb(int, Object)>
	//   10   16:return          
	}

	final void zzc(Object obj, zzjj zzjj)
		throws IOException
	{
		((zzip)obj).zza(zzjj);
	//    0    0:aload_1         
	//    1    1:checkcast       #21  <Class zzip>
	//    2    4:aload_2         
	//    3    5:invokevirtual   #50  <Method void zzip.zza(zzjj)>
	//    4    8:return          
	}

	final void zze(Object obj)
	{
		((zzfy)obj).zzwj.zzci();
	//    0    0:aload_1         
	//    1    1:checkcast       #14  <Class zzfy>
	//    2    4:getfield        #18  <Field zzip zzfy.zzwj>
	//    3    7:invokevirtual   #55  <Method void zzip.zzci()>
	//    4   10:return          
	}

	final void zze(Object obj, Object obj1)
	{
		zza(obj, (zzip)obj1);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:checkcast       #21  <Class zzip>
	//    3    5:invokestatic    #58  <Method void zza(Object, zzip)>
	//    4    8:return          
	}

	final void zzf(Object obj, Object obj1)
	{
		zza(obj, (zzip)obj1);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:checkcast       #21  <Class zzip>
	//    3    5:invokestatic    #58  <Method void zza(Object, zzip)>
	//    4    8:return          
	}

	final Object zzg(Object obj, Object obj1)
	{
		obj = ((Object) ((zzip)obj));
	//    0    0:aload_1         
	//    1    1:checkcast       #21  <Class zzip>
	//    2    4:astore_1        
		obj1 = ((Object) ((zzip)obj1));
	//    3    5:aload_2         
	//    4    6:checkcast       #21  <Class zzip>
	//    5    9:astore_2        
		if(((zzip) (obj1)).equals(((Object) (zzip.zzhe()))))
	//*   6   10:aload_2         
	//*   7   11:invokestatic    #65  <Method zzip zzip.zzhe()>
	//*   8   14:invokevirtual   #69  <Method boolean zzip.equals(Object)>
	//*   9   17:ifeq            22
			return obj;
	//   10   20:aload_1         
	//   11   21:areturn         
		else
			return ((Object) (zzip.zza(((zzip) (obj)), ((zzip) (obj1)))));
	//   12   22:aload_1         
	//   13   23:aload_2         
	//   14   24:invokestatic    #72  <Method zzip zzip.zza(zzip, zzip)>
	//   15   27:areturn         
	}

	final Object zzhd()
	{
		return ((Object) (zzip.zzhf()));
	//    0    0:invokestatic    #77  <Method zzip zzip.zzhf()>
	//    1    3:areturn         
	}

	final Object zzm(Object obj)
	{
		obj = ((Object) ((zzip)obj));
	//    0    0:aload_1         
	//    1    1:checkcast       #21  <Class zzip>
	//    2    4:astore_1        
		((zzip) (obj)).zzci();
	//    3    5:aload_1         
	//    4    6:invokevirtual   #55  <Method void zzip.zzci()>
		return obj;
	//    5    9:aload_1         
	//    6   10:areturn         
	}

	final int zzp(Object obj)
	{
		return ((zzip)obj).zzeq();
	//    0    0:aload_1         
	//    1    1:checkcast       #21  <Class zzip>
	//    2    4:invokevirtual   #85  <Method int zzip.zzeq()>
	//    3    7:ireturn         
	}

	final Object zzt(Object obj)
	{
		return ((Object) (((zzfy)obj).zzwj));
	//    0    0:aload_1         
	//    1    1:checkcast       #14  <Class zzfy>
	//    2    4:getfield        #18  <Field zzip zzfy.zzwj>
	//    3    7:areturn         
	}

	final Object zzu(Object obj)
	{
		zzip zzip2 = ((zzfy)obj).zzwj;
	//    0    0:aload_1         
	//    1    1:checkcast       #14  <Class zzfy>
	//    2    4:getfield        #18  <Field zzip zzfy.zzwj>
	//    3    7:astore_3        
		zzip zzip1 = zzip2;
	//    4    8:aload_3         
	//    5    9:astore_2        
		if(zzip2 == zzip.zzhe())
	//*   6   10:aload_3         
	//*   7   11:invokestatic    #65  <Method zzip zzip.zzhe()>
	//*   8   14:if_acmpne       26
		{
			zzip1 = zzip.zzhf();
	//    9   17:invokestatic    #77  <Method zzip zzip.zzhf()>
	//   10   20:astore_2        
			zza(obj, zzip1);
	//   11   21:aload_1         
	//   12   22:aload_2         
	//   13   23:invokestatic    #58  <Method void zza(Object, zzip)>
		}
		return ((Object) (zzip1));
	//   14   26:aload_2         
	//   15   27:areturn         
	}

	final int zzv(Object obj)
	{
		return ((zzip)obj).zzhg();
	//    0    0:aload_1         
	//    1    1:checkcast       #21  <Class zzip>
	//    2    4:invokevirtual   #91  <Method int zzip.zzhg()>
	//    3    7:ireturn         
	}
}
