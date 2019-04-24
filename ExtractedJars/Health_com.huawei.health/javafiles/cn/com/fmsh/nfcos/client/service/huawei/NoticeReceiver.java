// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package cn.com.fmsh.nfcos.client.service.huawei;

import android.content.*;
import android.os.Bundle;
import java.io.PrintStream;

// Referenced classes of package cn.com.fmsh.nfcos.client.service.huawei:
//			BroadCastParameter

public class NoticeReceiver extends BroadcastReceiver
{

	public NoticeReceiver()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void BroadcastReceiver()>
	//    2    4:aload_0         
	//    3    5:ldc1            #12  <String "cn.com.fmsh.tsm.sptc.broadcast.message.key">
	//    4    7:putfield        #14  <Field String messageKey>
	//    5   10:return          
	}

	public void onReceive(Context context, Intent intent)
	{
		System.out.println("=======================receive brodcast=================");
	//    0    0:getstatic       #23  <Field PrintStream System.out>
	//    1    3:ldc1            #25  <String "=======================receive brodcast=================">
	//    2    5:invokevirtual   #31  <Method void PrintStream.println(String)>
		switch(((BroadCastParameter)intent.getExtras().get("cn.com.fmsh.tsm.sptc.broadcast.message.key")).broadcastType)
	//*   3    8:aload_2         
	//*   4    9:invokevirtual   #37  <Method Bundle Intent.getExtras()>
	//*   5   12:ldc1            #12  <String "cn.com.fmsh.tsm.sptc.broadcast.message.key">
	//*   6   14:invokevirtual   #43  <Method Object Bundle.get(String)>
	//*   7   17:checkcast       #45  <Class BroadCastParameter>
	//*   8   20:getfield        #49  <Field int BroadCastParameter.broadcastType>
		{
	//*   9   23:tableswitch     1 3: default 48
	//	               1 48
	//	               2 48
	//	               3 48
		case 1: // '\001'
		case 2: // '\002'
		case 3: // '\003'
		default:
			return;
	//   10   48:return          
		}
	}

	private final String messageKey = "cn.com.fmsh.tsm.sptc.broadcast.message.key";
}
