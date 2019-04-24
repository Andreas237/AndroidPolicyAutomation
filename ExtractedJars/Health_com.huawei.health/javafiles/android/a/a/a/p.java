// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.a.a.a;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import o.*;

public class p extends s.a
{
	public static final class a
	{

		public a a(Bundle bundle)
		{
			if(bundle != null)
		//*   0    0:aload_1         
		//*   1    1:ifnull          12
				e.putAll(bundle);
		//    2    4:aload_0         
		//    3    5:getfield        #28  <Field Bundle e>
		//    4    8:aload_1         
		//    5    9:invokevirtual   #42  <Method void Bundle.putAll(Bundle)>
			return this;
		//    6   12:aload_0         
		//    7   13:areturn         
		}

		public a a(CharSequence charsequence)
		{
			b = charsequence;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #45  <Field CharSequence b>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public a a(boolean flag)
		{
			d = flag;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #23  <Field boolean d>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public a a(CharSequence acharsequence[])
		{
			c = acharsequence;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #49  <Field CharSequence[] c>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Bundle a()
		{
			return e;
		//    0    0:aload_0         
		//    1    1:getfield        #28  <Field Bundle e>
		//    2    4:areturn         
		}

		public p b()
		{
			return new p(a, b, c, d, e);
		//    0    0:new             #6   <Class p>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:getfield        #36  <Field String a>
		//    4    8:aload_0         
		//    5    9:getfield        #45  <Field CharSequence b>
		//    6   12:aload_0         
		//    7   13:getfield        #49  <Field CharSequence[] c>
		//    8   16:aload_0         
		//    9   17:getfield        #23  <Field boolean d>
		//   10   20:aload_0         
		//   11   21:getfield        #28  <Field Bundle e>
		//   12   24:invokespecial   #54  <Method void p(String, CharSequence, CharSequence[], boolean, Bundle)>
		//   13   27:areturn         
		}

		private final String a;
		private CharSequence b;
		private CharSequence c[];
		private boolean d;
		private Bundle e;

		public a(String s)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #21  <Method void Object()>
			d = true;
		//    2    4:aload_0         
		//    3    5:iconst_1        
		//    4    6:putfield        #23  <Field boolean d>
			e = new Bundle();
		//    5    9:aload_0         
		//    6   10:new             #25  <Class Bundle>
		//    7   13:dup             
		//    8   14:invokespecial   #26  <Method void Bundle()>
		//    9   17:putfield        #28  <Field Bundle e>
			if(s == null)
		//*  10   20:aload_1         
		//*  11   21:ifnonnull       34
			{
				throw new IllegalArgumentException("Result key can't be null");
		//   12   24:new             #30  <Class IllegalArgumentException>
		//   13   27:dup             
		//   14   28:ldc1            #32  <String "Result key can't be null">
		//   15   30:invokespecial   #34  <Method void IllegalArgumentException(String)>
		//   16   33:athrow          
			} else
			{
				a = s;
		//   17   34:aload_0         
		//   18   35:aload_1         
		//   19   36:putfield        #36  <Field String a>
				return;
		//   20   39:return          
			}
		}
	}

	static class b
		implements c
	{

		public Bundle b(Intent intent)
		{
			Log.w("RemoteInput", "RemoteInput is only supported from API Level 16");
		//    0    0:ldc1            #17  <String "RemoteInput">
		//    1    2:ldc1            #19  <String "RemoteInput is only supported from API Level 16">
		//    2    4:invokestatic    #25  <Method int Log.w(String, String)>
		//    3    7:pop             
			return null;
		//    4    8:aconst_null     
		//    5    9:areturn         
		}

		public void c(p ap[], Intent intent, Bundle bundle)
		{
			Log.w("RemoteInput", "RemoteInput is only supported from API Level 16");
		//    0    0:ldc1            #17  <String "RemoteInput">
		//    1    2:ldc1            #19  <String "RemoteInput is only supported from API Level 16">
		//    2    4:invokestatic    #25  <Method int Log.w(String, String)>
		//    3    7:pop             
		//    4    8:return          
		}

		b()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #13  <Method void Object()>
		//    2    4:return          
		}
	}

	static interface c
	{

		public abstract Bundle b(Intent intent);

		public abstract void c(p ap[], Intent intent, Bundle bundle);
	}

	static class d
		implements c
	{

		public Bundle b(Intent intent)
		{
			return o.g.b(intent);
		//    0    0:aload_1         
		//    1    1:invokestatic    #20  <Method Bundle g.b(Intent)>
		//    2    4:areturn         
		}

		public void c(p ap[], Intent intent, Bundle bundle)
		{
			o.g.c(((s.a []) (ap)), intent, bundle);
		//    0    0:aload_1         
		//    1    1:aload_2         
		//    2    2:aload_3         
		//    3    3:invokestatic    #25  <Method void g.c(s$a[], Intent, Bundle)>
		//    4    6:return          
		}

		d()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #13  <Method void Object()>
		//    2    4:return          
		}
	}

	static class e
		implements c
	{

		public Bundle b(Intent intent)
		{
			return k.a(intent);
		//    0    0:aload_1         
		//    1    1:invokestatic    #21  <Method Bundle k.a(Intent)>
		//    2    4:areturn         
		}

		public void c(p ap[], Intent intent, Bundle bundle)
		{
			k.a(((s.a []) (ap)), intent, bundle);
		//    0    0:aload_1         
		//    1    1:aload_2         
		//    2    2:aload_3         
		//    3    3:invokestatic    #26  <Method void k.a(s$a[], Intent, Bundle)>
		//    4    6:return          
		}

		e()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #13  <Method void Object()>
		//    2    4:return          
		}
	}


	public p(String s, CharSequence charsequence, CharSequence acharsequence[], boolean flag, Bundle bundle)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #60  <Method void s$a()>
		e = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #62  <Field String e>
		f = charsequence;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #64  <Field CharSequence f>
		g = acharsequence;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #66  <Field CharSequence[] g>
		h = flag;
	//   11   19:aload_0         
	//   12   20:iload           4
	//   13   22:putfield        #68  <Field boolean h>
		i = bundle;
	//   14   25:aload_0         
	//   15   26:aload           5
	//   16   28:putfield        #70  <Field Bundle i>
	//   17   31:return          
	}

	public static Bundle a(Intent intent)
	{
		return j.b(intent);
	//    0    0:getstatic       #50  <Field p$c j>
	//    1    3:aload_0         
	//    2    4:invokeinterface #73  <Method Bundle p$c.b(Intent)>
	//    3    9:areturn         
	}

	public static void a(p ap[], Intent intent, Bundle bundle)
	{
		j.c(ap, intent, bundle);
	//    0    0:getstatic       #50  <Field p$c j>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokeinterface #76  <Method void p$c.c(p[], Intent, Bundle)>
	//    5   11:return          
	}

	public String a()
	{
		return e;
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field String e>
	//    2    4:areturn         
	}

	public CharSequence b()
	{
		return f;
	//    0    0:aload_0         
	//    1    1:getfield        #64  <Field CharSequence f>
	//    2    4:areturn         
	}

	public CharSequence[] c()
	{
		return g;
	//    0    0:aload_0         
	//    1    1:getfield        #66  <Field CharSequence[] g>
	//    2    4:areturn         
	}

	public boolean d()
	{
		return h;
	//    0    0:aload_0         
	//    1    1:getfield        #68  <Field boolean h>
	//    2    4:ireturn         
	}

	public Bundle e()
	{
		return i;
	//    0    0:aload_0         
	//    1    1:getfield        #70  <Field Bundle i>
	//    2    4:areturn         
	}

	public static final String a = "android.remoteinput.results";
	public static final String b = "android.remoteinput.resultsData";
	public static final s.a.a c = new f();
	private static final String d = "RemoteInput";
	private static final c j;
	private final String e;
	private final CharSequence f;
	private final CharSequence g[];
	private final boolean h;
	private final Bundle i;

	static 
	{
		if(android.os.Build.VERSION.SDK_INT >= 20)
	//*   0    0:getstatic       #45  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          20
	//*   2    5:icmplt          21
			j = ((c) (new e()));
	//    3    8:new             #18  <Class p$e>
	//    4   11:dup             
	//    5   12:invokespecial   #48  <Method void p$e()>
	//    6   15:putstatic       #50  <Field p$c j>
		else
	//*   7   18:goto            52
		if(android.os.Build.VERSION.SDK_INT >= 16)
	//*   8   21:getstatic       #45  <Field int android.os.Build$VERSION.SDK_INT>
	//*   9   24:bipush          16
	//*  10   26:icmplt          42
			j = ((c) (new d()));
	//   11   29:new             #15  <Class p$d>
	//   12   32:dup             
	//   13   33:invokespecial   #51  <Method void p$d()>
	//   14   36:putstatic       #50  <Field p$c j>
		else
	//*  15   39:goto            52
			j = ((c) (new b()));
	//   16   42:new             #9   <Class p$b>
	//   17   45:dup             
	//   18   46:invokespecial   #52  <Method void p$b()>
	//   19   49:putstatic       #50  <Field p$c j>
	//   20   52:new             #54  <Class f>
	//   21   55:dup             
	//   22   56:invokespecial   #55  <Method void f()>
	//   23   59:putstatic       #57  <Field s$a$a c>
	//*  24   62:return          
	}
}
