// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.comscore.utils;

import android.graphics.Point;
import android.view.Display;

public class API13
{

	public API13()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public static Point getDisplaySize(Display display)
	{
		Point point = new Point();
	//    0    0:new             #13  <Class Point>
	//    1    3:dup             
	//    2    4:invokespecial   #14  <Method void Point()>
	//    3    7:astore_1        
		if(android.os.Build.VERSION.SDK_INT >= 13)
	//*   4    8:getstatic       #20  <Field int android.os.Build$VERSION.SDK_INT>
	//*   5   11:bipush          13
	//*   6   13:icmplt          21
			display.getSize(point);
	//    7   16:aload_0         
	//    8   17:aload_1         
	//    9   18:invokevirtual   #26  <Method void Display.getSize(Point)>
		return point;
	//   10   21:aload_1         
	//   11   22:areturn         
	}
}
