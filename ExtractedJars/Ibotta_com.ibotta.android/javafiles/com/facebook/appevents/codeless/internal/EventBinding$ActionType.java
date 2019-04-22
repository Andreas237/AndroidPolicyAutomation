// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.appevents.codeless.internal;


// Referenced classes of package com.facebook.appevents.codeless.internal:
//			EventBinding

public static final class EventBinding$ActionType extends Enum
{

	public static EventBinding$ActionType valueOf(String s)
	{
		return (EventBinding$ActionType)Enum.valueOf(com/facebook/appevents/codeless/internal/EventBinding$ActionType, s);
	//    0    0:ldc1            #2   <Class EventBinding$ActionType>
	//    1    2:aload_0         
	//    2    3:invokestatic    #39  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class EventBinding$ActionType>
	//    4    9:areturn         
	}

	public static EventBinding$ActionType[] values()
	{
		return (EventBinding$ActionType[])((EventBinding$ActionType []) ($VALUES)).clone();
	//    0    0:getstatic       #31  <Field EventBinding$ActionType[] $VALUES>
	//    1    3:invokevirtual   #46  <Method Object _5B_Lcom.facebook.appevents.codeless.internal.EventBinding$ActionType_3B_.clone()>
	//    2    6:checkcast       #42  <Class EventBinding$ActionType[]>
	//    3    9:areturn         
	}

	private static final EventBinding$ActionType $VALUES[];
	public static final EventBinding$ActionType CLICK;
	public static final EventBinding$ActionType SELECTED;
	public static final EventBinding$ActionType TEXT_CHANGED;

	static 
	{
		CLICK = new EventBinding$ActionType("CLICK", 0);
	//    0    0:new             #2   <Class EventBinding$ActionType>
	//    1    3:dup             
	//    2    4:ldc1            #17  <String "CLICK">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #21  <Method void EventBinding$ActionType(String, int)>
	//    5   10:putstatic       #23  <Field EventBinding$ActionType CLICK>
		SELECTED = new EventBinding$ActionType("SELECTED", 1);
	//    6   13:new             #2   <Class EventBinding$ActionType>
	//    7   16:dup             
	//    8   17:ldc1            #24  <String "SELECTED">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #21  <Method void EventBinding$ActionType(String, int)>
	//   11   23:putstatic       #26  <Field EventBinding$ActionType SELECTED>
		TEXT_CHANGED = new EventBinding$ActionType("TEXT_CHANGED", 2);
	//   12   26:new             #2   <Class EventBinding$ActionType>
	//   13   29:dup             
	//   14   30:ldc1            #27  <String "TEXT_CHANGED">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #21  <Method void EventBinding$ActionType(String, int)>
	//   17   36:putstatic       #29  <Field EventBinding$ActionType TEXT_CHANGED>
		$VALUES = (new EventBinding$ActionType[] {
			CLICK, SELECTED, TEXT_CHANGED
		});
	//   18   39:iconst_3        
	//   19   40:anewarray       EventBinding$ActionType[]
	//   20   43:dup             
	//   21   44:iconst_0        
	//   22   45:getstatic       #23  <Field EventBinding$ActionType CLICK>
	//   23   48:aastore         
	//   24   49:dup             
	//   25   50:iconst_1        
	//   26   51:getstatic       #26  <Field EventBinding$ActionType SELECTED>
	//   27   54:aastore         
	//   28   55:dup             
	//   29   56:iconst_2        
	//   30   57:getstatic       #29  <Field EventBinding$ActionType TEXT_CHANGED>
	//   31   60:aastore         
	//   32   61:putstatic       #31  <Field EventBinding$ActionType[] $VALUES>
	//*  33   64:return          
	}

	private EventBinding$ActionType(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #33  <Method void Enum(String, int)>
	//    4    6:return          
	}
}
