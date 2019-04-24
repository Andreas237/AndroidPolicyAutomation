// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.pactforcure.app.ui;

import android.content.Context;
import android.content.res.Resources;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.pactforcure.app.databinding.FragmentSurveyTasksBinding;
import com.pactforcure.app.studies.Res;
import com.pactforcure.app.studies.StudyId;
import com.pactforcure.app.survey.*;
import java.util.List;
import org.json.simple.parser.ParseException;

// Referenced classes of package com.pactforcure.app.ui:
//			SurveyTasksFragment, DashboardCardBuilder

private class SurveyTasksFragment$AddCards
{
	private class SurveyAndProgress
	{

		public final ProgressStatus progressStatus;
		public final Survey survey;
		public final int surveyId;
		final SurveyTasksFragment.AddCards this$1;

		public SurveyAndProgress(Survey survey1, int i, ProgressStatus progressstatus)
		{
			this$1 = SurveyTasksFragment.AddCards.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #22  <Field SurveyTasksFragment$AddCards this$1>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #25  <Method void Object()>
			survey = survey1;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #27  <Field Survey survey>
			surveyId = i;
		//    8   14:aload_0         
		//    9   15:iload_3         
		//   10   16:putfield        #29  <Field int surveyId>
			progressStatus = progressstatus;
		//   11   19:aload_0         
		//   12   20:aload           4
		//   13   22:putfield        #31  <Field ProgressStatus progressStatus>
		//   14   25:return          
		}
	}


	private void addCompletedCard(View view)
	{
		LinearLayout linearlayout = SurveyTasksFragment.access$100(SurveyTasksFragment.this).container;
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field SurveyTasksFragment this$0>
	//    2    4:invokestatic    #41  <Method FragmentSurveyTasksBinding SurveyTasksFragment.access$100(SurveyTasksFragment)>
	//    3    7:getfield        #47  <Field LinearLayout FragmentSurveyTasksBinding.container>
	//    4   10:astore_3        
		int i = completedIndex + 1;
	//    5   11:aload_0         
	//    6   12:getfield        #49  <Field int completedIndex>
	//    7   15:iconst_1        
	//    8   16:iadd            
	//    9   17:istore_2        
		completedIndex = i;
	//   10   18:aload_0         
	//   11   19:iload_2         
	//   12   20:putfield        #49  <Field int completedIndex>
		linearlayout.addView(view, i);
	//   13   23:aload_3         
	//   14   24:aload_1         
	//   15   25:iload_2         
	//   16   26:invokevirtual   #55  <Method void LinearLayout.addView(View, int)>
		SurveyTasksFragment.access$200(SurveyTasksFragment.this).add(((Object) (Integer.valueOf(view.getId()))));
	//   17   29:aload_0         
	//   18   30:getfield        #24  <Field SurveyTasksFragment this$0>
	//   19   33:invokestatic    #59  <Method List SurveyTasksFragment.access$200(SurveyTasksFragment)>
	//   20   36:aload_1         
	//   21   37:invokevirtual   #65  <Method int View.getId()>
	//   22   40:invokestatic    #71  <Method Integer Integer.valueOf(int)>
	//   23   43:invokeinterface #77  <Method boolean List.add(Object)>
	//   24   48:pop             
		hasCompletedCards = true;
	//   25   49:aload_0         
	//   26   50:iconst_1        
	//   27   51:putfield        #31  <Field boolean hasCompletedCards>
	//   28   54:return          
	}

	private void addHealthEconomicsCards(StudyId studyid)
	{
		ProgressStatus progressstatus;
		ProgressStatus progressstatus1;
		ProgressStatus progressstatus2;
		ProgressStatus progressstatus3;
		progressstatus = SurveyStorage.loadSurveyProgress(studyid.name(), "HealthEconomics-BIMF");
	//    0    0:aload_1         
	//    1    1:invokevirtual   #89  <Method String StudyId.name()>
	//    2    4:ldc1            #91  <String "HealthEconomics-BIMF">
	//    3    6:invokestatic    #97  <Method ProgressStatus SurveyStorage.loadSurveyProgress(String, String)>
	//    4    9:astore          5
		progressstatus1 = SurveyStorage.loadSurveyProgress(studyid.name(), "HealthEconomics-SF12");
	//    5   11:aload_1         
	//    6   12:invokevirtual   #89  <Method String StudyId.name()>
	//    7   15:ldc1            #99  <String "HealthEconomics-SF12">
	//    8   17:invokestatic    #97  <Method ProgressStatus SurveyStorage.loadSurveyProgress(String, String)>
	//    9   20:astore          6
		progressstatus2 = SurveyStorage.loadSurveyProgress(studyid.name(), "HealthEconomics-HRPQ");
	//   10   22:aload_1         
	//   11   23:invokevirtual   #89  <Method String StudyId.name()>
	//   12   26:ldc1            #101 <String "HealthEconomics-HRPQ">
	//   13   28:invokestatic    #97  <Method ProgressStatus SurveyStorage.loadSurveyProgress(String, String)>
	//   14   31:astore          7
		progressstatus3 = SurveyStorage.loadSurveyProgress(studyid.name(), "HealthEconomics-HRUQ");
	//   15   33:aload_1         
	//   16   34:invokevirtual   #89  <Method String StudyId.name()>
	//   17   37:ldc1            #103 <String "HealthEconomics-HRUQ">
	//   18   39:invokestatic    #97  <Method ProgressStatus SurveyStorage.loadSurveyProgress(String, String)>
	//   19   42:astore          8
		int j;
		Survey survey1 = SurveyLoader.fromSurveyCode(0x7f0e0008);
	//   20   44:ldc1            #104 <Int 0x7f0e0008>
	//   21   46:invokestatic    #110 <Method Survey SurveyLoader.fromSurveyCode(int)>
	//   22   49:astore          9
		Survey survey2 = SurveyLoader.fromSurveyCode(0x7f0e000b);
	//   23   51:ldc1            #111 <Int 0x7f0e000b>
	//   24   53:invokestatic    #110 <Method Survey SurveyLoader.fromSurveyCode(int)>
	//   25   56:astore          10
		Survey survey3 = SurveyLoader.fromSurveyCode(0x7f0e0009);
	//   26   58:ldc1            #112 <Int 0x7f0e0009>
	//   27   60:invokestatic    #110 <Method Survey SurveyLoader.fromSurveyCode(int)>
	//   28   63:astore          11
		Survey survey4 = SurveyLoader.fromSurveyCode(0x7f0e000a);
	//   29   65:ldc1            #113 <Int 0x7f0e000a>
	//   30   67:invokestatic    #110 <Method Survey SurveyLoader.fromSurveyCode(int)>
	//   31   70:astore          12
		studyid = ((StudyId) (new SurveyAndProgress[4]));
	//   32   72:iconst_4        
	//   33   73:anewarray       SurveyAndProgress[]
	//   34   76:astore_1        
		studyid[0] = ((/*<invalid signature>*/java.lang.Object) (new SurveyAndProgress(survey1, 0x7f0e0008, progressstatus)));
	//   35   77:aload_1         
	//   36   78:iconst_0        
	//   37   79:new             #9   <Class SurveyTasksFragment$AddCards$SurveyAndProgress>
	//   38   82:dup             
	//   39   83:aload_0         
	//   40   84:aload           9
	//   41   86:ldc1            #104 <Int 0x7f0e0008>
	//   42   88:aload           5
	//   43   90:invokespecial   #116 <Method void SurveyTasksFragment$AddCards$SurveyAndProgress(SurveyTasksFragment$AddCards, Survey, int, ProgressStatus)>
	//   44   93:aastore         
		studyid[1] = ((/*<invalid signature>*/java.lang.Object) (new SurveyAndProgress(survey2, 0x7f0e000b, progressstatus1)));
	//   45   94:aload_1         
	//   46   95:iconst_1        
	//   47   96:new             #9   <Class SurveyTasksFragment$AddCards$SurveyAndProgress>
	//   48   99:dup             
	//   49  100:aload_0         
	//   50  101:aload           10
	//   51  103:ldc1            #111 <Int 0x7f0e000b>
	//   52  105:aload           6
	//   53  107:invokespecial   #116 <Method void SurveyTasksFragment$AddCards$SurveyAndProgress(SurveyTasksFragment$AddCards, Survey, int, ProgressStatus)>
	//   54  110:aastore         
		studyid[2] = ((/*<invalid signature>*/java.lang.Object) (new SurveyAndProgress(survey3, 0x7f0e0009, progressstatus2)));
	//   55  111:aload_1         
	//   56  112:iconst_2        
	//   57  113:new             #9   <Class SurveyTasksFragment$AddCards$SurveyAndProgress>
	//   58  116:dup             
	//   59  117:aload_0         
	//   60  118:aload           11
	//   61  120:ldc1            #112 <Int 0x7f0e0009>
	//   62  122:aload           7
	//   63  124:invokespecial   #116 <Method void SurveyTasksFragment$AddCards$SurveyAndProgress(SurveyTasksFragment$AddCards, Survey, int, ProgressStatus)>
	//   64  127:aastore         
		studyid[3] = ((/*<invalid signature>*/java.lang.Object) (new SurveyAndProgress(survey4, 0x7f0e000a, progressstatus3)));
	//   65  128:aload_1         
	//   66  129:iconst_3        
	//   67  130:new             #9   <Class SurveyTasksFragment$AddCards$SurveyAndProgress>
	//   68  133:dup             
	//   69  134:aload_0         
	//   70  135:aload           12
	//   71  137:ldc1            #113 <Int 0x7f0e000a>
	//   72  139:aload           8
	//   73  141:invokespecial   #116 <Method void SurveyTasksFragment$AddCards$SurveyAndProgress(SurveyTasksFragment$AddCards, Survey, int, ProgressStatus)>
	//   74  144:aastore         
		j = studyid.length;
	//   75  145:aload_1         
	//   76  146:arraylength     
	//   77  147:istore_3        
		int i = 0;
	//   78  148:iconst_0        
	//   79  149:istore_2        
_L2:
		if(i >= j)
			break MISSING_BLOCK_LABEL_240;
	//   80  150:iload_2         
	//   81  151:iload_3         
	//   82  152:icmpge          240
		progressstatus1 = ((ProgressStatus) (studyid[i]));
	//   83  155:aload_1         
	//   84  156:iload_2         
	//   85  157:aaload          
	//   86  158:astore          6
		Survey survey = ((SurveyAndProgress) (progressstatus1)).survey;
	//   87  160:aload           6
	//   88  162:getfield        #119 <Field Survey SurveyTasksFragment$AddCards$SurveyAndProgress.survey>
	//   89  165:astore          5
		int k = ((SurveyAndProgress) (progressstatus1)).surveyId;
	//   90  167:aload           6
	//   91  169:getfield        #122 <Field int SurveyTasksFragment$AddCards$SurveyAndProgress.surveyId>
	//   92  172:istore          4
		progressstatus1 = ((SurveyAndProgress) (progressstatus1)).progressStatus;
	//   93  174:aload           6
	//   94  176:getfield        #126 <Field ProgressStatus SurveyTasksFragment$AddCards$SurveyAndProgress.progressStatus>
	//   95  179:astore          6
		if(progressstatus1 == ProgressStatus.New || progressstatus1 == ProgressStatus.Started)
	//*  96  181:aload           6
	//*  97  183:getstatic       #131 <Field ProgressStatus ProgressStatus.New>
	//*  98  186:if_acmpeq       197
	//*  99  189:aload           6
	//* 100  191:getstatic       #134 <Field ProgressStatus ProgressStatus.Started>
	//* 101  194:if_acmpne       215
		{
			class .Lambda._cls4
				implements android.view.View.OnClickListener
			{

				public static android.view.View.OnClickListener lambdaFactory$(SurveyTasksFragment.AddCards addcards, int l)
				{
					return ((android.view.View.OnClickListener) (((.Lambda._cls4) (addcards)). new .Lambda._cls4(l)));
				//    0    0:new             #2   <Class SurveyTasksFragment$AddCards$$Lambda$4>
				//    1    3:dup             
				//    2    4:aload_0         
				//    3    5:iload_1         
				//    4    6:invokespecial   #24  <Method void SurveyTasksFragment$AddCards$$Lambda$4(SurveyTasksFragment$AddCards, int)>
				//    5    9:areturn         
				}

				public void onClick(View view)
				{
					SurveyTasksFragment.AddCards.lambda$addHealthEconomicsCards$56(arg$1, arg$2, view);
				//    0    0:aload_0         
				//    1    1:getfield        #17  <Field SurveyTasksFragment$AddCards arg$1>
				//    2    4:aload_0         
				//    3    5:getfield        #19  <Field int arg$2>
				//    4    8:aload_1         
				//    5    9:invokestatic    #32  <Method void SurveyTasksFragment$AddCards.lambda$addHealthEconomicsCards$56(SurveyTasksFragment$AddCards, int, View)>
				//    6   12:return          
				}

				private final SurveyTasksFragment.AddCards arg$1;
				private final int arg$2;

			private .Lambda._cls4(int i)
			{
			//    0    0:aload_0         
			//    1    1:invokespecial   #15  <Method void Object()>
				arg$1 = SurveyTasksFragment.AddCards.this;
			//    2    4:aload_0         
			//    3    5:aload_1         
			//    4    6:putfield        #17  <Field SurveyTasksFragment$AddCards arg$1>
				arg$2 = i;
			//    5    9:aload_0         
			//    6   10:iload_2         
			//    7   11:putfield        #19  <Field int arg$2>
			//    8   14:return          
			}
			}

			createAndAddToDoCard(survey.getName(), .Lambda._cls4.lambdaFactory.(this, k));
	//  102  197:aload_0         
	//  103  198:aload           5
	//  104  200:invokevirtual   #139 <Method String Survey.getName()>
	//  105  203:aload_0         
	//  106  204:iload           4
	//  107  206:invokestatic    #145 <Method android.view.View$OnClickListener SurveyTasksFragment$AddCards$$Lambda$4.lambdaFactory$(SurveyTasksFragment$AddCards, int)>
	//  108  209:invokespecial   #149 <Method void createAndAddToDoCard(String, android.view.View$OnClickListener)>
			break MISSING_BLOCK_LABEL_245;
	//  109  212:goto            245
		}
		try
		{
			createAndAddCompletedCard(survey.getName(), progressstatus1);
	//  110  215:aload_0         
	//  111  216:aload           5
	//  112  218:invokevirtual   #139 <Method String Survey.getName()>
	//  113  221:aload           6
	//  114  223:invokespecial   #153 <Method void createAndAddCompletedCard(String, ProgressStatus)>
			break MISSING_BLOCK_LABEL_245;
	//  115  226:goto            245
		}
		// Misplaced declaration of an exception variable
		catch(StudyId studyid) { }
	//  116  229:astore_1        
	//* 117  230:ldc1            #155 <String "SurveyTasksFragment">
	//* 118  232:aload_1         
	//* 119  233:invokestatic    #161 <Method String Log.getStackTraceString(Throwable)>
	//* 120  236:invokestatic    #165 <Method int Log.e(String, String)>
	//* 121  239:pop             
	//* 122  240:return          
		// Misplaced declaration of an exception variable
		catch(StudyId studyid) { }
	//  123  241:astore_1        
		Log.e("SurveyTasksFragment", Log.getStackTraceString(((Throwable) (studyid))));
		return;
	//* 124  242:goto            230
		i++;
	//  125  245:iload_2         
	//  126  246:iconst_1        
	//  127  247:iadd            
	//  128  248:istore_2        
		if(true) goto _L2; else goto _L1
	//  129  249:goto            150
_L1:
	}

	private void createAndAddCompletedCard(String s, ProgressStatus progressstatus)
	{
		DashboardCardBuilder dashboardcardbuilder = new DashboardCardBuilder();
	//    0    0:new             #167 <Class DashboardCardBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #168 <Method void DashboardCardBuilder()>
	//    3    7:astore          4
		StringBuilder stringbuilder = (new StringBuilder()).append(s).append("\n");
	//    4    9:new             #170 <Class StringBuilder>
	//    5   12:dup             
	//    6   13:invokespecial   #171 <Method void StringBuilder()>
	//    7   16:aload_1         
	//    8   17:invokevirtual   #175 <Method StringBuilder StringBuilder.append(String)>
	//    9   20:ldc1            #177 <String "\n">
	//   10   22:invokevirtual   #175 <Method StringBuilder StringBuilder.append(String)>
	//   11   25:astore          5
		boolean flag;
		if(progressstatus == ProgressStatus.Uploaded)
	//*  12   27:aload_2         
	//*  13   28:getstatic       #180 <Field ProgressStatus ProgressStatus.Uploaded>
	//*  14   31:if_acmpne       87
			s = Res.getRegularString(0x7f080080);
	//   15   34:ldc1            #181 <Int 0x7f080080>
	//   16   36:invokestatic    #187 <Method String Res.getRegularString(int)>
	//   17   39:astore_1        
		else
	//*  18   40:aload           4
	//*  19   42:aload           5
	//*  20   44:aload_1         
	//*  21   45:invokevirtual   #175 <Method StringBuilder StringBuilder.append(String)>
	//*  22   48:invokevirtual   #190 <Method String StringBuilder.toString()>
	//*  23   51:invokevirtual   #194 <Method DashboardCardBuilder DashboardCardBuilder.label(String)>
	//*  24   54:astore_1        
	//*  25   55:aload_2         
	//*  26   56:getstatic       #180 <Field ProgressStatus ProgressStatus.Uploaded>
	//*  27   59:if_acmpne       96
	//*  28   62:iconst_1        
	//*  29   63:istore_3        
	//*  30   64:aload_0         
	//*  31   65:aload_1         
	//*  32   66:iload_3         
	//*  33   67:invokevirtual   #198 <Method DashboardCardBuilder DashboardCardBuilder.completed(boolean)>
	//*  34   70:aload_0         
	//*  35   71:getfield        #24  <Field SurveyTasksFragment this$0>
	//*  36   74:invokestatic    #41  <Method FragmentSurveyTasksBinding SurveyTasksFragment.access$100(SurveyTasksFragment)>
	//*  37   77:getfield        #47  <Field LinearLayout FragmentSurveyTasksBinding.container>
	//*  38   80:invokevirtual   #202 <Method View DashboardCardBuilder.buildCard(android.view.ViewGroup)>
	//*  39   83:invokespecial   #204 <Method void addCompletedCard(View)>
	//*  40   86:return          
			s = Res.getRegularString(0x7f080370);
	//   41   87:ldc1            #205 <Int 0x7f080370>
	//   42   89:invokestatic    #187 <Method String Res.getRegularString(int)>
	//   43   92:astore_1        
		s = ((String) (dashboardcardbuilder.label(stringbuilder.append(s).toString())));
		if(progressstatus == ProgressStatus.Uploaded)
			flag = true;
		else
	//*  44   93:goto            40
			flag = false;
	//   45   96:iconst_0        
	//   46   97:istore_3        
		addCompletedCard(((DashboardCardBuilder) (s)).completed(flag).buildCard(((android.view.ViewGroup) (SurveyTasksFragment.access$100(SurveyTasksFragment.this).container))));
	//*  47   98:goto            64
	}

	private void createAndAddToDoCard(String s, android.view.View.OnClickListener onclicklistener)
	{
		s = ((String) ((new DashboardCardBuilder()).label(s).withAttentionCircle().buildCard(((android.view.ViewGroup) (SurveyTasksFragment.access$100(SurveyTasksFragment.this).container)))));
	//    0    0:new             #167 <Class DashboardCardBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #168 <Method void DashboardCardBuilder()>
	//    3    7:aload_1         
	//    4    8:invokevirtual   #194 <Method DashboardCardBuilder DashboardCardBuilder.label(String)>
	//    5   11:invokevirtual   #209 <Method DashboardCardBuilder DashboardCardBuilder.withAttentionCircle()>
	//    6   14:aload_0         
	//    7   15:getfield        #24  <Field SurveyTasksFragment this$0>
	//    8   18:invokestatic    #41  <Method FragmentSurveyTasksBinding SurveyTasksFragment.access$100(SurveyTasksFragment)>
	//    9   21:getfield        #47  <Field LinearLayout FragmentSurveyTasksBinding.container>
	//   10   24:invokevirtual   #202 <Method View DashboardCardBuilder.buildCard(android.view.ViewGroup)>
	//   11   27:astore_1        
		((View) (s)).setOnClickListener(onclicklistener);
	//   12   28:aload_1         
	//   13   29:aload_2         
	//   14   30:invokevirtual   #213 <Method void View.setOnClickListener(android.view.View$OnClickListener)>
		onclicklistener = ((android.view.View.OnClickListener) (SurveyTasksFragment.access$100(SurveyTasksFragment.this).container));
	//   15   33:aload_0         
	//   16   34:getfield        #24  <Field SurveyTasksFragment this$0>
	//   17   37:invokestatic    #41  <Method FragmentSurveyTasksBinding SurveyTasksFragment.access$100(SurveyTasksFragment)>
	//   18   40:getfield        #47  <Field LinearLayout FragmentSurveyTasksBinding.container>
	//   19   43:astore_2        
		int i = todoIndex + 1;
	//   20   44:aload_0         
	//   21   45:getfield        #215 <Field int todoIndex>
	//   22   48:iconst_1        
	//   23   49:iadd            
	//   24   50:istore_3        
		todoIndex = i;
	//   25   51:aload_0         
	//   26   52:iload_3         
	//   27   53:putfield        #215 <Field int todoIndex>
		((LinearLayout) (onclicklistener)).addView(((View) (s)), i);
	//   28   56:aload_2         
	//   29   57:aload_1         
	//   30   58:iload_3         
	//   31   59:invokevirtual   #55  <Method void LinearLayout.addView(View, int)>
		completedIndex = completedIndex + 1;
	//   32   62:aload_0         
	//   33   63:aload_0         
	//   34   64:getfield        #49  <Field int completedIndex>
	//   35   67:iconst_1        
	//   36   68:iadd            
	//   37   69:putfield        #49  <Field int completedIndex>
		hasTodoCards = true;
	//   38   72:aload_0         
	//   39   73:iconst_1        
	//   40   74:putfield        #29  <Field boolean hasTodoCards>
		SurveyTasksFragment.access$200(SurveyTasksFragment.this).add(((Object) (Integer.valueOf(((View) (s)).getId()))));
	//   41   77:aload_0         
	//   42   78:getfield        #24  <Field SurveyTasksFragment this$0>
	//   43   81:invokestatic    #59  <Method List SurveyTasksFragment.access$200(SurveyTasksFragment)>
	//   44   84:aload_1         
	//   45   85:invokevirtual   #65  <Method int View.getId()>
	//   46   88:invokestatic    #71  <Method Integer Integer.valueOf(int)>
	//   47   91:invokeinterface #77  <Method boolean List.add(Object)>
	//   48   96:pop             
	//   49   97:return          
	}

	static void lambda$addHealthEconomicsCards$56(SurveyTasksFragment$AddCards surveytasksfragment$addcards, int i, View view)
	{
		SurveyTasksFragment.access$300(surveytasksfragment$addcards.this$0, i);
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field SurveyTasksFragment this$0>
	//    2    4:iload_1         
	//    3    5:invokestatic    #221 <Method void SurveyTasksFragment.access$300(SurveyTasksFragment, int)>
	//    4    8:return          
	}

	static void lambda$invoke$53(SurveyTasksFragment$AddCards surveytasksfragment$addcards, View view)
	{
		SurveyTasksFragment.access$300(surveytasksfragment$addcards.this$0, 0x7f0e0013);
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field SurveyTasksFragment this$0>
	//    2    4:ldc1            #224 <Int 0x7f0e0013>
	//    3    6:invokestatic    #221 <Method void SurveyTasksFragment.access$300(SurveyTasksFragment, int)>
	//    4    9:return          
	}

	static void lambda$invoke$54(SurveyTasksFragment$AddCards surveytasksfragment$addcards, View view)
	{
		SurveyTasksFragment.access$500(surveytasksfragment$addcards.this$0);
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field SurveyTasksFragment this$0>
	//    2    4:invokestatic    #228 <Method void SurveyTasksFragment.access$500(SurveyTasksFragment)>
	//    3    7:return          
	}

	static void lambda$invoke$55(SurveyTasksFragment$AddCards surveytasksfragment$addcards, View view)
	{
		SurveyTasksFragment.access$400(surveytasksfragment$addcards.this$0);
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field SurveyTasksFragment this$0>
	//    2    4:invokestatic    #232 <Method void SurveyTasksFragment.access$400(SurveyTasksFragment)>
	//    3    7:return          
	}

	void invoke()
	{
		Object obj;
		Object obj1;
		Object obj3;
		obj = ((Object) (SurveyTasksFragment.access$100(SurveyTasksFragment.this).todoLabel));
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field SurveyTasksFragment this$0>
	//    2    4:invokestatic    #41  <Method FragmentSurveyTasksBinding SurveyTasksFragment.access$100(SurveyTasksFragment)>
	//    3    7:getfield        #237 <Field TextView FragmentSurveyTasksBinding.todoLabel>
	//    4   10:astore_3        
		todoIndex = SurveyTasksFragment.access$100(SurveyTasksFragment.this).container.indexOfChild(((View) (obj)));
	//    5   11:aload_0         
	//    6   12:aload_0         
	//    7   13:getfield        #24  <Field SurveyTasksFragment this$0>
	//    8   16:invokestatic    #41  <Method FragmentSurveyTasksBinding SurveyTasksFragment.access$100(SurveyTasksFragment)>
	//    9   19:getfield        #47  <Field LinearLayout FragmentSurveyTasksBinding.container>
	//   10   22:aload_3         
	//   11   23:invokevirtual   #241 <Method int LinearLayout.indexOfChild(View)>
	//   12   26:putfield        #215 <Field int todoIndex>
		obj1 = ((Object) (SurveyTasksFragment.access$100(SurveyTasksFragment.this).completedLabel));
	//   13   29:aload_0         
	//   14   30:getfield        #24  <Field SurveyTasksFragment this$0>
	//   15   33:invokestatic    #41  <Method FragmentSurveyTasksBinding SurveyTasksFragment.access$100(SurveyTasksFragment)>
	//   16   36:getfield        #244 <Field TextView FragmentSurveyTasksBinding.completedLabel>
	//   17   39:astore          4
		completedIndex = SurveyTasksFragment.access$100(SurveyTasksFragment.this).container.indexOfChild(((View) (obj1)));
	//   18   41:aload_0         
	//   19   42:aload_0         
	//   20   43:getfield        #24  <Field SurveyTasksFragment this$0>
	//   21   46:invokestatic    #41  <Method FragmentSurveyTasksBinding SurveyTasksFragment.access$100(SurveyTasksFragment)>
	//   22   49:getfield        #47  <Field LinearLayout FragmentSurveyTasksBinding.container>
	//   23   52:aload           4
	//   24   54:invokevirtual   #241 <Method int LinearLayout.indexOfChild(View)>
	//   25   57:putfield        #49  <Field int completedIndex>
		SurveyTasksFragment.access$100(SurveyTasksFragment.this).completedLabel.setVisibility(0);
	//   26   60:aload_0         
	//   27   61:getfield        #24  <Field SurveyTasksFragment this$0>
	//   28   64:invokestatic    #41  <Method FragmentSurveyTasksBinding SurveyTasksFragment.access$100(SurveyTasksFragment)>
	//   29   67:getfield        #244 <Field TextView FragmentSurveyTasksBinding.completedLabel>
	//   30   70:iconst_0        
	//   31   71:invokevirtual   #250 <Method void TextView.setVisibility(int)>
		obj1 = ((Object) (Res.getStudyId()));
	//   32   74:invokestatic    #254 <Method StudyId Res.getStudyId()>
	//   33   77:astore          4
		obj3 = ((Object) (SurveyStorage.loadSurveyProgress(((StudyId) (obj1)).name(), "PPD")));
	//   34   79:aload           4
	//   35   81:invokevirtual   #89  <Method String StudyId.name()>
	//   36   84:ldc2            #256 <String "PPD">
	//   37   87:invokestatic    #97  <Method ProgressStatus SurveyStorage.loadSurveyProgress(String, String)>
	//   38   90:astore          5
		ppdSurvey = SurveyLoader.fromSurveyCode(0x7f0e0013);
	//   39   92:aload_0         
	//   40   93:ldc1            #224 <Int 0x7f0e0013>
	//   41   95:invokestatic    #110 <Method Survey SurveyLoader.fromSurveyCode(int)>
	//   42   98:putfield        #258 <Field Survey ppdSurvey>
		if(obj3 != ProgressStatus.New && obj3 != ProgressStatus.Started) goto _L2; else goto _L1
	//   43  101:aload           5
	//   44  103:getstatic       #131 <Field ProgressStatus ProgressStatus.New>
	//   45  106:if_acmpeq       117
	//   46  109:aload           5
	//   47  111:getstatic       #134 <Field ProgressStatus ProgressStatus.Started>
	//   48  114:if_acmpne       530
_L1:
		class .Lambda._cls1
			implements android.view.View.OnClickListener
		{

			public static android.view.View.OnClickListener lambdaFactory$(SurveyTasksFragment.AddCards addcards)
			{
				return ((android.view.View.OnClickListener) (((.Lambda._cls1) (addcards)). new .Lambda._cls1()));
			//    0    0:new             #2   <Class SurveyTasksFragment$AddCards$$Lambda$1>
			//    1    3:dup             
			//    2    4:aload_0         
			//    3    5:invokespecial   #20  <Method void SurveyTasksFragment$AddCards$$Lambda$1(SurveyTasksFragment$AddCards)>
			//    4    8:areturn         
			}

			public void onClick(View view)
			{
				SurveyTasksFragment.AddCards.lambda$invoke$53(arg$1, view);
			//    0    0:aload_0         
			//    1    1:getfield        #15  <Field SurveyTasksFragment$AddCards arg$1>
			//    2    4:aload_1         
			//    3    5:invokestatic    #28  <Method void SurveyTasksFragment$AddCards.lambda$invoke$53(SurveyTasksFragment$AddCards, View)>
			//    4    8:return          
			}

			private final SurveyTasksFragment.AddCards arg$1;

			private .Lambda._cls1()
			{
			//    0    0:aload_0         
			//    1    1:invokespecial   #13  <Method void Object()>
				arg$1 = SurveyTasksFragment.AddCards.this;
			//    2    4:aload_0         
			//    3    5:aload_1         
			//    4    6:putfield        #15  <Field SurveyTasksFragment$AddCards arg$1>
			//    5    9:return          
			}
		}

		createAndAddToDoCard(ppdSurvey.getName(), .Lambda._cls1.lambdaFactory.(this));
	//   49  117:aload_0         
	//   50  118:aload_0         
	//   51  119:getfield        #258 <Field Survey ppdSurvey>
	//   52  122:invokevirtual   #139 <Method String Survey.getName()>
	//   53  125:aload_0         
	//   54  126:invokestatic    #263 <Method android.view.View$OnClickListener SurveyTasksFragment$AddCards$$Lambda$1.lambdaFactory$(SurveyTasksFragment$AddCards)>
	//   55  129:invokespecial   #149 <Method void createAndAddToDoCard(String, android.view.View$OnClickListener)>
_L3:
		if(PpdResultsStorage.areHealthEconomicQuestionnairesAvailable(((StudyId) (obj1))) && obj1 == StudyId.US)
	//*  56  132:aload           4
	//*  57  134:invokestatic    #269 <Method boolean PpdResultsStorage.areHealthEconomicQuestionnairesAvailable(StudyId)>
	//*  58  137:ifeq            154
	//*  59  140:aload           4
	//*  60  142:getstatic       #273 <Field StudyId StudyId.US>
	//*  61  145:if_acmpne       154
			addHealthEconomicsCards(((StudyId) (obj1)));
	//   62  148:aload_0         
	//   63  149:aload           4
	//   64  151:invokespecial   #275 <Method void addHealthEconomicsCards(StudyId)>
		class .Lambda._cls3
			implements android.view.View.OnClickListener
		{

			public static android.view.View.OnClickListener lambdaFactory$(SurveyTasksFragment.AddCards addcards)
			{
				return ((android.view.View.OnClickListener) (((.Lambda._cls3) (addcards)). new .Lambda._cls3()));
			//    0    0:new             #2   <Class SurveyTasksFragment$AddCards$$Lambda$3>
			//    1    3:dup             
			//    2    4:aload_0         
			//    3    5:invokespecial   #20  <Method void SurveyTasksFragment$AddCards$$Lambda$3(SurveyTasksFragment$AddCards)>
			//    4    8:areturn         
			}

			public void onClick(View view)
			{
				SurveyTasksFragment.AddCards.lambda$invoke$55(arg$1, view);
			//    0    0:aload_0         
			//    1    1:getfield        #15  <Field SurveyTasksFragment$AddCards arg$1>
			//    2    4:aload_1         
			//    3    5:invokestatic    #28  <Method void SurveyTasksFragment$AddCards.lambda$invoke$55(SurveyTasksFragment$AddCards, View)>
			//    4    8:return          
			}

			private final SurveyTasksFragment.AddCards arg$1;

			private .Lambda._cls3()
			{
			//    0    0:aload_0         
			//    1    1:invokespecial   #13  <Method void Object()>
				arg$1 = SurveyTasksFragment.AddCards.this;
			//    2    4:aload_0         
			//    3    5:aload_1         
			//    4    6:putfield        #15  <Field SurveyTasksFragment$AddCards arg$1>
			//    5    9:return          
			}
		}

		if(PpdResultsStorage.getDnaModuleEnabled(((StudyId) (obj1))))
	//*  65  154:aload           4
	//*  66  156:invokestatic    #278 <Method boolean PpdResultsStorage.getDnaModuleEnabled(StudyId)>
	//*  67  159:ifeq            344
			if(PpdResultsStorage.hasGivenDnaConsent(((StudyId) (obj1))))
	//*  68  162:aload           4
	//*  69  164:invokestatic    #281 <Method boolean PpdResultsStorage.hasGivenDnaConsent(StudyId)>
	//*  70  167:ifeq            589
			{
				addCompletedCard((new DashboardCardBuilder()).label((new StringBuilder()).append(Res.getStudySpecificString(0x7f080212)).append("\n").append(Res.getRegularString(0x7f080080)).toString()).completed(true).buildCard(((android.view.ViewGroup) (SurveyTasksFragment.access$100(SurveyTasksFragment.this).container))));
	//   71  170:aload_0         
	//   72  171:new             #167 <Class DashboardCardBuilder>
	//   73  174:dup             
	//   74  175:invokespecial   #168 <Method void DashboardCardBuilder()>
	//   75  178:new             #170 <Class StringBuilder>
	//   76  181:dup             
	//   77  182:invokespecial   #171 <Method void StringBuilder()>
	//   78  185:ldc2            #282 <Int 0x7f080212>
	//   79  188:invokestatic    #285 <Method String Res.getStudySpecificString(int)>
	//   80  191:invokevirtual   #175 <Method StringBuilder StringBuilder.append(String)>
	//   81  194:ldc1            #177 <String "\n">
	//   82  196:invokevirtual   #175 <Method StringBuilder StringBuilder.append(String)>
	//   83  199:ldc1            #181 <Int 0x7f080080>
	//   84  201:invokestatic    #187 <Method String Res.getRegularString(int)>
	//   85  204:invokevirtual   #175 <Method StringBuilder StringBuilder.append(String)>
	//   86  207:invokevirtual   #190 <Method String StringBuilder.toString()>
	//   87  210:invokevirtual   #194 <Method DashboardCardBuilder DashboardCardBuilder.label(String)>
	//   88  213:iconst_1        
	//   89  214:invokevirtual   #198 <Method DashboardCardBuilder DashboardCardBuilder.completed(boolean)>
	//   90  217:aload_0         
	//   91  218:getfield        #24  <Field SurveyTasksFragment this$0>
	//   92  221:invokestatic    #41  <Method FragmentSurveyTasksBinding SurveyTasksFragment.access$100(SurveyTasksFragment)>
	//   93  224:getfield        #47  <Field LinearLayout FragmentSurveyTasksBinding.container>
	//   94  227:invokevirtual   #202 <Method View DashboardCardBuilder.buildCard(android.view.ViewGroup)>
	//   95  230:invokespecial   #204 <Method void addCompletedCard(View)>
				class .Lambda._cls2
					implements android.view.View.OnClickListener
				{

					public static android.view.View.OnClickListener lambdaFactory$(SurveyTasksFragment.AddCards addcards)
					{
						return ((android.view.View.OnClickListener) (((.Lambda._cls2) (addcards)). new .Lambda._cls2()));
					//    0    0:new             #2   <Class SurveyTasksFragment$AddCards$$Lambda$2>
					//    1    3:dup             
					//    2    4:aload_0         
					//    3    5:invokespecial   #20  <Method void SurveyTasksFragment$AddCards$$Lambda$2(SurveyTasksFragment$AddCards)>
					//    4    8:areturn         
					}

					public void onClick(View view)
					{
						SurveyTasksFragment.AddCards.lambda$invoke$54(arg$1, view);
					//    0    0:aload_0         
					//    1    1:getfield        #15  <Field SurveyTasksFragment$AddCards arg$1>
					//    2    4:aload_1         
					//    3    5:invokestatic    #28  <Method void SurveyTasksFragment$AddCards.lambda$invoke$54(SurveyTasksFragment$AddCards, View)>
					//    4    8:return          
					}

					private final SurveyTasksFragment.AddCards arg$1;

			private .Lambda._cls2()
			{
			//    0    0:aload_0         
			//    1    1:invokespecial   #13  <Method void Object()>
				arg$1 = SurveyTasksFragment.AddCards.this;
			//    2    4:aload_0         
			//    3    5:aload_1         
			//    4    6:putfield        #15  <Field SurveyTasksFragment$AddCards arg$1>
			//    5    9:return          
			}
				}

				if(PpdResultsStorage.hasSentDnaKitBack(((StudyId) (obj1))))
	//*  96  233:aload           4
	//*  97  235:invokestatic    #288 <Method boolean PpdResultsStorage.hasSentDnaKitBack(StudyId)>
	//*  98  238:ifeq            572
				{
					Object obj2 = ((Object) (PpdResultsStorage.getDnaKitBackProgress(Res.getStudyId())));
	//   99  241:invokestatic    #254 <Method StudyId Res.getStudyId()>
	//  100  244:invokestatic    #292 <Method ProgressStatus PpdResultsStorage.getDnaKitBackProgress(StudyId)>
	//  101  247:astore          4
					obj3 = ((Object) (new DashboardCardBuilder()));
	//  102  249:new             #167 <Class DashboardCardBuilder>
	//  103  252:dup             
	//  104  253:invokespecial   #168 <Method void DashboardCardBuilder()>
	//  105  256:astore          5
					StringBuilder stringbuilder = (new StringBuilder()).append(Res.getStudySpecificString(0x7f080256)).append("\n");
	//  106  258:new             #170 <Class StringBuilder>
	//  107  261:dup             
	//  108  262:invokespecial   #171 <Method void StringBuilder()>
	//  109  265:ldc2            #293 <Int 0x7f080256>
	//  110  268:invokestatic    #285 <Method String Res.getStudySpecificString(int)>
	//  111  271:invokevirtual   #175 <Method StringBuilder StringBuilder.append(String)>
	//  112  274:ldc1            #177 <String "\n">
	//  113  276:invokevirtual   #175 <Method StringBuilder StringBuilder.append(String)>
	//  114  279:astore          6
					int i;
					boolean flag;
					ParseException parseexception;
					if(obj2 == ProgressStatus.Completed)
	//* 115  281:aload           4
	//* 116  283:getstatic       #296 <Field ProgressStatus ProgressStatus.Completed>
	//* 117  286:if_acmpne       560
						i = 0x7f080370;
	//  118  289:ldc1            #205 <Int 0x7f080370>
	//  119  291:istore_1        
					else
	//* 120  292:aload           5
	//* 121  294:aload           6
	//* 122  296:iload_1         
	//* 123  297:invokestatic    #187 <Method String Res.getRegularString(int)>
	//* 124  300:invokevirtual   #175 <Method StringBuilder StringBuilder.append(String)>
	//* 125  303:invokevirtual   #190 <Method String StringBuilder.toString()>
	//* 126  306:invokevirtual   #194 <Method DashboardCardBuilder DashboardCardBuilder.label(String)>
	//* 127  309:astore          5
	//* 128  311:aload           4
	//* 129  313:getstatic       #180 <Field ProgressStatus ProgressStatus.Uploaded>
	//* 130  316:if_acmpne       567
	//* 131  319:iconst_1        
	//* 132  320:istore_2        
	//* 133  321:aload_0         
	//* 134  322:aload           5
	//* 135  324:iload_2         
	//* 136  325:invokevirtual   #198 <Method DashboardCardBuilder DashboardCardBuilder.completed(boolean)>
	//* 137  328:aload_0         
	//* 138  329:getfield        #24  <Field SurveyTasksFragment this$0>
	//* 139  332:invokestatic    #41  <Method FragmentSurveyTasksBinding SurveyTasksFragment.access$100(SurveyTasksFragment)>
	//* 140  335:getfield        #47  <Field LinearLayout FragmentSurveyTasksBinding.container>
	//* 141  338:invokevirtual   #202 <Method View DashboardCardBuilder.buildCard(android.view.ViewGroup)>
	//* 142  341:invokespecial   #204 <Method void addCompletedCard(View)>
	//* 143  344:aload_0         
	//* 144  345:getfield        #29  <Field boolean hasTodoCards>
	//* 145  348:ifne            606
	//* 146  351:new             #167 <Class DashboardCardBuilder>
	//* 147  354:dup             
	//* 148  355:invokespecial   #168 <Method void DashboardCardBuilder()>
	//* 149  358:ldc2            #297 <Int 0x7f080342>
	//* 150  361:invokestatic    #285 <Method String Res.getStudySpecificString(int)>
	//* 151  364:invokevirtual   #194 <Method DashboardCardBuilder DashboardCardBuilder.label(String)>
	//* 152  367:aload_0         
	//* 153  368:getfield        #24  <Field SurveyTasksFragment this$0>
	//* 154  371:invokestatic    #41  <Method FragmentSurveyTasksBinding SurveyTasksFragment.access$100(SurveyTasksFragment)>
	//* 155  374:getfield        #47  <Field LinearLayout FragmentSurveyTasksBinding.container>
	//* 156  377:invokevirtual   #202 <Method View DashboardCardBuilder.buildCard(android.view.ViewGroup)>
	//* 157  380:astore_3        
	//* 158  381:new             #299 <Class android.widget.LinearLayout$LayoutParams>
	//* 159  384:dup             
	//* 160  385:aload_3         
	//* 161  386:invokevirtual   #303 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//* 162  389:invokespecial   #306 <Method void android.widget.LinearLayout$LayoutParams(android.view.ViewGroup$LayoutParams)>
	//* 163  392:astore          4
	//* 164  394:aload           4
	//* 165  396:aload_0         
	//* 166  397:getfield        #24  <Field SurveyTasksFragment this$0>
	//* 167  400:invokevirtual   #310 <Method Context SurveyTasksFragment.getContext()>
	//* 168  403:invokevirtual   #316 <Method Resources Context.getResources()>
	//* 169  406:ldc2            #317 <Int 0x7f0900a4>
	//* 170  409:invokevirtual   #323 <Method float Resources.getDimension(int)>
	//* 171  412:f2i             
	//* 172  413:putfield        #326 <Field int android.widget.LinearLayout$LayoutParams.topMargin>
	//* 173  416:aload_3         
	//* 174  417:aload           4
	//* 175  419:invokevirtual   #329 <Method void View.setLayoutParams(android.view.ViewGroup$LayoutParams)>
	//* 176  422:aload_0         
	//* 177  423:getfield        #24  <Field SurveyTasksFragment this$0>
	//* 178  426:invokestatic    #41  <Method FragmentSurveyTasksBinding SurveyTasksFragment.access$100(SurveyTasksFragment)>
	//* 179  429:getfield        #47  <Field LinearLayout FragmentSurveyTasksBinding.container>
	//* 180  432:astore          4
	//* 181  434:aload_0         
	//* 182  435:getfield        #215 <Field int todoIndex>
	//* 183  438:iconst_1        
	//* 184  439:iadd            
	//* 185  440:istore_1        
	//* 186  441:aload_0         
	//* 187  442:iload_1         
	//* 188  443:putfield        #215 <Field int todoIndex>
	//* 189  446:aload           4
	//* 190  448:aload_3         
	//* 191  449:iload_1         
	//* 192  450:invokevirtual   #55  <Method void LinearLayout.addView(View, int)>
	//* 193  453:aload_0         
	//* 194  454:getfield        #24  <Field SurveyTasksFragment this$0>
	//* 195  457:invokestatic    #41  <Method FragmentSurveyTasksBinding SurveyTasksFragment.access$100(SurveyTasksFragment)>
	//* 196  460:getfield        #47  <Field LinearLayout FragmentSurveyTasksBinding.container>
	//* 197  463:aload_0         
	//* 198  464:getfield        #215 <Field int todoIndex>
	//* 199  467:iconst_1        
	//* 200  468:isub            
	//* 201  469:invokevirtual   #333 <Method View LinearLayout.getChildAt(int)>
	//* 202  472:bipush          8
	//* 203  474:invokevirtual   #334 <Method void View.setVisibility(int)>
	//* 204  477:aload_0         
	//* 205  478:aload_0         
	//* 206  479:getfield        #49  <Field int completedIndex>
	//* 207  482:iconst_1        
	//* 208  483:iadd            
	//* 209  484:putfield        #49  <Field int completedIndex>
	//* 210  487:aload_0         
	//* 211  488:getfield        #24  <Field SurveyTasksFragment this$0>
	//* 212  491:invokestatic    #59  <Method List SurveyTasksFragment.access$200(SurveyTasksFragment)>
	//* 213  494:aload_3         
	//* 214  495:invokevirtual   #65  <Method int View.getId()>
	//* 215  498:invokestatic    #71  <Method Integer Integer.valueOf(int)>
	//* 216  501:invokeinterface #77  <Method boolean List.add(Object)>
	//* 217  506:pop             
	//* 218  507:aload_0         
	//* 219  508:getfield        #31  <Field boolean hasCompletedCards>
	//* 220  511:ifne            529
	//* 221  514:aload_0         
	//* 222  515:getfield        #24  <Field SurveyTasksFragment this$0>
	//* 223  518:invokestatic    #41  <Method FragmentSurveyTasksBinding SurveyTasksFragment.access$100(SurveyTasksFragment)>
	//* 224  521:getfield        #244 <Field TextView FragmentSurveyTasksBinding.completedLabel>
	//* 225  524:bipush          8
	//* 226  526:invokevirtual   #250 <Method void TextView.setVisibility(int)>
	//* 227  529:return          
	//* 228  530:aload_0         
	//* 229  531:aload_0         
	//* 230  532:getfield        #258 <Field Survey ppdSurvey>
	//* 231  535:invokevirtual   #139 <Method String Survey.getName()>
	//* 232  538:aload           5
	//* 233  540:invokespecial   #153 <Method void createAndAddCompletedCard(String, ProgressStatus)>
	//* 234  543:goto            132
	//* 235  546:astore          5
	//* 236  548:ldc1            #155 <String "SurveyTasksFragment">
	//* 237  550:ldc2            #336 <String "onCreateView: couldn't load ppd ppdSurvey">
	//* 238  553:invokestatic    #165 <Method int Log.e(String, String)>
	//* 239  556:pop             
	//* 240  557:goto            132
						i = 0x7f08002d;
	//  241  560:ldc2            #337 <Int 0x7f08002d>
	//  242  563:istore_1        
					obj3 = ((Object) (((DashboardCardBuilder) (obj3)).label(stringbuilder.append(Res.getRegularString(i)).toString())));
					if(obj2 == ProgressStatus.Uploaded)
						flag = true;
					else
	//* 243  564:goto            292
						flag = false;
	//  244  567:iconst_0        
	//  245  568:istore_2        
					addCompletedCard(((DashboardCardBuilder) (obj3)).completed(flag).buildCard(((android.view.ViewGroup) (SurveyTasksFragment.access$100(SurveyTasksFragment.this).container))));
				} else
	//* 246  569:goto            321
				{
					createAndAddToDoCard(Res.getStudySpecificString(0x7f080208), .Lambda._cls2.lambdaFactory.(this));
	//  247  572:aload_0         
	//  248  573:ldc2            #338 <Int 0x7f080208>
	//  249  576:invokestatic    #285 <Method String Res.getStudySpecificString(int)>
	//  250  579:aload_0         
	//  251  580:invokestatic    #341 <Method android.view.View$OnClickListener SurveyTasksFragment$AddCards$$Lambda$2.lambdaFactory$(SurveyTasksFragment$AddCards)>
	//  252  583:invokespecial   #149 <Method void createAndAddToDoCard(String, android.view.View$OnClickListener)>
				}
			} else
	//* 253  586:goto            344
			{
				createAndAddToDoCard(Res.getStudySpecificString(0x7f080212), .Lambda._cls3.lambdaFactory.(this));
	//  254  589:aload_0         
	//  255  590:ldc2            #282 <Int 0x7f080212>
	//  256  593:invokestatic    #285 <Method String Res.getStudySpecificString(int)>
	//  257  596:aload_0         
	//  258  597:invokestatic    #344 <Method android.view.View$OnClickListener SurveyTasksFragment$AddCards$$Lambda$3.lambdaFactory$(SurveyTasksFragment$AddCards)>
	//  259  600:invokespecial   #149 <Method void createAndAddToDoCard(String, android.view.View$OnClickListener)>
			}
		if(!hasTodoCards)
		{
			obj = ((Object) ((new DashboardCardBuilder()).label(Res.getStudySpecificString(0x7f080342)).buildCard(((android.view.ViewGroup) (SurveyTasksFragment.access$100(SurveyTasksFragment.this).container)))));
			obj2 = ((Object) (new android.widget.LinearLayout.LayoutParams(((View) (obj)).getLayoutParams())));
			obj2.topMargin = (int)getContext().getResources().getDimension(0x7f0900a4);
			((View) (obj)).setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj2)));
			obj2 = ((Object) (SurveyTasksFragment.access$100(SurveyTasksFragment.this).container));
			i = todoIndex + 1;
			todoIndex = i;
			((LinearLayout) (obj2)).addView(((View) (obj)), i);
			SurveyTasksFragment.access$100(SurveyTasksFragment.this).container.getChildAt(todoIndex - 1).setVisibility(8);
			completedIndex = completedIndex + 1;
			SurveyTasksFragment.access$200(SurveyTasksFragment.this).add(((Object) (Integer.valueOf(((View) (obj)).getId()))));
		} else
	//* 260  603:goto            344
		{
			((View) (obj)).setVisibility(0);
	//  261  606:aload_3         
	//  262  607:iconst_0        
	//  263  608:invokevirtual   #334 <Method void View.setVisibility(int)>
		}
		if(!hasCompletedCards)
			SurveyTasksFragment.access$100(SurveyTasksFragment.this).completedLabel.setVisibility(8);
		return;
_L2:
		createAndAddCompletedCard(ppdSurvey.getName(), ((ProgressStatus) (obj3)));
		  goto _L3
		parseexception;
_L4:
		Log.e("SurveyTasksFragment", "onCreateView: couldn't load ppd ppdSurvey");
		  goto _L3
	//* 264  611:goto            507
		SurveyParsingException surveyparsingexception;
		surveyparsingexception;
	//  265  614:astore          5
		  goto _L4
	//* 266  616:goto            548
	}

	int completedIndex;
	boolean hasCompletedCards;
	boolean hasTodoCards;
	Survey ppdSurvey;
	final SurveyTasksFragment this$0;
	int todoIndex;

	private SurveyTasksFragment$AddCards()
	{
		this$0 = SurveyTasksFragment.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #24  <Field SurveyTasksFragment this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #27  <Method void Object()>
		hasTodoCards = false;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #29  <Field boolean hasTodoCards>
		hasCompletedCards = false;
	//    8   14:aload_0         
	//    9   15:iconst_0        
	//   10   16:putfield        #31  <Field boolean hasCompletedCards>
	//   11   19:return          
	}

	SurveyTasksFragment$AddCards(SurveyTasksFragment._cls1 _pcls1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #35  <Method void SurveyTasksFragment$AddCards(SurveyTasksFragment)>
	//    3    5:return          
	}
}
