// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.view.menu;


class BaseWrapper
{

	BaseWrapper(Object obj)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		if(obj == null)
	//*   2    4:aload_1         
	//*   3    5:ifnonnull       18
		{
			throw new IllegalArgumentException("Wrapped Object can not be null.");
	//    4    8:new             #15  <Class IllegalArgumentException>
	//    5   11:dup             
	//    6   12:ldc1            #17  <String "Wrapped Object can not be null.">
	//    7   14:invokespecial   #20  <Method void IllegalArgumentException(String)>
	//    8   17:athrow          
		} else
		{
			mWrappedObject = obj;
	//    9   18:aload_0         
	//   10   19:aload_1         
	//   11   20:putfield        #22  <Field Object mWrappedObject>
			return;
	//   12   23:return          
		}
	}

	public Object getWrappedObject()
	{
		return mWrappedObject;
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field Object mWrappedObject>
	//    2    4:areturn         
	}

	final Object mWrappedObject;
}
