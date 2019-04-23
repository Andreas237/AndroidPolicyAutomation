// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.content;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;

// Referenced classes of package android.support.v4.content:
//			LocalBroadcastManager

private static final class LocalBroadcastManager$ReceiverRecord
{

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder(128);
	//    0    0:new             #28  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:sipush          128
	//    3    7:invokespecial   #31  <Method void StringBuilder(int)>
	//    4   10:astore_1        
		stringbuilder.append("Receiver{");
	//    5   11:aload_1         
	//    6   12:ldc1            #33  <String "Receiver{">
	//    7   14:invokevirtual   #37  <Method StringBuilder StringBuilder.append(String)>
	//    8   17:pop             
		stringbuilder.append(((Object) (receiver)));
	//    9   18:aload_1         
	//   10   19:aload_0         
	//   11   20:getfield        #23  <Field BroadcastReceiver receiver>
	//   12   23:invokevirtual   #40  <Method StringBuilder StringBuilder.append(Object)>
	//   13   26:pop             
		stringbuilder.append(" filter=");
	//   14   27:aload_1         
	//   15   28:ldc1            #42  <String " filter=">
	//   16   30:invokevirtual   #37  <Method StringBuilder StringBuilder.append(String)>
	//   17   33:pop             
		stringbuilder.append(((Object) (filter)));
	//   18   34:aload_1         
	//   19   35:aload_0         
	//   20   36:getfield        #21  <Field IntentFilter filter>
	//   21   39:invokevirtual   #40  <Method StringBuilder StringBuilder.append(Object)>
	//   22   42:pop             
		if(dead)
	//*  23   43:aload_0         
	//*  24   44:getfield        #44  <Field boolean dead>
	//*  25   47:ifeq            57
			stringbuilder.append(" DEAD");
	//   26   50:aload_1         
	//   27   51:ldc1            #46  <String " DEAD">
	//   28   53:invokevirtual   #37  <Method StringBuilder StringBuilder.append(String)>
	//   29   56:pop             
		stringbuilder.append("}");
	//   30   57:aload_1         
	//   31   58:ldc1            #48  <String "}">
	//   32   60:invokevirtual   #37  <Method StringBuilder StringBuilder.append(String)>
	//   33   63:pop             
		return stringbuilder.toString();
	//   34   64:aload_1         
	//   35   65:invokevirtual   #50  <Method String StringBuilder.toString()>
	//   36   68:areturn         
	}

	boolean broadcasting;
	boolean dead;
	final IntentFilter filter;
	final BroadcastReceiver receiver;

	LocalBroadcastManager$ReceiverRecord(IntentFilter intentfilter, BroadcastReceiver broadcastreceiver)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
		filter = intentfilter;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #21  <Field IntentFilter filter>
		receiver = broadcastreceiver;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #23  <Field BroadcastReceiver receiver>
	//    8   14:return          
	}
}
