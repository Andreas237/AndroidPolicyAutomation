// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.tool.xml;

import com.itextpdf.text.*;
import java.nio.charset.UnsupportedCharsetException;
import java.util.HashMap;

public class XMLWorkerFontProvider extends FontFactoryImp
{

	public XMLWorkerFontProvider()
	{
		this(((String) (null)), ((HashMap) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:aconst_null     
	//    3    3:invokespecial   #18  <Method void XMLWorkerFontProvider(String, HashMap)>
	//    4    6:return          
	}

	public XMLWorkerFontProvider(String s)
	{
		this(s, ((HashMap) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #18  <Method void XMLWorkerFontProvider(String, HashMap)>
	//    4    6:return          
	}

	public XMLWorkerFontProvider(String s, HashMap hashmap)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void FontFactoryImp()>
		fontSubstitutionMap = new HashMap();
	//    2    4:aload_0         
	//    3    5:new             #24  <Class HashMap>
	//    4    8:dup             
	//    5    9:invokespecial   #25  <Method void HashMap()>
	//    6   12:putfield        #27  <Field HashMap fontSubstitutionMap>
		useUnicode = true;
	//    7   15:aload_0         
	//    8   16:iconst_1        
	//    9   17:putfield        #29  <Field boolean useUnicode>
		if(s != null && s.length() != 0) goto _L2; else goto _L1
	//   10   20:aload_1         
	//   11   21:ifnull          31
	//   12   24:aload_1         
	//   13   25:invokevirtual   #35  <Method int String.length()>
	//   14   28:ifne            46
_L1:
		super.registerDirectories();
	//   15   31:aload_0         
	//   16   32:invokespecial   #38  <Method int FontFactoryImp.registerDirectories()>
	//   17   35:pop             
_L4:
		if(hashmap != null)
	//*  18   36:aload_2         
	//*  19   37:ifnull          45
			fontSubstitutionMap = hashmap;
	//   20   40:aload_0         
	//   21   41:aload_2         
	//   22   42:putfield        #27  <Field HashMap fontSubstitutionMap>
		return;
	//   23   45:return          
_L2:
		if(!s.equals("\uFFFC"))
	//*  24   46:aload_1         
	//*  25   47:ldc1            #8   <String "\uFFFC">
	//*  26   49:invokevirtual   #42  <Method boolean String.equals(Object)>
	//*  27   52:ifne            36
			super.registerDirectory(s, true);
	//   28   55:aload_0         
	//   29   56:aload_1         
	//   30   57:iconst_1        
	//   31   58:invokespecial   #46  <Method int FontFactoryImp.registerDirectory(String, boolean)>
	//   32   61:pop             
		if(true) goto _L4; else goto _L3
	//   33   62:goto            36
_L3:
	}

	private Font getUnicodeFont(String s, String s1, float f, int i)
	{
		Object obj1 = null;
	//    0    0:aconst_null     
	//    1    1:astore          6
		Object obj;
		Font font;
		if(useUnicode)
	//*   2    3:aload_0         
	//*   3    4:getfield        #29  <Field boolean useUnicode>
	//*   4    7:ifeq            112
			obj = "Identity-H";
	//    5   10:ldc1            #54  <String "Identity-H">
	//    6   12:astore          5
		else
	//*   7   14:aload_0         
	//*   8   15:aload_1         
	//*   9   16:aload           5
	//*  10   18:iconst_1        
	//*  11   19:fload_3         
	//*  12   20:iload           4
	//*  13   22:aconst_null     
	//*  14   23:invokespecial   #58  <Method Font FontFactoryImp.getFont(String, String, boolean, float, int, BaseColor)>
	//*  15   26:astore          7
	//*  16   28:aload           7
	//*  17   30:ifnull          40
	//*  18   33:aload           7
	//*  19   35:invokevirtual   #64  <Method com.itextpdf.text.pdf.BaseFont Font.getBaseFont()>
	//*  20   38:astore          6
	//*  21   40:aload           7
	//*  22   42:astore          5
	//*  23   44:aload           6
	//*  24   46:ifnonnull       109
	//*  25   49:aload_0         
	//*  26   50:getfield        #27  <Field HashMap fontSubstitutionMap>
	//*  27   53:aload_1         
	//*  28   54:invokevirtual   #68  <Method Object HashMap.get(Object)>
	//*  29   57:checkcast       #31  <Class String>
	//*  30   60:astore          6
	//*  31   62:aload           7
	//*  32   64:astore          5
	//*  33   66:aload           6
	//*  34   68:ifnull          109
	//*  35   71:aload           7
	//*  36   73:astore          5
	//*  37   75:aload           6
	//*  38   77:invokevirtual   #35  <Method int String.length()>
	//*  39   80:ifle            109
	//*  40   83:aload_0         
	//*  41   84:getfield        #29  <Field boolean useUnicode>
	//*  42   87:ifeq            118
	//*  43   90:ldc1            #54  <String "Identity-H">
	//*  44   92:astore          5
	//*  45   94:aload_0         
	//*  46   95:aload           6
	//*  47   97:aload           5
	//*  48   99:iconst_1        
	//*  49  100:fload_3         
	//*  50  101:iload           4
	//*  51  103:aconst_null     
	//*  52  104:invokespecial   #58  <Method Font FontFactoryImp.getFont(String, String, boolean, float, int, BaseColor)>
	//*  53  107:astore          5
	//*  54  109:aload           5
	//*  55  111:areturn         
			obj = ((Object) (s1));
	//   56  112:aload_2         
	//   57  113:astore          5
		font = super.getFont(s, ((String) (obj)), true, f, i, ((BaseColor) (null)));
		if(font == null)
			break MISSING_BLOCK_LABEL_40;
		obj1 = ((Object) (font.getBaseFont()));
		obj = ((Object) (font));
		if(obj1 != null)
			break MISSING_BLOCK_LABEL_109;
		obj1 = ((Object) ((String)fontSubstitutionMap.get(((Object) (s)))));
		obj = ((Object) (font));
		if(obj1 == null)
			break MISSING_BLOCK_LABEL_109;
		obj = ((Object) (font));
		if(((String) (obj1)).length() > 0)
		{
			if(useUnicode)
				obj = "Identity-H";
			else
	//*  58  115:goto            14
				obj = ((Object) (s1));
	//   59  118:aload_2         
	//   60  119:astore          5
			try
			{
				obj = ((Object) (super.getFont(((String) (obj1)), ((String) (obj)), true, f, i, ((BaseColor) (null)))));
			}
	//*  61  121:goto            94
			catch(UnsupportedCharsetException unsupportedcharsetexception)
	//*  62  124:astore          5
			{
				com.itextpdf.text.pdf.BaseFont basefont = null;
	//   63  126:aconst_null     
	//   64  127:astore          6
				Font font1 = super.getFont(s, s1, true, f, i, ((BaseColor) (null)));
	//   65  129:aload_0         
	//   66  130:aload_1         
	//   67  131:aload_2         
	//   68  132:iconst_1        
	//   69  133:fload_3         
	//   70  134:iload           4
	//   71  136:aconst_null     
	//   72  137:invokespecial   #58  <Method Font FontFactoryImp.getFont(String, String, boolean, float, int, BaseColor)>
	//   73  140:astore          7
				if(font1 != null)
	//*  74  142:aload           7
	//*  75  144:ifnull          154
					basefont = font1.getBaseFont();
	//   76  147:aload           7
	//   77  149:invokevirtual   #64  <Method com.itextpdf.text.pdf.BaseFont Font.getBaseFont()>
	//   78  152:astore          6
				unsupportedcharsetexception = ((UnsupportedCharsetException) (font1));
	//   79  154:aload           7
	//   80  156:astore          5
				if(basefont == null)
	//*  81  158:aload           6
	//*  82  160:ifnonnull       109
				{
					s = (String)fontSubstitutionMap.get(((Object) (s)));
	//   83  163:aload_0         
	//   84  164:getfield        #27  <Field HashMap fontSubstitutionMap>
	//   85  167:aload_1         
	//   86  168:invokevirtual   #68  <Method Object HashMap.get(Object)>
	//   87  171:checkcast       #31  <Class String>
	//   88  174:astore_1        
					unsupportedcharsetexception = ((UnsupportedCharsetException) (font1));
	//   89  175:aload           7
	//   90  177:astore          5
					if(s != null)
	//*  91  179:aload_1         
	//*  92  180:ifnull          109
					{
						unsupportedcharsetexception = ((UnsupportedCharsetException) (font1));
	//   93  183:aload           7
	//   94  185:astore          5
						if(s.length() > 0)
	//*  95  187:aload_1         
	//*  96  188:invokevirtual   #35  <Method int String.length()>
	//*  97  191:ifle            109
							return super.getFont(s, s1, true, f, i, ((BaseColor) (null)));
	//   98  194:aload_0         
	//   99  195:aload_1         
	//  100  196:aload_2         
	//  101  197:iconst_1        
	//  102  198:fload_3         
	//  103  199:iload           4
	//  104  201:aconst_null     
	//  105  202:invokespecial   #58  <Method Font FontFactoryImp.getFont(String, String, boolean, float, int, BaseColor)>
	//  106  205:areturn         
					}
				}
			}
		}
		return ((Font) (obj));
	}

	public void addFontSubstitute(String s, String s1)
	{
		fontSubstitutionMap.put(((Object) (s)), ((Object) (s1)));
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field HashMap fontSubstitutionMap>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #74  <Method Object HashMap.put(Object, Object)>
	//    5    9:pop             
	//    6   10:return          
	}

	public Font getFont(String s, String s1, float f, int i)
	{
		if(s == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       18
			return new Font(com.itextpdf.text.Font.FontFamily.UNDEFINED, f, i);
	//    2    4:new             #60  <Class Font>
	//    3    7:dup             
	//    4    8:getstatic       #80  <Field com.itextpdf.text.Font$FontFamily com.itextpdf.text.Font$FontFamily.UNDEFINED>
	//    5   11:fload_3         
	//    6   12:iload           4
	//    7   14:invokespecial   #83  <Method void Font(com.itextpdf.text.Font$FontFamily, float, int)>
	//    8   17:areturn         
		else
			return getUnicodeFont(s, s1, f, i);
	//    9   18:aload_0         
	//   10   19:aload_1         
	//   11   20:aload_2         
	//   12   21:fload_3         
	//   13   22:iload           4
	//   14   24:invokespecial   #85  <Method Font getUnicodeFont(String, String, float, int)>
	//   15   27:areturn         
	}

	public Font getFont(String s, String s1, boolean flag, float f, int i, BaseColor basecolor)
	{
		s = ((String) (getFont(s, s1, f, i)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:fload           4
	//    4    5:iload           5
	//    5    7:invokevirtual   #87  <Method Font getFont(String, String, float, int)>
	//    6   10:astore_1        
		((Font) (s)).setColor(basecolor);
	//    7   11:aload_1         
	//    8   12:aload           6
	//    9   14:invokevirtual   #91  <Method void Font.setColor(BaseColor)>
		return ((Font) (s));
	//   10   17:aload_1         
	//   11   18:areturn         
	}

	public void setUseUnicode(boolean flag)
	{
		useUnicode = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #29  <Field boolean useUnicode>
	//    3    5:return          
	}

	public static final String DONTLOOKFORFONTS = "\uFFFC";
	protected HashMap fontSubstitutionMap;
	protected boolean useUnicode;
}
