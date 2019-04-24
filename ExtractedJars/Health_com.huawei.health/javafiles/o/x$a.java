// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import java.lang.ref.WeakReference;

// Referenced classes of package o:
//			x

static class x$a
{

	boolean a(x$e x$e)
	{
		return x$e != null && e.get() == x$e;
	//    0    0:aload_1         
	//    1    1:ifnull          17
	//    2    4:aload_0         
	//    3    5:getfield        #26  <Field WeakReference e>
	//    4    8:invokevirtual   #34  <Method Object WeakReference.get()>
	//    5   11:aload_1         
	//    6   12:if_acmpne       17
	//    7   15:iconst_1        
	//    8   16:ireturn         
	//    9   17:iconst_0        
	//   10   18:ireturn         
	}

	int b;
	boolean c;
	final WeakReference e;

	x$a(int i, x$e x$e)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
		e = new WeakReference(((Object) (x$e)));
	//    2    4:aload_0         
	//    3    5:new             #21  <Class WeakReference>
	//    4    8:dup             
	//    5    9:aload_2         
	//    6   10:invokespecial   #24  <Method void WeakReference(Object)>
	//    7   13:putfield        #26  <Field WeakReference e>
		b = i;
	//    8   16:aload_0         
	//    9   17:iload_1         
	//   10   18:putfield        #28  <Field int b>
	//   11   21:return          
	}
}
