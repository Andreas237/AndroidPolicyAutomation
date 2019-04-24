// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.languages;

import com.itextpdf.text.pdf.Glyph;
import java.util.*;

// Referenced classes of package com.itextpdf.text.pdf.languages:
//			IndicGlyphRepositioner

public class BanglaGlyphRepositioner extends IndicGlyphRepositioner
{

	public BanglaGlyphRepositioner(Map map, Map map1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #28  <Method void IndicGlyphRepositioner()>
		cmap31 = map;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #30  <Field Map cmap31>
		glyphSubstitutionMap = map1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #32  <Field Map glyphSubstitutionMap>
	//    8   14:return          
	}

	private Glyph getGlyph(char c)
	{
		Glyph glyph = (Glyph)glyphSubstitutionMap.get(((Object) (String.valueOf(c))));
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field Map glyphSubstitutionMap>
	//    2    4:iload_1         
	//    3    5:invokestatic    #40  <Method String String.valueOf(char)>
	//    4    8:invokeinterface #46  <Method Object Map.get(Object)>
	//    5   13:checkcast       #48  <Class Glyph>
	//    6   16:astore_2        
		if(glyph != null)
	//*   7   17:aload_2         
	//*   8   18:ifnull          23
		{
			return glyph;
	//    9   21:aload_2         
	//   10   22:areturn         
		} else
		{
			int ai[] = (int[])cmap31.get(((Object) (Integer.valueOf(((int) (c))))));
	//   11   23:aload_0         
	//   12   24:getfield        #30  <Field Map cmap31>
	//   13   27:iload_1         
	//   14   28:invokestatic    #53  <Method Integer Integer.valueOf(int)>
	//   15   31:invokeinterface #46  <Method Object Map.get(Object)>
	//   16   36:checkcast       #55  <Class int[]>
	//   17   39:astore_2        
			return new Glyph(ai[0], ai[1], String.valueOf(c));
	//   18   40:new             #48  <Class Glyph>
	//   19   43:dup             
	//   20   44:aload_2         
	//   21   45:iconst_0        
	//   22   46:iaload          
	//   23   47:aload_2         
	//   24   48:iconst_1        
	//   25   49:iaload          
	//   26   50:iload_1         
	//   27   51:invokestatic    #40  <Method String String.valueOf(char)>
	//   28   54:invokespecial   #58  <Method void Glyph(int, int, String)>
	//   29   57:areturn         
		}
	}

	private void handleOKaarAndOUKaar(int i, List list, char c, char c1)
	{
		Glyph glyph = getGlyph(c);
	//    0    0:aload_0         
	//    1    1:iload_3         
	//    2    2:invokespecial   #62  <Method Glyph getGlyph(char)>
	//    3    5:astore          5
		Glyph glyph1 = getGlyph(c1);
	//    4    7:aload_0         
	//    5    8:iload           4
	//    6   10:invokespecial   #62  <Method Glyph getGlyph(char)>
	//    7   13:astore          6
		list.set(i, ((Object) (glyph)));
	//    8   15:aload_2         
	//    9   16:iload_1         
	//   10   17:aload           5
	//   11   19:invokeinterface #68  <Method Object List.set(int, Object)>
	//   12   24:pop             
		list.add(i + 1, ((Object) (glyph1)));
	//   13   25:aload_2         
	//   14   26:iload_1         
	//   15   27:iconst_1        
	//   16   28:iadd            
	//   17   29:aload           6
	//   18   31:invokeinterface #72  <Method void List.add(int, Object)>
	//   19   36:return          
	}

	public List getCharactersToBeShiftedLeftByOnePosition()
	{
		return Arrays.asList(((Object []) (CHARCTERS_TO_BE_SHIFTED_LEFT_BY_1)));
	//    0    0:getstatic       #23  <Field String[] CHARCTERS_TO_BE_SHIFTED_LEFT_BY_1>
	//    1    3:invokestatic    #81  <Method List Arrays.asList(Object[])>
	//    2    6:areturn         
	}

	public void repositionGlyphs(List list)
	{
		int i = 0;
	//    0    0:iconst_0        
	//    1    1:istore_2        
		while(i < list.size()) 
	//*   2    2:iload_2         
	//*   3    3:aload_1         
	//*   4    4:invokeinterface #88  <Method int List.size()>
	//*   5    9:icmpge          81
		{
			Glyph glyph = (Glyph)list.get(i);
	//    6   12:aload_1         
	//    7   13:iload_2         
	//    8   14:invokeinterface #91  <Method Object List.get(int)>
	//    9   19:checkcast       #48  <Class Glyph>
	//   10   22:astore_3        
			if(glyph.chars.equals("\u09CB"))
	//*  11   23:aload_3         
	//*  12   24:getfield        #95  <Field String Glyph.chars>
	//*  13   27:ldc1            #97  <String "\u09CB">
	//*  14   29:invokevirtual   #101 <Method boolean String.equals(Object)>
	//*  15   32:ifeq            54
				handleOKaarAndOUKaar(i, list, '\u09C7', '\u09BE');
	//   16   35:aload_0         
	//   17   36:iload_2         
	//   18   37:aload_1         
	//   19   38:sipush          2503
	//   20   41:sipush          2494
	//   21   44:invokespecial   #103 <Method void handleOKaarAndOUKaar(int, List, char, char)>
			else
	//*  22   47:iload_2         
	//*  23   48:iconst_1        
	//*  24   49:iadd            
	//*  25   50:istore_2        
	//*  26   51:goto            2
			if(glyph.chars.equals("\u09CC"))
	//*  27   54:aload_3         
	//*  28   55:getfield        #95  <Field String Glyph.chars>
	//*  29   58:ldc1            #105 <String "\u09CC">
	//*  30   60:invokevirtual   #101 <Method boolean String.equals(Object)>
	//*  31   63:ifeq            47
				handleOKaarAndOUKaar(i, list, '\u09C7', '\u09D7');
	//   32   66:aload_0         
	//   33   67:iload_2         
	//   34   68:aload_1         
	//   35   69:sipush          2503
	//   36   72:sipush          2519
	//   37   75:invokespecial   #103 <Method void handleOKaarAndOUKaar(int, List, char, char)>
			i++;
		}
	//*  38   78:goto            47
		super.repositionGlyphs(list);
	//   39   81:aload_0         
	//   40   82:aload_1         
	//   41   83:invokespecial   #107 <Method void IndicGlyphRepositioner.repositionGlyphs(List)>
	//   42   86:return          
	}

	private static final String CHARCTERS_TO_BE_SHIFTED_LEFT_BY_1[] = {
		"\u09BF", "\u09C7", "\u09C8"
	};
	private final Map cmap31;
	private final Map glyphSubstitutionMap;

	static 
	{
	//    0    0:iconst_3        
	//    1    1:anewarray       String[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:ldc1            #17  <String "\u09BF">
	//    5    8:aastore         
	//    6    9:dup             
	//    7   10:iconst_1        
	//    8   11:ldc1            #19  <String "\u09C7">
	//    9   13:aastore         
	//   10   14:dup             
	//   11   15:iconst_2        
	//   12   16:ldc1            #21  <String "\u09C8">
	//   13   18:aastore         
	//   14   19:putstatic       #23  <Field String[] CHARCTERS_TO_BE_SHIFTED_LEFT_BY_1>
	//*  15   22:return          
	}
}
