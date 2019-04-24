// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import java.lang.reflect.Method;

// Referenced classes of package o:
//			cz

public abstract class bv
	implements cz
{

	public bv(Method method, int i, String s, byte abyte0[], String s1, boolean flag)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void Object()>
		a = method;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #24  <Field Method a>
		e = i;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #26  <Field int e>
		d = s;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #28  <Field String d>
		b = abyte0;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #30  <Field byte[] b>
		c = s1;
	//   14   25:aload_0         
	//   15   26:aload           5
	//   16   28:putfield        #32  <Field String c>
		f = flag;
	//   17   31:aload_0         
	//   18   32:iload           6
	//   19   34:putfield        #34  <Field boolean f>
	//   20   37:return          
	}

	protected Method a;
	protected byte b[];
	protected String c;
	protected String d;
	protected int e;
	protected boolean f;
}
