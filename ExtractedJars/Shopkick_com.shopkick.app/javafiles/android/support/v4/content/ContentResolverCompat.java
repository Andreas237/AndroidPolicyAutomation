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
			break MISSING_BLOCK_LABEL_62;
	//    0    0:getstatic       #19  <Field int android.os.Build$VERSION.SDK_INT>
	//    1    3:bipush          16
	//    2    5:icmplt          62
		if(cancellationsignal != null)
	//*   3    8:aload           6
	//*   4   10:ifnull          88
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
	//*  17   36:checkcast       #27  <Class android.os.CancellationSignal>
	//*  18   39:invokevirtual   #32  <Method Cursor ContentResolver.query(Uri, String[], String, String[], String, android.os.CancellationSignal)>
	//*  19   42:astore_0        
	//*  20   43:aload_0         
	//*  21   44:areturn         
	//*  22   45:aload_0         
	//*  23   46:instanceof      #34  <Class OperationCanceledException>
	//*  24   49:ifeq            60
	//*  25   52:new             #36  <Class android.support.v4.os.OperationCanceledException>
	//*  26   55:dup             
	//*  27   56:invokespecial   #37  <Method void android.support.v4.os.OperationCanceledException()>
	//*  28   59:athrow          
	//*  29   60:aload_0         
	//*  30   61:athrow          
	//*  31   62:aload           6
	//*  32   64:ifnull          72
	//*  33   67:aload           6
	//*  34   69:invokevirtual   #40  <Method void CancellationSignal.throwIfCanceled()>
	//*  35   72:aload_0         
	//*  36   73:aload_1         
	//*  37   74:aload_2         
	//*  38   75:aload_3         
	//*  39   76:aload           4
	//*  40   78:aload           5
	//*  41   80:invokevirtual   #43  <Method Cursor ContentResolver.query(Uri, String[], String, String[], String)>
	//*  42   83:areturn         
			// Misplaced declaration of an exception variable
			catch(ContentResolver contentresolver)
			{
				if(contentresolver instanceof OperationCanceledException)
					throw new android.support.v4.os.OperationCanceledException();
				else
					throw contentresolver;
			}
		else
	//*  43   84:astore_0        
	//*  44   85:goto            45
			cancellationsignal = null;
	//   45   88:aconst_null     
	//   46   89:astore          6
		contentresolver = ((ContentResolver) (contentresolver.query(uri, as, s, as1, s1, (android.os.CancellationSignal)(android.os.CancellationSignal)cancellationsignal)));
		return ((Cursor) (contentresolver));
		if(cancellationsignal != null)
			cancellationsignal.throwIfCanceled();
		return contentresolver.query(uri, as, s, as1, s1);
	//*  47   91:goto            23
	}
}
