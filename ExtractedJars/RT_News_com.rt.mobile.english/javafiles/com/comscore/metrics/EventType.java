// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.comscore.metrics;


public final class EventType extends Enum
{

	private EventType(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #26  <Method void Enum(String, int)>
	//    4    6:return          
	}

	public static EventType valueOf(String s)
	{
		return (EventType)Enum.valueOf(com/comscore/metrics/EventType, s);
	//    0    0:ldc1            #2   <Class EventType>
	//    1    2:aload_0         
	//    2    3:invokestatic    #32  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class EventType>
	//    4    9:areturn         
	}

	public static EventType[] values()
	{
		return (EventType[])((EventType []) (a)).clone();
	//    0    0:getstatic       #24  <Field EventType[] a>
	//    1    3:invokevirtual   #39  <Method Object _5B_Lcom.comscore.metrics.EventType_3B_.clone()>
	//    2    6:checkcast       #35  <Class EventType[]>
	//    3    9:areturn         
	}

	public String toString()
	{
		return super.toString().toLowerCase();
	//    0    0:aload_0         
	//    1    1:invokespecial   #43  <Method String Enum.toString()>
	//    2    4:invokevirtual   #48  <Method String String.toLowerCase()>
	//    3    7:areturn         
	}

	public static final EventType HIDDEN;
	public static final EventType VIEW;
	private static final EventType a[];

	static 
	{
		VIEW = new EventType("VIEW", 0);
	//    0    0:new             #2   <Class EventType>
	//    1    3:dup             
	//    2    4:ldc1            #13  <String "VIEW">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #17  <Method void EventType(String, int)>
	//    5   10:putstatic       #19  <Field EventType VIEW>
		HIDDEN = new EventType("HIDDEN", 1);
	//    6   13:new             #2   <Class EventType>
	//    7   16:dup             
	//    8   17:ldc1            #20  <String "HIDDEN">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #17  <Method void EventType(String, int)>
	//   11   23:putstatic       #22  <Field EventType HIDDEN>
		a = (new EventType[] {
			VIEW, HIDDEN
		});
	//   12   26:iconst_2        
	//   13   27:anewarray       EventType[]
	//   14   30:dup             
	//   15   31:iconst_0        
	//   16   32:getstatic       #19  <Field EventType VIEW>
	//   17   35:aastore         
	//   18   36:dup             
	//   19   37:iconst_1        
	//   20   38:getstatic       #22  <Field EventType HIDDEN>
	//   21   41:aastore         
	//   22   42:putstatic       #24  <Field EventType[] a>
	//*  23   45:return          
	}
}
