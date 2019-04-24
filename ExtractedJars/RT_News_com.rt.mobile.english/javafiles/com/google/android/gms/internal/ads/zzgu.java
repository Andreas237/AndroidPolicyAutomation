// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.MurmurHash3;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;

public final class zzgu
{

	public static String[] zzb(String s, boolean flag)
	{
		int i;
		int j;
		boolean flag3;
		int l;
		ArrayList arraylist;
		char ac[];
		if(s == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		arraylist = new ArrayList();
	//    4    6:new             #11  <Class ArrayList>
	//    5    9:dup             
	//    6   10:invokespecial   #15  <Method void ArrayList()>
	//    7   13:astore          9
		ac = s.toCharArray();
	//    8   15:aload_0         
	//    9   16:invokevirtual   #21  <Method char[] String.toCharArray()>
	//   10   19:astore          10
		l = s.length();
	//   11   21:aload_0         
	//   12   22:invokevirtual   #25  <Method int String.length()>
	//   13   25:istore          7
		boolean flag1 = false;
	//   14   27:iconst_0        
	//   15   28:istore          4
		i = ((int) (flag1));
	//   16   30:iload           4
	//   17   32:istore_2        
		j = i;
	//   18   33:iload_2         
	//   19   34:istore_3        
		flag3 = ((boolean) (i));
	//   20   35:iload_2         
	//   21   36:istore          5
		i = ((int) (flag1));
	//   22   38:iload           4
	//   23   40:istore_2        
_L7:
		if(i >= l) goto _L2; else goto _L1
	//   24   41:iload_2         
	//   25   42:iload           7
	//   26   44:icmpge          421
_L1:
		boolean flag2;
		int k;
		int i1;
label0:
		{
label1:
			{
				k = Character.codePointAt(ac, i);
	//   27   47:aload           10
	//   28   49:iload_2         
	//   29   50:invokestatic    #31  <Method int Character.codePointAt(char[], int)>
	//   30   53:istore          6
				i1 = Character.charCount(k);
	//   31   55:iload           6
	//   32   57:invokestatic    #35  <Method int Character.charCount(int)>
	//   33   60:istore          8
				if(!Character.isLetter(k))
					break label1;
	//   34   62:iload           6
	//   35   64:invokestatic    #39  <Method boolean Character.isLetter(int)>
	//   36   67:ifeq            239
				s = ((String) (Character.UnicodeBlock.of(k)));
	//   37   70:iload           6
	//   38   72:invokestatic    #45  <Method Character$UnicodeBlock Character$UnicodeBlock.of(int)>
	//   39   75:astore_0        
				if(s != Character.UnicodeBlock.BOPOMOFO && s != Character.UnicodeBlock.BOPOMOFO_EXTENDED && s != Character.UnicodeBlock.CJK_COMPATIBILITY && s != Character.UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS && s != Character.UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS_SUPPLEMENT && s != Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS && s != Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_A && s != Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_B && s != Character.UnicodeBlock.ENCLOSED_CJK_LETTERS_AND_MONTHS && s != Character.UnicodeBlock.HANGUL_JAMO && s != Character.UnicodeBlock.HANGUL_SYLLABLES && s != Character.UnicodeBlock.HIRAGANA && s != Character.UnicodeBlock.KATAKANA && s != Character.UnicodeBlock.KATAKANA_PHONETIC_EXTENSIONS)
	//*  40   76:aload_0         
	//*  41   77:getstatic       #49  <Field Character$UnicodeBlock Character$UnicodeBlock.BOPOMOFO>
	//*  42   80:if_acmpeq       183
	//*  43   83:aload_0         
	//*  44   84:getstatic       #52  <Field Character$UnicodeBlock Character$UnicodeBlock.BOPOMOFO_EXTENDED>
	//*  45   87:if_acmpeq       183
	//*  46   90:aload_0         
	//*  47   91:getstatic       #55  <Field Character$UnicodeBlock Character$UnicodeBlock.CJK_COMPATIBILITY>
	//*  48   94:if_acmpeq       183
	//*  49   97:aload_0         
	//*  50   98:getstatic       #58  <Field Character$UnicodeBlock Character$UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS>
	//*  51  101:if_acmpeq       183
	//*  52  104:aload_0         
	//*  53  105:getstatic       #61  <Field Character$UnicodeBlock Character$UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS_SUPPLEMENT>
	//*  54  108:if_acmpeq       183
	//*  55  111:aload_0         
	//*  56  112:getstatic       #64  <Field Character$UnicodeBlock Character$UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS>
	//*  57  115:if_acmpeq       183
	//*  58  118:aload_0         
	//*  59  119:getstatic       #67  <Field Character$UnicodeBlock Character$UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_A>
	//*  60  122:if_acmpeq       183
	//*  61  125:aload_0         
	//*  62  126:getstatic       #70  <Field Character$UnicodeBlock Character$UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_B>
	//*  63  129:if_acmpeq       183
	//*  64  132:aload_0         
	//*  65  133:getstatic       #73  <Field Character$UnicodeBlock Character$UnicodeBlock.ENCLOSED_CJK_LETTERS_AND_MONTHS>
	//*  66  136:if_acmpeq       183
	//*  67  139:aload_0         
	//*  68  140:getstatic       #76  <Field Character$UnicodeBlock Character$UnicodeBlock.HANGUL_JAMO>
	//*  69  143:if_acmpeq       183
	//*  70  146:aload_0         
	//*  71  147:getstatic       #79  <Field Character$UnicodeBlock Character$UnicodeBlock.HANGUL_SYLLABLES>
	//*  72  150:if_acmpeq       183
	//*  73  153:aload_0         
	//*  74  154:getstatic       #82  <Field Character$UnicodeBlock Character$UnicodeBlock.HIRAGANA>
	//*  75  157:if_acmpeq       183
	//*  76  160:aload_0         
	//*  77  161:getstatic       #85  <Field Character$UnicodeBlock Character$UnicodeBlock.KATAKANA>
	//*  78  164:if_acmpeq       183
	//*  79  167:aload_0         
	//*  80  168:getstatic       #88  <Field Character$UnicodeBlock Character$UnicodeBlock.KATAKANA_PHONETIC_EXTENSIONS>
	//*  81  171:if_acmpne       177
	//*  82  174:goto            183
					flag2 = false;
	//   83  177:iconst_0        
	//   84  178:istore          4
				else
	//*  85  180:goto            186
					flag2 = true;
	//   86  183:iconst_1        
	//   87  184:istore          4
				if(!flag2)
	//*  88  186:iload           4
	//*  89  188:ifne            233
				{
					if(k >= 65382 && k <= 65437 || k >= 65441 && k <= 65500)
	//*  90  191:iload           6
	//*  91  193:ldc1            #89  <Int 65382>
	//*  92  195:icmplt          205
	//*  93  198:iload           6
	//*  94  200:ldc1            #90  <Int 65437>
	//*  95  202:icmple          219
	//*  96  205:iload           6
	//*  97  207:ldc1            #91  <Int 65441>
	//*  98  209:icmplt          225
	//*  99  212:iload           6
	//* 100  214:ldc1            #92  <Int 65500>
	//* 101  216:icmpgt          225
						flag2 = true;
	//  102  219:iconst_1        
	//  103  220:istore          4
					else
	//* 104  222:goto            228
						flag2 = false;
	//  105  225:iconst_0        
	//  106  226:istore          4
					if(!flag2)
						break label1;
	//  107  228:iload           4
	//  108  230:ifeq            239
				}
				flag2 = true;
	//  109  233:iconst_1        
	//  110  234:istore          4
				break label0;
	//  111  236:goto            242
			}
			flag2 = false;
	//  112  239:iconst_0        
	//  113  240:istore          4
		}
		if(!flag2) goto _L4; else goto _L3
	//  114  242:iload           4
	//  115  244:ifeq            300
_L3:
		if(flag3)
	//* 116  247:iload           5
	//* 117  249:ifeq            271
			arraylist.add(((Object) (new String(ac, j, i - j))));
	//  118  252:aload           9
	//  119  254:new             #17  <Class String>
	//  120  257:dup             
	//  121  258:aload           10
	//  122  260:iload_3         
	//  123  261:iload_2         
	//  124  262:iload_3         
	//  125  263:isub            
	//  126  264:invokespecial   #95  <Method void String(char[], int, int)>
	//  127  267:invokevirtual   #99  <Method boolean ArrayList.add(Object)>
	//  128  270:pop             
		s = new String(ac, i, i1);
	//  129  271:new             #17  <Class String>
	//  130  274:dup             
	//  131  275:aload           10
	//  132  277:iload_2         
	//  133  278:iload           8
	//  134  280:invokespecial   #95  <Method void String(char[], int, int)>
	//  135  283:astore_0        
_L6:
		arraylist.add(((Object) (s)));
	//  136  284:aload           9
	//  137  286:aload_0         
	//  138  287:invokevirtual   #99  <Method boolean ArrayList.add(Object)>
	//  139  290:pop             
		flag2 = false;
	//  140  291:iconst_0        
	//  141  292:istore          4
		k = j;
	//  142  294:iload_3         
	//  143  295:istore          6
		break MISSING_BLOCK_LABEL_406;
	//  144  297:goto            406
_L4:
		if(Character.isLetterOrDigit(k) || Character.getType(k) == 6 || Character.getType(k) == 8)
	//* 145  300:iload           6
	//* 146  302:invokestatic    #102 <Method boolean Character.isLetterOrDigit(int)>
	//* 147  305:ifne            393
	//* 148  308:iload           6
	//* 149  310:invokestatic    #105 <Method int Character.getType(int)>
	//* 150  313:bipush          6
	//* 151  315:icmpeq          393
	//* 152  318:iload           6
	//* 153  320:invokestatic    #105 <Method int Character.getType(int)>
	//* 154  323:bipush          8
	//* 155  325:icmpne          331
			break; /* Loop/switch isn't completed */
	//  156  328:goto            393
		if(flag && Character.charCount(k) == 1 && Character.toChars(k)[0] == '\'')
	//* 157  331:iload_1         
	//* 158  332:ifeq            364
	//* 159  335:iload           6
	//* 160  337:invokestatic    #35  <Method int Character.charCount(int)>
	//* 161  340:iconst_1        
	//* 162  341:icmpne          364
	//* 163  344:iload           6
	//* 164  346:invokestatic    #109 <Method char[] Character.toChars(int)>
	//* 165  349:iconst_0        
	//* 166  350:caload          
	//* 167  351:bipush          39
	//* 168  353:icmpne          364
		{
			if(flag3)
	//* 169  356:iload           5
	//* 170  358:ifne            400
				break MISSING_BLOCK_LABEL_400;
	//  171  361:goto            398
			break MISSING_BLOCK_LABEL_398;
		}
		flag2 = flag3;
	//  172  364:iload           5
	//  173  366:istore          4
		k = j;
	//  174  368:iload_3         
	//  175  369:istore          6
		if(!flag3)
			break MISSING_BLOCK_LABEL_406;
	//  176  371:iload           5
	//  177  373:ifeq            406
		s = new String(ac, j, i - j);
	//  178  376:new             #17  <Class String>
	//  179  379:dup             
	//  180  380:aload           10
	//  181  382:iload_3         
	//  182  383:iload_2         
	//  183  384:iload_3         
	//  184  385:isub            
	//  185  386:invokespecial   #95  <Method void String(char[], int, int)>
	//  186  389:astore_0        
		if(true) goto _L6; else goto _L5
	//  187  390:goto            284
_L5:
		if(flag3)
			break MISSING_BLOCK_LABEL_400;
	//  188  393:iload           5
	//  189  395:ifne            400
		j = i;
	//  190  398:iload_2         
	//  191  399:istore_3        
		flag2 = true;
	//  192  400:iconst_1        
	//  193  401:istore          4
		k = j;
	//  194  403:iload_3         
	//  195  404:istore          6
		i += i1;
	//  196  406:iload_2         
	//  197  407:iload           8
	//  198  409:iadd            
	//  199  410:istore_2        
		flag3 = flag2;
	//  200  411:iload           4
	//  201  413:istore          5
		j = k;
	//  202  415:iload           6
	//  203  417:istore_3        
		  goto _L7
	//* 204  418:goto            41
_L2:
		if(flag3)
	//* 205  421:iload           5
	//* 206  423:ifeq            445
			arraylist.add(((Object) (new String(ac, j, i - j))));
	//  207  426:aload           9
	//  208  428:new             #17  <Class String>
	//  209  431:dup             
	//  210  432:aload           10
	//  211  434:iload_3         
	//  212  435:iload_2         
	//  213  436:iload_3         
	//  214  437:isub            
	//  215  438:invokespecial   #95  <Method void String(char[], int, int)>
	//  216  441:invokevirtual   #99  <Method boolean ArrayList.add(Object)>
	//  217  444:pop             
		return (String[])arraylist.toArray(((Object []) (new String[arraylist.size()])));
	//  218  445:aload           9
	//  219  447:aload           9
	//  220  449:invokevirtual   #112 <Method int ArrayList.size()>
	//  221  452:anewarray       String[]
	//  222  455:invokevirtual   #116 <Method Object[] ArrayList.toArray(Object[])>
	//  223  458:checkcast       #118 <Class String[]>
	//  224  461:areturn         
	}

	public static int zzz(String s)
	{
		byte abyte0[] = s.getBytes("UTF-8");
	//    0    0:aload_0         
	//    1    1:ldc1            #127 <String "UTF-8">
	//    2    3:invokevirtual   #131 <Method byte[] String.getBytes(String)>
	//    3    6:astore_1        
		s = ((String) (abyte0));
	//    4    7:aload_1         
	//    5    8:astore_0        
		  goto _L1
	//*   6    9:goto            17
_L3:
		s = ((String) (s.getBytes()));
	//    7   12:aload_0         
	//    8   13:invokevirtual   #134 <Method byte[] String.getBytes()>
	//    9   16:astore_0        
_L1:
		return MurmurHash3.murmurhash3_x86_32(((byte []) (s)), 0, s.length, 0);
	//   10   17:aload_0         
	//   11   18:iconst_0        
	//   12   19:aload_0         
	//   13   20:arraylength     
	//   14   21:iconst_0        
	//   15   22:invokestatic    #140 <Method int MurmurHash3.murmurhash3_x86_32(byte[], int, int, int)>
	//   16   25:ireturn         
		UnsupportedEncodingException unsupportedencodingexception;
		unsupportedencodingexception;
	//   17   26:astore_1        
		if(true) goto _L3; else goto _L2
_L2:
	//*  18   27:goto            12
	}
}
