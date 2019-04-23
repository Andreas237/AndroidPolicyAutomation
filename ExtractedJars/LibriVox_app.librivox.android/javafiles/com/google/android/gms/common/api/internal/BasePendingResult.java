// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.*;
import com.google.android.gms.common.internal.ae;
import com.google.android.gms.common.internal.am;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

// Referenced classes of package com.google.android.gms.common.api.internal:
//			cu, g, ci, h, 
//			cc

public abstract class BasePendingResult extends ab
{

	BasePendingResult()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #48  <Method void ab()>
		a = new Object();
	//    2    4:aload_0         
	//    3    5:new             #50  <Class Object>
	//    4    8:dup             
	//    5    9:invokespecial   #51  <Method void Object()>
	//    6   12:putfield        #53  <Field Object a>
		e = new CountDownLatch(1);
	//    7   15:aload_0         
	//    8   16:new             #55  <Class CountDownLatch>
	//    9   19:dup             
	//   10   20:iconst_1        
	//   11   21:invokespecial   #58  <Method void CountDownLatch(int)>
	//   12   24:putfield        #60  <Field CountDownLatch e>
		f = new ArrayList();
	//   13   27:aload_0         
	//   14   28:new             #62  <Class ArrayList>
	//   15   31:dup             
	//   16   32:invokespecial   #63  <Method void ArrayList()>
	//   17   35:putfield        #65  <Field ArrayList f>
		h = new AtomicReference();
	//   18   38:aload_0         
	//   19   39:new             #67  <Class AtomicReference>
	//   20   42:dup             
	//   21   43:invokespecial   #68  <Method void AtomicReference()>
	//   22   46:putfield        #70  <Field AtomicReference h>
		p = false;
	//   23   49:aload_0         
	//   24   50:iconst_0        
	//   25   51:putfield        #72  <Field boolean p>
		b = new g(Looper.getMainLooper());
	//   26   54:aload_0         
	//   27   55:new             #74  <Class g>
	//   28   58:dup             
	//   29   59:invokestatic    #80  <Method Looper Looper.getMainLooper()>
	//   30   62:invokespecial   #83  <Method void g(Looper)>
	//   31   65:putfield        #85  <Field g b>
		d = new WeakReference(((Object) (null)));
	//   32   68:aload_0         
	//   33   69:new             #87  <Class WeakReference>
	//   34   72:dup             
	//   35   73:aconst_null     
	//   36   74:invokespecial   #90  <Method void WeakReference(Object)>
	//   37   77:putfield        #92  <Field WeakReference d>
	//   38   80:return          
	}

	protected BasePendingResult(w w1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #48  <Method void ab()>
		a = new Object();
	//    2    4:aload_0         
	//    3    5:new             #50  <Class Object>
	//    4    8:dup             
	//    5    9:invokespecial   #51  <Method void Object()>
	//    6   12:putfield        #53  <Field Object a>
		e = new CountDownLatch(1);
	//    7   15:aload_0         
	//    8   16:new             #55  <Class CountDownLatch>
	//    9   19:dup             
	//   10   20:iconst_1        
	//   11   21:invokespecial   #58  <Method void CountDownLatch(int)>
	//   12   24:putfield        #60  <Field CountDownLatch e>
		f = new ArrayList();
	//   13   27:aload_0         
	//   14   28:new             #62  <Class ArrayList>
	//   15   31:dup             
	//   16   32:invokespecial   #63  <Method void ArrayList()>
	//   17   35:putfield        #65  <Field ArrayList f>
		h = new AtomicReference();
	//   18   38:aload_0         
	//   19   39:new             #67  <Class AtomicReference>
	//   20   42:dup             
	//   21   43:invokespecial   #68  <Method void AtomicReference()>
	//   22   46:putfield        #70  <Field AtomicReference h>
		p = false;
	//   23   49:aload_0         
	//   24   50:iconst_0        
	//   25   51:putfield        #72  <Field boolean p>
		Looper looper;
		if(w1 != null)
	//*  26   54:aload_1         
	//*  27   55:ifnull          66
			looper = w1.c();
	//   28   58:aload_1         
	//   29   59:invokevirtual   #98  <Method Looper w.c()>
	//   30   62:astore_2        
		else
	//*  31   63:goto            70
			looper = Looper.getMainLooper();
	//   32   66:invokestatic    #80  <Method Looper Looper.getMainLooper()>
	//   33   69:astore_2        
		b = new g(looper);
	//   34   70:aload_0         
	//   35   71:new             #74  <Class g>
	//   36   74:dup             
	//   37   75:aload_2         
	//   38   76:invokespecial   #83  <Method void g(Looper)>
	//   39   79:putfield        #85  <Field g b>
		d = new WeakReference(((Object) (w1)));
	//   40   82:aload_0         
	//   41   83:new             #87  <Class WeakReference>
	//   42   86:dup             
	//   43   87:aload_1         
	//   44   88:invokespecial   #90  <Method void WeakReference(Object)>
	//   45   91:putfield        #92  <Field WeakReference d>
	//   46   94:return          
	}

	private final ah a()
	{
		Object obj = a;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field Object a>
	//    2    4:astore_2        
		obj;
	//    3    5:aload_2         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		boolean flag;
		ah ah1;
		Exception exception;
		if(!k)
	//*   5    7:aload_0         
	//*   6    8:getfield        #101 <Field boolean k>
	//*   7   11:ifne            86
			flag = true;
	//    8   14:iconst_1        
	//    9   15:istore_1        
		else
	//*  10   16:goto            19
	//*  11   19:iload_1         
	//*  12   20:ldc1            #103 <String "Result has already been consumed.">
	//*  13   22:invokestatic    #108 <Method void am.a(boolean, Object)>
	//*  14   25:aload_0         
	//*  15   26:invokevirtual   #111 <Method boolean f()>
	//*  16   29:ldc1            #113 <String "Result is not ready.">
	//*  17   31:invokestatic    #108 <Method void am.a(boolean, Object)>
	//*  18   34:aload_0         
	//*  19   35:getfield        #115 <Field ah i>
	//*  20   38:astore_3        
	//*  21   39:aload_0         
	//*  22   40:aconst_null     
	//*  23   41:putfield        #115 <Field ah i>
	//*  24   44:aload_0         
	//*  25   45:aconst_null     
	//*  26   46:putfield        #117 <Field ai g>
	//*  27   49:aload_0         
	//*  28   50:iconst_1        
	//*  29   51:putfield        #101 <Field boolean k>
	//*  30   54:aload_2         
	//*  31   55:monitorexit     
	//*  32   56:aload_0         
	//*  33   57:getfield        #70  <Field AtomicReference h>
	//*  34   60:aconst_null     
	//*  35   61:invokevirtual   #121 <Method Object AtomicReference.getAndSet(Object)>
	//*  36   64:checkcast       #123 <Class ci>
	//*  37   67:astore_2        
	//*  38   68:aload_2         
	//*  39   69:ifnull          79
	//*  40   72:aload_2         
	//*  41   73:aload_0         
	//*  42   74:invokeinterface #126 <Method void ci.a(BasePendingResult)>
	//*  43   79:aload_3         
	//*  44   80:areturn         
	//*  45   81:astore_3        
	//*  46   82:aload_2         
	//*  47   83:monitorexit     
	//*  48   84:aload_3         
	//*  49   85:athrow          
			flag = false;
	//   50   86:iconst_0        
	//   51   87:istore_1        
		am.a(flag, "Result has already been consumed.");
		am.a(f(), "Result is not ready.");
		ah1 = i;
		i = null;
		g = null;
		k = true;
		obj;
		JVM INSTR monitorexit ;
		obj = ((Object) ((ci)h.getAndSet(((Object) (null)))));
		if(obj != null)
			((ci) (obj)).a(this);
		return ah1;
		exception;
		obj;
		JVM INSTR monitorexit ;
		throw exception;
	//*  52   88:goto            19
	}

	static ah a(BasePendingResult basependingresult)
	{
		return basependingresult.i;
	//    0    0:aload_0         
	//    1    1:getfield        #115 <Field ah i>
	//    2    4:areturn         
	}

	private final void a(ah ah1)
	{
		i = ah1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #115 <Field ah i>
		n = null;
	//    3    5:aload_0         
	//    4    6:aconst_null     
	//    5    7:putfield        #130 <Field ae n>
		e.countDown();
	//    6   10:aload_0         
	//    7   11:getfield        #60  <Field CountDownLatch e>
	//    8   14:invokevirtual   #133 <Method void CountDownLatch.countDown()>
		j = i.b();
	//    9   17:aload_0         
	//   10   18:aload_0         
	//   11   19:getfield        #115 <Field ah i>
	//   12   22:invokeinterface #138 <Method Status ah.b()>
	//   13   27:putfield        #140 <Field Status j>
		if(l)
	//*  14   30:aload_0         
	//*  15   31:getfield        #142 <Field boolean l>
	//*  16   34:ifeq            45
			g = null;
	//   17   37:aload_0         
	//   18   38:aconst_null     
	//   19   39:putfield        #117 <Field ai g>
		else
	//*  20   42:goto            101
		if(g == null)
	//*  21   45:aload_0         
	//*  22   46:getfield        #117 <Field ai g>
	//*  23   49:ifnonnull       78
		{
			if(i instanceof ag)
	//*  24   52:aload_0         
	//*  25   53:getfield        #115 <Field ah i>
	//*  26   56:instanceof      #144 <Class ag>
	//*  27   59:ifeq            101
				mResultGuardian = new h(this, ((cu) (null)));
	//   28   62:aload_0         
	//   29   63:new             #146 <Class h>
	//   30   66:dup             
	//   31   67:aload_0         
	//   32   68:aconst_null     
	//   33   69:invokespecial   #149 <Method void h(BasePendingResult, cu)>
	//   34   72:putfield        #151 <Field h mResultGuardian>
		} else
	//*  35   75:goto            101
		{
			b.removeMessages(2);
	//   36   78:aload_0         
	//   37   79:getfield        #85  <Field g b>
	//   38   82:iconst_2        
	//   39   83:invokevirtual   #154 <Method void g.removeMessages(int)>
			b.a(g, a());
	//   40   86:aload_0         
	//   41   87:getfield        #85  <Field g b>
	//   42   90:aload_0         
	//   43   91:getfield        #117 <Field ai g>
	//   44   94:aload_0         
	//   45   95:invokespecial   #156 <Method ah a()>
	//   46   98:invokevirtual   #159 <Method void g.a(ai, ah)>
		}
		ah1 = ((ah) ((ArrayList)f));
	//   47  101:aload_0         
	//   48  102:getfield        #65  <Field ArrayList f>
	//   49  105:checkcast       #62  <Class ArrayList>
	//   50  108:astore_1        
		int j1 = ((ArrayList) (ah1)).size();
	//   51  109:aload_1         
	//   52  110:invokevirtual   #163 <Method int ArrayList.size()>
	//   53  113:istore_3        
		for(int i1 = 0; i1 < j1;)
	//*  54  114:iconst_0        
	//*  55  115:istore_2        
	//*  56  116:iload_2         
	//*  57  117:iload_3         
	//*  58  118:icmpge          149
		{
			Object obj = ((ArrayList) (ah1)).get(i1);
	//   59  121:aload_1         
	//   60  122:iload_2         
	//   61  123:invokevirtual   #167 <Method Object ArrayList.get(int)>
	//   62  126:astore          4
			i1++;
	//   63  128:iload_2         
	//   64  129:iconst_1        
	//   65  130:iadd            
	//   66  131:istore_2        
			((ac)obj).a(j);
	//   67  132:aload           4
	//   68  134:checkcast       #169 <Class ac>
	//   69  137:aload_0         
	//   70  138:getfield        #140 <Field Status j>
	//   71  141:invokeinterface #172 <Method void ac.a(Status)>
		}

	//*  72  146:goto            116
		f.clear();
	//   73  149:aload_0         
	//   74  150:getfield        #65  <Field ArrayList f>
	//   75  153:invokevirtual   #175 <Method void ArrayList.clear()>
	//   76  156:return          
	}

	public static void c(ah ah1)
	{
		if(ah1 instanceof ag)
	//*   0    0:aload_0         
	//*   1    1:instanceof      #144 <Class ag>
	//*   2    4:ifeq            65
			try
			{
				((ag)ah1).a();
	//    3    7:aload_0         
	//    4    8:checkcast       #144 <Class ag>
	//    5   11:invokeinterface #179 <Method void ag.a()>
				return;
	//    6   16:return          
			}
			catch(RuntimeException runtimeexception)
	//*   7   17:astore_1        
			{
				ah1 = ((ah) (String.valueOf(((Object) (ah1)))));
	//    8   18:aload_0         
	//    9   19:invokestatic    #185 <Method String String.valueOf(Object)>
	//   10   22:astore_0        
				StringBuilder stringbuilder = new StringBuilder(String.valueOf(((Object) (ah1))).length() + 18);
	//   11   23:new             #187 <Class StringBuilder>
	//   12   26:dup             
	//   13   27:aload_0         
	//   14   28:invokestatic    #185 <Method String String.valueOf(Object)>
	//   15   31:invokevirtual   #190 <Method int String.length()>
	//   16   34:bipush          18
	//   17   36:iadd            
	//   18   37:invokespecial   #191 <Method void StringBuilder(int)>
	//   19   40:astore_2        
				stringbuilder.append("Unable to release ");
	//   20   41:aload_2         
	//   21   42:ldc1            #193 <String "Unable to release ">
	//   22   44:invokevirtual   #197 <Method StringBuilder StringBuilder.append(String)>
	//   23   47:pop             
				stringbuilder.append(((String) (ah1)));
	//   24   48:aload_2         
	//   25   49:aload_0         
	//   26   50:invokevirtual   #197 <Method StringBuilder StringBuilder.append(String)>
	//   27   53:pop             
				Log.w("BasePendingResult", stringbuilder.toString(), ((Throwable) (runtimeexception)));
	//   28   54:ldc1            #199 <String "BasePendingResult">
	//   29   56:aload_2         
	//   30   57:invokevirtual   #203 <Method String StringBuilder.toString()>
	//   31   60:aload_1         
	//   32   61:invokestatic    #209 <Method int Log.w(String, String, Throwable)>
	//   33   64:pop             
			}
	//   34   65:return          
	}

	public final ah a(long l1, TimeUnit timeunit)
	{
		if(l1 > 0L)
	//*   0    0:lload_1         
	//*   1    1:lconst_0        
	//*   2    2:lcmp            
	//*   3    3:ifle            11
			am.c("await must not be called on the UI thread when time is greater than zero.");
	//    4    6:ldc1            #214 <String "await must not be called on the UI thread when time is greater than zero.">
	//    5    8:invokestatic    #217 <Method void am.c(String)>
		boolean flag1 = k;
	//    6   11:aload_0         
	//    7   12:getfield        #101 <Field boolean k>
	//    8   15:istore          5
		boolean flag = true;
	//    9   17:iconst_1        
	//   10   18:istore          4
		am.a(flag1 ^ true, "Result has already been consumed.");
	//   11   20:iload           5
	//   12   22:iconst_1        
	//   13   23:ixor            
	//   14   24:ldc1            #103 <String "Result has already been consumed.">
	//   15   26:invokestatic    #108 <Method void am.a(boolean, Object)>
		if(o != null)
	//*  16   29:aload_0         
	//*  17   30:getfield        #219 <Field cc o>
	//*  18   33:ifnonnull       39
	//*  19   36:goto            42
			flag = false;
	//   20   39:iconst_0        
	//   21   40:istore          4
		am.a(flag, "Cannot await if then() has been called.");
	//   22   42:iload           4
	//   23   44:ldc1            #221 <String "Cannot await if then() has been called.">
	//   24   46:invokestatic    #108 <Method void am.a(boolean, Object)>
		try
		{
			if(!e.await(l1, timeunit))
	//*  25   49:aload_0         
	//*  26   50:getfield        #60  <Field CountDownLatch e>
	//*  27   53:lload_1         
	//*  28   54:aload_3         
	//*  29   55:invokevirtual   #225 <Method boolean CountDownLatch.await(long, TimeUnit)>
	//*  30   58:ifne            78
				c(Status.d);
	//   31   61:aload_0         
	//   32   62:getstatic       #229 <Field Status Status.d>
	//   33   65:invokevirtual   #231 <Method void c(Status)>
		}
	//*  34   68:goto            78
	//*  35   71:aload_0         
	//*  36   72:getstatic       #233 <Field Status Status.b>
	//*  37   75:invokevirtual   #231 <Method void c(Status)>
	//*  38   78:aload_0         
	//*  39   79:invokevirtual   #111 <Method boolean f()>
	//*  40   82:ldc1            #113 <String "Result is not ready.">
	//*  41   84:invokestatic    #108 <Method void am.a(boolean, Object)>
	//*  42   87:aload_0         
	//*  43   88:invokespecial   #156 <Method ah a()>
	//*  44   91:areturn         
		// Misplaced declaration of an exception variable
		catch(TimeUnit timeunit)
		{
			c(Status.b);
		}
		am.a(f(), "Result is not ready.");
		return a();
	//*  45   92:astore_3        
	//*  46   93:goto            71
	}

	protected abstract ah a(Status status);

	public final void a(ac ac1)
	{
		boolean flag;
		if(ac1 != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          9
			flag = true;
	//    2    4:iconst_1        
	//    3    5:istore_2        
		else
	//*   4    6:goto            11
			flag = false;
	//    5    9:iconst_0        
	//    6   10:istore_2        
		am.b(flag, "Callback cannot be null.");
	//    7   11:iload_2         
	//    8   12:ldc1            #237 <String "Callback cannot be null.">
	//    9   14:invokestatic    #239 <Method void am.b(boolean, Object)>
		Object obj = a;
	//   10   17:aload_0         
	//   11   18:getfield        #53  <Field Object a>
	//   12   21:astore_3        
		obj;
	//   13   22:aload_3         
		JVM INSTR monitorenter ;
	//   14   23:monitorenter    
		if(f())
	//*  15   24:aload_0         
	//*  16   25:invokevirtual   #111 <Method boolean f()>
	//*  17   28:ifeq            44
		{
			ac1.a(j);
	//   18   31:aload_1         
	//   19   32:aload_0         
	//   20   33:getfield        #140 <Field Status j>
	//   21   36:invokeinterface #172 <Method void ac.a(Status)>
			break MISSING_BLOCK_LABEL_53;
	//   22   41:goto            53
		}
		f.add(((Object) (ac1)));
	//   23   44:aload_0         
	//   24   45:getfield        #65  <Field ArrayList f>
	//   25   48:aload_1         
	//   26   49:invokevirtual   #243 <Method boolean ArrayList.add(Object)>
	//   27   52:pop             
		obj;
	//   28   53:aload_3         
		JVM INSTR monitorexit ;
	//   29   54:monitorexit     
		return;
	//   30   55:return          
		ac1;
	//   31   56:astore_1        
		obj;
	//   32   57:aload_3         
		JVM INSTR monitorexit ;
	//   33   58:monitorexit     
		throw ac1;
	//   34   59:aload_1         
	//   35   60:athrow          
	}

	public final void a(ai ai)
	{
		Object obj = a;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field Object a>
	//    2    4:astore          4
		obj;
	//    3    6:aload           4
		JVM INSTR monitorenter ;
	//    4    8:monitorenter    
		if(ai != null)
			break MISSING_BLOCK_LABEL_22;
	//    5    9:aload_1         
	//    6   10:ifnonnull       22
		g = null;
	//    7   13:aload_0         
	//    8   14:aconst_null     
	//    9   15:putfield        #117 <Field ai g>
		obj;
	//   10   18:aload           4
		JVM INSTR monitorexit ;
	//   11   20:monitorexit     
		return;
	//   12   21:return          
		boolean flag = k;
	//   13   22:aload_0         
	//   14   23:getfield        #101 <Field boolean k>
	//   15   26:istore_2        
		boolean flag1 = true;
	//   16   27:iconst_1        
	//   17   28:istore_3        
		if(!flag)
	//*  18   29:iload_2         
	//*  19   30:ifne            110
			flag = true;
	//   20   33:iconst_1        
	//   21   34:istore_2        
		else
	//*  22   35:goto            38
	//*  23   38:iload_2         
	//*  24   39:ldc1            #103 <String "Result has already been consumed.">
	//*  25   41:invokestatic    #108 <Method void am.a(boolean, Object)>
	//*  26   44:aload_0         
	//*  27   45:getfield        #219 <Field cc o>
	//*  28   48:ifnonnull       115
	//*  29   51:iload_3         
	//*  30   52:istore_2        
	//*  31   53:goto            56
	//*  32   56:iload_2         
	//*  33   57:ldc1            #246 <String "Cannot set callbacks if then() has been called.">
	//*  34   59:invokestatic    #108 <Method void am.a(boolean, Object)>
	//*  35   62:aload_0         
	//*  36   63:invokevirtual   #248 <Method boolean ab.d()>
	//*  37   66:ifeq            73
	//*  38   69:aload           4
	//*  39   71:monitorexit     
	//*  40   72:return          
	//*  41   73:aload_0         
	//*  42   74:invokevirtual   #111 <Method boolean f()>
	//*  43   77:ifeq            95
	//*  44   80:aload_0         
	//*  45   81:getfield        #85  <Field g b>
	//*  46   84:aload_1         
	//*  47   85:aload_0         
	//*  48   86:invokespecial   #156 <Method ah a()>
	//*  49   89:invokevirtual   #159 <Method void g.a(ai, ah)>
	//*  50   92:goto            100
	//*  51   95:aload_0         
	//*  52   96:aload_1         
	//*  53   97:putfield        #117 <Field ai g>
	//*  54  100:aload           4
	//*  55  102:monitorexit     
	//*  56  103:return          
	//*  57  104:astore_1        
	//*  58  105:aload           4
	//*  59  107:monitorexit     
	//*  60  108:aload_1         
	//*  61  109:athrow          
			flag = false;
	//   62  110:iconst_0        
	//   63  111:istore_2        
		am.a(flag, "Result has already been consumed.");
		if(o == null)
			flag = flag1;
		else
	//*  64  112:goto            38
			flag = false;
	//   65  115:iconst_0        
	//   66  116:istore_2        
		am.a(flag, "Cannot set callbacks if then() has been called.");
		if(!((ab)this).d())
			break MISSING_BLOCK_LABEL_73;
		obj;
		JVM INSTR monitorexit ;
		return;
		if(f())
		{
			b.a(ai, a());
			break MISSING_BLOCK_LABEL_100;
		}
		g = ai;
		obj;
		JVM INSTR monitorexit ;
		return;
		ai;
		obj;
		JVM INSTR monitorexit ;
		throw ai;
	//*  67  117:goto            56
	}

	public final void a(ci ci1)
	{
		h.set(((Object) (ci1)));
	//    0    0:aload_0         
	//    1    1:getfield        #70  <Field AtomicReference h>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #252 <Method void AtomicReference.set(Object)>
	//    4    8:return          
	}

	public final void b(ah ah1)
	{
		Object obj = a;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field Object a>
	//    2    4:astore          4
		obj;
	//    3    6:aload           4
		JVM INSTR monitorenter ;
	//    4    8:monitorenter    
		boolean flag;
		if(m || l)
			break MISSING_BLOCK_LABEL_79;
	//    5    9:aload_0         
	//    6   10:getfield        #254 <Field boolean m>
	//    7   13:ifne            79
	//    8   16:aload_0         
	//    9   17:getfield        #142 <Field boolean l>
	//   10   20:ifne            79
		f();
	//   11   23:aload_0         
	//   12   24:invokevirtual   #111 <Method boolean f()>
	//   13   27:pop             
		flag = f();
	//   14   28:aload_0         
	//   15   29:invokevirtual   #111 <Method boolean f()>
	//   16   32:istore_2        
		boolean flag1 = true;
	//   17   33:iconst_1        
	//   18   34:istore_3        
		if(!flag)
	//*  19   35:iload_2         
	//*  20   36:ifne            93
			flag = true;
	//   21   39:iconst_1        
	//   22   40:istore_2        
		else
	//*  23   41:goto            44
	//*  24   44:iload_2         
	//*  25   45:ldc2            #256 <String "Results have already been set">
	//*  26   48:invokestatic    #108 <Method void am.a(boolean, Object)>
	//*  27   51:aload_0         
	//*  28   52:getfield        #101 <Field boolean k>
	//*  29   55:ifne            98
	//*  30   58:iload_3         
	//*  31   59:istore_2        
	//*  32   60:goto            63
	//*  33   63:iload_2         
	//*  34   64:ldc2            #258 <String "Result has already been consumed">
	//*  35   67:invokestatic    #108 <Method void am.a(boolean, Object)>
	//*  36   70:aload_0         
	//*  37   71:aload_1         
	//*  38   72:invokespecial   #260 <Method void a(ah)>
	//*  39   75:aload           4
	//*  40   77:monitorexit     
	//*  41   78:return          
	//*  42   79:aload_1         
	//*  43   80:invokestatic    #262 <Method void c(ah)>
	//*  44   83:aload           4
	//*  45   85:monitorexit     
	//*  46   86:return          
	//*  47   87:astore_1        
	//*  48   88:aload           4
	//*  49   90:monitorexit     
	//*  50   91:aload_1         
	//*  51   92:athrow          
			flag = false;
	//   52   93:iconst_0        
	//   53   94:istore_2        
		am.a(flag, "Results have already been set");
		if(!k)
			flag = flag1;
		else
	//*  54   95:goto            44
			flag = false;
	//   55   98:iconst_0        
	//   56   99:istore_2        
		am.a(flag, "Result has already been consumed");
		a(ah1);
		obj;
		JVM INSTR monitorexit ;
		return;
		c(ah1);
		obj;
		JVM INSTR monitorexit ;
		return;
		ah1;
		obj;
		JVM INSTR monitorexit ;
		throw ah1;
	//*  57  100:goto            63
	}

	public void c()
	{
		Object obj = a;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field Object a>
	//    2    4:astore_1        
		obj;
	//    3    5:aload_1         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		if(l || k)
	//*   5    7:aload_0         
	//*   6    8:getfield        #142 <Field boolean l>
	//*   7   11:ifne            68
	//*   8   14:aload_0         
	//*   9   15:getfield        #101 <Field boolean k>
	//*  10   18:ifeq            24
			break MISSING_BLOCK_LABEL_68;
	//   11   21:goto            68
		ae ae1 = n;
	//   12   24:aload_0         
	//   13   25:getfield        #130 <Field ae n>
	//   14   28:astore_2        
		if(ae1 == null)
			break MISSING_BLOCK_LABEL_42;
	//   15   29:aload_2         
	//   16   30:ifnull          42
		Exception exception;
		try
		{
			n.a();
	//   17   33:aload_0         
	//   18   34:getfield        #130 <Field ae n>
	//   19   37:invokeinterface #267 <Method void ae.a()>
		}
	//*  20   42:aload_0         
	//*  21   43:getfield        #115 <Field ah i>
	//*  22   46:invokestatic    #262 <Method void c(ah)>
	//*  23   49:aload_0         
	//*  24   50:iconst_1        
	//*  25   51:putfield        #142 <Field boolean l>
	//*  26   54:aload_0         
	//*  27   55:aload_0         
	//*  28   56:getstatic       #269 <Field Status Status.e>
	//*  29   59:invokevirtual   #271 <Method ah a(Status)>
	//*  30   62:invokespecial   #260 <Method void a(ah)>
	//*  31   65:aload_1         
	//*  32   66:monitorexit     
	//*  33   67:return          
	//*  34   68:aload_1         
	//*  35   69:monitorexit     
	//*  36   70:return          
	//*  37   71:astore_2        
	//*  38   72:aload_1         
	//*  39   73:monitorexit     
	//*  40   74:aload_2         
	//*  41   75:athrow          
		catch(RemoteException remoteexception) { }
	//   42   76:astore_2        
		c(i);
		l = true;
		a(a(Status.e));
		obj;
		JVM INSTR monitorexit ;
		return;
		obj;
		JVM INSTR monitorexit ;
		return;
		exception;
		obj;
		JVM INSTR monitorexit ;
		throw exception;
	//*  43   77:goto            42
	}

	public final void c(Status status)
	{
		synchronized(a)
	//*   0    0:aload_0         
	//*   1    1:getfield        #53  <Field Object a>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
		{
			if(!f())
	//*   5    7:aload_0         
	//*   6    8:invokevirtual   #111 <Method boolean f()>
	//*   7   11:ifne            28
			{
				b(a(status));
	//    8   14:aload_0         
	//    9   15:aload_0         
	//   10   16:aload_1         
	//   11   17:invokevirtual   #271 <Method ah a(Status)>
	//   12   20:invokevirtual   #273 <Method void b(ah)>
				m = true;
	//   13   23:aload_0         
	//   14   24:iconst_1        
	//   15   25:putfield        #254 <Field boolean m>
			}
		}
	//   16   28:aload_2         
	//   17   29:monitorexit     
		return;
	//   18   30:return          
		status;
	//   19   31:astore_1        
		obj;
	//   20   32:aload_2         
		JVM INSTR monitorexit ;
	//   21   33:monitorexit     
		throw status;
	//   22   34:aload_1         
	//   23   35:athrow          
	}

	public boolean d()
	{
		boolean flag;
		synchronized(a)
	//*   0    0:aload_0         
	//*   1    1:getfield        #53  <Field Object a>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
		{
			flag = l;
	//    5    7:aload_0         
	//    6    8:getfield        #142 <Field boolean l>
	//    7   11:istore_1        
		}
	//    8   12:aload_2         
	//    9   13:monitorexit     
		return flag;
	//   10   14:iload_1         
	//   11   15:ireturn         
		exception;
	//   12   16:astore_3        
		obj;
	//   13   17:aload_2         
		JVM INSTR monitorexit ;
	//   14   18:monitorexit     
		throw exception;
	//   15   19:aload_3         
	//   16   20:athrow          
	}

	public final Integer e()
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public final boolean f()
	{
		return e.getCount() == 0L;
	//    0    0:aload_0         
	//    1    1:getfield        #60  <Field CountDownLatch e>
	//    2    4:invokevirtual   #278 <Method long CountDownLatch.getCount()>
	//    3    7:lconst_0        
	//    4    8:lcmp            
	//    5    9:ifne            14
	//    6   12:iconst_1        
	//    7   13:ireturn         
	//    8   14:iconst_0        
	//    9   15:ireturn         
	}

	public final boolean g()
	{
		boolean flag;
		synchronized(a)
	//*   0    0:aload_0         
	//*   1    1:getfield        #53  <Field Object a>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
		{
			if((w)d.get() == null || !p)
	//*   5    7:aload_0         
	//*   6    8:getfield        #92  <Field WeakReference d>
	//*   7   11:invokevirtual   #281 <Method Object WeakReference.get()>
	//*   8   14:checkcast       #96  <Class w>
	//*   9   17:ifnull          27
	//*  10   20:aload_0         
	//*  11   21:getfield        #72  <Field boolean p>
	//*  12   24:ifne            31
				((ab)this).c();
	//   13   27:aload_0         
	//   14   28:invokevirtual   #283 <Method void ab.c()>
			flag = ((ab)this).d();
	//   15   31:aload_0         
	//   16   32:invokevirtual   #248 <Method boolean ab.d()>
	//   17   35:istore_1        
		}
	//   18   36:aload_2         
	//   19   37:monitorexit     
		return flag;
	//   20   38:iload_1         
	//   21   39:ireturn         
		exception;
	//   22   40:astore_3        
		obj;
	//   23   41:aload_2         
		JVM INSTR monitorexit ;
	//   24   42:monitorexit     
		throw exception;
	//   25   43:aload_3         
	//   26   44:athrow          
	}

	public final void h()
	{
		boolean flag;
		if(!p && !((Boolean)c.get()).booleanValue())
	//*   0    0:aload_0         
	//*   1    1:getfield        #72  <Field boolean p>
	//*   2    4:ifne            30
	//*   3    7:getstatic       #45  <Field ThreadLocal c>
	//*   4   10:invokevirtual   #286 <Method Object ThreadLocal.get()>
	//*   5   13:checkcast       #288 <Class Boolean>
	//*   6   16:invokevirtual   #291 <Method boolean Boolean.booleanValue()>
	//*   7   19:ifeq            25
	//*   8   22:goto            30
			flag = false;
	//    9   25:iconst_0        
	//   10   26:istore_1        
		else
	//*  11   27:goto            32
			flag = true;
	//   12   30:iconst_1        
	//   13   31:istore_1        
		p = flag;
	//   14   32:aload_0         
	//   15   33:iload_1         
	//   16   34:putfield        #72  <Field boolean p>
	//   17   37:return          
	}

	static final ThreadLocal c = new cu();
	private final Object a;
	private final g b;
	private final WeakReference d;
	private final CountDownLatch e;
	private final ArrayList f;
	private ai g;
	private final AtomicReference h;
	private ah i;
	private Status j;
	private volatile boolean k;
	private boolean l;
	private boolean m;
	private h mResultGuardian;
	private ae n;
	private volatile cc o;
	private boolean p;

	static 
	{
	//    0    0:new             #40  <Class cu>
	//    1    3:dup             
	//    2    4:invokespecial   #43  <Method void cu()>
	//    3    7:putstatic       #45  <Field ThreadLocal c>
	//*   4   10:return          
	}
}
