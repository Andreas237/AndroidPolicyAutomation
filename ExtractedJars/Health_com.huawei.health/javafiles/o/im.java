// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import android.content.Context;
import android.location.Location;
import android.os.*;
import android.telephony.NeighboringCellInfo;
import android.text.TextUtils;
import java.io.*;
import java.lang.reflect.Method;
import java.util.*;
import java.util.zip.GZIPOutputStream;

// Referenced classes of package o:
//			ih, iq, kj, ij, 
//			kk, ik, ip, kg, 
//			is, iu, io, il

public class im
{

	protected im(Context context)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		c = 0;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #17  <Field int c>
		b = 0;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #19  <Field int b>
		e = 0;
	//    8   14:aload_0         
	//    9   15:iconst_0        
	//   10   16:putfield        #21  <Field int e>
		d = context;
	//   11   19:aload_0         
	//   12   20:aload_1         
	//   13   21:putfield        #23  <Field Context d>
		b(768);
	//   14   24:aload_0         
	//   15   25:sipush          768
	//   16   28:invokevirtual   #26  <Method void b(int)>
	//   17   31:return          
	}

	public static transient int a(Object obj, String s, Object aobj[])
	{
		Class class1 = obj.getClass();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #33  <Method Class Object.getClass()>
	//    2    4:astore          5
		Class aclass[] = new Class[aobj.length];
	//    3    6:aload_2         
	//    4    7:arraylength     
	//    5    8:anewarray       Class[]
	//    6   11:astore          6
		int i = 0;
	//    7   13:iconst_0        
	//    8   14:istore_3        
		for(int j = aobj.length; i < j; i++)
	//*   9   15:aload_2         
	//*  10   16:arraylength     
	//*  11   17:istore          4
	//*  12   19:iload_3         
	//*  13   20:iload           4
	//*  14   22:icmpge          58
		{
			aclass[i] = aobj[i].getClass();
	//   15   25:aload           6
	//   16   27:iload_3         
	//   17   28:aload_2         
	//   18   29:iload_3         
	//   19   30:aaload          
	//   20   31:invokevirtual   #33  <Method Class Object.getClass()>
	//   21   34:aastore         
			if(aclass[i] == java/lang/Integer)
	//*  22   35:aload           6
	//*  23   37:iload_3         
	//*  24   38:aaload          
	//*  25   39:ldc1            #37  <Class Integer>
	//*  26   41:if_acmpne       51
				aclass[i] = Integer.TYPE;
	//   27   44:aload           6
	//   28   46:iload_3         
	//   29   47:getstatic       #41  <Field Class Integer.TYPE>
	//   30   50:aastore         
		}

	//   31   51:iload_3         
	//   32   52:iconst_1        
	//   33   53:iadd            
	//   34   54:istore_3        
	//*  35   55:goto            19
		s = ((String) (class1.getDeclaredMethod(s, aclass)));
	//   36   58:aload           5
	//   37   60:aload_1         
	//   38   61:aload           6
	//   39   63:invokevirtual   #45  <Method Method Class.getDeclaredMethod(String, Class[])>
	//   40   66:astore_1        
		if(!((Method) (s)).isAccessible())
	//*  41   67:aload_1         
	//*  42   68:invokevirtual   #51  <Method boolean Method.isAccessible()>
	//*  43   71:ifne            79
			((Method) (s)).setAccessible(true);
	//   44   74:aload_1         
	//   45   75:iconst_1        
	//   46   76:invokevirtual   #55  <Method void Method.setAccessible(boolean)>
		return ((Integer)((Method) (s)).invoke(obj, aobj)).intValue();
	//   47   79:aload_1         
	//   48   80:aload_0         
	//   49   81:aload_2         
	//   50   82:invokevirtual   #59  <Method Object Method.invoke(Object, Object[])>
	//   51   85:checkcast       #37  <Class Integer>
	//   52   88:invokevirtual   #63  <Method int Integer.intValue()>
	//   53   91:ireturn         
	}

	protected static ih a(Location location, iq iq1, int i, byte byte0, long l, boolean flag)
	{
		ih ih1 = new ih();
	//    0    0:new             #66  <Class ih>
	//    1    3:dup             
	//    2    4:invokespecial   #67  <Method void ih()>
	//    3    7:astore          10
		if(i <= 0 || i > 3 || iq1 == null)
	//*   4    9:iload_2         
	//*   5   10:ifle            22
	//*   6   13:iload_2         
	//*   7   14:iconst_3        
	//*   8   15:icmpgt          22
	//*   9   18:aload_1         
	//*  10   19:ifnonnull       24
			return null;
	//   11   22:aconst_null     
	//   12   23:areturn         
		boolean flag1;
		if(i == 1 || i == 3)
	//*  13   24:iload_2         
	//*  14   25:iconst_1        
	//*  15   26:icmpeq          34
	//*  16   29:iload_2         
	//*  17   30:iconst_3        
	//*  18   31:icmpne          40
			flag1 = true;
	//   19   34:iconst_1        
	//   20   35:istore          8
		else
	//*  21   37:goto            43
			flag1 = false;
	//   22   40:iconst_0        
	//   23   41:istore          8
		boolean flag2;
		if(i == 2 || i == 3)
	//*  24   43:iload_2         
	//*  25   44:iconst_2        
	//*  26   45:icmpeq          53
	//*  27   48:iload_2         
	//*  28   49:iconst_3        
	//*  29   50:icmpne          59
			flag2 = true;
	//   30   53:iconst_1        
	//   31   54:istore          9
		else
	//*  32   56:goto            62
			flag2 = false;
	//   33   59:iconst_0        
	//   34   60:istore          9
		byte abyte0[] = iq1.u().getBytes();
	//   35   62:aload_1         
	//   36   63:invokevirtual   #73  <Method String iq.u()>
	//   37   66:invokevirtual   #79  <Method byte[] String.getBytes()>
	//   38   69:astore          11
		System.arraycopy(((Object) (abyte0)), 0, ((Object) (ih1.e)), 0, e(abyte0.length, ih1.e.length));
	//   39   71:aload           11
	//   40   73:iconst_0        
	//   41   74:aload           10
	//   42   76:getfield        #82  <Field byte[] ih.e>
	//   43   79:iconst_0        
	//   44   80:aload           11
	//   45   82:arraylength     
	//   46   83:aload           10
	//   47   85:getfield        #82  <Field byte[] ih.e>
	//   48   88:arraylength     
	//   49   89:invokestatic    #85  <Method int e(int, int)>
	//   50   92:invokestatic    #91  <Method void System.arraycopy(Object, int, Object, int, int)>
		abyte0 = iq1.f().getBytes();
	//   51   95:aload_1         
	//   52   96:invokevirtual   #94  <Method String iq.f()>
	//   53   99:invokevirtual   #79  <Method byte[] String.getBytes()>
	//   54  102:astore          11
		System.arraycopy(((Object) (abyte0)), 0, ((Object) (ih1.k)), 0, e(abyte0.length, ih1.k.length));
	//   55  104:aload           11
	//   56  106:iconst_0        
	//   57  107:aload           10
	//   58  109:getfield        #97  <Field byte[] ih.k>
	//   59  112:iconst_0        
	//   60  113:aload           11
	//   61  115:arraylength     
	//   62  116:aload           10
	//   63  118:getfield        #97  <Field byte[] ih.k>
	//   64  121:arraylength     
	//   65  122:invokestatic    #85  <Method int e(int, int)>
	//   66  125:invokestatic    #91  <Method void System.arraycopy(Object, int, Object, int, int)>
		abyte0 = iq1.k().getBytes();
	//   67  128:aload_1         
	//   68  129:invokevirtual   #99  <Method String iq.k()>
	//   69  132:invokevirtual   #79  <Method byte[] String.getBytes()>
	//   70  135:astore          11
		System.arraycopy(((Object) (abyte0)), 0, ((Object) (ih1.b)), 0, e(abyte0.length, ih1.b.length));
	//   71  137:aload           11
	//   72  139:iconst_0        
	//   73  140:aload           10
	//   74  142:getfield        #101 <Field byte[] ih.b>
	//   75  145:iconst_0        
	//   76  146:aload           11
	//   77  148:arraylength     
	//   78  149:aload           10
	//   79  151:getfield        #101 <Field byte[] ih.b>
	//   80  154:arraylength     
	//   81  155:invokestatic    #85  <Method int e(int, int)>
	//   82  158:invokestatic    #91  <Method void System.arraycopy(Object, int, Object, int, int)>
		abyte0 = iq1.i().getBytes();
	//   83  161:aload_1         
	//   84  162:invokevirtual   #104 <Method String iq.i()>
	//   85  165:invokevirtual   #79  <Method byte[] String.getBytes()>
	//   86  168:astore          11
		System.arraycopy(((Object) (abyte0)), 0, ((Object) (ih1.d)), 0, e(abyte0.length, ih1.d.length));
	//   87  170:aload           11
	//   88  172:iconst_0        
	//   89  173:aload           10
	//   90  175:getfield        #106 <Field byte[] ih.d>
	//   91  178:iconst_0        
	//   92  179:aload           11
	//   93  181:arraylength     
	//   94  182:aload           10
	//   95  184:getfield        #106 <Field byte[] ih.d>
	//   96  187:arraylength     
	//   97  188:invokestatic    #85  <Method int e(int, int)>
	//   98  191:invokestatic    #91  <Method void System.arraycopy(Object, int, Object, int, int)>
		ih1.c = (short)iq1.s();
	//   99  194:aload           10
	//  100  196:aload_1         
	//  101  197:invokevirtual   #109 <Method int iq.s()>
	//  102  200:int2short       
	//  103  201:putfield        #112 <Field short ih.c>
		ih1.a = (short)iq1.q();
	//  104  204:aload           10
	//  105  206:aload_1         
	//  106  207:invokevirtual   #115 <Method int iq.q()>
	//  107  210:int2short       
	//  108  211:putfield        #117 <Field short ih.a>
		ih1.i = (byte)iq1.r();
	//  109  214:aload           10
	//  110  216:aload_1         
	//  111  217:invokevirtual   #120 <Method int iq.r()>
	//  112  220:int2byte        
	//  113  221:putfield        #123 <Field byte ih.i>
		abyte0 = iq1.t().getBytes();
	//  114  224:aload_1         
	//  115  225:invokevirtual   #126 <Method String iq.t()>
	//  116  228:invokevirtual   #79  <Method byte[] String.getBytes()>
	//  117  231:astore          11
		System.arraycopy(((Object) (abyte0)), 0, ((Object) (ih1.h)), 0, e(abyte0.length, ih1.h.length));
	//  118  233:aload           11
	//  119  235:iconst_0        
	//  120  236:aload           10
	//  121  238:getfield        #129 <Field byte[] ih.h>
	//  122  241:iconst_0        
	//  123  242:aload           11
	//  124  244:arraylength     
	//  125  245:aload           10
	//  126  247:getfield        #129 <Field byte[] ih.h>
	//  127  250:arraylength     
	//  128  251:invokestatic    #85  <Method int e(int, int)>
	//  129  254:invokestatic    #91  <Method void System.arraycopy(Object, int, Object, int, int)>
		l /= 1000L;
	//  130  257:lload           4
	//  131  259:ldc2w           #130 <Long 1000L>
	//  132  262:ldiv            
	//  133  263:lstore          4
		if(location != null && iq1.d())
	//* 134  265:aload_0         
	//* 135  266:ifnull          281
	//* 136  269:aload_1         
	//* 137  270:invokevirtual   #133 <Method boolean iq.d()>
	//* 138  273:ifeq            281
			i = 1;
	//  139  276:iconst_1        
	//  140  277:istore_2        
		else
	//* 141  278:goto            283
			i = 0;
	//  142  281:iconst_0        
	//  143  282:istore_2        
		if(i != 0)
	//* 144  283:iload_2         
	//* 145  284:ifeq            472
		{
			kj kj1 = new kj();
	//  146  287:new             #135 <Class kj>
	//  147  290:dup             
	//  148  291:invokespecial   #136 <Method void kj()>
	//  149  294:astore          11
			kj1.b = (int)l;
	//  150  296:aload           11
	//  151  298:lload           4
	//  152  300:l2i             
	//  153  301:putfield        #137 <Field int kj.b>
			ij ij1 = new ij();
	//  154  304:new             #139 <Class ij>
	//  155  307:dup             
	//  156  308:invokespecial   #140 <Method void ij()>
	//  157  311:astore          12
			ij1.b = (int)(location.getLongitude() * 1000000D);
	//  158  313:aload           12
	//  159  315:aload_0         
	//  160  316:invokevirtual   #146 <Method double Location.getLongitude()>
	//  161  319:ldc2w           #147 <Double 1000000D>
	//  162  322:dmul            
	//  163  323:d2i             
	//  164  324:putfield        #149 <Field int ij.b>
			ij1.c = (int)(location.getLatitude() * 1000000D);
	//  165  327:aload           12
	//  166  329:aload_0         
	//  167  330:invokevirtual   #152 <Method double Location.getLatitude()>
	//  168  333:ldc2w           #147 <Double 1000000D>
	//  169  336:dmul            
	//  170  337:d2i             
	//  171  338:putfield        #153 <Field int ij.c>
			ij1.e = (int)location.getAltitude();
	//  172  341:aload           12
	//  173  343:aload_0         
	//  174  344:invokevirtual   #156 <Method double Location.getAltitude()>
	//  175  347:d2i             
	//  176  348:putfield        #157 <Field int ij.e>
			ij1.a = (int)location.getAccuracy();
	//  177  351:aload           12
	//  178  353:aload_0         
	//  179  354:invokevirtual   #161 <Method float Location.getAccuracy()>
	//  180  357:f2i             
	//  181  358:putfield        #163 <Field int ij.a>
			ij1.d = (int)location.getSpeed();
	//  182  361:aload           12
	//  183  363:aload_0         
	//  184  364:invokevirtual   #166 <Method float Location.getSpeed()>
	//  185  367:f2i             
	//  186  368:putfield        #168 <Field int ij.d>
			ij1.i = (short)(int)location.getBearing();
	//  187  371:aload           12
	//  188  373:aload_0         
	//  189  374:invokevirtual   #171 <Method float Location.getBearing()>
	//  190  377:f2i             
	//  191  378:int2short       
	//  192  379:putfield        #173 <Field short ij.i>
			if(!Build.MODEL.equals("sdk") && (!iq.c(iq1.x()) || !kk.b))
	//* 193  382:getstatic       #179 <Field String Build.MODEL>
	//* 194  385:ldc1            #181 <String "sdk">
	//* 195  387:invokevirtual   #185 <Method boolean String.equals(Object)>
	//* 196  390:ifne            418
	//* 197  393:aload_1         
	//* 198  394:invokevirtual   #189 <Method Context iq.x()>
	//* 199  397:invokestatic    #192 <Method boolean iq.c(Context)>
	//* 200  400:ifeq            409
	//* 201  403:getstatic       #197 <Field boolean kk.b>
	//* 202  406:ifne            418
				ij1.f = 0;
	//  203  409:aload           12
	//  204  411:iconst_0        
	//  205  412:putfield        #199 <Field byte ij.f>
			else
	//* 206  415:goto            424
				ij1.f = 1;
	//  207  418:aload           12
	//  208  420:iconst_1        
	//  209  421:putfield        #199 <Field byte ij.f>
			ij1.k = byte0;
	//  210  424:aload           12
	//  211  426:iload_3         
	//  212  427:putfield        #201 <Field byte ij.k>
			ij1.g = System.currentTimeMillis();
	//  213  430:aload           12
	//  214  432:invokestatic    #205 <Method long System.currentTimeMillis()>
	//  215  435:putfield        #209 <Field long ij.g>
			ij1.h = iq1.o();
	//  216  438:aload           12
	//  217  440:aload_1         
	//  218  441:invokevirtual   #212 <Method long iq.o()>
	//  219  444:putfield        #214 <Field long ij.h>
			kj1.e = ij1;
	//  220  447:aload           11
	//  221  449:aload           12
	//  222  451:putfield        #217 <Field ij kj.e>
			i = 0 + 1;
	//  223  454:iconst_0        
	//  224  455:iconst_1        
	//  225  456:iadd            
	//  226  457:istore_2        
			ih1.g.add(((Object) (kj1)));
	//  227  458:aload           10
	//  228  460:getfield        #220 <Field ArrayList ih.g>
	//  229  463:aload           11
	//  230  465:invokevirtual   #225 <Method boolean ArrayList.add(Object)>
	//  231  468:pop             
		} else
	//* 232  469:goto            711
		if(flag)
	//* 233  472:iload           6
	//* 234  474:ifeq            709
		{
			kj kj2 = new kj();
	//  235  477:new             #135 <Class kj>
	//  236  480:dup             
	//  237  481:invokespecial   #136 <Method void kj()>
	//  238  484:astore          11
			kj2.b = (int)l;
	//  239  486:aload           11
	//  240  488:lload           4
	//  241  490:l2i             
	//  242  491:putfield        #137 <Field int kj.b>
			ik ik1 = new ik();
	//  243  494:new             #227 <Class ik>
	//  244  497:dup             
	//  245  498:invokespecial   #228 <Method void ik()>
	//  246  501:astore          12
			ik1.b = iq1.y();
	//  247  503:aload           12
	//  248  505:aload_1         
	//  249  506:invokevirtual   #232 <Method byte iq.y()>
	//  250  509:putfield        #234 <Field byte ik.b>
			for(i = 0; i < ik1.b; i++)
	//* 251  512:iconst_0        
	//* 252  513:istore_2        
	//* 253  514:iload_2         
	//* 254  515:aload           12
	//* 255  517:getfield        #234 <Field byte ik.b>
	//* 256  520:icmpge          684
			{
				ip ip1 = new ip();
	//  257  523:new             #236 <Class ip>
	//  258  526:dup             
	//  259  527:invokespecial   #237 <Method void ip()>
	//  260  530:astore          13
				ip1.a = (byte)iq1.e(i).length();
	//  261  532:aload           13
	//  262  534:aload_1         
	//  263  535:iload_2         
	//  264  536:invokevirtual   #240 <Method String iq.e(int)>
	//  265  539:invokevirtual   #243 <Method int String.length()>
	//  266  542:int2byte        
	//  267  543:putfield        #245 <Field byte ip.a>
				System.arraycopy(((Object) (iq1.e(i).getBytes())), 0, ((Object) (ip1.b)), 0, ((int) (ip1.a)));
	//  268  546:aload_1         
	//  269  547:iload_2         
	//  270  548:invokevirtual   #240 <Method String iq.e(int)>
	//  271  551:invokevirtual   #79  <Method byte[] String.getBytes()>
	//  272  554:iconst_0        
	//  273  555:aload           13
	//  274  557:getfield        #246 <Field byte[] ip.b>
	//  275  560:iconst_0        
	//  276  561:aload           13
	//  277  563:getfield        #245 <Field byte ip.a>
	//  278  566:invokestatic    #91  <Method void System.arraycopy(Object, int, Object, int, int)>
				ip1.c = iq1.b(i);
	//  279  569:aload           13
	//  280  571:aload_1         
	//  281  572:iload_2         
	//  282  573:invokevirtual   #249 <Method double iq.b(int)>
	//  283  576:putfield        #252 <Field double ip.c>
				ip1.d = iq1.a(i);
	//  284  579:aload           13
	//  285  581:aload_1         
	//  286  582:iload_2         
	//  287  583:invokevirtual   #255 <Method int iq.a(int)>
	//  288  586:putfield        #256 <Field int ip.d>
				ip1.e = iq1.c(i);
	//  289  589:aload           13
	//  290  591:aload_1         
	//  291  592:iload_2         
	//  292  593:invokevirtual   #258 <Method int iq.c(int)>
	//  293  596:putfield        #259 <Field int ip.e>
				ip1.f = iq1.d(i);
	//  294  599:aload           13
	//  295  601:aload_1         
	//  296  602:iload_2         
	//  297  603:invokevirtual   #261 <Method double iq.d(int)>
	//  298  606:putfield        #263 <Field double ip.f>
				ip1.h = iq1.f(i);
	//  299  609:aload           13
	//  300  611:aload_1         
	//  301  612:iload_2         
	//  302  613:invokevirtual   #266 <Method byte iq.f(int)>
	//  303  616:putfield        #268 <Field byte ip.h>
				ip1.g = (byte)iq1.k(i).length();
	//  304  619:aload           13
	//  305  621:aload_1         
	//  306  622:iload_2         
	//  307  623:invokevirtual   #270 <Method String iq.k(int)>
	//  308  626:invokevirtual   #243 <Method int String.length()>
	//  309  629:int2byte        
	//  310  630:putfield        #272 <Field byte ip.g>
				System.arraycopy(((Object) (iq1.k(i).getBytes())), 0, ((Object) (ip1.k)), 0, ((int) (ip1.g)));
	//  311  633:aload_1         
	//  312  634:iload_2         
	//  313  635:invokevirtual   #270 <Method String iq.k(int)>
	//  314  638:invokevirtual   #79  <Method byte[] String.getBytes()>
	//  315  641:iconst_0        
	//  316  642:aload           13
	//  317  644:getfield        #273 <Field byte[] ip.k>
	//  318  647:iconst_0        
	//  319  648:aload           13
	//  320  650:getfield        #272 <Field byte ip.g>
	//  321  653:invokestatic    #91  <Method void System.arraycopy(Object, int, Object, int, int)>
				ip1.i = iq1.i(i);
	//  322  656:aload           13
	//  323  658:aload_1         
	//  324  659:iload_2         
	//  325  660:invokevirtual   #275 <Method byte iq.i(int)>
	//  326  663:putfield        #276 <Field byte ip.i>
				ik1.e.add(((Object) (ip1)));
	//  327  666:aload           12
	//  328  668:getfield        #278 <Field ArrayList ik.e>
	//  329  671:aload           13
	//  330  673:invokevirtual   #225 <Method boolean ArrayList.add(Object)>
	//  331  676:pop             
			}

	//  332  677:iload_2         
	//  333  678:iconst_1        
	//  334  679:iadd            
	//  335  680:istore_2        
	//* 336  681:goto            514
			kj2.f = ik1;
	//  337  684:aload           11
	//  338  686:aload           12
	//  339  688:putfield        #281 <Field ik kj.f>
			i = 0 + 1;
	//  340  691:iconst_0        
	//  341  692:iconst_1        
	//  342  693:iadd            
	//  343  694:istore_2        
			ih1.g.add(((Object) (kj2)));
	//  344  695:aload           10
	//  345  697:getfield        #220 <Field ArrayList ih.g>
	//  346  700:aload           11
	//  347  702:invokevirtual   #225 <Method boolean ArrayList.add(Object)>
	//  348  705:pop             
		} else
	//* 349  706:goto            711
		{
			return null;
	//  350  709:aconst_null     
	//  351  710:areturn         
		}
		int j = i;
	//  352  711:iload_2         
	//  353  712:istore          7
		if(iq1.c())
	//* 354  714:aload_1         
	//* 355  715:invokevirtual   #283 <Method boolean iq.c()>
	//* 356  718:ifeq            995
		{
			j = i;
	//  357  721:iload_2         
	//  358  722:istore          7
			if(!iq1.h())
	//* 359  724:aload_1         
	//* 360  725:invokevirtual   #285 <Method boolean iq.h()>
	//* 361  728:ifne            995
			{
				j = i;
	//  362  731:iload_2         
	//  363  732:istore          7
				if(flag1)
	//* 364  734:iload           8
	//* 365  736:ifeq            995
				{
					j = i;
	//  366  739:iload_2         
	//  367  740:istore          7
					if(!flag)
	//* 368  742:iload           6
	//* 369  744:ifne            995
					{
						kj kj3 = new kj();
	//  370  747:new             #135 <Class kj>
	//  371  750:dup             
	//  372  751:invokespecial   #136 <Method void kj()>
	//  373  754:astore          11
						kj3.b = (int)l;
	//  374  756:aload           11
	//  375  758:lload           4
	//  376  760:l2i             
	//  377  761:putfield        #137 <Field int kj.b>
						kg kg1 = new kg();
	//  378  764:new             #287 <Class kg>
	//  379  767:dup             
	//  380  768:invokespecial   #288 <Method void kg()>
	//  381  771:astore          12
						List list = iq1.b(location.getSpeed());
	//  382  773:aload_1         
	//  383  774:aload_0         
	//  384  775:invokevirtual   #166 <Method float Location.getSpeed()>
	//  385  778:invokevirtual   #291 <Method List iq.b(float)>
	//  386  781:astore          13
						if(list != null && list.size() >= 3)
	//* 387  783:aload           13
	//* 388  785:ifnull          838
	//* 389  788:aload           13
	//* 390  790:invokeinterface #296 <Method int List.size()>
	//* 391  795:iconst_3        
	//* 392  796:icmplt          838
						{
							kg1.b = (short)((Integer)list.get(0)).intValue();
	//  393  799:aload           12
	//  394  801:aload           13
	//  395  803:iconst_0        
	//  396  804:invokeinterface #300 <Method Object List.get(int)>
	//  397  809:checkcast       #37  <Class Integer>
	//  398  812:invokevirtual   #63  <Method int Integer.intValue()>
	//  399  815:int2short       
	//  400  816:putfield        #302 <Field short kg.b>
							kg1.a = ((Integer)list.get(1)).intValue();
	//  401  819:aload           12
	//  402  821:aload           13
	//  403  823:iconst_1        
	//  404  824:invokeinterface #300 <Method Object List.get(int)>
	//  405  829:checkcast       #37  <Class Integer>
	//  406  832:invokevirtual   #63  <Method int Integer.intValue()>
	//  407  835:putfield        #303 <Field int kg.a>
						}
						kg1.d = iq1.l();
	//  408  838:aload           12
	//  409  840:aload_1         
	//  410  841:invokevirtual   #306 <Method byte iq.l()>
	//  411  844:putfield        #308 <Field byte kg.d>
						list = iq1.p();
	//  412  847:aload_1         
	//  413  848:invokevirtual   #312 <Method List iq.p()>
	//  414  851:astore          13
						kg1.c = (byte)list.size();
	//  415  853:aload           12
	//  416  855:aload           13
	//  417  857:invokeinterface #296 <Method int List.size()>
	//  418  862:int2byte        
	//  419  863:putfield        #314 <Field byte kg.c>
						for(j = 0; j < list.size(); j++)
	//* 420  866:iconst_0        
	//* 421  867:istore          7
	//* 422  869:iload           7
	//* 423  871:aload           13
	//* 424  873:invokeinterface #296 <Method int List.size()>
	//* 425  878:icmpge          972
						{
							is is1 = new is();
	//  426  881:new             #316 <Class is>
	//  427  884:dup             
	//  428  885:invokespecial   #317 <Method void is()>
	//  429  888:astore          14
							is1.b = (short)((NeighboringCellInfo)list.get(j)).getLac();
	//  430  890:aload           14
	//  431  892:aload           13
	//  432  894:iload           7
	//  433  896:invokeinterface #300 <Method Object List.get(int)>
	//  434  901:checkcast       #319 <Class NeighboringCellInfo>
	//  435  904:invokevirtual   #322 <Method int NeighboringCellInfo.getLac()>
	//  436  907:int2short       
	//  437  908:putfield        #323 <Field short is.b>
							is1.d = ((NeighboringCellInfo)list.get(j)).getCid();
	//  438  911:aload           14
	//  439  913:aload           13
	//  440  915:iload           7
	//  441  917:invokeinterface #300 <Method Object List.get(int)>
	//  442  922:checkcast       #319 <Class NeighboringCellInfo>
	//  443  925:invokevirtual   #326 <Method int NeighboringCellInfo.getCid()>
	//  444  928:putfield        #327 <Field int is.d>
							is1.a = (byte)((NeighboringCellInfo)list.get(j)).getRssi();
	//  445  931:aload           14
	//  446  933:aload           13
	//  447  935:iload           7
	//  448  937:invokeinterface #300 <Method Object List.get(int)>
	//  449  942:checkcast       #319 <Class NeighboringCellInfo>
	//  450  945:invokevirtual   #330 <Method int NeighboringCellInfo.getRssi()>
	//  451  948:int2byte        
	//  452  949:putfield        #331 <Field byte is.a>
							kg1.e.add(((Object) (is1)));
	//  453  952:aload           12
	//  454  954:getfield        #332 <Field ArrayList kg.e>
	//  455  957:aload           14
	//  456  959:invokevirtual   #225 <Method boolean ArrayList.add(Object)>
	//  457  962:pop             
						}

	//  458  963:iload           7
	//  459  965:iconst_1        
	//  460  966:iadd            
	//  461  967:istore          7
	//* 462  969:goto            869
						kj3.a = kg1;
	//  463  972:aload           11
	//  464  974:aload           12
	//  465  976:putfield        #335 <Field kg kj.a>
						j = i + 1;
	//  466  979:iload_2         
	//  467  980:iconst_1        
	//  468  981:iadd            
	//  469  982:istore          7
						ih1.g.add(((Object) (kj3)));
	//  470  984:aload           10
	//  471  986:getfield        #220 <Field ArrayList ih.g>
	//  472  989:aload           11
	//  473  991:invokevirtual   #225 <Method boolean ArrayList.add(Object)>
	//  474  994:pop             
					}
				}
			}
		}
		i = j;
	//  475  995:iload           7
	//  476  997:istore_2        
		if(iq1.c())
	//* 477  998:aload_1         
	//* 478  999:invokevirtual   #283 <Method boolean iq.c()>
	//* 479 1002:ifeq            1205
		{
			i = j;
	//  480 1005:iload           7
	//  481 1007:istore_2        
			if(iq1.h())
	//* 482 1008:aload_1         
	//* 483 1009:invokevirtual   #285 <Method boolean iq.h()>
	//* 484 1012:ifeq            1205
			{
				i = j;
	//  485 1015:iload           7
	//  486 1017:istore_2        
				if(flag1)
	//* 487 1018:iload           8
	//* 488 1020:ifeq            1205
				{
					i = j;
	//  489 1023:iload           7
	//  490 1025:istore_2        
					if(!flag)
	//* 491 1026:iload           6
	//* 492 1028:ifne            1205
					{
						kj kj4 = new kj();
	//  493 1031:new             #135 <Class kj>
	//  494 1034:dup             
	//  495 1035:invokespecial   #136 <Method void kj()>
	//  496 1038:astore          11
						kj4.b = (int)l;
	//  497 1040:aload           11
	//  498 1042:lload           4
	//  499 1044:l2i             
	//  500 1045:putfield        #137 <Field int kj.b>
						iu iu1 = new iu();
	//  501 1048:new             #337 <Class iu>
	//  502 1051:dup             
	//  503 1052:invokespecial   #338 <Method void iu()>
	//  504 1055:astore          12
						location = ((Location) (iq1.e(location.getSpeed())));
	//  505 1057:aload_1         
	//  506 1058:aload_0         
	//  507 1059:invokevirtual   #166 <Method float Location.getSpeed()>
	//  508 1062:invokevirtual   #340 <Method List iq.e(float)>
	//  509 1065:astore_0        
						if(location != null && ((List) (location)).size() >= 6)
	//* 510 1066:aload_0         
	//* 511 1067:ifnull          1182
	//* 512 1070:aload_0         
	//* 513 1071:invokeinterface #296 <Method int List.size()>
	//* 514 1076:bipush          6
	//* 515 1078:icmplt          1182
						{
							iu1.d = ((Integer)((List) (location)).get(3)).intValue();
	//  516 1081:aload           12
	//  517 1083:aload_0         
	//  518 1084:iconst_3        
	//  519 1085:invokeinterface #300 <Method Object List.get(int)>
	//  520 1090:checkcast       #37  <Class Integer>
	//  521 1093:invokevirtual   #63  <Method int Integer.intValue()>
	//  522 1096:putfield        #341 <Field int iu.d>
							iu1.a = ((Integer)((List) (location)).get(4)).intValue();
	//  523 1099:aload           12
	//  524 1101:aload_0         
	//  525 1102:iconst_4        
	//  526 1103:invokeinterface #300 <Method Object List.get(int)>
	//  527 1108:checkcast       #37  <Class Integer>
	//  528 1111:invokevirtual   #63  <Method int Integer.intValue()>
	//  529 1114:putfield        #342 <Field int iu.a>
							iu1.b = (short)((Integer)((List) (location)).get(0)).intValue();
	//  530 1117:aload           12
	//  531 1119:aload_0         
	//  532 1120:iconst_0        
	//  533 1121:invokeinterface #300 <Method Object List.get(int)>
	//  534 1126:checkcast       #37  <Class Integer>
	//  535 1129:invokevirtual   #63  <Method int Integer.intValue()>
	//  536 1132:int2short       
	//  537 1133:putfield        #343 <Field short iu.b>
							iu1.c = (short)((Integer)((List) (location)).get(1)).intValue();
	//  538 1136:aload           12
	//  539 1138:aload_0         
	//  540 1139:iconst_1        
	//  541 1140:invokeinterface #300 <Method Object List.get(int)>
	//  542 1145:checkcast       #37  <Class Integer>
	//  543 1148:invokevirtual   #63  <Method int Integer.intValue()>
	//  544 1151:int2short       
	//  545 1152:putfield        #344 <Field short iu.c>
							iu1.e = ((Integer)((List) (location)).get(2)).intValue();
	//  546 1155:aload           12
	//  547 1157:aload_0         
	//  548 1158:iconst_2        
	//  549 1159:invokeinterface #300 <Method Object List.get(int)>
	//  550 1164:checkcast       #37  <Class Integer>
	//  551 1167:invokevirtual   #63  <Method int Integer.intValue()>
	//  552 1170:putfield        #345 <Field int iu.e>
							iu1.g = iq1.l();
	//  553 1173:aload           12
	//  554 1175:aload_1         
	//  555 1176:invokevirtual   #306 <Method byte iq.l()>
	//  556 1179:putfield        #346 <Field byte iu.g>
						}
						kj4.d = iu1;
	//  557 1182:aload           11
	//  558 1184:aload           12
	//  559 1186:putfield        #349 <Field iu kj.d>
						i = j + 1;
	//  560 1189:iload           7
	//  561 1191:iconst_1        
	//  562 1192:iadd            
	//  563 1193:istore_2        
						ih1.g.add(((Object) (kj4)));
	//  564 1194:aload           10
	//  565 1196:getfield        #220 <Field ArrayList ih.g>
	//  566 1199:aload           11
	//  567 1201:invokevirtual   #225 <Method boolean ArrayList.add(Object)>
	//  568 1204:pop             
					}
				}
			}
		}
		j = i;
	//  569 1205:iload_2         
	//  570 1206:istore          7
		if(iq1.a())
	//* 571 1208:aload_1         
	//* 572 1209:invokevirtual   #351 <Method boolean iq.a()>
	//* 573 1212:ifeq            1482
		{
			j = i;
	//  574 1215:iload_2         
	//  575 1216:istore          7
			if(flag2)
	//* 576 1218:iload           9
	//* 577 1220:ifeq            1482
			{
				j = i;
	//  578 1223:iload_2         
	//  579 1224:istore          7
				if(!flag)
	//* 580 1226:iload           6
	//* 581 1228:ifne            1482
				{
					location = ((Location) (new kj()));
	//  582 1231:new             #135 <Class kj>
	//  583 1234:dup             
	//  584 1235:invokespecial   #136 <Method void kj()>
	//  585 1238:astore_0        
					io io1 = new io();
	//  586 1239:new             #353 <Class io>
	//  587 1242:dup             
	//  588 1243:invokespecial   #354 <Method void io()>
	//  589 1246:astore          11
					iq1 = ((iq) (iq1.w()));
	//  590 1248:aload_1         
	//  591 1249:invokevirtual   #357 <Method List iq.w()>
	//  592 1252:astore_1        
					location.b = (int)(((Long)((List) (iq1)).get(0)).longValue() / 1000L);
	//  593 1253:aload_0         
	//  594 1254:aload_1         
	//  595 1255:iconst_0        
	//  596 1256:invokeinterface #300 <Method Object List.get(int)>
	//  597 1261:checkcast       #359 <Class Long>
	//  598 1264:invokevirtual   #362 <Method long Long.longValue()>
	//  599 1267:ldc2w           #130 <Long 1000L>
	//  600 1270:ldiv            
	//  601 1271:l2i             
	//  602 1272:putfield        #137 <Field int kj.b>
					io1.a = (byte)(((List) (iq1)).size() - 1);
	//  603 1275:aload           11
	//  604 1277:aload_1         
	//  605 1278:invokeinterface #296 <Method int List.size()>
	//  606 1283:iconst_1        
	//  607 1284:isub            
	//  608 1285:int2byte        
	//  609 1286:putfield        #363 <Field byte io.a>
					for(j = 1; j < ((List) (iq1)).size(); j++)
	//* 610 1289:iconst_1        
	//* 611 1290:istore          7
	//* 612 1292:iload           7
	//* 613 1294:aload_1         
	//* 614 1295:invokeinterface #296 <Method int List.size()>
	//* 615 1300:icmpge          1461
					{
						List list1 = (List)((List) (iq1)).get(j);
	//  616 1303:aload_1         
	//  617 1304:iload           7
	//  618 1306:invokeinterface #300 <Method Object List.get(int)>
	//  619 1311:checkcast       #293 <Class List>
	//  620 1314:astore          13
						if(list1 != null && list1.size() >= 3)
	//* 621 1316:aload           13
	//* 622 1318:ifnull          1452
	//* 623 1321:aload           13
	//* 624 1323:invokeinterface #296 <Method int List.size()>
	//* 625 1328:iconst_3        
	//* 626 1329:icmplt          1452
						{
							il il1 = new il();
	//  627 1332:new             #365 <Class il>
	//  628 1335:dup             
	//  629 1336:invokespecial   #366 <Method void il()>
	//  630 1339:astore          12
							byte abyte2[] = ((String)list1.get(0)).getBytes();
	//  631 1341:aload           13
	//  632 1343:iconst_0        
	//  633 1344:invokeinterface #300 <Method Object List.get(int)>
	//  634 1349:checkcast       #75  <Class String>
	//  635 1352:invokevirtual   #79  <Method byte[] String.getBytes()>
	//  636 1355:astore          14
							System.arraycopy(((Object) (abyte2)), 0, ((Object) (il1.b)), 0, e(abyte2.length, il1.b.length));
	//  637 1357:aload           14
	//  638 1359:iconst_0        
	//  639 1360:aload           12
	//  640 1362:getfield        #367 <Field byte[] il.b>
	//  641 1365:iconst_0        
	//  642 1366:aload           14
	//  643 1368:arraylength     
	//  644 1369:aload           12
	//  645 1371:getfield        #367 <Field byte[] il.b>
	//  646 1374:arraylength     
	//  647 1375:invokestatic    #85  <Method int e(int, int)>
	//  648 1378:invokestatic    #91  <Method void System.arraycopy(Object, int, Object, int, int)>
							il1.c = (short)((Integer)list1.get(1)).intValue();
	//  649 1381:aload           12
	//  650 1383:aload           13
	//  651 1385:iconst_1        
	//  652 1386:invokeinterface #300 <Method Object List.get(int)>
	//  653 1391:checkcast       #37  <Class Integer>
	//  654 1394:invokevirtual   #63  <Method int Integer.intValue()>
	//  655 1397:int2short       
	//  656 1398:putfield        #368 <Field short il.c>
							byte abyte1[] = ((String)list1.get(2)).getBytes();
	//  657 1401:aload           13
	//  658 1403:iconst_2        
	//  659 1404:invokeinterface #300 <Method Object List.get(int)>
	//  660 1409:checkcast       #75  <Class String>
	//  661 1412:invokevirtual   #79  <Method byte[] String.getBytes()>
	//  662 1415:astore          13
							System.arraycopy(((Object) (abyte1)), 0, ((Object) (il1.d)), 0, e(abyte1.length, il1.d.length));
	//  663 1417:aload           13
	//  664 1419:iconst_0        
	//  665 1420:aload           12
	//  666 1422:getfield        #369 <Field byte[] il.d>
	//  667 1425:iconst_0        
	//  668 1426:aload           13
	//  669 1428:arraylength     
	//  670 1429:aload           12
	//  671 1431:getfield        #369 <Field byte[] il.d>
	//  672 1434:arraylength     
	//  673 1435:invokestatic    #85  <Method int e(int, int)>
	//  674 1438:invokestatic    #91  <Method void System.arraycopy(Object, int, Object, int, int)>
							io1.b.add(((Object) (il1)));
	//  675 1441:aload           11
	//  676 1443:getfield        #371 <Field ArrayList io.b>
	//  677 1446:aload           12
	//  678 1448:invokevirtual   #225 <Method boolean ArrayList.add(Object)>
	//  679 1451:pop             
						}
					}

	//  680 1452:iload           7
	//  681 1454:iconst_1        
	//  682 1455:iadd            
	//  683 1456:istore          7
	//* 684 1458:goto            1292
					location.k = io1;
	//  685 1461:aload_0         
	//  686 1462:aload           11
	//  687 1464:putfield        #374 <Field io kj.k>
					j = i + 1;
	//  688 1467:iload_2         
	//  689 1468:iconst_1        
	//  690 1469:iadd            
	//  691 1470:istore          7
					ih1.g.add(((Object) (location)));
	//  692 1472:aload           10
	//  693 1474:getfield        #220 <Field ArrayList ih.g>
	//  694 1477:aload_0         
	//  695 1478:invokevirtual   #225 <Method boolean ArrayList.add(Object)>
	//  696 1481:pop             
				}
			}
		}
		ih1.f = (short)j;
	//  697 1482:aload           10
	//  698 1484:iload           7
	//  699 1486:int2short       
	//  700 1487:putfield        #376 <Field short ih.f>
		if(j < 2 && !flag)
	//* 701 1490:iload           7
	//* 702 1492:iconst_2        
	//* 703 1493:icmpge          1503
	//* 704 1496:iload           6
	//* 705 1498:ifne            1503
			return null;
	//  706 1501:aconst_null     
	//  707 1502:areturn         
		else
			return ih1;
	//  708 1503:aload           10
	//  709 1505:areturn         
	}

	protected static boolean b()
	{
		if(android.os.Build.VERSION.SDK_INT < 9)
			break MISSING_BLOCK_LABEL_32;
	//    0    0:getstatic       #383 <Field int android.os.Build$VERSION.SDK_INT>
	//    1    3:bipush          9
	//    2    5:icmplt          32
		boolean flag = ((Boolean)((Class) (android/os/Environment)).getMethod("isExternalStorageRemovable", ((Class []) (null))).invoke(((Object) (null)), ((Object []) (null)))).booleanValue();
	//    3    8:ldc2            #385 <Class Environment>
	//    4   11:ldc2            #387 <String "isExternalStorageRemovable">
	//    5   14:aconst_null     
	//    6   15:invokevirtual   #390 <Method Method Class.getMethod(String, Class[])>
	//    7   18:aconst_null     
	//    8   19:aconst_null     
	//    9   20:invokevirtual   #59  <Method Object Method.invoke(Object, Object[])>
	//   10   23:checkcast       #392 <Class Boolean>
	//   11   26:invokevirtual   #395 <Method boolean Boolean.booleanValue()>
	//   12   29:istore_0        
		return flag;
	//   13   30:iload_0         
	//   14   31:ireturn         
_L2:
		return true;
	//   15   32:iconst_1        
	//   16   33:ireturn         
		Exception exception;
		exception;
	//   17   34:astore_1        
		if(true) goto _L2; else goto _L1
_L1:
	//*  18   35:goto            32
	}

	public static transient Object c(Object obj, String s, Object aobj[])
	{
		Class class1 = obj.getClass();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #33  <Method Class Object.getClass()>
	//    2    4:astore          5
		Class aclass[] = new Class[aobj.length];
	//    3    6:aload_2         
	//    4    7:arraylength     
	//    5    8:anewarray       Class[]
	//    6   11:astore          6
		int i = 0;
	//    7   13:iconst_0        
	//    8   14:istore_3        
		for(int j = aobj.length; i < j; i++)
	//*   9   15:aload_2         
	//*  10   16:arraylength     
	//*  11   17:istore          4
	//*  12   19:iload_3         
	//*  13   20:iload           4
	//*  14   22:icmpge          58
		{
			aclass[i] = aobj[i].getClass();
	//   15   25:aload           6
	//   16   27:iload_3         
	//   17   28:aload_2         
	//   18   29:iload_3         
	//   19   30:aaload          
	//   20   31:invokevirtual   #33  <Method Class Object.getClass()>
	//   21   34:aastore         
			if(aclass[i] == java/lang/Integer)
	//*  22   35:aload           6
	//*  23   37:iload_3         
	//*  24   38:aaload          
	//*  25   39:ldc1            #37  <Class Integer>
	//*  26   41:if_acmpne       51
				aclass[i] = Integer.TYPE;
	//   27   44:aload           6
	//   28   46:iload_3         
	//   29   47:getstatic       #41  <Field Class Integer.TYPE>
	//   30   50:aastore         
		}

	//   31   51:iload_3         
	//   32   52:iconst_1        
	//   33   53:iadd            
	//   34   54:istore_3        
	//*  35   55:goto            19
		s = ((String) (class1.getDeclaredMethod(s, aclass)));
	//   36   58:aload           5
	//   37   60:aload_1         
	//   38   61:aload           6
	//   39   63:invokevirtual   #45  <Method Method Class.getDeclaredMethod(String, Class[])>
	//   40   66:astore_1        
		if(!((Method) (s)).isAccessible())
	//*  41   67:aload_1         
	//*  42   68:invokevirtual   #51  <Method boolean Method.isAccessible()>
	//*  43   71:ifne            79
			((Method) (s)).setAccessible(true);
	//   44   74:aload_1         
	//   45   75:iconst_1        
	//   46   76:invokevirtual   #55  <Method void Method.setAccessible(boolean)>
		return ((Method) (s)).invoke(obj, aobj);
	//   47   79:aload_1         
	//   48   80:aload_0         
	//   49   81:aload_2         
	//   50   82:invokevirtual   #59  <Method Object Method.invoke(Object, Object[])>
	//   51   85:areturn         
	}

	private static ArrayList c(File afile[])
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #222 <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #398 <Method void ArrayList()>
	//    3    7:astore_2        
		for(int i = 0; i < afile.length; i++)
	//*   4    8:iconst_0        
	//*   5    9:istore_1        
	//*   6   10:iload_1         
	//*   7   11:aload_0         
	//*   8   12:arraylength     
	//*   9   13:icmpge          66
			if(afile[i].isFile() && afile[i].getName().length() == 10 && TextUtils.isDigitsOnly(((CharSequence) (afile[i].getName()))))
	//*  10   16:aload_0         
	//*  11   17:iload_1         
	//*  12   18:aaload          
	//*  13   19:invokevirtual   #403 <Method boolean File.isFile()>
	//*  14   22:ifeq            59
	//*  15   25:aload_0         
	//*  16   26:iload_1         
	//*  17   27:aaload          
	//*  18   28:invokevirtual   #406 <Method String File.getName()>
	//*  19   31:invokevirtual   #243 <Method int String.length()>
	//*  20   34:bipush          10
	//*  21   36:icmpne          59
	//*  22   39:aload_0         
	//*  23   40:iload_1         
	//*  24   41:aaload          
	//*  25   42:invokevirtual   #406 <Method String File.getName()>
	//*  26   45:invokestatic    #412 <Method boolean TextUtils.isDigitsOnly(CharSequence)>
	//*  27   48:ifeq            59
				arraylist.add(((Object) (afile[i])));
	//   28   51:aload_2         
	//   29   52:aload_0         
	//   30   53:iload_1         
	//   31   54:aaload          
	//   32   55:invokevirtual   #225 <Method boolean ArrayList.add(Object)>
	//   33   58:pop             

	//   34   59:iload_1         
	//   35   60:iconst_1        
	//   36   61:iadd            
	//   37   62:istore_1        
	//*  38   63:goto            10
		return arraylist;
	//   39   66:aload_2         
	//   40   67:areturn         
	}

	protected static BitSet c(byte abyte0[])
	{
		BitSet bitset = new BitSet(abyte0.length << 3);
	//    0    0:new             #415 <Class BitSet>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:arraylength     
	//    4    6:iconst_3        
	//    5    7:ishl            
	//    6    8:invokespecial   #417 <Method void BitSet(int)>
	//    7   11:astore          6
		int i = 0;
	//    8   13:iconst_0        
	//    9   14:istore_1        
		for(int j = 0; j < abyte0.length; j++)
	//*  10   15:iconst_0        
	//*  11   16:istore_2        
	//*  12   17:iload_2         
	//*  13   18:aload_0         
	//*  14   19:arraylength     
	//*  15   20:icmpge          82
		{
			for(int k = 7; k >= 0;)
	//*  16   23:bipush          7
	//*  17   25:istore_3        
	//*  18   26:iload_3         
	//*  19   27:iflt            75
			{
				int l = i + 1;
	//   20   30:iload_1         
	//   21   31:iconst_1        
	//   22   32:iadd            
	//   23   33:istore          4
				boolean flag;
				if((abyte0[j] & 1 << k) >> k == 1)
	//*  24   35:aload_0         
	//*  25   36:iload_2         
	//*  26   37:baload          
	//*  27   38:iconst_1        
	//*  28   39:iload_3         
	//*  29   40:ishl            
	//*  30   41:iand            
	//*  31   42:iload_3         
	//*  32   43:ishr            
	//*  33   44:iconst_1        
	//*  34   45:icmpne          54
					flag = true;
	//   35   48:iconst_1        
	//   36   49:istore          5
				else
	//*  37   51:goto            57
					flag = false;
	//   38   54:iconst_0        
	//   39   55:istore          5
				bitset.set(i, flag);
	//   40   57:aload           6
	//   41   59:iload_1         
	//   42   60:iload           5
	//   43   62:invokevirtual   #421 <Method void BitSet.set(int, boolean)>
				k--;
	//   44   65:iload_3         
	//   45   66:iconst_1        
	//   46   67:isub            
	//   47   68:istore_3        
				i = l;
	//   48   69:iload           4
	//   49   71:istore_1        
			}

		}

	//   50   72:goto            26
	//   51   75:iload_2         
	//   52   76:iconst_1        
	//   53   77:iadd            
	//   54   78:istore_2        
	//*  55   79:goto            17
		return bitset;
	//   56   82:aload           6
	//   57   84:areturn         
	}

	private int d()
	{
		boolean flag;
		boolean flag1;
		flag1 = false;
	//    0    0:iconst_0        
	//    1    1:istore_3        
		flag = false;
	//    2    2:iconst_0        
	//    3    3:istore_2        
		if(Process.myUid() == 1000)
	//*   4    4:invokestatic    #426 <Method int Process.myUid()>
	//*   5    7:sipush          1000
	//*   6   10:icmpne          15
			return 0;
	//    7   13:iconst_0        
	//    8   14:ireturn         
		boolean flag2 = "mounted".equals(((Object) (Environment.getExternalStorageState())));
	//    9   15:ldc2            #428 <String "mounted">
	//   10   18:invokestatic    #431 <Method String Environment.getExternalStorageState()>
	//   11   21:invokevirtual   #185 <Method boolean String.equals(Object)>
	//   12   24:istore          4
		flag1 = flag2;
	//   13   26:iload           4
	//   14   28:istore_3        
_L2:
		byte byte0;
label0:
		{
			if(b())
	//*  15   29:invokestatic    #433 <Method boolean b()>
	//*  16   32:ifeq            41
			{
				byte0 = ((byte) (flag));
	//   17   35:iload_2         
	//   18   36:istore_1        
				if(!flag1)
					break label0;
	//   19   37:iload_3         
	//   20   38:ifeq            182
			}
			Object obj = ((Object) (d(d).getPath()));
	//   21   41:aload_0         
	//   22   42:getfield        #23  <Field Context d>
	//   23   45:invokestatic    #436 <Method File d(Context)>
	//   24   48:invokevirtual   #439 <Method String File.getPath()>
	//   25   51:astore          5
			obj = ((Object) (new File((new StringBuilder()).append(((String) (obj))).append(File.separator).append("carrierdata").toString())));
	//   26   53:new             #400 <Class File>
	//   27   56:dup             
	//   28   57:new             #441 <Class StringBuilder>
	//   29   60:dup             
	//   30   61:invokespecial   #442 <Method void StringBuilder()>
	//   31   64:aload           5
	//   32   66:invokevirtual   #446 <Method StringBuilder StringBuilder.append(String)>
	//   33   69:getstatic       #449 <Field String File.separator>
	//   34   72:invokevirtual   #446 <Method StringBuilder StringBuilder.append(String)>
	//   35   75:ldc2            #451 <String "carrierdata">
	//   36   78:invokevirtual   #446 <Method StringBuilder StringBuilder.append(String)>
	//   37   81:invokevirtual   #454 <Method String StringBuilder.toString()>
	//   38   84:invokespecial   #457 <Method void File(String)>
	//   39   87:astore          5
			byte0 = ((byte) (flag));
	//   40   89:iload_2         
	//   41   90:istore_1        
			if(((File) (obj)).exists())
	//*  42   91:aload           5
	//*  43   93:invokevirtual   #460 <Method boolean File.exists()>
	//*  44   96:ifeq            182
			{
				byte0 = ((byte) (flag));
	//   45   99:iload_2         
	//   46  100:istore_1        
				if(((File) (obj)).isDirectory())
	//*  47  101:aload           5
	//*  48  103:invokevirtual   #463 <Method boolean File.isDirectory()>
	//*  49  106:ifeq            182
				{
					File afile[] = ((File) (obj)).listFiles();
	//   50  109:aload           5
	//   51  111:invokevirtual   #467 <Method File[] File.listFiles()>
	//   52  114:astore          5
					byte0 = ((byte) (flag));
	//   53  116:iload_2         
	//   54  117:istore_1        
					if(afile != null)
	//*  55  118:aload           5
	//*  56  120:ifnull          182
					{
						byte0 = ((byte) (flag));
	//   57  123:iload_2         
	//   58  124:istore_1        
						if(afile.length > 0)
	//*  59  125:aload           5
	//*  60  127:arraylength     
	//*  61  128:ifle            182
						{
							ArrayList arraylist = c(afile);
	//   62  131:aload           5
	//   63  133:invokestatic    #469 <Method ArrayList c(File[])>
	//   64  136:astore          5
							if(arraylist.size() == 1)
	//*  65  138:aload           5
	//*  66  140:invokevirtual   #470 <Method int ArrayList.size()>
	//*  67  143:iconst_1        
	//*  68  144:icmpne          169
								return ((File)arraylist.get(0)).length() > 0L ? 1 : 10;
	//   69  147:aload           5
	//   70  149:iconst_0        
	//   71  150:invokevirtual   #471 <Method Object ArrayList.get(int)>
	//   72  153:checkcast       #400 <Class File>
	//   73  156:invokevirtual   #473 <Method long File.length()>
	//   74  159:lconst_0        
	//   75  160:lcmp            
	//   76  161:ifgt            167
	//   77  164:bipush          10
	//   78  166:ireturn         
	//   79  167:iconst_1        
	//   80  168:ireturn         
							byte0 = ((byte) (flag));
	//   81  169:iload_2         
	//   82  170:istore_1        
							if(arraylist.size() >= 2)
	//*  83  171:aload           5
	//*  84  173:invokevirtual   #470 <Method int ArrayList.size()>
	//*  85  176:iconst_2        
	//*  86  177:icmplt          182
								byte0 = 2;
	//   87  180:iconst_2        
	//   88  181:istore_1        
						}
					}
				}
			}
		}
		return ((int) (byte0));
	//   89  182:iload_1         
	//   90  183:ireturn         
		Exception exception;
		exception;
	//   91  184:astore          5
		if(true) goto _L2; else goto _L1
	//   92  186:goto            29
_L1:
	}

	protected static File d(Context context)
	{
		context = ((Context) ((new StringBuilder("/Android/data/")).append(context.getPackageName()).append("/files/").toString()));
	//    0    0:new             #441 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:ldc2            #475 <String "/Android/data/">
	//    3    7:invokespecial   #476 <Method void StringBuilder(String)>
	//    4   10:aload_0         
	//    5   11:invokevirtual   #481 <Method String Context.getPackageName()>
	//    6   14:invokevirtual   #446 <Method StringBuilder StringBuilder.append(String)>
	//    7   17:ldc2            #483 <String "/files/">
	//    8   20:invokevirtual   #446 <Method StringBuilder StringBuilder.append(String)>
	//    9   23:invokevirtual   #454 <Method String StringBuilder.toString()>
	//   10   26:astore_0        
		return new File((new StringBuilder()).append(Environment.getExternalStorageDirectory().getPath()).append(((String) (context))).toString());
	//   11   27:new             #400 <Class File>
	//   12   30:dup             
	//   13   31:new             #441 <Class StringBuilder>
	//   14   34:dup             
	//   15   35:invokespecial   #442 <Method void StringBuilder()>
	//   16   38:invokestatic    #487 <Method File Environment.getExternalStorageDirectory()>
	//   17   41:invokevirtual   #439 <Method String File.getPath()>
	//   18   44:invokevirtual   #446 <Method StringBuilder StringBuilder.append(String)>
	//   19   47:aload_0         
	//   20   48:invokevirtual   #446 <Method StringBuilder StringBuilder.append(String)>
	//   21   51:invokevirtual   #454 <Method String StringBuilder.toString()>
	//   22   54:invokespecial   #457 <Method void File(String)>
	//   23   57:areturn         
	}

	protected static byte[] d(byte abyte0[], int i)
	{
		if(abyte0 == null || abyte0.length == 0)
	//*   0    0:aload_0         
	//*   1    1:ifnull          9
	//*   2    4:aload_0         
	//*   3    5:arraylength     
	//*   4    6:ifne            11
			return null;
	//    5    9:aconst_null     
	//    6   10:areturn         
		int k = (new String(abyte0)).indexOf('\0');
	//    7   11:new             #75  <Class String>
	//    8   14:dup             
	//    9   15:aload_0         
	//   10   16:invokespecial   #491 <Method void String(byte[])>
	//   11   19:iconst_0        
	//   12   20:invokevirtual   #494 <Method int String.indexOf(int)>
	//   13   23:istore_3        
		int j = 1;
	//   14   24:iconst_1        
	//   15   25:istore_2        
		if(k > 0)
	//*  16   26:iload_3         
	//*  17   27:ifle            46
			if(k + 1 > i)
	//*  18   30:iload_3         
	//*  19   31:iconst_1        
	//*  20   32:iadd            
	//*  21   33:iload_1         
	//*  22   34:icmple          42
				j = i;
	//   23   37:iload_1         
	//   24   38:istore_2        
			else
	//*  25   39:goto            46
				j = k + 1;
	//   26   42:iload_3         
	//   27   43:iconst_1        
	//   28   44:iadd            
	//   29   45:istore_2        
		byte abyte1[] = new byte[j];
	//   30   46:iload_2         
	//   31   47:newarray        byte[]
	//   32   49:astore          4
		System.arraycopy(((Object) (abyte0)), 0, ((Object) (abyte1)), 0, j);
	//   33   51:aload_0         
	//   34   52:iconst_0        
	//   35   53:aload           4
	//   36   55:iconst_0        
	//   37   56:iload_2         
	//   38   57:invokestatic    #91  <Method void System.arraycopy(Object, int, Object, int, int)>
		abyte1[j - 1] = 0;
	//   39   60:aload           4
	//   40   62:iload_2         
	//   41   63:iconst_1        
	//   42   64:isub            
	//   43   65:iconst_0        
	//   44   66:bastore         
		return abyte1;
	//   45   67:aload           4
	//   46   69:areturn         
	}

	private static int e(int i, int j)
	{
		if(i < j)
	//*   0    0:iload_0         
	//*   1    1:iload_1         
	//*   2    2:icmpge          7
			return i;
	//    3    5:iload_0         
	//    4    6:ireturn         
		else
			return j;
	//    5    7:iload_1         
	//    6    8:ireturn         
	}

	private File e()
	{
		boolean flag;
		Object obj1;
		flag = false;
	//    0    0:iconst_0        
	//    1    1:istore_1        
		obj1 = null;
	//    2    2:aconst_null     
	//    3    3:astore          4
		if(Process.myUid() == 1000)
	//*   4    5:invokestatic    #426 <Method int Process.myUid()>
	//*   5    8:sipush          1000
	//*   6   11:icmpne          16
			return null;
	//    7   14:aconst_null     
	//    8   15:areturn         
		boolean flag1 = "mounted".equals(((Object) (Environment.getExternalStorageState())));
	//    9   16:ldc2            #428 <String "mounted">
	//   10   19:invokestatic    #431 <Method String Environment.getExternalStorageState()>
	//   11   22:invokevirtual   #185 <Method boolean String.equals(Object)>
	//   12   25:istore_2        
		flag = flag1;
	//   13   26:iload_2         
	//   14   27:istore_1        
_L2:
		Object obj;
label0:
		{
			if(b())
	//*  15   28:invokestatic    #433 <Method boolean b()>
	//*  16   31:ifeq            41
			{
				obj = ((Object) (obj1));
	//   17   34:aload           4
	//   18   36:astore_3        
				if(!flag)
					break label0;
	//   19   37:iload_1         
	//   20   38:ifeq            234
			}
			obj = ((Object) (d(d).getPath()));
	//   21   41:aload_0         
	//   22   42:getfield        #23  <Field Context d>
	//   23   45:invokestatic    #436 <Method File d(Context)>
	//   24   48:invokevirtual   #439 <Method String File.getPath()>
	//   25   51:astore_3        
			File file1 = new File((new StringBuilder()).append(((String) (obj))).append(File.separator).append("carrierdata").toString());
	//   26   52:new             #400 <Class File>
	//   27   55:dup             
	//   28   56:new             #441 <Class StringBuilder>
	//   29   59:dup             
	//   30   60:invokespecial   #442 <Method void StringBuilder()>
	//   31   63:aload_3         
	//   32   64:invokevirtual   #446 <Method StringBuilder StringBuilder.append(String)>
	//   33   67:getstatic       #449 <Field String File.separator>
	//   34   70:invokevirtual   #446 <Method StringBuilder StringBuilder.append(String)>
	//   35   73:ldc2            #451 <String "carrierdata">
	//   36   76:invokevirtual   #446 <Method StringBuilder StringBuilder.append(String)>
	//   37   79:invokevirtual   #454 <Method String StringBuilder.toString()>
	//   38   82:invokespecial   #457 <Method void File(String)>
	//   39   85:astore          5
			obj = ((Object) (obj1));
	//   40   87:aload           4
	//   41   89:astore_3        
			if(file1.exists())
	//*  42   90:aload           5
	//*  43   92:invokevirtual   #460 <Method boolean File.exists()>
	//*  44   95:ifeq            234
			{
				obj = ((Object) (obj1));
	//   45   98:aload           4
	//   46  100:astore_3        
				if(file1.isDirectory())
	//*  47  101:aload           5
	//*  48  103:invokevirtual   #463 <Method boolean File.isDirectory()>
	//*  49  106:ifeq            234
				{
					File afile[] = file1.listFiles();
	//   50  109:aload           5
	//   51  111:invokevirtual   #467 <Method File[] File.listFiles()>
	//   52  114:astore          5
					obj = ((Object) (obj1));
	//   53  116:aload           4
	//   54  118:astore_3        
					if(afile != null)
	//*  55  119:aload           5
	//*  56  121:ifnull          234
					{
						obj = ((Object) (obj1));
	//   57  124:aload           4
	//   58  126:astore_3        
						if(afile.length > 0)
	//*  59  127:aload           5
	//*  60  129:arraylength     
	//*  61  130:ifle            234
						{
							ArrayList arraylist = c(afile);
	//   62  133:aload           5
	//   63  135:invokestatic    #469 <Method ArrayList c(File[])>
	//   64  138:astore          5
							if(arraylist.size() == 1)
	//*  65  140:aload           5
	//*  66  142:invokevirtual   #470 <Method int ArrayList.size()>
	//*  67  145:iconst_1        
	//*  68  146:icmpne          183
							{
								obj = ((Object) (obj1));
	//   69  149:aload           4
	//   70  151:astore_3        
								if(((File)arraylist.get(0)).length() < (long)e)
	//*  71  152:aload           5
	//*  72  154:iconst_0        
	//*  73  155:invokevirtual   #471 <Method Object ArrayList.get(int)>
	//*  74  158:checkcast       #400 <Class File>
	//*  75  161:invokevirtual   #473 <Method long File.length()>
	//*  76  164:aload_0         
	//*  77  165:getfield        #21  <Field int e>
	//*  78  168:i2l             
	//*  79  169:lcmp            
	//*  80  170:ifge            234
									return (File)arraylist.get(0);
	//   81  173:aload           5
	//   82  175:iconst_0        
	//   83  176:invokevirtual   #471 <Method Object ArrayList.get(int)>
	//   84  179:checkcast       #400 <Class File>
	//   85  182:areturn         
							} else
							{
								obj = ((Object) (obj1));
	//   86  183:aload           4
	//   87  185:astore_3        
								if(arraylist.size() >= 2)
	//*  88  186:aload           5
	//*  89  188:invokevirtual   #470 <Method int ArrayList.size()>
	//*  90  191:iconst_2        
	//*  91  192:icmplt          234
								{
									File file = (File)arraylist.get(0);
	//   92  195:aload           5
	//   93  197:iconst_0        
	//   94  198:invokevirtual   #471 <Method Object ArrayList.get(int)>
	//   95  201:checkcast       #400 <Class File>
	//   96  204:astore          4
									obj = ((Object) ((File)arraylist.get(1)));
	//   97  206:aload           5
	//   98  208:iconst_1        
	//   99  209:invokevirtual   #471 <Method Object ArrayList.get(int)>
	//  100  212:checkcast       #400 <Class File>
	//  101  215:astore_3        
									if(file.getName().compareTo(((File) (obj)).getName()) > 0)
	//* 102  216:aload           4
	//* 103  218:invokevirtual   #406 <Method String File.getName()>
	//* 104  221:aload_3         
	//* 105  222:invokevirtual   #406 <Method String File.getName()>
	//* 106  225:invokevirtual   #498 <Method int String.compareTo(String)>
	//* 107  228:ifle            234
										return file;
	//  108  231:aload           4
	//  109  233:areturn         
								}
							}
						}
					}
				}
			}
		}
		return ((File) (obj));
	//  110  234:aload_3         
	//  111  235:areturn         
		Exception exception;
		exception;
	//  112  236:astore_3        
		if(true) goto _L2; else goto _L1
_L1:
	//* 113  237:goto            28
	}

	private File e(long l)
	{
		boolean flag;
		boolean flag3;
		Object obj;
		flag = false;
	//    0    0:iconst_0        
	//    1    1:istore_3        
		obj = null;
	//    2    2:aconst_null     
	//    3    3:astore          6
		flag3 = false;
	//    4    5:iconst_0        
	//    5    6:istore          5
		if(Process.myUid() == 1000)
	//*   6    8:invokestatic    #426 <Method int Process.myUid()>
	//*   7   11:sipush          1000
	//*   8   14:icmpne          19
			return null;
	//    9   17:aconst_null     
	//   10   18:areturn         
		boolean flag1 = "mounted".equals(((Object) (Environment.getExternalStorageState())));
	//   11   19:ldc2            #428 <String "mounted">
	//   12   22:invokestatic    #431 <Method String Environment.getExternalStorageState()>
	//   13   25:invokevirtual   #185 <Method boolean String.equals(Object)>
	//   14   28:istore          4
		flag = flag1;
	//   15   30:iload           4
	//   16   32:istore_3        
_L1:
label0:
		{
			boolean flag2;
			if(b())
	//*  17   33:invokestatic    #433 <Method boolean b()>
	//*  18   36:ifeq            47
			{
				flag2 = flag3;
	//   19   39:iload           5
	//   20   41:istore          4
				if(!flag)
					break label0;
	//   21   43:iload_3         
	//   22   44:ifeq            202
			}
			obj = ((Object) (new StatFs(Environment.getExternalStorageDirectory().getPath())));
	//   23   47:new             #503 <Class StatFs>
	//   24   50:dup             
	//   25   51:invokestatic    #487 <Method File Environment.getExternalStorageDirectory()>
	//   26   54:invokevirtual   #439 <Method String File.getPath()>
	//   27   57:invokespecial   #504 <Method void StatFs(String)>
	//   28   60:astore          6
			if((long)((StatFs) (obj)).getAvailableBlocks() * (long)((StatFs) (obj)).getBlockSize() <= (long)(b / 2))
	//*  29   62:aload           6
	//*  30   64:invokevirtual   #507 <Method int StatFs.getAvailableBlocks()>
	//*  31   67:i2l             
	//*  32   68:aload           6
	//*  33   70:invokevirtual   #510 <Method int StatFs.getBlockSize()>
	//*  34   73:i2l             
	//*  35   74:lmul            
	//*  36   75:aload_0         
	//*  37   76:getfield        #19  <Field int b>
	//*  38   79:iconst_2        
	//*  39   80:idiv            
	//*  40   81:i2l             
	//*  41   82:lcmp            
	//*  42   83:ifgt            88
				return null;
	//   43   86:aconst_null     
	//   44   87:areturn         
			obj = ((Object) (d(d).getPath()));
	//   45   88:aload_0         
	//   46   89:getfield        #23  <Field Context d>
	//   47   92:invokestatic    #436 <Method File d(Context)>
	//   48   95:invokevirtual   #439 <Method String File.getPath()>
	//   49   98:astore          6
			obj = ((Object) (new File((new StringBuilder()).append(((String) (obj))).append(File.separator).append("carrierdata").toString())));
	//   50  100:new             #400 <Class File>
	//   51  103:dup             
	//   52  104:new             #441 <Class StringBuilder>
	//   53  107:dup             
	//   54  108:invokespecial   #442 <Method void StringBuilder()>
	//   55  111:aload           6
	//   56  113:invokevirtual   #446 <Method StringBuilder StringBuilder.append(String)>
	//   57  116:getstatic       #449 <Field String File.separator>
	//   58  119:invokevirtual   #446 <Method StringBuilder StringBuilder.append(String)>
	//   59  122:ldc2            #451 <String "carrierdata">
	//   60  125:invokevirtual   #446 <Method StringBuilder StringBuilder.append(String)>
	//   61  128:invokevirtual   #454 <Method String StringBuilder.toString()>
	//   62  131:invokespecial   #457 <Method void File(String)>
	//   63  134:astore          6
			if(!((File) (obj)).exists() || !((File) (obj)).isDirectory())
	//*  64  136:aload           6
	//*  65  138:invokevirtual   #460 <Method boolean File.exists()>
	//*  66  141:ifeq            152
	//*  67  144:aload           6
	//*  68  146:invokevirtual   #463 <Method boolean File.isDirectory()>
	//*  69  149:ifne            158
				((File) (obj)).mkdirs();
	//   70  152:aload           6
	//   71  154:invokevirtual   #513 <Method boolean File.mkdirs()>
	//   72  157:pop             
			obj = ((Object) (new File((new StringBuilder()).append(((File) (obj)).getPath()).append(File.separator).append(l).toString())));
	//   73  158:new             #400 <Class File>
	//   74  161:dup             
	//   75  162:new             #441 <Class StringBuilder>
	//   76  165:dup             
	//   77  166:invokespecial   #442 <Method void StringBuilder()>
	//   78  169:aload           6
	//   79  171:invokevirtual   #439 <Method String File.getPath()>
	//   80  174:invokevirtual   #446 <Method StringBuilder StringBuilder.append(String)>
	//   81  177:getstatic       #449 <Field String File.separator>
	//   82  180:invokevirtual   #446 <Method StringBuilder StringBuilder.append(String)>
	//   83  183:lload_1         
	//   84  184:invokevirtual   #516 <Method StringBuilder StringBuilder.append(long)>
	//   85  187:invokevirtual   #454 <Method String StringBuilder.toString()>
	//   86  190:invokespecial   #457 <Method void File(String)>
	//   87  193:astore          6
			Exception exception;
			try
			{
				flag2 = ((File) (obj)).createNewFile();
	//   88  195:aload           6
	//   89  197:invokevirtual   #519 <Method boolean File.createNewFile()>
	//   90  200:istore          4
			}
	//*  91  202:iload           4
	//*  92  204:ifeq            210
	//*  93  207:aload           6
	//*  94  209:areturn         
	//*  95  210:aconst_null     
	//*  96  211:areturn         
	//*  97  212:astore          7
	//*  98  214:goto            33
			catch(IOException ioexception)
	//*  99  217:astore          7
			{
				flag2 = flag3;
	//  100  219:iload           5
	//  101  221:istore          4
			}
		}
		if(flag2)
			return ((File) (obj));
		else
			return null;
		exception;
		  goto _L1
	//* 102  223:goto            202
	}

	protected static byte[] e(BitSet bitset)
	{
		byte abyte0[] = new byte[bitset.size() / 8];
	//    0    0:aload_0         
	//    1    1:invokevirtual   #521 <Method int BitSet.size()>
	//    2    4:bipush          8
	//    3    6:idiv            
	//    4    7:newarray        byte[]
	//    5    9:astore          5
		for(int i = 0; i < bitset.size(); i++)
	//*   6   11:iconst_0        
	//*   7   12:istore_1        
	//*   8   13:iload_1         
	//*   9   14:aload_0         
	//*  10   15:invokevirtual   #521 <Method int BitSet.size()>
	//*  11   18:icmpge          71
		{
			int k = i / 8;
	//   12   21:iload_1         
	//   13   22:bipush          8
	//   14   24:idiv            
	//   15   25:istore_3        
			byte byte0 = abyte0[k];
	//   16   26:aload           5
	//   17   28:iload_3         
	//   18   29:baload          
	//   19   30:istore          4
			int j;
			if(bitset.get(i))
	//*  20   32:aload_0         
	//*  21   33:iload_1         
	//*  22   34:invokevirtual   #524 <Method boolean BitSet.get(int)>
	//*  23   37:ifeq            45
				j = 1;
	//   24   40:iconst_1        
	//   25   41:istore_2        
			else
	//*  26   42:goto            47
				j = 0;
	//   27   45:iconst_0        
	//   28   46:istore_2        
			abyte0[k] = (byte)(byte0 | j << 7 - i % 8);
	//   29   47:aload           5
	//   30   49:iload_3         
	//   31   50:iload           4
	//   32   52:iload_2         
	//   33   53:bipush          7
	//   34   55:iload_1         
	//   35   56:bipush          8
	//   36   58:irem            
	//   37   59:isub            
	//   38   60:ishl            
	//   39   61:ior             
	//   40   62:int2byte        
	//   41   63:bastore         
		}

	//   42   64:iload_1         
	//   43   65:iconst_1        
	//   44   66:iadd            
	//   45   67:istore_1        
	//*  46   68:goto            13
		return abyte0;
	//   47   71:aload           5
	//   48   73:areturn         
	}

	protected static byte[] e(byte abyte0[])
	{
		Object obj = null;
	//    0    0:aconst_null     
	//    1    1:astore_2        
		byte abyte1[] = ((byte []) (obj));
	//    2    2:aload_2         
	//    3    3:astore_1        
		ByteArrayOutputStream bytearrayoutputstream;
		GZIPOutputStream gzipoutputstream;
		try
		{
			bytearrayoutputstream = new ByteArrayOutputStream();
	//    4    4:new             #527 <Class ByteArrayOutputStream>
	//    5    7:dup             
	//    6    8:invokespecial   #528 <Method void ByteArrayOutputStream()>
	//    7   11:astore_3        
		}
	//*   8   12:aload_2         
	//*   9   13:astore_1        
	//*  10   14:new             #530 <Class GZIPOutputStream>
	//*  11   17:dup             
	//*  12   18:aload_3         
	//*  13   19:invokespecial   #533 <Method void GZIPOutputStream(java.io.OutputStream)>
	//*  14   22:astore          4
	//*  15   24:aload_2         
	//*  16   25:astore_1        
	//*  17   26:aload           4
	//*  18   28:aload_0         
	//*  19   29:invokevirtual   #536 <Method void GZIPOutputStream.write(byte[])>
	//*  20   32:aload_2         
	//*  21   33:astore_1        
	//*  22   34:aload           4
	//*  23   36:invokevirtual   #539 <Method void GZIPOutputStream.finish()>
	//*  24   39:aload_2         
	//*  25   40:astore_1        
	//*  26   41:aload           4
	//*  27   43:invokevirtual   #542 <Method void GZIPOutputStream.close()>
	//*  28   46:aload_2         
	//*  29   47:astore_1        
	//*  30   48:aload_3         
	//*  31   49:invokevirtual   #545 <Method byte[] ByteArrayOutputStream.toByteArray()>
	//*  32   52:astore_0        
	//*  33   53:aload_0         
	//*  34   54:astore_1        
	//*  35   55:aload_3         
	//*  36   56:invokevirtual   #546 <Method void ByteArrayOutputStream.close()>
	//*  37   59:aload_0         
	//*  38   60:areturn         
		// Misplaced declaration of an exception variable
		catch(byte abyte0[])
	//*  39   61:astore_0        
		{
			return abyte1;
	//   40   62:aload_1         
	//   41   63:areturn         
		}
		abyte1 = ((byte []) (obj));
		gzipoutputstream = new GZIPOutputStream(((java.io.OutputStream) (bytearrayoutputstream)));
		abyte1 = ((byte []) (obj));
		gzipoutputstream.write(abyte0);
		abyte1 = ((byte []) (obj));
		gzipoutputstream.finish();
		abyte1 = ((byte []) (obj));
		gzipoutputstream.close();
		abyte1 = ((byte []) (obj));
		abyte0 = bytearrayoutputstream.toByteArray();
		abyte1 = abyte0;
		bytearrayoutputstream.close();
		return abyte0;
	}

	private File f()
	{
		boolean flag;
		Object obj1;
		flag = false;
	//    0    0:iconst_0        
	//    1    1:istore_1        
		obj1 = null;
	//    2    2:aconst_null     
	//    3    3:astore          4
		if(Process.myUid() == 1000)
	//*   4    5:invokestatic    #426 <Method int Process.myUid()>
	//*   5    8:sipush          1000
	//*   6   11:icmpne          16
			return null;
	//    7   14:aconst_null     
	//    8   15:areturn         
		boolean flag1 = "mounted".equals(((Object) (Environment.getExternalStorageState())));
	//    9   16:ldc2            #428 <String "mounted">
	//   10   19:invokestatic    #431 <Method String Environment.getExternalStorageState()>
	//   11   22:invokevirtual   #185 <Method boolean String.equals(Object)>
	//   12   25:istore_2        
		flag = flag1;
	//   13   26:iload_2         
	//   14   27:istore_1        
_L2:
		Object obj;
label0:
		{
			if(b())
	//*  15   28:invokestatic    #433 <Method boolean b()>
	//*  16   31:ifeq            41
			{
				obj = ((Object) (obj1));
	//   17   34:aload           4
	//   18   36:astore_3        
				if(!flag)
					break label0;
	//   19   37:iload_1         
	//   20   38:ifeq            208
			}
			File file1 = d(d);
	//   21   41:aload_0         
	//   22   42:getfield        #23  <Field Context d>
	//   23   45:invokestatic    #436 <Method File d(Context)>
	//   24   48:astore          5
			obj = ((Object) (obj1));
	//   25   50:aload           4
	//   26   52:astore_3        
			if(file1 != null)
	//*  27   53:aload           5
	//*  28   55:ifnull          208
			{
				obj = ((Object) (file1.getPath()));
	//   29   58:aload           5
	//   30   60:invokevirtual   #439 <Method String File.getPath()>
	//   31   63:astore_3        
				file1 = new File((new StringBuilder()).append(((String) (obj))).append(File.separator).append("carrierdata").toString());
	//   32   64:new             #400 <Class File>
	//   33   67:dup             
	//   34   68:new             #441 <Class StringBuilder>
	//   35   71:dup             
	//   36   72:invokespecial   #442 <Method void StringBuilder()>
	//   37   75:aload_3         
	//   38   76:invokevirtual   #446 <Method StringBuilder StringBuilder.append(String)>
	//   39   79:getstatic       #449 <Field String File.separator>
	//   40   82:invokevirtual   #446 <Method StringBuilder StringBuilder.append(String)>
	//   41   85:ldc2            #451 <String "carrierdata">
	//   42   88:invokevirtual   #446 <Method StringBuilder StringBuilder.append(String)>
	//   43   91:invokevirtual   #454 <Method String StringBuilder.toString()>
	//   44   94:invokespecial   #457 <Method void File(String)>
	//   45   97:astore          5
				obj = ((Object) (obj1));
	//   46   99:aload           4
	//   47  101:astore_3        
				if(file1.exists())
	//*  48  102:aload           5
	//*  49  104:invokevirtual   #460 <Method boolean File.exists()>
	//*  50  107:ifeq            208
				{
					obj = ((Object) (obj1));
	//   51  110:aload           4
	//   52  112:astore_3        
					if(file1.isDirectory())
	//*  53  113:aload           5
	//*  54  115:invokevirtual   #463 <Method boolean File.isDirectory()>
	//*  55  118:ifeq            208
					{
						File afile[] = file1.listFiles();
	//   56  121:aload           5
	//   57  123:invokevirtual   #467 <Method File[] File.listFiles()>
	//   58  126:astore          5
						obj = ((Object) (obj1));
	//   59  128:aload           4
	//   60  130:astore_3        
						if(afile != null)
	//*  61  131:aload           5
	//*  62  133:ifnull          208
						{
							obj = ((Object) (obj1));
	//   63  136:aload           4
	//   64  138:astore_3        
							if(afile.length > 0)
	//*  65  139:aload           5
	//*  66  141:arraylength     
	//*  67  142:ifle            208
							{
								Object obj2 = ((Object) (c(afile)));
	//   68  145:aload           5
	//   69  147:invokestatic    #469 <Method ArrayList c(File[])>
	//   70  150:astore          5
								obj = ((Object) (obj1));
	//   71  152:aload           4
	//   72  154:astore_3        
								if(((ArrayList) (obj2)).size() >= 2)
	//*  73  155:aload           5
	//*  74  157:invokevirtual   #470 <Method int ArrayList.size()>
	//*  75  160:iconst_2        
	//*  76  161:icmplt          208
								{
									File file = (File)((ArrayList) (obj2)).get(0);
	//   77  164:aload           5
	//   78  166:iconst_0        
	//   79  167:invokevirtual   #471 <Method Object ArrayList.get(int)>
	//   80  170:checkcast       #400 <Class File>
	//   81  173:astore          4
									obj2 = ((Object) ((File)((ArrayList) (obj2)).get(1)));
	//   82  175:aload           5
	//   83  177:iconst_1        
	//   84  178:invokevirtual   #471 <Method Object ArrayList.get(int)>
	//   85  181:checkcast       #400 <Class File>
	//   86  184:astore          5
									obj = ((Object) (file));
	//   87  186:aload           4
	//   88  188:astore_3        
									if(file.getName().compareTo(((File) (obj2)).getName()) > 0)
	//*  89  189:aload           4
	//*  90  191:invokevirtual   #406 <Method String File.getName()>
	//*  91  194:aload           5
	//*  92  196:invokevirtual   #406 <Method String File.getName()>
	//*  93  199:invokevirtual   #498 <Method int String.compareTo(String)>
	//*  94  202:ifle            208
										obj = obj2;
	//   95  205:aload           5
	//   96  207:astore_3        
								}
							}
						}
					}
				}
			}
		}
		return ((File) (obj));
	//   97  208:aload_3         
	//   98  209:areturn         
		Exception exception;
		exception;
	//   99  210:astore_3        
		if(true) goto _L2; else goto _L1
_L1:
	//* 100  211:goto            28
	}

	protected int a()
	{
		return c;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field int c>
	//    2    4:ireturn         
	}

	protected void b(int i)
	{
		c = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #17  <Field int c>
		b = (c << 3) * 1500 + c + 4;
	//    3    5:aload_0         
	//    4    6:aload_0         
	//    5    7:getfield        #17  <Field int c>
	//    6   10:iconst_3        
	//    7   11:ishl            
	//    8   12:sipush          1500
	//    9   15:imul            
	//   10   16:aload_0         
	//   11   17:getfield        #17  <Field int c>
	//   12   20:iadd            
	//   13   21:iconst_4        
	//   14   22:iadd            
	//   15   23:putfield        #19  <Field int b>
		if(c == 256 || c == 768)
	//*  16   26:aload_0         
	//*  17   27:getfield        #17  <Field int c>
	//*  18   30:sipush          256
	//*  19   33:icmpeq          46
	//*  20   36:aload_0         
	//*  21   37:getfield        #17  <Field int c>
	//*  22   40:sipush          768
	//*  23   43:icmpne          58
		{
			e = b / 100;
	//   24   46:aload_0         
	//   25   47:aload_0         
	//   26   48:getfield        #19  <Field int b>
	//   27   51:bipush          100
	//   28   53:idiv            
	//   29   54:putfield        #21  <Field int e>
			return;
	//   30   57:return          
		}
		if(c == 8736)
	//*  31   58:aload_0         
	//*  32   59:getfield        #17  <Field int c>
	//*  33   62:sipush          8736
	//*  34   65:icmpne          80
			e = b - 5000;
	//   35   68:aload_0         
	//   36   69:aload_0         
	//   37   70:getfield        #19  <Field int b>
	//   38   73:sipush          5000
	//   39   76:isub            
	//   40   77:putfield        #21  <Field int e>
	//   41   80:return          
	}

	protected boolean b(long l)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		int i = d();
	//    2    2:aload_0         
	//    3    3:invokespecial   #549 <Method int d()>
	//    4    6:istore_3        
		if(i != 0)
			break MISSING_BLOCK_LABEL_15;
	//    5    7:iload_3         
	//    6    8:ifne            15
		this;
	//    7   11:aload_0         
		JVM INSTR monitorexit ;
	//    8   12:monitorexit     
		return false;
	//    9   13:iconst_0        
	//   10   14:ireturn         
		if(i != 1)
			break MISSING_BLOCK_LABEL_40;
	//   11   15:iload_3         
	//   12   16:iconst_1        
	//   13   17:icmpne          40
		File file = e(l);
	//   14   20:aload_0         
	//   15   21:lload_1         
	//   16   22:invokespecial   #551 <Method File e(long)>
	//   17   25:astore          4
		if(file == null)
	//*  18   27:aload           4
	//*  19   29:ifnonnull       36
	//*  20   32:aload_0         
	//*  21   33:monitorexit     
			return false;
	//   22   34:iconst_0        
	//   23   35:ireturn         
		this;
	//   24   36:aload_0         
		JVM INSTR monitorexit ;
	//   25   37:monitorexit     
		return true;
	//   26   38:iconst_1        
	//   27   39:ireturn         
		if(i == 2)
	//*  28   40:iload_3         
	//*  29   41:iconst_2        
	//*  30   42:icmpne          49
	//*  31   45:aload_0         
	//*  32   46:monitorexit     
			return true;
	//   33   47:iconst_1        
	//   34   48:ireturn         
	//*  35   49:aload_0         
		return false;
	//   36   50:monitorexit     
	//   37   51:iconst_0        
	//   38   52:ireturn         
		Exception exception;
		exception;
	//   39   53:astore          4
	//*  40   55:aload_0         
		throw exception;
	//   41   56:monitorexit     
	//   42   57:aload           4
	//   43   59:athrow          
	}

	protected File c()
	{
		return f();
	//    0    0:aload_0         
	//    1    1:invokespecial   #553 <Method File f()>
	//    2    4:areturn         
	}

	protected File d(long l)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		File file1 = e();
	//    2    2:aload_0         
	//    3    3:invokespecial   #555 <Method File e()>
	//    4    6:astore          4
		File file;
		file = file1;
	//    5    8:aload           4
	//    6   10:astore_3        
		if(file1 != null)
			break MISSING_BLOCK_LABEL_22;
	//    7   11:aload           4
	//    8   13:ifnonnull       22
		file = e(l);
	//    9   16:aload_0         
	//   10   17:lload_1         
	//   11   18:invokespecial   #551 <Method File e(long)>
	//   12   21:astore_3        
		this;
	//   13   22:aload_0         
		JVM INSTR monitorexit ;
	//   14   23:monitorexit     
		return file;
	//   15   24:aload_3         
	//   16   25:areturn         
		Exception exception;
		exception;
	//   17   26:astore_3        
	//*  18   27:aload_0         
		throw exception;
	//   19   28:monitorexit     
	//   20   29:aload_3         
	//   21   30:athrow          
	}

	private int b;
	private int c;
	private Context d;
	private int e;
}
