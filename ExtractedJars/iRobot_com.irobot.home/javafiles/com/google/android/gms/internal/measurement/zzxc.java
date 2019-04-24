// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.measurement;

import java.util.List;

// Referenced classes of package com.google.android.gms.internal.measurement:
//			zzvv

public final class zzxc extends RuntimeException
{

	public zzxc(zzvv zzvv)
	{
		super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
	//    0    0:aload_0         
	//    1    1:ldc1            #11  <String "Message was missing required fields.  (Lite runtime could not determine which fields were missing).">
	//    2    3:invokespecial   #14  <Method void RuntimeException(String)>
	//    3    6:aload_0         
	//    4    7:aconst_null     
	//    5    8:putfield        #16  <Field List zzccg>
	//    6   11:return          
	}

	private final List zzccg = null;
}
