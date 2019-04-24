// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.content;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.support.v4.os.CancellationSignal;

// Referenced classes of package android.support.v4.content:
//			ContentResolverCompat

static interface ContentResolverCompat$ContentResolverCompatImpl
{

	public abstract Cursor query(ContentResolver contentresolver, Uri uri, String as[], String s, String as1[], String s1, CancellationSignal cancellationsignal);
}
