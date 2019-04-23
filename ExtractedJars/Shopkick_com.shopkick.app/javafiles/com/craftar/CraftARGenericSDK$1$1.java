// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.craftar;

import android.os.Handler;
import java.util.TimerTask;

// Referenced classes of package com.craftar:
//			CraftARGenericSDK

class CraftARGenericSDK$1$1
	implements Runnable
{

	public void run()
	{
		CraftARGenericSDK.access$000(this$0).finderTimeoutOver();
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field CraftARGenericSDK$1 this$1>
	//    2    4:getfield        #24  <Field CraftARGenericSDK CraftARGenericSDK$1.this$0>
	//    3    7:invokestatic    #30  <Method CraftARGenericSDK$OnFinderTimeoutListener CraftARGenericSDK.access$000(CraftARGenericSDK)>
	//    4   10:invokeinterface #35  <Method void CraftARGenericSDK$OnFinderTimeoutListener.finderTimeoutOver()>
	//    5   15:return          
	}

	final CraftARGenericSDK._cls1 this$1;

	CraftARGenericSDK$1$1()
	{
		this$1 = CraftARGenericSDK._cls1.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field CraftARGenericSDK$1 this$1>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}

	// Unreferenced inner class com/craftar/CraftARGenericSDK$1

/* anonymous class */
	class CraftARGenericSDK._cls1 extends TimerTask
	{

		public void run()
		{
			if(isFinding())
		//*   0    0:aload_0         
		//*   1    1:getfield        #17  <Field CraftARGenericSDK this$0>
		//*   2    4:invokevirtual   #26  <Method boolean CraftARGenericSDK.isFinding()>
		//*   3    7:ifeq            56
			{
				stopFinder();
		//    4   10:aload_0         
		//    5   11:getfield        #17  <Field CraftARGenericSDK this$0>
		//    6   14:invokevirtual   #29  <Method void CraftARGenericSDK.stopFinder()>
				if(CraftARGenericSDK.access$000(CraftARGenericSDK.this) != null && CraftARGenericSDK.access$100(CraftARGenericSDK.this) != null)
		//*   7   17:aload_0         
		//*   8   18:getfield        #17  <Field CraftARGenericSDK this$0>
		//*   9   21:invokestatic    #33  <Method CraftARGenericSDK$OnFinderTimeoutListener CraftARGenericSDK.access$000(CraftARGenericSDK)>
		//*  10   24:ifnull          56
		//*  11   27:aload_0         
		//*  12   28:getfield        #17  <Field CraftARGenericSDK this$0>
		//*  13   31:invokestatic    #37  <Method Handler CraftARGenericSDK.access$100(CraftARGenericSDK)>
		//*  14   34:ifnull          56
					CraftARGenericSDK.access$100(CraftARGenericSDK.this).post(((Runnable) (new CraftARGenericSDK._cls1._cls1())));
		//   15   37:aload_0         
		//   16   38:getfield        #17  <Field CraftARGenericSDK this$0>
		//   17   41:invokestatic    #37  <Method Handler CraftARGenericSDK.access$100(CraftARGenericSDK)>
		//   18   44:new             #11  <Class CraftARGenericSDK$1$1>
		//   19   47:dup             
		//   20   48:aload_0         
		//   21   49:invokespecial   #40  <Method void CraftARGenericSDK$1$1(CraftARGenericSDK$1)>
		//   22   52:invokevirtual   #46  <Method boolean Handler.post(Runnable)>
		//   23   55:pop             
			}
		//   24   56:return          
		}

		final CraftARGenericSDK this$0;

			
			{
				this$0 = CraftARGenericSDK.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field CraftARGenericSDK this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void TimerTask()>
			//    5    9:return          
			}
	}

}
