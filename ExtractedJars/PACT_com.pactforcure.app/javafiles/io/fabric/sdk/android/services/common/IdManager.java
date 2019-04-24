// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.fabric.sdk.android.services.common;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import io.fabric.sdk.android.*;
import java.util.*;
import java.util.concurrent.locks.ReentrantLock;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package io.fabric.sdk.android.services.common:
//			InstallerPackageNameProvider, AdvertisingInfoProvider, CommonUtils, AdvertisingInfo, 
//			DeviceIdentifierProvider

public class IdManager
{
	public static final class DeviceIdentifierType extends Enum
	{

		public static DeviceIdentifierType valueOf(String s)
		{
			return (DeviceIdentifierType)Enum.valueOf(io/fabric/sdk/android/services/common/IdManager$DeviceIdentifierType, s);
		//    0    0:ldc1            #2   <Class IdManager$DeviceIdentifierType>
		//    1    2:aload_0         
		//    2    3:invokestatic    #62  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class IdManager$DeviceIdentifierType>
		//    4    9:areturn         
		}

		public static DeviceIdentifierType[] values()
		{
			return (DeviceIdentifierType[])((DeviceIdentifierType []) ($VALUES)).clone();
		//    0    0:getstatic       #49  <Field IdManager$DeviceIdentifierType[] $VALUES>
		//    1    3:invokevirtual   #69  <Method Object _5B_Lio.fabric.sdk.android.services.common.IdManager$DeviceIdentifierType_3B_.clone()>
		//    2    6:checkcast       #65  <Class IdManager$DeviceIdentifierType[]>
		//    3    9:areturn         
		}

		private static final DeviceIdentifierType $VALUES[];
		public static final DeviceIdentifierType ANDROID_ADVERTISING_ID;
		public static final DeviceIdentifierType ANDROID_DEVICE_ID;
		public static final DeviceIdentifierType ANDROID_ID;
		public static final DeviceIdentifierType ANDROID_SERIAL;
		public static final DeviceIdentifierType BLUETOOTH_MAC_ADDRESS;
		public static final DeviceIdentifierType FONT_TOKEN;
		public static final DeviceIdentifierType WIFI_MAC_ADDRESS;
		public final int protobufIndex;

		static 
		{
			WIFI_MAC_ADDRESS = new DeviceIdentifierType("WIFI_MAC_ADDRESS", 0, 1);
		//    0    0:new             #2   <Class IdManager$DeviceIdentifierType>
		//    1    3:dup             
		//    2    4:ldc1            #23  <String "WIFI_MAC_ADDRESS">
		//    3    6:iconst_0        
		//    4    7:iconst_1        
		//    5    8:invokespecial   #27  <Method void IdManager$DeviceIdentifierType(String, int, int)>
		//    6   11:putstatic       #29  <Field IdManager$DeviceIdentifierType WIFI_MAC_ADDRESS>
			BLUETOOTH_MAC_ADDRESS = new DeviceIdentifierType("BLUETOOTH_MAC_ADDRESS", 1, 2);
		//    7   14:new             #2   <Class IdManager$DeviceIdentifierType>
		//    8   17:dup             
		//    9   18:ldc1            #30  <String "BLUETOOTH_MAC_ADDRESS">
		//   10   20:iconst_1        
		//   11   21:iconst_2        
		//   12   22:invokespecial   #27  <Method void IdManager$DeviceIdentifierType(String, int, int)>
		//   13   25:putstatic       #32  <Field IdManager$DeviceIdentifierType BLUETOOTH_MAC_ADDRESS>
			FONT_TOKEN = new DeviceIdentifierType("FONT_TOKEN", 2, 53);
		//   14   28:new             #2   <Class IdManager$DeviceIdentifierType>
		//   15   31:dup             
		//   16   32:ldc1            #33  <String "FONT_TOKEN">
		//   17   34:iconst_2        
		//   18   35:bipush          53
		//   19   37:invokespecial   #27  <Method void IdManager$DeviceIdentifierType(String, int, int)>
		//   20   40:putstatic       #35  <Field IdManager$DeviceIdentifierType FONT_TOKEN>
			ANDROID_ID = new DeviceIdentifierType("ANDROID_ID", 3, 100);
		//   21   43:new             #2   <Class IdManager$DeviceIdentifierType>
		//   22   46:dup             
		//   23   47:ldc1            #36  <String "ANDROID_ID">
		//   24   49:iconst_3        
		//   25   50:bipush          100
		//   26   52:invokespecial   #27  <Method void IdManager$DeviceIdentifierType(String, int, int)>
		//   27   55:putstatic       #38  <Field IdManager$DeviceIdentifierType ANDROID_ID>
			ANDROID_DEVICE_ID = new DeviceIdentifierType("ANDROID_DEVICE_ID", 4, 101);
		//   28   58:new             #2   <Class IdManager$DeviceIdentifierType>
		//   29   61:dup             
		//   30   62:ldc1            #39  <String "ANDROID_DEVICE_ID">
		//   31   64:iconst_4        
		//   32   65:bipush          101
		//   33   67:invokespecial   #27  <Method void IdManager$DeviceIdentifierType(String, int, int)>
		//   34   70:putstatic       #41  <Field IdManager$DeviceIdentifierType ANDROID_DEVICE_ID>
			ANDROID_SERIAL = new DeviceIdentifierType("ANDROID_SERIAL", 5, 102);
		//   35   73:new             #2   <Class IdManager$DeviceIdentifierType>
		//   36   76:dup             
		//   37   77:ldc1            #42  <String "ANDROID_SERIAL">
		//   38   79:iconst_5        
		//   39   80:bipush          102
		//   40   82:invokespecial   #27  <Method void IdManager$DeviceIdentifierType(String, int, int)>
		//   41   85:putstatic       #44  <Field IdManager$DeviceIdentifierType ANDROID_SERIAL>
			ANDROID_ADVERTISING_ID = new DeviceIdentifierType("ANDROID_ADVERTISING_ID", 6, 103);
		//   42   88:new             #2   <Class IdManager$DeviceIdentifierType>
		//   43   91:dup             
		//   44   92:ldc1            #45  <String "ANDROID_ADVERTISING_ID">
		//   45   94:bipush          6
		//   46   96:bipush          103
		//   47   98:invokespecial   #27  <Method void IdManager$DeviceIdentifierType(String, int, int)>
		//   48  101:putstatic       #47  <Field IdManager$DeviceIdentifierType ANDROID_ADVERTISING_ID>
			$VALUES = (new DeviceIdentifierType[] {
				WIFI_MAC_ADDRESS, BLUETOOTH_MAC_ADDRESS, FONT_TOKEN, ANDROID_ID, ANDROID_DEVICE_ID, ANDROID_SERIAL, ANDROID_ADVERTISING_ID
			});
		//   49  104:bipush          7
		//   50  106:anewarray       DeviceIdentifierType[]
		//   51  109:dup             
		//   52  110:iconst_0        
		//   53  111:getstatic       #29  <Field IdManager$DeviceIdentifierType WIFI_MAC_ADDRESS>
		//   54  114:aastore         
		//   55  115:dup             
		//   56  116:iconst_1        
		//   57  117:getstatic       #32  <Field IdManager$DeviceIdentifierType BLUETOOTH_MAC_ADDRESS>
		//   58  120:aastore         
		//   59  121:dup             
		//   60  122:iconst_2        
		//   61  123:getstatic       #35  <Field IdManager$DeviceIdentifierType FONT_TOKEN>
		//   62  126:aastore         
		//   63  127:dup             
		//   64  128:iconst_3        
		//   65  129:getstatic       #38  <Field IdManager$DeviceIdentifierType ANDROID_ID>
		//   66  132:aastore         
		//   67  133:dup             
		//   68  134:iconst_4        
		//   69  135:getstatic       #41  <Field IdManager$DeviceIdentifierType ANDROID_DEVICE_ID>
		//   70  138:aastore         
		//   71  139:dup             
		//   72  140:iconst_5        
		//   73  141:getstatic       #44  <Field IdManager$DeviceIdentifierType ANDROID_SERIAL>
		//   74  144:aastore         
		//   75  145:dup             
		//   76  146:bipush          6
		//   77  148:getstatic       #47  <Field IdManager$DeviceIdentifierType ANDROID_ADVERTISING_ID>
		//   78  151:aastore         
		//   79  152:putstatic       #49  <Field IdManager$DeviceIdentifierType[] $VALUES>
		//*  80  155:return          
		}

		private DeviceIdentifierType(String s, int i, int j)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #53  <Method void Enum(String, int)>
			protobufIndex = j;
		//    4    6:aload_0         
		//    5    7:iload_3         
		//    6    8:putfield        #55  <Field int protobufIndex>
		//    7   11:return          
		}
	}


	public IdManager(Context context, String s, String s1, Collection collection)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #70  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #72  <Class ReentrantLock>
	//    4    8:dup             
	//    5    9:invokespecial   #73  <Method void ReentrantLock()>
	//    6   12:putfield        #75  <Field ReentrantLock installationIdLock>
		if(context == null)
	//*   7   15:aload_1         
	//*   8   16:ifnonnull       29
			throw new IllegalArgumentException("appContext must not be null");
	//    9   19:new             #77  <Class IllegalArgumentException>
	//   10   22:dup             
	//   11   23:ldc1            #79  <String "appContext must not be null">
	//   12   25:invokespecial   #82  <Method void IllegalArgumentException(String)>
	//   13   28:athrow          
		if(s == null)
	//*  14   29:aload_2         
	//*  15   30:ifnonnull       43
			throw new IllegalArgumentException("appIdentifier must not be null");
	//   16   33:new             #77  <Class IllegalArgumentException>
	//   17   36:dup             
	//   18   37:ldc1            #84  <String "appIdentifier must not be null">
	//   19   39:invokespecial   #82  <Method void IllegalArgumentException(String)>
	//   20   42:athrow          
		if(collection == null)
	//*  21   43:aload           4
	//*  22   45:ifnonnull       58
			throw new IllegalArgumentException("kits must not be null");
	//   23   48:new             #77  <Class IllegalArgumentException>
	//   24   51:dup             
	//   25   52:ldc1            #86  <String "kits must not be null">
	//   26   54:invokespecial   #82  <Method void IllegalArgumentException(String)>
	//   27   57:athrow          
		appContext = context;
	//   28   58:aload_0         
	//   29   59:aload_1         
	//   30   60:putfield        #88  <Field Context appContext>
		appIdentifier = s;
	//   31   63:aload_0         
	//   32   64:aload_2         
	//   33   65:putfield        #90  <Field String appIdentifier>
		appInstallIdentifier = s1;
	//   34   68:aload_0         
	//   35   69:aload_3         
	//   36   70:putfield        #92  <Field String appInstallIdentifier>
		kits = collection;
	//   37   73:aload_0         
	//   38   74:aload           4
	//   39   76:putfield        #94  <Field Collection kits>
	//   40   79:aload_0         
	//   41   80:new             #96  <Class InstallerPackageNameProvider>
	//   42   83:dup             
	//   43   84:invokespecial   #97  <Method void InstallerPackageNameProvider()>
	//   44   87:putfield        #99  <Field InstallerPackageNameProvider installerPackageNameProvider>
		advertisingInfoProvider = new AdvertisingInfoProvider(context);
	//   45   90:aload_0         
	//   46   91:new             #101 <Class AdvertisingInfoProvider>
	//   47   94:dup             
	//   48   95:aload_1         
	//   49   96:invokespecial   #104 <Method void AdvertisingInfoProvider(Context)>
	//   50   99:putfield        #106 <Field AdvertisingInfoProvider advertisingInfoProvider>
		collectHardwareIds = CommonUtils.getBooleanResourceValue(context, "com.crashlytics.CollectDeviceIdentifiers", true);
	//   51  102:aload_0         
	//   52  103:aload_1         
	//   53  104:ldc1            #14  <String "com.crashlytics.CollectDeviceIdentifiers">
	//   54  106:iconst_1        
	//   55  107:invokestatic    #112 <Method boolean CommonUtils.getBooleanResourceValue(Context, String, boolean)>
	//   56  110:putfield        #114 <Field boolean collectHardwareIds>
		if(!collectHardwareIds)
	//*  57  113:aload_0         
	//*  58  114:getfield        #114 <Field boolean collectHardwareIds>
	//*  59  117:ifne            152
			Fabric.getLogger().d("Fabric", (new StringBuilder()).append("Device ID collection disabled for ").append(context.getPackageName()).toString());
	//   60  120:invokestatic    #120 <Method Logger Fabric.getLogger()>
	//   61  123:ldc1            #122 <String "Fabric">
	//   62  125:new             #124 <Class StringBuilder>
	//   63  128:dup             
	//   64  129:invokespecial   #125 <Method void StringBuilder()>
	//   65  132:ldc1            #127 <String "Device ID collection disabled for ">
	//   66  134:invokevirtual   #131 <Method StringBuilder StringBuilder.append(String)>
	//   67  137:aload_1         
	//   68  138:invokevirtual   #137 <Method String Context.getPackageName()>
	//   69  141:invokevirtual   #131 <Method StringBuilder StringBuilder.append(String)>
	//   70  144:invokevirtual   #140 <Method String StringBuilder.toString()>
	//   71  147:invokeinterface #146 <Method void Logger.d(String, String)>
		collectUserIds = CommonUtils.getBooleanResourceValue(context, "com.crashlytics.CollectUserIdentifiers", true);
	//   72  152:aload_0         
	//   73  153:aload_1         
	//   74  154:ldc1            #17  <String "com.crashlytics.CollectUserIdentifiers">
	//   75  156:iconst_1        
	//   76  157:invokestatic    #112 <Method boolean CommonUtils.getBooleanResourceValue(Context, String, boolean)>
	//   77  160:putfield        #148 <Field boolean collectUserIds>
		if(!collectUserIds)
	//*  78  163:aload_0         
	//*  79  164:getfield        #148 <Field boolean collectUserIds>
	//*  80  167:ifne            202
			Fabric.getLogger().d("Fabric", (new StringBuilder()).append("User information collection disabled for ").append(context.getPackageName()).toString());
	//   81  170:invokestatic    #120 <Method Logger Fabric.getLogger()>
	//   82  173:ldc1            #122 <String "Fabric">
	//   83  175:new             #124 <Class StringBuilder>
	//   84  178:dup             
	//   85  179:invokespecial   #125 <Method void StringBuilder()>
	//   86  182:ldc1            #150 <String "User information collection disabled for ">
	//   87  184:invokevirtual   #131 <Method StringBuilder StringBuilder.append(String)>
	//   88  187:aload_1         
	//   89  188:invokevirtual   #137 <Method String Context.getPackageName()>
	//   90  191:invokevirtual   #131 <Method StringBuilder StringBuilder.append(String)>
	//   91  194:invokevirtual   #140 <Method String StringBuilder.toString()>
	//   92  197:invokeinterface #146 <Method void Logger.d(String, String)>
	//   93  202:return          
	}

	private String createInstallationUUID(SharedPreferences sharedpreferences)
	{
		installationIdLock.lock();
	//    0    0:aload_0         
	//    1    1:getfield        #75  <Field ReentrantLock installationIdLock>
	//    2    4:invokevirtual   #157 <Method void ReentrantLock.lock()>
		String s1 = sharedpreferences.getString("crashlytics.installation.id", ((String) (null)));
	//    3    7:aload_1         
	//    4    8:ldc1            #26  <String "crashlytics.installation.id">
	//    5   10:aconst_null     
	//    6   11:invokeinterface #163 <Method String SharedPreferences.getString(String, String)>
	//    7   16:astore_3        
		String s;
		s = s1;
	//    8   17:aload_3         
	//    9   18:astore_2        
		if(s1 != null)
			break MISSING_BLOCK_LABEL_54;
	//   10   19:aload_3         
	//   11   20:ifnonnull       54
		s = formatId(UUID.randomUUID().toString());
	//   12   23:aload_0         
	//   13   24:invokestatic    #169 <Method UUID UUID.randomUUID()>
	//   14   27:invokevirtual   #170 <Method String UUID.toString()>
	//   15   30:invokespecial   #173 <Method String formatId(String)>
	//   16   33:astore_2        
		sharedpreferences.edit().putString("crashlytics.installation.id", s).commit();
	//   17   34:aload_1         
	//   18   35:invokeinterface #177 <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//   19   40:ldc1            #26  <String "crashlytics.installation.id">
	//   20   42:aload_2         
	//   21   43:invokeinterface #183 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putString(String, String)>
	//   22   48:invokeinterface #187 <Method boolean android.content.SharedPreferences$Editor.commit()>
	//   23   53:pop             
		installationIdLock.unlock();
	//   24   54:aload_0         
	//   25   55:getfield        #75  <Field ReentrantLock installationIdLock>
	//   26   58:invokevirtual   #190 <Method void ReentrantLock.unlock()>
		return s;
	//   27   61:aload_2         
	//   28   62:areturn         
		sharedpreferences;
	//   29   63:astore_1        
		installationIdLock.unlock();
	//   30   64:aload_0         
	//   31   65:getfield        #75  <Field ReentrantLock installationIdLock>
	//   32   68:invokevirtual   #190 <Method void ReentrantLock.unlock()>
		throw sharedpreferences;
	//   33   71:aload_1         
	//   34   72:athrow          
	}

	private String formatId(String s)
	{
		if(s == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		else
			return ID_PATTERN.matcher(((CharSequence) (s))).replaceAll("").toLowerCase(Locale.US);
	//    4    6:getstatic       #57  <Field Pattern ID_PATTERN>
	//    5    9:aload_1         
	//    6   10:invokevirtual   #194 <Method Matcher Pattern.matcher(CharSequence)>
	//    7   13:ldc1            #196 <String "">
	//    8   15:invokevirtual   #201 <Method String Matcher.replaceAll(String)>
	//    9   18:getstatic       #207 <Field Locale Locale.US>
	//   10   21:invokevirtual   #213 <Method String String.toLowerCase(Locale)>
	//   11   24:areturn         
	}

	private void putNonNullIdInto(Map map, DeviceIdentifierType deviceidentifiertype, String s)
	{
		if(s != null)
	//*   0    0:aload_3         
	//*   1    1:ifnull          13
			map.put(((Object) (deviceidentifiertype)), ((Object) (s)));
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:invokeinterface #221 <Method Object Map.put(Object, Object)>
	//    6   12:pop             
	//    7   13:return          
	}

	private String removeForwardSlashesIn(String s)
	{
		return s.replaceAll(FORWARD_SLASH_REGEX, "");
	//    0    0:aload_1         
	//    1    1:getstatic       #65  <Field String FORWARD_SLASH_REGEX>
	//    2    4:ldc1            #196 <String "">
	//    3    6:invokevirtual   #225 <Method String String.replaceAll(String, String)>
	//    4    9:areturn         
	}

	public boolean canCollectUserIds()
	{
		return collectUserIds;
	//    0    0:aload_0         
	//    1    1:getfield        #148 <Field boolean collectUserIds>
	//    2    4:ireturn         
	}

	public String createIdHeaderValue(String s, String s1)
	{
		return "";
	//    0    0:ldc1            #196 <String "">
	//    1    2:areturn         
	}

	public String getAdvertisingId()
	{
		Object obj = null;
	//    0    0:aconst_null     
	//    1    1:astore_2        
		String s = ((String) (obj));
	//    2    2:aload_2         
	//    3    3:astore_1        
		if(collectHardwareIds)
	//*   4    4:aload_0         
	//*   5    5:getfield        #114 <Field boolean collectHardwareIds>
	//*   6    8:ifeq            27
		{
			AdvertisingInfo advertisinginfo = getAdvertisingInfo();
	//    7   11:aload_0         
	//    8   12:invokevirtual   #234 <Method AdvertisingInfo getAdvertisingInfo()>
	//    9   15:astore_3        
			s = ((String) (obj));
	//   10   16:aload_2         
	//   11   17:astore_1        
			if(advertisinginfo != null)
	//*  12   18:aload_3         
	//*  13   19:ifnull          27
				s = advertisinginfo.advertisingId;
	//   14   22:aload_3         
	//   15   23:getfield        #239 <Field String AdvertisingInfo.advertisingId>
	//   16   26:astore_1        
		}
		return s;
	//   17   27:aload_1         
	//   18   28:areturn         
	}

	AdvertisingInfo getAdvertisingInfo()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		AdvertisingInfo advertisinginfo;
		if(!fetchedAdvertisingInfo)
	//*   2    2:aload_0         
	//*   3    3:getfield        #241 <Field boolean fetchedAdvertisingInfo>
	//*   4    6:ifne            25
		{
			advertisingInfo = advertisingInfoProvider.getAdvertisingInfo();
	//    5    9:aload_0         
	//    6   10:aload_0         
	//    7   11:getfield        #106 <Field AdvertisingInfoProvider advertisingInfoProvider>
	//    8   14:invokevirtual   #242 <Method AdvertisingInfo AdvertisingInfoProvider.getAdvertisingInfo()>
	//    9   17:putfield        #244 <Field AdvertisingInfo advertisingInfo>
			fetchedAdvertisingInfo = true;
	//   10   20:aload_0         
	//   11   21:iconst_1        
	//   12   22:putfield        #241 <Field boolean fetchedAdvertisingInfo>
		}
		advertisinginfo = advertisingInfo;
	//   13   25:aload_0         
	//   14   26:getfield        #244 <Field AdvertisingInfo advertisingInfo>
	//   15   29:astore_1        
		this;
	//   16   30:aload_0         
		JVM INSTR monitorexit ;
	//   17   31:monitorexit     
		return advertisinginfo;
	//   18   32:aload_1         
	//   19   33:areturn         
		Exception exception;
		exception;
	//   20   34:astore_1        
	//*  21   35:aload_0         
		throw exception;
	//   22   36:monitorexit     
	//   23   37:aload_1         
	//   24   38:athrow          
	}

	public String getAndroidId()
	{
		Object obj = null;
	//    0    0:aconst_null     
	//    1    1:astore_2        
		String s = ((String) (obj));
	//    2    2:aload_2         
	//    3    3:astore_1        
		if(collectHardwareIds)
	//*   4    4:aload_0         
	//*   5    5:getfield        #114 <Field boolean collectHardwareIds>
	//*   6    8:ifeq            41
		{
			String s1 = android.provider.Settings.Secure.getString(appContext.getContentResolver(), "android_id");
	//    7   11:aload_0         
	//    8   12:getfield        #88  <Field Context appContext>
	//    9   15:invokevirtual   #249 <Method android.content.ContentResolver Context.getContentResolver()>
	//   10   18:ldc1            #251 <String "android_id">
	//   11   20:invokestatic    #256 <Method String android.provider.Settings$Secure.getString(android.content.ContentResolver, String)>
	//   12   23:astore_3        
			s = ((String) (obj));
	//   13   24:aload_2         
	//   14   25:astore_1        
			if(!"9774d56d682e549c".equals(((Object) (s1))))
	//*  15   26:ldc1            #11  <String "9774d56d682e549c">
	//*  16   28:aload_3         
	//*  17   29:invokevirtual   #260 <Method boolean String.equals(Object)>
	//*  18   32:ifne            41
				s = formatId(s1);
	//   19   35:aload_0         
	//   20   36:aload_3         
	//   21   37:invokespecial   #173 <Method String formatId(String)>
	//   22   40:astore_1        
		}
		return s;
	//   23   41:aload_1         
	//   24   42:areturn         
	}

	public String getAppIdentifier()
	{
		return appIdentifier;
	//    0    0:aload_0         
	//    1    1:getfield        #90  <Field String appIdentifier>
	//    2    4:areturn         
	}

	public String getAppInstallIdentifier()
	{
		String s1 = appInstallIdentifier;
	//    0    0:aload_0         
	//    1    1:getfield        #92  <Field String appInstallIdentifier>
	//    2    4:astore_2        
		String s = s1;
	//    3    5:aload_2         
	//    4    6:astore_1        
		if(s1 == null)
	//*   5    7:aload_2         
	//*   6    8:ifnonnull       41
		{
			SharedPreferences sharedpreferences = CommonUtils.getSharedPrefs(appContext);
	//    7   11:aload_0         
	//    8   12:getfield        #88  <Field Context appContext>
	//    9   15:invokestatic    #266 <Method SharedPreferences CommonUtils.getSharedPrefs(Context)>
	//   10   18:astore_3        
			String s2 = sharedpreferences.getString("crashlytics.installation.id", ((String) (null)));
	//   11   19:aload_3         
	//   12   20:ldc1            #26  <String "crashlytics.installation.id">
	//   13   22:aconst_null     
	//   14   23:invokeinterface #163 <Method String SharedPreferences.getString(String, String)>
	//   15   28:astore_2        
			s = s2;
	//   16   29:aload_2         
	//   17   30:astore_1        
			if(s2 == null)
	//*  18   31:aload_2         
	//*  19   32:ifnonnull       41
				s = createInstallationUUID(sharedpreferences);
	//   20   35:aload_0         
	//   21   36:aload_3         
	//   22   37:invokespecial   #268 <Method String createInstallationUUID(SharedPreferences)>
	//   23   40:astore_1        
		}
		return s;
	//   24   41:aload_1         
	//   25   42:areturn         
	}

	public String getBluetoothMacAddress()
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public Map getDeviceIdentifiers()
	{
		HashMap hashmap = new HashMap();
	//    0    0:new             #273 <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #274 <Method void HashMap()>
	//    3    7:astore_1        
		Iterator iterator = kits.iterator();
	//    4    8:aload_0         
	//    5    9:getfield        #94  <Field Collection kits>
	//    6   12:invokeinterface #280 <Method Iterator Collection.iterator()>
	//    7   17:astore_2        
		do
		{
			if(!iterator.hasNext())
				break;
	//    8   18:aload_2         
	//    9   19:invokeinterface #285 <Method boolean Iterator.hasNext()>
	//   10   24:ifeq            112
			Object obj = ((Object) ((Kit)iterator.next()));
	//   11   27:aload_2         
	//   12   28:invokeinterface #289 <Method Object Iterator.next()>
	//   13   33:checkcast       #291 <Class Kit>
	//   14   36:astore_3        
			if(obj instanceof DeviceIdentifierProvider)
	//*  15   37:aload_3         
	//*  16   38:instanceof      #293 <Class DeviceIdentifierProvider>
	//*  17   41:ifeq            18
			{
				obj = ((Object) (((DeviceIdentifierProvider)obj).getDeviceIdentifiers().entrySet().iterator()));
	//   18   44:aload_3         
	//   19   45:checkcast       #293 <Class DeviceIdentifierProvider>
	//   20   48:invokeinterface #295 <Method Map DeviceIdentifierProvider.getDeviceIdentifiers()>
	//   21   53:invokeinterface #299 <Method Set Map.entrySet()>
	//   22   58:invokeinterface #302 <Method Iterator Set.iterator()>
	//   23   63:astore_3        
				while(((Iterator) (obj)).hasNext()) 
	//*  24   64:aload_3         
	//*  25   65:invokeinterface #285 <Method boolean Iterator.hasNext()>
	//*  26   70:ifeq            18
				{
					java.util.Map.Entry entry = (java.util.Map.Entry)((Iterator) (obj)).next();
	//   27   73:aload_3         
	//   28   74:invokeinterface #289 <Method Object Iterator.next()>
	//   29   79:checkcast       #304 <Class java.util.Map$Entry>
	//   30   82:astore          4
					putNonNullIdInto(((Map) (hashmap)), (DeviceIdentifierType)entry.getKey(), (String)entry.getValue());
	//   31   84:aload_0         
	//   32   85:aload_1         
	//   33   86:aload           4
	//   34   88:invokeinterface #307 <Method Object java.util.Map$Entry.getKey()>
	//   35   93:checkcast       #6   <Class IdManager$DeviceIdentifierType>
	//   36   96:aload           4
	//   37   98:invokeinterface #310 <Method Object java.util.Map$Entry.getValue()>
	//   38  103:checkcast       #209 <Class String>
	//   39  106:invokespecial   #312 <Method void putNonNullIdInto(Map, IdManager$DeviceIdentifierType, String)>
				}
			}
		} while(true);
	//   40  109:goto            64
		putNonNullIdInto(((Map) (hashmap)), DeviceIdentifierType.ANDROID_ID, getAndroidId());
	//   41  112:aload_0         
	//   42  113:aload_1         
	//   43  114:getstatic       #316 <Field IdManager$DeviceIdentifierType IdManager$DeviceIdentifierType.ANDROID_ID>
	//   44  117:aload_0         
	//   45  118:invokevirtual   #318 <Method String getAndroidId()>
	//   46  121:invokespecial   #312 <Method void putNonNullIdInto(Map, IdManager$DeviceIdentifierType, String)>
		putNonNullIdInto(((Map) (hashmap)), DeviceIdentifierType.ANDROID_ADVERTISING_ID, getAdvertisingId());
	//   47  124:aload_0         
	//   48  125:aload_1         
	//   49  126:getstatic       #321 <Field IdManager$DeviceIdentifierType IdManager$DeviceIdentifierType.ANDROID_ADVERTISING_ID>
	//   50  129:aload_0         
	//   51  130:invokevirtual   #323 <Method String getAdvertisingId()>
	//   52  133:invokespecial   #312 <Method void putNonNullIdInto(Map, IdManager$DeviceIdentifierType, String)>
		return Collections.unmodifiableMap(((Map) (hashmap)));
	//   53  136:aload_1         
	//   54  137:invokestatic    #329 <Method Map Collections.unmodifiableMap(Map)>
	//   55  140:areturn         
	}

	public String getDeviceUUID()
	{
		String s = "";
	//    0    0:ldc1            #196 <String "">
	//    1    2:astore_1        
		if(collectHardwareIds)
	//*   2    3:aload_0         
	//*   3    4:getfield        #114 <Field boolean collectHardwareIds>
	//*   4    7:ifeq            51
		{
			String s1 = getAndroidId();
	//    5   10:aload_0         
	//    6   11:invokevirtual   #318 <Method String getAndroidId()>
	//    7   14:astore_2        
			s = s1;
	//    8   15:aload_2         
	//    9   16:astore_1        
			if(s1 == null)
	//*  10   17:aload_2         
	//*  11   18:ifnonnull       51
			{
				SharedPreferences sharedpreferences = CommonUtils.getSharedPrefs(appContext);
	//   12   21:aload_0         
	//   13   22:getfield        #88  <Field Context appContext>
	//   14   25:invokestatic    #266 <Method SharedPreferences CommonUtils.getSharedPrefs(Context)>
	//   15   28:astore_3        
				String s2 = sharedpreferences.getString("crashlytics.installation.id", ((String) (null)));
	//   16   29:aload_3         
	//   17   30:ldc1            #26  <String "crashlytics.installation.id">
	//   18   32:aconst_null     
	//   19   33:invokeinterface #163 <Method String SharedPreferences.getString(String, String)>
	//   20   38:astore_2        
				s = s2;
	//   21   39:aload_2         
	//   22   40:astore_1        
				if(s2 == null)
	//*  23   41:aload_2         
	//*  24   42:ifnonnull       51
					s = createInstallationUUID(sharedpreferences);
	//   25   45:aload_0         
	//   26   46:aload_3         
	//   27   47:invokespecial   #268 <Method String createInstallationUUID(SharedPreferences)>
	//   28   50:astore_1        
			}
		}
		return s;
	//   29   51:aload_1         
	//   30   52:areturn         
	}

	public String getInstallerPackageName()
	{
		return installerPackageNameProvider.getInstallerPackageName(appContext);
	//    0    0:aload_0         
	//    1    1:getfield        #99  <Field InstallerPackageNameProvider installerPackageNameProvider>
	//    2    4:aload_0         
	//    3    5:getfield        #88  <Field Context appContext>
	//    4    8:invokevirtual   #335 <Method String InstallerPackageNameProvider.getInstallerPackageName(Context)>
	//    5   11:areturn         
	}

	public String getModelName()
	{
		return String.format(Locale.US, "%s/%s", new Object[] {
			removeForwardSlashesIn(Build.MANUFACTURER), removeForwardSlashesIn(Build.MODEL)
		});
	//    0    0:getstatic       #207 <Field Locale Locale.US>
	//    1    3:ldc2            #338 <String "%s/%s">
	//    2    6:iconst_2        
	//    3    7:anewarray       Object[]
	//    4   10:dup             
	//    5   11:iconst_0        
	//    6   12:aload_0         
	//    7   13:getstatic       #343 <Field String Build.MANUFACTURER>
	//    8   16:invokespecial   #345 <Method String removeForwardSlashesIn(String)>
	//    9   19:aastore         
	//   10   20:dup             
	//   11   21:iconst_1        
	//   12   22:aload_0         
	//   13   23:getstatic       #348 <Field String Build.MODEL>
	//   14   26:invokespecial   #345 <Method String removeForwardSlashesIn(String)>
	//   15   29:aastore         
	//   16   30:invokestatic    #352 <Method String String.format(Locale, String, Object[])>
	//   17   33:areturn         
	}

	public String getOsBuildVersionString()
	{
		return removeForwardSlashesIn(android.os.Build.VERSION.INCREMENTAL);
	//    0    0:aload_0         
	//    1    1:getstatic       #358 <Field String android.os.Build$VERSION.INCREMENTAL>
	//    2    4:invokespecial   #345 <Method String removeForwardSlashesIn(String)>
	//    3    7:areturn         
	}

	public String getOsDisplayVersionString()
	{
		return removeForwardSlashesIn(android.os.Build.VERSION.RELEASE);
	//    0    0:aload_0         
	//    1    1:getstatic       #362 <Field String android.os.Build$VERSION.RELEASE>
	//    2    4:invokespecial   #345 <Method String removeForwardSlashesIn(String)>
	//    3    7:areturn         
	}

	public String getOsVersionString()
	{
		return (new StringBuilder()).append(getOsDisplayVersionString()).append("/").append(getOsBuildVersionString()).toString();
	//    0    0:new             #124 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #125 <Method void StringBuilder()>
	//    3    7:aload_0         
	//    4    8:invokevirtual   #365 <Method String getOsDisplayVersionString()>
	//    5   11:invokevirtual   #131 <Method StringBuilder StringBuilder.append(String)>
	//    6   14:ldc1            #59  <String "/">
	//    7   16:invokevirtual   #131 <Method StringBuilder StringBuilder.append(String)>
	//    8   19:aload_0         
	//    9   20:invokevirtual   #367 <Method String getOsBuildVersionString()>
	//   10   23:invokevirtual   #131 <Method StringBuilder StringBuilder.append(String)>
	//   11   26:invokevirtual   #140 <Method String StringBuilder.toString()>
	//   12   29:areturn         
	}

	public String getSerialNumber()
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public String getTelephonyId()
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public String getWifiMacAddress()
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public Boolean isLimitAdTrackingEnabled()
	{
		Object obj = null;
	//    0    0:aconst_null     
	//    1    1:astore_2        
		Boolean boolean1 = ((Boolean) (obj));
	//    2    2:aload_2         
	//    3    3:astore_1        
		if(collectHardwareIds)
	//*   4    4:aload_0         
	//*   5    5:getfield        #114 <Field boolean collectHardwareIds>
	//*   6    8:ifeq            30
		{
			AdvertisingInfo advertisinginfo = getAdvertisingInfo();
	//    7   11:aload_0         
	//    8   12:invokevirtual   #234 <Method AdvertisingInfo getAdvertisingInfo()>
	//    9   15:astore_3        
			boolean1 = ((Boolean) (obj));
	//   10   16:aload_2         
	//   11   17:astore_1        
			if(advertisinginfo != null)
	//*  12   18:aload_3         
	//*  13   19:ifnull          30
				boolean1 = Boolean.valueOf(advertisinginfo.limitAdTrackingEnabled);
	//   14   22:aload_3         
	//   15   23:getfield        #375 <Field boolean AdvertisingInfo.limitAdTrackingEnabled>
	//   16   26:invokestatic    #381 <Method Boolean Boolean.valueOf(boolean)>
	//   17   29:astore_1        
		}
		return boolean1;
	//   18   30:aload_1         
	//   19   31:areturn         
	}

	private static final String BAD_ANDROID_ID = "9774d56d682e549c";
	public static final String COLLECT_DEVICE_IDENTIFIERS = "com.crashlytics.CollectDeviceIdentifiers";
	public static final String COLLECT_USER_IDENTIFIERS = "com.crashlytics.CollectUserIdentifiers";
	public static final String DEFAULT_VERSION_NAME = "0.0";
	private static final String FORWARD_SLASH_REGEX = Pattern.quote("/");
	private static final Pattern ID_PATTERN = Pattern.compile("[^\\p{Alnum}]");
	private static final String PREFKEY_INSTALLATION_UUID = "crashlytics.installation.id";
	AdvertisingInfo advertisingInfo;
	AdvertisingInfoProvider advertisingInfoProvider;
	private final Context appContext;
	private final String appIdentifier;
	private final String appInstallIdentifier;
	private final boolean collectHardwareIds;
	private final boolean collectUserIds;
	boolean fetchedAdvertisingInfo;
	private final ReentrantLock installationIdLock = new ReentrantLock();
	private final InstallerPackageNameProvider installerPackageNameProvider = new InstallerPackageNameProvider();
	private final Collection kits;

	static 
	{
	//    0    0:ldc1            #49  <String "[^\\p{Alnum}]">
	//    1    2:invokestatic    #55  <Method Pattern Pattern.compile(String)>
	//    2    5:putstatic       #57  <Field Pattern ID_PATTERN>
	//    3    8:ldc1            #59  <String "/">
	//    4   10:invokestatic    #63  <Method String Pattern.quote(String)>
	//    5   13:putstatic       #65  <Field String FORWARD_SLASH_REGEX>
	//*   6   16:return          
	}
}
