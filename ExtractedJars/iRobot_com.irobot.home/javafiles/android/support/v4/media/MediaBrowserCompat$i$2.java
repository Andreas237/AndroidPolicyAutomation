// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media;

import android.os.RemoteException;
import android.util.Log;

// Referenced classes of package android.support.v4.media:
//			MediaBrowserCompat

class MediaBrowserCompat$i$2
	implements Runnable
{

	public void run()
	{
		RemoteException remoteexception;
		StringBuilder stringbuilder;
		if(a.i != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #20  <Field MediaBrowserCompat$i a>
	//*   2    4:getfield        #29  <Field android.os.Messenger MediaBrowserCompat$i.i>
	//*   3    7:ifnull          67
			try
			{
				a.h.a(a.i);
	//    4   10:aload_0         
	//    5   11:getfield        #20  <Field MediaBrowserCompat$i a>
	//    6   14:getfield        #33  <Field MediaBrowserCompat$l MediaBrowserCompat$i.h>
	//    7   17:aload_0         
	//    8   18:getfield        #20  <Field MediaBrowserCompat$i a>
	//    9   21:getfield        #29  <Field android.os.Messenger MediaBrowserCompat$i.i>
	//   10   24:invokevirtual   #38  <Method void MediaBrowserCompat$l.a(android.os.Messenger)>
			}
	//*  11   27:goto            67
	//*  12   30:new             #40  <Class StringBuilder>
	//*  13   33:dup             
	//*  14   34:invokespecial   #41  <Method void StringBuilder()>
	//*  15   37:astore_2        
	//*  16   38:aload_2         
	//*  17   39:ldc1            #43  <String "RemoteException during connect for ">
	//*  18   41:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//*  19   44:pop             
	//*  20   45:aload_2         
	//*  21   46:aload_0         
	//*  22   47:getfield        #20  <Field MediaBrowserCompat$i a>
	//*  23   50:getfield        #51  <Field android.content.ComponentName MediaBrowserCompat$i.b>
	//*  24   53:invokevirtual   #54  <Method StringBuilder StringBuilder.append(Object)>
	//*  25   56:pop             
	//*  26   57:ldc1            #56  <String "MediaBrowserCompat">
	//*  27   59:aload_2         
	//*  28   60:invokevirtual   #60  <Method String StringBuilder.toString()>
	//*  29   63:invokestatic    #66  <Method int Log.w(String, String)>
	//*  30   66:pop             
	//*  31   67:aload_0         
	//*  32   68:getfield        #20  <Field MediaBrowserCompat$i a>
	//*  33   71:getfield        #70  <Field int MediaBrowserCompat$i.f>
	//*  34   74:istore_1        
	//*  35   75:aload_0         
	//*  36   76:getfield        #20  <Field MediaBrowserCompat$i a>
	//*  37   79:invokevirtual   #72  <Method void MediaBrowserCompat$i.a()>
	//*  38   82:iload_1         
	//*  39   83:ifeq            94
	//*  40   86:aload_0         
	//*  41   87:getfield        #20  <Field MediaBrowserCompat$i a>
	//*  42   90:iload_1         
	//*  43   91:putfield        #70  <Field int MediaBrowserCompat$i.f>
	//*  44   94:getstatic       #75  <Field boolean MediaBrowserCompat.a>
	//*  45   97:ifeq            115
	//*  46  100:ldc1            #56  <String "MediaBrowserCompat">
	//*  47  102:ldc1            #77  <String "disconnect...">
	//*  48  104:invokestatic    #80  <Method int Log.d(String, String)>
	//*  49  107:pop             
	//*  50  108:aload_0         
	//*  51  109:getfield        #20  <Field MediaBrowserCompat$i a>
	//*  52  112:invokevirtual   #83  <Method void MediaBrowserCompat$i.c()>
	//*  53  115:return          
			// Misplaced declaration of an exception variable
			catch(RemoteException remoteexception)
			{
				stringbuilder = new StringBuilder();
				stringbuilder.append("RemoteException during connect for ");
				stringbuilder.append(((Object) (a.b)));
				Log.w("MediaBrowserCompat", stringbuilder.toString());
			}
		int j = a.f;
		a.a();
		if(j != 0)
			a.f = j;
		if(MediaBrowserCompat.a)
		{
			Log.d("MediaBrowserCompat", "disconnect...");
			a.c();
		}
	//*  54  116:astore_2        
	//*  55  117:goto            30
	}

	final MediaBrowserCompat.i a;

	MediaBrowserCompat$i$2(MediaBrowserCompat.i j)
	{
		a = j;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #20  <Field MediaBrowserCompat$i a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #22  <Method void Object()>
	//    5    9:return          
	}
}
