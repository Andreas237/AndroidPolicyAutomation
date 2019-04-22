// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media;

import android.app.Service;
import android.content.Intent;
import android.os.*;
import android.util.Log;
import java.lang.annotation.Annotation;
import java.util.List;

public abstract class MediaBrowserServiceCompat extends Service
{
	static interface MediaBrowserServiceImpl
	{

		public abstract Bundle getBrowserRootHints();

		public abstract void notifyChildrenChanged(String s, Bundle bundle);

		public abstract IBinder onBind(Intent intent);

		public abstract void onCreate();

		public abstract void setSessionToken(android.support.v4.media.session.MediaSessionCompat.Token token);
	}

	private static interface ResultFlags
		extends Annotation
	{
	}

	private static interface ServiceCallbacks
	{

		public abstract IBinder asBinder();

		public abstract void onConnect(String s, android.support.v4.media.session.MediaSessionCompat.Token token, Bundle bundle)
			throws RemoteException;

		public abstract void onConnectFailed()
			throws RemoteException;

		public abstract void onLoadChildren(String s, List list, Bundle bundle)
			throws RemoteException;
	}


	static final boolean DEBUG = Log.isLoggable("MBServiceCompat", 3);

	static 
	{
	//    0    0:ldc1            #19  <String "MBServiceCompat">
	//    1    2:iconst_3        
	//    2    3:invokestatic    #25  <Method boolean Log.isLoggable(String, int)>
	//    3    6:putstatic       #27  <Field boolean DEBUG>
	//*   4    9:return          
	}
}
