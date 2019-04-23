// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.app;

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.SystemClock;
import android.support.v4.g.p;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v7.graphics.Palette;
import android.util.Log;
import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

// Referenced classes of package android.support.v7.app:
//			MediaRouteControllerDialog

class MediaRouteControllerDialog$FetchArtTask extends AsyncTask
{

	private InputStream openInputStreamByScheme(Uri uri)
	{
		String s = uri.getScheme().toLowerCase();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #67  <Method String Uri.getScheme()>
	//    2    4:invokevirtual   #72  <Method String String.toLowerCase()>
	//    3    7:astore_2        
		if(!"android.resource".equals(((Object) (s))) && !"content".equals(((Object) (s))) && !"file".equals(((Object) (s))))
	//*   4    8:ldc1            #74  <String "android.resource">
	//*   5   10:aload_2         
	//*   6   11:invokevirtual   #78  <Method boolean String.equals(Object)>
	//*   7   14:ifne            75
	//*   8   17:ldc1            #80  <String "content">
	//*   9   19:aload_2         
	//*  10   20:invokevirtual   #78  <Method boolean String.equals(Object)>
	//*  11   23:ifne            75
	//*  12   26:ldc1            #82  <String "file">
	//*  13   28:aload_2         
	//*  14   29:invokevirtual   #78  <Method boolean String.equals(Object)>
	//*  15   32:ifeq            38
	//*  16   35:goto            75
		{
			uri = ((Uri) ((new URL(uri.toString())).openConnection()));
	//   17   38:new             #84  <Class URL>
	//   18   41:dup             
	//   19   42:aload_1         
	//   20   43:invokevirtual   #87  <Method String Uri.toString()>
	//   21   46:invokespecial   #90  <Method void URL(String)>
	//   22   49:invokevirtual   #94  <Method URLConnection URL.openConnection()>
	//   23   52:astore_1        
			((URLConnection) (uri)).setConnectTimeout(MediaRouteControllerDialog.CONNECTION_TIMEOUT_MILLIS);
	//   24   53:aload_1         
	//   25   54:getstatic       #97  <Field int MediaRouteControllerDialog.CONNECTION_TIMEOUT_MILLIS>
	//   26   57:invokevirtual   #103 <Method void URLConnection.setConnectTimeout(int)>
			((URLConnection) (uri)).setReadTimeout(MediaRouteControllerDialog.CONNECTION_TIMEOUT_MILLIS);
	//   27   60:aload_1         
	//   28   61:getstatic       #97  <Field int MediaRouteControllerDialog.CONNECTION_TIMEOUT_MILLIS>
	//   29   64:invokevirtual   #106 <Method void URLConnection.setReadTimeout(int)>
			uri = ((Uri) (((URLConnection) (uri)).getInputStream()));
	//   30   67:aload_1         
	//   31   68:invokevirtual   #110 <Method InputStream URLConnection.getInputStream()>
	//   32   71:astore_1        
		} else
	//*  33   72:goto            90
		{
			uri = ((Uri) (mContext.getContentResolver().openInputStream(uri)));
	//   34   75:aload_0         
	//   35   76:getfield        #21  <Field MediaRouteControllerDialog this$0>
	//   36   79:getfield        #114 <Field Context MediaRouteControllerDialog.mContext>
	//   37   82:invokevirtual   #120 <Method ContentResolver Context.getContentResolver()>
	//   38   85:aload_1         
	//   39   86:invokevirtual   #125 <Method InputStream ContentResolver.openInputStream(Uri)>
	//   40   89:astore_1        
		}
		if(uri == null)
	//*  41   90:aload_1         
	//*  42   91:ifnonnull       96
			return null;
	//   43   94:aconst_null     
	//   44   95:areturn         
		else
			return ((InputStream) (new BufferedInputStream(((InputStream) (uri)))));
	//   45   96:new             #127 <Class BufferedInputStream>
	//   46   99:dup             
	//   47  100:aload_1         
	//   48  101:invokespecial   #130 <Method void BufferedInputStream(InputStream)>
	//   49  104:areturn         
	}

	protected transient Bitmap doInBackground(Void avoid[])
	{
		int i;
		avoid = ((Void []) (mIconBitmap));
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field Bitmap mIconBitmap>
	//    2    4:astore_1        
		i = 0;
	//    3    5:iconst_0        
	//    4    6:istore_2        
		if(avoid == null) goto _L2; else goto _L1
	//    5    7:aload_1         
	//    6    8:ifnull          14
	//*   7   11:goto            563
_L2:
		avoid = ((Void []) (mIconUri));
	//    8   14:aload_0         
	//    9   15:getfield        #58  <Field Uri mIconUri>
	//   10   18:astore_1        
		if(avoid == null) goto _L4; else goto _L3
	//   11   19:aload_1         
	//   12   20:ifnull          561
_L3:
		Object obj1 = ((Object) (openInputStreamByScheme(((Uri) (avoid)))));
	//   13   23:aload_0         
	//   14   24:aload_1         
	//   15   25:invokespecial   #136 <Method InputStream openInputStreamByScheme(Uri)>
	//   16   28:astore          6
		Object obj;
		if(obj1 != null)
			break MISSING_BLOCK_LABEL_113;
	//   17   30:aload           6
	//   18   32:ifnonnull       113
		obj = obj1;
	//   19   35:aload           6
	//   20   37:astore          5
		avoid = ((Void []) (obj1));
	//   21   39:aload           6
	//   22   41:astore_1        
		StringBuilder stringbuilder = new StringBuilder();
	//   23   42:new             #138 <Class StringBuilder>
	//   24   45:dup             
	//   25   46:invokespecial   #139 <Method void StringBuilder()>
	//   26   49:astore          7
		obj = obj1;
	//   27   51:aload           6
	//   28   53:astore          5
		avoid = ((Void []) (obj1));
	//   29   55:aload           6
	//   30   57:astore_1        
		stringbuilder.append("Unable to open: ");
	//   31   58:aload           7
	//   32   60:ldc1            #141 <String "Unable to open: ">
	//   33   62:invokevirtual   #145 <Method StringBuilder StringBuilder.append(String)>
	//   34   65:pop             
		obj = obj1;
	//   35   66:aload           6
	//   36   68:astore          5
		avoid = ((Void []) (obj1));
	//   37   70:aload           6
	//   38   72:astore_1        
		stringbuilder.append(((Object) (mIconUri)));
	//   39   73:aload           7
	//   40   75:aload_0         
	//   41   76:getfield        #58  <Field Uri mIconUri>
	//   42   79:invokevirtual   #148 <Method StringBuilder StringBuilder.append(Object)>
	//   43   82:pop             
		obj = obj1;
	//   44   83:aload           6
	//   45   85:astore          5
		avoid = ((Void []) (obj1));
	//   46   87:aload           6
	//   47   89:astore_1        
		Log.w("MediaRouteCtrlDialog", stringbuilder.toString());
	//   48   90:ldc1            #42  <String "MediaRouteCtrlDialog">
	//   49   92:aload           7
	//   50   94:invokevirtual   #149 <Method String StringBuilder.toString()>
	//   51   97:invokestatic    #50  <Method int Log.w(String, String)>
	//   52  100:pop             
		int j;
		boolean flag;
		Object obj2;
		Object obj3;
		android.graphics.BitmapFactory.Options options;
		if(obj1 != null)
	//*  53  101:aload           6
	//*  54  103:ifnull          111
			try
			{
				((InputStream) (obj1)).close();
	//   55  106:aload           6
	//   56  108:invokevirtual   #154 <Method void InputStream.close()>
			}
	//*  57  111:aconst_null     
	//*  58  112:areturn         
	//*  59  113:aload           6
	//*  60  115:astore          5
	//*  61  117:aload           6
	//*  62  119:astore_1        
	//*  63  120:new             #156 <Class android.graphics.BitmapFactory$Options>
	//*  64  123:dup             
	//*  65  124:invokespecial   #157 <Method void android.graphics.BitmapFactory$Options()>
	//*  66  127:astore          8
	//*  67  129:aload           6
	//*  68  131:astore          5
	//*  69  133:aload           6
	//*  70  135:astore_1        
	//*  71  136:aload           8
	//*  72  138:iconst_1        
	//*  73  139:putfield        #161 <Field boolean android.graphics.BitmapFactory$Options.inJustDecodeBounds>
	//*  74  142:aload           6
	//*  75  144:astore          5
	//*  76  146:aload           6
	//*  77  148:astore_1        
	//*  78  149:aload           6
	//*  79  151:aconst_null     
	//*  80  152:aload           8
	//*  81  154:invokestatic    #167 <Method Bitmap BitmapFactory.decodeStream(InputStream, android.graphics.Rect, android.graphics.BitmapFactory$Options)>
	//*  82  157:pop             
	//*  83  158:aload           6
	//*  84  160:astore          5
	//*  85  162:aload           6
	//*  86  164:astore_1        
	//*  87  165:aload           8
	//*  88  167:getfield        #170 <Field int android.graphics.BitmapFactory$Options.outWidth>
	//*  89  170:ifeq            447
	//*  90  173:aload           6
	//*  91  175:astore          5
	//*  92  177:aload           6
	//*  93  179:astore_1        
	//*  94  180:aload           8
	//*  95  182:getfield        #173 <Field int android.graphics.BitmapFactory$Options.outHeight>
	//*  96  185:istore_3        
	//*  97  186:iload_3         
	//*  98  187:ifne            193
	//*  99  190:goto            447
	//* 100  193:aload           6
	//* 101  195:astore_1        
	//* 102  196:aload           6
	//* 103  198:invokevirtual   #176 <Method void InputStream.reset()>
	//* 104  201:goto            320
	//* 105  204:aload           6
	//* 106  206:astore          5
	//* 107  208:aload           6
	//* 108  210:astore_1        
	//* 109  211:aload           6
	//* 110  213:invokevirtual   #154 <Method void InputStream.close()>
	//* 111  216:aload           6
	//* 112  218:astore          5
	//* 113  220:aload           6
	//* 114  222:astore_1        
	//* 115  223:aload_0         
	//* 116  224:aload_0         
	//* 117  225:getfield        #58  <Field Uri mIconUri>
	//* 118  228:invokespecial   #136 <Method InputStream openInputStreamByScheme(Uri)>
	//* 119  231:astore          7
	//* 120  233:aload           7
	//* 121  235:astore          6
	//* 122  237:aload           7
	//* 123  239:ifnonnull       320
	//* 124  242:aload           7
	//* 125  244:astore          5
	//* 126  246:aload           7
	//* 127  248:astore_1        
	//* 128  249:new             #138 <Class StringBuilder>
	//* 129  252:dup             
	//* 130  253:invokespecial   #139 <Method void StringBuilder()>
	//* 131  256:astore          6
	//* 132  258:aload           7
	//* 133  260:astore          5
	//* 134  262:aload           7
	//* 135  264:astore_1        
	//* 136  265:aload           6
	//* 137  267:ldc1            #141 <String "Unable to open: ">
	//* 138  269:invokevirtual   #145 <Method StringBuilder StringBuilder.append(String)>
	//* 139  272:pop             
	//* 140  273:aload           7
	//* 141  275:astore          5
	//* 142  277:aload           7
	//* 143  279:astore_1        
	//* 144  280:aload           6
	//* 145  282:aload_0         
	//* 146  283:getfield        #58  <Field Uri mIconUri>
	//* 147  286:invokevirtual   #148 <Method StringBuilder StringBuilder.append(Object)>
	//* 148  289:pop             
	//* 149  290:aload           7
	//* 150  292:astore          5
	//* 151  294:aload           7
	//* 152  296:astore_1        
	//* 153  297:ldc1            #42  <String "MediaRouteCtrlDialog">
	//* 154  299:aload           6
	//* 155  301:invokevirtual   #149 <Method String StringBuilder.toString()>
	//* 156  304:invokestatic    #50  <Method int Log.w(String, String)>
	//* 157  307:pop             
	//* 158  308:aload           7
	//* 159  310:ifnull          318
	//* 160  313:aload           7
	//* 161  315:invokevirtual   #154 <Method void InputStream.close()>
	//* 162  318:aconst_null     
	//* 163  319:areturn         
	//* 164  320:aload           6
	//* 165  322:astore          5
	//* 166  324:aload           6
	//* 167  326:astore_1        
	//* 168  327:aload           8
	//* 169  329:iconst_0        
	//* 170  330:putfield        #161 <Field boolean android.graphics.BitmapFactory$Options.inJustDecodeBounds>
	//* 171  333:aload           6
	//* 172  335:astore          5
	//* 173  337:aload           6
	//* 174  339:astore_1        
	//* 175  340:aload_0         
	//* 176  341:getfield        #21  <Field MediaRouteControllerDialog this$0>
	//* 177  344:aload           8
	//* 178  346:getfield        #170 <Field int android.graphics.BitmapFactory$Options.outWidth>
	//* 179  349:aload           8
	//* 180  351:getfield        #173 <Field int android.graphics.BitmapFactory$Options.outHeight>
	//* 181  354:invokevirtual   #180 <Method int MediaRouteControllerDialog.getDesiredArtHeight(int, int)>
	//* 182  357:istore_3        
	//* 183  358:aload           6
	//* 184  360:astore          5
	//* 185  362:aload           6
	//* 186  364:astore_1        
	//* 187  365:aload           8
	//* 188  367:iconst_1        
	//* 189  368:aload           8
	//* 190  370:getfield        #173 <Field int android.graphics.BitmapFactory$Options.outHeight>
	//* 191  373:iload_3         
	//* 192  374:idiv            
	//* 193  375:invokestatic    #186 <Method int Integer.highestOneBit(int)>
	//* 194  378:invokestatic    #191 <Method int Math.max(int, int)>
	//* 195  381:putfield        #194 <Field int android.graphics.BitmapFactory$Options.inSampleSize>
	//* 196  384:aload           6
	//* 197  386:astore          5
	//* 198  388:aload           6
	//* 199  390:astore_1        
	//* 200  391:aload_0         
	//* 201  392:invokevirtual   #198 <Method boolean isCancelled()>
	//* 202  395:istore          4
	//* 203  397:iload           4
	//* 204  399:ifeq            414
	//* 205  402:aload           6
	//* 206  404:ifnull          412
	//* 207  407:aload           6
	//* 208  409:invokevirtual   #154 <Method void InputStream.close()>
	//* 209  412:aconst_null     
	//* 210  413:areturn         
	//* 211  414:aload           6
	//* 212  416:astore          5
	//* 213  418:aload           6
	//* 214  420:astore_1        
	//* 215  421:aload           6
	//* 216  423:aconst_null     
	//* 217  424:aload           8
	//* 218  426:invokestatic    #167 <Method Bitmap BitmapFactory.decodeStream(InputStream, android.graphics.Rect, android.graphics.BitmapFactory$Options)>
	//* 219  429:astore          7
	//* 220  431:aload           6
	//* 221  433:ifnull          441
	//* 222  436:aload           6
	//* 223  438:invokevirtual   #154 <Method void InputStream.close()>
	//* 224  441:aload           7
	//* 225  443:astore_1        
	//* 226  444:goto            563
	//* 227  447:aload           6
	//* 228  449:ifnull          457
	//* 229  452:aload           6
	//* 230  454:invokevirtual   #154 <Method void InputStream.close()>
	//* 231  457:aconst_null     
	//* 232  458:areturn         
	//* 233  459:astore          6
	//* 234  461:goto            476
	//* 235  464:astore_1        
	//* 236  465:aconst_null     
	//* 237  466:astore          5
	//* 238  468:goto            549
	//* 239  471:astore          6
	//* 240  473:aconst_null     
	//* 241  474:astore          5
	//* 242  476:aload           5
	//* 243  478:astore_1        
	//* 244  479:new             #138 <Class StringBuilder>
	//* 245  482:dup             
	//* 246  483:invokespecial   #139 <Method void StringBuilder()>
	//* 247  486:astore          7
	//* 248  488:aload           5
	//* 249  490:astore_1        
	//* 250  491:aload           7
	//* 251  493:ldc1            #141 <String "Unable to open: ">
	//* 252  495:invokevirtual   #145 <Method StringBuilder StringBuilder.append(String)>
	//* 253  498:pop             
	//* 254  499:aload           5
	//* 255  501:astore_1        
	//* 256  502:aload           7
	//* 257  504:aload_0         
	//* 258  505:getfield        #58  <Field Uri mIconUri>
	//* 259  508:invokevirtual   #148 <Method StringBuilder StringBuilder.append(Object)>
	//* 260  511:pop             
	//* 261  512:aload           5
	//* 262  514:astore_1        
	//* 263  515:ldc1            #42  <String "MediaRouteCtrlDialog">
	//* 264  517:aload           7
	//* 265  519:invokevirtual   #149 <Method String StringBuilder.toString()>
	//* 266  522:aload           6
	//* 267  524:invokestatic    #201 <Method int Log.w(String, String, Throwable)>
	//* 268  527:pop             
	//* 269  528:aload           5
	//* 270  530:ifnull          561
	//* 271  533:aload           5
	//* 272  535:invokevirtual   #154 <Method void InputStream.close()>
	//* 273  538:goto            561
	//* 274  541:astore          6
	//* 275  543:aload_1         
	//* 276  544:astore          5
	//* 277  546:aload           6
	//* 278  548:astore_1        
	//* 279  549:aload           5
	//* 280  551:ifnull          559
	//* 281  554:aload           5
	//* 282  556:invokevirtual   #154 <Method void InputStream.close()>
	//* 283  559:aload_1         
	//* 284  560:athrow          
	//* 285  561:aconst_null     
	//* 286  562:astore_1        
	//* 287  563:aload_1         
	//* 288  564:invokestatic    #40  <Method boolean MediaRouteControllerDialog.isBitmapRecycled(Bitmap)>
	//* 289  567:ifeq            607
	//* 290  570:new             #138 <Class StringBuilder>
	//* 291  573:dup             
	//* 292  574:invokespecial   #139 <Method void StringBuilder()>
	//* 293  577:astore          5
	//* 294  579:aload           5
	//* 295  581:ldc1            #203 <String "Can't use recycled bitmap: ">
	//* 296  583:invokevirtual   #145 <Method StringBuilder StringBuilder.append(String)>
	//* 297  586:pop             
	//* 298  587:aload           5
	//* 299  589:aload_1         
	//* 300  590:invokevirtual   #148 <Method StringBuilder StringBuilder.append(Object)>
	//* 301  593:pop             
	//* 302  594:ldc1            #42  <String "MediaRouteCtrlDialog">
	//* 303  596:aload           5
	//* 304  598:invokevirtual   #149 <Method String StringBuilder.toString()>
	//* 305  601:invokestatic    #50  <Method int Log.w(String, String)>
	//* 306  604:pop             
	//* 307  605:aconst_null     
	//* 308  606:areturn         
	//* 309  607:aload_1         
	//* 310  608:ifnull          678
	//* 311  611:aload_1         
	//* 312  612:invokevirtual   #209 <Method int Bitmap.getWidth()>
	//* 313  615:aload_1         
	//* 314  616:invokevirtual   #212 <Method int Bitmap.getHeight()>
	//* 315  619:icmpge          678
	//* 316  622:new             #214 <Class android.support.v7.graphics.Palette$Builder>
	//* 317  625:dup             
	//* 318  626:aload_1         
	//* 319  627:invokespecial   #217 <Method void android.support.v7.graphics.Palette$Builder(Bitmap)>
	//* 320  630:iconst_1        
	//* 321  631:invokevirtual   #221 <Method android.support.v7.graphics.Palette$Builder android.support.v7.graphics.Palette$Builder.maximumColorCount(int)>
	//* 322  634:invokevirtual   #225 <Method Palette android.support.v7.graphics.Palette$Builder.generate()>
	//* 323  637:astore          5
	//* 324  639:aload           5
	//* 325  641:invokevirtual   #231 <Method List Palette.getSwatches()>
	//* 326  644:invokeinterface #236 <Method boolean List.isEmpty()>
	//* 327  649:ifeq            655
	//* 328  652:goto            673
	//* 329  655:aload           5
	//* 330  657:invokevirtual   #231 <Method List Palette.getSwatches()>
	//* 331  660:iconst_0        
	//* 332  661:invokeinterface #240 <Method Object List.get(int)>
	//* 333  666:checkcast       #242 <Class android.support.v7.graphics.Palette$Swatch>
	//* 334  669:invokevirtual   #245 <Method int android.support.v7.graphics.Palette$Swatch.getRgb()>
	//* 335  672:istore_2        
	//* 336  673:aload_0         
	//* 337  674:iload_2         
	//* 338  675:putfield        #247 <Field int mBackgroundColor>
	//* 339  678:aload_1         
	//* 340  679:areturn         
			// Misplaced declaration of an exception variable
			catch(Void avoid[])
	//* 341  680:astore_1        
			{
				return null;
	//  342  681:aconst_null     
	//  343  682:areturn         
			}
		return null;
		obj = obj1;
		avoid = ((Void []) (obj1));
		options = new android.graphics.BitmapFactory.Options();
		obj = obj1;
		avoid = ((Void []) (obj1));
		options.inJustDecodeBounds = true;
		obj = obj1;
		avoid = ((Void []) (obj1));
		BitmapFactory.decodeStream(((InputStream) (obj1)), ((android.graphics.Rect) (null)), options);
		obj = obj1;
		avoid = ((Void []) (obj1));
		if(options.outWidth == 0) goto _L6; else goto _L5
_L5:
		obj = obj1;
		avoid = ((Void []) (obj1));
		j = options.outHeight;
		if(j != 0) goto _L7; else goto _L6
_L7:
		avoid = ((Void []) (obj1));
		((InputStream) (obj1)).reset();
		  goto _L8
_L13:
		obj = obj1;
		avoid = ((Void []) (obj1));
		((InputStream) (obj1)).close();
		obj = obj1;
		avoid = ((Void []) (obj1));
		obj3 = ((Object) (openInputStreamByScheme(mIconUri)));
		obj1 = obj3;
		if(obj3 != null) goto _L8; else goto _L9
_L9:
		obj = obj3;
		avoid = ((Void []) (obj3));
		obj1 = ((Object) (new StringBuilder()));
		obj = obj3;
		avoid = ((Void []) (obj3));
		((StringBuilder) (obj1)).append("Unable to open: ");
		obj = obj3;
		avoid = ((Void []) (obj3));
		((StringBuilder) (obj1)).append(((Object) (mIconUri)));
		obj = obj3;
		avoid = ((Void []) (obj3));
		Log.w("MediaRouteCtrlDialog", ((StringBuilder) (obj1)).toString());
		if(obj3 != null)
			try
			{
				((InputStream) (obj3)).close();
			}
	//* 344  683:astore_1        
	//* 345  684:goto            204
			// Misplaced declaration of an exception variable
			catch(Void avoid[])
	//* 346  687:astore_1        
			{
				return null;
	//  347  688:aconst_null     
	//  348  689:areturn         
			}
		return null;
_L8:
		obj = obj1;
		avoid = ((Void []) (obj1));
		options.inJustDecodeBounds = false;
		obj = obj1;
		avoid = ((Void []) (obj1));
		j = getDesiredArtHeight(options.outWidth, options.outHeight);
		obj = obj1;
		avoid = ((Void []) (obj1));
		options.inSampleSize = Math.max(1, Integer.highestOneBit(options.outHeight / j));
		obj = obj1;
		avoid = ((Void []) (obj1));
		flag = isCancelled();
		if(flag)
		{
			if(obj1 != null)
				try
				{
					((InputStream) (obj1)).close();
				}
				// Misplaced declaration of an exception variable
				catch(Void avoid[])
	//* 349  690:astore_1        
				{
					return null;
	//  350  691:aconst_null     
	//  351  692:areturn         
				}
			return null;
		}
		obj = obj1;
		avoid = ((Void []) (obj1));
		obj3 = ((Object) (BitmapFactory.decodeStream(((InputStream) (obj1)), ((android.graphics.Rect) (null)), options)));
		if(obj1 != null)
			try
			{
				((InputStream) (obj1)).close();
			}
			// Misplaced declaration of an exception variable
			catch(Void avoid[]) { }
	//  352  693:astore_1        
		avoid = ((Void []) (obj3));
		  goto _L1
_L6:
		if(obj1 != null)
			try
			{
				((InputStream) (obj1)).close();
			}
	//* 353  694:goto            441
			// Misplaced declaration of an exception variable
			catch(Void avoid[])
	//* 354  697:astore_1        
			{
				return null;
	//  355  698:aconst_null     
	//  356  699:areturn         
			}
		return null;
		obj2;
		  goto _L10
		avoid;
		obj = null;
		  goto _L11
		obj2;
		obj = null;
_L10:
		avoid = ((Void []) (obj));
		obj3 = ((Object) (new StringBuilder()));
		avoid = ((Void []) (obj));
		((StringBuilder) (obj3)).append("Unable to open: ");
		avoid = ((Void []) (obj));
		((StringBuilder) (obj3)).append(((Object) (mIconUri)));
		avoid = ((Void []) (obj));
		Log.w("MediaRouteCtrlDialog", ((StringBuilder) (obj3)).toString(), ((Throwable) (obj2)));
		if(obj != null)
			try
			{
				((InputStream) (obj)).close();
			}
			// Misplaced declaration of an exception variable
			catch(Void avoid[]) { }
	//  357  700:astore_1        
		  goto _L4
		obj2;
		obj = ((Object) (avoid));
		avoid = ((Void []) (obj2));
_L11:
		if(obj != null)
			try
			{
				((InputStream) (obj)).close();
			}
	//* 358  701:goto            561
			catch(IOException ioexception) { }
	//  359  704:astore          5
		throw avoid;
_L4:
		avoid = null;
_L1:
		if(MediaRouteControllerDialog.isBitmapRecycled(((Bitmap) (avoid))))
		{
			obj = ((Object) (new StringBuilder()));
			((StringBuilder) (obj)).append("Can't use recycled bitmap: ");
			((StringBuilder) (obj)).append(((Object) (avoid)));
			Log.w("MediaRouteCtrlDialog", ((StringBuilder) (obj)).toString());
			return null;
		}
		if(avoid != null && ((Bitmap) (avoid)).getWidth() < ((Bitmap) (avoid)).getHeight())
		{
			obj = ((Object) ((new android.support.v7.graphics.Palette.Builder(((Bitmap) (avoid)))).maximumColorCount(1).generate()));
			if(!((Palette) (obj)).getSwatches().isEmpty())
				i = ((android.support.v7.graphics.Palette.Swatch)((Palette) (obj)).getSwatches().get(0)).getRgb();
			mBackgroundColor = i;
		}
		return ((Bitmap) (avoid));
		avoid;
		if(true) goto _L13; else goto _L12
_L12:
	//* 360  706:goto            559
	}

	protected volatile Object doInBackground(Object aobj[])
	{
		return ((Object) (doInBackground((Void[])aobj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #250 <Class Void[]>
	//    3    5:invokevirtual   #252 <Method Bitmap doInBackground(Void[])>
	//    4    8:areturn         
	}

	public Bitmap getIconBitmap()
	{
		return mIconBitmap;
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field Bitmap mIconBitmap>
	//    2    4:areturn         
	}

	public Uri getIconUri()
	{
		return mIconUri;
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field Uri mIconUri>
	//    2    4:areturn         
	}

	protected void onPostExecute(Bitmap bitmap)
	{
		MediaRouteControllerDialog mediaroutecontrollerdialog = MediaRouteControllerDialog.this;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field MediaRouteControllerDialog this$0>
	//    2    4:astore          7
		mediaroutecontrollerdialog.mFetchArtTask = null;
	//    3    6:aload           7
	//    4    8:aconst_null     
	//    5    9:putfield        #259 <Field MediaRouteControllerDialog$FetchArtTask MediaRouteControllerDialog.mFetchArtTask>
		if(!p.a(((Object) (mediaroutecontrollerdialog.mArtIconBitmap)), ((Object) (mIconBitmap))) || !p.a(((Object) (mArtIconUri)), ((Object) (mIconUri))))
	//*   6   12:aload           7
	//*   7   14:getfield        #262 <Field Bitmap MediaRouteControllerDialog.mArtIconBitmap>
	//*   8   17:aload_0         
	//*   9   18:getfield        #52  <Field Bitmap mIconBitmap>
	//*  10   21:invokestatic    #268 <Method boolean p.a(Object, Object)>
	//*  11   24:ifeq            44
	//*  12   27:aload_0         
	//*  13   28:getfield        #21  <Field MediaRouteControllerDialog this$0>
	//*  14   31:getfield        #271 <Field Uri MediaRouteControllerDialog.mArtIconUri>
	//*  15   34:aload_0         
	//*  16   35:getfield        #58  <Field Uri mIconUri>
	//*  17   38:invokestatic    #268 <Method boolean p.a(Object, Object)>
	//*  18   41:ifne            127
		{
			MediaRouteControllerDialog mediaroutecontrollerdialog1 = MediaRouteControllerDialog.this;
	//   19   44:aload_0         
	//   20   45:getfield        #21  <Field MediaRouteControllerDialog this$0>
	//   21   48:astore          7
			mediaroutecontrollerdialog1.mArtIconBitmap = mIconBitmap;
	//   22   50:aload           7
	//   23   52:aload_0         
	//   24   53:getfield        #52  <Field Bitmap mIconBitmap>
	//   25   56:putfield        #262 <Field Bitmap MediaRouteControllerDialog.mArtIconBitmap>
			mediaroutecontrollerdialog1.mArtIconLoadedBitmap = bitmap;
	//   26   59:aload           7
	//   27   61:aload_1         
	//   28   62:putfield        #274 <Field Bitmap MediaRouteControllerDialog.mArtIconLoadedBitmap>
			mediaroutecontrollerdialog1.mArtIconUri = mIconUri;
	//   29   65:aload           7
	//   30   67:aload_0         
	//   31   68:getfield        #58  <Field Uri mIconUri>
	//   32   71:putfield        #271 <Field Uri MediaRouteControllerDialog.mArtIconUri>
			mediaroutecontrollerdialog1.mArtIconBackgroundColor = mBackgroundColor;
	//   33   74:aload           7
	//   34   76:aload_0         
	//   35   77:getfield        #247 <Field int mBackgroundColor>
	//   36   80:putfield        #277 <Field int MediaRouteControllerDialog.mArtIconBackgroundColor>
			boolean flag = true;
	//   37   83:iconst_1        
	//   38   84:istore_2        
			mediaroutecontrollerdialog1.mArtIconIsLoaded = true;
	//   39   85:aload           7
	//   40   87:iconst_1        
	//   41   88:putfield        #280 <Field boolean MediaRouteControllerDialog.mArtIconIsLoaded>
			long l = SystemClock.uptimeMillis();
	//   42   91:invokestatic    #286 <Method long SystemClock.uptimeMillis()>
	//   43   94:lstore_3        
			long l1 = mStartTimeMillis;
	//   44   95:aload_0         
	//   45   96:getfield        #288 <Field long mStartTimeMillis>
	//   46   99:lstore          5
			bitmap = ((Bitmap) (MediaRouteControllerDialog.this));
	//   47  101:aload_0         
	//   48  102:getfield        #21  <Field MediaRouteControllerDialog this$0>
	//   49  105:astore_1        
			if(l - l1 <= 120L)
	//*  50  106:lload_3         
	//*  51  107:lload           5
	//*  52  109:lsub            
	//*  53  110:ldc2w           #7   <Long 120L>
	//*  54  113:lcmp            
	//*  55  114:ifle            120
	//*  56  117:goto            122
				flag = false;
	//   57  120:iconst_0        
	//   58  121:istore_2        
			((MediaRouteControllerDialog) (bitmap)).update(flag);
	//   59  122:aload_1         
	//   60  123:iload_2         
	//   61  124:invokevirtual   #292 <Method void MediaRouteControllerDialog.update(boolean)>
		}
	//   62  127:return          
	}

	protected volatile void onPostExecute(Object obj)
	{
		onPostExecute((Bitmap)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #205 <Class Bitmap>
	//    3    5:invokevirtual   #295 <Method void onPostExecute(Bitmap)>
	//    4    8:return          
	}

	protected void onPreExecute()
	{
		mStartTimeMillis = SystemClock.uptimeMillis();
	//    0    0:aload_0         
	//    1    1:invokestatic    #286 <Method long SystemClock.uptimeMillis()>
	//    2    4:putfield        #288 <Field long mStartTimeMillis>
		clearLoadedBitmap();
	//    3    7:aload_0         
	//    4    8:getfield        #21  <Field MediaRouteControllerDialog this$0>
	//    5   11:invokevirtual   #299 <Method void MediaRouteControllerDialog.clearLoadedBitmap()>
	//    6   14:return          
	}

	private static final long SHOW_ANIM_TIME_THRESHOLD_MILLIS = 120L;
	private int mBackgroundColor;
	private final Bitmap mIconBitmap;
	private final Uri mIconUri;
	private long mStartTimeMillis;
	final MediaRouteControllerDialog this$0;

	MediaRouteControllerDialog$FetchArtTask()
	{
		this$0 = MediaRouteControllerDialog.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #21  <Field MediaRouteControllerDialog this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #24  <Method void AsyncTask()>
		Object obj = ((Object) (mDescription));
	//    5    9:aload_1         
	//    6   10:getfield        #30  <Field MediaDescriptionCompat MediaRouteControllerDialog.mDescription>
	//    7   13:astore_2        
		Object obj1 = null;
	//    8   14:aconst_null     
	//    9   15:astore          4
		if(obj == null)
	//*  10   17:aload_2         
	//*  11   18:ifnonnull       26
			obj = null;
	//   12   21:aconst_null     
	//   13   22:astore_2        
		else
	//*  14   23:goto            34
			obj = ((Object) (mDescription.d()));
	//   15   26:aload_1         
	//   16   27:getfield        #30  <Field MediaDescriptionCompat MediaRouteControllerDialog.mDescription>
	//   17   30:invokevirtual   #36  <Method Bitmap MediaDescriptionCompat.d()>
	//   18   33:astore_2        
		Bitmap bitmap = ((Bitmap) (obj));
	//   19   34:aload_2         
	//   20   35:astore_3        
		if(MediaRouteControllerDialog.isBitmapRecycled(((Bitmap) (obj))))
	//*  21   36:aload_2         
	//*  22   37:invokestatic    #40  <Method boolean MediaRouteControllerDialog.isBitmapRecycled(Bitmap)>
	//*  23   40:ifeq            53
		{
			Log.w("MediaRouteCtrlDialog", "Can't fetch the given art bitmap because it's already recycled.");
	//   24   43:ldc1            #42  <String "MediaRouteCtrlDialog">
	//   25   45:ldc1            #44  <String "Can't fetch the given art bitmap because it's already recycled.">
	//   26   47:invokestatic    #50  <Method int Log.w(String, String)>
	//   27   50:pop             
			bitmap = null;
	//   28   51:aconst_null     
	//   29   52:astore_3        
		}
		mIconBitmap = bitmap;
	//   30   53:aload_0         
	//   31   54:aload_3         
	//   32   55:putfield        #52  <Field Bitmap mIconBitmap>
		if(mDescription == null)
	//*  33   58:aload_1         
	//*  34   59:getfield        #30  <Field MediaDescriptionCompat MediaRouteControllerDialog.mDescription>
	//*  35   62:ifnonnull       71
			mediaroutecontrollerdialog = ((MediaRouteControllerDialog) (obj1));
	//   36   65:aload           4
	//   37   67:astore_1        
		else
	//*  38   68:goto            79
			mediaroutecontrollerdialog = ((MediaRouteControllerDialog) (mDescription.e()));
	//   39   71:aload_1         
	//   40   72:getfield        #30  <Field MediaDescriptionCompat MediaRouteControllerDialog.mDescription>
	//   41   75:invokevirtual   #56  <Method Uri MediaDescriptionCompat.e()>
	//   42   78:astore_1        
		mIconUri = ((Uri) (MediaRouteControllerDialog.this));
	//   43   79:aload_0         
	//   44   80:aload_1         
	//   45   81:putfield        #58  <Field Uri mIconUri>
	//   46   84:return          
	}
}
