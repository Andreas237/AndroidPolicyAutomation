// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;


// Referenced classes of package bo.app:
//			co

public final class ac
{

	public ac(co co)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
		if(co != null)
	//*   2    4:aload_1         
	//*   3    5:ifnull          14
		{
			a = co;
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:putfield        #13  <Field co a>
			return;
	//    7   13:return          
		} else
		{
			throw new NullPointerException();
	//    8   14:new             #15  <Class NullPointerException>
	//    9   17:dup             
	//   10   18:invokespecial   #16  <Method void NullPointerException()>
	//   11   21:athrow          
		}
	}

	public co a()
	{
		return a;
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field co a>
	//    2    4:areturn         
	}

	private final co a;
}
