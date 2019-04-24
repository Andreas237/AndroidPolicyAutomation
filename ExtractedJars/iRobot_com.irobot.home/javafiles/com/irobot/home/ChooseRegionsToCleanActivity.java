// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.content.res.Resources;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.widget.ProgressBar;
import com.irobot.core.*;
import com.irobot.home.fragments.o;
import com.irobot.home.fragments.p;
import com.irobot.home.model.a;
import com.irobot.home.util.j;
import com.irobot.home.view.CustomButton;
import java.util.ArrayList;

// Referenced classes of package com.irobot.home:
//			BaseFragmentActivity, RobotCleanActivity_

public class ChooseRegionsToCleanActivity extends BaseFragmentActivity
	implements com.irobot.home.fragments.o.b
{

	public ChooseRegionsToCleanActivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void BaseFragmentActivity()>
		a = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #26  <Field boolean a>
	//    5    9:return          
	}

	public void a(ArrayList arraylist)
	{
		c.setVisibility(4);
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field ProgressBar c>
	//    2    4:iconst_4        
	//    3    5:invokevirtual   #35  <Method void ProgressBar.setVisibility(int)>
	//    4    8:return          
	}

	public void a(ArrayList arraylist, FloorPlanListItem floorplanlistitem)
	{
		f();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #41  <Method void f()>
	//    2    4:return          
	}

	public void e()
	{
		c.setVisibility(0);
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field ProgressBar c>
	//    2    4:iconst_0        
	//    3    5:invokevirtual   #35  <Method void ProgressBar.setVisibility(int)>
		b(0x7f0f01b1);
	//    4    8:aload_0         
	//    5    9:ldc1            #43  <Int 0x7f0f01b1>
	//    6   11:invokevirtual   #45  <Method void b(int)>
		e = p.k().b(true).a();
	//    7   14:aload_0         
	//    8   15:invokestatic    #51  <Method com.irobot.home.fragments.p$a p.k()>
	//    9   18:iconst_1        
	//   10   19:invokevirtual   #56  <Method com.irobot.home.fragments.p$a com.irobot.home.fragments.p$a.b(boolean)>
	//   11   22:invokevirtual   #59  <Method o com.irobot.home.fragments.p$a.a()>
	//   12   25:putfield        #61  <Field o e>
		e.a(((com.irobot.home.fragments.o.b) (this)));
	//   13   28:aload_0         
	//   14   29:getfield        #61  <Field o e>
	//   15   32:aload_0         
	//   16   33:invokevirtual   #66  <Method void o.a(com.irobot.home.fragments.o$b)>
		getSupportFragmentManager().beginTransaction().add(0x7f0900c4, ((android.support.v4.app.Fragment) (e))).commit();
	//   17   36:aload_0         
	//   18   37:invokevirtual   #70  <Method FragmentManager getSupportFragmentManager()>
	//   19   40:invokevirtual   #76  <Method FragmentTransaction FragmentManager.beginTransaction()>
	//   20   43:ldc1            #77  <Int 0x7f0900c4>
	//   21   45:aload_0         
	//   22   46:getfield        #61  <Field o e>
	//   23   49:invokevirtual   #83  <Method FragmentTransaction FragmentTransaction.add(int, android.support.v4.app.Fragment)>
	//   24   52:invokevirtual   #87  <Method int FragmentTransaction.commit()>
	//   25   55:pop             
		AnalyticsSubsystem.getInstance().trackViewForAsset(ViewId.PMapsChooseRooms, j.j().a());
	//   26   56:invokestatic    #93  <Method AnalyticsSubsystem AnalyticsSubsystem.getInstance()>
	//   27   59:getstatic       #99  <Field ViewId ViewId.PMapsChooseRooms>
	//   28   62:invokestatic    #105 <Method a j.j()>
	//   29   65:invokevirtual   #110 <Method com.irobot.core.AssetInfo a.a()>
	//   30   68:invokevirtual   #114 <Method void AnalyticsSubsystem.trackViewForAsset(ViewId, com.irobot.core.AssetInfo)>
	//   31   71:return          
	}

	protected void f()
	{
		b.setEnabled(false);
	//    0    0:aload_0         
	//    1    1:getfield        #116 <Field CustomButton b>
	//    2    4:iconst_0        
	//    3    5:invokevirtual   #122 <Method void CustomButton.setEnabled(boolean)>
		b.setText(((CharSequence) (getString(0x7f0f0739, new Object[] {
			""
		}))));
	//    4    8:aload_0         
	//    5    9:getfield        #116 <Field CustomButton b>
	//    6   12:aload_0         
	//    7   13:ldc1            #123 <Int 0x7f0f0739>
	//    8   15:iconst_1        
	//    9   16:anewarray       Object[]
	//   10   19:dup             
	//   11   20:iconst_0        
	//   12   21:ldc1            #127 <String "">
	//   13   23:aastore         
	//   14   24:invokevirtual   #131 <Method String getString(int, Object[])>
	//   15   27:invokevirtual   #135 <Method void CustomButton.setText(CharSequence)>
		b.setTextColor(getResources().getColor(0x7f06006d));
	//   16   30:aload_0         
	//   17   31:getfield        #116 <Field CustomButton b>
	//   18   34:aload_0         
	//   19   35:invokevirtual   #139 <Method Resources getResources()>
	//   20   38:ldc1            #140 <Int 0x7f06006d>
	//   21   40:invokevirtual   #146 <Method int Resources.getColor(int)>
	//   22   43:invokevirtual   #149 <Method void CustomButton.setTextColor(int)>
		int l = e.i();
	//   23   46:aload_0         
	//   24   47:getfield        #61  <Field o e>
	//   25   50:invokevirtual   #152 <Method int o.i()>
	//   26   53:istore_2        
		if(l > 0)
	//*  27   54:iload_2         
	//*  28   55:ifle            142
		{
			b.setEnabled(true);
	//   29   58:aload_0         
	//   30   59:getfield        #116 <Field CustomButton b>
	//   31   62:iconst_1        
	//   32   63:invokevirtual   #122 <Method void CustomButton.setEnabled(boolean)>
			b.setTextColor(getResources().getColor(0x7f060076));
	//   33   66:aload_0         
	//   34   67:getfield        #116 <Field CustomButton b>
	//   35   70:aload_0         
	//   36   71:invokevirtual   #139 <Method Resources getResources()>
	//   37   74:ldc1            #153 <Int 0x7f060076>
	//   38   76:invokevirtual   #146 <Method int Resources.getColor(int)>
	//   39   79:invokevirtual   #149 <Method void CustomButton.setTextColor(int)>
			CustomButton custombutton = b;
	//   40   82:aload_0         
	//   41   83:getfield        #116 <Field CustomButton b>
	//   42   86:astore          4
			int k;
			Object obj;
			if(l == 1)
	//*  43   88:iload_2         
	//*  44   89:iconst_1        
	//*  45   90:icmpne          118
			{
				k = 0x7f0f073a;
	//   46   93:ldc1            #154 <Int 0x7f0f073a>
	//   47   95:istore_1        
				obj = ((Object) (new Object[1]));
	//   48   96:iconst_1        
	//   49   97:anewarray       Object[]
	//   50  100:astore_3        
				obj[0] = ((Object) (Integer.toString(l)));
	//   51  101:aload_3         
	//   52  102:iconst_0        
	//   53  103:iload_2         
	//   54  104:invokestatic    #160 <Method String Integer.toString(int)>
	//   55  107:aastore         
			} else
	//*  56  108:aload_0         
	//*  57  109:iload_1         
	//*  58  110:aload_3         
	//*  59  111:invokevirtual   #131 <Method String getString(int, Object[])>
	//*  60  114:astore_3        
	//*  61  115:goto            136
			{
				k = 0x7f0f073c;
	//   62  118:ldc1            #161 <Int 0x7f0f073c>
	//   63  120:istore_1        
				obj = ((Object) (new Object[1]));
	//   64  121:iconst_1        
	//   65  122:anewarray       Object[]
	//   66  125:astore_3        
				obj[0] = ((/*<invalid signature>*/java.lang.Object) (Integer.valueOf(l)));
	//   67  126:aload_3         
	//   68  127:iconst_0        
	//   69  128:iload_2         
	//   70  129:invokestatic    #165 <Method Integer Integer.valueOf(int)>
	//   71  132:aastore         
			}
			obj = ((Object) (getString(k, ((Object []) (obj)))));
	//*  72  133:goto            108
			custombutton.setText(((CharSequence) (obj)));
	//   73  136:aload           4
	//   74  138:aload_3         
	//   75  139:invokevirtual   #135 <Method void CustomButton.setText(CharSequence)>
		}
	//   76  142:return          
	}

	void g()
	{
		e.c();
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field o e>
	//    2    4:invokevirtual   #168 <Method void o.c()>
		j.a(((android.app.Activity) (this)));
	//    3    7:aload_0         
	//    4    8:invokestatic    #171 <Method void j.a(android.app.Activity)>
	//    5   11:return          
	}

	public void h()
	{
	//    0    0:return          
	}

	public void i()
	{
		c.setVisibility(0);
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field ProgressBar c>
	//    2    4:iconst_0        
	//    3    5:invokevirtual   #35  <Method void ProgressBar.setVisibility(int)>
	//    4    8:return          
	}

	public void onBackPressed()
	{
		if(a)
	//*   0    0:aload_0         
	//*   1    1:getfield        #26  <Field boolean a>
	//*   2    4:ifeq            23
			((RobotCleanActivity_.a)com.irobot.home.RobotCleanActivity_.a(((android.content.Context) (this))).g(0x4000000)).a();
	//    3    7:aload_0         
	//    4    8:invokestatic    #178 <Method RobotCleanActivity_$a com.irobot.home.RobotCleanActivity_.a(android.content.Context)>
	//    5   11:ldc1            #179 <Int 0x4000000>
	//    6   13:invokevirtual   #184 <Method org.androidannotations.api.a.d RobotCleanActivity_$a.g(int)>
	//    7   16:checkcast       #181 <Class RobotCleanActivity_$a>
	//    8   19:invokevirtual   #187 <Method org.androidannotations.api.a.e com.irobot.home.RobotCleanActivity_$a.a()>
	//    9   22:pop             
		super.onBackPressed();
	//   10   23:aload_0         
	//   11   24:invokespecial   #189 <Method void BaseFragmentActivity.onBackPressed()>
	//   12   27:return          
	}

	private static final String d = "ChooseRegionsToCleanActivity";
	boolean a;
	CustomButton b;
	ProgressBar c;
	private o e;

	static 
	{
	//    0    0:return          
	}
}
