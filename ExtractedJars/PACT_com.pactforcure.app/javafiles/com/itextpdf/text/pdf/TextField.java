// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;

import com.itextpdf.text.*;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;

// Referenced classes of package com.itextpdf.text.pdf:
//			BaseField, FontSelector, BaseFont, PdfArray, 
//			PdfNumber, PdfString, PdfName, PdfFormField, 
//			PdfAppearance, GrayColor, ColumnText, PdfAnnotation, 
//			PdfBorderDictionary, PdfDashPattern, PdfWriter

public class TextField extends BaseField
{

	public TextField(PdfWriter pdfwriter, Rectangle rectangle, String s)
	{
		super(pdfwriter, rectangle, s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #26  <Method void BaseField(PdfWriter, Rectangle, String)>
		choiceSelections = new ArrayList();
	//    5    7:aload_0         
	//    6    8:new             #28  <Class ArrayList>
	//    7   11:dup             
	//    8   12:invokespecial   #31  <Method void ArrayList()>
	//    9   15:putfield        #33  <Field ArrayList choiceSelections>
		visibleTopChoice = -1;
	//   10   18:aload_0         
	//   11   19:iconst_m1       
	//   12   20:putfield        #35  <Field int visibleTopChoice>
	//   13   23:return          
	}

	private static void changeFontSize(Phrase phrase, float f)
	{
		for(int i = 0; i < phrase.size(); i++)
	//*   0    0:iconst_0        
	//*   1    1:istore_2        
	//*   2    2:iload_2         
	//*   3    3:aload_0         
	//*   4    4:invokevirtual   #44  <Method int Phrase.size()>
	//*   5    7:icmpge          32
			((Chunk)phrase.get(i)).getFont().setSize(f);
	//    6   10:aload_0         
	//    7   11:iload_2         
	//    8   12:invokevirtual   #48  <Method Object Phrase.get(int)>
	//    9   15:checkcast       #50  <Class Chunk>
	//   10   18:invokevirtual   #54  <Method Font Chunk.getFont()>
	//   11   21:fload_1         
	//   12   22:invokevirtual   #60  <Method void Font.setSize(float)>

	//   13   25:iload_2         
	//   14   26:iconst_1        
	//   15   27:iadd            
	//   16   28:istore_2        
	//*  17   29:goto            2
	//   18   32:return          
	}

	private static boolean checkRTL(String s)
	{
		if(s != null && s.length() != 0)
	//*   0    0:aload_0         
	//*   1    1:ifnull          11
	//*   2    4:aload_0         
	//*   3    5:invokevirtual   #67  <Method int String.length()>
	//*   4    8:ifne            13
	//*   5   11:iconst_0        
	//*   6   12:ireturn         
		{
			s = ((String) (s.toCharArray()));
	//    7   13:aload_0         
	//    8   14:invokevirtual   #71  <Method char[] String.toCharArray()>
	//    9   17:astore_0        
			int i = 0;
	//   10   18:iconst_0        
	//   11   19:istore_1        
			while(i < s.length) 
	//*  12   20:iload_1         
	//*  13   21:aload_0         
	//*  14   22:arraylength     
	//*  15   23:icmpge          11
			{
				char c = s[i];
	//   16   26:aload_0         
	//   17   27:iload_1         
	//   18   28:caload          
	//   19   29:istore_2        
				if(c >= '\u0590' && c < '\u0780')
	//*  20   30:iload_2         
	//*  21   31:sipush          1424
	//*  22   34:icmplt          46
	//*  23   37:iload_2         
	//*  24   38:sipush          1920
	//*  25   41:icmpge          46
					return true;
	//   26   44:iconst_1        
	//   27   45:ireturn         
				i++;
	//   28   46:iload_1         
	//   29   47:iconst_1        
	//   30   48:iadd            
	//   31   49:istore_1        
			}
		}
		return false;
	//*  32   50:goto            20
	}

	private Phrase composePhrase(String s, BaseFont basefont, BaseColor basecolor, float f)
	{
		if(extensionFont == null && (substitutionFonts == null || substitutionFonts.isEmpty()))
	//*   0    0:aload_0         
	//*   1    1:getfield        #75  <Field BaseFont extensionFont>
	//*   2    4:ifnonnull       52
	//*   3    7:aload_0         
	//*   4    8:getfield        #77  <Field ArrayList substitutionFonts>
	//*   5   11:ifnull          24
	//*   6   14:aload_0         
	//*   7   15:getfield        #77  <Field ArrayList substitutionFonts>
	//*   8   18:invokevirtual   #81  <Method boolean ArrayList.isEmpty()>
	//*   9   21:ifeq            52
			return new Phrase(new Chunk(s, new Font(basefont, f, 0, basecolor)));
	//   10   24:new             #40  <Class Phrase>
	//   11   27:dup             
	//   12   28:new             #50  <Class Chunk>
	//   13   31:dup             
	//   14   32:aload_1         
	//   15   33:new             #56  <Class Font>
	//   16   36:dup             
	//   17   37:aload_2         
	//   18   38:fload           4
	//   19   40:iconst_0        
	//   20   41:aload_3         
	//   21   42:invokespecial   #84  <Method void Font(BaseFont, float, int, BaseColor)>
	//   22   45:invokespecial   #87  <Method void Chunk(String, Font)>
	//   23   48:invokespecial   #90  <Method void Phrase(Chunk)>
	//   24   51:areturn         
		FontSelector fontselector = new FontSelector();
	//   25   52:new             #92  <Class FontSelector>
	//   26   55:dup             
	//   27   56:invokespecial   #93  <Method void FontSelector()>
	//   28   59:astore          6
		fontselector.addFont(new Font(basefont, f, 0, basecolor));
	//   29   61:aload           6
	//   30   63:new             #56  <Class Font>
	//   31   66:dup             
	//   32   67:aload_2         
	//   33   68:fload           4
	//   34   70:iconst_0        
	//   35   71:aload_3         
	//   36   72:invokespecial   #84  <Method void Font(BaseFont, float, int, BaseColor)>
	//   37   75:invokevirtual   #97  <Method void FontSelector.addFont(Font)>
		if(extensionFont != null)
	//*  38   78:aload_0         
	//*  39   79:getfield        #75  <Field BaseFont extensionFont>
	//*  40   82:ifnull          105
			fontselector.addFont(new Font(extensionFont, f, 0, basecolor));
	//   41   85:aload           6
	//   42   87:new             #56  <Class Font>
	//   43   90:dup             
	//   44   91:aload_0         
	//   45   92:getfield        #75  <Field BaseFont extensionFont>
	//   46   95:fload           4
	//   47   97:iconst_0        
	//   48   98:aload_3         
	//   49   99:invokespecial   #84  <Method void Font(BaseFont, float, int, BaseColor)>
	//   50  102:invokevirtual   #97  <Method void FontSelector.addFont(Font)>
		if(substitutionFonts != null)
	//*  51  105:aload_0         
	//*  52  106:getfield        #77  <Field ArrayList substitutionFonts>
	//*  53  109:ifnull          164
		{
			for(int i = 0; i < substitutionFonts.size(); i++)
	//*  54  112:iconst_0        
	//*  55  113:istore          5
	//*  56  115:iload           5
	//*  57  117:aload_0         
	//*  58  118:getfield        #77  <Field ArrayList substitutionFonts>
	//*  59  121:invokevirtual   #98  <Method int ArrayList.size()>
	//*  60  124:icmpge          164
				fontselector.addFont(new Font((BaseFont)substitutionFonts.get(i), f, 0, basecolor));
	//   61  127:aload           6
	//   62  129:new             #56  <Class Font>
	//   63  132:dup             
	//   64  133:aload_0         
	//   65  134:getfield        #77  <Field ArrayList substitutionFonts>
	//   66  137:iload           5
	//   67  139:invokevirtual   #99  <Method Object ArrayList.get(int)>
	//   68  142:checkcast       #101 <Class BaseFont>
	//   69  145:fload           4
	//   70  147:iconst_0        
	//   71  148:aload_3         
	//   72  149:invokespecial   #84  <Method void Font(BaseFont, float, int, BaseColor)>
	//   73  152:invokevirtual   #97  <Method void FontSelector.addFont(Font)>

	//   74  155:iload           5
	//   75  157:iconst_1        
	//   76  158:iadd            
	//   77  159:istore          5
		}
	//*  78  161:goto            115
		return fontselector.process(s);
	//   79  164:aload           6
	//   80  166:aload_1         
	//   81  167:invokevirtual   #105 <Method Phrase FontSelector.process(String)>
	//   82  170:areturn         
	}

	private int getTopChoice()
	{
		if(choiceSelections != null && choiceSelections.size() != 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #33  <Field ArrayList choiceSelections>
	//*   2    4:ifnull          17
	//*   3    7:aload_0         
	//*   4    8:getfield        #33  <Field ArrayList choiceSelections>
	//*   5   11:invokevirtual   #98  <Method int ArrayList.size()>
	//*   6   14:ifne            19
	//*   7   17:iconst_0        
	//*   8   18:ireturn         
		{
			Integer integer = (Integer)choiceSelections.get(0);
	//    9   19:aload_0         
	//   10   20:getfield        #33  <Field ArrayList choiceSelections>
	//   11   23:iconst_0        
	//   12   24:invokevirtual   #99  <Method Object ArrayList.get(int)>
	//   13   27:checkcast       #108 <Class Integer>
	//   14   30:astore_1        
			if(integer == null)
	//*  15   31:aload_1         
	//*  16   32:ifnonnull       37
				return 0;
	//   17   35:iconst_0        
	//   18   36:ireturn         
			if(choices != null)
	//*  19   37:aload_0         
	//*  20   38:getfield        #110 <Field String[] choices>
	//*  21   41:ifnull          17
				if(visibleTopChoice != -1)
	//*  22   44:aload_0         
	//*  23   45:getfield        #35  <Field int visibleTopChoice>
	//*  24   48:iconst_m1       
	//*  25   49:icmpeq          57
					return visibleTopChoice;
	//   26   52:aload_0         
	//   27   53:getfield        #35  <Field int visibleTopChoice>
	//   28   56:ireturn         
				else
					return Math.max(0, Math.min(integer.intValue(), choices.length));
	//   29   57:iconst_0        
	//   30   58:aload_1         
	//   31   59:invokevirtual   #113 <Method int Integer.intValue()>
	//   32   62:aload_0         
	//   33   63:getfield        #110 <Field String[] choices>
	//   34   66:arraylength     
	//   35   67:invokestatic    #119 <Method int Math.min(int, int)>
	//   36   70:invokestatic    #122 <Method int Math.max(int, int)>
	//   37   73:ireturn         
		}
		return 0;
	}

	public static String obfuscatePassword(String s)
	{
		char ac[] = new char[s.length()];
	//    0    0:aload_0         
	//    1    1:invokevirtual   #67  <Method int String.length()>
	//    2    4:newarray        char[]
	//    3    6:astore_2        
		for(int i = 0; i < s.length(); i++)
	//*   4    7:iconst_0        
	//*   5    8:istore_1        
	//*   6    9:iload_1         
	//*   7   10:aload_0         
	//*   8   11:invokevirtual   #67  <Method int String.length()>
	//*   9   14:icmpge          29
			ac[i] = '*';
	//   10   17:aload_2         
	//   11   18:iload_1         
	//   12   19:bipush          42
	//   13   21:castore         

	//   14   22:iload_1         
	//   15   23:iconst_1        
	//   16   24:iadd            
	//   17   25:istore_1        
	//*  18   26:goto            9
		return new String(ac);
	//   19   29:new             #64  <Class String>
	//   20   32:dup             
	//   21   33:aload_2         
	//   22   34:invokespecial   #127 <Method void String(char[])>
	//   23   37:areturn         
	}

	public static String removeCRLF(String s)
	{
		Object obj;
label0:
		{
			if(s.indexOf('\n') < 0)
	//*   0    0:aload_0         
	//*   1    1:bipush          10
	//*   2    3:invokevirtual   #132 <Method int String.indexOf(int)>
	//*   3    6:ifge            21
			{
				obj = ((Object) (s));
	//    4    9:aload_0         
	//    5   10:astore          4
				if(s.indexOf('\r') < 0)
					break label0;
	//    6   12:aload_0         
	//    7   13:bipush          13
	//    8   15:invokevirtual   #132 <Method int String.indexOf(int)>
	//    9   18:iflt            134
			}
			s = ((String) (s.toCharArray()));
	//   10   21:aload_0         
	//   11   22:invokevirtual   #71  <Method char[] String.toCharArray()>
	//   12   25:astore_0        
			obj = ((Object) (new StringBuffer(s.length)));
	//   13   26:new             #134 <Class StringBuffer>
	//   14   29:dup             
	//   15   30:aload_0         
	//   16   31:arraylength     
	//   17   32:invokespecial   #137 <Method void StringBuffer(int)>
	//   18   35:astore          4
			int i = 0;
	//   19   37:iconst_0        
	//   20   38:istore_2        
			while(i < s.length) 
	//*  21   39:iload_2         
	//*  22   40:aload_0         
	//*  23   41:arraylength     
	//*  24   42:icmpge          127
			{
				char c = s[i];
	//   25   45:aload_0         
	//   26   46:iload_2         
	//   27   47:caload          
	//   28   48:istore_1        
				int j;
				if(c == '\n')
	//*  29   49:iload_1         
	//*  30   50:bipush          10
	//*  31   52:icmpne          72
				{
					((StringBuffer) (obj)).append(' ');
	//   32   55:aload           4
	//   33   57:bipush          32
	//   34   59:invokevirtual   #141 <Method StringBuffer StringBuffer.append(char)>
	//   35   62:pop             
					j = i;
	//   36   63:iload_2         
	//   37   64:istore_3        
				} else
	//*  38   65:iload_3         
	//*  39   66:iconst_1        
	//*  40   67:iadd            
	//*  41   68:istore_2        
	//*  42   69:goto            39
				if(c == '\r')
	//*  43   72:iload_1         
	//*  44   73:bipush          13
	//*  45   75:icmpne          115
				{
					((StringBuffer) (obj)).append(' ');
	//   46   78:aload           4
	//   47   80:bipush          32
	//   48   82:invokevirtual   #141 <Method StringBuffer StringBuffer.append(char)>
	//   49   85:pop             
					j = i;
	//   50   86:iload_2         
	//   51   87:istore_3        
					if(i < s.length - 1)
	//*  52   88:iload_2         
	//*  53   89:aload_0         
	//*  54   90:arraylength     
	//*  55   91:iconst_1        
	//*  56   92:isub            
	//*  57   93:icmpge          65
					{
						j = i;
	//   58   96:iload_2         
	//   59   97:istore_3        
						if(s[i + 1] == '\n')
	//*  60   98:aload_0         
	//*  61   99:iload_2         
	//*  62  100:iconst_1        
	//*  63  101:iadd            
	//*  64  102:caload          
	//*  65  103:bipush          10
	//*  66  105:icmpne          65
							j = i + 1;
	//   67  108:iload_2         
	//   68  109:iconst_1        
	//   69  110:iadd            
	//   70  111:istore_3        
					}
				} else
	//*  71  112:goto            65
				{
					((StringBuffer) (obj)).append(c);
	//   72  115:aload           4
	//   73  117:iload_1         
	//   74  118:invokevirtual   #141 <Method StringBuffer StringBuffer.append(char)>
	//   75  121:pop             
					j = i;
	//   76  122:iload_2         
	//   77  123:istore_3        
				}
				i = j + 1;
			}
	//*  78  124:goto            65
			obj = ((Object) (((StringBuffer) (obj)).toString()));
	//   79  127:aload           4
	//   80  129:invokevirtual   #145 <Method String StringBuffer.toString()>
	//   81  132:astore          4
		}
		return ((String) (obj));
	//   82  134:aload           4
	//   83  136:areturn         
	}

	private void writeMultipleValues(PdfFormField pdfformfield, String as[][])
	{
		PdfArray pdfarray = new PdfArray();
	//    0    0:new             #149 <Class PdfArray>
	//    1    3:dup             
	//    2    4:invokespecial   #150 <Method void PdfArray()>
	//    3    7:astore          5
		PdfArray pdfarray1 = new PdfArray();
	//    4    9:new             #149 <Class PdfArray>
	//    5   12:dup             
	//    6   13:invokespecial   #150 <Method void PdfArray()>
	//    7   16:astore          6
		int i = 0;
	//    8   18:iconst_0        
	//    9   19:istore_3        
		while(i < choiceSelections.size()) 
	//*  10   20:iload_3         
	//*  11   21:aload_0         
	//*  12   22:getfield        #33  <Field ArrayList choiceSelections>
	//*  13   25:invokevirtual   #98  <Method int ArrayList.size()>
	//*  14   28:icmpge          122
		{
			int j = ((Integer)choiceSelections.get(i)).intValue();
	//   15   31:aload_0         
	//   16   32:getfield        #33  <Field ArrayList choiceSelections>
	//   17   35:iload_3         
	//   18   36:invokevirtual   #99  <Method Object ArrayList.get(int)>
	//   19   39:checkcast       #108 <Class Integer>
	//   20   42:invokevirtual   #113 <Method int Integer.intValue()>
	//   21   45:istore          4
			pdfarray.add(((PdfObject) (new PdfNumber(j))));
	//   22   47:aload           5
	//   23   49:new             #152 <Class PdfNumber>
	//   24   52:dup             
	//   25   53:iload           4
	//   26   55:invokespecial   #153 <Method void PdfNumber(int)>
	//   27   58:invokevirtual   #157 <Method boolean PdfArray.add(PdfObject)>
	//   28   61:pop             
			if(as != null)
	//*  29   62:aload_2         
	//*  30   63:ifnull          92
				pdfarray1.add(((PdfObject) (new PdfString(as[j][0]))));
	//   31   66:aload           6
	//   32   68:new             #159 <Class PdfString>
	//   33   71:dup             
	//   34   72:aload_2         
	//   35   73:iload           4
	//   36   75:aaload          
	//   37   76:iconst_0        
	//   38   77:aaload          
	//   39   78:invokespecial   #162 <Method void PdfString(String)>
	//   40   81:invokevirtual   #157 <Method boolean PdfArray.add(PdfObject)>
	//   41   84:pop             
			else
	//*  42   85:iload_3         
	//*  43   86:iconst_1        
	//*  44   87:iadd            
	//*  45   88:istore_3        
	//*  46   89:goto            20
			if(choices != null)
	//*  47   92:aload_0         
	//*  48   93:getfield        #110 <Field String[] choices>
	//*  49   96:ifnull          85
				pdfarray1.add(((PdfObject) (new PdfString(choices[j]))));
	//   50   99:aload           6
	//   51  101:new             #159 <Class PdfString>
	//   52  104:dup             
	//   53  105:aload_0         
	//   54  106:getfield        #110 <Field String[] choices>
	//   55  109:iload           4
	//   56  111:aaload          
	//   57  112:invokespecial   #162 <Method void PdfString(String)>
	//   58  115:invokevirtual   #157 <Method boolean PdfArray.add(PdfObject)>
	//   59  118:pop             
			i++;
		}
	//*  60  119:goto            85
		pdfformfield.put(PdfName.V, ((PdfObject) (pdfarray1)));
	//   61  122:aload_1         
	//   62  123:getstatic       #168 <Field PdfName PdfName.V>
	//   63  126:aload           6
	//   64  128:invokevirtual   #174 <Method void PdfFormField.put(PdfName, PdfObject)>
		pdfformfield.put(PdfName.I, ((PdfObject) (pdfarray)));
	//   65  131:aload_1         
	//   66  132:getstatic       #176 <Field PdfName PdfName.I>
	//   67  135:aload           5
	//   68  137:invokevirtual   #174 <Method void PdfFormField.put(PdfName, PdfObject)>
	//   69  140:return          
	}

	public void addChoiceSelection(int i)
	{
		if((options & 0x200000) != 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #180 <Field int options>
	//*   2    4:ldc1            #181 <Int 0x200000>
	//*   3    6:iand            
	//*   4    7:ifeq            22
			choiceSelections.add(((Object) (Integer.valueOf(i))));
	//    5   10:aload_0         
	//    6   11:getfield        #33  <Field ArrayList choiceSelections>
	//    7   14:iload_1         
	//    8   15:invokestatic    #185 <Method Integer Integer.valueOf(int)>
	//    9   18:invokevirtual   #188 <Method boolean ArrayList.add(Object)>
	//   10   21:pop             
	//   11   22:return          
	}

	public PdfAppearance getAppearance()
		throws IOException, DocumentException
	{
		float f3;
		float f5;
		float f6;
		float f8;
		float f9;
		int i;
		Object obj;
		Object obj1;
		PdfAppearance pdfappearance;
		Object obj2;
		pdfappearance = getBorderAppearance();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #197 <Method PdfAppearance getBorderAppearance()>
	//    2    4:astore          13
		pdfappearance.beginVariableText();
	//    3    6:aload           13
	//    4    8:invokevirtual   #202 <Method void PdfAppearance.beginVariableText()>
		if(text == null || text.length() == 0)
	//*   5   11:aload_0         
	//*   6   12:getfield        #205 <Field String text>
	//*   7   15:ifnull          28
	//*   8   18:aload_0         
	//*   9   19:getfield        #205 <Field String text>
	//*  10   22:invokevirtual   #67  <Method int String.length()>
	//*  11   25:ifne            36
		{
			pdfappearance.endVariableText();
	//   12   28:aload           13
	//   13   30:invokevirtual   #208 <Method void PdfAppearance.endVariableText()>
			return pdfappearance;
	//   14   33:aload           13
	//   15   35:areturn         
		}
		float f;
		float f10;
		float f11;
		if(borderStyle == 2 || borderStyle == 3)
	//*  16   36:aload_0         
	//*  17   37:getfield        #211 <Field int borderStyle>
	//*  18   40:iconst_2        
	//*  19   41:icmpeq          52
	//*  20   44:aload_0         
	//*  21   45:getfield        #211 <Field int borderStyle>
	//*  22   48:iconst_3        
	//*  23   49:icmpne          564
			i = 1;
	//   24   52:iconst_1        
	//   25   53:istore          9
		else
	//*  26   55:aload_0         
	//*  27   56:getfield        #215 <Field Rectangle box>
	//*  28   59:invokevirtual   #221 <Method float Rectangle.getHeight()>
	//*  29   62:aload_0         
	//*  30   63:getfield        #224 <Field float borderWidth>
	//*  31   66:fconst_2        
	//*  32   67:fmul            
	//*  33   68:fsub            
	//*  34   69:aload_0         
	//*  35   70:getfield        #226 <Field float extraMarginTop>
	//*  36   73:fsub            
	//*  37   74:fstore          4
	//*  38   76:aload_0         
	//*  39   77:getfield        #224 <Field float borderWidth>
	//*  40   80:fstore_2        
	//*  41   81:fload_2         
	//*  42   82:fstore_1        
	//*  43   83:fload           4
	//*  44   85:fstore_3        
	//*  45   86:iload           9
	//*  46   88:ifeq            105
	//*  47   91:fload           4
	//*  48   93:aload_0         
	//*  49   94:getfield        #224 <Field float borderWidth>
	//*  50   97:fconst_2        
	//*  51   98:fmul            
	//*  52   99:fsub            
	//*  53  100:fstore_3        
	//*  54  101:fload_2         
	//*  55  102:fconst_2        
	//*  56  103:fmul            
	//*  57  104:fstore_1        
	//*  58  105:fload_1         
	//*  59  106:fconst_1        
	//*  60  107:invokestatic    #229 <Method float Math.max(float, float)>
	//*  61  110:fstore          6
	//*  62  112:fload_1         
	//*  63  113:fload           6
	//*  64  115:invokestatic    #231 <Method float Math.min(float, float)>
	//*  65  118:fstore          5
	//*  66  120:aload           13
	//*  67  122:invokevirtual   #234 <Method void PdfAppearance.saveState()>
	//*  68  125:aload           13
	//*  69  127:fload           5
	//*  70  129:fload           5
	//*  71  131:aload_0         
	//*  72  132:getfield        #215 <Field Rectangle box>
	//*  73  135:invokevirtual   #237 <Method float Rectangle.getWidth()>
	//*  74  138:fconst_2        
	//*  75  139:fload           5
	//*  76  141:fmul            
	//*  77  142:fsub            
	//*  78  143:aload_0         
	//*  79  144:getfield        #215 <Field Rectangle box>
	//*  80  147:invokevirtual   #221 <Method float Rectangle.getHeight()>
	//*  81  150:fconst_2        
	//*  82  151:fload           5
	//*  83  153:fmul            
	//*  84  154:fsub            
	//*  85  155:invokevirtual   #241 <Method void PdfAppearance.rectangle(float, float, float, float)>
	//*  86  158:aload           13
	//*  87  160:invokevirtual   #244 <Method void PdfAppearance.clip()>
	//*  88  163:aload           13
	//*  89  165:invokevirtual   #247 <Method void PdfAppearance.newPath()>
	//*  90  168:aload_0         
	//*  91  169:getfield        #180 <Field int options>
	//*  92  172:sipush          8192
	//*  93  175:iand            
	//*  94  176:ifeq            570
	//*  95  179:aload_0         
	//*  96  180:getfield        #205 <Field String text>
	//*  97  183:invokestatic    #249 <Method String obfuscatePassword(String)>
	//*  98  186:astore          11
	//*  99  188:aload_0         
	//* 100  189:invokevirtual   #253 <Method BaseFont getRealFont()>
	//* 101  192:astore          14
	//* 102  194:aload_0         
	//* 103  195:getfield        #257 <Field BaseColor textColor>
	//* 104  198:ifnonnull       602
	//* 105  201:getstatic       #263 <Field GrayColor GrayColor.GRAYBLACK>
	//* 106  204:astore          12
	//* 107  206:aload           11
	//* 108  208:invokestatic    #265 <Method boolean checkRTL(String)>
	//* 109  211:ifeq            611
	//* 110  214:iconst_2        
	//* 111  215:istore          9
	//* 112  217:aload_0         
	//* 113  218:getfield        #268 <Field float fontSize>
	//* 114  221:fstore          4
	//* 115  223:aload_0         
	//* 116  224:aload           11
	//* 117  226:aload           14
	//* 118  228:aload           12
	//* 119  230:fload           4
	//* 120  232:invokespecial   #270 <Method Phrase composePhrase(String, BaseFont, BaseColor, float)>
	//* 121  235:astore          12
	//* 122  237:aload_0         
	//* 123  238:getfield        #180 <Field int options>
	//* 124  241:sipush          4096
	//* 125  244:iand            
	//* 126  245:ifeq            625
	//* 127  248:aload_0         
	//* 128  249:getfield        #215 <Field Rectangle box>
	//* 129  252:invokevirtual   #237 <Method float Rectangle.getWidth()>
	//* 130  255:fstore          7
	//* 131  257:aload_0         
	//* 132  258:getfield        #272 <Field float extraMarginLeft>
	//* 133  261:fstore          8
	//* 134  263:aload           14
	//* 135  265:bipush          8
	//* 136  267:fconst_1        
	//* 137  268:invokevirtual   #276 <Method float BaseFont.getFontDescriptor(int, float)>
	//* 138  271:aload           14
	//* 139  273:bipush          6
	//* 140  275:fconst_1        
	//* 141  276:invokevirtual   #276 <Method float BaseFont.getFontDescriptor(int, float)>
	//* 142  279:fsub            
	//* 143  280:fstore          5
	//* 144  282:new             #278 <Class ColumnText>
	//* 145  285:dup             
	//* 146  286:aconst_null     
	//* 147  287:invokespecial   #281 <Method void ColumnText(PdfContentByte)>
	//* 148  290:astore          11
	//* 149  292:fload           4
	//* 150  294:fstore_2        
	//* 151  295:fload           4
	//* 152  297:fconst_0        
	//* 153  298:fcmpl           
	//* 154  299:ifne            452
	//* 155  302:fload_3         
	//* 156  303:fload           5
	//* 157  305:fdiv            
	//* 158  306:fstore_2        
	//* 159  307:fload_2         
	//* 160  308:fstore_1        
	//* 161  309:fload_2         
	//* 162  310:ldc2            #282 <Float 4F>
	//* 163  313:fcmpl           
	//* 164  314:ifle            438
	//* 165  317:fload_2         
	//* 166  318:fstore_1        
	//* 167  319:fload_2         
	//* 168  320:ldc2            #283 <Float 12F>
	//* 169  323:fcmpl           
	//* 170  324:ifle            331
	//* 171  327:ldc2            #283 <Float 12F>
	//* 172  330:fstore_1        
	//* 173  331:fload_1         
	//* 174  332:ldc2            #282 <Float 4F>
	//* 175  335:fsub            
	//* 176  336:ldc2            #284 <Float 10F>
	//* 177  339:fdiv            
	//* 178  340:ldc2            #285 <Float 0.2F>
	//* 179  343:invokestatic    #229 <Method float Math.max(float, float)>
	//* 180  346:fstore          4
	//* 181  348:aload           11
	//* 182  350:fconst_0        
	//* 183  351:fload_3         
	//* 184  352:fneg            
	//* 185  353:fload           7
	//* 186  355:ldc2            #282 <Float 4F>
	//* 187  358:fload           6
	//* 188  360:fmul            
	//* 189  361:fsub            
	//* 190  362:fload           8
	//* 191  364:fsub            
	//* 192  365:fconst_0        
	//* 193  366:invokevirtual   #288 <Method void ColumnText.setSimpleColumn(float, float, float, float)>
	//* 194  369:aload           11
	//* 195  371:aload_0         
	//* 196  372:getfield        #291 <Field int alignment>
	//* 197  375:invokevirtual   #294 <Method void ColumnText.setAlignment(int)>
	//* 198  378:aload           11
	//* 199  380:iload           9
	//* 200  382:invokevirtual   #297 <Method void ColumnText.setRunDirection(int)>
	//* 201  385:fload_1         
	//* 202  386:fstore_2        
	//* 203  387:fload_2         
	//* 204  388:fstore_1        
	//* 205  389:fload_2         
	//* 206  390:ldc2            #282 <Float 4F>
	//* 207  393:fcmpl           
	//* 208  394:ifle            438
	//* 209  397:aload           11
	//* 210  399:fconst_0        
	//* 211  400:invokevirtual   #300 <Method void ColumnText.setYLine(float)>
	//* 212  403:aload           12
	//* 213  405:fload_2         
	//* 214  406:invokestatic    #302 <Method void changeFontSize(Phrase, float)>
	//* 215  409:aload           11
	//* 216  411:aload           12
	//* 217  413:invokevirtual   #306 <Method void ColumnText.setText(Phrase)>
	//* 218  416:aload           11
	//* 219  418:fload           5
	//* 220  420:fload_2         
	//* 221  421:fmul            
	//* 222  422:invokevirtual   #309 <Method void ColumnText.setLeading(float)>
	//* 223  425:aload           11
	//* 224  427:iconst_1        
	//* 225  428:invokevirtual   #313 <Method int ColumnText.go(boolean)>
	//* 226  431:iconst_2        
	//* 227  432:iand            
	//* 228  433:ifne            617
	//* 229  436:fload_2         
	//* 230  437:fstore_1        
	//* 231  438:fload_1         
	//* 232  439:fstore_2        
	//* 233  440:fload_1         
	//* 234  441:ldc2            #282 <Float 4F>
	//* 235  444:fcmpg           
	//* 236  445:ifge            452
	//* 237  448:ldc2            #282 <Float 4F>
	//* 238  451:fstore_2        
	//* 239  452:aload           12
	//* 240  454:fload_2         
	//* 241  455:invokestatic    #302 <Method void changeFontSize(Phrase, float)>
	//* 242  458:aload           11
	//* 243  460:aload           13
	//* 244  462:invokevirtual   #316 <Method void ColumnText.setCanvas(PdfContentByte)>
	//* 245  465:fload_2         
	//* 246  466:fload           5
	//* 247  468:fmul            
	//* 248  469:fstore_1        
	//* 249  470:aload           14
	//* 250  472:bipush          8
	//* 251  474:fload_2         
	//* 252  475:invokevirtual   #276 <Method float BaseFont.getFontDescriptor(int, float)>
	//* 253  478:fstore_2        
	//* 254  479:aload           11
	//* 255  481:aload_0         
	//* 256  482:getfield        #272 <Field float extraMarginLeft>
	//* 257  485:fconst_2        
	//* 258  486:fload           6
	//* 259  488:fmul            
	//* 260  489:fadd            
	//* 261  490:ldc2            #317 <Float -20000F>
	//* 262  493:aload_0         
	//* 263  494:getfield        #215 <Field Rectangle box>
	//* 264  497:invokevirtual   #237 <Method float Rectangle.getWidth()>
	//* 265  500:fconst_2        
	//* 266  501:fload           6
	//* 267  503:fmul            
	//* 268  504:fsub            
	//* 269  505:fload           6
	//* 270  507:fload_3         
	//* 271  508:fadd            
	//* 272  509:fload_2         
	//* 273  510:fsub            
	//* 274  511:fload_1         
	//* 275  512:fadd            
	//* 276  513:invokevirtual   #288 <Method void ColumnText.setSimpleColumn(float, float, float, float)>
	//* 277  516:aload           11
	//* 278  518:fload_1         
	//* 279  519:invokevirtual   #309 <Method void ColumnText.setLeading(float)>
	//* 280  522:aload           11
	//* 281  524:aload_0         
	//* 282  525:getfield        #291 <Field int alignment>
	//* 283  528:invokevirtual   #294 <Method void ColumnText.setAlignment(int)>
	//* 284  531:aload           11
	//* 285  533:iload           9
	//* 286  535:invokevirtual   #297 <Method void ColumnText.setRunDirection(int)>
	//* 287  538:aload           11
	//* 288  540:aload           12
	//* 289  542:invokevirtual   #306 <Method void ColumnText.setText(Phrase)>
	//* 290  545:aload           11
	//* 291  547:invokevirtual   #319 <Method int ColumnText.go()>
	//* 292  550:pop             
	//* 293  551:aload           13
	//* 294  553:invokevirtual   #322 <Method void PdfAppearance.restoreState()>
	//* 295  556:aload           13
	//* 296  558:invokevirtual   #208 <Method void PdfAppearance.endVariableText()>
	//* 297  561:aload           13
	//* 298  563:areturn         
			i = 0;
	//  299  564:iconst_0        
	//  300  565:istore          9
		f6 = box.getHeight() - borderWidth * 2.0F - extraMarginTop;
		f3 = borderWidth;
		f = f3;
		f5 = f6;
		if(i != 0)
		{
			f5 = f6 - borderWidth * 2.0F;
			f = f3 * 2.0F;
		}
		f9 = Math.max(f, 1.0F);
		f8 = Math.min(f, f9);
		pdfappearance.saveState();
		pdfappearance.rectangle(f8, f8, box.getWidth() - 2.0F * f8, box.getHeight() - 2.0F * f8);
		pdfappearance.clip();
		pdfappearance.newPath();
		if((options & 0x2000) != 0)
			obj = ((Object) (obfuscatePassword(text)));
		else
	//* 301  567:goto            55
		if((options & 0x1000) == 0)
	//* 302  570:aload_0         
	//* 303  571:getfield        #180 <Field int options>
	//* 304  574:sipush          4096
	//* 305  577:iand            
	//* 306  578:ifne            593
			obj = ((Object) (removeCRLF(text)));
	//  307  581:aload_0         
	//  308  582:getfield        #205 <Field String text>
	//  309  585:invokestatic    #324 <Method String removeCRLF(String)>
	//  310  588:astore          11
		else
	//* 311  590:goto            188
			obj = ((Object) (text));
	//  312  593:aload_0         
	//  313  594:getfield        #205 <Field String text>
	//  314  597:astore          11
		obj2 = ((Object) (getRealFont()));
		if(textColor == null)
			obj1 = ((Object) (GrayColor.GRAYBLACK));
		else
	//* 315  599:goto            188
			obj1 = ((Object) (textColor));
	//  316  602:aload_0         
	//  317  603:getfield        #257 <Field BaseColor textColor>
	//  318  606:astore          12
		if(checkRTL(((String) (obj))))
			i = 2;
		else
	//* 319  608:goto            206
			i = 1;
	//  320  611:iconst_1        
	//  321  612:istore          9
		f6 = fontSize;
		obj1 = ((Object) (composePhrase(((String) (obj)), ((BaseFont) (obj2)), ((BaseColor) (obj1)), f6)));
		if((options & 0x1000) == 0) goto _L2; else goto _L1
_L1:
		f10 = box.getWidth();
		f11 = extraMarginLeft;
		f8 = ((BaseFont) (obj2)).getFontDescriptor(8, 1.0F) - ((BaseFont) (obj2)).getFontDescriptor(6, 1.0F);
		obj = ((Object) (new ColumnText(((PdfContentByte) (null)))));
		f3 = f6;
		if(f6 != 0.0F) goto _L4; else goto _L3
_L3:
		f3 = f5 / f8;
		f = f3;
		if(f3 <= 4F) goto _L6; else goto _L5
_L5:
		f = f3;
		if(f3 > 12F)
			f = 12F;
		f6 = Math.max((f - 4F) / 10F, 0.2F);
		((ColumnText) (obj)).setSimpleColumn(0.0F, -f5, f10 - 4F * f9 - f11, 0.0F);
		((ColumnText) (obj)).setAlignment(alignment);
		((ColumnText) (obj)).setRunDirection(i);
		f3 = f;
_L10:
		f = f3;
		if(f3 <= 4F) goto _L6; else goto _L7
_L7:
		((ColumnText) (obj)).setYLine(0.0F);
		changeFontSize(((Phrase) (obj1)), f3);
		((ColumnText) (obj)).setText(((Phrase) (obj1)));
		((ColumnText) (obj)).setLeading(f8 * f3);
		if((((ColumnText) (obj)).go(true) & 2) != 0) goto _L9; else goto _L8
_L8:
		f = f3;
_L6:
		f3 = f;
		if(f < 4F)
			f3 = 4F;
_L4:
		changeFontSize(((Phrase) (obj1)), f3);
		((ColumnText) (obj)).setCanvas(((PdfContentByte) (pdfappearance)));
		f = f3 * f8;
		f3 = ((BaseFont) (obj2)).getFontDescriptor(8, f3);
		((ColumnText) (obj)).setSimpleColumn(extraMarginLeft + 2.0F * f9, -20000F, box.getWidth() - 2.0F * f9, ((f9 + f5) - f3) + f);
		((ColumnText) (obj)).setLeading(f);
		((ColumnText) (obj)).setAlignment(alignment);
		((ColumnText) (obj)).setRunDirection(i);
		((ColumnText) (obj)).setText(((Phrase) (obj1)));
		((ColumnText) (obj)).go();
_L11:
		pdfappearance.restoreState();
		pdfappearance.endVariableText();
		return pdfappearance;
	//* 322  614:goto            217
_L9:
		f3 -= f6;
	//  323  617:fload_2         
	//  324  618:fload           4
	//  325  620:fsub            
	//  326  621:fstore_2        
		  goto _L10
	//* 327  622:goto            387
_L2:
label0:
		{
			float f1 = f6;
	//  328  625:fload           4
	//  329  627:fstore_1        
			int j;
			if(f6 == 0.0F)
	//* 330  628:fload           4
	//* 331  630:fconst_0        
	//* 332  631:fcmpl           
	//* 333  632:ifne            690
			{
				float f4 = f5 / (((BaseFont) (obj2)).getFontDescriptor(7, 1.0F) - ((BaseFont) (obj2)).getFontDescriptor(6, 1.0F));
	//  334  635:fload_3         
	//  335  636:aload           14
	//  336  638:bipush          7
	//  337  640:fconst_1        
	//  338  641:invokevirtual   #276 <Method float BaseFont.getFontDescriptor(int, float)>
	//  339  644:aload           14
	//  340  646:bipush          6
	//  341  648:fconst_1        
	//  342  649:invokevirtual   #276 <Method float BaseFont.getFontDescriptor(int, float)>
	//  343  652:fsub            
	//  344  653:fdiv            
	//  345  654:fstore_2        
				changeFontSize(((Phrase) (obj1)), 1.0F);
	//  346  655:aload           12
	//  347  657:fconst_1        
	//  348  658:invokestatic    #302 <Method void changeFontSize(Phrase, float)>
				f1 = ColumnText.getWidth(((Phrase) (obj1)), i, 0);
	//  349  661:aload           12
	//  350  663:iload           9
	//  351  665:iconst_0        
	//  352  666:invokestatic    #327 <Method float ColumnText.getWidth(Phrase, int, int)>
	//  353  669:fstore_1        
				float f7;
				String s;
				if(f1 != 0.0F)
	//* 354  670:fload_1         
	//* 355  671:fconst_0        
	//* 356  672:fcmpl           
	//* 357  673:ifne            1023
	//* 358  676:fload_2         
	//* 359  677:fstore_1        
	//* 360  678:fload_2         
	//* 361  679:ldc2            #282 <Float 4F>
	//* 362  682:fcmpg           
	//* 363  683:ifge            690
	//* 364  686:ldc2            #282 <Float 4F>
	//* 365  689:fstore_1        
	//* 366  690:aload           12
	//* 367  692:fload_1         
	//* 368  693:invokestatic    #302 <Method void changeFontSize(Phrase, float)>
	//* 369  696:fload           5
	//* 370  698:aload_0         
	//* 371  699:getfield        #215 <Field Rectangle box>
	//* 372  702:invokevirtual   #221 <Method float Rectangle.getHeight()>
	//* 373  705:fconst_2        
	//* 374  706:fload           5
	//* 375  708:fmul            
	//* 376  709:fsub            
	//* 377  710:aload           14
	//* 378  712:iconst_1        
	//* 379  713:fload_1         
	//* 380  714:invokevirtual   #276 <Method float BaseFont.getFontDescriptor(int, float)>
	//* 381  717:fsub            
	//* 382  718:fconst_2        
	//* 383  719:fdiv            
	//* 384  720:fadd            
	//* 385  721:fstore_3        
	//* 386  722:fload_3         
	//* 387  723:fstore_2        
	//* 388  724:fload_3         
	//* 389  725:fload           5
	//* 390  727:fcmpg           
	//* 391  728:ifge            734
	//* 392  731:fload           5
	//* 393  733:fstore_2        
	//* 394  734:fload_2         
	//* 395  735:fstore_3        
	//* 396  736:fload_2         
	//* 397  737:fload           5
	//* 398  739:fsub            
	//* 399  740:aload           14
	//* 400  742:iconst_3        
	//* 401  743:fload_1         
	//* 402  744:invokevirtual   #276 <Method float BaseFont.getFontDescriptor(int, float)>
	//* 403  747:fneg            
	//* 404  748:fcmpg           
	//* 405  749:ifge            789
	//* 406  752:aload           14
	//* 407  754:iconst_3        
	//* 408  755:fload_1         
	//* 409  756:invokevirtual   #276 <Method float BaseFont.getFontDescriptor(int, float)>
	//* 410  759:fneg            
	//* 411  760:fload           5
	//* 412  762:fadd            
	//* 413  763:fload_2         
	//* 414  764:aload_0         
	//* 415  765:getfield        #215 <Field Rectangle box>
	//* 416  768:invokevirtual   #221 <Method float Rectangle.getHeight()>
	//* 417  771:fload           5
	//* 418  773:fsub            
	//* 419  774:aload           14
	//* 420  776:iconst_1        
	//* 421  777:fload_1         
	//* 422  778:invokevirtual   #276 <Method float BaseFont.getFontDescriptor(int, float)>
	//* 423  781:fsub            
	//* 424  782:invokestatic    #229 <Method float Math.max(float, float)>
	//* 425  785:invokestatic    #231 <Method float Math.min(float, float)>
	//* 426  788:fstore_3        
	//* 427  789:aload_0         
	//* 428  790:getfield        #180 <Field int options>
	//* 429  793:ldc2            #328 <Int 0x1000000>
	//* 430  796:iand            
	//* 431  797:ifeq            1103
	//* 432  800:aload_0         
	//* 433  801:getfield        #331 <Field int maxCharacterLength>
	//* 434  804:ifle            1103
	//* 435  807:aload_0         
	//* 436  808:getfield        #331 <Field int maxCharacterLength>
	//* 437  811:aload           11
	//* 438  813:invokevirtual   #67  <Method int String.length()>
	//* 439  816:invokestatic    #119 <Method int Math.min(int, int)>
	//* 440  819:istore          10
	//* 441  821:iconst_0        
	//* 442  822:istore          9
	//* 443  824:aload_0         
	//* 444  825:getfield        #291 <Field int alignment>
	//* 445  828:iconst_2        
	//* 446  829:icmpne          1052
	//* 447  832:aload_0         
	//* 448  833:getfield        #331 <Field int maxCharacterLength>
	//* 449  836:iload           10
	//* 450  838:isub            
	//* 451  839:istore          9
	//* 452  841:aload_0         
	//* 453  842:getfield        #215 <Field Rectangle box>
	//* 454  845:invokevirtual   #237 <Method float Rectangle.getWidth()>
	//* 455  848:aload_0         
	//* 456  849:getfield        #272 <Field float extraMarginLeft>
	//* 457  852:fsub            
	//* 458  853:aload_0         
	//* 459  854:getfield        #331 <Field int maxCharacterLength>
	//* 460  857:i2f             
	//* 461  858:fdiv            
	//* 462  859:fstore          4
	//* 463  861:fload           4
	//* 464  863:fconst_2        
	//* 465  864:fdiv            
	//* 466  865:iload           9
	//* 467  867:i2f             
	//* 468  868:fload           4
	//* 469  870:fmul            
	//* 470  871:fadd            
	//* 471  872:fstore_2        
	//* 472  873:aload_0         
	//* 473  874:getfield        #257 <Field BaseColor textColor>
	//* 474  877:ifnonnull       1074
	//* 475  880:aload           13
	//* 476  882:fconst_0        
	//* 477  883:invokevirtual   #334 <Method void PdfAppearance.setGrayFill(float)>
	//* 478  886:aload           13
	//* 479  888:invokevirtual   #337 <Method void PdfAppearance.beginText()>
	//* 480  891:iconst_0        
	//* 481  892:istore          9
	//* 482  894:iload           9
	//* 483  896:aload           12
	//* 484  898:invokevirtual   #44  <Method int Phrase.size()>
	//* 485  901:icmpge          1095
	//* 486  904:aload           12
	//* 487  906:iload           9
	//* 488  908:invokevirtual   #48  <Method Object Phrase.get(int)>
	//* 489  911:checkcast       #50  <Class Chunk>
	//* 490  914:astore          14
	//* 491  916:aload           14
	//* 492  918:invokevirtual   #54  <Method Font Chunk.getFont()>
	//* 493  921:invokevirtual   #340 <Method BaseFont Font.getBaseFont()>
	//* 494  924:astore          11
	//* 495  926:aload           13
	//* 496  928:aload           11
	//* 497  930:fload_1         
	//* 498  931:invokevirtual   #344 <Method void PdfAppearance.setFontAndSize(BaseFont, float)>
	//* 499  934:aload           14
	//* 500  936:ldc2            #346 <String "">
	//* 501  939:invokevirtual   #349 <Method StringBuffer Chunk.append(String)>
	//* 502  942:astore          14
	//* 503  944:iconst_0        
	//* 504  945:istore          10
	//* 505  947:iload           10
	//* 506  949:aload           14
	//* 507  951:invokevirtual   #350 <Method int StringBuffer.length()>
	//* 508  954:icmpge          1086
	//* 509  957:aload           14
	//* 510  959:iload           10
	//* 511  961:iload           10
	//* 512  963:iconst_1        
	//* 513  964:iadd            
	//* 514  965:invokevirtual   #354 <Method String StringBuffer.substring(int, int)>
	//* 515  968:astore          15
	//* 516  970:aload           11
	//* 517  972:aload           15
	//* 518  974:fload_1         
	//* 519  975:invokevirtual   #358 <Method float BaseFont.getWidthPoint(String, float)>
	//* 520  978:fstore          5
	//* 521  980:aload           13
	//* 522  982:aload_0         
	//* 523  983:getfield        #272 <Field float extraMarginLeft>
	//* 524  986:fload_2         
	//* 525  987:fadd            
	//* 526  988:fload           5
	//* 527  990:fconst_2        
	//* 528  991:fdiv            
	//* 529  992:fsub            
	//* 530  993:fload_3         
	//* 531  994:aload_0         
	//* 532  995:getfield        #226 <Field float extraMarginTop>
	//* 533  998:fsub            
	//* 534  999:invokevirtual   #362 <Method void PdfAppearance.setTextMatrix(float, float)>
	//* 535 1002:aload           13
	//* 536 1004:aload           15
	//* 537 1006:invokevirtual   #365 <Method void PdfAppearance.showText(String)>
	//* 538 1009:fload_2         
	//* 539 1010:fload           4
	//* 540 1012:fadd            
	//* 541 1013:fstore_2        
	//* 542 1014:iload           10
	//* 543 1016:iconst_1        
	//* 544 1017:iadd            
	//* 545 1018:istore          10
	//* 546 1020:goto            947
					f4 = Math.min(f4, (box.getWidth() - extraMarginLeft - 4F * f9) / f1);
	//  547 1023:fload_2         
	//  548 1024:aload_0         
	//  549 1025:getfield        #215 <Field Rectangle box>
	//  550 1028:invokevirtual   #237 <Method float Rectangle.getWidth()>
	//  551 1031:aload_0         
	//  552 1032:getfield        #272 <Field float extraMarginLeft>
	//  553 1035:fsub            
	//  554 1036:ldc2            #282 <Float 4F>
	//  555 1039:fload           6
	//  556 1041:fmul            
	//  557 1042:fsub            
	//  558 1043:fload_1         
	//  559 1044:fdiv            
	//  560 1045:invokestatic    #231 <Method float Math.min(float, float)>
	//  561 1048:fstore_2        
				f1 = f4;
				if(f4 < 4F)
					f1 = 4F;
			}
			changeFontSize(((Phrase) (obj1)), f1);
			f5 = f8 + (box.getHeight() - 2.0F * f8 - ((BaseFont) (obj2)).getFontDescriptor(1, f1)) / 2.0F;
			f4 = f5;
			if(f5 < f8)
				f4 = f8;
			f5 = f4;
			if(f4 - f8 < -((BaseFont) (obj2)).getFontDescriptor(3, f1))
				f5 = Math.min(-((BaseFont) (obj2)).getFontDescriptor(3, f1) + f8, Math.max(f4, box.getHeight() - f8 - ((BaseFont) (obj2)).getFontDescriptor(1, f1)));
			if((options & 0x1000000) == 0 || maxCharacterLength <= 0)
				break label0;
			j = Math.min(maxCharacterLength, ((String) (obj)).length());
			i = 0;
			if(alignment == 2)
				i = maxCharacterLength - j;
			else
	//* 562 1049:goto            676
			if(alignment == 1)
	//* 563 1052:aload_0         
	//* 564 1053:getfield        #291 <Field int alignment>
	//* 565 1056:iconst_1        
	//* 566 1057:icmpne          841
				i = (maxCharacterLength - j) / 2;
	//  567 1060:aload_0         
	//  568 1061:getfield        #331 <Field int maxCharacterLength>
	//  569 1064:iload           10
	//  570 1066:isub            
	//  571 1067:iconst_2        
	//  572 1068:idiv            
	//  573 1069:istore          9
			f7 = (box.getWidth() - extraMarginLeft) / (float)maxCharacterLength;
			f4 = f7 / 2.0F + (float)i * f7;
			if(textColor == null)
				pdfappearance.setGrayFill(0.0F);
			else
	//* 574 1071:goto            841
				pdfappearance.setColorFill(textColor);
	//  575 1074:aload           13
	//  576 1076:aload_0         
	//  577 1077:getfield        #257 <Field BaseColor textColor>
	//  578 1080:invokevirtual   #369 <Method void PdfAppearance.setColorFill(BaseColor)>
			pdfappearance.beginText();
			for(i = 0; i < ((Phrase) (obj1)).size(); i++)
			{
				obj2 = ((Object) ((Chunk)((Phrase) (obj1)).get(i)));
				obj = ((Object) (((Chunk) (obj2)).getFont().getBaseFont()));
				pdfappearance.setFontAndSize(((BaseFont) (obj)), f1);
				obj2 = ((Object) (((Chunk) (obj2)).append("")));
				for(j = 0; j < ((StringBuffer) (obj2)).length(); j++)
				{
					s = ((StringBuffer) (obj2)).substring(j, j + 1);
					f8 = ((BaseFont) (obj)).getWidthPoint(s, f1);
					pdfappearance.setTextMatrix((extraMarginLeft + f4) - f8 / 2.0F, f5 - extraMarginTop);
					pdfappearance.showText(s);
					f4 += f7;
				}

			}

	//  579 1083:goto            886
	//  580 1086:iload           9
	//  581 1088:iconst_1        
	//  582 1089:iadd            
	//  583 1090:istore          9
	//* 584 1092:goto            894
			pdfappearance.endText();
	//  585 1095:aload           13
	//  586 1097:invokevirtual   #372 <Method void PdfAppearance.endText()>
		}
		  goto _L11
	//* 587 1100:goto            551
		alignment;
	//  588 1103:aload_0         
	//  589 1104:getfield        #291 <Field int alignment>
		JVM INSTR tableswitch 1 2: default 1128
	//	               1 1184
	//	               2 1163;
	//  590 1107:tableswitch     1 2: default 1128
	//	               1 1184
	//	               2 1163
		   goto _L12 _L13 _L14
_L13:
		break MISSING_BLOCK_LABEL_1184;
_L12:
		float f2 = extraMarginLeft + 2.0F * f9;
	//  591 1128:aload_0         
	//  592 1129:getfield        #272 <Field float extraMarginLeft>
	//  593 1132:fconst_2        
	//  594 1133:fload           6
	//  595 1135:fmul            
	//  596 1136:fadd            
	//  597 1137:fstore_1        
_L15:
		ColumnText.showTextAligned(((PdfContentByte) (pdfappearance)), alignment, ((Phrase) (obj1)), f2, f5 - extraMarginTop, 0.0F, i, 0);
	//  598 1138:aload           13
	//  599 1140:aload_0         
	//  600 1141:getfield        #291 <Field int alignment>
	//  601 1144:aload           12
	//  602 1146:fload_1         
	//  603 1147:fload_3         
	//  604 1148:aload_0         
	//  605 1149:getfield        #226 <Field float extraMarginTop>
	//  606 1152:fsub            
	//  607 1153:fconst_0        
	//  608 1154:iload           9
	//  609 1156:iconst_0        
	//  610 1157:invokestatic    #376 <Method void ColumnText.showTextAligned(PdfContentByte, int, Phrase, float, float, float, int, int)>
		  goto _L11
	//* 611 1160:goto            551
_L14:
		f2 = (extraMarginLeft + box.getWidth()) - 2.0F * f9;
	//  612 1163:aload_0         
	//  613 1164:getfield        #272 <Field float extraMarginLeft>
	//  614 1167:aload_0         
	//  615 1168:getfield        #215 <Field Rectangle box>
	//  616 1171:invokevirtual   #237 <Method float Rectangle.getWidth()>
	//  617 1174:fadd            
	//  618 1175:fconst_2        
	//  619 1176:fload           6
	//  620 1178:fmul            
	//  621 1179:fsub            
	//  622 1180:fstore_1        
		  goto _L15
	//* 623 1181:goto            1138
		f2 = extraMarginLeft + box.getWidth() / 2.0F;
	//  624 1184:aload_0         
	//  625 1185:getfield        #272 <Field float extraMarginLeft>
	//  626 1188:aload_0         
	//  627 1189:getfield        #215 <Field Rectangle box>
	//  628 1192:invokevirtual   #237 <Method float Rectangle.getWidth()>
	//  629 1195:fconst_2        
	//  630 1196:fdiv            
	//  631 1197:fadd            
	//  632 1198:fstore_1        
		  goto _L15
	//* 633 1199:goto            1138
	}

	public String[] getChoiceExports()
	{
		return choiceExports;
	//    0    0:aload_0         
	//    1    1:getfield        #381 <Field String[] choiceExports>
	//    2    4:areturn         
	}

	protected PdfFormField getChoiceField(boolean flag)
		throws IOException, DocumentException
	{
		options = options & 0xfeffefff;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #180 <Field int options>
	//    3    5:ldc2            #384 <Int 0xfeffefff>
	//    4    8:iand            
	//    5    9:putfield        #180 <Field int options>
		String as[] = choices;
	//    6   12:aload_0         
	//    7   13:getfield        #110 <Field String[] choices>
	//    8   16:astore          6
		Object obj1 = ((Object) (as));
	//    9   18:aload           6
	//   10   20:astore          7
		if(as == null)
	//*  11   22:aload           6
	//*  12   24:ifnonnull       33
			obj1 = ((Object) (new String[0]));
	//   13   27:iconst_0        
	//   14   28:anewarray       String[]
	//   15   31:astore          7
		int k = getTopChoice();
	//   16   33:aload_0         
	//   17   34:invokespecial   #386 <Method int getTopChoice()>
	//   18   37:istore_3        
		if(obj1.length > 0 && k >= 0)
	//*  19   38:aload           7
	//*  20   40:arraylength     
	//*  21   41:ifle            56
	//*  22   44:iload_3         
	//*  23   45:iflt            56
			text = obj1[k];
	//   24   48:aload_0         
	//   25   49:aload           7
	//   26   51:iload_3         
	//   27   52:aaload          
	//   28   53:putfield        #205 <Field String text>
		if(text == null)
	//*  29   56:aload_0         
	//*  30   57:getfield        #205 <Field String text>
	//*  31   60:ifnonnull       70
			text = "";
	//   32   63:aload_0         
	//   33   64:ldc2            #346 <String "">
	//   34   67:putfield        #205 <Field String text>
		String as1[][] = (String[][])null;
	//   35   70:aconst_null     
	//   36   71:checkcast       #388 <Class String[][]>
	//   37   74:astore          8
		Object obj;
		if(choiceExports == null)
	//*  38   76:aload_0         
	//*  39   77:getfield        #381 <Field String[] choiceExports>
	//*  40   80:ifnonnull       498
		{
			if(flag)
	//*  41   83:iload_1         
	//*  42   84:ifeq            457
			{
				obj = ((Object) (PdfFormField.createList(writer, ((String []) (obj1)), k)));
	//   43   87:aload_0         
	//   44   88:getfield        #392 <Field PdfWriter writer>
	//   45   91:aload           7
	//   46   93:iload_3         
	//   47   94:invokestatic    #396 <Method PdfFormField PdfFormField.createList(PdfWriter, String[], int)>
	//   48   97:astore          6
			} else
	//*  49   99:aload           6
	//*  50  101:aload_0         
	//*  51  102:getfield        #215 <Field Rectangle box>
	//*  52  105:getstatic       #401 <Field PdfName PdfAnnotation.HIGHLIGHT_INVERT>
	//*  53  108:invokevirtual   #405 <Method void PdfFormField.setWidget(Rectangle, PdfName)>
	//*  54  111:aload_0         
	//*  55  112:getfield        #408 <Field int rotation>
	//*  56  115:ifeq            127
	//*  57  118:aload           6
	//*  58  120:aload_0         
	//*  59  121:getfield        #408 <Field int rotation>
	//*  60  124:invokevirtual   #411 <Method void PdfFormField.setMKRotation(int)>
	//*  61  127:aload_0         
	//*  62  128:getfield        #414 <Field String fieldName>
	//*  63  131:ifnull          257
	//*  64  134:aload           6
	//*  65  136:aload_0         
	//*  66  137:getfield        #414 <Field String fieldName>
	//*  67  140:invokevirtual   #417 <Method void PdfFormField.setFieldName(String)>
	//*  68  143:aload           7
	//*  69  145:arraylength     
	//*  70  146:ifle            187
	//*  71  149:aload           8
	//*  72  151:ifnull          687
	//*  73  154:aload_0         
	//*  74  155:getfield        #33  <Field ArrayList choiceSelections>
	//*  75  158:invokevirtual   #98  <Method int ArrayList.size()>
	//*  76  161:iconst_2        
	//*  77  162:icmpge          676
	//*  78  165:aload           6
	//*  79  167:aload           8
	//*  80  169:iload_3         
	//*  81  170:aaload          
	//*  82  171:iconst_0        
	//*  83  172:aaload          
	//*  84  173:invokevirtual   #420 <Method void PdfFormField.setValueAsString(String)>
	//*  85  176:aload           6
	//*  86  178:aload           8
	//*  87  180:iload_3         
	//*  88  181:aaload          
	//*  89  182:iconst_0        
	//*  90  183:aaload          
	//*  91  184:invokevirtual   #423 <Method void PdfFormField.setDefaultValueAsString(String)>
	//*  92  187:aload_0         
	//*  93  188:getfield        #180 <Field int options>
	//*  94  191:iconst_1        
	//*  95  192:iand            
	//*  96  193:ifeq            203
	//*  97  196:aload           6
	//*  98  198:iconst_1        
	//*  99  199:invokevirtual   #426 <Method int PdfFormField.setFieldFlags(int)>
	//* 100  202:pop             
	//* 101  203:aload_0         
	//* 102  204:getfield        #180 <Field int options>
	//* 103  207:iconst_2        
	//* 104  208:iand            
	//* 105  209:ifeq            219
	//* 106  212:aload           6
	//* 107  214:iconst_2        
	//* 108  215:invokevirtual   #426 <Method int PdfFormField.setFieldFlags(int)>
	//* 109  218:pop             
	//* 110  219:aload_0         
	//* 111  220:getfield        #180 <Field int options>
	//* 112  223:ldc2            #427 <Int 0x400000>
	//* 113  226:iand            
	//* 114  227:ifeq            239
	//* 115  230:aload           6
	//* 116  232:ldc2            #427 <Int 0x400000>
	//* 117  235:invokevirtual   #426 <Method int PdfFormField.setFieldFlags(int)>
	//* 118  238:pop             
	//* 119  239:aload_0         
	//* 120  240:getfield        #180 <Field int options>
	//* 121  243:ldc1            #181 <Int 0x200000>
	//* 122  245:iand            
	//* 123  246:ifeq            257
	//* 124  249:aload           6
	//* 125  251:ldc1            #181 <Int 0x200000>
	//* 126  253:invokevirtual   #426 <Method int PdfFormField.setFieldFlags(int)>
	//* 127  256:pop             
	//* 128  257:aload           6
	//* 129  259:new             #429 <Class PdfBorderDictionary>
	//* 130  262:dup             
	//* 131  263:aload_0         
	//* 132  264:getfield        #224 <Field float borderWidth>
	//* 133  267:aload_0         
	//* 134  268:getfield        #211 <Field int borderStyle>
	//* 135  271:new             #431 <Class PdfDashPattern>
	//* 136  274:dup             
	//* 137  275:ldc2            #432 <Float 3F>
	//* 138  278:invokespecial   #434 <Method void PdfDashPattern(float)>
	//* 139  281:invokespecial   #437 <Method void PdfBorderDictionary(float, int, PdfDashPattern)>
	//* 140  284:invokevirtual   #441 <Method void PdfFormField.setBorderStyle(PdfBorderDictionary)>
	//* 141  287:iload_1         
	//* 142  288:ifeq            732
	//* 143  291:aload_0         
	//* 144  292:invokevirtual   #444 <Method PdfAppearance getListAppearance()>
	//* 145  295:astore          8
	//* 146  297:aload           8
	//* 147  299:astore          7
	//* 148  301:aload_0         
	//* 149  302:getfield        #446 <Field int topFirst>
	//* 150  305:ifle            331
	//* 151  308:aload           6
	//* 152  310:getstatic       #449 <Field PdfName PdfName.TI>
	//* 153  313:new             #152 <Class PdfNumber>
	//* 154  316:dup             
	//* 155  317:aload_0         
	//* 156  318:getfield        #446 <Field int topFirst>
	//* 157  321:invokespecial   #153 <Method void PdfNumber(int)>
	//* 158  324:invokevirtual   #174 <Method void PdfFormField.put(PdfName, PdfObject)>
	//* 159  327:aload           8
	//* 160  329:astore          7
	//* 161  331:aload           6
	//* 162  333:getstatic       #452 <Field PdfName PdfAnnotation.APPEARANCE_NORMAL>
	//* 163  336:aload           7
	//* 164  338:invokevirtual   #456 <Method void PdfFormField.setAppearance(PdfName, PdfTemplate)>
	//* 165  341:aload           7
	//* 166  343:invokevirtual   #460 <Method PdfContentByte PdfAppearance.getDuplicate()>
	//* 167  346:checkcast       #199 <Class PdfAppearance>
	//* 168  349:astore          7
	//* 169  351:aload           7
	//* 170  353:aload_0         
	//* 171  354:invokevirtual   #253 <Method BaseFont getRealFont()>
	//* 172  357:aload_0         
	//* 173  358:getfield        #268 <Field float fontSize>
	//* 174  361:invokevirtual   #344 <Method void PdfAppearance.setFontAndSize(BaseFont, float)>
	//* 175  364:aload_0         
	//* 176  365:getfield        #257 <Field BaseColor textColor>
	//* 177  368:ifnonnull       741
	//* 178  371:aload           7
	//* 179  373:fconst_0        
	//* 180  374:invokevirtual   #334 <Method void PdfAppearance.setGrayFill(float)>
	//* 181  377:aload           6
	//* 182  379:aload           7
	//* 183  381:invokevirtual   #463 <Method void PdfFormField.setDefaultAppearanceString(PdfContentByte)>
	//* 184  384:aload_0         
	//* 185  385:getfield        #466 <Field BaseColor borderColor>
	//* 186  388:ifnull          400
	//* 187  391:aload           6
	//* 188  393:aload_0         
	//* 189  394:getfield        #466 <Field BaseColor borderColor>
	//* 190  397:invokevirtual   #469 <Method void PdfFormField.setMKBorderColor(BaseColor)>
	//* 191  400:aload_0         
	//* 192  401:getfield        #472 <Field BaseColor backgroundColor>
	//* 193  404:ifnull          416
	//* 194  407:aload           6
	//* 195  409:aload_0         
	//* 196  410:getfield        #472 <Field BaseColor backgroundColor>
	//* 197  413:invokevirtual   #475 <Method void PdfFormField.setMKBackgroundColor(BaseColor)>
	//* 198  416:aload_0         
	//* 199  417:getfield        #478 <Field int visibility>
	//* 200  420:tableswitch     1 3: default 448
	//	               1 753
	//	               2 454
	//	               3 763
	//* 201  448:aload           6
	//* 202  450:iconst_4        
	//* 203  451:invokevirtual   #481 <Method void PdfFormField.setFlags(int)>
	//* 204  454:aload           6
	//* 205  456:areturn         
			{
				obj = ((Object) (writer));
	//  206  457:aload_0         
	//  207  458:getfield        #392 <Field PdfWriter writer>
	//  208  461:astore          6
				boolean flag1;
				if((options & 0x40000) != 0)
	//* 209  463:aload_0         
	//* 210  464:getfield        #180 <Field int options>
	//* 211  467:ldc2            #482 <Int 0x40000>
	//* 212  470:iand            
	//* 213  471:ifeq            492
					flag1 = true;
	//  214  474:iconst_1        
	//  215  475:istore          5
				else
	//* 216  477:aload           6
	//* 217  479:iload           5
	//* 218  481:aload           7
	//* 219  483:iload_3         
	//* 220  484:invokestatic    #486 <Method PdfFormField PdfFormField.createCombo(PdfWriter, boolean, String[], int)>
	//* 221  487:astore          6
	//* 222  489:goto            99
					flag1 = false;
	//  223  492:iconst_0        
	//  224  493:istore          5
				obj = ((Object) (PdfFormField.createCombo(((PdfWriter) (obj)), flag1, ((String []) (obj1)), k)));
			}
		} else
	//* 225  495:goto            477
		{
			as1 = (String[][])Array.newInstance(java/lang/String, new int[] {
				obj1.length, 2
			});
	//  226  498:ldc1            #64  <Class String>
	//  227  500:iconst_2        
	//  228  501:newarray        int[]
	//  229  503:dup             
	//  230  504:iconst_0        
	//  231  505:aload           7
	//  232  507:arraylength     
	//  233  508:iastore         
	//  234  509:dup             
	//  235  510:iconst_1        
	//  236  511:iconst_2        
	//  237  512:iastore         
	//  238  513:invokestatic    #492 <Method Object Array.newInstance(Class, int[])>
	//  239  516:checkcast       #388 <Class String[][]>
	//  240  519:astore          8
			for(int i = 0; i < as1.length; i++)
	//* 241  521:iconst_0        
	//* 242  522:istore_2        
	//* 243  523:iload_2         
	//* 244  524:aload           8
	//* 245  526:arraylength     
	//* 246  527:icmpge          567
			{
				obj = ((Object) (as1[i]));
	//  247  530:aload           8
	//  248  532:iload_2         
	//  249  533:aaload          
	//  250  534:astore          6
				Object obj2 = as1[i];
	//  251  536:aload           8
	//  252  538:iload_2         
	//  253  539:aaload          
	//  254  540:astore          9
				String s = obj1[i];
	//  255  542:aload           7
	//  256  544:iload_2         
	//  257  545:aaload          
	//  258  546:astore          10
				obj2[1] = ((/*<invalid signature>*/java.lang.Object) (s));
	//  259  548:aload           9
	//  260  550:iconst_1        
	//  261  551:aload           10
	//  262  553:aastore         
				obj[0] = ((/*<invalid signature>*/java.lang.Object) (s));
	//  263  554:aload           6
	//  264  556:iconst_0        
	//  265  557:aload           10
	//  266  559:aastore         
			}

	//  267  560:iload_2         
	//  268  561:iconst_1        
	//  269  562:iadd            
	//  270  563:istore_2        
	//* 271  564:goto            523
			int l = Math.min(obj1.length, choiceExports.length);
	//  272  567:aload           7
	//  273  569:arraylength     
	//  274  570:aload_0         
	//  275  571:getfield        #381 <Field String[] choiceExports>
	//  276  574:arraylength     
	//  277  575:invokestatic    #119 <Method int Math.min(int, int)>
	//  278  578:istore          4
			for(int j = 0; j < l; j++)
	//* 279  580:iconst_0        
	//* 280  581:istore_2        
	//* 281  582:iload_2         
	//* 282  583:iload           4
	//* 283  585:icmpge          616
				if(choiceExports[j] != null)
	//* 284  588:aload_0         
	//* 285  589:getfield        #381 <Field String[] choiceExports>
	//* 286  592:iload_2         
	//* 287  593:aaload          
	//* 288  594:ifnull          609
					as1[j][0] = ((/*<invalid signature>*/java.lang.Object) (choiceExports[j]));
	//  289  597:aload           8
	//  290  599:iload_2         
	//  291  600:aaload          
	//  292  601:iconst_0        
	//  293  602:aload_0         
	//  294  603:getfield        #381 <Field String[] choiceExports>
	//  295  606:iload_2         
	//  296  607:aaload          
	//  297  608:aastore         

	//  298  609:iload_2         
	//  299  610:iconst_1        
	//  300  611:iadd            
	//  301  612:istore_2        
	//* 302  613:goto            582
			if(flag)
	//* 303  616:iload_1         
	//* 304  617:ifeq            635
			{
				obj = ((Object) (PdfFormField.createList(writer, as1, k)));
	//  305  620:aload_0         
	//  306  621:getfield        #392 <Field PdfWriter writer>
	//  307  624:aload           8
	//  308  626:iload_3         
	//  309  627:invokestatic    #495 <Method PdfFormField PdfFormField.createList(PdfWriter, String[][], int)>
	//  310  630:astore          6
			} else
	//* 311  632:goto            99
			{
				obj = ((Object) (writer));
	//  312  635:aload_0         
	//  313  636:getfield        #392 <Field PdfWriter writer>
	//  314  639:astore          6
				boolean flag2;
				if((options & 0x40000) != 0)
	//* 315  641:aload_0         
	//* 316  642:getfield        #180 <Field int options>
	//* 317  645:ldc2            #482 <Int 0x40000>
	//* 318  648:iand            
	//* 319  649:ifeq            670
					flag2 = true;
	//  320  652:iconst_1        
	//  321  653:istore          5
				else
	//* 322  655:aload           6
	//* 323  657:iload           5
	//* 324  659:aload           8
	//* 325  661:iload_3         
	//* 326  662:invokestatic    #498 <Method PdfFormField PdfFormField.createCombo(PdfWriter, boolean, String[][], int)>
	//* 327  665:astore          6
	//* 328  667:goto            99
					flag2 = false;
	//  329  670:iconst_0        
	//  330  671:istore          5
				obj = ((Object) (PdfFormField.createCombo(((PdfWriter) (obj)), flag2, as1, k)));
			}
		}
		do
		{
			((PdfFormField) (obj)).setWidget(box, PdfAnnotation.HIGHLIGHT_INVERT);
			if(rotation != 0)
				((PdfFormField) (obj)).setMKRotation(rotation);
			if(fieldName != null)
			{
				((PdfFormField) (obj)).setFieldName(fieldName);
				if(obj1.length > 0)
					if(as1 != null)
					{
						if(choiceSelections.size() < 2)
						{
							((PdfFormField) (obj)).setValueAsString(as1[k][0]);
							((PdfFormField) (obj)).setDefaultValueAsString(as1[k][0]);
						} else
	//* 331  673:goto            655
						{
							writeMultipleValues(((PdfFormField) (obj)), as1);
	//  332  676:aload_0         
	//  333  677:aload           6
	//  334  679:aload           8
	//  335  681:invokespecial   #500 <Method void writeMultipleValues(PdfFormField, String[][])>
						}
					} else
	//* 336  684:goto            187
					if(choiceSelections.size() < 2)
	//* 337  687:aload_0         
	//* 338  688:getfield        #33  <Field ArrayList choiceSelections>
	//* 339  691:invokevirtual   #98  <Method int ArrayList.size()>
	//* 340  694:iconst_2        
	//* 341  695:icmpge          719
					{
						((PdfFormField) (obj)).setValueAsString(text);
	//  342  698:aload           6
	//  343  700:aload_0         
	//  344  701:getfield        #205 <Field String text>
	//  345  704:invokevirtual   #420 <Method void PdfFormField.setValueAsString(String)>
						((PdfFormField) (obj)).setDefaultValueAsString(text);
	//  346  707:aload           6
	//  347  709:aload_0         
	//  348  710:getfield        #205 <Field String text>
	//  349  713:invokevirtual   #423 <Method void PdfFormField.setDefaultValueAsString(String)>
					} else
	//* 350  716:goto            187
					{
						writeMultipleValues(((PdfFormField) (obj)), (String[][])null);
	//  351  719:aload_0         
	//  352  720:aload           6
	//  353  722:aconst_null     
	//  354  723:checkcast       #388 <Class String[][]>
	//  355  726:invokespecial   #500 <Method void writeMultipleValues(PdfFormField, String[][])>
					}
				if((options & 1) != 0)
					((PdfFormField) (obj)).setFieldFlags(1);
				if((options & 2) != 0)
					((PdfFormField) (obj)).setFieldFlags(2);
				if((options & 0x400000) != 0)
					((PdfFormField) (obj)).setFieldFlags(0x400000);
				if((options & 0x200000) != 0)
					((PdfFormField) (obj)).setFieldFlags(0x200000);
			}
			((PdfFormField) (obj)).setBorderStyle(new PdfBorderDictionary(borderWidth, borderStyle, new PdfDashPattern(3F)));
			if(flag)
			{
				as1 = ((String [][]) (getListAppearance()));
				obj1 = ((Object) (as1));
				if(topFirst > 0)
				{
					((PdfFormField) (obj)).put(PdfName.TI, ((PdfObject) (new PdfNumber(topFirst))));
					obj1 = ((Object) (as1));
				}
			} else
	//* 356  729:goto            187
			{
				obj1 = ((Object) (getAppearance()));
	//  357  732:aload_0         
	//  358  733:invokevirtual   #502 <Method PdfAppearance getAppearance()>
	//  359  736:astore          7
			}
			((PdfFormField) (obj)).setAppearance(PdfAnnotation.APPEARANCE_NORMAL, ((PdfTemplate) (obj1)));
			obj1 = ((Object) ((PdfAppearance)((PdfAppearance) (obj1)).getDuplicate()));
			((PdfAppearance) (obj1)).setFontAndSize(getRealFont(), fontSize);
			if(textColor == null)
				((PdfAppearance) (obj1)).setGrayFill(0.0F);
			else
	//* 360  738:goto            331
				((PdfAppearance) (obj1)).setColorFill(textColor);
	//  361  741:aload           7
	//  362  743:aload_0         
	//  363  744:getfield        #257 <Field BaseColor textColor>
	//  364  747:invokevirtual   #369 <Method void PdfAppearance.setColorFill(BaseColor)>
			((PdfFormField) (obj)).setDefaultAppearanceString(((PdfContentByte) (obj1)));
			if(borderColor != null)
				((PdfFormField) (obj)).setMKBorderColor(borderColor);
			if(backgroundColor != null)
				((PdfFormField) (obj)).setMKBackgroundColor(backgroundColor);
			switch(visibility)
			{
			default:
				((PdfFormField) (obj)).setFlags(4);
				// fall through

			case 2: // '\002'
				return ((PdfFormField) (obj));

	//* 365  750:goto            377
			case 1: // '\001'
				((PdfFormField) (obj)).setFlags(6);
	//  366  753:aload           6
	//  367  755:bipush          6
	//  368  757:invokevirtual   #481 <Method void PdfFormField.setFlags(int)>
				return ((PdfFormField) (obj));
	//  369  760:aload           6
	//  370  762:areturn         

			case 3: // '\003'
				((PdfFormField) (obj)).setFlags(36);
	//  371  763:aload           6
	//  372  765:bipush          36
	//  373  767:invokevirtual   #481 <Method void PdfFormField.setFlags(int)>
				break;
			}
			return ((PdfFormField) (obj));
	//  374  770:aload           6
	//  375  772:areturn         
		} while(true);
	}

	public int getChoiceSelection()
	{
		return getTopChoice();
	//    0    0:aload_0         
	//    1    1:invokespecial   #386 <Method int getTopChoice()>
	//    2    4:ireturn         
	}

	public ArrayList getChoiceSelections()
	{
		return choiceSelections;
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field ArrayList choiceSelections>
	//    2    4:areturn         
	}

	public String[] getChoices()
	{
		return choices;
	//    0    0:aload_0         
	//    1    1:getfield        #110 <Field String[] choices>
	//    2    4:areturn         
	}

	public PdfFormField getComboField()
		throws IOException, DocumentException
	{
		return getChoiceField(false);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:invokevirtual   #512 <Method PdfFormField getChoiceField(boolean)>
	//    3    5:areturn         
	}

	public String getDefaultText()
	{
		return defaultText;
	//    0    0:aload_0         
	//    1    1:getfield        #515 <Field String defaultText>
	//    2    4:areturn         
	}

	public BaseFont getExtensionFont()
	{
		return extensionFont;
	//    0    0:aload_0         
	//    1    1:getfield        #75  <Field BaseFont extensionFont>
	//    2    4:areturn         
	}

	PdfAppearance getListAppearance()
		throws IOException, DocumentException
	{
		PdfAppearance pdfappearance = getBorderAppearance();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #197 <Method PdfAppearance getBorderAppearance()>
	//    2    4:astore          12
		if(choices == null || choices.length == 0)
	//*   3    6:aload_0         
	//*   4    7:getfield        #110 <Field String[] choices>
	//*   5   10:ifnull          21
	//*   6   13:aload_0         
	//*   7   14:getfield        #110 <Field String[] choices>
	//*   8   17:arraylength     
	//*   9   18:ifne            24
			return pdfappearance;
	//   10   21:aload           12
	//   11   23:areturn         
		pdfappearance.beginVariableText();
	//   12   24:aload           12
	//   13   26:invokevirtual   #202 <Method void PdfAppearance.beginVariableText()>
		int k = getTopChoice();
	//   14   29:aload_0         
	//   15   30:invokespecial   #386 <Method int getTopChoice()>
	//   16   33:istore          8
		BaseFont basefont = getRealFont();
	//   17   35:aload_0         
	//   18   36:invokevirtual   #253 <Method BaseFont getRealFont()>
	//   19   39:astore          13
		float f1 = fontSize;
	//   20   41:aload_0         
	//   21   42:getfield        #268 <Field float fontSize>
	//   22   45:fstore_2        
		float f = f1;
	//   23   46:fload_2         
	//   24   47:fstore_1        
		if(f1 == 0.0F)
	//*  25   48:fload_2         
	//*  26   49:fconst_0        
	//*  27   50:fcmpl           
	//*  28   51:ifne            58
			f = 12F;
	//   29   54:ldc2            #283 <Float 12F>
	//   30   57:fstore_1        
		float f2;
		float f3;
		float f4;
		int i;
		int j;
		Object obj;
		if(borderStyle == 2 || borderStyle == 3)
	//*  31   58:aload_0         
	//*  32   59:getfield        #211 <Field int borderStyle>
	//*  33   62:iconst_2        
	//*  34   63:icmpeq          74
	//*  35   66:aload_0         
	//*  36   67:getfield        #211 <Field int borderStyle>
	//*  37   70:iconst_3        
	//*  38   71:icmpne          351
			i = 1;
	//   39   74:iconst_1        
	//   40   75:istore          6
		else
	//*  41   77:aload_0         
	//*  42   78:getfield        #215 <Field Rectangle box>
	//*  43   81:invokevirtual   #221 <Method float Rectangle.getHeight()>
	//*  44   84:aload_0         
	//*  45   85:getfield        #224 <Field float borderWidth>
	//*  46   88:fconst_2        
	//*  47   89:fmul            
	//*  48   90:fsub            
	//*  49   91:fstore          5
	//*  50   93:aload_0         
	//*  51   94:getfield        #224 <Field float borderWidth>
	//*  52   97:fstore          4
	//*  53   99:fload           5
	//*  54  101:fstore_3        
	//*  55  102:fload           4
	//*  56  104:fstore_2        
	//*  57  105:iload           6
	//*  58  107:ifeq            125
	//*  59  110:fload           5
	//*  60  112:aload_0         
	//*  61  113:getfield        #224 <Field float borderWidth>
	//*  62  116:fconst_2        
	//*  63  117:fmul            
	//*  64  118:fsub            
	//*  65  119:fstore_3        
	//*  66  120:fload           4
	//*  67  122:fconst_2        
	//*  68  123:fmul            
	//*  69  124:fstore_2        
	//*  70  125:aload           13
	//*  71  127:bipush          8
	//*  72  129:fload_1         
	//*  73  130:invokevirtual   #276 <Method float BaseFont.getFontDescriptor(int, float)>
	//*  74  133:aload           13
	//*  75  135:bipush          6
	//*  76  137:fload_1         
	//*  77  138:invokevirtual   #276 <Method float BaseFont.getFontDescriptor(int, float)>
	//*  78  141:fsub            
	//*  79  142:fstore          4
	//*  80  144:iload           8
	//*  81  146:fload_3         
	//*  82  147:fload           4
	//*  83  149:fdiv            
	//*  84  150:f2i             
	//*  85  151:iconst_1        
	//*  86  152:iadd            
	//*  87  153:iadd            
	//*  88  154:istore          7
	//*  89  156:iload           7
	//*  90  158:istore          6
	//*  91  160:iload           7
	//*  92  162:aload_0         
	//*  93  163:getfield        #110 <Field String[] choices>
	//*  94  166:arraylength     
	//*  95  167:icmple          177
	//*  96  170:aload_0         
	//*  97  171:getfield        #110 <Field String[] choices>
	//*  98  174:arraylength     
	//*  99  175:istore          6
	//* 100  177:aload_0         
	//* 101  178:iload           8
	//* 102  180:putfield        #446 <Field int topFirst>
	//* 103  183:aload           12
	//* 104  185:invokevirtual   #234 <Method void PdfAppearance.saveState()>
	//* 105  188:aload           12
	//* 106  190:fload_2         
	//* 107  191:fload_2         
	//* 108  192:aload_0         
	//* 109  193:getfield        #215 <Field Rectangle box>
	//* 110  196:invokevirtual   #237 <Method float Rectangle.getWidth()>
	//* 111  199:fconst_2        
	//* 112  200:fload_2         
	//* 113  201:fmul            
	//* 114  202:fsub            
	//* 115  203:aload_0         
	//* 116  204:getfield        #215 <Field Rectangle box>
	//* 117  207:invokevirtual   #221 <Method float Rectangle.getHeight()>
	//* 118  210:fconst_2        
	//* 119  211:fload_2         
	//* 120  212:fmul            
	//* 121  213:fsub            
	//* 122  214:invokevirtual   #241 <Method void PdfAppearance.rectangle(float, float, float, float)>
	//* 123  217:aload           12
	//* 124  219:invokevirtual   #244 <Method void PdfAppearance.clip()>
	//* 125  222:aload           12
	//* 126  224:invokevirtual   #247 <Method void PdfAppearance.newPath()>
	//* 127  227:aload_0         
	//* 128  228:getfield        #257 <Field BaseColor textColor>
	//* 129  231:ifnonnull       357
	//* 130  234:getstatic       #263 <Field GrayColor GrayColor.GRAYBLACK>
	//* 131  237:astore          10
	//* 132  239:aload           12
	//* 133  241:new             #518 <Class BaseColor>
	//* 134  244:dup             
	//* 135  245:bipush          10
	//* 136  247:bipush          36
	//* 137  249:bipush          106
	//* 138  251:invokespecial   #521 <Method void BaseColor(int, int, int)>
	//* 139  254:invokevirtual   #369 <Method void PdfAppearance.setColorFill(BaseColor)>
	//* 140  257:iconst_0        
	//* 141  258:istore          7
	//* 142  260:iload           7
	//* 143  262:aload_0         
	//* 144  263:getfield        #33  <Field ArrayList choiceSelections>
	//* 145  266:invokevirtual   #98  <Method int ArrayList.size()>
	//* 146  269:icmpge          366
	//* 147  272:aload_0         
	//* 148  273:getfield        #33  <Field ArrayList choiceSelections>
	//* 149  276:iload           7
	//* 150  278:invokevirtual   #99  <Method Object ArrayList.get(int)>
	//* 151  281:checkcast       #108 <Class Integer>
	//* 152  284:invokevirtual   #113 <Method int Integer.intValue()>
	//* 153  287:istore          9
	//* 154  289:iload           9
	//* 155  291:iload           8
	//* 156  293:icmplt          342
	//* 157  296:iload           9
	//* 158  298:iload           6
	//* 159  300:icmpgt          342
	//* 160  303:aload           12
	//* 161  305:fload_2         
	//* 162  306:fload_2         
	//* 163  307:fload_3         
	//* 164  308:fadd            
	//* 165  309:iload           9
	//* 166  311:iload           8
	//* 167  313:isub            
	//* 168  314:iconst_1        
	//* 169  315:iadd            
	//* 170  316:i2f             
	//* 171  317:fload           4
	//* 172  319:fmul            
	//* 173  320:fsub            
	//* 174  321:aload_0         
	//* 175  322:getfield        #215 <Field Rectangle box>
	//* 176  325:invokevirtual   #237 <Method float Rectangle.getWidth()>
	//* 177  328:fconst_2        
	//* 178  329:fload_2         
	//* 179  330:fmul            
	//* 180  331:fsub            
	//* 181  332:fload           4
	//* 182  334:invokevirtual   #241 <Method void PdfAppearance.rectangle(float, float, float, float)>
	//* 183  337:aload           12
	//* 184  339:invokevirtual   #524 <Method void PdfAppearance.fill()>
	//* 185  342:iload           7
	//* 186  344:iconst_1        
	//* 187  345:iadd            
	//* 188  346:istore          7
	//* 189  348:goto            260
			i = 0;
	//  190  351:iconst_0        
	//  191  352:istore          6
		f4 = box.getHeight() - borderWidth * 2.0F;
		f3 = borderWidth;
		f2 = f4;
		f1 = f3;
		if(i != 0)
		{
			f2 = f4 - borderWidth * 2.0F;
			f1 = f3 * 2.0F;
		}
		f3 = basefont.getFontDescriptor(8, f) - basefont.getFontDescriptor(6, f);
		j = k + ((int)(f2 / f3) + 1);
		i = j;
		if(j > choices.length)
			i = choices.length;
		topFirst = k;
		pdfappearance.saveState();
		pdfappearance.rectangle(f1, f1, box.getWidth() - 2.0F * f1, box.getHeight() - 2.0F * f1);
		pdfappearance.clip();
		pdfappearance.newPath();
		if(textColor == null)
			obj = ((Object) (GrayColor.GRAYBLACK));
		else
	//* 192  354:goto            77
			obj = ((Object) (textColor));
	//  193  357:aload_0         
	//  194  358:getfield        #257 <Field BaseColor textColor>
	//  195  361:astore          10
		pdfappearance.setColorFill(new BaseColor(10, 36, 106));
		for(j = 0; j < choiceSelections.size(); j++)
		{
			int l = ((Integer)choiceSelections.get(j)).intValue();
			if(l >= k && l <= i)
			{
				pdfappearance.rectangle(f1, (f1 + f2) - (float)((l - k) + 1) * f3, box.getWidth() - 2.0F * f1, f3);
				pdfappearance.fill();
			}
		}

	//* 196  363:goto            239
		f2 = (f1 + f2) - basefont.getFontDescriptor(8, f);
	//  197  366:fload_2         
	//  198  367:fload_3         
	//  199  368:fadd            
	//  200  369:aload           13
	//  201  371:bipush          8
	//  202  373:fload_1         
	//  203  374:invokevirtual   #276 <Method float BaseFont.getFontDescriptor(int, float)>
	//  204  377:fsub            
	//  205  378:fstore_3        
		j = k;
	//  206  379:iload           8
	//  207  381:istore          7
		while(j < i) 
	//* 208  383:iload           7
	//* 209  385:iload           6
	//* 210  387:icmpge          489
		{
			Object obj1 = ((Object) (choices[j]));
	//  211  390:aload_0         
	//  212  391:getfield        #110 <Field String[] choices>
	//  213  394:iload           7
	//  214  396:aaload          
	//  215  397:astore          11
			byte byte0;
			String s;
			if(checkRTL(((String) (obj1))))
	//* 216  399:aload           11
	//* 217  401:invokestatic    #265 <Method boolean checkRTL(String)>
	//* 218  404:ifeq            476
				byte0 = 2;
	//  219  407:iconst_2        
	//  220  408:istore          8
			else
	//* 221  410:aload           11
	//* 222  412:invokestatic    #324 <Method String removeCRLF(String)>
	//* 223  415:astore          14
	//* 224  417:aload_0         
	//* 225  418:getfield        #33  <Field ArrayList choiceSelections>
	//* 226  421:iload           7
	//* 227  423:invokestatic    #185 <Method Integer Integer.valueOf(int)>
	//* 228  426:invokevirtual   #527 <Method boolean ArrayList.contains(Object)>
	//* 229  429:ifeq            482
	//* 230  432:getstatic       #530 <Field GrayColor GrayColor.GRAYWHITE>
	//* 231  435:astore          11
	//* 232  437:aload           12
	//* 233  439:iconst_0        
	//* 234  440:aload_0         
	//* 235  441:aload           14
	//* 236  443:aload           13
	//* 237  445:aload           11
	//* 238  447:fload_1         
	//* 239  448:invokespecial   #270 <Method Phrase composePhrase(String, BaseFont, BaseColor, float)>
	//* 240  451:fload_2         
	//* 241  452:fconst_2        
	//* 242  453:fmul            
	//* 243  454:fload_3         
	//* 244  455:fconst_0        
	//* 245  456:iload           8
	//* 246  458:iconst_0        
	//* 247  459:invokestatic    #376 <Method void ColumnText.showTextAligned(PdfContentByte, int, Phrase, float, float, float, int, int)>
	//* 248  462:iload           7
	//* 249  464:iconst_1        
	//* 250  465:iadd            
	//* 251  466:istore          7
	//* 252  468:fload_3         
	//* 253  469:fload           4
	//* 254  471:fsub            
	//* 255  472:fstore_3        
	//* 256  473:goto            383
				byte0 = 1;
	//  257  476:iconst_1        
	//  258  477:istore          8
			s = removeCRLF(((String) (obj1)));
			if(choiceSelections.contains(((Object) (Integer.valueOf(j)))))
				obj1 = ((Object) (GrayColor.GRAYWHITE));
			else
	//* 259  479:goto            410
				obj1 = obj;
	//  260  482:aload           10
	//  261  484:astore          11
			ColumnText.showTextAligned(((PdfContentByte) (pdfappearance)), 0, composePhrase(s, basefont, ((BaseColor) (obj1)), f), f1 * 2.0F, f2, 0.0F, ((int) (byte0)), 0);
			j++;
			f2 -= f3;
		}
	//* 262  486:goto            437
		pdfappearance.restoreState();
	//  263  489:aload           12
	//  264  491:invokevirtual   #322 <Method void PdfAppearance.restoreState()>
		pdfappearance.endVariableText();
	//  265  494:aload           12
	//  266  496:invokevirtual   #208 <Method void PdfAppearance.endVariableText()>
		return pdfappearance;
	//  267  499:aload           12
	//  268  501:areturn         
	}

	public PdfFormField getListField()
		throws IOException, DocumentException
	{
		return getChoiceField(true);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:invokevirtual   #512 <Method PdfFormField getChoiceField(boolean)>
	//    3    5:areturn         
	}

	public ArrayList getSubstitutionFonts()
	{
		return substitutionFonts;
	//    0    0:aload_0         
	//    1    1:getfield        #77  <Field ArrayList substitutionFonts>
	//    2    4:areturn         
	}

	public PdfFormField getTextField()
		throws IOException, DocumentException
	{
		PdfFormField pdfformfield;
		if(maxCharacterLength <= 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #331 <Field int maxCharacterLength>
	//*   2    4:ifgt            19
			options = options & 0xfeffffff;
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #180 <Field int options>
	//    6   12:ldc2            #535 <Int 0xfeffffff>
	//    7   15:iand            
	//    8   16:putfield        #180 <Field int options>
		if((options & 0x1000000) != 0)
	//*   9   19:aload_0         
	//*  10   20:getfield        #180 <Field int options>
	//*  11   23:ldc2            #328 <Int 0x1000000>
	//*  12   26:iand            
	//*  13   27:ifeq            42
			options = options & 0xffffefff;
	//   14   30:aload_0         
	//   15   31:aload_0         
	//   16   32:getfield        #180 <Field int options>
	//   17   35:sipush          -4097
	//   18   38:iand            
	//   19   39:putfield        #180 <Field int options>
		pdfformfield = PdfFormField.createTextField(writer, false, false, maxCharacterLength);
	//   20   42:aload_0         
	//   21   43:getfield        #392 <Field PdfWriter writer>
	//   22   46:iconst_0        
	//   23   47:iconst_0        
	//   24   48:aload_0         
	//   25   49:getfield        #331 <Field int maxCharacterLength>
	//   26   52:invokestatic    #539 <Method PdfFormField PdfFormField.createTextField(PdfWriter, boolean, boolean, int)>
	//   27   55:astore_1        
		pdfformfield.setWidget(box, PdfAnnotation.HIGHLIGHT_INVERT);
	//   28   56:aload_1         
	//   29   57:aload_0         
	//   30   58:getfield        #215 <Field Rectangle box>
	//   31   61:getstatic       #401 <Field PdfName PdfAnnotation.HIGHLIGHT_INVERT>
	//   32   64:invokevirtual   #405 <Method void PdfFormField.setWidget(Rectangle, PdfName)>
		alignment;
	//   33   67:aload_0         
	//   34   68:getfield        #291 <Field int alignment>
		JVM INSTR tableswitch 1 2: default 92
	//	               1 447
	//	               2 455;
	//   35   71:tableswitch     1 2: default 92
	//	               1 447
	//	               2 455
		   goto _L1 _L2 _L3
_L1:
		break; /* Loop/switch isn't completed */
_L3:
		break MISSING_BLOCK_LABEL_455;
_L4:
		if(rotation != 0)
	//*  36   92:aload_0         
	//*  37   93:getfield        #408 <Field int rotation>
	//*  38   96:ifeq            107
			pdfformfield.setMKRotation(rotation);
	//   39   99:aload_1         
	//   40  100:aload_0         
	//   41  101:getfield        #408 <Field int rotation>
	//   42  104:invokevirtual   #411 <Method void PdfFormField.setMKRotation(int)>
		if(fieldName != null)
	//*  43  107:aload_0         
	//*  44  108:getfield        #414 <Field String fieldName>
	//*  45  111:ifnull          302
		{
			pdfformfield.setFieldName(fieldName);
	//   46  114:aload_1         
	//   47  115:aload_0         
	//   48  116:getfield        #414 <Field String fieldName>
	//   49  119:invokevirtual   #417 <Method void PdfFormField.setFieldName(String)>
			if(!"".equals(((Object) (text))))
	//*  50  122:ldc2            #346 <String "">
	//*  51  125:aload_0         
	//*  52  126:getfield        #205 <Field String text>
	//*  53  129:invokevirtual   #542 <Method boolean String.equals(Object)>
	//*  54  132:ifne            143
				pdfformfield.setValueAsString(text);
	//   55  135:aload_1         
	//   56  136:aload_0         
	//   57  137:getfield        #205 <Field String text>
	//   58  140:invokevirtual   #420 <Method void PdfFormField.setValueAsString(String)>
			if(defaultText != null)
	//*  59  143:aload_0         
	//*  60  144:getfield        #515 <Field String defaultText>
	//*  61  147:ifnull          158
				pdfformfield.setDefaultValueAsString(defaultText);
	//   62  150:aload_1         
	//   63  151:aload_0         
	//   64  152:getfield        #515 <Field String defaultText>
	//   65  155:invokevirtual   #423 <Method void PdfFormField.setDefaultValueAsString(String)>
			if((options & 1) != 0)
	//*  66  158:aload_0         
	//*  67  159:getfield        #180 <Field int options>
	//*  68  162:iconst_1        
	//*  69  163:iand            
	//*  70  164:ifeq            173
				pdfformfield.setFieldFlags(1);
	//   71  167:aload_1         
	//   72  168:iconst_1        
	//   73  169:invokevirtual   #426 <Method int PdfFormField.setFieldFlags(int)>
	//   74  172:pop             
			if((options & 2) != 0)
	//*  75  173:aload_0         
	//*  76  174:getfield        #180 <Field int options>
	//*  77  177:iconst_2        
	//*  78  178:iand            
	//*  79  179:ifeq            188
				pdfformfield.setFieldFlags(2);
	//   80  182:aload_1         
	//   81  183:iconst_2        
	//   82  184:invokevirtual   #426 <Method int PdfFormField.setFieldFlags(int)>
	//   83  187:pop             
			if((options & 0x1000) != 0)
	//*  84  188:aload_0         
	//*  85  189:getfield        #180 <Field int options>
	//*  86  192:sipush          4096
	//*  87  195:iand            
	//*  88  196:ifeq            207
				pdfformfield.setFieldFlags(4096);
	//   89  199:aload_1         
	//   90  200:sipush          4096
	//   91  203:invokevirtual   #426 <Method int PdfFormField.setFieldFlags(int)>
	//   92  206:pop             
			if((options & 0x800000) != 0)
	//*  93  207:aload_0         
	//*  94  208:getfield        #180 <Field int options>
	//*  95  211:ldc2            #543 <Int 0x800000>
	//*  96  214:iand            
	//*  97  215:ifeq            226
				pdfformfield.setFieldFlags(0x800000);
	//   98  218:aload_1         
	//   99  219:ldc2            #543 <Int 0x800000>
	//  100  222:invokevirtual   #426 <Method int PdfFormField.setFieldFlags(int)>
	//  101  225:pop             
			if((options & 0x2000) != 0)
	//* 102  226:aload_0         
	//* 103  227:getfield        #180 <Field int options>
	//* 104  230:sipush          8192
	//* 105  233:iand            
	//* 106  234:ifeq            245
				pdfformfield.setFieldFlags(8192);
	//  107  237:aload_1         
	//  108  238:sipush          8192
	//  109  241:invokevirtual   #426 <Method int PdfFormField.setFieldFlags(int)>
	//  110  244:pop             
			if((options & 0x100000) != 0)
	//* 111  245:aload_0         
	//* 112  246:getfield        #180 <Field int options>
	//* 113  249:ldc2            #544 <Int 0x100000>
	//* 114  252:iand            
	//* 115  253:ifeq            264
				pdfformfield.setFieldFlags(0x100000);
	//  116  256:aload_1         
	//  117  257:ldc2            #544 <Int 0x100000>
	//  118  260:invokevirtual   #426 <Method int PdfFormField.setFieldFlags(int)>
	//  119  263:pop             
			if((options & 0x400000) != 0)
	//* 120  264:aload_0         
	//* 121  265:getfield        #180 <Field int options>
	//* 122  268:ldc2            #427 <Int 0x400000>
	//* 123  271:iand            
	//* 124  272:ifeq            283
				pdfformfield.setFieldFlags(0x400000);
	//  125  275:aload_1         
	//  126  276:ldc2            #427 <Int 0x400000>
	//  127  279:invokevirtual   #426 <Method int PdfFormField.setFieldFlags(int)>
	//  128  282:pop             
			if((options & 0x1000000) != 0)
	//* 129  283:aload_0         
	//* 130  284:getfield        #180 <Field int options>
	//* 131  287:ldc2            #328 <Int 0x1000000>
	//* 132  290:iand            
	//* 133  291:ifeq            302
				pdfformfield.setFieldFlags(0x1000000);
	//  134  294:aload_1         
	//  135  295:ldc2            #328 <Int 0x1000000>
	//  136  298:invokevirtual   #426 <Method int PdfFormField.setFieldFlags(int)>
	//  137  301:pop             
		}
		pdfformfield.setBorderStyle(new PdfBorderDictionary(borderWidth, borderStyle, new PdfDashPattern(3F)));
	//  138  302:aload_1         
	//  139  303:new             #429 <Class PdfBorderDictionary>
	//  140  306:dup             
	//  141  307:aload_0         
	//  142  308:getfield        #224 <Field float borderWidth>
	//  143  311:aload_0         
	//  144  312:getfield        #211 <Field int borderStyle>
	//  145  315:new             #431 <Class PdfDashPattern>
	//  146  318:dup             
	//  147  319:ldc2            #432 <Float 3F>
	//  148  322:invokespecial   #434 <Method void PdfDashPattern(float)>
	//  149  325:invokespecial   #437 <Method void PdfBorderDictionary(float, int, PdfDashPattern)>
	//  150  328:invokevirtual   #441 <Method void PdfFormField.setBorderStyle(PdfBorderDictionary)>
		PdfAppearance pdfappearance = getAppearance();
	//  151  331:aload_0         
	//  152  332:invokevirtual   #502 <Method PdfAppearance getAppearance()>
	//  153  335:astore_2        
		pdfformfield.setAppearance(PdfAnnotation.APPEARANCE_NORMAL, ((PdfTemplate) (pdfappearance)));
	//  154  336:aload_1         
	//  155  337:getstatic       #452 <Field PdfName PdfAnnotation.APPEARANCE_NORMAL>
	//  156  340:aload_2         
	//  157  341:invokevirtual   #456 <Method void PdfFormField.setAppearance(PdfName, PdfTemplate)>
		pdfappearance = (PdfAppearance)pdfappearance.getDuplicate();
	//  158  344:aload_2         
	//  159  345:invokevirtual   #460 <Method PdfContentByte PdfAppearance.getDuplicate()>
	//  160  348:checkcast       #199 <Class PdfAppearance>
	//  161  351:astore_2        
		pdfappearance.setFontAndSize(getRealFont(), fontSize);
	//  162  352:aload_2         
	//  163  353:aload_0         
	//  164  354:invokevirtual   #253 <Method BaseFont getRealFont()>
	//  165  357:aload_0         
	//  166  358:getfield        #268 <Field float fontSize>
	//  167  361:invokevirtual   #344 <Method void PdfAppearance.setFontAndSize(BaseFont, float)>
		if(textColor == null)
	//* 168  364:aload_0         
	//* 169  365:getfield        #257 <Field BaseColor textColor>
	//* 170  368:ifnonnull       463
			pdfappearance.setGrayFill(0.0F);
	//  171  371:aload_2         
	//  172  372:fconst_0        
	//  173  373:invokevirtual   #334 <Method void PdfAppearance.setGrayFill(float)>
		else
	//* 174  376:aload_1         
	//* 175  377:aload_2         
	//* 176  378:invokevirtual   #463 <Method void PdfFormField.setDefaultAppearanceString(PdfContentByte)>
	//* 177  381:aload_0         
	//* 178  382:getfield        #466 <Field BaseColor borderColor>
	//* 179  385:ifnull          396
	//* 180  388:aload_1         
	//* 181  389:aload_0         
	//* 182  390:getfield        #466 <Field BaseColor borderColor>
	//* 183  393:invokevirtual   #469 <Method void PdfFormField.setMKBorderColor(BaseColor)>
	//* 184  396:aload_0         
	//* 185  397:getfield        #472 <Field BaseColor backgroundColor>
	//* 186  400:ifnull          411
	//* 187  403:aload_1         
	//* 188  404:aload_0         
	//* 189  405:getfield        #472 <Field BaseColor backgroundColor>
	//* 190  408:invokevirtual   #475 <Method void PdfFormField.setMKBackgroundColor(BaseColor)>
	//* 191  411:aload_0         
	//* 192  412:getfield        #478 <Field int visibility>
	//* 193  415:tableswitch     1 3: default 440
	//	               1 474
	//	               2 445
	//	               3 482
	//* 194  440:aload_1         
	//* 195  441:iconst_4        
	//* 196  442:invokevirtual   #481 <Method void PdfFormField.setFlags(int)>
	//* 197  445:aload_1         
	//* 198  446:areturn         
	//* 199  447:aload_1         
	//* 200  448:iconst_1        
	//* 201  449:invokevirtual   #547 <Method void PdfFormField.setQuadding(int)>
	//* 202  452:goto            92
	//* 203  455:aload_1         
	//* 204  456:iconst_2        
	//* 205  457:invokevirtual   #547 <Method void PdfFormField.setQuadding(int)>
	//* 206  460:goto            92
			pdfappearance.setColorFill(textColor);
	//  207  463:aload_2         
	//  208  464:aload_0         
	//  209  465:getfield        #257 <Field BaseColor textColor>
	//  210  468:invokevirtual   #369 <Method void PdfAppearance.setColorFill(BaseColor)>
		pdfformfield.setDefaultAppearanceString(((PdfContentByte) (pdfappearance)));
		if(borderColor != null)
			pdfformfield.setMKBorderColor(borderColor);
		if(backgroundColor != null)
			pdfformfield.setMKBackgroundColor(backgroundColor);
		switch(visibility)
		{
		default:
			pdfformfield.setFlags(4);
			// fall through

		case 2: // '\002'
			return pdfformfield;

	//* 211  471:goto            376
		case 1: // '\001'
			pdfformfield.setFlags(6);
	//  212  474:aload_1         
	//  213  475:bipush          6
	//  214  477:invokevirtual   #481 <Method void PdfFormField.setFlags(int)>
			return pdfformfield;
	//  215  480:aload_1         
	//  216  481:areturn         

		case 3: // '\003'
			pdfformfield.setFlags(36);
	//  217  482:aload_1         
	//  218  483:bipush          36
	//  219  485:invokevirtual   #481 <Method void PdfFormField.setFlags(int)>
			break;
		}
		break MISSING_BLOCK_LABEL_488;
_L2:
		pdfformfield.setQuadding(1);
		  goto _L4
		pdfformfield.setQuadding(2);
		  goto _L4
		return pdfformfield;
	//  220  488:aload_1         
	//  221  489:areturn         
	}

	int getTopFirst()
	{
		return topFirst;
	//    0    0:aload_0         
	//    1    1:getfield        #446 <Field int topFirst>
	//    2    4:ireturn         
	}

	public int getVisibleTopChoice()
	{
		return visibleTopChoice;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field int visibleTopChoice>
	//    2    4:ireturn         
	}

	public void setChoiceExports(String as[])
	{
		choiceExports = as;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #381 <Field String[] choiceExports>
	//    3    5:return          
	}

	public void setChoiceSelection(int i)
	{
		choiceSelections = new ArrayList();
	//    0    0:aload_0         
	//    1    1:new             #28  <Class ArrayList>
	//    2    4:dup             
	//    3    5:invokespecial   #31  <Method void ArrayList()>
	//    4    8:putfield        #33  <Field ArrayList choiceSelections>
		choiceSelections.add(((Object) (Integer.valueOf(i))));
	//    5   11:aload_0         
	//    6   12:getfield        #33  <Field ArrayList choiceSelections>
	//    7   15:iload_1         
	//    8   16:invokestatic    #185 <Method Integer Integer.valueOf(int)>
	//    9   19:invokevirtual   #188 <Method boolean ArrayList.add(Object)>
	//   10   22:pop             
	//   11   23:return          
	}

	public void setChoiceSelections(ArrayList arraylist)
	{
		if(arraylist != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          60
		{
			choiceSelections = new ArrayList(((java.util.Collection) (arraylist)));
	//    2    4:aload_0         
	//    3    5:new             #28  <Class ArrayList>
	//    4    8:dup             
	//    5    9:aload_1         
	//    6   10:invokespecial   #557 <Method void ArrayList(java.util.Collection)>
	//    7   13:putfield        #33  <Field ArrayList choiceSelections>
			if(choiceSelections.size() > 1 && (options & 0x200000) == 0)
	//*   8   16:aload_0         
	//*   9   17:getfield        #33  <Field ArrayList choiceSelections>
	//*  10   20:invokevirtual   #98  <Method int ArrayList.size()>
	//*  11   23:iconst_1        
	//*  12   24:icmple          67
	//*  13   27:aload_0         
	//*  14   28:getfield        #180 <Field int options>
	//*  15   31:ldc1            #181 <Int 0x200000>
	//*  16   33:iand            
	//*  17   34:ifne            67
				for(; choiceSelections.size() > 1; choiceSelections.remove(1));
	//   18   37:aload_0         
	//   19   38:getfield        #33  <Field ArrayList choiceSelections>
	//   20   41:invokevirtual   #98  <Method int ArrayList.size()>
	//   21   44:iconst_1        
	//   22   45:icmple          67
	//   23   48:aload_0         
	//   24   49:getfield        #33  <Field ArrayList choiceSelections>
	//   25   52:iconst_1        
	//   26   53:invokevirtual   #560 <Method Object ArrayList.remove(int)>
	//   27   56:pop             
		} else
	//*  28   57:goto            37
		{
			choiceSelections.clear();
	//   29   60:aload_0         
	//   30   61:getfield        #33  <Field ArrayList choiceSelections>
	//   31   64:invokevirtual   #563 <Method void ArrayList.clear()>
		}
	//   32   67:return          
	}

	public void setChoices(String as[])
	{
		choices = as;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #110 <Field String[] choices>
	//    3    5:return          
	}

	public void setDefaultText(String s)
	{
		defaultText = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #515 <Field String defaultText>
	//    3    5:return          
	}

	public void setExtensionFont(BaseFont basefont)
	{
		extensionFont = basefont;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #75  <Field BaseFont extensionFont>
	//    3    5:return          
	}

	public void setExtraMargin(float f, float f1)
	{
		extraMarginLeft = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #272 <Field float extraMarginLeft>
		extraMarginTop = f1;
	//    3    5:aload_0         
	//    4    6:fload_2         
	//    5    7:putfield        #226 <Field float extraMarginTop>
	//    6   10:return          
	}

	public void setSubstitutionFonts(ArrayList arraylist)
	{
		substitutionFonts = arraylist;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #77  <Field ArrayList substitutionFonts>
	//    3    5:return          
	}

	public void setVisibleTopChoice(int i)
	{
		while(i < 0 || choices == null || i >= choices.length) 
	//*   0    0:iload_1         
	//*   1    1:ifge            5
			return;
	//    2    4:return          
	//    3    5:aload_0         
	//    4    6:getfield        #110 <Field String[] choices>
	//    5    9:ifnull          4
	//    6   12:iload_1         
	//    7   13:aload_0         
	//    8   14:getfield        #110 <Field String[] choices>
	//    9   17:arraylength     
	//   10   18:icmpge          4
		visibleTopChoice = i;
	//   11   21:aload_0         
	//   12   22:iload_1         
	//   13   23:putfield        #35  <Field int visibleTopChoice>
	//   14   26:return          
	}

	private String choiceExports[];
	private ArrayList choiceSelections;
	private String choices[];
	private String defaultText;
	private BaseFont extensionFont;
	private float extraMarginLeft;
	private float extraMarginTop;
	private ArrayList substitutionFonts;
	private int topFirst;
	private int visibleTopChoice;
}
