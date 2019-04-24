// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.wearable;

import android.net.Uri;
import com.google.android.gms.common.api.*;
import java.lang.annotation.Annotation;

// Referenced classes of package com.google.android.gms.wearable:
//			MessageEvent

public interface MessageApi
{
	public static interface FilterType
		extends Annotation
	{
	}

	public static interface MessageListener
	{

		public abstract void onMessageReceived(MessageEvent messageevent);
	}

	public static interface SendMessageResult
		extends Result
	{

		public abstract int getRequestId();
	}


	public abstract PendingResult addListener(GoogleApiClient googleapiclient, MessageListener messagelistener);

	public abstract PendingResult addListener(GoogleApiClient googleapiclient, MessageListener messagelistener, Uri uri, int i);

	public abstract PendingResult removeListener(GoogleApiClient googleapiclient, MessageListener messagelistener);

	public abstract PendingResult sendMessage(GoogleApiClient googleapiclient, String s, String s1, byte abyte0[]);

	public static final String ACTION_MESSAGE_RECEIVED = "com.google.android.gms.wearable.MESSAGE_RECEIVED";
	public static final int FILTER_LITERAL = 0;
	public static final int FILTER_PREFIX = 1;
	public static final int UNKNOWN_REQUEST_ID = -1;
}
