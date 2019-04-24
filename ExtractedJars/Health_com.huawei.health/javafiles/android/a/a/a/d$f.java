// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.a.a.a;

import android.app.Notification;
import android.app.PendingIntent;
import android.graphics.Bitmap;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import o.e;

// Referenced classes of package android.a.a.a:
//			d, p

public static final class d$f
	implements d$g
{
	public static class a extends i.b
	{

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

		static final i.b.a a = new e();
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

		public a(String as[], p p1, PendingIntent pendingintent, PendingIntent pendingintent1, String as1[], long l)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #34  <Method void i$b()>
			b = as;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #36  <Field String[] b>
			c = p1;
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

	public static class a.a
	{

		public a.a a(long l)
		{
			f = l;
		//    0    0:aload_0         
		//    1    1:lload_1         
		//    2    2:putfield        #38  <Field long f>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public a.a a(PendingIntent pendingintent)
		{
			d = pendingintent;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #41  <Field PendingIntent d>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public a.a a(PendingIntent pendingintent, p p1)
		{
			c = p1;
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

		public a.a a(String s)
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

		public a a()
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
			p p1 = c;
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
			return new a(as, p1, pendingintent, pendingintent1, new String[] {
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

		public a.a(String s)
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


	public int a()
	{
		return h;
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field int h>
	//    2    4:ireturn         
	}

	public d$d a(d$d d$d1)
	{
		if(android.os.d.VERSION.SDK_INT < 21)
	//*   0    0:getstatic       #47  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmpge          10
			return d$d1;
	//    3    8:aload_1         
	//    4    9:areturn         
		Bundle bundle = new Bundle();
	//    5   10:new             #52  <Class Bundle>
	//    6   13:dup             
	//    7   14:invokespecial   #89  <Method void Bundle()>
	//    8   17:astore_2        
		if(f != null)
	//*   9   18:aload_0         
	//*  10   19:getfield        #64  <Field Bitmap f>
	//*  11   22:ifnull          35
			bundle.putParcelable("large_icon", ((android.os.Parcelable) (f)));
	//   12   25:aload_2         
	//   13   26:ldc1            #23  <String "large_icon">
	//   14   28:aload_0         
	//   15   29:getfield        #64  <Field Bitmap f>
	//   16   32:invokevirtual   #93  <Method void Bundle.putParcelable(String, android.os.Parcelable)>
		if(h != 0)
	//*  17   35:aload_0         
	//*  18   36:getfield        #40  <Field int h>
	//*  19   39:ifeq            52
			bundle.putInt("app_color", h);
	//   20   42:aload_2         
	//   21   43:ldc1            #29  <String "app_color">
	//   22   45:aload_0         
	//   23   46:getfield        #40  <Field int h>
	//   24   49:invokevirtual   #97  <Method void Bundle.putInt(String, int)>
		if(g != null)
	//*  25   52:aload_0         
	//*  26   53:getfield        #86  <Field d$f$a g>
	//*  27   56:ifnull          77
			bundle.putBundle("car_conversation", android.a.a.a.d.a().c(((i$b) (g))));
	//   28   59:aload_2         
	//   29   60:ldc1            #26  <String "car_conversation">
	//   30   62:invokestatic    #71  <Method d$k d.a()>
	//   31   65:aload_0         
	//   32   66:getfield        #86  <Field d$f$a g>
	//   33   69:invokeinterface #100 <Method Bundle d$k.c(i$b)>
	//   34   74:invokevirtual   #104 <Method void Bundle.putBundle(String, Bundle)>
		d$d1.a().putBundle("android.car.EXTENSIONS", bundle);
	//   35   77:aload_1         
	//   36   78:invokevirtual   #109 <Method Bundle d$d.a()>
	//   37   81:ldc1            #20  <String "android.car.EXTENSIONS">
	//   38   83:aload_2         
	//   39   84:invokevirtual   #104 <Method void Bundle.putBundle(String, Bundle)>
		return d$d1;
	//   40   87:aload_1         
	//   41   88:areturn         
	}

	public d$f a(int i)
	{
		h = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #40  <Field int h>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public d$f a(a a1)
	{
		g = a1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #86  <Field d$f$a g>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public d$f a(Bitmap bitmap)
	{
		f = bitmap;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #64  <Field Bitmap f>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public Bitmap b()
	{
		return f;
	//    0    0:aload_0         
	//    1    1:getfield        #64  <Field Bitmap f>
	//    2    4:areturn         
	}

	public a c()
	{
		return g;
	//    0    0:aload_0         
	//    1    1:getfield        #86  <Field d$f$a g>
	//    2    4:areturn         
	}

	private static final String a = "CarExtender";
	private static final String b = "android.car.EXTENSIONS";
	private static final String c = "large_icon";
	private static final String d = "car_conversation";
	private static final String e = "app_color";
	private Bitmap f;
	private a g;
	private int h;

	public d$f()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #38  <Method void Object()>
		h = 0;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #40  <Field int h>
	//    5    9:return          
	}

	public d$f(Notification notification)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #38  <Method void Object()>
		h = 0;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #40  <Field int h>
		if(android.os.d.VERSION.SDK_INT < 21)
	//*   5    9:getstatic       #47  <Field int android.os.Build$VERSION.SDK_INT>
	//*   6   12:bipush          21
	//*   7   14:icmpge          18
			return;
	//    8   17:return          
		if(android.a.a.a.d.a(notification) == null)
	//*   9   18:aload_1         
	//*  10   19:invokestatic    #50  <Method Bundle d.a(Notification)>
	//*  11   22:ifnonnull       30
			notification = null;
	//   12   25:aconst_null     
	//   13   26:astore_1        
		else
	//*  14   27:goto            40
			notification = ((Notification) (android.a.a.a.d.a(notification).getBundle("android.car.EXTENSIONS")));
	//   15   30:aload_1         
	//   16   31:invokestatic    #50  <Method Bundle d.a(Notification)>
	//   17   34:ldc1            #20  <String "android.car.EXTENSIONS">
	//   18   36:invokevirtual   #56  <Method Bundle Bundle.getBundle(String)>
	//   19   39:astore_1        
		if(notification != null)
	//*  20   40:aload_1         
	//*  21   41:ifnull          97
		{
			f = (Bitmap)((Bundle) (notification)).getParcelable("large_icon");
	//   22   44:aload_0         
	//   23   45:aload_1         
	//   24   46:ldc1            #23  <String "large_icon">
	//   25   48:invokevirtual   #60  <Method android.os.Parcelable Bundle.getParcelable(String)>
	//   26   51:checkcast       #62  <Class Bitmap>
	//   27   54:putfield        #64  <Field Bitmap f>
			h = ((Bundle) (notification)).getInt("app_color", 0);
	//   28   57:aload_0         
	//   29   58:aload_1         
	//   30   59:ldc1            #29  <String "app_color">
	//   31   61:iconst_0        
	//   32   62:invokevirtual   #68  <Method int Bundle.getInt(String, int)>
	//   33   65:putfield        #40  <Field int h>
			notification = ((Notification) (((Bundle) (notification)).getBundle("car_conversation")));
	//   34   68:aload_1         
	//   35   69:ldc1            #26  <String "car_conversation">
	//   36   71:invokevirtual   #56  <Method Bundle Bundle.getBundle(String)>
	//   37   74:astore_1        
			g = (a)android.a.a.a.d.a().a(((Bundle) (notification)), a.a, p.c);
	//   38   75:aload_0         
	//   39   76:invokestatic    #71  <Method d$k d.a()>
	//   40   79:aload_1         
	//   41   80:getstatic       #74  <Field i$b$a d$f$a.a>
	//   42   83:getstatic       #79  <Field s$a$a p.c>
	//   43   86:invokeinterface #84  <Method i$b d$k.a(Bundle, i$b$a, s$a$a)>
	//   44   91:checkcast       #11  <Class d$f$a>
	//   45   94:putfield        #86  <Field d$f$a g>
		}
	//   46   97:return          
	}
}
