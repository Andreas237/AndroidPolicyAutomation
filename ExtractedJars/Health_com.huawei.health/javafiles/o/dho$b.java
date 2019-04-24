// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;


// Referenced classes of package o:
//			dho, dhu

static class dho$b
{

	public void a(int i)
	{
		b = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #16  <Field int b>
	//    3    5:return          
	}

	boolean a(int i, String s)
	{
		if(i < b)
	//*   0    0:iload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #16  <Field int b>
	//*   3    5:icmpge          10
			return false;
	//    4    8:iconst_0        
	//    5    9:ireturn         
		if(c)
	//*   6   10:aload_0         
	//*   7   11:getfield        #18  <Field boolean c>
	//*   8   14:ifeq            22
			return dhu.h(s);
	//    9   17:aload_2         
	//   10   18:invokestatic    #30  <Method boolean dhu.h(String)>
	//   11   21:ireturn         
		else
			return true;
	//   12   22:iconst_1        
	//   13   23:ireturn         
	}

	public void c()
	{
		c = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #18  <Field boolean c>
	//    3    5:return          
	}

	public void e()
	{
		c = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #18  <Field boolean c>
	//    3    5:return          
	}

	private int b;
	private boolean c;

	private dho$b()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
		b = 2;
	//    2    4:aload_0         
	//    3    5:iconst_2        
	//    4    6:putfield        #16  <Field int b>
		c = true;
	//    5    9:aload_0         
	//    6   10:iconst_1        
	//    7   11:putfield        #18  <Field boolean c>
	//    8   14:return          
	}

	dho$b(dho$3 dho$3)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void dho$b()>
	//    2    4:return          
	}
}
