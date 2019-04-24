// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.ui;

import com.google.android.exoplayer2.*;

// Referenced classes of package com.google.android.exoplayer2.ui:
//			PlayerNotificationManager

private class PlayerNotificationManager$PlayerListener extends com.google.android.exoplayer2.Player.DefaultEventListener
{

	public void onPlaybackParametersChanged(PlaybackParameters playbackparameters)
	{
		if(PlayerNotificationManager.access$000(PlayerNotificationManager.this) != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #13  <Field PlayerNotificationManager this$0>
	//*   2    4:invokestatic    #26  <Method Player PlayerNotificationManager.access$000(PlayerNotificationManager)>
	//*   3    7:ifnull          35
		{
			if(PlayerNotificationManager.access$000(PlayerNotificationManager.this).getPlaybackState() == 1)
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
				PlayerNotificationManager.access$1000(PlayerNotificationManager.this);
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
		if(PlayerNotificationManager.access$800(PlayerNotificationManager.this) != flag && i != 1 || PlayerNotificationManager.access$900(PlayerNotificationManager.this) != i)
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
			PlayerNotificationManager.access$1000(PlayerNotificationManager.this);
	//   13   27:aload_0         
	//   14   28:getfield        #13  <Field PlayerNotificationManager this$0>
	//   15   31:invokestatic    #35  <Method void PlayerNotificationManager.access$1000(PlayerNotificationManager)>
		PlayerNotificationManager.access$802(PlayerNotificationManager.this, flag);
	//   16   34:aload_0         
	//   17   35:getfield        #13  <Field PlayerNotificationManager this$0>
	//   18   38:iload_1         
	//   19   39:invokestatic    #49  <Method boolean PlayerNotificationManager.access$802(PlayerNotificationManager, boolean)>
	//   20   42:pop             
		PlayerNotificationManager.access$902(PlayerNotificationManager.this, i);
	//   21   43:aload_0         
	//   22   44:getfield        #13  <Field PlayerNotificationManager this$0>
	//   23   47:iload_2         
	//   24   48:invokestatic    #53  <Method int PlayerNotificationManager.access$902(PlayerNotificationManager, int)>
	//   25   51:pop             
	//   26   52:return          
	}

	public void onPositionDiscontinuity(int i)
	{
		PlayerNotificationManager.access$1000(PlayerNotificationManager.this);
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field PlayerNotificationManager this$0>
	//    2    4:invokestatic    #35  <Method void PlayerNotificationManager.access$1000(PlayerNotificationManager)>
	//    3    7:return          
	}

	public void onRepeatModeChanged(int i)
	{
		if(PlayerNotificationManager.access$000(PlayerNotificationManager.this) != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #13  <Field PlayerNotificationManager this$0>
	//*   2    4:invokestatic    #26  <Method Player PlayerNotificationManager.access$000(PlayerNotificationManager)>
	//*   3    7:ifnull          35
		{
			if(PlayerNotificationManager.access$000(PlayerNotificationManager.this).getPlaybackState() == 1)
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
				PlayerNotificationManager.access$1000(PlayerNotificationManager.this);
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
		if(PlayerNotificationManager.access$000(PlayerNotificationManager.this) != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #13  <Field PlayerNotificationManager this$0>
	//*   2    4:invokestatic    #26  <Method Player PlayerNotificationManager.access$000(PlayerNotificationManager)>
	//*   3    7:ifnull          35
		{
			if(PlayerNotificationManager.access$000(PlayerNotificationManager.this).getPlaybackState() == 1)
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
				PlayerNotificationManager.access$1000(PlayerNotificationManager.this);
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

	private PlayerNotificationManager$PlayerListener()
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

	PlayerNotificationManager$PlayerListener(PlayerNotificationManager._cls1 _pcls1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #20  <Method void PlayerNotificationManager$PlayerListener(PlayerNotificationManager)>
	//    3    5:return          
	}
}
