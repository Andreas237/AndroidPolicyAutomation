// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;


// Referenced classes of package o:
//			kk

public class jb
{

	jb(kk kk1)
	{
		e = kk1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #10  <Field kk e>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #13  <Method void Object()>
	//    5    9:return          
	}

	public void b()
	{
		try
		{
			kk.e(e);
	//    0    0:aload_0         
	//    1    1:getfield        #10  <Field kk e>
	//    2    4:invokestatic    #21  <Method void kk.e(kk)>
			return;
	//    3    7:return          
		}
		catch(Exception exception)
	//*   4    8:astore_1        
		{
			return;
	//    5    9:return          
		}
	}

	final kk e;
}
