// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view.animation;

import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;

// Referenced classes of package android.support.v4.view.animation:
//			PathInterpolatorApi14

public final class PathInterpolatorCompat
{

	public static Interpolator create(float f, float f1, float f2, float f3)
	{
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:getstatic       #12  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          20
			return ((Interpolator) (new PathInterpolator(f, f1, f2, f3)));
	//    3    8:new             #14  <Class PathInterpolator>
	//    4   11:dup             
	//    5   12:fload_0         
	//    6   13:fload_1         
	//    7   14:fload_2         
	//    8   15:fload_3         
	//    9   16:invokespecial   #18  <Method void PathInterpolator(float, float, float, float)>
	//   10   19:areturn         
		else
			return ((Interpolator) (new PathInterpolatorApi14(f, f1, f2, f3)));
	//   11   20:new             #20  <Class PathInterpolatorApi14>
	//   12   23:dup             
	//   13   24:fload_0         
	//   14   25:fload_1         
	//   15   26:fload_2         
	//   16   27:fload_3         
	//   17   28:invokespecial   #21  <Method void PathInterpolatorApi14(float, float, float, float)>
	//   18   31:areturn         
	}
}
