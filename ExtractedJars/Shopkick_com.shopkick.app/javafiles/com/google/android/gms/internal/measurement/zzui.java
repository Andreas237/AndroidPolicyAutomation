// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.measurement;

import java.lang.reflect.Type;

// Referenced classes of package com.google.android.gms.internal.measurement:
//			zzuk, zzux, zzuj

public final class zzui extends Enum
{

	private zzui(String s, int i, int j, zzuk zzuk1, zzux zzux1)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #347 <Method void Enum(String, int)>
		id = j;
	//    4    6:aload_0         
	//    5    7:iload_3         
	//    6    8:putfield        #343 <Field int id>
		zzbxl = zzuk1;
	//    7   11:aload_0         
	//    8   12:aload           4
	//    9   14:putfield        #349 <Field zzuk zzbxl>
		zzbxk = zzux1;
	//   10   17:aload_0         
	//   11   18:aload           5
	//   12   20:putfield        #351 <Field zzux zzbxk>
		switch(zzuj.zzbxr[zzuk1.ordinal()])
	//*  13   23:getstatic       #357 <Field int[] zzuj.zzbxr>
	//*  14   26:aload           4
	//*  15   28:invokevirtual   #361 <Method int zzuk.ordinal()>
	//*  16   31:iaload          
		{
	//*  17   32:tableswitch     1 2: default 56
	//	               1 76
	//	               2 64
		default:
			zzbxm = null;
	//   18   56:aload_0         
	//   19   57:aconst_null     
	//   20   58:putfield        #363 <Field Class zzbxm>
			break;

	//*  21   61:goto            85
		case 2: // '\002'
			zzbxm = zzux1.zzwy();
	//   22   64:aload_0         
	//   23   65:aload           5
	//   24   67:invokevirtual   #367 <Method Class zzux.zzwy()>
	//   25   70:putfield        #363 <Field Class zzbxm>
			break;

	//*  26   73:goto            85
		case 1: // '\001'
			zzbxm = zzux1.zzwy();
	//   27   76:aload_0         
	//   28   77:aload           5
	//   29   79:invokevirtual   #367 <Method Class zzux.zzwy()>
	//   30   82:putfield        #363 <Field Class zzbxm>
			break;
		}
		boolean flag1 = false;
	//   31   85:iconst_0        
	//   32   86:istore          7
		boolean flag = flag1;
	//   33   88:iload           7
	//   34   90:istore          6
		if(zzuk1 == zzuk.zzbxt)
	//*  35   92:aload           4
	//*  36   94:getstatic       #82  <Field zzuk zzuk.zzbxt>
	//*  37   97:if_acmpne       143
		{
			flag = flag1;
	//   38  100:iload           7
	//   39  102:istore          6
			switch(zzuj.zzbxs[zzux1.ordinal()])
	//*  40  104:getstatic       #370 <Field int[] zzuj.zzbxs>
	//*  41  107:aload           5
	//*  42  109:invokevirtual   #371 <Method int zzux.ordinal()>
	//*  43  112:iaload          
			{
	//*  44  113:tableswitch     1 3: default 140
	//	               1 143
	//	               2 143
	//	               3 143
			default:
				flag = true;
	//   45  140:iconst_1        
	//   46  141:istore          6
				break;

			case 1: // '\001'
			case 2: // '\002'
			case 3: // '\003'
				break;
			}
		}
		zzbxn = flag;
	//   47  143:aload_0         
	//   48  144:iload           6
	//   49  146:putfield        #373 <Field boolean zzbxn>
	//   50  149:return          
	}

	public static zzui[] values()
	{
		return (zzui[])((zzui []) (zzbxq)).clone();
	//    0    0:getstatic       #331 <Field zzui[] zzbxq>
	//    1    3:invokevirtual   #380 <Method Object _5B_Lcom.google.android.gms.internal.measurement.zzui_3B_.clone()>
	//    2    6:checkcast       #376 <Class zzui[]>
	//    3    9:areturn         
	}

	public final int id()
	{
		return id;
	//    0    0:aload_0         
	//    1    1:getfield        #343 <Field int id>
	//    2    4:ireturn         
	}

	private static final zzui zzbvl;
	private static final zzui zzbvm;
	private static final zzui zzbvn;
	private static final zzui zzbvo;
	private static final zzui zzbvp;
	private static final zzui zzbvq;
	private static final zzui zzbvr;
	private static final zzui zzbvs;
	private static final zzui zzbvt;
	private static final zzui zzbvu;
	private static final zzui zzbvv;
	private static final zzui zzbvw;
	private static final zzui zzbvx;
	private static final zzui zzbvy;
	private static final zzui zzbvz;
	private static final zzui zzbwa;
	private static final zzui zzbwb;
	private static final zzui zzbwc;
	private static final zzui zzbwd;
	private static final zzui zzbwe;
	private static final zzui zzbwf;
	private static final zzui zzbwg;
	private static final zzui zzbwh;
	private static final zzui zzbwi;
	private static final zzui zzbwj;
	private static final zzui zzbwk;
	private static final zzui zzbwl;
	private static final zzui zzbwm;
	private static final zzui zzbwn;
	private static final zzui zzbwo;
	private static final zzui zzbwp;
	private static final zzui zzbwq;
	private static final zzui zzbwr;
	private static final zzui zzbws;
	private static final zzui zzbwt;
	public static final zzui zzbwu;
	private static final zzui zzbwv;
	private static final zzui zzbww;
	private static final zzui zzbwx;
	private static final zzui zzbwy;
	private static final zzui zzbwz;
	private static final zzui zzbxa;
	private static final zzui zzbxb;
	private static final zzui zzbxc;
	private static final zzui zzbxd;
	private static final zzui zzbxe;
	private static final zzui zzbxf;
	private static final zzui zzbxg;
	public static final zzui zzbxh;
	private static final zzui zzbxi;
	private static final zzui zzbxj;
	private static final zzui zzbxo[];
	private static final Type zzbxp[] = new Type[0];
	private static final zzui zzbxq[];
	private final int id;
	private final zzux zzbxk;
	private final zzuk zzbxl;
	private final Class zzbxm;
	private final boolean zzbxn;

	static 
	{
		zzbvl = new zzui("DOUBLE", 0, 0, zzuk.zzbxt, zzux.zzbzi);
	//    0    0:new             #2   <Class zzui>
	//    1    3:dup             
	//    2    4:ldc1            #77  <String "DOUBLE">
	//    3    6:iconst_0        
	//    4    7:iconst_0        
	//    5    8:getstatic       #82  <Field zzuk zzuk.zzbxt>
	//    6   11:getstatic       #87  <Field zzux zzux.zzbzi>
	//    7   14:invokespecial   #91  <Method void zzui(String, int, int, zzuk, zzux)>
	//    8   17:putstatic       #93  <Field zzui zzbvl>
		zzbvm = new zzui("FLOAT", 1, 1, zzuk.zzbxt, zzux.zzbzh);
	//    9   20:new             #2   <Class zzui>
	//   10   23:dup             
	//   11   24:ldc1            #95  <String "FLOAT">
	//   12   26:iconst_1        
	//   13   27:iconst_1        
	//   14   28:getstatic       #82  <Field zzuk zzuk.zzbxt>
	//   15   31:getstatic       #98  <Field zzux zzux.zzbzh>
	//   16   34:invokespecial   #91  <Method void zzui(String, int, int, zzuk, zzux)>
	//   17   37:putstatic       #100 <Field zzui zzbvm>
		zzbvn = new zzui("INT64", 2, 2, zzuk.zzbxt, zzux.zzbzg);
	//   18   40:new             #2   <Class zzui>
	//   19   43:dup             
	//   20   44:ldc1            #102 <String "INT64">
	//   21   46:iconst_2        
	//   22   47:iconst_2        
	//   23   48:getstatic       #82  <Field zzuk zzuk.zzbxt>
	//   24   51:getstatic       #105 <Field zzux zzux.zzbzg>
	//   25   54:invokespecial   #91  <Method void zzui(String, int, int, zzuk, zzux)>
	//   26   57:putstatic       #107 <Field zzui zzbvn>
		zzbvo = new zzui("UINT64", 3, 3, zzuk.zzbxt, zzux.zzbzg);
	//   27   60:new             #2   <Class zzui>
	//   28   63:dup             
	//   29   64:ldc1            #109 <String "UINT64">
	//   30   66:iconst_3        
	//   31   67:iconst_3        
	//   32   68:getstatic       #82  <Field zzuk zzuk.zzbxt>
	//   33   71:getstatic       #105 <Field zzux zzux.zzbzg>
	//   34   74:invokespecial   #91  <Method void zzui(String, int, int, zzuk, zzux)>
	//   35   77:putstatic       #111 <Field zzui zzbvo>
		zzbvp = new zzui("INT32", 4, 4, zzuk.zzbxt, zzux.zzbzf);
	//   36   80:new             #2   <Class zzui>
	//   37   83:dup             
	//   38   84:ldc1            #113 <String "INT32">
	//   39   86:iconst_4        
	//   40   87:iconst_4        
	//   41   88:getstatic       #82  <Field zzuk zzuk.zzbxt>
	//   42   91:getstatic       #116 <Field zzux zzux.zzbzf>
	//   43   94:invokespecial   #91  <Method void zzui(String, int, int, zzuk, zzux)>
	//   44   97:putstatic       #118 <Field zzui zzbvp>
		zzbvq = new zzui("FIXED64", 5, 5, zzuk.zzbxt, zzux.zzbzg);
	//   45  100:new             #2   <Class zzui>
	//   46  103:dup             
	//   47  104:ldc1            #120 <String "FIXED64">
	//   48  106:iconst_5        
	//   49  107:iconst_5        
	//   50  108:getstatic       #82  <Field zzuk zzuk.zzbxt>
	//   51  111:getstatic       #105 <Field zzux zzux.zzbzg>
	//   52  114:invokespecial   #91  <Method void zzui(String, int, int, zzuk, zzux)>
	//   53  117:putstatic       #122 <Field zzui zzbvq>
		zzbvr = new zzui("FIXED32", 6, 6, zzuk.zzbxt, zzux.zzbzf);
	//   54  120:new             #2   <Class zzui>
	//   55  123:dup             
	//   56  124:ldc1            #124 <String "FIXED32">
	//   57  126:bipush          6
	//   58  128:bipush          6
	//   59  130:getstatic       #82  <Field zzuk zzuk.zzbxt>
	//   60  133:getstatic       #116 <Field zzux zzux.zzbzf>
	//   61  136:invokespecial   #91  <Method void zzui(String, int, int, zzuk, zzux)>
	//   62  139:putstatic       #126 <Field zzui zzbvr>
		zzbvs = new zzui("BOOL", 7, 7, zzuk.zzbxt, zzux.zzbzj);
	//   63  142:new             #2   <Class zzui>
	//   64  145:dup             
	//   65  146:ldc1            #128 <String "BOOL">
	//   66  148:bipush          7
	//   67  150:bipush          7
	//   68  152:getstatic       #82  <Field zzuk zzuk.zzbxt>
	//   69  155:getstatic       #131 <Field zzux zzux.zzbzj>
	//   70  158:invokespecial   #91  <Method void zzui(String, int, int, zzuk, zzux)>
	//   71  161:putstatic       #133 <Field zzui zzbvs>
		zzbvt = new zzui("STRING", 8, 8, zzuk.zzbxt, zzux.zzbzk);
	//   72  164:new             #2   <Class zzui>
	//   73  167:dup             
	//   74  168:ldc1            #135 <String "STRING">
	//   75  170:bipush          8
	//   76  172:bipush          8
	//   77  174:getstatic       #82  <Field zzuk zzuk.zzbxt>
	//   78  177:getstatic       #138 <Field zzux zzux.zzbzk>
	//   79  180:invokespecial   #91  <Method void zzui(String, int, int, zzuk, zzux)>
	//   80  183:putstatic       #140 <Field zzui zzbvt>
		zzbvu = new zzui("MESSAGE", 9, 9, zzuk.zzbxt, zzux.zzbzn);
	//   81  186:new             #2   <Class zzui>
	//   82  189:dup             
	//   83  190:ldc1            #142 <String "MESSAGE">
	//   84  192:bipush          9
	//   85  194:bipush          9
	//   86  196:getstatic       #82  <Field zzuk zzuk.zzbxt>
	//   87  199:getstatic       #145 <Field zzux zzux.zzbzn>
	//   88  202:invokespecial   #91  <Method void zzui(String, int, int, zzuk, zzux)>
	//   89  205:putstatic       #147 <Field zzui zzbvu>
		zzbvv = new zzui("BYTES", 10, 10, zzuk.zzbxt, zzux.zzbzl);
	//   90  208:new             #2   <Class zzui>
	//   91  211:dup             
	//   92  212:ldc1            #149 <String "BYTES">
	//   93  214:bipush          10
	//   94  216:bipush          10
	//   95  218:getstatic       #82  <Field zzuk zzuk.zzbxt>
	//   96  221:getstatic       #152 <Field zzux zzux.zzbzl>
	//   97  224:invokespecial   #91  <Method void zzui(String, int, int, zzuk, zzux)>
	//   98  227:putstatic       #154 <Field zzui zzbvv>
		zzbvw = new zzui("UINT32", 11, 11, zzuk.zzbxt, zzux.zzbzf);
	//   99  230:new             #2   <Class zzui>
	//  100  233:dup             
	//  101  234:ldc1            #156 <String "UINT32">
	//  102  236:bipush          11
	//  103  238:bipush          11
	//  104  240:getstatic       #82  <Field zzuk zzuk.zzbxt>
	//  105  243:getstatic       #116 <Field zzux zzux.zzbzf>
	//  106  246:invokespecial   #91  <Method void zzui(String, int, int, zzuk, zzux)>
	//  107  249:putstatic       #158 <Field zzui zzbvw>
		zzbvx = new zzui("ENUM", 12, 12, zzuk.zzbxt, zzux.zzbzm);
	//  108  252:new             #2   <Class zzui>
	//  109  255:dup             
	//  110  256:ldc1            #160 <String "ENUM">
	//  111  258:bipush          12
	//  112  260:bipush          12
	//  113  262:getstatic       #82  <Field zzuk zzuk.zzbxt>
	//  114  265:getstatic       #163 <Field zzux zzux.zzbzm>
	//  115  268:invokespecial   #91  <Method void zzui(String, int, int, zzuk, zzux)>
	//  116  271:putstatic       #165 <Field zzui zzbvx>
		zzbvy = new zzui("SFIXED32", 13, 13, zzuk.zzbxt, zzux.zzbzf);
	//  117  274:new             #2   <Class zzui>
	//  118  277:dup             
	//  119  278:ldc1            #167 <String "SFIXED32">
	//  120  280:bipush          13
	//  121  282:bipush          13
	//  122  284:getstatic       #82  <Field zzuk zzuk.zzbxt>
	//  123  287:getstatic       #116 <Field zzux zzux.zzbzf>
	//  124  290:invokespecial   #91  <Method void zzui(String, int, int, zzuk, zzux)>
	//  125  293:putstatic       #169 <Field zzui zzbvy>
		zzbvz = new zzui("SFIXED64", 14, 14, zzuk.zzbxt, zzux.zzbzg);
	//  126  296:new             #2   <Class zzui>
	//  127  299:dup             
	//  128  300:ldc1            #171 <String "SFIXED64">
	//  129  302:bipush          14
	//  130  304:bipush          14
	//  131  306:getstatic       #82  <Field zzuk zzuk.zzbxt>
	//  132  309:getstatic       #105 <Field zzux zzux.zzbzg>
	//  133  312:invokespecial   #91  <Method void zzui(String, int, int, zzuk, zzux)>
	//  134  315:putstatic       #173 <Field zzui zzbvz>
		zzbwa = new zzui("SINT32", 15, 15, zzuk.zzbxt, zzux.zzbzf);
	//  135  318:new             #2   <Class zzui>
	//  136  321:dup             
	//  137  322:ldc1            #175 <String "SINT32">
	//  138  324:bipush          15
	//  139  326:bipush          15
	//  140  328:getstatic       #82  <Field zzuk zzuk.zzbxt>
	//  141  331:getstatic       #116 <Field zzux zzux.zzbzf>
	//  142  334:invokespecial   #91  <Method void zzui(String, int, int, zzuk, zzux)>
	//  143  337:putstatic       #177 <Field zzui zzbwa>
		zzbwb = new zzui("SINT64", 16, 16, zzuk.zzbxt, zzux.zzbzg);
	//  144  340:new             #2   <Class zzui>
	//  145  343:dup             
	//  146  344:ldc1            #179 <String "SINT64">
	//  147  346:bipush          16
	//  148  348:bipush          16
	//  149  350:getstatic       #82  <Field zzuk zzuk.zzbxt>
	//  150  353:getstatic       #105 <Field zzux zzux.zzbzg>
	//  151  356:invokespecial   #91  <Method void zzui(String, int, int, zzuk, zzux)>
	//  152  359:putstatic       #181 <Field zzui zzbwb>
		zzbwc = new zzui("GROUP", 17, 17, zzuk.zzbxt, zzux.zzbzn);
	//  153  362:new             #2   <Class zzui>
	//  154  365:dup             
	//  155  366:ldc1            #183 <String "GROUP">
	//  156  368:bipush          17
	//  157  370:bipush          17
	//  158  372:getstatic       #82  <Field zzuk zzuk.zzbxt>
	//  159  375:getstatic       #145 <Field zzux zzux.zzbzn>
	//  160  378:invokespecial   #91  <Method void zzui(String, int, int, zzuk, zzux)>
	//  161  381:putstatic       #185 <Field zzui zzbwc>
		zzbwd = new zzui("DOUBLE_LIST", 18, 18, zzuk.zzbxu, zzux.zzbzi);
	//  162  384:new             #2   <Class zzui>
	//  163  387:dup             
	//  164  388:ldc1            #187 <String "DOUBLE_LIST">
	//  165  390:bipush          18
	//  166  392:bipush          18
	//  167  394:getstatic       #190 <Field zzuk zzuk.zzbxu>
	//  168  397:getstatic       #87  <Field zzux zzux.zzbzi>
	//  169  400:invokespecial   #91  <Method void zzui(String, int, int, zzuk, zzux)>
	//  170  403:putstatic       #192 <Field zzui zzbwd>
		zzbwe = new zzui("FLOAT_LIST", 19, 19, zzuk.zzbxu, zzux.zzbzh);
	//  171  406:new             #2   <Class zzui>
	//  172  409:dup             
	//  173  410:ldc1            #194 <String "FLOAT_LIST">
	//  174  412:bipush          19
	//  175  414:bipush          19
	//  176  416:getstatic       #190 <Field zzuk zzuk.zzbxu>
	//  177  419:getstatic       #98  <Field zzux zzux.zzbzh>
	//  178  422:invokespecial   #91  <Method void zzui(String, int, int, zzuk, zzux)>
	//  179  425:putstatic       #196 <Field zzui zzbwe>
		zzbwf = new zzui("INT64_LIST", 20, 20, zzuk.zzbxu, zzux.zzbzg);
	//  180  428:new             #2   <Class zzui>
	//  181  431:dup             
	//  182  432:ldc1            #198 <String "INT64_LIST">
	//  183  434:bipush          20
	//  184  436:bipush          20
	//  185  438:getstatic       #190 <Field zzuk zzuk.zzbxu>
	//  186  441:getstatic       #105 <Field zzux zzux.zzbzg>
	//  187  444:invokespecial   #91  <Method void zzui(String, int, int, zzuk, zzux)>
	//  188  447:putstatic       #200 <Field zzui zzbwf>
		zzbwg = new zzui("UINT64_LIST", 21, 21, zzuk.zzbxu, zzux.zzbzg);
	//  189  450:new             #2   <Class zzui>
	//  190  453:dup             
	//  191  454:ldc1            #202 <String "UINT64_LIST">
	//  192  456:bipush          21
	//  193  458:bipush          21
	//  194  460:getstatic       #190 <Field zzuk zzuk.zzbxu>
	//  195  463:getstatic       #105 <Field zzux zzux.zzbzg>
	//  196  466:invokespecial   #91  <Method void zzui(String, int, int, zzuk, zzux)>
	//  197  469:putstatic       #204 <Field zzui zzbwg>
		zzbwh = new zzui("INT32_LIST", 22, 22, zzuk.zzbxu, zzux.zzbzf);
	//  198  472:new             #2   <Class zzui>
	//  199  475:dup             
	//  200  476:ldc1            #206 <String "INT32_LIST">
	//  201  478:bipush          22
	//  202  480:bipush          22
	//  203  482:getstatic       #190 <Field zzuk zzuk.zzbxu>
	//  204  485:getstatic       #116 <Field zzux zzux.zzbzf>
	//  205  488:invokespecial   #91  <Method void zzui(String, int, int, zzuk, zzux)>
	//  206  491:putstatic       #208 <Field zzui zzbwh>
		zzbwi = new zzui("FIXED64_LIST", 23, 23, zzuk.zzbxu, zzux.zzbzg);
	//  207  494:new             #2   <Class zzui>
	//  208  497:dup             
	//  209  498:ldc1            #210 <String "FIXED64_LIST">
	//  210  500:bipush          23
	//  211  502:bipush          23
	//  212  504:getstatic       #190 <Field zzuk zzuk.zzbxu>
	//  213  507:getstatic       #105 <Field zzux zzux.zzbzg>
	//  214  510:invokespecial   #91  <Method void zzui(String, int, int, zzuk, zzux)>
	//  215  513:putstatic       #212 <Field zzui zzbwi>
		zzbwj = new zzui("FIXED32_LIST", 24, 24, zzuk.zzbxu, zzux.zzbzf);
	//  216  516:new             #2   <Class zzui>
	//  217  519:dup             
	//  218  520:ldc1            #214 <String "FIXED32_LIST">
	//  219  522:bipush          24
	//  220  524:bipush          24
	//  221  526:getstatic       #190 <Field zzuk zzuk.zzbxu>
	//  222  529:getstatic       #116 <Field zzux zzux.zzbzf>
	//  223  532:invokespecial   #91  <Method void zzui(String, int, int, zzuk, zzux)>
	//  224  535:putstatic       #216 <Field zzui zzbwj>
		zzbwk = new zzui("BOOL_LIST", 25, 25, zzuk.zzbxu, zzux.zzbzj);
	//  225  538:new             #2   <Class zzui>
	//  226  541:dup             
	//  227  542:ldc1            #218 <String "BOOL_LIST">
	//  228  544:bipush          25
	//  229  546:bipush          25
	//  230  548:getstatic       #190 <Field zzuk zzuk.zzbxu>
	//  231  551:getstatic       #131 <Field zzux zzux.zzbzj>
	//  232  554:invokespecial   #91  <Method void zzui(String, int, int, zzuk, zzux)>
	//  233  557:putstatic       #220 <Field zzui zzbwk>
		zzbwl = new zzui("STRING_LIST", 26, 26, zzuk.zzbxu, zzux.zzbzk);
	//  234  560:new             #2   <Class zzui>
	//  235  563:dup             
	//  236  564:ldc1            #222 <String "STRING_LIST">
	//  237  566:bipush          26
	//  238  568:bipush          26
	//  239  570:getstatic       #190 <Field zzuk zzuk.zzbxu>
	//  240  573:getstatic       #138 <Field zzux zzux.zzbzk>
	//  241  576:invokespecial   #91  <Method void zzui(String, int, int, zzuk, zzux)>
	//  242  579:putstatic       #224 <Field zzui zzbwl>
		zzbwm = new zzui("MESSAGE_LIST", 27, 27, zzuk.zzbxu, zzux.zzbzn);
	//  243  582:new             #2   <Class zzui>
	//  244  585:dup             
	//  245  586:ldc1            #226 <String "MESSAGE_LIST">
	//  246  588:bipush          27
	//  247  590:bipush          27
	//  248  592:getstatic       #190 <Field zzuk zzuk.zzbxu>
	//  249  595:getstatic       #145 <Field zzux zzux.zzbzn>
	//  250  598:invokespecial   #91  <Method void zzui(String, int, int, zzuk, zzux)>
	//  251  601:putstatic       #228 <Field zzui zzbwm>
		zzbwn = new zzui("BYTES_LIST", 28, 28, zzuk.zzbxu, zzux.zzbzl);
	//  252  604:new             #2   <Class zzui>
	//  253  607:dup             
	//  254  608:ldc1            #230 <String "BYTES_LIST">
	//  255  610:bipush          28
	//  256  612:bipush          28
	//  257  614:getstatic       #190 <Field zzuk zzuk.zzbxu>
	//  258  617:getstatic       #152 <Field zzux zzux.zzbzl>
	//  259  620:invokespecial   #91  <Method void zzui(String, int, int, zzuk, zzux)>
	//  260  623:putstatic       #232 <Field zzui zzbwn>
		zzbwo = new zzui("UINT32_LIST", 29, 29, zzuk.zzbxu, zzux.zzbzf);
	//  261  626:new             #2   <Class zzui>
	//  262  629:dup             
	//  263  630:ldc1            #234 <String "UINT32_LIST">
	//  264  632:bipush          29
	//  265  634:bipush          29
	//  266  636:getstatic       #190 <Field zzuk zzuk.zzbxu>
	//  267  639:getstatic       #116 <Field zzux zzux.zzbzf>
	//  268  642:invokespecial   #91  <Method void zzui(String, int, int, zzuk, zzux)>
	//  269  645:putstatic       #236 <Field zzui zzbwo>
		zzbwp = new zzui("ENUM_LIST", 30, 30, zzuk.zzbxu, zzux.zzbzm);
	//  270  648:new             #2   <Class zzui>
	//  271  651:dup             
	//  272  652:ldc1            #238 <String "ENUM_LIST">
	//  273  654:bipush          30
	//  274  656:bipush          30
	//  275  658:getstatic       #190 <Field zzuk zzuk.zzbxu>
	//  276  661:getstatic       #163 <Field zzux zzux.zzbzm>
	//  277  664:invokespecial   #91  <Method void zzui(String, int, int, zzuk, zzux)>
	//  278  667:putstatic       #240 <Field zzui zzbwp>
		zzbwq = new zzui("SFIXED32_LIST", 31, 31, zzuk.zzbxu, zzux.zzbzf);
	//  279  670:new             #2   <Class zzui>
	//  280  673:dup             
	//  281  674:ldc1            #242 <String "SFIXED32_LIST">
	//  282  676:bipush          31
	//  283  678:bipush          31
	//  284  680:getstatic       #190 <Field zzuk zzuk.zzbxu>
	//  285  683:getstatic       #116 <Field zzux zzux.zzbzf>
	//  286  686:invokespecial   #91  <Method void zzui(String, int, int, zzuk, zzux)>
	//  287  689:putstatic       #244 <Field zzui zzbwq>
		zzbwr = new zzui("SFIXED64_LIST", 32, 32, zzuk.zzbxu, zzux.zzbzg);
	//  288  692:new             #2   <Class zzui>
	//  289  695:dup             
	//  290  696:ldc1            #246 <String "SFIXED64_LIST">
	//  291  698:bipush          32
	//  292  700:bipush          32
	//  293  702:getstatic       #190 <Field zzuk zzuk.zzbxu>
	//  294  705:getstatic       #105 <Field zzux zzux.zzbzg>
	//  295  708:invokespecial   #91  <Method void zzui(String, int, int, zzuk, zzux)>
	//  296  711:putstatic       #248 <Field zzui zzbwr>
		zzbws = new zzui("SINT32_LIST", 33, 33, zzuk.zzbxu, zzux.zzbzf);
	//  297  714:new             #2   <Class zzui>
	//  298  717:dup             
	//  299  718:ldc1            #250 <String "SINT32_LIST">
	//  300  720:bipush          33
	//  301  722:bipush          33
	//  302  724:getstatic       #190 <Field zzuk zzuk.zzbxu>
	//  303  727:getstatic       #116 <Field zzux zzux.zzbzf>
	//  304  730:invokespecial   #91  <Method void zzui(String, int, int, zzuk, zzux)>
	//  305  733:putstatic       #252 <Field zzui zzbws>
		zzbwt = new zzui("SINT64_LIST", 34, 34, zzuk.zzbxu, zzux.zzbzg);
	//  306  736:new             #2   <Class zzui>
	//  307  739:dup             
	//  308  740:ldc1            #254 <String "SINT64_LIST">
	//  309  742:bipush          34
	//  310  744:bipush          34
	//  311  746:getstatic       #190 <Field zzuk zzuk.zzbxu>
	//  312  749:getstatic       #105 <Field zzux zzux.zzbzg>
	//  313  752:invokespecial   #91  <Method void zzui(String, int, int, zzuk, zzux)>
	//  314  755:putstatic       #256 <Field zzui zzbwt>
		zzbwu = new zzui("DOUBLE_LIST_PACKED", 35, 35, zzuk.zzbxv, zzux.zzbzi);
	//  315  758:new             #2   <Class zzui>
	//  316  761:dup             
	//  317  762:ldc2            #258 <String "DOUBLE_LIST_PACKED">
	//  318  765:bipush          35
	//  319  767:bipush          35
	//  320  769:getstatic       #261 <Field zzuk zzuk.zzbxv>
	//  321  772:getstatic       #87  <Field zzux zzux.zzbzi>
	//  322  775:invokespecial   #91  <Method void zzui(String, int, int, zzuk, zzux)>
	//  323  778:putstatic       #263 <Field zzui zzbwu>
		zzbwv = new zzui("FLOAT_LIST_PACKED", 36, 36, zzuk.zzbxv, zzux.zzbzh);
	//  324  781:new             #2   <Class zzui>
	//  325  784:dup             
	//  326  785:ldc2            #265 <String "FLOAT_LIST_PACKED">
	//  327  788:bipush          36
	//  328  790:bipush          36
	//  329  792:getstatic       #261 <Field zzuk zzuk.zzbxv>
	//  330  795:getstatic       #98  <Field zzux zzux.zzbzh>
	//  331  798:invokespecial   #91  <Method void zzui(String, int, int, zzuk, zzux)>
	//  332  801:putstatic       #267 <Field zzui zzbwv>
		zzbww = new zzui("INT64_LIST_PACKED", 37, 37, zzuk.zzbxv, zzux.zzbzg);
	//  333  804:new             #2   <Class zzui>
	//  334  807:dup             
	//  335  808:ldc2            #269 <String "INT64_LIST_PACKED">
	//  336  811:bipush          37
	//  337  813:bipush          37
	//  338  815:getstatic       #261 <Field zzuk zzuk.zzbxv>
	//  339  818:getstatic       #105 <Field zzux zzux.zzbzg>
	//  340  821:invokespecial   #91  <Method void zzui(String, int, int, zzuk, zzux)>
	//  341  824:putstatic       #271 <Field zzui zzbww>
		zzbwx = new zzui("UINT64_LIST_PACKED", 38, 38, zzuk.zzbxv, zzux.zzbzg);
	//  342  827:new             #2   <Class zzui>
	//  343  830:dup             
	//  344  831:ldc2            #273 <String "UINT64_LIST_PACKED">
	//  345  834:bipush          38
	//  346  836:bipush          38
	//  347  838:getstatic       #261 <Field zzuk zzuk.zzbxv>
	//  348  841:getstatic       #105 <Field zzux zzux.zzbzg>
	//  349  844:invokespecial   #91  <Method void zzui(String, int, int, zzuk, zzux)>
	//  350  847:putstatic       #275 <Field zzui zzbwx>
		zzbwy = new zzui("INT32_LIST_PACKED", 39, 39, zzuk.zzbxv, zzux.zzbzf);
	//  351  850:new             #2   <Class zzui>
	//  352  853:dup             
	//  353  854:ldc2            #277 <String "INT32_LIST_PACKED">
	//  354  857:bipush          39
	//  355  859:bipush          39
	//  356  861:getstatic       #261 <Field zzuk zzuk.zzbxv>
	//  357  864:getstatic       #116 <Field zzux zzux.zzbzf>
	//  358  867:invokespecial   #91  <Method void zzui(String, int, int, zzuk, zzux)>
	//  359  870:putstatic       #279 <Field zzui zzbwy>
		zzbwz = new zzui("FIXED64_LIST_PACKED", 40, 40, zzuk.zzbxv, zzux.zzbzg);
	//  360  873:new             #2   <Class zzui>
	//  361  876:dup             
	//  362  877:ldc2            #281 <String "FIXED64_LIST_PACKED">
	//  363  880:bipush          40
	//  364  882:bipush          40
	//  365  884:getstatic       #261 <Field zzuk zzuk.zzbxv>
	//  366  887:getstatic       #105 <Field zzux zzux.zzbzg>
	//  367  890:invokespecial   #91  <Method void zzui(String, int, int, zzuk, zzux)>
	//  368  893:putstatic       #283 <Field zzui zzbwz>
		zzbxa = new zzui("FIXED32_LIST_PACKED", 41, 41, zzuk.zzbxv, zzux.zzbzf);
	//  369  896:new             #2   <Class zzui>
	//  370  899:dup             
	//  371  900:ldc2            #285 <String "FIXED32_LIST_PACKED">
	//  372  903:bipush          41
	//  373  905:bipush          41
	//  374  907:getstatic       #261 <Field zzuk zzuk.zzbxv>
	//  375  910:getstatic       #116 <Field zzux zzux.zzbzf>
	//  376  913:invokespecial   #91  <Method void zzui(String, int, int, zzuk, zzux)>
	//  377  916:putstatic       #287 <Field zzui zzbxa>
		zzbxb = new zzui("BOOL_LIST_PACKED", 42, 42, zzuk.zzbxv, zzux.zzbzj);
	//  378  919:new             #2   <Class zzui>
	//  379  922:dup             
	//  380  923:ldc2            #289 <String "BOOL_LIST_PACKED">
	//  381  926:bipush          42
	//  382  928:bipush          42
	//  383  930:getstatic       #261 <Field zzuk zzuk.zzbxv>
	//  384  933:getstatic       #131 <Field zzux zzux.zzbzj>
	//  385  936:invokespecial   #91  <Method void zzui(String, int, int, zzuk, zzux)>
	//  386  939:putstatic       #291 <Field zzui zzbxb>
		zzbxc = new zzui("UINT32_LIST_PACKED", 43, 43, zzuk.zzbxv, zzux.zzbzf);
	//  387  942:new             #2   <Class zzui>
	//  388  945:dup             
	//  389  946:ldc2            #293 <String "UINT32_LIST_PACKED">
	//  390  949:bipush          43
	//  391  951:bipush          43
	//  392  953:getstatic       #261 <Field zzuk zzuk.zzbxv>
	//  393  956:getstatic       #116 <Field zzux zzux.zzbzf>
	//  394  959:invokespecial   #91  <Method void zzui(String, int, int, zzuk, zzux)>
	//  395  962:putstatic       #295 <Field zzui zzbxc>
		zzbxd = new zzui("ENUM_LIST_PACKED", 44, 44, zzuk.zzbxv, zzux.zzbzm);
	//  396  965:new             #2   <Class zzui>
	//  397  968:dup             
	//  398  969:ldc2            #297 <String "ENUM_LIST_PACKED">
	//  399  972:bipush          44
	//  400  974:bipush          44
	//  401  976:getstatic       #261 <Field zzuk zzuk.zzbxv>
	//  402  979:getstatic       #163 <Field zzux zzux.zzbzm>
	//  403  982:invokespecial   #91  <Method void zzui(String, int, int, zzuk, zzux)>
	//  404  985:putstatic       #299 <Field zzui zzbxd>
		zzbxe = new zzui("SFIXED32_LIST_PACKED", 45, 45, zzuk.zzbxv, zzux.zzbzf);
	//  405  988:new             #2   <Class zzui>
	//  406  991:dup             
	//  407  992:ldc2            #301 <String "SFIXED32_LIST_PACKED">
	//  408  995:bipush          45
	//  409  997:bipush          45
	//  410  999:getstatic       #261 <Field zzuk zzuk.zzbxv>
	//  411 1002:getstatic       #116 <Field zzux zzux.zzbzf>
	//  412 1005:invokespecial   #91  <Method void zzui(String, int, int, zzuk, zzux)>
	//  413 1008:putstatic       #303 <Field zzui zzbxe>
		zzbxf = new zzui("SFIXED64_LIST_PACKED", 46, 46, zzuk.zzbxv, zzux.zzbzg);
	//  414 1011:new             #2   <Class zzui>
	//  415 1014:dup             
	//  416 1015:ldc2            #305 <String "SFIXED64_LIST_PACKED">
	//  417 1018:bipush          46
	//  418 1020:bipush          46
	//  419 1022:getstatic       #261 <Field zzuk zzuk.zzbxv>
	//  420 1025:getstatic       #105 <Field zzux zzux.zzbzg>
	//  421 1028:invokespecial   #91  <Method void zzui(String, int, int, zzuk, zzux)>
	//  422 1031:putstatic       #307 <Field zzui zzbxf>
		zzbxg = new zzui("SINT32_LIST_PACKED", 47, 47, zzuk.zzbxv, zzux.zzbzf);
	//  423 1034:new             #2   <Class zzui>
	//  424 1037:dup             
	//  425 1038:ldc2            #309 <String "SINT32_LIST_PACKED">
	//  426 1041:bipush          47
	//  427 1043:bipush          47
	//  428 1045:getstatic       #261 <Field zzuk zzuk.zzbxv>
	//  429 1048:getstatic       #116 <Field zzux zzux.zzbzf>
	//  430 1051:invokespecial   #91  <Method void zzui(String, int, int, zzuk, zzux)>
	//  431 1054:putstatic       #311 <Field zzui zzbxg>
		zzbxh = new zzui("SINT64_LIST_PACKED", 48, 48, zzuk.zzbxv, zzux.zzbzg);
	//  432 1057:new             #2   <Class zzui>
	//  433 1060:dup             
	//  434 1061:ldc2            #313 <String "SINT64_LIST_PACKED">
	//  435 1064:bipush          48
	//  436 1066:bipush          48
	//  437 1068:getstatic       #261 <Field zzuk zzuk.zzbxv>
	//  438 1071:getstatic       #105 <Field zzux zzux.zzbzg>
	//  439 1074:invokespecial   #91  <Method void zzui(String, int, int, zzuk, zzux)>
	//  440 1077:putstatic       #315 <Field zzui zzbxh>
		zzbxi = new zzui("GROUP_LIST", 49, 49, zzuk.zzbxu, zzux.zzbzn);
	//  441 1080:new             #2   <Class zzui>
	//  442 1083:dup             
	//  443 1084:ldc2            #317 <String "GROUP_LIST">
	//  444 1087:bipush          49
	//  445 1089:bipush          49
	//  446 1091:getstatic       #190 <Field zzuk zzuk.zzbxu>
	//  447 1094:getstatic       #145 <Field zzux zzux.zzbzn>
	//  448 1097:invokespecial   #91  <Method void zzui(String, int, int, zzuk, zzux)>
	//  449 1100:putstatic       #319 <Field zzui zzbxi>
		zzbxj = new zzui("MAP", 50, 50, zzuk.zzbxw, zzux.zzbze);
	//  450 1103:new             #2   <Class zzui>
	//  451 1106:dup             
	//  452 1107:ldc2            #321 <String "MAP">
	//  453 1110:bipush          50
	//  454 1112:bipush          50
	//  455 1114:getstatic       #324 <Field zzuk zzuk.zzbxw>
	//  456 1117:getstatic       #327 <Field zzux zzux.zzbze>
	//  457 1120:invokespecial   #91  <Method void zzui(String, int, int, zzuk, zzux)>
	//  458 1123:putstatic       #329 <Field zzui zzbxj>
		zzui zzui1 = zzbvl;
	//  459 1126:getstatic       #93  <Field zzui zzbvl>
	//  460 1129:astore_2        
		int i = 0;
	//  461 1130:iconst_0        
	//  462 1131:istore_0        
		zzbxq = (new zzui[] {
			zzui1, zzbvm, zzbvn, zzbvo, zzbvp, zzbvq, zzbvr, zzbvs, zzbvt, zzbvu, 
			zzbvv, zzbvw, zzbvx, zzbvy, zzbvz, zzbwa, zzbwb, zzbwc, zzbwd, zzbwe, 
			zzbwf, zzbwg, zzbwh, zzbwi, zzbwj, zzbwk, zzbwl, zzbwm, zzbwn, zzbwo, 
			zzbwp, zzbwq, zzbwr, zzbws, zzbwt, zzbwu, zzbwv, zzbww, zzbwx, zzbwy, 
			zzbwz, zzbxa, zzbxb, zzbxc, zzbxd, zzbxe, zzbxf, zzbxg, zzbxh, zzbxi, 
			zzbxj
		});
	//  463 1132:bipush          51
	//  464 1134:anewarray       zzui[]
	//  465 1137:dup             
	//  466 1138:iconst_0        
	//  467 1139:aload_2         
	//  468 1140:aastore         
	//  469 1141:dup             
	//  470 1142:iconst_1        
	//  471 1143:getstatic       #100 <Field zzui zzbvm>
	//  472 1146:aastore         
	//  473 1147:dup             
	//  474 1148:iconst_2        
	//  475 1149:getstatic       #107 <Field zzui zzbvn>
	//  476 1152:aastore         
	//  477 1153:dup             
	//  478 1154:iconst_3        
	//  479 1155:getstatic       #111 <Field zzui zzbvo>
	//  480 1158:aastore         
	//  481 1159:dup             
	//  482 1160:iconst_4        
	//  483 1161:getstatic       #118 <Field zzui zzbvp>
	//  484 1164:aastore         
	//  485 1165:dup             
	//  486 1166:iconst_5        
	//  487 1167:getstatic       #122 <Field zzui zzbvq>
	//  488 1170:aastore         
	//  489 1171:dup             
	//  490 1172:bipush          6
	//  491 1174:getstatic       #126 <Field zzui zzbvr>
	//  492 1177:aastore         
	//  493 1178:dup             
	//  494 1179:bipush          7
	//  495 1181:getstatic       #133 <Field zzui zzbvs>
	//  496 1184:aastore         
	//  497 1185:dup             
	//  498 1186:bipush          8
	//  499 1188:getstatic       #140 <Field zzui zzbvt>
	//  500 1191:aastore         
	//  501 1192:dup             
	//  502 1193:bipush          9
	//  503 1195:getstatic       #147 <Field zzui zzbvu>
	//  504 1198:aastore         
	//  505 1199:dup             
	//  506 1200:bipush          10
	//  507 1202:getstatic       #154 <Field zzui zzbvv>
	//  508 1205:aastore         
	//  509 1206:dup             
	//  510 1207:bipush          11
	//  511 1209:getstatic       #158 <Field zzui zzbvw>
	//  512 1212:aastore         
	//  513 1213:dup             
	//  514 1214:bipush          12
	//  515 1216:getstatic       #165 <Field zzui zzbvx>
	//  516 1219:aastore         
	//  517 1220:dup             
	//  518 1221:bipush          13
	//  519 1223:getstatic       #169 <Field zzui zzbvy>
	//  520 1226:aastore         
	//  521 1227:dup             
	//  522 1228:bipush          14
	//  523 1230:getstatic       #173 <Field zzui zzbvz>
	//  524 1233:aastore         
	//  525 1234:dup             
	//  526 1235:bipush          15
	//  527 1237:getstatic       #177 <Field zzui zzbwa>
	//  528 1240:aastore         
	//  529 1241:dup             
	//  530 1242:bipush          16
	//  531 1244:getstatic       #181 <Field zzui zzbwb>
	//  532 1247:aastore         
	//  533 1248:dup             
	//  534 1249:bipush          17
	//  535 1251:getstatic       #185 <Field zzui zzbwc>
	//  536 1254:aastore         
	//  537 1255:dup             
	//  538 1256:bipush          18
	//  539 1258:getstatic       #192 <Field zzui zzbwd>
	//  540 1261:aastore         
	//  541 1262:dup             
	//  542 1263:bipush          19
	//  543 1265:getstatic       #196 <Field zzui zzbwe>
	//  544 1268:aastore         
	//  545 1269:dup             
	//  546 1270:bipush          20
	//  547 1272:getstatic       #200 <Field zzui zzbwf>
	//  548 1275:aastore         
	//  549 1276:dup             
	//  550 1277:bipush          21
	//  551 1279:getstatic       #204 <Field zzui zzbwg>
	//  552 1282:aastore         
	//  553 1283:dup             
	//  554 1284:bipush          22
	//  555 1286:getstatic       #208 <Field zzui zzbwh>
	//  556 1289:aastore         
	//  557 1290:dup             
	//  558 1291:bipush          23
	//  559 1293:getstatic       #212 <Field zzui zzbwi>
	//  560 1296:aastore         
	//  561 1297:dup             
	//  562 1298:bipush          24
	//  563 1300:getstatic       #216 <Field zzui zzbwj>
	//  564 1303:aastore         
	//  565 1304:dup             
	//  566 1305:bipush          25
	//  567 1307:getstatic       #220 <Field zzui zzbwk>
	//  568 1310:aastore         
	//  569 1311:dup             
	//  570 1312:bipush          26
	//  571 1314:getstatic       #224 <Field zzui zzbwl>
	//  572 1317:aastore         
	//  573 1318:dup             
	//  574 1319:bipush          27
	//  575 1321:getstatic       #228 <Field zzui zzbwm>
	//  576 1324:aastore         
	//  577 1325:dup             
	//  578 1326:bipush          28
	//  579 1328:getstatic       #232 <Field zzui zzbwn>
	//  580 1331:aastore         
	//  581 1332:dup             
	//  582 1333:bipush          29
	//  583 1335:getstatic       #236 <Field zzui zzbwo>
	//  584 1338:aastore         
	//  585 1339:dup             
	//  586 1340:bipush          30
	//  587 1342:getstatic       #240 <Field zzui zzbwp>
	//  588 1345:aastore         
	//  589 1346:dup             
	//  590 1347:bipush          31
	//  591 1349:getstatic       #244 <Field zzui zzbwq>
	//  592 1352:aastore         
	//  593 1353:dup             
	//  594 1354:bipush          32
	//  595 1356:getstatic       #248 <Field zzui zzbwr>
	//  596 1359:aastore         
	//  597 1360:dup             
	//  598 1361:bipush          33
	//  599 1363:getstatic       #252 <Field zzui zzbws>
	//  600 1366:aastore         
	//  601 1367:dup             
	//  602 1368:bipush          34
	//  603 1370:getstatic       #256 <Field zzui zzbwt>
	//  604 1373:aastore         
	//  605 1374:dup             
	//  606 1375:bipush          35
	//  607 1377:getstatic       #263 <Field zzui zzbwu>
	//  608 1380:aastore         
	//  609 1381:dup             
	//  610 1382:bipush          36
	//  611 1384:getstatic       #267 <Field zzui zzbwv>
	//  612 1387:aastore         
	//  613 1388:dup             
	//  614 1389:bipush          37
	//  615 1391:getstatic       #271 <Field zzui zzbww>
	//  616 1394:aastore         
	//  617 1395:dup             
	//  618 1396:bipush          38
	//  619 1398:getstatic       #275 <Field zzui zzbwx>
	//  620 1401:aastore         
	//  621 1402:dup             
	//  622 1403:bipush          39
	//  623 1405:getstatic       #279 <Field zzui zzbwy>
	//  624 1408:aastore         
	//  625 1409:dup             
	//  626 1410:bipush          40
	//  627 1412:getstatic       #283 <Field zzui zzbwz>
	//  628 1415:aastore         
	//  629 1416:dup             
	//  630 1417:bipush          41
	//  631 1419:getstatic       #287 <Field zzui zzbxa>
	//  632 1422:aastore         
	//  633 1423:dup             
	//  634 1424:bipush          42
	//  635 1426:getstatic       #291 <Field zzui zzbxb>
	//  636 1429:aastore         
	//  637 1430:dup             
	//  638 1431:bipush          43
	//  639 1433:getstatic       #295 <Field zzui zzbxc>
	//  640 1436:aastore         
	//  641 1437:dup             
	//  642 1438:bipush          44
	//  643 1440:getstatic       #299 <Field zzui zzbxd>
	//  644 1443:aastore         
	//  645 1444:dup             
	//  646 1445:bipush          45
	//  647 1447:getstatic       #303 <Field zzui zzbxe>
	//  648 1450:aastore         
	//  649 1451:dup             
	//  650 1452:bipush          46
	//  651 1454:getstatic       #307 <Field zzui zzbxf>
	//  652 1457:aastore         
	//  653 1458:dup             
	//  654 1459:bipush          47
	//  655 1461:getstatic       #311 <Field zzui zzbxg>
	//  656 1464:aastore         
	//  657 1465:dup             
	//  658 1466:bipush          48
	//  659 1468:getstatic       #315 <Field zzui zzbxh>
	//  660 1471:aastore         
	//  661 1472:dup             
	//  662 1473:bipush          49
	//  663 1475:getstatic       #319 <Field zzui zzbxi>
	//  664 1478:aastore         
	//  665 1479:dup             
	//  666 1480:bipush          50
	//  667 1482:getstatic       #329 <Field zzui zzbxj>
	//  668 1485:aastore         
	//  669 1486:putstatic       #331 <Field zzui[] zzbxq>
	//  670 1489:iconst_0        
	//  671 1490:anewarray       Type[]
	//  672 1493:putstatic       #335 <Field Type[] zzbxp>
		zzui azzui[] = values();
	//  673 1496:invokestatic    #339 <Method zzui[] values()>
	//  674 1499:astore_2        
		zzbxo = new zzui[azzui.length];
	//  675 1500:aload_2         
	//  676 1501:arraylength     
	//  677 1502:anewarray       zzui[]
	//  678 1505:putstatic       #341 <Field zzui[] zzbxo>
		for(int j = azzui.length; i < j; i++)
	//* 679 1508:aload_2         
	//* 680 1509:arraylength     
	//* 681 1510:istore_1        
	//* 682 1511:iload_0         
	//* 683 1512:iload_1         
	//* 684 1513:icmpge          1536
		{
			zzui zzui2 = azzui[i];
	//  685 1516:aload_2         
	//  686 1517:iload_0         
	//  687 1518:aaload          
	//  688 1519:astore_3        
			zzbxo[zzui2.id] = zzui2;
	//  689 1520:getstatic       #341 <Field zzui[] zzbxo>
	//  690 1523:aload_3         
	//  691 1524:getfield        #343 <Field int id>
	//  692 1527:aload_3         
	//  693 1528:aastore         
		}

	//  694 1529:iload_0         
	//  695 1530:iconst_1        
	//  696 1531:iadd            
	//  697 1532:istore_0        
	//* 698 1533:goto            1511
	//* 699 1536:return          
	}
}
