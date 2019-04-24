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
		if(keyevent != null && keyevent.getAction() == 0) goto _L2; else goto _L1
	//    0    0:aload_1         
	//    1    1:ifnull          11
	//    2    4:aload_1         
	//    3    5:invokevirtual   #95  <Method int KeyEvent.getAction()>
	//    4    8:ifeq            12
_L1:
		return;
	//    5   11:return          
_L2:
		long l;
		if(mState == null)
	//*   6   12:aload_0         
	//*   7   13:getfield        #83  <Field MediaSessionCompat$MediaSessionImplBase this$0>
	//*   8   16:getfield        #99  <Field PlaybackStateCompat MediaSessionCompat$MediaSessionImplBase.mState>
	//*   9   19:ifnonnull       122
			l = 0L;
	//   10   22:lconst_0        
	//   11   23:lstore_3        
		else
	//*  12   24:aload_1         
	//*  13   25:invokevirtual   #102 <Method int KeyEvent.getKeyCode()>
	//*  14   28:lookupswitch    9: default 112
	//	               79: 113
	//	               85: 113
	//	               86: 196
	//	               87: 166
	//	               88: 181
	//	               89: 224
	//	               90: 209
	//	               126: 136
	//	               127: 151
	//*  15  112:return          
	//*  16  113:ldc1            #104 <String "MediaSessionCompat">
	//*  17  115:ldc1            #106 <String "KEYCODE_MEDIA_PLAY_PAUSE and KEYCODE_HEADSETHOOK are handled already">
	//*  18  117:invokestatic    #112 <Method int Log.w(String, String)>
	//*  19  120:pop             
	//*  20  121:return          
			l = mState.getActions();
	//   21  122:aload_0         
	//   22  123:getfield        #83  <Field MediaSessionCompat$MediaSessionImplBase this$0>
	//   23  126:getfield        #99  <Field PlaybackStateCompat MediaSessionCompat$MediaSessionImplBase.mState>
	//   24  129:invokevirtual   #118 <Method long PlaybackStateCompat.getActions()>
	//   25  132:lstore_3        
		keyevent.getKeyCode();
		JVM INSTR lookupswitch 9: default 112
	//	               79: 113
	//	               85: 113
	//	               86: 196
	//	               87: 166
	//	               88: 181
	//	               89: 224
	//	               90: 209
	//	               126: 136
	//	               127: 151;
		   goto _L3 _L4 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11
_L8:
		continue; /* Loop/switch isn't completed */
_L3:
		return;
_L4:
		Log.w("MediaSessionCompat", "KEYCODE_MEDIA_PLAY_PAUSE and KEYCODE_HEADSETHOOK are handled already");
		return;
	//*  26  133:goto            24
_L10:
		if((l & 4L) == 0L) goto _L1; else goto _L12
	//   27  136:lload_3         
	//   28  137:ldc2w           #119 <Long 4L>
	//   29  140:land            
	//   30  141:lconst_0        
	//   31  142:lcmp            
	//   32  143:ifeq            11
_L12:
		callback.onPlay();
	//   33  146:aload_2         
	//   34  147:invokevirtual   #126 <Method void MediaSessionCompat$Callback.onPlay()>
		return;
	//   35  150:return          
_L11:
		if((l & 2L) == 0L) goto _L1; else goto _L13
	//   36  151:lload_3         
	//   37  152:ldc2w           #127 <Long 2L>
	//   38  155:land            
	//   39  156:lconst_0        
	//   40  157:lcmp            
	//   41  158:ifeq            11
_L13:
		callback.onPause();
	//   42  161:aload_2         
	//   43  162:invokevirtual   #131 <Method void MediaSessionCompat$Callback.onPause()>
		return;
	//   44  165:return          
_L6:
		if((l & 32L) == 0L) goto _L1; else goto _L14
	//   45  166:lload_3         
	//   46  167:ldc2w           #132 <Long 32L>
	//   47  170:land            
	//   48  171:lconst_0        
	//   49  172:lcmp            
	//   50  173:ifeq            11
_L14:
		callback.onSkipToNext();
	//   51  176:aload_2         
	//   52  177:invokevirtual   #136 <Method void MediaSessionCompat$Callback.onSkipToNext()>
		return;
	//   53  180:return          
_L7:
		if((l & 16L) == 0L) goto _L1; else goto _L15
	//   54  181:lload_3         
	//   55  182:ldc2w           #137 <Long 16L>
	//   56  185:land            
	//   57  186:lconst_0        
	//   58  187:lcmp            
	//   59  188:ifeq            11
_L15:
		callback.onSkipToPrevious();
	//   60  191:aload_2         
	//   61  192:invokevirtual   #141 <Method void MediaSessionCompat$Callback.onSkipToPrevious()>
		return;
	//   62  195:return          
_L5:
		if((l & 1L) == 0L) goto _L1; else goto _L16
	//   63  196:lload_3         
	//   64  197:lconst_1        
	//   65  198:land            
	//   66  199:lconst_0        
	//   67  200:lcmp            
	//   68  201:ifeq            11
_L16:
		callback.onStop();
	//   69  204:aload_2         
	//   70  205:invokevirtual   #144 <Method void MediaSessionCompat$Callback.onStop()>
		return;
	//   71  208:return          
_L9:
		if((l & 64L) == 0L) goto _L1; else goto _L17
	//   72  209:lload_3         
	//   73  210:ldc2w           #145 <Long 64L>
	//   74  213:land            
	//   75  214:lconst_0        
	//   76  215:lcmp            
	//   77  216:ifeq            11
_L17:
		callback.onFastForward();
	//   78  219:aload_2         
	//   79  220:invokevirtual   #149 <Method void MediaSessionCompat$Callback.onFastForward()>
		return;
	//   80  223:return          
		if((l & 8L) == 0L) goto _L1; else goto _L18
	//   81  224:lload_3         
	//   82  225:ldc2w           #150 <Long 8L>
	//   83  228:land            
	//   84  229:lconst_0        
	//   85  230:lcmp            
	//   86  231:ifeq            11
_L18:
		callback.onRewind();
	//   87  234:aload_2         
	//   88  235:invokevirtual   #154 <Method void MediaSessionCompat$Callback.onRewind()>
		return;
	//   89  238:return          
	}

	public void handleMessage(Message message)
	{
		MediaSessionCompat.Callback callback = mCallback;
	//    0    0:aload_0         
	//    1    1:getfield        #83  <Field MediaSessionCompat$MediaSessionImplBase this$0>
	//    2    4:getfield        #160 <Field MediaSessionCompat$Callback MediaSessionCompat$MediaSessionImplBase.mCallback>
	//    3    7:astore_2        
		if(callback != null) goto _L2; else goto _L1
	//    4    8:aload_2         
	//    5    9:ifnonnull       13
_L1:
		return;
	//    6   12:return          
_L2:
		switch(message.what)
	//*   7   13:aload_1         
	//*   8   14:getfield        #165 <Field int Message.what>
		{
	//*   9   17:tableswitch     1 31: default 156
	//	               1 157
	//	               2 547
	//	               3 223
	//	               4 228
	//	               5 244
	//	               6 260
	//	               7 276
	//	               8 281
	//	               9 297
	//	               10 313
	//	               11 329
	//	               12 344
	//	               13 349
	//	               14 354
	//	               15 359
	//	               16 364
	//	               17 369
	//	               18 374
	//	               19 389
	//	               20 417
	//	               21 182
	//	               22 560
	//	               23 588
	//	               24 597
	//	               25 433
	//	               26 445
	//	               27 461
	//	               28 473
	//	               29 573
	//	               30 612
	//	               31 401
		default:
			return;
	//   10  156:return          

		case 2: // '\002'
			break; /* Loop/switch isn't completed */

		case 22: // '\026'
			break MISSING_BLOCK_LABEL_560;

		case 23: // '\027'
			break MISSING_BLOCK_LABEL_588;

		case 24: // '\030'
			break MISSING_BLOCK_LABEL_597;

		case 29: // '\035'
			break MISSING_BLOCK_LABEL_573;

		case 30: // '\036'
			break MISSING_BLOCK_LABEL_612;

		case 1: // '\001'
			message = ((Message) ((MediaSessionCompat.MediaSessionImplBase.Command)message.obj));
	//   11  157:aload_1         
	//   12  158:getfield        #169 <Field Object Message.obj>
	//   13  161:checkcast       #171 <Class MediaSessionCompat$MediaSessionImplBase$Command>
	//   14  164:astore_1        
			callback.onCommand(((MediaSessionCompat.MediaSessionImplBase.Command) (message)).command, ((MediaSessionCompat.MediaSessionImplBase.Command) (message)).extras, ((MediaSessionCompat.MediaSessionImplBase.Command) (message)).stub);
	//   15  165:aload_2         
	//   16  166:aload_1         
	//   17  167:getfield        #175 <Field String MediaSessionCompat$MediaSessionImplBase$Command.command>
	//   18  170:aload_1         
	//   19  171:getfield        #179 <Field Bundle MediaSessionCompat$MediaSessionImplBase$Command.extras>
	//   20  174:aload_1         
	//   21  175:getfield        #183 <Field android.os.ResultReceiver MediaSessionCompat$MediaSessionImplBase$Command.stub>
	//   22  178:invokevirtual   #187 <Method void MediaSessionCompat$Callback.onCommand(String, Bundle, android.os.ResultReceiver)>
			return;
	//   23  181:return          

		case 21: // '\025'
			message = ((Message) ((KeyEvent)message.obj));
	//   24  182:aload_1         
	//   25  183:getfield        #169 <Field Object Message.obj>
	//   26  186:checkcast       #91  <Class KeyEvent>
	//   27  189:astore_1        
			Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
	//   28  190:new             #189 <Class Intent>
	//   29  193:dup             
	//   30  194:ldc1            #191 <String "android.intent.action.MEDIA_BUTTON">
	//   31  196:invokespecial   #194 <Method void Intent(String)>
	//   32  199:astore_3        
			intent.putExtra("android.intent.extra.KEY_EVENT", ((android.os.Parcelable) (message)));
	//   33  200:aload_3         
	//   34  201:ldc1            #196 <String "android.intent.extra.KEY_EVENT">
	//   35  203:aload_1         
	//   36  204:invokevirtual   #200 <Method Intent Intent.putExtra(String, android.os.Parcelable)>
	//   37  207:pop             
			if(!callback.onMediaButtonEvent(intent))
	//*  38  208:aload_2         
	//*  39  209:aload_3         
	//*  40  210:invokevirtual   #203 <Method boolean MediaSessionCompat$Callback.onMediaButtonEvent(Intent)>
	//*  41  213:ifne            12
			{
				onMediaButtonEvent(((KeyEvent) (message)), callback);
	//   42  216:aload_0         
	//   43  217:aload_1         
	//   44  218:aload_2         
	//   45  219:invokespecial   #205 <Method void onMediaButtonEvent(KeyEvent, MediaSessionCompat$Callback)>
				return;
	//   46  222:return          
			}
			break;

		case 3: // '\003'
			callback.onPrepare();
	//   47  223:aload_2         
	//   48  224:invokevirtual   #208 <Method void MediaSessionCompat$Callback.onPrepare()>
			return;
	//   49  227:return          

		case 4: // '\004'
			callback.onPrepareFromMediaId((String)message.obj, message.getData());
	//   50  228:aload_2         
	//   51  229:aload_1         
	//   52  230:getfield        #169 <Field Object Message.obj>
	//   53  233:checkcast       #210 <Class String>
	//   54  236:aload_1         
	//   55  237:invokevirtual   #214 <Method Bundle Message.getData()>
	//   56  240:invokevirtual   #218 <Method void MediaSessionCompat$Callback.onPrepareFromMediaId(String, Bundle)>
			return;
	//   57  243:return          

		case 5: // '\005'
			callback.onPrepareFromSearch((String)message.obj, message.getData());
	//   58  244:aload_2         
	//   59  245:aload_1         
	//   60  246:getfield        #169 <Field Object Message.obj>
	//   61  249:checkcast       #210 <Class String>
	//   62  252:aload_1         
	//   63  253:invokevirtual   #214 <Method Bundle Message.getData()>
	//   64  256:invokevirtual   #221 <Method void MediaSessionCompat$Callback.onPrepareFromSearch(String, Bundle)>
			return;
	//   65  259:return          

		case 6: // '\006'
			callback.onPrepareFromUri((Uri)message.obj, message.getData());
	//   66  260:aload_2         
	//   67  261:aload_1         
	//   68  262:getfield        #169 <Field Object Message.obj>
	//   69  265:checkcast       #223 <Class Uri>
	//   70  268:aload_1         
	//   71  269:invokevirtual   #214 <Method Bundle Message.getData()>
	//   72  272:invokevirtual   #227 <Method void MediaSessionCompat$Callback.onPrepareFromUri(Uri, Bundle)>
			return;
	//   73  275:return          

		case 7: // '\007'
			callback.onPlay();
	//   74  276:aload_2         
	//   75  277:invokevirtual   #126 <Method void MediaSessionCompat$Callback.onPlay()>
			return;
	//   76  280:return          

		case 8: // '\b'
			callback.onPlayFromMediaId((String)message.obj, message.getData());
	//   77  281:aload_2         
	//   78  282:aload_1         
	//   79  283:getfield        #169 <Field Object Message.obj>
	//   80  286:checkcast       #210 <Class String>
	//   81  289:aload_1         
	//   82  290:invokevirtual   #214 <Method Bundle Message.getData()>
	//   83  293:invokevirtual   #230 <Method void MediaSessionCompat$Callback.onPlayFromMediaId(String, Bundle)>
			return;
	//   84  296:return          

		case 9: // '\t'
			callback.onPlayFromSearch((String)message.obj, message.getData());
	//   85  297:aload_2         
	//   86  298:aload_1         
	//   87  299:getfield        #169 <Field Object Message.obj>
	//   88  302:checkcast       #210 <Class String>
	//   89  305:aload_1         
	//   90  306:invokevirtual   #214 <Method Bundle Message.getData()>
	//   91  309:invokevirtual   #233 <Method void MediaSessionCompat$Callback.onPlayFromSearch(String, Bundle)>
			return;
	//   92  312:return          

		case 10: // '\n'
			callback.onPlayFromUri((Uri)message.obj, message.getData());
	//   93  313:aload_2         
	//   94  314:aload_1         
	//   95  315:getfield        #169 <Field Object Message.obj>
	//   96  318:checkcast       #223 <Class Uri>
	//   97  321:aload_1         
	//   98  322:invokevirtual   #214 <Method Bundle Message.getData()>
	//   99  325:invokevirtual   #236 <Method void MediaSessionCompat$Callback.onPlayFromUri(Uri, Bundle)>
			return;
	//  100  328:return          

		case 11: // '\013'
			callback.onSkipToQueueItem(((Long)message.obj).longValue());
	//  101  329:aload_2         
	//  102  330:aload_1         
	//  103  331:getfield        #169 <Field Object Message.obj>
	//  104  334:checkcast       #238 <Class Long>
	//  105  337:invokevirtual   #241 <Method long Long.longValue()>
	//  106  340:invokevirtual   #245 <Method void MediaSessionCompat$Callback.onSkipToQueueItem(long)>
			return;
	//  107  343:return          

		case 12: // '\f'
			callback.onPause();
	//  108  344:aload_2         
	//  109  345:invokevirtual   #131 <Method void MediaSessionCompat$Callback.onPause()>
			return;
	//  110  348:return          

		case 13: // '\r'
			callback.onStop();
	//  111  349:aload_2         
	//  112  350:invokevirtual   #144 <Method void MediaSessionCompat$Callback.onStop()>
			return;
	//  113  353:return          

		case 14: // '\016'
			callback.onSkipToNext();
	//  114  354:aload_2         
	//  115  355:invokevirtual   #136 <Method void MediaSessionCompat$Callback.onSkipToNext()>
			return;
	//  116  358:return          

		case 15: // '\017'
			callback.onSkipToPrevious();
	//  117  359:aload_2         
	//  118  360:invokevirtual   #141 <Method void MediaSessionCompat$Callback.onSkipToPrevious()>
			return;
	//  119  363:return          

		case 16: // '\020'
			callback.onFastForward();
	//  120  364:aload_2         
	//  121  365:invokevirtual   #149 <Method void MediaSessionCompat$Callback.onFastForward()>
			return;
	//  122  368:return          

		case 17: // '\021'
			callback.onRewind();
	//  123  369:aload_2         
	//  124  370:invokevirtual   #154 <Method void MediaSessionCompat$Callback.onRewind()>
			return;
	//  125  373:return          

		case 18: // '\022'
			callback.onSeekTo(((Long)message.obj).longValue());
	//  126  374:aload_2         
	//  127  375:aload_1         
	//  128  376:getfield        #169 <Field Object Message.obj>
	//  129  379:checkcast       #238 <Class Long>
	//  130  382:invokevirtual   #241 <Method long Long.longValue()>
	//  131  385:invokevirtual   #248 <Method void MediaSessionCompat$Callback.onSeekTo(long)>
			return;
	//  132  388:return          

		case 19: // '\023'
			callback.onSetRating((RatingCompat)message.obj);
	//  133  389:aload_2         
	//  134  390:aload_1         
	//  135  391:getfield        #169 <Field Object Message.obj>
	//  136  394:checkcast       #250 <Class RatingCompat>
	//  137  397:invokevirtual   #254 <Method void MediaSessionCompat$Callback.onSetRating(RatingCompat)>
			return;
	//  138  400:return          

		case 31: // '\037'
			callback.onSetRating((RatingCompat)message.obj, message.getData());
	//  139  401:aload_2         
	//  140  402:aload_1         
	//  141  403:getfield        #169 <Field Object Message.obj>
	//  142  406:checkcast       #250 <Class RatingCompat>
	//  143  409:aload_1         
	//  144  410:invokevirtual   #214 <Method Bundle Message.getData()>
	//  145  413:invokevirtual   #257 <Method void MediaSessionCompat$Callback.onSetRating(RatingCompat, Bundle)>
			return;
	//  146  416:return          

		case 20: // '\024'
			callback.onCustomAction((String)message.obj, message.getData());
	//  147  417:aload_2         
	//  148  418:aload_1         
	//  149  419:getfield        #169 <Field Object Message.obj>
	//  150  422:checkcast       #210 <Class String>
	//  151  425:aload_1         
	//  152  426:invokevirtual   #214 <Method Bundle Message.getData()>
	//  153  429:invokevirtual   #260 <Method void MediaSessionCompat$Callback.onCustomAction(String, Bundle)>
			return;
	//  154  432:return          

		case 25: // '\031'
			callback.onAddQueueItem((MediaDescriptionCompat)message.obj);
	//  155  433:aload_2         
	//  156  434:aload_1         
	//  157  435:getfield        #169 <Field Object Message.obj>
	//  158  438:checkcast       #262 <Class MediaDescriptionCompat>
	//  159  441:invokevirtual   #266 <Method void MediaSessionCompat$Callback.onAddQueueItem(MediaDescriptionCompat)>
			return;
	//  160  444:return          

		case 26: // '\032'
			callback.onAddQueueItem((MediaDescriptionCompat)message.obj, message.arg1);
	//  161  445:aload_2         
	//  162  446:aload_1         
	//  163  447:getfield        #169 <Field Object Message.obj>
	//  164  450:checkcast       #262 <Class MediaDescriptionCompat>
	//  165  453:aload_1         
	//  166  454:getfield        #269 <Field int Message.arg1>
	//  167  457:invokevirtual   #272 <Method void MediaSessionCompat$Callback.onAddQueueItem(MediaDescriptionCompat, int)>
			return;
	//  168  460:return          

		case 27: // '\033'
			callback.onRemoveQueueItem((MediaDescriptionCompat)message.obj);
	//  169  461:aload_2         
	//  170  462:aload_1         
	//  171  463:getfield        #169 <Field Object Message.obj>
	//  172  466:checkcast       #262 <Class MediaDescriptionCompat>
	//  173  469:invokevirtual   #275 <Method void MediaSessionCompat$Callback.onRemoveQueueItem(MediaDescriptionCompat)>
			return;
	//  174  472:return          

		case 28: // '\034'
			if(mQueue != null)
				break MISSING_BLOCK_LABEL_483;
	//  175  473:aload_0         
	//  176  474:getfield        #83  <Field MediaSessionCompat$MediaSessionImplBase this$0>
	//  177  477:getfield        #279 <Field List MediaSessionCompat$MediaSessionImplBase.mQueue>
	//  178  480:ifnull          12
			break;
		}
		if(true) goto _L1; else goto _L3
_L3:
		break; /* Loop/switch isn't completed */
		if(message.arg1 >= 0 && message.arg1 < mQueue.size())
	//* 179  483:aload_1         
	//* 180  484:getfield        #269 <Field int Message.arg1>
	//* 181  487:iflt            542
	//* 182  490:aload_1         
	//* 183  491:getfield        #269 <Field int Message.arg1>
	//* 184  494:aload_0         
	//* 185  495:getfield        #83  <Field MediaSessionCompat$MediaSessionImplBase this$0>
	//* 186  498:getfield        #279 <Field List MediaSessionCompat$MediaSessionImplBase.mQueue>
	//* 187  501:invokeinterface #284 <Method int List.size()>
	//* 188  506:icmpge          542
			message = ((Message) ((MediaSessionCompat.QueueItem)mQueue.get(message.arg1)));
	//  189  509:aload_0         
	//  190  510:getfield        #83  <Field MediaSessionCompat$MediaSessionImplBase this$0>
	//  191  513:getfield        #279 <Field List MediaSessionCompat$MediaSessionImplBase.mQueue>
	//  192  516:aload_1         
	//  193  517:getfield        #269 <Field int Message.arg1>
	//  194  520:invokeinterface #288 <Method Object List.get(int)>
	//  195  525:checkcast       #290 <Class MediaSessionCompat$QueueItem>
	//  196  528:astore_1        
		else
	//* 197  529:aload_1         
	//* 198  530:ifnull          12
	//* 199  533:aload_2         
	//* 200  534:aload_1         
	//* 201  535:invokevirtual   #294 <Method MediaDescriptionCompat MediaSessionCompat$QueueItem.getDescription()>
	//* 202  538:invokevirtual   #275 <Method void MediaSessionCompat$Callback.onRemoveQueueItem(MediaDescriptionCompat)>
	//* 203  541:return          
			message = null;
	//  204  542:aconst_null     
	//  205  543:astore_1        
		if(message != null)
		{
			callback.onRemoveQueueItem(((MediaSessionCompat.QueueItem) (message)).getDescription());
			return;
		}
		if(true) goto _L1; else goto _L4
	//  206  544:goto            529
_L4:
		adjustVolume(message.arg1, 0);
	//  207  547:aload_0         
	//  208  548:getfield        #83  <Field MediaSessionCompat$MediaSessionImplBase this$0>
	//  209  551:aload_1         
	//  210  552:getfield        #269 <Field int Message.arg1>
	//  211  555:iconst_0        
	//  212  556:invokevirtual   #298 <Method void MediaSessionCompat$MediaSessionImplBase.adjustVolume(int, int)>
		return;
	//  213  559:return          
		setVolumeTo(message.arg1, 0);
	//  214  560:aload_0         
	//  215  561:getfield        #83  <Field MediaSessionCompat$MediaSessionImplBase this$0>
	//  216  564:aload_1         
	//  217  565:getfield        #269 <Field int Message.arg1>
	//  218  568:iconst_0        
	//  219  569:invokevirtual   #301 <Method void MediaSessionCompat$MediaSessionImplBase.setVolumeTo(int, int)>
		return;
	//  220  572:return          
		callback.onSetCaptioningEnabled(((Boolean)message.obj).booleanValue());
	//  221  573:aload_2         
	//  222  574:aload_1         
	//  223  575:getfield        #169 <Field Object Message.obj>
	//  224  578:checkcast       #303 <Class Boolean>
	//  225  581:invokevirtual   #307 <Method boolean Boolean.booleanValue()>
	//  226  584:invokevirtual   #311 <Method void MediaSessionCompat$Callback.onSetCaptioningEnabled(boolean)>
		return;
	//  227  587:return          
		callback.onSetRepeatMode(message.arg1);
	//  228  588:aload_2         
	//  229  589:aload_1         
	//  230  590:getfield        #269 <Field int Message.arg1>
	//  231  593:invokevirtual   #315 <Method void MediaSessionCompat$Callback.onSetRepeatMode(int)>
		return;
	//  232  596:return          
		callback.onSetShuffleModeEnabled(((Boolean)message.obj).booleanValue());
	//  233  597:aload_2         
	//  234  598:aload_1         
	//  235  599:getfield        #169 <Field Object Message.obj>
	//  236  602:checkcast       #303 <Class Boolean>
	//  237  605:invokevirtual   #307 <Method boolean Boolean.booleanValue()>
	//  238  608:invokevirtual   #318 <Method void MediaSessionCompat$Callback.onSetShuffleModeEnabled(boolean)>
		return;
	//  239  611:return          
		callback.onSetShuffleMode(message.arg1);
	//  240  612:aload_2         
	//  241  613:aload_1         
	//  242  614:getfield        #269 <Field int Message.arg1>
	//  243  617:invokevirtual   #321 <Method void MediaSessionCompat$Callback.onSetShuffleMode(int)>
		return;
	//  244  620:return          
	}

	public void post(int i)
	{
		post(i, ((Object) (null)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aconst_null     
	//    3    3:invokevirtual   #325 <Method void post(int, Object)>
	//    4    6:return          
	}

	public void post(int i, Object obj)
	{
		obtainMessage(i, obj).sendToTarget();
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #329 <Method Message obtainMessage(int, Object)>
	//    4    6:invokevirtual   #332 <Method void Message.sendToTarget()>
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
	//    5    5:invokevirtual   #336 <Method Message obtainMessage(int, int, int, Object)>
	//    6    8:invokevirtual   #332 <Method void Message.sendToTarget()>
	//    7   11:return          
	}

	public void post(int i, Object obj, Bundle bundle)
	{
		obj = ((Object) (obtainMessage(i, obj)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #329 <Method Message obtainMessage(int, Object)>
	//    4    6:astore_2        
		((Message) (obj)).setData(bundle);
	//    5    7:aload_2         
	//    6    8:aload_3         
	//    7    9:invokevirtual   #341 <Method void Message.setData(Bundle)>
		((Message) (obj)).sendToTarget();
	//    8   12:aload_2         
	//    9   13:invokevirtual   #332 <Method void Message.sendToTarget()>
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
	private static final int MSG_SET_SHUFFLE_MODE_ENABLED = 24;
	private static final int MSG_SET_VOLUME = 22;
	private static final int MSG_SKIP_TO_ITEM = 11;
	private static final int MSG_STOP = 13;
	final MediaSessionCompat.MediaSessionImplBase this$0;

	public MediaSessionCompat$MediaSessionImplBase$MessageHandler(Looper looper)
	{
		this$0 = MediaSessionCompat.MediaSessionImplBase.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #83  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		super(looper);
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:invokespecial   #86  <Method void Handler(Looper)>
	//    6   10:return          
	}
}
