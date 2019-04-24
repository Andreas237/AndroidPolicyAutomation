// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.ui;

import android.content.Context;
import android.util.AttributeSet;

// Referenced classes of package com.google.android.exoplayer2.ui:
//			PlayerControlView

public class PlaybackControlView extends PlayerControlView
{
	public static interface ControlDispatcher
		extends com.google.android.exoplayer2.ControlDispatcher
	{
	}

	private static final class DefaultControlDispatcher extends com.google.android.exoplayer2.DefaultControlDispatcher
		implements ControlDispatcher
	{

		private DefaultControlDispatcher()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #13  <Method void com.google.android.exoplayer2.DefaultControlDispatcher()>
		//    2    4:return          
		}

	}

	public static interface VisibilityListener
		extends PlayerControlView.VisibilityListener
	{
	}


	public PlaybackControlView(Context context)
	{
		super(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #40  <Method void PlayerControlView(Context)>
	//    3    5:return          
	}

	public PlaybackControlView(Context context, AttributeSet attributeset)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #43  <Method void PlayerControlView(Context, AttributeSet)>
	//    4    6:return          
	}

	public PlaybackControlView(Context context, AttributeSet attributeset, int i)
	{
		super(context, attributeset, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #46  <Method void PlayerControlView(Context, AttributeSet, int)>
	//    5    7:return          
	}

	public PlaybackControlView(Context context, AttributeSet attributeset, int i, AttributeSet attributeset1)
	{
		super(context, attributeset, i, attributeset1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:aload           4
	//    5    6:invokespecial   #49  <Method void PlayerControlView(Context, AttributeSet, int, AttributeSet)>
	//    6    9:return          
	}

	public static final ControlDispatcher DEFAULT_CONTROL_DISPATCHER = new DefaultControlDispatcher();
	public static final int DEFAULT_FAST_FORWARD_MS = 15000;
	public static final int DEFAULT_REPEAT_TOGGLE_MODES = 0;
	public static final int DEFAULT_REWIND_MS = 5000;
	public static final int DEFAULT_SHOW_TIMEOUT_MS = 5000;
	public static final int MAX_WINDOWS_FOR_MULTI_WINDOW_TIME_BAR = 100;

	static 
	{
	//    0    0:new             #11  <Class PlaybackControlView$DefaultControlDispatcher>
	//    1    3:dup             
	//    2    4:aconst_null     
	//    3    5:invokespecial   #34  <Method void PlaybackControlView$DefaultControlDispatcher(PlaybackControlView$1)>
	//    4    8:putstatic       #36  <Field PlaybackControlView$ControlDispatcher DEFAULT_CONTROL_DISPATCHER>
	//*   5   11:return          
	}
}
