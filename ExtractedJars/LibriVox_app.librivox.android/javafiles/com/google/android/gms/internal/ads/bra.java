// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.n;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;

public final class bra
{

	public static int a(String s)
	{
		byte abyte0[] = s.getBytes("UTF-8");
	//    0    0:aload_0         
	//    1    1:ldc1            #12  <String "UTF-8">
	//    2    3:invokevirtual   #18  <Method byte[] String.getBytes(String)>
	//    3    6:astore_1        
		s = ((String) (abyte0));
	//    4    7:aload_1         
	//    5    8:astore_0        
		  goto _L1
	//*   6    9:goto            17
_L3:
		s = ((String) (s.getBytes()));
	//    7   12:aload_0         
	//    8   13:invokevirtual   #21  <Method byte[] String.getBytes()>
	//    9   16:astore_0        
_L1:
		return n.a(((byte []) (s)), 0, s.length, 0);
	//   10   17:aload_0         
	//   11   18:iconst_0        
	//   12   19:aload_0         
	//   13   20:arraylength     
	//   14   21:iconst_0        
	//   15   22:invokestatic    #26  <Method int n.a(byte[], int, int, int)>
	//   16   25:ireturn         
		UnsupportedEncodingException unsupportedencodingexception;
		unsupportedencodingexception;
	//   17   26:astore_1        
		if(true) goto _L3; else goto _L2
_L2:
	//*  18   27:goto            12
	}

	public static String[] a(String s, boolean flag)
	{
		if(s == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		ArrayList arraylist = new ArrayList();
	//    4    6:new             #30  <Class ArrayList>
	//    5    9:dup             
	//    6   10:invokespecial   #34  <Method void ArrayList()>
	//    7   13:astore          9
		char ac[] = s.toCharArray();
	//    8   15:aload_0         
	//    9   16:invokevirtual   #38  <Method char[] String.toCharArray()>
	//   10   19:astore          10
		int l = s.length();
	//   11   21:aload_0         
	//   12   22:invokevirtual   #42  <Method int String.length()>
	//   13   25:istore          7
		int i = 0;
	//   14   27:iconst_0        
	//   15   28:istore_3        
		boolean flag2 = false;
	//   16   29:iconst_0        
	//   17   30:istore          6
		int j;
		int k;
		for(j = 0; i < l; j = k)
	//*  18   32:iconst_0        
	//*  19   33:istore          4
	//*  20   35:iload_3         
	//*  21   36:iload           7
	//*  22   38:icmpge          429
		{
			boolean flag1;
			int i1;
label0:
			{
label1:
				{
					k = Character.codePointAt(ac, i);
	//   23   41:aload           10
	//   24   43:iload_3         
	//   25   44:invokestatic    #48  <Method int Character.codePointAt(char[], int)>
	//   26   47:istore          5
					i1 = Character.charCount(k);
	//   27   49:iload           5
	//   28   51:invokestatic    #52  <Method int Character.charCount(int)>
	//   29   54:istore          8
					if(!Character.isLetter(k))
						break label1;
	//   30   56:iload           5
	//   31   58:invokestatic    #56  <Method boolean Character.isLetter(int)>
	//   32   61:ifeq            226
					s = ((String) (Character.UnicodeBlock.of(k)));
	//   33   64:iload           5
	//   34   66:invokestatic    #62  <Method Character$UnicodeBlock Character$UnicodeBlock.of(int)>
	//   35   69:astore_0        
					if(s != Character.UnicodeBlock.BOPOMOFO && s != Character.UnicodeBlock.BOPOMOFO_EXTENDED && s != Character.UnicodeBlock.CJK_COMPATIBILITY && s != Character.UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS && s != Character.UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS_SUPPLEMENT && s != Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS && s != Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_A && s != Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_B && s != Character.UnicodeBlock.ENCLOSED_CJK_LETTERS_AND_MONTHS && s != Character.UnicodeBlock.HANGUL_JAMO && s != Character.UnicodeBlock.HANGUL_SYLLABLES && s != Character.UnicodeBlock.HIRAGANA && s != Character.UnicodeBlock.KATAKANA && s != Character.UnicodeBlock.KATAKANA_PHONETIC_EXTENSIONS)
	//*  36   70:aload_0         
	//*  37   71:getstatic       #66  <Field Character$UnicodeBlock Character$UnicodeBlock.BOPOMOFO>
	//*  38   74:if_acmpeq       176
	//*  39   77:aload_0         
	//*  40   78:getstatic       #69  <Field Character$UnicodeBlock Character$UnicodeBlock.BOPOMOFO_EXTENDED>
	//*  41   81:if_acmpeq       176
	//*  42   84:aload_0         
	//*  43   85:getstatic       #72  <Field Character$UnicodeBlock Character$UnicodeBlock.CJK_COMPATIBILITY>
	//*  44   88:if_acmpeq       176
	//*  45   91:aload_0         
	//*  46   92:getstatic       #75  <Field Character$UnicodeBlock Character$UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS>
	//*  47   95:if_acmpeq       176
	//*  48   98:aload_0         
	//*  49   99:getstatic       #78  <Field Character$UnicodeBlock Character$UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS_SUPPLEMENT>
	//*  50  102:if_acmpeq       176
	//*  51  105:aload_0         
	//*  52  106:getstatic       #81  <Field Character$UnicodeBlock Character$UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS>
	//*  53  109:if_acmpeq       176
	//*  54  112:aload_0         
	//*  55  113:getstatic       #84  <Field Character$UnicodeBlock Character$UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_A>
	//*  56  116:if_acmpeq       176
	//*  57  119:aload_0         
	//*  58  120:getstatic       #87  <Field Character$UnicodeBlock Character$UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_B>
	//*  59  123:if_acmpeq       176
	//*  60  126:aload_0         
	//*  61  127:getstatic       #90  <Field Character$UnicodeBlock Character$UnicodeBlock.ENCLOSED_CJK_LETTERS_AND_MONTHS>
	//*  62  130:if_acmpeq       176
	//*  63  133:aload_0         
	//*  64  134:getstatic       #93  <Field Character$UnicodeBlock Character$UnicodeBlock.HANGUL_JAMO>
	//*  65  137:if_acmpeq       176
	//*  66  140:aload_0         
	//*  67  141:getstatic       #96  <Field Character$UnicodeBlock Character$UnicodeBlock.HANGUL_SYLLABLES>
	//*  68  144:if_acmpeq       176
	//*  69  147:aload_0         
	//*  70  148:getstatic       #99  <Field Character$UnicodeBlock Character$UnicodeBlock.HIRAGANA>
	//*  71  151:if_acmpeq       176
	//*  72  154:aload_0         
	//*  73  155:getstatic       #102 <Field Character$UnicodeBlock Character$UnicodeBlock.KATAKANA>
	//*  74  158:if_acmpeq       176
	//*  75  161:aload_0         
	//*  76  162:getstatic       #105 <Field Character$UnicodeBlock Character$UnicodeBlock.KATAKANA_PHONETIC_EXTENSIONS>
	//*  77  165:if_acmpne       171
	//*  78  168:goto            176
						flag1 = false;
	//   79  171:iconst_0        
	//   80  172:istore_2        
					else
	//*  81  173:goto            178
						flag1 = true;
	//   82  176:iconst_1        
	//   83  177:istore_2        
					if(!flag1)
	//*  84  178:iload_2         
	//*  85  179:ifne            221
					{
						if(k >= 65382 && k <= 65437 || k >= 65441 && k <= 65500)
	//*  86  182:iload           5
	//*  87  184:ldc1            #106 <Int 65382>
	//*  88  186:icmplt          196
	//*  89  189:iload           5
	//*  90  191:ldc1            #107 <Int 65437>
	//*  91  193:icmple          210
	//*  92  196:iload           5
	//*  93  198:ldc1            #108 <Int 65441>
	//*  94  200:icmplt          215
	//*  95  203:iload           5
	//*  96  205:ldc1            #109 <Int 65500>
	//*  97  207:icmpgt          215
							flag1 = true;
	//   98  210:iconst_1        
	//   99  211:istore_2        
						else
	//* 100  212:goto            217
							flag1 = false;
	//  101  215:iconst_0        
	//  102  216:istore_2        
						if(!flag1)
							break label1;
	//  103  217:iload_2         
	//  104  218:ifeq            226
					}
					flag1 = true;
	//  105  221:iconst_1        
	//  106  222:istore_2        
					break label0;
	//  107  223:goto            228
				}
				flag1 = false;
	//  108  226:iconst_0        
	//  109  227:istore_2        
			}
			if(flag1)
	//* 110  228:iload_2         
	//* 111  229:ifeq            285
			{
				if(flag2)
	//* 112  232:iload           6
	//* 113  234:ifeq            258
					arraylist.add(((Object) (new String(ac, j, i - j))));
	//  114  237:aload           9
	//  115  239:new             #14  <Class String>
	//  116  242:dup             
	//  117  243:aload           10
	//  118  245:iload           4
	//  119  247:iload_3         
	//  120  248:iload           4
	//  121  250:isub            
	//  122  251:invokespecial   #112 <Method void String(char[], int, int)>
	//  123  254:invokevirtual   #116 <Method boolean ArrayList.add(Object)>
	//  124  257:pop             
				arraylist.add(((Object) (new String(ac, i, i1))));
	//  125  258:aload           9
	//  126  260:new             #14  <Class String>
	//  127  263:dup             
	//  128  264:aload           10
	//  129  266:iload_3         
	//  130  267:iload           8
	//  131  269:invokespecial   #112 <Method void String(char[], int, int)>
	//  132  272:invokevirtual   #116 <Method boolean ArrayList.add(Object)>
	//  133  275:pop             
				flag1 = false;
	//  134  276:iconst_0        
	//  135  277:istore_2        
				k = j;
	//  136  278:iload           4
	//  137  280:istore          5
			} else
	//* 138  282:goto            414
			if(!Character.isLetterOrDigit(k) && Character.getType(k) != 6 && Character.getType(k) != 8)
	//* 139  285:iload           5
	//* 140  287:invokestatic    #119 <Method boolean Character.isLetterOrDigit(int)>
	//* 141  290:ifne            400
	//* 142  293:iload           5
	//* 143  295:invokestatic    #122 <Method int Character.getType(int)>
	//* 144  298:bipush          6
	//* 145  300:icmpeq          400
	//* 146  303:iload           5
	//* 147  305:invokestatic    #122 <Method int Character.getType(int)>
	//* 148  308:bipush          8
	//* 149  310:icmpne          316
	//* 150  313:goto            400
			{
				if(flag && Character.charCount(k) == 1 && Character.toChars(k)[0] == '\'')
	//* 151  316:iload_1         
	//* 152  317:ifeq            358
	//* 153  320:iload           5
	//* 154  322:invokestatic    #52  <Method int Character.charCount(int)>
	//* 155  325:iconst_1        
	//* 156  326:icmpne          358
	//* 157  329:iload           5
	//* 158  331:invokestatic    #126 <Method char[] Character.toChars(int)>
	//* 159  334:iconst_0        
	//* 160  335:caload          
	//* 161  336:bipush          39
	//* 162  338:icmpne          358
				{
					if(!flag2)
	//* 163  341:iload           6
	//* 164  343:ifne            349
						j = i;
	//  165  346:iload_3         
	//  166  347:istore          4
					flag1 = true;
	//  167  349:iconst_1        
	//  168  350:istore_2        
					k = j;
	//  169  351:iload           4
	//  170  353:istore          5
				} else
	//* 171  355:goto            414
				{
					flag1 = flag2;
	//  172  358:iload           6
	//  173  360:istore_2        
					k = j;
	//  174  361:iload           4
	//  175  363:istore          5
					if(flag2)
	//* 176  365:iload           6
	//* 177  367:ifeq            414
					{
						arraylist.add(((Object) (new String(ac, j, i - j))));
	//  178  370:aload           9
	//  179  372:new             #14  <Class String>
	//  180  375:dup             
	//  181  376:aload           10
	//  182  378:iload           4
	//  183  380:iload_3         
	//  184  381:iload           4
	//  185  383:isub            
	//  186  384:invokespecial   #112 <Method void String(char[], int, int)>
	//  187  387:invokevirtual   #116 <Method boolean ArrayList.add(Object)>
	//  188  390:pop             
						flag1 = false;
	//  189  391:iconst_0        
	//  190  392:istore_2        
						k = j;
	//  191  393:iload           4
	//  192  395:istore          5
					}
				}
			} else
	//* 193  397:goto            414
			{
				if(!flag2)
	//* 194  400:iload           6
	//* 195  402:ifne            408
					j = i;
	//  196  405:iload_3         
	//  197  406:istore          4
				flag1 = true;
	//  198  408:iconst_1        
	//  199  409:istore_2        
				k = j;
	//  200  410:iload           4
	//  201  412:istore          5
			}
			i += i1;
	//  202  414:iload_3         
	//  203  415:iload           8
	//  204  417:iadd            
	//  205  418:istore_3        
			flag2 = flag1;
	//  206  419:iload_2         
	//  207  420:istore          6
		}

	//  208  422:iload           5
	//  209  424:istore          4
	//* 210  426:goto            35
		if(flag2)
	//* 211  429:iload           6
	//* 212  431:ifeq            455
			arraylist.add(((Object) (new String(ac, j, i - j))));
	//  213  434:aload           9
	//  214  436:new             #14  <Class String>
	//  215  439:dup             
	//  216  440:aload           10
	//  217  442:iload           4
	//  218  444:iload_3         
	//  219  445:iload           4
	//  220  447:isub            
	//  221  448:invokespecial   #112 <Method void String(char[], int, int)>
	//  222  451:invokevirtual   #116 <Method boolean ArrayList.add(Object)>
	//  223  454:pop             
		return (String[])arraylist.toArray(((Object []) (new String[arraylist.size()])));
	//  224  455:aload           9
	//  225  457:aload           9
	//  226  459:invokevirtual   #129 <Method int ArrayList.size()>
	//  227  462:anewarray       String[]
	//  228  465:invokevirtual   #133 <Method Object[] ArrayList.toArray(Object[])>
	//  229  468:checkcast       #135 <Class String[]>
	//  230  471:areturn         
	}
}
