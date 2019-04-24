// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.pactforcure.app.survey;

import java.util.*;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

// Referenced classes of package com.pactforcure.app.survey:
//			Choice, SurveyParsingException, Question, StepType, 
//			QuestionType, NextQuestion

public class QuestionParser
{

	public QuestionParser()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	private static Choice choiceFromJsonObject(JSONObject jsonobject)
	{
		Choice choice = new Choice();
	//    0    0:new             #13  <Class Choice>
	//    1    3:dup             
	//    2    4:invokespecial   #14  <Method void Choice()>
	//    3    7:astore_1        
		Object obj = jsonobject.get("code");
	//    4    8:aload_0         
	//    5    9:ldc1            #16  <String "code">
	//    6   11:invokevirtual   #22  <Method Object JSONObject.get(Object)>
	//    7   14:astore_2        
		if(obj instanceof String)
	//*   8   15:aload_2         
	//*   9   16:instanceof      #24  <Class String>
	//*  10   19:ifeq            30
			choice.setCode((String)obj);
	//   11   22:aload_1         
	//   12   23:aload_2         
	//   13   24:checkcast       #24  <Class String>
	//   14   27:invokevirtual   #28  <Method void Choice.setCode(String)>
		obj = jsonobject.get("text");
	//   15   30:aload_0         
	//   16   31:ldc1            #30  <String "text">
	//   17   33:invokevirtual   #22  <Method Object JSONObject.get(Object)>
	//   18   36:astore_2        
		if(obj instanceof String)
	//*  19   37:aload_2         
	//*  20   38:instanceof      #24  <Class String>
	//*  21   41:ifeq            52
			choice.setText((String)obj);
	//   22   44:aload_1         
	//   23   45:aload_2         
	//   24   46:checkcast       #24  <Class String>
	//   25   49:invokevirtual   #33  <Method void Choice.setText(String)>
		obj = jsonobject.get("nextQuestion");
	//   26   52:aload_0         
	//   27   53:ldc1            #35  <String "nextQuestion">
	//   28   55:invokevirtual   #22  <Method Object JSONObject.get(Object)>
	//   29   58:astore_2        
		if(obj instanceof String)
	//*  30   59:aload_2         
	//*  31   60:instanceof      #24  <Class String>
	//*  32   63:ifeq            74
			choice.setNextQuestionCode((String)obj);
	//   33   66:aload_1         
	//   34   67:aload_2         
	//   35   68:checkcast       #24  <Class String>
	//   36   71:invokevirtual   #38  <Method void Choice.setNextQuestionCode(String)>
		obj = jsonobject.get("value");
	//   37   74:aload_0         
	//   38   75:ldc1            #40  <String "value">
	//   39   77:invokevirtual   #22  <Method Object JSONObject.get(Object)>
	//   40   80:astore_2        
		if(obj instanceof String)
	//*  41   81:aload_2         
	//*  42   82:instanceof      #24  <Class String>
	//*  43   85:ifeq            96
			choice.setValue((String)obj);
	//   44   88:aload_1         
	//   45   89:aload_2         
	//   46   90:checkcast       #24  <Class String>
	//   47   93:invokevirtual   #43  <Method void Choice.setValue(String)>
		jsonobject = ((JSONObject) (jsonobject.get("failReason")));
	//   48   96:aload_0         
	//   49   97:ldc1            #45  <String "failReason">
	//   50   99:invokevirtual   #22  <Method Object JSONObject.get(Object)>
	//   51  102:astore_0        
		if(jsonobject instanceof String)
	//*  52  103:aload_0         
	//*  53  104:instanceof      #24  <Class String>
	//*  54  107:ifeq            118
			choice.setFailReason((String)jsonobject);
	//   55  110:aload_1         
	//   56  111:aload_0         
	//   57  112:checkcast       #24  <Class String>
	//   58  115:invokevirtual   #48  <Method void Choice.setFailReason(String)>
		return choice;
	//   59  118:aload_1         
	//   60  119:areturn         
	}

	public static Question fromJsonObject(JSONObject jsonobject)
		throws SurveyParsingException
	{
		Question question;
		Object obj;
		question = new Question();
	//    0    0:new             #54  <Class Question>
	//    1    3:dup             
	//    2    4:invokespecial   #55  <Method void Question()>
	//    3    7:astore_2        
		obj = jsonobject.get("stepType");
	//    4    8:aload_0         
	//    5    9:ldc1            #57  <String "stepType">
	//    6   11:invokevirtual   #22  <Method Object JSONObject.get(Object)>
	//    7   14:astore_3        
		if(obj instanceof Long)
	//*   8   15:aload_3         
	//*   9   16:instanceof      #59  <Class Long>
	//*  10   19:ifeq            740
		{
			int i = ((Long)obj).intValue();
	//   11   22:aload_3         
	//   12   23:checkcast       #59  <Class Long>
	//   13   26:invokevirtual   #63  <Method int Long.intValue()>
	//   14   29:istore_1        
			question.setStepType(StepType.values()[i]);
	//   15   30:aload_2         
	//   16   31:invokestatic    #69  <Method StepType[] StepType.values()>
	//   17   34:iload_1         
	//   18   35:aaload          
	//   19   36:invokevirtual   #73  <Method void Question.setStepType(StepType)>
		} else
	//*  20   39:aload_0         
	//*  21   40:ldc1            #30  <String "text">
	//*  22   42:invokevirtual   #22  <Method Object JSONObject.get(Object)>
	//*  23   45:astore_3        
	//*  24   46:aload_3         
	//*  25   47:instanceof      #24  <Class String>
	//*  26   50:ifeq            750
	//*  27   53:aload_2         
	//*  28   54:aload_3         
	//*  29   55:checkcast       #24  <Class String>
	//*  30   58:invokevirtual   #74  <Method void Question.setText(String)>
	//*  31   61:aload_0         
	//*  32   62:ldc1            #76  <String "title">
	//*  33   64:invokevirtual   #22  <Method Object JSONObject.get(Object)>
	//*  34   67:astore_3        
	//*  35   68:aload_3         
	//*  36   69:instanceof      #24  <Class String>
	//*  37   72:ifeq            83
	//*  38   75:aload_2         
	//*  39   76:aload_3         
	//*  40   77:checkcast       #24  <Class String>
	//*  41   80:invokevirtual   #79  <Method void Question.setTitle(String)>
	//*  42   83:aload_0         
	//*  43   84:ldc1            #81  <String "questionCode">
	//*  44   86:invokevirtual   #22  <Method Object JSONObject.get(Object)>
	//*  45   89:astore_3        
	//*  46   90:aload_3         
	//*  47   91:instanceof      #24  <Class String>
	//*  48   94:ifeq            761
	//*  49   97:aload_2         
	//*  50   98:aload_3         
	//*  51   99:checkcast       #24  <Class String>
	//*  52  102:invokevirtual   #84  <Method void Question.setQuestionCode(String)>
	//*  53  105:aload_0         
	//*  54  106:ldc1            #86  <String "questionType">
	//*  55  108:invokevirtual   #22  <Method Object JSONObject.get(Object)>
	//*  56  111:astore_3        
	//*  57  112:aload_3         
	//*  58  113:instanceof      #59  <Class Long>
	//*  59  116:ifeq            136
	//*  60  119:aload_3         
	//*  61  120:checkcast       #59  <Class Long>
	//*  62  123:invokevirtual   #63  <Method int Long.intValue()>
	//*  63  126:istore_1        
	//*  64  127:aload_2         
	//*  65  128:invokestatic    #91  <Method QuestionType[] QuestionType.values()>
	//*  66  131:iload_1         
	//*  67  132:aaload          
	//*  68  133:invokevirtual   #95  <Method void Question.setQuestionType(QuestionType)>
	//*  69  136:aload_0         
	//*  70  137:ldc1            #97  <String "numberMin">
	//*  71  139:invokevirtual   #22  <Method Object JSONObject.get(Object)>
	//*  72  142:astore_3        
	//*  73  143:aload_3         
	//*  74  144:instanceof      #24  <Class String>
	//*  75  147:ifeq            772
	//*  76  150:aload_2         
	//*  77  151:aload_3         
	//*  78  152:checkcast       #24  <Class String>
	//*  79  155:invokevirtual   #100 <Method void Question.setNumberMin(String)>
	//*  80  158:aload_0         
	//*  81  159:ldc1            #102 <String "minimumValueDescription">
	//*  82  161:invokevirtual   #22  <Method Object JSONObject.get(Object)>
	//*  83  164:astore_3        
	//*  84  165:aload_3         
	//*  85  166:instanceof      #24  <Class String>
	//*  86  169:ifeq            180
	//*  87  172:aload_2         
	//*  88  173:aload_3         
	//*  89  174:checkcast       #24  <Class String>
	//*  90  177:invokevirtual   #105 <Method void Question.setMinimumValueDescription(String)>
	//*  91  180:aload_0         
	//*  92  181:ldc1            #107 <String "numberMax">
	//*  93  183:invokevirtual   #22  <Method Object JSONObject.get(Object)>
	//*  94  186:astore_3        
	//*  95  187:aload_3         
	//*  96  188:instanceof      #24  <Class String>
	//*  97  191:ifeq            790
	//*  98  194:aload_2         
	//*  99  195:aload_3         
	//* 100  196:checkcast       #24  <Class String>
	//* 101  199:invokevirtual   #110 <Method void Question.setNumberMax(String)>
	//* 102  202:aload_0         
	//* 103  203:ldc1            #112 <String "maximumValueDescription">
	//* 104  205:invokevirtual   #22  <Method Object JSONObject.get(Object)>
	//* 105  208:astore_3        
	//* 106  209:aload_3         
	//* 107  210:instanceof      #24  <Class String>
	//* 108  213:ifeq            224
	//* 109  216:aload_2         
	//* 110  217:aload_3         
	//* 111  218:checkcast       #24  <Class String>
	//* 112  221:invokevirtual   #115 <Method void Question.setMaximumValueDescription(String)>
	//* 113  224:aload_0         
	//* 114  225:ldc1            #117 <String "verticalScale">
	//* 115  227:invokevirtual   #22  <Method Object JSONObject.get(Object)>
	//* 116  230:astore_3        
	//* 117  231:aload_3         
	//* 118  232:instanceof      #119 <Class Boolean>
	//* 119  235:ifeq            249
	//* 120  238:aload_2         
	//* 121  239:aload_3         
	//* 122  240:checkcast       #119 <Class Boolean>
	//* 123  243:invokevirtual   #123 <Method boolean Boolean.booleanValue()>
	//* 124  246:invokevirtual   #127 <Method void Question.setVerticalScale(boolean)>
	//* 125  249:aload_0         
	//* 126  250:ldc1            #129 <String "numberShowAsOrdinal">
	//* 127  252:invokevirtual   #22  <Method Object JSONObject.get(Object)>
	//* 128  255:astore_3        
	//* 129  256:aload_3         
	//* 130  257:instanceof      #119 <Class Boolean>
	//* 131  260:ifeq            274
	//* 132  263:aload_2         
	//* 133  264:aload_3         
	//* 134  265:checkcast       #119 <Class Boolean>
	//* 135  268:invokevirtual   #123 <Method boolean Boolean.booleanValue()>
	//* 136  271:invokevirtual   #132 <Method void Question.setNumberShowAsOrdinal(boolean)>
	//* 137  274:aload_0         
	//* 138  275:ldc1            #134 <String "numberZeroReplacement">
	//* 139  277:invokevirtual   #22  <Method Object JSONObject.get(Object)>
	//* 140  280:astore_3        
	//* 141  281:aload_3         
	//* 142  282:instanceof      #24  <Class String>
	//* 143  285:ifeq            296
	//* 144  288:aload_2         
	//* 145  289:aload_3         
	//* 146  290:checkcast       #24  <Class String>
	//* 147  293:invokevirtual   #137 <Method void Question.setNumberZeroReplacement(String)>
	//* 148  296:aload_0         
	//* 149  297:ldc1            #139 <String "numberStringFormat">
	//* 150  299:invokevirtual   #22  <Method Object JSONObject.get(Object)>
	//* 151  302:astore_3        
	//* 152  303:aload_3         
	//* 153  304:instanceof      #24  <Class String>
	//* 154  307:ifeq            325
	//* 155  310:aload_2         
	//* 156  311:aload_3         
	//* 157  312:checkcast       #24  <Class String>
	//* 158  315:ldc1            #141 <String "%@">
	//* 159  317:ldc1            #143 <String "%s">
	//* 160  319:invokevirtual   #147 <Method String String.replace(CharSequence, CharSequence)>
	//* 161  322:invokevirtual   #150 <Method void Question.setNumberStringFormat(String)>
	//* 162  325:aload_0         
	//* 163  326:ldc1            #152 <String "nextQuestionCode">
	//* 164  328:invokevirtual   #22  <Method Object JSONObject.get(Object)>
	//* 165  331:astore_3        
	//* 166  332:aload_3         
	//* 167  333:instanceof      #24  <Class String>
	//* 168  336:ifeq            347
	//* 169  339:aload_2         
	//* 170  340:aload_3         
	//* 171  341:checkcast       #24  <Class String>
	//* 172  344:invokevirtual   #153 <Method void Question.setNextQuestionCode(String)>
	//* 173  347:aload_0         
	//* 174  348:ldc1            #155 <String "optional">
	//* 175  350:invokevirtual   #22  <Method Object JSONObject.get(Object)>
	//* 176  353:astore_3        
	//* 177  354:aload_3         
	//* 178  355:instanceof      #119 <Class Boolean>
	//* 179  358:ifeq            372
	//* 180  361:aload_2         
	//* 181  362:aload_3         
	//* 182  363:checkcast       #119 <Class Boolean>
	//* 183  366:invokevirtual   #123 <Method boolean Boolean.booleanValue()>
	//* 184  369:invokevirtual   #158 <Method void Question.setOptional(boolean)>
	//* 185  372:aload_0         
	//* 186  373:ldc1            #160 <String "step">
	//* 187  375:invokevirtual   #22  <Method Object JSONObject.get(Object)>
	//* 188  378:astore_3        
	//* 189  379:aload_3         
	//* 190  380:instanceof      #59  <Class Long>
	//* 191  383:ifeq            400
	//* 192  386:aload_2         
	//* 193  387:aload_3         
	//* 194  388:checkcast       #59  <Class Long>
	//* 195  391:invokevirtual   #63  <Method int Long.intValue()>
	//* 196  394:invokestatic    #166 <Method Integer Integer.valueOf(int)>
	//* 197  397:invokevirtual   #170 <Method void Question.setStep(Integer)>
	//* 198  400:aload_0         
	//* 199  401:ldc1            #172 <String "defaultValue">
	//* 200  403:invokevirtual   #22  <Method Object JSONObject.get(Object)>
	//* 201  406:astore_3        
	//* 202  407:aload_3         
	//* 203  408:instanceof      #24  <Class String>
	//* 204  411:ifeq            808
	//* 205  414:aload_2         
	//* 206  415:aload_3         
	//* 207  416:checkcast       #24  <Class String>
	//* 208  419:invokevirtual   #175 <Method void Question.setDefaultValue(String)>
	//* 209  422:aload_0         
	//* 210  423:ldc1            #177 <String "lastItemOverride">
	//* 211  425:invokevirtual   #22  <Method Object JSONObject.get(Object)>
	//* 212  428:astore_3        
	//* 213  429:aload_3         
	//* 214  430:instanceof      #24  <Class String>
	//* 215  433:ifeq            444
	//* 216  436:aload_2         
	//* 217  437:aload_3         
	//* 218  438:checkcast       #24  <Class String>
	//* 219  441:invokevirtual   #180 <Method void Question.setLastItemOverride(String)>
	//* 220  444:aload_0         
	//* 221  445:ldc1            #182 <String "lastItemOverrideMinValue">
	//* 222  447:invokevirtual   #22  <Method Object JSONObject.get(Object)>
	//* 223  450:astore_3        
	//* 224  451:aload_3         
	//* 225  452:instanceof      #59  <Class Long>
	//* 226  455:ifeq            472
	//* 227  458:aload_2         
	//* 228  459:aload_3         
	//* 229  460:checkcast       #59  <Class Long>
	//* 230  463:invokevirtual   #63  <Method int Long.intValue()>
	//* 231  466:invokestatic    #166 <Method Integer Integer.valueOf(int)>
	//* 232  469:invokevirtual   #185 <Method void Question.setLastItemOverrideMinValue(Integer)>
	//* 233  472:aload_0         
	//* 234  473:ldc1            #187 <String "globalVariable">
	//* 235  475:invokevirtual   #22  <Method Object JSONObject.get(Object)>
	//* 236  478:astore_3        
	//* 237  479:aload_3         
	//* 238  480:instanceof      #24  <Class String>
	//* 239  483:ifeq            494
	//* 240  486:aload_2         
	//* 241  487:aload_3         
	//* 242  488:checkcast       #24  <Class String>
	//* 243  491:invokevirtual   #190 <Method void Question.setGlobalVariable(String)>
	//* 244  494:aload_0         
	//* 245  495:ldc1            #192 <String "previousQuestion">
	//* 246  497:invokevirtual   #22  <Method Object JSONObject.get(Object)>
	//* 247  500:astore_3        
	//* 248  501:aload_3         
	//* 249  502:instanceof      #24  <Class String>
	//* 250  505:ifeq            516
	//* 251  508:aload_2         
	//* 252  509:aload_3         
	//* 253  510:checkcast       #24  <Class String>
	//* 254  513:invokevirtual   #195 <Method void Question.setPreviousQuestion(String)>
	//* 255  516:aload_0         
	//* 256  517:ldc1            #197 <String "usesGlobalVariable">
	//* 257  519:invokevirtual   #22  <Method Object JSONObject.get(Object)>
	//* 258  522:astore_3        
	//* 259  523:aload_3         
	//* 260  524:instanceof      #119 <Class Boolean>
	//* 261  527:ifeq            541
	//* 262  530:aload_2         
	//* 263  531:aload_3         
	//* 264  532:checkcast       #119 <Class Boolean>
	//* 265  535:invokevirtual   #123 <Method boolean Boolean.booleanValue()>
	//* 266  538:invokevirtual   #200 <Method void Question.setUsesGlobalVariable(boolean)>
	//* 267  541:aload_0         
	//* 268  542:ldc1            #202 <String "addPlusSignToLastItem">
	//* 269  544:invokevirtual   #22  <Method Object JSONObject.get(Object)>
	//* 270  547:astore_3        
	//* 271  548:aload_3         
	//* 272  549:instanceof      #119 <Class Boolean>
	//* 273  552:ifeq            566
	//* 274  555:aload_2         
	//* 275  556:aload_3         
	//* 276  557:checkcast       #119 <Class Boolean>
	//* 277  560:invokevirtual   #123 <Method boolean Boolean.booleanValue()>
	//* 278  563:invokevirtual   #205 <Method void Question.setAddPlusSignToLastItem(boolean)>
	//* 279  566:aload_0         
	//* 280  567:ldc1            #207 <String "failCondition">
	//* 281  569:invokevirtual   #22  <Method Object JSONObject.get(Object)>
	//* 282  572:astore_3        
	//* 283  573:aload_3         
	//* 284  574:instanceof      #18  <Class JSONObject>
	//* 285  577:ifeq            657
	//* 286  580:aload_3         
	//* 287  581:checkcast       #18  <Class JSONObject>
	//* 288  584:astore_3        
	//* 289  585:aload_3         
	//* 290  586:ldc1            #40  <String "value">
	//* 291  588:invokevirtual   #22  <Method Object JSONObject.get(Object)>
	//* 292  591:astore          4
	//* 293  593:aload           4
	//* 294  595:instanceof      #24  <Class String>
	//* 295  598:ifeq            610
	//* 296  601:aload_2         
	//* 297  602:aload           4
	//* 298  604:checkcast       #24  <Class String>
	//* 299  607:invokevirtual   #210 <Method void Question.setFailValue(String)>
	//* 300  610:aload_3         
	//* 301  611:ldc1            #212 <String "comparation">
	//* 302  613:invokevirtual   #22  <Method Object JSONObject.get(Object)>
	//* 303  616:astore          4
	//* 304  618:aload           4
	//* 305  620:instanceof      #24  <Class String>
	//* 306  623:ifeq            635
	//* 307  626:aload_2         
	//* 308  627:aload           4
	//* 309  629:checkcast       #24  <Class String>
	//* 310  632:invokevirtual   #215 <Method void Question.setFailComparation(String)>
	//* 311  635:aload_3         
	//* 312  636:ldc1            #217 <String "reason">
	//* 313  638:invokevirtual   #22  <Method Object JSONObject.get(Object)>
	//* 314  641:astore_3        
	//* 315  642:aload_3         
	//* 316  643:instanceof      #24  <Class String>
	//* 317  646:ifeq            657
	//* 318  649:aload_2         
	//* 319  650:aload_3         
	//* 320  651:checkcast       #24  <Class String>
	//* 321  654:invokevirtual   #218 <Method void Question.setFailReason(String)>
	//* 322  657:aload_0         
	//* 323  658:ldc1            #220 <String "nextQuestions">
	//* 324  660:invokevirtual   #22  <Method Object JSONObject.get(Object)>
	//* 325  663:astore_3        
	//* 326  664:aload_2         
	//* 327  665:new             #222 <Class ArrayList>
	//* 328  668:dup             
	//* 329  669:invokespecial   #223 <Method void ArrayList()>
	//* 330  672:invokevirtual   #227 <Method void Question.setNextQuestions(List)>
	//* 331  675:aload_3         
	//* 332  676:instanceof      #229 <Class JSONArray>
	//* 333  679:ifeq            837
	//* 334  682:aload_3         
	//* 335  683:checkcast       #229 <Class JSONArray>
	//* 336  686:invokevirtual   #233 <Method Iterator JSONArray.iterator()>
	//* 337  689:astore_3        
	//* 338  690:aload_3         
	//* 339  691:invokeinterface #238 <Method boolean Iterator.hasNext()>
	//* 340  696:ifeq            837
	//* 341  699:aload_3         
	//* 342  700:invokeinterface #242 <Method Object Iterator.next()>
	//* 343  705:astore          4
	//* 344  707:aload           4
	//* 345  709:instanceof      #18  <Class JSONObject>
	//* 346  712:ifeq            826
	//* 347  715:aload           4
	//* 348  717:checkcast       #18  <Class JSONObject>
	//* 349  720:invokestatic    #246 <Method NextQuestion nextQuestionFromJsonObject(JSONObject)>
	//* 350  723:astore          4
	//* 351  725:aload_2         
	//* 352  726:invokevirtual   #250 <Method List Question.getNextQuestions()>
	//* 353  729:aload           4
	//* 354  731:invokeinterface #256 <Method boolean List.add(Object)>
	//* 355  736:pop             
	//* 356  737:goto            690
		{
			question.setStepType(StepType.StepTypeQuestion);
	//  357  740:aload_2         
	//  358  741:getstatic       #260 <Field StepType StepType.StepTypeQuestion>
	//  359  744:invokevirtual   #73  <Method void Question.setStepType(StepType)>
		}
		obj = jsonobject.get("text");
		if(obj instanceof String)
		{
			question.setText((String)obj);
			obj = jsonobject.get("title");
			if(obj instanceof String)
				question.setTitle((String)obj);
			obj = jsonobject.get("questionCode");
			if(obj instanceof String)
			{
				question.setQuestionCode((String)obj);
				obj = jsonobject.get("questionType");
				if(obj instanceof Long)
				{
					int j = ((Long)obj).intValue();
					question.setQuestionType(QuestionType.values()[j]);
				}
				obj = jsonobject.get("numberMin");
				Object obj2;
				if(obj instanceof String)
				{
					question.setNumberMin((String)obj);
					break MISSING_BLOCK_LABEL_158;
				} else
	//* 360  747:goto            39
	//* 361  750:new             #52  <Class SurveyParsingException>
	//* 362  753:dup             
	//* 363  754:ldc2            #262 <String "The Question must have a text value in the json">
	//* 364  757:invokespecial   #264 <Method void SurveyParsingException(String)>
	//* 365  760:athrow          
	//* 366  761:new             #52  <Class SurveyParsingException>
	//* 367  764:dup             
	//* 368  765:ldc2            #266 <String "The Question must have a questionCode value in the json">
	//* 369  768:invokespecial   #264 <Method void SurveyParsingException(String)>
	//* 370  771:athrow          
				{
					if(obj instanceof Long)
	//* 371  772:aload_3         
	//* 372  773:instanceof      #59  <Class Long>
	//* 373  776:ifeq            158
						question.setNumberMin(String.valueOf(obj));
	//  374  779:aload_2         
	//  375  780:aload_3         
	//  376  781:invokestatic    #269 <Method String String.valueOf(Object)>
	//  377  784:invokevirtual   #100 <Method void Question.setNumberMin(String)>
					continue;
	//  378  787:goto            158
				}
			} else
			{
				throw new SurveyParsingException("The Question must have a questionCode value in the json");
			}
		} else
		{
			throw new SurveyParsingException("The Question must have a text value in the json");
		}
		do
		{
			obj = jsonobject.get("minimumValueDescription");
			if(obj instanceof String)
				question.setMinimumValueDescription((String)obj);
			obj = jsonobject.get("numberMax");
			if(obj instanceof String)
				question.setNumberMax((String)obj);
			else
			if(obj instanceof Long)
	//* 379  790:aload_3         
	//* 380  791:instanceof      #59  <Class Long>
	//* 381  794:ifeq            202
				question.setNumberMax(String.valueOf(obj));
	//  382  797:aload_2         
	//  383  798:aload_3         
	//  384  799:invokestatic    #269 <Method String String.valueOf(Object)>
	//  385  802:invokevirtual   #110 <Method void Question.setNumberMax(String)>
			obj = jsonobject.get("maximumValueDescription");
			if(obj instanceof String)
				question.setMaximumValueDescription((String)obj);
			obj = jsonobject.get("verticalScale");
			if(obj instanceof Boolean)
				question.setVerticalScale(((Boolean)obj).booleanValue());
			obj = jsonobject.get("numberShowAsOrdinal");
			if(obj instanceof Boolean)
				question.setNumberShowAsOrdinal(((Boolean)obj).booleanValue());
			obj = jsonobject.get("numberZeroReplacement");
			if(obj instanceof String)
				question.setNumberZeroReplacement((String)obj);
			obj = jsonobject.get("numberStringFormat");
			if(obj instanceof String)
				question.setNumberStringFormat(((String)obj).replace("%@", "%s"));
			obj = jsonobject.get("nextQuestionCode");
			if(obj instanceof String)
				question.setNextQuestionCode((String)obj);
			obj = jsonobject.get("optional");
			if(obj instanceof Boolean)
				question.setOptional(((Boolean)obj).booleanValue());
			obj = jsonobject.get("step");
			if(obj instanceof Long)
				question.setStep(Integer.valueOf(((Long)obj).intValue()));
			obj = jsonobject.get("defaultValue");
			if(obj instanceof String)
				question.setDefaultValue((String)obj);
			else
	//* 386  805:goto            202
			if(obj instanceof Long)
	//* 387  808:aload_3         
	//* 388  809:instanceof      #59  <Class Long>
	//* 389  812:ifeq            422
				question.setDefaultValue(String.valueOf(obj));
	//  390  815:aload_2         
	//  391  816:aload_3         
	//  392  817:invokestatic    #269 <Method String String.valueOf(Object)>
	//  393  820:invokevirtual   #175 <Method void Question.setDefaultValue(String)>
			obj = jsonobject.get("lastItemOverride");
			if(obj instanceof String)
				question.setLastItemOverride((String)obj);
			obj = jsonobject.get("lastItemOverrideMinValue");
			if(obj instanceof Long)
				question.setLastItemOverrideMinValue(Integer.valueOf(((Long)obj).intValue()));
			obj = jsonobject.get("globalVariable");
			if(obj instanceof String)
				question.setGlobalVariable((String)obj);
			obj = jsonobject.get("previousQuestion");
			if(obj instanceof String)
				question.setPreviousQuestion((String)obj);
			obj = jsonobject.get("usesGlobalVariable");
			if(obj instanceof Boolean)
				question.setUsesGlobalVariable(((Boolean)obj).booleanValue());
			obj = jsonobject.get("addPlusSignToLastItem");
			if(obj instanceof Boolean)
				question.setAddPlusSignToLastItem(((Boolean)obj).booleanValue());
			obj = jsonobject.get("failCondition");
			if(obj instanceof JSONObject)
			{
				obj = ((Object) ((JSONObject)obj));
				obj2 = ((JSONObject) (obj)).get("value");
				if(obj2 instanceof String)
					question.setFailValue((String)obj2);
				obj2 = ((JSONObject) (obj)).get("comparation");
				if(obj2 instanceof String)
					question.setFailComparation((String)obj2);
				obj = ((JSONObject) (obj)).get("reason");
				if(obj instanceof String)
					question.setFailReason((String)obj);
			}
			obj = jsonobject.get("nextQuestions");
			question.setNextQuestions(((List) (new ArrayList())));
			if(obj instanceof JSONArray)
				for(obj = ((Object) (((JSONArray)obj).iterator())); ((Iterator) (obj)).hasNext();)
				{
					obj2 = ((Iterator) (obj)).next();
					if(obj2 instanceof JSONObject)
					{
						obj2 = ((Object) (nextQuestionFromJsonObject((JSONObject)obj2)));
						question.getNextQuestions().add(obj2);
					} else
	//* 394  823:goto            422
					{
						throw new SurveyParsingException("nextQuestion array entry must be an object");
	//  395  826:new             #52  <Class SurveyParsingException>
	//  396  829:dup             
	//  397  830:ldc2            #271 <String "nextQuestion array entry must be an object">
	//  398  833:invokespecial   #264 <Method void SurveyParsingException(String)>
	//  399  836:athrow          
					}
				}

			jsonobject = ((JSONObject) (jsonobject.get("choices")));
	//  400  837:aload_0         
	//  401  838:ldc2            #273 <String "choices">
	//  402  841:invokevirtual   #22  <Method Object JSONObject.get(Object)>
	//  403  844:astore_0        
			if(jsonobject instanceof JSONArray)
	//* 404  845:aload_0         
	//* 405  846:instanceof      #229 <Class JSONArray>
	//* 406  849:ifeq            927
			{
				question.setChoices(((List) (new ArrayList())));
	//  407  852:aload_2         
	//  408  853:new             #222 <Class ArrayList>
	//  409  856:dup             
	//  410  857:invokespecial   #223 <Method void ArrayList()>
	//  411  860:invokevirtual   #276 <Method void Question.setChoices(List)>
				for(jsonobject = ((JSONObject) (((JSONArray)jsonobject).iterator())); ((Iterator) (jsonobject)).hasNext();)
	//* 412  863:aload_0         
	//* 413  864:checkcast       #229 <Class JSONArray>
	//* 414  867:invokevirtual   #233 <Method Iterator JSONArray.iterator()>
	//* 415  870:astore_0        
	//* 416  871:aload_0         
	//* 417  872:invokeinterface #238 <Method boolean Iterator.hasNext()>
	//* 418  877:ifeq            927
				{
					Object obj1 = ((Iterator) (jsonobject)).next();
	//  419  880:aload_0         
	//  420  881:invokeinterface #242 <Method Object Iterator.next()>
	//  421  886:astore_3        
					if(obj1 instanceof JSONObject)
	//* 422  887:aload_3         
	//* 423  888:instanceof      #18  <Class JSONObject>
	//* 424  891:ifeq            916
					{
						obj1 = ((Object) (choiceFromJsonObject((JSONObject)obj1)));
	//  425  894:aload_3         
	//  426  895:checkcast       #18  <Class JSONObject>
	//  427  898:invokestatic    #278 <Method Choice choiceFromJsonObject(JSONObject)>
	//  428  901:astore_3        
						question.getChoices().add(obj1);
	//  429  902:aload_2         
	//  430  903:invokevirtual   #281 <Method List Question.getChoices()>
	//  431  906:aload_3         
	//  432  907:invokeinterface #256 <Method boolean List.add(Object)>
	//  433  912:pop             
					} else
	//* 434  913:goto            871
					{
						throw new SurveyParsingException("choices array entry must be an object");
	//  435  916:new             #52  <Class SurveyParsingException>
	//  436  919:dup             
	//  437  920:ldc2            #283 <String "choices array entry must be an object">
	//  438  923:invokespecial   #264 <Method void SurveyParsingException(String)>
	//  439  926:athrow          
					}
				}

			}
			return question;
	//  440  927:aload_2         
	//  441  928:areturn         
		} while(true);
	}

	private static NextQuestion nextQuestionFromJsonObject(JSONObject jsonobject)
		throws SurveyParsingException
	{
		NextQuestion nextquestion = new NextQuestion();
	//    0    0:new             #286 <Class NextQuestion>
	//    1    3:dup             
	//    2    4:invokespecial   #287 <Method void NextQuestion()>
	//    3    7:astore_1        
		Object obj = jsonobject.get("value");
	//    4    8:aload_0         
	//    5    9:ldc1            #40  <String "value">
	//    6   11:invokevirtual   #22  <Method Object JSONObject.get(Object)>
	//    7   14:astore_2        
		if(obj instanceof String)
	//*   8   15:aload_2         
	//*   9   16:instanceof      #24  <Class String>
	//*  10   19:ifeq            54
		{
			nextquestion.setValue((String)obj);
	//   11   22:aload_1         
	//   12   23:aload_2         
	//   13   24:checkcast       #24  <Class String>
	//   14   27:invokevirtual   #288 <Method void NextQuestion.setValue(String)>
			jsonobject = ((JSONObject) (jsonobject.get("nextQuestionCode")));
	//   15   30:aload_0         
	//   16   31:ldc1            #152 <String "nextQuestionCode">
	//   17   33:invokevirtual   #22  <Method Object JSONObject.get(Object)>
	//   18   36:astore_0        
			if(jsonobject instanceof String)
	//*  19   37:aload_0         
	//*  20   38:instanceof      #24  <Class String>
	//*  21   41:ifeq            65
			{
				nextquestion.setNextQuestionCode((String)jsonobject);
	//   22   44:aload_1         
	//   23   45:aload_0         
	//   24   46:checkcast       #24  <Class String>
	//   25   49:invokevirtual   #289 <Method void NextQuestion.setNextQuestionCode(String)>
				return nextquestion;
	//   26   52:aload_1         
	//   27   53:areturn         
			} else
	//*  28   54:new             #52  <Class SurveyParsingException>
	//*  29   57:dup             
	//*  30   58:ldc2            #291 <String "The nextQuestion must have a value in the json">
	//*  31   61:invokespecial   #264 <Method void SurveyParsingException(String)>
	//*  32   64:athrow          
			{
				throw new SurveyParsingException("The nextQuestion must have a nextQuestionCode in the json");
	//   33   65:new             #52  <Class SurveyParsingException>
	//   34   68:dup             
	//   35   69:ldc2            #293 <String "The nextQuestion must have a nextQuestionCode in the json">
	//   36   72:invokespecial   #264 <Method void SurveyParsingException(String)>
	//   37   75:athrow          
			}
		} else
		{
			throw new SurveyParsingException("The nextQuestion must have a value in the json");
		}
	}
}
