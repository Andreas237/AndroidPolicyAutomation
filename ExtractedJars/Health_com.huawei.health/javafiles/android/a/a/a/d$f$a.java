// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.a.a.a;

import android.app.PendingIntent;
import java.util.ArrayList;
import java.util.List;
import o.e;

// Referenced classes of package android.a.a.a:
//			d, p

public static class d$f$a extends i.b
{
	public static class a
	{

		public a a(long l)
		{
			f = l;
		//    0    0:aload_0         
		//    1    1:lload_1         
		//    2    2:putfield        #38  <Field long f>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public a a(PendingIntent pendingintent)
		{
			d = pendingintent;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #41  <Field PendingIntent d>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public a a(PendingIntent pendingintent, p p)
		{
			c = p;
		//    0    0:aload_0         
		//    1    1:aload_2         
		//    2    2:putfield        #44  <Field p c>
			e = pendingintent;
		//    3    5:aload_0         
		//    4    6:aload_1         
		//    5    7:putfield        #46  <Field PendingIntent e>
			return this;
		//    6   10:aload_0         
		//    7   11:areturn         
		}

		public a a(String s)
		{
			a.add(((Object) (s)));
		//    0    0:aload_0         
		//    1    1:getfield        #32  <Field List a>
		//    2    4:aload_1         
		//    3    5:invokeinterface #53  <Method boolean List.add(Object)>
		//    4   10:pop             
			return this;
		//    5   11:aload_0         
		//    6   12:areturn         
		}

		public d.f.a a()
		{
			String as[] = (String[])a.toArray(((Object []) (new String[a.size()])));
		//    0    0:aload_0         
		//    1    1:getfield        #32  <Field List a>
		//    2    4:aload_0         
		//    3    5:getfield        #32  <Field List a>
		//    4    8:invokeinterface #58  <Method int List.size()>
		//    5   13:anewarray       String[]
		//    6   16:invokeinterface #64  <Method Object[] List.toArray(Object[])>
		//    7   21:checkcast       #66  <Class String[]>
		//    8   24:astore_3        
			String s = b;
		//    9   25:aload_0         
		//   10   26:getfield        #34  <Field String b>
		//   11   29:astore          4
			p p = c;
		//   12   31:aload_0         
		//   13   32:getfield        #44  <Field p c>
		//   14   35:astore          5
			PendingIntent pendingintent = e;
		//   15   37:aload_0         
		//   16   38:getfield        #46  <Field PendingIntent e>
		//   17   41:astore          6
			PendingIntent pendingintent1 = d;
		//   18   43:aload_0         
		//   19   44:getfield        #41  <Field PendingIntent d>
		//   20   47:astore          7
			long l = f;
		//   21   49:aload_0         
		//   22   50:getfield        #38  <Field long f>
		//   23   53:lstore_1        
			return new d.f.a(as, p, pendingintent, pendingintent1, new String[] {
				s
			}, l);
		//   24   54:new             #11  <Class d$f$a>
		//   25   57:dup             
		//   26   58:aload_3         
		//   27   59:aload           5
		//   28   61:aload           6
		//   29   63:aload           7
		//   30   65:iconst_1        
		//   31   66:anewarray       String[]
		//   32   69:dup             
		//   33   70:iconst_0        
		//   34   71:aload           4
		//   35   73:aastore         
		//   36   74:lload_1         
		//   37   75:invokespecial   #69  <Method void d$f$a(String[], p, PendingIntent, PendingIntent, String[], long)>
		//   38   78:areturn         
		}

		private final List a = new ArrayList();
		private final String b;
		private p c;
		private PendingIntent d;
		private PendingIntent e;
		private long f;

		public a(String s)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #27  <Method void Object()>
		//    2    4:aload_0         
		//    3    5:new             #29  <Class ArrayList>
		//    4    8:dup             
		//    5    9:invokespecial   #30  <Method void ArrayList()>
		//    6   12:putfield        #32  <Field List a>
			b = s;
		//    7   15:aload_0         
		//    8   16:aload_1         
		//    9   17:putfield        #34  <Field String b>
		//   10   20:return          
		}
	}


	public String[] a()
	{
		return b;
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field String[] b>
	//    2    4:areturn         
	}

	public p b()
	{
		return c;
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field p c>
	//    2    4:areturn         
	}

	public PendingIntent c()
	{
		return d;
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field PendingIntent d>
	//    2    4:areturn         
	}

	public PendingIntent d()
	{
		return e;
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field PendingIntent e>
	//    2    4:areturn         
	}

	public String[] e()
	{
		return f;
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field String[] f>
	//    2    4:areturn         
	}

	public String f()
	{
		if(f.length > 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #44  <Field String[] f>
	//*   2    4:arraylength     
	//*   3    5:ifle            15
			return f[0];
	//    4    8:aload_0         
	//    5    9:getfield        #44  <Field String[] f>
	//    6   12:iconst_0        
	//    7   13:aaload          
	//    8   14:areturn         
		else
			return null;
	//    9   15:aconst_null     
	//   10   16:areturn         
	}

	public long g()
	{
		return g;
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field long g>
	//    2    4:lreturn         
	}

	public s.a h()
	{
		return ((s.a) (b()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #55  <Method p b()>
	//    2    4:areturn         
	}

	static final i$b$a a = new e();
	private final String b[];
	private final p c;
	private final PendingIntent d;
	private final PendingIntent e;
	private final String f[];
	private final long g;

	static 
	{
	//    0    0:new             #26  <Class e>
	//    1    3:dup             
	//    2    4:invokespecial   #29  <Method void e()>
	//    3    7:putstatic       #31  <Field i$b$a a>
	//*   4   10:return          
	}

	public d$f$a(String as[], p p, PendingIntent pendingintent, PendingIntent pendingintent1, String as1[], long l)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #34  <Method void i$b()>
		b = as;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #36  <Field String[] b>
		c = p;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #38  <Field p c>
		e = pendingintent1;
	//    8   14:aload_0         
	//    9   15:aload           4
	//   10   17:putfield        #40  <Field PendingIntent e>
		d = pendingintent;
	//   11   20:aload_0         
	//   12   21:aload_3         
	//   13   22:putfield        #42  <Field PendingIntent d>
		f = as1;
	//   14   25:aload_0         
	//   15   26:aload           5
	//   16   28:putfield        #44  <Field String[] f>
		g = l;
	//   17   31:aload_0         
	//   18   32:lload           6
	//   19   34:putfield        #46  <Field long g>
	//   20   37:return          
	}
}
