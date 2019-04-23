// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appscend.overlaycontrollers;

import android.app.Activity;
import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.*;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.appscend.media.APSMediaPlayer;
import com.appscend.media.events.APSMediaOverlay;
import java.io.InputStream;
import java.net.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.ExecutionException;

// Referenced classes of package com.appscend.overlaycontrollers:
//			APSMediaPlayerClosableOverlayController, DismissActionContainer

public class APSMediaPlayerImageOverlayController extends APSMediaPlayerClosableOverlayController
{
	public static class getImageAsync extends AsyncTask
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

		protected void onPostExecute(Bitmap bitmap1)
		{
			overlay.updateState(com.appscend.media.events.APSMediaEvent.APSMediaEventState.APSMediaEventStatePreloaded);
		//    0    0:aload_0         
		//    1    1:getfield        #20  <Field APSMediaOverlay overlay>
		//    2    4:getstatic       #183 <Field com.appscend.media.events.APSMediaEvent$APSMediaEventState com.appscend.media.events.APSMediaEvent$APSMediaEventState.APSMediaEventStatePreloaded>
		//    3    7:invokevirtual   #189 <Method void APSMediaOverlay.updateState(com.appscend.media.events.APSMediaEvent$APSMediaEventState)>
			((APSMediaPlayerImageOverlayController)overlay.controller).setBitmap(bitmap1);
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

		public getImageAsync(HashMap hashmap, APSMediaOverlay apsmediaoverlay)
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


	public APSMediaPlayerImageOverlayController()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #51  <Method void APSMediaPlayerClosableOverlayController()>
		bitmap = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #53  <Field Bitmap bitmap>
	//    5    9:return          
	}

	public void addViewToContainer(ViewGroup viewgroup)
	{
		viewgroup.addView(((View) (_viewHolder)));
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #66  <Field RelativeLayout _viewHolder>
	//    3    5:invokevirtual   #72  <Method void ViewGroup.addView(View)>
		addCloseButtonWithParameters(((ViewGroup) (_viewHolder)), overlay.parameters);
	//    4    8:aload_0         
	//    5    9:aload_0         
	//    6   10:getfield        #66  <Field RelativeLayout _viewHolder>
	//    7   13:aload_0         
	//    8   14:getfield        #76  <Field APSMediaOverlay overlay>
	//    9   17:getfield        #82  <Field HashMap APSMediaOverlay.parameters>
	//   10   20:invokevirtual   #86  <Method void addCloseButtonWithParameters(ViewGroup, HashMap)>
	//   11   23:return          
	}

	public float getAlpha()
	{
		return 1.0F;
	//    0    0:fconst_1        
	//    1    1:freturn         
	}

	public View getView()
	{
		return ((View) (_viewHolder));
	//    0    0:aload_0         
	//    1    1:getfield        #66  <Field RelativeLayout _viewHolder>
	//    2    4:areturn         
	}

	public void hideOverlay()
	{
		_viewHolder.removeAllViews();
	//    0    0:aload_0         
	//    1    1:getfield        #66  <Field RelativeLayout _viewHolder>
	//    2    4:invokevirtual   #96  <Method void RelativeLayout.removeAllViews()>
	//    3    7:return          
	}

	public void load(Context context)
	{
		_viewHolder = new RelativeLayout(context);
	//    0    0:aload_0         
	//    1    1:new             #93  <Class RelativeLayout>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:invokespecial   #102 <Method void RelativeLayout(Context)>
	//    5    9:putfield        #66  <Field RelativeLayout _viewHolder>
		_view = new ImageView(context);
	//    6   12:aload_0         
	//    7   13:new             #104 <Class ImageView>
	//    8   16:dup             
	//    9   17:aload_1         
	//   10   18:invokespecial   #105 <Method void ImageView(Context)>
	//   11   21:putfield        #62  <Field ImageView _view>
		_view.setScaleType(android.widget.ImageView.ScaleType.FIT_CENTER);
	//   12   24:aload_0         
	//   13   25:getfield        #62  <Field ImageView _view>
	//   14   28:getstatic       #111 <Field android.widget.ImageView$ScaleType android.widget.ImageView$ScaleType.FIT_CENTER>
	//   15   31:invokevirtual   #115 <Method void ImageView.setScaleType(android.widget.ImageView$ScaleType)>
		context = ((Context) (_view));
	//   16   34:aload_0         
	//   17   35:getfield        #62  <Field ImageView _view>
	//   18   38:astore_1        
		int i;
		if(overlay.parameters.get("imageOverlayBackgroundColor") != null)
	//*  19   39:aload_0         
	//*  20   40:getfield        #76  <Field APSMediaOverlay overlay>
	//*  21   43:getfield        #82  <Field HashMap APSMediaOverlay.parameters>
	//*  22   46:ldc1            #18  <String "imageOverlayBackgroundColor">
	//*  23   48:invokevirtual   #121 <Method Object HashMap.get(Object)>
	//*  24   51:ifnull          76
			i = Color.parseColor((String)overlay.parameters.get("imageOverlayBackgroundColor"));
	//   25   54:aload_0         
	//   26   55:getfield        #76  <Field APSMediaOverlay overlay>
	//   27   58:getfield        #82  <Field HashMap APSMediaOverlay.parameters>
	//   28   61:ldc1            #18  <String "imageOverlayBackgroundColor">
	//   29   63:invokevirtual   #121 <Method Object HashMap.get(Object)>
	//   30   66:checkcast       #123 <Class String>
	//   31   69:invokestatic    #129 <Method int Color.parseColor(String)>
	//   32   72:istore_2        
		else
	//*  33   73:goto            78
			i = 0;
	//   34   76:iconst_0        
	//   35   77:istore_2        
		((ImageView) (context)).setBackgroundColor(i);
	//   36   78:aload_1         
	//   37   79:iload_2         
	//   38   80:invokevirtual   #133 <Method void ImageView.setBackgroundColor(int)>
		_view.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -1));
	//   39   83:aload_0         
	//   40   84:getfield        #62  <Field ImageView _view>
	//   41   87:new             #135 <Class android.view.ViewGroup$LayoutParams>
	//   42   90:dup             
	//   43   91:iconst_m1       
	//   44   92:iconst_m1       
	//   45   93:invokespecial   #138 <Method void android.view.ViewGroup$LayoutParams(int, int)>
	//   46   96:invokevirtual   #142 <Method void ImageView.setLayoutParams(android.view.ViewGroup$LayoutParams)>
		if(overlay.parameters.get("clickThrough") != null)
	//*  47   99:aload_0         
	//*  48  100:getfield        #76  <Field APSMediaOverlay overlay>
	//*  49  103:getfield        #82  <Field HashMap APSMediaOverlay.parameters>
	//*  50  106:ldc1            #21  <String "clickThrough">
	//*  51  108:invokevirtual   #121 <Method Object HashMap.get(Object)>
	//*  52  111:ifnull          129
			_view.setOnClickListener(new android.view.View.OnClickListener() {

				public void onClick(View view)
				{
					if(APSMediaPlayer.getInstance().openURL((String)overlay.parameters.get("clickThrough")))
				//*   0    0:invokestatic    #29  <Method APSMediaPlayer APSMediaPlayer.getInstance()>
				//*   1    3:aload_0         
				//*   2    4:getfield        #17  <Field APSMediaPlayerImageOverlayController this$0>
				//*   3    7:getfield        #33  <Field APSMediaOverlay APSMediaPlayerImageOverlayController.overlay>
				//*   4   10:getfield        #39  <Field HashMap APSMediaOverlay.parameters>
				//*   5   13:ldc1            #41  <String "clickThrough">
				//*   6   15:invokevirtual   #47  <Method Object HashMap.get(Object)>
				//*   7   18:checkcast       #49  <Class String>
				//*   8   21:invokevirtual   #53  <Method boolean APSMediaPlayer.openURL(String)>
				//*   9   24:ifeq            125
					{
						if(overlay.parameters.get("clickTracking") != null)
				//*  10   27:aload_0         
				//*  11   28:getfield        #17  <Field APSMediaPlayerImageOverlayController this$0>
				//*  12   31:getfield        #33  <Field APSMediaOverlay APSMediaPlayerImageOverlayController.overlay>
				//*  13   34:getfield        #39  <Field HashMap APSMediaOverlay.parameters>
				//*  14   37:ldc1            #55  <String "clickTracking">
				//*  15   39:invokevirtual   #47  <Method Object HashMap.get(Object)>
				//*  16   42:ifnull          81
							APSMediaPlayer.getInstance().trackforEvent((ArrayList)overlay.parameters.get("clickTracking"), "icon clickTracking", com.appscend.media.APSMediaTrackingEvents.MediaEventType.CLICK, ((com.appscend.media.events.APSMediaEvent) (overlay)));
				//   17   45:invokestatic    #29  <Method APSMediaPlayer APSMediaPlayer.getInstance()>
				//   18   48:aload_0         
				//   19   49:getfield        #17  <Field APSMediaPlayerImageOverlayController this$0>
				//   20   52:getfield        #33  <Field APSMediaOverlay APSMediaPlayerImageOverlayController.overlay>
				//   21   55:getfield        #39  <Field HashMap APSMediaOverlay.parameters>
				//   22   58:ldc1            #55  <String "clickTracking">
				//   23   60:invokevirtual   #47  <Method Object HashMap.get(Object)>
				//   24   63:checkcast       #57  <Class ArrayList>
				//   25   66:ldc1            #59  <String "icon clickTracking">
				//   26   68:getstatic       #65  <Field com.appscend.media.APSMediaTrackingEvents$MediaEventType com.appscend.media.APSMediaTrackingEvents$MediaEventType.CLICK>
				//   27   71:aload_0         
				//   28   72:getfield        #17  <Field APSMediaPlayerImageOverlayController this$0>
				//   29   75:getfield        #33  <Field APSMediaOverlay APSMediaPlayerImageOverlayController.overlay>
				//   30   78:invokevirtual   #69  <Method void APSMediaPlayer.trackforEvent(ArrayList, String, com.appscend.media.APSMediaTrackingEvents$MediaEventType, com.appscend.media.events.APSMediaEvent)>
						if(dismissedAction == com.appscend.media.APSMediaBuilder.APSWebviewDismissedAction.APSHideOverlayOnWebviewDismiss)
				//*  31   81:aload_0         
				//*  32   82:getfield        #17  <Field APSMediaPlayerImageOverlayController this$0>
				//*  33   85:invokestatic    #73  <Method com.appscend.media.APSMediaBuilder$APSWebviewDismissedAction APSMediaPlayerImageOverlayController.access$000(APSMediaPlayerImageOverlayController)>
				//*  34   88:getstatic       #79  <Field com.appscend.media.APSMediaBuilder$APSWebviewDismissedAction com.appscend.media.APSMediaBuilder$APSWebviewDismissedAction.APSHideOverlayOnWebviewDismiss>
				//*  35   91:if_acmpne       112
						{
							DismissActionContainer.INSTANCE.setDismissAction(dismissedAction, ((APSMediaPlayerOverlayController) (APSMediaPlayerImageOverlayController.this)));
				//   36   94:getstatic       #85  <Field DismissActionContainer DismissActionContainer.INSTANCE>
				//   37   97:aload_0         
				//   38   98:getfield        #17  <Field APSMediaPlayerImageOverlayController this$0>
				//   39  101:invokestatic    #73  <Method com.appscend.media.APSMediaBuilder$APSWebviewDismissedAction APSMediaPlayerImageOverlayController.access$000(APSMediaPlayerImageOverlayController)>
				//   40  104:aload_0         
				//   41  105:getfield        #17  <Field APSMediaPlayerImageOverlayController this$0>
				//   42  108:invokevirtual   #89  <Method void DismissActionContainer.setDismissAction(com.appscend.media.APSMediaBuilder$APSWebviewDismissedAction, APSMediaPlayerOverlayController)>
							return;
				//   43  111:return          
						}
						DismissActionContainer.INSTANCE.setDismissAction(dismissedAction);
				//   44  112:getstatic       #85  <Field DismissActionContainer DismissActionContainer.INSTANCE>
				//   45  115:aload_0         
				//   46  116:getfield        #17  <Field APSMediaPlayerImageOverlayController this$0>
				//   47  119:invokestatic    #73  <Method com.appscend.media.APSMediaBuilder$APSWebviewDismissedAction APSMediaPlayerImageOverlayController.access$000(APSMediaPlayerImageOverlayController)>
				//   48  122:invokevirtual   #92  <Method void DismissActionContainer.setDismissAction(com.appscend.media.APSMediaBuilder$APSWebviewDismissedAction)>
					}
				//   49  125:return          
				}

				final APSMediaPlayerImageOverlayController this$0;

			
			{
				this$0 = APSMediaPlayerImageOverlayController.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field APSMediaPlayerImageOverlayController this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//   53  114:aload_0         
	//   54  115:getfield        #62  <Field ImageView _view>
	//   55  118:new             #6   <Class APSMediaPlayerImageOverlayController$1>
	//   56  121:dup             
	//   57  122:aload_0         
	//   58  123:invokespecial   #145 <Method void APSMediaPlayerImageOverlayController$1(APSMediaPlayerImageOverlayController)>
	//   59  126:invokevirtual   #149 <Method void ImageView.setOnClickListener(android.view.View$OnClickListener)>
		try
		{
			_view.setScaleType(android.widget.ImageView.ScaleType.CENTER);
	//   60  129:aload_0         
	//   61  130:getfield        #62  <Field ImageView _view>
	//   62  133:getstatic       #152 <Field android.widget.ImageView$ScaleType android.widget.ImageView$ScaleType.CENTER>
	//   63  136:invokevirtual   #115 <Method void ImageView.setScaleType(android.widget.ImageView$ScaleType)>
			_view.setImageResource(com.appscend.vastplayer.R.drawable.loading);
	//   64  139:aload_0         
	//   65  140:getfield        #62  <Field ImageView _view>
	//   66  143:getstatic       #158 <Field int com.appscend.vastplayer.R$drawable.loading>
	//   67  146:invokevirtual   #161 <Method void ImageView.setImageResource(int)>
			APSMediaPlayer.getInstance().getHandler().post(new Runnable() {

				public void run()
				{
					if(_view.getDrawable() instanceof AnimationDrawable)
				//*   0    0:aload_0         
				//*   1    1:getfield        #17  <Field APSMediaPlayerImageOverlayController this$0>
				//*   2    4:invokestatic    #26  <Method ImageView APSMediaPlayerImageOverlayController.access$100(APSMediaPlayerImageOverlayController)>
				//*   3    7:invokevirtual   #32  <Method Drawable ImageView.getDrawable()>
				//*   4   10:instanceof      #34  <Class AnimationDrawable>
				//*   5   13:ifeq            32
						((AnimationDrawable)_view.getDrawable()).start();
				//    6   16:aload_0         
				//    7   17:getfield        #17  <Field APSMediaPlayerImageOverlayController this$0>
				//    8   20:invokestatic    #26  <Method ImageView APSMediaPlayerImageOverlayController.access$100(APSMediaPlayerImageOverlayController)>
				//    9   23:invokevirtual   #32  <Method Drawable ImageView.getDrawable()>
				//   10   26:checkcast       #34  <Class AnimationDrawable>
				//   11   29:invokevirtual   #37  <Method void AnimationDrawable.start()>
				//   12   32:return          
				}

				final APSMediaPlayerImageOverlayController this$0;

			
			{
				this$0 = APSMediaPlayerImageOverlayController.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field APSMediaPlayerImageOverlayController this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//   68  149:invokestatic    #167 <Method APSMediaPlayer APSMediaPlayer.getInstance()>
	//   69  152:invokevirtual   #171 <Method Handler APSMediaPlayer.getHandler()>
	//   70  155:new             #8   <Class APSMediaPlayerImageOverlayController$2>
	//   71  158:dup             
	//   72  159:aload_0         
	//   73  160:invokespecial   #172 <Method void APSMediaPlayerImageOverlayController$2(APSMediaPlayerImageOverlayController)>
	//   74  163:invokevirtual   #178 <Method boolean Handler.post(Runnable)>
	//   75  166:pop             
		}
	//*  76  167:aload_0         
	//*  77  168:getfield        #66  <Field RelativeLayout _viewHolder>
	//*  78  171:aload_0         
	//*  79  172:getfield        #62  <Field ImageView _view>
	//*  80  175:invokevirtual   #179 <Method void RelativeLayout.addView(View)>
	//*  81  178:aload_0         
	//*  82  179:getfield        #76  <Field APSMediaOverlay overlay>
	//*  83  182:getfield        #82  <Field HashMap APSMediaOverlay.parameters>
	//*  84  185:ldc1            #39  <String "dismissAction">
	//*  85  187:invokevirtual   #121 <Method Object HashMap.get(Object)>
	//*  86  190:ifnonnull       203
	//*  87  193:aload_0         
	//*  88  194:getstatic       #184 <Field com.appscend.media.APSMediaBuilder$APSWebviewDismissedAction com.appscend.media.APSMediaBuilder$APSWebviewDismissedAction.APSDoNothingOnWebviewDismiss>
	//*  89  197:putfield        #58  <Field com.appscend.media.APSMediaBuilder$APSWebviewDismissedAction dismissedAction>
	//*  90  200:goto            313
	//*  91  203:aload_0         
	//*  92  204:getfield        #76  <Field APSMediaOverlay overlay>
	//*  93  207:getfield        #82  <Field HashMap APSMediaOverlay.parameters>
	//*  94  210:ldc1            #39  <String "dismissAction">
	//*  95  212:invokevirtual   #121 <Method Object HashMap.get(Object)>
	//*  96  215:instanceof      #181 <Class com.appscend.media.APSMediaBuilder$APSWebviewDismissedAction>
	//*  97  218:ifeq            243
	//*  98  221:aload_0         
	//*  99  222:aload_0         
	//* 100  223:getfield        #76  <Field APSMediaOverlay overlay>
	//* 101  226:getfield        #82  <Field HashMap APSMediaOverlay.parameters>
	//* 102  229:ldc1            #39  <String "dismissAction">
	//* 103  231:invokevirtual   #121 <Method Object HashMap.get(Object)>
	//* 104  234:checkcast       #181 <Class com.appscend.media.APSMediaBuilder$APSWebviewDismissedAction>
	//* 105  237:putfield        #58  <Field com.appscend.media.APSMediaBuilder$APSWebviewDismissedAction dismissedAction>
	//* 106  240:goto            313
	//* 107  243:aload_0         
	//* 108  244:getfield        #76  <Field APSMediaOverlay overlay>
	//* 109  247:getfield        #82  <Field HashMap APSMediaOverlay.parameters>
	//* 110  250:ldc1            #39  <String "dismissAction">
	//* 111  252:invokevirtual   #121 <Method Object HashMap.get(Object)>
	//* 112  255:checkcast       #123 <Class String>
	//* 113  258:astore_1        
	//* 114  259:aload_1         
	//* 115  260:ldc1            #186 <String "doNothing">
	//* 116  262:invokevirtual   #190 <Method boolean String.equals(Object)>
	//* 117  265:ifeq            278
	//* 118  268:aload_0         
	//* 119  269:getstatic       #184 <Field com.appscend.media.APSMediaBuilder$APSWebviewDismissedAction com.appscend.media.APSMediaBuilder$APSWebviewDismissedAction.APSDoNothingOnWebviewDismiss>
	//* 120  272:putfield        #58  <Field com.appscend.media.APSMediaBuilder$APSWebviewDismissedAction dismissedAction>
	//* 121  275:goto            313
	//* 122  278:aload_1         
	//* 123  279:ldc1            #192 <String "skipUnit">
	//* 124  281:invokevirtual   #190 <Method boolean String.equals(Object)>
	//* 125  284:ifeq            297
	//* 126  287:aload_0         
	//* 127  288:getstatic       #195 <Field com.appscend.media.APSMediaBuilder$APSWebviewDismissedAction com.appscend.media.APSMediaBuilder$APSWebviewDismissedAction.APSSkipUnitOnWebviewDismiss>
	//* 128  291:putfield        #58  <Field com.appscend.media.APSMediaBuilder$APSWebviewDismissedAction dismissedAction>
	//* 129  294:goto            313
	//* 130  297:aload_1         
	//* 131  298:ldc1            #197 <String "closeOverlay">
	//* 132  300:invokevirtual   #190 <Method boolean String.equals(Object)>
	//* 133  303:ifeq            313
	//* 134  306:aload_0         
	//* 135  307:getstatic       #200 <Field com.appscend.media.APSMediaBuilder$APSWebviewDismissedAction com.appscend.media.APSMediaBuilder$APSWebviewDismissedAction.APSHideOverlayOnWebviewDismiss>
	//* 136  310:putfield        #58  <Field com.appscend.media.APSMediaBuilder$APSWebviewDismissedAction dismissedAction>
	//* 137  313:aload_0         
	//* 138  314:getfield        #53  <Field Bitmap bitmap>
	//* 139  317:astore_1        
	//* 140  318:aload_1         
	//* 141  319:ifnull          327
	//* 142  322:aload_0         
	//* 143  323:aload_1         
	//* 144  324:invokevirtual   #204 <Method void setBitmapOnView(Bitmap)>
	//* 145  327:return          
		// Misplaced declaration of an exception variable
		catch(Context context) { }
	//  146  328:astore_1        
		_viewHolder.addView(((View) (_view)));
		if(overlay.parameters.get("dismissAction") == null)
			dismissedAction = com.appscend.media.APSMediaBuilder.APSWebviewDismissedAction.APSDoNothingOnWebviewDismiss;
		else
		if(overlay.parameters.get("dismissAction") instanceof com.appscend.media.APSMediaBuilder.APSWebviewDismissedAction)
		{
			dismissedAction = (com.appscend.media.APSMediaBuilder.APSWebviewDismissedAction)overlay.parameters.get("dismissAction");
		} else
		{
			context = ((Context) ((String)overlay.parameters.get("dismissAction")));
			if(((String) (context)).equals("doNothing"))
				dismissedAction = com.appscend.media.APSMediaBuilder.APSWebviewDismissedAction.APSDoNothingOnWebviewDismiss;
			else
			if(((String) (context)).equals("skipUnit"))
				dismissedAction = com.appscend.media.APSMediaBuilder.APSWebviewDismissedAction.APSSkipUnitOnWebviewDismiss;
			else
			if(((String) (context)).equals("closeOverlay"))
				dismissedAction = com.appscend.media.APSMediaBuilder.APSWebviewDismissedAction.APSHideOverlayOnWebviewDismiss;
		}
		context = ((Context) (bitmap));
		if(context != null)
			setBitmapOnView(((Bitmap) (context)));
	//* 147  329:goto            167
	}

	public void preload()
	{
		if(overlay.parameters.get("url") != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #76  <Field APSMediaOverlay overlay>
	//*   2    4:getfield        #82  <Field HashMap APSMediaOverlay.parameters>
	//*   3    7:ldc1            #30  <String "url">
	//*   4    9:invokevirtual   #121 <Method Object HashMap.get(Object)>
	//*   5   12:ifnull          62
			try
			{
				setBitmapOnView((Bitmap)(new getImageAsync(overlay.parameters, overlay)).execute(((Object []) (new Void[0]))).get());
	//    6   15:aload_0         
	//    7   16:new             #10  <Class APSMediaPlayerImageOverlayController$getImageAsync>
	//    8   19:dup             
	//    9   20:aload_0         
	//   10   21:getfield        #76  <Field APSMediaOverlay overlay>
	//   11   24:getfield        #82  <Field HashMap APSMediaOverlay.parameters>
	//   12   27:aload_0         
	//   13   28:getfield        #76  <Field APSMediaOverlay overlay>
	//   14   31:invokespecial   #212 <Method void APSMediaPlayerImageOverlayController$getImageAsync(HashMap, APSMediaOverlay)>
	//   15   34:iconst_0        
	//   16   35:anewarray       Void[]
	//   17   38:invokevirtual   #218 <Method AsyncTask APSMediaPlayerImageOverlayController$getImageAsync.execute(Object[])>
	//   18   41:invokevirtual   #223 <Method Object AsyncTask.get()>
	//   19   44:checkcast       #225 <Class Bitmap>
	//   20   47:invokevirtual   #204 <Method void setBitmapOnView(Bitmap)>
				return;
	//   21   50:return          
			}
	//*  22   51:astore_1        
	//*  23   52:aload_1         
	//*  24   53:invokevirtual   #228 <Method void ExecutionException.printStackTrace()>
	//*  25   56:return          
			catch(InterruptedException interruptedexception)
	//*  26   57:astore_1        
			{
				interruptedexception.printStackTrace();
	//   27   58:aload_1         
	//   28   59:invokevirtual   #229 <Method void InterruptedException.printStackTrace()>
			}
			catch(ExecutionException executionexception)
			{
				executionexception.printStackTrace();
				return;
			}
	//   29   62:return          
	}

	public void setBitmap(Bitmap bitmap1)
	{
		bitmap = bitmap1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #53  <Field Bitmap bitmap>
	//    3    5:return          
	}

	public void setBitmapOnView(Bitmap bitmap1)
	{
		ImageView imageview = _view;
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field ImageView _view>
	//    2    4:astore          6
		if(imageview != null)
	//*   3    6:aload           6
	//*   4    8:ifnull          65
		{
			if(imageview.getBackground() != null)
	//*   5   11:aload           6
	//*   6   13:invokevirtual   #237 <Method Drawable ImageView.getBackground()>
	//*   7   16:ifnull          57
			{
				_view.getBackground().setCallback(((android.graphics.drawable.Drawable.Callback) (null)));
	//    8   19:aload_0         
	//    9   20:getfield        #62  <Field ImageView _view>
	//   10   23:invokevirtual   #237 <Method Drawable ImageView.getBackground()>
	//   11   26:aconst_null     
	//   12   27:invokevirtual   #243 <Method void Drawable.setCallback(android.graphics.drawable.Drawable$Callback)>
				if(android.os.Build.VERSION.SDK_INT < 16)
	//*  13   30:getstatic       #248 <Field int android.os.Build$VERSION.SDK_INT>
	//*  14   33:bipush          16
	//*  15   35:icmpge          49
					_view.setBackgroundDrawable(((Drawable) (null)));
	//   16   38:aload_0         
	//   17   39:getfield        #62  <Field ImageView _view>
	//   18   42:aconst_null     
	//   19   43:invokevirtual   #252 <Method void ImageView.setBackgroundDrawable(Drawable)>
				else
	//*  20   46:goto            57
					_view.setBackground(((Drawable) (null)));
	//   21   49:aload_0         
	//   22   50:getfield        #62  <Field ImageView _view>
	//   23   53:aconst_null     
	//   24   54:invokevirtual   #255 <Method void ImageView.setBackground(Drawable)>
			}
			_view.setImageBitmap(((Bitmap) (null)));
	//   25   57:aload_0         
	//   26   58:getfield        #62  <Field ImageView _view>
	//   27   61:aconst_null     
	//   28   62:invokevirtual   #258 <Method void ImageView.setImageBitmap(Bitmap)>
		}
		if(bitmap1 != null)
	//*  29   65:aload_1         
	//*  30   66:ifnull          527
		{
			if(overlay.parameters.get("viewTracking") != null)
	//*  31   69:aload_0         
	//*  32   70:getfield        #76  <Field APSMediaOverlay overlay>
	//*  33   73:getfield        #82  <Field HashMap APSMediaOverlay.parameters>
	//*  34   76:ldc1            #36  <String "viewTracking">
	//*  35   78:invokevirtual   #121 <Method Object HashMap.get(Object)>
	//*  36   81:ifnull          115
				APSMediaPlayer.getInstance().trackforEvent((ArrayList)overlay.parameters.get("viewTracking"), "icon view", com.appscend.media.APSMediaTrackingEvents.MediaEventType.CREATIVE_VIEW, ((com.appscend.media.events.APSMediaEvent) (overlay)));
	//   37   84:invokestatic    #167 <Method APSMediaPlayer APSMediaPlayer.getInstance()>
	//   38   87:aload_0         
	//   39   88:getfield        #76  <Field APSMediaOverlay overlay>
	//   40   91:getfield        #82  <Field HashMap APSMediaOverlay.parameters>
	//   41   94:ldc1            #36  <String "viewTracking">
	//   42   96:invokevirtual   #121 <Method Object HashMap.get(Object)>
	//   43   99:checkcast       #260 <Class ArrayList>
	//   44  102:ldc2            #262 <String "icon view">
	//   45  105:getstatic       #268 <Field com.appscend.media.APSMediaTrackingEvents$MediaEventType com.appscend.media.APSMediaTrackingEvents$MediaEventType.CREATIVE_VIEW>
	//   46  108:aload_0         
	//   47  109:getfield        #76  <Field APSMediaOverlay overlay>
	//   48  112:invokevirtual   #272 <Method void APSMediaPlayer.trackforEvent(ArrayList, String, com.appscend.media.APSMediaTrackingEvents$MediaEventType, com.appscend.media.events.APSMediaEvent)>
			_view.setImageBitmap(bitmap1);
	//   49  115:aload_0         
	//   50  116:getfield        #62  <Field ImageView _view>
	//   51  119:aload_1         
	//   52  120:invokevirtual   #258 <Method void ImageView.setImageBitmap(Bitmap)>
			String s;
			if(overlay.parameters.get("stretchMode") != null)
	//*  53  123:aload_0         
	//*  54  124:getfield        #76  <Field APSMediaOverlay overlay>
	//*  55  127:getfield        #82  <Field HashMap APSMediaOverlay.parameters>
	//*  56  130:ldc1            #33  <String "stretchMode">
	//*  57  132:invokevirtual   #121 <Method Object HashMap.get(Object)>
	//*  58  135:ifnull          158
				s = (String)overlay.parameters.get("stretchMode");
	//   59  138:aload_0         
	//   60  139:getfield        #76  <Field APSMediaOverlay overlay>
	//   61  142:getfield        #82  <Field HashMap APSMediaOverlay.parameters>
	//   62  145:ldc1            #33  <String "stretchMode">
	//   63  147:invokevirtual   #121 <Method Object HashMap.get(Object)>
	//   64  150:checkcast       #123 <Class String>
	//   65  153:astore          6
			else
	//*  66  155:goto            163
				s = "aspectFit";
	//   67  158:ldc2            #274 <String "aspectFit">
	//   68  161:astore          6
			int i = bitmap1.getWidth();
	//   69  163:aload_1         
	//   70  164:invokevirtual   #278 <Method int Bitmap.getWidth()>
	//   71  167:istore_2        
			int j = bitmap1.getHeight();
	//   72  168:aload_1         
	//   73  169:invokevirtual   #281 <Method int Bitmap.getHeight()>
	//   74  172:istore_3        
			int k = _view.getWidth();
	//   75  173:aload_0         
	//   76  174:getfield        #62  <Field ImageView _view>
	//   77  177:invokevirtual   #282 <Method int ImageView.getWidth()>
	//   78  180:istore          4
			int l = _view.getHeight();
	//   79  182:aload_0         
	//   80  183:getfield        #62  <Field ImageView _view>
	//   81  186:invokevirtual   #283 <Method int ImageView.getHeight()>
	//   82  189:istore          5
			if(s.equals("fill"))
	//*  83  191:aload           6
	//*  84  193:ldc2            #285 <String "fill">
	//*  85  196:invokevirtual   #190 <Method boolean String.equals(Object)>
	//*  86  199:ifeq            213
			{
				_view.setScaleType(android.widget.ImageView.ScaleType.FIT_XY);
	//   87  202:aload_0         
	//   88  203:getfield        #62  <Field ImageView _view>
	//   89  206:getstatic       #288 <Field android.widget.ImageView$ScaleType android.widget.ImageView$ScaleType.FIT_XY>
	//   90  209:invokevirtual   #115 <Method void ImageView.setScaleType(android.widget.ImageView$ScaleType)>
				return;
	//   91  212:return          
			}
			if(s.equals("aspectFit"))
	//*  92  213:aload           6
	//*  93  215:ldc2            #274 <String "aspectFit">
	//*  94  218:invokevirtual   #190 <Method boolean String.equals(Object)>
	//*  95  221:ifeq            235
			{
				_view.setScaleType(android.widget.ImageView.ScaleType.FIT_CENTER);
	//   96  224:aload_0         
	//   97  225:getfield        #62  <Field ImageView _view>
	//   98  228:getstatic       #111 <Field android.widget.ImageView$ScaleType android.widget.ImageView$ScaleType.FIT_CENTER>
	//   99  231:invokevirtual   #115 <Method void ImageView.setScaleType(android.widget.ImageView$ScaleType)>
				return;
	//  100  234:return          
			}
			if(s.equals("aspectFill"))
	//* 101  235:aload           6
	//* 102  237:ldc2            #290 <String "aspectFill">
	//* 103  240:invokevirtual   #190 <Method boolean String.equals(Object)>
	//* 104  243:ifeq            257
			{
				_view.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
	//  105  246:aload_0         
	//  106  247:getfield        #62  <Field ImageView _view>
	//  107  250:getstatic       #293 <Field android.widget.ImageView$ScaleType android.widget.ImageView$ScaleType.CENTER_CROP>
	//  108  253:invokevirtual   #115 <Method void ImageView.setScaleType(android.widget.ImageView$ScaleType)>
				return;
	//  109  256:return          
			}
			if(s.equals("top"))
	//* 110  257:aload           6
	//* 111  259:ldc2            #295 <String "top">
	//* 112  262:invokevirtual   #190 <Method boolean String.equals(Object)>
	//* 113  265:ifeq            321
			{
				_view.setScaleType(android.widget.ImageView.ScaleType.MATRIX);
	//  114  268:aload_0         
	//  115  269:getfield        #62  <Field ImageView _view>
	//  116  272:getstatic       #298 <Field android.widget.ImageView$ScaleType android.widget.ImageView$ScaleType.MATRIX>
	//  117  275:invokevirtual   #115 <Method void ImageView.setScaleType(android.widget.ImageView$ScaleType)>
				bitmap1 = ((Bitmap) (new Matrix()));
	//  118  278:new             #300 <Class Matrix>
	//  119  281:dup             
	//  120  282:invokespecial   #301 <Method void Matrix()>
	//  121  285:astore_1        
				((Matrix) (bitmap1)).setScale(1.0F, 1.0F);
	//  122  286:aload_1         
	//  123  287:fconst_1        
	//  124  288:fconst_1        
	//  125  289:invokevirtual   #305 <Method void Matrix.setScale(float, float)>
				((Matrix) (bitmap1)).postTranslate(Math.max(0.0F, ((float)k - (float)i) * 0.5F), 0.0F);
	//  126  292:aload_1         
	//  127  293:fconst_0        
	//  128  294:iload           4
	//  129  296:i2f             
	//  130  297:iload_2         
	//  131  298:i2f             
	//  132  299:fsub            
	//  133  300:ldc2            #306 <Float 0.5F>
	//  134  303:fmul            
	//  135  304:invokestatic    #312 <Method float Math.max(float, float)>
	//  136  307:fconst_0        
	//  137  308:invokevirtual   #316 <Method boolean Matrix.postTranslate(float, float)>
	//  138  311:pop             
				_view.setImageMatrix(((Matrix) (bitmap1)));
	//  139  312:aload_0         
	//  140  313:getfield        #62  <Field ImageView _view>
	//  141  316:aload_1         
	//  142  317:invokevirtual   #320 <Method void ImageView.setImageMatrix(Matrix)>
				return;
	//  143  320:return          
			}
			if(s.equals("bottom"))
	//* 144  321:aload           6
	//* 145  323:ldc2            #322 <String "bottom">
	//* 146  326:invokevirtual   #190 <Method boolean String.equals(Object)>
	//* 147  329:ifeq            394
			{
				_view.setScaleType(android.widget.ImageView.ScaleType.MATRIX);
	//  148  332:aload_0         
	//  149  333:getfield        #62  <Field ImageView _view>
	//  150  336:getstatic       #298 <Field android.widget.ImageView$ScaleType android.widget.ImageView$ScaleType.MATRIX>
	//  151  339:invokevirtual   #115 <Method void ImageView.setScaleType(android.widget.ImageView$ScaleType)>
				bitmap1 = ((Bitmap) (new Matrix()));
	//  152  342:new             #300 <Class Matrix>
	//  153  345:dup             
	//  154  346:invokespecial   #301 <Method void Matrix()>
	//  155  349:astore_1        
				((Matrix) (bitmap1)).setScale(1.0F, 1.0F);
	//  156  350:aload_1         
	//  157  351:fconst_1        
	//  158  352:fconst_1        
	//  159  353:invokevirtual   #305 <Method void Matrix.setScale(float, float)>
				((Matrix) (bitmap1)).postTranslate(Math.max(0.0F, ((float)k - (float)i) * 0.5F), Math.max(0.0F, (float)l - (float)j));
	//  160  356:aload_1         
	//  161  357:fconst_0        
	//  162  358:iload           4
	//  163  360:i2f             
	//  164  361:iload_2         
	//  165  362:i2f             
	//  166  363:fsub            
	//  167  364:ldc2            #306 <Float 0.5F>
	//  168  367:fmul            
	//  169  368:invokestatic    #312 <Method float Math.max(float, float)>
	//  170  371:fconst_0        
	//  171  372:iload           5
	//  172  374:i2f             
	//  173  375:iload_3         
	//  174  376:i2f             
	//  175  377:fsub            
	//  176  378:invokestatic    #312 <Method float Math.max(float, float)>
	//  177  381:invokevirtual   #316 <Method boolean Matrix.postTranslate(float, float)>
	//  178  384:pop             
				_view.setImageMatrix(((Matrix) (bitmap1)));
	//  179  385:aload_0         
	//  180  386:getfield        #62  <Field ImageView _view>
	//  181  389:aload_1         
	//  182  390:invokevirtual   #320 <Method void ImageView.setImageMatrix(Matrix)>
				return;
	//  183  393:return          
			}
			if(s.equals("left"))
	//* 184  394:aload           6
	//* 185  396:ldc2            #324 <String "left">
	//* 186  399:invokevirtual   #190 <Method boolean String.equals(Object)>
	//* 187  402:ifeq            458
			{
				_view.setScaleType(android.widget.ImageView.ScaleType.MATRIX);
	//  188  405:aload_0         
	//  189  406:getfield        #62  <Field ImageView _view>
	//  190  409:getstatic       #298 <Field android.widget.ImageView$ScaleType android.widget.ImageView$ScaleType.MATRIX>
	//  191  412:invokevirtual   #115 <Method void ImageView.setScaleType(android.widget.ImageView$ScaleType)>
				bitmap1 = ((Bitmap) (new Matrix()));
	//  192  415:new             #300 <Class Matrix>
	//  193  418:dup             
	//  194  419:invokespecial   #301 <Method void Matrix()>
	//  195  422:astore_1        
				((Matrix) (bitmap1)).setScale(1.0F, 1.0F);
	//  196  423:aload_1         
	//  197  424:fconst_1        
	//  198  425:fconst_1        
	//  199  426:invokevirtual   #305 <Method void Matrix.setScale(float, float)>
				((Matrix) (bitmap1)).postTranslate(0.0F, Math.max(0.0F, ((float)l - (float)j) * 0.5F));
	//  200  429:aload_1         
	//  201  430:fconst_0        
	//  202  431:fconst_0        
	//  203  432:iload           5
	//  204  434:i2f             
	//  205  435:iload_3         
	//  206  436:i2f             
	//  207  437:fsub            
	//  208  438:ldc2            #306 <Float 0.5F>
	//  209  441:fmul            
	//  210  442:invokestatic    #312 <Method float Math.max(float, float)>
	//  211  445:invokevirtual   #316 <Method boolean Matrix.postTranslate(float, float)>
	//  212  448:pop             
				_view.setImageMatrix(((Matrix) (bitmap1)));
	//  213  449:aload_0         
	//  214  450:getfield        #62  <Field ImageView _view>
	//  215  453:aload_1         
	//  216  454:invokevirtual   #320 <Method void ImageView.setImageMatrix(Matrix)>
				return;
	//  217  457:return          
			}
			if(s.equals("right"))
	//* 218  458:aload           6
	//* 219  460:ldc2            #326 <String "right">
	//* 220  463:invokevirtual   #190 <Method boolean String.equals(Object)>
	//* 221  466:ifeq            575
			{
				_view.setScaleType(android.widget.ImageView.ScaleType.MATRIX);
	//  222  469:aload_0         
	//  223  470:getfield        #62  <Field ImageView _view>
	//  224  473:getstatic       #298 <Field android.widget.ImageView$ScaleType android.widget.ImageView$ScaleType.MATRIX>
	//  225  476:invokevirtual   #115 <Method void ImageView.setScaleType(android.widget.ImageView$ScaleType)>
				bitmap1 = ((Bitmap) (new Matrix()));
	//  226  479:new             #300 <Class Matrix>
	//  227  482:dup             
	//  228  483:invokespecial   #301 <Method void Matrix()>
	//  229  486:astore_1        
				((Matrix) (bitmap1)).setScale(1.0F, 1.0F);
	//  230  487:aload_1         
	//  231  488:fconst_1        
	//  232  489:fconst_1        
	//  233  490:invokevirtual   #305 <Method void Matrix.setScale(float, float)>
				((Matrix) (bitmap1)).postTranslate((float)k - (float)i, Math.max(0.0F, ((float)l - (float)j) * 0.5F));
	//  234  493:aload_1         
	//  235  494:iload           4
	//  236  496:i2f             
	//  237  497:iload_2         
	//  238  498:i2f             
	//  239  499:fsub            
	//  240  500:fconst_0        
	//  241  501:iload           5
	//  242  503:i2f             
	//  243  504:iload_3         
	//  244  505:i2f             
	//  245  506:fsub            
	//  246  507:ldc2            #306 <Float 0.5F>
	//  247  510:fmul            
	//  248  511:invokestatic    #312 <Method float Math.max(float, float)>
	//  249  514:invokevirtual   #316 <Method boolean Matrix.postTranslate(float, float)>
	//  250  517:pop             
				_view.setImageMatrix(((Matrix) (bitmap1)));
	//  251  518:aload_0         
	//  252  519:getfield        #62  <Field ImageView _view>
	//  253  522:aload_1         
	//  254  523:invokevirtual   #320 <Method void ImageView.setImageMatrix(Matrix)>
				return;
	//  255  526:return          
			}
		} else
		{
			APSMediaPlayer.getInstance().trackforEvent((ArrayList)overlay.parameters.get("errorTracking"), "image resource loading error", com.appscend.media.APSMediaTrackingEvents.MediaEventType.ERROR, ((com.appscend.media.events.APSMediaEvent) (overlay)));
	//  256  527:invokestatic    #167 <Method APSMediaPlayer APSMediaPlayer.getInstance()>
	//  257  530:aload_0         
	//  258  531:getfield        #76  <Field APSMediaOverlay overlay>
	//  259  534:getfield        #82  <Field HashMap APSMediaOverlay.parameters>
	//  260  537:ldc1            #27  <String "errorTracking">
	//  261  539:invokevirtual   #121 <Method Object HashMap.get(Object)>
	//  262  542:checkcast       #260 <Class ArrayList>
	//  263  545:ldc2            #328 <String "image resource loading error">
	//  264  548:getstatic       #331 <Field com.appscend.media.APSMediaTrackingEvents$MediaEventType com.appscend.media.APSMediaTrackingEvents$MediaEventType.ERROR>
	//  265  551:aload_0         
	//  266  552:getfield        #76  <Field APSMediaOverlay overlay>
	//  267  555:invokevirtual   #272 <Method void APSMediaPlayer.trackforEvent(ArrayList, String, com.appscend.media.APSMediaTrackingEvents$MediaEventType, com.appscend.media.events.APSMediaEvent)>
			((RelativeLayout)_view.getParent()).removeView(((View) (_view)));
	//  268  558:aload_0         
	//  269  559:getfield        #62  <Field ImageView _view>
	//  270  562:invokevirtual   #335 <Method android.view.ViewParent ImageView.getParent()>
	//  271  565:checkcast       #93  <Class RelativeLayout>
	//  272  568:aload_0         
	//  273  569:getfield        #62  <Field ImageView _view>
	//  274  572:invokevirtual   #338 <Method void RelativeLayout.removeView(View)>
		}
	//  275  575:return          
	}

	public String type()
	{
		return "com.appscend.mp.overlays.image";
	//    0    0:ldc1            #15  <String "com.appscend.mp.overlays.image">
	//    1    2:areturn         
	}

	public static final String APSImageOverlay = "com.appscend.mp.overlays.image";
	public static final String kAPSImageOverlayBackgroundColor = "imageOverlayBackgroundColor";
	public static final String kAPSImageOverlayClickthrough = "clickThrough";
	public static final String kAPSImageOverlayClicktracking = "clickTracking";
	public static final String kAPSImageOverlayErrorURLs = "errorTracking";
	public static final String kAPSImageOverlayResourceURL = "url";
	public static final String kAPSImageOverlayStretchMode = "stretchMode";
	public static final String kAPSImageOverlayViewtracking = "viewTracking";
	public static final String kAPSImageOverlayWebviewDismissAction = "dismissAction";
	private ImageView _view;
	private RelativeLayout _viewHolder;
	private Bitmap bitmap;
	private com.appscend.media.APSMediaBuilder.APSWebviewDismissedAction dismissedAction;


/*
	static com.appscend.media.APSMediaBuilder.APSWebviewDismissedAction access$000(APSMediaPlayerImageOverlayController apsmediaplayerimageoverlaycontroller)
	{
		return apsmediaplayerimageoverlaycontroller.dismissedAction;
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field com.appscend.media.APSMediaBuilder$APSWebviewDismissedAction dismissedAction>
	//    2    4:areturn         
	}

*/


/*
	static ImageView access$100(APSMediaPlayerImageOverlayController apsmediaplayerimageoverlaycontroller)
	{
		return apsmediaplayerimageoverlaycontroller._view;
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field ImageView _view>
	//    2    4:areturn         
	}

*/
}
