// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import com.google.devtools.build.android.desugar.runtime.ThrowableExtension;
import java.io.PrintWriter;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzazs

final class zzazw extends zzazs
{

	zzazw()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void zzazs()>
	//    2    4:return          
	}

	public final void zza(Throwable throwable, PrintWriter printwriter)
	{
		ThrowableExtension.printStackTrace(throwable, printwriter);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokestatic    #16  <Method void ThrowableExtension.printStackTrace(Throwable, PrintWriter)>
	//    3    5:return          
	}
}
