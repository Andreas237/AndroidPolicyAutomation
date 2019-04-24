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
		if(f <= 0.0F)
	//*   0    0:fload_1         
	//*   1    1:fconst_0        
	//*   2    2:fcmpg           
	//*   3    3:ifgt            16
			throw new IllegalArgumentException("delay must be greater than 0");
	//    4    6:new             #37  <Class IllegalArgumentException>
	//    5    9:dup             
	//    6   10:ldc1            #39  <String "delay must be greater than 0">
	//    7   12:invokespecial   #42  <Method void IllegalArgumentException(String)>
	//    8   15:athrow          
		if(delay > 0.0F)
	//*   9   16:aload_0         
	//*  10   17:getfield        #22  <Field float delay>
	//*  11   20:fconst_0        
	//*  12   21:fcmpl           
	//*  13   22:ifle            35
		{
			throw new IllegalStateException("delay already set.");
	//   14   25:new             #44  <Class IllegalStateException>
	//   15   28:dup             
	//   16   29:ldc1            #46  <String "delay already set.">
	//   17   31:invokespecial   #47  <Method void IllegalStateException(String)>
	//   18   34:athrow          
		} else
		{
			delay = f;
	//   19   35:aload_0         
	//   20   36:fload_1         
	//   21   37:putfield        #22  <Field float delay>
			return this;
	//   22   40:aload_0         
	//   23   41:areturn         
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
		if(crashlyticslistener == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       14
			throw new IllegalArgumentException("listener must not be null.");
	//    2    4:new             #37  <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:ldc1            #51  <String "listener must not be null.">
	//    5   10:invokespecial   #42  <Method void IllegalArgumentException(String)>
	//    6   13:athrow          
		if(listener != null)
	//*   7   14:aload_0         
	//*   8   15:getfield        #29  <Field CrashlyticsListener listener>
	//*   9   18:ifnull          31
		{
			throw new IllegalStateException("listener already set.");
	//   10   21:new             #44  <Class IllegalStateException>
	//   11   24:dup             
	//   12   25:ldc1            #53  <String "listener already set.">
	//   13   27:invokespecial   #47  <Method void IllegalStateException(String)>
	//   14   30:athrow          
		} else
		{
			listener = crashlyticslistener;
	//   15   31:aload_0         
	//   16   32:aload_1         
	//   17   33:putfield        #29  <Field CrashlyticsListener listener>
			return this;
	//   18   36:aload_0         
	//   19   37:areturn         
		}
	}

	public CrashlyticsCore$Builder pinningInfo(PinningInfoProvider pinninginfoprovider)
	{
		if(pinninginfoprovider == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       14
			throw new IllegalArgumentException("pinningInfoProvider must not be null.");
	//    2    4:new             #37  <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:ldc1            #58  <String "pinningInfoProvider must not be null.">
	//    5   10:invokespecial   #42  <Method void IllegalArgumentException(String)>
	//    6   13:athrow          
		if(pinningInfoProvider != null)
	//*   7   14:aload_0         
	//*   8   15:getfield        #31  <Field PinningInfoProvider pinningInfoProvider>
	//*   9   18:ifnull          31
		{
			throw new IllegalStateException("pinningInfoProvider already set.");
	//   10   21:new             #44  <Class IllegalStateException>
	//   11   24:dup             
	//   12   25:ldc1            #60  <String "pinningInfoProvider already set.">
	//   13   27:invokespecial   #47  <Method void IllegalStateException(String)>
	//   14   30:athrow          
		} else
		{
			pinningInfoProvider = pinninginfoprovider;
	//   15   31:aload_0         
	//   16   32:aload_1         
	//   17   33:putfield        #31  <Field PinningInfoProvider pinningInfoProvider>
			return this;
	//   18   36:aload_0         
	//   19   37:areturn         
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
