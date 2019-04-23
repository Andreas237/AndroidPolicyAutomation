// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook;

import android.content.Intent;
import android.support.v4.content.LocalBroadcastManager;
import com.facebook.internal.Utility;
import com.facebook.internal.Validate;

// Referenced classes of package com.facebook:
//			FacebookSdk, ProfileCache, Profile

public final class ProfileManager
{

	ProfileManager(LocalBroadcastManager localbroadcastmanager, ProfileCache profilecache)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #27  <Method void Object()>
		Validate.notNull(((Object) (localbroadcastmanager)), "localBroadcastManager");
	//    2    4:aload_1         
	//    3    5:ldc1            #28  <String "localBroadcastManager">
	//    4    7:invokestatic    #34  <Method void Validate.notNull(Object, String)>
		Validate.notNull(((Object) (profilecache)), "profileCache");
	//    5   10:aload_2         
	//    6   11:ldc1            #35  <String "profileCache">
	//    7   13:invokestatic    #34  <Method void Validate.notNull(Object, String)>
		localBroadcastManager = localbroadcastmanager;
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:putfield        #37  <Field LocalBroadcastManager localBroadcastManager>
		profileCache = profilecache;
	//   11   21:aload_0         
	//   12   22:aload_2         
	//   13   23:putfield        #39  <Field ProfileCache profileCache>
	//   14   26:return          
	}

	static ProfileManager getInstance()
	{
		if(instance != null)
			break MISSING_BLOCK_LABEL_50;
	//    0    0:getstatic       #44  <Field ProfileManager instance>
	//    1    3:ifnonnull       50
		com/facebook/ProfileManager;
	//    2    6:ldc1            #2   <Class ProfileManager>
		JVM INSTR monitorenter ;
	//    3    8:monitorenter    
		if(instance == null)
	//*   4    9:getstatic       #44  <Field ProfileManager instance>
	//*   5   12:ifnonnull       38
			instance = new ProfileManager(LocalBroadcastManager.getInstance(FacebookSdk.getApplicationContext()), new ProfileCache());
	//    6   15:new             #2   <Class ProfileManager>
	//    7   18:dup             
	//    8   19:invokestatic    #50  <Method android.content.Context FacebookSdk.getApplicationContext()>
	//    9   22:invokestatic    #55  <Method LocalBroadcastManager LocalBroadcastManager.getInstance(android.content.Context)>
	//   10   25:new             #57  <Class ProfileCache>
	//   11   28:dup             
	//   12   29:invokespecial   #58  <Method void ProfileCache()>
	//   13   32:invokespecial   #60  <Method void ProfileManager(LocalBroadcastManager, ProfileCache)>
	//   14   35:putstatic       #44  <Field ProfileManager instance>
		com/facebook/ProfileManager;
	//   15   38:ldc1            #2   <Class ProfileManager>
		JVM INSTR monitorexit ;
	//   16   40:monitorexit     
		break MISSING_BLOCK_LABEL_50;
	//   17   41:goto            50
		Exception exception;
		exception;
	//   18   44:astore_0        
		com/facebook/ProfileManager;
	//   19   45:ldc1            #2   <Class ProfileManager>
		JVM INSTR monitorexit ;
	//   20   47:monitorexit     
		throw exception;
	//   21   48:aload_0         
	//   22   49:athrow          
		return instance;
	//   23   50:getstatic       #44  <Field ProfileManager instance>
	//   24   53:areturn         
	}

	private void sendCurrentProfileChangedBroadcast(Profile profile, Profile profile1)
	{
		Intent intent = new Intent("com.facebook.sdk.ACTION_CURRENT_PROFILE_CHANGED");
	//    0    0:new             #64  <Class Intent>
	//    1    3:dup             
	//    2    4:ldc1            #8   <String "com.facebook.sdk.ACTION_CURRENT_PROFILE_CHANGED">
	//    3    6:invokespecial   #67  <Method void Intent(String)>
	//    4    9:astore_3        
		intent.putExtra("com.facebook.sdk.EXTRA_OLD_PROFILE", ((android.os.Parcelable) (profile)));
	//    5   10:aload_3         
	//    6   11:ldc1            #14  <String "com.facebook.sdk.EXTRA_OLD_PROFILE">
	//    7   13:aload_1         
	//    8   14:invokevirtual   #71  <Method Intent Intent.putExtra(String, android.os.Parcelable)>
	//    9   17:pop             
		intent.putExtra("com.facebook.sdk.EXTRA_NEW_PROFILE", ((android.os.Parcelable) (profile1)));
	//   10   18:aload_3         
	//   11   19:ldc1            #11  <String "com.facebook.sdk.EXTRA_NEW_PROFILE">
	//   12   21:aload_2         
	//   13   22:invokevirtual   #71  <Method Intent Intent.putExtra(String, android.os.Parcelable)>
	//   14   25:pop             
		localBroadcastManager.sendBroadcast(intent);
	//   15   26:aload_0         
	//   16   27:getfield        #37  <Field LocalBroadcastManager localBroadcastManager>
	//   17   30:aload_3         
	//   18   31:invokevirtual   #75  <Method boolean LocalBroadcastManager.sendBroadcast(Intent)>
	//   19   34:pop             
	//   20   35:return          
	}

	private void setCurrentProfile(Profile profile, boolean flag)
	{
		Profile profile1 = currentProfile;
	//    0    0:aload_0         
	//    1    1:getfield        #80  <Field Profile currentProfile>
	//    2    4:astore_3        
		currentProfile = profile;
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:putfield        #80  <Field Profile currentProfile>
		if(flag)
	//*   6   10:iload_2         
	//*   7   11:ifeq            36
			if(profile != null)
	//*   8   14:aload_1         
	//*   9   15:ifnull          29
				profileCache.save(profile);
	//   10   18:aload_0         
	//   11   19:getfield        #39  <Field ProfileCache profileCache>
	//   12   22:aload_1         
	//   13   23:invokevirtual   #84  <Method void ProfileCache.save(Profile)>
			else
	//*  14   26:goto            36
				profileCache.clear();
	//   15   29:aload_0         
	//   16   30:getfield        #39  <Field ProfileCache profileCache>
	//   17   33:invokevirtual   #87  <Method void ProfileCache.clear()>
		if(!Utility.areObjectsEqual(((Object) (profile1)), ((Object) (profile))))
	//*  18   36:aload_3         
	//*  19   37:aload_1         
	//*  20   38:invokestatic    #93  <Method boolean Utility.areObjectsEqual(Object, Object)>
	//*  21   41:ifne            50
			sendCurrentProfileChangedBroadcast(profile1, profile);
	//   22   44:aload_0         
	//   23   45:aload_3         
	//   24   46:aload_1         
	//   25   47:invokespecial   #95  <Method void sendCurrentProfileChangedBroadcast(Profile, Profile)>
	//   26   50:return          
	}

	Profile getCurrentProfile()
	{
		return currentProfile;
	//    0    0:aload_0         
	//    1    1:getfield        #80  <Field Profile currentProfile>
	//    2    4:areturn         
	}

	boolean loadCurrentProfile()
	{
		Profile profile = profileCache.load();
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field ProfileCache profileCache>
	//    2    4:invokevirtual   #103 <Method Profile ProfileCache.load()>
	//    3    7:astore_1        
		if(profile != null)
	//*   4    8:aload_1         
	//*   5    9:ifnull          20
		{
			setCurrentProfile(profile, false);
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:iconst_0        
	//    9   15:invokespecial   #105 <Method void setCurrentProfile(Profile, boolean)>
			return true;
	//   10   18:iconst_1        
	//   11   19:ireturn         
		} else
		{
			return false;
	//   12   20:iconst_0        
	//   13   21:ireturn         
		}
	}

	void setCurrentProfile(Profile profile)
	{
		setCurrentProfile(profile, true);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_1        
	//    3    3:invokespecial   #105 <Method void setCurrentProfile(Profile, boolean)>
	//    4    6:return          
	}

	public static final String ACTION_CURRENT_PROFILE_CHANGED = "com.facebook.sdk.ACTION_CURRENT_PROFILE_CHANGED";
	public static final String EXTRA_NEW_PROFILE = "com.facebook.sdk.EXTRA_NEW_PROFILE";
	public static final String EXTRA_OLD_PROFILE = "com.facebook.sdk.EXTRA_OLD_PROFILE";
	private static volatile ProfileManager instance;
	private Profile currentProfile;
	private final LocalBroadcastManager localBroadcastManager;
	private final ProfileCache profileCache;
}
