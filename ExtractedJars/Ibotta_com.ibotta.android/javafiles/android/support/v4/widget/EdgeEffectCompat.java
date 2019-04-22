// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.widget;

import android.widget.EdgeEffect;

public final class EdgeEffectCompat
{

	public static void onPull(EdgeEffect edgeeffect, float f, float f1)
	{
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:getstatic       #13  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          15
		{
			edgeeffect.onPull(f, f1);
	//    3    8:aload_0         
	//    4    9:fload_1         
	//    5   10:fload_2         
	//    6   11:invokevirtual   #18  <Method void EdgeEffect.onPull(float, float)>
			return;
	//    7   14:return          
		} else
		{
			edgeeffect.onPull(f);
	//    8   15:aload_0         
	//    9   16:fload_1         
	//   10   17:invokevirtual   #21  <Method void EdgeEffect.onPull(float)>
			return;
	//   11   20:return          
		}
	}
}
