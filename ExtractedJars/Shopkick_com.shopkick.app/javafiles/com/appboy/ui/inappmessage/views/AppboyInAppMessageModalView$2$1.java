// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy.ui.inappmessage.views;

import android.app.Activity;
import android.graphics.drawable.Animatable;
import android.view.View;
import com.appboy.models.IInAppMessageImmersive;
import com.facebook.drawee.controller.BaseControllerListener;
import com.facebook.imagepipeline.image.ImageInfo;

// Referenced classes of package com.appboy.ui.inappmessage.views:
//			AppboyInAppMessageModalView

class AppboyInAppMessageModalView$2$1
	implements Runnable
{

	public void run()
	{
		AppboyInAppMessageModalView.access$100(this$0, val$activity, val$inAppMessage, val$imageAspectRatio);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field AppboyInAppMessageModalView$2 this$1>
	//    2    4:getfield        #30  <Field AppboyInAppMessageModalView AppboyInAppMessageModalView$2.this$0>
	//    3    7:aload_0         
	//    4    8:getfield        #19  <Field AppboyInAppMessageModalView$2 this$1>
	//    5   11:getfield        #34  <Field Activity AppboyInAppMessageModalView$2.val$activity>
	//    6   14:aload_0         
	//    7   15:getfield        #19  <Field AppboyInAppMessageModalView$2 this$1>
	//    8   18:getfield        #38  <Field IInAppMessageImmersive AppboyInAppMessageModalView$2.val$inAppMessage>
	//    9   21:aload_0         
	//   10   22:getfield        #21  <Field double val$imageAspectRatio>
	//   11   25:invokestatic    #44  <Method void AppboyInAppMessageModalView.access$100(AppboyInAppMessageModalView, Activity, IInAppMessageImmersive, double)>
	//   12   28:return          
	}

	final AppboyInAppMessageModalView._cls2 this$1;
	final double val$imageAspectRatio;

	AppboyInAppMessageModalView$2$1()
	{
		this$1 = final__pcls2;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field AppboyInAppMessageModalView$2 this$1>
		val$imageAspectRatio = D.this;
	//    3    5:aload_0         
	//    4    6:dload_2         
	//    5    7:putfield        #21  <Field double val$imageAspectRatio>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #24  <Method void Object()>
	//    8   14:return          
	}

	// Unreferenced inner class com/appboy/ui/inappmessage/views/AppboyInAppMessageModalView$2

/* anonymous class */
	class AppboyInAppMessageModalView._cls2 extends BaseControllerListener
	{

		public void onFinalImageSet(String s, ImageInfo imageinfo, Animatable animatable)
		{
			if(imageinfo == null)
		//*   0    0:aload_2         
		//*   1    1:ifnonnull       5
			{
				return;
		//    2    4:return          
			} else
			{
				double d = (double)imageinfo.getWidth() / (double)imageinfo.getHeight();
		//    3    5:aload_2         
		//    4    6:invokeinterface #38  <Method int ImageInfo.getWidth()>
		//    5   11:i2d             
		//    6   12:aload_2         
		//    7   13:invokeinterface #41  <Method int ImageInfo.getHeight()>
		//    8   18:i2d             
		//    9   19:ddiv            
		//   10   20:dstore          4
				AppboyInAppMessageModalView.access$200(AppboyInAppMessageModalView.this).post(((Runnable) (((AppboyInAppMessageModalView._cls2._cls1) (d)). new AppboyInAppMessageModalView._cls2._cls1())));
		//   11   22:aload_0         
		//   12   23:getfield        #22  <Field AppboyInAppMessageModalView this$0>
		//   13   26:invokestatic    #45  <Method View AppboyInAppMessageModalView.access$200(AppboyInAppMessageModalView)>
		//   14   29:new             #12  <Class AppboyInAppMessageModalView$2$1>
		//   15   32:dup             
		//   16   33:aload_0         
		//   17   34:dload           4
		//   18   36:invokespecial   #48  <Method void AppboyInAppMessageModalView$2$1(AppboyInAppMessageModalView$2, double)>
		//   19   39:invokevirtual   #54  <Method boolean View.post(Runnable)>
		//   20   42:pop             
				return;
		//   21   43:return          
			}
		}

		public volatile void onFinalImageSet(String s, Object obj, Animatable animatable)
		{
			onFinalImageSet(s, (ImageInfo)obj, animatable);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:checkcast       #34  <Class ImageInfo>
		//    4    6:aload_3         
		//    5    7:invokevirtual   #57  <Method void onFinalImageSet(String, ImageInfo, Animatable)>
		//    6   10:return          
		}

		final AppboyInAppMessageModalView this$0;
		final Activity val$activity;
		final IInAppMessageImmersive val$inAppMessage;

			
			{
				this$0 = final_appboyinappmessagemodalview;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #22  <Field AppboyInAppMessageModalView this$0>
				activity = activity1;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #24  <Field Activity val$activity>
				inAppMessage = IInAppMessageImmersive.this;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #26  <Field IInAppMessageImmersive val$inAppMessage>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #29  <Method void BaseControllerListener()>
			//   11   19:return          
			}
	}

}
