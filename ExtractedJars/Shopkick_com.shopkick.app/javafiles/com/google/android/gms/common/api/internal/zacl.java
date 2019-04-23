// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

final class zacl
	implements Continuation
{

	zacl()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	public final Object then(Task task)
		throws Exception
	{
		if(((Boolean)task.getResult()).booleanValue())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #23  <Method Object Task.getResult()>
	//*   2    4:checkcast       #25  <Class Boolean>
	//*   3    7:invokevirtual   #29  <Method boolean Boolean.booleanValue()>
	//*   4   10:ifeq            15
			return ((Object) (null));
	//    5   13:aconst_null     
	//    6   14:areturn         
		else
			throw new ApiException(new Status(13, "listener already unregistered"));
	//    7   15:new             #31  <Class ApiException>
	//    8   18:dup             
	//    9   19:new             #33  <Class Status>
	//   10   22:dup             
	//   11   23:bipush          13
	//   12   25:ldc1            #35  <String "listener already unregistered">
	//   13   27:invokespecial   #38  <Method void Status(int, String)>
	//   14   30:invokespecial   #41  <Method void ApiException(Status)>
	//   15   33:athrow          
	}
}
