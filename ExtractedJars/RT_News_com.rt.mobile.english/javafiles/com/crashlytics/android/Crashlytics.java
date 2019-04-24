// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android;

import com.crashlytics.android.answers.Answers;
import com.crashlytics.android.beta.Beta;
import com.crashlytics.android.core.CrashlyticsCore;
import com.crashlytics.android.core.CrashlyticsListener;
import com.crashlytics.android.core.PinningInfoProvider;
import io.fabric.sdk.android.*;
import java.net.URL;
import java.util.*;

public class Crashlytics extends Kit
	implements KitGroup
{
	public static class Builder
	{

		private com.crashlytics.android.core.CrashlyticsCore.Builder getCoreBuilder()
		{
			this;
		//    0    0:aload_0         
			JVM INSTR monitorenter ;
		//    1    1:monitorenter    
			com.crashlytics.android.core.CrashlyticsCore.Builder builder;
			if(coreBuilder == null)
		//*   2    2:aload_0         
		//*   3    3:getfield        #24  <Field com.crashlytics.android.core.CrashlyticsCore$Builder coreBuilder>
		//*   4    6:ifnonnull       20
				coreBuilder = new com.crashlytics.android.core.CrashlyticsCore.Builder();
		//    5    9:aload_0         
		//    6   10:new             #26  <Class com.crashlytics.android.core.CrashlyticsCore$Builder>
		//    7   13:dup             
		//    8   14:invokespecial   #27  <Method void com.crashlytics.android.core.CrashlyticsCore$Builder()>
		//    9   17:putfield        #24  <Field com.crashlytics.android.core.CrashlyticsCore$Builder coreBuilder>
			builder = coreBuilder;
		//   10   20:aload_0         
		//   11   21:getfield        #24  <Field com.crashlytics.android.core.CrashlyticsCore$Builder coreBuilder>
		//   12   24:astore_1        
			this;
		//   13   25:aload_0         
			JVM INSTR monitorexit ;
		//   14   26:monitorexit     
			return builder;
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

		public Builder answers(Answers answers1)
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

		public Builder beta(Beta beta1)
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

		public Builder core(CrashlyticsCore crashlyticscore)
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

		public Builder delay(float f)
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

		public Builder disabled(boolean flag)
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

		public Builder listener(CrashlyticsListener crashlyticslistener)
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

		public Builder pinningInfo(PinningInfoProvider pinninginfoprovider)
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
		private com.crashlytics.android.core.CrashlyticsCore.Builder coreBuilder;

		public Builder()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #19  <Method void Object()>
		//    2    4:return          
		}
	}


	public Crashlytics()
	{
		this(new Answers(), new Beta(), new CrashlyticsCore());
	//    0    0:aload_0         
	//    1    1:new             #27  <Class Answers>
	//    2    4:dup             
	//    3    5:invokespecial   #29  <Method void Answers()>
	//    4    8:new             #31  <Class Beta>
	//    5   11:dup             
	//    6   12:invokespecial   #32  <Method void Beta()>
	//    7   15:new             #34  <Class CrashlyticsCore>
	//    8   18:dup             
	//    9   19:invokespecial   #35  <Method void CrashlyticsCore()>
	//   10   22:invokespecial   #38  <Method void Crashlytics(Answers, Beta, CrashlyticsCore)>
	//   11   25:return          
	}

	Crashlytics(Answers answers1, Beta beta1, CrashlyticsCore crashlyticscore)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #40  <Method void Kit()>
		answers = answers1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #42  <Field Answers answers>
		beta = beta1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #44  <Field Beta beta>
		core = crashlyticscore;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #46  <Field CrashlyticsCore core>
		kits = Collections.unmodifiableCollection(((Collection) (Arrays.asList(((Object []) (new Kit[] {
			answers1, beta1, crashlyticscore
		}))))));
	//   11   19:aload_0         
	//   12   20:iconst_3        
	//   13   21:anewarray       Kit[]
	//   14   24:dup             
	//   15   25:iconst_0        
	//   16   26:aload_1         
	//   17   27:aastore         
	//   18   28:dup             
	//   19   29:iconst_1        
	//   20   30:aload_2         
	//   21   31:aastore         
	//   22   32:dup             
	//   23   33:iconst_2        
	//   24   34:aload_3         
	//   25   35:aastore         
	//   26   36:invokestatic    #52  <Method java.util.List Arrays.asList(Object[])>
	//   27   39:invokestatic    #58  <Method Collection Collections.unmodifiableCollection(Collection)>
	//   28   42:putfield        #60  <Field Collection kits>
	//   29   45:return          
	}

	private static void checkInitialized()
	{
		if(getInstance() == null)
	//*   0    0:invokestatic    #65  <Method Crashlytics getInstance()>
	//*   1    3:ifnonnull       16
			throw new IllegalStateException("Crashlytics must be initialized by calling Fabric.with(Context) prior to calling Crashlytics.getInstance()");
	//    2    6:new             #67  <Class IllegalStateException>
	//    3    9:dup             
	//    4   10:ldc1            #69  <String "Crashlytics must be initialized by calling Fabric.with(Context) prior to calling Crashlytics.getInstance()">
	//    5   12:invokespecial   #72  <Method void IllegalStateException(String)>
	//    6   15:athrow          
		else
			return;
	//    7   16:return          
	}

	public static Crashlytics getInstance()
	{
		return (Crashlytics)Fabric.getKit(com/crashlytics/android/Crashlytics);
	//    0    0:ldc1            #2   <Class Crashlytics>
	//    1    2:invokestatic    #78  <Method Kit Fabric.getKit(Class)>
	//    2    5:checkcast       #2   <Class Crashlytics>
	//    3    8:areturn         
	}

	public static PinningInfoProvider getPinningInfoProvider()
	{
		checkInitialized();
	//    0    0:invokestatic    #82  <Method void checkInitialized()>
		return getInstance().core.getPinningInfoProvider();
	//    1    3:invokestatic    #65  <Method Crashlytics getInstance()>
	//    2    6:getfield        #46  <Field CrashlyticsCore core>
	//    3    9:invokevirtual   #84  <Method PinningInfoProvider CrashlyticsCore.getPinningInfoProvider()>
	//    4   12:areturn         
	}

	public static void log(int i, String s, String s1)
	{
		checkInitialized();
	//    0    0:invokestatic    #82  <Method void checkInitialized()>
		getInstance().core.log(i, s, s1);
	//    1    3:invokestatic    #65  <Method Crashlytics getInstance()>
	//    2    6:getfield        #46  <Field CrashlyticsCore core>
	//    3    9:iload_0         
	//    4   10:aload_1         
	//    5   11:aload_2         
	//    6   12:invokevirtual   #88  <Method void CrashlyticsCore.log(int, String, String)>
	//    7   15:return          
	}

	public static void log(String s)
	{
		checkInitialized();
	//    0    0:invokestatic    #82  <Method void checkInitialized()>
		getInstance().core.log(s);
	//    1    3:invokestatic    #65  <Method Crashlytics getInstance()>
	//    2    6:getfield        #46  <Field CrashlyticsCore core>
	//    3    9:aload_0         
	//    4   10:invokevirtual   #90  <Method void CrashlyticsCore.log(String)>
	//    5   13:return          
	}

	public static void logException(Throwable throwable)
	{
		checkInitialized();
	//    0    0:invokestatic    #82  <Method void checkInitialized()>
		getInstance().core.logException(throwable);
	//    1    3:invokestatic    #65  <Method Crashlytics getInstance()>
	//    2    6:getfield        #46  <Field CrashlyticsCore core>
	//    3    9:aload_0         
	//    4   10:invokevirtual   #94  <Method void CrashlyticsCore.logException(Throwable)>
	//    5   13:return          
	}

	public static void setBool(String s, boolean flag)
	{
		checkInitialized();
	//    0    0:invokestatic    #82  <Method void checkInitialized()>
		getInstance().core.setBool(s, flag);
	//    1    3:invokestatic    #65  <Method Crashlytics getInstance()>
	//    2    6:getfield        #46  <Field CrashlyticsCore core>
	//    3    9:aload_0         
	//    4   10:iload_1         
	//    5   11:invokevirtual   #98  <Method void CrashlyticsCore.setBool(String, boolean)>
	//    6   14:return          
	}

	public static void setDouble(String s, double d)
	{
		checkInitialized();
	//    0    0:invokestatic    #82  <Method void checkInitialized()>
		getInstance().core.setDouble(s, d);
	//    1    3:invokestatic    #65  <Method Crashlytics getInstance()>
	//    2    6:getfield        #46  <Field CrashlyticsCore core>
	//    3    9:aload_0         
	//    4   10:dload_1         
	//    5   11:invokevirtual   #102 <Method void CrashlyticsCore.setDouble(String, double)>
	//    6   14:return          
	}

	public static void setFloat(String s, float f)
	{
		checkInitialized();
	//    0    0:invokestatic    #82  <Method void checkInitialized()>
		getInstance().core.setFloat(s, f);
	//    1    3:invokestatic    #65  <Method Crashlytics getInstance()>
	//    2    6:getfield        #46  <Field CrashlyticsCore core>
	//    3    9:aload_0         
	//    4   10:fload_1         
	//    5   11:invokevirtual   #106 <Method void CrashlyticsCore.setFloat(String, float)>
	//    6   14:return          
	}

	public static void setInt(String s, int i)
	{
		checkInitialized();
	//    0    0:invokestatic    #82  <Method void checkInitialized()>
		getInstance().core.setInt(s, i);
	//    1    3:invokestatic    #65  <Method Crashlytics getInstance()>
	//    2    6:getfield        #46  <Field CrashlyticsCore core>
	//    3    9:aload_0         
	//    4   10:iload_1         
	//    5   11:invokevirtual   #110 <Method void CrashlyticsCore.setInt(String, int)>
	//    6   14:return          
	}

	public static void setLong(String s, long l)
	{
		checkInitialized();
	//    0    0:invokestatic    #82  <Method void checkInitialized()>
		getInstance().core.setLong(s, l);
	//    1    3:invokestatic    #65  <Method Crashlytics getInstance()>
	//    2    6:getfield        #46  <Field CrashlyticsCore core>
	//    3    9:aload_0         
	//    4   10:lload_1         
	//    5   11:invokevirtual   #114 <Method void CrashlyticsCore.setLong(String, long)>
	//    6   14:return          
	}

	public static void setPinningInfoProvider(PinningInfoProvider pinninginfoprovider)
	{
		Fabric.getLogger().w("Crashlytics", "Use of Crashlytics.setPinningInfoProvider is deprecated");
	//    0    0:invokestatic    #121 <Method Logger Fabric.getLogger()>
	//    1    3:ldc1            #14  <String "Crashlytics">
	//    2    5:ldc1            #123 <String "Use of Crashlytics.setPinningInfoProvider is deprecated">
	//    3    7:invokeinterface #129 <Method void Logger.w(String, String)>
	//    4   12:return          
	}

	public static void setString(String s, String s1)
	{
		checkInitialized();
	//    0    0:invokestatic    #82  <Method void checkInitialized()>
		getInstance().core.setString(s, s1);
	//    1    3:invokestatic    #65  <Method Crashlytics getInstance()>
	//    2    6:getfield        #46  <Field CrashlyticsCore core>
	//    3    9:aload_0         
	//    4   10:aload_1         
	//    5   11:invokevirtual   #133 <Method void CrashlyticsCore.setString(String, String)>
	//    6   14:return          
	}

	public static void setUserEmail(String s)
	{
		checkInitialized();
	//    0    0:invokestatic    #82  <Method void checkInitialized()>
		getInstance().core.setUserEmail(s);
	//    1    3:invokestatic    #65  <Method Crashlytics getInstance()>
	//    2    6:getfield        #46  <Field CrashlyticsCore core>
	//    3    9:aload_0         
	//    4   10:invokevirtual   #136 <Method void CrashlyticsCore.setUserEmail(String)>
	//    5   13:return          
	}

	public static void setUserIdentifier(String s)
	{
		checkInitialized();
	//    0    0:invokestatic    #82  <Method void checkInitialized()>
		getInstance().core.setUserIdentifier(s);
	//    1    3:invokestatic    #65  <Method Crashlytics getInstance()>
	//    2    6:getfield        #46  <Field CrashlyticsCore core>
	//    3    9:aload_0         
	//    4   10:invokevirtual   #139 <Method void CrashlyticsCore.setUserIdentifier(String)>
	//    5   13:return          
	}

	public static void setUserName(String s)
	{
		checkInitialized();
	//    0    0:invokestatic    #82  <Method void checkInitialized()>
		getInstance().core.setUserName(s);
	//    1    3:invokestatic    #65  <Method Crashlytics getInstance()>
	//    2    6:getfield        #46  <Field CrashlyticsCore core>
	//    3    9:aload_0         
	//    4   10:invokevirtual   #142 <Method void CrashlyticsCore.setUserName(String)>
	//    5   13:return          
	}

	public void crash()
	{
		core.crash();
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field CrashlyticsCore core>
	//    2    4:invokevirtual   #145 <Method void CrashlyticsCore.crash()>
	//    3    7:return          
	}

	protected volatile Object doInBackground()
	{
		return ((Object) (doInBackground()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #150 <Method Void doInBackground()>
	//    2    4:areturn         
	}

	protected Void doInBackground()
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public boolean getDebugMode()
	{
		Fabric.getLogger().w("Crashlytics", "Use of Crashlytics.getDebugMode is deprecated.");
	//    0    0:invokestatic    #121 <Method Logger Fabric.getLogger()>
	//    1    3:ldc1            #14  <String "Crashlytics">
	//    2    5:ldc1            #154 <String "Use of Crashlytics.getDebugMode is deprecated.">
	//    3    7:invokeinterface #129 <Method void Logger.w(String, String)>
		getFabric();
	//    4   12:aload_0         
	//    5   13:invokevirtual   #158 <Method Fabric getFabric()>
	//    6   16:pop             
		return Fabric.isDebuggable();
	//    7   17:invokestatic    #161 <Method boolean Fabric.isDebuggable()>
	//    8   20:ireturn         
	}

	public String getIdentifier()
	{
		return "com.crashlytics.sdk.android:crashlytics";
	//    0    0:ldc1            #165 <String "com.crashlytics.sdk.android:crashlytics">
	//    1    2:areturn         
	}

	public Collection getKits()
	{
		return kits;
	//    0    0:aload_0         
	//    1    1:getfield        #60  <Field Collection kits>
	//    2    4:areturn         
	}

	public String getVersion()
	{
		return "2.5.5.97";
	//    0    0:ldc1            #172 <String "2.5.5.97">
	//    1    2:areturn         
	}

	public void setDebugMode(boolean flag)
	{
		Fabric.getLogger().w("Crashlytics", "Use of Crashlytics.setDebugMode is deprecated.");
	//    0    0:invokestatic    #121 <Method Logger Fabric.getLogger()>
	//    1    3:ldc1            #14  <String "Crashlytics">
	//    2    5:ldc1            #176 <String "Use of Crashlytics.setDebugMode is deprecated.">
	//    3    7:invokeinterface #129 <Method void Logger.w(String, String)>
	//    4   12:return          
	}

	public void setListener(CrashlyticsListener crashlyticslistener)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		core.setListener(crashlyticslistener);
	//    2    2:aload_0         
	//    3    3:getfield        #46  <Field CrashlyticsCore core>
	//    4    6:aload_1         
	//    5    7:invokevirtual   #180 <Method void CrashlyticsCore.setListener(CrashlyticsListener)>
		this;
	//    6   10:aload_0         
		JVM INSTR monitorexit ;
	//    7   11:monitorexit     
		return;
	//    8   12:return          
		crashlyticslistener;
	//    9   13:astore_1        
	//*  10   14:aload_0         
		throw crashlyticslistener;
	//   11   15:monitorexit     
	//   12   16:aload_1         
	//   13   17:athrow          
	}

	public boolean verifyPinning(URL url)
	{
		return core.verifyPinning(url);
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field CrashlyticsCore core>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #184 <Method boolean CrashlyticsCore.verifyPinning(URL)>
	//    4    8:ireturn         
	}

	public static final String TAG = "Crashlytics";
	public final Answers answers;
	public final Beta beta;
	public final CrashlyticsCore core;
	public final Collection kits;
}
