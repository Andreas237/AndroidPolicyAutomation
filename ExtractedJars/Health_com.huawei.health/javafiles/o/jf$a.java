// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;


// Referenced classes of package o:
//			jf

class jf$a
	implements jp$b
{

	public void c(int i)
	{
		a.c = i;
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field jf a>
	//    2    4:iload_1         
	//    3    5:putfield        #23  <Field int jf.c>
	//    4    8:return          
	}

	final jf a;

	jf$a(jf jf1)
	{
		a = jf1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field jf a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #17  <Method void Object()>
	//    5    9:return          
	}
}
