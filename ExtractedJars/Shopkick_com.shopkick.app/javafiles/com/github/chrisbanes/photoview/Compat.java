// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.chrisbanes.photoview;

import android.view.View;

class Compat
{

	Compat()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	public static void postOnAnimation(View view, Runnable runnable)
	{
		if(android.os.Build.VERSION.SDK_INT >= 16)
	//*   0    0:getstatic       #19  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          16
	//*   2    5:icmplt          14
		{
			postOnAnimationJellyBean(view, runnable);
	//    3    8:aload_0         
	//    4    9:aload_1         
	//    5   10:invokestatic    #22  <Method void postOnAnimationJellyBean(View, Runnable)>
			return;
	//    6   13:return          
		} else
		{
			view.postDelayed(runnable, 16L);
	//    7   14:aload_0         
	//    8   15:aload_1         
	//    9   16:ldc2w           #23  <Long 16L>
	//   10   19:invokevirtual   #30  <Method boolean View.postDelayed(Runnable, long)>
	//   11   22:pop             
			return;
	//   12   23:return          
		}
	}

	private static void postOnAnimationJellyBean(View view, Runnable runnable)
	{
		view.postOnAnimation(runnable);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #35  <Method void View.postOnAnimation(Runnable)>
	//    3    5:return          
	}

	private static final int SIXTY_FPS_INTERVAL = 16;
}
