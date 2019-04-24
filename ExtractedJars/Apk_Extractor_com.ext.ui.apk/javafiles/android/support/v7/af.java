// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7;


// Referenced classes of package android.support.v7:
//			ac, ak

public abstract class af
	implements ac
{

	public af(int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		arity = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #15  <Field int arity>
	//    5    9:return          
	}

	public String toString()
	{
		return ak.a(this);
	//    0    0:aload_0         
	//    1    1:invokestatic    #24  <Method String ak.a(af)>
	//    2    4:areturn         
	}

	private final int arity;
}
