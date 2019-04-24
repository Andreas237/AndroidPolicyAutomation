// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.app.Activity;
import android.arch.lifecycle.*;
import android.os.Bundle;
import android.support.v4.f.m;

public class SupportActivity extends Activity
	implements c
{
	public static class ExtraData
	{

		public ExtraData()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #11  <Method void Object()>
		//    2    4:return          
		}
	}


	public SupportActivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Activity()>
		mExtraDataMap = new m();
	//    2    4:aload_0         
	//    3    5:new             #20  <Class m>
	//    4    8:dup             
	//    5    9:invokespecial   #21  <Method void m()>
	//    6   12:putfield        #23  <Field m mExtraDataMap>
		mLifecycleRegistry = new d(((c) (this)));
	//    7   15:aload_0         
	//    8   16:new             #25  <Class d>
	//    9   19:dup             
	//   10   20:aload_0         
	//   11   21:invokespecial   #28  <Method void d(c)>
	//   12   24:putfield        #30  <Field d mLifecycleRegistry>
	//   13   27:return          
	}

	public ExtraData getExtraData(Class class1)
	{
		return (ExtraData)mExtraDataMap.get(((Object) (class1)));
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field m mExtraDataMap>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #37  <Method Object m.get(Object)>
	//    4    8:checkcast       #8   <Class SupportActivity$ExtraData>
	//    5   11:areturn         
	}

	public b getLifecycle()
	{
		return ((b) (mLifecycleRegistry));
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field d mLifecycleRegistry>
	//    2    4:areturn         
	}

	protected void onCreate(Bundle bundle)
	{
		super.onCreate(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #45  <Method void Activity.onCreate(Bundle)>
		g.a(((Activity) (this)));
	//    3    5:aload_0         
	//    4    6:invokestatic    #51  <Method void g.a(Activity)>
	//    5    9:return          
	}

	protected void onSaveInstanceState(Bundle bundle)
	{
		mLifecycleRegistry.a(android.arch.lifecycle.b.b.CREATED);
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field d mLifecycleRegistry>
	//    2    4:getstatic       #58  <Field android.arch.lifecycle.b$b android.arch.lifecycle.b$b.CREATED>
	//    3    7:invokevirtual   #61  <Method void d.a(android.arch.lifecycle.b$b)>
		super.onSaveInstanceState(bundle);
	//    4   10:aload_0         
	//    5   11:aload_1         
	//    6   12:invokespecial   #63  <Method void Activity.onSaveInstanceState(Bundle)>
	//    7   15:return          
	}

	public void putExtraData(ExtraData extradata)
	{
		mExtraDataMap.put(((Object) (((Object) (extradata)).getClass())), ((Object) (extradata)));
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field m mExtraDataMap>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #71  <Method Class Object.getClass()>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #75  <Method Object m.put(Object, Object)>
	//    6   12:pop             
	//    7   13:return          
	}

	private m mExtraDataMap;
	private d mLifecycleRegistry;
}
