// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.util;

import java.util.HashMap;

// Referenced classes of package com.google.android.gms.common.util:
//			ArrayUtils, zza

private static final class ArrayUtils$zza
{

	private final zza zzd(Object obj)
	{
		zza zza2 = (zza)zzzb.get(obj);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field HashMap zzzb>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #28  <Method Object HashMap.get(Object)>
	//    4    8:checkcast       #30  <Class zza>
	//    5   11:astore_3        
		zza zza1 = zza2;
	//    6   12:aload_3         
	//    7   13:astore_2        
		if(zza2 == null)
	//*   8   14:aload_3         
	//*   9   15:ifnonnull       36
		{
			zza1 = new zza();
	//   10   18:new             #30  <Class zza>
	//   11   21:dup             
	//   12   22:invokespecial   #31  <Method void zza()>
	//   13   25:astore_2        
			zzzb.put(obj, ((Object) (zza1)));
	//   14   26:aload_0         
	//   15   27:getfield        #21  <Field HashMap zzzb>
	//   16   30:aload_1         
	//   17   31:aload_2         
	//   18   32:invokevirtual   #35  <Method Object HashMap.put(Object, Object)>
	//   19   35:pop             
		}
		return zza1;
	//   20   36:aload_2         
	//   21   37:areturn         
	}

	final void zzb(Object obj)
	{
		obj = ((Object) (zzd(obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #39  <Method zza zzd(Object)>
	//    3    5:astore_1        
		obj.count = ((zza) (obj)).count + 1;
	//    4    6:aload_1         
	//    5    7:aload_1         
	//    6    8:getfield        #43  <Field int zza.count>
	//    7   11:iconst_1        
	//    8   12:iadd            
	//    9   13:putfield        #43  <Field int zza.count>
	//   10   16:return          
	}

	final void zzc(Object obj)
	{
		obj = ((Object) (zzd(obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #39  <Method zza zzd(Object)>
	//    3    5:astore_1        
		obj.count = ((zza) (obj)).count - 1;
	//    4    6:aload_1         
	//    5    7:aload_1         
	//    6    8:getfield        #43  <Field int zza.count>
	//    7   11:iconst_1        
	//    8   12:isub            
	//    9   13:putfield        #43  <Field int zza.count>
	//   10   16:return          
	}

	HashMap zzzb;

	ArrayUtils$zza(int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		zzzb = new HashMap(i);
	//    2    4:aload_0         
	//    3    5:new             #17  <Class HashMap>
	//    4    8:dup             
	//    5    9:iload_1         
	//    6   10:invokespecial   #19  <Method void HashMap(int)>
	//    7   13:putfield        #21  <Field HashMap zzzb>
	//    8   16:return          
	}
}
