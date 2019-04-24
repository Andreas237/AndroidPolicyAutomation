// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.api;

import android.util.Log;

// Referenced classes of package com.google.android.gms.common.api:
//			ResultCallback, Result, Status, Releasable

public abstract class ResultCallbacks
	implements ResultCallback
{

	public ResultCallbacks()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	public abstract void onFailure(Status status);

	public final void onResult(Result result)
	{
		Status status = result.getStatus();
	//    0    0:aload_1         
	//    1    1:invokeinterface #26  <Method Status Result.getStatus()>
	//    2    6:astore_2        
		if(status.isSuccess())
	//*   3    7:aload_2         
	//*   4    8:invokevirtual   #32  <Method boolean Status.isSuccess()>
	//*   5   11:ifeq            20
		{
			onSuccess(result);
	//    6   14:aload_0         
	//    7   15:aload_1         
	//    8   16:invokevirtual   #35  <Method void onSuccess(Result)>
			return;
	//    9   19:return          
		}
		onFailure(status);
	//   10   20:aload_0         
	//   11   21:aload_2         
	//   12   22:invokevirtual   #37  <Method void onFailure(Status)>
		if(result instanceof Releasable)
	//*  13   25:aload_1         
	//*  14   26:instanceof      #39  <Class Releasable>
	//*  15   29:ifeq            90
			try
			{
				((Releasable)result).release();
	//   16   32:aload_1         
	//   17   33:checkcast       #39  <Class Releasable>
	//   18   36:invokeinterface #42  <Method void Releasable.release()>
				return;
	//   19   41:return          
			}
			catch(RuntimeException runtimeexception)
	//*  20   42:astore_2        
			{
				result = ((Result) (String.valueOf(((Object) (result)))));
	//   21   43:aload_1         
	//   22   44:invokestatic    #48  <Method String String.valueOf(Object)>
	//   23   47:astore_1        
				StringBuilder stringbuilder = new StringBuilder(18 + String.valueOf(((Object) (result))).length());
	//   24   48:new             #50  <Class StringBuilder>
	//   25   51:dup             
	//   26   52:bipush          18
	//   27   54:aload_1         
	//   28   55:invokestatic    #48  <Method String String.valueOf(Object)>
	//   29   58:invokevirtual   #54  <Method int String.length()>
	//   30   61:iadd            
	//   31   62:invokespecial   #57  <Method void StringBuilder(int)>
	//   32   65:astore_3        
				stringbuilder.append("Unable to release ");
	//   33   66:aload_3         
	//   34   67:ldc1            #59  <String "Unable to release ">
	//   35   69:invokevirtual   #63  <Method StringBuilder StringBuilder.append(String)>
	//   36   72:pop             
				stringbuilder.append(((String) (result)));
	//   37   73:aload_3         
	//   38   74:aload_1         
	//   39   75:invokevirtual   #63  <Method StringBuilder StringBuilder.append(String)>
	//   40   78:pop             
				Log.w("ResultCallbacks", stringbuilder.toString(), ((Throwable) (runtimeexception)));
	//   41   79:ldc1            #65  <String "ResultCallbacks">
	//   42   81:aload_3         
	//   43   82:invokevirtual   #69  <Method String StringBuilder.toString()>
	//   44   85:aload_2         
	//   45   86:invokestatic    #75  <Method int Log.w(String, String, Throwable)>
	//   46   89:pop             
			}
	//   47   90:return          
	}

	public abstract void onSuccess(Result result);
}
