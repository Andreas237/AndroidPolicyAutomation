// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.os.*;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.api.*;

// Referenced classes of package com.google.android.gms.internal:
//			zzzx

public static class zzzx$zza extends Handler
{

	public void handleMessage(Message message)
	{
		switch(message.what)
	//*   0    0:aload_1         
	//*   1    1:getfield        #29  <Field int Message.what>
		{
	//*   2    4:tableswitch     1 2: default 28
	//	               1 68
	//	               2 95
		default:
			int i = message.what;
	//    3   28:aload_1         
	//    4   29:getfield        #29  <Field int Message.what>
	//    5   32:istore_2        
			Log.wtf("BasePendingResult", (new StringBuilder(45)).append("Don't know how to handle message: ").append(i).toString(), ((Throwable) (new Exception())));
	//    6   33:ldc1            #31  <String "BasePendingResult">
	//    7   35:new             #33  <Class StringBuilder>
	//    8   38:dup             
	//    9   39:bipush          45
	//   10   41:invokespecial   #36  <Method void StringBuilder(int)>
	//   11   44:ldc1            #38  <String "Don't know how to handle message: ">
	//   12   46:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//   13   49:iload_2         
	//   14   50:invokevirtual   #45  <Method StringBuilder StringBuilder.append(int)>
	//   15   53:invokevirtual   #49  <Method String StringBuilder.toString()>
	//   16   56:new             #51  <Class Exception>
	//   17   59:dup             
	//   18   60:invokespecial   #53  <Method void Exception()>
	//   19   63:invokestatic    #59  <Method int Log.wtf(String, String, Throwable)>
	//   20   66:pop             
			return;
	//   21   67:return          

		case 1: // '\001'
			message = ((Message) ((Pair)message.obj));
	//   22   68:aload_1         
	//   23   69:getfield        #63  <Field Object Message.obj>
	//   24   72:checkcast       #65  <Class Pair>
	//   25   75:astore_1        
			zzb((ResultCallback)((Pair) (message)).first, (Result)((Pair) (message)).second);
	//   26   76:aload_0         
	//   27   77:aload_1         
	//   28   78:getfield        #68  <Field Object Pair.first>
	//   29   81:checkcast       #70  <Class ResultCallback>
	//   30   84:aload_1         
	//   31   85:getfield        #73  <Field Object Pair.second>
	//   32   88:checkcast       #75  <Class Result>
	//   33   91:invokevirtual   #79  <Method void zzb(ResultCallback, Result)>
			return;
	//   34   94:return          

		case 2: // '\002'
			((zzzx)message.obj).zzB(Status.zzayk);
	//   35   95:aload_1         
	//   36   96:getfield        #63  <Field Object Message.obj>
	//   37   99:checkcast       #7   <Class zzzx>
	//   38  102:getstatic       #85  <Field Status Status.zzayk>
	//   39  105:invokevirtual   #89  <Method void zzzx.zzB(Status)>
			break;
		}
	//   40  108:return          
	}

	public void zza(ResultCallback resultcallback, Result result)
	{
		sendMessage(obtainMessage(1, ((Object) (new Pair(((Object) (resultcallback)), ((Object) (result)))))));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:iconst_1        
	//    3    3:new             #65  <Class Pair>
	//    4    6:dup             
	//    5    7:aload_1         
	//    6    8:aload_2         
	//    7    9:invokespecial   #92  <Method void Pair(Object, Object)>
	//    8   12:invokevirtual   #96  <Method Message obtainMessage(int, Object)>
	//    9   15:invokevirtual   #100 <Method boolean sendMessage(Message)>
	//   10   18:pop             
	//   11   19:return          
	}

	public void zza(zzzx zzzx1, long l)
	{
		sendMessageDelayed(obtainMessage(2, ((Object) (zzzx1))), l);
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
			zzzx.zzd(result);
	//    5    9:aload_2         
	//    6   10:invokestatic    #117 <Method void zzzx.zzd(Result)>
		}
		throw resultcallback;
	//    7   13:aload_1         
	//    8   14:athrow          
	}

	public void zzvh()
	{
		removeMessages(2);
	//    0    0:aload_0         
	//    1    1:iconst_2        
	//    2    2:invokevirtual   #121 <Method void removeMessages(int)>
	//    3    5:return          
	}

	public zzzx$zza()
	{
		this(Looper.getMainLooper());
	//    0    0:aload_0         
	//    1    1:invokestatic    #16  <Method Looper Looper.getMainLooper()>
	//    2    4:invokespecial   #19  <Method void zzzx$zza(Looper)>
	//    3    7:return          
	}

	public zzzx$zza(Looper looper)
	{
		super(looper);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #21  <Method void Handler(Looper)>
	//    3    5:return          
	}
}
