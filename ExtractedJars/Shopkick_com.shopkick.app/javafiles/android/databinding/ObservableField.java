// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.databinding;

import java.io.Serializable;

// Referenced classes of package android.databinding:
//			BaseObservableField, Observable

public class ObservableField extends BaseObservableField
	implements Serializable
{

	public ObservableField()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void BaseObservableField()>
	//    2    4:return          
	}

	public ObservableField(Object obj)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void BaseObservableField()>
		mValue = obj;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #22  <Field Object mValue>
	//    5    9:return          
	}

	public transient ObservableField(Observable aobservable[])
	{
		super(aobservable);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #27  <Method void BaseObservableField(Observable[])>
	//    3    5:return          
	}

	public Object get()
	{
		return mValue;
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field Object mValue>
	//    2    4:areturn         
	}

	public void set(Object obj)
	{
		if(obj != mValue)
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #22  <Field Object mValue>
	//*   3    5:if_acmpeq       17
		{
			mValue = obj;
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:putfield        #22  <Field Object mValue>
			notifyChange();
	//    7   13:aload_0         
	//    8   14:invokevirtual   #36  <Method void notifyChange()>
		}
	//    9   17:return          
	}

	static final long serialVersionUID = 1L;
	private Object mValue;
}
