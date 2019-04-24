// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.measurement;


// Referenced classes of package com.google.android.gms.internal.measurement:
//			zzxx, zzxt, zzxu, zzxv, 
//			zzxw, zzxr

public class zzxs extends Enum
{

	private zzxs(String s, int i, zzxx zzxx1, int j)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #155 <Method void Enum(String, int)>
		zzceb = zzxx1;
	//    4    6:aload_0         
	//    5    7:aload_3         
	//    6    8:putfield        #157 <Field zzxx zzceb>
		zzcec = j;
	//    7   11:aload_0         
	//    8   12:iload           4
	//    9   14:putfield        #159 <Field int zzcec>
	//   10   17:return          
	}

	zzxs(String s, int i, zzxx zzxx1, int j, zzxr zzxr)
	{
		this(s, i, zzxx1, j);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:aload_3         
	//    4    4:iload           4
	//    5    6:invokespecial   #43  <Method void zzxs(String, int, zzxx, int)>
	//    6    9:return          
	}

	public static zzxs[] values()
	{
		return (zzxs[])((zzxs []) (zzced)).clone();
	//    0    0:getstatic       #151 <Field zzxs[] zzced>
	//    1    3:invokevirtual   #169 <Method Object _5B_Lcom.google.android.gms.internal.measurement.zzxs_3B_.clone()>
	//    2    6:checkcast       #165 <Class zzxs[]>
	//    3    9:areturn         
	}

	public final zzxx zzyv()
	{
		return zzceb;
	//    0    0:aload_0         
	//    1    1:getfield        #157 <Field zzxx zzceb>
	//    2    4:areturn         
	}

	public final int zzyw()
	{
		return zzcec;
	//    0    0:aload_0         
	//    1    1:getfield        #159 <Field int zzcec>
	//    2    4:ireturn         
	}

	public static final zzxs zzcdj;
	public static final zzxs zzcdk;
	public static final zzxs zzcdl;
	public static final zzxs zzcdm;
	public static final zzxs zzcdn;
	public static final zzxs zzcdo;
	public static final zzxs zzcdp;
	public static final zzxs zzcdq;
	public static final zzxs zzcdr;
	public static final zzxs zzcds;
	public static final zzxs zzcdt;
	public static final zzxs zzcdu;
	public static final zzxs zzcdv;
	public static final zzxs zzcdw;
	public static final zzxs zzcdx;
	public static final zzxs zzcdy;
	public static final zzxs zzcdz;
	public static final zzxs zzcea;
	private static final zzxs zzced[];
	private final zzxx zzceb;
	private final int zzcec;

	static 
	{
		zzcdj = new zzxs("DOUBLE", 0, zzxx.zzceh, 1);
	//    0    0:new             #2   <Class zzxs>
	//    1    3:dup             
	//    2    4:ldc1            #34  <String "DOUBLE">
	//    3    6:iconst_0        
	//    4    7:getstatic       #39  <Field zzxx zzxx.zzceh>
	//    5   10:iconst_1        
	//    6   11:invokespecial   #43  <Method void zzxs(String, int, zzxx, int)>
	//    7   14:putstatic       #45  <Field zzxs zzcdj>
		zzcdk = new zzxs("FLOAT", 1, zzxx.zzceg, 5);
	//    8   17:new             #2   <Class zzxs>
	//    9   20:dup             
	//   10   21:ldc1            #47  <String "FLOAT">
	//   11   23:iconst_1        
	//   12   24:getstatic       #50  <Field zzxx zzxx.zzceg>
	//   13   27:iconst_5        
	//   14   28:invokespecial   #43  <Method void zzxs(String, int, zzxx, int)>
	//   15   31:putstatic       #52  <Field zzxs zzcdk>
		zzcdl = new zzxs("INT64", 2, zzxx.zzcef, 0);
	//   16   34:new             #2   <Class zzxs>
	//   17   37:dup             
	//   18   38:ldc1            #54  <String "INT64">
	//   19   40:iconst_2        
	//   20   41:getstatic       #57  <Field zzxx zzxx.zzcef>
	//   21   44:iconst_0        
	//   22   45:invokespecial   #43  <Method void zzxs(String, int, zzxx, int)>
	//   23   48:putstatic       #59  <Field zzxs zzcdl>
		zzcdm = new zzxs("UINT64", 3, zzxx.zzcef, 0);
	//   24   51:new             #2   <Class zzxs>
	//   25   54:dup             
	//   26   55:ldc1            #61  <String "UINT64">
	//   27   57:iconst_3        
	//   28   58:getstatic       #57  <Field zzxx zzxx.zzcef>
	//   29   61:iconst_0        
	//   30   62:invokespecial   #43  <Method void zzxs(String, int, zzxx, int)>
	//   31   65:putstatic       #63  <Field zzxs zzcdm>
		zzcdn = new zzxs("INT32", 4, zzxx.zzcee, 0);
	//   32   68:new             #2   <Class zzxs>
	//   33   71:dup             
	//   34   72:ldc1            #65  <String "INT32">
	//   35   74:iconst_4        
	//   36   75:getstatic       #68  <Field zzxx zzxx.zzcee>
	//   37   78:iconst_0        
	//   38   79:invokespecial   #43  <Method void zzxs(String, int, zzxx, int)>
	//   39   82:putstatic       #70  <Field zzxs zzcdn>
		zzcdo = new zzxs("FIXED64", 5, zzxx.zzcef, 1);
	//   40   85:new             #2   <Class zzxs>
	//   41   88:dup             
	//   42   89:ldc1            #72  <String "FIXED64">
	//   43   91:iconst_5        
	//   44   92:getstatic       #57  <Field zzxx zzxx.zzcef>
	//   45   95:iconst_1        
	//   46   96:invokespecial   #43  <Method void zzxs(String, int, zzxx, int)>
	//   47   99:putstatic       #74  <Field zzxs zzcdo>
		zzcdp = new zzxs("FIXED32", 6, zzxx.zzcee, 5);
	//   48  102:new             #2   <Class zzxs>
	//   49  105:dup             
	//   50  106:ldc1            #76  <String "FIXED32">
	//   51  108:bipush          6
	//   52  110:getstatic       #68  <Field zzxx zzxx.zzcee>
	//   53  113:iconst_5        
	//   54  114:invokespecial   #43  <Method void zzxs(String, int, zzxx, int)>
	//   55  117:putstatic       #78  <Field zzxs zzcdp>
		zzcdq = new zzxs("BOOL", 7, zzxx.zzcei, 0);
	//   56  120:new             #2   <Class zzxs>
	//   57  123:dup             
	//   58  124:ldc1            #80  <String "BOOL">
	//   59  126:bipush          7
	//   60  128:getstatic       #83  <Field zzxx zzxx.zzcei>
	//   61  131:iconst_0        
	//   62  132:invokespecial   #43  <Method void zzxs(String, int, zzxx, int)>
	//   63  135:putstatic       #85  <Field zzxs zzcdq>
		zzcdr = ((zzxs) (new zzxt("STRING", 8, zzxx.zzcej, 2)));
	//   64  138:new             #87  <Class zzxt>
	//   65  141:dup             
	//   66  142:ldc1            #89  <String "STRING">
	//   67  144:bipush          8
	//   68  146:getstatic       #92  <Field zzxx zzxx.zzcej>
	//   69  149:iconst_2        
	//   70  150:invokespecial   #93  <Method void zzxt(String, int, zzxx, int)>
	//   71  153:putstatic       #95  <Field zzxs zzcdr>
		zzcds = ((zzxs) (new zzxu("GROUP", 9, zzxx.zzcem, 3)));
	//   72  156:new             #97  <Class zzxu>
	//   73  159:dup             
	//   74  160:ldc1            #99  <String "GROUP">
	//   75  162:bipush          9
	//   76  164:getstatic       #102 <Field zzxx zzxx.zzcem>
	//   77  167:iconst_3        
	//   78  168:invokespecial   #103 <Method void zzxu(String, int, zzxx, int)>
	//   79  171:putstatic       #105 <Field zzxs zzcds>
		zzcdt = ((zzxs) (new zzxv("MESSAGE", 10, zzxx.zzcem, 2)));
	//   80  174:new             #107 <Class zzxv>
	//   81  177:dup             
	//   82  178:ldc1            #109 <String "MESSAGE">
	//   83  180:bipush          10
	//   84  182:getstatic       #102 <Field zzxx zzxx.zzcem>
	//   85  185:iconst_2        
	//   86  186:invokespecial   #110 <Method void zzxv(String, int, zzxx, int)>
	//   87  189:putstatic       #112 <Field zzxs zzcdt>
		zzcdu = ((zzxs) (new zzxw("BYTES", 11, zzxx.zzcek, 2)));
	//   88  192:new             #114 <Class zzxw>
	//   89  195:dup             
	//   90  196:ldc1            #116 <String "BYTES">
	//   91  198:bipush          11
	//   92  200:getstatic       #119 <Field zzxx zzxx.zzcek>
	//   93  203:iconst_2        
	//   94  204:invokespecial   #120 <Method void zzxw(String, int, zzxx, int)>
	//   95  207:putstatic       #122 <Field zzxs zzcdu>
		zzcdv = new zzxs("UINT32", 12, zzxx.zzcee, 0);
	//   96  210:new             #2   <Class zzxs>
	//   97  213:dup             
	//   98  214:ldc1            #124 <String "UINT32">
	//   99  216:bipush          12
	//  100  218:getstatic       #68  <Field zzxx zzxx.zzcee>
	//  101  221:iconst_0        
	//  102  222:invokespecial   #43  <Method void zzxs(String, int, zzxx, int)>
	//  103  225:putstatic       #126 <Field zzxs zzcdv>
		zzcdw = new zzxs("ENUM", 13, zzxx.zzcel, 0);
	//  104  228:new             #2   <Class zzxs>
	//  105  231:dup             
	//  106  232:ldc1            #128 <String "ENUM">
	//  107  234:bipush          13
	//  108  236:getstatic       #131 <Field zzxx zzxx.zzcel>
	//  109  239:iconst_0        
	//  110  240:invokespecial   #43  <Method void zzxs(String, int, zzxx, int)>
	//  111  243:putstatic       #133 <Field zzxs zzcdw>
		zzcdx = new zzxs("SFIXED32", 14, zzxx.zzcee, 5);
	//  112  246:new             #2   <Class zzxs>
	//  113  249:dup             
	//  114  250:ldc1            #135 <String "SFIXED32">
	//  115  252:bipush          14
	//  116  254:getstatic       #68  <Field zzxx zzxx.zzcee>
	//  117  257:iconst_5        
	//  118  258:invokespecial   #43  <Method void zzxs(String, int, zzxx, int)>
	//  119  261:putstatic       #137 <Field zzxs zzcdx>
		zzcdy = new zzxs("SFIXED64", 15, zzxx.zzcef, 1);
	//  120  264:new             #2   <Class zzxs>
	//  121  267:dup             
	//  122  268:ldc1            #139 <String "SFIXED64">
	//  123  270:bipush          15
	//  124  272:getstatic       #57  <Field zzxx zzxx.zzcef>
	//  125  275:iconst_1        
	//  126  276:invokespecial   #43  <Method void zzxs(String, int, zzxx, int)>
	//  127  279:putstatic       #141 <Field zzxs zzcdy>
		zzcdz = new zzxs("SINT32", 16, zzxx.zzcee, 0);
	//  128  282:new             #2   <Class zzxs>
	//  129  285:dup             
	//  130  286:ldc1            #143 <String "SINT32">
	//  131  288:bipush          16
	//  132  290:getstatic       #68  <Field zzxx zzxx.zzcee>
	//  133  293:iconst_0        
	//  134  294:invokespecial   #43  <Method void zzxs(String, int, zzxx, int)>
	//  135  297:putstatic       #145 <Field zzxs zzcdz>
		zzcea = new zzxs("SINT64", 17, zzxx.zzcef, 0);
	//  136  300:new             #2   <Class zzxs>
	//  137  303:dup             
	//  138  304:ldc1            #147 <String "SINT64">
	//  139  306:bipush          17
	//  140  308:getstatic       #57  <Field zzxx zzxx.zzcef>
	//  141  311:iconst_0        
	//  142  312:invokespecial   #43  <Method void zzxs(String, int, zzxx, int)>
	//  143  315:putstatic       #149 <Field zzxs zzcea>
		zzced = (new zzxs[] {
			zzcdj, zzcdk, zzcdl, zzcdm, zzcdn, zzcdo, zzcdp, zzcdq, zzcdr, zzcds, 
			zzcdt, zzcdu, zzcdv, zzcdw, zzcdx, zzcdy, zzcdz, zzcea
		});
	//  144  318:bipush          18
	//  145  320:anewarray       zzxs[]
	//  146  323:dup             
	//  147  324:iconst_0        
	//  148  325:getstatic       #45  <Field zzxs zzcdj>
	//  149  328:aastore         
	//  150  329:dup             
	//  151  330:iconst_1        
	//  152  331:getstatic       #52  <Field zzxs zzcdk>
	//  153  334:aastore         
	//  154  335:dup             
	//  155  336:iconst_2        
	//  156  337:getstatic       #59  <Field zzxs zzcdl>
	//  157  340:aastore         
	//  158  341:dup             
	//  159  342:iconst_3        
	//  160  343:getstatic       #63  <Field zzxs zzcdm>
	//  161  346:aastore         
	//  162  347:dup             
	//  163  348:iconst_4        
	//  164  349:getstatic       #70  <Field zzxs zzcdn>
	//  165  352:aastore         
	//  166  353:dup             
	//  167  354:iconst_5        
	//  168  355:getstatic       #74  <Field zzxs zzcdo>
	//  169  358:aastore         
	//  170  359:dup             
	//  171  360:bipush          6
	//  172  362:getstatic       #78  <Field zzxs zzcdp>
	//  173  365:aastore         
	//  174  366:dup             
	//  175  367:bipush          7
	//  176  369:getstatic       #85  <Field zzxs zzcdq>
	//  177  372:aastore         
	//  178  373:dup             
	//  179  374:bipush          8
	//  180  376:getstatic       #95  <Field zzxs zzcdr>
	//  181  379:aastore         
	//  182  380:dup             
	//  183  381:bipush          9
	//  184  383:getstatic       #105 <Field zzxs zzcds>
	//  185  386:aastore         
	//  186  387:dup             
	//  187  388:bipush          10
	//  188  390:getstatic       #112 <Field zzxs zzcdt>
	//  189  393:aastore         
	//  190  394:dup             
	//  191  395:bipush          11
	//  192  397:getstatic       #122 <Field zzxs zzcdu>
	//  193  400:aastore         
	//  194  401:dup             
	//  195  402:bipush          12
	//  196  404:getstatic       #126 <Field zzxs zzcdv>
	//  197  407:aastore         
	//  198  408:dup             
	//  199  409:bipush          13
	//  200  411:getstatic       #133 <Field zzxs zzcdw>
	//  201  414:aastore         
	//  202  415:dup             
	//  203  416:bipush          14
	//  204  418:getstatic       #137 <Field zzxs zzcdx>
	//  205  421:aastore         
	//  206  422:dup             
	//  207  423:bipush          15
	//  208  425:getstatic       #141 <Field zzxs zzcdy>
	//  209  428:aastore         
	//  210  429:dup             
	//  211  430:bipush          16
	//  212  432:getstatic       #145 <Field zzxs zzcdz>
	//  213  435:aastore         
	//  214  436:dup             
	//  215  437:bipush          17
	//  216  439:getstatic       #149 <Field zzxs zzcea>
	//  217  442:aastore         
	//  218  443:putstatic       #151 <Field zzxs[] zzced>
	//* 219  446:return          
	}
}
