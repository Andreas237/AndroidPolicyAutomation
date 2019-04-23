// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.b;
import com.google.android.gms.common.api.y;
import com.google.android.gms.common.api.z;
import com.google.android.gms.common.internal.ResolveAccountResponse;
import com.google.android.gms.common.internal.am;
import com.google.android.gms.common.internal.p;
import com.google.android.gms.signin.f;
import com.google.android.gms.signin.internal.c;
import com.google.android.gms.signin.internal.zaj;
import java.util.Set;

// Referenced classes of package com.google.android.gms.common.api.internal:
//			cb, bz, ca

public final class by extends c
	implements y, z
{

	public by(Context context, Handler handler, p p1)
	{
		this(context, handler, p1, a);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:getstatic       #30  <Field b a>
	//    5    7:invokespecial   #36  <Method void by(Context, Handler, p, b)>
	//    6   10:return          
	}

	public by(Context context, Handler handler, p p1, b b1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #38  <Method void c()>
		b = context;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #40  <Field Context b>
		c = handler;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #42  <Field Handler c>
		f = (p)am.a(((Object) (p1)), "ClientSettings must not be null");
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:ldc1            #44  <String "ClientSettings must not be null">
	//   11   18:invokestatic    #49  <Method Object am.a(Object, Object)>
	//   12   21:checkcast       #51  <Class p>
	//   13   24:putfield        #53  <Field p f>
		e = p1.d();
	//   14   27:aload_0         
	//   15   28:aload_3         
	//   16   29:invokevirtual   #56  <Method Set p.d()>
	//   17   32:putfield        #58  <Field Set e>
		d = b1;
	//   18   35:aload_0         
	//   19   36:aload           4
	//   20   38:putfield        #60  <Field b d>
	//   21   41:return          
	}

	static cb a(by by1)
	{
		return by1.h;
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field cb h>
	//    2    4:areturn         
	}

	static void a(by by1, zaj zaj1)
	{
		by1.b(zaj1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #67  <Method void b(zaj)>
	//    3    5:return          
	}

	private final void b(zaj zaj1)
	{
		Object obj = ((Object) (zaj1.a()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #72  <Method ConnectionResult zaj.a()>
	//    2    4:astore_2        
		if(((ConnectionResult) (obj)).b())
	//*   3    5:aload_2         
	//*   4    6:invokevirtual   #77  <Method boolean ConnectionResult.b()>
	//*   5    9:ifeq            122
		{
			obj = ((Object) (zaj1.b()));
	//    6   12:aload_1         
	//    7   13:invokevirtual   #80  <Method ResolveAccountResponse zaj.b()>
	//    8   16:astore_2        
			zaj1 = ((zaj) (((ResolveAccountResponse) (obj)).b()));
	//    9   17:aload_2         
	//   10   18:invokevirtual   #84  <Method ConnectionResult ResolveAccountResponse.b()>
	//   11   21:astore_1        
			if(!((ConnectionResult) (zaj1)).b())
	//*  12   22:aload_1         
	//*  13   23:invokevirtual   #77  <Method boolean ConnectionResult.b()>
	//*  14   26:ifne            102
			{
				obj = ((Object) (String.valueOf(((Object) (zaj1)))));
	//   15   29:aload_1         
	//   16   30:invokestatic    #90  <Method String String.valueOf(Object)>
	//   17   33:astore_2        
				StringBuilder stringbuilder = new StringBuilder(String.valueOf(obj).length() + 48);
	//   18   34:new             #92  <Class StringBuilder>
	//   19   37:dup             
	//   20   38:aload_2         
	//   21   39:invokestatic    #90  <Method String String.valueOf(Object)>
	//   22   42:invokevirtual   #96  <Method int String.length()>
	//   23   45:bipush          48
	//   24   47:iadd            
	//   25   48:invokespecial   #99  <Method void StringBuilder(int)>
	//   26   51:astore_3        
				stringbuilder.append("Sign-in succeeded with resolve account failure: ");
	//   27   52:aload_3         
	//   28   53:ldc1            #101 <String "Sign-in succeeded with resolve account failure: ">
	//   29   55:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//   30   58:pop             
				stringbuilder.append(((String) (obj)));
	//   31   59:aload_3         
	//   32   60:aload_2         
	//   33   61:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//   34   64:pop             
				Log.wtf("SignInCoordinator", stringbuilder.toString(), ((Throwable) (new Exception())));
	//   35   65:ldc1            #107 <String "SignInCoordinator">
	//   36   67:aload_3         
	//   37   68:invokevirtual   #111 <Method String StringBuilder.toString()>
	//   38   71:new             #113 <Class Exception>
	//   39   74:dup             
	//   40   75:invokespecial   #114 <Method void Exception()>
	//   41   78:invokestatic    #120 <Method int Log.wtf(String, String, Throwable)>
	//   42   81:pop             
				h.b(((ConnectionResult) (zaj1)));
	//   43   82:aload_0         
	//   44   83:getfield        #63  <Field cb h>
	//   45   86:aload_1         
	//   46   87:invokeinterface #125 <Method void com.google.android.gms.common.api.internal.cb.b(ConnectionResult)>
				g.g();
	//   47   92:aload_0         
	//   48   93:getfield        #127 <Field f g>
	//   49   96:invokeinterface #131 <Method void f.g()>
				return;
	//   50  101:return          
			}
			h.a(((ResolveAccountResponse) (obj)).a(), e);
	//   51  102:aload_0         
	//   52  103:getfield        #63  <Field cb h>
	//   53  106:aload_2         
	//   54  107:invokevirtual   #134 <Method com.google.android.gms.common.internal.ab ResolveAccountResponse.a()>
	//   55  110:aload_0         
	//   56  111:getfield        #58  <Field Set e>
	//   57  114:invokeinterface #137 <Method void cb.a(com.google.android.gms.common.internal.ab, Set)>
		} else
	//*  58  119:goto            132
		{
			h.b(((ConnectionResult) (obj)));
	//   59  122:aload_0         
	//   60  123:getfield        #63  <Field cb h>
	//   61  126:aload_2         
	//   62  127:invokeinterface #125 <Method void com.google.android.gms.common.api.internal.cb.b(ConnectionResult)>
		}
		g.g();
	//   63  132:aload_0         
	//   64  133:getfield        #127 <Field f g>
	//   65  136:invokeinterface #131 <Method void f.g()>
	//   66  141:return          
	}

	public final f a()
	{
		return g;
	//    0    0:aload_0         
	//    1    1:getfield        #127 <Field f g>
	//    2    4:areturn         
	}

	public final void a(int i)
	{
		g.g();
	//    0    0:aload_0         
	//    1    1:getfield        #127 <Field f g>
	//    2    4:invokeinterface #131 <Method void f.g()>
	//    3    9:return          
	}

	public final void a(Bundle bundle)
	{
		g.a(((com.google.android.gms.signin.internal.d) (this)));
	//    0    0:aload_0         
	//    1    1:getfield        #127 <Field f g>
	//    2    4:aload_0         
	//    3    5:invokeinterface #142 <Method void f.a(com.google.android.gms.signin.internal.d)>
	//    4   10:return          
	}

	public final void a(ConnectionResult connectionresult)
	{
		h.b(connectionresult);
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field cb h>
	//    2    4:aload_1         
	//    3    5:invokeinterface #125 <Method void com.google.android.gms.common.api.internal.cb.b(ConnectionResult)>
	//    4   10:return          
	}

	public final void a(cb cb1)
	{
		Object obj = ((Object) (g));
	//    0    0:aload_0         
	//    1    1:getfield        #127 <Field f g>
	//    2    4:astore_2        
		if(obj != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          15
			((f) (obj)).g();
	//    5    9:aload_2         
	//    6   10:invokeinterface #131 <Method void f.g()>
		f.a(Integer.valueOf(System.identityHashCode(((Object) (this)))));
	//    7   15:aload_0         
	//    8   16:getfield        #53  <Field p f>
	//    9   19:aload_0         
	//   10   20:invokestatic    #149 <Method int System.identityHashCode(Object)>
	//   11   23:invokestatic    #154 <Method Integer Integer.valueOf(int)>
	//   12   26:invokevirtual   #157 <Method void p.a(Integer)>
		obj = ((Object) (d));
	//   13   29:aload_0         
	//   14   30:getfield        #60  <Field b d>
	//   15   33:astore_2        
		Context context = b;
	//   16   34:aload_0         
	//   17   35:getfield        #40  <Field Context b>
	//   18   38:astore_3        
		android.os.Looper looper = c.getLooper();
	//   19   39:aload_0         
	//   20   40:getfield        #42  <Field Handler c>
	//   21   43:invokevirtual   #163 <Method android.os.Looper Handler.getLooper()>
	//   22   46:astore          4
		p p1 = f;
	//   23   48:aload_0         
	//   24   49:getfield        #53  <Field p f>
	//   25   52:astore          5
		g = (f)((b) (obj)).a(context, looper, p1, ((Object) (p1.i())), ((y) (this)), ((z) (this)));
	//   26   54:aload_0         
	//   27   55:aload_2         
	//   28   56:aload_3         
	//   29   57:aload           4
	//   30   59:aload           5
	//   31   61:aload           5
	//   32   63:invokevirtual   #167 <Method com.google.android.gms.signin.a p.i()>
	//   33   66:aload_0         
	//   34   67:aload_0         
	//   35   68:invokevirtual   #172 <Method com.google.android.gms.common.api.l b.a(Context, android.os.Looper, p, Object, y, z)>
	//   36   71:checkcast       #129 <Class f>
	//   37   74:putfield        #127 <Field f g>
		h = cb1;
	//   38   77:aload_0         
	//   39   78:aload_1         
	//   40   79:putfield        #63  <Field cb h>
		cb1 = ((cb) (e));
	//   41   82:aload_0         
	//   42   83:getfield        #58  <Field Set e>
	//   43   86:astore_1        
		if(cb1 != null && !((Set) (cb1)).isEmpty())
	//*  44   87:aload_1         
	//*  45   88:ifnull          113
	//*  46   91:aload_1         
	//*  47   92:invokeinterface #177 <Method boolean Set.isEmpty()>
	//*  48   97:ifeq            103
	//*  49  100:goto            113
		{
			g.B();
	//   50  103:aload_0         
	//   51  104:getfield        #127 <Field f g>
	//   52  107:invokeinterface #180 <Method void f.B()>
			return;
	//   53  112:return          
		} else
		{
			c.post(((Runnable) (new bz(this))));
	//   54  113:aload_0         
	//   55  114:getfield        #42  <Field Handler c>
	//   56  117:new             #182 <Class bz>
	//   57  120:dup             
	//   58  121:aload_0         
	//   59  122:invokespecial   #185 <Method void bz(by)>
	//   60  125:invokevirtual   #189 <Method boolean Handler.post(Runnable)>
	//   61  128:pop             
			return;
	//   62  129:return          
		}
	}

	public final void a(zaj zaj1)
	{
		c.post(((Runnable) (new ca(this, zaj1))));
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field Handler c>
	//    2    4:new             #191 <Class ca>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #193 <Method void ca(by, zaj)>
	//    7   13:invokevirtual   #189 <Method boolean Handler.post(Runnable)>
	//    8   16:pop             
	//    9   17:return          
	}

	public final void b()
	{
		f f1 = g;
	//    0    0:aload_0         
	//    1    1:getfield        #127 <Field f g>
	//    2    4:astore_1        
		if(f1 != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          15
			f1.g();
	//    5    9:aload_1         
	//    6   10:invokeinterface #131 <Method void f.g()>
	//    7   15:return          
	}

	private static b a;
	private final Context b;
	private final Handler c;
	private final b d;
	private Set e;
	private p f;
	private f g;
	private cb h;

	static 
	{
		a = com.google.android.gms.signin.c.a;
	//    0    0:getstatic       #29  <Field b com.google.android.gms.signin.c.a>
	//    1    3:putstatic       #30  <Field b a>
	//*   2    6:return          
	}
}
