// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text;


// Referenced classes of package com.itextpdf.text:
//			TabStop

public static final class TabStop$Alignment extends Enum
{

	public static TabStop$Alignment valueOf(String s)
	{
		return (TabStop$Alignment)Enum.valueOf(com/itextpdf/text/TabStop$Alignment, s);
	//    0    0:ldc1            #2   <Class TabStop$Alignment>
	//    1    2:aload_0         
	//    2    3:invokestatic    #43  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class TabStop$Alignment>
	//    4    9:areturn         
	}

	public static TabStop$Alignment[] values()
	{
		return (TabStop$Alignment[])((TabStop$Alignment []) ($VALUES)).clone();
	//    0    0:getstatic       #35  <Field TabStop$Alignment[] $VALUES>
	//    1    3:invokevirtual   #50  <Method Object _5B_Lcom.itextpdf.text.TabStop$Alignment_3B_.clone()>
	//    2    6:checkcast       #46  <Class TabStop$Alignment[]>
	//    3    9:areturn         
	}

	private static final TabStop$Alignment $VALUES[];
	public static final TabStop$Alignment ANCHOR;
	public static final TabStop$Alignment CENTER;
	public static final TabStop$Alignment LEFT;
	public static final TabStop$Alignment RIGHT;

	static 
	{
		LEFT = new TabStop$Alignment("LEFT", 0);
	//    0    0:new             #2   <Class TabStop$Alignment>
	//    1    3:dup             
	//    2    4:ldc1            #18  <String "LEFT">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #22  <Method void TabStop$Alignment(String, int)>
	//    5   10:putstatic       #24  <Field TabStop$Alignment LEFT>
		RIGHT = new TabStop$Alignment("RIGHT", 1);
	//    6   13:new             #2   <Class TabStop$Alignment>
	//    7   16:dup             
	//    8   17:ldc1            #25  <String "RIGHT">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #22  <Method void TabStop$Alignment(String, int)>
	//   11   23:putstatic       #27  <Field TabStop$Alignment RIGHT>
		CENTER = new TabStop$Alignment("CENTER", 2);
	//   12   26:new             #2   <Class TabStop$Alignment>
	//   13   29:dup             
	//   14   30:ldc1            #28  <String "CENTER">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #22  <Method void TabStop$Alignment(String, int)>
	//   17   36:putstatic       #30  <Field TabStop$Alignment CENTER>
		ANCHOR = new TabStop$Alignment("ANCHOR", 3);
	//   18   39:new             #2   <Class TabStop$Alignment>
	//   19   42:dup             
	//   20   43:ldc1            #31  <String "ANCHOR">
	//   21   45:iconst_3        
	//   22   46:invokespecial   #22  <Method void TabStop$Alignment(String, int)>
	//   23   49:putstatic       #33  <Field TabStop$Alignment ANCHOR>
		$VALUES = (new TabStop$Alignment[] {
			LEFT, RIGHT, CENTER, ANCHOR
		});
	//   24   52:iconst_4        
	//   25   53:anewarray       TabStop$Alignment[]
	//   26   56:dup             
	//   27   57:iconst_0        
	//   28   58:getstatic       #24  <Field TabStop$Alignment LEFT>
	//   29   61:aastore         
	//   30   62:dup             
	//   31   63:iconst_1        
	//   32   64:getstatic       #27  <Field TabStop$Alignment RIGHT>
	//   33   67:aastore         
	//   34   68:dup             
	//   35   69:iconst_2        
	//   36   70:getstatic       #30  <Field TabStop$Alignment CENTER>
	//   37   73:aastore         
	//   38   74:dup             
	//   39   75:iconst_3        
	//   40   76:getstatic       #33  <Field TabStop$Alignment ANCHOR>
	//   41   79:aastore         
	//   42   80:putstatic       #35  <Field TabStop$Alignment[] $VALUES>
	//*  43   83:return          
	}

	private TabStop$Alignment(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #37  <Method void Enum(String, int)>
	//    4    6:return          
	}
}
