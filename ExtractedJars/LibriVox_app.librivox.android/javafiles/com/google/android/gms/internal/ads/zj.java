// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.aw;

// Referenced classes of package com.google.android.gms.internal.ads:
//			wt, xg, aak

public final class zj extends wt
{

	public zj(Context context, String s, String s1)
	{
		this(s1, aw.e().b(context, s));
	//    0    0:aload_0         
	//    1    1:aload_3         
	//    2    2:invokestatic    #17  <Method xg aw.e()>
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:invokevirtual   #22  <Method String xg.b(Context, String)>
	//    6   10:invokespecial   #25  <Method void zj(String, String)>
	//    7   13:return          
	}

	private zj(String s, String s1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #29  <Method void wt()>
		a = new aak(s1);
	//    2    4:aload_0         
	//    3    5:new             #31  <Class aak>
	//    4    8:dup             
	//    5    9:aload_2         
	//    6   10:invokespecial   #34  <Method void aak(String)>
	//    7   13:putfield        #36  <Field aak a>
		b = s;
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:putfield        #38  <Field String b>
	//   11   21:return          
	}

	public final void a()
	{
		a.a(b);
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field aak a>
	//    2    4:aload_0         
	//    3    5:getfield        #38  <Field String b>
	//    4    8:invokevirtual   #40  <Method void aak.a(String)>
	//    5   11:return          
	}

	public final void b_()
	{
	//    0    0:return          
	}

	private final aak a;
	private final String b;
}
