// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.fragments;

import android.app.Activity;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import com.irobot.core.*;
import com.irobot.home.*;
import com.irobot.home.b.ae;
import com.irobot.home.g.f;
import com.irobot.home.g.g;
import com.irobot.home.model.IRobotModel;
import com.irobot.home.model.a;
import com.irobot.home.model.rest.HelpInfo;
import com.irobot.home.model.rest.SocialInfoList;
import com.irobot.home.rest.CustomerCareRestClient;
import com.irobot.home.util.j;
import com.irobot.home.util.o;
import com.irobot.home.view.CustomButton;
import java.util.Locale;

// Referenced classes of package com.irobot.home.fragments:
//			h

public class ag extends h
	implements android.widget.AdapterView.OnItemClickListener
{
	public static interface a
	{

		public abstract void c(String s);

		public abstract void y();
	}


	public ag()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #39  <Method void h()>
		f = 0;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #41  <Field int f>
	//    5    9:return          
	}

	static a a(ag ag1)
	{
		return ag1.e;
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field ag$a e>
	//    2    4:areturn         
	}

	private void e()
	{
		AccountService accountservice = Assembler.getInstance().getAccountService();
	//    0    0:invokestatic    #51  <Method Assembler Assembler.getInstance()>
	//    1    3:invokevirtual   #55  <Method AccountService Assembler.getAccountService()>
	//    2    6:astore_2        
		if(accountservice.isEligibleForBetaProgram())
	//*   3    7:aload_2         
	//*   4    8:invokevirtual   #61  <Method boolean AccountService.isEligibleForBetaProgram()>
	//*   5   11:ifeq            53
		{
			View view = g.findViewById(0x7f090069).findViewById(0x7f090073);
	//    6   14:aload_0         
	//    7   15:getfield        #63  <Field View g>
	//    8   18:ldc1            #64  <Int 0x7f090069>
	//    9   20:invokevirtual   #70  <Method View View.findViewById(int)>
	//   10   23:ldc1            #71  <Int 0x7f090073>
	//   11   25:invokevirtual   #70  <Method View View.findViewById(int)>
	//   12   28:astore_3        
			byte byte0;
			if(accountservice.getValueForAccountFlag(AccountFlagType.BetaViewed))
	//*  13   29:aload_2         
	//*  14   30:getstatic       #77  <Field AccountFlagType AccountFlagType.BetaViewed>
	//*  15   33:invokevirtual   #81  <Method boolean AccountService.getValueForAccountFlag(AccountFlagType)>
	//*  16   36:ifeq            48
				byte0 = 8;
	//   17   39:bipush          8
	//   18   41:istore_1        
			else
	//*  19   42:aload_3         
	//*  20   43:iload_1         
	//*  21   44:invokevirtual   #85  <Method void View.setVisibility(int)>
	//*  22   47:return          
				byte0 = 0;
	//   23   48:iconst_0        
	//   24   49:istore_1        
			view.setVisibility(((int) (byte0)));
			return;
		} else
	//*  25   50:goto            42
		{
			return;
	//   26   53:return          
		}
	}

	public void a()
	{
		d.notifyDataSetChanged();
	//    0    0:aload_0         
	//    1    1:getfield        #87  <Field ae d>
	//    2    4:invokevirtual   #92  <Method void ae.notifyDataSetChanged()>
	//    3    7:return          
	}

	public void a(a a1)
	{
		e = a1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #45  <Field ag$a e>
	//    3    5:return          
	}

	public void a(IRobotModel irobotmodel)
	{
		if(d == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #87  <Field ae d>
	//*   2    4:ifnonnull       30
		{
			d = new ae(((android.content.Context) (getActivity())), b.h());
	//    3    7:aload_0         
	//    4    8:new             #89  <Class ae>
	//    5   11:dup             
	//    6   12:aload_0         
	//    7   13:invokevirtual   #98  <Method Activity getActivity()>
	//    8   16:aload_0         
	//    9   17:getfield        #100 <Field IRobotApplication b>
	//   10   20:invokevirtual   #106 <Method IRobotModel IRobotApplication.h()>
	//   11   23:invokespecial   #109 <Method void ae(android.content.Context, IRobotModel)>
	//   12   26:putfield        #87  <Field ae d>
			return;
	//   13   29:return          
		}
		int i = irobotmodel.b();
	//   14   30:aload_1         
	//   15   31:invokevirtual   #114 <Method int IRobotModel.b()>
	//   16   34:istore_2        
		if(f != i)
	//*  17   35:aload_0         
	//*  18   36:getfield        #41  <Field int f>
	//*  19   39:iload_2         
	//*  20   40:icmpeq          60
		{
			d.a(irobotmodel);
	//   21   43:aload_0         
	//   22   44:getfield        #87  <Field ae d>
	//   23   47:aload_1         
	//   24   48:invokevirtual   #116 <Method void ae.a(IRobotModel)>
			a();
	//   25   51:aload_0         
	//   26   52:invokevirtual   #118 <Method void a()>
			f = i;
	//   27   55:aload_0         
	//   28   56:iload_2         
	//   29   57:putfield        #41  <Field int f>
		}
	//   30   60:return          
	}

	public void a(String s)
	{
		View view;
		if(getView() == null)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #123 <Method View getView()>
	//*   2    4:ifnonnull       12
			view = null;
	//    3    7:aconst_null     
	//    4    8:astore_2        
		else
	//*   5    9:goto            22
			view = getView().findViewById(0x7f0901ce);
	//    6   12:aload_0         
	//    7   13:invokevirtual   #123 <Method View getView()>
	//    8   16:ldc1            #124 <Int 0x7f0901ce>
	//    9   18:invokevirtual   #70  <Method View View.findViewById(int)>
	//   10   21:astore_2        
		if(view == null)
	//*  11   22:aload_2         
	//*  12   23:ifnonnull       27
			return;
	//   13   26:return          
		if(s != null && !TextUtils.isEmpty(((CharSequence) (s))))
	//*  14   27:aload_1         
	//*  15   28:ifnull          60
	//*  16   31:aload_1         
	//*  17   32:invokestatic    #130 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  18   35:ifeq            41
	//*  19   38:goto            60
		{
			view.setVisibility(0);
	//   20   41:aload_2         
	//   21   42:iconst_0        
	//   22   43:invokevirtual   #85  <Method void View.setVisibility(int)>
			view.setOnClickListener(new android.view.View.OnClickListener(s) {

				public void onClick(View view1)
				{
					j.a(b.getActivity(), a);
				//    0    0:aload_0         
				//    1    1:getfield        #18  <Field ag b>
				//    2    4:invokevirtual   #30  <Method Activity ag.getActivity()>
				//    3    7:aload_0         
				//    4    8:getfield        #20  <Field String a>
				//    5   11:invokestatic    #35  <Method void j.a(Activity, String)>
					AnalyticsSubsystem.getInstance().trackStoreView();
				//    6   14:invokestatic    #41  <Method AnalyticsSubsystem AnalyticsSubsystem.getInstance()>
				//    7   17:invokevirtual   #44  <Method void AnalyticsSubsystem.trackStoreView()>
				//    8   20:return          
				}

				final String a;
				final ag b;

			
			{
				b = ag.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field ag b>
				a = s;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #20  <Field String a>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #23  <Method void Object()>
			//    8   14:return          
			}
			}
);
	//   23   46:aload_2         
	//   24   47:new             #8   <Class ag$1>
	//   25   50:dup             
	//   26   51:aload_0         
	//   27   52:aload_1         
	//   28   53:invokespecial   #133 <Method void ag$1(ag, String)>
	//   29   56:invokevirtual   #137 <Method void View.setOnClickListener(android.view.View$OnClickListener)>
			return;
	//   30   59:return          
		} else
		{
			view.setVisibility(8);
	//   31   60:aload_2         
	//   32   61:bipush          8
	//   33   63:invokevirtual   #85  <Method void View.setVisibility(int)>
			return;
	//   34   66:return          
		}
	}

	public void a(boolean flag)
	{
		d.a(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #87  <Field ae d>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #140 <Method void ae.a(boolean)>
	//    4    8:return          
	}

	public void b()
	{
		if(d == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #87  <Field ae d>
	//*   2    4:ifnonnull       29
			d = new ae(((android.content.Context) (getActivity())), b.h());
	//    3    7:aload_0         
	//    4    8:new             #89  <Class ae>
	//    5   11:dup             
	//    6   12:aload_0         
	//    7   13:invokevirtual   #98  <Method Activity getActivity()>
	//    8   16:aload_0         
	//    9   17:getfield        #100 <Field IRobotApplication b>
	//   10   20:invokevirtual   #106 <Method IRobotModel IRobotApplication.h()>
	//   11   23:invokespecial   #109 <Method void ae(android.content.Context, IRobotModel)>
	//   12   26:putfield        #87  <Field ae d>
		Object obj = ((Object) ((LayoutInflater)getActivity().getSystemService("layout_inflater")));
	//   13   29:aload_0         
	//   14   30:invokevirtual   #98  <Method Activity getActivity()>
	//   15   33:ldc1            #142 <String "layout_inflater">
	//   16   35:invokevirtual   #148 <Method Object Activity.getSystemService(String)>
	//   17   38:checkcast       #150 <Class LayoutInflater>
	//   18   41:astore_3        
		View view = ((LayoutInflater) (obj)).inflate(0x7f0b0104, ((android.view.ViewGroup) (getListView())), false);
	//   19   42:aload_3         
	//   20   43:ldc1            #151 <Int 0x7f0b0104>
	//   21   45:aload_0         
	//   22   46:invokevirtual   #155 <Method ListView getListView()>
	//   23   49:iconst_0        
	//   24   50:invokevirtual   #159 <Method View LayoutInflater.inflate(int, android.view.ViewGroup, boolean)>
	//   25   53:astore_2        
		g = ((LayoutInflater) (obj)).inflate(0x7f0b0103, ((android.view.ViewGroup) (getListView())), false);
	//   26   54:aload_0         
	//   27   55:aload_3         
	//   28   56:ldc1            #160 <Int 0x7f0b0103>
	//   29   58:aload_0         
	//   30   59:invokevirtual   #155 <Method ListView getListView()>
	//   31   62:iconst_0        
	//   32   63:invokevirtual   #159 <Method View LayoutInflater.inflate(int, android.view.ViewGroup, boolean)>
	//   33   66:putfield        #63  <Field View g>
		obj = ((Object) (g.findViewById(0x7f09003c)));
	//   34   69:aload_0         
	//   35   70:getfield        #63  <Field View g>
	//   36   73:ldc1            #161 <Int 0x7f09003c>
	//   37   75:invokevirtual   #70  <Method View View.findViewById(int)>
	//   38   78:astore_3        
		View view1 = g.findViewById(0x7f090110);
	//   39   79:aload_0         
	//   40   80:getfield        #63  <Field View g>
	//   41   83:ldc1            #162 <Int 0x7f090110>
	//   42   85:invokevirtual   #70  <Method View View.findViewById(int)>
	//   43   88:astore          4
		byte byte0;
		if(j.C())
	//*  44   90:invokestatic    #167 <Method boolean j.C()>
	//*  45   93:ifeq            102
			byte0 = 8;
	//   46   96:bipush          8
	//   47   98:istore_1        
		else
	//*  48   99:goto            104
			byte0 = 0;
	//   49  102:iconst_0        
	//   50  103:istore_1        
		view1.setVisibility(((int) (byte0)));
	//   51  104:aload           4
	//   52  106:iload_1         
	//   53  107:invokevirtual   #85  <Method void View.setVisibility(int)>
		((View) (obj)).setVisibility(((int) (byte0)));
	//   54  110:aload_3         
	//   55  111:iload_1         
	//   56  112:invokevirtual   #85  <Method void View.setVisibility(int)>
		((View) (obj)).setOnClickListener(new android.view.View.OnClickListener() {

			public void onClick(View view2)
			{
				if(a.b.h().b() < 10)
			//*   0    0:aload_0         
			//*   1    1:getfield        #17  <Field ag a>
			//*   2    4:getfield        #25  <Field IRobotApplication ag.b>
			//*   3    7:invokevirtual   #31  <Method IRobotModel IRobotApplication.h()>
			//*   4   10:invokevirtual   #36  <Method int IRobotModel.b()>
			//*   5   13:bipush          10
			//*   6   15:icmpge          45
				{
					com.irobot.home.fragments.ag.a(a).y();
			//    7   18:aload_0         
			//    8   19:getfield        #17  <Field ag a>
			//    9   22:invokestatic    #39  <Method ag$a com.irobot.home.fragments.ag.a(ag)>
			//   10   25:invokeinterface #44  <Method void ag$a.y()>
					SelectRobotTypeActivity_.a(((android.content.Context) (a.getActivity()))).a();
			//   11   30:aload_0         
			//   12   31:getfield        #17  <Field ag a>
			//   13   34:invokevirtual   #48  <Method Activity ag.getActivity()>
			//   14   37:invokestatic    #53  <Method com.irobot.home.SelectRobotTypeActivity_$a SelectRobotTypeActivity_.a(android.content.Context)>
			//   15   40:invokevirtual   #58  <Method org.androidannotations.api.a.e com.irobot.home.SelectRobotTypeActivity_$a.a()>
			//   16   43:pop             
					return;
			//   17   44:return          
				} else
				{
					com.irobot.home.g.g.c().a().show(a.getFragmentManager(), ((String) (null)));
			//   18   45:invokestatic    #64  <Method com.irobot.home.g.g$a g.c()>
			//   19   48:invokevirtual   #69  <Method f com.irobot.home.g.g$a.a()>
			//   20   51:aload_0         
			//   21   52:getfield        #17  <Field ag a>
			//   22   55:invokevirtual   #73  <Method android.app.FragmentManager ag.getFragmentManager()>
			//   23   58:aconst_null     
			//   24   59:invokevirtual   #79  <Method void f.show(android.app.FragmentManager, String)>
					return;
			//   25   62:return          
				}
			}

			final ag a;

			
			{
				a = ag.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field ag a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//   57  115:aload_3         
	//   58  116:new             #12  <Class ag$3>
	//   59  119:dup             
	//   60  120:aload_0         
	//   61  121:invokespecial   #170 <Method void ag$3(ag)>
	//   62  124:invokevirtual   #137 <Method void View.setOnClickListener(android.view.View$OnClickListener)>
		g.findViewById(0x7f090006).setOnClickListener(new android.view.View.OnClickListener() {

			public void onClick(View view2)
			{
				AboutAppTableViewActivity_.a(((android.content.Context) (a.getActivity()))).a(j.j().a().getSku()).a();
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field ag a>
			//    2    4:invokevirtual   #26  <Method Activity ag.getActivity()>
			//    3    7:invokestatic    #31  <Method com.irobot.home.AboutAppTableViewActivity_$a AboutAppTableViewActivity_.a(android.content.Context)>
			//    4   10:invokestatic    #37  <Method a j.j()>
			//    5   13:invokevirtual   #42  <Method AssetInfo a.a()>
			//    6   16:invokevirtual   #48  <Method String AssetInfo.getSku()>
			//    7   19:invokevirtual   #53  <Method com.irobot.home.AboutAppTableViewActivity_$a com.irobot.home.AboutAppTableViewActivity_$a.a(String)>
			//    8   22:invokevirtual   #56  <Method org.androidannotations.api.a.e com.irobot.home.AboutAppTableViewActivity_$a.a()>
			//    9   25:pop             
			//   10   26:return          
			}

			final ag a;

			
			{
				a = ag.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field ag a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//   63  127:aload_0         
	//   64  128:getfield        #63  <Field View g>
	//   65  131:ldc1            #171 <Int 0x7f090006>
	//   66  133:invokevirtual   #70  <Method View View.findViewById(int)>
	//   67  136:new             #14  <Class ag$4>
	//   68  139:dup             
	//   69  140:aload_0         
	//   70  141:invokespecial   #172 <Method void ag$4(ag)>
	//   71  144:invokevirtual   #137 <Method void View.setOnClickListener(android.view.View$OnClickListener)>
		obj = ((Object) (Assembler.getInstance().getAccountService()));
	//   72  147:invokestatic    #51  <Method Assembler Assembler.getInstance()>
	//   73  150:invokevirtual   #55  <Method AccountService Assembler.getAccountService()>
	//   74  153:astore_3        
		view1 = g.findViewById(0x7f0900a0);
	//   75  154:aload_0         
	//   76  155:getfield        #63  <Field View g>
	//   77  158:ldc1            #173 <Int 0x7f0900a0>
	//   78  160:invokevirtual   #70  <Method View View.findViewById(int)>
	//   79  163:astore          4
		if(((AccountService) (obj)).isFeatureEnabled(FeatureType.FeedbackReport))
	//*  80  165:aload_3         
	//*  81  166:getstatic       #179 <Field FeatureType FeatureType.FeedbackReport>
	//*  82  169:invokevirtual   #183 <Method boolean AccountService.isFeatureEnabled(FeatureType)>
	//*  83  172:ifeq            207
		{
			g.findViewById(0x7f0900a1).setVisibility(0);
	//   84  175:aload_0         
	//   85  176:getfield        #63  <Field View g>
	//   86  179:ldc1            #184 <Int 0x7f0900a1>
	//   87  181:invokevirtual   #70  <Method View View.findViewById(int)>
	//   88  184:iconst_0        
	//   89  185:invokevirtual   #85  <Method void View.setVisibility(int)>
			view1.setVisibility(0);
	//   90  188:aload           4
	//   91  190:iconst_0        
	//   92  191:invokevirtual   #85  <Method void View.setVisibility(int)>
			view1.setOnClickListener(new android.view.View.OnClickListener() {

				public void onClick(View view2)
				{
					BugReportActivity_.a(((android.content.Context) (a.getActivity()))).a(j.j().a().getAssetId().getId()).a();
				//    0    0:aload_0         
				//    1    1:getfield        #17  <Field ag a>
				//    2    4:invokevirtual   #26  <Method Activity ag.getActivity()>
				//    3    7:invokestatic    #31  <Method com.irobot.home.BugReportActivity_$a BugReportActivity_.a(android.content.Context)>
				//    4   10:invokestatic    #37  <Method a j.j()>
				//    5   13:invokevirtual   #42  <Method AssetInfo a.a()>
				//    6   16:invokevirtual   #48  <Method AssetId AssetInfo.getAssetId()>
				//    7   19:invokevirtual   #54  <Method String AssetId.getId()>
				//    8   22:invokevirtual   #59  <Method com.irobot.home.BugReportActivity_$a com.irobot.home.BugReportActivity_$a.a(String)>
				//    9   25:invokevirtual   #62  <Method org.androidannotations.api.a.e com.irobot.home.BugReportActivity_$a.a()>
				//   10   28:pop             
				//   11   29:return          
				}

				final ag a;

			
			{
				a = ag.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field ag a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//   93  194:aload           4
	//   94  196:new             #16  <Class ag$5>
	//   95  199:dup             
	//   96  200:aload_0         
	//   97  201:invokespecial   #185 <Method void ag$5(ag)>
	//   98  204:invokevirtual   #137 <Method void View.setOnClickListener(android.view.View$OnClickListener)>
		}
		view1 = g.findViewById(0x7f090069);
	//   99  207:aload_0         
	//  100  208:getfield        #63  <Field View g>
	//  101  211:ldc1            #64  <Int 0x7f090069>
	//  102  213:invokevirtual   #70  <Method View View.findViewById(int)>
	//  103  216:astore          4
		if(((AccountService) (obj)).isEligibleForBetaProgram())
	//* 104  218:aload_3         
	//* 105  219:invokevirtual   #61  <Method boolean AccountService.isEligibleForBetaProgram()>
	//* 106  222:ifeq            241
		{
			view1.setOnClickListener(new android.view.View.OnClickListener() {

				public void onClick(View view2)
				{
					if(Assembler.getInstance().getAccountService().isFeatureEnabled(FeatureType.BetaProgram))
				//*   0    0:invokestatic    #28  <Method Assembler Assembler.getInstance()>
				//*   1    3:invokevirtual   #32  <Method AccountService Assembler.getAccountService()>
				//*   2    6:getstatic       #38  <Field FeatureType FeatureType.BetaProgram>
				//*   3    9:invokevirtual   #44  <Method boolean AccountService.isFeatureEnabled(FeatureType)>
				//*   4   12:ifeq            30
					{
						BetaFeaturesActivity_.a(((android.content.Context) (a.getActivity()))).a();
				//    5   15:aload_0         
				//    6   16:getfield        #17  <Field ag a>
				//    7   19:invokevirtual   #48  <Method Activity ag.getActivity()>
				//    8   22:invokestatic    #53  <Method com.irobot.home.BetaFeaturesActivity_$a BetaFeaturesActivity_.a(android.content.Context)>
				//    9   25:invokevirtual   #58  <Method org.androidannotations.api.a.e com.irobot.home.BetaFeaturesActivity_$a.a()>
				//   10   28:pop             
						return;
				//   11   29:return          
					} else
					{
						BetaIntroductionActivity_.a(((android.content.Context) (a.getActivity()))).a();
				//   12   30:aload_0         
				//   13   31:getfield        #17  <Field ag a>
				//   14   34:invokevirtual   #48  <Method Activity ag.getActivity()>
				//   15   37:invokestatic    #63  <Method com.irobot.home.BetaIntroductionActivity_$a BetaIntroductionActivity_.a(android.content.Context)>
				//   16   40:invokevirtual   #66  <Method org.androidannotations.api.a.e com.irobot.home.BetaIntroductionActivity_$a.a()>
				//   17   43:pop             
						return;
				//   18   44:return          
					}
				}

				final ag a;

			
			{
				a = ag.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field ag a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//  107  225:aload           4
	//  108  227:new             #18  <Class ag$6>
	//  109  230:dup             
	//  110  231:aload_0         
	//  111  232:invokespecial   #186 <Method void ag$6(ag)>
	//  112  235:invokevirtual   #137 <Method void View.setOnClickListener(android.view.View$OnClickListener)>
		} else
	//* 113  238:goto            262
		{
			view1.setVisibility(8);
	//  114  241:aload           4
	//  115  243:bipush          8
	//  116  245:invokevirtual   #85  <Method void View.setVisibility(int)>
			g.findViewById(0x7f09006e).setVisibility(8);
	//  117  248:aload_0         
	//  118  249:getfield        #63  <Field View g>
	//  119  252:ldc1            #187 <Int 0x7f09006e>
	//  120  254:invokevirtual   #70  <Method View View.findViewById(int)>
	//  121  257:bipush          8
	//  122  259:invokevirtual   #85  <Method void View.setVisibility(int)>
		}
		e();
	//  123  262:aload_0         
	//  124  263:invokespecial   #189 <Method void e()>
		obj = ((Object) ((CustomButton)g.findViewById(0x7f090018)));
	//  125  266:aload_0         
	//  126  267:getfield        #63  <Field View g>
	//  127  270:ldc1            #190 <Int 0x7f090018>
	//  128  272:invokevirtual   #70  <Method View View.findViewById(int)>
	//  129  275:checkcast       #192 <Class CustomButton>
	//  130  278:astore_3        
		((CustomButton) (obj)).setText(0x7f0f004f);
	//  131  279:aload_3         
	//  132  280:ldc1            #193 <Int 0x7f0f004f>
	//  133  282:invokevirtual   #196 <Method void CustomButton.setText(int)>
		((CustomButton) (obj)).setOnClickListener(new android.view.View.OnClickListener() {

			public void onClick(View view2)
			{
				AccountOverviewActivity_.a(((android.content.Context) (a.getActivity()))).a();
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field ag a>
			//    2    4:invokevirtual   #26  <Method Activity ag.getActivity()>
			//    3    7:invokestatic    #31  <Method com.irobot.home.AccountOverviewActivity_$a AccountOverviewActivity_.a(android.content.Context)>
			//    4   10:invokevirtual   #36  <Method org.androidannotations.api.a.e com.irobot.home.AccountOverviewActivity_$a.a()>
			//    5   13:pop             
			//    6   14:return          
			}

			final ag a;

			
			{
				a = ag.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field ag a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//  134  285:aload_3         
	//  135  286:new             #20  <Class ag$7>
	//  136  289:dup             
	//  137  290:aload_0         
	//  138  291:invokespecial   #197 <Method void ag$7(ag)>
	//  139  294:invokevirtual   #198 <Method void CustomButton.setOnClickListener(android.view.View$OnClickListener)>
		setListAdapter(((android.widget.ListAdapter) (d)));
	//  140  297:aload_0         
	//  141  298:aload_0         
	//  142  299:getfield        #87  <Field ae d>
	//  143  302:invokevirtual   #202 <Method void setListAdapter(android.widget.ListAdapter)>
		getListView().addHeaderView(view, ((Object) (null)), false);
	//  144  305:aload_0         
	//  145  306:invokevirtual   #155 <Method ListView getListView()>
	//  146  309:aload_2         
	//  147  310:aconst_null     
	//  148  311:iconst_0        
	//  149  312:invokevirtual   #208 <Method void ListView.addHeaderView(View, Object, boolean)>
		getListView().addFooterView(g);
	//  150  315:aload_0         
	//  151  316:invokevirtual   #155 <Method ListView getListView()>
	//  152  319:aload_0         
	//  153  320:getfield        #63  <Field View g>
	//  154  323:invokevirtual   #212 <Method void ListView.addFooterView(View)>
		setListShown(true);
	//  155  326:aload_0         
	//  156  327:iconst_1        
	//  157  328:invokevirtual   #215 <Method void setListShown(boolean)>
		getListView().setOnItemClickListener(((android.widget.AdapterView.OnItemClickListener) (this)));
	//  158  331:aload_0         
	//  159  332:invokevirtual   #155 <Method ListView getListView()>
	//  160  335:aload_0         
	//  161  336:invokevirtual   #219 <Method void ListView.setOnItemClickListener(android.widget.AdapterView$OnItemClickListener)>
		c = j.i(((android.content.Context) (getActivity())));
	//  162  339:aload_0         
	//  163  340:aload_0         
	//  164  341:invokevirtual   #98  <Method Activity getActivity()>
	//  165  344:invokestatic    #223 <Method CustomerCareRestClient j.i(android.content.Context)>
	//  166  347:putfield        #225 <Field CustomerCareRestClient c>
		c();
	//  167  350:aload_0         
	//  168  351:invokevirtual   #227 <Method void c()>
	//  169  354:return          
	}

	public void b(String s)
	{
		g.findViewById(0x7f09010f).setOnClickListener(new android.view.View.OnClickListener(s) {

			public void onClick(View view)
			{
				if(j.i(a))
			//*   0    0:aload_0         
			//*   1    1:getfield        #20  <Field String a>
			//*   2    4:invokestatic    #32  <Method boolean j.i(String)>
			//*   3    7:ifeq            55
				{
					WebViewActivity_.a(((android.content.Context) (b.getActivity()))).a(a).a(Integer.valueOf(0x7f0f0848)).a();
			//    4   10:aload_0         
			//    5   11:getfield        #18  <Field ag b>
			//    6   14:invokevirtual   #36  <Method Activity ag.getActivity()>
			//    7   17:invokestatic    #41  <Method com.irobot.home.WebViewActivity_$a WebViewActivity_.a(android.content.Context)>
			//    8   20:aload_0         
			//    9   21:getfield        #20  <Field String a>
			//   10   24:invokevirtual   #46  <Method com.irobot.home.WebViewActivity_$a com.irobot.home.WebViewActivity_$a.a(String)>
			//   11   27:ldc1            #47  <Int 0x7f0f0848>
			//   12   29:invokestatic    #53  <Method Integer Integer.valueOf(int)>
			//   13   32:invokevirtual   #56  <Method com.irobot.home.WebViewActivity_$a com.irobot.home.WebViewActivity_$a.a(Integer)>
			//   14   35:invokevirtual   #59  <Method org.androidannotations.api.a.e com.irobot.home.WebViewActivity_$a.a()>
			//   15   38:pop             
					AnalyticsSubsystem.getInstance().trackViewForAsset(ViewId.ConnectedHome, j.j().a());
			//   16   39:invokestatic    #65  <Method AnalyticsSubsystem AnalyticsSubsystem.getInstance()>
			//   17   42:getstatic       #71  <Field ViewId ViewId.ConnectedHome>
			//   18   45:invokestatic    #75  <Method a j.j()>
			//   19   48:invokevirtual   #80  <Method AssetInfo a.a()>
			//   20   51:invokevirtual   #84  <Method void AnalyticsSubsystem.trackViewForAsset(ViewId, AssetInfo)>
					return;
			//   21   54:return          
				} else
				{
					(new android.app.AlertDialog.Builder(((android.content.Context) (b.getActivity())))).setMessage(0x7f0f0960).setPositiveButton(0x7f0f05bb, ((android.content.DialogInterface.OnClickListener) (null))).show();
			//   22   55:new             #86  <Class android.app.AlertDialog$Builder>
			//   23   58:dup             
			//   24   59:aload_0         
			//   25   60:getfield        #18  <Field ag b>
			//   26   63:invokevirtual   #36  <Method Activity ag.getActivity()>
			//   27   66:invokespecial   #89  <Method void android.app.AlertDialog$Builder(android.content.Context)>
			//   28   69:ldc1            #90  <Int 0x7f0f0960>
			//   29   71:invokevirtual   #94  <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setMessage(int)>
			//   30   74:ldc1            #95  <Int 0x7f0f05bb>
			//   31   76:aconst_null     
			//   32   77:invokevirtual   #99  <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setPositiveButton(int, android.content.DialogInterface$OnClickListener)>
			//   33   80:invokevirtual   #103 <Method android.app.AlertDialog android.app.AlertDialog$Builder.show()>
			//   34   83:pop             
					return;
			//   35   84:return          
				}
			}

			final String a;
			final ag b;

			
			{
				b = ag.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field ag b>
				a = s;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #20  <Field String a>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #23  <Method void Object()>
			//    8   14:return          
			}
		}
);
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field View g>
	//    2    4:ldc1            #228 <Int 0x7f09010f>
	//    3    6:invokevirtual   #70  <Method View View.findViewById(int)>
	//    4    9:new             #10  <Class ag$2>
	//    5   12:dup             
	//    6   13:aload_0         
	//    7   14:aload_1         
	//    8   15:invokespecial   #229 <Method void ag$2(ag, String)>
	//    9   18:invokevirtual   #137 <Method void View.setOnClickListener(android.view.View$OnClickListener)>
	//   10   21:return          
	}

	public void c()
	{
		boolean flag;
		Object obj2;
		Object obj4;
		Object obj;
label0:
		{
			obj = ((Object) (getActivity()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #98  <Method Activity getActivity()>
	//    2    4:astore_2        
			obj4 = null;
	//    3    5:aconst_null     
	//    4    6:astore          5
			if(obj != null)
	//*   5    8:aload_2         
	//*   6    9:ifnull          37
			{
				obj = ((Object) ((ConnectivityManager)getActivity().getSystemService("connectivity")));
	//    7   12:aload_0         
	//    8   13:invokevirtual   #98  <Method Activity getActivity()>
	//    9   16:ldc1            #233 <String "connectivity">
	//   10   18:invokevirtual   #148 <Method Object Activity.getSystemService(String)>
	//   11   21:checkcast       #235 <Class ConnectivityManager>
	//   12   24:astore_2        
				if(obj != null)
	//*  13   25:aload_2         
	//*  14   26:ifnull          37
				{
					obj = ((Object) (((ConnectivityManager) (obj)).getActiveNetworkInfo()));
	//   15   29:aload_2         
	//   16   30:invokevirtual   #239 <Method NetworkInfo ConnectivityManager.getActiveNetworkInfo()>
	//   17   33:astore_2        
					break label0;
	//   18   34:goto            39
				}
			}
			obj = null;
	//   19   37:aconst_null     
	//   20   38:astore_2        
		}
		flag = Assembler.getInstance().getAccountService().isSmartHomeAvailable();
	//   21   39:invokestatic    #51  <Method Assembler Assembler.getInstance()>
	//   22   42:invokevirtual   #55  <Method AccountService Assembler.getAccountService()>
	//   23   45:invokevirtual   #242 <Method boolean AccountService.isSmartHomeAvailable()>
	//   24   48:istore_1        
		obj2 = ((Object) (Locale.getDefault()));
	//   25   49:invokestatic    #248 <Method Locale Locale.getDefault()>
	//   26   52:astore_3        
		if(obj2 == null || obj == null || !((NetworkInfo) (obj)).isConnected())
			break MISSING_BLOCK_LABEL_195;
	//   27   53:aload_3         
	//   28   54:ifnull          195
	//   29   57:aload_2         
	//   30   58:ifnull          195
	//   31   61:aload_2         
	//   32   62:invokevirtual   #253 <Method boolean NetworkInfo.isConnected()>
	//   33   65:ifeq            195
		Object obj1;
		Object obj3;
		String s1;
		String s2;
		obj3 = ((Object) (j.a(((Locale) (obj2)))));
	//   34   68:aload_3         
	//   35   69:invokestatic    #256 <Method String j.a(Locale)>
	//   36   72:astore          4
		s1 = j.h(getActivity().getBaseContext());
	//   37   74:aload_0         
	//   38   75:invokevirtual   #98  <Method Activity getActivity()>
	//   39   78:invokevirtual   #260 <Method android.content.Context Activity.getBaseContext()>
	//   40   81:invokestatic    #263 <Method String j.h(android.content.Context)>
	//   41   84:astore          6
		s2 = j.j().a().getSku();
	//   42   86:invokestatic    #267 <Method a j.j()>
	//   43   89:invokevirtual   #272 <Method AssetInfo a.a()>
	//   44   92:invokevirtual   #278 <Method String AssetInfo.getSku()>
	//   45   95:astore          7
		obj1 = ((Object) (c.getHelpInfo(((String) (obj3)), s1, s2)));
	//   46   97:aload_0         
	//   47   98:getfield        #225 <Field CustomerCareRestClient c>
	//   48  101:aload           4
	//   49  103:aload           6
	//   50  105:aload           7
	//   51  107:invokeinterface #284 <Method HelpInfo CustomerCareRestClient.getHelpInfo(String, String, String)>
	//   52  112:astore_2        
		obj2 = obj1;
	//   53  113:aload_2         
	//   54  114:astore_3        
		if(!flag)
			break MISSING_BLOCK_LABEL_187;
	//   55  115:iload_1         
	//   56  116:ifeq            187
		try
		{
			obj3 = ((Object) (c.getSocialInfo(((String) (obj3)), s1, s2)));
	//   57  119:aload_0         
	//   58  120:getfield        #225 <Field CustomerCareRestClient c>
	//   59  123:aload           4
	//   60  125:aload           6
	//   61  127:aload           7
	//   62  129:invokeinterface #288 <Method SocialInfoList CustomerCareRestClient.getSocialInfo(String, String, String)>
	//   63  134:astore          4
			break MISSING_BLOCK_LABEL_201;
	//   64  136:goto            201
		}
		// Misplaced declaration of an exception variable
		catch(Object obj2) { }
	//   65  139:astore_3        
		break MISSING_BLOCK_LABEL_146;
	//   66  140:goto            146
		obj2;
	//   67  143:astore_3        
		obj1 = null;
	//   68  144:aconst_null     
	//   69  145:astore_2        
		obj3 = ((Object) (new StringBuilder()));
	//   70  146:new             #290 <Class StringBuilder>
	//   71  149:dup             
	//   72  150:invokespecial   #291 <Method void StringBuilder()>
	//   73  153:astore          4
		((StringBuilder) (obj3)).append("Error in getSiteCoreContent: ");
	//   74  155:aload           4
	//   75  157:ldc2            #293 <String "Error in getSiteCoreContent: ">
	//   76  160:invokevirtual   #297 <Method StringBuilder StringBuilder.append(String)>
	//   77  163:pop             
		((StringBuilder) (obj3)).append(((Exception) (obj2)).getMessage());
	//   78  164:aload           4
	//   79  166:aload_3         
	//   80  167:invokevirtual   #300 <Method String Exception.getMessage()>
	//   81  170:invokevirtual   #297 <Method StringBuilder StringBuilder.append(String)>
	//   82  173:pop             
		o.e("LeftMenuFragment", ((StringBuilder) (obj3)).toString());
	//   83  174:ldc2            #302 <String "LeftMenuFragment">
	//   84  177:aload           4
	//   85  179:invokevirtual   #305 <Method String StringBuilder.toString()>
	//   86  182:invokestatic    #310 <Method void o.e(String, String)>
		obj2 = obj1;
	//   87  185:aload_2         
	//   88  186:astore_3        
		obj3 = null;
	//   89  187:aconst_null     
	//   90  188:astore          4
		obj1 = obj2;
	//   91  190:aload_3         
	//   92  191:astore_2        
		break MISSING_BLOCK_LABEL_201;
	//   93  192:goto            201
		obj3 = null;
	//   94  195:aconst_null     
	//   95  196:astore          4
		obj1 = obj3;
	//   96  198:aload           4
	//   97  200:astore_2        
		if(obj1 == null)
	//*  98  201:aload_2         
	//*  99  202:ifnonnull       210
			obj1 = null;
	//  100  205:aconst_null     
	//  101  206:astore_2        
		else
	//* 102  207:goto            215
			obj1 = ((Object) (((HelpInfo) (obj1)).storeUrl));
	//  103  210:aload_2         
	//  104  211:getfield        #316 <Field String HelpInfo.storeUrl>
	//  105  214:astore_2        
		a(((String) (obj1)));
	//  106  215:aload_0         
	//  107  216:aload_2         
	//  108  217:invokevirtual   #318 <Method void a(String)>
		if(flag)
	//* 109  220:iload_1         
	//* 110  221:ifeq            247
		{
			String s;
			if(obj3 == null)
	//* 111  224:aload           4
	//* 112  226:ifnonnull       235
				s = ((String) (obj4));
	//  113  229:aload           5
	//  114  231:astore_2        
			else
	//* 115  232:goto            241
				s = ((SocialInfoList) (obj3)).connectedHomeUrl;
	//  116  235:aload           4
	//  117  237:getfield        #323 <Field String SocialInfoList.connectedHomeUrl>
	//  118  240:astore_2        
			b(s);
	//  119  241:aload_0         
	//  120  242:aload_2         
	//  121  243:invokevirtual   #325 <Method void b(String)>
			return;
	//  122  246:return          
		} else
		{
			d();
	//  123  247:aload_0         
	//  124  248:invokevirtual   #327 <Method void d()>
			return;
	//  125  251:return          
		}
	}

	public void d()
	{
		g.findViewById(0x7f09010f).setVisibility(8);
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field View g>
	//    2    4:ldc1            #228 <Int 0x7f09010f>
	//    3    6:invokevirtual   #70  <Method View View.findViewById(int)>
	//    4    9:bipush          8
	//    5   11:invokevirtual   #85  <Method void View.setVisibility(int)>
		g.findViewById(0x7f090110).setVisibility(8);
	//    6   14:aload_0         
	//    7   15:getfield        #63  <Field View g>
	//    8   18:ldc1            #162 <Int 0x7f090110>
	//    9   20:invokevirtual   #70  <Method View View.findViewById(int)>
	//   10   23:bipush          8
	//   11   25:invokevirtual   #85  <Method void View.setVisibility(int)>
	//   12   28:return          
	}

	public void onItemClick(AdapterView adapterview, View view, int i, long l)
	{
		if(e != null && i >= 1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #45  <Field ag$a e>
	//*   2    4:ifnull          35
	//*   3    7:iload_3         
	//*   4    8:iconst_1        
	//*   5    9:icmplt          35
		{
			e.c(d.a(i - 1));
	//    6   12:aload_0         
	//    7   13:getfield        #45  <Field ag$a e>
	//    8   16:aload_0         
	//    9   17:getfield        #87  <Field ae d>
	//   10   20:iload_3         
	//   11   21:iconst_1        
	//   12   22:isub            
	//   13   23:invokevirtual   #332 <Method String ae.a(int)>
	//   14   26:invokeinterface #334 <Method void ag$a.c(String)>
			c();
	//   15   31:aload_0         
	//   16   32:invokevirtual   #227 <Method void c()>
		}
	//   17   35:return          
	}

	public void onResume()
	{
		super.onResume();
	//    0    0:aload_0         
	//    1    1:invokespecial   #339 <Method void h.onResume()>
		e();
	//    2    4:aload_0         
	//    3    5:invokespecial   #189 <Method void e()>
	//    4    8:return          
	}

	IRobotApplication b;
	CustomerCareRestClient c;
	private ae d;
	private a e;
	private int f;
	private View g;
}
