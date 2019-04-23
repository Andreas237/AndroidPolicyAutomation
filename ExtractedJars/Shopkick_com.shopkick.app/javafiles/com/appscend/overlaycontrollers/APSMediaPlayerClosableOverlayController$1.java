// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appscend.overlaycontrollers;

import android.view.animation.AlphaAnimation;
import android.widget.ImageView;
import com.appscend.utilities.ProgressWheel;

// Referenced classes of package com.appscend.overlaycontrollers:
//			APSMediaPlayerClosableOverlayController

class APSMediaPlayerClosableOverlayController$1
	implements Runnable
{

	public void run()
	{
		if(APSMediaPlayerClosableOverlayController.access$000(APSMediaPlayerClosableOverlayController.this) != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #17  <Field APSMediaPlayerClosableOverlayController this$0>
	//*   2    4:invokestatic    #26  <Method ProgressWheel APSMediaPlayerClosableOverlayController.access$000(APSMediaPlayerClosableOverlayController)>
	//*   3    7:ifnull          79
		{
			Object obj = ((Object) (new AlphaAnimation(APSMediaPlayerClosableOverlayController.access$100(APSMediaPlayerClosableOverlayController.this), APSMediaPlayerClosableOverlayController.access$200(APSMediaPlayerClosableOverlayController.this))));
	//    4   10:new             #28  <Class AlphaAnimation>
	//    5   13:dup             
	//    6   14:aload_0         
	//    7   15:getfield        #17  <Field APSMediaPlayerClosableOverlayController this$0>
	//    8   18:invokestatic    #32  <Method float APSMediaPlayerClosableOverlayController.access$100(APSMediaPlayerClosableOverlayController)>
	//    9   21:aload_0         
	//   10   22:getfield        #17  <Field APSMediaPlayerClosableOverlayController this$0>
	//   11   25:invokestatic    #35  <Method float APSMediaPlayerClosableOverlayController.access$200(APSMediaPlayerClosableOverlayController)>
	//   12   28:invokespecial   #38  <Method void AlphaAnimation(float, float)>
	//   13   31:astore_1        
			((AlphaAnimation) (obj)).setDuration(0L);
	//   14   32:aload_1         
	//   15   33:lconst_0        
	//   16   34:invokevirtual   #42  <Method void AlphaAnimation.setDuration(long)>
			((AlphaAnimation) (obj)).setFillAfter(true);
	//   17   37:aload_1         
	//   18   38:iconst_1        
	//   19   39:invokevirtual   #46  <Method void AlphaAnimation.setFillAfter(boolean)>
			APSMediaPlayerClosableOverlayController.access$000(APSMediaPlayerClosableOverlayController.this).startAnimation(((android.view.animation.Animation) (obj)));
	//   20   42:aload_0         
	//   21   43:getfield        #17  <Field APSMediaPlayerClosableOverlayController this$0>
	//   22   46:invokestatic    #26  <Method ProgressWheel APSMediaPlayerClosableOverlayController.access$000(APSMediaPlayerClosableOverlayController)>
	//   23   49:aload_1         
	//   24   50:invokevirtual   #52  <Method void ProgressWheel.startAnimation(android.view.animation.Animation)>
			obj = ((Object) (APSMediaPlayerClosableOverlayController.this));
	//   25   53:aload_0         
	//   26   54:getfield        #17  <Field APSMediaPlayerClosableOverlayController this$0>
	//   27   57:astore_1        
			APSMediaPlayerClosableOverlayController.access$302(((APSMediaPlayerClosableOverlayController) (obj)), APSMediaPlayerClosableOverlayController.access$200(((APSMediaPlayerClosableOverlayController) (obj))));
	//   28   58:aload_1         
	//   29   59:aload_1         
	//   30   60:invokestatic    #35  <Method float APSMediaPlayerClosableOverlayController.access$200(APSMediaPlayerClosableOverlayController)>
	//   31   63:invokestatic    #56  <Method float APSMediaPlayerClosableOverlayController.access$302(APSMediaPlayerClosableOverlayController, float)>
	//   32   66:pop             
			APSMediaPlayerClosableOverlayController.access$000(APSMediaPlayerClosableOverlayController.this).setEnabled(true);
	//   33   67:aload_0         
	//   34   68:getfield        #17  <Field APSMediaPlayerClosableOverlayController this$0>
	//   35   71:invokestatic    #26  <Method ProgressWheel APSMediaPlayerClosableOverlayController.access$000(APSMediaPlayerClosableOverlayController)>
	//   36   74:iconst_1        
	//   37   75:invokevirtual   #59  <Method void ProgressWheel.setEnabled(boolean)>
			return;
	//   38   78:return          
		} else
		{
			Object obj1 = ((Object) (new AlphaAnimation(APSMediaPlayerClosableOverlayController.access$100(APSMediaPlayerClosableOverlayController.this), APSMediaPlayerClosableOverlayController.access$200(APSMediaPlayerClosableOverlayController.this))));
	//   39   79:new             #28  <Class AlphaAnimation>
	//   40   82:dup             
	//   41   83:aload_0         
	//   42   84:getfield        #17  <Field APSMediaPlayerClosableOverlayController this$0>
	//   43   87:invokestatic    #32  <Method float APSMediaPlayerClosableOverlayController.access$100(APSMediaPlayerClosableOverlayController)>
	//   44   90:aload_0         
	//   45   91:getfield        #17  <Field APSMediaPlayerClosableOverlayController this$0>
	//   46   94:invokestatic    #35  <Method float APSMediaPlayerClosableOverlayController.access$200(APSMediaPlayerClosableOverlayController)>
	//   47   97:invokespecial   #38  <Method void AlphaAnimation(float, float)>
	//   48  100:astore_1        
			((AlphaAnimation) (obj1)).setDuration(0L);
	//   49  101:aload_1         
	//   50  102:lconst_0        
	//   51  103:invokevirtual   #42  <Method void AlphaAnimation.setDuration(long)>
			((AlphaAnimation) (obj1)).setFillAfter(true);
	//   52  106:aload_1         
	//   53  107:iconst_1        
	//   54  108:invokevirtual   #46  <Method void AlphaAnimation.setFillAfter(boolean)>
			APSMediaPlayerClosableOverlayController.access$400(APSMediaPlayerClosableOverlayController.this).startAnimation(((android.view.animation.Animation) (obj1)));
	//   55  111:aload_0         
	//   56  112:getfield        #17  <Field APSMediaPlayerClosableOverlayController this$0>
	//   57  115:invokestatic    #63  <Method ImageView APSMediaPlayerClosableOverlayController.access$400(APSMediaPlayerClosableOverlayController)>
	//   58  118:aload_1         
	//   59  119:invokevirtual   #66  <Method void ImageView.startAnimation(android.view.animation.Animation)>
			obj1 = ((Object) (APSMediaPlayerClosableOverlayController.this));
	//   60  122:aload_0         
	//   61  123:getfield        #17  <Field APSMediaPlayerClosableOverlayController this$0>
	//   62  126:astore_1        
			APSMediaPlayerClosableOverlayController.access$302(((APSMediaPlayerClosableOverlayController) (obj1)), APSMediaPlayerClosableOverlayController.access$200(((APSMediaPlayerClosableOverlayController) (obj1))));
	//   63  127:aload_1         
	//   64  128:aload_1         
	//   65  129:invokestatic    #35  <Method float APSMediaPlayerClosableOverlayController.access$200(APSMediaPlayerClosableOverlayController)>
	//   66  132:invokestatic    #56  <Method float APSMediaPlayerClosableOverlayController.access$302(APSMediaPlayerClosableOverlayController, float)>
	//   67  135:pop             
			APSMediaPlayerClosableOverlayController.access$400(APSMediaPlayerClosableOverlayController.this).setEnabled(true);
	//   68  136:aload_0         
	//   69  137:getfield        #17  <Field APSMediaPlayerClosableOverlayController this$0>
	//   70  140:invokestatic    #63  <Method ImageView APSMediaPlayerClosableOverlayController.access$400(APSMediaPlayerClosableOverlayController)>
	//   71  143:iconst_1        
	//   72  144:invokevirtual   #67  <Method void ImageView.setEnabled(boolean)>
			return;
	//   73  147:return          
		}
	}

	final APSMediaPlayerClosableOverlayController this$0;

	APSMediaPlayerClosableOverlayController$1()
	{
		this$0 = APSMediaPlayerClosableOverlayController.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field APSMediaPlayerClosableOverlayController this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void Object()>
	//    5    9:return          
	}
}
