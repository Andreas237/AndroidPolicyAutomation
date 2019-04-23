// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.util.*;
import java.util.*;

// Referenced classes of package com.google.android.gms.internal.ads:
//			bfm, bgy, bnw, bno, 
//			bnl, bgl, bgj, bhf, 
//			zzhp, bgk, bnf, bgu, 
//			bgm, bhh, bha, bfp, 
//			zzfs, bfw, bhj, bhi, 
//			bdj, bhg, bfq, bnt, 
//			bfo, bft

public final class bgx
	implements bfm
{

	public bgx()
	{
		this(0);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:invokespecial   #92  <Method void bgx(int)>
	//    3    5:return          
	}

	public bgx(int i1)
	{
		this(i1, ((bnt) (null)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #95  <Method void bgx(int, bnt)>
	//    4    6:return          
	}

	private bgx(int i1, bnt bnt)
	{
		this(i1, ((bnt) (null)), ((bhh) (null)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aconst_null     
	//    3    3:aconst_null     
	//    4    4:invokespecial   #98  <Method void bgx(int, bnt, bhh)>
	//    5    7:return          
	}

	private bgx(int i1, bnt bnt, bhh bhh1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #99  <Method void Object()>
		d = i1;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #101 <Field int d>
		k = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #103 <Field bnt k>
		e = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #105 <Field bhh e>
		l = new bno(16);
	//   11   19:aload_0         
	//   12   20:new             #107 <Class bno>
	//   13   23:dup             
	//   14   24:bipush          16
	//   15   26:invokespecial   #108 <Method void bno(int)>
	//   16   29:putfield        #110 <Field bno l>
		g = new bno(bnl.a);
	//   17   32:aload_0         
	//   18   33:new             #107 <Class bno>
	//   19   36:dup             
	//   20   37:getstatic       #114 <Field byte[] bnl.a>
	//   21   40:invokespecial   #117 <Method void bno(byte[])>
	//   22   43:putfield        #119 <Field bno g>
		h = new bno(5);
	//   23   46:aload_0         
	//   24   47:new             #107 <Class bno>
	//   25   50:dup             
	//   26   51:iconst_5        
	//   27   52:invokespecial   #108 <Method void bno(int)>
	//   28   55:putfield        #121 <Field bno h>
		i = new bno();
	//   29   58:aload_0         
	//   30   59:new             #107 <Class bno>
	//   31   62:dup             
	//   32   63:invokespecial   #122 <Method void bno()>
	//   33   66:putfield        #124 <Field bno i>
		j = new bno(1);
	//   34   69:aload_0         
	//   35   70:new             #107 <Class bno>
	//   36   73:dup             
	//   37   74:iconst_1        
	//   38   75:invokespecial   #108 <Method void bno(int)>
	//   39   78:putfield        #126 <Field bno j>
		m = new byte[16];
	//   40   81:aload_0         
	//   41   82:bipush          16
	//   42   84:newarray        byte[]
	//   43   86:putfield        #128 <Field byte[] m>
		n = new Stack();
	//   44   89:aload_0         
	//   45   90:new             #130 <Class Stack>
	//   46   93:dup             
	//   47   94:invokespecial   #131 <Method void Stack()>
	//   48   97:putfield        #133 <Field Stack n>
		o = new LinkedList();
	//   49  100:aload_0         
	//   50  101:new             #135 <Class LinkedList>
	//   51  104:dup             
	//   52  105:invokespecial   #136 <Method void LinkedList()>
	//   53  108:putfield        #138 <Field LinkedList o>
		f = new SparseArray();
	//   54  111:aload_0         
	//   55  112:new             #140 <Class SparseArray>
	//   56  115:dup             
	//   57  116:invokespecial   #141 <Method void SparseArray()>
	//   58  119:putfield        #143 <Field SparseArray f>
		w = 0x1L;
	//   59  122:aload_0         
	//   60  123:ldc2w           #144 <Long 0x1L>
	//   61  126:putfield        #147 <Field long w>
		x = 0x1L;
	//   62  129:aload_0         
	//   63  130:ldc2w           #144 <Long 0x1L>
	//   64  133:putfield        #149 <Field long x>
		a();
	//   65  136:aload_0         
	//   66  137:invokespecial   #151 <Method void a()>
	//   67  140:return          
	}

	private static zzhp a(List list)
	{
		int j1 = list.size();
	//    0    0:aload_0         
	//    1    1:invokeinterface #158 <Method int List.size()>
	//    2    6:istore_2        
		int i1 = 0;
	//    3    7:iconst_0        
	//    4    8:istore_1        
		Object obj;
		byte abyte0[];
		for(abyte0 = null; i1 < j1; abyte0 = ((byte []) (obj)))
	//*   5    9:aconst_null     
	//*   6   10:astore          4
	//*   7   12:iload_1         
	//*   8   13:iload_2         
	//*   9   14:icmpge          120
		{
			Object obj1 = ((Object) ((bgl)list.get(i1)));
	//   10   17:aload_0         
	//   11   18:iload_1         
	//   12   19:invokeinterface #162 <Method Object List.get(int)>
	//   13   24:checkcast       #164 <Class bgl>
	//   14   27:astore          5
			obj = ((Object) (abyte0));
	//   15   29:aload           4
	//   16   31:astore_3        
			if(((bgl) (obj1)).aO == bgj.U)
	//*  17   32:aload           5
	//*  18   34:getfield        #167 <Field int bgl.aO>
	//*  19   37:getstatic       #172 <Field int bgj.U>
	//*  20   40:icmpne          110
			{
				obj = ((Object) (abyte0));
	//   21   43:aload           4
	//   22   45:astore_3        
				if(abyte0 == null)
	//*  23   46:aload           4
	//*  24   48:ifnonnull       59
					obj = ((Object) (new ArrayList()));
	//   25   51:new             #174 <Class ArrayList>
	//   26   54:dup             
	//   27   55:invokespecial   #175 <Method void ArrayList()>
	//   28   58:astore_3        
				abyte0 = ((bgl) (obj1)).aP.a;
	//   29   59:aload           5
	//   30   61:getfield        #178 <Field bno bgl.aP>
	//   31   64:getfield        #179 <Field byte[] bno.a>
	//   32   67:astore          4
				obj1 = ((Object) (bhf.a(abyte0)));
	//   33   69:aload           4
	//   34   71:invokestatic    #184 <Method java.util.UUID bhf.a(byte[])>
	//   35   74:astore          5
				if(obj1 == null)
	//*  36   76:aload           5
	//*  37   78:ifnonnull       92
					Log.w("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
	//   38   81:ldc1            #186 <String "FragmentedMp4Extractor">
	//   39   83:ldc1            #188 <String "Skipped pssh atom (failed to extract uuid)">
	//   40   85:invokestatic    #193 <Method int Log.w(String, String)>
	//   41   88:pop             
				else
	//*  42   89:goto            110
					((ArrayList) (obj)).add(((Object) (new zzhp.zza(((java.util.UUID) (obj1)), "video/mp4", abyte0))));
	//   43   92:aload_3         
	//   44   93:new             #195 <Class zzhp$zza>
	//   45   96:dup             
	//   46   97:aload           5
	//   47   99:ldc1            #197 <String "video/mp4">
	//   48  101:aload           4
	//   49  103:invokespecial   #200 <Method void zzhp$zza(java.util.UUID, String, byte[])>
	//   50  106:invokevirtual   #204 <Method boolean ArrayList.add(Object)>
	//   51  109:pop             
			}
			i1++;
	//   52  110:iload_1         
	//   53  111:iconst_1        
	//   54  112:iadd            
	//   55  113:istore_1        
		}

	//   56  114:aload_3         
	//   57  115:astore          4
	//*  58  117:goto            12
		if(abyte0 == null)
	//*  59  120:aload           4
	//*  60  122:ifnonnull       127
			return null;
	//   61  125:aconst_null     
	//   62  126:areturn         
		else
			return new zzhp(((List) (abyte0)));
	//   63  127:new             #206 <Class zzhp>
	//   64  130:dup             
	//   65  131:aload           4
	//   66  133:invokespecial   #209 <Method void zzhp(List)>
	//   67  136:areturn         
	}

	private final void a()
	{
		p = 0;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #211 <Field int p>
		s = 0;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #213 <Field int s>
	//    6   10:return          
	}

	private final void a(long l1)
	{
		Object obj = ((Object) (this));
	//    0    0:aload_0         
	//    1    1:astore          30
		do
		{
			if(((bgx) (obj)).n.isEmpty() || ((bgk)((bgx) (obj)).n.peek()).aP != l1)
				break;
	//    2    3:aload           30
	//    3    5:getfield        #133 <Field Stack n>
	//    4    8:invokevirtual   #218 <Method boolean Stack.isEmpty()>
	//    5   11:ifne            3109
	//    6   14:aload           30
	//    7   16:getfield        #133 <Field Stack n>
	//    8   19:invokevirtual   #222 <Method Object Stack.peek()>
	//    9   22:checkcast       #224 <Class bgk>
	//   10   25:getfield        #226 <Field long bgk.aP>
	//   11   28:lload_1         
	//   12   29:lcmp            
	//   13   30:ifne            3109
			Object obj3 = ((Object) ((bgk)((bgx) (obj)).n.pop()));
	//   14   33:aload           30
	//   15   35:getfield        #133 <Field Stack n>
	//   16   38:invokevirtual   #229 <Method Object Stack.pop()>
	//   17   41:checkcast       #224 <Class bgk>
	//   18   44:astore          32
			if(((bgk) (obj3)).aO == bgj.B)
	//*  19   46:aload           32
	//*  20   48:getfield        #230 <Field int bgk.aO>
	//*  21   51:getstatic       #232 <Field int bgj.B>
	//*  22   54:icmpne          749
			{
				bnf.b(true, "Unexpected moov box.");
	//   23   57:iconst_1        
	//   24   58:ldc1            #234 <String "Unexpected moov box.">
	//   25   60:invokestatic    #239 <Method void bnf.b(boolean, Object)>
				zzhp zzhp1 = a(((bgk) (obj3)).aQ);
	//   26   63:aload           32
	//   27   65:getfield        #243 <Field List bgk.aQ>
	//   28   68:invokestatic    #245 <Method zzhp a(List)>
	//   29   71:astore          33
				Object obj5 = ((Object) (((bgk) (obj3)).e(bgj.M)));
	//   30   73:aload           32
	//   31   75:getstatic       #248 <Field int bgj.M>
	//   32   78:invokevirtual   #251 <Method bgk bgk.e(int)>
	//   33   81:astore          34
				Object obj1 = ((Object) (new SparseArray()));
	//   34   83:new             #140 <Class SparseArray>
	//   35   86:dup             
	//   36   87:invokespecial   #141 <Method void SparseArray()>
	//   37   90:astore          31
				int k2 = ((bgk) (obj5)).aQ.size();
	//   38   92:aload           34
	//   39   94:getfield        #243 <Field List bgk.aQ>
	//   40   97:invokeinterface #158 <Method int List.size()>
	//   41  102:istore          4
				long l10 = 0x1L;
	//   42  104:ldc2w           #144 <Long 0x1L>
	//   43  107:lstore          21
				for(int i1 = 0; i1 < k2; i1++)
	//*  44  109:iconst_0        
	//*  45  110:istore_3        
	//*  46  111:iload_3         
	//*  47  112:iload           4
	//*  48  114:icmpge          287
				{
					Object obj6 = ((Object) ((bgl)((bgk) (obj5)).aQ.get(i1)));
	//   49  117:aload           34
	//   50  119:getfield        #243 <Field List bgk.aQ>
	//   51  122:iload_3         
	//   52  123:invokeinterface #162 <Method Object List.get(int)>
	//   53  128:checkcast       #164 <Class bgl>
	//   54  131:astore          35
					if(((bgl) (obj6)).aO == bgj.y)
	//*  55  133:aload           35
	//*  56  135:getfield        #167 <Field int bgl.aO>
	//*  57  138:getstatic       #253 <Field int bgj.y>
	//*  58  141:icmpne          227
					{
						obj6 = ((Object) (((bgl) (obj6)).aP));
	//   59  144:aload           35
	//   60  146:getfield        #178 <Field bno bgl.aP>
	//   61  149:astore          35
						((bno) (obj6)).c(12);
	//   62  151:aload           35
	//   63  153:bipush          12
	//   64  155:invokevirtual   #255 <Method void bno.c(int)>
						obj6 = ((Object) (Pair.create(((Object) (Integer.valueOf(((bno) (obj6)).l()))), ((Object) (new bgu(((bno) (obj6)).o() - 1, ((bno) (obj6)).o(), ((bno) (obj6)).o(), ((bno) (obj6)).l()))))));
	//   65  158:aload           35
	//   66  160:invokevirtual   #257 <Method int bno.l()>
	//   67  163:invokestatic    #263 <Method Integer Integer.valueOf(int)>
	//   68  166:new             #265 <Class bgu>
	//   69  169:dup             
	//   70  170:aload           35
	//   71  172:invokevirtual   #267 <Method int bno.o()>
	//   72  175:iconst_1        
	//   73  176:isub            
	//   74  177:aload           35
	//   75  179:invokevirtual   #267 <Method int bno.o()>
	//   76  182:aload           35
	//   77  184:invokevirtual   #267 <Method int bno.o()>
	//   78  187:aload           35
	//   79  189:invokevirtual   #257 <Method int bno.l()>
	//   80  192:invokespecial   #270 <Method void bgu(int, int, int, int)>
	//   81  195:invokestatic    #276 <Method Pair Pair.create(Object, Object)>
	//   82  198:astore          35
						((SparseArray) (obj1)).put(((Integer)((Pair) (obj6)).first).intValue(), ((Object) ((bgu)((Pair) (obj6)).second)));
	//   83  200:aload           31
	//   84  202:aload           35
	//   85  204:getfield        #280 <Field Object Pair.first>
	//   86  207:checkcast       #259 <Class Integer>
	//   87  210:invokevirtual   #283 <Method int Integer.intValue()>
	//   88  213:aload           35
	//   89  215:getfield        #286 <Field Object Pair.second>
	//   90  218:checkcast       #265 <Class bgu>
	//   91  221:invokevirtual   #290 <Method void SparseArray.put(int, Object)>
						continue;
	//   92  224:goto            280
					}
					if(((bgl) (obj6)).aO != bgj.N)
						continue;
	//   93  227:aload           35
	//   94  229:getfield        #167 <Field int bgl.aO>
	//   95  232:getstatic       #293 <Field int bgj.N>
	//   96  235:icmpne          280
					obj6 = ((Object) (((bgl) (obj6)).aP));
	//   97  238:aload           35
	//   98  240:getfield        #178 <Field bno bgl.aP>
	//   99  243:astore          35
					((bno) (obj6)).c(8);
	//  100  245:aload           35
	//  101  247:bipush          8
	//  102  249:invokevirtual   #255 <Method void bno.c(int)>
					if(bgj.a(((bno) (obj6)).l()) == 0)
	//* 103  252:aload           35
	//* 104  254:invokevirtual   #257 <Method int bno.l()>
	//* 105  257:invokestatic    #296 <Method int bgj.a(int)>
	//* 106  260:ifne            273
						l10 = ((bno) (obj6)).j();
	//  107  263:aload           35
	//  108  265:invokevirtual   #299 <Method long bno.j()>
	//  109  268:lstore          21
					else
	//* 110  270:goto            280
						l10 = ((bno) (obj6)).p();
	//  111  273:aload           35
	//  112  275:invokevirtual   #301 <Method long bno.p()>
	//  113  278:lstore          21
				}

	//  114  280:iload_3         
	//  115  281:iconst_1        
	//  116  282:iadd            
	//  117  283:istore_3        
	//* 118  284:goto            111
				obj5 = ((Object) (new SparseArray()));
	//  119  287:new             #140 <Class SparseArray>
	//  120  290:dup             
	//  121  291:invokespecial   #141 <Method void SparseArray()>
	//  122  294:astore          34
				k2 = ((bgk) (obj3)).aR.size();
	//  123  296:aload           32
	//  124  298:getfield        #304 <Field List bgk.aR>
	//  125  301:invokeinterface #158 <Method int List.size()>
	//  126  306:istore          4
				for(int j1 = 0; j1 < k2; j1++)
	//* 127  308:iconst_0        
	//* 128  309:istore_3        
	//* 129  310:iload_3         
	//* 130  311:iload           4
	//* 131  313:icmpge          390
				{
					Object obj7 = ((Object) ((bgk)((bgk) (obj3)).aR.get(j1)));
	//  132  316:aload           32
	//  133  318:getfield        #304 <Field List bgk.aR>
	//  134  321:iload_3         
	//  135  322:invokeinterface #162 <Method Object List.get(int)>
	//  136  327:checkcast       #224 <Class bgk>
	//  137  330:astore          35
					if(((bgk) (obj7)).aO != bgj.D)
						continue;
	//  138  332:aload           35
	//  139  334:getfield        #230 <Field int bgk.aO>
	//  140  337:getstatic       #306 <Field int bgj.D>
	//  141  340:icmpne          383
					obj7 = ((Object) (bgm.a(((bgk) (obj7)), ((bgk) (obj3)).d(bgj.C), l10, zzhp1, false)));
	//  142  343:aload           35
	//  143  345:aload           32
	//  144  347:getstatic       #308 <Field int bgj.C>
	//  145  350:invokevirtual   #311 <Method bgl bgk.d(int)>
	//  146  353:lload           21
	//  147  355:aload           33
	//  148  357:iconst_0        
	//  149  358:invokestatic    #316 <Method bhh bgm.a(bgk, bgl, long, zzhp, boolean)>
	//  150  361:astore          35
					if(obj7 != null)
	//* 151  363:aload           35
	//* 152  365:ifnull          383
						((SparseArray) (obj5)).put(((bhh) (obj7)).a, obj7);
	//  153  368:aload           34
	//  154  370:aload           35
	//  155  372:getfield        #320 <Field int bhh.a>
	//  156  375:aload           35
	//  157  377:invokevirtual   #290 <Method void SparseArray.put(int, Object)>
				}

	//  158  380:goto            383
	//  159  383:iload_3         
	//  160  384:iconst_1        
	//  161  385:iadd            
	//  162  386:istore_3        
	//* 163  387:goto            310
				k2 = ((SparseArray) (obj5)).size();
	//  164  390:aload           34
	//  165  392:invokevirtual   #321 <Method int SparseArray.size()>
	//  166  395:istore          4
				if(((bgx) (obj)).f.size() == 0)
	//* 167  397:aload           30
	//* 168  399:getfield        #143 <Field SparseArray f>
	//* 169  402:invokevirtual   #321 <Method int SparseArray.size()>
	//* 170  405:ifne            662
				{
					for(int k1 = 0; k1 < k2; k1++)
	//* 171  408:iconst_0        
	//* 172  409:istore_3        
	//* 173  410:iload_3         
	//* 174  411:iload           4
	//* 175  413:icmpge          512
					{
						obj3 = ((Object) ((bhh)((SparseArray) (obj5)).valueAt(k1)));
	//  176  416:aload           34
	//  177  418:iload_3         
	//  178  419:invokevirtual   #324 <Method Object SparseArray.valueAt(int)>
	//  179  422:checkcast       #318 <Class bhh>
	//  180  425:astore          32
						bha bha1 = new bha(((bgx) (obj)).D.a(k1, ((bhh) (obj3)).b));
	//  181  427:new             #326 <Class bha>
	//  182  430:dup             
	//  183  431:aload           30
	//  184  433:getfield        #328 <Field bfp D>
	//  185  436:iload_3         
	//  186  437:aload           32
	//  187  439:getfield        #329 <Field int bhh.b>
	//  188  442:invokeinterface #334 <Method bfw bfp.a(int, int)>
	//  189  447:invokespecial   #337 <Method void bha(bfw)>
	//  190  450:astore          33
						bha1.a(((bhh) (obj3)), (bgu)((SparseArray) (obj1)).get(((bhh) (obj3)).a));
	//  191  452:aload           33
	//  192  454:aload           32
	//  193  456:aload           31
	//  194  458:aload           32
	//  195  460:getfield        #320 <Field int bhh.a>
	//  196  463:invokevirtual   #338 <Method Object SparseArray.get(int)>
	//  197  466:checkcast       #265 <Class bgu>
	//  198  469:invokevirtual   #341 <Method void bha.a(bhh, bgu)>
						((bgx) (obj)).f.put(((bhh) (obj3)).a, ((Object) (bha1)));
	//  199  472:aload           30
	//  200  474:getfield        #143 <Field SparseArray f>
	//  201  477:aload           32
	//  202  479:getfield        #320 <Field int bhh.a>
	//  203  482:aload           33
	//  204  484:invokevirtual   #290 <Method void SparseArray.put(int, Object)>
						obj.w = Math.max(((bgx) (obj)).w, ((bhh) (obj3)).e);
	//  205  487:aload           30
	//  206  489:aload           30
	//  207  491:getfield        #147 <Field long w>
	//  208  494:aload           32
	//  209  496:getfield        #343 <Field long bhh.e>
	//  210  499:invokestatic    #349 <Method long Math.max(long, long)>
	//  211  502:putfield        #147 <Field long w>
					}

	//  212  505:iload_3         
	//  213  506:iconst_1        
	//  214  507:iadd            
	//  215  508:istore_3        
	//* 216  509:goto            410
					if((((bgx) (obj)).d & 4) != 0 && ((bgx) (obj)).E == null)
	//* 217  512:aload           30
	//* 218  514:getfield        #101 <Field int d>
	//* 219  517:iconst_4        
	//* 220  518:iand            
	//* 221  519:ifeq            574
	//* 222  522:aload           30
	//* 223  524:getfield        #351 <Field bfw E>
	//* 224  527:ifnonnull       574
					{
						obj.E = ((bgx) (obj)).D.a(((bgx) (obj)).f.size(), 4);
	//  225  530:aload           30
	//  226  532:aload           30
	//  227  534:getfield        #328 <Field bfp D>
	//  228  537:aload           30
	//  229  539:getfield        #143 <Field SparseArray f>
	//  230  542:invokevirtual   #321 <Method int SparseArray.size()>
	//  231  545:iconst_4        
	//  232  546:invokeinterface #334 <Method bfw bfp.a(int, int)>
	//  233  551:putfield        #351 <Field bfw E>
						((bgx) (obj)).E.a(zzfs.a(((String) (null)), "application/x-emsg", 0xffffffffL));
	//  234  554:aload           30
	//  235  556:getfield        #351 <Field bfw E>
	//  236  559:aconst_null     
	//  237  560:ldc2            #353 <String "application/x-emsg">
	//  238  563:ldc2w           #354 <Long 0xffffffffL>
	//  239  566:invokestatic    #360 <Method zzfs zzfs.a(String, String, long)>
	//  240  569:invokeinterface #365 <Method void bfw.a(zzfs)>
					}
					if((((bgx) (obj)).d & 8) != 0 && ((bgx) (obj)).F == null)
	//* 241  574:aload           30
	//* 242  576:getfield        #101 <Field int d>
	//* 243  579:bipush          8
	//* 244  581:iand            
	//* 245  582:ifeq            649
	//* 246  585:aload           30
	//* 247  587:getfield        #367 <Field bfw[] F>
	//* 248  590:ifnonnull       649
					{
						obj1 = ((Object) (((bgx) (obj)).D.a(((bgx) (obj)).f.size() + 1, 3)));
	//  249  593:aload           30
	//  250  595:getfield        #328 <Field bfp D>
	//  251  598:aload           30
	//  252  600:getfield        #143 <Field SparseArray f>
	//  253  603:invokevirtual   #321 <Method int SparseArray.size()>
	//  254  606:iconst_1        
	//  255  607:iadd            
	//  256  608:iconst_3        
	//  257  609:invokeinterface #334 <Method bfw bfp.a(int, int)>
	//  258  614:astore          31
						((bfw) (obj1)).a(zzfs.a(((String) (null)), "application/cea-608", ((String) (null)), -1, 0, ((String) (null)), ((zzhp) (null))));
	//  259  616:aload           31
	//  260  618:aconst_null     
	//  261  619:ldc2            #369 <String "application/cea-608">
	//  262  622:aconst_null     
	//  263  623:iconst_m1       
	//  264  624:iconst_0        
	//  265  625:aconst_null     
	//  266  626:aconst_null     
	//  267  627:invokestatic    #372 <Method zzfs zzfs.a(String, String, String, int, int, String, zzhp)>
	//  268  630:invokeinterface #365 <Method void bfw.a(zzfs)>
						obj.F = (new bfw[] {
							obj1
						});
	//  269  635:aload           30
	//  270  637:iconst_1        
	//  271  638:anewarray       bfw[]
	//  272  641:dup             
	//  273  642:iconst_0        
	//  274  643:aload           31
	//  275  645:aastore         
	//  276  646:putfield        #367 <Field bfw[] F>
					}
					((bgx) (obj)).D.a();
	//  277  649:aload           30
	//  278  651:getfield        #328 <Field bfp D>
	//  279  654:invokeinterface #373 <Method void bfp.a()>
				} else
	//* 280  659:goto            3
				{
					boolean flag7;
					if(((bgx) (obj)).f.size() == k2)
	//* 281  662:aload           30
	//* 282  664:getfield        #143 <Field SparseArray f>
	//* 283  667:invokevirtual   #321 <Method int SparseArray.size()>
	//* 284  670:iload           4
	//* 285  672:icmpne          681
						flag7 = true;
	//  286  675:iconst_1        
	//  287  676:istore          29
					else
	//* 288  678:goto            684
						flag7 = false;
	//  289  681:iconst_0        
	//  290  682:istore          29
					bnf.b(flag7);
	//  291  684:iload           29
	//  292  686:invokestatic    #376 <Method void bnf.b(boolean)>
					int i2 = 0;
	//  293  689:iconst_0        
	//  294  690:istore_3        
					while(i2 < k2) 
	//* 295  691:iload_3         
	//* 296  692:iload           4
	//* 297  694:icmpge          3
					{
						obj3 = ((Object) ((bhh)((SparseArray) (obj5)).valueAt(i2)));
	//  298  697:aload           34
	//  299  699:iload_3         
	//  300  700:invokevirtual   #324 <Method Object SparseArray.valueAt(int)>
	//  301  703:checkcast       #318 <Class bhh>
	//  302  706:astore          32
						((bha)((bgx) (obj)).f.get(((bhh) (obj3)).a)).a(((bhh) (obj3)), (bgu)((SparseArray) (obj1)).get(((bhh) (obj3)).a));
	//  303  708:aload           30
	//  304  710:getfield        #143 <Field SparseArray f>
	//  305  713:aload           32
	//  306  715:getfield        #320 <Field int bhh.a>
	//  307  718:invokevirtual   #338 <Method Object SparseArray.get(int)>
	//  308  721:checkcast       #326 <Class bha>
	//  309  724:aload           32
	//  310  726:aload           31
	//  311  728:aload           32
	//  312  730:getfield        #320 <Field int bhh.a>
	//  313  733:invokevirtual   #338 <Method Object SparseArray.get(int)>
	//  314  736:checkcast       #265 <Class bgu>
	//  315  739:invokevirtual   #341 <Method void bha.a(bhh, bgu)>
						i2++;
	//  316  742:iload_3         
	//  317  743:iconst_1        
	//  318  744:iadd            
	//  319  745:istore_3        
					}
				}
			} else
	//* 320  746:goto            691
			if(((bgk) (obj3)).aO == bgj.K)
	//* 321  749:aload           32
	//* 322  751:getfield        #230 <Field int bgk.aO>
	//* 323  754:getstatic       #379 <Field int bgj.K>
	//* 324  757:icmpne          3079
			{
				SparseArray sparsearray = ((bgx) (obj)).f;
	//  325  760:aload           30
	//  326  762:getfield        #143 <Field SparseArray f>
	//  327  765:astore          34
				int l2 = ((bgx) (obj)).d;
	//  328  767:aload           30
	//  329  769:getfield        #101 <Field int d>
	//  330  772:istore          4
				Object obj2 = ((Object) (((bgx) (obj)).m));
	//  331  774:aload           30
	//  332  776:getfield        #128 <Field byte[] m>
	//  333  779:astore          31
				int j3 = ((bgk) (obj3)).aR.size();
	//  334  781:aload           32
	//  335  783:getfield        #304 <Field List bgk.aR>
	//  336  786:invokeinterface #158 <Method int List.size()>
	//  337  791:istore          5
				int j2 = 0;
	//  338  793:iconst_0        
	//  339  794:istore_3        
				obj = obj3;
	//  340  795:aload           32
	//  341  797:astore          30
				do
				{
					obj3 = null;
	//  342  799:aconst_null     
	//  343  800:astore          32
					if(j2 >= j3)
						break;
	//  344  802:iload_3         
	//  345  803:iload           5
	//  346  805:icmpge          2993
					bgk bgk1 = (bgk)((bgk) (obj)).aR.get(j2);
	//  347  808:aload           30
	//  348  810:getfield        #304 <Field List bgk.aR>
	//  349  813:iload_3         
	//  350  814:invokeinterface #162 <Method Object List.get(int)>
	//  351  819:checkcast       #224 <Class bgk>
	//  352  822:astore          35
					if(bgk1.aO == bgj.L)
	//* 353  824:aload           35
	//* 354  826:getfield        #230 <Field int bgk.aO>
	//* 355  829:getstatic       #382 <Field int bgj.L>
	//* 356  832:icmpne          2968
					{
						bno bno1 = bgk1.d(bgj.x).aP;
	//  357  835:aload           35
	//  358  837:getstatic       #384 <Field int bgj.x>
	//  359  840:invokevirtual   #311 <Method bgl bgk.d(int)>
	//  360  843:getfield        #178 <Field bno bgl.aP>
	//  361  846:astore          36
						bno1.c(8);
	//  362  848:aload           36
	//  363  850:bipush          8
	//  364  852:invokevirtual   #255 <Method void bno.c(int)>
						int l6 = bgj.b(bno1.l());
	//  365  855:aload           36
	//  366  857:invokevirtual   #257 <Method int bno.l()>
	//  367  860:invokestatic    #386 <Method int bgj.b(int)>
	//  368  863:istore          9
						int k3 = bno1.l();
	//  369  865:aload           36
	//  370  867:invokevirtual   #257 <Method int bno.l()>
	//  371  870:istore          6
						if((l2 & 0x10) != 0)
	//* 372  872:iload           4
	//* 373  874:bipush          16
	//* 374  876:iand            
	//* 375  877:ifne            883
	//* 376  880:goto            886
							k3 = 0;
	//  377  883:iconst_0        
	//  378  884:istore          6
						Object obj4 = ((Object) ((bha)sparsearray.get(k3)));
	//  379  886:aload           34
	//  380  888:iload           6
	//  381  890:invokevirtual   #338 <Method Object SparseArray.get(int)>
	//  382  893:checkcast       #326 <Class bha>
	//  383  896:astore          33
						if(obj4 == null)
	//* 384  898:aload           33
	//* 385  900:ifnonnull       910
						{
							obj4 = obj3;
	//  386  903:aload           32
	//  387  905:astore          33
						} else
	//* 388  907:goto            1075
						{
							if((l6 & 1) != 0)
	//* 389  910:iload           9
	//* 390  912:iconst_1        
	//* 391  913:iand            
	//* 392  914:ifeq            944
							{
								long l11 = bno1.p();
	//  393  917:aload           36
	//  394  919:invokevirtual   #301 <Method long bno.p()>
	//  395  922:lstore          21
								((bha) (obj4)).a.c = l11;
	//  396  924:aload           33
	//  397  926:getfield        #389 <Field bhj bha.a>
	//  398  929:lload           21
	//  399  931:putfield        #393 <Field long bhj.c>
								((bha) (obj4)).a.d = l11;
	//  400  934:aload           33
	//  401  936:getfield        #389 <Field bhj bha.a>
	//  402  939:lload           21
	//  403  941:putfield        #395 <Field long bhj.d>
							}
							obj3 = ((Object) (((bha) (obj4)).d));
	//  404  944:aload           33
	//  405  946:getfield        #398 <Field bgu bha.d>
	//  406  949:astore          32
							int l3;
							if((l6 & 2) != 0)
	//* 407  951:iload           9
	//* 408  953:iconst_2        
	//* 409  954:iand            
	//* 410  955:ifeq            970
								l3 = bno1.o() - 1;
	//  411  958:aload           36
	//  412  960:invokevirtual   #267 <Method int bno.o()>
	//  413  963:iconst_1        
	//  414  964:isub            
	//  415  965:istore          6
							else
	//* 416  967:goto            977
								l3 = ((bgu) (obj3)).a;
	//  417  970:aload           32
	//  418  972:getfield        #399 <Field int bgu.a>
	//  419  975:istore          6
							int i5;
							if((l6 & 8) != 0)
	//* 420  977:iload           9
	//* 421  979:bipush          8
	//* 422  981:iand            
	//* 423  982:ifeq            995
								i5 = bno1.o();
	//  424  985:aload           36
	//  425  987:invokevirtual   #267 <Method int bno.o()>
	//  426  990:istore          7
							else
	//* 427  992:goto            1002
								i5 = ((bgu) (obj3)).b;
	//  428  995:aload           32
	//  429  997:getfield        #400 <Field int bgu.b>
	//  430 1000:istore          7
							int i6;
							if((l6 & 0x10) != 0)
	//* 431 1002:iload           9
	//* 432 1004:bipush          16
	//* 433 1006:iand            
	//* 434 1007:ifeq            1020
								i6 = bno1.o();
	//  435 1010:aload           36
	//  436 1012:invokevirtual   #267 <Method int bno.o()>
	//  437 1015:istore          8
							else
	//* 438 1017:goto            1027
								i6 = ((bgu) (obj3)).c;
	//  439 1020:aload           32
	//  440 1022:getfield        #402 <Field int bgu.c>
	//  441 1025:istore          8
							if((l6 & 0x20) != 0)
	//* 442 1027:iload           9
	//* 443 1029:bipush          32
	//* 444 1031:iand            
	//* 445 1032:ifeq            1045
								l6 = bno1.o();
	//  446 1035:aload           36
	//  447 1037:invokevirtual   #267 <Method int bno.o()>
	//  448 1040:istore          9
							else
	//* 449 1042:goto            1052
								l6 = ((bgu) (obj3)).d;
	//  450 1045:aload           32
	//  451 1047:getfield        #403 <Field int bgu.d>
	//  452 1050:istore          9
							((bha) (obj4)).a.a = new bgu(l3, i5, i6, l6);
	//  453 1052:aload           33
	//  454 1054:getfield        #389 <Field bhj bha.a>
	//  455 1057:new             #265 <Class bgu>
	//  456 1060:dup             
	//  457 1061:iload           6
	//  458 1063:iload           7
	//  459 1065:iload           8
	//  460 1067:iload           9
	//  461 1069:invokespecial   #270 <Method void bgu(int, int, int, int)>
	//  462 1072:putfield        #405 <Field bgu bhj.a>
						}
						if(obj4 != null)
	//* 463 1075:aload           33
	//* 464 1077:ifnull          2955
						{
							obj3 = ((Object) (((bha) (obj4)).a));
	//  465 1080:aload           33
	//  466 1082:getfield        #389 <Field bhj bha.a>
	//  467 1085:astore          32
							long l14 = ((bhj) (obj3)).s;
	//  468 1087:aload           32
	//  469 1089:getfield        #407 <Field long bhj.s>
	//  470 1092:lstore          23
							((bha) (obj4)).a();
	//  471 1094:aload           33
	//  472 1096:invokevirtual   #408 <Method void bha.a()>
							long l12 = l14;
	//  473 1099:lload           23
	//  474 1101:lstore          21
							if(bgk1.d(bgj.w) != null)
	//* 475 1103:aload           35
	//* 476 1105:getstatic       #410 <Field int bgj.w>
	//* 477 1108:invokevirtual   #311 <Method bgl bgk.d(int)>
	//* 478 1111:ifnull          1174
							{
								l12 = l14;
	//  479 1114:lload           23
	//  480 1116:lstore          21
								if((l2 & 2) == 0)
	//* 481 1118:iload           4
	//* 482 1120:iconst_2        
	//* 483 1121:iand            
	//* 484 1122:ifne            1174
								{
									bno bno2 = bgk1.d(bgj.w).aP;
	//  485 1125:aload           35
	//  486 1127:getstatic       #410 <Field int bgj.w>
	//  487 1130:invokevirtual   #311 <Method bgl bgk.d(int)>
	//  488 1133:getfield        #178 <Field bno bgl.aP>
	//  489 1136:astore          36
									bno2.c(8);
	//  490 1138:aload           36
	//  491 1140:bipush          8
	//  492 1142:invokevirtual   #255 <Method void bno.c(int)>
									if(bgj.a(bno2.l()) == 1)
	//* 493 1145:aload           36
	//* 494 1147:invokevirtual   #257 <Method int bno.l()>
	//* 495 1150:invokestatic    #296 <Method int bgj.a(int)>
	//* 496 1153:iconst_1        
	//* 497 1154:icmpne          1167
										l12 = bno2.p();
	//  498 1157:aload           36
	//  499 1159:invokevirtual   #301 <Method long bno.p()>
	//  500 1162:lstore          21
									else
	//* 501 1164:goto            1174
										l12 = bno2.j();
	//  502 1167:aload           36
	//  503 1169:invokevirtual   #299 <Method long bno.j()>
	//  504 1172:lstore          21
								}
							}
							Object obj10 = ((Object) (bgk1.aQ));
	//  505 1174:aload           35
	//  506 1176:getfield        #243 <Field List bgk.aQ>
	//  507 1179:astore          37
							int k8 = ((List) (obj10)).size();
	//  508 1181:aload           37
	//  509 1183:invokeinterface #158 <Method int List.size()>
	//  510 1188:istore          14
							int j6 = 0;
	//  511 1190:iconst_0        
	//  512 1191:istore          8
							int i4 = 0;
	//  513 1193:iconst_0        
	//  514 1194:istore          6
							for(int j5 = 0; j5 < k8;)
	//* 515 1196:iconst_0        
	//* 516 1197:istore          7
	//* 517 1199:iload           7
	//* 518 1201:iload           14
	//* 519 1203:icmpge          1306
							{
								Object obj8 = ((Object) ((bgl)((List) (obj10)).get(j5)));
	//  520 1206:aload           37
	//  521 1208:iload           7
	//  522 1210:invokeinterface #162 <Method Object List.get(int)>
	//  523 1215:checkcast       #164 <Class bgl>
	//  524 1218:astore          36
								int i7;
								int k7;
								if(((bgl) (obj8)).aO == bgj.z)
	//* 525 1220:aload           36
	//* 526 1222:getfield        #167 <Field int bgl.aO>
	//* 527 1225:getstatic       #412 <Field int bgj.z>
	//* 528 1228:icmpne          1281
								{
									obj8 = ((Object) (((bgl) (obj8)).aP));
	//  529 1231:aload           36
	//  530 1233:getfield        #178 <Field bno bgl.aP>
	//  531 1236:astore          36
									((bno) (obj8)).c(12);
	//  532 1238:aload           36
	//  533 1240:bipush          12
	//  534 1242:invokevirtual   #255 <Method void bno.c(int)>
									int l7 = ((bno) (obj8)).o();
	//  535 1245:aload           36
	//  536 1247:invokevirtual   #267 <Method int bno.o()>
	//  537 1250:istore          11
									i7 = j6;
	//  538 1252:iload           8
	//  539 1254:istore          9
									k7 = i4;
	//  540 1256:iload           6
	//  541 1258:istore          10
									if(l7 > 0)
	//* 542 1260:iload           11
	//* 543 1262:ifle            1289
									{
										i7 = j6 + l7;
	//  544 1265:iload           8
	//  545 1267:iload           11
	//  546 1269:iadd            
	//  547 1270:istore          9
										k7 = i4 + 1;
	//  548 1272:iload           6
	//  549 1274:iconst_1        
	//  550 1275:iadd            
	//  551 1276:istore          10
									}
								} else
	//* 552 1278:goto            1289
								{
									k7 = i4;
	//  553 1281:iload           6
	//  554 1283:istore          10
									i7 = j6;
	//  555 1285:iload           8
	//  556 1287:istore          9
								}
								j5++;
	//  557 1289:iload           7
	//  558 1291:iconst_1        
	//  559 1292:iadd            
	//  560 1293:istore          7
								j6 = i7;
	//  561 1295:iload           9
	//  562 1297:istore          8
								i4 = k7;
	//  563 1299:iload           10
	//  564 1301:istore          6
							}

	//* 565 1303:goto            1199
							int j8 = j3;
	//  566 1306:iload           5
	//  567 1308:istore          13
							obj4.g = 0;
	//  568 1310:aload           33
	//  569 1312:iconst_0        
	//  570 1313:putfield        #414 <Field int bha.g>
							obj4.f = 0;
	//  571 1316:aload           33
	//  572 1318:iconst_0        
	//  573 1319:putfield        #416 <Field int bha.f>
							obj4.e = 0;
	//  574 1322:aload           33
	//  575 1324:iconst_0        
	//  576 1325:putfield        #418 <Field int bha.e>
							Object obj9 = ((Object) (((bha) (obj4)).a));
	//  577 1328:aload           33
	//  578 1330:getfield        #389 <Field bhj bha.a>
	//  579 1333:astore          36
							obj9.e = i4;
	//  580 1335:aload           36
	//  581 1337:iload           6
	//  582 1339:putfield        #419 <Field int bhj.e>
							obj9.f = j6;
	//  583 1342:aload           36
	//  584 1344:iload           8
	//  585 1346:putfield        #420 <Field int bhj.f>
							if(((bhj) (obj9)).h == null || ((bhj) (obj9)).h.length < i4)
	//* 586 1349:aload           36
	//* 587 1351:getfield        #423 <Field int[] bhj.h>
	//* 588 1354:ifnull          1368
	//* 589 1357:aload           36
	//* 590 1359:getfield        #423 <Field int[] bhj.h>
	//* 591 1362:arraylength     
	//* 592 1363:iload           6
	//* 593 1365:icmpge          1386
							{
								obj9.g = new long[i4];
	//  594 1368:aload           36
	//  595 1370:iload           6
	//  596 1372:newarray        long[]
	//  597 1374:putfield        #426 <Field long[] bhj.g>
								obj9.h = new int[i4];
	//  598 1377:aload           36
	//  599 1379:iload           6
	//  600 1381:newarray        int[]
	//  601 1383:putfield        #423 <Field int[] bhj.h>
							}
							if(((bhj) (obj9)).i == null || ((bhj) (obj9)).i.length < j6)
	//* 602 1386:aload           36
	//* 603 1388:getfield        #428 <Field int[] bhj.i>
	//* 604 1391:ifnull          1405
	//* 605 1394:aload           36
	//* 606 1396:getfield        #428 <Field int[] bhj.i>
	//* 607 1399:arraylength     
	//* 608 1400:iload           8
	//* 609 1402:icmpge          1460
							{
								j3 = (j6 * 125) / 100;
	//  610 1405:iload           8
	//  611 1407:bipush          125
	//  612 1409:imul            
	//  613 1410:bipush          100
	//  614 1412:idiv            
	//  615 1413:istore          5
								obj9.i = new int[j3];
	//  616 1415:aload           36
	//  617 1417:iload           5
	//  618 1419:newarray        int[]
	//  619 1421:putfield        #428 <Field int[] bhj.i>
								obj9.j = new int[j3];
	//  620 1424:aload           36
	//  621 1426:iload           5
	//  622 1428:newarray        int[]
	//  623 1430:putfield        #430 <Field int[] bhj.j>
								obj9.k = new long[j3];
	//  624 1433:aload           36
	//  625 1435:iload           5
	//  626 1437:newarray        long[]
	//  627 1439:putfield        #432 <Field long[] bhj.k>
								obj9.l = new boolean[j3];
	//  628 1442:aload           36
	//  629 1444:iload           5
	//  630 1446:newarray        boolean[]
	//  631 1448:putfield        #435 <Field boolean[] bhj.l>
								obj9.n = new boolean[j3];
	//  632 1451:aload           36
	//  633 1453:iload           5
	//  634 1455:newarray        boolean[]
	//  635 1457:putfield        #437 <Field boolean[] bhj.n>
							}
							j3 = 0;
	//  636 1460:iconst_0        
	//  637 1461:istore          5
							int l8 = 0;
	//  638 1463:iconst_0        
	//  639 1464:istore          15
							boolean flag = false;
	//  640 1466:iconst_0        
	//  641 1467:istore          7
							i4 = j2;
	//  642 1469:iload_3         
	//  643 1470:istore          6
							j2 = ((int) (flag));
	//  644 1472:iload           7
	//  645 1474:istore_3        
							obj9 = obj4;
	//  646 1475:aload           33
	//  647 1477:astore          36
							do
							{
								long l17 = 0L;
	//  648 1479:lconst_0        
	//  649 1480:lstore          25
								if(j3 >= k8)
									break;
	//  650 1482:iload           5
	//  651 1484:iload           14
	//  652 1486:icmpge          2097
								obj4 = ((Object) ((bgl)((List) (obj10)).get(j3)));
	//  653 1489:aload           37
	//  654 1491:iload           5
	//  655 1493:invokeinterface #162 <Method Object List.get(int)>
	//  656 1498:checkcast       #164 <Class bgl>
	//  657 1501:astore          33
								int i9;
								if(((bgl) (obj4)).aO == bgj.z)
	//* 658 1503:aload           33
	//* 659 1505:getfield        #167 <Field int bgl.aO>
	//* 660 1508:getstatic       #412 <Field int bgj.z>
	//* 661 1511:icmpne          2084
								{
									obj4 = ((Object) (((bgl) (obj4)).aP));
	//  662 1514:aload           33
	//  663 1516:getfield        #178 <Field bno bgl.aP>
	//  664 1519:astore          33
									((bno) (obj4)).c(8);
	//  665 1521:aload           33
	//  666 1523:bipush          8
	//  667 1525:invokevirtual   #255 <Method void bno.c(int)>
									int i8 = bgj.b(((bno) (obj4)).l());
	//  668 1528:aload           33
	//  669 1530:invokevirtual   #257 <Method int bno.l()>
	//  670 1533:invokestatic    #386 <Method int bgj.b(int)>
	//  671 1536:istore          12
									bhh bhh1 = ((bha) (obj9)).c;
	//  672 1538:aload           36
	//  673 1540:getfield        #439 <Field bhh bha.c>
	//  674 1543:astore          38
									bhj bhj1 = ((bha) (obj9)).a;
	//  675 1545:aload           36
	//  676 1547:getfield        #389 <Field bhj bha.a>
	//  677 1550:astore          39
									bgu bgu1 = bhj1.a;
	//  678 1552:aload           39
	//  679 1554:getfield        #405 <Field bgu bhj.a>
	//  680 1557:astore          40
									bhj1.h[l8] = ((bno) (obj4)).o();
	//  681 1559:aload           39
	//  682 1561:getfield        #423 <Field int[] bhj.h>
	//  683 1564:iload           15
	//  684 1566:aload           33
	//  685 1568:invokevirtual   #267 <Method int bno.o()>
	//  686 1571:iastore         
									bhj1.g[l8] = bhj1.c;
	//  687 1572:aload           39
	//  688 1574:getfield        #426 <Field long[] bhj.g>
	//  689 1577:iload           15
	//  690 1579:aload           39
	//  691 1581:getfield        #393 <Field long bhj.c>
	//  692 1584:lastore         
									if((i8 & 1) != 0)
	//* 693 1585:iload           12
	//* 694 1587:iconst_1        
	//* 695 1588:iand            
	//* 696 1589:ifeq            1619
									{
										long al[] = bhj1.g;
	//  697 1592:aload           39
	//  698 1594:getfield        #426 <Field long[] bhj.g>
	//  699 1597:astore          41
										al[l8] = al[l8] + (long)((bno) (obj4)).l();
	//  700 1599:aload           41
	//  701 1601:iload           15
	//  702 1603:aload           41
	//  703 1605:iload           15
	//  704 1607:laload          
	//  705 1608:aload           33
	//  706 1610:invokevirtual   #257 <Method int bno.l()>
	//  707 1613:i2l             
	//  708 1614:ladd            
	//  709 1615:lastore         
									}
	//* 710 1616:goto            1619
									boolean flag1;
									if((i8 & 4) != 0)
	//* 711 1619:iload           12
	//* 712 1621:iconst_4        
	//* 713 1622:iand            
	//* 714 1623:ifeq            1632
										flag1 = true;
	//  715 1626:iconst_1        
	//  716 1627:istore          8
									else
	//* 717 1629:goto            1635
										flag1 = false;
	//  718 1632:iconst_0        
	//  719 1633:istore          8
									int k5 = bgu1.d;
	//  720 1635:aload           40
	//  721 1637:getfield        #403 <Field int bgu.d>
	//  722 1640:istore          7
									if(flag1)
	//* 723 1642:iload           8
	//* 724 1644:ifeq            1654
										k5 = ((bno) (obj4)).o();
	//  725 1647:aload           33
	//  726 1649:invokevirtual   #267 <Method int bno.o()>
	//  727 1652:istore          7
									boolean flag2;
									if((i8 & 0x100) != 0)
	//* 728 1654:iload           12
	//* 729 1656:sipush          256
	//* 730 1659:iand            
	//* 731 1660:ifeq            1669
										flag2 = true;
	//  732 1663:iconst_1        
	//  733 1664:istore          9
									else
	//* 734 1666:goto            1672
										flag2 = false;
	//  735 1669:iconst_0        
	//  736 1670:istore          9
									boolean flag3;
									if((i8 & 0x200) != 0)
	//* 737 1672:iload           12
	//* 738 1674:sipush          512
	//* 739 1677:iand            
	//* 740 1678:ifeq            1687
										flag3 = true;
	//  741 1681:iconst_1        
	//  742 1682:istore          10
									else
	//* 743 1684:goto            1690
										flag3 = false;
	//  744 1687:iconst_0        
	//  745 1688:istore          10
									boolean flag4;
									if((i8 & 0x400) != 0)
	//* 746 1690:iload           12
	//* 747 1692:sipush          1024
	//* 748 1695:iand            
	//* 749 1696:ifeq            1705
										flag4 = true;
	//  750 1699:iconst_1        
	//  751 1700:istore          11
									else
	//* 752 1702:goto            1708
										flag4 = false;
	//  753 1705:iconst_0        
	//  754 1706:istore          11
									boolean flag5;
									if((i8 & 0x800) != 0)
	//* 755 1708:iload           12
	//* 756 1710:sipush          2048
	//* 757 1713:iand            
	//* 758 1714:ifeq            1723
										flag5 = true;
	//  759 1717:iconst_1        
	//  760 1718:istore          12
									else
	//* 761 1720:goto            1726
										flag5 = false;
	//  762 1723:iconst_0        
	//  763 1724:istore          12
									if(bhh1.i != null && bhh1.i.length == 1 && bhh1.i[0] == 0L)
	//* 764 1726:aload           38
	//* 765 1728:getfield        #441 <Field long[] bhh.i>
	//* 766 1731:ifnull          1779
	//* 767 1734:aload           38
	//* 768 1736:getfield        #441 <Field long[] bhh.i>
	//* 769 1739:arraylength     
	//* 770 1740:iconst_1        
	//* 771 1741:icmpne          1779
	//* 772 1744:aload           38
	//* 773 1746:getfield        #441 <Field long[] bhh.i>
	//* 774 1749:iconst_0        
	//* 775 1750:laload          
	//* 776 1751:lconst_0        
	//* 777 1752:lcmp            
	//* 778 1753:ifne            1779
										l17 = bnw.a(bhh1.j[0], 1000L, bhh1.c);
	//  779 1756:aload           38
	//  780 1758:getfield        #443 <Field long[] bhh.j>
	//  781 1761:iconst_0        
	//  782 1762:laload          
	//  783 1763:ldc2w           #444 <Long 1000L>
	//  784 1766:aload           38
	//  785 1768:getfield        #446 <Field long bhh.c>
	//  786 1771:invokestatic    #449 <Method long bnw.a(long, long, long)>
	//  787 1774:lstore          25
	//* 788 1776:goto            1779
									int ai[] = bhj1.i;
	//  789 1779:aload           39
	//  790 1781:getfield        #428 <Field int[] bhj.i>
	//  791 1784:astore          41
									int ai1[] = bhj1.j;
	//  792 1786:aload           39
	//  793 1788:getfield        #430 <Field int[] bhj.j>
	//  794 1791:astore          42
									long al1[] = bhj1.k;
	//  795 1793:aload           39
	//  796 1795:getfield        #432 <Field long[] bhj.k>
	//  797 1798:astore          43
									i9 = j3;
	//  798 1800:iload           5
	//  799 1802:istore          16
									boolean aflag1[] = bhj1.l;
	//  800 1804:aload           39
	//  801 1806:getfield        #435 <Field boolean[] bhj.l>
	//  802 1809:astore          44
									boolean flag6;
									if(bhh1.b == 2 && (l2 & 1) != 0)
	//* 803 1811:aload           38
	//* 804 1813:getfield        #329 <Field int bhh.b>
	//* 805 1816:iconst_2        
	//* 806 1817:icmpne          1833
	//* 807 1820:iload           4
	//* 808 1822:iconst_1        
	//* 809 1823:iand            
	//* 810 1824:ifeq            1833
										flag6 = true;
	//  811 1827:iconst_1        
	//  812 1828:istore          17
									else
	//* 813 1830:goto            1836
										flag6 = false;
	//  814 1833:iconst_0        
	//  815 1834:istore          17
									int l9 = bhj1.h[l8] + j2;
	//  816 1836:aload           39
	//  817 1838:getfield        #423 <Field int[] bhj.h>
	//  818 1841:iload           15
	//  819 1843:iaload          
	//  820 1844:iload_3         
	//  821 1845:iadd            
	//  822 1846:istore          20
									long l18 = bhh1.c;
	//  823 1848:aload           38
	//  824 1850:getfield        #446 <Field long bhh.c>
	//  825 1853:lstore          27
									long l15;
									if(l8 > 0)
	//* 826 1855:iload           15
	//* 827 1857:ifle            1870
										l15 = bhj1.s;
	//  828 1860:aload           39
	//  829 1862:getfield        #407 <Field long bhj.s>
	//  830 1865:lstore          23
									else
	//* 831 1867:goto            1874
										l15 = l12;
	//  832 1870:lload           21
	//  833 1872:lstore          23
									for(; j2 < l9; j2++)
	//* 834 1874:iload_3         
	//* 835 1875:iload           20
	//* 836 1877:icmpge          2065
									{
										int j9;
										if(flag2)
	//* 837 1880:iload           9
	//* 838 1882:ifeq            1895
											j9 = ((bno) (obj4)).o();
	//  839 1885:aload           33
	//  840 1887:invokevirtual   #267 <Method int bno.o()>
	//  841 1890:istore          18
										else
	//* 842 1892:goto            1902
											j9 = bgu1.b;
	//  843 1895:aload           40
	//  844 1897:getfield        #400 <Field int bgu.b>
	//  845 1900:istore          18
										int k9;
										if(flag3)
	//* 846 1902:iload           10
	//* 847 1904:ifeq            1917
											k9 = ((bno) (obj4)).o();
	//  848 1907:aload           33
	//  849 1909:invokevirtual   #267 <Method int bno.o()>
	//  850 1912:istore          19
										else
	//* 851 1914:goto            1924
											k9 = bgu1.c;
	//  852 1917:aload           40
	//  853 1919:getfield        #402 <Field int bgu.c>
	//  854 1922:istore          19
										if(j2 == 0 && flag1)
	//* 855 1924:iload_3         
	//* 856 1925:ifne            1940
	//* 857 1928:iload           8
	//* 858 1930:ifeq            1940
											j3 = k5;
	//  859 1933:iload           7
	//  860 1935:istore          5
										else
	//* 861 1937:goto            1962
										if(flag4)
	//* 862 1940:iload           11
	//* 863 1942:ifeq            1955
											j3 = ((bno) (obj4)).l();
	//  864 1945:aload           33
	//  865 1947:invokevirtual   #257 <Method int bno.l()>
	//  866 1950:istore          5
										else
	//* 867 1952:goto            1962
											j3 = bgu1.d;
	//  868 1955:aload           40
	//  869 1957:getfield        #403 <Field int bgu.d>
	//  870 1960:istore          5
										if(flag5)
	//* 871 1962:iload           12
	//* 872 1964:ifeq            1988
											ai1[j2] = (int)((long)(((bno) (obj4)).l() * 1000) / l18);
	//  873 1967:aload           42
	//  874 1969:iload_3         
	//  875 1970:aload           33
	//  876 1972:invokevirtual   #257 <Method int bno.l()>
	//  877 1975:sipush          1000
	//  878 1978:imul            
	//  879 1979:i2l             
	//  880 1980:lload           27
	//  881 1982:ldiv            
	//  882 1983:l2i             
	//  883 1984:iastore         
										else
	//* 884 1985:goto            1993
											ai1[j2] = 0;
	//  885 1988:aload           42
	//  886 1990:iload_3         
	//  887 1991:iconst_0        
	//  888 1992:iastore         
										al1[j2] = bnw.a(l15, 1000L, l18) - l17;
	//  889 1993:aload           43
	//  890 1995:iload_3         
	//  891 1996:lload           23
	//  892 1998:ldc2w           #444 <Long 1000L>
	//  893 2001:lload           27
	//  894 2003:invokestatic    #449 <Method long bnw.a(long, long, long)>
	//  895 2006:lload           25
	//  896 2008:lsub            
	//  897 2009:lastore         
										ai[j2] = k9;
	//  898 2010:aload           41
	//  899 2012:iload_3         
	//  900 2013:iload           19
	//  901 2015:iastore         
										boolean flag8;
										if((j3 >> 16 & 1) == 0 && (!flag6 || j2 == 0))
	//* 902 2016:iload           5
	//* 903 2018:bipush          16
	//* 904 2020:ishr            
	//* 905 2021:iconst_1        
	//* 906 2022:iand            
	//* 907 2023:ifne            2041
	//* 908 2026:iload           17
	//* 909 2028:ifeq            2035
	//* 910 2031:iload_3         
	//* 911 2032:ifne            2041
											flag8 = true;
	//  912 2035:iconst_1        
	//  913 2036:istore          29
										else
	//* 914 2038:goto            2044
											flag8 = false;
	//  915 2041:iconst_0        
	//  916 2042:istore          29
										aflag1[j2] = flag8;
	//  917 2044:aload           44
	//  918 2046:iload_3         
	//  919 2047:iload           29
	//  920 2049:bastore         
										l15 += j9;
	//  921 2050:lload           23
	//  922 2052:iload           18
	//  923 2054:i2l             
	//  924 2055:ladd            
	//  925 2056:lstore          23
									}

	//  926 2058:iload_3         
	//  927 2059:iconst_1        
	//  928 2060:iadd            
	//  929 2061:istore_3        
	//* 930 2062:goto            1874
									bhj1.s = l15;
	//  931 2065:aload           39
	//  932 2067:lload           23
	//  933 2069:putfield        #407 <Field long bhj.s>
									j2 = l9;
	//  934 2072:iload           20
	//  935 2074:istore_3        
									l8++;
	//  936 2075:iload           15
	//  937 2077:iconst_1        
	//  938 2078:iadd            
	//  939 2079:istore          15
								} else
	//* 940 2081:goto            2088
								{
									i9 = j3;
	//  941 2084:iload           5
	//  942 2086:istore          16
								}
								j3 = i9 + 1;
	//  943 2088:iload           16
	//  944 2090:iconst_1        
	//  945 2091:iadd            
	//  946 2092:istore          5
							} while(true);
	//  947 2094:goto            1479
							obj4 = obj;
	//  948 2097:aload           30
	//  949 2099:astore          33
							obj = obj2;
	//  950 2101:aload           31
	//  951 2103:astore          30
							j3 = i4;
	//  952 2105:iload           6
	//  953 2107:istore          5
							obj10 = ((Object) (bgk1.d(bgj.ac)));
	//  954 2109:aload           35
	//  955 2111:getstatic       #452 <Field int bgj.ac>
	//  956 2114:invokevirtual   #311 <Method bgl bgk.d(int)>
	//  957 2117:astore          37
							if(obj10 != null)
	//* 958 2119:aload           37
	//* 959 2121:ifnull          2395
							{
								bhi abhi[] = ((bha) (obj9)).c.h;
	//  960 2124:aload           36
	//  961 2126:getfield        #439 <Field bhh bha.c>
	//  962 2129:getfield        #455 <Field bhi[] bhh.h>
	//  963 2132:astore          36
								obj2 = obj3;
	//  964 2134:aload           32
	//  965 2136:astore          31
								abhi = ((bhi []) (abhi[((bhj) (obj2)).a.a]));
	//  966 2138:aload           36
	//  967 2140:aload           31
	//  968 2142:getfield        #405 <Field bgu bhj.a>
	//  969 2145:getfield        #399 <Field int bgu.a>
	//  970 2148:aaload          
	//  971 2149:astore          36
								obj10 = ((Object) (((bgl) (obj10)).aP));
	//  972 2151:aload           37
	//  973 2153:getfield        #178 <Field bno bgl.aP>
	//  974 2156:astore          37
								int j7 = ((bhi) (abhi)).a;
	//  975 2158:aload           36
	//  976 2160:getfield        #458 <Field int bhi.a>
	//  977 2163:istore          9
								((bno) (obj10)).c(8);
	//  978 2165:aload           37
	//  979 2167:bipush          8
	//  980 2169:invokevirtual   #255 <Method void bno.c(int)>
								if((bgj.b(((bno) (obj10)).l()) & 1) == 1)
	//* 981 2172:aload           37
	//* 982 2174:invokevirtual   #257 <Method int bno.l()>
	//* 983 2177:invokestatic    #386 <Method int bgj.b(int)>
	//* 984 2180:iconst_1        
	//* 985 2181:iand            
	//* 986 2182:iconst_1        
	//* 987 2183:icmpne          2193
									((bno) (obj10)).d(8);
	//  988 2186:aload           37
	//  989 2188:bipush          8
	//  990 2190:invokevirtual   #460 <Method void bno.d(int)>
								j2 = ((bno) (obj10)).f();
	//  991 2193:aload           37
	//  992 2195:invokevirtual   #462 <Method int bno.f()>
	//  993 2198:istore_3        
								int k6 = ((bno) (obj10)).o();
	//  994 2199:aload           37
	//  995 2201:invokevirtual   #267 <Method int bno.o()>
	//  996 2204:istore          8
								if(k6 == ((bhj) (obj2)).f)
	//* 997 2206:iload           8
	//* 998 2208:aload           31
	//* 999 2210:getfield        #420 <Field int bhj.f>
	//*1000 2213:icmpne          2332
								{
									int l5;
									if(j2 == 0)
	//*1001 2216:iload_3         
	//*1002 2217:ifne            2286
									{
										boolean aflag[] = ((bhj) (obj2)).n;
	// 1003 2220:aload           31
	// 1004 2222:getfield        #437 <Field boolean[] bhj.n>
	// 1005 2225:astore          36
										i4 = 0;
	// 1006 2227:iconst_0        
	// 1007 2228:istore          6
										j2 = 0;
	// 1008 2230:iconst_0        
	// 1009 2231:istore_3        
										do
										{
											l5 = j2;
	// 1010 2232:iload_3         
	// 1011 2233:istore          7
											if(i4 >= k6)
												break;
	// 1012 2235:iload           6
	// 1013 2237:iload           8
	// 1014 2239:icmpge          2322
											l5 = ((bno) (obj10)).f();
	// 1015 2242:aload           37
	// 1016 2244:invokevirtual   #462 <Method int bno.f()>
	// 1017 2247:istore          7
											j2 += l5;
	// 1018 2249:iload_3         
	// 1019 2250:iload           7
	// 1020 2252:iadd            
	// 1021 2253:istore_3        
											boolean flag9;
											if(l5 > j7)
	//*1022 2254:iload           7
	//*1023 2256:iload           9
	//*1024 2258:icmple          2267
												flag9 = true;
	// 1025 2261:iconst_1        
	// 1026 2262:istore          29
											else
	//*1027 2264:goto            2270
												flag9 = false;
	// 1028 2267:iconst_0        
	// 1029 2268:istore          29
											aflag[i4] = flag9;
	// 1030 2270:aload           36
	// 1031 2272:iload           6
	// 1032 2274:iload           29
	// 1033 2276:bastore         
											i4++;
	// 1034 2277:iload           6
	// 1035 2279:iconst_1        
	// 1036 2280:iadd            
	// 1037 2281:istore          6
										} while(true);
	// 1038 2283:goto            2232
									} else
									{
										boolean flag10;
										if(j2 > j7)
	//*1039 2286:iload_3         
	//*1040 2287:iload           9
	//*1041 2289:icmple          2298
											flag10 = true;
	// 1042 2292:iconst_1        
	// 1043 2293:istore          29
										else
	//*1044 2295:goto            2301
											flag10 = false;
	// 1045 2298:iconst_0        
	// 1046 2299:istore          29
										l5 = j2 * k6 + 0;
	// 1047 2301:iload_3         
	// 1048 2302:iload           8
	// 1049 2304:imul            
	// 1050 2305:iconst_0        
	// 1051 2306:iadd            
	// 1052 2307:istore          7
										Arrays.fill(((bhj) (obj2)).n, 0, k6, flag10);
	// 1053 2309:aload           31
	// 1054 2311:getfield        #437 <Field boolean[] bhj.n>
	// 1055 2314:iconst_0        
	// 1056 2315:iload           8
	// 1057 2317:iload           29
	// 1058 2319:invokestatic    #468 <Method void Arrays.fill(boolean[], int, int, boolean)>
									}
									((bhj) (obj2)).a(l5);
	// 1059 2322:aload           31
	// 1060 2324:iload           7
	// 1061 2326:invokevirtual   #470 <Method void bhj.a(int)>
								} else
	//*1062 2329:goto            2395
								{
									j2 = ((bhj) (obj2)).f;
	// 1063 2332:aload           31
	// 1064 2334:getfield        #420 <Field int bhj.f>
	// 1065 2337:istore_3        
									obj = ((Object) (new StringBuilder(41)));
	// 1066 2338:new             #472 <Class StringBuilder>
	// 1067 2341:dup             
	// 1068 2342:bipush          41
	// 1069 2344:invokespecial   #473 <Method void StringBuilder(int)>
	// 1070 2347:astore          30
									((StringBuilder) (obj)).append("Length mismatch: ");
	// 1071 2349:aload           30
	// 1072 2351:ldc2            #475 <String "Length mismatch: ">
	// 1073 2354:invokevirtual   #479 <Method StringBuilder StringBuilder.append(String)>
	// 1074 2357:pop             
									((StringBuilder) (obj)).append(k6);
	// 1075 2358:aload           30
	// 1076 2360:iload           8
	// 1077 2362:invokevirtual   #482 <Method StringBuilder StringBuilder.append(int)>
	// 1078 2365:pop             
									((StringBuilder) (obj)).append(", ");
	// 1079 2366:aload           30
	// 1080 2368:ldc2            #484 <String ", ">
	// 1081 2371:invokevirtual   #479 <Method StringBuilder StringBuilder.append(String)>
	// 1082 2374:pop             
									((StringBuilder) (obj)).append(j2);
	// 1083 2375:aload           30
	// 1084 2377:iload_3         
	// 1085 2378:invokevirtual   #482 <Method StringBuilder StringBuilder.append(int)>
	// 1086 2381:pop             
									throw new bdj(((StringBuilder) (obj)).toString());
	// 1087 2382:new             #486 <Class bdj>
	// 1088 2385:dup             
	// 1089 2386:aload           30
	// 1090 2388:invokevirtual   #490 <Method String StringBuilder.toString()>
	// 1091 2391:invokespecial   #493 <Method void bdj(String)>
	// 1092 2394:athrow          
								}
							}
							obj2 = ((Object) (bgk1.d(bgj.ad)));
	// 1093 2395:aload           35
	// 1094 2397:getstatic       #496 <Field int bgj.ad>
	// 1095 2400:invokevirtual   #311 <Method bgl bgk.d(int)>
	// 1096 2403:astore          31
							if(obj2 != null)
	//*1097 2405:aload           31
	//*1098 2407:ifnull          2547
							{
								obj2 = ((Object) (((bgl) (obj2)).aP));
	// 1099 2410:aload           31
	// 1100 2412:getfield        #178 <Field bno bgl.aP>
	// 1101 2415:astore          31
								((bno) (obj2)).c(8);
	// 1102 2417:aload           31
	// 1103 2419:bipush          8
	// 1104 2421:invokevirtual   #255 <Method void bno.c(int)>
								j2 = ((bno) (obj2)).l();
	// 1105 2424:aload           31
	// 1106 2426:invokevirtual   #257 <Method int bno.l()>
	// 1107 2429:istore_3        
								if((bgj.b(j2) & 1) == 1)
	//*1108 2430:iload_3         
	//*1109 2431:invokestatic    #386 <Method int bgj.b(int)>
	//*1110 2434:iconst_1        
	//*1111 2435:iand            
	//*1112 2436:iconst_1        
	//*1113 2437:icmpne          2447
									((bno) (obj2)).d(8);
	// 1114 2440:aload           31
	// 1115 2442:bipush          8
	// 1116 2444:invokevirtual   #460 <Method void bno.d(int)>
								i4 = ((bno) (obj2)).o();
	// 1117 2447:aload           31
	// 1118 2449:invokevirtual   #267 <Method int bno.o()>
	// 1119 2452:istore          6
								if(i4 == 1)
	//*1120 2454:iload           6
	//*1121 2456:iconst_1        
	//*1122 2457:icmpne          2506
								{
									j2 = bgj.a(j2);
	// 1123 2460:iload_3         
	// 1124 2461:invokestatic    #296 <Method int bgj.a(int)>
	// 1125 2464:istore_3        
									long l16 = ((bhj) (obj3)).d;
	// 1126 2465:aload           32
	// 1127 2467:getfield        #395 <Field long bhj.d>
	// 1128 2470:lstore          23
									long l13;
									if(j2 == 0)
	//*1129 2472:iload_3         
	//*1130 2473:ifne            2486
										l13 = ((bno) (obj2)).j();
	// 1131 2476:aload           31
	// 1132 2478:invokevirtual   #299 <Method long bno.j()>
	// 1133 2481:lstore          21
									else
	//*1134 2483:goto            2493
										l13 = ((bno) (obj2)).p();
	// 1135 2486:aload           31
	// 1136 2488:invokevirtual   #301 <Method long bno.p()>
	// 1137 2491:lstore          21
									obj3.d = l16 + l13;
	// 1138 2493:aload           32
	// 1139 2495:lload           23
	// 1140 2497:lload           21
	// 1141 2499:ladd            
	// 1142 2500:putfield        #395 <Field long bhj.d>
								} else
	//*1143 2503:goto            2547
								{
									obj = ((Object) (new StringBuilder(40)));
	// 1144 2506:new             #472 <Class StringBuilder>
	// 1145 2509:dup             
	// 1146 2510:bipush          40
	// 1147 2512:invokespecial   #473 <Method void StringBuilder(int)>
	// 1148 2515:astore          30
									((StringBuilder) (obj)).append("Unexpected saio entry count: ");
	// 1149 2517:aload           30
	// 1150 2519:ldc2            #498 <String "Unexpected saio entry count: ">
	// 1151 2522:invokevirtual   #479 <Method StringBuilder StringBuilder.append(String)>
	// 1152 2525:pop             
									((StringBuilder) (obj)).append(i4);
	// 1153 2526:aload           30
	// 1154 2528:iload           6
	// 1155 2530:invokevirtual   #482 <Method StringBuilder StringBuilder.append(int)>
	// 1156 2533:pop             
									throw new bdj(((StringBuilder) (obj)).toString());
	// 1157 2534:new             #486 <Class bdj>
	// 1158 2537:dup             
	// 1159 2538:aload           30
	// 1160 2540:invokevirtual   #490 <Method String StringBuilder.toString()>
	// 1161 2543:invokespecial   #493 <Method void bdj(String)>
	// 1162 2546:athrow          
								}
							}
							obj2 = ((Object) (bgk1.d(bgj.ah)));
	// 1163 2547:aload           35
	// 1164 2549:getstatic       #501 <Field int bgj.ah>
	// 1165 2552:invokevirtual   #311 <Method bgl bgk.d(int)>
	// 1166 2555:astore          31
							if(obj2 != null)
	//*1167 2557:aload           31
	//*1168 2559:ifnull          2573
								a(((bgl) (obj2)).aP, 0, ((bhj) (obj3)));
	// 1169 2562:aload           31
	// 1170 2564:getfield        #178 <Field bno bgl.aP>
	// 1171 2567:iconst_0        
	// 1172 2568:aload           32
	// 1173 2570:invokestatic    #504 <Method void a(bno, int, bhj)>
							aflag = ((boolean []) (bgk1.d(bgj.ae)));
	// 1174 2573:aload           35
	// 1175 2575:getstatic       #507 <Field int bgj.ae>
	// 1176 2578:invokevirtual   #311 <Method bgl bgk.d(int)>
	// 1177 2581:astore          36
							obj2 = ((Object) (bgk1.d(bgj.af)));
	// 1178 2583:aload           35
	// 1179 2585:getstatic       #510 <Field int bgj.af>
	// 1180 2588:invokevirtual   #311 <Method bgl bgk.d(int)>
	// 1181 2591:astore          31
							if(aflag != null && obj2 != null)
	//*1182 2593:aload           36
	//*1183 2595:ifnull          2836
	//*1184 2598:aload           31
	//*1185 2600:ifnull          2836
							{
								aflag = ((boolean []) (((bgl) (aflag)).aP));
	// 1186 2603:aload           36
	// 1187 2605:getfield        #178 <Field bno bgl.aP>
	// 1188 2608:astore          36
								obj2 = ((Object) (((bgl) (obj2)).aP));
	// 1189 2610:aload           31
	// 1190 2612:getfield        #178 <Field bno bgl.aP>
	// 1191 2615:astore          31
								((bno) (aflag)).c(8);
	// 1192 2617:aload           36
	// 1193 2619:bipush          8
	// 1194 2621:invokevirtual   #255 <Method void bno.c(int)>
								j2 = ((bno) (aflag)).l();
	// 1195 2624:aload           36
	// 1196 2626:invokevirtual   #257 <Method int bno.l()>
	// 1197 2629:istore_3        
								if(((bno) (aflag)).l() == b)
	//*1198 2630:aload           36
	//*1199 2632:invokevirtual   #257 <Method int bno.l()>
	//*1200 2635:getstatic       #72  <Field int b>
	//*1201 2638:icmpne          2833
								{
									if(bgj.a(j2) == 1)
	//*1202 2641:iload_3         
	//*1203 2642:invokestatic    #296 <Method int bgj.a(int)>
	//*1204 2645:iconst_1        
	//*1205 2646:icmpne          2655
										((bno) (aflag)).d(4);
	// 1206 2649:aload           36
	// 1207 2651:iconst_4        
	// 1208 2652:invokevirtual   #460 <Method void bno.d(int)>
									if(((bno) (aflag)).l() == 1)
	//*1209 2655:aload           36
	//*1210 2657:invokevirtual   #257 <Method int bno.l()>
	//*1211 2660:iconst_1        
	//*1212 2661:icmpne          2822
									{
										((bno) (obj2)).c(8);
	// 1213 2664:aload           31
	// 1214 2666:bipush          8
	// 1215 2668:invokevirtual   #255 <Method void bno.c(int)>
										j2 = ((bno) (obj2)).l();
	// 1216 2671:aload           31
	// 1217 2673:invokevirtual   #257 <Method int bno.l()>
	// 1218 2676:istore_3        
										if(((bno) (obj2)).l() == b)
	//*1219 2677:aload           31
	//*1220 2679:invokevirtual   #257 <Method int bno.l()>
	//*1221 2682:getstatic       #72  <Field int b>
	//*1222 2685:icmpne          2819
										{
											j2 = bgj.a(j2);
	// 1223 2688:iload_3         
	// 1224 2689:invokestatic    #296 <Method int bgj.a(int)>
	// 1225 2692:istore_3        
											if(j2 == 1)
	//*1226 2693:iload_3         
	//*1227 2694:iconst_1        
	//*1228 2695:icmpne          2722
											{
												if(((bno) (obj2)).j() == 0L)
	//*1229 2698:aload           31
	//*1230 2700:invokevirtual   #299 <Method long bno.j()>
	//*1231 2703:lconst_0        
	//*1232 2704:lcmp            
	//*1233 2705:ifeq            2711
	//*1234 2708:goto            2736
													throw new bdj("Variable length decription in sgpd found (unsupported)");
	// 1235 2711:new             #486 <Class bdj>
	// 1236 2714:dup             
	// 1237 2715:ldc2            #512 <String "Variable length decription in sgpd found (unsupported)">
	// 1238 2718:invokespecial   #493 <Method void bdj(String)>
	// 1239 2721:athrow          
											} else
											if(j2 >= 2)
	//*1240 2722:iload_3         
	//*1241 2723:iconst_2        
	//*1242 2724:icmplt          2736
												((bno) (obj2)).d(4);
	// 1243 2727:aload           31
	// 1244 2729:iconst_4        
	// 1245 2730:invokevirtual   #460 <Method void bno.d(int)>
	//*1246 2733:goto            2736
											if(((bno) (obj2)).j() == 1L)
	//*1247 2736:aload           31
	//*1248 2738:invokevirtual   #299 <Method long bno.j()>
	//*1249 2741:lconst_1        
	//*1250 2742:lcmp            
	//*1251 2743:ifne            2808
											{
												((bno) (obj2)).d(2);
	// 1252 2746:aload           31
	// 1253 2748:iconst_2        
	// 1254 2749:invokevirtual   #460 <Method void bno.d(int)>
												if(((bno) (obj2)).f() == 1)
	//*1255 2752:aload           31
	//*1256 2754:invokevirtual   #462 <Method int bno.f()>
	//*1257 2757:iconst_1        
	//*1258 2758:icmpne          2836
												{
													j2 = ((bno) (obj2)).f();
	// 1259 2761:aload           31
	// 1260 2763:invokevirtual   #462 <Method int bno.f()>
	// 1261 2766:istore_3        
													byte abyte0[] = new byte[16];
	// 1262 2767:bipush          16
	// 1263 2769:newarray        byte[]
	// 1264 2771:astore          36
													((bno) (obj2)).a(abyte0, 0, 16);
	// 1265 2773:aload           31
	// 1266 2775:aload           36
	// 1267 2777:iconst_0        
	// 1268 2778:bipush          16
	// 1269 2780:invokevirtual   #515 <Method void bno.a(byte[], int, int)>
													obj3.m = true;
	// 1270 2783:aload           32
	// 1271 2785:iconst_1        
	// 1272 2786:putfield        #517 <Field boolean bhj.m>
													obj3.o = new bhi(true, j2, abyte0);
	// 1273 2789:aload           32
	// 1274 2791:new             #457 <Class bhi>
	// 1275 2794:dup             
	// 1276 2795:iconst_1        
	// 1277 2796:iload_3         
	// 1278 2797:aload           36
	// 1279 2799:invokespecial   #520 <Method void bhi(boolean, int, byte[])>
	// 1280 2802:putfield        #523 <Field bhi bhj.o>
												}
											} else
	//*1281 2805:goto            2836
											{
												throw new bdj("Entry count in sgpd != 1 (unsupported).");
	// 1282 2808:new             #486 <Class bdj>
	// 1283 2811:dup             
	// 1284 2812:ldc2            #525 <String "Entry count in sgpd != 1 (unsupported).">
	// 1285 2815:invokespecial   #493 <Method void bdj(String)>
	// 1286 2818:athrow          
											}
										}
									} else
	//*1287 2819:goto            2836
									{
										throw new bdj("Entry count in sbgp != 1 (unsupported).");
	// 1288 2822:new             #486 <Class bdj>
	// 1289 2825:dup             
	// 1290 2826:ldc2            #527 <String "Entry count in sbgp != 1 (unsupported).">
	// 1291 2829:invokespecial   #493 <Method void bdj(String)>
	// 1292 2832:athrow          
									}
								}
							}
	//*1293 2833:goto            2836
							i4 = bgk1.aQ.size();
	// 1294 2836:aload           35
	// 1295 2838:getfield        #243 <Field List bgk.aQ>
	// 1296 2841:invokeinterface #158 <Method int List.size()>
	// 1297 2846:istore          6
							for(j2 = 0; j2 < i4; j2++)
	//*1298 2848:iconst_0        
	//*1299 2849:istore_3        
	//*1300 2850:iload_3         
	//*1301 2851:iload           6
	//*1302 2853:icmpge          2941
							{
								obj2 = ((Object) ((bgl)bgk1.aQ.get(j2)));
	// 1303 2856:aload           35
	// 1304 2858:getfield        #243 <Field List bgk.aQ>
	// 1305 2861:iload_3         
	// 1306 2862:invokeinterface #162 <Method Object List.get(int)>
	// 1307 2867:checkcast       #164 <Class bgl>
	// 1308 2870:astore          31
								if(((bgl) (obj2)).aO != bgj.ag)
									continue;
	// 1309 2872:aload           31
	// 1310 2874:getfield        #167 <Field int bgl.aO>
	// 1311 2877:getstatic       #530 <Field int bgj.ag>
	// 1312 2880:icmpne          2934
								bno bno3 = ((bgl) (obj2)).aP;
	// 1313 2883:aload           31
	// 1314 2885:getfield        #178 <Field bno bgl.aP>
	// 1315 2888:astore          36
								bno3.c(8);
	// 1316 2890:aload           36
	// 1317 2892:bipush          8
	// 1318 2894:invokevirtual   #255 <Method void bno.c(int)>
								obj2 = obj;
	// 1319 2897:aload           30
	// 1320 2899:astore          31
								bno3.a(((byte []) (obj2)), 0, 16);
	// 1321 2901:aload           36
	// 1322 2903:aload           31
	// 1323 2905:iconst_0        
	// 1324 2906:bipush          16
	// 1325 2908:invokevirtual   #515 <Method void bno.a(byte[], int, int)>
								if(Arrays.equals(((byte []) (obj2)), c))
	//*1326 2911:aload           31
	//*1327 2913:getstatic       #88  <Field byte[] c>
	//*1328 2916:invokestatic    #534 <Method boolean Arrays.equals(byte[], byte[])>
	//*1329 2919:ifeq            2934
									a(bno3, 16, ((bhj) (obj3)));
	// 1330 2922:aload           36
	// 1331 2924:bipush          16
	// 1332 2926:aload           32
	// 1333 2928:invokestatic    #504 <Method void a(bno, int, bhj)>
							}

	// 1334 2931:goto            2934
	// 1335 2934:iload_3         
	// 1336 2935:iconst_1        
	// 1337 2936:iadd            
	// 1338 2937:istore_3        
	//*1339 2938:goto            2850
							obj2 = obj;
	// 1340 2941:aload           30
	// 1341 2943:astore          31
							j2 = j8;
	// 1342 2945:iload           13
	// 1343 2947:istore_3        
							obj = obj4;
	// 1344 2948:aload           33
	// 1345 2950:astore          30
						} else
	//*1346 2952:goto            2978
						{
							int j4 = j2;
	// 1347 2955:iload_3         
	// 1348 2956:istore          6
							j2 = j3;
	// 1349 2958:iload           5
	// 1350 2960:istore_3        
							j3 = j4;
	// 1351 2961:iload           6
	// 1352 2963:istore          5
						}
					} else
	//*1353 2965:goto            2978
					{
						int k4 = j3;
	// 1354 2968:iload           5
	// 1355 2970:istore          6
						j3 = j2;
	// 1356 2972:iload_3         
	// 1357 2973:istore          5
						j2 = k4;
	// 1358 2975:iload           6
	// 1359 2977:istore_3        
					}
					int l4 = j3 + 1;
	// 1360 2978:iload           5
	// 1361 2980:iconst_1        
	// 1362 2981:iadd            
	// 1363 2982:istore          6
					j3 = j2;
	// 1364 2984:iload_3         
	// 1365 2985:istore          5
					j2 = l4;
	// 1366 2987:iload           6
	// 1367 2989:istore_3        
				} while(true);
	// 1368 2990:goto            799
				j2 = 0;
	// 1369 2993:iconst_0        
	// 1370 2994:istore_3        
				obj2 = ((Object) (a(((bgk) (obj)).aQ)));
	// 1371 2995:aload           30
	// 1372 2997:getfield        #243 <Field List bgk.aQ>
	// 1373 3000:invokestatic    #245 <Method zzhp a(List)>
	// 1374 3003:astore          31
				if(obj2 != null)
	//*1375 3005:aload           31
	//*1376 3007:ifnull          3073
				{
					obj = ((Object) (this));
	// 1377 3010:aload_0         
	// 1378 3011:astore          30
					for(int i3 = ((bgx) (obj)).f.size(); j2 < i3; j2++)
	//*1379 3013:aload           30
	//*1380 3015:getfield        #143 <Field SparseArray f>
	//*1381 3018:invokevirtual   #321 <Method int SparseArray.size()>
	//*1382 3021:istore          4
	//*1383 3023:iload_3         
	//*1384 3024:iload           4
	//*1385 3026:icmpge          3073
					{
						obj3 = ((Object) ((bha)((bgx) (obj)).f.valueAt(j2)));
	// 1386 3029:aload           30
	// 1387 3031:getfield        #143 <Field SparseArray f>
	// 1388 3034:iload_3         
	// 1389 3035:invokevirtual   #324 <Method Object SparseArray.valueAt(int)>
	// 1390 3038:checkcast       #326 <Class bha>
	// 1391 3041:astore          32
						((bha) (obj3)).b.a(((bha) (obj3)).c.f.a(((zzhp) (obj2))));
	// 1392 3043:aload           32
	// 1393 3045:getfield        #536 <Field bfw bha.b>
	// 1394 3048:aload           32
	// 1395 3050:getfield        #439 <Field bhh bha.c>
	// 1396 3053:getfield        #539 <Field zzfs bhh.f>
	// 1397 3056:aload           31
	// 1398 3058:invokevirtual   #542 <Method zzfs zzfs.a(zzhp)>
	// 1399 3061:invokeinterface #365 <Method void bfw.a(zzfs)>
					}

	// 1400 3066:iload_3         
	// 1401 3067:iconst_1        
	// 1402 3068:iadd            
	// 1403 3069:istore_3        
				}
	//*1404 3070:goto            3023
				obj = ((Object) (this));
	// 1405 3073:aload_0         
	// 1406 3074:astore          30
			} else
	//*1407 3076:goto            3
			if(!((bgx) (obj)).n.isEmpty())
	//*1408 3079:aload           30
	//*1409 3081:getfield        #133 <Field Stack n>
	//*1410 3084:invokevirtual   #218 <Method boolean Stack.isEmpty()>
	//*1411 3087:ifne            3106
				((bgk)((bgx) (obj)).n.peek()).a(((bgk) (obj3)));
	// 1412 3090:aload           30
	// 1413 3092:getfield        #133 <Field Stack n>
	// 1414 3095:invokevirtual   #222 <Method Object Stack.peek()>
	// 1415 3098:checkcast       #224 <Class bgk>
	// 1416 3101:aload           32
	// 1417 3103:invokevirtual   #545 <Method void bgk.a(bgk)>
		} while(true);
	// 1418 3106:goto            3
		a();
	// 1419 3109:aload_0         
	// 1420 3110:invokespecial   #151 <Method void a()>
	// 1421 3113:return          
	}

	private static void a(bno bno1, int i1, bhj bhj1)
	{
		bno1.c(i1 + 8);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:bipush          8
	//    3    4:iadd            
	//    4    5:invokevirtual   #255 <Method void bno.c(int)>
		i1 = bgj.b(bno1.l());
	//    5    8:aload_0         
	//    6    9:invokevirtual   #257 <Method int bno.l()>
	//    7   12:invokestatic    #386 <Method int bgj.b(int)>
	//    8   15:istore_1        
		if((i1 & 1) == 0)
	//*   9   16:iload_1         
	//*  10   17:iconst_1        
	//*  11   18:iand            
	//*  12   19:ifne            154
		{
			boolean flag;
			if((i1 & 2) != 0)
	//*  13   22:iload_1         
	//*  14   23:iconst_2        
	//*  15   24:iand            
	//*  16   25:ifeq            34
				flag = true;
	//   17   28:iconst_1        
	//   18   29:istore          4
			else
	//*  19   31:goto            37
				flag = false;
	//   20   34:iconst_0        
	//   21   35:istore          4
			i1 = bno1.o();
	//   22   37:aload_0         
	//   23   38:invokevirtual   #267 <Method int bno.o()>
	//   24   41:istore_1        
			if(i1 == bhj1.f)
	//*  25   42:iload_1         
	//*  26   43:aload_2         
	//*  27   44:getfield        #420 <Field int bhj.f>
	//*  28   47:icmpne          99
			{
				Arrays.fill(bhj1.n, 0, i1, flag);
	//   29   50:aload_2         
	//   30   51:getfield        #437 <Field boolean[] bhj.n>
	//   31   54:iconst_0        
	//   32   55:iload_1         
	//   33   56:iload           4
	//   34   58:invokestatic    #468 <Method void Arrays.fill(boolean[], int, int, boolean)>
				bhj1.a(bno1.b());
	//   35   61:aload_2         
	//   36   62:aload_0         
	//   37   63:invokevirtual   #547 <Method int bno.b()>
	//   38   66:invokevirtual   #470 <Method void bhj.a(int)>
				bno1.a(bhj1.q.a, 0, bhj1.p);
	//   39   69:aload_0         
	//   40   70:aload_2         
	//   41   71:getfield        #549 <Field bno bhj.q>
	//   42   74:getfield        #179 <Field byte[] bno.a>
	//   43   77:iconst_0        
	//   44   78:aload_2         
	//   45   79:getfield        #550 <Field int bhj.p>
	//   46   82:invokevirtual   #515 <Method void bno.a(byte[], int, int)>
				bhj1.q.c(0);
	//   47   85:aload_2         
	//   48   86:getfield        #549 <Field bno bhj.q>
	//   49   89:iconst_0        
	//   50   90:invokevirtual   #255 <Method void bno.c(int)>
				bhj1.r = false;
	//   51   93:aload_2         
	//   52   94:iconst_0        
	//   53   95:putfield        #552 <Field boolean bhj.r>
				return;
	//   54   98:return          
			} else
			{
				int j1 = bhj1.f;
	//   55   99:aload_2         
	//   56  100:getfield        #420 <Field int bhj.f>
	//   57  103:istore_3        
				bno1 = ((bno) (new StringBuilder(41)));
	//   58  104:new             #472 <Class StringBuilder>
	//   59  107:dup             
	//   60  108:bipush          41
	//   61  110:invokespecial   #473 <Method void StringBuilder(int)>
	//   62  113:astore_0        
				((StringBuilder) (bno1)).append("Length mismatch: ");
	//   63  114:aload_0         
	//   64  115:ldc2            #475 <String "Length mismatch: ">
	//   65  118:invokevirtual   #479 <Method StringBuilder StringBuilder.append(String)>
	//   66  121:pop             
				((StringBuilder) (bno1)).append(i1);
	//   67  122:aload_0         
	//   68  123:iload_1         
	//   69  124:invokevirtual   #482 <Method StringBuilder StringBuilder.append(int)>
	//   70  127:pop             
				((StringBuilder) (bno1)).append(", ");
	//   71  128:aload_0         
	//   72  129:ldc2            #484 <String ", ">
	//   73  132:invokevirtual   #479 <Method StringBuilder StringBuilder.append(String)>
	//   74  135:pop             
				((StringBuilder) (bno1)).append(j1);
	//   75  136:aload_0         
	//   76  137:iload_3         
	//   77  138:invokevirtual   #482 <Method StringBuilder StringBuilder.append(int)>
	//   78  141:pop             
				throw new bdj(((StringBuilder) (bno1)).toString());
	//   79  142:new             #486 <Class bdj>
	//   80  145:dup             
	//   81  146:aload_0         
	//   82  147:invokevirtual   #490 <Method String StringBuilder.toString()>
	//   83  150:invokespecial   #493 <Method void bdj(String)>
	//   84  153:athrow          
			}
		} else
		{
			throw new bdj("Overriding TrackEncryptionBox parameters is unsupported.");
	//   85  154:new             #486 <Class bdj>
	//   86  157:dup             
	//   87  158:ldc2            #554 <String "Overriding TrackEncryptionBox parameters is unsupported.">
	//   88  161:invokespecial   #493 <Method void bdj(String)>
	//   89  164:athrow          
		}
	}

	public final int a(bfo bfo, bft bft)
	{
		throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:659)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
	//    0    0:new             #557 <Class RuntimeException>
	//    1    3:dup             
	//    2    4:ldc2            #559 <String "d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:659)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n">
	//    3    7:invokespecial   #562 <Method void Runtime(String)>
	//    4   10:athrow          
	}

	public final void a(long l1, long l2)
	{
		int j1 = f.size();
	//    0    0:aload_0         
	//    1    1:getfield        #143 <Field SparseArray f>
	//    2    4:invokevirtual   #321 <Method int SparseArray.size()>
	//    3    7:istore          6
		for(int i1 = 0; i1 < j1; i1++)
	//*   4    9:iconst_0        
	//*   5   10:istore          5
	//*   6   12:iload           5
	//*   7   14:iload           6
	//*   8   16:icmpge          43
			((bha)f.valueAt(i1)).a();
	//    9   19:aload_0         
	//   10   20:getfield        #143 <Field SparseArray f>
	//   11   23:iload           5
	//   12   25:invokevirtual   #324 <Method Object SparseArray.valueAt(int)>
	//   13   28:checkcast       #326 <Class bha>
	//   14   31:invokevirtual   #408 <Method void bha.a()>

	//   15   34:iload           5
	//   16   36:iconst_1        
	//   17   37:iadd            
	//   18   38:istore          5
	//*  19   40:goto            12
		o.clear();
	//   20   43:aload_0         
	//   21   44:getfield        #138 <Field LinkedList o>
	//   22   47:invokevirtual   #566 <Method void LinkedList.clear()>
		v = 0;
	//   23   50:aload_0         
	//   24   51:iconst_0        
	//   25   52:putfield        #568 <Field int v>
		n.clear();
	//   26   55:aload_0         
	//   27   56:getfield        #133 <Field Stack n>
	//   28   59:invokevirtual   #569 <Method void Stack.clear()>
		a();
	//   29   62:aload_0         
	//   30   63:invokespecial   #151 <Method void a()>
	//   31   66:return          
	}

	public final void a(bfp bfp1)
	{
		D = bfp1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #328 <Field bfp D>
	//    3    5:return          
	}

	public final boolean a(bfo bfo)
	{
		return bhg.a(bfo);
	//    0    0:aload_1         
	//    1    1:invokestatic    #575 <Method boolean bhg.a(bfo)>
	//    2    4:ireturn         
	}

	public final void c()
	{
	//    0    0:return          
	}

	private static final bfq a = new bgy();
	private static final int b = bnw.f("seig");
	private static final byte c[] = {
		-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 
		108, 66, 124, 100, -115, -12
	};
	private int A;
	private int B;
	private boolean C;
	private bfp D;
	private bfw E;
	private bfw F[];
	private boolean G;
	private final int d;
	private final bhh e;
	private final SparseArray f;
	private final bno g;
	private final bno h;
	private final bno i;
	private final bno j;
	private final bnt k;
	private final bno l;
	private final byte m[];
	private final Stack n;
	private final LinkedList o;
	private int p;
	private int q;
	private long r;
	private int s;
	private bno t;
	private long u;
	private int v;
	private long w;
	private long x;
	private bha y;
	private int z;

	static 
	{
	//    0    0:new             #58  <Class bgy>
	//    1    3:dup             
	//    2    4:invokespecial   #61  <Method void bgy()>
	//    3    7:putstatic       #63  <Field bfq a>
	//    4   10:ldc1            #65  <String "seig">
	//    5   12:invokestatic    #70  <Method int bnw.f(String)>
	//    6   15:putstatic       #72  <Field int b>
	//    7   18:bipush          16
	//    8   20:newarray        byte[]
	//    9   22:dup             
	//   10   23:iconst_0        
	//   11   24:ldc1            #73  <Int -94>
	//   12   26:bastore         
	//   13   27:dup             
	//   14   28:iconst_1        
	//   15   29:ldc1            #74  <Int 57>
	//   16   31:bastore         
	//   17   32:dup             
	//   18   33:iconst_2        
	//   19   34:ldc1            #75  <Int 79>
	//   20   36:bastore         
	//   21   37:dup             
	//   22   38:iconst_3        
	//   23   39:ldc1            #76  <Int 82>
	//   24   41:bastore         
	//   25   42:dup             
	//   26   43:iconst_4        
	//   27   44:ldc1            #77  <Int 90>
	//   28   46:bastore         
	//   29   47:dup             
	//   30   48:iconst_5        
	//   31   49:ldc1            #78  <Int -101>
	//   32   51:bastore         
	//   33   52:dup             
	//   34   53:bipush          6
	//   35   55:ldc1            #75  <Int 79>
	//   36   57:bastore         
	//   37   58:dup             
	//   38   59:bipush          7
	//   39   61:ldc1            #79  <Int 20>
	//   40   63:bastore         
	//   41   64:dup             
	//   42   65:bipush          8
	//   43   67:ldc1            #73  <Int -94>
	//   44   69:bastore         
	//   45   70:dup             
	//   46   71:bipush          9
	//   47   73:ldc1            #80  <Int 68>
	//   48   75:bastore         
	//   49   76:dup             
	//   50   77:bipush          10
	//   51   79:ldc1            #81  <Int 108>
	//   52   81:bastore         
	//   53   82:dup             
	//   54   83:bipush          11
	//   55   85:ldc1            #82  <Int 66>
	//   56   87:bastore         
	//   57   88:dup             
	//   58   89:bipush          12
	//   59   91:ldc1            #83  <Int 124>
	//   60   93:bastore         
	//   61   94:dup             
	//   62   95:bipush          13
	//   63   97:ldc1            #84  <Int 100>
	//   64   99:bastore         
	//   65  100:dup             
	//   66  101:bipush          14
	//   67  103:ldc1            #85  <Int -115>
	//   68  105:bastore         
	//   69  106:dup             
	//   70  107:bipush          15
	//   71  109:ldc1            #86  <Int -12>
	//   72  111:bastore         
	//   73  112:putstatic       #88  <Field byte[] c>
	//*  74  115:return          
	}
}
