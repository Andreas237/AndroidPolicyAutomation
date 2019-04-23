// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.app;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;

// Referenced classes of package android.support.v7.app:
//			MediaRouteControllerDialog

class MediaRouteControllerDialog$7 extends Animation
{

	protected void applyTransformation(float f, Transformation transformation)
	{
		int i = val$startValue;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field int val$startValue>
	//    2    4:istore_3        
		int j = (int)((float)(i - val$endValue) * f);
	//    3    5:iload_3         
	//    4    6:aload_0         
	//    5    7:getfield        #19  <Field int val$endValue>
	//    6   10:isub            
	//    7   11:i2f             
	//    8   12:fload_1         
	//    9   13:fmul            
	//   10   14:f2i             
	//   11   15:istore          4
		MediaRouteControllerDialog.setLayoutHeight(val$view, i - j);
	//   12   17:aload_0         
	//   13   18:getfield        #21  <Field View val$view>
	//   14   21:iload_3         
	//   15   22:iload           4
	//   16   24:isub            
	//   17   25:invokestatic    #33  <Method void MediaRouteControllerDialog.setLayoutHeight(View, int)>
	//   18   28:return          
	}

	final MediaRouteControllerDialog this$0;
	final int val$endValue;
	final int val$startValue;
	final View val$view;

	MediaRouteControllerDialog$7()
	{
		this$0 = final_mediaroutecontrollerdialog;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field MediaRouteControllerDialog this$0>
		val$startValue = i;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #17  <Field int val$startValue>
		val$endValue = j;
	//    6   10:aload_0         
	//    7   11:iload_3         
	//    8   12:putfield        #19  <Field int val$endValue>
		val$view = View.this;
	//    9   15:aload_0         
	//   10   16:aload           4
	//   11   18:putfield        #21  <Field View val$view>
		super();
	//   12   21:aload_0         
	//   13   22:invokespecial   #24  <Method void Animation()>
	//   14   25:return          
	}
}
