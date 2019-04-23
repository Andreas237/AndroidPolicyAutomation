// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appscend.media.events;


// Referenced classes of package com.appscend.media.events:
//			APSMediaEvent

public static final class APSMediaEvent$APSMediaEventState extends Enum
{

	public static APSMediaEvent$APSMediaEventState valueOf(String s)
	{
		return (APSMediaEvent$APSMediaEventState)Enum.valueOf(com/appscend/media/events/APSMediaEvent$APSMediaEventState, s);
	//    0    0:ldc1            #2   <Class APSMediaEvent$APSMediaEventState>
	//    1    2:aload_0         
	//    2    3:invokestatic    #51  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class APSMediaEvent$APSMediaEventState>
	//    4    9:areturn         
	}

	public static APSMediaEvent$APSMediaEventState[] values()
	{
		return (APSMediaEvent$APSMediaEventState[])((APSMediaEvent$APSMediaEventState []) ($VALUES)).clone();
	//    0    0:getstatic       #43  <Field APSMediaEvent$APSMediaEventState[] $VALUES>
	//    1    3:invokevirtual   #58  <Method Object _5B_Lcom.appscend.media.events.APSMediaEvent$APSMediaEventState_3B_.clone()>
	//    2    6:checkcast       #54  <Class APSMediaEvent$APSMediaEventState[]>
	//    3    9:areturn         
	}

	private static final APSMediaEvent$APSMediaEventState $VALUES[];
	public static final APSMediaEvent$APSMediaEventState APSMediaEventStateFailed;
	public static final APSMediaEvent$APSMediaEventState APSMediaEventStateFinished;
	public static final APSMediaEvent$APSMediaEventState APSMediaEventStatePreloaded;
	public static final APSMediaEvent$APSMediaEventState APSMediaEventStatePreloading;
	public static final APSMediaEvent$APSMediaEventState APSMediaEventStateTriggered;
	public static final APSMediaEvent$APSMediaEventState APSMediaEventStateUnloaded;

	static 
	{
		APSMediaEventStateUnloaded = new APSMediaEvent$APSMediaEventState("APSMediaEventStateUnloaded", 0);
	//    0    0:new             #2   <Class APSMediaEvent$APSMediaEventState>
	//    1    3:dup             
	//    2    4:ldc1            #20  <String "APSMediaEventStateUnloaded">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #24  <Method void APSMediaEvent$APSMediaEventState(String, int)>
	//    5   10:putstatic       #26  <Field APSMediaEvent$APSMediaEventState APSMediaEventStateUnloaded>
		APSMediaEventStatePreloading = new APSMediaEvent$APSMediaEventState("APSMediaEventStatePreloading", 1);
	//    6   13:new             #2   <Class APSMediaEvent$APSMediaEventState>
	//    7   16:dup             
	//    8   17:ldc1            #27  <String "APSMediaEventStatePreloading">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #24  <Method void APSMediaEvent$APSMediaEventState(String, int)>
	//   11   23:putstatic       #29  <Field APSMediaEvent$APSMediaEventState APSMediaEventStatePreloading>
		APSMediaEventStatePreloaded = new APSMediaEvent$APSMediaEventState("APSMediaEventStatePreloaded", 2);
	//   12   26:new             #2   <Class APSMediaEvent$APSMediaEventState>
	//   13   29:dup             
	//   14   30:ldc1            #30  <String "APSMediaEventStatePreloaded">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #24  <Method void APSMediaEvent$APSMediaEventState(String, int)>
	//   17   36:putstatic       #32  <Field APSMediaEvent$APSMediaEventState APSMediaEventStatePreloaded>
		APSMediaEventStateFailed = new APSMediaEvent$APSMediaEventState("APSMediaEventStateFailed", 3);
	//   18   39:new             #2   <Class APSMediaEvent$APSMediaEventState>
	//   19   42:dup             
	//   20   43:ldc1            #33  <String "APSMediaEventStateFailed">
	//   21   45:iconst_3        
	//   22   46:invokespecial   #24  <Method void APSMediaEvent$APSMediaEventState(String, int)>
	//   23   49:putstatic       #35  <Field APSMediaEvent$APSMediaEventState APSMediaEventStateFailed>
		APSMediaEventStateTriggered = new APSMediaEvent$APSMediaEventState("APSMediaEventStateTriggered", 4);
	//   24   52:new             #2   <Class APSMediaEvent$APSMediaEventState>
	//   25   55:dup             
	//   26   56:ldc1            #36  <String "APSMediaEventStateTriggered">
	//   27   58:iconst_4        
	//   28   59:invokespecial   #24  <Method void APSMediaEvent$APSMediaEventState(String, int)>
	//   29   62:putstatic       #38  <Field APSMediaEvent$APSMediaEventState APSMediaEventStateTriggered>
		APSMediaEventStateFinished = new APSMediaEvent$APSMediaEventState("APSMediaEventStateFinished", 5);
	//   30   65:new             #2   <Class APSMediaEvent$APSMediaEventState>
	//   31   68:dup             
	//   32   69:ldc1            #39  <String "APSMediaEventStateFinished">
	//   33   71:iconst_5        
	//   34   72:invokespecial   #24  <Method void APSMediaEvent$APSMediaEventState(String, int)>
	//   35   75:putstatic       #41  <Field APSMediaEvent$APSMediaEventState APSMediaEventStateFinished>
		$VALUES = (new APSMediaEvent$APSMediaEventState[] {
			APSMediaEventStateUnloaded, APSMediaEventStatePreloading, APSMediaEventStatePreloaded, APSMediaEventStateFailed, APSMediaEventStateTriggered, APSMediaEventStateFinished
		});
	//   36   78:bipush          6
	//   37   80:anewarray       APSMediaEvent$APSMediaEventState[]
	//   38   83:dup             
	//   39   84:iconst_0        
	//   40   85:getstatic       #26  <Field APSMediaEvent$APSMediaEventState APSMediaEventStateUnloaded>
	//   41   88:aastore         
	//   42   89:dup             
	//   43   90:iconst_1        
	//   44   91:getstatic       #29  <Field APSMediaEvent$APSMediaEventState APSMediaEventStatePreloading>
	//   45   94:aastore         
	//   46   95:dup             
	//   47   96:iconst_2        
	//   48   97:getstatic       #32  <Field APSMediaEvent$APSMediaEventState APSMediaEventStatePreloaded>
	//   49  100:aastore         
	//   50  101:dup             
	//   51  102:iconst_3        
	//   52  103:getstatic       #35  <Field APSMediaEvent$APSMediaEventState APSMediaEventStateFailed>
	//   53  106:aastore         
	//   54  107:dup             
	//   55  108:iconst_4        
	//   56  109:getstatic       #38  <Field APSMediaEvent$APSMediaEventState APSMediaEventStateTriggered>
	//   57  112:aastore         
	//   58  113:dup             
	//   59  114:iconst_5        
	//   60  115:getstatic       #41  <Field APSMediaEvent$APSMediaEventState APSMediaEventStateFinished>
	//   61  118:aastore         
	//   62  119:putstatic       #43  <Field APSMediaEvent$APSMediaEventState[] $VALUES>
	//*  63  122:return          
	}

	private APSMediaEvent$APSMediaEventState(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #45  <Method void Enum(String, int)>
	//    4    6:return          
	}
}
