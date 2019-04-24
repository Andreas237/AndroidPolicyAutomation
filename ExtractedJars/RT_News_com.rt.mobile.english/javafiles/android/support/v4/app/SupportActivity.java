// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.app.Activity;
import android.arch.lifecycle.*;
import android.os.Bundle;
import android.support.v4.util.SimpleArrayMap;

public class SupportActivity extends Activity
	implements LifecycleOwner
{
	public static class ExtraData
	{

		public ExtraData()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #15  <Method void Object()>
		//    2    4:return          
		}
	}


	public SupportActivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void Activity()>
		mExtraDataMap = new SimpleArrayMap();
	//    2    4:aload_0         
	//    3    5:new             #24  <Class SimpleArrayMap>
	//    4    8:dup             
	//    5    9:invokespecial   #25  <Method void SimpleArrayMap()>
	//    6   12:putfield        #27  <Field SimpleArrayMap mExtraDataMap>
		mLifecycleRegistry = new LifecycleRegistry(((LifecycleOwner) (this)));
	//    7   15:aload_0         
	//    8   16:new             #29  <Class LifecycleRegistry>
	//    9   19:dup             
	//   10   20:aload_0         
	//   11   21:invokespecial   #32  <Method void LifecycleRegistry(LifecycleOwner)>
	//   12   24:putfield        #34  <Field LifecycleRegistry mLifecycleRegistry>
	//   13   27:return          
	}

	public ExtraData getExtraData(Class class1)
	{
		return (ExtraData)mExtraDataMap.get(((Object) (class1)));
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field SimpleArrayMap mExtraDataMap>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #41  <Method Object SimpleArrayMap.get(Object)>
	//    4    8:checkcast       #8   <Class SupportActivity$ExtraData>
	//    5   11:areturn         
	}

	public Lifecycle getLifecycle()
	{
		return ((Lifecycle) (mLifecycleRegistry));
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field LifecycleRegistry mLifecycleRegistry>
	//    2    4:areturn         
	}

	protected void onCreate(Bundle bundle)
	{
		super.onCreate(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #51  <Method void Activity.onCreate(Bundle)>
		ReportFragment.injectIfNeededIn(((Activity) (this)));
	//    3    5:aload_0         
	//    4    6:invokestatic    #57  <Method void ReportFragment.injectIfNeededIn(Activity)>
	//    5    9:return          
	}

	protected void onSaveInstanceState(Bundle bundle)
	{
		mLifecycleRegistry.markState(android.arch.lifecycle.Lifecycle.State.CREATED);
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field LifecycleRegistry mLifecycleRegistry>
	//    2    4:getstatic       #66  <Field android.arch.lifecycle.Lifecycle$State android.arch.lifecycle.Lifecycle$State.CREATED>
	//    3    7:invokevirtual   #70  <Method void LifecycleRegistry.markState(android.arch.lifecycle.Lifecycle$State)>
		super.onSaveInstanceState(bundle);
	//    4   10:aload_0         
	//    5   11:aload_1         
	//    6   12:invokespecial   #72  <Method void Activity.onSaveInstanceState(Bundle)>
	//    7   15:return          
	}

	public void putExtraData(ExtraData extradata)
	{
		mExtraDataMap.put(((Object) (((Object) (extradata)).getClass())), ((Object) (extradata)));
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field SimpleArrayMap mExtraDataMap>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #80  <Method Class Object.getClass()>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #84  <Method Object SimpleArrayMap.put(Object, Object)>
	//    6   12:pop             
	//    7   13:return          
	}

	private SimpleArrayMap mExtraDataMap;
	private LifecycleRegistry mLifecycleRegistry;
}
