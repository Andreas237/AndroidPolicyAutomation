// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.view;

import android.view.ViewTreeObserver;
import android.widget.ImageView;
import com.irobot.home.util.o;
import java.util.Locale;

// Referenced classes of package com.irobot.home.view:
//			BatteryGaugeView

class BatteryGaugeView$2
	implements android.view.GlobalLayoutListener
{

	public void onGlobalLayout()
	{
		IllegalStateException illegalstateexception;
		BatteryGaugeView.a(a, BatteryGaugeView.e(a).getWidth());
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field BatteryGaugeView a>
	//    2    4:aload_0         
	//    3    5:getfield        #17  <Field BatteryGaugeView a>
	//    4    8:invokestatic    #27  <Method ImageView BatteryGaugeView.e(BatteryGaugeView)>
	//    5   11:invokevirtual   #33  <Method int ImageView.getWidth()>
	//    6   14:invokestatic    #36  <Method int BatteryGaugeView.a(BatteryGaugeView, int)>
	//    7   17:pop             
		BatteryGaugeView.b(a, BatteryGaugeView.e(a).getHeight());
	//    8   18:aload_0         
	//    9   19:getfield        #17  <Field BatteryGaugeView a>
	//   10   22:aload_0         
	//   11   23:getfield        #17  <Field BatteryGaugeView a>
	//   12   26:invokestatic    #27  <Method ImageView BatteryGaugeView.e(BatteryGaugeView)>
	//   13   29:invokevirtual   #39  <Method int ImageView.getHeight()>
	//   14   32:invokestatic    #42  <Method int BatteryGaugeView.b(BatteryGaugeView, int)>
	//   15   35:pop             
		try
		{
			if(BatteryGaugeView.f(a) > 0)
	//*  16   36:aload_0         
	//*  17   37:getfield        #17  <Field BatteryGaugeView a>
	//*  18   40:invokestatic    #46  <Method int BatteryGaugeView.f(BatteryGaugeView)>
	//*  19   43:ifle            97
			{
				a.getViewTreeObserver().removeOnGlobalLayoutListener(((android.view.GlobalLayoutListener) (this)));
	//   20   46:aload_0         
	//   21   47:getfield        #17  <Field BatteryGaugeView a>
	//   22   50:invokevirtual   #50  <Method ViewTreeObserver BatteryGaugeView.getViewTreeObserver()>
	//   23   53:aload_0         
	//   24   54:invokevirtual   #56  <Method void ViewTreeObserver.removeOnGlobalLayoutListener(android.view.ViewTreeObserver$OnGlobalLayoutListener)>
				a.post(BatteryGaugeView.g(a));
	//   25   57:aload_0         
	//   26   58:getfield        #17  <Field BatteryGaugeView a>
	//   27   61:aload_0         
	//   28   62:getfield        #17  <Field BatteryGaugeView a>
	//   29   65:invokestatic    #60  <Method Runnable BatteryGaugeView.g(BatteryGaugeView)>
	//   30   68:invokevirtual   #64  <Method boolean BatteryGaugeView.post(Runnable)>
	//   31   71:pop             
				return;
	//   32   72:return          
			}
		}
	//*  33   73:invokestatic    #67  <Method String BatteryGaugeView.a()>
	//*  34   76:getstatic       #73  <Field Locale Locale.US>
	//*  35   79:ldc1            #75  <String "%s tried to remove an expired tree observer">
	//*  36   81:iconst_1        
	//*  37   82:anewarray       Object[]
	//*  38   85:dup             
	//*  39   86:iconst_0        
	//*  40   87:invokestatic    #67  <Method String BatteryGaugeView.a()>
	//*  41   90:aastore         
	//*  42   91:invokestatic    #81  <Method String String.format(Locale, String, Object[])>
	//*  43   94:invokestatic    #86  <Method void o.d(String, String)>
	//*  44   97:return          
		// Misplaced declaration of an exception variable
		catch(IllegalStateException illegalstateexception)
		{
			o.d(BatteryGaugeView.a(), String.format(Locale.US, "%s tried to remove an expired tree observer", new Object[] {
				BatteryGaugeView.a()
			}));
		}
	//*  45   98:astore_1        
	//*  46   99:goto            73
	}

	final BatteryGaugeView a;

	BatteryGaugeView$2(BatteryGaugeView batterygaugeview)
	{
		a = batterygaugeview;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field BatteryGaugeView a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}
}
