// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.ui;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.*;
import android.widget.*;
import com.google.android.exoplayer2.*;
import com.google.android.exoplayer2.util.*;
import java.util.*;

// Referenced classes of package com.google.android.exoplayer2.ui:
//			TimeBar

public class PlayerControlView extends FrameLayout
{
	private final class ComponentListener extends com.google.android.exoplayer2.Player.DefaultEventListener
		implements TimeBar.OnScrubListener, android.view.View.OnClickListener
	{

		public void onClick(View view)
		{
			if(player != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #17  <Field PlayerControlView this$0>
		//*   2    4:invokestatic    #30  <Method Player PlayerControlView.access$700(PlayerControlView)>
		//*   3    7:ifnull          357
				if(nextButton == view)
		//*   4   10:aload_0         
		//*   5   11:getfield        #17  <Field PlayerControlView this$0>
		//*   6   14:invokestatic    #34  <Method View PlayerControlView.access$1500(PlayerControlView)>
		//*   7   17:aload_1         
		//*   8   18:if_acmpne       31
					next();
		//    9   21:aload_0         
		//   10   22:getfield        #17  <Field PlayerControlView this$0>
		//   11   25:invokestatic    #37  <Method void PlayerControlView.access$1600(PlayerControlView)>
				else
		//*  12   28:goto            357
				if(previousButton == view)
		//*  13   31:aload_0         
		//*  14   32:getfield        #17  <Field PlayerControlView this$0>
		//*  15   35:invokestatic    #40  <Method View PlayerControlView.access$1700(PlayerControlView)>
		//*  16   38:aload_1         
		//*  17   39:if_acmpne       52
					previous();
		//   18   42:aload_0         
		//   19   43:getfield        #17  <Field PlayerControlView this$0>
		//   20   46:invokestatic    #43  <Method void PlayerControlView.access$1800(PlayerControlView)>
				else
		//*  21   49:goto            357
				if(fastForwardButton == view)
		//*  22   52:aload_0         
		//*  23   53:getfield        #17  <Field PlayerControlView this$0>
		//*  24   56:invokestatic    #46  <Method View PlayerControlView.access$1900(PlayerControlView)>
		//*  25   59:aload_1         
		//*  26   60:if_acmpne       73
					fastForward();
		//   27   63:aload_0         
		//   28   64:getfield        #17  <Field PlayerControlView this$0>
		//   29   67:invokestatic    #49  <Method void PlayerControlView.access$2000(PlayerControlView)>
				else
		//*  30   70:goto            357
				if(rewindButton == view)
		//*  31   73:aload_0         
		//*  32   74:getfield        #17  <Field PlayerControlView this$0>
		//*  33   77:invokestatic    #52  <Method View PlayerControlView.access$2100(PlayerControlView)>
		//*  34   80:aload_1         
		//*  35   81:if_acmpne       94
					rewind();
		//   36   84:aload_0         
		//   37   85:getfield        #17  <Field PlayerControlView this$0>
		//   38   88:invokestatic    #55  <Method void PlayerControlView.access$2200(PlayerControlView)>
				else
		//*  39   91:goto            357
				if(playButton == view)
		//*  40   94:aload_0         
		//*  41   95:getfield        #17  <Field PlayerControlView this$0>
		//*  42   98:invokestatic    #58  <Method View PlayerControlView.access$2300(PlayerControlView)>
		//*  43  101:aload_1         
		//*  44  102:if_acmpne       221
				{
					if(player.getPlaybackState() == 1)
		//*  45  105:aload_0         
		//*  46  106:getfield        #17  <Field PlayerControlView this$0>
		//*  47  109:invokestatic    #30  <Method Player PlayerControlView.access$700(PlayerControlView)>
		//*  48  112:invokeinterface #64  <Method int Player.getPlaybackState()>
		//*  49  117:iconst_1        
		//*  50  118:icmpne          146
					{
						if(playbackPreparer != null)
		//*  51  121:aload_0         
		//*  52  122:getfield        #17  <Field PlayerControlView this$0>
		//*  53  125:invokestatic    #68  <Method PlaybackPreparer PlayerControlView.access$2400(PlayerControlView)>
		//*  54  128:ifnull          197
							playbackPreparer.preparePlayback();
		//   55  131:aload_0         
		//   56  132:getfield        #17  <Field PlayerControlView this$0>
		//   57  135:invokestatic    #68  <Method PlaybackPreparer PlayerControlView.access$2400(PlayerControlView)>
		//   58  138:invokeinterface #73  <Method void PlaybackPreparer.preparePlayback()>
					} else
		//*  59  143:goto            197
					if(player.getPlaybackState() == 4)
		//*  60  146:aload_0         
		//*  61  147:getfield        #17  <Field PlayerControlView this$0>
		//*  62  150:invokestatic    #30  <Method Player PlayerControlView.access$700(PlayerControlView)>
		//*  63  153:invokeinterface #64  <Method int Player.getPlaybackState()>
		//*  64  158:iconst_4        
		//*  65  159:icmpne          197
						controlDispatcher.dispatchSeekTo(player, player.getCurrentWindowIndex(), 0x1L);
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
					controlDispatcher.dispatchSetPlayWhenReady(player, true);
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
				if(pauseButton == view)
		//*  89  221:aload_0         
		//*  90  222:getfield        #17  <Field PlayerControlView this$0>
		//*  91  225:invokestatic    #95  <Method View PlayerControlView.access$2600(PlayerControlView)>
		//*  92  228:aload_1         
		//*  93  229:if_acmpne       256
					controlDispatcher.dispatchSetPlayWhenReady(player, false);
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
				if(repeatToggleButton == view)
		//* 104  256:aload_0         
		//* 105  257:getfield        #17  <Field PlayerControlView this$0>
		//* 106  260:invokestatic    #99  <Method ImageView PlayerControlView.access$2700(PlayerControlView)>
		//* 107  263:aload_1         
		//* 108  264:if_acmpne       312
					controlDispatcher.dispatchSetRepeatMode(player, RepeatModeUtil.getNextRepeatMode(player.getRepeatMode(), repeatToggleModes));
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
				if(shuffleButton == view)
		//* 126  312:aload_0         
		//* 127  313:getfield        #17  <Field PlayerControlView this$0>
		//* 128  316:invokestatic    #119 <Method View PlayerControlView.access$2900(PlayerControlView)>
		//* 129  319:aload_1         
		//* 130  320:if_acmpne       357
					controlDispatcher.dispatchSetShuffleModeEnabled(player, true ^ player.getShuffleModeEnabled());
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
			hideAfterTimeout();
		//  145  357:aload_0         
		//  146  358:getfield        #17  <Field PlayerControlView this$0>
		//  147  361:invokestatic    #129 <Method void PlayerControlView.access$900(PlayerControlView)>
		//  148  364:return          
		}

		public void onPlayerStateChanged(boolean flag, int i)
		{
			updatePlayPauseButton();
		//    0    0:aload_0         
		//    1    1:getfield        #17  <Field PlayerControlView this$0>
		//    2    4:invokestatic    #134 <Method void PlayerControlView.access$1000(PlayerControlView)>
			updateProgress();
		//    3    7:aload_0         
		//    4    8:getfield        #17  <Field PlayerControlView this$0>
		//    5   11:invokestatic    #137 <Method void PlayerControlView.access$000(PlayerControlView)>
		//    6   14:return          
		}

		public void onPositionDiscontinuity(int i)
		{
			updateNavigation();
		//    0    0:aload_0         
		//    1    1:getfield        #17  <Field PlayerControlView this$0>
		//    2    4:invokestatic    #142 <Method void PlayerControlView.access$1200(PlayerControlView)>
			updateProgress();
		//    3    7:aload_0         
		//    4    8:getfield        #17  <Field PlayerControlView this$0>
		//    5   11:invokestatic    #137 <Method void PlayerControlView.access$000(PlayerControlView)>
		//    6   14:return          
		}

		public void onRepeatModeChanged(int i)
		{
			updateRepeatModeButton();
		//    0    0:aload_0         
		//    1    1:getfield        #17  <Field PlayerControlView this$0>
		//    2    4:invokestatic    #146 <Method void PlayerControlView.access$1100(PlayerControlView)>
			updateNavigation();
		//    3    7:aload_0         
		//    4    8:getfield        #17  <Field PlayerControlView this$0>
		//    5   11:invokestatic    #142 <Method void PlayerControlView.access$1200(PlayerControlView)>
		//    6   14:return          
		}

		public void onScrubMove(TimeBar timebar, long l)
		{
			if(positionView != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #17  <Field PlayerControlView this$0>
		//*   2    4:invokestatic    #152 <Method TextView PlayerControlView.access$400(PlayerControlView)>
		//*   3    7:ifnull          38
				positionView.setText(((CharSequence) (Util.getStringForTime(formatBuilder, formatter, l))));
		//    4   10:aload_0         
		//    5   11:getfield        #17  <Field PlayerControlView this$0>
		//    6   14:invokestatic    #152 <Method TextView PlayerControlView.access$400(PlayerControlView)>
		//    7   17:aload_0         
		//    8   18:getfield        #17  <Field PlayerControlView this$0>
		//    9   21:invokestatic    #156 <Method StringBuilder PlayerControlView.access$500(PlayerControlView)>
		//   10   24:aload_0         
		//   11   25:getfield        #17  <Field PlayerControlView this$0>
		//   12   28:invokestatic    #160 <Method Formatter PlayerControlView.access$600(PlayerControlView)>
		//   13   31:lload_2         
		//   14   32:invokestatic    #166 <Method String Util.getStringForTime(StringBuilder, Formatter, long)>
		//   15   35:invokevirtual   #172 <Method void TextView.setText(CharSequence)>
		//   16   38:return          
		}

		public void onScrubStart(TimeBar timebar, long l)
		{
			removeCallbacks(hideAction);
		//    0    0:aload_0         
		//    1    1:getfield        #17  <Field PlayerControlView this$0>
		//    2    4:aload_0         
		//    3    5:getfield        #17  <Field PlayerControlView this$0>
		//    4    8:invokestatic    #177 <Method Runnable PlayerControlView.access$200(PlayerControlView)>
		//    5   11:invokevirtual   #181 <Method boolean PlayerControlView.removeCallbacks(Runnable)>
		//    6   14:pop             
			scrubbing = true;
		//    7   15:aload_0         
		//    8   16:getfield        #17  <Field PlayerControlView this$0>
		//    9   19:iconst_1        
		//   10   20:invokestatic    #185 <Method boolean PlayerControlView.access$302(PlayerControlView, boolean)>
		//   11   23:pop             
		//   12   24:return          
		}

		public void onScrubStop(TimeBar timebar, long l, boolean flag)
		{
			scrubbing = false;
		//    0    0:aload_0         
		//    1    1:getfield        #17  <Field PlayerControlView this$0>
		//    2    4:iconst_0        
		//    3    5:invokestatic    #185 <Method boolean PlayerControlView.access$302(PlayerControlView, boolean)>
		//    4    8:pop             
			if(!flag && player != null)
		//*   5    9:iload           4
		//*   6   11:ifne            32
		//*   7   14:aload_0         
		//*   8   15:getfield        #17  <Field PlayerControlView this$0>
		//*   9   18:invokestatic    #30  <Method Player PlayerControlView.access$700(PlayerControlView)>
		//*  10   21:ifnull          32
				seekToTimeBarPosition(l);
		//   11   24:aload_0         
		//   12   25:getfield        #17  <Field PlayerControlView this$0>
		//   13   28:lload_2         
		//   14   29:invokestatic    #191 <Method void PlayerControlView.access$800(PlayerControlView, long)>
			hideAfterTimeout();
		//   15   32:aload_0         
		//   16   33:getfield        #17  <Field PlayerControlView this$0>
		//   17   36:invokestatic    #129 <Method void PlayerControlView.access$900(PlayerControlView)>
		//   18   39:return          
		}

		public void onShuffleModeEnabledChanged(boolean flag)
		{
			updateShuffleButton();
		//    0    0:aload_0         
		//    1    1:getfield        #17  <Field PlayerControlView this$0>
		//    2    4:invokestatic    #196 <Method void PlayerControlView.access$1300(PlayerControlView)>
			updateNavigation();
		//    3    7:aload_0         
		//    4    8:getfield        #17  <Field PlayerControlView this$0>
		//    5   11:invokestatic    #142 <Method void PlayerControlView.access$1200(PlayerControlView)>
		//    6   14:return          
		}

		public void onTimelineChanged(Timeline timeline, Object obj, int i)
		{
			updateNavigation();
		//    0    0:aload_0         
		//    1    1:getfield        #17  <Field PlayerControlView this$0>
		//    2    4:invokestatic    #142 <Method void PlayerControlView.access$1200(PlayerControlView)>
			updateTimeBarMode();
		//    3    7:aload_0         
		//    4    8:getfield        #17  <Field PlayerControlView this$0>
		//    5   11:invokestatic    #202 <Method void PlayerControlView.access$1400(PlayerControlView)>
			updateProgress();
		//    6   14:aload_0         
		//    7   15:getfield        #17  <Field PlayerControlView this$0>
		//    8   18:invokestatic    #137 <Method void PlayerControlView.access$000(PlayerControlView)>
		//    9   21:return          
		}

		final PlayerControlView this$0;

		private ComponentListener()
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

	}

	public static interface VisibilityListener
	{

		public abstract void onVisibilityChange(int i);
	}


	public PlayerControlView(Context context)
	{
		this(context, ((AttributeSet) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #106 <Method void PlayerControlView(Context, AttributeSet)>
	//    4    6:return          
	}

	public PlayerControlView(Context context, AttributeSet attributeset)
	{
		this(context, attributeset, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iconst_0        
	//    4    4:invokespecial   #109 <Method void PlayerControlView(Context, AttributeSet, int)>
	//    5    7:return          
	}

	public PlayerControlView(Context context, AttributeSet attributeset, int i)
	{
		this(context, attributeset, i, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:aload_2         
	//    5    5:invokespecial   #112 <Method void PlayerControlView(Context, AttributeSet, int, AttributeSet)>
	//    6    8:return          
	}

	public PlayerControlView(Context context, AttributeSet attributeset, int i, AttributeSet attributeset1)
	{
		int j;
		super(context, attributeset, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #113 <Method void FrameLayout(Context, AttributeSet, int)>
		updateProgressAction = new Runnable() {

			public void run()
			{
				updateProgress();
			//    0    0:aload_0         
			//    1    1:getfield        #14  <Field PlayerControlView this$0>
			//    2    4:invokestatic    #22  <Method void PlayerControlView.access$000(PlayerControlView)>
			//    3    7:return          
			}

			final PlayerControlView this$0;

			
			{
				this$0 = PlayerControlView.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field PlayerControlView this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #17  <Method void Object()>
			//    5    9:return          
			}
		}
;
	//    5    7:aload_0         
	//    6    8:new             #6   <Class PlayerControlView$1>
	//    7   11:dup             
	//    8   12:aload_0         
	//    9   13:invokespecial   #116 <Method void PlayerControlView$1(PlayerControlView)>
	//   10   16:putfield        #118 <Field Runnable updateProgressAction>
		hideAction = new Runnable() {

			public void run()
			{
				hide();
			//    0    0:aload_0         
			//    1    1:getfield        #14  <Field PlayerControlView this$0>
			//    2    4:invokevirtual   #22  <Method void PlayerControlView.hide()>
			//    3    7:return          
			}

			final PlayerControlView this$0;

			
			{
				this$0 = PlayerControlView.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field PlayerControlView this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #17  <Method void Object()>
			//    5    9:return          
			}
		}
;
	//   11   19:aload_0         
	//   12   20:new             #8   <Class PlayerControlView$2>
	//   13   23:dup             
	//   14   24:aload_0         
	//   15   25:invokespecial   #119 <Method void PlayerControlView$2(PlayerControlView)>
	//   16   28:putfield        #121 <Field Runnable hideAction>
		j = R.layout.exo_player_control_view;
	//   17   31:getstatic       #126 <Field int R$layout.exo_player_control_view>
	//   18   34:istore          5
		rewindMs = 5000;
	//   19   36:aload_0         
	//   20   37:sipush          5000
	//   21   40:putfield        #128 <Field int rewindMs>
		fastForwardMs = 15000;
	//   22   43:aload_0         
	//   23   44:sipush          15000
	//   24   47:putfield        #130 <Field int fastForwardMs>
		showTimeoutMs = 5000;
	//   25   50:aload_0         
	//   26   51:sipush          5000
	//   27   54:putfield        #132 <Field int showTimeoutMs>
		repeatToggleModes = 0;
	//   28   57:aload_0         
	//   29   58:iconst_0        
	//   30   59:putfield        #134 <Field int repeatToggleModes>
		hideAtMs = 0x1L;
	//   31   62:aload_0         
	//   32   63:ldc2w           #135 <Long 0x1L>
	//   33   66:putfield        #138 <Field long hideAtMs>
		showShuffleButton = false;
	//   34   69:aload_0         
	//   35   70:iconst_0        
	//   36   71:putfield        #140 <Field boolean showShuffleButton>
		i = j;
	//   37   74:iload           5
	//   38   76:istore_3        
		if(attributeset1 == null)
			break MISSING_BLOCK_LABEL_193;
	//   39   77:aload           4
	//   40   79:ifnull          193
		attributeset = ((AttributeSet) (context.getTheme().obtainStyledAttributes(attributeset1, R.styleable.PlayerControlView, 0, 0)));
	//   41   82:aload_1         
	//   42   83:invokevirtual   #146 <Method android.content.res.Resources$Theme Context.getTheme()>
	//   43   86:aload           4
	//   44   88:getstatic       #152 <Field int[] R$styleable.PlayerControlView>
	//   45   91:iconst_0        
	//   46   92:iconst_0        
	//   47   93:invokevirtual   #158 <Method TypedArray android.content.res.Resources$Theme.obtainStyledAttributes(AttributeSet, int[], int, int)>
	//   48   96:astore_2        
		rewindMs = ((TypedArray) (attributeset)).getInt(R.styleable.PlayerControlView_rewind_increment, rewindMs);
	//   49   97:aload_0         
	//   50   98:aload_2         
	//   51   99:getstatic       #161 <Field int R$styleable.PlayerControlView_rewind_increment>
	//   52  102:aload_0         
	//   53  103:getfield        #128 <Field int rewindMs>
	//   54  106:invokevirtual   #167 <Method int TypedArray.getInt(int, int)>
	//   55  109:putfield        #128 <Field int rewindMs>
		fastForwardMs = ((TypedArray) (attributeset)).getInt(R.styleable.PlayerControlView_fastforward_increment, fastForwardMs);
	//   56  112:aload_0         
	//   57  113:aload_2         
	//   58  114:getstatic       #170 <Field int R$styleable.PlayerControlView_fastforward_increment>
	//   59  117:aload_0         
	//   60  118:getfield        #130 <Field int fastForwardMs>
	//   61  121:invokevirtual   #167 <Method int TypedArray.getInt(int, int)>
	//   62  124:putfield        #130 <Field int fastForwardMs>
		showTimeoutMs = ((TypedArray) (attributeset)).getInt(R.styleable.PlayerControlView_show_timeout, showTimeoutMs);
	//   63  127:aload_0         
	//   64  128:aload_2         
	//   65  129:getstatic       #173 <Field int R$styleable.PlayerControlView_show_timeout>
	//   66  132:aload_0         
	//   67  133:getfield        #132 <Field int showTimeoutMs>
	//   68  136:invokevirtual   #167 <Method int TypedArray.getInt(int, int)>
	//   69  139:putfield        #132 <Field int showTimeoutMs>
		i = ((TypedArray) (attributeset)).getResourceId(R.styleable.PlayerControlView_controller_layout_id, j);
	//   70  142:aload_2         
	//   71  143:getstatic       #176 <Field int R$styleable.PlayerControlView_controller_layout_id>
	//   72  146:iload           5
	//   73  148:invokevirtual   #179 <Method int TypedArray.getResourceId(int, int)>
	//   74  151:istore_3        
		repeatToggleModes = getRepeatToggleModes(((TypedArray) (attributeset)), repeatToggleModes);
	//   75  152:aload_0         
	//   76  153:aload_2         
	//   77  154:aload_0         
	//   78  155:getfield        #134 <Field int repeatToggleModes>
	//   79  158:invokestatic    #183 <Method int getRepeatToggleModes(TypedArray, int)>
	//   80  161:putfield        #134 <Field int repeatToggleModes>
		showShuffleButton = ((TypedArray) (attributeset)).getBoolean(R.styleable.PlayerControlView_show_shuffle_button, showShuffleButton);
	//   81  164:aload_0         
	//   82  165:aload_2         
	//   83  166:getstatic       #186 <Field int R$styleable.PlayerControlView_show_shuffle_button>
	//   84  169:aload_0         
	//   85  170:getfield        #140 <Field boolean showShuffleButton>
	//   86  173:invokevirtual   #190 <Method boolean TypedArray.getBoolean(int, boolean)>
	//   87  176:putfield        #140 <Field boolean showShuffleButton>
		((TypedArray) (attributeset)).recycle();
	//   88  179:aload_2         
	//   89  180:invokevirtual   #193 <Method void TypedArray.recycle()>
		break MISSING_BLOCK_LABEL_193;
	//   90  183:goto            193
		context;
	//   91  186:astore_1        
		((TypedArray) (attributeset)).recycle();
	//   92  187:aload_2         
	//   93  188:invokevirtual   #193 <Method void TypedArray.recycle()>
		throw context;
	//   94  191:aload_1         
	//   95  192:athrow          
		period = new com.google.android.exoplayer2.Timeline.Period();
	//   96  193:aload_0         
	//   97  194:new             #195 <Class com.google.android.exoplayer2.Timeline$Period>
	//   98  197:dup             
	//   99  198:invokespecial   #197 <Method void com.google.android.exoplayer2.Timeline$Period()>
	//  100  201:putfield        #199 <Field com.google.android.exoplayer2.Timeline$Period period>
		window = new com.google.android.exoplayer2.Timeline.Window();
	//  101  204:aload_0         
	//  102  205:new             #201 <Class com.google.android.exoplayer2.Timeline$Window>
	//  103  208:dup             
	//  104  209:invokespecial   #202 <Method void com.google.android.exoplayer2.Timeline$Window()>
	//  105  212:putfield        #204 <Field com.google.android.exoplayer2.Timeline$Window window>
		formatBuilder = new StringBuilder();
	//  106  215:aload_0         
	//  107  216:new             #206 <Class StringBuilder>
	//  108  219:dup             
	//  109  220:invokespecial   #207 <Method void StringBuilder()>
	//  110  223:putfield        #209 <Field StringBuilder formatBuilder>
		formatter = new Formatter(((Appendable) (formatBuilder)), Locale.getDefault());
	//  111  226:aload_0         
	//  112  227:new             #211 <Class Formatter>
	//  113  230:dup             
	//  114  231:aload_0         
	//  115  232:getfield        #209 <Field StringBuilder formatBuilder>
	//  116  235:invokestatic    #217 <Method Locale Locale.getDefault()>
	//  117  238:invokespecial   #220 <Method void Formatter(Appendable, Locale)>
	//  118  241:putfield        #222 <Field Formatter formatter>
		adGroupTimesMs = new long[0];
	//  119  244:aload_0         
	//  120  245:iconst_0        
	//  121  246:newarray        long[]
	//  122  248:putfield        #224 <Field long[] adGroupTimesMs>
		playedAdGroups = new boolean[0];
	//  123  251:aload_0         
	//  124  252:iconst_0        
	//  125  253:newarray        boolean[]
	//  126  255:putfield        #226 <Field boolean[] playedAdGroups>
		extraAdGroupTimesMs = new long[0];
	//  127  258:aload_0         
	//  128  259:iconst_0        
	//  129  260:newarray        long[]
	//  130  262:putfield        #228 <Field long[] extraAdGroupTimesMs>
		extraPlayedAdGroups = new boolean[0];
	//  131  265:aload_0         
	//  132  266:iconst_0        
	//  133  267:newarray        boolean[]
	//  134  269:putfield        #230 <Field boolean[] extraPlayedAdGroups>
		componentListener = new ComponentListener();
	//  135  272:aload_0         
	//  136  273:new             #10  <Class PlayerControlView$ComponentListener>
	//  137  276:dup             
	//  138  277:aload_0         
	//  139  278:aconst_null     
	//  140  279:invokespecial   #233 <Method void PlayerControlView$ComponentListener(PlayerControlView, PlayerControlView$1)>
	//  141  282:putfield        #235 <Field PlayerControlView$ComponentListener componentListener>
		controlDispatcher = ((ControlDispatcher) (new DefaultControlDispatcher()));
	//  142  285:aload_0         
	//  143  286:new             #237 <Class DefaultControlDispatcher>
	//  144  289:dup             
	//  145  290:invokespecial   #238 <Method void DefaultControlDispatcher()>
	//  146  293:putfield        #240 <Field ControlDispatcher controlDispatcher>
		LayoutInflater.from(context).inflate(i, ((android.view.ViewGroup) (this)));
	//  147  296:aload_1         
	//  148  297:invokestatic    #246 <Method LayoutInflater LayoutInflater.from(Context)>
	//  149  300:iload_3         
	//  150  301:aload_0         
	//  151  302:invokevirtual   #250 <Method View LayoutInflater.inflate(int, android.view.ViewGroup)>
	//  152  305:pop             
		setDescendantFocusability(0x40000);
	//  153  306:aload_0         
	//  154  307:ldc1            #251 <Int 0x40000>
	//  155  309:invokevirtual   #255 <Method void setDescendantFocusability(int)>
		durationView = (TextView)findViewById(R.id.exo_duration);
	//  156  312:aload_0         
	//  157  313:aload_0         
	//  158  314:getstatic       #260 <Field int R$id.exo_duration>
	//  159  317:invokevirtual   #264 <Method View findViewById(int)>
	//  160  320:checkcast       #266 <Class TextView>
	//  161  323:putfield        #268 <Field TextView durationView>
		positionView = (TextView)findViewById(R.id.exo_position);
	//  162  326:aload_0         
	//  163  327:aload_0         
	//  164  328:getstatic       #271 <Field int R$id.exo_position>
	//  165  331:invokevirtual   #264 <Method View findViewById(int)>
	//  166  334:checkcast       #266 <Class TextView>
	//  167  337:putfield        #273 <Field TextView positionView>
		timeBar = (TimeBar)findViewById(R.id.exo_progress);
	//  168  340:aload_0         
	//  169  341:aload_0         
	//  170  342:getstatic       #276 <Field int R$id.exo_progress>
	//  171  345:invokevirtual   #264 <Method View findViewById(int)>
	//  172  348:checkcast       #278 <Class TimeBar>
	//  173  351:putfield        #280 <Field TimeBar timeBar>
		if(timeBar != null)
	//* 174  354:aload_0         
	//* 175  355:getfield        #280 <Field TimeBar timeBar>
	//* 176  358:ifnull          374
			timeBar.addListener(((TimeBar.OnScrubListener) (componentListener)));
	//  177  361:aload_0         
	//  178  362:getfield        #280 <Field TimeBar timeBar>
	//  179  365:aload_0         
	//  180  366:getfield        #235 <Field PlayerControlView$ComponentListener componentListener>
	//  181  369:invokeinterface #284 <Method void TimeBar.addListener(TimeBar$OnScrubListener)>
		playButton = findViewById(R.id.exo_play);
	//  182  374:aload_0         
	//  183  375:aload_0         
	//  184  376:getstatic       #287 <Field int R$id.exo_play>
	//  185  379:invokevirtual   #264 <Method View findViewById(int)>
	//  186  382:putfield        #289 <Field View playButton>
		if(playButton != null)
	//* 187  385:aload_0         
	//* 188  386:getfield        #289 <Field View playButton>
	//* 189  389:ifnull          403
			playButton.setOnClickListener(((android.view.View.OnClickListener) (componentListener)));
	//  190  392:aload_0         
	//  191  393:getfield        #289 <Field View playButton>
	//  192  396:aload_0         
	//  193  397:getfield        #235 <Field PlayerControlView$ComponentListener componentListener>
	//  194  400:invokevirtual   #295 <Method void View.setOnClickListener(android.view.View$OnClickListener)>
		pauseButton = findViewById(R.id.exo_pause);
	//  195  403:aload_0         
	//  196  404:aload_0         
	//  197  405:getstatic       #298 <Field int R$id.exo_pause>
	//  198  408:invokevirtual   #264 <Method View findViewById(int)>
	//  199  411:putfield        #300 <Field View pauseButton>
		if(pauseButton != null)
	//* 200  414:aload_0         
	//* 201  415:getfield        #300 <Field View pauseButton>
	//* 202  418:ifnull          432
			pauseButton.setOnClickListener(((android.view.View.OnClickListener) (componentListener)));
	//  203  421:aload_0         
	//  204  422:getfield        #300 <Field View pauseButton>
	//  205  425:aload_0         
	//  206  426:getfield        #235 <Field PlayerControlView$ComponentListener componentListener>
	//  207  429:invokevirtual   #295 <Method void View.setOnClickListener(android.view.View$OnClickListener)>
		previousButton = findViewById(R.id.exo_prev);
	//  208  432:aload_0         
	//  209  433:aload_0         
	//  210  434:getstatic       #303 <Field int R$id.exo_prev>
	//  211  437:invokevirtual   #264 <Method View findViewById(int)>
	//  212  440:putfield        #305 <Field View previousButton>
		if(previousButton != null)
	//* 213  443:aload_0         
	//* 214  444:getfield        #305 <Field View previousButton>
	//* 215  447:ifnull          461
			previousButton.setOnClickListener(((android.view.View.OnClickListener) (componentListener)));
	//  216  450:aload_0         
	//  217  451:getfield        #305 <Field View previousButton>
	//  218  454:aload_0         
	//  219  455:getfield        #235 <Field PlayerControlView$ComponentListener componentListener>
	//  220  458:invokevirtual   #295 <Method void View.setOnClickListener(android.view.View$OnClickListener)>
		nextButton = findViewById(R.id.exo_next);
	//  221  461:aload_0         
	//  222  462:aload_0         
	//  223  463:getstatic       #308 <Field int R$id.exo_next>
	//  224  466:invokevirtual   #264 <Method View findViewById(int)>
	//  225  469:putfield        #310 <Field View nextButton>
		if(nextButton != null)
	//* 226  472:aload_0         
	//* 227  473:getfield        #310 <Field View nextButton>
	//* 228  476:ifnull          490
			nextButton.setOnClickListener(((android.view.View.OnClickListener) (componentListener)));
	//  229  479:aload_0         
	//  230  480:getfield        #310 <Field View nextButton>
	//  231  483:aload_0         
	//  232  484:getfield        #235 <Field PlayerControlView$ComponentListener componentListener>
	//  233  487:invokevirtual   #295 <Method void View.setOnClickListener(android.view.View$OnClickListener)>
		rewindButton = findViewById(R.id.exo_rew);
	//  234  490:aload_0         
	//  235  491:aload_0         
	//  236  492:getstatic       #313 <Field int R$id.exo_rew>
	//  237  495:invokevirtual   #264 <Method View findViewById(int)>
	//  238  498:putfield        #315 <Field View rewindButton>
		if(rewindButton != null)
	//* 239  501:aload_0         
	//* 240  502:getfield        #315 <Field View rewindButton>
	//* 241  505:ifnull          519
			rewindButton.setOnClickListener(((android.view.View.OnClickListener) (componentListener)));
	//  242  508:aload_0         
	//  243  509:getfield        #315 <Field View rewindButton>
	//  244  512:aload_0         
	//  245  513:getfield        #235 <Field PlayerControlView$ComponentListener componentListener>
	//  246  516:invokevirtual   #295 <Method void View.setOnClickListener(android.view.View$OnClickListener)>
		fastForwardButton = findViewById(R.id.exo_ffwd);
	//  247  519:aload_0         
	//  248  520:aload_0         
	//  249  521:getstatic       #318 <Field int R$id.exo_ffwd>
	//  250  524:invokevirtual   #264 <Method View findViewById(int)>
	//  251  527:putfield        #320 <Field View fastForwardButton>
		if(fastForwardButton != null)
	//* 252  530:aload_0         
	//* 253  531:getfield        #320 <Field View fastForwardButton>
	//* 254  534:ifnull          548
			fastForwardButton.setOnClickListener(((android.view.View.OnClickListener) (componentListener)));
	//  255  537:aload_0         
	//  256  538:getfield        #320 <Field View fastForwardButton>
	//  257  541:aload_0         
	//  258  542:getfield        #235 <Field PlayerControlView$ComponentListener componentListener>
	//  259  545:invokevirtual   #295 <Method void View.setOnClickListener(android.view.View$OnClickListener)>
		repeatToggleButton = (ImageView)findViewById(R.id.exo_repeat_toggle);
	//  260  548:aload_0         
	//  261  549:aload_0         
	//  262  550:getstatic       #323 <Field int R$id.exo_repeat_toggle>
	//  263  553:invokevirtual   #264 <Method View findViewById(int)>
	//  264  556:checkcast       #325 <Class ImageView>
	//  265  559:putfield        #327 <Field ImageView repeatToggleButton>
		if(repeatToggleButton != null)
	//* 266  562:aload_0         
	//* 267  563:getfield        #327 <Field ImageView repeatToggleButton>
	//* 268  566:ifnull          580
			repeatToggleButton.setOnClickListener(((android.view.View.OnClickListener) (componentListener)));
	//  269  569:aload_0         
	//  270  570:getfield        #327 <Field ImageView repeatToggleButton>
	//  271  573:aload_0         
	//  272  574:getfield        #235 <Field PlayerControlView$ComponentListener componentListener>
	//  273  577:invokevirtual   #328 <Method void ImageView.setOnClickListener(android.view.View$OnClickListener)>
		shuffleButton = findViewById(R.id.exo_shuffle);
	//  274  580:aload_0         
	//  275  581:aload_0         
	//  276  582:getstatic       #331 <Field int R$id.exo_shuffle>
	//  277  585:invokevirtual   #264 <Method View findViewById(int)>
	//  278  588:putfield        #333 <Field View shuffleButton>
		if(shuffleButton != null)
	//* 279  591:aload_0         
	//* 280  592:getfield        #333 <Field View shuffleButton>
	//* 281  595:ifnull          609
			shuffleButton.setOnClickListener(((android.view.View.OnClickListener) (componentListener)));
	//  282  598:aload_0         
	//  283  599:getfield        #333 <Field View shuffleButton>
	//  284  602:aload_0         
	//  285  603:getfield        #235 <Field PlayerControlView$ComponentListener componentListener>
	//  286  606:invokevirtual   #295 <Method void View.setOnClickListener(android.view.View$OnClickListener)>
		context = ((Context) (context.getResources()));
	//  287  609:aload_1         
	//  288  610:invokevirtual   #337 <Method Resources Context.getResources()>
	//  289  613:astore_1        
		repeatOffButtonDrawable = ((Resources) (context)).getDrawable(R.drawable.exo_controls_repeat_off);
	//  290  614:aload_0         
	//  291  615:aload_1         
	//  292  616:getstatic       #342 <Field int R$drawable.exo_controls_repeat_off>
	//  293  619:invokevirtual   #348 <Method Drawable Resources.getDrawable(int)>
	//  294  622:putfield        #350 <Field Drawable repeatOffButtonDrawable>
		repeatOneButtonDrawable = ((Resources) (context)).getDrawable(R.drawable.exo_controls_repeat_one);
	//  295  625:aload_0         
	//  296  626:aload_1         
	//  297  627:getstatic       #353 <Field int R$drawable.exo_controls_repeat_one>
	//  298  630:invokevirtual   #348 <Method Drawable Resources.getDrawable(int)>
	//  299  633:putfield        #355 <Field Drawable repeatOneButtonDrawable>
		repeatAllButtonDrawable = ((Resources) (context)).getDrawable(R.drawable.exo_controls_repeat_all);
	//  300  636:aload_0         
	//  301  637:aload_1         
	//  302  638:getstatic       #358 <Field int R$drawable.exo_controls_repeat_all>
	//  303  641:invokevirtual   #348 <Method Drawable Resources.getDrawable(int)>
	//  304  644:putfield        #360 <Field Drawable repeatAllButtonDrawable>
		repeatOffButtonContentDescription = ((Resources) (context)).getString(R.string.exo_controls_repeat_off_description);
	//  305  647:aload_0         
	//  306  648:aload_1         
	//  307  649:getstatic       #365 <Field int R$string.exo_controls_repeat_off_description>
	//  308  652:invokevirtual   #369 <Method String Resources.getString(int)>
	//  309  655:putfield        #371 <Field String repeatOffButtonContentDescription>
		repeatOneButtonContentDescription = ((Resources) (context)).getString(R.string.exo_controls_repeat_one_description);
	//  310  658:aload_0         
	//  311  659:aload_1         
	//  312  660:getstatic       #374 <Field int R$string.exo_controls_repeat_one_description>
	//  313  663:invokevirtual   #369 <Method String Resources.getString(int)>
	//  314  666:putfield        #376 <Field String repeatOneButtonContentDescription>
		repeatAllButtonContentDescription = ((Resources) (context)).getString(R.string.exo_controls_repeat_all_description);
	//  315  669:aload_0         
	//  316  670:aload_1         
	//  317  671:getstatic       #379 <Field int R$string.exo_controls_repeat_all_description>
	//  318  674:invokevirtual   #369 <Method String Resources.getString(int)>
	//  319  677:putfield        #381 <Field String repeatAllButtonContentDescription>
		return;
	//  320  680:return          
	}

	private static boolean canShowMultiWindowTimeBar(Timeline timeline, com.google.android.exoplayer2.Timeline.Window window1)
	{
		if(timeline.getWindowCount() > 100)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #473 <Method int Timeline.getWindowCount()>
	//*   2    4:bipush          100
	//*   3    6:icmple          11
			return false;
	//    4    9:iconst_0        
	//    5   10:ireturn         
		int j = timeline.getWindowCount();
	//    6   11:aload_0         
	//    7   12:invokevirtual   #473 <Method int Timeline.getWindowCount()>
	//    8   15:istore_3        
		for(int i = 0; i < j; i++)
	//*   9   16:iconst_0        
	//*  10   17:istore_2        
	//*  11   18:iload_2         
	//*  12   19:iload_3         
	//*  13   20:icmpge          48
			if(timeline.getWindow(i, window1).durationUs == 0x1L)
	//*  14   23:aload_0         
	//*  15   24:iload_2         
	//*  16   25:aload_1         
	//*  17   26:invokevirtual   #477 <Method com.google.android.exoplayer2.Timeline$Window Timeline.getWindow(int, com.google.android.exoplayer2.Timeline$Window)>
	//*  18   29:getfield        #480 <Field long com.google.android.exoplayer2.Timeline$Window.durationUs>
	//*  19   32:ldc2w           #135 <Long 0x1L>
	//*  20   35:lcmp            
	//*  21   36:ifne            41
				return false;
	//   22   39:iconst_0        
	//   23   40:ireturn         

	//   24   41:iload_2         
	//   25   42:iconst_1        
	//   26   43:iadd            
	//   27   44:istore_2        
	//*  28   45:goto            18
		return true;
	//   29   48:iconst_1        
	//   30   49:ireturn         
	}

	private void fastForward()
	{
		if(fastForwardMs <= 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #130 <Field int fastForwardMs>
	//*   2    4:ifgt            8
			return;
	//    3    7:return          
		long l2 = player.getDuration();
	//    4    8:aload_0         
	//    5    9:getfield        #455 <Field Player player>
	//    6   12:invokeinterface #486 <Method long Player.getDuration()>
	//    7   17:lstore          5
		long l1 = player.getCurrentPosition() + (long)fastForwardMs;
	//    8   19:aload_0         
	//    9   20:getfield        #455 <Field Player player>
	//   10   23:invokeinterface #489 <Method long Player.getCurrentPosition()>
	//   11   28:aload_0         
	//   12   29:getfield        #130 <Field int fastForwardMs>
	//   13   32:i2l             
	//   14   33:ladd            
	//   15   34:lstore_3        
		long l = l1;
	//   16   35:lload_3         
	//   17   36:lstore_1        
		if(l2 != 0x1L)
	//*  18   37:lload           5
	//*  19   39:ldc2w           #135 <Long 0x1L>
	//*  20   42:lcmp            
	//*  21   43:ifeq            53
			l = Math.min(l1, l2);
	//   22   46:lload_3         
	//   23   47:lload           5
	//   24   49:invokestatic    #495 <Method long Math.min(long, long)>
	//   25   52:lstore_1        
		seekTo(l);
	//   26   53:aload_0         
	//   27   54:lload_1         
	//   28   55:invokespecial   #498 <Method void seekTo(long)>
	//   29   58:return          
	}

	private static int getRepeatToggleModes(TypedArray typedarray, int i)
	{
		return typedarray.getInt(R.styleable.PlayerControlView_repeat_toggle_modes, i);
	//    0    0:aload_0         
	//    1    1:getstatic       #501 <Field int R$styleable.PlayerControlView_repeat_toggle_modes>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #167 <Method int TypedArray.getInt(int, int)>
	//    4    8:ireturn         
	}

	private void hideAfterTimeout()
	{
		removeCallbacks(hideAction);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #121 <Field Runnable hideAction>
	//    3    5:invokevirtual   #505 <Method boolean removeCallbacks(Runnable)>
	//    4    8:pop             
		if(showTimeoutMs > 0)
	//*   5    9:aload_0         
	//*   6   10:getfield        #132 <Field int showTimeoutMs>
	//*   7   13:ifle            51
		{
			hideAtMs = SystemClock.uptimeMillis() + (long)showTimeoutMs;
	//    8   16:aload_0         
	//    9   17:invokestatic    #510 <Method long SystemClock.uptimeMillis()>
	//   10   20:aload_0         
	//   11   21:getfield        #132 <Field int showTimeoutMs>
	//   12   24:i2l             
	//   13   25:ladd            
	//   14   26:putfield        #138 <Field long hideAtMs>
			if(isAttachedToWindow)
	//*  15   29:aload_0         
	//*  16   30:getfield        #512 <Field boolean isAttachedToWindow>
	//*  17   33:ifeq            58
			{
				postDelayed(hideAction, showTimeoutMs);
	//   18   36:aload_0         
	//   19   37:aload_0         
	//   20   38:getfield        #121 <Field Runnable hideAction>
	//   21   41:aload_0         
	//   22   42:getfield        #132 <Field int showTimeoutMs>
	//   23   45:i2l             
	//   24   46:invokevirtual   #516 <Method boolean postDelayed(Runnable, long)>
	//   25   49:pop             
				return;
	//   26   50:return          
			}
		} else
		{
			hideAtMs = 0x1L;
	//   27   51:aload_0         
	//   28   52:ldc2w           #135 <Long 0x1L>
	//   29   55:putfield        #138 <Field long hideAtMs>
		}
	//   30   58:return          
	}

	private static boolean isHandledMediaKey(int i)
	{
		return i == 90 || i == 89 || i == 85 || i == 126 || i == 127 || i == 87 || i == 88;
	//    0    0:iload_0         
	//    1    1:bipush          90
	//    2    3:icmpeq          47
	//    3    6:iload_0         
	//    4    7:bipush          89
	//    5    9:icmpeq          47
	//    6   12:iload_0         
	//    7   13:bipush          85
	//    8   15:icmpeq          47
	//    9   18:iload_0         
	//   10   19:bipush          126
	//   11   21:icmpeq          47
	//   12   24:iload_0         
	//   13   25:bipush          127
	//   14   27:icmpeq          47
	//   15   30:iload_0         
	//   16   31:bipush          87
	//   17   33:icmpeq          47
	//   18   36:iload_0         
	//   19   37:bipush          88
	//   20   39:icmpne          45
	//   21   42:goto            47
	//   22   45:iconst_0        
	//   23   46:ireturn         
	//   24   47:iconst_1        
	//   25   48:ireturn         
	}

	private boolean isPlaying()
	{
		return player != null && player.getPlaybackState() != 4 && player.getPlaybackState() != 1 && player.getPlayWhenReady();
	//    0    0:aload_0         
	//    1    1:getfield        #455 <Field Player player>
	//    2    4:ifnull          47
	//    3    7:aload_0         
	//    4    8:getfield        #455 <Field Player player>
	//    5   11:invokeinterface #527 <Method int Player.getPlaybackState()>
	//    6   16:iconst_4        
	//    7   17:icmpeq          47
	//    8   20:aload_0         
	//    9   21:getfield        #455 <Field Player player>
	//   10   24:invokeinterface #527 <Method int Player.getPlaybackState()>
	//   11   29:iconst_1        
	//   12   30:icmpeq          47
	//   13   33:aload_0         
	//   14   34:getfield        #455 <Field Player player>
	//   15   37:invokeinterface #530 <Method boolean Player.getPlayWhenReady()>
	//   16   42:ifeq            47
	//   17   45:iconst_1        
	//   18   46:ireturn         
	//   19   47:iconst_0        
	//   20   48:ireturn         
	}

	private void next()
	{
		Timeline timeline = player.getCurrentTimeline();
	//    0    0:aload_0         
	//    1    1:getfield        #455 <Field Player player>
	//    2    4:invokeinterface #534 <Method Timeline Player.getCurrentTimeline()>
	//    3    9:astore_3        
		if(timeline.isEmpty())
	//*   4   10:aload_3         
	//*   5   11:invokevirtual   #537 <Method boolean Timeline.isEmpty()>
	//*   6   14:ifeq            18
			return;
	//    7   17:return          
		int i = player.getCurrentWindowIndex();
	//    8   18:aload_0         
	//    9   19:getfield        #455 <Field Player player>
	//   10   22:invokeinterface #540 <Method int Player.getCurrentWindowIndex()>
	//   11   27:istore_1        
		int j = player.getNextWindowIndex();
	//   12   28:aload_0         
	//   13   29:getfield        #455 <Field Player player>
	//   14   32:invokeinterface #543 <Method int Player.getNextWindowIndex()>
	//   15   37:istore_2        
		if(j != -1)
	//*  16   38:iload_2         
	//*  17   39:iconst_m1       
	//*  18   40:icmpeq          52
		{
			seekTo(j, 0x1L);
	//   19   43:aload_0         
	//   20   44:iload_2         
	//   21   45:ldc2w           #135 <Long 0x1L>
	//   22   48:invokespecial   #546 <Method void seekTo(int, long)>
			return;
	//   23   51:return          
		}
		if(timeline.getWindow(i, window, false).isDynamic)
	//*  24   52:aload_3         
	//*  25   53:iload_1         
	//*  26   54:aload_0         
	//*  27   55:getfield        #204 <Field com.google.android.exoplayer2.Timeline$Window window>
	//*  28   58:iconst_0        
	//*  29   59:invokevirtual   #549 <Method com.google.android.exoplayer2.Timeline$Window Timeline.getWindow(int, com.google.android.exoplayer2.Timeline$Window, boolean)>
	//*  30   62:getfield        #552 <Field boolean com.google.android.exoplayer2.Timeline$Window.isDynamic>
	//*  31   65:ifeq            76
			seekTo(i, 0x1L);
	//   32   68:aload_0         
	//   33   69:iload_1         
	//   34   70:ldc2w           #135 <Long 0x1L>
	//   35   73:invokespecial   #546 <Method void seekTo(int, long)>
	//   36   76:return          
	}

	private void previous()
	{
		Timeline timeline = player.getCurrentTimeline();
	//    0    0:aload_0         
	//    1    1:getfield        #455 <Field Player player>
	//    2    4:invokeinterface #534 <Method Timeline Player.getCurrentTimeline()>
	//    3    9:astore_2        
		if(timeline.isEmpty())
	//*   4   10:aload_2         
	//*   5   11:invokevirtual   #537 <Method boolean Timeline.isEmpty()>
	//*   6   14:ifeq            18
			return;
	//    7   17:return          
		timeline.getWindow(player.getCurrentWindowIndex(), window);
	//    8   18:aload_2         
	//    9   19:aload_0         
	//   10   20:getfield        #455 <Field Player player>
	//   11   23:invokeinterface #540 <Method int Player.getCurrentWindowIndex()>
	//   12   28:aload_0         
	//   13   29:getfield        #204 <Field com.google.android.exoplayer2.Timeline$Window window>
	//   14   32:invokevirtual   #477 <Method com.google.android.exoplayer2.Timeline$Window Timeline.getWindow(int, com.google.android.exoplayer2.Timeline$Window)>
	//   15   35:pop             
		int i = player.getPreviousWindowIndex();
	//   16   36:aload_0         
	//   17   37:getfield        #455 <Field Player player>
	//   18   40:invokeinterface #555 <Method int Player.getPreviousWindowIndex()>
	//   19   45:istore_1        
		if(i != -1 && (player.getCurrentPosition() <= 3000L || window.isDynamic && !window.isSeekable))
	//*  20   46:iload_1         
	//*  21   47:iconst_m1       
	//*  22   48:icmpeq          96
	//*  23   51:aload_0         
	//*  24   52:getfield        #455 <Field Player player>
	//*  25   55:invokeinterface #489 <Method long Player.getCurrentPosition()>
	//*  26   60:ldc2w           #25  <Long 3000L>
	//*  27   63:lcmp            
	//*  28   64:ifle            87
	//*  29   67:aload_0         
	//*  30   68:getfield        #204 <Field com.google.android.exoplayer2.Timeline$Window window>
	//*  31   71:getfield        #552 <Field boolean com.google.android.exoplayer2.Timeline$Window.isDynamic>
	//*  32   74:ifeq            96
	//*  33   77:aload_0         
	//*  34   78:getfield        #204 <Field com.google.android.exoplayer2.Timeline$Window window>
	//*  35   81:getfield        #558 <Field boolean com.google.android.exoplayer2.Timeline$Window.isSeekable>
	//*  36   84:ifne            96
		{
			seekTo(i, 0x1L);
	//   37   87:aload_0         
	//   38   88:iload_1         
	//   39   89:ldc2w           #135 <Long 0x1L>
	//   40   92:invokespecial   #546 <Method void seekTo(int, long)>
			return;
	//   41   95:return          
		} else
		{
			seekTo(0L);
	//   42   96:aload_0         
	//   43   97:lconst_0        
	//   44   98:invokespecial   #498 <Method void seekTo(long)>
			return;
	//   45  101:return          
		}
	}

	private void requestPlayPauseFocus()
	{
		boolean flag = isPlaying();
	//    0    0:aload_0         
	//    1    1:invokespecial   #561 <Method boolean isPlaying()>
	//    2    4:istore_1        
		if(!flag && playButton != null)
	//*   3    5:iload_1         
	//*   4    6:ifne            25
	//*   5    9:aload_0         
	//*   6   10:getfield        #289 <Field View playButton>
	//*   7   13:ifnull          25
		{
			playButton.requestFocus();
	//    8   16:aload_0         
	//    9   17:getfield        #289 <Field View playButton>
	//   10   20:invokevirtual   #564 <Method boolean View.requestFocus()>
	//   11   23:pop             
			return;
	//   12   24:return          
		}
		if(flag && pauseButton != null)
	//*  13   25:iload_1         
	//*  14   26:ifeq            44
	//*  15   29:aload_0         
	//*  16   30:getfield        #300 <Field View pauseButton>
	//*  17   33:ifnull          44
			pauseButton.requestFocus();
	//   18   36:aload_0         
	//   19   37:getfield        #300 <Field View pauseButton>
	//   20   40:invokevirtual   #564 <Method boolean View.requestFocus()>
	//   21   43:pop             
	//   22   44:return          
	}

	private void rewind()
	{
		if(rewindMs <= 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #128 <Field int rewindMs>
	//*   2    4:ifgt            8
		{
			return;
	//    3    7:return          
		} else
		{
			seekTo(Math.max(player.getCurrentPosition() - (long)rewindMs, 0L));
	//    4    8:aload_0         
	//    5    9:aload_0         
	//    6   10:getfield        #455 <Field Player player>
	//    7   13:invokeinterface #489 <Method long Player.getCurrentPosition()>
	//    8   18:aload_0         
	//    9   19:getfield        #128 <Field int rewindMs>
	//   10   22:i2l             
	//   11   23:lsub            
	//   12   24:lconst_0        
	//   13   25:invokestatic    #567 <Method long Math.max(long, long)>
	//   14   28:invokespecial   #498 <Method void seekTo(long)>
			return;
	//   15   31:return          
		}
	}

	private void seekTo(int i, long l)
	{
		if(!controlDispatcher.dispatchSeekTo(player, i, l))
	//*   0    0:aload_0         
	//*   1    1:getfield        #240 <Field ControlDispatcher controlDispatcher>
	//*   2    4:aload_0         
	//*   3    5:getfield        #455 <Field Player player>
	//*   4    8:iload_1         
	//*   5    9:lload_2         
	//*   6   10:invokeinterface #573 <Method boolean ControlDispatcher.dispatchSeekTo(Player, int, long)>
	//*   7   15:ifne            22
			updateProgress();
	//    8   18:aload_0         
	//    9   19:invokespecial   #385 <Method void updateProgress()>
	//   10   22:return          
	}

	private void seekTo(long l)
	{
		seekTo(player.getCurrentWindowIndex(), l);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #455 <Field Player player>
	//    3    5:invokeinterface #540 <Method int Player.getCurrentWindowIndex()>
	//    4   10:lload_1         
	//    5   11:invokespecial   #546 <Method void seekTo(int, long)>
	//    6   14:return          
	}

	private void seekToTimeBarPosition(long l)
	{
		Timeline timeline = player.getCurrentTimeline();
	//    0    0:aload_0         
	//    1    1:getfield        #455 <Field Player player>
	//    2    4:invokeinterface #534 <Method Timeline Player.getCurrentTimeline()>
	//    3    9:astore          7
		int i;
		if(multiWindowTimeBar && !timeline.isEmpty())
	//*   4   11:aload_0         
	//*   5   12:getfield        #575 <Field boolean multiWindowTimeBar>
	//*   6   15:ifeq            86
	//*   7   18:aload           7
	//*   8   20:invokevirtual   #537 <Method boolean Timeline.isEmpty()>
	//*   9   23:ifne            86
		{
			int j = timeline.getWindowCount();
	//   10   26:aload           7
	//   11   28:invokevirtual   #473 <Method int Timeline.getWindowCount()>
	//   12   31:istore          4
			i = 0;
	//   13   33:iconst_0        
	//   14   34:istore_3        
			do
			{
				long l1 = timeline.getWindow(i, window).getDurationMs();
	//   15   35:aload           7
	//   16   37:iload_3         
	//   17   38:aload_0         
	//   18   39:getfield        #204 <Field com.google.android.exoplayer2.Timeline$Window window>
	//   19   42:invokevirtual   #477 <Method com.google.android.exoplayer2.Timeline$Window Timeline.getWindow(int, com.google.android.exoplayer2.Timeline$Window)>
	//   20   45:invokevirtual   #578 <Method long com.google.android.exoplayer2.Timeline$Window.getDurationMs()>
	//   21   48:lstore          5
				if(l < l1)
	//*  22   50:lload_1         
	//*  23   51:lload           5
	//*  24   53:lcmp            
	//*  25   54:ifge            60
					break;
	//   26   57:goto            96
				if(i == j - 1)
	//*  27   60:iload_3         
	//*  28   61:iload           4
	//*  29   63:iconst_1        
	//*  30   64:isub            
	//*  31   65:icmpne          74
				{
					l = l1;
	//   32   68:lload           5
	//   33   70:lstore_1        
					break;
	//   34   71:goto            96
				}
				i++;
	//   35   74:iload_3         
	//   36   75:iconst_1        
	//   37   76:iadd            
	//   38   77:istore_3        
				l -= l1;
	//   39   78:lload_1         
	//   40   79:lload           5
	//   41   81:lsub            
	//   42   82:lstore_1        
			} while(true);
	//   43   83:goto            35
		} else
		{
			i = player.getCurrentWindowIndex();
	//   44   86:aload_0         
	//   45   87:getfield        #455 <Field Player player>
	//   46   90:invokeinterface #540 <Method int Player.getCurrentWindowIndex()>
	//   47   95:istore_3        
		}
		seekTo(i, l);
	//   48   96:aload_0         
	//   49   97:iload_3         
	//   50   98:lload_1         
	//   51   99:invokespecial   #546 <Method void seekTo(int, long)>
	//   52  102:return          
	}

	private void setButtonEnabled(boolean flag, View view)
	{
		if(view == null)
	//*   0    0:aload_2         
	//*   1    1:ifnonnull       5
			return;
	//    2    4:return          
		view.setEnabled(flag);
	//    3    5:aload_2         
	//    4    6:iload_1         
	//    5    7:invokevirtual   #584 <Method void View.setEnabled(boolean)>
		float f;
		if(flag)
	//*   6   10:iload_1         
	//*   7   11:ifeq            19
			f = 1.0F;
	//    8   14:fconst_1        
	//    9   15:fstore_3        
		else
	//*  10   16:goto            23
			f = 0.3F;
	//   11   19:ldc2            #585 <Float 0.3F>
	//   12   22:fstore_3        
		view.setAlpha(f);
	//   13   23:aload_2         
	//   14   24:fload_3         
	//   15   25:invokevirtual   #589 <Method void View.setAlpha(float)>
		view.setVisibility(0);
	//   16   28:aload_2         
	//   17   29:iconst_0        
	//   18   30:invokevirtual   #592 <Method void View.setVisibility(int)>
	//   19   33:return          
	}

	private void updateAll()
	{
		updatePlayPauseButton();
	//    0    0:aload_0         
	//    1    1:invokespecial   #389 <Method void updatePlayPauseButton()>
		updateNavigation();
	//    2    4:aload_0         
	//    3    5:invokespecial   #397 <Method void updateNavigation()>
		updateRepeatModeButton();
	//    4    8:aload_0         
	//    5    9:invokespecial   #393 <Method void updateRepeatModeButton()>
		updateShuffleButton();
	//    6   12:aload_0         
	//    7   13:invokespecial   #401 <Method void updateShuffleButton()>
		updateProgress();
	//    8   16:aload_0         
	//    9   17:invokespecial   #385 <Method void updateProgress()>
	//   10   20:return          
	}

	private void updateNavigation()
	{
		if(isVisible())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #596 <Method boolean isVisible()>
	//*   2    4:ifeq            282
		{
			if(!isAttachedToWindow)
	//*   3    7:aload_0         
	//*   4    8:getfield        #512 <Field boolean isAttachedToWindow>
	//*   5   11:ifne            15
				return;
	//    6   14:return          
			Timeline timeline;
			if(player != null)
	//*   7   15:aload_0         
	//*   8   16:getfield        #455 <Field Player player>
	//*   9   19:ifnull          36
				timeline = player.getCurrentTimeline();
	//   10   22:aload_0         
	//   11   23:getfield        #455 <Field Player player>
	//   12   26:invokeinterface #534 <Method Timeline Player.getCurrentTimeline()>
	//   13   31:astore          6
			else
	//*  14   33:goto            39
				timeline = null;
	//   15   36:aconst_null     
	//   16   37:astore          6
			boolean flag4 = true;
	//   17   39:iconst_1        
	//   18   40:istore          5
			boolean flag;
			if(timeline != null && !timeline.isEmpty())
	//*  19   42:aload           6
	//*  20   44:ifnull          60
	//*  21   47:aload           6
	//*  22   49:invokevirtual   #537 <Method boolean Timeline.isEmpty()>
	//*  23   52:ifne            60
				flag = true;
	//   24   55:iconst_1        
	//   25   56:istore_1        
			else
	//*  26   57:goto            62
				flag = false;
	//   27   60:iconst_0        
	//   28   61:istore_1        
			boolean flag1;
			boolean flag2;
			boolean flag3;
			if(flag && !player.isPlayingAd())
	//*  29   62:iload_1         
	//*  30   63:ifeq            180
	//*  31   66:aload_0         
	//*  32   67:getfield        #455 <Field Player player>
	//*  33   70:invokeinterface #599 <Method boolean Player.isPlayingAd()>
	//*  34   75:ifne            180
			{
				timeline.getWindow(player.getCurrentWindowIndex(), window);
	//   35   78:aload           6
	//   36   80:aload_0         
	//   37   81:getfield        #455 <Field Player player>
	//   38   84:invokeinterface #540 <Method int Player.getCurrentWindowIndex()>
	//   39   89:aload_0         
	//   40   90:getfield        #204 <Field com.google.android.exoplayer2.Timeline$Window window>
	//   41   93:invokevirtual   #477 <Method com.google.android.exoplayer2.Timeline$Window Timeline.getWindow(int, com.google.android.exoplayer2.Timeline$Window)>
	//   42   96:pop             
				flag3 = window.isSeekable;
	//   43   97:aload_0         
	//   44   98:getfield        #204 <Field com.google.android.exoplayer2.Timeline$Window window>
	//   45  101:getfield        #558 <Field boolean com.google.android.exoplayer2.Timeline$Window.isSeekable>
	//   46  104:istore          4
				if(!flag3 && window.isDynamic && player.getPreviousWindowIndex() == -1)
	//*  47  106:iload           4
	//*  48  108:ifne            142
	//*  49  111:aload_0         
	//*  50  112:getfield        #204 <Field com.google.android.exoplayer2.Timeline$Window window>
	//*  51  115:getfield        #552 <Field boolean com.google.android.exoplayer2.Timeline$Window.isDynamic>
	//*  52  118:ifeq            142
	//*  53  121:aload_0         
	//*  54  122:getfield        #455 <Field Player player>
	//*  55  125:invokeinterface #555 <Method int Player.getPreviousWindowIndex()>
	//*  56  130:iconst_m1       
	//*  57  131:icmpeq          137
	//*  58  134:goto            142
					flag1 = false;
	//   59  137:iconst_0        
	//   60  138:istore_2        
				else
	//*  61  139:goto            144
					flag1 = true;
	//   62  142:iconst_1        
	//   63  143:istore_2        
				if(!window.isDynamic && player.getNextWindowIndex() == -1)
	//*  64  144:aload_0         
	//*  65  145:getfield        #204 <Field com.google.android.exoplayer2.Timeline$Window window>
	//*  66  148:getfield        #552 <Field boolean com.google.android.exoplayer2.Timeline$Window.isDynamic>
	//*  67  151:ifne            175
	//*  68  154:aload_0         
	//*  69  155:getfield        #455 <Field Player player>
	//*  70  158:invokeinterface #543 <Method int Player.getNextWindowIndex()>
	//*  71  163:iconst_m1       
	//*  72  164:icmpeq          170
	//*  73  167:goto            175
					flag2 = false;
	//   74  170:iconst_0        
	//   75  171:istore_3        
				else
	//*  76  172:goto            188
					flag2 = true;
	//   77  175:iconst_1        
	//   78  176:istore_3        
			} else
	//*  79  177:goto            188
			{
				flag3 = false;
	//   80  180:iconst_0        
	//   81  181:istore          4
				flag2 = flag3;
	//   82  183:iload           4
	//   83  185:istore_3        
				flag1 = flag2;
	//   84  186:iload_3         
	//   85  187:istore_2        
			}
			setButtonEnabled(flag1, previousButton);
	//   86  188:aload_0         
	//   87  189:iload_2         
	//   88  190:aload_0         
	//   89  191:getfield        #305 <Field View previousButton>
	//   90  194:invokespecial   #601 <Method void setButtonEnabled(boolean, View)>
			setButtonEnabled(flag2, nextButton);
	//   91  197:aload_0         
	//   92  198:iload_3         
	//   93  199:aload_0         
	//   94  200:getfield        #310 <Field View nextButton>
	//   95  203:invokespecial   #601 <Method void setButtonEnabled(boolean, View)>
			if(fastForwardMs > 0 && flag3)
	//*  96  206:aload_0         
	//*  97  207:getfield        #130 <Field int fastForwardMs>
	//*  98  210:ifle            223
	//*  99  213:iload           4
	//* 100  215:ifeq            223
				flag1 = true;
	//  101  218:iconst_1        
	//  102  219:istore_2        
			else
	//* 103  220:goto            225
				flag1 = false;
	//  104  223:iconst_0        
	//  105  224:istore_2        
			setButtonEnabled(flag1, fastForwardButton);
	//  106  225:aload_0         
	//  107  226:iload_2         
	//  108  227:aload_0         
	//  109  228:getfield        #320 <Field View fastForwardButton>
	//  110  231:invokespecial   #601 <Method void setButtonEnabled(boolean, View)>
			if(rewindMs > 0 && flag3)
	//* 111  234:aload_0         
	//* 112  235:getfield        #128 <Field int rewindMs>
	//* 113  238:ifle            252
	//* 114  241:iload           4
	//* 115  243:ifeq            252
				flag1 = flag4;
	//  116  246:iload           5
	//  117  248:istore_2        
			else
	//* 118  249:goto            254
				flag1 = false;
	//  119  252:iconst_0        
	//  120  253:istore_2        
			setButtonEnabled(flag1, rewindButton);
	//  121  254:aload_0         
	//  122  255:iload_2         
	//  123  256:aload_0         
	//  124  257:getfield        #315 <Field View rewindButton>
	//  125  260:invokespecial   #601 <Method void setButtonEnabled(boolean, View)>
			if(timeBar != null)
	//* 126  263:aload_0         
	//* 127  264:getfield        #280 <Field TimeBar timeBar>
	//* 128  267:ifnull          281
				timeBar.setEnabled(flag3);
	//  129  270:aload_0         
	//  130  271:getfield        #280 <Field TimeBar timeBar>
	//  131  274:iload           4
	//  132  276:invokeinterface #602 <Method void TimeBar.setEnabled(boolean)>
			return;
	//  133  281:return          
		} else
		{
			return;
	//  134  282:return          
		}
	}

	private void updatePlayPauseButton()
	{
		if(isVisible())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #596 <Method boolean isVisible()>
	//*   2    4:ifeq            165
		{
			if(!isAttachedToWindow)
	//*   3    7:aload_0         
	//*   4    8:getfield        #512 <Field boolean isAttachedToWindow>
	//*   5   11:ifne            15
				return;
	//    6   14:return          
			boolean flag3 = isPlaying();
	//    7   15:aload_0         
	//    8   16:invokespecial   #561 <Method boolean isPlaying()>
	//    9   19:istore          5
			View view = playButton;
	//   10   21:aload_0         
	//   11   22:getfield        #289 <Field View playButton>
	//   12   25:astore          6
			byte byte1 = 8;
	//   13   27:bipush          8
	//   14   29:istore_3        
			boolean flag2 = true;
	//   15   30:iconst_1        
	//   16   31:istore          4
			byte byte0;
			if(view != null)
	//*  17   33:aload           6
	//*  18   35:ifnull          94
			{
				if(flag3 && playButton.isFocused())
	//*  19   38:iload           5
	//*  20   40:ifeq            58
	//*  21   43:aload_0         
	//*  22   44:getfield        #289 <Field View playButton>
	//*  23   47:invokevirtual   #605 <Method boolean View.isFocused()>
	//*  24   50:ifeq            58
					byte0 = 1;
	//   25   53:iconst_1        
	//   26   54:istore_1        
				else
	//*  27   55:goto            60
					byte0 = 0;
	//   28   58:iconst_0        
	//   29   59:istore_1        
				boolean flag = byte0 | false;
	//   30   60:iload_1         
	//   31   61:iconst_0        
	//   32   62:ior             
	//   33   63:istore_2        
				View view1 = playButton;
	//   34   64:aload_0         
	//   35   65:getfield        #289 <Field View playButton>
	//   36   68:astore          6
				if(flag3)
	//*  37   70:iload           5
	//*  38   72:ifeq            81
					byte0 = 8;
	//   39   75:bipush          8
	//   40   77:istore_1        
				else
	//*  41   78:goto            83
					byte0 = 0;
	//   42   81:iconst_0        
	//   43   82:istore_1        
				view1.setVisibility(((int) (byte0)));
	//   44   83:aload           6
	//   45   85:iload_1         
	//   46   86:invokevirtual   #592 <Method void View.setVisibility(int)>
				byte0 = ((byte) (flag));
	//   47   89:iload_2         
	//   48   90:istore_1        
			} else
	//*  49   91:goto            96
			{
				byte0 = 0;
	//   50   94:iconst_0        
	//   51   95:istore_1        
			}
			boolean flag1 = ((boolean) (byte0));
	//   52   96:iload_1         
	//   53   97:istore_2        
			if(pauseButton != null)
	//*  54   98:aload_0         
	//*  55   99:getfield        #300 <Field View pauseButton>
	//*  56  102:ifnull          156
			{
				if(!flag3 && pauseButton.isFocused())
	//*  57  105:iload           5
	//*  58  107:ifne            126
	//*  59  110:aload_0         
	//*  60  111:getfield        #300 <Field View pauseButton>
	//*  61  114:invokevirtual   #605 <Method boolean View.isFocused()>
	//*  62  117:ifeq            126
					flag1 = flag2;
	//   63  120:iload           4
	//   64  122:istore_2        
				else
	//*  65  123:goto            128
					flag1 = false;
	//   66  126:iconst_0        
	//   67  127:istore_2        
				flag1 = byte0 | flag1;
	//   68  128:iload_1         
	//   69  129:iload_2         
	//   70  130:ior             
	//   71  131:istore_2        
				View view2 = pauseButton;
	//   72  132:aload_0         
	//   73  133:getfield        #300 <Field View pauseButton>
	//   74  136:astore          6
				if(!flag3)
	//*  75  138:iload           5
	//*  76  140:ifne            148
					byte0 = byte1;
	//   77  143:iload_3         
	//   78  144:istore_1        
				else
	//*  79  145:goto            150
					byte0 = 0;
	//   80  148:iconst_0        
	//   81  149:istore_1        
				view2.setVisibility(((int) (byte0)));
	//   82  150:aload           6
	//   83  152:iload_1         
	//   84  153:invokevirtual   #592 <Method void View.setVisibility(int)>
			}
			if(flag1)
	//*  85  156:iload_2         
	//*  86  157:ifeq            164
				requestPlayPauseFocus();
	//   87  160:aload_0         
	//   88  161:invokespecial   #607 <Method void requestPlayPauseFocus()>
			return;
	//   89  164:return          
		} else
		{
			return;
	//   90  165:return          
		}
	}

	private void updateProgress()
	{
		if(isVisible())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #596 <Method boolean isVisible()>
	//*   2    4:ifeq            986
		{
			if(!isAttachedToWindow)
	//*   3    7:aload_0         
	//*   4    8:getfield        #512 <Field boolean isAttachedToWindow>
	//*   5   11:ifne            15
				return;
	//    6   14:return          
			long l9;
			long l10;
			long l12;
			if(player != null)
	//*   7   15:aload_0         
	//*   8   16:getfield        #455 <Field Player player>
	//*   9   19:ifnull          678
			{
				Timeline timeline = player.getCurrentTimeline();
	//   10   22:aload_0         
	//   11   23:getfield        #455 <Field Player player>
	//   12   26:invokeinterface #534 <Method Timeline Player.getCurrentTimeline()>
	//   13   31:astore          23
				int l1;
				long l5;
				if(!timeline.isEmpty())
	//*  14   33:aload           23
	//*  15   35:invokevirtual   #537 <Method boolean Timeline.isEmpty()>
	//*  16   38:ifne            468
				{
					int i = player.getCurrentWindowIndex();
	//   17   41:aload_0         
	//   18   42:getfield        #455 <Field Player player>
	//   19   45:invokeinterface #540 <Method int Player.getCurrentWindowIndex()>
	//   20   50:istore_2        
					int j1;
					if(multiWindowTimeBar)
	//*  21   51:aload_0         
	//*  22   52:getfield        #575 <Field boolean multiWindowTimeBar>
	//*  23   55:ifeq            64
						j1 = 0;
	//   24   58:iconst_0        
	//   25   59:istore          4
					else
	//*  26   61:goto            67
						j1 = i;
	//   27   64:iload_2         
	//   28   65:istore          4
					int k1;
					if(multiWindowTimeBar)
	//*  29   67:aload_0         
	//*  30   68:getfield        #575 <Field boolean multiWindowTimeBar>
	//*  31   71:ifeq            86
						k1 = timeline.getWindowCount() - 1;
	//   32   74:aload           23
	//   33   76:invokevirtual   #473 <Method int Timeline.getWindowCount()>
	//   34   79:iconst_1        
	//   35   80:isub            
	//   36   81:istore          5
					else
	//*  37   83:goto            89
						k1 = i;
	//   38   86:iload_2         
	//   39   87:istore          5
					long l2 = 0L;
	//   40   89:lconst_0        
	//   41   90:lstore          10
					int l = 0;
	//   42   92:iconst_0        
	//   43   93:istore_3        
					long l8 = 0L;
	//   44   94:lconst_0        
	//   45   95:lstore          14
					do
					{
						l10 = l2;
	//   46   97:lload           10
	//   47   99:lstore          16
						l1 = l;
	//   48  101:iload_3         
	//   49  102:istore          6
						l5 = l8;
	//   50  104:lload           14
	//   51  106:lstore          12
						if(j1 > k1)
							break;
	//   52  108:iload           4
	//   53  110:iload           5
	//   54  112:icmpgt          477
						l5 = l8;
	//   55  115:lload           14
	//   56  117:lstore          12
						if(j1 == i)
	//*  57  119:iload           4
	//*  58  121:iload_2         
	//*  59  122:icmpne          129
							l5 = l2;
	//   60  125:lload           10
	//   61  127:lstore          12
						timeline.getWindow(j1, window);
	//   62  129:aload           23
	//   63  131:iload           4
	//   64  133:aload_0         
	//   65  134:getfield        #204 <Field com.google.android.exoplayer2.Timeline$Window window>
	//   66  137:invokevirtual   #477 <Method com.google.android.exoplayer2.Timeline$Window Timeline.getWindow(int, com.google.android.exoplayer2.Timeline$Window)>
	//   67  140:pop             
						if(window.durationUs == 0x1L)
	//*  68  141:aload_0         
	//*  69  142:getfield        #204 <Field com.google.android.exoplayer2.Timeline$Window window>
	//*  70  145:getfield        #480 <Field long com.google.android.exoplayer2.Timeline$Window.durationUs>
	//*  71  148:ldc2w           #135 <Long 0x1L>
	//*  72  151:lcmp            
	//*  73  152:ifne            174
						{
							Assertions.checkState(multiWindowTimeBar ^ true);
	//   74  155:aload_0         
	//   75  156:getfield        #575 <Field boolean multiWindowTimeBar>
	//   76  159:iconst_1        
	//   77  160:ixor            
	//   78  161:invokestatic    #612 <Method void Assertions.checkState(boolean)>
							l10 = l2;
	//   79  164:lload           10
	//   80  166:lstore          16
							l1 = l;
	//   81  168:iload_3         
	//   82  169:istore          6
							break;
	//   83  171:goto            477
						}
						int i2;
						for(l1 = window.firstPeriodIndex; l1 <= window.lastPeriodIndex; l1 = i2)
	//*  84  174:aload_0         
	//*  85  175:getfield        #204 <Field com.google.android.exoplayer2.Timeline$Window window>
	//*  86  178:getfield        #615 <Field int com.google.android.exoplayer2.Timeline$Window.firstPeriodIndex>
	//*  87  181:istore          6
	//*  88  183:iload           6
	//*  89  185:aload_0         
	//*  90  186:getfield        #204 <Field com.google.android.exoplayer2.Timeline$Window window>
	//*  91  189:getfield        #618 <Field int com.google.android.exoplayer2.Timeline$Window.lastPeriodIndex>
	//*  92  192:icmpgt          439
						{
							timeline.getPeriod(l1, period);
	//   93  195:aload           23
	//   94  197:iload           6
	//   95  199:aload_0         
	//   96  200:getfield        #199 <Field com.google.android.exoplayer2.Timeline$Period period>
	//   97  203:invokevirtual   #622 <Method com.google.android.exoplayer2.Timeline$Period Timeline.getPeriod(int, com.google.android.exoplayer2.Timeline$Period)>
	//   98  206:pop             
							int k2 = period.getAdGroupCount();
	//   99  207:aload_0         
	//  100  208:getfield        #199 <Field com.google.android.exoplayer2.Timeline$Period period>
	//  101  211:invokevirtual   #625 <Method int com.google.android.exoplayer2.Timeline$Period.getAdGroupCount()>
	//  102  214:istore          9
							boolean flag = ((boolean) (l));
	//  103  216:iload_3         
	//  104  217:istore          8
							i2 = 0;
	//  105  219:iconst_0        
	//  106  220:istore          7
							l = i;
	//  107  222:iload_2         
	//  108  223:istore_3        
							i = ((int) (flag));
	//  109  224:iload           8
	//  110  226:istore_2        
							for(; i2 < k2; i2++)
	//* 111  227:iload           7
	//* 112  229:iload           9
	//* 113  231:icmpge          418
							{
								l8 = period.getAdGroupTimeUs(i2);
	//  114  234:aload_0         
	//  115  235:getfield        #199 <Field com.google.android.exoplayer2.Timeline$Period period>
	//  116  238:iload           7
	//  117  240:invokevirtual   #629 <Method long com.google.android.exoplayer2.Timeline$Period.getAdGroupTimeUs(int)>
	//  118  243:lstore          14
								if(l8 == 0x0L)
	//* 119  245:lload           14
	//* 120  247:ldc2w           #630 <Long 0x0L>
	//* 121  250:lcmp            
	//* 122  251:ifne            283
								{
									if(period.durationUs == 0x1L)
	//* 123  254:aload_0         
	//* 124  255:getfield        #199 <Field com.google.android.exoplayer2.Timeline$Period period>
	//* 125  258:getfield        #632 <Field long com.google.android.exoplayer2.Timeline$Period.durationUs>
	//* 126  261:ldc2w           #135 <Long 0x1L>
	//* 127  264:lcmp            
	//* 128  265:ifne            271
										continue;
	//  129  268:goto            409
									l8 = period.durationUs;
	//  130  271:aload_0         
	//  131  272:getfield        #199 <Field com.google.android.exoplayer2.Timeline$Period period>
	//  132  275:getfield        #632 <Field long com.google.android.exoplayer2.Timeline$Period.durationUs>
	//  133  278:lstore          14
								}
	//* 134  280:goto            283
								l8 += period.getPositionInWindowUs();
	//  135  283:lload           14
	//  136  285:aload_0         
	//  137  286:getfield        #199 <Field com.google.android.exoplayer2.Timeline$Period period>
	//  138  289:invokevirtual   #635 <Method long com.google.android.exoplayer2.Timeline$Period.getPositionInWindowUs()>
	//  139  292:ladd            
	//  140  293:lstore          14
								if(l8 < 0L || l8 > window.durationUs)
									continue;
	//  141  295:lload           14
	//  142  297:lconst_0        
	//  143  298:lcmp            
	//  144  299:iflt            409
	//  145  302:lload           14
	//  146  304:aload_0         
	//  147  305:getfield        #204 <Field com.google.android.exoplayer2.Timeline$Window window>
	//  148  308:getfield        #480 <Field long com.google.android.exoplayer2.Timeline$Window.durationUs>
	//  149  311:lcmp            
	//  150  312:ifgt            409
								if(i == adGroupTimesMs.length)
	//* 151  315:iload_2         
	//* 152  316:aload_0         
	//* 153  317:getfield        #224 <Field long[] adGroupTimesMs>
	//* 154  320:arraylength     
	//* 155  321:icmpne          373
								{
									int j2;
									if(adGroupTimesMs.length == 0)
	//* 156  324:aload_0         
	//* 157  325:getfield        #224 <Field long[] adGroupTimesMs>
	//* 158  328:arraylength     
	//* 159  329:ifne            338
										j2 = 1;
	//  160  332:iconst_1        
	//  161  333:istore          8
									else
	//* 162  335:goto            347
										j2 = adGroupTimesMs.length * 2;
	//  163  338:aload_0         
	//  164  339:getfield        #224 <Field long[] adGroupTimesMs>
	//  165  342:arraylength     
	//  166  343:iconst_2        
	//  167  344:imul            
	//  168  345:istore          8
									adGroupTimesMs = Arrays.copyOf(adGroupTimesMs, j2);
	//  169  347:aload_0         
	//  170  348:aload_0         
	//  171  349:getfield        #224 <Field long[] adGroupTimesMs>
	//  172  352:iload           8
	//  173  354:invokestatic    #641 <Method long[] Arrays.copyOf(long[], int)>
	//  174  357:putfield        #224 <Field long[] adGroupTimesMs>
									playedAdGroups = Arrays.copyOf(playedAdGroups, j2);
	//  175  360:aload_0         
	//  176  361:aload_0         
	//  177  362:getfield        #226 <Field boolean[] playedAdGroups>
	//  178  365:iload           8
	//  179  367:invokestatic    #644 <Method boolean[] Arrays.copyOf(boolean[], int)>
	//  180  370:putfield        #226 <Field boolean[] playedAdGroups>
								}
								adGroupTimesMs[i] = C.usToMs(l2 + l8);
	//  181  373:aload_0         
	//  182  374:getfield        #224 <Field long[] adGroupTimesMs>
	//  183  377:iload_2         
	//  184  378:lload           10
	//  185  380:lload           14
	//  186  382:ladd            
	//  187  383:invokestatic    #650 <Method long C.usToMs(long)>
	//  188  386:lastore         
								playedAdGroups[i] = period.hasPlayedAdGroup(i2);
	//  189  387:aload_0         
	//  190  388:getfield        #226 <Field boolean[] playedAdGroups>
	//  191  391:iload_2         
	//  192  392:aload_0         
	//  193  393:getfield        #199 <Field com.google.android.exoplayer2.Timeline$Period period>
	//  194  396:iload           7
	//  195  398:invokevirtual   #653 <Method boolean com.google.android.exoplayer2.Timeline$Period.hasPlayedAdGroup(int)>
	//  196  401:bastore         
								i++;
	//  197  402:iload_2         
	//  198  403:iconst_1        
	//  199  404:iadd            
	//  200  405:istore_2        
							}

	//  201  406:goto            409
	//  202  409:iload           7
	//  203  411:iconst_1        
	//  204  412:iadd            
	//  205  413:istore          7
	//* 206  415:goto            227
							i2 = l1 + 1;
	//  207  418:iload           6
	//  208  420:iconst_1        
	//  209  421:iadd            
	//  210  422:istore          7
							l1 = i;
	//  211  424:iload_2         
	//  212  425:istore          6
							i = l;
	//  213  427:iload_3         
	//  214  428:istore_2        
							l = l1;
	//  215  429:iload           6
	//  216  431:istore_3        
						}

	//  217  432:iload           7
	//  218  434:istore          6
	//* 219  436:goto            183
						l8 = window.durationUs;
	//  220  439:aload_0         
	//  221  440:getfield        #204 <Field com.google.android.exoplayer2.Timeline$Window window>
	//  222  443:getfield        #480 <Field long com.google.android.exoplayer2.Timeline$Window.durationUs>
	//  223  446:lstore          14
						j1++;
	//  224  448:iload           4
	//  225  450:iconst_1        
	//  226  451:iadd            
	//  227  452:istore          4
						l2 += l8;
	//  228  454:lload           10
	//  229  456:lload           14
	//  230  458:ladd            
	//  231  459:lstore          10
						l8 = l5;
	//  232  461:lload           12
	//  233  463:lstore          14
					} while(true);
	//  234  465:goto            97
				} else
				{
					l10 = 0L;
	//  235  468:lconst_0        
	//  236  469:lstore          16
					l1 = 0;
	//  237  471:iconst_0        
	//  238  472:istore          6
					l5 = 0L;
	//  239  474:lconst_0        
	//  240  475:lstore          12
				}
				long l13 = C.usToMs(l10);
	//  241  477:lload           16
	//  242  479:invokestatic    #650 <Method long C.usToMs(long)>
	//  243  482:lstore          20
				l5 = C.usToMs(l5);
	//  244  484:lload           12
	//  245  486:invokestatic    #650 <Method long C.usToMs(long)>
	//  246  489:lstore          12
				long l3;
				if(player.isPlayingAd())
	//* 247  491:aload_0         
	//* 248  492:getfield        #455 <Field Player player>
	//* 249  495:invokeinterface #599 <Method boolean Player.isPlayingAd()>
	//* 250  500:ifeq            524
				{
					l3 = l5 + player.getContentPosition();
	//  251  503:lload           12
	//  252  505:aload_0         
	//  253  506:getfield        #455 <Field Player player>
	//  254  509:invokeinterface #656 <Method long Player.getContentPosition()>
	//  255  514:ladd            
	//  256  515:lstore          10
					l5 = l3;
	//  257  517:lload           10
	//  258  519:lstore          12
				} else
	//* 259  521:goto            552
				{
					l3 = l5 + player.getCurrentPosition();
	//  260  524:lload           12
	//  261  526:aload_0         
	//  262  527:getfield        #455 <Field Player player>
	//  263  530:invokeinterface #489 <Method long Player.getCurrentPosition()>
	//  264  535:ladd            
	//  265  536:lstore          10
					l5 += player.getBufferedPosition();
	//  266  538:lload           12
	//  267  540:aload_0         
	//  268  541:getfield        #455 <Field Player player>
	//  269  544:invokeinterface #659 <Method long Player.getBufferedPosition()>
	//  270  549:ladd            
	//  271  550:lstore          12
				}
				l12 = l13;
	//  272  552:lload           20
	//  273  554:lstore          18
				l9 = l3;
	//  274  556:lload           10
	//  275  558:lstore          14
				l10 = l5;
	//  276  560:lload           12
	//  277  562:lstore          16
				if(timeBar != null)
	//* 278  564:aload_0         
	//* 279  565:getfield        #280 <Field TimeBar timeBar>
	//* 280  568:ifnull          687
				{
					int j = extraAdGroupTimesMs.length;
	//  281  571:aload_0         
	//  282  572:getfield        #228 <Field long[] extraAdGroupTimesMs>
	//  283  575:arraylength     
	//  284  576:istore_2        
					int i1 = l1 + j;
	//  285  577:iload           6
	//  286  579:iload_2         
	//  287  580:iadd            
	//  288  581:istore_3        
					if(i1 > adGroupTimesMs.length)
	//* 289  582:iload_3         
	//* 290  583:aload_0         
	//* 291  584:getfield        #224 <Field long[] adGroupTimesMs>
	//* 292  587:arraylength     
	//* 293  588:icmple          615
					{
						adGroupTimesMs = Arrays.copyOf(adGroupTimesMs, i1);
	//  294  591:aload_0         
	//  295  592:aload_0         
	//  296  593:getfield        #224 <Field long[] adGroupTimesMs>
	//  297  596:iload_3         
	//  298  597:invokestatic    #641 <Method long[] Arrays.copyOf(long[], int)>
	//  299  600:putfield        #224 <Field long[] adGroupTimesMs>
						playedAdGroups = Arrays.copyOf(playedAdGroups, i1);
	//  300  603:aload_0         
	//  301  604:aload_0         
	//  302  605:getfield        #226 <Field boolean[] playedAdGroups>
	//  303  608:iload_3         
	//  304  609:invokestatic    #644 <Method boolean[] Arrays.copyOf(boolean[], int)>
	//  305  612:putfield        #226 <Field boolean[] playedAdGroups>
					}
					System.arraycopy(((Object) (extraAdGroupTimesMs)), 0, ((Object) (adGroupTimesMs)), l1, j);
	//  306  615:aload_0         
	//  307  616:getfield        #228 <Field long[] extraAdGroupTimesMs>
	//  308  619:iconst_0        
	//  309  620:aload_0         
	//  310  621:getfield        #224 <Field long[] adGroupTimesMs>
	//  311  624:iload           6
	//  312  626:iload_2         
	//  313  627:invokestatic    #665 <Method void System.arraycopy(Object, int, Object, int, int)>
					System.arraycopy(((Object) (extraPlayedAdGroups)), 0, ((Object) (playedAdGroups)), l1, j);
	//  314  630:aload_0         
	//  315  631:getfield        #230 <Field boolean[] extraPlayedAdGroups>
	//  316  634:iconst_0        
	//  317  635:aload_0         
	//  318  636:getfield        #226 <Field boolean[] playedAdGroups>
	//  319  639:iload           6
	//  320  641:iload_2         
	//  321  642:invokestatic    #665 <Method void System.arraycopy(Object, int, Object, int, int)>
					timeBar.setAdGroupTimesMs(adGroupTimesMs, playedAdGroups, i1);
	//  322  645:aload_0         
	//  323  646:getfield        #280 <Field TimeBar timeBar>
	//  324  649:aload_0         
	//  325  650:getfield        #224 <Field long[] adGroupTimesMs>
	//  326  653:aload_0         
	//  327  654:getfield        #226 <Field boolean[] playedAdGroups>
	//  328  657:iload_3         
	//  329  658:invokeinterface #669 <Method void TimeBar.setAdGroupTimesMs(long[], boolean[], int)>
					l12 = l13;
	//  330  663:lload           20
	//  331  665:lstore          18
					l9 = l3;
	//  332  667:lload           10
	//  333  669:lstore          14
					l10 = l5;
	//  334  671:lload           12
	//  335  673:lstore          16
				}
			} else
	//* 336  675:goto            687
			{
				l12 = 0L;
	//  337  678:lconst_0        
	//  338  679:lstore          18
				l9 = 0L;
	//  339  681:lconst_0        
	//  340  682:lstore          14
				l10 = 0L;
	//  341  684:lconst_0        
	//  342  685:lstore          16
			}
			if(durationView != null)
	//* 343  687:aload_0         
	//* 344  688:getfield        #268 <Field TextView durationView>
	//* 345  691:ifnull          714
				durationView.setText(((CharSequence) (Util.getStringForTime(formatBuilder, formatter, l12))));
	//  346  694:aload_0         
	//  347  695:getfield        #268 <Field TextView durationView>
	//  348  698:aload_0         
	//  349  699:getfield        #209 <Field StringBuilder formatBuilder>
	//  350  702:aload_0         
	//  351  703:getfield        #222 <Field Formatter formatter>
	//  352  706:lload           18
	//  353  708:invokestatic    #675 <Method String Util.getStringForTime(StringBuilder, Formatter, long)>
	//  354  711:invokevirtual   #679 <Method void TextView.setText(CharSequence)>
			if(positionView != null && !scrubbing)
	//* 355  714:aload_0         
	//* 356  715:getfield        #273 <Field TextView positionView>
	//* 357  718:ifnull          748
	//* 358  721:aload_0         
	//* 359  722:getfield        #445 <Field boolean scrubbing>
	//* 360  725:ifne            748
				positionView.setText(((CharSequence) (Util.getStringForTime(formatBuilder, formatter, l9))));
	//  361  728:aload_0         
	//  362  729:getfield        #273 <Field TextView positionView>
	//  363  732:aload_0         
	//  364  733:getfield        #209 <Field StringBuilder formatBuilder>
	//  365  736:aload_0         
	//  366  737:getfield        #222 <Field Formatter formatter>
	//  367  740:lload           14
	//  368  742:invokestatic    #675 <Method String Util.getStringForTime(StringBuilder, Formatter, long)>
	//  369  745:invokevirtual   #679 <Method void TextView.setText(CharSequence)>
			if(timeBar != null)
	//* 370  748:aload_0         
	//* 371  749:getfield        #280 <Field TimeBar timeBar>
	//* 372  752:ifnull          788
			{
				timeBar.setPosition(l9);
	//  373  755:aload_0         
	//  374  756:getfield        #280 <Field TimeBar timeBar>
	//  375  759:lload           14
	//  376  761:invokeinterface #682 <Method void TimeBar.setPosition(long)>
				timeBar.setBufferedPosition(l10);
	//  377  766:aload_0         
	//  378  767:getfield        #280 <Field TimeBar timeBar>
	//  379  770:lload           16
	//  380  772:invokeinterface #685 <Method void TimeBar.setBufferedPosition(long)>
				timeBar.setDuration(l12);
	//  381  777:aload_0         
	//  382  778:getfield        #280 <Field TimeBar timeBar>
	//  383  781:lload           18
	//  384  783:invokeinterface #688 <Method void TimeBar.setDuration(long)>
			}
			removeCallbacks(updateProgressAction);
	//  385  788:aload_0         
	//  386  789:aload_0         
	//  387  790:getfield        #118 <Field Runnable updateProgressAction>
	//  388  793:invokevirtual   #505 <Method boolean removeCallbacks(Runnable)>
	//  389  796:pop             
			int k;
			if(player == null)
	//* 390  797:aload_0         
	//* 391  798:getfield        #455 <Field Player player>
	//* 392  801:ifnonnull       809
				k = 1;
	//  393  804:iconst_1        
	//  394  805:istore_2        
			else
	//* 395  806:goto            819
				k = player.getPlaybackState();
	//  396  809:aload_0         
	//  397  810:getfield        #455 <Field Player player>
	//  398  813:invokeinterface #527 <Method int Player.getPlaybackState()>
	//  399  818:istore_2        
			if(k != 1 && k != 4)
	//* 400  819:iload_2         
	//* 401  820:iconst_1        
	//* 402  821:icmpeq          985
	//* 403  824:iload_2         
	//* 404  825:iconst_4        
	//* 405  826:icmpeq          985
			{
				boolean flag1 = player.getPlayWhenReady();
	//  406  829:aload_0         
	//  407  830:getfield        #455 <Field Player player>
	//  408  833:invokeinterface #530 <Method boolean Player.getPlayWhenReady()>
	//  409  838:istore          22
				long l6 = 1000L;
	//  410  840:ldc2w           #689 <Long 1000L>
	//  411  843:lstore          12
				long l4 = l6;
	//  412  845:lload           12
	//  413  847:lstore          10
				if(flag1)
	//* 414  849:iload           22
	//* 415  851:ifeq            974
				{
					l4 = l6;
	//  416  854:lload           12
	//  417  856:lstore          10
					if(k == 3)
	//* 418  858:iload_2         
	//* 419  859:iconst_3        
	//* 420  860:icmpne          974
					{
						float f = player.getPlaybackParameters().speed;
	//  421  863:aload_0         
	//  422  864:getfield        #455 <Field Player player>
	//  423  867:invokeinterface #694 <Method PlaybackParameters Player.getPlaybackParameters()>
	//  424  872:getfield        #700 <Field float PlaybackParameters.speed>
	//  425  875:fstore_1        
						if(f <= 0.1F)
	//* 426  876:fload_1         
	//* 427  877:ldc2            #701 <Float 0.1F>
	//* 428  880:fcmpg           
	//* 429  881:ifgt            891
							l4 = l6;
	//  430  884:lload           12
	//  431  886:lstore          10
						else
	//* 432  888:goto            974
						if(f <= 5F)
	//* 433  891:fload_1         
	//* 434  892:ldc2            #702 <Float 5F>
	//* 435  895:fcmpg           
	//* 436  896:ifgt            969
						{
							long l11 = 1000 / Math.max(1, Math.round(1.0F / f));
	//  437  899:sipush          1000
	//  438  902:iconst_1        
	//  439  903:fconst_1        
	//  440  904:fload_1         
	//  441  905:fdiv            
	//  442  906:invokestatic    #706 <Method int Math.round(float)>
	//  443  909:invokestatic    #708 <Method int Math.max(int, int)>
	//  444  912:idiv            
	//  445  913:i2l             
	//  446  914:lstore          16
							long l7 = l11 - l9 % l11;
	//  447  916:lload           16
	//  448  918:lload           14
	//  449  920:lload           16
	//  450  922:lrem            
	//  451  923:lsub            
	//  452  924:lstore          12
							l4 = l7;
	//  453  926:lload           12
	//  454  928:lstore          10
							if(l7 < l11 / 5L)
	//* 455  930:lload           12
	//* 456  932:lload           16
	//* 457  934:ldc2w           #709 <Long 5L>
	//* 458  937:ldiv            
	//* 459  938:lcmp            
	//* 460  939:ifge            949
								l4 = l7 + l11;
	//  461  942:lload           12
	//  462  944:lload           16
	//  463  946:ladd            
	//  464  947:lstore          10
							if(f != 1.0F)
	//* 465  949:fload_1         
	//* 466  950:fconst_1        
	//* 467  951:fcmpl           
	//* 468  952:ifne            958
	//* 469  955:goto            974
								l4 = (long)((float)l4 / f);
	//  470  958:lload           10
	//  471  960:l2f             
	//  472  961:fload_1         
	//  473  962:fdiv            
	//  474  963:f2l             
	//  475  964:lstore          10
						} else
	//* 476  966:goto            974
						{
							l4 = 200L;
	//  477  969:ldc2w           #711 <Long 200L>
	//  478  972:lstore          10
						}
					}
				}
				postDelayed(updateProgressAction, l4);
	//  479  974:aload_0         
	//  480  975:aload_0         
	//  481  976:getfield        #118 <Field Runnable updateProgressAction>
	//  482  979:lload           10
	//  483  981:invokevirtual   #516 <Method boolean postDelayed(Runnable, long)>
	//  484  984:pop             
			}
			return;
	//  485  985:return          
		} else
		{
			return;
	//  486  986:return          
		}
	}

	private void updateRepeatModeButton()
	{
		if(isVisible() && isAttachedToWindow)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #596 <Method boolean isVisible()>
	//*   2    4:ifeq            184
	//*   3    7:aload_0         
	//*   4    8:getfield        #512 <Field boolean isAttachedToWindow>
	//*   5   11:ifeq            184
		{
			if(repeatToggleButton == null)
	//*   6   14:aload_0         
	//*   7   15:getfield        #327 <Field ImageView repeatToggleButton>
	//*   8   18:ifnonnull       22
				return;
	//    9   21:return          
			if(repeatToggleModes == 0)
	//*  10   22:aload_0         
	//*  11   23:getfield        #134 <Field int repeatToggleModes>
	//*  12   26:ifne            39
			{
				repeatToggleButton.setVisibility(8);
	//   13   29:aload_0         
	//   14   30:getfield        #327 <Field ImageView repeatToggleButton>
	//   15   33:bipush          8
	//   16   35:invokevirtual   #713 <Method void ImageView.setVisibility(int)>
				return;
	//   17   38:return          
			}
			if(player == null)
	//*  18   39:aload_0         
	//*  19   40:getfield        #455 <Field Player player>
	//*  20   43:ifnonnull       56
			{
				setButtonEnabled(false, ((View) (repeatToggleButton)));
	//   21   46:aload_0         
	//   22   47:iconst_0        
	//   23   48:aload_0         
	//   24   49:getfield        #327 <Field ImageView repeatToggleButton>
	//   25   52:invokespecial   #601 <Method void setButtonEnabled(boolean, View)>
				return;
	//   26   55:return          
			}
			setButtonEnabled(true, ((View) (repeatToggleButton)));
	//   27   56:aload_0         
	//   28   57:iconst_1        
	//   29   58:aload_0         
	//   30   59:getfield        #327 <Field ImageView repeatToggleButton>
	//   31   62:invokespecial   #601 <Method void setButtonEnabled(boolean, View)>
			switch(player.getRepeatMode())
	//*  32   65:aload_0         
	//*  33   66:getfield        #455 <Field Player player>
	//*  34   69:invokeinterface #716 <Method int Player.getRepeatMode()>
			{
	//*  35   74:tableswitch     0 2: default 100
	//	               0 153
	//	               1 128
	//	               2 103
	//*  36  100:goto            175
			case 2: // '\002'
				repeatToggleButton.setImageDrawable(repeatAllButtonDrawable);
	//   37  103:aload_0         
	//   38  104:getfield        #327 <Field ImageView repeatToggleButton>
	//   39  107:aload_0         
	//   40  108:getfield        #360 <Field Drawable repeatAllButtonDrawable>
	//   41  111:invokevirtual   #720 <Method void ImageView.setImageDrawable(Drawable)>
				repeatToggleButton.setContentDescription(((CharSequence) (repeatAllButtonContentDescription)));
	//   42  114:aload_0         
	//   43  115:getfield        #327 <Field ImageView repeatToggleButton>
	//   44  118:aload_0         
	//   45  119:getfield        #381 <Field String repeatAllButtonContentDescription>
	//   46  122:invokevirtual   #723 <Method void ImageView.setContentDescription(CharSequence)>
				break;

	//*  47  125:goto            175
			case 1: // '\001'
				repeatToggleButton.setImageDrawable(repeatOneButtonDrawable);
	//   48  128:aload_0         
	//   49  129:getfield        #327 <Field ImageView repeatToggleButton>
	//   50  132:aload_0         
	//   51  133:getfield        #355 <Field Drawable repeatOneButtonDrawable>
	//   52  136:invokevirtual   #720 <Method void ImageView.setImageDrawable(Drawable)>
				repeatToggleButton.setContentDescription(((CharSequence) (repeatOneButtonContentDescription)));
	//   53  139:aload_0         
	//   54  140:getfield        #327 <Field ImageView repeatToggleButton>
	//   55  143:aload_0         
	//   56  144:getfield        #376 <Field String repeatOneButtonContentDescription>
	//   57  147:invokevirtual   #723 <Method void ImageView.setContentDescription(CharSequence)>
				break;

	//*  58  150:goto            175
			case 0: // '\0'
				repeatToggleButton.setImageDrawable(repeatOffButtonDrawable);
	//   59  153:aload_0         
	//   60  154:getfield        #327 <Field ImageView repeatToggleButton>
	//   61  157:aload_0         
	//   62  158:getfield        #350 <Field Drawable repeatOffButtonDrawable>
	//   63  161:invokevirtual   #720 <Method void ImageView.setImageDrawable(Drawable)>
				repeatToggleButton.setContentDescription(((CharSequence) (repeatOffButtonContentDescription)));
	//   64  164:aload_0         
	//   65  165:getfield        #327 <Field ImageView repeatToggleButton>
	//   66  168:aload_0         
	//   67  169:getfield        #371 <Field String repeatOffButtonContentDescription>
	//   68  172:invokevirtual   #723 <Method void ImageView.setContentDescription(CharSequence)>
				break;
			}
			repeatToggleButton.setVisibility(0);
	//   69  175:aload_0         
	//   70  176:getfield        #327 <Field ImageView repeatToggleButton>
	//   71  179:iconst_0        
	//   72  180:invokevirtual   #713 <Method void ImageView.setVisibility(int)>
			return;
	//   73  183:return          
		} else
		{
			return;
	//   74  184:return          
		}
	}

	private void updateShuffleButton()
	{
		if(isVisible() && isAttachedToWindow)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #596 <Method boolean isVisible()>
	//*   2    4:ifeq            104
	//*   3    7:aload_0         
	//*   4    8:getfield        #512 <Field boolean isAttachedToWindow>
	//*   5   11:ifeq            104
		{
			if(shuffleButton == null)
	//*   6   14:aload_0         
	//*   7   15:getfield        #333 <Field View shuffleButton>
	//*   8   18:ifnonnull       22
				return;
	//    9   21:return          
			if(!showShuffleButton)
	//*  10   22:aload_0         
	//*  11   23:getfield        #140 <Field boolean showShuffleButton>
	//*  12   26:ifne            39
			{
				shuffleButton.setVisibility(8);
	//   13   29:aload_0         
	//   14   30:getfield        #333 <Field View shuffleButton>
	//   15   33:bipush          8
	//   16   35:invokevirtual   #592 <Method void View.setVisibility(int)>
				return;
	//   17   38:return          
			}
			if(player == null)
	//*  18   39:aload_0         
	//*  19   40:getfield        #455 <Field Player player>
	//*  20   43:ifnonnull       56
			{
				setButtonEnabled(false, shuffleButton);
	//   21   46:aload_0         
	//   22   47:iconst_0        
	//   23   48:aload_0         
	//   24   49:getfield        #333 <Field View shuffleButton>
	//   25   52:invokespecial   #601 <Method void setButtonEnabled(boolean, View)>
				return;
	//   26   55:return          
			}
			View view = shuffleButton;
	//   27   56:aload_0         
	//   28   57:getfield        #333 <Field View shuffleButton>
	//   29   60:astore_2        
			float f;
			if(player.getShuffleModeEnabled())
	//*  30   61:aload_0         
	//*  31   62:getfield        #455 <Field Player player>
	//*  32   65:invokeinterface #726 <Method boolean Player.getShuffleModeEnabled()>
	//*  33   70:ifeq            78
				f = 1.0F;
	//   34   73:fconst_1        
	//   35   74:fstore_1        
			else
	//*  36   75:goto            82
				f = 0.3F;
	//   37   78:ldc2            #585 <Float 0.3F>
	//   38   81:fstore_1        
			view.setAlpha(f);
	//   39   82:aload_2         
	//   40   83:fload_1         
	//   41   84:invokevirtual   #589 <Method void View.setAlpha(float)>
			shuffleButton.setEnabled(true);
	//   42   87:aload_0         
	//   43   88:getfield        #333 <Field View shuffleButton>
	//   44   91:iconst_1        
	//   45   92:invokevirtual   #584 <Method void View.setEnabled(boolean)>
			shuffleButton.setVisibility(0);
	//   46   95:aload_0         
	//   47   96:getfield        #333 <Field View shuffleButton>
	//   48   99:iconst_0        
	//   49  100:invokevirtual   #592 <Method void View.setVisibility(int)>
			return;
	//   50  103:return          
		} else
		{
			return;
	//   51  104:return          
		}
	}

	private void updateTimeBarMode()
	{
		if(player == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #455 <Field Player player>
	//*   2    4:ifnonnull       8
			return;
	//    3    7:return          
		boolean flag;
		if(showMultiWindowTimeBar && canShowMultiWindowTimeBar(player.getCurrentTimeline(), window))
	//*   4    8:aload_0         
	//*   5    9:getfield        #728 <Field boolean showMultiWindowTimeBar>
	//*   6   12:ifeq            39
	//*   7   15:aload_0         
	//*   8   16:getfield        #455 <Field Player player>
	//*   9   19:invokeinterface #534 <Method Timeline Player.getCurrentTimeline()>
	//*  10   24:aload_0         
	//*  11   25:getfield        #204 <Field com.google.android.exoplayer2.Timeline$Window window>
	//*  12   28:invokestatic    #730 <Method boolean canShowMultiWindowTimeBar(Timeline, com.google.android.exoplayer2.Timeline$Window)>
	//*  13   31:ifeq            39
			flag = true;
	//   14   34:iconst_1        
	//   15   35:istore_1        
		else
	//*  16   36:goto            41
			flag = false;
	//   17   39:iconst_0        
	//   18   40:istore_1        
		multiWindowTimeBar = flag;
	//   19   41:aload_0         
	//   20   42:iload_1         
	//   21   43:putfield        #575 <Field boolean multiWindowTimeBar>
	//   22   46:return          
	}

	public boolean dispatchKeyEvent(KeyEvent keyevent)
	{
		return dispatchMediaKeyEvent(keyevent) || super.dispatchKeyEvent(keyevent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #735 <Method boolean dispatchMediaKeyEvent(KeyEvent)>
	//    3    5:ifne            21
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #737 <Method boolean FrameLayout.dispatchKeyEvent(KeyEvent)>
	//    7   13:ifeq            19
	//    8   16:goto            21
	//    9   19:iconst_0        
	//   10   20:ireturn         
	//   11   21:iconst_1        
	//   12   22:ireturn         
	}

	public boolean dispatchMediaKeyEvent(KeyEvent keyevent)
	{
		int i = keyevent.getKeyCode();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #742 <Method int KeyEvent.getKeyCode()>
	//    2    4:istore_2        
		if(player != null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #455 <Field Player player>
	//*   5    9:ifnull          187
		{
			if(!isHandledMediaKey(i))
	//*   6   12:iload_2         
	//*   7   13:invokestatic    #744 <Method boolean isHandledMediaKey(int)>
	//*   8   16:ifne            21
				return false;
	//    9   19:iconst_0        
	//   10   20:ireturn         
			if(keyevent.getAction() == 0)
	//*  11   21:aload_1         
	//*  12   22:invokevirtual   #747 <Method int KeyEvent.getAction()>
	//*  13   25:ifne            185
			{
				if(i == 90)
	//*  14   28:iload_2         
	//*  15   29:bipush          90
	//*  16   31:icmpne          40
				{
					fastForward();
	//   17   34:aload_0         
	//   18   35:invokespecial   #423 <Method void fastForward()>
					return true;
	//   19   38:iconst_1        
	//   20   39:ireturn         
				}
				if(i == 89)
	//*  21   40:iload_2         
	//*  22   41:bipush          89
	//*  23   43:icmpne          52
				{
					rewind();
	//   24   46:aload_0         
	//   25   47:invokespecial   #428 <Method void rewind()>
					return true;
	//   26   50:iconst_1        
	//   27   51:ireturn         
				}
				if(keyevent.getRepeatCount() == 0)
	//*  28   52:aload_1         
	//*  29   53:invokevirtual   #750 <Method int KeyEvent.getRepeatCount()>
	//*  30   56:ifne            185
					switch(i)
	//*  31   59:iload_2         
					{
	//*  32   60:lookupswitch    5: default 112
	//	               85: 160
	//	               87: 154
	//	               88: 148
	//	               126: 131
	//	               127: 114
					default:
						return true;
	//   33  112:iconst_1        
	//   34  113:ireturn         

					case 127: // '\177'
						controlDispatcher.dispatchSetPlayWhenReady(player, false);
	//   35  114:aload_0         
	//   36  115:getfield        #240 <Field ControlDispatcher controlDispatcher>
	//   37  118:aload_0         
	//   38  119:getfield        #455 <Field Player player>
	//   39  122:iconst_0        
	//   40  123:invokeinterface #754 <Method boolean ControlDispatcher.dispatchSetPlayWhenReady(Player, boolean)>
	//   41  128:pop             
						return true;
	//   42  129:iconst_1        
	//   43  130:ireturn         

					case 126: // '~'
						controlDispatcher.dispatchSetPlayWhenReady(player, true);
	//   44  131:aload_0         
	//   45  132:getfield        #240 <Field ControlDispatcher controlDispatcher>
	//   46  135:aload_0         
	//   47  136:getfield        #455 <Field Player player>
	//   48  139:iconst_1        
	//   49  140:invokeinterface #754 <Method boolean ControlDispatcher.dispatchSetPlayWhenReady(Player, boolean)>
	//   50  145:pop             
						return true;
	//   51  146:iconst_1        
	//   52  147:ireturn         

					case 88: // 'X'
						previous();
	//   53  148:aload_0         
	//   54  149:invokespecial   #416 <Method void previous()>
						return true;
	//   55  152:iconst_1        
	//   56  153:ireturn         

					case 87: // 'W'
						next();
	//   57  154:aload_0         
	//   58  155:invokespecial   #411 <Method void next()>
						return true;
	//   59  158:iconst_1        
	//   60  159:ireturn         

					case 85: // 'U'
						controlDispatcher.dispatchSetPlayWhenReady(player, player.getPlayWhenReady() ^ true);
	//   61  160:aload_0         
	//   62  161:getfield        #240 <Field ControlDispatcher controlDispatcher>
	//   63  164:aload_0         
	//   64  165:getfield        #455 <Field Player player>
	//   65  168:aload_0         
	//   66  169:getfield        #455 <Field Player player>
	//   67  172:invokeinterface #530 <Method boolean Player.getPlayWhenReady()>
	//   68  177:iconst_1        
	//   69  178:ixor            
	//   70  179:invokeinterface #754 <Method boolean ControlDispatcher.dispatchSetPlayWhenReady(Player, boolean)>
	//   71  184:pop             
						break;
					}
			}
			return true;
	//   72  185:iconst_1        
	//   73  186:ireturn         
		} else
		{
			return false;
	//   74  187:iconst_0        
	//   75  188:ireturn         
		}
	}

	public Player getPlayer()
	{
		return player;
	//    0    0:aload_0         
	//    1    1:getfield        #455 <Field Player player>
	//    2    4:areturn         
	}

	public int getRepeatToggleModes()
	{
		return repeatToggleModes;
	//    0    0:aload_0         
	//    1    1:getfield        #134 <Field int repeatToggleModes>
	//    2    4:ireturn         
	}

	public boolean getShowShuffleButton()
	{
		return showShuffleButton;
	//    0    0:aload_0         
	//    1    1:getfield        #140 <Field boolean showShuffleButton>
	//    2    4:ireturn         
	}

	public int getShowTimeoutMs()
	{
		return showTimeoutMs;
	//    0    0:aload_0         
	//    1    1:getfield        #132 <Field int showTimeoutMs>
	//    2    4:ireturn         
	}

	public void hide()
	{
		if(isVisible())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #596 <Method boolean isVisible()>
	//*   2    4:ifeq            58
		{
			setVisibility(8);
	//    3    7:aload_0         
	//    4    8:bipush          8
	//    5   10:invokevirtual   #760 <Method void setVisibility(int)>
			if(visibilityListener != null)
	//*   6   13:aload_0         
	//*   7   14:getfield        #762 <Field PlayerControlView$VisibilityListener visibilityListener>
	//*   8   17:ifnull          33
				visibilityListener.onVisibilityChange(getVisibility());
	//    9   20:aload_0         
	//   10   21:getfield        #762 <Field PlayerControlView$VisibilityListener visibilityListener>
	//   11   24:aload_0         
	//   12   25:invokevirtual   #765 <Method int getVisibility()>
	//   13   28:invokeinterface #768 <Method void PlayerControlView$VisibilityListener.onVisibilityChange(int)>
			removeCallbacks(updateProgressAction);
	//   14   33:aload_0         
	//   15   34:aload_0         
	//   16   35:getfield        #118 <Field Runnable updateProgressAction>
	//   17   38:invokevirtual   #505 <Method boolean removeCallbacks(Runnable)>
	//   18   41:pop             
			removeCallbacks(hideAction);
	//   19   42:aload_0         
	//   20   43:aload_0         
	//   21   44:getfield        #121 <Field Runnable hideAction>
	//   22   47:invokevirtual   #505 <Method boolean removeCallbacks(Runnable)>
	//   23   50:pop             
			hideAtMs = 0x1L;
	//   24   51:aload_0         
	//   25   52:ldc2w           #135 <Long 0x1L>
	//   26   55:putfield        #138 <Field long hideAtMs>
		}
	//   27   58:return          
	}

	public boolean isVisible()
	{
		return getVisibility() == 0;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #765 <Method int getVisibility()>
	//    2    4:ifne            9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	public void onAttachedToWindow()
	{
		super.onAttachedToWindow();
	//    0    0:aload_0         
	//    1    1:invokespecial   #771 <Method void FrameLayout.onAttachedToWindow()>
		isAttachedToWindow = true;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #512 <Field boolean isAttachedToWindow>
		if(hideAtMs != 0x1L)
	//*   5    9:aload_0         
	//*   6   10:getfield        #138 <Field long hideAtMs>
	//*   7   13:ldc2w           #135 <Long 0x1L>
	//*   8   16:lcmp            
	//*   9   17:ifeq            55
		{
			long l = hideAtMs - SystemClock.uptimeMillis();
	//   10   20:aload_0         
	//   11   21:getfield        #138 <Field long hideAtMs>
	//   12   24:invokestatic    #510 <Method long SystemClock.uptimeMillis()>
	//   13   27:lsub            
	//   14   28:lstore_1        
			if(l <= 0L)
	//*  15   29:lload_1         
	//*  16   30:lconst_0        
	//*  17   31:lcmp            
	//*  18   32:ifgt            42
				hide();
	//   19   35:aload_0         
	//   20   36:invokevirtual   #773 <Method void hide()>
			else
	//*  21   39:goto            66
				postDelayed(hideAction, l);
	//   22   42:aload_0         
	//   23   43:aload_0         
	//   24   44:getfield        #121 <Field Runnable hideAction>
	//   25   47:lload_1         
	//   26   48:invokevirtual   #516 <Method boolean postDelayed(Runnable, long)>
	//   27   51:pop             
		} else
	//*  28   52:goto            66
		if(isVisible())
	//*  29   55:aload_0         
	//*  30   56:invokevirtual   #596 <Method boolean isVisible()>
	//*  31   59:ifeq            66
			hideAfterTimeout();
	//   32   62:aload_0         
	//   33   63:invokespecial   #465 <Method void hideAfterTimeout()>
		updateAll();
	//   34   66:aload_0         
	//   35   67:invokespecial   #775 <Method void updateAll()>
	//   36   70:return          
	}

	public void onDetachedFromWindow()
	{
		super.onDetachedFromWindow();
	//    0    0:aload_0         
	//    1    1:invokespecial   #778 <Method void FrameLayout.onDetachedFromWindow()>
		isAttachedToWindow = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #512 <Field boolean isAttachedToWindow>
		removeCallbacks(updateProgressAction);
	//    5    9:aload_0         
	//    6   10:aload_0         
	//    7   11:getfield        #118 <Field Runnable updateProgressAction>
	//    8   14:invokevirtual   #505 <Method boolean removeCallbacks(Runnable)>
	//    9   17:pop             
		removeCallbacks(hideAction);
	//   10   18:aload_0         
	//   11   19:aload_0         
	//   12   20:getfield        #121 <Field Runnable hideAction>
	//   13   23:invokevirtual   #505 <Method boolean removeCallbacks(Runnable)>
	//   14   26:pop             
	//   15   27:return          
	}

	public void setControlDispatcher(ControlDispatcher controldispatcher)
	{
		Object obj = ((Object) (controldispatcher));
	//    0    0:aload_1         
	//    1    1:astore_2        
		if(controldispatcher == null)
	//*   2    2:aload_1         
	//*   3    3:ifnonnull       14
			obj = ((Object) (new DefaultControlDispatcher()));
	//    4    6:new             #237 <Class DefaultControlDispatcher>
	//    5    9:dup             
	//    6   10:invokespecial   #238 <Method void DefaultControlDispatcher()>
	//    7   13:astore_2        
		controlDispatcher = ((ControlDispatcher) (obj));
	//    8   14:aload_0         
	//    9   15:aload_2         
	//   10   16:putfield        #240 <Field ControlDispatcher controlDispatcher>
	//   11   19:return          
	}

	public void setExtraAdGroupMarkers(long al[], boolean aflag[])
	{
		boolean flag = false;
	//    0    0:iconst_0        
	//    1    1:istore_3        
		if(al == null)
	//*   2    2:aload_1         
	//*   3    3:ifnonnull       23
		{
			extraAdGroupTimesMs = new long[0];
	//    4    6:aload_0         
	//    5    7:iconst_0        
	//    6    8:newarray        long[]
	//    7   10:putfield        #228 <Field long[] extraAdGroupTimesMs>
			extraPlayedAdGroups = new boolean[0];
	//    8   13:aload_0         
	//    9   14:iconst_0        
	//   10   15:newarray        boolean[]
	//   11   17:putfield        #230 <Field boolean[] extraPlayedAdGroups>
		} else
	//*  12   20:goto            46
		{
			if(al.length == aflag.length)
	//*  13   23:aload_1         
	//*  14   24:arraylength     
	//*  15   25:aload_2         
	//*  16   26:arraylength     
	//*  17   27:icmpne          32
				flag = true;
	//   18   30:iconst_1        
	//   19   31:istore_3        
			Assertions.checkArgument(flag);
	//   20   32:iload_3         
	//   21   33:invokestatic    #786 <Method void Assertions.checkArgument(boolean)>
			extraAdGroupTimesMs = al;
	//   22   36:aload_0         
	//   23   37:aload_1         
	//   24   38:putfield        #228 <Field long[] extraAdGroupTimesMs>
			extraPlayedAdGroups = aflag;
	//   25   41:aload_0         
	//   26   42:aload_2         
	//   27   43:putfield        #230 <Field boolean[] extraPlayedAdGroups>
		}
		updateProgress();
	//   28   46:aload_0         
	//   29   47:invokespecial   #385 <Method void updateProgress()>
	//   30   50:return          
	}

	public void setFastForwardIncrementMs(int i)
	{
		fastForwardMs = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #130 <Field int fastForwardMs>
		updateNavigation();
	//    3    5:aload_0         
	//    4    6:invokespecial   #397 <Method void updateNavigation()>
	//    5    9:return          
	}

	public void setPlaybackPreparer(PlaybackPreparer playbackpreparer)
	{
		playbackPreparer = playbackpreparer;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #433 <Field PlaybackPreparer playbackPreparer>
	//    3    5:return          
	}

	public void setPlayer(Player player1)
	{
		if(player == player1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #455 <Field Player player>
	//*   2    4:aload_1         
	//*   3    5:if_acmpne       9
			return;
	//    4    8:return          
		if(player != null)
	//*   5    9:aload_0         
	//*   6   10:getfield        #455 <Field Player player>
	//*   7   13:ifnull          29
			player.removeListener(((com.google.android.exoplayer2.Player.EventListener) (componentListener)));
	//    8   16:aload_0         
	//    9   17:getfield        #455 <Field Player player>
	//   10   20:aload_0         
	//   11   21:getfield        #235 <Field PlayerControlView$ComponentListener componentListener>
	//   12   24:invokeinterface #795 <Method void Player.removeListener(com.google.android.exoplayer2.Player$EventListener)>
		player = player1;
	//   13   29:aload_0         
	//   14   30:aload_1         
	//   15   31:putfield        #455 <Field Player player>
		if(player1 != null)
	//*  16   34:aload_1         
	//*  17   35:ifnull          48
			player1.addListener(((com.google.android.exoplayer2.Player.EventListener) (componentListener)));
	//   18   38:aload_1         
	//   19   39:aload_0         
	//   20   40:getfield        #235 <Field PlayerControlView$ComponentListener componentListener>
	//   21   43:invokeinterface #797 <Method void Player.addListener(com.google.android.exoplayer2.Player$EventListener)>
		updateAll();
	//   22   48:aload_0         
	//   23   49:invokespecial   #775 <Method void updateAll()>
	//   24   52:return          
	}

	public void setRepeatToggleModes(int i)
	{
		repeatToggleModes = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #134 <Field int repeatToggleModes>
		if(player != null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #455 <Field Player player>
	//*   5    9:ifnull          97
		{
			int j = player.getRepeatMode();
	//    6   12:aload_0         
	//    7   13:getfield        #455 <Field Player player>
	//    8   16:invokeinterface #716 <Method int Player.getRepeatMode()>
	//    9   21:istore_2        
			if(i == 0 && j != 0)
	//*  10   22:iload_1         
	//*  11   23:ifne            46
	//*  12   26:iload_2         
	//*  13   27:ifeq            46
			{
				controlDispatcher.dispatchSetRepeatMode(player, 0);
	//   14   30:aload_0         
	//   15   31:getfield        #240 <Field ControlDispatcher controlDispatcher>
	//   16   34:aload_0         
	//   17   35:getfield        #455 <Field Player player>
	//   18   38:iconst_0        
	//   19   39:invokeinterface #802 <Method boolean ControlDispatcher.dispatchSetRepeatMode(Player, int)>
	//   20   44:pop             
				return;
	//   21   45:return          
			}
			if(i == 1 && j == 2)
	//*  22   46:iload_1         
	//*  23   47:iconst_1        
	//*  24   48:icmpne          72
	//*  25   51:iload_2         
	//*  26   52:iconst_2        
	//*  27   53:icmpne          72
			{
				controlDispatcher.dispatchSetRepeatMode(player, 1);
	//   28   56:aload_0         
	//   29   57:getfield        #240 <Field ControlDispatcher controlDispatcher>
	//   30   60:aload_0         
	//   31   61:getfield        #455 <Field Player player>
	//   32   64:iconst_1        
	//   33   65:invokeinterface #802 <Method boolean ControlDispatcher.dispatchSetRepeatMode(Player, int)>
	//   34   70:pop             
				return;
	//   35   71:return          
			}
			if(i == 2 && j == 1)
	//*  36   72:iload_1         
	//*  37   73:iconst_2        
	//*  38   74:icmpne          97
	//*  39   77:iload_2         
	//*  40   78:iconst_1        
	//*  41   79:icmpne          97
				controlDispatcher.dispatchSetRepeatMode(player, 2);
	//   42   82:aload_0         
	//   43   83:getfield        #240 <Field ControlDispatcher controlDispatcher>
	//   44   86:aload_0         
	//   45   87:getfield        #455 <Field Player player>
	//   46   90:iconst_2        
	//   47   91:invokeinterface #802 <Method boolean ControlDispatcher.dispatchSetRepeatMode(Player, int)>
	//   48   96:pop             
		}
	//   49   97:return          
	}

	public void setRewindIncrementMs(int i)
	{
		rewindMs = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #128 <Field int rewindMs>
		updateNavigation();
	//    3    5:aload_0         
	//    4    6:invokespecial   #397 <Method void updateNavigation()>
	//    5    9:return          
	}

	public void setShowMultiWindowTimeBar(boolean flag)
	{
		showMultiWindowTimeBar = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #728 <Field boolean showMultiWindowTimeBar>
		updateTimeBarMode();
	//    3    5:aload_0         
	//    4    6:invokespecial   #405 <Method void updateTimeBarMode()>
	//    5    9:return          
	}

	public void setShowShuffleButton(boolean flag)
	{
		showShuffleButton = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #140 <Field boolean showShuffleButton>
		updateShuffleButton();
	//    3    5:aload_0         
	//    4    6:invokespecial   #401 <Method void updateShuffleButton()>
	//    5    9:return          
	}

	public void setShowTimeoutMs(int i)
	{
		showTimeoutMs = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #132 <Field int showTimeoutMs>
		if(isVisible())
	//*   3    5:aload_0         
	//*   4    6:invokevirtual   #596 <Method boolean isVisible()>
	//*   5    9:ifeq            16
			hideAfterTimeout();
	//    6   12:aload_0         
	//    7   13:invokespecial   #465 <Method void hideAfterTimeout()>
	//    8   16:return          
	}

	public void setVisibilityListener(VisibilityListener visibilitylistener)
	{
		visibilityListener = visibilitylistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #762 <Field PlayerControlView$VisibilityListener visibilityListener>
	//    3    5:return          
	}

	public void show()
	{
		if(!isVisible())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #596 <Method boolean isVisible()>
	//*   2    4:ifne            40
		{
			setVisibility(0);
	//    3    7:aload_0         
	//    4    8:iconst_0        
	//    5    9:invokevirtual   #760 <Method void setVisibility(int)>
			if(visibilityListener != null)
	//*   6   12:aload_0         
	//*   7   13:getfield        #762 <Field PlayerControlView$VisibilityListener visibilityListener>
	//*   8   16:ifnull          32
				visibilityListener.onVisibilityChange(getVisibility());
	//    9   19:aload_0         
	//   10   20:getfield        #762 <Field PlayerControlView$VisibilityListener visibilityListener>
	//   11   23:aload_0         
	//   12   24:invokevirtual   #765 <Method int getVisibility()>
	//   13   27:invokeinterface #768 <Method void PlayerControlView$VisibilityListener.onVisibilityChange(int)>
			updateAll();
	//   14   32:aload_0         
	//   15   33:invokespecial   #775 <Method void updateAll()>
			requestPlayPauseFocus();
	//   16   36:aload_0         
	//   17   37:invokespecial   #607 <Method void requestPlayPauseFocus()>
		}
		hideAfterTimeout();
	//   18   40:aload_0         
	//   19   41:invokespecial   #465 <Method void hideAfterTimeout()>
	//   20   44:return          
	}

	public static final int DEFAULT_FAST_FORWARD_MS = 15000;
	public static final int DEFAULT_REPEAT_TOGGLE_MODES = 0;
	public static final int DEFAULT_REWIND_MS = 5000;
	public static final int DEFAULT_SHOW_TIMEOUT_MS = 5000;
	private static final long MAX_POSITION_FOR_SEEK_TO_PREVIOUS = 3000L;
	public static final int MAX_WINDOWS_FOR_MULTI_WINDOW_TIME_BAR = 100;
	private long adGroupTimesMs[];
	private final ComponentListener componentListener;
	private ControlDispatcher controlDispatcher;
	private final TextView durationView;
	private long extraAdGroupTimesMs[];
	private boolean extraPlayedAdGroups[];
	private final View fastForwardButton;
	private int fastForwardMs;
	private final StringBuilder formatBuilder;
	private final Formatter formatter;
	private final Runnable hideAction;
	private long hideAtMs;
	private boolean isAttachedToWindow;
	private boolean multiWindowTimeBar;
	private final View nextButton;
	private final View pauseButton;
	private final com.google.android.exoplayer2.Timeline.Period period;
	private final View playButton;
	private PlaybackPreparer playbackPreparer;
	private boolean playedAdGroups[];
	private Player player;
	private final TextView positionView;
	private final View previousButton;
	private final String repeatAllButtonContentDescription;
	private final Drawable repeatAllButtonDrawable;
	private final String repeatOffButtonContentDescription;
	private final Drawable repeatOffButtonDrawable;
	private final String repeatOneButtonContentDescription;
	private final Drawable repeatOneButtonDrawable;
	private final ImageView repeatToggleButton;
	private int repeatToggleModes;
	private final View rewindButton;
	private int rewindMs;
	private boolean scrubbing;
	private boolean showMultiWindowTimeBar;
	private boolean showShuffleButton;
	private int showTimeoutMs;
	private final View shuffleButton;
	private final TimeBar timeBar;
	private final Runnable updateProgressAction;
	private VisibilityListener visibilityListener;
	private final com.google.android.exoplayer2.Timeline.Window window;

	static 
	{
		ExoPlayerLibraryInfo.registerModule("goog.exo.ui");
	//    0    0:ldc1            #94  <String "goog.exo.ui">
	//    1    2:invokestatic    #100 <Method void ExoPlayerLibraryInfo.registerModule(String)>
	//*   2    5:return          
	}


/*
	static void access$000(PlayerControlView playercontrolview)
	{
		playercontrolview.updateProgress();
	//    0    0:aload_0         
	//    1    1:invokespecial   #385 <Method void updateProgress()>
		return;
	//    2    4:return          
	}

*/


/*
	static void access$1000(PlayerControlView playercontrolview)
	{
		playercontrolview.updatePlayPauseButton();
	//    0    0:aload_0         
	//    1    1:invokespecial   #389 <Method void updatePlayPauseButton()>
		return;
	//    2    4:return          
	}

*/


/*
	static void access$1100(PlayerControlView playercontrolview)
	{
		playercontrolview.updateRepeatModeButton();
	//    0    0:aload_0         
	//    1    1:invokespecial   #393 <Method void updateRepeatModeButton()>
		return;
	//    2    4:return          
	}

*/


/*
	static void access$1200(PlayerControlView playercontrolview)
	{
		playercontrolview.updateNavigation();
	//    0    0:aload_0         
	//    1    1:invokespecial   #397 <Method void updateNavigation()>
		return;
	//    2    4:return          
	}

*/


/*
	static void access$1300(PlayerControlView playercontrolview)
	{
		playercontrolview.updateShuffleButton();
	//    0    0:aload_0         
	//    1    1:invokespecial   #401 <Method void updateShuffleButton()>
		return;
	//    2    4:return          
	}

*/


/*
	static void access$1400(PlayerControlView playercontrolview)
	{
		playercontrolview.updateTimeBarMode();
	//    0    0:aload_0         
	//    1    1:invokespecial   #405 <Method void updateTimeBarMode()>
		return;
	//    2    4:return          
	}

*/


/*
	static View access$1500(PlayerControlView playercontrolview)
	{
		return playercontrolview.nextButton;
	//    0    0:aload_0         
	//    1    1:getfield        #310 <Field View nextButton>
	//    2    4:areturn         
	}

*/


/*
	static void access$1600(PlayerControlView playercontrolview)
	{
		playercontrolview.next();
	//    0    0:aload_0         
	//    1    1:invokespecial   #411 <Method void next()>
		return;
	//    2    4:return          
	}

*/


/*
	static View access$1700(PlayerControlView playercontrolview)
	{
		return playercontrolview.previousButton;
	//    0    0:aload_0         
	//    1    1:getfield        #305 <Field View previousButton>
	//    2    4:areturn         
	}

*/


/*
	static void access$1800(PlayerControlView playercontrolview)
	{
		playercontrolview.previous();
	//    0    0:aload_0         
	//    1    1:invokespecial   #416 <Method void previous()>
		return;
	//    2    4:return          
	}

*/


/*
	static View access$1900(PlayerControlView playercontrolview)
	{
		return playercontrolview.fastForwardButton;
	//    0    0:aload_0         
	//    1    1:getfield        #320 <Field View fastForwardButton>
	//    2    4:areturn         
	}

*/


/*
	static Runnable access$200(PlayerControlView playercontrolview)
	{
		return playercontrolview.hideAction;
	//    0    0:aload_0         
	//    1    1:getfield        #121 <Field Runnable hideAction>
	//    2    4:areturn         
	}

*/


/*
	static void access$2000(PlayerControlView playercontrolview)
	{
		playercontrolview.fastForward();
	//    0    0:aload_0         
	//    1    1:invokespecial   #423 <Method void fastForward()>
		return;
	//    2    4:return          
	}

*/


/*
	static View access$2100(PlayerControlView playercontrolview)
	{
		return playercontrolview.rewindButton;
	//    0    0:aload_0         
	//    1    1:getfield        #315 <Field View rewindButton>
	//    2    4:areturn         
	}

*/


/*
	static void access$2200(PlayerControlView playercontrolview)
	{
		playercontrolview.rewind();
	//    0    0:aload_0         
	//    1    1:invokespecial   #428 <Method void rewind()>
		return;
	//    2    4:return          
	}

*/


/*
	static View access$2300(PlayerControlView playercontrolview)
	{
		return playercontrolview.playButton;
	//    0    0:aload_0         
	//    1    1:getfield        #289 <Field View playButton>
	//    2    4:areturn         
	}

*/


/*
	static PlaybackPreparer access$2400(PlayerControlView playercontrolview)
	{
		return playercontrolview.playbackPreparer;
	//    0    0:aload_0         
	//    1    1:getfield        #433 <Field PlaybackPreparer playbackPreparer>
	//    2    4:areturn         
	}

*/


/*
	static ControlDispatcher access$2500(PlayerControlView playercontrolview)
	{
		return playercontrolview.controlDispatcher;
	//    0    0:aload_0         
	//    1    1:getfield        #240 <Field ControlDispatcher controlDispatcher>
	//    2    4:areturn         
	}

*/


/*
	static View access$2600(PlayerControlView playercontrolview)
	{
		return playercontrolview.pauseButton;
	//    0    0:aload_0         
	//    1    1:getfield        #300 <Field View pauseButton>
	//    2    4:areturn         
	}

*/


/*
	static ImageView access$2700(PlayerControlView playercontrolview)
	{
		return playercontrolview.repeatToggleButton;
	//    0    0:aload_0         
	//    1    1:getfield        #327 <Field ImageView repeatToggleButton>
	//    2    4:areturn         
	}

*/


/*
	static int access$2800(PlayerControlView playercontrolview)
	{
		return playercontrolview.repeatToggleModes;
	//    0    0:aload_0         
	//    1    1:getfield        #134 <Field int repeatToggleModes>
	//    2    4:ireturn         
	}

*/


/*
	static View access$2900(PlayerControlView playercontrolview)
	{
		return playercontrolview.shuffleButton;
	//    0    0:aload_0         
	//    1    1:getfield        #333 <Field View shuffleButton>
	//    2    4:areturn         
	}

*/


/*
	static boolean access$302(PlayerControlView playercontrolview, boolean flag)
	{
		playercontrolview.scrubbing = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #445 <Field boolean scrubbing>
		return flag;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

*/


/*
	static TextView access$400(PlayerControlView playercontrolview)
	{
		return playercontrolview.positionView;
	//    0    0:aload_0         
	//    1    1:getfield        #273 <Field TextView positionView>
	//    2    4:areturn         
	}

*/


/*
	static StringBuilder access$500(PlayerControlView playercontrolview)
	{
		return playercontrolview.formatBuilder;
	//    0    0:aload_0         
	//    1    1:getfield        #209 <Field StringBuilder formatBuilder>
	//    2    4:areturn         
	}

*/


/*
	static Formatter access$600(PlayerControlView playercontrolview)
	{
		return playercontrolview.formatter;
	//    0    0:aload_0         
	//    1    1:getfield        #222 <Field Formatter formatter>
	//    2    4:areturn         
	}

*/


/*
	static Player access$700(PlayerControlView playercontrolview)
	{
		return playercontrolview.player;
	//    0    0:aload_0         
	//    1    1:getfield        #455 <Field Player player>
	//    2    4:areturn         
	}

*/


/*
	static void access$800(PlayerControlView playercontrolview, long l)
	{
		playercontrolview.seekToTimeBarPosition(l);
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:invokespecial   #461 <Method void seekToTimeBarPosition(long)>
		return;
	//    3    5:return          
	}

*/


/*
	static void access$900(PlayerControlView playercontrolview)
	{
		playercontrolview.hideAfterTimeout();
	//    0    0:aload_0         
	//    1    1:invokespecial   #465 <Method void hideAfterTimeout()>
		return;
	//    2    4:return          
	}

*/
}
