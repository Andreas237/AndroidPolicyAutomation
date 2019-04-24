// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.pactforcure.app.survey;


// Referenced classes of package com.pactforcure.app.survey:
//			SurveyTask, QuestionType

static class SurveyTask$1
{

	static final int $SwitchMap$com$pactforcure$app$survey$QuestionType[];

	static 
	{
		$SwitchMap$com$pactforcure$app$survey$QuestionType = new int[QuestionType.values().length];
	//    0    0:invokestatic    #18  <Method QuestionType[] QuestionType.values()>
	//    1    3:arraylength     
	//    2    4:newarray        int[]
	//    3    6:putstatic       #20  <Field int[] $SwitchMap$com$pactforcure$app$survey$QuestionType>
		try
		{
			$SwitchMap$com$pactforcure$app$survey$QuestionType[QuestionType.QuestionTypeSingleChoice.ordinal()] = 1;
	//    4    9:getstatic       #20  <Field int[] $SwitchMap$com$pactforcure$app$survey$QuestionType>
	//    5   12:getstatic       #24  <Field QuestionType QuestionType.QuestionTypeSingleChoice>
	//    6   15:invokevirtual   #28  <Method int QuestionType.ordinal()>
	//    7   18:iconst_1        
	//    8   19:iastore         
		}
	//*   9   20:getstatic       #20  <Field int[] $SwitchMap$com$pactforcure$app$survey$QuestionType>
	//*  10   23:getstatic       #31  <Field QuestionType QuestionType.QuestionTypeMultipleChoice>
	//*  11   26:invokevirtual   #28  <Method int QuestionType.ordinal()>
	//*  12   29:iconst_2        
	//*  13   30:iastore         
	//*  14   31:getstatic       #20  <Field int[] $SwitchMap$com$pactforcure$app$survey$QuestionType>
	//*  15   34:getstatic       #34  <Field QuestionType QuestionType.QuestionTypeNumberPicker>
	//*  16   37:invokevirtual   #28  <Method int QuestionType.ordinal()>
	//*  17   40:iconst_3        
	//*  18   41:iastore         
	//*  19   42:getstatic       #20  <Field int[] $SwitchMap$com$pactforcure$app$survey$QuestionType>
	//*  20   45:getstatic       #37  <Field QuestionType QuestionType.QuestionTypeBooleanChoice>
	//*  21   48:invokevirtual   #28  <Method int QuestionType.ordinal()>
	//*  22   51:iconst_4        
	//*  23   52:iastore         
	//*  24   53:getstatic       #20  <Field int[] $SwitchMap$com$pactforcure$app$survey$QuestionType>
	//*  25   56:getstatic       #40  <Field QuestionType QuestionType.QuestionTypeValuePicker>
	//*  26   59:invokevirtual   #28  <Method int QuestionType.ordinal()>
	//*  27   62:iconst_5        
	//*  28   63:iastore         
	//*  29   64:getstatic       #20  <Field int[] $SwitchMap$com$pactforcure$app$survey$QuestionType>
	//*  30   67:getstatic       #43  <Field QuestionType QuestionType.QuestionTypeScale>
	//*  31   70:invokevirtual   #28  <Method int QuestionType.ordinal()>
	//*  32   73:bipush          6
	//*  33   75:iastore         
	//*  34   76:getstatic       #20  <Field int[] $SwitchMap$com$pactforcure$app$survey$QuestionType>
	//*  35   79:getstatic       #46  <Field QuestionType QuestionType.QuestionTypeText>
	//*  36   82:invokevirtual   #28  <Method int QuestionType.ordinal()>
	//*  37   85:bipush          7
	//*  38   87:iastore         
	//*  39   88:return          
	//*  40   89:astore_0        
	//*  41   90:return          
	//*  42   91:astore_0        
	//*  43   92:goto            76
	//*  44   95:astore_0        
	//*  45   96:goto            64
	//*  46   99:astore_0        
	//*  47  100:goto            53
	//*  48  103:astore_0        
	//*  49  104:goto            42
	//*  50  107:astore_0        
	//*  51  108:goto            31
		catch(NoSuchFieldError nosuchfielderror6) { }
	//   52  111:astore_0        
		try
		{
			$SwitchMap$com$pactforcure$app$survey$QuestionType[QuestionType.QuestionTypeMultipleChoice.ordinal()] = 2;
		}
		catch(NoSuchFieldError nosuchfielderror5) { }
		try
		{
			$SwitchMap$com$pactforcure$app$survey$QuestionType[QuestionType.QuestionTypeNumberPicker.ordinal()] = 3;
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
	//*  53  112:goto            20
	}
}
