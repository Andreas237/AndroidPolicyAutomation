// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android;

import android.content.*;
import android.database.Cursor;
import android.net.Uri;
import io.fabric.sdk.android.*;
import io.fabric.sdk.android.services.common.FirebaseInfo;

// Referenced classes of package com.crashlytics.android:
//			ManifestEnabledCheckStrategy, Crashlytics

public class CrashlyticsInitProvider extends ContentProvider
{
	static interface EnabledCheckStrategy
	{

		public abstract boolean isCrashlyticsEnabled(Context context);
	}


	public CrashlyticsInitProvider()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void ContentProvider()>
	//    2    4:return          
	}

	public int delete(Uri uri, String s, String as[])
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public String getType(Uri uri)
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public Uri insert(Uri uri, ContentValues contentvalues)
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public boolean onCreate()
	{
		IllegalStateException illegalstateexception;
		Context context = getContext();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #30  <Method Context getContext()>
	//    2    4:astore_1        
		if(shouldInitializeFabric(context, new FirebaseInfo(), ((EnabledCheckStrategy) (new ManifestEnabledCheckStrategy()))))
	//*   3    5:aload_0         
	//*   4    6:aload_1         
	//*   5    7:new             #32  <Class FirebaseInfo>
	//*   6   10:dup             
	//*   7   11:invokespecial   #33  <Method void FirebaseInfo()>
	//*   8   14:new             #35  <Class ManifestEnabledCheckStrategy>
	//*   9   17:dup             
	//*  10   18:invokespecial   #36  <Method void ManifestEnabledCheckStrategy()>
	//*  11   21:invokevirtual   #40  <Method boolean shouldInitializeFabric(Context, FirebaseInfo, CrashlyticsInitProvider$EnabledCheckStrategy)>
	//*  12   24:ifeq            74
		{
			try
			{
				Fabric.with(context, new Kit[] {
					new Crashlytics()
				});
	//   13   27:aload_1         
	//   14   28:iconst_1        
	//   15   29:anewarray       Kit[]
	//   16   32:dup             
	//   17   33:iconst_0        
	//   18   34:new             #44  <Class Crashlytics>
	//   19   37:dup             
	//   20   38:invokespecial   #45  <Method void Crashlytics()>
	//   21   41:aastore         
	//   22   42:invokestatic    #51  <Method Fabric Fabric.with(Context, Kit[])>
	//   23   45:pop             
				Fabric.getLogger().i("CrashlyticsInitProvider", "CrashlyticsInitProvider initialization successful");
	//   24   46:invokestatic    #55  <Method Logger Fabric.getLogger()>
	//   25   49:ldc1            #11  <String "CrashlyticsInitProvider">
	//   26   51:ldc1            #57  <String "CrashlyticsInitProvider initialization successful">
	//   27   53:invokeinterface #63  <Method void Logger.i(String, String)>
			}
	//*  28   58:iconst_1        
	//*  29   59:ireturn         
	//*  30   60:invokestatic    #55  <Method Logger Fabric.getLogger()>
	//*  31   63:ldc1            #11  <String "CrashlyticsInitProvider">
	//*  32   65:ldc1            #65  <String "CrashlyticsInitProvider initialization unsuccessful">
	//*  33   67:invokeinterface #63  <Method void Logger.i(String, String)>
	//*  34   72:iconst_0        
	//*  35   73:ireturn         
	//*  36   74:iconst_1        
	//*  37   75:ireturn         
			// Misplaced declaration of an exception variable
			catch(IllegalStateException illegalstateexception)
			{
				Fabric.getLogger().i("CrashlyticsInitProvider", "CrashlyticsInitProvider initialization unsuccessful");
				return false;
			}
			return true;
		} else
		{
			return true;
		}
	//*  38   76:astore_1        
	//*  39   77:goto            60
	}

	public Cursor query(Uri uri, String as[], String s, String as1[], String s1)
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	boolean shouldInitializeFabric(Context context, FirebaseInfo firebaseinfo, EnabledCheckStrategy enabledcheckstrategy)
	{
		if(firebaseinfo.isFirebaseCrashlyticsEnabled(context))
	//*   0    0:aload_2         
	//*   1    1:aload_1         
	//*   2    2:invokevirtual   #71  <Method boolean FirebaseInfo.isFirebaseCrashlyticsEnabled(Context)>
	//*   3    5:ifeq            16
			return enabledcheckstrategy.isCrashlyticsEnabled(context);
	//    4    8:aload_3         
	//    5    9:aload_1         
	//    6   10:invokeinterface #74  <Method boolean CrashlyticsInitProvider$EnabledCheckStrategy.isCrashlyticsEnabled(Context)>
	//    7   15:ireturn         
		else
			return firebaseinfo.isAutoInitializeFlagEnabled(context);
	//    8   16:aload_2         
	//    9   17:aload_1         
	//   10   18:invokevirtual   #77  <Method boolean FirebaseInfo.isAutoInitializeFlagEnabled(Context)>
	//   11   21:ireturn         
	}

	public int update(Uri uri, ContentValues contentvalues, String s, String as[])
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	private static final String TAG = "CrashlyticsInitProvider";
}
