// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.core;


public final class ScheduleDataState extends Enum
{

	private ScheduleDataState(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #26  <Method void Enum(String, int)>
	//    4    6:return          
	}

	public static ScheduleDataState valueOf(String s)
	{
		return (ScheduleDataState)Enum.valueOf(com/irobot/core/ScheduleDataState, s);
	//    0    0:ldc1            #2   <Class ScheduleDataState>
	//    1    2:aload_0         
	//    2    3:invokestatic    #32  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class ScheduleDataState>
	//    4    9:areturn         
	}

	public static ScheduleDataState[] values()
	{
		return (ScheduleDataState[])((ScheduleDataState []) ($VALUES)).clone();
	//    0    0:getstatic       #24  <Field ScheduleDataState[] $VALUES>
	//    1    3:invokevirtual   #39  <Method Object _5B_Lcom.irobot.core.ScheduleDataState_3B_.clone()>
	//    2    6:checkcast       #35  <Class ScheduleDataState[]>
	//    3    9:areturn         
	}

	private static final ScheduleDataState $VALUES[];
	public static final ScheduleDataState CheckIfSchedulesContainsMapId;
	public static final ScheduleDataState TeamingError;

	static 
	{
		CheckIfSchedulesContainsMapId = new ScheduleDataState("CheckIfSchedulesContainsMapId", 0);
	//    0    0:new             #2   <Class ScheduleDataState>
	//    1    3:dup             
	//    2    4:ldc1            #13  <String "CheckIfSchedulesContainsMapId">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #17  <Method void ScheduleDataState(String, int)>
	//    5   10:putstatic       #19  <Field ScheduleDataState CheckIfSchedulesContainsMapId>
		TeamingError = new ScheduleDataState("TeamingError", 1);
	//    6   13:new             #2   <Class ScheduleDataState>
	//    7   16:dup             
	//    8   17:ldc1            #20  <String "TeamingError">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #17  <Method void ScheduleDataState(String, int)>
	//   11   23:putstatic       #22  <Field ScheduleDataState TeamingError>
		$VALUES = (new ScheduleDataState[] {
			CheckIfSchedulesContainsMapId, TeamingError
		});
	//   12   26:iconst_2        
	//   13   27:anewarray       ScheduleDataState[]
	//   14   30:dup             
	//   15   31:iconst_0        
	//   16   32:getstatic       #19  <Field ScheduleDataState CheckIfSchedulesContainsMapId>
	//   17   35:aastore         
	//   18   36:dup             
	//   19   37:iconst_1        
	//   20   38:getstatic       #22  <Field ScheduleDataState TeamingError>
	//   21   41:aastore         
	//   22   42:putstatic       #24  <Field ScheduleDataState[] $VALUES>
	//*  23   45:return          
	}
}
