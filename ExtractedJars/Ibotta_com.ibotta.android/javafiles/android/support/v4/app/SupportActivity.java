// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.app.Activity;
import android.arch.lifecycle.*;
import android.os.Bundle;
import android.support.v4.util.SimpleArrayMap;
import android.support.v4.view.KeyEventDispatcher;
import android.view.KeyEvent;
import android.view.Window;

public class SupportActivity extends Activity
	implements LifecycleOwner, android.support.v4.view.KeyEventDispatcher.Component
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
	//    1    1:invokespecial   #24  <Method void Activity()>
		mExtraDataMap = new SimpleArrayMap();
	//    2    4:aload_0         
	//    3    5:new             #26  <Class SimpleArrayMap>
	//    4    8:dup             
	//    5    9:invokespecial   #27  <Method void SimpleArrayMap()>
	//    6   12:putfield        #29  <Field SimpleArrayMap mExtraDataMap>
		mLifecycleRegistry = new LifecycleRegistry(((LifecycleOwner) (this)));
	//    7   15:aload_0         
	//    8   16:new             #31  <Class LifecycleRegistry>
	//    9   19:dup             
	//   10   20:aload_0         
	//   11   21:invokespecial   #34  <Method void LifecycleRegistry(LifecycleOwner)>
	//   12   24:putfield        #36  <Field LifecycleRegistry mLifecycleRegistry>
	//   13   27:return          
	}

	public boolean dispatchKeyEvent(KeyEvent keyevent)
	{
		android.view.View view = getWindow().getDecorView();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #43  <Method Window getWindow()>
	//    2    4:invokevirtual   #49  <Method android.view.View Window.getDecorView()>
	//    3    7:astore_2        
		if(view != null && KeyEventDispatcher.dispatchBeforeHierarchy(view, keyevent))
	//*   4    8:aload_2         
	//*   5    9:ifnull          22
	//*   6   12:aload_2         
	//*   7   13:aload_1         
	//*   8   14:invokestatic    #55  <Method boolean KeyEventDispatcher.dispatchBeforeHierarchy(android.view.View, KeyEvent)>
	//*   9   17:ifeq            22
			return true;
	//   10   20:iconst_1        
	//   11   21:ireturn         
		else
			return KeyEventDispatcher.dispatchKeyEvent(((android.support.v4.view.KeyEventDispatcher.Component) (this)), view, ((android.view.Window.Callback) (this)), keyevent);
	//   12   22:aload_0         
	//   13   23:aload_2         
	//   14   24:aload_0         
	//   15   25:aload_1         
	//   16   26:invokestatic    #58  <Method boolean KeyEventDispatcher.dispatchKeyEvent(android.support.v4.view.KeyEventDispatcher$Component, android.view.View, android.view.Window$Callback, KeyEvent)>
	//   17   29:ireturn         
	}

	public boolean dispatchKeyShortcutEvent(KeyEvent keyevent)
	{
		android.view.View view = getWindow().getDecorView();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #43  <Method Window getWindow()>
	//    2    4:invokevirtual   #49  <Method android.view.View Window.getDecorView()>
	//    3    7:astore_2        
		if(view != null && KeyEventDispatcher.dispatchBeforeHierarchy(view, keyevent))
	//*   4    8:aload_2         
	//*   5    9:ifnull          22
	//*   6   12:aload_2         
	//*   7   13:aload_1         
	//*   8   14:invokestatic    #55  <Method boolean KeyEventDispatcher.dispatchBeforeHierarchy(android.view.View, KeyEvent)>
	//*   9   17:ifeq            22
			return true;
	//   10   20:iconst_1        
	//   11   21:ireturn         
		else
			return super.dispatchKeyShortcutEvent(keyevent);
	//   12   22:aload_0         
	//   13   23:aload_1         
	//   14   24:invokespecial   #61  <Method boolean Activity.dispatchKeyShortcutEvent(KeyEvent)>
	//   15   27:ireturn         
	}

	public ExtraData getExtraData(Class class1)
	{
		return (ExtraData)mExtraDataMap.get(((Object) (class1)));
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field SimpleArrayMap mExtraDataMap>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #67  <Method Object SimpleArrayMap.get(Object)>
	//    4    8:checkcast       #10  <Class SupportActivity$ExtraData>
	//    5   11:areturn         
	}

	public Lifecycle getLifecycle()
	{
		return ((Lifecycle) (mLifecycleRegistry));
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field LifecycleRegistry mLifecycleRegistry>
	//    2    4:areturn         
	}

	protected void onCreate(Bundle bundle)
	{
		super.onCreate(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #77  <Method void Activity.onCreate(Bundle)>
		ReportFragment.injectIfNeededIn(((Activity) (this)));
	//    3    5:aload_0         
	//    4    6:invokestatic    #83  <Method void ReportFragment.injectIfNeededIn(Activity)>
	//    5    9:return          
	}

	protected void onSaveInstanceState(Bundle bundle)
	{
		mLifecycleRegistry.markState(android.arch.lifecycle.Lifecycle.State.CREATED);
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field LifecycleRegistry mLifecycleRegistry>
	//    2    4:getstatic       #92  <Field android.arch.lifecycle.Lifecycle$State android.arch.lifecycle.Lifecycle$State.CREATED>
	//    3    7:invokevirtual   #96  <Method void LifecycleRegistry.markState(android.arch.lifecycle.Lifecycle$State)>
		super.onSaveInstanceState(bundle);
	//    4   10:aload_0         
	//    5   11:aload_1         
	//    6   12:invokespecial   #98  <Method void Activity.onSaveInstanceState(Bundle)>
	//    7   15:return          
	}

	public void putExtraData(ExtraData extradata)
	{
		mExtraDataMap.put(((Object) (((Object) (extradata)).getClass())), ((Object) (extradata)));
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field SimpleArrayMap mExtraDataMap>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #106 <Method Class Object.getClass()>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #110 <Method Object SimpleArrayMap.put(Object, Object)>
	//    6   12:pop             
	//    7   13:return          
	}

	public boolean superDispatchKeyEvent(KeyEvent keyevent)
	{
		return super.dispatchKeyEvent(keyevent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #113 <Method boolean Activity.dispatchKeyEvent(KeyEvent)>
	//    3    5:ireturn         
	}

	private SimpleArrayMap mExtraDataMap;
	private LifecycleRegistry mLifecycleRegistry;
}
