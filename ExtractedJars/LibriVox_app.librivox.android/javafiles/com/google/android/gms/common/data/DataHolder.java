// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.data;

import android.database.CursorIndexOutOfBoundsException;
import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.common.internal.am;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.c;
import java.io.Closeable;
import java.util.*;

// Referenced classes of package com.google.android.gms.common.data:
//			i, h, e, f

public final class DataHolder extends AbstractSafeParcelable
	implements Closeable
{

	DataHolder(int l, String as[], CursorWindow acursorwindow[], int i1, Bundle bundle)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #48  <Method void AbstractSafeParcelable()>
		i = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #50  <Field boolean i>
		j = true;
	//    5    9:aload_0         
	//    6   10:iconst_1        
	//    7   11:putfield        #52  <Field boolean j>
		a = l;
	//    8   14:aload_0         
	//    9   15:iload_1         
	//   10   16:putfield        #54  <Field int a>
		b = as;
	//   11   19:aload_0         
	//   12   20:aload_2         
	//   13   21:putfield        #56  <Field String[] b>
		d = acursorwindow;
	//   14   24:aload_0         
	//   15   25:aload_3         
	//   16   26:putfield        #58  <Field CursorWindow[] d>
		e = i1;
	//   17   29:aload_0         
	//   18   30:iload           4
	//   19   32:putfield        #60  <Field int e>
		f = bundle;
	//   20   35:aload_0         
	//   21   36:aload           5
	//   22   38:putfield        #62  <Field Bundle f>
	//   23   41:return          
	}

	private DataHolder(e e1, int l, Bundle bundle)
	{
		this(com.google.android.gms.common.data.e.a(e1), a(e1, -1), l, ((Bundle) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #68  <Method String[] e.a(e)>
	//    3    5:aload_1         
	//    4    6:iconst_m1       
	//    5    7:invokestatic    #71  <Method CursorWindow[] a(e, int)>
	//    6   10:iload_2         
	//    7   11:aconst_null     
	//    8   12:invokespecial   #74  <Method void DataHolder(String[], CursorWindow[], int, Bundle)>
	//    9   15:return          
	}

	DataHolder(e e1, int l, Bundle bundle, h h1)
	{
		this(e1, l, ((Bundle) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:aconst_null     
	//    4    4:invokespecial   #77  <Method void DataHolder(e, int, Bundle)>
	//    5    7:return          
	}

	public DataHolder(String as[], CursorWindow acursorwindow[], int l, Bundle bundle)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #48  <Method void AbstractSafeParcelable()>
		i = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #50  <Field boolean i>
		j = true;
	//    5    9:aload_0         
	//    6   10:iconst_1        
	//    7   11:putfield        #52  <Field boolean j>
		a = 1;
	//    8   14:aload_0         
	//    9   15:iconst_1        
	//   10   16:putfield        #54  <Field int a>
		b = (String[])am.a(((Object) (as)));
	//   11   19:aload_0         
	//   12   20:aload_1         
	//   13   21:invokestatic    #82  <Method Object am.a(Object)>
	//   14   24:checkcast       #83  <Class String[]>
	//   15   27:putfield        #56  <Field String[] b>
		d = (CursorWindow[])am.a(((Object) (acursorwindow)));
	//   16   30:aload_0         
	//   17   31:aload_2         
	//   18   32:invokestatic    #82  <Method Object am.a(Object)>
	//   19   35:checkcast       #84  <Class CursorWindow[]>
	//   20   38:putfield        #58  <Field CursorWindow[] d>
		e = l;
	//   21   41:aload_0         
	//   22   42:iload_3         
	//   23   43:putfield        #60  <Field int e>
		f = bundle;
	//   24   46:aload_0         
	//   25   47:aload           4
	//   26   49:putfield        #62  <Field Bundle f>
		a();
	//   27   52:aload_0         
	//   28   53:invokevirtual   #86  <Method void a()>
	//   29   56:return          
	}

	public static e a(String as[])
	{
		return new e(as, ((String) (null)), ((h) (null)));
	//    0    0:new             #65  <Class e>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:aconst_null     
	//    5    7:invokespecial   #90  <Method void e(String[], String, h)>
	//    6   10:areturn         
	}

	private final void a(String s, int l)
	{
		Bundle bundle = c;
	//    0    0:aload_0         
	//    1    1:getfield        #93  <Field Bundle c>
	//    2    4:astore_3        
		if(bundle != null && bundle.containsKey(s))
	//*   3    5:aload_3         
	//*   4    6:ifnull          63
	//*   5    9:aload_3         
	//*   6   10:aload_1         
	//*   7   11:invokevirtual   #99  <Method boolean Bundle.containsKey(String)>
	//*   8   14:ifne            20
	//*   9   17:goto            63
			if(!e())
	//*  10   20:aload_0         
	//*  11   21:invokevirtual   #102 <Method boolean e()>
	//*  12   24:ifne            53
			{
				if(l >= 0 && l < h)
	//*  13   27:iload_2         
	//*  14   28:iflt            40
	//*  15   31:iload_2         
	//*  16   32:aload_0         
	//*  17   33:getfield        #104 <Field int h>
	//*  18   36:icmpge          40
					return;
	//   19   39:return          
				else
					throw new CursorIndexOutOfBoundsException(l, h);
	//   20   40:new             #106 <Class CursorIndexOutOfBoundsException>
	//   21   43:dup             
	//   22   44:iload_2         
	//   23   45:aload_0         
	//   24   46:getfield        #104 <Field int h>
	//   25   49:invokespecial   #109 <Method void CursorIndexOutOfBoundsException(int, int)>
	//   26   52:athrow          
			} else
			{
				throw new IllegalArgumentException("Buffer is closed.");
	//   27   53:new             #111 <Class IllegalArgumentException>
	//   28   56:dup             
	//   29   57:ldc1            #113 <String "Buffer is closed.">
	//   30   59:invokespecial   #116 <Method void IllegalArgumentException(String)>
	//   31   62:athrow          
			}
		s = String.valueOf(((Object) (s)));
	//   32   63:aload_1         
	//   33   64:invokestatic    #120 <Method String String.valueOf(Object)>
	//   34   67:astore_1        
		if(s.length() != 0)
	//*  35   68:aload_1         
	//*  36   69:invokevirtual   #124 <Method int String.length()>
	//*  37   72:ifeq            85
			s = "No such column: ".concat(s);
	//   38   75:ldc1            #126 <String "No such column: ">
	//   39   77:aload_1         
	//   40   78:invokevirtual   #130 <Method String String.concat(String)>
	//   41   81:astore_1        
		else
	//*  42   82:goto            95
			s = new String("No such column: ");
	//   43   85:new             #40  <Class String>
	//   44   88:dup             
	//   45   89:ldc1            #126 <String "No such column: ">
	//   46   91:invokespecial   #131 <Method void String(String)>
	//   47   94:astore_1        
		throw new IllegalArgumentException(s);
	//   48   95:new             #111 <Class IllegalArgumentException>
	//   49   98:dup             
	//   50   99:aload_1         
	//   51  100:invokespecial   #116 <Method void IllegalArgumentException(String)>
	//   52  103:athrow          
	}

	private static CursorWindow[] a(e e1, int l)
	{
		boolean flag;
		boolean flag1;
		int l1;
		Object obj1;
		Object obj2;
		ArrayList arraylist;
		int i1 = com.google.android.gms.common.data.e.a(e1).length;
	//    0    0:aload_0         
	//    1    1:invokestatic    #68  <Method String[] e.a(e)>
	//    2    4:arraylength     
	//    3    5:istore_2        
		flag1 = false;
	//    4    6:iconst_0        
	//    5    7:istore          4
		if(i1 == 0)
	//*   6    9:iload_2         
	//*   7   10:ifne            18
			return new CursorWindow[0];
	//    8   13:iconst_0        
	//    9   14:anewarray       CursorWindow[]
	//   10   17:areturn         
		if(l >= 0 && l < com.google.android.gms.common.data.e.b(e1).size())
	//*  11   18:iload_1         
	//*  12   19:iflt            50
	//*  13   22:iload_1         
	//*  14   23:aload_0         
	//*  15   24:invokestatic    #138 <Method ArrayList e.b(e)>
	//*  16   27:invokevirtual   #143 <Method int ArrayList.size()>
	//*  17   30:icmplt          36
	//*  18   33:goto            50
			obj2 = ((Object) (com.google.android.gms.common.data.e.b(e1).subList(0, l)));
	//   19   36:aload_0         
	//   20   37:invokestatic    #138 <Method ArrayList e.b(e)>
	//   21   40:iconst_0        
	//   22   41:iload_1         
	//   23   42:invokevirtual   #147 <Method List ArrayList.subList(int, int)>
	//   24   45:astore          11
		else
	//*  25   47:goto            56
			obj2 = ((Object) (com.google.android.gms.common.data.e.b(e1)));
	//   26   50:aload_0         
	//   27   51:invokestatic    #138 <Method ArrayList e.b(e)>
	//   28   54:astore          11
		l1 = ((List) (obj2)).size();
	//   29   56:aload           11
	//   30   58:invokeinterface #150 <Method int List.size()>
	//   31   63:istore          5
		obj1 = ((Object) (new CursorWindow(false)));
	//   32   65:new             #135 <Class CursorWindow>
	//   33   68:dup             
	//   34   69:iconst_0        
	//   35   70:invokespecial   #153 <Method void CursorWindow(boolean)>
	//   36   73:astore          10
		arraylist = new ArrayList();
	//   37   75:new             #140 <Class ArrayList>
	//   38   78:dup             
	//   39   79:invokespecial   #154 <Method void ArrayList()>
	//   40   82:astore          12
		arraylist.add(obj1);
	//   41   84:aload           12
	//   42   86:aload           10
	//   43   88:invokevirtual   #158 <Method boolean ArrayList.add(Object)>
	//   44   91:pop             
		((CursorWindow) (obj1)).setNumColumns(com.google.android.gms.common.data.e.a(e1).length);
	//   45   92:aload           10
	//   46   94:aload_0         
	//   47   95:invokestatic    #68  <Method String[] e.a(e)>
	//   48   98:arraylength     
	//   49   99:invokevirtual   #162 <Method boolean CursorWindow.setNumColumns(int)>
	//   50  102:pop             
		l = 0;
	//   51  103:iconst_0        
	//   52  104:istore_1        
		flag = false;
	//   53  105:iconst_0        
	//   54  106:istore_2        
_L2:
		Object obj;
		if(l >= l1)
			break; /* Loop/switch isn't completed */
	//   55  107:iload_1         
	//   56  108:iload           5
	//   57  110:icmpge          766
		obj = obj1;
	//   58  113:aload           10
	//   59  115:astore          9
		if(((CursorWindow) (obj1)).allocRow())
			break MISSING_BLOCK_LABEL_250;
	//   60  117:aload           10
	//   61  119:invokevirtual   #165 <Method boolean CursorWindow.allocRow()>
	//   62  122:ifne            250
		obj = ((Object) (new StringBuilder(72)));
	//   63  125:new             #167 <Class StringBuilder>
	//   64  128:dup             
	//   65  129:bipush          72
	//   66  131:invokespecial   #170 <Method void StringBuilder(int)>
	//   67  134:astore          9
		((StringBuilder) (obj)).append("Allocating additional cursor window for large data set (row ");
	//   68  136:aload           9
	//   69  138:ldc1            #172 <String "Allocating additional cursor window for large data set (row ">
	//   70  140:invokevirtual   #176 <Method StringBuilder StringBuilder.append(String)>
	//   71  143:pop             
		((StringBuilder) (obj)).append(l);
	//   72  144:aload           9
	//   73  146:iload_1         
	//   74  147:invokevirtual   #179 <Method StringBuilder StringBuilder.append(int)>
	//   75  150:pop             
		((StringBuilder) (obj)).append(")");
	//   76  151:aload           9
	//   77  153:ldc1            #181 <String ")">
	//   78  155:invokevirtual   #176 <Method StringBuilder StringBuilder.append(String)>
	//   79  158:pop             
		Log.d("DataHolder", ((StringBuilder) (obj)).toString());
	//   80  159:ldc1            #183 <String "DataHolder">
	//   81  161:aload           9
	//   82  163:invokevirtual   #187 <Method String StringBuilder.toString()>
	//   83  166:invokestatic    #192 <Method int Log.d(String, String)>
	//   84  169:pop             
		obj1 = ((Object) (new CursorWindow(false)));
	//   85  170:new             #135 <Class CursorWindow>
	//   86  173:dup             
	//   87  174:iconst_0        
	//   88  175:invokespecial   #153 <Method void CursorWindow(boolean)>
	//   89  178:astore          10
		((CursorWindow) (obj1)).setStartPosition(l);
	//   90  180:aload           10
	//   91  182:iload_1         
	//   92  183:invokevirtual   #195 <Method void CursorWindow.setStartPosition(int)>
		((CursorWindow) (obj1)).setNumColumns(com.google.android.gms.common.data.e.a(e1).length);
	//   93  186:aload           10
	//   94  188:aload_0         
	//   95  189:invokestatic    #68  <Method String[] e.a(e)>
	//   96  192:arraylength     
	//   97  193:invokevirtual   #162 <Method boolean CursorWindow.setNumColumns(int)>
	//   98  196:pop             
		arraylist.add(obj1);
	//   99  197:aload           12
	//  100  199:aload           10
	//  101  201:invokevirtual   #158 <Method boolean ArrayList.add(Object)>
	//  102  204:pop             
		obj = obj1;
	//  103  205:aload           10
	//  104  207:astore          9
		if(!((CursorWindow) (obj1)).allocRow())
	//* 105  209:aload           10
	//* 106  211:invokevirtual   #165 <Method boolean CursorWindow.allocRow()>
	//* 107  214:ifne            250
		{
			Log.e("DataHolder", "Unable to allocate row to hold data.");
	//  108  217:ldc1            #183 <String "DataHolder">
	//  109  219:ldc1            #197 <String "Unable to allocate row to hold data.">
	//  110  221:invokestatic    #199 <Method int Log.e(String, String)>
	//  111  224:pop             
			arraylist.remove(obj1);
	//  112  225:aload           12
	//  113  227:aload           10
	//  114  229:invokevirtual   #202 <Method boolean ArrayList.remove(Object)>
	//  115  232:pop             
			return (CursorWindow[])arraylist.toArray(((Object []) (new CursorWindow[arraylist.size()])));
	//  116  233:aload           12
	//  117  235:aload           12
	//  118  237:invokevirtual   #143 <Method int ArrayList.size()>
	//  119  240:anewarray       CursorWindow[]
	//  120  243:invokevirtual   #206 <Method Object[] ArrayList.toArray(Object[])>
	//  121  246:checkcast       #84  <Class CursorWindow[]>
	//  122  249:areturn         
		}
		Map map = (Map)((List) (obj2)).get(l);
	//  123  250:aload           11
	//  124  252:iload_1         
	//  125  253:invokeinterface #210 <Method Object List.get(int)>
	//  126  258:checkcast       #212 <Class Map>
	//  127  261:astore          13
		int k1;
		k1 = 0;
	//  128  263:iconst_0        
	//  129  264:istore_3        
		int j1;
		long l2;
		Object obj3;
		for(boolean flag2 = true; k1 >= com.google.android.gms.common.data.e.a(e1).length || !flag2; k1++)
			break MISSING_BLOCK_LABEL_601;

	//  130  265:iconst_1        
	//  131  266:istore          6
	//  132  268:iload_3         
	//  133  269:aload_0         
	//  134  270:invokestatic    #68  <Method String[] e.a(e)>
	//  135  273:arraylength     
	//  136  274:icmpge          601
	//  137  277:iload           6
	//  138  279:ifeq            601
	//  139  282:aload_0         
	//  140  283:invokestatic    #68  <Method String[] e.a(e)>
	//  141  286:iload_3         
	//  142  287:aaload          
	//  143  288:astore          10
	//  144  290:aload           13
	//  145  292:aload           10
	//  146  294:invokeinterface #214 <Method Object Map.get(Object)>
	//  147  299:astore          14
	//  148  301:aload           14
	//  149  303:ifnonnull       318
	//  150  306:aload           9
	//  151  308:iload_1         
	//  152  309:iload_3         
	//  153  310:invokevirtual   #218 <Method boolean CursorWindow.putNull(int, int)>
	//  154  313:istore          6
	//  155  315:goto            789
	//  156  318:aload           14
	//  157  320:instanceof      #40  <Class String>
	//  158  323:ifeq            343
	//  159  326:aload           9
	//  160  328:aload           14
	//  161  330:checkcast       #40  <Class String>
	//  162  333:iload_1         
	//  163  334:iload_3         
	//  164  335:invokevirtual   #222 <Method boolean CursorWindow.putString(String, int, int)>
	//  165  338:istore          6
	//  166  340:goto            789
	//  167  343:aload           14
	//  168  345:instanceof      #224 <Class Long>
	//  169  348:ifeq            371
	//  170  351:aload           9
	//  171  353:aload           14
	//  172  355:checkcast       #224 <Class Long>
	//  173  358:invokevirtual   #228 <Method long Long.longValue()>
	//  174  361:iload_1         
	//  175  362:iload_3         
	//  176  363:invokevirtual   #232 <Method boolean CursorWindow.putLong(long, int, int)>
	//  177  366:istore          6
	//  178  368:goto            789
	//  179  371:aload           14
	//  180  373:instanceof      #234 <Class Integer>
	//  181  376:ifeq            400
	//  182  379:aload           9
	//  183  381:aload           14
	//  184  383:checkcast       #234 <Class Integer>
	//  185  386:invokevirtual   #237 <Method int Integer.intValue()>
	//  186  389:i2l             
	//  187  390:iload_1         
	//  188  391:iload_3         
	//  189  392:invokevirtual   #232 <Method boolean CursorWindow.putLong(long, int, int)>
	//  190  395:istore          6
	//  191  397:goto            789
	//  192  400:aload           14
	//  193  402:instanceof      #239 <Class Boolean>
	//  194  405:ifeq            439
	//  195  408:aload           14
	//  196  410:checkcast       #239 <Class Boolean>
	//  197  413:invokevirtual   #242 <Method boolean Boolean.booleanValue()>
	//  198  416:ifeq            783
	//  199  419:lconst_1        
	//  200  420:lstore          7
	//  201  422:goto            425
	//  202  425:aload           9
	//  203  427:lload           7
	//  204  429:iload_1         
	//  205  430:iload_3         
	//  206  431:invokevirtual   #232 <Method boolean CursorWindow.putLong(long, int, int)>
	//  207  434:istore          6
	//  208  436:goto            789
	//  209  439:aload           14
	//  210  441:instanceof      #244 <Class byte[]>
	//  211  444:ifeq            464
	//  212  447:aload           9
	//  213  449:aload           14
	//  214  451:checkcast       #244 <Class byte[]>
	//  215  454:iload_1         
	//  216  455:iload_3         
	//  217  456:invokevirtual   #248 <Method boolean CursorWindow.putBlob(byte[], int, int)>
	//  218  459:istore          6
	//  219  461:goto            789
	//  220  464:aload           14
	//  221  466:instanceof      #250 <Class Double>
	//  222  469:ifeq            492
	//  223  472:aload           9
	//  224  474:aload           14
	//  225  476:checkcast       #250 <Class Double>
	//  226  479:invokevirtual   #254 <Method double Double.doubleValue()>
	//  227  482:iload_1         
	//  228  483:iload_3         
	//  229  484:invokevirtual   #258 <Method boolean CursorWindow.putDouble(double, int, int)>
	//  230  487:istore          6
	//  231  489:goto            789
	//  232  492:aload           14
	//  233  494:instanceof      #260 <Class Float>
	//  234  497:ifeq            521
	//  235  500:aload           9
	//  236  502:aload           14
	//  237  504:checkcast       #260 <Class Float>
	//  238  507:invokevirtual   #264 <Method float Float.floatValue()>
	//  239  510:f2d             
	//  240  511:iload_1         
	//  241  512:iload_3         
	//  242  513:invokevirtual   #258 <Method boolean CursorWindow.putDouble(double, int, int)>
	//  243  516:istore          6
	//  244  518:goto            789
	//  245  521:aload           14
	//  246  523:invokestatic    #120 <Method String String.valueOf(Object)>
	//  247  526:astore_0        
	//  248  527:new             #167 <Class StringBuilder>
	//  249  530:dup             
	//  250  531:aload           10
	//  251  533:invokestatic    #120 <Method String String.valueOf(Object)>
	//  252  536:invokevirtual   #124 <Method int String.length()>
	//  253  539:bipush          32
	//  254  541:iadd            
	//  255  542:aload_0         
	//  256  543:invokestatic    #120 <Method String String.valueOf(Object)>
	//  257  546:invokevirtual   #124 <Method int String.length()>
	//  258  549:iadd            
	//  259  550:invokespecial   #170 <Method void StringBuilder(int)>
	//  260  553:astore          9
	//  261  555:aload           9
	//  262  557:ldc2            #266 <String "Unsupported object for column ">
	//  263  560:invokevirtual   #176 <Method StringBuilder StringBuilder.append(String)>
	//  264  563:pop             
	//  265  564:aload           9
	//  266  566:aload           10
	//  267  568:invokevirtual   #176 <Method StringBuilder StringBuilder.append(String)>
	//  268  571:pop             
	//  269  572:aload           9
	//  270  574:ldc2            #268 <String ": ">
	//  271  577:invokevirtual   #176 <Method StringBuilder StringBuilder.append(String)>
	//  272  580:pop             
	//  273  581:aload           9
	//  274  583:aload_0         
	//  275  584:invokevirtual   #176 <Method StringBuilder StringBuilder.append(String)>
	//  276  587:pop             
	//  277  588:new             #111 <Class IllegalArgumentException>
	//  278  591:dup             
	//  279  592:aload           9
	//  280  594:invokevirtual   #187 <Method String StringBuilder.toString()>
	//  281  597:invokespecial   #116 <Method void IllegalArgumentException(String)>
	//  282  600:athrow          
	//  283  601:iload           6
	//  284  603:ifne            717
	//  285  606:iload_2         
	//  286  607:ifne            706
	//  287  610:new             #167 <Class StringBuilder>
	//  288  613:dup             
	//  289  614:bipush          74
	//  290  616:invokespecial   #170 <Method void StringBuilder(int)>
	//  291  619:astore          10
	//  292  621:aload           10
	//  293  623:ldc2            #270 <String "Couldn't populate window data for row ">
	//  294  626:invokevirtual   #176 <Method StringBuilder StringBuilder.append(String)>
	//  295  629:pop             
	//  296  630:aload           10
	//  297  632:iload_1         
	//  298  633:invokevirtual   #179 <Method StringBuilder StringBuilder.append(int)>
	//  299  636:pop             
	//  300  637:aload           10
	//  301  639:ldc2            #272 <String " - allocating new window.">
	//  302  642:invokevirtual   #176 <Method StringBuilder StringBuilder.append(String)>
	//  303  645:pop             
	//  304  646:ldc1            #183 <String "DataHolder">
	//  305  648:aload           10
	//  306  650:invokevirtual   #187 <Method String StringBuilder.toString()>
	//  307  653:invokestatic    #192 <Method int Log.d(String, String)>
	//  308  656:pop             
	//  309  657:aload           9
	//  310  659:invokevirtual   #275 <Method void CursorWindow.freeLastRow()>
	//  311  662:new             #135 <Class CursorWindow>
	//  312  665:dup             
	//  313  666:iconst_0        
	//  314  667:invokespecial   #153 <Method void CursorWindow(boolean)>
	//  315  670:astore          9
	//  316  672:aload           9
	//  317  674:iload_1         
	//  318  675:invokevirtual   #195 <Method void CursorWindow.setStartPosition(int)>
	//  319  678:aload           9
	//  320  680:aload_0         
	//  321  681:invokestatic    #68  <Method String[] e.a(e)>
	//  322  684:arraylength     
	//  323  685:invokevirtual   #162 <Method boolean CursorWindow.setNumColumns(int)>
	//  324  688:pop             
	//  325  689:aload           12
	//  326  691:aload           9
	//  327  693:invokevirtual   #158 <Method boolean ArrayList.add(Object)>
	//  328  696:pop             
	//  329  697:iload_1         
	//  330  698:iconst_1        
	//  331  699:isub            
	//  332  700:istore_1        
	//  333  701:iconst_1        
	//  334  702:istore_2        
	//  335  703:goto            719
	//  336  706:new             #277 <Class f>
	//  337  709:dup             
	//  338  710:ldc2            #279 <String "Could not add the value to a new CursorWindow. The size of value may be larger than what a CursorWindow can handle.">
	//  339  713:invokespecial   #280 <Method void f(String)>
	//  340  716:athrow          
	//  341  717:iconst_0        
	//  342  718:istore_2        
	//  343  719:iload_1         
	//  344  720:iconst_1        
	//  345  721:iadd            
	//  346  722:istore_1        
	//  347  723:aload           9
	//  348  725:astore          10
	//  349  727:goto            107
	//  350  730:astore_0        
	//  351  731:aload           12
	//  352  733:invokevirtual   #143 <Method int ArrayList.size()>
	//  353  736:istore_2        
	//  354  737:iload           4
	//  355  739:istore_1        
	//  356  740:iload_1         
	//  357  741:iload_2         
	//  358  742:icmpge          764
	//  359  745:aload           12
	//  360  747:iload_1         
	//  361  748:invokevirtual   #281 <Method Object ArrayList.get(int)>
	//  362  751:checkcast       #135 <Class CursorWindow>
	//  363  754:invokevirtual   #284 <Method void CursorWindow.close()>
	//  364  757:iload_1         
	//  365  758:iconst_1        
	//  366  759:iadd            
	//  367  760:istore_1        
	//  368  761:goto            740
	//  369  764:aload_0         
	//  370  765:athrow          
	//  371  766:aload           12
	//  372  768:aload           12
	//  373  770:invokevirtual   #143 <Method int ArrayList.size()>
	//  374  773:anewarray       CursorWindow[]
	//  375  776:invokevirtual   #206 <Method Object[] ArrayList.toArray(Object[])>
	//  376  779:checkcast       #84  <Class CursorWindow[]>
	//  377  782:areturn         
	//  378  783:lconst_0        
	//  379  784:lstore          7
	//  380  786:goto            425
	//  381  789:iload_3         
	//  382  790:iconst_1        
	//  383  791:iadd            
	//  384  792:istore_3        
		obj1 = ((Object) (com.google.android.gms.common.data.e.a(e1)[k1]));
		obj3 = map.get(obj1);
		if(obj3 != null)
			break MISSING_BLOCK_LABEL_318;
		flag2 = ((CursorWindow) (obj)).putNull(l, k1);
		break MISSING_BLOCK_LABEL_789;
		if(obj3 instanceof String)
		{
			flag2 = ((CursorWindow) (obj)).putString((String)obj3, l, k1);
			break MISSING_BLOCK_LABEL_789;
		}
		if(obj3 instanceof Long)
		{
			flag2 = ((CursorWindow) (obj)).putLong(((Long)obj3).longValue(), l, k1);
			break MISSING_BLOCK_LABEL_789;
		}
		if(obj3 instanceof Integer)
		{
			flag2 = ((CursorWindow) (obj)).putLong(((Integer)obj3).intValue(), l, k1);
			break MISSING_BLOCK_LABEL_789;
		}
		if(!(obj3 instanceof Boolean))
			break MISSING_BLOCK_LABEL_439;
		if(((Boolean)obj3).booleanValue())
			l2 = 1L;
		else
			l2 = 0L;
		flag2 = ((CursorWindow) (obj)).putLong(l2, l, k1);
		break MISSING_BLOCK_LABEL_789;
		if(obj3 instanceof byte[])
		{
			flag2 = ((CursorWindow) (obj)).putBlob((byte[])obj3, l, k1);
			break MISSING_BLOCK_LABEL_789;
		}
		if(obj3 instanceof Double)
		{
			flag2 = ((CursorWindow) (obj)).putDouble(((Double)obj3).doubleValue(), l, k1);
			break MISSING_BLOCK_LABEL_789;
		}
		if(obj3 instanceof Float)
		{
			flag2 = ((CursorWindow) (obj)).putDouble(((Float)obj3).floatValue(), l, k1);
			break MISSING_BLOCK_LABEL_789;
		}
		try
		{
			e1 = ((e) (String.valueOf(obj3)));
			obj = ((Object) (new StringBuilder(String.valueOf(obj1).length() + 32 + String.valueOf(((Object) (e1))).length())));
			((StringBuilder) (obj)).append("Unsupported object for column ");
			((StringBuilder) (obj)).append(((String) (obj1)));
			((StringBuilder) (obj)).append(": ");
			((StringBuilder) (obj)).append(((String) (e1)));
			throw new IllegalArgumentException(((StringBuilder) (obj)).toString());
		}
		// Misplaced declaration of an exception variable
		catch(e e1)
		{
			j1 = arraylist.size();
		}
		break MISSING_BLOCK_LABEL_737;
		if(flag2)
			break MISSING_BLOCK_LABEL_717;
		if(flag)
			break MISSING_BLOCK_LABEL_706;
		obj1 = ((Object) (new StringBuilder(74)));
		((StringBuilder) (obj1)).append("Couldn't populate window data for row ");
		((StringBuilder) (obj1)).append(l);
		((StringBuilder) (obj1)).append(" - allocating new window.");
		Log.d("DataHolder", ((StringBuilder) (obj1)).toString());
		((CursorWindow) (obj)).freeLastRow();
		obj = ((Object) (new CursorWindow(false)));
		((CursorWindow) (obj)).setStartPosition(l);
		((CursorWindow) (obj)).setNumColumns(com.google.android.gms.common.data.e.a(e1).length);
		arraylist.add(obj);
		l--;
		flag = true;
		break MISSING_BLOCK_LABEL_719;
		throw new f("Could not add the value to a new CursorWindow. The size of value may be larger than what a CursorWindow can handle.");
		flag = false;
		l++;
		obj1 = obj;
		if(true) goto _L2; else goto _L1
		for(l = ((int) (flag1)); l < j1; l++)
			((CursorWindow)arraylist.get(l)).close();

		throw e1;
_L1:
		return (CursorWindow[])arraylist.toArray(((Object []) (new CursorWindow[arraylist.size()])));
	//* 385  793:goto            268
	}

	public final int a(int l)
	{
		int j1 = 0;
	//    0    0:iconst_0        
	//    1    1:istore_3        
		boolean flag;
		if(l >= 0 && l < h)
	//*   2    2:iload_1         
	//*   3    3:iflt            20
	//*   4    6:iload_1         
	//*   5    7:aload_0         
	//*   6    8:getfield        #104 <Field int h>
	//*   7   11:icmpge          20
			flag = true;
	//    8   14:iconst_1        
	//    9   15:istore          4
		else
	//*  10   17:goto            23
			flag = false;
	//   11   20:iconst_0        
	//   12   21:istore          4
		am.a(flag);
	//   13   23:iload           4
	//   14   25:invokestatic    #287 <Method void am.a(boolean)>
		int i1;
		do
		{
			int ai[] = g;
	//   15   28:aload_0         
	//   16   29:getfield        #289 <Field int[] g>
	//   17   32:astore          5
			i1 = j1;
	//   18   34:iload_3         
	//   19   35:istore_2        
			if(j1 >= ai.length)
				break;
	//   20   36:iload_3         
	//   21   37:aload           5
	//   22   39:arraylength     
	//   23   40:icmpge          65
			if(l < ai[j1])
	//*  24   43:iload_1         
	//*  25   44:aload           5
	//*  26   46:iload_3         
	//*  27   47:iaload          
	//*  28   48:icmpge          58
			{
				i1 = j1 - 1;
	//   29   51:iload_3         
	//   30   52:iconst_1        
	//   31   53:isub            
	//   32   54:istore_2        
				break;
	//   33   55:goto            65
			}
			j1++;
	//   34   58:iload_3         
	//   35   59:iconst_1        
	//   36   60:iadd            
	//   37   61:istore_3        
		} while(true);
	//   38   62:goto            28
		l = i1;
	//   39   65:iload_2         
	//   40   66:istore_1        
		if(i1 == g.length)
	//*  41   67:iload_2         
	//*  42   68:aload_0         
	//*  43   69:getfield        #289 <Field int[] g>
	//*  44   72:arraylength     
	//*  45   73:icmpne          80
			l = i1 - 1;
	//   46   76:iload_2         
	//   47   77:iconst_1        
	//   48   78:isub            
	//   49   79:istore_1        
		return l;
	//   50   80:iload_1         
	//   51   81:ireturn         
	}

	public final void a()
	{
		c = new Bundle();
	//    0    0:aload_0         
	//    1    1:new             #95  <Class Bundle>
	//    2    4:dup             
	//    3    5:invokespecial   #290 <Method void Bundle()>
	//    4    8:putfield        #93  <Field Bundle c>
		boolean flag = false;
	//    5   11:iconst_0        
	//    6   12:istore_3        
		int l = 0;
	//    7   13:iconst_0        
	//    8   14:istore_1        
		do
		{
			String as[] = b;
	//    9   15:aload_0         
	//   10   16:getfield        #56  <Field String[] b>
	//   11   19:astore          4
			if(l >= as.length)
				break;
	//   12   21:iload_1         
	//   13   22:aload           4
	//   14   24:arraylength     
	//   15   25:icmpge          47
			c.putInt(as[l], l);
	//   16   28:aload_0         
	//   17   29:getfield        #93  <Field Bundle c>
	//   18   32:aload           4
	//   19   34:iload_1         
	//   20   35:aaload          
	//   21   36:iload_1         
	//   22   37:invokevirtual   #293 <Method void Bundle.putInt(String, int)>
			l++;
	//   23   40:iload_1         
	//   24   41:iconst_1        
	//   25   42:iadd            
	//   26   43:istore_1        
		} while(true);
	//   27   44:goto            15
		g = new int[d.length];
	//   28   47:aload_0         
	//   29   48:aload_0         
	//   30   49:getfield        #58  <Field CursorWindow[] d>
	//   31   52:arraylength     
	//   32   53:newarray        int[]
	//   33   55:putfield        #289 <Field int[] g>
		int i1 = 0;
	//   34   58:iconst_0        
	//   35   59:istore_2        
		l = ((int) (flag));
	//   36   60:iload_3         
	//   37   61:istore_1        
		do
		{
			CursorWindow acursorwindow[] = d;
	//   38   62:aload_0         
	//   39   63:getfield        #58  <Field CursorWindow[] d>
	//   40   66:astore          4
			if(l < acursorwindow.length)
	//*  41   68:iload_1         
	//*  42   69:aload           4
	//*  43   71:arraylength     
	//*  44   72:icmpge          113
			{
				g[l] = i1;
	//   45   75:aload_0         
	//   46   76:getfield        #289 <Field int[] g>
	//   47   79:iload_1         
	//   48   80:iload_2         
	//   49   81:iastore         
				int j1 = acursorwindow[l].getStartPosition();
	//   50   82:aload           4
	//   51   84:iload_1         
	//   52   85:aaload          
	//   53   86:invokevirtual   #296 <Method int CursorWindow.getStartPosition()>
	//   54   89:istore_3        
				i1 += d[l].getNumRows() - (i1 - j1);
	//   55   90:iload_2         
	//   56   91:aload_0         
	//   57   92:getfield        #58  <Field CursorWindow[] d>
	//   58   95:iload_1         
	//   59   96:aaload          
	//   60   97:invokevirtual   #299 <Method int CursorWindow.getNumRows()>
	//   61  100:iload_2         
	//   62  101:iload_3         
	//   63  102:isub            
	//   64  103:isub            
	//   65  104:iadd            
	//   66  105:istore_2        
				l++;
	//   67  106:iload_1         
	//   68  107:iconst_1        
	//   69  108:iadd            
	//   70  109:istore_1        
			} else
	//*  71  110:goto            62
			{
				h = i1;
	//   72  113:aload_0         
	//   73  114:iload_2         
	//   74  115:putfield        #104 <Field int h>
				return;
	//   75  118:return          
			}
		} while(true);
	}

	public final byte[] a(String s, int l, int i1)
	{
		a(s, l);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #302 <Method void a(String, int)>
		return d[i1].getBlob(l, c.getInt(s));
	//    4    6:aload_0         
	//    5    7:getfield        #58  <Field CursorWindow[] d>
	//    6   10:iload_3         
	//    7   11:aaload          
	//    8   12:iload_2         
	//    9   13:aload_0         
	//   10   14:getfield        #93  <Field Bundle c>
	//   11   17:aload_1         
	//   12   18:invokevirtual   #306 <Method int Bundle.getInt(String)>
	//   13   21:invokevirtual   #310 <Method byte[] CursorWindow.getBlob(int, int)>
	//   14   24:areturn         
	}

	public final int b()
	{
		return e;
	//    0    0:aload_0         
	//    1    1:getfield        #60  <Field int e>
	//    2    4:ireturn         
	}

	public final Bundle c()
	{
		return f;
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field Bundle f>
	//    2    4:areturn         
	}

	public final void close()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(i) goto _L2; else goto _L1
	//    2    2:aload_0         
	//    3    3:getfield        #50  <Field boolean i>
	//    4    6:ifne            41
_L1:
		i = true;
	//    5    9:aload_0         
	//    6   10:iconst_1        
	//    7   11:putfield        #50  <Field boolean i>
		int l = 0;
	//    8   14:iconst_0        
	//    9   15:istore_1        
_L3:
		if(l >= d.length)
			break; /* Loop/switch isn't completed */
	//   10   16:iload_1         
	//   11   17:aload_0         
	//   12   18:getfield        #58  <Field CursorWindow[] d>
	//   13   21:arraylength     
	//   14   22:icmpge          41
		d[l].close();
	//   15   25:aload_0         
	//   16   26:getfield        #58  <Field CursorWindow[] d>
	//   17   29:iload_1         
	//   18   30:aaload          
	//   19   31:invokevirtual   #284 <Method void CursorWindow.close()>
		l++;
	//   20   34:iload_1         
	//   21   35:iconst_1        
	//   22   36:iadd            
	//   23   37:istore_1        
		if(true) goto _L3; else goto _L2
	//   24   38:goto            16
_L2:
		this;
	//   25   41:aload_0         
		JVM INSTR monitorexit ;
	//   26   42:monitorexit     
		return;
	//   27   43:return          
		Exception exception;
		exception;
	//   28   44:astore_2        
		this;
	//   29   45:aload_0         
		JVM INSTR monitorexit ;
	//   30   46:monitorexit     
		throw exception;
	//   31   47:aload_2         
	//   32   48:athrow          
	}

	public final int d()
	{
		return h;
	//    0    0:aload_0         
	//    1    1:getfield        #104 <Field int h>
	//    2    4:ireturn         
	}

	public final boolean e()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		boolean flag = i;
	//    2    2:aload_0         
	//    3    3:getfield        #50  <Field boolean i>
	//    4    6:istore_1        
		this;
	//    5    7:aload_0         
		JVM INSTR monitorexit ;
	//    6    8:monitorexit     
		return flag;
	//    7    9:iload_1         
	//    8   10:ireturn         
		Exception exception;
		exception;
	//    9   11:astore_2        
		this;
	//   10   12:aload_0         
		JVM INSTR monitorexit ;
	//   11   13:monitorexit     
		throw exception;
	//   12   14:aload_2         
	//   13   15:athrow          
	}

	protected final void finalize()
	{
		if(j && d.length > 0 && !e())
	//*   0    0:aload_0         
	//*   1    1:getfield        #52  <Field boolean j>
	//*   2    4:ifeq            82
	//*   3    7:aload_0         
	//*   4    8:getfield        #58  <Field CursorWindow[] d>
	//*   5   11:arraylength     
	//*   6   12:ifle            82
	//*   7   15:aload_0         
	//*   8   16:invokevirtual   #102 <Method boolean e()>
	//*   9   19:ifne            82
		{
			close();
	//   10   22:aload_0         
	//   11   23:invokevirtual   #313 <Method void close()>
			String s = ((Object)this).toString();
	//   12   26:aload_0         
	//   13   27:invokevirtual   #316 <Method String Object.toString()>
	//   14   30:astore_1        
			StringBuilder stringbuilder = new StringBuilder(String.valueOf(((Object) (s))).length() + 178);
	//   15   31:new             #167 <Class StringBuilder>
	//   16   34:dup             
	//   17   35:aload_1         
	//   18   36:invokestatic    #120 <Method String String.valueOf(Object)>
	//   19   39:invokevirtual   #124 <Method int String.length()>
	//   20   42:sipush          178
	//   21   45:iadd            
	//   22   46:invokespecial   #170 <Method void StringBuilder(int)>
	//   23   49:astore_2        
			stringbuilder.append("Internal data leak within a DataBuffer object detected!  Be sure to explicitly call release() on all DataBuffer extending objects when you are done with them. (internal object: ");
	//   24   50:aload_2         
	//   25   51:ldc2            #318 <String "Internal data leak within a DataBuffer object detected!  Be sure to explicitly call release() on all DataBuffer extending objects when you are done with them. (internal object: ">
	//   26   54:invokevirtual   #176 <Method StringBuilder StringBuilder.append(String)>
	//   27   57:pop             
			stringbuilder.append(s);
	//   28   58:aload_2         
	//   29   59:aload_1         
	//   30   60:invokevirtual   #176 <Method StringBuilder StringBuilder.append(String)>
	//   31   63:pop             
			stringbuilder.append(")");
	//   32   64:aload_2         
	//   33   65:ldc1            #181 <String ")">
	//   34   67:invokevirtual   #176 <Method StringBuilder StringBuilder.append(String)>
	//   35   70:pop             
			Log.e("DataBuffer", stringbuilder.toString());
	//   36   71:ldc2            #320 <String "DataBuffer">
	//   37   74:aload_2         
	//   38   75:invokevirtual   #187 <Method String StringBuilder.toString()>
	//   39   78:invokestatic    #199 <Method int Log.e(String, String)>
	//   40   81:pop             
		}
		((Object)this).finalize();
	//   41   82:aload_0         
	//   42   83:invokespecial   #322 <Method void Object.finalize()>
		return;
	//   43   86:return          
		Exception exception;
		exception;
	//   44   87:astore_1        
		((Object)this).finalize();
	//   45   88:aload_0         
	//   46   89:invokespecial   #322 <Method void Object.finalize()>
		throw exception;
	//   47   92:aload_1         
	//   48   93:athrow          
	}

	public final void writeToParcel(Parcel parcel, int l)
	{
		int i1 = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #329 <Method int c.a(Parcel)>
	//    2    4:istore_3        
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1, b, false);
	//    3    5:aload_1         
	//    4    6:iconst_1        
	//    5    7:aload_0         
	//    6    8:getfield        #56  <Field String[] b>
	//    7   11:iconst_0        
	//    8   12:invokestatic    #332 <Method void c.a(Parcel, int, String[], boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 2, ((android.os.Parcelable []) (d)), l, false);
	//    9   15:aload_1         
	//   10   16:iconst_2        
	//   11   17:aload_0         
	//   12   18:getfield        #58  <Field CursorWindow[] d>
	//   13   21:iload_2         
	//   14   22:iconst_0        
	//   15   23:invokestatic    #335 <Method void c.a(Parcel, int, android.os.Parcelable[], int, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 3, b());
	//   16   26:aload_1         
	//   17   27:iconst_3        
	//   18   28:aload_0         
	//   19   29:invokevirtual   #337 <Method int b()>
	//   20   32:invokestatic    #340 <Method void c.a(Parcel, int, int)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 4, c(), false);
	//   21   35:aload_1         
	//   22   36:iconst_4        
	//   23   37:aload_0         
	//   24   38:invokevirtual   #342 <Method Bundle c()>
	//   25   41:iconst_0        
	//   26   42:invokestatic    #345 <Method void c.a(Parcel, int, Bundle, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1000, a);
	//   27   45:aload_1         
	//   28   46:sipush          1000
	//   29   49:aload_0         
	//   30   50:getfield        #54  <Field int a>
	//   31   53:invokestatic    #340 <Method void c.a(Parcel, int, int)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, i1);
	//   32   56:aload_1         
	//   33   57:iload_3         
	//   34   58:invokestatic    #347 <Method void c.a(Parcel, int)>
		if((l & 1) != 0)
	//*  35   61:iload_2         
	//*  36   62:iconst_1        
	//*  37   63:iand            
	//*  38   64:ifeq            71
			close();
	//   39   67:aload_0         
	//   40   68:invokevirtual   #313 <Method void close()>
	//   41   71:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new i();
	private static final e k = new h(new String[0], ((String) (null)));
	private final int a;
	private final String b[];
	private Bundle c;
	private final CursorWindow d[];
	private final int e;
	private final Bundle f;
	private int g[];
	private int h;
	private boolean i;
	private boolean j;

	static 
	{
	//    0    0:new             #31  <Class i>
	//    1    3:dup             
	//    2    4:invokespecial   #34  <Method void i()>
	//    3    7:putstatic       #36  <Field android.os.Parcelable$Creator CREATOR>
	//    4   10:new             #38  <Class h>
	//    5   13:dup             
	//    6   14:iconst_0        
	//    7   15:anewarray       String[]
	//    8   18:aconst_null     
	//    9   19:invokespecial   #43  <Method void h(String[], String)>
	//   10   22:putstatic       #45  <Field e k>
	//*  11   25:return          
	}
}
