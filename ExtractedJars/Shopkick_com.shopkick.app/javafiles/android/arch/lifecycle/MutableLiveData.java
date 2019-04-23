// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.arch.lifecycle;


// Referenced classes of package android.arch.lifecycle:
//			LiveData

public class MutableLiveData extends LiveData
{

	public MutableLiveData()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #9   <Method void LiveData()>
	//    2    4:return          
	}

	public void postValue(Object obj)
	{
		super.postValue(obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #14  <Method void LiveData.postValue(Object)>
	//    3    5:return          
	}

	public void setValue(Object obj)
	{
		super.setValue(obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #19  <Method void LiveData.setValue(Object)>
	//    3    5:return          
	}
}
