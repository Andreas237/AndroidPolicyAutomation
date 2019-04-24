// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.media;

import android.os.Bundle;

// Referenced classes of package android.support.v7.media:
//			RemotePlaybackClient, MediaSessionStatus, MediaItemStatus

public static abstract class RemotePlaybackClient$StatusCallback
{

	public void onItemStatusChanged(Bundle bundle, String s, MediaSessionStatus mediasessionstatus, String s1, MediaItemStatus mediaitemstatus)
	{
	//    0    0:return          
	}

	public void onSessionChanged(String s)
	{
	//    0    0:return          
	}

	public void onSessionStatusChanged(Bundle bundle, String s, MediaSessionStatus mediasessionstatus)
	{
	//    0    0:return          
	}

	public RemotePlaybackClient$StatusCallback()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}
}
