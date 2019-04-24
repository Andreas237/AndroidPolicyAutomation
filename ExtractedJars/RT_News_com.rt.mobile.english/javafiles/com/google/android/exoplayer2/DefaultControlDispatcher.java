// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2;


// Referenced classes of package com.google.android.exoplayer2:
//			ControlDispatcher, Player

public class DefaultControlDispatcher
	implements ControlDispatcher
{

	public DefaultControlDispatcher()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void Object()>
	//    2    4:return          
	}

	public boolean dispatchSeekTo(Player player, int i, long l)
	{
		player.seekTo(i, l);
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:lload_3         
	//    3    3:invokeinterface #19  <Method void Player.seekTo(int, long)>
		return true;
	//    4    8:iconst_1        
	//    5    9:ireturn         
	}

	public boolean dispatchSetPlayWhenReady(Player player, boolean flag)
	{
		player.setPlayWhenReady(flag);
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:invokeinterface #25  <Method void Player.setPlayWhenReady(boolean)>
		return true;
	//    3    7:iconst_1        
	//    4    8:ireturn         
	}

	public boolean dispatchSetRepeatMode(Player player, int i)
	{
		player.setRepeatMode(i);
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:invokeinterface #31  <Method void Player.setRepeatMode(int)>
		return true;
	//    3    7:iconst_1        
	//    4    8:ireturn         
	}

	public boolean dispatchSetShuffleModeEnabled(Player player, boolean flag)
	{
		player.setShuffleModeEnabled(flag);
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:invokeinterface #35  <Method void Player.setShuffleModeEnabled(boolean)>
		return true;
	//    3    7:iconst_1        
	//    4    8:ireturn         
	}

	public boolean dispatchStop(Player player, boolean flag)
	{
		player.stop(flag);
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:invokeinterface #39  <Method void Player.stop(boolean)>
		return true;
	//    3    7:iconst_1        
	//    4    8:ireturn         
	}
}
