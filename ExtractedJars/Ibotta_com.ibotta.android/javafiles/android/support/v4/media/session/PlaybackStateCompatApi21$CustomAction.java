// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media.session;

import android.os.Bundle;

// Referenced classes of package android.support.v4.media.session:
//			PlaybackStateCompatApi21

static final class PlaybackStateCompatApi21$CustomAction
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
