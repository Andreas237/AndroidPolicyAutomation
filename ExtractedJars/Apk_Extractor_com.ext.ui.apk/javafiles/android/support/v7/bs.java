// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7;

import java.util.HashMap;

// Referenced classes of package android.support.v7:
//			bt

public class bs extends bt
{

	public bs()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void bt()>
		a = new HashMap();
	//    2    4:aload_0         
	//    3    5:new             #18  <Class HashMap>
	//    4    8:dup             
	//    5    9:invokespecial   #19  <Method void HashMap()>
	//    6   12:putfield        #21  <Field HashMap a>
	//    7   15:return          
	}

	public boolean a(Object obj)
	{
		return a.containsKey(obj);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field HashMap a>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #26  <Method boolean HashMap.containsKey(Object)>
	//    4    8:ireturn         
	}

	private HashMap a;
}
