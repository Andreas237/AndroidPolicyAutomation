// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.os.*;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.api.*;

// Referenced classes of package com.google.android.gms.internal:
//			zzaaf

public static class zzaaf$zza extends Handler
{

	public void handleMessage(Message message)
	{
		switch(message.what)
	//*   0    0:aload_1         
	//*   1    1:getfield        #29  <Field int Message.what>
		{
	//*   2    4:lookupswitch    2: default 32
	//	               1: 35
	//	               2: 62
	//*   3   32:goto            76
		case 1: // '\001'
			message = ((Message) ((Pair)message.obj));
	//    4   35:aload_1         
	//    5   36:getfield        #33  <Field Object Message.obj>
	//    6   39:checkcast       #35  <Class Pair>
	//    7   42:astore_1        
			zzb((ResultCallback)((Pair) (message)).first, (Result)((Pair) (message)).second);
	//    8   43:aload_0         
	//    9   44:aload_1         
	//   10   45:getfield        #38  <Field Object Pair.first>
	//   11   48:checkcast       #40  <Class ResultCallback>
	//   12   51:aload_1         
	//   13   52:getfield        #43  <Field Object Pair.second>
	//   14   55:checkcast       #45  <Class Result>
	//   15   58:invokevirtual   #49  <Method void zzb(ResultCallback, Result)>
			return;
	//   16   61:return          

		case 2: // '\002'
			((zzaaf)message.obj).zzC(Status.zzazA);
	//   17   62:aload_1         
	//   18   63:getfield        #33  <Field Object Message.obj>
	//   19   66:checkcast       #7   <Class zzaaf>
	//   20   69:getstatic       #55  <Field Status Status.zzazA>
	//   21   72:invokevirtual   #59  <Method void zzaaf.zzC(Status)>
			return;
	//   22   75:return          
		}
		int i = message.what;
	//   23   76:aload_1         
	//   24   77:getfield        #29  <Field int Message.what>
	//   25   80:istore_2        
		Log.wtf("BasePendingResult", (new StringBuilder(45)).append("Don't know how to handle message: ").append(i).toString(), ((Throwable) (new Exception())));
	//   26   81:ldc1            #61  <String "BasePendingResult">
	//   27   83:new             #63  <Class StringBuilder>
	//   28   86:dup             
	//   29   87:bipush          45
	//   30   89:invokespecial   #66  <Method void StringBuilder(int)>
	//   31   92:ldc1            #68  <String "Don't know how to handle message: ">
	//   32   94:invokevirtual   #72  <Method StringBuilder StringBuilder.append(String)>
	//   33   97:iload_2         
	//   34   98:invokevirtual   #75  <Method StringBuilder StringBuilder.append(int)>
	//   35  101:invokevirtual   #79  <Method String StringBuilder.toString()>
	//   36  104:new             #81  <Class Exception>
	//   37  107:dup             
	//   38  108:invokespecial   #83  <Method void Exception()>
	//   39  111:invokestatic    #89  <Method int Log.wtf(String, String, Throwable)>
	//   40  114:pop             
	//   41  115:return          
	}

	public void zza(ResultCallback resultcallback, Result result)
	{
		sendMessage(obtainMessage(1, ((Object) (new Pair(((Object) (resultcallback)), ((Object) (result)))))));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:iconst_1        
	//    3    3:new             #35  <Class Pair>
	//    4    6:dup             
	//    5    7:aload_1         
	//    6    8:aload_2         
	//    7    9:invokespecial   #92  <Method void Pair(Object, Object)>
	//    8   12:invokevirtual   #96  <Method Message obtainMessage(int, Object)>
	//    9   15:invokevirtual   #100 <Method boolean sendMessage(Message)>
	//   10   18:pop             
	//   11   19:return          
	}

	public void zza(zzaaf zzaaf1, long l)
	{
		sendMessageDelayed(obtainMessage(2, ((Object) (zzaaf1))), l);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:iconst_2        
	//    3    3:aload_1         
	//    4    4:invokevirtual   #96  <Method Message obtainMessage(int, Object)>
	//    5    7:lload_2         
	//    6    8:invokevirtual   #107 <Method boolean sendMessageDelayed(Message, long)>
	//    7   11:pop             
	//    8   12:return          
	}

	protected void zzb(ResultCallback resultcallback, Result result)
	{
		try
		{
			resultcallback.onResult(result);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokeinterface #114 <Method void ResultCallback.onResult(Result)>
			return;
	//    3    7:return          
		}
		// Misplaced declaration of an exception variable
		catch(ResultCallback resultcallback)
	//*   4    8:astore_1        
		{
			zzaaf.zzd(result);
	//    5    9:aload_2         
	//    6   10:invokestatic    #117 <Method void zzaaf.zzd(Result)>
		}
		throw resultcallback;
	//    7   13:aload_1         
	//    8   14:athrow          
	}

	public void zzvK()
	{
		removeMessages(2);
	//    0    0:aload_0         
	//    1    1:iconst_2        
	//    2    2:invokevirtual   #121 <Method void removeMessages(int)>
	//    3    5:return          
	}

	public zzaaf$zza()
	{
		this(Looper.getMainLooper());
	//    0    0:aload_0         
	//    1    1:invokestatic    #16  <Method Looper Looper.getMainLooper()>
	//    2    4:invokespecial   #19  <Method void zzaaf$zza(Looper)>
	//    3    7:return          
	}

	public zzaaf$zza(Looper looper)
	{
		super(looper);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #21  <Method void Handler(Looper)>
	//    3    5:return          
	}
}
