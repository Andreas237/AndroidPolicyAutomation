// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import java.util.List;

// Referenced classes of package o:
//			lt

public class lo extends lt
{

	public lo()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void lt()>
		k = 0.85F;
	//    2    4:aload_0         
	//    3    5:ldc1            #12  <Float 0.85F>
	//    4    7:putfield        #14  <Field float k>
	//    5   10:return          
	}

	public lo(List list)
	{
		super(list);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #18  <Method void lt(List)>
		k = 0.85F;
	//    3    5:aload_0         
	//    4    6:ldc1            #12  <Float 0.85F>
	//    5    8:putfield        #14  <Field float k>
	//    6   11:return          
	}

	public float a()
	{
		return k;
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field float k>
	//    2    4:freturn         
	}

	public void b(float f)
	{
		k = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #14  <Field float k>
	//    3    5:return          
	}

	private float k;
}
