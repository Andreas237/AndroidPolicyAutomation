// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.widget.RatingBar;
import com.irobot.home.view.CustomButton;

// Referenced classes of package com.irobot.home:
//			WifiMapFeedbackActivity

class WifiMapFeedbackActivity$1
	implements android.widget.eListener
{

	public void onRatingChanged(RatingBar ratingbar, float f, boolean flag)
	{
		if(WifiMapFeedbackActivity.a(a).getRating() > 0.0F && WifiMapFeedbackActivity.b(a).getRating() > 0.0F && WifiMapFeedbackActivity.c(a).getRating() > 0.0F)
	//*   0    0:aload_0         
	//*   1    1:getfield        #14  <Field WifiMapFeedbackActivity a>
	//*   2    4:invokestatic    #23  <Method RatingBar WifiMapFeedbackActivity.a(WifiMapFeedbackActivity)>
	//*   3    7:invokevirtual   #29  <Method float RatingBar.getRating()>
	//*   4   10:fconst_0        
	//*   5   11:fcmpl           
	//*   6   12:ifle            50
	//*   7   15:aload_0         
	//*   8   16:getfield        #14  <Field WifiMapFeedbackActivity a>
	//*   9   19:invokestatic    #32  <Method RatingBar WifiMapFeedbackActivity.b(WifiMapFeedbackActivity)>
	//*  10   22:invokevirtual   #29  <Method float RatingBar.getRating()>
	//*  11   25:fconst_0        
	//*  12   26:fcmpl           
	//*  13   27:ifle            50
	//*  14   30:aload_0         
	//*  15   31:getfield        #14  <Field WifiMapFeedbackActivity a>
	//*  16   34:invokestatic    #35  <Method RatingBar WifiMapFeedbackActivity.c(WifiMapFeedbackActivity)>
	//*  17   37:invokevirtual   #29  <Method float RatingBar.getRating()>
	//*  18   40:fconst_0        
	//*  19   41:fcmpl           
	//*  20   42:ifle            50
			flag = true;
	//   21   45:iconst_1        
	//   22   46:istore_3        
		else
	//*  23   47:goto            52
			flag = false;
	//   24   50:iconst_0        
	//   25   51:istore_3        
		a.d.setEnabled(flag);
	//   26   52:aload_0         
	//   27   53:getfield        #14  <Field WifiMapFeedbackActivity a>
	//   28   56:getfield        #39  <Field CustomButton WifiMapFeedbackActivity.d>
	//   29   59:iload_3         
	//   30   60:invokevirtual   #45  <Method void CustomButton.setEnabled(boolean)>
	//   31   63:return          
	}

	final WifiMapFeedbackActivity a;

	WifiMapFeedbackActivity$1(WifiMapFeedbackActivity wifimapfeedbackactivity)
	{
		a = wifimapfeedbackactivity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field WifiMapFeedbackActivity a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #17  <Method void Object()>
	//    5    9:return          
	}
}
