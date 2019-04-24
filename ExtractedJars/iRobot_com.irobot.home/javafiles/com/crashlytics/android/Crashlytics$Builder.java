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
		if(answers1 == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       14
			throw new NullPointerException("Answers Kit must not be null.");
	//    2    4:new             #30  <Class NullPointerException>
	//    3    7:dup             
	//    4    8:ldc1            #32  <String "Answers Kit must not be null.">
	//    5   10:invokespecial   #35  <Method void NullPointerException(String)>
	//    6   13:athrow          
		if(answers != null)
	//*   7   14:aload_0         
	//*   8   15:getfield        #37  <Field Answers answers>
	//*   9   18:ifnull          31
		{
			throw new IllegalStateException("Answers Kit already set.");
	//   10   21:new             #39  <Class IllegalStateException>
	//   11   24:dup             
	//   12   25:ldc1            #41  <String "Answers Kit already set.">
	//   13   27:invokespecial   #42  <Method void IllegalStateException(String)>
	//   14   30:athrow          
		} else
		{
			answers = answers1;
	//   15   31:aload_0         
	//   16   32:aload_1         
	//   17   33:putfield        #37  <Field Answers answers>
			return this;
	//   18   36:aload_0         
	//   19   37:areturn         
		}
	}

	public Crashlytics$Builder beta(Beta beta1)
	{
		if(beta1 == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       14
			throw new NullPointerException("Beta Kit must not be null.");
	//    2    4:new             #30  <Class NullPointerException>
	//    3    7:dup             
	//    4    8:ldc1            #45  <String "Beta Kit must not be null.">
	//    5   10:invokespecial   #35  <Method void NullPointerException(String)>
	//    6   13:athrow          
		if(beta != null)
	//*   7   14:aload_0         
	//*   8   15:getfield        #47  <Field Beta beta>
	//*   9   18:ifnull          31
		{
			throw new IllegalStateException("Beta Kit already set.");
	//   10   21:new             #39  <Class IllegalStateException>
	//   11   24:dup             
	//   12   25:ldc1            #49  <String "Beta Kit already set.">
	//   13   27:invokespecial   #42  <Method void IllegalStateException(String)>
	//   14   30:athrow          
		} else
		{
			beta = beta1;
	//   15   31:aload_0         
	//   16   32:aload_1         
	//   17   33:putfield        #47  <Field Beta beta>
			return this;
	//   18   36:aload_0         
	//   19   37:areturn         
		}
	}

	public Crashlytics build()
	{
		if(coreBuilder != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #24  <Field com.crashlytics.android.core.CrashlyticsCore$Builder coreBuilder>
	//*   2    4:ifnull          35
		{
			if(core != null)
	//*   3    7:aload_0         
	//*   4    8:getfield        #53  <Field CrashlyticsCore core>
	//*   5   11:ifnull          24
				throw new IllegalStateException("Must not use Deprecated methods delay(), disabled(), listener(), pinningInfoProvider() with core()");
	//    6   14:new             #39  <Class IllegalStateException>
	//    7   17:dup             
	//    8   18:ldc1            #55  <String "Must not use Deprecated methods delay(), disabled(), listener(), pinningInfoProvider() with core()">
	//    9   20:invokespecial   #42  <Method void IllegalStateException(String)>
	//   10   23:athrow          
			core = coreBuilder.build();
	//   11   24:aload_0         
	//   12   25:aload_0         
	//   13   26:getfield        #24  <Field com.crashlytics.android.core.CrashlyticsCore$Builder coreBuilder>
	//   14   29:invokevirtual   #58  <Method CrashlyticsCore com.crashlytics.android.core.CrashlyticsCore$Builder.build()>
	//   15   32:putfield        #53  <Field CrashlyticsCore core>
		}
		if(answers == null)
	//*  16   35:aload_0         
	//*  17   36:getfield        #37  <Field Answers answers>
	//*  18   39:ifnonnull       53
			answers = new Answers();
	//   19   42:aload_0         
	//   20   43:new             #60  <Class Answers>
	//   21   46:dup             
	//   22   47:invokespecial   #61  <Method void Answers()>
	//   23   50:putfield        #37  <Field Answers answers>
		if(beta == null)
	//*  24   53:aload_0         
	//*  25   54:getfield        #47  <Field Beta beta>
	//*  26   57:ifnonnull       71
			beta = new Beta();
	//   27   60:aload_0         
	//   28   61:new             #63  <Class Beta>
	//   29   64:dup             
	//   30   65:invokespecial   #64  <Method void Beta()>
	//   31   68:putfield        #47  <Field Beta beta>
		if(core == null)
	//*  32   71:aload_0         
	//*  33   72:getfield        #53  <Field CrashlyticsCore core>
	//*  34   75:ifnonnull       89
			core = new CrashlyticsCore();
	//   35   78:aload_0         
	//   36   79:new             #66  <Class CrashlyticsCore>
	//   37   82:dup             
	//   38   83:invokespecial   #67  <Method void CrashlyticsCore()>
	//   39   86:putfield        #53  <Field CrashlyticsCore core>
		return new Crashlytics(answers, beta, core);
	//   40   89:new             #6   <Class Crashlytics>
	//   41   92:dup             
	//   42   93:aload_0         
	//   43   94:getfield        #37  <Field Answers answers>
	//   44   97:aload_0         
	//   45   98:getfield        #47  <Field Beta beta>
	//   46  101:aload_0         
	//   47  102:getfield        #53  <Field CrashlyticsCore core>
	//   48  105:invokespecial   #70  <Method void Crashlytics(Answers, Beta, CrashlyticsCore)>
	//   49  108:areturn         
	}

	public Crashlytics$Builder core(CrashlyticsCore crashlyticscore)
	{
		if(crashlyticscore == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       14
			throw new NullPointerException("CrashlyticsCore Kit must not be null.");
	//    2    4:new             #30  <Class NullPointerException>
	//    3    7:dup             
	//    4    8:ldc1            #73  <String "CrashlyticsCore Kit must not be null.">
	//    5   10:invokespecial   #35  <Method void NullPointerException(String)>
	//    6   13:athrow          
		if(core != null)
	//*   7   14:aload_0         
	//*   8   15:getfield        #53  <Field CrashlyticsCore core>
	//*   9   18:ifnull          31
		{
			throw new IllegalStateException("CrashlyticsCore Kit already set.");
	//   10   21:new             #39  <Class IllegalStateException>
	//   11   24:dup             
	//   12   25:ldc1            #75  <String "CrashlyticsCore Kit already set.">
	//   13   27:invokespecial   #42  <Method void IllegalStateException(String)>
	//   14   30:athrow          
		} else
		{
			core = crashlyticscore;
	//   15   31:aload_0         
	//   16   32:aload_1         
	//   17   33:putfield        #53  <Field CrashlyticsCore core>
			return this;
	//   18   36:aload_0         
	//   19   37:areturn         
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
