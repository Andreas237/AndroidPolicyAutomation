// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.net.Uri;
import com.google.android.gms.ads.internal.aw;

// Referenced classes of package com.google.android.gms.internal.ads:
//			yk, xg

final class yl
	implements android.content.DialogInterface.OnClickListener
{

	yl(yk yk1)
	{
		a = yk1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field yk a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void Object()>
	//    5    9:return          
	}

	public final void onClick(DialogInterface dialoginterface, int i)
	{
		aw.e();
	//    0    0:invokestatic    #24  <Method xg aw.e()>
	//    1    3:pop             
		xg.a(a.a, Uri.parse("https://support.google.com/dfp_premium/answer/7160685#push"));
	//    2    4:aload_0         
	//    3    5:getfield        #12  <Field yk a>
	//    4    8:getfield        #29  <Field android.content.Context yk.a>
	//    5   11:ldc1            #31  <String "https://support.google.com/dfp_premium/answer/7160685#push">
	//    6   13:invokestatic    #37  <Method Uri Uri.parse(String)>
	//    7   16:invokestatic    #42  <Method void xg.a(android.content.Context, Uri)>
	//    8   19:return          
	}

	private final yk a;
}
