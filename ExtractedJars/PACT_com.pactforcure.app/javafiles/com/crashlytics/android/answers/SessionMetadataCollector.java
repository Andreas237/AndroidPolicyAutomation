// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.answers;

import android.content.Context;
import io.fabric.sdk.android.services.common.CommonUtils;
import io.fabric.sdk.android.services.common.IdManager;
import java.util.Map;
import java.util.UUID;

// Referenced classes of package com.crashlytics.android.answers:
//			SessionEventMetadata

class SessionMetadataCollector
{

	public SessionMetadataCollector(Context context1, IdManager idmanager, String s, String s1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		context = context1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #18  <Field Context context>
		idManager = idmanager;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #20  <Field IdManager idManager>
		versionCode = s;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #22  <Field String versionCode>
		versionName = s1;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #24  <Field String versionName>
	//   14   25:return          
	}

	public SessionEventMetadata getMetadata()
	{
		Object obj = ((Object) (idManager.getDeviceIdentifiers()));
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field IdManager idManager>
	//    2    4:invokevirtual   #33  <Method Map IdManager.getDeviceIdentifiers()>
	//    3    7:astore          6
		String s = idManager.getAppIdentifier();
	//    4    9:aload_0         
	//    5   10:getfield        #20  <Field IdManager idManager>
	//    6   13:invokevirtual   #37  <Method String IdManager.getAppIdentifier()>
	//    7   16:astore_1        
		String s1 = idManager.getAppInstallIdentifier();
	//    8   17:aload_0         
	//    9   18:getfield        #20  <Field IdManager idManager>
	//   10   21:invokevirtual   #40  <Method String IdManager.getAppInstallIdentifier()>
	//   11   24:astore_2        
		String s2 = (String)((Map) (obj)).get(((Object) (io.fabric.sdk.android.services.common.IdManager.DeviceIdentifierType.ANDROID_ID)));
	//   12   25:aload           6
	//   13   27:getstatic       #46  <Field io.fabric.sdk.android.services.common.IdManager$DeviceIdentifierType io.fabric.sdk.android.services.common.IdManager$DeviceIdentifierType.ANDROID_ID>
	//   14   30:invokeinterface #52  <Method Object Map.get(Object)>
	//   15   35:checkcast       #54  <Class String>
	//   16   38:astore_3        
		String s3 = (String)((Map) (obj)).get(((Object) (io.fabric.sdk.android.services.common.IdManager.DeviceIdentifierType.ANDROID_ADVERTISING_ID)));
	//   17   39:aload           6
	//   18   41:getstatic       #57  <Field io.fabric.sdk.android.services.common.IdManager$DeviceIdentifierType io.fabric.sdk.android.services.common.IdManager$DeviceIdentifierType.ANDROID_ADVERTISING_ID>
	//   19   44:invokeinterface #52  <Method Object Map.get(Object)>
	//   20   49:checkcast       #54  <Class String>
	//   21   52:astore          4
		Boolean boolean1 = idManager.isLimitAdTrackingEnabled();
	//   22   54:aload_0         
	//   23   55:getfield        #20  <Field IdManager idManager>
	//   24   58:invokevirtual   #61  <Method Boolean IdManager.isLimitAdTrackingEnabled()>
	//   25   61:astore          5
		obj = ((Object) ((String)((Map) (obj)).get(((Object) (io.fabric.sdk.android.services.common.IdManager.DeviceIdentifierType.FONT_TOKEN)))));
	//   26   63:aload           6
	//   27   65:getstatic       #64  <Field io.fabric.sdk.android.services.common.IdManager$DeviceIdentifierType io.fabric.sdk.android.services.common.IdManager$DeviceIdentifierType.FONT_TOKEN>
	//   28   68:invokeinterface #52  <Method Object Map.get(Object)>
	//   29   73:checkcast       #54  <Class String>
	//   30   76:astore          6
		String s4 = CommonUtils.resolveBuildId(context);
	//   31   78:aload_0         
	//   32   79:getfield        #18  <Field Context context>
	//   33   82:invokestatic    #70  <Method String CommonUtils.resolveBuildId(Context)>
	//   34   85:astore          7
		String s5 = idManager.getOsVersionString();
	//   35   87:aload_0         
	//   36   88:getfield        #20  <Field IdManager idManager>
	//   37   91:invokevirtual   #73  <Method String IdManager.getOsVersionString()>
	//   38   94:astore          8
		String s6 = idManager.getModelName();
	//   39   96:aload_0         
	//   40   97:getfield        #20  <Field IdManager idManager>
	//   41  100:invokevirtual   #76  <Method String IdManager.getModelName()>
	//   42  103:astore          9
		return new SessionEventMetadata(s, UUID.randomUUID().toString(), s1, s2, s3, boolean1, ((String) (obj)), s4, s5, s6, versionCode, versionName);
	//   43  105:new             #78  <Class SessionEventMetadata>
	//   44  108:dup             
	//   45  109:aload_1         
	//   46  110:invokestatic    #84  <Method UUID UUID.randomUUID()>
	//   47  113:invokevirtual   #87  <Method String UUID.toString()>
	//   48  116:aload_2         
	//   49  117:aload_3         
	//   50  118:aload           4
	//   51  120:aload           5
	//   52  122:aload           6
	//   53  124:aload           7
	//   54  126:aload           8
	//   55  128:aload           9
	//   56  130:aload_0         
	//   57  131:getfield        #22  <Field String versionCode>
	//   58  134:aload_0         
	//   59  135:getfield        #24  <Field String versionName>
	//   60  138:invokespecial   #90  <Method void SessionEventMetadata(String, String, String, String, String, Boolean, String, String, String, String, String, String)>
	//   61  141:areturn         
	}

	private final Context context;
	private final IdManager idManager;
	private final String versionCode;
	private final String versionName;
}
