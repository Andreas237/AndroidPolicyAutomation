// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.icing;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

// Referenced classes of package com.google.android.gms.internal.icing:
//			ab, eh, em, bt, 
//			dn, dl, do, dm, 
//			bb, bq, db, cy, 
//			bx, ax, cz

public abstract class bp extends ab
{

	public bp()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void ab()>
		zzjt = eh.a();
	//    2    4:aload_0         
	//    3    5:invokestatic    #27  <Method eh eh.a()>
	//    4    8:putfield        #29  <Field eh zzjt>
		zzju = -1;
	//    5   11:aload_0         
	//    6   12:iconst_m1       
	//    7   13:putfield        #31  <Field int zzju>
	//    8   16:return          
	}

	static bp a(Class class1)
	{
		bp bp2 = (bp)zzjv.get(((Object) (class1)));
	//    0    0:getstatic       #19  <Field Map zzjv>
	//    1    3:aload_0         
	//    2    4:invokeinterface #40  <Method Object Map.get(Object)>
	//    3    9:checkcast       #2   <Class bp>
	//    4   12:astore_2        
		bp bp1 = bp2;
	//    5   13:aload_2         
	//    6   14:astore_1        
		if(bp2 == null)
	//*   7   15:aload_2         
	//*   8   16:ifnonnull       60
		{
			try
			{
				Class.forName(class1.getName(), true, class1.getClassLoader());
	//    9   19:aload_0         
	//   10   20:invokevirtual   #46  <Method String Class.getName()>
	//   11   23:iconst_1        
	//   12   24:aload_0         
	//   13   25:invokevirtual   #50  <Method ClassLoader Class.getClassLoader()>
	//   14   28:invokestatic    #54  <Method Class Class.forName(String, boolean, ClassLoader)>
	//   15   31:pop             
			}
	//*  16   32:getstatic       #19  <Field Map zzjv>
	//*  17   35:aload_0         
	//*  18   36:invokeinterface #40  <Method Object Map.get(Object)>
	//*  19   41:checkcast       #2   <Class bp>
	//*  20   44:astore_1        
	//*  21   45:goto            60
			// Misplaced declaration of an exception variable
			catch(Class class1)
	//*  22   48:astore_0        
			{
				throw new IllegalStateException("Class initialization cannot fail.", ((Throwable) (class1)));
	//   23   49:new             #56  <Class IllegalStateException>
	//   24   52:dup             
	//   25   53:ldc1            #58  <String "Class initialization cannot fail.">
	//   26   55:aload_0         
	//   27   56:invokespecial   #61  <Method void IllegalStateException(String, Throwable)>
	//   28   59:athrow          
			}
			bp1 = (bp)zzjv.get(((Object) (class1)));
		}
		if(bp1 == null)
	//*  29   60:aload_1         
	//*  30   61:ifnonnull       108
		{
			bp1 = (bp)((bp)em.a(class1)).a(bt.f, ((Object) (null)), ((Object) (null)));
	//   31   64:aload_0         
	//   32   65:invokestatic    #66  <Method Object em.a(Class)>
	//   33   68:checkcast       #2   <Class bp>
	//   34   71:getstatic       #71  <Field int bt.f>
	//   35   74:aconst_null     
	//   36   75:aconst_null     
	//   37   76:invokevirtual   #74  <Method Object a(int, Object, Object)>
	//   38   79:checkcast       #2   <Class bp>
	//   39   82:astore_1        
			if(bp1 != null)
	//*  40   83:aload_1         
	//*  41   84:ifnull          100
			{
				zzjv.put(((Object) (class1)), ((Object) (bp1)));
	//   42   87:getstatic       #19  <Field Map zzjv>
	//   43   90:aload_0         
	//   44   91:aload_1         
	//   45   92:invokeinterface #78  <Method Object Map.put(Object, Object)>
	//   46   97:pop             
				return bp1;
	//   47   98:aload_1         
	//   48   99:areturn         
			} else
			{
				throw new IllegalStateException();
	//   49  100:new             #56  <Class IllegalStateException>
	//   50  103:dup             
	//   51  104:invokespecial   #79  <Method void IllegalStateException()>
	//   52  107:athrow          
			}
		} else
		{
			return bp1;
	//   53  108:aload_1         
	//   54  109:areturn         
		}
	}

	protected static Object a(cy cy, String s, Object aobj[])
	{
		return ((Object) (new dn(cy, s, aobj)));
	//    0    0:new             #82  <Class dn>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:invokespecial   #85  <Method void dn(cy, String, Object[])>
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
	//    3    3:invokevirtual   #96  <Method Object Method.invoke(Object, Object[])>
	//    4    6:astore_0        
		}
	//*   5    7:aload_0         
	//*   6    8:areturn         
	//*   7    9:astore_0        
	//*   8   10:aload_0         
	//*   9   11:invokevirtual   #100 <Method Throwable InvocationTargetException.getCause()>
	//*  10   14:astore_0        
	//*  11   15:aload_0         
	//*  12   16:instanceof      #102 <Class RuntimeException>
	//*  13   19:ifne            45
	//*  14   22:aload_0         
	//*  15   23:instanceof      #104 <Class Error>
	//*  16   26:ifeq            34
	//*  17   29:aload_0         
	//*  18   30:checkcast       #104 <Class Error>
	//*  19   33:athrow          
	//*  20   34:new             #102 <Class RuntimeException>
	//*  21   37:dup             
	//*  22   38:ldc1            #106 <String "Unexpected exception thrown by generated accessor method.">
	//*  23   40:aload_0         
	//*  24   41:invokespecial   #107 <Method void RuntimeException(String, Throwable)>
	//*  25   44:athrow          
	//*  26   45:aload_0         
	//*  27   46:checkcast       #102 <Class RuntimeException>
	//*  28   49:athrow          
		// Misplaced declaration of an exception variable
		catch(Method method)
	//*  29   50:astore_0        
		{
			throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", ((Throwable) (method)));
	//   30   51:new             #102 <Class RuntimeException>
	//   31   54:dup             
	//   32   55:ldc1            #109 <String "Couldn't use Java reflection to implement protocol message reflection.">
	//   33   57:aload_0         
	//   34   58:invokespecial   #107 <Method void RuntimeException(String, Throwable)>
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

	protected static void a(Class class1, bp bp1)
	{
		zzjv.put(((Object) (class1)), ((Object) (bp1)));
	//    0    0:getstatic       #19  <Field Map zzjv>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:invokeinterface #78  <Method Object Map.put(Object, Object)>
	//    4   10:pop             
	//    5   11:return          
	}

	protected static final boolean a(bp bp1, boolean flag)
	{
		byte byte0 = ((Byte)bp1.a(bt.a, ((Object) (null)), ((Object) (null)))).byteValue();
	//    0    0:aload_0         
	//    1    1:getstatic       #113 <Field int bt.a>
	//    2    4:aconst_null     
	//    3    5:aconst_null     
	//    4    6:invokevirtual   #74  <Method Object a(int, Object, Object)>
	//    5    9:checkcast       #115 <Class Byte>
	//    6   12:invokevirtual   #119 <Method byte Byte.byteValue()>
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
			return dl.a().a(((Object) (bp1))).d(((Object) (bp1)));
	//   17   29:invokestatic    #124 <Method dl dl.a()>
	//   18   32:aload_0         
	//   19   33:invokevirtual   #127 <Method do dl.a(Object)>
	//   20   36:aload_0         
	//   21   37:invokeinterface #133 <Method boolean do.d(Object)>
	//   22   42:ireturn         
	}

	protected static bx h()
	{
		return ((bx) (dm.d()));
	//    0    0:invokestatic    #140 <Method dm dm.d()>
	//    1    3:areturn         
	}

	protected abstract Object a(int k, Object obj, Object obj1);

	final void a(int k)
	{
		zzju = k;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #31  <Field int zzju>
	//    3    5:return          
	}

	public final void a(ax ax)
	{
		dl.a().a(((Object)this).getClass()).a(((Object) (this)), ((fe) (bb.a(ax))));
	//    0    0:invokestatic    #124 <Method dl dl.a()>
	//    1    3:aload_0         
	//    2    4:invokevirtual   #148 <Method Class Object.getClass()>
	//    3    7:invokevirtual   #151 <Method do dl.a(Class)>
	//    4   10:aload_0         
	//    5   11:aload_1         
	//    6   12:invokestatic    #156 <Method bb bb.a(ax)>
	//    7   15:invokeinterface #159 <Method void do.a(Object, fe)>
	//    8   20:return          
	}

	final int e()
	{
		return zzju;
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field int zzju>
	//    2    4:ireturn         
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
		if(!((Object) ((bp)a(bt.f, ((Object) (null)), ((Object) (null))))).getClass().isInstance(obj))
	//*   5    7:aload_0         
	//*   6    8:getstatic       #71  <Field int bt.f>
	//*   7   11:aconst_null     
	//*   8   12:aconst_null     
	//*   9   13:invokevirtual   #74  <Method Object a(int, Object, Object)>
	//*  10   16:checkcast       #2   <Class bp>
	//*  11   19:invokevirtual   #148 <Method Class Object.getClass()>
	//*  12   22:aload_1         
	//*  13   23:invokevirtual   #165 <Method boolean Class.isInstance(Object)>
	//*  14   26:ifne            31
			return false;
	//   15   29:iconst_0        
	//   16   30:ireturn         
		else
			return dl.a().a(((Object) (this))).a(((Object) (this)), ((Object) ((bp)obj)));
	//   17   31:invokestatic    #124 <Method dl dl.a()>
	//   18   34:aload_0         
	//   19   35:invokevirtual   #127 <Method do dl.a(Object)>
	//   20   38:aload_0         
	//   21   39:aload_1         
	//   22   40:checkcast       #2   <Class bp>
	//   23   43:invokeinterface #168 <Method boolean do.a(Object, Object)>
	//   24   48:ireturn         
	}

	public final boolean f()
	{
		boolean flag = Boolean.TRUE.booleanValue();
	//    0    0:getstatic       #175 <Field Boolean Boolean.TRUE>
	//    1    3:invokevirtual   #178 <Method boolean Boolean.booleanValue()>
	//    2    6:istore_2        
		byte byte0 = ((Byte)a(bt.a, ((Object) (null)), ((Object) (null)))).byteValue();
	//    3    7:aload_0         
	//    4    8:getstatic       #113 <Field int bt.a>
	//    5   11:aconst_null     
	//    6   12:aconst_null     
	//    7   13:invokevirtual   #74  <Method Object a(int, Object, Object)>
	//    8   16:checkcast       #115 <Class Byte>
	//    9   19:invokevirtual   #119 <Method byte Byte.byteValue()>
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
		boolean flag1 = dl.a().a(((Object) (this))).d(((Object) (this)));
	//   20   36:invokestatic    #124 <Method dl dl.a()>
	//   21   39:aload_0         
	//   22   40:invokevirtual   #127 <Method do dl.a(Object)>
	//   23   43:aload_0         
	//   24   44:invokeinterface #133 <Method boolean do.d(Object)>
	//   25   49:istore_3        
		if(flag)
	//*  26   50:iload_2         
	//*  27   51:ifeq            80
		{
			int k = bt.b;
	//   28   54:getstatic       #181 <Field int bt.b>
	//   29   57:istore_1        
			bp bp1;
			if(flag1)
	//*  30   58:iload_3         
	//*  31   59:ifeq            68
				bp1 = this;
	//   32   62:aload_0         
	//   33   63:astore          4
			else
	//*  34   65:goto            71
				bp1 = null;
	//   35   68:aconst_null     
	//   36   69:astore          4
			a(k, ((Object) (bp1)), ((Object) (null)));
	//   37   71:aload_0         
	//   38   72:iload_1         
	//   39   73:aload           4
	//   40   75:aconst_null     
	//   41   76:invokevirtual   #74  <Method Object a(int, Object, Object)>
	//   42   79:pop             
		}
		return flag1;
	//   43   80:iload_3         
	//   44   81:ireturn         
	}

	public final int g()
	{
		if(zzju == -1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #31  <Field int zzju>
	//*   2    4:iconst_m1       
	//*   3    5:icmpne          25
			zzju = dl.a().a(((Object) (this))).b(((Object) (this)));
	//    4    8:aload_0         
	//    5    9:invokestatic    #124 <Method dl dl.a()>
	//    6   12:aload_0         
	//    7   13:invokevirtual   #127 <Method do dl.a(Object)>
	//    8   16:aload_0         
	//    9   17:invokeinterface #185 <Method int do.b(Object)>
	//   10   22:putfield        #31  <Field int zzju>
		return zzju;
	//   11   25:aload_0         
	//   12   26:getfield        #31  <Field int zzju>
	//   13   29:ireturn         
	}

	public int hashCode()
	{
		if(zzfp != 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #189 <Field int zzfp>
	//*   2    4:ifeq            12
		{
			return zzfp;
	//    3    7:aload_0         
	//    4    8:getfield        #189 <Field int zzfp>
	//    5   11:ireturn         
		} else
		{
			zzfp = dl.a().a(((Object) (this))).a(((Object) (this)));
	//    6   12:aload_0         
	//    7   13:invokestatic    #124 <Method dl dl.a()>
	//    8   16:aload_0         
	//    9   17:invokevirtual   #127 <Method do dl.a(Object)>
	//   10   20:aload_0         
	//   11   21:invokeinterface #191 <Method int do.a(Object)>
	//   12   26:putfield        #189 <Field int zzfp>
			return zzfp;
	//   13   29:aload_0         
	//   14   30:getfield        #189 <Field int zzfp>
	//   15   33:ireturn         
		}
	}

	public final cz i()
	{
		bq bq1 = (bq)a(bt.e, ((Object) (null)), ((Object) (null)));
	//    0    0:aload_0         
	//    1    1:getstatic       #195 <Field int bt.e>
	//    2    4:aconst_null     
	//    3    5:aconst_null     
	//    4    6:invokevirtual   #74  <Method Object a(int, Object, Object)>
	//    5    9:checkcast       #197 <Class bq>
	//    6   12:astore_1        
		bq1.a(this);
	//    7   13:aload_1         
	//    8   14:aload_0         
	//    9   15:invokevirtual   #200 <Method bq bq.a(bp)>
	//   10   18:pop             
		return ((cz) (bq1));
	//   11   19:aload_1         
	//   12   20:areturn         
	}

	public final cy j()
	{
		return ((cy) ((bp)a(bt.f, ((Object) (null)), ((Object) (null)))));
	//    0    0:aload_0         
	//    1    1:getstatic       #71  <Field int bt.f>
	//    2    4:aconst_null     
	//    3    5:aconst_null     
	//    4    6:invokevirtual   #74  <Method Object a(int, Object, Object)>
	//    5    9:checkcast       #2   <Class bp>
	//    6   12:areturn         
	}

	public String toString()
	{
		return db.a(((cy) (this)), ((Object)this).toString());
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokespecial   #205 <Method String Object.toString()>
	//    3    5:invokestatic    #210 <Method String db.a(cy, String)>
	//    4    8:areturn         
	}

	private static Map zzjv = new ConcurrentHashMap();
	protected eh zzjt;
	private int zzju;

	static 
	{
	//    0    0:new             #14  <Class ConcurrentHashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #17  <Method void ConcurrentHashMap()>
	//    3    7:putstatic       #19  <Field Map zzjv>
	//*   4   10:return          
	}
}
