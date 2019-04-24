// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.view.View;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzakw

public class zzakx extends zzakw
{

	public zzakx()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void zzakw()>
	//    2    4:return          
	}

	public boolean isAttachedToWindow(View view)
	{
		return super.isAttachedToWindow(view) || view.getWindowId() != null;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #16  <Method boolean zzakw.isAttachedToWindow(View)>
	//    3    5:ifne            20
	//    4    8:aload_1         
	//    5    9:invokevirtual   #22  <Method android.view.WindowId View.getWindowId()>
	//    6   12:ifnull          18
	//    7   15:goto            20
	//    8   18:iconst_0        
	//    9   19:ireturn         
	//   10   20:iconst_1        
	//   11   21:ireturn         
	}

	public final int zzrn()
	{
		return 14;
	//    0    0:bipush          14
	//    1    2:ireturn         
	}
}
