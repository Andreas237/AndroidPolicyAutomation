// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.support.v4.f.b;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.Preconditions;

// Referenced classes of package com.google.android.gms.common.api.internal:
//			zal, LifecycleFragment, GoogleApiManager, zai

public class zaae extends zal
{

	private zaae(LifecycleFragment lifecyclefragment)
	{
		super(lifecyclefragment);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #13  <Method void zal(LifecycleFragment)>
	//    3    5:aload_0         
	//    4    6:new             #15  <Class b>
	//    5    9:dup             
	//    6   10:invokespecial   #18  <Method void b()>
	//    7   13:putfield        #20  <Field b zafo>
		mLifecycleFragment.addCallback("ConnectionlessLifecycleHelper", ((LifecycleCallback) (this)));
	//    8   16:aload_0         
	//    9   17:getfield        #24  <Field LifecycleFragment mLifecycleFragment>
	//   10   20:ldc1            #26  <String "ConnectionlessLifecycleHelper">
	//   11   22:aload_0         
	//   12   23:invokeinterface #32  <Method void LifecycleFragment.addCallback(String, LifecycleCallback)>
	//   13   28:return          
	}

	public static void zaa(Activity activity, GoogleApiManager googleapimanager, zai zai)
	{
		LifecycleFragment lifecyclefragment = getFragment(activity);
	//    0    0:aload_0         
	//    1    1:invokestatic    #39  <Method LifecycleFragment getFragment(Activity)>
	//    2    4:astore          4
		zaae zaae1 = (zaae)lifecyclefragment.getCallbackOrNull("ConnectionlessLifecycleHelper", com/google/android/gms/common/api/internal/zaae);
	//    3    6:aload           4
	//    4    8:ldc1            #26  <String "ConnectionlessLifecycleHelper">
	//    5   10:ldc1            #2   <Class zaae>
	//    6   12:invokeinterface #43  <Method LifecycleCallback LifecycleFragment.getCallbackOrNull(String, Class)>
	//    7   17:checkcast       #2   <Class zaae>
	//    8   20:astore_3        
		activity = ((Activity) (zaae1));
	//    9   21:aload_3         
	//   10   22:astore_0        
		if(zaae1 == null)
	//*  11   23:aload_3         
	//*  12   24:ifnonnull       37
			activity = ((Activity) (new zaae(lifecyclefragment)));
	//   13   27:new             #2   <Class zaae>
	//   14   30:dup             
	//   15   31:aload           4
	//   16   33:invokespecial   #44  <Method void zaae(LifecycleFragment)>
	//   17   36:astore_0        
		activity.zabm = googleapimanager;
	//   18   37:aload_0         
	//   19   38:aload_1         
	//   20   39:putfield        #46  <Field GoogleApiManager zabm>
		Preconditions.checkNotNull(((Object) (zai)), "ApiKey cannot be null");
	//   21   42:aload_2         
	//   22   43:ldc1            #48  <String "ApiKey cannot be null">
	//   23   45:invokestatic    #54  <Method Object Preconditions.checkNotNull(Object, Object)>
	//   24   48:pop             
		((zaae) (activity)).zafo.add(((Object) (zai)));
	//   25   49:aload_0         
	//   26   50:getfield        #20  <Field b zafo>
	//   27   53:aload_2         
	//   28   54:invokevirtual   #58  <Method boolean b.add(Object)>
	//   29   57:pop             
		googleapimanager.zaa(((zaae) (activity)));
	//   30   58:aload_1         
	//   31   59:aload_0         
	//   32   60:invokevirtual   #63  <Method void GoogleApiManager.zaa(zaae)>
	//   33   63:return          
	}

	private final void zaak()
	{
		if(!zafo.isEmpty())
	//*   0    0:aload_0         
	//*   1    1:getfield        #20  <Field b zafo>
	//*   2    4:invokevirtual   #70  <Method boolean b.isEmpty()>
	//*   3    7:ifne            18
			zabm.zaa(this);
	//    4   10:aload_0         
	//    5   11:getfield        #46  <Field GoogleApiManager zabm>
	//    6   14:aload_0         
	//    7   15:invokevirtual   #63  <Method void GoogleApiManager.zaa(zaae)>
	//    8   18:return          
	}

	public void onResume()
	{
		super.onResume();
	//    0    0:aload_0         
	//    1    1:invokespecial   #73  <Method void zal.onResume()>
		zaak();
	//    2    4:aload_0         
	//    3    5:invokespecial   #75  <Method void zaak()>
	//    4    8:return          
	}

	public void onStart()
	{
		super.onStart();
	//    0    0:aload_0         
	//    1    1:invokespecial   #78  <Method void zal.onStart()>
		zaak();
	//    2    4:aload_0         
	//    3    5:invokespecial   #75  <Method void zaak()>
	//    4    8:return          
	}

	public void onStop()
	{
		super.onStop();
	//    0    0:aload_0         
	//    1    1:invokespecial   #81  <Method void zal.onStop()>
		zabm.zab(this);
	//    2    4:aload_0         
	//    3    5:getfield        #46  <Field GoogleApiManager zabm>
	//    4    8:aload_0         
	//    5    9:invokevirtual   #84  <Method void GoogleApiManager.zab(zaae)>
	//    6   12:return          
	}

	protected final void zaa(ConnectionResult connectionresult, int i)
	{
		zabm.zaa(connectionresult, i);
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field GoogleApiManager zabm>
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:invokevirtual   #87  <Method void GoogleApiManager.zaa(ConnectionResult, int)>
	//    5    9:return          
	}

	final b zaaj()
	{
		return zafo;
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field b zafo>
	//    2    4:areturn         
	}

	protected final void zao()
	{
		zabm.zao();
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field GoogleApiManager zabm>
	//    2    4:invokevirtual   #93  <Method void GoogleApiManager.zao()>
	//    3    7:return          
	}

	private GoogleApiManager zabm;
	private final b zafo = new b();
}
