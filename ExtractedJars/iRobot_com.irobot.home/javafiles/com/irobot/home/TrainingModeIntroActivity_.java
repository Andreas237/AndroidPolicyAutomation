// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.LinearLayout;
import com.irobot.home.util.k;
import com.irobot.home.view.CustomButton;
import com.irobot.home.view.CustomTextView;
import org.androidannotations.api.c.*;

// Referenced classes of package com.irobot.home:
//			TrainingModeIntroActivity

public final class TrainingModeIntroActivity_ extends TrainingModeIntroActivity
	implements a, b
{

	public TrainingModeIntroActivity_()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void TrainingModeIntroActivity()>
	//    2    4:aload_0         
	//    3    5:new             #21  <Class c>
	//    4    8:dup             
	//    5    9:invokespecial   #22  <Method void c()>
	//    6   12:putfield        #24  <Field c h>
	//    7   15:return          
	}

	private void a(Bundle bundle)
	{
		e = new k(((android.content.Context) (this)));
	//    0    0:aload_0         
	//    1    1:new             #29  <Class k>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:invokespecial   #32  <Method void k(android.content.Context)>
	//    5    9:putfield        #36  <Field k e>
		c.a(((b) (this)));
	//    6   12:aload_0         
	//    7   13:invokestatic    #39  <Method void c.a(b)>
		h();
	//    8   16:aload_0         
	//    9   17:invokespecial   #41  <Method void h()>
	//   10   20:return          
	}

	private void h()
	{
		Bundle bundle = getIntent().getExtras();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #45  <Method Intent getIntent()>
	//    2    4:invokevirtual   #51  <Method Bundle Intent.getExtras()>
	//    3    7:astore_1        
		if(bundle != null && bundle.containsKey("isLaunchedFromCleanButtonInAutoLearning"))
	//*   4    8:aload_1         
	//*   5    9:ifnull          31
	//*   6   12:aload_1         
	//*   7   13:ldc1            #53  <String "isLaunchedFromCleanButtonInAutoLearning">
	//*   8   15:invokevirtual   #59  <Method boolean Bundle.containsKey(String)>
	//*   9   18:ifeq            31
			g = bundle.getBoolean("isLaunchedFromCleanButtonInAutoLearning");
	//   10   21:aload_0         
	//   11   22:aload_1         
	//   12   23:ldc1            #53  <String "isLaunchedFromCleanButtonInAutoLearning">
	//   13   25:invokevirtual   #62  <Method boolean Bundle.getBoolean(String)>
	//   14   28:putfield        #66  <Field boolean g>
	//   15   31:return          
	}

	public View a(int i)
	{
		return findViewById(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #70  <Method View findViewById(int)>
	//    3    5:areturn         
	}

	public void a(a a1)
	{
		a = (ViewPager)a1.a(0x7f090489);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #74  <Int 0x7f090489>
	//    3    4:invokeinterface #76  <Method View a.a(int)>
	//    4    9:checkcast       #78  <Class ViewPager>
	//    5   12:putfield        #81  <Field ViewPager a>
		b = (TabLayout)a1.a(0x7f090424);
	//    6   15:aload_0         
	//    7   16:aload_1         
	//    8   17:ldc1            #82  <Int 0x7f090424>
	//    9   19:invokeinterface #76  <Method View a.a(int)>
	//   10   24:checkcast       #84  <Class TabLayout>
	//   11   27:putfield        #88  <Field TabLayout b>
		c = (CustomButton)a1.a(0x7f0901a4);
	//   12   30:aload_0         
	//   13   31:aload_1         
	//   14   32:ldc1            #89  <Int 0x7f0901a4>
	//   15   34:invokeinterface #76  <Method View a.a(int)>
	//   16   39:checkcast       #91  <Class CustomButton>
	//   17   42:putfield        #95  <Field CustomButton c>
		d = (CustomTextView)a1.a(0x7f09028f);
	//   18   45:aload_0         
	//   19   46:aload_1         
	//   20   47:ldc1            #96  <Int 0x7f09028f>
	//   21   49:invokeinterface #76  <Method View a.a(int)>
	//   22   54:checkcast       #98  <Class CustomTextView>
	//   23   57:putfield        #102 <Field CustomTextView d>
		f = (LinearLayout)a1.a(0x7f0901ad);
	//   24   60:aload_0         
	//   25   61:aload_1         
	//   26   62:ldc1            #103 <Int 0x7f0901ad>
	//   27   64:invokeinterface #76  <Method View a.a(int)>
	//   28   69:checkcast       #105 <Class LinearLayout>
	//   29   72:putfield        #109 <Field LinearLayout f>
		if(c != null)
	//*  30   75:aload_0         
	//*  31   76:getfield        #95  <Field CustomButton c>
	//*  32   79:ifnull          97
			c.setOnClickListener(new android.view.View.OnClickListener() {

				public void onClick(View view)
				{
					a.f();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field TrainingModeIntroActivity_ a>
				//    2    4:invokevirtual   #25  <Method void TrainingModeIntroActivity_.f()>
				//    3    7:return          
				}

				final TrainingModeIntroActivity_ a;

			
			{
				a = TrainingModeIntroActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field TrainingModeIntroActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//   33   82:aload_0         
	//   34   83:getfield        #95  <Field CustomButton c>
	//   35   86:new             #10  <Class TrainingModeIntroActivity_$1>
	//   36   89:dup             
	//   37   90:aload_0         
	//   38   91:invokespecial   #112 <Method void TrainingModeIntroActivity_$1(TrainingModeIntroActivity_)>
	//   39   94:invokevirtual   #116 <Method void CustomButton.setOnClickListener(android.view.View$OnClickListener)>
		if(d != null)
	//*  40   97:aload_0         
	//*  41   98:getfield        #102 <Field CustomTextView d>
	//*  42  101:ifnull          119
			d.setOnClickListener(new android.view.View.OnClickListener() {

				public void onClick(View view)
				{
					a.g();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field TrainingModeIntroActivity_ a>
				//    2    4:invokevirtual   #25  <Method void TrainingModeIntroActivity_.g()>
				//    3    7:return          
				}

				final TrainingModeIntroActivity_ a;

			
			{
				a = TrainingModeIntroActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field TrainingModeIntroActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//   43  104:aload_0         
	//   44  105:getfield        #102 <Field CustomTextView d>
	//   45  108:new             #12  <Class TrainingModeIntroActivity_$2>
	//   46  111:dup             
	//   47  112:aload_0         
	//   48  113:invokespecial   #117 <Method void TrainingModeIntroActivity_$2(TrainingModeIntroActivity_)>
	//   49  116:invokevirtual   #118 <Method void CustomTextView.setOnClickListener(android.view.View$OnClickListener)>
		e();
	//   50  119:aload_0         
	//   51  120:invokevirtual   #120 <Method void e()>
	//   52  123:return          
	}

	public void onCreate(Bundle bundle)
	{
		c c1 = c.a(h);
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field c h>
	//    2    4:invokestatic    #124 <Method c c.a(c)>
	//    3    7:astore_2        
		a(bundle);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #126 <Method void a(Bundle)>
		super.onCreate(bundle);
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:invokespecial   #128 <Method void TrainingModeIntroActivity.onCreate(Bundle)>
		c.a(c1);
	//   10   18:aload_2         
	//   11   19:invokestatic    #124 <Method c c.a(c)>
	//   12   22:pop             
		setContentView(0x7f0b0075);
	//   13   23:aload_0         
	//   14   24:ldc1            #129 <Int 0x7f0b0075>
	//   15   26:invokevirtual   #133 <Method void setContentView(int)>
	//   16   29:return          
	}

	public void setContentView(int i)
	{
		super.setContentView(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #134 <Method void TrainingModeIntroActivity.setContentView(int)>
		h.a(((a) (this)));
	//    3    5:aload_0         
	//    4    6:getfield        #24  <Field c h>
	//    5    9:aload_0         
	//    6   10:invokevirtual   #136 <Method void c.a(a)>
	//    7   13:return          
	}

	public void setContentView(View view)
	{
		super.setContentView(view);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #139 <Method void TrainingModeIntroActivity.setContentView(View)>
		h.a(((a) (this)));
	//    3    5:aload_0         
	//    4    6:getfield        #24  <Field c h>
	//    5    9:aload_0         
	//    6   10:invokevirtual   #136 <Method void c.a(a)>
	//    7   13:return          
	}

	public void setContentView(View view, android.view.ViewGroup.LayoutParams layoutparams)
	{
		super.setContentView(view, layoutparams);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #142 <Method void TrainingModeIntroActivity.setContentView(View, android.view.ViewGroup$LayoutParams)>
		h.a(((a) (this)));
	//    4    6:aload_0         
	//    5    7:getfield        #24  <Field c h>
	//    6   10:aload_0         
	//    7   11:invokevirtual   #136 <Method void c.a(a)>
	//    8   14:return          
	}

	public void setIntent(Intent intent)
	{
		super.setIntent(intent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #146 <Method void TrainingModeIntroActivity.setIntent(Intent)>
		h();
	//    3    5:aload_0         
	//    4    6:invokespecial   #41  <Method void h()>
	//    5    9:return          
	}

	private final c h = new c();
}
