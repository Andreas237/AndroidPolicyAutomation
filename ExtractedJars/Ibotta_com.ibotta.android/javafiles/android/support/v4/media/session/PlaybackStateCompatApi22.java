// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media.session;

import android.media.session.PlaybackState;
import android.os.Bundle;

class PlaybackStateCompatApi22
{

	public static Bundle getExtras(Object obj)
	{
		return ((PlaybackState)obj).getExtras();
	//    0    0:aload_0         
	//    1    1:checkcast       #11  <Class PlaybackState>
	//    2    4:invokevirtual   #14  <Method Bundle PlaybackState.getExtras()>
	//    3    7:areturn         
	}
}
