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
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.util.ObjectsCompat;
import android.support.v7.graphics.Palette;
import android.util.Log;
import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

// Referenced classes of package android.support.v7.app:
//			MediaRouteControllerDialog

private class MediaRouteControllerDialog$FetchArtTask extends AsyncTask
{

	private InputStream openInputStreamByScheme(Uri uri)
		throws IOException
	{
		String s = uri.getScheme().toLowerCase();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #71  <Method String Uri.getScheme()>
	//    2    4:invokevirtual   #76  <Method String String.toLowerCase()>
	//    3    7:astore_2        
		if(!"android.resource".equals(((Object) (s))) && !"content".equals(((Object) (s))) && !"file".equals(((Object) (s))))
	//*   4    8:ldc1            #78  <String "android.resource">
	//*   5   10:aload_2         
	//*   6   11:invokevirtual   #82  <Method boolean String.equals(Object)>
	//*   7   14:ifne            75
	//*   8   17:ldc1            #84  <String "content">
	//*   9   19:aload_2         
	//*  10   20:invokevirtual   #82  <Method boolean String.equals(Object)>
	//*  11   23:ifne            75
	//*  12   26:ldc1            #86  <String "file">
	//*  13   28:aload_2         
	//*  14   29:invokevirtual   #82  <Method boolean String.equals(Object)>
	//*  15   32:ifeq            38
	//*  16   35:goto            75
		{
			uri = ((Uri) ((new URL(uri.toString())).openConnection()));
	//   17   38:new             #88  <Class URL>
	//   18   41:dup             
	//   19   42:aload_1         
	//   20   43:invokevirtual   #91  <Method String Uri.toString()>
	//   21   46:invokespecial   #94  <Method void URL(String)>
	//   22   49:invokevirtual   #98  <Method URLConnection URL.openConnection()>
	//   23   52:astore_1        
			((URLConnection) (uri)).setConnectTimeout(MediaRouteControllerDialog.CONNECTION_TIMEOUT_MILLIS);
	//   24   53:aload_1         
	//   25   54:getstatic       #101 <Field int MediaRouteControllerDialog.CONNECTION_TIMEOUT_MILLIS>
	//   26   57:invokevirtual   #107 <Method void URLConnection.setConnectTimeout(int)>
			((URLConnection) (uri)).setReadTimeout(MediaRouteControllerDialog.CONNECTION_TIMEOUT_MILLIS);
	//   27   60:aload_1         
	//   28   61:getstatic       #101 <Field int MediaRouteControllerDialog.CONNECTION_TIMEOUT_MILLIS>
	//   29   64:invokevirtual   #110 <Method void URLConnection.setReadTimeout(int)>
			uri = ((Uri) (((URLConnection) (uri)).getInputStream()));
	//   30   67:aload_1         
	//   31   68:invokevirtual   #114 <Method InputStream URLConnection.getInputStream()>
	//   32   71:astore_1        
		} else
	//*  33   72:goto            90
		{
			uri = ((Uri) (mContext.getContentResolver().openInputStream(uri)));
	//   34   75:aload_0         
	//   35   76:getfield        #25  <Field MediaRouteControllerDialog this$0>
	//   36   79:getfield        #118 <Field Context MediaRouteControllerDialog.mContext>
	//   37   82:invokevirtual   #124 <Method ContentResolver Context.getContentResolver()>
	//   38   85:aload_1         
	//   39   86:invokevirtual   #129 <Method InputStream ContentResolver.openInputStream(Uri)>
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
	//   45   96:new             #131 <Class BufferedInputStream>
	//   46   99:dup             
	//   47  100:aload_1         
	//   48  101:invokespecial   #134 <Method void BufferedInputStream(InputStream)>
	//   49  104:areturn         
	}

	protected transient Bitmap doInBackground(Void avoid[])
	{
		int i;
		avoid = ((Void []) (mIconBitmap));
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field Bitmap mIconBitmap>
	//    2    4:astore_1        
		i = 0;
	//    3    5:iconst_0        
	//    4    6:istore_2        
		if(avoid == null) goto _L2; else goto _L1
	//    5    7:aload_1         
	//    6    8:ifnull          19
_L1:
		avoid = ((Void []) (mIconBitmap));
	//    7   11:aload_0         
	//    8   12:getfield        #54  <Field Bitmap mIconBitmap>
	//    9   15:astore_1        
		  goto _L3
	//*  10   16:goto            546
_L2:
		if(mIconUri == null) goto _L5; else goto _L4
	//   11   19:aload_0         
	//   12   20:getfield        #60  <Field Uri mIconUri>
	//   13   23:ifnull          544
_L4:
		Object obj = ((Object) (openInputStreamByScheme(mIconUri)));
	//   14   26:aload_0         
	//   15   27:aload_0         
	//   16   28:getfield        #60  <Field Uri mIconUri>
	//   17   31:invokespecial   #139 <Method InputStream openInputStreamByScheme(Uri)>
	//   18   34:astore          5
		if(obj != null) goto _L7; else goto _L6
	//   19   36:aload           5
	//   20   38:ifnonnull       128
_L6:
		Object obj1;
		obj1 = obj;
	//   21   41:aload           5
	//   22   43:astore          6
		avoid = ((Void []) (obj));
	//   23   45:aload           5
	//   24   47:astore_1        
		StringBuilder stringbuilder = new StringBuilder();
	//   25   48:new             #141 <Class StringBuilder>
	//   26   51:dup             
	//   27   52:invokespecial   #142 <Method void StringBuilder()>
	//   28   55:astore          7
		obj1 = obj;
	//   29   57:aload           5
	//   30   59:astore          6
		avoid = ((Void []) (obj));
	//   31   61:aload           5
	//   32   63:astore_1        
		stringbuilder.append("Unable to open: ");
	//   33   64:aload           7
	//   34   66:ldc1            #144 <String "Unable to open: ">
	//   35   68:invokevirtual   #148 <Method StringBuilder StringBuilder.append(String)>
	//   36   71:pop             
		obj1 = obj;
	//   37   72:aload           5
	//   38   74:astore          6
		avoid = ((Void []) (obj));
	//   39   76:aload           5
	//   40   78:astore_1        
		stringbuilder.append(((Object) (mIconUri)));
	//   41   79:aload           7
	//   42   81:aload_0         
	//   43   82:getfield        #60  <Field Uri mIconUri>
	//   44   85:invokevirtual   #151 <Method StringBuilder StringBuilder.append(Object)>
	//   45   88:pop             
		obj1 = obj;
	//   46   89:aload           5
	//   47   91:astore          6
		avoid = ((Void []) (obj));
	//   48   93:aload           5
	//   49   95:astore_1        
		Log.w("MediaRouteCtrlDialog", stringbuilder.toString());
	//   50   96:ldc1            #44  <String "MediaRouteCtrlDialog">
	//   51   98:aload           7
	//   52  100:invokevirtual   #152 <Method String StringBuilder.toString()>
	//   53  103:invokestatic    #52  <Method int Log.w(String, String)>
	//   54  106:pop             
		int j;
		boolean flag;
		Exception exception;
		Object obj2;
		IOException ioexception1;
		if(obj != null)
	//*  55  107:aload           5
	//*  56  109:ifnull          117
			try
			{
				((InputStream) (obj)).close();
	//   57  112:aload           5
	//   58  114:invokevirtual   #157 <Method void InputStream.close()>
			}
	//*  59  117:aconst_null     
	//*  60  118:areturn         
	//*  61  119:astore          7
	//*  62  121:aload           6
	//*  63  123:astore          5
	//*  64  125:goto            459
	//*  65  128:aload           5
	//*  66  130:astore          6
	//*  67  132:aload           5
	//*  68  134:astore_1        
	//*  69  135:new             #159 <Class android.graphics.BitmapFactory$Options>
	//*  70  138:dup             
	//*  71  139:invokespecial   #160 <Method void android.graphics.BitmapFactory$Options()>
	//*  72  142:astore          7
	//*  73  144:aload           5
	//*  74  146:astore          6
	//*  75  148:aload           5
	//*  76  150:astore_1        
	//*  77  151:aload           7
	//*  78  153:iconst_1        
	//*  79  154:putfield        #164 <Field boolean android.graphics.BitmapFactory$Options.inJustDecodeBounds>
	//*  80  157:aload           5
	//*  81  159:astore          6
	//*  82  161:aload           5
	//*  83  163:astore_1        
	//*  84  164:aload           5
	//*  85  166:aconst_null     
	//*  86  167:aload           7
	//*  87  169:invokestatic    #170 <Method Bitmap BitmapFactory.decodeStream(InputStream, android.graphics.Rect, android.graphics.BitmapFactory$Options)>
	//*  88  172:pop             
	//*  89  173:aload           5
	//*  90  175:astore          6
	//*  91  177:aload           5
	//*  92  179:astore_1        
	//*  93  180:aload           7
	//*  94  182:getfield        #173 <Field int android.graphics.BitmapFactory$Options.outWidth>
	//*  95  185:ifeq            435
	//*  96  188:aload           5
	//*  97  190:astore          6
	//*  98  192:aload           5
	//*  99  194:astore_1        
	//* 100  195:aload           7
	//* 101  197:getfield        #176 <Field int android.graphics.BitmapFactory$Options.outHeight>
	//* 102  200:istore_3        
	//* 103  201:iload_3         
	//* 104  202:ifne            208
	//* 105  205:goto            435
	//* 106  208:aload           5
	//* 107  210:astore_1        
	//* 108  211:aload           5
	//* 109  213:invokevirtual   #179 <Method void InputStream.reset()>
	//* 110  216:goto            308
	//* 111  219:aload           5
	//* 112  221:astore          6
	//* 113  223:aload           5
	//* 114  225:astore_1        
	//* 115  226:aload           5
	//* 116  228:invokevirtual   #157 <Method void InputStream.close()>
	//* 117  231:aload           5
	//* 118  233:astore          6
	//* 119  235:aload           5
	//* 120  237:astore_1        
	//* 121  238:aload_0         
	//* 122  239:aload_0         
	//* 123  240:getfield        #60  <Field Uri mIconUri>
	//* 124  243:invokespecial   #139 <Method InputStream openInputStreamByScheme(Uri)>
	//* 125  246:astore          5
	//* 126  248:aload           5
	//* 127  250:ifnonnull       308
	//* 128  253:new             #141 <Class StringBuilder>
	//* 129  256:dup             
	//* 130  257:invokespecial   #142 <Method void StringBuilder()>
	//* 131  260:astore_1        
	//* 132  261:aload_1         
	//* 133  262:ldc1            #144 <String "Unable to open: ">
	//* 134  264:invokevirtual   #148 <Method StringBuilder StringBuilder.append(String)>
	//* 135  267:pop             
	//* 136  268:aload_1         
	//* 137  269:aload_0         
	//* 138  270:getfield        #60  <Field Uri mIconUri>
	//* 139  273:invokevirtual   #151 <Method StringBuilder StringBuilder.append(Object)>
	//* 140  276:pop             
	//* 141  277:ldc1            #44  <String "MediaRouteCtrlDialog">
	//* 142  279:aload_1         
	//* 143  280:invokevirtual   #152 <Method String StringBuilder.toString()>
	//* 144  283:invokestatic    #52  <Method int Log.w(String, String)>
	//* 145  286:pop             
	//* 146  287:aload           5
	//* 147  289:ifnull          297
	//* 148  292:aload           5
	//* 149  294:invokevirtual   #157 <Method void InputStream.close()>
	//* 150  297:aconst_null     
	//* 151  298:areturn         
	//* 152  299:astore_1        
	//* 153  300:goto            532
	//* 154  303:astore          7
	//* 155  305:goto            459
	//* 156  308:aload           5
	//* 157  310:astore          6
	//* 158  312:aload           5
	//* 159  314:astore_1        
	//* 160  315:aload           7
	//* 161  317:iconst_0        
	//* 162  318:putfield        #164 <Field boolean android.graphics.BitmapFactory$Options.inJustDecodeBounds>
	//* 163  321:aload           5
	//* 164  323:astore          6
	//* 165  325:aload           5
	//* 166  327:astore_1        
	//* 167  328:aload_0         
	//* 168  329:getfield        #25  <Field MediaRouteControllerDialog this$0>
	//* 169  332:aload           7
	//* 170  334:getfield        #173 <Field int android.graphics.BitmapFactory$Options.outWidth>
	//* 171  337:aload           7
	//* 172  339:getfield        #176 <Field int android.graphics.BitmapFactory$Options.outHeight>
	//* 173  342:invokevirtual   #183 <Method int MediaRouteControllerDialog.getDesiredArtHeight(int, int)>
	//* 174  345:istore_3        
	//* 175  346:aload           5
	//* 176  348:astore          6
	//* 177  350:aload           5
	//* 178  352:astore_1        
	//* 179  353:aload           7
	//* 180  355:iconst_1        
	//* 181  356:aload           7
	//* 182  358:getfield        #176 <Field int android.graphics.BitmapFactory$Options.outHeight>
	//* 183  361:iload_3         
	//* 184  362:idiv            
	//* 185  363:invokestatic    #189 <Method int Integer.highestOneBit(int)>
	//* 186  366:invokestatic    #194 <Method int Math.max(int, int)>
	//* 187  369:putfield        #197 <Field int android.graphics.BitmapFactory$Options.inSampleSize>
	//* 188  372:aload           5
	//* 189  374:astore          6
	//* 190  376:aload           5
	//* 191  378:astore_1        
	//* 192  379:aload_0         
	//* 193  380:invokevirtual   #201 <Method boolean isCancelled()>
	//* 194  383:istore          4
	//* 195  385:iload           4
	//* 196  387:ifeq            402
	//* 197  390:aload           5
	//* 198  392:ifnull          400
	//* 199  395:aload           5
	//* 200  397:invokevirtual   #157 <Method void InputStream.close()>
	//* 201  400:aconst_null     
	//* 202  401:areturn         
	//* 203  402:aload           5
	//* 204  404:astore          6
	//* 205  406:aload           5
	//* 206  408:astore_1        
	//* 207  409:aload           5
	//* 208  411:aconst_null     
	//* 209  412:aload           7
	//* 210  414:invokestatic    #170 <Method Bitmap BitmapFactory.decodeStream(InputStream, android.graphics.Rect, android.graphics.BitmapFactory$Options)>
	//* 211  417:astore          7
	//* 212  419:aload           5
	//* 213  421:ifnull          429
	//* 214  424:aload           5
	//* 215  426:invokevirtual   #157 <Method void InputStream.close()>
	//* 216  429:aload           7
	//* 217  431:astore_1        
	//* 218  432:goto            546
	//* 219  435:aload           5
	//* 220  437:ifnull          445
	//* 221  440:aload           5
	//* 222  442:invokevirtual   #157 <Method void InputStream.close()>
	//* 223  445:aconst_null     
	//* 224  446:areturn         
	//* 225  447:astore_1        
	//* 226  448:aconst_null     
	//* 227  449:astore          5
	//* 228  451:goto            532
	//* 229  454:astore          7
	//* 230  456:aconst_null     
	//* 231  457:astore          5
	//* 232  459:aload           5
	//* 233  461:astore_1        
	//* 234  462:new             #141 <Class StringBuilder>
	//* 235  465:dup             
	//* 236  466:invokespecial   #142 <Method void StringBuilder()>
	//* 237  469:astore          6
	//* 238  471:aload           5
	//* 239  473:astore_1        
	//* 240  474:aload           6
	//* 241  476:ldc1            #144 <String "Unable to open: ">
	//* 242  478:invokevirtual   #148 <Method StringBuilder StringBuilder.append(String)>
	//* 243  481:pop             
	//* 244  482:aload           5
	//* 245  484:astore_1        
	//* 246  485:aload           6
	//* 247  487:aload_0         
	//* 248  488:getfield        #60  <Field Uri mIconUri>
	//* 249  491:invokevirtual   #151 <Method StringBuilder StringBuilder.append(Object)>
	//* 250  494:pop             
	//* 251  495:aload           5
	//* 252  497:astore_1        
	//* 253  498:ldc1            #44  <String "MediaRouteCtrlDialog">
	//* 254  500:aload           6
	//* 255  502:invokevirtual   #152 <Method String StringBuilder.toString()>
	//* 256  505:aload           7
	//* 257  507:invokestatic    #204 <Method int Log.w(String, String, Throwable)>
	//* 258  510:pop             
	//* 259  511:aload           5
	//* 260  513:ifnull          544
	//* 261  516:aload           5
	//* 262  518:invokevirtual   #157 <Method void InputStream.close()>
	//* 263  521:goto            544
	//* 264  524:astore          6
	//* 265  526:aload_1         
	//* 266  527:astore          5
	//* 267  529:aload           6
	//* 268  531:astore_1        
	//* 269  532:aload           5
	//* 270  534:ifnull          542
	//* 271  537:aload           5
	//* 272  539:invokevirtual   #157 <Method void InputStream.close()>
	//* 273  542:aload_1         
	//* 274  543:athrow          
	//* 275  544:aconst_null     
	//* 276  545:astore_1        
	//* 277  546:aload_0         
	//* 278  547:getfield        #25  <Field MediaRouteControllerDialog this$0>
	//* 279  550:aload_1         
	//* 280  551:invokestatic    #42  <Method boolean MediaRouteControllerDialog.access$300(MediaRouteControllerDialog, Bitmap)>
	//* 281  554:ifeq            594
	//* 282  557:new             #141 <Class StringBuilder>
	//* 283  560:dup             
	//* 284  561:invokespecial   #142 <Method void StringBuilder()>
	//* 285  564:astore          5
	//* 286  566:aload           5
	//* 287  568:ldc1            #206 <String "Can't use recycled bitmap: ">
	//* 288  570:invokevirtual   #148 <Method StringBuilder StringBuilder.append(String)>
	//* 289  573:pop             
	//* 290  574:aload           5
	//* 291  576:aload_1         
	//* 292  577:invokevirtual   #151 <Method StringBuilder StringBuilder.append(Object)>
	//* 293  580:pop             
	//* 294  581:ldc1            #44  <String "MediaRouteCtrlDialog">
	//* 295  583:aload           5
	//* 296  585:invokevirtual   #152 <Method String StringBuilder.toString()>
	//* 297  588:invokestatic    #52  <Method int Log.w(String, String)>
	//* 298  591:pop             
	//* 299  592:aconst_null     
	//* 300  593:areturn         
	//* 301  594:aload_1         
	//* 302  595:ifnull          665
	//* 303  598:aload_1         
	//* 304  599:invokevirtual   #212 <Method int Bitmap.getWidth()>
	//* 305  602:aload_1         
	//* 306  603:invokevirtual   #215 <Method int Bitmap.getHeight()>
	//* 307  606:icmpge          665
	//* 308  609:new             #217 <Class android.support.v7.graphics.Palette$Builder>
	//* 309  612:dup             
	//* 310  613:aload_1         
	//* 311  614:invokespecial   #220 <Method void android.support.v7.graphics.Palette$Builder(Bitmap)>
	//* 312  617:iconst_1        
	//* 313  618:invokevirtual   #224 <Method android.support.v7.graphics.Palette$Builder android.support.v7.graphics.Palette$Builder.maximumColorCount(int)>
	//* 314  621:invokevirtual   #228 <Method Palette android.support.v7.graphics.Palette$Builder.generate()>
	//* 315  624:astore          5
	//* 316  626:aload           5
	//* 317  628:invokevirtual   #234 <Method List Palette.getSwatches()>
	//* 318  631:invokeinterface #239 <Method boolean List.isEmpty()>
	//* 319  636:ifeq            642
	//* 320  639:goto            660
	//* 321  642:aload           5
	//* 322  644:invokevirtual   #234 <Method List Palette.getSwatches()>
	//* 323  647:iconst_0        
	//* 324  648:invokeinterface #243 <Method Object List.get(int)>
	//* 325  653:checkcast       #245 <Class android.support.v7.graphics.Palette$Swatch>
	//* 326  656:invokevirtual   #248 <Method int android.support.v7.graphics.Palette$Swatch.getRgb()>
	//* 327  659:istore_2        
	//* 328  660:aload_0         
	//* 329  661:iload_2         
	//* 330  662:putfield        #250 <Field int mBackgroundColor>
	//* 331  665:aload_1         
	//* 332  666:areturn         
			// Misplaced declaration of an exception variable
			catch(Void avoid[])
	//* 333  667:astore_1        
			{
				return null;
	//  334  668:aconst_null     
	//  335  669:areturn         
			}
		return null;
		obj2;
		obj = obj1;
		  goto _L8
_L7:
		obj1 = obj;
		avoid = ((Void []) (obj));
		obj2 = ((Object) (new android.graphics.BitmapFactory.Options()));
		obj1 = obj;
		avoid = ((Void []) (obj));
		obj2.inJustDecodeBounds = true;
		obj1 = obj;
		avoid = ((Void []) (obj));
		BitmapFactory.decodeStream(((InputStream) (obj)), ((android.graphics.Rect) (null)), ((android.graphics.BitmapFactory.Options) (obj2)));
		obj1 = obj;
		avoid = ((Void []) (obj));
		if(((android.graphics.BitmapFactory.Options) (obj2)).outWidth == 0) goto _L10; else goto _L9
_L9:
		obj1 = obj;
		avoid = ((Void []) (obj));
		j = ((android.graphics.BitmapFactory.Options) (obj2)).outHeight;
		if(j != 0) goto _L11; else goto _L10
_L11:
		avoid = ((Void []) (obj));
		((InputStream) (obj)).reset();
		  goto _L12
_L16:
		obj1 = obj;
		avoid = ((Void []) (obj));
		((InputStream) (obj)).close();
		obj1 = obj;
		avoid = ((Void []) (obj));
		obj = ((Object) (openInputStreamByScheme(mIconUri)));
		if(obj != null) goto _L12; else goto _L13
_L13:
		avoid = ((Void []) (new StringBuilder()));
		((StringBuilder) (avoid)).append("Unable to open: ");
		((StringBuilder) (avoid)).append(((Object) (mIconUri)));
		Log.w("MediaRouteCtrlDialog", ((StringBuilder) (avoid)).toString());
		if(obj != null)
			try
			{
				((InputStream) (obj)).close();
			}
	//* 336  670:astore_1        
	//* 337  671:goto            219
			// Misplaced declaration of an exception variable
			catch(Void avoid[])
	//* 338  674:astore_1        
			{
				return null;
	//  339  675:aconst_null     
	//  340  676:areturn         
			}
		return null;
		avoid;
		  goto _L14
		obj2;
		  goto _L8
_L12:
		obj1 = obj;
		avoid = ((Void []) (obj));
		obj2.inJustDecodeBounds = false;
		obj1 = obj;
		avoid = ((Void []) (obj));
		j = getDesiredArtHeight(((android.graphics.BitmapFactory.Options) (obj2)).outWidth, ((android.graphics.BitmapFactory.Options) (obj2)).outHeight);
		obj1 = obj;
		avoid = ((Void []) (obj));
		obj2.inSampleSize = Math.max(1, Integer.highestOneBit(((android.graphics.BitmapFactory.Options) (obj2)).outHeight / j));
		obj1 = obj;
		avoid = ((Void []) (obj));
		flag = isCancelled();
		if(flag)
		{
			if(obj != null)
				try
				{
					((InputStream) (obj)).close();
				}
				// Misplaced declaration of an exception variable
				catch(Void avoid[])
	//* 341  677:astore_1        
				{
					return null;
	//  342  678:aconst_null     
	//  343  679:areturn         
				}
			return null;
		}
		obj1 = obj;
		avoid = ((Void []) (obj));
		obj2 = ((Object) (BitmapFactory.decodeStream(((InputStream) (obj)), ((android.graphics.Rect) (null)), ((android.graphics.BitmapFactory.Options) (obj2)))));
		if(obj != null)
			try
			{
				((InputStream) (obj)).close();
			}
			// Misplaced declaration of an exception variable
			catch(Void avoid[]) { }
	//  344  680:astore_1        
		avoid = ((Void []) (obj2));
		  goto _L3
_L10:
		if(obj != null)
			try
			{
				((InputStream) (obj)).close();
			}
	//* 345  681:goto            429
			// Misplaced declaration of an exception variable
			catch(Void avoid[])
	//* 346  684:astore_1        
			{
				return null;
	//  347  685:aconst_null     
	//  348  686:areturn         
			}
		return null;
		avoid;
		obj = null;
		  goto _L14
		ioexception1;
		obj = null;
_L8:
		avoid = ((Void []) (obj));
		obj1 = ((Object) (new StringBuilder()));
		avoid = ((Void []) (obj));
		((StringBuilder) (obj1)).append("Unable to open: ");
		avoid = ((Void []) (obj));
		((StringBuilder) (obj1)).append(((Object) (mIconUri)));
		avoid = ((Void []) (obj));
		Log.w("MediaRouteCtrlDialog", ((StringBuilder) (obj1)).toString(), ((Throwable) (ioexception1)));
		if(obj != null)
			try
			{
				((InputStream) (obj)).close();
			}
			// Misplaced declaration of an exception variable
			catch(Void avoid[]) { }
	//  349  687:astore_1        
		  goto _L5
		exception;
		obj = ((Object) (avoid));
		avoid = ((Void []) (exception));
_L14:
		if(obj != null)
			try
			{
				((InputStream) (obj)).close();
			}
	//* 350  688:goto            544
			catch(IOException ioexception) { }
	//  351  691:astore          5
		throw avoid;
_L5:
		avoid = null;
_L3:
		if(MediaRouteControllerDialog.access$300(MediaRouteControllerDialog.this, ((Bitmap) (avoid))))
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
		if(true) goto _L16; else goto _L15
_L15:
	//* 352  693:goto            542
	}

	protected volatile Object doInBackground(Object aobj[])
	{
		return ((Object) (doInBackground((Void[])aobj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #253 <Class Void[]>
	//    3    5:invokevirtual   #255 <Method Bitmap doInBackground(Void[])>
	//    4    8:areturn         
	}

	public Bitmap getIconBitmap()
	{
		return mIconBitmap;
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field Bitmap mIconBitmap>
	//    2    4:areturn         
	}

	public Uri getIconUri()
	{
		return mIconUri;
	//    0    0:aload_0         
	//    1    1:getfield        #60  <Field Uri mIconUri>
	//    2    4:areturn         
	}

	protected void onPostExecute(Bitmap bitmap)
	{
		mFetchArtTask = null;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field MediaRouteControllerDialog this$0>
	//    2    4:aconst_null     
	//    3    5:putfield        #260 <Field MediaRouteControllerDialog$FetchArtTask MediaRouteControllerDialog.mFetchArtTask>
		if(!ObjectsCompat.equals(((Object) (mArtIconBitmap)), ((Object) (mIconBitmap))) || !ObjectsCompat.equals(((Object) (mArtIconUri)), ((Object) (mIconUri))))
	//*   4    8:aload_0         
	//*   5    9:getfield        #25  <Field MediaRouteControllerDialog this$0>
	//*   6   12:getfield        #263 <Field Bitmap MediaRouteControllerDialog.mArtIconBitmap>
	//*   7   15:aload_0         
	//*   8   16:getfield        #54  <Field Bitmap mIconBitmap>
	//*   9   19:invokestatic    #268 <Method boolean ObjectsCompat.equals(Object, Object)>
	//*  10   22:ifeq            42
	//*  11   25:aload_0         
	//*  12   26:getfield        #25  <Field MediaRouteControllerDialog this$0>
	//*  13   29:getfield        #271 <Field Uri MediaRouteControllerDialog.mArtIconUri>
	//*  14   32:aload_0         
	//*  15   33:getfield        #60  <Field Uri mIconUri>
	//*  16   36:invokestatic    #268 <Method boolean ObjectsCompat.equals(Object, Object)>
	//*  17   39:ifne            131
		{
			mArtIconBitmap = mIconBitmap;
	//   18   42:aload_0         
	//   19   43:getfield        #25  <Field MediaRouteControllerDialog this$0>
	//   20   46:aload_0         
	//   21   47:getfield        #54  <Field Bitmap mIconBitmap>
	//   22   50:putfield        #263 <Field Bitmap MediaRouteControllerDialog.mArtIconBitmap>
			mArtIconLoadedBitmap = bitmap;
	//   23   53:aload_0         
	//   24   54:getfield        #25  <Field MediaRouteControllerDialog this$0>
	//   25   57:aload_1         
	//   26   58:putfield        #274 <Field Bitmap MediaRouteControllerDialog.mArtIconLoadedBitmap>
			mArtIconUri = mIconUri;
	//   27   61:aload_0         
	//   28   62:getfield        #25  <Field MediaRouteControllerDialog this$0>
	//   29   65:aload_0         
	//   30   66:getfield        #60  <Field Uri mIconUri>
	//   31   69:putfield        #271 <Field Uri MediaRouteControllerDialog.mArtIconUri>
			mArtIconBackgroundColor = mBackgroundColor;
	//   32   72:aload_0         
	//   33   73:getfield        #25  <Field MediaRouteControllerDialog this$0>
	//   34   76:aload_0         
	//   35   77:getfield        #250 <Field int mBackgroundColor>
	//   36   80:putfield        #277 <Field int MediaRouteControllerDialog.mArtIconBackgroundColor>
			bitmap = ((Bitmap) (MediaRouteControllerDialog.this));
	//   37   83:aload_0         
	//   38   84:getfield        #25  <Field MediaRouteControllerDialog this$0>
	//   39   87:astore_1        
			boolean flag = true;
	//   40   88:iconst_1        
	//   41   89:istore_2        
			bitmap.mArtIconIsLoaded = true;
	//   42   90:aload_1         
	//   43   91:iconst_1        
	//   44   92:putfield        #280 <Field boolean MediaRouteControllerDialog.mArtIconIsLoaded>
			long l = SystemClock.uptimeMillis();
	//   45   95:invokestatic    #286 <Method long SystemClock.uptimeMillis()>
	//   46   98:lstore_3        
			long l1 = mStartTimeMillis;
	//   47   99:aload_0         
	//   48  100:getfield        #288 <Field long mStartTimeMillis>
	//   49  103:lstore          5
			bitmap = ((Bitmap) (MediaRouteControllerDialog.this));
	//   50  105:aload_0         
	//   51  106:getfield        #25  <Field MediaRouteControllerDialog this$0>
	//   52  109:astore_1        
			if(l - l1 <= 120L)
	//*  53  110:lload_3         
	//*  54  111:lload           5
	//*  55  113:lsub            
	//*  56  114:ldc2w           #11  <Long 120L>
	//*  57  117:lcmp            
	//*  58  118:ifle            124
	//*  59  121:goto            126
				flag = false;
	//   60  124:iconst_0        
	//   61  125:istore_2        
			((MediaRouteControllerDialog) (bitmap)).update(flag);
	//   62  126:aload_1         
	//   63  127:iload_2         
	//   64  128:invokevirtual   #292 <Method void MediaRouteControllerDialog.update(boolean)>
		}
	//   65  131:return          
	}

	protected volatile void onPostExecute(Object obj)
	{
		onPostExecute((Bitmap)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #208 <Class Bitmap>
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
	//    4    8:getfield        #25  <Field MediaRouteControllerDialog this$0>
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
	//    2    2:putfield        #25  <Field MediaRouteControllerDialog this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #28  <Method void AsyncTask()>
		Object obj = ((Object) (mDescription));
	//    5    9:aload_1         
	//    6   10:getfield        #32  <Field MediaDescriptionCompat MediaRouteControllerDialog.mDescription>
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
			obj = ((Object) (mDescription.getIconBitmap()));
	//   15   26:aload_1         
	//   16   27:getfield        #32  <Field MediaDescriptionCompat MediaRouteControllerDialog.mDescription>
	//   17   30:invokevirtual   #38  <Method Bitmap MediaDescriptionCompat.getIconBitmap()>
	//   18   33:astore_2        
		Bitmap bitmap = ((Bitmap) (obj));
	//   19   34:aload_2         
	//   20   35:astore_3        
		if(MediaRouteControllerDialog.access$300(MediaRouteControllerDialog.this, ((Bitmap) (obj))))
	//*  21   36:aload_1         
	//*  22   37:aload_2         
	//*  23   38:invokestatic    #42  <Method boolean MediaRouteControllerDialog.access$300(MediaRouteControllerDialog, Bitmap)>
	//*  24   41:ifeq            54
		{
			Log.w("MediaRouteCtrlDialog", "Can't fetch the given art bitmap because it's already recycled.");
	//   25   44:ldc1            #44  <String "MediaRouteCtrlDialog">
	//   26   46:ldc1            #46  <String "Can't fetch the given art bitmap because it's already recycled.">
	//   27   48:invokestatic    #52  <Method int Log.w(String, String)>
	//   28   51:pop             
			bitmap = null;
	//   29   52:aconst_null     
	//   30   53:astore_3        
		}
		mIconBitmap = bitmap;
	//   31   54:aload_0         
	//   32   55:aload_3         
	//   33   56:putfield        #54  <Field Bitmap mIconBitmap>
		if(mDescription == null)
	//*  34   59:aload_1         
	//*  35   60:getfield        #32  <Field MediaDescriptionCompat MediaRouteControllerDialog.mDescription>
	//*  36   63:ifnonnull       72
			mediaroutecontrollerdialog = ((MediaRouteControllerDialog) (obj1));
	//   37   66:aload           4
	//   38   68:astore_1        
		else
	//*  39   69:goto            80
			mediaroutecontrollerdialog = ((MediaRouteControllerDialog) (mDescription.getIconUri()));
	//   40   72:aload_1         
	//   41   73:getfield        #32  <Field MediaDescriptionCompat MediaRouteControllerDialog.mDescription>
	//   42   76:invokevirtual   #58  <Method Uri MediaDescriptionCompat.getIconUri()>
	//   43   79:astore_1        
		mIconUri = ((Uri) (MediaRouteControllerDialog.this));
	//   44   80:aload_0         
	//   45   81:aload_1         
	//   46   82:putfield        #60  <Field Uri mIconUri>
	//   47   85:return          
	}
}
