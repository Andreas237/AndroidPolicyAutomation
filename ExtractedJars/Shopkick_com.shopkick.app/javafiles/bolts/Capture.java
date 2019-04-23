// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bolts;


public class Capture
{

	public Capture()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
	//    2    4:return          
	}

	public Capture(Object obj)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
		value = obj;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #16  <Field Object value>
	//    5    9:return          
	}

	public Object get()
	{
		return value;
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field Object value>
	//    2    4:areturn         
	}

	public void set(Object obj)
	{
		value = obj;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field Object value>
	//    3    5:return          
	}

	private Object value;
}
