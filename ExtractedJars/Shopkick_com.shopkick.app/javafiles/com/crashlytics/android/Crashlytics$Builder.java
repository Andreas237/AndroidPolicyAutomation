// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android;

import com.crashlytics.android.answers.Answers;
import com.crashlytics.android.beta.Beta;
import com.crashlytics.android.core.CrashlyticsCore;
import com.crashlytics.android.core.CrashlyticsListener;
import com.crashlytics.android.core.PinningInfoProvider;

// Referenced classes of package com.crashlytics.android:
//			Crashlytics

public static class Crashlytics$Builder
{

	private com.crashlytics.android.core.der getCoreBuilder()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		com.crashlytics.android.core.der der;
		if(coreBuilder == null)
	//*   2    2:aload_0         
	//*   3    3:getfield        #24  <Field com.crashlytics.android.core.CrashlyticsCore$Builder coreBuilder>
	//*   4    6:ifnonnull       20
			coreBuilder = new com.crashlytics.android.core.der();
	//    5    9:aload_0         
	//    6   10:new             #26  <Class com.crashlytics.android.core.CrashlyticsCore$Builder>
	//    7   13:dup             
	//    8   14:invokespecial   #27  <Method void com.crashlytics.android.core.CrashlyticsCore$Builder()>
	//    9   17:putfield        #24  <Field com.crashlytics.android.core.CrashlyticsCore$Builder coreBuilder>
		der = coreBuilder;
	//   10   20:aload_0         
	//   11   21:getfield        #24  <Field com.crashlytics.android.core.CrashlyticsCore$Builder coreBuilder>
	//   12   24:astore_1        
		this;
	//   13   25:aload_0         
		JVM INSTR monitorexit ;
	//   14   26:monitorexit     
		return der;
	//   15   27:aload_1         
	//   16   28:areturn         
		Exception exception;
		exception;
	//   17   29:astore_1        
	//*  18   30:aload_0         
		throw exception;
	//   19   31:monitorexit     
	//   20   32:aload_1         
	//   21   33:athrow          
	}

	public Crashlytics$Builder answers(Answers answers1)
	{
		if(answers1 != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          28
		{
			if(answers == null)
	//*   2    4:aload_0         
	//*   3    5:getfield        #30  <Field Answers answers>
	//*   4    8:ifnonnull       18
			{
				answers = answers1;
	//    5   11:aload_0         
	//    6   12:aload_1         
	//    7   13:putfield        #30  <Field Answers answers>
				return this;
	//    8   16:aload_0         
	//    9   17:areturn         
			} else
			{
				throw new IllegalStateException("Answers Kit already set.");
	//   10   18:new             #32  <Class IllegalStateException>
	//   11   21:dup             
	//   12   22:ldc1            #34  <String "Answers Kit already set.">
	//   13   24:invokespecial   #37  <Method void IllegalStateException(String)>
	//   14   27:athrow          
			}
		} else
		{
			throw new NullPointerException("Answers Kit must not be null.");
	//   15   28:new             #39  <Class NullPointerException>
	//   16   31:dup             
	//   17   32:ldc1            #41  <String "Answers Kit must not be null.">
	//   18   34:invokespecial   #42  <Method void NullPointerException(String)>
	//   19   37:athrow          
		}
	}

	public Crashlytics$Builder beta(Beta beta1)
	{
		if(beta1 != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          28
		{
			if(beta == null)
	//*   2    4:aload_0         
	//*   3    5:getfield        #45  <Field Beta beta>
	//*   4    8:ifnonnull       18
			{
				beta = beta1;
	//    5   11:aload_0         
	//    6   12:aload_1         
	//    7   13:putfield        #45  <Field Beta beta>
				return this;
	//    8   16:aload_0         
	//    9   17:areturn         
			} else
			{
				throw new IllegalStateException("Beta Kit already set.");
	//   10   18:new             #32  <Class IllegalStateException>
	//   11   21:dup             
	//   12   22:ldc1            #47  <String "Beta Kit already set.">
	//   13   24:invokespecial   #37  <Method void IllegalStateException(String)>
	//   14   27:athrow          
			}
		} else
		{
			throw new NullPointerException("Beta Kit must not be null.");
	//   15   28:new             #39  <Class NullPointerException>
	//   16   31:dup             
	//   17   32:ldc1            #49  <String "Beta Kit must not be null.">
	//   18   34:invokespecial   #42  <Method void NullPointerException(String)>
	//   19   37:athrow          
		}
	}

	public Crashlytics build()
	{
		com.crashlytics.android.core.der der = coreBuilder;
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field com.crashlytics.android.core.CrashlyticsCore$Builder coreBuilder>
	//    2    4:astore_1        
		if(der != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          37
			if(core == null)
	//*   5    9:aload_0         
	//*   6   10:getfield        #53  <Field CrashlyticsCore core>
	//*   7   13:ifnonnull       27
				core = der.build();
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:invokevirtual   #56  <Method CrashlyticsCore com.crashlytics.android.core.CrashlyticsCore$Builder.build()>
	//   11   21:putfield        #53  <Field CrashlyticsCore core>
			else
	//*  12   24:goto            37
				throw new IllegalStateException("Must not use Deprecated methods delay(), disabled(), listener(), pinningInfoProvider() with core()");
	//   13   27:new             #32  <Class IllegalStateException>
	//   14   30:dup             
	//   15   31:ldc1            #58  <String "Must not use Deprecated methods delay(), disabled(), listener(), pinningInfoProvider() with core()">
	//   16   33:invokespecial   #37  <Method void IllegalStateException(String)>
	//   17   36:athrow          
		if(answers == null)
	//*  18   37:aload_0         
	//*  19   38:getfield        #30  <Field Answers answers>
	//*  20   41:ifnonnull       55
			answers = new Answers();
	//   21   44:aload_0         
	//   22   45:new             #60  <Class Answers>
	//   23   48:dup             
	//   24   49:invokespecial   #61  <Method void Answers()>
	//   25   52:putfield        #30  <Field Answers answers>
		if(beta == null)
	//*  26   55:aload_0         
	//*  27   56:getfield        #45  <Field Beta beta>
	//*  28   59:ifnonnull       73
			beta = new Beta();
	//   29   62:aload_0         
	//   30   63:new             #63  <Class Beta>
	//   31   66:dup             
	//   32   67:invokespecial   #64  <Method void Beta()>
	//   33   70:putfield        #45  <Field Beta beta>
		if(core == null)
	//*  34   73:aload_0         
	//*  35   74:getfield        #53  <Field CrashlyticsCore core>
	//*  36   77:ifnonnull       91
			core = new CrashlyticsCore();
	//   37   80:aload_0         
	//   38   81:new             #66  <Class CrashlyticsCore>
	//   39   84:dup             
	//   40   85:invokespecial   #67  <Method void CrashlyticsCore()>
	//   41   88:putfield        #53  <Field CrashlyticsCore core>
		return new Crashlytics(answers, beta, core);
	//   42   91:new             #6   <Class Crashlytics>
	//   43   94:dup             
	//   44   95:aload_0         
	//   45   96:getfield        #30  <Field Answers answers>
	//   46   99:aload_0         
	//   47  100:getfield        #45  <Field Beta beta>
	//   48  103:aload_0         
	//   49  104:getfield        #53  <Field CrashlyticsCore core>
	//   50  107:invokespecial   #70  <Method void Crashlytics(Answers, Beta, CrashlyticsCore)>
	//   51  110:areturn         
	}

	public Crashlytics$Builder core(CrashlyticsCore crashlyticscore)
	{
		if(crashlyticscore != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          28
		{
			if(core == null)
	//*   2    4:aload_0         
	//*   3    5:getfield        #53  <Field CrashlyticsCore core>
	//*   4    8:ifnonnull       18
			{
				core = crashlyticscore;
	//    5   11:aload_0         
	//    6   12:aload_1         
	//    7   13:putfield        #53  <Field CrashlyticsCore core>
				return this;
	//    8   16:aload_0         
	//    9   17:areturn         
			} else
			{
				throw new IllegalStateException("CrashlyticsCore Kit already set.");
	//   10   18:new             #32  <Class IllegalStateException>
	//   11   21:dup             
	//   12   22:ldc1            #73  <String "CrashlyticsCore Kit already set.">
	//   13   24:invokespecial   #37  <Method void IllegalStateException(String)>
	//   14   27:athrow          
			}
		} else
		{
			throw new NullPointerException("CrashlyticsCore Kit must not be null.");
	//   15   28:new             #39  <Class NullPointerException>
	//   16   31:dup             
	//   17   32:ldc1            #75  <String "CrashlyticsCore Kit must not be null.">
	//   18   34:invokespecial   #42  <Method void NullPointerException(String)>
	//   19   37:athrow          
		}
	}

	public Crashlytics$Builder delay(float f)
	{
		getCoreBuilder().delay(f);
	//    0    0:aload_0         
	//    1    1:invokespecial   #80  <Method com.crashlytics.android.core.CrashlyticsCore$Builder getCoreBuilder()>
	//    2    4:fload_1         
	//    3    5:invokevirtual   #83  <Method com.crashlytics.android.core.CrashlyticsCore$Builder com.crashlytics.android.core.CrashlyticsCore$Builder.delay(float)>
	//    4    8:pop             
		return this;
	//    5    9:aload_0         
	//    6   10:areturn         
	}

	public Crashlytics$Builder disabled(boolean flag)
	{
		getCoreBuilder().disabled(flag);
	//    0    0:aload_0         
	//    1    1:invokespecial   #80  <Method com.crashlytics.android.core.CrashlyticsCore$Builder getCoreBuilder()>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #89  <Method com.crashlytics.android.core.CrashlyticsCore$Builder com.crashlytics.android.core.CrashlyticsCore$Builder.disabled(boolean)>
	//    4    8:pop             
		return this;
	//    5    9:aload_0         
	//    6   10:areturn         
	}

	public Crashlytics$Builder listener(CrashlyticsListener crashlyticslistener)
	{
		getCoreBuilder().listener(crashlyticslistener);
	//    0    0:aload_0         
	//    1    1:invokespecial   #80  <Method com.crashlytics.android.core.CrashlyticsCore$Builder getCoreBuilder()>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #94  <Method com.crashlytics.android.core.CrashlyticsCore$Builder com.crashlytics.android.core.CrashlyticsCore$Builder.listener(CrashlyticsListener)>
	//    4    8:pop             
		return this;
	//    5    9:aload_0         
	//    6   10:areturn         
	}

	public Crashlytics$Builder pinningInfo(PinningInfoProvider pinninginfoprovider)
	{
		getCoreBuilder().pinningInfo(pinninginfoprovider);
	//    0    0:aload_0         
	//    1    1:invokespecial   #80  <Method com.crashlytics.android.core.CrashlyticsCore$Builder getCoreBuilder()>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #99  <Method com.crashlytics.android.core.CrashlyticsCore$Builder com.crashlytics.android.core.CrashlyticsCore$Builder.pinningInfo(PinningInfoProvider)>
	//    4    8:pop             
		return this;
	//    5    9:aload_0         
	//    6   10:areturn         
	}

	private Answers answers;
	private Beta beta;
	private CrashlyticsCore core;
	private com.crashlytics.android.core.der coreBuilder;

	public Crashlytics$Builder()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
	//    2    4:return          
	}
}
