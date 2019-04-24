// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.content;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;

// Referenced classes of package android.support.v4.content:
//			LocalBroadcastManager

static class LocalBroadcastManager$ReceiverRecord
{

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder(128);
	//    0    0:new             #27  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:sipush          128
	//    3    7:invokespecial   #30  <Method void StringBuilder(int)>
	//    4   10:astore_1        
		stringbuilder.append("Receiver{");
	//    5   11:aload_1         
	//    6   12:ldc1            #32  <String "Receiver{">
	//    7   14:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
	//    8   17:pop             
		stringbuilder.append(((Object) (receiver)));
	//    9   18:aload_1         
	//   10   19:aload_0         
	//   11   20:getfield        #22  <Field BroadcastReceiver receiver>
	//   12   23:invokevirtual   #39  <Method StringBuilder StringBuilder.append(Object)>
	//   13   26:pop             
		stringbuilder.append(" filter=");
	//   14   27:aload_1         
	//   15   28:ldc1            #41  <String " filter=">
	//   16   30:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
	//   17   33:pop             
		stringbuilder.append(((Object) (filter)));
	//   18   34:aload_1         
	//   19   35:aload_0         
	//   20   36:getfield        #20  <Field IntentFilter filter>
	//   21   39:invokevirtual   #39  <Method StringBuilder StringBuilder.append(Object)>
	//   22   42:pop             
		stringbuilder.append("}");
	//   23   43:aload_1         
	//   24   44:ldc1            #43  <String "}">
	//   25   46:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
	//   26   49:pop             
		return stringbuilder.toString();
	//   27   50:aload_1         
	//   28   51:invokevirtual   #45  <Method String StringBuilder.toString()>
	//   29   54:areturn         
	}

	boolean broadcasting;
	final IntentFilter filter;
	final BroadcastReceiver receiver;

	LocalBroadcastManager$ReceiverRecord(IntentFilter intentfilter, BroadcastReceiver broadcastreceiver)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		filter = intentfilter;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #20  <Field IntentFilter filter>
		receiver = broadcastreceiver;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #22  <Field BroadcastReceiver receiver>
	//    8   14:return          
	}
}
