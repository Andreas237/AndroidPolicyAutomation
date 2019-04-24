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
import android.view.*;
import android.widget.Button;
import android.widget.TextView;
import com.pactforcure.app.studies.Res;
import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

// Referenced classes of package com.pactforcure.app.ui:
//			PostpartumDepressionResourceActivity

public class PpdResultsActivity extends AppCompatActivity
{

	public PpdResultsActivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void AppCompatActivity()>
	//    2    4:return          
	}

	static void lambda$onCreate$24(PpdResultsActivity ppdresultsactivity, View view)
	{
		ppdresultsactivity.startActivity(new Intent(((Context) (ppdresultsactivity)), com/pactforcure/app/ui/PostpartumDepressionResourceActivity));
	//    0    0:aload_0         
	//    1    1:new             #30  <Class Intent>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:ldc1            #32  <Class PostpartumDepressionResourceActivity>
	//    5    8:invokespecial   #35  <Method void Intent(Context, Class)>
	//    6   11:invokevirtual   #39  <Method void startActivity(Intent)>
	//    7   14:return          
	}

	protected void attachBaseContext(Context context)
	{
		super.attachBaseContext(((Context) (CalligraphyContextWrapper.wrap(context))));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #47  <Method android.content.ContextWrapper CalligraphyContextWrapper.wrap(Context)>
	//    3    5:invokespecial   #49  <Method void AppCompatActivity.attachBaseContext(Context)>
	//    4    8:return          
	}

	protected void onCreate(Bundle bundle)
	{
		super.onCreate(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #54  <Method void AppCompatActivity.onCreate(Bundle)>
		setContentView(0x7f040029);
	//    3    5:aload_0         
	//    4    6:ldc1            #55  <Int 0x7f040029>
	//    5    8:invokevirtual   #59  <Method void setContentView(int)>
		toolbar = (Toolbar)findViewById(0x7f0e00af);
	//    6   11:aload_0         
	//    7   12:aload_0         
	//    8   13:ldc1            #60  <Int 0x7f0e00af>
	//    9   15:invokevirtual   #64  <Method View findViewById(int)>
	//   10   18:checkcast       #66  <Class Toolbar>
	//   11   21:putfield        #68  <Field Toolbar toolbar>
		toolbar.setTitle(((CharSequence) (Res.getStudySpecificString(0x7f0802eb))));
	//   12   24:aload_0         
	//   13   25:getfield        #68  <Field Toolbar toolbar>
	//   14   28:ldc1            #69  <Int 0x7f0802eb>
	//   15   30:invokestatic    #75  <Method String Res.getStudySpecificString(int)>
	//   16   33:invokevirtual   #79  <Method void Toolbar.setTitle(CharSequence)>
		setSupportActionBar(toolbar);
	//   17   36:aload_0         
	//   18   37:aload_0         
	//   19   38:getfield        #68  <Field Toolbar toolbar>
	//   20   41:invokevirtual   #83  <Method void setSupportActionBar(Toolbar)>
		bundle = getIntent().getExtras();
	//   21   44:aload_0         
	//   22   45:invokevirtual   #87  <Method Intent getIntent()>
	//   23   48:invokevirtual   #91  <Method Bundle Intent.getExtras()>
	//   24   51:astore_1        
		score = bundle.getInt("SCORE_EXTRA");
	//   25   52:aload_0         
	//   26   53:aload_1         
	//   27   54:ldc1            #9   <String "SCORE_EXTRA">
	//   28   56:invokevirtual   #97  <Method int Bundle.getInt(String)>
	//   29   59:putfield        #99  <Field int score>
		symptomsAreCurrent = bundle.getBoolean("CURRENT_SYMPTOMS_EXTRA");
	//   30   62:aload_0         
	//   31   63:aload_1         
	//   32   64:ldc1            #7   <String "CURRENT_SYMPTOMS_EXTRA">
	//   33   66:invokevirtual   #103 <Method boolean Bundle.getBoolean(String)>
	//   34   69:putfield        #105 <Field boolean symptomsAreCurrent>
		worstEpisode = bundle.getString("WORST_EPISODE_EXTRA");
	//   35   72:aload_0         
	//   36   73:aload_1         
	//   37   74:ldc1            #11  <String "WORST_EPISODE_EXTRA">
	//   38   76:invokevirtual   #109 <Method String Bundle.getString(String)>
	//   39   79:putfield        #111 <Field String worstEpisode>
		scoreLabel = (TextView)findViewById(0x7f0e00ec);
	//   40   82:aload_0         
	//   41   83:aload_0         
	//   42   84:ldc1            #112 <Int 0x7f0e00ec>
	//   43   86:invokevirtual   #64  <Method View findViewById(int)>
	//   44   89:checkcast       #114 <Class TextView>
	//   45   92:putfield        #116 <Field TextView scoreLabel>
		resultsLabel = (TextView)findViewById(0x7f0e00ed);
	//   46   95:aload_0         
	//   47   96:aload_0         
	//   48   97:ldc1            #117 <Int 0x7f0e00ed>
	//   49   99:invokevirtual   #64  <Method View findViewById(int)>
	//   50  102:checkcast       #114 <Class TextView>
	//   51  105:putfield        #119 <Field TextView resultsLabel>
		bundle = ((Bundle) ((Button)findViewById(0x7f0e00ee)));
	//   52  108:aload_0         
	//   53  109:ldc1            #120 <Int 0x7f0e00ee>
	//   54  111:invokevirtual   #64  <Method View findViewById(int)>
	//   55  114:checkcast       #122 <Class Button>
	//   56  117:astore_1        
		((Button) (bundle)).setText(((CharSequence) (Res.getStudySpecificString(0x7f0802ef))));
	//   57  118:aload_1         
	//   58  119:ldc1            #123 <Int 0x7f0802ef>
	//   59  121:invokestatic    #75  <Method String Res.getStudySpecificString(int)>
	//   60  124:invokevirtual   #126 <Method void Button.setText(CharSequence)>
		scoreLabel.setText(((CharSequence) (Html.fromHtml(String.format(Res.getStudySpecificString(0x7f0802ec), new Object[] {
			Integer.valueOf(score)
		})))));
	//   61  127:aload_0         
	//   62  128:getfield        #116 <Field TextView scoreLabel>
	//   63  131:ldc1            #127 <Int 0x7f0802ec>
	//   64  133:invokestatic    #75  <Method String Res.getStudySpecificString(int)>
	//   65  136:iconst_1        
	//   66  137:anewarray       Object[]
	//   67  140:dup             
	//   68  141:iconst_0        
	//   69  142:aload_0         
	//   70  143:getfield        #99  <Field int score>
	//   71  146:invokestatic    #135 <Method Integer Integer.valueOf(int)>
	//   72  149:aastore         
	//   73  150:invokestatic    #141 <Method String String.format(String, Object[])>
	//   74  153:invokestatic    #147 <Method android.text.Spanned Html.fromHtml(String)>
	//   75  156:invokevirtual   #148 <Method void TextView.setText(CharSequence)>
		class .Lambda._cls1
			implements android.view.View.OnClickListener
		{

			public static android.view.View.OnClickListener lambdaFactory$(PpdResultsActivity ppdresultsactivity)
			{
				return ((android.view.View.OnClickListener) (((.Lambda._cls1) (ppdresultsactivity)). new .Lambda._cls1()));
			//    0    0:new             #2   <Class PpdResultsActivity$$Lambda$1>
			//    1    3:dup             
			//    2    4:aload_0         
			//    3    5:invokespecial   #20  <Method void PpdResultsActivity$$Lambda$1(PpdResultsActivity)>
			//    4    8:areturn         
			}

			public void onClick(View view)
			{
				PpdResultsActivity.lambda$onCreate$24(arg$1, view);
			//    0    0:aload_0         
			//    1    1:getfield        #15  <Field PpdResultsActivity arg$1>
			//    2    4:aload_1         
			//    3    5:invokestatic    #28  <Method void PpdResultsActivity.lambda$onCreate$24(PpdResultsActivity, View)>
			//    4    8:return          
			}

			private final PpdResultsActivity arg$1;

			private .Lambda._cls1()
			{
			//    0    0:aload_0         
			//    1    1:invokespecial   #13  <Method void Object()>
				arg$1 = PpdResultsActivity.this;
			//    2    4:aload_0         
			//    3    5:aload_1         
			//    4    6:putfield        #15  <Field PpdResultsActivity arg$1>
			//    5    9:return          
			}
		}

		if(score < 10)
	//*  76  159:aload_0         
	//*  77  160:getfield        #99  <Field int score>
	//*  78  163:bipush          10
	//*  79  165:icmpge          192
			resultsLabel.setText(((CharSequence) (Html.fromHtml(Res.getStudySpecificString(0x7f08033f)))));
	//   80  168:aload_0         
	//   81  169:getfield        #119 <Field TextView resultsLabel>
	//   82  172:ldc1            #149 <Int 0x7f08033f>
	//   83  174:invokestatic    #75  <Method String Res.getStudySpecificString(int)>
	//   84  177:invokestatic    #147 <Method android.text.Spanned Html.fromHtml(String)>
	//   85  180:invokevirtual   #148 <Method void TextView.setText(CharSequence)>
		else
	//*  86  183:aload_1         
	//*  87  184:aload_0         
	//*  88  185:invokestatic    #155 <Method android.view.View$OnClickListener PpdResultsActivity$$Lambda$1.lambdaFactory$(PpdResultsActivity)>
	//*  89  188:invokevirtual   #159 <Method void Button.setOnClickListener(android.view.View$OnClickListener)>
	//*  90  191:return          
		if(symptomsAreCurrent)
	//*  91  192:aload_0         
	//*  92  193:getfield        #105 <Field boolean symptomsAreCurrent>
	//*  93  196:ifeq            244
		{
			if(score < 13)
	//*  94  199:aload_0         
	//*  95  200:getfield        #99  <Field int score>
	//*  96  203:bipush          13
	//*  97  205:icmpge          226
				resultsLabel.setText(((CharSequence) (Html.fromHtml(Res.getStudySpecificString(0x7f080340)))));
	//   98  208:aload_0         
	//   99  209:getfield        #119 <Field TextView resultsLabel>
	//  100  212:ldc1            #160 <Int 0x7f080340>
	//  101  214:invokestatic    #75  <Method String Res.getStudySpecificString(int)>
	//  102  217:invokestatic    #147 <Method android.text.Spanned Html.fromHtml(String)>
	//  103  220:invokevirtual   #148 <Method void TextView.setText(CharSequence)>
			else
	//* 104  223:goto            183
				resultsLabel.setText(((CharSequence) (Html.fromHtml(Res.getStudySpecificString(0x7f08033d)))));
	//  105  226:aload_0         
	//  106  227:getfield        #119 <Field TextView resultsLabel>
	//  107  230:ldc1            #161 <Int 0x7f08033d>
	//  108  232:invokestatic    #75  <Method String Res.getStudySpecificString(int)>
	//  109  235:invokestatic    #147 <Method android.text.Spanned Html.fromHtml(String)>
	//  110  238:invokevirtual   #148 <Method void TextView.setText(CharSequence)>
		} else
	//* 111  241:goto            183
		if(score < 13)
	//* 112  244:aload_0         
	//* 113  245:getfield        #99  <Field int score>
	//* 114  248:bipush          13
	//* 115  250:icmpge          271
			resultsLabel.setText(((CharSequence) (Html.fromHtml(Res.getStudySpecificString(0x7f080341)))));
	//  116  253:aload_0         
	//  117  254:getfield        #119 <Field TextView resultsLabel>
	//  118  257:ldc1            #162 <Int 0x7f080341>
	//  119  259:invokestatic    #75  <Method String Res.getStudySpecificString(int)>
	//  120  262:invokestatic    #147 <Method android.text.Spanned Html.fromHtml(String)>
	//  121  265:invokevirtual   #148 <Method void TextView.setText(CharSequence)>
		else
	//* 122  268:goto            183
			resultsLabel.setText(((CharSequence) (Html.fromHtml(Res.getStudySpecificString(0x7f08033e)))));
	//  123  271:aload_0         
	//  124  272:getfield        #119 <Field TextView resultsLabel>
	//  125  275:ldc1            #163 <Int 0x7f08033e>
	//  126  277:invokestatic    #75  <Method String Res.getStudySpecificString(int)>
	//  127  280:invokestatic    #147 <Method android.text.Spanned Html.fromHtml(String)>
	//  128  283:invokevirtual   #148 <Method void TextView.setText(CharSequence)>
		((Button) (bundle)).setOnClickListener(.Lambda._cls1.lambdaFactory.(this));
	//* 129  286:goto            183
	}

	public boolean onCreateOptionsMenu(Menu menu)
	{
		toolbar.inflateMenu(0x7f0f0007);
	//    0    0:aload_0         
	//    1    1:getfield        #68  <Field Toolbar toolbar>
	//    2    4:ldc1            #167 <Int 0x7f0f0007>
	//    3    6:invokevirtual   #170 <Method void Toolbar.inflateMenu(int)>
		return true;
	//    4    9:iconst_1        
	//    5   10:ireturn         
	}

	public boolean onOptionsItemSelected(MenuItem menuitem)
	{
		if(0x7f0e017c == menuitem.getItemId())
	//*   0    0:ldc1            #173 <Int 0x7f0e017c>
	//*   1    2:aload_1         
	//*   2    3:invokeinterface #179 <Method int MenuItem.getItemId()>
	//*   3    8:icmpne          17
		{
			finish();
	//    4   11:aload_0         
	//    5   12:invokevirtual   #182 <Method void finish()>
			return true;
	//    6   15:iconst_1        
	//    7   16:ireturn         
		} else
		{
			return false;
	//    8   17:iconst_0        
	//    9   18:ireturn         
		}
	}

	public static final String CURRENT_SYMPTOMS_EXTRA = "CURRENT_SYMPTOMS_EXTRA";
	public static final String SCORE_EXTRA = "SCORE_EXTRA";
	public static final String WORST_EPISODE_EXTRA = "WORST_EPISODE_EXTRA";
	private TextView resultsLabel;
	private int score;
	private TextView scoreLabel;
	private boolean symptomsAreCurrent;
	private Toolbar toolbar;
	private String worstEpisode;
}
