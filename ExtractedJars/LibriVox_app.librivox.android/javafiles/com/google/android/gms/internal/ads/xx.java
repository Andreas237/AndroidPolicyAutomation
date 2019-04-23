// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.view.View;

// Referenced classes of package com.google.android.gms.internal.ads:
//			xv

public class xx extends xv
{

	public xx()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void xv()>
	//    2    4:return          
	}

	public final boolean a(View view)
	{
		return view.isAttachedToWindow();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #20  <Method boolean View.isAttachedToWindow()>
	//    2    4:ireturn         
	}

	public final android.view.ViewGroup.LayoutParams d()
	{
		return new android.view.ViewGroup.LayoutParams(-1, -1);
	//    0    0:new             #24  <Class android.view.ViewGroup$LayoutParams>
	//    1    3:dup             
	//    2    4:iconst_m1       
	//    3    5:iconst_m1       
	//    4    6:invokespecial   #27  <Method void android.view.ViewGroup$LayoutParams(int, int)>
	//    5    9:areturn         
	}
}
