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
		MediaSessionCompat.Callback callback = mCallback;
	//    0    0:aload_0         
	//    1    1:getfield        #81  <Field MediaSessionCompat$MediaSessionImplBase this$0>
	//    2    4:getfield        #158 <Field MediaSessionCompat$Callback MediaSessionCompat$MediaSessionImplBase.mCallback>
	//    3    7:astore_2        
		if(callback == null)
	//*   4    8:aload_2         
	//*   5    9:ifnonnull       13
			return;
	//    6   12:return          
		switch(message.what)
	//*   7   13:aload_1         
	//*   8   14:getfield        #163 <Field int Message.what>
		{
	//*   9   17:tableswitch     1 31: default 156
	//	               1 581
	//	               2 568
	//	               3 563
	//	               4 547
	//	               5 531
	//	               6 515
	//	               7 510
	//	               8 494
	//	               9 478
	//	               10 462
	//	               11 447
	//	               12 442
	//	               13 437
	//	               14 432
	//	               15 427
	//	               16 422
	//	               17 417
	//	               18 402
	//	               19 390
	//	               20 374
	//	               21 333
	//	               22 320
	//	               23 311
	//	               24 156
	//	               25 299
	//	               26 283
	//	               27 271
	//	               28 197
	//	               29 182
	//	               30 173
	//	               31 157
		case 24: // '\030'
		default:
			return;
	//   10  156:return          

		case 31: // '\037'
			callback.onSetRating((RatingCompat)message.obj, message.getData());
	//   11  157:aload_2         
	//   12  158:aload_1         
	//   13  159:getfield        #167 <Field Object Message.obj>
	//   14  162:checkcast       #169 <Class RatingCompat>
	//   15  165:aload_1         
	//   16  166:invokevirtual   #173 <Method Bundle Message.getData()>
	//   17  169:invokevirtual   #177 <Method void MediaSessionCompat$Callback.onSetRating(RatingCompat, Bundle)>
			return;
	//   18  172:return          

		case 30: // '\036'
			callback.onSetShuffleMode(message.arg1);
	//   19  173:aload_2         
	//   20  174:aload_1         
	//   21  175:getfield        #180 <Field int Message.arg1>
	//   22  178:invokevirtual   #184 <Method void MediaSessionCompat$Callback.onSetShuffleMode(int)>
			return;
	//   23  181:return          

		case 29: // '\035'
			callback.onSetCaptioningEnabled(((Boolean)message.obj).booleanValue());
	//   24  182:aload_2         
	//   25  183:aload_1         
	//   26  184:getfield        #167 <Field Object Message.obj>
	//   27  187:checkcast       #186 <Class Boolean>
	//   28  190:invokevirtual   #190 <Method boolean Boolean.booleanValue()>
	//   29  193:invokevirtual   #194 <Method void MediaSessionCompat$Callback.onSetCaptioningEnabled(boolean)>
			return;
	//   30  196:return          

		case 28: // '\034'
			if(mQueue != null)
	//*  31  197:aload_0         
	//*  32  198:getfield        #81  <Field MediaSessionCompat$MediaSessionImplBase this$0>
	//*  33  201:getfield        #198 <Field List MediaSessionCompat$MediaSessionImplBase.mQueue>
	//*  34  204:ifnull          605
			{
				if(message.arg1 >= 0 && message.arg1 < mQueue.size())
	//*  35  207:aload_1         
	//*  36  208:getfield        #180 <Field int Message.arg1>
	//*  37  211:iflt            256
	//*  38  214:aload_1         
	//*  39  215:getfield        #180 <Field int Message.arg1>
	//*  40  218:aload_0         
	//*  41  219:getfield        #81  <Field MediaSessionCompat$MediaSessionImplBase this$0>
	//*  42  222:getfield        #198 <Field List MediaSessionCompat$MediaSessionImplBase.mQueue>
	//*  43  225:invokeinterface #203 <Method int List.size()>
	//*  44  230:icmpge          256
					message = ((Message) ((MediaSessionCompat.QueueItem)mQueue.get(message.arg1)));
	//   45  233:aload_0         
	//   46  234:getfield        #81  <Field MediaSessionCompat$MediaSessionImplBase this$0>
	//   47  237:getfield        #198 <Field List MediaSessionCompat$MediaSessionImplBase.mQueue>
	//   48  240:aload_1         
	//   49  241:getfield        #180 <Field int Message.arg1>
	//   50  244:invokeinterface #207 <Method Object List.get(int)>
	//   51  249:checkcast       #209 <Class MediaSessionCompat$QueueItem>
	//   52  252:astore_1        
				else
	//*  53  253:goto            258
					message = null;
	//   54  256:aconst_null     
	//   55  257:astore_1        
				if(message != null)
	//*  56  258:aload_1         
	//*  57  259:ifnull          605
				{
					callback.onRemoveQueueItem(((MediaSessionCompat.QueueItem) (message)).getDescription());
	//   58  262:aload_2         
	//   59  263:aload_1         
	//   60  264:invokevirtual   #213 <Method MediaDescriptionCompat MediaSessionCompat$QueueItem.getDescription()>
	//   61  267:invokevirtual   #217 <Method void MediaSessionCompat$Callback.onRemoveQueueItem(MediaDescriptionCompat)>
					return;
	//   62  270:return          
				}
			}
			break;

		case 27: // '\033'
			callback.onRemoveQueueItem((MediaDescriptionCompat)message.obj);
	//   63  271:aload_2         
	//   64  272:aload_1         
	//   65  273:getfield        #167 <Field Object Message.obj>
	//   66  276:checkcast       #219 <Class MediaDescriptionCompat>
	//   67  279:invokevirtual   #217 <Method void MediaSessionCompat$Callback.onRemoveQueueItem(MediaDescriptionCompat)>
			return;
	//   68  282:return          

		case 26: // '\032'
			callback.onAddQueueItem((MediaDescriptionCompat)message.obj, message.arg1);
	//   69  283:aload_2         
	//   70  284:aload_1         
	//   71  285:getfield        #167 <Field Object Message.obj>
	//   72  288:checkcast       #219 <Class MediaDescriptionCompat>
	//   73  291:aload_1         
	//   74  292:getfield        #180 <Field int Message.arg1>
	//   75  295:invokevirtual   #223 <Method void MediaSessionCompat$Callback.onAddQueueItem(MediaDescriptionCompat, int)>
			return;
	//   76  298:return          

		case 25: // '\031'
			callback.onAddQueueItem((MediaDescriptionCompat)message.obj);
	//   77  299:aload_2         
	//   78  300:aload_1         
	//   79  301:getfield        #167 <Field Object Message.obj>
	//   80  304:checkcast       #219 <Class MediaDescriptionCompat>
	//   81  307:invokevirtual   #225 <Method void MediaSessionCompat$Callback.onAddQueueItem(MediaDescriptionCompat)>
			return;
	//   82  310:return          

		case 23: // '\027'
			callback.onSetRepeatMode(message.arg1);
	//   83  311:aload_2         
	//   84  312:aload_1         
	//   85  313:getfield        #180 <Field int Message.arg1>
	//   86  316:invokevirtual   #228 <Method void MediaSessionCompat$Callback.onSetRepeatMode(int)>
			return;
	//   87  319:return          

		case 22: // '\026'
			setVolumeTo(message.arg1, 0);
	//   88  320:aload_0         
	//   89  321:getfield        #81  <Field MediaSessionCompat$MediaSessionImplBase this$0>
	//   90  324:aload_1         
	//   91  325:getfield        #180 <Field int Message.arg1>
	//   92  328:iconst_0        
	//   93  329:invokevirtual   #232 <Method void MediaSessionCompat$MediaSessionImplBase.setVolumeTo(int, int)>
			return;
	//   94  332:return          

		case 21: // '\025'
			message = ((Message) ((KeyEvent)message.obj));
	//   95  333:aload_1         
	//   96  334:getfield        #167 <Field Object Message.obj>
	//   97  337:checkcast       #89  <Class KeyEvent>
	//   98  340:astore_1        
			Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
	//   99  341:new             #234 <Class Intent>
	//  100  344:dup             
	//  101  345:ldc1            #236 <String "android.intent.action.MEDIA_BUTTON">
	//  102  347:invokespecial   #239 <Method void Intent(String)>
	//  103  350:astore_3        
			intent.putExtra("android.intent.extra.KEY_EVENT", ((android.os.Parcelable) (message)));
	//  104  351:aload_3         
	//  105  352:ldc1            #241 <String "android.intent.extra.KEY_EVENT">
	//  106  354:aload_1         
	//  107  355:invokevirtual   #245 <Method Intent Intent.putExtra(String, android.os.Parcelable)>
	//  108  358:pop             
			if(!callback.onMediaButtonEvent(intent))
	//* 109  359:aload_2         
	//* 110  360:aload_3         
	//* 111  361:invokevirtual   #248 <Method boolean MediaSessionCompat$Callback.onMediaButtonEvent(Intent)>
	//* 112  364:ifne            605
			{
				onMediaButtonEvent(((KeyEvent) (message)), callback);
	//  113  367:aload_0         
	//  114  368:aload_1         
	//  115  369:aload_2         
	//  116  370:invokespecial   #250 <Method void onMediaButtonEvent(KeyEvent, MediaSessionCompat$Callback)>
				return;
	//  117  373:return          
			}
			break;

		case 20: // '\024'
			callback.onCustomAction((String)message.obj, message.getData());
	//  118  374:aload_2         
	//  119  375:aload_1         
	//  120  376:getfield        #167 <Field Object Message.obj>
	//  121  379:checkcast       #252 <Class String>
	//  122  382:aload_1         
	//  123  383:invokevirtual   #173 <Method Bundle Message.getData()>
	//  124  386:invokevirtual   #256 <Method void MediaSessionCompat$Callback.onCustomAction(String, Bundle)>
			return;
	//  125  389:return          

		case 19: // '\023'
			callback.onSetRating((RatingCompat)message.obj);
	//  126  390:aload_2         
	//  127  391:aload_1         
	//  128  392:getfield        #167 <Field Object Message.obj>
	//  129  395:checkcast       #169 <Class RatingCompat>
	//  130  398:invokevirtual   #259 <Method void MediaSessionCompat$Callback.onSetRating(RatingCompat)>
			return;
	//  131  401:return          

		case 18: // '\022'
			callback.onSeekTo(((Long)message.obj).longValue());
	//  132  402:aload_2         
	//  133  403:aload_1         
	//  134  404:getfield        #167 <Field Object Message.obj>
	//  135  407:checkcast       #261 <Class Long>
	//  136  410:invokevirtual   #264 <Method long Long.longValue()>
	//  137  413:invokevirtual   #268 <Method void MediaSessionCompat$Callback.onSeekTo(long)>
			return;
	//  138  416:return          

		case 17: // '\021'
			callback.onRewind();
	//  139  417:aload_2         
	//  140  418:invokevirtual   #129 <Method void MediaSessionCompat$Callback.onRewind()>
			return;
	//  141  421:return          

		case 16: // '\020'
			callback.onFastForward();
	//  142  422:aload_2         
	//  143  423:invokevirtual   #124 <Method void MediaSessionCompat$Callback.onFastForward()>
			return;
	//  144  426:return          

		case 15: // '\017'
			callback.onSkipToPrevious();
	//  145  427:aload_2         
	//  146  428:invokevirtual   #134 <Method void MediaSessionCompat$Callback.onSkipToPrevious()>
			return;
	//  147  431:return          

		case 14: // '\016'
			callback.onSkipToNext();
	//  148  432:aload_2         
	//  149  433:invokevirtual   #139 <Method void MediaSessionCompat$Callback.onSkipToNext()>
			return;
	//  150  436:return          

		case 13: // '\r'
			callback.onStop();
	//  151  437:aload_2         
	//  152  438:invokevirtual   #142 <Method void MediaSessionCompat$Callback.onStop()>
			return;
	//  153  441:return          

		case 12: // '\f'
			callback.onPause();
	//  154  442:aload_2         
	//  155  443:invokevirtual   #114 <Method void MediaSessionCompat$Callback.onPause()>
			return;
	//  156  446:return          

		case 11: // '\013'
			callback.onSkipToQueueItem(((Long)message.obj).longValue());
	//  157  447:aload_2         
	//  158  448:aload_1         
	//  159  449:getfield        #167 <Field Object Message.obj>
	//  160  452:checkcast       #261 <Class Long>
	//  161  455:invokevirtual   #264 <Method long Long.longValue()>
	//  162  458:invokevirtual   #271 <Method void MediaSessionCompat$Callback.onSkipToQueueItem(long)>
			return;
	//  163  461:return          

		case 10: // '\n'
			callback.onPlayFromUri((Uri)message.obj, message.getData());
	//  164  462:aload_2         
	//  165  463:aload_1         
	//  166  464:getfield        #167 <Field Object Message.obj>
	//  167  467:checkcast       #273 <Class Uri>
	//  168  470:aload_1         
	//  169  471:invokevirtual   #173 <Method Bundle Message.getData()>
	//  170  474:invokevirtual   #277 <Method void MediaSessionCompat$Callback.onPlayFromUri(Uri, Bundle)>
			return;
	//  171  477:return          

		case 9: // '\t'
			callback.onPlayFromSearch((String)message.obj, message.getData());
	//  172  478:aload_2         
	//  173  479:aload_1         
	//  174  480:getfield        #167 <Field Object Message.obj>
	//  175  483:checkcast       #252 <Class String>
	//  176  486:aload_1         
	//  177  487:invokevirtual   #173 <Method Bundle Message.getData()>
	//  178  490:invokevirtual   #280 <Method void MediaSessionCompat$Callback.onPlayFromSearch(String, Bundle)>
			return;
	//  179  493:return          

		case 8: // '\b'
			callback.onPlayFromMediaId((String)message.obj, message.getData());
	//  180  494:aload_2         
	//  181  495:aload_1         
	//  182  496:getfield        #167 <Field Object Message.obj>
	//  183  499:checkcast       #252 <Class String>
	//  184  502:aload_1         
	//  185  503:invokevirtual   #173 <Method Bundle Message.getData()>
	//  186  506:invokevirtual   #283 <Method void MediaSessionCompat$Callback.onPlayFromMediaId(String, Bundle)>
			return;
	//  187  509:return          

		case 7: // '\007'
			callback.onPlay();
	//  188  510:aload_2         
	//  189  511:invokevirtual   #119 <Method void MediaSessionCompat$Callback.onPlay()>
			return;
	//  190  514:return          

		case 6: // '\006'
			callback.onPrepareFromUri((Uri)message.obj, message.getData());
	//  191  515:aload_2         
	//  192  516:aload_1         
	//  193  517:getfield        #167 <Field Object Message.obj>
	//  194  520:checkcast       #273 <Class Uri>
	//  195  523:aload_1         
	//  196  524:invokevirtual   #173 <Method Bundle Message.getData()>
	//  197  527:invokevirtual   #286 <Method void MediaSessionCompat$Callback.onPrepareFromUri(Uri, Bundle)>
			return;
	//  198  530:return          

		case 5: // '\005'
			callback.onPrepareFromSearch((String)message.obj, message.getData());
	//  199  531:aload_2         
	//  200  532:aload_1         
	//  201  533:getfield        #167 <Field Object Message.obj>
	//  202  536:checkcast       #252 <Class String>
	//  203  539:aload_1         
	//  204  540:invokevirtual   #173 <Method Bundle Message.getData()>
	//  205  543:invokevirtual   #289 <Method void MediaSessionCompat$Callback.onPrepareFromSearch(String, Bundle)>
			return;
	//  206  546:return          

		case 4: // '\004'
			callback.onPrepareFromMediaId((String)message.obj, message.getData());
	//  207  547:aload_2         
	//  208  548:aload_1         
	//  209  549:getfield        #167 <Field Object Message.obj>
	//  210  552:checkcast       #252 <Class String>
	//  211  555:aload_1         
	//  212  556:invokevirtual   #173 <Method Bundle Message.getData()>
	//  213  559:invokevirtual   #292 <Method void MediaSessionCompat$Callback.onPrepareFromMediaId(String, Bundle)>
			return;
	//  214  562:return          

		case 3: // '\003'
			callback.onPrepare();
	//  215  563:aload_2         
	//  216  564:invokevirtual   #295 <Method void MediaSessionCompat$Callback.onPrepare()>
			return;
	//  217  567:return          

		case 2: // '\002'
			adjustVolume(message.arg1, 0);
	//  218  568:aload_0         
	//  219  569:getfield        #81  <Field MediaSessionCompat$MediaSessionImplBase this$0>
	//  220  572:aload_1         
	//  221  573:getfield        #180 <Field int Message.arg1>
	//  222  576:iconst_0        
	//  223  577:invokevirtual   #298 <Method void MediaSessionCompat$MediaSessionImplBase.adjustVolume(int, int)>
			return;
	//  224  580:return          

		case 1: // '\001'
			message = ((Message) ((MediaSessionCompat.MediaSessionImplBase.Command)message.obj));
	//  225  581:aload_1         
	//  226  582:getfield        #167 <Field Object Message.obj>
	//  227  585:checkcast       #300 <Class MediaSessionCompat$MediaSessionImplBase$Command>
	//  228  588:astore_1        
			callback.onCommand(((MediaSessionCompat.MediaSessionImplBase.Command) (message)).command, ((MediaSessionCompat.MediaSessionImplBase.Command) (message)).extras, ((MediaSessionCompat.MediaSessionImplBase.Command) (message)).stub);
	//  229  589:aload_2         
	//  230  590:aload_1         
	//  231  591:getfield        #304 <Field String MediaSessionCompat$MediaSessionImplBase$Command.command>
	//  232  594:aload_1         
	//  233  595:getfield        #308 <Field Bundle MediaSessionCompat$MediaSessionImplBase$Command.extras>
	//  234  598:aload_1         
	//  235  599:getfield        #312 <Field android.os.ResultReceiver MediaSessionCompat$MediaSessionImplBase$Command.stub>
	//  236  602:invokevirtual   #316 <Method void MediaSessionCompat$Callback.onCommand(String, Bundle, android.os.ResultReceiver)>
			break;
		}
	//  237  605:return          
	}

	public void post(int i)
	{
		post(i, ((Object) (null)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aconst_null     
	//    3    3:invokevirtual   #320 <Method void post(int, Object)>
	//    4    6:return          
	}

	public void post(int i, Object obj)
	{
		obtainMessage(i, obj).sendToTarget();
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #324 <Method Message obtainMessage(int, Object)>
	//    4    6:invokevirtual   #327 <Method void Message.sendToTarget()>
	//    5    9:return          
	}

	public void post(int i, Object obj, int j)
	{
		obtainMessage(i, j, 0, obj).sendToTarget();
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_3         
	//    3    3:iconst_0        
	//    4    4:aload_2         
	//    5    5:invokevirtual   #331 <Method Message obtainMessage(int, int, int, Object)>
	//    6    8:invokevirtual   #327 <Method void Message.sendToTarget()>
	//    7   11:return          
	}

	public void post(int i, Object obj, Bundle bundle)
	{
		obj = ((Object) (obtainMessage(i, obj)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #324 <Method Message obtainMessage(int, Object)>
	//    4    6:astore_2        
		((Message) (obj)).setData(bundle);
	//    5    7:aload_2         
	//    6    8:aload_3         
	//    7    9:invokevirtual   #336 <Method void Message.setData(Bundle)>
		((Message) (obj)).sendToTarget();
	//    8   12:aload_2         
	//    9   13:invokevirtual   #327 <Method void Message.sendToTarget()>
	//   10   16:return          
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
