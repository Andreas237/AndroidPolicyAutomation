// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.graphics.Outline;

// Referenced classes of package android.support.design.widget:
//			CircularBorderDrawable

class CircularBorderDrawableLollipop extends CircularBorderDrawable
{

	CircularBorderDrawableLollipop()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void CircularBorderDrawable()>
	//    2    4:return          
	}

	public void getOutline(Outline outline)
	{
		copyBounds(mRect);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #18  <Field android.graphics.Rect mRect>
	//    3    5:invokevirtual   #22  <Method void copyBounds(android.graphics.Rect)>
		outline.setOval(mRect);
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #18  <Field android.graphics.Rect mRect>
	//    7   13:invokevirtual   #27  <Method void Outline.setOval(android.graphics.Rect)>
	//    8   16:return          
	}
}
