// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.pactforcure.app.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.SpannableString;
import android.text.style.UnderlineSpan;
import android.view.View;
import android.widget.TextView;
import com.birbit.android.jobqueue.JobManager;
import com.pactforcure.app.api.DnaKitToggleJob;
import com.pactforcure.app.core.BackboneApplication;
import com.pactforcure.app.studies.Res;
import com.pactforcure.app.survey.PpdResultsStorage;

public class DnaCollectionActivity extends AppCompatActivity
{

	public DnaCollectionActivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void AppCompatActivity()>
	//    2    4:return          
	}

	static void lambda$onCreate$12(DnaCollectionActivity dnacollectionactivity, View view)
	{
		PpdResultsStorage.setSentDnaKitBack(Res.getStudyId(), true);
	//    0    0:invokestatic    #19  <Method com.pactforcure.app.studies.StudyId Res.getStudyId()>
	//    1    3:iconst_1        
	//    2    4:invokestatic    #25  <Method void PpdResultsStorage.setSentDnaKitBack(com.pactforcure.app.studies.StudyId, boolean)>
		BackboneApplication.get().getJobManager().addJobInBackground(((com.birbit.android.jobqueue.Job) (new DnaKitToggleJob())));
	//    3    7:invokestatic    #31  <Method BackboneApplication BackboneApplication.get()>
	//    4   10:invokevirtual   #35  <Method JobManager BackboneApplication.getJobManager()>
	//    5   13:new             #37  <Class DnaKitToggleJob>
	//    6   16:dup             
	//    7   17:invokespecial   #38  <Method void DnaKitToggleJob()>
	//    8   20:invokevirtual   #44  <Method void JobManager.addJobInBackground(com.birbit.android.jobqueue.Job)>
		dnacollectionactivity.finish();
	//    9   23:aload_0         
	//   10   24:invokevirtual   #47  <Method void finish()>
	//   11   27:return          
	}

	static void lambda$onCreate$13(DnaCollectionActivity dnacollectionactivity, View view)
	{
		dnacollectionactivity.finish();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #47  <Method void finish()>
	//    2    4:return          
	}

	protected void onCreate(Bundle bundle)
	{
		super.onCreate(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #53  <Method void AppCompatActivity.onCreate(Bundle)>
		setContentView(0x7f04001f);
	//    3    5:aload_0         
	//    4    6:ldc1            #54  <Int 0x7f04001f>
	//    5    8:invokevirtual   #58  <Method void setContentView(int)>
		toolbar = (Toolbar)findViewById(0x7f0e00af);
	//    6   11:aload_0         
	//    7   12:aload_0         
	//    8   13:ldc1            #59  <Int 0x7f0e00af>
	//    9   15:invokevirtual   #63  <Method View findViewById(int)>
	//   10   18:checkcast       #65  <Class Toolbar>
	//   11   21:putfield        #67  <Field Toolbar toolbar>
		setSupportActionBar(toolbar);
	//   12   24:aload_0         
	//   13   25:aload_0         
	//   14   26:getfield        #67  <Field Toolbar toolbar>
	//   15   29:invokevirtual   #71  <Method void setSupportActionBar(Toolbar)>
		setTitle(((CharSequence) (Res.getStudySpecificString(0x7f080211))));
	//   16   32:aload_0         
	//   17   33:ldc1            #72  <Int 0x7f080211>
	//   18   35:invokestatic    #76  <Method String Res.getStudySpecificString(int)>
	//   19   38:invokevirtual   #80  <Method void setTitle(CharSequence)>
		Object obj = ((Object) ((TextView)findViewById(0x7f0e00b8)));
	//   20   41:aload_0         
	//   21   42:ldc1            #81  <Int 0x7f0e00b8>
	//   22   44:invokevirtual   #63  <Method View findViewById(int)>
	//   23   47:checkcast       #83  <Class TextView>
	//   24   50:astore_2        
		TextView textview = (TextView)findViewById(0x7f0e00b9);
	//   25   51:aload_0         
	//   26   52:ldc1            #84  <Int 0x7f0e00b9>
	//   27   54:invokevirtual   #63  <Method View findViewById(int)>
	//   28   57:checkcast       #83  <Class TextView>
	//   29   60:astore_3        
		TextView textview1 = (TextView)findViewById(0x7f0e00ba);
	//   30   61:aload_0         
	//   31   62:ldc1            #85  <Int 0x7f0e00ba>
	//   32   64:invokevirtual   #63  <Method View findViewById(int)>
	//   33   67:checkcast       #83  <Class TextView>
	//   34   70:astore          4
		TextView textview2 = (TextView)findViewById(0x7f0e00bb);
	//   35   72:aload_0         
	//   36   73:ldc1            #86  <Int 0x7f0e00bb>
	//   37   75:invokevirtual   #63  <Method View findViewById(int)>
	//   38   78:checkcast       #83  <Class TextView>
	//   39   81:astore          5
		TextView textview3 = (TextView)findViewById(0x7f0e00bc);
	//   40   83:aload_0         
	//   41   84:ldc1            #87  <Int 0x7f0e00bc>
	//   42   86:invokevirtual   #63  <Method View findViewById(int)>
	//   43   89:checkcast       #83  <Class TextView>
	//   44   92:astore          6
		TextView textview4 = (TextView)findViewById(0x7f0e00bd);
	//   45   94:aload_0         
	//   46   95:ldc1            #88  <Int 0x7f0e00bd>
	//   47   97:invokevirtual   #63  <Method View findViewById(int)>
	//   48  100:checkcast       #83  <Class TextView>
	//   49  103:astore          7
		bundle = ((Bundle) ((TextView)findViewById(0x7f0e00be)));
	//   50  105:aload_0         
	//   51  106:ldc1            #89  <Int 0x7f0e00be>
	//   52  108:invokevirtual   #63  <Method View findViewById(int)>
	//   53  111:checkcast       #83  <Class TextView>
	//   54  114:astore_1        
		((TextView) (obj)).setText(((CharSequence) (Res.getStudySpecificString(0x7f080344))));
	//   55  115:aload_2         
	//   56  116:ldc1            #90  <Int 0x7f080344>
	//   57  118:invokestatic    #76  <Method String Res.getStudySpecificString(int)>
	//   58  121:invokevirtual   #93  <Method void TextView.setText(CharSequence)>
		textview.setText(((CharSequence) (Res.getStudySpecificString(0x7f080374))));
	//   59  124:aload_3         
	//   60  125:ldc1            #94  <Int 0x7f080374>
	//   61  127:invokestatic    #76  <Method String Res.getStudySpecificString(int)>
	//   62  130:invokevirtual   #93  <Method void TextView.setText(CharSequence)>
		textview1.setText(((CharSequence) (Res.getStudySpecificString(0x7f080209))));
	//   63  133:aload           4
	//   64  135:ldc1            #95  <Int 0x7f080209>
	//   65  137:invokestatic    #76  <Method String Res.getStudySpecificString(int)>
	//   66  140:invokevirtual   #93  <Method void TextView.setText(CharSequence)>
		textview2.setText(((CharSequence) (Res.getStudySpecificString(0x7f080332))));
	//   67  143:aload           5
	//   68  145:ldc1            #96  <Int 0x7f080332>
	//   69  147:invokestatic    #76  <Method String Res.getStudySpecificString(int)>
	//   70  150:invokevirtual   #93  <Method void TextView.setText(CharSequence)>
		textview3.setText(((CharSequence) (Res.getStudySpecificString(0x7f08028f))));
	//   71  153:aload           6
	//   72  155:ldc1            #97  <Int 0x7f08028f>
	//   73  157:invokestatic    #76  <Method String Res.getStudySpecificString(int)>
	//   74  160:invokevirtual   #93  <Method void TextView.setText(CharSequence)>
		textview4.setText(((CharSequence) (Res.getRegularString(0x7f080079))));
	//   75  163:aload           7
	//   76  165:ldc1            #98  <Int 0x7f080079>
	//   77  167:invokestatic    #101 <Method String Res.getRegularString(int)>
	//   78  170:invokevirtual   #93  <Method void TextView.setText(CharSequence)>
		((TextView) (bundle)).setText(((CharSequence) (Res.getStudySpecificString(0x7f0802b0))));
	//   79  173:aload_1         
	//   80  174:ldc1            #102 <Int 0x7f0802b0>
	//   81  176:invokestatic    #76  <Method String Res.getStudySpecificString(int)>
	//   82  179:invokevirtual   #93  <Method void TextView.setText(CharSequence)>
		class .Lambda._cls1
			implements android.view.View.OnClickListener
		{

			public static android.view.View.OnClickListener lambdaFactory$(DnaCollectionActivity dnacollectionactivity)
			{
				return ((android.view.View.OnClickListener) (((.Lambda._cls1) (dnacollectionactivity)). new .Lambda._cls1()));
			//    0    0:new             #2   <Class DnaCollectionActivity$$Lambda$1>
			//    1    3:dup             
			//    2    4:aload_0         
			//    3    5:invokespecial   #20  <Method void DnaCollectionActivity$$Lambda$1(DnaCollectionActivity)>
			//    4    8:areturn         
			}

			public void onClick(View view)
			{
				DnaCollectionActivity.lambda$onCreate$12(arg$1, view);
			//    0    0:aload_0         
			//    1    1:getfield        #15  <Field DnaCollectionActivity arg$1>
			//    2    4:aload_1         
			//    3    5:invokestatic    #28  <Method void DnaCollectionActivity.lambda$onCreate$12(DnaCollectionActivity, View)>
			//    4    8:return          
			}

			private final DnaCollectionActivity arg$1;

			private .Lambda._cls1()
			{
			//    0    0:aload_0         
			//    1    1:invokespecial   #13  <Method void Object()>
				arg$1 = DnaCollectionActivity.this;
			//    2    4:aload_0         
			//    3    5:aload_1         
			//    4    6:putfield        #15  <Field DnaCollectionActivity arg$1>
			//    5    9:return          
			}
		}

		textview4.setOnClickListener(.Lambda._cls1.lambdaFactory.(this));
	//   83  182:aload           7
	//   84  184:aload_0         
	//   85  185:invokestatic    #108 <Method android.view.View$OnClickListener DnaCollectionActivity$$Lambda$1.lambdaFactory$(DnaCollectionActivity)>
	//   86  188:invokevirtual   #112 <Method void TextView.setOnClickListener(android.view.View$OnClickListener)>
		obj = ((Object) (new SpannableString(((CharSequence) (((TextView) (bundle)).getText().toString())))));
	//   87  191:new             #114 <Class SpannableString>
	//   88  194:dup             
	//   89  195:aload_1         
	//   90  196:invokevirtual   #118 <Method CharSequence TextView.getText()>
	//   91  199:invokeinterface #124 <Method String CharSequence.toString()>
	//   92  204:invokespecial   #126 <Method void SpannableString(CharSequence)>
	//   93  207:astore_2        
		((SpannableString) (obj)).setSpan(((Object) (new UnderlineSpan())), 0, ((SpannableString) (obj)).length(), 0);
	//   94  208:aload_2         
	//   95  209:new             #128 <Class UnderlineSpan>
	//   96  212:dup             
	//   97  213:invokespecial   #129 <Method void UnderlineSpan()>
	//   98  216:iconst_0        
	//   99  217:aload_2         
	//  100  218:invokevirtual   #133 <Method int SpannableString.length()>
	//  101  221:iconst_0        
	//  102  222:invokevirtual   #137 <Method void SpannableString.setSpan(Object, int, int, int)>
		((TextView) (bundle)).setText(((CharSequence) (obj)));
	//  103  225:aload_1         
	//  104  226:aload_2         
	//  105  227:invokevirtual   #93  <Method void TextView.setText(CharSequence)>
		class .Lambda._cls2
			implements android.view.View.OnClickListener
		{

			public static android.view.View.OnClickListener lambdaFactory$(DnaCollectionActivity dnacollectionactivity)
			{
				return ((android.view.View.OnClickListener) (((.Lambda._cls2) (dnacollectionactivity)). new .Lambda._cls2()));
			//    0    0:new             #2   <Class DnaCollectionActivity$$Lambda$2>
			//    1    3:dup             
			//    2    4:aload_0         
			//    3    5:invokespecial   #20  <Method void DnaCollectionActivity$$Lambda$2(DnaCollectionActivity)>
			//    4    8:areturn         
			}

			public void onClick(View view)
			{
				DnaCollectionActivity.lambda$onCreate$13(arg$1, view);
			//    0    0:aload_0         
			//    1    1:getfield        #15  <Field DnaCollectionActivity arg$1>
			//    2    4:aload_1         
			//    3    5:invokestatic    #28  <Method void DnaCollectionActivity.lambda$onCreate$13(DnaCollectionActivity, View)>
			//    4    8:return          
			}

			private final DnaCollectionActivity arg$1;

			private .Lambda._cls2()
			{
			//    0    0:aload_0         
			//    1    1:invokespecial   #13  <Method void Object()>
				arg$1 = DnaCollectionActivity.this;
			//    2    4:aload_0         
			//    3    5:aload_1         
			//    4    6:putfield        #15  <Field DnaCollectionActivity arg$1>
			//    5    9:return          
			}
		}

		((TextView) (bundle)).setOnClickListener(.Lambda._cls2.lambdaFactory.(this));
	//  106  230:aload_1         
	//  107  231:aload_0         
	//  108  232:invokestatic    #140 <Method android.view.View$OnClickListener DnaCollectionActivity$$Lambda$2.lambdaFactory$(DnaCollectionActivity)>
	//  109  235:invokevirtual   #112 <Method void TextView.setOnClickListener(android.view.View$OnClickListener)>
	//  110  238:return          
	}

	private Toolbar toolbar;
}
