// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media.session;

import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import android.view.KeyEvent;

// Referenced classes of package android.support.v4.media.session:
//			MediaControllerCompat, b

static class MediaControllerCompat$e
	implements MediaControllerCompat$b
{

	public boolean a(KeyEvent keyevent)
	{
		if(keyevent == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       14
			throw new IllegalArgumentException("event may not be null.");
	//    2    4:new             #36  <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:ldc1            #38  <String "event may not be null.">
	//    5   10:invokespecial   #41  <Method void IllegalArgumentException(String)>
	//    6   13:athrow          
		try
		{
			a.a(keyevent);
	//    7   14:aload_0         
	//    8   15:getfield        #30  <Field b a>
	//    9   18:aload_1         
	//   10   19:invokeinterface #45  <Method boolean b.a(KeyEvent)>
	//   11   24:pop             
		}
	//*  12   25:goto            38
		// Misplaced declaration of an exception variable
		catch(KeyEvent keyevent)
	//*  13   28:astore_1        
		{
			Log.e("MediaControllerCompat", "Dead object in dispatchMediaButtonEvent.", ((Throwable) (keyevent)));
	//   14   29:ldc1            #47  <String "MediaControllerCompat">
	//   15   31:ldc1            #49  <String "Dead object in dispatchMediaButtonEvent.">
	//   16   33:aload_1         
	//   17   34:invokestatic    #54  <Method int Log.e(String, String, Throwable)>
	//   18   37:pop             
		}
		return false;
	//   19   38:iconst_0        
	//   20   39:ireturn         
	}

	private b a;

	public MediaControllerCompat$e( )
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		a = b.a.a((IBinder).a());
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #21  <Method Object MediaSessionCompat$Token.a()>
	//    5    9:checkcast       #23  <Class IBinder>
	//    6   12:invokestatic    #28  <Method b b$a.a(IBinder)>
	//    7   15:putfield        #30  <Field b a>
	//    8   18:return          
	}
}
