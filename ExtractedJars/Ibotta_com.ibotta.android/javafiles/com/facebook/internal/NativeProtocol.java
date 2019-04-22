// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.internal;

import android.content.*;
import android.content.pm.*;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.facebook.*;
import com.facebook.login.DefaultAudience;
import java.util.*;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.facebook.internal:
//			Utility, FacebookSignatureValidator

public final class NativeProtocol
{
	private static class EffectTestAppInfo extends NativeAppInfo
	{

		protected String getLoginActivity()
		{
			return null;
		//    0    0:aconst_null     
		//    1    1:areturn         
		}

		protected String getPackage()
		{
			return "com.facebook.arstudio.player";
		//    0    0:ldc1            #20  <String "com.facebook.arstudio.player">
		//    1    2:areturn         
		}

		private EffectTestAppInfo()
		{
		//    0    0:aload_0         
		//    1    1:aconst_null     
		//    2    2:invokespecial   #12  <Method void NativeProtocol$NativeAppInfo(NativeProtocol$1)>
		//    3    5:return          
		}

	}

	private static class FBLiteAppInfo extends NativeAppInfo
	{

		protected String getLoginActivity()
		{
			return "com.facebook.lite.platform.LoginGDPDialogActivity";
		//    0    0:ldc1            #19  <String "com.facebook.lite.platform.LoginGDPDialogActivity">
		//    1    2:areturn         
		}

		protected String getPackage()
		{
			return "com.facebook.lite";
		//    0    0:ldc1            #22  <String "com.facebook.lite">
		//    1    2:areturn         
		}

		private FBLiteAppInfo()
		{
		//    0    0:aload_0         
		//    1    1:aconst_null     
		//    2    2:invokespecial   #12  <Method void NativeProtocol$NativeAppInfo(NativeProtocol$1)>
		//    3    5:return          
		}

	}

	private static class KatanaAppInfo extends NativeAppInfo
	{

		protected String getLoginActivity()
		{
			return "com.facebook.katana.ProxyAuth";
		//    0    0:ldc1            #19  <String "com.facebook.katana.ProxyAuth">
		//    1    2:areturn         
		}

		protected String getPackage()
		{
			return "com.facebook.katana";
		//    0    0:ldc1            #22  <String "com.facebook.katana">
		//    1    2:areturn         
		}

		private KatanaAppInfo()
		{
		//    0    0:aload_0         
		//    1    1:aconst_null     
		//    2    2:invokespecial   #12  <Method void NativeProtocol$NativeAppInfo(NativeProtocol$1)>
		//    3    5:return          
		}

	}

	private static class MessengerAppInfo extends NativeAppInfo
	{

		protected String getLoginActivity()
		{
			return null;
		//    0    0:aconst_null     
		//    1    1:areturn         
		}

		protected String getPackage()
		{
			return "com.facebook.orca";
		//    0    0:ldc1            #20  <String "com.facebook.orca">
		//    1    2:areturn         
		}

		private MessengerAppInfo()
		{
		//    0    0:aload_0         
		//    1    1:aconst_null     
		//    2    2:invokespecial   #12  <Method void NativeProtocol$NativeAppInfo(NativeProtocol$1)>
		//    3    5:return          
		}

	}

	private static abstract class NativeAppInfo
	{

		private void fetchAvailableVersions(boolean flag)
		{
			this;
		//    0    0:aload_0         
			JVM INSTR monitorenter ;
		//    1    1:monitorenter    
			if(flag)
				break MISSING_BLOCK_LABEL_13;
		//    2    2:iload_1         
		//    3    3:ifne            13
			if(availableVersions != null)
				break MISSING_BLOCK_LABEL_21;
		//    4    6:aload_0         
		//    5    7:getfield        #25  <Field TreeSet availableVersions>
		//    6   10:ifnonnull       21
			availableVersions = NativeProtocol.fetchAllAvailableProtocolVersionsForAppInfo(this);
		//    7   13:aload_0         
		//    8   14:aload_0         
		//    9   15:invokestatic    #29  <Method TreeSet NativeProtocol.access$000(NativeProtocol$NativeAppInfo)>
		//   10   18:putfield        #25  <Field TreeSet availableVersions>
			this;
		//   11   21:aload_0         
			JVM INSTR monitorexit ;
		//   12   22:monitorexit     
			return;
		//   13   23:return          
			Exception exception;
			exception;
		//   14   24:astore_2        
		//*  15   25:aload_0         
			throw exception;
		//   16   26:monitorexit     
		//   17   27:aload_2         
		//   18   28:athrow          
		}

		public TreeSet getAvailableVersions()
		{
			if(availableVersions == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #25  <Field TreeSet availableVersions>
		//*   2    4:ifnonnull       12
				fetchAvailableVersions(false);
		//    3    7:aload_0         
		//    4    8:iconst_0        
		//    5    9:invokespecial   #23  <Method void fetchAvailableVersions(boolean)>
			return availableVersions;
		//    6   12:aload_0         
		//    7   13:getfield        #25  <Field TreeSet availableVersions>
		//    8   16:areturn         
		}

		protected abstract String getLoginActivity();

		protected abstract String getPackage();

		private TreeSet availableVersions;


/*
		static void access$1000(NativeAppInfo nativeappinfo, boolean flag)
		{
			nativeappinfo.fetchAvailableVersions(flag);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokespecial   #23  <Method void fetchAvailableVersions(boolean)>
			return;
		//    3    5:return          
		}

*/

		private NativeAppInfo()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #14  <Method void Object()>
		//    2    4:return          
		}

	}

	public static class ProtocolVersionQueryResult
	{

		public static ProtocolVersionQueryResult create(NativeAppInfo nativeappinfo, int i)
		{
			ProtocolVersionQueryResult protocolversionqueryresult = new ProtocolVersionQueryResult();
		//    0    0:new             #2   <Class NativeProtocol$ProtocolVersionQueryResult>
		//    1    3:dup             
		//    2    4:invokespecial   #27  <Method void NativeProtocol$ProtocolVersionQueryResult()>
		//    3    7:astore_2        
			protocolversionqueryresult.nativeAppInfo = nativeappinfo;
		//    4    8:aload_2         
		//    5    9:aload_0         
		//    6   10:putfield        #20  <Field NativeProtocol$NativeAppInfo nativeAppInfo>
			protocolversionqueryresult.protocolVersion = i;
		//    7   13:aload_2         
		//    8   14:iload_1         
		//    9   15:putfield        #24  <Field int protocolVersion>
			return protocolversionqueryresult;
		//   10   18:aload_2         
		//   11   19:areturn         
		}

		public static ProtocolVersionQueryResult createEmpty()
		{
			ProtocolVersionQueryResult protocolversionqueryresult = new ProtocolVersionQueryResult();
		//    0    0:new             #2   <Class NativeProtocol$ProtocolVersionQueryResult>
		//    1    3:dup             
		//    2    4:invokespecial   #27  <Method void NativeProtocol$ProtocolVersionQueryResult()>
		//    3    7:astore_0        
			protocolversionqueryresult.protocolVersion = -1;
		//    4    8:aload_0         
		//    5    9:iconst_m1       
		//    6   10:putfield        #24  <Field int protocolVersion>
			return protocolversionqueryresult;
		//    7   13:aload_0         
		//    8   14:areturn         
		}

		public int getProtocolVersion()
		{
			return protocolVersion;
		//    0    0:aload_0         
		//    1    1:getfield        #24  <Field int protocolVersion>
		//    2    4:ireturn         
		}

		private NativeAppInfo nativeAppInfo;
		private int protocolVersion;


/*
		static NativeAppInfo access$700(ProtocolVersionQueryResult protocolversionqueryresult)
		{
			return protocolversionqueryresult.nativeAppInfo;
		//    0    0:aload_0         
		//    1    1:getfield        #20  <Field NativeProtocol$NativeAppInfo nativeAppInfo>
		//    2    4:areturn         
		}

*/


/*
		static int access$800(ProtocolVersionQueryResult protocolversionqueryresult)
		{
			return protocolversionqueryresult.protocolVersion;
		//    0    0:aload_0         
		//    1    1:getfield        #24  <Field int protocolVersion>
		//    2    4:ireturn         
		}

*/

		private ProtocolVersionQueryResult()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #15  <Method void Object()>
		//    2    4:return          
		}
	}

	private static class WakizashiAppInfo extends NativeAppInfo
	{

		protected String getLoginActivity()
		{
			return "com.facebook.katana.ProxyAuth";
		//    0    0:ldc1            #19  <String "com.facebook.katana.ProxyAuth">
		//    1    2:areturn         
		}

		protected String getPackage()
		{
			return "com.facebook.wakizashi";
		//    0    0:ldc1            #22  <String "com.facebook.wakizashi">
		//    1    2:areturn         
		}

		private WakizashiAppInfo()
		{
		//    0    0:aload_0         
		//    1    1:aconst_null     
		//    2    2:invokespecial   #12  <Method void NativeProtocol$NativeAppInfo(NativeProtocol$1)>
		//    3    5:return          
		}

	}


	public NativeProtocol()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #99  <Method void Object()>
	//    2    4:return          
	}

	private static Map buildActionToAppInfoMap()
	{
		HashMap hashmap = new HashMap();
	//    0    0:new             #109 <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #110 <Method void HashMap()>
	//    3    7:astore_0        
		ArrayList arraylist = new ArrayList();
	//    4    8:new             #112 <Class ArrayList>
	//    5   11:dup             
	//    6   12:invokespecial   #113 <Method void ArrayList()>
	//    7   15:astore_1        
		arraylist.add(((Object) (new MessengerAppInfo())));
	//    8   16:aload_1         
	//    9   17:new             #17  <Class NativeProtocol$MessengerAppInfo>
	//   10   20:dup             
	//   11   21:aconst_null     
	//   12   22:invokespecial   #116 <Method void NativeProtocol$MessengerAppInfo(NativeProtocol$1)>
	//   13   25:invokevirtual   #120 <Method boolean ArrayList.add(Object)>
	//   14   28:pop             
		((Map) (hashmap)).put("com.facebook.platform.action.request.OGACTIONPUBLISH_DIALOG", ((Object) (facebookAppInfoList)));
	//   15   29:aload_0         
	//   16   30:ldc1            #122 <String "com.facebook.platform.action.request.OGACTIONPUBLISH_DIALOG">
	//   17   32:getstatic       #50  <Field List facebookAppInfoList>
	//   18   35:invokeinterface #128 <Method Object Map.put(Object, Object)>
	//   19   40:pop             
		((Map) (hashmap)).put("com.facebook.platform.action.request.FEED_DIALOG", ((Object) (facebookAppInfoList)));
	//   20   41:aload_0         
	//   21   42:ldc1            #130 <String "com.facebook.platform.action.request.FEED_DIALOG">
	//   22   44:getstatic       #50  <Field List facebookAppInfoList>
	//   23   47:invokeinterface #128 <Method Object Map.put(Object, Object)>
	//   24   52:pop             
		((Map) (hashmap)).put("com.facebook.platform.action.request.LIKE_DIALOG", ((Object) (facebookAppInfoList)));
	//   25   53:aload_0         
	//   26   54:ldc1            #132 <String "com.facebook.platform.action.request.LIKE_DIALOG">
	//   27   56:getstatic       #50  <Field List facebookAppInfoList>
	//   28   59:invokeinterface #128 <Method Object Map.put(Object, Object)>
	//   29   64:pop             
		((Map) (hashmap)).put("com.facebook.platform.action.request.APPINVITES_DIALOG", ((Object) (facebookAppInfoList)));
	//   30   65:aload_0         
	//   31   66:ldc1            #134 <String "com.facebook.platform.action.request.APPINVITES_DIALOG">
	//   32   68:getstatic       #50  <Field List facebookAppInfoList>
	//   33   71:invokeinterface #128 <Method Object Map.put(Object, Object)>
	//   34   76:pop             
		((Map) (hashmap)).put("com.facebook.platform.action.request.MESSAGE_DIALOG", ((Object) (arraylist)));
	//   35   77:aload_0         
	//   36   78:ldc1            #136 <String "com.facebook.platform.action.request.MESSAGE_DIALOG">
	//   37   80:aload_1         
	//   38   81:invokeinterface #128 <Method Object Map.put(Object, Object)>
	//   39   86:pop             
		((Map) (hashmap)).put("com.facebook.platform.action.request.OGMESSAGEPUBLISH_DIALOG", ((Object) (arraylist)));
	//   40   87:aload_0         
	//   41   88:ldc1            #138 <String "com.facebook.platform.action.request.OGMESSAGEPUBLISH_DIALOG">
	//   42   90:aload_1         
	//   43   91:invokeinterface #128 <Method Object Map.put(Object, Object)>
	//   44   96:pop             
		((Map) (hashmap)).put("com.facebook.platform.action.request.CAMERA_EFFECT", ((Object) (effectCameraAppInfoList)));
	//   45   97:aload_0         
	//   46   98:ldc1            #140 <String "com.facebook.platform.action.request.CAMERA_EFFECT">
	//   47  100:getstatic       #55  <Field List effectCameraAppInfoList>
	//   48  103:invokeinterface #128 <Method Object Map.put(Object, Object)>
	//   49  108:pop             
		return ((Map) (hashmap));
	//   50  109:aload_0         
	//   51  110:areturn         
	}

	private static List buildEffectCameraAppInfoList()
	{
		ArrayList arraylist = new ArrayList(((Collection) (buildFacebookAppList())));
	//    0    0:new             #112 <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokestatic    #48  <Method List buildFacebookAppList()>
	//    3    7:invokespecial   #145 <Method void ArrayList(Collection)>
	//    4   10:astore_0        
		((List) (arraylist)).add(0, ((Object) (new EffectTestAppInfo())));
	//    5   11:aload_0         
	//    6   12:iconst_0        
	//    7   13:new             #8   <Class NativeProtocol$EffectTestAppInfo>
	//    8   16:dup             
	//    9   17:aconst_null     
	//   10   18:invokespecial   #146 <Method void NativeProtocol$EffectTestAppInfo(NativeProtocol$1)>
	//   11   21:invokeinterface #151 <Method void List.add(int, Object)>
		return ((List) (arraylist));
	//   12   26:aload_0         
	//   13   27:areturn         
	}

	private static List buildFacebookAppList()
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #112 <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #113 <Method void ArrayList()>
	//    3    7:astore_0        
		((List) (arraylist)).add(((Object) (new KatanaAppInfo())));
	//    4    8:aload_0         
	//    5    9:new             #14  <Class NativeProtocol$KatanaAppInfo>
	//    6   12:dup             
	//    7   13:aconst_null     
	//    8   14:invokespecial   #153 <Method void NativeProtocol$KatanaAppInfo(NativeProtocol$1)>
	//    9   17:invokeinterface #154 <Method boolean List.add(Object)>
	//   10   22:pop             
		((List) (arraylist)).add(((Object) (new WakizashiAppInfo())));
	//   11   23:aload_0         
	//   12   24:new             #26  <Class NativeProtocol$WakizashiAppInfo>
	//   13   27:dup             
	//   14   28:aconst_null     
	//   15   29:invokespecial   #155 <Method void NativeProtocol$WakizashiAppInfo(NativeProtocol$1)>
	//   16   32:invokeinterface #154 <Method boolean List.add(Object)>
	//   17   37:pop             
		return ((List) (arraylist));
	//   18   38:aload_0         
	//   19   39:areturn         
	}

	private static Uri buildPlatformProviderVersionURI(NativeAppInfo nativeappinfo)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #159 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #160 <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("content://");
	//    4    8:aload_1         
	//    5    9:ldc1            #162 <String "content://">
	//    6   11:invokevirtual   #166 <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(nativeappinfo.getPackage());
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:invokevirtual   #170 <Method String NativeProtocol$NativeAppInfo.getPackage()>
	//   11   20:invokevirtual   #166 <Method StringBuilder StringBuilder.append(String)>
	//   12   23:pop             
		stringbuilder.append(".provider.PlatformProvider/versions");
	//   13   24:aload_1         
	//   14   25:ldc1            #172 <String ".provider.PlatformProvider/versions">
	//   15   27:invokevirtual   #166 <Method StringBuilder StringBuilder.append(String)>
	//   16   30:pop             
		return Uri.parse(stringbuilder.toString());
	//   17   31:aload_1         
	//   18   32:invokevirtual   #175 <Method String StringBuilder.toString()>
	//   19   35:invokestatic    #181 <Method Uri Uri.parse(String)>
	//   20   38:areturn         
	}

	public static int computeLatestAvailableVersionFromVersionSpec(TreeSet treeset, int i, int ai[])
	{
		int j = ai.length;
	//    0    0:aload_2         
	//    1    1:arraylength     
	//    2    2:istore_3        
		treeset = ((TreeSet) (treeset.descendingIterator()));
	//    3    3:aload_0         
	//    4    4:invokevirtual   #189 <Method Iterator TreeSet.descendingIterator()>
	//    5    7:astore_0        
		byte byte0 = -1;
	//    6    8:iconst_m1       
	//    7    9:istore          6
		j--;
	//    8   11:iload_3         
	//    9   12:iconst_1        
	//   10   13:isub            
	//   11   14:istore_3        
		int i1 = -1;
	//   12   15:iconst_m1       
	//   13   16:istore          5
		while(((Iterator) (treeset)).hasNext()) 
	//*  14   18:aload_0         
	//*  15   19:invokeinterface #195 <Method boolean Iterator.hasNext()>
	//*  16   24:ifeq            118
		{
			int k1 = ((Integer)((Iterator) (treeset)).next()).intValue();
	//   17   27:aload_0         
	//   18   28:invokeinterface #199 <Method Object Iterator.next()>
	//   19   33:checkcast       #71  <Class Integer>
	//   20   36:invokevirtual   #203 <Method int Integer.intValue()>
	//   21   39:istore          8
			int j1 = Math.max(i1, k1);
	//   22   41:iload           5
	//   23   43:iload           8
	//   24   45:invokestatic    #209 <Method int Math.max(int, int)>
	//   25   48:istore          7
			int l;
			for(l = j; l >= 0 && ai[l] > k1; l--);
	//   26   50:iload_3         
	//   27   51:istore          4
	//   28   53:iload           4
	//   29   55:iflt            76
	//   30   58:aload_2         
	//   31   59:iload           4
	//   32   61:iaload          
	//   33   62:iload           8
	//   34   64:icmple          76
	//   35   67:iload           4
	//   36   69:iconst_1        
	//   37   70:isub            
	//   38   71:istore          4
	//*  39   73:goto            53
			if(l < 0)
	//*  40   76:iload           4
	//*  41   78:ifge            83
				return -1;
	//   42   81:iconst_m1       
	//   43   82:ireturn         
			i1 = j1;
	//   44   83:iload           7
	//   45   85:istore          5
			j = l;
	//   46   87:iload           4
	//   47   89:istore_3        
			if(ai[l] == k1)
	//*  48   90:aload_2         
	//*  49   91:iload           4
	//*  50   93:iaload          
	//*  51   94:iload           8
	//*  52   96:icmpne          18
			{
				int k = ((int) (byte0));
	//   53   99:iload           6
	//   54  101:istore_3        
				if(l % 2 == 0)
	//*  55  102:iload           4
	//*  56  104:iconst_2        
	//*  57  105:irem            
	//*  58  106:ifne            116
					k = Math.min(j1, i);
	//   59  109:iload           7
	//   60  111:iload_1         
	//   61  112:invokestatic    #212 <Method int Math.min(int, int)>
	//   62  115:istore_3        
				return k;
	//   63  116:iload_3         
	//   64  117:ireturn         
			}
		}
		return -1;
	//   65  118:iconst_m1       
	//   66  119:ireturn         
	}

	public static Bundle createBundleForException(FacebookException facebookexception)
	{
		if(facebookexception == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		Bundle bundle = new Bundle();
	//    4    6:new             #217 <Class Bundle>
	//    5    9:dup             
	//    6   10:invokespecial   #218 <Method void Bundle()>
	//    7   13:astore_1        
		bundle.putString("error_description", facebookexception.toString());
	//    8   14:aload_1         
	//    9   15:ldc1            #220 <String "error_description">
	//   10   17:aload_0         
	//   11   18:invokevirtual   #223 <Method String FacebookException.toString()>
	//   12   21:invokevirtual   #227 <Method void Bundle.putString(String, String)>
		if(facebookexception instanceof FacebookOperationCanceledException)
	//*  13   24:aload_0         
	//*  14   25:instanceof      #229 <Class FacebookOperationCanceledException>
	//*  15   28:ifeq            39
			bundle.putString("error_type", "UserCanceled");
	//   16   31:aload_1         
	//   17   32:ldc1            #231 <String "error_type">
	//   18   34:ldc1            #233 <String "UserCanceled">
	//   19   36:invokevirtual   #227 <Method void Bundle.putString(String, String)>
		return bundle;
	//   20   39:aload_1         
	//   21   40:areturn         
	}

	public static Intent createFacebookLiteIntent(Context context, String s, Collection collection, String s1, boolean flag, boolean flag1, DefaultAudience defaultaudience, String s2, 
			String s3)
	{
		FBLiteAppInfo fbliteappinfo = new FBLiteAppInfo();
	//    0    0:new             #11  <Class NativeProtocol$FBLiteAppInfo>
	//    1    3:dup             
	//    2    4:aconst_null     
	//    3    5:invokespecial   #236 <Method void NativeProtocol$FBLiteAppInfo(NativeProtocol$1)>
	//    4    8:astore          9
		return validateActivityIntent(context, createNativeAppIntent(((NativeAppInfo) (fbliteappinfo)), s, collection, s1, flag, flag1, defaultaudience, s2, s3), ((NativeAppInfo) (fbliteappinfo)));
	//    5   10:aload_0         
	//    6   11:aload           9
	//    7   13:aload_1         
	//    8   14:aload_2         
	//    9   15:aload_3         
	//   10   16:iload           4
	//   11   18:iload           5
	//   12   20:aload           6
	//   13   22:aload           7
	//   14   24:aload           8
	//   15   26:invokestatic    #240 <Method Intent createNativeAppIntent(NativeProtocol$NativeAppInfo, String, Collection, String, boolean, boolean, DefaultAudience, String, String)>
	//   16   29:aload           9
	//   17   31:invokestatic    #244 <Method Intent validateActivityIntent(Context, Intent, NativeProtocol$NativeAppInfo)>
	//   18   34:areturn         
	}

	private static Intent createNativeAppIntent(NativeAppInfo nativeappinfo, String s, Collection collection, String s1, boolean flag, boolean flag1, DefaultAudience defaultaudience, String s2, 
			String s3)
	{
		String s4 = nativeappinfo.getLoginActivity();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #248 <Method String NativeProtocol$NativeAppInfo.getLoginActivity()>
	//    2    4:astore          9
		if(s4 == null)
	//*   3    6:aload           9
	//*   4    8:ifnonnull       13
			return null;
	//    5   11:aconst_null     
	//    6   12:areturn         
		nativeappinfo = ((NativeAppInfo) ((new Intent()).setClassName(nativeappinfo.getPackage(), s4).putExtra("client_id", s)));
	//    7   13:new             #250 <Class Intent>
	//    8   16:dup             
	//    9   17:invokespecial   #251 <Method void Intent()>
	//   10   20:aload_0         
	//   11   21:invokevirtual   #170 <Method String NativeProtocol$NativeAppInfo.getPackage()>
	//   12   24:aload           9
	//   13   26:invokevirtual   #255 <Method Intent Intent.setClassName(String, String)>
	//   14   29:ldc2            #257 <String "client_id">
	//   15   32:aload_1         
	//   16   33:invokevirtual   #260 <Method Intent Intent.putExtra(String, String)>
	//   17   36:astore_0        
		((Intent) (nativeappinfo)).putExtra("facebook_sdk_version", FacebookSdk.getSdkVersion());
	//   18   37:aload_0         
	//   19   38:ldc2            #262 <String "facebook_sdk_version">
	//   20   41:invokestatic    #267 <Method String FacebookSdk.getSdkVersion()>
	//   21   44:invokevirtual   #260 <Method Intent Intent.putExtra(String, String)>
	//   22   47:pop             
		if(!Utility.isNullOrEmpty(collection))
	//*  23   48:aload_2         
	//*  24   49:invokestatic    #273 <Method boolean Utility.isNullOrEmpty(Collection)>
	//*  25   52:ifne            70
			((Intent) (nativeappinfo)).putExtra("scope", TextUtils.join(",", ((Iterable) (collection))));
	//   26   55:aload_0         
	//   27   56:ldc2            #275 <String "scope">
	//   28   59:ldc2            #277 <String ",">
	//   29   62:aload_2         
	//   30   63:invokestatic    #283 <Method String TextUtils.join(CharSequence, Iterable)>
	//   31   66:invokevirtual   #260 <Method Intent Intent.putExtra(String, String)>
	//   32   69:pop             
		if(!Utility.isNullOrEmpty(s1))
	//*  33   70:aload_3         
	//*  34   71:invokestatic    #286 <Method boolean Utility.isNullOrEmpty(String)>
	//*  35   74:ifne            86
			((Intent) (nativeappinfo)).putExtra("e2e", s1);
	//   36   77:aload_0         
	//   37   78:ldc2            #288 <String "e2e">
	//   38   81:aload_3         
	//   39   82:invokevirtual   #260 <Method Intent Intent.putExtra(String, String)>
	//   40   85:pop             
		((Intent) (nativeappinfo)).putExtra("state", s2);
	//   41   86:aload_0         
	//   42   87:ldc2            #290 <String "state">
	//   43   90:aload           7
	//   44   92:invokevirtual   #260 <Method Intent Intent.putExtra(String, String)>
	//   45   95:pop             
		((Intent) (nativeappinfo)).putExtra("response_type", "token,signed_request");
	//   46   96:aload_0         
	//   47   97:ldc2            #292 <String "response_type">
	//   48  100:ldc2            #294 <String "token,signed_request">
	//   49  103:invokevirtual   #260 <Method Intent Intent.putExtra(String, String)>
	//   50  106:pop             
		((Intent) (nativeappinfo)).putExtra("return_scopes", "true");
	//   51  107:aload_0         
	//   52  108:ldc2            #296 <String "return_scopes">
	//   53  111:ldc2            #298 <String "true">
	//   54  114:invokevirtual   #260 <Method Intent Intent.putExtra(String, String)>
	//   55  117:pop             
		if(flag1)
	//*  56  118:iload           5
	//*  57  120:ifeq            136
			((Intent) (nativeappinfo)).putExtra("default_audience", defaultaudience.getNativeProtocolAudience());
	//   58  123:aload_0         
	//   59  124:ldc2            #300 <String "default_audience">
	//   60  127:aload           6
	//   61  129:invokevirtual   #305 <Method String DefaultAudience.getNativeProtocolAudience()>
	//   62  132:invokevirtual   #260 <Method Intent Intent.putExtra(String, String)>
	//   63  135:pop             
		((Intent) (nativeappinfo)).putExtra("legacy_override", FacebookSdk.getGraphApiVersion());
	//   64  136:aload_0         
	//   65  137:ldc2            #307 <String "legacy_override">
	//   66  140:invokestatic    #310 <Method String FacebookSdk.getGraphApiVersion()>
	//   67  143:invokevirtual   #260 <Method Intent Intent.putExtra(String, String)>
	//   68  146:pop             
		((Intent) (nativeappinfo)).putExtra("auth_type", s3);
	//   69  147:aload_0         
	//   70  148:ldc2            #312 <String "auth_type">
	//   71  151:aload           8
	//   72  153:invokevirtual   #260 <Method Intent Intent.putExtra(String, String)>
	//   73  156:pop             
		return ((Intent) (nativeappinfo));
	//   74  157:aload_0         
	//   75  158:areturn         
	}

	public static Intent createPlatformActivityIntent(Context context, String s, String s1, ProtocolVersionQueryResult protocolversionqueryresult, Bundle bundle)
	{
		if(protocolversionqueryresult == null)
	//*   0    0:aload_3         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		NativeAppInfo nativeappinfo = protocolversionqueryresult.nativeAppInfo;
	//    4    6:aload_3         
	//    5    7:invokestatic    #319 <Method NativeProtocol$NativeAppInfo NativeProtocol$ProtocolVersionQueryResult.access$700(NativeProtocol$ProtocolVersionQueryResult)>
	//    6   10:astore          5
		if(nativeappinfo == null)
	//*   7   12:aload           5
	//*   8   14:ifnonnull       19
			return null;
	//    9   17:aconst_null     
	//   10   18:areturn         
		context = ((Context) (validateActivityIntent(context, (new Intent()).setAction("com.facebook.platform.PLATFORM_ACTIVITY").setPackage(nativeappinfo.getPackage()).addCategory("android.intent.category.DEFAULT"), nativeappinfo)));
	//   11   19:aload_0         
	//   12   20:new             #250 <Class Intent>
	//   13   23:dup             
	//   14   24:invokespecial   #251 <Method void Intent()>
	//   15   27:ldc2            #321 <String "com.facebook.platform.PLATFORM_ACTIVITY">
	//   16   30:invokevirtual   #325 <Method Intent Intent.setAction(String)>
	//   17   33:aload           5
	//   18   35:invokevirtual   #170 <Method String NativeProtocol$NativeAppInfo.getPackage()>
	//   19   38:invokevirtual   #328 <Method Intent Intent.setPackage(String)>
	//   20   41:ldc2            #330 <String "android.intent.category.DEFAULT">
	//   21   44:invokevirtual   #333 <Method Intent Intent.addCategory(String)>
	//   22   47:aload           5
	//   23   49:invokestatic    #244 <Method Intent validateActivityIntent(Context, Intent, NativeProtocol$NativeAppInfo)>
	//   24   52:astore_0        
		if(context == null)
	//*  25   53:aload_0         
	//*  26   54:ifnonnull       59
		{
			return null;
	//   27   57:aconst_null     
	//   28   58:areturn         
		} else
		{
			setupProtocolRequestIntent(((Intent) (context)), s, s1, protocolversionqueryresult.protocolVersion, bundle);
	//   29   59:aload_0         
	//   30   60:aload_1         
	//   31   61:aload_2         
	//   32   62:aload_3         
	//   33   63:invokestatic    #337 <Method int NativeProtocol$ProtocolVersionQueryResult.access$800(NativeProtocol$ProtocolVersionQueryResult)>
	//   34   66:aload           4
	//   35   68:invokestatic    #341 <Method void setupProtocolRequestIntent(Intent, String, String, int, Bundle)>
			return ((Intent) (context));
	//   36   71:aload_0         
	//   37   72:areturn         
		}
	}

	public static Intent createPlatformServiceIntent(Context context)
	{
		for(Iterator iterator = facebookAppInfoList.iterator(); iterator.hasNext();)
	//*   0    0:getstatic       #50  <Field List facebookAppInfoList>
	//*   1    3:invokeinterface #346 <Method Iterator List.iterator()>
	//*   2    8:astore_1        
	//*   3    9:aload_1         
	//*   4   10:invokeinterface #195 <Method boolean Iterator.hasNext()>
	//*   5   15:ifeq            63
		{
			Object obj = ((Object) ((NativeAppInfo)iterator.next()));
	//    6   18:aload_1         
	//    7   19:invokeinterface #199 <Method Object Iterator.next()>
	//    8   24:checkcast       #20  <Class NativeProtocol$NativeAppInfo>
	//    9   27:astore_2        
			obj = ((Object) (validateServiceIntent(context, (new Intent("com.facebook.platform.PLATFORM_SERVICE")).setPackage(((NativeAppInfo) (obj)).getPackage()).addCategory("android.intent.category.DEFAULT"), ((NativeAppInfo) (obj)))));
	//   10   28:aload_0         
	//   11   29:new             #250 <Class Intent>
	//   12   32:dup             
	//   13   33:ldc2            #348 <String "com.facebook.platform.PLATFORM_SERVICE">
	//   14   36:invokespecial   #351 <Method void Intent(String)>
	//   15   39:aload_2         
	//   16   40:invokevirtual   #170 <Method String NativeProtocol$NativeAppInfo.getPackage()>
	//   17   43:invokevirtual   #328 <Method Intent Intent.setPackage(String)>
	//   18   46:ldc2            #330 <String "android.intent.category.DEFAULT">
	//   19   49:invokevirtual   #333 <Method Intent Intent.addCategory(String)>
	//   20   52:aload_2         
	//   21   53:invokestatic    #354 <Method Intent validateServiceIntent(Context, Intent, NativeProtocol$NativeAppInfo)>
	//   22   56:astore_2        
			if(obj != null)
	//*  23   57:aload_2         
	//*  24   58:ifnull          9
				return ((Intent) (obj));
	//   25   61:aload_2         
	//   26   62:areturn         
		}

		return null;
	//   27   63:aconst_null     
	//   28   64:areturn         
	}

	public static Intent createProtocolResultIntent(Intent intent, Bundle bundle, FacebookException facebookexception)
	{
		UUID uuid = getCallIdFromIntent(intent);
	//    0    0:aload_0         
	//    1    1:invokestatic    #360 <Method UUID getCallIdFromIntent(Intent)>
	//    2    4:astore_3        
		if(uuid == null)
	//*   3    5:aload_3         
	//*   4    6:ifnonnull       11
			return null;
	//    5    9:aconst_null     
	//    6   10:areturn         
		Intent intent1 = new Intent();
	//    7   11:new             #250 <Class Intent>
	//    8   14:dup             
	//    9   15:invokespecial   #251 <Method void Intent()>
	//   10   18:astore          4
		intent1.putExtra("com.facebook.platform.protocol.PROTOCOL_VERSION", getProtocolVersionFromIntent(intent));
	//   11   20:aload           4
	//   12   22:ldc2            #362 <String "com.facebook.platform.protocol.PROTOCOL_VERSION">
	//   13   25:aload_0         
	//   14   26:invokestatic    #366 <Method int getProtocolVersionFromIntent(Intent)>
	//   15   29:invokevirtual   #369 <Method Intent Intent.putExtra(String, int)>
	//   16   32:pop             
		intent = ((Intent) (new Bundle()));
	//   17   33:new             #217 <Class Bundle>
	//   18   36:dup             
	//   19   37:invokespecial   #218 <Method void Bundle()>
	//   20   40:astore_0        
		((Bundle) (intent)).putString("action_id", uuid.toString());
	//   21   41:aload_0         
	//   22   42:ldc2            #371 <String "action_id">
	//   23   45:aload_3         
	//   24   46:invokevirtual   #374 <Method String UUID.toString()>
	//   25   49:invokevirtual   #227 <Method void Bundle.putString(String, String)>
		if(facebookexception != null)
	//*  26   52:aload_2         
	//*  27   53:ifnull          67
			((Bundle) (intent)).putBundle("error", createBundleForException(facebookexception));
	//   28   56:aload_0         
	//   29   57:ldc2            #376 <String "error">
	//   30   60:aload_2         
	//   31   61:invokestatic    #378 <Method Bundle createBundleForException(FacebookException)>
	//   32   64:invokevirtual   #382 <Method void Bundle.putBundle(String, Bundle)>
		intent1.putExtra("com.facebook.platform.protocol.BRIDGE_ARGS", ((Bundle) (intent)));
	//   33   67:aload           4
	//   34   69:ldc2            #384 <String "com.facebook.platform.protocol.BRIDGE_ARGS">
	//   35   72:aload_0         
	//   36   73:invokevirtual   #387 <Method Intent Intent.putExtra(String, Bundle)>
	//   37   76:pop             
		if(bundle != null)
	//*  38   77:aload_1         
	//*  39   78:ifnull          91
			intent1.putExtra("com.facebook.platform.protocol.RESULT_ARGS", bundle);
	//   40   81:aload           4
	//   41   83:ldc2            #389 <String "com.facebook.platform.protocol.RESULT_ARGS">
	//   42   86:aload_1         
	//   43   87:invokevirtual   #387 <Method Intent Intent.putExtra(String, Bundle)>
	//   44   90:pop             
		return intent1;
	//   45   91:aload           4
	//   46   93:areturn         
	}

	public static Intent createProxyAuthIntent(Context context, String s, Collection collection, String s1, boolean flag, boolean flag1, DefaultAudience defaultaudience, String s2, 
			String s3)
	{
		for(Iterator iterator = facebookAppInfoList.iterator(); iterator.hasNext();)
	//*   0    0:getstatic       #50  <Field List facebookAppInfoList>
	//*   1    3:invokeinterface #346 <Method Iterator List.iterator()>
	//*   2    8:astore          9
	//*   3   10:aload           9
	//*   4   12:invokeinterface #195 <Method boolean Iterator.hasNext()>
	//*   5   17:ifeq            66
		{
			Object obj = ((Object) ((NativeAppInfo)iterator.next()));
	//    6   20:aload           9
	//    7   22:invokeinterface #199 <Method Object Iterator.next()>
	//    8   27:checkcast       #20  <Class NativeProtocol$NativeAppInfo>
	//    9   30:astore          10
			obj = ((Object) (validateActivityIntent(context, createNativeAppIntent(((NativeAppInfo) (obj)), s, collection, s1, flag, flag1, defaultaudience, s2, s3), ((NativeAppInfo) (obj)))));
	//   10   32:aload_0         
	//   11   33:aload           10
	//   12   35:aload_1         
	//   13   36:aload_2         
	//   14   37:aload_3         
	//   15   38:iload           4
	//   16   40:iload           5
	//   17   42:aload           6
	//   18   44:aload           7
	//   19   46:aload           8
	//   20   48:invokestatic    #240 <Method Intent createNativeAppIntent(NativeProtocol$NativeAppInfo, String, Collection, String, boolean, boolean, DefaultAudience, String, String)>
	//   21   51:aload           10
	//   22   53:invokestatic    #244 <Method Intent validateActivityIntent(Context, Intent, NativeProtocol$NativeAppInfo)>
	//   23   56:astore          10
			if(obj != null)
	//*  24   58:aload           10
	//*  25   60:ifnull          10
				return ((Intent) (obj));
	//   26   63:aload           10
	//   27   65:areturn         
		}

		return null;
	//   28   66:aconst_null     
	//   29   67:areturn         
	}

	private static TreeSet fetchAllAvailableProtocolVersionsForAppInfo(NativeAppInfo nativeappinfo)
	{
		NativeAppInfo nativeappinfo1;
		NativeAppInfo nativeappinfo2;
		Object obj;
		Object obj1;
		TreeSet treeset;
		ContentResolver contentresolver;
		Uri uri;
		treeset = new TreeSet();
	//    0    0:new             #185 <Class TreeSet>
	//    1    3:dup             
	//    2    4:invokespecial   #399 <Method void TreeSet()>
	//    3    7:astore          5
		contentresolver = FacebookSdk.getApplicationContext().getContentResolver();
	//    4    9:invokestatic    #403 <Method Context FacebookSdk.getApplicationContext()>
	//    5   12:invokevirtual   #409 <Method ContentResolver Context.getContentResolver()>
	//    6   15:astore          6
		uri = buildPlatformProviderVersionURI(nativeappinfo);
	//    7   17:aload_0         
	//    8   18:invokestatic    #411 <Method Uri buildPlatformProviderVersionURI(NativeProtocol$NativeAppInfo)>
	//    9   21:astore          7
		obj = null;
	//   10   23:aconst_null     
	//   11   24:astore_3        
		obj1 = null;
	//   12   25:aconst_null     
	//   13   26:astore          4
		nativeappinfo2 = null;
	//   14   28:aconst_null     
	//   15   29:astore_2        
		nativeappinfo1 = ((NativeAppInfo) (obj));
	//   16   30:aload_3         
	//   17   31:astore_1        
		PackageManager packagemanager = FacebookSdk.getApplicationContext().getPackageManager();
	//   18   32:invokestatic    #403 <Method Context FacebookSdk.getApplicationContext()>
	//   19   35:invokevirtual   #415 <Method PackageManager Context.getPackageManager()>
	//   20   38:astore          8
		nativeappinfo1 = ((NativeAppInfo) (obj));
	//   21   40:aload_3         
	//   22   41:astore_1        
		StringBuilder stringbuilder = new StringBuilder();
	//   23   42:new             #159 <Class StringBuilder>
	//   24   45:dup             
	//   25   46:invokespecial   #160 <Method void StringBuilder()>
	//   26   49:astore          9
		nativeappinfo1 = ((NativeAppInfo) (obj));
	//   27   51:aload_3         
	//   28   52:astore_1        
		stringbuilder.append(nativeappinfo.getPackage());
	//   29   53:aload           9
	//   30   55:aload_0         
	//   31   56:invokevirtual   #170 <Method String NativeProtocol$NativeAppInfo.getPackage()>
	//   32   59:invokevirtual   #166 <Method StringBuilder StringBuilder.append(String)>
	//   33   62:pop             
		nativeappinfo1 = ((NativeAppInfo) (obj));
	//   34   63:aload_3         
	//   35   64:astore_1        
		stringbuilder.append(".provider.PlatformProvider");
	//   36   65:aload           9
	//   37   67:ldc2            #417 <String ".provider.PlatformProvider">
	//   38   70:invokevirtual   #166 <Method StringBuilder StringBuilder.append(String)>
	//   39   73:pop             
		nativeappinfo1 = ((NativeAppInfo) (obj));
	//   40   74:aload_3         
	//   41   75:astore_1        
		nativeappinfo = ((NativeAppInfo) (stringbuilder.toString()));
	//   42   76:aload           9
	//   43   78:invokevirtual   #175 <Method String StringBuilder.toString()>
	//   44   81:astore_0        
		nativeappinfo1 = ((NativeAppInfo) (obj));
	//   45   82:aload_3         
	//   46   83:astore_1        
		try
		{
			nativeappinfo = ((NativeAppInfo) (packagemanager.resolveContentProvider(((String) (nativeappinfo)), 0)));
	//   47   84:aload           8
	//   48   86:aload_0         
	//   49   87:iconst_0        
	//   50   88:invokevirtual   #423 <Method android.content.pm.ProviderInfo PackageManager.resolveContentProvider(String, int)>
	//   51   91:astore_0        
			break MISSING_BLOCK_LABEL_111;
	//   52   92:goto            111
		}
		// Misplaced declaration of an exception variable
		catch(NativeAppInfo nativeappinfo)
	//*  53   95:astore_0        
		{
			nativeappinfo1 = ((NativeAppInfo) (obj));
	//   54   96:aload_3         
	//   55   97:astore_1        
		}
		Log.e(TAG, "Failed to query content resolver.", ((Throwable) (nativeappinfo)));
	//   56   98:getstatic       #425 <Field String TAG>
	//   57  101:ldc2            #427 <String "Failed to query content resolver.">
	//   58  104:aload_0         
	//   59  105:invokestatic    #433 <Method int Log.e(String, String, Throwable)>
	//   60  108:pop             
		nativeappinfo = null;
	//   61  109:aconst_null     
	//   62  110:astore_0        
		if(nativeappinfo == null) goto _L2; else goto _L1
	//   63  111:aload_0         
	//   64  112:ifnull          201
_L1:
		nativeappinfo1 = ((NativeAppInfo) (obj));
	//   65  115:aload_3         
	//   66  116:astore_1        
		nativeappinfo = ((NativeAppInfo) (contentresolver.query(uri, new String[] {
			"version"
		}, ((String) (null)), ((String []) (null)), ((String) (null)))));
	//   67  117:aload           6
	//   68  119:aload           7
	//   69  121:iconst_1        
	//   70  122:anewarray       String[]
	//   71  125:dup             
	//   72  126:iconst_0        
	//   73  127:ldc2            #437 <String "version">
	//   74  130:aastore         
	//   75  131:aconst_null     
	//   76  132:aconst_null     
	//   77  133:aconst_null     
	//   78  134:invokevirtual   #443 <Method Cursor ContentResolver.query(Uri, String[], String, String[], String)>
	//   79  137:astore_0        
		  goto _L3
	//*  80  138:goto            231
_L5:
		nativeappinfo1 = ((NativeAppInfo) (obj));
	//   81  141:aload_3         
	//   82  142:astore_1        
		Log.e(TAG, "Failed to query content resolver.");
	//   83  143:getstatic       #425 <Field String TAG>
	//   84  146:ldc2            #427 <String "Failed to query content resolver.">
	//   85  149:invokestatic    #446 <Method int Log.e(String, String)>
	//   86  152:pop             
		nativeappinfo = ((NativeAppInfo) (obj1));
	//   87  153:aload           4
	//   88  155:astore_0        
		  goto _L3
	//*  89  156:goto            231
_L4:
		nativeappinfo2 = nativeappinfo;
	//   90  159:aload_0         
	//   91  160:astore_2        
		nativeappinfo1 = nativeappinfo;
	//   92  161:aload_0         
	//   93  162:astore_1        
		if(!((Cursor) (nativeappinfo)).moveToNext())
			break; /* Loop/switch isn't completed */
	//   94  163:aload_0         
	//   95  164:invokeinterface #451 <Method boolean Cursor.moveToNext()>
	//   96  169:ifeq            201
		nativeappinfo1 = nativeappinfo;
	//   97  172:aload_0         
	//   98  173:astore_1        
		treeset.add(((Object) (Integer.valueOf(((Cursor) (nativeappinfo)).getInt(((Cursor) (nativeappinfo)).getColumnIndex("version"))))));
	//   99  174:aload           5
	//  100  176:aload_0         
	//  101  177:aload_0         
	//  102  178:ldc2            #437 <String "version">
	//  103  181:invokeinterface #455 <Method int Cursor.getColumnIndex(String)>
	//  104  186:invokeinterface #459 <Method int Cursor.getInt(int)>
	//  105  191:invokestatic    #76  <Method Integer Integer.valueOf(int)>
	//  106  194:invokevirtual   #460 <Method boolean TreeSet.add(Object)>
	//  107  197:pop             
		if(true) goto _L4; else goto _L2
	//  108  198:goto            159
_L2:
		if(nativeappinfo2 != null)
	//* 109  201:aload_2         
	//* 110  202:ifnull          211
			((Cursor) (nativeappinfo2)).close();
	//  111  205:aload_2         
	//  112  206:invokeinterface #463 <Method void Cursor.close()>
		return treeset;
	//  113  211:aload           5
	//  114  213:areturn         
		nativeappinfo;
	//  115  214:astore_0        
		if(nativeappinfo1 != null)
	//* 116  215:aload_1         
	//* 117  216:ifnull          225
			((Cursor) (nativeappinfo1)).close();
	//  118  219:aload_1         
	//  119  220:invokeinterface #463 <Method void Cursor.close()>
		throw nativeappinfo;
	//  120  225:aload_0         
	//  121  226:athrow          
		nativeappinfo;
	//  122  227:astore_0        
		  goto _L5
	//* 123  228:goto            141
_L3:
		nativeappinfo2 = nativeappinfo;
	//  124  231:aload_0         
	//  125  232:astore_2        
		if(nativeappinfo == null) goto _L2; else goto _L4
	//  126  233:aload_0         
	//  127  234:ifnull          201
	//* 128  237:goto            159
	}

	public static Bundle getBridgeArgumentsFromIntent(Intent intent)
	{
		if(!isVersionCompatibleWithBucketedIntent(getProtocolVersionFromIntent(intent)))
	//*   0    0:aload_0         
	//*   1    1:invokestatic    #366 <Method int getProtocolVersionFromIntent(Intent)>
	//*   2    4:invokestatic    #470 <Method boolean isVersionCompatibleWithBucketedIntent(int)>
	//*   3    7:ifne            12
			return null;
	//    4   10:aconst_null     
	//    5   11:areturn         
		else
			return intent.getBundleExtra("com.facebook.platform.protocol.BRIDGE_ARGS");
	//    6   12:aload_0         
	//    7   13:ldc2            #384 <String "com.facebook.platform.protocol.BRIDGE_ARGS">
	//    8   16:invokevirtual   #474 <Method Bundle Intent.getBundleExtra(String)>
	//    9   19:areturn         
	}

	public static UUID getCallIdFromIntent(Intent intent)
	{
		UUID uuid = null;
	//    0    0:aconst_null     
	//    1    1:astore_1        
		if(intent == null)
	//*   2    2:aload_0         
	//*   3    3:ifnonnull       8
			return null;
	//    4    6:aconst_null     
	//    5    7:areturn         
		if(isVersionCompatibleWithBucketedIntent(getProtocolVersionFromIntent(intent)))
	//*   6    8:aload_0         
	//*   7    9:invokestatic    #366 <Method int getProtocolVersionFromIntent(Intent)>
	//*   8   12:invokestatic    #470 <Method boolean isVersionCompatibleWithBucketedIntent(int)>
	//*   9   15:ifeq            46
		{
			intent = ((Intent) (intent.getBundleExtra("com.facebook.platform.protocol.BRIDGE_ARGS")));
	//   10   18:aload_0         
	//   11   19:ldc2            #384 <String "com.facebook.platform.protocol.BRIDGE_ARGS">
	//   12   22:invokevirtual   #474 <Method Bundle Intent.getBundleExtra(String)>
	//   13   25:astore_0        
			if(intent != null)
	//*  14   26:aload_0         
	//*  15   27:ifnull          41
				intent = ((Intent) (((Bundle) (intent)).getString("action_id")));
	//   16   30:aload_0         
	//   17   31:ldc2            #371 <String "action_id">
	//   18   34:invokevirtual   #478 <Method String Bundle.getString(String)>
	//   19   37:astore_0        
			else
	//*  20   38:goto            54
				intent = null;
	//   21   41:aconst_null     
	//   22   42:astore_0        
		} else
	//*  23   43:goto            54
		{
			intent = ((Intent) (intent.getStringExtra("com.facebook.platform.protocol.CALL_ID")));
	//   24   46:aload_0         
	//   25   47:ldc2            #480 <String "com.facebook.platform.protocol.CALL_ID">
	//   26   50:invokevirtual   #483 <Method String Intent.getStringExtra(String)>
	//   27   53:astore_0        
		}
		if(intent != null)
	//*  28   54:aload_0         
	//*  29   55:ifnull          63
			try
			{
				uuid = UUID.fromString(((String) (intent)));
	//   30   58:aload_0         
	//   31   59:invokestatic    #487 <Method UUID UUID.fromString(String)>
	//   32   62:astore_1        
			}
	//*  33   63:aload_1         
	//*  34   64:areturn         
			// Misplaced declaration of an exception variable
			catch(Intent intent)
	//*  35   65:astore_0        
			{
				return null;
	//   36   66:aconst_null     
	//   37   67:areturn         
			}
		return uuid;
	}

	public static Bundle getErrorDataFromResultIntent(Intent intent)
	{
		if(!isErrorResult(intent))
	//*   0    0:aload_0         
	//*   1    1:invokestatic    #492 <Method boolean isErrorResult(Intent)>
	//*   2    4:ifne            9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		Bundle bundle = getBridgeArgumentsFromIntent(intent);
	//    5    9:aload_0         
	//    6   10:invokestatic    #494 <Method Bundle getBridgeArgumentsFromIntent(Intent)>
	//    7   13:astore_1        
		if(bundle != null)
	//*   8   14:aload_1         
	//*   9   15:ifnull          26
			return bundle.getBundle("error");
	//   10   18:aload_1         
	//   11   19:ldc2            #376 <String "error">
	//   12   22:invokevirtual   #497 <Method Bundle Bundle.getBundle(String)>
	//   13   25:areturn         
		else
			return intent.getExtras();
	//   14   26:aload_0         
	//   15   27:invokevirtual   #501 <Method Bundle Intent.getExtras()>
	//   16   30:areturn         
	}

	public static FacebookException getExceptionFromErrorData(Bundle bundle)
	{
		if(bundle == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		String s1 = bundle.getString("error_type");
	//    4    6:aload_0         
	//    5    7:ldc1            #231 <String "error_type">
	//    6    9:invokevirtual   #478 <Method String Bundle.getString(String)>
	//    7   12:astore_2        
		String s = s1;
	//    8   13:aload_2         
	//    9   14:astore_1        
		if(s1 == null)
	//*  10   15:aload_2         
	//*  11   16:ifnonnull       27
			s = bundle.getString("com.facebook.platform.status.ERROR_TYPE");
	//   12   19:aload_0         
	//   13   20:ldc2            #505 <String "com.facebook.platform.status.ERROR_TYPE">
	//   14   23:invokevirtual   #478 <Method String Bundle.getString(String)>
	//   15   26:astore_1        
		String s2 = bundle.getString("error_description");
	//   16   27:aload_0         
	//   17   28:ldc1            #220 <String "error_description">
	//   18   30:invokevirtual   #478 <Method String Bundle.getString(String)>
	//   19   33:astore_3        
		s1 = s2;
	//   20   34:aload_3         
	//   21   35:astore_2        
		if(s2 == null)
	//*  22   36:aload_3         
	//*  23   37:ifnonnull       48
			s1 = bundle.getString("com.facebook.platform.status.ERROR_DESCRIPTION");
	//   24   40:aload_0         
	//   25   41:ldc2            #507 <String "com.facebook.platform.status.ERROR_DESCRIPTION">
	//   26   44:invokevirtual   #478 <Method String Bundle.getString(String)>
	//   27   47:astore_2        
		if(s != null && s.equalsIgnoreCase("UserCanceled"))
	//*  28   48:aload_1         
	//*  29   49:ifnull          70
	//*  30   52:aload_1         
	//*  31   53:ldc1            #233 <String "UserCanceled">
	//*  32   55:invokevirtual   #510 <Method boolean String.equalsIgnoreCase(String)>
	//*  33   58:ifeq            70
			return ((FacebookException) (new FacebookOperationCanceledException(s1)));
	//   34   61:new             #229 <Class FacebookOperationCanceledException>
	//   35   64:dup             
	//   36   65:aload_2         
	//   37   66:invokespecial   #511 <Method void FacebookOperationCanceledException(String)>
	//   38   69:areturn         
		else
			return new FacebookException(s1);
	//   39   70:new             #222 <Class FacebookException>
	//   40   73:dup             
	//   41   74:aload_2         
	//   42   75:invokespecial   #512 <Method void FacebookException(String)>
	//   43   78:areturn         
	}

	public static ProtocolVersionQueryResult getLatestAvailableProtocolVersionForAction(String s, int ai[])
	{
		return getLatestAvailableProtocolVersionForAppInfoList((List)actionToAppInfoMap.get(((Object) (s))), ai);
	//    0    0:getstatic       #61  <Field Map actionToAppInfoMap>
	//    1    3:aload_0         
	//    2    4:invokeinterface #518 <Method Object Map.get(Object)>
	//    3    9:checkcast       #148 <Class List>
	//    4   12:aload_1         
	//    5   13:invokestatic    #522 <Method NativeProtocol$ProtocolVersionQueryResult getLatestAvailableProtocolVersionForAppInfoList(List, int[])>
	//    6   16:areturn         
	}

	private static ProtocolVersionQueryResult getLatestAvailableProtocolVersionForAppInfoList(List list, int ai[])
	{
		updateAllAvailableProtocolVersionsAsync();
	//    0    0:invokestatic    #525 <Method void updateAllAvailableProtocolVersionsAsync()>
		if(list == null)
	//*   1    3:aload_0         
	//*   2    4:ifnonnull       11
			return ProtocolVersionQueryResult.createEmpty();
	//    3    7:invokestatic    #529 <Method NativeProtocol$ProtocolVersionQueryResult NativeProtocol$ProtocolVersionQueryResult.createEmpty()>
	//    4   10:areturn         
		for(list = ((List) (list.iterator())); ((Iterator) (list)).hasNext();)
	//*   5   11:aload_0         
	//*   6   12:invokeinterface #346 <Method Iterator List.iterator()>
	//*   7   17:astore_0        
	//*   8   18:aload_0         
	//*   9   19:invokeinterface #195 <Method boolean Iterator.hasNext()>
	//*  10   24:ifeq            60
		{
			NativeAppInfo nativeappinfo = (NativeAppInfo)((Iterator) (list)).next();
	//   11   27:aload_0         
	//   12   28:invokeinterface #199 <Method Object Iterator.next()>
	//   13   33:checkcast       #20  <Class NativeProtocol$NativeAppInfo>
	//   14   36:astore_3        
			int i = computeLatestAvailableVersionFromVersionSpec(nativeappinfo.getAvailableVersions(), getLatestKnownVersion(), ai);
	//   15   37:aload_3         
	//   16   38:invokevirtual   #533 <Method TreeSet NativeProtocol$NativeAppInfo.getAvailableVersions()>
	//   17   41:invokestatic    #536 <Method int getLatestKnownVersion()>
	//   18   44:aload_1         
	//   19   45:invokestatic    #538 <Method int computeLatestAvailableVersionFromVersionSpec(TreeSet, int, int[])>
	//   20   48:istore_2        
			if(i != -1)
	//*  21   49:iload_2         
	//*  22   50:iconst_m1       
	//*  23   51:icmpeq          18
				return ProtocolVersionQueryResult.create(nativeappinfo, i);
	//   24   54:aload_3         
	//   25   55:iload_2         
	//   26   56:invokestatic    #542 <Method NativeProtocol$ProtocolVersionQueryResult NativeProtocol$ProtocolVersionQueryResult.create(NativeProtocol$NativeAppInfo, int)>
	//   27   59:areturn         
		}

		return ProtocolVersionQueryResult.createEmpty();
	//   28   60:invokestatic    #529 <Method NativeProtocol$ProtocolVersionQueryResult NativeProtocol$ProtocolVersionQueryResult.createEmpty()>
	//   29   63:areturn         
	}

	public static int getLatestAvailableProtocolVersionForService(int i)
	{
		return getLatestAvailableProtocolVersionForAppInfoList(facebookAppInfoList, new int[] {
			i
		}).getProtocolVersion();
	//    0    0:getstatic       #50  <Field List facebookAppInfoList>
	//    1    3:iconst_1        
	//    2    4:newarray        int[]
	//    3    6:dup             
	//    4    7:iconst_0        
	//    5    8:iload_0         
	//    6    9:iastore         
	//    7   10:invokestatic    #522 <Method NativeProtocol$ProtocolVersionQueryResult getLatestAvailableProtocolVersionForAppInfoList(List, int[])>
	//    8   13:invokevirtual   #547 <Method int NativeProtocol$ProtocolVersionQueryResult.getProtocolVersion()>
	//    9   16:ireturn         
	}

	public static final int getLatestKnownVersion()
	{
		return ((Integer)KNOWN_PROTOCOL_VERSIONS.get(0)).intValue();
	//    0    0:getstatic       #96  <Field List KNOWN_PROTOCOL_VERSIONS>
	//    1    3:iconst_0        
	//    2    4:invokeinterface #550 <Method Object List.get(int)>
	//    3    9:checkcast       #71  <Class Integer>
	//    4   12:invokevirtual   #203 <Method int Integer.intValue()>
	//    5   15:ireturn         
	}

	public static Bundle getMethodArgumentsFromIntent(Intent intent)
	{
		if(!isVersionCompatibleWithBucketedIntent(getProtocolVersionFromIntent(intent)))
	//*   0    0:aload_0         
	//*   1    1:invokestatic    #366 <Method int getProtocolVersionFromIntent(Intent)>
	//*   2    4:invokestatic    #470 <Method boolean isVersionCompatibleWithBucketedIntent(int)>
	//*   3    7:ifne            15
			return intent.getExtras();
	//    4   10:aload_0         
	//    5   11:invokevirtual   #501 <Method Bundle Intent.getExtras()>
	//    6   14:areturn         
		else
			return intent.getBundleExtra("com.facebook.platform.protocol.METHOD_ARGS");
	//    7   15:aload_0         
	//    8   16:ldc2            #553 <String "com.facebook.platform.protocol.METHOD_ARGS">
	//    9   19:invokevirtual   #474 <Method Bundle Intent.getBundleExtra(String)>
	//   10   22:areturn         
	}

	public static int getProtocolVersionFromIntent(Intent intent)
	{
		return intent.getIntExtra("com.facebook.platform.protocol.PROTOCOL_VERSION", 0);
	//    0    0:aload_0         
	//    1    1:ldc2            #362 <String "com.facebook.platform.protocol.PROTOCOL_VERSION">
	//    2    4:iconst_0        
	//    3    5:invokevirtual   #557 <Method int Intent.getIntExtra(String, int)>
	//    4    8:ireturn         
	}

	public static Bundle getSuccessResultsFromIntent(Intent intent)
	{
		int i = getProtocolVersionFromIntent(intent);
	//    0    0:aload_0         
	//    1    1:invokestatic    #366 <Method int getProtocolVersionFromIntent(Intent)>
	//    2    4:istore_1        
		intent = ((Intent) (intent.getExtras()));
	//    3    5:aload_0         
	//    4    6:invokevirtual   #501 <Method Bundle Intent.getExtras()>
	//    5    9:astore_0        
		if(isVersionCompatibleWithBucketedIntent(i))
	//*   6   10:iload_1         
	//*   7   11:invokestatic    #470 <Method boolean isVersionCompatibleWithBucketedIntent(int)>
	//*   8   14:ifeq            31
		{
			if(intent == null)
	//*   9   17:aload_0         
	//*  10   18:ifnonnull       23
				return ((Bundle) (intent));
	//   11   21:aload_0         
	//   12   22:areturn         
			else
				return ((Bundle) (intent)).getBundle("com.facebook.platform.protocol.RESULT_ARGS");
	//   13   23:aload_0         
	//   14   24:ldc2            #389 <String "com.facebook.platform.protocol.RESULT_ARGS">
	//   15   27:invokevirtual   #497 <Method Bundle Bundle.getBundle(String)>
	//   16   30:areturn         
		} else
		{
			return ((Bundle) (intent));
	//   17   31:aload_0         
	//   18   32:areturn         
		}
	}

	public static boolean isErrorResult(Intent intent)
	{
		Bundle bundle = getBridgeArgumentsFromIntent(intent);
	//    0    0:aload_0         
	//    1    1:invokestatic    #494 <Method Bundle getBridgeArgumentsFromIntent(Intent)>
	//    2    4:astore_1        
		if(bundle != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          17
			return bundle.containsKey("error");
	//    5    9:aload_1         
	//    6   10:ldc2            #376 <String "error">
	//    7   13:invokevirtual   #561 <Method boolean Bundle.containsKey(String)>
	//    8   16:ireturn         
		else
			return intent.hasExtra("com.facebook.platform.status.ERROR_TYPE");
	//    9   17:aload_0         
	//   10   18:ldc2            #505 <String "com.facebook.platform.status.ERROR_TYPE">
	//   11   21:invokevirtual   #564 <Method boolean Intent.hasExtra(String)>
	//   12   24:ireturn         
	}

	public static boolean isVersionCompatibleWithBucketedIntent(int i)
	{
		return KNOWN_PROTOCOL_VERSIONS.contains(((Object) (Integer.valueOf(i)))) && i >= 0x133529d;
	//    0    0:getstatic       #96  <Field List KNOWN_PROTOCOL_VERSIONS>
	//    1    3:iload_0         
	//    2    4:invokestatic    #76  <Method Integer Integer.valueOf(int)>
	//    3    7:invokeinterface #567 <Method boolean List.contains(Object)>
	//    4   12:ifeq            23
	//    5   15:iload_0         
	//    6   16:ldc1            #82  <Int 0x133529d>
	//    7   18:icmplt          23
	//    8   21:iconst_1        
	//    9   22:ireturn         
	//   10   23:iconst_0        
	//   11   24:ireturn         
	}

	public static void setupProtocolRequestIntent(Intent intent, String s, String s1, int i, Bundle bundle)
	{
		String s3 = FacebookSdk.getApplicationId();
	//    0    0:invokestatic    #570 <Method String FacebookSdk.getApplicationId()>
	//    1    3:astore          6
		String s2 = FacebookSdk.getApplicationName();
	//    2    5:invokestatic    #573 <Method String FacebookSdk.getApplicationName()>
	//    3    8:astore          5
		intent.putExtra("com.facebook.platform.protocol.PROTOCOL_VERSION", i).putExtra("com.facebook.platform.protocol.PROTOCOL_ACTION", s1).putExtra("com.facebook.platform.extra.APPLICATION_ID", s3);
	//    4   10:aload_0         
	//    5   11:ldc2            #362 <String "com.facebook.platform.protocol.PROTOCOL_VERSION">
	//    6   14:iload_3         
	//    7   15:invokevirtual   #369 <Method Intent Intent.putExtra(String, int)>
	//    8   18:ldc2            #575 <String "com.facebook.platform.protocol.PROTOCOL_ACTION">
	//    9   21:aload_2         
	//   10   22:invokevirtual   #260 <Method Intent Intent.putExtra(String, String)>
	//   11   25:ldc2            #577 <String "com.facebook.platform.extra.APPLICATION_ID">
	//   12   28:aload           6
	//   13   30:invokevirtual   #260 <Method Intent Intent.putExtra(String, String)>
	//   14   33:pop             
		if(isVersionCompatibleWithBucketedIntent(i))
	//*  15   34:iload_3         
	//*  16   35:invokestatic    #470 <Method boolean isVersionCompatibleWithBucketedIntent(int)>
	//*  17   38:ifeq            101
		{
			s1 = ((String) (new Bundle()));
	//   18   41:new             #217 <Class Bundle>
	//   19   44:dup             
	//   20   45:invokespecial   #218 <Method void Bundle()>
	//   21   48:astore_2        
			((Bundle) (s1)).putString("action_id", s);
	//   22   49:aload_2         
	//   23   50:ldc2            #371 <String "action_id">
	//   24   53:aload_1         
	//   25   54:invokevirtual   #227 <Method void Bundle.putString(String, String)>
			Utility.putNonEmptyString(((Bundle) (s1)), "app_name", s2);
	//   26   57:aload_2         
	//   27   58:ldc2            #579 <String "app_name">
	//   28   61:aload           5
	//   29   63:invokestatic    #583 <Method void Utility.putNonEmptyString(Bundle, String, String)>
			intent.putExtra("com.facebook.platform.protocol.BRIDGE_ARGS", ((Bundle) (s1)));
	//   30   66:aload_0         
	//   31   67:ldc2            #384 <String "com.facebook.platform.protocol.BRIDGE_ARGS">
	//   32   70:aload_2         
	//   33   71:invokevirtual   #387 <Method Intent Intent.putExtra(String, Bundle)>
	//   34   74:pop             
			s = ((String) (bundle));
	//   35   75:aload           4
	//   36   77:astore_1        
			if(bundle == null)
	//*  37   78:aload           4
	//*  38   80:ifnonnull       91
				s = ((String) (new Bundle()));
	//   39   83:new             #217 <Class Bundle>
	//   40   86:dup             
	//   41   87:invokespecial   #218 <Method void Bundle()>
	//   42   90:astore_1        
			intent.putExtra("com.facebook.platform.protocol.METHOD_ARGS", ((Bundle) (s)));
	//   43   91:aload_0         
	//   44   92:ldc2            #553 <String "com.facebook.platform.protocol.METHOD_ARGS">
	//   45   95:aload_1         
	//   46   96:invokevirtual   #387 <Method Intent Intent.putExtra(String, Bundle)>
	//   47   99:pop             
			return;
	//   48  100:return          
		}
		intent.putExtra("com.facebook.platform.protocol.CALL_ID", s);
	//   49  101:aload_0         
	//   50  102:ldc2            #480 <String "com.facebook.platform.protocol.CALL_ID">
	//   51  105:aload_1         
	//   52  106:invokevirtual   #260 <Method Intent Intent.putExtra(String, String)>
	//   53  109:pop             
		if(!Utility.isNullOrEmpty(s2))
	//*  54  110:aload           5
	//*  55  112:invokestatic    #286 <Method boolean Utility.isNullOrEmpty(String)>
	//*  56  115:ifne            128
			intent.putExtra("com.facebook.platform.extra.APPLICATION_NAME", s2);
	//   57  118:aload_0         
	//   58  119:ldc2            #585 <String "com.facebook.platform.extra.APPLICATION_NAME">
	//   59  122:aload           5
	//   60  124:invokevirtual   #260 <Method Intent Intent.putExtra(String, String)>
	//   61  127:pop             
		intent.putExtras(bundle);
	//   62  128:aload_0         
	//   63  129:aload           4
	//   64  131:invokevirtual   #589 <Method Intent Intent.putExtras(Bundle)>
	//   65  134:pop             
	//   66  135:return          
	}

	public static void updateAllAvailableProtocolVersionsAsync()
	{
		if(!protocolVersionsAsyncUpdating.compareAndSet(false, true))
	//*   0    0:getstatic       #69  <Field AtomicBoolean protocolVersionsAsyncUpdating>
	//*   1    3:iconst_0        
	//*   2    4:iconst_1        
	//*   3    5:invokevirtual   #593 <Method boolean AtomicBoolean.compareAndSet(boolean, boolean)>
	//*   4    8:ifne            12
		{
			return;
	//    5   11:return          
		} else
		{
			FacebookSdk.getExecutor().execute(new Runnable() {

				public void run()
				{
					for(Iterator iterator = NativeProtocol.facebookAppInfoList.iterator(); iterator.hasNext(); ((NativeAppInfo)iterator.next()).fetchAvailableVersions(true));
				//    0    0:invokestatic    #20  <Method List NativeProtocol.access$900()>
				//    1    3:invokeinterface #26  <Method Iterator List.iterator()>
				//    2    8:astore_1        
				//    3    9:aload_1         
				//    4   10:invokeinterface #32  <Method boolean Iterator.hasNext()>
				//    5   15:ifeq            34
				//    6   18:aload_1         
				//    7   19:invokeinterface #36  <Method Object Iterator.next()>
				//    8   24:checkcast       #38  <Class NativeProtocol$NativeAppInfo>
				//    9   27:iconst_1        
				//   10   28:invokestatic    #42  <Method void NativeProtocol$NativeAppInfo.access$1000(NativeProtocol$NativeAppInfo, boolean)>
				//*  11   31:goto            9
					NativeProtocol.protocolVersionsAsyncUpdating.set(false);
				//   12   34:invokestatic    #46  <Method AtomicBoolean NativeProtocol.access$1100()>
				//   13   37:iconst_0        
				//   14   38:invokevirtual   #52  <Method void AtomicBoolean.set(boolean)>
					return;
				//   15   41:return          
					Exception exception;
					exception;
				//   16   42:astore_1        
					NativeProtocol.protocolVersionsAsyncUpdating.set(false);
				//   17   43:invokestatic    #46  <Method AtomicBoolean NativeProtocol.access$1100()>
				//   18   46:iconst_0        
				//   19   47:invokevirtual   #52  <Method void AtomicBoolean.set(boolean)>
					throw exception;
				//   20   50:aload_1         
				//   21   51:athrow          
				}

			}
);
	//    6   12:invokestatic    #597 <Method Executor FacebookSdk.getExecutor()>
	//    7   15:new             #6   <Class NativeProtocol$1>
	//    8   18:dup             
	//    9   19:invokespecial   #598 <Method void NativeProtocol$1()>
	//   10   22:invokeinterface #604 <Method void Executor.execute(Runnable)>
			return;
	//   11   27:return          
		}
	}

	static Intent validateActivityIntent(Context context, Intent intent, NativeAppInfo nativeappinfo)
	{
		if(intent == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		nativeappinfo = ((NativeAppInfo) (context.getPackageManager().resolveActivity(intent, 0)));
	//    4    6:aload_0         
	//    5    7:invokevirtual   #415 <Method PackageManager Context.getPackageManager()>
	//    6   10:aload_1         
	//    7   11:iconst_0        
	//    8   12:invokevirtual   #608 <Method ResolveInfo PackageManager.resolveActivity(Intent, int)>
	//    9   15:astore_2        
		if(nativeappinfo == null)
	//*  10   16:aload_2         
	//*  11   17:ifnonnull       22
			return null;
	//   12   20:aconst_null     
	//   13   21:areturn         
		if(!FacebookSignatureValidator.validateSignature(context, ((ResolveInfo) (nativeappinfo)).activityInfo.packageName))
	//*  14   22:aload_0         
	//*  15   23:aload_2         
	//*  16   24:getfield        #614 <Field ActivityInfo ResolveInfo.activityInfo>
	//*  17   27:getfield        #619 <Field String ActivityInfo.packageName>
	//*  18   30:invokestatic    #625 <Method boolean FacebookSignatureValidator.validateSignature(Context, String)>
	//*  19   33:ifne            38
			return null;
	//   20   36:aconst_null     
	//   21   37:areturn         
		else
			return intent;
	//   22   38:aload_1         
	//   23   39:areturn         
	}

	static Intent validateServiceIntent(Context context, Intent intent, NativeAppInfo nativeappinfo)
	{
		if(intent == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		nativeappinfo = ((NativeAppInfo) (context.getPackageManager().resolveService(intent, 0)));
	//    4    6:aload_0         
	//    5    7:invokevirtual   #415 <Method PackageManager Context.getPackageManager()>
	//    6   10:aload_1         
	//    7   11:iconst_0        
	//    8   12:invokevirtual   #628 <Method ResolveInfo PackageManager.resolveService(Intent, int)>
	//    9   15:astore_2        
		if(nativeappinfo == null)
	//*  10   16:aload_2         
	//*  11   17:ifnonnull       22
			return null;
	//   12   20:aconst_null     
	//   13   21:areturn         
		if(!FacebookSignatureValidator.validateSignature(context, ((ResolveInfo) (nativeappinfo)).serviceInfo.packageName))
	//*  14   22:aload_0         
	//*  15   23:aload_2         
	//*  16   24:getfield        #632 <Field ServiceInfo ResolveInfo.serviceInfo>
	//*  17   27:getfield        #635 <Field String ServiceInfo.packageName>
	//*  18   30:invokestatic    #625 <Method boolean FacebookSignatureValidator.validateSignature(Context, String)>
	//*  19   33:ifne            38
			return null;
	//   20   36:aconst_null     
	//   21   37:areturn         
		else
			return intent;
	//   22   38:aload_1         
	//   23   39:areturn         
	}

	private static final List KNOWN_PROTOCOL_VERSIONS = Arrays.asList(((Object []) (new Integer[] {
		Integer.valueOf(0x133c6b1), Integer.valueOf(0x1339f47), Integer.valueOf(0x13354a2), Integer.valueOf(0x1335433), Integer.valueOf(0x13353e4), Integer.valueOf(0x13353c9), Integer.valueOf(0x133529d), Integer.valueOf(0x1335124), Integer.valueOf(0x13350ac), Integer.valueOf(0x1332d23), 
		Integer.valueOf(0x1332b3a), Integer.valueOf(0x1332ac6), Integer.valueOf(0x133060d)
	})));
	private static final String TAG = "com.facebook.internal.NativeProtocol";
	private static final Map actionToAppInfoMap = buildActionToAppInfoMap();
	private static final List effectCameraAppInfoList = buildEffectCameraAppInfoList();
	private static final List facebookAppInfoList = buildFacebookAppList();
	private static final AtomicBoolean protocolVersionsAsyncUpdating = new AtomicBoolean(false);

	static 
	{
	//    0    0:invokestatic    #48  <Method List buildFacebookAppList()>
	//    1    3:putstatic       #50  <Field List facebookAppInfoList>
	//    2    6:invokestatic    #53  <Method List buildEffectCameraAppInfoList()>
	//    3    9:putstatic       #55  <Field List effectCameraAppInfoList>
	//    4   12:invokestatic    #59  <Method Map buildActionToAppInfoMap()>
	//    5   15:putstatic       #61  <Field Map actionToAppInfoMap>
	//    6   18:new             #63  <Class AtomicBoolean>
	//    7   21:dup             
	//    8   22:iconst_0        
	//    9   23:invokespecial   #67  <Method void AtomicBoolean(boolean)>
	//   10   26:putstatic       #69  <Field AtomicBoolean protocolVersionsAsyncUpdating>
	//   11   29:bipush          13
	//   12   31:anewarray       Integer[]
	//   13   34:dup             
	//   14   35:iconst_0        
	//   15   36:ldc1            #72  <Int 0x133c6b1>
	//   16   38:invokestatic    #76  <Method Integer Integer.valueOf(int)>
	//   17   41:aastore         
	//   18   42:dup             
	//   19   43:iconst_1        
	//   20   44:ldc1            #77  <Int 0x1339f47>
	//   21   46:invokestatic    #76  <Method Integer Integer.valueOf(int)>
	//   22   49:aastore         
	//   23   50:dup             
	//   24   51:iconst_2        
	//   25   52:ldc1            #78  <Int 0x13354a2>
	//   26   54:invokestatic    #76  <Method Integer Integer.valueOf(int)>
	//   27   57:aastore         
	//   28   58:dup             
	//   29   59:iconst_3        
	//   30   60:ldc1            #79  <Int 0x1335433>
	//   31   62:invokestatic    #76  <Method Integer Integer.valueOf(int)>
	//   32   65:aastore         
	//   33   66:dup             
	//   34   67:iconst_4        
	//   35   68:ldc1            #80  <Int 0x13353e4>
	//   36   70:invokestatic    #76  <Method Integer Integer.valueOf(int)>
	//   37   73:aastore         
	//   38   74:dup             
	//   39   75:iconst_5        
	//   40   76:ldc1            #81  <Int 0x13353c9>
	//   41   78:invokestatic    #76  <Method Integer Integer.valueOf(int)>
	//   42   81:aastore         
	//   43   82:dup             
	//   44   83:bipush          6
	//   45   85:ldc1            #82  <Int 0x133529d>
	//   46   87:invokestatic    #76  <Method Integer Integer.valueOf(int)>
	//   47   90:aastore         
	//   48   91:dup             
	//   49   92:bipush          7
	//   50   94:ldc1            #83  <Int 0x1335124>
	//   51   96:invokestatic    #76  <Method Integer Integer.valueOf(int)>
	//   52   99:aastore         
	//   53  100:dup             
	//   54  101:bipush          8
	//   55  103:ldc1            #84  <Int 0x13350ac>
	//   56  105:invokestatic    #76  <Method Integer Integer.valueOf(int)>
	//   57  108:aastore         
	//   58  109:dup             
	//   59  110:bipush          9
	//   60  112:ldc1            #85  <Int 0x1332d23>
	//   61  114:invokestatic    #76  <Method Integer Integer.valueOf(int)>
	//   62  117:aastore         
	//   63  118:dup             
	//   64  119:bipush          10
	//   65  121:ldc1            #86  <Int 0x1332b3a>
	//   66  123:invokestatic    #76  <Method Integer Integer.valueOf(int)>
	//   67  126:aastore         
	//   68  127:dup             
	//   69  128:bipush          11
	//   70  130:ldc1            #87  <Int 0x1332ac6>
	//   71  132:invokestatic    #76  <Method Integer Integer.valueOf(int)>
	//   72  135:aastore         
	//   73  136:dup             
	//   74  137:bipush          12
	//   75  139:ldc1            #88  <Int 0x133060d>
	//   76  141:invokestatic    #76  <Method Integer Integer.valueOf(int)>
	//   77  144:aastore         
	//   78  145:invokestatic    #94  <Method List Arrays.asList(Object[])>
	//   79  148:putstatic       #96  <Field List KNOWN_PROTOCOL_VERSIONS>
	//*  80  151:return          
	}


/*
	static TreeSet access$000(NativeAppInfo nativeappinfo)
	{
		return fetchAllAvailableProtocolVersionsForAppInfo(nativeappinfo);
	//    0    0:aload_0         
	//    1    1:invokestatic    #104 <Method TreeSet fetchAllAvailableProtocolVersionsForAppInfo(NativeProtocol$NativeAppInfo)>
	//    2    4:areturn         
	}

*/


/*
	static AtomicBoolean access$1100()
	{
		return protocolVersionsAsyncUpdating;
	//    0    0:getstatic       #69  <Field AtomicBoolean protocolVersionsAsyncUpdating>
	//    1    3:areturn         
	}

*/


/*
	static List access$900()
	{
		return facebookAppInfoList;
	//    0    0:getstatic       #50  <Field List facebookAppInfoList>
	//    1    3:areturn         
	}

*/
}
