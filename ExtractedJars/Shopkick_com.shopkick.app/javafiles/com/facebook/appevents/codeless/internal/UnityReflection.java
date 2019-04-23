// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.appevents.codeless.internal;

import android.util.Log;
import java.lang.reflect.Method;

public class UnityReflection
{

	public UnityReflection()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #38  <Method void Object()>
	//    2    4:return          
	}

	public static void captureViewHierarchy()
	{
		sendMessage("UnityFacebookSDKPlugin", "CaptureViewHierarchy", "");
	//    0    0:ldc1            #14  <String "UnityFacebookSDKPlugin">
	//    1    2:ldc1            #8   <String "CaptureViewHierarchy">
	//    2    4:ldc1            #41  <String "">
	//    3    6:invokestatic    #45  <Method void sendMessage(String, String, String)>
	//    4    9:return          
	}

	public static void sendEventMapping(String s)
	{
		sendMessage("UnityFacebookSDKPlugin", "OnReceiveMapping", s);
	//    0    0:ldc1            #14  <String "UnityFacebookSDKPlugin">
	//    1    2:ldc1            #11  <String "OnReceiveMapping">
	//    2    4:aload_0         
	//    3    5:invokestatic    #45  <Method void sendMessage(String, String, String)>
	//    4    8:return          
	}

	public static void sendMessage(String s, String s1, String s2)
	{
		try
		{
			if(unityPlayer == null)
	//*   0    0:getstatic       #51  <Field Class unityPlayer>
	//*   1    3:ifnonnull       14
				unityPlayer = Class.forName("com.unity3d.player.UnityPlayer");
	//    2    6:ldc1            #18  <String "com.unity3d.player.UnityPlayer">
	//    3    8:invokestatic    #55  <Method Class Class.forName(String)>
	//    4   11:putstatic       #51  <Field Class unityPlayer>
			unityPlayer.getMethod("UnitySendMessage", new Class[] {
				java/lang/String, java/lang/String, java/lang/String
			}).invoke(((Object) (unityPlayer)), new Object[] {
				s, s1, s2
			});
	//    5   14:getstatic       #51  <Field Class unityPlayer>
	//    6   17:ldc1            #21  <String "UnitySendMessage">
	//    7   19:iconst_3        
	//    8   20:anewarray       Class[]
	//    9   23:dup             
	//   10   24:iconst_0        
	//   11   25:ldc1            #57  <Class String>
	//   12   27:aastore         
	//   13   28:dup             
	//   14   29:iconst_1        
	//   15   30:ldc1            #57  <Class String>
	//   16   32:aastore         
	//   17   33:dup             
	//   18   34:iconst_2        
	//   19   35:ldc1            #57  <Class String>
	//   20   37:aastore         
	//   21   38:invokevirtual   #61  <Method Method Class.getMethod(String, Class[])>
	//   22   41:getstatic       #51  <Field Class unityPlayer>
	//   23   44:iconst_3        
	//   24   45:anewarray       Object[]
	//   25   48:dup             
	//   26   49:iconst_0        
	//   27   50:aload_0         
	//   28   51:aastore         
	//   29   52:dup             
	//   30   53:iconst_1        
	//   31   54:aload_1         
	//   32   55:aastore         
	//   33   56:dup             
	//   34   57:iconst_2        
	//   35   58:aload_2         
	//   36   59:aastore         
	//   37   60:invokevirtual   #67  <Method Object Method.invoke(Object, Object[])>
	//   38   63:pop             
			return;
	//   39   64:return          
		}
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  40   65:astore_0        
		{
			Log.e(TAG, "Failed to send message to Unity", ((Throwable) (s)));
	//   41   66:getstatic       #34  <Field String TAG>
	//   42   69:ldc1            #69  <String "Failed to send message to Unity">
	//   43   71:aload_0         
	//   44   72:invokestatic    #75  <Method int Log.e(String, String, Throwable)>
	//   45   75:pop             
		}
	//   46   76:return          
	}

	private static final String CAPTURE_VIEW_HIERARCHY_METHOD = "CaptureViewHierarchy";
	private static final String EVENT_MAPPING_METHOD = "OnReceiveMapping";
	private static final String FB_UNITY_GAME_OBJECT = "UnityFacebookSDKPlugin";
	private static final String TAG = ((Class) (com/facebook/appevents/codeless/internal/UnityReflection)).getCanonicalName();
	private static final String UNITY_PLAYER_CLASS = "com.unity3d.player.UnityPlayer";
	private static final String UNITY_SEND_MESSAGE_METHOD = "UnitySendMessage";
	private static Class unityPlayer;

	static 
	{
	//    0    0:ldc1            #2   <Class UnityReflection>
	//    1    2:invokevirtual   #32  <Method String Class.getCanonicalName()>
	//    2    5:putstatic       #34  <Field String TAG>
	//*   3    8:return          
	}
}
