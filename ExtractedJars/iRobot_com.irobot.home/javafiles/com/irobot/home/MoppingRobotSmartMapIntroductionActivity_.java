// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import com.irobot.home.view.CustomButton;
import com.irobot.home.view.CustomTextView;
import org.androidannotations.api.c.*;

// Referenced classes of package com.irobot.home:
//			MoppingRobotSmartMapIntroductionActivity

public final class MoppingRobotSmartMapIntroductionActivity_ extends MoppingRobotSmartMapIntroductionActivity
	implements a, b
{

	public MoppingRobotSmartMapIntroductionActivity_()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void MoppingRobotSmartMapIntroductionActivity()>
	//    2    4:aload_0         
	//    3    5:new             #22  <Class c>
	//    4    8:dup             
	//    5    9:invokespecial   #23  <Method void c()>
	//    6   12:putfield        #25  <Field c e>
	//    7   15:return          
	}

	private void a(Bundle bundle)
	{
		c.a(((b) (this)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #31  <Method void c.a(b)>
	//    2    4:return          
	}

	public View a(int i)
	{
		return findViewById(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #35  <Method View findViewById(int)>
	//    3    5:areturn         
	}

	public void a(a a1)
	{
		a = (ImageButton)a1.a(0x7f0900ae);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #39  <Int 0x7f0900ae>
	//    3    4:invokeinterface #41  <Method View a.a(int)>
	//    4    9:checkcast       #43  <Class ImageButton>
	//    5   12:putfield        #46  <Field ImageButton a>
		b = (CustomButton)a1.a(0x7f090041);
	//    6   15:aload_0         
	//    7   16:aload_1         
	//    8   17:ldc1            #47  <Int 0x7f090041>
	//    9   19:invokeinterface #41  <Method View a.a(int)>
	//   10   24:checkcast       #49  <Class CustomButton>
	//   11   27:putfield        #53  <Field CustomButton b>
		c = (CustomTextView)a1.a(0x7f09024d);
	//   12   30:aload_0         
	//   13   31:aload_1         
	//   14   32:ldc1            #54  <Int 0x7f09024d>
	//   15   34:invokeinterface #41  <Method View a.a(int)>
	//   16   39:checkcast       #56  <Class CustomTextView>
	//   17   42:putfield        #60  <Field CustomTextView c>
		d = (CustomTextView)a1.a(0x7f090011);
	//   18   45:aload_0         
	//   19   46:aload_1         
	//   20   47:ldc1            #61  <Int 0x7f090011>
	//   21   49:invokeinterface #41  <Method View a.a(int)>
	//   22   54:checkcast       #56  <Class CustomTextView>
	//   23   57:putfield        #64  <Field CustomTextView d>
		if(b != null)
	//*  24   60:aload_0         
	//*  25   61:getfield        #53  <Field CustomButton b>
	//*  26   64:ifnull          82
			b.setOnClickListener(new android.view.View.OnClickListener() {

				public void onClick(View view)
				{
					a.f();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field MoppingRobotSmartMapIntroductionActivity_ a>
				//    2    4:invokevirtual   #25  <Method void MoppingRobotSmartMapIntroductionActivity_.f()>
				//    3    7:return          
				}

				final MoppingRobotSmartMapIntroductionActivity_ a;

			
			{
				a = MoppingRobotSmartMapIntroductionActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field MoppingRobotSmartMapIntroductionActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//   27   67:aload_0         
	//   28   68:getfield        #53  <Field CustomButton b>
	//   29   71:new             #10  <Class MoppingRobotSmartMapIntroductionActivity_$1>
	//   30   74:dup             
	//   31   75:aload_0         
	//   32   76:invokespecial   #67  <Method void MoppingRobotSmartMapIntroductionActivity_$1(MoppingRobotSmartMapIntroductionActivity_)>
	//   33   79:invokevirtual   #71  <Method void CustomButton.setOnClickListener(android.view.View$OnClickListener)>
		if(c != null)
	//*  34   82:aload_0         
	//*  35   83:getfield        #60  <Field CustomTextView c>
	//*  36   86:ifnull          104
			c.setOnClickListener(new android.view.View.OnClickListener() {

				public void onClick(View view)
				{
					a.g();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field MoppingRobotSmartMapIntroductionActivity_ a>
				//    2    4:invokevirtual   #25  <Method void MoppingRobotSmartMapIntroductionActivity_.g()>
				//    3    7:return          
				}

				final MoppingRobotSmartMapIntroductionActivity_ a;

			
			{
				a = MoppingRobotSmartMapIntroductionActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field MoppingRobotSmartMapIntroductionActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//   37   89:aload_0         
	//   38   90:getfield        #60  <Field CustomTextView c>
	//   39   93:new             #12  <Class MoppingRobotSmartMapIntroductionActivity_$2>
	//   40   96:dup             
	//   41   97:aload_0         
	//   42   98:invokespecial   #72  <Method void MoppingRobotSmartMapIntroductionActivity_$2(MoppingRobotSmartMapIntroductionActivity_)>
	//   43  101:invokevirtual   #73  <Method void CustomTextView.setOnClickListener(android.view.View$OnClickListener)>
		if(a != null)
	//*  44  104:aload_0         
	//*  45  105:getfield        #46  <Field ImageButton a>
	//*  46  108:ifnull          126
			a.setOnClickListener(new android.view.View.OnClickListener() {

				public void onClick(View view)
				{
					a.h();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field MoppingRobotSmartMapIntroductionActivity_ a>
				//    2    4:invokevirtual   #25  <Method void MoppingRobotSmartMapIntroductionActivity_.h()>
				//    3    7:return          
				}

				final MoppingRobotSmartMapIntroductionActivity_ a;

			
			{
				a = MoppingRobotSmartMapIntroductionActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field MoppingRobotSmartMapIntroductionActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//   47  111:aload_0         
	//   48  112:getfield        #46  <Field ImageButton a>
	//   49  115:new             #14  <Class MoppingRobotSmartMapIntroductionActivity_$3>
	//   50  118:dup             
	//   51  119:aload_0         
	//   52  120:invokespecial   #74  <Method void MoppingRobotSmartMapIntroductionActivity_$3(MoppingRobotSmartMapIntroductionActivity_)>
	//   53  123:invokevirtual   #75  <Method void ImageButton.setOnClickListener(android.view.View$OnClickListener)>
		e();
	//   54  126:aload_0         
	//   55  127:invokevirtual   #77  <Method void e()>
	//   56  130:return          
	}

	public void onCreate(Bundle bundle)
	{
		c c1 = c.a(e);
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field c e>
	//    2    4:invokestatic    #81  <Method c c.a(c)>
	//    3    7:astore_2        
		a(bundle);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #83  <Method void a(Bundle)>
		super.onCreate(bundle);
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:invokespecial   #85  <Method void MoppingRobotSmartMapIntroductionActivity.onCreate(Bundle)>
		c.a(c1);
	//   10   18:aload_2         
	//   11   19:invokestatic    #81  <Method c c.a(c)>
	//   12   22:pop             
		setContentView(0x7f0b0053);
	//   13   23:aload_0         
	//   14   24:ldc1            #86  <Int 0x7f0b0053>
	//   15   26:invokevirtual   #90  <Method void setContentView(int)>
	//   16   29:return          
	}

	public void setContentView(int i)
	{
		super.setContentView(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #91  <Method void MoppingRobotSmartMapIntroductionActivity.setContentView(int)>
		e.a(((a) (this)));
	//    3    5:aload_0         
	//    4    6:getfield        #25  <Field c e>
	//    5    9:aload_0         
	//    6   10:invokevirtual   #93  <Method void c.a(a)>
	//    7   13:return          
	}

	public void setContentView(View view)
	{
		super.setContentView(view);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #96  <Method void MoppingRobotSmartMapIntroductionActivity.setContentView(View)>
		e.a(((a) (this)));
	//    3    5:aload_0         
	//    4    6:getfield        #25  <Field c e>
	//    5    9:aload_0         
	//    6   10:invokevirtual   #93  <Method void c.a(a)>
	//    7   13:return          
	}

	public void setContentView(View view, android.view.ViewGroup.LayoutParams layoutparams)
	{
		super.setContentView(view, layoutparams);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #99  <Method void MoppingRobotSmartMapIntroductionActivity.setContentView(View, android.view.ViewGroup$LayoutParams)>
		e.a(((a) (this)));
	//    4    6:aload_0         
	//    5    7:getfield        #25  <Field c e>
	//    6   10:aload_0         
	//    7   11:invokevirtual   #93  <Method void c.a(a)>
	//    8   14:return          
	}

	private final c e = new c();
}
