// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.net.Uri;
import com.google.android.gms.ads.internal.zzbv;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzall, zzakk

final class zzalm
	implements android.content.DialogInterface.OnClickListener
{

	zzalm(zzall zzall1)
	{
		zzcst = zzall1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field zzall zzcst>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void Object()>
	//    5    9:return          
	}

	public final void onClick(DialogInterface dialoginterface, int i)
	{
		zzbv.zzek();
	//    0    0:invokestatic    #24  <Method zzakk zzbv.zzek()>
	//    1    3:pop             
		zzakk.zza(zzcst.val$context, Uri.parse("https://support.google.com/dfp_premium/answer/7160685#push"));
	//    2    4:aload_0         
	//    3    5:getfield        #12  <Field zzall zzcst>
	//    4    8:getfield        #30  <Field android.content.Context zzall.val$context>
	//    5   11:ldc1            #32  <String "https://support.google.com/dfp_premium/answer/7160685#push">
	//    6   13:invokestatic    #38  <Method Uri Uri.parse(String)>
	//    7   16:invokestatic    #44  <Method void zzakk.zza(android.content.Context, Uri)>
	//    8   19:return          
	}

	private final zzall zzcst;
}
