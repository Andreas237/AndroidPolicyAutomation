// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import com.google.android.gms.common.util.PlatformVersion;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzgh, zznk, zzkb, zzni, 
//			zzakb, zzgj

public final class zzgg
{

	public zzgg()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #4   <Class Object>
	//    4    8:dup             
	//    5    9:invokespecial   #19  <Method void Object()>
	//    6   12:putfield        #21  <Field Object zzaho>
		zzahp = null;
	//    7   15:aload_0         
	//    8   16:aconst_null     
	//    9   17:putfield        #23  <Field zzgh zzahp>
		zzahq = false;
	//   10   20:aload_0         
	//   11   21:iconst_0        
	//   12   22:putfield        #25  <Field boolean zzahq>
	//   13   25:return          
	}

	public final Activity getActivity()
	{
label0:
		{
			synchronized(zzaho)
	//*   0    0:aload_0         
	//*   1    1:getfield        #21  <Field Object zzaho>
	//*   2    4:astore_1        
	//*   3    5:aload_1         
	//*   4    6:monitorenter    
			{
				if(PlatformVersion.isAtLeastIceCreamSandwich())
					break label0;
	//    5    7:invokestatic    #35  <Method boolean PlatformVersion.isAtLeastIceCreamSandwich()>
	//    6   10:ifne            17
			}
	//    7   13:aload_1         
	//    8   14:monitorexit     
			return null;
	//    9   15:aconst_null     
	//   10   16:areturn         
		}
		Activity activity;
		if(zzahp == null)
			break MISSING_BLOCK_LABEL_36;
	//   11   17:aload_0         
	//   12   18:getfield        #23  <Field zzgh zzahp>
	//   13   21:ifnull          36
		activity = zzahp.getActivity();
	//   14   24:aload_0         
	//   15   25:getfield        #23  <Field zzgh zzahp>
	//   16   28:invokevirtual   #39  <Method Activity zzgh.getActivity()>
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

	public final Context getContext()
	{
label0:
		{
			synchronized(zzaho)
	//*   0    0:aload_0         
	//*   1    1:getfield        #21  <Field Object zzaho>
	//*   2    4:astore_1        
	//*   3    5:aload_1         
	//*   4    6:monitorenter    
			{
				if(PlatformVersion.isAtLeastIceCreamSandwich())
					break label0;
	//    5    7:invokestatic    #35  <Method boolean PlatformVersion.isAtLeastIceCreamSandwich()>
	//    6   10:ifne            17
			}
	//    7   13:aload_1         
	//    8   14:monitorexit     
			return null;
	//    9   15:aconst_null     
	//   10   16:areturn         
		}
		Context context;
		if(zzahp == null)
			break MISSING_BLOCK_LABEL_36;
	//   11   17:aload_0         
	//   12   18:getfield        #23  <Field zzgh zzahp>
	//   13   21:ifnull          36
		context = zzahp.getContext();
	//   14   24:aload_0         
	//   15   25:getfield        #23  <Field zzgh zzahp>
	//   16   28:invokevirtual   #44  <Method Context zzgh.getContext()>
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

	public final void initialize(Context context)
	{
label0:
		{
			synchronized(zzaho)
	//*   0    0:aload_0         
	//*   1    1:getfield        #21  <Field Object zzaho>
	//*   2    4:astore          5
	//*   3    6:aload           5
	//*   4    8:monitorenter    
			{
				if(zzahq)
					break MISSING_BLOCK_LABEL_125;
	//    5    9:aload_0         
	//    6   10:getfield        #25  <Field boolean zzahq>
	//    7   13:ifne            125
				if(PlatformVersion.isAtLeastIceCreamSandwich())
					break label0;
	//    8   16:invokestatic    #35  <Method boolean PlatformVersion.isAtLeastIceCreamSandwich()>
	//    9   19:ifne            26
			}
	//   10   22:aload           5
	//   11   24:monitorexit     
			return;
	//   12   25:return          
		}
		zzna zzna = zznk.zzayg;
	//   13   26:getstatic       #52  <Field zzna zznk.zzayg>
	//   14   29:astore_2        
		if(((Boolean)zzkb.zzik().zzd(zzna)).booleanValue())
			break MISSING_BLOCK_LABEL_50;
	//   15   30:invokestatic    #58  <Method zzni zzkb.zzik()>
	//   16   33:aload_2         
	//   17   34:invokevirtual   #64  <Method Object zzni.zzd(zzna)>
	//   18   37:checkcast       #66  <Class Boolean>
	//   19   40:invokevirtual   #69  <Method boolean Boolean.booleanValue()>
	//   20   43:ifne            50
		obj;
	//   21   46:aload           5
		JVM INSTR monitorexit ;
	//   22   48:monitorexit     
		return;
	//   23   49:return          
		Application application = null;
	//   24   50:aconst_null     
	//   25   51:astore_3        
		Context context2 = context.getApplicationContext();
	//   26   52:aload_1         
	//   27   53:invokevirtual   #74  <Method Context Context.getApplicationContext()>
	//   28   56:astore          4
		Context context1;
		context1 = context2;
	//   29   58:aload           4
	//   30   60:astore_2        
		if(context2 == null)
	//*  31   61:aload           4
	//*  32   63:ifnonnull       68
			context1 = context;
	//   33   66:aload_1         
	//   34   67:astore_2        
		if(context1 instanceof Application)
	//*  35   68:aload_2         
	//*  36   69:instanceof      #76  <Class Application>
	//*  37   72:ifeq            80
			application = (Application)context1;
	//   38   75:aload_2         
	//   39   76:checkcast       #76  <Class Application>
	//   40   79:astore_3        
		if(application != null)
			break MISSING_BLOCK_LABEL_93;
	//   41   80:aload_3         
	//   42   81:ifnonnull       93
		zzakb.zzdk("Can not cast Context to Application");
	//   43   84:ldc1            #78  <String "Can not cast Context to Application">
	//   44   86:invokestatic    #84  <Method void zzakb.zzdk(String)>
		obj;
	//   45   89:aload           5
		JVM INSTR monitorexit ;
	//   46   91:monitorexit     
		return;
	//   47   92:return          
		if(zzahp == null)
	//*  48   93:aload_0         
	//*  49   94:getfield        #23  <Field zzgh zzahp>
	//*  50   97:ifnonnull       111
			zzahp = new zzgh();
	//   51  100:aload_0         
	//   52  101:new             #37  <Class zzgh>
	//   53  104:dup             
	//   54  105:invokespecial   #85  <Method void zzgh()>
	//   55  108:putfield        #23  <Field zzgh zzahp>
		zzahp.zza(application, context);
	//   56  111:aload_0         
	//   57  112:getfield        #23  <Field zzgh zzahp>
	//   58  115:aload_3         
	//   59  116:aload_1         
	//   60  117:invokevirtual   #89  <Method void zzgh.zza(Application, Context)>
		zzahq = true;
	//   61  120:aload_0         
	//   62  121:iconst_1        
	//   63  122:putfield        #25  <Field boolean zzahq>
		obj;
	//   64  125:aload           5
		JVM INSTR monitorexit ;
	//   65  127:monitorexit     
		return;
	//   66  128:return          
		context;
	//   67  129:astore_1        
		obj;
	//   68  130:aload           5
		JVM INSTR monitorexit ;
	//   69  132:monitorexit     
		throw context;
	//   70  133:aload_1         
	//   71  134:athrow          
	}

	public final void zza(zzgj zzgj)
	{
label0:
		{
			synchronized(zzaho)
	//*   0    0:aload_0         
	//*   1    1:getfield        #21  <Field Object zzaho>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
			{
				if(PlatformVersion.isAtLeastIceCreamSandwich())
					break label0;
	//    5    7:invokestatic    #35  <Method boolean PlatformVersion.isAtLeastIceCreamSandwich()>
	//    6   10:ifne            16
			}
	//    7   13:aload_2         
	//    8   14:monitorexit     
			return;
	//    9   15:return          
		}
		zzna zzna = zznk.zzayg;
	//   10   16:getstatic       #52  <Field zzna zznk.zzayg>
	//   11   19:astore_3        
		if(((Boolean)zzkb.zzik().zzd(zzna)).booleanValue())
			break MISSING_BLOCK_LABEL_39;
	//   12   20:invokestatic    #58  <Method zzni zzkb.zzik()>
	//   13   23:aload_3         
	//   14   24:invokevirtual   #64  <Method Object zzni.zzd(zzna)>
	//   15   27:checkcast       #66  <Class Boolean>
	//   16   30:invokevirtual   #69  <Method boolean Boolean.booleanValue()>
	//   17   33:ifne            39
		obj;
	//   18   36:aload_2         
		JVM INSTR monitorexit ;
	//   19   37:monitorexit     
		return;
	//   20   38:return          
		if(zzahp == null)
	//*  21   39:aload_0         
	//*  22   40:getfield        #23  <Field zzgh zzahp>
	//*  23   43:ifnonnull       57
			zzahp = new zzgh();
	//   24   46:aload_0         
	//   25   47:new             #37  <Class zzgh>
	//   26   50:dup             
	//   27   51:invokespecial   #85  <Method void zzgh()>
	//   28   54:putfield        #23  <Field zzgh zzahp>
		zzahp.zza(zzgj);
	//   29   57:aload_0         
	//   30   58:getfield        #23  <Field zzgh zzahp>
	//   31   61:aload_1         
	//   32   62:invokevirtual   #92  <Method void zzgh.zza(zzgj)>
		obj;
	//   33   65:aload_2         
		JVM INSTR monitorexit ;
	//   34   66:monitorexit     
		return;
	//   35   67:return          
		zzgj;
	//   36   68:astore_1        
		obj;
	//   37   69:aload_2         
		JVM INSTR monitorexit ;
	//   38   70:monitorexit     
		throw zzgj;
	//   39   71:aload_1         
	//   40   72:athrow          
	}

	private final Object zzaho = new Object();
	private zzgh zzahp;
	private boolean zzahq;
}
