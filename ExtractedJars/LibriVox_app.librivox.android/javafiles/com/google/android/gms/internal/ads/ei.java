// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.formats.j;

// Referenced classes of package com.google.android.gms.internal.ads:
//			dh, cw, ct

public final class ei extends dh
{

	public ei(j j1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void dh()>
		a = j1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #14  <Field j a>
	//    5    9:return          
	}

	public final void a(ct ct)
	{
		a.a(((com.google.android.gms.ads.formats.i) (new cw(ct))));
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field j a>
	//    2    4:new             #18  <Class cw>
	//    3    7:dup             
	//    4    8:aload_1         
	//    5    9:invokespecial   #20  <Method void cw(ct)>
	//    6   12:invokeinterface #25  <Method void j.a(com.google.android.gms.ads.formats.i)>
	//    7   17:return          
	}

	private final j a;
}
