// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bolts;

import android.net.Uri;

// Referenced classes of package bolts:
//			Task

public interface AppLinkResolver
{

	public abstract Task getAppLinkFromUrlInBackground(Uri uri);
}
