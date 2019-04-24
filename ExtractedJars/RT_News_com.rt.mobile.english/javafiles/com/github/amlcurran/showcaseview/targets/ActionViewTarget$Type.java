// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.amlcurran.showcaseview.targets;


// Referenced classes of package com.github.amlcurran.showcaseview.targets:
//			ActionViewTarget

public static final class ActionViewTarget$Type extends Enum
{

	public static ActionViewTarget$Type valueOf(String s)
	{
		return (ActionViewTarget$Type)Enum.valueOf(com/github/amlcurran/showcaseview/targets/ActionViewTarget$Type, s);
	//    0    0:ldc1            #2   <Class ActionViewTarget$Type>
	//    1    2:aload_0         
	//    2    3:invokestatic    #43  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class ActionViewTarget$Type>
	//    4    9:areturn         
	}

	public static ActionViewTarget$Type[] values()
	{
		return (ActionViewTarget$Type[])((ActionViewTarget$Type []) ($VALUES)).clone();
	//    0    0:getstatic       #35  <Field ActionViewTarget$Type[] $VALUES>
	//    1    3:invokevirtual   #50  <Method Object _5B_Lcom.github.amlcurran.showcaseview.targets.ActionViewTarget$Type_3B_.clone()>
	//    2    6:checkcast       #46  <Class ActionViewTarget$Type[]>
	//    3    9:areturn         
	}

	private static final ActionViewTarget$Type $VALUES[];
	public static final ActionViewTarget$Type HOME;
	public static final ActionViewTarget$Type OVERFLOW;
	public static final ActionViewTarget$Type SPINNER;
	public static final ActionViewTarget$Type TITLE;

	static 
	{
		SPINNER = new ActionViewTarget$Type("SPINNER", 0);
	//    0    0:new             #2   <Class ActionViewTarget$Type>
	//    1    3:dup             
	//    2    4:ldc1            #18  <String "SPINNER">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #22  <Method void ActionViewTarget$Type(String, int)>
	//    5   10:putstatic       #24  <Field ActionViewTarget$Type SPINNER>
		HOME = new ActionViewTarget$Type("HOME", 1);
	//    6   13:new             #2   <Class ActionViewTarget$Type>
	//    7   16:dup             
	//    8   17:ldc1            #25  <String "HOME">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #22  <Method void ActionViewTarget$Type(String, int)>
	//   11   23:putstatic       #27  <Field ActionViewTarget$Type HOME>
		TITLE = new ActionViewTarget$Type("TITLE", 2);
	//   12   26:new             #2   <Class ActionViewTarget$Type>
	//   13   29:dup             
	//   14   30:ldc1            #28  <String "TITLE">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #22  <Method void ActionViewTarget$Type(String, int)>
	//   17   36:putstatic       #30  <Field ActionViewTarget$Type TITLE>
		OVERFLOW = new ActionViewTarget$Type("OVERFLOW", 3);
	//   18   39:new             #2   <Class ActionViewTarget$Type>
	//   19   42:dup             
	//   20   43:ldc1            #31  <String "OVERFLOW">
	//   21   45:iconst_3        
	//   22   46:invokespecial   #22  <Method void ActionViewTarget$Type(String, int)>
	//   23   49:putstatic       #33  <Field ActionViewTarget$Type OVERFLOW>
		$VALUES = (new ActionViewTarget$Type[] {
			SPINNER, HOME, TITLE, OVERFLOW
		});
	//   24   52:iconst_4        
	//   25   53:anewarray       ActionViewTarget$Type[]
	//   26   56:dup             
	//   27   57:iconst_0        
	//   28   58:getstatic       #24  <Field ActionViewTarget$Type SPINNER>
	//   29   61:aastore         
	//   30   62:dup             
	//   31   63:iconst_1        
	//   32   64:getstatic       #27  <Field ActionViewTarget$Type HOME>
	//   33   67:aastore         
	//   34   68:dup             
	//   35   69:iconst_2        
	//   36   70:getstatic       #30  <Field ActionViewTarget$Type TITLE>
	//   37   73:aastore         
	//   38   74:dup             
	//   39   75:iconst_3        
	//   40   76:getstatic       #33  <Field ActionViewTarget$Type OVERFLOW>
	//   41   79:aastore         
	//   42   80:putstatic       #35  <Field ActionViewTarget$Type[] $VALUES>
	//*  43   83:return          
	}

	private ActionViewTarget$Type(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #37  <Method void Enum(String, int)>
	//    4    6:return          
	}
}
