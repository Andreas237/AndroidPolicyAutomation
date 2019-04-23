// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appscend.overlaycontrollers;

import android.app.Activity;
import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import com.appscend.media.APSMediaPlayer;
import com.appscend.media.events.APSMediaOverlay;
import java.io.InputStream;
import java.net.*;
import java.util.HashMap;

// Referenced classes of package com.appscend.overlaycontrollers:
//			APSMediaPlayerImageOverlayController

public static class APSMediaPlayerImageOverlayController$getImageAsync extends AsyncTask
{

	public int calculateInSampleSize(android.graphics.BitmapFactory.Options options, int i, int j)
	{
		int l;
		int i1;
		l = options.outHeight;
	//    0    0:aload_1         
	//    1    1:getfield        #33  <Field int android.graphics.BitmapFactory$Options.outHeight>
	//    2    4:istore          5
		i1 = options.outWidth;
	//    3    6:aload_1         
	//    4    7:getfield        #36  <Field int android.graphics.BitmapFactory$Options.outWidth>
	//    5   10:istore          6
		if(l <= j && i1 <= i) goto _L2; else goto _L1
	//    6   12:iload           5
	//    7   14:iload_3         
	//    8   15:icmpgt          33
	//    9   18:iload           6
	//   10   20:iload_2         
	//   11   21:icmple          27
	//*  12   24:goto            33
_L2:
		i1 = 1;
	//   13   27:iconst_1        
	//   14   28:istore          6
		  goto _L3
	//*  15   30:goto            63
_L1:
		int k = 1;
	//   16   33:iconst_1        
	//   17   34:istore          4
_L7:
		int j1 = i1 / 2;
	//   18   36:iload           6
	//   19   38:iconst_2        
	//   20   39:idiv            
	//   21   40:istore          7
		if(j1 >= i) goto _L5; else goto _L4
	//   22   42:iload           7
	//   23   44:iload_2         
	//   24   45:icmpge          74
_L4:
		i1 = k;
	//   25   48:iload           4
	//   26   50:istore          6
		if(l / 2 < j) goto _L3; else goto _L5
	//   27   52:iload           5
	//   28   54:iconst_2        
	//   29   55:idiv            
	//   30   56:iload_3         
	//   31   57:icmplt          63
	//*  32   60:goto            74
_L3:
		if(i1 < 1)
	//*  33   63:iload           6
	//*  34   65:iconst_1        
	//*  35   66:icmpge          71
			return 1;
	//   36   69:iconst_1        
	//   37   70:ireturn         
		else
			return i1;
	//   38   71:iload           6
	//   39   73:ireturn         
_L5:
		l /= 2;
	//   40   74:iload           5
	//   41   76:iconst_2        
	//   42   77:idiv            
	//   43   78:istore          5
		k *= 2;
	//   44   80:iload           4
	//   45   82:iconst_2        
	//   46   83:imul            
	//   47   84:istore          4
		i1 = j1;
	//   48   86:iload           7
	//   49   88:istore          6
		if(true) goto _L7; else goto _L6
	//   50   90:goto            36
_L6:
	}

	protected transient Bitmap doInBackground(Void avoid[])
	{
		int i;
		int j;
		boolean flag;
		Object obj;
		i = ((Integer)params.get("viewWidth")).intValue();
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field HashMap params>
	//    2    4:ldc1            #44  <String "viewWidth">
	//    3    6:invokevirtual   #50  <Method Object HashMap.get(Object)>
	//    4    9:checkcast       #52  <Class Integer>
	//    5   12:invokevirtual   #56  <Method int Integer.intValue()>
	//    6   15:istore_2        
		j = ((Integer)params.get("viewHeight")).intValue();
	//    7   16:aload_0         
	//    8   17:getfield        #22  <Field HashMap params>
	//    9   20:ldc1            #58  <String "viewHeight">
	//   10   22:invokevirtual   #50  <Method Object HashMap.get(Object)>
	//   11   25:checkcast       #52  <Class Integer>
	//   12   28:invokevirtual   #56  <Method int Integer.intValue()>
	//   13   31:istore_3        
		obj = ((Object) (((String)params.get("url")).trim()));
	//   14   32:aload_0         
	//   15   33:getfield        #22  <Field HashMap params>
	//   16   36:ldc1            #60  <String "url">
	//   17   38:invokevirtual   #50  <Method Object HashMap.get(Object)>
	//   18   41:checkcast       #62  <Class String>
	//   19   44:invokevirtual   #66  <Method String String.trim()>
	//   20   47:astore          5
		flag = ((String) (obj)).startsWith("http");
	//   21   49:aload           5
	//   22   51:ldc1            #68  <String "http">
	//   23   53:invokevirtual   #72  <Method boolean String.startsWith(String)>
	//   24   56:istore          4
		avoid = null;
	//   25   58:aconst_null     
	//   26   59:astore_1        
		if(!flag) goto _L2; else goto _L1
	//   27   60:iload           4
	//   28   62:ifeq            353
_L1:
		Object obj1;
		obj1 = ((Object) (new URL(((String) (obj)))));
	//   29   65:new             #74  <Class URL>
	//   30   68:dup             
	//   31   69:aload           5
	//   32   71:invokespecial   #77  <Method void URL(String)>
	//   33   74:astore          6
		obj = ((Object) (new android.graphics.BitmapFactory.Options()));
	//   34   76:new             #29  <Class android.graphics.BitmapFactory$Options>
	//   35   79:dup             
	//   36   80:invokespecial   #78  <Method void android.graphics.BitmapFactory$Options()>
	//   37   83:astore          5
		HttpURLConnection httpurlconnection = (HttpURLConnection)((URL) (obj1)).openConnection();
	//   38   85:aload           6
	//   39   87:invokevirtual   #82  <Method URLConnection URL.openConnection()>
	//   40   90:checkcast       #84  <Class HttpURLConnection>
	//   41   93:astore          7
		((URLConnection) (httpurlconnection)).setDoInput(true);
	//   42   95:aload           7
	//   43   97:iconst_1        
	//   44   98:invokevirtual   #90  <Method void URLConnection.setDoInput(boolean)>
		((URLConnection) (httpurlconnection)).setConnectTimeout(5000);
	//   45  101:aload           7
	//   46  103:sipush          5000
	//   47  106:invokevirtual   #94  <Method void URLConnection.setConnectTimeout(int)>
		((URLConnection) (httpurlconnection)).setReadTimeout(20000);
	//   48  109:aload           7
	//   49  111:sipush          20000
	//   50  114:invokevirtual   #97  <Method void URLConnection.setReadTimeout(int)>
		((URLConnection) (httpurlconnection)).connect();
	//   51  117:aload           7
	//   52  119:invokevirtual   #100 <Method void URLConnection.connect()>
		((URLConnection) (httpurlconnection)).getInputStream();
	//   53  122:aload           7
	//   54  124:invokevirtual   #104 <Method InputStream URLConnection.getInputStream()>
	//   55  127:pop             
		if(i <= 0 || j <= 0)
			break MISSING_BLOCK_LABEL_219;
	//   56  128:iload_2         
	//   57  129:ifle            219
	//   58  132:iload_3         
	//   59  133:ifle            219
		obj.inJustDecodeBounds = true;
	//   60  136:aload           5
	//   61  138:iconst_1        
	//   62  139:putfield        #108 <Field boolean android.graphics.BitmapFactory$Options.inJustDecodeBounds>
		Object obj2 = ((Object) ((HttpURLConnection)((URL) (obj1)).openConnection()));
	//   63  142:aload           6
	//   64  144:invokevirtual   #82  <Method URLConnection URL.openConnection()>
	//   65  147:checkcast       #84  <Class HttpURLConnection>
	//   66  150:astore          7
		((URLConnection) (obj2)).setDoInput(true);
	//   67  152:aload           7
	//   68  154:iconst_1        
	//   69  155:invokevirtual   #90  <Method void URLConnection.setDoInput(boolean)>
		((URLConnection) (obj2)).setConnectTimeout(5000);
	//   70  158:aload           7
	//   71  160:sipush          5000
	//   72  163:invokevirtual   #94  <Method void URLConnection.setConnectTimeout(int)>
		((URLConnection) (obj2)).setReadTimeout(20000);
	//   73  166:aload           7
	//   74  168:sipush          20000
	//   75  171:invokevirtual   #97  <Method void URLConnection.setReadTimeout(int)>
		((URLConnection) (obj2)).connect();
	//   76  174:aload           7
	//   77  176:invokevirtual   #100 <Method void URLConnection.connect()>
		obj2 = ((Object) (((URLConnection) (obj2)).getInputStream()));
	//   78  179:aload           7
	//   79  181:invokevirtual   #104 <Method InputStream URLConnection.getInputStream()>
	//   80  184:astore          7
		BitmapFactory.decodeStream(((InputStream) (obj2)), ((android.graphics.Rect) (null)), ((android.graphics.BitmapFactory.Options) (obj)));
	//   81  186:aload           7
	//   82  188:aconst_null     
	//   83  189:aload           5
	//   84  191:invokestatic    #114 <Method Bitmap BitmapFactory.decodeStream(InputStream, android.graphics.Rect, android.graphics.BitmapFactory$Options)>
	//   85  194:pop             
		((InputStream) (obj2)).close();
	//   86  195:aload           7
	//   87  197:invokevirtual   #119 <Method void InputStream.close()>
		obj.inSampleSize = calculateInSampleSize(((android.graphics.BitmapFactory.Options) (obj)), i, j);
	//   88  200:aload           5
	//   89  202:aload_0         
	//   90  203:aload           5
	//   91  205:iload_2         
	//   92  206:iload_3         
	//   93  207:invokevirtual   #121 <Method int calculateInSampleSize(android.graphics.BitmapFactory$Options, int, int)>
	//   94  210:putfield        #124 <Field int android.graphics.BitmapFactory$Options.inSampleSize>
		obj.inJustDecodeBounds = false;
	//   95  213:aload           5
	//   96  215:iconst_0        
	//   97  216:putfield        #108 <Field boolean android.graphics.BitmapFactory$Options.inJustDecodeBounds>
		obj1 = ((Object) ((HttpURLConnection)((URL) (obj1)).openConnection()));
	//   98  219:aload           6
	//   99  221:invokevirtual   #82  <Method URLConnection URL.openConnection()>
	//  100  224:checkcast       #84  <Class HttpURLConnection>
	//  101  227:astore          6
		((URLConnection) (obj1)).setDoInput(true);
	//  102  229:aload           6
	//  103  231:iconst_1        
	//  104  232:invokevirtual   #90  <Method void URLConnection.setDoInput(boolean)>
		((URLConnection) (obj1)).setConnectTimeout(5000);
	//  105  235:aload           6
	//  106  237:sipush          5000
	//  107  240:invokevirtual   #94  <Method void URLConnection.setConnectTimeout(int)>
		((URLConnection) (obj1)).setReadTimeout(20000);
	//  108  243:aload           6
	//  109  245:sipush          20000
	//  110  248:invokevirtual   #97  <Method void URLConnection.setReadTimeout(int)>
		((URLConnection) (obj1)).connect();
	//  111  251:aload           6
	//  112  253:invokevirtual   #100 <Method void URLConnection.connect()>
		obj1 = ((Object) (((URLConnection) (obj1)).getInputStream()));
	//  113  256:aload           6
	//  114  258:invokevirtual   #104 <Method InputStream URLConnection.getInputStream()>
	//  115  261:astore          6
		obj.inDither = false;
	//  116  263:aload           5
	//  117  265:iconst_0        
	//  118  266:putfield        #127 <Field boolean android.graphics.BitmapFactory$Options.inDither>
		obj.inPurgeable = true;
	//  119  269:aload           5
	//  120  271:iconst_1        
	//  121  272:putfield        #130 <Field boolean android.graphics.BitmapFactory$Options.inPurgeable>
		obj.inInputShareable = true;
	//  122  275:aload           5
	//  123  277:iconst_1        
	//  124  278:putfield        #133 <Field boolean android.graphics.BitmapFactory$Options.inInputShareable>
		obj.inTempStorage = new byte[8192];
	//  125  281:aload           5
	//  126  283:sipush          8192
	//  127  286:newarray        byte[]
	//  128  288:putfield        #137 <Field byte[] android.graphics.BitmapFactory$Options.inTempStorage>
		obj = ((Object) (BitmapFactory.decodeStream(((InputStream) (obj1)), ((android.graphics.Rect) (null)), ((android.graphics.BitmapFactory.Options) (obj)))));
	//  129  291:aload           6
	//  130  293:aconst_null     
	//  131  294:aload           5
	//  132  296:invokestatic    #114 <Method Bitmap BitmapFactory.decodeStream(InputStream, android.graphics.Rect, android.graphics.BitmapFactory$Options)>
	//  133  299:astore          5
		if(obj1 == null)
			break MISSING_BLOCK_LABEL_311;
	//  134  301:aload           6
	//  135  303:ifnull          311
		((InputStream) (obj1)).close();
	//  136  306:aload           6
	//  137  308:invokevirtual   #119 <Method void InputStream.close()>
		return ((Bitmap) (obj));
	//  138  311:aload           5
	//  139  313:areturn         
		avoid;
	//  140  314:astore_1        
		if(obj1 == null)
			break MISSING_BLOCK_LABEL_325;
	//  141  315:aload           6
	//  142  317:ifnull          325
		((InputStream) (obj1)).close();
	//  143  320:aload           6
	//  144  322:invokevirtual   #119 <Method void InputStream.close()>
		throw avoid;
	//  145  325:aload_1         
	//  146  326:athrow          
_L7:
		if(obj1 == null) goto _L4; else goto _L3
	//  147  327:aload           6
	//  148  329:ifnull          521
_L3:
		((InputStream) (obj1)).close();
	//  149  332:aload           6
	//  150  334:invokevirtual   #119 <Method void InputStream.close()>
		return null;
	//  151  337:aconst_null     
	//  152  338:areturn         
_L6:
		avoid = null;
	//  153  339:aconst_null     
	//  154  340:astore_1        
_L8:
		if(avoid != null)
	//* 155  341:aload_1         
	//* 156  342:ifnull          351
		{
			((Bitmap) (avoid)).recycle();
	//  157  345:aload_1         
	//  158  346:invokevirtual   #142 <Method void Bitmap.recycle()>
			return null;
	//  159  349:aconst_null     
	//  160  350:areturn         
		} else
		{
			return ((Bitmap) (avoid));
	//  161  351:aload_1         
	//  162  352:areturn         
		}
_L2:
		obj1 = ((Object) (APSMediaPlayer.getInstance().getActivity().getBaseContext().getAssets().open((String)params.get("url"))));
	//  163  353:invokestatic    #148 <Method APSMediaPlayer APSMediaPlayer.getInstance()>
	//  164  356:invokevirtual   #152 <Method Activity APSMediaPlayer.getActivity()>
	//  165  359:invokevirtual   #158 <Method Context Activity.getBaseContext()>
	//  166  362:invokevirtual   #164 <Method AssetManager Context.getAssets()>
	//  167  365:aload_0         
	//  168  366:getfield        #22  <Field HashMap params>
	//  169  369:ldc1            #60  <String "url">
	//  170  371:invokevirtual   #50  <Method Object HashMap.get(Object)>
	//  171  374:checkcast       #62  <Class String>
	//  172  377:invokevirtual   #170 <Method InputStream AssetManager.open(String)>
	//  173  380:astore          6
		obj = ((Object) (new android.graphics.BitmapFactory.Options()));
	//  174  382:new             #29  <Class android.graphics.BitmapFactory$Options>
	//  175  385:dup             
	//  176  386:invokespecial   #78  <Method void android.graphics.BitmapFactory$Options()>
	//  177  389:astore          5
		if(i <= 0 || j <= 0)
			break MISSING_BLOCK_LABEL_433;
	//  178  391:iload_2         
	//  179  392:ifle            433
	//  180  395:iload_3         
	//  181  396:ifle            433
		obj.inJustDecodeBounds = true;
	//  182  399:aload           5
	//  183  401:iconst_1        
	//  184  402:putfield        #108 <Field boolean android.graphics.BitmapFactory$Options.inJustDecodeBounds>
		BitmapFactory.decodeStream(((InputStream) (obj1)), ((android.graphics.Rect) (null)), ((android.graphics.BitmapFactory.Options) (obj)));
	//  185  405:aload           6
	//  186  407:aconst_null     
	//  187  408:aload           5
	//  188  410:invokestatic    #114 <Method Bitmap BitmapFactory.decodeStream(InputStream, android.graphics.Rect, android.graphics.BitmapFactory$Options)>
	//  189  413:pop             
		obj.inSampleSize = calculateInSampleSize(((android.graphics.BitmapFactory.Options) (obj)), i, j);
	//  190  414:aload           5
	//  191  416:aload_0         
	//  192  417:aload           5
	//  193  419:iload_2         
	//  194  420:iload_3         
	//  195  421:invokevirtual   #121 <Method int calculateInSampleSize(android.graphics.BitmapFactory$Options, int, int)>
	//  196  424:putfield        #124 <Field int android.graphics.BitmapFactory$Options.inSampleSize>
		obj.inJustDecodeBounds = false;
	//  197  427:aload           5
	//  198  429:iconst_0        
	//  199  430:putfield        #108 <Field boolean android.graphics.BitmapFactory$Options.inJustDecodeBounds>
		obj.inDither = false;
	//  200  433:aload           5
	//  201  435:iconst_0        
	//  202  436:putfield        #127 <Field boolean android.graphics.BitmapFactory$Options.inDither>
		obj.inPurgeable = true;
	//  203  439:aload           5
	//  204  441:iconst_1        
	//  205  442:putfield        #130 <Field boolean android.graphics.BitmapFactory$Options.inPurgeable>
		obj.inInputShareable = true;
	//  206  445:aload           5
	//  207  447:iconst_1        
	//  208  448:putfield        #133 <Field boolean android.graphics.BitmapFactory$Options.inInputShareable>
		obj.inTempStorage = new byte[8192];
	//  209  451:aload           5
	//  210  453:sipush          8192
	//  211  456:newarray        byte[]
	//  212  458:putfield        #137 <Field byte[] android.graphics.BitmapFactory$Options.inTempStorage>
		obj = ((Object) (BitmapFactory.decodeStream(((InputStream) (obj1)), ((android.graphics.Rect) (null)), ((android.graphics.BitmapFactory.Options) (obj)))));
	//  213  461:aload           6
	//  214  463:aconst_null     
	//  215  464:aload           5
	//  216  466:invokestatic    #114 <Method Bitmap BitmapFactory.decodeStream(InputStream, android.graphics.Rect, android.graphics.BitmapFactory$Options)>
	//  217  469:astore          5
		if(obj1 == null)
			break MISSING_BLOCK_LABEL_481;
	//  218  471:aload           6
	//  219  473:ifnull          481
		((InputStream) (obj1)).close();
	//  220  476:aload           6
	//  221  478:invokevirtual   #119 <Method void InputStream.close()>
		return ((Bitmap) (obj));
	//  222  481:aload           5
	//  223  483:areturn         
		avoid;
	//  224  484:astore_1        
		if(obj1 == null)
			break MISSING_BLOCK_LABEL_495;
	//  225  485:aload           6
	//  226  487:ifnull          495
		((InputStream) (obj1)).close();
	//  227  490:aload           6
	//  228  492:invokevirtual   #119 <Method void InputStream.close()>
		throw avoid;
	//  229  495:aload_1         
	//  230  496:athrow          
_L10:
		if(obj1 == null) goto _L4; else goto _L5
	//  231  497:aload           6
	//  232  499:ifnull          521
_L5:
		((InputStream) (obj1)).close();
	//  233  502:aload           6
	//  234  504:invokevirtual   #119 <Method void InputStream.close()>
		return null;
	//  235  507:aconst_null     
	//  236  508:areturn         
_L9:
		avoid = null;
	//  237  509:aconst_null     
	//  238  510:astore_1        
_L11:
		if(avoid != null)
	//* 239  511:aload_1         
	//* 240  512:ifnull          521
		{
			((Bitmap) (avoid)).recycle();
	//  241  515:aload_1         
	//  242  516:invokevirtual   #142 <Method void Bitmap.recycle()>
			return null;
	//  243  519:aconst_null     
	//  244  520:areturn         
		}
_L4:
		return ((Bitmap) (avoid));
	//  245  521:aload_1         
	//  246  522:areturn         
		avoid;
	//  247  523:astore_1        
		  goto _L6
	//* 248  524:goto            339
		obj;
	//  249  527:astore          5
		  goto _L7
	//* 250  529:goto            327
		avoid;
	//  251  532:astore_1        
		avoid = ((Void []) (obj));
	//  252  533:aload           5
	//  253  535:astore_1        
		  goto _L8
	//* 254  536:goto            341
		avoid;
	//  255  539:astore_1        
		  goto _L9
	//* 256  540:goto            509
		obj;
	//  257  543:astore          5
		  goto _L10
	//* 258  545:goto            497
		avoid;
	//  259  548:astore_1        
		avoid = ((Void []) (obj));
	//  260  549:aload           5
	//  261  551:astore_1        
		  goto _L11
	//* 262  552:goto            511
	}

	protected volatile Object doInBackground(Object aobj[])
	{
		return ((Object) (doInBackground((Void[])aobj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #173 <Class Void[]>
	//    3    5:invokevirtual   #175 <Method Bitmap doInBackground(Void[])>
	//    4    8:areturn         
	}

	protected void onPostExecute(Bitmap bitmap)
	{
		overlay.updateState(com.appscend.media.events.APSMediaEvent.APSMediaEventState.APSMediaEventStatePreloaded);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field APSMediaOverlay overlay>
	//    2    4:getstatic       #183 <Field com.appscend.media.events.APSMediaEvent$APSMediaEventState com.appscend.media.events.APSMediaEvent$APSMediaEventState.APSMediaEventStatePreloaded>
	//    3    7:invokevirtual   #189 <Method void APSMediaOverlay.updateState(com.appscend.media.events.APSMediaEvent$APSMediaEventState)>
		((APSMediaPlayerImageOverlayController)overlay.controller).setBitmap(bitmap);
	//    4   10:aload_0         
	//    5   11:getfield        #20  <Field APSMediaOverlay overlay>
	//    6   14:getfield        #193 <Field APSMediaPlayerOverlayController APSMediaOverlay.controller>
	//    7   17:checkcast       #7   <Class APSMediaPlayerImageOverlayController>
	//    8   20:aload_1         
	//    9   21:invokevirtual   #196 <Method void APSMediaPlayerImageOverlayController.setBitmap(Bitmap)>
	//   10   24:return          
	}

	protected volatile void onPostExecute(Object obj)
	{
		onPostExecute((Bitmap)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #139 <Class Bitmap>
	//    3    5:invokevirtual   #199 <Method void onPostExecute(Bitmap)>
	//    4    8:return          
	}

	public APSMediaOverlay overlay;
	public HashMap params;

	public APSMediaPlayerImageOverlayController$getImageAsync(HashMap hashmap, APSMediaOverlay apsmediaoverlay)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void AsyncTask()>
		overlay = apsmediaoverlay;
	//    2    4:aload_0         
	//    3    5:aload_2         
	//    4    6:putfield        #20  <Field APSMediaOverlay overlay>
		params = hashmap;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #22  <Field HashMap params>
	//    8   14:return          
	}
}
