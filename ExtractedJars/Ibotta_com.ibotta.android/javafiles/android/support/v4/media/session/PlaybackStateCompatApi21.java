// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media.session;

import android.media.session.PlaybackState;
import android.os.Bundle;
import java.util.List;

class PlaybackStateCompatApi21
{
	static final class CustomAction
	{

		public static String getAction(Object obj)
		{
			return ((android.media.session.PlaybackState.CustomAction)obj).getAction();
		//    0    0:aload_0         
		//    1    1:checkcast       #11  <Class android.media.session.PlaybackState$CustomAction>
		//    2    4:invokevirtual   #14  <Method String android.media.session.PlaybackState$CustomAction.getAction()>
		//    3    7:areturn         
		}

		public static Bundle getExtras(Object obj)
		{
			return ((android.media.session.PlaybackState.CustomAction)obj).getExtras();
		//    0    0:aload_0         
		//    1    1:checkcast       #11  <Class android.media.session.PlaybackState$CustomAction>
		//    2    4:invokevirtual   #20  <Method Bundle android.media.session.PlaybackState$CustomAction.getExtras()>
		//    3    7:areturn         
		}

		public static int getIcon(Object obj)
		{
			return ((android.media.session.PlaybackState.CustomAction)obj).getIcon();
		//    0    0:aload_0         
		//    1    1:checkcast       #11  <Class android.media.session.PlaybackState$CustomAction>
		//    2    4:invokevirtual   #25  <Method int android.media.session.PlaybackState$CustomAction.getIcon()>
		//    3    7:ireturn         
		}

		public static CharSequence getName(Object obj)
		{
			return ((android.media.session.PlaybackState.CustomAction)obj).getName();
		//    0    0:aload_0         
		//    1    1:checkcast       #11  <Class android.media.session.PlaybackState$CustomAction>
		//    2    4:invokevirtual   #30  <Method CharSequence android.media.session.PlaybackState$CustomAction.getName()>
		//    3    7:areturn         
		}
	}


	public static long getActions(Object obj)
	{
		return ((PlaybackState)obj).getActions();
	//    0    0:aload_0         
	//    1    1:checkcast       #14  <Class PlaybackState>
	//    2    4:invokevirtual   #17  <Method long PlaybackState.getActions()>
	//    3    7:lreturn         
	}

	public static long getActiveQueueItemId(Object obj)
	{
		return ((PlaybackState)obj).getActiveQueueItemId();
	//    0    0:aload_0         
	//    1    1:checkcast       #14  <Class PlaybackState>
	//    2    4:invokevirtual   #21  <Method long PlaybackState.getActiveQueueItemId()>
	//    3    7:lreturn         
	}

	public static long getBufferedPosition(Object obj)
	{
		return ((PlaybackState)obj).getBufferedPosition();
	//    0    0:aload_0         
	//    1    1:checkcast       #14  <Class PlaybackState>
	//    2    4:invokevirtual   #24  <Method long PlaybackState.getBufferedPosition()>
	//    3    7:lreturn         
	}

	public static List getCustomActions(Object obj)
	{
		return ((PlaybackState)obj).getCustomActions();
	//    0    0:aload_0         
	//    1    1:checkcast       #14  <Class PlaybackState>
	//    2    4:invokevirtual   #29  <Method List PlaybackState.getCustomActions()>
	//    3    7:areturn         
	}

	public static CharSequence getErrorMessage(Object obj)
	{
		return ((PlaybackState)obj).getErrorMessage();
	//    0    0:aload_0         
	//    1    1:checkcast       #14  <Class PlaybackState>
	//    2    4:invokevirtual   #36  <Method CharSequence PlaybackState.getErrorMessage()>
	//    3    7:areturn         
	}

	public static long getLastPositionUpdateTime(Object obj)
	{
		return ((PlaybackState)obj).getLastPositionUpdateTime();
	//    0    0:aload_0         
	//    1    1:checkcast       #14  <Class PlaybackState>
	//    2    4:invokevirtual   #39  <Method long PlaybackState.getLastPositionUpdateTime()>
	//    3    7:lreturn         
	}

	public static float getPlaybackSpeed(Object obj)
	{
		return ((PlaybackState)obj).getPlaybackSpeed();
	//    0    0:aload_0         
	//    1    1:checkcast       #14  <Class PlaybackState>
	//    2    4:invokevirtual   #44  <Method float PlaybackState.getPlaybackSpeed()>
	//    3    7:freturn         
	}

	public static long getPosition(Object obj)
	{
		return ((PlaybackState)obj).getPosition();
	//    0    0:aload_0         
	//    1    1:checkcast       #14  <Class PlaybackState>
	//    2    4:invokevirtual   #47  <Method long PlaybackState.getPosition()>
	//    3    7:lreturn         
	}

	public static int getState(Object obj)
	{
		return ((PlaybackState)obj).getState();
	//    0    0:aload_0         
	//    1    1:checkcast       #14  <Class PlaybackState>
	//    2    4:invokevirtual   #52  <Method int PlaybackState.getState()>
	//    3    7:ireturn         
	}
}
