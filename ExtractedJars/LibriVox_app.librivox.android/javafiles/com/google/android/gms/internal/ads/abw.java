// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.view.View;

// Referenced classes of package com.google.android.gms.internal.ads:
//			abx, abz, aby

public final class abw
{

	public abw()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #9   <Method void Object()>
	//    2    4:return          
	}

	public static void a(View view, android.view.ViewTreeObserver.OnGlobalLayoutListener ongloballayoutlistener)
	{
		((abz) (new abx(view, ongloballayoutlistener))).a();
	//    0    0:new             #14  <Class abx>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #16  <Method void abx(View, android.view.ViewTreeObserver$OnGlobalLayoutListener)>
	//    5    9:invokevirtual   #20  <Method void abz.a()>
	//    6   12:return          
	}

	public static void a(View view, android.view.ViewTreeObserver.OnScrollChangedListener onscrollchangedlistener)
	{
		((abz) (new aby(view, onscrollchangedlistener))).a();
	//    0    0:new             #23  <Class aby>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #25  <Method void aby(View, android.view.ViewTreeObserver$OnScrollChangedListener)>
	//    5    9:invokevirtual   #20  <Method void abz.a()>
	//    6   12:return          
	}
}
