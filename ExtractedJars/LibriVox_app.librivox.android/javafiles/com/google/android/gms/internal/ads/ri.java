// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.*;
import com.google.android.gms.ads.internal.aw;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.e;

// Referenced classes of package com.google.android.gms.internal.ads:
//			re, rj, zh, wx, 
//			rh, yb, zzbbi, xg, 
//			abq, rc, rp

public final class ri extends re
	implements d, e
{

	public ri(Context context, zzbbi zzbbi1, abq abq, rc rc)
	{
		super(abq, rc);
	//    0    0:aload_0         
	//    1    1:aload_3         
	//    2    2:aload           4
	//    3    4:invokespecial   #28  <Method void re(abq, rc)>
	//    4    7:aload_0         
	//    5    8:new             #30  <Class Object>
	//    6   11:dup             
	//    7   12:invokespecial   #33  <Method void Object()>
	//    8   15:putfield        #35  <Field Object f>
		a = context;
	//    9   18:aload_0         
	//   10   19:aload_1         
	//   11   20:putfield        #37  <Field Context a>
		b = zzbbi1;
	//   12   23:aload_0         
	//   13   24:aload_2         
	//   14   25:putfield        #39  <Field zzbbi b>
		c = abq;
	//   15   28:aload_0         
	//   16   29:aload_3         
	//   17   30:putfield        #41  <Field abq c>
		e = rc;
	//   18   33:aload_0         
	//   19   34:aload           4
	//   20   36:putfield        #43  <Field rc e>
		g = new rj(context, aw.u().a(), ((d) (this)), ((e) (this)));
	//   21   39:aload_0         
	//   22   40:new             #45  <Class rj>
	//   23   43:dup             
	//   24   44:aload_1         
	//   25   45:invokestatic    #51  <Method zh aw.u()>
	//   26   48:invokevirtual   #56  <Method android.os.Looper zh.a()>
	//   27   51:aload_0         
	//   28   52:aload_0         
	//   29   53:invokespecial   #59  <Method void rj(Context, android.os.Looper, d, e)>
	//   30   56:putfield        #61  <Field rj g>
		g.q();
	//   31   59:aload_0         
	//   32   60:getfield        #61  <Field rj g>
	//   33   63:invokevirtual   #64  <Method void rj.q()>
	//   34   66:return          
	}

	public final void a()
	{
		synchronized(f)
	//*   0    0:aload_0         
	//*   1    1:getfield        #35  <Field Object f>
	//*   2    4:astore_1        
	//*   3    5:aload_1         
	//*   4    6:monitorenter    
		{
			if(g.h() || g.i())
	//*   5    7:aload_0         
	//*   6    8:getfield        #61  <Field rj g>
	//*   7   11:invokevirtual   #69  <Method boolean rj.h()>
	//*   8   14:ifne            27
	//*   9   17:aload_0         
	//*  10   18:getfield        #61  <Field rj g>
	//*  11   21:invokevirtual   #72  <Method boolean rj.i()>
	//*  12   24:ifeq            34
				g.g();
	//   13   27:aload_0         
	//   14   28:getfield        #61  <Field rj g>
	//   15   31:invokevirtual   #74  <Method void rj.g()>
			Binder.flushPendingCommands();
	//   16   34:invokestatic    #79  <Method void Binder.flushPendingCommands()>
		}
	//   17   37:aload_1         
	//   18   38:monitorexit     
		return;
	//   19   39:return          
		exception;
	//   20   40:astore_2        
		obj;
	//   21   41:aload_1         
		JVM INSTR monitorexit ;
	//   22   42:monitorexit     
		throw exception;
	//   23   43:aload_2         
	//   24   44:athrow          
	}

	public final void a(int i)
	{
		wx.b("Disconnected from remote ad request service.");
	//    0    0:ldc1            #82  <String "Disconnected from remote ad request service.">
	//    1    2:invokestatic    #87  <Method void wx.b(String)>
	//    2    5:return          
	}

	public final void a(Bundle bundle)
	{
		((re)this).c();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #91  <Method Object re.c()>
	//    2    4:pop             
	//    3    5:return          
	}

	public final void a(ConnectionResult connectionresult)
	{
		wx.b("Cannot connect to remote service, fallback to local instance.");
	//    0    0:ldc1            #94  <String "Cannot connect to remote service, fallback to local instance.">
	//    1    2:invokestatic    #87  <Method void wx.b(String)>
		d = ((yb) (new rh(a, c, e)));
	//    2    5:aload_0         
	//    3    6:new             #96  <Class rh>
	//    4    9:dup             
	//    5   10:aload_0         
	//    6   11:getfield        #37  <Field Context a>
	//    7   14:aload_0         
	//    8   15:getfield        #41  <Field abq c>
	//    9   18:aload_0         
	//   10   19:getfield        #43  <Field rc e>
	//   11   22:invokespecial   #99  <Method void rh(Context, abq, rc)>
	//   12   25:putfield        #101 <Field yb d>
		d.c();
	//   13   28:aload_0         
	//   14   29:getfield        #101 <Field yb d>
	//   15   32:invokeinterface #104 <Method Object yb.c()>
	//   16   37:pop             
		connectionresult = ((ConnectionResult) (new Bundle()));
	//   17   38:new             #106 <Class Bundle>
	//   18   41:dup             
	//   19   42:invokespecial   #107 <Method void Bundle()>
	//   20   45:astore_1        
		((Bundle) (connectionresult)).putString("action", "gms_connection_failed_fallback_to_local");
	//   21   46:aload_1         
	//   22   47:ldc1            #109 <String "action">
	//   23   49:ldc1            #111 <String "gms_connection_failed_fallback_to_local">
	//   24   51:invokevirtual   #115 <Method void Bundle.putString(String, String)>
		aw.e().b(a, b.a, "gmob-apps", ((Bundle) (connectionresult)), true);
	//   25   54:invokestatic    #118 <Method xg aw.e()>
	//   26   57:aload_0         
	//   27   58:getfield        #37  <Field Context a>
	//   28   61:aload_0         
	//   29   62:getfield        #39  <Field zzbbi b>
	//   30   65:getfield        #123 <Field String zzbbi.a>
	//   31   68:ldc1            #125 <String "gmob-apps">
	//   32   70:aload_1         
	//   33   71:iconst_1        
	//   34   72:invokevirtual   #130 <Method void xg.b(Context, String, String, Bundle, boolean)>
	//   35   75:return          
	}

	public final rp d()
	{
	//*   0    0:aload_0         
	//*   1    1:getfield        #35  <Field Object f>
	//*   2    4:astore_1        
		obj;
	//    3    5:aload_1         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		rp rp;
		synchronized(f)
		{
			rp = g.e();
	//    5    7:aload_0         
	//    6    8:getfield        #61  <Field rj g>
	//    7   11:invokevirtual   #137 <Method rp com.google.android.gms.internal.ads.rj.e()>
	//    8   14:astore_2        
		}
	//    9   15:aload_1         
	//   10   16:monitorexit     
		return rp;
	//   11   17:aload_2         
	//   12   18:areturn         
_L1:
		obj;
	//   13   19:aload_1         
		JVM INSTR monitorexit ;
	//   14   20:monitorexit     
		return null;
	//   15   21:aconst_null     
	//   16   22:areturn         
_L2:
		obj;
	//   17   23:aload_1         
		JVM INSTR monitorexit ;
	//   18   24:monitorexit     
		throw obj1;
	//   19   25:aload_2         
	//   20   26:athrow          
		obj1;
	//   21   27:astore_2        
		  goto _L1
	//*  22   28:goto            19
		obj1;
	//   23   31:astore_2        
		  goto _L2
	//*  24   32:goto            23
	}

	private Context a;
	private zzbbi b;
	private abq c;
	private yb d;
	private final rc e;
	private final Object f = new Object();
	private rj g;
}
