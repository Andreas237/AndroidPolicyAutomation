// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.content;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.os.OperationCanceledException;
import android.support.v4.os.CancellationSignal;

public final class ContentResolverCompat
{

	private ContentResolverCompat()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public static Cursor query(ContentResolver contentresolver, Uri uri, String as[], String s, String as1[], String s1, CancellationSignal cancellationsignal)
	{
		if(android.os.Build.VERSION.SDK_INT < 16)
			break MISSING_BLOCK_LABEL_66;
	//    0    0:getstatic       #19  <Field int android.os.Build$VERSION.SDK_INT>
	//    1    3:bipush          16
	//    2    5:icmplt          66
		if(cancellationsignal == null)
			break MISSING_BLOCK_LABEL_42;
	//    3    8:aload           6
	//    4   10:ifnull          42
		cancellationsignal = ((CancellationSignal) (cancellationsignal.getCancellationSignalObject()));
	//    5   13:aload           6
	//    6   15:invokevirtual   #25  <Method Object CancellationSignal.getCancellationSignalObject()>
	//    7   18:astore          6
_L1:
		contentresolver = ((ContentResolver) (contentresolver.query(uri, as, s, as1, s1, (android.os.CancellationSignal)(android.os.CancellationSignal)cancellationsignal)));
	//    8   20:aload_0         
	//    9   21:aload_1         
	//   10   22:aload_2         
	//   11   23:aload_3         
	//   12   24:aload           4
	//   13   26:aload           5
	//   14   28:aload           6
	//   15   30:checkcast       #27  <Class android.os.CancellationSignal>
	//   16   33:checkcast       #27  <Class android.os.CancellationSignal>
	//   17   36:invokevirtual   #32  <Method Cursor ContentResolver.query(Uri, String[], String, String[], String, android.os.CancellationSignal)>
	//   18   39:astore_0        
		return ((Cursor) (contentresolver));
	//   19   40:aload_0         
	//   20   41:areturn         
		cancellationsignal = null;
	//   21   42:aconst_null     
	//   22   43:astore          6
		  goto _L1
	//*  23   45:goto            20
		contentresolver;
	//   24   48:astore_0        
		if(contentresolver instanceof OperationCanceledException)
	//*  25   49:aload_0         
	//*  26   50:instanceof      #34  <Class OperationCanceledException>
	//*  27   53:ifeq            64
			throw new android.support.v4.os.OperationCanceledException();
	//   28   56:new             #36  <Class android.support.v4.os.OperationCanceledException>
	//   29   59:dup             
	//   30   60:invokespecial   #37  <Method void android.support.v4.os.OperationCanceledException()>
	//   31   63:athrow          
		else
			throw contentresolver;
	//   32   64:aload_0         
	//   33   65:athrow          
		if(cancellationsignal != null)
	//*  34   66:aload           6
	//*  35   68:ifnull          76
			cancellationsignal.throwIfCanceled();
	//   36   71:aload           6
	//   37   73:invokevirtual   #40  <Method void CancellationSignal.throwIfCanceled()>
		return contentresolver.query(uri, as, s, as1, s1);
	//   38   76:aload_0         
	//   39   77:aload_1         
	//   40   78:aload_2         
	//   41   79:aload_3         
	//   42   80:aload           4
	//   43   82:aload           5
	//   44   84:invokevirtual   #43  <Method Cursor ContentResolver.query(Uri, String[], String, String[], String)>
	//   45   87:areturn         
	}
}
