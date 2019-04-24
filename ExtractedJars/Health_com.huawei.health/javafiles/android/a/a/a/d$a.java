// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.a.a.a;

import android.app.PendingIntent;
import android.os.Bundle;
import java.util.ArrayList;
import o.b;

// Referenced classes of package android.a.a.a:
//			d, p

public static class d$a extends i$a
{
	public static final class a
	{

		public a a(b b1)
		{
			b1.a(this);
		//    0    0:aload_1         
		//    1    1:aload_0         
		//    2    2:invokeinterface #61  <Method d$a$a d$a$b.a(d$a$a)>
		//    3    7:pop             
			return this;
		//    4    8:aload_0         
		//    5    9:areturn         
		}

		public a a(p p1)
		{
			if(e == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #64  <Field ArrayList e>
		//*   2    4:ifnonnull       18
				e = new ArrayList();
		//    3    7:aload_0         
		//    4    8:new             #66  <Class ArrayList>
		//    5   11:dup             
		//    6   12:invokespecial   #67  <Method void ArrayList()>
		//    7   15:putfield        #64  <Field ArrayList e>
			e.add(((Object) (p1)));
		//    8   18:aload_0         
		//    9   19:getfield        #64  <Field ArrayList e>
		//   10   22:aload_1         
		//   11   23:invokevirtual   #71  <Method boolean ArrayList.add(Object)>
		//   12   26:pop             
			return this;
		//   13   27:aload_0         
		//   14   28:areturn         
		}

		public a a(Bundle bundle)
		{
			if(bundle != null)
		//*   0    0:aload_1         
		//*   1    1:ifnull          12
				d.putAll(bundle);
		//    2    4:aload_0         
		//    3    5:getfield        #45  <Field Bundle d>
		//    4    8:aload_1         
		//    5    9:invokevirtual   #75  <Method void Bundle.putAll(Bundle)>
			return this;
		//    6   12:aload_0         
		//    7   13:areturn         
		}

		public Bundle a()
		{
			return d;
		//    0    0:aload_0         
		//    1    1:getfield        #45  <Field Bundle d>
		//    2    4:areturn         
		}

		public d.a b()
		{
			p ap[];
			if(e != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #64  <Field ArrayList e>
		//*   2    4:ifnull          31
				ap = (p[])e.toArray(((Object []) (new p[e.size()])));
		//    3    7:aload_0         
		//    4    8:getfield        #64  <Field ArrayList e>
		//    5   11:aload_0         
		//    6   12:getfield        #64  <Field ArrayList e>
		//    7   15:invokevirtual   #81  <Method int ArrayList.size()>
		//    8   18:anewarray       p[]
		//    9   21:invokevirtual   #87  <Method Object[] ArrayList.toArray(Object[])>
		//   10   24:checkcast       #89  <Class p[]>
		//   11   27:astore_1        
			else
		//*  12   28:goto            33
				ap = null;
		//   13   31:aconst_null     
		//   14   32:astore_1        
			return new d.a(a, b, c, d, ap, ((d._cls2) (null)));
		//   15   33:new             #6   <Class d$a>
		//   16   36:dup             
		//   17   37:aload_0         
		//   18   38:getfield        #33  <Field int a>
		//   19   41:aload_0         
		//   20   42:getfield        #41  <Field CharSequence b>
		//   21   45:aload_0         
		//   22   46:getfield        #43  <Field PendingIntent c>
		//   23   49:aload_0         
		//   24   50:getfield        #45  <Field Bundle d>
		//   25   53:aload_1         
		//   26   54:aconst_null     
		//   27   55:invokespecial   #92  <Method void d$a(int, CharSequence, PendingIntent, Bundle, p[], d$2)>
		//   28   58:areturn         
		}

		private final int a;
		private final CharSequence b;
		private final PendingIntent c;
		private final Bundle d;
		private ArrayList e;

		public a(int i, CharSequence charsequence, PendingIntent pendingintent)
		{
			this(i, charsequence, pendingintent, new Bundle());
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:aload_2         
		//    3    3:aload_3         
		//    4    4:new             #23  <Class Bundle>
		//    5    7:dup             
		//    6    8:invokespecial   #26  <Method void Bundle()>
		//    7   11:invokespecial   #29  <Method void d$a$a(int, CharSequence, PendingIntent, Bundle)>
		//    8   14:return          
		}

		private a(int i, CharSequence charsequence, PendingIntent pendingintent, Bundle bundle)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #31  <Method void Object()>
			a = i;
		//    2    4:aload_0         
		//    3    5:iload_1         
		//    4    6:putfield        #33  <Field int a>
			b = android.a.a.a.d.d.f(charsequence);
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:invokestatic    #39  <Method CharSequence d$d.f(CharSequence)>
		//    8   14:putfield        #41  <Field CharSequence b>
			c = pendingintent;
		//    9   17:aload_0         
		//   10   18:aload_3         
		//   11   19:putfield        #43  <Field PendingIntent c>
			d = bundle;
		//   12   22:aload_0         
		//   13   23:aload           4
		//   14   25:putfield        #45  <Field Bundle d>
		//   15   28:return          
		}

		public a(d.a a1)
		{
			this(a1.a, a1.b, a1.c, new Bundle(d.a.a(a1)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:getfield        #47  <Field int d$a.a>
		//    3    5:aload_1         
		//    4    6:getfield        #48  <Field CharSequence android.a.a.a.d$a.b>
		//    5    9:aload_1         
		//    6   10:getfield        #49  <Field PendingIntent d$a.c>
		//    7   13:new             #23  <Class Bundle>
		//    8   16:dup             
		//    9   17:aload_1         
		//   10   18:invokestatic    #52  <Method Bundle d$a.a(d$a)>
		//   11   21:invokespecial   #55  <Method void Bundle(Bundle)>
		//   12   24:invokespecial   #29  <Method void d$a$a(int, CharSequence, PendingIntent, Bundle)>
		//   13   27:return          
		}
	}

	public static interface b
	{

		public abstract a a(a a1);
	}

	public static final class c
		implements b
	{

		private void a(int l, boolean flag)
		{
			if(flag)
		//*   0    0:iload_2         
		//*   1    1:ifeq            15
			{
				h = h | l;
		//    2    4:aload_0         
		//    3    5:aload_0         
		//    4    6:getfield        #41  <Field int h>
		//    5    9:iload_1         
		//    6   10:ior             
		//    7   11:putfield        #41  <Field int h>
				return;
		//    8   14:return          
			} else
			{
				h = h & ~l;
		//    9   15:aload_0         
		//   10   16:aload_0         
		//   11   17:getfield        #41  <Field int h>
		//   12   20:iload_1         
		//   13   21:iconst_m1       
		//   14   22:ixor            
		//   15   23:iand            
		//   16   24:putfield        #41  <Field int h>
				return;
		//   17   27:return          
			}
		}

		public a a(a a1)
		{
			Bundle bundle = new Bundle();
		//    0    0:new             #48  <Class Bundle>
		//    1    3:dup             
		//    2    4:invokespecial   #69  <Method void Bundle()>
		//    3    7:astore_2        
			if(h != 1)
		//*   4    8:aload_0         
		//*   5    9:getfield        #41  <Field int h>
		//*   6   12:iconst_1        
		//*   7   13:icmpeq          26
				bundle.putInt("flags", h);
		//    8   16:aload_2         
		//    9   17:ldc1            #18  <String "flags">
		//   10   19:aload_0         
		//   11   20:getfield        #41  <Field int h>
		//   12   23:invokevirtual   #73  <Method void Bundle.putInt(String, int)>
			if(i != null)
		//*  13   26:aload_0         
		//*  14   27:getfield        #62  <Field CharSequence i>
		//*  15   30:ifnull          43
				bundle.putCharSequence("inProgressLabel", i);
		//   16   33:aload_2         
		//   17   34:ldc1            #20  <String "inProgressLabel">
		//   18   36:aload_0         
		//   19   37:getfield        #62  <Field CharSequence i>
		//   20   40:invokevirtual   #77  <Method void Bundle.putCharSequence(String, CharSequence)>
			if(j != null)
		//*  21   43:aload_0         
		//*  22   44:getfield        #64  <Field CharSequence j>
		//*  23   47:ifnull          60
				bundle.putCharSequence("confirmLabel", j);
		//   24   50:aload_2         
		//   25   51:ldc1            #23  <String "confirmLabel">
		//   26   53:aload_0         
		//   27   54:getfield        #64  <Field CharSequence j>
		//   28   57:invokevirtual   #77  <Method void Bundle.putCharSequence(String, CharSequence)>
			if(k != null)
		//*  29   60:aload_0         
		//*  30   61:getfield        #66  <Field CharSequence k>
		//*  31   64:ifnull          77
				bundle.putCharSequence("cancelLabel", k);
		//   32   67:aload_2         
		//   33   68:ldc1            #26  <String "cancelLabel">
		//   34   70:aload_0         
		//   35   71:getfield        #66  <Field CharSequence k>
		//   36   74:invokevirtual   #77  <Method void Bundle.putCharSequence(String, CharSequence)>
			a1.a().putBundle("android.wearable.EXTENSIONS", bundle);
		//   37   77:aload_1         
		//   38   78:invokevirtual   #81  <Method Bundle d$a$a.a()>
		//   39   81:ldc1            #15  <String "android.wearable.EXTENSIONS">
		//   40   83:aload_2         
		//   41   84:invokevirtual   #85  <Method void Bundle.putBundle(String, Bundle)>
			return a1;
		//   42   87:aload_1         
		//   43   88:areturn         
		}

		public c a()
		{
			c c1 = new c();
		//    0    0:new             #2   <Class d$a$c>
		//    1    3:dup             
		//    2    4:invokespecial   #87  <Method void d$a$c()>
		//    3    7:astore_1        
			c1.h = h;
		//    4    8:aload_1         
		//    5    9:aload_0         
		//    6   10:getfield        #41  <Field int h>
		//    7   13:putfield        #41  <Field int h>
			c1.i = i;
		//    8   16:aload_1         
		//    9   17:aload_0         
		//   10   18:getfield        #62  <Field CharSequence i>
		//   11   21:putfield        #62  <Field CharSequence i>
			c1.j = j;
		//   12   24:aload_1         
		//   13   25:aload_0         
		//   14   26:getfield        #64  <Field CharSequence j>
		//   15   29:putfield        #64  <Field CharSequence j>
			c1.k = k;
		//   16   32:aload_1         
		//   17   33:aload_0         
		//   18   34:getfield        #66  <Field CharSequence k>
		//   19   37:putfield        #66  <Field CharSequence k>
			return c1;
		//   20   40:aload_1         
		//   21   41:areturn         
		}

		public c a(CharSequence charsequence)
		{
			i = charsequence;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #62  <Field CharSequence i>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public c a(boolean flag)
		{
			a(1, flag);
		//    0    0:aload_0         
		//    1    1:iconst_1        
		//    2    2:iload_1         
		//    3    3:invokespecial   #91  <Method void a(int, boolean)>
			return this;
		//    4    6:aload_0         
		//    5    7:areturn         
		}

		public c b(CharSequence charsequence)
		{
			j = charsequence;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #64  <Field CharSequence j>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public boolean b()
		{
			return (h & 1) != 0;
		//    0    0:aload_0         
		//    1    1:getfield        #41  <Field int h>
		//    2    4:iconst_1        
		//    3    5:iand            
		//    4    6:ifeq            11
		//    5    9:iconst_1        
		//    6   10:ireturn         
		//    7   11:iconst_0        
		//    8   12:ireturn         
		}

		public c c(CharSequence charsequence)
		{
			k = charsequence;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #66  <Field CharSequence k>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public CharSequence c()
		{
			return i;
		//    0    0:aload_0         
		//    1    1:getfield        #62  <Field CharSequence i>
		//    2    4:areturn         
		}

		public Object clone()
		{
			return ((Object) (a()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #97  <Method d$a$c a()>
		//    2    4:areturn         
		}

		public CharSequence d()
		{
			return j;
		//    0    0:aload_0         
		//    1    1:getfield        #64  <Field CharSequence j>
		//    2    4:areturn         
		}

		public CharSequence e()
		{
			return k;
		//    0    0:aload_0         
		//    1    1:getfield        #66  <Field CharSequence k>
		//    2    4:areturn         
		}

		private static final String a = "android.wearable.EXTENSIONS";
		private static final String b = "flags";
		private static final String c = "inProgressLabel";
		private static final String d = "confirmLabel";
		private static final String e = "cancelLabel";
		private static final int f = 1;
		private static final int g = 1;
		private int h;
		private CharSequence i;
		private CharSequence j;
		private CharSequence k;

		public c()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #39  <Method void Object()>
			h = 1;
		//    2    4:aload_0         
		//    3    5:iconst_1        
		//    4    6:putfield        #41  <Field int h>
		//    5    9:return          
		}

		public c(d.a a1)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #39  <Method void Object()>
			h = 1;
		//    2    4:aload_0         
		//    3    5:iconst_1        
		//    4    6:putfield        #41  <Field int h>
			a1 = ((d.a) (a1.d().getBundle("android.wearable.EXTENSIONS")));
		//    5    9:aload_1         
		//    6   10:invokevirtual   #46  <Method Bundle d$a.d()>
		//    7   13:ldc1            #15  <String "android.wearable.EXTENSIONS">
		//    8   15:invokevirtual   #52  <Method Bundle Bundle.getBundle(String)>
		//    9   18:astore_1        
			if(a1 != null)
		//*  10   19:aload_1         
		//*  11   20:ifnull          64
			{
				h = ((Bundle) (a1)).getInt("flags", 1);
		//   12   23:aload_0         
		//   13   24:aload_1         
		//   14   25:ldc1            #18  <String "flags">
		//   15   27:iconst_1        
		//   16   28:invokevirtual   #56  <Method int Bundle.getInt(String, int)>
		//   17   31:putfield        #41  <Field int h>
				i = ((Bundle) (a1)).getCharSequence("inProgressLabel");
		//   18   34:aload_0         
		//   19   35:aload_1         
		//   20   36:ldc1            #20  <String "inProgressLabel">
		//   21   38:invokevirtual   #60  <Method CharSequence Bundle.getCharSequence(String)>
		//   22   41:putfield        #62  <Field CharSequence i>
				j = ((Bundle) (a1)).getCharSequence("confirmLabel");
		//   23   44:aload_0         
		//   24   45:aload_1         
		//   25   46:ldc1            #23  <String "confirmLabel">
		//   26   48:invokevirtual   #60  <Method CharSequence Bundle.getCharSequence(String)>
		//   27   51:putfield        #64  <Field CharSequence j>
				k = ((Bundle) (a1)).getCharSequence("cancelLabel");
		//   28   54:aload_0         
		//   29   55:aload_1         
		//   30   56:ldc1            #26  <String "cancelLabel">
		//   31   58:invokevirtual   #60  <Method CharSequence Bundle.getCharSequence(String)>
		//   32   61:putfield        #66  <Field CharSequence k>
			}
		//   33   64:return          
		}
	}


	static Bundle a(d$a d$a1)
	{
		return d$a1.e;
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field Bundle e>
	//    2    4:areturn         
	}

	public int a()
	{
		return a;
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field int a>
	//    2    4:ireturn         
	}

	public CharSequence b()
	{
		return b;
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field CharSequence b>
	//    2    4:areturn         
	}

	public PendingIntent c()
	{
		return c;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field PendingIntent c>
	//    2    4:areturn         
	}

	public Bundle d()
	{
		return e;
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field Bundle e>
	//    2    4:areturn         
	}

	public p[] e()
	{
		return f;
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field p[] f>
	//    2    4:areturn         
	}

	public s$a[] f()
	{
		return ((s$a []) (e()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #67  <Method p[] e()>
	//    2    4:areturn         
	}

	public static final a d = new o.b();
	public int a;
	public CharSequence b;
	public PendingIntent c;
	private final Bundle e;
	private final p f[];

	static 
	{
	//    0    0:new             #28  <Class b>
	//    1    3:dup             
	//    2    4:invokespecial   #31  <Method void b()>
	//    3    7:putstatic       #33  <Field i$a$a d>
	//*   4   10:return          
	}

	public d$a(int i, CharSequence charsequence, PendingIntent pendingintent)
	{
		this(i, charsequence, pendingintent, new Bundle(), ((p []) (null)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:new             #37  <Class Bundle>
	//    5    7:dup             
	//    6    8:invokespecial   #38  <Method void Bundle()>
	//    7   11:aconst_null     
	//    8   12:invokespecial   #41  <Method void d$a(int, CharSequence, PendingIntent, Bundle, p[])>
	//    9   15:return          
	}

	private d$a(int i, CharSequence charsequence, PendingIntent pendingintent, Bundle bundle, p ap[])
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #42  <Method void i$a()>
		a = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #44  <Field int a>
		b = d$d.f(charsequence);
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:invokestatic    #49  <Method CharSequence d$d.f(CharSequence)>
	//    8   14:putfield        #51  <Field CharSequence b>
		c = pendingintent;
	//    9   17:aload_0         
	//   10   18:aload_3         
	//   11   19:putfield        #53  <Field PendingIntent c>
		if(bundle == null)
	//*  12   22:aload           4
	//*  13   24:ifnull          30
	//*  14   27:goto            39
			bundle = new Bundle();
	//   15   30:new             #37  <Class Bundle>
	//   16   33:dup             
	//   17   34:invokespecial   #38  <Method void Bundle()>
	//   18   37:astore          4
		e = bundle;
	//   19   39:aload_0         
	//   20   40:aload           4
	//   21   42:putfield        #55  <Field Bundle e>
		f = ap;
	//   22   45:aload_0         
	//   23   46:aload           5
	//   24   48:putfield        #57  <Field p[] f>
	//   25   51:return          
	}

	public d$a(int i, CharSequence charsequence, PendingIntent pendingintent, Bundle bundle, p ap[], d$2 d$2)
	{
		this(i, charsequence, pendingintent, bundle, ap);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:aload           5
	//    6    8:invokespecial   #41  <Method void d$a(int, CharSequence, PendingIntent, Bundle, p[])>
	//    7   11:return          
	}
}
