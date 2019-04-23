// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;

import com.appboy.models.IPutIntoJson;

public class cb
	implements IPutIntoJson
{

	public cb(String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
		a = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #16  <Field String a>
	//    5    9:return          
	}

	public String a()
	{
		return a;
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field String a>
	//    2    4:areturn         
	}

	public Object forJsonPut()
	{
		return ((Object) (a()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #22  <Method String a()>
	//    2    4:areturn         
	}

	public String toString()
	{
		return a;
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field String a>
	//    2    4:areturn         
	}

	private final String a;
}
