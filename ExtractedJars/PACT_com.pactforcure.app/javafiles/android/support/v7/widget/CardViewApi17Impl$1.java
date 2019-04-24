// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.graphics.*;

// Referenced classes of package android.support.v7.widget:
//			CardViewApi17Impl

class CardViewApi17Impl$1
	implements hShadow.RoundRectHelper
{

	public void drawRoundRect(Canvas canvas, RectF rectf, float f, Paint paint)
	{
		canvas.drawRoundRect(rectf, f, f, paint);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:fload_3         
	//    3    3:fload_3         
	//    4    4:aload           4
	//    5    6:invokevirtual   #27  <Method void Canvas.drawRoundRect(RectF, float, float, Paint)>
	//    6    9:return          
	}

	final CardViewApi17Impl this$0;

	CardViewApi17Impl$1()
	{
		this$0 = CardViewApi17Impl.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field CardViewApi17Impl this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}
}
