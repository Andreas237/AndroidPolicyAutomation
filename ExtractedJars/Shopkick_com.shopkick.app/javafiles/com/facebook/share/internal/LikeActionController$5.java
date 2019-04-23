// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.share.internal;

import android.content.Context;
import android.content.SharedPreferences;
import com.facebook.*;
import com.facebook.internal.FileLruCache;
import java.util.concurrent.ConcurrentHashMap;

// Referenced classes of package com.facebook.share.internal:
//			LikeActionController

static final class LikeActionController$5 extends AccessTokenTracker
{

	protected void onCurrentAccessTokenChanged(AccessToken accesstoken, AccessToken accesstoken1)
	{
		accesstoken = ((AccessToken) (FacebookSdk.getApplicationContext()));
	//    0    0:invokestatic    #21  <Method Context FacebookSdk.getApplicationContext()>
	//    1    3:astore_1        
		if(accesstoken1 == null)
	//*   2    4:aload_2         
	//*   3    5:ifnonnull       60
		{
			int _tmp = LikeActionController.access$302((LikeActionController.access$300() + 1) % 1000);
	//    4    8:invokestatic    #25  <Method int LikeActionController.access$300()>
	//    5   11:iconst_1        
	//    6   12:iadd            
	//    7   13:sipush          1000
	//    8   16:irem            
	//    9   17:invokestatic    #29  <Method int LikeActionController.access$302(int)>
	//   10   20:pop             
			((Context) (accesstoken)).getSharedPreferences("com.facebook.LikeActionController.CONTROLLER_STORE_KEY", 0).edit().putInt("OBJECT_SUFFIX", LikeActionController.access$300()).apply();
	//   11   21:aload_1         
	//   12   22:ldc1            #31  <String "com.facebook.LikeActionController.CONTROLLER_STORE_KEY">
	//   13   24:iconst_0        
	//   14   25:invokevirtual   #37  <Method SharedPreferences Context.getSharedPreferences(String, int)>
	//   15   28:invokeinterface #43  <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//   16   33:ldc1            #45  <String "OBJECT_SUFFIX">
	//   17   35:invokestatic    #25  <Method int LikeActionController.access$300()>
	//   18   38:invokeinterface #51  <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putInt(String, int)>
	//   19   43:invokeinterface #54  <Method void android.content.SharedPreferences$Editor.apply()>
			LikeActionController.access$400().clear();
	//   20   48:invokestatic    #58  <Method ConcurrentHashMap LikeActionController.access$400()>
	//   21   51:invokevirtual   #63  <Method void ConcurrentHashMap.clear()>
			LikeActionController.access$500().clearCache();
	//   22   54:invokestatic    #67  <Method FileLruCache LikeActionController.access$500()>
	//   23   57:invokevirtual   #72  <Method void FileLruCache.clearCache()>
		}
		LikeActionController.access$600(((LikeActionController) (null)), "com.facebook.sdk.LikeActionController.DID_RESET");
	//   24   60:aconst_null     
	//   25   61:ldc1            #74  <String "com.facebook.sdk.LikeActionController.DID_RESET">
	//   26   63:invokestatic    #78  <Method void LikeActionController.access$600(LikeActionController, String)>
	//   27   66:return          
	}

	LikeActionController$5()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void AccessTokenTracker()>
	//    2    4:return          
	}
}
