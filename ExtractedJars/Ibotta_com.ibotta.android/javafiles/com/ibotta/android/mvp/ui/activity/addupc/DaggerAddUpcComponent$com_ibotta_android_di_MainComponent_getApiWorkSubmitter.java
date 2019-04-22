// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.ibotta.android.mvp.ui.activity.addupc;

import com.ibotta.android.di.MainComponent;
import com.ibotta.android.service.api.ApiWorkSubmitter;
import dagger.internal.Preconditions;
import javax.inject.Provider;

// Referenced classes of package com.ibotta.android.mvp.ui.activity.addupc:
//			DaggerAddUpcComponent

private static class DaggerAddUpcComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter
	implements Provider
{

	public ApiWorkSubmitter get()
	{
		return (ApiWorkSubmitter)Preconditions.checkNotNull(((Object) (mainComponent.getApiWorkSubmitter())), "Cannot return null from a non-@Nullable component method");
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field MainComponent mainComponent>
	//    2    4:invokeinterface #27  <Method ApiWorkSubmitter MainComponent.getApiWorkSubmitter()>
	//    3    9:ldc1            #29  <String "Cannot return null from a non-@Nullable component method">
	//    4   11:invokestatic    #35  <Method Object Preconditions.checkNotNull(Object, String)>
	//    5   14:checkcast       #37  <Class ApiWorkSubmitter>
	//    6   17:areturn         
	}

	public volatile Object get()
	{
		return ((Object) (get()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #40  <Method ApiWorkSubmitter get()>
	//    2    4:areturn         
	}

	private final MainComponent mainComponent;

	DaggerAddUpcComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter(MainComponent maincomponent)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		mainComponent = maincomponent;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #19  <Field MainComponent mainComponent>
	//    5    9:return          
	}
}
