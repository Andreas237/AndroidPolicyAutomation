// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;


public final class hq extends Enum
{

	private hq(String s, int j, int i1, String s1)
	{
		super(s, j);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #121 <Method void Enum(String, int)>
		u = i1;
	//    4    6:aload_0         
	//    5    7:iload_3         
	//    6    8:putfield        #123 <Field int u>
		r = s1;
	//    7   11:aload_0         
	//    8   12:aload           4
	//    9   14:putfield        #125 <Field String r>
	//   10   17:return          
	}

	public static hq a(int j)
	{
		hq ahq[] = values();
	//    0    0:invokestatic    #132 <Method hq[] values()>
	//    1    3:astore_3        
		int j1 = ahq.length;
	//    2    4:aload_3         
	//    3    5:arraylength     
	//    4    6:istore_2        
		for(int i1 = 0; i1 < j1; i1++)
	//*   5    7:iconst_0        
	//*   6    8:istore_1        
	//*   7    9:iload_1         
	//*   8   10:iload_2         
	//*   9   11:icmpge          38
		{
			hq hq1 = ahq[i1];
	//   10   14:aload_3         
	//   11   15:iload_1         
	//   12   16:aaload          
	//   13   17:astore          4
			if(hq1.u == j)
	//*  14   19:aload           4
	//*  15   21:getfield        #123 <Field int u>
	//*  16   24:iload_0         
	//*  17   25:icmpne          31
				return hq1;
	//   18   28:aload           4
	//   19   30:areturn         
		}

	//   20   31:iload_1         
	//   21   32:iconst_1        
	//   22   33:iadd            
	//   23   34:istore_1        
	//*  24   35:goto            9
		return n;
	//   25   38:getstatic       #115 <Field hq n>
	//   26   41:areturn         
	}

	public static hq valueOf(String s)
	{
		return (hq)Enum.valueOf(o/hq, s);
	//    0    0:ldc1            #2   <Class hq>
	//    1    2:aload_0         
	//    2    3:invokestatic    #137 <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class hq>
	//    4    9:areturn         
	}

	public static hq[] values()
	{
		return (hq[])((hq []) (q)).clone();
	//    0    0:getstatic       #117 <Field hq[] q>
	//    1    3:invokevirtual   #142 <Method Object _5B_Lo.hq_3B_.clone()>
	//    2    6:checkcast       #138 <Class hq[]>
	//    3    9:areturn         
	}

	public static final hq a;
	public static final hq b;
	public static final hq c;
	public static final hq d;
	public static final hq e;
	public static final hq f;
	public static final hq g;
	public static final hq h;
	public static final hq i;
	public static final hq k;
	public static final hq l;
	public static final hq m;
	public static final hq n;
	public static final hq o;
	public static final hq p;
	private static final hq q[];
	public String r;
	private int u;

	static 
	{
		d = new hq("WIFI", 0, 0, "WIFI");
	//    0    0:new             #2   <Class hq>
	//    1    3:dup             
	//    2    4:ldc1            #31  <String "WIFI">
	//    3    6:iconst_0        
	//    4    7:iconst_0        
	//    5    8:ldc1            #31  <String "WIFI">
	//    6   10:invokespecial   #35  <Method void hq(String, int, int, String)>
	//    7   13:putstatic       #37  <Field hq d>
		b = new hq("NETWORK_TYPE_1", 1, 1, "unicom2G");
	//    8   16:new             #2   <Class hq>
	//    9   19:dup             
	//   10   20:ldc1            #39  <String "NETWORK_TYPE_1">
	//   11   22:iconst_1        
	//   12   23:iconst_1        
	//   13   24:ldc1            #41  <String "unicom2G">
	//   14   26:invokespecial   #35  <Method void hq(String, int, int, String)>
	//   15   29:putstatic       #43  <Field hq b>
		c = new hq("NETWORK_TYPE_2", 2, 2, "mobile2G");
	//   16   32:new             #2   <Class hq>
	//   17   35:dup             
	//   18   36:ldc1            #45  <String "NETWORK_TYPE_2">
	//   19   38:iconst_2        
	//   20   39:iconst_2        
	//   21   40:ldc1            #47  <String "mobile2G">
	//   22   42:invokespecial   #35  <Method void hq(String, int, int, String)>
	//   23   45:putstatic       #49  <Field hq c>
		e = new hq("NETWORK_TYPE_4", 3, 4, "telecom2G");
	//   24   48:new             #2   <Class hq>
	//   25   51:dup             
	//   26   52:ldc1            #51  <String "NETWORK_TYPE_4">
	//   27   54:iconst_3        
	//   28   55:iconst_4        
	//   29   56:ldc1            #53  <String "telecom2G">
	//   30   58:invokespecial   #35  <Method void hq(String, int, int, String)>
	//   31   61:putstatic       #55  <Field hq e>
		a = new hq("NETWORK_TYPE_5", 4, 5, "telecom3G");
	//   32   64:new             #2   <Class hq>
	//   33   67:dup             
	//   34   68:ldc1            #57  <String "NETWORK_TYPE_5">
	//   35   70:iconst_4        
	//   36   71:iconst_5        
	//   37   72:ldc1            #59  <String "telecom3G">
	//   38   74:invokespecial   #35  <Method void hq(String, int, int, String)>
	//   39   77:putstatic       #61  <Field hq a>
		f = new hq("NETWORK_TYPE_6", 5, 6, "telecom3G");
	//   40   80:new             #2   <Class hq>
	//   41   83:dup             
	//   42   84:ldc1            #63  <String "NETWORK_TYPE_6">
	//   43   86:iconst_5        
	//   44   87:bipush          6
	//   45   89:ldc1            #59  <String "telecom3G">
	//   46   91:invokespecial   #35  <Method void hq(String, int, int, String)>
	//   47   94:putstatic       #65  <Field hq f>
		h = new hq("NETWORK_TYPE_12", 6, 12, "telecom3G");
	//   48   97:new             #2   <Class hq>
	//   49  100:dup             
	//   50  101:ldc1            #67  <String "NETWORK_TYPE_12">
	//   51  103:bipush          6
	//   52  105:bipush          12
	//   53  107:ldc1            #59  <String "telecom3G">
	//   54  109:invokespecial   #35  <Method void hq(String, int, int, String)>
	//   55  112:putstatic       #69  <Field hq h>
		k = new hq("NETWORK_TYPE_8", 7, 8, "unicom3G");
	//   56  115:new             #2   <Class hq>
	//   57  118:dup             
	//   58  119:ldc1            #71  <String "NETWORK_TYPE_8">
	//   59  121:bipush          7
	//   60  123:bipush          8
	//   61  125:ldc1            #73  <String "unicom3G">
	//   62  127:invokespecial   #35  <Method void hq(String, int, int, String)>
	//   63  130:putstatic       #75  <Field hq k>
		g = new hq("NETWORK_TYPE_3", 8, 3, "unicom3G");
	//   64  133:new             #2   <Class hq>
	//   65  136:dup             
	//   66  137:ldc1            #77  <String "NETWORK_TYPE_3">
	//   67  139:bipush          8
	//   68  141:iconst_3        
	//   69  142:ldc1            #73  <String "unicom3G">
	//   70  144:invokespecial   #35  <Method void hq(String, int, int, String)>
	//   71  147:putstatic       #79  <Field hq g>
		i = new hq("NETWORK_TYPE_13", 9, 13, "LTE");
	//   72  150:new             #2   <Class hq>
	//   73  153:dup             
	//   74  154:ldc1            #81  <String "NETWORK_TYPE_13">
	//   75  156:bipush          9
	//   76  158:bipush          13
	//   77  160:ldc1            #83  <String "LTE">
	//   78  162:invokespecial   #35  <Method void hq(String, int, int, String)>
	//   79  165:putstatic       #85  <Field hq i>
		l = new hq("NETWORK_TYPE_11", 10, 11, "IDEN");
	//   80  168:new             #2   <Class hq>
	//   81  171:dup             
	//   82  172:ldc1            #87  <String "NETWORK_TYPE_11">
	//   83  174:bipush          10
	//   84  176:bipush          11
	//   85  178:ldc1            #89  <String "IDEN">
	//   86  180:invokespecial   #35  <Method void hq(String, int, int, String)>
	//   87  183:putstatic       #91  <Field hq l>
		m = new hq("NETWORK_TYPE_9", 11, 9, "HSUPA");
	//   88  186:new             #2   <Class hq>
	//   89  189:dup             
	//   90  190:ldc1            #93  <String "NETWORK_TYPE_9">
	//   91  192:bipush          11
	//   92  194:bipush          9
	//   93  196:ldc1            #95  <String "HSUPA">
	//   94  198:invokespecial   #35  <Method void hq(String, int, int, String)>
	//   95  201:putstatic       #97  <Field hq m>
		p = new hq("NETWORK_TYPE_10", 12, 10, "HSPA");
	//   96  204:new             #2   <Class hq>
	//   97  207:dup             
	//   98  208:ldc1            #99  <String "NETWORK_TYPE_10">
	//   99  210:bipush          12
	//  100  212:bipush          10
	//  101  214:ldc1            #101 <String "HSPA">
	//  102  216:invokespecial   #35  <Method void hq(String, int, int, String)>
	//  103  219:putstatic       #103 <Field hq p>
		o = new hq("NETWORK_TYPE_15", 13, 15, "HSPAP");
	//  104  222:new             #2   <Class hq>
	//  105  225:dup             
	//  106  226:ldc1            #105 <String "NETWORK_TYPE_15">
	//  107  228:bipush          13
	//  108  230:bipush          15
	//  109  232:ldc1            #107 <String "HSPAP">
	//  110  234:invokespecial   #35  <Method void hq(String, int, int, String)>
	//  111  237:putstatic       #109 <Field hq o>
		n = new hq("NONE", 14, -1, "none");
	//  112  240:new             #2   <Class hq>
	//  113  243:dup             
	//  114  244:ldc1            #111 <String "NONE">
	//  115  246:bipush          14
	//  116  248:iconst_m1       
	//  117  249:ldc1            #113 <String "none">
	//  118  251:invokespecial   #35  <Method void hq(String, int, int, String)>
	//  119  254:putstatic       #115 <Field hq n>
		q = (new hq[] {
			d, b, c, e, a, f, h, k, g, i, 
			l, m, p, o, n
		});
	//  120  257:bipush          15
	//  121  259:anewarray       hq[]
	//  122  262:dup             
	//  123  263:iconst_0        
	//  124  264:getstatic       #37  <Field hq d>
	//  125  267:aastore         
	//  126  268:dup             
	//  127  269:iconst_1        
	//  128  270:getstatic       #43  <Field hq b>
	//  129  273:aastore         
	//  130  274:dup             
	//  131  275:iconst_2        
	//  132  276:getstatic       #49  <Field hq c>
	//  133  279:aastore         
	//  134  280:dup             
	//  135  281:iconst_3        
	//  136  282:getstatic       #55  <Field hq e>
	//  137  285:aastore         
	//  138  286:dup             
	//  139  287:iconst_4        
	//  140  288:getstatic       #61  <Field hq a>
	//  141  291:aastore         
	//  142  292:dup             
	//  143  293:iconst_5        
	//  144  294:getstatic       #65  <Field hq f>
	//  145  297:aastore         
	//  146  298:dup             
	//  147  299:bipush          6
	//  148  301:getstatic       #69  <Field hq h>
	//  149  304:aastore         
	//  150  305:dup             
	//  151  306:bipush          7
	//  152  308:getstatic       #75  <Field hq k>
	//  153  311:aastore         
	//  154  312:dup             
	//  155  313:bipush          8
	//  156  315:getstatic       #79  <Field hq g>
	//  157  318:aastore         
	//  158  319:dup             
	//  159  320:bipush          9
	//  160  322:getstatic       #85  <Field hq i>
	//  161  325:aastore         
	//  162  326:dup             
	//  163  327:bipush          10
	//  164  329:getstatic       #91  <Field hq l>
	//  165  332:aastore         
	//  166  333:dup             
	//  167  334:bipush          11
	//  168  336:getstatic       #97  <Field hq m>
	//  169  339:aastore         
	//  170  340:dup             
	//  171  341:bipush          12
	//  172  343:getstatic       #103 <Field hq p>
	//  173  346:aastore         
	//  174  347:dup             
	//  175  348:bipush          13
	//  176  350:getstatic       #109 <Field hq o>
	//  177  353:aastore         
	//  178  354:dup             
	//  179  355:bipush          14
	//  180  357:getstatic       #115 <Field hq n>
	//  181  360:aastore         
	//  182  361:putstatic       #117 <Field hq[] q>
	//* 183  364:return          
	}
}
