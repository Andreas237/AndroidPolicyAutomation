// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;

import com.itextpdf.text.DocumentException;
import com.itextpdf.text.error_messages.MessageLocalization;
import java.io.IOException;
import java.util.HashMap;

// Referenced classes of package com.itextpdf.text.pdf:
//			BaseFont, IntHashtable, PageResources, Type3Glyph, 
//			PdfArray, PdfDictionary, PdfNumber, GlyphList, 
//			PdfName, PdfStream, PdfWriter, PdfIndirectObject, 
//			PdfRectangle, PdfContentByte, PdfIndirectReference

public class Type3Font extends BaseFont
{

	public Type3Font(PdfWriter pdfwriter, boolean flag)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #27  <Method void BaseFont()>
		widths3 = new IntHashtable();
	//    2    4:aload_0         
	//    3    5:new             #29  <Class IntHashtable>
	//    4    8:dup             
	//    5    9:invokespecial   #30  <Method void IntHashtable()>
	//    6   12:putfield        #32  <Field IntHashtable widths3>
		char2glyph = new HashMap();
	//    7   15:aload_0         
	//    8   16:new             #34  <Class HashMap>
	//    9   19:dup             
	//   10   20:invokespecial   #35  <Method void HashMap()>
	//   11   23:putfield        #37  <Field HashMap char2glyph>
		llx = (0.0F / 0.0F);
	//   12   26:aload_0         
	//   13   27:ldc1            #38  <Float (0.0F / 0.0F)>
	//   14   29:putfield        #40  <Field float llx>
		pageResources = new PageResources();
	//   15   32:aload_0         
	//   16   33:new             #42  <Class PageResources>
	//   17   36:dup             
	//   18   37:invokespecial   #43  <Method void PageResources()>
	//   19   40:putfield        #45  <Field PageResources pageResources>
		writer = pdfwriter;
	//   20   43:aload_0         
	//   21   44:aload_1         
	//   22   45:putfield        #47  <Field PdfWriter writer>
		colorized = flag;
	//   23   48:aload_0         
	//   24   49:iload_2         
	//   25   50:putfield        #49  <Field boolean colorized>
		fontType = 5;
	//   26   53:aload_0         
	//   27   54:iconst_5        
	//   28   55:putfield        #53  <Field int fontType>
		usedSlot = new boolean[256];
	//   29   58:aload_0         
	//   30   59:sipush          256
	//   31   62:newarray        boolean[]
	//   32   64:putfield        #55  <Field boolean[] usedSlot>
	//   33   67:return          
	}

	public Type3Font(PdfWriter pdfwriter, char ac[], boolean flag)
	{
		this(pdfwriter, flag);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_3         
	//    3    3:invokespecial   #59  <Method void Type3Font(PdfWriter, boolean)>
	//    4    6:return          
	}

	public boolean charExists(int i)
	{
		if(i > 0 && i < 256)
	//*   0    0:iload_1         
	//*   1    1:ifle            18
	//*   2    4:iload_1         
	//*   3    5:sipush          256
	//*   4    8:icmpge          18
			return usedSlot[i];
	//    5   11:aload_0         
	//    6   12:getfield        #55  <Field boolean[] usedSlot>
	//    7   15:iload_1         
	//    8   16:baload          
	//    9   17:ireturn         
		else
			return false;
	//   10   18:iconst_0        
	//   11   19:ireturn         
	}

	byte[] convertToBytes(int i)
	{
		if(charExists(i))
	//*   0    0:aload_0         
	//*   1    1:iload_1         
	//*   2    2:invokevirtual   #65  <Method boolean charExists(int)>
	//*   3    5:ifeq            17
			return (new byte[] {
				(byte)i
			});
	//    4    8:iconst_1        
	//    5    9:newarray        byte[]
	//    6   11:dup             
	//    7   12:iconst_0        
	//    8   13:iload_1         
	//    9   14:int2byte        
	//   10   15:bastore         
	//   11   16:areturn         
		else
			return new byte[0];
	//   12   17:iconst_0        
	//   13   18:newarray        byte[]
	//   14   20:areturn         
	}

	public byte[] convertToBytes(String s)
	{
		char ac[] = s.toCharArray();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #72  <Method char[] String.toCharArray()>
	//    2    4:astore          6
		s = ((String) (new byte[ac.length]));
	//    3    6:aload           6
	//    4    8:arraylength     
	//    5    9:newarray        byte[]
	//    6   11:astore_1        
		int j = 0;
	//    7   12:iconst_0        
	//    8   13:istore_3        
		for(int i = 0; i < ac.length;)
	//*   9   14:iconst_0        
	//*  10   15:istore_2        
	//*  11   16:iload_2         
	//*  12   17:aload           6
	//*  13   19:arraylength     
	//*  14   20:icmpge          62
		{
			char c = ac[i];
	//   15   23:aload           6
	//   16   25:iload_2         
	//   17   26:caload          
	//   18   27:istore          5
			int k = j;
	//   19   29:iload_3         
	//   20   30:istore          4
			if(charExists(((int) (c))))
	//*  21   32:aload_0         
	//*  22   33:iload           5
	//*  23   35:invokevirtual   #65  <Method boolean charExists(int)>
	//*  24   38:ifeq            52
			{
				s[j] = (byte)c;
	//   25   41:aload_1         
	//   26   42:iload_3         
	//   27   43:iload           5
	//   28   45:int2byte        
	//   29   46:bastore         
				k = j + 1;
	//   30   47:iload_3         
	//   31   48:iconst_1        
	//   32   49:iadd            
	//   33   50:istore          4
			}
			i++;
	//   34   52:iload_2         
	//   35   53:iconst_1        
	//   36   54:iadd            
	//   37   55:istore_2        
			j = k;
	//   38   56:iload           4
	//   39   58:istore_3        
		}

	//*  40   59:goto            16
		if(s.length == j)
	//*  41   62:aload_1         
	//*  42   63:arraylength     
	//*  43   64:iload_3         
	//*  44   65:icmpne          70
		{
			return ((byte []) (s));
	//   45   68:aload_1         
	//   46   69:areturn         
		} else
		{
			byte abyte0[] = new byte[j];
	//   47   70:iload_3         
	//   48   71:newarray        byte[]
	//   49   73:astore          6
			System.arraycopy(((Object) (s)), 0, ((Object) (abyte0)), 0, j);
	//   50   75:aload_1         
	//   51   76:iconst_0        
	//   52   77:aload           6
	//   53   79:iconst_0        
	//   54   80:iload_3         
	//   55   81:invokestatic    #78  <Method void System.arraycopy(Object, int, Object, int, int)>
			return abyte0;
	//   56   84:aload           6
	//   57   86:areturn         
		}
	}

	public PdfContentByte defineGlyph(char c, float f, float f1, float f2, float f3, float f4)
	{
		if(c == 0 || c > '\377')
	//*   0    0:iload_1         
	//*   1    1:ifeq            11
	//*   2    4:iload_1         
	//*   3    5:sipush          255
	//*   4    8:icmple          25
			throw new IllegalArgumentException(MessageLocalization.getComposedMessage("the.char.1.doesn.t.belong.in.this.type3.font", ((int) (c))));
	//    5   11:new             #82  <Class IllegalArgumentException>
	//    6   14:dup             
	//    7   15:ldc1            #84  <String "the.char.1.doesn.t.belong.in.this.type3.font">
	//    8   17:iload_1         
	//    9   18:invokestatic    #90  <Method String MessageLocalization.getComposedMessage(String, int)>
	//   10   21:invokespecial   #93  <Method void IllegalArgumentException(String)>
	//   11   24:athrow          
		usedSlot[c] = true;
	//   12   25:aload_0         
	//   13   26:getfield        #55  <Field boolean[] usedSlot>
	//   14   29:iload_1         
	//   15   30:iconst_1        
	//   16   31:bastore         
		Integer integer = Integer.valueOf(((int) (c)));
	//   17   32:iload_1         
	//   18   33:invokestatic    #99  <Method Integer Integer.valueOf(int)>
	//   19   36:astore          7
		Type3Glyph type3glyph = (Type3Glyph)char2glyph.get(((Object) (integer)));
	//   20   38:aload_0         
	//   21   39:getfield        #37  <Field HashMap char2glyph>
	//   22   42:aload           7
	//   23   44:invokevirtual   #103 <Method Object HashMap.get(Object)>
	//   24   47:checkcast       #105 <Class Type3Glyph>
	//   25   50:astore          8
		if(type3glyph != null)
	//*  26   52:aload           8
	//*  27   54:ifnull          60
			return ((PdfContentByte) (type3glyph));
	//   28   57:aload           8
	//   29   59:areturn         
		widths3.put(((int) (c)), (int)f);
	//   30   60:aload_0         
	//   31   61:getfield        #32  <Field IntHashtable widths3>
	//   32   64:iload_1         
	//   33   65:fload_2         
	//   34   66:f2i             
	//   35   67:invokevirtual   #109 <Method int IntHashtable.put(int, int)>
	//   36   70:pop             
		if(!colorized)
	//*  37   71:aload_0         
	//*  38   72:getfield        #49  <Field boolean colorized>
	//*  39   75:ifne            111
			if(Float.isNaN(llx))
	//*  40   78:aload_0         
	//*  41   79:getfield        #40  <Field float llx>
	//*  42   82:invokestatic    #115 <Method boolean Float.isNaN(float)>
	//*  43   85:ifeq            155
			{
				llx = f1;
	//   44   88:aload_0         
	//   45   89:fload_3         
	//   46   90:putfield        #40  <Field float llx>
				lly = f2;
	//   47   93:aload_0         
	//   48   94:fload           4
	//   49   96:putfield        #117 <Field float lly>
				urx = f3;
	//   50   99:aload_0         
	//   51  100:fload           5
	//   52  102:putfield        #119 <Field float urx>
				ury = f4;
	//   53  105:aload_0         
	//   54  106:fload           6
	//   55  108:putfield        #121 <Field float ury>
			} else
	//*  56  111:new             #105 <Class Type3Glyph>
	//*  57  114:dup             
	//*  58  115:aload_0         
	//*  59  116:getfield        #47  <Field PdfWriter writer>
	//*  60  119:aload_0         
	//*  61  120:getfield        #45  <Field PageResources pageResources>
	//*  62  123:fload_2         
	//*  63  124:fload_3         
	//*  64  125:fload           4
	//*  65  127:fload           5
	//*  66  129:fload           6
	//*  67  131:aload_0         
	//*  68  132:getfield        #49  <Field boolean colorized>
	//*  69  135:invokespecial   #124 <Method void Type3Glyph(PdfWriter, PageResources, float, float, float, float, float, boolean)>
	//*  70  138:astore          8
	//*  71  140:aload_0         
	//*  72  141:getfield        #37  <Field HashMap char2glyph>
	//*  73  144:aload           7
	//*  74  146:aload           8
	//*  75  148:invokevirtual   #127 <Method Object HashMap.put(Object, Object)>
	//*  76  151:pop             
	//*  77  152:aload           8
	//*  78  154:areturn         
			{
				llx = Math.min(llx, f1);
	//   79  155:aload_0         
	//   80  156:aload_0         
	//   81  157:getfield        #40  <Field float llx>
	//   82  160:fload_3         
	//   83  161:invokestatic    #133 <Method float Math.min(float, float)>
	//   84  164:putfield        #40  <Field float llx>
				lly = Math.min(lly, f2);
	//   85  167:aload_0         
	//   86  168:aload_0         
	//   87  169:getfield        #117 <Field float lly>
	//   88  172:fload           4
	//   89  174:invokestatic    #133 <Method float Math.min(float, float)>
	//   90  177:putfield        #117 <Field float lly>
				urx = Math.max(urx, f3);
	//   91  180:aload_0         
	//   92  181:aload_0         
	//   93  182:getfield        #119 <Field float urx>
	//   94  185:fload           5
	//   95  187:invokestatic    #136 <Method float Math.max(float, float)>
	//   96  190:putfield        #119 <Field float urx>
				ury = Math.max(ury, f4);
	//   97  193:aload_0         
	//   98  194:aload_0         
	//   99  195:getfield        #121 <Field float ury>
	//  100  198:fload           6
	//  101  200:invokestatic    #136 <Method float Math.max(float, float)>
	//  102  203:putfield        #121 <Field float ury>
			}
		type3glyph = new Type3Glyph(writer, pageResources, f, f1, f2, f3, f4, colorized);
		char2glyph.put(((Object) (integer)), ((Object) (type3glyph)));
		return ((PdfContentByte) (type3glyph));
	//* 103  206:goto            111
	}

	public String[][] getAllNameEntries()
	{
		return (new String[][] {
			new String[] {
				"4", "", "", "", ""
			}
		});
	//    0    0:iconst_1        
	//    1    1:anewarray       String[][]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:iconst_5        
	//    5    7:anewarray       String[]
	//    6   10:dup             
	//    7   11:iconst_0        
	//    8   12:ldc1            #142 <String "4">
	//    9   14:aastore         
	//   10   15:dup             
	//   11   16:iconst_1        
	//   12   17:ldc1            #144 <String "">
	//   13   19:aastore         
	//   14   20:dup             
	//   15   21:iconst_2        
	//   16   22:ldc1            #144 <String "">
	//   17   24:aastore         
	//   18   25:dup             
	//   19   26:iconst_3        
	//   20   27:ldc1            #144 <String "">
	//   21   29:aastore         
	//   22   30:dup             
	//   23   31:iconst_4        
	//   24   32:ldc1            #144 <String "">
	//   25   34:aastore         
	//   26   35:aastore         
	//   27   36:areturn         
	}

	public int[] getCharBBox(int i)
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public String[][] getFamilyFontName()
	{
		return getFullFontName();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #150 <Method String[][] getFullFontName()>
	//    2    4:areturn         
	}

	public float getFontDescriptor(int i, float f)
	{
		return 0.0F;
	//    0    0:fconst_0        
	//    1    1:freturn         
	}

	public String[][] getFullFontName()
	{
		return (new String[][] {
			new String[] {
				"", "", "", ""
			}
		});
	//    0    0:iconst_1        
	//    1    1:anewarray       String[][]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:iconst_4        
	//    5    7:anewarray       String[]
	//    6   10:dup             
	//    7   11:iconst_0        
	//    8   12:ldc1            #144 <String "">
	//    9   14:aastore         
	//   10   15:dup             
	//   11   16:iconst_1        
	//   12   17:ldc1            #144 <String "">
	//   13   19:aastore         
	//   14   20:dup             
	//   15   21:iconst_2        
	//   16   22:ldc1            #144 <String "">
	//   17   24:aastore         
	//   18   25:dup             
	//   19   26:iconst_3        
	//   20   27:ldc1            #144 <String "">
	//   21   29:aastore         
	//   22   30:aastore         
	//   23   31:areturn         
	}

	public PdfStream getFullFontStream()
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public int getKerning(int i, int j)
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public String getPostscriptFontName()
	{
		return "";
	//    0    0:ldc1            #144 <String "">
	//    1    2:areturn         
	}

	protected int[] getRawCharBBox(int i, String s)
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	int getRawWidth(int i, String s)
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public int getWidth(int i)
	{
		if(!widths3.containsKey(i))
	//*   0    0:aload_0         
	//*   1    1:getfield        #32  <Field IntHashtable widths3>
	//*   2    4:iload_1         
	//*   3    5:invokevirtual   #166 <Method boolean IntHashtable.containsKey(int)>
	//*   4    8:ifne            25
			throw new IllegalArgumentException(MessageLocalization.getComposedMessage("the.char.1.is.not.defined.in.a.type3.font", i));
	//    5   11:new             #82  <Class IllegalArgumentException>
	//    6   14:dup             
	//    7   15:ldc1            #168 <String "the.char.1.is.not.defined.in.a.type3.font">
	//    8   17:iload_1         
	//    9   18:invokestatic    #90  <Method String MessageLocalization.getComposedMessage(String, int)>
	//   10   21:invokespecial   #93  <Method void IllegalArgumentException(String)>
	//   11   24:athrow          
		else
			return widths3.get(i);
	//   12   25:aload_0         
	//   13   26:getfield        #32  <Field IntHashtable widths3>
	//   14   29:iload_1         
	//   15   30:invokevirtual   #170 <Method int IntHashtable.get(int)>
	//   16   33:ireturn         
	}

	public int getWidth(String s)
	{
		s = ((String) (s.toCharArray()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #72  <Method char[] String.toCharArray()>
	//    2    4:astore_1        
		int j = 0;
	//    3    5:iconst_0        
	//    4    6:istore_3        
		for(int i = 0; i < s.length; i++)
	//*   5    7:iconst_0        
	//*   6    8:istore_2        
	//*   7    9:iload_2         
	//*   8   10:aload_1         
	//*   9   11:arraylength     
	//*  10   12:icmpge          32
			j += getWidth(((int) (s[i])));
	//   11   15:iload_3         
	//   12   16:aload_0         
	//   13   17:aload_1         
	//   14   18:iload_2         
	//   15   19:caload          
	//   16   20:invokevirtual   #173 <Method int getWidth(int)>
	//   17   23:iadd            
	//   18   24:istore_3        

	//   19   25:iload_2         
	//   20   26:iconst_1        
	//   21   27:iadd            
	//   22   28:istore_2        
	//*  23   29:goto            9
		return j;
	//   24   32:iload_3         
	//   25   33:ireturn         
	}

	public boolean hasKernPairs()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public boolean setCharAdvance(int i, int j)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public boolean setKerning(int i, int j, int k)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public void setPostscriptFontName(String s)
	{
	//    0    0:return          
	}

	void writeFont(PdfWriter pdfwriter, PdfIndirectReference pdfindirectreference, Object aobj[])
		throws DocumentException, IOException
	{
		if(writer != pdfwriter)
	//*   0    0:aload_0         
	//*   1    1:getfield        #47  <Field PdfWriter writer>
	//*   2    4:aload_1         
	//*   3    5:if_acmpeq       25
			throw new IllegalArgumentException(MessageLocalization.getComposedMessage("type3.font.used.with.the.wrong.pdfwriter", new Object[0]));
	//    4    8:new             #82  <Class IllegalArgumentException>
	//    5   11:dup             
	//    6   12:ldc1            #188 <String "type3.font.used.with.the.wrong.pdfwriter">
	//    7   14:iconst_0        
	//    8   15:anewarray       Object[]
	//    9   18:invokestatic    #193 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   10   21:invokespecial   #93  <Method void IllegalArgumentException(String)>
	//   11   24:athrow          
		int i;
		for(i = 0; i < usedSlot.length && !usedSlot[i]; i++);
	//   12   25:iconst_0        
	//   13   26:istore          4
	//   14   28:iload           4
	//   15   30:aload_0         
	//   16   31:getfield        #55  <Field boolean[] usedSlot>
	//   17   34:arraylength     
	//   18   35:icmpge          57
	//   19   38:aload_0         
	//   20   39:getfield        #55  <Field boolean[] usedSlot>
	//   21   42:iload           4
	//   22   44:baload          
	//   23   45:ifne            57
	//   24   48:iload           4
	//   25   50:iconst_1        
	//   26   51:iadd            
	//   27   52:istore          4
	//*  28   54:goto            28
		if(i == usedSlot.length)
	//*  29   57:iload           4
	//*  30   59:aload_0         
	//*  31   60:getfield        #55  <Field boolean[] usedSlot>
	//*  32   63:arraylength     
	//*  33   64:icmpne          84
			throw new DocumentException(MessageLocalization.getComposedMessage("no.glyphs.defined.for.type3.font", new Object[0]));
	//   34   67:new             #184 <Class DocumentException>
	//   35   70:dup             
	//   36   71:ldc1            #195 <String "no.glyphs.defined.for.type3.font">
	//   37   73:iconst_0        
	//   38   74:anewarray       Object[]
	//   39   77:invokestatic    #193 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   40   80:invokespecial   #196 <Method void DocumentException(String)>
	//   41   83:athrow          
		int l;
		for(l = usedSlot.length - 1; l >= i && !usedSlot[l]; l--);
	//   42   84:aload_0         
	//   43   85:getfield        #55  <Field boolean[] usedSlot>
	//   44   88:arraylength     
	//   45   89:iconst_1        
	//   46   90:isub            
	//   47   91:istore          7
	//   48   93:iload           7
	//   49   95:iload           4
	//   50   97:icmplt          119
	//   51  100:aload_0         
	//   52  101:getfield        #55  <Field boolean[] usedSlot>
	//   53  104:iload           7
	//   54  106:baload          
	//   55  107:ifne            119
	//   56  110:iload           7
	//   57  112:iconst_1        
	//   58  113:isub            
	//   59  114:istore          7
	//*  60  116:goto            93
		int ai[] = new int[(l - i) + 1];
	//   61  119:iload           7
	//   62  121:iload           4
	//   63  123:isub            
	//   64  124:iconst_1        
	//   65  125:iadd            
	//   66  126:newarray        int[]
	//   67  128:astore          12
		int ai1[] = new int[(l - i) + 1];
	//   68  130:iload           7
	//   69  132:iload           4
	//   70  134:isub            
	//   71  135:iconst_1        
	//   72  136:iadd            
	//   73  137:newarray        int[]
	//   74  139:astore          15
		int k = 0;
	//   75  141:iconst_0        
	//   76  142:istore          6
		int i1 = i;
	//   77  144:iload           4
	//   78  146:istore          8
		int j = 0;
	//   79  148:iconst_0        
	//   80  149:istore          5
		while(i1 <= l) 
	//*  81  151:iload           8
	//*  82  153:iload           7
	//*  83  155:icmpgt          214
		{
			if(usedSlot[i1])
	//*  84  158:aload_0         
	//*  85  159:getfield        #55  <Field boolean[] usedSlot>
	//*  86  162:iload           8
	//*  87  164:baload          
	//*  88  165:ifeq            678
			{
				int k1 = j + 1;
	//   89  168:iload           5
	//   90  170:iconst_1        
	//   91  171:iadd            
	//   92  172:istore          9
				ai1[j] = i1;
	//   93  174:aload           15
	//   94  176:iload           5
	//   95  178:iload           8
	//   96  180:iastore         
				ai[k] = widths3.get(i1);
	//   97  181:aload           12
	//   98  183:iload           6
	//   99  185:aload_0         
	//  100  186:getfield        #32  <Field IntHashtable widths3>
	//  101  189:iload           8
	//  102  191:invokevirtual   #170 <Method int IntHashtable.get(int)>
	//  103  194:iastore         
				j = k1;
	//  104  195:iload           9
	//  105  197:istore          5
			}
			i1++;
	//  106  199:iload           8
	//  107  201:iconst_1        
	//  108  202:iadd            
	//  109  203:istore          8
			k++;
	//  110  205:iload           6
	//  111  207:iconst_1        
	//  112  208:iadd            
	//  113  209:istore          6
		}
	//* 114  211:goto            151
		PdfArray pdfarray = new PdfArray();
	//  115  214:new             #198 <Class PdfArray>
	//  116  217:dup             
	//  117  218:invokespecial   #199 <Method void PdfArray()>
	//  118  221:astore          13
		PdfDictionary pdfdictionary1 = new PdfDictionary();
	//  119  223:new             #201 <Class PdfDictionary>
	//  120  226:dup             
	//  121  227:invokespecial   #202 <Method void PdfDictionary()>
	//  122  230:astore          14
		k = -1;
	//  123  232:iconst_m1       
	//  124  233:istore          6
		for(int j1 = 0; j1 < j; j1++)
	//* 125  235:iconst_0        
	//* 126  236:istore          8
	//* 127  238:iload           8
	//* 128  240:iload           5
	//* 129  242:icmpge          408
		{
			int i2 = ai1[j1];
	//  130  245:aload           15
	//  131  247:iload           8
	//  132  249:iaload          
	//  133  250:istore          10
			int l1 = k;
	//  134  252:iload           6
	//  135  254:istore          9
			if(i2 > k)
	//* 136  256:iload           10
	//* 137  258:iload           6
	//* 138  260:icmple          282
			{
				l1 = i2;
	//  139  263:iload           10
	//  140  265:istore          9
				pdfarray.add(((PdfObject) (new PdfNumber(l1))));
	//  141  267:aload           13
	//  142  269:new             #204 <Class PdfNumber>
	//  143  272:dup             
	//  144  273:iload           9
	//  145  275:invokespecial   #207 <Method void PdfNumber(int)>
	//  146  278:invokevirtual   #211 <Method boolean PdfArray.add(PdfObject)>
	//  147  281:pop             
			}
			k = l1 + 1;
	//  148  282:iload           9
	//  149  284:iconst_1        
	//  150  285:iadd            
	//  151  286:istore          6
			l1 = ai1[j1];
	//  152  288:aload           15
	//  153  290:iload           8
	//  154  292:iaload          
	//  155  293:istore          9
			Object obj = ((Object) (GlyphList.unicodeToName(l1)));
	//  156  295:iload           9
	//  157  297:invokestatic    #217 <Method String GlyphList.unicodeToName(int)>
	//  158  300:astore          11
			aobj = ((Object []) (obj));
	//  159  302:aload           11
	//  160  304:astore_3        
			if(obj == null)
	//* 161  305:aload           11
	//* 162  307:ifnonnull       331
				aobj = ((Object []) ((new StringBuilder()).append("a").append(l1).toString()));
	//  163  310:new             #219 <Class StringBuilder>
	//  164  313:dup             
	//  165  314:invokespecial   #220 <Method void StringBuilder()>
	//  166  317:ldc1            #222 <String "a">
	//  167  319:invokevirtual   #226 <Method StringBuilder StringBuilder.append(String)>
	//  168  322:iload           9
	//  169  324:invokevirtual   #229 <Method StringBuilder StringBuilder.append(int)>
	//  170  327:invokevirtual   #232 <Method String StringBuilder.toString()>
	//  171  330:astore_3        
			aobj = ((Object []) (new PdfName(((String) (aobj)))));
	//  172  331:new             #234 <Class PdfName>
	//  173  334:dup             
	//  174  335:aload_3         
	//  175  336:invokespecial   #235 <Method void PdfName(String)>
	//  176  339:astore_3        
			pdfarray.add(((PdfObject) (aobj)));
	//  177  340:aload           13
	//  178  342:aload_3         
	//  179  343:invokevirtual   #211 <Method boolean PdfArray.add(PdfObject)>
	//  180  346:pop             
			obj = ((Object) (new PdfStream(((Type3Glyph)char2glyph.get(((Object) (Integer.valueOf(l1))))).toPdf(((PdfWriter) (null))))));
	//  181  347:new             #237 <Class PdfStream>
	//  182  350:dup             
	//  183  351:aload_0         
	//  184  352:getfield        #37  <Field HashMap char2glyph>
	//  185  355:iload           9
	//  186  357:invokestatic    #99  <Method Integer Integer.valueOf(int)>
	//  187  360:invokevirtual   #103 <Method Object HashMap.get(Object)>
	//  188  363:checkcast       #105 <Class Type3Glyph>
	//  189  366:aconst_null     
	//  190  367:invokevirtual   #241 <Method byte[] Type3Glyph.toPdf(PdfWriter)>
	//  191  370:invokespecial   #244 <Method void PdfStream(byte[])>
	//  192  373:astore          11
			((PdfStream) (obj)).flateCompress(compressionLevel);
	//  193  375:aload           11
	//  194  377:aload_0         
	//  195  378:getfield        #247 <Field int compressionLevel>
	//  196  381:invokevirtual   #250 <Method void PdfStream.flateCompress(int)>
			pdfdictionary1.put(((PdfName) (aobj)), ((PdfObject) (pdfwriter.addToBody(((PdfObject) (obj))).getIndirectReference())));
	//  197  384:aload           14
	//  198  386:aload_3         
	//  199  387:aload_1         
	//  200  388:aload           11
	//  201  390:invokevirtual   #256 <Method PdfIndirectObject PdfWriter.addToBody(PdfObject)>
	//  202  393:invokevirtual   #262 <Method PdfIndirectReference PdfIndirectObject.getIndirectReference()>
	//  203  396:invokevirtual   #265 <Method void PdfDictionary.put(PdfName, PdfObject)>
		}

	//  204  399:iload           8
	//  205  401:iconst_1        
	//  206  402:iadd            
	//  207  403:istore          8
	//* 208  405:goto            238
		aobj = ((Object []) (new PdfDictionary(PdfName.FONT)));
	//  209  408:new             #201 <Class PdfDictionary>
	//  210  411:dup             
	//  211  412:getstatic       #269 <Field PdfName PdfName.FONT>
	//  212  415:invokespecial   #272 <Method void PdfDictionary(PdfName)>
	//  213  418:astore_3        
		((PdfDictionary) (aobj)).put(PdfName.SUBTYPE, ((PdfObject) (PdfName.TYPE3)));
	//  214  419:aload_3         
	//  215  420:getstatic       #275 <Field PdfName PdfName.SUBTYPE>
	//  216  423:getstatic       #278 <Field PdfName PdfName.TYPE3>
	//  217  426:invokevirtual   #265 <Method void PdfDictionary.put(PdfName, PdfObject)>
		PdfDictionary pdfdictionary;
		if(colorized)
	//* 218  429:aload_0         
	//* 219  430:getfield        #49  <Field boolean colorized>
	//* 220  433:ifeq            645
			((PdfDictionary) (aobj)).put(PdfName.FONTBBOX, ((PdfObject) (new PdfRectangle(0.0F, 0.0F, 0.0F, 0.0F))));
	//  221  436:aload_3         
	//  222  437:getstatic       #281 <Field PdfName PdfName.FONTBBOX>
	//  223  440:new             #283 <Class PdfRectangle>
	//  224  443:dup             
	//  225  444:fconst_0        
	//  226  445:fconst_0        
	//  227  446:fconst_0        
	//  228  447:fconst_0        
	//  229  448:invokespecial   #286 <Method void PdfRectangle(float, float, float, float)>
	//  230  451:invokevirtual   #265 <Method void PdfDictionary.put(PdfName, PdfObject)>
		else
	//* 231  454:aload_3         
	//* 232  455:getstatic       #289 <Field PdfName PdfName.FONTMATRIX>
	//* 233  458:new             #198 <Class PdfArray>
	//* 234  461:dup             
	//* 235  462:bipush          6
	//* 236  464:newarray        float[]
	//* 237  466:dup             
	//* 238  467:iconst_0        
	//* 239  468:ldc2            #290 <Float 0.001F>
	//* 240  471:fastore         
	//* 241  472:dup             
	//* 242  473:iconst_1        
	//* 243  474:fconst_0        
	//* 244  475:fastore         
	//* 245  476:dup             
	//* 246  477:iconst_2        
	//* 247  478:fconst_0        
	//* 248  479:fastore         
	//* 249  480:dup             
	//* 250  481:iconst_3        
	//* 251  482:ldc2            #290 <Float 0.001F>
	//* 252  485:fastore         
	//* 253  486:dup             
	//* 254  487:iconst_4        
	//* 255  488:fconst_0        
	//* 256  489:fastore         
	//* 257  490:dup             
	//* 258  491:iconst_5        
	//* 259  492:fconst_0        
	//* 260  493:fastore         
	//* 261  494:invokespecial   #293 <Method void PdfArray(float[])>
	//* 262  497:invokevirtual   #265 <Method void PdfDictionary.put(PdfName, PdfObject)>
	//* 263  500:aload_3         
	//* 264  501:getstatic       #296 <Field PdfName PdfName.CHARPROCS>
	//* 265  504:aload_1         
	//* 266  505:aload           14
	//* 267  507:invokevirtual   #256 <Method PdfIndirectObject PdfWriter.addToBody(PdfObject)>
	//* 268  510:invokevirtual   #262 <Method PdfIndirectReference PdfIndirectObject.getIndirectReference()>
	//* 269  513:invokevirtual   #265 <Method void PdfDictionary.put(PdfName, PdfObject)>
	//* 270  516:new             #201 <Class PdfDictionary>
	//* 271  519:dup             
	//* 272  520:invokespecial   #202 <Method void PdfDictionary()>
	//* 273  523:astore          11
	//* 274  525:aload           11
	//* 275  527:getstatic       #299 <Field PdfName PdfName.DIFFERENCES>
	//* 276  530:aload           13
	//* 277  532:invokevirtual   #265 <Method void PdfDictionary.put(PdfName, PdfObject)>
	//* 278  535:aload_3         
	//* 279  536:getstatic       #302 <Field PdfName PdfName.ENCODING>
	//* 280  539:aload_1         
	//* 281  540:aload           11
	//* 282  542:invokevirtual   #256 <Method PdfIndirectObject PdfWriter.addToBody(PdfObject)>
	//* 283  545:invokevirtual   #262 <Method PdfIndirectReference PdfIndirectObject.getIndirectReference()>
	//* 284  548:invokevirtual   #265 <Method void PdfDictionary.put(PdfName, PdfObject)>
	//* 285  551:aload_3         
	//* 286  552:getstatic       #305 <Field PdfName PdfName.FIRSTCHAR>
	//* 287  555:new             #204 <Class PdfNumber>
	//* 288  558:dup             
	//* 289  559:iload           4
	//* 290  561:invokespecial   #207 <Method void PdfNumber(int)>
	//* 291  564:invokevirtual   #265 <Method void PdfDictionary.put(PdfName, PdfObject)>
	//* 292  567:aload_3         
	//* 293  568:getstatic       #308 <Field PdfName PdfName.LASTCHAR>
	//* 294  571:new             #204 <Class PdfNumber>
	//* 295  574:dup             
	//* 296  575:iload           7
	//* 297  577:invokespecial   #207 <Method void PdfNumber(int)>
	//* 298  580:invokevirtual   #265 <Method void PdfDictionary.put(PdfName, PdfObject)>
	//* 299  583:aload_3         
	//* 300  584:getstatic       #311 <Field PdfName PdfName.WIDTHS>
	//* 301  587:aload_1         
	//* 302  588:new             #198 <Class PdfArray>
	//* 303  591:dup             
	//* 304  592:aload           12
	//* 305  594:invokespecial   #314 <Method void PdfArray(int[])>
	//* 306  597:invokevirtual   #256 <Method PdfIndirectObject PdfWriter.addToBody(PdfObject)>
	//* 307  600:invokevirtual   #262 <Method PdfIndirectReference PdfIndirectObject.getIndirectReference()>
	//* 308  603:invokevirtual   #265 <Method void PdfDictionary.put(PdfName, PdfObject)>
	//* 309  606:aload_0         
	//* 310  607:getfield        #45  <Field PageResources pageResources>
	//* 311  610:invokevirtual   #317 <Method boolean PageResources.hasResources()>
	//* 312  613:ifeq            637
	//* 313  616:aload_3         
	//* 314  617:getstatic       #320 <Field PdfName PdfName.RESOURCES>
	//* 315  620:aload_1         
	//* 316  621:aload_0         
	//* 317  622:getfield        #45  <Field PageResources pageResources>
	//* 318  625:invokevirtual   #324 <Method PdfDictionary PageResources.getResources()>
	//* 319  628:invokevirtual   #256 <Method PdfIndirectObject PdfWriter.addToBody(PdfObject)>
	//* 320  631:invokevirtual   #262 <Method PdfIndirectReference PdfIndirectObject.getIndirectReference()>
	//* 321  634:invokevirtual   #265 <Method void PdfDictionary.put(PdfName, PdfObject)>
	//* 322  637:aload_1         
	//* 323  638:aload_3         
	//* 324  639:aload_2         
	//* 325  640:invokevirtual   #327 <Method PdfIndirectObject PdfWriter.addToBody(PdfObject, PdfIndirectReference)>
	//* 326  643:pop             
	//* 327  644:return          
			((PdfDictionary) (aobj)).put(PdfName.FONTBBOX, ((PdfObject) (new PdfRectangle(llx, lly, urx, ury))));
	//  328  645:aload_3         
	//  329  646:getstatic       #281 <Field PdfName PdfName.FONTBBOX>
	//  330  649:new             #283 <Class PdfRectangle>
	//  331  652:dup             
	//  332  653:aload_0         
	//  333  654:getfield        #40  <Field float llx>
	//  334  657:aload_0         
	//  335  658:getfield        #117 <Field float lly>
	//  336  661:aload_0         
	//  337  662:getfield        #119 <Field float urx>
	//  338  665:aload_0         
	//  339  666:getfield        #121 <Field float ury>
	//  340  669:invokespecial   #286 <Method void PdfRectangle(float, float, float, float)>
	//  341  672:invokevirtual   #265 <Method void PdfDictionary.put(PdfName, PdfObject)>
		((PdfDictionary) (aobj)).put(PdfName.FONTMATRIX, ((PdfObject) (new PdfArray(new float[] {
			0.001F, 0.0F, 0.0F, 0.001F, 0.0F, 0.0F
		}))));
		((PdfDictionary) (aobj)).put(PdfName.CHARPROCS, ((PdfObject) (pdfwriter.addToBody(((PdfObject) (pdfdictionary1))).getIndirectReference())));
		pdfdictionary = new PdfDictionary();
		pdfdictionary.put(PdfName.DIFFERENCES, ((PdfObject) (pdfarray)));
		((PdfDictionary) (aobj)).put(PdfName.ENCODING, ((PdfObject) (pdfwriter.addToBody(((PdfObject) (pdfdictionary))).getIndirectReference())));
		((PdfDictionary) (aobj)).put(PdfName.FIRSTCHAR, ((PdfObject) (new PdfNumber(i))));
		((PdfDictionary) (aobj)).put(PdfName.LASTCHAR, ((PdfObject) (new PdfNumber(l))));
		((PdfDictionary) (aobj)).put(PdfName.WIDTHS, ((PdfObject) (pdfwriter.addToBody(((PdfObject) (new PdfArray(ai)))).getIndirectReference())));
		if(pageResources.hasResources())
			((PdfDictionary) (aobj)).put(PdfName.RESOURCES, ((PdfObject) (pdfwriter.addToBody(((PdfObject) (pageResources.getResources()))).getIndirectReference())));
		pdfwriter.addToBody(((PdfObject) (aobj)), pdfindirectreference);
	//* 342  675:goto            454
	//* 343  678:goto            199
	}

	private HashMap char2glyph;
	private boolean colorized;
	private float llx;
	private float lly;
	private PageResources pageResources;
	private float urx;
	private float ury;
	private boolean usedSlot[];
	private IntHashtable widths3;
	private PdfWriter writer;
}
