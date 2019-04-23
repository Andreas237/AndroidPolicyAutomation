// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.clearcut;


// Referenced classes of package com.google.android.gms.internal.clearcut:
//			ft, fx, fr, fy, 
//			fv

public final class jt extends ft
	implements Cloneable
{

	public jt()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void ft()>
		d = "";
	//    2    4:aload_0         
	//    3    5:ldc1            #17  <String "">
	//    4    7:putfield        #19  <Field String d>
		e = "";
	//    5   10:aload_0         
	//    6   11:ldc1            #17  <String "">
	//    7   13:putfield        #21  <Field String e>
		a = null;
	//    8   16:aload_0         
	//    9   17:aconst_null     
	//   10   18:putfield        #25  <Field fv a>
		b = -1;
	//   11   21:aload_0         
	//   12   22:iconst_m1       
	//   13   23:putfield        #29  <Field int b>
	//   14   26:return          
	}

	public static jt[] e()
	{
		if(c == null)
	//*   0    0:getstatic       #33  <Field jt[] c>
	//*   1    3:ifnonnull       35
			synchronized(fx.a)
	//*   2    6:getstatic       #38  <Field Object fx.a>
	//*   3    9:astore_0        
	//*   4   10:aload_0         
	//*   5   11:monitorenter    
			{
				if(c == null)
	//*   6   12:getstatic       #33  <Field jt[] c>
	//*   7   15:ifnonnull       25
					c = new jt[0];
	//    8   18:iconst_0        
	//    9   19:anewarray       jt[]
	//   10   22:putstatic       #33  <Field jt[] c>
			}
	//   11   25:aload_0         
	//   12   26:monitorexit     
		break MISSING_BLOCK_LABEL_35;
	//   13   27:goto            35
		exception;
	//   14   30:astore_1        
		obj;
	//   15   31:aload_0         
		JVM INSTR monitorexit ;
	//   16   32:monitorexit     
		throw exception;
	//   17   33:aload_1         
	//   18   34:athrow          
		return c;
	//   19   35:getstatic       #33  <Field jt[] c>
	//   20   38:areturn         
	}

	private final jt f()
	{
		jt jt1;
		try
		{
			jt1 = (jt)super.b();
	//    0    0:aload_0         
	//    1    1:invokespecial   #45  <Method ft ft.b()>
	//    2    4:checkcast       #2   <Class jt>
	//    3    7:astore_1        
		}
	//*   4    8:aload_1         
	//*   5    9:areturn         
		catch(CloneNotSupportedException clonenotsupportedexception)
	//*   6   10:astore_1        
		{
			throw new AssertionError(((Object) (clonenotsupportedexception)));
	//    7   11:new             #47  <Class AssertionError>
	//    8   14:dup             
	//    9   15:aload_1         
	//   10   16:invokespecial   #50  <Method void AssertionError(Object)>
	//   11   19:athrow          
		}
		return jt1;
	}

	protected final int a()
	{
		int j = super.a();
	//    0    0:aload_0         
	//    1    1:invokespecial   #53  <Method int ft.a()>
	//    2    4:istore_2        
		String s = d;
	//    3    5:aload_0         
	//    4    6:getfield        #19  <Field String d>
	//    5    9:astore_3        
		int i = j;
	//    6   10:iload_2         
	//    7   11:istore_1        
		if(s != null)
	//*   8   12:aload_3         
	//*   9   13:ifnull          38
		{
			i = j;
	//   10   16:iload_2         
	//   11   17:istore_1        
			if(!s.equals(""))
	//*  12   18:aload_3         
	//*  13   19:ldc1            #17  <String "">
	//*  14   21:invokevirtual   #59  <Method boolean String.equals(Object)>
	//*  15   24:ifne            38
				i = j + fr.b(1, d);
	//   16   27:iload_2         
	//   17   28:iconst_1        
	//   18   29:aload_0         
	//   19   30:getfield        #19  <Field String d>
	//   20   33:invokestatic    #64  <Method int fr.b(int, String)>
	//   21   36:iadd            
	//   22   37:istore_1        
		}
		s = e;
	//   23   38:aload_0         
	//   24   39:getfield        #21  <Field String e>
	//   25   42:astore_3        
		j = i;
	//   26   43:iload_1         
	//   27   44:istore_2        
		if(s != null)
	//*  28   45:aload_3         
	//*  29   46:ifnull          71
		{
			j = i;
	//   30   49:iload_1         
	//   31   50:istore_2        
			if(!s.equals(""))
	//*  32   51:aload_3         
	//*  33   52:ldc1            #17  <String "">
	//*  34   54:invokevirtual   #59  <Method boolean String.equals(Object)>
	//*  35   57:ifne            71
				j = i + fr.b(2, e);
	//   36   60:iload_1         
	//   37   61:iconst_2        
	//   38   62:aload_0         
	//   39   63:getfield        #21  <Field String e>
	//   40   66:invokestatic    #64  <Method int fr.b(int, String)>
	//   41   69:iadd            
	//   42   70:istore_2        
		}
		return j;
	//   43   71:iload_2         
	//   44   72:ireturn         
	}

	public final void a(fr fr1)
	{
		String s = d;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field String d>
	//    2    4:astore_2        
		if(s != null && !s.equals(""))
	//*   3    5:aload_2         
	//*   4    6:ifnull          27
	//*   5    9:aload_2         
	//*   6   10:ldc1            #17  <String "">
	//*   7   12:invokevirtual   #59  <Method boolean String.equals(Object)>
	//*   8   15:ifne            27
			fr1.a(1, d);
	//    9   18:aload_1         
	//   10   19:iconst_1        
	//   11   20:aload_0         
	//   12   21:getfield        #19  <Field String d>
	//   13   24:invokevirtual   #68  <Method void fr.a(int, String)>
		s = e;
	//   14   27:aload_0         
	//   15   28:getfield        #21  <Field String e>
	//   16   31:astore_2        
		if(s != null && !s.equals(""))
	//*  17   32:aload_2         
	//*  18   33:ifnull          54
	//*  19   36:aload_2         
	//*  20   37:ldc1            #17  <String "">
	//*  21   39:invokevirtual   #59  <Method boolean String.equals(Object)>
	//*  22   42:ifne            54
			fr1.a(2, e);
	//   23   45:aload_1         
	//   24   46:iconst_2        
	//   25   47:aload_0         
	//   26   48:getfield        #21  <Field String e>
	//   27   51:invokevirtual   #68  <Method void fr.a(int, String)>
		super.a(fr1);
	//   28   54:aload_0         
	//   29   55:aload_1         
	//   30   56:invokespecial   #70  <Method void ft.a(fr)>
	//   31   59:return          
	}

	public final ft b()
	{
		return ((ft) ((jt)((fy)this).clone()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #76  <Method Object fy.clone()>
	//    2    4:checkcast       #2   <Class jt>
	//    3    7:areturn         
	}

	public final fy c()
	{
		return ((fy) ((jt)((fy)this).clone()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #76  <Method Object fy.clone()>
	//    2    4:checkcast       #2   <Class jt>
	//    3    7:areturn         
	}

	public final Object clone()
	{
		return ((Object) (f()));
	//    0    0:aload_0         
	//    1    1:invokespecial   #79  <Method jt f()>
	//    2    4:areturn         
	}

	public final boolean equals(Object obj)
	{
		if(obj == this)
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:if_acmpne       7
			return true;
	//    3    5:iconst_1        
	//    4    6:ireturn         
		if(!(obj instanceof jt))
	//*   5    7:aload_1         
	//*   6    8:instanceof      #2   <Class jt>
	//*   7   11:ifne            16
			return false;
	//    8   14:iconst_0        
	//    9   15:ireturn         
		obj = ((Object) ((jt)obj));
	//   10   16:aload_1         
	//   11   17:checkcast       #2   <Class jt>
	//   12   20:astore_1        
		String s = d;
	//   13   21:aload_0         
	//   14   22:getfield        #19  <Field String d>
	//   15   25:astore_2        
		if(s == null)
	//*  16   26:aload_2         
	//*  17   27:ifnonnull       39
		{
			if(((jt) (obj)).d != null)
	//*  18   30:aload_1         
	//*  19   31:getfield        #19  <Field String d>
	//*  20   34:ifnull          52
				return false;
	//   21   37:iconst_0        
	//   22   38:ireturn         
		} else
		if(!s.equals(((Object) (((jt) (obj)).d))))
	//*  23   39:aload_2         
	//*  24   40:aload_1         
	//*  25   41:getfield        #19  <Field String d>
	//*  26   44:invokevirtual   #59  <Method boolean String.equals(Object)>
	//*  27   47:ifne            52
			return false;
	//   28   50:iconst_0        
	//   29   51:ireturn         
		s = e;
	//   30   52:aload_0         
	//   31   53:getfield        #21  <Field String e>
	//   32   56:astore_2        
		if(s == null)
	//*  33   57:aload_2         
	//*  34   58:ifnonnull       70
		{
			if(((jt) (obj)).e != null)
	//*  35   61:aload_1         
	//*  36   62:getfield        #21  <Field String e>
	//*  37   65:ifnull          83
				return false;
	//   38   68:iconst_0        
	//   39   69:ireturn         
		} else
		if(!s.equals(((Object) (((jt) (obj)).e))))
	//*  40   70:aload_2         
	//*  41   71:aload_1         
	//*  42   72:getfield        #21  <Field String e>
	//*  43   75:invokevirtual   #59  <Method boolean String.equals(Object)>
	//*  44   78:ifne            83
			return false;
	//   45   81:iconst_0        
	//   46   82:ireturn         
		if(a != null && !a.b())
	//*  47   83:aload_0         
	//*  48   84:getfield        #25  <Field fv a>
	//*  49   87:ifnull          115
	//*  50   90:aload_0         
	//*  51   91:getfield        #25  <Field fv a>
	//*  52   94:invokevirtual   #84  <Method boolean fv.b()>
	//*  53   97:ifeq            103
	//*  54  100:goto            115
			return a.equals(((Object) (((jt) (obj)).a)));
	//   55  103:aload_0         
	//   56  104:getfield        #25  <Field fv a>
	//   57  107:aload_1         
	//   58  108:getfield        #25  <Field fv a>
	//   59  111:invokevirtual   #85  <Method boolean fv.equals(Object)>
	//   60  114:ireturn         
		if(((jt) (obj)).a != null)
	//*  61  115:aload_1         
	//*  62  116:getfield        #25  <Field fv a>
	//*  63  119:ifnull          136
			return ((jt) (obj)).a.b();
	//   64  122:aload_1         
	//   65  123:getfield        #25  <Field fv a>
	//   66  126:invokevirtual   #84  <Method boolean fv.b()>
	//   67  129:ifeq            134
	//   68  132:iconst_1        
	//   69  133:ireturn         
	//   70  134:iconst_0        
	//   71  135:ireturn         
		else
			return true;
	//   72  136:iconst_1        
	//   73  137:ireturn         
	}

	public final int hashCode()
	{
		int l = ((Object)this).getClass().getName().hashCode();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #92  <Method Class Object.getClass()>
	//    2    4:invokevirtual   #98  <Method String Class.getName()>
	//    3    7:invokevirtual   #100 <Method int String.hashCode()>
	//    4   10:istore          5
		String s = d;
	//    5   12:aload_0         
	//    6   13:getfield        #19  <Field String d>
	//    7   16:astore          6
		boolean flag = false;
	//    8   18:iconst_0        
	//    9   19:istore          4
		int i;
		if(s == null)
	//*  10   21:aload           6
	//*  11   23:ifnonnull       31
			i = 0;
	//   12   26:iconst_0        
	//   13   27:istore_1        
		else
	//*  14   28:goto            37
			i = s.hashCode();
	//   15   31:aload           6
	//   16   33:invokevirtual   #100 <Method int String.hashCode()>
	//   17   36:istore_1        
		s = e;
	//   18   37:aload_0         
	//   19   38:getfield        #21  <Field String e>
	//   20   41:astore          6
		int j;
		if(s == null)
	//*  21   43:aload           6
	//*  22   45:ifnonnull       53
			j = 0;
	//   23   48:iconst_0        
	//   24   49:istore_2        
		else
	//*  25   50:goto            59
			j = s.hashCode();
	//   26   53:aload           6
	//   27   55:invokevirtual   #100 <Method int String.hashCode()>
	//   28   58:istore_2        
		int k = ((int) (flag));
	//   29   59:iload           4
	//   30   61:istore_3        
		if(a != null)
	//*  31   62:aload_0         
	//*  32   63:getfield        #25  <Field fv a>
	//*  33   66:ifnull          93
			if(a.b())
	//*  34   69:aload_0         
	//*  35   70:getfield        #25  <Field fv a>
	//*  36   73:invokevirtual   #84  <Method boolean fv.b()>
	//*  37   76:ifeq            85
				k = ((int) (flag));
	//   38   79:iload           4
	//   39   81:istore_3        
			else
	//*  40   82:goto            93
				k = a.hashCode();
	//   41   85:aload_0         
	//   42   86:getfield        #25  <Field fv a>
	//   43   89:invokevirtual   #101 <Method int fv.hashCode()>
	//   44   92:istore_3        
		return (((l + 527) * 31 + i) * 31 + j) * 31 + k;
	//   45   93:iload           5
	//   46   95:sipush          527
	//   47   98:iadd            
	//   48   99:bipush          31
	//   49  101:imul            
	//   50  102:iload_1         
	//   51  103:iadd            
	//   52  104:bipush          31
	//   53  106:imul            
	//   54  107:iload_2         
	//   55  108:iadd            
	//   56  109:bipush          31
	//   57  111:imul            
	//   58  112:iload_3         
	//   59  113:iadd            
	//   60  114:ireturn         
	}

	private static volatile jt c[];
	private String d;
	private String e;
}
