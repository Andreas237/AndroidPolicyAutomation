// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.server;

import android.net.LocalSocket;
import java.io.IOException;

public interface SocketHandler
{

	public abstract void onAccepted(LocalSocket localsocket)
		throws IOException;
}
