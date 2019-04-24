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
//			ContentResolverCompatJellybean

public final class ContentResolverCompat
{
	static interface ContentResolverCompatImpl
	{

		public abstract Cursor query(ContentResolver contentresolver, Uri uri, String as[], String s, String as1[], String s1, CancellationSignal cancellationsignal);
	}

	static class ContentResolverCompatImplBase
		implements ContentResolverCompatImpl
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

		ContentResolverCompatImplBase()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #13  <Method void Object()>
		//    2    4:return          
		}
	}

	static class ContentResolverCompatImplJB extends ContentResolverCompatImplBase
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

		ContentResolverCompatImplJB()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #11  <Method void ContentResolverCompat$ContentResolverCompatImplBase()>
		//    2    4:return          
		}
	}


	private ContentResolverCompat()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #31  <Method void Object()>
	//    2    4:return          
	}

	public static Cursor query(ContentResolver contentresolver, Uri uri, String as[], String s, String as1[], String s1, CancellationSignal cancellationsignal)
	{
		return IMPL.query(contentresolver, uri, as, s, as1, s1, cancellationsignal);
	//    0    0:getstatic       #28  <Field ContentResolverCompat$ContentResolverCompatImpl IMPL>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:aload           4
	//    6    9:aload           5
	//    7   11:aload           6
	//    8   13:invokeinterface #35  <Method Cursor ContentResolverCompat$ContentResolverCompatImpl.query(ContentResolver, Uri, String[], String, String[], String, CancellationSignal)>
	//    9   18:areturn         
	}

	private static final ContentResolverCompatImpl IMPL;

	static 
	{
		if(android.os.Build.VERSION.SDK_INT >= 16)
	//*   0    0:getstatic       #23  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          16
	//*   2    5:icmplt          19
			IMPL = ((ContentResolverCompatImpl) (new ContentResolverCompatImplJB()));
	//    3    8:new             #12  <Class ContentResolverCompat$ContentResolverCompatImplJB>
	//    4   11:dup             
	//    5   12:invokespecial   #26  <Method void ContentResolverCompat$ContentResolverCompatImplJB()>
	//    6   15:putstatic       #28  <Field ContentResolverCompat$ContentResolverCompatImpl IMPL>
	//    7   18:return          
		else
			IMPL = ((ContentResolverCompatImpl) (new ContentResolverCompatImplBase()));
	//    8   19:new             #9   <Class ContentResolverCompat$ContentResolverCompatImplBase>
	//    9   22:dup             
	//   10   23:invokespecial   #29  <Method void ContentResolverCompat$ContentResolverCompatImplBase()>
	//   11   26:putstatic       #28  <Field ContentResolverCompat$ContentResolverCompatImpl IMPL>
	//*  12   29:return          
	}
}
