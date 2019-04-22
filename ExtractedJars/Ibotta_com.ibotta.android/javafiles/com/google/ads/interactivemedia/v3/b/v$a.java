// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.ads.interactivemedia.v3.b;

import com.google.ads.interactivemedia.v3.b.b.a;

// Referenced classes of package com.google.ads.interactivemedia.v3.b:
//			x, v, s, k, 
//			f, w

private static class v$a
	implements x
{

	public w a(f f, com.google.ads.interactivemedia.v3.b.c.a a1)
	{
		com.google.ads.interactivemedia.v3.b.c.a a2 = a;
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field com.google.ads.interactivemedia.v3.b.c.a a>
	//    2    4:astore          4
		boolean flag;
		if(a2 != null)
	//*   3    6:aload           4
	//*   4    8:ifnull          54
		{
			if(!a2.equals(((Object) (a1))) && (!b || a.b() != a1.a()))
	//*   5   11:aload           4
	//*   6   13:aload_2         
	//*   7   14:invokevirtual   #59  <Method boolean com.google.ads.interactivemedia.v3.b.c.a.equals(Object)>
	//*   8   17:ifne            49
	//*   9   20:aload_0         
	//*  10   21:getfield        #44  <Field boolean b>
	//*  11   24:ifeq            44
	//*  12   27:aload_0         
	//*  13   28:getfield        #42  <Field com.google.ads.interactivemedia.v3.b.c.a a>
	//*  14   31:invokevirtual   #62  <Method java.lang.reflect.Type com.google.ads.interactivemedia.v3.b.c.a.b()>
	//*  15   34:aload_2         
	//*  16   35:invokevirtual   #65  <Method Class com.google.ads.interactivemedia.v3.b.c.a.a()>
	//*  17   38:if_acmpne       44
	//*  18   41:goto            49
				flag = false;
	//   19   44:iconst_0        
	//   20   45:istore_3        
			else
	//*  21   46:goto            66
				flag = true;
	//   22   49:iconst_1        
	//   23   50:istore_3        
		} else
	//*  24   51:goto            66
		{
			flag = c.isAssignableFrom(a1.a());
	//   25   54:aload_0         
	//   26   55:getfield        #46  <Field Class c>
	//   27   58:aload_2         
	//   28   59:invokevirtual   #65  <Method Class com.google.ads.interactivemedia.v3.b.c.a.a()>
	//   29   62:invokevirtual   #71  <Method boolean Class.isAssignableFrom(Class)>
	//   30   65:istore_3        
		}
		if(flag)
	//*  31   66:iload_3         
	//*  32   67:ifeq            90
			return ((w) (new v(d, e, f, a1, ((x) (this)), ((v$1) (null)))));
	//   33   70:new             #8   <Class v>
	//   34   73:dup             
	//   35   74:aload_0         
	//   36   75:getfield        #31  <Field s d>
	//   37   78:aload_0         
	//   38   79:getfield        #35  <Field k e>
	//   39   82:aload_1         
	//   40   83:aload_2         
	//   41   84:aload_0         
	//   42   85:aconst_null     
	//   43   86:invokespecial   #74  <Method void v(s, k, f, com.google.ads.interactivemedia.v3.b.c.a, x, v$1)>
	//   44   89:areturn         
		else
			return null;
	//   45   90:aconst_null     
	//   46   91:areturn         
	}

	private final com.google.ads.interactivemedia.v3.b.c.a a;
	private final boolean b;
	private final Class c;
	private final s d;
	private final k e;

	private v$a(Object obj, com.google.ads.interactivemedia.v3.b.c.a a1, boolean flag, Class class1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #27  <Method void Object()>
		boolean flag1 = obj instanceof s;
	//    2    4:aload_1         
	//    3    5:instanceof      #29  <Class s>
	//    4    8:istore          5
		Object obj2 = null;
	//    5   10:aconst_null     
	//    6   11:astore          7
		Object obj1;
		if(flag1)
	//*   7   13:iload           5
	//*   8   15:ifeq            27
			obj1 = ((Object) ((s)obj));
	//    9   18:aload_1         
	//   10   19:checkcast       #29  <Class s>
	//   11   22:astore          6
		else
	//*  12   24:goto            30
			obj1 = null;
	//   13   27:aconst_null     
	//   14   28:astore          6
		d = ((s) (obj1));
	//   15   30:aload_0         
	//   16   31:aload           6
	//   17   33:putfield        #31  <Field s d>
		obj1 = ((Object) (obj2));
	//   18   36:aload           7
	//   19   38:astore          6
		if(obj instanceof k)
	//*  20   40:aload_1         
	//*  21   41:instanceof      #33  <Class k>
	//*  22   44:ifeq            53
			obj1 = ((Object) ((k)obj));
	//   23   47:aload_1         
	//   24   48:checkcast       #33  <Class k>
	//   25   51:astore          6
		e = ((k) (obj1));
	//   26   53:aload_0         
	//   27   54:aload           6
	//   28   56:putfield        #35  <Field k e>
		if(d == null && e == null)
	//*  29   59:aload_0         
	//*  30   60:getfield        #31  <Field s d>
	//*  31   63:ifnonnull       82
	//*  32   66:aload_0         
	//*  33   67:getfield        #35  <Field k e>
	//*  34   70:ifnull          76
	//*  35   73:goto            82
			flag1 = false;
	//   36   76:iconst_0        
	//   37   77:istore          5
		else
	//*  38   79:goto            85
			flag1 = true;
	//   39   82:iconst_1        
	//   40   83:istore          5
		com.google.ads.interactivemedia.v3.b.b.a.a(flag1);
	//   41   85:iload           5
	//   42   87:invokestatic    #40  <Method void a.a(boolean)>
		a = a1;
	//   43   90:aload_0         
	//   44   91:aload_2         
	//   45   92:putfield        #42  <Field com.google.ads.interactivemedia.v3.b.c.a a>
		b = flag;
	//   46   95:aload_0         
	//   47   96:iload_3         
	//   48   97:putfield        #44  <Field boolean b>
		c = class1;
	//   49  100:aload_0         
	//   50  101:aload           4
	//   51  103:putfield        #46  <Field Class c>
	//   52  106:return          
	}

	v$a(Object obj, com.google.ads.interactivemedia.v3.b.c.a a1, boolean flag, Class class1, v$1 v$1)
	{
		this(obj, a1, flag, class1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:aload           4
	//    5    6:invokespecial   #52  <Method void v$a(Object, com.google.ads.interactivemedia.v3.b.c.a, boolean, Class)>
	//    6    9:return          
	}
}
