// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.appevents.codeless.internal;


// Referenced classes of package com.facebook.appevents.codeless.internal:
//			EventBinding

public static final class EventBinding$MappingMethod extends Enum
{

	public static EventBinding$MappingMethod valueOf(String s)
	{
		return (EventBinding$MappingMethod)Enum.valueOf(com/facebook/appevents/codeless/internal/EventBinding$MappingMethod, s);
	//    0    0:ldc1            #2   <Class EventBinding$MappingMethod>
	//    1    2:aload_0         
	//    2    3:invokestatic    #35  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class EventBinding$MappingMethod>
	//    4    9:areturn         
	}

	public static EventBinding$MappingMethod[] values()
	{
		return (EventBinding$MappingMethod[])((EventBinding$MappingMethod []) ($VALUES)).clone();
	//    0    0:getstatic       #27  <Field EventBinding$MappingMethod[] $VALUES>
	//    1    3:invokevirtual   #42  <Method Object _5B_Lcom.facebook.appevents.codeless.internal.EventBinding$MappingMethod_3B_.clone()>
	//    2    6:checkcast       #38  <Class EventBinding$MappingMethod[]>
	//    3    9:areturn         
	}

	private static final EventBinding$MappingMethod $VALUES[];
	public static final EventBinding$MappingMethod INFERENCE;
	public static final EventBinding$MappingMethod MANUAL;

	static 
	{
		MANUAL = new EventBinding$MappingMethod("MANUAL", 0);
	//    0    0:new             #2   <Class EventBinding$MappingMethod>
	//    1    3:dup             
	//    2    4:ldc1            #16  <String "MANUAL">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #20  <Method void EventBinding$MappingMethod(String, int)>
	//    5   10:putstatic       #22  <Field EventBinding$MappingMethod MANUAL>
		INFERENCE = new EventBinding$MappingMethod("INFERENCE", 1);
	//    6   13:new             #2   <Class EventBinding$MappingMethod>
	//    7   16:dup             
	//    8   17:ldc1            #23  <String "INFERENCE">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #20  <Method void EventBinding$MappingMethod(String, int)>
	//   11   23:putstatic       #25  <Field EventBinding$MappingMethod INFERENCE>
		$VALUES = (new EventBinding$MappingMethod[] {
			MANUAL, INFERENCE
		});
	//   12   26:iconst_2        
	//   13   27:anewarray       EventBinding$MappingMethod[]
	//   14   30:dup             
	//   15   31:iconst_0        
	//   16   32:getstatic       #22  <Field EventBinding$MappingMethod MANUAL>
	//   17   35:aastore         
	//   18   36:dup             
	//   19   37:iconst_1        
	//   20   38:getstatic       #25  <Field EventBinding$MappingMethod INFERENCE>
	//   21   41:aastore         
	//   22   42:putstatic       #27  <Field EventBinding$MappingMethod[] $VALUES>
	//*  23   45:return          
	}

	private EventBinding$MappingMethod(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #29  <Method void Enum(String, int)>
	//    4    6:return          
	}
}
