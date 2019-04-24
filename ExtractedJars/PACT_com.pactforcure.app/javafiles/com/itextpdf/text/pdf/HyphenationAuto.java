// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;

import com.itextpdf.text.pdf.hyphenation.Hyphenation;
import com.itextpdf.text.pdf.hyphenation.Hyphenator;

// Referenced classes of package com.itextpdf.text.pdf:
//			HyphenationEvent, BaseFont

public class HyphenationAuto
	implements HyphenationEvent
{

	public HyphenationAuto(String s, String s1, int i, int j)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		hyphenator = new Hyphenator(s, s1, i, j);
	//    2    4:aload_0         
	//    3    5:new             #17  <Class Hyphenator>
	//    4    8:dup             
	//    5    9:aload_1         
	//    6   10:aload_2         
	//    7   11:iload_3         
	//    8   12:iload           4
	//    9   14:invokespecial   #19  <Method void Hyphenator(String, String, int, int)>
	//   10   17:putfield        #21  <Field Hyphenator hyphenator>
	//   11   20:return          
	}

	public String getHyphenSymbol()
	{
		return "-";
	//    0    0:ldc1            #26  <String "-">
	//    1    2:areturn         
	}

	public String getHyphenatedWordPost()
	{
		return post;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field String post>
	//    2    4:areturn         
	}

	public String getHyphenatedWordPre(String s, BaseFont basefont, float f, float f1)
	{
		post = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #29  <Field String post>
		String s1 = getHyphenSymbol();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #33  <Method String getHyphenSymbol()>
	//    5    9:astore          8
		float f2 = basefont.getWidthPoint(s1, f);
	//    6   11:aload_2         
	//    7   12:aload           8
	//    8   14:fload_3         
	//    9   15:invokevirtual   #39  <Method float BaseFont.getWidthPoint(String, float)>
	//   10   18:fstore          5
		if(f2 > f1)
	//*  11   20:fload           5
	//*  12   22:fload           4
	//*  13   24:fcmpl           
	//*  14   25:ifle            31
			return "";
	//   15   28:ldc1            #41  <String "">
	//   16   30:areturn         
		s = ((String) (hyphenator.hyphenate(s)));
	//   17   31:aload_0         
	//   18   32:getfield        #21  <Field Hyphenator hyphenator>
	//   19   35:aload_1         
	//   20   36:invokevirtual   #45  <Method Hyphenation Hyphenator.hyphenate(String)>
	//   21   39:astore_1        
		if(s == null)
	//*  22   40:aload_1         
	//*  23   41:ifnonnull       47
			return "";
	//   24   44:ldc1            #41  <String "">
	//   25   46:areturn         
		int j = ((Hyphenation) (s)).length();
	//   26   47:aload_1         
	//   27   48:invokevirtual   #51  <Method int Hyphenation.length()>
	//   28   51:istore          7
		int i = 0;
	//   29   53:iconst_0        
	//   30   54:istore          6
		do
		{
			if(i >= j || basefont.getWidthPoint(((Hyphenation) (s)).getPreHyphenText(i), f) + f2 > f1)
	//*  31   56:iload           6
	//*  32   58:iload           7
	//*  33   60:icmpge          83
	//*  34   63:aload_2         
	//*  35   64:aload_1         
	//*  36   65:iload           6
	//*  37   67:invokevirtual   #55  <Method String Hyphenation.getPreHyphenText(int)>
	//*  38   70:fload_3         
	//*  39   71:invokevirtual   #39  <Method float BaseFont.getWidthPoint(String, float)>
	//*  40   74:fload           5
	//*  41   76:fadd            
	//*  42   77:fload           4
	//*  43   79:fcmpl           
	//*  44   80:ifle            97
			{
				i--;
	//   45   83:iload           6
	//   46   85:iconst_1        
	//   47   86:isub            
	//   48   87:istore          6
				if(i < 0)
	//*  49   89:iload           6
	//*  50   91:ifge            106
				{
					return "";
	//   51   94:ldc1            #41  <String "">
	//   52   96:areturn         
				} else
	//*  53   97:iload           6
	//*  54   99:iconst_1        
	//*  55  100:iadd            
	//*  56  101:istore          6
	//*  57  103:goto            56
				{
					post = ((Hyphenation) (s)).getPostHyphenText(i);
	//   58  106:aload_0         
	//   59  107:aload_1         
	//   60  108:iload           6
	//   61  110:invokevirtual   #58  <Method String Hyphenation.getPostHyphenText(int)>
	//   62  113:putfield        #29  <Field String post>
					return (new StringBuilder()).append(((Hyphenation) (s)).getPreHyphenText(i)).append(s1).toString();
	//   63  116:new             #60  <Class StringBuilder>
	//   64  119:dup             
	//   65  120:invokespecial   #61  <Method void StringBuilder()>
	//   66  123:aload_1         
	//   67  124:iload           6
	//   68  126:invokevirtual   #55  <Method String Hyphenation.getPreHyphenText(int)>
	//   69  129:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
	//   70  132:aload           8
	//   71  134:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
	//   72  137:invokevirtual   #68  <Method String StringBuilder.toString()>
	//   73  140:areturn         
				}
			}
			i++;
		} while(true);
	}

	protected Hyphenator hyphenator;
	protected String post;
}
