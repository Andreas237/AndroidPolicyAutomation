// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import android.animation.ValueAnimator;

// Referenced classes of package o:
//			v

static class v$b
{

	final ValueAnimator c;
	final int d[];

	v$b(int ai[], ValueAnimator valueanimator)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		d = ai;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #18  <Field int[] d>
		c = valueanimator;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #20  <Field ValueAnimator c>
	//    8   14:return          
	}
}
