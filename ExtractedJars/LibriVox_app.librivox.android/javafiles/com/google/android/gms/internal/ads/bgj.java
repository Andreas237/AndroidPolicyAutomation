// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			bnw

class bgj
{

	public bgj(int i1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #482 <Method void Object()>
		aO = i1;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #484 <Field int aO>
	//    5    9:return          
	}

	public static int a(int i1)
	{
		return i1 >> 24 & 0xff;
	//    0    0:iload_0         
	//    1    1:bipush          24
	//    2    3:ishr            
	//    3    4:sipush          255
	//    4    7:iand            
	//    5    8:ireturn         
	}

	public static int b(int i1)
	{
		return i1 & 0xffffff;
	//    0    0:iload_0         
	//    1    1:ldc2            #486 <Int 0xffffff>
	//    2    4:iand            
	//    3    5:ireturn         
	}

	public static String c(int i1)
	{
		char c1 = (char)(i1 >>> 24);
	//    0    0:iload_0         
	//    1    1:bipush          24
	//    2    3:iushr           
	//    3    4:int2char        
	//    4    5:istore_1        
		char c2 = (char)(i1 >> 16 & 0xff);
	//    5    6:iload_0         
	//    6    7:bipush          16
	//    7    9:ishr            
	//    8   10:sipush          255
	//    9   13:iand            
	//   10   14:int2char        
	//   11   15:istore_2        
		char c3 = (char)(i1 >> 8 & 0xff);
	//   12   16:iload_0         
	//   13   17:bipush          8
	//   14   19:ishr            
	//   15   20:sipush          255
	//   16   23:iand            
	//   17   24:int2char        
	//   18   25:istore_3        
		char c4 = (char)(i1 & 0xff);
	//   19   26:iload_0         
	//   20   27:sipush          255
	//   21   30:iand            
	//   22   31:int2char        
	//   23   32:istore          4
		StringBuilder stringbuilder = new StringBuilder(4);
	//   24   34:new             #489 <Class StringBuilder>
	//   25   37:dup             
	//   26   38:iconst_4        
	//   27   39:invokespecial   #491 <Method void StringBuilder(int)>
	//   28   42:astore          5
		stringbuilder.append(c1);
	//   29   44:aload           5
	//   30   46:iload_1         
	//   31   47:invokevirtual   #495 <Method StringBuilder StringBuilder.append(char)>
	//   32   50:pop             
		stringbuilder.append(c2);
	//   33   51:aload           5
	//   34   53:iload_2         
	//   35   54:invokevirtual   #495 <Method StringBuilder StringBuilder.append(char)>
	//   36   57:pop             
		stringbuilder.append(c3);
	//   37   58:aload           5
	//   38   60:iload_3         
	//   39   61:invokevirtual   #495 <Method StringBuilder StringBuilder.append(char)>
	//   40   64:pop             
		stringbuilder.append(c4);
	//   41   65:aload           5
	//   42   67:iload           4
	//   43   69:invokevirtual   #495 <Method StringBuilder StringBuilder.append(char)>
	//   44   72:pop             
		return stringbuilder.toString();
	//   45   73:aload           5
	//   46   75:invokevirtual   #499 <Method String StringBuilder.toString()>
	//   47   78:areturn         
	}

	public String toString()
	{
		return c(aO);
	//    0    0:aload_0         
	//    1    1:getfield        #484 <Field int aO>
	//    2    4:invokestatic    #501 <Method String c(int)>
	//    3    7:areturn         
	}

	public static final int A = bnw.f("sidx");
	public static final int B = bnw.f("moov");
	public static final int C = bnw.f("mvhd");
	public static final int D = bnw.f("trak");
	public static final int E = bnw.f("mdia");
	public static final int F = bnw.f("minf");
	public static final int G = bnw.f("stbl");
	public static final int H = bnw.f("avcC");
	public static final int I = bnw.f("hvcC");
	public static final int J = bnw.f("esds");
	public static final int K = bnw.f("moof");
	public static final int L = bnw.f("traf");
	public static final int M = bnw.f("mvex");
	public static final int N = bnw.f("mehd");
	public static final int O = bnw.f("tkhd");
	public static final int P = bnw.f("edts");
	public static final int Q = bnw.f("elst");
	public static final int R = bnw.f("mdhd");
	public static final int S = bnw.f("hdlr");
	public static final int T = bnw.f("stsd");
	public static final int U = bnw.f("pssh");
	public static final int V = bnw.f("sinf");
	public static final int W = bnw.f("schm");
	public static final int X = bnw.f("schi");
	public static final int Y = bnw.f("tenc");
	public static final int Z = bnw.f("encv");
	public static final int a = bnw.f("ftyp");
	public static final int aA = bnw.f("meta");
	public static final int aB = bnw.f("ilst");
	public static final int aC = bnw.f("mean");
	public static final int aD = bnw.f("name");
	public static final int aE = bnw.f("data");
	public static final int aF = bnw.f("emsg");
	public static final int aG = bnw.f("st3d");
	public static final int aH = bnw.f("sv3d");
	public static final int aI = bnw.f("proj");
	public static final int aJ = bnw.f("vp08");
	public static final int aK = bnw.f("vp09");
	public static final int aL = bnw.f("vpcC");
	public static final int aM = bnw.f("camm");
	public static final int aN = bnw.f("alac");
	private static final int aP = bnw.f("vmhd");
	public static final int aa = bnw.f("enca");
	public static final int ab = bnw.f("frma");
	public static final int ac = bnw.f("saiz");
	public static final int ad = bnw.f("saio");
	public static final int ae = bnw.f("sbgp");
	public static final int af = bnw.f("sgpd");
	public static final int ag = bnw.f("uuid");
	public static final int ah = bnw.f("senc");
	public static final int ai = bnw.f("pasp");
	public static final int aj = bnw.f("TTML");
	public static final int ak = bnw.f("mp4v");
	public static final int al = bnw.f("stts");
	public static final int am = bnw.f("stss");
	public static final int an = bnw.f("ctts");
	public static final int ao = bnw.f("stsc");
	public static final int ap = bnw.f("stsz");
	public static final int aq = bnw.f("stz2");
	public static final int ar = bnw.f("stco");
	public static final int as = bnw.f("co64");
	public static final int at = bnw.f("tx3g");
	public static final int au = bnw.f("wvtt");
	public static final int av = bnw.f("stpp");
	public static final int aw = bnw.f("c608");
	public static final int ax = bnw.f("samr");
	public static final int ay = bnw.f("sawb");
	public static final int az = bnw.f("udta");
	public static final int b = bnw.f("avc1");
	public static final int c = bnw.f("avc3");
	public static final int d = bnw.f("hvc1");
	public static final int e = bnw.f("hev1");
	public static final int f = bnw.f("s263");
	public static final int g = bnw.f("d263");
	public static final int h = bnw.f("mdat");
	public static final int i = bnw.f("mp4a");
	public static final int j = bnw.f(".mp3");
	public static final int k = bnw.f("wave");
	public static final int l = bnw.f("lpcm");
	public static final int m = bnw.f("sowt");
	public static final int n = bnw.f("ac-3");
	public static final int o = bnw.f("dac3");
	public static final int p = bnw.f("ec-3");
	public static final int q = bnw.f("dec3");
	public static final int r = bnw.f("dtsc");
	public static final int s = bnw.f("dtsh");
	public static final int t = bnw.f("dtsl");
	public static final int u = bnw.f("dtse");
	public static final int v = bnw.f("ddts");
	public static final int w = bnw.f("tfdt");
	public static final int x = bnw.f("tfhd");
	public static final int y = bnw.f("trex");
	public static final int z = bnw.f("trun");
	public final int aO;

	static 
	{
	//    0    0:ldc1            #102 <String "ftyp">
	//    1    2:invokestatic    #107 <Method int bnw.f(String)>
	//    2    5:putstatic       #109 <Field int a>
	//    3    8:ldc1            #111 <String "avc1">
	//    4   10:invokestatic    #107 <Method int bnw.f(String)>
	//    5   13:putstatic       #113 <Field int b>
	//    6   16:ldc1            #115 <String "avc3">
	//    7   18:invokestatic    #107 <Method int bnw.f(String)>
	//    8   21:putstatic       #117 <Field int c>
	//    9   24:ldc1            #119 <String "hvc1">
	//   10   26:invokestatic    #107 <Method int bnw.f(String)>
	//   11   29:putstatic       #121 <Field int d>
	//   12   32:ldc1            #123 <String "hev1">
	//   13   34:invokestatic    #107 <Method int bnw.f(String)>
	//   14   37:putstatic       #125 <Field int e>
	//   15   40:ldc1            #127 <String "s263">
	//   16   42:invokestatic    #107 <Method int bnw.f(String)>
	//   17   45:putstatic       #129 <Field int f>
	//   18   48:ldc1            #131 <String "d263">
	//   19   50:invokestatic    #107 <Method int bnw.f(String)>
	//   20   53:putstatic       #133 <Field int g>
	//   21   56:ldc1            #135 <String "mdat">
	//   22   58:invokestatic    #107 <Method int bnw.f(String)>
	//   23   61:putstatic       #137 <Field int h>
	//   24   64:ldc1            #139 <String "mp4a">
	//   25   66:invokestatic    #107 <Method int bnw.f(String)>
	//   26   69:putstatic       #141 <Field int i>
	//   27   72:ldc1            #143 <String ".mp3">
	//   28   74:invokestatic    #107 <Method int bnw.f(String)>
	//   29   77:putstatic       #145 <Field int j>
	//   30   80:ldc1            #147 <String "wave">
	//   31   82:invokestatic    #107 <Method int bnw.f(String)>
	//   32   85:putstatic       #149 <Field int k>
	//   33   88:ldc1            #151 <String "lpcm">
	//   34   90:invokestatic    #107 <Method int bnw.f(String)>
	//   35   93:putstatic       #153 <Field int l>
	//   36   96:ldc1            #155 <String "sowt">
	//   37   98:invokestatic    #107 <Method int bnw.f(String)>
	//   38  101:putstatic       #157 <Field int m>
	//   39  104:ldc1            #159 <String "ac-3">
	//   40  106:invokestatic    #107 <Method int bnw.f(String)>
	//   41  109:putstatic       #161 <Field int n>
	//   42  112:ldc1            #163 <String "dac3">
	//   43  114:invokestatic    #107 <Method int bnw.f(String)>
	//   44  117:putstatic       #165 <Field int o>
	//   45  120:ldc1            #167 <String "ec-3">
	//   46  122:invokestatic    #107 <Method int bnw.f(String)>
	//   47  125:putstatic       #169 <Field int p>
	//   48  128:ldc1            #171 <String "dec3">
	//   49  130:invokestatic    #107 <Method int bnw.f(String)>
	//   50  133:putstatic       #173 <Field int q>
	//   51  136:ldc1            #175 <String "dtsc">
	//   52  138:invokestatic    #107 <Method int bnw.f(String)>
	//   53  141:putstatic       #177 <Field int r>
	//   54  144:ldc1            #179 <String "dtsh">
	//   55  146:invokestatic    #107 <Method int bnw.f(String)>
	//   56  149:putstatic       #181 <Field int s>
	//   57  152:ldc1            #183 <String "dtsl">
	//   58  154:invokestatic    #107 <Method int bnw.f(String)>
	//   59  157:putstatic       #185 <Field int t>
	//   60  160:ldc1            #187 <String "dtse">
	//   61  162:invokestatic    #107 <Method int bnw.f(String)>
	//   62  165:putstatic       #189 <Field int u>
	//   63  168:ldc1            #191 <String "ddts">
	//   64  170:invokestatic    #107 <Method int bnw.f(String)>
	//   65  173:putstatic       #193 <Field int v>
	//   66  176:ldc1            #195 <String "tfdt">
	//   67  178:invokestatic    #107 <Method int bnw.f(String)>
	//   68  181:putstatic       #197 <Field int w>
	//   69  184:ldc1            #199 <String "tfhd">
	//   70  186:invokestatic    #107 <Method int bnw.f(String)>
	//   71  189:putstatic       #201 <Field int x>
	//   72  192:ldc1            #203 <String "trex">
	//   73  194:invokestatic    #107 <Method int bnw.f(String)>
	//   74  197:putstatic       #205 <Field int y>
	//   75  200:ldc1            #207 <String "trun">
	//   76  202:invokestatic    #107 <Method int bnw.f(String)>
	//   77  205:putstatic       #209 <Field int z>
	//   78  208:ldc1            #211 <String "sidx">
	//   79  210:invokestatic    #107 <Method int bnw.f(String)>
	//   80  213:putstatic       #213 <Field int A>
	//   81  216:ldc1            #215 <String "moov">
	//   82  218:invokestatic    #107 <Method int bnw.f(String)>
	//   83  221:putstatic       #217 <Field int B>
	//   84  224:ldc1            #219 <String "mvhd">
	//   85  226:invokestatic    #107 <Method int bnw.f(String)>
	//   86  229:putstatic       #221 <Field int C>
	//   87  232:ldc1            #223 <String "trak">
	//   88  234:invokestatic    #107 <Method int bnw.f(String)>
	//   89  237:putstatic       #225 <Field int D>
	//   90  240:ldc1            #227 <String "mdia">
	//   91  242:invokestatic    #107 <Method int bnw.f(String)>
	//   92  245:putstatic       #229 <Field int E>
	//   93  248:ldc1            #231 <String "minf">
	//   94  250:invokestatic    #107 <Method int bnw.f(String)>
	//   95  253:putstatic       #233 <Field int F>
	//   96  256:ldc1            #235 <String "stbl">
	//   97  258:invokestatic    #107 <Method int bnw.f(String)>
	//   98  261:putstatic       #237 <Field int G>
	//   99  264:ldc1            #239 <String "avcC">
	//  100  266:invokestatic    #107 <Method int bnw.f(String)>
	//  101  269:putstatic       #241 <Field int H>
	//  102  272:ldc1            #243 <String "hvcC">
	//  103  274:invokestatic    #107 <Method int bnw.f(String)>
	//  104  277:putstatic       #245 <Field int I>
	//  105  280:ldc1            #247 <String "esds">
	//  106  282:invokestatic    #107 <Method int bnw.f(String)>
	//  107  285:putstatic       #249 <Field int J>
	//  108  288:ldc1            #251 <String "moof">
	//  109  290:invokestatic    #107 <Method int bnw.f(String)>
	//  110  293:putstatic       #253 <Field int K>
	//  111  296:ldc1            #255 <String "traf">
	//  112  298:invokestatic    #107 <Method int bnw.f(String)>
	//  113  301:putstatic       #257 <Field int L>
	//  114  304:ldc2            #259 <String "mvex">
	//  115  307:invokestatic    #107 <Method int bnw.f(String)>
	//  116  310:putstatic       #261 <Field int M>
	//  117  313:ldc2            #263 <String "mehd">
	//  118  316:invokestatic    #107 <Method int bnw.f(String)>
	//  119  319:putstatic       #265 <Field int N>
	//  120  322:ldc2            #267 <String "tkhd">
	//  121  325:invokestatic    #107 <Method int bnw.f(String)>
	//  122  328:putstatic       #269 <Field int O>
	//  123  331:ldc2            #271 <String "edts">
	//  124  334:invokestatic    #107 <Method int bnw.f(String)>
	//  125  337:putstatic       #273 <Field int P>
	//  126  340:ldc2            #275 <String "elst">
	//  127  343:invokestatic    #107 <Method int bnw.f(String)>
	//  128  346:putstatic       #277 <Field int Q>
	//  129  349:ldc2            #279 <String "mdhd">
	//  130  352:invokestatic    #107 <Method int bnw.f(String)>
	//  131  355:putstatic       #281 <Field int R>
	//  132  358:ldc2            #283 <String "hdlr">
	//  133  361:invokestatic    #107 <Method int bnw.f(String)>
	//  134  364:putstatic       #285 <Field int S>
	//  135  367:ldc2            #287 <String "stsd">
	//  136  370:invokestatic    #107 <Method int bnw.f(String)>
	//  137  373:putstatic       #289 <Field int T>
	//  138  376:ldc2            #291 <String "pssh">
	//  139  379:invokestatic    #107 <Method int bnw.f(String)>
	//  140  382:putstatic       #293 <Field int U>
	//  141  385:ldc2            #295 <String "sinf">
	//  142  388:invokestatic    #107 <Method int bnw.f(String)>
	//  143  391:putstatic       #297 <Field int V>
	//  144  394:ldc2            #299 <String "schm">
	//  145  397:invokestatic    #107 <Method int bnw.f(String)>
	//  146  400:putstatic       #301 <Field int W>
	//  147  403:ldc2            #303 <String "schi">
	//  148  406:invokestatic    #107 <Method int bnw.f(String)>
	//  149  409:putstatic       #305 <Field int X>
	//  150  412:ldc2            #307 <String "tenc">
	//  151  415:invokestatic    #107 <Method int bnw.f(String)>
	//  152  418:putstatic       #309 <Field int Y>
	//  153  421:ldc2            #311 <String "encv">
	//  154  424:invokestatic    #107 <Method int bnw.f(String)>
	//  155  427:putstatic       #313 <Field int Z>
	//  156  430:ldc2            #315 <String "enca">
	//  157  433:invokestatic    #107 <Method int bnw.f(String)>
	//  158  436:putstatic       #317 <Field int aa>
	//  159  439:ldc2            #319 <String "frma">
	//  160  442:invokestatic    #107 <Method int bnw.f(String)>
	//  161  445:putstatic       #321 <Field int ab>
	//  162  448:ldc2            #323 <String "saiz">
	//  163  451:invokestatic    #107 <Method int bnw.f(String)>
	//  164  454:putstatic       #325 <Field int ac>
	//  165  457:ldc2            #327 <String "saio">
	//  166  460:invokestatic    #107 <Method int bnw.f(String)>
	//  167  463:putstatic       #329 <Field int ad>
	//  168  466:ldc2            #331 <String "sbgp">
	//  169  469:invokestatic    #107 <Method int bnw.f(String)>
	//  170  472:putstatic       #333 <Field int ae>
	//  171  475:ldc2            #335 <String "sgpd">
	//  172  478:invokestatic    #107 <Method int bnw.f(String)>
	//  173  481:putstatic       #337 <Field int af>
	//  174  484:ldc2            #339 <String "uuid">
	//  175  487:invokestatic    #107 <Method int bnw.f(String)>
	//  176  490:putstatic       #341 <Field int ag>
	//  177  493:ldc2            #343 <String "senc">
	//  178  496:invokestatic    #107 <Method int bnw.f(String)>
	//  179  499:putstatic       #345 <Field int ah>
	//  180  502:ldc2            #347 <String "pasp">
	//  181  505:invokestatic    #107 <Method int bnw.f(String)>
	//  182  508:putstatic       #349 <Field int ai>
	//  183  511:ldc2            #351 <String "TTML">
	//  184  514:invokestatic    #107 <Method int bnw.f(String)>
	//  185  517:putstatic       #353 <Field int aj>
	//  186  520:ldc2            #355 <String "vmhd">
	//  187  523:invokestatic    #107 <Method int bnw.f(String)>
	//  188  526:putstatic       #357 <Field int aP>
	//  189  529:ldc2            #359 <String "mp4v">
	//  190  532:invokestatic    #107 <Method int bnw.f(String)>
	//  191  535:putstatic       #361 <Field int ak>
	//  192  538:ldc2            #363 <String "stts">
	//  193  541:invokestatic    #107 <Method int bnw.f(String)>
	//  194  544:putstatic       #365 <Field int al>
	//  195  547:ldc2            #367 <String "stss">
	//  196  550:invokestatic    #107 <Method int bnw.f(String)>
	//  197  553:putstatic       #369 <Field int am>
	//  198  556:ldc2            #371 <String "ctts">
	//  199  559:invokestatic    #107 <Method int bnw.f(String)>
	//  200  562:putstatic       #373 <Field int an>
	//  201  565:ldc2            #375 <String "stsc">
	//  202  568:invokestatic    #107 <Method int bnw.f(String)>
	//  203  571:putstatic       #377 <Field int ao>
	//  204  574:ldc2            #379 <String "stsz">
	//  205  577:invokestatic    #107 <Method int bnw.f(String)>
	//  206  580:putstatic       #381 <Field int ap>
	//  207  583:ldc2            #383 <String "stz2">
	//  208  586:invokestatic    #107 <Method int bnw.f(String)>
	//  209  589:putstatic       #385 <Field int aq>
	//  210  592:ldc2            #387 <String "stco">
	//  211  595:invokestatic    #107 <Method int bnw.f(String)>
	//  212  598:putstatic       #389 <Field int ar>
	//  213  601:ldc2            #391 <String "co64">
	//  214  604:invokestatic    #107 <Method int bnw.f(String)>
	//  215  607:putstatic       #393 <Field int as>
	//  216  610:ldc2            #395 <String "tx3g">
	//  217  613:invokestatic    #107 <Method int bnw.f(String)>
	//  218  616:putstatic       #397 <Field int at>
	//  219  619:ldc2            #399 <String "wvtt">
	//  220  622:invokestatic    #107 <Method int bnw.f(String)>
	//  221  625:putstatic       #401 <Field int au>
	//  222  628:ldc2            #403 <String "stpp">
	//  223  631:invokestatic    #107 <Method int bnw.f(String)>
	//  224  634:putstatic       #405 <Field int av>
	//  225  637:ldc2            #407 <String "c608">
	//  226  640:invokestatic    #107 <Method int bnw.f(String)>
	//  227  643:putstatic       #409 <Field int aw>
	//  228  646:ldc2            #411 <String "samr">
	//  229  649:invokestatic    #107 <Method int bnw.f(String)>
	//  230  652:putstatic       #413 <Field int ax>
	//  231  655:ldc2            #415 <String "sawb">
	//  232  658:invokestatic    #107 <Method int bnw.f(String)>
	//  233  661:putstatic       #417 <Field int ay>
	//  234  664:ldc2            #419 <String "udta">
	//  235  667:invokestatic    #107 <Method int bnw.f(String)>
	//  236  670:putstatic       #421 <Field int az>
	//  237  673:ldc2            #423 <String "meta">
	//  238  676:invokestatic    #107 <Method int bnw.f(String)>
	//  239  679:putstatic       #425 <Field int aA>
	//  240  682:ldc2            #427 <String "ilst">
	//  241  685:invokestatic    #107 <Method int bnw.f(String)>
	//  242  688:putstatic       #429 <Field int aB>
	//  243  691:ldc2            #431 <String "mean">
	//  244  694:invokestatic    #107 <Method int bnw.f(String)>
	//  245  697:putstatic       #433 <Field int aC>
	//  246  700:ldc2            #435 <String "name">
	//  247  703:invokestatic    #107 <Method int bnw.f(String)>
	//  248  706:putstatic       #437 <Field int aD>
	//  249  709:ldc2            #439 <String "data">
	//  250  712:invokestatic    #107 <Method int bnw.f(String)>
	//  251  715:putstatic       #441 <Field int aE>
	//  252  718:ldc2            #443 <String "emsg">
	//  253  721:invokestatic    #107 <Method int bnw.f(String)>
	//  254  724:putstatic       #445 <Field int aF>
	//  255  727:ldc2            #447 <String "st3d">
	//  256  730:invokestatic    #107 <Method int bnw.f(String)>
	//  257  733:putstatic       #449 <Field int aG>
	//  258  736:ldc2            #451 <String "sv3d">
	//  259  739:invokestatic    #107 <Method int bnw.f(String)>
	//  260  742:putstatic       #453 <Field int aH>
	//  261  745:ldc2            #455 <String "proj">
	//  262  748:invokestatic    #107 <Method int bnw.f(String)>
	//  263  751:putstatic       #457 <Field int aI>
	//  264  754:ldc2            #459 <String "vp08">
	//  265  757:invokestatic    #107 <Method int bnw.f(String)>
	//  266  760:putstatic       #461 <Field int aJ>
	//  267  763:ldc2            #463 <String "vp09">
	//  268  766:invokestatic    #107 <Method int bnw.f(String)>
	//  269  769:putstatic       #465 <Field int aK>
	//  270  772:ldc2            #467 <String "vpcC">
	//  271  775:invokestatic    #107 <Method int bnw.f(String)>
	//  272  778:putstatic       #469 <Field int aL>
	//  273  781:ldc2            #471 <String "camm">
	//  274  784:invokestatic    #107 <Method int bnw.f(String)>
	//  275  787:putstatic       #473 <Field int aM>
	//  276  790:ldc2            #475 <String "alac">
	//  277  793:invokestatic    #107 <Method int bnw.f(String)>
	//  278  796:putstatic       #477 <Field int aN>
	//* 279  799:return          
	}
}
