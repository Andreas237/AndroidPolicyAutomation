// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text;

import com.itextpdf.text.pdf.BaseFont;

// Referenced classes of package com.itextpdf.text:
//			BaseColor, FontFactory, ExceptionConverter

public class Font
	implements Comparable
{
	public static final class FontFamily extends Enum
	{

		public static FontFamily valueOf(String s)
		{
			return (FontFamily)Enum.valueOf(com/itextpdf/text/Font$FontFamily, s);
		//    0    0:ldc1            #2   <Class Font$FontFamily>
		//    1    2:aload_0         
		//    2    3:invokestatic    #51  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class Font$FontFamily>
		//    4    9:areturn         
		}

		public static FontFamily[] values()
		{
			return (FontFamily[])((FontFamily []) ($VALUES)).clone();
		//    0    0:getstatic       #43  <Field Font$FontFamily[] $VALUES>
		//    1    3:invokevirtual   #58  <Method Object _5B_Lcom.itextpdf.text.Font$FontFamily_3B_.clone()>
		//    2    6:checkcast       #54  <Class Font$FontFamily[]>
		//    3    9:areturn         
		}

		private static final FontFamily $VALUES[];
		public static final FontFamily COURIER;
		public static final FontFamily HELVETICA;
		public static final FontFamily SYMBOL;
		public static final FontFamily TIMES_ROMAN;
		public static final FontFamily UNDEFINED;
		public static final FontFamily ZAPFDINGBATS;

		static 
		{
			COURIER = new FontFamily("COURIER", 0);
		//    0    0:new             #2   <Class Font$FontFamily>
		//    1    3:dup             
		//    2    4:ldc1            #20  <String "COURIER">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #24  <Method void Font$FontFamily(String, int)>
		//    5   10:putstatic       #26  <Field Font$FontFamily COURIER>
			HELVETICA = new FontFamily("HELVETICA", 1);
		//    6   13:new             #2   <Class Font$FontFamily>
		//    7   16:dup             
		//    8   17:ldc1            #27  <String "HELVETICA">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #24  <Method void Font$FontFamily(String, int)>
		//   11   23:putstatic       #29  <Field Font$FontFamily HELVETICA>
			TIMES_ROMAN = new FontFamily("TIMES_ROMAN", 2);
		//   12   26:new             #2   <Class Font$FontFamily>
		//   13   29:dup             
		//   14   30:ldc1            #30  <String "TIMES_ROMAN">
		//   15   32:iconst_2        
		//   16   33:invokespecial   #24  <Method void Font$FontFamily(String, int)>
		//   17   36:putstatic       #32  <Field Font$FontFamily TIMES_ROMAN>
			SYMBOL = new FontFamily("SYMBOL", 3);
		//   18   39:new             #2   <Class Font$FontFamily>
		//   19   42:dup             
		//   20   43:ldc1            #33  <String "SYMBOL">
		//   21   45:iconst_3        
		//   22   46:invokespecial   #24  <Method void Font$FontFamily(String, int)>
		//   23   49:putstatic       #35  <Field Font$FontFamily SYMBOL>
			ZAPFDINGBATS = new FontFamily("ZAPFDINGBATS", 4);
		//   24   52:new             #2   <Class Font$FontFamily>
		//   25   55:dup             
		//   26   56:ldc1            #36  <String "ZAPFDINGBATS">
		//   27   58:iconst_4        
		//   28   59:invokespecial   #24  <Method void Font$FontFamily(String, int)>
		//   29   62:putstatic       #38  <Field Font$FontFamily ZAPFDINGBATS>
			UNDEFINED = new FontFamily("UNDEFINED", 5);
		//   30   65:new             #2   <Class Font$FontFamily>
		//   31   68:dup             
		//   32   69:ldc1            #39  <String "UNDEFINED">
		//   33   71:iconst_5        
		//   34   72:invokespecial   #24  <Method void Font$FontFamily(String, int)>
		//   35   75:putstatic       #41  <Field Font$FontFamily UNDEFINED>
			$VALUES = (new FontFamily[] {
				COURIER, HELVETICA, TIMES_ROMAN, SYMBOL, ZAPFDINGBATS, UNDEFINED
			});
		//   36   78:bipush          6
		//   37   80:anewarray       FontFamily[]
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

		private FontFamily(String s, int i)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #45  <Method void Enum(String, int)>
		//    4    6:return          
		}
	}

	public static final class FontStyle extends Enum
	{

		public static FontStyle valueOf(String s)
		{
			return (FontStyle)Enum.valueOf(com/itextpdf/text/Font$FontStyle, s);
		//    0    0:ldc1            #2   <Class Font$FontStyle>
		//    1    2:aload_0         
		//    2    3:invokestatic    #70  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class Font$FontStyle>
		//    4    9:areturn         
		}

		public static FontStyle[] values()
		{
			return (FontStyle[])((FontStyle []) ($VALUES)).clone();
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

		private static final FontStyle $VALUES[];
		public static final FontStyle BOLD;
		public static final FontStyle ITALIC;
		public static final FontStyle LINETHROUGH;
		public static final FontStyle NORMAL;
		public static final FontStyle OBLIQUE;
		public static final FontStyle UNDERLINE;
		private String code;

		static 
		{
			NORMAL = new FontStyle("NORMAL", 0, "normal");
		//    0    0:new             #2   <Class Font$FontStyle>
		//    1    3:dup             
		//    2    4:ldc1            #22  <String "NORMAL">
		//    3    6:iconst_0        
		//    4    7:ldc1            #24  <String "normal">
		//    5    9:invokespecial   #28  <Method void Font$FontStyle(String, int, String)>
		//    6   12:putstatic       #30  <Field Font$FontStyle NORMAL>
			BOLD = new FontStyle("BOLD", 1, "bold");
		//    7   15:new             #2   <Class Font$FontStyle>
		//    8   18:dup             
		//    9   19:ldc1            #31  <String "BOLD">
		//   10   21:iconst_1        
		//   11   22:ldc1            #33  <String "bold">
		//   12   24:invokespecial   #28  <Method void Font$FontStyle(String, int, String)>
		//   13   27:putstatic       #35  <Field Font$FontStyle BOLD>
			ITALIC = new FontStyle("ITALIC", 2, "italic");
		//   14   30:new             #2   <Class Font$FontStyle>
		//   15   33:dup             
		//   16   34:ldc1            #36  <String "ITALIC">
		//   17   36:iconst_2        
		//   18   37:ldc1            #38  <String "italic">
		//   19   39:invokespecial   #28  <Method void Font$FontStyle(String, int, String)>
		//   20   42:putstatic       #40  <Field Font$FontStyle ITALIC>
			OBLIQUE = new FontStyle("OBLIQUE", 3, "oblique");
		//   21   45:new             #2   <Class Font$FontStyle>
		//   22   48:dup             
		//   23   49:ldc1            #41  <String "OBLIQUE">
		//   24   51:iconst_3        
		//   25   52:ldc1            #43  <String "oblique">
		//   26   54:invokespecial   #28  <Method void Font$FontStyle(String, int, String)>
		//   27   57:putstatic       #45  <Field Font$FontStyle OBLIQUE>
			UNDERLINE = new FontStyle("UNDERLINE", 4, "underline");
		//   28   60:new             #2   <Class Font$FontStyle>
		//   29   63:dup             
		//   30   64:ldc1            #46  <String "UNDERLINE">
		//   31   66:iconst_4        
		//   32   67:ldc1            #48  <String "underline">
		//   33   69:invokespecial   #28  <Method void Font$FontStyle(String, int, String)>
		//   34   72:putstatic       #50  <Field Font$FontStyle UNDERLINE>
			LINETHROUGH = new FontStyle("LINETHROUGH", 5, "line-through");
		//   35   75:new             #2   <Class Font$FontStyle>
		//   36   78:dup             
		//   37   79:ldc1            #51  <String "LINETHROUGH">
		//   38   81:iconst_5        
		//   39   82:ldc1            #53  <String "line-through">
		//   40   84:invokespecial   #28  <Method void Font$FontStyle(String, int, String)>
		//   41   87:putstatic       #55  <Field Font$FontStyle LINETHROUGH>
			$VALUES = (new FontStyle[] {
				NORMAL, BOLD, ITALIC, OBLIQUE, UNDERLINE, LINETHROUGH
			});
		//   42   90:bipush          6
		//   43   92:anewarray       FontStyle[]
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

		private FontStyle(String s, int i, String s1)
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


	public Font()
	{
		this(FontFamily.UNDEFINED, -1F, -1, ((BaseColor) (null)));
	//    0    0:aload_0         
	//    1    1:getstatic       #45  <Field Font$FontFamily Font$FontFamily.UNDEFINED>
	//    2    4:ldc1            #46  <Float -1F>
	//    3    6:iconst_m1       
	//    4    7:aconst_null     
	//    5    8:invokespecial   #49  <Method void Font(Font$FontFamily, float, int, BaseColor)>
	//    6   11:return          
	}

	public Font(FontFamily fontfamily)
	{
		this(fontfamily, -1F, -1, ((BaseColor) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #46  <Float -1F>
	//    3    4:iconst_m1       
	//    4    5:aconst_null     
	//    5    6:invokespecial   #49  <Method void Font(Font$FontFamily, float, int, BaseColor)>
	//    6    9:return          
	}

	public Font(FontFamily fontfamily, float f)
	{
		this(fontfamily, f, -1, ((BaseColor) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:fload_2         
	//    3    3:iconst_m1       
	//    4    4:aconst_null     
	//    5    5:invokespecial   #49  <Method void Font(Font$FontFamily, float, int, BaseColor)>
	//    6    8:return          
	}

	public Font(FontFamily fontfamily, float f, int i)
	{
		this(fontfamily, f, i, ((BaseColor) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:fload_2         
	//    3    3:iload_3         
	//    4    4:aconst_null     
	//    5    5:invokespecial   #49  <Method void Font(Font$FontFamily, float, int, BaseColor)>
	//    6    8:return          
	}

	public Font(FontFamily fontfamily, float f, int i, BaseColor basecolor)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #55  <Method void Object()>
		family = FontFamily.UNDEFINED;
	//    2    4:aload_0         
	//    3    5:getstatic       #45  <Field Font$FontFamily Font$FontFamily.UNDEFINED>
	//    4    8:putfield        #57  <Field Font$FontFamily family>
		size = -1F;
	//    5   11:aload_0         
	//    6   12:ldc1            #46  <Float -1F>
	//    7   14:putfield        #59  <Field float size>
		style = -1;
	//    8   17:aload_0         
	//    9   18:iconst_m1       
	//   10   19:putfield        #61  <Field int style>
		color = null;
	//   11   22:aload_0         
	//   12   23:aconst_null     
	//   13   24:putfield        #63  <Field BaseColor color>
		baseFont = null;
	//   14   27:aload_0         
	//   15   28:aconst_null     
	//   16   29:putfield        #65  <Field BaseFont baseFont>
		family = fontfamily;
	//   17   32:aload_0         
	//   18   33:aload_1         
	//   19   34:putfield        #57  <Field Font$FontFamily family>
		size = f;
	//   20   37:aload_0         
	//   21   38:fload_2         
	//   22   39:putfield        #59  <Field float size>
		style = i;
	//   23   42:aload_0         
	//   24   43:iload_3         
	//   25   44:putfield        #61  <Field int style>
		color = basecolor;
	//   26   47:aload_0         
	//   27   48:aload           4
	//   28   50:putfield        #63  <Field BaseColor color>
	//   29   53:return          
	}

	public Font(Font font)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #55  <Method void Object()>
		family = FontFamily.UNDEFINED;
	//    2    4:aload_0         
	//    3    5:getstatic       #45  <Field Font$FontFamily Font$FontFamily.UNDEFINED>
	//    4    8:putfield        #57  <Field Font$FontFamily family>
		size = -1F;
	//    5   11:aload_0         
	//    6   12:ldc1            #46  <Float -1F>
	//    7   14:putfield        #59  <Field float size>
		style = -1;
	//    8   17:aload_0         
	//    9   18:iconst_m1       
	//   10   19:putfield        #61  <Field int style>
		color = null;
	//   11   22:aload_0         
	//   12   23:aconst_null     
	//   13   24:putfield        #63  <Field BaseColor color>
		baseFont = null;
	//   14   27:aload_0         
	//   15   28:aconst_null     
	//   16   29:putfield        #65  <Field BaseFont baseFont>
		family = font.family;
	//   17   32:aload_0         
	//   18   33:aload_1         
	//   19   34:getfield        #57  <Field Font$FontFamily family>
	//   20   37:putfield        #57  <Field Font$FontFamily family>
		size = font.size;
	//   21   40:aload_0         
	//   22   41:aload_1         
	//   23   42:getfield        #59  <Field float size>
	//   24   45:putfield        #59  <Field float size>
		style = font.style;
	//   25   48:aload_0         
	//   26   49:aload_1         
	//   27   50:getfield        #61  <Field int style>
	//   28   53:putfield        #61  <Field int style>
		color = font.color;
	//   29   56:aload_0         
	//   30   57:aload_1         
	//   31   58:getfield        #63  <Field BaseColor color>
	//   32   61:putfield        #63  <Field BaseColor color>
		baseFont = font.baseFont;
	//   33   64:aload_0         
	//   34   65:aload_1         
	//   35   66:getfield        #65  <Field BaseFont baseFont>
	//   36   69:putfield        #65  <Field BaseFont baseFont>
	//   37   72:return          
	}

	public Font(BaseFont basefont)
	{
		this(basefont, -1F, -1, ((BaseColor) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #46  <Float -1F>
	//    3    4:iconst_m1       
	//    4    5:aconst_null     
	//    5    6:invokespecial   #70  <Method void Font(BaseFont, float, int, BaseColor)>
	//    6    9:return          
	}

	public Font(BaseFont basefont, float f)
	{
		this(basefont, f, -1, ((BaseColor) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:fload_2         
	//    3    3:iconst_m1       
	//    4    4:aconst_null     
	//    5    5:invokespecial   #70  <Method void Font(BaseFont, float, int, BaseColor)>
	//    6    8:return          
	}

	public Font(BaseFont basefont, float f, int i)
	{
		this(basefont, f, i, ((BaseColor) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:fload_2         
	//    3    3:iload_3         
	//    4    4:aconst_null     
	//    5    5:invokespecial   #70  <Method void Font(BaseFont, float, int, BaseColor)>
	//    6    8:return          
	}

	public Font(BaseFont basefont, float f, int i, BaseColor basecolor)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #55  <Method void Object()>
		family = FontFamily.UNDEFINED;
	//    2    4:aload_0         
	//    3    5:getstatic       #45  <Field Font$FontFamily Font$FontFamily.UNDEFINED>
	//    4    8:putfield        #57  <Field Font$FontFamily family>
		size = -1F;
	//    5   11:aload_0         
	//    6   12:ldc1            #46  <Float -1F>
	//    7   14:putfield        #59  <Field float size>
		style = -1;
	//    8   17:aload_0         
	//    9   18:iconst_m1       
	//   10   19:putfield        #61  <Field int style>
		color = null;
	//   11   22:aload_0         
	//   12   23:aconst_null     
	//   13   24:putfield        #63  <Field BaseColor color>
		baseFont = null;
	//   14   27:aload_0         
	//   15   28:aconst_null     
	//   16   29:putfield        #65  <Field BaseFont baseFont>
		baseFont = basefont;
	//   17   32:aload_0         
	//   18   33:aload_1         
	//   19   34:putfield        #65  <Field BaseFont baseFont>
		size = f;
	//   20   37:aload_0         
	//   21   38:fload_2         
	//   22   39:putfield        #59  <Field float size>
		style = i;
	//   23   42:aload_0         
	//   24   43:iload_3         
	//   25   44:putfield        #61  <Field int style>
		color = basecolor;
	//   26   47:aload_0         
	//   27   48:aload           4
	//   28   50:putfield        #63  <Field BaseColor color>
	//   29   53:return          
	}

	public static FontFamily getFamily(String s)
	{
		if(s.equalsIgnoreCase("Courier"))
	//*   0    0:aload_0         
	//*   1    1:ldc1            #76  <String "Courier">
	//*   2    3:invokevirtual   #82  <Method boolean String.equalsIgnoreCase(String)>
	//*   3    6:ifeq            13
			return FontFamily.COURIER;
	//    4    9:getstatic       #85  <Field Font$FontFamily Font$FontFamily.COURIER>
	//    5   12:areturn         
		if(s.equalsIgnoreCase("Helvetica"))
	//*   6   13:aload_0         
	//*   7   14:ldc1            #87  <String "Helvetica">
	//*   8   16:invokevirtual   #82  <Method boolean String.equalsIgnoreCase(String)>
	//*   9   19:ifeq            26
			return FontFamily.HELVETICA;
	//   10   22:getstatic       #90  <Field Font$FontFamily Font$FontFamily.HELVETICA>
	//   11   25:areturn         
		if(s.equalsIgnoreCase("Times-Roman"))
	//*  12   26:aload_0         
	//*  13   27:ldc1            #92  <String "Times-Roman">
	//*  14   29:invokevirtual   #82  <Method boolean String.equalsIgnoreCase(String)>
	//*  15   32:ifeq            39
			return FontFamily.TIMES_ROMAN;
	//   16   35:getstatic       #95  <Field Font$FontFamily Font$FontFamily.TIMES_ROMAN>
	//   17   38:areturn         
		if(s.equalsIgnoreCase("Symbol"))
	//*  18   39:aload_0         
	//*  19   40:ldc1            #97  <String "Symbol">
	//*  20   42:invokevirtual   #82  <Method boolean String.equalsIgnoreCase(String)>
	//*  21   45:ifeq            52
			return FontFamily.SYMBOL;
	//   22   48:getstatic       #100 <Field Font$FontFamily Font$FontFamily.SYMBOL>
	//   23   51:areturn         
		if(s.equalsIgnoreCase("ZapfDingbats"))
	//*  24   52:aload_0         
	//*  25   53:ldc1            #102 <String "ZapfDingbats">
	//*  26   55:invokevirtual   #82  <Method boolean String.equalsIgnoreCase(String)>
	//*  27   58:ifeq            65
			return FontFamily.ZAPFDINGBATS;
	//   28   61:getstatic       #105 <Field Font$FontFamily Font$FontFamily.ZAPFDINGBATS>
	//   29   64:areturn         
		else
			return FontFamily.UNDEFINED;
	//   30   65:getstatic       #45  <Field Font$FontFamily Font$FontFamily.UNDEFINED>
	//   31   68:areturn         
	}

	public static int getStyleValue(String s)
	{
		int j = 0;
	//    0    0:iconst_0        
	//    1    1:istore_2        
		if(s.indexOf(FontStyle.NORMAL.getValue()) != -1)
	//*   2    2:aload_0         
	//*   3    3:getstatic       #110 <Field Font$FontStyle Font$FontStyle.NORMAL>
	//*   4    6:invokevirtual   #114 <Method String Font$FontStyle.getValue()>
	//*   5    9:invokevirtual   #117 <Method int String.indexOf(String)>
	//*   6   12:iconst_m1       
	//*   7   13:icmpeq          20
			j = ((int) (false | false));
	//    8   16:iconst_0        
	//    9   17:iconst_0        
	//   10   18:ior             
	//   11   19:istore_2        
		int i = j;
	//   12   20:iload_2         
	//   13   21:istore_1        
		if(s.indexOf(FontStyle.BOLD.getValue()) != -1)
	//*  14   22:aload_0         
	//*  15   23:getstatic       #119 <Field Font$FontStyle Font$FontStyle.BOLD>
	//*  16   26:invokevirtual   #114 <Method String Font$FontStyle.getValue()>
	//*  17   29:invokevirtual   #117 <Method int String.indexOf(String)>
	//*  18   32:iconst_m1       
	//*  19   33:icmpeq          40
			i = ((int) (j | true));
	//   20   36:iload_2         
	//   21   37:iconst_1        
	//   22   38:ior             
	//   23   39:istore_1        
		j = i;
	//   24   40:iload_1         
	//   25   41:istore_2        
		if(s.indexOf(FontStyle.ITALIC.getValue()) != -1)
	//*  26   42:aload_0         
	//*  27   43:getstatic       #121 <Field Font$FontStyle Font$FontStyle.ITALIC>
	//*  28   46:invokevirtual   #114 <Method String Font$FontStyle.getValue()>
	//*  29   49:invokevirtual   #117 <Method int String.indexOf(String)>
	//*  30   52:iconst_m1       
	//*  31   53:icmpeq          60
			j = i | 2;
	//   32   56:iload_1         
	//   33   57:iconst_2        
	//   34   58:ior             
	//   35   59:istore_2        
		i = j;
	//   36   60:iload_2         
	//   37   61:istore_1        
		if(s.indexOf(FontStyle.OBLIQUE.getValue()) != -1)
	//*  38   62:aload_0         
	//*  39   63:getstatic       #124 <Field Font$FontStyle Font$FontStyle.OBLIQUE>
	//*  40   66:invokevirtual   #114 <Method String Font$FontStyle.getValue()>
	//*  41   69:invokevirtual   #117 <Method int String.indexOf(String)>
	//*  42   72:iconst_m1       
	//*  43   73:icmpeq          80
			i = j | 2;
	//   44   76:iload_2         
	//   45   77:iconst_2        
	//   46   78:ior             
	//   47   79:istore_1        
		j = i;
	//   48   80:iload_1         
	//   49   81:istore_2        
		if(s.indexOf(FontStyle.UNDERLINE.getValue()) != -1)
	//*  50   82:aload_0         
	//*  51   83:getstatic       #126 <Field Font$FontStyle Font$FontStyle.UNDERLINE>
	//*  52   86:invokevirtual   #114 <Method String Font$FontStyle.getValue()>
	//*  53   89:invokevirtual   #117 <Method int String.indexOf(String)>
	//*  54   92:iconst_m1       
	//*  55   93:icmpeq          100
			j = i | 4;
	//   56   96:iload_1         
	//   57   97:iconst_4        
	//   58   98:ior             
	//   59   99:istore_2        
		i = j;
	//   60  100:iload_2         
	//   61  101:istore_1        
		if(s.indexOf(FontStyle.LINETHROUGH.getValue()) != -1)
	//*  62  102:aload_0         
	//*  63  103:getstatic       #129 <Field Font$FontStyle Font$FontStyle.LINETHROUGH>
	//*  64  106:invokevirtual   #114 <Method String Font$FontStyle.getValue()>
	//*  65  109:invokevirtual   #117 <Method int String.indexOf(String)>
	//*  66  112:iconst_m1       
	//*  67  113:icmpeq          121
			i = j | 8;
	//   68  116:iload_2         
	//   69  117:bipush          8
	//   70  119:ior             
	//   71  120:istore_1        
		return i;
	//   72  121:iload_1         
	//   73  122:ireturn         
	}

	public int compareTo(Font font)
	{
		byte byte0 = 0;
	//    0    0:iconst_0        
	//    1    1:istore_2        
		if(font != null) goto _L2; else goto _L1
	//    2    2:aload_1         
	//    3    3:ifnonnull       10
_L1:
		byte0 = -1;
	//    4    6:iconst_m1       
	//    5    7:istore_2        
_L4:
		return ((int) (byte0));
	//    6    8:iload_2         
	//    7    9:ireturn         
_L2:
		if(baseFont != null && !((Object) (baseFont)).equals(((Object) (font.getBaseFont()))))
	//*   8   10:aload_0         
	//*   9   11:getfield        #65  <Field BaseFont baseFont>
	//*  10   14:ifnull          34
	//*  11   17:aload_0         
	//*  12   18:getfield        #65  <Field BaseFont baseFont>
	//*  13   21:aload_1         
	//*  14   22:invokevirtual   #137 <Method BaseFont getBaseFont()>
	//*  15   25:invokevirtual   #141 <Method boolean Object.equals(Object)>
	//*  16   28:ifne            34
			return -2;
	//   17   31:bipush          -2
	//   18   33:ireturn         
		if(family != font.getFamily())
	//*  19   34:aload_0         
	//*  20   35:getfield        #57  <Field Font$FontFamily family>
	//*  21   38:aload_1         
	//*  22   39:invokevirtual   #144 <Method Font$FontFamily getFamily()>
	//*  23   42:if_acmpeq       47
			return 1;
	//   24   45:iconst_1        
	//   25   46:ireturn         
		if(size != font.getSize())
	//*  26   47:aload_0         
	//*  27   48:getfield        #59  <Field float size>
	//*  28   51:aload_1         
	//*  29   52:invokevirtual   #148 <Method float getSize()>
	//*  30   55:fcmpl           
	//*  31   56:ifeq            61
			return 2;
	//   32   59:iconst_2        
	//   33   60:ireturn         
		if(style != font.getStyle())
	//*  34   61:aload_0         
	//*  35   62:getfield        #61  <Field int style>
	//*  36   65:aload_1         
	//*  37   66:invokevirtual   #152 <Method int getStyle()>
	//*  38   69:icmpeq          74
			return 3;
	//   39   72:iconst_3        
	//   40   73:ireturn         
		if(color == null)
	//*  41   74:aload_0         
	//*  42   75:getfield        #63  <Field BaseColor color>
	//*  43   78:ifnonnull       90
		{
			if(font.color != null)
	//*  44   81:aload_1         
	//*  45   82:getfield        #63  <Field BaseColor color>
	//*  46   85:ifnull          8
				return 4;
	//   47   88:iconst_4        
	//   48   89:ireturn         
			continue; /* Loop/switch isn't completed */
		}
		if(font.color == null)
	//*  49   90:aload_1         
	//*  50   91:getfield        #63  <Field BaseColor color>
	//*  51   94:ifnonnull       99
			return 4;
	//   52   97:iconst_4        
	//   53   98:ireturn         
		boolean flag;
		try
		{
			flag = color.equals(((Object) (font.getColor())));
	//   54   99:aload_0         
	//   55  100:getfield        #63  <Field BaseColor color>
	//   56  103:aload_1         
	//   57  104:invokevirtual   #156 <Method BaseColor getColor()>
	//   58  107:invokevirtual   #159 <Method boolean BaseColor.equals(Object)>
	//   59  110:istore_3        
		}
	//*  60  111:iload_3         
	//*  61  112:ifne            8
	//*  62  115:iconst_4        
	//*  63  116:ireturn         
		// Misplaced declaration of an exception variable
		catch(Font font)
	//*  64  117:astore_1        
		{
			return -3;
	//   65  118:bipush          -3
	//   66  120:ireturn         
		}
		if(!flag)
			return 4;
		if(true) goto _L4; else goto _L3
_L3:
	}

	public volatile int compareTo(Object obj)
	{
		return compareTo((Font)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #2   <Class Font>
	//    3    5:invokevirtual   #162 <Method int compareTo(Font)>
	//    4    8:ireturn         
	}

	public Font difference(Font font)
	{
		float f;
		int i;
		int k;
label0:
		{
			if(font == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
				return this;
	//    2    4:aload_0         
	//    3    5:areturn         
			float f1 = font.size;
	//    4    6:aload_1         
	//    5    7:getfield        #59  <Field float size>
	//    6   10:fstore_3        
			f = f1;
	//    7   11:fload_3         
	//    8   12:fstore_2        
			if(f1 == -1F)
	//*   9   13:fload_3         
	//*  10   14:ldc1            #46  <Float -1F>
	//*  11   16:fcmpl           
	//*  12   17:ifne            25
				f = size;
	//   13   20:aload_0         
	//   14   21:getfield        #59  <Field float size>
	//   15   24:fstore_2        
			k = -1;
	//   16   25:iconst_m1       
	//   17   26:istore          6
			int j = style;
	//   18   28:aload_0         
	//   19   29:getfield        #61  <Field int style>
	//   20   32:istore          5
			int l = font.getStyle();
	//   21   34:aload_1         
	//   22   35:invokevirtual   #152 <Method int getStyle()>
	//   23   38:istore          7
			if(j == -1)
	//*  24   40:iload           5
	//*  25   42:iconst_m1       
	//*  26   43:icmpne          56
			{
				i = j;
	//   27   46:iload           5
	//   28   48:istore          4
				if(l == -1)
					break label0;
	//   29   50:iload           7
	//   30   52:iconst_m1       
	//   31   53:icmpeq          89
			}
			i = j;
	//   32   56:iload           5
	//   33   58:istore          4
			if(j == -1)
	//*  34   60:iload           5
	//*  35   62:iconst_m1       
	//*  36   63:icmpne          69
				i = 0;
	//   37   66:iconst_0        
	//   38   67:istore          4
			j = l;
	//   39   69:iload           7
	//   40   71:istore          5
			if(l == -1)
	//*  41   73:iload           7
	//*  42   75:iconst_m1       
	//*  43   76:icmpne          82
				j = 0;
	//   44   79:iconst_0        
	//   45   80:istore          5
			k = i | j;
	//   46   82:iload           4
	//   47   84:iload           5
	//   48   86:ior             
	//   49   87:istore          6
		}
		BaseColor basecolor1 = font.color;
	//   50   89:aload_1         
	//   51   90:getfield        #63  <Field BaseColor color>
	//   52   93:astore          9
		BaseColor basecolor = basecolor1;
	//   53   95:aload           9
	//   54   97:astore          8
		if(basecolor1 == null)
	//*  55   99:aload           9
	//*  56  101:ifnonnull       110
			basecolor = color;
	//   57  104:aload_0         
	//   58  105:getfield        #63  <Field BaseColor color>
	//   59  108:astore          8
		if(font.baseFont != null)
	//*  60  110:aload_1         
	//*  61  111:getfield        #65  <Field BaseFont baseFont>
	//*  62  114:ifnull          134
			return new Font(font.baseFont, f, k, basecolor);
	//   63  117:new             #2   <Class Font>
	//   64  120:dup             
	//   65  121:aload_1         
	//   66  122:getfield        #65  <Field BaseFont baseFont>
	//   67  125:fload_2         
	//   68  126:iload           6
	//   69  128:aload           8
	//   70  130:invokespecial   #70  <Method void Font(BaseFont, float, int, BaseColor)>
	//   71  133:areturn         
		if(font.getFamily() != FontFamily.UNDEFINED)
	//*  72  134:aload_1         
	//*  73  135:invokevirtual   #144 <Method Font$FontFamily getFamily()>
	//*  74  138:getstatic       #45  <Field Font$FontFamily Font$FontFamily.UNDEFINED>
	//*  75  141:if_acmpeq       161
			return new Font(font.family, f, k, basecolor);
	//   76  144:new             #2   <Class Font>
	//   77  147:dup             
	//   78  148:aload_1         
	//   79  149:getfield        #57  <Field Font$FontFamily family>
	//   80  152:fload_2         
	//   81  153:iload           6
	//   82  155:aload           8
	//   83  157:invokespecial   #49  <Method void Font(Font$FontFamily, float, int, BaseColor)>
	//   84  160:areturn         
		if(baseFont != null)
	//*  85  161:aload_0         
	//*  86  162:getfield        #65  <Field BaseFont baseFont>
	//*  87  165:ifnull          205
		{
			if(k == i)
	//*  88  168:iload           6
	//*  89  170:iload           4
	//*  90  172:icmpne          192
				return new Font(baseFont, f, k, basecolor);
	//   91  175:new             #2   <Class Font>
	//   92  178:dup             
	//   93  179:aload_0         
	//   94  180:getfield        #65  <Field BaseFont baseFont>
	//   95  183:fload_2         
	//   96  184:iload           6
	//   97  186:aload           8
	//   98  188:invokespecial   #70  <Method void Font(BaseFont, float, int, BaseColor)>
	//   99  191:areturn         
			else
				return FontFactory.getFont(getFamilyname(), f, k, basecolor);
	//  100  192:aload_0         
	//  101  193:invokevirtual   #167 <Method String getFamilyname()>
	//  102  196:fload_2         
	//  103  197:iload           6
	//  104  199:aload           8
	//  105  201:invokestatic    #173 <Method Font FontFactory.getFont(String, float, int, BaseColor)>
	//  106  204:areturn         
		} else
		{
			return new Font(family, f, k, basecolor);
	//  107  205:new             #2   <Class Font>
	//  108  208:dup             
	//  109  209:aload_0         
	//  110  210:getfield        #57  <Field Font$FontFamily family>
	//  111  213:fload_2         
	//  112  214:iload           6
	//  113  216:aload           8
	//  114  218:invokespecial   #49  <Method void Font(Font$FontFamily, float, int, BaseColor)>
	//  115  221:areturn         
		}
	}

	public BaseFont getBaseFont()
	{
		return baseFont;
	//    0    0:aload_0         
	//    1    1:getfield        #65  <Field BaseFont baseFont>
	//    2    4:areturn         
	}

	public BaseFont getCalculatedBaseFont(boolean flag)
	{
		int i;
		String s;
		if(baseFont != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #65  <Field BaseFont baseFont>
	//*   2    4:ifnull          12
			return baseFont;
	//    3    7:aload_0         
	//    4    8:getfield        #65  <Field BaseFont baseFont>
	//    5   11:areturn         
		int j = style;
	//    6   12:aload_0         
	//    7   13:getfield        #61  <Field int style>
	//    8   16:istore_3        
		i = j;
	//    9   17:iload_3         
	//   10   18:istore_2        
		if(j == -1)
	//*  11   19:iload_3         
	//*  12   20:iconst_m1       
	//*  13   21:icmpne          26
			i = 0;
	//   14   24:iconst_0        
	//   15   25:istore_2        
		s = "Cp1252";
	//   16   26:ldc1            #179 <String "Cp1252">
	//   17   28:astore          5
		static class _cls1
		{

			static final int $SwitchMap$com$itextpdf$text$Font$FontFamily[];

			static 
			{
				$SwitchMap$com$itextpdf$text$Font$FontFamily = new int[FontFamily.values().length];
			//    0    0:invokestatic    #18  <Method Font$FontFamily[] Font$FontFamily.values()>
			//    1    3:arraylength     
			//    2    4:newarray        int[]
			//    3    6:putstatic       #20  <Field int[] $SwitchMap$com$itextpdf$text$Font$FontFamily>
				try
				{
					$SwitchMap$com$itextpdf$text$Font$FontFamily[FontFamily.COURIER.ordinal()] = 1;
			//    4    9:getstatic       #20  <Field int[] $SwitchMap$com$itextpdf$text$Font$FontFamily>
			//    5   12:getstatic       #24  <Field Font$FontFamily Font$FontFamily.COURIER>
			//    6   15:invokevirtual   #28  <Method int Font$FontFamily.ordinal()>
			//    7   18:iconst_1        
			//    8   19:iastore         
				}
			//*   9   20:getstatic       #20  <Field int[] $SwitchMap$com$itextpdf$text$Font$FontFamily>
			//*  10   23:getstatic       #31  <Field Font$FontFamily Font$FontFamily.HELVETICA>
			//*  11   26:invokevirtual   #28  <Method int Font$FontFamily.ordinal()>
			//*  12   29:iconst_2        
			//*  13   30:iastore         
			//*  14   31:getstatic       #20  <Field int[] $SwitchMap$com$itextpdf$text$Font$FontFamily>
			//*  15   34:getstatic       #34  <Field Font$FontFamily Font$FontFamily.TIMES_ROMAN>
			//*  16   37:invokevirtual   #28  <Method int Font$FontFamily.ordinal()>
			//*  17   40:iconst_3        
			//*  18   41:iastore         
			//*  19   42:getstatic       #20  <Field int[] $SwitchMap$com$itextpdf$text$Font$FontFamily>
			//*  20   45:getstatic       #37  <Field Font$FontFamily Font$FontFamily.SYMBOL>
			//*  21   48:invokevirtual   #28  <Method int Font$FontFamily.ordinal()>
			//*  22   51:iconst_4        
			//*  23   52:iastore         
			//*  24   53:getstatic       #20  <Field int[] $SwitchMap$com$itextpdf$text$Font$FontFamily>
			//*  25   56:getstatic       #40  <Field Font$FontFamily Font$FontFamily.ZAPFDINGBATS>
			//*  26   59:invokevirtual   #28  <Method int Font$FontFamily.ordinal()>
			//*  27   62:iconst_5        
			//*  28   63:iastore         
			//*  29   64:return          
			//*  30   65:astore_0        
			//*  31   66:return          
			//*  32   67:astore_0        
			//*  33   68:goto            53
			//*  34   71:astore_0        
			//*  35   72:goto            42
			//*  36   75:astore_0        
			//*  37   76:goto            31
				catch(NoSuchFieldError nosuchfielderror4) { }
			//   38   79:astore_0        
				try
				{
					$SwitchMap$com$itextpdf$text$Font$FontFamily[FontFamily.HELVETICA.ordinal()] = 2;
				}
				catch(NoSuchFieldError nosuchfielderror3) { }
				try
				{
					$SwitchMap$com$itextpdf$text$Font$FontFamily[FontFamily.TIMES_ROMAN.ordinal()] = 3;
				}
				catch(NoSuchFieldError nosuchfielderror2) { }
				try
				{
					$SwitchMap$com$itextpdf$text$Font$FontFamily[FontFamily.SYMBOL.ordinal()] = 4;
				}
				catch(NoSuchFieldError nosuchfielderror1) { }
				try
				{
					$SwitchMap$com$itextpdf$text$Font$FontFamily[FontFamily.ZAPFDINGBATS.ordinal()] = 5;
				}
				catch(NoSuchFieldError nosuchfielderror)
				{
					return;
				}
			//*  39   80:goto            20
			}
		}

		_cls1..SwitchMap.com.itextpdf.text.Font.FontFamily[family.ordinal()];
	//   18   30:getstatic       #183 <Field int[] Font$1.$SwitchMap$com$itextpdf$text$Font$FontFamily>
	//   19   33:aload_0         
	//   20   34:getfield        #57  <Field Font$FontFamily family>
	//   21   37:invokevirtual   #186 <Method int Font$FontFamily.ordinal()>
	//   22   40:iaload          
		JVM INSTR tableswitch 1 5: default 76
	//	               1 121
	//	               2 76
	//	               3 180
	//	               4 236
	//	               5 259;
	//   23   41:tableswitch     1 5: default 76
	//	               1 121
	//	               2 76
	//	               3 180
	//	               4 236
	//	               5 259
		   goto _L1 _L2 _L1 _L3 _L4 _L5
_L1:
		i & 3;
	//   24   76:iload_2         
	//   25   77:iconst_3        
	//   26   78:iand            
		JVM INSTR tableswitch 1 3: default 104
	//	               1 282
	//	               2 289
	//	               3 296;
	//   27   79:tableswitch     1 3: default 104
	//	               1 282
	//	               2 289
	//	               3 296
		   goto _L6 _L7 _L8 _L9
_L9:
		break MISSING_BLOCK_LABEL_296;
_L6:
		Object obj = "Helvetica";
	//   28  104:ldc1            #87  <String "Helvetica">
	//   29  106:astore          4
_L11:
		String s1;
		try
		{
			obj = ((Object) (BaseFont.createFont(((String) (obj)), s, false)));
	//   30  108:aload           4
	//   31  110:aload           5
	//   32  112:iconst_0        
	//   33  113:invokestatic    #192 <Method BaseFont BaseFont.createFont(String, String, boolean)>
	//   34  116:astore          4
		}
	//*  35  118:aload           4
	//*  36  120:areturn         
	//*  37  121:iload_2         
	//*  38  122:iconst_3        
	//*  39  123:iand            
	//*  40  124:tableswitch     1 3: default 152
	//	               1 159
	//	               2 166
	//	               3 173
	//*  41  152:ldc1            #76  <String "Courier">
	//*  42  154:astore          4
	//*  43  156:goto            108
	//*  44  159:ldc1            #194 <String "Courier-Bold">
	//*  45  161:astore          4
	//*  46  163:goto            108
	//*  47  166:ldc1            #196 <String "Courier-Oblique">
	//*  48  168:astore          4
	//*  49  170:goto            108
	//*  50  173:ldc1            #198 <String "Courier-BoldOblique">
	//*  51  175:astore          4
	//*  52  177:goto            108
	//*  53  180:iload_2         
	//*  54  181:iconst_3        
	//*  55  182:iand            
	//*  56  183:tableswitch     1 3: default 208
	//	               1 215
	//	               2 222
	//	               3 229
	//*  57  208:ldc1            #92  <String "Times-Roman">
	//*  58  210:astore          4
	//*  59  212:goto            108
	//*  60  215:ldc1            #200 <String "Times-Bold">
	//*  61  217:astore          4
	//*  62  219:goto            108
	//*  63  222:ldc1            #202 <String "Times-Italic">
	//*  64  224:astore          4
	//*  65  226:goto            108
	//*  66  229:ldc1            #204 <String "Times-BoldItalic">
	//*  67  231:astore          4
	//*  68  233:goto            108
	//*  69  236:ldc1            #97  <String "Symbol">
	//*  70  238:astore          6
	//*  71  240:aload           6
	//*  72  242:astore          4
	//*  73  244:iload_1         
	//*  74  245:ifeq            108
	//*  75  248:ldc1            #97  <String "Symbol">
	//*  76  250:astore          5
	//*  77  252:aload           6
	//*  78  254:astore          4
	//*  79  256:goto            108
	//*  80  259:ldc1            #102 <String "ZapfDingbats">
	//*  81  261:astore          6
	//*  82  263:aload           6
	//*  83  265:astore          4
	//*  84  267:iload_1         
	//*  85  268:ifeq            108
	//*  86  271:ldc1            #102 <String "ZapfDingbats">
	//*  87  273:astore          5
	//*  88  275:aload           6
	//*  89  277:astore          4
	//*  90  279:goto            108
	//*  91  282:ldc1            #206 <String "Helvetica-Bold">
	//*  92  284:astore          4
	//*  93  286:goto            108
	//*  94  289:ldc1            #208 <String "Helvetica-Oblique">
	//*  95  291:astore          4
	//*  96  293:goto            108
	//*  97  296:ldc1            #210 <String "Helvetica-BoldOblique">
	//*  98  298:astore          4
	//*  99  300:goto            108
		catch(Exception exception)
	//* 100  303:astore          4
		{
			throw new ExceptionConverter(exception);
	//  101  305:new             #212 <Class ExceptionConverter>
	//  102  308:dup             
	//  103  309:aload           4
	//  104  311:invokespecial   #215 <Method void ExceptionConverter(Exception)>
	//  105  314:athrow          
		}
		return ((BaseFont) (obj));
_L2:
		switch(i & 3)
		{
		default:
			obj = "Courier";
			break;

		case 1: // '\001'
			obj = "Courier-Bold";
			break;

		case 2: // '\002'
			obj = "Courier-Oblique";
			break;

		case 3: // '\003'
			obj = "Courier-BoldOblique";
			break;
		}
		if(true) goto _L11; else goto _L10
_L10:
_L3:
		switch(i & 3)
		{
		default:
			obj = "Times-Roman";
			break;

		case 1: // '\001'
			obj = "Times-Bold";
			break;

		case 2: // '\002'
			obj = "Times-Italic";
			break;

		case 3: // '\003'
			obj = "Times-BoldItalic";
			break;
		}
		if(true) goto _L11; else goto _L12
_L12:
_L4:
		s1 = "Symbol";
		obj = ((Object) (s1));
		if(flag)
		{
			s = "Symbol";
			obj = ((Object) (s1));
		}
		  goto _L11
_L5:
		s1 = "ZapfDingbats";
		obj = ((Object) (s1));
		if(flag)
		{
			s = "ZapfDingbats";
			obj = ((Object) (s1));
		}
		  goto _L11
_L7:
		obj = "Helvetica-Bold";
		  goto _L11
_L8:
		obj = "Helvetica-Oblique";
		  goto _L11
		obj = "Helvetica-BoldOblique";
		  goto _L11
	}

	public float getCalculatedLeading(float f)
	{
		return getCalculatedSize() * f;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #220 <Method float getCalculatedSize()>
	//    2    4:fload_1         
	//    3    5:fmul            
	//    4    6:freturn         
	}

	public float getCalculatedSize()
	{
		float f1 = size;
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field float size>
	//    2    4:fstore_2        
		float f = f1;
	//    3    5:fload_2         
	//    4    6:fstore_1        
		if(f1 == -1F)
	//*   5    7:fload_2         
	//*   6    8:ldc1            #46  <Float -1F>
	//*   7   10:fcmpl           
	//*   8   11:ifne            17
			f = 12F;
	//    9   14:ldc1            #221 <Float 12F>
	//   10   16:fstore_1        
		return f;
	//   11   17:fload_1         
	//   12   18:freturn         
	}

	public int getCalculatedStyle()
	{
		int j = style;
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field int style>
	//    2    4:istore_2        
		int i = j;
	//    3    5:iload_2         
	//    4    6:istore_1        
		if(j == -1)
	//*   5    7:iload_2         
	//*   6    8:iconst_m1       
	//*   7    9:icmpne          14
			i = 0;
	//    8   12:iconst_0        
	//    9   13:istore_1        
		while(baseFont != null || family == FontFamily.SYMBOL || family == FontFamily.ZAPFDINGBATS) 
	//*  10   14:aload_0         
	//*  11   15:getfield        #65  <Field BaseFont baseFont>
	//*  12   18:ifnull          23
			return i;
	//   13   21:iload_1         
	//   14   22:ireturn         
	//   15   23:aload_0         
	//   16   24:getfield        #57  <Field Font$FontFamily family>
	//   17   27:getstatic       #100 <Field Font$FontFamily Font$FontFamily.SYMBOL>
	//   18   30:if_acmpeq       21
	//   19   33:aload_0         
	//   20   34:getfield        #57  <Field Font$FontFamily family>
	//   21   37:getstatic       #105 <Field Font$FontFamily Font$FontFamily.ZAPFDINGBATS>
	//   22   40:if_acmpeq       21
		return i & -4;
	//   23   43:iload_1         
	//   24   44:bipush          -4
	//   25   46:iand            
	//   26   47:ireturn         
	}

	public BaseColor getColor()
	{
		return color;
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field BaseColor color>
	//    2    4:areturn         
	}

	public FontFamily getFamily()
	{
		return family;
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field Font$FontFamily family>
	//    2    4:areturn         
	}

	public String getFamilyname()
	{
		String s = "unknown";
	//    0    0:ldc1            #224 <String "unknown">
	//    1    2:astore_3        
		_cls1..SwitchMap.com.itextpdf.text.Font.FontFamily[getFamily().ordinal()];
	//    2    3:getstatic       #183 <Field int[] Font$1.$SwitchMap$com$itextpdf$text$Font$FontFamily>
	//    3    6:aload_0         
	//    4    7:invokevirtual   #144 <Method Font$FontFamily getFamily()>
	//    5   10:invokevirtual   #186 <Method int Font$FontFamily.ordinal()>
	//    6   13:iaload          
		JVM INSTR tableswitch 1 5: default 48
	//	               1 104
	//	               2 107
	//	               3 110
	//	               4 113
	//	               5 116;
	//    7   14:tableswitch     1 5: default 48
	//	               1 104
	//	               2 107
	//	               3 110
	//	               4 113
	//	               5 116
		   goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
		Object obj = ((Object) (s));
	//    8   48:aload_3         
	//    9   49:astore          4
		if(baseFont == null) goto _L8; else goto _L7
	//   10   51:aload_0         
	//   11   52:getfield        #65  <Field BaseFont baseFont>
	//   12   55:ifnull          160
_L7:
		int i;
		int j;
		String as[][];
		as = baseFont.getFamilyFontName();
	//   13   58:aload_0         
	//   14   59:getfield        #65  <Field BaseFont baseFont>
	//   15   62:invokevirtual   #228 <Method String[][] BaseFont.getFamilyFontName()>
	//   16   65:astore          5
		j = as.length;
	//   17   67:aload           5
	//   18   69:arraylength     
	//   19   70:istore_2        
		i = 0;
	//   20   71:iconst_0        
	//   21   72:istore_1        
_L9:
		obj = ((Object) (s));
	//   22   73:aload_3         
	//   23   74:astore          4
		if(i >= j)
			break; /* Loop/switch isn't completed */
	//   24   76:iload_1         
	//   25   77:iload_2         
	//   26   78:icmpge          160
		obj = ((Object) (as[i]));
	//   27   81:aload           5
	//   28   83:iload_1         
	//   29   84:aaload          
	//   30   85:astore          4
		if("0".equals(((Object) (obj[2]))))
	//*  31   87:ldc1            #230 <String "0">
	//*  32   89:aload           4
	//*  33   91:iconst_2        
	//*  34   92:aaload          
	//*  35   93:invokevirtual   #231 <Method boolean String.equals(Object)>
	//*  36   96:ifeq            119
			return ((String) (obj[3]));
	//   37   99:aload           4
	//   38  101:iconst_3        
	//   39  102:aaload          
	//   40  103:areturn         
	//*  41  104:ldc1            #76  <String "Courier">
	//*  42  106:areturn         
	//*  43  107:ldc1            #87  <String "Helvetica">
	//*  44  109:areturn         
	//*  45  110:ldc1            #92  <String "Times-Roman">
	//*  46  112:areturn         
	//*  47  113:ldc1            #97  <String "Symbol">
	//*  48  115:areturn         
	//*  49  116:ldc1            #102 <String "ZapfDingbats">
	//*  50  118:areturn         
		if("1033".equals(((Object) (obj[2]))))
	//*  51  119:ldc1            #233 <String "1033">
	//*  52  121:aload           4
	//*  53  123:iconst_2        
	//*  54  124:aaload          
	//*  55  125:invokevirtual   #231 <Method boolean String.equals(Object)>
	//*  56  128:ifeq            136
			s = ((String) (obj[3]));
	//   57  131:aload           4
	//   58  133:iconst_3        
	//   59  134:aaload          
	//   60  135:astore_3        
		if("".equals(((Object) (obj[2]))))
	//*  61  136:ldc1            #235 <String "">
	//*  62  138:aload           4
	//*  63  140:iconst_2        
	//*  64  141:aaload          
	//*  65  142:invokevirtual   #231 <Method boolean String.equals(Object)>
	//*  66  145:ifeq            153
			s = ((String) (obj[3]));
	//   67  148:aload           4
	//   68  150:iconst_3        
	//   69  151:aaload          
	//   70  152:astore_3        
		i++;
	//   71  153:iload_1         
	//   72  154:iconst_1        
	//   73  155:iadd            
	//   74  156:istore_1        
		continue; /* Loop/switch isn't completed */
	//   75  157:goto            73
_L2:
		return "Courier";
_L3:
		return "Helvetica";
_L4:
		return "Times-Roman";
_L5:
		return "Symbol";
_L6:
		return "ZapfDingbats";
		if(true) goto _L9; else goto _L8
_L8:
		return ((String) (obj));
	//   76  160:aload           4
	//   77  162:areturn         
	}

	public float getSize()
	{
		return size;
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field float size>
	//    2    4:freturn         
	}

	public int getStyle()
	{
		return style;
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field int style>
	//    2    4:ireturn         
	}

	public boolean isBold()
	{
		boolean flag = true;
	//    0    0:iconst_1        
	//    1    1:istore_1        
		if(style == -1)
	//*   2    2:aload_0         
	//*   3    3:getfield        #61  <Field int style>
	//*   4    6:iconst_m1       
	//*   5    7:icmpne          12
			return false;
	//    6   10:iconst_0        
	//    7   11:ireturn         
		if((style & 1) != 1)
	//*   8   12:aload_0         
	//*   9   13:getfield        #61  <Field int style>
	//*  10   16:iconst_1        
	//*  11   17:iand            
	//*  12   18:iconst_1        
	//*  13   19:icmpne          24
	//*  14   22:iload_1         
	//*  15   23:ireturn         
			flag = false;
	//   16   24:iconst_0        
	//   17   25:istore_1        
		return flag;
	//*  18   26:goto            22
	}

	public boolean isItalic()
	{
		while(style == -1 || (style & 2) != 2) 
	//*   0    0:aload_0         
	//*   1    1:getfield        #61  <Field int style>
	//*   2    4:iconst_m1       
	//*   3    5:icmpne          10
			return false;
	//    4    8:iconst_0        
	//    5    9:ireturn         
	//    6   10:aload_0         
	//    7   11:getfield        #61  <Field int style>
	//    8   14:iconst_2        
	//    9   15:iand            
	//   10   16:iconst_2        
	//   11   17:icmpne          8
		return true;
	//   12   20:iconst_1        
	//   13   21:ireturn         
	}

	public boolean isStandardFont()
	{
		return family == FontFamily.UNDEFINED && size == -1F && style == -1 && color == null && baseFont == null;
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field Font$FontFamily family>
	//    2    4:getstatic       #45  <Field Font$FontFamily Font$FontFamily.UNDEFINED>
	//    3    7:if_acmpne       44
	//    4   10:aload_0         
	//    5   11:getfield        #59  <Field float size>
	//    6   14:ldc1            #46  <Float -1F>
	//    7   16:fcmpl           
	//    8   17:ifne            44
	//    9   20:aload_0         
	//   10   21:getfield        #61  <Field int style>
	//   11   24:iconst_m1       
	//   12   25:icmpne          44
	//   13   28:aload_0         
	//   14   29:getfield        #63  <Field BaseColor color>
	//   15   32:ifnonnull       44
	//   16   35:aload_0         
	//   17   36:getfield        #65  <Field BaseFont baseFont>
	//   18   39:ifnonnull       44
	//   19   42:iconst_1        
	//   20   43:ireturn         
	//   21   44:iconst_0        
	//   22   45:ireturn         
	}

	public boolean isStrikethru()
	{
		while(style == -1 || (style & 8) != 8) 
	//*   0    0:aload_0         
	//*   1    1:getfield        #61  <Field int style>
	//*   2    4:iconst_m1       
	//*   3    5:icmpne          10
			return false;
	//    4    8:iconst_0        
	//    5    9:ireturn         
	//    6   10:aload_0         
	//    7   11:getfield        #61  <Field int style>
	//    8   14:bipush          8
	//    9   16:iand            
	//   10   17:bipush          8
	//   11   19:icmpne          8
		return true;
	//   12   22:iconst_1        
	//   13   23:ireturn         
	}

	public boolean isUnderlined()
	{
		while(style == -1 || (style & 4) != 4) 
	//*   0    0:aload_0         
	//*   1    1:getfield        #61  <Field int style>
	//*   2    4:iconst_m1       
	//*   3    5:icmpne          10
			return false;
	//    4    8:iconst_0        
	//    5    9:ireturn         
	//    6   10:aload_0         
	//    7   11:getfield        #61  <Field int style>
	//    8   14:iconst_4        
	//    9   15:iand            
	//   10   16:iconst_4        
	//   11   17:icmpne          8
		return true;
	//   12   20:iconst_1        
	//   13   21:ireturn         
	}

	public void setColor(int i, int j, int k)
	{
		color = new BaseColor(i, j, k);
	//    0    0:aload_0         
	//    1    1:new             #158 <Class BaseColor>
	//    2    4:dup             
	//    3    5:iload_1         
	//    4    6:iload_2         
	//    5    7:iload_3         
	//    6    8:invokespecial   #245 <Method void BaseColor(int, int, int)>
	//    7   11:putfield        #63  <Field BaseColor color>
	//    8   14:return          
	}

	public void setColor(BaseColor basecolor)
	{
		color = basecolor;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #63  <Field BaseColor color>
	//    3    5:return          
	}

	public void setFamily(String s)
	{
		family = getFamily(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #250 <Method Font$FontFamily getFamily(String)>
	//    3    5:putfield        #57  <Field Font$FontFamily family>
	//    4    8:return          
	}

	public void setSize(float f)
	{
		size = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #59  <Field float size>
	//    3    5:return          
	}

	public void setStyle(int i)
	{
		style = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #61  <Field int style>
	//    3    5:return          
	}

	public void setStyle(String s)
	{
		if(style == -1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #61  <Field int style>
	//*   2    4:iconst_m1       
	//*   3    5:icmpne          13
			style = 0;
	//    4    8:aload_0         
	//    5    9:iconst_0        
	//    6   10:putfield        #61  <Field int style>
		style = style | getStyleValue(s);
	//    7   13:aload_0         
	//    8   14:aload_0         
	//    9   15:getfield        #61  <Field int style>
	//   10   18:aload_1         
	//   11   19:invokestatic    #256 <Method int getStyleValue(String)>
	//   12   22:ior             
	//   13   23:putfield        #61  <Field int style>
	//   14   26:return          
	}

	public static final int BOLD = 1;
	public static final int BOLDITALIC = 3;
	public static final int DEFAULTSIZE = 12;
	public static final int ITALIC = 2;
	public static final int NORMAL = 0;
	public static final int STRIKETHRU = 8;
	public static final int UNDEFINED = -1;
	public static final int UNDERLINE = 4;
	private BaseFont baseFont;
	private BaseColor color;
	private FontFamily family;
	private float size;
	private int style;
}
