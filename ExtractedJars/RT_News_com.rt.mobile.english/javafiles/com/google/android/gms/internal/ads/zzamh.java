// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzakb

public final class zzamh
{

	public zzamh()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
		zzctu = ((Map) (new ConcurrentHashMap()));
	//    2    4:aload_0         
	//    3    5:new             #16  <Class ConcurrentHashMap>
	//    4    8:dup             
	//    5    9:invokespecial   #17  <Method void ConcurrentHashMap()>
	//    6   12:putfield        #19  <Field Map zzctu>
		zzctv = new AtomicInteger(0);
	//    7   15:aload_0         
	//    8   16:new             #21  <Class AtomicInteger>
	//    9   19:dup             
	//   10   20:iconst_0        
	//   11   21:invokespecial   #24  <Method void AtomicInteger(int)>
	//   12   24:putfield        #26  <Field AtomicInteger zzctv>
	//   13   27:return          
	}

	public final Bitmap zza(Integer integer)
	{
		return (Bitmap)zzctu.get(((Object) (integer)));
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field Map zzctu>
	//    2    4:aload_1         
	//    3    5:invokeinterface #35  <Method Object Map.get(Object)>
	//    4   10:checkcast       #37  <Class Bitmap>
	//    5   13:areturn         
	}

	public final int zzb(Bitmap bitmap)
	{
		if(bitmap == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       11
		{
			zzakb.zzck("Bitmap is null. Skipping putting into the Memory Map.");
	//    2    4:ldc1            #41  <String "Bitmap is null. Skipping putting into the Memory Map.">
	//    3    6:invokestatic    #47  <Method void zzakb.zzck(String)>
			return -1;
	//    4    9:iconst_m1       
	//    5   10:ireturn         
		} else
		{
			int i = zzctv.getAndIncrement();
	//    6   11:aload_0         
	//    7   12:getfield        #26  <Field AtomicInteger zzctv>
	//    8   15:invokevirtual   #51  <Method int AtomicInteger.getAndIncrement()>
	//    9   18:istore_2        
			zzctu.put(((Object) (Integer.valueOf(i))), ((Object) (bitmap)));
	//   10   19:aload_0         
	//   11   20:getfield        #19  <Field Map zzctu>
	//   12   23:iload_2         
	//   13   24:invokestatic    #57  <Method Integer Integer.valueOf(int)>
	//   14   27:aload_1         
	//   15   28:invokeinterface #61  <Method Object Map.put(Object, Object)>
	//   16   33:pop             
			return i;
	//   17   34:iload_2         
	//   18   35:ireturn         
		}
	}

	public final void zzb(Integer integer)
	{
		zzctu.remove(((Object) (integer)));
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field Map zzctu>
	//    2    4:aload_1         
	//    3    5:invokeinterface #65  <Method Object Map.remove(Object)>
	//    4   10:pop             
	//    5   11:return          
	}

	private Map zzctu;
	private AtomicInteger zzctv;
}
