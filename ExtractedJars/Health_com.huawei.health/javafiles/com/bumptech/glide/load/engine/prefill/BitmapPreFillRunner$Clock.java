// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.engine.prefill;

import android.os.SystemClock;

// Referenced classes of package com.bumptech.glide.load.engine.prefill:
//			BitmapPreFillRunner

static class BitmapPreFillRunner$Clock
{

	public long now()
	{
		return SystemClock.currentThreadTimeMillis();
	//    0    0:invokestatic    #19  <Method long SystemClock.currentThreadTimeMillis()>
	//    1    3:lreturn         
	}

	BitmapPreFillRunner$Clock()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}
}
