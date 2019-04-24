// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media.session;

import android.content.Intent;
import android.net.Uri;
import android.os.*;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.RatingCompat;
import android.view.KeyEvent;

// Referenced classes of package android.support.v4.media.session:
//			MediaSessionCompat, PlaybackStateCompat

class MediaSessionCompat$MediaSessionImplBase$MessageHandler extends Handler
{

	private void onMediaButtonEvent(KeyEvent keyevent, MediaSessionCompat.Callback callback)
	{
		if(keyevent == null || keyevent.getAction() != 0)
	//*   0    0:aload_1         
	//*   1    1:ifnull          11
	//*   2    4:aload_1         
	//*   3    5:invokevirtual   #89  <Method int KeyEvent.getAction()>
	//*   4    8:ifeq            12
			return;
	//    5   11:return          
		long l;
		if(mState == null)
	//*   6   12:aload_0         
	//*   7   13:getfield        #77  <Field MediaSessionCompat$MediaSessionImplBase this$0>
	//*   8   16:getfield        #93  <Field PlaybackStateCompat MediaSessionCompat$MediaSessionImplBase.mState>
	//*   9   19:ifnonnull       28
			l = 0L;
	//   10   22:lconst_0        
	//   11   23:lstore          6
		else
	//*  12   25:goto            40
			l = mState.getActions();
	//   13   28:aload_0         
	//   14   29:getfield        #77  <Field MediaSessionCompat$MediaSessionImplBase this$0>
	//   15   32:getfield        #93  <Field PlaybackStateCompat MediaSessionCompat$MediaSessionImplBase.mState>
	//   16   35:invokevirtual   #99  <Method long PlaybackStateCompat.getActions()>
	//   17   38:lstore          6
		switch(keyevent.getKeyCode())
	//*  18   40:aload_1         
	//*  19   41:invokevirtual   #102 <Method int KeyEvent.getKeyCode()>
		{
	//*  20   44:lookupswitch    9: default 128
	//	               79: 239
	//	               85: 239
	//	               86: 193
	//	               87: 161
	//	               88: 177
	//	               89: 223
	//	               90: 207
	//	               126: 129
	//	               127: 145
		default:
			return;
	//   21  128:return          

		case 126: // '~'
			if((4L & l) != 0L)
	//*  22  129:ldc2w           #103 <Long 4L>
	//*  23  132:lload           6
	//*  24  134:land            
	//*  25  135:lconst_0        
	//*  26  136:lcmp            
	//*  27  137:ifeq            337
			{
				callback.onPlay();
	//   28  140:aload_2         
	//   29  141:invokevirtual   #110 <Method void MediaSessionCompat$Callback.onPlay()>
				return;
	//   30  144:return          
			}
			break;

		case 127: // '\177'
			if((2L & l) != 0L)
	//*  31  145:ldc2w           #111 <Long 2L>
	//*  32  148:lload           6
	//*  33  150:land            
	//*  34  151:lconst_0        
	//*  35  152:lcmp            
	//*  36  153:ifeq            337
			{
				callback.onPause();
	//   37  156:aload_2         
	//   38  157:invokevirtual   #115 <Method void MediaSessionCompat$Callback.onPause()>
				return;
	//   39  160:return          
			}
			break;

		case 87: // 'W'
			if((32L & l) != 0L)
	//*  40  161:ldc2w           #116 <Long 32L>
	//*  41  164:lload           6
	//*  42  166:land            
	//*  43  167:lconst_0        
	//*  44  168:lcmp            
	//*  45  169:ifeq            337
			{
				callback.onSkipToNext();
	//   46  172:aload_2         
	//   47  173:invokevirtual   #120 <Method void MediaSessionCompat$Callback.onSkipToNext()>
				return;
	//   48  176:return          
			}
			break;

		case 88: // 'X'
			if((16L & l) != 0L)
	//*  49  177:ldc2w           #121 <Long 16L>
	//*  50  180:lload           6
	//*  51  182:land            
	//*  52  183:lconst_0        
	//*  53  184:lcmp            
	//*  54  185:ifeq            337
			{
				callback.onSkipToPrevious();
	//   55  188:aload_2         
	//   56  189:invokevirtual   #125 <Method void MediaSessionCompat$Callback.onSkipToPrevious()>
				return;
	//   57  192:return          
			}
			break;

		case 86: // 'V'
			if((1L & l) != 0L)
	//*  58  193:lconst_1        
	//*  59  194:lload           6
	//*  60  196:land            
	//*  61  197:lconst_0        
	//*  62  198:lcmp            
	//*  63  199:ifeq            337
			{
				callback.onStop();
	//   64  202:aload_2         
	//   65  203:invokevirtual   #128 <Method void MediaSessionCompat$Callback.onStop()>
				return;
	//   66  206:return          
			}
			break;

		case 90: // 'Z'
			if((64L & l) != 0L)
	//*  67  207:ldc2w           #129 <Long 64L>
	//*  68  210:lload           6
	//*  69  212:land            
	//*  70  213:lconst_0        
	//*  71  214:lcmp            
	//*  72  215:ifeq            337
			{
				callback.onFastForward();
	//   73  218:aload_2         
	//   74  219:invokevirtual   #133 <Method void MediaSessionCompat$Callback.onFastForward()>
				return;
	//   75  222:return          
			}
			break;

		case 89: // 'Y'
			if((8L & l) != 0L)
	//*  76  223:ldc2w           #134 <Long 8L>
	//*  77  226:lload           6
	//*  78  228:land            
	//*  79  229:lconst_0        
	//*  80  230:lcmp            
	//*  81  231:ifeq            337
			{
				callback.onRewind();
	//   82  234:aload_2         
	//   83  235:invokevirtual   #138 <Method void MediaSessionCompat$Callback.onRewind()>
				return;
	//   84  238:return          
			}
			break;

		case 79: // 'O'
		case 85: // 'U'
			boolean flag;
			if(mState != null && mState.getState() == 3)
	//*  85  239:aload_0         
	//*  86  240:getfield        #77  <Field MediaSessionCompat$MediaSessionImplBase this$0>
	//*  87  243:getfield        #93  <Field PlaybackStateCompat MediaSessionCompat$MediaSessionImplBase.mState>
	//*  88  246:ifnull          268
	//*  89  249:aload_0         
	//*  90  250:getfield        #77  <Field MediaSessionCompat$MediaSessionImplBase this$0>
	//*  91  253:getfield        #93  <Field PlaybackStateCompat MediaSessionCompat$MediaSessionImplBase.mState>
	//*  92  256:invokevirtual   #141 <Method int PlaybackStateCompat.getState()>
	//*  93  259:iconst_3        
	//*  94  260:icmpne          268
				flag = true;
	//   95  263:iconst_1        
	//   96  264:istore_3        
			else
	//*  97  265:goto            270
				flag = false;
	//   98  268:iconst_0        
	//   99  269:istore_3        
			boolean flag1;
			if((516L & l) != 0L)
	//* 100  270:ldc2w           #142 <Long 516L>
	//* 101  273:lload           6
	//* 102  275:land            
	//* 103  276:lconst_0        
	//* 104  277:lcmp            
	//* 105  278:ifeq            287
				flag1 = true;
	//  106  281:iconst_1        
	//  107  282:istore          4
			else
	//* 108  284:goto            290
				flag1 = false;
	//  109  287:iconst_0        
	//  110  288:istore          4
			boolean flag2;
			if((514L & l) != 0L)
	//* 111  290:ldc2w           #144 <Long 514L>
	//* 112  293:lload           6
	//* 113  295:land            
	//* 114  296:lconst_0        
	//* 115  297:lcmp            
	//* 116  298:ifeq            307
				flag2 = true;
	//  117  301:iconst_1        
	//  118  302:istore          5
			else
	//* 119  304:goto            310
				flag2 = false;
	//  120  307:iconst_0        
	//  121  308:istore          5
			if(flag && flag2)
	//* 122  310:iload_3         
	//* 123  311:ifeq            324
	//* 124  314:iload           5
	//* 125  316:ifeq            324
			{
				callback.onPause();
	//  126  319:aload_2         
	//  127  320:invokevirtual   #115 <Method void MediaSessionCompat$Callback.onPause()>
				return;
	//  128  323:return          
			}
			if(!flag && flag1)
	//* 129  324:iload_3         
	//* 130  325:ifne            337
	//* 131  328:iload           4
	//* 132  330:ifeq            337
				callback.onPlay();
	//  133  333:aload_2         
	//  134  334:invokevirtual   #110 <Method void MediaSessionCompat$Callback.onPlay()>
			break;
		}
	//  135  337:return          
	}

	public void handleMessage(Message message)
	{
		MediaSessionCompat.Callback callback = mCallback;
	//    0    0:aload_0         
	//    1    1:getfield        #77  <Field MediaSessionCompat$MediaSessionImplBase this$0>
	//    2    4:getfield        #151 <Field MediaSessionCompat$Callback MediaSessionCompat$MediaSessionImplBase.mCallback>
	//    3    7:astore_2        
		if(callback == null)
	//*   4    8:aload_2         
	//*   5    9:ifnonnull       13
			return;
	//    6   12:return          
		switch(message.what)
	//*   7   13:aload_1         
	//*   8   14:getfield        #156 <Field int Message.what>
		{
	//*   9   17:tableswitch     1 28: default 144
	//	               1 145
	//	               2 454
	//	               3 211
	//	               4 216
	//	               5 232
	//	               6 248
	//	               7 264
	//	               8 269
	//	               9 285
	//	               10 301
	//	               11 317
	//	               12 332
	//	               13 337
	//	               14 342
	//	               15 347
	//	               16 352
	//	               17 357
	//	               18 362
	//	               19 377
	//	               20 389
	//	               21 170
	//	               22 467
	//	               23 480
	//	               24 489
	//	               25 405
	//	               26 417
	//	               27 433
	//	               28 445
		default:
			return;
	//   10  144:return          

		case 1: // '\001'
			message = ((Message) ((MediaSessionCompat.MediaSessionImplBase.Command)message.obj));
	//   11  145:aload_1         
	//   12  146:getfield        #160 <Field Object Message.obj>
	//   13  149:checkcast       #162 <Class MediaSessionCompat$MediaSessionImplBase$Command>
	//   14  152:astore_1        
			callback.onCommand(((MediaSessionCompat.MediaSessionImplBase.Command) (message)).command, ((MediaSessionCompat.MediaSessionImplBase.Command) (message)).extras, ((MediaSessionCompat.MediaSessionImplBase.Command) (message)).stub);
	//   15  153:aload_2         
	//   16  154:aload_1         
	//   17  155:getfield        #166 <Field String MediaSessionCompat$MediaSessionImplBase$Command.command>
	//   18  158:aload_1         
	//   19  159:getfield        #170 <Field Bundle MediaSessionCompat$MediaSessionImplBase$Command.extras>
	//   20  162:aload_1         
	//   21  163:getfield        #174 <Field android.os.ResultReceiver MediaSessionCompat$MediaSessionImplBase$Command.stub>
	//   22  166:invokevirtual   #178 <Method void MediaSessionCompat$Callback.onCommand(String, Bundle, android.os.ResultReceiver)>
			return;
	//   23  169:return          

		case 21: // '\025'
			message = ((Message) ((KeyEvent)message.obj));
	//   24  170:aload_1         
	//   25  171:getfield        #160 <Field Object Message.obj>
	//   26  174:checkcast       #85  <Class KeyEvent>
	//   27  177:astore_1        
			Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
	//   28  178:new             #180 <Class Intent>
	//   29  181:dup             
	//   30  182:ldc1            #182 <String "android.intent.action.MEDIA_BUTTON">
	//   31  184:invokespecial   #185 <Method void Intent(String)>
	//   32  187:astore_3        
			intent.putExtra("android.intent.extra.KEY_EVENT", ((android.os.Parcelable) (message)));
	//   33  188:aload_3         
	//   34  189:ldc1            #187 <String "android.intent.extra.KEY_EVENT">
	//   35  191:aload_1         
	//   36  192:invokevirtual   #191 <Method Intent Intent.putExtra(String, android.os.Parcelable)>
	//   37  195:pop             
			if(!callback.onMediaButtonEvent(intent))
	//*  38  196:aload_2         
	//*  39  197:aload_3         
	//*  40  198:invokevirtual   #194 <Method boolean MediaSessionCompat$Callback.onMediaButtonEvent(Intent)>
	//*  41  201:ifne            503
			{
				onMediaButtonEvent(((KeyEvent) (message)), callback);
	//   42  204:aload_0         
	//   43  205:aload_1         
	//   44  206:aload_2         
	//   45  207:invokespecial   #196 <Method void onMediaButtonEvent(KeyEvent, MediaSessionCompat$Callback)>
				return;
	//   46  210:return          
			}
			break;

		case 3: // '\003'
			callback.onPrepare();
	//   47  211:aload_2         
	//   48  212:invokevirtual   #199 <Method void MediaSessionCompat$Callback.onPrepare()>
			return;
	//   49  215:return          

		case 4: // '\004'
			callback.onPrepareFromMediaId((String)message.obj, message.getData());
	//   50  216:aload_2         
	//   51  217:aload_1         
	//   52  218:getfield        #160 <Field Object Message.obj>
	//   53  221:checkcast       #201 <Class String>
	//   54  224:aload_1         
	//   55  225:invokevirtual   #205 <Method Bundle Message.getData()>
	//   56  228:invokevirtual   #209 <Method void MediaSessionCompat$Callback.onPrepareFromMediaId(String, Bundle)>
			return;
	//   57  231:return          

		case 5: // '\005'
			callback.onPrepareFromSearch((String)message.obj, message.getData());
	//   58  232:aload_2         
	//   59  233:aload_1         
	//   60  234:getfield        #160 <Field Object Message.obj>
	//   61  237:checkcast       #201 <Class String>
	//   62  240:aload_1         
	//   63  241:invokevirtual   #205 <Method Bundle Message.getData()>
	//   64  244:invokevirtual   #212 <Method void MediaSessionCompat$Callback.onPrepareFromSearch(String, Bundle)>
			return;
	//   65  247:return          

		case 6: // '\006'
			callback.onPrepareFromUri((Uri)message.obj, message.getData());
	//   66  248:aload_2         
	//   67  249:aload_1         
	//   68  250:getfield        #160 <Field Object Message.obj>
	//   69  253:checkcast       #214 <Class Uri>
	//   70  256:aload_1         
	//   71  257:invokevirtual   #205 <Method Bundle Message.getData()>
	//   72  260:invokevirtual   #218 <Method void MediaSessionCompat$Callback.onPrepareFromUri(Uri, Bundle)>
			return;
	//   73  263:return          

		case 7: // '\007'
			callback.onPlay();
	//   74  264:aload_2         
	//   75  265:invokevirtual   #110 <Method void MediaSessionCompat$Callback.onPlay()>
			return;
	//   76  268:return          

		case 8: // '\b'
			callback.onPlayFromMediaId((String)message.obj, message.getData());
	//   77  269:aload_2         
	//   78  270:aload_1         
	//   79  271:getfield        #160 <Field Object Message.obj>
	//   80  274:checkcast       #201 <Class String>
	//   81  277:aload_1         
	//   82  278:invokevirtual   #205 <Method Bundle Message.getData()>
	//   83  281:invokevirtual   #221 <Method void MediaSessionCompat$Callback.onPlayFromMediaId(String, Bundle)>
			return;
	//   84  284:return          

		case 9: // '\t'
			callback.onPlayFromSearch((String)message.obj, message.getData());
	//   85  285:aload_2         
	//   86  286:aload_1         
	//   87  287:getfield        #160 <Field Object Message.obj>
	//   88  290:checkcast       #201 <Class String>
	//   89  293:aload_1         
	//   90  294:invokevirtual   #205 <Method Bundle Message.getData()>
	//   91  297:invokevirtual   #224 <Method void MediaSessionCompat$Callback.onPlayFromSearch(String, Bundle)>
			return;
	//   92  300:return          

		case 10: // '\n'
			callback.onPlayFromUri((Uri)message.obj, message.getData());
	//   93  301:aload_2         
	//   94  302:aload_1         
	//   95  303:getfield        #160 <Field Object Message.obj>
	//   96  306:checkcast       #214 <Class Uri>
	//   97  309:aload_1         
	//   98  310:invokevirtual   #205 <Method Bundle Message.getData()>
	//   99  313:invokevirtual   #227 <Method void MediaSessionCompat$Callback.onPlayFromUri(Uri, Bundle)>
			return;
	//  100  316:return          

		case 11: // '\013'
			callback.onSkipToQueueItem(((Long)message.obj).longValue());
	//  101  317:aload_2         
	//  102  318:aload_1         
	//  103  319:getfield        #160 <Field Object Message.obj>
	//  104  322:checkcast       #229 <Class Long>
	//  105  325:invokevirtual   #232 <Method long Long.longValue()>
	//  106  328:invokevirtual   #236 <Method void MediaSessionCompat$Callback.onSkipToQueueItem(long)>
			return;
	//  107  331:return          

		case 12: // '\f'
			callback.onPause();
	//  108  332:aload_2         
	//  109  333:invokevirtual   #115 <Method void MediaSessionCompat$Callback.onPause()>
			return;
	//  110  336:return          

		case 13: // '\r'
			callback.onStop();
	//  111  337:aload_2         
	//  112  338:invokevirtual   #128 <Method void MediaSessionCompat$Callback.onStop()>
			return;
	//  113  341:return          

		case 14: // '\016'
			callback.onSkipToNext();
	//  114  342:aload_2         
	//  115  343:invokevirtual   #120 <Method void MediaSessionCompat$Callback.onSkipToNext()>
			return;
	//  116  346:return          

		case 15: // '\017'
			callback.onSkipToPrevious();
	//  117  347:aload_2         
	//  118  348:invokevirtual   #125 <Method void MediaSessionCompat$Callback.onSkipToPrevious()>
			return;
	//  119  351:return          

		case 16: // '\020'
			callback.onFastForward();
	//  120  352:aload_2         
	//  121  353:invokevirtual   #133 <Method void MediaSessionCompat$Callback.onFastForward()>
			return;
	//  122  356:return          

		case 17: // '\021'
			callback.onRewind();
	//  123  357:aload_2         
	//  124  358:invokevirtual   #138 <Method void MediaSessionCompat$Callback.onRewind()>
			return;
	//  125  361:return          

		case 18: // '\022'
			callback.onSeekTo(((Long)message.obj).longValue());
	//  126  362:aload_2         
	//  127  363:aload_1         
	//  128  364:getfield        #160 <Field Object Message.obj>
	//  129  367:checkcast       #229 <Class Long>
	//  130  370:invokevirtual   #232 <Method long Long.longValue()>
	//  131  373:invokevirtual   #239 <Method void MediaSessionCompat$Callback.onSeekTo(long)>
			return;
	//  132  376:return          

		case 19: // '\023'
			callback.onSetRating((RatingCompat)message.obj);
	//  133  377:aload_2         
	//  134  378:aload_1         
	//  135  379:getfield        #160 <Field Object Message.obj>
	//  136  382:checkcast       #241 <Class RatingCompat>
	//  137  385:invokevirtual   #245 <Method void MediaSessionCompat$Callback.onSetRating(RatingCompat)>
			return;
	//  138  388:return          

		case 20: // '\024'
			callback.onCustomAction((String)message.obj, message.getData());
	//  139  389:aload_2         
	//  140  390:aload_1         
	//  141  391:getfield        #160 <Field Object Message.obj>
	//  142  394:checkcast       #201 <Class String>
	//  143  397:aload_1         
	//  144  398:invokevirtual   #205 <Method Bundle Message.getData()>
	//  145  401:invokevirtual   #248 <Method void MediaSessionCompat$Callback.onCustomAction(String, Bundle)>
			return;
	//  146  404:return          

		case 25: // '\031'
			callback.onAddQueueItem((MediaDescriptionCompat)message.obj);
	//  147  405:aload_2         
	//  148  406:aload_1         
	//  149  407:getfield        #160 <Field Object Message.obj>
	//  150  410:checkcast       #250 <Class MediaDescriptionCompat>
	//  151  413:invokevirtual   #254 <Method void MediaSessionCompat$Callback.onAddQueueItem(MediaDescriptionCompat)>
			return;
	//  152  416:return          

		case 26: // '\032'
			callback.onAddQueueItem((MediaDescriptionCompat)message.obj, message.arg1);
	//  153  417:aload_2         
	//  154  418:aload_1         
	//  155  419:getfield        #160 <Field Object Message.obj>
	//  156  422:checkcast       #250 <Class MediaDescriptionCompat>
	//  157  425:aload_1         
	//  158  426:getfield        #257 <Field int Message.arg1>
	//  159  429:invokevirtual   #260 <Method void MediaSessionCompat$Callback.onAddQueueItem(MediaDescriptionCompat, int)>
			return;
	//  160  432:return          

		case 27: // '\033'
			callback.onRemoveQueueItem((MediaDescriptionCompat)message.obj);
	//  161  433:aload_2         
	//  162  434:aload_1         
	//  163  435:getfield        #160 <Field Object Message.obj>
	//  164  438:checkcast       #250 <Class MediaDescriptionCompat>
	//  165  441:invokevirtual   #263 <Method void MediaSessionCompat$Callback.onRemoveQueueItem(MediaDescriptionCompat)>
			return;
	//  166  444:return          

		case 28: // '\034'
			callback.onRemoveQueueItemAt(message.arg1);
	//  167  445:aload_2         
	//  168  446:aload_1         
	//  169  447:getfield        #257 <Field int Message.arg1>
	//  170  450:invokevirtual   #267 <Method void MediaSessionCompat$Callback.onRemoveQueueItemAt(int)>
			return;
	//  171  453:return          

		case 2: // '\002'
			adjustVolume(message.arg1, 0);
	//  172  454:aload_0         
	//  173  455:getfield        #77  <Field MediaSessionCompat$MediaSessionImplBase this$0>
	//  174  458:aload_1         
	//  175  459:getfield        #257 <Field int Message.arg1>
	//  176  462:iconst_0        
	//  177  463:invokevirtual   #271 <Method void MediaSessionCompat$MediaSessionImplBase.adjustVolume(int, int)>
			return;
	//  178  466:return          

		case 22: // '\026'
			setVolumeTo(message.arg1, 0);
	//  179  467:aload_0         
	//  180  468:getfield        #77  <Field MediaSessionCompat$MediaSessionImplBase this$0>
	//  181  471:aload_1         
	//  182  472:getfield        #257 <Field int Message.arg1>
	//  183  475:iconst_0        
	//  184  476:invokevirtual   #274 <Method void MediaSessionCompat$MediaSessionImplBase.setVolumeTo(int, int)>
			return;
	//  185  479:return          

		case 23: // '\027'
			callback.onSetRepeatMode(message.arg1);
	//  186  480:aload_2         
	//  187  481:aload_1         
	//  188  482:getfield        #257 <Field int Message.arg1>
	//  189  485:invokevirtual   #277 <Method void MediaSessionCompat$Callback.onSetRepeatMode(int)>
			return;
	//  190  488:return          

		case 24: // '\030'
			callback.onSetShuffleModeEnabled(((Boolean)message.obj).booleanValue());
	//  191  489:aload_2         
	//  192  490:aload_1         
	//  193  491:getfield        #160 <Field Object Message.obj>
	//  194  494:checkcast       #279 <Class Boolean>
	//  195  497:invokevirtual   #283 <Method boolean Boolean.booleanValue()>
	//  196  500:invokevirtual   #287 <Method void MediaSessionCompat$Callback.onSetShuffleModeEnabled(boolean)>
			break;
		}
	//  197  503:return          
	}

	public void post(int i)
	{
		post(i, ((Object) (null)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aconst_null     
	//    3    3:invokevirtual   #291 <Method void post(int, Object)>
	//    4    6:return          
	}

	public void post(int i, Object obj)
	{
		obtainMessage(i, obj).sendToTarget();
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #295 <Method Message obtainMessage(int, Object)>
	//    4    6:invokevirtual   #298 <Method void Message.sendToTarget()>
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
	//    5    5:invokevirtual   #302 <Method Message obtainMessage(int, int, int, Object)>
	//    6    8:invokevirtual   #298 <Method void Message.sendToTarget()>
	//    7   11:return          
	}

	public void post(int i, Object obj, Bundle bundle)
	{
		obj = ((Object) (obtainMessage(i, obj)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #295 <Method Message obtainMessage(int, Object)>
	//    4    6:astore_2        
		((Message) (obj)).setData(bundle);
	//    5    7:aload_2         
	//    6    8:aload_3         
	//    7    9:invokevirtual   #307 <Method void Message.setData(Bundle)>
		((Message) (obj)).sendToTarget();
	//    8   12:aload_2         
	//    9   13:invokevirtual   #298 <Method void Message.sendToTarget()>
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
	private static final int MSG_REMOVE_QUEUE_ITEM = 27;
	private static final int MSG_REMOVE_QUEUE_ITEM_AT = 28;
	private static final int MSG_REWIND = 17;
	private static final int MSG_SEEK_TO = 18;
	private static final int MSG_SET_REPEAT_MODE = 23;
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
	//    2    2:putfield        #77  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		super(looper);
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:invokespecial   #80  <Method void Handler(Looper)>
	//    6   10:return          
	}
}
