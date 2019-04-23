// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.measurement;

import android.os.Binder;

// Referenced classes of package com.google.android.gms.internal.measurement:
//			zzsd

public final class zzsc
{

	public static Object zza(zzsd zzsd1)
	{
		Object obj = zzsd1.zzto();
	//    0    0:aload_0         
	//    1    1:invokeinterface #14  <Method Object zzsd.zzto()>
	//    2    6:astore_3        
		return obj;
	//    3    7:aload_3         
	//    4    8:areturn         
_L2:
		long l = Binder.clearCallingIdentity();
	//    5    9:invokestatic    #20  <Method long Binder.clearCallingIdentity()>
	//    6   12:lstore_1        
		zzsd1 = ((zzsd) (zzsd1.zzto()));
	//    7   13:aload_0         
	//    8   14:invokeinterface #14  <Method Object zzsd.zzto()>
	//    9   19:astore_0        
		Binder.restoreCallingIdentity(l);
	//   10   20:lload_1         
	//   11   21:invokestatic    #24  <Method void Binder.restoreCallingIdentity(long)>
		return ((Object) (zzsd1));
	//   12   24:aload_0         
	//   13   25:areturn         
		zzsd1;
	//   14   26:astore_0        
		Binder.restoreCallingIdentity(l);
	//   15   27:lload_1         
	//   16   28:invokestatic    #24  <Method void Binder.restoreCallingIdentity(long)>
		throw zzsd1;
	//   17   31:aload_0         
	//   18   32:athrow          
		SecurityException securityexception;
		securityexception;
	//   19   33:astore_3        
		if(true) goto _L2; else goto _L1
_L1:
	//*  20   34:goto            9
	}
}
