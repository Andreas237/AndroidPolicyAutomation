// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.pactforcure.app.survey;


public final class StepType extends Enum
{

	private StepType(String s, int i, int j)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #38  <Method void Enum(String, int)>
		value = j;
	//    4    6:aload_0         
	//    5    7:iload_3         
	//    6    8:putfield        #40  <Field int value>
	//    7   11:return          
	}

	public static StepType valueOf(String s)
	{
		return (StepType)Enum.valueOf(com/pactforcure/app/survey/StepType, s);
	//    0    0:ldc1            #2   <Class StepType>
	//    1    2:aload_0         
	//    2    3:invokestatic    #47  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class StepType>
	//    4    9:areturn         
	}

	public static StepType[] values()
	{
		return (StepType[])((StepType []) ($VALUES)).clone();
	//    0    0:getstatic       #34  <Field StepType[] $VALUES>
	//    1    3:invokevirtual   #54  <Method Object _5B_Lcom.pactforcure.app.survey.StepType_3B_.clone()>
	//    2    6:checkcast       #50  <Class StepType[]>
	//    3    9:areturn         
	}

	public int getValue()
	{
		return value;
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field int value>
	//    2    4:ireturn         
	}

	private static final StepType $VALUES[];
	public static final StepType StepTypeCompletion;
	public static final StepType StepTypeInstruction;
	public static final StepType StepTypeQuestion;
	private final int value;

	static 
	{
		StepTypeQuestion = new StepType("StepTypeQuestion", 0, 0);
	//    0    0:new             #2   <Class StepType>
	//    1    3:dup             
	//    2    4:ldc1            #20  <String "StepTypeQuestion">
	//    3    6:iconst_0        
	//    4    7:iconst_0        
	//    5    8:invokespecial   #24  <Method void StepType(String, int, int)>
	//    6   11:putstatic       #26  <Field StepType StepTypeQuestion>
		StepTypeInstruction = new StepType("StepTypeInstruction", 1, 1);
	//    7   14:new             #2   <Class StepType>
	//    8   17:dup             
	//    9   18:ldc1            #27  <String "StepTypeInstruction">
	//   10   20:iconst_1        
	//   11   21:iconst_1        
	//   12   22:invokespecial   #24  <Method void StepType(String, int, int)>
	//   13   25:putstatic       #29  <Field StepType StepTypeInstruction>
		StepTypeCompletion = new StepType("StepTypeCompletion", 2, 2);
	//   14   28:new             #2   <Class StepType>
	//   15   31:dup             
	//   16   32:ldc1            #30  <String "StepTypeCompletion">
	//   17   34:iconst_2        
	//   18   35:iconst_2        
	//   19   36:invokespecial   #24  <Method void StepType(String, int, int)>
	//   20   39:putstatic       #32  <Field StepType StepTypeCompletion>
		$VALUES = (new StepType[] {
			StepTypeQuestion, StepTypeInstruction, StepTypeCompletion
		});
	//   21   42:iconst_3        
	//   22   43:anewarray       StepType[]
	//   23   46:dup             
	//   24   47:iconst_0        
	//   25   48:getstatic       #26  <Field StepType StepTypeQuestion>
	//   26   51:aastore         
	//   27   52:dup             
	//   28   53:iconst_1        
	//   29   54:getstatic       #29  <Field StepType StepTypeInstruction>
	//   30   57:aastore         
	//   31   58:dup             
	//   32   59:iconst_2        
	//   33   60:getstatic       #32  <Field StepType StepTypeCompletion>
	//   34   63:aastore         
	//   35   64:putstatic       #34  <Field StepType[] $VALUES>
	//*  36   67:return          
	}
}
