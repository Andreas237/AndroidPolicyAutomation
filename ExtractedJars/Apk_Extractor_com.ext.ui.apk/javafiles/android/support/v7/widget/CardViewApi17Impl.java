// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.graphics.*;

// Referenced classes of package android.support.v7.widget:
//			CardViewBaseImpl, RoundRectDrawableWithShadow

class CardViewApi17Impl extends CardViewBaseImpl
{

	CardViewApi17Impl()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void CardViewBaseImpl()>
	//    2    4:return          
	}

	public void initStatic()
	{
		RoundRectDrawableWithShadow.sRoundRectHelper = new RoundRectDrawableWithShadow.RoundRectHelper() {

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
;
	//    0    0:new             #6   <Class CardViewApi17Impl$1>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #18  <Method void CardViewApi17Impl$1(CardViewApi17Impl)>
	//    4    8:putstatic       #24  <Field RoundRectDrawableWithShadow$RoundRectHelper RoundRectDrawableWithShadow.sRoundRectHelper>
	//    5   11:return          
	}
}
