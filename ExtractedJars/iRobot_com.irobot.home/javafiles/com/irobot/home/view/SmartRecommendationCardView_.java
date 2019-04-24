// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import org.androidannotations.api.b;
import org.androidannotations.api.c.a;
import org.androidannotations.api.c.c;

// Referenced classes of package com.irobot.home.view:
//			SmartRecommendationCardView

public final class SmartRecommendationCardView_ extends SmartRecommendationCardView
	implements a
{

	public SmartRecommendationCardView_(Context context)
	{
		super(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #20  <Method void SmartRecommendationCardView(Context)>
		a = false;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #22  <Field boolean a>
		b = new c();
	//    6   10:aload_0         
	//    7   11:new             #24  <Class c>
	//    8   14:dup             
	//    9   15:invokespecial   #27  <Method void c()>
	//   10   18:putfield        #29  <Field c b>
		f();
	//   11   21:aload_0         
	//   12   22:invokespecial   #32  <Method void f()>
	//   13   25:return          
	}

	public SmartRecommendationCardView_(Context context, AttributeSet attributeset)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #36  <Method void SmartRecommendationCardView(Context, AttributeSet)>
		a = false;
	//    4    6:aload_0         
	//    5    7:iconst_0        
	//    6    8:putfield        #22  <Field boolean a>
		b = new c();
	//    7   11:aload_0         
	//    8   12:new             #24  <Class c>
	//    9   15:dup             
	//   10   16:invokespecial   #27  <Method void c()>
	//   11   19:putfield        #29  <Field c b>
		f();
	//   12   22:aload_0         
	//   13   23:invokespecial   #32  <Method void f()>
	//   14   26:return          
	}

	public SmartRecommendationCardView_(Context context, AttributeSet attributeset, int i)
	{
		super(context, attributeset, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #39  <Method void SmartRecommendationCardView(Context, AttributeSet, int)>
		a = false;
	//    5    7:aload_0         
	//    6    8:iconst_0        
	//    7    9:putfield        #22  <Field boolean a>
		b = new c();
	//    8   12:aload_0         
	//    9   13:new             #24  <Class c>
	//   10   16:dup             
	//   11   17:invokespecial   #27  <Method void c()>
	//   12   20:putfield        #29  <Field c b>
		f();
	//   13   23:aload_0         
	//   14   24:invokespecial   #32  <Method void f()>
	//   15   27:return          
	}

	static void a(SmartRecommendationCardView_ smartrecommendationcardview_)
	{
		((SmartRecommendationCardView) (smartrecommendationcardview_)).com.irobot.home.view.SmartRecommendationCardView.a();
	//    0    0:aload_0         
	//    1    1:invokespecial   #42  <Method void com.irobot.home.view.SmartRecommendationCardView.a()>
	//    2    4:return          
	}

	static void b(SmartRecommendationCardView_ smartrecommendationcardview_)
	{
		((SmartRecommendationCardView) (smartrecommendationcardview_)).com.irobot.home.view.SmartRecommendationCardView.c();
	//    0    0:aload_0         
	//    1    1:invokespecial   #45  <Method void com.irobot.home.view.SmartRecommendationCardView.c()>
	//    2    4:return          
	}

	static void c(SmartRecommendationCardView_ smartrecommendationcardview_)
	{
		((SmartRecommendationCardView) (smartrecommendationcardview_)).SmartRecommendationCardView.d();
	//    0    0:aload_0         
	//    1    1:invokespecial   #48  <Method void SmartRecommendationCardView.d()>
	//    2    4:return          
	}

	private void f()
	{
		org.androidannotations.api.c.c.a(org.androidannotations.api.c.c.a(b));
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field c b>
	//    2    4:invokestatic    #51  <Method c c.a(c)>
	//    3    7:invokestatic    #51  <Method c c.a(c)>
	//    4   10:pop             
	//    5   11:return          
	}

	public View a(int i)
	{
		return findViewById(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #55  <Method View findViewById(int)>
	//    3    5:areturn         
	}

	public void a()
	{
		org.androidannotations.api.b.a("", new Runnable() {

			public void run()
			{
				com.irobot.home.view.SmartRecommendationCardView_.a(a);
			//    0    0:aload_0         
			//    1    1:getfield        #16  <Field SmartRecommendationCardView_ a>
			//    2    4:invokestatic    #22  <Method void com.irobot.home.view.SmartRecommendationCardView_.a(SmartRecommendationCardView_)>
			//    3    7:return          
			}

			final SmartRecommendationCardView_ a;

			
			{
				a = SmartRecommendationCardView_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field SmartRecommendationCardView_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #18  <Method void Object()>
			//    5    9:return          
			}
		}
, 0L);
	//    0    0:ldc1            #59  <String "">
	//    1    2:new             #8   <Class SmartRecommendationCardView_$1>
	//    2    5:dup             
	//    3    6:aload_0         
	//    4    7:invokespecial   #61  <Method void SmartRecommendationCardView_$1(SmartRecommendationCardView_)>
	//    5   10:lconst_0        
	//    6   11:invokestatic    #66  <Method void b.a(String, Runnable, long)>
	//    7   14:return          
	}

	public void c()
	{
		org.androidannotations.api.b.a("", new Runnable() {

			public void run()
			{
				com.irobot.home.view.SmartRecommendationCardView_.b(a);
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field SmartRecommendationCardView_ a>
			//    2    4:invokestatic    #24  <Method void com.irobot.home.view.SmartRecommendationCardView_.b(SmartRecommendationCardView_)>
			//    3    7:return          
			}

			final SmartRecommendationCardView_ a;

			
			{
				a = SmartRecommendationCardView_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field SmartRecommendationCardView_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
, 0L);
	//    0    0:ldc1            #59  <String "">
	//    1    2:new             #10  <Class SmartRecommendationCardView_$2>
	//    2    5:dup             
	//    3    6:aload_0         
	//    4    7:invokespecial   #67  <Method void SmartRecommendationCardView_$2(SmartRecommendationCardView_)>
	//    5   10:lconst_0        
	//    6   11:invokestatic    #66  <Method void b.a(String, Runnable, long)>
	//    7   14:return          
	}

	void d()
	{
		org.androidannotations.api.b.a("", new Runnable() {

			public void run()
			{
				com.irobot.home.view.SmartRecommendationCardView_.c(a);
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field SmartRecommendationCardView_ a>
			//    2    4:invokestatic    #24  <Method void com.irobot.home.view.SmartRecommendationCardView_.c(SmartRecommendationCardView_)>
			//    3    7:return          
			}

			final SmartRecommendationCardView_ a;

			
			{
				a = SmartRecommendationCardView_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field SmartRecommendationCardView_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
, 0L);
	//    0    0:ldc1            #59  <String "">
	//    1    2:new             #12  <Class SmartRecommendationCardView_$3>
	//    2    5:dup             
	//    3    6:aload_0         
	//    4    7:invokespecial   #68  <Method void SmartRecommendationCardView_$3(SmartRecommendationCardView_)>
	//    5   10:lconst_0        
	//    6   11:invokestatic    #66  <Method void b.a(String, Runnable, long)>
	//    7   14:return          
	}

	public void onFinishInflate()
	{
		if(!a)
	//*   0    0:aload_0         
	//*   1    1:getfield        #22  <Field boolean a>
	//*   2    4:ifne            20
		{
			a = true;
	//    3    7:aload_0         
	//    4    8:iconst_1        
	//    5    9:putfield        #22  <Field boolean a>
			b.a(((a) (this)));
	//    6   12:aload_0         
	//    7   13:getfield        #29  <Field c b>
	//    8   16:aload_0         
	//    9   17:invokevirtual   #72  <Method void c.a(a)>
		}
		super.onFinishInflate();
	//   10   20:aload_0         
	//   11   21:invokespecial   #74  <Method void SmartRecommendationCardView.onFinishInflate()>
	//   12   24:return          
	}

	private boolean a;
	private final c b;
}
