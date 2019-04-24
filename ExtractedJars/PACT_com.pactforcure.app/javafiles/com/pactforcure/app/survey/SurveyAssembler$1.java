// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.pactforcure.app.survey;


// Referenced classes of package com.pactforcure.app.survey:
//			SurveyAssembler, StepType, QuestionType

static class SurveyAssembler$1
{

	static final int $SwitchMap$com$pactforcure$app$survey$QuestionType[];
	static final int $SwitchMap$com$pactforcure$app$survey$StepType[];

	static 
	{
		$SwitchMap$com$pactforcure$app$survey$StepType = new int[StepType.values().length];
	//    0    0:invokestatic    #19  <Method StepType[] StepType.values()>
	//    1    3:arraylength     
	//    2    4:newarray        int[]
	//    3    6:putstatic       #21  <Field int[] $SwitchMap$com$pactforcure$app$survey$StepType>
		try
		{
			$SwitchMap$com$pactforcure$app$survey$StepType[StepType.StepTypeQuestion.ordinal()] = 1;
	//    4    9:getstatic       #21  <Field int[] $SwitchMap$com$pactforcure$app$survey$StepType>
	//    5   12:getstatic       #25  <Field StepType StepType.StepTypeQuestion>
	//    6   15:invokevirtual   #29  <Method int StepType.ordinal()>
	//    7   18:iconst_1        
	//    8   19:iastore         
		}
	//*   9   20:getstatic       #21  <Field int[] $SwitchMap$com$pactforcure$app$survey$StepType>
	//*  10   23:getstatic       #32  <Field StepType StepType.StepTypeInstruction>
	//*  11   26:invokevirtual   #29  <Method int StepType.ordinal()>
	//*  12   29:iconst_2        
	//*  13   30:iastore         
	//*  14   31:getstatic       #21  <Field int[] $SwitchMap$com$pactforcure$app$survey$StepType>
	//*  15   34:getstatic       #35  <Field StepType StepType.StepTypeCompletion>
	//*  16   37:invokevirtual   #29  <Method int StepType.ordinal()>
	//*  17   40:iconst_3        
	//*  18   41:iastore         
	//*  19   42:invokestatic    #40  <Method QuestionType[] QuestionType.values()>
	//*  20   45:arraylength     
	//*  21   46:newarray        int[]
	//*  22   48:putstatic       #42  <Field int[] $SwitchMap$com$pactforcure$app$survey$QuestionType>
	//*  23   51:getstatic       #42  <Field int[] $SwitchMap$com$pactforcure$app$survey$QuestionType>
	//*  24   54:getstatic       #46  <Field QuestionType QuestionType.QuestionTypeNumberPicker>
	//*  25   57:invokevirtual   #47  <Method int QuestionType.ordinal()>
	//*  26   60:iconst_1        
	//*  27   61:iastore         
	//*  28   62:getstatic       #42  <Field int[] $SwitchMap$com$pactforcure$app$survey$QuestionType>
	//*  29   65:getstatic       #50  <Field QuestionType QuestionType.QuestionTypeSingleChoice>
	//*  30   68:invokevirtual   #47  <Method int QuestionType.ordinal()>
	//*  31   71:iconst_2        
	//*  32   72:iastore         
	//*  33   73:getstatic       #42  <Field int[] $SwitchMap$com$pactforcure$app$survey$QuestionType>
	//*  34   76:getstatic       #53  <Field QuestionType QuestionType.QuestionTypeMultipleChoice>
	//*  35   79:invokevirtual   #47  <Method int QuestionType.ordinal()>
	//*  36   82:iconst_3        
	//*  37   83:iastore         
	//*  38   84:getstatic       #42  <Field int[] $SwitchMap$com$pactforcure$app$survey$QuestionType>
	//*  39   87:getstatic       #56  <Field QuestionType QuestionType.QuestionTypeBooleanChoice>
	//*  40   90:invokevirtual   #47  <Method int QuestionType.ordinal()>
	//*  41   93:iconst_4        
	//*  42   94:iastore         
	//*  43   95:getstatic       #42  <Field int[] $SwitchMap$com$pactforcure$app$survey$QuestionType>
	//*  44   98:getstatic       #59  <Field QuestionType QuestionType.QuestionTypeValuePicker>
	//*  45  101:invokevirtual   #47  <Method int QuestionType.ordinal()>
	//*  46  104:iconst_5        
	//*  47  105:iastore         
	//*  48  106:getstatic       #42  <Field int[] $SwitchMap$com$pactforcure$app$survey$QuestionType>
	//*  49  109:getstatic       #62  <Field QuestionType QuestionType.QuestionTypeScale>
	//*  50  112:invokevirtual   #47  <Method int QuestionType.ordinal()>
	//*  51  115:bipush          6
	//*  52  117:iastore         
	//*  53  118:getstatic       #42  <Field int[] $SwitchMap$com$pactforcure$app$survey$QuestionType>
	//*  54  121:getstatic       #65  <Field QuestionType QuestionType.QuestionTypeText>
	//*  55  124:invokevirtual   #47  <Method int QuestionType.ordinal()>
	//*  56  127:bipush          7
	//*  57  129:iastore         
	//*  58  130:return          
	//*  59  131:astore_0        
	//*  60  132:return          
	//*  61  133:astore_0        
	//*  62  134:goto            118
	//*  63  137:astore_0        
	//*  64  138:goto            106
	//*  65  141:astore_0        
	//*  66  142:goto            95
	//*  67  145:astore_0        
	//*  68  146:goto            84
	//*  69  149:astore_0        
	//*  70  150:goto            73
	//*  71  153:astore_0        
	//*  72  154:goto            62
	//*  73  157:astore_0        
	//*  74  158:goto            42
	//*  75  161:astore_0        
	//*  76  162:goto            31
		catch(NoSuchFieldError nosuchfielderror9) { }
	//   77  165:astore_0        
		try
		{
			$SwitchMap$com$pactforcure$app$survey$StepType[StepType.StepTypeInstruction.ordinal()] = 2;
		}
		catch(NoSuchFieldError nosuchfielderror8) { }
		try
		{
			$SwitchMap$com$pactforcure$app$survey$StepType[StepType.StepTypeCompletion.ordinal()] = 3;
		}
		catch(NoSuchFieldError nosuchfielderror7) { }
		$SwitchMap$com$pactforcure$app$survey$QuestionType = new int[QuestionType.values().length];
		try
		{
			$SwitchMap$com$pactforcure$app$survey$QuestionType[QuestionType.QuestionTypeNumberPicker.ordinal()] = 1;
		}
		catch(NoSuchFieldError nosuchfielderror6) { }
		try
		{
			$SwitchMap$com$pactforcure$app$survey$QuestionType[QuestionType.QuestionTypeSingleChoice.ordinal()] = 2;
		}
		catch(NoSuchFieldError nosuchfielderror5) { }
		try
		{
			$SwitchMap$com$pactforcure$app$survey$QuestionType[QuestionType.QuestionTypeMultipleChoice.ordinal()] = 3;
		}
		catch(NoSuchFieldError nosuchfielderror4) { }
		try
		{
			$SwitchMap$com$pactforcure$app$survey$QuestionType[QuestionType.QuestionTypeBooleanChoice.ordinal()] = 4;
		}
		catch(NoSuchFieldError nosuchfielderror3) { }
		try
		{
			$SwitchMap$com$pactforcure$app$survey$QuestionType[QuestionType.QuestionTypeValuePicker.ordinal()] = 5;
		}
		catch(NoSuchFieldError nosuchfielderror2) { }
		try
		{
			$SwitchMap$com$pactforcure$app$survey$QuestionType[QuestionType.QuestionTypeScale.ordinal()] = 6;
		}
		catch(NoSuchFieldError nosuchfielderror1) { }
		try
		{
			$SwitchMap$com$pactforcure$app$survey$QuestionType[QuestionType.QuestionTypeText.ordinal()] = 7;
		}
		catch(NoSuchFieldError nosuchfielderror)
		{
			return;
		}
	//*  78  166:goto            20
	}
}
