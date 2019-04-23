// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.view.menu;


class BaseWrapper
{

	BaseWrapper(Object obj)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
		if(obj != null)
	//*   2    4:aload_1         
	//*   3    5:ifnull          14
		{
			mWrappedObject = obj;
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:putfield        #13  <Field Object mWrappedObject>
			return;
	//    7   13:return          
		} else
		{
			throw new IllegalArgumentException("Wrapped Object can not be null.");
	//    8   14:new             #15  <Class IllegalArgumentException>
	//    9   17:dup             
	//   10   18:ldc1            #17  <String "Wrapped Object can not be null.">
	//   11   20:invokespecial   #20  <Method void IllegalArgumentException(String)>
	//   12   23:athrow          
		}
	}

	public Object getWrappedObject()
	{
		return mWrappedObject;
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field Object mWrappedObject>
	//    2    4:areturn         
	}

	final Object mWrappedObject;
}
