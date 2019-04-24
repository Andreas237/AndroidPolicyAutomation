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
		zzbxn = zzuk1;
	//    7   11:aload_0         
	//    8   12:aload           4
	//    9   14:putfield        #349 <Field zzuk zzbxn>
		zzbxm = zzux1;
	//   10   17:aload_0         
	//   11   18:aload           5
	//   12   20:putfield        #351 <Field zzux zzbxm>
		zzuj.zzbxt[zzuk1.ordinal()];
	//   13   23:getstatic       #357 <Field int[] zzuj.zzbxt>
	//   14   26:aload           4
	//   15   28:invokevirtual   #361 <Method int zzuk.ordinal()>
	//   16   31:iaload          
		JVM INSTR tableswitch 1 2: default 56
	//	               1 66
	//	               2 66;
	//   17   32:tableswitch     1 2: default 56
	//	               1 66
	//	               2 66
		   goto _L1 _L2 _L2
_L1:
		s = null;
	//   18   56:aconst_null     
	//   19   57:astore_1        
_L4:
		zzbxo = ((Class) (s));
	//   20   58:aload_0         
	//   21   59:aload_1         
	//   22   60:putfield        #363 <Field Class zzbxo>
		break; /* Loop/switch isn't completed */
	//   23   63:goto            75
_L2:
		s = ((String) (zzux1.zzwy()));
	//   24   66:aload           5
	//   25   68:invokevirtual   #367 <Method Class zzux.zzwy()>
	//   26   71:astore_1        
		if(true) goto _L4; else goto _L3
	//   27   72:goto            58
_L3:
		boolean flag1 = false;
	//   28   75:iconst_0        
	//   29   76:istore          7
		boolean flag = flag1;
	//   30   78:iload           7
	//   31   80:istore          6
		if(zzuk1 == zzuk.zzbxv)
	//*  32   82:aload           4
	//*  33   84:getstatic       #82  <Field zzuk zzuk.zzbxv>
	//*  34   87:if_acmpne       131
		{
			flag = flag1;
	//   35   90:iload           7
	//   36   92:istore          6
			switch(zzuj.zzbxu[zzux1.ordinal()])
	//*  37   94:getstatic       #370 <Field int[] zzuj.zzbxu>
	//*  38   97:aload           5
	//*  39   99:invokevirtual   #371 <Method int zzux.ordinal()>
	//*  40  102:iaload          
			{
	//*  41  103:tableswitch     1 3: default 128
	//	               1 131
	//	               2 131
	//	               3 131
			default:
				flag = true;
	//   42  128:iconst_1        
	//   43  129:istore          6
				break;

			case 1: // '\001'
			case 2: // '\002'
			case 3: // '\003'
				break;
			}
		}
		zzbxp = flag;
	//   44  131:aload_0         
	//   45  132:iload           6
	//   46  134:putfield        #373 <Field boolean zzbxp>
		return;
	//   47  137:return          
	}

	public static zzui[] values()
	{
		return (zzui[])((zzui []) (zzbxs)).clone();
	//    0    0:getstatic       #331 <Field zzui[] zzbxs>
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
	private static final zzui zzbwu;
	private static final zzui zzbwv;
	public static final zzui zzbww;
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
	private static final zzui zzbxh;
	private static final zzui zzbxi;
	public static final zzui zzbxj;
	private static final zzui zzbxk;
	private static final zzui zzbxl;
	private static final zzui zzbxq[];
	private static final Type zzbxr[] = new Type[0];
	private static final zzui zzbxs[];
	private final int id;
	private final zzux zzbxm;
	private final zzuk zzbxn;
	private final Class zzbxo;
	private final boolean zzbxp;

	static 
	{
		zzbvn = new zzui("DOUBLE", 0, 0, zzuk.zzbxv, zzux.zzbzk);
	//    0    0:new             #2   <Class zzui>
	//    1    3:dup             
	//    2    4:ldc1            #77  <String "DOUBLE">
	//    3    6:iconst_0        
	//    4    7:iconst_0        
	//    5    8:getstatic       #82  <Field zzuk zzuk.zzbxv>
	//    6   11:getstatic       #87  <Field zzux zzux.zzbzk>
	//    7   14:invokespecial   #91  <Method void zzui(String, int, int, zzuk, zzux)>
	//    8   17:putstatic       #93  <Field zzui zzbvn>
		zzbvo = new zzui("FLOAT", 1, 1, zzuk.zzbxv, zzux.zzbzj);
	//    9   20:new             #2   <Class zzui>
	//   10   23:dup             
	//   11   24:ldc1            #95  <String "FLOAT">
	//   12   26:iconst_1        
	//   13   27:iconst_1        
	//   14   28:getstatic       #82  <Field zzuk zzuk.zzbxv>
	//   15   31:getstatic       #98  <Field zzux zzux.zzbzj>
	//   16   34:invokespecial   #91  <Method void zzui(String, int, int, zzuk, zzux)>
	//   17   37:putstatic       #100 <Field zzui zzbvo>
		zzbvp = new zzui("INT64", 2, 2, zzuk.zzbxv, zzux.zzbzi);
	//   18   40:new             #2   <Class zzui>
	//   19   43:dup             
	//   20   44:ldc1            #102 <String "INT64">
	//   21   46:iconst_2        
	//   22   47:iconst_2        
	//   23   48:getstatic       #82  <Field zzuk zzuk.zzbxv>
	//   24   51:getstatic       #105 <Field zzux zzux.zzbzi>
	//   25   54:invokespecial   #91  <Method void zzui(String, int, int, zzuk, zzux)>
	//   26   57:putstatic       #107 <Field zzui zzbvp>
		zzbvq = new zzui("UINT64", 3, 3, zzuk.zzbxv, zzux.zzbzi);
	//   27   60:new             #2   <Class zzui>
	//   28   63:dup             
	//   29   64:ldc1            #109 <String "UINT64">
	//   30   66:iconst_3        
	//   31   67:iconst_3        
	//   32   68:getstatic       #82  <Field zzuk zzuk.zzbxv>
	//   33   71:getstatic       #105 <Field zzux zzux.zzbzi>
	//   34   74:invokespecial   #91  <Method void zzui(String, int, int, zzuk, zzux)>
	//   35   77:putstatic       #111 <Field zzui zzbvq>
		zzbvr = new zzui("INT32", 4, 4, zzuk.zzbxv, zzux.zzbzh);
	//   36   80:new             #2   <Class zzui>
	//   37   83:dup             
	//   38   84:ldc1            #113 <String "INT32">
	//   39   86:iconst_4        
	//   40   87:iconst_4        
	//   41   88:getstatic       #82  <Field zzuk zzuk.zzbxv>
	//   42   91:getstatic       #116 <Field zzux zzux.zzbzh>
	//   43   94:invokespecial   #91  <Method void zzui(String, int, int, zzuk, zzux)>
	//   44   97:putstatic       #118 <Field zzui zzbvr>
		zzbvs = new zzui("FIXED64", 5, 5, zzuk.zzbxv, zzux.zzbzi);
	//   45  100:new             #2   <Class zzui>
	//   46  103:dup             
	//   47  104:ldc1            #120 <String "FIXED64">
	//   48  106:iconst_5        
	//   49  107:iconst_5        
	//   50  108:getstatic       #82  <Field zzuk zzuk.zzbxv>
	//   51  111:getstatic       #105 <Field zzux zzux.zzbzi>
	//   52  114:invokespecial   #91  <Method void zzui(String, int, int, zzuk, zzux)>
	//   53  117:putstatic       #122 <Field zzui zzbvs>
		zzbvt = new zzui("FIXED32", 6, 6, zzuk.zzbxv, zzux.zzbzh);
	//   54  120:new             #2   <Class zzui>
	//   55  123:dup             
	//   56  124:ldc1            #124 <String "FIXED32">
	//   57  126:bipush          6
	//   58  128:bipush          6
	//   59  130:getstatic       #82  <Field zzuk zzuk.zzbxv>
	//   60  133:getstatic       #116 <Field zzux zzux.zzbzh>
	//   61  136:invokespecial   #91  <Method void zzui(String, int, int, zzuk, zzux)>
	//   62  139:putstatic       #126 <Field zzui zzbvt>
		zzbvu = new zzui("BOOL", 7, 7, zzuk.zzbxv, zzux.zzbzl);
	//   63  142:new             #2   <Class zzui>
	//   64  145:dup             
	//   65  146:ldc1            #128 <String "BOOL">
	//   66  148:bipush          7
	//   67  150:bipush          7
	//   68  152:getstatic       #82  <Field zzuk zzuk.zzbxv>
	//   69  155:getstatic       #131 <Field zzux zzux.zzbzl>
	//   70  158:invokespecial   #91  <Method void zzui(String, int, int, zzuk, zzux)>
	//   71  161:putstatic       #133 <Field zzui zzbvu>
		zzbvv = new zzui("STRING", 8, 8, zzuk.zzbxv, zzux.zzbzm);
	//   72  164:new             #2   <Class zzui>
	//   73  167:dup             
	//   74  168:ldc1            #135 <String "STRING">
	//   75  170:bipush          8
	//   76  172:bipush          8
	//   77  174:getstatic       #82  <Field zzuk zzuk.zzbxv>
	//   78  177:getstatic       #138 <Field zzux zzux.zzbzm>
	//   79  180:invokespecial   #91  <Method void zzui(String, int, int, zzuk, zzux)>
	//   80  183:putstatic       #140 <Field zzui zzbvv>
		zzbvw = new zzui("MESSAGE", 9, 9, zzuk.zzbxv, zzux.zzbzp);
	//   81  186:new             #2   <Class zzui>
	//   82  189:dup             
	//   83  190:ldc1            #142 <String "MESSAGE">
	//   84  192:bipush          9
	//   85  194:bipush          9
	//   86  196:getstatic       #82  <Field zzuk zzuk.zzbxv>
	//   87  199:getstatic       #145 <Field zzux zzux.zzbzp>
	//   88  202:invokespecial   #91  <Method void zzui(String, int, int, zzuk, zzux)>
	//   89  205:putstatic       #147 <Field zzui zzbvw>
		zzbvx = new zzui("BYTES", 10, 10, zzuk.zzbxv, zzux.zzbzn);
	//   90  208:new             #2   <Class zzui>
	//   91  211:dup             
	//   92  212:ldc1            #149 <String "BYTES">
	//   93  214:bipush          10
	//   94  216:bipush          10
	//   95  218:getstatic       #82  <Field zzuk zzuk.zzbxv>
	//   96  221:getstatic       #152 <Field zzux zzux.zzbzn>
	//   97  224:invokespecial   #91  <Method void zzui(String, int, int, zzuk, zzux)>
	//   98  227:putstatic       #154 <Field zzui zzbvx>
		zzbvy = new zzui("UINT32", 11, 11, zzuk.zzbxv, zzux.zzbzh);
	//   99  230:new             #2   <Class zzui>
	//  100  233:dup             
	//  101  234:ldc1            #156 <String "UINT32">
	//  102  236:bipush          11
	//  103  238:bipush          11
	//  104  240:getstatic       #82  <Field zzuk zzuk.zzbxv>
	//  105  243:getstatic       #116 <Field zzux zzux.zzbzh>
	//  106  246:invokespecial   #91  <Method void zzui(String, int, int, zzuk, zzux)>
	//  107  249:putstatic       #158 <Field zzui zzbvy>
		zzbvz = new zzui("ENUM", 12, 12, zzuk.zzbxv, zzux.zzbzo);
	//  108  252:new             #2   <Class zzui>
	//  109  255:dup             
	//  110  256:ldc1            #160 <String "ENUM">
	//  111  258:bipush          12
	//  112  260:bipush          12
	//  113  262:getstatic       #82  <Field zzuk zzuk.zzbxv>
	//  114  265:getstatic       #163 <Field zzux zzux.zzbzo>
	//  115  268:invokespecial   #91  <Method void zzui(String, int, int, zzuk, zzux)>
	//  116  271:putstatic       #165 <Field zzui zzbvz>
		zzbwa = new zzui("SFIXED32", 13, 13, zzuk.zzbxv, zzux.zzbzh);
	//  117  274:new             #2   <Class zzui>
	//  118  277:dup             
	//  119  278:ldc1            #167 <String "SFIXED32">
	//  120  280:bipush          13
	//  121  282:bipush          13
	//  122  284:getstatic       #82  <Field zzuk zzuk.zzbxv>
	//  123  287:getstatic       #116 <Field zzux zzux.zzbzh>
	//  124  290:invokespecial   #91  <Method void zzui(String, int, int, zzuk, zzux)>
	//  125  293:putstatic       #169 <Field zzui zzbwa>
		zzbwb = new zzui("SFIXED64", 14, 14, zzuk.zzbxv, zzux.zzbzi);
	//  126  296:new             #2   <Class zzui>
	//  127  299:dup             
	//  128  300:ldc1            #171 <String "SFIXED64">
	//  129  302:bipush          14
	//  130  304:bipush          14
	//  131  306:getstatic       #82  <Field zzuk zzuk.zzbxv>
	//  132  309:getstatic       #105 <Field zzux zzux.zzbzi>
	//  133  312:invokespecial   #91  <Method void zzui(String, int, int, zzuk, zzux)>
	//  134  315:putstatic       #173 <Field zzui zzbwb>
		zzbwc = new zzui("SINT32", 15, 15, zzuk.zzbxv, zzux.zzbzh);
	//  135  318:new             #2   <Class zzui>
	//  136  321:dup             
	//  137  322:ldc1            #175 <String "SINT32">
	//  138  324:bipush          15
	//  139  326:bipush          15
	//  140  328:getstatic       #82  <Field zzuk zzuk.zzbxv>
	//  141  331:getstatic       #116 <Field zzux zzux.zzbzh>
	//  142  334:invokespecial   #91  <Method void zzui(String, int, int, zzuk, zzux)>
	//  143  337:putstatic       #177 <Field zzui zzbwc>
		zzbwd = new zzui("SINT64", 16, 16, zzuk.zzbxv, zzux.zzbzi);
	//  144  340:new             #2   <Class zzui>
	//  145  343:dup             
	//  146  344:ldc1            #179 <String "SINT64">
	//  147  346:bipush          16
	//  148  348:bipush          16
	//  149  350:getstatic       #82  <Field zzuk zzuk.zzbxv>
	//  150  353:getstatic       #105 <Field zzux zzux.zzbzi>
	//  151  356:invokespecial   #91  <Method void zzui(String, int, int, zzuk, zzux)>
	//  152  359:putstatic       #181 <Field zzui zzbwd>
		zzbwe = new zzui("GROUP", 17, 17, zzuk.zzbxv, zzux.zzbzp);
	//  153  362:new             #2   <Class zzui>
	//  154  365:dup             
	//  155  366:ldc1            #183 <String "GROUP">
	//  156  368:bipush          17
	//  157  370:bipush          17
	//  158  372:getstatic       #82  <Field zzuk zzuk.zzbxv>
	//  159  375:getstatic       #145 <Field zzux zzux.zzbzp>
	//  160  378:invokespecial   #91  <Method void zzui(String, int, int, zzuk, zzux)>
	//  161  381:putstatic       #185 <Field zzui zzbwe>
		zzbwf = new zzui("DOUBLE_LIST", 18, 18, zzuk.zzbxw, zzux.zzbzk);
	//  162  384:new             #2   <Class zzui>
	//  163  387:dup             
	//  164  388:ldc1            #187 <String "DOUBLE_LIST">
	//  165  390:bipush          18
	//  166  392:bipush          18
	//  167  394:getstatic       #190 <Field zzuk zzuk.zzbxw>
	//  168  397:getstatic       #87  <Field zzux zzux.zzbzk>
	//  169  400:invokespecial   #91  <Method void zzui(String, int, int, zzuk, zzux)>
	//  170  403:putstatic       #192 <Field zzui zzbwf>
		zzbwg = new zzui("FLOAT_LIST", 19, 19, zzuk.zzbxw, zzux.zzbzj);
	//  171  406:new             #2   <Class zzui>
	//  172  409:dup             
	//  173  410:ldc1            #194 <String "FLOAT_LIST">
	//  174  412:bipush          19
	//  175  414:bipush          19
	//  176  416:getstatic       #190 <Field zzuk zzuk.zzbxw>
	//  177  419:getstatic       #98  <Field zzux zzux.zzbzj>
	//  178  422:invokespecial   #91  <Method void zzui(String, int, int, zzuk, zzux)>
	//  179  425:putstatic       #196 <Field zzui zzbwg>
		zzbwh = new zzui("INT64_LIST", 20, 20, zzuk.zzbxw, zzux.zzbzi);
	//  180  428:new             #2   <Class zzui>
	//  181  431:dup             
	//  182  432:ldc1            #198 <String "INT64_LIST">
	//  183  434:bipush          20
	//  184  436:bipush          20
	//  185  438:getstatic       #190 <Field zzuk zzuk.zzbxw>
	//  186  441:getstatic       #105 <Field zzux zzux.zzbzi>
	//  187  444:invokespecial   #91  <Method void zzui(String, int, int, zzuk, zzux)>
	//  188  447:putstatic       #200 <Field zzui zzbwh>
		zzbwi = new zzui("UINT64_LIST", 21, 21, zzuk.zzbxw, zzux.zzbzi);
	//  189  450:new             #2   <Class zzui>
	//  190  453:dup             
	//  191  454:ldc1            #202 <String "UINT64_LIST">
	//  192  456:bipush          21
	//  193  458:bipush          21
	//  194  460:getstatic       #190 <Field zzuk zzuk.zzbxw>
	//  195  463:getstatic       #105 <Field zzux zzux.zzbzi>
	//  196  466:invokespecial   #91  <Method void zzui(String, int, int, zzuk, zzux)>
	//  197  469:putstatic       #204 <Field zzui zzbwi>
		zzbwj = new zzui("INT32_LIST", 22, 22, zzuk.zzbxw, zzux.zzbzh);
	//  198  472:new             #2   <Class zzui>
	//  199  475:dup             
	//  200  476:ldc1            #206 <String "INT32_LIST">
	//  201  478:bipush          22
	//  202  480:bipush          22
	//  203  482:getstatic       #190 <Field zzuk zzuk.zzbxw>
	//  204  485:getstatic       #116 <Field zzux zzux.zzbzh>
	//  205  488:invokespecial   #91  <Method void zzui(String, int, int, zzuk, zzux)>
	//  206  491:putstatic       #208 <Field zzui zzbwj>
		zzbwk = new zzui("FIXED64_LIST", 23, 23, zzuk.zzbxw, zzux.zzbzi);
	//  207  494:new             #2   <Class zzui>
	//  208  497:dup             
	//  209  498:ldc1            #210 <String "FIXED64_LIST">
	//  210  500:bipush          23
	//  211  502:bipush          23
	//  212  504:getstatic       #190 <Field zzuk zzuk.zzbxw>
	//  213  507:getstatic       #105 <Field zzux zzux.zzbzi>
	//  214  510:invokespecial   #91  <Method void zzui(String, int, int, zzuk, zzux)>
	//  215  513:putstatic       #212 <Field zzui zzbwk>
		zzbwl = new zzui("FIXED32_LIST", 24, 24, zzuk.zzbxw, zzux.zzbzh);
	//  216  516:new             #2   <Class zzui>
	//  217  519:dup             
	//  218  520:ldc1            #214 <String "FIXED32_LIST">
	//  219  522:bipush          24
	//  220  524:bipush          24
	//  221  526:getstatic       #190 <Field zzuk zzuk.zzbxw>
	//  222  529:getstatic       #116 <Field zzux zzux.zzbzh>
	//  223  532:invokespecial   #91  <Method void zzui(String, int, int, zzuk, zzux)>
	//  224  535:putstatic       #216 <Field zzui zzbwl>
		zzbwm = new zzui("BOOL_LIST", 25, 25, zzuk.zzbxw, zzux.zzbzl);
	//  225  538:new             #2   <Class zzui>
	//  226  541:dup             
	//  227  542:ldc1            #218 <String "BOOL_LIST">
	//  228  544:bipush          25
	//  229  546:bipush          25
	//  230  548:getstatic       #190 <Field zzuk zzuk.zzbxw>
	//  231  551:getstatic       #131 <Field zzux zzux.zzbzl>
	//  232  554:invokespecial   #91  <Method void zzui(String, int, int, zzuk, zzux)>
	//  233  557:putstatic       #220 <Field zzui zzbwm>
		zzbwn = new zzui("STRING_LIST", 26, 26, zzuk.zzbxw, zzux.zzbzm);
	//  234  560:new             #2   <Class zzui>
	//  235  563:dup             
	//  236  564:ldc1            #222 <String "STRING_LIST">
	//  237  566:bipush          26
	//  238  568:bipush          26
	//  239  570:getstatic       #190 <Field zzuk zzuk.zzbxw>
	//  240  573:getstatic       #138 <Field zzux zzux.zzbzm>
	//  241  576:invokespecial   #91  <Method void zzui(String, int, int, zzuk, zzux)>
	//  242  579:putstatic       #224 <Field zzui zzbwn>
		zzbwo = new zzui("MESSAGE_LIST", 27, 27, zzuk.zzbxw, zzux.zzbzp);
	//  243  582:new             #2   <Class zzui>
	//  244  585:dup             
	//  245  586:ldc1            #226 <String "MESSAGE_LIST">
	//  246  588:bipush          27
	//  247  590:bipush          27
	//  248  592:getstatic       #190 <Field zzuk zzuk.zzbxw>
	//  249  595:getstatic       #145 <Field zzux zzux.zzbzp>
	//  250  598:invokespecial   #91  <Method void zzui(String, int, int, zzuk, zzux)>
	//  251  601:putstatic       #228 <Field zzui zzbwo>
		zzbwp = new zzui("BYTES_LIST", 28, 28, zzuk.zzbxw, zzux.zzbzn);
	//  252  604:new             #2   <Class zzui>
	//  253  607:dup             
	//  254  608:ldc1            #230 <String "BYTES_LIST">
	//  255  610:bipush          28
	//  256  612:bipush          28
	//  257  614:getstatic       #190 <Field zzuk zzuk.zzbxw>
	//  258  617:getstatic       #152 <Field zzux zzux.zzbzn>
	//  259  620:invokespecial   #91  <Method void zzui(String, int, int, zzuk, zzux)>
	//  260  623:putstatic       #232 <Field zzui zzbwp>
		zzbwq = new zzui("UINT32_LIST", 29, 29, zzuk.zzbxw, zzux.zzbzh);
	//  261  626:new             #2   <Class zzui>
	//  262  629:dup             
	//  263  630:ldc1            #234 <String "UINT32_LIST">
	//  264  632:bipush          29
	//  265  634:bipush          29
	//  266  636:getstatic       #190 <Field zzuk zzuk.zzbxw>
	//  267  639:getstatic       #116 <Field zzux zzux.zzbzh>
	//  268  642:invokespecial   #91  <Method void zzui(String, int, int, zzuk, zzux)>
	//  269  645:putstatic       #236 <Field zzui zzbwq>
		zzbwr = new zzui("ENUM_LIST", 30, 30, zzuk.zzbxw, zzux.zzbzo);
	//  270  648:new             #2   <Class zzui>
	//  271  651:dup             
	//  272  652:ldc1            #238 <String "ENUM_LIST">
	//  273  654:bipush          30
	//  274  656:bipush          30
	//  275  658:getstatic       #190 <Field zzuk zzuk.zzbxw>
	//  276  661:getstatic       #163 <Field zzux zzux.zzbzo>
	//  277  664:invokespecial   #91  <Method void zzui(String, int, int, zzuk, zzux)>
	//  278  667:putstatic       #240 <Field zzui zzbwr>
		zzbws = new zzui("SFIXED32_LIST", 31, 31, zzuk.zzbxw, zzux.zzbzh);
	//  279  670:new             #2   <Class zzui>
	//  280  673:dup             
	//  281  674:ldc1            #242 <String "SFIXED32_LIST">
	//  282  676:bipush          31
	//  283  678:bipush          31
	//  284  680:getstatic       #190 <Field zzuk zzuk.zzbxw>
	//  285  683:getstatic       #116 <Field zzux zzux.zzbzh>
	//  286  686:invokespecial   #91  <Method void zzui(String, int, int, zzuk, zzux)>
	//  287  689:putstatic       #244 <Field zzui zzbws>
		zzbwt = new zzui("SFIXED64_LIST", 32, 32, zzuk.zzbxw, zzux.zzbzi);
	//  288  692:new             #2   <Class zzui>
	//  289  695:dup             
	//  290  696:ldc1            #246 <String "SFIXED64_LIST">
	//  291  698:bipush          32
	//  292  700:bipush          32
	//  293  702:getstatic       #190 <Field zzuk zzuk.zzbxw>
	//  294  705:getstatic       #105 <Field zzux zzux.zzbzi>
	//  295  708:invokespecial   #91  <Method void zzui(String, int, int, zzuk, zzux)>
	//  296  711:putstatic       #248 <Field zzui zzbwt>
		zzbwu = new zzui("SINT32_LIST", 33, 33, zzuk.zzbxw, zzux.zzbzh);
	//  297  714:new             #2   <Class zzui>
	//  298  717:dup             
	//  299  718:ldc1            #250 <String "SINT32_LIST">
	//  300  720:bipush          33
	//  301  722:bipush          33
	//  302  724:getstatic       #190 <Field zzuk zzuk.zzbxw>
	//  303  727:getstatic       #116 <Field zzux zzux.zzbzh>
	//  304  730:invokespecial   #91  <Method void zzui(String, int, int, zzuk, zzux)>
	//  305  733:putstatic       #252 <Field zzui zzbwu>
		zzbwv = new zzui("SINT64_LIST", 34, 34, zzuk.zzbxw, zzux.zzbzi);
	//  306  736:new             #2   <Class zzui>
	//  307  739:dup             
	//  308  740:ldc1            #254 <String "SINT64_LIST">
	//  309  742:bipush          34
	//  310  744:bipush          34
	//  311  746:getstatic       #190 <Field zzuk zzuk.zzbxw>
	//  312  749:getstatic       #105 <Field zzux zzux.zzbzi>
	//  313  752:invokespecial   #91  <Method void zzui(String, int, int, zzuk, zzux)>
	//  314  755:putstatic       #256 <Field zzui zzbwv>
		zzbww = new zzui("DOUBLE_LIST_PACKED", 35, 35, zzuk.zzbxx, zzux.zzbzk);
	//  315  758:new             #2   <Class zzui>
	//  316  761:dup             
	//  317  762:ldc2            #258 <String "DOUBLE_LIST_PACKED">
	//  318  765:bipush          35
	//  319  767:bipush          35
	//  320  769:getstatic       #261 <Field zzuk zzuk.zzbxx>
	//  321  772:getstatic       #87  <Field zzux zzux.zzbzk>
	//  322  775:invokespecial   #91  <Method void zzui(String, int, int, zzuk, zzux)>
	//  323  778:putstatic       #263 <Field zzui zzbww>
		zzbwx = new zzui("FLOAT_LIST_PACKED", 36, 36, zzuk.zzbxx, zzux.zzbzj);
	//  324  781:new             #2   <Class zzui>
	//  325  784:dup             
	//  326  785:ldc2            #265 <String "FLOAT_LIST_PACKED">
	//  327  788:bipush          36
	//  328  790:bipush          36
	//  329  792:getstatic       #261 <Field zzuk zzuk.zzbxx>
	//  330  795:getstatic       #98  <Field zzux zzux.zzbzj>
	//  331  798:invokespecial   #91  <Method void zzui(String, int, int, zzuk, zzux)>
	//  332  801:putstatic       #267 <Field zzui zzbwx>
		zzbwy = new zzui("INT64_LIST_PACKED", 37, 37, zzuk.zzbxx, zzux.zzbzi);
	//  333  804:new             #2   <Class zzui>
	//  334  807:dup             
	//  335  808:ldc2            #269 <String "INT64_LIST_PACKED">
	//  336  811:bipush          37
	//  337  813:bipush          37
	//  338  815:getstatic       #261 <Field zzuk zzuk.zzbxx>
	//  339  818:getstatic       #105 <Field zzux zzux.zzbzi>
	//  340  821:invokespecial   #91  <Method void zzui(String, int, int, zzuk, zzux)>
	//  341  824:putstatic       #271 <Field zzui zzbwy>
		zzbwz = new zzui("UINT64_LIST_PACKED", 38, 38, zzuk.zzbxx, zzux.zzbzi);
	//  342  827:new             #2   <Class zzui>
	//  343  830:dup             
	//  344  831:ldc2            #273 <String "UINT64_LIST_PACKED">
	//  345  834:bipush          38
	//  346  836:bipush          38
	//  347  838:getstatic       #261 <Field zzuk zzuk.zzbxx>
	//  348  841:getstatic       #105 <Field zzux zzux.zzbzi>
	//  349  844:invokespecial   #91  <Method void zzui(String, int, int, zzuk, zzux)>
	//  350  847:putstatic       #275 <Field zzui zzbwz>
		zzbxa = new zzui("INT32_LIST_PACKED", 39, 39, zzuk.zzbxx, zzux.zzbzh);
	//  351  850:new             #2   <Class zzui>
	//  352  853:dup             
	//  353  854:ldc2            #277 <String "INT32_LIST_PACKED">
	//  354  857:bipush          39
	//  355  859:bipush          39
	//  356  861:getstatic       #261 <Field zzuk zzuk.zzbxx>
	//  357  864:getstatic       #116 <Field zzux zzux.zzbzh>
	//  358  867:invokespecial   #91  <Method void zzui(String, int, int, zzuk, zzux)>
	//  359  870:putstatic       #279 <Field zzui zzbxa>
		zzbxb = new zzui("FIXED64_LIST_PACKED", 40, 40, zzuk.zzbxx, zzux.zzbzi);
	//  360  873:new             #2   <Class zzui>
	//  361  876:dup             
	//  362  877:ldc2            #281 <String "FIXED64_LIST_PACKED">
	//  363  880:bipush          40
	//  364  882:bipush          40
	//  365  884:getstatic       #261 <Field zzuk zzuk.zzbxx>
	//  366  887:getstatic       #105 <Field zzux zzux.zzbzi>
	//  367  890:invokespecial   #91  <Method void zzui(String, int, int, zzuk, zzux)>
	//  368  893:putstatic       #283 <Field zzui zzbxb>
		zzbxc = new zzui("FIXED32_LIST_PACKED", 41, 41, zzuk.zzbxx, zzux.zzbzh);
	//  369  896:new             #2   <Class zzui>
	//  370  899:dup             
	//  371  900:ldc2            #285 <String "FIXED32_LIST_PACKED">
	//  372  903:bipush          41
	//  373  905:bipush          41
	//  374  907:getstatic       #261 <Field zzuk zzuk.zzbxx>
	//  375  910:getstatic       #116 <Field zzux zzux.zzbzh>
	//  376  913:invokespecial   #91  <Method void zzui(String, int, int, zzuk, zzux)>
	//  377  916:putstatic       #287 <Field zzui zzbxc>
		zzbxd = new zzui("BOOL_LIST_PACKED", 42, 42, zzuk.zzbxx, zzux.zzbzl);
	//  378  919:new             #2   <Class zzui>
	//  379  922:dup             
	//  380  923:ldc2            #289 <String "BOOL_LIST_PACKED">
	//  381  926:bipush          42
	//  382  928:bipush          42
	//  383  930:getstatic       #261 <Field zzuk zzuk.zzbxx>
	//  384  933:getstatic       #131 <Field zzux zzux.zzbzl>
	//  385  936:invokespecial   #91  <Method void zzui(String, int, int, zzuk, zzux)>
	//  386  939:putstatic       #291 <Field zzui zzbxd>
		zzbxe = new zzui("UINT32_LIST_PACKED", 43, 43, zzuk.zzbxx, zzux.zzbzh);
	//  387  942:new             #2   <Class zzui>
	//  388  945:dup             
	//  389  946:ldc2            #293 <String "UINT32_LIST_PACKED">
	//  390  949:bipush          43
	//  391  951:bipush          43
	//  392  953:getstatic       #261 <Field zzuk zzuk.zzbxx>
	//  393  956:getstatic       #116 <Field zzux zzux.zzbzh>
	//  394  959:invokespecial   #91  <Method void zzui(String, int, int, zzuk, zzux)>
	//  395  962:putstatic       #295 <Field zzui zzbxe>
		zzbxf = new zzui("ENUM_LIST_PACKED", 44, 44, zzuk.zzbxx, zzux.zzbzo);
	//  396  965:new             #2   <Class zzui>
	//  397  968:dup             
	//  398  969:ldc2            #297 <String "ENUM_LIST_PACKED">
	//  399  972:bipush          44
	//  400  974:bipush          44
	//  401  976:getstatic       #261 <Field zzuk zzuk.zzbxx>
	//  402  979:getstatic       #163 <Field zzux zzux.zzbzo>
	//  403  982:invokespecial   #91  <Method void zzui(String, int, int, zzuk, zzux)>
	//  404  985:putstatic       #299 <Field zzui zzbxf>
		zzbxg = new zzui("SFIXED32_LIST_PACKED", 45, 45, zzuk.zzbxx, zzux.zzbzh);
	//  405  988:new             #2   <Class zzui>
	//  406  991:dup             
	//  407  992:ldc2            #301 <String "SFIXED32_LIST_PACKED">
	//  408  995:bipush          45
	//  409  997:bipush          45
	//  410  999:getstatic       #261 <Field zzuk zzuk.zzbxx>
	//  411 1002:getstatic       #116 <Field zzux zzux.zzbzh>
	//  412 1005:invokespecial   #91  <Method void zzui(String, int, int, zzuk, zzux)>
	//  413 1008:putstatic       #303 <Field zzui zzbxg>
		zzbxh = new zzui("SFIXED64_LIST_PACKED", 46, 46, zzuk.zzbxx, zzux.zzbzi);
	//  414 1011:new             #2   <Class zzui>
	//  415 1014:dup             
	//  416 1015:ldc2            #305 <String "SFIXED64_LIST_PACKED">
	//  417 1018:bipush          46
	//  418 1020:bipush          46
	//  419 1022:getstatic       #261 <Field zzuk zzuk.zzbxx>
	//  420 1025:getstatic       #105 <Field zzux zzux.zzbzi>
	//  421 1028:invokespecial   #91  <Method void zzui(String, int, int, zzuk, zzux)>
	//  422 1031:putstatic       #307 <Field zzui zzbxh>
		zzbxi = new zzui("SINT32_LIST_PACKED", 47, 47, zzuk.zzbxx, zzux.zzbzh);
	//  423 1034:new             #2   <Class zzui>
	//  424 1037:dup             
	//  425 1038:ldc2            #309 <String "SINT32_LIST_PACKED">
	//  426 1041:bipush          47
	//  427 1043:bipush          47
	//  428 1045:getstatic       #261 <Field zzuk zzuk.zzbxx>
	//  429 1048:getstatic       #116 <Field zzux zzux.zzbzh>
	//  430 1051:invokespecial   #91  <Method void zzui(String, int, int, zzuk, zzux)>
	//  431 1054:putstatic       #311 <Field zzui zzbxi>
		zzbxj = new zzui("SINT64_LIST_PACKED", 48, 48, zzuk.zzbxx, zzux.zzbzi);
	//  432 1057:new             #2   <Class zzui>
	//  433 1060:dup             
	//  434 1061:ldc2            #313 <String "SINT64_LIST_PACKED">
	//  435 1064:bipush          48
	//  436 1066:bipush          48
	//  437 1068:getstatic       #261 <Field zzuk zzuk.zzbxx>
	//  438 1071:getstatic       #105 <Field zzux zzux.zzbzi>
	//  439 1074:invokespecial   #91  <Method void zzui(String, int, int, zzuk, zzux)>
	//  440 1077:putstatic       #315 <Field zzui zzbxj>
		zzbxk = new zzui("GROUP_LIST", 49, 49, zzuk.zzbxw, zzux.zzbzp);
	//  441 1080:new             #2   <Class zzui>
	//  442 1083:dup             
	//  443 1084:ldc2            #317 <String "GROUP_LIST">
	//  444 1087:bipush          49
	//  445 1089:bipush          49
	//  446 1091:getstatic       #190 <Field zzuk zzuk.zzbxw>
	//  447 1094:getstatic       #145 <Field zzux zzux.zzbzp>
	//  448 1097:invokespecial   #91  <Method void zzui(String, int, int, zzuk, zzux)>
	//  449 1100:putstatic       #319 <Field zzui zzbxk>
		zzbxl = new zzui("MAP", 50, 50, zzuk.zzbxy, zzux.zzbzg);
	//  450 1103:new             #2   <Class zzui>
	//  451 1106:dup             
	//  452 1107:ldc2            #321 <String "MAP">
	//  453 1110:bipush          50
	//  454 1112:bipush          50
	//  455 1114:getstatic       #324 <Field zzuk zzuk.zzbxy>
	//  456 1117:getstatic       #327 <Field zzux zzux.zzbzg>
	//  457 1120:invokespecial   #91  <Method void zzui(String, int, int, zzuk, zzux)>
	//  458 1123:putstatic       #329 <Field zzui zzbxl>
		zzui zzui1 = zzbvn;
	//  459 1126:getstatic       #93  <Field zzui zzbvn>
	//  460 1129:astore_2        
		int i = 0;
	//  461 1130:iconst_0        
	//  462 1131:istore_0        
		zzbxs = (new zzui[] {
			zzui1, zzbvo, zzbvp, zzbvq, zzbvr, zzbvs, zzbvt, zzbvu, zzbvv, zzbvw, 
			zzbvx, zzbvy, zzbvz, zzbwa, zzbwb, zzbwc, zzbwd, zzbwe, zzbwf, zzbwg, 
			zzbwh, zzbwi, zzbwj, zzbwk, zzbwl, zzbwm, zzbwn, zzbwo, zzbwp, zzbwq, 
			zzbwr, zzbws, zzbwt, zzbwu, zzbwv, zzbww, zzbwx, zzbwy, zzbwz, zzbxa, 
			zzbxb, zzbxc, zzbxd, zzbxe, zzbxf, zzbxg, zzbxh, zzbxi, zzbxj, zzbxk, 
			zzbxl
		});
	//  463 1132:bipush          51
	//  464 1134:anewarray       zzui[]
	//  465 1137:dup             
	//  466 1138:iconst_0        
	//  467 1139:aload_2         
	//  468 1140:aastore         
	//  469 1141:dup             
	//  470 1142:iconst_1        
	//  471 1143:getstatic       #100 <Field zzui zzbvo>
	//  472 1146:aastore         
	//  473 1147:dup             
	//  474 1148:iconst_2        
	//  475 1149:getstatic       #107 <Field zzui zzbvp>
	//  476 1152:aastore         
	//  477 1153:dup             
	//  478 1154:iconst_3        
	//  479 1155:getstatic       #111 <Field zzui zzbvq>
	//  480 1158:aastore         
	//  481 1159:dup             
	//  482 1160:iconst_4        
	//  483 1161:getstatic       #118 <Field zzui zzbvr>
	//  484 1164:aastore         
	//  485 1165:dup             
	//  486 1166:iconst_5        
	//  487 1167:getstatic       #122 <Field zzui zzbvs>
	//  488 1170:aastore         
	//  489 1171:dup             
	//  490 1172:bipush          6
	//  491 1174:getstatic       #126 <Field zzui zzbvt>
	//  492 1177:aastore         
	//  493 1178:dup             
	//  494 1179:bipush          7
	//  495 1181:getstatic       #133 <Field zzui zzbvu>
	//  496 1184:aastore         
	//  497 1185:dup             
	//  498 1186:bipush          8
	//  499 1188:getstatic       #140 <Field zzui zzbvv>
	//  500 1191:aastore         
	//  501 1192:dup             
	//  502 1193:bipush          9
	//  503 1195:getstatic       #147 <Field zzui zzbvw>
	//  504 1198:aastore         
	//  505 1199:dup             
	//  506 1200:bipush          10
	//  507 1202:getstatic       #154 <Field zzui zzbvx>
	//  508 1205:aastore         
	//  509 1206:dup             
	//  510 1207:bipush          11
	//  511 1209:getstatic       #158 <Field zzui zzbvy>
	//  512 1212:aastore         
	//  513 1213:dup             
	//  514 1214:bipush          12
	//  515 1216:getstatic       #165 <Field zzui zzbvz>
	//  516 1219:aastore         
	//  517 1220:dup             
	//  518 1221:bipush          13
	//  519 1223:getstatic       #169 <Field zzui zzbwa>
	//  520 1226:aastore         
	//  521 1227:dup             
	//  522 1228:bipush          14
	//  523 1230:getstatic       #173 <Field zzui zzbwb>
	//  524 1233:aastore         
	//  525 1234:dup             
	//  526 1235:bipush          15
	//  527 1237:getstatic       #177 <Field zzui zzbwc>
	//  528 1240:aastore         
	//  529 1241:dup             
	//  530 1242:bipush          16
	//  531 1244:getstatic       #181 <Field zzui zzbwd>
	//  532 1247:aastore         
	//  533 1248:dup             
	//  534 1249:bipush          17
	//  535 1251:getstatic       #185 <Field zzui zzbwe>
	//  536 1254:aastore         
	//  537 1255:dup             
	//  538 1256:bipush          18
	//  539 1258:getstatic       #192 <Field zzui zzbwf>
	//  540 1261:aastore         
	//  541 1262:dup             
	//  542 1263:bipush          19
	//  543 1265:getstatic       #196 <Field zzui zzbwg>
	//  544 1268:aastore         
	//  545 1269:dup             
	//  546 1270:bipush          20
	//  547 1272:getstatic       #200 <Field zzui zzbwh>
	//  548 1275:aastore         
	//  549 1276:dup             
	//  550 1277:bipush          21
	//  551 1279:getstatic       #204 <Field zzui zzbwi>
	//  552 1282:aastore         
	//  553 1283:dup             
	//  554 1284:bipush          22
	//  555 1286:getstatic       #208 <Field zzui zzbwj>
	//  556 1289:aastore         
	//  557 1290:dup             
	//  558 1291:bipush          23
	//  559 1293:getstatic       #212 <Field zzui zzbwk>
	//  560 1296:aastore         
	//  561 1297:dup             
	//  562 1298:bipush          24
	//  563 1300:getstatic       #216 <Field zzui zzbwl>
	//  564 1303:aastore         
	//  565 1304:dup             
	//  566 1305:bipush          25
	//  567 1307:getstatic       #220 <Field zzui zzbwm>
	//  568 1310:aastore         
	//  569 1311:dup             
	//  570 1312:bipush          26
	//  571 1314:getstatic       #224 <Field zzui zzbwn>
	//  572 1317:aastore         
	//  573 1318:dup             
	//  574 1319:bipush          27
	//  575 1321:getstatic       #228 <Field zzui zzbwo>
	//  576 1324:aastore         
	//  577 1325:dup             
	//  578 1326:bipush          28
	//  579 1328:getstatic       #232 <Field zzui zzbwp>
	//  580 1331:aastore         
	//  581 1332:dup             
	//  582 1333:bipush          29
	//  583 1335:getstatic       #236 <Field zzui zzbwq>
	//  584 1338:aastore         
	//  585 1339:dup             
	//  586 1340:bipush          30
	//  587 1342:getstatic       #240 <Field zzui zzbwr>
	//  588 1345:aastore         
	//  589 1346:dup             
	//  590 1347:bipush          31
	//  591 1349:getstatic       #244 <Field zzui zzbws>
	//  592 1352:aastore         
	//  593 1353:dup             
	//  594 1354:bipush          32
	//  595 1356:getstatic       #248 <Field zzui zzbwt>
	//  596 1359:aastore         
	//  597 1360:dup             
	//  598 1361:bipush          33
	//  599 1363:getstatic       #252 <Field zzui zzbwu>
	//  600 1366:aastore         
	//  601 1367:dup             
	//  602 1368:bipush          34
	//  603 1370:getstatic       #256 <Field zzui zzbwv>
	//  604 1373:aastore         
	//  605 1374:dup             
	//  606 1375:bipush          35
	//  607 1377:getstatic       #263 <Field zzui zzbww>
	//  608 1380:aastore         
	//  609 1381:dup             
	//  610 1382:bipush          36
	//  611 1384:getstatic       #267 <Field zzui zzbwx>
	//  612 1387:aastore         
	//  613 1388:dup             
	//  614 1389:bipush          37
	//  615 1391:getstatic       #271 <Field zzui zzbwy>
	//  616 1394:aastore         
	//  617 1395:dup             
	//  618 1396:bipush          38
	//  619 1398:getstatic       #275 <Field zzui zzbwz>
	//  620 1401:aastore         
	//  621 1402:dup             
	//  622 1403:bipush          39
	//  623 1405:getstatic       #279 <Field zzui zzbxa>
	//  624 1408:aastore         
	//  625 1409:dup             
	//  626 1410:bipush          40
	//  627 1412:getstatic       #283 <Field zzui zzbxb>
	//  628 1415:aastore         
	//  629 1416:dup             
	//  630 1417:bipush          41
	//  631 1419:getstatic       #287 <Field zzui zzbxc>
	//  632 1422:aastore         
	//  633 1423:dup             
	//  634 1424:bipush          42
	//  635 1426:getstatic       #291 <Field zzui zzbxd>
	//  636 1429:aastore         
	//  637 1430:dup             
	//  638 1431:bipush          43
	//  639 1433:getstatic       #295 <Field zzui zzbxe>
	//  640 1436:aastore         
	//  641 1437:dup             
	//  642 1438:bipush          44
	//  643 1440:getstatic       #299 <Field zzui zzbxf>
	//  644 1443:aastore         
	//  645 1444:dup             
	//  646 1445:bipush          45
	//  647 1447:getstatic       #303 <Field zzui zzbxg>
	//  648 1450:aastore         
	//  649 1451:dup             
	//  650 1452:bipush          46
	//  651 1454:getstatic       #307 <Field zzui zzbxh>
	//  652 1457:aastore         
	//  653 1458:dup             
	//  654 1459:bipush          47
	//  655 1461:getstatic       #311 <Field zzui zzbxi>
	//  656 1464:aastore         
	//  657 1465:dup             
	//  658 1466:bipush          48
	//  659 1468:getstatic       #315 <Field zzui zzbxj>
	//  660 1471:aastore         
	//  661 1472:dup             
	//  662 1473:bipush          49
	//  663 1475:getstatic       #319 <Field zzui zzbxk>
	//  664 1478:aastore         
	//  665 1479:dup             
	//  666 1480:bipush          50
	//  667 1482:getstatic       #329 <Field zzui zzbxl>
	//  668 1485:aastore         
	//  669 1486:putstatic       #331 <Field zzui[] zzbxs>
	//  670 1489:iconst_0        
	//  671 1490:anewarray       Type[]
	//  672 1493:putstatic       #335 <Field Type[] zzbxr>
		zzui azzui[] = values();
	//  673 1496:invokestatic    #339 <Method zzui[] values()>
	//  674 1499:astore_2        
		zzbxq = new zzui[azzui.length];
	//  675 1500:aload_2         
	//  676 1501:arraylength     
	//  677 1502:anewarray       zzui[]
	//  678 1505:putstatic       #341 <Field zzui[] zzbxq>
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
			zzbxq[zzui2.id] = zzui2;
	//  689 1520:getstatic       #341 <Field zzui[] zzbxq>
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
