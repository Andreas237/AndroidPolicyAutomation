// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appscend.media.events;


// Referenced classes of package com.appscend.media.events:
//			APSMediaUnit

public static final class APSMediaUnit$APSHandleSeekEvent extends Enum
{

	public static APSMediaUnit$APSHandleSeekEvent valueOf(String s)
	{
		return (APSMediaUnit$APSHandleSeekEvent)Enum.valueOf(com/appscend/media/events/APSMediaUnit$APSHandleSeekEvent, s);
	//    0    0:ldc1            #2   <Class APSMediaUnit$APSHandleSeekEvent>
	//    1    2:aload_0         
	//    2    3:invokestatic    #39  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class APSMediaUnit$APSHandleSeekEvent>
	//    4    9:areturn         
	}

	public static APSMediaUnit$APSHandleSeekEvent[] values()
	{
		return (APSMediaUnit$APSHandleSeekEvent[])((APSMediaUnit$APSHandleSeekEvent []) ($VALUES)).clone();
	//    0    0:getstatic       #31  <Field APSMediaUnit$APSHandleSeekEvent[] $VALUES>
	//    1    3:invokevirtual   #46  <Method Object _5B_Lcom.appscend.media.events.APSMediaUnit$APSHandleSeekEvent_3B_.clone()>
	//    2    6:checkcast       #42  <Class APSMediaUnit$APSHandleSeekEvent[]>
	//    3    9:areturn         
	}

	private static final APSMediaUnit$APSHandleSeekEvent $VALUES[];
	public static final APSMediaUnit$APSHandleSeekEvent APSHandleSeekEventPlayAllBreaks;
	public static final APSMediaUnit$APSHandleSeekEvent APSHandleSeekEventPlayFirstBreak;
	public static final APSMediaUnit$APSHandleSeekEvent APSHandleSeekEventPlayLastBreak;

	static 
	{
		APSHandleSeekEventPlayFirstBreak = new APSMediaUnit$APSHandleSeekEvent("APSHandleSeekEventPlayFirstBreak", 0);
	//    0    0:new             #2   <Class APSMediaUnit$APSHandleSeekEvent>
	//    1    3:dup             
	//    2    4:ldc1            #17  <String "APSHandleSeekEventPlayFirstBreak">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #21  <Method void APSMediaUnit$APSHandleSeekEvent(String, int)>
	//    5   10:putstatic       #23  <Field APSMediaUnit$APSHandleSeekEvent APSHandleSeekEventPlayFirstBreak>
		APSHandleSeekEventPlayLastBreak = new APSMediaUnit$APSHandleSeekEvent("APSHandleSeekEventPlayLastBreak", 1);
	//    6   13:new             #2   <Class APSMediaUnit$APSHandleSeekEvent>
	//    7   16:dup             
	//    8   17:ldc1            #24  <String "APSHandleSeekEventPlayLastBreak">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #21  <Method void APSMediaUnit$APSHandleSeekEvent(String, int)>
	//   11   23:putstatic       #26  <Field APSMediaUnit$APSHandleSeekEvent APSHandleSeekEventPlayLastBreak>
		APSHandleSeekEventPlayAllBreaks = new APSMediaUnit$APSHandleSeekEvent("APSHandleSeekEventPlayAllBreaks", 2);
	//   12   26:new             #2   <Class APSMediaUnit$APSHandleSeekEvent>
	//   13   29:dup             
	//   14   30:ldc1            #27  <String "APSHandleSeekEventPlayAllBreaks">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #21  <Method void APSMediaUnit$APSHandleSeekEvent(String, int)>
	//   17   36:putstatic       #29  <Field APSMediaUnit$APSHandleSeekEvent APSHandleSeekEventPlayAllBreaks>
		$VALUES = (new APSMediaUnit$APSHandleSeekEvent[] {
			APSHandleSeekEventPlayFirstBreak, APSHandleSeekEventPlayLastBreak, APSHandleSeekEventPlayAllBreaks
		});
	//   18   39:iconst_3        
	//   19   40:anewarray       APSMediaUnit$APSHandleSeekEvent[]
	//   20   43:dup             
	//   21   44:iconst_0        
	//   22   45:getstatic       #23  <Field APSMediaUnit$APSHandleSeekEvent APSHandleSeekEventPlayFirstBreak>
	//   23   48:aastore         
	//   24   49:dup             
	//   25   50:iconst_1        
	//   26   51:getstatic       #26  <Field APSMediaUnit$APSHandleSeekEvent APSHandleSeekEventPlayLastBreak>
	//   27   54:aastore         
	//   28   55:dup             
	//   29   56:iconst_2        
	//   30   57:getstatic       #29  <Field APSMediaUnit$APSHandleSeekEvent APSHandleSeekEventPlayAllBreaks>
	//   31   60:aastore         
	//   32   61:putstatic       #31  <Field APSMediaUnit$APSHandleSeekEvent[] $VALUES>
	//*  33   64:return          
	}

	private APSMediaUnit$APSHandleSeekEvent(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #33  <Method void Enum(String, int)>
	//    4    6:return          
	}
}
