// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import com.github.mikephil.charting.data.Entry;
import java.util.*;

// Referenced classes of package o:
//			lu

public abstract class mb extends lu
{
	public static final class b extends Enum
	{

		public static b valueOf(String s1)
		{
			return (b)Enum.valueOf(o/mb$b, s1);
		//    0    0:ldc1            #2   <Class mb$b>
		//    1    2:aload_0         
		//    2    3:invokestatic    #41  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class mb$b>
		//    4    9:areturn         
		}

		public static b[] values()
		{
			return (b[])((b []) (a)).clone();
		//    0    0:getstatic       #33  <Field mb$b[] a>
		//    1    3:invokevirtual   #48  <Method Object _5B_Lo.mb$b_3B_.clone()>
		//    2    6:checkcast       #44  <Class mb$b[]>
		//    3    9:areturn         
		}

		private static final b a[];
		public static final b b;
		public static final b c;
		public static final b d;

		static 
		{
			c = new b("UP", 0);
		//    0    0:new             #2   <Class mb$b>
		//    1    3:dup             
		//    2    4:ldc1            #17  <String "UP">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #21  <Method void mb$b(String, int)>
		//    5   10:putstatic       #23  <Field mb$b c>
			b = new b("DOWN", 1);
		//    6   13:new             #2   <Class mb$b>
		//    7   16:dup             
		//    8   17:ldc1            #25  <String "DOWN">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #21  <Method void mb$b(String, int)>
		//   11   23:putstatic       #27  <Field mb$b b>
			d = new b("CLOSEST", 2);
		//   12   26:new             #2   <Class mb$b>
		//   13   29:dup             
		//   14   30:ldc1            #29  <String "CLOSEST">
		//   15   32:iconst_2        
		//   16   33:invokespecial   #21  <Method void mb$b(String, int)>
		//   17   36:putstatic       #31  <Field mb$b d>
			a = (new b[] {
				c, b, d
			});
		//   18   39:iconst_3        
		//   19   40:anewarray       b[]
		//   20   43:dup             
		//   21   44:iconst_0        
		//   22   45:getstatic       #23  <Field mb$b c>
		//   23   48:aastore         
		//   24   49:dup             
		//   25   50:iconst_1        
		//   26   51:getstatic       #27  <Field mb$b b>
		//   27   54:aastore         
		//   28   55:dup             
		//   29   56:iconst_2        
		//   30   57:getstatic       #31  <Field mb$b d>
		//   31   60:aastore         
		//   32   61:putstatic       #33  <Field mb$b[] a>
		//*  33   64:return          
		}

		private b(String s1, int i)
		{
			super(s1, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #35  <Method void Enum(String, int)>
		//    4    6:return          
		}
	}


	public mb(List list, String s1)
	{
		super(s1);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:invokespecial   #21  <Method void lu(String)>
		l = null;
	//    3    5:aload_0         
	//    4    6:aconst_null     
	//    5    7:putfield        #23  <Field List l>
		p = -3.402823E+38F;
	//    6   10:aload_0         
	//    7   11:ldc1            #24  <Float -3.402823E+38F>
	//    8   13:putfield        #26  <Field float p>
		m = 3.402823E+38F;
	//    9   16:aload_0         
	//   10   17:ldc1            #27  <Float 3.402823E+38F>
	//   11   19:putfield        #29  <Field float m>
		s = -3.402823E+38F;
	//   12   22:aload_0         
	//   13   23:ldc1            #24  <Float -3.402823E+38F>
	//   14   25:putfield        #31  <Field float s>
		r = 3.402823E+38F;
	//   15   28:aload_0         
	//   16   29:ldc1            #27  <Float 3.402823E+38F>
	//   17   31:putfield        #33  <Field float r>
		l = list;
	//   18   34:aload_0         
	//   19   35:aload_1         
	//   20   36:putfield        #23  <Field List l>
		if(l == null)
	//*  21   39:aload_0         
	//*  22   40:getfield        #23  <Field List l>
	//*  23   43:ifnonnull       57
			l = ((List) (new ArrayList()));
	//   24   46:aload_0         
	//   25   47:new             #35  <Class ArrayList>
	//   26   50:dup             
	//   27   51:invokespecial   #38  <Method void ArrayList()>
	//   28   54:putfield        #23  <Field List l>
		B();
	//   29   57:aload_0         
	//   30   58:invokevirtual   #41  <Method void B()>
	//   31   61:return          
	}

	public List A()
	{
		return l;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field List l>
	//    2    4:areturn         
	}

	public void B()
	{
		if(l == null || l.isEmpty())
	//*   0    0:aload_0         
	//*   1    1:getfield        #23  <Field List l>
	//*   2    4:ifnull          19
	//*   3    7:aload_0         
	//*   4    8:getfield        #23  <Field List l>
	//*   5   11:invokeinterface #53  <Method boolean List.isEmpty()>
	//*   6   16:ifeq            20
			return;
	//    7   19:return          
		p = -3.402823E+38F;
	//    8   20:aload_0         
	//    9   21:ldc1            #24  <Float -3.402823E+38F>
	//   10   23:putfield        #26  <Field float p>
		m = 3.402823E+38F;
	//   11   26:aload_0         
	//   12   27:ldc1            #27  <Float 3.402823E+38F>
	//   13   29:putfield        #29  <Field float m>
		s = -3.402823E+38F;
	//   14   32:aload_0         
	//   15   33:ldc1            #24  <Float -3.402823E+38F>
	//   16   35:putfield        #31  <Field float s>
		r = 3.402823E+38F;
	//   17   38:aload_0         
	//   18   39:ldc1            #27  <Float 3.402823E+38F>
	//   19   41:putfield        #33  <Field float r>
		for(Iterator iterator = l.iterator(); iterator.hasNext(); e((Entry)iterator.next()));
	//   20   44:aload_0         
	//   21   45:getfield        #23  <Field List l>
	//   22   48:invokeinterface #57  <Method Iterator List.iterator()>
	//   23   53:astore_1        
	//   24   54:aload_1         
	//   25   55:invokeinterface #62  <Method boolean Iterator.hasNext()>
	//   26   60:ifeq            79
	//   27   63:aload_0         
	//   28   64:aload_1         
	//   29   65:invokeinterface #66  <Method Object Iterator.next()>
	//   30   70:checkcast       #68  <Class Entry>
	//   31   73:invokevirtual   #72  <Method void e(Entry)>
	//*  32   76:goto            54
	//   33   79:return          
	}

	public int C()
	{
		return l.size();
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field List l>
	//    2    4:invokeinterface #77  <Method int List.size()>
	//    3    9:ireturn         
	}

	public float E()
	{
		return p;
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field float p>
	//    2    4:freturn         
	}

	public float F()
	{
		return m;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field float m>
	//    2    4:freturn         
	}

	public String G()
	{
		StringBuffer stringbuffer = new StringBuffer();
	//    0    0:new             #83  <Class StringBuffer>
	//    1    3:dup             
	//    2    4:invokespecial   #84  <Method void StringBuffer()>
	//    3    7:astore_2        
		StringBuilder stringbuilder = (new StringBuilder()).append("DataSet, label: ");
	//    4    8:new             #86  <Class StringBuilder>
	//    5   11:dup             
	//    6   12:invokespecial   #87  <Method void StringBuilder()>
	//    7   15:ldc1            #89  <String "DataSet, label: ">
	//    8   17:invokevirtual   #93  <Method StringBuilder StringBuilder.append(String)>
	//    9   20:astore_3        
		String s1;
		if(o() == null)
	//*  10   21:aload_0         
	//*  11   22:invokevirtual   #96  <Method String o()>
	//*  12   25:ifnonnull       34
			s1 = "";
	//   13   28:ldc1            #98  <String "">
	//   14   30:astore_1        
		else
	//*  15   31:goto            39
			s1 = o();
	//   16   34:aload_0         
	//   17   35:invokevirtual   #96  <Method String o()>
	//   18   38:astore_1        
		stringbuffer.append(stringbuilder.append(s1).append(", entries: ").append(l.size()).append("\n").toString());
	//   19   39:aload_2         
	//   20   40:aload_3         
	//   21   41:aload_1         
	//   22   42:invokevirtual   #93  <Method StringBuilder StringBuilder.append(String)>
	//   23   45:ldc1            #100 <String ", entries: ">
	//   24   47:invokevirtual   #93  <Method StringBuilder StringBuilder.append(String)>
	//   25   50:aload_0         
	//   26   51:getfield        #23  <Field List l>
	//   27   54:invokeinterface #77  <Method int List.size()>
	//   28   59:invokevirtual   #103 <Method StringBuilder StringBuilder.append(int)>
	//   29   62:ldc1            #105 <String "\n">
	//   30   64:invokevirtual   #93  <Method StringBuilder StringBuilder.append(String)>
	//   31   67:invokevirtual   #108 <Method String StringBuilder.toString()>
	//   32   70:invokevirtual   #111 <Method StringBuffer StringBuffer.append(String)>
	//   33   73:pop             
		return stringbuffer.toString();
	//   34   74:aload_2         
	//   35   75:invokevirtual   #112 <Method String StringBuffer.toString()>
	//   36   78:areturn         
	}

	public float H()
	{
		return s;
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field float s>
	//    2    4:freturn         
	}

	public float I()
	{
		return r;
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field float r>
	//    2    4:freturn         
	}

	public int b(float f1, float f2, b b1)
	{
		if(l == null || l.isEmpty())
	//*   0    0:aload_0         
	//*   1    1:getfield        #23  <Field List l>
	//*   2    4:ifnull          19
	//*   3    7:aload_0         
	//*   4    8:getfield        #23  <Field List l>
	//*   5   11:invokeinterface #53  <Method boolean List.isEmpty()>
	//*   6   16:ifeq            21
			return -1;
	//    7   19:iconst_m1       
	//    8   20:ireturn         
		int k1 = 0;
	//    9   21:iconst_0        
	//   10   22:istore          10
		int j1 = l.size() - 1;
	//   11   24:aload_0         
	//   12   25:getfield        #23  <Field List l>
	//   13   28:invokeinterface #77  <Method int List.size()>
	//   14   33:iconst_1        
	//   15   34:isub            
	//   16   35:istore          9
		int k;
		int l1;
		for(k = j1; k1 < j1; k = l1)
	//*  17   37:iload           9
	//*  18   39:istore          8
	//*  19   41:iload           10
	//*  20   43:iload           9
	//*  21   45:icmpge          219
		{
			l1 = (k1 + j1) / 2;
	//   22   48:iload           10
	//   23   50:iload           9
	//   24   52:iadd            
	//   25   53:iconst_2        
	//   26   54:idiv            
	//   27   55:istore          11
			float f3 = ((Entry)l.get(l1)).getX() - f1;
	//   28   57:aload_0         
	//   29   58:getfield        #23  <Field List l>
	//   30   61:iload           11
	//   31   63:invokeinterface #119 <Method Object List.get(int)>
	//   32   68:checkcast       #68  <Class Entry>
	//   33   71:invokevirtual   #122 <Method float Entry.getX()>
	//   34   74:fload_1         
	//   35   75:fsub            
	//   36   76:fstore          4
			float f7 = ((Entry)l.get(l1 + 1)).getX();
	//   37   78:aload_0         
	//   38   79:getfield        #23  <Field List l>
	//   39   82:iload           11
	//   40   84:iconst_1        
	//   41   85:iadd            
	//   42   86:invokeinterface #119 <Method Object List.get(int)>
	//   43   91:checkcast       #68  <Class Entry>
	//   44   94:invokevirtual   #122 <Method float Entry.getX()>
	//   45   97:fstore          6
			float f5 = Math.abs(f3);
	//   46   99:fload           4
	//   47  101:invokestatic    #128 <Method float Math.abs(float)>
	//   48  104:fstore          5
			f7 = Math.abs(f7 - f1);
	//   49  106:fload           6
	//   50  108:fload_1         
	//   51  109:fsub            
	//   52  110:invokestatic    #128 <Method float Math.abs(float)>
	//   53  113:fstore          6
			int i;
			if(f7 < f5)
	//*  54  115:fload           6
	//*  55  117:fload           5
	//*  56  119:fcmpg           
	//*  57  120:ifge            136
			{
				k = l1 + 1;
	//   58  123:iload           11
	//   59  125:iconst_1        
	//   60  126:iadd            
	//   61  127:istore          8
				i = j1;
	//   62  129:iload           9
	//   63  131:istore          7
			} else
	//*  64  133:goto            200
			if(f5 < f7)
	//*  65  136:fload           5
	//*  66  138:fload           6
	//*  67  140:fcmpg           
	//*  68  141:ifge            155
			{
				i = l1;
	//   69  144:iload           11
	//   70  146:istore          7
				k = k1;
	//   71  148:iload           10
	//   72  150:istore          8
			} else
	//*  73  152:goto            200
			if((double)f3 >= 0.0D)
	//*  74  155:fload           4
	//*  75  157:f2d             
	//*  76  158:dconst_0        
	//*  77  159:dcmpl           
	//*  78  160:iflt            174
			{
				i = l1;
	//   79  163:iload           11
	//   80  165:istore          7
				k = k1;
	//   81  167:iload           10
	//   82  169:istore          8
			} else
	//*  83  171:goto            200
			{
				k = k1;
	//   84  174:iload           10
	//   85  176:istore          8
				i = j1;
	//   86  178:iload           9
	//   87  180:istore          7
				if((double)f3 < 0.0D)
	//*  88  182:fload           4
	//*  89  184:f2d             
	//*  90  185:dconst_0        
	//*  91  186:dcmpg           
	//*  92  187:ifge            200
				{
					k = l1 + 1;
	//   93  190:iload           11
	//   94  192:iconst_1        
	//   95  193:iadd            
	//   96  194:istore          8
					i = j1;
	//   97  196:iload           9
	//   98  198:istore          7
				}
			}
			l1 = i;
	//   99  200:iload           7
	//  100  202:istore          11
			k1 = k;
	//  101  204:iload           8
	//  102  206:istore          10
			j1 = i;
	//  103  208:iload           7
	//  104  210:istore          9
		}

	//  105  212:iload           11
	//  106  214:istore          8
	//* 107  216:goto            41
		j1 = k;
	//  108  219:iload           8
	//  109  221:istore          9
		if(k != -1)
	//* 110  223:iload           8
	//* 111  225:iconst_m1       
	//* 112  226:icmpeq          494
		{
			float f6 = ((Entry)l.get(k)).getX();
	//  113  229:aload_0         
	//  114  230:getfield        #23  <Field List l>
	//  115  233:iload           8
	//  116  235:invokeinterface #119 <Method Object List.get(int)>
	//  117  240:checkcast       #68  <Class Entry>
	//  118  243:invokevirtual   #122 <Method float Entry.getX()>
	//  119  246:fstore          5
			int j;
			if(b1 == b.c)
	//* 120  248:aload_3         
	//* 121  249:getstatic       #132 <Field mb$b mb$b.c>
	//* 122  252:if_acmpne       295
			{
				j = k;
	//  123  255:iload           8
	//  124  257:istore          7
				if(f6 < f1)
	//* 125  259:fload           5
	//* 126  261:fload_1         
	//* 127  262:fcmpg           
	//* 128  263:ifge            332
				{
					j = k;
	//  129  266:iload           8
	//  130  268:istore          7
					if(k < l.size() - 1)
	//* 131  270:iload           8
	//* 132  272:aload_0         
	//* 133  273:getfield        #23  <Field List l>
	//* 134  276:invokeinterface #77  <Method int List.size()>
	//* 135  281:iconst_1        
	//* 136  282:isub            
	//* 137  283:icmpge          332
						j = k + 1;
	//  138  286:iload           8
	//  139  288:iconst_1        
	//  140  289:iadd            
	//  141  290:istore          7
				}
			} else
	//* 142  292:goto            332
			{
				j = k;
	//  143  295:iload           8
	//  144  297:istore          7
				if(b1 == b.b)
	//* 145  299:aload_3         
	//* 146  300:getstatic       #134 <Field mb$b mb$b.b>
	//* 147  303:if_acmpne       332
				{
					j = k;
	//  148  306:iload           8
	//  149  308:istore          7
					if(f6 > f1)
	//* 150  310:fload           5
	//* 151  312:fload_1         
	//* 152  313:fcmpl           
	//* 153  314:ifle            332
					{
						j = k;
	//  154  317:iload           8
	//  155  319:istore          7
						if(k > 0)
	//* 156  321:iload           8
	//* 157  323:ifle            332
							j = k - 1;
	//  158  326:iload           8
	//  159  328:iconst_1        
	//  160  329:isub            
	//  161  330:istore          7
					}
				}
			}
			j1 = j;
	//  162  332:iload           7
	//  163  334:istore          9
			if(!Float.isNaN(f2))
	//* 164  336:fload_2         
	//* 165  337:invokestatic    #140 <Method boolean Float.isNaN(float)>
	//* 166  340:ifne            494
			{
				for(; j > 0 && ((Entry)l.get(j - 1)).getX() == f6; j--);
	//  167  343:iload           7
	//  168  345:ifle            382
	//  169  348:aload_0         
	//  170  349:getfield        #23  <Field List l>
	//  171  352:iload           7
	//  172  354:iconst_1        
	//  173  355:isub            
	//  174  356:invokeinterface #119 <Method Object List.get(int)>
	//  175  361:checkcast       #68  <Class Entry>
	//  176  364:invokevirtual   #122 <Method float Entry.getX()>
	//  177  367:fload           5
	//  178  369:fcmpl           
	//  179  370:ifne            382
	//  180  373:iload           7
	//  181  375:iconst_1        
	//  182  376:isub            
	//  183  377:istore          7
	//* 184  379:goto            343
				f1 = ((Entry)l.get(j)).getY();
	//  185  382:aload_0         
	//  186  383:getfield        #23  <Field List l>
	//  187  386:iload           7
	//  188  388:invokeinterface #119 <Method Object List.get(int)>
	//  189  393:checkcast       #68  <Class Entry>
	//  190  396:invokevirtual   #143 <Method float Entry.getY()>
	//  191  399:fstore_1        
				int i1 = j;
	//  192  400:iload           7
	//  193  402:istore          8
				do
				{
					j++;
	//  194  404:iload           7
	//  195  406:iconst_1        
	//  196  407:iadd            
	//  197  408:istore          7
					if(j >= l.size())
	//* 198  410:iload           7
	//* 199  412:aload_0         
	//* 200  413:getfield        #23  <Field List l>
	//* 201  416:invokeinterface #77  <Method int List.size()>
	//* 202  421:icmplt          427
						break;
	//  203  424:goto            490
					b1 = ((b) ((Entry)l.get(j)));
	//  204  427:aload_0         
	//  205  428:getfield        #23  <Field List l>
	//  206  431:iload           7
	//  207  433:invokeinterface #119 <Method Object List.get(int)>
	//  208  438:checkcast       #68  <Class Entry>
	//  209  441:astore_3        
					if(((Entry) (b1)).getX() != f6)
	//* 210  442:aload_3         
	//* 211  443:invokevirtual   #122 <Method float Entry.getX()>
	//* 212  446:fload           5
	//* 213  448:fcmpl           
	//* 214  449:ifeq            455
						break;
	//  215  452:goto            490
					float f4 = f1;
	//  216  455:fload_1         
	//  217  456:fstore          4
					if(Math.abs(((Entry) (b1)).getY() - f2) < Math.abs(f1 - f2))
	//* 218  458:aload_3         
	//* 219  459:invokevirtual   #143 <Method float Entry.getY()>
	//* 220  462:fload_2         
	//* 221  463:fsub            
	//* 222  464:invokestatic    #128 <Method float Math.abs(float)>
	//* 223  467:fload_1         
	//* 224  468:fload_2         
	//* 225  469:fsub            
	//* 226  470:invokestatic    #128 <Method float Math.abs(float)>
	//* 227  473:fcmpg           
	//* 228  474:ifge            484
					{
						f4 = f2;
	//  229  477:fload_2         
	//  230  478:fstore          4
						i1 = j;
	//  231  480:iload           7
	//  232  482:istore          8
					}
					f1 = f4;
	//  233  484:fload           4
	//  234  486:fstore_1        
				} while(true);
	//  235  487:goto            404
				j1 = i1;
	//  236  490:iload           8
	//  237  492:istore          9
			}
		}
		return j1;
	//  238  494:iload           9
	//  239  496:ireturn         
	}

	public int b(Entry entry)
	{
		return l.indexOf(((Object) (entry)));
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field List l>
	//    2    4:aload_1         
	//    3    5:invokeinterface #148 <Method int List.indexOf(Object)>
	//    4   10:ireturn         
	}

	public Entry c(float f1, float f2, b b1)
	{
		int i = b(f1, f2, b1);
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:fload_2         
	//    3    3:aload_3         
	//    4    4:invokevirtual   #151 <Method int b(float, float, mb$b)>
	//    5    7:istore          4
		if(i > -1)
	//*   6    9:iload           4
	//*   7   11:iconst_m1       
	//*   8   12:icmple          30
			return (Entry)l.get(i);
	//    9   15:aload_0         
	//   10   16:getfield        #23  <Field List l>
	//   11   19:iload           4
	//   12   21:invokeinterface #119 <Method Object List.get(int)>
	//   13   26:checkcast       #68  <Class Entry>
	//   14   29:areturn         
		else
			return null;
	//   15   30:aconst_null     
	//   16   31:areturn         
	}

	public void c(float f1, float f2)
	{
		if(l == null || l.isEmpty())
	//*   0    0:aload_0         
	//*   1    1:getfield        #23  <Field List l>
	//*   2    4:ifnull          19
	//*   3    7:aload_0         
	//*   4    8:getfield        #23  <Field List l>
	//*   5   11:invokeinterface #53  <Method boolean List.isEmpty()>
	//*   6   16:ifeq            20
			return;
	//    7   19:return          
		p = -3.402823E+38F;
	//    8   20:aload_0         
	//    9   21:ldc1            #24  <Float -3.402823E+38F>
	//   10   23:putfield        #26  <Field float p>
		m = 3.402823E+38F;
	//   11   26:aload_0         
	//   12   27:ldc1            #27  <Float 3.402823E+38F>
	//   13   29:putfield        #29  <Field float m>
		int i = b(f1, (0.0F / 0.0F), b.b);
	//   14   32:aload_0         
	//   15   33:fload_1         
	//   16   34:ldc1            #154 <Float (0.0F / 0.0F)>
	//   17   36:getstatic       #134 <Field mb$b mb$b.b>
	//   18   39:invokevirtual   #151 <Method int b(float, float, mb$b)>
	//   19   42:istore_3        
		for(int j = b(f2, (0.0F / 0.0F), b.c); i <= j; i++)
	//*  20   43:aload_0         
	//*  21   44:fload_2         
	//*  22   45:ldc1            #154 <Float (0.0F / 0.0F)>
	//*  23   47:getstatic       #132 <Field mb$b mb$b.c>
	//*  24   50:invokevirtual   #151 <Method int b(float, float, mb$b)>
	//*  25   53:istore          4
	//*  26   55:iload_3         
	//*  27   56:iload           4
	//*  28   58:icmpgt          85
			c((Entry)l.get(i));
	//   29   61:aload_0         
	//   30   62:aload_0         
	//   31   63:getfield        #23  <Field List l>
	//   32   66:iload_3         
	//   33   67:invokeinterface #119 <Method Object List.get(int)>
	//   34   72:checkcast       #68  <Class Entry>
	//   35   75:invokevirtual   #156 <Method void c(Entry)>

	//   36   78:iload_3         
	//   37   79:iconst_1        
	//   38   80:iadd            
	//   39   81:istore_3        
	//*  40   82:goto            55
	//   41   85:return          
	}

	protected void c(Entry entry)
	{
		if(entry.getY() < m)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #143 <Method float Entry.getY()>
	//*   2    4:aload_0         
	//*   3    5:getfield        #29  <Field float m>
	//*   4    8:fcmpg           
	//*   5    9:ifge            20
			m = entry.getY();
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:invokevirtual   #143 <Method float Entry.getY()>
	//    9   17:putfield        #29  <Field float m>
		if(entry.getY() > p)
	//*  10   20:aload_1         
	//*  11   21:invokevirtual   #143 <Method float Entry.getY()>
	//*  12   24:aload_0         
	//*  13   25:getfield        #26  <Field float p>
	//*  14   28:fcmpl           
	//*  15   29:ifle            40
			p = entry.getY();
	//   16   32:aload_0         
	//   17   33:aload_1         
	//   18   34:invokevirtual   #143 <Method float Entry.getY()>
	//   19   37:putfield        #26  <Field float p>
	//   20   40:return          
	}

	protected void d(Entry entry)
	{
		if(entry.getX() < r)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #122 <Method float Entry.getX()>
	//*   2    4:aload_0         
	//*   3    5:getfield        #33  <Field float r>
	//*   4    8:fcmpg           
	//*   5    9:ifge            20
			r = entry.getX();
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:invokevirtual   #122 <Method float Entry.getX()>
	//    9   17:putfield        #33  <Field float r>
		if(entry.getX() > s)
	//*  10   20:aload_1         
	//*  11   21:invokevirtual   #122 <Method float Entry.getX()>
	//*  12   24:aload_0         
	//*  13   25:getfield        #31  <Field float s>
	//*  14   28:fcmpl           
	//*  15   29:ifle            40
			s = entry.getX();
	//   16   32:aload_0         
	//   17   33:aload_1         
	//   18   34:invokevirtual   #122 <Method float Entry.getX()>
	//   19   37:putfield        #31  <Field float s>
	//   20   40:return          
	}

	public void d(List list)
	{
		l = list;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #23  <Field List l>
		i();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #162 <Method void i()>
	//    5    9:return          
	}

	public Entry e(float f1, float f2)
	{
		return c(f1, f2, b.d);
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:fload_2         
	//    3    3:getstatic       #166 <Field mb$b mb$b.d>
	//    4    6:invokevirtual   #168 <Method Entry c(float, float, mb$b)>
	//    5    9:areturn         
	}

	public List e(float f1)
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #35  <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #38  <Method void ArrayList()>
	//    3    7:astore          5
		int j = 0;
	//    4    9:iconst_0        
	//    5   10:istore_3        
		int i = l.size() - 1;
	//    6   11:aload_0         
	//    7   12:getfield        #23  <Field List l>
	//    8   15:invokeinterface #77  <Method int List.size()>
	//    9   20:iconst_1        
	//   10   21:isub            
	//   11   22:istore_2        
		do
		{
			if(j > i)
				break;
	//   12   23:iload_3         
	//   13   24:iload_2         
	//   14   25:icmpgt          181
			int k = (i + j) / 2;
	//   15   28:iload_2         
	//   16   29:iload_3         
	//   17   30:iadd            
	//   18   31:iconst_2        
	//   19   32:idiv            
	//   20   33:istore          4
			Entry entry = (Entry)l.get(k);
	//   21   35:aload_0         
	//   22   36:getfield        #23  <Field List l>
	//   23   39:iload           4
	//   24   41:invokeinterface #119 <Method Object List.get(int)>
	//   25   46:checkcast       #68  <Class Entry>
	//   26   49:astore          6
			if(f1 == entry.getX())
	//*  27   51:fload_1         
	//*  28   52:aload           6
	//*  29   54:invokevirtual   #122 <Method float Entry.getX()>
	//*  30   57:fcmpl           
	//*  31   58:ifne            155
			{
				for(i = k; i > 0 && ((Entry)l.get(i - 1)).getX() == f1; i--);
	//   32   61:iload           4
	//   33   63:istore_2        
	//   34   64:iload_2         
	//   35   65:ifle            98
	//   36   68:aload_0         
	//   37   69:getfield        #23  <Field List l>
	//   38   72:iload_2         
	//   39   73:iconst_1        
	//   40   74:isub            
	//   41   75:invokeinterface #119 <Method Object List.get(int)>
	//   42   80:checkcast       #68  <Class Entry>
	//   43   83:invokevirtual   #122 <Method float Entry.getX()>
	//   44   86:fload_1         
	//   45   87:fcmpl           
	//   46   88:ifne            98
	//   47   91:iload_2         
	//   48   92:iconst_1        
	//   49   93:isub            
	//   50   94:istore_2        
	//*  51   95:goto            64
				j = l.size();
	//   52   98:aload_0         
	//   53   99:getfield        #23  <Field List l>
	//   54  102:invokeinterface #77  <Method int List.size()>
	//   55  107:istore_3        
				do
				{
					if(i >= j)
						break;
	//   56  108:iload_2         
	//   57  109:iload_3         
	//   58  110:icmpge          181
					entry = (Entry)l.get(i);
	//   59  113:aload_0         
	//   60  114:getfield        #23  <Field List l>
	//   61  117:iload_2         
	//   62  118:invokeinterface #119 <Method Object List.get(int)>
	//   63  123:checkcast       #68  <Class Entry>
	//   64  126:astore          6
					if(entry.getX() != f1)
						break;
	//   65  128:aload           6
	//   66  130:invokevirtual   #122 <Method float Entry.getX()>
	//   67  133:fload_1         
	//   68  134:fcmpl           
	//   69  135:ifne            181
					((List) (arraylist)).add(((Object) (entry)));
	//   70  138:aload           5
	//   71  140:aload           6
	//   72  142:invokeinterface #174 <Method boolean List.add(Object)>
	//   73  147:pop             
					i++;
	//   74  148:iload_2         
	//   75  149:iconst_1        
	//   76  150:iadd            
	//   77  151:istore_2        
				} while(true);
	//   78  152:goto            108
				break;
			}
			if(f1 > entry.getX())
	//*  79  155:fload_1         
	//*  80  156:aload           6
	//*  81  158:invokevirtual   #122 <Method float Entry.getX()>
	//*  82  161:fcmpl           
	//*  83  162:ifle            173
				j = k + 1;
	//   84  165:iload           4
	//   85  167:iconst_1        
	//   86  168:iadd            
	//   87  169:istore_3        
			else
	//*  88  170:goto            178
				i = k - 1;
	//   89  173:iload           4
	//   90  175:iconst_1        
	//   91  176:isub            
	//   92  177:istore_2        
		} while(true);
	//   93  178:goto            23
		return ((List) (arraylist));
	//   94  181:aload           5
	//   95  183:areturn         
	}

	protected void e(Entry entry)
	{
		if(entry == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       5
		{
			return;
	//    2    4:return          
		} else
		{
			d(entry);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokevirtual   #177 <Method void d(Entry)>
			c(entry);
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:invokevirtual   #156 <Method void c(Entry)>
			return;
	//    9   15:return          
		}
	}

	public Entry f(int i)
	{
		return (Entry)l.get(i);
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field List l>
	//    2    4:iload_1         
	//    3    5:invokeinterface #119 <Method Object List.get(int)>
	//    4   10:checkcast       #68  <Class Entry>
	//    5   13:areturn         
	}

	public String toString()
	{
		StringBuffer stringbuffer = new StringBuffer();
	//    0    0:new             #83  <Class StringBuffer>
	//    1    3:dup             
	//    2    4:invokespecial   #84  <Method void StringBuffer()>
	//    3    7:astore_2        
		stringbuffer.append(G());
	//    4    8:aload_2         
	//    5    9:aload_0         
	//    6   10:invokevirtual   #182 <Method String G()>
	//    7   13:invokevirtual   #111 <Method StringBuffer StringBuffer.append(String)>
	//    8   16:pop             
		for(int i = 0; i < l.size(); i++)
	//*   9   17:iconst_0        
	//*  10   18:istore_1        
	//*  11   19:iload_1         
	//*  12   20:aload_0         
	//*  13   21:getfield        #23  <Field List l>
	//*  14   24:invokeinterface #77  <Method int List.size()>
	//*  15   29:icmpge          78
			stringbuffer.append((new StringBuilder()).append(((Entry)l.get(i)).toString()).append(" ").toString());
	//   16   32:aload_2         
	//   17   33:new             #86  <Class StringBuilder>
	//   18   36:dup             
	//   19   37:invokespecial   #87  <Method void StringBuilder()>
	//   20   40:aload_0         
	//   21   41:getfield        #23  <Field List l>
	//   22   44:iload_1         
	//   23   45:invokeinterface #119 <Method Object List.get(int)>
	//   24   50:checkcast       #68  <Class Entry>
	//   25   53:invokevirtual   #183 <Method String Entry.toString()>
	//   26   56:invokevirtual   #93  <Method StringBuilder StringBuilder.append(String)>
	//   27   59:ldc1            #185 <String " ">
	//   28   61:invokevirtual   #93  <Method StringBuilder StringBuilder.append(String)>
	//   29   64:invokevirtual   #108 <Method String StringBuilder.toString()>
	//   30   67:invokevirtual   #111 <Method StringBuffer StringBuffer.append(String)>
	//   31   70:pop             

	//   32   71:iload_1         
	//   33   72:iconst_1        
	//   34   73:iadd            
	//   35   74:istore_1        
	//*  36   75:goto            19
		return stringbuffer.toString();
	//   37   78:aload_2         
	//   38   79:invokevirtual   #112 <Method String StringBuffer.toString()>
	//   39   82:areturn         
	}

	protected List l;
	protected float m;
	protected float p;
	protected float r;
	protected float s;
}
