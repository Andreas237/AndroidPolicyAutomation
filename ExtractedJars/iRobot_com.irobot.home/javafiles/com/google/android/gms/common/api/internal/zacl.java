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
	{
		if(!((Boolean)task.getResult()).booleanValue())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #20  <Method Object Task.getResult()>
	//*   2    4:checkcast       #22  <Class Boolean>
	//*   3    7:invokevirtual   #26  <Method boolean Boolean.booleanValue()>
	//*   4   10:ifne            32
			throw new ApiException(new Status(13, "listener already unregistered"));
	//    5   13:new             #28  <Class ApiException>
	//    6   16:dup             
	//    7   17:new             #30  <Class Status>
	//    8   20:dup             
	//    9   21:bipush          13
	//   10   23:ldc1            #32  <String "listener already unregistered">
	//   11   25:invokespecial   #35  <Method void Status(int, String)>
	//   12   28:invokespecial   #38  <Method void ApiException(Status)>
	//   13   31:athrow          
		else
			return ((Object) (null));
	//   14   32:aconst_null     
	//   15   33:areturn         
	}
}
