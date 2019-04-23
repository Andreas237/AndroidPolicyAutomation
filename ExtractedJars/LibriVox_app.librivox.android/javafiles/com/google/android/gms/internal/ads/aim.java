// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.*;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.e;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.gms.internal.ads:
//			ain, akh, zzbjg, aiq, 
//			zzbji

final class aim
	implements d, e
{

	public aim(Context context, String s, String s1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void Object()>
		b = s;
	//    2    4:aload_0         
	//    3    5:aload_2         
	//    4    6:putfield        #24  <Field String b>
		c = s1;
	//    5    9:aload_0         
	//    6   10:aload_3         
	//    7   11:putfield        #26  <Field String c>
	//    8   14:aload_0         
	//    9   15:new             #28  <Class HandlerThread>
	//   10   18:dup             
	//   11   19:ldc1            #30  <String "GassClient">
	//   12   21:invokespecial   #33  <Method void HandlerThread(String)>
	//   13   24:putfield        #35  <Field HandlerThread e>
		e.start();
	//   14   27:aload_0         
	//   15   28:getfield        #35  <Field HandlerThread e>
	//   16   31:invokevirtual   #38  <Method void HandlerThread.start()>
		a = new ain(context, e.getLooper(), ((d) (this)), ((e) (this)));
	//   17   34:aload_0         
	//   18   35:new             #40  <Class ain>
	//   19   38:dup             
	//   20   39:aload_1         
	//   21   40:aload_0         
	//   22   41:getfield        #35  <Field HandlerThread e>
	//   23   44:invokevirtual   #44  <Method android.os.Looper HandlerThread.getLooper()>
	//   24   47:aload_0         
	//   25   48:aload_0         
	//   26   49:invokespecial   #47  <Method void ain(Context, android.os.Looper, d, e)>
	//   27   52:putfield        #49  <Field ain a>
	//   28   55:aload_0         
	//   29   56:new             #51  <Class LinkedBlockingQueue>
	//   30   59:dup             
	//   31   60:invokespecial   #52  <Method void LinkedBlockingQueue()>
	//   32   63:putfield        #54  <Field LinkedBlockingQueue d>
		a.q();
	//   33   66:aload_0         
	//   34   67:getfield        #49  <Field ain a>
	//   35   70:invokevirtual   #57  <Method void ain.q()>
	//   36   73:return          
	}

	private final aiq a()
	{
		Object obj;
		aiq aiq1;
		try
		{
			aiq1 = a.e();
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field ain a>
	//    2    4:invokevirtual   #65  <Method aiq com.google.android.gms.internal.ads.ain.e()>
	//    3    7:astore_1        
		}
	//*   4    8:aload_1         
	//*   5    9:areturn         
	//*   6   10:aconst_null     
	//*   7   11:areturn         
		// Misplaced declaration of an exception variable
		catch(Object obj)
		{
			return null;
		}
		return aiq1;
	//*   8   12:astore_1        
	//*   9   13:goto            10
	}

	private final void b()
	{
		ain ain1 = a;
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field ain a>
	//    2    4:astore_1        
		if(ain1 != null && (ain1.h() || a.i()))
	//*   3    5:aload_1         
	//*   4    6:ifnull          33
	//*   5    9:aload_1         
	//*   6   10:invokevirtual   #69  <Method boolean ain.h()>
	//*   7   13:ifne            26
	//*   8   16:aload_0         
	//*   9   17:getfield        #49  <Field ain a>
	//*  10   20:invokevirtual   #72  <Method boolean ain.i()>
	//*  11   23:ifeq            33
			a.g();
	//   12   26:aload_0         
	//   13   27:getfield        #49  <Field ain a>
	//   14   30:invokevirtual   #75  <Method void ain.g()>
	//   15   33:return          
	}

	private static akh c()
	{
		akh akh1 = new akh();
	//    0    0:new             #78  <Class akh>
	//    1    3:dup             
	//    2    4:invokespecial   #79  <Method void akh()>
	//    3    7:astore_0        
		akh1.k = Long.valueOf(32768L);
	//    4    8:aload_0         
	//    5    9:ldc2w           #80  <Long 32768L>
	//    6   12:invokestatic    #87  <Method Long Long.valueOf(long)>
	//    7   15:putfield        #91  <Field Long akh.k>
		return akh1;
	//    8   18:aload_0         
	//    9   19:areturn         
	}

	public final void a(int i)
	{
		try
		{
			d.put(((Object) (c())));
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field LinkedBlockingQueue d>
	//    2    4:invokestatic    #96  <Method akh c()>
	//    3    7:invokevirtual   #100 <Method void LinkedBlockingQueue.put(Object)>
			return;
	//    4   10:return          
		}
		catch(InterruptedException interruptedexception)
	//*   5   11:astore_2        
		{
			return;
	//    6   12:return          
		}
	}

	public final void a(Bundle bundle)
	{
		bundle = ((Bundle) (a()));
	//    0    0:aload_0         
	//    1    1:invokespecial   #105 <Method aiq a()>
	//    2    4:astore_1        
		if(bundle == null) goto _L2; else goto _L1
	//    3    5:aload_1         
	//    4    6:ifnull          99
_L1:
		bundle = ((Bundle) (((aiq) (bundle)).a(new zzbjg(b, c)).a()));
	//    5    9:aload_1         
	//    6   10:new             #107 <Class zzbjg>
	//    7   13:dup             
	//    8   14:aload_0         
	//    9   15:getfield        #24  <Field String b>
	//   10   18:aload_0         
	//   11   19:getfield        #26  <Field String c>
	//   12   22:invokespecial   #110 <Method void zzbjg(String, String)>
	//   13   25:invokeinterface #115 <Method zzbji aiq.a(zzbjg)>
	//   14   30:invokevirtual   #119 <Method akh zzbji.a()>
	//   15   33:astore_1        
		d.put(((Object) (bundle)));
	//   16   34:aload_0         
	//   17   35:getfield        #54  <Field LinkedBlockingQueue d>
	//   18   38:aload_1         
	//   19   39:invokevirtual   #100 <Method void LinkedBlockingQueue.put(Object)>
		b();
	//   20   42:aload_0         
	//   21   43:invokespecial   #121 <Method void b()>
		e.quit();
	//   22   46:aload_0         
	//   23   47:getfield        #35  <Field HandlerThread e>
	//   24   50:invokevirtual   #124 <Method boolean HandlerThread.quit()>
	//   25   53:pop             
		return;
	//   26   54:return          
		bundle;
	//   27   55:astore_1        
	//*  28   56:goto            72
	//*  29   59:aload_0         
	//*  30   60:getfield        #54  <Field LinkedBlockingQueue d>
	//*  31   63:invokestatic    #96  <Method akh c()>
	//*  32   66:invokevirtual   #100 <Method void LinkedBlockingQueue.put(Object)>
	//*  33   69:goto            86
		b();
	//   34   72:aload_0         
	//   35   73:invokespecial   #121 <Method void b()>
		e.quit();
	//   36   76:aload_0         
	//   37   77:getfield        #35  <Field HandlerThread e>
	//   38   80:invokevirtual   #124 <Method boolean HandlerThread.quit()>
	//   39   83:pop             
		throw bundle;
	//   40   84:aload_1         
	//   41   85:athrow          
_L3:
		try
		{
			d.put(((Object) (c())));
		}
	//*  42   86:aload_0         
	//*  43   87:invokespecial   #121 <Method void b()>
	//*  44   90:aload_0         
	//*  45   91:getfield        #35  <Field HandlerThread e>
	//*  46   94:invokevirtual   #124 <Method boolean HandlerThread.quit()>
	//*  47   97:pop             
	//*  48   98:return          
	//*  49   99:return          
	//*  50  100:astore_1        
	//*  51  101:goto            59
		// Misplaced declaration of an exception variable
		catch(Bundle bundle) { }
	//   52  104:astore_1        
		b();
		e.quit();
		return;
_L2:
		return;
		bundle;
		  goto _L3
	//*  53  105:goto            86
	}

	public final void a(ConnectionResult connectionresult)
	{
		try
		{
			d.put(((Object) (c())));
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field LinkedBlockingQueue d>
	//    2    4:invokestatic    #96  <Method akh c()>
	//    3    7:invokevirtual   #100 <Method void LinkedBlockingQueue.put(Object)>
			return;
	//    4   10:return          
		}
		// Misplaced declaration of an exception variable
		catch(ConnectionResult connectionresult)
	//*   5   11:astore_1        
		{
			return;
	//    6   12:return          
		}
	}

	public final akh b(int i)
	{
		InterruptedException interruptedexception;
		akh akh1;
		try
		{
			akh1 = (akh)d.poll(5000L, TimeUnit.MILLISECONDS);
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field LinkedBlockingQueue d>
	//    2    4:ldc2w           #127 <Long 5000L>
	//    3    7:getstatic       #134 <Field TimeUnit TimeUnit.MILLISECONDS>
	//    4   10:invokevirtual   #138 <Method Object LinkedBlockingQueue.poll(long, TimeUnit)>
	//    5   13:checkcast       #78  <Class akh>
	//    6   16:astore_2        
		}
	//*   7   17:goto            22
	//*   8   20:aconst_null     
	//*   9   21:astore_2        
	//*  10   22:aload_2         
	//*  11   23:astore_3        
	//*  12   24:aload_2         
	//*  13   25:ifnonnull       32
	//*  14   28:invokestatic    #96  <Method akh c()>
	//*  15   31:astore_3        
	//*  16   32:aload_3         
	//*  17   33:areturn         
		// Misplaced declaration of an exception variable
		catch(InterruptedException interruptedexception)
		{
			akh1 = null;
		}
		akh akh2 = akh1;
		if(akh1 == null)
			akh2 = c();
		return akh2;
	//*  18   34:astore_2        
	//*  19   35:goto            20
	}

	private ain a;
	private final String b;
	private final String c;
	private final LinkedBlockingQueue d = new LinkedBlockingQueue();
	private final HandlerThread e = new HandlerThread("GassClient");
}
