// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.graphics.Outline;

// Referenced classes of package android.support.design.widget:
//			CircularBorderDrawable

public class CircularBorderDrawableLollipop extends CircularBorderDrawable
{

	public CircularBorderDrawableLollipop()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void CircularBorderDrawable()>
	//    2    4:return          
	}

	public void getOutline(Outline outline)
	{
		copyBounds(rect);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #21  <Field android.graphics.Rect rect>
	//    3    5:invokevirtual   #25  <Method void copyBounds(android.graphics.Rect)>
		outline.setOval(rect);
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #21  <Field android.graphics.Rect rect>
	//    7   13:invokevirtual   #30  <Method void Outline.setOval(android.graphics.Rect)>
	//    8   16:return          
	}
}
