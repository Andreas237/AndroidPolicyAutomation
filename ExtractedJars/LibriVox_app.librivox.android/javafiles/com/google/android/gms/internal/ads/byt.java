// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.reward.c;
import com.google.android.gms.c.d;

// Referenced classes of package com.google.android.gms.internal.ads:
//			kl, uh, bwi, bwk, 
//			bwj, tu, jr, bwg, 
//			bxu, byu, aag, byw

public final class byt
{

	private byt()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
	//    2    4:return          
	}

	public static byt a()
	{
		byt byt1;
		synchronized(b)
	//*   0    0:getstatic       #23  <Field Object b>
	//*   1    3:astore_0        
	//*   2    4:aload_0         
	//*   3    5:monitorenter    
		{
			if(a == null)
	//*   4    6:getstatic       #27  <Field byt a>
	//*   5    9:ifnonnull       22
				a = new byt();
	//    6   12:new             #2   <Class byt>
	//    7   15:dup             
	//    8   16:invokespecial   #28  <Method void byt()>
	//    9   19:putstatic       #27  <Field byt a>
			byt1 = a;
	//   10   22:getstatic       #27  <Field byt a>
	//   11   25:astore_1        
		}
	//   12   26:aload_0         
	//   13   27:monitorexit     
		return byt1;
	//   14   28:aload_1         
	//   15   29:areturn         
		exception;
	//   16   30:astore_1        
		obj;
	//   17   31:aload_0         
		JVM INSTR monitorexit ;
	//   18   32:monitorexit     
		throw exception;
	//   19   33:aload_1         
	//   20   34:athrow          
	}

	public final c a(Context context)
	{
label0:
		{
			synchronized(b)
	//*   0    0:getstatic       #23  <Field Object b>
	//*   1    3:astore_2        
	//*   2    4:aload_2         
	//*   3    5:monitorenter    
			{
				if(d == null)
					break label0;
	//    4    6:aload_0         
	//    5    7:getfield        #31  <Field c d>
	//    6   10:ifnull          22
				context = ((Context) (d));
	//    7   13:aload_0         
	//    8   14:getfield        #31  <Field c d>
	//    9   17:astore_1        
			}
	//   10   18:aload_2         
	//   11   19:monitorexit     
			return ((c) (context));
	//   12   20:aload_1         
	//   13   21:areturn         
		}
		kl kl1 = new kl();
	//   14   22:new             #33  <Class kl>
	//   15   25:dup             
	//   16   26:invokespecial   #34  <Method void kl()>
	//   17   29:astore_3        
		d = ((c) (new uh(context, (tu)((bwj) (new bwi(bwk.b(), context, ((km) (kl1))))).a(context, false))));
	//   18   30:aload_0         
	//   19   31:new             #36  <Class uh>
	//   20   34:dup             
	//   21   35:aload_1         
	//   22   36:new             #38  <Class bwi>
	//   23   39:dup             
	//   24   40:invokestatic    #43  <Method bwa bwk.b()>
	//   25   43:aload_1         
	//   26   44:aload_3         
	//   27   45:invokespecial   #46  <Method void bwi(bwa, Context, km)>
	//   28   48:aload_1         
	//   29   49:iconst_0        
	//   30   50:invokevirtual   #51  <Method Object bwj.a(Context, boolean)>
	//   31   53:checkcast       #53  <Class tu>
	//   32   56:invokespecial   #56  <Method void uh(Context, tu)>
	//   33   59:putfield        #31  <Field c d>
		context = ((Context) (d));
	//   34   62:aload_0         
	//   35   63:getfield        #31  <Field c d>
	//   36   66:astore_1        
		obj;
	//   37   67:aload_2         
		JVM INSTR monitorexit ;
	//   38   68:monitorexit     
		return ((c) (context));
	//   39   69:aload_1         
	//   40   70:areturn         
		context;
	//   41   71:astore_1        
		obj;
	//   42   72:aload_2         
		JVM INSTR monitorexit ;
	//   43   73:monitorexit     
		throw context;
	//   44   74:aload_1         
	//   45   75:athrow          
	}

	public final void a(Context context, String s, byw byw)
	{
label0:
		{
			synchronized(b)
	//*   0    0:getstatic       #23  <Field Object b>
	//*   1    3:astore_3        
	//*   2    4:aload_3         
	//*   3    5:monitorenter    
			{
				if(c == null)
					break label0;
	//    4    6:aload_0         
	//    5    7:getfield        #61  <Field bxu c>
	//    6   10:ifnull          16
			}
	//    7   13:aload_3         
	//    8   14:monitorexit     
			return;
	//    9   15:return          
		}
		if(context == null)
			break MISSING_BLOCK_LABEL_131;
	//   10   16:aload_1         
	//   11   17:ifnull          131
		Bundle bundle = new Bundle();
	//   12   20:new             #63  <Class Bundle>
	//   13   23:dup             
	//   14   24:invokespecial   #64  <Method void Bundle()>
	//   15   27:astore          4
		bundle.putBoolean("measurementEnabled", false);
	//   16   29:aload           4
	//   17   31:ldc1            #66  <String "measurementEnabled">
	//   18   33:iconst_0        
	//   19   34:invokevirtual   #70  <Method void Bundle.putBoolean(String, boolean)>
		jr.a(context, s, bundle);
	//   20   37:aload_1         
	//   21   38:aload_2         
	//   22   39:aload           4
	//   23   41:invokestatic    #75  <Method void jr.a(Context, String, Bundle)>
		c = (bxu)((bwj) (new bwg(bwk.b(), context))).a(context, false);
	//   24   44:aload_0         
	//   25   45:new             #77  <Class bwg>
	//   26   48:dup             
	//   27   49:invokestatic    #43  <Method bwa bwk.b()>
	//   28   52:aload_1         
	//   29   53:invokespecial   #80  <Method void bwg(bwa, Context)>
	//   30   56:aload_1         
	//   31   57:iconst_0        
	//   32   58:invokevirtual   #51  <Method Object bwj.a(Context, boolean)>
	//   33   61:checkcast       #82  <Class bxu>
	//   34   64:putfield        #61  <Field bxu c>
		c.a();
	//   35   67:aload_0         
	//   36   68:getfield        #61  <Field bxu c>
	//   37   71:invokeinterface #84  <Method void bxu.a()>
		c.a(((km) (new kl())));
	//   38   76:aload_0         
	//   39   77:getfield        #61  <Field bxu c>
	//   40   80:new             #33  <Class kl>
	//   41   83:dup             
	//   42   84:invokespecial   #34  <Method void kl()>
	//   43   87:invokeinterface #87  <Method void bxu.a(km)>
		if(s == null)
			break MISSING_BLOCK_LABEL_128;
	//   44   92:aload_2         
	//   45   93:ifnull          128
		try
		{
			c.a(s, com.google.android.gms.c.d.a(((Object) (new byu(this, context)))));
	//   46   96:aload_0         
	//   47   97:getfield        #61  <Field bxu c>
	//   48  100:aload_2         
	//   49  101:new             #89  <Class byu>
	//   50  104:dup             
	//   51  105:aload_0         
	//   52  106:aload_1         
	//   53  107:invokespecial   #92  <Method void byu(byt, Context)>
	//   54  110:invokestatic    #97  <Method com.google.android.gms.c.a d.a(Object)>
	//   55  113:invokeinterface #100 <Method void bxu.a(String, com.google.android.gms.c.a)>
			break MISSING_BLOCK_LABEL_128;
	//   56  118:goto            128
		}
		// Misplaced declaration of an exception variable
		catch(Context context) { }
	//   57  121:astore_1        
		com.google.android.gms.internal.ads.aag.c("MobileAdsSettingManager initialization failed", ((Throwable) (context)));
	//   58  122:ldc1            #102 <String "MobileAdsSettingManager initialization failed">
	//   59  124:aload_1         
	//   60  125:invokestatic    #107 <Method void com.google.android.gms.internal.ads.aag.c(String, Throwable)>
		byw;
	//   61  128:aload_3         
		JVM INSTR monitorexit ;
	//   62  129:monitorexit     
		return;
	//   63  130:return          
		throw new IllegalArgumentException("Context cannot be null.");
	//   64  131:new             #109 <Class IllegalArgumentException>
	//   65  134:dup             
	//   66  135:ldc1            #111 <String "Context cannot be null.">
	//   67  137:invokespecial   #114 <Method void IllegalArgumentException(String)>
	//   68  140:athrow          
		context;
	//   69  141:astore_1        
		byw;
	//   70  142:aload_3         
		JVM INSTR monitorexit ;
	//   71  143:monitorexit     
		throw context;
	//   72  144:aload_1         
	//   73  145:athrow          
	}

	private static byt a;
	private static final Object b = new Object();
	private bxu c;
	private c d;

	static 
	{
	//    0    0:new             #4   <Class Object>
	//    1    3:dup             
	//    2    4:invokespecial   #21  <Method void Object()>
	//    3    7:putstatic       #23  <Field Object b>
	//*   4   10:return          
	}
}
