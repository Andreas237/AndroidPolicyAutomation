// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text;


// Referenced classes of package com.itextpdf.text:
//			Font

public static final class Font$FontFamily extends Enum
{

	public static Font$FontFamily valueOf(String s)
	{
		return (Font$FontFamily)Enum.valueOf(com/itextpdf/text/Font$FontFamily, s);
	//    0    0:ldc1            #2   <Class Font$FontFamily>
	//    1    2:aload_0         
	//    2    3:invokestatic    #51  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class Font$FontFamily>
	//    4    9:areturn         
	}

	public static Font$FontFamily[] values()
	{
		return (Font$FontFamily[])((Font$FontFamily []) ($VALUES)).clone();
	//    0    0:getstatic       #43  <Field Font$FontFamily[] $VALUES>
	//    1    3:invokevirtual   #58  <Method Object _5B_Lcom.itextpdf.text.Font$FontFamily_3B_.clone()>
	//    2    6:checkcast       #54  <Class Font$FontFamily[]>
	//    3    9:areturn         
	}

	private static final Font$FontFamily $VALUES[];
	public static final Font$FontFamily COURIER;
	public static final Font$FontFamily HELVETICA;
	public static final Font$FontFamily SYMBOL;
	public static final Font$FontFamily TIMES_ROMAN;
	public static final Font$FontFamily UNDEFINED;
	public static final Font$FontFamily ZAPFDINGBATS;

	static 
	{
		COURIER = new Font$FontFamily("COURIER", 0);
	//    0    0:new             #2   <Class Font$FontFamily>
	//    1    3:dup             
	//    2    4:ldc1            #20  <String "COURIER">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #24  <Method void Font$FontFamily(String, int)>
	//    5   10:putstatic       #26  <Field Font$FontFamily COURIER>
		HELVETICA = new Font$FontFamily("HELVETICA", 1);
	//    6   13:new             #2   <Class Font$FontFamily>
	//    7   16:dup             
	//    8   17:ldc1            #27  <String "HELVETICA">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #24  <Method void Font$FontFamily(String, int)>
	//   11   23:putstatic       #29  <Field Font$FontFamily HELVETICA>
		TIMES_ROMAN = new Font$FontFamily("TIMES_ROMAN", 2);
	//   12   26:new             #2   <Class Font$FontFamily>
	//   13   29:dup             
	//   14   30:ldc1            #30  <String "TIMES_ROMAN">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #24  <Method void Font$FontFamily(String, int)>
	//   17   36:putstatic       #32  <Field Font$FontFamily TIMES_ROMAN>
		SYMBOL = new Font$FontFamily("SYMBOL", 3);
	//   18   39:new             #2   <Class Font$FontFamily>
	//   19   42:dup             
	//   20   43:ldc1            #33  <String "SYMBOL">
	//   21   45:iconst_3        
	//   22   46:invokespecial   #24  <Method void Font$FontFamily(String, int)>
	//   23   49:putstatic       #35  <Field Font$FontFamily SYMBOL>
		ZAPFDINGBATS = new Font$FontFamily("ZAPFDINGBATS", 4);
	//   24   52:new             #2   <Class Font$FontFamily>
	//   25   55:dup             
	//   26   56:ldc1            #36  <String "ZAPFDINGBATS">
	//   27   58:iconst_4        
	//   28   59:invokespecial   #24  <Method void Font$FontFamily(String, int)>
	//   29   62:putstatic       #38  <Field Font$FontFamily ZAPFDINGBATS>
		UNDEFINED = new Font$FontFamily("UNDEFINED", 5);
	//   30   65:new             #2   <Class Font$FontFamily>
	//   31   68:dup             
	//   32   69:ldc1            #39  <String "UNDEFINED">
	//   33   71:iconst_5        
	//   34   72:invokespecial   #24  <Method void Font$FontFamily(String, int)>
	//   35   75:putstatic       #41  <Field Font$FontFamily UNDEFINED>
		$VALUES = (new Font$FontFamily[] {
			COURIER, HELVETICA, TIMES_ROMAN, SYMBOL, ZAPFDINGBATS, UNDEFINED
		});
	//   36   78:bipush          6
	//   37   80:anewarray       Font$FontFamily[]
	//   38   83:dup             
	//   39   84:iconst_0        
	//   40   85:getstatic       #26  <Field Font$FontFamily COURIER>
	//   41   88:aastore         
	//   42   89:dup             
	//   43   90:iconst_1        
	//   44   91:getstatic       #29  <Field Font$FontFamily HELVETICA>
	//   45   94:aastore         
	//   46   95:dup             
	//   47   96:iconst_2        
	//   48   97:getstatic       #32  <Field Font$FontFamily TIMES_ROMAN>
	//   49  100:aastore         
	//   50  101:dup             
	//   51  102:iconst_3        
	//   52  103:getstatic       #35  <Field Font$FontFamily SYMBOL>
	//   53  106:aastore         
	//   54  107:dup             
	//   55  108:iconst_4        
	//   56  109:getstatic       #38  <Field Font$FontFamily ZAPFDINGBATS>
	//   57  112:aastore         
	//   58  113:dup             
	//   59  114:iconst_5        
	//   60  115:getstatic       #41  <Field Font$FontFamily UNDEFINED>
	//   61  118:aastore         
	//   62  119:putstatic       #43  <Field Font$FontFamily[] $VALUES>
	//*  63  122:return          
	}

	private Font$FontFamily(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #45  <Method void Enum(String, int)>
	//    4    6:return          
	}
}
