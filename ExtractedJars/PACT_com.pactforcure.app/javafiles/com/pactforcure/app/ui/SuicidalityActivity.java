// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.pactforcure.app.ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;
import com.pactforcure.app.studies.Res;
import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

// Referenced classes of package com.pactforcure.app.ui:
//			PpdResultsActivity

public class SuicidalityActivity extends AppCompatActivity
{

	public SuicidalityActivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void AppCompatActivity()>
	//    2    4:return          
	}

	static void lambda$onCreate$52(SuicidalityActivity suicidalityactivity, int i, boolean flag, String s, View view)
	{
		view = ((View) (new Intent(((Context) (suicidalityactivity)), com/pactforcure/app/ui/PpdResultsActivity)));
	//    0    0:new             #13  <Class Intent>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:ldc1            #15  <Class PpdResultsActivity>
	//    4    7:invokespecial   #18  <Method void Intent(Context, Class)>
	//    5   10:astore          4
		((Intent) (view)).putExtra("SCORE_EXTRA", i);
	//    6   12:aload           4
	//    7   14:ldc1            #20  <String "SCORE_EXTRA">
	//    8   16:iload_1         
	//    9   17:invokevirtual   #24  <Method Intent Intent.putExtra(String, int)>
	//   10   20:pop             
		((Intent) (view)).putExtra("CURRENT_SYMPTOMS_EXTRA", flag);
	//   11   21:aload           4
	//   12   23:ldc1            #26  <String "CURRENT_SYMPTOMS_EXTRA">
	//   13   25:iload_2         
	//   14   26:invokevirtual   #29  <Method Intent Intent.putExtra(String, boolean)>
	//   15   29:pop             
		((Intent) (view)).putExtra("WORST_EPISODE_EXTRA", s);
	//   16   30:aload           4
	//   17   32:ldc1            #31  <String "WORST_EPISODE_EXTRA">
	//   18   34:aload_3         
	//   19   35:invokevirtual   #34  <Method Intent Intent.putExtra(String, String)>
	//   20   38:pop             
		suicidalityactivity.startActivity(((Intent) (view)));
	//   21   39:aload_0         
	//   22   40:aload           4
	//   23   42:invokevirtual   #38  <Method void startActivity(Intent)>
		suicidalityactivity.finish();
	//   24   45:aload_0         
	//   25   46:invokevirtual   #41  <Method void finish()>
	//   26   49:return          
	}

	protected void attachBaseContext(Context context)
	{
		super.attachBaseContext(((Context) (CalligraphyContextWrapper.wrap(context))));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #49  <Method android.content.ContextWrapper CalligraphyContextWrapper.wrap(Context)>
	//    3    5:invokespecial   #51  <Method void AppCompatActivity.attachBaseContext(Context)>
	//    4    8:return          
	}

	public void onCreate(Bundle bundle)
	{
		super.onCreate(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #56  <Method void AppCompatActivity.onCreate(Bundle)>
		setContentView(0x7f04002f);
	//    3    5:aload_0         
	//    4    6:ldc1            #57  <Int 0x7f04002f>
	//    5    8:invokevirtual   #61  <Method void setContentView(int)>
		bundle = ((Bundle) ((Toolbar)findViewById(0x7f0e00af)));
	//    6   11:aload_0         
	//    7   12:ldc1            #62  <Int 0x7f0e00af>
	//    8   14:invokevirtual   #66  <Method View findViewById(int)>
	//    9   17:checkcast       #68  <Class Toolbar>
	//   10   20:astore_1        
		((Toolbar) (bundle)).setTitle(Res.getStudySpecificStringId(0x7f080378));
	//   11   21:aload_1         
	//   12   22:ldc1            #69  <Int 0x7f080378>
	//   13   24:invokestatic    #75  <Method int Res.getStudySpecificStringId(int)>
	//   14   27:invokevirtual   #78  <Method void Toolbar.setTitle(int)>
		setSupportActionBar(((Toolbar) (bundle)));
	//   15   30:aload_0         
	//   16   31:aload_1         
	//   17   32:invokevirtual   #82  <Method void setSupportActionBar(Toolbar)>
		bundle = getIntent().getExtras();
	//   18   35:aload_0         
	//   19   36:invokevirtual   #86  <Method Intent getIntent()>
	//   20   39:invokevirtual   #90  <Method Bundle Intent.getExtras()>
	//   21   42:astore_1        
		int i = bundle.getInt("SCORE_EXTRA");
	//   22   43:aload_1         
	//   23   44:ldc1            #20  <String "SCORE_EXTRA">
	//   24   46:invokevirtual   #96  <Method int Bundle.getInt(String)>
	//   25   49:istore_2        
		boolean flag = bundle.getBoolean("CURRENT_SYMPTOMS_EXTRA");
	//   26   50:aload_1         
	//   27   51:ldc1            #26  <String "CURRENT_SYMPTOMS_EXTRA">
	//   28   53:invokevirtual   #100 <Method boolean Bundle.getBoolean(String)>
	//   29   56:istore_3        
		bundle = ((Bundle) (bundle.getString("WORST_EPISODE_EXTRA")));
	//   30   57:aload_1         
	//   31   58:ldc1            #31  <String "WORST_EPISODE_EXTRA">
	//   32   60:invokevirtual   #104 <Method String Bundle.getString(String)>
	//   33   63:astore_1        
		TextView textview = (TextView)findViewById(0x7f0e010f);
	//   34   64:aload_0         
	//   35   65:ldc1            #105 <Int 0x7f0e010f>
	//   36   67:invokevirtual   #66  <Method View findViewById(int)>
	//   37   70:checkcast       #107 <Class TextView>
	//   38   73:astore          4
		textview.setText(((CharSequence) (Html.fromHtml(Res.getStudySpecificRawAsString(0x7f07001d)))));
	//   39   75:aload           4
	//   40   77:ldc1            #108 <Int 0x7f07001d>
	//   41   79:invokestatic    #112 <Method String Res.getStudySpecificRawAsString(int)>
	//   42   82:invokestatic    #118 <Method android.text.Spanned Html.fromHtml(String)>
	//   43   85:invokevirtual   #122 <Method void TextView.setText(CharSequence)>
		textview.setMovementMethod(LinkMovementMethod.getInstance());
	//   44   88:aload           4
	//   45   90:invokestatic    #128 <Method android.text.method.MovementMethod LinkMovementMethod.getInstance()>
	//   46   93:invokevirtual   #132 <Method void TextView.setMovementMethod(android.text.method.MovementMethod)>
		textview = (TextView)findViewById(0x7f0e0110);
	//   47   96:aload_0         
	//   48   97:ldc1            #133 <Int 0x7f0e0110>
	//   49   99:invokevirtual   #66  <Method View findViewById(int)>
	//   50  102:checkcast       #107 <Class TextView>
	//   51  105:astore          4
		textview.setText(((CharSequence) (Res.getStudySpecificString(0x7f08020e))));
	//   52  107:aload           4
	//   53  109:ldc1            #134 <Int 0x7f08020e>
	//   54  111:invokestatic    #137 <Method String Res.getStudySpecificString(int)>
	//   55  114:invokevirtual   #122 <Method void TextView.setText(CharSequence)>
		class .Lambda._cls1
			implements android.view.View.OnClickListener
		{

			public static android.view.View.OnClickListener lambdaFactory$(SuicidalityActivity suicidalityactivity, int j, boolean flag1, String s)
			{
				return ((android.view.View.OnClickListener) (((.Lambda._cls1) (suicidalityactivity)). new .Lambda._cls1(j, flag1, s)));
			//    0    0:new             #2   <Class SuicidalityActivity$$Lambda$1>
			//    1    3:dup             
			//    2    4:aload_0         
			//    3    5:iload_1         
			//    4    6:iload_2         
			//    5    7:aload_3         
			//    6    8:invokespecial   #32  <Method void SuicidalityActivity$$Lambda$1(SuicidalityActivity, int, boolean, String)>
			//    7   11:areturn         
			}

			public void onClick(View view)
			{
				SuicidalityActivity.lambda$onCreate$52(arg$1, arg$2, arg$3, arg$4, view);
			//    0    0:aload_0         
			//    1    1:getfield        #21  <Field SuicidalityActivity arg$1>
			//    2    4:aload_0         
			//    3    5:getfield        #23  <Field int arg$2>
			//    4    8:aload_0         
			//    5    9:getfield        #25  <Field boolean arg$3>
			//    6   12:aload_0         
			//    7   13:getfield        #27  <Field String arg$4>
			//    8   16:aload_1         
			//    9   17:invokestatic    #40  <Method void SuicidalityActivity.lambda$onCreate$52(SuicidalityActivity, int, boolean, String, View)>
			//   10   20:return          
			}

			private final SuicidalityActivity arg$1;
			private final int arg$2;
			private final boolean arg$3;
			private final String arg$4;

			private .Lambda._cls1(int i, boolean flag, String s)
			{
			//    0    0:aload_0         
			//    1    1:invokespecial   #19  <Method void Object()>
				arg$1 = SuicidalityActivity.this;
			//    2    4:aload_0         
			//    3    5:aload_1         
			//    4    6:putfield        #21  <Field SuicidalityActivity arg$1>
				arg$2 = i;
			//    5    9:aload_0         
			//    6   10:iload_2         
			//    7   11:putfield        #23  <Field int arg$2>
				arg$3 = flag;
			//    8   14:aload_0         
			//    9   15:iload_3         
			//   10   16:putfield        #25  <Field boolean arg$3>
				arg$4 = s;
			//   11   19:aload_0         
			//   12   20:aload           4
			//   13   22:putfield        #27  <Field String arg$4>
			//   14   25:return          
			}
		}

		textview.setOnClickListener(.Lambda._cls1.lambdaFactory.(this, i, flag, ((String) (bundle))));
	//   56  117:aload           4
	//   57  119:aload_0         
	//   58  120:iload_2         
	//   59  121:iload_3         
	//   60  122:aload_1         
	//   61  123:invokestatic    #143 <Method android.view.View$OnClickListener SuicidalityActivity$$Lambda$1.lambdaFactory$(SuicidalityActivity, int, boolean, String)>
	//   62  126:invokevirtual   #147 <Method void TextView.setOnClickListener(android.view.View$OnClickListener)>
	//   63  129:return          
	}
}
