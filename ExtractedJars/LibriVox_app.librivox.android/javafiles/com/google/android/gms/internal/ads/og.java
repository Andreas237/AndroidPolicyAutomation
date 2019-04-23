// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;

// Referenced classes of package com.google.android.gms.internal.ads:
//			wt, we, oj, wx, 
//			zzasm, xg, oh, oi, 
//			ol, wd

public abstract class og extends wt
{

	protected og(Context context, we we1, ol ol)
	{
		super(true);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:invokespecial   #24  <Method void wt(boolean)>
	//    3    5:aload_0         
	//    4    6:new             #26  <Class Object>
	//    5    9:dup             
	//    6   10:invokespecial   #29  <Method void Object()>
	//    7   13:putfield        #31  <Field Object c>
	//    8   16:aload_0         
	//    9   17:new             #26  <Class Object>
	//   10   20:dup             
	//   11   21:invokespecial   #29  <Method void Object()>
	//   12   24:putfield        #33  <Field Object d>
		b = context;
	//   13   27:aload_0         
	//   14   28:aload_1         
	//   15   29:putfield        #35  <Field Context b>
		e = we1;
	//   16   32:aload_0         
	//   17   33:aload_2         
	//   18   34:putfield        #37  <Field we e>
		f = we1.b;
	//   19   37:aload_0         
	//   20   38:aload_2         
	//   21   39:getfield        #41  <Field zzasm we.b>
	//   22   42:putfield        #43  <Field zzasm f>
		a = ol;
	//   23   45:aload_0         
	//   24   46:aload_3         
	//   25   47:putfield        #45  <Field ol a>
	//   26   50:return          
	}

	protected abstract wd a(int i);

	public final void a()
	{
		Object obj = c;
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field Object c>
	//    2    4:astore_2        
		obj;
	//    3    5:aload_2         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		int i;
		wx.b("AdRendererBackgroundTask started.");
	//    5    7:ldc1            #51  <String "AdRendererBackgroundTask started.">
	//    6    9:invokestatic    #56  <Method void wx.b(String)>
		i = e.e;
	//    7   12:aload_0         
	//    8   13:getfield        #37  <Field we e>
	//    9   16:getfield        #59  <Field int we.e>
	//   10   19:istore_1        
		a(SystemClock.elapsedRealtime());
	//   11   20:aload_0         
	//   12   21:invokestatic    #65  <Method long SystemClock.elapsedRealtime()>
	//   13   24:invokevirtual   #68  <Method void a(long)>
		break MISSING_BLOCK_LABEL_122;
	//   14   27:goto            122
		Object obj1;
		obj1;
	//   15   30:astore_3        
		i = ((oj) (obj1)).a();
	//   16   31:aload_3         
	//   17   32:invokevirtual   #71  <Method int oj.a()>
	//   18   35:istore_1        
		if(i == 3 || i == -1)
	//*  19   36:iload_1         
	//*  20   37:iconst_3        
	//*  21   38:icmpeq          59
	//*  22   41:iload_1         
	//*  23   42:iconst_m1       
	//*  24   43:icmpne          49
			break MISSING_BLOCK_LABEL_59;
	//   25   46:goto            59
		wx.e(((oj) (obj1)).getMessage());
	//   26   49:aload_3         
	//   27   50:invokevirtual   #75  <Method String oj.getMessage()>
	//   28   53:invokestatic    #77  <Method void wx.e(String)>
		break MISSING_BLOCK_LABEL_66;
	//   29   56:goto            66
		wx.d(((oj) (obj1)).getMessage());
	//   30   59:aload_3         
	//   31   60:invokevirtual   #75  <Method String oj.getMessage()>
	//   32   63:invokestatic    #79  <Method void wx.d(String)>
		if(f == null)
	//*  33   66:aload_0         
	//*  34   67:getfield        #43  <Field zzasm f>
	//*  35   70:ifnonnull       88
		{
			f = new zzasm(i);
	//   36   73:aload_0         
	//   37   74:new             #81  <Class zzasm>
	//   38   77:dup             
	//   39   78:iload_1         
	//   40   79:invokespecial   #84  <Method void zzasm(int)>
	//   41   82:putfield        #43  <Field zzasm f>
			break MISSING_BLOCK_LABEL_107;
	//   42   85:goto            107
		}
		f = new zzasm(i, f.j);
	//   43   88:aload_0         
	//   44   89:new             #81  <Class zzasm>
	//   45   92:dup             
	//   46   93:iload_1         
	//   47   94:aload_0         
	//   48   95:getfield        #43  <Field zzasm f>
	//   49   98:getfield        #88  <Field long zzasm.j>
	//   50  101:invokespecial   #91  <Method void zzasm(int, long)>
	//   51  104:putfield        #43  <Field zzasm f>
		xg.a.post(((Runnable) (new oh(this))));
	//   52  107:getstatic       #96  <Field Handler xg.a>
	//   53  110:new             #98  <Class oh>
	//   54  113:dup             
	//   55  114:aload_0         
	//   56  115:invokespecial   #101 <Method void oh(og)>
	//   57  118:invokevirtual   #107 <Method boolean Handler.post(Runnable)>
	//   58  121:pop             
		wd wd = a(i);
	//   59  122:aload_0         
	//   60  123:iload_1         
	//   61  124:invokevirtual   #109 <Method wd a(int)>
	//   62  127:astore_3        
		xg.a.post(((Runnable) (new oi(this, wd))));
	//   63  128:getstatic       #96  <Field Handler xg.a>
	//   64  131:new             #111 <Class oi>
	//   65  134:dup             
	//   66  135:aload_0         
	//   67  136:aload_3         
	//   68  137:invokespecial   #114 <Method void oi(og, wd)>
	//   69  140:invokevirtual   #107 <Method boolean Handler.post(Runnable)>
	//   70  143:pop             
		obj;
	//   71  144:aload_2         
		JVM INSTR monitorexit ;
	//   72  145:monitorexit     
		return;
	//   73  146:return          
		wd;
	//   74  147:astore_3        
		obj;
	//   75  148:aload_2         
		JVM INSTR monitorexit ;
	//   76  149:monitorexit     
		throw wd;
	//   77  150:aload_3         
	//   78  151:athrow          
	}

	protected abstract void a(long l);

	public void b_()
	{
	//    0    0:return          
	}

	protected final ol a;
	protected final Context b;
	protected final Object c = new Object();
	protected final Object d = new Object();
	protected final we e;
	protected zzasm f;
}
