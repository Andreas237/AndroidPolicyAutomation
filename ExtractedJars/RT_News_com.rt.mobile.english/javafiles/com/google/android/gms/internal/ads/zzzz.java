// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import com.google.android.gms.ads.internal.zzbv;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzzy, zzakk

final class zzzz
	implements android.content.DialogInterface.OnClickListener
{

	zzzz(zzzy zzzy1)
	{
		zzbvx = zzzy1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field zzzy zzbvx>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void Object()>
	//    5    9:return          
	}

	public final void onClick(DialogInterface dialoginterface, int i)
	{
		dialoginterface = ((DialogInterface) (zzbvx.createIntent()));
	//    0    0:aload_0         
	//    1    1:getfield        #12  <Field zzzy zzbvx>
	//    2    4:invokevirtual   #24  <Method android.content.Intent zzzy.createIntent()>
	//    3    7:astore_1        
		zzbv.zzek();
	//    4    8:invokestatic    #30  <Method zzakk zzbv.zzek()>
	//    5   11:pop             
		zzakk.zza(zzzy.zza(zzbvx), ((android.content.Intent) (dialoginterface)));
	//    6   12:aload_0         
	//    7   13:getfield        #12  <Field zzzy zzbvx>
	//    8   16:invokestatic    #34  <Method android.content.Context zzzy.zza(zzzy)>
	//    9   19:aload_1         
	//   10   20:invokestatic    #39  <Method void zzakk.zza(android.content.Context, android.content.Intent)>
	//   11   23:return          
	}

	private final zzzy zzbvx;
}
