// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.core;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.irobot.core:
//			AssetInfo, PlatformManager

public abstract class ApplicationUIServiceData
{
	private static final class CppProxy extends ApplicationUIServiceData
	{

		private native void nativeDestroy(long l);

		private native String native_getAppDownloadUrl(long l);

		private native String native_getAppRatingFeedbackMessage(long l);

		private native String native_getAppVersionViewed(long l);

		private native String native_getApplicationVersion(long l);

		private native AssetInfo native_getAssetForRemoval(long l);

		private native boolean native_getAssetResetIntent(long l);

		private native String native_getBetaProgramFeedbackMessage(long l);

		private native String native_getBetaProgramFeedbackTitle(long l);

		private native String native_getBugReportAppVersion(long l);

		private native String native_getBugReportCategory(long l);

		private native String native_getBugReportDescription(long l);

		private native HashMap native_getBugReportFiles(long l);

		private native boolean native_getBugReportParamMapConfusing(long l);

		private native String native_getBugReportParamMapId(long l);

		private native boolean native_getBugReportParamMapInComplete(long l);

		private native String native_getBugReportParamMapVersion(long l);

		private native String native_getBugReportRobotId(long l);

		private native String native_getBugReportScreenshotPath(long l);

		private native String native_getCountryCode(long l);

		private native ArrayList native_getDataStateChangelist(long l);

		private native String native_getEnvironmentName(long l);

		private native String native_getHelpContentEnvironmentName(long l);

		private native PlatformManager native_getPlatformManager(long l);

		private native String native_getRobotBehaviorLog(long l);

		private native String native_getSitecoreUrl(long l);

		private native ArrayList native_getViewStateChangelist(long l);

		private native boolean native_isCurrentCountryChina(long l);

		private native void native_setAppDownloadUrl(long l, String s);

		private native void native_setAppRatingFeedbackMessage(long l, String s);

		private native void native_setAppVersionViewed(long l, String s);

		private native void native_setApplicationVersion(long l, String s);

		private native void native_setAssetForResetOrRemoval(long l, AssetInfo assetinfo, boolean flag);

		private native void native_setBetaProgramFeedbackData(long l, String s, String s1);

		private native void native_setBugReportData(long l, String s, String s1, String s2, String s3, String s4, 
				HashMap hashmap);

		private native void native_setCountryCode(long l, String s);

		private native void native_setEnvironmentName(long l, String s);

		private native void native_setHelpContentEnvironmentName(long l, String s);

		private native void native_setPersistentMapFeedbackData(long l, String s, String s1, boolean flag, boolean flag1, String s2, 
				String s3, String s4, String s5);

		private native void native_setPlatformManager(long l, PlatformManager platformmanager);

		public void destroy()
		{
			if(!destroyed.getAndSet(true))
		//*   0    0:aload_0         
		//*   1    1:getfield        #26  <Field AtomicBoolean destroyed>
		//*   2    4:iconst_1        
		//*   3    5:invokevirtual   #92  <Method boolean AtomicBoolean.getAndSet(boolean)>
		//*   4    8:ifne            19
				nativeDestroy(nativeRef);
		//    5   11:aload_0         
		//    6   12:aload_0         
		//    7   13:getfield        #35  <Field long nativeRef>
		//    8   16:invokespecial   #94  <Method void nativeDestroy(long)>
		//    9   19:return          
		}

		protected void finalize()
		{
			destroy();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #97  <Method void destroy()>
			((Object)this).finalize();
		//    2    4:aload_0         
		//    3    5:invokespecial   #101 <Method void Object.finalize()>
		//    4    8:return          
		}

		public String getAppDownloadUrl()
		{
			return native_getAppDownloadUrl(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #105 <Method String native_getAppDownloadUrl(long)>
		//    4    8:areturn         
		}

		public String getAppRatingFeedbackMessage()
		{
			return native_getAppRatingFeedbackMessage(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #108 <Method String native_getAppRatingFeedbackMessage(long)>
		//    4    8:areturn         
		}

		public String getAppVersionViewed()
		{
			return native_getAppVersionViewed(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #111 <Method String native_getAppVersionViewed(long)>
		//    4    8:areturn         
		}

		public String getApplicationVersion()
		{
			return native_getApplicationVersion(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #114 <Method String native_getApplicationVersion(long)>
		//    4    8:areturn         
		}

		public AssetInfo getAssetForRemoval()
		{
			return native_getAssetForRemoval(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #118 <Method AssetInfo native_getAssetForRemoval(long)>
		//    4    8:areturn         
		}

		public boolean getAssetResetIntent()
		{
			return native_getAssetResetIntent(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #122 <Method boolean native_getAssetResetIntent(long)>
		//    4    8:ireturn         
		}

		public String getBetaProgramFeedbackMessage()
		{
			return native_getBetaProgramFeedbackMessage(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #125 <Method String native_getBetaProgramFeedbackMessage(long)>
		//    4    8:areturn         
		}

		public String getBetaProgramFeedbackTitle()
		{
			return native_getBetaProgramFeedbackTitle(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #128 <Method String native_getBetaProgramFeedbackTitle(long)>
		//    4    8:areturn         
		}

		public String getBugReportAppVersion()
		{
			return native_getBugReportAppVersion(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #131 <Method String native_getBugReportAppVersion(long)>
		//    4    8:areturn         
		}

		public String getBugReportCategory()
		{
			return native_getBugReportCategory(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #134 <Method String native_getBugReportCategory(long)>
		//    4    8:areturn         
		}

		public String getBugReportDescription()
		{
			return native_getBugReportDescription(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #137 <Method String native_getBugReportDescription(long)>
		//    4    8:areturn         
		}

		public HashMap getBugReportFiles()
		{
			return native_getBugReportFiles(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #141 <Method HashMap native_getBugReportFiles(long)>
		//    4    8:areturn         
		}

		public boolean getBugReportParamMapConfusing()
		{
			return native_getBugReportParamMapConfusing(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #146 <Method boolean native_getBugReportParamMapConfusing(long)>
		//    4    8:ireturn         
		}

		public String getBugReportParamMapId()
		{
			return native_getBugReportParamMapId(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #149 <Method String native_getBugReportParamMapId(long)>
		//    4    8:areturn         
		}

		public boolean getBugReportParamMapInComplete()
		{
			return native_getBugReportParamMapInComplete(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #152 <Method boolean native_getBugReportParamMapInComplete(long)>
		//    4    8:ireturn         
		}

		public String getBugReportParamMapVersion()
		{
			return native_getBugReportParamMapVersion(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #155 <Method String native_getBugReportParamMapVersion(long)>
		//    4    8:areturn         
		}

		public String getBugReportRobotId()
		{
			return native_getBugReportRobotId(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #158 <Method String native_getBugReportRobotId(long)>
		//    4    8:areturn         
		}

		public String getBugReportScreenshotPath()
		{
			return native_getBugReportScreenshotPath(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #161 <Method String native_getBugReportScreenshotPath(long)>
		//    4    8:areturn         
		}

		public String getCountryCode()
		{
			return native_getCountryCode(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #164 <Method String native_getCountryCode(long)>
		//    4    8:areturn         
		}

		public ArrayList getDataStateChangelist()
		{
			return native_getDataStateChangelist(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #168 <Method ArrayList native_getDataStateChangelist(long)>
		//    4    8:areturn         
		}

		public String getEnvironmentName()
		{
			return native_getEnvironmentName(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #172 <Method String native_getEnvironmentName(long)>
		//    4    8:areturn         
		}

		public String getHelpContentEnvironmentName()
		{
			return native_getHelpContentEnvironmentName(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #175 <Method String native_getHelpContentEnvironmentName(long)>
		//    4    8:areturn         
		}

		public PlatformManager getPlatformManager()
		{
			return native_getPlatformManager(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #179 <Method PlatformManager native_getPlatformManager(long)>
		//    4    8:areturn         
		}

		public String getRobotBehaviorLog()
		{
			return native_getRobotBehaviorLog(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #182 <Method String native_getRobotBehaviorLog(long)>
		//    4    8:areturn         
		}

		public String getSitecoreUrl()
		{
			return native_getSitecoreUrl(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #185 <Method String native_getSitecoreUrl(long)>
		//    4    8:areturn         
		}

		public ArrayList getViewStateChangelist()
		{
			return native_getViewStateChangelist(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #188 <Method ArrayList native_getViewStateChangelist(long)>
		//    4    8:areturn         
		}

		public boolean isCurrentCountryChina()
		{
			return native_isCurrentCountryChina(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #192 <Method boolean native_isCurrentCountryChina(long)>
		//    4    8:ireturn         
		}

		public void setAppDownloadUrl(String s)
		{
			native_setAppDownloadUrl(nativeRef, s);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:aload_1         
		//    4    6:invokespecial   #195 <Method void native_setAppDownloadUrl(long, String)>
		//    5    9:return          
		}

		public void setAppRatingFeedbackMessage(String s)
		{
			native_setAppRatingFeedbackMessage(nativeRef, s);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:aload_1         
		//    4    6:invokespecial   #198 <Method void native_setAppRatingFeedbackMessage(long, String)>
		//    5    9:return          
		}

		public void setAppVersionViewed(String s)
		{
			native_setAppVersionViewed(nativeRef, s);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:aload_1         
		//    4    6:invokespecial   #201 <Method void native_setAppVersionViewed(long, String)>
		//    5    9:return          
		}

		public void setApplicationVersion(String s)
		{
			native_setApplicationVersion(nativeRef, s);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:aload_1         
		//    4    6:invokespecial   #204 <Method void native_setApplicationVersion(long, String)>
		//    5    9:return          
		}

		public void setAssetForResetOrRemoval(AssetInfo assetinfo, boolean flag)
		{
			native_setAssetForResetOrRemoval(nativeRef, assetinfo, flag);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:aload_1         
		//    4    6:iload_2         
		//    5    7:invokespecial   #208 <Method void native_setAssetForResetOrRemoval(long, AssetInfo, boolean)>
		//    6   10:return          
		}

		public void setBetaProgramFeedbackData(String s, String s1)
		{
			native_setBetaProgramFeedbackData(nativeRef, s, s1);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:aload_1         
		//    4    6:aload_2         
		//    5    7:invokespecial   #212 <Method void native_setBetaProgramFeedbackData(long, String, String)>
		//    6   10:return          
		}

		public void setBugReportData(String s, String s1, String s2, String s3, String s4, HashMap hashmap)
		{
			native_setBugReportData(nativeRef, s, s1, s2, s3, s4, hashmap);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:aload_1         
		//    4    6:aload_2         
		//    5    7:aload_3         
		//    6    8:aload           4
		//    7   10:aload           5
		//    8   12:aload           6
		//    9   14:invokespecial   #216 <Method void native_setBugReportData(long, String, String, String, String, String, HashMap)>
		//   10   17:return          
		}

		public void setCountryCode(String s)
		{
			native_setCountryCode(nativeRef, s);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:aload_1         
		//    4    6:invokespecial   #220 <Method void native_setCountryCode(long, String)>
		//    5    9:return          
		}

		public void setEnvironmentName(String s)
		{
			native_setEnvironmentName(nativeRef, s);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:aload_1         
		//    4    6:invokespecial   #223 <Method void native_setEnvironmentName(long, String)>
		//    5    9:return          
		}

		public void setHelpContentEnvironmentName(String s)
		{
			native_setHelpContentEnvironmentName(nativeRef, s);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:aload_1         
		//    4    6:invokespecial   #226 <Method void native_setHelpContentEnvironmentName(long, String)>
		//    5    9:return          
		}

		public void setPersistentMapFeedbackData(String s, String s1, boolean flag, boolean flag1, String s2, String s3, String s4, 
				String s5)
		{
			native_setPersistentMapFeedbackData(nativeRef, s, s1, flag, flag1, s2, s3, s4, s5);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:aload_1         
		//    4    6:aload_2         
		//    5    7:iload_3         
		//    6    8:iload           4
		//    7   10:aload           5
		//    8   12:aload           6
		//    9   14:aload           7
		//   10   16:aload           8
		//   11   18:invokespecial   #230 <Method void native_setPersistentMapFeedbackData(long, String, String, boolean, boolean, String, String, String, String)>
		//   12   21:return          
		}

		public void setPlatformManager(PlatformManager platformmanager)
		{
			native_setPlatformManager(nativeRef, platformmanager);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:aload_1         
		//    4    6:invokespecial   #234 <Method void native_setPlatformManager(long, PlatformManager)>
		//    5    9:return          
		}

		static final boolean $assertionsDisabled = false;
		private final AtomicBoolean destroyed = new AtomicBoolean(false);
		private final long nativeRef;

		static 
		{
		//    0    0:return          
		}

		private CppProxy(long l)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #19  <Method void ApplicationUIServiceData()>
		//    2    4:aload_0         
		//    3    5:new             #21  <Class AtomicBoolean>
		//    4    8:dup             
		//    5    9:iconst_0        
		//    6   10:invokespecial   #24  <Method void AtomicBoolean(boolean)>
		//    7   13:putfield        #26  <Field AtomicBoolean destroyed>
			if(l == 0L)
		//*   8   16:lload_1         
		//*   9   17:lconst_0        
		//*  10   18:lcmp            
		//*  11   19:ifne            32
			{
				throw new RuntimeException("nativeRef is zero");
		//   12   22:new             #28  <Class RuntimeException>
		//   13   25:dup             
		//   14   26:ldc1            #30  <String "nativeRef is zero">
		//   15   28:invokespecial   #33  <Method void RuntimeException(String)>
		//   16   31:athrow          
			} else
			{
				nativeRef = l;
		//   17   32:aload_0         
		//   18   33:lload_1         
		//   19   34:putfield        #35  <Field long nativeRef>
				return;
		//   20   37:return          
			}
		}
	}


	public ApplicationUIServiceData()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #30  <Method void Object()>
	//    2    4:return          
	}

	public static native ApplicationUIServiceData create();

	public abstract String getAppDownloadUrl();

	public abstract String getAppRatingFeedbackMessage();

	public abstract String getAppVersionViewed();

	public abstract String getApplicationVersion();

	public abstract AssetInfo getAssetForRemoval();

	public abstract boolean getAssetResetIntent();

	public abstract String getBetaProgramFeedbackMessage();

	public abstract String getBetaProgramFeedbackTitle();

	public abstract String getBugReportAppVersion();

	public abstract String getBugReportCategory();

	public abstract String getBugReportDescription();

	public abstract HashMap getBugReportFiles();

	public abstract boolean getBugReportParamMapConfusing();

	public abstract String getBugReportParamMapId();

	public abstract boolean getBugReportParamMapInComplete();

	public abstract String getBugReportParamMapVersion();

	public abstract String getBugReportRobotId();

	public abstract String getBugReportScreenshotPath();

	public abstract String getCountryCode();

	public abstract ArrayList getDataStateChangelist();

	public abstract String getEnvironmentName();

	public abstract String getHelpContentEnvironmentName();

	public abstract PlatformManager getPlatformManager();

	public abstract String getRobotBehaviorLog();

	public abstract String getSitecoreUrl();

	public abstract ArrayList getViewStateChangelist();

	public abstract boolean isCurrentCountryChina();

	public abstract void setAppDownloadUrl(String s);

	public abstract void setAppRatingFeedbackMessage(String s);

	public abstract void setAppVersionViewed(String s);

	public abstract void setApplicationVersion(String s);

	public abstract void setAssetForResetOrRemoval(AssetInfo assetinfo, boolean flag);

	public abstract void setBetaProgramFeedbackData(String s, String s1);

	public abstract void setBugReportData(String s, String s1, String s2, String s3, String s4, HashMap hashmap);

	public abstract void setCountryCode(String s);

	public abstract void setEnvironmentName(String s);

	public abstract void setHelpContentEnvironmentName(String s);

	public abstract void setPersistentMapFeedbackData(String s, String s1, boolean flag, boolean flag1, String s2, String s3, String s4, 
			String s5);

	public abstract void setPlatformManager(PlatformManager platformmanager);

	public static final String DEFAULT_COUNTRY_CODE = "US";
	public static final String DEFAULT_LANGUAGE_CODE = "en-US";
	public static final String SERVICES_CONTENT_URL_PATH = "/services/content/";
	public static final String SITECORE_HOST_CHINA = "https://appcontent.irobot.cn";
	public static final String SITECORE_HOST_MAIN_PROD = "https://www.irobot.com/services/content/";
	public static final String SITECORE_HOST_MAIN_STAGING = "https://ca.authoring.irobot.com/services/content/";
}
