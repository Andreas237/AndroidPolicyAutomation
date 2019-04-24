// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.tasks;

import android.app.Activity;
import java.util.concurrent.Executor;

// Referenced classes of package com.google.android.gms.tasks:
//			OnCompleteListener, OnFailureListener, OnSuccessListener, Continuation

public abstract class Task
{

	public Task()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #9   <Method void Object()>
	//    2    4:return          
	}

	public Task addOnCompleteListener(Activity activity, OnCompleteListener oncompletelistener)
	{
		throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
	//    0    0:new             #15  <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:ldc1            #17  <String "addOnCompleteListener is not implemented">
	//    3    6:invokespecial   #20  <Method void UnsupportedOperationException(String)>
	//    4    9:athrow          
	}

	public Task addOnCompleteListener(OnCompleteListener oncompletelistener)
	{
		throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
	//    0    0:new             #15  <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:ldc1            #17  <String "addOnCompleteListener is not implemented">
	//    3    6:invokespecial   #20  <Method void UnsupportedOperationException(String)>
	//    4    9:athrow          
	}

	public Task addOnCompleteListener(Executor executor, OnCompleteListener oncompletelistener)
	{
		throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
	//    0    0:new             #15  <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:ldc1            #17  <String "addOnCompleteListener is not implemented">
	//    3    6:invokespecial   #20  <Method void UnsupportedOperationException(String)>
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
	//    0    0:new             #15  <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:ldc1            #40  <String "continueWith is not implemented">
	//    3    6:invokespecial   #20  <Method void UnsupportedOperationException(String)>
	//    4    9:athrow          
	}

	public Task continueWith(Executor executor, Continuation continuation)
	{
		throw new UnsupportedOperationException("continueWith is not implemented");
	//    0    0:new             #15  <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:ldc1            #40  <String "continueWith is not implemented">
	//    3    6:invokespecial   #20  <Method void UnsupportedOperationException(String)>
	//    4    9:athrow          
	}

	public Task continueWithTask(Continuation continuation)
	{
		throw new UnsupportedOperationException("continueWithTask is not implemented");
	//    0    0:new             #15  <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:ldc1            #46  <String "continueWithTask is not implemented">
	//    3    6:invokespecial   #20  <Method void UnsupportedOperationException(String)>
	//    4    9:athrow          
	}

	public Task continueWithTask(Executor executor, Continuation continuation)
	{
		throw new UnsupportedOperationException("continueWithTask is not implemented");
	//    0    0:new             #15  <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:ldc1            #46  <String "continueWithTask is not implemented">
	//    3    6:invokespecial   #20  <Method void UnsupportedOperationException(String)>
	//    4    9:athrow          
	}

	public abstract Exception getException();

	public abstract Object getResult();

	public abstract Object getResult(Class class1)
		throws Throwable;

	public abstract boolean isComplete();

	public abstract boolean isSuccessful();
}
