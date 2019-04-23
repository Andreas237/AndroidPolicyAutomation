// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package androidx.work.impl;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import androidx.work.Operation;
import androidx.work.impl.utils.futures.SettableFuture;
import com.google.common.util.concurrent.ListenableFuture;

public class OperationImpl
	implements Operation
{

	public OperationImpl()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #22  <Class MutableLiveData>
	//    4    8:dup             
	//    5    9:invokespecial   #23  <Method void MutableLiveData()>
	//    6   12:putfield        #25  <Field MutableLiveData mOperationState>
	//    7   15:aload_0         
	//    8   16:invokestatic    #31  <Method SettableFuture SettableFuture.create()>
	//    9   19:putfield        #33  <Field SettableFuture mOperationFuture>
		setState(((androidx.work.Operation.State) (Operation.IN_PROGRESS)));
	//   10   22:aload_0         
	//   11   23:getstatic       #37  <Field androidx.work.Operation$State$IN_PROGRESS Operation.IN_PROGRESS>
	//   12   26:invokevirtual   #41  <Method void setState(androidx.work.Operation$State)>
	//   13   29:return          
	}

	public ListenableFuture getResult()
	{
		return ((ListenableFuture) (mOperationFuture));
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field SettableFuture mOperationFuture>
	//    2    4:areturn         
	}

	public LiveData getState()
	{
		return ((LiveData) (mOperationState));
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field MutableLiveData mOperationState>
	//    2    4:areturn         
	}

	public void setState(androidx.work.Operation.State state)
	{
		mOperationState.postValue(((Object) (state)));
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field MutableLiveData mOperationState>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #55  <Method void MutableLiveData.postValue(Object)>
		if(state instanceof androidx.work.Operation.State.SUCCESS)
	//*   4    8:aload_1         
	//*   5    9:instanceof      #57  <Class androidx.work.Operation$State$SUCCESS>
	//*   6   12:ifeq            28
		{
			mOperationFuture.set(((Object) ((androidx.work.Operation.State.SUCCESS)state)));
	//    7   15:aload_0         
	//    8   16:getfield        #33  <Field SettableFuture mOperationFuture>
	//    9   19:aload_1         
	//   10   20:checkcast       #57  <Class androidx.work.Operation$State$SUCCESS>
	//   11   23:invokevirtual   #61  <Method boolean SettableFuture.set(Object)>
	//   12   26:pop             
			return;
	//   13   27:return          
		}
		if(state instanceof androidx.work.Operation.State.FAILURE)
	//*  14   28:aload_1         
	//*  15   29:instanceof      #63  <Class androidx.work.Operation$State$FAILURE>
	//*  16   32:ifeq            52
		{
			state = ((androidx.work.Operation.State) ((androidx.work.Operation.State.FAILURE)state));
	//   17   35:aload_1         
	//   18   36:checkcast       #63  <Class androidx.work.Operation$State$FAILURE>
	//   19   39:astore_1        
			mOperationFuture.setException(((androidx.work.Operation.State.FAILURE) (state)).getThrowable());
	//   20   40:aload_0         
	//   21   41:getfield        #33  <Field SettableFuture mOperationFuture>
	//   22   44:aload_1         
	//   23   45:invokevirtual   #67  <Method Throwable androidx.work.Operation$State$FAILURE.getThrowable()>
	//   24   48:invokevirtual   #71  <Method boolean SettableFuture.setException(Throwable)>
	//   25   51:pop             
		}
	//   26   52:return          
	}

	private final SettableFuture mOperationFuture = SettableFuture.create();
	private final MutableLiveData mOperationState = new MutableLiveData();
}
