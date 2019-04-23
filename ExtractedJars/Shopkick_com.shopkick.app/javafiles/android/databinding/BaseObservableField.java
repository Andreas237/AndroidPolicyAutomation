// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.databinding;


// Referenced classes of package android.databinding:
//			BaseObservable, Observable

abstract class BaseObservableField extends BaseObservable
{
	class DependencyCallback extends Observable.OnPropertyChangedCallback
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

		DependencyCallback()
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


	public BaseObservableField()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void BaseObservable()>
	//    2    4:return          
	}

	public transient BaseObservableField(Observable aobservable[])
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void BaseObservable()>
		if(aobservable != null && aobservable.length != 0)
	//*   2    4:aload_1         
	//*   3    5:ifnull          46
	//*   4    8:aload_1         
	//*   5    9:arraylength     
	//*   6   10:ifeq            46
		{
			DependencyCallback dependencycallback = new DependencyCallback();
	//    7   13:new             #6   <Class BaseObservableField$DependencyCallback>
	//    8   16:dup             
	//    9   17:aload_0         
	//   10   18:invokespecial   #16  <Method void BaseObservableField$DependencyCallback(BaseObservableField)>
	//   11   21:astore_3        
			for(int i = 0; i < aobservable.length; i++)
	//*  12   22:iconst_0        
	//*  13   23:istore_2        
	//*  14   24:iload_2         
	//*  15   25:aload_1         
	//*  16   26:arraylength     
	//*  17   27:icmpge          46
				aobservable[i].addOnPropertyChangedCallback(((Observable.OnPropertyChangedCallback) (dependencycallback)));
	//   18   30:aload_1         
	//   19   31:iload_2         
	//   20   32:aaload          
	//   21   33:aload_3         
	//   22   34:invokeinterface #22  <Method void Observable.addOnPropertyChangedCallback(Observable$OnPropertyChangedCallback)>

	//   23   39:iload_2         
	//   24   40:iconst_1        
	//   25   41:iadd            
	//   26   42:istore_2        
		}
	//*  27   43:goto            24
	//   28   46:return          
	}
}
