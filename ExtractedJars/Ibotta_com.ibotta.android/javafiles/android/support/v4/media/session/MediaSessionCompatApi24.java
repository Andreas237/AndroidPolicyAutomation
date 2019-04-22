// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media.session;

import android.net.Uri;
import android.os.Bundle;

class MediaSessionCompatApi24
{
	public static interface Callback
		extends MediaSessionCompatApi23.Callback
	{

		public abstract void onPrepare();

		public abstract void onPrepareFromMediaId(String s, Bundle bundle);

		public abstract void onPrepareFromSearch(String s, Bundle bundle);

		public abstract void onPrepareFromUri(Uri uri, Bundle bundle);
	}

}
