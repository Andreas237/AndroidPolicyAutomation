// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text;

import com.itextpdf.text.error_messages.MessageLocalization;
import com.itextpdf.text.pdf.HyphenationEvent;
import com.itextpdf.text.pdf.PdfName;
import java.util.*;

// Referenced classes of package com.itextpdf.text:
//			TextElementArray, Font, Chunk, SpecialSymbol, 
//			Element, DocumentException, ElementListener, TabSettings

public class Phrase extends ArrayList
	implements TextElementArray
{

	public Phrase()
	{
		this(16F);
	//    0    0:aload_0         
	//    1    1:ldc1            #23  <Float 16F>
	//    2    3:invokespecial   #26  <Method void Phrase(float)>
	//    3    6:return          
	}

	public Phrase(float f)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #29  <Method void ArrayList()>
		leading = (0.0F / 0.0F);
	//    2    4:aload_0         
	//    3    5:ldc1            #30  <Float (0.0F / 0.0F)>
	//    4    7:putfield        #32  <Field float leading>
		multipliedLeading = 0.0F;
	//    5   10:aload_0         
	//    6   11:fconst_0        
	//    7   12:putfield        #34  <Field float multipliedLeading>
		hyphenation = null;
	//    8   15:aload_0         
	//    9   16:aconst_null     
	//   10   17:putfield        #36  <Field HyphenationEvent hyphenation>
		tabSettings = null;
	//   11   20:aload_0         
	//   12   21:aconst_null     
	//   13   22:putfield        #38  <Field TabSettings tabSettings>
		leading = f;
	//   14   25:aload_0         
	//   15   26:fload_1         
	//   16   27:putfield        #32  <Field float leading>
		font = new Font();
	//   17   30:aload_0         
	//   18   31:new             #40  <Class Font>
	//   19   34:dup             
	//   20   35:invokespecial   #41  <Method void Font()>
	//   21   38:putfield        #43  <Field Font font>
	//   22   41:return          
	}

	public Phrase(float f, Chunk chunk)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #29  <Method void ArrayList()>
		leading = (0.0F / 0.0F);
	//    2    4:aload_0         
	//    3    5:ldc1            #30  <Float (0.0F / 0.0F)>
	//    4    7:putfield        #32  <Field float leading>
		multipliedLeading = 0.0F;
	//    5   10:aload_0         
	//    6   11:fconst_0        
	//    7   12:putfield        #34  <Field float multipliedLeading>
		hyphenation = null;
	//    8   15:aload_0         
	//    9   16:aconst_null     
	//   10   17:putfield        #36  <Field HyphenationEvent hyphenation>
		tabSettings = null;
	//   11   20:aload_0         
	//   12   21:aconst_null     
	//   13   22:putfield        #38  <Field TabSettings tabSettings>
		leading = f;
	//   14   25:aload_0         
	//   15   26:fload_1         
	//   16   27:putfield        #32  <Field float leading>
		super.add(((Object) (chunk)));
	//   17   30:aload_0         
	//   18   31:aload_2         
	//   19   32:invokespecial   #48  <Method boolean ArrayList.add(Object)>
	//   20   35:pop             
		font = chunk.getFont();
	//   21   36:aload_0         
	//   22   37:aload_2         
	//   23   38:invokevirtual   #54  <Method Font Chunk.getFont()>
	//   24   41:putfield        #43  <Field Font font>
		setHyphenation(chunk.getHyphenation());
	//   25   44:aload_0         
	//   26   45:aload_2         
	//   27   46:invokevirtual   #58  <Method HyphenationEvent Chunk.getHyphenation()>
	//   28   49:invokevirtual   #62  <Method void setHyphenation(HyphenationEvent)>
	//   29   52:return          
	}

	public Phrase(float f, String s)
	{
		this(f, s, new Font());
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:aload_2         
	//    3    3:new             #40  <Class Font>
	//    4    6:dup             
	//    5    7:invokespecial   #41  <Method void Font()>
	//    6   10:invokespecial   #66  <Method void Phrase(float, String, Font)>
	//    7   13:return          
	}

	public Phrase(float f, String s, Font font1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #29  <Method void ArrayList()>
		leading = (0.0F / 0.0F);
	//    2    4:aload_0         
	//    3    5:ldc1            #30  <Float (0.0F / 0.0F)>
	//    4    7:putfield        #32  <Field float leading>
		multipliedLeading = 0.0F;
	//    5   10:aload_0         
	//    6   11:fconst_0        
	//    7   12:putfield        #34  <Field float multipliedLeading>
		hyphenation = null;
	//    8   15:aload_0         
	//    9   16:aconst_null     
	//   10   17:putfield        #36  <Field HyphenationEvent hyphenation>
		tabSettings = null;
	//   11   20:aload_0         
	//   12   21:aconst_null     
	//   13   22:putfield        #38  <Field TabSettings tabSettings>
		leading = f;
	//   14   25:aload_0         
	//   15   26:fload_1         
	//   16   27:putfield        #32  <Field float leading>
		font = font1;
	//   17   30:aload_0         
	//   18   31:aload_3         
	//   19   32:putfield        #43  <Field Font font>
		if(s != null && s.length() != 0)
	//*  20   35:aload_2         
	//*  21   36:ifnull          60
	//*  22   39:aload_2         
	//*  23   40:invokevirtual   #72  <Method int String.length()>
	//*  24   43:ifeq            60
			super.add(((Object) (new Chunk(s, font1))));
	//   25   46:aload_0         
	//   26   47:new             #50  <Class Chunk>
	//   27   50:dup             
	//   28   51:aload_2         
	//   29   52:aload_3         
	//   30   53:invokespecial   #75  <Method void Chunk(String, Font)>
	//   31   56:invokespecial   #48  <Method boolean ArrayList.add(Object)>
	//   32   59:pop             
	//   33   60:return          
	}

	public Phrase(Chunk chunk)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #29  <Method void ArrayList()>
		leading = (0.0F / 0.0F);
	//    2    4:aload_0         
	//    3    5:ldc1            #30  <Float (0.0F / 0.0F)>
	//    4    7:putfield        #32  <Field float leading>
		multipliedLeading = 0.0F;
	//    5   10:aload_0         
	//    6   11:fconst_0        
	//    7   12:putfield        #34  <Field float multipliedLeading>
		hyphenation = null;
	//    8   15:aload_0         
	//    9   16:aconst_null     
	//   10   17:putfield        #36  <Field HyphenationEvent hyphenation>
		tabSettings = null;
	//   11   20:aload_0         
	//   12   21:aconst_null     
	//   13   22:putfield        #38  <Field TabSettings tabSettings>
		super.add(((Object) (chunk)));
	//   14   25:aload_0         
	//   15   26:aload_1         
	//   16   27:invokespecial   #48  <Method boolean ArrayList.add(Object)>
	//   17   30:pop             
		font = chunk.getFont();
	//   18   31:aload_0         
	//   19   32:aload_1         
	//   20   33:invokevirtual   #54  <Method Font Chunk.getFont()>
	//   21   36:putfield        #43  <Field Font font>
		setHyphenation(chunk.getHyphenation());
	//   22   39:aload_0         
	//   23   40:aload_1         
	//   24   41:invokevirtual   #58  <Method HyphenationEvent Chunk.getHyphenation()>
	//   25   44:invokevirtual   #62  <Method void setHyphenation(HyphenationEvent)>
	//   26   47:return          
	}

	public Phrase(Phrase phrase)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #29  <Method void ArrayList()>
		leading = (0.0F / 0.0F);
	//    2    4:aload_0         
	//    3    5:ldc1            #30  <Float (0.0F / 0.0F)>
	//    4    7:putfield        #32  <Field float leading>
		multipliedLeading = 0.0F;
	//    5   10:aload_0         
	//    6   11:fconst_0        
	//    7   12:putfield        #34  <Field float multipliedLeading>
		hyphenation = null;
	//    8   15:aload_0         
	//    9   16:aconst_null     
	//   10   17:putfield        #36  <Field HyphenationEvent hyphenation>
		tabSettings = null;
	//   11   20:aload_0         
	//   12   21:aconst_null     
	//   13   22:putfield        #38  <Field TabSettings tabSettings>
		addAll(((Collection) (phrase)));
	//   14   25:aload_0         
	//   15   26:aload_1         
	//   16   27:invokevirtual   #81  <Method boolean addAll(Collection)>
	//   17   30:pop             
		setLeading(phrase.getLeading(), phrase.getMultipliedLeading());
	//   18   31:aload_0         
	//   19   32:aload_1         
	//   20   33:invokevirtual   #85  <Method float getLeading()>
	//   21   36:aload_1         
	//   22   37:invokevirtual   #88  <Method float getMultipliedLeading()>
	//   23   40:invokevirtual   #92  <Method void setLeading(float, float)>
		font = phrase.getFont();
	//   24   43:aload_0         
	//   25   44:aload_1         
	//   26   45:invokevirtual   #93  <Method Font getFont()>
	//   27   48:putfield        #43  <Field Font font>
		tabSettings = phrase.getTabSettings();
	//   28   51:aload_0         
	//   29   52:aload_1         
	//   30   53:invokevirtual   #97  <Method TabSettings getTabSettings()>
	//   31   56:putfield        #38  <Field TabSettings tabSettings>
		setHyphenation(phrase.getHyphenation());
	//   32   59:aload_0         
	//   33   60:aload_1         
	//   34   61:invokevirtual   #98  <Method HyphenationEvent getHyphenation()>
	//   35   64:invokevirtual   #62  <Method void setHyphenation(HyphenationEvent)>
	//   36   67:return          
	}

	public Phrase(String s)
	{
		this((0.0F / 0.0F), s, new Font());
	//    0    0:aload_0         
	//    1    1:ldc1            #30  <Float (0.0F / 0.0F)>
	//    2    3:aload_1         
	//    3    4:new             #40  <Class Font>
	//    4    7:dup             
	//    5    8:invokespecial   #41  <Method void Font()>
	//    6   11:invokespecial   #66  <Method void Phrase(float, String, Font)>
	//    7   14:return          
	}

	public Phrase(String s, Font font1)
	{
		this((0.0F / 0.0F), s, font1);
	//    0    0:aload_0         
	//    1    1:ldc1            #30  <Float (0.0F / 0.0F)>
	//    2    3:aload_1         
	//    3    4:aload_2         
	//    4    5:invokespecial   #66  <Method void Phrase(float, String, Font)>
	//    5    8:return          
	}

	private Phrase(boolean flag)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #29  <Method void ArrayList()>
		leading = (0.0F / 0.0F);
	//    2    4:aload_0         
	//    3    5:ldc1            #30  <Float (0.0F / 0.0F)>
	//    4    7:putfield        #32  <Field float leading>
		multipliedLeading = 0.0F;
	//    5   10:aload_0         
	//    6   11:fconst_0        
	//    7   12:putfield        #34  <Field float multipliedLeading>
		hyphenation = null;
	//    8   15:aload_0         
	//    9   16:aconst_null     
	//   10   17:putfield        #36  <Field HyphenationEvent hyphenation>
		tabSettings = null;
	//   11   20:aload_0         
	//   12   21:aconst_null     
	//   13   22:putfield        #38  <Field TabSettings tabSettings>
	//   14   25:return          
	}

	public static final Phrase getInstance(int i, String s)
	{
		return getInstance(i, s, new Font());
	//    0    0:iload_0         
	//    1    1:aload_1         
	//    2    2:new             #40  <Class Font>
	//    3    5:dup             
	//    4    6:invokespecial   #41  <Method void Font()>
	//    5    9:invokestatic    #105 <Method Phrase getInstance(int, String, Font)>
	//    6   12:areturn         
	}

	public static final Phrase getInstance(int i, String s, Font font1)
	{
		Phrase phrase = new Phrase(true);
	//    0    0:new             #2   <Class Phrase>
	//    1    3:dup             
	//    2    4:iconst_1        
	//    3    5:invokespecial   #107 <Method void Phrase(boolean)>
	//    4    8:astore          4
		phrase.setLeading(i);
	//    5   10:aload           4
	//    6   12:iload_0         
	//    7   13:i2f             
	//    8   14:invokevirtual   #109 <Method void setLeading(float)>
		phrase.font = font1;
	//    9   17:aload           4
	//   10   19:aload_2         
	//   11   20:putfield        #43  <Field Font font>
		String s1 = s;
	//   12   23:aload_1         
	//   13   24:astore_3        
		if(font1.getFamily() != Font.FontFamily.SYMBOL)
	//*  14   25:aload_2         
	//*  15   26:invokevirtual   #113 <Method Font$FontFamily Font.getFamily()>
	//*  16   29:getstatic       #119 <Field Font$FontFamily Font$FontFamily.SYMBOL>
	//*  17   32:if_acmpeq       206
		{
			s1 = s;
	//   18   35:aload_1         
	//   19   36:astore_3        
			if(font1.getFamily() != Font.FontFamily.ZAPFDINGBATS)
	//*  20   37:aload_2         
	//*  21   38:invokevirtual   #113 <Method Font$FontFamily Font.getFamily()>
	//*  22   41:getstatic       #122 <Field Font$FontFamily Font$FontFamily.ZAPFDINGBATS>
	//*  23   44:if_acmpeq       206
			{
				s1 = s;
	//   24   47:aload_1         
	//   25   48:astore_3        
				if(font1.getBaseFont() == null)
	//*  26   49:aload_2         
	//*  27   50:invokevirtual   #126 <Method com.itextpdf.text.pdf.BaseFont Font.getBaseFont()>
	//*  28   53:ifnonnull       206
					do
					{
						i = SpecialSymbol.index(s);
	//   29   56:aload_1         
	//   30   57:invokestatic    #132 <Method int SpecialSymbol.index(String)>
	//   31   60:istore_0        
						s1 = s;
	//   32   61:aload_1         
	//   33   62:astore_3        
						if(i <= -1)
							break;
	//   34   63:iload_0         
	//   35   64:iconst_m1       
	//   36   65:icmple          206
						s1 = s;
	//   37   68:aload_1         
	//   38   69:astore_3        
						if(i > 0)
	//*  39   70:iload_0         
	//*  40   71:ifle            100
						{
							phrase.add(((Element) (new Chunk(s.substring(0, i), font1))));
	//   41   74:aload           4
	//   42   76:new             #50  <Class Chunk>
	//   43   79:dup             
	//   44   80:aload_1         
	//   45   81:iconst_0        
	//   46   82:iload_0         
	//   47   83:invokevirtual   #136 <Method String String.substring(int, int)>
	//   48   86:aload_2         
	//   49   87:invokespecial   #75  <Method void Chunk(String, Font)>
	//   50   90:invokevirtual   #139 <Method boolean add(Element)>
	//   51   93:pop             
							s1 = s.substring(i);
	//   52   94:aload_1         
	//   53   95:iload_0         
	//   54   96:invokevirtual   #142 <Method String String.substring(int)>
	//   55   99:astore_3        
						}
						Font font2 = new Font(Font.FontFamily.SYMBOL, font1.getSize(), font1.getStyle(), font1.getColor());
	//   56  100:new             #40  <Class Font>
	//   57  103:dup             
	//   58  104:getstatic       #119 <Field Font$FontFamily Font$FontFamily.SYMBOL>
	//   59  107:aload_2         
	//   60  108:invokevirtual   #145 <Method float Font.getSize()>
	//   61  111:aload_2         
	//   62  112:invokevirtual   #148 <Method int Font.getStyle()>
	//   63  115:aload_2         
	//   64  116:invokevirtual   #152 <Method BaseColor Font.getColor()>
	//   65  119:invokespecial   #155 <Method void Font(Font$FontFamily, float, int, BaseColor)>
	//   66  122:astore          5
						StringBuffer stringbuffer = new StringBuffer();
	//   67  124:new             #157 <Class StringBuffer>
	//   68  127:dup             
	//   69  128:invokespecial   #158 <Method void StringBuffer()>
	//   70  131:astore          6
						stringbuffer.append(SpecialSymbol.getCorrespondingSymbol(s1.charAt(0)));
	//   71  133:aload           6
	//   72  135:aload_3         
	//   73  136:iconst_0        
	//   74  137:invokevirtual   #162 <Method char String.charAt(int)>
	//   75  140:invokestatic    #166 <Method char SpecialSymbol.getCorrespondingSymbol(char)>
	//   76  143:invokevirtual   #170 <Method StringBuffer StringBuffer.append(char)>
	//   77  146:pop             
						for(s = s1.substring(1); SpecialSymbol.index(s) == 0; s = s.substring(1))
	//*  78  147:aload_3         
	//*  79  148:iconst_1        
	//*  80  149:invokevirtual   #142 <Method String String.substring(int)>
	//*  81  152:astore_1        
	//*  82  153:aload_1         
	//*  83  154:invokestatic    #132 <Method int SpecialSymbol.index(String)>
	//*  84  157:ifne            183
							stringbuffer.append(SpecialSymbol.getCorrespondingSymbol(s.charAt(0)));
	//   85  160:aload           6
	//   86  162:aload_1         
	//   87  163:iconst_0        
	//   88  164:invokevirtual   #162 <Method char String.charAt(int)>
	//   89  167:invokestatic    #166 <Method char SpecialSymbol.getCorrespondingSymbol(char)>
	//   90  170:invokevirtual   #170 <Method StringBuffer StringBuffer.append(char)>
	//   91  173:pop             

	//   92  174:aload_1         
	//   93  175:iconst_1        
	//   94  176:invokevirtual   #142 <Method String String.substring(int)>
	//   95  179:astore_1        
	//*  96  180:goto            153
						phrase.add(((Element) (new Chunk(stringbuffer.toString(), font2))));
	//   97  183:aload           4
	//   98  185:new             #50  <Class Chunk>
	//   99  188:dup             
	//  100  189:aload           6
	//  101  191:invokevirtual   #174 <Method String StringBuffer.toString()>
	//  102  194:aload           5
	//  103  196:invokespecial   #75  <Method void Chunk(String, Font)>
	//  104  199:invokevirtual   #139 <Method boolean add(Element)>
	//  105  202:pop             
					} while(true);
	//  106  203:goto            56
			}
		}
		if(s1 != null && s1.length() != 0)
	//* 107  206:aload_3         
	//* 108  207:ifnull          232
	//* 109  210:aload_3         
	//* 110  211:invokevirtual   #72  <Method int String.length()>
	//* 111  214:ifeq            232
			phrase.add(((Element) (new Chunk(s1, font1))));
	//  112  217:aload           4
	//  113  219:new             #50  <Class Chunk>
	//  114  222:dup             
	//  115  223:aload_3         
	//  116  224:aload_2         
	//  117  225:invokespecial   #75  <Method void Chunk(String, Font)>
	//  118  228:invokevirtual   #139 <Method boolean add(Element)>
	//  119  231:pop             
		return phrase;
	//  120  232:aload           4
	//  121  234:areturn         
	}

	public static final Phrase getInstance(String s)
	{
		return getInstance(16, s, new Font());
	//    0    0:bipush          16
	//    1    2:aload_0         
	//    2    3:new             #40  <Class Font>
	//    3    6:dup             
	//    4    7:invokespecial   #41  <Method void Font()>
	//    5   10:invokestatic    #105 <Method Phrase getInstance(int, String, Font)>
	//    6   13:areturn         
	}

	public void add(int i, Element element)
	{
		if(element == null)
	//*   0    0:aload_2         
	//*   1    1:ifnonnull       5
			return;
	//    2    4:return          
		switch(element.type())
	//*   3    5:aload_2         
	//*   4    6:invokeinterface #181 <Method int Element.type()>
		{
	//*   5   11:lookupswitch    11: default 108
	//	               10: 135
	//	               11: 202
	//	               12: 202
	//	               14: 202
	//	               17: 202
	//	               23: 202
	//	               29: 202
	//	               37: 202
	//	               50: 202
	//	               55: 202
	//	               666: 202
		default:
			throw new ClassCastException(MessageLocalization.getComposedMessage("insertion.of.illegal.element.1", new Object[] {
				((Object) (element)).getClass().getName()
			}));
	//    6  108:new             #183 <Class ClassCastException>
	//    7  111:dup             
	//    8  112:ldc1            #185 <String "insertion.of.illegal.element.1">
	//    9  114:iconst_1        
	//   10  115:anewarray       Object[]
	//   11  118:dup             
	//   12  119:iconst_0        
	//   13  120:aload_2         
	//   14  121:invokevirtual   #191 <Method Class Object.getClass()>
	//   15  124:invokevirtual   #196 <Method String Class.getName()>
	//   16  127:aastore         
	//   17  128:invokestatic    #202 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   18  131:invokespecial   #204 <Method void ClassCastException(String)>
	//   19  134:athrow          

		case 10: // '\n'
			element = ((Element) ((Chunk)element));
	//   20  135:aload_2         
	//   21  136:checkcast       #50  <Class Chunk>
	//   22  139:astore_2        
			if(!font.isStandardFont())
	//*  23  140:aload_0         
	//*  24  141:getfield        #43  <Field Font font>
	//*  25  144:invokevirtual   #208 <Method boolean Font.isStandardFont()>
	//*  26  147:ifne            165
				((Chunk) (element)).setFont(font.difference(((Chunk) (element)).getFont()));
	//   27  150:aload_2         
	//   28  151:aload_0         
	//   29  152:getfield        #43  <Field Font font>
	//   30  155:aload_2         
	//   31  156:invokevirtual   #54  <Method Font Chunk.getFont()>
	//   32  159:invokevirtual   #212 <Method Font Font.difference(Font)>
	//   33  162:invokevirtual   #216 <Method void Chunk.setFont(Font)>
			if(hyphenation != null && ((Chunk) (element)).getHyphenation() == null && !((Chunk) (element)).isEmpty())
	//*  34  165:aload_0         
	//*  35  166:getfield        #36  <Field HyphenationEvent hyphenation>
	//*  36  169:ifnull          195
	//*  37  172:aload_2         
	//*  38  173:invokevirtual   #58  <Method HyphenationEvent Chunk.getHyphenation()>
	//*  39  176:ifnonnull       195
	//*  40  179:aload_2         
	//*  41  180:invokevirtual   #219 <Method boolean Chunk.isEmpty()>
	//*  42  183:ifne            195
				((Chunk) (element)).setHyphenation(hyphenation);
	//   43  186:aload_2         
	//   44  187:aload_0         
	//   45  188:getfield        #36  <Field HyphenationEvent hyphenation>
	//   46  191:invokevirtual   #222 <Method Chunk Chunk.setHyphenation(HyphenationEvent)>
	//   47  194:pop             
			super.add(i, ((Object) (element)));
	//   48  195:aload_0         
	//   49  196:iload_1         
	//   50  197:aload_2         
	//   51  198:invokespecial   #225 <Method void ArrayList.add(int, Object)>
			return;
	//   52  201:return          

		case 11: // '\013'
		case 12: // '\f'
		case 14: // '\016'
		case 17: // '\021'
		case 23: // '\027'
		case 29: // '\035'
		case 37: // '%'
		case 50: // '2'
		case 55: // '7'
		case 666: 
			super.add(i, ((Object) (element)));
	//   53  202:aload_0         
	//   54  203:iload_1         
	//   55  204:aload_2         
	//   56  205:invokespecial   #225 <Method void ArrayList.add(int, Object)>
			return;
	//   57  208:return          
		}
	}

	public volatile void add(int i, Object obj)
	{
		add(i, (Element)obj);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:checkcast       #178 <Class Element>
	//    4    6:invokevirtual   #227 <Method void add(int, Element)>
	//    5    9:return          
	}

	public boolean add(Element element)
	{
		if(element != null) goto _L2; else goto _L1
	//    0    0:aload_1         
	//    1    1:ifnonnull       8
_L1:
		boolean flag1 = false;
	//    2    4:iconst_0        
	//    3    5:istore_3        
_L8:
		return flag1;
	//    4    6:iload_3         
	//    5    7:ireturn         
_L2:
		element.type();
	//    6    8:aload_1         
	//    7    9:invokeinterface #181 <Method int Element.type()>
		JVM INSTR lookupswitch 11: default 240
	//	               10: 154
	//	               11: 163
	//	               12: 163
	//	               14: 232
	//	               17: 232
	//	               23: 232
	//	               29: 232
	//	               37: 232
	//	               50: 232
	//	               55: 232
	//	               666: 232;
	//    8   14:lookupswitch    11: default 240
	//	               10: 154
	//	               11: 163
	//	               12: 163
	//	               14: 232
	//	               17: 232
	//	               23: 232
	//	               29: 232
	//	               37: 232
	//	               50: 232
	//	               55: 232
	//	               666: 232
		   goto _L3 _L4 _L5 _L5 _L6 _L6 _L6 _L6 _L6 _L6 _L6 _L6
_L3:
		throw new ClassCastException(String.valueOf(element.type()));
	//    9  112:new             #183 <Class ClassCastException>
	//   10  115:dup             
	//   11  116:aload_1         
	//   12  117:invokeinterface #181 <Method int Element.type()>
	//   13  122:invokestatic    #230 <Method String String.valueOf(int)>
	//   14  125:invokespecial   #204 <Method void ClassCastException(String)>
	//   15  128:athrow          
	//*  16  129:astore_1        
	//*  17  130:new             #183 <Class ClassCastException>
	//*  18  133:dup             
	//*  19  134:ldc1            #185 <String "insertion.of.illegal.element.1">
	//*  20  136:iconst_1        
	//*  21  137:anewarray       Object[]
	//*  22  140:dup             
	//*  23  141:iconst_0        
	//*  24  142:aload_1         
	//*  25  143:invokevirtual   #233 <Method String ClassCastException.getMessage()>
	//*  26  146:aastore         
	//*  27  147:invokestatic    #202 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//*  28  150:invokespecial   #204 <Method void ClassCastException(String)>
	//*  29  153:athrow          
_L4:
		return addChunk((Chunk)element);
	//   30  154:aload_0         
	//   31  155:aload_1         
	//   32  156:checkcast       #50  <Class Chunk>
	//   33  159:invokevirtual   #237 <Method boolean addChunk(Chunk)>
	//   34  162:ireturn         
_L5:
		element = ((Element) ((Phrase)element));
	//   35  163:aload_1         
	//   36  164:checkcast       #2   <Class Phrase>
	//   37  167:astore_1        
		boolean flag;
		flag = true;
	//   38  168:iconst_1        
	//   39  169:istore_2        
		try
		{
			element = ((Element) (((Phrase) (element)).iterator()));
	//   40  170:aload_1         
	//   41  171:invokevirtual   #241 <Method Iterator iterator()>
	//   42  174:astore_1        
		}
		// Misplaced declaration of an exception variable
		catch(Element element)
		{
			throw new ClassCastException(MessageLocalization.getComposedMessage("insertion.of.illegal.element.1", new Object[] {
				((ClassCastException) (element)).getMessage()
			}));
		}
_L11:
		flag1 = flag;
	//   43  175:iload_2         
	//   44  176:istore_3        
		if(!((Iterator) (element)).hasNext()) goto _L8; else goto _L7
	//   45  177:aload_1         
	//   46  178:invokeinterface #246 <Method boolean Iterator.hasNext()>
	//   47  183:ifeq            6
_L7:
		Element element1 = (Element)((Iterator) (element)).next();
	//   48  186:aload_1         
	//   49  187:invokeinterface #250 <Method Object Iterator.next()>
	//   50  192:checkcast       #178 <Class Element>
	//   51  195:astore          4
		if(!(element1 instanceof Chunk)) goto _L10; else goto _L9
	//   52  197:aload           4
	//   53  199:instanceof      #50  <Class Chunk>
	//   54  202:ifeq            220
_L9:
		flag &= addChunk((Chunk)element1);
	//   55  205:iload_2         
	//   56  206:aload_0         
	//   57  207:aload           4
	//   58  209:checkcast       #50  <Class Chunk>
	//   59  212:invokevirtual   #237 <Method boolean addChunk(Chunk)>
	//   60  215:iand            
	//   61  216:istore_2        
		  goto _L11
	//*  62  217:goto            175
_L10:
		flag &= add(element1);
	//   63  220:iload_2         
	//   64  221:aload_0         
	//   65  222:aload           4
	//   66  224:invokevirtual   #139 <Method boolean add(Element)>
	//   67  227:iand            
	//   68  228:istore_2        
		  goto _L11
	//*  69  229:goto            175
_L6:
		flag = super.add(((Object) (element)));
	//   70  232:aload_0         
	//   71  233:aload_1         
	//   72  234:invokespecial   #48  <Method boolean ArrayList.add(Object)>
	//   73  237:istore_2        
		return flag;
	//   74  238:iload_2         
	//   75  239:ireturn         
	//*  76  240:goto            112
	}

	public volatile boolean add(Object obj)
	{
		return add((Element)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #178 <Class Element>
	//    3    5:invokevirtual   #139 <Method boolean add(Element)>
	//    4    8:ireturn         
	}

	public boolean add(String s)
	{
		if(s == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return false;
	//    2    4:iconst_0        
	//    3    5:ireturn         
		else
			return super.add(((Object) (new Chunk(s, font))));
	//    4    6:aload_0         
	//    5    7:new             #50  <Class Chunk>
	//    6   10:dup             
	//    7   11:aload_1         
	//    8   12:aload_0         
	//    9   13:getfield        #43  <Field Font font>
	//   10   16:invokespecial   #75  <Method void Chunk(String, Font)>
	//   11   19:invokespecial   #48  <Method boolean ArrayList.add(Object)>
	//   12   22:ireturn         
	}

	public boolean addAll(Collection collection)
	{
		for(collection = ((Collection) (collection.iterator())); ((Iterator) (collection)).hasNext(); add((Element)((Iterator) (collection)).next()));
	//    0    0:aload_1         
	//    1    1:invokeinterface #254 <Method Iterator Collection.iterator()>
	//    2    6:astore_1        
	//    3    7:aload_1         
	//    4    8:invokeinterface #246 <Method boolean Iterator.hasNext()>
	//    5   13:ifeq            33
	//    6   16:aload_0         
	//    7   17:aload_1         
	//    8   18:invokeinterface #250 <Method Object Iterator.next()>
	//    9   23:checkcast       #178 <Class Element>
	//   10   26:invokevirtual   #139 <Method boolean add(Element)>
	//   11   29:pop             
	//*  12   30:goto            7
		return true;
	//   13   33:iconst_1        
	//   14   34:ireturn         
	}

	protected boolean addChunk(Chunk chunk)
	{
		Object obj;
		String s;
		Font font1 = chunk.getFont();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #54  <Method Font Chunk.getFont()>
	//    2    4:astore          4
		s = chunk.getContent();
	//    3    6:aload_1         
	//    4    7:invokevirtual   #259 <Method String Chunk.getContent()>
	//    5   10:astore          5
		obj = ((Object) (font1));
	//    6   12:aload           4
	//    7   14:astore_3        
		if(font != null)
	//*   8   15:aload_0         
	//*   9   16:getfield        #43  <Field Font font>
	//*  10   19:ifnull          47
		{
			obj = ((Object) (font1));
	//   11   22:aload           4
	//   12   24:astore_3        
			if(!font.isStandardFont())
	//*  13   25:aload_0         
	//*  14   26:getfield        #43  <Field Font font>
	//*  15   29:invokevirtual   #208 <Method boolean Font.isStandardFont()>
	//*  16   32:ifne            47
				obj = ((Object) (font.difference(chunk.getFont())));
	//   17   35:aload_0         
	//   18   36:getfield        #43  <Field Font font>
	//   19   39:aload_1         
	//   20   40:invokevirtual   #54  <Method Font Chunk.getFont()>
	//   21   43:invokevirtual   #212 <Method Font Font.difference(Font)>
	//   22   46:astore_3        
		}
		if(size() <= 0 || chunk.hasAttributes()) goto _L2; else goto _L1
	//   23   47:aload_0         
	//   24   48:invokevirtual   #262 <Method int size()>
	//   25   51:ifle            199
	//   26   54:aload_1         
	//   27   55:invokevirtual   #265 <Method boolean Chunk.hasAttributes()>
	//   28   58:ifne            199
_L1:
		Chunk chunk1;
		PdfName pdfname;
		PdfName pdfname1;
		chunk1 = (Chunk)get(size() - 1);
	//   29   61:aload_0         
	//   30   62:aload_0         
	//   31   63:invokevirtual   #262 <Method int size()>
	//   32   66:iconst_1        
	//   33   67:isub            
	//   34   68:invokevirtual   #269 <Method Object get(int)>
	//   35   71:checkcast       #50  <Class Chunk>
	//   36   74:astore          4
		pdfname = chunk1.getRole();
	//   37   76:aload           4
	//   38   78:invokevirtual   #273 <Method PdfName Chunk.getRole()>
	//   39   81:astore          6
		pdfname1 = chunk.getRole();
	//   40   83:aload_1         
	//   41   84:invokevirtual   #273 <Method PdfName Chunk.getRole()>
	//   42   87:astore          7
		if(pdfname != null && pdfname1 != null) goto _L4; else goto _L3
	//   43   89:aload           6
	//   44   91:ifnull          270
	//   45   94:aload           7
	//   46   96:ifnonnull       186
	//*  47   99:goto            270
_L11:
		boolean flag;
		if(!flag) goto _L2; else goto _L5
	//   48  102:iload_2         
	//   49  103:ifeq            199
_L5:
		if(chunk1.hasAttributes() || chunk.hasAccessibleAttributes() || chunk1.hasAccessibleAttributes()) goto _L2; else goto _L6
	//   50  106:aload           4
	//   51  108:invokevirtual   #265 <Method boolean Chunk.hasAttributes()>
	//   52  111:ifne            199
	//   53  114:aload_1         
	//   54  115:invokevirtual   #276 <Method boolean Chunk.hasAccessibleAttributes()>
	//   55  118:ifne            199
	//   56  121:aload           4
	//   57  123:invokevirtual   #276 <Method boolean Chunk.hasAccessibleAttributes()>
	//   58  126:ifne            199
_L6:
		if(obj == null) goto _L8; else goto _L7
	//   59  129:aload_3         
	//   60  130:ifnull          145
_L7:
		if(((Font) (obj)).compareTo(chunk1.getFont()) != 0) goto _L2; else goto _L8
	//   61  133:aload_3         
	//   62  134:aload           4
	//   63  136:invokevirtual   #54  <Method Font Chunk.getFont()>
	//   64  139:invokevirtual   #280 <Method int Font.compareTo(Font)>
	//   65  142:ifne            199
_L8:
		if("".equals(((Object) (chunk1.getContent().trim()))) || "".equals(((Object) (s.trim())))) goto _L2; else goto _L9
	//   66  145:ldc2            #282 <String "">
	//   67  148:aload           4
	//   68  150:invokevirtual   #259 <Method String Chunk.getContent()>
	//   69  153:invokevirtual   #285 <Method String String.trim()>
	//   70  156:invokevirtual   #288 <Method boolean String.equals(Object)>
	//   71  159:ifne            199
	//   72  162:ldc2            #282 <String "">
	//   73  165:aload           5
	//   74  167:invokevirtual   #285 <Method String String.trim()>
	//   75  170:invokevirtual   #288 <Method boolean String.equals(Object)>
	//   76  173:ifne            199
_L9:
		chunk1.append(s);
	//   77  176:aload           4
	//   78  178:aload           5
	//   79  180:invokevirtual   #291 <Method StringBuffer Chunk.append(String)>
	//   80  183:pop             
		return true;
	//   81  184:iconst_1        
	//   82  185:ireturn         
_L4:
		try
		{
			flag = pdfname.equals(((Object) (pdfname1)));
	//   83  186:aload           6
	//   84  188:aload           7
	//   85  190:invokevirtual   #294 <Method boolean PdfName.equals(Object)>
	//   86  193:istore_2        
			continue; /* Loop/switch isn't completed */
	//   87  194:goto            102
		}
		catch(ClassCastException classcastexception) { }
	//   88  197:astore          4
_L2:
		obj = ((Object) (new Chunk(s, ((Font) (obj)))));
	//   89  199:new             #50  <Class Chunk>
	//   90  202:dup             
	//   91  203:aload           5
	//   92  205:aload_3         
	//   93  206:invokespecial   #75  <Method void Chunk(String, Font)>
	//   94  209:astore_3        
		((Chunk) (obj)).setAttributes(chunk.getAttributes());
	//   95  210:aload_3         
	//   96  211:aload_1         
	//   97  212:invokevirtual   #298 <Method java.util.HashMap Chunk.getAttributes()>
	//   98  215:invokevirtual   #302 <Method void Chunk.setAttributes(java.util.HashMap)>
		obj.role = chunk.getRole();
	//   99  218:aload_3         
	//  100  219:aload_1         
	//  101  220:invokevirtual   #273 <Method PdfName Chunk.getRole()>
	//  102  223:putfield        #306 <Field PdfName Chunk.role>
		obj.accessibleAttributes = chunk.getAccessibleAttributes();
	//  103  226:aload_3         
	//  104  227:aload_1         
	//  105  228:invokevirtual   #309 <Method java.util.HashMap Chunk.getAccessibleAttributes()>
	//  106  231:putfield        #313 <Field java.util.HashMap Chunk.accessibleAttributes>
		if(hyphenation != null && ((Chunk) (obj)).getHyphenation() == null && !((Chunk) (obj)).isEmpty())
	//* 107  234:aload_0         
	//* 108  235:getfield        #36  <Field HyphenationEvent hyphenation>
	//* 109  238:ifnull          264
	//* 110  241:aload_3         
	//* 111  242:invokevirtual   #58  <Method HyphenationEvent Chunk.getHyphenation()>
	//* 112  245:ifnonnull       264
	//* 113  248:aload_3         
	//* 114  249:invokevirtual   #219 <Method boolean Chunk.isEmpty()>
	//* 115  252:ifne            264
			((Chunk) (obj)).setHyphenation(hyphenation);
	//  116  255:aload_3         
	//  117  256:aload_0         
	//  118  257:getfield        #36  <Field HyphenationEvent hyphenation>
	//  119  260:invokevirtual   #222 <Method Chunk Chunk.setHyphenation(HyphenationEvent)>
	//  120  263:pop             
		return super.add(obj);
	//  121  264:aload_0         
	//  122  265:aload_3         
	//  123  266:invokespecial   #48  <Method boolean ArrayList.add(Object)>
	//  124  269:ireturn         
_L3:
		flag = true;
	//  125  270:iconst_1        
	//  126  271:istore_2        
		if(true) goto _L11; else goto _L10
	//  127  272:goto            102
_L10:
	}

	protected void addSpecial(Element element)
	{
		super.add(((Object) (element)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #48  <Method boolean ArrayList.add(Object)>
	//    3    5:pop             
	//    4    6:return          
	}

	public List getChunks()
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #5   <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #29  <Method void ArrayList()>
	//    3    7:astore_1        
		for(Iterator iterator = iterator(); iterator.hasNext(); ((List) (arraylist)).addAll(((Collection) (((Element)iterator.next()).getChunks()))));
	//    4    8:aload_0         
	//    5    9:invokevirtual   #241 <Method Iterator iterator()>
	//    6   12:astore_2        
	//    7   13:aload_2         
	//    8   14:invokeinterface #246 <Method boolean Iterator.hasNext()>
	//    9   19:ifeq            46
	//   10   22:aload_1         
	//   11   23:aload_2         
	//   12   24:invokeinterface #250 <Method Object Iterator.next()>
	//   13   29:checkcast       #178 <Class Element>
	//   14   32:invokeinterface #319 <Method List Element.getChunks()>
	//   15   37:invokeinterface #322 <Method boolean List.addAll(Collection)>
	//   16   42:pop             
	//*  17   43:goto            13
		return ((List) (arraylist));
	//   18   46:aload_1         
	//   19   47:areturn         
	}

	public String getContent()
	{
		StringBuffer stringbuffer = new StringBuffer();
	//    0    0:new             #157 <Class StringBuffer>
	//    1    3:dup             
	//    2    4:invokespecial   #158 <Method void StringBuffer()>
	//    3    7:astore_1        
		for(Iterator iterator = getChunks().iterator(); iterator.hasNext(); stringbuffer.append(((Chunk)iterator.next()).toString()));
	//    4    8:aload_0         
	//    5    9:invokevirtual   #324 <Method List getChunks()>
	//    6   12:invokeinterface #325 <Method Iterator List.iterator()>
	//    7   17:astore_2        
	//    8   18:aload_2         
	//    9   19:invokeinterface #246 <Method boolean Iterator.hasNext()>
	//   10   24:ifeq            47
	//   11   27:aload_1         
	//   12   28:aload_2         
	//   13   29:invokeinterface #250 <Method Object Iterator.next()>
	//   14   34:checkcast       #50  <Class Chunk>
	//   15   37:invokevirtual   #326 <Method String Chunk.toString()>
	//   16   40:invokevirtual   #327 <Method StringBuffer StringBuffer.append(String)>
	//   17   43:pop             
	//*  18   44:goto            18
		return stringbuffer.toString();
	//   19   47:aload_1         
	//   20   48:invokevirtual   #174 <Method String StringBuffer.toString()>
	//   21   51:areturn         
	}

	public Font getFont()
	{
		return font;
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field Font font>
	//    2    4:areturn         
	}

	public HyphenationEvent getHyphenation()
	{
		return hyphenation;
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field HyphenationEvent hyphenation>
	//    2    4:areturn         
	}

	public float getLeading()
	{
		if(Float.isNaN(leading) && font != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #32  <Field float leading>
	//*   2    4:invokestatic    #333 <Method boolean Float.isNaN(float)>
	//*   3    7:ifeq            28
	//*   4   10:aload_0         
	//*   5   11:getfield        #43  <Field Font font>
	//*   6   14:ifnull          28
			return font.getCalculatedLeading(1.5F);
	//    7   17:aload_0         
	//    8   18:getfield        #43  <Field Font font>
	//    9   21:ldc2            #334 <Float 1.5F>
	//   10   24:invokevirtual   #338 <Method float Font.getCalculatedLeading(float)>
	//   11   27:freturn         
		else
			return leading;
	//   12   28:aload_0         
	//   13   29:getfield        #32  <Field float leading>
	//   14   32:freturn         
	}

	public float getMultipliedLeading()
	{
		return multipliedLeading;
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field float multipliedLeading>
	//    2    4:freturn         
	}

	public TabSettings getTabSettings()
	{
		return tabSettings;
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field TabSettings tabSettings>
	//    2    4:areturn         
	}

	public float getTotalLeading()
	{
		float f;
		if(font == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #43  <Field Font font>
	//*   2    4:ifnonnull       31
			f = 12F * multipliedLeading;
	//    3    7:ldc2            #340 <Float 12F>
	//    4   10:aload_0         
	//    5   11:getfield        #34  <Field float multipliedLeading>
	//    6   14:fmul            
	//    7   15:fstore_1        
		else
	//*   8   16:fload_1         
	//*   9   17:fconst_0        
	//*  10   18:fcmpl           
	//*  11   19:ifle            46
	//*  12   22:aload_0         
	//*  13   23:invokevirtual   #343 <Method boolean hasLeading()>
	//*  14   26:ifne            46
	//*  15   29:fload_1         
	//*  16   30:freturn         
			f = font.getCalculatedLeading(multipliedLeading);
	//   17   31:aload_0         
	//   18   32:getfield        #43  <Field Font font>
	//   19   35:aload_0         
	//   20   36:getfield        #34  <Field float multipliedLeading>
	//   21   39:invokevirtual   #338 <Method float Font.getCalculatedLeading(float)>
	//   22   42:fstore_1        
		if(f > 0.0F && !hasLeading())
			return f;
		else
	//*  23   43:goto            16
			return f + getLeading();
	//   24   46:fload_1         
	//   25   47:aload_0         
	//   26   48:invokevirtual   #85  <Method float getLeading()>
	//   27   51:fadd            
	//   28   52:freturn         
	}

	public boolean hasLeading()
	{
		return !Float.isNaN(leading);
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field float leading>
	//    2    4:invokestatic    #333 <Method boolean Float.isNaN(float)>
	//    3    7:ifeq            12
	//    4   10:iconst_0        
	//    5   11:ireturn         
	//    6   12:iconst_1        
	//    7   13:ireturn         
	}

	public boolean isContent()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public boolean isEmpty()
	{
		boolean flag;
		boolean flag1;
		flag1 = true;
	//    0    0:iconst_1        
	//    1    1:istore_2        
		flag = flag1;
	//    2    2:iload_2         
	//    3    3:istore_1        
		size();
	//    4    4:aload_0         
	//    5    5:invokevirtual   #262 <Method int size()>
		JVM INSTR tableswitch 0 1: default 32
	//	               0 34
	//	               1 36;
	//    6    8:tableswitch     0 1: default 32
	//	               0 34
	//	               1 36
		   goto _L1 _L2 _L3
_L2:
		break MISSING_BLOCK_LABEL_34;
_L1:
		flag = false;
	//    7   32:iconst_0        
	//    8   33:istore_1        
_L5:
		return flag;
	//    9   34:iload_1         
	//   10   35:ireturn         
_L3:
		Element element;
		element = (Element)get(0);
	//   11   36:aload_0         
	//   12   37:iconst_0        
	//   13   38:invokevirtual   #269 <Method Object get(int)>
	//   14   41:checkcast       #178 <Class Element>
	//   15   44:astore_3        
		if(element.type() != 10)
			break; /* Loop/switch isn't completed */
	//   16   45:aload_3         
	//   17   46:invokeinterface #181 <Method int Element.type()>
	//   18   51:bipush          10
	//   19   53:icmpne          68
		flag = flag1;
	//   20   56:iload_2         
	//   21   57:istore_1        
		if(((Chunk)element).isEmpty()) goto _L5; else goto _L4
	//   22   58:aload_3         
	//   23   59:checkcast       #50  <Class Chunk>
	//   24   62:invokevirtual   #219 <Method boolean Chunk.isEmpty()>
	//   25   65:ifne            34
_L4:
		return false;
	//   26   68:iconst_0        
	//   27   69:ireturn         
	}

	public boolean isNestable()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public boolean process(ElementListener elementlistener)
	{
		try
		{
			for(Iterator iterator = iterator(); iterator.hasNext(); elementlistener.add((Element)iterator.next()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #241 <Method Iterator iterator()>
	//    2    4:astore_2        
	//    3    5:aload_2         
	//    4    6:invokeinterface #246 <Method boolean Iterator.hasNext()>
	//    5   11:ifeq            36
	//    6   14:aload_1         
	//    7   15:aload_2         
	//    8   16:invokeinterface #250 <Method Object Iterator.next()>
	//    9   21:checkcast       #178 <Class Element>
	//   10   24:invokeinterface #352 <Method boolean ElementListener.add(Element)>
	//   11   29:pop             
		}
	//*  12   30:goto            5
		// Misplaced declaration of an exception variable
		catch(ElementListener elementlistener)
	//*  13   33:astore_1        
		{
			return false;
	//   14   34:iconst_0        
	//   15   35:ireturn         
		}
		return true;
	//   16   36:iconst_1        
	//   17   37:ireturn         
	}

	public void setFont(Font font1)
	{
		font = font1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #43  <Field Font font>
	//    3    5:return          
	}

	public void setHyphenation(HyphenationEvent hyphenationevent)
	{
		hyphenation = hyphenationevent;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #36  <Field HyphenationEvent hyphenation>
	//    3    5:return          
	}

	public void setLeading(float f)
	{
		leading = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #32  <Field float leading>
		multipliedLeading = 0.0F;
	//    3    5:aload_0         
	//    4    6:fconst_0        
	//    5    7:putfield        #34  <Field float multipliedLeading>
	//    6   10:return          
	}

	public void setLeading(float f, float f1)
	{
		leading = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #32  <Field float leading>
		multipliedLeading = f1;
	//    3    5:aload_0         
	//    4    6:fload_2         
	//    5    7:putfield        #34  <Field float multipliedLeading>
	//    6   10:return          
	}

	public void setMultipliedLeading(float f)
	{
		leading = 0.0F;
	//    0    0:aload_0         
	//    1    1:fconst_0        
	//    2    2:putfield        #32  <Field float leading>
		multipliedLeading = f;
	//    3    5:aload_0         
	//    4    6:fload_1         
	//    5    7:putfield        #34  <Field float multipliedLeading>
	//    6   10:return          
	}

	public void setTabSettings(TabSettings tabsettings)
	{
		tabSettings = tabsettings;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #38  <Field TabSettings tabSettings>
	//    3    5:return          
	}

	public boolean trim()
	{
		do
		{
			if(size() <= 0)
				break;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #262 <Method int size()>
	//    2    4:ifle            42
			Element element = (Element)get(0);
	//    3    7:aload_0         
	//    4    8:iconst_0        
	//    5    9:invokevirtual   #269 <Method Object get(int)>
	//    6   12:checkcast       #178 <Class Element>
	//    7   15:astore_1        
			if(!(element instanceof Chunk) || !((Chunk)element).isWhitespace())
				break;
	//    8   16:aload_1         
	//    9   17:instanceof      #50  <Class Chunk>
	//   10   20:ifeq            42
	//   11   23:aload_1         
	//   12   24:checkcast       #50  <Class Chunk>
	//   13   27:invokevirtual   #358 <Method boolean Chunk.isWhitespace()>
	//   14   30:ifeq            42
			remove(((Object) (element)));
	//   15   33:aload_0         
	//   16   34:aload_1         
	//   17   35:invokevirtual   #361 <Method boolean remove(Object)>
	//   18   38:pop             
		} while(true);
	//   19   39:goto            0
		do
		{
			if(size() <= 0)
				break;
	//   20   42:aload_0         
	//   21   43:invokevirtual   #262 <Method int size()>
	//   22   46:ifle            89
			Element element1 = (Element)get(size() - 1);
	//   23   49:aload_0         
	//   24   50:aload_0         
	//   25   51:invokevirtual   #262 <Method int size()>
	//   26   54:iconst_1        
	//   27   55:isub            
	//   28   56:invokevirtual   #269 <Method Object get(int)>
	//   29   59:checkcast       #178 <Class Element>
	//   30   62:astore_1        
			if(!(element1 instanceof Chunk) || !((Chunk)element1).isWhitespace())
				break;
	//   31   63:aload_1         
	//   32   64:instanceof      #50  <Class Chunk>
	//   33   67:ifeq            89
	//   34   70:aload_1         
	//   35   71:checkcast       #50  <Class Chunk>
	//   36   74:invokevirtual   #358 <Method boolean Chunk.isWhitespace()>
	//   37   77:ifeq            89
			remove(((Object) (element1)));
	//   38   80:aload_0         
	//   39   81:aload_1         
	//   40   82:invokevirtual   #361 <Method boolean remove(Object)>
	//   41   85:pop             
		} while(true);
	//   42   86:goto            42
		return size() > 0;
	//   43   89:aload_0         
	//   44   90:invokevirtual   #262 <Method int size()>
	//   45   93:ifle            98
	//   46   96:iconst_1        
	//   47   97:ireturn         
	//   48   98:iconst_0        
	//   49   99:ireturn         
	}

	public int type()
	{
		return 11;
	//    0    0:bipush          11
	//    1    2:ireturn         
	}

	private static final long serialVersionUID = 0xd9796e47L;
	protected Font font;
	protected HyphenationEvent hyphenation;
	protected float leading;
	protected float multipliedLeading;
	protected TabSettings tabSettings;
}
