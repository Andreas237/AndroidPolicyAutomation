// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media.session;

import android.content.Intent;
import android.net.Uri;
import android.os.*;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.RatingCompat;
import android.util.Log;
import android.view.KeyEvent;
import java.util.List;

// Referenced classes of package android.support.v4.media.session:
//			MediaSessionCompat, PlaybackStateCompat

class MediaSessionCompat$MediaSessionImplBase$MessageHandler extends Handler
{

	private void onMediaButtonEvent(KeyEvent keyevent, MediaSessionCompat.Callback callback)
	{
		int i;
		long l;
		if(keyevent == null)
			break MISSING_BLOCK_LABEL_236;
	//    0    0:aload_1         
	//    1    1:ifnull          236
		if(keyevent.getAction() != 0)
	//*   2    4:aload_1         
	//*   3    5:invokevirtual   #93  <Method int KeyEvent.getAction()>
	//*   4    8:ifeq            12
			return;
	//    5   11:return          
		if(mState == null)
	//*   6   12:aload_0         
	//*   7   13:getfield        #81  <Field MediaSessionCompat$MediaSessionImplBase this$0>
	//*   8   16:getfield        #97  <Field PlaybackStateCompat MediaSessionCompat$MediaSessionImplBase.mState>
	//*   9   19:ifnonnull       28
			l = 0L;
	//   10   22:lconst_0        
	//   11   23:lstore          4
		else
	//*  12   25:goto            40
			l = mState.getActions();
	//   13   28:aload_0         
	//   14   29:getfield        #81  <Field MediaSessionCompat$MediaSessionImplBase this$0>
	//   15   32:getfield        #97  <Field PlaybackStateCompat MediaSessionCompat$MediaSessionImplBase.mState>
	//   16   35:invokevirtual   #103 <Method long PlaybackStateCompat.getActions()>
	//   17   38:lstore          4
		i = keyevent.getKeyCode();
	//   18   40:aload_1         
	//   19   41:invokevirtual   #106 <Method int KeyEvent.getKeyCode()>
	//   20   44:istore_3        
		if(i == 79) goto _L2; else goto _L1
	//   21   45:iload_3         
	//   22   46:bipush          79
	//   23   48:icmpeq          227
_L1:
		i;
	//   24   51:iload_3         
		JVM INSTR tableswitch 85 90: default 92
	//	               85 227
	//	               86 213
	//	               87 197
	//	               88 181
	//	               89 165
	//	               90 149;
	//   25   52:tableswitch     85 90: default 92
	//	               85 227
	//	               86 213
	//	               87 197
	//	               88 181
	//	               89 165
	//	               90 149
		   goto _L3 _L2 _L4 _L5 _L6 _L7 _L8
_L3:
		switch(i)
	//*  26   92:iload_3         
		{
	//*  27   93:tableswitch     126 127: default 116
	//	               126 133
	//	               127 117
		default:
			return;
	//   28  116:return          

		case 127: // '\177'
			if((l & 2L) != 0L)
	//*  29  117:lload           4
	//*  30  119:ldc2w           #107 <Long 2L>
	//*  31  122:land            
	//*  32  123:lconst_0        
	//*  33  124:lcmp            
	//*  34  125:ifeq            235
			{
				callback.onPause();
	//   35  128:aload_2         
	//   36  129:invokevirtual   #114 <Method void MediaSessionCompat$Callback.onPause()>
				return;
	//   37  132:return          
			}
			break;

		case 126: // '~'
			if((l & 4L) != 0L)
	//*  38  133:lload           4
	//*  39  135:ldc2w           #115 <Long 4L>
	//*  40  138:land            
	//*  41  139:lconst_0        
	//*  42  140:lcmp            
	//*  43  141:ifeq            235
			{
				callback.onPlay();
	//   44  144:aload_2         
	//   45  145:invokevirtual   #119 <Method void MediaSessionCompat$Callback.onPlay()>
				return;
	//   46  148:return          
			}
			break;
		}
		break; /* Loop/switch isn't completed */
_L8:
		if((l & 64L) != 0L)
	//*  47  149:lload           4
	//*  48  151:ldc2w           #120 <Long 64L>
	//*  49  154:land            
	//*  50  155:lconst_0        
	//*  51  156:lcmp            
	//*  52  157:ifeq            235
		{
			callback.onFastForward();
	//   53  160:aload_2         
	//   54  161:invokevirtual   #124 <Method void MediaSessionCompat$Callback.onFastForward()>
			return;
	//   55  164:return          
		}
		break; /* Loop/switch isn't completed */
_L7:
		if((l & 8L) != 0L)
	//*  56  165:lload           4
	//*  57  167:ldc2w           #125 <Long 8L>
	//*  58  170:land            
	//*  59  171:lconst_0        
	//*  60  172:lcmp            
	//*  61  173:ifeq            235
		{
			callback.onRewind();
	//   62  176:aload_2         
	//   63  177:invokevirtual   #129 <Method void MediaSessionCompat$Callback.onRewind()>
			return;
	//   64  180:return          
		}
		break; /* Loop/switch isn't completed */
_L6:
		if((l & 16L) != 0L)
	//*  65  181:lload           4
	//*  66  183:ldc2w           #130 <Long 16L>
	//*  67  186:land            
	//*  68  187:lconst_0        
	//*  69  188:lcmp            
	//*  70  189:ifeq            235
		{
			callback.onSkipToPrevious();
	//   71  192:aload_2         
	//   72  193:invokevirtual   #134 <Method void MediaSessionCompat$Callback.onSkipToPrevious()>
			return;
	//   73  196:return          
		}
		break; /* Loop/switch isn't completed */
_L5:
		if((l & 32L) != 0L)
	//*  74  197:lload           4
	//*  75  199:ldc2w           #135 <Long 32L>
	//*  76  202:land            
	//*  77  203:lconst_0        
	//*  78  204:lcmp            
	//*  79  205:ifeq            235
		{
			callback.onSkipToNext();
	//   80  208:aload_2         
	//   81  209:invokevirtual   #139 <Method void MediaSessionCompat$Callback.onSkipToNext()>
			return;
	//   82  212:return          
		}
		break; /* Loop/switch isn't completed */
_L4:
		if((l & 1L) != 0L)
	//*  83  213:lload           4
	//*  84  215:lconst_1        
	//*  85  216:land            
	//*  86  217:lconst_0        
	//*  87  218:lcmp            
	//*  88  219:ifeq            235
		{
			callback.onStop();
	//   89  222:aload_2         
	//   90  223:invokevirtual   #142 <Method void MediaSessionCompat$Callback.onStop()>
			return;
	//   91  226:return          
		}
		break; /* Loop/switch isn't completed */
_L2:
		Log.w("MediaSessionCompat", "KEYCODE_MEDIA_PLAY_PAUSE and KEYCODE_HEADSETHOOK are handled already");
	//   92  227:ldc1            #144 <String "MediaSessionCompat">
	//   93  229:ldc1            #146 <String "KEYCODE_MEDIA_PLAY_PAUSE and KEYCODE_HEADSETHOOK are handled already">
	//   94  231:invokestatic    #152 <Method int Log.w(String, String)>
	//   95  234:pop             
		return;
	//   96  235:return          
	//   97  236:return          
	}

	public void handleMessage(Message message)
	{
		MediaSessionCompat.Callback callback;
		Object obj;
		callback = mCallback;
	//    0    0:aload_0         
	//    1    1:getfield        #81  <Field MediaSessionCompat$MediaSessionImplBase this$0>
	//    2    4:getfield        #158 <Field MediaSessionCompat$Callback MediaSessionCompat$MediaSessionImplBase.mCallback>
	//    3    7:astore_2        
		if(callback == null)
	//*   4    8:aload_2         
	//*   5    9:ifnonnull       13
			return;
	//    6   12:return          
		obj = ((Object) (message.getData()));
	//    7   13:aload_1         
	//    8   14:invokevirtual   #164 <Method Bundle Message.getData()>
	//    9   17:astore_3        
		MediaSessionCompat.ensureClassLoader(((Bundle) (obj)));
	//   10   18:aload_3         
	//   11   19:invokestatic    #168 <Method void MediaSessionCompat.ensureClassLoader(Bundle)>
		setCurrentControllerInfo(new android.support.v4.media.MediaSessionManager.RemoteUserInfo(((Bundle) (obj)).getString("data_calling_pkg"), ((Bundle) (obj)).getInt("data_calling_pid"), ((Bundle) (obj)).getInt("data_calling_uid")));
	//   12   22:aload_0         
	//   13   23:getfield        #81  <Field MediaSessionCompat$MediaSessionImplBase this$0>
	//   14   26:new             #170 <Class android.support.v4.media.MediaSessionManager$RemoteUserInfo>
	//   15   29:dup             
	//   16   30:aload_3         
	//   17   31:ldc1            #172 <String "data_calling_pkg">
	//   18   33:invokevirtual   #178 <Method String Bundle.getString(String)>
	//   19   36:aload_3         
	//   20   37:ldc1            #180 <String "data_calling_pid">
	//   21   39:invokevirtual   #184 <Method int Bundle.getInt(String)>
	//   22   42:aload_3         
	//   23   43:ldc1            #186 <String "data_calling_uid">
	//   24   45:invokevirtual   #184 <Method int Bundle.getInt(String)>
	//   25   48:invokespecial   #189 <Method void android.support.v4.media.MediaSessionManager$RemoteUserInfo(String, int, int)>
	//   26   51:invokevirtual   #193 <Method void MediaSessionCompat$MediaSessionImplBase.setCurrentControllerInfo(android.support.v4.media.MediaSessionManager$RemoteUserInfo)>
		obj = ((Object) (((Bundle) (obj)).getBundle("data_extras")));
	//   27   54:aload_3         
	//   28   55:ldc1            #195 <String "data_extras">
	//   29   57:invokevirtual   #199 <Method Bundle Bundle.getBundle(String)>
	//   30   60:astore_3        
		MediaSessionCompat.ensureClassLoader(((Bundle) (obj)));
	//   31   61:aload_3         
	//   32   62:invokestatic    #168 <Method void MediaSessionCompat.ensureClassLoader(Bundle)>
		message.what;
	//   33   65:aload_1         
	//   34   66:getfield        #202 <Field int Message.what>
		JVM INSTR tableswitch 1 31: default 710
	//	               1 666
	//	               2 651
	//	               3 644
	//	               4 629
	//	               5 614
	//	               6 599
	//	               7 592
	//	               8 577
	//	               9 562
	//	               10 547
	//	               11 530
	//	               12 523
	//	               13 516
	//	               14 509
	//	               15 502
	//	               16 495
	//	               17 488
	//	               18 471
	//	               19 457
	//	               20 442
	//	               21 397
	//	               22 382
	//	               23 371
	//	               24 710
	//	               25 357
	//	               26 339
	//	               27 325
	//	               28 251
	//	               29 234
	//	               30 223
	//	               31 208;
	//   35   69:tableswitch     1 31: default 710
	//	               1 666
	//	               2 651
	//	               3 644
	//	               4 629
	//	               5 614
	//	               6 599
	//	               7 592
	//	               8 577
	//	               9 562
	//	               10 547
	//	               11 530
	//	               12 523
	//	               13 516
	//	               14 509
	//	               15 502
	//	               16 495
	//	               17 488
	//	               18 471
	//	               19 457
	//	               20 442
	//	               21 397
	//	               22 382
	//	               23 371
	//	               24 710
	//	               25 357
	//	               26 339
	//	               27 325
	//	               28 251
	//	               29 234
	//	               30 223
	//	               31 208
		   goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17 _L18 _L19 _L20 _L21 _L22 _L23 _L24 _L1 _L25 _L26 _L27 _L28 _L29 _L30 _L31
_L1:
		break; /* Loop/switch isn't completed */
_L31:
		callback.onSetRating((RatingCompat)message.obj, ((Bundle) (obj)));
	//   36  208:aload_2         
	//   37  209:aload_1         
	//   38  210:getfield        #206 <Field Object Message.obj>
	//   39  213:checkcast       #208 <Class RatingCompat>
	//   40  216:aload_3         
	//   41  217:invokevirtual   #212 <Method void MediaSessionCompat$Callback.onSetRating(RatingCompat, Bundle)>
		break; /* Loop/switch isn't completed */
	//   42  220:goto            690
_L30:
		callback.onSetShuffleMode(message.arg1);
	//   43  223:aload_2         
	//   44  224:aload_1         
	//   45  225:getfield        #215 <Field int Message.arg1>
	//   46  228:invokevirtual   #219 <Method void MediaSessionCompat$Callback.onSetShuffleMode(int)>
		break; /* Loop/switch isn't completed */
	//   47  231:goto            690
_L29:
		callback.onSetCaptioningEnabled(((Boolean)message.obj).booleanValue());
	//   48  234:aload_2         
	//   49  235:aload_1         
	//   50  236:getfield        #206 <Field Object Message.obj>
	//   51  239:checkcast       #221 <Class Boolean>
	//   52  242:invokevirtual   #225 <Method boolean Boolean.booleanValue()>
	//   53  245:invokevirtual   #229 <Method void MediaSessionCompat$Callback.onSetCaptioningEnabled(boolean)>
		break; /* Loop/switch isn't completed */
	//   54  248:goto            690
_L28:
		if(mQueue == null)
			break; /* Loop/switch isn't completed */
	//   55  251:aload_0         
	//   56  252:getfield        #81  <Field MediaSessionCompat$MediaSessionImplBase this$0>
	//   57  255:getfield        #233 <Field List MediaSessionCompat$MediaSessionImplBase.mQueue>
	//   58  258:ifnull          690
		if(message.arg1 < 0 || message.arg1 >= mQueue.size()) goto _L33; else goto _L32
	//   59  261:aload_1         
	//   60  262:getfield        #215 <Field int Message.arg1>
	//   61  265:iflt            713
	//   62  268:aload_1         
	//   63  269:getfield        #215 <Field int Message.arg1>
	//   64  272:aload_0         
	//   65  273:getfield        #81  <Field MediaSessionCompat$MediaSessionImplBase this$0>
	//   66  276:getfield        #233 <Field List MediaSessionCompat$MediaSessionImplBase.mQueue>
	//   67  279:invokeinterface #238 <Method int List.size()>
	//   68  284:icmpge          713
_L32:
		message = ((Message) ((MediaSessionCompat.QueueItem)mQueue.get(message.arg1)));
	//   69  287:aload_0         
	//   70  288:getfield        #81  <Field MediaSessionCompat$MediaSessionImplBase this$0>
	//   71  291:getfield        #233 <Field List MediaSessionCompat$MediaSessionImplBase.mQueue>
	//   72  294:aload_1         
	//   73  295:getfield        #215 <Field int Message.arg1>
	//   74  298:invokeinterface #242 <Method Object List.get(int)>
	//   75  303:checkcast       #244 <Class MediaSessionCompat$QueueItem>
	//   76  306:astore_1        
	//*  77  307:goto            310
_L35:
		if(message == null)
			break; /* Loop/switch isn't completed */
	//   78  310:aload_1         
	//   79  311:ifnull          690
		callback.onRemoveQueueItem(((MediaSessionCompat.QueueItem) (message)).getDescription());
	//   80  314:aload_2         
	//   81  315:aload_1         
	//   82  316:invokevirtual   #248 <Method MediaDescriptionCompat MediaSessionCompat$QueueItem.getDescription()>
	//   83  319:invokevirtual   #252 <Method void MediaSessionCompat$Callback.onRemoveQueueItem(MediaDescriptionCompat)>
		break; /* Loop/switch isn't completed */
	//   84  322:goto            690
_L27:
		callback.onRemoveQueueItem((MediaDescriptionCompat)message.obj);
	//   85  325:aload_2         
	//   86  326:aload_1         
	//   87  327:getfield        #206 <Field Object Message.obj>
	//   88  330:checkcast       #254 <Class MediaDescriptionCompat>
	//   89  333:invokevirtual   #252 <Method void MediaSessionCompat$Callback.onRemoveQueueItem(MediaDescriptionCompat)>
		break; /* Loop/switch isn't completed */
	//   90  336:goto            690
_L26:
		callback.onAddQueueItem((MediaDescriptionCompat)message.obj, message.arg1);
	//   91  339:aload_2         
	//   92  340:aload_1         
	//   93  341:getfield        #206 <Field Object Message.obj>
	//   94  344:checkcast       #254 <Class MediaDescriptionCompat>
	//   95  347:aload_1         
	//   96  348:getfield        #215 <Field int Message.arg1>
	//   97  351:invokevirtual   #258 <Method void MediaSessionCompat$Callback.onAddQueueItem(MediaDescriptionCompat, int)>
		break; /* Loop/switch isn't completed */
	//   98  354:goto            690
_L25:
		callback.onAddQueueItem((MediaDescriptionCompat)message.obj);
	//   99  357:aload_2         
	//  100  358:aload_1         
	//  101  359:getfield        #206 <Field Object Message.obj>
	//  102  362:checkcast       #254 <Class MediaDescriptionCompat>
	//  103  365:invokevirtual   #260 <Method void MediaSessionCompat$Callback.onAddQueueItem(MediaDescriptionCompat)>
		break; /* Loop/switch isn't completed */
	//  104  368:goto            690
_L24:
		callback.onSetRepeatMode(message.arg1);
	//  105  371:aload_2         
	//  106  372:aload_1         
	//  107  373:getfield        #215 <Field int Message.arg1>
	//  108  376:invokevirtual   #263 <Method void MediaSessionCompat$Callback.onSetRepeatMode(int)>
		break; /* Loop/switch isn't completed */
	//  109  379:goto            690
_L23:
		setVolumeTo(message.arg1, 0);
	//  110  382:aload_0         
	//  111  383:getfield        #81  <Field MediaSessionCompat$MediaSessionImplBase this$0>
	//  112  386:aload_1         
	//  113  387:getfield        #215 <Field int Message.arg1>
	//  114  390:iconst_0        
	//  115  391:invokevirtual   #267 <Method void MediaSessionCompat$MediaSessionImplBase.setVolumeTo(int, int)>
		break; /* Loop/switch isn't completed */
	//  116  394:goto            690
_L22:
		message = ((Message) ((KeyEvent)message.obj));
	//  117  397:aload_1         
	//  118  398:getfield        #206 <Field Object Message.obj>
	//  119  401:checkcast       #89  <Class KeyEvent>
	//  120  404:astore_1        
		obj = ((Object) (new Intent("android.intent.action.MEDIA_BUTTON")));
	//  121  405:new             #269 <Class Intent>
	//  122  408:dup             
	//  123  409:ldc2            #271 <String "android.intent.action.MEDIA_BUTTON">
	//  124  412:invokespecial   #274 <Method void Intent(String)>
	//  125  415:astore_3        
		((Intent) (obj)).putExtra("android.intent.extra.KEY_EVENT", ((android.os.Parcelable) (message)));
	//  126  416:aload_3         
	//  127  417:ldc2            #276 <String "android.intent.extra.KEY_EVENT">
	//  128  420:aload_1         
	//  129  421:invokevirtual   #280 <Method Intent Intent.putExtra(String, android.os.Parcelable)>
	//  130  424:pop             
		if(!callback.onMediaButtonEvent(((Intent) (obj))))
	//* 131  425:aload_2         
	//* 132  426:aload_3         
	//* 133  427:invokevirtual   #283 <Method boolean MediaSessionCompat$Callback.onMediaButtonEvent(Intent)>
	//* 134  430:ifne            690
			onMediaButtonEvent(((KeyEvent) (message)), callback);
	//  135  433:aload_0         
	//  136  434:aload_1         
	//  137  435:aload_2         
	//  138  436:invokespecial   #285 <Method void onMediaButtonEvent(KeyEvent, MediaSessionCompat$Callback)>
		break; /* Loop/switch isn't completed */
	//  139  439:goto            690
_L21:
		callback.onCustomAction((String)message.obj, ((Bundle) (obj)));
	//  140  442:aload_2         
	//  141  443:aload_1         
	//  142  444:getfield        #206 <Field Object Message.obj>
	//  143  447:checkcast       #287 <Class String>
	//  144  450:aload_3         
	//  145  451:invokevirtual   #291 <Method void MediaSessionCompat$Callback.onCustomAction(String, Bundle)>
		break; /* Loop/switch isn't completed */
	//  146  454:goto            690
_L20:
		callback.onSetRating((RatingCompat)message.obj);
	//  147  457:aload_2         
	//  148  458:aload_1         
	//  149  459:getfield        #206 <Field Object Message.obj>
	//  150  462:checkcast       #208 <Class RatingCompat>
	//  151  465:invokevirtual   #294 <Method void MediaSessionCompat$Callback.onSetRating(RatingCompat)>
		break; /* Loop/switch isn't completed */
	//  152  468:goto            690
_L19:
		callback.onSeekTo(((Long)message.obj).longValue());
	//  153  471:aload_2         
	//  154  472:aload_1         
	//  155  473:getfield        #206 <Field Object Message.obj>
	//  156  476:checkcast       #296 <Class Long>
	//  157  479:invokevirtual   #299 <Method long Long.longValue()>
	//  158  482:invokevirtual   #303 <Method void MediaSessionCompat$Callback.onSeekTo(long)>
		break; /* Loop/switch isn't completed */
	//  159  485:goto            690
_L18:
		callback.onRewind();
	//  160  488:aload_2         
	//  161  489:invokevirtual   #129 <Method void MediaSessionCompat$Callback.onRewind()>
		break; /* Loop/switch isn't completed */
	//  162  492:goto            690
_L17:
		callback.onFastForward();
	//  163  495:aload_2         
	//  164  496:invokevirtual   #124 <Method void MediaSessionCompat$Callback.onFastForward()>
		break; /* Loop/switch isn't completed */
	//  165  499:goto            690
_L16:
		callback.onSkipToPrevious();
	//  166  502:aload_2         
	//  167  503:invokevirtual   #134 <Method void MediaSessionCompat$Callback.onSkipToPrevious()>
		break; /* Loop/switch isn't completed */
	//  168  506:goto            690
_L15:
		callback.onSkipToNext();
	//  169  509:aload_2         
	//  170  510:invokevirtual   #139 <Method void MediaSessionCompat$Callback.onSkipToNext()>
		break; /* Loop/switch isn't completed */
	//  171  513:goto            690
_L14:
		callback.onStop();
	//  172  516:aload_2         
	//  173  517:invokevirtual   #142 <Method void MediaSessionCompat$Callback.onStop()>
		break; /* Loop/switch isn't completed */
	//  174  520:goto            690
_L13:
		callback.onPause();
	//  175  523:aload_2         
	//  176  524:invokevirtual   #114 <Method void MediaSessionCompat$Callback.onPause()>
		break; /* Loop/switch isn't completed */
	//  177  527:goto            690
_L12:
		callback.onSkipToQueueItem(((Long)message.obj).longValue());
	//  178  530:aload_2         
	//  179  531:aload_1         
	//  180  532:getfield        #206 <Field Object Message.obj>
	//  181  535:checkcast       #296 <Class Long>
	//  182  538:invokevirtual   #299 <Method long Long.longValue()>
	//  183  541:invokevirtual   #306 <Method void MediaSessionCompat$Callback.onSkipToQueueItem(long)>
		break; /* Loop/switch isn't completed */
	//  184  544:goto            690
_L11:
		callback.onPlayFromUri((Uri)message.obj, ((Bundle) (obj)));
	//  185  547:aload_2         
	//  186  548:aload_1         
	//  187  549:getfield        #206 <Field Object Message.obj>
	//  188  552:checkcast       #308 <Class Uri>
	//  189  555:aload_3         
	//  190  556:invokevirtual   #312 <Method void MediaSessionCompat$Callback.onPlayFromUri(Uri, Bundle)>
		break; /* Loop/switch isn't completed */
	//  191  559:goto            690
_L10:
		callback.onPlayFromSearch((String)message.obj, ((Bundle) (obj)));
	//  192  562:aload_2         
	//  193  563:aload_1         
	//  194  564:getfield        #206 <Field Object Message.obj>
	//  195  567:checkcast       #287 <Class String>
	//  196  570:aload_3         
	//  197  571:invokevirtual   #315 <Method void MediaSessionCompat$Callback.onPlayFromSearch(String, Bundle)>
		break; /* Loop/switch isn't completed */
	//  198  574:goto            690
_L9:
		callback.onPlayFromMediaId((String)message.obj, ((Bundle) (obj)));
	//  199  577:aload_2         
	//  200  578:aload_1         
	//  201  579:getfield        #206 <Field Object Message.obj>
	//  202  582:checkcast       #287 <Class String>
	//  203  585:aload_3         
	//  204  586:invokevirtual   #318 <Method void MediaSessionCompat$Callback.onPlayFromMediaId(String, Bundle)>
		break; /* Loop/switch isn't completed */
	//  205  589:goto            690
_L8:
		callback.onPlay();
	//  206  592:aload_2         
	//  207  593:invokevirtual   #119 <Method void MediaSessionCompat$Callback.onPlay()>
		break; /* Loop/switch isn't completed */
	//  208  596:goto            690
_L7:
		callback.onPrepareFromUri((Uri)message.obj, ((Bundle) (obj)));
	//  209  599:aload_2         
	//  210  600:aload_1         
	//  211  601:getfield        #206 <Field Object Message.obj>
	//  212  604:checkcast       #308 <Class Uri>
	//  213  607:aload_3         
	//  214  608:invokevirtual   #321 <Method void MediaSessionCompat$Callback.onPrepareFromUri(Uri, Bundle)>
		break; /* Loop/switch isn't completed */
	//  215  611:goto            690
_L6:
		callback.onPrepareFromSearch((String)message.obj, ((Bundle) (obj)));
	//  216  614:aload_2         
	//  217  615:aload_1         
	//  218  616:getfield        #206 <Field Object Message.obj>
	//  219  619:checkcast       #287 <Class String>
	//  220  622:aload_3         
	//  221  623:invokevirtual   #324 <Method void MediaSessionCompat$Callback.onPrepareFromSearch(String, Bundle)>
		break; /* Loop/switch isn't completed */
	//  222  626:goto            690
_L5:
		callback.onPrepareFromMediaId((String)message.obj, ((Bundle) (obj)));
	//  223  629:aload_2         
	//  224  630:aload_1         
	//  225  631:getfield        #206 <Field Object Message.obj>
	//  226  634:checkcast       #287 <Class String>
	//  227  637:aload_3         
	//  228  638:invokevirtual   #327 <Method void MediaSessionCompat$Callback.onPrepareFromMediaId(String, Bundle)>
		break; /* Loop/switch isn't completed */
	//  229  641:goto            690
_L4:
		callback.onPrepare();
	//  230  644:aload_2         
	//  231  645:invokevirtual   #330 <Method void MediaSessionCompat$Callback.onPrepare()>
		break; /* Loop/switch isn't completed */
	//  232  648:goto            690
_L3:
		adjustVolume(message.arg1, 0);
	//  233  651:aload_0         
	//  234  652:getfield        #81  <Field MediaSessionCompat$MediaSessionImplBase this$0>
	//  235  655:aload_1         
	//  236  656:getfield        #215 <Field int Message.arg1>
	//  237  659:iconst_0        
	//  238  660:invokevirtual   #333 <Method void MediaSessionCompat$MediaSessionImplBase.adjustVolume(int, int)>
		break; /* Loop/switch isn't completed */
	//  239  663:goto            690
_L2:
		message = ((Message) ((MediaSessionCompat.MediaSessionImplBase.Command)message.obj));
	//  240  666:aload_1         
	//  241  667:getfield        #206 <Field Object Message.obj>
	//  242  670:checkcast       #335 <Class MediaSessionCompat$MediaSessionImplBase$Command>
	//  243  673:astore_1        
		callback.onCommand(((MediaSessionCompat.MediaSessionImplBase.Command) (message)).command, ((MediaSessionCompat.MediaSessionImplBase.Command) (message)).extras, ((MediaSessionCompat.MediaSessionImplBase.Command) (message)).stub);
	//  244  674:aload_2         
	//  245  675:aload_1         
	//  246  676:getfield        #339 <Field String MediaSessionCompat$MediaSessionImplBase$Command.command>
	//  247  679:aload_1         
	//  248  680:getfield        #343 <Field Bundle MediaSessionCompat$MediaSessionImplBase$Command.extras>
	//  249  683:aload_1         
	//  250  684:getfield        #347 <Field android.os.ResultReceiver MediaSessionCompat$MediaSessionImplBase$Command.stub>
	//  251  687:invokevirtual   #351 <Method void MediaSessionCompat$Callback.onCommand(String, Bundle, android.os.ResultReceiver)>
		setCurrentControllerInfo(((android.support.v4.media.MediaSessionManager.RemoteUserInfo) (null)));
	//  252  690:aload_0         
	//  253  691:getfield        #81  <Field MediaSessionCompat$MediaSessionImplBase this$0>
	//  254  694:aconst_null     
	//  255  695:invokevirtual   #193 <Method void MediaSessionCompat$MediaSessionImplBase.setCurrentControllerInfo(android.support.v4.media.MediaSessionManager$RemoteUserInfo)>
		return;
	//  256  698:return          
		message;
	//  257  699:astore_1        
		setCurrentControllerInfo(((android.support.v4.media.MediaSessionManager.RemoteUserInfo) (null)));
	//  258  700:aload_0         
	//  259  701:getfield        #81  <Field MediaSessionCompat$MediaSessionImplBase this$0>
	//  260  704:aconst_null     
	//  261  705:invokevirtual   #193 <Method void MediaSessionCompat$MediaSessionImplBase.setCurrentControllerInfo(android.support.v4.media.MediaSessionManager$RemoteUserInfo)>
		throw message;
	//  262  708:aload_1         
	//  263  709:athrow          
	//* 264  710:goto            690
_L33:
		message = null;
	//  265  713:aconst_null     
	//  266  714:astore_1        
		if(true) goto _L35; else goto _L34
	//  267  715:goto            310
_L34:
	}

	private static final int KEYCODE_MEDIA_PAUSE = 127;
	private static final int KEYCODE_MEDIA_PLAY = 126;
	private static final int MSG_ADD_QUEUE_ITEM = 25;
	private static final int MSG_ADD_QUEUE_ITEM_AT = 26;
	private static final int MSG_ADJUST_VOLUME = 2;
	private static final int MSG_COMMAND = 1;
	private static final int MSG_CUSTOM_ACTION = 20;
	private static final int MSG_FAST_FORWARD = 16;
	private static final int MSG_MEDIA_BUTTON = 21;
	private static final int MSG_NEXT = 14;
	private static final int MSG_PAUSE = 12;
	private static final int MSG_PLAY = 7;
	private static final int MSG_PLAY_MEDIA_ID = 8;
	private static final int MSG_PLAY_SEARCH = 9;
	private static final int MSG_PLAY_URI = 10;
	private static final int MSG_PREPARE = 3;
	private static final int MSG_PREPARE_MEDIA_ID = 4;
	private static final int MSG_PREPARE_SEARCH = 5;
	private static final int MSG_PREPARE_URI = 6;
	private static final int MSG_PREVIOUS = 15;
	private static final int MSG_RATE = 19;
	private static final int MSG_RATE_EXTRA = 31;
	private static final int MSG_REMOVE_QUEUE_ITEM = 27;
	private static final int MSG_REMOVE_QUEUE_ITEM_AT = 28;
	private static final int MSG_REWIND = 17;
	private static final int MSG_SEEK_TO = 18;
	private static final int MSG_SET_CAPTIONING_ENABLED = 29;
	private static final int MSG_SET_REPEAT_MODE = 23;
	private static final int MSG_SET_SHUFFLE_MODE = 30;
	private static final int MSG_SET_VOLUME = 22;
	private static final int MSG_SKIP_TO_ITEM = 11;
	private static final int MSG_STOP = 13;
	final MediaSessionCompat.MediaSessionImplBase this$0;

	public MediaSessionCompat$MediaSessionImplBase$MessageHandler(Looper looper)
	{
		this$0 = MediaSessionCompat.MediaSessionImplBase.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #81  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		super(looper);
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:invokespecial   #84  <Method void Handler(Looper)>
	//    6   10:return          
	}
}
