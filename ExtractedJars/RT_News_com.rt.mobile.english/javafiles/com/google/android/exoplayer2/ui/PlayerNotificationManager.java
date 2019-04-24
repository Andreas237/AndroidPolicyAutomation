// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.ui;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.*;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.app.NotificationManagerCompat;
import com.google.android.exoplayer2.*;
import com.google.android.exoplayer2.util.*;
import java.lang.annotation.Annotation;
import java.util.*;

public class PlayerNotificationManager
{
	public final class BitmapCallback
	{

		public void onBitmap(Bitmap bitmap)
		{
			if(bitmap != null)
		//*   0    0:aload_1         
		//*   1    1:ifnull          24
				mainHandler.post(((_cls1) (bitmap)). new Runnable() {

					public void run()
					{
						if(player != null && notificationTag == currentNotificationTag && isNotificationStarted)
					//*   0    0:aload_0         
					//*   1    1:getfield        #22  <Field PlayerNotificationManager$BitmapCallback this$1>
					//*   2    4:getfield        #33  <Field PlayerNotificationManager PlayerNotificationManager$BitmapCallback.this$0>
					//*   3    7:invokestatic    #37  <Method Player PlayerNotificationManager.access$000(PlayerNotificationManager)>
					//*   4   10:ifnull          61
					//*   5   13:aload_0         
					//*   6   14:getfield        #22  <Field PlayerNotificationManager$BitmapCallback this$1>
					//*   7   17:invokestatic    #41  <Method int PlayerNotificationManager$BitmapCallback.access$100(PlayerNotificationManager$BitmapCallback)>
					//*   8   20:aload_0         
					//*   9   21:getfield        #22  <Field PlayerNotificationManager$BitmapCallback this$1>
					//*  10   24:getfield        #33  <Field PlayerNotificationManager PlayerNotificationManager$BitmapCallback.this$0>
					//*  11   27:invokestatic    #45  <Method int PlayerNotificationManager.access$200(PlayerNotificationManager)>
					//*  12   30:icmpne          61
					//*  13   33:aload_0         
					//*  14   34:getfield        #22  <Field PlayerNotificationManager$BitmapCallback this$1>
					//*  15   37:getfield        #33  <Field PlayerNotificationManager PlayerNotificationManager$BitmapCallback.this$0>
					//*  16   40:invokestatic    #49  <Method boolean PlayerNotificationManager.access$300(PlayerNotificationManager)>
					//*  17   43:ifeq            61
							updateNotification(bitmap);
					//   18   46:aload_0         
					//   19   47:getfield        #22  <Field PlayerNotificationManager$BitmapCallback this$1>
					//   20   50:getfield        #33  <Field PlayerNotificationManager PlayerNotificationManager$BitmapCallback.this$0>
					//   21   53:aload_0         
					//   22   54:getfield        #24  <Field Bitmap val$bitmap>
					//   23   57:invokestatic    #53  <Method Notification PlayerNotificationManager.access$400(PlayerNotificationManager, Bitmap)>
					//   24   60:pop             
					//   25   61:return          
					}

					final BitmapCallback this$1;
					final Bitmap val$bitmap;

			
			{
				this$1 = final_bitmapcallback;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #22  <Field PlayerNotificationManager$BitmapCallback this$1>
				bitmap = Bitmap.this;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #24  <Field Bitmap val$bitmap>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #27  <Method void Object()>
			//    8   14:return          
			}
				}
);
		//    2    4:aload_0         
		//    3    5:getfield        #17  <Field PlayerNotificationManager this$0>
		//    4    8:invokestatic    #34  <Method Handler PlayerNotificationManager.access$500(PlayerNotificationManager)>
		//    5   11:new             #9   <Class PlayerNotificationManager$BitmapCallback$1>
		//    6   14:dup             
		//    7   15:aload_0         
		//    8   16:aload_1         
		//    9   17:invokespecial   #37  <Method void PlayerNotificationManager$BitmapCallback$1(PlayerNotificationManager$BitmapCallback, Bitmap)>
		//   10   20:invokevirtual   #43  <Method boolean Handler.post(Runnable)>
		//   11   23:pop             
		//   12   24:return          
		}

		private final int notificationTag;
		final PlayerNotificationManager this$0;


/*
		static int access$100(BitmapCallback bitmapcallback)
		{
			return bitmapcallback.notificationTag;
		//    0    0:aload_0         
		//    1    1:getfield        #22  <Field int notificationTag>
		//    2    4:ireturn         
		}

*/

		private BitmapCallback(int i)
		{
			this$0 = PlayerNotificationManager.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #17  <Field PlayerNotificationManager this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #20  <Method void Object()>
			notificationTag = i;
		//    5    9:aload_0         
		//    6   10:iload_2         
		//    7   11:putfield        #22  <Field int notificationTag>
		//    8   14:return          
		}

	}

	public static interface CustomActionReceiver
	{

		public abstract Map createCustomActions(Context context1);

		public abstract List getCustomActions(Player player1);

		public abstract void onCustomAction(Player player1, String s, Intent intent);
	}

	public static interface MediaDescriptionAdapter
	{

		public abstract PendingIntent createCurrentContentIntent(Player player1);

		public abstract String getCurrentContentText(Player player1);

		public abstract String getCurrentContentTitle(Player player1);

		public abstract Bitmap getCurrentLargeIcon(Player player1, BitmapCallback bitmapcallback);
	}

	private class NotificationBroadcastReceiver extends BroadcastReceiver
	{

		public void onReceive(Context context1, Intent intent)
		{
			context1 = ((Context) (player));
		//    0    0:aload_0         
		//    1    1:getfield        #15  <Field PlayerNotificationManager this$0>
		//    2    4:invokestatic    #30  <Method Player PlayerNotificationManager.access$000(PlayerNotificationManager)>
		//    3    7:astore_1        
			if(context1 != null)
		//*   4    8:aload_1         
		//*   5    9:ifnull          395
			{
				if(!isNotificationStarted)
		//*   6   12:aload_0         
		//*   7   13:getfield        #15  <Field PlayerNotificationManager this$0>
		//*   8   16:invokestatic    #34  <Method boolean PlayerNotificationManager.access$300(PlayerNotificationManager)>
		//*   9   19:ifne            23
					return;
		//   10   22:return          
				String s = intent.getAction();
		//   11   23:aload_2         
		//   12   24:invokevirtual   #40  <Method String Intent.getAction()>
		//   13   27:astore          6
				if(!"com.google.android.exoplayer.play".equals(((Object) (s))) && !"com.google.android.exoplayer.pause".equals(((Object) (s))))
		//*  14   29:ldc1            #42  <String "com.google.android.exoplayer.play">
		//*  15   31:aload           6
		//*  16   33:invokevirtual   #48  <Method boolean String.equals(Object)>
		//*  17   36:ifne            373
		//*  18   39:ldc1            #50  <String "com.google.android.exoplayer.pause">
		//*  19   41:aload           6
		//*  20   43:invokevirtual   #48  <Method boolean String.equals(Object)>
		//*  21   46:ifeq            52
		//*  22   49:goto            373
				{
					if(!"com.google.android.exoplayer.ffwd".equals(((Object) (s))) && !"com.google.android.exoplayer.rewind".equals(((Object) (s))))
		//*  23   52:ldc1            #52  <String "com.google.android.exoplayer.ffwd">
		//*  24   54:aload           6
		//*  25   56:invokevirtual   #48  <Method boolean String.equals(Object)>
		//*  26   59:ifne            311
		//*  27   62:ldc1            #54  <String "com.google.android.exoplayer.rewind">
		//*  28   64:aload           6
		//*  29   66:invokevirtual   #48  <Method boolean String.equals(Object)>
		//*  30   69:ifeq            75
		//*  31   72:goto            311
					{
						if("com.google.android.exoplayer.next".equals(((Object) (s))))
		//*  32   75:ldc1            #56  <String "com.google.android.exoplayer.next">
		//*  33   77:aload           6
		//*  34   79:invokevirtual   #48  <Method boolean String.equals(Object)>
		//*  35   82:ifeq            116
						{
							int i = ((Player) (context1)).getNextWindowIndex();
		//   36   85:aload_1         
		//   37   86:invokeinterface #62  <Method int Player.getNextWindowIndex()>
		//   38   91:istore_3        
							if(i != -1)
		//*  39   92:iload_3         
		//*  40   93:iconst_m1       
		//*  41   94:icmpeq          394
							{
								controlDispatcher.dispatchSeekTo(((Player) (context1)), i, 0x1L);
		//   42   97:aload_0         
		//   43   98:getfield        #15  <Field PlayerNotificationManager this$0>
		//   44  101:invokestatic    #66  <Method ControlDispatcher PlayerNotificationManager.access$1100(PlayerNotificationManager)>
		//   45  104:aload_1         
		//   46  105:iload_3         
		//   47  106:ldc2w           #67  <Long 0x1L>
		//   48  109:invokeinterface #74  <Method boolean ControlDispatcher.dispatchSeekTo(Player, int, long)>
		//   49  114:pop             
								return;
		//   50  115:return          
							}
						} else
						{
							if("com.google.android.exoplayer.prev".equals(((Object) (s))))
		//*  51  116:ldc1            #76  <String "com.google.android.exoplayer.prev">
		//*  52  118:aload           6
		//*  53  120:invokevirtual   #48  <Method boolean String.equals(Object)>
		//*  54  123:ifeq            234
							{
								((Player) (context1)).getCurrentTimeline().getWindow(((Player) (context1)).getCurrentWindowIndex(), window);
		//   55  126:aload_1         
		//   56  127:invokeinterface #80  <Method Timeline Player.getCurrentTimeline()>
		//   57  132:aload_1         
		//   58  133:invokeinterface #83  <Method int Player.getCurrentWindowIndex()>
		//   59  138:aload_0         
		//   60  139:getfield        #23  <Field com.google.android.exoplayer2.Timeline$Window window>
		//   61  142:invokevirtual   #89  <Method com.google.android.exoplayer2.Timeline$Window Timeline.getWindow(int, com.google.android.exoplayer2.Timeline$Window)>
		//   62  145:pop             
								int j = ((Player) (context1)).getPreviousWindowIndex();
		//   63  146:aload_1         
		//   64  147:invokeinterface #92  <Method int Player.getPreviousWindowIndex()>
		//   65  152:istore_3        
								if(j != -1 && (((Player) (context1)).getCurrentPosition() <= 3000L || window.isDynamic && !window.isSeekable))
		//*  66  153:iload_3         
		//*  67  154:iconst_m1       
		//*  68  155:icmpeq          210
		//*  69  158:aload_1         
		//*  70  159:invokeinterface #96  <Method long Player.getCurrentPosition()>
		//*  71  164:ldc2w           #97  <Long 3000L>
		//*  72  167:lcmp            
		//*  73  168:ifle            191
		//*  74  171:aload_0         
		//*  75  172:getfield        #23  <Field com.google.android.exoplayer2.Timeline$Window window>
		//*  76  175:getfield        #102 <Field boolean com.google.android.exoplayer2.Timeline$Window.isDynamic>
		//*  77  178:ifeq            210
		//*  78  181:aload_0         
		//*  79  182:getfield        #23  <Field com.google.android.exoplayer2.Timeline$Window window>
		//*  80  185:getfield        #105 <Field boolean com.google.android.exoplayer2.Timeline$Window.isSeekable>
		//*  81  188:ifne            210
								{
									controlDispatcher.dispatchSeekTo(((Player) (context1)), j, 0x1L);
		//   82  191:aload_0         
		//   83  192:getfield        #15  <Field PlayerNotificationManager this$0>
		//   84  195:invokestatic    #66  <Method ControlDispatcher PlayerNotificationManager.access$1100(PlayerNotificationManager)>
		//   85  198:aload_1         
		//   86  199:iload_3         
		//   87  200:ldc2w           #67  <Long 0x1L>
		//   88  203:invokeinterface #74  <Method boolean ControlDispatcher.dispatchSeekTo(Player, int, long)>
		//   89  208:pop             
									return;
		//   90  209:return          
								} else
								{
									controlDispatcher.dispatchSeekTo(((Player) (context1)), ((Player) (context1)).getCurrentWindowIndex(), 0x1L);
		//   91  210:aload_0         
		//   92  211:getfield        #15  <Field PlayerNotificationManager this$0>
		//   93  214:invokestatic    #66  <Method ControlDispatcher PlayerNotificationManager.access$1100(PlayerNotificationManager)>
		//   94  217:aload_1         
		//   95  218:aload_1         
		//   96  219:invokeinterface #83  <Method int Player.getCurrentWindowIndex()>
		//   97  224:ldc2w           #67  <Long 0x1L>
		//   98  227:invokeinterface #74  <Method boolean ControlDispatcher.dispatchSeekTo(Player, int, long)>
		//   99  232:pop             
									return;
		//  100  233:return          
								}
							}
							if("com.google.android.exoplayer.stop".equals(((Object) (s))))
		//* 101  234:ldc1            #107 <String "com.google.android.exoplayer.stop">
		//* 102  236:aload           6
		//* 103  238:invokevirtual   #48  <Method boolean String.equals(Object)>
		//* 104  241:ifeq            267
							{
								controlDispatcher.dispatchStop(((Player) (context1)), true);
		//  105  244:aload_0         
		//  106  245:getfield        #15  <Field PlayerNotificationManager this$0>
		//  107  248:invokestatic    #66  <Method ControlDispatcher PlayerNotificationManager.access$1100(PlayerNotificationManager)>
		//  108  251:aload_1         
		//  109  252:iconst_1        
		//  110  253:invokeinterface #111 <Method boolean ControlDispatcher.dispatchStop(Player, boolean)>
		//  111  258:pop             
								stopNotification();
		//  112  259:aload_0         
		//  113  260:getfield        #15  <Field PlayerNotificationManager this$0>
		//  114  263:invokestatic    #114 <Method void PlayerNotificationManager.access$1400(PlayerNotificationManager)>
								return;
		//  115  266:return          
							}
							if(customActionReceiver != null && customActions.containsKey(((Object) (s))))
		//* 116  267:aload_0         
		//* 117  268:getfield        #15  <Field PlayerNotificationManager this$0>
		//* 118  271:invokestatic    #118 <Method PlayerNotificationManager$CustomActionReceiver PlayerNotificationManager.access$1500(PlayerNotificationManager)>
		//* 119  274:ifnull          394
		//* 120  277:aload_0         
		//* 121  278:getfield        #15  <Field PlayerNotificationManager this$0>
		//* 122  281:invokestatic    #122 <Method Map PlayerNotificationManager.access$1600(PlayerNotificationManager)>
		//* 123  284:aload           6
		//* 124  286:invokeinterface #127 <Method boolean Map.containsKey(Object)>
		//* 125  291:ifeq            394
							{
								customActionReceiver.onCustomAction(((Player) (context1)), s, intent);
		//  126  294:aload_0         
		//  127  295:getfield        #15  <Field PlayerNotificationManager this$0>
		//  128  298:invokestatic    #118 <Method PlayerNotificationManager$CustomActionReceiver PlayerNotificationManager.access$1500(PlayerNotificationManager)>
		//  129  301:aload_1         
		//  130  302:aload           6
		//  131  304:aload_2         
		//  132  305:invokeinterface #133 <Method void PlayerNotificationManager$CustomActionReceiver.onCustomAction(Player, String, Intent)>
								return;
		//  133  310:return          
							}
						}
					} else
					{
						long l;
						if("com.google.android.exoplayer.ffwd".equals(((Object) (s))))
		//* 134  311:ldc1            #52  <String "com.google.android.exoplayer.ffwd">
		//* 135  313:aload           6
		//* 136  315:invokevirtual   #48  <Method boolean String.equals(Object)>
		//* 137  318:ifeq            333
							l = fastForwardMs;
		//  138  321:aload_0         
		//  139  322:getfield        #15  <Field PlayerNotificationManager this$0>
		//  140  325:invokestatic    #137 <Method long PlayerNotificationManager.access$1200(PlayerNotificationManager)>
		//  141  328:lstore          4
						else
		//* 142  330:goto            343
							l = -rewindMs;
		//  143  333:aload_0         
		//  144  334:getfield        #15  <Field PlayerNotificationManager this$0>
		//  145  337:invokestatic    #140 <Method long PlayerNotificationManager.access$1300(PlayerNotificationManager)>
		//  146  340:lneg            
		//  147  341:lstore          4
						controlDispatcher.dispatchSeekTo(((Player) (context1)), ((Player) (context1)).getCurrentWindowIndex(), ((Player) (context1)).getCurrentPosition() + l);
		//  148  343:aload_0         
		//  149  344:getfield        #15  <Field PlayerNotificationManager this$0>
		//  150  347:invokestatic    #66  <Method ControlDispatcher PlayerNotificationManager.access$1100(PlayerNotificationManager)>
		//  151  350:aload_1         
		//  152  351:aload_1         
		//  153  352:invokeinterface #83  <Method int Player.getCurrentWindowIndex()>
		//  154  357:aload_1         
		//  155  358:invokeinterface #96  <Method long Player.getCurrentPosition()>
		//  156  363:lload           4
		//  157  365:ladd            
		//  158  366:invokeinterface #74  <Method boolean ControlDispatcher.dispatchSeekTo(Player, int, long)>
		//  159  371:pop             
						return;
		//  160  372:return          
					}
				} else
				{
					controlDispatcher.dispatchSetPlayWhenReady(((Player) (context1)), "com.google.android.exoplayer.play".equals(((Object) (s))));
		//  161  373:aload_0         
		//  162  374:getfield        #15  <Field PlayerNotificationManager this$0>
		//  163  377:invokestatic    #66  <Method ControlDispatcher PlayerNotificationManager.access$1100(PlayerNotificationManager)>
		//  164  380:aload_1         
		//  165  381:ldc1            #42  <String "com.google.android.exoplayer.play">
		//  166  383:aload           6
		//  167  385:invokevirtual   #48  <Method boolean String.equals(Object)>
		//  168  388:invokeinterface #143 <Method boolean ControlDispatcher.dispatchSetPlayWhenReady(Player, boolean)>
		//  169  393:pop             
				}
				return;
		//  170  394:return          
			} else
			{
				return;
		//  171  395:return          
			}
		}

		final PlayerNotificationManager this$0;
		private final com.google.android.exoplayer2.Timeline.Window window = new com.google.android.exoplayer2.Timeline.Window();

		public NotificationBroadcastReceiver()
		{
			this$0 = PlayerNotificationManager.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #15  <Field PlayerNotificationManager this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #18  <Method void BroadcastReceiver()>
		//    5    9:aload_0         
		//    6   10:new             #20  <Class com.google.android.exoplayer2.Timeline$Window>
		//    7   13:dup             
		//    8   14:invokespecial   #21  <Method void com.google.android.exoplayer2.Timeline$Window()>
		//    9   17:putfield        #23  <Field com.google.android.exoplayer2.Timeline$Window window>
		//   10   20:return          
		}
	}

	public static interface NotificationListener
	{

		public abstract void onNotificationCancelled(int i);

		public abstract void onNotificationStarted(int i, Notification notification);
	}

	private class PlayerListener extends com.google.android.exoplayer2.Player.DefaultEventListener
	{

		public void onPlaybackParametersChanged(PlaybackParameters playbackparameters)
		{
			if(player != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #13  <Field PlayerNotificationManager this$0>
		//*   2    4:invokestatic    #26  <Method Player PlayerNotificationManager.access$000(PlayerNotificationManager)>
		//*   3    7:ifnull          35
			{
				if(player.getPlaybackState() == 1)
		//*   4   10:aload_0         
		//*   5   11:getfield        #13  <Field PlayerNotificationManager this$0>
		//*   6   14:invokestatic    #26  <Method Player PlayerNotificationManager.access$000(PlayerNotificationManager)>
		//*   7   17:invokeinterface #32  <Method int Player.getPlaybackState()>
		//*   8   22:iconst_1        
		//*   9   23:icmpne          27
				{
					return;
		//   10   26:return          
				} else
				{
					startOrUpdateNotification();
		//   11   27:aload_0         
		//   12   28:getfield        #13  <Field PlayerNotificationManager this$0>
		//   13   31:invokestatic    #35  <Method void PlayerNotificationManager.access$1000(PlayerNotificationManager)>
					return;
		//   14   34:return          
				}
			} else
			{
				return;
		//   15   35:return          
			}
		}

		public void onPlayerStateChanged(boolean flag, int i)
		{
			if(wasPlayWhenReady != flag && i != 1 || lastPlaybackState != i)
		//*   0    0:aload_0         
		//*   1    1:getfield        #13  <Field PlayerNotificationManager this$0>
		//*   2    4:invokestatic    #41  <Method boolean PlayerNotificationManager.access$800(PlayerNotificationManager)>
		//*   3    7:iload_1         
		//*   4    8:icmpeq          16
		//*   5   11:iload_2         
		//*   6   12:iconst_1        
		//*   7   13:icmpne          27
		//*   8   16:aload_0         
		//*   9   17:getfield        #13  <Field PlayerNotificationManager this$0>
		//*  10   20:invokestatic    #45  <Method int PlayerNotificationManager.access$900(PlayerNotificationManager)>
		//*  11   23:iload_2         
		//*  12   24:icmpeq          34
				startOrUpdateNotification();
		//   13   27:aload_0         
		//   14   28:getfield        #13  <Field PlayerNotificationManager this$0>
		//   15   31:invokestatic    #35  <Method void PlayerNotificationManager.access$1000(PlayerNotificationManager)>
			wasPlayWhenReady = flag;
		//   16   34:aload_0         
		//   17   35:getfield        #13  <Field PlayerNotificationManager this$0>
		//   18   38:iload_1         
		//   19   39:invokestatic    #49  <Method boolean PlayerNotificationManager.access$802(PlayerNotificationManager, boolean)>
		//   20   42:pop             
			lastPlaybackState = i;
		//   21   43:aload_0         
		//   22   44:getfield        #13  <Field PlayerNotificationManager this$0>
		//   23   47:iload_2         
		//   24   48:invokestatic    #53  <Method int PlayerNotificationManager.access$902(PlayerNotificationManager, int)>
		//   25   51:pop             
		//   26   52:return          
		}

		public void onPositionDiscontinuity(int i)
		{
			startOrUpdateNotification();
		//    0    0:aload_0         
		//    1    1:getfield        #13  <Field PlayerNotificationManager this$0>
		//    2    4:invokestatic    #35  <Method void PlayerNotificationManager.access$1000(PlayerNotificationManager)>
		//    3    7:return          
		}

		public void onRepeatModeChanged(int i)
		{
			if(player != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #13  <Field PlayerNotificationManager this$0>
		//*   2    4:invokestatic    #26  <Method Player PlayerNotificationManager.access$000(PlayerNotificationManager)>
		//*   3    7:ifnull          35
			{
				if(player.getPlaybackState() == 1)
		//*   4   10:aload_0         
		//*   5   11:getfield        #13  <Field PlayerNotificationManager this$0>
		//*   6   14:invokestatic    #26  <Method Player PlayerNotificationManager.access$000(PlayerNotificationManager)>
		//*   7   17:invokeinterface #32  <Method int Player.getPlaybackState()>
		//*   8   22:iconst_1        
		//*   9   23:icmpne          27
				{
					return;
		//   10   26:return          
				} else
				{
					startOrUpdateNotification();
		//   11   27:aload_0         
		//   12   28:getfield        #13  <Field PlayerNotificationManager this$0>
		//   13   31:invokestatic    #35  <Method void PlayerNotificationManager.access$1000(PlayerNotificationManager)>
					return;
		//   14   34:return          
				}
			} else
			{
				return;
		//   15   35:return          
			}
		}

		public void onTimelineChanged(Timeline timeline, Object obj, int i)
		{
			if(player != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #13  <Field PlayerNotificationManager this$0>
		//*   2    4:invokestatic    #26  <Method Player PlayerNotificationManager.access$000(PlayerNotificationManager)>
		//*   3    7:ifnull          35
			{
				if(player.getPlaybackState() == 1)
		//*   4   10:aload_0         
		//*   5   11:getfield        #13  <Field PlayerNotificationManager this$0>
		//*   6   14:invokestatic    #26  <Method Player PlayerNotificationManager.access$000(PlayerNotificationManager)>
		//*   7   17:invokeinterface #32  <Method int Player.getPlaybackState()>
		//*   8   22:iconst_1        
		//*   9   23:icmpne          27
				{
					return;
		//   10   26:return          
				} else
				{
					startOrUpdateNotification();
		//   11   27:aload_0         
		//   12   28:getfield        #13  <Field PlayerNotificationManager this$0>
		//   13   31:invokestatic    #35  <Method void PlayerNotificationManager.access$1000(PlayerNotificationManager)>
					return;
		//   14   34:return          
				}
			} else
			{
				return;
		//   15   35:return          
			}
		}

		final PlayerNotificationManager this$0;

		private PlayerListener()
		{
			this$0 = PlayerNotificationManager.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #13  <Field PlayerNotificationManager this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #16  <Method void com.google.android.exoplayer2.Player$DefaultEventListener()>
		//    5    9:return          
		}

	}

	public static interface Priority
		extends Annotation
	{
	}

	public static interface Visibility
		extends Annotation
	{
	}


	public PlayerNotificationManager(Context context1, String s, int i, MediaDescriptionAdapter mediadescriptionadapter)
	{
		this(context1, s, i, mediadescriptionadapter, ((CustomActionReceiver) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:aload           4
	//    5    6:aconst_null     
	//    6    7:invokespecial   #121 <Method void PlayerNotificationManager(Context, String, int, PlayerNotificationManager$MediaDescriptionAdapter, PlayerNotificationManager$CustomActionReceiver)>
	//    7   10:return          
	}

	public PlayerNotificationManager(Context context1, String s, int i, MediaDescriptionAdapter mediadescriptionadapter, CustomActionReceiver customactionreceiver)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #125 <Method void Object()>
		context = context1.getApplicationContext();
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #131 <Method Context Context.getApplicationContext()>
	//    5    9:putfield        #133 <Field Context context>
		channelId = s;
	//    6   12:aload_0         
	//    7   13:aload_2         
	//    8   14:putfield        #135 <Field String channelId>
		notificationId = i;
	//    9   17:aload_0         
	//   10   18:iload_3         
	//   11   19:putfield        #137 <Field int notificationId>
		mediaDescriptionAdapter = mediadescriptionadapter;
	//   12   22:aload_0         
	//   13   23:aload           4
	//   14   25:putfield        #139 <Field PlayerNotificationManager$MediaDescriptionAdapter mediaDescriptionAdapter>
		customActionReceiver = customactionreceiver;
	//   15   28:aload_0         
	//   16   29:aload           5
	//   17   31:putfield        #141 <Field PlayerNotificationManager$CustomActionReceiver customActionReceiver>
		controlDispatcher = ((ControlDispatcher) (new DefaultControlDispatcher()));
	//   18   34:aload_0         
	//   19   35:new             #143 <Class DefaultControlDispatcher>
	//   20   38:dup             
	//   21   39:invokespecial   #144 <Method void DefaultControlDispatcher()>
	//   22   42:putfield        #146 <Field ControlDispatcher controlDispatcher>
		mainHandler = new Handler(Looper.getMainLooper());
	//   23   45:aload_0         
	//   24   46:new             #148 <Class Handler>
	//   25   49:dup             
	//   26   50:invokestatic    #154 <Method Looper Looper.getMainLooper()>
	//   27   53:invokespecial   #157 <Method void Handler(Looper)>
	//   28   56:putfield        #159 <Field Handler mainHandler>
		notificationManager = NotificationManagerCompat.from(context1);
	//   29   59:aload_0         
	//   30   60:aload_1         
	//   31   61:invokestatic    #165 <Method NotificationManagerCompat NotificationManagerCompat.from(Context)>
	//   32   64:putfield        #167 <Field NotificationManagerCompat notificationManager>
		playerListener = ((com.google.android.exoplayer2.Player.EventListener) (new PlayerListener()));
	//   33   67:aload_0         
	//   34   68:new             #25  <Class PlayerNotificationManager$PlayerListener>
	//   35   71:dup             
	//   36   72:aload_0         
	//   37   73:aconst_null     
	//   38   74:invokespecial   #170 <Method void PlayerNotificationManager$PlayerListener(PlayerNotificationManager, PlayerNotificationManager$1)>
	//   39   77:putfield        #172 <Field com.google.android.exoplayer2.Player$EventListener playerListener>
		notificationBroadcastReceiver = new NotificationBroadcastReceiver();
	//   40   80:aload_0         
	//   41   81:new             #19  <Class PlayerNotificationManager$NotificationBroadcastReceiver>
	//   42   84:dup             
	//   43   85:aload_0         
	//   44   86:invokespecial   #175 <Method void PlayerNotificationManager$NotificationBroadcastReceiver(PlayerNotificationManager)>
	//   45   89:putfield        #177 <Field PlayerNotificationManager$NotificationBroadcastReceiver notificationBroadcastReceiver>
		intentFilter = new IntentFilter();
	//   46   92:aload_0         
	//   47   93:new             #179 <Class IntentFilter>
	//   48   96:dup             
	//   49   97:invokespecial   #180 <Method void IntentFilter()>
	//   50  100:putfield        #182 <Field IntentFilter intentFilter>
		useNavigationActions = true;
	//   51  103:aload_0         
	//   52  104:iconst_1        
	//   53  105:putfield        #184 <Field boolean useNavigationActions>
		usePlayPauseActions = true;
	//   54  108:aload_0         
	//   55  109:iconst_1        
	//   56  110:putfield        #186 <Field boolean usePlayPauseActions>
		ongoing = true;
	//   57  113:aload_0         
	//   58  114:iconst_1        
	//   59  115:putfield        #188 <Field boolean ongoing>
		colorized = true;
	//   60  118:aload_0         
	//   61  119:iconst_1        
	//   62  120:putfield        #190 <Field boolean colorized>
		useChronometer = true;
	//   63  123:aload_0         
	//   64  124:iconst_1        
	//   65  125:putfield        #192 <Field boolean useChronometer>
		color = 0;
	//   66  128:aload_0         
	//   67  129:iconst_0        
	//   68  130:putfield        #194 <Field int color>
		smallIconResourceId = R.drawable.exo_notification_small_icon;
	//   69  133:aload_0         
	//   70  134:getstatic       #199 <Field int R$drawable.exo_notification_small_icon>
	//   71  137:putfield        #201 <Field int smallIconResourceId>
		defaults = 0;
	//   72  140:aload_0         
	//   73  141:iconst_0        
	//   74  142:putfield        #203 <Field int defaults>
		priority = -1;
	//   75  145:aload_0         
	//   76  146:iconst_m1       
	//   77  147:putfield        #205 <Field int priority>
		fastForwardMs = 15000L;
	//   78  150:aload_0         
	//   79  151:ldc2w           #206 <Long 15000L>
	//   80  154:putfield        #209 <Field long fastForwardMs>
		rewindMs = 5000L;
	//   81  157:aload_0         
	//   82  158:ldc2w           #210 <Long 5000L>
	//   83  161:putfield        #213 <Field long rewindMs>
		stopAction = "com.google.android.exoplayer.stop";
	//   84  164:aload_0         
	//   85  165:ldc1            #54  <String "com.google.android.exoplayer.stop">
	//   86  167:putfield        #215 <Field String stopAction>
		badgeIconType = 1;
	//   87  170:aload_0         
	//   88  171:iconst_1        
	//   89  172:putfield        #217 <Field int badgeIconType>
		visibility = 1;
	//   90  175:aload_0         
	//   91  176:iconst_1        
	//   92  177:putfield        #219 <Field int visibility>
		playbackActions = createPlaybackActions(context1);
	//   93  180:aload_0         
	//   94  181:aload_1         
	//   95  182:invokestatic    #223 <Method Map createPlaybackActions(Context)>
	//   96  185:putfield        #225 <Field Map playbackActions>
		for(s = ((String) (playbackActions.keySet().iterator())); ((Iterator) (s)).hasNext(); intentFilter.addAction(((String) (mediadescriptionadapter))))
	//*  97  188:aload_0         
	//*  98  189:getfield        #225 <Field Map playbackActions>
	//*  99  192:invokeinterface #231 <Method Set Map.keySet()>
	//* 100  197:invokeinterface #237 <Method Iterator Set.iterator()>
	//* 101  202:astore_2        
	//* 102  203:aload_2         
	//* 103  204:invokeinterface #243 <Method boolean Iterator.hasNext()>
	//* 104  209:ifeq            235
			mediadescriptionadapter = ((MediaDescriptionAdapter) ((String)((Iterator) (s)).next()));
	//  105  212:aload_2         
	//  106  213:invokeinterface #247 <Method Object Iterator.next()>
	//  107  218:checkcast       #249 <Class String>
	//  108  221:astore          4

	//  109  223:aload_0         
	//  110  224:getfield        #182 <Field IntentFilter intentFilter>
	//  111  227:aload           4
	//  112  229:invokevirtual   #253 <Method void IntentFilter.addAction(String)>
	//* 113  232:goto            203
		if(customactionreceiver != null)
	//* 114  235:aload           5
	//* 115  237:ifnull          252
			context1 = ((Context) (customactionreceiver.createCustomActions(context1)));
	//  116  240:aload           5
	//  117  242:aload_1         
	//  118  243:invokeinterface #256 <Method Map PlayerNotificationManager$CustomActionReceiver.createCustomActions(Context)>
	//  119  248:astore_1        
		else
	//* 120  249:goto            256
			context1 = ((Context) (Collections.emptyMap()));
	//  121  252:invokestatic    #262 <Method Map Collections.emptyMap()>
	//  122  255:astore_1        
		customActions = ((Map) (context1));
	//  123  256:aload_0         
	//  124  257:aload_1         
	//  125  258:putfield        #264 <Field Map customActions>
		for(context1 = ((Context) (customActions.keySet().iterator())); ((Iterator) (context1)).hasNext(); intentFilter.addAction(s))
	//* 126  261:aload_0         
	//* 127  262:getfield        #264 <Field Map customActions>
	//* 128  265:invokeinterface #231 <Method Set Map.keySet()>
	//* 129  270:invokeinterface #237 <Method Iterator Set.iterator()>
	//* 130  275:astore_1        
	//* 131  276:aload_1         
	//* 132  277:invokeinterface #243 <Method boolean Iterator.hasNext()>
	//* 133  282:ifeq            306
			s = (String)((Iterator) (context1)).next();
	//  134  285:aload_1         
	//  135  286:invokeinterface #247 <Method Object Iterator.next()>
	//  136  291:checkcast       #249 <Class String>
	//  137  294:astore_2        

	//  138  295:aload_0         
	//  139  296:getfield        #182 <Field IntentFilter intentFilter>
	//  140  299:aload_2         
	//  141  300:invokevirtual   #253 <Method void IntentFilter.addAction(String)>
	//* 142  303:goto            276
		stopPendingIntent = ((android.support.v4.app.NotificationCompat.Action)Assertions.checkNotNull(playbackActions.get("com.google.android.exoplayer.stop"))).actionIntent;
	//  143  306:aload_0         
	//  144  307:aload_0         
	//  145  308:getfield        #225 <Field Map playbackActions>
	//  146  311:ldc1            #54  <String "com.google.android.exoplayer.stop">
	//  147  313:invokeinterface #268 <Method Object Map.get(Object)>
	//  148  318:invokestatic    #273 <Method Object Assertions.checkNotNull(Object)>
	//  149  321:checkcast       #275 <Class android.support.v4.app.NotificationCompat$Action>
	//  150  324:getfield        #278 <Field PendingIntent android.support.v4.app.NotificationCompat$Action.actionIntent>
	//  151  327:putfield        #280 <Field PendingIntent stopPendingIntent>
	//  152  330:return          
	}

	private static Map createPlaybackActions(Context context1)
	{
		HashMap hashmap = new HashMap();
	//    0    0:new             #330 <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #331 <Method void HashMap()>
	//    3    7:astore_1        
		Intent intent = (new Intent("com.google.android.exoplayer.play")).setPackage(context1.getPackageName());
	//    4    8:new             #333 <Class Intent>
	//    5   11:dup             
	//    6   12:ldc1            #45  <String "com.google.android.exoplayer.play">
	//    7   14:invokespecial   #335 <Method void Intent(String)>
	//    8   17:aload_0         
	//    9   18:invokevirtual   #339 <Method String Context.getPackageName()>
	//   10   21:invokevirtual   #343 <Method Intent Intent.setPackage(String)>
	//   11   24:astore_2        
		((Map) (hashmap)).put("com.google.android.exoplayer.play", ((Object) (new android.support.v4.app.NotificationCompat.Action(R.drawable.exo_notification_play, ((CharSequence) (context1.getString(R.string.exo_controls_play_description))), PendingIntent.getBroadcast(context1, 0, intent, 0x10000000)))));
	//   12   25:aload_1         
	//   13   26:ldc1            #45  <String "com.google.android.exoplayer.play">
	//   14   28:new             #275 <Class android.support.v4.app.NotificationCompat$Action>
	//   15   31:dup             
	//   16   32:getstatic       #346 <Field int R$drawable.exo_notification_play>
	//   17   35:aload_0         
	//   18   36:getstatic       #351 <Field int R$string.exo_controls_play_description>
	//   19   39:invokevirtual   #355 <Method String Context.getString(int)>
	//   20   42:aload_0         
	//   21   43:iconst_0        
	//   22   44:aload_2         
	//   23   45:ldc2            #356 <Int 0x10000000>
	//   24   48:invokestatic    #362 <Method PendingIntent PendingIntent.getBroadcast(Context, int, Intent, int)>
	//   25   51:invokespecial   #365 <Method void android.support.v4.app.NotificationCompat$Action(int, CharSequence, PendingIntent)>
	//   26   54:invokeinterface #369 <Method Object Map.put(Object, Object)>
	//   27   59:pop             
		intent = (new Intent("com.google.android.exoplayer.pause")).setPackage(context1.getPackageName());
	//   28   60:new             #333 <Class Intent>
	//   29   63:dup             
	//   30   64:ldc1            #42  <String "com.google.android.exoplayer.pause">
	//   31   66:invokespecial   #335 <Method void Intent(String)>
	//   32   69:aload_0         
	//   33   70:invokevirtual   #339 <Method String Context.getPackageName()>
	//   34   73:invokevirtual   #343 <Method Intent Intent.setPackage(String)>
	//   35   76:astore_2        
		((Map) (hashmap)).put("com.google.android.exoplayer.pause", ((Object) (new android.support.v4.app.NotificationCompat.Action(R.drawable.exo_notification_pause, ((CharSequence) (context1.getString(R.string.exo_controls_pause_description))), PendingIntent.getBroadcast(context1, 0, intent, 0x10000000)))));
	//   36   77:aload_1         
	//   37   78:ldc1            #42  <String "com.google.android.exoplayer.pause">
	//   38   80:new             #275 <Class android.support.v4.app.NotificationCompat$Action>
	//   39   83:dup             
	//   40   84:getstatic       #372 <Field int R$drawable.exo_notification_pause>
	//   41   87:aload_0         
	//   42   88:getstatic       #375 <Field int R$string.exo_controls_pause_description>
	//   43   91:invokevirtual   #355 <Method String Context.getString(int)>
	//   44   94:aload_0         
	//   45   95:iconst_0        
	//   46   96:aload_2         
	//   47   97:ldc2            #356 <Int 0x10000000>
	//   48  100:invokestatic    #362 <Method PendingIntent PendingIntent.getBroadcast(Context, int, Intent, int)>
	//   49  103:invokespecial   #365 <Method void android.support.v4.app.NotificationCompat$Action(int, CharSequence, PendingIntent)>
	//   50  106:invokeinterface #369 <Method Object Map.put(Object, Object)>
	//   51  111:pop             
		intent = (new Intent("com.google.android.exoplayer.stop")).setPackage(context1.getPackageName());
	//   52  112:new             #333 <Class Intent>
	//   53  115:dup             
	//   54  116:ldc1            #54  <String "com.google.android.exoplayer.stop">
	//   55  118:invokespecial   #335 <Method void Intent(String)>
	//   56  121:aload_0         
	//   57  122:invokevirtual   #339 <Method String Context.getPackageName()>
	//   58  125:invokevirtual   #343 <Method Intent Intent.setPackage(String)>
	//   59  128:astore_2        
		((Map) (hashmap)).put("com.google.android.exoplayer.stop", ((Object) (new android.support.v4.app.NotificationCompat.Action(R.drawable.exo_notification_stop, ((CharSequence) (context1.getString(R.string.exo_controls_stop_description))), PendingIntent.getBroadcast(context1, 0, intent, 0x10000000)))));
	//   60  129:aload_1         
	//   61  130:ldc1            #54  <String "com.google.android.exoplayer.stop">
	//   62  132:new             #275 <Class android.support.v4.app.NotificationCompat$Action>
	//   63  135:dup             
	//   64  136:getstatic       #378 <Field int R$drawable.exo_notification_stop>
	//   65  139:aload_0         
	//   66  140:getstatic       #381 <Field int R$string.exo_controls_stop_description>
	//   67  143:invokevirtual   #355 <Method String Context.getString(int)>
	//   68  146:aload_0         
	//   69  147:iconst_0        
	//   70  148:aload_2         
	//   71  149:ldc2            #356 <Int 0x10000000>
	//   72  152:invokestatic    #362 <Method PendingIntent PendingIntent.getBroadcast(Context, int, Intent, int)>
	//   73  155:invokespecial   #365 <Method void android.support.v4.app.NotificationCompat$Action(int, CharSequence, PendingIntent)>
	//   74  158:invokeinterface #369 <Method Object Map.put(Object, Object)>
	//   75  163:pop             
		intent = (new Intent("com.google.android.exoplayer.rewind")).setPackage(context1.getPackageName());
	//   76  164:new             #333 <Class Intent>
	//   77  167:dup             
	//   78  168:ldc1            #51  <String "com.google.android.exoplayer.rewind">
	//   79  170:invokespecial   #335 <Method void Intent(String)>
	//   80  173:aload_0         
	//   81  174:invokevirtual   #339 <Method String Context.getPackageName()>
	//   82  177:invokevirtual   #343 <Method Intent Intent.setPackage(String)>
	//   83  180:astore_2        
		((Map) (hashmap)).put("com.google.android.exoplayer.rewind", ((Object) (new android.support.v4.app.NotificationCompat.Action(R.drawable.exo_notification_rewind, ((CharSequence) (context1.getString(R.string.exo_controls_rewind_description))), PendingIntent.getBroadcast(context1, 0, intent, 0x10000000)))));
	//   84  181:aload_1         
	//   85  182:ldc1            #51  <String "com.google.android.exoplayer.rewind">
	//   86  184:new             #275 <Class android.support.v4.app.NotificationCompat$Action>
	//   87  187:dup             
	//   88  188:getstatic       #384 <Field int R$drawable.exo_notification_rewind>
	//   89  191:aload_0         
	//   90  192:getstatic       #387 <Field int R$string.exo_controls_rewind_description>
	//   91  195:invokevirtual   #355 <Method String Context.getString(int)>
	//   92  198:aload_0         
	//   93  199:iconst_0        
	//   94  200:aload_2         
	//   95  201:ldc2            #356 <Int 0x10000000>
	//   96  204:invokestatic    #362 <Method PendingIntent PendingIntent.getBroadcast(Context, int, Intent, int)>
	//   97  207:invokespecial   #365 <Method void android.support.v4.app.NotificationCompat$Action(int, CharSequence, PendingIntent)>
	//   98  210:invokeinterface #369 <Method Object Map.put(Object, Object)>
	//   99  215:pop             
		intent = (new Intent("com.google.android.exoplayer.ffwd")).setPackage(context1.getPackageName());
	//  100  216:new             #333 <Class Intent>
	//  101  219:dup             
	//  102  220:ldc1            #36  <String "com.google.android.exoplayer.ffwd">
	//  103  222:invokespecial   #335 <Method void Intent(String)>
	//  104  225:aload_0         
	//  105  226:invokevirtual   #339 <Method String Context.getPackageName()>
	//  106  229:invokevirtual   #343 <Method Intent Intent.setPackage(String)>
	//  107  232:astore_2        
		((Map) (hashmap)).put("com.google.android.exoplayer.ffwd", ((Object) (new android.support.v4.app.NotificationCompat.Action(R.drawable.exo_notification_fastforward, ((CharSequence) (context1.getString(R.string.exo_controls_fastforward_description))), PendingIntent.getBroadcast(context1, 0, intent, 0x10000000)))));
	//  108  233:aload_1         
	//  109  234:ldc1            #36  <String "com.google.android.exoplayer.ffwd">
	//  110  236:new             #275 <Class android.support.v4.app.NotificationCompat$Action>
	//  111  239:dup             
	//  112  240:getstatic       #390 <Field int R$drawable.exo_notification_fastforward>
	//  113  243:aload_0         
	//  114  244:getstatic       #393 <Field int R$string.exo_controls_fastforward_description>
	//  115  247:invokevirtual   #355 <Method String Context.getString(int)>
	//  116  250:aload_0         
	//  117  251:iconst_0        
	//  118  252:aload_2         
	//  119  253:ldc2            #356 <Int 0x10000000>
	//  120  256:invokestatic    #362 <Method PendingIntent PendingIntent.getBroadcast(Context, int, Intent, int)>
	//  121  259:invokespecial   #365 <Method void android.support.v4.app.NotificationCompat$Action(int, CharSequence, PendingIntent)>
	//  122  262:invokeinterface #369 <Method Object Map.put(Object, Object)>
	//  123  267:pop             
		intent = (new Intent("com.google.android.exoplayer.prev")).setPackage(context1.getPackageName());
	//  124  268:new             #333 <Class Intent>
	//  125  271:dup             
	//  126  272:ldc1            #48  <String "com.google.android.exoplayer.prev">
	//  127  274:invokespecial   #335 <Method void Intent(String)>
	//  128  277:aload_0         
	//  129  278:invokevirtual   #339 <Method String Context.getPackageName()>
	//  130  281:invokevirtual   #343 <Method Intent Intent.setPackage(String)>
	//  131  284:astore_2        
		((Map) (hashmap)).put("com.google.android.exoplayer.prev", ((Object) (new android.support.v4.app.NotificationCompat.Action(R.drawable.exo_notification_previous, ((CharSequence) (context1.getString(R.string.exo_controls_previous_description))), PendingIntent.getBroadcast(context1, 0, intent, 0x10000000)))));
	//  132  285:aload_1         
	//  133  286:ldc1            #48  <String "com.google.android.exoplayer.prev">
	//  134  288:new             #275 <Class android.support.v4.app.NotificationCompat$Action>
	//  135  291:dup             
	//  136  292:getstatic       #396 <Field int R$drawable.exo_notification_previous>
	//  137  295:aload_0         
	//  138  296:getstatic       #399 <Field int R$string.exo_controls_previous_description>
	//  139  299:invokevirtual   #355 <Method String Context.getString(int)>
	//  140  302:aload_0         
	//  141  303:iconst_0        
	//  142  304:aload_2         
	//  143  305:ldc2            #356 <Int 0x10000000>
	//  144  308:invokestatic    #362 <Method PendingIntent PendingIntent.getBroadcast(Context, int, Intent, int)>
	//  145  311:invokespecial   #365 <Method void android.support.v4.app.NotificationCompat$Action(int, CharSequence, PendingIntent)>
	//  146  314:invokeinterface #369 <Method Object Map.put(Object, Object)>
	//  147  319:pop             
		intent = (new Intent("com.google.android.exoplayer.next")).setPackage(context1.getPackageName());
	//  148  320:new             #333 <Class Intent>
	//  149  323:dup             
	//  150  324:ldc1            #39  <String "com.google.android.exoplayer.next">
	//  151  326:invokespecial   #335 <Method void Intent(String)>
	//  152  329:aload_0         
	//  153  330:invokevirtual   #339 <Method String Context.getPackageName()>
	//  154  333:invokevirtual   #343 <Method Intent Intent.setPackage(String)>
	//  155  336:astore_2        
		((Map) (hashmap)).put("com.google.android.exoplayer.next", ((Object) (new android.support.v4.app.NotificationCompat.Action(R.drawable.exo_notification_next, ((CharSequence) (context1.getString(R.string.exo_controls_next_description))), PendingIntent.getBroadcast(context1, 0, intent, 0x10000000)))));
	//  156  337:aload_1         
	//  157  338:ldc1            #39  <String "com.google.android.exoplayer.next">
	//  158  340:new             #275 <Class android.support.v4.app.NotificationCompat$Action>
	//  159  343:dup             
	//  160  344:getstatic       #402 <Field int R$drawable.exo_notification_next>
	//  161  347:aload_0         
	//  162  348:getstatic       #405 <Field int R$string.exo_controls_next_description>
	//  163  351:invokevirtual   #355 <Method String Context.getString(int)>
	//  164  354:aload_0         
	//  165  355:iconst_0        
	//  166  356:aload_2         
	//  167  357:ldc2            #356 <Int 0x10000000>
	//  168  360:invokestatic    #362 <Method PendingIntent PendingIntent.getBroadcast(Context, int, Intent, int)>
	//  169  363:invokespecial   #365 <Method void android.support.v4.app.NotificationCompat$Action(int, CharSequence, PendingIntent)>
	//  170  366:invokeinterface #369 <Method Object Map.put(Object, Object)>
	//  171  371:pop             
		return ((Map) (hashmap));
	//  172  372:aload_1         
	//  173  373:areturn         
	}

	public static PlayerNotificationManager createWithNotificationChannel(Context context1, String s, int i, int j, MediaDescriptionAdapter mediadescriptionadapter)
	{
		NotificationUtil.createNotificationChannel(context1, s, i, 2);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:iconst_2        
	//    4    4:invokestatic    #416 <Method void NotificationUtil.createNotificationChannel(Context, String, int, int)>
		return new PlayerNotificationManager(context1, s, j, mediadescriptionadapter);
	//    5    7:new             #2   <Class PlayerNotificationManager>
	//    6   10:dup             
	//    7   11:aload_0         
	//    8   12:aload_1         
	//    9   13:iload_3         
	//   10   14:aload           4
	//   11   16:invokespecial   #418 <Method void PlayerNotificationManager(Context, String, int, PlayerNotificationManager$MediaDescriptionAdapter)>
	//   12   19:areturn         
	}

	private void maybeUpdateNotification()
	{
		if(isNotificationStarted && player != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #310 <Field boolean isNotificationStarted>
	//*   2    4:ifeq            20
	//*   3    7:aload_0         
	//*   4    8:getfield        #285 <Field Player player>
	//*   5   11:ifnull          20
			updateNotification(((Bitmap) (null)));
	//    6   14:aload_0         
	//    7   15:aconst_null     
	//    8   16:invokespecial   #316 <Method Notification updateNotification(Bitmap)>
	//    9   19:pop             
	//   10   20:return          
	}

	private void startOrUpdateNotification()
	{
		if(player != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #285 <Field Player player>
	//*   2    4:ifnull          62
		{
			Notification notification = updateNotification(((Bitmap) (null)));
	//    3    7:aload_0         
	//    4    8:aconst_null     
	//    5    9:invokespecial   #316 <Method Notification updateNotification(Bitmap)>
	//    6   12:astore_1        
			if(!isNotificationStarted)
	//*   7   13:aload_0         
	//*   8   14:getfield        #310 <Field boolean isNotificationStarted>
	//*   9   17:ifne            62
			{
				isNotificationStarted = true;
	//   10   20:aload_0         
	//   11   21:iconst_1        
	//   12   22:putfield        #310 <Field boolean isNotificationStarted>
				context.registerReceiver(((BroadcastReceiver) (notificationBroadcastReceiver)), intentFilter);
	//   13   25:aload_0         
	//   14   26:getfield        #133 <Field Context context>
	//   15   29:aload_0         
	//   16   30:getfield        #177 <Field PlayerNotificationManager$NotificationBroadcastReceiver notificationBroadcastReceiver>
	//   17   33:aload_0         
	//   18   34:getfield        #182 <Field IntentFilter intentFilter>
	//   19   37:invokevirtual   #423 <Method Intent Context.registerReceiver(BroadcastReceiver, IntentFilter)>
	//   20   40:pop             
				if(notificationListener != null)
	//*  21   41:aload_0         
	//*  22   42:getfield        #425 <Field PlayerNotificationManager$NotificationListener notificationListener>
	//*  23   45:ifnull          62
					notificationListener.onNotificationStarted(notificationId, notification);
	//   24   48:aload_0         
	//   25   49:getfield        #425 <Field PlayerNotificationManager$NotificationListener notificationListener>
	//   26   52:aload_0         
	//   27   53:getfield        #137 <Field int notificationId>
	//   28   56:aload_1         
	//   29   57:invokeinterface #429 <Method void PlayerNotificationManager$NotificationListener.onNotificationStarted(int, Notification)>
			}
		}
	//   30   62:return          
	}

	private void stopNotification()
	{
		if(isNotificationStarted)
	//*   0    0:aload_0         
	//*   1    1:getfield        #310 <Field boolean isNotificationStarted>
	//*   2    4:ifeq            54
		{
			notificationManager.cancel(notificationId);
	//    3    7:aload_0         
	//    4    8:getfield        #167 <Field NotificationManagerCompat notificationManager>
	//    5   11:aload_0         
	//    6   12:getfield        #137 <Field int notificationId>
	//    7   15:invokevirtual   #433 <Method void NotificationManagerCompat.cancel(int)>
			isNotificationStarted = false;
	//    8   18:aload_0         
	//    9   19:iconst_0        
	//   10   20:putfield        #310 <Field boolean isNotificationStarted>
			context.unregisterReceiver(((BroadcastReceiver) (notificationBroadcastReceiver)));
	//   11   23:aload_0         
	//   12   24:getfield        #133 <Field Context context>
	//   13   27:aload_0         
	//   14   28:getfield        #177 <Field PlayerNotificationManager$NotificationBroadcastReceiver notificationBroadcastReceiver>
	//   15   31:invokevirtual   #437 <Method void Context.unregisterReceiver(BroadcastReceiver)>
			if(notificationListener != null)
	//*  16   34:aload_0         
	//*  17   35:getfield        #425 <Field PlayerNotificationManager$NotificationListener notificationListener>
	//*  18   38:ifnull          54
				notificationListener.onNotificationCancelled(notificationId);
	//   19   41:aload_0         
	//   20   42:getfield        #425 <Field PlayerNotificationManager$NotificationListener notificationListener>
	//   21   45:aload_0         
	//   22   46:getfield        #137 <Field int notificationId>
	//   23   49:invokeinterface #440 <Method void PlayerNotificationManager$NotificationListener.onNotificationCancelled(int)>
		}
	//   24   54:return          
	}

	private Notification updateNotification(Bitmap bitmap)
	{
		bitmap = ((Bitmap) (createNotification(player, bitmap)));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #285 <Field Player player>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #446 <Method Notification createNotification(Player, Bitmap)>
	//    5    9:astore_1        
		notificationManager.notify(notificationId, ((Notification) (bitmap)));
	//    6   10:aload_0         
	//    7   11:getfield        #167 <Field NotificationManagerCompat notificationManager>
	//    8   14:aload_0         
	//    9   15:getfield        #137 <Field int notificationId>
	//   10   18:aload_1         
	//   11   19:invokevirtual   #449 <Method void NotificationManagerCompat.notify(int, Notification)>
		return ((Notification) (bitmap));
	//   12   22:aload_1         
	//   13   23:areturn         
	}

	protected Notification createNotification(Player player1, Bitmap bitmap)
	{
		boolean flag = player1.isPlayingAd();
	//    0    0:aload_1         
	//    1    1:invokeinterface #455 <Method boolean Player.isPlayingAd()>
	//    2    6:istore          4
		android.support.v4.app.NotificationCompat.Builder builder = new android.support.v4.app.NotificationCompat.Builder(context, channelId);
	//    3    8:new             #457 <Class android.support.v4.app.NotificationCompat$Builder>
	//    4   11:dup             
	//    5   12:aload_0         
	//    6   13:getfield        #133 <Field Context context>
	//    7   16:aload_0         
	//    8   17:getfield        #135 <Field String channelId>
	//    9   20:invokespecial   #460 <Method void android.support.v4.app.NotificationCompat$Builder(Context, String)>
	//   10   23:astore          6
		List list = getActions(player1);
	//   11   25:aload_0         
	//   12   26:aload_1         
	//   13   27:invokevirtual   #464 <Method List getActions(Player)>
	//   14   30:astore          7
		for(int i = 0; i < list.size(); i++)
	//*  15   32:iconst_0        
	//*  16   33:istore_3        
	//*  17   34:iload_3         
	//*  18   35:aload           7
	//*  19   37:invokeinterface #470 <Method int List.size()>
	//*  20   42:icmpge          127
		{
			Object obj = ((Object) ((String)list.get(i)));
	//   21   45:aload           7
	//   22   47:iload_3         
	//   23   48:invokeinterface #473 <Method Object List.get(int)>
	//   24   53:checkcast       #249 <Class String>
	//   25   56:astore          5
			if(playbackActions.containsKey(obj))
	//*  26   58:aload_0         
	//*  27   59:getfield        #225 <Field Map playbackActions>
	//*  28   62:aload           5
	//*  29   64:invokeinterface #477 <Method boolean Map.containsKey(Object)>
	//*  30   69:ifeq            91
				obj = ((Object) ((android.support.v4.app.NotificationCompat.Action)playbackActions.get(obj)));
	//   31   72:aload_0         
	//   32   73:getfield        #225 <Field Map playbackActions>
	//   33   76:aload           5
	//   34   78:invokeinterface #268 <Method Object Map.get(Object)>
	//   35   83:checkcast       #275 <Class android.support.v4.app.NotificationCompat$Action>
	//   36   86:astore          5
			else
	//*  37   88:goto            107
				obj = ((Object) ((android.support.v4.app.NotificationCompat.Action)customActions.get(obj)));
	//   38   91:aload_0         
	//   39   92:getfield        #264 <Field Map customActions>
	//   40   95:aload           5
	//   41   97:invokeinterface #268 <Method Object Map.get(Object)>
	//   42  102:checkcast       #275 <Class android.support.v4.app.NotificationCompat$Action>
	//   43  105:astore          5
			if(obj != null)
	//*  44  107:aload           5
	//*  45  109:ifnull          120
				builder.addAction(((android.support.v4.app.NotificationCompat.Action) (obj)));
	//   46  112:aload           6
	//   47  114:aload           5
	//   48  116:invokevirtual   #480 <Method android.support.v4.app.NotificationCompat$Builder android.support.v4.app.NotificationCompat$Builder.addAction(android.support.v4.app.NotificationCompat$Action)>
	//   49  119:pop             
		}

	//   50  120:iload_3         
	//   51  121:iconst_1        
	//   52  122:iadd            
	//   53  123:istore_3        
	//*  54  124:goto            34
		Object obj1 = ((Object) (new android.support.v4.media.app.NotificationCompat.MediaStyle()));
	//   55  127:new             #482 <Class android.support.v4.media.app.NotificationCompat$MediaStyle>
	//   56  130:dup             
	//   57  131:invokespecial   #483 <Method void android.support.v4.media.app.NotificationCompat$MediaStyle()>
	//   58  134:astore          5
		builder.setStyle(((android.support.v4.app.NotificationCompat.Style) (obj1)));
	//   59  136:aload           6
	//   60  138:aload           5
	//   61  140:invokevirtual   #487 <Method android.support.v4.app.NotificationCompat$Builder android.support.v4.app.NotificationCompat$Builder.setStyle(android.support.v4.app.NotificationCompat$Style)>
	//   62  143:pop             
		if(mediaSessionToken != null)
	//*  63  144:aload_0         
	//*  64  145:getfield        #489 <Field android.support.v4.media.session.MediaSessionCompat$Token mediaSessionToken>
	//*  65  148:ifnull          161
			((android.support.v4.media.app.NotificationCompat.MediaStyle) (obj1)).setMediaSession(mediaSessionToken);
	//   66  151:aload           5
	//   67  153:aload_0         
	//   68  154:getfield        #489 <Field android.support.v4.media.session.MediaSessionCompat$Token mediaSessionToken>
	//   69  157:invokevirtual   #493 <Method android.support.v4.media.app.NotificationCompat$MediaStyle android.support.v4.media.app.NotificationCompat$MediaStyle.setMediaSession(android.support.v4.media.session.MediaSessionCompat$Token)>
	//   70  160:pop             
		((android.support.v4.media.app.NotificationCompat.MediaStyle) (obj1)).setShowActionsInCompactView(getActionIndicesForCompactView(player1));
	//   71  161:aload           5
	//   72  163:aload_0         
	//   73  164:aload_1         
	//   74  165:invokevirtual   #497 <Method int[] getActionIndicesForCompactView(Player)>
	//   75  168:invokevirtual   #501 <Method android.support.v4.media.app.NotificationCompat$MediaStyle android.support.v4.media.app.NotificationCompat$MediaStyle.setShowActionsInCompactView(int[])>
	//   76  171:pop             
		if(stopAction != null && !flag)
	//*  77  172:aload_0         
	//*  78  173:getfield        #215 <Field String stopAction>
	//*  79  176:ifnull          190
	//*  80  179:iload           4
	//*  81  181:ifne            190
			flag = true;
	//   82  184:iconst_1        
	//   83  185:istore          4
		else
	//*  84  187:goto            193
			flag = false;
	//   85  190:iconst_0        
	//   86  191:istore          4
		((android.support.v4.media.app.NotificationCompat.MediaStyle) (obj1)).setShowCancelButton(flag);
	//   87  193:aload           5
	//   88  195:iload           4
	//   89  197:invokevirtual   #505 <Method android.support.v4.media.app.NotificationCompat$MediaStyle android.support.v4.media.app.NotificationCompat$MediaStyle.setShowCancelButton(boolean)>
	//   90  200:pop             
		if(flag && stopPendingIntent != null)
	//*  91  201:iload           4
	//*  92  203:ifeq            233
	//*  93  206:aload_0         
	//*  94  207:getfield        #280 <Field PendingIntent stopPendingIntent>
	//*  95  210:ifnull          233
		{
			builder.setDeleteIntent(stopPendingIntent);
	//   96  213:aload           6
	//   97  215:aload_0         
	//   98  216:getfield        #280 <Field PendingIntent stopPendingIntent>
	//   99  219:invokevirtual   #509 <Method android.support.v4.app.NotificationCompat$Builder android.support.v4.app.NotificationCompat$Builder.setDeleteIntent(PendingIntent)>
	//  100  222:pop             
			((android.support.v4.media.app.NotificationCompat.MediaStyle) (obj1)).setCancelButtonIntent(stopPendingIntent);
	//  101  223:aload           5
	//  102  225:aload_0         
	//  103  226:getfield        #280 <Field PendingIntent stopPendingIntent>
	//  104  229:invokevirtual   #513 <Method android.support.v4.media.app.NotificationCompat$MediaStyle android.support.v4.media.app.NotificationCompat$MediaStyle.setCancelButtonIntent(PendingIntent)>
	//  105  232:pop             
		}
		builder.setBadgeIconType(badgeIconType).setOngoing(ongoing).setColor(color).setColorized(colorized).setSmallIcon(smallIconResourceId).setVisibility(visibility).setPriority(priority).setDefaults(defaults);
	//  106  233:aload           6
	//  107  235:aload_0         
	//  108  236:getfield        #217 <Field int badgeIconType>
	//  109  239:invokevirtual   #517 <Method android.support.v4.app.NotificationCompat$Builder android.support.v4.app.NotificationCompat$Builder.setBadgeIconType(int)>
	//  110  242:aload_0         
	//  111  243:getfield        #188 <Field boolean ongoing>
	//  112  246:invokevirtual   #521 <Method android.support.v4.app.NotificationCompat$Builder android.support.v4.app.NotificationCompat$Builder.setOngoing(boolean)>
	//  113  249:aload_0         
	//  114  250:getfield        #194 <Field int color>
	//  115  253:invokevirtual   #524 <Method android.support.v4.app.NotificationCompat$Builder android.support.v4.app.NotificationCompat$Builder.setColor(int)>
	//  116  256:aload_0         
	//  117  257:getfield        #190 <Field boolean colorized>
	//  118  260:invokevirtual   #527 <Method android.support.v4.app.NotificationCompat$Builder android.support.v4.app.NotificationCompat$Builder.setColorized(boolean)>
	//  119  263:aload_0         
	//  120  264:getfield        #201 <Field int smallIconResourceId>
	//  121  267:invokevirtual   #530 <Method android.support.v4.app.NotificationCompat$Builder android.support.v4.app.NotificationCompat$Builder.setSmallIcon(int)>
	//  122  270:aload_0         
	//  123  271:getfield        #219 <Field int visibility>
	//  124  274:invokevirtual   #533 <Method android.support.v4.app.NotificationCompat$Builder android.support.v4.app.NotificationCompat$Builder.setVisibility(int)>
	//  125  277:aload_0         
	//  126  278:getfield        #205 <Field int priority>
	//  127  281:invokevirtual   #536 <Method android.support.v4.app.NotificationCompat$Builder android.support.v4.app.NotificationCompat$Builder.setPriority(int)>
	//  128  284:aload_0         
	//  129  285:getfield        #203 <Field int defaults>
	//  130  288:invokevirtual   #539 <Method android.support.v4.app.NotificationCompat$Builder android.support.v4.app.NotificationCompat$Builder.setDefaults(int)>
	//  131  291:pop             
		if(useChronometer && !player1.isCurrentWindowDynamic() && player1.getPlayWhenReady() && player1.getPlaybackState() == 3)
	//* 132  292:aload_0         
	//* 133  293:getfield        #192 <Field boolean useChronometer>
	//* 134  296:ifeq            354
	//* 135  299:aload_1         
	//* 136  300:invokeinterface #542 <Method boolean Player.isCurrentWindowDynamic()>
	//* 137  305:ifne            354
	//* 138  308:aload_1         
	//* 139  309:invokeinterface #545 <Method boolean Player.getPlayWhenReady()>
	//* 140  314:ifeq            354
	//* 141  317:aload_1         
	//* 142  318:invokeinterface #548 <Method int Player.getPlaybackState()>
	//* 143  323:iconst_3        
	//* 144  324:icmpne          354
			builder.setWhen(System.currentTimeMillis() - player1.getContentPosition()).setShowWhen(true).setUsesChronometer(true);
	//  145  327:aload           6
	//  146  329:invokestatic    #554 <Method long System.currentTimeMillis()>
	//  147  332:aload_1         
	//  148  333:invokeinterface #557 <Method long Player.getContentPosition()>
	//  149  338:lsub            
	//  150  339:invokevirtual   #561 <Method android.support.v4.app.NotificationCompat$Builder android.support.v4.app.NotificationCompat$Builder.setWhen(long)>
	//  151  342:iconst_1        
	//  152  343:invokevirtual   #564 <Method android.support.v4.app.NotificationCompat$Builder android.support.v4.app.NotificationCompat$Builder.setShowWhen(boolean)>
	//  153  346:iconst_1        
	//  154  347:invokevirtual   #567 <Method android.support.v4.app.NotificationCompat$Builder android.support.v4.app.NotificationCompat$Builder.setUsesChronometer(boolean)>
	//  155  350:pop             
		else
	//* 156  351:goto            365
			builder.setShowWhen(false).setUsesChronometer(false);
	//  157  354:aload           6
	//  158  356:iconst_0        
	//  159  357:invokevirtual   #564 <Method android.support.v4.app.NotificationCompat$Builder android.support.v4.app.NotificationCompat$Builder.setShowWhen(boolean)>
	//  160  360:iconst_0        
	//  161  361:invokevirtual   #567 <Method android.support.v4.app.NotificationCompat$Builder android.support.v4.app.NotificationCompat$Builder.setUsesChronometer(boolean)>
	//  162  364:pop             
		builder.setContentTitle(((CharSequence) (mediaDescriptionAdapter.getCurrentContentTitle(player1))));
	//  163  365:aload           6
	//  164  367:aload_0         
	//  165  368:getfield        #139 <Field PlayerNotificationManager$MediaDescriptionAdapter mediaDescriptionAdapter>
	//  166  371:aload_1         
	//  167  372:invokeinterface #571 <Method String PlayerNotificationManager$MediaDescriptionAdapter.getCurrentContentTitle(Player)>
	//  168  377:invokevirtual   #575 <Method android.support.v4.app.NotificationCompat$Builder android.support.v4.app.NotificationCompat$Builder.setContentTitle(CharSequence)>
	//  169  380:pop             
		builder.setContentText(((CharSequence) (mediaDescriptionAdapter.getCurrentContentText(player1))));
	//  170  381:aload           6
	//  171  383:aload_0         
	//  172  384:getfield        #139 <Field PlayerNotificationManager$MediaDescriptionAdapter mediaDescriptionAdapter>
	//  173  387:aload_1         
	//  174  388:invokeinterface #578 <Method String PlayerNotificationManager$MediaDescriptionAdapter.getCurrentContentText(Player)>
	//  175  393:invokevirtual   #581 <Method android.support.v4.app.NotificationCompat$Builder android.support.v4.app.NotificationCompat$Builder.setContentText(CharSequence)>
	//  176  396:pop             
		obj1 = ((Object) (bitmap));
	//  177  397:aload_2         
	//  178  398:astore          5
		if(bitmap == null)
	//* 179  400:aload_2         
	//* 180  401:ifnonnull       440
		{
			bitmap = ((Bitmap) (mediaDescriptionAdapter));
	//  181  404:aload_0         
	//  182  405:getfield        #139 <Field PlayerNotificationManager$MediaDescriptionAdapter mediaDescriptionAdapter>
	//  183  408:astore_2        
			int j = currentNotificationTag + 1;
	//  184  409:aload_0         
	//  185  410:getfield        #306 <Field int currentNotificationTag>
	//  186  413:iconst_1        
	//  187  414:iadd            
	//  188  415:istore_3        
			currentNotificationTag = j;
	//  189  416:aload_0         
	//  190  417:iload_3         
	//  191  418:putfield        #306 <Field int currentNotificationTag>
			obj1 = ((Object) (((MediaDescriptionAdapter) (bitmap)).getCurrentLargeIcon(player1, new BitmapCallback(j))));
	//  192  421:aload_2         
	//  193  422:aload_1         
	//  194  423:new             #8   <Class PlayerNotificationManager$BitmapCallback>
	//  195  426:dup             
	//  196  427:aload_0         
	//  197  428:iload_3         
	//  198  429:aconst_null     
	//  199  430:invokespecial   #584 <Method void PlayerNotificationManager$BitmapCallback(PlayerNotificationManager, int, PlayerNotificationManager$1)>
	//  200  433:invokeinterface #588 <Method Bitmap PlayerNotificationManager$MediaDescriptionAdapter.getCurrentLargeIcon(Player, PlayerNotificationManager$BitmapCallback)>
	//  201  438:astore          5
		}
		if(obj1 != null)
	//* 202  440:aload           5
	//* 203  442:ifnull          453
			builder.setLargeIcon(((Bitmap) (obj1)));
	//  204  445:aload           6
	//  205  447:aload           5
	//  206  449:invokevirtual   #592 <Method android.support.v4.app.NotificationCompat$Builder android.support.v4.app.NotificationCompat$Builder.setLargeIcon(Bitmap)>
	//  207  452:pop             
		player1 = ((Player) (mediaDescriptionAdapter.createCurrentContentIntent(player1)));
	//  208  453:aload_0         
	//  209  454:getfield        #139 <Field PlayerNotificationManager$MediaDescriptionAdapter mediaDescriptionAdapter>
	//  210  457:aload_1         
	//  211  458:invokeinterface #596 <Method PendingIntent PlayerNotificationManager$MediaDescriptionAdapter.createCurrentContentIntent(Player)>
	//  212  463:astore_1        
		if(player1 != null)
	//* 213  464:aload_1         
	//* 214  465:ifnull          475
			builder.setContentIntent(((PendingIntent) (player1)));
	//  215  468:aload           6
	//  216  470:aload_1         
	//  217  471:invokevirtual   #599 <Method android.support.v4.app.NotificationCompat$Builder android.support.v4.app.NotificationCompat$Builder.setContentIntent(PendingIntent)>
	//  218  474:pop             
		return builder.build();
	//  219  475:aload           6
	//  220  477:invokevirtual   #603 <Method Notification android.support.v4.app.NotificationCompat$Builder.build()>
	//  221  480:areturn         
	}

	protected int[] getActionIndicesForCompactView(Player player1)
	{
		throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
	//    0    0:new             #605 <Class RuntimeException>
	//    1    3:dup             
	//    2    4:ldc2            #607 <String "d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n">
	//    3    7:invokespecial   #610 <Method void Runtime(String)>
	//    4   10:athrow          
	}

	protected List getActions(Player player1)
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #612 <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #613 <Method void ArrayList()>
	//    3    7:astore_2        
		if(!player1.isPlayingAd())
	//*   4    8:aload_1         
	//*   5    9:invokeinterface #455 <Method boolean Player.isPlayingAd()>
	//*   6   14:ifne            179
		{
			if(useNavigationActions)
	//*   7   17:aload_0         
	//*   8   18:getfield        #184 <Field boolean useNavigationActions>
	//*   9   21:ifeq            33
				((List) (arraylist)).add("com.google.android.exoplayer.prev");
	//   10   24:aload_2         
	//   11   25:ldc1            #48  <String "com.google.android.exoplayer.prev">
	//   12   27:invokeinterface #616 <Method boolean List.add(Object)>
	//   13   32:pop             
			if(rewindMs > 0L)
	//*  14   33:aload_0         
	//*  15   34:getfield        #213 <Field long rewindMs>
	//*  16   37:lconst_0        
	//*  17   38:lcmp            
	//*  18   39:ifle            51
				((List) (arraylist)).add("com.google.android.exoplayer.rewind");
	//   19   42:aload_2         
	//   20   43:ldc1            #51  <String "com.google.android.exoplayer.rewind">
	//   21   45:invokeinterface #616 <Method boolean List.add(Object)>
	//   22   50:pop             
			if(usePlayPauseActions)
	//*  23   51:aload_0         
	//*  24   52:getfield        #186 <Field boolean usePlayPauseActions>
	//*  25   55:ifeq            88
				if(player1.getPlayWhenReady())
	//*  26   58:aload_1         
	//*  27   59:invokeinterface #545 <Method boolean Player.getPlayWhenReady()>
	//*  28   64:ifeq            79
					((List) (arraylist)).add("com.google.android.exoplayer.pause");
	//   29   67:aload_2         
	//   30   68:ldc1            #42  <String "com.google.android.exoplayer.pause">
	//   31   70:invokeinterface #616 <Method boolean List.add(Object)>
	//   32   75:pop             
				else
	//*  33   76:goto            88
					((List) (arraylist)).add("com.google.android.exoplayer.play");
	//   34   79:aload_2         
	//   35   80:ldc1            #45  <String "com.google.android.exoplayer.play">
	//   36   82:invokeinterface #616 <Method boolean List.add(Object)>
	//   37   87:pop             
			if(fastForwardMs > 0L)
	//*  38   88:aload_0         
	//*  39   89:getfield        #209 <Field long fastForwardMs>
	//*  40   92:lconst_0        
	//*  41   93:lcmp            
	//*  42   94:ifle            106
				((List) (arraylist)).add("com.google.android.exoplayer.ffwd");
	//   43   97:aload_2         
	//   44   98:ldc1            #36  <String "com.google.android.exoplayer.ffwd">
	//   45  100:invokeinterface #616 <Method boolean List.add(Object)>
	//   46  105:pop             
			if(useNavigationActions && player1.getNextWindowIndex() != -1)
	//*  47  106:aload_0         
	//*  48  107:getfield        #184 <Field boolean useNavigationActions>
	//*  49  110:ifeq            132
	//*  50  113:aload_1         
	//*  51  114:invokeinterface #619 <Method int Player.getNextWindowIndex()>
	//*  52  119:iconst_m1       
	//*  53  120:icmpeq          132
				((List) (arraylist)).add("com.google.android.exoplayer.next");
	//   54  123:aload_2         
	//   55  124:ldc1            #39  <String "com.google.android.exoplayer.next">
	//   56  126:invokeinterface #616 <Method boolean List.add(Object)>
	//   57  131:pop             
			if(customActionReceiver != null)
	//*  58  132:aload_0         
	//*  59  133:getfield        #141 <Field PlayerNotificationManager$CustomActionReceiver customActionReceiver>
	//*  60  136:ifnull          156
				((List) (arraylist)).addAll(((java.util.Collection) (customActionReceiver.getCustomActions(player1))));
	//   61  139:aload_2         
	//   62  140:aload_0         
	//   63  141:getfield        #141 <Field PlayerNotificationManager$CustomActionReceiver customActionReceiver>
	//   64  144:aload_1         
	//   65  145:invokeinterface #622 <Method List PlayerNotificationManager$CustomActionReceiver.getCustomActions(Player)>
	//   66  150:invokeinterface #626 <Method boolean List.addAll(java.util.Collection)>
	//   67  155:pop             
			if("com.google.android.exoplayer.stop".equals(((Object) (stopAction))))
	//*  68  156:ldc1            #54  <String "com.google.android.exoplayer.stop">
	//*  69  158:aload_0         
	//*  70  159:getfield        #215 <Field String stopAction>
	//*  71  162:invokevirtual   #629 <Method boolean String.equals(Object)>
	//*  72  165:ifeq            179
				((List) (arraylist)).add(((Object) (stopAction)));
	//   73  168:aload_2         
	//   74  169:aload_0         
	//   75  170:getfield        #215 <Field String stopAction>
	//   76  173:invokeinterface #616 <Method boolean List.add(Object)>
	//   77  178:pop             
		}
		return ((List) (arraylist));
	//   78  179:aload_2         
	//   79  180:areturn         
	}

	public final void setBadgeIconType(int i)
	{
		if(badgeIconType == i)
	//*   0    0:aload_0         
	//*   1    1:getfield        #217 <Field int badgeIconType>
	//*   2    4:iload_1         
	//*   3    5:icmpne          9
			return;
	//    4    8:return          
		switch(i)
	//*   5    9:iload_1         
		{
	//*   6   10:tableswitch     0 2: default 36
	//	               0 44
	//	               1 44
	//	               2 44
		default:
			throw new IllegalArgumentException();
	//    7   36:new             #632 <Class IllegalArgumentException>
	//    8   39:dup             
	//    9   40:invokespecial   #633 <Method void IllegalArgumentException()>
	//   10   43:athrow          

		case 0: // '\0'
		case 1: // '\001'
		case 2: // '\002'
			badgeIconType = i;
	//   11   44:aload_0         
	//   12   45:iload_1         
	//   13   46:putfield        #217 <Field int badgeIconType>
			break;
		}
		maybeUpdateNotification();
	//   14   49:aload_0         
	//   15   50:invokespecial   #635 <Method void maybeUpdateNotification()>
	//   16   53:return          
	}

	public final void setColor(int i)
	{
		if(color != i)
	//*   0    0:aload_0         
	//*   1    1:getfield        #194 <Field int color>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          17
		{
			color = i;
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:putfield        #194 <Field int color>
			maybeUpdateNotification();
	//    7   13:aload_0         
	//    8   14:invokespecial   #635 <Method void maybeUpdateNotification()>
		}
	//    9   17:return          
	}

	public final void setColorized(boolean flag)
	{
		if(colorized != flag)
	//*   0    0:aload_0         
	//*   1    1:getfield        #190 <Field boolean colorized>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          17
		{
			colorized = flag;
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:putfield        #190 <Field boolean colorized>
			maybeUpdateNotification();
	//    7   13:aload_0         
	//    8   14:invokespecial   #635 <Method void maybeUpdateNotification()>
		}
	//    9   17:return          
	}

	public final void setControlDispatcher(ControlDispatcher controldispatcher)
	{
		if(controldispatcher == null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          7
	//*   2    4:goto            15
			controldispatcher = ((ControlDispatcher) (new DefaultControlDispatcher()));
	//    3    7:new             #143 <Class DefaultControlDispatcher>
	//    4   10:dup             
	//    5   11:invokespecial   #144 <Method void DefaultControlDispatcher()>
	//    6   14:astore_1        
		controlDispatcher = controldispatcher;
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:putfield        #146 <Field ControlDispatcher controlDispatcher>
	//   10   20:return          
	}

	public final void setDefaults(int i)
	{
		if(defaults != i)
	//*   0    0:aload_0         
	//*   1    1:getfield        #203 <Field int defaults>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          17
		{
			defaults = i;
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:putfield        #203 <Field int defaults>
			maybeUpdateNotification();
	//    7   13:aload_0         
	//    8   14:invokespecial   #635 <Method void maybeUpdateNotification()>
		}
	//    9   17:return          
	}

	public final void setFastForwardIncrementMs(long l)
	{
		if(fastForwardMs == l)
	//*   0    0:aload_0         
	//*   1    1:getfield        #209 <Field long fastForwardMs>
	//*   2    4:lload_1         
	//*   3    5:lcmp            
	//*   4    6:ifne            10
		{
			return;
	//    5    9:return          
		} else
		{
			fastForwardMs = l;
	//    6   10:aload_0         
	//    7   11:lload_1         
	//    8   12:putfield        #209 <Field long fastForwardMs>
			maybeUpdateNotification();
	//    9   15:aload_0         
	//   10   16:invokespecial   #635 <Method void maybeUpdateNotification()>
			return;
	//   11   19:return          
		}
	}

	public final void setMediaSessionToken(android.support.v4.media.session.MediaSessionCompat.Token token)
	{
		if(!Util.areEqual(((Object) (mediaSessionToken)), ((Object) (token))))
	//*   0    0:aload_0         
	//*   1    1:getfield        #489 <Field android.support.v4.media.session.MediaSessionCompat$Token mediaSessionToken>
	//*   2    4:aload_1         
	//*   3    5:invokestatic    #648 <Method boolean Util.areEqual(Object, Object)>
	//*   4    8:ifne            20
		{
			mediaSessionToken = token;
	//    5   11:aload_0         
	//    6   12:aload_1         
	//    7   13:putfield        #489 <Field android.support.v4.media.session.MediaSessionCompat$Token mediaSessionToken>
			maybeUpdateNotification();
	//    8   16:aload_0         
	//    9   17:invokespecial   #635 <Method void maybeUpdateNotification()>
		}
	//   10   20:return          
	}

	public final void setNotificationListener(NotificationListener notificationlistener)
	{
		notificationListener = notificationlistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #425 <Field PlayerNotificationManager$NotificationListener notificationListener>
	//    3    5:return          
	}

	public final void setOngoing(boolean flag)
	{
		if(ongoing != flag)
	//*   0    0:aload_0         
	//*   1    1:getfield        #188 <Field boolean ongoing>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          17
		{
			ongoing = flag;
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:putfield        #188 <Field boolean ongoing>
			maybeUpdateNotification();
	//    7   13:aload_0         
	//    8   14:invokespecial   #635 <Method void maybeUpdateNotification()>
		}
	//    9   17:return          
	}

	public final void setPlayer(Player player1)
	{
		if(player == player1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #285 <Field Player player>
	//*   2    4:aload_1         
	//*   3    5:if_acmpne       9
			return;
	//    4    8:return          
		if(player != null)
	//*   5    9:aload_0         
	//*   6   10:getfield        #285 <Field Player player>
	//*   7   13:ifnull          37
		{
			player.removeListener(playerListener);
	//    8   16:aload_0         
	//    9   17:getfield        #285 <Field Player player>
	//   10   20:aload_0         
	//   11   21:getfield        #172 <Field com.google.android.exoplayer2.Player$EventListener playerListener>
	//   12   24:invokeinterface #656 <Method void Player.removeListener(com.google.android.exoplayer2.Player$EventListener)>
			if(player1 == null)
	//*  13   29:aload_1         
	//*  14   30:ifnonnull       37
				stopNotification();
	//   15   33:aload_0         
	//   16   34:invokespecial   #298 <Method void stopNotification()>
		}
		player = player1;
	//   17   37:aload_0         
	//   18   38:aload_1         
	//   19   39:putfield        #285 <Field Player player>
		if(player1 != null)
	//*  20   42:aload_1         
	//*  21   43:ifnull          88
		{
			wasPlayWhenReady = player1.getPlayWhenReady();
	//   22   46:aload_0         
	//   23   47:aload_1         
	//   24   48:invokeinterface #545 <Method boolean Player.getPlayWhenReady()>
	//   25   53:putfield        #321 <Field boolean wasPlayWhenReady>
			lastPlaybackState = player1.getPlaybackState();
	//   26   56:aload_0         
	//   27   57:aload_1         
	//   28   58:invokeinterface #548 <Method int Player.getPlaybackState()>
	//   29   63:putfield        #326 <Field int lastPlaybackState>
			player1.addListener(playerListener);
	//   30   66:aload_1         
	//   31   67:aload_0         
	//   32   68:getfield        #172 <Field com.google.android.exoplayer2.Player$EventListener playerListener>
	//   33   71:invokeinterface #659 <Method void Player.addListener(com.google.android.exoplayer2.Player$EventListener)>
			if(lastPlaybackState != 1)
	//*  34   76:aload_0         
	//*  35   77:getfield        #326 <Field int lastPlaybackState>
	//*  36   80:iconst_1        
	//*  37   81:icmpeq          88
				startOrUpdateNotification();
	//   38   84:aload_0         
	//   39   85:invokespecial   #289 <Method void startOrUpdateNotification()>
		}
	//   40   88:return          
	}

	public final void setPriority(int i)
	{
		if(priority == i)
	//*   0    0:aload_0         
	//*   1    1:getfield        #205 <Field int priority>
	//*   2    4:iload_1         
	//*   3    5:icmpne          9
			return;
	//    4    8:return          
		switch(i)
	//*   5    9:iload_1         
		{
	//*   6   10:tableswitch     -2 2: default 44
	//	               -2 52
	//	               -1 52
	//	               0 52
	//	               1 52
	//	               2 52
		default:
			throw new IllegalArgumentException();
	//    7   44:new             #632 <Class IllegalArgumentException>
	//    8   47:dup             
	//    9   48:invokespecial   #633 <Method void IllegalArgumentException()>
	//   10   51:athrow          

		case -2: 
		case -1: 
		case 0: // '\0'
		case 1: // '\001'
		case 2: // '\002'
			priority = i;
	//   11   52:aload_0         
	//   12   53:iload_1         
	//   13   54:putfield        #205 <Field int priority>
			break;
		}
		maybeUpdateNotification();
	//   14   57:aload_0         
	//   15   58:invokespecial   #635 <Method void maybeUpdateNotification()>
	//   16   61:return          
	}

	public final void setRewindIncrementMs(long l)
	{
		if(rewindMs == l)
	//*   0    0:aload_0         
	//*   1    1:getfield        #213 <Field long rewindMs>
	//*   2    4:lload_1         
	//*   3    5:lcmp            
	//*   4    6:ifne            10
		{
			return;
	//    5    9:return          
		} else
		{
			rewindMs = l;
	//    6   10:aload_0         
	//    7   11:lload_1         
	//    8   12:putfield        #213 <Field long rewindMs>
			maybeUpdateNotification();
	//    9   15:aload_0         
	//   10   16:invokespecial   #635 <Method void maybeUpdateNotification()>
			return;
	//   11   19:return          
		}
	}

	public final void setSmallIcon(int i)
	{
		if(smallIconResourceId != i)
	//*   0    0:aload_0         
	//*   1    1:getfield        #201 <Field int smallIconResourceId>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          17
		{
			smallIconResourceId = i;
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:putfield        #201 <Field int smallIconResourceId>
			maybeUpdateNotification();
	//    7   13:aload_0         
	//    8   14:invokespecial   #635 <Method void maybeUpdateNotification()>
		}
	//    9   17:return          
	}

	public final void setStopAction(String s)
	{
		if(Util.areEqual(((Object) (s)), ((Object) (stopAction))))
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #215 <Field String stopAction>
	//*   3    5:invokestatic    #648 <Method boolean Util.areEqual(Object, Object)>
	//*   4    8:ifeq            12
			return;
	//    5   11:return          
		stopAction = s;
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:putfield        #215 <Field String stopAction>
		if("com.google.android.exoplayer.stop".equals(((Object) (s))))
	//*   9   17:ldc1            #54  <String "com.google.android.exoplayer.stop">
	//*  10   19:aload_1         
	//*  11   20:invokevirtual   #629 <Method boolean String.equals(Object)>
	//*  12   23:ifeq            53
			stopPendingIntent = ((android.support.v4.app.NotificationCompat.Action)Assertions.checkNotNull(playbackActions.get("com.google.android.exoplayer.stop"))).actionIntent;
	//   13   26:aload_0         
	//   14   27:aload_0         
	//   15   28:getfield        #225 <Field Map playbackActions>
	//   16   31:ldc1            #54  <String "com.google.android.exoplayer.stop">
	//   17   33:invokeinterface #268 <Method Object Map.get(Object)>
	//   18   38:invokestatic    #273 <Method Object Assertions.checkNotNull(Object)>
	//   19   41:checkcast       #275 <Class android.support.v4.app.NotificationCompat$Action>
	//   20   44:getfield        #278 <Field PendingIntent android.support.v4.app.NotificationCompat$Action.actionIntent>
	//   21   47:putfield        #280 <Field PendingIntent stopPendingIntent>
		else
	//*  22   50:goto            88
		if(s != null)
	//*  23   53:aload_1         
	//*  24   54:ifnull          83
			stopPendingIntent = ((android.support.v4.app.NotificationCompat.Action)Assertions.checkNotNull(customActions.get(((Object) (s))))).actionIntent;
	//   25   57:aload_0         
	//   26   58:aload_0         
	//   27   59:getfield        #264 <Field Map customActions>
	//   28   62:aload_1         
	//   29   63:invokeinterface #268 <Method Object Map.get(Object)>
	//   30   68:invokestatic    #273 <Method Object Assertions.checkNotNull(Object)>
	//   31   71:checkcast       #275 <Class android.support.v4.app.NotificationCompat$Action>
	//   32   74:getfield        #278 <Field PendingIntent android.support.v4.app.NotificationCompat$Action.actionIntent>
	//   33   77:putfield        #280 <Field PendingIntent stopPendingIntent>
		else
	//*  34   80:goto            88
			stopPendingIntent = null;
	//   35   83:aload_0         
	//   36   84:aconst_null     
	//   37   85:putfield        #280 <Field PendingIntent stopPendingIntent>
		maybeUpdateNotification();
	//   38   88:aload_0         
	//   39   89:invokespecial   #635 <Method void maybeUpdateNotification()>
	//   40   92:return          
	}

	public final void setUseChronometer(boolean flag)
	{
		if(useChronometer != flag)
	//*   0    0:aload_0         
	//*   1    1:getfield        #192 <Field boolean useChronometer>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          17
		{
			useChronometer = flag;
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:putfield        #192 <Field boolean useChronometer>
			maybeUpdateNotification();
	//    7   13:aload_0         
	//    8   14:invokespecial   #635 <Method void maybeUpdateNotification()>
		}
	//    9   17:return          
	}

	public final void setUseNavigationActions(boolean flag)
	{
		if(useNavigationActions != flag)
	//*   0    0:aload_0         
	//*   1    1:getfield        #184 <Field boolean useNavigationActions>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          17
		{
			useNavigationActions = flag;
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:putfield        #184 <Field boolean useNavigationActions>
			maybeUpdateNotification();
	//    7   13:aload_0         
	//    8   14:invokespecial   #635 <Method void maybeUpdateNotification()>
		}
	//    9   17:return          
	}

	public final void setUsePlayPauseActions(boolean flag)
	{
		if(usePlayPauseActions != flag)
	//*   0    0:aload_0         
	//*   1    1:getfield        #186 <Field boolean usePlayPauseActions>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          17
		{
			usePlayPauseActions = flag;
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:putfield        #186 <Field boolean usePlayPauseActions>
			maybeUpdateNotification();
	//    7   13:aload_0         
	//    8   14:invokespecial   #635 <Method void maybeUpdateNotification()>
		}
	//    9   17:return          
	}

	public final void setVisibility(int i)
	{
		if(visibility == i)
	//*   0    0:aload_0         
	//*   1    1:getfield        #219 <Field int visibility>
	//*   2    4:iload_1         
	//*   3    5:icmpne          9
			return;
	//    4    8:return          
		switch(i)
	//*   5    9:iload_1         
		{
	//*   6   10:tableswitch     -1 1: default 36
	//	               -1 44
	//	               0 44
	//	               1 44
		default:
			throw new IllegalStateException();
	//    7   36:new             #666 <Class IllegalStateException>
	//    8   39:dup             
	//    9   40:invokespecial   #667 <Method void IllegalStateException()>
	//   10   43:athrow          

		case -1: 
		case 0: // '\0'
		case 1: // '\001'
			visibility = i;
	//   11   44:aload_0         
	//   12   45:iload_1         
	//   13   46:putfield        #219 <Field int visibility>
			break;
		}
		maybeUpdateNotification();
	//   14   49:aload_0         
	//   15   50:invokespecial   #635 <Method void maybeUpdateNotification()>
	//   16   53:return          
	}

	public static final String ACTION_FAST_FORWARD = "com.google.android.exoplayer.ffwd";
	public static final String ACTION_NEXT = "com.google.android.exoplayer.next";
	public static final String ACTION_PAUSE = "com.google.android.exoplayer.pause";
	public static final String ACTION_PLAY = "com.google.android.exoplayer.play";
	public static final String ACTION_PREVIOUS = "com.google.android.exoplayer.prev";
	public static final String ACTION_REWIND = "com.google.android.exoplayer.rewind";
	public static final String ACTION_STOP = "com.google.android.exoplayer.stop";
	public static final int DEFAULT_FAST_FORWARD_MS = 15000;
	public static final int DEFAULT_REWIND_MS = 5000;
	private static final long MAX_POSITION_FOR_SEEK_TO_PREVIOUS = 3000L;
	private int badgeIconType;
	private final String channelId;
	private int color;
	private boolean colorized;
	private final Context context;
	private ControlDispatcher controlDispatcher;
	private int currentNotificationTag;
	private final CustomActionReceiver customActionReceiver;
	private final Map customActions;
	private int defaults;
	private long fastForwardMs;
	private final IntentFilter intentFilter;
	private boolean isNotificationStarted;
	private int lastPlaybackState;
	private final Handler mainHandler;
	private final MediaDescriptionAdapter mediaDescriptionAdapter;
	private android.support.v4.media.session.MediaSessionCompat.Token mediaSessionToken;
	private final NotificationBroadcastReceiver notificationBroadcastReceiver;
	private final int notificationId;
	private NotificationListener notificationListener;
	private final NotificationManagerCompat notificationManager;
	private boolean ongoing;
	private final Map playbackActions;
	private Player player;
	private final com.google.android.exoplayer2.Player.EventListener playerListener;
	private int priority;
	private long rewindMs;
	private int smallIconResourceId;
	private String stopAction;
	private PendingIntent stopPendingIntent;
	private boolean useChronometer;
	private boolean useNavigationActions;
	private boolean usePlayPauseActions;
	private int visibility;
	private boolean wasPlayWhenReady;


/*
	static Player access$000(PlayerNotificationManager playernotificationmanager)
	{
		return playernotificationmanager.player;
	//    0    0:aload_0         
	//    1    1:getfield        #285 <Field Player player>
	//    2    4:areturn         
	}

*/


/*
	static void access$1000(PlayerNotificationManager playernotificationmanager)
	{
		playernotificationmanager.startOrUpdateNotification();
	//    0    0:aload_0         
	//    1    1:invokespecial   #289 <Method void startOrUpdateNotification()>
		return;
	//    2    4:return          
	}

*/


/*
	static ControlDispatcher access$1100(PlayerNotificationManager playernotificationmanager)
	{
		return playernotificationmanager.controlDispatcher;
	//    0    0:aload_0         
	//    1    1:getfield        #146 <Field ControlDispatcher controlDispatcher>
	//    2    4:areturn         
	}

*/


/*
	static long access$1200(PlayerNotificationManager playernotificationmanager)
	{
		return playernotificationmanager.fastForwardMs;
	//    0    0:aload_0         
	//    1    1:getfield        #209 <Field long fastForwardMs>
	//    2    4:lreturn         
	}

*/


/*
	static long access$1300(PlayerNotificationManager playernotificationmanager)
	{
		return playernotificationmanager.rewindMs;
	//    0    0:aload_0         
	//    1    1:getfield        #213 <Field long rewindMs>
	//    2    4:lreturn         
	}

*/


/*
	static void access$1400(PlayerNotificationManager playernotificationmanager)
	{
		playernotificationmanager.stopNotification();
	//    0    0:aload_0         
	//    1    1:invokespecial   #298 <Method void stopNotification()>
		return;
	//    2    4:return          
	}

*/


/*
	static CustomActionReceiver access$1500(PlayerNotificationManager playernotificationmanager)
	{
		return playernotificationmanager.customActionReceiver;
	//    0    0:aload_0         
	//    1    1:getfield        #141 <Field PlayerNotificationManager$CustomActionReceiver customActionReceiver>
	//    2    4:areturn         
	}

*/


/*
	static Map access$1600(PlayerNotificationManager playernotificationmanager)
	{
		return playernotificationmanager.customActions;
	//    0    0:aload_0         
	//    1    1:getfield        #264 <Field Map customActions>
	//    2    4:areturn         
	}

*/


/*
	static int access$200(PlayerNotificationManager playernotificationmanager)
	{
		return playernotificationmanager.currentNotificationTag;
	//    0    0:aload_0         
	//    1    1:getfield        #306 <Field int currentNotificationTag>
	//    2    4:ireturn         
	}

*/


/*
	static boolean access$300(PlayerNotificationManager playernotificationmanager)
	{
		return playernotificationmanager.isNotificationStarted;
	//    0    0:aload_0         
	//    1    1:getfield        #310 <Field boolean isNotificationStarted>
	//    2    4:ireturn         
	}

*/


/*
	static Notification access$400(PlayerNotificationManager playernotificationmanager, Bitmap bitmap)
	{
		return playernotificationmanager.updateNotification(bitmap);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #316 <Method Notification updateNotification(Bitmap)>
	//    3    5:areturn         
	}

*/


/*
	static Handler access$500(PlayerNotificationManager playernotificationmanager)
	{
		return playernotificationmanager.mainHandler;
	//    0    0:aload_0         
	//    1    1:getfield        #159 <Field Handler mainHandler>
	//    2    4:areturn         
	}

*/


/*
	static boolean access$800(PlayerNotificationManager playernotificationmanager)
	{
		return playernotificationmanager.wasPlayWhenReady;
	//    0    0:aload_0         
	//    1    1:getfield        #321 <Field boolean wasPlayWhenReady>
	//    2    4:ireturn         
	}

*/


/*
	static boolean access$802(PlayerNotificationManager playernotificationmanager, boolean flag)
	{
		playernotificationmanager.wasPlayWhenReady = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #321 <Field boolean wasPlayWhenReady>
		return flag;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

*/


/*
	static int access$900(PlayerNotificationManager playernotificationmanager)
	{
		return playernotificationmanager.lastPlaybackState;
	//    0    0:aload_0         
	//    1    1:getfield        #326 <Field int lastPlaybackState>
	//    2    4:ireturn         
	}

*/


/*
	static int access$902(PlayerNotificationManager playernotificationmanager, int i)
	{
		playernotificationmanager.lastPlaybackState = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #326 <Field int lastPlaybackState>
		return i;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

*/
}
