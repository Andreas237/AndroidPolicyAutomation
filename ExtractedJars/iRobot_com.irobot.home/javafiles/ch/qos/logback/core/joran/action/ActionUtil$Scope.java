// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.core.joran.action;


// Referenced classes of package ch.qos.logback.core.joran.action:
//			ActionUtil

public static final class ActionUtil$Scope extends Enum
{

	public static ActionUtil$Scope valueOf(String s)
	{
		return (ActionUtil$Scope)Enum.valueOf(ch/qos/logback/core/joran/action/ActionUtil$Scope, s);
	//    0    0:ldc1            #2   <Class ActionUtil$Scope>
	//    1    2:aload_0         
	//    2    3:invokestatic    #39  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class ActionUtil$Scope>
	//    4    9:areturn         
	}

	public static ActionUtil$Scope[] values()
	{
		return (ActionUtil$Scope[])((ActionUtil$Scope []) ($VALUES)).clone();
	//    0    0:getstatic       #31  <Field ActionUtil$Scope[] $VALUES>
	//    1    3:invokevirtual   #46  <Method Object _5B_Lch.qos.logback.core.joran.action.ActionUtil$Scope_3B_.clone()>
	//    2    6:checkcast       #42  <Class ActionUtil$Scope[]>
	//    3    9:areturn         
	}

	private static final ActionUtil$Scope $VALUES[];
	public static final ActionUtil$Scope CONTEXT;
	public static final ActionUtil$Scope LOCAL;
	public static final ActionUtil$Scope SYSTEM;

	static 
	{
		LOCAL = new ActionUtil$Scope("LOCAL", 0);
	//    0    0:new             #2   <Class ActionUtil$Scope>
	//    1    3:dup             
	//    2    4:ldc1            #17  <String "LOCAL">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #21  <Method void ActionUtil$Scope(String, int)>
	//    5   10:putstatic       #23  <Field ActionUtil$Scope LOCAL>
		CONTEXT = new ActionUtil$Scope("CONTEXT", 1);
	//    6   13:new             #2   <Class ActionUtil$Scope>
	//    7   16:dup             
	//    8   17:ldc1            #24  <String "CONTEXT">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #21  <Method void ActionUtil$Scope(String, int)>
	//   11   23:putstatic       #26  <Field ActionUtil$Scope CONTEXT>
		SYSTEM = new ActionUtil$Scope("SYSTEM", 2);
	//   12   26:new             #2   <Class ActionUtil$Scope>
	//   13   29:dup             
	//   14   30:ldc1            #27  <String "SYSTEM">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #21  <Method void ActionUtil$Scope(String, int)>
	//   17   36:putstatic       #29  <Field ActionUtil$Scope SYSTEM>
		$VALUES = (new ActionUtil$Scope[] {
			LOCAL, CONTEXT, SYSTEM
		});
	//   18   39:iconst_3        
	//   19   40:anewarray       ActionUtil$Scope[]
	//   20   43:dup             
	//   21   44:iconst_0        
	//   22   45:getstatic       #23  <Field ActionUtil$Scope LOCAL>
	//   23   48:aastore         
	//   24   49:dup             
	//   25   50:iconst_1        
	//   26   51:getstatic       #26  <Field ActionUtil$Scope CONTEXT>
	//   27   54:aastore         
	//   28   55:dup             
	//   29   56:iconst_2        
	//   30   57:getstatic       #29  <Field ActionUtil$Scope SYSTEM>
	//   31   60:aastore         
	//   32   61:putstatic       #31  <Field ActionUtil$Scope[] $VALUES>
	//*  33   64:return          
	}

	private ActionUtil$Scope(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #33  <Method void Enum(String, int)>
	//    4    6:return          
	}
}
