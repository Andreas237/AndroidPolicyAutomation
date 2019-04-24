// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.adjust.sdk;

import android.content.Context;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Looper;

// Referenced classes of package com.adjust.sdk:
//			AdjustInstance, AdjustFactory, ILogger, Util, 
//			OnDeviceIdsRead, AdjustConfig, AdjustEvent

public class Adjust
{

	private Adjust()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
	//    2    4:return          
	}

	public static void appWillOpenUrl(Uri uri)
	{
		getDefaultInstance().appWillOpenUrl(uri);
	//    0    0:invokestatic    #19  <Method AdjustInstance getDefaultInstance()>
	//    1    3:aload_0         
	//    2    4:invokevirtual   #23  <Method void AdjustInstance.appWillOpenUrl(Uri)>
	//    3    7:return          
	}

	public static AdjustInstance getDefaultInstance()
	{
		com/adjust/sdk/Adjust;
	//    0    0:ldc1            #2   <Class Adjust>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		AdjustInstance adjustinstance;
		if(defaultInstance == null)
	//*   2    3:getstatic       #25  <Field AdjustInstance defaultInstance>
	//*   3    6:ifnonnull       19
			defaultInstance = new AdjustInstance();
	//    4    9:new             #21  <Class AdjustInstance>
	//    5   12:dup             
	//    6   13:invokespecial   #26  <Method void AdjustInstance()>
	//    7   16:putstatic       #25  <Field AdjustInstance defaultInstance>
		adjustinstance = defaultInstance;
	//    8   19:getstatic       #25  <Field AdjustInstance defaultInstance>
	//    9   22:astore_0        
		com/adjust/sdk/Adjust;
	//   10   23:ldc1            #2   <Class Adjust>
		JVM INSTR monitorexit ;
	//   11   25:monitorexit     
		return adjustinstance;
	//   12   26:aload_0         
	//   13   27:areturn         
		Exception exception;
		exception;
	//   14   28:astore_0        
	//*  15   29:ldc1            #2   <Class Adjust>
		throw exception;
	//   16   31:monitorexit     
	//   17   32:aload_0         
	//   18   33:athrow          
	}

	public static void getGoogleAdId(Context context, OnDeviceIdsRead ondeviceidsread)
	{
		ILogger ilogger = AdjustFactory.getLogger();
	//    0    0:invokestatic    #36  <Method ILogger AdjustFactory.getLogger()>
	//    1    3:astore_2        
		if(Looper.myLooper() != Looper.getMainLooper())
	//*   2    4:invokestatic    #42  <Method Looper Looper.myLooper()>
	//*   3    7:invokestatic    #45  <Method Looper Looper.getMainLooper()>
	//*   4   10:if_acmpeq       73
		{
			ilogger.debug("GoogleAdId being read in the background", new Object[0]);
	//    5   13:aload_2         
	//    6   14:ldc1            #47  <String "GoogleAdId being read in the background">
	//    7   16:iconst_0        
	//    8   17:anewarray       Object[]
	//    9   20:invokeinterface #53  <Method void ILogger.debug(String, Object[])>
			context = ((Context) (Util.getPlayAdId(context)));
	//   10   25:aload_0         
	//   11   26:invokestatic    #59  <Method String Util.getPlayAdId(Context)>
	//   12   29:astore_0        
			StringBuilder stringbuilder = new StringBuilder();
	//   13   30:new             #61  <Class StringBuilder>
	//   14   33:dup             
	//   15   34:invokespecial   #62  <Method void StringBuilder()>
	//   16   37:astore_3        
			stringbuilder.append("GoogleAdId read ");
	//   17   38:aload_3         
	//   18   39:ldc1            #64  <String "GoogleAdId read ">
	//   19   41:invokevirtual   #68  <Method StringBuilder StringBuilder.append(String)>
	//   20   44:pop             
			stringbuilder.append(((String) (context)));
	//   21   45:aload_3         
	//   22   46:aload_0         
	//   23   47:invokevirtual   #68  <Method StringBuilder StringBuilder.append(String)>
	//   24   50:pop             
			ilogger.debug(stringbuilder.toString(), new Object[0]);
	//   25   51:aload_2         
	//   26   52:aload_3         
	//   27   53:invokevirtual   #72  <Method String StringBuilder.toString()>
	//   28   56:iconst_0        
	//   29   57:anewarray       Object[]
	//   30   60:invokeinterface #53  <Method void ILogger.debug(String, Object[])>
			ondeviceidsread.onGoogleAdIdRead(((String) (context)));
	//   31   65:aload_1         
	//   32   66:aload_0         
	//   33   67:invokeinterface #78  <Method void OnDeviceIdsRead.onGoogleAdIdRead(String)>
			return;
	//   34   72:return          
		}
		try
		{
			ilogger.debug("GoogleAdId being read in the foreground", new Object[0]);
	//   35   73:aload_2         
	//   36   74:ldc1            #80  <String "GoogleAdId being read in the foreground">
	//   37   76:iconst_0        
	//   38   77:anewarray       Object[]
	//   39   80:invokeinterface #53  <Method void ILogger.debug(String, Object[])>
			((_cls1) (new AsyncTask(ondeviceidsread) {

				protected volatile Object doInBackground(Object aobj[])
				{
					return ((Object) (doInBackground((Context[])aobj)));
				//    0    0:aload_0         
				//    1    1:aload_1         
				//    2    2:checkcast       #24  <Class Context[]>
				//    3    5:invokevirtual   #27  <Method String doInBackground(Context[])>
				//    4    8:areturn         
				}

				protected transient String doInBackground(Context acontext[])
				{
					ILogger ilogger1 = AdjustFactory.getLogger();
				//    0    0:invokestatic    #33  <Method ILogger AdjustFactory.getLogger()>
				//    1    3:astore_2        
					acontext = ((Context []) (Util.getPlayAdId(acontext[0])));
				//    2    4:aload_1         
				//    3    5:iconst_0        
				//    4    6:aaload          
				//    5    7:invokestatic    #39  <Method String Util.getPlayAdId(Context)>
				//    6   10:astore_1        
					StringBuilder stringbuilder1 = new StringBuilder();
				//    7   11:new             #41  <Class StringBuilder>
				//    8   14:dup             
				//    9   15:invokespecial   #42  <Method void StringBuilder()>
				//   10   18:astore_3        
					stringbuilder1.append("GoogleAdId read ");
				//   11   19:aload_3         
				//   12   20:ldc1            #44  <String "GoogleAdId read ">
				//   13   22:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
				//   14   25:pop             
					stringbuilder1.append(((String) (acontext)));
				//   15   26:aload_3         
				//   16   27:aload_1         
				//   17   28:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
				//   18   31:pop             
					ilogger1.debug(stringbuilder1.toString(), new Object[0]);
				//   19   32:aload_2         
				//   20   33:aload_3         
				//   21   34:invokevirtual   #52  <Method String StringBuilder.toString()>
				//   22   37:iconst_0        
				//   23   38:anewarray       Object[]
				//   24   41:invokeinterface #60  <Method void ILogger.debug(String, Object[])>
					return ((String) (acontext));
				//   25   46:aload_1         
				//   26   47:areturn         
				}

				protected volatile void onPostExecute(Object obj)
				{
					onPostExecute((String)obj);
				//    0    0:aload_0         
				//    1    1:aload_1         
				//    2    2:checkcast       #64  <Class String>
				//    3    5:invokevirtual   #67  <Method void onPostExecute(String)>
				//    4    8:return          
				}

				protected void onPostExecute(String s)
				{
					AdjustFactory.getLogger();
				//    0    0:invokestatic    #33  <Method ILogger AdjustFactory.getLogger()>
				//    1    3:pop             
					onDeviceIdRead.onGoogleAdIdRead(s);
				//    2    4:aload_0         
				//    3    5:getfield        #16  <Field OnDeviceIdsRead val$onDeviceIdRead>
				//    4    8:aload_1         
				//    5    9:invokeinterface #72  <Method void OnDeviceIdsRead.onGoogleAdIdRead(String)>
				//    6   14:return          
				}

				final OnDeviceIdsRead val$onDeviceIdRead;

			
			{
				onDeviceIdRead = ondeviceidsread;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field OnDeviceIdsRead val$onDeviceIdRead>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void AsyncTask()>
			//    5    9:return          
			}
			}
)).execute(((Object []) (new Context[] {
				context
			})));
	//   40   85:new             #6   <Class Adjust$1>
	//   41   88:dup             
	//   42   89:aload_1         
	//   43   90:invokespecial   #83  <Method void Adjust$1(OnDeviceIdsRead)>
	//   44   93:iconst_1        
	//   45   94:anewarray       Context[]
	//   46   97:dup             
	//   47   98:iconst_0        
	//   48   99:aload_0         
	//   49  100:aastore         
	//   50  101:invokevirtual   #89  <Method AsyncTask Adjust$1.execute(Object[])>
	//   51  104:pop             
			return;
	//   52  105:return          
		}
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*  53  106:astore_0        
		{
			ilogger.error("Unable to get GoogleAdId from the foreground (%s)", new Object[] {
				((Exception) (context)).getMessage()
			});
	//   54  107:aload_2         
	//   55  108:ldc1            #91  <String "Unable to get GoogleAdId from the foreground (%s)">
	//   56  110:iconst_1        
	//   57  111:anewarray       Object[]
	//   58  114:dup             
	//   59  115:iconst_0        
	//   60  116:aload_0         
	//   61  117:invokevirtual   #94  <Method String Exception.getMessage()>
	//   62  120:aastore         
	//   63  121:invokeinterface #97  <Method void ILogger.error(String, Object[])>
		}
	//   64  126:return          
	}

	public static boolean isEnabled()
	{
		return getDefaultInstance().isEnabled();
	//    0    0:invokestatic    #19  <Method AdjustInstance getDefaultInstance()>
	//    1    3:invokevirtual   #101 <Method boolean AdjustInstance.isEnabled()>
	//    2    6:ireturn         
	}

	public static void onCreate(AdjustConfig adjustconfig)
	{
		getDefaultInstance().onCreate(adjustconfig);
	//    0    0:invokestatic    #19  <Method AdjustInstance getDefaultInstance()>
	//    1    3:aload_0         
	//    2    4:invokevirtual   #105 <Method void AdjustInstance.onCreate(AdjustConfig)>
	//    3    7:return          
	}

	public static void onPause()
	{
		getDefaultInstance().onPause();
	//    0    0:invokestatic    #19  <Method AdjustInstance getDefaultInstance()>
	//    1    3:invokevirtual   #108 <Method void AdjustInstance.onPause()>
	//    2    6:return          
	}

	public static void onResume()
	{
		getDefaultInstance().onResume();
	//    0    0:invokestatic    #19  <Method AdjustInstance getDefaultInstance()>
	//    1    3:invokevirtual   #111 <Method void AdjustInstance.onResume()>
	//    2    6:return          
	}

	public static void setEnabled(boolean flag)
	{
		getDefaultInstance().setEnabled(flag);
	//    0    0:invokestatic    #19  <Method AdjustInstance getDefaultInstance()>
	//    1    3:iload_0         
	//    2    4:invokevirtual   #115 <Method void AdjustInstance.setEnabled(boolean)>
	//    3    7:return          
	}

	public static void setOfflineMode(boolean flag)
	{
		getDefaultInstance().setOfflineMode(flag);
	//    0    0:invokestatic    #19  <Method AdjustInstance getDefaultInstance()>
	//    1    3:iload_0         
	//    2    4:invokevirtual   #118 <Method void AdjustInstance.setOfflineMode(boolean)>
	//    3    7:return          
	}

	public static void setReferrer(String s)
	{
		getDefaultInstance().sendReferrer(s);
	//    0    0:invokestatic    #19  <Method AdjustInstance getDefaultInstance()>
	//    1    3:aload_0         
	//    2    4:invokevirtual   #122 <Method void AdjustInstance.sendReferrer(String)>
	//    3    7:return          
	}

	public static void trackEvent(AdjustEvent adjustevent)
	{
		getDefaultInstance().trackEvent(adjustevent);
	//    0    0:invokestatic    #19  <Method AdjustInstance getDefaultInstance()>
	//    1    3:aload_0         
	//    2    4:invokevirtual   #126 <Method void AdjustInstance.trackEvent(AdjustEvent)>
	//    3    7:return          
	}

	private static AdjustInstance defaultInstance;
}
