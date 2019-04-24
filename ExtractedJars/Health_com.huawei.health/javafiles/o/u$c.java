// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;


// Referenced classes of package o:
//			u

class u$c extends u$d
{

	protected float c()
	{
		return e.k + e.i;
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field u e>
	//    2    4:getfield        #22  <Field float u.k>
	//    3    7:aload_0         
	//    4    8:getfield        #13  <Field u e>
	//    5   11:getfield        #25  <Field float u.i>
	//    6   14:fadd            
	//    7   15:freturn         
	}

	final u e;

	u$c(u u1)
	{
		e = u1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #13  <Field u e>
		super(u1, ((u$4) (null)));
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:aconst_null     
	//    6    8:invokespecial   #16  <Method void u$d(u, u$4)>
	//    7   11:return          
	}
}
