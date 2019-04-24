// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.pactforcure.app.ui;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.pactforcure.app.studies.Res;
import com.pactforcure.app.survey.PpdResultsStorage;
import com.pactforcure.app.util.FormattingUtils;

// Referenced classes of package com.pactforcure.app.ui:
//			BaseResourceActivity, PostpartumDepressionResourceActivity

public class InterpretingEpdsScoreResourceActivity extends BaseResourceActivity
{

	public InterpretingEpdsScoreResourceActivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void BaseResourceActivity()>
	//    2    4:return          
	}

	static void lambda$onCreate$14(InterpretingEpdsScoreResourceActivity interpretingepdsscoreresourceactivity, View view)
	{
		interpretingepdsscoreresourceactivity.startActivity(new Intent(((android.content.Context) (interpretingepdsscoreresourceactivity)), com/pactforcure/app/ui/PostpartumDepressionResourceActivity));
	//    0    0:aload_0         
	//    1    1:new             #13  <Class Intent>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:ldc1            #15  <Class PostpartumDepressionResourceActivity>
	//    5    8:invokespecial   #18  <Method void Intent(android.content.Context, Class)>
	//    6   11:invokevirtual   #22  <Method void startActivity(Intent)>
		interpretingepdsscoreresourceactivity.finish();
	//    7   14:aload_0         
	//    8   15:invokevirtual   #25  <Method void finish()>
	//    9   18:return          
	}

	protected int getLayoutId()
	{
		return 0x7f040020;
	//    0    0:ldc1            #28  <Int 0x7f040020>
	//    1    2:ireturn         
	}

	protected String getScreenTitle()
	{
		return Res.getStudySpecificString(0x7f080258);
	//    0    0:ldc1            #31  <Int 0x7f080258>
	//    1    2:invokestatic    #37  <Method String Res.getStudySpecificString(int)>
	//    2    5:areturn         
	}

	protected void onCreate(Bundle bundle)
	{
		super.onCreate(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #42  <Method void BaseResourceActivity.onCreate(Bundle)>
		TextView textview = (TextView)findViewById(0x7f0e00bf);
	//    3    5:aload_0         
	//    4    6:ldc1            #43  <Int 0x7f0e00bf>
	//    5    8:invokevirtual   #47  <Method View findViewById(int)>
	//    6   11:checkcast       #49  <Class TextView>
	//    7   14:astore_3        
		Object obj = ((Object) ((TextView)findViewById(0x7f0e00c0)));
	//    8   15:aload_0         
	//    9   16:ldc1            #50  <Int 0x7f0e00c0>
	//   10   18:invokevirtual   #47  <Method View findViewById(int)>
	//   11   21:checkcast       #49  <Class TextView>
	//   12   24:astore          4
		bundle = ((Bundle) ((Button)findViewById(0x7f0e00c2)));
	//   13   26:aload_0         
	//   14   27:ldc1            #51  <Int 0x7f0e00c2>
	//   15   29:invokevirtual   #47  <Method View findViewById(int)>
	//   16   32:checkcast       #53  <Class Button>
	//   17   35:astore_1        
		textview.setText(((CharSequence) (Res.getStudySpecificString(0x7f080296))));
	//   18   36:aload_3         
	//   19   37:ldc1            #54  <Int 0x7f080296>
	//   20   39:invokestatic    #37  <Method String Res.getStudySpecificString(int)>
	//   21   42:invokevirtual   #58  <Method void TextView.setText(CharSequence)>
		((Button) (bundle)).setText(((CharSequence) (Res.getStudySpecificString(0x7f0802ea))));
	//   22   45:aload_1         
	//   23   46:ldc1            #59  <Int 0x7f0802ea>
	//   24   48:invokestatic    #37  <Method String Res.getStudySpecificString(int)>
	//   25   51:invokevirtual   #60  <Method void Button.setText(CharSequence)>
		int i = PpdResultsStorage.getScore(Res.getStudyId());
	//   26   54:invokestatic    #64  <Method com.pactforcure.app.studies.StudyId Res.getStudyId()>
	//   27   57:invokestatic    #70  <Method int PpdResultsStorage.getScore(com.pactforcure.app.studies.StudyId)>
	//   28   60:istore_2        
		if(i != -1)
	//*  29   61:iload_2         
	//*  30   62:iconst_m1       
	//*  31   63:icmpeq          218
		{
			((TextView) (obj)).setText(((CharSequence) (Html.fromHtml(String.format(Res.getStudySpecificString(0x7f0802ec), new Object[] {
				Integer.valueOf(i)
			})))));
	//   32   66:aload           4
	//   33   68:ldc1            #71  <Int 0x7f0802ec>
	//   34   70:invokestatic    #37  <Method String Res.getStudySpecificString(int)>
	//   35   73:iconst_1        
	//   36   74:anewarray       Object[]
	//   37   77:dup             
	//   38   78:iconst_0        
	//   39   79:iload_2         
	//   40   80:invokestatic    #79  <Method Integer Integer.valueOf(int)>
	//   41   83:aastore         
	//   42   84:invokestatic    #85  <Method String String.format(String, Object[])>
	//   43   87:invokestatic    #91  <Method android.text.Spanned Html.fromHtml(String)>
	//   44   90:invokevirtual   #58  <Method void TextView.setText(CharSequence)>
			((Button) (bundle)).setVisibility(0);
	//   45   93:aload_1         
	//   46   94:iconst_0        
	//   47   95:invokevirtual   #95  <Method void Button.setVisibility(int)>
			TextView textview1 = (TextView)findViewById(0x7f0e00c1);
	//   48   98:aload_0         
	//   49   99:ldc1            #96  <Int 0x7f0e00c1>
	//   50  101:invokevirtual   #47  <Method View findViewById(int)>
	//   51  104:checkcast       #49  <Class TextView>
	//   52  107:astore_3        
			obj = ((Object) (FormattingUtils.ordinal(PpdResultsStorage.getWorstEpisode(Res.getStudyId()))));
	//   53  108:invokestatic    #64  <Method com.pactforcure.app.studies.StudyId Res.getStudyId()>
	//   54  111:invokestatic    #100 <Method String PpdResultsStorage.getWorstEpisode(com.pactforcure.app.studies.StudyId)>
	//   55  114:invokestatic    #106 <Method String FormattingUtils.ordinal(String)>
	//   56  117:astore          4
			class .Lambda._cls1
				implements android.view.View.OnClickListener
			{

				public static android.view.View.OnClickListener lambdaFactory$(InterpretingEpdsScoreResourceActivity interpretingepdsscoreresourceactivity)
				{
					return ((android.view.View.OnClickListener) (((.Lambda._cls1) (interpretingepdsscoreresourceactivity)). new .Lambda._cls1()));
				//    0    0:new             #2   <Class InterpretingEpdsScoreResourceActivity$$Lambda$1>
				//    1    3:dup             
				//    2    4:aload_0         
				//    3    5:invokespecial   #20  <Method void InterpretingEpdsScoreResourceActivity$$Lambda$1(InterpretingEpdsScoreResourceActivity)>
				//    4    8:areturn         
				}

				public void onClick(View view)
				{
					InterpretingEpdsScoreResourceActivity.lambda$onCreate$14(arg$1, view);
				//    0    0:aload_0         
				//    1    1:getfield        #15  <Field InterpretingEpdsScoreResourceActivity arg$1>
				//    2    4:aload_1         
				//    3    5:invokestatic    #28  <Method void InterpretingEpdsScoreResourceActivity.lambda$onCreate$14(InterpretingEpdsScoreResourceActivity, View)>
				//    4    8:return          
				}

				private final InterpretingEpdsScoreResourceActivity arg$1;

			private .Lambda._cls1()
			{
			//    0    0:aload_0         
			//    1    1:invokespecial   #13  <Method void Object()>
				arg$1 = InterpretingEpdsScoreResourceActivity.this;
			//    2    4:aload_0         
			//    3    5:aload_1         
			//    4    6:putfield        #15  <Field InterpretingEpdsScoreResourceActivity arg$1>
			//    5    9:return          
			}
			}

			if(i < 10)
	//*  57  119:iload_2         
	//*  58  120:bipush          10
	//*  59  122:icmpge          158
				textview1.setText(((CharSequence) (Html.fromHtml(String.format(Res.getStudySpecificString(0x7f0802f5), new Object[] {
					obj
				})))));
	//   60  125:aload_3         
	//   61  126:ldc1            #107 <Int 0x7f0802f5>
	//   62  128:invokestatic    #37  <Method String Res.getStudySpecificString(int)>
	//   63  131:iconst_1        
	//   64  132:anewarray       Object[]
	//   65  135:dup             
	//   66  136:iconst_0        
	//   67  137:aload           4
	//   68  139:aastore         
	//   69  140:invokestatic    #85  <Method String String.format(String, Object[])>
	//   70  143:invokestatic    #91  <Method android.text.Spanned Html.fromHtml(String)>
	//   71  146:invokevirtual   #58  <Method void TextView.setText(CharSequence)>
			else
	//*  72  149:aload_1         
	//*  73  150:aload_0         
	//*  74  151:invokestatic    #113 <Method android.view.View$OnClickListener InterpretingEpdsScoreResourceActivity$$Lambda$1.lambdaFactory$(InterpretingEpdsScoreResourceActivity)>
	//*  75  154:invokevirtual   #117 <Method void Button.setOnClickListener(android.view.View$OnClickListener)>
	//*  76  157:return          
			if(i < 13)
	//*  77  158:iload_2         
	//*  78  159:bipush          13
	//*  79  161:icmpge          191
				textview1.setText(((CharSequence) (Html.fromHtml(String.format(Res.getStudySpecificString(0x7f0802f6), new Object[] {
					obj
				})))));
	//   80  164:aload_3         
	//   81  165:ldc1            #118 <Int 0x7f0802f6>
	//   82  167:invokestatic    #37  <Method String Res.getStudySpecificString(int)>
	//   83  170:iconst_1        
	//   84  171:anewarray       Object[]
	//   85  174:dup             
	//   86  175:iconst_0        
	//   87  176:aload           4
	//   88  178:aastore         
	//   89  179:invokestatic    #85  <Method String String.format(String, Object[])>
	//   90  182:invokestatic    #91  <Method android.text.Spanned Html.fromHtml(String)>
	//   91  185:invokevirtual   #58  <Method void TextView.setText(CharSequence)>
			else
	//*  92  188:goto            149
				textview1.setText(((CharSequence) (Html.fromHtml(String.format(Res.getStudySpecificString(0x7f0802f4), new Object[] {
					obj
				})))));
	//   93  191:aload_3         
	//   94  192:ldc1            #119 <Int 0x7f0802f4>
	//   95  194:invokestatic    #37  <Method String Res.getStudySpecificString(int)>
	//   96  197:iconst_1        
	//   97  198:anewarray       Object[]
	//   98  201:dup             
	//   99  202:iconst_0        
	//  100  203:aload           4
	//  101  205:aastore         
	//  102  206:invokestatic    #85  <Method String String.format(String, Object[])>
	//  103  209:invokestatic    #91  <Method android.text.Spanned Html.fromHtml(String)>
	//  104  212:invokevirtual   #58  <Method void TextView.setText(CharSequence)>
		} else
	//* 105  215:goto            149
		{
			((TextView) (obj)).setText(((CharSequence) (Res.getStudySpecificString(0x7f0802e9))));
	//  106  218:aload           4
	//  107  220:ldc1            #120 <Int 0x7f0802e9>
	//  108  222:invokestatic    #37  <Method String Res.getStudySpecificString(int)>
	//  109  225:invokevirtual   #58  <Method void TextView.setText(CharSequence)>
		}
		((Button) (bundle)).setOnClickListener(.Lambda._cls1.lambdaFactory.(this));
	//* 110  228:goto            149
	}
}
