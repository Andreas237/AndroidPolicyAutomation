// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.tasks;

import android.app.Activity;
import java.util.concurrent.Executor;

// Referenced classes of package com.google.android.gms.tasks:
//			OnCanceledListener, OnCompleteListener, OnFailureListener, OnSuccessListener, 
//			Continuation, SuccessContinuation

public abstract class Task
{

	public Task()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #9   <Method void Object()>
	//    2    4:return          
	}

	public Task addOnCanceledListener(Activity activity, OnCanceledListener oncanceledlistener)
	{
		throw new UnsupportedOperationException("addOnCanceledListener is not implemented.");
	//    0    0:new             #14  <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:ldc1            #16  <String "addOnCanceledListener is not implemented.">
	//    3    6:invokespecial   #19  <Method void UnsupportedOperationException(String)>
	//    4    9:athrow          
	}

	public Task addOnCanceledListener(OnCanceledListener oncanceledlistener)
	{
		throw new UnsupportedOperationException("addOnCanceledListener is not implemented.");
	//    0    0:new             #14  <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:ldc1            #16  <String "addOnCanceledListener is not implemented.">
	//    3    6:invokespecial   #19  <Method void UnsupportedOperationException(String)>
	//    4    9:athrow          
	}

	public Task addOnCanceledListener(Executor executor, OnCanceledListener oncanceledlistener)
	{
		throw new UnsupportedOperationException("addOnCanceledListener is not implemented");
	//    0    0:new             #14  <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:ldc1            #26  <String "addOnCanceledListener is not implemented">
	//    3    6:invokespecial   #19  <Method void UnsupportedOperationException(String)>
	//    4    9:athrow          
	}

	public Task addOnCompleteListener(Activity activity, OnCompleteListener oncompletelistener)
	{
		throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
	//    0    0:new             #14  <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:ldc1            #31  <String "addOnCompleteListener is not implemented">
	//    3    6:invokespecial   #19  <Method void UnsupportedOperationException(String)>
	//    4    9:athrow          
	}

	public Task addOnCompleteListener(OnCompleteListener oncompletelistener)
	{
		throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
	//    0    0:new             #14  <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:ldc1            #31  <String "addOnCompleteListener is not implemented">
	//    3    6:invokespecial   #19  <Method void UnsupportedOperationException(String)>
	//    4    9:athrow          
	}

	public Task addOnCompleteListener(Executor executor, OnCompleteListener oncompletelistener)
	{
		throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
	//    0    0:new             #14  <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:ldc1            #31  <String "addOnCompleteListener is not implemented">
	//    3    6:invokespecial   #19  <Method void UnsupportedOperationException(String)>
	//    4    9:athrow          
	}

	public abstract Task addOnFailureListener(Activity activity, OnFailureListener onfailurelistener);

	public abstract Task addOnFailureListener(OnFailureListener onfailurelistener);

	public abstract Task addOnFailureListener(Executor executor, OnFailureListener onfailurelistener);

	public abstract Task addOnSuccessListener(Activity activity, OnSuccessListener onsuccesslistener);

	public abstract Task addOnSuccessListener(OnSuccessListener onsuccesslistener);

	public abstract Task addOnSuccessListener(Executor executor, OnSuccessListener onsuccesslistener);

	public Task continueWith(Continuation continuation)
	{
		throw new UnsupportedOperationException("continueWith is not implemented");
	//    0    0:new             #14  <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:ldc1            #48  <String "continueWith is not implemented">
	//    3    6:invokespecial   #19  <Method void UnsupportedOperationException(String)>
	//    4    9:athrow          
	}

	public Task continueWith(Executor executor, Continuation continuation)
	{
		throw new UnsupportedOperationException("continueWith is not implemented");
	//    0    0:new             #14  <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:ldc1            #48  <String "continueWith is not implemented">
	//    3    6:invokespecial   #19  <Method void UnsupportedOperationException(String)>
	//    4    9:athrow          
	}

	public Task continueWithTask(Continuation continuation)
	{
		throw new UnsupportedOperationException("continueWithTask is not implemented");
	//    0    0:new             #14  <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:ldc1            #54  <String "continueWithTask is not implemented">
	//    3    6:invokespecial   #19  <Method void UnsupportedOperationException(String)>
	//    4    9:athrow          
	}

	public Task continueWithTask(Executor executor, Continuation continuation)
	{
		throw new UnsupportedOperationException("continueWithTask is not implemented");
	//    0    0:new             #14  <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:ldc1            #54  <String "continueWithTask is not implemented">
	//    3    6:invokespecial   #19  <Method void UnsupportedOperationException(String)>
	//    4    9:athrow          
	}

	public abstract Exception getException();

	public abstract Object getResult();

	public abstract Object getResult(Class class1);

	public abstract boolean isCanceled();

	public abstract boolean isComplete();

	public abstract boolean isSuccessful();

	public Task onSuccessTask(SuccessContinuation successcontinuation)
	{
		throw new UnsupportedOperationException("onSuccessTask is not implemented");
	//    0    0:new             #14  <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:ldc1            #69  <String "onSuccessTask is not implemented">
	//    3    6:invokespecial   #19  <Method void UnsupportedOperationException(String)>
	//    4    9:athrow          
	}

	public Task onSuccessTask(Executor executor, SuccessContinuation successcontinuation)
	{
		throw new UnsupportedOperationException("onSuccessTask is not implemented");
	//    0    0:new             #14  <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:ldc1            #69  <String "onSuccessTask is not implemented">
	//    3    6:invokespecial   #19  <Method void UnsupportedOperationException(String)>
	//    4    9:athrow          
	}
}
