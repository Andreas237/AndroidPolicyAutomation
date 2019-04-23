// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.internal.base.zal;

// Referenced classes of package com.google.android.gms.common.api.internal:
//			zabf, zabe

final class zabg extends zal
{

	zabg(zabe zabe, Looper looper)
	{
		zahu = zabe;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #10  <Field zabe zahu>
		super(looper);
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:invokespecial   #13  <Method void zal(Looper)>
	//    6   10:return          
	}

	public final void handleMessage(Message message)
	{
		switch(message.what)
	//*   0    0:aload_1         
	//*   1    1:getfield        #22  <Field int Message.what>
		{
	//*   2    4:tableswitch     1 2: default 28
	//	               1 75
	//	               2 67
		default:
			int i = message.what;
	//    3   28:aload_1         
	//    4   29:getfield        #22  <Field int Message.what>
	//    5   32:istore_2        
			message = ((Message) (new StringBuilder(31)));
	//    6   33:new             #24  <Class StringBuilder>
	//    7   36:dup             
	//    8   37:bipush          31
	//    9   39:invokespecial   #27  <Method void StringBuilder(int)>
	//   10   42:astore_1        
			((StringBuilder) (message)).append("Unknown message id: ");
	//   11   43:aload_1         
	//   12   44:ldc1            #29  <String "Unknown message id: ">
	//   13   46:invokevirtual   #33  <Method StringBuilder StringBuilder.append(String)>
	//   14   49:pop             
			((StringBuilder) (message)).append(i);
	//   15   50:aload_1         
	//   16   51:iload_2         
	//   17   52:invokevirtual   #36  <Method StringBuilder StringBuilder.append(int)>
	//   18   55:pop             
			Log.w("GACStateManager", ((StringBuilder) (message)).toString());
	//   19   56:ldc1            #38  <String "GACStateManager">
	//   20   58:aload_1         
	//   21   59:invokevirtual   #42  <Method String StringBuilder.toString()>
	//   22   62:invokestatic    #48  <Method int Log.w(String, String)>
	//   23   65:pop             
			return;
	//   24   66:return          

		case 2: // '\002'
			throw (RuntimeException)message.obj;
	//   25   67:aload_1         
	//   26   68:getfield        #52  <Field Object Message.obj>
	//   27   71:checkcast       #54  <Class RuntimeException>
	//   28   74:athrow          

		case 1: // '\001'
			((zabf)message.obj).zac(zahu);
	//   29   75:aload_1         
	//   30   76:getfield        #52  <Field Object Message.obj>
	//   31   79:checkcast       #56  <Class zabf>
	//   32   82:aload_0         
	//   33   83:getfield        #10  <Field zabe zahu>
	//   34   86:invokevirtual   #60  <Method void zabf.zac(zabe)>
			break;
		}
	//   35   89:return          
	}

	private final zabe zahu;
}
