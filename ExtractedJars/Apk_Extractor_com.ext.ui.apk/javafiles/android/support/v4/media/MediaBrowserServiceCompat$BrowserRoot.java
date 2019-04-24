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
	//    1    1:getfield        #42  <Field Bundle mExtras>
	//    2    4:areturn         
	}

	public String getRootId()
	{
		return mRootId;
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field String mRootId>
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
		if(s == null)
	//*   2    4:aload_1         
	//*   3    5:ifnonnull       18
		{
			throw new IllegalArgumentException("The root id in BrowserRoot cannot be null. Use null for BrowserRoot instead.");
	//    4    8:new             #33  <Class IllegalArgumentException>
	//    5   11:dup             
	//    6   12:ldc1            #35  <String "The root id in BrowserRoot cannot be null. Use null for BrowserRoot instead.">
	//    7   14:invokespecial   #38  <Method void IllegalArgumentException(String)>
	//    8   17:athrow          
		} else
		{
			mRootId = s;
	//    9   18:aload_0         
	//   10   19:aload_1         
	//   11   20:putfield        #40  <Field String mRootId>
			mExtras = bundle;
	//   12   23:aload_0         
	//   13   24:aload_2         
	//   14   25:putfield        #42  <Field Bundle mExtras>
			return;
	//   15   28:return          
		}
	}
}
