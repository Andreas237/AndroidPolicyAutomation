// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.gmsg.al;

// Referenced classes of package com.google.android.gms.internal.ads:
//			abr, sb, sd

final class sf
	implements abr
{

	sf(sd sd1)
	{
		a = sd1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field sd a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void Object()>
	//    5    9:return          
	}

	public final void a()
	{
		sb.d().b(a.b);
	//    0    0:invokestatic    #22  <Method al sb.d()>
	//    1    3:aload_0         
	//    2    4:getfield        #12  <Field sd a>
	//    3    7:getfield        #28  <Field String sd.b>
	//    4   10:invokevirtual   #33  <Method void al.b(String)>
	//    5   13:return          
	}

	private final sd a;
}
