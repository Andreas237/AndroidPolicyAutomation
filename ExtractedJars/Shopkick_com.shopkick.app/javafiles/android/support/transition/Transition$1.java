// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.transition;

import android.graphics.Path;

// Referenced classes of package android.support.transition:
//			PathMotion, Transition

static final class Transition$1 extends PathMotion
{

	public Path getPath(float f, float f1, float f2, float f3)
	{
		Path path = new Path();
	//    0    0:new             #15  <Class Path>
	//    1    3:dup             
	//    2    4:invokespecial   #16  <Method void Path()>
	//    3    7:astore          5
		path.moveTo(f, f1);
	//    4    9:aload           5
	//    5   11:fload_1         
	//    6   12:fload_2         
	//    7   13:invokevirtual   #20  <Method void Path.moveTo(float, float)>
		path.lineTo(f2, f3);
	//    8   16:aload           5
	//    9   18:fload_3         
	//   10   19:fload           4
	//   11   21:invokevirtual   #23  <Method void Path.lineTo(float, float)>
		return path;
	//   12   24:aload           5
	//   13   26:areturn         
	}

	Transition$1()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void PathMotion()>
	//    2    4:return          
	}
}
