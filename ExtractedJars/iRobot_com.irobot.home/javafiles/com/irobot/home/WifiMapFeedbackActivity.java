// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.widget.*;
import com.irobot.core.AnalyticsSubsystem;
import com.irobot.home.view.CustomButton;

// Referenced classes of package com.irobot.home:
//			BaseFragmentActivity

public class WifiMapFeedbackActivity extends BaseFragmentActivity
{

	public WifiMapFeedbackActivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void BaseFragmentActivity()>
	//    2    4:aload_0         
	//    3    5:new             #6   <Class WifiMapFeedbackActivity$1>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:invokespecial   #25  <Method void WifiMapFeedbackActivity$1(WifiMapFeedbackActivity)>
	//    7   13:putfield        #27  <Field android.widget.RatingBar$OnRatingBarChangeListener e>
	//    8   16:return          
	}

	static RatingBar a(WifiMapFeedbackActivity wifimapfeedbackactivity)
	{
		return wifimapfeedbackactivity.f;
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field RatingBar f>
	//    2    4:areturn         
	}

	private void a(LinearLayout linearlayout, int i, int j, int k)
	{
		((TextView)linearlayout.findViewById(0x7f090310)).setText(i);
	//    0    0:aload_1         
	//    1    1:ldc1            #33  <Int 0x7f090310>
	//    2    3:invokevirtual   #39  <Method android.view.View LinearLayout.findViewById(int)>
	//    3    6:checkcast       #41  <Class TextView>
	//    4    9:iload_2         
	//    5   10:invokevirtual   #45  <Method void TextView.setText(int)>
		((TextView)linearlayout.findViewById(0x7f09022b)).setText(j);
	//    6   13:aload_1         
	//    7   14:ldc1            #46  <Int 0x7f09022b>
	//    8   16:invokevirtual   #39  <Method android.view.View LinearLayout.findViewById(int)>
	//    9   19:checkcast       #41  <Class TextView>
	//   10   22:iload_3         
	//   11   23:invokevirtual   #45  <Method void TextView.setText(int)>
		((TextView)linearlayout.findViewById(0x7f0901c2)).setText(k);
	//   12   26:aload_1         
	//   13   27:ldc1            #47  <Int 0x7f0901c2>
	//   14   29:invokevirtual   #39  <Method android.view.View LinearLayout.findViewById(int)>
	//   15   32:checkcast       #41  <Class TextView>
	//   16   35:iload           4
	//   17   37:invokevirtual   #45  <Method void TextView.setText(int)>
	//   18   40:return          
	}

	static RatingBar b(WifiMapFeedbackActivity wifimapfeedbackactivity)
	{
		return wifimapfeedbackactivity.g;
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field RatingBar g>
	//    2    4:areturn         
	}

	static RatingBar c(WifiMapFeedbackActivity wifimapfeedbackactivity)
	{
		return wifimapfeedbackactivity.h;
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field RatingBar h>
	//    2    4:areturn         
	}

	protected void e()
	{
		b(0x7f0f02f1);
	//    0    0:aload_0         
	//    1    1:ldc1            #52  <Int 0x7f0f02f1>
	//    2    3:invokevirtual   #54  <Method void b(int)>
		a(a, 0x7f0f0979, 0x7f0f04e5, 0x7f0f0953);
	//    3    6:aload_0         
	//    4    7:aload_0         
	//    5    8:getfield        #56  <Field LinearLayout a>
	//    6   11:ldc1            #57  <Int 0x7f0f0979>
	//    7   13:ldc1            #58  <Int 0x7f0f04e5>
	//    8   15:ldc1            #59  <Int 0x7f0f0953>
	//    9   17:invokespecial   #61  <Method void a(LinearLayout, int, int, int)>
		a(b, 0x7f0f097a, 0x7f0f04e6, 0x7f0f0955);
	//   10   20:aload_0         
	//   11   21:aload_0         
	//   12   22:getfield        #63  <Field LinearLayout b>
	//   13   25:ldc1            #64  <Int 0x7f0f097a>
	//   14   27:ldc1            #65  <Int 0x7f0f04e6>
	//   15   29:ldc1            #66  <Int 0x7f0f0955>
	//   16   31:invokespecial   #61  <Method void a(LinearLayout, int, int, int)>
		a(c, 0x7f0f097b, 0x7f0f04e7, 0x7f0f0956);
	//   17   34:aload_0         
	//   18   35:aload_0         
	//   19   36:getfield        #68  <Field LinearLayout c>
	//   20   39:ldc1            #69  <Int 0x7f0f097b>
	//   21   41:ldc1            #70  <Int 0x7f0f04e7>
	//   22   43:ldc1            #71  <Int 0x7f0f0956>
	//   23   45:invokespecial   #61  <Method void a(LinearLayout, int, int, int)>
		f = (RatingBar)a.findViewById(0x7f09031c);
	//   24   48:aload_0         
	//   25   49:aload_0         
	//   26   50:getfield        #56  <Field LinearLayout a>
	//   27   53:ldc1            #72  <Int 0x7f09031c>
	//   28   55:invokevirtual   #39  <Method android.view.View LinearLayout.findViewById(int)>
	//   29   58:checkcast       #74  <Class RatingBar>
	//   30   61:putfield        #31  <Field RatingBar f>
		f.setOnRatingBarChangeListener(e);
	//   31   64:aload_0         
	//   32   65:getfield        #31  <Field RatingBar f>
	//   33   68:aload_0         
	//   34   69:getfield        #27  <Field android.widget.RatingBar$OnRatingBarChangeListener e>
	//   35   72:invokevirtual   #78  <Method void RatingBar.setOnRatingBarChangeListener(android.widget.RatingBar$OnRatingBarChangeListener)>
		g = (RatingBar)b.findViewById(0x7f09031c);
	//   36   75:aload_0         
	//   37   76:aload_0         
	//   38   77:getfield        #63  <Field LinearLayout b>
	//   39   80:ldc1            #72  <Int 0x7f09031c>
	//   40   82:invokevirtual   #39  <Method android.view.View LinearLayout.findViewById(int)>
	//   41   85:checkcast       #74  <Class RatingBar>
	//   42   88:putfield        #49  <Field RatingBar g>
		g.setOnRatingBarChangeListener(e);
	//   43   91:aload_0         
	//   44   92:getfield        #49  <Field RatingBar g>
	//   45   95:aload_0         
	//   46   96:getfield        #27  <Field android.widget.RatingBar$OnRatingBarChangeListener e>
	//   47   99:invokevirtual   #78  <Method void RatingBar.setOnRatingBarChangeListener(android.widget.RatingBar$OnRatingBarChangeListener)>
		h = (RatingBar)c.findViewById(0x7f09031c);
	//   48  102:aload_0         
	//   49  103:aload_0         
	//   50  104:getfield        #68  <Field LinearLayout c>
	//   51  107:ldc1            #72  <Int 0x7f09031c>
	//   52  109:invokevirtual   #39  <Method android.view.View LinearLayout.findViewById(int)>
	//   53  112:checkcast       #74  <Class RatingBar>
	//   54  115:putfield        #51  <Field RatingBar h>
		h.setOnRatingBarChangeListener(e);
	//   55  118:aload_0         
	//   56  119:getfield        #51  <Field RatingBar h>
	//   57  122:aload_0         
	//   58  123:getfield        #27  <Field android.widget.RatingBar$OnRatingBarChangeListener e>
	//   59  126:invokevirtual   #78  <Method void RatingBar.setOnRatingBarChangeListener(android.widget.RatingBar$OnRatingBarChangeListener)>
	//   60  129:return          
	}

	protected void f()
	{
		Toast.makeText(((android.content.Context) (this)), 0x7f0f08b6, 0).show();
	//    0    0:aload_0         
	//    1    1:ldc1            #79  <Int 0x7f0f08b6>
	//    2    3:iconst_0        
	//    3    4:invokestatic    #85  <Method Toast Toast.makeText(android.content.Context, int, int)>
	//    4    7:invokevirtual   #88  <Method void Toast.show()>
		AnalyticsSubsystem.getInstance().trackWifiMapFeedbackResponseGiven(f.getRating(), g.getRating(), h.getRating());
	//    5   10:invokestatic    #94  <Method AnalyticsSubsystem AnalyticsSubsystem.getInstance()>
	//    6   13:aload_0         
	//    7   14:getfield        #31  <Field RatingBar f>
	//    8   17:invokevirtual   #98  <Method float RatingBar.getRating()>
	//    9   20:aload_0         
	//   10   21:getfield        #49  <Field RatingBar g>
	//   11   24:invokevirtual   #98  <Method float RatingBar.getRating()>
	//   12   27:aload_0         
	//   13   28:getfield        #51  <Field RatingBar h>
	//   14   31:invokevirtual   #98  <Method float RatingBar.getRating()>
	//   15   34:invokevirtual   #102 <Method void AnalyticsSubsystem.trackWifiMapFeedbackResponseGiven(float, float, float)>
		finish();
	//   16   37:aload_0         
	//   17   38:invokevirtual   #105 <Method void finish()>
	//   18   41:return          
	}

	LinearLayout a;
	LinearLayout b;
	LinearLayout c;
	CustomButton d;
	final android.widget.RatingBar.OnRatingBarChangeListener e = new android.widget.RatingBar.OnRatingBarChangeListener() {

		public void onRatingChanged(RatingBar ratingbar, float f1, boolean flag)
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

			
			{
				a = WifiMapFeedbackActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field WifiMapFeedbackActivity a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #17  <Method void Object()>
			//    5    9:return          
			}
	}
;
	private RatingBar f;
	private RatingBar g;
	private RatingBar h;
}
