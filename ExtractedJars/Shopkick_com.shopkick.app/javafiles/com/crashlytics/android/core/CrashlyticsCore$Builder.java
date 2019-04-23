// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.core;


// Referenced classes of package com.crashlytics.android.core:
//			CrashlyticsCore, CrashlyticsListener, PinningInfoProvider

public static class CrashlyticsCore$Builder
{

	public CrashlyticsCore build()
	{
		if(delay < 0.0F)
	//*   0    0:aload_0         
	//*   1    1:getfield        #22  <Field float delay>
	//*   2    4:fconst_0        
	//*   3    5:fcmpg           
	//*   4    6:ifge            14
			delay = 1.0F;
	//    5    9:aload_0         
	//    6   10:fconst_1        
	//    7   11:putfield        #22  <Field float delay>
		return new CrashlyticsCore(delay, listener, pinningInfoProvider, disabled);
	//    8   14:new             #6   <Class CrashlyticsCore>
	//    9   17:dup             
	//   10   18:aload_0         
	//   11   19:getfield        #22  <Field float delay>
	//   12   22:aload_0         
	//   13   23:getfield        #29  <Field CrashlyticsListener listener>
	//   14   26:aload_0         
	//   15   27:getfield        #31  <Field PinningInfoProvider pinningInfoProvider>
	//   16   30:aload_0         
	//   17   31:getfield        #24  <Field boolean disabled>
	//   18   34:invokespecial   #34  <Method void CrashlyticsCore(float, CrashlyticsListener, PinningInfoProvider, boolean)>
	//   19   37:areturn         
	}

	public CrashlyticsCore$Builder delay(float f)
	{
		if(f > 0.0F)
	//*   0    0:fload_1         
	//*   1    1:fconst_0        
	//*   2    2:fcmpg           
	//*   3    3:ifle            32
		{
			if(delay <= 0.0F)
	//*   4    6:aload_0         
	//*   5    7:getfield        #22  <Field float delay>
	//*   6   10:fconst_0        
	//*   7   11:fcmpl           
	//*   8   12:ifgt            22
			{
				delay = f;
	//    9   15:aload_0         
	//   10   16:fload_1         
	//   11   17:putfield        #22  <Field float delay>
				return this;
	//   12   20:aload_0         
	//   13   21:areturn         
			} else
			{
				throw new IllegalStateException("delay already set.");
	//   14   22:new             #37  <Class IllegalStateException>
	//   15   25:dup             
	//   16   26:ldc1            #39  <String "delay already set.">
	//   17   28:invokespecial   #42  <Method void IllegalStateException(String)>
	//   18   31:athrow          
			}
		} else
		{
			throw new IllegalArgumentException("delay must be greater than 0");
	//   19   32:new             #44  <Class IllegalArgumentException>
	//   20   35:dup             
	//   21   36:ldc1            #46  <String "delay must be greater than 0">
	//   22   38:invokespecial   #47  <Method void IllegalArgumentException(String)>
	//   23   41:athrow          
		}
	}

	public CrashlyticsCore$Builder disabled(boolean flag)
	{
		disabled = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #24  <Field boolean disabled>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public CrashlyticsCore$Builder listener(CrashlyticsListener crashlyticslistener)
	{
		if(crashlyticslistener != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          28
		{
			if(listener == null)
	//*   2    4:aload_0         
	//*   3    5:getfield        #29  <Field CrashlyticsListener listener>
	//*   4    8:ifnonnull       18
			{
				listener = crashlyticslistener;
	//    5   11:aload_0         
	//    6   12:aload_1         
	//    7   13:putfield        #29  <Field CrashlyticsListener listener>
				return this;
	//    8   16:aload_0         
	//    9   17:areturn         
			} else
			{
				throw new IllegalStateException("listener already set.");
	//   10   18:new             #37  <Class IllegalStateException>
	//   11   21:dup             
	//   12   22:ldc1            #51  <String "listener already set.">
	//   13   24:invokespecial   #42  <Method void IllegalStateException(String)>
	//   14   27:athrow          
			}
		} else
		{
			throw new IllegalArgumentException("listener must not be null.");
	//   15   28:new             #44  <Class IllegalArgumentException>
	//   16   31:dup             
	//   17   32:ldc1            #53  <String "listener must not be null.">
	//   18   34:invokespecial   #47  <Method void IllegalArgumentException(String)>
	//   19   37:athrow          
		}
	}

	public CrashlyticsCore$Builder pinningInfo(PinningInfoProvider pinninginfoprovider)
	{
		if(pinninginfoprovider != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          28
		{
			if(pinningInfoProvider == null)
	//*   2    4:aload_0         
	//*   3    5:getfield        #31  <Field PinningInfoProvider pinningInfoProvider>
	//*   4    8:ifnonnull       18
			{
				pinningInfoProvider = pinninginfoprovider;
	//    5   11:aload_0         
	//    6   12:aload_1         
	//    7   13:putfield        #31  <Field PinningInfoProvider pinningInfoProvider>
				return this;
	//    8   16:aload_0         
	//    9   17:areturn         
			} else
			{
				throw new IllegalStateException("pinningInfoProvider already set.");
	//   10   18:new             #37  <Class IllegalStateException>
	//   11   21:dup             
	//   12   22:ldc1            #58  <String "pinningInfoProvider already set.">
	//   13   24:invokespecial   #42  <Method void IllegalStateException(String)>
	//   14   27:athrow          
			}
		} else
		{
			throw new IllegalArgumentException("pinningInfoProvider must not be null.");
	//   15   28:new             #44  <Class IllegalArgumentException>
	//   16   31:dup             
	//   17   32:ldc1            #60  <String "pinningInfoProvider must not be null.">
	//   18   34:invokespecial   #47  <Method void IllegalArgumentException(String)>
	//   19   37:athrow          
		}
	}

	private float delay;
	private boolean disabled;
	private CrashlyticsListener listener;
	private PinningInfoProvider pinningInfoProvider;

	public CrashlyticsCore$Builder()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
		delay = -1F;
	//    2    4:aload_0         
	//    3    5:ldc1            #20  <Float -1F>
	//    4    7:putfield        #22  <Field float delay>
		disabled = false;
	//    5   10:aload_0         
	//    6   11:iconst_0        
	//    7   12:putfield        #24  <Field boolean disabled>
	//    8   15:return          
	}
}
