// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.databinding;


// Referenced classes of package android.databinding:
//			BaseObservableField, Observable

class BaseObservableField$DependencyCallback extends Observable.OnPropertyChangedCallback
{

	public void onPropertyChanged(Observable observable, int i)
	{
		notifyChange();
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field BaseObservableField this$0>
	//    2    4:invokevirtual   #22  <Method void BaseObservableField.notifyChange()>
	//    3    7:return          
	}

	final BaseObservableField this$0;

	BaseObservableField$DependencyCallback()
	{
		this$0 = BaseObservableField.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #13  <Field BaseObservableField this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #16  <Method void Observable$OnPropertyChangedCallback()>
	//    5    9:return          
	}
}
