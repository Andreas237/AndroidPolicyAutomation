// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.animation.ValueAnimator;

// Referenced classes of package android.support.design.widget:
//			StateListAnimator

static class StateListAnimator$Tuple
{

	final ValueAnimator animator;
	final int specs[];

	StateListAnimator$Tuple(int ai[], ValueAnimator valueanimator)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		specs = ai;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #18  <Field int[] specs>
		animator = valueanimator;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #20  <Field ValueAnimator animator>
	//    8   14:return          
	}
}
