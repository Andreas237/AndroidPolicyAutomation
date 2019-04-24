// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.pactforcure.app.consent;

import com.pactforcure.app.core.BackboneApplication;
import com.pactforcure.app.studies.Res;
import java.util.*;
import org.researchstack.backbone.answerformat.ChoiceAnswerFormat;
import org.researchstack.backbone.model.*;
import org.researchstack.backbone.result.StepResult;
import org.researchstack.backbone.result.TaskResult;
import org.researchstack.backbone.step.*;
import org.researchstack.backbone.task.OrderedTask;
import org.researchstack.backbone.ui.step.layout.ConsentSignatureStepLayout;

// Referenced classes of package com.pactforcure.app.consent:
//			ConsentReviewStepsFactory, GeneralConsentTuple

public class GeneralConsentTask extends OrderedTask
{

	public GeneralConsentTask(String s, List list)
	{
		super(s, list);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #84  <Method void OrderedTask(String, List)>
	//    4    6:return          
	}

	public static GeneralConsentTuple buildConsentTask()
	{
		ConsentDocument consentdocument = new ConsentDocument();
	//    0    0:new             #91  <Class ConsentDocument>
	//    1    3:dup             
	//    2    4:invokespecial   #94  <Method void ConsentDocument()>
	//    3    7:astore_0        
		consentdocument.setTitle(Res.getStudySpecificString(0x7f080295));
	//    4    8:aload_0         
	//    5    9:ldc1            #95  <Int 0x7f080295>
	//    6   11:invokestatic    #101 <Method String Res.getStudySpecificString(int)>
	//    7   14:invokevirtual   #105 <Method void ConsentDocument.setTitle(String)>
		consentdocument.setSignaturePageTitle(0x7f080056);
	//    8   17:aload_0         
	//    9   18:ldc1            #106 <Int 0x7f080056>
	//   10   20:invokevirtual   #110 <Method void ConsentDocument.setSignaturePageTitle(int)>
		consentdocument.setHtmlReviewContent(Res.getStudySpecificRawAsString(0x7f070011));
	//   11   23:aload_0         
	//   12   24:ldc1            #111 <Int 0x7f070011>
	//   13   26:invokestatic    #114 <Method String Res.getStudySpecificRawAsString(int)>
	//   14   29:invokevirtual   #117 <Method void ConsentDocument.setHtmlReviewContent(String)>
		InstructionStep instructionstep = new InstructionStep("VisualConsentIntroStep", Res.getRegularString(0x7f080376), Res.getStudySpecificString(0x7f08027f));
	//   15   32:new             #119 <Class InstructionStep>
	//   16   35:dup             
	//   17   36:ldc1            #74  <String "VisualConsentIntroStep">
	//   18   38:ldc1            #120 <Int 0x7f080376>
	//   19   40:invokestatic    #123 <Method String Res.getRegularString(int)>
	//   20   43:ldc1            #124 <Int 0x7f08027f>
	//   21   45:invokestatic    #101 <Method String Res.getStudySpecificString(int)>
	//   22   48:invokespecial   #127 <Method void InstructionStep(String, String, String)>
	//   23   51:astore_1        
		instructionstep.setStepTitle(0x7f080376);
	//   24   52:aload_1         
	//   25   53:ldc1            #120 <Int 0x7f080376>
	//   26   55:invokevirtual   #130 <Method void InstructionStep.setStepTitle(int)>
		instructionstep.setPositiveButtonTitleResId(0x7f08007c);
	//   27   58:aload_1         
	//   28   59:ldc1            #131 <Int 0x7f08007c>
	//   29   61:invokevirtual   #134 <Method void InstructionStep.setPositiveButtonTitleResId(int)>
		instructionstep.setAllowsBackNavigation(false);
	//   30   64:aload_1         
	//   31   65:iconst_0        
	//   32   66:invokevirtual   #138 <Method void InstructionStep.setAllowsBackNavigation(boolean)>
		Object obj = ((Object) (new ConsentSection(org.researchstack.backbone.model.ConsentSection.Type.Custom)));
	//   33   69:new             #140 <Class ConsentSection>
	//   34   72:dup             
	//   35   73:getstatic       #146 <Field org.researchstack.backbone.model.ConsentSection$Type org.researchstack.backbone.model.ConsentSection$Type.Custom>
	//   36   76:invokespecial   #149 <Method void ConsentSection(org.researchstack.backbone.model.ConsentSection$Type)>
	//   37   79:astore_3        
		((ConsentSection) (obj)).setTitle(Res.getStudySpecificString(0x7f080288));
	//   38   80:aload_3         
	//   39   81:ldc1            #150 <Int 0x7f080288>
	//   40   83:invokestatic    #101 <Method String Res.getStudySpecificString(int)>
	//   41   86:invokevirtual   #151 <Method void ConsentSection.setTitle(String)>
		((ConsentSection) (obj)).setSummary(Res.getStudySpecificString(0x7f080287));
	//   42   89:aload_3         
	//   43   90:ldc1            #152 <Int 0x7f080287>
	//   44   92:invokestatic    #101 <Method String Res.getStudySpecificString(int)>
	//   45   95:invokevirtual   #155 <Method void ConsentSection.setSummary(String)>
		((ConsentSection) (obj)).setHtmlContent(Res.getStudySpecificString(0x7f080285));
	//   46   98:aload_3         
	//   47   99:ldc1            #156 <Int 0x7f080285>
	//   48  101:invokestatic    #101 <Method String Res.getStudySpecificString(int)>
	//   49  104:invokevirtual   #159 <Method void ConsentSection.setHtmlContent(String)>
		ConsentVisualStep consentvisualstep = new ConsentVisualStep("visual_consent_identifier");
	//   50  107:new             #161 <Class ConsentVisualStep>
	//   51  110:dup             
	//   52  111:ldc1            #47  <String "visual_consent_identifier">
	//   53  113:invokespecial   #163 <Method void ConsentVisualStep(String)>
	//   54  116:astore_2        
		consentvisualstep.setNextButtonString(Res.getRegularString(0x7f080075));
	//   55  117:aload_2         
	//   56  118:ldc1            #164 <Int 0x7f080075>
	//   57  120:invokestatic    #123 <Method String Res.getRegularString(int)>
	//   58  123:invokevirtual   #167 <Method void ConsentVisualStep.setNextButtonString(String)>
		consentvisualstep.setSection(((ConsentSection) (obj)));
	//   59  126:aload_2         
	//   60  127:aload_3         
	//   61  128:invokevirtual   #171 <Method void ConsentVisualStep.setSection(ConsentSection)>
		Object obj1 = ((Object) (new ConsentSection(org.researchstack.backbone.model.ConsentSection.Type.Custom)));
	//   62  131:new             #140 <Class ConsentSection>
	//   63  134:dup             
	//   64  135:getstatic       #146 <Field org.researchstack.backbone.model.ConsentSection$Type org.researchstack.backbone.model.ConsentSection$Type.Custom>
	//   65  138:invokespecial   #149 <Method void ConsentSection(org.researchstack.backbone.model.ConsentSection$Type)>
	//   66  141:astore          4
		((ConsentSection) (obj1)).setTitle(Res.getStudySpecificString(0x7f08028a));
	//   67  143:aload           4
	//   68  145:ldc1            #172 <Int 0x7f08028a>
	//   69  147:invokestatic    #101 <Method String Res.getStudySpecificString(int)>
	//   70  150:invokevirtual   #151 <Method void ConsentSection.setTitle(String)>
		((ConsentSection) (obj1)).setSummary(Res.getStudySpecificString(0x7f080289));
	//   71  153:aload           4
	//   72  155:ldc1            #173 <Int 0x7f080289>
	//   73  157:invokestatic    #101 <Method String Res.getStudySpecificString(int)>
	//   74  160:invokevirtual   #155 <Method void ConsentSection.setSummary(String)>
		obj = ((Object) (new ConsentVisualStep("why_quiz_identifier")));
	//   75  163:new             #161 <Class ConsentVisualStep>
	//   76  166:dup             
	//   77  167:ldc1            #77  <String "why_quiz_identifier">
	//   78  169:invokespecial   #163 <Method void ConsentVisualStep(String)>
	//   79  172:astore_3        
		((ConsentVisualStep) (obj)).setNextButtonString(Res.getRegularString(0x7f080075));
	//   80  173:aload_3         
	//   81  174:ldc1            #164 <Int 0x7f080075>
	//   82  176:invokestatic    #123 <Method String Res.getRegularString(int)>
	//   83  179:invokevirtual   #167 <Method void ConsentVisualStep.setNextButtonString(String)>
		((ConsentVisualStep) (obj)).setSection(((ConsentSection) (obj1)));
	//   84  182:aload_3         
	//   85  183:aload           4
	//   86  185:invokevirtual   #171 <Method void ConsentVisualStep.setSection(ConsentSection)>
		Object obj2 = ((Object) (new ConsentSection(org.researchstack.backbone.model.ConsentSection.Type.DataGathering)));
	//   87  188:new             #140 <Class ConsentSection>
	//   88  191:dup             
	//   89  192:getstatic       #176 <Field org.researchstack.backbone.model.ConsentSection$Type org.researchstack.backbone.model.ConsentSection$Type.DataGathering>
	//   90  195:invokespecial   #149 <Method void ConsentSection(org.researchstack.backbone.model.ConsentSection$Type)>
	//   91  198:astore          5
		((ConsentSection) (obj2)).setTitle(Res.getStudySpecificString(0x7f08025c));
	//   92  200:aload           5
	//   93  202:ldc1            #177 <Int 0x7f08025c>
	//   94  204:invokestatic    #101 <Method String Res.getStudySpecificString(int)>
	//   95  207:invokevirtual   #151 <Method void ConsentSection.setTitle(String)>
		((ConsentSection) (obj2)).setSummary(Res.getStudySpecificString(0x7f08025b));
	//   96  210:aload           5
	//   97  212:ldc1            #178 <Int 0x7f08025b>
	//   98  214:invokestatic    #101 <Method String Res.getStudySpecificString(int)>
	//   99  217:invokevirtual   #155 <Method void ConsentSection.setSummary(String)>
		((ConsentSection) (obj2)).setHtmlContent(Res.getStudySpecificString(0x7f08025a));
	//  100  220:aload           5
	//  101  222:ldc1            #179 <Int 0x7f08025a>
	//  102  224:invokestatic    #101 <Method String Res.getStudySpecificString(int)>
	//  103  227:invokevirtual   #159 <Method void ConsentSection.setHtmlContent(String)>
		obj1 = ((Object) (new ConsentVisualStep("data_gathering_consent_identifier")));
	//  104  230:new             #161 <Class ConsentVisualStep>
	//  105  233:dup             
	//  106  234:ldc1            #41  <String "data_gathering_consent_identifier">
	//  107  236:invokespecial   #163 <Method void ConsentVisualStep(String)>
	//  108  239:astore          4
		((ConsentVisualStep) (obj1)).setSection(((ConsentSection) (obj2)));
	//  109  241:aload           4
	//  110  243:aload           5
	//  111  245:invokevirtual   #171 <Method void ConsentVisualStep.setSection(ConsentSection)>
		((ConsentVisualStep) (obj1)).setNextButtonString(Res.getRegularString(0x7f080075));
	//  112  248:aload           4
	//  113  250:ldc1            #164 <Int 0x7f080075>
	//  114  252:invokestatic    #123 <Method String Res.getRegularString(int)>
	//  115  255:invokevirtual   #167 <Method void ConsentVisualStep.setNextButtonString(String)>
		Object obj3 = ((Object) (new ConsentSection(org.researchstack.backbone.model.ConsentSection.Type.Privacy)));
	//  116  258:new             #140 <Class ConsentSection>
	//  117  261:dup             
	//  118  262:getstatic       #182 <Field org.researchstack.backbone.model.ConsentSection$Type org.researchstack.backbone.model.ConsentSection$Type.Privacy>
	//  119  265:invokespecial   #149 <Method void ConsentSection(org.researchstack.backbone.model.ConsentSection$Type)>
	//  120  268:astore          6
		((ConsentSection) (obj3)).setTitle(Res.getStudySpecificString(0x7f080268));
	//  121  270:aload           6
	//  122  272:ldc1            #183 <Int 0x7f080268>
	//  123  274:invokestatic    #101 <Method String Res.getStudySpecificString(int)>
	//  124  277:invokevirtual   #151 <Method void ConsentSection.setTitle(String)>
		((ConsentSection) (obj3)).setSummary(Res.getStudySpecificString(0x7f080267));
	//  125  280:aload           6
	//  126  282:ldc1            #184 <Int 0x7f080267>
	//  127  284:invokestatic    #101 <Method String Res.getStudySpecificString(int)>
	//  128  287:invokevirtual   #155 <Method void ConsentSection.setSummary(String)>
		((ConsentSection) (obj3)).setHtmlContent(Res.getStudySpecificString(0x7f080265));
	//  129  290:aload           6
	//  130  292:ldc1            #185 <Int 0x7f080265>
	//  131  294:invokestatic    #101 <Method String Res.getStudySpecificString(int)>
	//  132  297:invokevirtual   #159 <Method void ConsentSection.setHtmlContent(String)>
		obj2 = ((Object) (new ConsentVisualStep("privacy_consent_identifier")));
	//  133  300:new             #161 <Class ConsentVisualStep>
	//  134  303:dup             
	//  135  304:ldc1            #56  <String "privacy_consent_identifier">
	//  136  306:invokespecial   #163 <Method void ConsentVisualStep(String)>
	//  137  309:astore          5
		((ConsentVisualStep) (obj2)).setSection(((ConsentSection) (obj3)));
	//  138  311:aload           5
	//  139  313:aload           6
	//  140  315:invokevirtual   #171 <Method void ConsentVisualStep.setSection(ConsentSection)>
		((ConsentVisualStep) (obj2)).setNextButtonString(Res.getRegularString(0x7f080075));
	//  141  318:aload           5
	//  142  320:ldc1            #164 <Int 0x7f080075>
	//  143  322:invokestatic    #123 <Method String Res.getRegularString(int)>
	//  144  325:invokevirtual   #167 <Method void ConsentVisualStep.setNextButtonString(String)>
		Object obj4 = ((Object) (new ConsentSection(org.researchstack.backbone.model.ConsentSection.Type.DataUse)));
	//  145  328:new             #140 <Class ConsentSection>
	//  146  331:dup             
	//  147  332:getstatic       #188 <Field org.researchstack.backbone.model.ConsentSection$Type org.researchstack.backbone.model.ConsentSection$Type.DataUse>
	//  148  335:invokespecial   #149 <Method void ConsentSection(org.researchstack.backbone.model.ConsentSection$Type)>
	//  149  338:astore          7
		((ConsentSection) (obj4)).setTitle(Res.getStudySpecificString(0x7f080260));
	//  150  340:aload           7
	//  151  342:ldc1            #189 <Int 0x7f080260>
	//  152  344:invokestatic    #101 <Method String Res.getStudySpecificString(int)>
	//  153  347:invokevirtual   #151 <Method void ConsentSection.setTitle(String)>
		((ConsentSection) (obj4)).setSummary(Res.getStudySpecificString(0x7f08025f));
	//  154  350:aload           7
	//  155  352:ldc1            #190 <Int 0x7f08025f>
	//  156  354:invokestatic    #101 <Method String Res.getStudySpecificString(int)>
	//  157  357:invokevirtual   #155 <Method void ConsentSection.setSummary(String)>
		((ConsentSection) (obj4)).setHtmlContent(Res.getStudySpecificString(0x7f08025d));
	//  158  360:aload           7
	//  159  362:ldc1            #191 <Int 0x7f08025d>
	//  160  364:invokestatic    #101 <Method String Res.getStudySpecificString(int)>
	//  161  367:invokevirtual   #159 <Method void ConsentSection.setHtmlContent(String)>
		obj3 = ((Object) (new ConsentVisualStep("data_use_consent_identifier")));
	//  162  370:new             #161 <Class ConsentVisualStep>
	//  163  373:dup             
	//  164  374:ldc1            #44  <String "data_use_consent_identifier">
	//  165  376:invokespecial   #163 <Method void ConsentVisualStep(String)>
	//  166  379:astore          6
		((ConsentVisualStep) (obj3)).setSection(((ConsentSection) (obj4)));
	//  167  381:aload           6
	//  168  383:aload           7
	//  169  385:invokevirtual   #171 <Method void ConsentVisualStep.setSection(ConsentSection)>
		((ConsentVisualStep) (obj3)).setNextButtonString(Res.getRegularString(0x7f080075));
	//  170  388:aload           6
	//  171  390:ldc1            #164 <Int 0x7f080075>
	//  172  392:invokestatic    #123 <Method String Res.getRegularString(int)>
	//  173  395:invokevirtual   #167 <Method void ConsentVisualStep.setNextButtonString(String)>
		Object obj5 = ((Object) (new ConsentSection(org.researchstack.backbone.model.ConsentSection.Type.TimeCommitment)));
	//  174  398:new             #140 <Class ConsentSection>
	//  175  401:dup             
	//  176  402:getstatic       #194 <Field org.researchstack.backbone.model.ConsentSection$Type org.researchstack.backbone.model.ConsentSection$Type.TimeCommitment>
	//  177  405:invokespecial   #149 <Method void ConsentSection(org.researchstack.backbone.model.ConsentSection$Type)>
	//  178  408:astore          8
		((ConsentSection) (obj5)).setTitle(Res.getStudySpecificString(0x7f080284));
	//  179  410:aload           8
	//  180  412:ldc1            #195 <Int 0x7f080284>
	//  181  414:invokestatic    #101 <Method String Res.getStudySpecificString(int)>
	//  182  417:invokevirtual   #151 <Method void ConsentSection.setTitle(String)>
		((ConsentSection) (obj5)).setSummary(Res.getStudySpecificString(0x7f080283));
	//  183  420:aload           8
	//  184  422:ldc1            #196 <Int 0x7f080283>
	//  185  424:invokestatic    #101 <Method String Res.getStudySpecificString(int)>
	//  186  427:invokevirtual   #155 <Method void ConsentSection.setSummary(String)>
		((ConsentSection) (obj5)).setHtmlContent(Res.getStudySpecificString(0x7f080281));
	//  187  430:aload           8
	//  188  432:ldc1            #197 <Int 0x7f080281>
	//  189  434:invokestatic    #101 <Method String Res.getStudySpecificString(int)>
	//  190  437:invokevirtual   #159 <Method void ConsentSection.setHtmlContent(String)>
		obj4 = ((Object) (new ConsentVisualStep("time_consent_identifier")));
	//  191  440:new             #161 <Class ConsentVisualStep>
	//  192  443:dup             
	//  193  444:ldc1            #71  <String "time_consent_identifier">
	//  194  446:invokespecial   #163 <Method void ConsentVisualStep(String)>
	//  195  449:astore          7
		((ConsentVisualStep) (obj4)).setSection(((ConsentSection) (obj5)));
	//  196  451:aload           7
	//  197  453:aload           8
	//  198  455:invokevirtual   #171 <Method void ConsentVisualStep.setSection(ConsentSection)>
		((ConsentVisualStep) (obj4)).setNextButtonString(Res.getRegularString(0x7f080075));
	//  199  458:aload           7
	//  200  460:ldc1            #164 <Int 0x7f080075>
	//  201  462:invokestatic    #123 <Method String Res.getRegularString(int)>
	//  202  465:invokevirtual   #167 <Method void ConsentVisualStep.setNextButtonString(String)>
		Object obj6 = ((Object) (new ConsentSection(org.researchstack.backbone.model.ConsentSection.Type.StudySurvey)));
	//  203  468:new             #140 <Class ConsentSection>
	//  204  471:dup             
	//  205  472:getstatic       #200 <Field org.researchstack.backbone.model.ConsentSection$Type org.researchstack.backbone.model.ConsentSection$Type.StudySurvey>
	//  206  475:invokespecial   #149 <Method void ConsentSection(org.researchstack.backbone.model.ConsentSection$Type)>
	//  207  478:astore          9
		((ConsentSection) (obj6)).setTitle(Res.getStudySpecificString(0x7f08027a));
	//  208  480:aload           9
	//  209  482:ldc1            #201 <Int 0x7f08027a>
	//  210  484:invokestatic    #101 <Method String Res.getStudySpecificString(int)>
	//  211  487:invokevirtual   #151 <Method void ConsentSection.setTitle(String)>
		((ConsentSection) (obj6)).setSummary(Res.getStudySpecificString(0x7f080279));
	//  212  490:aload           9
	//  213  492:ldc1            #202 <Int 0x7f080279>
	//  214  494:invokestatic    #101 <Method String Res.getStudySpecificString(int)>
	//  215  497:invokevirtual   #155 <Method void ConsentSection.setSummary(String)>
		((ConsentSection) (obj6)).setHtmlContent(Res.getStudySpecificString(0x7f080277));
	//  216  500:aload           9
	//  217  502:ldc1            #203 <Int 0x7f080277>
	//  218  504:invokestatic    #101 <Method String Res.getStudySpecificString(int)>
	//  219  507:invokevirtual   #159 <Method void ConsentSection.setHtmlContent(String)>
		obj5 = ((Object) (new ConsentVisualStep("study_survey_consent_identifier")));
	//  220  510:new             #161 <Class ConsentVisualStep>
	//  221  513:dup             
	//  222  514:ldc1            #65  <String "study_survey_consent_identifier">
	//  223  516:invokespecial   #163 <Method void ConsentVisualStep(String)>
	//  224  519:astore          8
		((ConsentVisualStep) (obj5)).setSection(((ConsentSection) (obj6)));
	//  225  521:aload           8
	//  226  523:aload           9
	//  227  525:invokevirtual   #171 <Method void ConsentVisualStep.setSection(ConsentSection)>
		((ConsentVisualStep) (obj5)).setNextButtonString(Res.getRegularString(0x7f080075));
	//  228  528:aload           8
	//  229  530:ldc1            #164 <Int 0x7f080075>
	//  230  532:invokestatic    #123 <Method String Res.getRegularString(int)>
	//  231  535:invokevirtual   #167 <Method void ConsentVisualStep.setNextButtonString(String)>
		Object obj7 = ((Object) (new ConsentSection(org.researchstack.backbone.model.ConsentSection.Type.StudyTasks)));
	//  232  538:new             #140 <Class ConsentSection>
	//  233  541:dup             
	//  234  542:getstatic       #206 <Field org.researchstack.backbone.model.ConsentSection$Type org.researchstack.backbone.model.ConsentSection$Type.StudyTasks>
	//  235  545:invokespecial   #149 <Method void ConsentSection(org.researchstack.backbone.model.ConsentSection$Type)>
	//  236  548:astore          10
		((ConsentSection) (obj7)).setTitle(Res.getStudySpecificString(0x7f08027e));
	//  237  550:aload           10
	//  238  552:ldc1            #207 <Int 0x7f08027e>
	//  239  554:invokestatic    #101 <Method String Res.getStudySpecificString(int)>
	//  240  557:invokevirtual   #151 <Method void ConsentSection.setTitle(String)>
		((ConsentSection) (obj7)).setSummary(Res.getStudySpecificString(0x7f08027d));
	//  241  560:aload           10
	//  242  562:ldc1            #208 <Int 0x7f08027d>
	//  243  564:invokestatic    #101 <Method String Res.getStudySpecificString(int)>
	//  244  567:invokevirtual   #155 <Method void ConsentSection.setSummary(String)>
		((ConsentSection) (obj7)).setHtmlContent(Res.getStudySpecificString(0x7f08027b));
	//  245  570:aload           10
	//  246  572:ldc1            #209 <Int 0x7f08027b>
	//  247  574:invokestatic    #101 <Method String Res.getStudySpecificString(int)>
	//  248  577:invokevirtual   #159 <Method void ConsentSection.setHtmlContent(String)>
		obj6 = ((Object) (new ConsentVisualStep("study_tasks_consent_identifier")));
	//  249  580:new             #161 <Class ConsentVisualStep>
	//  250  583:dup             
	//  251  584:ldc1            #68  <String "study_tasks_consent_identifier">
	//  252  586:invokespecial   #163 <Method void ConsentVisualStep(String)>
	//  253  589:astore          9
		((ConsentVisualStep) (obj6)).setSection(((ConsentSection) (obj7)));
	//  254  591:aload           9
	//  255  593:aload           10
	//  256  595:invokevirtual   #171 <Method void ConsentVisualStep.setSection(ConsentSection)>
		((ConsentVisualStep) (obj6)).setNextButtonString(Res.getRegularString(0x7f080075));
	//  257  598:aload           9
	//  258  600:ldc1            #164 <Int 0x7f080075>
	//  259  602:invokestatic    #123 <Method String Res.getRegularString(int)>
	//  260  605:invokevirtual   #167 <Method void ConsentVisualStep.setNextButtonString(String)>
		Object obj8 = ((Object) (new ConsentSection(org.researchstack.backbone.model.ConsentSection.Type.Withdrawing)));
	//  261  608:new             #140 <Class ConsentSection>
	//  262  611:dup             
	//  263  612:getstatic       #212 <Field org.researchstack.backbone.model.ConsentSection$Type org.researchstack.backbone.model.ConsentSection$Type.Withdrawing>
	//  264  615:invokespecial   #149 <Method void ConsentSection(org.researchstack.backbone.model.ConsentSection$Type)>
	//  265  618:astore          11
		((ConsentSection) (obj8)).setTitle(Res.getStudySpecificString(0x7f08028e));
	//  266  620:aload           11
	//  267  622:ldc1            #213 <Int 0x7f08028e>
	//  268  624:invokestatic    #101 <Method String Res.getStudySpecificString(int)>
	//  269  627:invokevirtual   #151 <Method void ConsentSection.setTitle(String)>
		((ConsentSection) (obj8)).setSummary(Res.getStudySpecificString(0x7f08028d));
	//  270  630:aload           11
	//  271  632:ldc1            #214 <Int 0x7f08028d>
	//  272  634:invokestatic    #101 <Method String Res.getStudySpecificString(int)>
	//  273  637:invokevirtual   #155 <Method void ConsentSection.setSummary(String)>
		((ConsentSection) (obj8)).setHtmlContent(Res.getStudySpecificString(0x7f08028b));
	//  274  640:aload           11
	//  275  642:ldc1            #215 <Int 0x7f08028b>
	//  276  644:invokestatic    #101 <Method String Res.getStudySpecificString(int)>
	//  277  647:invokevirtual   #159 <Method void ConsentSection.setHtmlContent(String)>
		obj7 = ((Object) (new ConsentVisualStep("withdrawing_consent_identifier")));
	//  278  650:new             #161 <Class ConsentVisualStep>
	//  279  653:dup             
	//  280  654:ldc1            #80  <String "withdrawing_consent_identifier">
	//  281  656:invokespecial   #163 <Method void ConsentVisualStep(String)>
	//  282  659:astore          10
		((ConsentVisualStep) (obj7)).setSection(((ConsentSection) (obj8)));
	//  283  661:aload           10
	//  284  663:aload           11
	//  285  665:invokevirtual   #171 <Method void ConsentVisualStep.setSection(ConsentSection)>
		((ConsentVisualStep) (obj7)).setNextButtonString(Res.getRegularString(0x7f080075));
	//  286  668:aload           10
	//  287  670:ldc1            #164 <Int 0x7f080075>
	//  288  672:invokestatic    #123 <Method String Res.getRegularString(int)>
	//  289  675:invokevirtual   #167 <Method void ConsentVisualStep.setNextButtonString(String)>
		Object obj9 = ((Object) (new ConsentSection(org.researchstack.backbone.model.ConsentSection.Type.Custom)));
	//  290  678:new             #140 <Class ConsentSection>
	//  291  681:dup             
	//  292  682:getstatic       #146 <Field org.researchstack.backbone.model.ConsentSection$Type org.researchstack.backbone.model.ConsentSection$Type.Custom>
	//  293  685:invokespecial   #149 <Method void ConsentSection(org.researchstack.backbone.model.ConsentSection$Type)>
	//  294  688:astore          12
		((ConsentSection) (obj9)).setTitle(Res.getStudySpecificString(0x7f080275));
	//  295  690:aload           12
	//  296  692:ldc1            #216 <Int 0x7f080275>
	//  297  694:invokestatic    #101 <Method String Res.getStudySpecificString(int)>
	//  298  697:invokevirtual   #151 <Method void ConsentSection.setTitle(String)>
		((ConsentSection) (obj9)).setSummary(Res.getStudySpecificString(0x7f080274));
	//  299  700:aload           12
	//  300  702:ldc1            #217 <Int 0x7f080274>
	//  301  704:invokestatic    #101 <Method String Res.getStudySpecificString(int)>
	//  302  707:invokevirtual   #155 <Method void ConsentSection.setSummary(String)>
		((ConsentSection) (obj9)).setHtmlContent(Res.getStudySpecificString(0x7f080272));
	//  303  710:aload           12
	//  304  712:ldc1            #218 <Int 0x7f080272>
	//  305  714:invokestatic    #101 <Method String Res.getStudySpecificString(int)>
	//  306  717:invokevirtual   #159 <Method void ConsentSection.setHtmlContent(String)>
		((ConsentSection) (obj9)).setCustomImage("envelope");
	//  307  720:aload           12
	//  308  722:ldc1            #220 <String "envelope">
	//  309  724:invokevirtual   #223 <Method void ConsentSection.setCustomImage(String)>
		obj8 = ((Object) (new ConsentVisualStep("recontact_consent_identifier")));
	//  310  727:new             #161 <Class ConsentVisualStep>
	//  311  730:dup             
	//  312  731:ldc1            #59  <String "recontact_consent_identifier">
	//  313  733:invokespecial   #163 <Method void ConsentVisualStep(String)>
	//  314  736:astore          11
		((ConsentVisualStep) (obj8)).setSection(((ConsentSection) (obj9)));
	//  315  738:aload           11
	//  316  740:aload           12
	//  317  742:invokevirtual   #171 <Method void ConsentVisualStep.setSection(ConsentSection)>
		((ConsentVisualStep) (obj8)).setNextButtonString(Res.getRegularString(0x7f080075));
	//  318  745:aload           11
	//  319  747:ldc1            #164 <Int 0x7f080075>
	//  320  749:invokestatic    #123 <Method String Res.getRegularString(int)>
	//  321  752:invokevirtual   #167 <Method void ConsentVisualStep.setNextButtonString(String)>
		obj9 = ((Object) (new InstructionStep("ComprehensionCheck_Intro", Res.getStudySpecificString(0x7f08026c), Res.getStudySpecificString(0x7f08026b))));
	//  322  755:new             #119 <Class InstructionStep>
	//  323  758:dup             
	//  324  759:ldc1            #26  <String "ComprehensionCheck_Intro">
	//  325  761:ldc1            #224 <Int 0x7f08026c>
	//  326  763:invokestatic    #101 <Method String Res.getStudySpecificString(int)>
	//  327  766:ldc1            #225 <Int 0x7f08026b>
	//  328  768:invokestatic    #101 <Method String Res.getStudySpecificString(int)>
	//  329  771:invokespecial   #127 <Method void InstructionStep(String, String, String)>
	//  330  774:astore          12
		((InstructionStep) (obj9)).setStepTitle(Res.getStudySpecificStringId(0x7f08020a));
	//  331  776:aload           12
	//  332  778:ldc1            #226 <Int 0x7f08020a>
	//  333  780:invokestatic    #230 <Method int Res.getStudySpecificStringId(int)>
	//  334  783:invokevirtual   #130 <Method void InstructionStep.setStepTitle(int)>
		QuestionStep questionstep = new QuestionStep("comprehension_check_1");
	//  335  786:new             #232 <Class QuestionStep>
	//  336  789:dup             
	//  337  790:ldc1            #8   <String "comprehension_check_1">
	//  338  792:invokespecial   #233 <Method void QuestionStep(String)>
	//  339  795:astore          13
		questionstep.setStepTitle(Res.getStudySpecificStringId(0x7f08020a));
	//  340  797:aload           13
	//  341  799:ldc1            #226 <Int 0x7f08020a>
	//  342  801:invokestatic    #230 <Method int Res.getStudySpecificStringId(int)>
	//  343  804:invokevirtual   #234 <Method void QuestionStep.setStepTitle(int)>
		questionstep.setText(Res.getStudySpecificString(0x7f080271));
	//  344  807:aload           13
	//  345  809:ldc1            #235 <Int 0x7f080271>
	//  346  811:invokestatic    #101 <Method String Res.getStudySpecificString(int)>
	//  347  814:invokevirtual   #238 <Method void QuestionStep.setText(String)>
		questionstep.setOptional(false);
	//  348  817:aload           13
	//  349  819:iconst_0        
	//  350  820:invokevirtual   #241 <Method void QuestionStep.setOptional(boolean)>
		questionstep.setAnswerFormat(((org.researchstack.backbone.answerformat.AnswerFormat) (new ChoiceAnswerFormat(org.researchstack.backbone.answerformat.AnswerFormat.ChoiceAnswerStyle.SingleChoice, new Choice[] {
			new Choice(Res.getStudySpecificString(0x7f08026f), "1"), new Choice(Res.getStudySpecificString(0x7f080270), "2")
		}))));
	//  351  823:aload           13
	//  352  825:new             #243 <Class ChoiceAnswerFormat>
	//  353  828:dup             
	//  354  829:getstatic       #249 <Field org.researchstack.backbone.answerformat.AnswerFormat$ChoiceAnswerStyle org.researchstack.backbone.answerformat.AnswerFormat$ChoiceAnswerStyle.SingleChoice>
	//  355  832:iconst_2        
	//  356  833:anewarray       Choice[]
	//  357  836:dup             
	//  358  837:iconst_0        
	//  359  838:new             #251 <Class Choice>
	//  360  841:dup             
	//  361  842:ldc1            #252 <Int 0x7f08026f>
	//  362  844:invokestatic    #101 <Method String Res.getStudySpecificString(int)>
	//  363  847:ldc1            #254 <String "1">
	//  364  849:invokespecial   #257 <Method void Choice(String, Object)>
	//  365  852:aastore         
	//  366  853:dup             
	//  367  854:iconst_1        
	//  368  855:new             #251 <Class Choice>
	//  369  858:dup             
	//  370  859:ldc2            #258 <Int 0x7f080270>
	//  371  862:invokestatic    #101 <Method String Res.getStudySpecificString(int)>
	//  372  865:ldc2            #260 <String "2">
	//  373  868:invokespecial   #257 <Method void Choice(String, Object)>
	//  374  871:aastore         
	//  375  872:invokespecial   #263 <Method void ChoiceAnswerFormat(org.researchstack.backbone.answerformat.AnswerFormat$ChoiceAnswerStyle, Choice[])>
	//  376  875:invokevirtual   #267 <Method void QuestionStep.setAnswerFormat(org.researchstack.backbone.answerformat.AnswerFormat)>
		Object obj10 = ((Object) (new ChoiceAnswerFormat(org.researchstack.backbone.answerformat.AnswerFormat.ChoiceAnswerStyle.SingleChoice, new Choice[] {
			new Choice(Res.getRegularString(0x7f08002b), "1"), new Choice(Res.getRegularString(0x7f080029), "2")
		})));
	//  377  878:new             #243 <Class ChoiceAnswerFormat>
	//  378  881:dup             
	//  379  882:getstatic       #249 <Field org.researchstack.backbone.answerformat.AnswerFormat$ChoiceAnswerStyle org.researchstack.backbone.answerformat.AnswerFormat$ChoiceAnswerStyle.SingleChoice>
	//  380  885:iconst_2        
	//  381  886:anewarray       Choice[]
	//  382  889:dup             
	//  383  890:iconst_0        
	//  384  891:new             #251 <Class Choice>
	//  385  894:dup             
	//  386  895:ldc2            #268 <Int 0x7f08002b>
	//  387  898:invokestatic    #123 <Method String Res.getRegularString(int)>
	//  388  901:ldc1            #254 <String "1">
	//  389  903:invokespecial   #257 <Method void Choice(String, Object)>
	//  390  906:aastore         
	//  391  907:dup             
	//  392  908:iconst_1        
	//  393  909:new             #251 <Class Choice>
	//  394  912:dup             
	//  395  913:ldc2            #269 <Int 0x7f080029>
	//  396  916:invokestatic    #123 <Method String Res.getRegularString(int)>
	//  397  919:ldc2            #260 <String "2">
	//  398  922:invokespecial   #257 <Method void Choice(String, Object)>
	//  399  925:aastore         
	//  400  926:invokespecial   #263 <Method void ChoiceAnswerFormat(org.researchstack.backbone.answerformat.AnswerFormat$ChoiceAnswerStyle, Choice[])>
	//  401  929:astore          18
		QuestionStep questionstep1 = new QuestionStep("comprehension_check_2");
	//  402  931:new             #232 <Class QuestionStep>
	//  403  934:dup             
	//  404  935:ldc1            #11  <String "comprehension_check_2">
	//  405  937:invokespecial   #233 <Method void QuestionStep(String)>
	//  406  940:astore          14
		questionstep1.setStepTitle(Res.getStudySpecificStringId(0x7f08020a));
	//  407  942:aload           14
	//  408  944:ldc1            #226 <Int 0x7f08020a>
	//  409  946:invokestatic    #230 <Method int Res.getStudySpecificStringId(int)>
	//  410  949:invokevirtual   #234 <Method void QuestionStep.setStepTitle(int)>
		questionstep1.setOptional(false);
	//  411  952:aload           14
	//  412  954:iconst_0        
	//  413  955:invokevirtual   #241 <Method void QuestionStep.setOptional(boolean)>
		questionstep1.setAnswerFormat(((org.researchstack.backbone.answerformat.AnswerFormat) (obj10)));
	//  414  958:aload           14
	//  415  960:aload           18
	//  416  962:invokevirtual   #267 <Method void QuestionStep.setAnswerFormat(org.researchstack.backbone.answerformat.AnswerFormat)>
		questionstep1.setText(Res.getStudySpecificString(0x7f08026a));
	//  417  965:aload           14
	//  418  967:ldc2            #270 <Int 0x7f08026a>
	//  419  970:invokestatic    #101 <Method String Res.getStudySpecificString(int)>
	//  420  973:invokevirtual   #238 <Method void QuestionStep.setText(String)>
		QuestionStep questionstep2 = new QuestionStep("comprehension_check_3");
	//  421  976:new             #232 <Class QuestionStep>
	//  422  979:dup             
	//  423  980:ldc1            #14  <String "comprehension_check_3">
	//  424  982:invokespecial   #233 <Method void QuestionStep(String)>
	//  425  985:astore          15
		questionstep2.setStepTitle(Res.getStudySpecificStringId(0x7f08020a));
	//  426  987:aload           15
	//  427  989:ldc1            #226 <Int 0x7f08020a>
	//  428  991:invokestatic    #230 <Method int Res.getStudySpecificStringId(int)>
	//  429  994:invokevirtual   #234 <Method void QuestionStep.setStepTitle(int)>
		questionstep2.setOptional(false);
	//  430  997:aload           15
	//  431  999:iconst_0        
	//  432 1000:invokevirtual   #241 <Method void QuestionStep.setOptional(boolean)>
		questionstep2.setAnswerFormat(((org.researchstack.backbone.answerformat.AnswerFormat) (obj10)));
	//  433 1003:aload           15
	//  434 1005:aload           18
	//  435 1007:invokevirtual   #267 <Method void QuestionStep.setAnswerFormat(org.researchstack.backbone.answerformat.AnswerFormat)>
		questionstep2.setText(Res.getStudySpecificString(0x7f08026d));
	//  436 1010:aload           15
	//  437 1012:ldc2            #271 <Int 0x7f08026d>
	//  438 1015:invokestatic    #101 <Method String Res.getStudySpecificString(int)>
	//  439 1018:invokevirtual   #238 <Method void QuestionStep.setText(String)>
		QuestionStep questionstep3 = new QuestionStep("comprehension_check_4");
	//  440 1021:new             #232 <Class QuestionStep>
	//  441 1024:dup             
	//  442 1025:ldc1            #17  <String "comprehension_check_4">
	//  443 1027:invokespecial   #233 <Method void QuestionStep(String)>
	//  444 1030:astore          16
		questionstep3.setStepTitle(Res.getStudySpecificStringId(0x7f08020a));
	//  445 1032:aload           16
	//  446 1034:ldc1            #226 <Int 0x7f08020a>
	//  447 1036:invokestatic    #230 <Method int Res.getStudySpecificStringId(int)>
	//  448 1039:invokevirtual   #234 <Method void QuestionStep.setStepTitle(int)>
		questionstep3.setOptional(false);
	//  449 1042:aload           16
	//  450 1044:iconst_0        
	//  451 1045:invokevirtual   #241 <Method void QuestionStep.setOptional(boolean)>
		questionstep3.setAnswerFormat(((org.researchstack.backbone.answerformat.AnswerFormat) (obj10)));
	//  452 1048:aload           16
	//  453 1050:aload           18
	//  454 1052:invokevirtual   #267 <Method void QuestionStep.setAnswerFormat(org.researchstack.backbone.answerformat.AnswerFormat)>
		questionstep3.setText(Res.getStudySpecificString(0x7f080269));
	//  455 1055:aload           16
	//  456 1057:ldc2            #272 <Int 0x7f080269>
	//  457 1060:invokestatic    #101 <Method String Res.getStudySpecificString(int)>
	//  458 1063:invokevirtual   #238 <Method void QuestionStep.setText(String)>
		QuestionStep questionstep4 = new QuestionStep("comprehension_check_5");
	//  459 1066:new             #232 <Class QuestionStep>
	//  460 1069:dup             
	//  461 1070:ldc1            #20  <String "comprehension_check_5">
	//  462 1072:invokespecial   #233 <Method void QuestionStep(String)>
	//  463 1075:astore          17
		questionstep4.setStepTitle(Res.getStudySpecificStringId(0x7f08020a));
	//  464 1077:aload           17
	//  465 1079:ldc1            #226 <Int 0x7f08020a>
	//  466 1081:invokestatic    #230 <Method int Res.getStudySpecificStringId(int)>
	//  467 1084:invokevirtual   #234 <Method void QuestionStep.setStepTitle(int)>
		questionstep4.setOptional(false);
	//  468 1087:aload           17
	//  469 1089:iconst_0        
	//  470 1090:invokevirtual   #241 <Method void QuestionStep.setOptional(boolean)>
		questionstep4.setAnswerFormat(((org.researchstack.backbone.answerformat.AnswerFormat) (obj10)));
	//  471 1093:aload           17
	//  472 1095:aload           18
	//  473 1097:invokevirtual   #267 <Method void QuestionStep.setAnswerFormat(org.researchstack.backbone.answerformat.AnswerFormat)>
		questionstep4.setText(Res.getStudySpecificString(0x7f08026e));
	//  474 1100:aload           17
	//  475 1102:ldc2            #273 <Int 0x7f08026e>
	//  476 1105:invokestatic    #101 <Method String Res.getStudySpecificString(int)>
	//  477 1108:invokevirtual   #238 <Method void QuestionStep.setText(String)>
		obj10 = ((Object) (new QuestionStep("comprehension_check_failure")));
	//  478 1111:new             #232 <Class QuestionStep>
	//  479 1114:dup             
	//  480 1115:ldc1            #23  <String "comprehension_check_failure">
	//  481 1117:invokespecial   #233 <Method void QuestionStep(String)>
	//  482 1120:astore          18
		((QuestionStep) (obj10)).setStepTitle(Res.getStudySpecificStringId(0x7f08020a));
	//  483 1122:aload           18
	//  484 1124:ldc1            #226 <Int 0x7f08020a>
	//  485 1126:invokestatic    #230 <Method int Res.getStudySpecificStringId(int)>
	//  486 1129:invokevirtual   #234 <Method void QuestionStep.setStepTitle(int)>
		((QuestionStep) (obj10)).setOptional(false);
	//  487 1132:aload           18
	//  488 1134:iconst_0        
	//  489 1135:invokevirtual   #241 <Method void QuestionStep.setOptional(boolean)>
		((QuestionStep) (obj10)).setAnswerFormat(((org.researchstack.backbone.answerformat.AnswerFormat) (new ChoiceAnswerFormat(org.researchstack.backbone.answerformat.AnswerFormat.ChoiceAnswerStyle.SingleChoice, new Choice[] {
			new Choice(Res.getStudySpecificString(0x7f080261), "1"), new Choice(Res.getStudySpecificString(0x7f080262), "2")
		}))));
	//  490 1138:aload           18
	//  491 1140:new             #243 <Class ChoiceAnswerFormat>
	//  492 1143:dup             
	//  493 1144:getstatic       #249 <Field org.researchstack.backbone.answerformat.AnswerFormat$ChoiceAnswerStyle org.researchstack.backbone.answerformat.AnswerFormat$ChoiceAnswerStyle.SingleChoice>
	//  494 1147:iconst_2        
	//  495 1148:anewarray       Choice[]
	//  496 1151:dup             
	//  497 1152:iconst_0        
	//  498 1153:new             #251 <Class Choice>
	//  499 1156:dup             
	//  500 1157:ldc2            #274 <Int 0x7f080261>
	//  501 1160:invokestatic    #101 <Method String Res.getStudySpecificString(int)>
	//  502 1163:ldc1            #254 <String "1">
	//  503 1165:invokespecial   #257 <Method void Choice(String, Object)>
	//  504 1168:aastore         
	//  505 1169:dup             
	//  506 1170:iconst_1        
	//  507 1171:new             #251 <Class Choice>
	//  508 1174:dup             
	//  509 1175:ldc2            #275 <Int 0x7f080262>
	//  510 1178:invokestatic    #101 <Method String Res.getStudySpecificString(int)>
	//  511 1181:ldc2            #260 <String "2">
	//  512 1184:invokespecial   #257 <Method void Choice(String, Object)>
	//  513 1187:aastore         
	//  514 1188:invokespecial   #263 <Method void ChoiceAnswerFormat(org.researchstack.backbone.answerformat.AnswerFormat$ChoiceAnswerStyle, Choice[])>
	//  515 1191:invokevirtual   #267 <Method void QuestionStep.setAnswerFormat(org.researchstack.backbone.answerformat.AnswerFormat)>
		((QuestionStep) (obj10)).setText(Res.getStudySpecificString(0x7f080263));
	//  516 1194:aload           18
	//  517 1196:ldc2            #276 <Int 0x7f080263>
	//  518 1199:invokestatic    #101 <Method String Res.getStudySpecificString(int)>
	//  519 1202:invokevirtual   #238 <Method void QuestionStep.setText(String)>
		((QuestionStep) (obj10)).setAllowsBackNavigation(false);
	//  520 1205:aload           18
	//  521 1207:iconst_0        
	//  522 1208:invokevirtual   #277 <Method void QuestionStep.setAllowsBackNavigation(boolean)>
		InstructionStep instructionstep1 = new InstructionStep("comprehension_check_success", "", Res.getStudySpecificString(0x7f080264));
	//  523 1211:new             #119 <Class InstructionStep>
	//  524 1214:dup             
	//  525 1215:ldc1            #29  <String "comprehension_check_success">
	//  526 1217:ldc2            #279 <String "">
	//  527 1220:ldc2            #280 <Int 0x7f080264>
	//  528 1223:invokestatic    #101 <Method String Res.getStudySpecificString(int)>
	//  529 1226:invokespecial   #127 <Method void InstructionStep(String, String, String)>
	//  530 1229:astore          19
		instructionstep1.setStepTitle(Res.getStudySpecificStringId(0x7f08020a));
	//  531 1231:aload           19
	//  532 1233:ldc1            #226 <Int 0x7f08020a>
	//  533 1235:invokestatic    #230 <Method int Res.getStudySpecificStringId(int)>
	//  534 1238:invokevirtual   #130 <Method void InstructionStep.setStepTitle(int)>
		instructionstep1.setAllowsBackNavigation(false);
	//  535 1241:aload           19
	//  536 1243:iconst_0        
	//  537 1244:invokevirtual   #138 <Method void InstructionStep.setAllowsBackNavigation(boolean)>
		Step step = ConsentReviewStepsFactory.createReviewStep(consentdocument, Res.getStudySpecificString(0x7f080276));
	//  538 1247:aload_0         
	//  539 1248:ldc2            #281 <Int 0x7f080276>
	//  540 1251:invokestatic    #101 <Method String Res.getStudySpecificString(int)>
	//  541 1254:invokestatic    #287 <Method Step ConsentReviewStepsFactory.createReviewStep(ConsentDocument, String)>
	//  542 1257:astore          20
		step.setAllowsBackNavigation(false);
	//  543 1259:aload           20
	//  544 1261:iconst_0        
	//  545 1262:invokevirtual   #290 <Method void Step.setAllowsBackNavigation(boolean)>
		step.setStepTitle(Res.getStudySpecificStringId(0x7f08020a));
	//  546 1265:aload           20
	//  547 1267:ldc1            #226 <Int 0x7f08020a>
	//  548 1269:invokestatic    #230 <Method int Res.getStudySpecificStringId(int)>
	//  549 1272:invokevirtual   #291 <Method void Step.setStepTitle(int)>
		ConsentSignatureStep consentsignaturestep = new ConsentSignatureStep("signature_consent_identifier");
	//  550 1275:new             #293 <Class ConsentSignatureStep>
	//  551 1278:dup             
	//  552 1279:ldc1            #62  <String "signature_consent_identifier">
	//  553 1281:invokespecial   #294 <Method void ConsentSignatureStep(String)>
	//  554 1284:astore          21
		consentsignaturestep.setTitle(Res.getRegularString(0x7f080047));
	//  555 1286:aload           21
	//  556 1288:ldc2            #295 <Int 0x7f080047>
	//  557 1291:invokestatic    #123 <Method String Res.getRegularString(int)>
	//  558 1294:invokevirtual   #296 <Method void ConsentSignatureStep.setTitle(String)>
		consentsignaturestep.setStepLayoutClass(org/researchstack/backbone/ui/step/layout/ConsentSignatureStepLayout);
	//  559 1297:aload           21
	//  560 1299:ldc2            #298 <Class ConsentSignatureStepLayout>
	//  561 1302:invokevirtual   #302 <Method void ConsentSignatureStep.setStepLayoutClass(Class)>
		consentsignaturestep.setStepTitle(Res.getStudySpecificStringId(0x7f080336));
	//  562 1305:aload           21
	//  563 1307:ldc2            #303 <Int 0x7f080336>
	//  564 1310:invokestatic    #230 <Method int Res.getStudySpecificStringId(int)>
	//  565 1313:invokevirtual   #304 <Method void ConsentSignatureStep.setStepTitle(int)>
		ArrayList arraylist = new ArrayList();
	//  566 1316:new             #306 <Class ArrayList>
	//  567 1319:dup             
	//  568 1320:invokespecial   #307 <Method void ArrayList()>
	//  569 1323:astore          22
		((List) (arraylist)).add(((Object) (instructionstep)));
	//  570 1325:aload           22
	//  571 1327:aload_1         
	//  572 1328:invokeinterface #313 <Method boolean List.add(Object)>
	//  573 1333:pop             
		((List) (arraylist)).add(((Object) (consentvisualstep)));
	//  574 1334:aload           22
	//  575 1336:aload_2         
	//  576 1337:invokeinterface #313 <Method boolean List.add(Object)>
	//  577 1342:pop             
		((List) (arraylist)).add(obj);
	//  578 1343:aload           22
	//  579 1345:aload_3         
	//  580 1346:invokeinterface #313 <Method boolean List.add(Object)>
	//  581 1351:pop             
		((List) (arraylist)).add(obj1);
	//  582 1352:aload           22
	//  583 1354:aload           4
	//  584 1356:invokeinterface #313 <Method boolean List.add(Object)>
	//  585 1361:pop             
		((List) (arraylist)).add(obj2);
	//  586 1362:aload           22
	//  587 1364:aload           5
	//  588 1366:invokeinterface #313 <Method boolean List.add(Object)>
	//  589 1371:pop             
		((List) (arraylist)).add(obj3);
	//  590 1372:aload           22
	//  591 1374:aload           6
	//  592 1376:invokeinterface #313 <Method boolean List.add(Object)>
	//  593 1381:pop             
		((List) (arraylist)).add(obj4);
	//  594 1382:aload           22
	//  595 1384:aload           7
	//  596 1386:invokeinterface #313 <Method boolean List.add(Object)>
	//  597 1391:pop             
		((List) (arraylist)).add(obj5);
	//  598 1392:aload           22
	//  599 1394:aload           8
	//  600 1396:invokeinterface #313 <Method boolean List.add(Object)>
	//  601 1401:pop             
		((List) (arraylist)).add(obj6);
	//  602 1402:aload           22
	//  603 1404:aload           9
	//  604 1406:invokeinterface #313 <Method boolean List.add(Object)>
	//  605 1411:pop             
		((List) (arraylist)).add(obj7);
	//  606 1412:aload           22
	//  607 1414:aload           10
	//  608 1416:invokeinterface #313 <Method boolean List.add(Object)>
	//  609 1421:pop             
		((List) (arraylist)).add(obj8);
	//  610 1422:aload           22
	//  611 1424:aload           11
	//  612 1426:invokeinterface #313 <Method boolean List.add(Object)>
	//  613 1431:pop             
		((List) (arraylist)).add(obj9);
	//  614 1432:aload           22
	//  615 1434:aload           12
	//  616 1436:invokeinterface #313 <Method boolean List.add(Object)>
	//  617 1441:pop             
		((List) (arraylist)).add(((Object) (questionstep)));
	//  618 1442:aload           22
	//  619 1444:aload           13
	//  620 1446:invokeinterface #313 <Method boolean List.add(Object)>
	//  621 1451:pop             
		((List) (arraylist)).add(((Object) (questionstep1)));
	//  622 1452:aload           22
	//  623 1454:aload           14
	//  624 1456:invokeinterface #313 <Method boolean List.add(Object)>
	//  625 1461:pop             
		((List) (arraylist)).add(((Object) (questionstep2)));
	//  626 1462:aload           22
	//  627 1464:aload           15
	//  628 1466:invokeinterface #313 <Method boolean List.add(Object)>
	//  629 1471:pop             
		((List) (arraylist)).add(((Object) (questionstep3)));
	//  630 1472:aload           22
	//  631 1474:aload           16
	//  632 1476:invokeinterface #313 <Method boolean List.add(Object)>
	//  633 1481:pop             
		((List) (arraylist)).add(((Object) (questionstep4)));
	//  634 1482:aload           22
	//  635 1484:aload           17
	//  636 1486:invokeinterface #313 <Method boolean List.add(Object)>
	//  637 1491:pop             
		((List) (arraylist)).add(obj10);
	//  638 1492:aload           22
	//  639 1494:aload           18
	//  640 1496:invokeinterface #313 <Method boolean List.add(Object)>
	//  641 1501:pop             
		((List) (arraylist)).add(((Object) (instructionstep1)));
	//  642 1502:aload           22
	//  643 1504:aload           19
	//  644 1506:invokeinterface #313 <Method boolean List.add(Object)>
	//  645 1511:pop             
		((List) (arraylist)).add(((Object) (step)));
	//  646 1512:aload           22
	//  647 1514:aload           20
	//  648 1516:invokeinterface #313 <Method boolean List.add(Object)>
	//  649 1521:pop             
		((List) (arraylist)).add(((Object) (consentsignaturestep)));
	//  650 1522:aload           22
	//  651 1524:aload           21
	//  652 1526:invokeinterface #313 <Method boolean List.add(Object)>
	//  653 1531:pop             
		return new GeneralConsentTuple(consentdocument, new GeneralConsentTask("general_consent_task", ((List) (arraylist))));
	//  654 1532:new             #315 <Class GeneralConsentTuple>
	//  655 1535:dup             
	//  656 1536:aload_0         
	//  657 1537:new             #2   <Class GeneralConsentTask>
	//  658 1540:dup             
	//  659 1541:ldc1            #50  <String "general_consent_task">
	//  660 1543:aload           22
	//  661 1545:invokespecial   #316 <Method void GeneralConsentTask(String, List)>
	//  662 1548:invokespecial   #319 <Method void GeneralConsentTuple(ConsentDocument, GeneralConsentTask)>
	//  663 1551:areturn         
	}

	private void clearComprehensionQuizSelections(TaskResult taskresult)
	{
		taskresult = ((TaskResult) (taskresult.getResults()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #327 <Method Map TaskResult.getResults()>
	//    2    4:astore_1        
		((StepResult)((Map) (taskresult)).get("comprehension_check_1")).getResults().clear();
	//    3    5:aload_1         
	//    4    6:ldc1            #8   <String "comprehension_check_1">
	//    5    8:invokeinterface #333 <Method Object Map.get(Object)>
	//    6   13:checkcast       #335 <Class StepResult>
	//    7   16:invokevirtual   #336 <Method Map StepResult.getResults()>
	//    8   19:invokeinterface #339 <Method void Map.clear()>
		((StepResult)((Map) (taskresult)).get("comprehension_check_2")).getResults().clear();
	//    9   24:aload_1         
	//   10   25:ldc1            #11  <String "comprehension_check_2">
	//   11   27:invokeinterface #333 <Method Object Map.get(Object)>
	//   12   32:checkcast       #335 <Class StepResult>
	//   13   35:invokevirtual   #336 <Method Map StepResult.getResults()>
	//   14   38:invokeinterface #339 <Method void Map.clear()>
		((StepResult)((Map) (taskresult)).get("comprehension_check_3")).getResults().clear();
	//   15   43:aload_1         
	//   16   44:ldc1            #14  <String "comprehension_check_3">
	//   17   46:invokeinterface #333 <Method Object Map.get(Object)>
	//   18   51:checkcast       #335 <Class StepResult>
	//   19   54:invokevirtual   #336 <Method Map StepResult.getResults()>
	//   20   57:invokeinterface #339 <Method void Map.clear()>
		((StepResult)((Map) (taskresult)).get("comprehension_check_4")).getResults().clear();
	//   21   62:aload_1         
	//   22   63:ldc1            #17  <String "comprehension_check_4">
	//   23   65:invokeinterface #333 <Method Object Map.get(Object)>
	//   24   70:checkcast       #335 <Class StepResult>
	//   25   73:invokevirtual   #336 <Method Map StepResult.getResults()>
	//   26   76:invokeinterface #339 <Method void Map.clear()>
		((StepResult)((Map) (taskresult)).get("comprehension_check_5")).getResults().clear();
	//   27   81:aload_1         
	//   28   82:ldc1            #20  <String "comprehension_check_5">
	//   29   84:invokeinterface #333 <Method Object Map.get(Object)>
	//   30   89:checkcast       #335 <Class StepResult>
	//   31   92:invokevirtual   #336 <Method Map StepResult.getResults()>
	//   32   95:invokeinterface #339 <Method void Map.clear()>
		taskresult = ((TaskResult) ((StepResult)((Map) (taskresult)).get("comprehension_check_failure")));
	//   33  100:aload_1         
	//   34  101:ldc1            #23  <String "comprehension_check_failure">
	//   35  103:invokeinterface #333 <Method Object Map.get(Object)>
	//   36  108:checkcast       #335 <Class StepResult>
	//   37  111:astore_1        
		if(taskresult != null)
	//*  38  112:aload_1         
	//*  39  113:ifnull          125
			((StepResult) (taskresult)).getResults().clear();
	//   40  116:aload_1         
	//   41  117:invokevirtual   #336 <Method Map StepResult.getResults()>
	//   42  120:invokeinterface #339 <Method void Map.clear()>
	//   43  125:return          
	}

	private boolean comprehensionCheck(TaskResult taskresult)
	{
		taskresult = ((TaskResult) (taskresult.getResults()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #327 <Method Map TaskResult.getResults()>
	//    2    4:astore_1        
		return Arrays.equals(new Object[] {
			((StepResult)((Map) (taskresult)).get("comprehension_check_1")).getResult(), ((StepResult)((Map) (taskresult)).get("comprehension_check_2")).getResult(), ((StepResult)((Map) (taskresult)).get("comprehension_check_3")).getResult(), ((StepResult)((Map) (taskresult)).get("comprehension_check_4")).getResult(), ((StepResult)((Map) (taskresult)).get("comprehension_check_5")).getResult()
		}, new Object[] {
			"1", "2", "2", "1", "1"
		});
	//    3    5:iconst_5        
	//    4    6:anewarray       Object[]
	//    5    9:dup             
	//    6   10:iconst_0        
	//    7   11:aload_1         
	//    8   12:ldc1            #8   <String "comprehension_check_1">
	//    9   14:invokeinterface #333 <Method Object Map.get(Object)>
	//   10   19:checkcast       #335 <Class StepResult>
	//   11   22:invokevirtual   #347 <Method Object StepResult.getResult()>
	//   12   25:aastore         
	//   13   26:dup             
	//   14   27:iconst_1        
	//   15   28:aload_1         
	//   16   29:ldc1            #11  <String "comprehension_check_2">
	//   17   31:invokeinterface #333 <Method Object Map.get(Object)>
	//   18   36:checkcast       #335 <Class StepResult>
	//   19   39:invokevirtual   #347 <Method Object StepResult.getResult()>
	//   20   42:aastore         
	//   21   43:dup             
	//   22   44:iconst_2        
	//   23   45:aload_1         
	//   24   46:ldc1            #14  <String "comprehension_check_3">
	//   25   48:invokeinterface #333 <Method Object Map.get(Object)>
	//   26   53:checkcast       #335 <Class StepResult>
	//   27   56:invokevirtual   #347 <Method Object StepResult.getResult()>
	//   28   59:aastore         
	//   29   60:dup             
	//   30   61:iconst_3        
	//   31   62:aload_1         
	//   32   63:ldc1            #17  <String "comprehension_check_4">
	//   33   65:invokeinterface #333 <Method Object Map.get(Object)>
	//   34   70:checkcast       #335 <Class StepResult>
	//   35   73:invokevirtual   #347 <Method Object StepResult.getResult()>
	//   36   76:aastore         
	//   37   77:dup             
	//   38   78:iconst_4        
	//   39   79:aload_1         
	//   40   80:ldc1            #20  <String "comprehension_check_5">
	//   41   82:invokeinterface #333 <Method Object Map.get(Object)>
	//   42   87:checkcast       #335 <Class StepResult>
	//   43   90:invokevirtual   #347 <Method Object StepResult.getResult()>
	//   44   93:aastore         
	//   45   94:iconst_5        
	//   46   95:anewarray       Object[]
	//   47   98:dup             
	//   48   99:iconst_0        
	//   49  100:ldc1            #254 <String "1">
	//   50  102:aastore         
	//   51  103:dup             
	//   52  104:iconst_1        
	//   53  105:ldc2            #260 <String "2">
	//   54  108:aastore         
	//   55  109:dup             
	//   56  110:iconst_2        
	//   57  111:ldc2            #260 <String "2">
	//   58  114:aastore         
	//   59  115:dup             
	//   60  116:iconst_3        
	//   61  117:ldc1            #254 <String "1">
	//   62  119:aastore         
	//   63  120:dup             
	//   64  121:iconst_4        
	//   65  122:ldc1            #254 <String "1">
	//   66  124:aastore         
	//   67  125:invokestatic    #353 <Method boolean Arrays.equals(Object[], Object[])>
	//   68  128:ireturn         
	}

	public Step getStepAfterStep(Step step, TaskResult taskresult)
	{
		Step step2 = super.getStepAfterStep(step, taskresult);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #357 <Method Step OrderedTask.getStepAfterStep(Step, TaskResult)>
	//    4    6:astore          5
		if(step2 != null) goto _L2; else goto _L1
	//    5    8:aload           5
	//    6   10:ifnonnull       19
_L1:
		Step step1 = null;
	//    7   13:aconst_null     
	//    8   14:astore          4
_L4:
		return step1;
	//    9   16:aload           4
	//   10   18:areturn         
_L2:
		if(step2.getIdentifier().equals("comprehension_check_failure") && comprehensionCheck(taskresult))
	//*  11   19:aload           5
	//*  12   21:invokevirtual   #361 <Method String Step.getIdentifier()>
	//*  13   24:ldc1            #23  <String "comprehension_check_failure">
	//*  14   26:invokevirtual   #365 <Method boolean String.equals(Object)>
	//*  15   29:ifeq            47
	//*  16   32:aload_0         
	//*  17   33:aload_2         
	//*  18   34:invokespecial   #367 <Method boolean comprehensionCheck(TaskResult)>
	//*  19   37:ifeq            47
			return getStepById("comprehension_check_success");
	//   20   40:aload_0         
	//   21   41:ldc1            #29  <String "comprehension_check_success">
	//   22   43:invokevirtual   #371 <Method Step getStepById(String)>
	//   23   46:areturn         
		step1 = step2;
	//   24   47:aload           5
	//   25   49:astore          4
		if(step == null) goto _L4; else goto _L3
	//   26   51:aload_1         
	//   27   52:ifnull          16
_L3:
		byte byte0;
		step = ((Step) (step.getIdentifier()));
	//   28   55:aload_1         
	//   29   56:invokevirtual   #361 <Method String Step.getIdentifier()>
	//   30   59:astore_1        
		byte0 = -1;
	//   31   60:iconst_m1       
	//   32   61:istore_3        
		((String) (step)).hashCode();
	//   33   62:aload_1         
	//   34   63:invokevirtual   #375 <Method int String.hashCode()>
		JVM INSTR tableswitch -188250664 -188250664: default 84
	//	               -188250664 147;
	//   35   66:tableswitch     -188250664 -188250664: default 84
	//	               -188250664 147
		   goto _L5 _L6
_L5:
		switch(byte0)
	//*  36   84:iload_3         
		{
	//*  37   85:tableswitch     0 0: default 104
	//	               0 107
		default:
			return step2;
	//   38  104:aload           5
	//   39  106:areturn         

		case 0: // '\0'
			break;
		}
		if(((String)((StepResult)taskresult.getResults().get("comprehension_check_failure")).getResult()).equals("1"))
	//*  40  107:aload_2         
	//*  41  108:invokevirtual   #327 <Method Map TaskResult.getResults()>
	//*  42  111:ldc1            #23  <String "comprehension_check_failure">
	//*  43  113:invokeinterface #333 <Method Object Map.get(Object)>
	//*  44  118:checkcast       #335 <Class StepResult>
	//*  45  121:invokevirtual   #347 <Method Object StepResult.getResult()>
	//*  46  124:checkcast       #363 <Class String>
	//*  47  127:ldc1            #254 <String "1">
	//*  48  129:invokevirtual   #365 <Method boolean String.equals(Object)>
	//*  49  132:ifeq            161
		{
			clearComprehensionQuizSelections(taskresult);
	//   50  135:aload_0         
	//   51  136:aload_2         
	//   52  137:invokespecial   #377 <Method void clearComprehensionQuizSelections(TaskResult)>
			return getStepById("comprehension_check_1");
	//   53  140:aload_0         
	//   54  141:ldc1            #8   <String "comprehension_check_1">
	//   55  143:invokevirtual   #371 <Method Step getStepById(String)>
	//   56  146:areturn         
		} else
	//*  57  147:aload_1         
	//*  58  148:ldc1            #23  <String "comprehension_check_failure">
	//*  59  150:invokevirtual   #365 <Method boolean String.equals(Object)>
	//*  60  153:ifeq            84
	//*  61  156:iconst_0        
	//*  62  157:istore_3        
	//*  63  158:goto            84
		{
			return getStepById("visual_consent_identifier");
	//   64  161:aload_0         
	//   65  162:ldc1            #47  <String "visual_consent_identifier">
	//   66  164:invokevirtual   #371 <Method Step getStepById(String)>
	//   67  167:areturn         
		}
_L6:
		if(((String) (step)).equals("comprehension_check_failure"))
			byte0 = 0;
		  goto _L5
	}

	public String getString(int i)
	{
		return BackboneApplication.get().getString(i);
	//    0    0:invokestatic    #383 <Method BackboneApplication BackboneApplication.get()>
	//    1    3:iload_1         
	//    2    4:invokevirtual   #385 <Method String BackboneApplication.getString(int)>
	//    3    7:areturn         
	}

	public static final String COMPREHENSION_CHECK_1 = "comprehension_check_1";
	public static final String COMPREHENSION_CHECK_2 = "comprehension_check_2";
	public static final String COMPREHENSION_CHECK_3 = "comprehension_check_3";
	public static final String COMPREHENSION_CHECK_4 = "comprehension_check_4";
	public static final String COMPREHENSION_CHECK_5 = "comprehension_check_5";
	public static final String COMPREHENSION_CHECK_FAILURE_IDENTIFIER = "comprehension_check_failure";
	public static final String COMPREHENSION_CHECK_INTRO = "ComprehensionCheck_Intro";
	public static final String COMPREHENSION_CHECK_SUCCESS_IDENTIFIER = "comprehension_check_success";
	public static final String CONSENT = "consent";
	public static final String CONSENT_DOCUMENT_IDENTIFIER = "consent_document_identifier";
	public static final String CONSENT_REVIEW_STEP_IDENTIFIER = "consent_review_step_identifier";
	public static final String DATA_GATHERING_CONSENT_IDENTIFIER = "data_gathering_consent_identifier";
	public static final String DATA_USE_CONSENT_IDENTIFIER = "data_use_consent_identifier";
	public static final String EXPLANATION_CONSENT_IDENTIFIER = "visual_consent_identifier";
	public static final String GENERAL_CONSENT_TASK = "general_consent_task";
	public static final String PARTICIPANT_STEP_IDENTIFIER = "participant_step_identifier";
	public static final String PRIVACY_CONSENT_IDENTIFIER = "privacy_consent_identifier";
	public static final String RECONTACT_CONSENT_IDENTIFIER = "recontact_consent_identifier";
	public static final String SIGNATURE_CONSENT_IDENTIFIER = "signature_consent_identifier";
	public static final String STUDY_SURVEY_CONSENT_IDENTIFIER = "study_survey_consent_identifier";
	public static final String STUDY_TASKS_CONSENT_IDENTIFIER = "study_tasks_consent_identifier";
	public static final String TIME_CONSENT_IDENTIFIER = "time_consent_identifier";
	public static final String VISUAL_CONSENT_INTRO_STEP = "VisualConsentIntroStep";
	public static final String WHY_QUIZ_IDENTIFIER = "why_quiz_identifier";
	public static final String WITHDRAWING_CONSENT_IDENTIFIER = "withdrawing_consent_identifier";
}
