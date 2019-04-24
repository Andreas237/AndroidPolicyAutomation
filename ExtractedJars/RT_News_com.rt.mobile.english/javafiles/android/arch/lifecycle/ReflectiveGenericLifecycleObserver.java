// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.arch.lifecycle;


// Referenced classes of package android.arch.lifecycle:
//			GenericLifecycleObserver, ClassesInfoCache, LifecycleOwner

class ReflectiveGenericLifecycleObserver
	implements GenericLifecycleObserver
{

	ReflectiveGenericLifecycleObserver(Object obj)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		mWrapped = obj;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #17  <Field Object mWrapped>
		mInfo = ClassesInfoCache.sInstance.getInfo(mWrapped.getClass());
	//    5    9:aload_0         
	//    6   10:getstatic       #23  <Field ClassesInfoCache ClassesInfoCache.sInstance>
	//    7   13:aload_0         
	//    8   14:getfield        #17  <Field Object mWrapped>
	//    9   17:invokevirtual   #27  <Method Class Object.getClass()>
	//   10   20:invokevirtual   #31  <Method ClassesInfoCache$CallbackInfo ClassesInfoCache.getInfo(Class)>
	//   11   23:putfield        #33  <Field ClassesInfoCache$CallbackInfo mInfo>
	//   12   26:return          
	}

	public void onStateChanged(LifecycleOwner lifecycleowner, Lifecycle.Event event)
	{
		mInfo.invokeCallbacks(lifecycleowner, event, mWrapped);
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field ClassesInfoCache$CallbackInfo mInfo>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:aload_0         
	//    5    7:getfield        #17  <Field Object mWrapped>
	//    6   10:invokevirtual   #42  <Method void ClassesInfoCache$CallbackInfo.invokeCallbacks(LifecycleOwner, Lifecycle$Event, Object)>
	//    7   13:return          
	}

	private final ClassesInfoCache.CallbackInfo mInfo;
	private final Object mWrapped;
}
