// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.amlcurran.showcaseview.targets;

import android.graphics.Point;

// Referenced classes of package com.github.amlcurran.showcaseview.targets:
//			Target

public class PointTarget
	implements Target
{

	public PointTarget(int i, int j)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		mPoint = new Point(i, j);
	//    2    4:aload_0         
	//    3    5:new             #15  <Class Point>
	//    4    8:dup             
	//    5    9:iload_1         
	//    6   10:iload_2         
	//    7   11:invokespecial   #17  <Method void Point(int, int)>
	//    8   14:putfield        #19  <Field Point mPoint>
	//    9   17:return          
	}

	public PointTarget(Point point)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		mPoint = point;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #19  <Field Point mPoint>
	//    5    9:return          
	}

	public Point getPoint()
	{
		return mPoint;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field Point mPoint>
	//    2    4:areturn         
	}

	private final Point mPoint;
}
