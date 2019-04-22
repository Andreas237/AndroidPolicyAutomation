// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.inspector.elements;


public final class Origin extends Enum
{

	private Origin(String s, int i, String s1)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #46  <Method void Enum(String, int)>
		mValue = s1;
	//    4    6:aload_0         
	//    5    7:aload_3         
	//    6    8:putfield        #48  <Field String mValue>
	//    7   11:return          
	}

	public static Origin valueOf(String s)
	{
		return (Origin)Enum.valueOf(com/facebook/stetho/inspector/elements/Origin, s);
	//    0    0:ldc1            #2   <Class Origin>
	//    1    2:aload_0         
	//    2    3:invokestatic    #55  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class Origin>
	//    4    9:areturn         
	}

	public static Origin[] values()
	{
		return (Origin[])((Origin []) ($VALUES)).clone();
	//    0    0:getstatic       #42  <Field Origin[] $VALUES>
	//    1    3:invokevirtual   #62  <Method Object _5B_Lcom.facebook.stetho.inspector.elements.Origin_3B_.clone()>
	//    2    6:checkcast       #58  <Class Origin[]>
	//    3    9:areturn         
	}

	public String getProtocolValue()
	{
		return mValue;
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field String mValue>
	//    2    4:areturn         
	}

	private static final Origin $VALUES[];
	public static final Origin INJECTED;
	public static final Origin INSPECTOR;
	public static final Origin REGULAR;
	public static final Origin USER_AGENT;
	private final String mValue;

	static 
	{
		INJECTED = new Origin("INJECTED", 0, "injected");
	//    0    0:new             #2   <Class Origin>
	//    1    3:dup             
	//    2    4:ldc1            #17  <String "INJECTED">
	//    3    6:iconst_0        
	//    4    7:ldc1            #19  <String "injected">
	//    5    9:invokespecial   #23  <Method void Origin(String, int, String)>
	//    6   12:putstatic       #25  <Field Origin INJECTED>
		USER_AGENT = new Origin("USER_AGENT", 1, "user-agent");
	//    7   15:new             #2   <Class Origin>
	//    8   18:dup             
	//    9   19:ldc1            #26  <String "USER_AGENT">
	//   10   21:iconst_1        
	//   11   22:ldc1            #28  <String "user-agent">
	//   12   24:invokespecial   #23  <Method void Origin(String, int, String)>
	//   13   27:putstatic       #30  <Field Origin USER_AGENT>
		INSPECTOR = new Origin("INSPECTOR", 2, "inspector");
	//   14   30:new             #2   <Class Origin>
	//   15   33:dup             
	//   16   34:ldc1            #31  <String "INSPECTOR">
	//   17   36:iconst_2        
	//   18   37:ldc1            #33  <String "inspector">
	//   19   39:invokespecial   #23  <Method void Origin(String, int, String)>
	//   20   42:putstatic       #35  <Field Origin INSPECTOR>
		REGULAR = new Origin("REGULAR", 3, "regular");
	//   21   45:new             #2   <Class Origin>
	//   22   48:dup             
	//   23   49:ldc1            #36  <String "REGULAR">
	//   24   51:iconst_3        
	//   25   52:ldc1            #38  <String "regular">
	//   26   54:invokespecial   #23  <Method void Origin(String, int, String)>
	//   27   57:putstatic       #40  <Field Origin REGULAR>
		$VALUES = (new Origin[] {
			INJECTED, USER_AGENT, INSPECTOR, REGULAR
		});
	//   28   60:iconst_4        
	//   29   61:anewarray       Origin[]
	//   30   64:dup             
	//   31   65:iconst_0        
	//   32   66:getstatic       #25  <Field Origin INJECTED>
	//   33   69:aastore         
	//   34   70:dup             
	//   35   71:iconst_1        
	//   36   72:getstatic       #30  <Field Origin USER_AGENT>
	//   37   75:aastore         
	//   38   76:dup             
	//   39   77:iconst_2        
	//   40   78:getstatic       #35  <Field Origin INSPECTOR>
	//   41   81:aastore         
	//   42   82:dup             
	//   43   83:iconst_3        
	//   44   84:getstatic       #40  <Field Origin REGULAR>
	//   45   87:aastore         
	//   46   88:putstatic       #42  <Field Origin[] $VALUES>
	//*  47   91:return          
	}
}
