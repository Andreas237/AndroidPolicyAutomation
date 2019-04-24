// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.support.design.widget.BottomSheetBehavior;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;

// Referenced classes of package com.irobot.home:
//			MapCustomizationActivity

class MapCustomizationActivity$29
	implements android.view.outListener
{

	public void onGlobalLayout()
	{
		MapCustomizationActivity.a(a, a.h.getHeight());
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field MapCustomizationActivity a>
	//    2    4:aload_0         
	//    3    5:getfield        #17  <Field MapCustomizationActivity a>
	//    4    8:getfield        #25  <Field FrameLayout MapCustomizationActivity.h>
	//    5   11:invokevirtual   #31  <Method int FrameLayout.getHeight()>
	//    6   14:invokestatic    #34  <Method int MapCustomizationActivity.a(MapCustomizationActivity, int)>
	//    7   17:pop             
		MapCustomizationActivity.b(a, a.h.getWidth());
	//    8   18:aload_0         
	//    9   19:getfield        #17  <Field MapCustomizationActivity a>
	//   10   22:aload_0         
	//   11   23:getfield        #17  <Field MapCustomizationActivity a>
	//   12   26:getfield        #25  <Field FrameLayout MapCustomizationActivity.h>
	//   13   29:invokevirtual   #37  <Method int FrameLayout.getWidth()>
	//   14   32:invokestatic    #40  <Method int MapCustomizationActivity.b(MapCustomizationActivity, int)>
	//   15   35:pop             
		a.h.getViewTreeObserver().removeOnGlobalLayoutListener(((android.view.outListener) (this)));
	//   16   36:aload_0         
	//   17   37:getfield        #17  <Field MapCustomizationActivity a>
	//   18   40:getfield        #25  <Field FrameLayout MapCustomizationActivity.h>
	//   19   43:invokevirtual   #44  <Method ViewTreeObserver FrameLayout.getViewTreeObserver()>
	//   20   46:aload_0         
	//   21   47:invokevirtual   #50  <Method void ViewTreeObserver.removeOnGlobalLayoutListener(android.view.ViewTreeObserver$OnGlobalLayoutListener)>
		MapCustomizationActivity.c(a).b(5);
	//   22   50:aload_0         
	//   23   51:getfield        #17  <Field MapCustomizationActivity a>
	//   24   54:invokestatic    #54  <Method BottomSheetBehavior MapCustomizationActivity.c(MapCustomizationActivity)>
	//   25   57:iconst_5        
	//   26   58:invokevirtual   #59  <Method void BottomSheetBehavior.b(int)>
		MapCustomizationActivity.d(a);
	//   27   61:aload_0         
	//   28   62:getfield        #17  <Field MapCustomizationActivity a>
	//   29   65:invokestatic    #62  <Method void MapCustomizationActivity.d(MapCustomizationActivity)>
	//   30   68:return          
	}

	final MapCustomizationActivity a;

	MapCustomizationActivity$29(MapCustomizationActivity mapcustomizationactivity)
	{
		a = mapcustomizationactivity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field MapCustomizationActivity a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}
}
