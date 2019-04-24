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
	//    1    1:invokeinterface #25  <Method Status Result.getStatus()>
	//    2    6:astore_2        
		if(status.isSuccess())
	//*   3    7:aload_2         
	//*   4    8:invokevirtual   #31  <Method boolean Status.isSuccess()>
	//*   5   11:ifeq            20
		{
			onSuccess(result);
	//    6   14:aload_0         
	//    7   15:aload_1         
	//    8   16:invokevirtual   #34  <Method void onSuccess(Result)>
		} else
	//*   9   19:return          
		{
			onFailure(status);
	//   10   20:aload_0         
	//   11   21:aload_2         
	//   12   22:invokevirtual   #36  <Method void onFailure(Status)>
			if(result instanceof Releasable)
	//*  13   25:aload_1         
	//*  14   26:instanceof      #38  <Class Releasable>
	//*  15   29:ifeq            19
				try
				{
					((Releasable)result).release();
	//   16   32:aload_1         
	//   17   33:checkcast       #38  <Class Releasable>
	//   18   36:invokeinterface #41  <Method void Releasable.release()>
					return;
	//   19   41:return          
				}
				catch(RuntimeException runtimeexception)
	//*  20   42:astore_2        
				{
					result = ((Result) (String.valueOf(((Object) (result)))));
	//   21   43:aload_1         
	//   22   44:invokestatic    #47  <Method String String.valueOf(Object)>
	//   23   47:astore_1        
					Log.w("ResultCallbacks", (new StringBuilder(String.valueOf(((Object) (result))).length() + 18)).append("Unable to release ").append(((String) (result))).toString(), ((Throwable) (runtimeexception)));
	//   24   48:ldc1            #49  <String "ResultCallbacks">
	//   25   50:new             #51  <Class StringBuilder>
	//   26   53:dup             
	//   27   54:aload_1         
	//   28   55:invokestatic    #47  <Method String String.valueOf(Object)>
	//   29   58:invokevirtual   #55  <Method int String.length()>
	//   30   61:bipush          18
	//   31   63:iadd            
	//   32   64:invokespecial   #58  <Method void StringBuilder(int)>
	//   33   67:ldc1            #60  <String "Unable to release ">
	//   34   69:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
	//   35   72:aload_1         
	//   36   73:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
	//   37   76:invokevirtual   #68  <Method String StringBuilder.toString()>
	//   38   79:aload_2         
	//   39   80:invokestatic    #74  <Method int Log.w(String, String, Throwable)>
	//   40   83:pop             
					return;
	//   41   84:return          
				}
		}
	}

	public abstract void onSuccess(Result result);
}
