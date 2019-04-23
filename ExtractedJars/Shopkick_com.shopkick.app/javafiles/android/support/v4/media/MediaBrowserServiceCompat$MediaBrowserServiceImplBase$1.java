// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media;

import android.os.RemoteException;
import android.support.v4.util.ArrayMap;
import android.util.Log;
import java.util.Collection;
import java.util.Iterator;

// Referenced classes of package android.support.v4.media:
//			MediaBrowserServiceCompat

class MediaBrowserServiceCompat$MediaBrowserServiceImplBase$1
	implements Runnable
{

	public void run()
	{
		RemoteException remoteexception;
		for(Iterator iterator = mConnections.values().iterator(); iterator.hasNext();)
	//*   0    0:aload_0         
	//*   1    1:getfield        #22  <Field MediaBrowserServiceCompat$MediaBrowserServiceImplBase this$1>
	//*   2    4:getfield        #35  <Field MediaBrowserServiceCompat MediaBrowserServiceCompat$MediaBrowserServiceImplBase.this$0>
	//*   3    7:getfield        #39  <Field ArrayMap MediaBrowserServiceCompat.mConnections>
	//*   4   10:invokevirtual   #45  <Method Collection ArrayMap.values()>
	//*   5   13:invokeinterface #51  <Method Iterator Collection.iterator()>
	//*   6   18:astore_1        
	//*   7   19:aload_1         
	//*   8   20:invokeinterface #57  <Method boolean Iterator.hasNext()>
	//*   9   25:ifeq            118
		{
			MediaBrowserServiceCompat.ConnectionRecord connectionrecord = (MediaBrowserServiceCompat.ConnectionRecord)iterator.next();
	//   10   28:aload_1         
	//   11   29:invokeinterface #61  <Method Object Iterator.next()>
	//   12   34:checkcast       #63  <Class MediaBrowserServiceCompat$ConnectionRecord>
	//   13   37:astore_2        
			StringBuilder stringbuilder;
			try
			{
				connectionrecord.callbacks.onConnect(connectionrecord.root.getRootId(), val$token, connectionrecord.root.getExtras());
	//   14   38:aload_2         
	//   15   39:getfield        #67  <Field MediaBrowserServiceCompat$ServiceCallbacks MediaBrowserServiceCompat$ConnectionRecord.callbacks>
	//   16   42:aload_2         
	//   17   43:getfield        #71  <Field MediaBrowserServiceCompat$BrowserRoot MediaBrowserServiceCompat$ConnectionRecord.root>
	//   18   46:invokevirtual   #77  <Method String MediaBrowserServiceCompat$BrowserRoot.getRootId()>
	//   19   49:aload_0         
	//   20   50:getfield        #24  <Field android.support.v4.media.session.MediaSessionCompat$Token val$token>
	//   21   53:aload_2         
	//   22   54:getfield        #71  <Field MediaBrowserServiceCompat$BrowserRoot MediaBrowserServiceCompat$ConnectionRecord.root>
	//   23   57:invokevirtual   #81  <Method android.os.Bundle MediaBrowserServiceCompat$BrowserRoot.getExtras()>
	//   24   60:invokeinterface #87  <Method void MediaBrowserServiceCompat$ServiceCallbacks.onConnect(String, android.support.v4.media.session.MediaSessionCompat$Token, android.os.Bundle)>
			}
	//*  25   65:goto            19
	//*  26   68:new             #89  <Class StringBuilder>
	//*  27   71:dup             
	//*  28   72:invokespecial   #90  <Method void StringBuilder()>
	//*  29   75:astore_3        
	//*  30   76:aload_3         
	//*  31   77:ldc1            #92  <String "Connection for ">
	//*  32   79:invokevirtual   #96  <Method StringBuilder StringBuilder.append(String)>
	//*  33   82:pop             
	//*  34   83:aload_3         
	//*  35   84:aload_2         
	//*  36   85:getfield        #100 <Field String MediaBrowserServiceCompat$ConnectionRecord.pkg>
	//*  37   88:invokevirtual   #96  <Method StringBuilder StringBuilder.append(String)>
	//*  38   91:pop             
	//*  39   92:aload_3         
	//*  40   93:ldc1            #102 <String " is no longer valid.">
	//*  41   95:invokevirtual   #96  <Method StringBuilder StringBuilder.append(String)>
	//*  42   98:pop             
	//*  43   99:ldc1            #104 <String "MBServiceCompat">
	//*  44  101:aload_3         
	//*  45  102:invokevirtual   #107 <Method String StringBuilder.toString()>
	//*  46  105:invokestatic    #113 <Method int Log.w(String, String)>
	//*  47  108:pop             
	//*  48  109:aload_1         
	//*  49  110:invokeinterface #116 <Method void Iterator.remove()>
	//*  50  115:goto            19
	//*  51  118:return          
			// Misplaced declaration of an exception variable
			catch(RemoteException remoteexception)
			{
				stringbuilder = new StringBuilder();
				stringbuilder.append("Connection for ");
				stringbuilder.append(connectionrecord.pkg);
				stringbuilder.append(" is no longer valid.");
				Log.w("MBServiceCompat", stringbuilder.toString());
				iterator.remove();
			}
		}

	//*  52  119:astore_3        
	//*  53  120:goto            68
	}

	final MediaBrowserServiceCompat.MediaBrowserServiceImplBase this$1;
	final android.support.v4.media.session.MediaSessionCompat.Token val$token;

	MediaBrowserServiceCompat$MediaBrowserServiceImplBase$1()
	{
		this$1 = final_mediabrowserserviceimplbase;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #22  <Field MediaBrowserServiceCompat$MediaBrowserServiceImplBase this$1>
		val$token = android.support.v4.media.session.MediaSessionCompat.Token.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #24  <Field android.support.v4.media.session.MediaSessionCompat$Token val$token>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #27  <Method void Object()>
	//    8   14:return          
	}
}
