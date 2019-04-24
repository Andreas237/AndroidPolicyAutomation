// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.fabric.sdk.android.services.common;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Logger;
import io.fabric.sdk.android.services.persistence.PreferenceStore;
import io.fabric.sdk.android.services.persistence.PreferenceStoreImpl;

// Referenced classes of package io.fabric.sdk.android.services.common:
//			AdvertisingInfoStrategy, AdvertisingInfo, AdvertisingInfoReflectionStrategy, AdvertisingInfoServiceStrategy, 
//			BackgroundPriorityRunnable

class AdvertisingInfoProvider
{

	public AdvertisingInfoProvider(Context context1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Object()>
		context = context1.getApplicationContext();
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #31  <Method Context Context.getApplicationContext()>
	//    5    9:putfield        #33  <Field Context context>
		preferenceStore = ((PreferenceStore) (new PreferenceStoreImpl(context1, "TwitterAdvertisingInfoPreferences")));
	//    6   12:aload_0         
	//    7   13:new             #35  <Class PreferenceStoreImpl>
	//    8   16:dup             
	//    9   17:aload_1         
	//   10   18:ldc1            #10  <String "TwitterAdvertisingInfoPreferences">
	//   11   20:invokespecial   #38  <Method void PreferenceStoreImpl(Context, String)>
	//   12   23:putfield        #40  <Field PreferenceStore preferenceStore>
	//   13   26:return          
	}

	private AdvertisingInfo getAdvertisingInfoFromStrategies()
	{
		AdvertisingInfo advertisinginfo = getReflectionStrategy().getAdvertisingInfo();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #57  <Method AdvertisingInfoStrategy getReflectionStrategy()>
	//    2    4:invokeinterface #62  <Method AdvertisingInfo AdvertisingInfoStrategy.getAdvertisingInfo()>
	//    3    9:astore_1        
		if(!isInfoValid(advertisinginfo))
	//*   4   10:aload_0         
	//*   5   11:aload_1         
	//*   6   12:invokespecial   #66  <Method boolean isInfoValid(AdvertisingInfo)>
	//*   7   15:ifne            64
		{
			advertisinginfo = getServiceStrategy().getAdvertisingInfo();
	//    8   18:aload_0         
	//    9   19:invokevirtual   #69  <Method AdvertisingInfoStrategy getServiceStrategy()>
	//   10   22:invokeinterface #62  <Method AdvertisingInfo AdvertisingInfoStrategy.getAdvertisingInfo()>
	//   11   27:astore_1        
			if(!isInfoValid(advertisinginfo))
	//*  12   28:aload_0         
	//*  13   29:aload_1         
	//*  14   30:invokespecial   #66  <Method boolean isInfoValid(AdvertisingInfo)>
	//*  15   33:ifne            50
			{
				Fabric.getLogger().d("Fabric", "AdvertisingInfo not present");
	//   16   36:invokestatic    #75  <Method Logger Fabric.getLogger()>
	//   17   39:ldc1            #77  <String "Fabric">
	//   18   41:ldc1            #79  <String "AdvertisingInfo not present">
	//   19   43:invokeinterface #85  <Method void Logger.d(String, String)>
				return advertisinginfo;
	//   20   48:aload_1         
	//   21   49:areturn         
			} else
			{
				Fabric.getLogger().d("Fabric", "Using AdvertisingInfo from Service Provider");
	//   22   50:invokestatic    #75  <Method Logger Fabric.getLogger()>
	//   23   53:ldc1            #77  <String "Fabric">
	//   24   55:ldc1            #87  <String "Using AdvertisingInfo from Service Provider">
	//   25   57:invokeinterface #85  <Method void Logger.d(String, String)>
				return advertisinginfo;
	//   26   62:aload_1         
	//   27   63:areturn         
			}
		} else
		{
			Fabric.getLogger().d("Fabric", "Using AdvertisingInfo from Reflection Provider");
	//   28   64:invokestatic    #75  <Method Logger Fabric.getLogger()>
	//   29   67:ldc1            #77  <String "Fabric">
	//   30   69:ldc1            #89  <String "Using AdvertisingInfo from Reflection Provider">
	//   31   71:invokeinterface #85  <Method void Logger.d(String, String)>
			return advertisinginfo;
	//   32   76:aload_1         
	//   33   77:areturn         
		}
	}

	private boolean isInfoValid(AdvertisingInfo advertisinginfo)
	{
		return advertisinginfo != null && !TextUtils.isEmpty(((CharSequence) (advertisinginfo.advertisingId)));
	//    0    0:aload_1         
	//    1    1:ifnull          16
	//    2    4:aload_1         
	//    3    5:getfield        #94  <Field String AdvertisingInfo.advertisingId>
	//    4    8:invokestatic    #100 <Method boolean TextUtils.isEmpty(CharSequence)>
	//    5   11:ifne            16
	//    6   14:iconst_1        
	//    7   15:ireturn         
	//    8   16:iconst_0        
	//    9   17:ireturn         
	}

	private void refreshInfoIfNeededAsync(final AdvertisingInfo advertisingInfo)
	{
		(new Thread(((Runnable) (new BackgroundPriorityRunnable() {

			public void onRun()
			{
				AdvertisingInfo advertisinginfo = getAdvertisingInfoFromStrategies();
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field AdvertisingInfoProvider this$0>
			//    2    4:invokestatic    #28  <Method AdvertisingInfo AdvertisingInfoProvider.access$000(AdvertisingInfoProvider)>
			//    3    7:astore_1        
				if(!advertisingInfo.equals(((Object) (advertisinginfo))))
			//*   4    8:aload_0         
			//*   5    9:getfield        #19  <Field AdvertisingInfo val$advertisingInfo>
			//*   6   12:aload_1         
			//*   7   13:invokevirtual   #34  <Method boolean AdvertisingInfo.equals(Object)>
			//*   8   16:ifne            39
				{
					Fabric.getLogger().d("Fabric", "Asychronously getting Advertising Info and storing it to preferences");
			//    9   19:invokestatic    #40  <Method Logger Fabric.getLogger()>
			//   10   22:ldc1            #42  <String "Fabric">
			//   11   24:ldc1            #44  <String "Asychronously getting Advertising Info and storing it to preferences">
			//   12   26:invokeinterface #50  <Method void Logger.d(String, String)>
					storeInfoToPreferences(advertisinginfo);
			//   13   31:aload_0         
			//   14   32:getfield        #17  <Field AdvertisingInfoProvider this$0>
			//   15   35:aload_1         
			//   16   36:invokestatic    #53  <Method void AdvertisingInfoProvider.access$100(AdvertisingInfoProvider, AdvertisingInfo)>
				}
			//   17   39:return          
			}

			final AdvertisingInfoProvider this$0;
			final AdvertisingInfo val$advertisingInfo;

			
			{
				this$0 = AdvertisingInfoProvider.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field AdvertisingInfoProvider this$0>
				advertisingInfo = advertisinginfo;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #19  <Field AdvertisingInfo val$advertisingInfo>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #22  <Method void BackgroundPriorityRunnable()>
			//    8   14:return          
			}
		}
)))).start();
	//    0    0:new             #103 <Class Thread>
	//    1    3:dup             
	//    2    4:new             #6   <Class AdvertisingInfoProvider$1>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #105 <Method void AdvertisingInfoProvider$1(AdvertisingInfoProvider, AdvertisingInfo)>
	//    7   13:invokespecial   #108 <Method void Thread(Runnable)>
	//    8   16:invokevirtual   #111 <Method void Thread.start()>
	//    9   19:return          
	}

	private void storeInfoToPreferences(AdvertisingInfo advertisinginfo)
	{
		if(isInfoValid(advertisinginfo))
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:invokespecial   #66  <Method boolean isInfoValid(AdvertisingInfo)>
	//*   3    5:ifeq            50
		{
			preferenceStore.save(preferenceStore.edit().putString("advertising_id", advertisinginfo.advertisingId).putBoolean("limit_ad_tracking_enabled", advertisinginfo.limitAdTrackingEnabled));
	//    4    8:aload_0         
	//    5    9:getfield        #40  <Field PreferenceStore preferenceStore>
	//    6   12:aload_0         
	//    7   13:getfield        #40  <Field PreferenceStore preferenceStore>
	//    8   16:invokeinterface #120 <Method android.content.SharedPreferences$Editor PreferenceStore.edit()>
	//    9   21:ldc1            #13  <String "advertising_id">
	//   10   23:aload_1         
	//   11   24:getfield        #94  <Field String AdvertisingInfo.advertisingId>
	//   12   27:invokeinterface #126 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putString(String, String)>
	//   13   32:ldc1            #16  <String "limit_ad_tracking_enabled">
	//   14   34:aload_1         
	//   15   35:getfield        #130 <Field boolean AdvertisingInfo.limitAdTrackingEnabled>
	//   16   38:invokeinterface #134 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putBoolean(String, boolean)>
	//   17   43:invokeinterface #138 <Method boolean PreferenceStore.save(android.content.SharedPreferences$Editor)>
	//   18   48:pop             
			return;
	//   19   49:return          
		} else
		{
			preferenceStore.save(preferenceStore.edit().remove("advertising_id").remove("limit_ad_tracking_enabled"));
	//   20   50:aload_0         
	//   21   51:getfield        #40  <Field PreferenceStore preferenceStore>
	//   22   54:aload_0         
	//   23   55:getfield        #40  <Field PreferenceStore preferenceStore>
	//   24   58:invokeinterface #120 <Method android.content.SharedPreferences$Editor PreferenceStore.edit()>
	//   25   63:ldc1            #13  <String "advertising_id">
	//   26   65:invokeinterface #142 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.remove(String)>
	//   27   70:ldc1            #16  <String "limit_ad_tracking_enabled">
	//   28   72:invokeinterface #142 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.remove(String)>
	//   29   77:invokeinterface #138 <Method boolean PreferenceStore.save(android.content.SharedPreferences$Editor)>
	//   30   82:pop             
			return;
	//   31   83:return          
		}
	}

	public AdvertisingInfo getAdvertisingInfo()
	{
		AdvertisingInfo advertisinginfo = getInfoFromPreferences();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #146 <Method AdvertisingInfo getInfoFromPreferences()>
	//    2    4:astore_1        
		if(isInfoValid(advertisinginfo))
	//*   3    5:aload_0         
	//*   4    6:aload_1         
	//*   5    7:invokespecial   #66  <Method boolean isInfoValid(AdvertisingInfo)>
	//*   6   10:ifeq            32
		{
			Fabric.getLogger().d("Fabric", "Using AdvertisingInfo from Preference Store");
	//    7   13:invokestatic    #75  <Method Logger Fabric.getLogger()>
	//    8   16:ldc1            #77  <String "Fabric">
	//    9   18:ldc1            #148 <String "Using AdvertisingInfo from Preference Store">
	//   10   20:invokeinterface #85  <Method void Logger.d(String, String)>
			refreshInfoIfNeededAsync(advertisinginfo);
	//   11   25:aload_0         
	//   12   26:aload_1         
	//   13   27:invokespecial   #150 <Method void refreshInfoIfNeededAsync(AdvertisingInfo)>
			return advertisinginfo;
	//   14   30:aload_1         
	//   15   31:areturn         
		} else
		{
			AdvertisingInfo advertisinginfo1 = getAdvertisingInfoFromStrategies();
	//   16   32:aload_0         
	//   17   33:invokespecial   #47  <Method AdvertisingInfo getAdvertisingInfoFromStrategies()>
	//   18   36:astore_1        
			storeInfoToPreferences(advertisinginfo1);
	//   19   37:aload_0         
	//   20   38:aload_1         
	//   21   39:invokespecial   #53  <Method void storeInfoToPreferences(AdvertisingInfo)>
			return advertisinginfo1;
	//   22   42:aload_1         
	//   23   43:areturn         
		}
	}

	protected AdvertisingInfo getInfoFromPreferences()
	{
		return new AdvertisingInfo(preferenceStore.get().getString("advertising_id", ""), preferenceStore.get().getBoolean("limit_ad_tracking_enabled", false));
	//    0    0:new             #91  <Class AdvertisingInfo>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #40  <Field PreferenceStore preferenceStore>
	//    4    8:invokeinterface #154 <Method SharedPreferences PreferenceStore.get()>
	//    5   13:ldc1            #13  <String "advertising_id">
	//    6   15:ldc1            #156 <String "">
	//    7   17:invokeinterface #162 <Method String SharedPreferences.getString(String, String)>
	//    8   22:aload_0         
	//    9   23:getfield        #40  <Field PreferenceStore preferenceStore>
	//   10   26:invokeinterface #154 <Method SharedPreferences PreferenceStore.get()>
	//   11   31:ldc1            #16  <String "limit_ad_tracking_enabled">
	//   12   33:iconst_0        
	//   13   34:invokeinterface #166 <Method boolean SharedPreferences.getBoolean(String, boolean)>
	//   14   39:invokespecial   #169 <Method void AdvertisingInfo(String, boolean)>
	//   15   42:areturn         
	}

	public AdvertisingInfoStrategy getReflectionStrategy()
	{
		return ((AdvertisingInfoStrategy) (new AdvertisingInfoReflectionStrategy(context)));
	//    0    0:new             #171 <Class AdvertisingInfoReflectionStrategy>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #33  <Field Context context>
	//    4    8:invokespecial   #173 <Method void AdvertisingInfoReflectionStrategy(Context)>
	//    5   11:areturn         
	}

	public AdvertisingInfoStrategy getServiceStrategy()
	{
		return ((AdvertisingInfoStrategy) (new AdvertisingInfoServiceStrategy(context)));
	//    0    0:new             #175 <Class AdvertisingInfoServiceStrategy>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #33  <Field Context context>
	//    4    8:invokespecial   #176 <Method void AdvertisingInfoServiceStrategy(Context)>
	//    5   11:areturn         
	}

	private static final String ADVERTISING_INFO_PREFERENCES = "TwitterAdvertisingInfoPreferences";
	private static final String PREFKEY_ADVERTISING_ID = "advertising_id";
	private static final String PREFKEY_LIMIT_AD_TRACKING = "limit_ad_tracking_enabled";
	private final Context context;
	private final PreferenceStore preferenceStore;


/*
	static AdvertisingInfo access$000(AdvertisingInfoProvider advertisinginfoprovider)
	{
		return advertisinginfoprovider.getAdvertisingInfoFromStrategies();
	//    0    0:aload_0         
	//    1    1:invokespecial   #47  <Method AdvertisingInfo getAdvertisingInfoFromStrategies()>
	//    2    4:areturn         
	}

*/


/*
	static void access$100(AdvertisingInfoProvider advertisinginfoprovider, AdvertisingInfo advertisinginfo)
	{
		advertisinginfoprovider.storeInfoToPreferences(advertisinginfo);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #53  <Method void storeInfoToPreferences(AdvertisingInfo)>
		return;
	//    3    5:return          
	}

*/
}
