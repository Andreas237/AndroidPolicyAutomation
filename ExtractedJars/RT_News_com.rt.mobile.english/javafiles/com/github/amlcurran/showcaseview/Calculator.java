// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.amlcurran.showcaseview;

import android.graphics.Point;
import android.view.View;

class Calculator
{

	Calculator()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	static Point getShowcasePointFromView(View view)
	{
		Point point = new Point();
	//    0    0:new             #13  <Class Point>
	//    1    3:dup             
	//    2    4:invokespecial   #14  <Method void Point()>
	//    3    7:astore_1        
		point.x = view.getLeft() + view.getWidth() / 2;
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:invokevirtual   #20  <Method int View.getLeft()>
	//    7   13:aload_0         
	//    8   14:invokevirtual   #23  <Method int View.getWidth()>
	//    9   17:iconst_2        
	//   10   18:idiv            
	//   11   19:iadd            
	//   12   20:putfield        #27  <Field int Point.x>
		point.y = view.getTop() + view.getHeight() / 2;
	//   13   23:aload_1         
	//   14   24:aload_0         
	//   15   25:invokevirtual   #30  <Method int View.getTop()>
	//   16   28:aload_0         
	//   17   29:invokevirtual   #33  <Method int View.getHeight()>
	//   18   32:iconst_2        
	//   19   33:idiv            
	//   20   34:iadd            
	//   21   35:putfield        #36  <Field int Point.y>
		return point;
	//   22   38:aload_1         
	//   23   39:areturn         
	}
}
