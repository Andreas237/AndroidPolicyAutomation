// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.ui;

import android.view.TextureView;
import android.view.View;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.text.TextOutput;
import com.google.android.exoplayer2.trackselection.TrackSelectionArray;
import com.google.android.exoplayer2.video.VideoListener;
import java.util.List;

// Referenced classes of package com.google.android.exoplayer2.ui:
//			PlayerView, SubtitleView, AspectRatioFrameLayout

private final class PlayerView$ComponentListener extends com.google.android.exoplayer2.Player.DefaultEventListener
	implements TextOutput, VideoListener, android.view.View.OnLayoutChangeListener
{

	public void onCues(List list)
	{
		if(PlayerView.access$100(PlayerView.this) != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #19  <Field PlayerView this$0>
	//*   2    4:invokestatic    #32  <Method SubtitleView PlayerView.access$100(PlayerView)>
	//*   3    7:ifnull          21
			PlayerView.access$100(PlayerView.this).onCues(list);
	//    4   10:aload_0         
	//    5   11:getfield        #19  <Field PlayerView this$0>
	//    6   14:invokestatic    #32  <Method SubtitleView PlayerView.access$100(PlayerView)>
	//    7   17:aload_1         
	//    8   18:invokevirtual   #36  <Method void SubtitleView.onCues(List)>
	//    9   21:return          
	}

	public void onLayoutChange(View view, int i, int j, int k, int l, int i1, int j1, 
			int k1, int l1)
	{
		PlayerView.access$500((TextureView)view, PlayerView.access$400(PlayerView.this));
	//    0    0:aload_1         
	//    1    1:checkcast       #42  <Class TextureView>
	//    2    4:aload_0         
	//    3    5:getfield        #19  <Field PlayerView this$0>
	//    4    8:invokestatic    #46  <Method int PlayerView.access$400(PlayerView)>
	//    5   11:invokestatic    #50  <Method void PlayerView.access$500(TextureView, int)>
	//    6   14:return          
	}

	public void onPlayerStateChanged(boolean flag, int i)
	{
		PlayerView.access$800(PlayerView.this);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field PlayerView this$0>
	//    2    4:invokestatic    #55  <Method void PlayerView.access$800(PlayerView)>
		PlayerView.access$900(PlayerView.this);
	//    3    7:aload_0         
	//    4    8:getfield        #19  <Field PlayerView this$0>
	//    5   11:invokestatic    #58  <Method void PlayerView.access$900(PlayerView)>
		if(PlayerView.access$1000(PlayerView.this) && PlayerView.access$1100(PlayerView.this))
	//*   6   14:aload_0         
	//*   7   15:getfield        #19  <Field PlayerView this$0>
	//*   8   18:invokestatic    #62  <Method boolean PlayerView.access$1000(PlayerView)>
	//*   9   21:ifeq            42
	//*  10   24:aload_0         
	//*  11   25:getfield        #19  <Field PlayerView this$0>
	//*  12   28:invokestatic    #65  <Method boolean PlayerView.access$1100(PlayerView)>
	//*  13   31:ifeq            42
		{
			hideController();
	//   14   34:aload_0         
	//   15   35:getfield        #19  <Field PlayerView this$0>
	//   16   38:invokevirtual   #68  <Method void PlayerView.hideController()>
			return;
	//   17   41:return          
		} else
		{
			PlayerView.access$1200(PlayerView.this, false);
	//   18   42:aload_0         
	//   19   43:getfield        #19  <Field PlayerView this$0>
	//   20   46:iconst_0        
	//   21   47:invokestatic    #72  <Method void PlayerView.access$1200(PlayerView, boolean)>
			return;
	//   22   50:return          
		}
	}

	public void onPositionDiscontinuity(int i)
	{
		if(PlayerView.access$1000(PlayerView.this) && PlayerView.access$1100(PlayerView.this))
	//*   0    0:aload_0         
	//*   1    1:getfield        #19  <Field PlayerView this$0>
	//*   2    4:invokestatic    #62  <Method boolean PlayerView.access$1000(PlayerView)>
	//*   3    7:ifeq            27
	//*   4   10:aload_0         
	//*   5   11:getfield        #19  <Field PlayerView this$0>
	//*   6   14:invokestatic    #65  <Method boolean PlayerView.access$1100(PlayerView)>
	//*   7   17:ifeq            27
			hideController();
	//    8   20:aload_0         
	//    9   21:getfield        #19  <Field PlayerView this$0>
	//   10   24:invokevirtual   #68  <Method void PlayerView.hideController()>
	//   11   27:return          
	}

	public void onRenderedFirstFrame()
	{
		if(PlayerView.access$600(PlayerView.this) != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #19  <Field PlayerView this$0>
	//*   2    4:invokestatic    #79  <Method View PlayerView.access$600(PlayerView)>
	//*   3    7:ifnull          21
			PlayerView.access$600(PlayerView.this).setVisibility(4);
	//    4   10:aload_0         
	//    5   11:getfield        #19  <Field PlayerView this$0>
	//    6   14:invokestatic    #79  <Method View PlayerView.access$600(PlayerView)>
	//    7   17:iconst_4        
	//    8   18:invokevirtual   #84  <Method void View.setVisibility(int)>
	//    9   21:return          
	}

	public void onTracksChanged(TrackGroupArray trackgrouparray, TrackSelectionArray trackselectionarray)
	{
		PlayerView.access$700(PlayerView.this, false);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field PlayerView this$0>
	//    2    4:iconst_0        
	//    3    5:invokestatic    #89  <Method void PlayerView.access$700(PlayerView, boolean)>
	//    4    8:return          
	}

	public void onVideoSizeChanged(int i, int j, int k, float f)
	{
		float f1;
label0:
		{
label1:
			{
				if(PlayerView.access$200(PlayerView.this) == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #19  <Field PlayerView this$0>
	//*   2    4:invokestatic    #95  <Method AspectRatioFrameLayout PlayerView.access$200(PlayerView)>
	//*   3    7:ifnonnull       11
					return;
	//    4   10:return          
				if(j != 0 && i != 0)
	//*   5   11:iload_2         
	//*   6   12:ifeq            35
	//*   7   15:iload_1         
	//*   8   16:ifne            22
	//*   9   19:goto            35
					f = ((float)i * f) / (float)j;
	//   10   22:iload_1         
	//   11   23:i2f             
	//   12   24:fload           4
	//   13   26:fmul            
	//   14   27:iload_2         
	//   15   28:i2f             
	//   16   29:fdiv            
	//   17   30:fstore          4
				else
	//*  18   32:goto            38
					f = 1.0F;
	//   19   35:fconst_1        
	//   20   36:fstore          4
				f1 = f;
	//   21   38:fload           4
	//   22   40:fstore          5
				if(!(PlayerView.access$300(PlayerView.this) instanceof TextureView))
					break label0;
	//   23   42:aload_0         
	//   24   43:getfield        #19  <Field PlayerView this$0>
	//   25   46:invokestatic    #98  <Method View PlayerView.access$300(PlayerView)>
	//   26   49:instanceof      #42  <Class TextureView>
	//   27   52:ifeq            149
				if(k != 90)
	//*  28   55:iload_3         
	//*  29   56:bipush          90
	//*  30   58:icmpeq          72
				{
					f1 = f;
	//   31   61:fload           4
	//   32   63:fstore          5
					if(k != 270)
						break label1;
	//   33   65:iload_3         
	//   34   66:sipush          270
	//   35   69:icmpne          78
				}
				f1 = 1.0F / f;
	//   36   72:fconst_1        
	//   37   73:fload           4
	//   38   75:fdiv            
	//   39   76:fstore          5
			}
			if(PlayerView.access$400(PlayerView.this) != 0)
	//*  40   78:aload_0         
	//*  41   79:getfield        #19  <Field PlayerView this$0>
	//*  42   82:invokestatic    #46  <Method int PlayerView.access$400(PlayerView)>
	//*  43   85:ifeq            99
				PlayerView.access$300(PlayerView.this).removeOnLayoutChangeListener(((android.view.View.OnLayoutChangeListener) (this)));
	//   44   88:aload_0         
	//   45   89:getfield        #19  <Field PlayerView this$0>
	//   46   92:invokestatic    #98  <Method View PlayerView.access$300(PlayerView)>
	//   47   95:aload_0         
	//   48   96:invokevirtual   #102 <Method void View.removeOnLayoutChangeListener(android.view.View$OnLayoutChangeListener)>
			PlayerView.access$402(PlayerView.this, k);
	//   49   99:aload_0         
	//   50  100:getfield        #19  <Field PlayerView this$0>
	//   51  103:iload_3         
	//   52  104:invokestatic    #106 <Method int PlayerView.access$402(PlayerView, int)>
	//   53  107:pop             
			if(PlayerView.access$400(PlayerView.this) != 0)
	//*  54  108:aload_0         
	//*  55  109:getfield        #19  <Field PlayerView this$0>
	//*  56  112:invokestatic    #46  <Method int PlayerView.access$400(PlayerView)>
	//*  57  115:ifeq            129
				PlayerView.access$300(PlayerView.this).addOnLayoutChangeListener(((android.view.View.OnLayoutChangeListener) (this)));
	//   58  118:aload_0         
	//   59  119:getfield        #19  <Field PlayerView this$0>
	//   60  122:invokestatic    #98  <Method View PlayerView.access$300(PlayerView)>
	//   61  125:aload_0         
	//   62  126:invokevirtual   #109 <Method void View.addOnLayoutChangeListener(android.view.View$OnLayoutChangeListener)>
			PlayerView.access$500((TextureView)PlayerView.access$300(PlayerView.this), PlayerView.access$400(PlayerView.this));
	//   63  129:aload_0         
	//   64  130:getfield        #19  <Field PlayerView this$0>
	//   65  133:invokestatic    #98  <Method View PlayerView.access$300(PlayerView)>
	//   66  136:checkcast       #42  <Class TextureView>
	//   67  139:aload_0         
	//   68  140:getfield        #19  <Field PlayerView this$0>
	//   69  143:invokestatic    #46  <Method int PlayerView.access$400(PlayerView)>
	//   70  146:invokestatic    #50  <Method void PlayerView.access$500(TextureView, int)>
		}
		PlayerView.access$200(PlayerView.this).setAspectRatio(f1);
	//   71  149:aload_0         
	//   72  150:getfield        #19  <Field PlayerView this$0>
	//   73  153:invokestatic    #95  <Method AspectRatioFrameLayout PlayerView.access$200(PlayerView)>
	//   74  156:fload           5
	//   75  158:invokevirtual   #115 <Method void AspectRatioFrameLayout.setAspectRatio(float)>
	//   76  161:return          
	}

	final PlayerView this$0;

	private PlayerView$ComponentListener()
	{
		this$0 = PlayerView.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field PlayerView this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #22  <Method void com.google.android.exoplayer2.Player$DefaultEventListener()>
	//    5    9:return          
	}

	PlayerView$ComponentListener(PlayerView._cls1 _pcls1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #26  <Method void PlayerView$ComponentListener(PlayerView)>
	//    3    5:return          
	}
}
