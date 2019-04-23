// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media;

import android.content.Context;

// Referenced classes of package android.support.v4.media:
//			MediaSessionManager

static interface MediaSessionManager$MediaSessionManagerImpl
{

	public abstract Context getContext();

	public abstract boolean isTrustedForMediaControl(MediaSessionManager.RemoteUserInfoImpl remoteuserinfoimpl);
}
