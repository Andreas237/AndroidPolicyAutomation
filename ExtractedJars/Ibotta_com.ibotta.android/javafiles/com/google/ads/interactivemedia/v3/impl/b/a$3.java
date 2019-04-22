// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.ads.interactivemedia.v3.impl.b;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.shapes.Shape;

// Referenced classes of package com.google.ads.interactivemedia.v3.impl.b:
//			a

class a$3 extends Shape
{

	public void draw(Canvas canvas, Paint paint)
	{
		canvas.drawLine(0.0F, getHeight(), getWidth(), getHeight(), paint);
	//    0    0:aload_1         
	//    1    1:fconst_0        
	//    2    2:aload_0         
	//    3    3:invokevirtual   #21  <Method float getHeight()>
	//    4    6:aload_0         
	//    5    7:invokevirtual   #24  <Method float getWidth()>
	//    6   10:aload_0         
	//    7   11:invokevirtual   #21  <Method float getHeight()>
	//    8   14:aload_2         
	//    9   15:invokevirtual   #30  <Method void Canvas.drawLine(float, float, float, float, Paint)>
	//   10   18:return          
	}

	a$3(a a1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Shape()>
	//    2    4:return          
	}
}
