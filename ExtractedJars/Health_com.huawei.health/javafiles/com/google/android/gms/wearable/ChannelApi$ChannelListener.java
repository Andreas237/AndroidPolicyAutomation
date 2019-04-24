// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.wearable;


// Referenced classes of package com.google.android.gms.wearable:
//			ChannelApi, Channel

public static interface ChannelApi$ChannelListener
{

	public abstract void onChannelClosed(Channel channel, int i, int j);

	public abstract void onChannelOpened(Channel channel);

	public abstract void onInputClosed(Channel channel, int i, int j);

	public abstract void onOutputClosed(Channel channel, int i, int j);

	public static final int CLOSE_REASON_DISCONNECTED = 1;
	public static final int CLOSE_REASON_LOCAL_CLOSE = 3;
	public static final int CLOSE_REASON_NORMAL = 0;
	public static final int CLOSE_REASON_REMOTE_CLOSE = 2;
}
