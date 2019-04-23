// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.login.widget;


// Referenced classes of package com.facebook.login.widget:
//			LoginButton

public static final class LoginButton$ToolTipMode extends Enum
{

	public static LoginButton$ToolTipMode fromInt(int i)
	{
		LoginButton$ToolTipMode aloginbutton$tooltipmode[] = values();
	//    0    0:invokestatic    #59  <Method LoginButton$ToolTipMode[] values()>
	//    1    3:astore_3        
		int k = aloginbutton$tooltipmode.length;
	//    2    4:aload_3         
	//    3    5:arraylength     
	//    4    6:istore_2        
		for(int j = 0; j < k; j++)
	//*   5    7:iconst_0        
	//*   6    8:istore_1        
	//*   7    9:iload_1         
	//*   8   10:iload_2         
	//*   9   11:icmpge          38
		{
			LoginButton$ToolTipMode loginbutton$tooltipmode = aloginbutton$tooltipmode[j];
	//   10   14:aload_3         
	//   11   15:iload_1         
	//   12   16:aaload          
	//   13   17:astore          4
			if(loginbutton$tooltipmode.getValue() == i)
	//*  14   19:aload           4
	//*  15   21:invokevirtual   #63  <Method int getValue()>
	//*  16   24:iload_0         
	//*  17   25:icmpne          31
				return loginbutton$tooltipmode;
	//   18   28:aload           4
	//   19   30:areturn         
		}

	//   20   31:iload_1         
	//   21   32:iconst_1        
	//   22   33:iadd            
	//   23   34:istore_1        
	//*  24   35:goto            9
		return null;
	//   25   38:aconst_null     
	//   26   39:areturn         
	}

	public static LoginButton$ToolTipMode valueOf(String s)
	{
		return (LoginButton$ToolTipMode)Enum.valueOf(com/facebook/login/widget/LoginButton$ToolTipMode, s);
	//    0    0:ldc1            #2   <Class LoginButton$ToolTipMode>
	//    1    2:aload_0         
	//    2    3:invokestatic    #68  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class LoginButton$ToolTipMode>
	//    4    9:areturn         
	}

	public static LoginButton$ToolTipMode[] values()
	{
		return (LoginButton$ToolTipMode[])((LoginButton$ToolTipMode []) ($VALUES)).clone();
	//    0    0:getstatic       #42  <Field LoginButton$ToolTipMode[] $VALUES>
	//    1    3:invokevirtual   #73  <Method Object _5B_Lcom.facebook.login.widget.LoginButton$ToolTipMode_3B_.clone()>
	//    2    6:checkcast       #69  <Class LoginButton$ToolTipMode[]>
	//    3    9:areturn         
	}

	public int getValue()
	{
		return intValue;
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field int intValue>
	//    2    4:ireturn         
	}

	public String toString()
	{
		return stringValue;
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field String stringValue>
	//    2    4:areturn         
	}

	private static final LoginButton$ToolTipMode $VALUES[];
	public static final LoginButton$ToolTipMode AUTOMATIC;
	public static LoginButton$ToolTipMode DEFAULT;
	public static final LoginButton$ToolTipMode DISPLAY_ALWAYS;
	public static final LoginButton$ToolTipMode NEVER_DISPLAY;
	private int intValue;
	private String stringValue;

	static 
	{
		AUTOMATIC = new LoginButton$ToolTipMode("AUTOMATIC", 0, "automatic", 0);
	//    0    0:new             #2   <Class LoginButton$ToolTipMode>
	//    1    3:dup             
	//    2    4:ldc1            #22  <String "AUTOMATIC">
	//    3    6:iconst_0        
	//    4    7:ldc1            #24  <String "automatic">
	//    5    9:iconst_0        
	//    6   10:invokespecial   #28  <Method void LoginButton$ToolTipMode(String, int, String, int)>
	//    7   13:putstatic       #30  <Field LoginButton$ToolTipMode AUTOMATIC>
		DISPLAY_ALWAYS = new LoginButton$ToolTipMode("DISPLAY_ALWAYS", 1, "display_always", 1);
	//    8   16:new             #2   <Class LoginButton$ToolTipMode>
	//    9   19:dup             
	//   10   20:ldc1            #31  <String "DISPLAY_ALWAYS">
	//   11   22:iconst_1        
	//   12   23:ldc1            #33  <String "display_always">
	//   13   25:iconst_1        
	//   14   26:invokespecial   #28  <Method void LoginButton$ToolTipMode(String, int, String, int)>
	//   15   29:putstatic       #35  <Field LoginButton$ToolTipMode DISPLAY_ALWAYS>
		NEVER_DISPLAY = new LoginButton$ToolTipMode("NEVER_DISPLAY", 2, "never_display", 2);
	//   16   32:new             #2   <Class LoginButton$ToolTipMode>
	//   17   35:dup             
	//   18   36:ldc1            #36  <String "NEVER_DISPLAY">
	//   19   38:iconst_2        
	//   20   39:ldc1            #38  <String "never_display">
	//   21   41:iconst_2        
	//   22   42:invokespecial   #28  <Method void LoginButton$ToolTipMode(String, int, String, int)>
	//   23   45:putstatic       #40  <Field LoginButton$ToolTipMode NEVER_DISPLAY>
		LoginButton$ToolTipMode loginbutton$tooltipmode = AUTOMATIC;
	//   24   48:getstatic       #30  <Field LoginButton$ToolTipMode AUTOMATIC>
	//   25   51:astore_0        
		$VALUES = (new LoginButton$ToolTipMode[] {
			loginbutton$tooltipmode, DISPLAY_ALWAYS, NEVER_DISPLAY
		});
	//   26   52:iconst_3        
	//   27   53:anewarray       LoginButton$ToolTipMode[]
	//   28   56:dup             
	//   29   57:iconst_0        
	//   30   58:aload_0         
	//   31   59:aastore         
	//   32   60:dup             
	//   33   61:iconst_1        
	//   34   62:getstatic       #35  <Field LoginButton$ToolTipMode DISPLAY_ALWAYS>
	//   35   65:aastore         
	//   36   66:dup             
	//   37   67:iconst_2        
	//   38   68:getstatic       #40  <Field LoginButton$ToolTipMode NEVER_DISPLAY>
	//   39   71:aastore         
	//   40   72:putstatic       #42  <Field LoginButton$ToolTipMode[] $VALUES>
		DEFAULT = loginbutton$tooltipmode;
	//   41   75:aload_0         
	//   42   76:putstatic       #44  <Field LoginButton$ToolTipMode DEFAULT>
	//*  43   79:return          
	}

	private LoginButton$ToolTipMode(String s, int i, String s1, int j)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #48  <Method void Enum(String, int)>
		stringValue = s1;
	//    4    6:aload_0         
	//    5    7:aload_3         
	//    6    8:putfield        #50  <Field String stringValue>
		intValue = j;
	//    7   11:aload_0         
	//    8   12:iload           4
	//    9   14:putfield        #52  <Field int intValue>
	//   10   17:return          
	}
}
