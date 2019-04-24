// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.pactforcure.app.consent;

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
//			ConsentReviewStepsFactory, DnaConsentTuple

public class DnaConsentTask extends OrderedTask
{

	public DnaConsentTask(String s, List list)
	{
		super(s, list);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #60  <Method void OrderedTask(String, List)>
	//    4    6:return          
	}

	public static DnaConsentTuple buildDnaConsentTask()
	{
		ConsentDocument consentdocument = new ConsentDocument();
	//    0    0:new             #67  <Class ConsentDocument>
	//    1    3:dup             
	//    2    4:invokespecial   #70  <Method void ConsentDocument()>
	//    3    7:astore_0        
		consentdocument.setTitle(Res.getStudySpecificString(0x7f080295));
	//    4    8:aload_0         
	//    5    9:ldc1            #71  <Int 0x7f080295>
	//    6   11:invokestatic    #77  <Method String Res.getStudySpecificString(int)>
	//    7   14:invokevirtual   #81  <Method void ConsentDocument.setTitle(String)>
		consentdocument.setSignaturePageTitle(0x7f080056);
	//    8   17:aload_0         
	//    9   18:ldc1            #82  <Int 0x7f080056>
	//   10   20:invokevirtual   #86  <Method void ConsentDocument.setSignaturePageTitle(int)>
		consentdocument.setHtmlReviewContent(Res.getStudySpecificRawAsString(0x7f07000f));
	//   11   23:aload_0         
	//   12   24:ldc1            #87  <Int 0x7f07000f>
	//   13   26:invokestatic    #90  <Method String Res.getStudySpecificRawAsString(int)>
	//   14   29:invokevirtual   #93  <Method void ConsentDocument.setHtmlReviewContent(String)>
		InstructionStep instructionstep = new InstructionStep("dna_intro_identifier", Res.getStudySpecificString(0x7f080224), Res.getStudySpecificString(0x7f080223));
	//   15   32:new             #95  <Class InstructionStep>
	//   16   35:dup             
	//   17   36:ldc1            #50  <String "dna_intro_identifier">
	//   18   38:ldc1            #96  <Int 0x7f080224>
	//   19   40:invokestatic    #77  <Method String Res.getStudySpecificString(int)>
	//   20   43:ldc1            #97  <Int 0x7f080223>
	//   21   45:invokestatic    #77  <Method String Res.getStudySpecificString(int)>
	//   22   48:invokespecial   #100 <Method void InstructionStep(String, String, String)>
	//   23   51:astore_1        
		instructionstep.setStepTitle(Res.getStudySpecificStringId(0x7f080212));
	//   24   52:aload_1         
	//   25   53:ldc1            #101 <Int 0x7f080212>
	//   26   55:invokestatic    #105 <Method int Res.getStudySpecificStringId(int)>
	//   27   58:invokevirtual   #108 <Method void InstructionStep.setStepTitle(int)>
		Object obj = ((Object) (new ConsentSection(org.researchstack.backbone.model.ConsentSection.Type.Custom)));
	//   28   61:new             #110 <Class ConsentSection>
	//   29   64:dup             
	//   30   65:getstatic       #116 <Field org.researchstack.backbone.model.ConsentSection$Type org.researchstack.backbone.model.ConsentSection$Type.Custom>
	//   31   68:invokespecial   #119 <Method void ConsentSection(org.researchstack.backbone.model.ConsentSection$Type)>
	//   32   71:astore_3        
		((ConsentSection) (obj)).setTitle(Res.getStudySpecificString(0x7f080251));
	//   33   72:aload_3         
	//   34   73:ldc1            #120 <Int 0x7f080251>
	//   35   75:invokestatic    #77  <Method String Res.getStudySpecificString(int)>
	//   36   78:invokevirtual   #121 <Method void ConsentSection.setTitle(String)>
		((ConsentSection) (obj)).setSummary(Res.getStudySpecificString(0x7f080250));
	//   37   81:aload_3         
	//   38   82:ldc1            #122 <Int 0x7f080250>
	//   39   84:invokestatic    #77  <Method String Res.getStudySpecificString(int)>
	//   40   87:invokevirtual   #125 <Method void ConsentSection.setSummary(String)>
		ConsentVisualStep consentvisualstep = new ConsentVisualStep("why_dna_quiz_identifier");
	//   41   90:new             #127 <Class ConsentVisualStep>
	//   42   93:dup             
	//   43   94:ldc1            #56  <String "why_dna_quiz_identifier">
	//   44   96:invokespecial   #129 <Method void ConsentVisualStep(String)>
	//   45   99:astore_2        
		consentvisualstep.setNextButtonString(Res.getRegularString(0x7f080075));
	//   46  100:aload_2         
	//   47  101:ldc1            #130 <Int 0x7f080075>
	//   48  103:invokestatic    #133 <Method String Res.getRegularString(int)>
	//   49  106:invokevirtual   #136 <Method void ConsentVisualStep.setNextButtonString(String)>
		consentvisualstep.setSection(((ConsentSection) (obj)));
	//   50  109:aload_2         
	//   51  110:aload_3         
	//   52  111:invokevirtual   #140 <Method void ConsentVisualStep.setSection(ConsentSection)>
		consentvisualstep.setStepTitle(Res.getStudySpecificStringId(0x7f080212));
	//   53  114:aload_2         
	//   54  115:ldc1            #101 <Int 0x7f080212>
	//   55  117:invokestatic    #105 <Method int Res.getStudySpecificStringId(int)>
	//   56  120:invokevirtual   #141 <Method void ConsentVisualStep.setStepTitle(int)>
		Object obj1 = ((Object) (new ConsentSection(org.researchstack.backbone.model.ConsentSection.Type.Custom)));
	//   57  123:new             #110 <Class ConsentSection>
	//   58  126:dup             
	//   59  127:getstatic       #116 <Field org.researchstack.backbone.model.ConsentSection$Type org.researchstack.backbone.model.ConsentSection$Type.Custom>
	//   60  130:invokespecial   #119 <Method void ConsentSection(org.researchstack.backbone.model.ConsentSection$Type)>
	//   61  133:astore          4
		((ConsentSection) (obj1)).setTitle(Res.getStudySpecificString(0x7f080239));
	//   62  135:aload           4
	//   63  137:ldc1            #142 <Int 0x7f080239>
	//   64  139:invokestatic    #77  <Method String Res.getStudySpecificString(int)>
	//   65  142:invokevirtual   #121 <Method void ConsentSection.setTitle(String)>
		((ConsentSection) (obj1)).setSummary(Res.getStudySpecificString(0x7f080238));
	//   66  145:aload           4
	//   67  147:ldc1            #143 <Int 0x7f080238>
	//   68  149:invokestatic    #77  <Method String Res.getStudySpecificString(int)>
	//   69  152:invokevirtual   #125 <Method void ConsentSection.setSummary(String)>
		((ConsentSection) (obj1)).setHtmlContent(Res.getStudySpecificString(0x7f080236));
	//   70  155:aload           4
	//   71  157:ldc1            #144 <Int 0x7f080236>
	//   72  159:invokestatic    #77  <Method String Res.getStudySpecificString(int)>
	//   73  162:invokevirtual   #147 <Method void ConsentSection.setHtmlContent(String)>
		((ConsentSection) (obj1)).setCustomImage("dnahelix");
	//   74  165:aload           4
	//   75  167:ldc1            #149 <String "dnahelix">
	//   76  169:invokevirtual   #152 <Method void ConsentSection.setCustomImage(String)>
		((ConsentSection) (obj1)).setCustomLearnMoreButtonTitle(Res.getStudySpecificString(0x7f080237));
	//   77  172:aload           4
	//   78  174:ldc1            #153 <Int 0x7f080237>
	//   79  176:invokestatic    #77  <Method String Res.getStudySpecificString(int)>
	//   80  179:invokevirtual   #156 <Method void ConsentSection.setCustomLearnMoreButtonTitle(String)>
		obj = ((Object) (new ConsentVisualStep("dna_consent_purpose_identifier")));
	//   81  182:new             #127 <Class ConsentVisualStep>
	//   82  185:dup             
	//   83  186:ldc1            #32  <String "dna_consent_purpose_identifier">
	//   84  188:invokespecial   #129 <Method void ConsentVisualStep(String)>
	//   85  191:astore_3        
		((ConsentVisualStep) (obj)).setSection(((ConsentSection) (obj1)));
	//   86  192:aload_3         
	//   87  193:aload           4
	//   88  195:invokevirtual   #140 <Method void ConsentVisualStep.setSection(ConsentSection)>
		((ConsentVisualStep) (obj)).setNextButtonString(Res.getRegularString(0x7f080075));
	//   89  198:aload_3         
	//   90  199:ldc1            #130 <Int 0x7f080075>
	//   91  201:invokestatic    #133 <Method String Res.getRegularString(int)>
	//   92  204:invokevirtual   #136 <Method void ConsentVisualStep.setNextButtonString(String)>
		((ConsentVisualStep) (obj)).setStepTitle(Res.getStudySpecificStringId(0x7f080212));
	//   93  207:aload_3         
	//   94  208:ldc1            #101 <Int 0x7f080212>
	//   95  210:invokestatic    #105 <Method int Res.getStudySpecificStringId(int)>
	//   96  213:invokevirtual   #141 <Method void ConsentVisualStep.setStepTitle(int)>
		Object obj2 = ((Object) (new ConsentSection(org.researchstack.backbone.model.ConsentSection.Type.Custom)));
	//   97  216:new             #110 <Class ConsentSection>
	//   98  219:dup             
	//   99  220:getstatic       #116 <Field org.researchstack.backbone.model.ConsentSection$Type org.researchstack.backbone.model.ConsentSection$Type.Custom>
	//  100  223:invokespecial   #119 <Method void ConsentSection(org.researchstack.backbone.model.ConsentSection$Type)>
	//  101  226:astore          5
		((ConsentSection) (obj2)).setTitle(Res.getStudySpecificString(0x7f080247));
	//  102  228:aload           5
	//  103  230:ldc1            #157 <Int 0x7f080247>
	//  104  232:invokestatic    #77  <Method String Res.getStudySpecificString(int)>
	//  105  235:invokevirtual   #121 <Method void ConsentSection.setTitle(String)>
		((ConsentSection) (obj2)).setSummary(Res.getStudySpecificString(0x7f080246));
	//  106  238:aload           5
	//  107  240:ldc1            #158 <Int 0x7f080246>
	//  108  242:invokestatic    #77  <Method String Res.getStudySpecificString(int)>
	//  109  245:invokevirtual   #125 <Method void ConsentSection.setSummary(String)>
		((ConsentSection) (obj2)).setHtmlContent(Res.getStudySpecificString(0x7f080244));
	//  110  248:aload           5
	//  111  250:ldc1            #159 <Int 0x7f080244>
	//  112  252:invokestatic    #77  <Method String Res.getStudySpecificString(int)>
	//  113  255:invokevirtual   #147 <Method void ConsentSection.setHtmlContent(String)>
		((ConsentSection) (obj2)).setCustomImage("testtube");
	//  114  258:aload           5
	//  115  260:ldc1            #161 <String "testtube">
	//  116  262:invokevirtual   #152 <Method void ConsentSection.setCustomImage(String)>
		((ConsentSection) (obj2)).setCustomLearnMoreButtonTitle(Res.getStudySpecificString(0x7f080245));
	//  117  265:aload           5
	//  118  267:ldc1            #162 <Int 0x7f080245>
	//  119  269:invokestatic    #77  <Method String Res.getStudySpecificString(int)>
	//  120  272:invokevirtual   #156 <Method void ConsentSection.setCustomLearnMoreButtonTitle(String)>
		obj1 = ((Object) (new ConsentVisualStep("dna_consent_sample_identifier")));
	//  121  275:new             #127 <Class ConsentVisualStep>
	//  122  278:dup             
	//  123  279:ldc1            #35  <String "dna_consent_sample_identifier">
	//  124  281:invokespecial   #129 <Method void ConsentVisualStep(String)>
	//  125  284:astore          4
		((ConsentVisualStep) (obj1)).setSection(((ConsentSection) (obj2)));
	//  126  286:aload           4
	//  127  288:aload           5
	//  128  290:invokevirtual   #140 <Method void ConsentVisualStep.setSection(ConsentSection)>
		((ConsentVisualStep) (obj1)).setNextButtonString(Res.getRegularString(0x7f080075));
	//  129  293:aload           4
	//  130  295:ldc1            #130 <Int 0x7f080075>
	//  131  297:invokestatic    #133 <Method String Res.getRegularString(int)>
	//  132  300:invokevirtual   #136 <Method void ConsentVisualStep.setNextButtonString(String)>
		((ConsentVisualStep) (obj1)).setStepTitle(Res.getStudySpecificStringId(0x7f080212));
	//  133  303:aload           4
	//  134  305:ldc1            #101 <Int 0x7f080212>
	//  135  307:invokestatic    #105 <Method int Res.getStudySpecificStringId(int)>
	//  136  310:invokevirtual   #141 <Method void ConsentVisualStep.setStepTitle(int)>
		Object obj3 = ((Object) (new ConsentSection(org.researchstack.backbone.model.ConsentSection.Type.Custom)));
	//  137  313:new             #110 <Class ConsentSection>
	//  138  316:dup             
	//  139  317:getstatic       #116 <Field org.researchstack.backbone.model.ConsentSection$Type org.researchstack.backbone.model.ConsentSection$Type.Custom>
	//  140  320:invokespecial   #119 <Method void ConsentSection(org.researchstack.backbone.model.ConsentSection$Type)>
	//  141  323:astore          6
		((ConsentSection) (obj3)).setTitle(Res.getStudySpecificString(0x7f08021f));
	//  142  325:aload           6
	//  143  327:ldc1            #163 <Int 0x7f08021f>
	//  144  329:invokestatic    #77  <Method String Res.getStudySpecificString(int)>
	//  145  332:invokevirtual   #121 <Method void ConsentSection.setTitle(String)>
		((ConsentSection) (obj3)).setSummary(Res.getStudySpecificString(0x7f08021e));
	//  146  335:aload           6
	//  147  337:ldc1            #164 <Int 0x7f08021e>
	//  148  339:invokestatic    #77  <Method String Res.getStudySpecificString(int)>
	//  149  342:invokevirtual   #125 <Method void ConsentSection.setSummary(String)>
		((ConsentSection) (obj3)).setHtmlContent(Res.getStudySpecificString(0x7f08021c));
	//  150  345:aload           6
	//  151  347:ldc1            #165 <Int 0x7f08021c>
	//  152  349:invokestatic    #77  <Method String Res.getStudySpecificString(int)>
	//  153  352:invokevirtual   #147 <Method void ConsentSection.setHtmlContent(String)>
		((ConsentSection) (obj3)).setCustomImage("consent_03");
	//  154  355:aload           6
	//  155  357:ldc1            #167 <String "consent_03">
	//  156  359:invokevirtual   #152 <Method void ConsentSection.setCustomImage(String)>
		((ConsentSection) (obj3)).setCustomLearnMoreButtonTitle(Res.getStudySpecificString(0x7f08021d));
	//  157  362:aload           6
	//  158  364:ldc1            #168 <Int 0x7f08021d>
	//  159  366:invokestatic    #77  <Method String Res.getStudySpecificString(int)>
	//  160  369:invokevirtual   #156 <Method void ConsentSection.setCustomLearnMoreButtonTitle(String)>
		obj2 = ((Object) (new ConsentVisualStep("dna_consent_evaluate_identifier")));
	//  161  372:new             #127 <Class ConsentVisualStep>
	//  162  375:dup             
	//  163  376:ldc1            #17  <String "dna_consent_evaluate_identifier">
	//  164  378:invokespecial   #129 <Method void ConsentVisualStep(String)>
	//  165  381:astore          5
		((ConsentVisualStep) (obj2)).setSection(((ConsentSection) (obj3)));
	//  166  383:aload           5
	//  167  385:aload           6
	//  168  387:invokevirtual   #140 <Method void ConsentVisualStep.setSection(ConsentSection)>
		((ConsentVisualStep) (obj2)).setNextButtonString(Res.getRegularString(0x7f080075));
	//  169  390:aload           5
	//  170  392:ldc1            #130 <Int 0x7f080075>
	//  171  394:invokestatic    #133 <Method String Res.getRegularString(int)>
	//  172  397:invokevirtual   #136 <Method void ConsentVisualStep.setNextButtonString(String)>
		((ConsentVisualStep) (obj2)).setStepTitle(Res.getStudySpecificStringId(0x7f080212));
	//  173  400:aload           5
	//  174  402:ldc1            #101 <Int 0x7f080212>
	//  175  404:invokestatic    #105 <Method int Res.getStudySpecificStringId(int)>
	//  176  407:invokevirtual   #141 <Method void ConsentVisualStep.setStepTitle(int)>
		Object obj4 = ((Object) (new ConsentSection(org.researchstack.backbone.model.ConsentSection.Type.Custom)));
	//  177  410:new             #110 <Class ConsentSection>
	//  178  413:dup             
	//  179  414:getstatic       #116 <Field org.researchstack.backbone.model.ConsentSection$Type org.researchstack.backbone.model.ConsentSection$Type.Custom>
	//  180  417:invokespecial   #119 <Method void ConsentSection(org.researchstack.backbone.model.ConsentSection$Type)>
	//  181  420:astore          7
		((ConsentSection) (obj4)).setTitle(Res.getStudySpecificString(0x7f08024b));
	//  182  422:aload           7
	//  183  424:ldc1            #169 <Int 0x7f08024b>
	//  184  426:invokestatic    #77  <Method String Res.getStudySpecificString(int)>
	//  185  429:invokevirtual   #121 <Method void ConsentSection.setTitle(String)>
		((ConsentSection) (obj4)).setSummary(Res.getStudySpecificString(0x7f08024a));
	//  186  432:aload           7
	//  187  434:ldc1            #170 <Int 0x7f08024a>
	//  188  436:invokestatic    #77  <Method String Res.getStudySpecificString(int)>
	//  189  439:invokevirtual   #125 <Method void ConsentSection.setSummary(String)>
		((ConsentSection) (obj4)).setHtmlContent(Res.getStudySpecificString(0x7f080248));
	//  190  442:aload           7
	//  191  444:ldc1            #171 <Int 0x7f080248>
	//  192  446:invokestatic    #77  <Method String Res.getStudySpecificString(int)>
	//  193  449:invokevirtual   #147 <Method void ConsentSection.setHtmlContent(String)>
		((ConsentSection) (obj4)).setCustomImage("consent_01");
	//  194  452:aload           7
	//  195  454:ldc1            #173 <String "consent_01">
	//  196  456:invokevirtual   #152 <Method void ConsentSection.setCustomImage(String)>
		((ConsentSection) (obj4)).setCustomLearnMoreButtonTitle(Res.getStudySpecificString(0x7f080249));
	//  197  459:aload           7
	//  198  461:ldc1            #174 <Int 0x7f080249>
	//  199  463:invokestatic    #77  <Method String Res.getStudySpecificString(int)>
	//  200  466:invokevirtual   #156 <Method void ConsentSection.setCustomLearnMoreButtonTitle(String)>
		obj3 = ((Object) (new ConsentVisualStep("dna_consent_study_information_identifier")));
	//  201  469:new             #127 <Class ConsentVisualStep>
	//  202  472:dup             
	//  203  473:ldc1            #38  <String "dna_consent_study_information_identifier">
	//  204  475:invokespecial   #129 <Method void ConsentVisualStep(String)>
	//  205  478:astore          6
		((ConsentVisualStep) (obj3)).setSection(((ConsentSection) (obj4)));
	//  206  480:aload           6
	//  207  482:aload           7
	//  208  484:invokevirtual   #140 <Method void ConsentVisualStep.setSection(ConsentSection)>
		((ConsentVisualStep) (obj3)).setNextButtonString(Res.getRegularString(0x7f080075));
	//  209  487:aload           6
	//  210  489:ldc1            #130 <Int 0x7f080075>
	//  211  491:invokestatic    #133 <Method String Res.getRegularString(int)>
	//  212  494:invokevirtual   #136 <Method void ConsentVisualStep.setNextButtonString(String)>
		((ConsentVisualStep) (obj3)).setStepTitle(Res.getStudySpecificStringId(0x7f080212));
	//  213  497:aload           6
	//  214  499:ldc1            #101 <Int 0x7f080212>
	//  215  501:invokestatic    #105 <Method int Res.getStudySpecificStringId(int)>
	//  216  504:invokevirtual   #141 <Method void ConsentVisualStep.setStepTitle(int)>
		Object obj5 = ((Object) (new ConsentSection(org.researchstack.backbone.model.ConsentSection.Type.Custom)));
	//  217  507:new             #110 <Class ConsentSection>
	//  218  510:dup             
	//  219  511:getstatic       #116 <Field org.researchstack.backbone.model.ConsentSection$Type org.researchstack.backbone.model.ConsentSection$Type.Custom>
	//  220  514:invokespecial   #119 <Method void ConsentSection(org.researchstack.backbone.model.ConsentSection$Type)>
	//  221  517:astore          8
		((ConsentSection) (obj5)).setTitle(Res.getStudySpecificString(0x7f08021b));
	//  222  519:aload           8
	//  223  521:ldc1            #175 <Int 0x7f08021b>
	//  224  523:invokestatic    #77  <Method String Res.getStudySpecificString(int)>
	//  225  526:invokevirtual   #121 <Method void ConsentSection.setTitle(String)>
		((ConsentSection) (obj5)).setSummary(Res.getStudySpecificString(0x7f08021a));
	//  226  529:aload           8
	//  227  531:ldc1            #176 <Int 0x7f08021a>
	//  228  533:invokestatic    #77  <Method String Res.getStudySpecificString(int)>
	//  229  536:invokevirtual   #125 <Method void ConsentSection.setSummary(String)>
		((ConsentSection) (obj5)).setHtmlContent(Res.getStudySpecificString(0x7f080218));
	//  230  539:aload           8
	//  231  541:ldc1            #177 <Int 0x7f080218>
	//  232  543:invokestatic    #77  <Method String Res.getStudySpecificString(int)>
	//  233  546:invokevirtual   #147 <Method void ConsentSection.setHtmlContent(String)>
		((ConsentSection) (obj5)).setCustomImage("consent_01");
	//  234  549:aload           8
	//  235  551:ldc1            #173 <String "consent_01">
	//  236  553:invokevirtual   #152 <Method void ConsentSection.setCustomImage(String)>
		((ConsentSection) (obj5)).setCustomLearnMoreButtonTitle(Res.getStudySpecificString(0x7f080219));
	//  237  556:aload           8
	//  238  558:ldc1            #178 <Int 0x7f080219>
	//  239  560:invokestatic    #77  <Method String Res.getStudySpecificString(int)>
	//  240  563:invokevirtual   #156 <Method void ConsentSection.setCustomLearnMoreButtonTitle(String)>
		obj4 = ((Object) (new ConsentVisualStep("dna_consent_data_sharing_identifier")));
	//  241  566:new             #127 <Class ConsentVisualStep>
	//  242  569:dup             
	//  243  570:ldc1            #14  <String "dna_consent_data_sharing_identifier">
	//  244  572:invokespecial   #129 <Method void ConsentVisualStep(String)>
	//  245  575:astore          7
		((ConsentVisualStep) (obj4)).setSection(((ConsentSection) (obj5)));
	//  246  577:aload           7
	//  247  579:aload           8
	//  248  581:invokevirtual   #140 <Method void ConsentVisualStep.setSection(ConsentSection)>
		((ConsentVisualStep) (obj4)).setNextButtonString(Res.getRegularString(0x7f080075));
	//  249  584:aload           7
	//  250  586:ldc1            #130 <Int 0x7f080075>
	//  251  588:invokestatic    #133 <Method String Res.getRegularString(int)>
	//  252  591:invokevirtual   #136 <Method void ConsentVisualStep.setNextButtonString(String)>
		((ConsentVisualStep) (obj4)).setStepTitle(Res.getStudySpecificStringId(0x7f080212));
	//  253  594:aload           7
	//  254  596:ldc1            #101 <Int 0x7f080212>
	//  255  598:invokestatic    #105 <Method int Res.getStudySpecificStringId(int)>
	//  256  601:invokevirtual   #141 <Method void ConsentVisualStep.setStepTitle(int)>
		Object obj6 = ((Object) (new ConsentSection(org.researchstack.backbone.model.ConsentSection.Type.Custom)));
	//  257  604:new             #110 <Class ConsentSection>
	//  258  607:dup             
	//  259  608:getstatic       #116 <Field org.researchstack.backbone.model.ConsentSection$Type org.researchstack.backbone.model.ConsentSection$Type.Custom>
	//  260  611:invokespecial   #119 <Method void ConsentSection(org.researchstack.backbone.model.ConsentSection$Type)>
	//  261  614:astore          9
		((ConsentSection) (obj6)).setTitle(Res.getStudySpecificString(0x7f080231));
	//  262  616:aload           9
	//  263  618:ldc1            #179 <Int 0x7f080231>
	//  264  620:invokestatic    #77  <Method String Res.getStudySpecificString(int)>
	//  265  623:invokevirtual   #121 <Method void ConsentSection.setTitle(String)>
		((ConsentSection) (obj6)).setSummary(Res.getStudySpecificString(0x7f080230));
	//  266  626:aload           9
	//  267  628:ldc1            #180 <Int 0x7f080230>
	//  268  630:invokestatic    #77  <Method String Res.getStudySpecificString(int)>
	//  269  633:invokevirtual   #125 <Method void ConsentSection.setSummary(String)>
		((ConsentSection) (obj6)).setHtmlContent(Res.getStudySpecificString(0x7f08022e));
	//  270  636:aload           9
	//  271  638:ldc1            #181 <Int 0x7f08022e>
	//  272  640:invokestatic    #77  <Method String Res.getStudySpecificString(int)>
	//  273  643:invokevirtual   #147 <Method void ConsentSection.setHtmlContent(String)>
		((ConsentSection) (obj6)).setCustomImage("consent_02");
	//  274  646:aload           9
	//  275  648:ldc1            #183 <String "consent_02">
	//  276  650:invokevirtual   #152 <Method void ConsentSection.setCustomImage(String)>
		((ConsentSection) (obj6)).setCustomLearnMoreButtonTitle(Res.getStudySpecificString(0x7f08022f));
	//  277  653:aload           9
	//  278  655:ldc1            #184 <Int 0x7f08022f>
	//  279  657:invokestatic    #77  <Method String Res.getStudySpecificString(int)>
	//  280  660:invokevirtual   #156 <Method void ConsentSection.setCustomLearnMoreButtonTitle(String)>
		obj5 = ((Object) (new ConsentVisualStep("dna_consent_privacy_1_identifier")));
	//  281  663:new             #127 <Class ConsentVisualStep>
	//  282  666:dup             
	//  283  667:ldc1            #26  <String "dna_consent_privacy_1_identifier">
	//  284  669:invokespecial   #129 <Method void ConsentVisualStep(String)>
	//  285  672:astore          8
		((ConsentVisualStep) (obj5)).setSection(((ConsentSection) (obj6)));
	//  286  674:aload           8
	//  287  676:aload           9
	//  288  678:invokevirtual   #140 <Method void ConsentVisualStep.setSection(ConsentSection)>
		((ConsentVisualStep) (obj5)).setNextButtonString(Res.getRegularString(0x7f080075));
	//  289  681:aload           8
	//  290  683:ldc1            #130 <Int 0x7f080075>
	//  291  685:invokestatic    #133 <Method String Res.getRegularString(int)>
	//  292  688:invokevirtual   #136 <Method void ConsentVisualStep.setNextButtonString(String)>
		((ConsentVisualStep) (obj5)).setStepTitle(Res.getStudySpecificStringId(0x7f080212));
	//  293  691:aload           8
	//  294  693:ldc1            #101 <Int 0x7f080212>
	//  295  695:invokestatic    #105 <Method int Res.getStudySpecificStringId(int)>
	//  296  698:invokevirtual   #141 <Method void ConsentVisualStep.setStepTitle(int)>
		Object obj7 = ((Object) (new ConsentSection(org.researchstack.backbone.model.ConsentSection.Type.Custom)));
	//  297  701:new             #110 <Class ConsentSection>
	//  298  704:dup             
	//  299  705:getstatic       #116 <Field org.researchstack.backbone.model.ConsentSection$Type org.researchstack.backbone.model.ConsentSection$Type.Custom>
	//  300  708:invokespecial   #119 <Method void ConsentSection(org.researchstack.backbone.model.ConsentSection$Type)>
	//  301  711:astore          10
		((ConsentSection) (obj7)).setTitle(Res.getStudySpecificString(0x7f080235));
	//  302  713:aload           10
	//  303  715:ldc1            #185 <Int 0x7f080235>
	//  304  717:invokestatic    #77  <Method String Res.getStudySpecificString(int)>
	//  305  720:invokevirtual   #121 <Method void ConsentSection.setTitle(String)>
		((ConsentSection) (obj7)).setSummary(Res.getStudySpecificString(0x7f080234));
	//  306  723:aload           10
	//  307  725:ldc1            #186 <Int 0x7f080234>
	//  308  727:invokestatic    #77  <Method String Res.getStudySpecificString(int)>
	//  309  730:invokevirtual   #125 <Method void ConsentSection.setSummary(String)>
		((ConsentSection) (obj7)).setHtmlContent(Res.getStudySpecificString(0x7f080232));
	//  310  733:aload           10
	//  311  735:ldc1            #187 <Int 0x7f080232>
	//  312  737:invokestatic    #77  <Method String Res.getStudySpecificString(int)>
	//  313  740:invokevirtual   #147 <Method void ConsentSection.setHtmlContent(String)>
		((ConsentSection) (obj7)).setCustomImage("consent_02");
	//  314  743:aload           10
	//  315  745:ldc1            #183 <String "consent_02">
	//  316  747:invokevirtual   #152 <Method void ConsentSection.setCustomImage(String)>
		((ConsentSection) (obj7)).setCustomLearnMoreButtonTitle(Res.getStudySpecificString(0x7f080233));
	//  317  750:aload           10
	//  318  752:ldc1            #188 <Int 0x7f080233>
	//  319  754:invokestatic    #77  <Method String Res.getStudySpecificString(int)>
	//  320  757:invokevirtual   #156 <Method void ConsentSection.setCustomLearnMoreButtonTitle(String)>
		obj6 = ((Object) (new ConsentVisualStep("dna_consent_privacy_2_identifier")));
	//  321  760:new             #127 <Class ConsentVisualStep>
	//  322  763:dup             
	//  323  764:ldc1            #29  <String "dna_consent_privacy_2_identifier">
	//  324  766:invokespecial   #129 <Method void ConsentVisualStep(String)>
	//  325  769:astore          9
		((ConsentVisualStep) (obj6)).setSection(((ConsentSection) (obj7)));
	//  326  771:aload           9
	//  327  773:aload           10
	//  328  775:invokevirtual   #140 <Method void ConsentVisualStep.setSection(ConsentSection)>
		((ConsentVisualStep) (obj6)).setNextButtonString(Res.getRegularString(0x7f080075));
	//  329  778:aload           9
	//  330  780:ldc1            #130 <Int 0x7f080075>
	//  331  782:invokestatic    #133 <Method String Res.getRegularString(int)>
	//  332  785:invokevirtual   #136 <Method void ConsentVisualStep.setNextButtonString(String)>
		((ConsentVisualStep) (obj6)).setStepTitle(Res.getStudySpecificStringId(0x7f080212));
	//  333  788:aload           9
	//  334  790:ldc1            #101 <Int 0x7f080212>
	//  335  792:invokestatic    #105 <Method int Res.getStudySpecificStringId(int)>
	//  336  795:invokevirtual   #141 <Method void ConsentVisualStep.setStepTitle(int)>
		Object obj8 = ((Object) (new ConsentSection(org.researchstack.backbone.model.ConsentSection.Type.Custom)));
	//  337  798:new             #110 <Class ConsentSection>
	//  338  801:dup             
	//  339  802:getstatic       #116 <Field org.researchstack.backbone.model.ConsentSection$Type org.researchstack.backbone.model.ConsentSection$Type.Custom>
	//  340  805:invokespecial   #119 <Method void ConsentSection(org.researchstack.backbone.model.ConsentSection$Type)>
	//  341  808:astore          11
		((ConsentSection) (obj8)).setTitle(Res.getStudySpecificString(0x7f08024f));
	//  342  810:aload           11
	//  343  812:ldc1            #189 <Int 0x7f08024f>
	//  344  814:invokestatic    #77  <Method String Res.getStudySpecificString(int)>
	//  345  817:invokevirtual   #121 <Method void ConsentSection.setTitle(String)>
		((ConsentSection) (obj8)).setSummary(Res.getStudySpecificString(0x7f08024e));
	//  346  820:aload           11
	//  347  822:ldc1            #190 <Int 0x7f08024e>
	//  348  824:invokestatic    #77  <Method String Res.getStudySpecificString(int)>
	//  349  827:invokevirtual   #125 <Method void ConsentSection.setSummary(String)>
		((ConsentSection) (obj8)).setHtmlContent(Res.getStudySpecificString(0x7f08024c));
	//  350  830:aload           11
	//  351  832:ldc1            #191 <Int 0x7f08024c>
	//  352  834:invokestatic    #77  <Method String Res.getStudySpecificString(int)>
	//  353  837:invokevirtual   #147 <Method void ConsentSection.setHtmlContent(String)>
		((ConsentSection) (obj8)).setCustomImage("consent_04");
	//  354  840:aload           11
	//  355  842:ldc1            #193 <String "consent_04">
	//  356  844:invokevirtual   #152 <Method void ConsentSection.setCustomImage(String)>
		((ConsentSection) (obj8)).setCustomLearnMoreButtonTitle(Res.getStudySpecificString(0x7f08024d));
	//  357  847:aload           11
	//  358  849:ldc1            #194 <Int 0x7f08024d>
	//  359  851:invokestatic    #77  <Method String Res.getStudySpecificString(int)>
	//  360  854:invokevirtual   #156 <Method void ConsentSection.setCustomLearnMoreButtonTitle(String)>
		obj7 = ((Object) (new ConsentVisualStep("dna_consent_time_identifier")));
	//  361  857:new             #127 <Class ConsentVisualStep>
	//  362  860:dup             
	//  363  861:ldc1            #44  <String "dna_consent_time_identifier">
	//  364  863:invokespecial   #129 <Method void ConsentVisualStep(String)>
	//  365  866:astore          10
		((ConsentVisualStep) (obj7)).setSection(((ConsentSection) (obj8)));
	//  366  868:aload           10
	//  367  870:aload           11
	//  368  872:invokevirtual   #140 <Method void ConsentVisualStep.setSection(ConsentSection)>
		((ConsentVisualStep) (obj7)).setNextButtonString(Res.getRegularString(0x7f080075));
	//  369  875:aload           10
	//  370  877:ldc1            #130 <Int 0x7f080075>
	//  371  879:invokestatic    #133 <Method String Res.getRegularString(int)>
	//  372  882:invokevirtual   #136 <Method void ConsentVisualStep.setNextButtonString(String)>
		((ConsentVisualStep) (obj7)).setStepTitle(Res.getStudySpecificStringId(0x7f080212));
	//  373  885:aload           10
	//  374  887:ldc1            #101 <Int 0x7f080212>
	//  375  889:invokestatic    #105 <Method int Res.getStudySpecificStringId(int)>
	//  376  892:invokevirtual   #141 <Method void ConsentVisualStep.setStepTitle(int)>
		Object obj9 = ((Object) (new ConsentSection(org.researchstack.backbone.model.ConsentSection.Type.Custom)));
	//  377  895:new             #110 <Class ConsentSection>
	//  378  898:dup             
	//  379  899:getstatic       #116 <Field org.researchstack.backbone.model.ConsentSection$Type org.researchstack.backbone.model.ConsentSection$Type.Custom>
	//  380  902:invokespecial   #119 <Method void ConsentSection(org.researchstack.backbone.model.ConsentSection$Type)>
	//  381  905:astore          12
		((ConsentSection) (obj9)).setTitle(Res.getStudySpecificString(0x7f080228));
	//  382  907:aload           12
	//  383  909:ldc1            #195 <Int 0x7f080228>
	//  384  911:invokestatic    #77  <Method String Res.getStudySpecificString(int)>
	//  385  914:invokevirtual   #121 <Method void ConsentSection.setTitle(String)>
		((ConsentSection) (obj9)).setSummary(Res.getStudySpecificString(0x7f080227));
	//  386  917:aload           12
	//  387  919:ldc1            #196 <Int 0x7f080227>
	//  388  921:invokestatic    #77  <Method String Res.getStudySpecificString(int)>
	//  389  924:invokevirtual   #125 <Method void ConsentSection.setSummary(String)>
		((ConsentSection) (obj9)).setHtmlContent(Res.getStudySpecificString(0x7f080225));
	//  390  927:aload           12
	//  391  929:ldc1            #197 <Int 0x7f080225>
	//  392  931:invokestatic    #77  <Method String Res.getStudySpecificString(int)>
	//  393  934:invokevirtual   #147 <Method void ConsentSection.setHtmlContent(String)>
		((ConsentSection) (obj9)).setCustomImage("consent_05");
	//  394  937:aload           12
	//  395  939:ldc1            #199 <String "consent_05">
	//  396  941:invokevirtual   #152 <Method void ConsentSection.setCustomImage(String)>
		((ConsentSection) (obj9)).setCustomLearnMoreButtonTitle(Res.getStudySpecificString(0x7f080226));
	//  397  944:aload           12
	//  398  946:ldc1            #200 <Int 0x7f080226>
	//  399  948:invokestatic    #77  <Method String Res.getStudySpecificString(int)>
	//  400  951:invokevirtual   #156 <Method void ConsentSection.setCustomLearnMoreButtonTitle(String)>
		obj8 = ((Object) (new ConsentVisualStep("dna_consent_issues_1_identifier")));
	//  401  954:new             #127 <Class ConsentVisualStep>
	//  402  957:dup             
	//  403  958:ldc1            #20  <String "dna_consent_issues_1_identifier">
	//  404  960:invokespecial   #129 <Method void ConsentVisualStep(String)>
	//  405  963:astore          11
		((ConsentVisualStep) (obj8)).setSection(((ConsentSection) (obj9)));
	//  406  965:aload           11
	//  407  967:aload           12
	//  408  969:invokevirtual   #140 <Method void ConsentVisualStep.setSection(ConsentSection)>
		((ConsentVisualStep) (obj8)).setNextButtonString(Res.getRegularString(0x7f080075));
	//  409  972:aload           11
	//  410  974:ldc1            #130 <Int 0x7f080075>
	//  411  976:invokestatic    #133 <Method String Res.getRegularString(int)>
	//  412  979:invokevirtual   #136 <Method void ConsentVisualStep.setNextButtonString(String)>
		((ConsentVisualStep) (obj8)).setStepTitle(Res.getStudySpecificStringId(0x7f080212));
	//  413  982:aload           11
	//  414  984:ldc1            #101 <Int 0x7f080212>
	//  415  986:invokestatic    #105 <Method int Res.getStudySpecificStringId(int)>
	//  416  989:invokevirtual   #141 <Method void ConsentVisualStep.setStepTitle(int)>
		Object obj10 = ((Object) (new ConsentSection(org.researchstack.backbone.model.ConsentSection.Type.Custom)));
	//  417  992:new             #110 <Class ConsentSection>
	//  418  995:dup             
	//  419  996:getstatic       #116 <Field org.researchstack.backbone.model.ConsentSection$Type org.researchstack.backbone.model.ConsentSection$Type.Custom>
	//  420  999:invokespecial   #119 <Method void ConsentSection(org.researchstack.backbone.model.ConsentSection$Type)>
	//  421 1002:astore          13
		((ConsentSection) (obj10)).setTitle(Res.getStudySpecificString(0x7f08022c));
	//  422 1004:aload           13
	//  423 1006:ldc1            #201 <Int 0x7f08022c>
	//  424 1008:invokestatic    #77  <Method String Res.getStudySpecificString(int)>
	//  425 1011:invokevirtual   #121 <Method void ConsentSection.setTitle(String)>
		((ConsentSection) (obj10)).setSummary(Res.getStudySpecificString(0x7f08022b));
	//  426 1014:aload           13
	//  427 1016:ldc1            #202 <Int 0x7f08022b>
	//  428 1018:invokestatic    #77  <Method String Res.getStudySpecificString(int)>
	//  429 1021:invokevirtual   #125 <Method void ConsentSection.setSummary(String)>
		((ConsentSection) (obj10)).setHtmlContent(Res.getStudySpecificString(0x7f080229));
	//  430 1024:aload           13
	//  431 1026:ldc1            #203 <Int 0x7f080229>
	//  432 1028:invokestatic    #77  <Method String Res.getStudySpecificString(int)>
	//  433 1031:invokevirtual   #147 <Method void ConsentSection.setHtmlContent(String)>
		((ConsentSection) (obj10)).setCustomImage("consent_05");
	//  434 1034:aload           13
	//  435 1036:ldc1            #199 <String "consent_05">
	//  436 1038:invokevirtual   #152 <Method void ConsentSection.setCustomImage(String)>
		((ConsentSection) (obj10)).setCustomLearnMoreButtonTitle(Res.getStudySpecificString(0x7f08022a));
	//  437 1041:aload           13
	//  438 1043:ldc1            #204 <Int 0x7f08022a>
	//  439 1045:invokestatic    #77  <Method String Res.getStudySpecificString(int)>
	//  440 1048:invokevirtual   #156 <Method void ConsentSection.setCustomLearnMoreButtonTitle(String)>
		obj9 = ((Object) (new ConsentVisualStep("dna_consent_issues_2_identifier")));
	//  441 1051:new             #127 <Class ConsentVisualStep>
	//  442 1054:dup             
	//  443 1055:ldc1            #23  <String "dna_consent_issues_2_identifier">
	//  444 1057:invokespecial   #129 <Method void ConsentVisualStep(String)>
	//  445 1060:astore          12
		((ConsentVisualStep) (obj9)).setSection(((ConsentSection) (obj10)));
	//  446 1062:aload           12
	//  447 1064:aload           13
	//  448 1066:invokevirtual   #140 <Method void ConsentVisualStep.setSection(ConsentSection)>
		((ConsentVisualStep) (obj9)).setNextButtonString(Res.getRegularString(0x7f080075));
	//  449 1069:aload           12
	//  450 1071:ldc1            #130 <Int 0x7f080075>
	//  451 1073:invokestatic    #133 <Method String Res.getRegularString(int)>
	//  452 1076:invokevirtual   #136 <Method void ConsentVisualStep.setNextButtonString(String)>
		((ConsentVisualStep) (obj9)).setStepTitle(Res.getStudySpecificStringId(0x7f080212));
	//  453 1079:aload           12
	//  454 1081:ldc1            #101 <Int 0x7f080212>
	//  455 1083:invokestatic    #105 <Method int Res.getStudySpecificStringId(int)>
	//  456 1086:invokevirtual   #141 <Method void ConsentVisualStep.setStepTitle(int)>
		Object obj11 = ((Object) (new ConsentSection(org.researchstack.backbone.model.ConsentSection.Type.Custom)));
	//  457 1089:new             #110 <Class ConsentSection>
	//  458 1092:dup             
	//  459 1093:getstatic       #116 <Field org.researchstack.backbone.model.ConsentSection$Type org.researchstack.backbone.model.ConsentSection$Type.Custom>
	//  460 1096:invokespecial   #119 <Method void ConsentSection(org.researchstack.backbone.model.ConsentSection$Type)>
	//  461 1099:astore          14
		((ConsentSection) (obj11)).setTitle(Res.getStudySpecificString(0x7f080217));
	//  462 1101:aload           14
	//  463 1103:ldc1            #205 <Int 0x7f080217>
	//  464 1105:invokestatic    #77  <Method String Res.getStudySpecificString(int)>
	//  465 1108:invokevirtual   #121 <Method void ConsentSection.setTitle(String)>
		((ConsentSection) (obj11)).setSummary(Res.getStudySpecificString(0x7f080216));
	//  466 1111:aload           14
	//  467 1113:ldc1            #206 <Int 0x7f080216>
	//  468 1115:invokestatic    #77  <Method String Res.getStudySpecificString(int)>
	//  469 1118:invokevirtual   #125 <Method void ConsentSection.setSummary(String)>
		((ConsentSection) (obj11)).setHtmlContent(Res.getStudySpecificString(0x7f080214));
	//  470 1121:aload           14
	//  471 1123:ldc1            #207 <Int 0x7f080214>
	//  472 1125:invokestatic    #77  <Method String Res.getStudySpecificString(int)>
	//  473 1128:invokevirtual   #147 <Method void ConsentSection.setHtmlContent(String)>
		((ConsentSection) (obj11)).setCustomImage("consent_06");
	//  474 1131:aload           14
	//  475 1133:ldc1            #209 <String "consent_06">
	//  476 1135:invokevirtual   #152 <Method void ConsentSection.setCustomImage(String)>
		((ConsentSection) (obj11)).setCustomLearnMoreButtonTitle(Res.getStudySpecificString(0x7f080215));
	//  477 1138:aload           14
	//  478 1140:ldc1            #210 <Int 0x7f080215>
	//  479 1142:invokestatic    #77  <Method String Res.getStudySpecificString(int)>
	//  480 1145:invokevirtual   #156 <Method void ConsentSection.setCustomLearnMoreButtonTitle(String)>
		obj10 = ((Object) (new ConsentVisualStep("dna_consent_costs_identifier")));
	//  481 1148:new             #127 <Class ConsentVisualStep>
	//  482 1151:dup             
	//  483 1152:ldc1            #11  <String "dna_consent_costs_identifier">
	//  484 1154:invokespecial   #129 <Method void ConsentVisualStep(String)>
	//  485 1157:astore          13
		((ConsentVisualStep) (obj10)).setSection(((ConsentSection) (obj11)));
	//  486 1159:aload           13
	//  487 1161:aload           14
	//  488 1163:invokevirtual   #140 <Method void ConsentVisualStep.setSection(ConsentSection)>
		((ConsentVisualStep) (obj10)).setNextButtonString(Res.getRegularString(0x7f080075));
	//  489 1166:aload           13
	//  490 1168:ldc1            #130 <Int 0x7f080075>
	//  491 1170:invokestatic    #133 <Method String Res.getRegularString(int)>
	//  492 1173:invokevirtual   #136 <Method void ConsentVisualStep.setNextButtonString(String)>
		((ConsentVisualStep) (obj10)).setStepTitle(Res.getStudySpecificStringId(0x7f080212));
	//  493 1176:aload           13
	//  494 1178:ldc1            #101 <Int 0x7f080212>
	//  495 1180:invokestatic    #105 <Method int Res.getStudySpecificStringId(int)>
	//  496 1183:invokevirtual   #141 <Method void ConsentVisualStep.setStepTitle(int)>
		Object obj12 = ((Object) (new ConsentSection(org.researchstack.backbone.model.ConsentSection.Type.Custom)));
	//  497 1186:new             #110 <Class ConsentSection>
	//  498 1189:dup             
	//  499 1190:getstatic       #116 <Field org.researchstack.backbone.model.ConsentSection$Type org.researchstack.backbone.model.ConsentSection$Type.Custom>
	//  500 1193:invokespecial   #119 <Method void ConsentSection(org.researchstack.backbone.model.ConsentSection$Type)>
	//  501 1196:astore          15
		((ConsentSection) (obj12)).setTitle(Res.getStudySpecificString(0x7f080255));
	//  502 1198:aload           15
	//  503 1200:ldc1            #211 <Int 0x7f080255>
	//  504 1202:invokestatic    #77  <Method String Res.getStudySpecificString(int)>
	//  505 1205:invokevirtual   #121 <Method void ConsentSection.setTitle(String)>
		((ConsentSection) (obj12)).setSummary(Res.getStudySpecificString(0x7f080254));
	//  506 1208:aload           15
	//  507 1210:ldc1            #212 <Int 0x7f080254>
	//  508 1212:invokestatic    #77  <Method String Res.getStudySpecificString(int)>
	//  509 1215:invokevirtual   #125 <Method void ConsentSection.setSummary(String)>
		((ConsentSection) (obj12)).setHtmlContent(Res.getStudySpecificString(0x7f080252));
	//  510 1218:aload           15
	//  511 1220:ldc1            #213 <Int 0x7f080252>
	//  512 1222:invokestatic    #77  <Method String Res.getStudySpecificString(int)>
	//  513 1225:invokevirtual   #147 <Method void ConsentSection.setHtmlContent(String)>
		((ConsentSection) (obj12)).setCustomImage("consent_07");
	//  514 1228:aload           15
	//  515 1230:ldc1            #215 <String "consent_07">
	//  516 1232:invokevirtual   #152 <Method void ConsentSection.setCustomImage(String)>
		((ConsentSection) (obj12)).setCustomLearnMoreButtonTitle(Res.getStudySpecificString(0x7f080253));
	//  517 1235:aload           15
	//  518 1237:ldc1            #216 <Int 0x7f080253>
	//  519 1239:invokestatic    #77  <Method String Res.getStudySpecificString(int)>
	//  520 1242:invokevirtual   #156 <Method void ConsentSection.setCustomLearnMoreButtonTitle(String)>
		obj11 = ((Object) (new ConsentVisualStep("dna_consent_withdrawing_identifier")));
	//  521 1245:new             #127 <Class ConsentVisualStep>
	//  522 1248:dup             
	//  523 1249:ldc1            #47  <String "dna_consent_withdrawing_identifier">
	//  524 1251:invokespecial   #129 <Method void ConsentVisualStep(String)>
	//  525 1254:astore          14
		((ConsentVisualStep) (obj11)).setSection(((ConsentSection) (obj12)));
	//  526 1256:aload           14
	//  527 1258:aload           15
	//  528 1260:invokevirtual   #140 <Method void ConsentVisualStep.setSection(ConsentSection)>
		((ConsentVisualStep) (obj11)).setNextButtonString(Res.getRegularString(0x7f080075));
	//  529 1263:aload           14
	//  530 1265:ldc1            #130 <Int 0x7f080075>
	//  531 1267:invokestatic    #133 <Method String Res.getRegularString(int)>
	//  532 1270:invokevirtual   #136 <Method void ConsentVisualStep.setNextButtonString(String)>
		((ConsentVisualStep) (obj11)).setStepTitle(Res.getStudySpecificStringId(0x7f080212));
	//  533 1273:aload           14
	//  534 1275:ldc1            #101 <Int 0x7f080212>
	//  535 1277:invokestatic    #105 <Method int Res.getStudySpecificStringId(int)>
	//  536 1280:invokevirtual   #141 <Method void ConsentVisualStep.setStepTitle(int)>
		obj12 = ((Object) (new InstructionStep("dna_comprehension_check_intro_identifier", Res.getStudySpecificString(0x7f08023c), Res.getStudySpecificString(0x7f08023b))));
	//  537 1283:new             #95  <Class InstructionStep>
	//  538 1286:dup             
	//  539 1287:ldc1            #8   <String "dna_comprehension_check_intro_identifier">
	//  540 1289:ldc1            #217 <Int 0x7f08023c>
	//  541 1291:invokestatic    #77  <Method String Res.getStudySpecificString(int)>
	//  542 1294:ldc1            #218 <Int 0x7f08023b>
	//  543 1296:invokestatic    #77  <Method String Res.getStudySpecificString(int)>
	//  544 1299:invokespecial   #100 <Method void InstructionStep(String, String, String)>
	//  545 1302:astore          15
		((InstructionStep) (obj12)).setStepTitle(Res.getStudySpecificStringId(0x7f08020a));
	//  546 1304:aload           15
	//  547 1306:ldc1            #219 <Int 0x7f08020a>
	//  548 1308:invokestatic    #105 <Method int Res.getStudySpecificStringId(int)>
	//  549 1311:invokevirtual   #108 <Method void InstructionStep.setStepTitle(int)>
		Object obj14 = ((Object) (new ChoiceAnswerFormat(org.researchstack.backbone.answerformat.AnswerFormat.ChoiceAnswerStyle.SingleChoice, new Choice[] {
			new Choice(Res.getRegularString(0x7f08002b), "1"), new Choice(Res.getRegularString(0x7f080029), "2")
		})));
	//  550 1314:new             #221 <Class ChoiceAnswerFormat>
	//  551 1317:dup             
	//  552 1318:getstatic       #227 <Field org.researchstack.backbone.answerformat.AnswerFormat$ChoiceAnswerStyle org.researchstack.backbone.answerformat.AnswerFormat$ChoiceAnswerStyle.SingleChoice>
	//  553 1321:iconst_2        
	//  554 1322:anewarray       Choice[]
	//  555 1325:dup             
	//  556 1326:iconst_0        
	//  557 1327:new             #229 <Class Choice>
	//  558 1330:dup             
	//  559 1331:ldc1            #230 <Int 0x7f08002b>
	//  560 1333:invokestatic    #133 <Method String Res.getRegularString(int)>
	//  561 1336:ldc1            #232 <String "1">
	//  562 1338:invokespecial   #235 <Method void Choice(String, Object)>
	//  563 1341:aastore         
	//  564 1342:dup             
	//  565 1343:iconst_1        
	//  566 1344:new             #229 <Class Choice>
	//  567 1347:dup             
	//  568 1348:ldc1            #236 <Int 0x7f080029>
	//  569 1350:invokestatic    #133 <Method String Res.getRegularString(int)>
	//  570 1353:ldc1            #238 <String "2">
	//  571 1355:invokespecial   #235 <Method void Choice(String, Object)>
	//  572 1358:aastore         
	//  573 1359:invokespecial   #241 <Method void ChoiceAnswerFormat(org.researchstack.backbone.answerformat.AnswerFormat$ChoiceAnswerStyle, Choice[])>
	//  574 1362:astore          21
		Object obj13 = ((Object) (new ChoiceAnswerFormat(org.researchstack.backbone.answerformat.AnswerFormat.ChoiceAnswerStyle.SingleChoice, new Choice[] {
			new Choice(Res.getStudySpecificString(0x7f080240), "1"), new Choice(Res.getStudySpecificString(0x7f080241), "2")
		})));
	//  575 1364:new             #221 <Class ChoiceAnswerFormat>
	//  576 1367:dup             
	//  577 1368:getstatic       #227 <Field org.researchstack.backbone.answerformat.AnswerFormat$ChoiceAnswerStyle org.researchstack.backbone.answerformat.AnswerFormat$ChoiceAnswerStyle.SingleChoice>
	//  578 1371:iconst_2        
	//  579 1372:anewarray       Choice[]
	//  580 1375:dup             
	//  581 1376:iconst_0        
	//  582 1377:new             #229 <Class Choice>
	//  583 1380:dup             
	//  584 1381:ldc1            #242 <Int 0x7f080240>
	//  585 1383:invokestatic    #77  <Method String Res.getStudySpecificString(int)>
	//  586 1386:ldc1            #232 <String "1">
	//  587 1388:invokespecial   #235 <Method void Choice(String, Object)>
	//  588 1391:aastore         
	//  589 1392:dup             
	//  590 1393:iconst_1        
	//  591 1394:new             #229 <Class Choice>
	//  592 1397:dup             
	//  593 1398:ldc1            #243 <Int 0x7f080241>
	//  594 1400:invokestatic    #77  <Method String Res.getStudySpecificString(int)>
	//  595 1403:ldc1            #238 <String "2">
	//  596 1405:invokespecial   #235 <Method void Choice(String, Object)>
	//  597 1408:aastore         
	//  598 1409:invokespecial   #241 <Method void ChoiceAnswerFormat(org.researchstack.backbone.answerformat.AnswerFormat$ChoiceAnswerStyle, Choice[])>
	//  599 1412:astore          17
		QuestionStep questionstep = new QuestionStep("comprehension_check_1");
	//  600 1414:new             #245 <Class QuestionStep>
	//  601 1417:dup             
	//  602 1418:ldc1            #247 <String "comprehension_check_1">
	//  603 1420:invokespecial   #248 <Method void QuestionStep(String)>
	//  604 1423:astore          16
		questionstep.setText(Res.getStudySpecificString(0x7f080242));
	//  605 1425:aload           16
	//  606 1427:ldc1            #249 <Int 0x7f080242>
	//  607 1429:invokestatic    #77  <Method String Res.getStudySpecificString(int)>
	//  608 1432:invokevirtual   #252 <Method void QuestionStep.setText(String)>
		questionstep.setStepTitle(Res.getStudySpecificStringId(0x7f08020a));
	//  609 1435:aload           16
	//  610 1437:ldc1            #219 <Int 0x7f08020a>
	//  611 1439:invokestatic    #105 <Method int Res.getStudySpecificStringId(int)>
	//  612 1442:invokevirtual   #253 <Method void QuestionStep.setStepTitle(int)>
		questionstep.setOptional(false);
	//  613 1445:aload           16
	//  614 1447:iconst_0        
	//  615 1448:invokevirtual   #257 <Method void QuestionStep.setOptional(boolean)>
		questionstep.setAnswerFormat(((org.researchstack.backbone.answerformat.AnswerFormat) (obj13)));
	//  616 1451:aload           16
	//  617 1453:aload           17
	//  618 1455:invokevirtual   #261 <Method void QuestionStep.setAnswerFormat(org.researchstack.backbone.answerformat.AnswerFormat)>
		obj13 = ((Object) (new QuestionStep("comprehension_check_2")));
	//  619 1458:new             #245 <Class QuestionStep>
	//  620 1461:dup             
	//  621 1462:ldc2            #263 <String "comprehension_check_2">
	//  622 1465:invokespecial   #248 <Method void QuestionStep(String)>
	//  623 1468:astore          17
		((QuestionStep) (obj13)).setText(Res.getStudySpecificString(0x7f08023a));
	//  624 1470:aload           17
	//  625 1472:ldc2            #264 <Int 0x7f08023a>
	//  626 1475:invokestatic    #77  <Method String Res.getStudySpecificString(int)>
	//  627 1478:invokevirtual   #252 <Method void QuestionStep.setText(String)>
		((QuestionStep) (obj13)).setStepTitle(Res.getStudySpecificStringId(0x7f08020a));
	//  628 1481:aload           17
	//  629 1483:ldc1            #219 <Int 0x7f08020a>
	//  630 1485:invokestatic    #105 <Method int Res.getStudySpecificStringId(int)>
	//  631 1488:invokevirtual   #253 <Method void QuestionStep.setStepTitle(int)>
		((QuestionStep) (obj13)).setOptional(false);
	//  632 1491:aload           17
	//  633 1493:iconst_0        
	//  634 1494:invokevirtual   #257 <Method void QuestionStep.setOptional(boolean)>
		((QuestionStep) (obj13)).setAnswerFormat(((org.researchstack.backbone.answerformat.AnswerFormat) (obj14)));
	//  635 1497:aload           17
	//  636 1499:aload           21
	//  637 1501:invokevirtual   #261 <Method void QuestionStep.setAnswerFormat(org.researchstack.backbone.answerformat.AnswerFormat)>
		QuestionStep questionstep1 = new QuestionStep("comprehension_check_3");
	//  638 1504:new             #245 <Class QuestionStep>
	//  639 1507:dup             
	//  640 1508:ldc2            #266 <String "comprehension_check_3">
	//  641 1511:invokespecial   #248 <Method void QuestionStep(String)>
	//  642 1514:astore          18
		questionstep1.setText(Res.getStudySpecificString(0x7f08023e));
	//  643 1516:aload           18
	//  644 1518:ldc2            #267 <Int 0x7f08023e>
	//  645 1521:invokestatic    #77  <Method String Res.getStudySpecificString(int)>
	//  646 1524:invokevirtual   #252 <Method void QuestionStep.setText(String)>
		questionstep1.setStepTitle(Res.getStudySpecificStringId(0x7f08020a));
	//  647 1527:aload           18
	//  648 1529:ldc1            #219 <Int 0x7f08020a>
	//  649 1531:invokestatic    #105 <Method int Res.getStudySpecificStringId(int)>
	//  650 1534:invokevirtual   #253 <Method void QuestionStep.setStepTitle(int)>
		questionstep1.setOptional(false);
	//  651 1537:aload           18
	//  652 1539:iconst_0        
	//  653 1540:invokevirtual   #257 <Method void QuestionStep.setOptional(boolean)>
		questionstep1.setAnswerFormat(((org.researchstack.backbone.answerformat.AnswerFormat) (obj14)));
	//  654 1543:aload           18
	//  655 1545:aload           21
	//  656 1547:invokevirtual   #261 <Method void QuestionStep.setAnswerFormat(org.researchstack.backbone.answerformat.AnswerFormat)>
		QuestionStep questionstep2 = new QuestionStep("comprehension_check_4");
	//  657 1550:new             #245 <Class QuestionStep>
	//  658 1553:dup             
	//  659 1554:ldc2            #269 <String "comprehension_check_4">
	//  660 1557:invokespecial   #248 <Method void QuestionStep(String)>
	//  661 1560:astore          19
		questionstep2.setText(Res.getStudySpecificString(0x7f08023d));
	//  662 1562:aload           19
	//  663 1564:ldc2            #270 <Int 0x7f08023d>
	//  664 1567:invokestatic    #77  <Method String Res.getStudySpecificString(int)>
	//  665 1570:invokevirtual   #252 <Method void QuestionStep.setText(String)>
		questionstep2.setStepTitle(Res.getStudySpecificStringId(0x7f08020a));
	//  666 1573:aload           19
	//  667 1575:ldc1            #219 <Int 0x7f08020a>
	//  668 1577:invokestatic    #105 <Method int Res.getStudySpecificStringId(int)>
	//  669 1580:invokevirtual   #253 <Method void QuestionStep.setStepTitle(int)>
		questionstep2.setOptional(false);
	//  670 1583:aload           19
	//  671 1585:iconst_0        
	//  672 1586:invokevirtual   #257 <Method void QuestionStep.setOptional(boolean)>
		questionstep2.setAnswerFormat(((org.researchstack.backbone.answerformat.AnswerFormat) (obj14)));
	//  673 1589:aload           19
	//  674 1591:aload           21
	//  675 1593:invokevirtual   #261 <Method void QuestionStep.setAnswerFormat(org.researchstack.backbone.answerformat.AnswerFormat)>
		QuestionStep questionstep3 = new QuestionStep("comprehension_check_5");
	//  676 1596:new             #245 <Class QuestionStep>
	//  677 1599:dup             
	//  678 1600:ldc2            #272 <String "comprehension_check_5">
	//  679 1603:invokespecial   #248 <Method void QuestionStep(String)>
	//  680 1606:astore          20
		questionstep3.setText(Res.getStudySpecificString(0x7f08023f));
	//  681 1608:aload           20
	//  682 1610:ldc2            #273 <Int 0x7f08023f>
	//  683 1613:invokestatic    #77  <Method String Res.getStudySpecificString(int)>
	//  684 1616:invokevirtual   #252 <Method void QuestionStep.setText(String)>
		questionstep3.setStepTitle(Res.getStudySpecificStringId(0x7f08020a));
	//  685 1619:aload           20
	//  686 1621:ldc1            #219 <Int 0x7f08020a>
	//  687 1623:invokestatic    #105 <Method int Res.getStudySpecificStringId(int)>
	//  688 1626:invokevirtual   #253 <Method void QuestionStep.setStepTitle(int)>
		questionstep3.setOptional(false);
	//  689 1629:aload           20
	//  690 1631:iconst_0        
	//  691 1632:invokevirtual   #257 <Method void QuestionStep.setOptional(boolean)>
		questionstep3.setAnswerFormat(((org.researchstack.backbone.answerformat.AnswerFormat) (obj14)));
	//  692 1635:aload           20
	//  693 1637:aload           21
	//  694 1639:invokevirtual   #261 <Method void QuestionStep.setAnswerFormat(org.researchstack.backbone.answerformat.AnswerFormat)>
		obj14 = ((Object) (new QuestionStep("comprehension_check_failure")));
	//  695 1642:new             #245 <Class QuestionStep>
	//  696 1645:dup             
	//  697 1646:ldc2            #275 <String "comprehension_check_failure">
	//  698 1649:invokespecial   #248 <Method void QuestionStep(String)>
	//  699 1652:astore          21
		((QuestionStep) (obj14)).setStepTitle(Res.getStudySpecificStringId(0x7f08020a));
	//  700 1654:aload           21
	//  701 1656:ldc1            #219 <Int 0x7f08020a>
	//  702 1658:invokestatic    #105 <Method int Res.getStudySpecificStringId(int)>
	//  703 1661:invokevirtual   #253 <Method void QuestionStep.setStepTitle(int)>
		((QuestionStep) (obj14)).setOptional(false);
	//  704 1664:aload           21
	//  705 1666:iconst_0        
	//  706 1667:invokevirtual   #257 <Method void QuestionStep.setOptional(boolean)>
		((QuestionStep) (obj14)).setAnswerFormat(((org.researchstack.backbone.answerformat.AnswerFormat) (new ChoiceAnswerFormat(org.researchstack.backbone.answerformat.AnswerFormat.ChoiceAnswerStyle.SingleChoice, new Choice[] {
			new Choice(Res.getStudySpecificString(0x7f080220), "1"), new Choice(Res.getStudySpecificString(0x7f080221), "2")
		}))));
	//  707 1670:aload           21
	//  708 1672:new             #221 <Class ChoiceAnswerFormat>
	//  709 1675:dup             
	//  710 1676:getstatic       #227 <Field org.researchstack.backbone.answerformat.AnswerFormat$ChoiceAnswerStyle org.researchstack.backbone.answerformat.AnswerFormat$ChoiceAnswerStyle.SingleChoice>
	//  711 1679:iconst_2        
	//  712 1680:anewarray       Choice[]
	//  713 1683:dup             
	//  714 1684:iconst_0        
	//  715 1685:new             #229 <Class Choice>
	//  716 1688:dup             
	//  717 1689:ldc2            #276 <Int 0x7f080220>
	//  718 1692:invokestatic    #77  <Method String Res.getStudySpecificString(int)>
	//  719 1695:ldc1            #232 <String "1">
	//  720 1697:invokespecial   #235 <Method void Choice(String, Object)>
	//  721 1700:aastore         
	//  722 1701:dup             
	//  723 1702:iconst_1        
	//  724 1703:new             #229 <Class Choice>
	//  725 1706:dup             
	//  726 1707:ldc2            #277 <Int 0x7f080221>
	//  727 1710:invokestatic    #77  <Method String Res.getStudySpecificString(int)>
	//  728 1713:ldc1            #238 <String "2">
	//  729 1715:invokespecial   #235 <Method void Choice(String, Object)>
	//  730 1718:aastore         
	//  731 1719:invokespecial   #241 <Method void ChoiceAnswerFormat(org.researchstack.backbone.answerformat.AnswerFormat$ChoiceAnswerStyle, Choice[])>
	//  732 1722:invokevirtual   #261 <Method void QuestionStep.setAnswerFormat(org.researchstack.backbone.answerformat.AnswerFormat)>
		((QuestionStep) (obj14)).setText(Res.getStudySpecificString(0x7f080222));
	//  733 1725:aload           21
	//  734 1727:ldc2            #278 <Int 0x7f080222>
	//  735 1730:invokestatic    #77  <Method String Res.getStudySpecificString(int)>
	//  736 1733:invokevirtual   #252 <Method void QuestionStep.setText(String)>
		((QuestionStep) (obj14)).setAllowsBackNavigation(false);
	//  737 1736:aload           21
	//  738 1738:iconst_0        
	//  739 1739:invokevirtual   #281 <Method void QuestionStep.setAllowsBackNavigation(boolean)>
		InstructionStep instructionstep1 = new InstructionStep("comprehension_check_success", "", Res.getStudySpecificString(0x7f08022d));
	//  740 1742:new             #95  <Class InstructionStep>
	//  741 1745:dup             
	//  742 1746:ldc2            #283 <String "comprehension_check_success">
	//  743 1749:ldc2            #285 <String "">
	//  744 1752:ldc2            #286 <Int 0x7f08022d>
	//  745 1755:invokestatic    #77  <Method String Res.getStudySpecificString(int)>
	//  746 1758:invokespecial   #100 <Method void InstructionStep(String, String, String)>
	//  747 1761:astore          22
		instructionstep1.setStepTitle(Res.getStudySpecificStringId(0x7f08020a));
	//  748 1763:aload           22
	//  749 1765:ldc1            #219 <Int 0x7f08020a>
	//  750 1767:invokestatic    #105 <Method int Res.getStudySpecificStringId(int)>
	//  751 1770:invokevirtual   #108 <Method void InstructionStep.setStepTitle(int)>
		instructionstep1.setAllowsBackNavigation(false);
	//  752 1773:aload           22
	//  753 1775:iconst_0        
	//  754 1776:invokevirtual   #287 <Method void InstructionStep.setAllowsBackNavigation(boolean)>
		Step step = ConsentReviewStepsFactory.createReviewStep(consentdocument, Res.getStudySpecificString(0x7f080243));
	//  755 1779:aload_0         
	//  756 1780:ldc2            #288 <Int 0x7f080243>
	//  757 1783:invokestatic    #77  <Method String Res.getStudySpecificString(int)>
	//  758 1786:invokestatic    #294 <Method Step ConsentReviewStepsFactory.createReviewStep(ConsentDocument, String)>
	//  759 1789:astore          23
		step.setAllowsBackNavigation(false);
	//  760 1791:aload           23
	//  761 1793:iconst_0        
	//  762 1794:invokevirtual   #297 <Method void Step.setAllowsBackNavigation(boolean)>
		step.setStepTitle(Res.getStudySpecificStringId(0x7f080212));
	//  763 1797:aload           23
	//  764 1799:ldc1            #101 <Int 0x7f080212>
	//  765 1801:invokestatic    #105 <Method int Res.getStudySpecificStringId(int)>
	//  766 1804:invokevirtual   #298 <Method void Step.setStepTitle(int)>
		ConsentSignatureStep consentsignaturestep = new ConsentSignatureStep("dna_signature_consent_identifier");
	//  767 1807:new             #300 <Class ConsentSignatureStep>
	//  768 1810:dup             
	//  769 1811:ldc1            #53  <String "dna_signature_consent_identifier">
	//  770 1813:invokespecial   #301 <Method void ConsentSignatureStep(String)>
	//  771 1816:astore          24
		consentsignaturestep.setTitle(Res.getRegularString(0x7f080047));
	//  772 1818:aload           24
	//  773 1820:ldc2            #302 <Int 0x7f080047>
	//  774 1823:invokestatic    #133 <Method String Res.getRegularString(int)>
	//  775 1826:invokevirtual   #303 <Method void ConsentSignatureStep.setTitle(String)>
		consentsignaturestep.setStepLayoutClass(org/researchstack/backbone/ui/step/layout/ConsentSignatureStepLayout);
	//  776 1829:aload           24
	//  777 1831:ldc2            #305 <Class ConsentSignatureStepLayout>
	//  778 1834:invokevirtual   #309 <Method void ConsentSignatureStep.setStepLayoutClass(Class)>
		consentsignaturestep.setStepTitle(Res.getStudySpecificStringId(0x7f080336));
	//  779 1837:aload           24
	//  780 1839:ldc2            #310 <Int 0x7f080336>
	//  781 1842:invokestatic    #105 <Method int Res.getStudySpecificStringId(int)>
	//  782 1845:invokevirtual   #311 <Method void ConsentSignatureStep.setStepTitle(int)>
		ArrayList arraylist = new ArrayList();
	//  783 1848:new             #313 <Class ArrayList>
	//  784 1851:dup             
	//  785 1852:invokespecial   #314 <Method void ArrayList()>
	//  786 1855:astore          25
		((List) (arraylist)).add(((Object) (instructionstep)));
	//  787 1857:aload           25
	//  788 1859:aload_1         
	//  789 1860:invokeinterface #320 <Method boolean List.add(Object)>
	//  790 1865:pop             
		((List) (arraylist)).add(((Object) (consentvisualstep)));
	//  791 1866:aload           25
	//  792 1868:aload_2         
	//  793 1869:invokeinterface #320 <Method boolean List.add(Object)>
	//  794 1874:pop             
		((List) (arraylist)).add(obj);
	//  795 1875:aload           25
	//  796 1877:aload_3         
	//  797 1878:invokeinterface #320 <Method boolean List.add(Object)>
	//  798 1883:pop             
		((List) (arraylist)).add(obj1);
	//  799 1884:aload           25
	//  800 1886:aload           4
	//  801 1888:invokeinterface #320 <Method boolean List.add(Object)>
	//  802 1893:pop             
		((List) (arraylist)).add(obj2);
	//  803 1894:aload           25
	//  804 1896:aload           5
	//  805 1898:invokeinterface #320 <Method boolean List.add(Object)>
	//  806 1903:pop             
		((List) (arraylist)).add(obj3);
	//  807 1904:aload           25
	//  808 1906:aload           6
	//  809 1908:invokeinterface #320 <Method boolean List.add(Object)>
	//  810 1913:pop             
		((List) (arraylist)).add(obj4);
	//  811 1914:aload           25
	//  812 1916:aload           7
	//  813 1918:invokeinterface #320 <Method boolean List.add(Object)>
	//  814 1923:pop             
		((List) (arraylist)).add(obj5);
	//  815 1924:aload           25
	//  816 1926:aload           8
	//  817 1928:invokeinterface #320 <Method boolean List.add(Object)>
	//  818 1933:pop             
		((List) (arraylist)).add(obj6);
	//  819 1934:aload           25
	//  820 1936:aload           9
	//  821 1938:invokeinterface #320 <Method boolean List.add(Object)>
	//  822 1943:pop             
		((List) (arraylist)).add(obj7);
	//  823 1944:aload           25
	//  824 1946:aload           10
	//  825 1948:invokeinterface #320 <Method boolean List.add(Object)>
	//  826 1953:pop             
		((List) (arraylist)).add(obj8);
	//  827 1954:aload           25
	//  828 1956:aload           11
	//  829 1958:invokeinterface #320 <Method boolean List.add(Object)>
	//  830 1963:pop             
		((List) (arraylist)).add(obj9);
	//  831 1964:aload           25
	//  832 1966:aload           12
	//  833 1968:invokeinterface #320 <Method boolean List.add(Object)>
	//  834 1973:pop             
		((List) (arraylist)).add(obj10);
	//  835 1974:aload           25
	//  836 1976:aload           13
	//  837 1978:invokeinterface #320 <Method boolean List.add(Object)>
	//  838 1983:pop             
		((List) (arraylist)).add(obj11);
	//  839 1984:aload           25
	//  840 1986:aload           14
	//  841 1988:invokeinterface #320 <Method boolean List.add(Object)>
	//  842 1993:pop             
		((List) (arraylist)).add(obj12);
	//  843 1994:aload           25
	//  844 1996:aload           15
	//  845 1998:invokeinterface #320 <Method boolean List.add(Object)>
	//  846 2003:pop             
		((List) (arraylist)).add(((Object) (questionstep)));
	//  847 2004:aload           25
	//  848 2006:aload           16
	//  849 2008:invokeinterface #320 <Method boolean List.add(Object)>
	//  850 2013:pop             
		((List) (arraylist)).add(obj13);
	//  851 2014:aload           25
	//  852 2016:aload           17
	//  853 2018:invokeinterface #320 <Method boolean List.add(Object)>
	//  854 2023:pop             
		((List) (arraylist)).add(((Object) (questionstep1)));
	//  855 2024:aload           25
	//  856 2026:aload           18
	//  857 2028:invokeinterface #320 <Method boolean List.add(Object)>
	//  858 2033:pop             
		((List) (arraylist)).add(((Object) (questionstep2)));
	//  859 2034:aload           25
	//  860 2036:aload           19
	//  861 2038:invokeinterface #320 <Method boolean List.add(Object)>
	//  862 2043:pop             
		((List) (arraylist)).add(((Object) (questionstep3)));
	//  863 2044:aload           25
	//  864 2046:aload           20
	//  865 2048:invokeinterface #320 <Method boolean List.add(Object)>
	//  866 2053:pop             
		((List) (arraylist)).add(obj14);
	//  867 2054:aload           25
	//  868 2056:aload           21
	//  869 2058:invokeinterface #320 <Method boolean List.add(Object)>
	//  870 2063:pop             
		((List) (arraylist)).add(((Object) (instructionstep1)));
	//  871 2064:aload           25
	//  872 2066:aload           22
	//  873 2068:invokeinterface #320 <Method boolean List.add(Object)>
	//  874 2073:pop             
		((List) (arraylist)).add(((Object) (step)));
	//  875 2074:aload           25
	//  876 2076:aload           23
	//  877 2078:invokeinterface #320 <Method boolean List.add(Object)>
	//  878 2083:pop             
		((List) (arraylist)).add(((Object) (consentsignaturestep)));
	//  879 2084:aload           25
	//  880 2086:aload           24
	//  881 2088:invokeinterface #320 <Method boolean List.add(Object)>
	//  882 2093:pop             
		return new DnaConsentTuple(consentdocument, new DnaConsentTask("dna_consent_task", ((List) (arraylist))));
	//  883 2094:new             #322 <Class DnaConsentTuple>
	//  884 2097:dup             
	//  885 2098:aload_0         
	//  886 2099:new             #2   <Class DnaConsentTask>
	//  887 2102:dup             
	//  888 2103:ldc1            #41  <String "dna_consent_task">
	//  889 2105:aload           25
	//  890 2107:invokespecial   #323 <Method void DnaConsentTask(String, List)>
	//  891 2110:invokespecial   #326 <Method void DnaConsentTuple(ConsentDocument, DnaConsentTask)>
	//  892 2113:areturn         
	}

	private void clearComprehensionQuizSelections(TaskResult taskresult)
	{
		taskresult = ((TaskResult) (taskresult.getResults()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #334 <Method Map TaskResult.getResults()>
	//    2    4:astore_1        
		((StepResult)((Map) (taskresult)).get("comprehension_check_1")).getResults().clear();
	//    3    5:aload_1         
	//    4    6:ldc1            #247 <String "comprehension_check_1">
	//    5    8:invokeinterface #340 <Method Object Map.get(Object)>
	//    6   13:checkcast       #342 <Class StepResult>
	//    7   16:invokevirtual   #343 <Method Map StepResult.getResults()>
	//    8   19:invokeinterface #346 <Method void Map.clear()>
		((StepResult)((Map) (taskresult)).get("comprehension_check_2")).getResults().clear();
	//    9   24:aload_1         
	//   10   25:ldc2            #263 <String "comprehension_check_2">
	//   11   28:invokeinterface #340 <Method Object Map.get(Object)>
	//   12   33:checkcast       #342 <Class StepResult>
	//   13   36:invokevirtual   #343 <Method Map StepResult.getResults()>
	//   14   39:invokeinterface #346 <Method void Map.clear()>
		((StepResult)((Map) (taskresult)).get("comprehension_check_3")).getResults().clear();
	//   15   44:aload_1         
	//   16   45:ldc2            #266 <String "comprehension_check_3">
	//   17   48:invokeinterface #340 <Method Object Map.get(Object)>
	//   18   53:checkcast       #342 <Class StepResult>
	//   19   56:invokevirtual   #343 <Method Map StepResult.getResults()>
	//   20   59:invokeinterface #346 <Method void Map.clear()>
		((StepResult)((Map) (taskresult)).get("comprehension_check_4")).getResults().clear();
	//   21   64:aload_1         
	//   22   65:ldc2            #269 <String "comprehension_check_4">
	//   23   68:invokeinterface #340 <Method Object Map.get(Object)>
	//   24   73:checkcast       #342 <Class StepResult>
	//   25   76:invokevirtual   #343 <Method Map StepResult.getResults()>
	//   26   79:invokeinterface #346 <Method void Map.clear()>
		((StepResult)((Map) (taskresult)).get("comprehension_check_5")).getResults().clear();
	//   27   84:aload_1         
	//   28   85:ldc2            #272 <String "comprehension_check_5">
	//   29   88:invokeinterface #340 <Method Object Map.get(Object)>
	//   30   93:checkcast       #342 <Class StepResult>
	//   31   96:invokevirtual   #343 <Method Map StepResult.getResults()>
	//   32   99:invokeinterface #346 <Method void Map.clear()>
	//   33  104:return          
	}

	private boolean comprehensionCheck(TaskResult taskresult)
	{
		taskresult = ((TaskResult) (taskresult.getResults()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #334 <Method Map TaskResult.getResults()>
	//    2    4:astore_1        
		return Arrays.equals(new Object[] {
			((StepResult)((Map) (taskresult)).get("comprehension_check_1")).getResult(), ((StepResult)((Map) (taskresult)).get("comprehension_check_2")).getResult(), ((StepResult)((Map) (taskresult)).get("comprehension_check_3")).getResult(), ((StepResult)((Map) (taskresult)).get("comprehension_check_4")).getResult(), ((StepResult)((Map) (taskresult)).get("comprehension_check_5")).getResult()
		}, new Object[] {
			"1", "1", "2", "2", "1"
		});
	//    3    5:iconst_5        
	//    4    6:anewarray       Object[]
	//    5    9:dup             
	//    6   10:iconst_0        
	//    7   11:aload_1         
	//    8   12:ldc1            #247 <String "comprehension_check_1">
	//    9   14:invokeinterface #340 <Method Object Map.get(Object)>
	//   10   19:checkcast       #342 <Class StepResult>
	//   11   22:invokevirtual   #354 <Method Object StepResult.getResult()>
	//   12   25:aastore         
	//   13   26:dup             
	//   14   27:iconst_1        
	//   15   28:aload_1         
	//   16   29:ldc2            #263 <String "comprehension_check_2">
	//   17   32:invokeinterface #340 <Method Object Map.get(Object)>
	//   18   37:checkcast       #342 <Class StepResult>
	//   19   40:invokevirtual   #354 <Method Object StepResult.getResult()>
	//   20   43:aastore         
	//   21   44:dup             
	//   22   45:iconst_2        
	//   23   46:aload_1         
	//   24   47:ldc2            #266 <String "comprehension_check_3">
	//   25   50:invokeinterface #340 <Method Object Map.get(Object)>
	//   26   55:checkcast       #342 <Class StepResult>
	//   27   58:invokevirtual   #354 <Method Object StepResult.getResult()>
	//   28   61:aastore         
	//   29   62:dup             
	//   30   63:iconst_3        
	//   31   64:aload_1         
	//   32   65:ldc2            #269 <String "comprehension_check_4">
	//   33   68:invokeinterface #340 <Method Object Map.get(Object)>
	//   34   73:checkcast       #342 <Class StepResult>
	//   35   76:invokevirtual   #354 <Method Object StepResult.getResult()>
	//   36   79:aastore         
	//   37   80:dup             
	//   38   81:iconst_4        
	//   39   82:aload_1         
	//   40   83:ldc2            #272 <String "comprehension_check_5">
	//   41   86:invokeinterface #340 <Method Object Map.get(Object)>
	//   42   91:checkcast       #342 <Class StepResult>
	//   43   94:invokevirtual   #354 <Method Object StepResult.getResult()>
	//   44   97:aastore         
	//   45   98:iconst_5        
	//   46   99:anewarray       Object[]
	//   47  102:dup             
	//   48  103:iconst_0        
	//   49  104:ldc1            #232 <String "1">
	//   50  106:aastore         
	//   51  107:dup             
	//   52  108:iconst_1        
	//   53  109:ldc1            #232 <String "1">
	//   54  111:aastore         
	//   55  112:dup             
	//   56  113:iconst_2        
	//   57  114:ldc1            #238 <String "2">
	//   58  116:aastore         
	//   59  117:dup             
	//   60  118:iconst_3        
	//   61  119:ldc1            #238 <String "2">
	//   62  121:aastore         
	//   63  122:dup             
	//   64  123:iconst_4        
	//   65  124:ldc1            #232 <String "1">
	//   66  126:aastore         
	//   67  127:invokestatic    #360 <Method boolean Arrays.equals(Object[], Object[])>
	//   68  130:ireturn         
	}

	public Step getStepAfterStep(Step step, TaskResult taskresult)
	{
		Step step2 = super.getStepAfterStep(step, taskresult);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #364 <Method Step OrderedTask.getStepAfterStep(Step, TaskResult)>
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
	//*  12   21:invokevirtual   #368 <Method String Step.getIdentifier()>
	//*  13   24:ldc2            #275 <String "comprehension_check_failure">
	//*  14   27:invokevirtual   #372 <Method boolean String.equals(Object)>
	//*  15   30:ifeq            49
	//*  16   33:aload_0         
	//*  17   34:aload_2         
	//*  18   35:invokespecial   #374 <Method boolean comprehensionCheck(TaskResult)>
	//*  19   38:ifeq            49
			return getStepById("comprehension_check_success");
	//   20   41:aload_0         
	//   21   42:ldc2            #283 <String "comprehension_check_success">
	//   22   45:invokevirtual   #378 <Method Step getStepById(String)>
	//   23   48:areturn         
		step1 = step2;
	//   24   49:aload           5
	//   25   51:astore          4
		if(step == null) goto _L4; else goto _L3
	//   26   53:aload_1         
	//   27   54:ifnull          16
_L3:
		byte byte0;
		step = ((Step) (step.getIdentifier()));
	//   28   57:aload_1         
	//   29   58:invokevirtual   #368 <Method String Step.getIdentifier()>
	//   30   61:astore_1        
		byte0 = -1;
	//   31   62:iconst_m1       
	//   32   63:istore_3        
		((String) (step)).hashCode();
	//   33   64:aload_1         
	//   34   65:invokevirtual   #382 <Method int String.hashCode()>
		JVM INSTR tableswitch -188250664 -188250664: default 88
	//	               -188250664 152;
	//   35   68:tableswitch     -188250664 -188250664: default 88
	//	               -188250664 152
		   goto _L5 _L6
_L5:
		switch(byte0)
	//*  36   88:iload_3         
		{
	//*  37   89:tableswitch     0 0: default 108
	//	               0 111
		default:
			return step2;
	//   38  108:aload           5
	//   39  110:areturn         

		case 0: // '\0'
			break;
		}
		if(((String)((StepResult)taskresult.getResults().get("comprehension_check_failure")).getResult()).equals("1"))
	//*  40  111:aload_2         
	//*  41  112:invokevirtual   #334 <Method Map TaskResult.getResults()>
	//*  42  115:ldc2            #275 <String "comprehension_check_failure">
	//*  43  118:invokeinterface #340 <Method Object Map.get(Object)>
	//*  44  123:checkcast       #342 <Class StepResult>
	//*  45  126:invokevirtual   #354 <Method Object StepResult.getResult()>
	//*  46  129:checkcast       #370 <Class String>
	//*  47  132:ldc1            #232 <String "1">
	//*  48  134:invokevirtual   #372 <Method boolean String.equals(Object)>
	//*  49  137:ifeq            167
		{
			clearComprehensionQuizSelections(taskresult);
	//   50  140:aload_0         
	//   51  141:aload_2         
	//   52  142:invokespecial   #384 <Method void clearComprehensionQuizSelections(TaskResult)>
			return getStepById("comprehension_check_1");
	//   53  145:aload_0         
	//   54  146:ldc1            #247 <String "comprehension_check_1">
	//   55  148:invokevirtual   #378 <Method Step getStepById(String)>
	//   56  151:areturn         
		} else
	//*  57  152:aload_1         
	//*  58  153:ldc2            #275 <String "comprehension_check_failure">
	//*  59  156:invokevirtual   #372 <Method boolean String.equals(Object)>
	//*  60  159:ifeq            88
	//*  61  162:iconst_0        
	//*  62  163:istore_3        
	//*  63  164:goto            88
		{
			return getStepById("dna_intro_identifier");
	//   64  167:aload_0         
	//   65  168:ldc1            #50  <String "dna_intro_identifier">
	//   66  170:invokevirtual   #378 <Method Step getStepById(String)>
	//   67  173:areturn         
		}
_L6:
		if(((String) (step)).equals("comprehension_check_failure"))
			byte0 = 0;
		  goto _L5
	}

	public static final String DNA_COMPREHENSION_CHECK_INTRO_IDENTIFIER = "dna_comprehension_check_intro_identifier";
	public static final String DNA_CONSENT_COSTS_IDENTIFIER = "dna_consent_costs_identifier";
	public static final String DNA_CONSENT_DATA_SHARING_IDENTIFIER = "dna_consent_data_sharing_identifier";
	public static final String DNA_CONSENT_EVALUATE_IDENTIFIER = "dna_consent_evaluate_identifier";
	public static final String DNA_CONSENT_ISSUES_1_IDENTIFIER = "dna_consent_issues_1_identifier";
	public static final String DNA_CONSENT_ISSUES_2_IDENTIFIER = "dna_consent_issues_2_identifier";
	public static final String DNA_CONSENT_PRIVACY_1_IDENTIFIER = "dna_consent_privacy_1_identifier";
	public static final String DNA_CONSENT_PRIVACY_2_IDENTIFIER = "dna_consent_privacy_2_identifier";
	public static final String DNA_CONSENT_PURPOSE_IDENTIFIER = "dna_consent_purpose_identifier";
	public static final String DNA_CONSENT_SAMPLE_IDENTIFIER = "dna_consent_sample_identifier";
	public static final String DNA_CONSENT_STUDY_INFORMATION_IDENTIFIER = "dna_consent_study_information_identifier";
	public static final String DNA_CONSENT_TASK = "dna_consent_task";
	public static final String DNA_CONSENT_TIME_IDENTIFIER = "dna_consent_time_identifier";
	public static final String DNA_CONSENT_WITHDRAWING_IDENTIFIER = "dna_consent_withdrawing_identifier";
	public static final String DNA_INTRO_IDENTIFIER = "dna_intro_identifier";
	public static final String DNA_SIGNATURE_CONSENT_IDENTIFIER = "dna_signature_consent_identifier";
	public static final String WHY_DNA_QUIZ_IDENTIFIER = "why_dna_quiz_identifier";
}
