// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v4.view.p;
import android.widget.LinearLayout;
import com.irobot.core.AssetId;
import com.irobot.core.AssetInfo;
import com.irobot.home.b.am;
import com.irobot.home.model.a;
import com.irobot.home.util.j;
import com.irobot.home.util.k;
import com.irobot.home.view.CustomButton;
import com.irobot.home.view.CustomTextView;
import org.androidannotations.api.b.d;

// Referenced classes of package com.irobot.home:
//			BaseFragmentActivity, RobotCleanActivity_, FloorPlanActivity_

public class TrainingModeIntroActivity extends BaseFragmentActivity
	implements com.irobot.home.b.am.a
{

	public TrainingModeIntroActivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #31  <Method void BaseFragmentActivity()>
		g = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #33  <Field boolean g>
	//    5    9:return          
	}

	static int a(TrainingModeIntroActivity trainingmodeintroactivity, int l)
	{
		trainingmodeintroactivity.i = l;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #37  <Field int i>
		return l;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

	void e()
	{
		h = j.j().a().getName();
	//    0    0:aload_0         
	//    1    1:invokestatic    #43  <Method a j.j()>
	//    2    4:invokevirtual   #48  <Method AssetInfo a.a()>
	//    3    7:invokevirtual   #54  <Method String AssetInfo.getName()>
	//    4   10:putfield        #56  <Field String h>
		a.setAdapter(((p) (new am(((android.content.Context) (this)), ((com.irobot.home.b.am.a) (this)), h))));
	//    5   13:aload_0         
	//    6   14:getfield        #58  <Field ViewPager a>
	//    7   17:new             #60  <Class am>
	//    8   20:dup             
	//    9   21:aload_0         
	//   10   22:aload_0         
	//   11   23:aload_0         
	//   12   24:getfield        #56  <Field String h>
	//   13   27:invokespecial   #63  <Method void am(android.content.Context, com.irobot.home.b.am$a, String)>
	//   14   30:invokevirtual   #69  <Method void ViewPager.setAdapter(p)>
		b.a(a, true);
	//   15   33:aload_0         
	//   16   34:getfield        #71  <Field TabLayout b>
	//   17   37:aload_0         
	//   18   38:getfield        #58  <Field ViewPager a>
	//   19   41:iconst_1        
	//   20   42:invokevirtual   #76  <Method void TabLayout.a(ViewPager, boolean)>
		b(0x7f0f084d);
	//   21   45:aload_0         
	//   22   46:ldc1            #77  <Int 0x7f0f084d>
	//   23   48:invokevirtual   #80  <Method void b(int)>
		if(g)
	//*  24   51:aload_0         
	//*  25   52:getfield        #33  <Field boolean g>
	//*  26   55:ifeq            92
		{
			b.setVisibility(4);
	//   27   58:aload_0         
	//   28   59:getfield        #71  <Field TabLayout b>
	//   29   62:iconst_4        
	//   30   63:invokevirtual   #83  <Method void TabLayout.setVisibility(int)>
			d.setVisibility(4);
	//   31   66:aload_0         
	//   32   67:getfield        #85  <Field CustomTextView d>
	//   33   70:iconst_4        
	//   34   71:invokevirtual   #88  <Method void CustomTextView.setVisibility(int)>
			a.setCurrentItem(1);
	//   35   74:aload_0         
	//   36   75:getfield        #58  <Field ViewPager a>
	//   37   78:iconst_1        
	//   38   79:invokevirtual   #91  <Method void ViewPager.setCurrentItem(int)>
			c.setText(0x7f0f05bc);
	//   39   82:aload_0         
	//   40   83:getfield        #93  <Field CustomButton c>
	//   41   86:ldc1            #94  <Int 0x7f0f05bc>
	//   42   88:invokevirtual   #99  <Method void CustomButton.setText(int)>
			return;
	//   43   91:return          
		} else
		{
			a.a(new android.support.v4.view.ViewPager.e() {

				public void a(int l)
				{
				//    0    0:return          
				}

				public void a(int l, float f1, int i1)
				{
					CustomButton custombutton;
					if(l == a.a.getAdapter().getCount() - 1)
				//*   0    0:iload_1         
				//*   1    1:aload_0         
				//*   2    2:getfield        #17  <Field TrainingModeIntroActivity a>
				//*   3    5:getfield        #25  <Field ViewPager com.irobot.home.TrainingModeIntroActivity.a>
				//*   4    8:invokevirtual   #31  <Method p ViewPager.getAdapter()>
				//*   5   11:invokevirtual   #37  <Method int p.getCount()>
				//*   6   14:iconst_1        
				//*   7   15:isub            
				//*   8   16:icmpne          50
					{
						custombutton = a.c;
				//    9   19:aload_0         
				//   10   20:getfield        #17  <Field TrainingModeIntroActivity a>
				//   11   23:getfield        #41  <Field CustomButton TrainingModeIntroActivity.c>
				//   12   26:astore          4
						i1 = 0;
				//   13   28:iconst_0        
				//   14   29:istore_3        
					} else
				//*  15   30:aload           4
				//*  16   32:iload_3         
				//*  17   33:invokevirtual   #46  <Method void CustomButton.setVisibility(int)>
				//*  18   36:aload_0         
				//*  19   37:getfield        #17  <Field TrainingModeIntroActivity a>
				//*  20   40:getfield        #50  <Field CustomTextView com.irobot.home.TrainingModeIntroActivity.d>
				//*  21   43:iload_3         
				//*  22   44:invokevirtual   #53  <Method void CustomTextView.setVisibility(int)>
				//*  23   47:goto            64
					{
						custombutton = a.c;
				//   24   50:aload_0         
				//   25   51:getfield        #17  <Field TrainingModeIntroActivity a>
				//   26   54:getfield        #41  <Field CustomButton TrainingModeIntroActivity.c>
				//   27   57:astore          4
						i1 = 4;
				//   28   59:iconst_4        
				//   29   60:istore_3        
					}
					custombutton.setVisibility(i1);
					a.d.setVisibility(i1);
				//*  30   61:goto            30
					com.irobot.home.TrainingModeIntroActivity.a(a, l);
				//   31   64:aload_0         
				//   32   65:getfield        #17  <Field TrainingModeIntroActivity a>
				//   33   68:iload_1         
				//   34   69:invokestatic    #56  <Method int com.irobot.home.TrainingModeIntroActivity.a(TrainingModeIntroActivity, int)>
				//   35   72:pop             
				//   36   73:return          
				}

				public void b(int l)
				{
					com.irobot.home.TrainingModeIntroActivity.a(a, l);
				//    0    0:aload_0         
				//    1    1:getfield        #17  <Field TrainingModeIntroActivity a>
				//    2    4:iload_1         
				//    3    5:invokestatic    #56  <Method int com.irobot.home.TrainingModeIntroActivity.a(TrainingModeIntroActivity, int)>
				//    4    8:pop             
				//    5    9:return          
				}

				final TrainingModeIntroActivity a;

			
			{
				a = TrainingModeIntroActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field TrainingModeIntroActivity a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//   44   92:aload_0         
	//   45   93:getfield        #58  <Field ViewPager a>
	//   46   96:new             #8   <Class TrainingModeIntroActivity$1>
	//   47   99:dup             
	//   48  100:aload_0         
	//   49  101:invokespecial   #102 <Method void TrainingModeIntroActivity$1(TrainingModeIntroActivity)>
	//   50  104:invokevirtual   #105 <Method void ViewPager.a(android.support.v4.view.ViewPager$e)>
			return;
	//   51  107:return          
		}
	}

	public void f()
	{
		if(g)
	//*   0    0:aload_0         
	//*   1    1:getfield        #33  <Field boolean g>
	//*   2    4:ifeq            28
		{
			((RobotCleanActivity_.a)com.irobot.home.RobotCleanActivity_.a(((android.content.Context) (this))).g(0x4000000)).a();
	//    3    7:aload_0         
	//    4    8:invokestatic    #110 <Method RobotCleanActivity_$a com.irobot.home.RobotCleanActivity_.a(android.content.Context)>
	//    5   11:ldc1            #111 <Int 0x4000000>
	//    6   13:invokevirtual   #116 <Method org.androidannotations.api.a.d RobotCleanActivity_$a.g(int)>
	//    7   16:checkcast       #113 <Class RobotCleanActivity_$a>
	//    8   19:invokevirtual   #119 <Method org.androidannotations.api.a.e com.irobot.home.RobotCleanActivity_$a.a()>
	//    9   22:pop             
			finish();
	//   10   23:aload_0         
	//   11   24:invokevirtual   #122 <Method void finish()>
			return;
	//   12   27:return          
		} else
		{
			e.l().b(((Object) (Boolean.valueOf(true))));
	//   13   28:aload_0         
	//   14   29:getfield        #124 <Field k e>
	//   15   32:invokevirtual   #130 <Method d k.l()>
	//   16   35:iconst_1        
	//   17   36:invokestatic    #136 <Method Boolean Boolean.valueOf(boolean)>
	//   18   39:invokevirtual   #141 <Method void d.b(Object)>
			com.irobot.home.FloorPlanActivity_.a(((android.content.Context) (this))).a(j.k().getId()).a();
	//   19   42:aload_0         
	//   20   43:invokestatic    #146 <Method FloorPlanActivity_$a com.irobot.home.FloorPlanActivity_.a(android.content.Context)>
	//   21   46:invokestatic    #150 <Method AssetId j.k()>
	//   22   49:invokevirtual   #155 <Method String AssetId.getId()>
	//   23   52:invokevirtual   #160 <Method FloorPlanActivity_$a com.irobot.home.FloorPlanActivity_$a.a(String)>
	//   24   55:invokevirtual   #161 <Method org.androidannotations.api.a.e com.irobot.home.FloorPlanActivity_$a.a()>
	//   25   58:pop             
			return;
	//   26   59:return          
		}
	}

	public void g()
	{
		finish();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #122 <Method void finish()>
	//    2    4:return          
	}

	ViewPager a;
	TabLayout b;
	CustomButton c;
	CustomTextView d;
	k e;
	LinearLayout f;
	boolean g;
	private String h;
	private int i;
}
