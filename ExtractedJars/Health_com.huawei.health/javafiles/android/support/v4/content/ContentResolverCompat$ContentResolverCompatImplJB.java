// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.content;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.support.v4.os.CancellationSignal;
import android.support.v4.os.OperationCanceledException;

// Referenced classes of package android.support.v4.content:
//			ContentResolverCompat, ContentResolverCompatJellybean

static class ContentResolverCompat$ContentResolverCompatImplJB extends e
{

	public Cursor query(ContentResolver contentresolver, Uri uri, String as[], String s, String as1[], String s1, CancellationSignal cancellationsignal)
	{
		if(cancellationsignal != null)
	//*   0    0:aload           7
	//*   1    2:ifnull          50
			try
			{
				cancellationsignal = ((CancellationSignal) (cancellationsignal.getCancellationSignalObject()));
	//    2    5:aload           7
	//    3    7:invokevirtual   #22  <Method Object CancellationSignal.getCancellationSignalObject()>
	//    4   10:astore          7
			}
	//*   5   12:goto            15
	//*   6   15:aload_1         
	//*   7   16:aload_2         
	//*   8   17:aload_3         
	//*   9   18:aload           4
	//*  10   20:aload           5
	//*  11   22:aload           6
	//*  12   24:aload           7
	//*  13   26:invokestatic    #27  <Method Cursor ContentResolverCompatJellybean.query(ContentResolver, Uri, String[], String, String[], String, Object)>
	//*  14   29:astore_1        
	//*  15   30:aload_1         
	//*  16   31:areturn         
			// Misplaced declaration of an exception variable
			catch(ContentResolver contentresolver)
	//*  17   32:astore_1        
			{
				if(ContentResolverCompatJellybean.isFrameworkOperationCanceledException(((Exception) (contentresolver))))
	//*  18   33:aload_1         
	//*  19   34:invokestatic    #31  <Method boolean ContentResolverCompatJellybean.isFrameworkOperationCanceledException(Exception)>
	//*  20   37:ifeq            48
					throw new OperationCanceledException();
	//   21   40:new             #33  <Class OperationCanceledException>
	//   22   43:dup             
	//   23   44:invokespecial   #34  <Method void OperationCanceledException()>
	//   24   47:athrow          
				else
					throw contentresolver;
	//   25   48:aload_1         
	//   26   49:athrow          
			}
		else
			cancellationsignal = null;
	//   27   50:aconst_null     
	//   28   51:astore          7
		contentresolver = ((ContentResolver) (ContentResolverCompatJellybean.query(contentresolver, uri, as, s, as1, s1, ((Object) (cancellationsignal)))));
		return ((Cursor) (contentresolver));
	//*  29   53:goto            15
	}

	ContentResolverCompat$ContentResolverCompatImplJB()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void ContentResolverCompat$ContentResolverCompatImplBase()>
	//    2    4:return          
	}
}
