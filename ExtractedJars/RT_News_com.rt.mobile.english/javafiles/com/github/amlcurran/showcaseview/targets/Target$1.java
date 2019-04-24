// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.amlcurran.showcaseview.targets;

import android.graphics.Point;

// Referenced classes of package com.github.amlcurran.showcaseview.targets:
//			Target

static final class Target$1
	implements Target
{

	public Point getPoint()
	{
		return new Point(0xf4240, 0xf4240);
	//    0    0:new             #15  <Class Point>
	//    1    3:dup             
	//    2    4:ldc1            #16  <Int 0xf4240>
	//    3    6:ldc1            #16  <Int 0xf4240>
	//    4    8:invokespecial   #19  <Method void Point(int, int)>
	//    5   11:areturn         
	}

	Target$1()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void Object()>
	//    2    4:return          
	}
}
