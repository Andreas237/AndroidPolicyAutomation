// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.cast;

import com.google.android.gms.common.api.*;

// Referenced classes of package com.google.android.gms.internal.cast:
//			zzcm, zzbl

final class zzbq
	implements ResultCallback
{

	zzbq(zzbl zzbl, long l)
	{
		zzth = zzbl;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field zzbl zzth>
		zztm = l;
	//    3    5:aload_0         
	//    4    6:lload_2         
	//    5    7:putfield        #17  <Field long zztm>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #20  <Method void Object()>
	//    8   14:return          
	}

	public final void onResult(Result result)
	{
		result = ((Result) ((Status)result));
	//    0    0:aload_1         
	//    1    1:checkcast       #25  <Class Status>
	//    2    4:astore_1        
		if(!((Status) (result)).isSuccess())
	//*   3    5:aload_1         
	//*   4    6:invokevirtual   #29  <Method boolean Status.isSuccess()>
	//*   5    9:ifne            27
			((zzcm) (zzth)).zza(zztm, ((Status) (result)).getStatusCode());
	//    6   12:aload_0         
	//    7   13:getfield        #15  <Field zzbl zzth>
	//    8   16:aload_0         
	//    9   17:getfield        #17  <Field long zztm>
	//   10   20:aload_1         
	//   11   21:invokevirtual   #33  <Method int Status.getStatusCode()>
	//   12   24:invokevirtual   #39  <Method void zzcm.zza(long, int)>
	//   13   27:return          
	}

	private final zzbl zzth;
	private final long zztm;
}
