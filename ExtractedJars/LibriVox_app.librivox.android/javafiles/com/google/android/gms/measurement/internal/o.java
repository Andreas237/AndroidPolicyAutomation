// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.*;
import android.os.Parcel;
import android.os.SystemClock;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.util.e;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.gms.measurement.internal:
//			dq, p, bt, s, 
//			u, zzag, zzfu, zzo, 
//			eo, ax, a, cd, 
//			m, cv, cr, du, 
//			b, q, as, ae, 
//			ew, eu

public final class o extends dq
{

	o(ax ax)
	{
		super(ax);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #12  <Method void dq(ax)>
	//    3    5:aload_0         
	//    4    6:new             #14  <Class p>
	//    5    9:dup             
	//    6   10:aload_0         
	//    7   11:aload_0         
	//    8   12:invokevirtual   #20  <Method Context bt.n()>
	//    9   15:ldc1            #22  <String "google_app_measurement_local.db">
	//   10   17:invokespecial   #25  <Method void p(o, Context, String)>
	//   11   20:putfield        #27  <Field p a>
	//   12   23:return          
	}

	private final boolean a(int i1, byte abyte0[])
	{
		int j1;
		int k1;
		ContentValues contentvalues;
		((bt)this).b();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #38  <Method void com.google.android.gms.measurement.internal.bt.b()>
		((bt)this).d();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #41  <Method void bt.d()>
		if(b)
	//*   4    8:aload_0         
	//*   5    9:getfield        #43  <Field boolean b>
	//*   6   12:ifeq            17
			return false;
	//    7   15:iconst_0        
	//    8   16:ireturn         
		contentvalues = new ContentValues();
	//    9   17:new             #45  <Class ContentValues>
	//   10   20:dup             
	//   11   21:invokespecial   #47  <Method void ContentValues()>
	//   12   24:astore          14
		contentvalues.put("type", Integer.valueOf(i1));
	//   13   26:aload           14
	//   14   28:ldc1            #49  <String "type">
	//   15   30:iload_1         
	//   16   31:invokestatic    #55  <Method Integer Integer.valueOf(int)>
	//   17   34:invokevirtual   #59  <Method void ContentValues.put(String, Integer)>
		contentvalues.put("entry", abyte0);
	//   18   37:aload           14
	//   19   39:ldc1            #61  <String "entry">
	//   20   41:aload_2         
	//   21   42:invokevirtual   #64  <Method void ContentValues.put(String, byte[])>
		j1 = 0;
	//   22   45:iconst_0        
	//   23   46:istore_3        
		k1 = 5;
	//   24   47:iconst_5        
	//   25   48:istore          4
_L7:
		if(j1 >= 5) goto _L2; else goto _L1
	//   26   50:iload_3         
	//   27   51:iconst_5        
	//   28   52:icmpge          570
_L1:
		Object obj;
		Object obj2;
		Object obj4;
		Object obj5;
		obj5 = null;
	//   29   55:aconst_null     
	//   30   56:astore          13
		obj4 = null;
	//   31   58:aconst_null     
	//   32   59:astore          12
		obj2 = null;
	//   33   61:aconst_null     
	//   34   62:astore          10
		obj = null;
	//   35   64:aconst_null     
	//   36   65:astore          9
		abyte0 = ((byte []) (y()));
	//   37   67:aload_0         
	//   38   68:invokespecial   #68  <Method SQLiteDatabase y()>
	//   39   71:astore_2        
		Object obj3;
		if(abyte0 != null)
			break MISSING_BLOCK_LABEL_98;
	//   40   72:aload_2         
	//   41   73:ifnonnull       98
		obj3 = obj2;
	//   42   76:aload           10
	//   43   78:astore          11
		obj = ((Object) (abyte0));
	//   44   80:aload_2         
	//   45   81:astore          9
		b = true;
	//   46   83:aload_0         
	//   47   84:iconst_1        
	//   48   85:putfield        #43  <Field boolean b>
		if(abyte0 != null)
	//*  49   88:aload_2         
	//*  50   89:ifnull          96
			((SQLiteDatabase) (abyte0)).close();
	//   51   92:aload_2         
	//   52   93:invokevirtual   #73  <Method void SQLiteDatabase.close()>
		return false;
	//   53   96:iconst_0        
	//   54   97:ireturn         
		obj3 = obj2;
	//   55   98:aload           10
	//   56  100:astore          11
		obj = ((Object) (abyte0));
	//   57  102:aload_2         
	//   58  103:astore          9
		((SQLiteDatabase) (abyte0)).beginTransaction();
	//   59  105:aload_2         
	//   60  106:invokevirtual   #76  <Method void SQLiteDatabase.beginTransaction()>
		long l2;
		l2 = 0L;
	//   61  109:lconst_0        
	//   62  110:lstore          7
		obj3 = obj2;
	//   63  112:aload           10
	//   64  114:astore          11
		obj = ((Object) (abyte0));
	//   65  116:aload_2         
	//   66  117:astore          9
		obj2 = ((Object) (((SQLiteDatabase) (abyte0)).rawQuery("select count(1) from messages", ((String []) (null)))));
	//   67  119:aload_2         
	//   68  120:ldc1            #78  <String "select count(1) from messages">
	//   69  122:aconst_null     
	//   70  123:invokevirtual   #82  <Method Cursor SQLiteDatabase.rawQuery(String, String[])>
	//   71  126:astore          10
		long l1;
		l1 = l2;
	//   72  128:lload           7
	//   73  130:lstore          5
		if(obj2 == null)
			break MISSING_BLOCK_LABEL_164;
	//   74  132:aload           10
	//   75  134:ifnull          164
		l1 = l2;
	//   76  137:lload           7
	//   77  139:lstore          5
		if(((Cursor) (obj2)).moveToFirst())
	//*  78  141:aload           10
	//*  79  143:invokeinterface #88  <Method boolean Cursor.moveToFirst()>
	//*  80  148:ifeq            164
			l1 = ((Cursor) (obj2)).getLong(0);
	//   81  151:aload           10
	//   82  153:iconst_0        
	//   83  154:invokeinterface #92  <Method long Cursor.getLong(int)>
	//   84  159:lstore          5
	//*  85  161:goto            164
		if(l1 < 0x186a0L)
			break MISSING_BLOCK_LABEL_256;
	//   86  164:lload           5
	//   87  166:ldc2w           #93  <Long 0x186a0L>
	//   88  169:lcmp            
	//   89  170:iflt            256
		((bt)this).r().u_().a("Data loss, local db full");
	//   90  173:aload_0         
	//   91  174:invokevirtual   #98  <Method s bt.r()>
	//   92  177:invokevirtual   #104 <Method u s.u_()>
	//   93  180:ldc1            #106 <String "Data loss, local db full">
	//   94  182:invokevirtual   #111 <Method void u.a(String)>
		l1 = (0x186a0L - l1) + 1L;
	//   95  185:ldc2w           #93  <Long 0x186a0L>
	//   96  188:lload           5
	//   97  190:lsub            
	//   98  191:lconst_1        
	//   99  192:ladd            
	//  100  193:lstore          5
		l2 = ((SQLiteDatabase) (abyte0)).delete("messages", "rowid in (select rowid from messages order by rowid asc limit ?)", new String[] {
			Long.toString(l1)
		});
	//  101  195:aload_2         
	//  102  196:ldc1            #113 <String "messages">
	//  103  198:ldc1            #115 <String "rowid in (select rowid from messages order by rowid asc limit ?)">
	//  104  200:iconst_1        
	//  105  201:anewarray       String[]
	//  106  204:dup             
	//  107  205:iconst_0        
	//  108  206:lload           5
	//  109  208:invokestatic    #123 <Method String Long.toString(long)>
	//  110  211:aastore         
	//  111  212:invokevirtual   #127 <Method int SQLiteDatabase.delete(String, String, String[])>
	//  112  215:i2l             
	//  113  216:lstore          7
		if(l2 == l1)
			break MISSING_BLOCK_LABEL_256;
	//  114  218:lload           7
	//  115  220:lload           5
	//  116  222:lcmp            
	//  117  223:ifeq            256
		((bt)this).r().u_().a("Different delete count than expected in local db. expected, received, difference", ((Object) (Long.valueOf(l1))), ((Object) (Long.valueOf(l2))), ((Object) (Long.valueOf(l1 - l2))));
	//  118  226:aload_0         
	//  119  227:invokevirtual   #98  <Method s bt.r()>
	//  120  230:invokevirtual   #104 <Method u s.u_()>
	//  121  233:ldc1            #129 <String "Different delete count than expected in local db. expected, received, difference">
	//  122  235:lload           5
	//  123  237:invokestatic    #132 <Method Long Long.valueOf(long)>
	//  124  240:lload           7
	//  125  242:invokestatic    #132 <Method Long Long.valueOf(long)>
	//  126  245:lload           5
	//  127  247:lload           7
	//  128  249:lsub            
	//  129  250:invokestatic    #132 <Method Long Long.valueOf(long)>
	//  130  253:invokevirtual   #135 <Method void u.a(String, Object, Object, Object)>
		((SQLiteDatabase) (abyte0)).insertOrThrow("messages", ((String) (null)), contentvalues);
	//  131  256:aload_2         
	//  132  257:ldc1            #113 <String "messages">
	//  133  259:aconst_null     
	//  134  260:aload           14
	//  135  262:invokevirtual   #139 <Method long SQLiteDatabase.insertOrThrow(String, String, ContentValues)>
	//  136  265:pop2            
		((SQLiteDatabase) (abyte0)).setTransactionSuccessful();
	//  137  266:aload_2         
	//  138  267:invokevirtual   #142 <Method void SQLiteDatabase.setTransactionSuccessful()>
		((SQLiteDatabase) (abyte0)).endTransaction();
	//  139  270:aload_2         
	//  140  271:invokevirtual   #145 <Method void SQLiteDatabase.endTransaction()>
		if(obj2 != null)
	//* 141  274:aload           10
	//* 142  276:ifnull          286
			((Cursor) (obj2)).close();
	//  143  279:aload           10
	//  144  281:invokeinterface #146 <Method void Cursor.close()>
		if(abyte0 != null)
	//* 145  286:aload_2         
	//* 146  287:ifnull          294
			((SQLiteDatabase) (abyte0)).close();
	//  147  290:aload_2         
	//  148  291:invokevirtual   #73  <Method void SQLiteDatabase.close()>
		return true;
	//  149  294:iconst_1        
	//  150  295:ireturn         
	//* 151  296:goto            408
		obj;
	//  152  299:astore          9
		obj2 = null;
	//  153  301:aconst_null     
	//  154  302:astore          10
		  goto _L3
	//* 155  304:goto            334
		obj2;
	//  156  307:astore          10
		  goto _L4
	//* 157  309:goto            465
		obj;
	//  158  312:astore          9
		abyte0 = null;
	//  159  314:aconst_null     
	//  160  315:astore_2        
		obj2 = ((Object) (abyte0));
	//  161  316:aload_2         
	//  162  317:astore          10
		  goto _L5
	//* 163  319:goto            547
		obj3;
	//  164  322:astore          11
		obj2 = null;
	//  165  324:aconst_null     
	//  166  325:astore          10
		abyte0 = ((byte []) (obj));
	//  167  327:aload           9
	//  168  329:astore_2        
		obj = obj3;
	//  169  330:aload           11
	//  170  332:astore          9
_L3:
		if(abyte0 == null)
			break MISSING_BLOCK_LABEL_349;
	//  171  334:aload_2         
	//  172  335:ifnull          349
		if(((SQLiteDatabase) (abyte0)).inTransaction())
	//* 173  338:aload_2         
	//* 174  339:invokevirtual   #149 <Method boolean SQLiteDatabase.inTransaction()>
	//* 175  342:ifeq            349
			((SQLiteDatabase) (abyte0)).endTransaction();
	//  176  345:aload_2         
	//  177  346:invokevirtual   #145 <Method void SQLiteDatabase.endTransaction()>
		((bt)this).r().u_().a("Error writing entry to local database", obj);
	//  178  349:aload_0         
	//  179  350:invokevirtual   #98  <Method s bt.r()>
	//  180  353:invokevirtual   #104 <Method u s.u_()>
	//  181  356:ldc1            #151 <String "Error writing entry to local database">
	//  182  358:aload           9
	//  183  360:invokevirtual   #154 <Method void u.a(String, Object)>
		b = true;
	//  184  363:aload_0         
	//  185  364:iconst_1        
	//  186  365:putfield        #43  <Field boolean b>
		if(obj2 != null)
	//* 187  368:aload           10
	//* 188  370:ifnull          380
			((Cursor) (obj2)).close();
	//  189  373:aload           10
	//  190  375:invokeinterface #146 <Method void Cursor.close()>
		i1 = k1;
	//  191  380:iload           4
	//  192  382:istore_1        
		if(abyte0 != null)
	//* 193  383:aload_2         
	//* 194  384:ifnull          524
		{
			((SQLiteDatabase) (abyte0)).close();
	//  195  387:aload_2         
	//  196  388:invokevirtual   #73  <Method void SQLiteDatabase.close()>
			i1 = k1;
	//  197  391:iload           4
	//  198  393:istore_1        
		}
		  goto _L6
	//* 199  394:goto            524
		obj;
	//  200  397:astore          9
		  goto _L5
	//* 201  399:goto            547
_L8:
		abyte0 = null;
	//  202  402:aconst_null     
	//  203  403:astore_2        
		obj2 = ((Object) (obj5));
	//  204  404:aload           13
	//  205  406:astore          10
_L9:
		l1 = k1;
	//  206  408:iload           4
	//  207  410:i2l             
	//  208  411:lstore          5
		obj3 = obj2;
	//  209  413:aload           10
	//  210  415:astore          11
		obj = ((Object) (abyte0));
	//  211  417:aload_2         
	//  212  418:astore          9
		SystemClock.sleep(l1);
	//  213  420:lload           5
	//  214  422:invokestatic    #160 <Method void SystemClock.sleep(long)>
		k1 += 20;
	//  215  425:iload           4
	//  216  427:bipush          20
	//  217  429:iadd            
	//  218  430:istore          4
		if(obj2 != null)
	//* 219  432:aload           10
	//* 220  434:ifnull          444
			((Cursor) (obj2)).close();
	//  221  437:aload           10
	//  222  439:invokeinterface #146 <Method void Cursor.close()>
		i1 = k1;
	//  223  444:iload           4
	//  224  446:istore_1        
		if(abyte0 != null)
	//* 225  447:aload_2         
	//* 226  448:ifnull          524
		{
			((SQLiteDatabase) (abyte0)).close();
	//  227  451:aload_2         
	//  228  452:invokevirtual   #73  <Method void SQLiteDatabase.close()>
			i1 = k1;
	//  229  455:iload           4
	//  230  457:istore_1        
		}
		  goto _L6
	//* 231  458:goto            524
		obj2;
	//  232  461:astore          10
		abyte0 = null;
	//  233  463:aconst_null     
	//  234  464:astore_2        
_L4:
		obj3 = obj4;
	//  235  465:aload           12
	//  236  467:astore          11
		obj = ((Object) (abyte0));
	//  237  469:aload_2         
	//  238  470:astore          9
		((bt)this).r().u_().a("Error writing entry to local database", obj2);
	//  239  472:aload_0         
	//  240  473:invokevirtual   #98  <Method s bt.r()>
	//  241  476:invokevirtual   #104 <Method u s.u_()>
	//  242  479:ldc1            #151 <String "Error writing entry to local database">
	//  243  481:aload           10
	//  244  483:invokevirtual   #154 <Method void u.a(String, Object)>
		obj3 = obj4;
	//  245  486:aload           12
	//  246  488:astore          11
		obj = ((Object) (abyte0));
	//  247  490:aload_2         
	//  248  491:astore          9
		b = true;
	//  249  493:aload_0         
	//  250  494:iconst_1        
	//  251  495:putfield        #43  <Field boolean b>
		if(obj4 != null)
	//* 252  498:aload           12
	//* 253  500:ifnull          510
			((Cursor) (obj4)).close();
	//  254  503:aload           12
	//  255  505:invokeinterface #146 <Method void Cursor.close()>
		i1 = k1;
	//  256  510:iload           4
	//  257  512:istore_1        
		if(abyte0 != null)
	//* 258  513:aload_2         
	//* 259  514:ifnull          524
		{
			((SQLiteDatabase) (abyte0)).close();
	//  260  517:aload_2         
	//  261  518:invokevirtual   #73  <Method void SQLiteDatabase.close()>
			i1 = k1;
	//  262  521:iload           4
	//  263  523:istore_1        
		}
_L6:
		j1++;
	//  264  524:iload_3         
	//  265  525:iconst_1        
	//  266  526:iadd            
	//  267  527:istore_3        
		k1 = i1;
	//  268  528:iload_1         
	//  269  529:istore          4
		  goto _L7
	//* 270  531:goto            50
		Exception exception;
		exception;
	//  271  534:astore          12
		obj2 = obj3;
	//  272  536:aload           11
	//  273  538:astore          10
		abyte0 = ((byte []) (obj));
	//  274  540:aload           9
	//  275  542:astore_2        
		obj = ((Object) (exception));
	//  276  543:aload           12
	//  277  545:astore          9
_L5:
		if(obj2 != null)
	//* 278  547:aload           10
	//* 279  549:ifnull          559
			((Cursor) (obj2)).close();
	//  280  552:aload           10
	//  281  554:invokeinterface #146 <Method void Cursor.close()>
		if(abyte0 != null)
	//* 282  559:aload_2         
	//* 283  560:ifnull          567
			((SQLiteDatabase) (abyte0)).close();
	//  284  563:aload_2         
	//  285  564:invokevirtual   #73  <Method void SQLiteDatabase.close()>
		throw obj;
	//  286  567:aload           9
	//  287  569:athrow          
_L2:
		((bt)this).r().i().a("Failed to write entry to local database");
	//  288  570:aload_0         
	//  289  571:invokevirtual   #98  <Method s bt.r()>
	//  290  574:invokevirtual   #163 <Method u s.i()>
	//  291  577:ldc1            #165 <String "Failed to write entry to local database">
	//  292  579:invokevirtual   #111 <Method void u.a(String)>
		return false;
	//  293  582:iconst_0        
	//  294  583:ireturn         
		abyte0;
	//  295  584:astore_2        
		  goto _L8
	//* 296  585:goto            402
		Object obj1;
		obj1;
	//  297  588:astore          9
		obj2 = ((Object) (obj5));
	//  298  590:aload           13
	//  299  592:astore          10
		  goto _L9
	//* 300  594:goto            408
		obj1;
	//  301  597:astore          9
		  goto _L9
	//* 302  599:goto            296
		obj1;
	//  303  602:astore          9
		  goto _L5
	//* 304  604:goto            547
		obj1;
	//  305  607:astore          9
		  goto _L3
	//* 306  609:goto            304
		obj1;
	//  307  612:astore          9
		exception = ((Exception) (obj2));
	//  308  614:aload           10
	//  309  616:astore          12
		obj2 = obj1;
	//  310  618:aload           9
	//  311  620:astore          10
		  goto _L4
	//* 312  622:goto            465
	}

	private final SQLiteDatabase y()
	{
		if(b)
	//*   0    0:aload_0         
	//*   1    1:getfield        #43  <Field boolean b>
	//*   2    4:ifeq            9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		SQLiteDatabase sqlitedatabase = a.getWritableDatabase();
	//    5    9:aload_0         
	//    6   10:getfield        #27  <Field p a>
	//    7   13:invokevirtual   #168 <Method SQLiteDatabase p.getWritableDatabase()>
	//    8   16:astore_1        
		if(sqlitedatabase == null)
	//*   9   17:aload_1         
	//*  10   18:ifnonnull       28
		{
			b = true;
	//   11   21:aload_0         
	//   12   22:iconst_1        
	//   13   23:putfield        #43  <Field boolean b>
			return null;
	//   14   26:aconst_null     
	//   15   27:areturn         
		} else
		{
			return sqlitedatabase;
	//   16   28:aload_1         
	//   17   29:areturn         
		}
	}

	public final List a(int i1)
	{
		int j1;
		ArrayList arraylist;
		((bt)this).d();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #41  <Method void bt.d()>
		((bt)this).b();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #38  <Method void com.google.android.gms.measurement.internal.bt.b()>
		if(b)
	//*   4    8:aload_0         
	//*   5    9:getfield        #43  <Field boolean b>
	//*   6   12:ifeq            17
			return null;
	//    7   15:aconst_null     
	//    8   16:areturn         
		arraylist = new ArrayList();
	//    9   17:new             #173 <Class ArrayList>
	//   10   20:dup             
	//   11   21:invokespecial   #174 <Method void ArrayList()>
	//   12   24:astore          14
		if(!((bt)this).n().getDatabasePath("google_app_measurement_local.db").exists())
	//*  13   26:aload_0         
	//*  14   27:invokevirtual   #20  <Method Context bt.n()>
	//*  15   30:ldc1            #22  <String "google_app_measurement_local.db">
	//*  16   32:invokevirtual   #180 <Method File Context.getDatabasePath(String)>
	//*  17   35:invokevirtual   #185 <Method boolean File.exists()>
	//*  18   38:ifne            44
			return ((List) (arraylist));
	//   19   41:aload           14
	//   20   43:areturn         
		i1 = 0;
	//   21   44:iconst_0        
	//   22   45:istore_1        
		j1 = 5;
	//   23   46:iconst_5        
	//   24   47:istore_2        
_L30:
		Object obj;
		Object obj5;
		obj5 = null;
	//   25   48:aconst_null     
	//   26   49:astore          12
		obj = null;
	//   27   51:aconst_null     
	//   28   52:astore          8
		if(i1 >= 5) goto _L2; else goto _L1
	//   29   54:iload_1         
	//   30   55:iconst_5        
	//   31   56:icmpge          1290
_L1:
		Object obj2 = ((Object) (y()));
	//   32   59:aload_0         
	//   33   60:invokespecial   #68  <Method SQLiteDatabase y()>
	//   34   63:astore          10
		Object obj1 = obj2;
	//   35   65:aload           10
	//   36   67:astore          9
		if(obj1 != null) goto _L4; else goto _L3
	//   37   69:aload           9
	//   38   71:ifnonnull       112
_L3:
		Object obj4 = obj1;
	//   39   74:aload           9
	//   40   76:astore          11
		b = true;
	//   41   78:aload_0         
	//   42   79:iconst_1        
	//   43   80:putfield        #43  <Field boolean b>
		if(obj1 != null)
	//*  44   83:aload           9
	//*  45   85:ifnull          93
			((SQLiteDatabase) (obj1)).close();
	//   46   88:aload           9
	//   47   90:invokevirtual   #73  <Method void SQLiteDatabase.close()>
		return null;
	//   48   93:aconst_null     
	//   49   94:areturn         
		Object obj6;
		obj6;
	//   50   95:astore          13
		obj2 = null;
	//   51   97:aconst_null     
	//   52   98:astore          10
		obj = obj1;
	//   53  100:aload           9
	//   54  102:astore          8
		  goto _L5
	//*  55  104:goto            1002
		obj2;
	//   56  107:astore          10
		  goto _L6
	//*  57  109:goto            1184
_L4:
		((SQLiteDatabase) (obj1)).beginTransaction();
	//   58  112:aload           9
	//   59  114:invokevirtual   #76  <Method void SQLiteDatabase.beginTransaction()>
		obj4 = ((Object) (Integer.toString(100)));
	//   60  117:bipush          100
	//   61  119:invokestatic    #188 <Method String Integer.toString(int)>
	//   62  122:astore          11
		obj = obj1;
	//   63  124:aload           9
	//   64  126:astore          8
		obj1 = ((Object) (((SQLiteDatabase) (obj1)).query("messages", new String[] {
			"rowid", "type", "entry"
		}, ((String) (null)), ((String []) (null)), ((String) (null)), ((String) (null)), "rowid asc", ((String) (obj4)))));
	//   65  128:aload           9
	//   66  130:ldc1            #113 <String "messages">
	//   67  132:iconst_3        
	//   68  133:anewarray       String[]
	//   69  136:dup             
	//   70  137:iconst_0        
	//   71  138:ldc1            #190 <String "rowid">
	//   72  140:aastore         
	//   73  141:dup             
	//   74  142:iconst_1        
	//   75  143:ldc1            #49  <String "type">
	//   76  145:aastore         
	//   77  146:dup             
	//   78  147:iconst_2        
	//   79  148:ldc1            #61  <String "entry">
	//   80  150:aastore         
	//   81  151:aconst_null     
	//   82  152:aconst_null     
	//   83  153:aconst_null     
	//   84  154:aconst_null     
	//   85  155:ldc1            #192 <String "rowid asc">
	//   86  157:aload           11
	//   87  159:invokevirtual   #196 <Method Cursor SQLiteDatabase.query(String, String[], String, String[], String, String, String, String)>
	//   88  162:astore          9
		long l1 = -1L;
	//   89  164:ldc2w           #197 <Long -1L>
	//   90  167:lstore          4
_L12:
		obj5 = obj;
	//   91  169:aload           8
	//   92  171:astore          12
		obj4 = obj1;
	//   93  173:aload           9
	//   94  175:astore          11
		if(!((Cursor) (obj1)).moveToNext()) goto _L8; else goto _L7
	//   95  177:aload           9
	//   96  179:invokeinterface #201 <Method boolean Cursor.moveToNext()>
	//   97  184:ifeq            739
_L7:
		obj5 = obj;
	//   98  187:aload           8
	//   99  189:astore          12
		obj4 = obj1;
	//  100  191:aload           9
	//  101  193:astore          11
		long l2 = ((Cursor) (obj1)).getLong(0);
	//  102  195:aload           9
	//  103  197:iconst_0        
	//  104  198:invokeinterface #92  <Method long Cursor.getLong(int)>
	//  105  203:lstore          6
		obj5 = obj;
	//  106  205:aload           8
	//  107  207:astore          12
		obj4 = obj1;
	//  108  209:aload           9
	//  109  211:astore          11
		int k1 = ((Cursor) (obj1)).getInt(1);
	//  110  213:aload           9
	//  111  215:iconst_1        
	//  112  216:invokeinterface #205 <Method int Cursor.getInt(int)>
	//  113  221:istore_3        
		obj5 = obj;
	//  114  222:aload           8
	//  115  224:astore          12
		obj4 = obj1;
	//  116  226:aload           9
	//  117  228:astore          11
		byte abyte0[] = ((Cursor) (obj1)).getBlob(2);
	//  118  230:aload           9
	//  119  232:iconst_2        
	//  120  233:invokeinterface #209 <Method byte[] Cursor.getBlob(int)>
	//  121  238:astore          15
		if(k1 != 0) goto _L10; else goto _L9
	//  122  240:iload_3         
	//  123  241:ifne            397
_L9:
		obj5 = obj;
	//  124  244:aload           8
	//  125  246:astore          12
		obj4 = obj1;
	//  126  248:aload           9
	//  127  250:astore          11
		obj2 = ((Object) (Parcel.obtain()));
	//  128  252:invokestatic    #215 <Method Parcel Parcel.obtain()>
	//  129  255:astore          10
		((Parcel) (obj2)).unmarshall(abyte0, 0, abyte0.length);
	//  130  257:aload           10
	//  131  259:aload           15
	//  132  261:iconst_0        
	//  133  262:aload           15
	//  134  264:arraylength     
	//  135  265:invokevirtual   #219 <Method void Parcel.unmarshall(byte[], int, int)>
		((Parcel) (obj2)).setDataPosition(0);
	//  136  268:aload           10
	//  137  270:iconst_0        
	//  138  271:invokevirtual   #223 <Method void Parcel.setDataPosition(int)>
		obj6 = ((Object) ((zzag)zzag.CREATOR.createFromParcel(((Parcel) (obj2)))));
	//  139  274:getstatic       #229 <Field android.os.Parcelable$Creator zzag.CREATOR>
	//  140  277:aload           10
	//  141  279:invokeinterface #235 <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
	//  142  284:checkcast       #225 <Class zzag>
	//  143  287:astore          13
		obj5 = obj;
	//  144  289:aload           8
	//  145  291:astore          12
		obj4 = obj1;
	//  146  293:aload           9
	//  147  295:astore          11
		((Parcel) (obj2)).recycle();
	//  148  297:aload           10
	//  149  299:invokevirtual   #238 <Method void Parcel.recycle()>
		l1 = l2;
	//  150  302:lload           6
	//  151  304:lstore          4
		if(obj6 == null) goto _L12; else goto _L11
	//  152  306:aload           13
	//  153  308:ifnull          169
_L11:
		obj5 = obj;
	//  154  311:aload           8
	//  155  313:astore          12
		obj4 = obj1;
	//  156  315:aload           9
	//  157  317:astore          11
		((List) (arraylist)).add(obj6);
	//  158  319:aload           14
	//  159  321:aload           13
	//  160  323:invokeinterface #244 <Method boolean List.add(Object)>
	//  161  328:pop             
		l1 = l2;
	//  162  329:lload           6
	//  163  331:lstore          4
		  goto _L12
	//* 164  333:goto            169
		obj6;
	//  165  336:astore          13
		  goto _L13
	//* 166  338:goto            373
_L34:
		((bt)this).r().u_().a("Failed to load event from local database");
	//  167  341:aload_0         
	//  168  342:invokevirtual   #98  <Method s bt.r()>
	//  169  345:invokevirtual   #104 <Method u s.u_()>
	//  170  348:ldc1            #246 <String "Failed to load event from local database">
	//  171  350:invokevirtual   #111 <Method void u.a(String)>
		obj5 = obj;
	//  172  353:aload           8
	//  173  355:astore          12
		obj4 = obj1;
	//  174  357:aload           9
	//  175  359:astore          11
		((Parcel) (obj2)).recycle();
	//  176  361:aload           10
	//  177  363:invokevirtual   #238 <Method void Parcel.recycle()>
		l1 = l2;
	//  178  366:lload           6
	//  179  368:lstore          4
		  goto _L12
	//* 180  370:goto            169
_L13:
		obj5 = obj;
	//  181  373:aload           8
	//  182  375:astore          12
		obj4 = obj1;
	//  183  377:aload           9
	//  184  379:astore          11
		((Parcel) (obj2)).recycle();
	//  185  381:aload           10
	//  186  383:invokevirtual   #238 <Method void Parcel.recycle()>
		obj5 = obj;
	//  187  386:aload           8
	//  188  388:astore          12
		obj4 = obj1;
	//  189  390:aload           9
	//  190  392:astore          11
		throw obj6;
	//  191  394:aload           13
	//  192  396:athrow          
_L10:
		if(k1 != 1) goto _L15; else goto _L14
	//  193  397:iload_3         
	//  194  398:iconst_1        
	//  195  399:icmpne          554
_L14:
		obj5 = obj;
	//  196  402:aload           8
	//  197  404:astore          12
		obj4 = obj1;
	//  198  406:aload           9
	//  199  408:astore          11
		obj6 = ((Object) (Parcel.obtain()));
	//  200  410:invokestatic    #215 <Method Parcel Parcel.obtain()>
	//  201  413:astore          13
		((Parcel) (obj6)).unmarshall(abyte0, 0, abyte0.length);
	//  202  415:aload           13
	//  203  417:aload           15
	//  204  419:iconst_0        
	//  205  420:aload           15
	//  206  422:arraylength     
	//  207  423:invokevirtual   #219 <Method void Parcel.unmarshall(byte[], int, int)>
		((Parcel) (obj6)).setDataPosition(0);
	//  208  426:aload           13
	//  209  428:iconst_0        
	//  210  429:invokevirtual   #223 <Method void Parcel.setDataPosition(int)>
		obj2 = ((Object) ((zzfu)zzfu.CREATOR.createFromParcel(((Parcel) (obj6)))));
	//  211  432:getstatic       #249 <Field android.os.Parcelable$Creator zzfu.CREATOR>
	//  212  435:aload           13
	//  213  437:invokeinterface #235 <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
	//  214  442:checkcast       #248 <Class zzfu>
	//  215  445:astore          10
		obj5 = obj;
	//  216  447:aload           8
	//  217  449:astore          12
		obj4 = obj1;
	//  218  451:aload           9
	//  219  453:astore          11
		((Parcel) (obj6)).recycle();
	//  220  455:aload           13
	//  221  457:invokevirtual   #238 <Method void Parcel.recycle()>
		  goto _L16
	//* 222  460:goto            496
		obj2;
	//  223  463:astore          10
		  goto _L17
	//* 224  465:goto            530
_L35:
		((bt)this).r().u_().a("Failed to load user property from local database");
	//  225  468:aload_0         
	//  226  469:invokevirtual   #98  <Method s bt.r()>
	//  227  472:invokevirtual   #104 <Method u s.u_()>
	//  228  475:ldc1            #251 <String "Failed to load user property from local database">
	//  229  477:invokevirtual   #111 <Method void u.a(String)>
		obj5 = obj;
	//  230  480:aload           8
	//  231  482:astore          12
		obj4 = obj1;
	//  232  484:aload           9
	//  233  486:astore          11
		((Parcel) (obj6)).recycle();
	//  234  488:aload           13
	//  235  490:invokevirtual   #238 <Method void Parcel.recycle()>
		obj2 = null;
	//  236  493:aconst_null     
	//  237  494:astore          10
_L16:
		l1 = l2;
	//  238  496:lload           6
	//  239  498:lstore          4
		if(obj2 == null) goto _L12; else goto _L18
	//  240  500:aload           10
	//  241  502:ifnull          169
_L18:
		obj5 = obj;
	//  242  505:aload           8
	//  243  507:astore          12
		obj4 = obj1;
	//  244  509:aload           9
	//  245  511:astore          11
		((List) (arraylist)).add(obj2);
	//  246  513:aload           14
	//  247  515:aload           10
	//  248  517:invokeinterface #244 <Method boolean List.add(Object)>
	//  249  522:pop             
		l1 = l2;
	//  250  523:lload           6
	//  251  525:lstore          4
		  goto _L12
	//* 252  527:goto            169
_L17:
		obj5 = obj;
	//  253  530:aload           8
	//  254  532:astore          12
		obj4 = obj1;
	//  255  534:aload           9
	//  256  536:astore          11
		((Parcel) (obj6)).recycle();
	//  257  538:aload           13
	//  258  540:invokevirtual   #238 <Method void Parcel.recycle()>
		obj5 = obj;
	//  259  543:aload           8
	//  260  545:astore          12
		obj4 = obj1;
	//  261  547:aload           9
	//  262  549:astore          11
		throw obj2;
	//  263  551:aload           10
	//  264  553:athrow          
_L15:
		if(k1 != 2) goto _L20; else goto _L19
	//  265  554:iload_3         
	//  266  555:iconst_2        
	//  267  556:icmpne          711
_L19:
		obj5 = obj;
	//  268  559:aload           8
	//  269  561:astore          12
		obj4 = obj1;
	//  270  563:aload           9
	//  271  565:astore          11
		obj6 = ((Object) (Parcel.obtain()));
	//  272  567:invokestatic    #215 <Method Parcel Parcel.obtain()>
	//  273  570:astore          13
		((Parcel) (obj6)).unmarshall(abyte0, 0, abyte0.length);
	//  274  572:aload           13
	//  275  574:aload           15
	//  276  576:iconst_0        
	//  277  577:aload           15
	//  278  579:arraylength     
	//  279  580:invokevirtual   #219 <Method void Parcel.unmarshall(byte[], int, int)>
		((Parcel) (obj6)).setDataPosition(0);
	//  280  583:aload           13
	//  281  585:iconst_0        
	//  282  586:invokevirtual   #223 <Method void Parcel.setDataPosition(int)>
		obj2 = ((Object) ((zzo)zzo.CREATOR.createFromParcel(((Parcel) (obj6)))));
	//  283  589:getstatic       #254 <Field android.os.Parcelable$Creator zzo.CREATOR>
	//  284  592:aload           13
	//  285  594:invokeinterface #235 <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
	//  286  599:checkcast       #253 <Class zzo>
	//  287  602:astore          10
		obj5 = obj;
	//  288  604:aload           8
	//  289  606:astore          12
		obj4 = obj1;
	//  290  608:aload           9
	//  291  610:astore          11
		((Parcel) (obj6)).recycle();
	//  292  612:aload           13
	//  293  614:invokevirtual   #238 <Method void Parcel.recycle()>
		  goto _L21
	//* 294  617:goto            653
		obj2;
	//  295  620:astore          10
		  goto _L22
	//* 296  622:goto            687
_L36:
		((bt)this).r().u_().a("Failed to load user property from local database");
	//  297  625:aload_0         
	//  298  626:invokevirtual   #98  <Method s bt.r()>
	//  299  629:invokevirtual   #104 <Method u s.u_()>
	//  300  632:ldc1            #251 <String "Failed to load user property from local database">
	//  301  634:invokevirtual   #111 <Method void u.a(String)>
		obj5 = obj;
	//  302  637:aload           8
	//  303  639:astore          12
		obj4 = obj1;
	//  304  641:aload           9
	//  305  643:astore          11
		((Parcel) (obj6)).recycle();
	//  306  645:aload           13
	//  307  647:invokevirtual   #238 <Method void Parcel.recycle()>
		obj2 = null;
	//  308  650:aconst_null     
	//  309  651:astore          10
_L21:
		l1 = l2;
	//  310  653:lload           6
	//  311  655:lstore          4
		if(obj2 == null) goto _L12; else goto _L23
	//  312  657:aload           10
	//  313  659:ifnull          169
_L23:
		obj5 = obj;
	//  314  662:aload           8
	//  315  664:astore          12
		obj4 = obj1;
	//  316  666:aload           9
	//  317  668:astore          11
		((List) (arraylist)).add(obj2);
	//  318  670:aload           14
	//  319  672:aload           10
	//  320  674:invokeinterface #244 <Method boolean List.add(Object)>
	//  321  679:pop             
		l1 = l2;
	//  322  680:lload           6
	//  323  682:lstore          4
		  goto _L12
	//* 324  684:goto            169
_L22:
		obj5 = obj;
	//  325  687:aload           8
	//  326  689:astore          12
		obj4 = obj1;
	//  327  691:aload           9
	//  328  693:astore          11
		((Parcel) (obj6)).recycle();
	//  329  695:aload           13
	//  330  697:invokevirtual   #238 <Method void Parcel.recycle()>
		obj5 = obj;
	//  331  700:aload           8
	//  332  702:astore          12
		obj4 = obj1;
	//  333  704:aload           9
	//  334  706:astore          11
		throw obj2;
	//  335  708:aload           10
	//  336  710:athrow          
_L20:
		obj5 = obj;
	//  337  711:aload           8
	//  338  713:astore          12
		obj4 = obj1;
	//  339  715:aload           9
	//  340  717:astore          11
		((bt)this).r().u_().a("Unknown record type in local database");
	//  341  719:aload_0         
	//  342  720:invokevirtual   #98  <Method s bt.r()>
	//  343  723:invokevirtual   #104 <Method u s.u_()>
	//  344  726:ldc2            #256 <String "Unknown record type in local database">
	//  345  729:invokevirtual   #111 <Method void u.a(String)>
		l1 = l2;
	//  346  732:lload           6
	//  347  734:lstore          4
		  goto _L12
	//* 348  736:goto            169
_L8:
		obj5 = obj;
	//  349  739:aload           8
	//  350  741:astore          12
		obj4 = obj1;
	//  351  743:aload           9
	//  352  745:astore          11
		if(((SQLiteDatabase) (obj)).delete("messages", "rowid <= ?", new String[] {
	Long.toString(l1)
}) >= ((List) (arraylist)).size())
			break MISSING_BLOCK_LABEL_800;
	//  353  747:aload           8
	//  354  749:ldc1            #113 <String "messages">
	//  355  751:ldc2            #258 <String "rowid <= ?">
	//  356  754:iconst_1        
	//  357  755:anewarray       String[]
	//  358  758:dup             
	//  359  759:iconst_0        
	//  360  760:lload           4
	//  361  762:invokestatic    #123 <Method String Long.toString(long)>
	//  362  765:aastore         
	//  363  766:invokevirtual   #127 <Method int SQLiteDatabase.delete(String, String, String[])>
	//  364  769:aload           14
	//  365  771:invokeinterface #262 <Method int List.size()>
	//  366  776:icmpge          800
		obj5 = obj;
	//  367  779:aload           8
	//  368  781:astore          12
		obj4 = obj1;
	//  369  783:aload           9
	//  370  785:astore          11
		((bt)this).r().u_().a("Fewer entries removed from local database than expected");
	//  371  787:aload_0         
	//  372  788:invokevirtual   #98  <Method s bt.r()>
	//  373  791:invokevirtual   #104 <Method u s.u_()>
	//  374  794:ldc2            #264 <String "Fewer entries removed from local database than expected">
	//  375  797:invokevirtual   #111 <Method void u.a(String)>
		obj5 = obj;
	//  376  800:aload           8
	//  377  802:astore          12
		obj4 = obj1;
	//  378  804:aload           9
	//  379  806:astore          11
		((SQLiteDatabase) (obj)).setTransactionSuccessful();
	//  380  808:aload           8
	//  381  810:invokevirtual   #142 <Method void SQLiteDatabase.setTransactionSuccessful()>
		obj5 = obj;
	//  382  813:aload           8
	//  383  815:astore          12
		obj4 = obj1;
	//  384  817:aload           9
	//  385  819:astore          11
		((SQLiteDatabase) (obj)).endTransaction();
	//  386  821:aload           8
	//  387  823:invokevirtual   #145 <Method void SQLiteDatabase.endTransaction()>
		if(obj1 != null)
	//* 388  826:aload           9
	//* 389  828:ifnull          838
			((Cursor) (obj1)).close();
	//  390  831:aload           9
	//  391  833:invokeinterface #146 <Method void Cursor.close()>
		if(obj != null)
	//* 392  838:aload           8
	//* 393  840:ifnull          848
			((SQLiteDatabase) (obj)).close();
	//  394  843:aload           8
	//  395  845:invokevirtual   #73  <Method void SQLiteDatabase.close()>
		return ((List) (arraylist));
	//  396  848:aload           14
	//  397  850:areturn         
		obj6;
	//  398  851:astore          13
		obj2 = obj1;
	//  399  853:aload           9
	//  400  855:astore          10
		  goto _L5
	//* 401  857:goto            1002
_L33:
		obj2 = obj;
	//  402  860:aload           8
	//  403  862:astore          10
		obj = obj1;
	//  404  864:aload           9
	//  405  866:astore          8
		obj1 = obj2;
	//  406  868:aload           10
	//  407  870:astore          9
		  goto _L24
	//* 408  872:goto            1120
		obj2;
	//  409  875:astore          10
		obj4 = obj;
	//  410  877:aload           8
	//  411  879:astore          11
		obj = obj1;
	//  412  881:aload           9
	//  413  883:astore          8
		obj1 = obj4;
	//  414  885:aload           11
	//  415  887:astore          9
		  goto _L6
	//* 416  889:goto            1184
		obj1;
	//  417  892:astore          9
		obj2 = obj;
	//  418  894:aload           8
	//  419  896:astore          10
		  goto _L25
	//* 420  898:goto            972
		obj1;
	//  421  901:astore          9
		  goto _L26
	//* 422  903:goto            995
		obj;
	//  423  906:astore          8
		  goto _L27
	//* 424  908:goto            949
		obj;
	//  425  911:astore          8
		obj2 = obj1;
	//  426  913:aload           9
	//  427  915:astore          10
		obj1 = obj;
	//  428  917:aload           8
	//  429  919:astore          9
		  goto _L25
	//* 430  921:goto            972
		obj2;
	//  431  924:astore          10
		obj = obj1;
	//  432  926:aload           9
	//  433  928:astore          8
		obj1 = obj2;
	//  434  930:aload           10
	//  435  932:astore          9
		  goto _L26
	//* 436  934:goto            995
_L32:
		obj1 = obj2;
	//  437  937:aload           10
	//  438  939:astore          9
		obj = null;
	//  439  941:aconst_null     
	//  440  942:astore          8
		  goto _L24
	//* 441  944:goto            1120
		obj;
	//  442  947:astore          8
_L27:
		obj1 = obj2;
	//  443  949:aload           10
	//  444  951:astore          9
		obj4 = null;
	//  445  953:aconst_null     
	//  446  954:astore          11
		obj2 = obj;
	//  447  956:aload           8
	//  448  958:astore          10
		obj = obj4;
	//  449  960:aload           11
	//  450  962:astore          8
		  goto _L6
	//* 451  964:goto            1184
		obj1;
	//  452  967:astore          9
		obj2 = null;
	//  453  969:aconst_null     
	//  454  970:astore          10
_L25:
		obj4 = null;
	//  455  972:aconst_null     
	//  456  973:astore          11
		obj = obj1;
	//  457  975:aload           9
	//  458  977:astore          8
		obj1 = obj2;
	//  459  979:aload           10
	//  460  981:astore          9
		obj2 = obj4;
	//  461  983:aload           11
	//  462  985:astore          10
		  goto _L28
	//* 463  987:goto            1265
		obj1;
	//  464  990:astore          9
		obj = null;
	//  465  992:aconst_null     
	//  466  993:astore          8
_L26:
		obj2 = null;
	//  467  995:aconst_null     
	//  468  996:astore          10
		obj6 = obj1;
	//  469  998:aload           9
	//  470 1000:astore          13
_L5:
		if(obj == null)
			break MISSING_BLOCK_LABEL_1036;
	//  471 1002:aload           8
	//  472 1004:ifnull          1036
		obj5 = obj;
	//  473 1007:aload           8
	//  474 1009:astore          12
		obj4 = obj2;
	//  475 1011:aload           10
	//  476 1013:astore          11
		if(!((SQLiteDatabase) (obj)).inTransaction())
			break MISSING_BLOCK_LABEL_1036;
	//  477 1015:aload           8
	//  478 1017:invokevirtual   #149 <Method boolean SQLiteDatabase.inTransaction()>
	//  479 1020:ifeq            1036
		obj5 = obj;
	//  480 1023:aload           8
	//  481 1025:astore          12
		obj4 = obj2;
	//  482 1027:aload           10
	//  483 1029:astore          11
		((SQLiteDatabase) (obj)).endTransaction();
	//  484 1031:aload           8
	//  485 1033:invokevirtual   #145 <Method void SQLiteDatabase.endTransaction()>
		obj5 = obj;
	//  486 1036:aload           8
	//  487 1038:astore          12
		obj4 = obj2;
	//  488 1040:aload           10
	//  489 1042:astore          11
		((bt)this).r().u_().a("Error reading entries from local database", obj6);
	//  490 1044:aload_0         
	//  491 1045:invokevirtual   #98  <Method s bt.r()>
	//  492 1048:invokevirtual   #104 <Method u s.u_()>
	//  493 1051:ldc2            #266 <String "Error reading entries from local database">
	//  494 1054:aload           13
	//  495 1056:invokevirtual   #154 <Method void u.a(String, Object)>
		obj5 = obj;
	//  496 1059:aload           8
	//  497 1061:astore          12
		obj4 = obj2;
	//  498 1063:aload           10
	//  499 1065:astore          11
		b = true;
	//  500 1067:aload_0         
	//  501 1068:iconst_1        
	//  502 1069:putfield        #43  <Field boolean b>
		if(obj2 != null)
	//* 503 1072:aload           10
	//* 504 1074:ifnull          1084
			((Cursor) (obj2)).close();
	//  505 1077:aload           10
	//  506 1079:invokeinterface #146 <Method void Cursor.close()>
		k1 = j1;
	//  507 1084:iload_2         
	//  508 1085:istore_3        
		if(obj != null)
	//* 509 1086:aload           8
	//* 510 1088:ifnull          1246
		{
			((SQLiteDatabase) (obj)).close();
	//  511 1091:aload           8
	//  512 1093:invokevirtual   #73  <Method void SQLiteDatabase.close()>
			k1 = j1;
	//  513 1096:iload_2         
	//  514 1097:istore_3        
		}
		  goto _L29
	//* 515 1098:goto            1246
		obj;
	//  516 1101:astore          8
		obj1 = obj5;
	//  517 1103:aload           12
	//  518 1105:astore          9
		obj2 = obj4;
	//  519 1107:aload           11
	//  520 1109:astore          10
		  goto _L28
	//* 521 1111:goto            1265
_L31:
		obj = null;
	//  522 1114:aconst_null     
	//  523 1115:astore          8
		obj1 = null;
	//  524 1117:aconst_null     
	//  525 1118:astore          9
_L24:
		l1 = j1;
	//  526 1120:iload_2         
	//  527 1121:i2l             
	//  528 1122:lstore          4
		SystemClock.sleep(l1);
	//  529 1124:lload           4
	//  530 1126:invokestatic    #160 <Method void SystemClock.sleep(long)>
		j1 += 20;
	//  531 1129:iload_2         
	//  532 1130:bipush          20
	//  533 1132:iadd            
	//  534 1133:istore_2        
		if(obj != null)
	//* 535 1134:aload           8
	//* 536 1136:ifnull          1146
			((Cursor) (obj)).close();
	//  537 1139:aload           8
	//  538 1141:invokeinterface #146 <Method void Cursor.close()>
		k1 = j1;
	//  539 1146:iload_2         
	//  540 1147:istore_3        
		if(obj1 != null)
	//* 541 1148:aload           9
	//* 542 1150:ifnull          1246
		{
			((SQLiteDatabase) (obj1)).close();
	//  543 1153:aload           9
	//  544 1155:invokevirtual   #73  <Method void SQLiteDatabase.close()>
			k1 = j1;
	//  545 1158:iload_2         
	//  546 1159:istore_3        
		}
		  goto _L29
	//* 547 1160:goto            1246
		obj4;
	//  548 1163:astore          11
		obj2 = obj;
	//  549 1165:aload           8
	//  550 1167:astore          10
		obj = obj4;
	//  551 1169:aload           11
	//  552 1171:astore          8
		  goto _L28
	//* 553 1173:goto            1265
		Object obj3;
		obj3;
	//  554 1176:astore          10
		obj = null;
	//  555 1178:aconst_null     
	//  556 1179:astore          8
		obj1 = null;
	//  557 1181:aconst_null     
	//  558 1182:astore          9
_L6:
		obj5 = obj;
	//  559 1184:aload           8
	//  560 1186:astore          12
		obj4 = obj1;
	//  561 1188:aload           9
	//  562 1190:astore          11
		((bt)this).r().u_().a("Error reading entries from local database", obj3);
	//  563 1192:aload_0         
	//  564 1193:invokevirtual   #98  <Method s bt.r()>
	//  565 1196:invokevirtual   #104 <Method u s.u_()>
	//  566 1199:ldc2            #266 <String "Error reading entries from local database">
	//  567 1202:aload           10
	//  568 1204:invokevirtual   #154 <Method void u.a(String, Object)>
		obj5 = obj;
	//  569 1207:aload           8
	//  570 1209:astore          12
		obj4 = obj1;
	//  571 1211:aload           9
	//  572 1213:astore          11
		b = true;
	//  573 1215:aload_0         
	//  574 1216:iconst_1        
	//  575 1217:putfield        #43  <Field boolean b>
		if(obj != null)
	//* 576 1220:aload           8
	//* 577 1222:ifnull          1232
			((Cursor) (obj)).close();
	//  578 1225:aload           8
	//  579 1227:invokeinterface #146 <Method void Cursor.close()>
		k1 = j1;
	//  580 1232:iload_2         
	//  581 1233:istore_3        
		if(obj1 != null)
	//* 582 1234:aload           9
	//* 583 1236:ifnull          1246
		{
			((SQLiteDatabase) (obj1)).close();
	//  584 1239:aload           9
	//  585 1241:invokevirtual   #73  <Method void SQLiteDatabase.close()>
			k1 = j1;
	//  586 1244:iload_2         
	//  587 1245:istore_3        
		}
_L29:
		i1++;
	//  588 1246:iload_1         
	//  589 1247:iconst_1        
	//  590 1248:iadd            
	//  591 1249:istore_1        
		j1 = k1;
	//  592 1250:iload_3         
	//  593 1251:istore_2        
		  goto _L30
	//* 594 1252:goto            48
		obj;
	//  595 1255:astore          8
		obj3 = obj5;
	//  596 1257:aload           12
	//  597 1259:astore          10
		obj1 = obj4;
	//  598 1261:aload           11
	//  599 1263:astore          9
_L28:
		if(obj3 != null)
	//* 600 1265:aload           10
	//* 601 1267:ifnull          1277
			((Cursor) (obj3)).close();
	//  602 1270:aload           10
	//  603 1272:invokeinterface #146 <Method void Cursor.close()>
		if(obj1 != null)
	//* 604 1277:aload           9
	//* 605 1279:ifnull          1287
			((SQLiteDatabase) (obj1)).close();
	//  606 1282:aload           9
	//  607 1284:invokevirtual   #73  <Method void SQLiteDatabase.close()>
		throw obj;
	//  608 1287:aload           8
	//  609 1289:athrow          
_L2:
		((bt)this).r().i().a("Failed to read events from database in reasonable time");
	//  610 1290:aload_0         
	//  611 1291:invokevirtual   #98  <Method s bt.r()>
	//  612 1294:invokevirtual   #163 <Method u s.i()>
	//  613 1297:ldc2            #268 <String "Failed to read events from database in reasonable time">
	//  614 1300:invokevirtual   #111 <Method void u.a(String)>
		return null;
	//  615 1303:aconst_null     
	//  616 1304:areturn         
		SQLiteDatabaseLockedException sqlitedatabaselockedexception;
		sqlitedatabaselockedexception;
	//  617 1305:astore          8
		  goto _L31
	//* 618 1307:goto            1114
		sqlitedatabaselockedexception;
	//  619 1310:astore          8
		  goto _L32
	//* 620 1312:goto            937
		sqlitedatabaselockedexception;
	//  621 1315:astore          8
		  goto _L32
	//* 622 1317:goto            937
		obj3;
	//  623 1320:astore          10
		  goto _L33
	//* 624 1322:goto            860
		b b1;
		b1;
	//  625 1325:astore          11
		  goto _L34
	//* 626 1327:goto            341
		obj3;
	//  627 1330:astore          10
		  goto _L35
	//* 628 1332:goto            468
		obj3;
	//  629 1335:astore          10
		  goto _L36
	//* 630 1337:goto            625
	}

	public final volatile void a()
	{
		super.a();
	//    0    0:aload_0         
	//    1    1:invokespecial   #270 <Method void dq.a()>
	//    2    4:return          
	}

	public final boolean a(zzag zzag1)
	{
		Parcel parcel = Parcel.obtain();
	//    0    0:invokestatic    #215 <Method Parcel Parcel.obtain()>
	//    1    3:astore_2        
		zzag1.writeToParcel(parcel, 0);
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:iconst_0        
	//    5    7:invokevirtual   #275 <Method void zzag.writeToParcel(Parcel, int)>
		zzag1 = ((zzag) (parcel.marshall()));
	//    6   10:aload_2         
	//    7   11:invokevirtual   #279 <Method byte[] Parcel.marshall()>
	//    8   14:astore_1        
		parcel.recycle();
	//    9   15:aload_2         
	//   10   16:invokevirtual   #238 <Method void Parcel.recycle()>
		if(zzag1.length > 0x20000)
	//*  11   19:aload_1         
	//*  12   20:arraylength     
	//*  13   21:ldc2            #280 <Int 0x20000>
	//*  14   24:icmple          42
		{
			((bt)this).r().i().a("Event is too long for local database. Sending event directly to service");
	//   15   27:aload_0         
	//   16   28:invokevirtual   #98  <Method s bt.r()>
	//   17   31:invokevirtual   #163 <Method u s.i()>
	//   18   34:ldc2            #282 <String "Event is too long for local database. Sending event directly to service">
	//   19   37:invokevirtual   #111 <Method void u.a(String)>
			return false;
	//   20   40:iconst_0        
	//   21   41:ireturn         
		} else
		{
			return a(0, ((byte []) (zzag1)));
	//   22   42:aload_0         
	//   23   43:iconst_0        
	//   24   44:aload_1         
	//   25   45:invokespecial   #284 <Method boolean a(int, byte[])>
	//   26   48:ireturn         
		}
	}

	public final boolean a(zzfu zzfu1)
	{
		Parcel parcel = Parcel.obtain();
	//    0    0:invokestatic    #215 <Method Parcel Parcel.obtain()>
	//    1    3:astore_2        
		zzfu1.writeToParcel(parcel, 0);
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:iconst_0        
	//    5    7:invokevirtual   #286 <Method void zzfu.writeToParcel(Parcel, int)>
		zzfu1 = ((zzfu) (parcel.marshall()));
	//    6   10:aload_2         
	//    7   11:invokevirtual   #279 <Method byte[] Parcel.marshall()>
	//    8   14:astore_1        
		parcel.recycle();
	//    9   15:aload_2         
	//   10   16:invokevirtual   #238 <Method void Parcel.recycle()>
		if(zzfu1.length > 0x20000)
	//*  11   19:aload_1         
	//*  12   20:arraylength     
	//*  13   21:ldc2            #280 <Int 0x20000>
	//*  14   24:icmple          42
		{
			((bt)this).r().i().a("User property too long for local database. Sending directly to service");
	//   15   27:aload_0         
	//   16   28:invokevirtual   #98  <Method s bt.r()>
	//   17   31:invokevirtual   #163 <Method u s.i()>
	//   18   34:ldc2            #288 <String "User property too long for local database. Sending directly to service">
	//   19   37:invokevirtual   #111 <Method void u.a(String)>
			return false;
	//   20   40:iconst_0        
	//   21   41:ireturn         
		} else
		{
			return a(1, ((byte []) (zzfu1)));
	//   22   42:aload_0         
	//   23   43:iconst_1        
	//   24   44:aload_1         
	//   25   45:invokespecial   #284 <Method boolean a(int, byte[])>
	//   26   48:ireturn         
		}
	}

	public final boolean a(zzo zzo1)
	{
		((bt)this).p();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #293 <Method eo bt.p()>
	//    2    4:pop             
		zzo1 = ((zzo) (eo.a(((android.os.Parcelable) (zzo1)))));
	//    3    5:aload_1         
	//    4    6:invokestatic    #298 <Method byte[] eo.a(android.os.Parcelable)>
	//    5    9:astore_1        
		if(zzo1.length > 0x20000)
	//*   6   10:aload_1         
	//*   7   11:arraylength     
	//*   8   12:ldc2            #280 <Int 0x20000>
	//*   9   15:icmple          33
		{
			((bt)this).r().i().a("Conditional user property too long for local database. Sending directly to service");
	//   10   18:aload_0         
	//   11   19:invokevirtual   #98  <Method s bt.r()>
	//   12   22:invokevirtual   #163 <Method u s.i()>
	//   13   25:ldc2            #300 <String "Conditional user property too long for local database. Sending directly to service">
	//   14   28:invokevirtual   #111 <Method void u.a(String)>
			return false;
	//   15   31:iconst_0        
	//   16   32:ireturn         
		} else
		{
			return a(2, ((byte []) (zzo1)));
	//   17   33:aload_0         
	//   18   34:iconst_2        
	//   19   35:aload_1         
	//   20   36:invokespecial   #284 <Method boolean a(int, byte[])>
	//   21   39:ireturn         
		}
	}

	public final volatile void b()
	{
		super.b();
	//    0    0:aload_0         
	//    1    1:invokespecial   #301 <Method void com.google.android.gms.measurement.internal.dq.b()>
	//    2    4:return          
	}

	public final volatile void c()
	{
		super.c();
	//    0    0:aload_0         
	//    1    1:invokespecial   #304 <Method void dq.c()>
	//    2    4:return          
	}

	public final volatile void d()
	{
		super.d();
	//    0    0:aload_0         
	//    1    1:invokespecial   #305 <Method void dq.d()>
	//    2    4:return          
	}

	public final volatile a e()
	{
		return super.e();
	//    0    0:aload_0         
	//    1    1:invokespecial   #309 <Method a com.google.android.gms.measurement.internal.dq.e()>
	//    2    4:areturn         
	}

	public final volatile cd f()
	{
		return super.f();
	//    0    0:aload_0         
	//    1    1:invokespecial   #313 <Method cd dq.f()>
	//    2    4:areturn         
	}

	public final volatile m g()
	{
		return super.g();
	//    0    0:aload_0         
	//    1    1:invokespecial   #317 <Method m dq.g()>
	//    2    4:areturn         
	}

	public final volatile cv h()
	{
		return super.h();
	//    0    0:aload_0         
	//    1    1:invokespecial   #321 <Method cv dq.h()>
	//    2    4:areturn         
	}

	public final volatile cr i()
	{
		return super.i();
	//    0    0:aload_0         
	//    1    1:invokespecial   #324 <Method cr dq.i()>
	//    2    4:areturn         
	}

	public final volatile o j()
	{
		return super.j();
	//    0    0:aload_0         
	//    1    1:invokespecial   #328 <Method o dq.j()>
	//    2    4:areturn         
	}

	public final volatile du k()
	{
		return super.k();
	//    0    0:aload_0         
	//    1    1:invokespecial   #332 <Method du dq.k()>
	//    2    4:areturn         
	}

	public final volatile com.google.android.gms.measurement.internal.b l()
	{
		return super.l();
	//    0    0:aload_0         
	//    1    1:invokespecial   #336 <Method com.google.android.gms.measurement.internal.b dq.l()>
	//    2    4:areturn         
	}

	public final volatile e m()
	{
		return super.m();
	//    0    0:aload_0         
	//    1    1:invokespecial   #340 <Method e dq.m()>
	//    2    4:areturn         
	}

	public final volatile Context n()
	{
		return super.n();
	//    0    0:aload_0         
	//    1    1:invokespecial   #341 <Method Context dq.n()>
	//    2    4:areturn         
	}

	public final volatile q o()
	{
		return super.o();
	//    0    0:aload_0         
	//    1    1:invokespecial   #345 <Method q dq.o()>
	//    2    4:areturn         
	}

	public final volatile eo p()
	{
		return super.p();
	//    0    0:aload_0         
	//    1    1:invokespecial   #346 <Method eo dq.p()>
	//    2    4:areturn         
	}

	public final volatile as q()
	{
		return super.q();
	//    0    0:aload_0         
	//    1    1:invokespecial   #350 <Method as dq.q()>
	//    2    4:areturn         
	}

	public final volatile s r()
	{
		return super.r();
	//    0    0:aload_0         
	//    1    1:invokespecial   #351 <Method s dq.r()>
	//    2    4:areturn         
	}

	public final volatile ae s()
	{
		return super.s();
	//    0    0:aload_0         
	//    1    1:invokespecial   #355 <Method ae dq.s()>
	//    2    4:areturn         
	}

	public final volatile ew t()
	{
		return super.t();
	//    0    0:aload_0         
	//    1    1:invokespecial   #359 <Method ew dq.t()>
	//    2    4:areturn         
	}

	public final volatile eu u()
	{
		return super.u();
	//    0    0:aload_0         
	//    1    1:invokespecial   #363 <Method eu dq.u()>
	//    2    4:areturn         
	}

	protected final boolean v()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public final void x()
	{
		((bt)this).b();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #38  <Method void com.google.android.gms.measurement.internal.bt.b()>
		((bt)this).d();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #41  <Method void bt.d()>
		int i1;
		try
		{
			i1 = y().delete("messages", ((String) (null)), ((String []) (null))) + 0;
	//    4    8:aload_0         
	//    5    9:invokespecial   #68  <Method SQLiteDatabase y()>
	//    6   12:ldc1            #113 <String "messages">
	//    7   14:aconst_null     
	//    8   15:aconst_null     
	//    9   16:invokevirtual   #127 <Method int SQLiteDatabase.delete(String, String, String[])>
	//   10   19:iconst_0        
	//   11   20:iadd            
	//   12   21:istore_1        
		}
	//*  13   22:iload_1         
	//*  14   23:ifle            43
	//*  15   26:aload_0         
	//*  16   27:invokevirtual   #98  <Method s bt.r()>
	//*  17   30:invokevirtual   #367 <Method u s.x()>
	//*  18   33:ldc2            #369 <String "Reset local analytics data. records">
	//*  19   36:iload_1         
	//*  20   37:invokestatic    #55  <Method Integer Integer.valueOf(int)>
	//*  21   40:invokevirtual   #154 <Method void u.a(String, Object)>
	//*  22   43:return          
		catch(SQLiteException sqliteexception)
	//*  23   44:astore_2        
		{
			((bt)this).r().u_().a("Error resetting local analytics data. error", ((Object) (sqliteexception)));
	//   24   45:aload_0         
	//   25   46:invokevirtual   #98  <Method s bt.r()>
	//   26   49:invokevirtual   #104 <Method u s.u_()>
	//   27   52:ldc2            #371 <String "Error resetting local analytics data. error">
	//   28   55:aload_2         
	//   29   56:invokevirtual   #154 <Method void u.a(String, Object)>
			return;
	//   30   59:return          
		}
		if(i1 <= 0)
			break MISSING_BLOCK_LABEL_43;
		((bt)this).r().x().a("Reset local analytics data. records", ((Object) (Integer.valueOf(i1))));
	}

	private final p a = new p(this, ((bt)this).n(), "google_app_measurement_local.db");
	private boolean b;
}
