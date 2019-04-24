// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.databinding;


// Referenced classes of package android.databinding:
//			CallbackRegistry, Observable

public class PropertyChangeRegistry extends CallbackRegistry
{

	public PropertyChangeRegistry()
	{
		super(NOTIFIER_CALLBACK);
	//    0    0:aload_0         
	//    1    1:getstatic       #17  <Field CallbackRegistry$NotifierCallback NOTIFIER_CALLBACK>
	//    2    4:invokespecial   #21  <Method void CallbackRegistry(CallbackRegistry$NotifierCallback)>
	//    3    7:return          
	}

	public void notifyChange(Observable observable, int i)
	{
		notifyCallbacks(((Object) (observable)), i, ((Object) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:aconst_null     
	//    4    4:invokevirtual   #27  <Method void notifyCallbacks(Object, int, Object)>
	//    5    7:return          
	}

	private static final CallbackRegistry.NotifierCallback NOTIFIER_CALLBACK = new CallbackRegistry.NotifierCallback() {

		public void onNotifyCallback(Observable.OnPropertyChangedCallback onpropertychangedcallback, Observable observable, int i, Void void1)
		{
			onpropertychangedcallback.onPropertyChanged(observable, i);
		//    0    0:aload_1         
		//    1    1:aload_2         
		//    2    2:iload_3         
		//    3    3:invokevirtual   #20  <Method void Observable$OnPropertyChangedCallback.onPropertyChanged(Observable, int)>
		//    4    6:return          
		}

		public volatile void onNotifyCallback(Object obj, Object obj1, int i, Object obj2)
		{
			onNotifyCallback((Observable.OnPropertyChangedCallback)obj, (Observable)obj1, i, (Void)obj2);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #16  <Class Observable$OnPropertyChangedCallback>
		//    3    5:aload_2         
		//    4    6:checkcast       #23  <Class Observable>
		//    5    9:iload_3         
		//    6   10:aload           4
		//    7   12:checkcast       #25  <Class Void>
		//    8   15:invokevirtual   #27  <Method void onNotifyCallback(Observable$OnPropertyChangedCallback, Observable, int, Void)>
		//    9   18:return          
		}

	}
;

	static 
	{
	//    0    0:new             #7   <Class PropertyChangeRegistry$1>
	//    1    3:dup             
	//    2    4:invokespecial   #15  <Method void PropertyChangeRegistry$1()>
	//    3    7:putstatic       #17  <Field CallbackRegistry$NotifierCallback NOTIFIER_CALLBACK>
	//*   4   10:return          
	}
}
