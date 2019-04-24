// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text;

import com.itextpdf.text.error_messages.MessageLocalization;
import java.util.Set;

// Referenced classes of package com.itextpdf.text:
//			FontFactoryImp, Font, BaseColor

public final class FontFactory
{

	private FontFactory()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #72  <Method void Object()>
	//    2    4:return          
	}

	public static boolean contains(String s)
	{
		return fontImp.isRegistered(s);
	//    0    0:getstatic       #64  <Field FontFactoryImp fontImp>
	//    1    3:aload_0         
	//    2    4:invokevirtual   #77  <Method boolean FontFactoryImp.isRegistered(String)>
	//    3    7:ireturn         
	}

	public static Font getFont(String s)
	{
		return getFont(s, defaultEncoding, defaultEmbedding, -1F, -1, ((BaseColor) (null)));
	//    0    0:aload_0         
	//    1    1:getstatic       #68  <Field String defaultEncoding>
	//    2    4:getstatic       #70  <Field boolean defaultEmbedding>
	//    3    7:ldc1            #80  <Float -1F>
	//    4    9:iconst_m1       
	//    5   10:aconst_null     
	//    6   11:invokestatic    #83  <Method Font getFont(String, String, boolean, float, int, BaseColor)>
	//    7   14:areturn         
	}

	public static Font getFont(String s, float f)
	{
		return getFont(s, defaultEncoding, defaultEmbedding, f, -1, ((BaseColor) (null)));
	//    0    0:aload_0         
	//    1    1:getstatic       #68  <Field String defaultEncoding>
	//    2    4:getstatic       #70  <Field boolean defaultEmbedding>
	//    3    7:fload_1         
	//    4    8:iconst_m1       
	//    5    9:aconst_null     
	//    6   10:invokestatic    #83  <Method Font getFont(String, String, boolean, float, int, BaseColor)>
	//    7   13:areturn         
	}

	public static Font getFont(String s, float f, int i)
	{
		return getFont(s, defaultEncoding, defaultEmbedding, f, i, ((BaseColor) (null)));
	//    0    0:aload_0         
	//    1    1:getstatic       #68  <Field String defaultEncoding>
	//    2    4:getstatic       #70  <Field boolean defaultEmbedding>
	//    3    7:fload_1         
	//    4    8:iload_2         
	//    5    9:aconst_null     
	//    6   10:invokestatic    #83  <Method Font getFont(String, String, boolean, float, int, BaseColor)>
	//    7   13:areturn         
	}

	public static Font getFont(String s, float f, int i, BaseColor basecolor)
	{
		return getFont(s, defaultEncoding, defaultEmbedding, f, i, basecolor);
	//    0    0:aload_0         
	//    1    1:getstatic       #68  <Field String defaultEncoding>
	//    2    4:getstatic       #70  <Field boolean defaultEmbedding>
	//    3    7:fload_1         
	//    4    8:iload_2         
	//    5    9:aload_3         
	//    6   10:invokestatic    #83  <Method Font getFont(String, String, boolean, float, int, BaseColor)>
	//    7   13:areturn         
	}

	public static Font getFont(String s, float f, BaseColor basecolor)
	{
		return getFont(s, defaultEncoding, defaultEmbedding, f, -1, basecolor);
	//    0    0:aload_0         
	//    1    1:getstatic       #68  <Field String defaultEncoding>
	//    2    4:getstatic       #70  <Field boolean defaultEmbedding>
	//    3    7:fload_1         
	//    4    8:iconst_m1       
	//    5    9:aload_2         
	//    6   10:invokestatic    #83  <Method Font getFont(String, String, boolean, float, int, BaseColor)>
	//    7   13:areturn         
	}

	public static Font getFont(String s, String s1)
	{
		return getFont(s, s1, defaultEmbedding, -1F, -1, ((BaseColor) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getstatic       #70  <Field boolean defaultEmbedding>
	//    3    5:ldc1            #80  <Float -1F>
	//    4    7:iconst_m1       
	//    5    8:aconst_null     
	//    6    9:invokestatic    #83  <Method Font getFont(String, String, boolean, float, int, BaseColor)>
	//    7   12:areturn         
	}

	public static Font getFont(String s, String s1, float f)
	{
		return getFont(s, s1, defaultEmbedding, f, -1, ((BaseColor) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getstatic       #70  <Field boolean defaultEmbedding>
	//    3    5:fload_2         
	//    4    6:iconst_m1       
	//    5    7:aconst_null     
	//    6    8:invokestatic    #83  <Method Font getFont(String, String, boolean, float, int, BaseColor)>
	//    7   11:areturn         
	}

	public static Font getFont(String s, String s1, float f, int i)
	{
		return getFont(s, s1, defaultEmbedding, f, i, ((BaseColor) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getstatic       #70  <Field boolean defaultEmbedding>
	//    3    5:fload_2         
	//    4    6:iload_3         
	//    5    7:aconst_null     
	//    6    8:invokestatic    #83  <Method Font getFont(String, String, boolean, float, int, BaseColor)>
	//    7   11:areturn         
	}

	public static Font getFont(String s, String s1, float f, int i, BaseColor basecolor)
	{
		return getFont(s, s1, defaultEmbedding, f, i, basecolor);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getstatic       #70  <Field boolean defaultEmbedding>
	//    3    5:fload_2         
	//    4    6:iload_3         
	//    5    7:aload           4
	//    6    9:invokestatic    #83  <Method Font getFont(String, String, boolean, float, int, BaseColor)>
	//    7   12:areturn         
	}

	public static Font getFont(String s, String s1, boolean flag)
	{
		return getFont(s, s1, flag, -1F, -1, ((BaseColor) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:ldc1            #80  <Float -1F>
	//    4    5:iconst_m1       
	//    5    6:aconst_null     
	//    6    7:invokestatic    #83  <Method Font getFont(String, String, boolean, float, int, BaseColor)>
	//    7   10:areturn         
	}

	public static Font getFont(String s, String s1, boolean flag, float f)
	{
		return getFont(s, s1, flag, f, -1, ((BaseColor) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:fload_3         
	//    4    4:iconst_m1       
	//    5    5:aconst_null     
	//    6    6:invokestatic    #83  <Method Font getFont(String, String, boolean, float, int, BaseColor)>
	//    7    9:areturn         
	}

	public static Font getFont(String s, String s1, boolean flag, float f, int i)
	{
		return getFont(s, s1, flag, f, i, ((BaseColor) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:fload_3         
	//    4    4:iload           4
	//    5    6:aconst_null     
	//    6    7:invokestatic    #83  <Method Font getFont(String, String, boolean, float, int, BaseColor)>
	//    7   10:areturn         
	}

	public static Font getFont(String s, String s1, boolean flag, float f, int i, BaseColor basecolor)
	{
		return fontImp.getFont(s, s1, flag, f, i, basecolor);
	//    0    0:getstatic       #64  <Field FontFactoryImp fontImp>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:fload_3         
	//    5    7:iload           4
	//    6    9:aload           5
	//    7   11:invokevirtual   #95  <Method Font FontFactoryImp.getFont(String, String, boolean, float, int, BaseColor)>
	//    8   14:areturn         
	}

	public static Font getFont(String s, String s1, boolean flag, float f, int i, BaseColor basecolor, boolean flag1)
	{
		return fontImp.getFont(s, s1, flag, f, i, basecolor, flag1);
	//    0    0:getstatic       #64  <Field FontFactoryImp fontImp>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:fload_3         
	//    5    7:iload           4
	//    6    9:aload           5
	//    7   11:iload           6
	//    8   13:invokevirtual   #98  <Method Font FontFactoryImp.getFont(String, String, boolean, float, int, BaseColor, boolean)>
	//    9   16:areturn         
	}

	public static FontFactoryImp getFontImp()
	{
		return fontImp;
	//    0    0:getstatic       #64  <Field FontFactoryImp fontImp>
	//    1    3:areturn         
	}

	public static Set getRegisteredFamilies()
	{
		return fontImp.getRegisteredFamilies();
	//    0    0:getstatic       #64  <Field FontFactoryImp fontImp>
	//    1    3:invokevirtual   #104 <Method Set FontFactoryImp.getRegisteredFamilies()>
	//    2    6:areturn         
	}

	public static Set getRegisteredFonts()
	{
		return fontImp.getRegisteredFonts();
	//    0    0:getstatic       #64  <Field FontFactoryImp fontImp>
	//    1    3:invokevirtual   #109 <Method Set FontFactoryImp.getRegisteredFonts()>
	//    2    6:areturn         
	}

	public static boolean isRegistered(String s)
	{
		return fontImp.isRegistered(s);
	//    0    0:getstatic       #64  <Field FontFactoryImp fontImp>
	//    1    3:aload_0         
	//    2    4:invokevirtual   #77  <Method boolean FontFactoryImp.isRegistered(String)>
	//    3    7:ireturn         
	}

	public static void register(String s)
	{
		register(s, ((String) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokestatic    #114 <Method void register(String, String)>
	//    3    5:return          
	}

	public static void register(String s, String s1)
	{
		fontImp.register(s, s1);
	//    0    0:getstatic       #64  <Field FontFactoryImp fontImp>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:invokevirtual   #115 <Method void FontFactoryImp.register(String, String)>
	//    4    8:return          
	}

	public static int registerDirectories()
	{
		return fontImp.registerDirectories();
	//    0    0:getstatic       #64  <Field FontFactoryImp fontImp>
	//    1    3:invokevirtual   #119 <Method int FontFactoryImp.registerDirectories()>
	//    2    6:ireturn         
	}

	public static int registerDirectory(String s)
	{
		return fontImp.registerDirectory(s);
	//    0    0:getstatic       #64  <Field FontFactoryImp fontImp>
	//    1    3:aload_0         
	//    2    4:invokevirtual   #123 <Method int FontFactoryImp.registerDirectory(String)>
	//    3    7:ireturn         
	}

	public static int registerDirectory(String s, boolean flag)
	{
		return fontImp.registerDirectory(s, flag);
	//    0    0:getstatic       #64  <Field FontFactoryImp fontImp>
	//    1    3:aload_0         
	//    2    4:iload_1         
	//    3    5:invokevirtual   #126 <Method int FontFactoryImp.registerDirectory(String, boolean)>
	//    4    8:ireturn         
	}

	public static void registerFamily(String s, String s1, String s2)
	{
		fontImp.registerFamily(s, s1, s2);
	//    0    0:getstatic       #64  <Field FontFactoryImp fontImp>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #130 <Method void FontFactoryImp.registerFamily(String, String, String)>
	//    5    9:return          
	}

	public static void setFontImp(FontFactoryImp fontfactoryimp)
	{
		if(fontfactoryimp == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       21
		{
			throw new NullPointerException(MessageLocalization.getComposedMessage("fontfactoryimp.cannot.be.null", new Object[0]));
	//    2    4:new             #134 <Class NullPointerException>
	//    3    7:dup             
	//    4    8:ldc1            #136 <String "fontfactoryimp.cannot.be.null">
	//    5   10:iconst_0        
	//    6   11:anewarray       Object[]
	//    7   14:invokestatic    #142 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//    8   17:invokespecial   #144 <Method void NullPointerException(String)>
	//    9   20:athrow          
		} else
		{
			fontImp = fontfactoryimp;
	//   10   21:aload_0         
	//   11   22:putstatic       #64  <Field FontFactoryImp fontImp>
			return;
	//   12   25:return          
		}
	}

	public static final String COURIER = "Courier";
	public static final String COURIER_BOLD = "Courier-Bold";
	public static final String COURIER_BOLDOBLIQUE = "Courier-BoldOblique";
	public static final String COURIER_OBLIQUE = "Courier-Oblique";
	public static final String HELVETICA = "Helvetica";
	public static final String HELVETICA_BOLD = "Helvetica-Bold";
	public static final String HELVETICA_BOLDOBLIQUE = "Helvetica-BoldOblique";
	public static final String HELVETICA_OBLIQUE = "Helvetica-Oblique";
	public static final String SYMBOL = "Symbol";
	public static final String TIMES = "Times";
	public static final String TIMES_BOLD = "Times-Bold";
	public static final String TIMES_BOLDITALIC = "Times-BoldItalic";
	public static final String TIMES_ITALIC = "Times-Italic";
	public static final String TIMES_ROMAN = "Times-Roman";
	public static final String ZAPFDINGBATS = "ZapfDingbats";
	public static boolean defaultEmbedding = false;
	public static String defaultEncoding = "Cp1252";
	private static FontFactoryImp fontImp = new FontFactoryImp();

	static 
	{
	//    0    0:new             #59  <Class FontFactoryImp>
	//    1    3:dup             
	//    2    4:invokespecial   #62  <Method void FontFactoryImp()>
	//    3    7:putstatic       #64  <Field FontFactoryImp fontImp>
	//    4   10:ldc1            #66  <String "Cp1252">
	//    5   12:putstatic       #68  <Field String defaultEncoding>
	//    6   15:iconst_0        
	//    7   16:putstatic       #70  <Field boolean defaultEmbedding>
	//*   8   19:return          
	}
}
