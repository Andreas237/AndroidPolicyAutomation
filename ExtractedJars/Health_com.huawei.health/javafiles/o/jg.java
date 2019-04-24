// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import android.location.Location;
import android.net.wifi.ScanResult;
import android.telephony.CellLocation;
import java.util.List;

// Referenced classes of package o:
//			jl, jh, iq, ji, 
//			jj

public final class jg
{

	protected jg(iq iq1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #29  <Method void Object()>
		d = new jl(this);
	//    2    4:aload_0         
	//    3    5:new             #31  <Class jl>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:invokespecial   #34  <Method void jl(jg)>
	//    7   13:putfield        #36  <Field jl d>
		e = new jh(this);
	//    8   16:aload_0         
	//    9   17:new             #38  <Class jh>
	//   10   20:dup             
	//   11   21:aload_0         
	//   12   22:invokespecial   #39  <Method void jh(jg)>
	//   13   25:putfield        #41  <Field jh e>
		b = iq1;
	//   14   28:aload_0         
	//   15   29:aload_1         
	//   16   30:putfield        #43  <Field iq b>
	//   17   33:return          
	}

	protected static void b(int i)
	{
		c = i;
	//    0    0:iload_0         
	//    1    1:putstatic       #21  <Field int c>
	//    2    4:return          
	}

	protected static void c(int i)
	{
		a = i;
	//    0    0:iload_0         
	//    1    1:putstatic       #19  <Field int a>
	//    2    4:return          
	}

	protected static void e()
	{
	//    0    0:return          
	}

	protected final boolean c(Location location)
	{
		if(b == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #43  <Field iq b>
	//*   2    4:ifnonnull       9
			return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		boolean flag1 = false;
	//    5    9:iconst_0        
	//    6   10:istore          11
		List list = b.n();
	//    7   12:aload_0         
	//    8   13:getfield        #43  <Field iq b>
	//    9   16:invokevirtual   #51  <Method List iq.n()>
	//   10   19:astore          13
		Object obj = null;
	//   11   21:aconst_null     
	//   12   22:astore          12
		boolean flag = flag1;
	//   13   24:iload           11
	//   14   26:istore          10
		if(list.size() >= 2)
	//*  15   28:aload           13
	//*  16   30:invokeinterface #57  <Method int List.size()>
	//*  17   35:iconst_2        
	//*  18   36:icmplt          391
		{
			list = (List)list.get(1);
	//   19   39:aload           13
	//   20   41:iconst_1        
	//   21   42:invokeinterface #61  <Method Object List.get(int)>
	//   22   47:checkcast       #53  <Class List>
	//   23   50:astore          13
			if(d.a == null)
	//*  24   52:aload_0         
	//*  25   53:getfield        #36  <Field jl d>
	//*  26   56:getfield        #64  <Field Location jl.a>
	//*  27   59:ifnonnull       72
			{
				flag = true;
	//   28   62:iconst_1        
	//   29   63:istore          10
				obj = ((Object) (list));
	//   30   65:aload           13
	//   31   67:astore          12
			} else
	//*  32   69:goto            391
			{
				flag = flag1;
	//   33   72:iload           11
	//   34   74:istore          10
				obj = ((Object) (list));
	//   35   76:aload           13
	//   36   78:astore          12
				if(list != null)
	//*  37   80:aload           13
	//*  38   82:ifnull          391
				{
					flag = flag1;
	//   39   85:iload           11
	//   40   87:istore          10
					obj = ((Object) (list));
	//   41   89:aload           13
	//   42   91:astore          12
					if(list.size() > 0)
	//*  43   93:aload           13
	//*  44   95:invokeinterface #57  <Method int List.size()>
	//*  45  100:ifle            391
					{
						boolean flag2;
						if(location.distanceTo(d.a) > (float)a)
	//*  46  103:aload_1         
	//*  47  104:aload_0         
	//*  48  105:getfield        #36  <Field jl d>
	//*  49  108:getfield        #64  <Field Location jl.a>
	//*  50  111:invokevirtual   #70  <Method float Location.distanceTo(Location)>
	//*  51  114:getstatic       #19  <Field int a>
	//*  52  117:i2f             
	//*  53  118:fcmpl           
	//*  54  119:ifle            128
							flag2 = true;
	//   55  122:iconst_1        
	//   56  123:istore          11
						else
	//*  57  125:goto            131
							flag2 = false;
	//   58  128:iconst_0        
	//   59  129:istore          11
						flag = flag2;
	//   60  131:iload           11
	//   61  133:istore          10
						obj = ((Object) (list));
	//   62  135:aload           13
	//   63  137:astore          12
						if(!flag2)
	//*  64  139:iload           11
	//*  65  141:ifne            391
						{
							location = ((Location) (d.e));
	//   66  144:aload_0         
	//   67  145:getfield        #36  <Field jl d>
	//   68  148:getfield        #73  <Field List jl.e>
	//   69  151:astore_1        
							float f1 = f;
	//   70  152:getstatic       #24  <Field float f>
	//   71  155:fstore_2        
							int i;
							if(list == null || location == null)
	//*  72  156:aload           13
	//*  73  158:ifnull          165
	//*  74  161:aload_1         
	//*  75  162:ifnonnull       171
								i = 0;
	//   76  165:iconst_0        
	//   77  166:istore          4
							else
	//*  78  168:goto            369
							if(list == null || location == null)
	//*  79  171:aload           13
	//*  80  173:ifnull          180
	//*  81  176:aload_1         
	//*  82  177:ifnonnull       186
							{
								i = 0;
	//   83  180:iconst_0        
	//   84  181:istore          4
							} else
	//*  85  183:goto            369
							{
								int k1 = list.size();
	//   86  186:aload           13
	//   87  188:invokeinterface #57  <Method int List.size()>
	//   88  193:istore          8
								int l1 = ((List) (location)).size();
	//   89  195:aload_1         
	//   90  196:invokeinterface #57  <Method int List.size()>
	//   91  201:istore          9
								float f2 = k1 + l1;
	//   92  203:iload           8
	//   93  205:iload           9
	//   94  207:iadd            
	//   95  208:i2f             
	//   96  209:fstore_3        
								if(k1 == 0 && l1 == 0)
	//*  97  210:iload           8
	//*  98  212:ifne            226
	//*  99  215:iload           9
	//* 100  217:ifne            226
									i = 1;
	//  101  220:iconst_1        
	//  102  221:istore          4
								else
	//* 103  223:goto            369
								if(k1 == 0 || l1 == 0)
	//* 104  226:iload           8
	//* 105  228:ifeq            236
	//* 106  231:iload           9
	//* 107  233:ifne            242
								{
									i = 0;
	//  108  236:iconst_0        
	//  109  237:istore          4
								} else
	//* 110  239:goto            369
								{
									int k = 0;
	//  111  242:iconst_0        
	//  112  243:istore          5
									for(i = 0; i < k1;)
	//* 113  245:iconst_0        
	//* 114  246:istore          4
	//* 115  248:iload           4
	//* 116  250:iload           8
	//* 117  252:icmpge          348
									{
										obj = ((Object) (((ScanResult)list.get(i)).BSSID));
	//  118  255:aload           13
	//  119  257:iload           4
	//  120  259:invokeinterface #61  <Method Object List.get(int)>
	//  121  264:checkcast       #75  <Class ScanResult>
	//  122  267:getfield        #79  <Field String ScanResult.BSSID>
	//  123  270:astore          12
										int i1 = k;
	//  124  272:iload           5
	//  125  274:istore          6
										if(obj != null)
	//* 126  276:aload           12
	//* 127  278:ifnull          335
										{
											int j1 = 0;
	//  128  281:iconst_0        
	//  129  282:istore          7
											do
											{
												i1 = k;
	//  130  284:iload           5
	//  131  286:istore          6
												if(j1 >= l1)
													break;
	//  132  288:iload           7
	//  133  290:iload           9
	//  134  292:icmpge          335
												if(((String) (obj)).equals(((Object) (((ji)((List) (location)).get(j1)).b))))
	//* 135  295:aload           12
	//* 136  297:aload_1         
	//* 137  298:iload           7
	//* 138  300:invokeinterface #61  <Method Object List.get(int)>
	//* 139  305:checkcast       #81  <Class ji>
	//* 140  308:getfield        #83  <Field String ji.b>
	//* 141  311:invokevirtual   #89  <Method boolean String.equals(Object)>
	//* 142  314:ifeq            326
												{
													i1 = k + 1;
	//  143  317:iload           5
	//  144  319:iconst_1        
	//  145  320:iadd            
	//  146  321:istore          6
													break;
	//  147  323:goto            335
												}
												j1++;
	//  148  326:iload           7
	//  149  328:iconst_1        
	//  150  329:iadd            
	//  151  330:istore          7
											} while(true);
	//  152  332:goto            284
										}
										i++;
	//  153  335:iload           4
	//  154  337:iconst_1        
	//  155  338:iadd            
	//  156  339:istore          4
										k = i1;
	//  157  341:iload           6
	//  158  343:istore          5
									}

	//* 159  345:goto            248
									if((float)(k << 1) >= f2 * f1)
	//* 160  348:iload           5
	//* 161  350:iconst_1        
	//* 162  351:ishl            
	//* 163  352:i2f             
	//* 164  353:fload_3         
	//* 165  354:fload_2         
	//* 166  355:fmul            
	//* 167  356:fcmpl           
	//* 168  357:iflt            366
										i = 1;
	//  169  360:iconst_1        
	//  170  361:istore          4
									else
	//* 171  363:goto            369
										i = 0;
	//  172  366:iconst_0        
	//  173  367:istore          4
								}
							}
							if(i == 0)
	//* 174  369:iload           4
	//* 175  371:ifne            384
							{
								flag = true;
	//  176  374:iconst_1        
	//  177  375:istore          10
								obj = ((Object) (list));
	//  178  377:aload           13
	//  179  379:astore          12
							} else
	//* 180  381:goto            391
							{
								flag = false;
	//  181  384:iconst_0        
	//  182  385:istore          10
								obj = ((Object) (list));
	//  183  387:aload           13
	//  184  389:astore          12
							}
						}
					}
				}
			}
		}
		if(flag)
	//* 185  391:iload           10
	//* 186  393:ifeq            471
		{
			d.e.clear();
	//  187  396:aload_0         
	//  188  397:getfield        #36  <Field jl d>
	//  189  400:getfield        #73  <Field List jl.e>
	//  190  403:invokeinterface #92  <Method void List.clear()>
			int l = ((List) (obj)).size();
	//  191  408:aload           12
	//  192  410:invokeinterface #57  <Method int List.size()>
	//  193  415:istore          5
			for(int j = 0; j < l; j++)
	//* 194  417:iconst_0        
	//* 195  418:istore          4
	//* 196  420:iload           4
	//* 197  422:iload           5
	//* 198  424:icmpge          471
				d.e.add(((Object) (new ji(((ScanResult)((List) (obj)).get(j)).BSSID))));
	//  199  427:aload_0         
	//  200  428:getfield        #36  <Field jl d>
	//  201  431:getfield        #73  <Field List jl.e>
	//  202  434:new             #81  <Class ji>
	//  203  437:dup             
	//  204  438:aload           12
	//  205  440:iload           4
	//  206  442:invokeinterface #61  <Method Object List.get(int)>
	//  207  447:checkcast       #75  <Class ScanResult>
	//  208  450:getfield        #79  <Field String ScanResult.BSSID>
	//  209  453:invokespecial   #95  <Method void ji(String)>
	//  210  456:invokeinterface #98  <Method boolean List.add(Object)>
	//  211  461:pop             

	//  212  462:iload           4
	//  213  464:iconst_1        
	//  214  465:iadd            
	//  215  466:istore          4
		}
	//* 216  468:goto            420
		return flag;
	//  217  471:iload           10
	//  218  473:ireturn         
	}

	protected final boolean d(Location location)
	{
		if(b == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #43  <Field iq b>
	//*   2    4:ifnonnull       9
			return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		boolean flag1 = false;
	//    5    9:iconst_0        
	//    6   10:istore_3        
		List list = b.g();
	//    7   11:aload_0         
	//    8   12:getfield        #43  <Field iq b>
	//    9   15:invokevirtual   #101 <Method List iq.g()>
	//   10   18:astore          6
		if(list == null || location == null)
	//*  11   20:aload           6
	//*  12   22:ifnull          29
	//*  13   25:aload_1         
	//*  14   26:ifnonnull       31
			return false;
	//   15   29:iconst_0        
	//   16   30:ireturn         
		(new StringBuilder("cell.list.size: ")).append(list.size()).toString();
	//   17   31:new             #103 <Class StringBuilder>
	//   18   34:dup             
	//   19   35:ldc1            #105 <String "cell.list.size: ">
	//   20   37:invokespecial   #106 <Method void StringBuilder(String)>
	//   21   40:aload           6
	//   22   42:invokeinterface #57  <Method int List.size()>
	//   23   47:invokevirtual   #110 <Method StringBuilder StringBuilder.append(int)>
	//   24   50:invokevirtual   #114 <Method String StringBuilder.toString()>
	//   25   53:pop             
		jj jj1 = null;
	//   26   54:aconst_null     
	//   27   55:astore          5
		if(list.size() >= 2)
	//*  28   57:aload           6
	//*  29   59:invokeinterface #57  <Method int List.size()>
	//*  30   64:iconst_2        
	//*  31   65:icmplt          242
		{
			jj1 = new jj((CellLocation)list.get(1));
	//   32   68:new             #116 <Class jj>
	//   33   71:dup             
	//   34   72:aload           6
	//   35   74:iconst_1        
	//   36   75:invokeinterface #61  <Method Object List.get(int)>
	//   37   80:checkcast       #118 <Class CellLocation>
	//   38   83:invokespecial   #121 <Method void jj(CellLocation)>
	//   39   86:astore          5
			if(e.b == null)
	//*  40   88:aload_0         
	//*  41   89:getfield        #41  <Field jh e>
	//*  42   92:getfield        #123 <Field Location jh.b>
	//*  43   95:ifnonnull       103
			{
				flag1 = true;
	//   44   98:iconst_1        
	//   45   99:istore_3        
			} else
	//*  46  100:goto            242
			{
				boolean flag2;
				if(location.distanceTo(e.b) > (float)c)
	//*  47  103:aload_1         
	//*  48  104:aload_0         
	//*  49  105:getfield        #41  <Field jh e>
	//*  50  108:getfield        #123 <Field Location jh.b>
	//*  51  111:invokevirtual   #70  <Method float Location.distanceTo(Location)>
	//*  52  114:getstatic       #21  <Field int c>
	//*  53  117:i2f             
	//*  54  118:fcmpl           
	//*  55  119:ifle            128
					flag2 = true;
	//   56  122:iconst_1        
	//   57  123:istore          4
				else
	//*  58  125:goto            131
					flag2 = false;
	//   59  128:iconst_0        
	//   60  129:istore          4
				flag1 = flag2;
	//   61  131:iload           4
	//   62  133:istore_3        
				if(!flag2)
	//*  63  134:iload           4
	//*  64  136:ifne            225
				{
					location = ((Location) (e.d));
	//   65  139:aload_0         
	//   66  140:getfield        #41  <Field jh e>
	//   67  143:getfield        #126 <Field jj jh.d>
	//   68  146:astore_1        
					boolean flag;
					if(jj1.a == ((jj) (location)).a && jj1.e == ((jj) (location)).e && jj1.c == ((jj) (location)).c && jj1.b == ((jj) (location)).b && jj1.d == ((jj) (location)).d)
	//*  69  147:aload           5
	//*  70  149:getfield        #127 <Field int jj.a>
	//*  71  152:aload_1         
	//*  72  153:getfield        #127 <Field int jj.a>
	//*  73  156:icmpne          212
	//*  74  159:aload           5
	//*  75  161:getfield        #129 <Field int jj.e>
	//*  76  164:aload_1         
	//*  77  165:getfield        #129 <Field int jj.e>
	//*  78  168:icmpne          212
	//*  79  171:aload           5
	//*  80  173:getfield        #130 <Field int jj.c>
	//*  81  176:aload_1         
	//*  82  177:getfield        #130 <Field int jj.c>
	//*  83  180:icmpne          212
	//*  84  183:aload           5
	//*  85  185:getfield        #132 <Field int jj.b>
	//*  86  188:aload_1         
	//*  87  189:getfield        #132 <Field int jj.b>
	//*  88  192:icmpne          212
	//*  89  195:aload           5
	//*  90  197:getfield        #134 <Field int jj.d>
	//*  91  200:aload_1         
	//*  92  201:getfield        #134 <Field int jj.d>
	//*  93  204:icmpne          212
						flag = true;
	//   94  207:iconst_1        
	//   95  208:istore_2        
					else
	//*  96  209:goto            214
						flag = false;
	//   97  212:iconst_0        
	//   98  213:istore_2        
					if(!flag)
	//*  99  214:iload_2         
	//* 100  215:ifne            223
						flag1 = true;
	//  101  218:iconst_1        
	//  102  219:istore_3        
					else
	//* 103  220:goto            225
						flag1 = false;
	//  104  223:iconst_0        
	//  105  224:istore_3        
				}
				(new StringBuilder("collect cell?: ")).append(flag1).toString();
	//  106  225:new             #103 <Class StringBuilder>
	//  107  228:dup             
	//  108  229:ldc1            #136 <String "collect cell?: ">
	//  109  231:invokespecial   #106 <Method void StringBuilder(String)>
	//  110  234:iload_3         
	//  111  235:invokevirtual   #139 <Method StringBuilder StringBuilder.append(boolean)>
	//  112  238:invokevirtual   #114 <Method String StringBuilder.toString()>
	//  113  241:pop             
			}
		}
		if(flag1)
	//* 114  242:iload_3         
	//* 115  243:ifeq            255
			e.d = jj1;
	//  116  246:aload_0         
	//  117  247:getfield        #41  <Field jh e>
	//  118  250:aload           5
	//  119  252:putfield        #126 <Field jj jh.d>
		return flag1;
	//  120  255:iload_3         
	//  121  256:ireturn         
	}

	private static int a = 10;
	private static int c = 100;
	private static float f = 0.5F;
	private iq b;
	protected jl d;
	protected jh e;

	static 
	{
	//    0    0:bipush          10
	//    1    2:putstatic       #19  <Field int a>
	//    2    5:bipush          100
	//    3    7:putstatic       #21  <Field int c>
	//    4   10:ldc1            #22  <Float 0.5F>
	//    5   12:putstatic       #24  <Field float f>
	//*   6   15:return          
	}
}
