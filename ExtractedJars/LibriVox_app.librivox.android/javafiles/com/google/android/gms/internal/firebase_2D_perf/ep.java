// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.firebase-perf;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

// Referenced classes of package com.google.android.gms.internal.firebase-perf:
//			dc, hn, eu, gr, 
//			hs, et, gs, gq, 
//			gt, eq, ec, gh, 
//			ez, fb, gd, ge, 
//			dy

public abstract class ep extends dc
{

	public ep()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void dc()>
		zzqz = hn.a();
	//    2    4:aload_0         
	//    3    5:invokestatic    #27  <Method hn hn.a()>
	//    4    8:putfield        #29  <Field hn zzqz>
		zzra = -1;
	//    5   11:aload_0         
	//    6   12:iconst_m1       
	//    7   13:putfield        #31  <Field int zzra>
	//    8   16:return          
	}

	protected static ez B()
	{
		return ((ez) (eu.d()));
	//    0    0:invokestatic    #39  <Method eu eu.d()>
	//    1    3:areturn         
	}

	protected static fb C()
	{
		return ((fb) (gr.d()));
	//    0    0:invokestatic    #46  <Method gr gr.d()>
	//    1    3:areturn         
	}

	static ep a(Class class1)
	{
		ep ep2 = (ep)zzrb.get(((Object) (class1)));
	//    0    0:getstatic       #19  <Field Map zzrb>
	//    1    3:aload_0         
	//    2    4:invokeinterface #55  <Method Object Map.get(Object)>
	//    3    9:checkcast       #2   <Class ep>
	//    4   12:astore_2        
		ep ep1 = ep2;
	//    5   13:aload_2         
	//    6   14:astore_1        
		if(ep2 == null)
	//*   7   15:aload_2         
	//*   8   16:ifnonnull       60
		{
			try
			{
				Class.forName(class1.getName(), true, class1.getClassLoader());
	//    9   19:aload_0         
	//   10   20:invokevirtual   #61  <Method String Class.getName()>
	//   11   23:iconst_1        
	//   12   24:aload_0         
	//   13   25:invokevirtual   #65  <Method ClassLoader Class.getClassLoader()>
	//   14   28:invokestatic    #69  <Method Class Class.forName(String, boolean, ClassLoader)>
	//   15   31:pop             
			}
	//*  16   32:getstatic       #19  <Field Map zzrb>
	//*  17   35:aload_0         
	//*  18   36:invokeinterface #55  <Method Object Map.get(Object)>
	//*  19   41:checkcast       #2   <Class ep>
	//*  20   44:astore_1        
	//*  21   45:goto            60
			// Misplaced declaration of an exception variable
			catch(Class class1)
	//*  22   48:astore_0        
			{
				throw new IllegalStateException("Class initialization cannot fail.", ((Throwable) (class1)));
	//   23   49:new             #71  <Class IllegalStateException>
	//   24   52:dup             
	//   25   53:ldc1            #73  <String "Class initialization cannot fail.">
	//   26   55:aload_0         
	//   27   56:invokespecial   #76  <Method void IllegalStateException(String, Throwable)>
	//   28   59:athrow          
			}
			ep1 = (ep)zzrb.get(((Object) (class1)));
		}
		if(ep1 == null)
	//*  29   60:aload_1         
	//*  30   61:ifnonnull       108
		{
			ep1 = (ep)((ep)hs.a(class1)).a(et.f, ((Object) (null)), ((Object) (null)));
	//   31   64:aload_0         
	//   32   65:invokestatic    #81  <Method Object hs.a(Class)>
	//   33   68:checkcast       #2   <Class ep>
	//   34   71:getstatic       #86  <Field int et.f>
	//   35   74:aconst_null     
	//   36   75:aconst_null     
	//   37   76:invokevirtual   #89  <Method Object a(int, Object, Object)>
	//   38   79:checkcast       #2   <Class ep>
	//   39   82:astore_1        
			if(ep1 != null)
	//*  40   83:aload_1         
	//*  41   84:ifnull          100
			{
				zzrb.put(((Object) (class1)), ((Object) (ep1)));
	//   42   87:getstatic       #19  <Field Map zzrb>
	//   43   90:aload_0         
	//   44   91:aload_1         
	//   45   92:invokeinterface #93  <Method Object Map.put(Object, Object)>
	//   46   97:pop             
				return ep1;
	//   47   98:aload_1         
	//   48   99:areturn         
			} else
			{
				throw new IllegalStateException();
	//   49  100:new             #71  <Class IllegalStateException>
	//   50  103:dup             
	//   51  104:invokespecial   #94  <Method void IllegalStateException()>
	//   52  107:athrow          
			}
		} else
		{
			return ep1;
	//   53  108:aload_1         
	//   54  109:areturn         
		}
	}

	protected static Object a(gd gd, String s, Object aobj[])
	{
		return ((Object) (new gs(gd, s, aobj)));
	//    0    0:new             #97  <Class gs>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:invokespecial   #100 <Method void gs(gd, String, Object[])>
	//    6   10:areturn         
	}

	static transient Object a(Method method, Object obj, Object aobj[])
	{
		try
		{
			method = ((Method) (method.invoke(obj, aobj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #111 <Method Object Method.invoke(Object, Object[])>
	//    4    6:astore_0        
		}
	//*   5    7:aload_0         
	//*   6    8:areturn         
	//*   7    9:astore_0        
	//*   8   10:aload_0         
	//*   9   11:invokevirtual   #115 <Method Throwable InvocationTargetException.getCause()>
	//*  10   14:astore_0        
	//*  11   15:aload_0         
	//*  12   16:instanceof      #117 <Class RuntimeException>
	//*  13   19:ifne            45
	//*  14   22:aload_0         
	//*  15   23:instanceof      #119 <Class Error>
	//*  16   26:ifeq            34
	//*  17   29:aload_0         
	//*  18   30:checkcast       #119 <Class Error>
	//*  19   33:athrow          
	//*  20   34:new             #117 <Class RuntimeException>
	//*  21   37:dup             
	//*  22   38:ldc1            #121 <String "Unexpected exception thrown by generated accessor method.">
	//*  23   40:aload_0         
	//*  24   41:invokespecial   #122 <Method void RuntimeException(String, Throwable)>
	//*  25   44:athrow          
	//*  26   45:aload_0         
	//*  27   46:checkcast       #117 <Class RuntimeException>
	//*  28   49:athrow          
		// Misplaced declaration of an exception variable
		catch(Method method)
	//*  29   50:astore_0        
		{
			throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", ((Throwable) (method)));
	//   30   51:new             #117 <Class RuntimeException>
	//   31   54:dup             
	//   32   55:ldc1            #124 <String "Couldn't use Java reflection to implement protocol message reflection.">
	//   33   57:aload_0         
	//   34   58:invokespecial   #122 <Method void RuntimeException(String, Throwable)>
	//   35   61:athrow          
		}
		// Misplaced declaration of an exception variable
		catch(Method method)
		{
			method = ((Method) (((InvocationTargetException) (method)).getCause()));
			if(!(method instanceof RuntimeException))
			{
				if(method instanceof Error)
					throw (Error)method;
				else
					throw new RuntimeException("Unexpected exception thrown by generated accessor method.", ((Throwable) (method)));
			} else
			{
				throw (RuntimeException)method;
			}
		}
		return ((Object) (method));
	}

	protected static void a(Class class1, ep ep1)
	{
		zzrb.put(((Object) (class1)), ((Object) (ep1)));
	//    0    0:getstatic       #19  <Field Map zzrb>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:invokeinterface #93  <Method Object Map.put(Object, Object)>
	//    4   10:pop             
	//    5   11:return          
	}

	protected static final boolean a(ep ep1, boolean flag)
	{
		byte byte0 = ((Byte)ep1.a(et.a, ((Object) (null)), ((Object) (null)))).byteValue();
	//    0    0:aload_0         
	//    1    1:getstatic       #128 <Field int et.a>
	//    2    4:aconst_null     
	//    3    5:aconst_null     
	//    4    6:invokevirtual   #89  <Method Object a(int, Object, Object)>
	//    5    9:checkcast       #130 <Class Byte>
	//    6   12:invokevirtual   #134 <Method byte Byte.byteValue()>
	//    7   15:istore_2        
		if(byte0 == 1)
	//*   8   16:iload_2         
	//*   9   17:iconst_1        
	//*  10   18:icmpne          23
			return true;
	//   11   21:iconst_1        
	//   12   22:ireturn         
		if(byte0 == 0)
	//*  13   23:iload_2         
	//*  14   24:ifne            29
			return false;
	//   15   27:iconst_0        
	//   16   28:ireturn         
		else
			return gq.a().a(((Object) (ep1))).d(((Object) (ep1)));
	//   17   29:invokestatic    #139 <Method gq gq.a()>
	//   18   32:aload_0         
	//   19   33:invokevirtual   #142 <Method gt gq.a(Object)>
	//   20   36:aload_0         
	//   21   37:invokeinterface #147 <Method boolean gt.d(Object)>
	//   22   42:ireturn         
	}

	public final int A()
	{
		if(zzra == -1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #31  <Field int zzra>
	//*   2    4:iconst_m1       
	//*   3    5:icmpne          25
			zzra = gq.a().a(((Object) (this))).b(((Object) (this)));
	//    4    8:aload_0         
	//    5    9:invokestatic    #139 <Method gq gq.a()>
	//    6   12:aload_0         
	//    7   13:invokevirtual   #142 <Method gt gq.a(Object)>
	//    8   16:aload_0         
	//    9   17:invokeinterface #153 <Method int gt.b(Object)>
	//   10   22:putfield        #31  <Field int zzra>
		return zzra;
	//   11   25:aload_0         
	//   12   26:getfield        #31  <Field int zzra>
	//   13   29:ireturn         
	}

	public final ge D()
	{
		eq eq1 = (eq)a(et.e, ((Object) (null)), ((Object) (null)));
	//    0    0:aload_0         
	//    1    1:getstatic       #158 <Field int et.e>
	//    2    4:aconst_null     
	//    3    5:aconst_null     
	//    4    6:invokevirtual   #89  <Method Object a(int, Object, Object)>
	//    5    9:checkcast       #160 <Class eq>
	//    6   12:astore_1        
		eq1.a(this);
	//    7   13:aload_1         
	//    8   14:aload_0         
	//    9   15:invokevirtual   #163 <Method eq eq.a(ep)>
	//   10   18:pop             
		return ((ge) (eq1));
	//   11   19:aload_1         
	//   12   20:areturn         
	}

	public final gd E()
	{
		return ((gd) ((ep)a(et.f, ((Object) (null)), ((Object) (null)))));
	//    0    0:aload_0         
	//    1    1:getstatic       #86  <Field int et.f>
	//    2    4:aconst_null     
	//    3    5:aconst_null     
	//    4    6:invokevirtual   #89  <Method Object a(int, Object, Object)>
	//    5    9:checkcast       #2   <Class ep>
	//    6   12:areturn         
	}

	protected abstract Object a(int i, Object obj, Object obj1);

	public final void a(dy dy)
	{
		gq.a().a(((Object)this).getClass()).a(((Object) (this)), ((ik) (ec.a(dy))));
	//    0    0:invokestatic    #139 <Method gq gq.a()>
	//    1    3:aload_0         
	//    2    4:invokevirtual   #172 <Method Class Object.getClass()>
	//    3    7:invokevirtual   #175 <Method gt gq.a(Class)>
	//    4   10:aload_0         
	//    5   11:aload_1         
	//    6   12:invokestatic    #180 <Method ec ec.a(dy)>
	//    7   15:invokeinterface #183 <Method void gt.a(Object, ik)>
	//    8   20:return          
	}

	final void b(int i)
	{
		zzra = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #31  <Field int zzra>
	//    3    5:return          
	}

	public boolean equals(Object obj)
	{
		if(this == obj)
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:if_acmpne       7
			return true;
	//    3    5:iconst_1        
	//    4    6:ireturn         
		if(!((Object) ((ep)a(et.f, ((Object) (null)), ((Object) (null))))).getClass().isInstance(obj))
	//*   5    7:aload_0         
	//*   6    8:getstatic       #86  <Field int et.f>
	//*   7   11:aconst_null     
	//*   8   12:aconst_null     
	//*   9   13:invokevirtual   #89  <Method Object a(int, Object, Object)>
	//*  10   16:checkcast       #2   <Class ep>
	//*  11   19:invokevirtual   #172 <Method Class Object.getClass()>
	//*  12   22:aload_1         
	//*  13   23:invokevirtual   #188 <Method boolean Class.isInstance(Object)>
	//*  14   26:ifne            31
			return false;
	//   15   29:iconst_0        
	//   16   30:ireturn         
		else
			return gq.a().a(((Object) (this))).a(((Object) (this)), ((Object) ((ep)obj)));
	//   17   31:invokestatic    #139 <Method gq gq.a()>
	//   18   34:aload_0         
	//   19   35:invokevirtual   #142 <Method gt gq.a(Object)>
	//   20   38:aload_0         
	//   21   39:aload_1         
	//   22   40:checkcast       #2   <Class ep>
	//   23   43:invokeinterface #191 <Method boolean gt.a(Object, Object)>
	//   24   48:ireturn         
	}

	public int hashCode()
	{
		if(zznb != 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #195 <Field int zznb>
	//*   2    4:ifeq            12
		{
			return zznb;
	//    3    7:aload_0         
	//    4    8:getfield        #195 <Field int zznb>
	//    5   11:ireturn         
		} else
		{
			zznb = gq.a().a(((Object) (this))).a(((Object) (this)));
	//    6   12:aload_0         
	//    7   13:invokestatic    #139 <Method gq gq.a()>
	//    8   16:aload_0         
	//    9   17:invokevirtual   #142 <Method gt gq.a(Object)>
	//   10   20:aload_0         
	//   11   21:invokeinterface #197 <Method int gt.a(Object)>
	//   12   26:putfield        #195 <Field int zznb>
			return zznb;
	//   13   29:aload_0         
	//   14   30:getfield        #195 <Field int zznb>
	//   15   33:ireturn         
		}
	}

	public String toString()
	{
		return gh.a(((gd) (this)), ((Object)this).toString());
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokespecial   #200 <Method String Object.toString()>
	//    3    5:invokestatic    #205 <Method String gh.a(gd, String)>
	//    4    8:areturn         
	}

	final int x()
	{
		return zzra;
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field int zzra>
	//    2    4:ireturn         
	}

	public final boolean y()
	{
		boolean flag = Boolean.TRUE.booleanValue();
	//    0    0:getstatic       #214 <Field Boolean Boolean.TRUE>
	//    1    3:invokevirtual   #217 <Method boolean Boolean.booleanValue()>
	//    2    6:istore_2        
		byte byte0 = ((Byte)a(et.a, ((Object) (null)), ((Object) (null)))).byteValue();
	//    3    7:aload_0         
	//    4    8:getstatic       #128 <Field int et.a>
	//    5   11:aconst_null     
	//    6   12:aconst_null     
	//    7   13:invokevirtual   #89  <Method Object a(int, Object, Object)>
	//    8   16:checkcast       #130 <Class Byte>
	//    9   19:invokevirtual   #134 <Method byte Byte.byteValue()>
	//   10   22:istore_1        
		if(byte0 == 1)
	//*  11   23:iload_1         
	//*  12   24:iconst_1        
	//*  13   25:icmpne          30
			return true;
	//   14   28:iconst_1        
	//   15   29:ireturn         
		if(byte0 == 0)
	//*  16   30:iload_1         
	//*  17   31:ifne            36
			return false;
	//   18   34:iconst_0        
	//   19   35:ireturn         
		boolean flag1 = gq.a().a(((Object) (this))).d(((Object) (this)));
	//   20   36:invokestatic    #139 <Method gq gq.a()>
	//   21   39:aload_0         
	//   22   40:invokevirtual   #142 <Method gt gq.a(Object)>
	//   23   43:aload_0         
	//   24   44:invokeinterface #147 <Method boolean gt.d(Object)>
	//   25   49:istore_3        
		if(flag)
	//*  26   50:iload_2         
	//*  27   51:ifeq            80
		{
			int i = et.b;
	//   28   54:getstatic       #219 <Field int et.b>
	//   29   57:istore_1        
			ep ep1;
			if(flag1)
	//*  30   58:iload_3         
	//*  31   59:ifeq            68
				ep1 = this;
	//   32   62:aload_0         
	//   33   63:astore          4
			else
	//*  34   65:goto            71
				ep1 = null;
	//   35   68:aconst_null     
	//   36   69:astore          4
			a(i, ((Object) (ep1)), ((Object) (null)));
	//   37   71:aload_0         
	//   38   72:iload_1         
	//   39   73:aload           4
	//   40   75:aconst_null     
	//   41   76:invokevirtual   #89  <Method Object a(int, Object, Object)>
	//   42   79:pop             
		}
		return flag1;
	//   43   80:iload_3         
	//   44   81:ireturn         
	}

	public final eq z()
	{
		eq eq1 = (eq)a(et.e, ((Object) (null)), ((Object) (null)));
	//    0    0:aload_0         
	//    1    1:getstatic       #158 <Field int et.e>
	//    2    4:aconst_null     
	//    3    5:aconst_null     
	//    4    6:invokevirtual   #89  <Method Object a(int, Object, Object)>
	//    5    9:checkcast       #160 <Class eq>
	//    6   12:astore_1        
		eq1.a(this);
	//    7   13:aload_1         
	//    8   14:aload_0         
	//    9   15:invokevirtual   #163 <Method eq eq.a(ep)>
	//   10   18:pop             
		return eq1;
	//   11   19:aload_1         
	//   12   20:areturn         
	}

	private static Map zzrb = new ConcurrentHashMap();
	protected hn zzqz;
	private int zzra;

	static 
	{
	//    0    0:new             #14  <Class ConcurrentHashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #17  <Method void ConcurrentHashMap()>
	//    3    7:putstatic       #19  <Field Map zzrb>
	//*   4   10:return          
	}
}
