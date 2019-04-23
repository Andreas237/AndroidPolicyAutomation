// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media;

import android.os.IBinder;
import android.support.v4.util.ArrayMap;
import android.util.Log;

// Referenced classes of package android.support.v4.media:
//			MediaBrowserServiceCompat

class MediaBrowserServiceCompat$ServiceBinderImpl$4
	implements Runnable
{

	public void run()
	{
		Object obj = ((Object) (val$callbacks.asBinder()));
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field MediaBrowserServiceCompat$ServiceCallbacks val$callbacks>
	//    2    4:invokeinterface #43  <Method IBinder MediaBrowserServiceCompat$ServiceCallbacks.asBinder()>
	//    3    9:astore_1        
		obj = ((Object) ((MediaBrowserServiceCompat.ConnectionRecord)mConnections.get(obj)));
	//    4   10:aload_0         
	//    5   11:getfield        #26  <Field MediaBrowserServiceCompat$ServiceBinderImpl this$1>
	//    6   14:getfield        #47  <Field MediaBrowserServiceCompat MediaBrowserServiceCompat$ServiceBinderImpl.this$0>
	//    7   17:getfield        #51  <Field ArrayMap MediaBrowserServiceCompat.mConnections>
	//    8   20:aload_1         
	//    9   21:invokevirtual   #57  <Method Object ArrayMap.get(Object)>
	//   10   24:checkcast       #59  <Class MediaBrowserServiceCompat$ConnectionRecord>
	//   11   27:astore_1        
		if(obj == null)
	//*  12   28:aload_1         
	//*  13   29:ifnonnull       67
		{
			obj = ((Object) (new StringBuilder()));
	//   14   32:new             #61  <Class StringBuilder>
	//   15   35:dup             
	//   16   36:invokespecial   #62  <Method void StringBuilder()>
	//   17   39:astore_1        
			((StringBuilder) (obj)).append("removeSubscription for callback that isn't registered id=");
	//   18   40:aload_1         
	//   19   41:ldc1            #64  <String "removeSubscription for callback that isn't registered id=">
	//   20   43:invokevirtual   #68  <Method StringBuilder StringBuilder.append(String)>
	//   21   46:pop             
			((StringBuilder) (obj)).append(val$id);
	//   22   47:aload_1         
	//   23   48:aload_0         
	//   24   49:getfield        #30  <Field String val$id>
	//   25   52:invokevirtual   #68  <Method StringBuilder StringBuilder.append(String)>
	//   26   55:pop             
			Log.w("MBServiceCompat", ((StringBuilder) (obj)).toString());
	//   27   56:ldc1            #70  <String "MBServiceCompat">
	//   28   58:aload_1         
	//   29   59:invokevirtual   #74  <Method String StringBuilder.toString()>
	//   30   62:invokestatic    #80  <Method int Log.w(String, String)>
	//   31   65:pop             
			return;
	//   32   66:return          
		}
		if(!removeSubscription(val$id, ((MediaBrowserServiceCompat.ConnectionRecord) (obj)), val$token))
	//*  33   67:aload_0         
	//*  34   68:getfield        #26  <Field MediaBrowserServiceCompat$ServiceBinderImpl this$1>
	//*  35   71:getfield        #47  <Field MediaBrowserServiceCompat MediaBrowserServiceCompat$ServiceBinderImpl.this$0>
	//*  36   74:aload_0         
	//*  37   75:getfield        #30  <Field String val$id>
	//*  38   78:aload_1         
	//*  39   79:aload_0         
	//*  40   80:getfield        #32  <Field IBinder val$token>
	//*  41   83:invokevirtual   #83  <Method boolean MediaBrowserServiceCompat.removeSubscription(String, MediaBrowserServiceCompat$ConnectionRecord, IBinder)>
	//*  42   86:ifne            130
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   43   89:new             #61  <Class StringBuilder>
	//   44   92:dup             
	//   45   93:invokespecial   #62  <Method void StringBuilder()>
	//   46   96:astore_1        
			stringbuilder.append("removeSubscription called for ");
	//   47   97:aload_1         
	//   48   98:ldc1            #85  <String "removeSubscription called for ">
	//   49  100:invokevirtual   #68  <Method StringBuilder StringBuilder.append(String)>
	//   50  103:pop             
			stringbuilder.append(val$id);
	//   51  104:aload_1         
	//   52  105:aload_0         
	//   53  106:getfield        #30  <Field String val$id>
	//   54  109:invokevirtual   #68  <Method StringBuilder StringBuilder.append(String)>
	//   55  112:pop             
			stringbuilder.append(" which is not subscribed");
	//   56  113:aload_1         
	//   57  114:ldc1            #87  <String " which is not subscribed">
	//   58  116:invokevirtual   #68  <Method StringBuilder StringBuilder.append(String)>
	//   59  119:pop             
			Log.w("MBServiceCompat", stringbuilder.toString());
	//   60  120:ldc1            #70  <String "MBServiceCompat">
	//   61  122:aload_1         
	//   62  123:invokevirtual   #74  <Method String StringBuilder.toString()>
	//   63  126:invokestatic    #80  <Method int Log.w(String, String)>
	//   64  129:pop             
		}
	//   65  130:return          
	}

	final MediaBrowserServiceCompat.ServiceBinderImpl this$1;
	final MediaBrowserServiceCompat.ServiceCallbacks val$callbacks;
	final String val$id;
	final IBinder val$token;

	MediaBrowserServiceCompat$ServiceBinderImpl$4()
	{
		this$1 = final_servicebinderimpl;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #26  <Field MediaBrowserServiceCompat$ServiceBinderImpl this$1>
		val$callbacks = servicecallbacks;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #28  <Field MediaBrowserServiceCompat$ServiceCallbacks val$callbacks>
		val$id = s;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #30  <Field String val$id>
		val$token = IBinder.this;
	//    9   15:aload_0         
	//   10   16:aload           4
	//   11   18:putfield        #32  <Field IBinder val$token>
		super();
	//   12   21:aload_0         
	//   13   22:invokespecial   #35  <Method void Object()>
	//   14   25:return          
	}
}
