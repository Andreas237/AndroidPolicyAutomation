// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appscend.media.events;

import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.RelativeLayout;
import com.appscend.media.APSMediaPlayer;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;

// Referenced classes of package com.appscend.media.events:
//			APSMediaOverlay

class APSMediaOverlay$1$1$2
	implements Runnable
{

	public void run()
	{
		APSMediaPlayer.getInstance().getOverlayContainer().removeView(val$viewToRemove);
	//    0    0:invokestatic    #30  <Method APSMediaPlayer APSMediaPlayer.getInstance()>
	//    1    3:invokevirtual   #34  <Method RelativeLayout APSMediaPlayer.getOverlayContainer()>
	//    2    6:aload_0         
	//    3    7:getfield        #19  <Field APSMediaOverlay$1$1 this$2>
	//    4   10:getfield        #38  <Field View APSMediaOverlay$1$1.val$viewToRemove>
	//    5   13:invokevirtual   #44  <Method void RelativeLayout.removeView(View)>
	//    6   16:return          
	}

	final APSMediaOverlay._cls1._cls1 this$2;

	APSMediaOverlay$1$1$2()
	{
		this$2 = APSMediaOverlay._cls1._cls1.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field APSMediaOverlay$1$1 this$2>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #22  <Method void Object()>
	//    5    9:return          
	}

	// Unreferenced inner class com/appscend/media/events/APSMediaOverlay$1

/* anonymous class */
	class APSMediaOverlay._cls1
		implements Runnable
	{

		public void run()
		{
			try
			{
				View view = (View)((Object) (overlay.controller)).getClass().getMethod("getView", new Class[0]).invoke(((Object) (overlay.controller)), new Object[0]);
		//    0    0:aload_0         
		//    1    1:getfield        #30  <Field APSMediaOverlay val$overlay>
		//    2    4:getfield        #45  <Field com.appscend.overlaycontrollers.APSMediaPlayerOverlayController APSMediaOverlay.controller>
		//    3    7:invokevirtual   #49  <Method Class Object.getClass()>
		//    4   10:ldc1            #51  <String "getView">
		//    5   12:iconst_0        
		//    6   13:anewarray       Class[]
		//    7   16:invokevirtual   #57  <Method Method Class.getMethod(String, Class[])>
		//    8   19:aload_0         
		//    9   20:getfield        #30  <Field APSMediaOverlay val$overlay>
		//   10   23:getfield        #45  <Field com.appscend.overlaycontrollers.APSMediaPlayerOverlayController APSMediaOverlay.controller>
		//   11   26:iconst_0        
		//   12   27:anewarray       Object[]
		//   13   30:invokevirtual   #63  <Method Object Method.invoke(Object, Object[])>
		//   14   33:checkcast       #65  <Class View>
		//   15   36:astore_1        
				AlphaAnimation alphaanimation = new AlphaAnimation(overlayAlpha, 0.0F);
		//   16   37:new             #67  <Class AlphaAnimation>
		//   17   40:dup             
		//   18   41:aload_0         
		//   19   42:getfield        #32  <Field float val$overlayAlpha>
		//   20   45:fconst_0        
		//   21   46:invokespecial   #70  <Method void AlphaAnimation(float, float)>
		//   22   49:astore_2        
				alphaanimation.setDuration((int)overlay.fadeInDuration * 1000);
		//   23   50:aload_2         
		//   24   51:aload_0         
		//   25   52:getfield        #30  <Field APSMediaOverlay val$overlay>
		//   26   55:getfield        #73  <Field float APSMediaOverlay.fadeInDuration>
		//   27   58:f2i             
		//   28   59:sipush          1000
		//   29   62:imul            
		//   30   63:i2l             
		//   31   64:invokevirtual   #77  <Method void AlphaAnimation.setDuration(long)>
				alphaanimation.setFillAfter(true);
		//   32   67:aload_2         
		//   33   68:iconst_1        
		//   34   69:invokevirtual   #81  <Method void AlphaAnimation.setFillAfter(boolean)>
				alphaanimation.setAnimationListener(((APSMediaOverlay._cls1._cls1) (view)). new APSMediaOverlay._cls1._cls1());
		//   35   72:aload_2         
		//   36   73:new             #13  <Class APSMediaOverlay$1$1>
		//   37   76:dup             
		//   38   77:aload_0         
		//   39   78:aload_1         
		//   40   79:invokespecial   #84  <Method void APSMediaOverlay$1$1(APSMediaOverlay$1, View)>
		//   41   82:invokevirtual   #88  <Method void AlphaAnimation.setAnimationListener(android.view.animation.Animation$AnimationListener)>
				view.startAnimation(((Animation) (alphaanimation)));
		//   42   85:aload_1         
		//   43   86:aload_2         
		//   44   87:invokevirtual   #92  <Method void View.startAnimation(Animation)>
				return;
		//   45   90:return          
			}
			catch(Exception exception)
		//*  46   91:astore_1        
			{
				return;
		//   47   92:return          
			}
		}

		final APSMediaOverlay this$0;
		final Handler val$handler;
		final APSMediaOverlay val$overlay;
		final float val$overlayAlpha;

			
			{
				this$0 = final_apsmediaoverlay;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #28  <Field APSMediaOverlay this$0>
				overlay = apsmediaoverlay1;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #30  <Field APSMediaOverlay val$overlay>
				overlayAlpha = f;
			//    6   10:aload_0         
			//    7   11:fload_3         
			//    8   12:putfield        #32  <Field float val$overlayAlpha>
				handler = Handler.this;
			//    9   15:aload_0         
			//   10   16:aload           4
			//   11   18:putfield        #34  <Field Handler val$handler>
				super();
			//   12   21:aload_0         
			//   13   22:invokespecial   #37  <Method void Object()>
			//   14   25:return          
			}
	}


	// Unreferenced inner class com/appscend/media/events/APSMediaOverlay$1$1

/* anonymous class */
	class APSMediaOverlay._cls1._cls1
		implements android.view.animation.Animation.AnimationListener
	{

		public void onAnimationEnd(Animation animation)
		{
			if(overlay.type.equals("controls"))
		//*   0    0:aload_0         
		//*   1    1:getfield        #23  <Field APSMediaOverlay$1 this$1>
		//*   2    4:getfield        #36  <Field APSMediaOverlay APSMediaOverlay$1.val$overlay>
		//*   3    7:getfield        #42  <Field String APSMediaOverlay.type>
		//*   4   10:ldc1            #44  <String "controls">
		//*   5   12:invokevirtual   #50  <Method boolean String.equals(Object)>
		//*   6   15:ifeq            40
				handler.post(new APSMediaOverlay._cls1._cls1._cls1());
		//    7   18:aload_0         
		//    8   19:getfield        #23  <Field APSMediaOverlay$1 this$1>
		//    9   22:getfield        #54  <Field Handler APSMediaOverlay$1.val$handler>
		//   10   25:new             #13  <Class APSMediaOverlay$1$1$1>
		//   11   28:dup             
		//   12   29:aload_0         
		//   13   30:invokespecial   #57  <Method void APSMediaOverlay$1$1$1(APSMediaOverlay$1$1)>
		//   14   33:invokevirtual   #63  <Method boolean Handler.post(Runnable)>
		//   15   36:pop             
			else
		//*  16   37:goto            59
				handler.post(((Runnable) (new APSMediaOverlay._cls1._cls1._cls2())));
		//   17   40:aload_0         
		//   18   41:getfield        #23  <Field APSMediaOverlay$1 this$1>
		//   19   44:getfield        #54  <Field Handler APSMediaOverlay$1.val$handler>
		//   20   47:new             #15  <Class APSMediaOverlay$1$1$2>
		//   21   50:dup             
		//   22   51:aload_0         
		//   23   52:invokespecial   #64  <Method void APSMediaOverlay$1$1$2(APSMediaOverlay$1$1)>
		//   24   55:invokevirtual   #63  <Method boolean Handler.post(Runnable)>
		//   25   58:pop             
			APSMediaPlayer.getInstance().trackforEvent((ArrayList)overlay.trackingURLs.get("finish"), "finish for non-linear", com.appscend.media.APSMediaTrackingEvents.MediaEventType.FINISH, ((APSMediaEvent) (this$0)));
		//   26   59:invokestatic    #70  <Method APSMediaPlayer APSMediaPlayer.getInstance()>
		//   27   62:aload_0         
		//   28   63:getfield        #23  <Field APSMediaOverlay$1 this$1>
		//   29   66:getfield        #36  <Field APSMediaOverlay APSMediaOverlay$1.val$overlay>
		//   30   69:getfield        #74  <Field HashMap APSMediaOverlay.trackingURLs>
		//   31   72:ldc1            #76  <String "finish">
		//   32   74:invokevirtual   #82  <Method Object HashMap.get(Object)>
		//   33   77:checkcast       #84  <Class ArrayList>
		//   34   80:ldc1            #86  <String "finish for non-linear">
		//   35   82:getstatic       #92  <Field com.appscend.media.APSMediaTrackingEvents$MediaEventType com.appscend.media.APSMediaTrackingEvents$MediaEventType.FINISH>
		//   36   85:aload_0         
		//   37   86:getfield        #23  <Field APSMediaOverlay$1 this$1>
		//   38   89:getfield        #95  <Field APSMediaOverlay APSMediaOverlay$1.this$0>
		//   39   92:invokevirtual   #99  <Method void APSMediaPlayer.trackforEvent(ArrayList, String, com.appscend.media.APSMediaTrackingEvents$MediaEventType, APSMediaEvent)>
			try
			{
				((Object) (overlay.controller)).getClass().getMethod("onDestroy", new Class[0]).invoke(((Object) (overlay.controller)), new Object[0]);
		//   40   95:aload_0         
		//   41   96:getfield        #23  <Field APSMediaOverlay$1 this$1>
		//   42   99:getfield        #36  <Field APSMediaOverlay APSMediaOverlay$1.val$overlay>
		//   43  102:getfield        #103 <Field com.appscend.overlaycontrollers.APSMediaPlayerOverlayController APSMediaOverlay.controller>
		//   44  105:invokevirtual   #107 <Method Class Object.getClass()>
		//   45  108:ldc1            #109 <String "onDestroy">
		//   46  110:iconst_0        
		//   47  111:anewarray       Class[]
		//   48  114:invokevirtual   #115 <Method Method Class.getMethod(String, Class[])>
		//   49  117:aload_0         
		//   50  118:getfield        #23  <Field APSMediaOverlay$1 this$1>
		//   51  121:getfield        #36  <Field APSMediaOverlay APSMediaOverlay$1.val$overlay>
		//   52  124:getfield        #103 <Field com.appscend.overlaycontrollers.APSMediaPlayerOverlayController APSMediaOverlay.controller>
		//   53  127:iconst_0        
		//   54  128:anewarray       Object[]
		//   55  131:invokevirtual   #121 <Method Object Method.invoke(Object, Object[])>
		//   56  134:pop             
				return;
		//   57  135:return          
			}
			// Misplaced declaration of an exception variable
			catch(Animation animation)
		//*  58  136:astore_1        
			{
				return;
		//   59  137:return          
			}
		}

		public void onAnimationRepeat(Animation animation)
		{
		//    0    0:return          
		}

		public void onAnimationStart(Animation animation)
		{
		//    0    0:return          
		}

		final APSMediaOverlay._cls1 this$1;
		final View val$viewToRemove;

			
			{
				this$1 = final__pcls1;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #23  <Field APSMediaOverlay$1 this$1>
				viewToRemove = View.this;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #25  <Field View val$viewToRemove>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #27  <Method void Object()>
			//    8   14:return          
			}

		// Unreferenced inner class com/appscend/media/events/APSMediaOverlay$1$1$1

/* anonymous class */
		class APSMediaOverlay._cls1._cls1._cls1
			implements Runnable
		{

			public void run()
			{
				APSMediaPlayer.getInstance().viewController().removeView(viewToRemove);
			//    0    0:invokestatic    #30  <Method APSMediaPlayer APSMediaPlayer.getInstance()>
			//    1    3:invokevirtual   #34  <Method ViewGroup APSMediaPlayer.viewController()>
			//    2    6:aload_0         
			//    3    7:getfield        #19  <Field APSMediaOverlay$1$1 this$2>
			//    4   10:getfield        #38  <Field View APSMediaOverlay$1$1.val$viewToRemove>
			//    5   13:invokevirtual   #44  <Method void ViewGroup.removeView(View)>
			//    6   16:return          
			}

			final APSMediaOverlay._cls1._cls1 this$2;

					
					{
						this$2 = APSMediaOverlay._cls1._cls1.this;
					//    0    0:aload_0         
					//    1    1:aload_1         
					//    2    2:putfield        #19  <Field APSMediaOverlay$1$1 this$2>
						super();
					//    3    5:aload_0         
					//    4    6:invokespecial   #22  <Method void Object()>
					//    5    9:return          
					}
		}

	}

}
