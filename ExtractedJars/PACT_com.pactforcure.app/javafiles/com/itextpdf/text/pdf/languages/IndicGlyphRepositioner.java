// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.languages;

import com.itextpdf.text.pdf.Glyph;
import java.util.List;

// Referenced classes of package com.itextpdf.text.pdf.languages:
//			GlyphRepositioner

abstract class IndicGlyphRepositioner
	implements GlyphRepositioner
{

	IndicGlyphRepositioner()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void Object()>
	//    2    4:return          
	}

	private Glyph getNextGlyph(List list, int i)
	{
		if(i + 1 < list.size())
	//*   0    0:iload_2         
	//*   1    1:iconst_1        
	//*   2    2:iadd            
	//*   3    3:aload_1         
	//*   4    4:invokeinterface #19  <Method int List.size()>
	//*   5    9:icmpge          25
			return (Glyph)list.get(i + 1);
	//    6   12:aload_1         
	//    7   13:iload_2         
	//    8   14:iconst_1        
	//    9   15:iadd            
	//   10   16:invokeinterface #23  <Method Object List.get(int)>
	//   11   21:checkcast       #25  <Class Glyph>
	//   12   24:areturn         
		else
			return null;
	//   13   25:aconst_null     
	//   14   26:areturn         
	}

	abstract List getCharactersToBeShiftedLeftByOnePosition();

	public void repositionGlyphs(List list)
	{
		int j;
		for(int i = 0; i < list.size(); i = j + 1)
	//*   0    0:iconst_0        
	//*   1    1:istore_2        
	//*   2    2:iload_2         
	//*   3    3:aload_1         
	//*   4    4:invokeinterface #19  <Method int List.size()>
	//*   5    9:icmpge          91
		{
			Glyph glyph = (Glyph)list.get(i);
	//    6   12:aload_1         
	//    7   13:iload_2         
	//    8   14:invokeinterface #23  <Method Object List.get(int)>
	//    9   19:checkcast       #25  <Class Glyph>
	//   10   22:astore          4
			Glyph glyph1 = getNextGlyph(list, i);
	//   11   24:aload_0         
	//   12   25:aload_1         
	//   13   26:iload_2         
	//   14   27:invokespecial   #33  <Method Glyph getNextGlyph(List, int)>
	//   15   30:astore          5
			j = i;
	//   16   32:iload_2         
	//   17   33:istore_3        
			if(glyph1 == null)
				continue;
	//   18   34:aload           5
	//   19   36:ifnull          84
			j = i;
	//   20   39:iload_2         
	//   21   40:istore_3        
			if(getCharactersToBeShiftedLeftByOnePosition().contains(((Object) (glyph1.chars))))
	//*  22   41:aload_0         
	//*  23   42:invokevirtual   #35  <Method List getCharactersToBeShiftedLeftByOnePosition()>
	//*  24   45:aload           5
	//*  25   47:getfield        #39  <Field String Glyph.chars>
	//*  26   50:invokeinterface #43  <Method boolean List.contains(Object)>
	//*  27   55:ifeq            84
			{
				list.set(i, ((Object) (glyph1)));
	//   28   58:aload_1         
	//   29   59:iload_2         
	//   30   60:aload           5
	//   31   62:invokeinterface #47  <Method Object List.set(int, Object)>
	//   32   67:pop             
				list.set(i + 1, ((Object) (glyph)));
	//   33   68:aload_1         
	//   34   69:iload_2         
	//   35   70:iconst_1        
	//   36   71:iadd            
	//   37   72:aload           4
	//   38   74:invokeinterface #47  <Method Object List.set(int, Object)>
	//   39   79:pop             
				j = i + 1;
	//   40   80:iload_2         
	//   41   81:iconst_1        
	//   42   82:iadd            
	//   43   83:istore_3        
			}
		}

	//   44   84:iload_3         
	//   45   85:iconst_1        
	//   46   86:iadd            
	//   47   87:istore_2        
	//*  48   88:goto            2
	//   49   91:return          
	}
}
