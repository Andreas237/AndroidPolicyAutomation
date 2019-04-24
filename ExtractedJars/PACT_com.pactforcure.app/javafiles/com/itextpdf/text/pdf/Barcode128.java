// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;

import com.itextpdf.text.*;
import com.itextpdf.text.error_messages.MessageLocalization;

// Referenced classes of package com.itextpdf.text.pdf:
//			Barcode, IntHashtable, BaseFont, PdfContentByte

public class Barcode128 extends Barcode
{
	public static final class Barcode128CodeSet extends Enum
	{

		public static Barcode128CodeSet valueOf(String s)
		{
			return (Barcode128CodeSet)Enum.valueOf(com/itextpdf/text/pdf/Barcode128$Barcode128CodeSet, s);
		//    0    0:ldc1            #2   <Class Barcode128$Barcode128CodeSet>
		//    1    2:aload_0         
		//    2    3:invokestatic    #43  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class Barcode128$Barcode128CodeSet>
		//    4    9:areturn         
		}

		public static Barcode128CodeSet[] values()
		{
			return (Barcode128CodeSet[])((Barcode128CodeSet []) ($VALUES)).clone();
		//    0    0:getstatic       #35  <Field Barcode128$Barcode128CodeSet[] $VALUES>
		//    1    3:invokevirtual   #50  <Method Object _5B_Lcom.itextpdf.text.pdf.Barcode128$Barcode128CodeSet_3B_.clone()>
		//    2    6:checkcast       #46  <Class Barcode128$Barcode128CodeSet[]>
		//    3    9:areturn         
		}

		public char getStartSymbol()
		{
			static class _cls1
			{

				static final int $SwitchMap$com$itextpdf$text$pdf$Barcode128$Barcode128CodeSet[];

				static 
				{
					$SwitchMap$com$itextpdf$text$pdf$Barcode128$Barcode128CodeSet = new int[Barcode128CodeSet.values().length];
				//    0    0:invokestatic    #18  <Method Barcode128$Barcode128CodeSet[] Barcode128$Barcode128CodeSet.values()>
				//    1    3:arraylength     
				//    2    4:newarray        int[]
				//    3    6:putstatic       #20  <Field int[] $SwitchMap$com$itextpdf$text$pdf$Barcode128$Barcode128CodeSet>
					try
					{
						$SwitchMap$com$itextpdf$text$pdf$Barcode128$Barcode128CodeSet[Barcode128CodeSet.A.ordinal()] = 1;
				//    4    9:getstatic       #20  <Field int[] $SwitchMap$com$itextpdf$text$pdf$Barcode128$Barcode128CodeSet>
				//    5   12:getstatic       #24  <Field Barcode128$Barcode128CodeSet Barcode128$Barcode128CodeSet.A>
				//    6   15:invokevirtual   #28  <Method int Barcode128$Barcode128CodeSet.ordinal()>
				//    7   18:iconst_1        
				//    8   19:iastore         
					}
				//*   9   20:getstatic       #20  <Field int[] $SwitchMap$com$itextpdf$text$pdf$Barcode128$Barcode128CodeSet>
				//*  10   23:getstatic       #31  <Field Barcode128$Barcode128CodeSet Barcode128$Barcode128CodeSet.B>
				//*  11   26:invokevirtual   #28  <Method int Barcode128$Barcode128CodeSet.ordinal()>
				//*  12   29:iconst_2        
				//*  13   30:iastore         
				//*  14   31:getstatic       #20  <Field int[] $SwitchMap$com$itextpdf$text$pdf$Barcode128$Barcode128CodeSet>
				//*  15   34:getstatic       #34  <Field Barcode128$Barcode128CodeSet Barcode128$Barcode128CodeSet.C>
				//*  16   37:invokevirtual   #28  <Method int Barcode128$Barcode128CodeSet.ordinal()>
				//*  17   40:iconst_3        
				//*  18   41:iastore         
				//*  19   42:return          
				//*  20   43:astore_0        
				//*  21   44:return          
				//*  22   45:astore_0        
				//*  23   46:goto            31
					catch(NoSuchFieldError nosuchfielderror2) { }
				//   24   49:astore_0        
					try
					{
						$SwitchMap$com$itextpdf$text$pdf$Barcode128$Barcode128CodeSet[Barcode128CodeSet.B.ordinal()] = 2;
					}
					catch(NoSuchFieldError nosuchfielderror1) { }
					try
					{
						$SwitchMap$com$itextpdf$text$pdf$Barcode128$Barcode128CodeSet[Barcode128CodeSet.C.ordinal()] = 3;
					}
					catch(NoSuchFieldError nosuchfielderror)
					{
						return;
					}
				//*  25   50:goto            20
				}
			}

			switch(_cls1..SwitchMap.com.itextpdf.text.pdf.Barcode128.Barcode128CodeSet[ordinal()])
		//*   0    0:getstatic       #58  <Field int[] Barcode128$1.$SwitchMap$com$itextpdf$text$pdf$Barcode128$Barcode128CodeSet>
		//*   1    3:aload_0         
		//*   2    4:invokevirtual   #62  <Method int ordinal()>
		//*   3    7:iaload          
			{
		//*   4    8:tableswitch     1 3: default 36
		//		               1 39
		//		               2 36
		//		               3 42
			case 2: // '\002'
			default:
				return 'h';
		//    5   36:bipush          104
		//    6   38:ireturn         

			case 1: // '\001'
				return 'g';
		//    7   39:bipush          103
		//    8   41:ireturn         

			case 3: // '\003'
				return 'i';
		//    9   42:bipush          105
		//   10   44:ireturn         
			}
		}

		private static final Barcode128CodeSet $VALUES[];
		public static final Barcode128CodeSet A;
		public static final Barcode128CodeSet AUTO;
		public static final Barcode128CodeSet B;
		public static final Barcode128CodeSet C;

		static 
		{
			A = new Barcode128CodeSet("A", 0);
		//    0    0:new             #2   <Class Barcode128$Barcode128CodeSet>
		//    1    3:dup             
		//    2    4:ldc1            #18  <String "A">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #22  <Method void Barcode128$Barcode128CodeSet(String, int)>
		//    5   10:putstatic       #24  <Field Barcode128$Barcode128CodeSet A>
			B = new Barcode128CodeSet("B", 1);
		//    6   13:new             #2   <Class Barcode128$Barcode128CodeSet>
		//    7   16:dup             
		//    8   17:ldc1            #25  <String "B">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #22  <Method void Barcode128$Barcode128CodeSet(String, int)>
		//   11   23:putstatic       #27  <Field Barcode128$Barcode128CodeSet B>
			C = new Barcode128CodeSet("C", 2);
		//   12   26:new             #2   <Class Barcode128$Barcode128CodeSet>
		//   13   29:dup             
		//   14   30:ldc1            #28  <String "C">
		//   15   32:iconst_2        
		//   16   33:invokespecial   #22  <Method void Barcode128$Barcode128CodeSet(String, int)>
		//   17   36:putstatic       #30  <Field Barcode128$Barcode128CodeSet C>
			AUTO = new Barcode128CodeSet("AUTO", 3);
		//   18   39:new             #2   <Class Barcode128$Barcode128CodeSet>
		//   19   42:dup             
		//   20   43:ldc1            #31  <String "AUTO">
		//   21   45:iconst_3        
		//   22   46:invokespecial   #22  <Method void Barcode128$Barcode128CodeSet(String, int)>
		//   23   49:putstatic       #33  <Field Barcode128$Barcode128CodeSet AUTO>
			$VALUES = (new Barcode128CodeSet[] {
				A, B, C, AUTO
			});
		//   24   52:iconst_4        
		//   25   53:anewarray       Barcode128CodeSet[]
		//   26   56:dup             
		//   27   57:iconst_0        
		//   28   58:getstatic       #24  <Field Barcode128$Barcode128CodeSet A>
		//   29   61:aastore         
		//   30   62:dup             
		//   31   63:iconst_1        
		//   32   64:getstatic       #27  <Field Barcode128$Barcode128CodeSet B>
		//   33   67:aastore         
		//   34   68:dup             
		//   35   69:iconst_2        
		//   36   70:getstatic       #30  <Field Barcode128$Barcode128CodeSet C>
		//   37   73:aastore         
		//   38   74:dup             
		//   39   75:iconst_3        
		//   40   76:getstatic       #33  <Field Barcode128$Barcode128CodeSet AUTO>
		//   41   79:aastore         
		//   42   80:putstatic       #35  <Field Barcode128$Barcode128CodeSet[] $VALUES>
		//*  43   83:return          
		}

		private Barcode128CodeSet(String s, int i)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #37  <Method void Enum(String, int)>
		//    4    6:return          
		}
	}


	public Barcode128()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #79  <Method void Barcode()>
		codeSet = Barcode128CodeSet.AUTO;
	//    2    4:aload_0         
	//    3    5:getstatic       #82  <Field Barcode128$Barcode128CodeSet Barcode128$Barcode128CodeSet.AUTO>
	//    4    8:putfield        #84  <Field Barcode128$Barcode128CodeSet codeSet>
		try
		{
			x = 0.8F;
	//    5   11:aload_0         
	//    6   12:ldc1            #85  <Float 0.8F>
	//    7   14:putfield        #89  <Field float x>
			font = BaseFont.createFont("Helvetica", "winansi", false);
	//    8   17:aload_0         
	//    9   18:ldc1            #91  <String "Helvetica">
	//   10   20:ldc1            #93  <String "winansi">
	//   11   22:iconst_0        
	//   12   23:invokestatic    #99  <Method BaseFont BaseFont.createFont(String, String, boolean)>
	//   13   26:putfield        #103 <Field BaseFont font>
			size = 8F;
	//   14   29:aload_0         
	//   15   30:ldc1            #104 <Float 8F>
	//   16   32:putfield        #107 <Field float size>
			baseline = size;
	//   17   35:aload_0         
	//   18   36:aload_0         
	//   19   37:getfield        #107 <Field float size>
	//   20   40:putfield        #110 <Field float baseline>
			barHeight = size * 3F;
	//   21   43:aload_0         
	//   22   44:aload_0         
	//   23   45:getfield        #107 <Field float size>
	//   24   48:ldc1            #111 <Float 3F>
	//   25   50:fmul            
	//   26   51:putfield        #114 <Field float barHeight>
			textAlignment = 1;
	//   27   54:aload_0         
	//   28   55:iconst_1        
	//   29   56:putfield        #118 <Field int textAlignment>
			codeType = 9;
	//   30   59:aload_0         
	//   31   60:bipush          9
	//   32   62:putfield        #121 <Field int codeType>
			return;
	//   33   65:return          
		}
		catch(Exception exception)
	//*  34   66:astore_1        
		{
			throw new ExceptionConverter(exception);
	//   35   67:new             #123 <Class ExceptionConverter>
	//   36   70:dup             
	//   37   71:aload_1         
	//   38   72:invokespecial   #126 <Method void ExceptionConverter(Exception)>
	//   39   75:athrow          
		}
	}

	public static byte[] getBarsCode128Raw(String s)
	{
		int i = s.indexOf('\uFFFF');
	//    0    0:aload_0         
	//    1    1:ldc1            #129 <Int 65535>
	//    2    3:invokevirtual   #135 <Method int String.indexOf(int)>
	//    3    6:istore_1        
		String s1 = s;
	//    4    7:aload_0         
	//    5    8:astore_3        
		if(i >= 0)
	//*   6    9:iload_1         
	//*   7   10:iflt            20
			s1 = s.substring(0, i);
	//    8   13:aload_0         
	//    9   14:iconst_0        
	//   10   15:iload_1         
	//   11   16:invokevirtual   #139 <Method String String.substring(int, int)>
	//   12   19:astore_3        
		int j = ((int) (s1.charAt(0)));
	//   13   20:aload_3         
	//   14   21:iconst_0        
	//   15   22:invokevirtual   #143 <Method char String.charAt(int)>
	//   16   25:istore_2        
		for(i = 1; i < s1.length(); i++)
	//*  17   26:iconst_1        
	//*  18   27:istore_1        
	//*  19   28:iload_1         
	//*  20   29:aload_3         
	//*  21   30:invokevirtual   #147 <Method int String.length()>
	//*  22   33:icmpge          53
			j += s1.charAt(i) * i;
	//   23   36:iload_2         
	//   24   37:aload_3         
	//   25   38:iload_1         
	//   26   39:invokevirtual   #143 <Method char String.charAt(int)>
	//   27   42:iload_1         
	//   28   43:imul            
	//   29   44:iadd            
	//   30   45:istore_2        

	//   31   46:iload_1         
	//   32   47:iconst_1        
	//   33   48:iadd            
	//   34   49:istore_1        
	//*  35   50:goto            28
		s = (new StringBuilder()).append(s1).append((char)(j % 103)).toString();
	//   36   53:new             #149 <Class StringBuilder>
	//   37   56:dup             
	//   38   57:invokespecial   #150 <Method void StringBuilder()>
	//   39   60:aload_3         
	//   40   61:invokevirtual   #154 <Method StringBuilder StringBuilder.append(String)>
	//   41   64:iload_2         
	//   42   65:bipush          103
	//   43   67:irem            
	//   44   68:int2char        
	//   45   69:invokevirtual   #157 <Method StringBuilder StringBuilder.append(char)>
	//   46   72:invokevirtual   #161 <Method String StringBuilder.toString()>
	//   47   75:astore_0        
		byte abyte0[] = new byte[(s.length() + 1) * 6 + 7];
	//   48   76:aload_0         
	//   49   77:invokevirtual   #147 <Method int String.length()>
	//   50   80:iconst_1        
	//   51   81:iadd            
	//   52   82:bipush          6
	//   53   84:imul            
	//   54   85:bipush          7
	//   55   87:iadd            
	//   56   88:newarray        byte[]
	//   57   90:astore_3        
		for(i = 0; i < s.length(); i++)
	//*  58   91:iconst_0        
	//*  59   92:istore_1        
	//*  60   93:iload_1         
	//*  61   94:aload_0         
	//*  62   95:invokevirtual   #147 <Method int String.length()>
	//*  63   98:icmpge          128
			System.arraycopy(((Object) (BARS[s.charAt(i)])), 0, ((Object) (abyte0)), i * 6, 6);
	//   64  101:getstatic       #62  <Field byte[][] BARS>
	//   65  104:aload_0         
	//   66  105:iload_1         
	//   67  106:invokevirtual   #143 <Method char String.charAt(int)>
	//   68  109:aaload          
	//   69  110:iconst_0        
	//   70  111:aload_3         
	//   71  112:iload_1         
	//   72  113:bipush          6
	//   73  115:imul            
	//   74  116:bipush          6
	//   75  118:invokestatic    #167 <Method void System.arraycopy(Object, int, Object, int, int)>

	//   76  121:iload_1         
	//   77  122:iconst_1        
	//   78  123:iadd            
	//   79  124:istore_1        
	//*  80  125:goto            93
		System.arraycopy(((Object) (BARS_STOP)), 0, ((Object) (abyte0)), i * 6, 7);
	//   81  128:getstatic       #64  <Field byte[] BARS_STOP>
	//   82  131:iconst_0        
	//   83  132:aload_3         
	//   84  133:iload_1         
	//   85  134:bipush          6
	//   86  136:imul            
	//   87  137:bipush          7
	//   88  139:invokestatic    #167 <Method void System.arraycopy(Object, int, Object, int, int)>
		return abyte0;
	//   89  142:aload_3         
	//   90  143:areturn         
	}

	public static String getHumanReadableUCCEAN(String s)
	{
		StringBuffer stringbuffer = new StringBuffer();
	//    0    0:new             #171 <Class StringBuffer>
	//    1    3:dup             
	//    2    4:invokespecial   #172 <Method void StringBuffer()>
	//    3    7:astore          8
_L3:
		String s1 = s;
	//    4    9:aload_0         
	//    5   10:astore          6
		if(!s.startsWith(String.valueOf('\312'))) goto _L2; else goto _L1
	//    6   12:aload_0         
	//    7   13:sipush          202
	//    8   16:invokestatic    #176 <Method String String.valueOf(char)>
	//    9   19:invokevirtual   #180 <Method boolean String.startsWith(String)>
	//   10   22:ifeq            273
_L1:
		s1 = s;
	//   11   25:aload_0         
	//   12   26:astore          6
		s = s.substring(1);
	//   13   28:aload_0         
	//   14   29:iconst_1        
	//   15   30:invokevirtual   #183 <Method String String.substring(int)>
	//   16   33:astore_0        
		  goto _L3
	//*  17   34:goto            9
_L12:
		int j;
		int k;
		int l;
		boolean flag;
		k = ((int) (flag));
	//   18   37:iload           5
	//   19   39:istore_3        
		l = j;
	//   20   40:iload_2         
	//   21   41:istore          4
		int i;
		if(i >= 5) goto _L5; else goto _L4
	//   22   43:iload_1         
	//   23   44:iconst_5        
	//   24   45:icmpge          67
_L4:
		s1 = s;
	//   25   48:aload_0         
	//   26   49:astore          6
		k = s.length();
	//   27   51:aload_0         
	//   28   52:invokevirtual   #147 <Method int String.length()>
	//   29   55:istore_3        
		if(k >= i) goto _L7; else goto _L6
	//   30   56:iload_3         
	//   31   57:iload_1         
	//   32   58:icmpge          87
_L6:
		l = j;
	//   33   61:iload_2         
	//   34   62:istore          4
		k = ((int) (flag));
	//   35   64:iload           5
	//   36   66:istore_3        
_L5:
		if(k != 0) goto _L9; else goto _L8
	//   37   67:iload_3         
	//   38   68:ifne            118
_L8:
		stringbuffer.append(removeFNC1(s));
	//   39   71:aload           8
	//   40   73:aload_0         
	//   41   74:invokestatic    #186 <Method String removeFNC1(String)>
	//   42   77:invokevirtual   #189 <Method StringBuffer StringBuffer.append(String)>
	//   43   80:pop             
		return stringbuffer.toString();
	//   44   81:aload           8
	//   45   83:invokevirtual   #190 <Method String StringBuffer.toString()>
	//   46   86:areturn         
_L7:
		s1 = s;
	//   47   87:aload_0         
	//   48   88:astore          6
		j = ais.get(Integer.parseInt(s.substring(0, i)));
	//   49   90:getstatic       #71  <Field IntHashtable ais>
	//   50   93:aload_0         
	//   51   94:iconst_0        
	//   52   95:iload_1         
	//   53   96:invokevirtual   #139 <Method String String.substring(int, int)>
	//   54   99:invokestatic    #196 <Method int Integer.parseInt(String)>
	//   55  102:invokevirtual   #199 <Method int IntHashtable.get(int)>
	//   56  105:istore_2        
		if(j == 0)
			break MISSING_BLOCK_LABEL_283;
	//   57  106:iload_2         
	//   58  107:ifeq            283
		k = i;
	//   59  110:iload_1         
	//   60  111:istore_3        
		l = j;
	//   61  112:iload_2         
	//   62  113:istore          4
		  goto _L5
	//*  63  115:goto            67
_L9:
		s1 = s;
	//   64  118:aload_0         
	//   65  119:astore          6
		stringbuffer.append('(').append(s.substring(0, k)).append(')');
	//   66  121:aload           8
	//   67  123:bipush          40
	//   68  125:invokevirtual   #202 <Method StringBuffer StringBuffer.append(char)>
	//   69  128:aload_0         
	//   70  129:iconst_0        
	//   71  130:iload_3         
	//   72  131:invokevirtual   #139 <Method String String.substring(int, int)>
	//   73  134:invokevirtual   #189 <Method StringBuffer StringBuffer.append(String)>
	//   74  137:bipush          41
	//   75  139:invokevirtual   #202 <Method StringBuffer StringBuffer.append(char)>
	//   76  142:pop             
		s1 = s;
	//   77  143:aload_0         
	//   78  144:astore          6
		String s2 = s.substring(k);
	//   79  146:aload_0         
	//   80  147:iload_3         
	//   81  148:invokevirtual   #183 <Method String String.substring(int)>
	//   82  151:astore          7
		if(l <= 0)
			break MISSING_BLOCK_LABEL_213;
	//   83  153:iload           4
	//   84  155:ifle            213
		i = l - k;
	//   85  158:iload           4
	//   86  160:iload_3         
	//   87  161:isub            
	//   88  162:istore_1        
		s = s2;
	//   89  163:aload           7
	//   90  165:astore_0        
		s1 = s2;
	//   91  166:aload           7
	//   92  168:astore          6
		if(s2.length() <= i) goto _L8; else goto _L10
	//   93  170:aload           7
	//   94  172:invokevirtual   #147 <Method int String.length()>
	//   95  175:iload_1         
	//   96  176:icmple          71
_L10:
		s1 = s2;
	//   97  179:aload           7
	//   98  181:astore          6
		stringbuffer.append(removeFNC1(s2.substring(0, i)));
	//   99  183:aload           8
	//  100  185:aload           7
	//  101  187:iconst_0        
	//  102  188:iload_1         
	//  103  189:invokevirtual   #139 <Method String String.substring(int, int)>
	//  104  192:invokestatic    #186 <Method String removeFNC1(String)>
	//  105  195:invokevirtual   #189 <Method StringBuffer StringBuffer.append(String)>
	//  106  198:pop             
		s1 = s2;
	//  107  199:aload           7
	//  108  201:astore          6
		s = s2.substring(i);
	//  109  203:aload           7
	//  110  205:iload_1         
	//  111  206:invokevirtual   #183 <Method String String.substring(int)>
	//  112  209:astore_0        
		  goto _L3
	//* 113  210:goto            9
		s1 = s2;
	//  114  213:aload           7
	//  115  215:astore          6
		i = s2.indexOf('\312');
	//  116  217:aload           7
	//  117  219:sipush          202
	//  118  222:invokevirtual   #135 <Method int String.indexOf(int)>
	//  119  225:istore_1        
		s = s2;
	//  120  226:aload           7
	//  121  228:astore_0        
		if(i < 0) goto _L8; else goto _L11
	//  122  229:iload_1         
	//  123  230:iflt            71
_L11:
		s1 = s2;
	//  124  233:aload           7
	//  125  235:astore          6
		stringbuffer.append(s2.substring(0, i));
	//  126  237:aload           8
	//  127  239:aload           7
	//  128  241:iconst_0        
	//  129  242:iload_1         
	//  130  243:invokevirtual   #139 <Method String String.substring(int, int)>
	//  131  246:invokevirtual   #189 <Method StringBuffer StringBuffer.append(String)>
	//  132  249:pop             
		s1 = s2;
	//  133  250:aload           7
	//  134  252:astore          6
		s = s2.substring(i + 1);
	//  135  254:aload           7
	//  136  256:iload_1         
	//  137  257:iconst_1        
	//  138  258:iadd            
	//  139  259:invokevirtual   #183 <Method String String.substring(int)>
	//  140  262:astore_0        
		  goto _L3
	//* 141  263:goto            9
		s;
	//  142  266:astore_0        
		s = s1;
	//  143  267:aload           6
	//  144  269:astore_0        
		  goto _L8
	//* 145  270:goto            71
_L2:
		j = 0;
	//  146  273:iconst_0        
	//  147  274:istore_2        
		flag = false;
	//  148  275:iconst_0        
	//  149  276:istore          5
		i = 2;
	//  150  278:iconst_2        
	//  151  279:istore_1        
		  goto _L12
	//* 152  280:goto            37
		i++;
	//  153  283:iload_1         
	//  154  284:iconst_1        
	//  155  285:iadd            
	//  156  286:istore_1        
		  goto _L12
	//* 157  287:goto            37
	}

	static String getPackedRawDigits(String s, int i, int j)
	{
		StringBuilder stringbuilder = new StringBuilder("");
	//    0    0:new             #149 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:ldc1            #206 <String "">
	//    3    6:invokespecial   #209 <Method void StringBuilder(String)>
	//    4    9:astore          6
		int l = i;
	//    5   11:iload_1         
	//    6   12:istore          4
		int k = j;
	//    7   14:iload_2         
	//    8   15:istore_3        
		j = l;
	//    9   16:iload           4
	//   10   18:istore_2        
		while(k > 0) 
	//*  11   19:iload_3         
	//*  12   20:ifle            98
			if(s.charAt(j) == '\312')
	//*  13   23:aload_0         
	//*  14   24:iload_2         
	//*  15   25:invokevirtual   #143 <Method char String.charAt(int)>
	//*  16   28:sipush          202
	//*  17   31:icmpne          49
			{
				stringbuilder.append('f');
	//   18   34:aload           6
	//   19   36:bipush          102
	//   20   38:invokevirtual   #157 <Method StringBuilder StringBuilder.append(char)>
	//   21   41:pop             
				j++;
	//   22   42:iload_2         
	//   23   43:iconst_1        
	//   24   44:iadd            
	//   25   45:istore_2        
			} else
	//*  26   46:goto            19
			{
				k -= 2;
	//   27   49:iload_3         
	//   28   50:iconst_2        
	//   29   51:isub            
	//   30   52:istore_3        
				int i1 = j + 1;
	//   31   53:iload_2         
	//   32   54:iconst_1        
	//   33   55:iadd            
	//   34   56:istore          4
				char c = s.charAt(j);
	//   35   58:aload_0         
	//   36   59:iload_2         
	//   37   60:invokevirtual   #143 <Method char String.charAt(int)>
	//   38   63:istore          5
				j = i1 + 1;
	//   39   65:iload           4
	//   40   67:iconst_1        
	//   41   68:iadd            
	//   42   69:istore_2        
				stringbuilder.append((char)((c - 48) * 10 + (s.charAt(i1) - 48)));
	//   43   70:aload           6
	//   44   72:iload           5
	//   45   74:bipush          48
	//   46   76:isub            
	//   47   77:bipush          10
	//   48   79:imul            
	//   49   80:aload_0         
	//   50   81:iload           4
	//   51   83:invokevirtual   #143 <Method char String.charAt(int)>
	//   52   86:bipush          48
	//   53   88:isub            
	//   54   89:iadd            
	//   55   90:int2char        
	//   56   91:invokevirtual   #157 <Method StringBuilder StringBuilder.append(char)>
	//   57   94:pop             
			}
	//*  58   95:goto            19
		return (new StringBuilder()).append((char)(j - i)).append(stringbuilder.toString()).toString();
	//   59   98:new             #149 <Class StringBuilder>
	//   60  101:dup             
	//   61  102:invokespecial   #150 <Method void StringBuilder()>
	//   62  105:iload_2         
	//   63  106:iload_1         
	//   64  107:isub            
	//   65  108:int2char        
	//   66  109:invokevirtual   #157 <Method StringBuilder StringBuilder.append(char)>
	//   67  112:aload           6
	//   68  114:invokevirtual   #161 <Method String StringBuilder.toString()>
	//   69  117:invokevirtual   #154 <Method StringBuilder StringBuilder.append(String)>
	//   70  120:invokevirtual   #161 <Method String StringBuilder.toString()>
	//   71  123:areturn         
	}

	public static String getRawText(String s, boolean flag)
	{
		return getRawText(s, flag, Barcode128CodeSet.AUTO);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:getstatic       #82  <Field Barcode128$Barcode128CodeSet Barcode128$Barcode128CodeSet.AUTO>
	//    3    5:invokestatic    #214 <Method String getRawText(String, boolean, Barcode128$Barcode128CodeSet)>
	//    4    8:areturn         
	}

	public static String getRawText(String s, boolean flag, Barcode128CodeSet barcode128codeset)
	{
		int l;
		byte byte2;
		int i1;
		String s4;
		i1 = s.length();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #147 <Method int String.length()>
	//    2    4:istore          7
		if(i1 == 0)
	//*   3    6:iload           7
	//*   4    8:ifne            62
		{
			barcode128codeset = ((Barcode128CodeSet) ((new StringBuilder()).append("").append(barcode128codeset.getStartSymbol()).toString()));
	//    5   11:new             #149 <Class StringBuilder>
	//    6   14:dup             
	//    7   15:invokespecial   #150 <Method void StringBuilder()>
	//    8   18:ldc1            #206 <String "">
	//    9   20:invokevirtual   #154 <Method StringBuilder StringBuilder.append(String)>
	//   10   23:aload_2         
	//   11   24:invokevirtual   #218 <Method char Barcode128$Barcode128CodeSet.getStartSymbol()>
	//   12   27:invokevirtual   #157 <Method StringBuilder StringBuilder.append(char)>
	//   13   30:invokevirtual   #161 <Method String StringBuilder.toString()>
	//   14   33:astore_2        
			s = ((String) (barcode128codeset));
	//   15   34:aload_2         
	//   16   35:astore_0        
			if(flag)
	//*  17   36:iload_1         
	//*  18   37:ifeq            60
				s = (new StringBuilder()).append(((String) (barcode128codeset))).append('f').toString();
	//   19   40:new             #149 <Class StringBuilder>
	//   20   43:dup             
	//   21   44:invokespecial   #150 <Method void StringBuilder()>
	//   22   47:aload_2         
	//   23   48:invokevirtual   #154 <Method StringBuilder StringBuilder.append(String)>
	//   24   51:bipush          102
	//   25   53:invokevirtual   #157 <Method StringBuilder StringBuilder.append(char)>
	//   26   56:invokevirtual   #161 <Method String StringBuilder.toString()>
	//   27   59:astore_0        
			return s;
	//   28   60:aload_0         
	//   29   61:areturn         
		}
		for(int i = 0; i < i1; i++)
	//*  30   62:iconst_0        
	//*  31   63:istore_3        
	//*  32   64:iload_3         
	//*  33   65:iload           7
	//*  34   67:icmpge          120
		{
			char c = s.charAt(i);
	//   35   70:aload_0         
	//   36   71:iload_3         
	//   37   72:invokevirtual   #143 <Method char String.charAt(int)>
	//   38   75:istore          4
			if(c > '\177' && c != '\312')
	//*  39   77:iload           4
	//*  40   79:bipush          127
	//*  41   81:icmple          113
	//*  42   84:iload           4
	//*  43   86:sipush          202
	//*  44   89:icmpeq          113
				throw new RuntimeException(MessageLocalization.getComposedMessage("there.are.illegal.characters.for.barcode.128.in.1", new Object[] {
					s
				}));
	//   45   92:new             #220 <Class RuntimeException>
	//   46   95:dup             
	//   47   96:ldc1            #222 <String "there.are.illegal.characters.for.barcode.128.in.1">
	//   48   98:iconst_1        
	//   49   99:anewarray       Object[]
	//   50  102:dup             
	//   51  103:iconst_0        
	//   52  104:aload_0         
	//   53  105:aastore         
	//   54  106:invokestatic    #230 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   55  109:invokespecial   #231 <Method void RuntimeException(String)>
	//   56  112:athrow          
		}

	//   57  113:iload_3         
	//   58  114:iconst_1        
	//   59  115:iadd            
	//   60  116:istore_3        
	//*  61  117:goto            64
		int k = ((int) (s.charAt(0)));
	//   62  120:aload_0         
	//   63  121:iconst_0        
	//   64  122:invokevirtual   #143 <Method char String.charAt(int)>
	//   65  125:istore          4
		byte byte0 = 104;
	//   66  127:bipush          104
	//   67  129:istore_3        
		String s1;
		if((barcode128codeset == Barcode128CodeSet.AUTO || barcode128codeset == Barcode128CodeSet.C) && isNextDigits(s, 0, 2))
	//*  68  130:aload_2         
	//*  69  131:getstatic       #82  <Field Barcode128$Barcode128CodeSet Barcode128$Barcode128CodeSet.AUTO>
	//*  70  134:if_acmpeq       144
	//*  71  137:aload_2         
	//*  72  138:getstatic       #233 <Field Barcode128$Barcode128CodeSet Barcode128$Barcode128CodeSet.C>
	//*  73  141:if_acmpne       310
	//*  74  144:aload_0         
	//*  75  145:iconst_0        
	//*  76  146:iconst_2        
	//*  77  147:invokestatic    #237 <Method boolean isNextDigits(String, int, int)>
	//*  78  150:ifeq            310
		{
			byte0 = 105;
	//   79  153:bipush          105
	//   80  155:istore_3        
			String s3 = (new StringBuilder()).append("").append('i').toString();
	//   81  156:new             #149 <Class StringBuilder>
	//   82  159:dup             
	//   83  160:invokespecial   #150 <Method void StringBuilder()>
	//   84  163:ldc1            #206 <String "">
	//   85  165:invokevirtual   #154 <Method StringBuilder StringBuilder.append(String)>
	//   86  168:bipush          105
	//   87  170:invokevirtual   #157 <Method StringBuilder StringBuilder.append(char)>
	//   88  173:invokevirtual   #161 <Method String StringBuilder.toString()>
	//   89  176:astore          9
			s1 = s3;
	//   90  178:aload           9
	//   91  180:astore          8
			if(flag)
	//*  92  182:iload_1         
	//*  93  183:ifeq            208
				s1 = (new StringBuilder()).append(s3).append('f').toString();
	//   94  186:new             #149 <Class StringBuilder>
	//   95  189:dup             
	//   96  190:invokespecial   #150 <Method void StringBuilder()>
	//   97  193:aload           9
	//   98  195:invokevirtual   #154 <Method StringBuilder StringBuilder.append(String)>
	//   99  198:bipush          102
	//  100  200:invokevirtual   #157 <Method StringBuilder StringBuilder.append(char)>
	//  101  203:invokevirtual   #161 <Method String StringBuilder.toString()>
	//  102  206:astore          8
			s3 = getPackedRawDigits(s, 0, 2);
	//  103  208:aload_0         
	//  104  209:iconst_0        
	//  105  210:iconst_2        
	//  106  211:invokestatic    #239 <Method String getPackedRawDigits(String, int, int)>
	//  107  214:astore          9
			k = 0 + s3.charAt(0);
	//  108  216:iconst_0        
	//  109  217:aload           9
	//  110  219:iconst_0        
	//  111  220:invokevirtual   #143 <Method char String.charAt(int)>
	//  112  223:iadd            
	//  113  224:istore          4
			s1 = (new StringBuilder()).append(s1).append(s3.substring(1)).toString();
	//  114  226:new             #149 <Class StringBuilder>
	//  115  229:dup             
	//  116  230:invokespecial   #150 <Method void StringBuilder()>
	//  117  233:aload           8
	//  118  235:invokevirtual   #154 <Method StringBuilder StringBuilder.append(String)>
	//  119  238:aload           9
	//  120  240:iconst_1        
	//  121  241:invokevirtual   #183 <Method String String.substring(int)>
	//  122  244:invokevirtual   #154 <Method StringBuilder StringBuilder.append(String)>
	//  123  247:invokevirtual   #161 <Method String StringBuilder.toString()>
	//  124  250:astore          8
		} else
	//* 125  252:iload_3         
	//* 126  253:istore          6
	//* 127  255:iload           4
	//* 128  257:istore          5
	//* 129  259:aload           8
	//* 130  261:astore          9
	//* 131  263:aload_2         
	//* 132  264:getstatic       #82  <Field Barcode128$Barcode128CodeSet Barcode128$Barcode128CodeSet.AUTO>
	//* 133  267:if_acmpeq       525
	//* 134  270:iload_3         
	//* 135  271:istore          6
	//* 136  273:iload           4
	//* 137  275:istore          5
	//* 138  277:aload           8
	//* 139  279:astore          9
	//* 140  281:iload_3         
	//* 141  282:aload_2         
	//* 142  283:invokevirtual   #218 <Method char Barcode128$Barcode128CodeSet.getStartSymbol()>
	//* 143  286:icmpeq          525
	//* 144  289:new             #220 <Class RuntimeException>
	//* 145  292:dup             
	//* 146  293:ldc1            #222 <String "there.are.illegal.characters.for.barcode.128.in.1">
	//* 147  295:iconst_1        
	//* 148  296:anewarray       Object[]
	//* 149  299:dup             
	//* 150  300:iconst_0        
	//* 151  301:aload_0         
	//* 152  302:aastore         
	//* 153  303:invokestatic    #230 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//* 154  306:invokespecial   #231 <Method void RuntimeException(String)>
	//* 155  309:athrow          
		if(k < 32)
	//* 156  310:iload           4
	//* 157  312:bipush          32
	//* 158  314:icmpge          406
		{
			byte0 = 103;
	//  159  317:bipush          103
	//  160  319:istore_3        
			s4 = (new StringBuilder()).append("").append('g').toString();
	//  161  320:new             #149 <Class StringBuilder>
	//  162  323:dup             
	//  163  324:invokespecial   #150 <Method void StringBuilder()>
	//  164  327:ldc1            #206 <String "">
	//  165  329:invokevirtual   #154 <Method StringBuilder StringBuilder.append(String)>
	//  166  332:bipush          103
	//  167  334:invokevirtual   #157 <Method StringBuilder StringBuilder.append(char)>
	//  168  337:invokevirtual   #161 <Method String StringBuilder.toString()>
	//  169  340:astore          9
			s1 = s4;
	//  170  342:aload           9
	//  171  344:astore          8
			if(flag)
	//* 172  346:iload_1         
	//* 173  347:ifeq            372
				s1 = (new StringBuilder()).append(s4).append('f').toString();
	//  174  350:new             #149 <Class StringBuilder>
	//  175  353:dup             
	//  176  354:invokespecial   #150 <Method void StringBuilder()>
	//  177  357:aload           9
	//  178  359:invokevirtual   #154 <Method StringBuilder StringBuilder.append(String)>
	//  179  362:bipush          102
	//  180  364:invokevirtual   #157 <Method StringBuilder StringBuilder.append(char)>
	//  181  367:invokevirtual   #161 <Method String StringBuilder.toString()>
	//  182  370:astore          8
			s1 = (new StringBuilder()).append(s1).append((char)(k + 64)).toString();
	//  183  372:new             #149 <Class StringBuilder>
	//  184  375:dup             
	//  185  376:invokespecial   #150 <Method void StringBuilder()>
	//  186  379:aload           8
	//  187  381:invokevirtual   #154 <Method StringBuilder StringBuilder.append(String)>
	//  188  384:iload           4
	//  189  386:bipush          64
	//  190  388:iadd            
	//  191  389:int2char        
	//  192  390:invokevirtual   #157 <Method StringBuilder StringBuilder.append(char)>
	//  193  393:invokevirtual   #161 <Method String StringBuilder.toString()>
	//  194  396:astore          8
			k = 0 + 1;
	//  195  398:iconst_0        
	//  196  399:iconst_1        
	//  197  400:iadd            
	//  198  401:istore          4
		} else
	//* 199  403:goto            252
		{
			s4 = (new StringBuilder()).append("").append('h').toString();
	//  200  406:new             #149 <Class StringBuilder>
	//  201  409:dup             
	//  202  410:invokespecial   #150 <Method void StringBuilder()>
	//  203  413:ldc1            #206 <String "">
	//  204  415:invokevirtual   #154 <Method StringBuilder StringBuilder.append(String)>
	//  205  418:bipush          104
	//  206  420:invokevirtual   #157 <Method StringBuilder StringBuilder.append(char)>
	//  207  423:invokevirtual   #161 <Method String StringBuilder.toString()>
	//  208  426:astore          9
			s1 = s4;
	//  209  428:aload           9
	//  210  430:astore          8
			if(flag)
	//* 211  432:iload_1         
	//* 212  433:ifeq            458
				s1 = (new StringBuilder()).append(s4).append('f').toString();
	//  213  436:new             #149 <Class StringBuilder>
	//  214  439:dup             
	//  215  440:invokespecial   #150 <Method void StringBuilder()>
	//  216  443:aload           9
	//  217  445:invokevirtual   #154 <Method StringBuilder StringBuilder.append(String)>
	//  218  448:bipush          102
	//  219  450:invokevirtual   #157 <Method StringBuilder StringBuilder.append(char)>
	//  220  453:invokevirtual   #161 <Method String StringBuilder.toString()>
	//  221  456:astore          8
			if(k == 202)
	//* 222  458:iload           4
	//* 223  460:sipush          202
	//* 224  463:icmpne          496
				s1 = (new StringBuilder()).append(s1).append('f').toString();
	//  225  466:new             #149 <Class StringBuilder>
	//  226  469:dup             
	//  227  470:invokespecial   #150 <Method void StringBuilder()>
	//  228  473:aload           8
	//  229  475:invokevirtual   #154 <Method StringBuilder StringBuilder.append(String)>
	//  230  478:bipush          102
	//  231  480:invokevirtual   #157 <Method StringBuilder StringBuilder.append(char)>
	//  232  483:invokevirtual   #161 <Method String StringBuilder.toString()>
	//  233  486:astore          8
			else
	//* 234  488:iconst_0        
	//* 235  489:iconst_1        
	//* 236  490:iadd            
	//* 237  491:istore          4
	//* 238  493:goto            252
				s1 = (new StringBuilder()).append(s1).append((char)(k - 32)).toString();
	//  239  496:new             #149 <Class StringBuilder>
	//  240  499:dup             
	//  241  500:invokespecial   #150 <Method void StringBuilder()>
	//  242  503:aload           8
	//  243  505:invokevirtual   #154 <Method StringBuilder StringBuilder.append(String)>
	//  244  508:iload           4
	//  245  510:bipush          32
	//  246  512:isub            
	//  247  513:int2char        
	//  248  514:invokevirtual   #157 <Method StringBuilder StringBuilder.append(char)>
	//  249  517:invokevirtual   #161 <Method String StringBuilder.toString()>
	//  250  520:astore          8
			k = 0 + 1;
		}
		byte2 = byte0;
		l = k;
		s4 = s1;
		if(barcode128codeset != Barcode128CodeSet.AUTO)
		{
			byte2 = byte0;
			l = k;
			s4 = s1;
			if(byte0 != barcode128codeset.getStartSymbol())
				throw new RuntimeException(MessageLocalization.getComposedMessage("there.are.illegal.characters.for.barcode.128.in.1", new Object[] {
					s
				}));
		}
	//* 251  522:goto            488
_L6:
		if(l >= i1)
			break MISSING_BLOCK_LABEL_1371;
	//  252  525:iload           5
	//  253  527:iload           7
	//  254  529:icmpge          1371
		byte2;
	//  255  532:iload           6
		JVM INSTR tableswitch 103 105: default 560
	//	               103 630
	//	               104 906
	//	               105 1142;
	//  256  534:tableswitch     103 105: default 560
	//	               103 630
	//	               104 906
	//	               105 1142
		   goto _L1 _L2 _L3 _L4
_L4:
		break MISSING_BLOCK_LABEL_1142;
_L2:
		break; /* Loop/switch isn't completed */
_L1:
		int j;
		byte byte1;
		String s2;
		j = l;
	//  257  560:iload           5
	//  258  562:istore_3        
		s2 = s4;
	//  259  563:aload           9
	//  260  565:astore          8
		byte1 = byte2;
	//  261  567:iload           6
	//  262  569:istore          4
_L7:
		byte2 = byte1;
	//  263  571:iload           4
	//  264  573:istore          6
		l = j;
	//  265  575:iload_3         
	//  266  576:istore          5
		s4 = s2;
	//  267  578:aload           8
	//  268  580:astore          9
		if(barcode128codeset != Barcode128CodeSet.AUTO)
	//* 269  582:aload_2         
	//* 270  583:getstatic       #82  <Field Barcode128$Barcode128CodeSet Barcode128$Barcode128CodeSet.AUTO>
	//* 271  586:if_acmpeq       525
		{
			byte2 = byte1;
	//  272  589:iload           4
	//  273  591:istore          6
			l = j;
	//  274  593:iload_3         
	//  275  594:istore          5
			s4 = s2;
	//  276  596:aload           8
	//  277  598:astore          9
			if(byte1 != barcode128codeset.getStartSymbol())
	//* 278  600:iload           4
	//* 279  602:aload_2         
	//* 280  603:invokevirtual   #218 <Method char Barcode128$Barcode128CodeSet.getStartSymbol()>
	//* 281  606:icmpeq          525
				throw new RuntimeException(MessageLocalization.getComposedMessage("there.are.illegal.characters.for.barcode.128.in.1", new Object[] {
					s
				}));
	//  282  609:new             #220 <Class RuntimeException>
	//  283  612:dup             
	//  284  613:ldc1            #222 <String "there.are.illegal.characters.for.barcode.128.in.1">
	//  285  615:iconst_1        
	//  286  616:anewarray       Object[]
	//  287  619:dup             
	//  288  620:iconst_0        
	//  289  621:aload_0         
	//  290  622:aastore         
	//  291  623:invokestatic    #230 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//  292  626:invokespecial   #231 <Method void RuntimeException(String)>
	//  293  629:athrow          
		}
		if(true) goto _L6; else goto _L5
_L5:
		if(barcode128codeset == Barcode128CodeSet.AUTO && isNextDigits(s, l, 4))
	//* 294  630:aload_2         
	//* 295  631:getstatic       #82  <Field Barcode128$Barcode128CodeSet Barcode128$Barcode128CodeSet.AUTO>
	//* 296  634:if_acmpne       721
	//* 297  637:aload_0         
	//* 298  638:iload           5
	//* 299  640:iconst_4        
	//* 300  641:invokestatic    #237 <Method boolean isNextDigits(String, int, int)>
	//* 301  644:ifeq            721
		{
			byte1 = 105;
	//  302  647:bipush          105
	//  303  649:istore          4
			s2 = (new StringBuilder()).append(s4).append('c').toString();
	//  304  651:new             #149 <Class StringBuilder>
	//  305  654:dup             
	//  306  655:invokespecial   #150 <Method void StringBuilder()>
	//  307  658:aload           9
	//  308  660:invokevirtual   #154 <Method StringBuilder StringBuilder.append(String)>
	//  309  663:bipush          99
	//  310  665:invokevirtual   #157 <Method StringBuilder StringBuilder.append(char)>
	//  311  668:invokevirtual   #161 <Method String StringBuilder.toString()>
	//  312  671:astore          8
			s4 = getPackedRawDigits(s, l, 4);
	//  313  673:aload_0         
	//  314  674:iload           5
	//  315  676:iconst_4        
	//  316  677:invokestatic    #239 <Method String getPackedRawDigits(String, int, int)>
	//  317  680:astore          9
			j = l + s4.charAt(0);
	//  318  682:iload           5
	//  319  684:aload           9
	//  320  686:iconst_0        
	//  321  687:invokevirtual   #143 <Method char String.charAt(int)>
	//  322  690:iadd            
	//  323  691:istore_3        
			s2 = (new StringBuilder()).append(s2).append(s4.substring(1)).toString();
	//  324  692:new             #149 <Class StringBuilder>
	//  325  695:dup             
	//  326  696:invokespecial   #150 <Method void StringBuilder()>
	//  327  699:aload           8
	//  328  701:invokevirtual   #154 <Method StringBuilder StringBuilder.append(String)>
	//  329  704:aload           9
	//  330  706:iconst_1        
	//  331  707:invokevirtual   #183 <Method String String.substring(int)>
	//  332  710:invokevirtual   #154 <Method StringBuilder StringBuilder.append(String)>
	//  333  713:invokevirtual   #161 <Method String StringBuilder.toString()>
	//  334  716:astore          8
		} else
	//* 335  718:goto            571
		{
			j = l + 1;
	//  336  721:iload           5
	//  337  723:iconst_1        
	//  338  724:iadd            
	//  339  725:istore_3        
			l = ((int) (s.charAt(l)));
	//  340  726:aload_0         
	//  341  727:iload           5
	//  342  729:invokevirtual   #143 <Method char String.charAt(int)>
	//  343  732:istore          5
			if(l == 202)
	//* 344  734:iload           5
	//* 345  736:sipush          202
	//* 346  739:icmpne          771
			{
				s2 = (new StringBuilder()).append(s4).append('f').toString();
	//  347  742:new             #149 <Class StringBuilder>
	//  348  745:dup             
	//  349  746:invokespecial   #150 <Method void StringBuilder()>
	//  350  749:aload           9
	//  351  751:invokevirtual   #154 <Method StringBuilder StringBuilder.append(String)>
	//  352  754:bipush          102
	//  353  756:invokevirtual   #157 <Method StringBuilder StringBuilder.append(char)>
	//  354  759:invokevirtual   #161 <Method String StringBuilder.toString()>
	//  355  762:astore          8
				byte1 = byte2;
	//  356  764:iload           6
	//  357  766:istore          4
			} else
	//* 358  768:goto            571
			if(l > 95)
	//* 359  771:iload           5
	//* 360  773:bipush          95
	//* 361  775:icmple          833
			{
				byte1 = 104;
	//  362  778:bipush          104
	//  363  780:istore          4
				s2 = (new StringBuilder()).append(s4).append('d').toString();
	//  364  782:new             #149 <Class StringBuilder>
	//  365  785:dup             
	//  366  786:invokespecial   #150 <Method void StringBuilder()>
	//  367  789:aload           9
	//  368  791:invokevirtual   #154 <Method StringBuilder StringBuilder.append(String)>
	//  369  794:bipush          100
	//  370  796:invokevirtual   #157 <Method StringBuilder StringBuilder.append(char)>
	//  371  799:invokevirtual   #161 <Method String StringBuilder.toString()>
	//  372  802:astore          8
				s2 = (new StringBuilder()).append(s2).append((char)(l - 32)).toString();
	//  373  804:new             #149 <Class StringBuilder>
	//  374  807:dup             
	//  375  808:invokespecial   #150 <Method void StringBuilder()>
	//  376  811:aload           8
	//  377  813:invokevirtual   #154 <Method StringBuilder StringBuilder.append(String)>
	//  378  816:iload           5
	//  379  818:bipush          32
	//  380  820:isub            
	//  381  821:int2char        
	//  382  822:invokevirtual   #157 <Method StringBuilder StringBuilder.append(char)>
	//  383  825:invokevirtual   #161 <Method String StringBuilder.toString()>
	//  384  828:astore          8
			} else
	//* 385  830:goto            571
			if(l < 32)
	//* 386  833:iload           5
	//* 387  835:bipush          32
	//* 388  837:icmpge          873
			{
				s2 = (new StringBuilder()).append(s4).append((char)(l + 64)).toString();
	//  389  840:new             #149 <Class StringBuilder>
	//  390  843:dup             
	//  391  844:invokespecial   #150 <Method void StringBuilder()>
	//  392  847:aload           9
	//  393  849:invokevirtual   #154 <Method StringBuilder StringBuilder.append(String)>
	//  394  852:iload           5
	//  395  854:bipush          64
	//  396  856:iadd            
	//  397  857:int2char        
	//  398  858:invokevirtual   #157 <Method StringBuilder StringBuilder.append(char)>
	//  399  861:invokevirtual   #161 <Method String StringBuilder.toString()>
	//  400  864:astore          8
				byte1 = byte2;
	//  401  866:iload           6
	//  402  868:istore          4
			} else
	//* 403  870:goto            571
			{
				s2 = (new StringBuilder()).append(s4).append((char)(l - 32)).toString();
	//  404  873:new             #149 <Class StringBuilder>
	//  405  876:dup             
	//  406  877:invokespecial   #150 <Method void StringBuilder()>
	//  407  880:aload           9
	//  408  882:invokevirtual   #154 <Method StringBuilder StringBuilder.append(String)>
	//  409  885:iload           5
	//  410  887:bipush          32
	//  411  889:isub            
	//  412  890:int2char        
	//  413  891:invokevirtual   #157 <Method StringBuilder StringBuilder.append(char)>
	//  414  894:invokevirtual   #161 <Method String StringBuilder.toString()>
	//  415  897:astore          8
				byte1 = byte2;
	//  416  899:iload           6
	//  417  901:istore          4
			}
		}
		  goto _L7
	//* 418  903:goto            571
_L3:
		if(barcode128codeset == Barcode128CodeSet.AUTO && isNextDigits(s, l, 4))
	//* 419  906:aload_2         
	//* 420  907:getstatic       #82  <Field Barcode128$Barcode128CodeSet Barcode128$Barcode128CodeSet.AUTO>
	//* 421  910:if_acmpne       997
	//* 422  913:aload_0         
	//* 423  914:iload           5
	//* 424  916:iconst_4        
	//* 425  917:invokestatic    #237 <Method boolean isNextDigits(String, int, int)>
	//* 426  920:ifeq            997
		{
			byte1 = 105;
	//  427  923:bipush          105
	//  428  925:istore          4
			s2 = (new StringBuilder()).append(s4).append('c').toString();
	//  429  927:new             #149 <Class StringBuilder>
	//  430  930:dup             
	//  431  931:invokespecial   #150 <Method void StringBuilder()>
	//  432  934:aload           9
	//  433  936:invokevirtual   #154 <Method StringBuilder StringBuilder.append(String)>
	//  434  939:bipush          99
	//  435  941:invokevirtual   #157 <Method StringBuilder StringBuilder.append(char)>
	//  436  944:invokevirtual   #161 <Method String StringBuilder.toString()>
	//  437  947:astore          8
			s4 = getPackedRawDigits(s, l, 4);
	//  438  949:aload_0         
	//  439  950:iload           5
	//  440  952:iconst_4        
	//  441  953:invokestatic    #239 <Method String getPackedRawDigits(String, int, int)>
	//  442  956:astore          9
			j = l + s4.charAt(0);
	//  443  958:iload           5
	//  444  960:aload           9
	//  445  962:iconst_0        
	//  446  963:invokevirtual   #143 <Method char String.charAt(int)>
	//  447  966:iadd            
	//  448  967:istore_3        
			s2 = (new StringBuilder()).append(s2).append(s4.substring(1)).toString();
	//  449  968:new             #149 <Class StringBuilder>
	//  450  971:dup             
	//  451  972:invokespecial   #150 <Method void StringBuilder()>
	//  452  975:aload           8
	//  453  977:invokevirtual   #154 <Method StringBuilder StringBuilder.append(String)>
	//  454  980:aload           9
	//  455  982:iconst_1        
	//  456  983:invokevirtual   #183 <Method String String.substring(int)>
	//  457  986:invokevirtual   #154 <Method StringBuilder StringBuilder.append(String)>
	//  458  989:invokevirtual   #161 <Method String StringBuilder.toString()>
	//  459  992:astore          8
		} else
	//* 460  994:goto            571
		{
			j = l + 1;
	//  461  997:iload           5
	//  462  999:iconst_1        
	//  463 1000:iadd            
	//  464 1001:istore_3        
			l = ((int) (s.charAt(l)));
	//  465 1002:aload_0         
	//  466 1003:iload           5
	//  467 1005:invokevirtual   #143 <Method char String.charAt(int)>
	//  468 1008:istore          5
			if(l == 202)
	//* 469 1010:iload           5
	//* 470 1012:sipush          202
	//* 471 1015:icmpne          1047
			{
				s2 = (new StringBuilder()).append(s4).append('f').toString();
	//  472 1018:new             #149 <Class StringBuilder>
	//  473 1021:dup             
	//  474 1022:invokespecial   #150 <Method void StringBuilder()>
	//  475 1025:aload           9
	//  476 1027:invokevirtual   #154 <Method StringBuilder StringBuilder.append(String)>
	//  477 1030:bipush          102
	//  478 1032:invokevirtual   #157 <Method StringBuilder StringBuilder.append(char)>
	//  479 1035:invokevirtual   #161 <Method String StringBuilder.toString()>
	//  480 1038:astore          8
				byte1 = byte2;
	//  481 1040:iload           6
	//  482 1042:istore          4
			} else
	//* 483 1044:goto            571
			if(l < 32)
	//* 484 1047:iload           5
	//* 485 1049:bipush          32
	//* 486 1051:icmpge          1109
			{
				byte1 = 103;
	//  487 1054:bipush          103
	//  488 1056:istore          4
				s2 = (new StringBuilder()).append(s4).append('e').toString();
	//  489 1058:new             #149 <Class StringBuilder>
	//  490 1061:dup             
	//  491 1062:invokespecial   #150 <Method void StringBuilder()>
	//  492 1065:aload           9
	//  493 1067:invokevirtual   #154 <Method StringBuilder StringBuilder.append(String)>
	//  494 1070:bipush          101
	//  495 1072:invokevirtual   #157 <Method StringBuilder StringBuilder.append(char)>
	//  496 1075:invokevirtual   #161 <Method String StringBuilder.toString()>
	//  497 1078:astore          8
				s2 = (new StringBuilder()).append(s2).append((char)(l + 64)).toString();
	//  498 1080:new             #149 <Class StringBuilder>
	//  499 1083:dup             
	//  500 1084:invokespecial   #150 <Method void StringBuilder()>
	//  501 1087:aload           8
	//  502 1089:invokevirtual   #154 <Method StringBuilder StringBuilder.append(String)>
	//  503 1092:iload           5
	//  504 1094:bipush          64
	//  505 1096:iadd            
	//  506 1097:int2char        
	//  507 1098:invokevirtual   #157 <Method StringBuilder StringBuilder.append(char)>
	//  508 1101:invokevirtual   #161 <Method String StringBuilder.toString()>
	//  509 1104:astore          8
			} else
	//* 510 1106:goto            571
			{
				s2 = (new StringBuilder()).append(s4).append((char)(l - 32)).toString();
	//  511 1109:new             #149 <Class StringBuilder>
	//  512 1112:dup             
	//  513 1113:invokespecial   #150 <Method void StringBuilder()>
	//  514 1116:aload           9
	//  515 1118:invokevirtual   #154 <Method StringBuilder StringBuilder.append(String)>
	//  516 1121:iload           5
	//  517 1123:bipush          32
	//  518 1125:isub            
	//  519 1126:int2char        
	//  520 1127:invokevirtual   #157 <Method StringBuilder StringBuilder.append(char)>
	//  521 1130:invokevirtual   #161 <Method String StringBuilder.toString()>
	//  522 1133:astore          8
				byte1 = byte2;
	//  523 1135:iload           6
	//  524 1137:istore          4
			}
		}
		  goto _L7
	//* 525 1139:goto            571
		if(isNextDigits(s, l, 2))
	//* 526 1142:aload_0         
	//* 527 1143:iload           5
	//* 528 1145:iconst_2        
	//* 529 1146:invokestatic    #237 <Method boolean isNextDigits(String, int, int)>
	//* 530 1149:ifeq            1204
		{
			s2 = getPackedRawDigits(s, l, 2);
	//  531 1152:aload_0         
	//  532 1153:iload           5
	//  533 1155:iconst_2        
	//  534 1156:invokestatic    #239 <Method String getPackedRawDigits(String, int, int)>
	//  535 1159:astore          8
			j = l + s2.charAt(0);
	//  536 1161:iload           5
	//  537 1163:aload           8
	//  538 1165:iconst_0        
	//  539 1166:invokevirtual   #143 <Method char String.charAt(int)>
	//  540 1169:iadd            
	//  541 1170:istore_3        
			s2 = (new StringBuilder()).append(s4).append(s2.substring(1)).toString();
	//  542 1171:new             #149 <Class StringBuilder>
	//  543 1174:dup             
	//  544 1175:invokespecial   #150 <Method void StringBuilder()>
	//  545 1178:aload           9
	//  546 1180:invokevirtual   #154 <Method StringBuilder StringBuilder.append(String)>
	//  547 1183:aload           8
	//  548 1185:iconst_1        
	//  549 1186:invokevirtual   #183 <Method String String.substring(int)>
	//  550 1189:invokevirtual   #154 <Method StringBuilder StringBuilder.append(String)>
	//  551 1192:invokevirtual   #161 <Method String StringBuilder.toString()>
	//  552 1195:astore          8
			byte1 = byte2;
	//  553 1197:iload           6
	//  554 1199:istore          4
		} else
	//* 555 1201:goto            571
		{
			j = l + 1;
	//  556 1204:iload           5
	//  557 1206:iconst_1        
	//  558 1207:iadd            
	//  559 1208:istore_3        
			l = ((int) (s.charAt(l)));
	//  560 1209:aload_0         
	//  561 1210:iload           5
	//  562 1212:invokevirtual   #143 <Method char String.charAt(int)>
	//  563 1215:istore          5
			if(l == '\312')
	//* 564 1217:iload           5
	//* 565 1219:sipush          202
	//* 566 1222:icmpne          1254
			{
				s2 = (new StringBuilder()).append(s4).append('f').toString();
	//  567 1225:new             #149 <Class StringBuilder>
	//  568 1228:dup             
	//  569 1229:invokespecial   #150 <Method void StringBuilder()>
	//  570 1232:aload           9
	//  571 1234:invokevirtual   #154 <Method StringBuilder StringBuilder.append(String)>
	//  572 1237:bipush          102
	//  573 1239:invokevirtual   #157 <Method StringBuilder StringBuilder.append(char)>
	//  574 1242:invokevirtual   #161 <Method String StringBuilder.toString()>
	//  575 1245:astore          8
				byte1 = byte2;
	//  576 1247:iload           6
	//  577 1249:istore          4
			} else
	//* 578 1251:goto            571
			if(l < ' ')
	//* 579 1254:iload           5
	//* 580 1256:bipush          32
	//* 581 1258:icmpge          1316
			{
				byte1 = 103;
	//  582 1261:bipush          103
	//  583 1263:istore          4
				s2 = (new StringBuilder()).append(s4).append('e').toString();
	//  584 1265:new             #149 <Class StringBuilder>
	//  585 1268:dup             
	//  586 1269:invokespecial   #150 <Method void StringBuilder()>
	//  587 1272:aload           9
	//  588 1274:invokevirtual   #154 <Method StringBuilder StringBuilder.append(String)>
	//  589 1277:bipush          101
	//  590 1279:invokevirtual   #157 <Method StringBuilder StringBuilder.append(char)>
	//  591 1282:invokevirtual   #161 <Method String StringBuilder.toString()>
	//  592 1285:astore          8
				s2 = (new StringBuilder()).append(s2).append((char)(l + 64)).toString();
	//  593 1287:new             #149 <Class StringBuilder>
	//  594 1290:dup             
	//  595 1291:invokespecial   #150 <Method void StringBuilder()>
	//  596 1294:aload           8
	//  597 1296:invokevirtual   #154 <Method StringBuilder StringBuilder.append(String)>
	//  598 1299:iload           5
	//  599 1301:bipush          64
	//  600 1303:iadd            
	//  601 1304:int2char        
	//  602 1305:invokevirtual   #157 <Method StringBuilder StringBuilder.append(char)>
	//  603 1308:invokevirtual   #161 <Method String StringBuilder.toString()>
	//  604 1311:astore          8
			} else
	//* 605 1313:goto            571
			{
				byte1 = 104;
	//  606 1316:bipush          104
	//  607 1318:istore          4
				s2 = (new StringBuilder()).append(s4).append('d').toString();
	//  608 1320:new             #149 <Class StringBuilder>
	//  609 1323:dup             
	//  610 1324:invokespecial   #150 <Method void StringBuilder()>
	//  611 1327:aload           9
	//  612 1329:invokevirtual   #154 <Method StringBuilder StringBuilder.append(String)>
	//  613 1332:bipush          100
	//  614 1334:invokevirtual   #157 <Method StringBuilder StringBuilder.append(char)>
	//  615 1337:invokevirtual   #161 <Method String StringBuilder.toString()>
	//  616 1340:astore          8
				s2 = (new StringBuilder()).append(s2).append((char)(l - 32)).toString();
	//  617 1342:new             #149 <Class StringBuilder>
	//  618 1345:dup             
	//  619 1346:invokespecial   #150 <Method void StringBuilder()>
	//  620 1349:aload           8
	//  621 1351:invokevirtual   #154 <Method StringBuilder StringBuilder.append(String)>
	//  622 1354:iload           5
	//  623 1356:bipush          32
	//  624 1358:isub            
	//  625 1359:int2char        
	//  626 1360:invokevirtual   #157 <Method StringBuilder StringBuilder.append(char)>
	//  627 1363:invokevirtual   #161 <Method String StringBuilder.toString()>
	//  628 1366:astore          8
			}
		}
		  goto _L7
	//* 629 1368:goto            571
		return s4;
	//  630 1371:aload           9
	//  631 1373:areturn         
	}

	static boolean isNextDigits(String s, int i, int j)
	{
		int l = s.length();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #147 <Method int String.length()>
	//    2    4:istore          4
_L2:
		int k;
		do
		{
			if(i >= l || j <= 0)
				break MISSING_BLOCK_LABEL_92;
	//    3    6:iload_1         
	//    4    7:iload           4
	//    5    9:icmpge          92
	//    6   12:iload_2         
	//    7   13:ifle            92
			if(s.charAt(i) != '\312')
				break;
	//    8   16:aload_0         
	//    9   17:iload_1         
	//   10   18:invokevirtual   #143 <Method char String.charAt(int)>
	//   11   21:sipush          202
	//   12   24:icmpne          34
			i++;
	//   13   27:iload_1         
	//   14   28:iconst_1        
	//   15   29:iadd            
	//   16   30:istore_1        
		} while(true);
	//   17   31:goto            6
		k = Math.min(2, j);
	//   18   34:iconst_2        
	//   19   35:iload_2         
	//   20   36:invokestatic    #244 <Method int Math.min(int, int)>
	//   21   39:istore_3        
		if(i + k <= l)
			continue; /* Loop/switch isn't completed */
	//   22   40:iload_1         
	//   23   41:iload_3         
	//   24   42:iadd            
	//   25   43:iload           4
	//   26   45:icmple          98
_L4:
		return false;
	//   27   48:iconst_0        
	//   28   49:ireturn         
_L6:
		j--;
	//   29   50:iload_2         
	//   30   51:iconst_1        
	//   31   52:isub            
	//   32   53:istore_2        
		k--;
	//   33   54:iload_3         
	//   34   55:iconst_1        
	//   35   56:isub            
	//   36   57:istore_3        
		i++;
	//   37   58:iload_1         
	//   38   59:iconst_1        
	//   39   60:iadd            
	//   40   61:istore_1        
		if(k <= 0) goto _L2; else goto _L1
	//   41   62:iload_3         
	//   42   63:ifle            89
_L1:
		char c = s.charAt(i);
	//   43   66:aload_0         
	//   44   67:iload_1         
	//   45   68:invokevirtual   #143 <Method char String.charAt(int)>
	//   46   71:istore          5
		if(c < '0') goto _L4; else goto _L3
	//   47   73:iload           5
	//   48   75:bipush          48
	//   49   77:icmplt          48
_L3:
		if(c <= '9') goto _L6; else goto _L5
	//   50   80:iload           5
	//   51   82:bipush          57
	//   52   84:icmple          50
_L5:
		return false;
	//   53   87:iconst_0        
	//   54   88:ireturn         
	//*  55   89:goto            6
		if(j == 0)
	//*  56   92:iload_2         
	//*  57   93:ifne            48
			return true;
	//   58   96:iconst_1        
	//   59   97:ireturn         
		  goto _L4
	//*  60   98:goto            62
	}

	public static String removeFNC1(String s)
	{
		int j = s.length();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #147 <Method int String.length()>
	//    2    4:istore_3        
		StringBuffer stringbuffer = new StringBuffer(j);
	//    3    5:new             #171 <Class StringBuffer>
	//    4    8:dup             
	//    5    9:iload_3         
	//    6   10:invokespecial   #247 <Method void StringBuffer(int)>
	//    7   13:astore          4
		for(int i = 0; i < j; i++)
	//*   8   15:iconst_0        
	//*   9   16:istore_2        
	//*  10   17:iload_2         
	//*  11   18:iload_3         
	//*  12   19:icmpge          54
		{
			char c = s.charAt(i);
	//   13   22:aload_0         
	//   14   23:iload_2         
	//   15   24:invokevirtual   #143 <Method char String.charAt(int)>
	//   16   27:istore_1        
			if(c >= ' ' && c <= '~')
	//*  17   28:iload_1         
	//*  18   29:bipush          32
	//*  19   31:icmplt          47
	//*  20   34:iload_1         
	//*  21   35:bipush          126
	//*  22   37:icmpgt          47
				stringbuffer.append(c);
	//   23   40:aload           4
	//   24   42:iload_1         
	//   25   43:invokevirtual   #202 <Method StringBuffer StringBuffer.append(char)>
	//   26   46:pop             
		}

	//   27   47:iload_2         
	//   28   48:iconst_1        
	//   29   49:iadd            
	//   30   50:istore_2        
	//*  31   51:goto            17
		return stringbuffer.toString();
	//   32   54:aload           4
	//   33   56:invokevirtual   #190 <Method String StringBuffer.toString()>
	//   34   59:areturn         
	}

	public Rectangle getBarcodeSize()
	{
		boolean flag = false;
	//    0    0:iconst_0        
	//    1    1:istore          5
		float f = 0.0F;
	//    2    3:fconst_0        
	//    3    4:fstore_1        
		float f1 = 0.0F;
	//    4    5:fconst_0        
	//    5    6:fstore_2        
		String s;
		if(font != null)
	//*   6    7:aload_0         
	//*   7    8:getfield        #103 <Field BaseFont font>
	//*   8   11:ifnull          105
		{
			if(baseline > 0.0F)
	//*   9   14:aload_0         
	//*  10   15:getfield        #110 <Field float baseline>
	//*  11   18:fconst_0        
	//*  12   19:fcmpl           
	//*  13   20:ifle            183
				f = baseline - font.getFontDescriptor(3, size);
	//   14   23:aload_0         
	//   15   24:getfield        #110 <Field float baseline>
	//   16   27:aload_0         
	//   17   28:getfield        #103 <Field BaseFont font>
	//   18   31:iconst_3        
	//   19   32:aload_0         
	//   20   33:getfield        #107 <Field float size>
	//   21   36:invokevirtual   #253 <Method float BaseFont.getFontDescriptor(int, float)>
	//   22   39:fsub            
	//   23   40:fstore_1        
			else
	//*  24   41:aload_0         
	//*  25   42:getfield        #121 <Field int codeType>
	//*  26   45:bipush          11
	//*  27   47:icmpne          213
	//*  28   50:aload_0         
	//*  29   51:getfield        #257 <Field String code>
	//*  30   54:ldc1            #129 <Int 65535>
	//*  31   56:invokevirtual   #135 <Method int String.indexOf(int)>
	//*  32   59:istore          4
	//*  33   61:iload           4
	//*  34   63:ifge            197
	//*  35   66:ldc1            #206 <String "">
	//*  36   68:astore          6
	//*  37   70:aload_0         
	//*  38   71:getfield        #103 <Field BaseFont font>
	//*  39   74:astore          7
	//*  40   76:aload_0         
	//*  41   77:getfield        #260 <Field String altText>
	//*  42   80:ifnull          89
	//*  43   83:aload_0         
	//*  44   84:getfield        #260 <Field String altText>
	//*  45   87:astore          6
	//*  46   89:aload           7
	//*  47   91:aload           6
	//*  48   93:aload_0         
	//*  49   94:getfield        #107 <Field float size>
	//*  50   97:invokevirtual   #264 <Method float BaseFont.getWidthPoint(String, float)>
	//*  51  100:fstore_3        
	//*  52  101:fload_1         
	//*  53  102:fstore_2        
	//*  54  103:fload_3         
	//*  55  104:fstore_1        
	//*  56  105:aload_0         
	//*  57  106:getfield        #121 <Field int codeType>
	//*  58  109:bipush          11
	//*  59  111:icmpne          255
	//*  60  114:aload_0         
	//*  61  115:getfield        #257 <Field String code>
	//*  62  118:ldc1            #129 <Int 65535>
	//*  63  120:invokevirtual   #135 <Method int String.indexOf(int)>
	//*  64  123:istore          4
	//*  65  125:iload           4
	//*  66  127:iflt            246
	//*  67  130:aload_0         
	//*  68  131:getfield        #257 <Field String code>
	//*  69  134:iconst_0        
	//*  70  135:iload           4
	//*  71  137:invokevirtual   #139 <Method String String.substring(int, int)>
	//*  72  140:astore          6
	//*  73  142:new             #266 <Class Rectangle>
	//*  74  145:dup             
	//*  75  146:aload           6
	//*  76  148:invokevirtual   #147 <Method int String.length()>
	//*  77  151:iconst_2        
	//*  78  152:iadd            
	//*  79  153:bipush          11
	//*  80  155:imul            
	//*  81  156:i2f             
	//*  82  157:aload_0         
	//*  83  158:getfield        #89  <Field float x>
	//*  84  161:fmul            
	//*  85  162:fconst_2        
	//*  86  163:aload_0         
	//*  87  164:getfield        #89  <Field float x>
	//*  88  167:fmul            
	//*  89  168:fadd            
	//*  90  169:fload_1         
	//*  91  170:invokestatic    #270 <Method float Math.max(float, float)>
	//*  92  173:aload_0         
	//*  93  174:getfield        #114 <Field float barHeight>
	//*  94  177:fload_2         
	//*  95  178:fadd            
	//*  96  179:invokespecial   #273 <Method void Rectangle(float, float)>
	//*  97  182:areturn         
				f = -baseline + size;
	//   98  183:aload_0         
	//   99  184:getfield        #110 <Field float baseline>
	//  100  187:fneg            
	//  101  188:aload_0         
	//  102  189:getfield        #107 <Field float size>
	//  103  192:fadd            
	//  104  193:fstore_1        
			if(codeType == 11)
			{
				int i = code.indexOf('\uFFFF');
				float f2;
				BaseFont basefont;
				if(i < 0)
					s = "";
				else
	//* 105  194:goto            41
					s = code.substring(i + 1);
	//  106  197:aload_0         
	//  107  198:getfield        #257 <Field String code>
	//  108  201:iload           4
	//  109  203:iconst_1        
	//  110  204:iadd            
	//  111  205:invokevirtual   #183 <Method String String.substring(int)>
	//  112  208:astore          6
			} else
	//* 113  210:goto            70
			if(codeType == 10)
	//* 114  213:aload_0         
	//* 115  214:getfield        #121 <Field int codeType>
	//* 116  217:bipush          10
	//* 117  219:icmpne          234
				s = getHumanReadableUCCEAN(code);
	//  118  222:aload_0         
	//  119  223:getfield        #257 <Field String code>
	//  120  226:invokestatic    #275 <Method String getHumanReadableUCCEAN(String)>
	//  121  229:astore          6
			else
	//* 122  231:goto            70
				s = removeFNC1(code);
	//  123  234:aload_0         
	//  124  235:getfield        #257 <Field String code>
	//  125  238:invokestatic    #186 <Method String removeFNC1(String)>
	//  126  241:astore          6
			basefont = font;
			if(altText != null)
				s = altText;
			f2 = basefont.getWidthPoint(s, size);
			f1 = f;
			f = f2;
		}
		if(codeType == 11)
		{
			i = code.indexOf('\uFFFF');
			if(i >= 0)
				s = code.substring(0, i);
			else
	//* 127  243:goto            70
				s = code;
	//  128  246:aload_0         
	//  129  247:getfield        #257 <Field String code>
	//  130  250:astore          6
		} else
	//* 131  252:goto            142
		{
			s = code;
	//  132  255:aload_0         
	//  133  256:getfield        #257 <Field String code>
	//  134  259:astore          6
			if(codeType == 10)
	//* 135  261:aload_0         
	//* 136  262:getfield        #121 <Field int codeType>
	//* 137  265:bipush          10
	//* 138  267:icmpne          273
				flag = true;
	//  139  270:iconst_1        
	//  140  271:istore          5
			s = getRawText(s, flag, codeSet);
	//  141  273:aload           6
	//  142  275:iload           5
	//  143  277:aload_0         
	//  144  278:getfield        #84  <Field Barcode128$Barcode128CodeSet codeSet>
	//  145  281:invokestatic    #214 <Method String getRawText(String, boolean, Barcode128$Barcode128CodeSet)>
	//  146  284:astore          6
		}
		return new Rectangle(Math.max((float)((s.length() + 2) * 11) * x + 2.0F * x, f), barHeight + f1);
	//* 147  286:goto            142
	}

	public Barcode128CodeSet getCodeSet()
	{
		return codeSet;
	//    0    0:aload_0         
	//    1    1:getfield        #84  <Field Barcode128$Barcode128CodeSet codeSet>
	//    2    4:areturn         
	}

	public Rectangle placeBarcode(PdfContentByte pdfcontentbyte, BaseColor basecolor, BaseColor basecolor1)
	{
		float f1;
		float f2;
		float f3;
		int i;
		Object obj1;
		float f;
		float f4;
		float f5;
		Object obj;
		if(codeType == 11)
	//*   0    0:aload_0         
	//*   1    1:getfield        #121 <Field int codeType>
	//*   2    4:bipush          11
	//*   3    6:icmpne          353
		{
			i = code.indexOf('\uFFFF');
	//    4    9:aload_0         
	//    5   10:getfield        #257 <Field String code>
	//    6   13:ldc1            #129 <Int 65535>
	//    7   15:invokevirtual   #135 <Method int String.indexOf(int)>
	//    8   18:istore          10
			int j;
			if(i < 0)
	//*   9   20:iload           10
	//*  10   22:ifge            337
				obj = "";
	//   11   25:ldc1            #206 <String "">
	//   12   27:astore          13
			else
	//*  13   29:fconst_0        
	//*  14   30:fstore          6
	//*  15   32:aload           13
	//*  16   34:astore          14
	//*  17   36:aload_0         
	//*  18   37:getfield        #103 <Field BaseFont font>
	//*  19   40:ifnull          79
	//*  20   43:aload_0         
	//*  21   44:getfield        #103 <Field BaseFont font>
	//*  22   47:astore          14
	//*  23   49:aload_0         
	//*  24   50:getfield        #260 <Field String altText>
	//*  25   53:ifnull          62
	//*  26   56:aload_0         
	//*  27   57:getfield        #260 <Field String altText>
	//*  28   60:astore          13
	//*  29   62:aload           14
	//*  30   64:aload           13
	//*  31   66:aload_0         
	//*  32   67:getfield        #107 <Field float size>
	//*  33   70:invokevirtual   #264 <Method float BaseFont.getWidthPoint(String, float)>
	//*  34   73:fstore          6
	//*  35   75:aload           13
	//*  36   77:astore          14
	//*  37   79:aload_0         
	//*  38   80:getfield        #121 <Field int codeType>
	//*  39   83:bipush          11
	//*  40   85:icmpne          395
	//*  41   88:aload_0         
	//*  42   89:getfield        #257 <Field String code>
	//*  43   92:ldc1            #129 <Int 65535>
	//*  44   94:invokevirtual   #135 <Method int String.indexOf(int)>
	//*  45   97:istore          10
	//*  46   99:iload           10
	//*  47  101:iflt            386
	//*  48  104:aload_0         
	//*  49  105:getfield        #257 <Field String code>
	//*  50  108:iconst_0        
	//*  51  109:iload           10
	//*  52  111:invokevirtual   #139 <Method String String.substring(int, int)>
	//*  53  114:astore          13
	//*  54  116:aload           13
	//*  55  118:invokevirtual   #147 <Method int String.length()>
	//*  56  121:iconst_2        
	//*  57  122:iadd            
	//*  58  123:bipush          11
	//*  59  125:imul            
	//*  60  126:i2f             
	//*  61  127:aload_0         
	//*  62  128:getfield        #89  <Field float x>
	//*  63  131:fmul            
	//*  64  132:fconst_2        
	//*  65  133:aload_0         
	//*  66  134:getfield        #89  <Field float x>
	//*  67  137:fmul            
	//*  68  138:fadd            
	//*  69  139:fstore          9
	//*  70  141:fconst_0        
	//*  71  142:fstore          7
	//*  72  144:fconst_0        
	//*  73  145:fstore          8
	//*  74  147:fload           7
	//*  75  149:fstore          4
	//*  76  151:fload           8
	//*  77  153:fstore          5
	//*  78  155:aload_0         
	//*  79  156:getfield        #118 <Field int textAlignment>
	//*  80  159:tableswitch     0 2: default 184
	//	               0 205
	//	               1 184
	//	               2 435
	//*  81  184:fload           6
	//*  82  186:fload           9
	//*  83  188:fcmpl           
	//*  84  189:ifle            471
	//*  85  192:fload           6
	//*  86  194:fload           9
	//*  87  196:fsub            
	//*  88  197:fconst_2        
	//*  89  198:fdiv            
	//*  90  199:fstore          4
	//*  91  201:fload           8
	//*  92  203:fstore          5
	//*  93  205:fconst_0        
	//*  94  206:fstore          8
	//*  95  208:fconst_0        
	//*  96  209:fstore          6
	//*  97  211:fload           8
	//*  98  213:fstore          7
	//*  99  215:aload_0         
	//* 100  216:getfield        #103 <Field BaseFont font>
	//* 101  219:ifnull          246
	//* 102  222:aload_0         
	//* 103  223:getfield        #110 <Field float baseline>
	//* 104  226:fconst_0        
	//* 105  227:fcmpg           
	//* 106  228:ifgt            487
	//* 107  231:aload_0         
	//* 108  232:getfield        #114 <Field float barHeight>
	//* 109  235:aload_0         
	//* 110  236:getfield        #110 <Field float baseline>
	//* 111  239:fsub            
	//* 112  240:fstore          6
	//* 113  242:fload           8
	//* 114  244:fstore          7
	//* 115  246:aload           13
	//* 116  248:invokestatic    #281 <Method byte[] getBarsCode128Raw(String)>
	//* 117  251:astore          13
	//* 118  253:iconst_1        
	//* 119  254:istore          10
	//* 120  256:aload_2         
	//* 121  257:ifnull          265
	//* 122  260:aload_1         
	//* 123  261:aload_2         
	//* 124  262:invokevirtual   #287 <Method void PdfContentByte.setColorFill(BaseColor)>
	//* 125  265:iconst_0        
	//* 126  266:istore          11
	//* 127  268:iload           11
	//* 128  270:aload           13
	//* 129  272:arraylength     
	//* 130  273:icmpge          520
	//* 131  276:aload           13
	//* 132  278:iload           11
	//* 133  280:baload          
	//* 134  281:i2f             
	//* 135  282:aload_0         
	//* 136  283:getfield        #89  <Field float x>
	//* 137  286:fmul            
	//* 138  287:fstore          8
	//* 139  289:iload           10
	//* 140  291:ifeq            313
	//* 141  294:aload_1         
	//* 142  295:fload           4
	//* 143  297:fload           7
	//* 144  299:fload           8
	//* 145  301:aload_0         
	//* 146  302:getfield        #290 <Field float inkSpreading>
	//* 147  305:fsub            
	//* 148  306:aload_0         
	//* 149  307:getfield        #114 <Field float barHeight>
	//* 150  310:invokevirtual   #294 <Method void PdfContentByte.rectangle(float, float, float, float)>
	//* 151  313:iload           10
	//* 152  315:ifne            514
	//* 153  318:iconst_1        
	//* 154  319:istore          10
	//* 155  321:fload           4
	//* 156  323:fload           8
	//* 157  325:fadd            
	//* 158  326:fstore          4
	//* 159  328:iload           11
	//* 160  330:iconst_1        
	//* 161  331:iadd            
	//* 162  332:istore          11
	//* 163  334:goto            268
				obj = ((Object) (code.substring(i + 1)));
	//  164  337:aload_0         
	//  165  338:getfield        #257 <Field String code>
	//  166  341:iload           10
	//  167  343:iconst_1        
	//  168  344:iadd            
	//  169  345:invokevirtual   #183 <Method String String.substring(int)>
	//  170  348:astore          13
		} else
	//* 171  350:goto            29
		if(codeType == 10)
	//* 172  353:aload_0         
	//* 173  354:getfield        #121 <Field int codeType>
	//* 174  357:bipush          10
	//* 175  359:icmpne          374
			obj = ((Object) (getHumanReadableUCCEAN(code)));
	//  176  362:aload_0         
	//  177  363:getfield        #257 <Field String code>
	//  178  366:invokestatic    #275 <Method String getHumanReadableUCCEAN(String)>
	//  179  369:astore          13
		else
	//* 180  371:goto            29
			obj = ((Object) (removeFNC1(code)));
	//  181  374:aload_0         
	//  182  375:getfield        #257 <Field String code>
	//  183  378:invokestatic    #186 <Method String removeFNC1(String)>
	//  184  381:astore          13
		f2 = 0.0F;
		obj1 = obj;
		if(font != null)
		{
			obj1 = ((Object) (font));
			if(altText != null)
				obj = ((Object) (altText));
			f2 = ((BaseFont) (obj1)).getWidthPoint(((String) (obj)), size);
			obj1 = obj;
		}
		if(codeType == 11)
		{
			i = code.indexOf('\uFFFF');
			if(i >= 0)
				obj = ((Object) (code.substring(0, i)));
			else
	//* 185  383:goto            29
				obj = ((Object) (code));
	//  186  386:aload_0         
	//  187  387:getfield        #257 <Field String code>
	//  188  390:astore          13
		} else
	//* 189  392:goto            116
		{
			obj = ((Object) (code));
	//  190  395:aload_0         
	//  191  396:getfield        #257 <Field String code>
	//  192  399:astore          13
			boolean flag;
			if(codeType == 10)
	//* 193  401:aload_0         
	//* 194  402:getfield        #121 <Field int codeType>
	//* 195  405:bipush          10
	//* 196  407:icmpne          429
				flag = true;
	//  197  410:iconst_1        
	//  198  411:istore          12
			else
	//* 199  413:aload           13
	//* 200  415:iload           12
	//* 201  417:aload_0         
	//* 202  418:getfield        #84  <Field Barcode128$Barcode128CodeSet codeSet>
	//* 203  421:invokestatic    #214 <Method String getRawText(String, boolean, Barcode128$Barcode128CodeSet)>
	//* 204  424:astore          13
	//* 205  426:goto            116
				flag = false;
	//  206  429:iconst_0        
	//  207  430:istore          12
			obj = ((Object) (getRawText(((String) (obj)), flag, codeSet)));
		}
		f5 = (float)((((String) (obj)).length() + 2) * 11) * x + 2.0F * x;
		f3 = 0.0F;
		f4 = 0.0F;
		f = f3;
		f1 = f4;
		switch(textAlignment)
		{
		case 1: // '\001'
		default:
			if(f2 > f5)
			{
				f = (f2 - f5) / 2.0F;
				f1 = f4;
			} else
	//* 208  432:goto            413
	//* 209  435:fload           6
	//* 210  437:fload           9
	//* 211  439:fcmpl           
	//* 212  440:ifle            457
	//* 213  443:fload           6
	//* 214  445:fload           9
	//* 215  447:fsub            
	//* 216  448:fstore          4
	//* 217  450:fload           8
	//* 218  452:fstore          5
	//* 219  454:goto            205
	//* 220  457:fload           9
	//* 221  459:fload           6
	//* 222  461:fsub            
	//* 223  462:fstore          5
	//* 224  464:fload           7
	//* 225  466:fstore          4
	//* 226  468:goto            205
			{
				f1 = (f5 - f2) / 2.0F;
	//  227  471:fload           9
	//  228  473:fload           6
	//  229  475:fsub            
	//  230  476:fconst_2        
	//  231  477:fdiv            
	//  232  478:fstore          5
				f = f3;
	//  233  480:fload           7
	//  234  482:fstore          4
			}
			break;

		case 0: // '\0'
			break;

		case 2: // '\002'
			break MISSING_BLOCK_LABEL_435;
		}
		f4 = 0.0F;
		f2 = 0.0F;
		f3 = f4;
		if(font != null)
			if(baseline <= 0.0F)
			{
				f2 = barHeight - baseline;
				f3 = f4;
			} else
	//* 235  484:goto            205
			{
				f2 = -font.getFontDescriptor(3, size);
	//  236  487:aload_0         
	//  237  488:getfield        #103 <Field BaseFont font>
	//  238  491:iconst_3        
	//  239  492:aload_0         
	//  240  493:getfield        #107 <Field float size>
	//  241  496:invokevirtual   #253 <Method float BaseFont.getFontDescriptor(int, float)>
	//  242  499:fneg            
	//  243  500:fstore          6
				f3 = f2 + baseline;
	//  244  502:fload           6
	//  245  504:aload_0         
	//  246  505:getfield        #110 <Field float baseline>
	//  247  508:fadd            
	//  248  509:fstore          7
			}
		obj = ((Object) (getBarsCode128Raw(((String) (obj)))));
		i = 1;
		if(basecolor != null)
			pdfcontentbyte.setColorFill(basecolor);
		j = 0;
		while(j < obj.length) 
		{
			f4 = (float)obj[j] * x;
			if(i != 0)
				pdfcontentbyte.rectangle(f, f3, f4 - inkSpreading, barHeight);
			if(i == 0)
				i = 1;
			else
	//* 249  511:goto            246
				i = 0;
	//  250  514:iconst_0        
	//  251  515:istore          10
			f += f4;
			j++;
		}
		break MISSING_BLOCK_LABEL_520;
	//  252  517:goto            321
		if(f2 > f5)
		{
			f = f2 - f5;
			f1 = f4;
		} else
		{
			f1 = f5 - f2;
			f = f3;
		}
		break MISSING_BLOCK_LABEL_205;
		pdfcontentbyte.fill();
	//  253  520:aload_1         
	//  254  521:invokevirtual   #297 <Method void PdfContentByte.fill()>
		if(font != null)
	//* 255  524:aload_0         
	//* 256  525:getfield        #103 <Field BaseFont font>
	//* 257  528:ifnull          574
		{
			if(basecolor1 != null)
	//* 258  531:aload_3         
	//* 259  532:ifnull          540
				pdfcontentbyte.setColorFill(basecolor1);
	//  260  535:aload_1         
	//  261  536:aload_3         
	//  262  537:invokevirtual   #287 <Method void PdfContentByte.setColorFill(BaseColor)>
			pdfcontentbyte.beginText();
	//  263  540:aload_1         
	//  264  541:invokevirtual   #300 <Method void PdfContentByte.beginText()>
			pdfcontentbyte.setFontAndSize(font, size);
	//  265  544:aload_1         
	//  266  545:aload_0         
	//  267  546:getfield        #103 <Field BaseFont font>
	//  268  549:aload_0         
	//  269  550:getfield        #107 <Field float size>
	//  270  553:invokevirtual   #304 <Method void PdfContentByte.setFontAndSize(BaseFont, float)>
			pdfcontentbyte.setTextMatrix(f1, f2);
	//  271  556:aload_1         
	//  272  557:fload           5
	//  273  559:fload           6
	//  274  561:invokevirtual   #307 <Method void PdfContentByte.setTextMatrix(float, float)>
			pdfcontentbyte.showText(((String) (obj1)));
	//  275  564:aload_1         
	//  276  565:aload           14
	//  277  567:invokevirtual   #310 <Method void PdfContentByte.showText(String)>
			pdfcontentbyte.endText();
	//  278  570:aload_1         
	//  279  571:invokevirtual   #313 <Method void PdfContentByte.endText()>
		}
		return getBarcodeSize();
	//  280  574:aload_0         
	//  281  575:invokevirtual   #315 <Method Rectangle getBarcodeSize()>
	//  282  578:areturn         
	}

	public void setCode(String s)
	{
		if(getCodeType() == 10 && s.startsWith("("))
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #319 <Method int getCodeType()>
	//*   2    4:bipush          10
	//*   3    6:icmpne          324
	//*   4    9:aload_1         
	//*   5   10:ldc2            #321 <String "(">
	//*   6   13:invokevirtual   #180 <Method boolean String.startsWith(String)>
	//*   7   16:ifeq            324
		{
			int j = 0;
	//    8   19:iconst_0        
	//    9   20:istore_3        
			StringBuilder stringbuilder = new StringBuilder("");
	//   10   21:new             #149 <Class StringBuilder>
	//   11   24:dup             
	//   12   25:ldc1            #206 <String "">
	//   13   27:invokespecial   #209 <Method void StringBuilder(String)>
	//   14   30:astore          9
			while(j >= 0) 
	//*  15   32:iload_3         
	//*  16   33:iflt            314
			{
				int l = s.indexOf(')', j);
	//   17   36:aload_1         
	//   18   37:bipush          41
	//   19   39:iload_3         
	//   20   40:invokevirtual   #323 <Method int String.indexOf(int, int)>
	//   21   43:istore          5
				if(l < 0)
	//*  22   45:iload           5
	//*  23   47:ifge            72
					throw new IllegalArgumentException(MessageLocalization.getComposedMessage("badly.formed.ucc.string.1", new Object[] {
						s
					}));
	//   24   50:new             #325 <Class IllegalArgumentException>
	//   25   53:dup             
	//   26   54:ldc2            #327 <String "badly.formed.ucc.string.1">
	//   27   57:iconst_1        
	//   28   58:anewarray       Object[]
	//   29   61:dup             
	//   30   62:iconst_0        
	//   31   63:aload_1         
	//   32   64:aastore         
	//   33   65:invokestatic    #230 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   34   68:invokespecial   #328 <Method void IllegalArgumentException(String)>
	//   35   71:athrow          
				String s1 = s.substring(j + 1, l);
	//   36   72:aload_1         
	//   37   73:iload_3         
	//   38   74:iconst_1        
	//   39   75:iadd            
	//   40   76:iload           5
	//   41   78:invokevirtual   #139 <Method String String.substring(int, int)>
	//   42   81:astore          7
				if(s1.length() < 2)
	//*  43   83:aload           7
	//*  44   85:invokevirtual   #147 <Method int String.length()>
	//*  45   88:iconst_2        
	//*  46   89:icmpge          115
					throw new IllegalArgumentException(MessageLocalization.getComposedMessage("ai.too.short.1", new Object[] {
						s1
					}));
	//   47   92:new             #325 <Class IllegalArgumentException>
	//   48   95:dup             
	//   49   96:ldc2            #330 <String "ai.too.short.1">
	//   50   99:iconst_1        
	//   51  100:anewarray       Object[]
	//   52  103:dup             
	//   53  104:iconst_0        
	//   54  105:aload           7
	//   55  107:aastore         
	//   56  108:invokestatic    #230 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   57  111:invokespecial   #328 <Method void IllegalArgumentException(String)>
	//   58  114:athrow          
				int i = Integer.parseInt(s1);
	//   59  115:aload           7
	//   60  117:invokestatic    #196 <Method int Integer.parseInt(String)>
	//   61  120:istore_2        
				int i1 = ais.get(i);
	//   62  121:getstatic       #71  <Field IntHashtable ais>
	//   63  124:iload_2         
	//   64  125:invokevirtual   #199 <Method int IntHashtable.get(int)>
	//   65  128:istore          6
				if(i1 == 0)
	//*  66  130:iload           6
	//*  67  132:ifne            158
					throw new IllegalArgumentException(MessageLocalization.getComposedMessage("ai.not.found.1", new Object[] {
						s1
					}));
	//   68  135:new             #325 <Class IllegalArgumentException>
	//   69  138:dup             
	//   70  139:ldc2            #332 <String "ai.not.found.1">
	//   71  142:iconst_1        
	//   72  143:anewarray       Object[]
	//   73  146:dup             
	//   74  147:iconst_0        
	//   75  148:aload           7
	//   76  150:aastore         
	//   77  151:invokestatic    #230 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   78  154:invokespecial   #328 <Method void IllegalArgumentException(String)>
	//   79  157:athrow          
				String s2 = String.valueOf(i);
	//   80  158:iload_2         
	//   81  159:invokestatic    #334 <Method String String.valueOf(int)>
	//   82  162:astore          8
				s1 = s2;
	//   83  164:aload           8
	//   84  166:astore          7
				if(s2.length() == 1)
	//*  85  168:aload           8
	//*  86  170:invokevirtual   #147 <Method int String.length()>
	//*  87  173:iconst_1        
	//*  88  174:icmpne          200
					s1 = (new StringBuilder()).append("0").append(s2).toString();
	//   89  177:new             #149 <Class StringBuilder>
	//   90  180:dup             
	//   91  181:invokespecial   #150 <Method void StringBuilder()>
	//   92  184:ldc2            #336 <String "0">
	//   93  187:invokevirtual   #154 <Method StringBuilder StringBuilder.append(String)>
	//   94  190:aload           8
	//   95  192:invokevirtual   #154 <Method StringBuilder StringBuilder.append(String)>
	//   96  195:invokevirtual   #161 <Method String StringBuilder.toString()>
	//   97  198:astore          7
				i = s.indexOf('(', l);
	//   98  200:aload_1         
	//   99  201:bipush          40
	//  100  203:iload           5
	//  101  205:invokevirtual   #323 <Method int String.indexOf(int, int)>
	//  102  208:istore_2        
				int k;
				if(i < 0)
	//* 103  209:iload_2         
	//* 104  210:ifge            265
					k = s.length();
	//  105  213:aload_1         
	//  106  214:invokevirtual   #147 <Method int String.length()>
	//  107  217:istore          4
				else
	//* 108  219:aload           9
	//* 109  221:aload           7
	//* 110  223:invokevirtual   #154 <Method StringBuilder StringBuilder.append(String)>
	//* 111  226:aload_1         
	//* 112  227:iload           5
	//* 113  229:iconst_1        
	//* 114  230:iadd            
	//* 115  231:iload           4
	//* 116  233:invokevirtual   #139 <Method String String.substring(int, int)>
	//* 117  236:invokevirtual   #154 <Method StringBuilder StringBuilder.append(String)>
	//* 118  239:pop             
	//* 119  240:iload           6
	//* 120  242:ifge            271
	//* 121  245:iload_2         
	//* 122  246:istore_3        
	//* 123  247:iload_2         
	//* 124  248:iflt            32
	//* 125  251:aload           9
	//* 126  253:sipush          202
	//* 127  256:invokevirtual   #157 <Method StringBuilder StringBuilder.append(char)>
	//* 128  259:pop             
	//* 129  260:iload_2         
	//* 130  261:istore_3        
	//* 131  262:goto            32
					k = i;
	//  132  265:iload_2         
	//  133  266:istore          4
				stringbuilder.append(s1).append(s.substring(l + 1, k));
				if(i1 < 0)
				{
					j = i;
					if(i >= 0)
					{
						stringbuilder.append('\312');
						j = i;
					}
				} else
	//* 134  268:goto            219
				{
					j = i;
	//  135  271:iload_2         
	//  136  272:istore_3        
					if((k - l - 1) + s1.length() != i1)
	//* 137  273:iload           4
	//* 138  275:iload           5
	//* 139  277:isub            
	//* 140  278:iconst_1        
	//* 141  279:isub            
	//* 142  280:aload           7
	//* 143  282:invokevirtual   #147 <Method int String.length()>
	//* 144  285:iadd            
	//* 145  286:iload           6
	//* 146  288:icmpeq          32
						throw new IllegalArgumentException(MessageLocalization.getComposedMessage("invalid.ai.length.1", new Object[] {
							s1
						}));
	//  147  291:new             #325 <Class IllegalArgumentException>
	//  148  294:dup             
	//  149  295:ldc2            #338 <String "invalid.ai.length.1">
	//  150  298:iconst_1        
	//  151  299:anewarray       Object[]
	//  152  302:dup             
	//  153  303:iconst_0        
	//  154  304:aload           7
	//  155  306:aastore         
	//  156  307:invokestatic    #230 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//  157  310:invokespecial   #328 <Method void IllegalArgumentException(String)>
	//  158  313:athrow          
				}
			}
			super.setCode(stringbuilder.toString());
	//  159  314:aload_0         
	//  160  315:aload           9
	//  161  317:invokevirtual   #161 <Method String StringBuilder.toString()>
	//  162  320:invokespecial   #340 <Method void Barcode.setCode(String)>
			return;
	//  163  323:return          
		} else
		{
			super.setCode(s);
	//  164  324:aload_0         
	//  165  325:aload_1         
	//  166  326:invokespecial   #340 <Method void Barcode.setCode(String)>
			return;
	//  167  329:return          
		}
	}

	public void setCodeSet(Barcode128CodeSet barcode128codeset)
	{
		codeSet = barcode128codeset;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #84  <Field Barcode128$Barcode128CodeSet codeSet>
	//    3    5:return          
	}

	private static final byte BARS[][];
	private static final byte BARS_STOP[] = {
		2, 3, 3, 1, 1, 1, 2
	};
	public static final char CODE_A = 200;
	public static final char CODE_AB_TO_C = 99;
	public static final char CODE_AC_TO_B = 100;
	public static final char CODE_BC_TO_A = 101;
	public static final char CODE_C = 199;
	public static final char DEL = 195;
	public static final char FNC1 = 202;
	public static final char FNC1_INDEX = 102;
	public static final char FNC2 = 197;
	public static final char FNC3 = 196;
	public static final char FNC4 = 200;
	public static final char SHIFT = 198;
	public static final char STARTA = 203;
	public static final char STARTB = 204;
	public static final char STARTC = 205;
	public static final char START_A = 103;
	public static final char START_B = 104;
	public static final char START_C = 105;
	private static final IntHashtable ais;
	private Barcode128CodeSet codeSet;

	static 
	{
		byte abyte0[] = {
			2, 1, 2, 2, 2, 2
		};
	//    0    0:bipush          6
	//    1    2:newarray        byte[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:ldc1            #56  <Int 2>
	//    5    8:bastore         
	//    6    9:dup             
	//    7   10:iconst_1        
	//    8   11:ldc1            #57  <Int 1>
	//    9   13:bastore         
	//   10   14:dup             
	//   11   15:iconst_2        
	//   12   16:ldc1            #56  <Int 2>
	//   13   18:bastore         
	//   14   19:dup             
	//   15   20:iconst_3        
	//   16   21:ldc1            #56  <Int 2>
	//   17   23:bastore         
	//   18   24:dup             
	//   19   25:iconst_4        
	//   20   26:ldc1            #56  <Int 2>
	//   21   28:bastore         
	//   22   29:dup             
	//   23   30:iconst_5        
	//   24   31:ldc1            #56  <Int 2>
	//   25   33:bastore         
	//   26   34:astore_1        
		byte abyte1[] = {
			2, 2, 2, 1, 2, 2
		};
	//   27   35:bipush          6
	//   28   37:newarray        byte[]
	//   29   39:dup             
	//   30   40:iconst_0        
	//   31   41:ldc1            #56  <Int 2>
	//   32   43:bastore         
	//   33   44:dup             
	//   34   45:iconst_1        
	//   35   46:ldc1            #56  <Int 2>
	//   36   48:bastore         
	//   37   49:dup             
	//   38   50:iconst_2        
	//   39   51:ldc1            #56  <Int 2>
	//   40   53:bastore         
	//   41   54:dup             
	//   42   55:iconst_3        
	//   43   56:ldc1            #57  <Int 1>
	//   44   58:bastore         
	//   45   59:dup             
	//   46   60:iconst_4        
	//   47   61:ldc1            #56  <Int 2>
	//   48   63:bastore         
	//   49   64:dup             
	//   50   65:iconst_5        
	//   51   66:ldc1            #56  <Int 2>
	//   52   68:bastore         
	//   53   69:astore_2        
		byte abyte2[] = {
			2, 2, 2, 2, 2, 1
		};
	//   54   70:bipush          6
	//   55   72:newarray        byte[]
	//   56   74:dup             
	//   57   75:iconst_0        
	//   58   76:ldc1            #56  <Int 2>
	//   59   78:bastore         
	//   60   79:dup             
	//   61   80:iconst_1        
	//   62   81:ldc1            #56  <Int 2>
	//   63   83:bastore         
	//   64   84:dup             
	//   65   85:iconst_2        
	//   66   86:ldc1            #56  <Int 2>
	//   67   88:bastore         
	//   68   89:dup             
	//   69   90:iconst_3        
	//   70   91:ldc1            #56  <Int 2>
	//   71   93:bastore         
	//   72   94:dup             
	//   73   95:iconst_4        
	//   74   96:ldc1            #56  <Int 2>
	//   75   98:bastore         
	//   76   99:dup             
	//   77  100:iconst_5        
	//   78  101:ldc1            #57  <Int 1>
	//   79  103:bastore         
	//   80  104:astore_3        
		byte abyte3[] = {
			1, 2, 1, 3, 2, 2
		};
	//   81  105:bipush          6
	//   82  107:newarray        byte[]
	//   83  109:dup             
	//   84  110:iconst_0        
	//   85  111:ldc1            #57  <Int 1>
	//   86  113:bastore         
	//   87  114:dup             
	//   88  115:iconst_1        
	//   89  116:ldc1            #56  <Int 2>
	//   90  118:bastore         
	//   91  119:dup             
	//   92  120:iconst_2        
	//   93  121:ldc1            #57  <Int 1>
	//   94  123:bastore         
	//   95  124:dup             
	//   96  125:iconst_3        
	//   97  126:ldc1            #58  <Int 3>
	//   98  128:bastore         
	//   99  129:dup             
	//  100  130:iconst_4        
	//  101  131:ldc1            #56  <Int 2>
	//  102  133:bastore         
	//  103  134:dup             
	//  104  135:iconst_5        
	//  105  136:ldc1            #56  <Int 2>
	//  106  138:bastore         
	//  107  139:astore          4
		byte abyte4[] = {
			1, 3, 1, 2, 2, 2
		};
	//  108  141:bipush          6
	//  109  143:newarray        byte[]
	//  110  145:dup             
	//  111  146:iconst_0        
	//  112  147:ldc1            #57  <Int 1>
	//  113  149:bastore         
	//  114  150:dup             
	//  115  151:iconst_1        
	//  116  152:ldc1            #58  <Int 3>
	//  117  154:bastore         
	//  118  155:dup             
	//  119  156:iconst_2        
	//  120  157:ldc1            #57  <Int 1>
	//  121  159:bastore         
	//  122  160:dup             
	//  123  161:iconst_3        
	//  124  162:ldc1            #56  <Int 2>
	//  125  164:bastore         
	//  126  165:dup             
	//  127  166:iconst_4        
	//  128  167:ldc1            #56  <Int 2>
	//  129  169:bastore         
	//  130  170:dup             
	//  131  171:iconst_5        
	//  132  172:ldc1            #56  <Int 2>
	//  133  174:bastore         
	//  134  175:astore          5
		byte abyte5[] = {
			1, 2, 2, 2, 1, 3
		};
	//  135  177:bipush          6
	//  136  179:newarray        byte[]
	//  137  181:dup             
	//  138  182:iconst_0        
	//  139  183:ldc1            #57  <Int 1>
	//  140  185:bastore         
	//  141  186:dup             
	//  142  187:iconst_1        
	//  143  188:ldc1            #56  <Int 2>
	//  144  190:bastore         
	//  145  191:dup             
	//  146  192:iconst_2        
	//  147  193:ldc1            #56  <Int 2>
	//  148  195:bastore         
	//  149  196:dup             
	//  150  197:iconst_3        
	//  151  198:ldc1            #56  <Int 2>
	//  152  200:bastore         
	//  153  201:dup             
	//  154  202:iconst_4        
	//  155  203:ldc1            #57  <Int 1>
	//  156  205:bastore         
	//  157  206:dup             
	//  158  207:iconst_5        
	//  159  208:ldc1            #58  <Int 3>
	//  160  210:bastore         
	//  161  211:astore          6
		byte abyte6[] = {
			1, 2, 2, 3, 1, 2
		};
	//  162  213:bipush          6
	//  163  215:newarray        byte[]
	//  164  217:dup             
	//  165  218:iconst_0        
	//  166  219:ldc1            #57  <Int 1>
	//  167  221:bastore         
	//  168  222:dup             
	//  169  223:iconst_1        
	//  170  224:ldc1            #56  <Int 2>
	//  171  226:bastore         
	//  172  227:dup             
	//  173  228:iconst_2        
	//  174  229:ldc1            #56  <Int 2>
	//  175  231:bastore         
	//  176  232:dup             
	//  177  233:iconst_3        
	//  178  234:ldc1            #58  <Int 3>
	//  179  236:bastore         
	//  180  237:dup             
	//  181  238:iconst_4        
	//  182  239:ldc1            #57  <Int 1>
	//  183  241:bastore         
	//  184  242:dup             
	//  185  243:iconst_5        
	//  186  244:ldc1            #56  <Int 2>
	//  187  246:bastore         
	//  188  247:astore          7
		byte abyte7[] = {
			1, 3, 2, 2, 1, 2
		};
	//  189  249:bipush          6
	//  190  251:newarray        byte[]
	//  191  253:dup             
	//  192  254:iconst_0        
	//  193  255:ldc1            #57  <Int 1>
	//  194  257:bastore         
	//  195  258:dup             
	//  196  259:iconst_1        
	//  197  260:ldc1            #58  <Int 3>
	//  198  262:bastore         
	//  199  263:dup             
	//  200  264:iconst_2        
	//  201  265:ldc1            #56  <Int 2>
	//  202  267:bastore         
	//  203  268:dup             
	//  204  269:iconst_3        
	//  205  270:ldc1            #56  <Int 2>
	//  206  272:bastore         
	//  207  273:dup             
	//  208  274:iconst_4        
	//  209  275:ldc1            #57  <Int 1>
	//  210  277:bastore         
	//  211  278:dup             
	//  212  279:iconst_5        
	//  213  280:ldc1            #56  <Int 2>
	//  214  282:bastore         
	//  215  283:astore          8
		byte abyte8[] = {
			2, 2, 1, 2, 1, 3
		};
	//  216  285:bipush          6
	//  217  287:newarray        byte[]
	//  218  289:dup             
	//  219  290:iconst_0        
	//  220  291:ldc1            #56  <Int 2>
	//  221  293:bastore         
	//  222  294:dup             
	//  223  295:iconst_1        
	//  224  296:ldc1            #56  <Int 2>
	//  225  298:bastore         
	//  226  299:dup             
	//  227  300:iconst_2        
	//  228  301:ldc1            #57  <Int 1>
	//  229  303:bastore         
	//  230  304:dup             
	//  231  305:iconst_3        
	//  232  306:ldc1            #56  <Int 2>
	//  233  308:bastore         
	//  234  309:dup             
	//  235  310:iconst_4        
	//  236  311:ldc1            #57  <Int 1>
	//  237  313:bastore         
	//  238  314:dup             
	//  239  315:iconst_5        
	//  240  316:ldc1            #58  <Int 3>
	//  241  318:bastore         
	//  242  319:astore          9
		byte abyte9[] = {
			2, 2, 1, 3, 1, 2
		};
	//  243  321:bipush          6
	//  244  323:newarray        byte[]
	//  245  325:dup             
	//  246  326:iconst_0        
	//  247  327:ldc1            #56  <Int 2>
	//  248  329:bastore         
	//  249  330:dup             
	//  250  331:iconst_1        
	//  251  332:ldc1            #56  <Int 2>
	//  252  334:bastore         
	//  253  335:dup             
	//  254  336:iconst_2        
	//  255  337:ldc1            #57  <Int 1>
	//  256  339:bastore         
	//  257  340:dup             
	//  258  341:iconst_3        
	//  259  342:ldc1            #58  <Int 3>
	//  260  344:bastore         
	//  261  345:dup             
	//  262  346:iconst_4        
	//  263  347:ldc1            #57  <Int 1>
	//  264  349:bastore         
	//  265  350:dup             
	//  266  351:iconst_5        
	//  267  352:ldc1            #56  <Int 2>
	//  268  354:bastore         
	//  269  355:astore          10
		byte abyte10[] = {
			2, 3, 1, 2, 1, 2
		};
	//  270  357:bipush          6
	//  271  359:newarray        byte[]
	//  272  361:dup             
	//  273  362:iconst_0        
	//  274  363:ldc1            #56  <Int 2>
	//  275  365:bastore         
	//  276  366:dup             
	//  277  367:iconst_1        
	//  278  368:ldc1            #58  <Int 3>
	//  279  370:bastore         
	//  280  371:dup             
	//  281  372:iconst_2        
	//  282  373:ldc1            #57  <Int 1>
	//  283  375:bastore         
	//  284  376:dup             
	//  285  377:iconst_3        
	//  286  378:ldc1            #56  <Int 2>
	//  287  380:bastore         
	//  288  381:dup             
	//  289  382:iconst_4        
	//  290  383:ldc1            #57  <Int 1>
	//  291  385:bastore         
	//  292  386:dup             
	//  293  387:iconst_5        
	//  294  388:ldc1            #56  <Int 2>
	//  295  390:bastore         
	//  296  391:astore          11
		byte abyte11[] = {
			1, 2, 2, 1, 3, 2
		};
	//  297  393:bipush          6
	//  298  395:newarray        byte[]
	//  299  397:dup             
	//  300  398:iconst_0        
	//  301  399:ldc1            #57  <Int 1>
	//  302  401:bastore         
	//  303  402:dup             
	//  304  403:iconst_1        
	//  305  404:ldc1            #56  <Int 2>
	//  306  406:bastore         
	//  307  407:dup             
	//  308  408:iconst_2        
	//  309  409:ldc1            #56  <Int 2>
	//  310  411:bastore         
	//  311  412:dup             
	//  312  413:iconst_3        
	//  313  414:ldc1            #57  <Int 1>
	//  314  416:bastore         
	//  315  417:dup             
	//  316  418:iconst_4        
	//  317  419:ldc1            #58  <Int 3>
	//  318  421:bastore         
	//  319  422:dup             
	//  320  423:iconst_5        
	//  321  424:ldc1            #56  <Int 2>
	//  322  426:bastore         
	//  323  427:astore          12
		byte abyte12[] = {
			1, 2, 2, 2, 3, 1
		};
	//  324  429:bipush          6
	//  325  431:newarray        byte[]
	//  326  433:dup             
	//  327  434:iconst_0        
	//  328  435:ldc1            #57  <Int 1>
	//  329  437:bastore         
	//  330  438:dup             
	//  331  439:iconst_1        
	//  332  440:ldc1            #56  <Int 2>
	//  333  442:bastore         
	//  334  443:dup             
	//  335  444:iconst_2        
	//  336  445:ldc1            #56  <Int 2>
	//  337  447:bastore         
	//  338  448:dup             
	//  339  449:iconst_3        
	//  340  450:ldc1            #56  <Int 2>
	//  341  452:bastore         
	//  342  453:dup             
	//  343  454:iconst_4        
	//  344  455:ldc1            #58  <Int 3>
	//  345  457:bastore         
	//  346  458:dup             
	//  347  459:iconst_5        
	//  348  460:ldc1            #57  <Int 1>
	//  349  462:bastore         
	//  350  463:astore          13
		byte abyte13[] = {
			1, 1, 3, 2, 2, 2
		};
	//  351  465:bipush          6
	//  352  467:newarray        byte[]
	//  353  469:dup             
	//  354  470:iconst_0        
	//  355  471:ldc1            #57  <Int 1>
	//  356  473:bastore         
	//  357  474:dup             
	//  358  475:iconst_1        
	//  359  476:ldc1            #57  <Int 1>
	//  360  478:bastore         
	//  361  479:dup             
	//  362  480:iconst_2        
	//  363  481:ldc1            #58  <Int 3>
	//  364  483:bastore         
	//  365  484:dup             
	//  366  485:iconst_3        
	//  367  486:ldc1            #56  <Int 2>
	//  368  488:bastore         
	//  369  489:dup             
	//  370  490:iconst_4        
	//  371  491:ldc1            #56  <Int 2>
	//  372  493:bastore         
	//  373  494:dup             
	//  374  495:iconst_5        
	//  375  496:ldc1            #56  <Int 2>
	//  376  498:bastore         
	//  377  499:astore          14
		byte abyte14[] = {
			1, 2, 3, 1, 2, 2
		};
	//  378  501:bipush          6
	//  379  503:newarray        byte[]
	//  380  505:dup             
	//  381  506:iconst_0        
	//  382  507:ldc1            #57  <Int 1>
	//  383  509:bastore         
	//  384  510:dup             
	//  385  511:iconst_1        
	//  386  512:ldc1            #56  <Int 2>
	//  387  514:bastore         
	//  388  515:dup             
	//  389  516:iconst_2        
	//  390  517:ldc1            #58  <Int 3>
	//  391  519:bastore         
	//  392  520:dup             
	//  393  521:iconst_3        
	//  394  522:ldc1            #57  <Int 1>
	//  395  524:bastore         
	//  396  525:dup             
	//  397  526:iconst_4        
	//  398  527:ldc1            #56  <Int 2>
	//  399  529:bastore         
	//  400  530:dup             
	//  401  531:iconst_5        
	//  402  532:ldc1            #56  <Int 2>
	//  403  534:bastore         
	//  404  535:astore          15
		byte abyte15[] = {
			2, 2, 3, 2, 1, 1
		};
	//  405  537:bipush          6
	//  406  539:newarray        byte[]
	//  407  541:dup             
	//  408  542:iconst_0        
	//  409  543:ldc1            #56  <Int 2>
	//  410  545:bastore         
	//  411  546:dup             
	//  412  547:iconst_1        
	//  413  548:ldc1            #56  <Int 2>
	//  414  550:bastore         
	//  415  551:dup             
	//  416  552:iconst_2        
	//  417  553:ldc1            #58  <Int 3>
	//  418  555:bastore         
	//  419  556:dup             
	//  420  557:iconst_3        
	//  421  558:ldc1            #56  <Int 2>
	//  422  560:bastore         
	//  423  561:dup             
	//  424  562:iconst_4        
	//  425  563:ldc1            #57  <Int 1>
	//  426  565:bastore         
	//  427  566:dup             
	//  428  567:iconst_5        
	//  429  568:ldc1            #57  <Int 1>
	//  430  570:bastore         
	//  431  571:astore          16
		byte abyte16[] = {
			2, 2, 1, 1, 3, 2
		};
	//  432  573:bipush          6
	//  433  575:newarray        byte[]
	//  434  577:dup             
	//  435  578:iconst_0        
	//  436  579:ldc1            #56  <Int 2>
	//  437  581:bastore         
	//  438  582:dup             
	//  439  583:iconst_1        
	//  440  584:ldc1            #56  <Int 2>
	//  441  586:bastore         
	//  442  587:dup             
	//  443  588:iconst_2        
	//  444  589:ldc1            #57  <Int 1>
	//  445  591:bastore         
	//  446  592:dup             
	//  447  593:iconst_3        
	//  448  594:ldc1            #57  <Int 1>
	//  449  596:bastore         
	//  450  597:dup             
	//  451  598:iconst_4        
	//  452  599:ldc1            #58  <Int 3>
	//  453  601:bastore         
	//  454  602:dup             
	//  455  603:iconst_5        
	//  456  604:ldc1            #56  <Int 2>
	//  457  606:bastore         
	//  458  607:astore          17
		byte abyte17[] = {
			2, 2, 1, 2, 3, 1
		};
	//  459  609:bipush          6
	//  460  611:newarray        byte[]
	//  461  613:dup             
	//  462  614:iconst_0        
	//  463  615:ldc1            #56  <Int 2>
	//  464  617:bastore         
	//  465  618:dup             
	//  466  619:iconst_1        
	//  467  620:ldc1            #56  <Int 2>
	//  468  622:bastore         
	//  469  623:dup             
	//  470  624:iconst_2        
	//  471  625:ldc1            #57  <Int 1>
	//  472  627:bastore         
	//  473  628:dup             
	//  474  629:iconst_3        
	//  475  630:ldc1            #56  <Int 2>
	//  476  632:bastore         
	//  477  633:dup             
	//  478  634:iconst_4        
	//  479  635:ldc1            #58  <Int 3>
	//  480  637:bastore         
	//  481  638:dup             
	//  482  639:iconst_5        
	//  483  640:ldc1            #57  <Int 1>
	//  484  642:bastore         
	//  485  643:astore          18
		byte abyte18[] = {
			2, 1, 3, 2, 1, 2
		};
	//  486  645:bipush          6
	//  487  647:newarray        byte[]
	//  488  649:dup             
	//  489  650:iconst_0        
	//  490  651:ldc1            #56  <Int 2>
	//  491  653:bastore         
	//  492  654:dup             
	//  493  655:iconst_1        
	//  494  656:ldc1            #57  <Int 1>
	//  495  658:bastore         
	//  496  659:dup             
	//  497  660:iconst_2        
	//  498  661:ldc1            #58  <Int 3>
	//  499  663:bastore         
	//  500  664:dup             
	//  501  665:iconst_3        
	//  502  666:ldc1            #56  <Int 2>
	//  503  668:bastore         
	//  504  669:dup             
	//  505  670:iconst_4        
	//  506  671:ldc1            #57  <Int 1>
	//  507  673:bastore         
	//  508  674:dup             
	//  509  675:iconst_5        
	//  510  676:ldc1            #56  <Int 2>
	//  511  678:bastore         
	//  512  679:astore          19
		byte abyte19[] = {
			2, 2, 3, 1, 1, 2
		};
	//  513  681:bipush          6
	//  514  683:newarray        byte[]
	//  515  685:dup             
	//  516  686:iconst_0        
	//  517  687:ldc1            #56  <Int 2>
	//  518  689:bastore         
	//  519  690:dup             
	//  520  691:iconst_1        
	//  521  692:ldc1            #56  <Int 2>
	//  522  694:bastore         
	//  523  695:dup             
	//  524  696:iconst_2        
	//  525  697:ldc1            #58  <Int 3>
	//  526  699:bastore         
	//  527  700:dup             
	//  528  701:iconst_3        
	//  529  702:ldc1            #57  <Int 1>
	//  530  704:bastore         
	//  531  705:dup             
	//  532  706:iconst_4        
	//  533  707:ldc1            #57  <Int 1>
	//  534  709:bastore         
	//  535  710:dup             
	//  536  711:iconst_5        
	//  537  712:ldc1            #56  <Int 2>
	//  538  714:bastore         
	//  539  715:astore          20
		byte abyte20[] = {
			3, 1, 2, 1, 3, 1
		};
	//  540  717:bipush          6
	//  541  719:newarray        byte[]
	//  542  721:dup             
	//  543  722:iconst_0        
	//  544  723:ldc1            #58  <Int 3>
	//  545  725:bastore         
	//  546  726:dup             
	//  547  727:iconst_1        
	//  548  728:ldc1            #57  <Int 1>
	//  549  730:bastore         
	//  550  731:dup             
	//  551  732:iconst_2        
	//  552  733:ldc1            #56  <Int 2>
	//  553  735:bastore         
	//  554  736:dup             
	//  555  737:iconst_3        
	//  556  738:ldc1            #57  <Int 1>
	//  557  740:bastore         
	//  558  741:dup             
	//  559  742:iconst_4        
	//  560  743:ldc1            #58  <Int 3>
	//  561  745:bastore         
	//  562  746:dup             
	//  563  747:iconst_5        
	//  564  748:ldc1            #57  <Int 1>
	//  565  750:bastore         
	//  566  751:astore          21
		byte abyte21[] = {
			3, 1, 1, 2, 2, 2
		};
	//  567  753:bipush          6
	//  568  755:newarray        byte[]
	//  569  757:dup             
	//  570  758:iconst_0        
	//  571  759:ldc1            #58  <Int 3>
	//  572  761:bastore         
	//  573  762:dup             
	//  574  763:iconst_1        
	//  575  764:ldc1            #57  <Int 1>
	//  576  766:bastore         
	//  577  767:dup             
	//  578  768:iconst_2        
	//  579  769:ldc1            #57  <Int 1>
	//  580  771:bastore         
	//  581  772:dup             
	//  582  773:iconst_3        
	//  583  774:ldc1            #56  <Int 2>
	//  584  776:bastore         
	//  585  777:dup             
	//  586  778:iconst_4        
	//  587  779:ldc1            #56  <Int 2>
	//  588  781:bastore         
	//  589  782:dup             
	//  590  783:iconst_5        
	//  591  784:ldc1            #56  <Int 2>
	//  592  786:bastore         
	//  593  787:astore          22
		byte abyte22[] = {
			3, 2, 1, 1, 2, 2
		};
	//  594  789:bipush          6
	//  595  791:newarray        byte[]
	//  596  793:dup             
	//  597  794:iconst_0        
	//  598  795:ldc1            #58  <Int 3>
	//  599  797:bastore         
	//  600  798:dup             
	//  601  799:iconst_1        
	//  602  800:ldc1            #56  <Int 2>
	//  603  802:bastore         
	//  604  803:dup             
	//  605  804:iconst_2        
	//  606  805:ldc1            #57  <Int 1>
	//  607  807:bastore         
	//  608  808:dup             
	//  609  809:iconst_3        
	//  610  810:ldc1            #57  <Int 1>
	//  611  812:bastore         
	//  612  813:dup             
	//  613  814:iconst_4        
	//  614  815:ldc1            #56  <Int 2>
	//  615  817:bastore         
	//  616  818:dup             
	//  617  819:iconst_5        
	//  618  820:ldc1            #56  <Int 2>
	//  619  822:bastore         
	//  620  823:astore          23
		byte abyte23[] = {
			3, 2, 1, 2, 2, 1
		};
	//  621  825:bipush          6
	//  622  827:newarray        byte[]
	//  623  829:dup             
	//  624  830:iconst_0        
	//  625  831:ldc1            #58  <Int 3>
	//  626  833:bastore         
	//  627  834:dup             
	//  628  835:iconst_1        
	//  629  836:ldc1            #56  <Int 2>
	//  630  838:bastore         
	//  631  839:dup             
	//  632  840:iconst_2        
	//  633  841:ldc1            #57  <Int 1>
	//  634  843:bastore         
	//  635  844:dup             
	//  636  845:iconst_3        
	//  637  846:ldc1            #56  <Int 2>
	//  638  848:bastore         
	//  639  849:dup             
	//  640  850:iconst_4        
	//  641  851:ldc1            #56  <Int 2>
	//  642  853:bastore         
	//  643  854:dup             
	//  644  855:iconst_5        
	//  645  856:ldc1            #57  <Int 1>
	//  646  858:bastore         
	//  647  859:astore          24
		byte abyte24[] = {
			3, 1, 2, 2, 1, 2
		};
	//  648  861:bipush          6
	//  649  863:newarray        byte[]
	//  650  865:dup             
	//  651  866:iconst_0        
	//  652  867:ldc1            #58  <Int 3>
	//  653  869:bastore         
	//  654  870:dup             
	//  655  871:iconst_1        
	//  656  872:ldc1            #57  <Int 1>
	//  657  874:bastore         
	//  658  875:dup             
	//  659  876:iconst_2        
	//  660  877:ldc1            #56  <Int 2>
	//  661  879:bastore         
	//  662  880:dup             
	//  663  881:iconst_3        
	//  664  882:ldc1            #56  <Int 2>
	//  665  884:bastore         
	//  666  885:dup             
	//  667  886:iconst_4        
	//  668  887:ldc1            #57  <Int 1>
	//  669  889:bastore         
	//  670  890:dup             
	//  671  891:iconst_5        
	//  672  892:ldc1            #56  <Int 2>
	//  673  894:bastore         
	//  674  895:astore          25
		byte abyte25[] = {
			3, 2, 2, 1, 1, 2
		};
	//  675  897:bipush          6
	//  676  899:newarray        byte[]
	//  677  901:dup             
	//  678  902:iconst_0        
	//  679  903:ldc1            #58  <Int 3>
	//  680  905:bastore         
	//  681  906:dup             
	//  682  907:iconst_1        
	//  683  908:ldc1            #56  <Int 2>
	//  684  910:bastore         
	//  685  911:dup             
	//  686  912:iconst_2        
	//  687  913:ldc1            #56  <Int 2>
	//  688  915:bastore         
	//  689  916:dup             
	//  690  917:iconst_3        
	//  691  918:ldc1            #57  <Int 1>
	//  692  920:bastore         
	//  693  921:dup             
	//  694  922:iconst_4        
	//  695  923:ldc1            #57  <Int 1>
	//  696  925:bastore         
	//  697  926:dup             
	//  698  927:iconst_5        
	//  699  928:ldc1            #56  <Int 2>
	//  700  930:bastore         
	//  701  931:astore          26
		byte abyte26[] = {
			3, 2, 2, 2, 1, 1
		};
	//  702  933:bipush          6
	//  703  935:newarray        byte[]
	//  704  937:dup             
	//  705  938:iconst_0        
	//  706  939:ldc1            #58  <Int 3>
	//  707  941:bastore         
	//  708  942:dup             
	//  709  943:iconst_1        
	//  710  944:ldc1            #56  <Int 2>
	//  711  946:bastore         
	//  712  947:dup             
	//  713  948:iconst_2        
	//  714  949:ldc1            #56  <Int 2>
	//  715  951:bastore         
	//  716  952:dup             
	//  717  953:iconst_3        
	//  718  954:ldc1            #56  <Int 2>
	//  719  956:bastore         
	//  720  957:dup             
	//  721  958:iconst_4        
	//  722  959:ldc1            #57  <Int 1>
	//  723  961:bastore         
	//  724  962:dup             
	//  725  963:iconst_5        
	//  726  964:ldc1            #57  <Int 1>
	//  727  966:bastore         
	//  728  967:astore          27
		byte abyte27[] = {
			2, 1, 2, 1, 2, 3
		};
	//  729  969:bipush          6
	//  730  971:newarray        byte[]
	//  731  973:dup             
	//  732  974:iconst_0        
	//  733  975:ldc1            #56  <Int 2>
	//  734  977:bastore         
	//  735  978:dup             
	//  736  979:iconst_1        
	//  737  980:ldc1            #57  <Int 1>
	//  738  982:bastore         
	//  739  983:dup             
	//  740  984:iconst_2        
	//  741  985:ldc1            #56  <Int 2>
	//  742  987:bastore         
	//  743  988:dup             
	//  744  989:iconst_3        
	//  745  990:ldc1            #57  <Int 1>
	//  746  992:bastore         
	//  747  993:dup             
	//  748  994:iconst_4        
	//  749  995:ldc1            #56  <Int 2>
	//  750  997:bastore         
	//  751  998:dup             
	//  752  999:iconst_5        
	//  753 1000:ldc1            #58  <Int 3>
	//  754 1002:bastore         
	//  755 1003:astore          28
		byte abyte28[] = {
			2, 3, 2, 1, 2, 1
		};
	//  756 1005:bipush          6
	//  757 1007:newarray        byte[]
	//  758 1009:dup             
	//  759 1010:iconst_0        
	//  760 1011:ldc1            #56  <Int 2>
	//  761 1013:bastore         
	//  762 1014:dup             
	//  763 1015:iconst_1        
	//  764 1016:ldc1            #58  <Int 3>
	//  765 1018:bastore         
	//  766 1019:dup             
	//  767 1020:iconst_2        
	//  768 1021:ldc1            #56  <Int 2>
	//  769 1023:bastore         
	//  770 1024:dup             
	//  771 1025:iconst_3        
	//  772 1026:ldc1            #57  <Int 1>
	//  773 1028:bastore         
	//  774 1029:dup             
	//  775 1030:iconst_4        
	//  776 1031:ldc1            #56  <Int 2>
	//  777 1033:bastore         
	//  778 1034:dup             
	//  779 1035:iconst_5        
	//  780 1036:ldc1            #57  <Int 1>
	//  781 1038:bastore         
	//  782 1039:astore          29
		byte abyte29[] = {
			1, 1, 1, 3, 2, 3
		};
	//  783 1041:bipush          6
	//  784 1043:newarray        byte[]
	//  785 1045:dup             
	//  786 1046:iconst_0        
	//  787 1047:ldc1            #57  <Int 1>
	//  788 1049:bastore         
	//  789 1050:dup             
	//  790 1051:iconst_1        
	//  791 1052:ldc1            #57  <Int 1>
	//  792 1054:bastore         
	//  793 1055:dup             
	//  794 1056:iconst_2        
	//  795 1057:ldc1            #57  <Int 1>
	//  796 1059:bastore         
	//  797 1060:dup             
	//  798 1061:iconst_3        
	//  799 1062:ldc1            #58  <Int 3>
	//  800 1064:bastore         
	//  801 1065:dup             
	//  802 1066:iconst_4        
	//  803 1067:ldc1            #56  <Int 2>
	//  804 1069:bastore         
	//  805 1070:dup             
	//  806 1071:iconst_5        
	//  807 1072:ldc1            #58  <Int 3>
	//  808 1074:bastore         
	//  809 1075:astore          30
		byte abyte30[] = {
			1, 3, 1, 1, 2, 3
		};
	//  810 1077:bipush          6
	//  811 1079:newarray        byte[]
	//  812 1081:dup             
	//  813 1082:iconst_0        
	//  814 1083:ldc1            #57  <Int 1>
	//  815 1085:bastore         
	//  816 1086:dup             
	//  817 1087:iconst_1        
	//  818 1088:ldc1            #58  <Int 3>
	//  819 1090:bastore         
	//  820 1091:dup             
	//  821 1092:iconst_2        
	//  822 1093:ldc1            #57  <Int 1>
	//  823 1095:bastore         
	//  824 1096:dup             
	//  825 1097:iconst_3        
	//  826 1098:ldc1            #57  <Int 1>
	//  827 1100:bastore         
	//  828 1101:dup             
	//  829 1102:iconst_4        
	//  830 1103:ldc1            #56  <Int 2>
	//  831 1105:bastore         
	//  832 1106:dup             
	//  833 1107:iconst_5        
	//  834 1108:ldc1            #58  <Int 3>
	//  835 1110:bastore         
	//  836 1111:astore          31
		byte abyte31[] = {
			1, 1, 2, 3, 1, 3
		};
	//  837 1113:bipush          6
	//  838 1115:newarray        byte[]
	//  839 1117:dup             
	//  840 1118:iconst_0        
	//  841 1119:ldc1            #57  <Int 1>
	//  842 1121:bastore         
	//  843 1122:dup             
	//  844 1123:iconst_1        
	//  845 1124:ldc1            #57  <Int 1>
	//  846 1126:bastore         
	//  847 1127:dup             
	//  848 1128:iconst_2        
	//  849 1129:ldc1            #56  <Int 2>
	//  850 1131:bastore         
	//  851 1132:dup             
	//  852 1133:iconst_3        
	//  853 1134:ldc1            #58  <Int 3>
	//  854 1136:bastore         
	//  855 1137:dup             
	//  856 1138:iconst_4        
	//  857 1139:ldc1            #57  <Int 1>
	//  858 1141:bastore         
	//  859 1142:dup             
	//  860 1143:iconst_5        
	//  861 1144:ldc1            #58  <Int 3>
	//  862 1146:bastore         
	//  863 1147:astore          32
		byte abyte32[] = {
			1, 3, 2, 1, 1, 3
		};
	//  864 1149:bipush          6
	//  865 1151:newarray        byte[]
	//  866 1153:dup             
	//  867 1154:iconst_0        
	//  868 1155:ldc1            #57  <Int 1>
	//  869 1157:bastore         
	//  870 1158:dup             
	//  871 1159:iconst_1        
	//  872 1160:ldc1            #58  <Int 3>
	//  873 1162:bastore         
	//  874 1163:dup             
	//  875 1164:iconst_2        
	//  876 1165:ldc1            #56  <Int 2>
	//  877 1167:bastore         
	//  878 1168:dup             
	//  879 1169:iconst_3        
	//  880 1170:ldc1            #57  <Int 1>
	//  881 1172:bastore         
	//  882 1173:dup             
	//  883 1174:iconst_4        
	//  884 1175:ldc1            #57  <Int 1>
	//  885 1177:bastore         
	//  886 1178:dup             
	//  887 1179:iconst_5        
	//  888 1180:ldc1            #58  <Int 3>
	//  889 1182:bastore         
	//  890 1183:astore          33
		byte abyte33[] = {
			1, 3, 2, 3, 1, 1
		};
	//  891 1185:bipush          6
	//  892 1187:newarray        byte[]
	//  893 1189:dup             
	//  894 1190:iconst_0        
	//  895 1191:ldc1            #57  <Int 1>
	//  896 1193:bastore         
	//  897 1194:dup             
	//  898 1195:iconst_1        
	//  899 1196:ldc1            #58  <Int 3>
	//  900 1198:bastore         
	//  901 1199:dup             
	//  902 1200:iconst_2        
	//  903 1201:ldc1            #56  <Int 2>
	//  904 1203:bastore         
	//  905 1204:dup             
	//  906 1205:iconst_3        
	//  907 1206:ldc1            #58  <Int 3>
	//  908 1208:bastore         
	//  909 1209:dup             
	//  910 1210:iconst_4        
	//  911 1211:ldc1            #57  <Int 1>
	//  912 1213:bastore         
	//  913 1214:dup             
	//  914 1215:iconst_5        
	//  915 1216:ldc1            #57  <Int 1>
	//  916 1218:bastore         
	//  917 1219:astore          34
		byte abyte34[] = {
			2, 1, 1, 3, 1, 3
		};
	//  918 1221:bipush          6
	//  919 1223:newarray        byte[]
	//  920 1225:dup             
	//  921 1226:iconst_0        
	//  922 1227:ldc1            #56  <Int 2>
	//  923 1229:bastore         
	//  924 1230:dup             
	//  925 1231:iconst_1        
	//  926 1232:ldc1            #57  <Int 1>
	//  927 1234:bastore         
	//  928 1235:dup             
	//  929 1236:iconst_2        
	//  930 1237:ldc1            #57  <Int 1>
	//  931 1239:bastore         
	//  932 1240:dup             
	//  933 1241:iconst_3        
	//  934 1242:ldc1            #58  <Int 3>
	//  935 1244:bastore         
	//  936 1245:dup             
	//  937 1246:iconst_4        
	//  938 1247:ldc1            #57  <Int 1>
	//  939 1249:bastore         
	//  940 1250:dup             
	//  941 1251:iconst_5        
	//  942 1252:ldc1            #58  <Int 3>
	//  943 1254:bastore         
	//  944 1255:astore          35
		byte abyte35[] = {
			2, 3, 1, 1, 1, 3
		};
	//  945 1257:bipush          6
	//  946 1259:newarray        byte[]
	//  947 1261:dup             
	//  948 1262:iconst_0        
	//  949 1263:ldc1            #56  <Int 2>
	//  950 1265:bastore         
	//  951 1266:dup             
	//  952 1267:iconst_1        
	//  953 1268:ldc1            #58  <Int 3>
	//  954 1270:bastore         
	//  955 1271:dup             
	//  956 1272:iconst_2        
	//  957 1273:ldc1            #57  <Int 1>
	//  958 1275:bastore         
	//  959 1276:dup             
	//  960 1277:iconst_3        
	//  961 1278:ldc1            #57  <Int 1>
	//  962 1280:bastore         
	//  963 1281:dup             
	//  964 1282:iconst_4        
	//  965 1283:ldc1            #57  <Int 1>
	//  966 1285:bastore         
	//  967 1286:dup             
	//  968 1287:iconst_5        
	//  969 1288:ldc1            #58  <Int 3>
	//  970 1290:bastore         
	//  971 1291:astore          36
		byte abyte36[] = {
			2, 3, 1, 3, 1, 1
		};
	//  972 1293:bipush          6
	//  973 1295:newarray        byte[]
	//  974 1297:dup             
	//  975 1298:iconst_0        
	//  976 1299:ldc1            #56  <Int 2>
	//  977 1301:bastore         
	//  978 1302:dup             
	//  979 1303:iconst_1        
	//  980 1304:ldc1            #58  <Int 3>
	//  981 1306:bastore         
	//  982 1307:dup             
	//  983 1308:iconst_2        
	//  984 1309:ldc1            #57  <Int 1>
	//  985 1311:bastore         
	//  986 1312:dup             
	//  987 1313:iconst_3        
	//  988 1314:ldc1            #58  <Int 3>
	//  989 1316:bastore         
	//  990 1317:dup             
	//  991 1318:iconst_4        
	//  992 1319:ldc1            #57  <Int 1>
	//  993 1321:bastore         
	//  994 1322:dup             
	//  995 1323:iconst_5        
	//  996 1324:ldc1            #57  <Int 1>
	//  997 1326:bastore         
	//  998 1327:astore          37
		byte abyte37[] = {
			1, 1, 2, 1, 3, 3
		};
	//  999 1329:bipush          6
	// 1000 1331:newarray        byte[]
	// 1001 1333:dup             
	// 1002 1334:iconst_0        
	// 1003 1335:ldc1            #57  <Int 1>
	// 1004 1337:bastore         
	// 1005 1338:dup             
	// 1006 1339:iconst_1        
	// 1007 1340:ldc1            #57  <Int 1>
	// 1008 1342:bastore         
	// 1009 1343:dup             
	// 1010 1344:iconst_2        
	// 1011 1345:ldc1            #56  <Int 2>
	// 1012 1347:bastore         
	// 1013 1348:dup             
	// 1014 1349:iconst_3        
	// 1015 1350:ldc1            #57  <Int 1>
	// 1016 1352:bastore         
	// 1017 1353:dup             
	// 1018 1354:iconst_4        
	// 1019 1355:ldc1            #58  <Int 3>
	// 1020 1357:bastore         
	// 1021 1358:dup             
	// 1022 1359:iconst_5        
	// 1023 1360:ldc1            #58  <Int 3>
	// 1024 1362:bastore         
	// 1025 1363:astore          38
		byte abyte38[] = {
			1, 1, 2, 3, 3, 1
		};
	// 1026 1365:bipush          6
	// 1027 1367:newarray        byte[]
	// 1028 1369:dup             
	// 1029 1370:iconst_0        
	// 1030 1371:ldc1            #57  <Int 1>
	// 1031 1373:bastore         
	// 1032 1374:dup             
	// 1033 1375:iconst_1        
	// 1034 1376:ldc1            #57  <Int 1>
	// 1035 1378:bastore         
	// 1036 1379:dup             
	// 1037 1380:iconst_2        
	// 1038 1381:ldc1            #56  <Int 2>
	// 1039 1383:bastore         
	// 1040 1384:dup             
	// 1041 1385:iconst_3        
	// 1042 1386:ldc1            #58  <Int 3>
	// 1043 1388:bastore         
	// 1044 1389:dup             
	// 1045 1390:iconst_4        
	// 1046 1391:ldc1            #58  <Int 3>
	// 1047 1393:bastore         
	// 1048 1394:dup             
	// 1049 1395:iconst_5        
	// 1050 1396:ldc1            #57  <Int 1>
	// 1051 1398:bastore         
	// 1052 1399:astore          39
		byte abyte39[] = {
			1, 3, 2, 1, 3, 1
		};
	// 1053 1401:bipush          6
	// 1054 1403:newarray        byte[]
	// 1055 1405:dup             
	// 1056 1406:iconst_0        
	// 1057 1407:ldc1            #57  <Int 1>
	// 1058 1409:bastore         
	// 1059 1410:dup             
	// 1060 1411:iconst_1        
	// 1061 1412:ldc1            #58  <Int 3>
	// 1062 1414:bastore         
	// 1063 1415:dup             
	// 1064 1416:iconst_2        
	// 1065 1417:ldc1            #56  <Int 2>
	// 1066 1419:bastore         
	// 1067 1420:dup             
	// 1068 1421:iconst_3        
	// 1069 1422:ldc1            #57  <Int 1>
	// 1070 1424:bastore         
	// 1071 1425:dup             
	// 1072 1426:iconst_4        
	// 1073 1427:ldc1            #58  <Int 3>
	// 1074 1429:bastore         
	// 1075 1430:dup             
	// 1076 1431:iconst_5        
	// 1077 1432:ldc1            #57  <Int 1>
	// 1078 1434:bastore         
	// 1079 1435:astore          40
		byte abyte40[] = {
			1, 1, 3, 1, 2, 3
		};
	// 1080 1437:bipush          6
	// 1081 1439:newarray        byte[]
	// 1082 1441:dup             
	// 1083 1442:iconst_0        
	// 1084 1443:ldc1            #57  <Int 1>
	// 1085 1445:bastore         
	// 1086 1446:dup             
	// 1087 1447:iconst_1        
	// 1088 1448:ldc1            #57  <Int 1>
	// 1089 1450:bastore         
	// 1090 1451:dup             
	// 1091 1452:iconst_2        
	// 1092 1453:ldc1            #58  <Int 3>
	// 1093 1455:bastore         
	// 1094 1456:dup             
	// 1095 1457:iconst_3        
	// 1096 1458:ldc1            #57  <Int 1>
	// 1097 1460:bastore         
	// 1098 1461:dup             
	// 1099 1462:iconst_4        
	// 1100 1463:ldc1            #56  <Int 2>
	// 1101 1465:bastore         
	// 1102 1466:dup             
	// 1103 1467:iconst_5        
	// 1104 1468:ldc1            #58  <Int 3>
	// 1105 1470:bastore         
	// 1106 1471:astore          41
		byte abyte41[] = {
			1, 1, 3, 3, 2, 1
		};
	// 1107 1473:bipush          6
	// 1108 1475:newarray        byte[]
	// 1109 1477:dup             
	// 1110 1478:iconst_0        
	// 1111 1479:ldc1            #57  <Int 1>
	// 1112 1481:bastore         
	// 1113 1482:dup             
	// 1114 1483:iconst_1        
	// 1115 1484:ldc1            #57  <Int 1>
	// 1116 1486:bastore         
	// 1117 1487:dup             
	// 1118 1488:iconst_2        
	// 1119 1489:ldc1            #58  <Int 3>
	// 1120 1491:bastore         
	// 1121 1492:dup             
	// 1122 1493:iconst_3        
	// 1123 1494:ldc1            #58  <Int 3>
	// 1124 1496:bastore         
	// 1125 1497:dup             
	// 1126 1498:iconst_4        
	// 1127 1499:ldc1            #56  <Int 2>
	// 1128 1501:bastore         
	// 1129 1502:dup             
	// 1130 1503:iconst_5        
	// 1131 1504:ldc1            #57  <Int 1>
	// 1132 1506:bastore         
	// 1133 1507:astore          42
		byte abyte42[] = {
			1, 3, 3, 1, 2, 1
		};
	// 1134 1509:bipush          6
	// 1135 1511:newarray        byte[]
	// 1136 1513:dup             
	// 1137 1514:iconst_0        
	// 1138 1515:ldc1            #57  <Int 1>
	// 1139 1517:bastore         
	// 1140 1518:dup             
	// 1141 1519:iconst_1        
	// 1142 1520:ldc1            #58  <Int 3>
	// 1143 1522:bastore         
	// 1144 1523:dup             
	// 1145 1524:iconst_2        
	// 1146 1525:ldc1            #58  <Int 3>
	// 1147 1527:bastore         
	// 1148 1528:dup             
	// 1149 1529:iconst_3        
	// 1150 1530:ldc1            #57  <Int 1>
	// 1151 1532:bastore         
	// 1152 1533:dup             
	// 1153 1534:iconst_4        
	// 1154 1535:ldc1            #56  <Int 2>
	// 1155 1537:bastore         
	// 1156 1538:dup             
	// 1157 1539:iconst_5        
	// 1158 1540:ldc1            #57  <Int 1>
	// 1159 1542:bastore         
	// 1160 1543:astore          43
		byte abyte43[] = {
			3, 1, 3, 1, 2, 1
		};
	// 1161 1545:bipush          6
	// 1162 1547:newarray        byte[]
	// 1163 1549:dup             
	// 1164 1550:iconst_0        
	// 1165 1551:ldc1            #58  <Int 3>
	// 1166 1553:bastore         
	// 1167 1554:dup             
	// 1168 1555:iconst_1        
	// 1169 1556:ldc1            #57  <Int 1>
	// 1170 1558:bastore         
	// 1171 1559:dup             
	// 1172 1560:iconst_2        
	// 1173 1561:ldc1            #58  <Int 3>
	// 1174 1563:bastore         
	// 1175 1564:dup             
	// 1176 1565:iconst_3        
	// 1177 1566:ldc1            #57  <Int 1>
	// 1178 1568:bastore         
	// 1179 1569:dup             
	// 1180 1570:iconst_4        
	// 1181 1571:ldc1            #56  <Int 2>
	// 1182 1573:bastore         
	// 1183 1574:dup             
	// 1184 1575:iconst_5        
	// 1185 1576:ldc1            #57  <Int 1>
	// 1186 1578:bastore         
	// 1187 1579:astore          44
		byte abyte44[] = {
			2, 1, 1, 3, 3, 1
		};
	// 1188 1581:bipush          6
	// 1189 1583:newarray        byte[]
	// 1190 1585:dup             
	// 1191 1586:iconst_0        
	// 1192 1587:ldc1            #56  <Int 2>
	// 1193 1589:bastore         
	// 1194 1590:dup             
	// 1195 1591:iconst_1        
	// 1196 1592:ldc1            #57  <Int 1>
	// 1197 1594:bastore         
	// 1198 1595:dup             
	// 1199 1596:iconst_2        
	// 1200 1597:ldc1            #57  <Int 1>
	// 1201 1599:bastore         
	// 1202 1600:dup             
	// 1203 1601:iconst_3        
	// 1204 1602:ldc1            #58  <Int 3>
	// 1205 1604:bastore         
	// 1206 1605:dup             
	// 1207 1606:iconst_4        
	// 1208 1607:ldc1            #58  <Int 3>
	// 1209 1609:bastore         
	// 1210 1610:dup             
	// 1211 1611:iconst_5        
	// 1212 1612:ldc1            #57  <Int 1>
	// 1213 1614:bastore         
	// 1214 1615:astore          45
		byte abyte45[] = {
			2, 3, 1, 1, 3, 1
		};
	// 1215 1617:bipush          6
	// 1216 1619:newarray        byte[]
	// 1217 1621:dup             
	// 1218 1622:iconst_0        
	// 1219 1623:ldc1            #56  <Int 2>
	// 1220 1625:bastore         
	// 1221 1626:dup             
	// 1222 1627:iconst_1        
	// 1223 1628:ldc1            #58  <Int 3>
	// 1224 1630:bastore         
	// 1225 1631:dup             
	// 1226 1632:iconst_2        
	// 1227 1633:ldc1            #57  <Int 1>
	// 1228 1635:bastore         
	// 1229 1636:dup             
	// 1230 1637:iconst_3        
	// 1231 1638:ldc1            #57  <Int 1>
	// 1232 1640:bastore         
	// 1233 1641:dup             
	// 1234 1642:iconst_4        
	// 1235 1643:ldc1            #58  <Int 3>
	// 1236 1645:bastore         
	// 1237 1646:dup             
	// 1238 1647:iconst_5        
	// 1239 1648:ldc1            #57  <Int 1>
	// 1240 1650:bastore         
	// 1241 1651:astore          46
		byte abyte46[] = {
			2, 1, 3, 1, 1, 3
		};
	// 1242 1653:bipush          6
	// 1243 1655:newarray        byte[]
	// 1244 1657:dup             
	// 1245 1658:iconst_0        
	// 1246 1659:ldc1            #56  <Int 2>
	// 1247 1661:bastore         
	// 1248 1662:dup             
	// 1249 1663:iconst_1        
	// 1250 1664:ldc1            #57  <Int 1>
	// 1251 1666:bastore         
	// 1252 1667:dup             
	// 1253 1668:iconst_2        
	// 1254 1669:ldc1            #58  <Int 3>
	// 1255 1671:bastore         
	// 1256 1672:dup             
	// 1257 1673:iconst_3        
	// 1258 1674:ldc1            #57  <Int 1>
	// 1259 1676:bastore         
	// 1260 1677:dup             
	// 1261 1678:iconst_4        
	// 1262 1679:ldc1            #57  <Int 1>
	// 1263 1681:bastore         
	// 1264 1682:dup             
	// 1265 1683:iconst_5        
	// 1266 1684:ldc1            #58  <Int 3>
	// 1267 1686:bastore         
	// 1268 1687:astore          47
		byte abyte47[] = {
			2, 1, 3, 3, 1, 1
		};
	// 1269 1689:bipush          6
	// 1270 1691:newarray        byte[]
	// 1271 1693:dup             
	// 1272 1694:iconst_0        
	// 1273 1695:ldc1            #56  <Int 2>
	// 1274 1697:bastore         
	// 1275 1698:dup             
	// 1276 1699:iconst_1        
	// 1277 1700:ldc1            #57  <Int 1>
	// 1278 1702:bastore         
	// 1279 1703:dup             
	// 1280 1704:iconst_2        
	// 1281 1705:ldc1            #58  <Int 3>
	// 1282 1707:bastore         
	// 1283 1708:dup             
	// 1284 1709:iconst_3        
	// 1285 1710:ldc1            #58  <Int 3>
	// 1286 1712:bastore         
	// 1287 1713:dup             
	// 1288 1714:iconst_4        
	// 1289 1715:ldc1            #57  <Int 1>
	// 1290 1717:bastore         
	// 1291 1718:dup             
	// 1292 1719:iconst_5        
	// 1293 1720:ldc1            #57  <Int 1>
	// 1294 1722:bastore         
	// 1295 1723:astore          48
		byte abyte48[] = {
			3, 1, 1, 1, 2, 3
		};
	// 1296 1725:bipush          6
	// 1297 1727:newarray        byte[]
	// 1298 1729:dup             
	// 1299 1730:iconst_0        
	// 1300 1731:ldc1            #58  <Int 3>
	// 1301 1733:bastore         
	// 1302 1734:dup             
	// 1303 1735:iconst_1        
	// 1304 1736:ldc1            #57  <Int 1>
	// 1305 1738:bastore         
	// 1306 1739:dup             
	// 1307 1740:iconst_2        
	// 1308 1741:ldc1            #57  <Int 1>
	// 1309 1743:bastore         
	// 1310 1744:dup             
	// 1311 1745:iconst_3        
	// 1312 1746:ldc1            #57  <Int 1>
	// 1313 1748:bastore         
	// 1314 1749:dup             
	// 1315 1750:iconst_4        
	// 1316 1751:ldc1            #56  <Int 2>
	// 1317 1753:bastore         
	// 1318 1754:dup             
	// 1319 1755:iconst_5        
	// 1320 1756:ldc1            #58  <Int 3>
	// 1321 1758:bastore         
	// 1322 1759:astore          49
		byte abyte49[] = {
			3, 1, 1, 3, 2, 1
		};
	// 1323 1761:bipush          6
	// 1324 1763:newarray        byte[]
	// 1325 1765:dup             
	// 1326 1766:iconst_0        
	// 1327 1767:ldc1            #58  <Int 3>
	// 1328 1769:bastore         
	// 1329 1770:dup             
	// 1330 1771:iconst_1        
	// 1331 1772:ldc1            #57  <Int 1>
	// 1332 1774:bastore         
	// 1333 1775:dup             
	// 1334 1776:iconst_2        
	// 1335 1777:ldc1            #57  <Int 1>
	// 1336 1779:bastore         
	// 1337 1780:dup             
	// 1338 1781:iconst_3        
	// 1339 1782:ldc1            #58  <Int 3>
	// 1340 1784:bastore         
	// 1341 1785:dup             
	// 1342 1786:iconst_4        
	// 1343 1787:ldc1            #56  <Int 2>
	// 1344 1789:bastore         
	// 1345 1790:dup             
	// 1346 1791:iconst_5        
	// 1347 1792:ldc1            #57  <Int 1>
	// 1348 1794:bastore         
	// 1349 1795:astore          50
		byte abyte50[] = {
			3, 3, 1, 1, 2, 1
		};
	// 1350 1797:bipush          6
	// 1351 1799:newarray        byte[]
	// 1352 1801:dup             
	// 1353 1802:iconst_0        
	// 1354 1803:ldc1            #58  <Int 3>
	// 1355 1805:bastore         
	// 1356 1806:dup             
	// 1357 1807:iconst_1        
	// 1358 1808:ldc1            #58  <Int 3>
	// 1359 1810:bastore         
	// 1360 1811:dup             
	// 1361 1812:iconst_2        
	// 1362 1813:ldc1            #57  <Int 1>
	// 1363 1815:bastore         
	// 1364 1816:dup             
	// 1365 1817:iconst_3        
	// 1366 1818:ldc1            #57  <Int 1>
	// 1367 1820:bastore         
	// 1368 1821:dup             
	// 1369 1822:iconst_4        
	// 1370 1823:ldc1            #56  <Int 2>
	// 1371 1825:bastore         
	// 1372 1826:dup             
	// 1373 1827:iconst_5        
	// 1374 1828:ldc1            #57  <Int 1>
	// 1375 1830:bastore         
	// 1376 1831:astore          51
		byte abyte51[] = {
			3, 1, 2, 1, 1, 3
		};
	// 1377 1833:bipush          6
	// 1378 1835:newarray        byte[]
	// 1379 1837:dup             
	// 1380 1838:iconst_0        
	// 1381 1839:ldc1            #58  <Int 3>
	// 1382 1841:bastore         
	// 1383 1842:dup             
	// 1384 1843:iconst_1        
	// 1385 1844:ldc1            #57  <Int 1>
	// 1386 1846:bastore         
	// 1387 1847:dup             
	// 1388 1848:iconst_2        
	// 1389 1849:ldc1            #56  <Int 2>
	// 1390 1851:bastore         
	// 1391 1852:dup             
	// 1392 1853:iconst_3        
	// 1393 1854:ldc1            #57  <Int 1>
	// 1394 1856:bastore         
	// 1395 1857:dup             
	// 1396 1858:iconst_4        
	// 1397 1859:ldc1            #57  <Int 1>
	// 1398 1861:bastore         
	// 1399 1862:dup             
	// 1400 1863:iconst_5        
	// 1401 1864:ldc1            #58  <Int 3>
	// 1402 1866:bastore         
	// 1403 1867:astore          52
		byte abyte52[] = {
			3, 1, 2, 3, 1, 1
		};
	// 1404 1869:bipush          6
	// 1405 1871:newarray        byte[]
	// 1406 1873:dup             
	// 1407 1874:iconst_0        
	// 1408 1875:ldc1            #58  <Int 3>
	// 1409 1877:bastore         
	// 1410 1878:dup             
	// 1411 1879:iconst_1        
	// 1412 1880:ldc1            #57  <Int 1>
	// 1413 1882:bastore         
	// 1414 1883:dup             
	// 1415 1884:iconst_2        
	// 1416 1885:ldc1            #56  <Int 2>
	// 1417 1887:bastore         
	// 1418 1888:dup             
	// 1419 1889:iconst_3        
	// 1420 1890:ldc1            #58  <Int 3>
	// 1421 1892:bastore         
	// 1422 1893:dup             
	// 1423 1894:iconst_4        
	// 1424 1895:ldc1            #57  <Int 1>
	// 1425 1897:bastore         
	// 1426 1898:dup             
	// 1427 1899:iconst_5        
	// 1428 1900:ldc1            #57  <Int 1>
	// 1429 1902:bastore         
	// 1430 1903:astore          53
		byte abyte53[] = {
			3, 3, 2, 1, 1, 1
		};
	// 1431 1905:bipush          6
	// 1432 1907:newarray        byte[]
	// 1433 1909:dup             
	// 1434 1910:iconst_0        
	// 1435 1911:ldc1            #58  <Int 3>
	// 1436 1913:bastore         
	// 1437 1914:dup             
	// 1438 1915:iconst_1        
	// 1439 1916:ldc1            #58  <Int 3>
	// 1440 1918:bastore         
	// 1441 1919:dup             
	// 1442 1920:iconst_2        
	// 1443 1921:ldc1            #56  <Int 2>
	// 1444 1923:bastore         
	// 1445 1924:dup             
	// 1446 1925:iconst_3        
	// 1447 1926:ldc1            #57  <Int 1>
	// 1448 1928:bastore         
	// 1449 1929:dup             
	// 1450 1930:iconst_4        
	// 1451 1931:ldc1            #57  <Int 1>
	// 1452 1933:bastore         
	// 1453 1934:dup             
	// 1454 1935:iconst_5        
	// 1455 1936:ldc1            #57  <Int 1>
	// 1456 1938:bastore         
	// 1457 1939:astore          54
		byte abyte54[] = {
			3, 1, 4, 1, 1, 1
		};
	// 1458 1941:bipush          6
	// 1459 1943:newarray        byte[]
	// 1460 1945:dup             
	// 1461 1946:iconst_0        
	// 1462 1947:ldc1            #58  <Int 3>
	// 1463 1949:bastore         
	// 1464 1950:dup             
	// 1465 1951:iconst_1        
	// 1466 1952:ldc1            #57  <Int 1>
	// 1467 1954:bastore         
	// 1468 1955:dup             
	// 1469 1956:iconst_2        
	// 1470 1957:ldc1            #59  <Int 4>
	// 1471 1959:bastore         
	// 1472 1960:dup             
	// 1473 1961:iconst_3        
	// 1474 1962:ldc1            #57  <Int 1>
	// 1475 1964:bastore         
	// 1476 1965:dup             
	// 1477 1966:iconst_4        
	// 1478 1967:ldc1            #57  <Int 1>
	// 1479 1969:bastore         
	// 1480 1970:dup             
	// 1481 1971:iconst_5        
	// 1482 1972:ldc1            #57  <Int 1>
	// 1483 1974:bastore         
	// 1484 1975:astore          55
		byte abyte55[] = {
			2, 2, 1, 4, 1, 1
		};
	// 1485 1977:bipush          6
	// 1486 1979:newarray        byte[]
	// 1487 1981:dup             
	// 1488 1982:iconst_0        
	// 1489 1983:ldc1            #56  <Int 2>
	// 1490 1985:bastore         
	// 1491 1986:dup             
	// 1492 1987:iconst_1        
	// 1493 1988:ldc1            #56  <Int 2>
	// 1494 1990:bastore         
	// 1495 1991:dup             
	// 1496 1992:iconst_2        
	// 1497 1993:ldc1            #57  <Int 1>
	// 1498 1995:bastore         
	// 1499 1996:dup             
	// 1500 1997:iconst_3        
	// 1501 1998:ldc1            #59  <Int 4>
	// 1502 2000:bastore         
	// 1503 2001:dup             
	// 1504 2002:iconst_4        
	// 1505 2003:ldc1            #57  <Int 1>
	// 1506 2005:bastore         
	// 1507 2006:dup             
	// 1508 2007:iconst_5        
	// 1509 2008:ldc1            #57  <Int 1>
	// 1510 2010:bastore         
	// 1511 2011:astore          56
		byte abyte56[] = {
			4, 3, 1, 1, 1, 1
		};
	// 1512 2013:bipush          6
	// 1513 2015:newarray        byte[]
	// 1514 2017:dup             
	// 1515 2018:iconst_0        
	// 1516 2019:ldc1            #59  <Int 4>
	// 1517 2021:bastore         
	// 1518 2022:dup             
	// 1519 2023:iconst_1        
	// 1520 2024:ldc1            #58  <Int 3>
	// 1521 2026:bastore         
	// 1522 2027:dup             
	// 1523 2028:iconst_2        
	// 1524 2029:ldc1            #57  <Int 1>
	// 1525 2031:bastore         
	// 1526 2032:dup             
	// 1527 2033:iconst_3        
	// 1528 2034:ldc1            #57  <Int 1>
	// 1529 2036:bastore         
	// 1530 2037:dup             
	// 1531 2038:iconst_4        
	// 1532 2039:ldc1            #57  <Int 1>
	// 1533 2041:bastore         
	// 1534 2042:dup             
	// 1535 2043:iconst_5        
	// 1536 2044:ldc1            #57  <Int 1>
	// 1537 2046:bastore         
	// 1538 2047:astore          57
		byte abyte57[] = {
			1, 2, 1, 4, 2, 1
		};
	// 1539 2049:bipush          6
	// 1540 2051:newarray        byte[]
	// 1541 2053:dup             
	// 1542 2054:iconst_0        
	// 1543 2055:ldc1            #57  <Int 1>
	// 1544 2057:bastore         
	// 1545 2058:dup             
	// 1546 2059:iconst_1        
	// 1547 2060:ldc1            #56  <Int 2>
	// 1548 2062:bastore         
	// 1549 2063:dup             
	// 1550 2064:iconst_2        
	// 1551 2065:ldc1            #57  <Int 1>
	// 1552 2067:bastore         
	// 1553 2068:dup             
	// 1554 2069:iconst_3        
	// 1555 2070:ldc1            #59  <Int 4>
	// 1556 2072:bastore         
	// 1557 2073:dup             
	// 1558 2074:iconst_4        
	// 1559 2075:ldc1            #56  <Int 2>
	// 1560 2077:bastore         
	// 1561 2078:dup             
	// 1562 2079:iconst_5        
	// 1563 2080:ldc1            #57  <Int 1>
	// 1564 2082:bastore         
	// 1565 2083:astore          58
		byte abyte58[] = {
			1, 4, 1, 1, 2, 2
		};
	// 1566 2085:bipush          6
	// 1567 2087:newarray        byte[]
	// 1568 2089:dup             
	// 1569 2090:iconst_0        
	// 1570 2091:ldc1            #57  <Int 1>
	// 1571 2093:bastore         
	// 1572 2094:dup             
	// 1573 2095:iconst_1        
	// 1574 2096:ldc1            #59  <Int 4>
	// 1575 2098:bastore         
	// 1576 2099:dup             
	// 1577 2100:iconst_2        
	// 1578 2101:ldc1            #57  <Int 1>
	// 1579 2103:bastore         
	// 1580 2104:dup             
	// 1581 2105:iconst_3        
	// 1582 2106:ldc1            #57  <Int 1>
	// 1583 2108:bastore         
	// 1584 2109:dup             
	// 1585 2110:iconst_4        
	// 1586 2111:ldc1            #56  <Int 2>
	// 1587 2113:bastore         
	// 1588 2114:dup             
	// 1589 2115:iconst_5        
	// 1590 2116:ldc1            #56  <Int 2>
	// 1591 2118:bastore         
	// 1592 2119:astore          59
		byte abyte59[] = {
			1, 4, 1, 2, 2, 1
		};
	// 1593 2121:bipush          6
	// 1594 2123:newarray        byte[]
	// 1595 2125:dup             
	// 1596 2126:iconst_0        
	// 1597 2127:ldc1            #57  <Int 1>
	// 1598 2129:bastore         
	// 1599 2130:dup             
	// 1600 2131:iconst_1        
	// 1601 2132:ldc1            #59  <Int 4>
	// 1602 2134:bastore         
	// 1603 2135:dup             
	// 1604 2136:iconst_2        
	// 1605 2137:ldc1            #57  <Int 1>
	// 1606 2139:bastore         
	// 1607 2140:dup             
	// 1608 2141:iconst_3        
	// 1609 2142:ldc1            #56  <Int 2>
	// 1610 2144:bastore         
	// 1611 2145:dup             
	// 1612 2146:iconst_4        
	// 1613 2147:ldc1            #56  <Int 2>
	// 1614 2149:bastore         
	// 1615 2150:dup             
	// 1616 2151:iconst_5        
	// 1617 2152:ldc1            #57  <Int 1>
	// 1618 2154:bastore         
	// 1619 2155:astore          60
		byte abyte60[] = {
			1, 1, 2, 2, 1, 4
		};
	// 1620 2157:bipush          6
	// 1621 2159:newarray        byte[]
	// 1622 2161:dup             
	// 1623 2162:iconst_0        
	// 1624 2163:ldc1            #57  <Int 1>
	// 1625 2165:bastore         
	// 1626 2166:dup             
	// 1627 2167:iconst_1        
	// 1628 2168:ldc1            #57  <Int 1>
	// 1629 2170:bastore         
	// 1630 2171:dup             
	// 1631 2172:iconst_2        
	// 1632 2173:ldc1            #56  <Int 2>
	// 1633 2175:bastore         
	// 1634 2176:dup             
	// 1635 2177:iconst_3        
	// 1636 2178:ldc1            #56  <Int 2>
	// 1637 2180:bastore         
	// 1638 2181:dup             
	// 1639 2182:iconst_4        
	// 1640 2183:ldc1            #57  <Int 1>
	// 1641 2185:bastore         
	// 1642 2186:dup             
	// 1643 2187:iconst_5        
	// 1644 2188:ldc1            #59  <Int 4>
	// 1645 2190:bastore         
	// 1646 2191:astore          61
		byte abyte61[] = {
			1, 2, 2, 1, 1, 4
		};
	// 1647 2193:bipush          6
	// 1648 2195:newarray        byte[]
	// 1649 2197:dup             
	// 1650 2198:iconst_0        
	// 1651 2199:ldc1            #57  <Int 1>
	// 1652 2201:bastore         
	// 1653 2202:dup             
	// 1654 2203:iconst_1        
	// 1655 2204:ldc1            #56  <Int 2>
	// 1656 2206:bastore         
	// 1657 2207:dup             
	// 1658 2208:iconst_2        
	// 1659 2209:ldc1            #56  <Int 2>
	// 1660 2211:bastore         
	// 1661 2212:dup             
	// 1662 2213:iconst_3        
	// 1663 2214:ldc1            #57  <Int 1>
	// 1664 2216:bastore         
	// 1665 2217:dup             
	// 1666 2218:iconst_4        
	// 1667 2219:ldc1            #57  <Int 1>
	// 1668 2221:bastore         
	// 1669 2222:dup             
	// 1670 2223:iconst_5        
	// 1671 2224:ldc1            #59  <Int 4>
	// 1672 2226:bastore         
	// 1673 2227:astore          62
		byte abyte62[] = {
			1, 4, 2, 1, 1, 2
		};
	// 1674 2229:bipush          6
	// 1675 2231:newarray        byte[]
	// 1676 2233:dup             
	// 1677 2234:iconst_0        
	// 1678 2235:ldc1            #57  <Int 1>
	// 1679 2237:bastore         
	// 1680 2238:dup             
	// 1681 2239:iconst_1        
	// 1682 2240:ldc1            #59  <Int 4>
	// 1683 2242:bastore         
	// 1684 2243:dup             
	// 1685 2244:iconst_2        
	// 1686 2245:ldc1            #56  <Int 2>
	// 1687 2247:bastore         
	// 1688 2248:dup             
	// 1689 2249:iconst_3        
	// 1690 2250:ldc1            #57  <Int 1>
	// 1691 2252:bastore         
	// 1692 2253:dup             
	// 1693 2254:iconst_4        
	// 1694 2255:ldc1            #57  <Int 1>
	// 1695 2257:bastore         
	// 1696 2258:dup             
	// 1697 2259:iconst_5        
	// 1698 2260:ldc1            #56  <Int 2>
	// 1699 2262:bastore         
	// 1700 2263:astore          63
		byte abyte63[] = {
			1, 4, 2, 2, 1, 1
		};
	// 1701 2265:bipush          6
	// 1702 2267:newarray        byte[]
	// 1703 2269:dup             
	// 1704 2270:iconst_0        
	// 1705 2271:ldc1            #57  <Int 1>
	// 1706 2273:bastore         
	// 1707 2274:dup             
	// 1708 2275:iconst_1        
	// 1709 2276:ldc1            #59  <Int 4>
	// 1710 2278:bastore         
	// 1711 2279:dup             
	// 1712 2280:iconst_2        
	// 1713 2281:ldc1            #56  <Int 2>
	// 1714 2283:bastore         
	// 1715 2284:dup             
	// 1716 2285:iconst_3        
	// 1717 2286:ldc1            #56  <Int 2>
	// 1718 2288:bastore         
	// 1719 2289:dup             
	// 1720 2290:iconst_4        
	// 1721 2291:ldc1            #57  <Int 1>
	// 1722 2293:bastore         
	// 1723 2294:dup             
	// 1724 2295:iconst_5        
	// 1725 2296:ldc1            #57  <Int 1>
	// 1726 2298:bastore         
	// 1727 2299:astore          64
		byte abyte64[] = {
			2, 2, 1, 1, 1, 4
		};
	// 1728 2301:bipush          6
	// 1729 2303:newarray        byte[]
	// 1730 2305:dup             
	// 1731 2306:iconst_0        
	// 1732 2307:ldc1            #56  <Int 2>
	// 1733 2309:bastore         
	// 1734 2310:dup             
	// 1735 2311:iconst_1        
	// 1736 2312:ldc1            #56  <Int 2>
	// 1737 2314:bastore         
	// 1738 2315:dup             
	// 1739 2316:iconst_2        
	// 1740 2317:ldc1            #57  <Int 1>
	// 1741 2319:bastore         
	// 1742 2320:dup             
	// 1743 2321:iconst_3        
	// 1744 2322:ldc1            #57  <Int 1>
	// 1745 2324:bastore         
	// 1746 2325:dup             
	// 1747 2326:iconst_4        
	// 1748 2327:ldc1            #57  <Int 1>
	// 1749 2329:bastore         
	// 1750 2330:dup             
	// 1751 2331:iconst_5        
	// 1752 2332:ldc1            #59  <Int 4>
	// 1753 2334:bastore         
	// 1754 2335:astore          65
		byte abyte65[] = {
			2, 4, 1, 1, 1, 2
		};
	// 1755 2337:bipush          6
	// 1756 2339:newarray        byte[]
	// 1757 2341:dup             
	// 1758 2342:iconst_0        
	// 1759 2343:ldc1            #56  <Int 2>
	// 1760 2345:bastore         
	// 1761 2346:dup             
	// 1762 2347:iconst_1        
	// 1763 2348:ldc1            #59  <Int 4>
	// 1764 2350:bastore         
	// 1765 2351:dup             
	// 1766 2352:iconst_2        
	// 1767 2353:ldc1            #57  <Int 1>
	// 1768 2355:bastore         
	// 1769 2356:dup             
	// 1770 2357:iconst_3        
	// 1771 2358:ldc1            #57  <Int 1>
	// 1772 2360:bastore         
	// 1773 2361:dup             
	// 1774 2362:iconst_4        
	// 1775 2363:ldc1            #57  <Int 1>
	// 1776 2365:bastore         
	// 1777 2366:dup             
	// 1778 2367:iconst_5        
	// 1779 2368:ldc1            #56  <Int 2>
	// 1780 2370:bastore         
	// 1781 2371:astore          66
		byte abyte66[] = {
			1, 3, 4, 1, 1, 1
		};
	// 1782 2373:bipush          6
	// 1783 2375:newarray        byte[]
	// 1784 2377:dup             
	// 1785 2378:iconst_0        
	// 1786 2379:ldc1            #57  <Int 1>
	// 1787 2381:bastore         
	// 1788 2382:dup             
	// 1789 2383:iconst_1        
	// 1790 2384:ldc1            #58  <Int 3>
	// 1791 2386:bastore         
	// 1792 2387:dup             
	// 1793 2388:iconst_2        
	// 1794 2389:ldc1            #59  <Int 4>
	// 1795 2391:bastore         
	// 1796 2392:dup             
	// 1797 2393:iconst_3        
	// 1798 2394:ldc1            #57  <Int 1>
	// 1799 2396:bastore         
	// 1800 2397:dup             
	// 1801 2398:iconst_4        
	// 1802 2399:ldc1            #57  <Int 1>
	// 1803 2401:bastore         
	// 1804 2402:dup             
	// 1805 2403:iconst_5        
	// 1806 2404:ldc1            #57  <Int 1>
	// 1807 2406:bastore         
	// 1808 2407:astore          67
		byte abyte67[] = {
			1, 1, 1, 2, 4, 2
		};
	// 1809 2409:bipush          6
	// 1810 2411:newarray        byte[]
	// 1811 2413:dup             
	// 1812 2414:iconst_0        
	// 1813 2415:ldc1            #57  <Int 1>
	// 1814 2417:bastore         
	// 1815 2418:dup             
	// 1816 2419:iconst_1        
	// 1817 2420:ldc1            #57  <Int 1>
	// 1818 2422:bastore         
	// 1819 2423:dup             
	// 1820 2424:iconst_2        
	// 1821 2425:ldc1            #57  <Int 1>
	// 1822 2427:bastore         
	// 1823 2428:dup             
	// 1824 2429:iconst_3        
	// 1825 2430:ldc1            #56  <Int 2>
	// 1826 2432:bastore         
	// 1827 2433:dup             
	// 1828 2434:iconst_4        
	// 1829 2435:ldc1            #59  <Int 4>
	// 1830 2437:bastore         
	// 1831 2438:dup             
	// 1832 2439:iconst_5        
	// 1833 2440:ldc1            #56  <Int 2>
	// 1834 2442:bastore         
	// 1835 2443:astore          68
		byte abyte68[] = {
			1, 2, 1, 1, 4, 2
		};
	// 1836 2445:bipush          6
	// 1837 2447:newarray        byte[]
	// 1838 2449:dup             
	// 1839 2450:iconst_0        
	// 1840 2451:ldc1            #57  <Int 1>
	// 1841 2453:bastore         
	// 1842 2454:dup             
	// 1843 2455:iconst_1        
	// 1844 2456:ldc1            #56  <Int 2>
	// 1845 2458:bastore         
	// 1846 2459:dup             
	// 1847 2460:iconst_2        
	// 1848 2461:ldc1            #57  <Int 1>
	// 1849 2463:bastore         
	// 1850 2464:dup             
	// 1851 2465:iconst_3        
	// 1852 2466:ldc1            #57  <Int 1>
	// 1853 2468:bastore         
	// 1854 2469:dup             
	// 1855 2470:iconst_4        
	// 1856 2471:ldc1            #59  <Int 4>
	// 1857 2473:bastore         
	// 1858 2474:dup             
	// 1859 2475:iconst_5        
	// 1860 2476:ldc1            #56  <Int 2>
	// 1861 2478:bastore         
	// 1862 2479:astore          69
		byte abyte69[] = {
			1, 2, 1, 2, 4, 1
		};
	// 1863 2481:bipush          6
	// 1864 2483:newarray        byte[]
	// 1865 2485:dup             
	// 1866 2486:iconst_0        
	// 1867 2487:ldc1            #57  <Int 1>
	// 1868 2489:bastore         
	// 1869 2490:dup             
	// 1870 2491:iconst_1        
	// 1871 2492:ldc1            #56  <Int 2>
	// 1872 2494:bastore         
	// 1873 2495:dup             
	// 1874 2496:iconst_2        
	// 1875 2497:ldc1            #57  <Int 1>
	// 1876 2499:bastore         
	// 1877 2500:dup             
	// 1878 2501:iconst_3        
	// 1879 2502:ldc1            #56  <Int 2>
	// 1880 2504:bastore         
	// 1881 2505:dup             
	// 1882 2506:iconst_4        
	// 1883 2507:ldc1            #59  <Int 4>
	// 1884 2509:bastore         
	// 1885 2510:dup             
	// 1886 2511:iconst_5        
	// 1887 2512:ldc1            #57  <Int 1>
	// 1888 2514:bastore         
	// 1889 2515:astore          70
		byte abyte70[] = {
			1, 1, 4, 2, 1, 2
		};
	// 1890 2517:bipush          6
	// 1891 2519:newarray        byte[]
	// 1892 2521:dup             
	// 1893 2522:iconst_0        
	// 1894 2523:ldc1            #57  <Int 1>
	// 1895 2525:bastore         
	// 1896 2526:dup             
	// 1897 2527:iconst_1        
	// 1898 2528:ldc1            #57  <Int 1>
	// 1899 2530:bastore         
	// 1900 2531:dup             
	// 1901 2532:iconst_2        
	// 1902 2533:ldc1            #59  <Int 4>
	// 1903 2535:bastore         
	// 1904 2536:dup             
	// 1905 2537:iconst_3        
	// 1906 2538:ldc1            #56  <Int 2>
	// 1907 2540:bastore         
	// 1908 2541:dup             
	// 1909 2542:iconst_4        
	// 1910 2543:ldc1            #57  <Int 1>
	// 1911 2545:bastore         
	// 1912 2546:dup             
	// 1913 2547:iconst_5        
	// 1914 2548:ldc1            #56  <Int 2>
	// 1915 2550:bastore         
	// 1916 2551:astore          71
		byte abyte71[] = {
			1, 2, 4, 1, 1, 2
		};
	// 1917 2553:bipush          6
	// 1918 2555:newarray        byte[]
	// 1919 2557:dup             
	// 1920 2558:iconst_0        
	// 1921 2559:ldc1            #57  <Int 1>
	// 1922 2561:bastore         
	// 1923 2562:dup             
	// 1924 2563:iconst_1        
	// 1925 2564:ldc1            #56  <Int 2>
	// 1926 2566:bastore         
	// 1927 2567:dup             
	// 1928 2568:iconst_2        
	// 1929 2569:ldc1            #59  <Int 4>
	// 1930 2571:bastore         
	// 1931 2572:dup             
	// 1932 2573:iconst_3        
	// 1933 2574:ldc1            #57  <Int 1>
	// 1934 2576:bastore         
	// 1935 2577:dup             
	// 1936 2578:iconst_4        
	// 1937 2579:ldc1            #57  <Int 1>
	// 1938 2581:bastore         
	// 1939 2582:dup             
	// 1940 2583:iconst_5        
	// 1941 2584:ldc1            #56  <Int 2>
	// 1942 2586:bastore         
	// 1943 2587:astore          72
		byte abyte72[] = {
			1, 2, 4, 2, 1, 1
		};
	// 1944 2589:bipush          6
	// 1945 2591:newarray        byte[]
	// 1946 2593:dup             
	// 1947 2594:iconst_0        
	// 1948 2595:ldc1            #57  <Int 1>
	// 1949 2597:bastore         
	// 1950 2598:dup             
	// 1951 2599:iconst_1        
	// 1952 2600:ldc1            #56  <Int 2>
	// 1953 2602:bastore         
	// 1954 2603:dup             
	// 1955 2604:iconst_2        
	// 1956 2605:ldc1            #59  <Int 4>
	// 1957 2607:bastore         
	// 1958 2608:dup             
	// 1959 2609:iconst_3        
	// 1960 2610:ldc1            #56  <Int 2>
	// 1961 2612:bastore         
	// 1962 2613:dup             
	// 1963 2614:iconst_4        
	// 1964 2615:ldc1            #57  <Int 1>
	// 1965 2617:bastore         
	// 1966 2618:dup             
	// 1967 2619:iconst_5        
	// 1968 2620:ldc1            #57  <Int 1>
	// 1969 2622:bastore         
	// 1970 2623:astore          73
		byte abyte73[] = {
			4, 1, 1, 2, 1, 2
		};
	// 1971 2625:bipush          6
	// 1972 2627:newarray        byte[]
	// 1973 2629:dup             
	// 1974 2630:iconst_0        
	// 1975 2631:ldc1            #59  <Int 4>
	// 1976 2633:bastore         
	// 1977 2634:dup             
	// 1978 2635:iconst_1        
	// 1979 2636:ldc1            #57  <Int 1>
	// 1980 2638:bastore         
	// 1981 2639:dup             
	// 1982 2640:iconst_2        
	// 1983 2641:ldc1            #57  <Int 1>
	// 1984 2643:bastore         
	// 1985 2644:dup             
	// 1986 2645:iconst_3        
	// 1987 2646:ldc1            #56  <Int 2>
	// 1988 2648:bastore         
	// 1989 2649:dup             
	// 1990 2650:iconst_4        
	// 1991 2651:ldc1            #57  <Int 1>
	// 1992 2653:bastore         
	// 1993 2654:dup             
	// 1994 2655:iconst_5        
	// 1995 2656:ldc1            #56  <Int 2>
	// 1996 2658:bastore         
	// 1997 2659:astore          74
		byte abyte74[] = {
			4, 2, 1, 1, 1, 2
		};
	// 1998 2661:bipush          6
	// 1999 2663:newarray        byte[]
	// 2000 2665:dup             
	// 2001 2666:iconst_0        
	// 2002 2667:ldc1            #59  <Int 4>
	// 2003 2669:bastore         
	// 2004 2670:dup             
	// 2005 2671:iconst_1        
	// 2006 2672:ldc1            #56  <Int 2>
	// 2007 2674:bastore         
	// 2008 2675:dup             
	// 2009 2676:iconst_2        
	// 2010 2677:ldc1            #57  <Int 1>
	// 2011 2679:bastore         
	// 2012 2680:dup             
	// 2013 2681:iconst_3        
	// 2014 2682:ldc1            #57  <Int 1>
	// 2015 2684:bastore         
	// 2016 2685:dup             
	// 2017 2686:iconst_4        
	// 2018 2687:ldc1            #57  <Int 1>
	// 2019 2689:bastore         
	// 2020 2690:dup             
	// 2021 2691:iconst_5        
	// 2022 2692:ldc1            #56  <Int 2>
	// 2023 2694:bastore         
	// 2024 2695:astore          75
		byte abyte75[] = {
			2, 1, 2, 1, 4, 1
		};
	// 2025 2697:bipush          6
	// 2026 2699:newarray        byte[]
	// 2027 2701:dup             
	// 2028 2702:iconst_0        
	// 2029 2703:ldc1            #56  <Int 2>
	// 2030 2705:bastore         
	// 2031 2706:dup             
	// 2032 2707:iconst_1        
	// 2033 2708:ldc1            #57  <Int 1>
	// 2034 2710:bastore         
	// 2035 2711:dup             
	// 2036 2712:iconst_2        
	// 2037 2713:ldc1            #56  <Int 2>
	// 2038 2715:bastore         
	// 2039 2716:dup             
	// 2040 2717:iconst_3        
	// 2041 2718:ldc1            #57  <Int 1>
	// 2042 2720:bastore         
	// 2043 2721:dup             
	// 2044 2722:iconst_4        
	// 2045 2723:ldc1            #59  <Int 4>
	// 2046 2725:bastore         
	// 2047 2726:dup             
	// 2048 2727:iconst_5        
	// 2049 2728:ldc1            #57  <Int 1>
	// 2050 2730:bastore         
	// 2051 2731:astore          76
		byte abyte76[] = {
			2, 1, 4, 1, 2, 1
		};
	// 2052 2733:bipush          6
	// 2053 2735:newarray        byte[]
	// 2054 2737:dup             
	// 2055 2738:iconst_0        
	// 2056 2739:ldc1            #56  <Int 2>
	// 2057 2741:bastore         
	// 2058 2742:dup             
	// 2059 2743:iconst_1        
	// 2060 2744:ldc1            #57  <Int 1>
	// 2061 2746:bastore         
	// 2062 2747:dup             
	// 2063 2748:iconst_2        
	// 2064 2749:ldc1            #59  <Int 4>
	// 2065 2751:bastore         
	// 2066 2752:dup             
	// 2067 2753:iconst_3        
	// 2068 2754:ldc1            #57  <Int 1>
	// 2069 2756:bastore         
	// 2070 2757:dup             
	// 2071 2758:iconst_4        
	// 2072 2759:ldc1            #56  <Int 2>
	// 2073 2761:bastore         
	// 2074 2762:dup             
	// 2075 2763:iconst_5        
	// 2076 2764:ldc1            #57  <Int 1>
	// 2077 2766:bastore         
	// 2078 2767:astore          77
		byte abyte77[] = {
			4, 1, 2, 1, 2, 1
		};
	// 2079 2769:bipush          6
	// 2080 2771:newarray        byte[]
	// 2081 2773:dup             
	// 2082 2774:iconst_0        
	// 2083 2775:ldc1            #59  <Int 4>
	// 2084 2777:bastore         
	// 2085 2778:dup             
	// 2086 2779:iconst_1        
	// 2087 2780:ldc1            #57  <Int 1>
	// 2088 2782:bastore         
	// 2089 2783:dup             
	// 2090 2784:iconst_2        
	// 2091 2785:ldc1            #56  <Int 2>
	// 2092 2787:bastore         
	// 2093 2788:dup             
	// 2094 2789:iconst_3        
	// 2095 2790:ldc1            #57  <Int 1>
	// 2096 2792:bastore         
	// 2097 2793:dup             
	// 2098 2794:iconst_4        
	// 2099 2795:ldc1            #56  <Int 2>
	// 2100 2797:bastore         
	// 2101 2798:dup             
	// 2102 2799:iconst_5        
	// 2103 2800:ldc1            #57  <Int 1>
	// 2104 2802:bastore         
	// 2105 2803:astore          78
		byte abyte78[] = {
			1, 1, 1, 1, 4, 3
		};
	// 2106 2805:bipush          6
	// 2107 2807:newarray        byte[]
	// 2108 2809:dup             
	// 2109 2810:iconst_0        
	// 2110 2811:ldc1            #57  <Int 1>
	// 2111 2813:bastore         
	// 2112 2814:dup             
	// 2113 2815:iconst_1        
	// 2114 2816:ldc1            #57  <Int 1>
	// 2115 2818:bastore         
	// 2116 2819:dup             
	// 2117 2820:iconst_2        
	// 2118 2821:ldc1            #57  <Int 1>
	// 2119 2823:bastore         
	// 2120 2824:dup             
	// 2121 2825:iconst_3        
	// 2122 2826:ldc1            #57  <Int 1>
	// 2123 2828:bastore         
	// 2124 2829:dup             
	// 2125 2830:iconst_4        
	// 2126 2831:ldc1            #59  <Int 4>
	// 2127 2833:bastore         
	// 2128 2834:dup             
	// 2129 2835:iconst_5        
	// 2130 2836:ldc1            #58  <Int 3>
	// 2131 2838:bastore         
	// 2132 2839:astore          79
		byte abyte79[] = {
			1, 1, 1, 3, 4, 1
		};
	// 2133 2841:bipush          6
	// 2134 2843:newarray        byte[]
	// 2135 2845:dup             
	// 2136 2846:iconst_0        
	// 2137 2847:ldc1            #57  <Int 1>
	// 2138 2849:bastore         
	// 2139 2850:dup             
	// 2140 2851:iconst_1        
	// 2141 2852:ldc1            #57  <Int 1>
	// 2142 2854:bastore         
	// 2143 2855:dup             
	// 2144 2856:iconst_2        
	// 2145 2857:ldc1            #57  <Int 1>
	// 2146 2859:bastore         
	// 2147 2860:dup             
	// 2148 2861:iconst_3        
	// 2149 2862:ldc1            #58  <Int 3>
	// 2150 2864:bastore         
	// 2151 2865:dup             
	// 2152 2866:iconst_4        
	// 2153 2867:ldc1            #59  <Int 4>
	// 2154 2869:bastore         
	// 2155 2870:dup             
	// 2156 2871:iconst_5        
	// 2157 2872:ldc1            #57  <Int 1>
	// 2158 2874:bastore         
	// 2159 2875:astore          80
		byte abyte80[] = {
			1, 1, 4, 1, 1, 3
		};
	// 2160 2877:bipush          6
	// 2161 2879:newarray        byte[]
	// 2162 2881:dup             
	// 2163 2882:iconst_0        
	// 2164 2883:ldc1            #57  <Int 1>
	// 2165 2885:bastore         
	// 2166 2886:dup             
	// 2167 2887:iconst_1        
	// 2168 2888:ldc1            #57  <Int 1>
	// 2169 2890:bastore         
	// 2170 2891:dup             
	// 2171 2892:iconst_2        
	// 2172 2893:ldc1            #59  <Int 4>
	// 2173 2895:bastore         
	// 2174 2896:dup             
	// 2175 2897:iconst_3        
	// 2176 2898:ldc1            #57  <Int 1>
	// 2177 2900:bastore         
	// 2178 2901:dup             
	// 2179 2902:iconst_4        
	// 2180 2903:ldc1            #57  <Int 1>
	// 2181 2905:bastore         
	// 2182 2906:dup             
	// 2183 2907:iconst_5        
	// 2184 2908:ldc1            #58  <Int 3>
	// 2185 2910:bastore         
	// 2186 2911:astore          81
		byte abyte81[] = {
			1, 1, 4, 3, 1, 1
		};
	// 2187 2913:bipush          6
	// 2188 2915:newarray        byte[]
	// 2189 2917:dup             
	// 2190 2918:iconst_0        
	// 2191 2919:ldc1            #57  <Int 1>
	// 2192 2921:bastore         
	// 2193 2922:dup             
	// 2194 2923:iconst_1        
	// 2195 2924:ldc1            #57  <Int 1>
	// 2196 2926:bastore         
	// 2197 2927:dup             
	// 2198 2928:iconst_2        
	// 2199 2929:ldc1            #59  <Int 4>
	// 2200 2931:bastore         
	// 2201 2932:dup             
	// 2202 2933:iconst_3        
	// 2203 2934:ldc1            #58  <Int 3>
	// 2204 2936:bastore         
	// 2205 2937:dup             
	// 2206 2938:iconst_4        
	// 2207 2939:ldc1            #57  <Int 1>
	// 2208 2941:bastore         
	// 2209 2942:dup             
	// 2210 2943:iconst_5        
	// 2211 2944:ldc1            #57  <Int 1>
	// 2212 2946:bastore         
	// 2213 2947:astore          82
		byte abyte82[] = {
			4, 1, 1, 1, 1, 3
		};
	// 2214 2949:bipush          6
	// 2215 2951:newarray        byte[]
	// 2216 2953:dup             
	// 2217 2954:iconst_0        
	// 2218 2955:ldc1            #59  <Int 4>
	// 2219 2957:bastore         
	// 2220 2958:dup             
	// 2221 2959:iconst_1        
	// 2222 2960:ldc1            #57  <Int 1>
	// 2223 2962:bastore         
	// 2224 2963:dup             
	// 2225 2964:iconst_2        
	// 2226 2965:ldc1            #57  <Int 1>
	// 2227 2967:bastore         
	// 2228 2968:dup             
	// 2229 2969:iconst_3        
	// 2230 2970:ldc1            #57  <Int 1>
	// 2231 2972:bastore         
	// 2232 2973:dup             
	// 2233 2974:iconst_4        
	// 2234 2975:ldc1            #57  <Int 1>
	// 2235 2977:bastore         
	// 2236 2978:dup             
	// 2237 2979:iconst_5        
	// 2238 2980:ldc1            #58  <Int 3>
	// 2239 2982:bastore         
	// 2240 2983:astore          83
		byte abyte83[] = {
			4, 1, 1, 3, 1, 1
		};
	// 2241 2985:bipush          6
	// 2242 2987:newarray        byte[]
	// 2243 2989:dup             
	// 2244 2990:iconst_0        
	// 2245 2991:ldc1            #59  <Int 4>
	// 2246 2993:bastore         
	// 2247 2994:dup             
	// 2248 2995:iconst_1        
	// 2249 2996:ldc1            #57  <Int 1>
	// 2250 2998:bastore         
	// 2251 2999:dup             
	// 2252 3000:iconst_2        
	// 2253 3001:ldc1            #57  <Int 1>
	// 2254 3003:bastore         
	// 2255 3004:dup             
	// 2256 3005:iconst_3        
	// 2257 3006:ldc1            #58  <Int 3>
	// 2258 3008:bastore         
	// 2259 3009:dup             
	// 2260 3010:iconst_4        
	// 2261 3011:ldc1            #57  <Int 1>
	// 2262 3013:bastore         
	// 2263 3014:dup             
	// 2264 3015:iconst_5        
	// 2265 3016:ldc1            #57  <Int 1>
	// 2266 3018:bastore         
	// 2267 3019:astore          84
		byte abyte84[] = {
			1, 1, 4, 1, 3, 1
		};
	// 2268 3021:bipush          6
	// 2269 3023:newarray        byte[]
	// 2270 3025:dup             
	// 2271 3026:iconst_0        
	// 2272 3027:ldc1            #57  <Int 1>
	// 2273 3029:bastore         
	// 2274 3030:dup             
	// 2275 3031:iconst_1        
	// 2276 3032:ldc1            #57  <Int 1>
	// 2277 3034:bastore         
	// 2278 3035:dup             
	// 2279 3036:iconst_2        
	// 2280 3037:ldc1            #59  <Int 4>
	// 2281 3039:bastore         
	// 2282 3040:dup             
	// 2283 3041:iconst_3        
	// 2284 3042:ldc1            #57  <Int 1>
	// 2285 3044:bastore         
	// 2286 3045:dup             
	// 2287 3046:iconst_4        
	// 2288 3047:ldc1            #58  <Int 3>
	// 2289 3049:bastore         
	// 2290 3050:dup             
	// 2291 3051:iconst_5        
	// 2292 3052:ldc1            #57  <Int 1>
	// 2293 3054:bastore         
	// 2294 3055:astore          85
		byte abyte85[] = {
			3, 1, 1, 1, 4, 1
		};
	// 2295 3057:bipush          6
	// 2296 3059:newarray        byte[]
	// 2297 3061:dup             
	// 2298 3062:iconst_0        
	// 2299 3063:ldc1            #58  <Int 3>
	// 2300 3065:bastore         
	// 2301 3066:dup             
	// 2302 3067:iconst_1        
	// 2303 3068:ldc1            #57  <Int 1>
	// 2304 3070:bastore         
	// 2305 3071:dup             
	// 2306 3072:iconst_2        
	// 2307 3073:ldc1            #57  <Int 1>
	// 2308 3075:bastore         
	// 2309 3076:dup             
	// 2310 3077:iconst_3        
	// 2311 3078:ldc1            #57  <Int 1>
	// 2312 3080:bastore         
	// 2313 3081:dup             
	// 2314 3082:iconst_4        
	// 2315 3083:ldc1            #59  <Int 4>
	// 2316 3085:bastore         
	// 2317 3086:dup             
	// 2318 3087:iconst_5        
	// 2319 3088:ldc1            #57  <Int 1>
	// 2320 3090:bastore         
	// 2321 3091:astore          86
		byte abyte86[] = {
			4, 1, 1, 1, 3, 1
		};
	// 2322 3093:bipush          6
	// 2323 3095:newarray        byte[]
	// 2324 3097:dup             
	// 2325 3098:iconst_0        
	// 2326 3099:ldc1            #59  <Int 4>
	// 2327 3101:bastore         
	// 2328 3102:dup             
	// 2329 3103:iconst_1        
	// 2330 3104:ldc1            #57  <Int 1>
	// 2331 3106:bastore         
	// 2332 3107:dup             
	// 2333 3108:iconst_2        
	// 2334 3109:ldc1            #57  <Int 1>
	// 2335 3111:bastore         
	// 2336 3112:dup             
	// 2337 3113:iconst_3        
	// 2338 3114:ldc1            #57  <Int 1>
	// 2339 3116:bastore         
	// 2340 3117:dup             
	// 2341 3118:iconst_4        
	// 2342 3119:ldc1            #58  <Int 3>
	// 2343 3121:bastore         
	// 2344 3122:dup             
	// 2345 3123:iconst_5        
	// 2346 3124:ldc1            #57  <Int 1>
	// 2347 3126:bastore         
	// 2348 3127:astore          87
		byte abyte87[] = {
			2, 1, 1, 4, 1, 2
		};
	// 2349 3129:bipush          6
	// 2350 3131:newarray        byte[]
	// 2351 3133:dup             
	// 2352 3134:iconst_0        
	// 2353 3135:ldc1            #56  <Int 2>
	// 2354 3137:bastore         
	// 2355 3138:dup             
	// 2356 3139:iconst_1        
	// 2357 3140:ldc1            #57  <Int 1>
	// 2358 3142:bastore         
	// 2359 3143:dup             
	// 2360 3144:iconst_2        
	// 2361 3145:ldc1            #57  <Int 1>
	// 2362 3147:bastore         
	// 2363 3148:dup             
	// 2364 3149:iconst_3        
	// 2365 3150:ldc1            #59  <Int 4>
	// 2366 3152:bastore         
	// 2367 3153:dup             
	// 2368 3154:iconst_4        
	// 2369 3155:ldc1            #57  <Int 1>
	// 2370 3157:bastore         
	// 2371 3158:dup             
	// 2372 3159:iconst_5        
	// 2373 3160:ldc1            #56  <Int 2>
	// 2374 3162:bastore         
	// 2375 3163:astore          88
		byte abyte88[] = {
			2, 1, 1, 2, 1, 4
		};
	// 2376 3165:bipush          6
	// 2377 3167:newarray        byte[]
	// 2378 3169:dup             
	// 2379 3170:iconst_0        
	// 2380 3171:ldc1            #56  <Int 2>
	// 2381 3173:bastore         
	// 2382 3174:dup             
	// 2383 3175:iconst_1        
	// 2384 3176:ldc1            #57  <Int 1>
	// 2385 3178:bastore         
	// 2386 3179:dup             
	// 2387 3180:iconst_2        
	// 2388 3181:ldc1            #57  <Int 1>
	// 2389 3183:bastore         
	// 2390 3184:dup             
	// 2391 3185:iconst_3        
	// 2392 3186:ldc1            #56  <Int 2>
	// 2393 3188:bastore         
	// 2394 3189:dup             
	// 2395 3190:iconst_4        
	// 2396 3191:ldc1            #57  <Int 1>
	// 2397 3193:bastore         
	// 2398 3194:dup             
	// 2399 3195:iconst_5        
	// 2400 3196:ldc1            #59  <Int 4>
	// 2401 3198:bastore         
	// 2402 3199:astore          89
		byte abyte89[] = {
			2, 1, 1, 2, 3, 2
		};
	// 2403 3201:bipush          6
	// 2404 3203:newarray        byte[]
	// 2405 3205:dup             
	// 2406 3206:iconst_0        
	// 2407 3207:ldc1            #56  <Int 2>
	// 2408 3209:bastore         
	// 2409 3210:dup             
	// 2410 3211:iconst_1        
	// 2411 3212:ldc1            #57  <Int 1>
	// 2412 3214:bastore         
	// 2413 3215:dup             
	// 2414 3216:iconst_2        
	// 2415 3217:ldc1            #57  <Int 1>
	// 2416 3219:bastore         
	// 2417 3220:dup             
	// 2418 3221:iconst_3        
	// 2419 3222:ldc1            #56  <Int 2>
	// 2420 3224:bastore         
	// 2421 3225:dup             
	// 2422 3226:iconst_4        
	// 2423 3227:ldc1            #58  <Int 3>
	// 2424 3229:bastore         
	// 2425 3230:dup             
	// 2426 3231:iconst_5        
	// 2427 3232:ldc1            #56  <Int 2>
	// 2428 3234:bastore         
	// 2429 3235:astore          90
		BARS = (new byte[][] {
			abyte0, abyte1, abyte2, new byte[] {
				1, 2, 1, 2, 2, 3
			}, abyte3, abyte4, abyte5, abyte6, abyte7, abyte8, 
			abyte9, abyte10, new byte[] {
				1, 1, 2, 2, 3, 2
			}, abyte11, abyte12, abyte13, abyte14, new byte[] {
				1, 2, 3, 2, 2, 1
			}, abyte15, abyte16, 
			abyte17, abyte18, abyte19, abyte20, abyte21, abyte22, abyte23, abyte24, abyte25, abyte26, 
			abyte27, new byte[] {
				2, 1, 2, 3, 2, 1
			}, abyte28, abyte29, abyte30, new byte[] {
				1, 3, 1, 3, 2, 1
			}, abyte31, abyte32, abyte33, abyte34, 
			abyte35, abyte36, abyte37, abyte38, abyte39, abyte40, abyte41, abyte42, abyte43, abyte44, 
			abyte45, abyte46, abyte47, new byte[] {
				2, 1, 3, 1, 3, 1
			}, abyte48, abyte49, abyte50, abyte51, abyte52, abyte53, 
			abyte54, abyte55, abyte56, new byte[] {
				1, 1, 1, 2, 2, 4
			}, new byte[] {
				1, 1, 1, 4, 2, 2
			}, new byte[] {
				1, 2, 1, 1, 2, 4
			}, abyte57, abyte58, abyte59, abyte60, 
			new byte[] {
				1, 1, 2, 4, 1, 2
			}, abyte61, new byte[] {
				1, 2, 2, 4, 1, 1
			}, abyte62, abyte63, new byte[] {
				2, 4, 1, 2, 1, 1
			}, abyte64, new byte[] {
				4, 1, 3, 1, 1, 1
			}, abyte65, abyte66, 
			abyte67, abyte68, abyte69, abyte70, abyte71, abyte72, abyte73, abyte74, new byte[] {
				4, 2, 1, 2, 1, 1
			}, abyte75, 
			abyte76, abyte77, abyte78, abyte79, new byte[] {
				1, 3, 1, 1, 4, 1
			}, abyte80, abyte81, abyte82, abyte83, new byte[] {
				1, 1, 3, 1, 4, 1
			}, 
			abyte84, abyte85, abyte86, abyte87, abyte88, abyte89
		});
	// 2430 3237:bipush          106
	// 2431 3239:anewarray       byte[][]
	// 2432 3242:dup             
	// 2433 3243:iconst_0        
	// 2434 3244:aload_1         
	// 2435 3245:aastore         
	// 2436 3246:dup             
	// 2437 3247:iconst_1        
	// 2438 3248:aload_2         
	// 2439 3249:aastore         
	// 2440 3250:dup             
	// 2441 3251:iconst_2        
	// 2442 3252:aload_3         
	// 2443 3253:aastore         
	// 2444 3254:dup             
	// 2445 3255:iconst_3        
	// 2446 3256:bipush          6
	// 2447 3258:newarray        byte[]
	// 2448 3260:dup             
	// 2449 3261:iconst_0        
	// 2450 3262:ldc1            #57  <Int 1>
	// 2451 3264:bastore         
	// 2452 3265:dup             
	// 2453 3266:iconst_1        
	// 2454 3267:ldc1            #56  <Int 2>
	// 2455 3269:bastore         
	// 2456 3270:dup             
	// 2457 3271:iconst_2        
	// 2458 3272:ldc1            #57  <Int 1>
	// 2459 3274:bastore         
	// 2460 3275:dup             
	// 2461 3276:iconst_3        
	// 2462 3277:ldc1            #56  <Int 2>
	// 2463 3279:bastore         
	// 2464 3280:dup             
	// 2465 3281:iconst_4        
	// 2466 3282:ldc1            #56  <Int 2>
	// 2467 3284:bastore         
	// 2468 3285:dup             
	// 2469 3286:iconst_5        
	// 2470 3287:ldc1            #58  <Int 3>
	// 2471 3289:bastore         
	// 2472 3290:aastore         
	// 2473 3291:dup             
	// 2474 3292:iconst_4        
	// 2475 3293:aload           4
	// 2476 3295:aastore         
	// 2477 3296:dup             
	// 2478 3297:iconst_5        
	// 2479 3298:aload           5
	// 2480 3300:aastore         
	// 2481 3301:dup             
	// 2482 3302:bipush          6
	// 2483 3304:aload           6
	// 2484 3306:aastore         
	// 2485 3307:dup             
	// 2486 3308:bipush          7
	// 2487 3310:aload           7
	// 2488 3312:aastore         
	// 2489 3313:dup             
	// 2490 3314:bipush          8
	// 2491 3316:aload           8
	// 2492 3318:aastore         
	// 2493 3319:dup             
	// 2494 3320:bipush          9
	// 2495 3322:aload           9
	// 2496 3324:aastore         
	// 2497 3325:dup             
	// 2498 3326:bipush          10
	// 2499 3328:aload           10
	// 2500 3330:aastore         
	// 2501 3331:dup             
	// 2502 3332:bipush          11
	// 2503 3334:aload           11
	// 2504 3336:aastore         
	// 2505 3337:dup             
	// 2506 3338:bipush          12
	// 2507 3340:bipush          6
	// 2508 3342:newarray        byte[]
	// 2509 3344:dup             
	// 2510 3345:iconst_0        
	// 2511 3346:ldc1            #57  <Int 1>
	// 2512 3348:bastore         
	// 2513 3349:dup             
	// 2514 3350:iconst_1        
	// 2515 3351:ldc1            #57  <Int 1>
	// 2516 3353:bastore         
	// 2517 3354:dup             
	// 2518 3355:iconst_2        
	// 2519 3356:ldc1            #56  <Int 2>
	// 2520 3358:bastore         
	// 2521 3359:dup             
	// 2522 3360:iconst_3        
	// 2523 3361:ldc1            #56  <Int 2>
	// 2524 3363:bastore         
	// 2525 3364:dup             
	// 2526 3365:iconst_4        
	// 2527 3366:ldc1            #58  <Int 3>
	// 2528 3368:bastore         
	// 2529 3369:dup             
	// 2530 3370:iconst_5        
	// 2531 3371:ldc1            #56  <Int 2>
	// 2532 3373:bastore         
	// 2533 3374:aastore         
	// 2534 3375:dup             
	// 2535 3376:bipush          13
	// 2536 3378:aload           12
	// 2537 3380:aastore         
	// 2538 3381:dup             
	// 2539 3382:bipush          14
	// 2540 3384:aload           13
	// 2541 3386:aastore         
	// 2542 3387:dup             
	// 2543 3388:bipush          15
	// 2544 3390:aload           14
	// 2545 3392:aastore         
	// 2546 3393:dup             
	// 2547 3394:bipush          16
	// 2548 3396:aload           15
	// 2549 3398:aastore         
	// 2550 3399:dup             
	// 2551 3400:bipush          17
	// 2552 3402:bipush          6
	// 2553 3404:newarray        byte[]
	// 2554 3406:dup             
	// 2555 3407:iconst_0        
	// 2556 3408:ldc1            #57  <Int 1>
	// 2557 3410:bastore         
	// 2558 3411:dup             
	// 2559 3412:iconst_1        
	// 2560 3413:ldc1            #56  <Int 2>
	// 2561 3415:bastore         
	// 2562 3416:dup             
	// 2563 3417:iconst_2        
	// 2564 3418:ldc1            #58  <Int 3>
	// 2565 3420:bastore         
	// 2566 3421:dup             
	// 2567 3422:iconst_3        
	// 2568 3423:ldc1            #56  <Int 2>
	// 2569 3425:bastore         
	// 2570 3426:dup             
	// 2571 3427:iconst_4        
	// 2572 3428:ldc1            #56  <Int 2>
	// 2573 3430:bastore         
	// 2574 3431:dup             
	// 2575 3432:iconst_5        
	// 2576 3433:ldc1            #57  <Int 1>
	// 2577 3435:bastore         
	// 2578 3436:aastore         
	// 2579 3437:dup             
	// 2580 3438:bipush          18
	// 2581 3440:aload           16
	// 2582 3442:aastore         
	// 2583 3443:dup             
	// 2584 3444:bipush          19
	// 2585 3446:aload           17
	// 2586 3448:aastore         
	// 2587 3449:dup             
	// 2588 3450:bipush          20
	// 2589 3452:aload           18
	// 2590 3454:aastore         
	// 2591 3455:dup             
	// 2592 3456:bipush          21
	// 2593 3458:aload           19
	// 2594 3460:aastore         
	// 2595 3461:dup             
	// 2596 3462:bipush          22
	// 2597 3464:aload           20
	// 2598 3466:aastore         
	// 2599 3467:dup             
	// 2600 3468:bipush          23
	// 2601 3470:aload           21
	// 2602 3472:aastore         
	// 2603 3473:dup             
	// 2604 3474:bipush          24
	// 2605 3476:aload           22
	// 2606 3478:aastore         
	// 2607 3479:dup             
	// 2608 3480:bipush          25
	// 2609 3482:aload           23
	// 2610 3484:aastore         
	// 2611 3485:dup             
	// 2612 3486:bipush          26
	// 2613 3488:aload           24
	// 2614 3490:aastore         
	// 2615 3491:dup             
	// 2616 3492:bipush          27
	// 2617 3494:aload           25
	// 2618 3496:aastore         
	// 2619 3497:dup             
	// 2620 3498:bipush          28
	// 2621 3500:aload           26
	// 2622 3502:aastore         
	// 2623 3503:dup             
	// 2624 3504:bipush          29
	// 2625 3506:aload           27
	// 2626 3508:aastore         
	// 2627 3509:dup             
	// 2628 3510:bipush          30
	// 2629 3512:aload           28
	// 2630 3514:aastore         
	// 2631 3515:dup             
	// 2632 3516:bipush          31
	// 2633 3518:bipush          6
	// 2634 3520:newarray        byte[]
	// 2635 3522:dup             
	// 2636 3523:iconst_0        
	// 2637 3524:ldc1            #56  <Int 2>
	// 2638 3526:bastore         
	// 2639 3527:dup             
	// 2640 3528:iconst_1        
	// 2641 3529:ldc1            #57  <Int 1>
	// 2642 3531:bastore         
	// 2643 3532:dup             
	// 2644 3533:iconst_2        
	// 2645 3534:ldc1            #56  <Int 2>
	// 2646 3536:bastore         
	// 2647 3537:dup             
	// 2648 3538:iconst_3        
	// 2649 3539:ldc1            #58  <Int 3>
	// 2650 3541:bastore         
	// 2651 3542:dup             
	// 2652 3543:iconst_4        
	// 2653 3544:ldc1            #56  <Int 2>
	// 2654 3546:bastore         
	// 2655 3547:dup             
	// 2656 3548:iconst_5        
	// 2657 3549:ldc1            #57  <Int 1>
	// 2658 3551:bastore         
	// 2659 3552:aastore         
	// 2660 3553:dup             
	// 2661 3554:bipush          32
	// 2662 3556:aload           29
	// 2663 3558:aastore         
	// 2664 3559:dup             
	// 2665 3560:bipush          33
	// 2666 3562:aload           30
	// 2667 3564:aastore         
	// 2668 3565:dup             
	// 2669 3566:bipush          34
	// 2670 3568:aload           31
	// 2671 3570:aastore         
	// 2672 3571:dup             
	// 2673 3572:bipush          35
	// 2674 3574:bipush          6
	// 2675 3576:newarray        byte[]
	// 2676 3578:dup             
	// 2677 3579:iconst_0        
	// 2678 3580:ldc1            #57  <Int 1>
	// 2679 3582:bastore         
	// 2680 3583:dup             
	// 2681 3584:iconst_1        
	// 2682 3585:ldc1            #58  <Int 3>
	// 2683 3587:bastore         
	// 2684 3588:dup             
	// 2685 3589:iconst_2        
	// 2686 3590:ldc1            #57  <Int 1>
	// 2687 3592:bastore         
	// 2688 3593:dup             
	// 2689 3594:iconst_3        
	// 2690 3595:ldc1            #58  <Int 3>
	// 2691 3597:bastore         
	// 2692 3598:dup             
	// 2693 3599:iconst_4        
	// 2694 3600:ldc1            #56  <Int 2>
	// 2695 3602:bastore         
	// 2696 3603:dup             
	// 2697 3604:iconst_5        
	// 2698 3605:ldc1            #57  <Int 1>
	// 2699 3607:bastore         
	// 2700 3608:aastore         
	// 2701 3609:dup             
	// 2702 3610:bipush          36
	// 2703 3612:aload           32
	// 2704 3614:aastore         
	// 2705 3615:dup             
	// 2706 3616:bipush          37
	// 2707 3618:aload           33
	// 2708 3620:aastore         
	// 2709 3621:dup             
	// 2710 3622:bipush          38
	// 2711 3624:aload           34
	// 2712 3626:aastore         
	// 2713 3627:dup             
	// 2714 3628:bipush          39
	// 2715 3630:aload           35
	// 2716 3632:aastore         
	// 2717 3633:dup             
	// 2718 3634:bipush          40
	// 2719 3636:aload           36
	// 2720 3638:aastore         
	// 2721 3639:dup             
	// 2722 3640:bipush          41
	// 2723 3642:aload           37
	// 2724 3644:aastore         
	// 2725 3645:dup             
	// 2726 3646:bipush          42
	// 2727 3648:aload           38
	// 2728 3650:aastore         
	// 2729 3651:dup             
	// 2730 3652:bipush          43
	// 2731 3654:aload           39
	// 2732 3656:aastore         
	// 2733 3657:dup             
	// 2734 3658:bipush          44
	// 2735 3660:aload           40
	// 2736 3662:aastore         
	// 2737 3663:dup             
	// 2738 3664:bipush          45
	// 2739 3666:aload           41
	// 2740 3668:aastore         
	// 2741 3669:dup             
	// 2742 3670:bipush          46
	// 2743 3672:aload           42
	// 2744 3674:aastore         
	// 2745 3675:dup             
	// 2746 3676:bipush          47
	// 2747 3678:aload           43
	// 2748 3680:aastore         
	// 2749 3681:dup             
	// 2750 3682:bipush          48
	// 2751 3684:aload           44
	// 2752 3686:aastore         
	// 2753 3687:dup             
	// 2754 3688:bipush          49
	// 2755 3690:aload           45
	// 2756 3692:aastore         
	// 2757 3693:dup             
	// 2758 3694:bipush          50
	// 2759 3696:aload           46
	// 2760 3698:aastore         
	// 2761 3699:dup             
	// 2762 3700:bipush          51
	// 2763 3702:aload           47
	// 2764 3704:aastore         
	// 2765 3705:dup             
	// 2766 3706:bipush          52
	// 2767 3708:aload           48
	// 2768 3710:aastore         
	// 2769 3711:dup             
	// 2770 3712:bipush          53
	// 2771 3714:bipush          6
	// 2772 3716:newarray        byte[]
	// 2773 3718:dup             
	// 2774 3719:iconst_0        
	// 2775 3720:ldc1            #56  <Int 2>
	// 2776 3722:bastore         
	// 2777 3723:dup             
	// 2778 3724:iconst_1        
	// 2779 3725:ldc1            #57  <Int 1>
	// 2780 3727:bastore         
	// 2781 3728:dup             
	// 2782 3729:iconst_2        
	// 2783 3730:ldc1            #58  <Int 3>
	// 2784 3732:bastore         
	// 2785 3733:dup             
	// 2786 3734:iconst_3        
	// 2787 3735:ldc1            #57  <Int 1>
	// 2788 3737:bastore         
	// 2789 3738:dup             
	// 2790 3739:iconst_4        
	// 2791 3740:ldc1            #58  <Int 3>
	// 2792 3742:bastore         
	// 2793 3743:dup             
	// 2794 3744:iconst_5        
	// 2795 3745:ldc1            #57  <Int 1>
	// 2796 3747:bastore         
	// 2797 3748:aastore         
	// 2798 3749:dup             
	// 2799 3750:bipush          54
	// 2800 3752:aload           49
	// 2801 3754:aastore         
	// 2802 3755:dup             
	// 2803 3756:bipush          55
	// 2804 3758:aload           50
	// 2805 3760:aastore         
	// 2806 3761:dup             
	// 2807 3762:bipush          56
	// 2808 3764:aload           51
	// 2809 3766:aastore         
	// 2810 3767:dup             
	// 2811 3768:bipush          57
	// 2812 3770:aload           52
	// 2813 3772:aastore         
	// 2814 3773:dup             
	// 2815 3774:bipush          58
	// 2816 3776:aload           53
	// 2817 3778:aastore         
	// 2818 3779:dup             
	// 2819 3780:bipush          59
	// 2820 3782:aload           54
	// 2821 3784:aastore         
	// 2822 3785:dup             
	// 2823 3786:bipush          60
	// 2824 3788:aload           55
	// 2825 3790:aastore         
	// 2826 3791:dup             
	// 2827 3792:bipush          61
	// 2828 3794:aload           56
	// 2829 3796:aastore         
	// 2830 3797:dup             
	// 2831 3798:bipush          62
	// 2832 3800:aload           57
	// 2833 3802:aastore         
	// 2834 3803:dup             
	// 2835 3804:bipush          63
	// 2836 3806:bipush          6
	// 2837 3808:newarray        byte[]
	// 2838 3810:dup             
	// 2839 3811:iconst_0        
	// 2840 3812:ldc1            #57  <Int 1>
	// 2841 3814:bastore         
	// 2842 3815:dup             
	// 2843 3816:iconst_1        
	// 2844 3817:ldc1            #57  <Int 1>
	// 2845 3819:bastore         
	// 2846 3820:dup             
	// 2847 3821:iconst_2        
	// 2848 3822:ldc1            #57  <Int 1>
	// 2849 3824:bastore         
	// 2850 3825:dup             
	// 2851 3826:iconst_3        
	// 2852 3827:ldc1            #56  <Int 2>
	// 2853 3829:bastore         
	// 2854 3830:dup             
	// 2855 3831:iconst_4        
	// 2856 3832:ldc1            #56  <Int 2>
	// 2857 3834:bastore         
	// 2858 3835:dup             
	// 2859 3836:iconst_5        
	// 2860 3837:ldc1            #59  <Int 4>
	// 2861 3839:bastore         
	// 2862 3840:aastore         
	// 2863 3841:dup             
	// 2864 3842:bipush          64
	// 2865 3844:bipush          6
	// 2866 3846:newarray        byte[]
	// 2867 3848:dup             
	// 2868 3849:iconst_0        
	// 2869 3850:ldc1            #57  <Int 1>
	// 2870 3852:bastore         
	// 2871 3853:dup             
	// 2872 3854:iconst_1        
	// 2873 3855:ldc1            #57  <Int 1>
	// 2874 3857:bastore         
	// 2875 3858:dup             
	// 2876 3859:iconst_2        
	// 2877 3860:ldc1            #57  <Int 1>
	// 2878 3862:bastore         
	// 2879 3863:dup             
	// 2880 3864:iconst_3        
	// 2881 3865:ldc1            #59  <Int 4>
	// 2882 3867:bastore         
	// 2883 3868:dup             
	// 2884 3869:iconst_4        
	// 2885 3870:ldc1            #56  <Int 2>
	// 2886 3872:bastore         
	// 2887 3873:dup             
	// 2888 3874:iconst_5        
	// 2889 3875:ldc1            #56  <Int 2>
	// 2890 3877:bastore         
	// 2891 3878:aastore         
	// 2892 3879:dup             
	// 2893 3880:bipush          65
	// 2894 3882:bipush          6
	// 2895 3884:newarray        byte[]
	// 2896 3886:dup             
	// 2897 3887:iconst_0        
	// 2898 3888:ldc1            #57  <Int 1>
	// 2899 3890:bastore         
	// 2900 3891:dup             
	// 2901 3892:iconst_1        
	// 2902 3893:ldc1            #56  <Int 2>
	// 2903 3895:bastore         
	// 2904 3896:dup             
	// 2905 3897:iconst_2        
	// 2906 3898:ldc1            #57  <Int 1>
	// 2907 3900:bastore         
	// 2908 3901:dup             
	// 2909 3902:iconst_3        
	// 2910 3903:ldc1            #57  <Int 1>
	// 2911 3905:bastore         
	// 2912 3906:dup             
	// 2913 3907:iconst_4        
	// 2914 3908:ldc1            #56  <Int 2>
	// 2915 3910:bastore         
	// 2916 3911:dup             
	// 2917 3912:iconst_5        
	// 2918 3913:ldc1            #59  <Int 4>
	// 2919 3915:bastore         
	// 2920 3916:aastore         
	// 2921 3917:dup             
	// 2922 3918:bipush          66
	// 2923 3920:aload           58
	// 2924 3922:aastore         
	// 2925 3923:dup             
	// 2926 3924:bipush          67
	// 2927 3926:aload           59
	// 2928 3928:aastore         
	// 2929 3929:dup             
	// 2930 3930:bipush          68
	// 2931 3932:aload           60
	// 2932 3934:aastore         
	// 2933 3935:dup             
	// 2934 3936:bipush          69
	// 2935 3938:aload           61
	// 2936 3940:aastore         
	// 2937 3941:dup             
	// 2938 3942:bipush          70
	// 2939 3944:bipush          6
	// 2940 3946:newarray        byte[]
	// 2941 3948:dup             
	// 2942 3949:iconst_0        
	// 2943 3950:ldc1            #57  <Int 1>
	// 2944 3952:bastore         
	// 2945 3953:dup             
	// 2946 3954:iconst_1        
	// 2947 3955:ldc1            #57  <Int 1>
	// 2948 3957:bastore         
	// 2949 3958:dup             
	// 2950 3959:iconst_2        
	// 2951 3960:ldc1            #56  <Int 2>
	// 2952 3962:bastore         
	// 2953 3963:dup             
	// 2954 3964:iconst_3        
	// 2955 3965:ldc1            #59  <Int 4>
	// 2956 3967:bastore         
	// 2957 3968:dup             
	// 2958 3969:iconst_4        
	// 2959 3970:ldc1            #57  <Int 1>
	// 2960 3972:bastore         
	// 2961 3973:dup             
	// 2962 3974:iconst_5        
	// 2963 3975:ldc1            #56  <Int 2>
	// 2964 3977:bastore         
	// 2965 3978:aastore         
	// 2966 3979:dup             
	// 2967 3980:bipush          71
	// 2968 3982:aload           62
	// 2969 3984:aastore         
	// 2970 3985:dup             
	// 2971 3986:bipush          72
	// 2972 3988:bipush          6
	// 2973 3990:newarray        byte[]
	// 2974 3992:dup             
	// 2975 3993:iconst_0        
	// 2976 3994:ldc1            #57  <Int 1>
	// 2977 3996:bastore         
	// 2978 3997:dup             
	// 2979 3998:iconst_1        
	// 2980 3999:ldc1            #56  <Int 2>
	// 2981 4001:bastore         
	// 2982 4002:dup             
	// 2983 4003:iconst_2        
	// 2984 4004:ldc1            #56  <Int 2>
	// 2985 4006:bastore         
	// 2986 4007:dup             
	// 2987 4008:iconst_3        
	// 2988 4009:ldc1            #59  <Int 4>
	// 2989 4011:bastore         
	// 2990 4012:dup             
	// 2991 4013:iconst_4        
	// 2992 4014:ldc1            #57  <Int 1>
	// 2993 4016:bastore         
	// 2994 4017:dup             
	// 2995 4018:iconst_5        
	// 2996 4019:ldc1            #57  <Int 1>
	// 2997 4021:bastore         
	// 2998 4022:aastore         
	// 2999 4023:dup             
	// 3000 4024:bipush          73
	// 3001 4026:aload           63
	// 3002 4028:aastore         
	// 3003 4029:dup             
	// 3004 4030:bipush          74
	// 3005 4032:aload           64
	// 3006 4034:aastore         
	// 3007 4035:dup             
	// 3008 4036:bipush          75
	// 3009 4038:bipush          6
	// 3010 4040:newarray        byte[]
	// 3011 4042:dup             
	// 3012 4043:iconst_0        
	// 3013 4044:ldc1            #56  <Int 2>
	// 3014 4046:bastore         
	// 3015 4047:dup             
	// 3016 4048:iconst_1        
	// 3017 4049:ldc1            #59  <Int 4>
	// 3018 4051:bastore         
	// 3019 4052:dup             
	// 3020 4053:iconst_2        
	// 3021 4054:ldc1            #57  <Int 1>
	// 3022 4056:bastore         
	// 3023 4057:dup             
	// 3024 4058:iconst_3        
	// 3025 4059:ldc1            #56  <Int 2>
	// 3026 4061:bastore         
	// 3027 4062:dup             
	// 3028 4063:iconst_4        
	// 3029 4064:ldc1            #57  <Int 1>
	// 3030 4066:bastore         
	// 3031 4067:dup             
	// 3032 4068:iconst_5        
	// 3033 4069:ldc1            #57  <Int 1>
	// 3034 4071:bastore         
	// 3035 4072:aastore         
	// 3036 4073:dup             
	// 3037 4074:bipush          76
	// 3038 4076:aload           65
	// 3039 4078:aastore         
	// 3040 4079:dup             
	// 3041 4080:bipush          77
	// 3042 4082:bipush          6
	// 3043 4084:newarray        byte[]
	// 3044 4086:dup             
	// 3045 4087:iconst_0        
	// 3046 4088:ldc1            #59  <Int 4>
	// 3047 4090:bastore         
	// 3048 4091:dup             
	// 3049 4092:iconst_1        
	// 3050 4093:ldc1            #57  <Int 1>
	// 3051 4095:bastore         
	// 3052 4096:dup             
	// 3053 4097:iconst_2        
	// 3054 4098:ldc1            #58  <Int 3>
	// 3055 4100:bastore         
	// 3056 4101:dup             
	// 3057 4102:iconst_3        
	// 3058 4103:ldc1            #57  <Int 1>
	// 3059 4105:bastore         
	// 3060 4106:dup             
	// 3061 4107:iconst_4        
	// 3062 4108:ldc1            #57  <Int 1>
	// 3063 4110:bastore         
	// 3064 4111:dup             
	// 3065 4112:iconst_5        
	// 3066 4113:ldc1            #57  <Int 1>
	// 3067 4115:bastore         
	// 3068 4116:aastore         
	// 3069 4117:dup             
	// 3070 4118:bipush          78
	// 3071 4120:aload           66
	// 3072 4122:aastore         
	// 3073 4123:dup             
	// 3074 4124:bipush          79
	// 3075 4126:aload           67
	// 3076 4128:aastore         
	// 3077 4129:dup             
	// 3078 4130:bipush          80
	// 3079 4132:aload           68
	// 3080 4134:aastore         
	// 3081 4135:dup             
	// 3082 4136:bipush          81
	// 3083 4138:aload           69
	// 3084 4140:aastore         
	// 3085 4141:dup             
	// 3086 4142:bipush          82
	// 3087 4144:aload           70
	// 3088 4146:aastore         
	// 3089 4147:dup             
	// 3090 4148:bipush          83
	// 3091 4150:aload           71
	// 3092 4152:aastore         
	// 3093 4153:dup             
	// 3094 4154:bipush          84
	// 3095 4156:aload           72
	// 3096 4158:aastore         
	// 3097 4159:dup             
	// 3098 4160:bipush          85
	// 3099 4162:aload           73
	// 3100 4164:aastore         
	// 3101 4165:dup             
	// 3102 4166:bipush          86
	// 3103 4168:aload           74
	// 3104 4170:aastore         
	// 3105 4171:dup             
	// 3106 4172:bipush          87
	// 3107 4174:aload           75
	// 3108 4176:aastore         
	// 3109 4177:dup             
	// 3110 4178:bipush          88
	// 3111 4180:bipush          6
	// 3112 4182:newarray        byte[]
	// 3113 4184:dup             
	// 3114 4185:iconst_0        
	// 3115 4186:ldc1            #59  <Int 4>
	// 3116 4188:bastore         
	// 3117 4189:dup             
	// 3118 4190:iconst_1        
	// 3119 4191:ldc1            #56  <Int 2>
	// 3120 4193:bastore         
	// 3121 4194:dup             
	// 3122 4195:iconst_2        
	// 3123 4196:ldc1            #57  <Int 1>
	// 3124 4198:bastore         
	// 3125 4199:dup             
	// 3126 4200:iconst_3        
	// 3127 4201:ldc1            #56  <Int 2>
	// 3128 4203:bastore         
	// 3129 4204:dup             
	// 3130 4205:iconst_4        
	// 3131 4206:ldc1            #57  <Int 1>
	// 3132 4208:bastore         
	// 3133 4209:dup             
	// 3134 4210:iconst_5        
	// 3135 4211:ldc1            #57  <Int 1>
	// 3136 4213:bastore         
	// 3137 4214:aastore         
	// 3138 4215:dup             
	// 3139 4216:bipush          89
	// 3140 4218:aload           76
	// 3141 4220:aastore         
	// 3142 4221:dup             
	// 3143 4222:bipush          90
	// 3144 4224:aload           77
	// 3145 4226:aastore         
	// 3146 4227:dup             
	// 3147 4228:bipush          91
	// 3148 4230:aload           78
	// 3149 4232:aastore         
	// 3150 4233:dup             
	// 3151 4234:bipush          92
	// 3152 4236:aload           79
	// 3153 4238:aastore         
	// 3154 4239:dup             
	// 3155 4240:bipush          93
	// 3156 4242:aload           80
	// 3157 4244:aastore         
	// 3158 4245:dup             
	// 3159 4246:bipush          94
	// 3160 4248:bipush          6
	// 3161 4250:newarray        byte[]
	// 3162 4252:dup             
	// 3163 4253:iconst_0        
	// 3164 4254:ldc1            #57  <Int 1>
	// 3165 4256:bastore         
	// 3166 4257:dup             
	// 3167 4258:iconst_1        
	// 3168 4259:ldc1            #58  <Int 3>
	// 3169 4261:bastore         
	// 3170 4262:dup             
	// 3171 4263:iconst_2        
	// 3172 4264:ldc1            #57  <Int 1>
	// 3173 4266:bastore         
	// 3174 4267:dup             
	// 3175 4268:iconst_3        
	// 3176 4269:ldc1            #57  <Int 1>
	// 3177 4271:bastore         
	// 3178 4272:dup             
	// 3179 4273:iconst_4        
	// 3180 4274:ldc1            #59  <Int 4>
	// 3181 4276:bastore         
	// 3182 4277:dup             
	// 3183 4278:iconst_5        
	// 3184 4279:ldc1            #57  <Int 1>
	// 3185 4281:bastore         
	// 3186 4282:aastore         
	// 3187 4283:dup             
	// 3188 4284:bipush          95
	// 3189 4286:aload           81
	// 3190 4288:aastore         
	// 3191 4289:dup             
	// 3192 4290:bipush          96
	// 3193 4292:aload           82
	// 3194 4294:aastore         
	// 3195 4295:dup             
	// 3196 4296:bipush          97
	// 3197 4298:aload           83
	// 3198 4300:aastore         
	// 3199 4301:dup             
	// 3200 4302:bipush          98
	// 3201 4304:aload           84
	// 3202 4306:aastore         
	// 3203 4307:dup             
	// 3204 4308:bipush          99
	// 3205 4310:bipush          6
	// 3206 4312:newarray        byte[]
	// 3207 4314:dup             
	// 3208 4315:iconst_0        
	// 3209 4316:ldc1            #57  <Int 1>
	// 3210 4318:bastore         
	// 3211 4319:dup             
	// 3212 4320:iconst_1        
	// 3213 4321:ldc1            #57  <Int 1>
	// 3214 4323:bastore         
	// 3215 4324:dup             
	// 3216 4325:iconst_2        
	// 3217 4326:ldc1            #58  <Int 3>
	// 3218 4328:bastore         
	// 3219 4329:dup             
	// 3220 4330:iconst_3        
	// 3221 4331:ldc1            #57  <Int 1>
	// 3222 4333:bastore         
	// 3223 4334:dup             
	// 3224 4335:iconst_4        
	// 3225 4336:ldc1            #59  <Int 4>
	// 3226 4338:bastore         
	// 3227 4339:dup             
	// 3228 4340:iconst_5        
	// 3229 4341:ldc1            #57  <Int 1>
	// 3230 4343:bastore         
	// 3231 4344:aastore         
	// 3232 4345:dup             
	// 3233 4346:bipush          100
	// 3234 4348:aload           85
	// 3235 4350:aastore         
	// 3236 4351:dup             
	// 3237 4352:bipush          101
	// 3238 4354:aload           86
	// 3239 4356:aastore         
	// 3240 4357:dup             
	// 3241 4358:bipush          102
	// 3242 4360:aload           87
	// 3243 4362:aastore         
	// 3244 4363:dup             
	// 3245 4364:bipush          103
	// 3246 4366:aload           88
	// 3247 4368:aastore         
	// 3248 4369:dup             
	// 3249 4370:bipush          104
	// 3250 4372:aload           89
	// 3251 4374:aastore         
	// 3252 4375:dup             
	// 3253 4376:bipush          105
	// 3254 4378:aload           90
	// 3255 4380:aastore         
	// 3256 4381:putstatic       #62  <Field byte[][] BARS>
	// 3257 4384:bipush          7
	// 3258 4386:newarray        byte[]
	// 3259 4388:dup             
	// 3260 4389:iconst_0        
	// 3261 4390:ldc1            #56  <Int 2>
	// 3262 4392:bastore         
	// 3263 4393:dup             
	// 3264 4394:iconst_1        
	// 3265 4395:ldc1            #58  <Int 3>
	// 3266 4397:bastore         
	// 3267 4398:dup             
	// 3268 4399:iconst_2        
	// 3269 4400:ldc1            #58  <Int 3>
	// 3270 4402:bastore         
	// 3271 4403:dup             
	// 3272 4404:iconst_3        
	// 3273 4405:ldc1            #57  <Int 1>
	// 3274 4407:bastore         
	// 3275 4408:dup             
	// 3276 4409:iconst_4        
	// 3277 4410:ldc1            #57  <Int 1>
	// 3278 4412:bastore         
	// 3279 4413:dup             
	// 3280 4414:iconst_5        
	// 3281 4415:ldc1            #57  <Int 1>
	// 3282 4417:bastore         
	// 3283 4418:dup             
	// 3284 4419:bipush          6
	// 3285 4421:ldc1            #56  <Int 2>
	// 3286 4423:bastore         
	// 3287 4424:putstatic       #64  <Field byte[] BARS_STOP>
		ais = new IntHashtable();
	// 3288 4427:new             #66  <Class IntHashtable>
	// 3289 4430:dup             
	// 3290 4431:invokespecial   #69  <Method void IntHashtable()>
	// 3291 4434:putstatic       #71  <Field IntHashtable ais>
		ais.put(0, 20);
	// 3292 4437:getstatic       #71  <Field IntHashtable ais>
	// 3293 4440:iconst_0        
	// 3294 4441:bipush          20
	// 3295 4443:invokevirtual   #75  <Method int IntHashtable.put(int, int)>
	// 3296 4446:pop             
		ais.put(1, 16);
	// 3297 4447:getstatic       #71  <Field IntHashtable ais>
	// 3298 4450:iconst_1        
	// 3299 4451:bipush          16
	// 3300 4453:invokevirtual   #75  <Method int IntHashtable.put(int, int)>
	// 3301 4456:pop             
		ais.put(2, 16);
	// 3302 4457:getstatic       #71  <Field IntHashtable ais>
	// 3303 4460:iconst_2        
	// 3304 4461:bipush          16
	// 3305 4463:invokevirtual   #75  <Method int IntHashtable.put(int, int)>
	// 3306 4466:pop             
		ais.put(10, -1);
	// 3307 4467:getstatic       #71  <Field IntHashtable ais>
	// 3308 4470:bipush          10
	// 3309 4472:iconst_m1       
	// 3310 4473:invokevirtual   #75  <Method int IntHashtable.put(int, int)>
	// 3311 4476:pop             
		ais.put(11, 9);
	// 3312 4477:getstatic       #71  <Field IntHashtable ais>
	// 3313 4480:bipush          11
	// 3314 4482:bipush          9
	// 3315 4484:invokevirtual   #75  <Method int IntHashtable.put(int, int)>
	// 3316 4487:pop             
		ais.put(12, 8);
	// 3317 4488:getstatic       #71  <Field IntHashtable ais>
	// 3318 4491:bipush          12
	// 3319 4493:bipush          8
	// 3320 4495:invokevirtual   #75  <Method int IntHashtable.put(int, int)>
	// 3321 4498:pop             
		ais.put(13, 8);
	// 3322 4499:getstatic       #71  <Field IntHashtable ais>
	// 3323 4502:bipush          13
	// 3324 4504:bipush          8
	// 3325 4506:invokevirtual   #75  <Method int IntHashtable.put(int, int)>
	// 3326 4509:pop             
		ais.put(15, 8);
	// 3327 4510:getstatic       #71  <Field IntHashtable ais>
	// 3328 4513:bipush          15
	// 3329 4515:bipush          8
	// 3330 4517:invokevirtual   #75  <Method int IntHashtable.put(int, int)>
	// 3331 4520:pop             
		ais.put(17, 8);
	// 3332 4521:getstatic       #71  <Field IntHashtable ais>
	// 3333 4524:bipush          17
	// 3334 4526:bipush          8
	// 3335 4528:invokevirtual   #75  <Method int IntHashtable.put(int, int)>
	// 3336 4531:pop             
		ais.put(20, 4);
	// 3337 4532:getstatic       #71  <Field IntHashtable ais>
	// 3338 4535:bipush          20
	// 3339 4537:iconst_4        
	// 3340 4538:invokevirtual   #75  <Method int IntHashtable.put(int, int)>
	// 3341 4541:pop             
		ais.put(21, -1);
	// 3342 4542:getstatic       #71  <Field IntHashtable ais>
	// 3343 4545:bipush          21
	// 3344 4547:iconst_m1       
	// 3345 4548:invokevirtual   #75  <Method int IntHashtable.put(int, int)>
	// 3346 4551:pop             
		ais.put(22, -1);
	// 3347 4552:getstatic       #71  <Field IntHashtable ais>
	// 3348 4555:bipush          22
	// 3349 4557:iconst_m1       
	// 3350 4558:invokevirtual   #75  <Method int IntHashtable.put(int, int)>
	// 3351 4561:pop             
		ais.put(23, -1);
	// 3352 4562:getstatic       #71  <Field IntHashtable ais>
	// 3353 4565:bipush          23
	// 3354 4567:iconst_m1       
	// 3355 4568:invokevirtual   #75  <Method int IntHashtable.put(int, int)>
	// 3356 4571:pop             
		ais.put(240, -1);
	// 3357 4572:getstatic       #71  <Field IntHashtable ais>
	// 3358 4575:sipush          240
	// 3359 4578:iconst_m1       
	// 3360 4579:invokevirtual   #75  <Method int IntHashtable.put(int, int)>
	// 3361 4582:pop             
		ais.put(241, -1);
	// 3362 4583:getstatic       #71  <Field IntHashtable ais>
	// 3363 4586:sipush          241
	// 3364 4589:iconst_m1       
	// 3365 4590:invokevirtual   #75  <Method int IntHashtable.put(int, int)>
	// 3366 4593:pop             
		ais.put(250, -1);
	// 3367 4594:getstatic       #71  <Field IntHashtable ais>
	// 3368 4597:sipush          250
	// 3369 4600:iconst_m1       
	// 3370 4601:invokevirtual   #75  <Method int IntHashtable.put(int, int)>
	// 3371 4604:pop             
		ais.put(251, -1);
	// 3372 4605:getstatic       #71  <Field IntHashtable ais>
	// 3373 4608:sipush          251
	// 3374 4611:iconst_m1       
	// 3375 4612:invokevirtual   #75  <Method int IntHashtable.put(int, int)>
	// 3376 4615:pop             
		ais.put(252, -1);
	// 3377 4616:getstatic       #71  <Field IntHashtable ais>
	// 3378 4619:sipush          252
	// 3379 4622:iconst_m1       
	// 3380 4623:invokevirtual   #75  <Method int IntHashtable.put(int, int)>
	// 3381 4626:pop             
		ais.put(30, -1);
	// 3382 4627:getstatic       #71  <Field IntHashtable ais>
	// 3383 4630:bipush          30
	// 3384 4632:iconst_m1       
	// 3385 4633:invokevirtual   #75  <Method int IntHashtable.put(int, int)>
	// 3386 4636:pop             
		for(int i = 3100; i < '\u0E74'; i++)
	//*3387 4637:sipush          3100
	//*3388 4640:istore_0        
	//*3389 4641:iload_0         
	//*3390 4642:sipush          3700
	//*3391 4645:icmpge          4665
			ais.put(i, 10);
	// 3392 4648:getstatic       #71  <Field IntHashtable ais>
	// 3393 4651:iload_0         
	// 3394 4652:bipush          10
	// 3395 4654:invokevirtual   #75  <Method int IntHashtable.put(int, int)>
	// 3396 4657:pop             

	// 3397 4658:iload_0         
	// 3398 4659:iconst_1        
	// 3399 4660:iadd            
	// 3400 4661:istore_0        
	//*3401 4662:goto            4641
		ais.put(37, -1);
	// 3402 4665:getstatic       #71  <Field IntHashtable ais>
	// 3403 4668:bipush          37
	// 3404 4670:iconst_m1       
	// 3405 4671:invokevirtual   #75  <Method int IntHashtable.put(int, int)>
	// 3406 4674:pop             
		for(int j = 3900; j < '\u0F64'; j++)
	//*3407 4675:sipush          3900
	//*3408 4678:istore_0        
	//*3409 4679:iload_0         
	//*3410 4680:sipush          3940
	//*3411 4683:icmpge          4702
			ais.put(j, -1);
	// 3412 4686:getstatic       #71  <Field IntHashtable ais>
	// 3413 4689:iload_0         
	// 3414 4690:iconst_m1       
	// 3415 4691:invokevirtual   #75  <Method int IntHashtable.put(int, int)>
	// 3416 4694:pop             

	// 3417 4695:iload_0         
	// 3418 4696:iconst_1        
	// 3419 4697:iadd            
	// 3420 4698:istore_0        
	//*3421 4699:goto            4679
		ais.put(400, -1);
	// 3422 4702:getstatic       #71  <Field IntHashtable ais>
	// 3423 4705:sipush          400
	// 3424 4708:iconst_m1       
	// 3425 4709:invokevirtual   #75  <Method int IntHashtable.put(int, int)>
	// 3426 4712:pop             
		ais.put(401, -1);
	// 3427 4713:getstatic       #71  <Field IntHashtable ais>
	// 3428 4716:sipush          401
	// 3429 4719:iconst_m1       
	// 3430 4720:invokevirtual   #75  <Method int IntHashtable.put(int, int)>
	// 3431 4723:pop             
		ais.put(402, 20);
	// 3432 4724:getstatic       #71  <Field IntHashtable ais>
	// 3433 4727:sipush          402
	// 3434 4730:bipush          20
	// 3435 4732:invokevirtual   #75  <Method int IntHashtable.put(int, int)>
	// 3436 4735:pop             
		ais.put(403, -1);
	// 3437 4736:getstatic       #71  <Field IntHashtable ais>
	// 3438 4739:sipush          403
	// 3439 4742:iconst_m1       
	// 3440 4743:invokevirtual   #75  <Method int IntHashtable.put(int, int)>
	// 3441 4746:pop             
		for(int k = 410; k < '\u01A0'; k++)
	//*3442 4747:sipush          410
	//*3443 4750:istore_0        
	//*3444 4751:iload_0         
	//*3445 4752:sipush          416
	//*3446 4755:icmpge          4775
			ais.put(k, 16);
	// 3447 4758:getstatic       #71  <Field IntHashtable ais>
	// 3448 4761:iload_0         
	// 3449 4762:bipush          16
	// 3450 4764:invokevirtual   #75  <Method int IntHashtable.put(int, int)>
	// 3451 4767:pop             

	// 3452 4768:iload_0         
	// 3453 4769:iconst_1        
	// 3454 4770:iadd            
	// 3455 4771:istore_0        
	//*3456 4772:goto            4751
		ais.put(420, -1);
	// 3457 4775:getstatic       #71  <Field IntHashtable ais>
	// 3458 4778:sipush          420
	// 3459 4781:iconst_m1       
	// 3460 4782:invokevirtual   #75  <Method int IntHashtable.put(int, int)>
	// 3461 4785:pop             
		ais.put(421, -1);
	// 3462 4786:getstatic       #71  <Field IntHashtable ais>
	// 3463 4789:sipush          421
	// 3464 4792:iconst_m1       
	// 3465 4793:invokevirtual   #75  <Method int IntHashtable.put(int, int)>
	// 3466 4796:pop             
		ais.put(422, 6);
	// 3467 4797:getstatic       #71  <Field IntHashtable ais>
	// 3468 4800:sipush          422
	// 3469 4803:bipush          6
	// 3470 4805:invokevirtual   #75  <Method int IntHashtable.put(int, int)>
	// 3471 4808:pop             
		ais.put(423, -1);
	// 3472 4809:getstatic       #71  <Field IntHashtable ais>
	// 3473 4812:sipush          423
	// 3474 4815:iconst_m1       
	// 3475 4816:invokevirtual   #75  <Method int IntHashtable.put(int, int)>
	// 3476 4819:pop             
		ais.put(424, 6);
	// 3477 4820:getstatic       #71  <Field IntHashtable ais>
	// 3478 4823:sipush          424
	// 3479 4826:bipush          6
	// 3480 4828:invokevirtual   #75  <Method int IntHashtable.put(int, int)>
	// 3481 4831:pop             
		ais.put(425, 6);
	// 3482 4832:getstatic       #71  <Field IntHashtable ais>
	// 3483 4835:sipush          425
	// 3484 4838:bipush          6
	// 3485 4840:invokevirtual   #75  <Method int IntHashtable.put(int, int)>
	// 3486 4843:pop             
		ais.put(426, 6);
	// 3487 4844:getstatic       #71  <Field IntHashtable ais>
	// 3488 4847:sipush          426
	// 3489 4850:bipush          6
	// 3490 4852:invokevirtual   #75  <Method int IntHashtable.put(int, int)>
	// 3491 4855:pop             
		ais.put(7001, 17);
	// 3492 4856:getstatic       #71  <Field IntHashtable ais>
	// 3493 4859:sipush          7001
	// 3494 4862:bipush          17
	// 3495 4864:invokevirtual   #75  <Method int IntHashtable.put(int, int)>
	// 3496 4867:pop             
		ais.put(7002, -1);
	// 3497 4868:getstatic       #71  <Field IntHashtable ais>
	// 3498 4871:sipush          7002
	// 3499 4874:iconst_m1       
	// 3500 4875:invokevirtual   #75  <Method int IntHashtable.put(int, int)>
	// 3501 4878:pop             
		for(int l = 7030; l < '\u1B80'; l++)
	//*3502 4879:sipush          7030
	//*3503 4882:istore_0        
	//*3504 4883:iload_0         
	//*3505 4884:sipush          7040
	//*3506 4887:icmpge          4906
			ais.put(l, -1);
	// 3507 4890:getstatic       #71  <Field IntHashtable ais>
	// 3508 4893:iload_0         
	// 3509 4894:iconst_m1       
	// 3510 4895:invokevirtual   #75  <Method int IntHashtable.put(int, int)>
	// 3511 4898:pop             

	// 3512 4899:iload_0         
	// 3513 4900:iconst_1        
	// 3514 4901:iadd            
	// 3515 4902:istore_0        
	//*3516 4903:goto            4883
		ais.put(8001, 18);
	// 3517 4906:getstatic       #71  <Field IntHashtable ais>
	// 3518 4909:sipush          8001
	// 3519 4912:bipush          18
	// 3520 4914:invokevirtual   #75  <Method int IntHashtable.put(int, int)>
	// 3521 4917:pop             
		ais.put(8002, -1);
	// 3522 4918:getstatic       #71  <Field IntHashtable ais>
	// 3523 4921:sipush          8002
	// 3524 4924:iconst_m1       
	// 3525 4925:invokevirtual   #75  <Method int IntHashtable.put(int, int)>
	// 3526 4928:pop             
		ais.put(8003, -1);
	// 3527 4929:getstatic       #71  <Field IntHashtable ais>
	// 3528 4932:sipush          8003
	// 3529 4935:iconst_m1       
	// 3530 4936:invokevirtual   #75  <Method int IntHashtable.put(int, int)>
	// 3531 4939:pop             
		ais.put(8004, -1);
	// 3532 4940:getstatic       #71  <Field IntHashtable ais>
	// 3533 4943:sipush          8004
	// 3534 4946:iconst_m1       
	// 3535 4947:invokevirtual   #75  <Method int IntHashtable.put(int, int)>
	// 3536 4950:pop             
		ais.put(8005, 10);
	// 3537 4951:getstatic       #71  <Field IntHashtable ais>
	// 3538 4954:sipush          8005
	// 3539 4957:bipush          10
	// 3540 4959:invokevirtual   #75  <Method int IntHashtable.put(int, int)>
	// 3541 4962:pop             
		ais.put(8006, 22);
	// 3542 4963:getstatic       #71  <Field IntHashtable ais>
	// 3543 4966:sipush          8006
	// 3544 4969:bipush          22
	// 3545 4971:invokevirtual   #75  <Method int IntHashtable.put(int, int)>
	// 3546 4974:pop             
		ais.put(8007, -1);
	// 3547 4975:getstatic       #71  <Field IntHashtable ais>
	// 3548 4978:sipush          8007
	// 3549 4981:iconst_m1       
	// 3550 4982:invokevirtual   #75  <Method int IntHashtable.put(int, int)>
	// 3551 4985:pop             
		ais.put(8008, -1);
	// 3552 4986:getstatic       #71  <Field IntHashtable ais>
	// 3553 4989:sipush          8008
	// 3554 4992:iconst_m1       
	// 3555 4993:invokevirtual   #75  <Method int IntHashtable.put(int, int)>
	// 3556 4996:pop             
		ais.put(8018, 22);
	// 3557 4997:getstatic       #71  <Field IntHashtable ais>
	// 3558 5000:sipush          8018
	// 3559 5003:bipush          22
	// 3560 5005:invokevirtual   #75  <Method int IntHashtable.put(int, int)>
	// 3561 5008:pop             
		ais.put(8020, -1);
	// 3562 5009:getstatic       #71  <Field IntHashtable ais>
	// 3563 5012:sipush          8020
	// 3564 5015:iconst_m1       
	// 3565 5016:invokevirtual   #75  <Method int IntHashtable.put(int, int)>
	// 3566 5019:pop             
		ais.put(8100, 10);
	// 3567 5020:getstatic       #71  <Field IntHashtable ais>
	// 3568 5023:sipush          8100
	// 3569 5026:bipush          10
	// 3570 5028:invokevirtual   #75  <Method int IntHashtable.put(int, int)>
	// 3571 5031:pop             
		ais.put(8101, 14);
	// 3572 5032:getstatic       #71  <Field IntHashtable ais>
	// 3573 5035:sipush          8101
	// 3574 5038:bipush          14
	// 3575 5040:invokevirtual   #75  <Method int IntHashtable.put(int, int)>
	// 3576 5043:pop             
		ais.put(8102, 6);
	// 3577 5044:getstatic       #71  <Field IntHashtable ais>
	// 3578 5047:sipush          8102
	// 3579 5050:bipush          6
	// 3580 5052:invokevirtual   #75  <Method int IntHashtable.put(int, int)>
	// 3581 5055:pop             
		for(int i1 = 90; i1 < 100; i1++)
	//*3582 5056:bipush          90
	//*3583 5058:istore_0        
	//*3584 5059:iload_0         
	//*3585 5060:bipush          100
	//*3586 5062:icmpge          5081
			ais.put(i1, -1);
	// 3587 5065:getstatic       #71  <Field IntHashtable ais>
	// 3588 5068:iload_0         
	// 3589 5069:iconst_m1       
	// 3590 5070:invokevirtual   #75  <Method int IntHashtable.put(int, int)>
	// 3591 5073:pop             

	// 3592 5074:iload_0         
	// 3593 5075:iconst_1        
	// 3594 5076:iadd            
	// 3595 5077:istore_0        
	//*3596 5078:goto            5059
	//*3597 5081:return          
	}
}
