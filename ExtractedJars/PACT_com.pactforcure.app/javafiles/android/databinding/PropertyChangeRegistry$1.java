// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.databinding;


// Referenced classes of package android.databinding:
//			PropertyChangeRegistry, Observable

static final class PropertyChangeRegistry$1 extends Callback
{

	public void onNotifyCallback(gedCallback gedcallback, Observable observable, int i, Void void1)
	{
		gedcallback.onPropertyChanged(observable, i);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:iload_3         
	//    3    3:invokevirtual   #20  <Method void Observable$OnPropertyChangedCallback.onPropertyChanged(Observable, int)>
	//    4    6:return          
	}

	public volatile void onNotifyCallback(Object obj, Object obj1, int i, Object obj2)
	{
		onNotifyCallback((gedCallback)obj, (Observable)obj1, i, (Void)obj2);
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

	PropertyChangeRegistry$1()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void CallbackRegistry$NotifierCallback()>
	//    2    4:return          
	}
}
