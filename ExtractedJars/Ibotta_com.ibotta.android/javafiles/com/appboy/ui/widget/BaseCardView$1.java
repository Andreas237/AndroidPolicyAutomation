// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy.ui.widget;

import android.view.ViewTreeObserver;
import android.widget.ImageView;

// Referenced classes of package com.appboy.ui.widget:
//			BaseCardView

class BaseCardView$1
	implements android.view.r.OnGlobalLayoutListener
{

	public void onGlobalLayout()
	{
		int i = val$imageView.getWidth();
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field ImageView val$imageView>
	//    2    4:invokevirtual   #36  <Method int ImageView.getWidth()>
	//    3    7:istore_1        
		val$imageView.setLayoutParams(((android.view.tParams) (new android.widget.LayoutParams(i, (int)((float)i / val$aspectRatio)))));
	//    4    8:aload_0         
	//    5    9:getfield        #23  <Field ImageView val$imageView>
	//    6   12:new             #38  <Class android.widget.RelativeLayout$LayoutParams>
	//    7   15:dup             
	//    8   16:iload_1         
	//    9   17:iload_1         
	//   10   18:i2f             
	//   11   19:aload_0         
	//   12   20:getfield        #25  <Field float val$aspectRatio>
	//   13   23:fdiv            
	//   14   24:f2i             
	//   15   25:invokespecial   #41  <Method void android.widget.RelativeLayout$LayoutParams(int, int)>
	//   16   28:invokevirtual   #45  <Method void ImageView.setLayoutParams(android.view.ViewGroup$LayoutParams)>
		val$imageView.getViewTreeObserver().removeOnGlobalLayoutListener(((android.view.r.OnGlobalLayoutListener) (this)));
	//   17   31:aload_0         
	//   18   32:getfield        #23  <Field ImageView val$imageView>
	//   19   35:invokevirtual   #49  <Method ViewTreeObserver ImageView.getViewTreeObserver()>
	//   20   38:aload_0         
	//   21   39:invokevirtual   #55  <Method void ViewTreeObserver.removeOnGlobalLayoutListener(android.view.ViewTreeObserver$OnGlobalLayoutListener)>
	//   22   42:return          
	}

	final BaseCardView this$0;
	final float val$aspectRatio;
	final ImageView val$imageView;

	BaseCardView$1()
	{
		this$0 = final_basecardview;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #21  <Field BaseCardView this$0>
		val$imageView = imageview;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #23  <Field ImageView val$imageView>
		val$aspectRatio = F.this;
	//    6   10:aload_0         
	//    7   11:fload_3         
	//    8   12:putfield        #25  <Field float val$aspectRatio>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #28  <Method void Object()>
	//   11   19:return          
	}
}
