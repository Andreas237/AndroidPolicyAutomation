// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view.animation;

import android.graphics.Path;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;

// Referenced classes of package android.support.v4.view.animation:
//			PathInterpolatorApi14

public final class PathInterpolatorCompat
{

	private PathInterpolatorCompat()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public static Interpolator create(float f, float f1)
	{
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:getstatic       #17  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          18
			return ((Interpolator) (new PathInterpolator(f, f1)));
	//    3    8:new             #19  <Class PathInterpolator>
	//    4   11:dup             
	//    5   12:fload_0         
	//    6   13:fload_1         
	//    7   14:invokespecial   #22  <Method void PathInterpolator(float, float)>
	//    8   17:areturn         
		else
			return ((Interpolator) (new PathInterpolatorApi14(f, f1)));
	//    9   18:new             #24  <Class PathInterpolatorApi14>
	//   10   21:dup             
	//   11   22:fload_0         
	//   12   23:fload_1         
	//   13   24:invokespecial   #25  <Method void PathInterpolatorApi14(float, float)>
	//   14   27:areturn         
	}

	public static Interpolator create(float f, float f1, float f2, float f3)
	{
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:getstatic       #17  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          20
			return ((Interpolator) (new PathInterpolator(f, f1, f2, f3)));
	//    3    8:new             #19  <Class PathInterpolator>
	//    4   11:dup             
	//    5   12:fload_0         
	//    6   13:fload_1         
	//    7   14:fload_2         
	//    8   15:fload_3         
	//    9   16:invokespecial   #29  <Method void PathInterpolator(float, float, float, float)>
	//   10   19:areturn         
		else
			return ((Interpolator) (new PathInterpolatorApi14(f, f1, f2, f3)));
	//   11   20:new             #24  <Class PathInterpolatorApi14>
	//   12   23:dup             
	//   13   24:fload_0         
	//   14   25:fload_1         
	//   15   26:fload_2         
	//   16   27:fload_3         
	//   17   28:invokespecial   #30  <Method void PathInterpolatorApi14(float, float, float, float)>
	//   18   31:areturn         
	}

	public static Interpolator create(Path path)
	{
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:getstatic       #17  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          17
			return ((Interpolator) (new PathInterpolator(path)));
	//    3    8:new             #19  <Class PathInterpolator>
	//    4   11:dup             
	//    5   12:aload_0         
	//    6   13:invokespecial   #34  <Method void PathInterpolator(Path)>
	//    7   16:areturn         
		else
			return ((Interpolator) (new PathInterpolatorApi14(path)));
	//    8   17:new             #24  <Class PathInterpolatorApi14>
	//    9   20:dup             
	//   10   21:aload_0         
	//   11   22:invokespecial   #35  <Method void PathInterpolatorApi14(Path)>
	//   12   25:areturn         
	}
}
