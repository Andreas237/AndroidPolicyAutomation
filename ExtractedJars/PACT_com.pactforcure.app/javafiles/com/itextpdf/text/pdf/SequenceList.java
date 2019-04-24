// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;

import java.util.*;

public class SequenceList
{

	protected SequenceList(String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #45  <Method void Object()>
		ptr = 0;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #47  <Field int ptr>
		text = s.toCharArray();
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:invokevirtual   #53  <Method char[] String.toCharArray()>
	//    8   14:putfield        #55  <Field char[] text>
	//    9   17:return          
	}

	public static List expand(String s, int i)
	{
		LinkedList linkedlist;
		s = ((String) (new SequenceList(s)));
	//    0    0:new             #2   <Class SequenceList>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #60  <Method void SequenceList(String)>
	//    4    8:astore_0        
		linkedlist = new LinkedList();
	//    5    9:new             #62  <Class LinkedList>
	//    6   12:dup             
	//    7   13:invokespecial   #63  <Method void LinkedList()>
	//    8   16:astore          7
		boolean flag = false;
	//    9   18:iconst_0        
	//   10   19:istore          5
label0:
		do
		{
			boolean flag1;
			do
			{
				if(flag)
					break MISSING_BLOCK_LABEL_467;
	//   11   21:iload           5
	//   12   23:ifne            467
				flag1 = ((SequenceList) (s)).getAttributes();
	//   13   26:aload_0         
	//   14   27:invokevirtual   #67  <Method boolean getAttributes()>
	//   15   30:istore          6
				if(((SequenceList) (s)).low != -1 || ((SequenceList) (s)).high != -1 || ((SequenceList) (s)).even)
					break;
	//   16   32:aload_0         
	//   17   33:getfield        #69  <Field int low>
	//   18   36:iconst_m1       
	//   19   37:icmpne          66
	//   20   40:aload_0         
	//   21   41:getfield        #71  <Field int high>
	//   22   44:iconst_m1       
	//   23   45:icmpne          66
	//   24   48:aload_0         
	//   25   49:getfield        #73  <Field boolean even>
	//   26   52:ifne            66
				flag = flag1;
	//   27   55:iload           6
	//   28   57:istore          5
			} while(!((SequenceList) (s)).odd);
	//   29   59:aload_0         
	//   30   60:getfield        #75  <Field boolean odd>
	//   31   63:ifeq            21
			if(((SequenceList) (s)).low < 1)
	//*  32   66:aload_0         
	//*  33   67:getfield        #69  <Field int low>
	//*  34   70:iconst_1        
	//*  35   71:icmpge          79
				s.low = 1;
	//   36   74:aload_0         
	//   37   75:iconst_1        
	//   38   76:putfield        #69  <Field int low>
			if(((SequenceList) (s)).high < 1 || ((SequenceList) (s)).high > i)
	//*  39   79:aload_0         
	//*  40   80:getfield        #71  <Field int high>
	//*  41   83:iconst_1        
	//*  42   84:icmplt          95
	//*  43   87:aload_0         
	//*  44   88:getfield        #71  <Field int high>
	//*  45   91:iload_1         
	//*  46   92:icmple          100
				s.high = i;
	//   47   95:aload_0         
	//   48   96:iload_1         
	//   49   97:putfield        #71  <Field int high>
			if(((SequenceList) (s)).low > i)
	//*  50  100:aload_0         
	//*  51  101:getfield        #69  <Field int low>
	//*  52  104:iload_1         
	//*  53  105:icmple          113
				s.low = i;
	//   54  108:aload_0         
	//   55  109:iload_1         
	//   56  110:putfield        #69  <Field int low>
			int j = 1;
	//   57  113:iconst_1        
	//   58  114:istore_2        
			if(((SequenceList) (s)).inverse)
	//*  59  115:aload_0         
	//*  60  116:getfield        #77  <Field boolean inverse>
	//*  61  119:ifeq            239
			{
				if(((SequenceList) (s)).low > ((SequenceList) (s)).high)
	//*  62  122:aload_0         
	//*  63  123:getfield        #69  <Field int low>
	//*  64  126:aload_0         
	//*  65  127:getfield        #71  <Field int high>
	//*  66  130:icmple          151
				{
					j = ((SequenceList) (s)).low;
	//   67  133:aload_0         
	//   68  134:getfield        #69  <Field int low>
	//   69  137:istore_2        
					s.low = ((SequenceList) (s)).high;
	//   70  138:aload_0         
	//   71  139:aload_0         
	//   72  140:getfield        #71  <Field int high>
	//   73  143:putfield        #69  <Field int low>
					s.high = j;
	//   74  146:aload_0         
	//   75  147:iload_2         
	//   76  148:putfield        #71  <Field int high>
				}
				ListIterator listiterator = linkedlist.listIterator();
	//   77  151:aload           7
	//   78  153:invokevirtual   #81  <Method ListIterator LinkedList.listIterator()>
	//   79  156:astore          8
				do
				{
					flag = flag1;
	//   80  158:iload           6
	//   81  160:istore          5
					if(!listiterator.hasNext())
						continue label0;
	//   82  162:aload           8
	//   83  164:invokeinterface #86  <Method boolean ListIterator.hasNext()>
	//   84  169:ifeq            21
					j = ((Integer)listiterator.next()).intValue();
	//   85  172:aload           8
	//   86  174:invokeinterface #90  <Method Object ListIterator.next()>
	//   87  179:checkcast       #92  <Class Integer>
	//   88  182:invokevirtual   #96  <Method int Integer.intValue()>
	//   89  185:istore_2        
					if((!((SequenceList) (s)).even || (j & 1) != 1) && (!((SequenceList) (s)).odd || (j & 1) != 0) && j >= ((SequenceList) (s)).low && j <= ((SequenceList) (s)).high)
	//*  90  186:aload_0         
	//*  91  187:getfield        #73  <Field boolean even>
	//*  92  190:ifeq            200
	//*  93  193:iload_2         
	//*  94  194:iconst_1        
	//*  95  195:iand            
	//*  96  196:iconst_1        
	//*  97  197:icmpeq          158
	//*  98  200:aload_0         
	//*  99  201:getfield        #75  <Field boolean odd>
	//* 100  204:ifeq            213
	//* 101  207:iload_2         
	//* 102  208:iconst_1        
	//* 103  209:iand            
	//* 104  210:ifeq            158
	//* 105  213:iload_2         
	//* 106  214:aload_0         
	//* 107  215:getfield        #69  <Field int low>
	//* 108  218:icmplt          158
	//* 109  221:iload_2         
	//* 110  222:aload_0         
	//* 111  223:getfield        #71  <Field int high>
	//* 112  226:icmpgt          158
						listiterator.remove();
	//  113  229:aload           8
	//  114  231:invokeinterface #99  <Method void ListIterator.remove()>
				} while(true);
	//  115  236:goto            158
			}
			if(((SequenceList) (s)).low > ((SequenceList) (s)).high)
	//* 116  239:aload_0         
	//* 117  240:getfield        #69  <Field int low>
	//* 118  243:aload_0         
	//* 119  244:getfield        #71  <Field int high>
	//* 120  247:icmple          360
			{
				j = -1;
	//  121  250:iconst_m1       
	//  122  251:istore_2        
				if(((SequenceList) (s)).odd || ((SequenceList) (s)).even)
	//* 123  252:aload_0         
	//* 124  253:getfield        #75  <Field boolean odd>
	//* 125  256:ifne            266
	//* 126  259:aload_0         
	//* 127  260:getfield        #73  <Field boolean even>
	//* 128  263:ifeq            290
				{
					int k = -1 - 1;
	//  129  266:iconst_m1       
	//  130  267:iconst_1        
	//  131  268:isub            
	//  132  269:istore_3        
					if(((SequenceList) (s)).even)
	//* 133  270:aload_0         
	//* 134  271:getfield        #73  <Field boolean even>
	//* 135  274:ifeq            324
					{
						s.low = ((SequenceList) (s)).low & -2;
	//  136  277:aload_0         
	//  137  278:aload_0         
	//  138  279:getfield        #69  <Field int low>
	//  139  282:bipush          -2
	//  140  284:iand            
	//  141  285:putfield        #69  <Field int low>
						j = k;
	//  142  288:iload_3         
	//  143  289:istore_2        
					} else
	//* 144  290:aload_0         
	//* 145  291:getfield        #69  <Field int low>
	//* 146  294:istore_3        
	//* 147  295:iload           6
	//* 148  297:istore          5
	//* 149  299:iload_3         
	//* 150  300:aload_0         
	//* 151  301:getfield        #71  <Field int high>
	//* 152  304:icmplt          21
	//* 153  307:aload           7
	//* 154  309:iload_3         
	//* 155  310:invokestatic    #103 <Method Integer Integer.valueOf(int)>
	//* 156  313:invokevirtual   #107 <Method boolean LinkedList.add(Object)>
	//* 157  316:pop             
	//* 158  317:iload_3         
	//* 159  318:iload_2         
	//* 160  319:iadd            
	//* 161  320:istore_3        
	//* 162  321:goto            295
					{
						int i1 = ((SequenceList) (s)).low;
	//  163  324:aload_0         
	//  164  325:getfield        #69  <Field int low>
	//  165  328:istore          4
						if((((SequenceList) (s)).low & 1) == 1)
	//* 166  330:aload_0         
	//* 167  331:getfield        #69  <Field int low>
	//* 168  334:iconst_1        
	//* 169  335:iand            
	//* 170  336:iconst_1        
	//* 171  337:icmpne          355
							j = 0;
	//  172  340:iconst_0        
	//  173  341:istore_2        
						else
	//* 174  342:aload_0         
	//* 175  343:iload           4
	//* 176  345:iload_2         
	//* 177  346:isub            
	//* 178  347:putfield        #69  <Field int low>
	//* 179  350:iload_3         
	//* 180  351:istore_2        
	//* 181  352:goto            290
							j = 1;
	//  182  355:iconst_1        
	//  183  356:istore_2        
						s.low = i1 - j;
						j = k;
					}
				}
				k = ((SequenceList) (s)).low;
				do
				{
					flag = flag1;
					if(k < ((SequenceList) (s)).high)
						continue label0;
					linkedlist.add(((Object) (Integer.valueOf(k))));
					k += j;
				} while(true);
			}
	//* 184  357:goto            342
			if(((SequenceList) (s)).odd || ((SequenceList) (s)).even)
	//* 185  360:aload_0         
	//* 186  361:getfield        #75  <Field boolean odd>
	//* 187  364:ifne            374
	//* 188  367:aload_0         
	//* 189  368:getfield        #73  <Field boolean even>
	//* 190  371:ifeq            397
			{
				int l = 1 + 1;
	//  191  374:iconst_1        
	//  192  375:iconst_1        
	//  193  376:iadd            
	//  194  377:istore_3        
				if(((SequenceList) (s)).odd)
	//* 195  378:aload_0         
	//* 196  379:getfield        #75  <Field boolean odd>
	//* 197  382:ifeq            431
				{
					s.low = ((SequenceList) (s)).low | 1;
	//  198  385:aload_0         
	//  199  386:aload_0         
	//  200  387:getfield        #69  <Field int low>
	//  201  390:iconst_1        
	//  202  391:ior             
	//  203  392:putfield        #69  <Field int low>
					j = l;
	//  204  395:iload_3         
	//  205  396:istore_2        
				} else
	//* 206  397:aload_0         
	//* 207  398:getfield        #69  <Field int low>
	//* 208  401:istore_3        
	//* 209  402:iload           6
	//* 210  404:istore          5
	//* 211  406:iload_3         
	//* 212  407:aload_0         
	//* 213  408:getfield        #71  <Field int high>
	//* 214  411:icmpgt          21
	//* 215  414:aload           7
	//* 216  416:iload_3         
	//* 217  417:invokestatic    #103 <Method Integer Integer.valueOf(int)>
	//* 218  420:invokevirtual   #107 <Method boolean LinkedList.add(Object)>
	//* 219  423:pop             
	//* 220  424:iload_3         
	//* 221  425:iload_2         
	//* 222  426:iadd            
	//* 223  427:istore_3        
	//* 224  428:goto            402
				{
					int j1 = ((SequenceList) (s)).low;
	//  225  431:aload_0         
	//  226  432:getfield        #69  <Field int low>
	//  227  435:istore          4
					if((((SequenceList) (s)).low & 1) == 1)
	//* 228  437:aload_0         
	//* 229  438:getfield        #69  <Field int low>
	//* 230  441:iconst_1        
	//* 231  442:iand            
	//* 232  443:iconst_1        
	//* 233  444:icmpne          462
						j = 1;
	//  234  447:iconst_1        
	//  235  448:istore_2        
					else
	//* 236  449:aload_0         
	//* 237  450:iload_2         
	//* 238  451:iload           4
	//* 239  453:iadd            
	//* 240  454:putfield        #69  <Field int low>
	//* 241  457:iload_3         
	//* 242  458:istore_2        
	//* 243  459:goto            397
						j = 0;
	//  244  462:iconst_0        
	//  245  463:istore_2        
					s.low = j + j1;
					j = l;
				}
			}
			l = ((SequenceList) (s)).low;
			do
			{
				flag = flag1;
				if(l > ((SequenceList) (s)).high)
					break;
				linkedlist.add(((Object) (Integer.valueOf(l))));
				l += j;
			} while(true);
		} while(true);
	//  246  464:goto            449
		return ((List) (linkedlist));
	//  247  467:aload           7
	//  248  469:areturn         
	}

	private void otherProc()
	{
		if(other.equals("odd") || other.equals("o"))
	//*   0    0:aload_0         
	//*   1    1:getfield        #112 <Field String other>
	//*   2    4:ldc1            #113 <String "odd">
	//*   3    6:invokevirtual   #116 <Method boolean String.equals(Object)>
	//*   4    9:ifne            24
	//*   5   12:aload_0         
	//*   6   13:getfield        #112 <Field String other>
	//*   7   16:ldc1            #118 <String "o">
	//*   8   18:invokevirtual   #116 <Method boolean String.equals(Object)>
	//*   9   21:ifeq            35
		{
			odd = true;
	//   10   24:aload_0         
	//   11   25:iconst_1        
	//   12   26:putfield        #75  <Field boolean odd>
			even = false;
	//   13   29:aload_0         
	//   14   30:iconst_0        
	//   15   31:putfield        #73  <Field boolean even>
		} else
	//*  16   34:return          
		if(other.equals("even") || other.equals("e"))
	//*  17   35:aload_0         
	//*  18   36:getfield        #112 <Field String other>
	//*  19   39:ldc1            #119 <String "even">
	//*  20   41:invokevirtual   #116 <Method boolean String.equals(Object)>
	//*  21   44:ifne            59
	//*  22   47:aload_0         
	//*  23   48:getfield        #112 <Field String other>
	//*  24   51:ldc1            #121 <String "e">
	//*  25   53:invokevirtual   #116 <Method boolean String.equals(Object)>
	//*  26   56:ifeq            34
		{
			odd = false;
	//   27   59:aload_0         
	//   28   60:iconst_0        
	//   29   61:putfield        #75  <Field boolean odd>
			even = true;
	//   30   64:aload_0         
	//   31   65:iconst_1        
	//   32   66:putfield        #73  <Field boolean even>
			return;
	//   33   69:return          
		}
	}

	protected boolean getAttributes()
	{
		low = -1;
	//    0    0:aload_0         
	//    1    1:iconst_m1       
	//    2    2:putfield        #69  <Field int low>
		high = -1;
	//    3    5:aload_0         
	//    4    6:iconst_m1       
	//    5    7:putfield        #71  <Field int high>
		inverse = false;
	//    6   10:aload_0         
	//    7   11:iconst_0        
	//    8   12:putfield        #77  <Field boolean inverse>
		even = false;
	//    9   15:aload_0         
	//   10   16:iconst_0        
	//   11   17:putfield        #73  <Field boolean even>
		odd = false;
	//   12   20:aload_0         
	//   13   21:iconst_0        
	//   14   22:putfield        #75  <Field boolean odd>
		byte byte0 = 2;
	//   15   25:iconst_2        
	//   16   26:istore_1        
		do
		{
			int i = getType();
	//   17   27:aload_0         
	//   18   28:invokevirtual   #124 <Method int getType()>
	//   19   31:istore_2        
			if(i == 6 || i == 1)
	//*  20   32:iload_2         
	//*  21   33:bipush          6
	//*  22   35:icmpeq          43
	//*  23   38:iload_2         
	//*  24   39:iconst_1        
	//*  25   40:icmpne          66
			{
				if(byte0 == 1)
	//*  26   43:iload_1         
	//*  27   44:iconst_1        
	//*  28   45:icmpne          56
					high = low;
	//   29   48:aload_0         
	//   30   49:aload_0         
	//   31   50:getfield        #69  <Field int low>
	//   32   53:putfield        #71  <Field int high>
				return i == 6;
	//   33   56:iload_2         
	//   34   57:bipush          6
	//   35   59:icmpne          64
	//   36   62:iconst_1        
	//   37   63:ireturn         
	//   38   64:iconst_0        
	//   39   65:ireturn         
			}
			switch(byte0)
	//*  40   66:iload_1         
			{
	//*  41   67:tableswitch     1 3: default 92
	//	               1 95
	//	               2 137
	//	               3 221
	//*  42   92:goto            27
			case 1: // '\001'
				switch(i)
	//*  43   95:iload_2         
				{
	//*  44   96:tableswitch     2 3: default 120
	//	               2 216
	//	               3 198
				default:
					high = low;
	//   45  120:aload_0         
	//   46  121:aload_0         
	//   47  122:getfield        #69  <Field int low>
	//   48  125:putfield        #71  <Field int high>
					byte0 = 2;
	//   49  128:iconst_2        
	//   50  129:istore_1        
					otherProc();
	//   51  130:aload_0         
	//   52  131:invokespecial   #126 <Method void otherProc()>
					break;

	//*  53  134:goto            27
	//*  54  137:iload_2         
	//*  55  138:tableswitch     2 3: default 160
	//	               2 186
	//	               3 178
	//*  56  160:iload_2         
	//*  57  161:iconst_5        
	//*  58  162:icmpne          191
	//*  59  165:aload_0         
	//*  60  166:aload_0         
	//*  61  167:getfield        #128 <Field int number>
	//*  62  170:putfield        #69  <Field int low>
	//*  63  173:iconst_1        
	//*  64  174:istore_1        
	//*  65  175:goto            27
	//*  66  178:aload_0         
	//*  67  179:iconst_1        
	//*  68  180:putfield        #77  <Field boolean inverse>
	//*  69  183:goto            27
	//*  70  186:iconst_3        
	//*  71  187:istore_1        
	//*  72  188:goto            27
	//*  73  191:aload_0         
	//*  74  192:invokespecial   #126 <Method void otherProc()>
	//*  75  195:goto            27
				case 3: // '\003'
					inverse = true;
	//   76  198:aload_0         
	//   77  199:iconst_1        
	//   78  200:putfield        #77  <Field boolean inverse>
					byte0 = 2;
	//   79  203:iconst_2        
	//   80  204:istore_1        
					high = low;
	//   81  205:aload_0         
	//   82  206:aload_0         
	//   83  207:getfield        #69  <Field int low>
	//   84  210:putfield        #71  <Field int high>
					break;

	//*  85  213:goto            27
				case 2: // '\002'
					byte0 = 3;
	//   86  216:iconst_3        
	//   87  217:istore_1        
					break;
				}
				break;

			case 2: // '\002'
				switch(i)
				{
				default:
					if(i == 5)
					{
						low = number;
						byte0 = 1;
					} else
					{
						otherProc();
					}
					break;

				case 3: // '\003'
					inverse = true;
					break;

				case 2: // '\002'
					byte0 = 3;
					break;
				}
	//   88  218:goto            27
				break;

			case 3: // '\003'
				switch(i)
	//*  89  221:iload_2         
				{
	//*  90  222:tableswitch     2 5: default 252
	//	               2 27
	//	               3 261
	//	               4 252
	//	               5 271
				case 4: // '\004'
				default:
					byte0 = 2;
	//   91  252:iconst_2        
	//   92  253:istore_1        
					otherProc();
	//   93  254:aload_0         
	//   94  255:invokespecial   #126 <Method void otherProc()>
					break;

	//*  95  258:goto            27
				case 3: // '\003'
					inverse = true;
	//   96  261:aload_0         
	//   97  262:iconst_1        
	//   98  263:putfield        #77  <Field boolean inverse>
					byte0 = 2;
	//   99  266:iconst_2        
	//  100  267:istore_1        
					break;

	//* 101  268:goto            27
				case 5: // '\005'
					high = number;
	//  102  271:aload_0         
	//  103  272:aload_0         
	//  104  273:getfield        #128 <Field int number>
	//  105  276:putfield        #71  <Field int high>
					byte0 = 2;
	//  106  279:iconst_2        
	//  107  280:istore_1        
					break;

				case 2: // '\002'
					break;
				}
				break;
			}
		} while(true);
	//* 108  281:goto            27
	}

	protected int getType()
	{
		Object obj = ((Object) (new StringBuffer()));
	//    0    0:new             #130 <Class StringBuffer>
	//    1    3:dup             
	//    2    4:invokespecial   #131 <Method void StringBuffer()>
	//    3    7:astore_3        
		int i = 0;
	//    4    8:iconst_0        
	//    5    9:istore_2        
		do
		{
			char c = nextChar();
	//    6   10:aload_0         
	//    7   11:invokevirtual   #135 <Method char nextChar()>
	//    8   14:istore_1        
			if(c == '\uFFFF')
	//*   9   15:iload_1         
	//*  10   16:ldc1            #15  <Int 65535>
	//*  11   18:icmpne          67
			{
				if(i == 1)
	//*  12   21:iload_2         
	//*  13   22:iconst_1        
	//*  14   23:icmpne          46
				{
					obj = ((Object) (((StringBuffer) (obj)).toString()));
	//   15   26:aload_3         
	//   16   27:invokevirtual   #139 <Method String StringBuffer.toString()>
	//   17   30:astore_3        
					other = ((String) (obj));
	//   18   31:aload_0         
	//   19   32:aload_3         
	//   20   33:putfield        #112 <Field String other>
					number = Integer.parseInt(((String) (obj)));
	//   21   36:aload_0         
	//   22   37:aload_3         
	//   23   38:invokestatic    #143 <Method int Integer.parseInt(String)>
	//   24   41:putfield        #128 <Field int number>
					return 5;
	//   25   44:iconst_5        
	//   26   45:ireturn         
				}
				if(i == 2)
	//*  27   46:iload_2         
	//*  28   47:iconst_2        
	//*  29   48:icmpne          64
				{
					other = ((StringBuffer) (obj)).toString().toLowerCase();
	//   30   51:aload_0         
	//   31   52:aload_3         
	//   32   53:invokevirtual   #139 <Method String StringBuffer.toString()>
	//   33   56:invokevirtual   #146 <Method String String.toLowerCase()>
	//   34   59:putfield        #112 <Field String other>
					return 4;
	//   35   62:iconst_4        
	//   36   63:ireturn         
				} else
				{
					return 6;
	//   37   64:bipush          6
	//   38   66:ireturn         
				}
			}
			switch(i)
	//*  39   67:iload_2         
			{
	//*  40   68:tableswitch     0 2: default 96
	//	               0 99
	//	               1 170
	//	               2 215
	//*  41   96:goto            10
			case 0: // '\0'
				switch(c)
	//*  42   99:iload_1         
				{
	//*  43  100:lookupswitch    3: default 136
	//	               33: 159
	//	               44: 163
	//	               45: 161
				default:
					((StringBuffer) (obj)).append(c);
	//   44  136:aload_3         
	//   45  137:iload_1         
	//   46  138:invokevirtual   #150 <Method StringBuffer StringBuffer.append(char)>
	//   47  141:pop             
					if(c >= '0' && c <= '9')
	//*  48  142:iload_1         
	//*  49  143:bipush          48
	//*  50  145:icmplt          165
	//*  51  148:iload_1         
	//*  52  149:bipush          57
	//*  53  151:icmpgt          165
						i = 1;
	//   54  154:iconst_1        
	//   55  155:istore_2        
					else
	//*  56  156:goto            10
	//*  57  159:iconst_3        
	//*  58  160:ireturn         
	//*  59  161:iconst_2        
	//*  60  162:ireturn         
	//*  61  163:iconst_1        
	//*  62  164:ireturn         
						i = 2;
	//   63  165:iconst_2        
	//   64  166:istore_2        
					break;

				case 33: // '!'
					return 3;

				case 45: // '-'
					return 2;

				case 44: // ','
					return 1;
				}
				break;

	//*  65  167:goto            10
			case 1: // '\001'
				if(c >= '0' && c <= '9')
	//*  66  170:iload_1         
	//*  67  171:bipush          48
	//*  68  173:icmplt          191
	//*  69  176:iload_1         
	//*  70  177:bipush          57
	//*  71  179:icmpgt          191
				{
					((StringBuffer) (obj)).append(c);
	//   72  182:aload_3         
	//   73  183:iload_1         
	//   74  184:invokevirtual   #150 <Method StringBuffer StringBuffer.append(char)>
	//   75  187:pop             
				} else
	//*  76  188:goto            10
				{
					putBack();
	//   77  191:aload_0         
	//   78  192:invokevirtual   #153 <Method void putBack()>
					obj = ((Object) (((StringBuffer) (obj)).toString()));
	//   79  195:aload_3         
	//   80  196:invokevirtual   #139 <Method String StringBuffer.toString()>
	//   81  199:astore_3        
					other = ((String) (obj));
	//   82  200:aload_0         
	//   83  201:aload_3         
	//   84  202:putfield        #112 <Field String other>
					number = Integer.parseInt(((String) (obj)));
	//   85  205:aload_0         
	//   86  206:aload_3         
	//   87  207:invokestatic    #143 <Method int Integer.parseInt(String)>
	//   88  210:putfield        #128 <Field int number>
					return 5;
	//   89  213:iconst_5        
	//   90  214:ireturn         
				}
				break;

			case 2: // '\002'
				if("-,!0123456789".indexOf(((int) (c))) < 0)
	//*  91  215:ldc1            #24  <String "-,!0123456789">
	//*  92  217:iload_1         
	//*  93  218:invokevirtual   #157 <Method int String.indexOf(int)>
	//*  94  221:ifge            233
				{
					((StringBuffer) (obj)).append(c);
	//   95  224:aload_3         
	//   96  225:iload_1         
	//   97  226:invokevirtual   #150 <Method StringBuffer StringBuffer.append(char)>
	//   98  229:pop             
				} else
	//*  99  230:goto            10
				{
					putBack();
	//  100  233:aload_0         
	//  101  234:invokevirtual   #153 <Method void putBack()>
					other = ((StringBuffer) (obj)).toString().toLowerCase();
	//  102  237:aload_0         
	//  103  238:aload_3         
	//  104  239:invokevirtual   #139 <Method String StringBuffer.toString()>
	//  105  242:invokevirtual   #146 <Method String String.toLowerCase()>
	//  106  245:putfield        #112 <Field String other>
					return 4;
	//  107  248:iconst_4        
	//  108  249:ireturn         
				}
				break;
			}
		} while(true);
	}

	protected char nextChar()
	{
		char c;
		do
		{
			if(ptr >= text.length)
	//*   0    0:aload_0         
	//*   1    1:getfield        #47  <Field int ptr>
	//*   2    4:aload_0         
	//*   3    5:getfield        #55  <Field char[] text>
	//*   4    8:arraylength     
	//*   5    9:icmplt          15
				return '\uFFFF';
	//    6   12:ldc1            #15  <Int 65535>
	//    7   14:ireturn         
			char ac[] = text;
	//    8   15:aload_0         
	//    9   16:getfield        #55  <Field char[] text>
	//   10   19:astore_3        
			int i = ptr;
	//   11   20:aload_0         
	//   12   21:getfield        #47  <Field int ptr>
	//   13   24:istore_2        
			ptr = i + 1;
	//   14   25:aload_0         
	//   15   26:iload_2         
	//   16   27:iconst_1        
	//   17   28:iadd            
	//   18   29:putfield        #47  <Field int ptr>
			c = ac[i];
	//   19   32:aload_3         
	//   20   33:iload_2         
	//   21   34:caload          
	//   22   35:istore_1        
		} while(c <= ' ');
	//   23   36:iload_1         
	//   24   37:bipush          32
	//   25   39:icmple          0
		return c;
	//   26   42:iload_1         
	//   27   43:ireturn         
	}

	protected void putBack()
	{
		ptr = ptr - 1;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #47  <Field int ptr>
	//    3    5:iconst_1        
	//    4    6:isub            
	//    5    7:putfield        #47  <Field int ptr>
		if(ptr < 0)
	//*   6   10:aload_0         
	//*   7   11:getfield        #47  <Field int ptr>
	//*   8   14:ifge            22
			ptr = 0;
	//    9   17:aload_0         
	//   10   18:iconst_0        
	//   11   19:putfield        #47  <Field int ptr>
	//   12   22:return          
	}

	protected static final int COMMA = 1;
	private static final int DIGIT = 1;
	private static final int DIGIT2 = 3;
	protected static final int END = 6;
	protected static final char EOT = 65535;
	private static final int FIRST = 0;
	protected static final int MINUS = 2;
	protected static final int NOT = 3;
	private static final String NOT_OTHER = "-,!0123456789";
	protected static final int NUMBER = 5;
	private static final int OTHER = 2;
	protected static final int TEXT = 4;
	protected boolean even;
	protected int high;
	protected boolean inverse;
	protected int low;
	protected int number;
	protected boolean odd;
	protected String other;
	protected int ptr;
	protected char text[];
}
