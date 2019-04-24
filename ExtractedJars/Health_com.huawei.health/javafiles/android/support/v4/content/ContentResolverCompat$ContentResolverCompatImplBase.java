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

static class ContentResolverCompat$ContentResolverCompatImplBase
	implements ContentResolverCompat.ContentResolverCompatImpl
{

	public Cursor query(ContentResolver contentresolver, Uri uri, String as[], String s, String as1[], String s1, CancellationSignal cancellationsignal)
	{
		if(cancellationsignal != null)
	//*   0    0:aload           7
	//*   1    2:ifnull          10
			cancellationsignal.throwIfCanceled();
	//    2    5:aload           7
	//    3    7:invokevirtual   #21  <Method void CancellationSignal.throwIfCanceled()>
		return contentresolver.query(uri, as, s, as1, s1);
	//    4   10:aload_1         
	//    5   11:aload_2         
	//    6   12:aload_3         
	//    7   13:aload           4
	//    8   15:aload           5
	//    9   17:aload           6
	//   10   19:invokevirtual   #26  <Method Cursor ContentResolver.query(Uri, String[], String, String[], String)>
	//   11   22:areturn         
	}

	ContentResolverCompat$ContentResolverCompatImplBase()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}
}
