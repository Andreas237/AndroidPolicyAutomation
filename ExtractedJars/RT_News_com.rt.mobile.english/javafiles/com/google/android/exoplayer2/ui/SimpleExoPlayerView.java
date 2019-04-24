// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.ui;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.exoplayer2.SimpleExoPlayer;

// Referenced classes of package com.google.android.exoplayer2.ui:
//			PlayerView

public final class SimpleExoPlayerView extends PlayerView
{

	public SimpleExoPlayerView(Context context)
	{
		super(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #12  <Method void PlayerView(Context)>
	//    3    5:return          
	}

	public SimpleExoPlayerView(Context context, AttributeSet attributeset)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #16  <Method void PlayerView(Context, AttributeSet)>
	//    4    6:return          
	}

	public SimpleExoPlayerView(Context context, AttributeSet attributeset, int i)
	{
		super(context, attributeset, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #19  <Method void PlayerView(Context, AttributeSet, int)>
	//    5    7:return          
	}

	public static void switchTargetView(SimpleExoPlayer simpleexoplayer, SimpleExoPlayerView simpleexoplayerview, SimpleExoPlayerView simpleexoplayerview1)
	{
		PlayerView.switchTargetView(((com.google.android.exoplayer2.Player) (simpleexoplayer)), ((PlayerView) (simpleexoplayerview)), ((PlayerView) (simpleexoplayerview1)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokestatic    #26  <Method void PlayerView.switchTargetView(com.google.android.exoplayer2.Player, PlayerView, PlayerView)>
	//    4    6:return          
	}
}
