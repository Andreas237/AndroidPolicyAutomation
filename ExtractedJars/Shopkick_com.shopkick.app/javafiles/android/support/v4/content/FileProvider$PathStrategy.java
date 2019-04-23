// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.content;

import android.net.Uri;
import java.io.File;

// Referenced classes of package android.support.v4.content:
//			FileProvider

static interface FileProvider$PathStrategy
{

	public abstract File getFileForUri(Uri uri);

	public abstract Uri getUriForFile(File file);
}
