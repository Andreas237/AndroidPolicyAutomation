// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.content;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.OperationCanceledException;

class ContentResolverCompatJellybean
{

	ContentResolverCompatJellybean()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	static boolean isFrameworkOperationCanceledException(Exception exception)
	{
		return exception instanceof OperationCanceledException;
	//    0    0:aload_0         
	//    1    1:instanceof      #16  <Class OperationCanceledException>
	//    2    4:ireturn         
	}

	public static Cursor query(ContentResolver contentresolver, Uri uri, String as[], String s, String as1[], String s1, Object obj)
	{
		return contentresolver.query(uri, as, s, as1, s1, (CancellationSignal)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:aload           5
	//    6    8:aload           6
	//    7   10:checkcast       #20  <Class CancellationSignal>
	//    8   13:invokevirtual   #25  <Method Cursor ContentResolver.query(Uri, String[], String, String[], String, CancellationSignal)>
	//    9   16:areturn         
	}
}
