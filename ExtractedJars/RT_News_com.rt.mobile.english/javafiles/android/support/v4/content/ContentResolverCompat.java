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
			break MISSING_BLOCK_LABEL_59;
	//    0    0:getstatic       #19  <Field int android.os.Build$VERSION.SDK_INT>
	//    1    3:bipush          16
	//    2    5:icmplt          59
		if(cancellationsignal != null)
	//*   3    8:aload           6
	//*   4   10:ifnull          85
			try
			{
				cancellationsignal = ((CancellationSignal) (cancellationsignal.getCancellationSignalObject()));
	//    5   13:aload           6
	//    6   15:invokevirtual   #25  <Method Object CancellationSignal.getCancellationSignalObject()>
	//    7   18:astore          6
			}
	//*   8   20:goto            23
	//*   9   23:aload_0         
	//*  10   24:aload_1         
	//*  11   25:aload_2         
	//*  12   26:aload_3         
	//*  13   27:aload           4
	//*  14   29:aload           5
	//*  15   31:aload           6
	//*  16   33:checkcast       #27  <Class android.os.CancellationSignal>
	//*  17   36:invokevirtual   #32  <Method Cursor ContentResolver.query(Uri, String[], String, String[], String, android.os.CancellationSignal)>
	//*  18   39:astore_0        
	//*  19   40:aload_0         
	//*  20   41:areturn         
	//*  21   42:aload_0         
	//*  22   43:instanceof      #34  <Class OperationCanceledException>
	//*  23   46:ifeq            57
	//*  24   49:new             #36  <Class android.support.v4.os.OperationCanceledException>
	//*  25   52:dup             
	//*  26   53:invokespecial   #37  <Method void android.support.v4.os.OperationCanceledException()>
	//*  27   56:athrow          
	//*  28   57:aload_0         
	//*  29   58:athrow          
	//*  30   59:aload           6
	//*  31   61:ifnull          69
	//*  32   64:aload           6
	//*  33   66:invokevirtual   #40  <Method void CancellationSignal.throwIfCanceled()>
	//*  34   69:aload_0         
	//*  35   70:aload_1         
	//*  36   71:aload_2         
	//*  37   72:aload_3         
	//*  38   73:aload           4
	//*  39   75:aload           5
	//*  40   77:invokevirtual   #43  <Method Cursor ContentResolver.query(Uri, String[], String, String[], String)>
	//*  41   80:areturn         
			// Misplaced declaration of an exception variable
			catch(ContentResolver contentresolver)
			{
				if(contentresolver instanceof OperationCanceledException)
					throw new android.support.v4.os.OperationCanceledException();
				else
					throw contentresolver;
			}
		else
	//*  42   81:astore_0        
	//*  43   82:goto            42
			cancellationsignal = null;
	//   44   85:aconst_null     
	//   45   86:astore          6
		contentresolver = ((ContentResolver) (contentresolver.query(uri, as, s, as1, s1, (android.os.CancellationSignal)cancellationsignal)));
		return ((Cursor) (contentresolver));
		if(cancellationsignal != null)
			cancellationsignal.throwIfCanceled();
		return contentresolver.query(uri, as, s, as1, s1);
	//*  46   88:goto            23
	}
}
