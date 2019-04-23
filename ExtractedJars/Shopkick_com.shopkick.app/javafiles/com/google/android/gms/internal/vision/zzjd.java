// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.vision;


// Referenced classes of package com.google.android.gms.internal.vision:
//			zzji, zzje, zzjf, zzjg, 
//			zzjh, zzjc

public class zzjd extends Enum
{

	private zzjd(String s, int i, zzji zzji1, int j)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #155 <Method void Enum(String, int)>
		zzacm = zzji1;
	//    4    6:aload_0         
	//    5    7:aload_3         
	//    6    8:putfield        #157 <Field zzji zzacm>
		zzacn = j;
	//    7   11:aload_0         
	//    8   12:iload           4
	//    9   14:putfield        #159 <Field int zzacn>
	//   10   17:return          
	}

	zzjd(String s, int i, zzji zzji1, int j, zzjc zzjc)
	{
		this(s, i, zzji1, j);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:aload_3         
	//    4    4:iload           4
	//    5    6:invokespecial   #43  <Method void zzjd(String, int, zzji, int)>
	//    6    9:return          
	}

	public static zzjd[] values()
	{
		return (zzjd[])((zzjd []) (zzaco)).clone();
	//    0    0:getstatic       #151 <Field zzjd[] zzaco>
	//    1    3:invokevirtual   #169 <Method Object _5B_Lcom.google.android.gms.internal.vision.zzjd_3B_.clone()>
	//    2    6:checkcast       #165 <Class zzjd[]>
	//    3    9:areturn         
	}

	public final zzji zzho()
	{
		return zzacm;
	//    0    0:aload_0         
	//    1    1:getfield        #157 <Field zzji zzacm>
	//    2    4:areturn         
	}

	public final int zzhp()
	{
		return zzacn;
	//    0    0:aload_0         
	//    1    1:getfield        #159 <Field int zzacn>
	//    2    4:ireturn         
	}

	public static final zzjd zzabu;
	public static final zzjd zzabv;
	public static final zzjd zzabw;
	public static final zzjd zzabx;
	public static final zzjd zzaby;
	public static final zzjd zzabz;
	public static final zzjd zzaca;
	public static final zzjd zzacb;
	public static final zzjd zzacc;
	public static final zzjd zzacd;
	public static final zzjd zzace;
	public static final zzjd zzacf;
	public static final zzjd zzacg;
	public static final zzjd zzach;
	public static final zzjd zzaci;
	public static final zzjd zzacj;
	public static final zzjd zzack;
	public static final zzjd zzacl;
	private static final zzjd zzaco[];
	private final zzji zzacm;
	private final int zzacn;

	static 
	{
		zzabu = new zzjd("DOUBLE", 0, zzji.zzacs, 1);
	//    0    0:new             #2   <Class zzjd>
	//    1    3:dup             
	//    2    4:ldc1            #34  <String "DOUBLE">
	//    3    6:iconst_0        
	//    4    7:getstatic       #39  <Field zzji zzji.zzacs>
	//    5   10:iconst_1        
	//    6   11:invokespecial   #43  <Method void zzjd(String, int, zzji, int)>
	//    7   14:putstatic       #45  <Field zzjd zzabu>
		zzabv = new zzjd("FLOAT", 1, zzji.zzacr, 5);
	//    8   17:new             #2   <Class zzjd>
	//    9   20:dup             
	//   10   21:ldc1            #47  <String "FLOAT">
	//   11   23:iconst_1        
	//   12   24:getstatic       #50  <Field zzji zzji.zzacr>
	//   13   27:iconst_5        
	//   14   28:invokespecial   #43  <Method void zzjd(String, int, zzji, int)>
	//   15   31:putstatic       #52  <Field zzjd zzabv>
		zzabw = new zzjd("INT64", 2, zzji.zzacq, 0);
	//   16   34:new             #2   <Class zzjd>
	//   17   37:dup             
	//   18   38:ldc1            #54  <String "INT64">
	//   19   40:iconst_2        
	//   20   41:getstatic       #57  <Field zzji zzji.zzacq>
	//   21   44:iconst_0        
	//   22   45:invokespecial   #43  <Method void zzjd(String, int, zzji, int)>
	//   23   48:putstatic       #59  <Field zzjd zzabw>
		zzabx = new zzjd("UINT64", 3, zzji.zzacq, 0);
	//   24   51:new             #2   <Class zzjd>
	//   25   54:dup             
	//   26   55:ldc1            #61  <String "UINT64">
	//   27   57:iconst_3        
	//   28   58:getstatic       #57  <Field zzji zzji.zzacq>
	//   29   61:iconst_0        
	//   30   62:invokespecial   #43  <Method void zzjd(String, int, zzji, int)>
	//   31   65:putstatic       #63  <Field zzjd zzabx>
		zzaby = new zzjd("INT32", 4, zzji.zzacp, 0);
	//   32   68:new             #2   <Class zzjd>
	//   33   71:dup             
	//   34   72:ldc1            #65  <String "INT32">
	//   35   74:iconst_4        
	//   36   75:getstatic       #68  <Field zzji zzji.zzacp>
	//   37   78:iconst_0        
	//   38   79:invokespecial   #43  <Method void zzjd(String, int, zzji, int)>
	//   39   82:putstatic       #70  <Field zzjd zzaby>
		zzabz = new zzjd("FIXED64", 5, zzji.zzacq, 1);
	//   40   85:new             #2   <Class zzjd>
	//   41   88:dup             
	//   42   89:ldc1            #72  <String "FIXED64">
	//   43   91:iconst_5        
	//   44   92:getstatic       #57  <Field zzji zzji.zzacq>
	//   45   95:iconst_1        
	//   46   96:invokespecial   #43  <Method void zzjd(String, int, zzji, int)>
	//   47   99:putstatic       #74  <Field zzjd zzabz>
		zzaca = new zzjd("FIXED32", 6, zzji.zzacp, 5);
	//   48  102:new             #2   <Class zzjd>
	//   49  105:dup             
	//   50  106:ldc1            #76  <String "FIXED32">
	//   51  108:bipush          6
	//   52  110:getstatic       #68  <Field zzji zzji.zzacp>
	//   53  113:iconst_5        
	//   54  114:invokespecial   #43  <Method void zzjd(String, int, zzji, int)>
	//   55  117:putstatic       #78  <Field zzjd zzaca>
		zzacb = new zzjd("BOOL", 7, zzji.zzact, 0);
	//   56  120:new             #2   <Class zzjd>
	//   57  123:dup             
	//   58  124:ldc1            #80  <String "BOOL">
	//   59  126:bipush          7
	//   60  128:getstatic       #83  <Field zzji zzji.zzact>
	//   61  131:iconst_0        
	//   62  132:invokespecial   #43  <Method void zzjd(String, int, zzji, int)>
	//   63  135:putstatic       #85  <Field zzjd zzacb>
		zzacc = ((zzjd) (new zzje("STRING", 8, zzji.zzacu, 2)));
	//   64  138:new             #87  <Class zzje>
	//   65  141:dup             
	//   66  142:ldc1            #89  <String "STRING">
	//   67  144:bipush          8
	//   68  146:getstatic       #92  <Field zzji zzji.zzacu>
	//   69  149:iconst_2        
	//   70  150:invokespecial   #93  <Method void zzje(String, int, zzji, int)>
	//   71  153:putstatic       #95  <Field zzjd zzacc>
		zzacd = ((zzjd) (new zzjf("GROUP", 9, zzji.zzacx, 3)));
	//   72  156:new             #97  <Class zzjf>
	//   73  159:dup             
	//   74  160:ldc1            #99  <String "GROUP">
	//   75  162:bipush          9
	//   76  164:getstatic       #102 <Field zzji zzji.zzacx>
	//   77  167:iconst_3        
	//   78  168:invokespecial   #103 <Method void zzjf(String, int, zzji, int)>
	//   79  171:putstatic       #105 <Field zzjd zzacd>
		zzace = ((zzjd) (new zzjg("MESSAGE", 10, zzji.zzacx, 2)));
	//   80  174:new             #107 <Class zzjg>
	//   81  177:dup             
	//   82  178:ldc1            #109 <String "MESSAGE">
	//   83  180:bipush          10
	//   84  182:getstatic       #102 <Field zzji zzji.zzacx>
	//   85  185:iconst_2        
	//   86  186:invokespecial   #110 <Method void zzjg(String, int, zzji, int)>
	//   87  189:putstatic       #112 <Field zzjd zzace>
		zzacf = ((zzjd) (new zzjh("BYTES", 11, zzji.zzacv, 2)));
	//   88  192:new             #114 <Class zzjh>
	//   89  195:dup             
	//   90  196:ldc1            #116 <String "BYTES">
	//   91  198:bipush          11
	//   92  200:getstatic       #119 <Field zzji zzji.zzacv>
	//   93  203:iconst_2        
	//   94  204:invokespecial   #120 <Method void zzjh(String, int, zzji, int)>
	//   95  207:putstatic       #122 <Field zzjd zzacf>
		zzacg = new zzjd("UINT32", 12, zzji.zzacp, 0);
	//   96  210:new             #2   <Class zzjd>
	//   97  213:dup             
	//   98  214:ldc1            #124 <String "UINT32">
	//   99  216:bipush          12
	//  100  218:getstatic       #68  <Field zzji zzji.zzacp>
	//  101  221:iconst_0        
	//  102  222:invokespecial   #43  <Method void zzjd(String, int, zzji, int)>
	//  103  225:putstatic       #126 <Field zzjd zzacg>
		zzach = new zzjd("ENUM", 13, zzji.zzacw, 0);
	//  104  228:new             #2   <Class zzjd>
	//  105  231:dup             
	//  106  232:ldc1            #128 <String "ENUM">
	//  107  234:bipush          13
	//  108  236:getstatic       #131 <Field zzji zzji.zzacw>
	//  109  239:iconst_0        
	//  110  240:invokespecial   #43  <Method void zzjd(String, int, zzji, int)>
	//  111  243:putstatic       #133 <Field zzjd zzach>
		zzaci = new zzjd("SFIXED32", 14, zzji.zzacp, 5);
	//  112  246:new             #2   <Class zzjd>
	//  113  249:dup             
	//  114  250:ldc1            #135 <String "SFIXED32">
	//  115  252:bipush          14
	//  116  254:getstatic       #68  <Field zzji zzji.zzacp>
	//  117  257:iconst_5        
	//  118  258:invokespecial   #43  <Method void zzjd(String, int, zzji, int)>
	//  119  261:putstatic       #137 <Field zzjd zzaci>
		zzacj = new zzjd("SFIXED64", 15, zzji.zzacq, 1);
	//  120  264:new             #2   <Class zzjd>
	//  121  267:dup             
	//  122  268:ldc1            #139 <String "SFIXED64">
	//  123  270:bipush          15
	//  124  272:getstatic       #57  <Field zzji zzji.zzacq>
	//  125  275:iconst_1        
	//  126  276:invokespecial   #43  <Method void zzjd(String, int, zzji, int)>
	//  127  279:putstatic       #141 <Field zzjd zzacj>
		zzack = new zzjd("SINT32", 16, zzji.zzacp, 0);
	//  128  282:new             #2   <Class zzjd>
	//  129  285:dup             
	//  130  286:ldc1            #143 <String "SINT32">
	//  131  288:bipush          16
	//  132  290:getstatic       #68  <Field zzji zzji.zzacp>
	//  133  293:iconst_0        
	//  134  294:invokespecial   #43  <Method void zzjd(String, int, zzji, int)>
	//  135  297:putstatic       #145 <Field zzjd zzack>
		zzacl = new zzjd("SINT64", 17, zzji.zzacq, 0);
	//  136  300:new             #2   <Class zzjd>
	//  137  303:dup             
	//  138  304:ldc1            #147 <String "SINT64">
	//  139  306:bipush          17
	//  140  308:getstatic       #57  <Field zzji zzji.zzacq>
	//  141  311:iconst_0        
	//  142  312:invokespecial   #43  <Method void zzjd(String, int, zzji, int)>
	//  143  315:putstatic       #149 <Field zzjd zzacl>
		zzaco = (new zzjd[] {
			zzabu, zzabv, zzabw, zzabx, zzaby, zzabz, zzaca, zzacb, zzacc, zzacd, 
			zzace, zzacf, zzacg, zzach, zzaci, zzacj, zzack, zzacl
		});
	//  144  318:bipush          18
	//  145  320:anewarray       zzjd[]
	//  146  323:dup             
	//  147  324:iconst_0        
	//  148  325:getstatic       #45  <Field zzjd zzabu>
	//  149  328:aastore         
	//  150  329:dup             
	//  151  330:iconst_1        
	//  152  331:getstatic       #52  <Field zzjd zzabv>
	//  153  334:aastore         
	//  154  335:dup             
	//  155  336:iconst_2        
	//  156  337:getstatic       #59  <Field zzjd zzabw>
	//  157  340:aastore         
	//  158  341:dup             
	//  159  342:iconst_3        
	//  160  343:getstatic       #63  <Field zzjd zzabx>
	//  161  346:aastore         
	//  162  347:dup             
	//  163  348:iconst_4        
	//  164  349:getstatic       #70  <Field zzjd zzaby>
	//  165  352:aastore         
	//  166  353:dup             
	//  167  354:iconst_5        
	//  168  355:getstatic       #74  <Field zzjd zzabz>
	//  169  358:aastore         
	//  170  359:dup             
	//  171  360:bipush          6
	//  172  362:getstatic       #78  <Field zzjd zzaca>
	//  173  365:aastore         
	//  174  366:dup             
	//  175  367:bipush          7
	//  176  369:getstatic       #85  <Field zzjd zzacb>
	//  177  372:aastore         
	//  178  373:dup             
	//  179  374:bipush          8
	//  180  376:getstatic       #95  <Field zzjd zzacc>
	//  181  379:aastore         
	//  182  380:dup             
	//  183  381:bipush          9
	//  184  383:getstatic       #105 <Field zzjd zzacd>
	//  185  386:aastore         
	//  186  387:dup             
	//  187  388:bipush          10
	//  188  390:getstatic       #112 <Field zzjd zzace>
	//  189  393:aastore         
	//  190  394:dup             
	//  191  395:bipush          11
	//  192  397:getstatic       #122 <Field zzjd zzacf>
	//  193  400:aastore         
	//  194  401:dup             
	//  195  402:bipush          12
	//  196  404:getstatic       #126 <Field zzjd zzacg>
	//  197  407:aastore         
	//  198  408:dup             
	//  199  409:bipush          13
	//  200  411:getstatic       #133 <Field zzjd zzach>
	//  201  414:aastore         
	//  202  415:dup             
	//  203  416:bipush          14
	//  204  418:getstatic       #137 <Field zzjd zzaci>
	//  205  421:aastore         
	//  206  422:dup             
	//  207  423:bipush          15
	//  208  425:getstatic       #141 <Field zzjd zzacj>
	//  209  428:aastore         
	//  210  429:dup             
	//  211  430:bipush          16
	//  212  432:getstatic       #145 <Field zzjd zzack>
	//  213  435:aastore         
	//  214  436:dup             
	//  215  437:bipush          17
	//  216  439:getstatic       #149 <Field zzjd zzacl>
	//  217  442:aastore         
	//  218  443:putstatic       #151 <Field zzjd[] zzaco>
	//* 219  446:return          
	}
}
