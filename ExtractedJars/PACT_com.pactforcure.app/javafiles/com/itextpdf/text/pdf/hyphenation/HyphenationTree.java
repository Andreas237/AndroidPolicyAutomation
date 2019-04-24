// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.hyphenation;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;

// Referenced classes of package com.itextpdf.text.pdf.hyphenation:
//			TernaryTree, PatternConsumer, ByteVector, Hyphenation, 
//			SimplePatternParser, CharVector

public class HyphenationTree extends TernaryTree
	implements PatternConsumer
{

	public HyphenationTree()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void TernaryTree()>
		stoplist = new HashMap(23);
	//    2    4:aload_0         
	//    3    5:new             #24  <Class HashMap>
	//    4    8:dup             
	//    5    9:bipush          23
	//    6   11:invokespecial   #27  <Method void HashMap(int)>
	//    7   14:putfield        #29  <Field HashMap stoplist>
		classmap = new TernaryTree();
	//    8   17:aload_0         
	//    9   18:new             #4   <Class TernaryTree>
	//   10   21:dup             
	//   11   22:invokespecial   #22  <Method void TernaryTree()>
	//   12   25:putfield        #31  <Field TernaryTree classmap>
		vspace = new ByteVector();
	//   13   28:aload_0         
	//   14   29:new             #33  <Class ByteVector>
	//   15   32:dup             
	//   16   33:invokespecial   #34  <Method void ByteVector()>
	//   17   36:putfield        #36  <Field ByteVector vspace>
		vspace.alloc(1);
	//   18   39:aload_0         
	//   19   40:getfield        #36  <Field ByteVector vspace>
	//   20   43:iconst_1        
	//   21   44:invokevirtual   #40  <Method int ByteVector.alloc(int)>
	//   22   47:pop             
	//   23   48:return          
	}

	public void addClass(String s)
	{
		if(s.length() > 0)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #49  <Method int String.length()>
	//*   2    4:ifle            60
		{
			char c = s.charAt(0);
	//    3    7:aload_1         
	//    4    8:iconst_0        
	//    5    9:invokevirtual   #53  <Method char String.charAt(int)>
	//    6   12:istore_2        
			char ac[] = new char[2];
	//    7   13:iconst_2        
	//    8   14:newarray        char[]
	//    9   16:astore          4
			ac[1] = '\0';
	//   10   18:aload           4
	//   11   20:iconst_1        
	//   12   21:iconst_0        
	//   13   22:castore         
			for(int i = 0; i < s.length(); i++)
	//*  14   23:iconst_0        
	//*  15   24:istore_3        
	//*  16   25:iload_3         
	//*  17   26:aload_1         
	//*  18   27:invokevirtual   #49  <Method int String.length()>
	//*  19   30:icmpge          60
			{
				ac[0] = s.charAt(i);
	//   20   33:aload           4
	//   21   35:iconst_0        
	//   22   36:aload_1         
	//   23   37:iload_3         
	//   24   38:invokevirtual   #53  <Method char String.charAt(int)>
	//   25   41:castore         
				classmap.insert(ac, 0, c);
	//   26   42:aload_0         
	//   27   43:getfield        #31  <Field TernaryTree classmap>
	//   28   46:aload           4
	//   29   48:iconst_0        
	//   30   49:iload_2         
	//   31   50:invokevirtual   #57  <Method void TernaryTree.insert(char[], int, char)>
			}

	//   32   53:iload_3         
	//   33   54:iconst_1        
	//   34   55:iadd            
	//   35   56:istore_3        
		}
	//*  36   57:goto            25
	//   37   60:return          
	}

	public void addException(String s, ArrayList arraylist)
	{
		stoplist.put(((Object) (s)), ((Object) (arraylist)));
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field HashMap stoplist>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #63  <Method Object HashMap.put(Object, Object)>
	//    5    9:pop             
	//    6   10:return          
	}

	public void addPattern(String s, String s1)
	{
		int j = ivalues.find(s1);
	//    0    0:aload_0         
	//    1    1:getfield        #69  <Field TernaryTree ivalues>
	//    2    4:aload_2         
	//    3    5:invokevirtual   #73  <Method int TernaryTree.find(String)>
	//    4    8:istore          4
		int i = j;
	//    5   10:iload           4
	//    6   12:istore_3        
		if(j <= 0)
	//*   7   13:iload           4
	//*   8   15:ifgt            34
		{
			i = packValues(s1);
	//    9   18:aload_0         
	//   10   19:aload_2         
	//   11   20:invokevirtual   #76  <Method int packValues(String)>
	//   12   23:istore_3        
			ivalues.insert(s1, (char)i);
	//   13   24:aload_0         
	//   14   25:getfield        #69  <Field TernaryTree ivalues>
	//   15   28:aload_2         
	//   16   29:iload_3         
	//   17   30:int2char        
	//   18   31:invokevirtual   #79  <Method void TernaryTree.insert(String, char)>
		}
		insert(s, (char)i);
	//   19   34:aload_0         
	//   20   35:aload_1         
	//   21   36:iload_3         
	//   22   37:int2char        
	//   23   38:invokevirtual   #80  <Method void insert(String, char)>
	//   24   41:return          
	}

	public String findPattern(String s)
	{
		int i = super.find(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #73  <Method int TernaryTree.find(String)>
	//    3    5:istore_2        
		if(i >= 0)
	//*   4    6:iload_2         
	//*   5    7:iflt            16
			return unpackValues(i);
	//    6   10:aload_0         
	//    7   11:iload_2         
	//    8   12:invokevirtual   #86  <Method String unpackValues(int)>
	//    9   15:areturn         
		else
			return "";
	//   10   16:ldc1            #88  <String "">
	//   11   18:areturn         
	}

	protected byte[] getValues(int i)
	{
		StringBuffer stringbuffer = new StringBuffer();
	//    0    0:new             #92  <Class StringBuffer>
	//    1    3:dup             
	//    2    4:invokespecial   #93  <Method void StringBuffer()>
	//    3    7:astore          4
		ByteVector bytevector = vspace;
	//    4    9:aload_0         
	//    5   10:getfield        #36  <Field ByteVector vspace>
	//    6   13:astore          5
		int j = i + 1;
	//    7   15:iload_1         
	//    8   16:iconst_1        
	//    9   17:iadd            
	//   10   18:istore_3        
		char c = ((char) (bytevector.get(i)));
	//   11   19:aload           5
	//   12   21:iload_1         
	//   13   22:invokevirtual   #97  <Method byte ByteVector.get(int)>
	//   14   25:istore_2        
		i = j;
	//   15   26:iload_3         
	//   16   27:istore_1        
		byte abyte0[];
label0:
		do
		{
label1:
			{
				if(c != 0)
	//*  17   28:iload_2         
	//*  18   29:ifeq            54
				{
					stringbuffer.append((char)((c >>> 4) - 1));
	//   19   32:aload           4
	//   20   34:iload_2         
	//   21   35:iconst_4        
	//   22   36:iushr           
	//   23   37:iconst_1        
	//   24   38:isub            
	//   25   39:int2char        
	//   26   40:invokevirtual   #101 <Method StringBuffer StringBuffer.append(char)>
	//   27   43:pop             
					c &= '\017';
	//   28   44:iload_2         
	//   29   45:bipush          15
	//   30   47:iand            
	//   31   48:int2char        
	//   32   49:istore_2        
					if(c != 0)
						break label1;
	//   33   50:iload_2         
	//   34   51:ifne            90
				}
				abyte0 = new byte[stringbuffer.length()];
	//   35   54:aload           4
	//   36   56:invokevirtual   #102 <Method int StringBuffer.length()>
	//   37   59:newarray        byte[]
	//   38   61:astore          5
				for(i = 0; i < abyte0.length; i++)
	//*  39   63:iconst_0        
	//*  40   64:istore_1        
	//*  41   65:iload_1         
	//*  42   66:aload           5
	//*  43   68:arraylength     
	//*  44   69:icmpge          116
					abyte0[i] = (byte)stringbuffer.charAt(i);
	//   45   72:aload           5
	//   46   74:iload_1         
	//   47   75:aload           4
	//   48   77:iload_1         
	//   49   78:invokevirtual   #103 <Method char StringBuffer.charAt(int)>
	//   50   81:int2byte        
	//   51   82:bastore         

	//   52   83:iload_1         
	//   53   84:iconst_1        
	//   54   85:iadd            
	//   55   86:istore_1        
				break label0;
	//   56   87:goto            65
			}
			stringbuffer.append((char)(c - 1));
	//   57   90:aload           4
	//   58   92:iload_2         
	//   59   93:iconst_1        
	//   60   94:isub            
	//   61   95:int2char        
	//   62   96:invokevirtual   #101 <Method StringBuffer StringBuffer.append(char)>
	//   63   99:pop             
			c = ((char) (vspace.get(i)));
	//   64  100:aload_0         
	//   65  101:getfield        #36  <Field ByteVector vspace>
	//   66  104:iload_1         
	//   67  105:invokevirtual   #97  <Method byte ByteVector.get(int)>
	//   68  108:istore_2        
			i++;
	//   69  109:iload_1         
	//   70  110:iconst_1        
	//   71  111:iadd            
	//   72  112:istore_1        
		} while(true);
	//   73  113:goto            28
		return abyte0;
	//   74  116:aload           5
	//   75  118:areturn         
	}

	protected int hstrcmp(char ac[], int i, char ac1[], int j)
	{
_L7:
		if(ac[i] != ac1[j]) goto _L2; else goto _L1
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:caload          
	//    3    3:aload_3         
	//    4    4:iload           4
	//    5    6:caload          
	//    6    7:icmpne          31
_L1:
		if(ac[i] != 0) goto _L4; else goto _L3
	//    7   10:aload_1         
	//    8   11:iload_2         
	//    9   12:caload          
	//   10   13:ifne            18
_L3:
		return 0;
	//   11   16:iconst_0        
	//   12   17:ireturn         
_L4:
		i++;
	//   13   18:iload_2         
	//   14   19:iconst_1        
	//   15   20:iadd            
	//   16   21:istore_2        
		j++;
	//   17   22:iload           4
	//   18   24:iconst_1        
	//   19   25:iadd            
	//   20   26:istore          4
		continue; /* Loop/switch isn't completed */
	//   21   28:goto            0
_L2:
		if(ac1[j] == 0) goto _L3; else goto _L5
	//   22   31:aload_3         
	//   23   32:iload           4
	//   24   34:caload          
	//   25   35:ifeq            16
_L5:
		return ac[i] - ac1[j];
	//   26   38:aload_1         
	//   27   39:iload_2         
	//   28   40:caload          
	//   29   41:aload_3         
	//   30   42:iload           4
	//   31   44:caload          
	//   32   45:isub            
	//   33   46:ireturn         
		if(true) goto _L7; else goto _L6
_L6:
	}

	public Hyphenation hyphenate(String s, int i, int j)
	{
		s = ((String) (s.toCharArray()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #111 <Method char[] String.toCharArray()>
	//    2    4:astore_1        
		return hyphenate(((char []) (s)), 0, s.length, i, j);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:iconst_0        
	//    6    8:aload_1         
	//    7    9:arraylength     
	//    8   10:iload_2         
	//    9   11:iload_3         
	//   10   12:invokevirtual   #114 <Method Hyphenation hyphenate(char[], int, int, int, int)>
	//   11   15:areturn         
	}

	public Hyphenation hyphenate(char ac[], int i, int j, int k, int l)
	{
		char ac1[] = new char[j + 3];
	//    0    0:iload_3         
	//    1    1:iconst_3        
	//    2    2:iadd            
	//    3    3:newarray        char[]
	//    4    5:astore          14
		int ai[] = ((int []) (new char[2]));
	//    5    7:iconst_2        
	//    6    8:newarray        char[]
	//    7   10:astore          13
		int l1 = 0;
	//    8   12:iconst_0        
	//    9   13:istore          7
		int i2 = j;
	//   10   15:iload_3         
	//   11   16:istore          8
		boolean flag = false;
	//   12   18:iconst_0        
	//   13   19:istore          6
		int j2 = 1;
	//   14   21:iconst_1        
	//   15   22:istore          9
		while(j2 <= j) 
	//*  16   24:iload           9
	//*  17   26:iload_3         
	//*  18   27:icmpgt          116
		{
			ai[0] = ac[(i + j2) - 1];
	//   19   30:aload           13
	//   20   32:iconst_0        
	//   21   33:aload_1         
	//   22   34:iload_2         
	//   23   35:iload           9
	//   24   37:iadd            
	//   25   38:iconst_1        
	//   26   39:isub            
	//   27   40:caload          
	//   28   41:castore         
			int i3 = classmap.find(((char []) (ai)), 0);
	//   29   42:aload_0         
	//   30   43:getfield        #31  <Field TernaryTree classmap>
	//   31   46:aload           13
	//   32   48:iconst_0        
	//   33   49:invokevirtual   #117 <Method int TernaryTree.find(char[], int)>
	//   34   52:istore          10
			if(i3 < 0)
	//*  35   54:iload           10
	//*  36   56:ifge            95
			{
				if(j2 == l1 + 1)
	//*  37   59:iload           9
	//*  38   61:iload           7
	//*  39   63:iconst_1        
	//*  40   64:iadd            
	//*  41   65:icmpne          89
					l1++;
	//   42   68:iload           7
	//   43   70:iconst_1        
	//   44   71:iadd            
	//   45   72:istore          7
				else
	//*  46   74:iload           8
	//*  47   76:iconst_1        
	//*  48   77:isub            
	//*  49   78:istore          8
	//*  50   80:iload           9
	//*  51   82:iconst_1        
	//*  52   83:iadd            
	//*  53   84:istore          9
	//*  54   86:goto            24
					flag = true;
	//   55   89:iconst_1        
	//   56   90:istore          6
				i2--;
			} else
	//*  57   92:goto            74
			if(!flag)
	//*  58   95:iload           6
	//*  59   97:ifne            114
				ac1[j2 - l1] = (char)i3;
	//   60  100:aload           14
	//   61  102:iload           9
	//   62  104:iload           7
	//   63  106:isub            
	//   64  107:iload           10
	//   65  109:int2char        
	//   66  110:castore         
			else
	//*  67  111:goto            80
				return null;
	//   68  114:aconst_null     
	//   69  115:areturn         
			j2++;
		}
		if(i2 < k + l)
	//*  70  116:iload           8
	//*  71  118:iload           4
	//*  72  120:iload           5
	//*  73  122:iadd            
	//*  74  123:icmpge          128
			return null;
	//   75  126:aconst_null     
	//   76  127:areturn         
		ai = new int[i2 + 1];
	//   77  128:iload           8
	//   78  130:iconst_1        
	//   79  131:iadd            
	//   80  132:newarray        int[]
	//   81  134:astore          13
		int i1 = 0;
	//   82  136:iconst_0        
	//   83  137:istore          6
		String s = new String(ac1, 1, i2);
	//   84  139:new             #45  <Class String>
	//   85  142:dup             
	//   86  143:aload           14
	//   87  145:iconst_1        
	//   88  146:iload           8
	//   89  148:invokespecial   #120 <Method void String(char[], int, int)>
	//   90  151:astore          15
		int l3;
		if(stoplist.containsKey(((Object) (s))))
	//*  91  153:aload_0         
	//*  92  154:getfield        #29  <Field HashMap stoplist>
	//*  93  157:aload           15
	//*  94  159:invokevirtual   #124 <Method boolean HashMap.containsKey(Object)>
	//*  95  162:ifeq            307
		{
			ac1 = ((char []) ((ArrayList)stoplist.get(((Object) (s)))));
	//   96  165:aload_0         
	//   97  166:getfield        #29  <Field HashMap stoplist>
	//   98  169:aload           15
	//   99  171:invokevirtual   #127 <Method Object HashMap.get(Object)>
	//  100  174:checkcast       #129 <Class ArrayList>
	//  101  177:astore          14
			int j3 = 0;
	//  102  179:iconst_0        
	//  103  180:istore          10
			int k2 = 0;
	//  104  182:iconst_0        
	//  105  183:istore          9
			do
			{
				l3 = i1;
	//  106  185:iload           6
	//  107  187:istore          11
				if(k2 >= ((ArrayList) (ac1)).size())
					break;
	//  108  189:iload           9
	//  109  191:aload           14
	//  110  193:invokevirtual   #132 <Method int ArrayList.size()>
	//  111  196:icmpge          445
				Object obj = ((ArrayList) (ac1)).get(k2);
	//  112  199:aload           14
	//  113  201:iload           9
	//  114  203:invokevirtual   #135 <Method Object ArrayList.get(int)>
	//  115  206:astore          15
				l3 = j3;
	//  116  208:iload           10
	//  117  210:istore          11
				int i4 = i1;
	//  118  212:iload           6
	//  119  214:istore          12
				if(obj instanceof String)
	//* 120  216:aload           15
	//* 121  218:instanceof      #45  <Class String>
	//* 122  221:ifeq            290
				{
					j3 += ((String)obj).length();
	//  123  224:iload           10
	//  124  226:aload           15
	//  125  228:checkcast       #45  <Class String>
	//  126  231:invokevirtual   #49  <Method int String.length()>
	//  127  234:iadd            
	//  128  235:istore          10
					l3 = j3;
	//  129  237:iload           10
	//  130  239:istore          11
					i4 = i1;
	//  131  241:iload           6
	//  132  243:istore          12
					if(j3 >= k)
	//* 133  245:iload           10
	//* 134  247:iload           4
	//* 135  249:icmplt          290
					{
						l3 = j3;
	//  136  252:iload           10
	//  137  254:istore          11
						i4 = i1;
	//  138  256:iload           6
	//  139  258:istore          12
						if(j3 < i2 - l)
	//* 140  260:iload           10
	//* 141  262:iload           8
	//* 142  264:iload           5
	//* 143  266:isub            
	//* 144  267:icmpge          290
						{
							ai[i1] = j3 + l1;
	//  145  270:aload           13
	//  146  272:iload           6
	//  147  274:iload           10
	//  148  276:iload           7
	//  149  278:iadd            
	//  150  279:iastore         
							i4 = i1 + 1;
	//  151  280:iload           6
	//  152  282:iconst_1        
	//  153  283:iadd            
	//  154  284:istore          12
							l3 = j3;
	//  155  286:iload           10
	//  156  288:istore          11
						}
					}
				}
				k2++;
	//  157  290:iload           9
	//  158  292:iconst_1        
	//  159  293:iadd            
	//  160  294:istore          9
				j3 = l3;
	//  161  296:iload           11
	//  162  298:istore          10
				i1 = i4;
	//  163  300:iload           12
	//  164  302:istore          6
			} while(true);
	//  165  304:goto            185
		} else
		{
			ac1[0] = '.';
	//  166  307:aload           14
	//  167  309:iconst_0        
	//  168  310:bipush          46
	//  169  312:castore         
			ac1[i2 + 1] = '.';
	//  170  313:aload           14
	//  171  315:iload           8
	//  172  317:iconst_1        
	//  173  318:iadd            
	//  174  319:bipush          46
	//  175  321:castore         
			ac1[i2 + 2] = '\0';
	//  176  322:aload           14
	//  177  324:iload           8
	//  178  326:iconst_2        
	//  179  327:iadd            
	//  180  328:iconst_0        
	//  181  329:castore         
			byte abyte0[] = new byte[i2 + 3];
	//  182  330:iload           8
	//  183  332:iconst_3        
	//  184  333:iadd            
	//  185  334:newarray        byte[]
	//  186  336:astore          15
			for(int j1 = 0; j1 < i2 + 1; j1++)
	//* 187  338:iconst_0        
	//* 188  339:istore          6
	//* 189  341:iload           6
	//* 190  343:iload           8
	//* 191  345:iconst_1        
	//* 192  346:iadd            
	//* 193  347:icmpge          369
				searchPatterns(ac1, j1, abyte0);
	//  194  350:aload_0         
	//  195  351:aload           14
	//  196  353:iload           6
	//  197  355:aload           15
	//  198  357:invokevirtual   #139 <Method void searchPatterns(char[], int, byte[])>

	//  199  360:iload           6
	//  200  362:iconst_1        
	//  201  363:iadd            
	//  202  364:istore          6
	//* 203  366:goto            341
			int l2 = 0;
	//  204  369:iconst_0        
	//  205  370:istore          9
			int k1 = 0;
	//  206  372:iconst_0        
	//  207  373:istore          6
			for(; l2 < i2; l2++)
	//* 208  375:iload           9
	//* 209  377:iload           8
	//* 210  379:icmpge          441
				if((abyte0[l2 + 1] & 1) == 1 && l2 >= k && l2 <= i2 - l)
	//* 211  382:aload           15
	//* 212  384:iload           9
	//* 213  386:iconst_1        
	//* 214  387:iadd            
	//* 215  388:baload          
	//* 216  389:iconst_1        
	//* 217  390:iand            
	//* 218  391:iconst_1        
	//* 219  392:icmpne          489
	//* 220  395:iload           9
	//* 221  397:iload           4
	//* 222  399:icmplt          489
	//* 223  402:iload           9
	//* 224  404:iload           8
	//* 225  406:iload           5
	//* 226  408:isub            
	//* 227  409:icmpgt          489
				{
					int k3 = k1 + 1;
	//  228  412:iload           6
	//  229  414:iconst_1        
	//  230  415:iadd            
	//  231  416:istore          10
					ai[k1] = l2 + l1;
	//  232  418:aload           13
	//  233  420:iload           6
	//  234  422:iload           9
	//  235  424:iload           7
	//  236  426:iadd            
	//  237  427:iastore         
					k1 = k3;
	//  238  428:iload           10
	//  239  430:istore          6
				}

	//  240  432:iload           9
	//  241  434:iconst_1        
	//  242  435:iadd            
	//  243  436:istore          9
	//* 244  438:goto            375
			l3 = k1;
	//  245  441:iload           6
	//  246  443:istore          11
		}
		if(l3 > 0)
	//* 247  445:iload           11
	//* 248  447:ifle            487
		{
			int ai1[] = new int[l3];
	//  249  450:iload           11
	//  250  452:newarray        int[]
	//  251  454:astore          14
			System.arraycopy(((Object) (ai)), 0, ((Object) (ai1)), 0, l3);
	//  252  456:aload           13
	//  253  458:iconst_0        
	//  254  459:aload           14
	//  255  461:iconst_0        
	//  256  462:iload           11
	//  257  464:invokestatic    #145 <Method void System.arraycopy(Object, int, Object, int, int)>
			return new Hyphenation(new String(ac, i, j), ai1);
	//  258  467:new             #147 <Class Hyphenation>
	//  259  470:dup             
	//  260  471:new             #45  <Class String>
	//  261  474:dup             
	//  262  475:aload_1         
	//  263  476:iload_2         
	//  264  477:iload_3         
	//  265  478:invokespecial   #120 <Method void String(char[], int, int)>
	//  266  481:aload           14
	//  267  483:invokespecial   #150 <Method void Hyphenation(String, int[])>
	//  268  486:areturn         
		} else
		{
			return null;
	//  269  487:aconst_null     
	//  270  488:areturn         
		}
	//* 271  489:goto            432
	}

	public void loadSimplePatterns(InputStream inputstream)
	{
		SimplePatternParser simplepatternparser = new SimplePatternParser();
	//    0    0:new             #154 <Class SimplePatternParser>
	//    1    3:dup             
	//    2    4:invokespecial   #155 <Method void SimplePatternParser()>
	//    3    7:astore_2        
		ivalues = new TernaryTree();
	//    4    8:aload_0         
	//    5    9:new             #4   <Class TernaryTree>
	//    6   12:dup             
	//    7   13:invokespecial   #22  <Method void TernaryTree()>
	//    8   16:putfield        #69  <Field TernaryTree ivalues>
		simplepatternparser.parse(inputstream, ((PatternConsumer) (this)));
	//    9   19:aload_2         
	//   10   20:aload_1         
	//   11   21:aload_0         
	//   12   22:invokevirtual   #159 <Method void SimplePatternParser.parse(InputStream, PatternConsumer)>
		trimToSize();
	//   13   25:aload_0         
	//   14   26:invokevirtual   #162 <Method void trimToSize()>
		vspace.trimToSize();
	//   15   29:aload_0         
	//   16   30:getfield        #36  <Field ByteVector vspace>
	//   17   33:invokevirtual   #163 <Method void ByteVector.trimToSize()>
		classmap.trimToSize();
	//   18   36:aload_0         
	//   19   37:getfield        #31  <Field TernaryTree classmap>
	//   20   40:invokevirtual   #164 <Method void TernaryTree.trimToSize()>
		ivalues = null;
	//   21   43:aload_0         
	//   22   44:aconst_null     
	//   23   45:putfield        #69  <Field TernaryTree ivalues>
	//   24   48:return          
	}

	protected int packValues(String s)
	{
		int k = s.length();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #49  <Method int String.length()>
	//    2    4:istore          4
		int i;
		int j;
		int l;
		byte abyte0[];
		if((k & 1) == 1)
	//*   3    6:iload           4
	//*   4    8:iconst_1        
	//*   5    9:iand            
	//*   6   10:iconst_1        
	//*   7   11:icmpne          103
			i = (k >> 1) + 2;
	//    8   14:iload           4
	//    9   16:iconst_1        
	//   10   17:ishr            
	//   11   18:iconst_2        
	//   12   19:iadd            
	//   13   20:istore_2        
		else
	//*  14   21:aload_0         
	//*  15   22:getfield        #36  <Field ByteVector vspace>
	//*  16   25:iload_2         
	//*  17   26:invokevirtual   #40  <Method int ByteVector.alloc(int)>
	//*  18   29:istore          5
	//*  19   31:aload_0         
	//*  20   32:getfield        #36  <Field ByteVector vspace>
	//*  21   35:invokevirtual   #168 <Method byte[] ByteVector.getArray()>
	//*  22   38:astore          8
	//*  23   40:iconst_0        
	//*  24   41:istore_3        
	//*  25   42:iload_3         
	//*  26   43:iload           4
	//*  27   45:icmpge          129
	//*  28   48:iload_3         
	//*  29   49:iconst_1        
	//*  30   50:ishr            
	//*  31   51:istore          6
	//*  32   53:aload_1         
	//*  33   54:iload_3         
	//*  34   55:invokevirtual   #53  <Method char String.charAt(int)>
	//*  35   58:bipush          48
	//*  36   60:isub            
	//*  37   61:iconst_1        
	//*  38   62:iadd            
	//*  39   63:bipush          15
	//*  40   65:iand            
	//*  41   66:int2byte        
	//*  42   67:istore          7
	//*  43   69:iload_3         
	//*  44   70:iconst_1        
	//*  45   71:iand            
	//*  46   72:iconst_1        
	//*  47   73:icmpne          113
	//*  48   76:aload           8
	//*  49   78:iload           6
	//*  50   80:iload           5
	//*  51   82:iadd            
	//*  52   83:aload           8
	//*  53   85:iload           6
	//*  54   87:iload           5
	//*  55   89:iadd            
	//*  56   90:baload          
	//*  57   91:iload           7
	//*  58   93:ior             
	//*  59   94:int2byte        
	//*  60   95:bastore         
	//*  61   96:iload_3         
	//*  62   97:iconst_1        
	//*  63   98:iadd            
	//*  64   99:istore_3        
	//*  65  100:goto            42
			i = (k >> 1) + 1;
	//   66  103:iload           4
	//   67  105:iconst_1        
	//   68  106:ishr            
	//   69  107:iconst_1        
	//   70  108:iadd            
	//   71  109:istore_2        
		l = vspace.alloc(i);
		abyte0 = vspace.getArray();
		j = 0;
		while(j < k) 
		{
			int i1 = j >> 1;
			byte byte0 = (byte)((s.charAt(j) - 48) + 1 & 0xf);
			if((j & 1) == 1)
				abyte0[i1 + l] = (byte)(abyte0[i1 + l] | byte0);
			else
	//*  72  110:goto            21
				abyte0[i1 + l] = (byte)(byte0 << 4);
	//   73  113:aload           8
	//   74  115:iload           6
	//   75  117:iload           5
	//   76  119:iadd            
	//   77  120:iload           7
	//   78  122:iconst_4        
	//   79  123:ishl            
	//   80  124:int2byte        
	//   81  125:bastore         
			j++;
		}
	//*  82  126:goto            96
		abyte0[(i - 1) + l] = 0;
	//   83  129:aload           8
	//   84  131:iload_2         
	//   85  132:iconst_1        
	//   86  133:isub            
	//   87  134:iload           5
	//   88  136:iadd            
	//   89  137:iconst_0        
	//   90  138:bastore         
		return l;
	//   91  139:iload           5
	//   92  141:ireturn         
	}

	public void printStats()
	{
		System.out.println((new StringBuilder()).append("Value space size = ").append(Integer.toString(vspace.length())).toString());
	//    0    0:getstatic       #173 <Field PrintStream System.out>
	//    1    3:new             #175 <Class StringBuilder>
	//    2    6:dup             
	//    3    7:invokespecial   #176 <Method void StringBuilder()>
	//    4   10:ldc1            #178 <String "Value space size = ">
	//    5   12:invokevirtual   #181 <Method StringBuilder StringBuilder.append(String)>
	//    6   15:aload_0         
	//    7   16:getfield        #36  <Field ByteVector vspace>
	//    8   19:invokevirtual   #182 <Method int ByteVector.length()>
	//    9   22:invokestatic    #187 <Method String Integer.toString(int)>
	//   10   25:invokevirtual   #181 <Method StringBuilder StringBuilder.append(String)>
	//   11   28:invokevirtual   #190 <Method String StringBuilder.toString()>
	//   12   31:invokevirtual   #195 <Method void PrintStream.println(String)>
		super.printStats();
	//   13   34:aload_0         
	//   14   35:invokespecial   #197 <Method void TernaryTree.printStats()>
	//   15   38:return          
	}

	protected void searchPatterns(char ac[], int i, byte abyte0[])
	{
		int i1 = i;
	//    0    0:iload_2         
	//    1    1:istore          8
		int k = ((int) (ac[i1]));
	//    2    3:aload_1         
	//    3    4:iload           8
	//    4    6:caload          
	//    5    7:istore          6
		int j = ((int) (root));
	//    6    9:aload_0         
	//    7   10:getfield        #201 <Field char root>
	//    8   13:istore          5
label0:
		do
		{
			int l;
label1:
			{
label2:
				{
					if(j > 0 && j < sc.length)
	//*   9   15:iload           5
	//*  10   17:ifle            155
	//*  11   20:iload           5
	//*  12   22:aload_0         
	//*  13   23:getfield        #205 <Field char[] sc>
	//*  14   26:arraylength     
	//*  15   27:icmpge          155
						if(sc[j] == '\uFFFF')
	//*  16   30:aload_0         
	//*  17   31:getfield        #205 <Field char[] sc>
	//*  18   34:iload           5
	//*  19   36:caload          
	//*  20   37:ldc1            #206 <Int 65535>
	//*  21   39:icmpne          133
						{
							if(hstrcmp(ac, i1, kv.getArray(), ((int) (lo[j]))) == 0)
	//*  22   42:aload_0         
	//*  23   43:aload_1         
	//*  24   44:iload           8
	//*  25   46:aload_0         
	//*  26   47:getfield        #210 <Field CharVector kv>
	//*  27   50:invokevirtual   #214 <Method char[] CharVector.getArray()>
	//*  28   53:aload_0         
	//*  29   54:getfield        #217 <Field char[] lo>
	//*  30   57:iload           5
	//*  31   59:caload          
	//*  32   60:invokevirtual   #219 <Method int hstrcmp(char[], int, char[], int)>
	//*  33   63:ifne            155
							{
								ac = ((char []) (getValues(((int) (eq[j])))));
	//   34   66:aload_0         
	//   35   67:aload_0         
	//   36   68:getfield        #222 <Field char[] eq>
	//   37   71:iload           5
	//   38   73:caload          
	//   39   74:invokevirtual   #224 <Method byte[] getValues(int)>
	//   40   77:astore_1        
								j = i;
	//   41   78:iload_2         
	//   42   79:istore          5
								k = ac.length;
	//   43   81:aload_1         
	//   44   82:arraylength     
	//   45   83:istore          6
								for(i = 0; i < k; i++)
	//*  46   85:iconst_0        
	//*  47   86:istore_2        
	//*  48   87:iload_2         
	//*  49   88:iload           6
	//*  50   90:icmpge          155
								{
									byte byte0 = ((byte) (ac[i]));
	//   51   93:aload_1         
	//   52   94:iload_2         
	//   53   95:baload          
	//   54   96:istore          4
									if(j < abyte0.length && byte0 > abyte0[j])
	//*  55   98:iload           5
	//*  56  100:aload_3         
	//*  57  101:arraylength     
	//*  58  102:icmpge          120
	//*  59  105:iload           4
	//*  60  107:aload_3         
	//*  61  108:iload           5
	//*  62  110:baload          
	//*  63  111:icmple          120
										abyte0[j] = byte0;
	//   64  114:aload_3         
	//   65  115:iload           5
	//   66  117:iload           4
	//   67  119:bastore         
									j++;
	//   68  120:iload           5
	//   69  122:iconst_1        
	//   70  123:iadd            
	//   71  124:istore          5
								}

	//   72  126:iload_2         
	//   73  127:iconst_1        
	//   74  128:iadd            
	//   75  129:istore_2        
							}
						} else
	//*  76  130:goto            87
						{
							l = k - sc[j];
	//   77  133:iload           6
	//   78  135:aload_0         
	//   79  136:getfield        #205 <Field char[] sc>
	//   80  139:iload           5
	//   81  141:caload          
	//   82  142:isub            
	//   83  143:istore          7
							if(l != 0)
								break label1;
	//   84  145:iload           7
	//   85  147:ifne            353
							if(k != 0)
								break label2;
	//   86  150:iload           6
	//   87  152:ifne            156
						}
					return;
	//   88  155:return          
				}
				int l1 = i1 + 1;
	//   89  156:iload           8
	//   90  158:iconst_1        
	//   91  159:iadd            
	//   92  160:istore          11
				char c = ac[l1];
	//   93  162:aload_1         
	//   94  163:iload           11
	//   95  165:caload          
	//   96  166:istore          12
				l = ((int) (eq[j]));
	//   97  168:aload_0         
	//   98  169:getfield        #222 <Field char[] eq>
	//   99  172:iload           5
	//  100  174:caload          
	//  101  175:istore          7
				int j1 = l;
	//  102  177:iload           7
	//  103  179:istore          9
				do
				{
					i1 = l1;
	//  104  181:iload           11
	//  105  183:istore          8
					j = l;
	//  106  185:iload           7
	//  107  187:istore          5
					k = ((int) (c));
	//  108  189:iload           12
	//  109  191:istore          6
					if(j1 <= 0)
						continue label0;
	//  110  193:iload           9
	//  111  195:ifle            15
					i1 = l1;
	//  112  198:iload           11
	//  113  200:istore          8
					j = l;
	//  114  202:iload           7
	//  115  204:istore          5
					k = ((int) (c));
	//  116  206:iload           12
	//  117  208:istore          6
					if(j1 >= sc.length)
						continue label0;
	//  118  210:iload           9
	//  119  212:aload_0         
	//  120  213:getfield        #205 <Field char[] sc>
	//  121  216:arraylength     
	//  122  217:icmpge          15
					i1 = l1;
	//  123  220:iload           11
	//  124  222:istore          8
					j = l;
	//  125  224:iload           7
	//  126  226:istore          5
					k = ((int) (c));
	//  127  228:iload           12
	//  128  230:istore          6
					if(sc[j1] == '\uFFFF')
						continue label0;
	//  129  232:aload_0         
	//  130  233:getfield        #205 <Field char[] sc>
	//  131  236:iload           9
	//  132  238:caload          
	//  133  239:ldc1            #206 <Int 65535>
	//  134  241:icmpeq          15
					if(sc[j1] == 0)
	//* 135  244:aload_0         
	//* 136  245:getfield        #205 <Field char[] sc>
	//* 137  248:iload           9
	//* 138  250:caload          
	//* 139  251:ifne            341
					{
						byte abyte1[] = getValues(((int) (eq[j1])));
	//  140  254:aload_0         
	//  141  255:aload_0         
	//  142  256:getfield        #222 <Field char[] eq>
	//  143  259:iload           9
	//  144  261:caload          
	//  145  262:invokevirtual   #224 <Method byte[] getValues(int)>
	//  146  265:astore          14
						int k1 = i;
	//  147  267:iload_2         
	//  148  268:istore          10
						int i2 = abyte1.length;
	//  149  270:aload           14
	//  150  272:arraylength     
	//  151  273:istore          13
						j1 = 0;
	//  152  275:iconst_0        
	//  153  276:istore          9
						do
						{
							i1 = l1;
	//  154  278:iload           11
	//  155  280:istore          8
							j = l;
	//  156  282:iload           7
	//  157  284:istore          5
							k = ((int) (c));
	//  158  286:iload           12
	//  159  288:istore          6
							if(j1 >= i2)
								continue label0;
	//  160  290:iload           9
	//  161  292:iload           13
	//  162  294:icmpge          15
							byte byte1 = abyte1[j1];
	//  163  297:aload           14
	//  164  299:iload           9
	//  165  301:baload          
	//  166  302:istore          4
							if(k1 < abyte0.length && byte1 > abyte0[k1])
	//* 167  304:iload           10
	//* 168  306:aload_3         
	//* 169  307:arraylength     
	//* 170  308:icmpge          326
	//* 171  311:iload           4
	//* 172  313:aload_3         
	//* 173  314:iload           10
	//* 174  316:baload          
	//* 175  317:icmple          326
								abyte0[k1] = byte1;
	//  176  320:aload_3         
	//  177  321:iload           10
	//  178  323:iload           4
	//  179  325:bastore         
							k1++;
	//  180  326:iload           10
	//  181  328:iconst_1        
	//  182  329:iadd            
	//  183  330:istore          10
							j1++;
	//  184  332:iload           9
	//  185  334:iconst_1        
	//  186  335:iadd            
	//  187  336:istore          9
						} while(true);
	//  188  338:goto            278
					}
					j1 = ((int) (lo[j1]));
	//  189  341:aload_0         
	//  190  342:getfield        #217 <Field char[] lo>
	//  191  345:iload           9
	//  192  347:caload          
	//  193  348:istore          9
				} while(true);
	//  194  350:goto            181
			}
			if(l < 0)
	//* 195  353:iload           7
	//* 196  355:ifge            370
				j = ((int) (lo[j]));
	//  197  358:aload_0         
	//  198  359:getfield        #217 <Field char[] lo>
	//  199  362:iload           5
	//  200  364:caload          
	//  201  365:istore          5
			else
	//* 202  367:goto            15
				j = ((int) (hi[j]));
	//  203  370:aload_0         
	//  204  371:getfield        #227 <Field char[] hi>
	//  205  374:iload           5
	//  206  376:caload          
	//  207  377:istore          5
		} while(true);
	//  208  379:goto            367
	}

	protected String unpackValues(int i)
	{
		StringBuffer stringbuffer = new StringBuffer();
	//    0    0:new             #92  <Class StringBuffer>
	//    1    3:dup             
	//    2    4:invokespecial   #93  <Method void StringBuffer()>
	//    3    7:astore          4
		ByteVector bytevector = vspace;
	//    4    9:aload_0         
	//    5   10:getfield        #36  <Field ByteVector vspace>
	//    6   13:astore          5
		int j = i + 1;
	//    7   15:iload_1         
	//    8   16:iconst_1        
	//    9   17:iadd            
	//   10   18:istore_3        
		char c = ((char) (bytevector.get(i)));
	//   11   19:aload           5
	//   12   21:iload_1         
	//   13   22:invokevirtual   #97  <Method byte ByteVector.get(int)>
	//   14   25:istore_2        
		i = j;
	//   15   26:iload_3         
	//   16   27:istore_1        
		do
		{
label0:
			{
				if(c != 0)
	//*  17   28:iload_2         
	//*  18   29:ifeq            57
				{
					stringbuffer.append((char)(((c >>> 4) - 1) + 48));
	//   19   32:aload           4
	//   20   34:iload_2         
	//   21   35:iconst_4        
	//   22   36:iushr           
	//   23   37:iconst_1        
	//   24   38:isub            
	//   25   39:bipush          48
	//   26   41:iadd            
	//   27   42:int2char        
	//   28   43:invokevirtual   #101 <Method StringBuffer StringBuffer.append(char)>
	//   29   46:pop             
					c &= '\017';
	//   30   47:iload_2         
	//   31   48:bipush          15
	//   32   50:iand            
	//   33   51:int2char        
	//   34   52:istore_2        
					if(c != 0)
						break label0;
	//   35   53:iload_2         
	//   36   54:ifne            63
				}
				return stringbuffer.toString();
	//   37   57:aload           4
	//   38   59:invokevirtual   #228 <Method String StringBuffer.toString()>
	//   39   62:areturn         
			}
			stringbuffer.append((char)((c - 1) + 48));
	//   40   63:aload           4
	//   41   65:iload_2         
	//   42   66:iconst_1        
	//   43   67:isub            
	//   44   68:bipush          48
	//   45   70:iadd            
	//   46   71:int2char        
	//   47   72:invokevirtual   #101 <Method StringBuffer StringBuffer.append(char)>
	//   48   75:pop             
			c = ((char) (vspace.get(i)));
	//   49   76:aload_0         
	//   50   77:getfield        #36  <Field ByteVector vspace>
	//   51   80:iload_1         
	//   52   81:invokevirtual   #97  <Method byte ByteVector.get(int)>
	//   53   84:istore_2        
			i++;
	//   54   85:iload_1         
	//   55   86:iconst_1        
	//   56   87:iadd            
	//   57   88:istore_1        
		} while(true);
	//   58   89:goto            28
	}

	private static final long serialVersionUID = 0x9cea8548L;
	protected TernaryTree classmap;
	private transient TernaryTree ivalues;
	protected HashMap stoplist;
	protected ByteVector vspace;
}
