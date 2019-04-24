// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.languages;


// Referenced classes of package com.itextpdf.text.pdf.languages:
//			LanguageProcessor

public abstract class IndicLigaturizer
	implements LanguageProcessor
{

	public IndicLigaturizer()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #35  <Method void Object()>
	//    2    4:return          
	}

	private static void swap(StringBuilder stringbuilder, int i, int j)
	{
		char c = stringbuilder.charAt(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #44  <Method char StringBuilder.charAt(int)>
	//    3    5:istore_3        
		stringbuilder.setCharAt(i, stringbuilder.charAt(j));
	//    4    6:aload_0         
	//    5    7:iload_1         
	//    6    8:aload_0         
	//    7    9:iload_2         
	//    8   10:invokevirtual   #44  <Method char StringBuilder.charAt(int)>
	//    9   13:invokevirtual   #48  <Method void StringBuilder.setCharAt(int, char)>
		stringbuilder.setCharAt(j, c);
	//   10   16:aload_0         
	//   11   17:iload_2         
	//   12   18:iload_3         
	//   13   19:invokevirtual   #48  <Method void StringBuilder.setCharAt(int, char)>
	//   14   22:return          
	}

	protected boolean IsSwaraLetter(char c)
	{
		return c >= langTable[6] && c <= langTable[7];
	//    0    0:iload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #52  <Field char[] langTable>
	//    3    5:bipush          6
	//    4    7:caload          
	//    5    8:icmplt          24
	//    6   11:iload_1         
	//    7   12:aload_0         
	//    8   13:getfield        #52  <Field char[] langTable>
	//    9   16:bipush          7
	//   10   18:caload          
	//   11   19:icmpgt          24
	//   12   22:iconst_1        
	//   13   23:ireturn         
	//   14   24:iconst_0        
	//   15   25:ireturn         
	}

	protected boolean IsSwaraMatra(char c)
	{
		boolean flag = false;
	//    0    0:iconst_0        
	//    1    1:istore_2        
		if(c >= langTable[0] && c <= langTable[3] || c == langTable[4] || c == langTable[5])
	//*   2    2:iload_1         
	//*   3    3:aload_0         
	//*   4    4:getfield        #52  <Field char[] langTable>
	//*   5    7:iconst_0        
	//*   6    8:caload          
	//*   7    9:icmplt          22
	//*   8   12:iload_1         
	//*   9   13:aload_0         
	//*  10   14:getfield        #52  <Field char[] langTable>
	//*  11   17:iconst_3        
	//*  12   18:caload          
	//*  13   19:icmple          42
	//*  14   22:iload_1         
	//*  15   23:aload_0         
	//*  16   24:getfield        #52  <Field char[] langTable>
	//*  17   27:iconst_4        
	//*  18   28:caload          
	//*  19   29:icmpeq          42
	//*  20   32:iload_1         
	//*  21   33:aload_0         
	//*  22   34:getfield        #52  <Field char[] langTable>
	//*  23   37:iconst_5        
	//*  24   38:caload          
	//*  25   39:icmpne          44
			flag = true;
	//   26   42:iconst_1        
	//   27   43:istore_2        
		return flag;
	//   28   44:iload_2         
	//   29   45:ireturn         
	}

	protected boolean IsVyanjana(char c)
	{
		return c >= langTable[8] && c <= langTable[9];
	//    0    0:iload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #52  <Field char[] langTable>
	//    3    5:bipush          8
	//    4    7:caload          
	//    5    8:icmplt          24
	//    6   11:iload_1         
	//    7   12:aload_0         
	//    8   13:getfield        #52  <Field char[] langTable>
	//    9   16:bipush          9
	//   10   18:caload          
	//   11   19:icmpgt          24
	//   12   22:iconst_1        
	//   13   23:ireturn         
	//   14   24:iconst_0        
	//   15   25:ireturn         
	}

	public boolean isRTL()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public String process(String s)
	{
		if(s == null || s.length() == 0)
	//*   0    0:aload_1         
	//*   1    1:ifnull          11
	//*   2    4:aload_1         
	//*   3    5:invokevirtual   #64  <Method int String.length()>
	//*   4    8:ifne            14
			return "";
	//    5   11:ldc1            #66  <String "">
	//    6   13:areturn         
		StringBuilder stringbuilder = new StringBuilder();
	//    7   14:new             #40  <Class StringBuilder>
	//    8   17:dup             
	//    9   18:invokespecial   #67  <Method void StringBuilder()>
	//   10   21:astore          5
		int i = 0;
	//   11   23:iconst_0        
	//   12   24:istore_3        
		while(i < s.length()) 
	//*  13   25:iload_3         
	//*  14   26:aload_1         
	//*  15   27:invokevirtual   #64  <Method int String.length()>
	//*  16   30:icmpge          184
		{
			char c = s.charAt(i);
	//   17   33:aload_1         
	//   18   34:iload_3         
	//   19   35:invokevirtual   #68  <Method char String.charAt(int)>
	//   20   38:istore_2        
			if(IsVyanjana(c) || IsSwaraLetter(c))
	//*  21   39:aload_0         
	//*  22   40:iload_2         
	//*  23   41:invokevirtual   #70  <Method boolean IsVyanjana(char)>
	//*  24   44:ifne            55
	//*  25   47:aload_0         
	//*  26   48:iload_2         
	//*  27   49:invokevirtual   #72  <Method boolean IsSwaraLetter(char)>
	//*  28   52:ifeq            69
				stringbuilder.append(c);
	//   29   55:aload           5
	//   30   57:iload_2         
	//   31   58:invokevirtual   #76  <Method StringBuilder StringBuilder.append(char)>
	//   32   61:pop             
			else
	//*  33   62:iload_3         
	//*  34   63:iconst_1        
	//*  35   64:iadd            
	//*  36   65:istore_3        
	//*  37   66:goto            25
			if(IsSwaraMatra(c))
	//*  38   69:aload_0         
	//*  39   70:iload_2         
	//*  40   71:invokevirtual   #78  <Method boolean IsSwaraMatra(char)>
	//*  41   74:ifeq            174
			{
				int j = stringbuilder.length() - 1;
	//   42   77:aload           5
	//   43   79:invokevirtual   #79  <Method int StringBuilder.length()>
	//   44   82:iconst_1        
	//   45   83:isub            
	//   46   84:istore          4
				if(j >= 0)
	//*  47   86:iload           4
	//*  48   88:iflt            164
				{
					if(stringbuilder.charAt(j) == langTable[10])
	//*  49   91:aload           5
	//*  50   93:iload           4
	//*  51   95:invokevirtual   #44  <Method char StringBuilder.charAt(int)>
	//*  52   98:aload_0         
	//*  53   99:getfield        #52  <Field char[] langTable>
	//*  54  102:bipush          10
	//*  55  104:caload          
	//*  56  105:icmpne          116
						stringbuilder.deleteCharAt(j);
	//   57  108:aload           5
	//   58  110:iload           4
	//   59  112:invokevirtual   #83  <Method StringBuilder StringBuilder.deleteCharAt(int)>
	//   60  115:pop             
					stringbuilder.append(c);
	//   61  116:aload           5
	//   62  118:iload_2         
	//   63  119:invokevirtual   #76  <Method StringBuilder StringBuilder.append(char)>
	//   64  122:pop             
					j = stringbuilder.length() - 2;
	//   65  123:aload           5
	//   66  125:invokevirtual   #79  <Method int StringBuilder.length()>
	//   67  128:iconst_2        
	//   68  129:isub            
	//   69  130:istore          4
					if(c == langTable[1] && j >= 0)
	//*  70  132:iload_2         
	//*  71  133:aload_0         
	//*  72  134:getfield        #52  <Field char[] langTable>
	//*  73  137:iconst_1        
	//*  74  138:caload          
	//*  75  139:icmpne          62
	//*  76  142:iload           4
	//*  77  144:iflt            62
						swap(stringbuilder, j, stringbuilder.length() - 1);
	//   78  147:aload           5
	//   79  149:iload           4
	//   80  151:aload           5
	//   81  153:invokevirtual   #79  <Method int StringBuilder.length()>
	//   82  156:iconst_1        
	//   83  157:isub            
	//   84  158:invokestatic    #85  <Method void swap(StringBuilder, int, int)>
				} else
	//*  85  161:goto            62
				{
					stringbuilder.append(c);
	//   86  164:aload           5
	//   87  166:iload_2         
	//   88  167:invokevirtual   #76  <Method StringBuilder StringBuilder.append(char)>
	//   89  170:pop             
				}
			} else
	//*  90  171:goto            62
			{
				stringbuilder.append(c);
	//   91  174:aload           5
	//   92  176:iload_2         
	//   93  177:invokevirtual   #76  <Method StringBuilder StringBuilder.append(char)>
	//   94  180:pop             
			}
			i++;
		}
	//*  95  181:goto            62
		return stringbuilder.toString();
	//   96  184:aload           5
	//   97  186:invokevirtual   #89  <Method String StringBuilder.toString()>
	//   98  189:areturn         
	}

	public static final int HALANTA = 10;
	public static final int LETTER_A = 6;
	public static final int LETTER_AU = 7;
	public static final int LETTER_HA = 9;
	public static final int LETTER_KA = 8;
	public static final int MATRA_AA = 0;
	public static final int MATRA_AI = 3;
	public static final int MATRA_E = 2;
	public static final int MATRA_HLR = 4;
	public static final int MATRA_HLRR = 5;
	public static final int MATRA_I = 1;
	protected char langTable[];
}
