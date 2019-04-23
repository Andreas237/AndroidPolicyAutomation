// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;


// Referenced classes of package android.support.v4.app:
//			JobIntentService, SafeJobServiceEngineImpl

public abstract class SafeJobIntentService extends JobIntentService
{

	public SafeJobIntentService()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void JobIntentService()>
	//    2    4:return          
	}

	JobIntentService.GenericWorkItem dequeueWork()
	{
		JobIntentService.GenericWorkItem genericworkitem;
		try
		{
			genericworkitem = super.dequeueWork();
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method JobIntentService$GenericWorkItem JobIntentService.dequeueWork()>
	//    2    4:astore_1        
		}
	//*   3    5:aload_1         
	//*   4    6:areturn         
		catch(SecurityException securityexception)
	//*   5    7:astore_1        
		{
			securityexception.printStackTrace();
	//    6    8:aload_1         
	//    7    9:invokevirtual   #22  <Method void SecurityException.printStackTrace()>
			return null;
	//    8   12:aconst_null     
	//    9   13:areturn         
		}
		return genericworkitem;
	}

	public void onCreate()
	{
		super.onCreate();
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void JobIntentService.onCreate()>
		if(android.os.Build.VERSION.SDK_INT >= 26)
	//*   2    4:getstatic       #31  <Field int android.os.Build$VERSION.SDK_INT>
	//*   3    7:bipush          26
	//*   4    9:icmplt          25
		{
			mJobImpl = ((JobIntentService.CompatJobEngine) (new SafeJobServiceEngineImpl(((JobIntentService) (this)))));
	//    5   12:aload_0         
	//    6   13:new             #33  <Class SafeJobServiceEngineImpl>
	//    7   16:dup             
	//    8   17:aload_0         
	//    9   18:invokespecial   #36  <Method void SafeJobServiceEngineImpl(JobIntentService)>
	//   10   21:putfield        #40  <Field JobIntentService$CompatJobEngine mJobImpl>
			return;
	//   11   24:return          
		} else
		{
			mJobImpl = null;
	//   12   25:aload_0         
	//   13   26:aconst_null     
	//   14   27:putfield        #40  <Field JobIntentService$CompatJobEngine mJobImpl>
			return;
	//   15   30:return          
		}
	}
}
