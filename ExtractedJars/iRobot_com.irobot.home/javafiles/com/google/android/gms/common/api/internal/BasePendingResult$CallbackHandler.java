// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.api.*;
import com.google.android.gms.internal.base.zal;

// Referenced classes of package com.google.android.gms.common.api.internal:
//			BasePendingResult

public static class BasePendingResult$CallbackHandler extends zal
{

	public void handleMessage(Message message)
	{
		Object obj;
		switch(message.what)
	//*   0    0:aload_1         
	//*   1    1:getfield        #32  <Field int Message.what>
		{
	//*   2    4:tableswitch     1 2: default 28
	//	               1 88
	//	               2 74
		default:
			int i = message.what;
	//    3   28:aload_1         
	//    4   29:getfield        #32  <Field int Message.what>
	//    5   32:istore_2        
			message = ((Message) (new StringBuilder(45)));
	//    6   33:new             #34  <Class StringBuilder>
	//    7   36:dup             
	//    8   37:bipush          45
	//    9   39:invokespecial   #37  <Method void StringBuilder(int)>
	//   10   42:astore_1        
			((StringBuilder) (message)).append("Don't know how to handle message: ");
	//   11   43:aload_1         
	//   12   44:ldc1            #39  <String "Don't know how to handle message: ">
	//   13   46:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//   14   49:pop             
			((StringBuilder) (message)).append(i);
	//   15   50:aload_1         
	//   16   51:iload_2         
	//   17   52:invokevirtual   #46  <Method StringBuilder StringBuilder.append(int)>
	//   18   55:pop             
			Log.wtf("BasePendingResult", ((StringBuilder) (message)).toString(), ((Throwable) (new Exception())));
	//   19   56:ldc1            #48  <String "BasePendingResult">
	//   20   58:aload_1         
	//   21   59:invokevirtual   #52  <Method String StringBuilder.toString()>
	//   22   62:new             #54  <Class Exception>
	//   23   65:dup             
	//   24   66:invokespecial   #56  <Method void Exception()>
	//   25   69:invokestatic    #62  <Method int Log.wtf(String, String, Throwable)>
	//   26   72:pop             
			return;
	//   27   73:return          

		case 2: // '\002'
			((BasePendingResult)message.obj).zab(Status.RESULT_TIMEOUT);
	//   28   74:aload_1         
	//   29   75:getfield        #66  <Field Object Message.obj>
	//   30   78:checkcast       #7   <Class BasePendingResult>
	//   31   81:getstatic       #72  <Field Status Status.RESULT_TIMEOUT>
	//   32   84:invokevirtual   #76  <Method void BasePendingResult.zab(Status)>
			return;
	//   33   87:return          

		case 1: // '\001'
			obj = ((Object) ((Pair)message.obj));
	//   34   88:aload_1         
	//   35   89:getfield        #66  <Field Object Message.obj>
	//   36   92:checkcast       #78  <Class Pair>
	//   37   95:astore_3        
			message = ((Message) ((ResultCallback)((Pair) (obj)).first));
	//   38   96:aload_3         
	//   39   97:getfield        #81  <Field Object Pair.first>
	//   40  100:checkcast       #83  <Class ResultCallback>
	//   41  103:astore_1        
			obj = ((Object) ((Result)((Pair) (obj)).second));
	//   42  104:aload_3         
	//   43  105:getfield        #86  <Field Object Pair.second>
	//   44  108:checkcast       #88  <Class Result>
	//   45  111:astore_3        
			break;
		}
		try
		{
			((ResultCallback) (message)).onResult(((Result) (obj)));
	//   46  112:aload_1         
	//   47  113:aload_3         
	//   48  114:invokeinterface #92  <Method void ResultCallback.onResult(Result)>
			return;
	//   49  119:return          
		}
		// Misplaced declaration of an exception variable
		catch(Message message)
	//*  50  120:astore_1        
		{
			BasePendingResult.zab(((Result) (obj)));
	//   51  121:aload_3         
	//   52  122:invokestatic    #94  <Method void BasePendingResult.zab(Result)>
		}
		throw message;
	//   53  125:aload_1         
	//   54  126:athrow          
	}

	public final void zaa(ResultCallback resultcallback, Result result)
	{
		sendMessage(obtainMessage(1, ((Object) (new Pair(((Object) (resultcallback)), ((Object) (result)))))));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:iconst_1        
	//    3    3:new             #78  <Class Pair>
	//    4    6:dup             
	//    5    7:aload_1         
	//    6    8:aload_2         
	//    7    9:invokespecial   #99  <Method void Pair(Object, Object)>
	//    8   12:invokevirtual   #103 <Method Message obtainMessage(int, Object)>
	//    9   15:invokevirtual   #107 <Method boolean sendMessage(Message)>
	//   10   18:pop             
	//   11   19:return          
	}

	public BasePendingResult$CallbackHandler()
	{
		this(Looper.getMainLooper());
	//    0    0:aload_0         
	//    1    1:invokestatic    #17  <Method Looper Looper.getMainLooper()>
	//    2    4:invokespecial   #20  <Method void BasePendingResult$CallbackHandler(Looper)>
	//    3    7:return          
	}

	public BasePendingResult$CallbackHandler(Looper looper)
	{
		super(looper);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #22  <Method void zal(Looper)>
	//    3    5:return          
	}
}
