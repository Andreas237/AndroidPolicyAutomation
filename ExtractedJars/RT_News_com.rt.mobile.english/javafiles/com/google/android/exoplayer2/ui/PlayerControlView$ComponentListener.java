// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.ui;

import android.view.View;
import android.widget.TextView;
import com.google.android.exoplayer2.*;
import com.google.android.exoplayer2.util.RepeatModeUtil;
import com.google.android.exoplayer2.util.Util;

// Referenced classes of package com.google.android.exoplayer2.ui:
//			PlayerControlView, TimeBar

private final class PlayerControlView$ComponentListener extends com.google.android.exoplayer2.Player.DefaultEventListener
	implements TimeBar.OnScrubListener, android.view.View.OnClickListener
{

	public void onClick(View view)
	{
		if(PlayerControlView.access$700(PlayerControlView.this) != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #17  <Field PlayerControlView this$0>
	//*   2    4:invokestatic    #30  <Method Player PlayerControlView.access$700(PlayerControlView)>
	//*   3    7:ifnull          357
			if(PlayerControlView.access$1500(PlayerControlView.this) == view)
	//*   4   10:aload_0         
	//*   5   11:getfield        #17  <Field PlayerControlView this$0>
	//*   6   14:invokestatic    #34  <Method View PlayerControlView.access$1500(PlayerControlView)>
	//*   7   17:aload_1         
	//*   8   18:if_acmpne       31
				PlayerControlView.access$1600(PlayerControlView.this);
	//    9   21:aload_0         
	//   10   22:getfield        #17  <Field PlayerControlView this$0>
	//   11   25:invokestatic    #37  <Method void PlayerControlView.access$1600(PlayerControlView)>
			else
	//*  12   28:goto            357
			if(PlayerControlView.access$1700(PlayerControlView.this) == view)
	//*  13   31:aload_0         
	//*  14   32:getfield        #17  <Field PlayerControlView this$0>
	//*  15   35:invokestatic    #40  <Method View PlayerControlView.access$1700(PlayerControlView)>
	//*  16   38:aload_1         
	//*  17   39:if_acmpne       52
				PlayerControlView.access$1800(PlayerControlView.this);
	//   18   42:aload_0         
	//   19   43:getfield        #17  <Field PlayerControlView this$0>
	//   20   46:invokestatic    #43  <Method void PlayerControlView.access$1800(PlayerControlView)>
			else
	//*  21   49:goto            357
			if(PlayerControlView.access$1900(PlayerControlView.this) == view)
	//*  22   52:aload_0         
	//*  23   53:getfield        #17  <Field PlayerControlView this$0>
	//*  24   56:invokestatic    #46  <Method View PlayerControlView.access$1900(PlayerControlView)>
	//*  25   59:aload_1         
	//*  26   60:if_acmpne       73
				PlayerControlView.access$2000(PlayerControlView.this);
	//   27   63:aload_0         
	//   28   64:getfield        #17  <Field PlayerControlView this$0>
	//   29   67:invokestatic    #49  <Method void PlayerControlView.access$2000(PlayerControlView)>
			else
	//*  30   70:goto            357
			if(PlayerControlView.access$2100(PlayerControlView.this) == view)
	//*  31   73:aload_0         
	//*  32   74:getfield        #17  <Field PlayerControlView this$0>
	//*  33   77:invokestatic    #52  <Method View PlayerControlView.access$2100(PlayerControlView)>
	//*  34   80:aload_1         
	//*  35   81:if_acmpne       94
				PlayerControlView.access$2200(PlayerControlView.this);
	//   36   84:aload_0         
	//   37   85:getfield        #17  <Field PlayerControlView this$0>
	//   38   88:invokestatic    #55  <Method void PlayerControlView.access$2200(PlayerControlView)>
			else
	//*  39   91:goto            357
			if(PlayerControlView.access$2300(PlayerControlView.this) == view)
	//*  40   94:aload_0         
	//*  41   95:getfield        #17  <Field PlayerControlView this$0>
	//*  42   98:invokestatic    #58  <Method View PlayerControlView.access$2300(PlayerControlView)>
	//*  43  101:aload_1         
	//*  44  102:if_acmpne       221
			{
				if(PlayerControlView.access$700(PlayerControlView.this).getPlaybackState() == 1)
	//*  45  105:aload_0         
	//*  46  106:getfield        #17  <Field PlayerControlView this$0>
	//*  47  109:invokestatic    #30  <Method Player PlayerControlView.access$700(PlayerControlView)>
	//*  48  112:invokeinterface #64  <Method int Player.getPlaybackState()>
	//*  49  117:iconst_1        
	//*  50  118:icmpne          146
				{
					if(PlayerControlView.access$2400(PlayerControlView.this) != null)
	//*  51  121:aload_0         
	//*  52  122:getfield        #17  <Field PlayerControlView this$0>
	//*  53  125:invokestatic    #68  <Method PlaybackPreparer PlayerControlView.access$2400(PlayerControlView)>
	//*  54  128:ifnull          197
						PlayerControlView.access$2400(PlayerControlView.this).preparePlayback();
	//   55  131:aload_0         
	//   56  132:getfield        #17  <Field PlayerControlView this$0>
	//   57  135:invokestatic    #68  <Method PlaybackPreparer PlayerControlView.access$2400(PlayerControlView)>
	//   58  138:invokeinterface #73  <Method void PlaybackPreparer.preparePlayback()>
				} else
	//*  59  143:goto            197
				if(PlayerControlView.access$700(PlayerControlView.this).getPlaybackState() == 4)
	//*  60  146:aload_0         
	//*  61  147:getfield        #17  <Field PlayerControlView this$0>
	//*  62  150:invokestatic    #30  <Method Player PlayerControlView.access$700(PlayerControlView)>
	//*  63  153:invokeinterface #64  <Method int Player.getPlaybackState()>
	//*  64  158:iconst_4        
	//*  65  159:icmpne          197
					PlayerControlView.access$2500(PlayerControlView.this).dispatchSeekTo(PlayerControlView.access$700(PlayerControlView.this), PlayerControlView.access$700(PlayerControlView.this).getCurrentWindowIndex(), 0x1L);
	//   66  162:aload_0         
	//   67  163:getfield        #17  <Field PlayerControlView this$0>
	//   68  166:invokestatic    #77  <Method ControlDispatcher PlayerControlView.access$2500(PlayerControlView)>
	//   69  169:aload_0         
	//   70  170:getfield        #17  <Field PlayerControlView this$0>
	//   71  173:invokestatic    #30  <Method Player PlayerControlView.access$700(PlayerControlView)>
	//   72  176:aload_0         
	//   73  177:getfield        #17  <Field PlayerControlView this$0>
	//   74  180:invokestatic    #30  <Method Player PlayerControlView.access$700(PlayerControlView)>
	//   75  183:invokeinterface #80  <Method int Player.getCurrentWindowIndex()>
	//   76  188:ldc2w           #81  <Long 0x1L>
	//   77  191:invokeinterface #88  <Method boolean ControlDispatcher.dispatchSeekTo(Player, int, long)>
	//   78  196:pop             
				PlayerControlView.access$2500(PlayerControlView.this).dispatchSetPlayWhenReady(PlayerControlView.access$700(PlayerControlView.this), true);
	//   79  197:aload_0         
	//   80  198:getfield        #17  <Field PlayerControlView this$0>
	//   81  201:invokestatic    #77  <Method ControlDispatcher PlayerControlView.access$2500(PlayerControlView)>
	//   82  204:aload_0         
	//   83  205:getfield        #17  <Field PlayerControlView this$0>
	//   84  208:invokestatic    #30  <Method Player PlayerControlView.access$700(PlayerControlView)>
	//   85  211:iconst_1        
	//   86  212:invokeinterface #92  <Method boolean ControlDispatcher.dispatchSetPlayWhenReady(Player, boolean)>
	//   87  217:pop             
			} else
	//*  88  218:goto            357
			if(PlayerControlView.access$2600(PlayerControlView.this) == view)
	//*  89  221:aload_0         
	//*  90  222:getfield        #17  <Field PlayerControlView this$0>
	//*  91  225:invokestatic    #95  <Method View PlayerControlView.access$2600(PlayerControlView)>
	//*  92  228:aload_1         
	//*  93  229:if_acmpne       256
				PlayerControlView.access$2500(PlayerControlView.this).dispatchSetPlayWhenReady(PlayerControlView.access$700(PlayerControlView.this), false);
	//   94  232:aload_0         
	//   95  233:getfield        #17  <Field PlayerControlView this$0>
	//   96  236:invokestatic    #77  <Method ControlDispatcher PlayerControlView.access$2500(PlayerControlView)>
	//   97  239:aload_0         
	//   98  240:getfield        #17  <Field PlayerControlView this$0>
	//   99  243:invokestatic    #30  <Method Player PlayerControlView.access$700(PlayerControlView)>
	//  100  246:iconst_0        
	//  101  247:invokeinterface #92  <Method boolean ControlDispatcher.dispatchSetPlayWhenReady(Player, boolean)>
	//  102  252:pop             
			else
	//* 103  253:goto            357
			if(PlayerControlView.access$2700(PlayerControlView.this) == view)
	//* 104  256:aload_0         
	//* 105  257:getfield        #17  <Field PlayerControlView this$0>
	//* 106  260:invokestatic    #99  <Method android.widget.ImageView PlayerControlView.access$2700(PlayerControlView)>
	//* 107  263:aload_1         
	//* 108  264:if_acmpne       312
				PlayerControlView.access$2500(PlayerControlView.this).dispatchSetRepeatMode(PlayerControlView.access$700(PlayerControlView.this), RepeatModeUtil.getNextRepeatMode(PlayerControlView.access$700(PlayerControlView.this).getRepeatMode(), PlayerControlView.access$2800(PlayerControlView.this)));
	//  109  267:aload_0         
	//  110  268:getfield        #17  <Field PlayerControlView this$0>
	//  111  271:invokestatic    #77  <Method ControlDispatcher PlayerControlView.access$2500(PlayerControlView)>
	//  112  274:aload_0         
	//  113  275:getfield        #17  <Field PlayerControlView this$0>
	//  114  278:invokestatic    #30  <Method Player PlayerControlView.access$700(PlayerControlView)>
	//  115  281:aload_0         
	//  116  282:getfield        #17  <Field PlayerControlView this$0>
	//  117  285:invokestatic    #30  <Method Player PlayerControlView.access$700(PlayerControlView)>
	//  118  288:invokeinterface #102 <Method int Player.getRepeatMode()>
	//  119  293:aload_0         
	//  120  294:getfield        #17  <Field PlayerControlView this$0>
	//  121  297:invokestatic    #106 <Method int PlayerControlView.access$2800(PlayerControlView)>
	//  122  300:invokestatic    #112 <Method int RepeatModeUtil.getNextRepeatMode(int, int)>
	//  123  303:invokeinterface #116 <Method boolean ControlDispatcher.dispatchSetRepeatMode(Player, int)>
	//  124  308:pop             
			else
	//* 125  309:goto            357
			if(PlayerControlView.access$2900(PlayerControlView.this) == view)
	//* 126  312:aload_0         
	//* 127  313:getfield        #17  <Field PlayerControlView this$0>
	//* 128  316:invokestatic    #119 <Method View PlayerControlView.access$2900(PlayerControlView)>
	//* 129  319:aload_1         
	//* 130  320:if_acmpne       357
				PlayerControlView.access$2500(PlayerControlView.this).dispatchSetShuffleModeEnabled(PlayerControlView.access$700(PlayerControlView.this), true ^ PlayerControlView.access$700(PlayerControlView.this).getShuffleModeEnabled());
	//  131  323:aload_0         
	//  132  324:getfield        #17  <Field PlayerControlView this$0>
	//  133  327:invokestatic    #77  <Method ControlDispatcher PlayerControlView.access$2500(PlayerControlView)>
	//  134  330:aload_0         
	//  135  331:getfield        #17  <Field PlayerControlView this$0>
	//  136  334:invokestatic    #30  <Method Player PlayerControlView.access$700(PlayerControlView)>
	//  137  337:iconst_1        
	//  138  338:aload_0         
	//  139  339:getfield        #17  <Field PlayerControlView this$0>
	//  140  342:invokestatic    #30  <Method Player PlayerControlView.access$700(PlayerControlView)>
	//  141  345:invokeinterface #123 <Method boolean Player.getShuffleModeEnabled()>
	//  142  350:ixor            
	//  143  351:invokeinterface #126 <Method boolean ControlDispatcher.dispatchSetShuffleModeEnabled(Player, boolean)>
	//  144  356:pop             
		PlayerControlView.access$900(PlayerControlView.this);
	//  145  357:aload_0         
	//  146  358:getfield        #17  <Field PlayerControlView this$0>
	//  147  361:invokestatic    #129 <Method void PlayerControlView.access$900(PlayerControlView)>
	//  148  364:return          
	}

	public void onPlayerStateChanged(boolean flag, int i)
	{
		PlayerControlView.access$1000(PlayerControlView.this);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field PlayerControlView this$0>
	//    2    4:invokestatic    #134 <Method void PlayerControlView.access$1000(PlayerControlView)>
		PlayerControlView.access$000(PlayerControlView.this);
	//    3    7:aload_0         
	//    4    8:getfield        #17  <Field PlayerControlView this$0>
	//    5   11:invokestatic    #137 <Method void PlayerControlView.access$000(PlayerControlView)>
	//    6   14:return          
	}

	public void onPositionDiscontinuity(int i)
	{
		PlayerControlView.access$1200(PlayerControlView.this);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field PlayerControlView this$0>
	//    2    4:invokestatic    #142 <Method void PlayerControlView.access$1200(PlayerControlView)>
		PlayerControlView.access$000(PlayerControlView.this);
	//    3    7:aload_0         
	//    4    8:getfield        #17  <Field PlayerControlView this$0>
	//    5   11:invokestatic    #137 <Method void PlayerControlView.access$000(PlayerControlView)>
	//    6   14:return          
	}

	public void onRepeatModeChanged(int i)
	{
		PlayerControlView.access$1100(PlayerControlView.this);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field PlayerControlView this$0>
	//    2    4:invokestatic    #146 <Method void PlayerControlView.access$1100(PlayerControlView)>
		PlayerControlView.access$1200(PlayerControlView.this);
	//    3    7:aload_0         
	//    4    8:getfield        #17  <Field PlayerControlView this$0>
	//    5   11:invokestatic    #142 <Method void PlayerControlView.access$1200(PlayerControlView)>
	//    6   14:return          
	}

	public void onScrubMove(TimeBar timebar, long l)
	{
		if(PlayerControlView.access$400(PlayerControlView.this) != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #17  <Field PlayerControlView this$0>
	//*   2    4:invokestatic    #152 <Method TextView PlayerControlView.access$400(PlayerControlView)>
	//*   3    7:ifnull          38
			PlayerControlView.access$400(PlayerControlView.this).setText(((CharSequence) (Util.getStringForTime(PlayerControlView.access$500(PlayerControlView.this), PlayerControlView.access$600(PlayerControlView.this), l))));
	//    4   10:aload_0         
	//    5   11:getfield        #17  <Field PlayerControlView this$0>
	//    6   14:invokestatic    #152 <Method TextView PlayerControlView.access$400(PlayerControlView)>
	//    7   17:aload_0         
	//    8   18:getfield        #17  <Field PlayerControlView this$0>
	//    9   21:invokestatic    #156 <Method StringBuilder PlayerControlView.access$500(PlayerControlView)>
	//   10   24:aload_0         
	//   11   25:getfield        #17  <Field PlayerControlView this$0>
	//   12   28:invokestatic    #160 <Method java.util.Formatter PlayerControlView.access$600(PlayerControlView)>
	//   13   31:lload_2         
	//   14   32:invokestatic    #166 <Method String Util.getStringForTime(StringBuilder, java.util.Formatter, long)>
	//   15   35:invokevirtual   #172 <Method void TextView.setText(CharSequence)>
	//   16   38:return          
	}

	public void onScrubStart(TimeBar timebar, long l)
	{
		removeCallbacks(PlayerControlView.access$200(PlayerControlView.this));
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field PlayerControlView this$0>
	//    2    4:aload_0         
	//    3    5:getfield        #17  <Field PlayerControlView this$0>
	//    4    8:invokestatic    #177 <Method Runnable PlayerControlView.access$200(PlayerControlView)>
	//    5   11:invokevirtual   #181 <Method boolean PlayerControlView.removeCallbacks(Runnable)>
	//    6   14:pop             
		PlayerControlView.access$302(PlayerControlView.this, true);
	//    7   15:aload_0         
	//    8   16:getfield        #17  <Field PlayerControlView this$0>
	//    9   19:iconst_1        
	//   10   20:invokestatic    #185 <Method boolean PlayerControlView.access$302(PlayerControlView, boolean)>
	//   11   23:pop             
	//   12   24:return          
	}

	public void onScrubStop(TimeBar timebar, long l, boolean flag)
	{
		PlayerControlView.access$302(PlayerControlView.this, false);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field PlayerControlView this$0>
	//    2    4:iconst_0        
	//    3    5:invokestatic    #185 <Method boolean PlayerControlView.access$302(PlayerControlView, boolean)>
	//    4    8:pop             
		if(!flag && PlayerControlView.access$700(PlayerControlView.this) != null)
	//*   5    9:iload           4
	//*   6   11:ifne            32
	//*   7   14:aload_0         
	//*   8   15:getfield        #17  <Field PlayerControlView this$0>
	//*   9   18:invokestatic    #30  <Method Player PlayerControlView.access$700(PlayerControlView)>
	//*  10   21:ifnull          32
			PlayerControlView.access$800(PlayerControlView.this, l);
	//   11   24:aload_0         
	//   12   25:getfield        #17  <Field PlayerControlView this$0>
	//   13   28:lload_2         
	//   14   29:invokestatic    #191 <Method void PlayerControlView.access$800(PlayerControlView, long)>
		PlayerControlView.access$900(PlayerControlView.this);
	//   15   32:aload_0         
	//   16   33:getfield        #17  <Field PlayerControlView this$0>
	//   17   36:invokestatic    #129 <Method void PlayerControlView.access$900(PlayerControlView)>
	//   18   39:return          
	}

	public void onShuffleModeEnabledChanged(boolean flag)
	{
		PlayerControlView.access$1300(PlayerControlView.this);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field PlayerControlView this$0>
	//    2    4:invokestatic    #196 <Method void PlayerControlView.access$1300(PlayerControlView)>
		PlayerControlView.access$1200(PlayerControlView.this);
	//    3    7:aload_0         
	//    4    8:getfield        #17  <Field PlayerControlView this$0>
	//    5   11:invokestatic    #142 <Method void PlayerControlView.access$1200(PlayerControlView)>
	//    6   14:return          
	}

	public void onTimelineChanged(Timeline timeline, Object obj, int i)
	{
		PlayerControlView.access$1200(PlayerControlView.this);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field PlayerControlView this$0>
	//    2    4:invokestatic    #142 <Method void PlayerControlView.access$1200(PlayerControlView)>
		PlayerControlView.access$1400(PlayerControlView.this);
	//    3    7:aload_0         
	//    4    8:getfield        #17  <Field PlayerControlView this$0>
	//    5   11:invokestatic    #202 <Method void PlayerControlView.access$1400(PlayerControlView)>
		PlayerControlView.access$000(PlayerControlView.this);
	//    6   14:aload_0         
	//    7   15:getfield        #17  <Field PlayerControlView this$0>
	//    8   18:invokestatic    #137 <Method void PlayerControlView.access$000(PlayerControlView)>
	//    9   21:return          
	}

	final PlayerControlView this$0;

	private PlayerControlView$ComponentListener()
	{
		this$0 = PlayerControlView.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field PlayerControlView this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void com.google.android.exoplayer2.Player$DefaultEventListener()>
	//    5    9:return          
	}

	PlayerControlView$ComponentListener(PlayerControlView._cls1 _pcls1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #24  <Method void PlayerControlView$ComponentListener(PlayerControlView)>
	//    3    5:return          
	}
}
