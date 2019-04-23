// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.google.android.gms.internal.ads:
//			wx

public final class zi
{

	public zi()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		a = ((Map) (new ConcurrentHashMap()));
	//    2    4:aload_0         
	//    3    5:new             #15  <Class ConcurrentHashMap>
	//    4    8:dup             
	//    5    9:invokespecial   #16  <Method void ConcurrentHashMap()>
	//    6   12:putfield        #18  <Field Map a>
		b = new AtomicInteger(0);
	//    7   15:aload_0         
	//    8   16:new             #20  <Class AtomicInteger>
	//    9   19:dup             
	//   10   20:iconst_0        
	//   11   21:invokespecial   #23  <Method void AtomicInteger(int)>
	//   12   24:putfield        #25  <Field AtomicInteger b>
	//   13   27:return          
	}

	public final int a(Bitmap bitmap)
	{
		if(bitmap == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       11
		{
			wx.b("Bitmap is null. Skipping putting into the Memory Map.");
	//    2    4:ldc1            #29  <String "Bitmap is null. Skipping putting into the Memory Map.">
	//    3    6:invokestatic    #34  <Method void wx.b(String)>
			return -1;
	//    4    9:iconst_m1       
	//    5   10:ireturn         
		} else
		{
			int i = b.getAndIncrement();
	//    6   11:aload_0         
	//    7   12:getfield        #25  <Field AtomicInteger b>
	//    8   15:invokevirtual   #38  <Method int AtomicInteger.getAndIncrement()>
	//    9   18:istore_2        
			a.put(((Object) (Integer.valueOf(i))), ((Object) (bitmap)));
	//   10   19:aload_0         
	//   11   20:getfield        #18  <Field Map a>
	//   12   23:iload_2         
	//   13   24:invokestatic    #44  <Method Integer Integer.valueOf(int)>
	//   14   27:aload_1         
	//   15   28:invokeinterface #50  <Method Object Map.put(Object, Object)>
	//   16   33:pop             
			return i;
	//   17   34:iload_2         
	//   18   35:ireturn         
		}
	}

	public final Bitmap a(Integer integer)
	{
		return (Bitmap)a.get(((Object) (integer)));
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field Map a>
	//    2    4:aload_1         
	//    3    5:invokeinterface #55  <Method Object Map.get(Object)>
	//    4   10:checkcast       #57  <Class Bitmap>
	//    5   13:areturn         
	}

	public final void b(Integer integer)
	{
		a.remove(((Object) (integer)));
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field Map a>
	//    2    4:aload_1         
	//    3    5:invokeinterface #61  <Method Object Map.remove(Object)>
	//    4   10:pop             
	//    5   11:return          
	}

	private Map a;
	private AtomicInteger b;
}
