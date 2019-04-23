// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.a;

// Referenced classes of package com.google.android.gms.internal.ads:
//			wd, we, tm

final class to
	implements Runnable
{

	to(tm tm, we we)
	{
		b = tm;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field tm b>
		a = we;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #16  <Field we a>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #19  <Method void Object()>
	//    8   14:return          
	}

	public final void run()
	{
		((a) (b)).b(new wd(a, ((afn) (null)), ((jv) (null)), ((kp) (null)), ((String) (null)), ((jy) (null)), ((bj) (null)), ((String) (null))));
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field tm b>
	//    2    4:new             #23  <Class wd>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:getfield        #16  <Field we a>
	//    6   12:aconst_null     
	//    7   13:aconst_null     
	//    8   14:aconst_null     
	//    9   15:aconst_null     
	//   10   16:aconst_null     
	//   11   17:aconst_null     
	//   12   18:aconst_null     
	//   13   19:invokespecial   #26  <Method void wd(we, afn, jv, kp, String, jy, bj, String)>
	//   14   22:invokevirtual   #31  <Method void a.b(wd)>
	//   15   25:return          
	}

	private final we a;
	private final tm b;
}
