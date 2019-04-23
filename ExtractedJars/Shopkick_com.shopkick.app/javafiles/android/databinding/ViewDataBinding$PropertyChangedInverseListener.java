// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.databinding;


// Referenced classes of package android.databinding:
//			InverseBindingListener, ViewDataBinding, Observable

protected static abstract class ViewDataBinding$PropertyChangedInverseListener extends Observable.OnPropertyChangedCallback
	implements InverseBindingListener
{

	public void onPropertyChanged(Observable observable, int i)
	{
		if(i == mPropertyId || i == 0)
	//*   0    0:iload_2         
	//*   1    1:aload_0         
	//*   2    2:getfield        #18  <Field int mPropertyId>
	//*   3    5:icmpeq          12
	//*   4    8:iload_2         
	//*   5    9:ifne            16
			onChange();
	//    6   12:aload_0         
	//    7   13:invokevirtual   #24  <Method void onChange()>
	//    8   16:return          
	}

	final int mPropertyId;

	public ViewDataBinding$PropertyChangedInverseListener(int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Observable$OnPropertyChangedCallback()>
		mPropertyId = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #18  <Field int mPropertyId>
	//    5    9:return          
	}
}
