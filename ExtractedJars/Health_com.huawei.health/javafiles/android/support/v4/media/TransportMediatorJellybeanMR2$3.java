// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media;

import android.content.*;
import android.util.Log;
import android.view.KeyEvent;

// Referenced classes of package android.support.v4.media:
//			TransportMediatorJellybeanMR2, TransportMediatorCallback

class TransportMediatorJellybeanMR2$3 extends BroadcastReceiver
{

	public void onReceive(Context context, Intent intent)
	{
		try
		{
			context = ((Context) ((KeyEvent)intent.getParcelableExtra("android.intent.extra.KEY_EVENT")));
	//    0    0:aload_2         
	//    1    1:ldc1            #22  <String "android.intent.extra.KEY_EVENT">
	//    2    3:invokevirtual   #28  <Method android.os.Parcelable Intent.getParcelableExtra(String)>
	//    3    6:checkcast       #30  <Class KeyEvent>
	//    4    9:astore_1        
			mTransportCallback.handleKey(((KeyEvent) (context)));
	//    5   10:aload_0         
	//    6   11:getfield        #12  <Field TransportMediatorJellybeanMR2 this$0>
	//    7   14:getfield        #34  <Field TransportMediatorCallback TransportMediatorJellybeanMR2.mTransportCallback>
	//    8   17:aload_1         
	//    9   18:invokeinterface #40  <Method void TransportMediatorCallback.handleKey(KeyEvent)>
			return;
	//   10   23:return          
		}
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*  11   24:astore_1        
		{
			Log.w("TransportController", ((Throwable) (context)));
	//   12   25:ldc1            #42  <String "TransportController">
	//   13   27:aload_1         
	//   14   28:invokestatic    #48  <Method int Log.w(String, Throwable)>
	//   15   31:pop             
		}
	//   16   32:return          
	}

	final TransportMediatorJellybeanMR2 this$0;

	TransportMediatorJellybeanMR2$3()
	{
		this$0 = TransportMediatorJellybeanMR2.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field TransportMediatorJellybeanMR2 this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void BroadcastReceiver()>
	//    5    9:return          
	}
}
