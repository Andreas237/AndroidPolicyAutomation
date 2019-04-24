// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.pactforcure.app.ui;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.*;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.*;
import android.widget.ImageView;
import android.widget.TextView;
import com.pactforcure.app.core.message.SurveyCompletedMessage;
import com.pactforcure.app.core.message.SurveyUploadedMessage;
import com.pactforcure.app.databinding.ActivityDashboardBinding;
import com.pactforcure.app.studies.Res;
import com.pactforcure.app.studies.StudyId;
import com.pactforcure.app.survey.*;
import com.pactforcure.app.tip.TipOfTheWeekStorage;
import org.greenrobot.eventbus.EventBus;
import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

// Referenced classes of package com.pactforcure.app.ui:
//			SurveyActivity, SurveyTasksFragment, ResourcesListFragment, SettingsActivity, 
//			OnPpdEndMessage, SuicidalityActivity, PpdResultsActivity, OnSurveyProgressStatusChanged

public class DashboardActivity extends AppCompatActivity
{
	public static class DashboardTabsAdapter extends FragmentPagerAdapter
	{

		public int getCount()
		{
			return 2;
		//    0    0:iconst_2        
		//    1    1:ireturn         
		}

		public Fragment getItem(int i)
		{
			switch(i)
		//*   0    0:iload_1         
			{
		//*   1    1:tableswitch     0 1: default 24
		//		               0 26
		//		               1 34
			default:
				return null;
		//    2   24:aconst_null     
		//    3   25:areturn         

			case 0: // '\0'
				return activity.surveyTasksFragment;
		//    4   26:aload_0         
		//    5   27:getfield        #16  <Field DashboardActivity activity>
		//    6   30:getfield        #25  <Field Fragment DashboardActivity.surveyTasksFragment>
		//    7   33:areturn         

			case 1: // '\001'
				return activity.resourcesFragment;
		//    8   34:aload_0         
		//    9   35:getfield        #16  <Field DashboardActivity activity>
		//   10   38:getfield        #28  <Field Fragment DashboardActivity.resourcesFragment>
		//   11   41:areturn         
			}
		}

		private final DashboardActivity activity;

		public DashboardTabsAdapter(DashboardActivity dashboardactivity, FragmentManager fragmentmanager)
		{
			super(fragmentmanager);
		//    0    0:aload_0         
		//    1    1:aload_2         
		//    2    2:invokespecial   #14  <Method void FragmentPagerAdapter(FragmentManager)>
			activity = dashboardactivity;
		//    3    5:aload_0         
		//    4    6:aload_1         
		//    5    7:putfield        #16  <Field DashboardActivity activity>
		//    6   10:return          
		}
	}


	public DashboardActivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #32  <Method void AppCompatActivity()>
	//    2    4:return          
	}

	static void lambda$onCreate$9(View view, View view1, View view2, View view3)
	{
		boolean flag1 = false;
	//    0    0:iconst_0        
	//    1    1:istore          5
		boolean flag2 = false;
	//    2    3:iconst_0        
	//    3    4:istore          6
		ProgressStatus progressstatus = SurveyStorage.loadSurveyProgress(Res.getStudyId().name(), "PPD");
	//    4    6:invokestatic    #45  <Method StudyId Res.getStudyId()>
	//    5    9:invokevirtual   #51  <Method String StudyId.name()>
	//    6   12:ldc1            #53  <String "PPD">
	//    7   14:invokestatic    #59  <Method ProgressStatus SurveyStorage.loadSurveyProgress(String, String)>
	//    8   17:astore          9
		if(progressstatus == ProgressStatus.Started || progressstatus == ProgressStatus.New)
	//*   9   19:aload           9
	//*  10   21:getstatic       #65  <Field ProgressStatus ProgressStatus.Started>
	//*  11   24:if_acmpeq       35
	//*  12   27:aload           9
	//*  13   29:getstatic       #68  <Field ProgressStatus ProgressStatus.New>
	//*  14   32:if_acmpne       38
			flag1 = true;
	//   15   35:iconst_1        
	//   16   36:istore          5
		boolean flag = flag1;
	//   17   38:iload           5
	//   18   40:istore          4
		if(PpdResultsStorage.getDnaModuleEnabled(Res.getStudyId()))
	//*  19   42:invokestatic    #45  <Method StudyId Res.getStudyId()>
	//*  20   45:invokestatic    #74  <Method boolean PpdResultsStorage.getDnaModuleEnabled(StudyId)>
	//*  21   48:ifeq            75
		{
			boolean flag3 = PpdResultsStorage.hasGivenDnaConsent(Res.getStudyId());
	//   22   51:invokestatic    #45  <Method StudyId Res.getStudyId()>
	//   23   54:invokestatic    #77  <Method boolean PpdResultsStorage.hasGivenDnaConsent(StudyId)>
	//   24   57:istore          7
			boolean flag4 = PpdResultsStorage.hasSentDnaKitBack(Res.getStudyId());
	//   25   59:invokestatic    #45  <Method StudyId Res.getStudyId()>
	//   26   62:invokestatic    #80  <Method boolean PpdResultsStorage.hasSentDnaKitBack(StudyId)>
	//   27   65:istore          8
			if(!flag3)
	//*  28   67:iload           7
	//*  29   69:ifne            119
			{
				flag = true;
	//   30   72:iconst_1        
	//   31   73:istore          4
			} else
	//*  32   75:iload           6
	//*  33   77:istore          5
	//*  34   79:invokestatic    #86  <Method int TipOfTheWeekStorage.getNumberOfUnseenTips()>
	//*  35   82:ifle            88
	//*  36   85:iconst_1        
	//*  37   86:istore          5
	//*  38   88:iload           4
	//*  39   90:ifeq            134
	//*  40   93:aload_0         
	//*  41   94:iconst_0        
	//*  42   95:invokevirtual   #92  <Method void View.setVisibility(int)>
	//*  43   98:aload_1         
	//*  44   99:iconst_0        
	//*  45  100:invokevirtual   #92  <Method void View.setVisibility(int)>
	//*  46  103:iload           5
	//*  47  105:ifeq            147
	//*  48  108:aload_2         
	//*  49  109:iconst_0        
	//*  50  110:invokevirtual   #92  <Method void View.setVisibility(int)>
	//*  51  113:aload_3         
	//*  52  114:iconst_0        
	//*  53  115:invokevirtual   #92  <Method void View.setVisibility(int)>
	//*  54  118:return          
			{
				flag = flag1;
	//   55  119:iload           5
	//   56  121:istore          4
				if(!flag4)
	//*  57  123:iload           8
	//*  58  125:ifne            75
					flag = true;
	//   59  128:iconst_1        
	//   60  129:istore          4
			}
		}
		flag1 = flag2;
		if(TipOfTheWeekStorage.getNumberOfUnseenTips() > 0)
			flag1 = true;
		if(flag)
		{
			view.setVisibility(0);
			view1.setVisibility(0);
		} else
	//*  61  131:goto            75
		{
			view.setVisibility(4);
	//   62  134:aload_0         
	//   63  135:iconst_4        
	//   64  136:invokevirtual   #92  <Method void View.setVisibility(int)>
			view1.setVisibility(4);
	//   65  139:aload_1         
	//   66  140:iconst_4        
	//   67  141:invokevirtual   #92  <Method void View.setVisibility(int)>
		}
		if(flag1)
		{
			view2.setVisibility(0);
			view3.setVisibility(0);
			return;
		} else
	//*  68  144:goto            103
		{
			view2.setVisibility(4);
	//   69  147:aload_2         
	//   70  148:iconst_4        
	//   71  149:invokevirtual   #92  <Method void View.setVisibility(int)>
			view3.setVisibility(4);
	//   72  152:aload_3         
	//   73  153:iconst_4        
	//   74  154:invokevirtual   #92  <Method void View.setVisibility(int)>
			return;
	//   75  157:return          
		}
	}

	protected void attachBaseContext(Context context)
	{
		super.attachBaseContext(((Context) (CalligraphyContextWrapper.wrap(context))));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #100 <Method android.content.ContextWrapper CalligraphyContextWrapper.wrap(Context)>
	//    3    5:invokespecial   #102 <Method void AppCompatActivity.attachBaseContext(Context)>
	//    4    8:return          
	}

	protected void onCreate(Bundle bundle)
	{
		super.onCreate(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #106 <Method void AppCompatActivity.onCreate(Bundle)>
		if(getIntent().getIntExtra("SURVEY_CODE_EXTRA", 0) != 0)
	//*   3    5:aload_0         
	//*   4    6:invokevirtual   #110 <Method Intent getIntent()>
	//*   5    9:ldc1            #112 <String "SURVEY_CODE_EXTRA">
	//*   6   11:iconst_0        
	//*   7   12:invokevirtual   #118 <Method int Intent.getIntExtra(String, int)>
	//*   8   15:ifeq            43
		{
			bundle = ((Bundle) (new Intent(((Context) (this)), com/pactforcure/app/ui/SurveyActivity)));
	//    9   18:new             #114 <Class Intent>
	//   10   21:dup             
	//   11   22:aload_0         
	//   12   23:ldc1            #120 <Class SurveyActivity>
	//   13   25:invokespecial   #123 <Method void Intent(Context, Class)>
	//   14   28:astore_1        
			((Intent) (bundle)).putExtra("SURVEY_CODE_EXTRA", 0x7f0e0013);
	//   15   29:aload_1         
	//   16   30:ldc1            #112 <String "SURVEY_CODE_EXTRA">
	//   17   32:ldc1            #124 <Int 0x7f0e0013>
	//   18   34:invokevirtual   #128 <Method Intent Intent.putExtra(String, int)>
	//   19   37:pop             
			startActivity(((Intent) (bundle)));
	//   20   38:aload_0         
	//   21   39:aload_1         
	//   22   40:invokevirtual   #132 <Method void startActivity(Intent)>
		}
		binding = (ActivityDashboardBinding)DataBindingUtil.setContentView(((android.app.Activity) (this)), 0x7f04001d);
	//   23   43:aload_0         
	//   24   44:aload_0         
	//   25   45:ldc1            #133 <Int 0x7f04001d>
	//   26   47:invokestatic    #139 <Method android.databinding.ViewDataBinding DataBindingUtil.setContentView(android.app.Activity, int)>
	//   27   50:checkcast       #141 <Class ActivityDashboardBinding>
	//   28   53:putfield        #37  <Field ActivityDashboardBinding binding>
		setSupportActionBar(binding.toolbar);
	//   29   56:aload_0         
	//   30   57:aload_0         
	//   31   58:getfield        #37  <Field ActivityDashboardBinding binding>
	//   32   61:getfield        #145 <Field Toolbar ActivityDashboardBinding.toolbar>
	//   33   64:invokevirtual   #149 <Method void setSupportActionBar(Toolbar)>
		setTitle(0x7f080030);
	//   34   67:aload_0         
	//   35   68:ldc1            #150 <Int 0x7f080030>
	//   36   70:invokevirtual   #153 <Method void setTitle(int)>
		surveyTasksFragment = SurveyTasksFragment.newInstance();
	//   37   73:aload_0         
	//   38   74:invokestatic    #159 <Method Fragment SurveyTasksFragment.newInstance()>
	//   39   77:putfield        #161 <Field Fragment surveyTasksFragment>
		resourcesFragment = ((Fragment) (ResourcesListFragment.newInstance()));
	//   40   80:aload_0         
	//   41   81:invokestatic    #166 <Method ResourcesListFragment ResourcesListFragment.newInstance()>
	//   42   84:putfield        #168 <Field Fragment resourcesFragment>
		Object obj = ((Object) (LayoutInflater.from(((Context) (this))).inflate(0x7f040087, ((ViewGroup) (null)))));
	//   43   87:aload_0         
	//   44   88:invokestatic    #174 <Method LayoutInflater LayoutInflater.from(Context)>
	//   45   91:ldc1            #175 <Int 0x7f040087>
	//   46   93:aconst_null     
	//   47   94:invokevirtual   #179 <Method View LayoutInflater.inflate(int, ViewGroup)>
	//   48   97:astore          6
		bundle = ((Bundle) (LayoutInflater.from(((Context) (this))).inflate(0x7f040087, ((ViewGroup) (null)))));
	//   49   99:aload_0         
	//   50  100:invokestatic    #174 <Method LayoutInflater LayoutInflater.from(Context)>
	//   51  103:ldc1            #175 <Int 0x7f040087>
	//   52  105:aconst_null     
	//   53  106:invokevirtual   #179 <Method View LayoutInflater.inflate(int, ViewGroup)>
	//   54  109:astore_1        
		final ViewGroup surveyTextContainer = (ViewGroup)((View) (obj)).findViewById(0x7f0e0176);
	//   55  110:aload           6
	//   56  112:ldc1            #180 <Int 0x7f0e0176>
	//   57  114:invokevirtual   #184 <Method View View.findViewById(int)>
	//   58  117:checkcast       #186 <Class ViewGroup>
	//   59  120:astore_2        
		final ViewGroup resourcesTextContainer = (ViewGroup)((View) (bundle)).findViewById(0x7f0e0176);
	//   60  121:aload_1         
	//   61  122:ldc1            #180 <Int 0x7f0e0176>
	//   62  124:invokevirtual   #184 <Method View View.findViewById(int)>
	//   63  127:checkcast       #186 <Class ViewGroup>
	//   64  130:astore_3        
		final ViewGroup surveyImageContainer = (ViewGroup)((View) (obj)).findViewById(0x7f0e0178);
	//   65  131:aload           6
	//   66  133:ldc1            #187 <Int 0x7f0e0178>
	//   67  135:invokevirtual   #184 <Method View View.findViewById(int)>
	//   68  138:checkcast       #186 <Class ViewGroup>
	//   69  141:astore          4
		final ViewGroup resourcesImageContainer = (ViewGroup)((View) (bundle)).findViewById(0x7f0e0178);
	//   70  143:aload_1         
	//   71  144:ldc1            #187 <Int 0x7f0e0178>
	//   72  146:invokevirtual   #184 <Method View View.findViewById(int)>
	//   73  149:checkcast       #186 <Class ViewGroup>
	//   74  152:astore          5
		final TabLayout tabLayout = ((TabLayout) ((TextView)((View) (obj)).findViewById(0x7f0e010f)));
	//   75  154:aload           6
	//   76  156:ldc1            #188 <Int 0x7f0e010f>
	//   77  158:invokevirtual   #184 <Method View View.findViewById(int)>
	//   78  161:checkcast       #190 <Class TextView>
	//   79  164:astore          7
		Object obj1 = ((Object) ((TextView)((View) (bundle)).findViewById(0x7f0e010f)));
	//   80  166:aload_1         
	//   81  167:ldc1            #188 <Int 0x7f0e010f>
	//   82  169:invokevirtual   #184 <Method View View.findViewById(int)>
	//   83  172:checkcast       #190 <Class TextView>
	//   84  175:astore          8
		ImageView imageview = (ImageView)((View) (obj)).findViewById(0x7f0e00d2);
	//   85  177:aload           6
	//   86  179:ldc1            #191 <Int 0x7f0e00d2>
	//   87  181:invokevirtual   #184 <Method View View.findViewById(int)>
	//   88  184:checkcast       #193 <Class ImageView>
	//   89  187:astore          9
		ImageView imageview1 = (ImageView)((View) (bundle)).findViewById(0x7f0e00d2);
	//   90  189:aload_1         
	//   91  190:ldc1            #191 <Int 0x7f0e00d2>
	//   92  192:invokevirtual   #184 <Method View View.findViewById(int)>
	//   93  195:checkcast       #193 <Class ImageView>
	//   94  198:astore          10
		View view = ((View) (obj)).findViewById(0x7f0e0177);
	//   95  200:aload           6
	//   96  202:ldc1            #194 <Int 0x7f0e0177>
	//   97  204:invokevirtual   #184 <Method View View.findViewById(int)>
	//   98  207:astore          11
		View view1 = ((View) (obj)).findViewById(0x7f0e0179);
	//   99  209:aload           6
	//  100  211:ldc1            #195 <Int 0x7f0e0179>
	//  101  213:invokevirtual   #184 <Method View View.findViewById(int)>
	//  102  216:astore          12
		View view2 = ((View) (bundle)).findViewById(0x7f0e0177);
	//  103  218:aload_1         
	//  104  219:ldc1            #194 <Int 0x7f0e0177>
	//  105  221:invokevirtual   #184 <Method View View.findViewById(int)>
	//  106  224:astore          13
		View view3 = ((View) (bundle)).findViewById(0x7f0e0179);
	//  107  226:aload_1         
	//  108  227:ldc1            #195 <Int 0x7f0e0179>
	//  109  229:invokevirtual   #184 <Method View View.findViewById(int)>
	//  110  232:astore          14
		android.graphics.drawable.Drawable drawable = getResources().getDrawable(0x7f0200a3);
	//  111  234:aload_0         
	//  112  235:invokevirtual   #199 <Method Resources getResources()>
	//  113  238:ldc1            #200 <Int 0x7f0200a3>
	//  114  240:invokevirtual   #206 <Method android.graphics.drawable.Drawable Resources.getDrawable(int)>
	//  115  243:astore          15
		android.graphics.drawable.Drawable drawable1 = getResources().getDrawable(0x7f02008f);
	//  116  245:aload_0         
	//  117  246:invokevirtual   #199 <Method Resources getResources()>
	//  118  249:ldc1            #207 <Int 0x7f02008f>
	//  119  251:invokevirtual   #206 <Method android.graphics.drawable.Drawable Resources.getDrawable(int)>
	//  120  254:astore          16
		imageview.setImageDrawable(drawable);
	//  121  256:aload           9
	//  122  258:aload           15
	//  123  260:invokevirtual   #211 <Method void ImageView.setImageDrawable(android.graphics.drawable.Drawable)>
		imageview1.setImageDrawable(drawable1);
	//  124  263:aload           10
	//  125  265:aload           16
	//  126  267:invokevirtual   #211 <Method void ImageView.setImageDrawable(android.graphics.drawable.Drawable)>
		((TextView) (tabLayout)).setText(0x7f08007d);
	//  127  270:aload           7
	//  128  272:ldc1            #212 <Int 0x7f08007d>
	//  129  274:invokevirtual   #215 <Method void TextView.setText(int)>
		((TextView) (obj1)).setText(0x7f080053);
	//  130  277:aload           8
	//  131  279:ldc1            #216 <Int 0x7f080053>
	//  132  281:invokevirtual   #215 <Method void TextView.setText(int)>
		view.setVisibility(4);
	//  133  284:aload           11
	//  134  286:iconst_4        
	//  135  287:invokevirtual   #92  <Method void View.setVisibility(int)>
		view1.setVisibility(4);
	//  136  290:aload           12
	//  137  292:iconst_4        
	//  138  293:invokevirtual   #92  <Method void View.setVisibility(int)>
		view2.setVisibility(4);
	//  139  296:aload           13
	//  140  298:iconst_4        
	//  141  299:invokevirtual   #92  <Method void View.setVisibility(int)>
		view3.setVisibility(4);
	//  142  302:aload           14
	//  143  304:iconst_4        
	//  144  305:invokevirtual   #92  <Method void View.setVisibility(int)>
		class .Lambda._cls1
			implements Runnable
		{

			public static Runnable lambdaFactory$(View view4, View view5, View view6, View view7)
			{
				return ((Runnable) (new .Lambda._cls1(view4, view5, view6, view7)));
			//    0    0:new             #2   <Class DashboardActivity$$Lambda$1>
			//    1    3:dup             
			//    2    4:aload_0         
			//    3    5:aload_1         
			//    4    6:aload_2         
			//    5    7:aload_3         
			//    6    8:invokespecial   #29  <Method void DashboardActivity$$Lambda$1(View, View, View, View)>
			//    7   11:areturn         
			}

			public void run()
			{
				DashboardActivity.lambda$onCreate$9(arg$1, arg$2, arg$3, arg$4);
			//    0    0:aload_0         
			//    1    1:getfield        #18  <Field View arg$1>
			//    2    4:aload_0         
			//    3    5:getfield        #20  <Field View arg$2>
			//    4    8:aload_0         
			//    5    9:getfield        #22  <Field View arg$3>
			//    6   12:aload_0         
			//    7   13:getfield        #24  <Field View arg$4>
			//    8   16:invokestatic    #35  <Method void DashboardActivity.lambda$onCreate$9(View, View, View, View)>
			//    9   19:return          
			}

			private final View arg$1;
			private final View arg$2;
			private final View arg$3;
			private final View arg$4;

			private .Lambda._cls1(View view, View view1, View view2, View view3)
			{
			//    0    0:aload_0         
			//    1    1:invokespecial   #16  <Method void Object()>
				arg$1 = view;
			//    2    4:aload_0         
			//    3    5:aload_1         
			//    4    6:putfield        #18  <Field View arg$1>
				arg$2 = view1;
			//    5    9:aload_0         
			//    6   10:aload_2         
			//    7   11:putfield        #20  <Field View arg$2>
				arg$3 = view2;
			//    8   14:aload_0         
			//    9   15:aload_3         
			//   10   16:putfield        #22  <Field View arg$3>
				arg$4 = view3;
			//   11   19:aload_0         
			//   12   20:aload           4
			//   13   22:putfield        #24  <Field View arg$4>
			//   14   25:return          
			}
		}

		badgeVisibility = .Lambda._cls1.lambdaFactory.(view, view1, view2, view3);
	//  145  308:aload_0         
	//  146  309:aload           11
	//  147  311:aload           12
	//  148  313:aload           13
	//  149  315:aload           14
	//  150  317:invokestatic    #222 <Method Runnable DashboardActivity$$Lambda$1.lambdaFactory$(View, View, View, View)>
	//  151  320:putfield        #224 <Field Runnable badgeVisibility>
		surveyTextContainer.setVisibility(8);
	//  152  323:aload_2         
	//  153  324:bipush          8
	//  154  326:invokevirtual   #225 <Method void ViewGroup.setVisibility(int)>
		resourcesImageContainer.setVisibility(8);
	//  155  329:aload           5
	//  156  331:bipush          8
	//  157  333:invokevirtual   #225 <Method void ViewGroup.setVisibility(int)>
		tabLayout = binding.tabs;
	//  158  336:aload_0         
	//  159  337:getfield        #37  <Field ActivityDashboardBinding binding>
	//  160  340:getfield        #229 <Field TabLayout ActivityDashboardBinding.tabs>
	//  161  343:astore          7
		obj1 = ((Object) (tabLayout.newTab()));
	//  162  345:aload           7
	//  163  347:invokevirtual   #235 <Method android.support.design.widget.TabLayout$Tab TabLayout.newTab()>
	//  164  350:astore          8
		((android.support.design.widget.TabLayout.Tab) (obj1)).setTag("SURVEY_TAB");
	//  165  352:aload           8
	//  166  354:ldc1            #16  <String "SURVEY_TAB">
	//  167  356:invokevirtual   #241 <Method android.support.design.widget.TabLayout$Tab android.support.design.widget.TabLayout$Tab.setTag(Object)>
	//  168  359:pop             
		((android.support.design.widget.TabLayout.Tab) (obj1)).setCustomView(((View) (obj)));
	//  169  360:aload           8
	//  170  362:aload           6
	//  171  364:invokevirtual   #245 <Method android.support.design.widget.TabLayout$Tab android.support.design.widget.TabLayout$Tab.setCustomView(View)>
	//  172  367:pop             
		tabLayout.addTab(((android.support.design.widget.TabLayout.Tab) (obj1)));
	//  173  368:aload           7
	//  174  370:aload           8
	//  175  372:invokevirtual   #249 <Method void TabLayout.addTab(android.support.design.widget.TabLayout$Tab)>
		obj = ((Object) (tabLayout.newTab()));
	//  176  375:aload           7
	//  177  377:invokevirtual   #235 <Method android.support.design.widget.TabLayout$Tab TabLayout.newTab()>
	//  178  380:astore          6
		((android.support.design.widget.TabLayout.Tab) (obj)).setTag("RESOURCES_TAB");
	//  179  382:aload           6
	//  180  384:ldc1            #14  <String "RESOURCES_TAB">
	//  181  386:invokevirtual   #241 <Method android.support.design.widget.TabLayout$Tab android.support.design.widget.TabLayout$Tab.setTag(Object)>
	//  182  389:pop             
		((android.support.design.widget.TabLayout.Tab) (obj)).setCustomView(((View) (bundle)));
	//  183  390:aload           6
	//  184  392:aload_1         
	//  185  393:invokevirtual   #245 <Method android.support.design.widget.TabLayout$Tab android.support.design.widget.TabLayout$Tab.setCustomView(View)>
	//  186  396:pop             
		tabLayout.addTab(((android.support.design.widget.TabLayout.Tab) (obj)));
	//  187  397:aload           7
	//  188  399:aload           6
	//  189  401:invokevirtual   #249 <Method void TabLayout.addTab(android.support.design.widget.TabLayout$Tab)>
		tabLayout.addOnTabSelectedListener(new android.support.design.widget.TabLayout.OnTabSelectedListener() {

			public void onTabReselected(android.support.design.widget.TabLayout.Tab tab)
			{
			//    0    0:return          
			}

			public void onTabSelected(android.support.design.widget.TabLayout.Tab tab)
			{
				byte byte0;
				tab.setText(((CharSequence) (null)));
			//    0    0:aload_1         
			//    1    1:aconst_null     
			//    2    2:invokevirtual   #43  <Method android.support.design.widget.TabLayout$Tab android.support.design.widget.TabLayout$Tab.setText(CharSequence)>
			//    3    5:pop             
				tab = ((android.support.design.widget.TabLayout.Tab) ((String)tab.getTag()));
			//    4    6:aload_1         
			//    5    7:invokevirtual   #47  <Method Object android.support.design.widget.TabLayout$Tab.getTag()>
			//    6   10:checkcast       #49  <Class String>
			//    7   13:astore_1        
				if(tab == null)
			//*   8   14:aload_1         
			//*   9   15:ifnonnull       19
					return;
			//   10   18:return          
				byte0 = -1;
			//   11   19:iconst_m1       
			//   12   20:istore_2        
				((String) (tab)).hashCode();
			//   13   21:aload_1         
			//   14   22:invokevirtual   #53  <Method int String.hashCode()>
				JVM INSTR lookupswitch 2: default 52
			//			               -187576048: 126
			//			               -180308421: 140;
			//   15   25:lookupswitch    2: default 52
			//			               -187576048: 126
			//			               -180308421: 140
				   goto _L1 _L2 _L3
_L1:
				break; /* Loop/switch isn't completed */
_L3:
				break MISSING_BLOCK_LABEL_140;
_L4:
				switch(byte0)
			//*  16   52:iload_2         
				{
			//*  17   53:tableswitch     0 1: default 76
			//			               0 77
			//			               1 154
				default:
					return;
			//   18   76:return          

				case 0: // '\0'
					surveyImageContainer.setVisibility(0);
			//   19   77:aload_0         
			//   20   78:getfield        #24  <Field ViewGroup val$surveyImageContainer>
			//   21   81:iconst_0        
			//   22   82:invokevirtual   #59  <Method void ViewGroup.setVisibility(int)>
					surveyTextContainer.setVisibility(8);
			//   23   85:aload_0         
			//   24   86:getfield        #26  <Field ViewGroup val$surveyTextContainer>
			//   25   89:bipush          8
			//   26   91:invokevirtual   #59  <Method void ViewGroup.setVisibility(int)>
					resourcesImageContainer.setVisibility(8);
			//   27   94:aload_0         
			//   28   95:getfield        #28  <Field ViewGroup val$resourcesImageContainer>
			//   29   98:bipush          8
			//   30  100:invokevirtual   #59  <Method void ViewGroup.setVisibility(int)>
					resourcesTextContainer.setVisibility(0);
			//   31  103:aload_0         
			//   32  104:getfield        #30  <Field ViewGroup val$resourcesTextContainer>
			//   33  107:iconst_0        
			//   34  108:invokevirtual   #59  <Method void ViewGroup.setVisibility(int)>
					binding.viewPager.setCurrentItem(0);
			//   35  111:aload_0         
			//   36  112:getfield        #22  <Field DashboardActivity this$0>
			//   37  115:invokestatic    #63  <Method ActivityDashboardBinding DashboardActivity.access$000(DashboardActivity)>
			//   38  118:getfield        #69  <Field ViewPager ActivityDashboardBinding.viewPager>
			//   39  121:iconst_0        
			//   40  122:invokevirtual   #74  <Method void ViewPager.setCurrentItem(int)>
					return;
			//   41  125:return          

			//*  42  126:aload_1         
			//*  43  127:ldc1            #76  <String "SURVEY_TAB">
			//*  44  129:invokevirtual   #80  <Method boolean String.equals(Object)>
			//*  45  132:ifeq            52
			//*  46  135:iconst_0        
			//*  47  136:istore_2        
			//*  48  137:goto            52
			//*  49  140:aload_1         
			//*  50  141:ldc1            #82  <String "RESOURCES_TAB">
			//*  51  143:invokevirtual   #80  <Method boolean String.equals(Object)>
			//*  52  146:ifeq            52
			//*  53  149:iconst_1        
			//*  54  150:istore_2        
			//*  55  151:goto            52
				case 1: // '\001'
					surveyImageContainer.setVisibility(8);
			//   56  154:aload_0         
			//   57  155:getfield        #24  <Field ViewGroup val$surveyImageContainer>
			//   58  158:bipush          8
			//   59  160:invokevirtual   #59  <Method void ViewGroup.setVisibility(int)>
					break;
				}
				break MISSING_BLOCK_LABEL_163;
_L2:
				if(((String) (tab)).equals("SURVEY_TAB"))
					byte0 = 0;
				  goto _L4
				if(((String) (tab)).equals("RESOURCES_TAB"))
					byte0 = 1;
				  goto _L4
				surveyTextContainer.setVisibility(0);
			//   60  163:aload_0         
			//   61  164:getfield        #26  <Field ViewGroup val$surveyTextContainer>
			//   62  167:iconst_0        
			//   63  168:invokevirtual   #59  <Method void ViewGroup.setVisibility(int)>
				resourcesImageContainer.setVisibility(0);
			//   64  171:aload_0         
			//   65  172:getfield        #28  <Field ViewGroup val$resourcesImageContainer>
			//   66  175:iconst_0        
			//   67  176:invokevirtual   #59  <Method void ViewGroup.setVisibility(int)>
				resourcesTextContainer.setVisibility(8);
			//   68  179:aload_0         
			//   69  180:getfield        #30  <Field ViewGroup val$resourcesTextContainer>
			//   70  183:bipush          8
			//   71  185:invokevirtual   #59  <Method void ViewGroup.setVisibility(int)>
				binding.viewPager.setCurrentItem(1);
			//   72  188:aload_0         
			//   73  189:getfield        #22  <Field DashboardActivity this$0>
			//   74  192:invokestatic    #63  <Method ActivityDashboardBinding DashboardActivity.access$000(DashboardActivity)>
			//   75  195:getfield        #69  <Field ViewPager ActivityDashboardBinding.viewPager>
			//   76  198:iconst_1        
			//   77  199:invokevirtual   #74  <Method void ViewPager.setCurrentItem(int)>
				return;
			//   78  202:return          
			}

			public void onTabUnselected(android.support.design.widget.TabLayout.Tab tab)
			{
			//    0    0:return          
			}

			final DashboardActivity this$0;
			final ViewGroup val$resourcesImageContainer;
			final ViewGroup val$resourcesTextContainer;
			final ViewGroup val$surveyImageContainer;
			final ViewGroup val$surveyTextContainer;

			
			{
				this$0 = DashboardActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #22  <Field DashboardActivity this$0>
				surveyImageContainer = viewgroup;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #24  <Field ViewGroup val$surveyImageContainer>
				surveyTextContainer = viewgroup1;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #26  <Field ViewGroup val$surveyTextContainer>
				resourcesImageContainer = viewgroup2;
			//    9   15:aload_0         
			//   10   16:aload           4
			//   11   18:putfield        #28  <Field ViewGroup val$resourcesImageContainer>
				resourcesTextContainer = viewgroup3;
			//   12   21:aload_0         
			//   13   22:aload           5
			//   14   24:putfield        #30  <Field ViewGroup val$resourcesTextContainer>
				super();
			//   15   27:aload_0         
			//   16   28:invokespecial   #33  <Method void Object()>
			//   17   31:return          
			}
		}
);
	//  190  404:aload           7
	//  191  406:new             #6   <Class DashboardActivity$1>
	//  192  409:dup             
	//  193  410:aload_0         
	//  194  411:aload           4
	//  195  413:aload_2         
	//  196  414:aload           5
	//  197  416:aload_3         
	//  198  417:invokespecial   #252 <Method void DashboardActivity$1(DashboardActivity, ViewGroup, ViewGroup, ViewGroup, ViewGroup)>
	//  199  420:invokevirtual   #256 <Method void TabLayout.addOnTabSelectedListener(android.support.design.widget.TabLayout$OnTabSelectedListener)>
		adapter = new DashboardTabsAdapter(this, getSupportFragmentManager());
	//  200  423:aload_0         
	//  201  424:new             #10  <Class DashboardActivity$DashboardTabsAdapter>
	//  202  427:dup             
	//  203  428:aload_0         
	//  204  429:aload_0         
	//  205  430:invokevirtual   #260 <Method FragmentManager getSupportFragmentManager()>
	//  206  433:invokespecial   #263 <Method void DashboardActivity$DashboardTabsAdapter(DashboardActivity, FragmentManager)>
	//  207  436:putfield        #265 <Field DashboardActivity$DashboardTabsAdapter adapter>
		binding.viewPager.setAdapter(((android.support.v4.view.PagerAdapter) (adapter)));
	//  208  439:aload_0         
	//  209  440:getfield        #37  <Field ActivityDashboardBinding binding>
	//  210  443:getfield        #269 <Field ViewPager ActivityDashboardBinding.viewPager>
	//  211  446:aload_0         
	//  212  447:getfield        #265 <Field DashboardActivity$DashboardTabsAdapter adapter>
	//  213  450:invokevirtual   #275 <Method void ViewPager.setAdapter(android.support.v4.view.PagerAdapter)>
		binding.viewPager.addOnPageChangeListener(new android.support.v4.view.ViewPager.OnPageChangeListener() {

			public void onPageScrollStateChanged(int i)
			{
			//    0    0:return          
			}

			public void onPageScrolled(int i, float f, int j)
			{
			//    0    0:return          
			}

			public void onPageSelected(int i)
			{
				tabLayout.getTabAt(i).select();
			//    0    0:aload_0         
			//    1    1:getfield        #21  <Field TabLayout val$tabLayout>
			//    2    4:iload_1         
			//    3    5:invokevirtual   #36  <Method android.support.design.widget.TabLayout$Tab TabLayout.getTabAt(int)>
			//    4    8:invokevirtual   #41  <Method void android.support.design.widget.TabLayout$Tab.select()>
			//    5   11:return          
			}

			final DashboardActivity this$0;
			final TabLayout val$tabLayout;

			
			{
				this$0 = DashboardActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field DashboardActivity this$0>
				tabLayout = tablayout;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field TabLayout val$tabLayout>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
		}
);
	//  214  453:aload_0         
	//  215  454:getfield        #37  <Field ActivityDashboardBinding binding>
	//  216  457:getfield        #269 <Field ViewPager ActivityDashboardBinding.viewPager>
	//  217  460:new             #8   <Class DashboardActivity$2>
	//  218  463:dup             
	//  219  464:aload_0         
	//  220  465:aload           7
	//  221  467:invokespecial   #278 <Method void DashboardActivity$2(DashboardActivity, TabLayout)>
	//  222  470:invokevirtual   #282 <Method void ViewPager.addOnPageChangeListener(android.support.v4.view.ViewPager$OnPageChangeListener)>
	//  223  473:return          
	}

	public boolean onCreateOptionsMenu(Menu menu)
	{
		binding.toolbar.inflateMenu(0x7f0f0000);
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field ActivityDashboardBinding binding>
	//    2    4:getfield        #145 <Field Toolbar ActivityDashboardBinding.toolbar>
	//    3    7:ldc2            #285 <Int 0x7f0f0000>
	//    4   10:invokevirtual   #290 <Method void Toolbar.inflateMenu(int)>
		return true;
	//    5   13:iconst_1        
	//    6   14:ireturn         
	}

	public boolean onOptionsItemSelected(MenuItem menuitem)
	{
		startActivity(new Intent(((Context) (this)), com/pactforcure/app/ui/SettingsActivity));
	//    0    0:aload_0         
	//    1    1:new             #114 <Class Intent>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:ldc2            #294 <Class SettingsActivity>
	//    5    9:invokespecial   #123 <Method void Intent(Context, Class)>
	//    6   12:invokevirtual   #132 <Method void startActivity(Intent)>
		overridePendingTransition(0x7f050019, 0x7f05001a);
	//    7   15:aload_0         
	//    8   16:ldc2            #295 <Int 0x7f050019>
	//    9   19:ldc2            #296 <Int 0x7f05001a>
	//   10   22:invokevirtual   #300 <Method void overridePendingTransition(int, int)>
		return true;
	//   11   25:iconst_1        
	//   12   26:ireturn         
	}

	public void onPpdEndListener(OnPpdEndMessage onppdendmessage)
	{
		Object obj;
		if(onppdendmessage.suicidality)
	//*   0    0:aload_1         
	//*   1    1:getfield        #314 <Field boolean OnPpdEndMessage.suicidality>
	//*   2    4:ifeq            71
			obj = com/pactforcure/app/ui/SuicidalityActivity;
	//    3    7:ldc2            #316 <Class SuicidalityActivity>
	//    4   10:astore_2        
		else
	//*   5   11:new             #114 <Class Intent>
	//*   6   14:dup             
	//*   7   15:aload_0         
	//*   8   16:aload_2         
	//*   9   17:invokespecial   #123 <Method void Intent(Context, Class)>
	//*  10   20:astore_2        
	//*  11   21:aload_2         
	//*  12   22:ldc2            #318 <String "SCORE_EXTRA">
	//*  13   25:aload_1         
	//*  14   26:getfield        #322 <Field int OnPpdEndMessage.score>
	//*  15   29:invokevirtual   #128 <Method Intent Intent.putExtra(String, int)>
	//*  16   32:pop             
	//*  17   33:aload_2         
	//*  18   34:ldc2            #324 <String "CURRENT_SYMPTOMS_EXTRA">
	//*  19   37:aload_1         
	//*  20   38:getfield        #327 <Field boolean OnPpdEndMessage.currentSymptoms>
	//*  21   41:invokevirtual   #330 <Method Intent Intent.putExtra(String, boolean)>
	//*  22   44:pop             
	//*  23   45:aload_2         
	//*  24   46:ldc2            #332 <String "WORST_EPISODE_EXTRA">
	//*  25   49:aload_1         
	//*  26   50:getfield        #335 <Field String OnPpdEndMessage.worstEpisode>
	//*  27   53:invokevirtual   #338 <Method Intent Intent.putExtra(String, String)>
	//*  28   56:pop             
	//*  29   57:aload_0         
	//*  30   58:aload_2         
	//*  31   59:invokevirtual   #132 <Method void startActivity(Intent)>
	//*  32   62:invokestatic    #344 <Method EventBus EventBus.getDefault()>
	//*  33   65:aload_1         
	//*  34   66:invokevirtual   #348 <Method boolean EventBus.removeStickyEvent(Object)>
	//*  35   69:pop             
	//*  36   70:return          
			obj = com/pactforcure/app/ui/PpdResultsActivity;
	//   37   71:ldc2            #350 <Class PpdResultsActivity>
	//   38   74:astore_2        
		obj = ((Object) (new Intent(((Context) (this)), ((Class) (obj)))));
		((Intent) (obj)).putExtra("SCORE_EXTRA", onppdendmessage.score);
		((Intent) (obj)).putExtra("CURRENT_SYMPTOMS_EXTRA", onppdendmessage.currentSymptoms);
		((Intent) (obj)).putExtra("WORST_EPISODE_EXTRA", onppdendmessage.worstEpisode);
		startActivity(((Intent) (obj)));
		EventBus.getDefault().removeStickyEvent(((Object) (onppdendmessage)));
	//*  39   75:goto            11
	}

	protected void onResume()
	{
		super.onResume();
	//    0    0:aload_0         
	//    1    1:invokespecial   #354 <Method void AppCompatActivity.onResume()>
		badgeVisibility.run();
	//    2    4:aload_0         
	//    3    5:getfield        #224 <Field Runnable badgeVisibility>
	//    4    8:invokeinterface #359 <Method void Runnable.run()>
	//    5   13:return          
	}

	public void onStart()
	{
		super.onStart();
	//    0    0:aload_0         
	//    1    1:invokespecial   #362 <Method void AppCompatActivity.onStart()>
		EventBus.getDefault().register(((Object) (this)));
	//    2    4:invokestatic    #344 <Method EventBus EventBus.getDefault()>
	//    3    7:aload_0         
	//    4    8:invokevirtual   #366 <Method void EventBus.register(Object)>
	//    5   11:return          
	}

	public void onStop()
	{
		super.onStop();
	//    0    0:aload_0         
	//    1    1:invokespecial   #369 <Method void AppCompatActivity.onStop()>
		EventBus.getDefault().unregister(((Object) (this)));
	//    2    4:invokestatic    #344 <Method EventBus EventBus.getDefault()>
	//    3    7:aload_0         
	//    4    8:invokevirtual   #372 <Method void EventBus.unregister(Object)>
	//    5   11:return          
	}

	public void onSurveyCompleted(SurveyCompletedMessage surveycompletedmessage)
	{
		EventBus.getDefault().removeStickyEvent(((Object) (surveycompletedmessage)));
	//    0    0:invokestatic    #344 <Method EventBus EventBus.getDefault()>
	//    1    3:aload_1         
	//    2    4:invokevirtual   #348 <Method boolean EventBus.removeStickyEvent(Object)>
	//    3    7:pop             
		((OnSurveyProgressStatusChanged)surveyTasksFragment).onSurveyProgressStatusChanged();
	//    4    8:aload_0         
	//    5    9:getfield        #161 <Field Fragment surveyTasksFragment>
	//    6   12:checkcast       #376 <Class OnSurveyProgressStatusChanged>
	//    7   15:invokeinterface #379 <Method void OnSurveyProgressStatusChanged.onSurveyProgressStatusChanged()>
		badgeVisibility.run();
	//    8   20:aload_0         
	//    9   21:getfield        #224 <Field Runnable badgeVisibility>
	//   10   24:invokeinterface #359 <Method void Runnable.run()>
		surveycompletedmessage = ((SurveyCompletedMessage) (binding.tabs.getTabAt(0)));
	//   11   29:aload_0         
	//   12   30:getfield        #37  <Field ActivityDashboardBinding binding>
	//   13   33:getfield        #229 <Field TabLayout ActivityDashboardBinding.tabs>
	//   14   36:iconst_0        
	//   15   37:invokevirtual   #383 <Method android.support.design.widget.TabLayout$Tab TabLayout.getTabAt(int)>
	//   16   40:astore_1        
		if(surveycompletedmessage != null)
	//*  17   41:aload_1         
	//*  18   42:ifnull          49
			((android.support.design.widget.TabLayout.Tab) (surveycompletedmessage)).select();
	//   19   45:aload_1         
	//   20   46:invokevirtual   #386 <Method void android.support.design.widget.TabLayout$Tab.select()>
	//   21   49:return          
	}

	public void onSurveyUploaded(SurveyUploadedMessage surveyuploadedmessage)
	{
		EventBus.getDefault().removeStickyEvent(((Object) (surveyuploadedmessage)));
	//    0    0:invokestatic    #344 <Method EventBus EventBus.getDefault()>
	//    1    3:aload_1         
	//    2    4:invokevirtual   #348 <Method boolean EventBus.removeStickyEvent(Object)>
	//    3    7:pop             
		((OnSurveyProgressStatusChanged)surveyTasksFragment).onSurveyProgressStatusChanged();
	//    4    8:aload_0         
	//    5    9:getfield        #161 <Field Fragment surveyTasksFragment>
	//    6   12:checkcast       #376 <Class OnSurveyProgressStatusChanged>
	//    7   15:invokeinterface #379 <Method void OnSurveyProgressStatusChanged.onSurveyProgressStatusChanged()>
		badgeVisibility.run();
	//    8   20:aload_0         
	//    9   21:getfield        #224 <Field Runnable badgeVisibility>
	//   10   24:invokeinterface #359 <Method void Runnable.run()>
	//   11   29:return          
	}

	private static final String RESOURCES_TAB = "RESOURCES_TAB";
	private static final String SURVEY_TAB = "SURVEY_TAB";
	private static final String TAG = "DashboardActivity";
	private DashboardTabsAdapter adapter;
	private Runnable badgeVisibility;
	private ActivityDashboardBinding binding;
	Fragment resourcesFragment;
	Fragment surveyTasksFragment;


/*
	static ActivityDashboardBinding access$000(DashboardActivity dashboardactivity)
	{
		return dashboardactivity.binding;
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field ActivityDashboardBinding binding>
	//    2    4:areturn         
	}

*/
}
