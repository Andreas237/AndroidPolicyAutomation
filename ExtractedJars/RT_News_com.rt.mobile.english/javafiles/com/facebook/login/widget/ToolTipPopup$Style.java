// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.login.widget;


// Referenced classes of package com.facebook.login.widget:
//			ToolTipPopup

public static final class ToolTipPopup$Style extends Enum
{

	public static ToolTipPopup$Style valueOf(String s)
	{
		return (ToolTipPopup$Style)Enum.valueOf(com/facebook/login/widget/ToolTipPopup$Style, s);
	//    0    0:ldc1            #2   <Class ToolTipPopup$Style>
	//    1    2:aload_0         
	//    2    3:invokestatic    #35  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class ToolTipPopup$Style>
	//    4    9:areturn         
	}

	public static ToolTipPopup$Style[] values()
	{
		return (ToolTipPopup$Style[])((ToolTipPopup$Style []) ($VALUES)).clone();
	//    0    0:getstatic       #27  <Field ToolTipPopup$Style[] $VALUES>
	//    1    3:invokevirtual   #42  <Method Object _5B_Lcom.facebook.login.widget.ToolTipPopup$Style_3B_.clone()>
	//    2    6:checkcast       #38  <Class ToolTipPopup$Style[]>
	//    3    9:areturn         
	}

	private static final ToolTipPopup$Style $VALUES[];
	public static final ToolTipPopup$Style BLACK;
	public static final ToolTipPopup$Style BLUE;

	static 
	{
		BLUE = new ToolTipPopup$Style("BLUE", 0);
	//    0    0:new             #2   <Class ToolTipPopup$Style>
	//    1    3:dup             
	//    2    4:ldc1            #16  <String "BLUE">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #20  <Method void ToolTipPopup$Style(String, int)>
	//    5   10:putstatic       #22  <Field ToolTipPopup$Style BLUE>
		BLACK = new ToolTipPopup$Style("BLACK", 1);
	//    6   13:new             #2   <Class ToolTipPopup$Style>
	//    7   16:dup             
	//    8   17:ldc1            #23  <String "BLACK">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #20  <Method void ToolTipPopup$Style(String, int)>
	//   11   23:putstatic       #25  <Field ToolTipPopup$Style BLACK>
		$VALUES = (new ToolTipPopup$Style[] {
			BLUE, BLACK
		});
	//   12   26:iconst_2        
	//   13   27:anewarray       ToolTipPopup$Style[]
	//   14   30:dup             
	//   15   31:iconst_0        
	//   16   32:getstatic       #22  <Field ToolTipPopup$Style BLUE>
	//   17   35:aastore         
	//   18   36:dup             
	//   19   37:iconst_1        
	//   20   38:getstatic       #25  <Field ToolTipPopup$Style BLACK>
	//   21   41:aastore         
	//   22   42:putstatic       #27  <Field ToolTipPopup$Style[] $VALUES>
	//*  23   45:return          
	}

	private ToolTipPopup$Style(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #29  <Method void Enum(String, int)>
	//    4    6:return          
	}
}
