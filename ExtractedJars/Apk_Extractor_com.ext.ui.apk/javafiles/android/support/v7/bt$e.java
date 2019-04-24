// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7;

import java.util.Iterator;

// Referenced classes of package android.support.v7:
//			bt

private static abstract class bt$e
	implements Iterator
{

	private bt$c b()
	{
		if(b == a || a == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #23  <Field bt$c b>
	//*   2    4:aload_0         
	//*   3    5:getfield        #21  <Field bt$c a>
	//*   4    8:if_acmpeq       18
	//*   5   11:aload_0         
	//*   6   12:getfield        #21  <Field bt$c a>
	//*   7   15:ifnonnull       20
			return null;
	//    8   18:aconst_null     
	//    9   19:areturn         
		else
			return a(b);
	//   10   20:aload_0         
	//   11   21:aload_0         
	//   12   22:getfield        #23  <Field bt$c b>
	//   13   25:invokevirtual   #30  <Method bt$c a(bt$c)>
	//   14   28:areturn         
	}

	abstract bt$c a(bt$c bt$c);

	public java.util.ntry a()
	{
		bt$c bt$c = b;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field bt$c b>
	//    2    4:astore_1        
		b = b();
	//    3    5:aload_0         
	//    4    6:aload_0         
	//    5    7:invokespecial   #34  <Method bt$c b()>
	//    6   10:putfield        #23  <Field bt$c b>
		return ((java.util.ntry) (bt$c));
	//    7   13:aload_1         
	//    8   14:areturn         
	}

	public boolean hasNext()
	{
		return b != null;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field bt$c b>
	//    2    4:ifnull          9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	public Object next()
	{
		return ((Object) (a()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #41  <Method java.util.Map$Entry a()>
	//    2    4:areturn         
	}

	bt$c a;
	bt$c b;

	bt$e(bt$c bt$c, bt$c bt$c1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
		a = bt$c1;
	//    2    4:aload_0         
	//    3    5:aload_2         
	//    4    6:putfield        #21  <Field bt$c a>
		b = bt$c;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #23  <Field bt$c b>
	//    8   14:return          
	}
}
