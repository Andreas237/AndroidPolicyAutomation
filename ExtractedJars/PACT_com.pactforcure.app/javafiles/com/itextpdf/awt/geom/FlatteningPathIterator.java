// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.awt.geom;

import com.itextpdf.awt.geom.misc.Messages;
import java.util.NoSuchElementException;

// Referenced classes of package com.itextpdf.awt.geom:
//			PathIterator, QuadCurve2D, CubicCurve2D

public class FlatteningPathIterator
	implements PathIterator
{

	public FlatteningPathIterator(PathIterator pathiterator, double d)
	{
		this(pathiterator, d, 16);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:dload_2         
	//    3    3:bipush          16
	//    4    5:invokespecial   #33  <Method void FlatteningPathIterator(PathIterator, double, int)>
	//    5    8:return          
	}

	public FlatteningPathIterator(PathIterator pathiterator, double d, int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #37  <Method void Object()>
		bufEmpty = true;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #39  <Field boolean bufEmpty>
		coords = new double[6];
	//    5    9:aload_0         
	//    6   10:bipush          6
	//    7   12:newarray        double[]
	//    8   14:putfield        #41  <Field double[] coords>
		if(d < 0.0D)
	//*   9   17:dload_2         
	//*  10   18:dconst_0        
	//*  11   19:dcmpg           
	//*  12   20:ifge            36
			throw new IllegalArgumentException(Messages.getString("awt.206"));
	//   13   23:new             #43  <Class IllegalArgumentException>
	//   14   26:dup             
	//   15   27:ldc1            #45  <String "awt.206">
	//   16   29:invokestatic    #51  <Method String Messages.getString(String)>
	//   17   32:invokespecial   #54  <Method void IllegalArgumentException(String)>
	//   18   35:athrow          
		if(i < 0)
	//*  19   36:iload           4
	//*  20   38:ifge            54
			throw new IllegalArgumentException(Messages.getString("awt.207"));
	//   21   41:new             #43  <Class IllegalArgumentException>
	//   22   44:dup             
	//   23   45:ldc1            #56  <String "awt.207">
	//   24   47:invokestatic    #51  <Method String Messages.getString(String)>
	//   25   50:invokespecial   #54  <Method void IllegalArgumentException(String)>
	//   26   53:athrow          
		if(pathiterator == null)
	//*  27   54:aload_1         
	//*  28   55:ifnonnull       71
		{
			throw new NullPointerException(Messages.getString("awt.208"));
	//   29   58:new             #58  <Class NullPointerException>
	//   30   61:dup             
	//   31   62:ldc1            #60  <String "awt.208">
	//   32   64:invokestatic    #51  <Method String Messages.getString(String)>
	//   33   67:invokespecial   #61  <Method void NullPointerException(String)>
	//   34   70:athrow          
		} else
		{
			p = pathiterator;
	//   35   71:aload_0         
	//   36   72:aload_1         
	//   37   73:putfield        #63  <Field PathIterator p>
			flatness = d;
	//   38   76:aload_0         
	//   39   77:dload_2         
	//   40   78:putfield        #65  <Field double flatness>
			flatness2 = d * d;
	//   41   81:aload_0         
	//   42   82:dload_2         
	//   43   83:dload_2         
	//   44   84:dmul            
	//   45   85:putfield        #67  <Field double flatness2>
			bufLimit = i;
	//   46   88:aload_0         
	//   47   89:iload           4
	//   48   91:putfield        #69  <Field int bufLimit>
			bufSize = Math.min(bufLimit, 16);
	//   49   94:aload_0         
	//   50   95:aload_0         
	//   51   96:getfield        #69  <Field int bufLimit>
	//   52   99:bipush          16
	//   53  101:invokestatic    #75  <Method int Math.min(int, int)>
	//   54  104:putfield        #77  <Field int bufSize>
			buf = new double[bufSize];
	//   55  107:aload_0         
	//   56  108:aload_0         
	//   57  109:getfield        #77  <Field int bufSize>
	//   58  112:newarray        double[]
	//   59  114:putfield        #79  <Field double[] buf>
			bufIndex = bufSize;
	//   60  117:aload_0         
	//   61  118:aload_0         
	//   62  119:getfield        #77  <Field int bufSize>
	//   63  122:putfield        #81  <Field int bufIndex>
			return;
	//   64  125:return          
		}
	}

	public int currentSegment(double ad[])
	{
		if(isDone())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #87  <Method boolean isDone()>
	//*   2    4:ifeq            20
			throw new NoSuchElementException(Messages.getString("awt.4B"));
	//    3    7:new             #89  <Class NoSuchElementException>
	//    4   10:dup             
	//    5   11:ldc1            #91  <String "awt.4B">
	//    6   13:invokestatic    #51  <Method String Messages.getString(String)>
	//    7   16:invokespecial   #92  <Method void NoSuchElementException(String)>
	//    8   19:athrow          
		evaluate();
	//    9   20:aload_0         
	//   10   21:invokevirtual   #95  <Method void evaluate()>
		int j = bufType;
	//   11   24:aload_0         
	//   12   25:getfield        #97  <Field int bufType>
	//   13   28:istore_3        
		int i = j;
	//   14   29:iload_3         
	//   15   30:istore_2        
		if(j != 4)
	//*  16   31:iload_3         
	//*  17   32:iconst_4        
	//*  18   33:icmpeq          58
		{
			ad[0] = px;
	//   19   36:aload_1         
	//   20   37:iconst_0        
	//   21   38:aload_0         
	//   22   39:getfield        #99  <Field double px>
	//   23   42:dastore         
			ad[1] = py;
	//   24   43:aload_1         
	//   25   44:iconst_1        
	//   26   45:aload_0         
	//   27   46:getfield        #101 <Field double py>
	//   28   49:dastore         
			i = j;
	//   29   50:iload_3         
	//   30   51:istore_2        
			if(j != 0)
	//*  31   52:iload_3         
	//*  32   53:ifeq            58
				i = 1;
	//   33   56:iconst_1        
	//   34   57:istore_2        
		}
		return i;
	//   35   58:iload_2         
	//   36   59:ireturn         
	}

	public int currentSegment(float af[])
	{
		if(isDone())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #87  <Method boolean isDone()>
	//*   2    4:ifeq            20
			throw new NoSuchElementException(Messages.getString("awt.4Bx"));
	//    3    7:new             #89  <Class NoSuchElementException>
	//    4   10:dup             
	//    5   11:ldc1            #104 <String "awt.4Bx">
	//    6   13:invokestatic    #51  <Method String Messages.getString(String)>
	//    7   16:invokespecial   #92  <Method void NoSuchElementException(String)>
	//    8   19:athrow          
		evaluate();
	//    9   20:aload_0         
	//   10   21:invokevirtual   #95  <Method void evaluate()>
		int j = bufType;
	//   11   24:aload_0         
	//   12   25:getfield        #97  <Field int bufType>
	//   13   28:istore_3        
		int i = j;
	//   14   29:iload_3         
	//   15   30:istore_2        
		if(j != 4)
	//*  16   31:iload_3         
	//*  17   32:iconst_4        
	//*  18   33:icmpeq          60
		{
			af[0] = (float)px;
	//   19   36:aload_1         
	//   20   37:iconst_0        
	//   21   38:aload_0         
	//   22   39:getfield        #99  <Field double px>
	//   23   42:d2f             
	//   24   43:fastore         
			af[1] = (float)py;
	//   25   44:aload_1         
	//   26   45:iconst_1        
	//   27   46:aload_0         
	//   28   47:getfield        #101 <Field double py>
	//   29   50:d2f             
	//   30   51:fastore         
			i = j;
	//   31   52:iload_3         
	//   32   53:istore_2        
			if(j != 0)
	//*  33   54:iload_3         
	//*  34   55:ifeq            60
				i = 1;
	//   35   58:iconst_1        
	//   36   59:istore_2        
		}
		return i;
	//   37   60:iload_2         
	//   38   61:ireturn         
	}

	void evaluate()
	{
		boolean flag;
		flag = false;
	//    0    0:iconst_0        
	//    1    1:istore_1        
		if(bufEmpty)
	//*   2    2:aload_0         
	//*   3    3:getfield        #39  <Field boolean bufEmpty>
	//*   4    6:ifeq            26
			bufType = p.currentSegment(coords);
	//    5    9:aload_0         
	//    6   10:aload_0         
	//    7   11:getfield        #63  <Field PathIterator p>
	//    8   14:aload_0         
	//    9   15:getfield        #41  <Field double[] coords>
	//   10   18:invokeinterface #106 <Method int PathIterator.currentSegment(double[])>
	//   11   23:putfield        #97  <Field int bufType>
		bufType;
	//   12   26:aload_0         
	//   13   27:getfield        #97  <Field int bufType>
		JVM INSTR tableswitch 0 3: default 60
	//	               0 61
	//	               1 61
	//	               2 82
	//	               3 393;
	//   14   30:tableswitch     0 3: default 60
	//	               0 61
	//	               1 61
	//	               2 82
	//	               3 393
		   goto _L1 _L2 _L2 _L3 _L4
_L1:
		return;
	//   15   60:return          
_L2:
		px = coords[0];
	//   16   61:aload_0         
	//   17   62:aload_0         
	//   18   63:getfield        #41  <Field double[] coords>
	//   19   66:iconst_0        
	//   20   67:daload          
	//   21   68:putfield        #99  <Field double px>
		py = coords[1];
	//   22   71:aload_0         
	//   23   72:aload_0         
	//   24   73:getfield        #41  <Field double[] coords>
	//   25   76:iconst_1        
	//   26   77:daload          
	//   27   78:putfield        #101 <Field double py>
		return;
	//   28   81:return          
_L3:
		if(bufEmpty)
	//*  29   82:aload_0         
	//*  30   83:getfield        #39  <Field boolean bufEmpty>
	//*  31   86:ifeq            154
		{
			bufIndex = bufIndex - 6;
	//   32   89:aload_0         
	//   33   90:aload_0         
	//   34   91:getfield        #81  <Field int bufIndex>
	//   35   94:bipush          6
	//   36   96:isub            
	//   37   97:putfield        #81  <Field int bufIndex>
			buf[bufIndex + 0] = px;
	//   38  100:aload_0         
	//   39  101:getfield        #79  <Field double[] buf>
	//   40  104:aload_0         
	//   41  105:getfield        #81  <Field int bufIndex>
	//   42  108:iconst_0        
	//   43  109:iadd            
	//   44  110:aload_0         
	//   45  111:getfield        #99  <Field double px>
	//   46  114:dastore         
			buf[bufIndex + 1] = py;
	//   47  115:aload_0         
	//   48  116:getfield        #79  <Field double[] buf>
	//   49  119:aload_0         
	//   50  120:getfield        #81  <Field int bufIndex>
	//   51  123:iconst_1        
	//   52  124:iadd            
	//   53  125:aload_0         
	//   54  126:getfield        #101 <Field double py>
	//   55  129:dastore         
			System.arraycopy(((Object) (coords)), 0, ((Object) (buf)), bufIndex + 2, 4);
	//   56  130:aload_0         
	//   57  131:getfield        #41  <Field double[] coords>
	//   58  134:iconst_0        
	//   59  135:aload_0         
	//   60  136:getfield        #79  <Field double[] buf>
	//   61  139:aload_0         
	//   62  140:getfield        #81  <Field int bufIndex>
	//   63  143:iconst_2        
	//   64  144:iadd            
	//   65  145:iconst_4        
	//   66  146:invokestatic    #112 <Method void System.arraycopy(Object, int, Object, int, int)>
			bufSubdiv = 0;
	//   67  149:aload_0         
	//   68  150:iconst_0        
	//   69  151:putfield        #114 <Field int bufSubdiv>
		}
_L7:
		if(bufSubdiv < bufLimit && QuadCurve2D.getFlatnessSq(buf, bufIndex) >= flatness2) goto _L6; else goto _L5
	//   70  154:aload_0         
	//   71  155:getfield        #114 <Field int bufSubdiv>
	//   72  158:aload_0         
	//   73  159:getfield        #69  <Field int bufLimit>
	//   74  162:icmpge          184
	//   75  165:aload_0         
	//   76  166:getfield        #79  <Field double[] buf>
	//   77  169:aload_0         
	//   78  170:getfield        #81  <Field int bufIndex>
	//   79  173:invokestatic    #120 <Method double QuadCurve2D.getFlatnessSq(double[], int)>
	//   80  176:aload_0         
	//   81  177:getfield        #67  <Field double flatness2>
	//   82  180:dcmpg           
	//   83  181:ifge            263
_L5:
		bufIndex = bufIndex + 4;
	//   84  184:aload_0         
	//   85  185:aload_0         
	//   86  186:getfield        #81  <Field int bufIndex>
	//   87  189:iconst_4        
	//   88  190:iadd            
	//   89  191:putfield        #81  <Field int bufIndex>
		px = buf[bufIndex];
	//   90  194:aload_0         
	//   91  195:aload_0         
	//   92  196:getfield        #79  <Field double[] buf>
	//   93  199:aload_0         
	//   94  200:getfield        #81  <Field int bufIndex>
	//   95  203:daload          
	//   96  204:putfield        #99  <Field double px>
		py = buf[bufIndex + 1];
	//   97  207:aload_0         
	//   98  208:aload_0         
	//   99  209:getfield        #79  <Field double[] buf>
	//  100  212:aload_0         
	//  101  213:getfield        #81  <Field int bufIndex>
	//  102  216:iconst_1        
	//  103  217:iadd            
	//  104  218:daload          
	//  105  219:putfield        #101 <Field double py>
		double ad[];
		if(bufIndex == bufSize - 2)
	//* 106  222:aload_0         
	//* 107  223:getfield        #81  <Field int bufIndex>
	//* 108  226:aload_0         
	//* 109  227:getfield        #77  <Field int bufSize>
	//* 110  230:iconst_2        
	//* 111  231:isub            
	//* 112  232:icmpne          388
			flag = true;
	//  113  235:iconst_1        
	//  114  236:istore_1        
		else
	//* 115  237:aload_0         
	//* 116  238:iload_1         
	//* 117  239:putfield        #39  <Field boolean bufEmpty>
	//* 118  242:aload_0         
	//* 119  243:getfield        #39  <Field boolean bufEmpty>
	//* 120  246:ifeq            60
	//* 121  249:aload_0         
	//* 122  250:aload_0         
	//* 123  251:getfield        #77  <Field int bufSize>
	//* 124  254:putfield        #81  <Field int bufIndex>
	//* 125  257:aload_0         
	//* 126  258:iconst_1        
	//* 127  259:putfield        #97  <Field int bufType>
	//* 128  262:return          
	//* 129  263:aload_0         
	//* 130  264:getfield        #81  <Field int bufIndex>
	//* 131  267:iconst_4        
	//* 132  268:icmpgt          336
	//* 133  271:aload_0         
	//* 134  272:getfield        #77  <Field int bufSize>
	//* 135  275:bipush          16
	//* 136  277:iadd            
	//* 137  278:newarray        double[]
	//* 138  280:astore_2        
	//* 139  281:aload_0         
	//* 140  282:getfield        #79  <Field double[] buf>
	//* 141  285:aload_0         
	//* 142  286:getfield        #81  <Field int bufIndex>
	//* 143  289:aload_2         
	//* 144  290:aload_0         
	//* 145  291:getfield        #81  <Field int bufIndex>
	//* 146  294:bipush          16
	//* 147  296:iadd            
	//* 148  297:aload_0         
	//* 149  298:getfield        #77  <Field int bufSize>
	//* 150  301:aload_0         
	//* 151  302:getfield        #81  <Field int bufIndex>
	//* 152  305:isub            
	//* 153  306:invokestatic    #112 <Method void System.arraycopy(Object, int, Object, int, int)>
	//* 154  309:aload_0         
	//* 155  310:aload_2         
	//* 156  311:putfield        #79  <Field double[] buf>
	//* 157  314:aload_0         
	//* 158  315:aload_0         
	//* 159  316:getfield        #77  <Field int bufSize>
	//* 160  319:bipush          16
	//* 161  321:iadd            
	//* 162  322:putfield        #77  <Field int bufSize>
	//* 163  325:aload_0         
	//* 164  326:aload_0         
	//* 165  327:getfield        #81  <Field int bufIndex>
	//* 166  330:bipush          16
	//* 167  332:iadd            
	//* 168  333:putfield        #81  <Field int bufIndex>
	//* 169  336:aload_0         
	//* 170  337:getfield        #79  <Field double[] buf>
	//* 171  340:aload_0         
	//* 172  341:getfield        #81  <Field int bufIndex>
	//* 173  344:aload_0         
	//* 174  345:getfield        #79  <Field double[] buf>
	//* 175  348:aload_0         
	//* 176  349:getfield        #81  <Field int bufIndex>
	//* 177  352:iconst_4        
	//* 178  353:isub            
	//* 179  354:aload_0         
	//* 180  355:getfield        #79  <Field double[] buf>
	//* 181  358:aload_0         
	//* 182  359:getfield        #81  <Field int bufIndex>
	//* 183  362:invokestatic    #124 <Method void QuadCurve2D.subdivide(double[], int, double[], int, double[], int)>
	//* 184  365:aload_0         
	//* 185  366:aload_0         
	//* 186  367:getfield        #81  <Field int bufIndex>
	//* 187  370:iconst_4        
	//* 188  371:isub            
	//* 189  372:putfield        #81  <Field int bufIndex>
	//* 190  375:aload_0         
	//* 191  376:aload_0         
	//* 192  377:getfield        #114 <Field int bufSubdiv>
	//* 193  380:iconst_1        
	//* 194  381:iadd            
	//* 195  382:putfield        #114 <Field int bufSubdiv>
	//* 196  385:goto            154
			flag = false;
	//  197  388:iconst_0        
	//  198  389:istore_1        
		bufEmpty = flag;
		if(bufEmpty)
		{
			bufIndex = bufSize;
			bufType = 1;
			return;
		}
		  goto _L1
_L6:
		if(bufIndex <= 4)
		{
			ad = new double[bufSize + 16];
			System.arraycopy(((Object) (buf)), bufIndex, ((Object) (ad)), bufIndex + 16, bufSize - bufIndex);
			buf = ad;
			bufSize = bufSize + 16;
			bufIndex = bufIndex + 16;
		}
		QuadCurve2D.subdivide(buf, bufIndex, buf, bufIndex - 4, buf, bufIndex);
		bufIndex = bufIndex - 4;
		bufSubdiv = bufSubdiv + 1;
		  goto _L7
	//* 199  390:goto            237
_L4:
		if(bufEmpty)
	//* 200  393:aload_0         
	//* 201  394:getfield        #39  <Field boolean bufEmpty>
	//* 202  397:ifeq            466
		{
			bufIndex = bufIndex - 8;
	//  203  400:aload_0         
	//  204  401:aload_0         
	//  205  402:getfield        #81  <Field int bufIndex>
	//  206  405:bipush          8
	//  207  407:isub            
	//  208  408:putfield        #81  <Field int bufIndex>
			buf[bufIndex + 0] = px;
	//  209  411:aload_0         
	//  210  412:getfield        #79  <Field double[] buf>
	//  211  415:aload_0         
	//  212  416:getfield        #81  <Field int bufIndex>
	//  213  419:iconst_0        
	//  214  420:iadd            
	//  215  421:aload_0         
	//  216  422:getfield        #99  <Field double px>
	//  217  425:dastore         
			buf[bufIndex + 1] = py;
	//  218  426:aload_0         
	//  219  427:getfield        #79  <Field double[] buf>
	//  220  430:aload_0         
	//  221  431:getfield        #81  <Field int bufIndex>
	//  222  434:iconst_1        
	//  223  435:iadd            
	//  224  436:aload_0         
	//  225  437:getfield        #101 <Field double py>
	//  226  440:dastore         
			System.arraycopy(((Object) (coords)), 0, ((Object) (buf)), bufIndex + 2, 6);
	//  227  441:aload_0         
	//  228  442:getfield        #41  <Field double[] coords>
	//  229  445:iconst_0        
	//  230  446:aload_0         
	//  231  447:getfield        #79  <Field double[] buf>
	//  232  450:aload_0         
	//  233  451:getfield        #81  <Field int bufIndex>
	//  234  454:iconst_2        
	//  235  455:iadd            
	//  236  456:bipush          6
	//  237  458:invokestatic    #112 <Method void System.arraycopy(Object, int, Object, int, int)>
			bufSubdiv = 0;
	//  238  461:aload_0         
	//  239  462:iconst_0        
	//  240  463:putfield        #114 <Field int bufSubdiv>
		}
_L10:
		if(bufSubdiv < bufLimit && CubicCurve2D.getFlatnessSq(buf, bufIndex) >= flatness2) goto _L9; else goto _L8
	//  241  466:aload_0         
	//  242  467:getfield        #114 <Field int bufSubdiv>
	//  243  470:aload_0         
	//  244  471:getfield        #69  <Field int bufLimit>
	//  245  474:icmpge          496
	//  246  477:aload_0         
	//  247  478:getfield        #79  <Field double[] buf>
	//  248  481:aload_0         
	//  249  482:getfield        #81  <Field int bufIndex>
	//  250  485:invokestatic    #127 <Method double CubicCurve2D.getFlatnessSq(double[], int)>
	//  251  488:aload_0         
	//  252  489:getfield        #67  <Field double flatness2>
	//  253  492:dcmpg           
	//  254  493:ifge            576
_L8:
		bufIndex = bufIndex + 6;
	//  255  496:aload_0         
	//  256  497:aload_0         
	//  257  498:getfield        #81  <Field int bufIndex>
	//  258  501:bipush          6
	//  259  503:iadd            
	//  260  504:putfield        #81  <Field int bufIndex>
		px = buf[bufIndex];
	//  261  507:aload_0         
	//  262  508:aload_0         
	//  263  509:getfield        #79  <Field double[] buf>
	//  264  512:aload_0         
	//  265  513:getfield        #81  <Field int bufIndex>
	//  266  516:daload          
	//  267  517:putfield        #99  <Field double px>
		py = buf[bufIndex + 1];
	//  268  520:aload_0         
	//  269  521:aload_0         
	//  270  522:getfield        #79  <Field double[] buf>
	//  271  525:aload_0         
	//  272  526:getfield        #81  <Field int bufIndex>
	//  273  529:iconst_1        
	//  274  530:iadd            
	//  275  531:daload          
	//  276  532:putfield        #101 <Field double py>
		if(bufIndex == bufSize - 2)
	//* 277  535:aload_0         
	//* 278  536:getfield        #81  <Field int bufIndex>
	//* 279  539:aload_0         
	//* 280  540:getfield        #77  <Field int bufSize>
	//* 281  543:iconst_2        
	//* 282  544:isub            
	//* 283  545:icmpne          550
			flag = true;
	//  284  548:iconst_1        
	//  285  549:istore_1        
		bufEmpty = flag;
	//  286  550:aload_0         
	//  287  551:iload_1         
	//  288  552:putfield        #39  <Field boolean bufEmpty>
		if(bufEmpty)
	//* 289  555:aload_0         
	//* 290  556:getfield        #39  <Field boolean bufEmpty>
	//* 291  559:ifeq            60
		{
			bufIndex = bufSize;
	//  292  562:aload_0         
	//  293  563:aload_0         
	//  294  564:getfield        #77  <Field int bufSize>
	//  295  567:putfield        #81  <Field int bufIndex>
			bufType = 1;
	//  296  570:aload_0         
	//  297  571:iconst_1        
	//  298  572:putfield        #97  <Field int bufType>
			return;
	//  299  575:return          
		}
		  goto _L1
_L9:
		if(bufIndex <= 6)
	//* 300  576:aload_0         
	//* 301  577:getfield        #81  <Field int bufIndex>
	//* 302  580:bipush          6
	//* 303  582:icmpgt          650
		{
			double ad1[] = new double[bufSize + 16];
	//  304  585:aload_0         
	//  305  586:getfield        #77  <Field int bufSize>
	//  306  589:bipush          16
	//  307  591:iadd            
	//  308  592:newarray        double[]
	//  309  594:astore_2        
			System.arraycopy(((Object) (buf)), bufIndex, ((Object) (ad1)), bufIndex + 16, bufSize - bufIndex);
	//  310  595:aload_0         
	//  311  596:getfield        #79  <Field double[] buf>
	//  312  599:aload_0         
	//  313  600:getfield        #81  <Field int bufIndex>
	//  314  603:aload_2         
	//  315  604:aload_0         
	//  316  605:getfield        #81  <Field int bufIndex>
	//  317  608:bipush          16
	//  318  610:iadd            
	//  319  611:aload_0         
	//  320  612:getfield        #77  <Field int bufSize>
	//  321  615:aload_0         
	//  322  616:getfield        #81  <Field int bufIndex>
	//  323  619:isub            
	//  324  620:invokestatic    #112 <Method void System.arraycopy(Object, int, Object, int, int)>
			buf = ad1;
	//  325  623:aload_0         
	//  326  624:aload_2         
	//  327  625:putfield        #79  <Field double[] buf>
			bufSize = bufSize + 16;
	//  328  628:aload_0         
	//  329  629:aload_0         
	//  330  630:getfield        #77  <Field int bufSize>
	//  331  633:bipush          16
	//  332  635:iadd            
	//  333  636:putfield        #77  <Field int bufSize>
			bufIndex = bufIndex + 16;
	//  334  639:aload_0         
	//  335  640:aload_0         
	//  336  641:getfield        #81  <Field int bufIndex>
	//  337  644:bipush          16
	//  338  646:iadd            
	//  339  647:putfield        #81  <Field int bufIndex>
		}
		CubicCurve2D.subdivide(buf, bufIndex, buf, bufIndex - 6, buf, bufIndex);
	//  340  650:aload_0         
	//  341  651:getfield        #79  <Field double[] buf>
	//  342  654:aload_0         
	//  343  655:getfield        #81  <Field int bufIndex>
	//  344  658:aload_0         
	//  345  659:getfield        #79  <Field double[] buf>
	//  346  662:aload_0         
	//  347  663:getfield        #81  <Field int bufIndex>
	//  348  666:bipush          6
	//  349  668:isub            
	//  350  669:aload_0         
	//  351  670:getfield        #79  <Field double[] buf>
	//  352  673:aload_0         
	//  353  674:getfield        #81  <Field int bufIndex>
	//  354  677:invokestatic    #128 <Method void CubicCurve2D.subdivide(double[], int, double[], int, double[], int)>
		bufIndex = bufIndex - 6;
	//  355  680:aload_0         
	//  356  681:aload_0         
	//  357  682:getfield        #81  <Field int bufIndex>
	//  358  685:bipush          6
	//  359  687:isub            
	//  360  688:putfield        #81  <Field int bufIndex>
		bufSubdiv = bufSubdiv + 1;
	//  361  691:aload_0         
	//  362  692:aload_0         
	//  363  693:getfield        #114 <Field int bufSubdiv>
	//  364  696:iconst_1        
	//  365  697:iadd            
	//  366  698:putfield        #114 <Field int bufSubdiv>
		  goto _L10
	//* 367  701:goto            466
	}

	public double getFlatness()
	{
		return flatness;
	//    0    0:aload_0         
	//    1    1:getfield        #65  <Field double flatness>
	//    2    4:dreturn         
	}

	public int getRecursionLimit()
	{
		return bufLimit;
	//    0    0:aload_0         
	//    1    1:getfield        #69  <Field int bufLimit>
	//    2    4:ireturn         
	}

	public int getWindingRule()
	{
		return p.getWindingRule();
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field PathIterator p>
	//    2    4:invokeinterface #135 <Method int PathIterator.getWindingRule()>
	//    3    9:ireturn         
	}

	public boolean isDone()
	{
		return bufEmpty && p.isDone();
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field boolean bufEmpty>
	//    2    4:ifeq            21
	//    3    7:aload_0         
	//    4    8:getfield        #63  <Field PathIterator p>
	//    5   11:invokeinterface #136 <Method boolean PathIterator.isDone()>
	//    6   16:ifeq            21
	//    7   19:iconst_1        
	//    8   20:ireturn         
	//    9   21:iconst_0        
	//   10   22:ireturn         
	}

	public void next()
	{
		if(bufEmpty)
	//*   0    0:aload_0         
	//*   1    1:getfield        #39  <Field boolean bufEmpty>
	//*   2    4:ifeq            16
			p.next();
	//    3    7:aload_0         
	//    4    8:getfield        #63  <Field PathIterator p>
	//    5   11:invokeinterface #139 <Method void PathIterator.next()>
	//    6   16:return          
	}

	private static final int BUFFER_CAPACITY = 16;
	private static final int BUFFER_LIMIT = 16;
	private static final int BUFFER_SIZE = 16;
	double buf[];
	boolean bufEmpty;
	int bufIndex;
	int bufLimit;
	int bufSize;
	int bufSubdiv;
	int bufType;
	double coords[];
	double flatness;
	double flatness2;
	PathIterator p;
	double px;
	double py;
}
