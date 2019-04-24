// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.pactforcure.app.ui;

import android.content.Context;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import com.pactforcure.app.databinding.ActivitySelectStudyBinding;
import com.pactforcure.app.studies.Res;
import com.pactforcure.app.studies.StudyId;
import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

// Referenced classes of package com.pactforcure.app.ui:
//			NotEligibleActivity, MainActivity

public class SelectStudyActivity extends AppCompatActivity
{

	public SelectStudyActivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void AppCompatActivity()>
	//    2    4:return          
	}

	static void lambda$onCreate$33(SelectStudyActivity selectstudyactivity, View view)
	{
		selectstudyactivity.selectStudy(StudyId.US);
	//    0    0:aload_0         
	//    1    1:getstatic       #19  <Field StudyId StudyId.US>
	//    2    4:invokespecial   #23  <Method void selectStudy(StudyId)>
	//    3    7:return          
	}

	static void lambda$onCreate$34(SelectStudyActivity selectstudyactivity, View view)
	{
		selectstudyactivity.selectStudy(StudyId.AU);
	//    0    0:aload_0         
	//    1    1:getstatic       #27  <Field StudyId StudyId.AU>
	//    2    4:invokespecial   #23  <Method void selectStudy(StudyId)>
	//    3    7:return          
	}

	static void lambda$onCreate$35(SelectStudyActivity selectstudyactivity, View view)
	{
		selectstudyactivity.selectStudy(((StudyId) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokespecial   #23  <Method void selectStudy(StudyId)>
	//    3    5:return          
	}

	private void selectStudy(StudyId studyid)
	{
		if(studyid == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       19
		{
			startActivity(new Intent(((Context) (this)), com/pactforcure/app/ui/NotEligibleActivity));
	//    2    4:aload_0         
	//    3    5:new             #30  <Class Intent>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:ldc1            #32  <Class NotEligibleActivity>
	//    7   12:invokespecial   #35  <Method void Intent(Context, Class)>
	//    8   15:invokevirtual   #39  <Method void startActivity(Intent)>
			return;
	//    9   18:return          
		} else
		{
			Res.setAndSaveStudyId(studyid);
	//   10   19:aload_1         
	//   11   20:invokestatic    #44  <Method void Res.setAndSaveStudyId(StudyId)>
			startActivity(new Intent(((Context) (this)), com/pactforcure/app/ui/MainActivity));
	//   12   23:aload_0         
	//   13   24:new             #30  <Class Intent>
	//   14   27:dup             
	//   15   28:aload_0         
	//   16   29:ldc1            #46  <Class MainActivity>
	//   17   31:invokespecial   #35  <Method void Intent(Context, Class)>
	//   18   34:invokevirtual   #39  <Method void startActivity(Intent)>
			finish();
	//   19   37:aload_0         
	//   20   38:invokevirtual   #49  <Method void finish()>
			return;
	//   21   41:return          
		}
	}

	protected void attachBaseContext(Context context)
	{
		super.attachBaseContext(((Context) (CalligraphyContextWrapper.wrap(context))));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #57  <Method android.content.ContextWrapper CalligraphyContextWrapper.wrap(Context)>
	//    3    5:invokespecial   #59  <Method void AppCompatActivity.attachBaseContext(Context)>
	//    4    8:return          
	}

	protected void onCreate(Bundle bundle)
	{
		super.onCreate(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #64  <Method void AppCompatActivity.onCreate(Bundle)>
		binding = (ActivitySelectStudyBinding)DataBindingUtil.setContentView(((android.app.Activity) (this)), 0x7f04002b);
	//    3    5:aload_0         
	//    4    6:aload_0         
	//    5    7:ldc1            #65  <Int 0x7f04002b>
	//    6    9:invokestatic    #71  <Method android.databinding.ViewDataBinding DataBindingUtil.setContentView(android.app.Activity, int)>
	//    7   12:checkcast       #73  <Class ActivitySelectStudyBinding>
	//    8   15:putfield        #75  <Field ActivitySelectStudyBinding binding>
		class .Lambda._cls1
			implements android.view.View.OnClickListener
		{

			public static android.view.View.OnClickListener lambdaFactory$(SelectStudyActivity selectstudyactivity)
			{
				return ((android.view.View.OnClickListener) (((.Lambda._cls1) (selectstudyactivity)). new .Lambda._cls1()));
			//    0    0:new             #2   <Class SelectStudyActivity$$Lambda$1>
			//    1    3:dup             
			//    2    4:aload_0         
			//    3    5:invokespecial   #20  <Method void SelectStudyActivity$$Lambda$1(SelectStudyActivity)>
			//    4    8:areturn         
			}

			public void onClick(View view)
			{
				SelectStudyActivity.lambda$onCreate$33(arg$1, view);
			//    0    0:aload_0         
			//    1    1:getfield        #15  <Field SelectStudyActivity arg$1>
			//    2    4:aload_1         
			//    3    5:invokestatic    #28  <Method void SelectStudyActivity.lambda$onCreate$33(SelectStudyActivity, View)>
			//    4    8:return          
			}

			private final SelectStudyActivity arg$1;

			private .Lambda._cls1()
			{
			//    0    0:aload_0         
			//    1    1:invokespecial   #13  <Method void Object()>
				arg$1 = SelectStudyActivity.this;
			//    2    4:aload_0         
			//    3    5:aload_1         
			//    4    6:putfield        #15  <Field SelectStudyActivity arg$1>
			//    5    9:return          
			}
		}

		binding.usBtn.setOnClickListener(.Lambda._cls1.lambdaFactory.(this));
	//    9   18:aload_0         
	//   10   19:getfield        #75  <Field ActivitySelectStudyBinding binding>
	//   11   22:getfield        #79  <Field TextView ActivitySelectStudyBinding.usBtn>
	//   12   25:aload_0         
	//   13   26:invokestatic    #85  <Method android.view.View$OnClickListener SelectStudyActivity$$Lambda$1.lambdaFactory$(SelectStudyActivity)>
	//   14   29:invokevirtual   #91  <Method void TextView.setOnClickListener(android.view.View$OnClickListener)>
		class .Lambda._cls2
			implements android.view.View.OnClickListener
		{

			public static android.view.View.OnClickListener lambdaFactory$(SelectStudyActivity selectstudyactivity)
			{
				return ((android.view.View.OnClickListener) (((.Lambda._cls2) (selectstudyactivity)). new .Lambda._cls2()));
			//    0    0:new             #2   <Class SelectStudyActivity$$Lambda$2>
			//    1    3:dup             
			//    2    4:aload_0         
			//    3    5:invokespecial   #20  <Method void SelectStudyActivity$$Lambda$2(SelectStudyActivity)>
			//    4    8:areturn         
			}

			public void onClick(View view)
			{
				SelectStudyActivity.lambda$onCreate$34(arg$1, view);
			//    0    0:aload_0         
			//    1    1:getfield        #15  <Field SelectStudyActivity arg$1>
			//    2    4:aload_1         
			//    3    5:invokestatic    #28  <Method void SelectStudyActivity.lambda$onCreate$34(SelectStudyActivity, View)>
			//    4    8:return          
			}

			private final SelectStudyActivity arg$1;

			private .Lambda._cls2()
			{
			//    0    0:aload_0         
			//    1    1:invokespecial   #13  <Method void Object()>
				arg$1 = SelectStudyActivity.this;
			//    2    4:aload_0         
			//    3    5:aload_1         
			//    4    6:putfield        #15  <Field SelectStudyActivity arg$1>
			//    5    9:return          
			}
		}

		binding.auBtn.setOnClickListener(.Lambda._cls2.lambdaFactory.(this));
	//   15   32:aload_0         
	//   16   33:getfield        #75  <Field ActivitySelectStudyBinding binding>
	//   17   36:getfield        #94  <Field TextView ActivitySelectStudyBinding.auBtn>
	//   18   39:aload_0         
	//   19   40:invokestatic    #97  <Method android.view.View$OnClickListener SelectStudyActivity$$Lambda$2.lambdaFactory$(SelectStudyActivity)>
	//   20   43:invokevirtual   #91  <Method void TextView.setOnClickListener(android.view.View$OnClickListener)>
		class .Lambda._cls3
			implements android.view.View.OnClickListener
		{

			public static android.view.View.OnClickListener lambdaFactory$(SelectStudyActivity selectstudyactivity)
			{
				return ((android.view.View.OnClickListener) (((.Lambda._cls3) (selectstudyactivity)). new .Lambda._cls3()));
			//    0    0:new             #2   <Class SelectStudyActivity$$Lambda$3>
			//    1    3:dup             
			//    2    4:aload_0         
			//    3    5:invokespecial   #20  <Method void SelectStudyActivity$$Lambda$3(SelectStudyActivity)>
			//    4    8:areturn         
			}

			public void onClick(View view)
			{
				SelectStudyActivity.lambda$onCreate$35(arg$1, view);
			//    0    0:aload_0         
			//    1    1:getfield        #15  <Field SelectStudyActivity arg$1>
			//    2    4:aload_1         
			//    3    5:invokestatic    #28  <Method void SelectStudyActivity.lambda$onCreate$35(SelectStudyActivity, View)>
			//    4    8:return          
			}

			private final SelectStudyActivity arg$1;

			private .Lambda._cls3()
			{
			//    0    0:aload_0         
			//    1    1:invokespecial   #13  <Method void Object()>
				arg$1 = SelectStudyActivity.this;
			//    2    4:aload_0         
			//    3    5:aload_1         
			//    4    6:putfield        #15  <Field SelectStudyActivity arg$1>
			//    5    9:return          
			}
		}

		binding.otherBtn.setOnClickListener(.Lambda._cls3.lambdaFactory.(this));
	//   21   46:aload_0         
	//   22   47:getfield        #75  <Field ActivitySelectStudyBinding binding>
	//   23   50:getfield        #100 <Field TextView ActivitySelectStudyBinding.otherBtn>
	//   24   53:aload_0         
	//   25   54:invokestatic    #103 <Method android.view.View$OnClickListener SelectStudyActivity$$Lambda$3.lambdaFactory$(SelectStudyActivity)>
	//   26   57:invokevirtual   #91  <Method void TextView.setOnClickListener(android.view.View$OnClickListener)>
	//   27   60:return          
	}

	private ActivitySelectStudyBinding binding;
}
