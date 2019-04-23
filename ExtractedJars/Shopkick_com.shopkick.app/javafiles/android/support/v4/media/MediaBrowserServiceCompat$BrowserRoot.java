// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media;

import android.os.Bundle;

// Referenced classes of package android.support.v4.media:
//			MediaBrowserServiceCompat

public static final class MediaBrowserServiceCompat$BrowserRoot
{

	public Bundle getExtras()
	{
		return mExtras;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field Bundle mExtras>
	//    2    4:areturn         
	}

	public String getRootId()
	{
		return mRootId;
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field String mRootId>
	//    2    4:areturn         
	}

	public static final String EXTRA_OFFLINE = "android.service.media.extra.OFFLINE";
	public static final String EXTRA_RECENT = "android.service.media.extra.RECENT";
	public static final String EXTRA_SUGGESTED = "android.service.media.extra.SUGGESTED";
	public static final String EXTRA_SUGGESTION_KEYWORDS = "android.service.media.extra.SUGGESTION_KEYWORDS";
	private final Bundle mExtras;
	private final String mRootId;

	public MediaBrowserServiceCompat$BrowserRoot(String s, Bundle bundle)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #31  <Method void Object()>
		if(s != null)
	//*   2    4:aload_1         
	//*   3    5:ifnull          19
		{
			mRootId = s;
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:putfield        #33  <Field String mRootId>
			mExtras = bundle;
	//    7   13:aload_0         
	//    8   14:aload_2         
	//    9   15:putfield        #35  <Field Bundle mExtras>
			return;
	//   10   18:return          
		} else
		{
			throw new IllegalArgumentException("The root id in BrowserRoot cannot be null. Use null for BrowserRoot instead.");
	//   11   19:new             #37  <Class IllegalArgumentException>
	//   12   22:dup             
	//   13   23:ldc1            #39  <String "The root id in BrowserRoot cannot be null. Use null for BrowserRoot instead.">
	//   14   25:invokespecial   #42  <Method void IllegalArgumentException(String)>
	//   15   28:athrow          
		}
	}
}
