// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import com.google.android.gms.common.util.o;

// Referenced classes of package com.google.android.gms.internal.ads:
//			bqm, wx, bqo

public final class bql
{

	public bql()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #4   <Class Object>
	//    4    8:dup             
	//    5    9:invokespecial   #19  <Method void Object()>
	//    6   12:putfield        #21  <Field Object a>
		b = null;
	//    7   15:aload_0         
	//    8   16:aconst_null     
	//    9   17:putfield        #23  <Field bqm b>
		c = false;
	//   10   20:aload_0         
	//   11   21:iconst_0        
	//   12   22:putfield        #25  <Field boolean c>
	//   13   25:return          
	}

	public final Activity a()
	{
label0:
		{
			synchronized(a)
	//*   0    0:aload_0         
	//*   1    1:getfield        #21  <Field Object a>
	//*   2    4:astore_1        
	//*   3    5:aload_1         
	//*   4    6:monitorenter    
			{
				if(o.a())
					break label0;
	//    5    7:invokestatic    #32  <Method boolean o.a()>
	//    6   10:ifne            17
			}
	//    7   13:aload_1         
	//    8   14:monitorexit     
			return null;
	//    9   15:aconst_null     
	//   10   16:areturn         
		}
		Activity activity;
		if(b == null)
			break MISSING_BLOCK_LABEL_36;
	//   11   17:aload_0         
	//   12   18:getfield        #23  <Field bqm b>
	//   13   21:ifnull          36
		activity = b.a();
	//   14   24:aload_0         
	//   15   25:getfield        #23  <Field bqm b>
	//   16   28:invokevirtual   #36  <Method Activity bqm.a()>
	//   17   31:astore_2        
	//*  18   32:aload_1         
	//*  19   33:monitorexit     
		return activity;
	//   20   34:aload_2         
	//   21   35:areturn         
		obj;
	//   22   36:aload_1         
		JVM INSTR monitorexit ;
	//   23   37:monitorexit     
		return null;
	//   24   38:aconst_null     
	//   25   39:areturn         
		exception;
	//   26   40:astore_2        
		obj;
	//   27   41:aload_1         
		JVM INSTR monitorexit ;
	//   28   42:monitorexit     
		throw exception;
	//   29   43:aload_2         
	//   30   44:athrow          
	}

	public final void a(Context context)
	{
		Application application;
label0:
		{
			synchronized(a)
	//*   0    0:aload_0         
	//*   1    1:getfield        #21  <Field Object a>
	//*   2    4:astore          5
	//*   3    6:aload           5
	//*   4    8:monitorenter    
			{
				if(c)
					break MISSING_BLOCK_LABEL_101;
	//    5    9:aload_0         
	//    6   10:getfield        #25  <Field boolean c>
	//    7   13:ifne            101
				if(o.a())
					break label0;
	//    8   16:invokestatic    #32  <Method boolean o.a()>
	//    9   19:ifne            26
			}
	//   10   22:aload           5
	//   11   24:monitorexit     
			return;
	//   12   25:return          
		}
		application = null;
	//   13   26:aconst_null     
	//   14   27:astore_3        
		Context context2 = context.getApplicationContext();
	//   15   28:aload_1         
	//   16   29:invokevirtual   #43  <Method Context Context.getApplicationContext()>
	//   17   32:astore          4
		Context context1;
		context1 = context2;
	//   18   34:aload           4
	//   19   36:astore_2        
		if(context2 == null)
	//*  20   37:aload           4
	//*  21   39:ifnonnull       44
			context1 = context;
	//   22   42:aload_1         
	//   23   43:astore_2        
		if(context1 instanceof Application)
	//*  24   44:aload_2         
	//*  25   45:instanceof      #45  <Class Application>
	//*  26   48:ifeq            56
			application = (Application)context1;
	//   27   51:aload_2         
	//   28   52:checkcast       #45  <Class Application>
	//   29   55:astore_3        
		if(application != null)
			break MISSING_BLOCK_LABEL_69;
	//   30   56:aload_3         
	//   31   57:ifnonnull       69
		wx.e("Can not cast Context to Application");
	//   32   60:ldc1            #47  <String "Can not cast Context to Application">
	//   33   62:invokestatic    #53  <Method void wx.e(String)>
		obj;
	//   34   65:aload           5
		JVM INSTR monitorexit ;
	//   35   67:monitorexit     
		return;
	//   36   68:return          
		if(b == null)
	//*  37   69:aload_0         
	//*  38   70:getfield        #23  <Field bqm b>
	//*  39   73:ifnonnull       87
			b = new bqm();
	//   40   76:aload_0         
	//   41   77:new             #34  <Class bqm>
	//   42   80:dup             
	//   43   81:invokespecial   #54  <Method void bqm()>
	//   44   84:putfield        #23  <Field bqm b>
		b.a(application, context);
	//   45   87:aload_0         
	//   46   88:getfield        #23  <Field bqm b>
	//   47   91:aload_3         
	//   48   92:aload_1         
	//   49   93:invokevirtual   #57  <Method void bqm.a(Application, Context)>
		c = true;
	//   50   96:aload_0         
	//   51   97:iconst_1        
	//   52   98:putfield        #25  <Field boolean c>
		obj;
	//   53  101:aload           5
		JVM INSTR monitorexit ;
	//   54  103:monitorexit     
		return;
	//   55  104:return          
		context;
	//   56  105:astore_1        
		obj;
	//   57  106:aload           5
		JVM INSTR monitorexit ;
	//   58  108:monitorexit     
		throw context;
	//   59  109:aload_1         
	//   60  110:athrow          
	}

	public final void a(bqo bqo)
	{
label0:
		{
			synchronized(a)
	//*   0    0:aload_0         
	//*   1    1:getfield        #21  <Field Object a>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
			{
				if(o.a())
					break label0;
	//    5    7:invokestatic    #32  <Method boolean o.a()>
	//    6   10:ifne            16
			}
	//    7   13:aload_2         
	//    8   14:monitorexit     
			return;
	//    9   15:return          
		}
		if(b == null)
	//*  10   16:aload_0         
	//*  11   17:getfield        #23  <Field bqm b>
	//*  12   20:ifnonnull       34
			b = new bqm();
	//   13   23:aload_0         
	//   14   24:new             #34  <Class bqm>
	//   15   27:dup             
	//   16   28:invokespecial   #54  <Method void bqm()>
	//   17   31:putfield        #23  <Field bqm b>
		b.a(bqo);
	//   18   34:aload_0         
	//   19   35:getfield        #23  <Field bqm b>
	//   20   38:aload_1         
	//   21   39:invokevirtual   #60  <Method void bqm.a(bqo)>
		obj;
	//   22   42:aload_2         
		JVM INSTR monitorexit ;
	//   23   43:monitorexit     
		return;
	//   24   44:return          
		bqo;
	//   25   45:astore_1        
		obj;
	//   26   46:aload_2         
		JVM INSTR monitorexit ;
	//   27   47:monitorexit     
		throw bqo;
	//   28   48:aload_1         
	//   29   49:athrow          
	}

	public final Context b()
	{
label0:
		{
			synchronized(a)
	//*   0    0:aload_0         
	//*   1    1:getfield        #21  <Field Object a>
	//*   2    4:astore_1        
	//*   3    5:aload_1         
	//*   4    6:monitorenter    
			{
				if(o.a())
					break label0;
	//    5    7:invokestatic    #32  <Method boolean o.a()>
	//    6   10:ifne            17
			}
	//    7   13:aload_1         
	//    8   14:monitorexit     
			return null;
	//    9   15:aconst_null     
	//   10   16:areturn         
		}
		Context context;
		if(b == null)
			break MISSING_BLOCK_LABEL_36;
	//   11   17:aload_0         
	//   12   18:getfield        #23  <Field bqm b>
	//   13   21:ifnull          36
		context = b.b();
	//   14   24:aload_0         
	//   15   25:getfield        #23  <Field bqm b>
	//   16   28:invokevirtual   #62  <Method Context bqm.b()>
	//   17   31:astore_2        
	//*  18   32:aload_1         
	//*  19   33:monitorexit     
		return context;
	//   20   34:aload_2         
	//   21   35:areturn         
		obj;
	//   22   36:aload_1         
		JVM INSTR monitorexit ;
	//   23   37:monitorexit     
		return null;
	//   24   38:aconst_null     
	//   25   39:areturn         
		exception;
	//   26   40:astore_2        
		obj;
	//   27   41:aload_1         
		JVM INSTR monitorexit ;
	//   28   42:monitorexit     
		throw exception;
	//   29   43:aload_2         
	//   30   44:athrow          
	}

	private final Object a = new Object();
	private bqm b;
	private boolean c;
}
