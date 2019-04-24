// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2;


// Referenced classes of package com.google.android.exoplayer2:
//			Player

public interface ControlDispatcher
{

	public abstract boolean dispatchSeekTo(Player player, int i, long l);

	public abstract boolean dispatchSetPlayWhenReady(Player player, boolean flag);

	public abstract boolean dispatchSetRepeatMode(Player player, int i);

	public abstract boolean dispatchSetShuffleModeEnabled(Player player, boolean flag);

	public abstract boolean dispatchStop(Player player, boolean flag);
}
