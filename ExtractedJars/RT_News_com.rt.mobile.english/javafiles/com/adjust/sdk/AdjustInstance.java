// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.adjust.sdk;

import android.net.Uri;

// Referenced classes of package com.adjust.sdk:
//			ILogger, AdjustFactory, ActivityHandler, AdjustConfig, 
//			AdjustEvent

public class AdjustInstance
{

	public AdjustInstance()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
	//    2    4:return          
	}

	private boolean checkActivityHandler()
	{
		if(activityHandler == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #19  <Field ActivityHandler activityHandler>
	//*   2    4:ifnonnull       23
		{
			getLogger().error("Adjust not initialized correctly", new Object[0]);
	//    3    7:invokestatic    #23  <Method ILogger getLogger()>
	//    4   10:ldc1            #25  <String "Adjust not initialized correctly">
	//    5   12:iconst_0        
	//    6   13:anewarray       Object[]
	//    7   16:invokeinterface #31  <Method void ILogger.error(String, Object[])>
			return false;
	//    8   21:iconst_0        
	//    9   22:ireturn         
		} else
		{
			return true;
	//   10   23:iconst_1        
	//   11   24:ireturn         
		}
	}

	private static ILogger getLogger()
	{
		return AdjustFactory.getLogger();
	//    0    0:invokestatic    #34  <Method ILogger AdjustFactory.getLogger()>
	//    1    3:areturn         
	}

	public void appWillOpenUrl(Uri uri)
	{
		if(!checkActivityHandler())
	//*   0    0:aload_0         
	//*   1    1:invokespecial   #38  <Method boolean checkActivityHandler()>
	//*   2    4:ifne            8
		{
			return;
	//    3    7:return          
		} else
		{
			long l = System.currentTimeMillis();
	//    4    8:invokestatic    #44  <Method long System.currentTimeMillis()>
	//    5   11:lstore_2        
			activityHandler.readOpenUrl(uri, l);
	//    6   12:aload_0         
	//    7   13:getfield        #19  <Field ActivityHandler activityHandler>
	//    8   16:aload_1         
	//    9   17:lload_2         
	//   10   18:invokevirtual   #50  <Method void ActivityHandler.readOpenUrl(Uri, long)>
			return;
	//   11   21:return          
		}
	}

	public boolean isEnabled()
	{
		if(!checkActivityHandler())
	//*   0    0:aload_0         
	//*   1    1:invokespecial   #38  <Method boolean checkActivityHandler()>
	//*   2    4:ifne            9
			return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		else
			return activityHandler.isEnabled();
	//    5    9:aload_0         
	//    6   10:getfield        #19  <Field ActivityHandler activityHandler>
	//    7   13:invokevirtual   #53  <Method boolean ActivityHandler.isEnabled()>
	//    8   16:ireturn         
	}

	public void onCreate(AdjustConfig adjustconfig)
	{
		if(activityHandler != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #19  <Field ActivityHandler activityHandler>
	//*   2    4:ifnull          22
		{
			getLogger().error("Adjust already initialized", new Object[0]);
	//    3    7:invokestatic    #23  <Method ILogger getLogger()>
	//    4   10:ldc1            #57  <String "Adjust already initialized">
	//    5   12:iconst_0        
	//    6   13:anewarray       Object[]
	//    7   16:invokeinterface #31  <Method void ILogger.error(String, Object[])>
			return;
	//    8   21:return          
		} else
		{
			adjustconfig.referrer = referrer;
	//    9   22:aload_1         
	//   10   23:aload_0         
	//   11   24:getfield        #59  <Field String referrer>
	//   12   27:putfield        #62  <Field String AdjustConfig.referrer>
			adjustconfig.referrerClickTime = referrerClickTime;
	//   13   30:aload_1         
	//   14   31:aload_0         
	//   15   32:getfield        #64  <Field long referrerClickTime>
	//   16   35:putfield        #65  <Field long AdjustConfig.referrerClickTime>
			activityHandler = ActivityHandler.getInstance(adjustconfig);
	//   17   38:aload_0         
	//   18   39:aload_1         
	//   19   40:invokestatic    #69  <Method ActivityHandler ActivityHandler.getInstance(AdjustConfig)>
	//   20   43:putfield        #19  <Field ActivityHandler activityHandler>
			return;
	//   21   46:return          
		}
	}

	public void onPause()
	{
		if(!checkActivityHandler())
	//*   0    0:aload_0         
	//*   1    1:invokespecial   #38  <Method boolean checkActivityHandler()>
	//*   2    4:ifne            8
		{
			return;
	//    3    7:return          
		} else
		{
			activityHandler.trackSubsessionEnd();
	//    4    8:aload_0         
	//    5    9:getfield        #19  <Field ActivityHandler activityHandler>
	//    6   12:invokevirtual   #73  <Method void ActivityHandler.trackSubsessionEnd()>
			return;
	//    7   15:return          
		}
	}

	public void onResume()
	{
		if(!checkActivityHandler())
	//*   0    0:aload_0         
	//*   1    1:invokespecial   #38  <Method boolean checkActivityHandler()>
	//*   2    4:ifne            8
		{
			return;
	//    3    7:return          
		} else
		{
			activityHandler.trackSubsessionStart();
	//    4    8:aload_0         
	//    5    9:getfield        #19  <Field ActivityHandler activityHandler>
	//    6   12:invokevirtual   #77  <Method void ActivityHandler.trackSubsessionStart()>
			return;
	//    7   15:return          
		}
	}

	public void sendReferrer(String s)
	{
		long l = System.currentTimeMillis();
	//    0    0:invokestatic    #44  <Method long System.currentTimeMillis()>
	//    1    3:lstore_2        
		if(activityHandler == null)
	//*   2    4:aload_0         
	//*   3    5:getfield        #19  <Field ActivityHandler activityHandler>
	//*   4    8:ifnonnull       22
		{
			referrer = s;
	//    5   11:aload_0         
	//    6   12:aload_1         
	//    7   13:putfield        #59  <Field String referrer>
			referrerClickTime = l;
	//    8   16:aload_0         
	//    9   17:lload_2         
	//   10   18:putfield        #64  <Field long referrerClickTime>
			return;
	//   11   21:return          
		} else
		{
			activityHandler.sendReferrer(s, l);
	//   12   22:aload_0         
	//   13   23:getfield        #19  <Field ActivityHandler activityHandler>
	//   14   26:aload_1         
	//   15   27:lload_2         
	//   16   28:invokevirtual   #82  <Method void ActivityHandler.sendReferrer(String, long)>
			return;
	//   17   31:return          
		}
	}

	public void setEnabled(boolean flag)
	{
		if(!checkActivityHandler())
	//*   0    0:aload_0         
	//*   1    1:invokespecial   #38  <Method boolean checkActivityHandler()>
	//*   2    4:ifne            8
		{
			return;
	//    3    7:return          
		} else
		{
			activityHandler.setEnabled(flag);
	//    4    8:aload_0         
	//    5    9:getfield        #19  <Field ActivityHandler activityHandler>
	//    6   12:iload_1         
	//    7   13:invokevirtual   #86  <Method void ActivityHandler.setEnabled(boolean)>
			return;
	//    8   16:return          
		}
	}

	public void setOfflineMode(boolean flag)
	{
		if(!checkActivityHandler())
	//*   0    0:aload_0         
	//*   1    1:invokespecial   #38  <Method boolean checkActivityHandler()>
	//*   2    4:ifne            8
		{
			return;
	//    3    7:return          
		} else
		{
			activityHandler.setOfflineMode(flag);
	//    4    8:aload_0         
	//    5    9:getfield        #19  <Field ActivityHandler activityHandler>
	//    6   12:iload_1         
	//    7   13:invokevirtual   #89  <Method void ActivityHandler.setOfflineMode(boolean)>
			return;
	//    8   16:return          
		}
	}

	public void trackEvent(AdjustEvent adjustevent)
	{
		if(!checkActivityHandler())
	//*   0    0:aload_0         
	//*   1    1:invokespecial   #38  <Method boolean checkActivityHandler()>
	//*   2    4:ifne            8
		{
			return;
	//    3    7:return          
		} else
		{
			activityHandler.trackEvent(adjustevent);
	//    4    8:aload_0         
	//    5    9:getfield        #19  <Field ActivityHandler activityHandler>
	//    6   12:aload_1         
	//    7   13:invokevirtual   #93  <Method void ActivityHandler.trackEvent(AdjustEvent)>
			return;
	//    8   16:return          
		}
	}

	private ActivityHandler activityHandler;
	private String referrer;
	private long referrerClickTime;
}
