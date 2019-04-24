// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.pactforcure.app.ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.*;
import android.view.animation.Animation;
import android.webkit.WebView;
import android.widget.*;
import com.pactforcure.app.participant.ParticipantStorage;
import com.pactforcure.app.studies.Res;
import com.pactforcure.app.ui.view.CircleIndicatorView;
import com.pactforcure.app.util.FileUtils;
import com.pactforcure.app.util.VersionUtils;
import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

// Referenced classes of package com.pactforcure.app.ui:
//			SurveyActivity, DashboardActivity, LoginActivity, SetPasswordActivity

public class MainActivity extends AppCompatActivity
{

	public MainActivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #32  <Method void AppCompatActivity()>
	//    2    4:return          
	}

	private void TESTING_goToGeneralConsent()
	{
		Intent intent = new Intent(((Context) (this)), com/pactforcure/app/ui/SurveyActivity);
	//    0    0:new             #36  <Class Intent>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:ldc1            #38  <Class SurveyActivity>
	//    4    7:invokespecial   #41  <Method void Intent(Context, Class)>
	//    5   10:astore_1        
		intent.putExtra("testing_consent", 1);
	//    6   11:aload_1         
	//    7   12:ldc1            #43  <String "testing_consent">
	//    8   14:iconst_1        
	//    9   15:invokevirtual   #47  <Method Intent Intent.putExtra(String, int)>
	//   10   18:pop             
		startActivity(intent);
	//   11   19:aload_0         
	//   12   20:aload_1         
	//   13   21:invokevirtual   #51  <Method void startActivity(Intent)>
	//   14   24:return          
	}

	private void goToDashboard()
	{
		Intent intent = new Intent(((Context) (this)), com/pactforcure/app/ui/DashboardActivity);
	//    0    0:new             #36  <Class Intent>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:ldc1            #70  <Class DashboardActivity>
	//    4    7:invokespecial   #41  <Method void Intent(Context, Class)>
	//    5   10:astore_1        
		intent.setFlags(0x10008000);
	//    6   11:aload_1         
	//    7   12:ldc1            #71  <Int 0x10008000>
	//    8   14:invokevirtual   #75  <Method Intent Intent.setFlags(int)>
	//    9   17:pop             
		startActivity(intent);
	//   10   18:aload_0         
	//   11   19:aload_1         
	//   12   20:invokevirtual   #51  <Method void startActivity(Intent)>
	//   13   23:return          
	}

	private void goToEligibilityQuiz()
	{
		Intent intent = new Intent(((Context) (this)), com/pactforcure/app/ui/SurveyActivity);
	//    0    0:new             #36  <Class Intent>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:ldc1            #38  <Class SurveyActivity>
	//    4    7:invokespecial   #41  <Method void Intent(Context, Class)>
	//    5   10:astore_1        
		intent.putExtra("SURVEY_CODE_EXTRA", 0x7f0e0006);
	//    6   11:aload_1         
	//    7   12:ldc1            #78  <String "SURVEY_CODE_EXTRA">
	//    8   14:ldc1            #79  <Int 0x7f0e0006>
	//    9   16:invokevirtual   #47  <Method Intent Intent.putExtra(String, int)>
	//   10   19:pop             
		startActivity(intent);
	//   11   20:aload_0         
	//   12   21:aload_1         
	//   13   22:invokevirtual   #51  <Method void startActivity(Intent)>
	//   14   25:return          
	}

	private void goToLoginScreen()
	{
		startActivity(new Intent(((Context) (this)), com/pactforcure/app/ui/LoginActivity));
	//    0    0:aload_0         
	//    1    1:new             #36  <Class Intent>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:ldc1            #82  <Class LoginActivity>
	//    5    8:invokespecial   #41  <Method void Intent(Context, Class)>
	//    6   11:invokevirtual   #51  <Method void startActivity(Intent)>
		overridePendingTransition(0x7f050019, 0x7f05001a);
	//    7   14:aload_0         
	//    8   15:ldc1            #83  <Int 0x7f050019>
	//    9   17:ldc1            #84  <Int 0x7f05001a>
	//   10   19:invokevirtual   #88  <Method void overridePendingTransition(int, int)>
	//   11   22:return          
	}

	private void goToSetPassword()
	{
		Intent intent = new Intent(((Context) (this)), com/pactforcure/app/ui/SetPasswordActivity);
	//    0    0:new             #36  <Class Intent>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:ldc1            #91  <Class SetPasswordActivity>
	//    4    7:invokespecial   #41  <Method void Intent(Context, Class)>
	//    5   10:astore_1        
		intent.setFlags(0x10008000);
	//    6   11:aload_1         
	//    7   12:ldc1            #71  <Int 0x10008000>
	//    8   14:invokevirtual   #75  <Method Intent Intent.setFlags(int)>
	//    9   17:pop             
		startActivity(intent);
	//   10   18:aload_0         
	//   11   19:aload_1         
	//   12   20:invokevirtual   #51  <Method void startActivity(Intent)>
	//   13   23:return          
	}

	private boolean isTheUserRegistered()
	{
		return ParticipantStorage.isTheUserRegistered();
	//    0    0:invokestatic    #97  <Method boolean ParticipantStorage.isTheUserRegistered()>
	//    1    3:ireturn         
	}

	static void lambda$onCreate$19(MainActivity mainactivity, View view)
	{
		mainactivity.goToEligibilityQuiz();
	//    0    0:aload_0         
	//    1    1:invokespecial   #101 <Method void goToEligibilityQuiz()>
	//    2    4:return          
	}

	static void lambda$onCreate$20(MainActivity mainactivity, View view)
	{
		if(mainactivity.isTheUserRegistered() && !ParticipantStorage.userHasPassword())
	//*   0    0:aload_0         
	//*   1    1:invokespecial   #103 <Method boolean isTheUserRegistered()>
	//*   2    4:ifeq            18
	//*   3    7:invokestatic    #106 <Method boolean ParticipantStorage.userHasPassword()>
	//*   4   10:ifne            18
		{
			mainactivity.goToSetPassword();
	//    5   13:aload_0         
	//    6   14:invokespecial   #108 <Method void goToSetPassword()>
			return;
	//    7   17:return          
		} else
		{
			mainactivity.goToLoginScreen();
	//    8   18:aload_0         
	//    9   19:invokespecial   #110 <Method void goToLoginScreen()>
			return;
	//   10   22:return          
		}
	}

	private void loadHtmlContent(WebView webview, String s)
	{
		String s1 = FileUtils.rawResToString(0x7f070019);
	//    0    0:ldc1            #113 <Int 0x7f070019>
	//    1    2:invokestatic    #119 <Method String FileUtils.rawResToString(int)>
	//    2    5:astore_3        
		webview.loadDataWithBaseURL("file:///android_asset/", (new StringBuilder()).append(s1).append(s).toString(), "text/html", "utf-8", ((String) (null)));
	//    3    6:aload_1         
	//    4    7:ldc1            #121 <String "file:///android_asset/">
	//    5    9:new             #123 <Class StringBuilder>
	//    6   12:dup             
	//    7   13:invokespecial   #124 <Method void StringBuilder()>
	//    8   16:aload_3         
	//    9   17:invokevirtual   #128 <Method StringBuilder StringBuilder.append(String)>
	//   10   20:aload_2         
	//   11   21:invokevirtual   #128 <Method StringBuilder StringBuilder.append(String)>
	//   12   24:invokevirtual   #132 <Method String StringBuilder.toString()>
	//   13   27:ldc1            #134 <String "text/html">
	//   14   29:ldc1            #136 <String "utf-8">
	//   15   31:aconst_null     
	//   16   32:invokevirtual   #142 <Method void WebView.loadDataWithBaseURL(String, String, String, String, String)>
	//   17   35:return          
	}

	protected void attachBaseContext(Context context)
	{
		super.attachBaseContext(((Context) (CalligraphyContextWrapper.wrap(context))));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #150 <Method android.content.ContextWrapper CalligraphyContextWrapper.wrap(Context)>
	//    3    5:invokespecial   #152 <Method void AppCompatActivity.attachBaseContext(Context)>
	//    4    8:return          
	}

	public boolean dispatchTouchEvent(MotionEvent motionevent)
	{
		super.dispatchTouchEvent(motionevent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #156 <Method boolean AppCompatActivity.dispatchTouchEvent(MotionEvent)>
	//    3    5:pop             
		return viewFlipperGestureDetector.onTouchEvent(motionevent);
	//    4    6:aload_0         
	//    5    7:getfield        #67  <Field GestureDetector viewFlipperGestureDetector>
	//    6   10:aload_1         
	//    7   11:invokevirtual   #161 <Method boolean GestureDetector.onTouchEvent(MotionEvent)>
	//    8   14:ireturn         
	}

	protected void onCreate(Bundle bundle)
	{
		super.onCreate(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #165 <Method void AppCompatActivity.onCreate(Bundle)>
		if(isTheUserRegistered() && ParticipantStorage.userHasPassword())
	//*   3    5:aload_0         
	//*   4    6:invokespecial   #103 <Method boolean isTheUserRegistered()>
	//*   5    9:ifeq            23
	//*   6   12:invokestatic    #106 <Method boolean ParticipantStorage.userHasPassword()>
	//*   7   15:ifeq            23
		{
			goToDashboard();
	//    8   18:aload_0         
	//    9   19:invokespecial   #167 <Method void goToDashboard()>
			return;
	//   10   22:return          
		} else
		{
			setContentView(0x7f040025);
	//   11   23:aload_0         
	//   12   24:ldc1            #168 <Int 0x7f040025>
	//   13   26:invokevirtual   #172 <Method void setContentView(int)>
			toolbar = (Toolbar)findViewById(0x7f0e00af);
	//   14   29:aload_0         
	//   15   30:aload_0         
	//   16   31:ldc1            #173 <Int 0x7f0e00af>
	//   17   33:invokevirtual   #177 <Method View findViewById(int)>
	//   18   36:checkcast       #179 <Class Toolbar>
	//   19   39:putfield        #181 <Field Toolbar toolbar>
			setSupportActionBar(toolbar);
	//   20   42:aload_0         
	//   21   43:aload_0         
	//   22   44:getfield        #181 <Field Toolbar toolbar>
	//   23   47:invokevirtual   #185 <Method void setSupportActionBar(Toolbar)>
			setTitle(((CharSequence) (Res.getStudySpecificString(0x7f080299))));
	//   24   50:aload_0         
	//   25   51:ldc1            #186 <Int 0x7f080299>
	//   26   53:invokestatic    #191 <Method String Res.getStudySpecificString(int)>
	//   27   56:invokevirtual   #195 <Method void setTitle(CharSequence)>
			bundle = ((Bundle) ((TextView)findViewById(0x7f0e00d3)));
	//   28   59:aload_0         
	//   29   60:ldc1            #196 <Int 0x7f0e00d3>
	//   30   62:invokevirtual   #177 <Method View findViewById(int)>
	//   31   65:checkcast       #198 <Class TextView>
	//   32   68:astore_1        
			TextView textview = (TextView)findViewById(0x7f0e00d4);
	//   33   69:aload_0         
	//   34   70:ldc1            #199 <Int 0x7f0e00d4>
	//   35   72:invokevirtual   #177 <Method View findViewById(int)>
	//   36   75:checkcast       #198 <Class TextView>
	//   37   78:astore_2        
			TextView textview1 = (TextView)findViewById(0x7f0e00d5);
	//   38   79:aload_0         
	//   39   80:ldc1            #200 <Int 0x7f0e00d5>
	//   40   82:invokevirtual   #177 <Method View findViewById(int)>
	//   41   85:checkcast       #198 <Class TextView>
	//   42   88:astore_3        
			joinStudyBtn = (Button)findViewById(0x7f0e00dc);
	//   43   89:aload_0         
	//   44   90:aload_0         
	//   45   91:ldc1            #201 <Int 0x7f0e00dc>
	//   46   93:invokevirtual   #177 <Method View findViewById(int)>
	//   47   96:checkcast       #203 <Class Button>
	//   48   99:putfield        #205 <Field Button joinStudyBtn>
			class .Lambda._cls1
				implements android.view.View.OnClickListener
			{

				public static android.view.View.OnClickListener lambdaFactory$(MainActivity mainactivity)
				{
					return ((android.view.View.OnClickListener) (((.Lambda._cls1) (mainactivity)). new .Lambda._cls1()));
				//    0    0:new             #2   <Class MainActivity$$Lambda$1>
				//    1    3:dup             
				//    2    4:aload_0         
				//    3    5:invokespecial   #20  <Method void MainActivity$$Lambda$1(MainActivity)>
				//    4    8:areturn         
				}

				public void onClick(View view)
				{
					MainActivity.lambda$onCreate$19(arg$1, view);
				//    0    0:aload_0         
				//    1    1:getfield        #15  <Field MainActivity arg$1>
				//    2    4:aload_1         
				//    3    5:invokestatic    #28  <Method void MainActivity.lambda$onCreate$19(MainActivity, View)>
				//    4    8:return          
				}

				private final MainActivity arg$1;

			private .Lambda._cls1()
			{
			//    0    0:aload_0         
			//    1    1:invokespecial   #13  <Method void Object()>
				arg$1 = MainActivity.this;
			//    2    4:aload_0         
			//    3    5:aload_1         
			//    4    6:putfield        #15  <Field MainActivity arg$1>
			//    5    9:return          
			}
			}

			joinStudyBtn.setOnClickListener(.Lambda._cls1.lambdaFactory.(this));
	//   49  102:aload_0         
	//   50  103:getfield        #205 <Field Button joinStudyBtn>
	//   51  106:aload_0         
	//   52  107:invokestatic    #211 <Method android.view.View$OnClickListener MainActivity$$Lambda$1.lambdaFactory$(MainActivity)>
	//   53  110:invokevirtual   #215 <Method void Button.setOnClickListener(android.view.View$OnClickListener)>
			alreadyParticipatingBtn = (TextView)findViewById(0x7f0e00dd);
	//   54  113:aload_0         
	//   55  114:aload_0         
	//   56  115:ldc1            #216 <Int 0x7f0e00dd>
	//   57  117:invokevirtual   #177 <Method View findViewById(int)>
	//   58  120:checkcast       #198 <Class TextView>
	//   59  123:putfield        #218 <Field TextView alreadyParticipatingBtn>
			class .Lambda._cls2
				implements android.view.View.OnClickListener
			{

				public static android.view.View.OnClickListener lambdaFactory$(MainActivity mainactivity)
				{
					return ((android.view.View.OnClickListener) (((.Lambda._cls2) (mainactivity)). new .Lambda._cls2()));
				//    0    0:new             #2   <Class MainActivity$$Lambda$2>
				//    1    3:dup             
				//    2    4:aload_0         
				//    3    5:invokespecial   #20  <Method void MainActivity$$Lambda$2(MainActivity)>
				//    4    8:areturn         
				}

				public void onClick(View view)
				{
					MainActivity.lambda$onCreate$20(arg$1, view);
				//    0    0:aload_0         
				//    1    1:getfield        #15  <Field MainActivity arg$1>
				//    2    4:aload_1         
				//    3    5:invokestatic    #28  <Method void MainActivity.lambda$onCreate$20(MainActivity, View)>
				//    4    8:return          
				}

				private final MainActivity arg$1;

			private .Lambda._cls2()
			{
			//    0    0:aload_0         
			//    1    1:invokespecial   #13  <Method void Object()>
				arg$1 = MainActivity.this;
			//    2    4:aload_0         
			//    3    5:aload_1         
			//    4    6:putfield        #15  <Field MainActivity arg$1>
			//    5    9:return          
			}
			}

			alreadyParticipatingBtn.setOnClickListener(.Lambda._cls2.lambdaFactory.(this));
	//   60  126:aload_0         
	//   61  127:getfield        #218 <Field TextView alreadyParticipatingBtn>
	//   62  130:aload_0         
	//   63  131:invokestatic    #221 <Method android.view.View$OnClickListener MainActivity$$Lambda$2.lambdaFactory$(MainActivity)>
	//   64  134:invokevirtual   #222 <Method void TextView.setOnClickListener(android.view.View$OnClickListener)>
			((TextView) (bundle)).setText(((CharSequence) (Res.getStudySpecificString(0x7f080375))));
	//   65  137:aload_1         
	//   66  138:ldc1            #223 <Int 0x7f080375>
	//   67  140:invokestatic    #191 <Method String Res.getStudySpecificString(int)>
	//   68  143:invokevirtual   #226 <Method void TextView.setText(CharSequence)>
			textview.setText(((CharSequence) (Res.getStudySpecificString(0x7f0802e7))));
	//   69  146:aload_2         
	//   70  147:ldc1            #227 <Int 0x7f0802e7>
	//   71  149:invokestatic    #191 <Method String Res.getStudySpecificString(int)>
	//   72  152:invokevirtual   #226 <Method void TextView.setText(CharSequence)>
			textview1.setText(((CharSequence) (Res.getStudySpecificString(0x7f0802e8))));
	//   73  155:aload_3         
	//   74  156:ldc1            #228 <Int 0x7f0802e8>
	//   75  158:invokestatic    #191 <Method String Res.getStudySpecificString(int)>
	//   76  161:invokevirtual   #226 <Method void TextView.setText(CharSequence)>
			joinStudyBtn.setText(((CharSequence) (Res.getStudySpecificString(0x7f080298))));
	//   77  164:aload_0         
	//   78  165:getfield        #205 <Field Button joinStudyBtn>
	//   79  168:ldc1            #229 <Int 0x7f080298>
	//   80  170:invokestatic    #191 <Method String Res.getStudySpecificString(int)>
	//   81  173:invokevirtual   #230 <Method void Button.setText(CharSequence)>
			alreadyParticipatingBtn.setText(((CharSequence) (Res.getStudySpecificString(0x7f0801bd))));
	//   82  176:aload_0         
	//   83  177:getfield        #218 <Field TextView alreadyParticipatingBtn>
	//   84  180:ldc1            #231 <Int 0x7f0801bd>
	//   85  182:invokestatic    #191 <Method String Res.getStudySpecificString(int)>
	//   86  185:invokevirtual   #226 <Method void TextView.setText(CharSequence)>
			viewFlipper = (ViewFlipper)findViewById(0x7f0e00d1);
	//   87  188:aload_0         
	//   88  189:aload_0         
	//   89  190:ldc1            #232 <Int 0x7f0e00d1>
	//   90  192:invokevirtual   #177 <Method View findViewById(int)>
	//   91  195:checkcast       #234 <Class ViewFlipper>
	//   92  198:putfield        #55  <Field ViewFlipper viewFlipper>
			currentScreenInstructions = (TextView)findViewById(0x7f0e00da);
	//   93  201:aload_0         
	//   94  202:aload_0         
	//   95  203:ldc1            #235 <Int 0x7f0e00da>
	//   96  205:invokevirtual   #177 <Method View findViewById(int)>
	//   97  208:checkcast       #198 <Class TextView>
	//   98  211:putfield        #59  <Field TextView currentScreenInstructions>
			aboutWebView = (WebView)findViewById(0x7f0e00d6);
	//   99  214:aload_0         
	//  100  215:aload_0         
	//  101  216:ldc1            #236 <Int 0x7f0e00d6>
	//  102  218:invokevirtual   #177 <Method View findViewById(int)>
	//  103  221:checkcast       #138 <Class WebView>
	//  104  224:putfield        #238 <Field WebView aboutWebView>
			howWebView = (WebView)findViewById(0x7f0e00d7);
	//  105  227:aload_0         
	//  106  228:aload_0         
	//  107  229:ldc1            #239 <Int 0x7f0e00d7>
	//  108  231:invokevirtual   #177 <Method View findViewById(int)>
	//  109  234:checkcast       #138 <Class WebView>
	//  110  237:putfield        #241 <Field WebView howWebView>
			whoWebView = (WebView)findViewById(0x7f0e00d8);
	//  111  240:aload_0         
	//  112  241:aload_0         
	//  113  242:ldc1            #242 <Int 0x7f0e00d8>
	//  114  244:invokevirtual   #177 <Method View findViewById(int)>
	//  115  247:checkcast       #138 <Class WebView>
	//  116  250:putfield        #244 <Field WebView whoWebView>
			helpWebView = (WebView)findViewById(0x7f0e00d9);
	//  117  253:aload_0         
	//  118  254:aload_0         
	//  119  255:ldc1            #245 <Int 0x7f0e00d9>
	//  120  257:invokevirtual   #177 <Method View findViewById(int)>
	//  121  260:checkcast       #138 <Class WebView>
	//  122  263:putfield        #247 <Field WebView helpWebView>
			indicator = (CircleIndicatorView)findViewById(0x7f0e00db);
	//  123  266:aload_0         
	//  124  267:aload_0         
	//  125  268:ldc1            #248 <Int 0x7f0e00db>
	//  126  270:invokevirtual   #177 <Method View findViewById(int)>
	//  127  273:checkcast       #250 <Class CircleIndicatorView>
	//  128  276:putfield        #63  <Field CircleIndicatorView indicator>
			currentScreenInstructions.setText(((CharSequence) (Res.getStudySpecificString(0x7f080343))));
	//  129  279:aload_0         
	//  130  280:getfield        #59  <Field TextView currentScreenInstructions>
	//  131  283:ldc1            #251 <Int 0x7f080343>
	//  132  285:invokestatic    #191 <Method String Res.getStudySpecificString(int)>
	//  133  288:invokevirtual   #226 <Method void TextView.setText(CharSequence)>
			bundle = ((Bundle) (new android.view.animation.Animation.AnimationListener() {

				public void onAnimationEnd(Animation animation)
				{
				//    0    0:return          
				}

				public void onAnimationRepeat(Animation animation)
				{
				//    0    0:return          
				}

				public void onAnimationStart(Animation animation)
				{
					int i = viewFlipper.getDisplayedChild();
				//    0    0:aload_0         
				//    1    1:getfield        #17  <Field MainActivity this$0>
				//    2    4:invokestatic    #29  <Method ViewFlipper MainActivity.access$000(MainActivity)>
				//    3    7:invokevirtual   #35  <Method int ViewFlipper.getDisplayedChild()>
				//    4   10:istore_2        
					if(i == 0)
				//*   5   11:iload_2         
				//*   6   12:ifne            54
					{
						currentScreenInstructions.setVisibility(0);
				//    7   15:aload_0         
				//    8   16:getfield        #17  <Field MainActivity this$0>
				//    9   19:invokestatic    #39  <Method TextView MainActivity.access$100(MainActivity)>
				//   10   22:iconst_0        
				//   11   23:invokevirtual   #45  <Method void TextView.setVisibility(int)>
						currentScreenInstructions.setText(((CharSequence) (Res.getStudySpecificString(0x7f080343))));
				//   12   26:aload_0         
				//   13   27:getfield        #17  <Field MainActivity this$0>
				//   14   30:invokestatic    #39  <Method TextView MainActivity.access$100(MainActivity)>
				//   15   33:ldc1            #46  <Int 0x7f080343>
				//   16   35:invokestatic    #52  <Method String Res.getStudySpecificString(int)>
				//   17   38:invokevirtual   #56  <Method void TextView.setText(CharSequence)>
						currentScreenInstructions.setTypeface(((android.graphics.Typeface) (null)), 0);
				//   18   41:aload_0         
				//   19   42:getfield        #17  <Field MainActivity this$0>
				//   20   45:invokestatic    #39  <Method TextView MainActivity.access$100(MainActivity)>
				//   21   48:aconst_null     
				//   22   49:iconst_0        
				//   23   50:invokevirtual   #60  <Method void TextView.setTypeface(android.graphics.Typeface, int)>
						return;
				//   24   53:return          
					}
					if(i == 4)
				//*  25   54:iload_2         
				//*  26   55:iconst_4        
				//*  27   56:icmpne          113
					{
						currentScreenInstructions.setVisibility(0);
				//   28   59:aload_0         
				//   29   60:getfield        #17  <Field MainActivity this$0>
				//   30   63:invokestatic    #39  <Method TextView MainActivity.access$100(MainActivity)>
				//   31   66:iconst_0        
				//   32   67:invokevirtual   #45  <Method void TextView.setVisibility(int)>
						currentScreenInstructions.setTypeface(((android.graphics.Typeface) (null)), 2);
				//   33   70:aload_0         
				//   34   71:getfield        #17  <Field MainActivity this$0>
				//   35   74:invokestatic    #39  <Method TextView MainActivity.access$100(MainActivity)>
				//   36   77:aconst_null     
				//   37   78:iconst_2        
				//   38   79:invokevirtual   #60  <Method void TextView.setTypeface(android.graphics.Typeface, int)>
						animation = ((Animation) (Res.getStudySpecificString(0x7f08002a)));
				//   39   82:ldc1            #61  <Int 0x7f08002a>
				//   40   84:invokestatic    #52  <Method String Res.getStudySpecificString(int)>
				//   41   87:astore_1        
						currentScreenInstructions.setText(((CharSequence) (String.format(((String) (animation)), new Object[] {
							VersionUtils.getVersionName()
						}))));
				//   42   88:aload_0         
				//   43   89:getfield        #17  <Field MainActivity this$0>
				//   44   92:invokestatic    #39  <Method TextView MainActivity.access$100(MainActivity)>
				//   45   95:aload_1         
				//   46   96:iconst_1        
				//   47   97:anewarray       Object[]
				//   48  100:dup             
				//   49  101:iconst_0        
				//   50  102:invokestatic    #67  <Method String VersionUtils.getVersionName()>
				//   51  105:aastore         
				//   52  106:invokestatic    #73  <Method String String.format(String, Object[])>
				//   53  109:invokevirtual   #56  <Method void TextView.setText(CharSequence)>
						return;
				//   54  112:return          
					} else
					{
						currentScreenInstructions.setVisibility(8);
				//   55  113:aload_0         
				//   56  114:getfield        #17  <Field MainActivity this$0>
				//   57  117:invokestatic    #39  <Method TextView MainActivity.access$100(MainActivity)>
				//   58  120:bipush          8
				//   59  122:invokevirtual   #45  <Method void TextView.setVisibility(int)>
						return;
				//   60  125:return          
					}
				}

				final MainActivity this$0;

			
			{
				this$0 = MainActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field MainActivity this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
			}
));
	//  134  291:new             #6   <Class MainActivity$1>
	//  135  294:dup             
	//  136  295:aload_0         
	//  137  296:invokespecial   #254 <Method void MainActivity$1(MainActivity)>
	//  138  299:astore_1        
			viewFlipperGestureDetector = new GestureDetector(((Context) (this)), new android.view.GestureDetector.OnGestureListener() {

				public boolean onDown(MotionEvent motionevent)
				{
					return false;
				//    0    0:iconst_0        
				//    1    1:ireturn         
				}

				public boolean onFling(MotionEvent motionevent, MotionEvent motionevent1, float f, float f1)
				{
					f1 = motionevent.getX() - motionevent1.getX();
				//    0    0:aload_1         
				//    1    1:invokevirtual   #39  <Method float MotionEvent.getX()>
				//    2    4:aload_2         
				//    3    5:invokevirtual   #39  <Method float MotionEvent.getX()>
				//    4    8:fsub            
				//    5    9:fstore          4
					f = Math.abs(f / (float)scaledMaximumFlingVelocity);
				//    6   11:fload_3         
				//    7   12:aload_0         
				//    8   13:getfield        #23  <Field int val$scaledMaximumFlingVelocity>
				//    9   16:i2f             
				//   10   17:fdiv            
				//   11   18:invokestatic    #45  <Method float Math.abs(float)>
				//   12   21:fstore_3        
					if(f1 < -30F && f > 0.14F)
				//*  13   22:fload           4
				//*  14   24:ldc1            #46  <Float -30F>
				//*  15   26:fcmpg           
				//*  16   27:ifge            121
				//*  17   30:fload_3         
				//*  18   31:ldc1            #47  <Float 0.14F>
				//*  19   33:fcmpl           
				//*  20   34:ifle            121
					{
						if(viewFlipper.getDisplayedChild() > 0)
				//*  21   37:aload_0         
				//*  22   38:getfield        #21  <Field MainActivity this$0>
				//*  23   41:invokestatic    #51  <Method ViewFlipper MainActivity.access$000(MainActivity)>
				//*  24   44:invokevirtual   #57  <Method int ViewFlipper.getDisplayedChild()>
				//*  25   47:ifle            119
						{
							viewFlipper.setInAnimation(((Context) (MainActivity.this)), 0x7f050012);
				//   26   50:aload_0         
				//   27   51:getfield        #21  <Field MainActivity this$0>
				//   28   54:invokestatic    #51  <Method ViewFlipper MainActivity.access$000(MainActivity)>
				//   29   57:aload_0         
				//   30   58:getfield        #21  <Field MainActivity this$0>
				//   31   61:ldc1            #58  <Int 0x7f050012>
				//   32   63:invokevirtual   #62  <Method void ViewFlipper.setInAnimation(Context, int)>
							viewFlipper.setOutAnimation(((Context) (MainActivity.this)), 0x7f050017);
				//   33   66:aload_0         
				//   34   67:getfield        #21  <Field MainActivity this$0>
				//   35   70:invokestatic    #51  <Method ViewFlipper MainActivity.access$000(MainActivity)>
				//   36   73:aload_0         
				//   37   74:getfield        #21  <Field MainActivity this$0>
				//   38   77:ldc1            #63  <Int 0x7f050017>
				//   39   79:invokevirtual   #66  <Method void ViewFlipper.setOutAnimation(Context, int)>
							viewFlipper.getInAnimation().setAnimationListener(onFlipperAnimationsEvents);
				//   40   82:aload_0         
				//   41   83:getfield        #21  <Field MainActivity this$0>
				//   42   86:invokestatic    #51  <Method ViewFlipper MainActivity.access$000(MainActivity)>
				//   43   89:invokevirtual   #70  <Method Animation ViewFlipper.getInAnimation()>
				//   44   92:aload_0         
				//   45   93:getfield        #25  <Field android.view.animation.Animation$AnimationListener val$onFlipperAnimationsEvents>
				//   46   96:invokevirtual   #76  <Method void Animation.setAnimationListener(android.view.animation.Animation$AnimationListener)>
							viewFlipper.showPrevious();
				//   47   99:aload_0         
				//   48  100:getfield        #21  <Field MainActivity this$0>
				//   49  103:invokestatic    #51  <Method ViewFlipper MainActivity.access$000(MainActivity)>
				//   50  106:invokevirtual   #79  <Method void ViewFlipper.showPrevious()>
							indicator.showPrevious();
				//   51  109:aload_0         
				//   52  110:getfield        #21  <Field MainActivity this$0>
				//   53  113:invokestatic    #83  <Method CircleIndicatorView MainActivity.access$200(MainActivity)>
				//   54  116:invokevirtual   #86  <Method void CircleIndicatorView.showPrevious()>
						}
					} else
				//*  55  119:iconst_1        
				//*  56  120:ireturn         
					if(f1 > 30F && f > 0.14F)
				//*  57  121:fload           4
				//*  58  123:ldc1            #87  <Float 30F>
				//*  59  125:fcmpl           
				//*  60  126:ifle            232
				//*  61  129:fload_3         
				//*  62  130:ldc1            #47  <Float 0.14F>
				//*  63  132:fcmpl           
				//*  64  133:ifle            232
					{
						if(viewFlipper.getDisplayedChild() < viewFlipper.getChildCount() - 1)
				//*  65  136:aload_0         
				//*  66  137:getfield        #21  <Field MainActivity this$0>
				//*  67  140:invokestatic    #51  <Method ViewFlipper MainActivity.access$000(MainActivity)>
				//*  68  143:invokevirtual   #57  <Method int ViewFlipper.getDisplayedChild()>
				//*  69  146:aload_0         
				//*  70  147:getfield        #21  <Field MainActivity this$0>
				//*  71  150:invokestatic    #51  <Method ViewFlipper MainActivity.access$000(MainActivity)>
				//*  72  153:invokevirtual   #90  <Method int ViewFlipper.getChildCount()>
				//*  73  156:iconst_1        
				//*  74  157:isub            
				//*  75  158:icmpge          119
						{
							viewFlipper.setInAnimation(((Context) (MainActivity.this)), 0x7f050013);
				//   76  161:aload_0         
				//   77  162:getfield        #21  <Field MainActivity this$0>
				//   78  165:invokestatic    #51  <Method ViewFlipper MainActivity.access$000(MainActivity)>
				//   79  168:aload_0         
				//   80  169:getfield        #21  <Field MainActivity this$0>
				//   81  172:ldc1            #91  <Int 0x7f050013>
				//   82  174:invokevirtual   #62  <Method void ViewFlipper.setInAnimation(Context, int)>
							viewFlipper.setOutAnimation(((Context) (MainActivity.this)), 0x7f050016);
				//   83  177:aload_0         
				//   84  178:getfield        #21  <Field MainActivity this$0>
				//   85  181:invokestatic    #51  <Method ViewFlipper MainActivity.access$000(MainActivity)>
				//   86  184:aload_0         
				//   87  185:getfield        #21  <Field MainActivity this$0>
				//   88  188:ldc1            #92  <Int 0x7f050016>
				//   89  190:invokevirtual   #66  <Method void ViewFlipper.setOutAnimation(Context, int)>
							viewFlipper.getInAnimation().setAnimationListener(onFlipperAnimationsEvents);
				//   90  193:aload_0         
				//   91  194:getfield        #21  <Field MainActivity this$0>
				//   92  197:invokestatic    #51  <Method ViewFlipper MainActivity.access$000(MainActivity)>
				//   93  200:invokevirtual   #70  <Method Animation ViewFlipper.getInAnimation()>
				//   94  203:aload_0         
				//   95  204:getfield        #25  <Field android.view.animation.Animation$AnimationListener val$onFlipperAnimationsEvents>
				//   96  207:invokevirtual   #76  <Method void Animation.setAnimationListener(android.view.animation.Animation$AnimationListener)>
							viewFlipper.showNext();
				//   97  210:aload_0         
				//   98  211:getfield        #21  <Field MainActivity this$0>
				//   99  214:invokestatic    #51  <Method ViewFlipper MainActivity.access$000(MainActivity)>
				//  100  217:invokevirtual   #95  <Method void ViewFlipper.showNext()>
							indicator.showNext();
				//  101  220:aload_0         
				//  102  221:getfield        #21  <Field MainActivity this$0>
				//  103  224:invokestatic    #83  <Method CircleIndicatorView MainActivity.access$200(MainActivity)>
				//  104  227:invokevirtual   #96  <Method void CircleIndicatorView.showNext()>
							return true;
				//  105  230:iconst_1        
				//  106  231:ireturn         
						}
					} else
					{
						return false;
				//  107  232:iconst_0        
				//  108  233:ireturn         
					}
					return true;
				}

				public void onLongPress(MotionEvent motionevent)
				{
				//    0    0:return          
				}

				public boolean onScroll(MotionEvent motionevent, MotionEvent motionevent1, float f, float f1)
				{
					return false;
				//    0    0:iconst_0        
				//    1    1:ireturn         
				}

				public void onShowPress(MotionEvent motionevent)
				{
				//    0    0:return          
				}

				public boolean onSingleTapUp(MotionEvent motionevent)
				{
					return false;
				//    0    0:iconst_0        
				//    1    1:ireturn         
				}

				final MainActivity this$0;
				final android.view.animation.Animation.AnimationListener val$onFlipperAnimationsEvents;
				final int val$scaledMaximumFlingVelocity;

			
			{
				this$0 = MainActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #21  <Field MainActivity this$0>
				scaledMaximumFlingVelocity = i;
			//    3    5:aload_0         
			//    4    6:iload_2         
			//    5    7:putfield        #23  <Field int val$scaledMaximumFlingVelocity>
				onFlipperAnimationsEvents = animationlistener;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #25  <Field android.view.animation.Animation$AnimationListener val$onFlipperAnimationsEvents>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #28  <Method void Object()>
			//   11   19:return          
			}
			}
);
	//  139  300:aload_0         
	//  140  301:new             #158 <Class GestureDetector>
	//  141  304:dup             
	//  142  305:aload_0         
	//  143  306:new             #8   <Class MainActivity$2>
	//  144  309:dup             
	//  145  310:aload_0         
	//  146  311:aload_0         
	//  147  312:invokestatic    #260 <Method ViewConfiguration ViewConfiguration.get(Context)>
	//  148  315:invokevirtual   #264 <Method int ViewConfiguration.getScaledMaximumFlingVelocity()>
	//  149  318:aload_1         
	//  150  319:invokespecial   #267 <Method void MainActivity$2(MainActivity, int, android.view.animation.Animation$AnimationListener)>
	//  151  322:invokespecial   #270 <Method void GestureDetector(Context, android.view.GestureDetector$OnGestureListener)>
	//  152  325:putfield        #67  <Field GestureDetector viewFlipperGestureDetector>
			viewFlipper.setOnTouchListener(new android.view.View.OnTouchListener() {

				public boolean onTouch(View view, MotionEvent motionevent)
				{
					viewFlipperGestureDetector.onTouchEvent(motionevent);
				//    0    0:aload_0         
				//    1    1:getfield        #17  <Field MainActivity this$0>
				//    2    4:invokestatic    #27  <Method GestureDetector MainActivity.access$300(MainActivity)>
				//    3    7:aload_2         
				//    4    8:invokevirtual   #33  <Method boolean GestureDetector.onTouchEvent(MotionEvent)>
				//    5   11:pop             
					return true;
				//    6   12:iconst_1        
				//    7   13:ireturn         
				}

				final MainActivity this$0;

			
			{
				this$0 = MainActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field MainActivity this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//  153  328:aload_0         
	//  154  329:getfield        #55  <Field ViewFlipper viewFlipper>
	//  155  332:new             #10  <Class MainActivity$3>
	//  156  335:dup             
	//  157  336:aload_0         
	//  158  337:invokespecial   #271 <Method void MainActivity$3(MainActivity)>
	//  159  340:invokevirtual   #275 <Method void ViewFlipper.setOnTouchListener(android.view.View$OnTouchListener)>
			loadHtmlContent(aboutWebView, Res.getStudySpecificRawAsString(0x7f070016));
	//  160  343:aload_0         
	//  161  344:aload_0         
	//  162  345:getfield        #238 <Field WebView aboutWebView>
	//  163  348:ldc2            #276 <Int 0x7f070016>
	//  164  351:invokestatic    #279 <Method String Res.getStudySpecificRawAsString(int)>
	//  165  354:invokespecial   #281 <Method void loadHtmlContent(WebView, String)>
			loadHtmlContent(howWebView, Res.getStudySpecificRawAsString(0x7f070018));
	//  166  357:aload_0         
	//  167  358:aload_0         
	//  168  359:getfield        #241 <Field WebView howWebView>
	//  169  362:ldc2            #282 <Int 0x7f070018>
	//  170  365:invokestatic    #279 <Method String Res.getStudySpecificRawAsString(int)>
	//  171  368:invokespecial   #281 <Method void loadHtmlContent(WebView, String)>
			loadHtmlContent(whoWebView, Res.getStudySpecificRawAsString(0x7f07001a));
	//  172  371:aload_0         
	//  173  372:aload_0         
	//  174  373:getfield        #244 <Field WebView whoWebView>
	//  175  376:ldc2            #283 <Int 0x7f07001a>
	//  176  379:invokestatic    #279 <Method String Res.getStudySpecificRawAsString(int)>
	//  177  382:invokespecial   #281 <Method void loadHtmlContent(WebView, String)>
			loadHtmlContent(helpWebView, Res.getStudySpecificRawAsString(0x7f070017));
	//  178  385:aload_0         
	//  179  386:aload_0         
	//  180  387:getfield        #247 <Field WebView helpWebView>
	//  181  390:ldc2            #284 <Int 0x7f070017>
	//  182  393:invokestatic    #279 <Method String Res.getStudySpecificRawAsString(int)>
	//  183  396:invokespecial   #281 <Method void loadHtmlContent(WebView, String)>
			return;
	//  184  399:return          
		}
	}

	private WebView aboutWebView;
	private TextView alreadyParticipatingBtn;
	private TextView currentScreenInstructions;
	private WebView helpWebView;
	private WebView howWebView;
	private CircleIndicatorView indicator;
	private Button joinStudyBtn;
	private Toolbar toolbar;
	private ViewFlipper viewFlipper;
	private GestureDetector viewFlipperGestureDetector;
	private WebView whoWebView;


/*
	static ViewFlipper access$000(MainActivity mainactivity)
	{
		return mainactivity.viewFlipper;
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field ViewFlipper viewFlipper>
	//    2    4:areturn         
	}

*/


/*
	static TextView access$100(MainActivity mainactivity)
	{
		return mainactivity.currentScreenInstructions;
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field TextView currentScreenInstructions>
	//    2    4:areturn         
	}

*/


/*
	static CircleIndicatorView access$200(MainActivity mainactivity)
	{
		return mainactivity.indicator;
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field CircleIndicatorView indicator>
	//    2    4:areturn         
	}

*/


/*
	static GestureDetector access$300(MainActivity mainactivity)
	{
		return mainactivity.viewFlipperGestureDetector;
	//    0    0:aload_0         
	//    1    1:getfield        #67  <Field GestureDetector viewFlipperGestureDetector>
	//    2    4:areturn         
	}

*/
}
