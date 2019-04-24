// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.pactforcure.app.survey;


public final class QuestionType extends Enum
{
	public static class Constants
	{

		public static final int BOOLEAN_QUESTION_TYPE_VALUE = 3;

		public Constants()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #14  <Method void Object()>
		//    2    4:return          
		}
	}


	private QuestionType(String s, int i, int j)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #61  <Method void Enum(String, int)>
		value = j;
	//    4    6:aload_0         
	//    5    7:iload_3         
	//    6    8:putfield        #63  <Field int value>
	//    7   11:return          
	}

	public static QuestionType valueOf(String s)
	{
		return (QuestionType)Enum.valueOf(com/pactforcure/app/survey/QuestionType, s);
	//    0    0:ldc1            #2   <Class QuestionType>
	//    1    2:aload_0         
	//    2    3:invokestatic    #70  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class QuestionType>
	//    4    9:areturn         
	}

	public static QuestionType[] values()
	{
		return (QuestionType[])((QuestionType []) ($VALUES)).clone();
	//    0    0:getstatic       #57  <Field QuestionType[] $VALUES>
	//    1    3:invokevirtual   #77  <Method Object _5B_Lcom.pactforcure.app.survey.QuestionType_3B_.clone()>
	//    2    6:checkcast       #73  <Class QuestionType[]>
	//    3    9:areturn         
	}

	public int getValue()
	{
		return value;
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field int value>
	//    2    4:ireturn         
	}

	private static final QuestionType $VALUES[];
	public static final QuestionType QuestionTypeBooleanChoice;
	public static final QuestionType QuestionTypeMultipleChoice;
	public static final QuestionType QuestionTypeNumberPicker;
	public static final QuestionType QuestionTypeScale;
	public static final QuestionType QuestionTypeSingleChoice;
	public static final QuestionType QuestionTypeText;
	public static final QuestionType QuestionTypeValuePicker;
	private final int value;

	static 
	{
		QuestionTypeNumberPicker = new QuestionType("QuestionTypeNumberPicker", 0, 0);
	//    0    0:new             #2   <Class QuestionType>
	//    1    3:dup             
	//    2    4:ldc1            #31  <String "QuestionTypeNumberPicker">
	//    3    6:iconst_0        
	//    4    7:iconst_0        
	//    5    8:invokespecial   #35  <Method void QuestionType(String, int, int)>
	//    6   11:putstatic       #37  <Field QuestionType QuestionTypeNumberPicker>
		QuestionTypeSingleChoice = new QuestionType("QuestionTypeSingleChoice", 1, 1);
	//    7   14:new             #2   <Class QuestionType>
	//    8   17:dup             
	//    9   18:ldc1            #38  <String "QuestionTypeSingleChoice">
	//   10   20:iconst_1        
	//   11   21:iconst_1        
	//   12   22:invokespecial   #35  <Method void QuestionType(String, int, int)>
	//   13   25:putstatic       #40  <Field QuestionType QuestionTypeSingleChoice>
		QuestionTypeMultipleChoice = new QuestionType("QuestionTypeMultipleChoice", 2, 2);
	//   14   28:new             #2   <Class QuestionType>
	//   15   31:dup             
	//   16   32:ldc1            #41  <String "QuestionTypeMultipleChoice">
	//   17   34:iconst_2        
	//   18   35:iconst_2        
	//   19   36:invokespecial   #35  <Method void QuestionType(String, int, int)>
	//   20   39:putstatic       #43  <Field QuestionType QuestionTypeMultipleChoice>
		QuestionTypeBooleanChoice = new QuestionType("QuestionTypeBooleanChoice", 3, 3);
	//   21   42:new             #2   <Class QuestionType>
	//   22   45:dup             
	//   23   46:ldc1            #44  <String "QuestionTypeBooleanChoice">
	//   24   48:iconst_3        
	//   25   49:iconst_3        
	//   26   50:invokespecial   #35  <Method void QuestionType(String, int, int)>
	//   27   53:putstatic       #46  <Field QuestionType QuestionTypeBooleanChoice>
		QuestionTypeValuePicker = new QuestionType("QuestionTypeValuePicker", 4, 4);
	//   28   56:new             #2   <Class QuestionType>
	//   29   59:dup             
	//   30   60:ldc1            #47  <String "QuestionTypeValuePicker">
	//   31   62:iconst_4        
	//   32   63:iconst_4        
	//   33   64:invokespecial   #35  <Method void QuestionType(String, int, int)>
	//   34   67:putstatic       #49  <Field QuestionType QuestionTypeValuePicker>
		QuestionTypeScale = new QuestionType("QuestionTypeScale", 5, 5);
	//   35   70:new             #2   <Class QuestionType>
	//   36   73:dup             
	//   37   74:ldc1            #50  <String "QuestionTypeScale">
	//   38   76:iconst_5        
	//   39   77:iconst_5        
	//   40   78:invokespecial   #35  <Method void QuestionType(String, int, int)>
	//   41   81:putstatic       #52  <Field QuestionType QuestionTypeScale>
		QuestionTypeText = new QuestionType("QuestionTypeText", 6, 6);
	//   42   84:new             #2   <Class QuestionType>
	//   43   87:dup             
	//   44   88:ldc1            #53  <String "QuestionTypeText">
	//   45   90:bipush          6
	//   46   92:bipush          6
	//   47   94:invokespecial   #35  <Method void QuestionType(String, int, int)>
	//   48   97:putstatic       #55  <Field QuestionType QuestionTypeText>
		$VALUES = (new QuestionType[] {
			QuestionTypeNumberPicker, QuestionTypeSingleChoice, QuestionTypeMultipleChoice, QuestionTypeBooleanChoice, QuestionTypeValuePicker, QuestionTypeScale, QuestionTypeText
		});
	//   49  100:bipush          7
	//   50  102:anewarray       QuestionType[]
	//   51  105:dup             
	//   52  106:iconst_0        
	//   53  107:getstatic       #37  <Field QuestionType QuestionTypeNumberPicker>
	//   54  110:aastore         
	//   55  111:dup             
	//   56  112:iconst_1        
	//   57  113:getstatic       #40  <Field QuestionType QuestionTypeSingleChoice>
	//   58  116:aastore         
	//   59  117:dup             
	//   60  118:iconst_2        
	//   61  119:getstatic       #43  <Field QuestionType QuestionTypeMultipleChoice>
	//   62  122:aastore         
	//   63  123:dup             
	//   64  124:iconst_3        
	//   65  125:getstatic       #46  <Field QuestionType QuestionTypeBooleanChoice>
	//   66  128:aastore         
	//   67  129:dup             
	//   68  130:iconst_4        
	//   69  131:getstatic       #49  <Field QuestionType QuestionTypeValuePicker>
	//   70  134:aastore         
	//   71  135:dup             
	//   72  136:iconst_5        
	//   73  137:getstatic       #52  <Field QuestionType QuestionTypeScale>
	//   74  140:aastore         
	//   75  141:dup             
	//   76  142:bipush          6
	//   77  144:getstatic       #55  <Field QuestionType QuestionTypeText>
	//   78  147:aastore         
	//   79  148:putstatic       #57  <Field QuestionType[] $VALUES>
	//*  80  151:return          
	}
}
