// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.measurement;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal.measurement:
//			zzxd, zzuo, zzxe, zzte, 
//			zzxy, zzwk

final class zzxf extends zzxd
{

	zzxf()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #9   <Method void zzxd()>
	//    2    4:return          
	}

	private static void zza(Object obj, zzxe zzxe1)
	{
		((zzuo)obj).zzbyd = zzxe1;
	//    0    0:aload_0         
	//    1    1:checkcast       #14  <Class zzuo>
	//    2    4:aload_1         
	//    3    5:putfield        #18  <Field zzxe zzuo.zzbyd>
	//    4    8:return          
	}

	final void zza(Object obj, int i, long l)
	{
		((zzxe)obj).zzb(i << 3, ((Object) (Long.valueOf(l))));
	//    0    0:aload_1         
	//    1    1:checkcast       #21  <Class zzxe>
	//    2    4:iload_2         
	//    3    5:iconst_3        
	//    4    6:ishl            
	//    5    7:lload_3         
	//    6    8:invokestatic    #27  <Method Long Long.valueOf(long)>
	//    7   11:invokevirtual   #31  <Method void zzxe.zzb(int, Object)>
	//    8   14:return          
	}

	final void zza(Object obj, int i, zzte zzte)
	{
		((zzxe)obj).zzb(i << 3 | 2, ((Object) (zzte)));
	//    0    0:aload_1         
	//    1    1:checkcast       #21  <Class zzxe>
	//    2    4:iload_2         
	//    3    5:iconst_3        
	//    4    6:ishl            
	//    5    7:iconst_2        
	//    6    8:ior             
	//    7    9:aload_3         
	//    8   10:invokevirtual   #31  <Method void zzxe.zzb(int, Object)>
	//    9   13:return          
	}

	final void zza(Object obj, int i, Object obj1)
	{
		((zzxe)obj).zzb(i << 3 | 3, ((Object) ((zzxe)obj1)));
	//    0    0:aload_1         
	//    1    1:checkcast       #21  <Class zzxe>
	//    2    4:iload_2         
	//    3    5:iconst_3        
	//    4    6:ishl            
	//    5    7:iconst_3        
	//    6    8:ior             
	//    7    9:aload_3         
	//    8   10:checkcast       #21  <Class zzxe>
	//    9   13:invokevirtual   #31  <Method void zzxe.zzb(int, Object)>
	//   10   16:return          
	}

	final void zza(Object obj, zzxy zzxy)
		throws IOException
	{
		((zzxe)obj).zzb(zzxy);
	//    0    0:aload_1         
	//    1    1:checkcast       #21  <Class zzxe>
	//    2    4:aload_2         
	//    3    5:invokevirtual   #39  <Method void zzxe.zzb(zzxy)>
	//    4    8:return          
	}

	final boolean zza(zzwk zzwk)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	final Object zzaf(Object obj)
	{
		obj = ((Object) ((zzxe)obj));
	//    0    0:aload_1         
	//    1    1:checkcast       #21  <Class zzxe>
	//    2    4:astore_1        
		((zzxe) (obj)).zzsw();
	//    3    5:aload_1         
	//    4    6:invokevirtual   #46  <Method void zzxe.zzsw()>
		return obj;
	//    5    9:aload_1         
	//    6   10:areturn         
	}

	final int zzai(Object obj)
	{
		return ((zzxe)obj).zzvx();
	//    0    0:aload_1         
	//    1    1:checkcast       #21  <Class zzxe>
	//    2    4:invokevirtual   #52  <Method int zzxe.zzvx()>
	//    3    7:ireturn         
	}

	final Object zzal(Object obj)
	{
		return ((Object) (((zzuo)obj).zzbyd));
	//    0    0:aload_1         
	//    1    1:checkcast       #14  <Class zzuo>
	//    2    4:getfield        #18  <Field zzxe zzuo.zzbyd>
	//    3    7:areturn         
	}

	final Object zzam(Object obj)
	{
		zzxe zzxe2 = ((zzuo)obj).zzbyd;
	//    0    0:aload_1         
	//    1    1:checkcast       #14  <Class zzuo>
	//    2    4:getfield        #18  <Field zzxe zzuo.zzbyd>
	//    3    7:astore_3        
		zzxe zzxe1 = zzxe2;
	//    4    8:aload_3         
	//    5    9:astore_2        
		if(zzxe2 == zzxe.zzyl())
	//*   6   10:aload_3         
	//*   7   11:invokestatic    #58  <Method zzxe zzxe.zzyl()>
	//*   8   14:if_acmpne       26
		{
			zzxe1 = zzxe.zzym();
	//    9   17:invokestatic    #61  <Method zzxe zzxe.zzym()>
	//   10   20:astore_2        
			zza(obj, zzxe1);
	//   11   21:aload_1         
	//   12   22:aload_2         
	//   13   23:invokestatic    #63  <Method void zza(Object, zzxe)>
		}
		return ((Object) (zzxe1));
	//   14   26:aload_2         
	//   15   27:areturn         
	}

	final int zzan(Object obj)
	{
		return ((zzxe)obj).zzyn();
	//    0    0:aload_1         
	//    1    1:checkcast       #21  <Class zzxe>
	//    2    4:invokevirtual   #67  <Method int zzxe.zzyn()>
	//    3    7:ireturn         
	}

	final void zzb(Object obj, int i, long l)
	{
		((zzxe)obj).zzb(i << 3 | 1, ((Object) (Long.valueOf(l))));
	//    0    0:aload_1         
	//    1    1:checkcast       #21  <Class zzxe>
	//    2    4:iload_2         
	//    3    5:iconst_3        
	//    4    6:ishl            
	//    5    7:iconst_1        
	//    6    8:ior             
	//    7    9:lload_3         
	//    8   10:invokestatic    #27  <Method Long Long.valueOf(long)>
	//    9   13:invokevirtual   #31  <Method void zzxe.zzb(int, Object)>
	//   10   16:return          
	}

	final void zzc(Object obj, int i, int j)
	{
		((zzxe)obj).zzb(i << 3 | 5, ((Object) (Integer.valueOf(j))));
	//    0    0:aload_1         
	//    1    1:checkcast       #21  <Class zzxe>
	//    2    4:iload_2         
	//    3    5:iconst_3        
	//    4    6:ishl            
	//    5    7:iconst_5        
	//    6    8:ior             
	//    7    9:iload_3         
	//    8   10:invokestatic    #74  <Method Integer Integer.valueOf(int)>
	//    9   13:invokevirtual   #31  <Method void zzxe.zzb(int, Object)>
	//   10   16:return          
	}

	final void zzc(Object obj, zzxy zzxy)
		throws IOException
	{
		((zzxe)obj).zza(zzxy);
	//    0    0:aload_1         
	//    1    1:checkcast       #21  <Class zzxe>
	//    2    4:aload_2         
	//    3    5:invokevirtual   #76  <Method void zzxe.zza(zzxy)>
	//    4    8:return          
	}

	final void zzf(Object obj, Object obj1)
	{
		zza(obj, (zzxe)obj1);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:checkcast       #21  <Class zzxe>
	//    3    5:invokestatic    #63  <Method void zza(Object, zzxe)>
	//    4    8:return          
	}

	final void zzg(Object obj, Object obj1)
	{
		zza(obj, (zzxe)obj1);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:checkcast       #21  <Class zzxe>
	//    3    5:invokestatic    #63  <Method void zza(Object, zzxe)>
	//    4    8:return          
	}

	final Object zzh(Object obj, Object obj1)
	{
		obj = ((Object) ((zzxe)obj));
	//    0    0:aload_1         
	//    1    1:checkcast       #21  <Class zzxe>
	//    2    4:astore_1        
		obj1 = ((Object) ((zzxe)obj1));
	//    3    5:aload_2         
	//    4    6:checkcast       #21  <Class zzxe>
	//    5    9:astore_2        
		if(((zzxe) (obj1)).equals(((Object) (zzxe.zzyl()))))
	//*   6   10:aload_2         
	//*   7   11:invokestatic    #58  <Method zzxe zzxe.zzyl()>
	//*   8   14:invokevirtual   #85  <Method boolean zzxe.equals(Object)>
	//*   9   17:ifeq            22
			return obj;
	//   10   20:aload_1         
	//   11   21:areturn         
		else
			return ((Object) (zzxe.zza(((zzxe) (obj)), ((zzxe) (obj1)))));
	//   12   22:aload_1         
	//   13   23:aload_2         
	//   14   24:invokestatic    #88  <Method zzxe zzxe.zza(zzxe, zzxe)>
	//   15   27:areturn         
	}

	final void zzy(Object obj)
	{
		((zzuo)obj).zzbyd.zzsw();
	//    0    0:aload_1         
	//    1    1:checkcast       #14  <Class zzuo>
	//    2    4:getfield        #18  <Field zzxe zzuo.zzbyd>
	//    3    7:invokevirtual   #46  <Method void zzxe.zzsw()>
	//    4   10:return          
	}

	final Object zzyk()
	{
		return ((Object) (zzxe.zzym()));
	//    0    0:invokestatic    #61  <Method zzxe zzxe.zzym()>
	//    1    3:areturn         
	}
}
