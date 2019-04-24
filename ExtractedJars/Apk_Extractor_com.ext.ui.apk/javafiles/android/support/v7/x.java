// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7;

import java.io.Serializable;

// Referenced classes of package android.support.v7:
//			as, au

public abstract class x
	implements as, Serializable
{
	private static class a
		implements Serializable
	{

		static a a()
		{
			return a;
		//    0    0:getstatic       #17  <Field x$a a>
		//    1    3:areturn         
		}

		private static final a a = new a();

		static 
		{
		//    0    0:new             #2   <Class x$a>
		//    1    3:dup             
		//    2    4:invokespecial   #15  <Method void x$a()>
		//    3    7:putstatic       #17  <Field x$a a>
		//*   4   10:return          
		}

		private a()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #19  <Method void Object()>
		//    2    4:return          
		}
	}


	public x()
	{
		this(a);
	//    0    0:aload_0         
	//    1    1:getstatic       #22  <Field Object a>
	//    2    4:invokespecial   #27  <Method void x(Object)>
	//    3    7:return          
	}

	protected x(Object obj)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #29  <Method void Object()>
		receiver = obj;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #31  <Field Object receiver>
	//    5    9:return          
	}

	public au a()
	{
		throw new AbstractMethodError();
	//    0    0:new             #34  <Class AbstractMethodError>
	//    1    3:dup             
	//    2    4:invokespecial   #35  <Method void AbstractMethodError()>
	//    3    7:athrow          
	}

	public String b()
	{
		throw new AbstractMethodError();
	//    0    0:new             #34  <Class AbstractMethodError>
	//    1    3:dup             
	//    2    4:invokespecial   #35  <Method void AbstractMethodError()>
	//    3    7:athrow          
	}

	public String c()
	{
		throw new AbstractMethodError();
	//    0    0:new             #34  <Class AbstractMethodError>
	//    1    3:dup             
	//    2    4:invokespecial   #35  <Method void AbstractMethodError()>
	//    3    7:athrow          
	}

	protected abstract as d();

	public Object e()
	{
		return receiver;
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field Object receiver>
	//    2    4:areturn         
	}

	public as f()
	{
		as as2 = b;
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field as b>
	//    2    4:astore_2        
		as as1 = as2;
	//    3    5:aload_2         
	//    4    6:astore_1        
		if(as2 == null)
	//*   5    7:aload_2         
	//*   6    8:ifnonnull       21
		{
			as1 = d();
	//    7   11:aload_0         
	//    8   12:invokevirtual   #46  <Method as d()>
	//    9   15:astore_1        
			b = as1;
	//   10   16:aload_0         
	//   11   17:aload_1         
	//   12   18:putfield        #44  <Field as b>
		}
		return as1;
	//   13   21:aload_1         
	//   14   22:areturn         
	}

	public static final Object a = a.a();
	private transient as b;
	protected final Object receiver;

	static 
	{
	//    0    0:invokestatic    #20  <Method x$a x$a.a()>
	//    1    3:putstatic       #22  <Field Object a>
	//*   2    6:return          
	}
}
