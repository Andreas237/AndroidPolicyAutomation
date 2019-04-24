// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.ui;

import android.content.*;
import com.google.android.exoplayer2.*;
import java.util.Map;

// Referenced classes of package com.google.android.exoplayer2.ui:
//			PlayerNotificationManager

private class PlayerNotificationManager$NotificationBroadcastReceiver extends BroadcastReceiver
{

	public void onReceive(Context context, Intent intent)
	{
		context = ((Context) (PlayerNotificationManager.access$000(PlayerNotificationManager.this)));
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field PlayerNotificationManager this$0>
	//    2    4:invokestatic    #30  <Method Player PlayerNotificationManager.access$000(PlayerNotificationManager)>
	//    3    7:astore_1        
		if(context != null)
	//*   4    8:aload_1         
	//*   5    9:ifnull          395
		{
			if(!PlayerNotificationManager.access$300(PlayerNotificationManager.this))
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
						int i = ((Player) (context)).getNextWindowIndex();
	//   36   85:aload_1         
	//   37   86:invokeinterface #62  <Method int Player.getNextWindowIndex()>
	//   38   91:istore_3        
						if(i != -1)
	//*  39   92:iload_3         
	//*  40   93:iconst_m1       
	//*  41   94:icmpeq          394
						{
							PlayerNotificationManager.access$1100(PlayerNotificationManager.this).dispatchSeekTo(((Player) (context)), i, 0x1L);
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
							((Player) (context)).getCurrentTimeline().getWindow(((Player) (context)).getCurrentWindowIndex(), window);
	//   55  126:aload_1         
	//   56  127:invokeinterface #80  <Method Timeline Player.getCurrentTimeline()>
	//   57  132:aload_1         
	//   58  133:invokeinterface #83  <Method int Player.getCurrentWindowIndex()>
	//   59  138:aload_0         
	//   60  139:getfield        #23  <Field com.google.android.exoplayer2.Timeline$Window window>
	//   61  142:invokevirtual   #89  <Method com.google.android.exoplayer2.Timeline$Window Timeline.getWindow(int, com.google.android.exoplayer2.Timeline$Window)>
	//   62  145:pop             
							int j = ((Player) (context)).getPreviousWindowIndex();
	//   63  146:aload_1         
	//   64  147:invokeinterface #92  <Method int Player.getPreviousWindowIndex()>
	//   65  152:istore_3        
							if(j != -1 && (((Player) (context)).getCurrentPosition() <= 3000L || window.isDynamic && !window.isSeekable))
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
								PlayerNotificationManager.access$1100(PlayerNotificationManager.this).dispatchSeekTo(((Player) (context)), j, 0x1L);
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
								PlayerNotificationManager.access$1100(PlayerNotificationManager.this).dispatchSeekTo(((Player) (context)), ((Player) (context)).getCurrentWindowIndex(), 0x1L);
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
							PlayerNotificationManager.access$1100(PlayerNotificationManager.this).dispatchStop(((Player) (context)), true);
	//  105  244:aload_0         
	//  106  245:getfield        #15  <Field PlayerNotificationManager this$0>
	//  107  248:invokestatic    #66  <Method ControlDispatcher PlayerNotificationManager.access$1100(PlayerNotificationManager)>
	//  108  251:aload_1         
	//  109  252:iconst_1        
	//  110  253:invokeinterface #111 <Method boolean ControlDispatcher.dispatchStop(Player, boolean)>
	//  111  258:pop             
							PlayerNotificationManager.access$1400(PlayerNotificationManager.this);
	//  112  259:aload_0         
	//  113  260:getfield        #15  <Field PlayerNotificationManager this$0>
	//  114  263:invokestatic    #114 <Method void PlayerNotificationManager.access$1400(PlayerNotificationManager)>
							return;
	//  115  266:return          
						}
						if(PlayerNotificationManager.access$1500(PlayerNotificationManager.this) != null && PlayerNotificationManager.access$1600(PlayerNotificationManager.this).containsKey(((Object) (s))))
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
							PlayerNotificationManager.access$1500(PlayerNotificationManager.this).onCustomAction(((Player) (context)), s, intent);
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
						l = PlayerNotificationManager.access$1200(PlayerNotificationManager.this);
	//  138  321:aload_0         
	//  139  322:getfield        #15  <Field PlayerNotificationManager this$0>
	//  140  325:invokestatic    #137 <Method long PlayerNotificationManager.access$1200(PlayerNotificationManager)>
	//  141  328:lstore          4
					else
	//* 142  330:goto            343
						l = -PlayerNotificationManager.access$1300(PlayerNotificationManager.this);
	//  143  333:aload_0         
	//  144  334:getfield        #15  <Field PlayerNotificationManager this$0>
	//  145  337:invokestatic    #140 <Method long PlayerNotificationManager.access$1300(PlayerNotificationManager)>
	//  146  340:lneg            
	//  147  341:lstore          4
					PlayerNotificationManager.access$1100(PlayerNotificationManager.this).dispatchSeekTo(((Player) (context)), ((Player) (context)).getCurrentWindowIndex(), ((Player) (context)).getCurrentPosition() + l);
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
				PlayerNotificationManager.access$1100(PlayerNotificationManager.this).dispatchSetPlayWhenReady(((Player) (context)), "com.google.android.exoplayer.play".equals(((Object) (s))));
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

	public PlayerNotificationManager$NotificationBroadcastReceiver()
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
