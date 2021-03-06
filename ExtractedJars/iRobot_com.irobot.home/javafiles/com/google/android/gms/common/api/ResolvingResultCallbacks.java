// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.api;

import android.app.Activity;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;

// Referenced classes of package com.google.android.gms.common.api:
//			ResultCallbacks, Status, Result

public abstract class ResolvingResultCallbacks extends ResultCallbacks
{

	protected ResolvingResultCallbacks(Activity activity, int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void ResultCallbacks()>
		mActivity = (Activity)Preconditions.checkNotNull(((Object) (activity)), "Activity must not be null");
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:ldc1            #16  <String "Activity must not be null">
	//    5    8:invokestatic    #22  <Method Object Preconditions.checkNotNull(Object, Object)>
	//    6   11:checkcast       #24  <Class Activity>
	//    7   14:putfield        #26  <Field Activity mActivity>
		zzan = i;
	//    8   17:aload_0         
	//    9   18:iload_2         
	//   10   19:putfield        #28  <Field int zzan>
	//   11   22:return          
	}

	public final void onFailure(Status status)
	{
		if(status.hasResolution())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #40  <Method boolean Status.hasResolution()>
	//*   2    4:ifeq            44
		{
			try
			{
				status.startResolutionForResult(mActivity, zzan);
	//    3    7:aload_1         
	//    4    8:aload_0         
	//    5    9:getfield        #26  <Field Activity mActivity>
	//    6   12:aload_0         
	//    7   13:getfield        #28  <Field int zzan>
	//    8   16:invokevirtual   #43  <Method void Status.startResolutionForResult(Activity, int)>
				return;
	//    9   19:return          
			}
			// Misplaced declaration of an exception variable
			catch(Status status)
	//*  10   20:astore_1        
			{
				Log.e("ResolvingResultCallback", "Failed to start resolution", ((Throwable) (status)));
	//   11   21:ldc1            #45  <String "ResolvingResultCallback">
	//   12   23:ldc1            #47  <String "Failed to start resolution">
	//   13   25:aload_1         
	//   14   26:invokestatic    #53  <Method int Log.e(String, String, Throwable)>
	//   15   29:pop             
			}
			onUnresolvableFailure(new Status(8));
	//   16   30:aload_0         
	//   17   31:new             #36  <Class Status>
	//   18   34:dup             
	//   19   35:bipush          8
	//   20   37:invokespecial   #56  <Method void Status(int)>
	//   21   40:invokevirtual   #59  <Method void onUnresolvableFailure(Status)>
			return;
	//   22   43:return          
		} else
		{
			onUnresolvableFailure(status);
	//   23   44:aload_0         
	//   24   45:aload_1         
	//   25   46:invokevirtual   #59  <Method void onUnresolvableFailure(Status)>
			return;
	//   26   49:return          
		}
	}

	public abstract void onSuccess(Result result);

	public abstract void onUnresolvableFailure(Status status);

	private final Activity mActivity;
	private final int zzan;
}
