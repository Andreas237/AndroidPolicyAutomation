// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.ConditionVariable;
import com.google.android.gms.common.GooglePlayServicesUtilLight;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzkb, zznj, zzaml, zzna

public final class zzni
{

	public zzni()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #4   <Class Object>
	//    4    8:dup             
	//    5    9:invokespecial   #21  <Method void Object()>
	//    6   12:putfield        #23  <Field Object mLock>
	//    7   15:aload_0         
	//    8   16:new             #25  <Class ConditionVariable>
	//    9   19:dup             
	//   10   20:invokespecial   #26  <Method void ConditionVariable()>
	//   11   23:putfield        #28  <Field ConditionVariable zzatv>
		zzzv = false;
	//   12   26:aload_0         
	//   13   27:iconst_0        
	//   14   28:putfield        #30  <Field boolean zzzv>
		zzatw = null;
	//   15   31:aload_0         
	//   16   32:aconst_null     
	//   17   33:putfield        #32  <Field SharedPreferences zzatw>
	//   18   36:return          
	}

	static SharedPreferences zza(zzni zzni1)
	{
		return zzni1.zzatw;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field SharedPreferences zzatw>
	//    2    4:areturn         
	}

	public final void initialize(Context context)
	{
label0:
		{
			if(zzzv)
	//*   0    0:aload_0         
	//*   1    1:getfield        #30  <Field boolean zzzv>
	//*   2    4:ifeq            8
				return;
	//    3    7:return          
			synchronized(mLock)
	//*   4    8:aload_0         
	//*   5    9:getfield        #23  <Field Object mLock>
	//*   6   12:astore          4
	//*   7   14:aload           4
	//*   8   16:monitorenter    
			{
				if(!zzzv)
					break label0;
	//    9   17:aload_0         
	//   10   18:getfield        #30  <Field boolean zzzv>
	//   11   21:ifeq            28
			}
	//   12   24:aload           4
	//   13   26:monitorexit     
			return;
	//   14   27:return          
		}
		Context context1;
		if(context.getApplicationContext() == null)
	//*  15   28:aload_1         
	//*  16   29:invokevirtual   #43  <Method Context Context.getApplicationContext()>
	//*  17   32:ifnonnull       40
		{
			context1 = context;
	//   18   35:aload_1         
	//   19   36:astore_2        
			break MISSING_BLOCK_LABEL_45;
	//   20   37:goto            45
		}
		context1 = context.getApplicationContext();
	//   21   40:aload_1         
	//   22   41:invokevirtual   #43  <Method Context Context.getApplicationContext()>
	//   23   44:astore_2        
		zzatx = context1;
	//   24   45:aload_0         
	//   25   46:aload_2         
	//   26   47:putfield        #45  <Field Context zzatx>
		Context context2 = GooglePlayServicesUtilLight.getRemoteContext(context);
	//   27   50:aload_1         
	//   28   51:invokestatic    #51  <Method Context GooglePlayServicesUtilLight.getRemoteContext(Context)>
	//   29   54:astore_3        
		context1 = context2;
	//   30   55:aload_3         
	//   31   56:astore_2        
		if(context2 != null)
			break MISSING_BLOCK_LABEL_80;
	//   32   57:aload_3         
	//   33   58:ifnonnull       80
		context1 = context2;
	//   34   61:aload_3         
	//   35   62:astore_2        
		if(context == null)
			break MISSING_BLOCK_LABEL_80;
	//   36   63:aload_1         
	//   37   64:ifnull          80
		context2 = context.getApplicationContext();
	//   38   67:aload_1         
	//   39   68:invokevirtual   #43  <Method Context Context.getApplicationContext()>
	//   40   71:astore_3        
		context1 = context2;
	//   41   72:aload_3         
	//   42   73:astore_2        
		if(context2 == null)
	//*  43   74:aload_3         
	//*  44   75:ifnonnull       80
			context1 = context;
	//   45   78:aload_1         
	//   46   79:astore_2        
		if(context1 != null)
			break MISSING_BLOCK_LABEL_95;
	//   47   80:aload_2         
	//   48   81:ifnonnull       95
		zzatv.open();
	//   49   84:aload_0         
	//   50   85:getfield        #28  <Field ConditionVariable zzatv>
	//   51   88:invokevirtual   #54  <Method void ConditionVariable.open()>
		obj;
	//   52   91:aload           4
		JVM INSTR monitorexit ;
	//   53   93:monitorexit     
		return;
	//   54   94:return          
		zzkb.zzii();
	//   55   95:invokestatic    #60  <Method zznh zzkb.zzii()>
	//   56   98:pop             
		zzatw = context1.getSharedPreferences("google_ads_flags", 0);
	//   57   99:aload_0         
	//   58  100:aload_2         
	//   59  101:ldc1            #62  <String "google_ads_flags">
	//   60  103:iconst_0        
	//   61  104:invokevirtual   #66  <Method SharedPreferences Context.getSharedPreferences(String, int)>
	//   62  107:putfield        #32  <Field SharedPreferences zzatw>
		zzzv = true;
	//   63  110:aload_0         
	//   64  111:iconst_1        
	//   65  112:putfield        #30  <Field boolean zzzv>
		zzatv.open();
	//   66  115:aload_0         
	//   67  116:getfield        #28  <Field ConditionVariable zzatv>
	//   68  119:invokevirtual   #54  <Method void ConditionVariable.open()>
		obj;
	//   69  122:aload           4
		JVM INSTR monitorexit ;
	//   70  124:monitorexit     
		return;
	//   71  125:return          
		context;
	//   72  126:astore_1        
		zzatv.open();
	//   73  127:aload_0         
	//   74  128:getfield        #28  <Field ConditionVariable zzatv>
	//   75  131:invokevirtual   #54  <Method void ConditionVariable.open()>
		throw context;
	//   76  134:aload_1         
	//   77  135:athrow          
		context;
	//   78  136:astore_1        
		obj;
	//   79  137:aload           4
		JVM INSTR monitorexit ;
	//   80  139:monitorexit     
		throw context;
	//   81  140:aload_1         
	//   82  141:athrow          
	}

	public final Object zzd(zzna zzna1)
	{
		if(!zzatv.block(5000L))
	//*   0    0:aload_0         
	//*   1    1:getfield        #28  <Field ConditionVariable zzatv>
	//*   2    4:ldc2w           #69  <Long 5000L>
	//*   3    7:invokevirtual   #74  <Method boolean ConditionVariable.block(long)>
	//*   4   10:ifne            23
			throw new IllegalStateException("Flags.initialize() was not called!");
	//    5   13:new             #76  <Class IllegalStateException>
	//    6   16:dup             
	//    7   17:ldc1            #78  <String "Flags.initialize() was not called!">
	//    8   19:invokespecial   #81  <Method void IllegalStateException(String)>
	//    9   22:athrow          
		if(zzzv && zzatw != null) goto _L2; else goto _L1
	//   10   23:aload_0         
	//   11   24:getfield        #30  <Field boolean zzzv>
	//   12   27:ifeq            37
	//   13   30:aload_0         
	//   14   31:getfield        #32  <Field SharedPreferences zzatw>
	//   15   34:ifnonnull       63
_L1:
		Object obj = mLock;
	//   16   37:aload_0         
	//   17   38:getfield        #23  <Field Object mLock>
	//   18   41:astore_2        
		obj;
	//   19   42:aload_2         
		JVM INSTR monitorenter ;
	//   20   43:monitorenter    
		if(!zzzv || zzatw == null)
	//*  21   44:aload_0         
	//*  22   45:getfield        #30  <Field boolean zzzv>
	//*  23   48:ifeq            80
	//*  24   51:aload_0         
	//*  25   52:getfield        #32  <Field SharedPreferences zzatw>
	//*  26   55:ifnonnull       61
			break MISSING_BLOCK_LABEL_80;
	//   27   58:goto            80
		obj;
	//   28   61:aload_2         
		JVM INSTR monitorexit ;
	//   29   62:monitorexit     
_L2:
		return zzaml.zza(zzatx, ((java.util.concurrent.Callable) (new zznj(this, zzna1))));
	//   30   63:aload_0         
	//   31   64:getfield        #45  <Field Context zzatx>
	//   32   67:new             #83  <Class zznj>
	//   33   70:dup             
	//   34   71:aload_0         
	//   35   72:aload_1         
	//   36   73:invokespecial   #86  <Method void zznj(zzni, zzna)>
	//   37   76:invokestatic    #91  <Method Object zzaml.zza(Context, java.util.concurrent.Callable)>
	//   38   79:areturn         
		zzna1 = ((zzna) (zzna1.zzja()));
	//   39   80:aload_1         
	//   40   81:invokevirtual   #97  <Method Object zzna.zzja()>
	//   41   84:astore_1        
		obj;
	//   42   85:aload_2         
		JVM INSTR monitorexit ;
	//   43   86:monitorexit     
		return ((Object) (zzna1));
	//   44   87:aload_1         
	//   45   88:areturn         
		zzna1;
	//   46   89:astore_1        
		obj;
	//   47   90:aload_2         
		JVM INSTR monitorexit ;
	//   48   91:monitorexit     
		throw zzna1;
	//   49   92:aload_1         
	//   50   93:athrow          
	}

	private final Object mLock = new Object();
	private final ConditionVariable zzatv = new ConditionVariable();
	private SharedPreferences zzatw;
	private Context zzatx;
	private volatile boolean zzzv;
}
