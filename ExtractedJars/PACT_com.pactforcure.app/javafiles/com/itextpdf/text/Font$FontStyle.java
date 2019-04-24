// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text;


// Referenced classes of package com.itextpdf.text:
//			Font

public static final class Font$FontStyle extends Enum
{

	public static Font$FontStyle valueOf(String s)
	{
		return (Font$FontStyle)Enum.valueOf(com/itextpdf/text/Font$FontStyle, s);
	//    0    0:ldc1            #2   <Class Font$FontStyle>
	//    1    2:aload_0         
	//    2    3:invokestatic    #70  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class Font$FontStyle>
	//    4    9:areturn         
	}

	public static Font$FontStyle[] values()
	{
		return (Font$FontStyle[])((Font$FontStyle []) ($VALUES)).clone();
	//    0    0:getstatic       #57  <Field Font$FontStyle[] $VALUES>
	//    1    3:invokevirtual   #77  <Method Object _5B_Lcom.itextpdf.text.Font$FontStyle_3B_.clone()>
	//    2    6:checkcast       #73  <Class Font$FontStyle[]>
	//    3    9:areturn         
	}

	public String getValue()
	{
		return code;
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field String code>
	//    2    4:areturn         
	}

	private static final Font$FontStyle $VALUES[];
	public static final Font$FontStyle BOLD;
	public static final Font$FontStyle ITALIC;
	public static final Font$FontStyle LINETHROUGH;
	public static final Font$FontStyle NORMAL;
	public static final Font$FontStyle OBLIQUE;
	public static final Font$FontStyle UNDERLINE;
	private String code;

	static 
	{
		NORMAL = new Font$FontStyle("NORMAL", 0, "normal");
	//    0    0:new             #2   <Class Font$FontStyle>
	//    1    3:dup             
	//    2    4:ldc1            #22  <String "NORMAL">
	//    3    6:iconst_0        
	//    4    7:ldc1            #24  <String "normal">
	//    5    9:invokespecial   #28  <Method void Font$FontStyle(String, int, String)>
	//    6   12:putstatic       #30  <Field Font$FontStyle NORMAL>
		BOLD = new Font$FontStyle("BOLD", 1, "bold");
	//    7   15:new             #2   <Class Font$FontStyle>
	//    8   18:dup             
	//    9   19:ldc1            #31  <String "BOLD">
	//   10   21:iconst_1        
	//   11   22:ldc1            #33  <String "bold">
	//   12   24:invokespecial   #28  <Method void Font$FontStyle(String, int, String)>
	//   13   27:putstatic       #35  <Field Font$FontStyle BOLD>
		ITALIC = new Font$FontStyle("ITALIC", 2, "italic");
	//   14   30:new             #2   <Class Font$FontStyle>
	//   15   33:dup             
	//   16   34:ldc1            #36  <String "ITALIC">
	//   17   36:iconst_2        
	//   18   37:ldc1            #38  <String "italic">
	//   19   39:invokespecial   #28  <Method void Font$FontStyle(String, int, String)>
	//   20   42:putstatic       #40  <Field Font$FontStyle ITALIC>
		OBLIQUE = new Font$FontStyle("OBLIQUE", 3, "oblique");
	//   21   45:new             #2   <Class Font$FontStyle>
	//   22   48:dup             
	//   23   49:ldc1            #41  <String "OBLIQUE">
	//   24   51:iconst_3        
	//   25   52:ldc1            #43  <String "oblique">
	//   26   54:invokespecial   #28  <Method void Font$FontStyle(String, int, String)>
	//   27   57:putstatic       #45  <Field Font$FontStyle OBLIQUE>
		UNDERLINE = new Font$FontStyle("UNDERLINE", 4, "underline");
	//   28   60:new             #2   <Class Font$FontStyle>
	//   29   63:dup             
	//   30   64:ldc1            #46  <String "UNDERLINE">
	//   31   66:iconst_4        
	//   32   67:ldc1            #48  <String "underline">
	//   33   69:invokespecial   #28  <Method void Font$FontStyle(String, int, String)>
	//   34   72:putstatic       #50  <Field Font$FontStyle UNDERLINE>
		LINETHROUGH = new Font$FontStyle("LINETHROUGH", 5, "line-through");
	//   35   75:new             #2   <Class Font$FontStyle>
	//   36   78:dup             
	//   37   79:ldc1            #51  <String "LINETHROUGH">
	//   38   81:iconst_5        
	//   39   82:ldc1            #53  <String "line-through">
	//   40   84:invokespecial   #28  <Method void Font$FontStyle(String, int, String)>
	//   41   87:putstatic       #55  <Field Font$FontStyle LINETHROUGH>
		$VALUES = (new Font$FontStyle[] {
			NORMAL, BOLD, ITALIC, OBLIQUE, UNDERLINE, LINETHROUGH
		});
	//   42   90:bipush          6
	//   43   92:anewarray       Font$FontStyle[]
	//   44   95:dup             
	//   45   96:iconst_0        
	//   46   97:getstatic       #30  <Field Font$FontStyle NORMAL>
	//   47  100:aastore         
	//   48  101:dup             
	//   49  102:iconst_1        
	//   50  103:getstatic       #35  <Field Font$FontStyle BOLD>
	//   51  106:aastore         
	//   52  107:dup             
	//   53  108:iconst_2        
	//   54  109:getstatic       #40  <Field Font$FontStyle ITALIC>
	//   55  112:aastore         
	//   56  113:dup             
	//   57  114:iconst_3        
	//   58  115:getstatic       #45  <Field Font$FontStyle OBLIQUE>
	//   59  118:aastore         
	//   60  119:dup             
	//   61  120:iconst_4        
	//   62  121:getstatic       #50  <Field Font$FontStyle UNDERLINE>
	//   63  124:aastore         
	//   64  125:dup             
	//   65  126:iconst_5        
	//   66  127:getstatic       #55  <Field Font$FontStyle LINETHROUGH>
	//   67  130:aastore         
	//   68  131:putstatic       #57  <Field Font$FontStyle[] $VALUES>
	//*  69  134:return          
	}

	private Font$FontStyle(String s, int i, String s1)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #61  <Method void Enum(String, int)>
		code = s1;
	//    4    6:aload_0         
	//    5    7:aload_3         
	//    6    8:putfield        #63  <Field String code>
	//    7   11:return          
	}
}
