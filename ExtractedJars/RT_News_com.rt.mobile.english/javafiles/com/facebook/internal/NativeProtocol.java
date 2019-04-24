// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.internal;

import android.content.*;
import android.content.pm.*;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.*;
import com.facebook.login.DefaultAudience;
import java.util.*;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.facebook.internal:
//			Utility

public final class NativeProtocol
{
	private static class KatanaAppInfo extends NativeAppInfo
	{

		protected String getPackage()
		{
			return "com.facebook.katana";
		//    0    0:ldc1            #11  <String "com.facebook.katana">
		//    1    2:areturn         
		}

		static final String KATANA_PACKAGE = "com.facebook.katana";

		private KatanaAppInfo()
		{
		//    0    0:aload_0         
		//    1    1:aconst_null     
		//    2    2:invokespecial   #16  <Method void NativeProtocol$NativeAppInfo(NativeProtocol$1)>
		//    3    5:return          
		}

	}

	private static class MessengerAppInfo extends NativeAppInfo
	{

		protected String getPackage()
		{
			return "com.facebook.orca";
		//    0    0:ldc1            #11  <String "com.facebook.orca">
		//    1    2:areturn         
		}

		static final String MESSENGER_PACKAGE = "com.facebook.orca";

		private MessengerAppInfo()
		{
		//    0    0:aload_0         
		//    1    1:aconst_null     
		//    2    2:invokespecial   #16  <Method void NativeProtocol$NativeAppInfo(NativeProtocol$1)>
		//    3    5:return          
		}

	}

	private static abstract class NativeAppInfo
	{

		private static HashSet buildAppSignatureHashes()
		{
			HashSet hashset = new HashSet();
		//    0    0:new             #45  <Class HashSet>
		//    1    3:dup             
		//    2    4:invokespecial   #46  <Method void HashSet()>
		//    3    7:astore_0        
			hashset.add("8a3c4b262d721acd49a4bf97d5213199c86fa2b9");
		//    4    8:aload_0         
		//    5    9:ldc1            #17  <String "8a3c4b262d721acd49a4bf97d5213199c86fa2b9">
		//    6   11:invokevirtual   #50  <Method boolean HashSet.add(Object)>
		//    7   14:pop             
			hashset.add("a4b7452e2ed8f5f191058ca7bbfd26b0d3214bfc");
		//    8   15:aload_0         
		//    9   16:ldc1            #11  <String "a4b7452e2ed8f5f191058ca7bbfd26b0d3214bfc">
		//   10   18:invokevirtual   #50  <Method boolean HashSet.add(Object)>
		//   11   21:pop             
			hashset.add("5e8f16062ea3cd2c4a0d547876baa6f38cabf625");
		//   12   22:aload_0         
		//   13   23:ldc1            #14  <String "5e8f16062ea3cd2c4a0d547876baa6f38cabf625">
		//   14   25:invokevirtual   #50  <Method boolean HashSet.add(Object)>
		//   15   28:pop             
			return hashset;
		//   16   29:aload_0         
		//   17   30:areturn         
		}

		private void fetchAvailableVersions(boolean flag)
		{
			this;
		//    0    0:aload_0         
			JVM INSTR monitorenter ;
		//    1    1:monitorenter    
			if(flag)
				break MISSING_BLOCK_LABEL_16;
		//    2    2:iload_1         
		//    3    3:ifne            16
			if(availableVersions != null)
		//*   4    6:aload_0         
		//*   5    7:getfield        #54  <Field TreeSet availableVersions>
		//*   6   10:ifnonnull       24
				break MISSING_BLOCK_LABEL_24;
		//    7   13:goto            16
			availableVersions = NativeProtocol.fetchAllAvailableProtocolVersionsForAppInfo(this);
		//    8   16:aload_0         
		//    9   17:aload_0         
		//   10   18:invokestatic    #58  <Method TreeSet NativeProtocol.access$000(NativeProtocol$NativeAppInfo)>
		//   11   21:putfield        #54  <Field TreeSet availableVersions>
			this;
		//   12   24:aload_0         
			JVM INSTR monitorexit ;
		//   13   25:monitorexit     
			return;
		//   14   26:return          
		//*  15   27:aload_0         
_L2:
			Exception exception;
			throw exception;
		//   16   28:monitorexit     
		//   17   29:aload_2         
		//   18   30:athrow          
			exception;
		//   19   31:astore_2        
			if(true) goto _L2; else goto _L1
_L1:
		//*  20   32:goto            27
		}

		public TreeSet getAvailableVersions()
		{
			if(availableVersions == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #54  <Field TreeSet availableVersions>
		//*   2    4:ifnonnull       12
				fetchAvailableVersions(false);
		//    3    7:aload_0         
		//    4    8:iconst_0        
		//    5    9:invokespecial   #43  <Method void fetchAvailableVersions(boolean)>
			return availableVersions;
		//    6   12:aload_0         
		//    7   13:getfield        #54  <Field TreeSet availableVersions>
		//    8   16:areturn         
		}

		protected abstract String getPackage();

		public boolean validateSignature(Context context, String s)
		{
			String s1 = Build.BRAND;
		//    0    0:getstatic       #72  <Field String Build.BRAND>
		//    1    3:astore          5
			int i = context.getApplicationInfo().flags;
		//    2    5:aload_1         
		//    3    6:invokevirtual   #78  <Method ApplicationInfo Context.getApplicationInfo()>
		//    4    9:getfield        #84  <Field int ApplicationInfo.flags>
		//    5   12:istore_3        
			if(s1.startsWith("generic") && (i & 2) != 0)
		//*   6   13:aload           5
		//*   7   15:ldc1            #86  <String "generic">
		//*   8   17:invokevirtual   #92  <Method boolean String.startsWith(String)>
		//*   9   20:ifeq            31
		//*  10   23:iload_3         
		//*  11   24:iconst_2        
		//*  12   25:iand            
		//*  13   26:ifeq            31
				return true;
		//   14   29:iconst_1        
		//   15   30:ireturn         
			int k;
			try
			{
				context = ((Context) (context.getPackageManager().getPackageInfo(s, 64)));
		//   16   31:aload_1         
		//   17   32:invokevirtual   #96  <Method PackageManager Context.getPackageManager()>
		//   18   35:aload_2         
		//   19   36:bipush          64
		//   20   38:invokevirtual   #102 <Method PackageInfo PackageManager.getPackageInfo(String, int)>
		//   21   41:astore_1        
			}
		//*  22   42:aload_1         
		//*  23   43:getfield        #108 <Field Signature[] PackageInfo.signatures>
		//*  24   46:astore_1        
		//*  25   47:aload_1         
		//*  26   48:arraylength     
		//*  27   49:istore          4
		//*  28   51:iconst_0        
		//*  29   52:istore_3        
		//*  30   53:iload_3         
		//*  31   54:iload           4
		//*  32   56:icmpge          88
		//*  33   59:aload_1         
		//*  34   60:iload_3         
		//*  35   61:aaload          
		//*  36   62:invokevirtual   #114 <Method byte[] Signature.toByteArray()>
		//*  37   65:invokestatic    #120 <Method String Utility.sha1hash(byte[])>
		//*  38   68:astore_2        
		//*  39   69:getstatic       #31  <Field HashSet validAppSignatureHashes>
		//*  40   72:aload_2         
		//*  41   73:invokevirtual   #123 <Method boolean HashSet.contains(Object)>
		//*  42   76:ifeq            81
		//*  43   79:iconst_1        
		//*  44   80:ireturn         
		//*  45   81:iload_3         
		//*  46   82:iconst_1        
		//*  47   83:iadd            
		//*  48   84:istore_3        
		//*  49   85:goto            53
		//*  50   88:iconst_0        
		//*  51   89:ireturn         
			// Misplaced declaration of an exception variable
			catch(Context context)
		//*  52   90:astore_1        
			{
				return false;
		//   53   91:iconst_0        
		//   54   92:ireturn         
			}
			context = ((Context) (((PackageInfo) (context)).signatures));
			k = context.length;
			for(int j = 0; j < k; j++)
			{
				s = Utility.sha1hash(((Signature) (context[j])).toByteArray());
				if(validAppSignatureHashes.contains(((Object) (s))))
					return true;
			}

			return false;
		}

		private static final String FBI_HASH = "a4b7452e2ed8f5f191058ca7bbfd26b0d3214bfc";
		private static final String FBL_HASH = "5e8f16062ea3cd2c4a0d547876baa6f38cabf625";
		private static final String FBR_HASH = "8a3c4b262d721acd49a4bf97d5213199c86fa2b9";
		private static final HashSet validAppSignatureHashes = buildAppSignatureHashes();
		private TreeSet availableVersions;

		static 
		{
		//    0    0:invokestatic    #29  <Method HashSet buildAppSignatureHashes()>
		//    1    3:putstatic       #31  <Field HashSet validAppSignatureHashes>
		//*   2    6:return          
		}


/*
		static void access$600(NativeAppInfo nativeappinfo, boolean flag)
		{
			nativeappinfo.fetchAvailableVersions(flag);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokespecial   #43  <Method void fetchAvailableVersions(boolean)>
			return;
		//    3    5:return          
		}

*/

		private NativeAppInfo()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #35  <Method void Object()>
		//    2    4:return          
		}

	}

	private static class WakizashiAppInfo extends NativeAppInfo
	{

		protected String getPackage()
		{
			return "com.facebook.wakizashi";
		//    0    0:ldc1            #11  <String "com.facebook.wakizashi">
		//    1    2:areturn         
		}

		static final String WAKIZASHI_PACKAGE = "com.facebook.wakizashi";

		private WakizashiAppInfo()
		{
		//    0    0:aload_0         
		//    1    1:aconst_null     
		//    2    2:invokespecial   #16  <Method void NativeProtocol$NativeAppInfo(NativeProtocol$1)>
		//    3    5:return          
		}

	}


	public NativeProtocol()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #318 <Method void Object()>
	//    2    4:return          
	}

	private static Map buildActionToAppInfoMap()
	{
		HashMap hashmap = new HashMap();
	//    0    0:new             #328 <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #329 <Method void HashMap()>
	//    3    7:astore_0        
		ArrayList arraylist = new ArrayList();
	//    4    8:new             #331 <Class ArrayList>
	//    5   11:dup             
	//    6   12:invokespecial   #332 <Method void ArrayList()>
	//    7   15:astore_1        
		arraylist.add(((Object) (new MessengerAppInfo())));
	//    8   16:aload_1         
	//    9   17:new             #11  <Class NativeProtocol$MessengerAppInfo>
	//   10   20:dup             
	//   11   21:aconst_null     
	//   12   22:invokespecial   #333 <Method void NativeProtocol$MessengerAppInfo(NativeProtocol$1)>
	//   13   25:invokevirtual   #337 <Method boolean ArrayList.add(Object)>
	//   14   28:pop             
		((Map) (hashmap)).put("com.facebook.platform.action.request.OGACTIONPUBLISH_DIALOG", ((Object) (facebookAppInfoList)));
	//   15   29:aload_0         
	//   16   30:ldc1            #34  <String "com.facebook.platform.action.request.OGACTIONPUBLISH_DIALOG">
	//   17   32:getstatic       #288 <Field List facebookAppInfoList>
	//   18   35:invokeinterface #343 <Method Object Map.put(Object, Object)>
	//   19   40:pop             
		((Map) (hashmap)).put("com.facebook.platform.action.request.FEED_DIALOG", ((Object) (facebookAppInfoList)));
	//   20   41:aload_0         
	//   21   42:ldc1            #25  <String "com.facebook.platform.action.request.FEED_DIALOG">
	//   22   44:getstatic       #288 <Field List facebookAppInfoList>
	//   23   47:invokeinterface #343 <Method Object Map.put(Object, Object)>
	//   24   52:pop             
		((Map) (hashmap)).put("com.facebook.platform.action.request.LIKE_DIALOG", ((Object) (facebookAppInfoList)));
	//   25   53:aload_0         
	//   26   54:ldc1            #28  <String "com.facebook.platform.action.request.LIKE_DIALOG">
	//   27   56:getstatic       #288 <Field List facebookAppInfoList>
	//   28   59:invokeinterface #343 <Method Object Map.put(Object, Object)>
	//   29   64:pop             
		((Map) (hashmap)).put("com.facebook.platform.action.request.APPINVITES_DIALOG", ((Object) (facebookAppInfoList)));
	//   30   65:aload_0         
	//   31   66:ldc1            #22  <String "com.facebook.platform.action.request.APPINVITES_DIALOG">
	//   32   68:getstatic       #288 <Field List facebookAppInfoList>
	//   33   71:invokeinterface #343 <Method Object Map.put(Object, Object)>
	//   34   76:pop             
		((Map) (hashmap)).put("com.facebook.platform.action.request.MESSAGE_DIALOG", ((Object) (arraylist)));
	//   35   77:aload_0         
	//   36   78:ldc1            #31  <String "com.facebook.platform.action.request.MESSAGE_DIALOG">
	//   37   80:aload_1         
	//   38   81:invokeinterface #343 <Method Object Map.put(Object, Object)>
	//   39   86:pop             
		((Map) (hashmap)).put("com.facebook.platform.action.request.OGMESSAGEPUBLISH_DIALOG", ((Object) (arraylist)));
	//   40   87:aload_0         
	//   41   88:ldc1            #37  <String "com.facebook.platform.action.request.OGMESSAGEPUBLISH_DIALOG">
	//   42   90:aload_1         
	//   43   91:invokeinterface #343 <Method Object Map.put(Object, Object)>
	//   44   96:pop             
		return ((Map) (hashmap));
	//   45   97:aload_0         
	//   46   98:areturn         
	}

	private static List buildFacebookAppList()
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #331 <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #332 <Method void ArrayList()>
	//    3    7:astore_0        
		((List) (arraylist)).add(((Object) (FACEBOOK_APP_INFO)));
	//    4    8:aload_0         
	//    5    9:getstatic       #282 <Field NativeProtocol$NativeAppInfo FACEBOOK_APP_INFO>
	//    6   12:invokeinterface #348 <Method boolean List.add(Object)>
	//    7   17:pop             
		((List) (arraylist)).add(((Object) (new WakizashiAppInfo())));
	//    8   18:aload_0         
	//    9   19:new             #17  <Class NativeProtocol$WakizashiAppInfo>
	//   10   22:dup             
	//   11   23:aconst_null     
	//   12   24:invokespecial   #349 <Method void NativeProtocol$WakizashiAppInfo(NativeProtocol$1)>
	//   13   27:invokeinterface #348 <Method boolean List.add(Object)>
	//   14   32:pop             
		return ((List) (arraylist));
	//   15   33:aload_0         
	//   16   34:areturn         
	}

	private static Uri buildPlatformProviderVersionURI(NativeAppInfo nativeappinfo)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #354 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #355 <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("content://");
	//    4    8:aload_1         
	//    5    9:ldc1            #73  <String "content://">
	//    6   11:invokevirtual   #359 <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(nativeappinfo.getPackage());
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:invokevirtual   #363 <Method String NativeProtocol$NativeAppInfo.getPackage()>
	//   11   20:invokevirtual   #359 <Method StringBuilder StringBuilder.append(String)>
	//   12   23:pop             
		stringbuilder.append(".provider.PlatformProvider/versions");
	//   13   24:aload_1         
	//   14   25:ldc1            #202 <String ".provider.PlatformProvider/versions">
	//   15   27:invokevirtual   #359 <Method StringBuilder StringBuilder.append(String)>
	//   16   30:pop             
		return Uri.parse(stringbuilder.toString());
	//   17   31:aload_1         
	//   18   32:invokevirtual   #366 <Method String StringBuilder.toString()>
	//   19   35:invokestatic    #372 <Method Uri Uri.parse(String)>
	//   20   38:areturn         
	}

	public static int computeLatestAvailableVersionFromVersionSpec(TreeSet treeset, int i, int ai[])
	{
		byte byte0 = -1;
	//    0    0:iconst_m1       
	//    1    1:istore          6
		int j = ai.length;
	//    2    3:aload_2         
	//    3    4:arraylength     
	//    4    5:istore_3        
		treeset = ((TreeSet) (treeset.descendingIterator()));
	//    5    6:aload_0         
	//    6    7:invokevirtual   #380 <Method Iterator TreeSet.descendingIterator()>
	//    7   10:astore_0        
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
	//*  15   19:invokeinterface #386 <Method boolean Iterator.hasNext()>
	//*  16   24:ifeq            118
		{
			int k1 = ((Integer)((Iterator) (treeset)).next()).intValue();
	//   17   27:aload_0         
	//   18   28:invokeinterface #390 <Method Object Iterator.next()>
	//   19   33:checkcast       #303 <Class Integer>
	//   20   36:invokevirtual   #394 <Method int Integer.intValue()>
	//   21   39:istore          8
			int j1 = Math.max(i1, k1);
	//   22   41:iload           5
	//   23   43:iload           8
	//   24   45:invokestatic    #400 <Method int Math.max(int, int)>
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
	//   61  112:invokestatic    #403 <Method int Math.min(int, int)>
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
	//    4    6:new             #408 <Class Bundle>
	//    5    9:dup             
	//    6   10:invokespecial   #409 <Method void Bundle()>
	//    7   13:astore_1        
		bundle.putString("error_description", facebookexception.toString());
	//    8   14:aload_1         
	//    9   15:ldc1            #61  <String "error_description">
	//   10   17:aload_0         
	//   11   18:invokevirtual   #412 <Method String FacebookException.toString()>
	//   12   21:invokevirtual   #416 <Method void Bundle.putString(String, String)>
		if(facebookexception instanceof FacebookOperationCanceledException)
	//*  13   24:aload_0         
	//*  14   25:instanceof      #418 <Class FacebookOperationCanceledException>
	//*  15   28:ifeq            39
			bundle.putString("error_type", "UserCanceled");
	//   16   31:aload_1         
	//   17   32:ldc1            #70  <String "error_type">
	//   18   34:ldc1            #94  <String "UserCanceled">
	//   19   36:invokevirtual   #416 <Method void Bundle.putString(String, String)>
		return bundle;
	//   20   39:aload_1         
	//   21   40:areturn         
	}

	public static Intent createPlatformActivityIntent(Context context, String s, String s1, int i, Bundle bundle)
	{
		context = ((Context) (findActivityIntent(context, "com.facebook.platform.PLATFORM_ACTIVITY", s1)));
	//    0    0:aload_0         
	//    1    1:ldc1            #168 <String "com.facebook.platform.PLATFORM_ACTIVITY">
	//    2    3:aload_2         
	//    3    4:invokestatic    #424 <Method Intent findActivityIntent(Context, String, String)>
	//    4    7:astore_0        
		if(context == null)
	//*   5    8:aload_0         
	//*   6    9:ifnonnull       14
		{
			return null;
	//    7   12:aconst_null     
	//    8   13:areturn         
		} else
		{
			setupProtocolRequestIntent(((Intent) (context)), s, s1, i, bundle);
	//    9   14:aload_0         
	//   10   15:aload_1         
	//   11   16:aload_2         
	//   12   17:iload_3         
	//   13   18:aload           4
	//   14   20:invokestatic    #428 <Method void setupProtocolRequestIntent(Intent, String, String, int, Bundle)>
			return ((Intent) (context));
	//   15   23:aload_0         
	//   16   24:areturn         
		}
	}

	public static Intent createPlatformServiceIntent(Context context)
	{
		for(Iterator iterator = facebookAppInfoList.iterator(); iterator.hasNext();)
	//*   0    0:getstatic       #288 <Field List facebookAppInfoList>
	//*   1    3:invokeinterface #433 <Method Iterator List.iterator()>
	//*   2    8:astore_1        
	//*   3    9:aload_1         
	//*   4   10:invokeinterface #386 <Method boolean Iterator.hasNext()>
	//*   5   15:ifeq            62
		{
			Object obj = ((Object) ((NativeAppInfo)iterator.next()));
	//    6   18:aload_1         
	//    7   19:invokeinterface #390 <Method Object Iterator.next()>
	//    8   24:checkcast       #14  <Class NativeProtocol$NativeAppInfo>
	//    9   27:astore_2        
			obj = ((Object) (validateServiceIntent(context, (new Intent("com.facebook.platform.PLATFORM_SERVICE")).setPackage(((NativeAppInfo) (obj)).getPackage()).addCategory("android.intent.category.DEFAULT"), ((NativeAppInfo) (obj)))));
	//   10   28:aload_0         
	//   11   29:new             #435 <Class Intent>
	//   12   32:dup             
	//   13   33:ldc1            #171 <String "com.facebook.platform.PLATFORM_SERVICE">
	//   14   35:invokespecial   #438 <Method void Intent(String)>
	//   15   38:aload_2         
	//   16   39:invokevirtual   #363 <Method String NativeProtocol$NativeAppInfo.getPackage()>
	//   17   42:invokevirtual   #442 <Method Intent Intent.setPackage(String)>
	//   18   45:ldc2            #444 <String "android.intent.category.DEFAULT">
	//   19   48:invokevirtual   #447 <Method Intent Intent.addCategory(String)>
	//   20   51:aload_2         
	//   21   52:invokestatic    #451 <Method Intent validateServiceIntent(Context, Intent, NativeProtocol$NativeAppInfo)>
	//   22   55:astore_2        
			if(obj != null)
	//*  23   56:aload_2         
	//*  24   57:ifnull          9
				return ((Intent) (obj));
	//   25   60:aload_2         
	//   26   61:areturn         
		}

		return null;
	//   27   62:aconst_null     
	//   28   63:areturn         
	}

	public static Intent createProtocolResultIntent(Intent intent, Bundle bundle, FacebookException facebookexception)
	{
		UUID uuid = getCallIdFromIntent(intent);
	//    0    0:aload_0         
	//    1    1:invokestatic    #457 <Method UUID getCallIdFromIntent(Intent)>
	//    2    4:astore_3        
		if(uuid == null)
	//*   3    5:aload_3         
	//*   4    6:ifnonnull       11
			return null;
	//    5    9:aconst_null     
	//    6   10:areturn         
		Intent intent1 = new Intent();
	//    7   11:new             #435 <Class Intent>
	//    8   14:dup             
	//    9   15:invokespecial   #458 <Method void Intent()>
	//   10   18:astore          4
		intent1.putExtra("com.facebook.platform.protocol.PROTOCOL_VERSION", getProtocolVersionFromIntent(intent));
	//   11   20:aload           4
	//   12   22:ldc1            #136 <String "com.facebook.platform.protocol.PROTOCOL_VERSION">
	//   13   24:aload_0         
	//   14   25:invokestatic    #462 <Method int getProtocolVersionFromIntent(Intent)>
	//   15   28:invokevirtual   #466 <Method Intent Intent.putExtra(String, int)>
	//   16   31:pop             
		intent = ((Intent) (new Bundle()));
	//   17   32:new             #408 <Class Bundle>
	//   18   35:dup             
	//   19   36:invokespecial   #409 <Method void Bundle()>
	//   20   39:astore_0        
		((Bundle) (intent)).putString("action_id", uuid.toString());
	//   21   40:aload_0         
	//   22   41:ldc1            #49  <String "action_id">
	//   23   43:aload_3         
	//   24   44:invokevirtual   #469 <Method String UUID.toString()>
	//   25   47:invokevirtual   #416 <Method void Bundle.putString(String, String)>
		if(facebookexception != null)
	//*  26   50:aload_2         
	//*  27   51:ifnull          64
			((Bundle) (intent)).putBundle("error", createBundleForException(facebookexception));
	//   28   54:aload_0         
	//   29   55:ldc1            #55  <String "error">
	//   30   57:aload_2         
	//   31   58:invokestatic    #471 <Method Bundle createBundleForException(FacebookException)>
	//   32   61:invokevirtual   #475 <Method void Bundle.putBundle(String, Bundle)>
		intent1.putExtra("com.facebook.platform.protocol.BRIDGE_ARGS", ((Bundle) (intent)));
	//   33   64:aload           4
	//   34   66:ldc1            #124 <String "com.facebook.platform.protocol.BRIDGE_ARGS">
	//   35   68:aload_0         
	//   36   69:invokevirtual   #478 <Method Intent Intent.putExtra(String, Bundle)>
	//   37   72:pop             
		if(bundle != null)
	//*  38   73:aload_1         
	//*  39   74:ifnull          86
			intent1.putExtra("com.facebook.platform.protocol.RESULT_ARGS", bundle);
	//   40   77:aload           4
	//   41   79:ldc1            #133 <String "com.facebook.platform.protocol.RESULT_ARGS">
	//   42   81:aload_1         
	//   43   82:invokevirtual   #478 <Method Intent Intent.putExtra(String, Bundle)>
	//   44   85:pop             
		return intent1;
	//   45   86:aload           4
	//   46   88:areturn         
	}

	public static Intent createProxyAuthIntent(Context context, String s, Collection collection, String s1, boolean flag, boolean flag1, DefaultAudience defaultaudience)
	{
		for(Iterator iterator = facebookAppInfoList.iterator(); iterator.hasNext();)
	//*   0    0:getstatic       #288 <Field List facebookAppInfoList>
	//*   1    3:invokeinterface #433 <Method Iterator List.iterator()>
	//*   2    8:astore          7
	//*   3   10:aload           7
	//*   4   12:invokeinterface #386 <Method boolean Iterator.hasNext()>
	//*   5   17:ifeq            185
		{
			Object obj = ((Object) ((NativeAppInfo)iterator.next()));
	//    6   20:aload           7
	//    7   22:invokeinterface #390 <Method Object Iterator.next()>
	//    8   27:checkcast       #14  <Class NativeProtocol$NativeAppInfo>
	//    9   30:astore          8
			Intent intent = (new Intent()).setClassName(((NativeAppInfo) (obj)).getPackage(), "com.facebook.katana.ProxyAuth").putExtra("client_id", s);
	//   10   32:new             #435 <Class Intent>
	//   11   35:dup             
	//   12   36:invokespecial   #458 <Method void Intent()>
	//   13   39:aload           8
	//   14   41:invokevirtual   #363 <Method String NativeProtocol$NativeAppInfo.getPackage()>
	//   15   44:ldc1            #147 <String "com.facebook.katana.ProxyAuth">
	//   16   46:invokevirtual   #484 <Method Intent Intent.setClassName(String, String)>
	//   17   49:ldc1            #150 <String "client_id">
	//   18   51:aload_1         
	//   19   52:invokevirtual   #486 <Method Intent Intent.putExtra(String, String)>
	//   20   55:astore          9
			if(!Utility.isNullOrEmpty(collection))
	//*  21   57:aload_2         
	//*  22   58:invokestatic    #492 <Method boolean Utility.isNullOrEmpty(Collection)>
	//*  23   61:ifne            79
				intent.putExtra("scope", TextUtils.join(",", ((Iterable) (collection))));
	//   24   64:aload           9
	//   25   66:ldc1            #156 <String "scope">
	//   26   68:ldc2            #494 <String ",">
	//   27   71:aload_2         
	//   28   72:invokestatic    #500 <Method String TextUtils.join(CharSequence, Iterable)>
	//   29   75:invokevirtual   #486 <Method Intent Intent.putExtra(String, String)>
	//   30   78:pop             
			if(!Utility.isNullOrEmpty(s1))
	//*  31   79:aload_3         
	//*  32   80:invokestatic    #503 <Method boolean Utility.isNullOrEmpty(String)>
	//*  33   83:ifne            95
				intent.putExtra("e2e", s1);
	//   34   86:aload           9
	//   35   88:ldc1            #153 <String "e2e">
	//   36   90:aload_3         
	//   37   91:invokevirtual   #486 <Method Intent Intent.putExtra(String, String)>
	//   38   94:pop             
			intent.putExtra("response_type", "token,signed_request");
	//   39   95:aload           9
	//   40   97:ldc2            #505 <String "response_type">
	//   41  100:ldc2            #507 <String "token,signed_request">
	//   42  103:invokevirtual   #486 <Method Intent Intent.putExtra(String, String)>
	//   43  106:pop             
			intent.putExtra("return_scopes", "true");
	//   44  107:aload           9
	//   45  109:ldc2            #509 <String "return_scopes">
	//   46  112:ldc2            #511 <String "true">
	//   47  115:invokevirtual   #486 <Method Intent Intent.putExtra(String, String)>
	//   48  118:pop             
			if(flag1)
	//*  49  119:iload           5
	//*  50  121:ifeq            138
				intent.putExtra("default_audience", defaultaudience.getNativeProtocolAudience());
	//   51  124:aload           9
	//   52  126:ldc2            #513 <String "default_audience">
	//   53  129:aload           6
	//   54  131:invokevirtual   #518 <Method String DefaultAudience.getNativeProtocolAudience()>
	//   55  134:invokevirtual   #486 <Method Intent Intent.putExtra(String, String)>
	//   56  137:pop             
			intent.putExtra("legacy_override", "v2.4");
	//   57  138:aload           9
	//   58  140:ldc2            #520 <String "legacy_override">
	//   59  143:ldc2            #522 <String "v2.4">
	//   60  146:invokevirtual   #486 <Method Intent Intent.putExtra(String, String)>
	//   61  149:pop             
			if(flag)
	//*  62  150:iload           4
	//*  63  152:ifeq            167
				intent.putExtra("auth_type", "rerequest");
	//   64  155:aload           9
	//   65  157:ldc2            #524 <String "auth_type">
	//   66  160:ldc2            #526 <String "rerequest">
	//   67  163:invokevirtual   #486 <Method Intent Intent.putExtra(String, String)>
	//   68  166:pop             
			obj = ((Object) (validateActivityIntent(context, intent, ((NativeAppInfo) (obj)))));
	//   69  167:aload_0         
	//   70  168:aload           9
	//   71  170:aload           8
	//   72  172:invokestatic    #529 <Method Intent validateActivityIntent(Context, Intent, NativeProtocol$NativeAppInfo)>
	//   73  175:astore          8
			if(obj != null)
	//*  74  177:aload           8
	//*  75  179:ifnull          10
				return ((Intent) (obj));
	//   76  182:aload           8
	//   77  184:areturn         
		}

		return null;
	//   78  185:aconst_null     
	//   79  186:areturn         
	}

	public static Intent createTokenRefreshIntent(Context context)
	{
		for(Iterator iterator = facebookAppInfoList.iterator(); iterator.hasNext();)
	//*   0    0:getstatic       #288 <Field List facebookAppInfoList>
	//*   1    3:invokeinterface #433 <Method Iterator List.iterator()>
	//*   2    8:astore_1        
	//*   3    9:aload_1         
	//*   4   10:invokeinterface #386 <Method boolean Iterator.hasNext()>
	//*   5   15:ifeq            56
		{
			Object obj = ((Object) ((NativeAppInfo)iterator.next()));
	//    6   18:aload_1         
	//    7   19:invokeinterface #390 <Method Object Iterator.next()>
	//    8   24:checkcast       #14  <Class NativeProtocol$NativeAppInfo>
	//    9   27:astore_2        
			obj = ((Object) (validateServiceIntent(context, (new Intent()).setClassName(((NativeAppInfo) (obj)).getPackage(), "com.facebook.katana.platform.TokenRefreshService"), ((NativeAppInfo) (obj)))));
	//   10   28:aload_0         
	//   11   29:new             #435 <Class Intent>
	//   12   32:dup             
	//   13   33:invokespecial   #458 <Method void Intent()>
	//   14   36:aload_2         
	//   15   37:invokevirtual   #363 <Method String NativeProtocol$NativeAppInfo.getPackage()>
	//   16   40:ldc1            #159 <String "com.facebook.katana.platform.TokenRefreshService">
	//   17   42:invokevirtual   #484 <Method Intent Intent.setClassName(String, String)>
	//   18   45:aload_2         
	//   19   46:invokestatic    #451 <Method Intent validateServiceIntent(Context, Intent, NativeProtocol$NativeAppInfo)>
	//   20   49:astore_2        
			if(obj != null)
	//*  21   50:aload_2         
	//*  22   51:ifnull          9
				return ((Intent) (obj));
	//   23   54:aload_2         
	//   24   55:areturn         
		}

		return null;
	//   25   56:aconst_null     
	//   26   57:areturn         
	}

	private static TreeSet fetchAllAvailableProtocolVersionsForAppInfo(NativeAppInfo nativeappinfo)
	{
		Object obj;
		TreeSet treeset;
		ContentResolver contentresolver;
		Uri uri;
		treeset = new TreeSet();
	//    0    0:new             #376 <Class TreeSet>
	//    1    3:dup             
	//    2    4:invokespecial   #532 <Method void TreeSet()>
	//    3    7:astore_2        
		contentresolver = FacebookSdk.getApplicationContext().getContentResolver();
	//    4    8:invokestatic    #538 <Method Context FacebookSdk.getApplicationContext()>
	//    5   11:invokevirtual   #544 <Method ContentResolver Context.getContentResolver()>
	//    6   14:astore_3        
		uri = buildPlatformProviderVersionURI(nativeappinfo);
	//    7   15:aload_0         
	//    8   16:invokestatic    #546 <Method Uri buildPlatformProviderVersionURI(NativeProtocol$NativeAppInfo)>
	//    9   19:astore          4
		obj = null;
	//   10   21:aconst_null     
	//   11   22:astore_1        
		PackageManager packagemanager;
		StringBuilder stringbuilder;
		packagemanager = FacebookSdk.getApplicationContext().getPackageManager();
	//   12   23:invokestatic    #538 <Method Context FacebookSdk.getApplicationContext()>
	//   13   26:invokevirtual   #550 <Method PackageManager Context.getPackageManager()>
	//   14   29:astore          5
		stringbuilder = new StringBuilder();
	//   15   31:new             #354 <Class StringBuilder>
	//   16   34:dup             
	//   17   35:invokespecial   #355 <Method void StringBuilder()>
	//   18   38:astore          6
		stringbuilder.append(nativeappinfo.getPackage());
	//   19   40:aload           6
	//   20   42:aload_0         
	//   21   43:invokevirtual   #363 <Method String NativeProtocol$NativeAppInfo.getPackage()>
	//   22   46:invokevirtual   #359 <Method StringBuilder StringBuilder.append(String)>
	//   23   49:pop             
		stringbuilder.append(".provider.PlatformProvider");
	//   24   50:aload           6
	//   25   52:ldc1            #199 <String ".provider.PlatformProvider">
	//   26   54:invokevirtual   #359 <Method StringBuilder StringBuilder.append(String)>
	//   27   57:pop             
		if(packagemanager.resolveContentProvider(stringbuilder.toString(), 0) == null) goto _L2; else goto _L1
	//   28   58:aload           5
	//   29   60:aload           6
	//   30   62:invokevirtual   #366 <Method String StringBuilder.toString()>
	//   31   65:iconst_0        
	//   32   66:invokevirtual   #556 <Method android.content.pm.ProviderInfo PackageManager.resolveContentProvider(String, int)>
	//   33   69:ifnull          137
_L1:
		nativeappinfo = ((NativeAppInfo) (contentresolver.query(uri, new String[] {
			"version"
		}, ((String) (null)), ((String []) (null)), ((String) (null)))));
	//   34   72:aload_3         
	//   35   73:aload           4
	//   36   75:iconst_1        
	//   37   76:anewarray       String[]
	//   38   79:dup             
	//   39   80:iconst_0        
	//   40   81:ldc1            #205 <String "version">
	//   41   83:aastore         
	//   42   84:aconst_null     
	//   43   85:aconst_null     
	//   44   86:aconst_null     
	//   45   87:invokevirtual   #564 <Method Cursor ContentResolver.query(Uri, String[], String, String[], String)>
	//   46   90:astore_0        
		obj = ((Object) (nativeappinfo));
	//   47   91:aload_0         
	//   48   92:astore_1        
		if(nativeappinfo == null) goto _L4; else goto _L3
	//   49   93:aload_0         
	//   50   94:ifnull          139
_L3:
		obj = ((Object) (nativeappinfo));
	//   51   97:aload_0         
	//   52   98:astore_1        
		if(!((Cursor) (nativeappinfo)).moveToNext())
			break; /* Loop/switch isn't completed */
	//   53   99:aload_0         
	//   54  100:invokeinterface #569 <Method boolean Cursor.moveToNext()>
	//   55  105:ifeq            139
		treeset.add(((Object) (Integer.valueOf(((Cursor) (nativeappinfo)).getInt(((Cursor) (nativeappinfo)).getColumnIndex("version"))))));
	//   56  108:aload_2         
	//   57  109:aload_0         
	//   58  110:aload_0         
	//   59  111:ldc1            #205 <String "version">
	//   60  113:invokeinterface #573 <Method int Cursor.getColumnIndex(String)>
	//   61  118:invokeinterface #577 <Method int Cursor.getInt(int)>
	//   62  123:invokestatic    #307 <Method Integer Integer.valueOf(int)>
	//   63  126:invokevirtual   #578 <Method boolean TreeSet.add(Object)>
	//   64  129:pop             
		if(true) goto _L3; else goto _L4
	//   65  130:goto            97
		obj;
	//   66  133:astore_1        
		break MISSING_BLOCK_LABEL_156;
	//   67  134:goto            156
_L2:
		obj = null;
	//   68  137:aconst_null     
	//   69  138:astore_1        
_L4:
		if(obj != null)
	//*  70  139:aload_1         
	//*  71  140:ifnull          149
			((Cursor) (obj)).close();
	//   72  143:aload_1         
	//   73  144:invokeinterface #581 <Method void Cursor.close()>
		return treeset;
	//   74  149:aload_2         
	//   75  150:areturn         
		Exception exception;
		exception;
	//   76  151:astore_2        
		nativeappinfo = ((NativeAppInfo) (obj));
	//   77  152:aload_1         
	//   78  153:astore_0        
		obj = ((Object) (exception));
	//   79  154:aload_2         
	//   80  155:astore_1        
		if(nativeappinfo != null)
	//*  81  156:aload_0         
	//*  82  157:ifnull          166
			((Cursor) (nativeappinfo)).close();
	//   83  160:aload_0         
	//   84  161:invokeinterface #581 <Method void Cursor.close()>
		throw obj;
	//   85  166:aload_1         
	//   86  167:athrow          
	}

	private static Intent findActivityIntent(Context context, String s, String s1)
	{
		List list = (List)actionToAppInfoMap.get(((Object) (s1)));
	//    0    0:getstatic       #294 <Field Map actionToAppInfoMap>
	//    1    3:aload_2         
	//    2    4:invokeinterface #586 <Method Object Map.get(Object)>
	//    3    9:checkcast       #347 <Class List>
	//    4   12:astore_3        
		s1 = null;
	//    5   13:aconst_null     
	//    6   14:astore_2        
		if(list == null)
	//*   7   15:aload_3         
	//*   8   16:ifnonnull       21
			return null;
	//    9   19:aconst_null     
	//   10   20:areturn         
		for(Iterator iterator = list.iterator(); iterator.hasNext();)
	//*  11   21:aload_3         
	//*  12   22:invokeinterface #433 <Method Iterator List.iterator()>
	//*  13   27:astore          4
	//*  14   29:aload           4
	//*  15   31:invokeinterface #386 <Method boolean Iterator.hasNext()>
	//*  16   36:ifeq            88
		{
			s1 = ((String) ((NativeAppInfo)iterator.next()));
	//   17   39:aload           4
	//   18   41:invokeinterface #390 <Method Object Iterator.next()>
	//   19   46:checkcast       #14  <Class NativeProtocol$NativeAppInfo>
	//   20   49:astore_2        
			Intent intent = validateActivityIntent(context, (new Intent()).setAction(s).setPackage(((NativeAppInfo) (s1)).getPackage()).addCategory("android.intent.category.DEFAULT"), ((NativeAppInfo) (s1)));
	//   21   50:aload_0         
	//   22   51:new             #435 <Class Intent>
	//   23   54:dup             
	//   24   55:invokespecial   #458 <Method void Intent()>
	//   25   58:aload_1         
	//   26   59:invokevirtual   #589 <Method Intent Intent.setAction(String)>
	//   27   62:aload_2         
	//   28   63:invokevirtual   #363 <Method String NativeProtocol$NativeAppInfo.getPackage()>
	//   29   66:invokevirtual   #442 <Method Intent Intent.setPackage(String)>
	//   30   69:ldc2            #444 <String "android.intent.category.DEFAULT">
	//   31   72:invokevirtual   #447 <Method Intent Intent.addCategory(String)>
	//   32   75:aload_2         
	//   33   76:invokestatic    #529 <Method Intent validateActivityIntent(Context, Intent, NativeProtocol$NativeAppInfo)>
	//   34   79:astore_3        
			s1 = ((String) (intent));
	//   35   80:aload_3         
	//   36   81:astore_2        
			if(intent != null)
	//*  37   82:aload_3         
	//*  38   83:ifnull          29
				return intent;
	//   39   86:aload_3         
	//   40   87:areturn         
		}

		return ((Intent) (s1));
	//   41   88:aload_2         
	//   42   89:areturn         
	}

	public static Bundle getBridgeArgumentsFromIntent(Intent intent)
	{
		if(!isVersionCompatibleWithBucketedIntent(getProtocolVersionFromIntent(intent)))
	//*   0    0:aload_0         
	//*   1    1:invokestatic    #462 <Method int getProtocolVersionFromIntent(Intent)>
	//*   2    4:invokestatic    #595 <Method boolean isVersionCompatibleWithBucketedIntent(int)>
	//*   3    7:ifne            12
			return null;
	//    4   10:aconst_null     
	//    5   11:areturn         
		else
			return intent.getBundleExtra("com.facebook.platform.protocol.BRIDGE_ARGS");
	//    6   12:aload_0         
	//    7   13:ldc1            #124 <String "com.facebook.platform.protocol.BRIDGE_ARGS">
	//    8   15:invokevirtual   #599 <Method Bundle Intent.getBundleExtra(String)>
	//    9   18:areturn         
	}

	public static UUID getCallIdFromIntent(Intent intent)
	{
		if(intent == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		if(isVersionCompatibleWithBucketedIntent(getProtocolVersionFromIntent(intent)))
	//*   4    6:aload_0         
	//*   5    7:invokestatic    #462 <Method int getProtocolVersionFromIntent(Intent)>
	//*   6   10:invokestatic    #595 <Method boolean isVersionCompatibleWithBucketedIntent(int)>
	//*   7   13:ifeq            42
		{
			intent = ((Intent) (intent.getBundleExtra("com.facebook.platform.protocol.BRIDGE_ARGS")));
	//    8   16:aload_0         
	//    9   17:ldc1            #124 <String "com.facebook.platform.protocol.BRIDGE_ARGS">
	//   10   19:invokevirtual   #599 <Method Bundle Intent.getBundleExtra(String)>
	//   11   22:astore_0        
			if(intent != null)
	//*  12   23:aload_0         
	//*  13   24:ifnull          37
				intent = ((Intent) (((Bundle) (intent)).getString("action_id")));
	//   14   27:aload_0         
	//   15   28:ldc1            #49  <String "action_id">
	//   16   30:invokevirtual   #605 <Method String Bundle.getString(String)>
	//   17   33:astore_0        
			else
	//*  18   34:goto            49
				intent = null;
	//   19   37:aconst_null     
	//   20   38:astore_0        
		} else
	//*  21   39:goto            49
		{
			intent = ((Intent) (intent.getStringExtra("com.facebook.platform.protocol.CALL_ID")));
	//   22   42:aload_0         
	//   23   43:ldc1            #127 <String "com.facebook.platform.protocol.CALL_ID">
	//   24   45:invokevirtual   #608 <Method String Intent.getStringExtra(String)>
	//   25   48:astore_0        
		}
		if(intent == null)
			break MISSING_BLOCK_LABEL_60;
	//   26   49:aload_0         
	//   27   50:ifnull          60
		intent = ((Intent) (UUID.fromString(((String) (intent)))));
	//   28   53:aload_0         
	//   29   54:invokestatic    #612 <Method UUID UUID.fromString(String)>
	//   30   57:astore_0        
		return ((UUID) (intent));
	//   31   58:aload_0         
	//   32   59:areturn         
_L2:
		return null;
	//   33   60:aconst_null     
	//   34   61:areturn         
		intent;
	//   35   62:astore_0        
		if(true) goto _L2; else goto _L1
_L1:
	//*  36   63:goto            60
	}

	public static Bundle getErrorDataFromResultIntent(Intent intent)
	{
		if(!isErrorResult(intent))
	//*   0    0:aload_0         
	//*   1    1:invokestatic    #617 <Method boolean isErrorResult(Intent)>
	//*   2    4:ifne            9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		Bundle bundle = getBridgeArgumentsFromIntent(intent);
	//    5    9:aload_0         
	//    6   10:invokestatic    #619 <Method Bundle getBridgeArgumentsFromIntent(Intent)>
	//    7   13:astore_1        
		if(bundle != null)
	//*   8   14:aload_1         
	//*   9   15:ifnull          25
			return bundle.getBundle("error");
	//   10   18:aload_1         
	//   11   19:ldc1            #55  <String "error">
	//   12   21:invokevirtual   #622 <Method Bundle Bundle.getBundle(String)>
	//   13   24:areturn         
		else
			return intent.getExtras();
	//   14   25:aload_0         
	//   15   26:invokevirtual   #626 <Method Bundle Intent.getExtras()>
	//   16   29:areturn         
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
	//    5    7:ldc1            #70  <String "error_type">
	//    6    9:invokevirtual   #605 <Method String Bundle.getString(String)>
	//    7   12:astore_2        
		String s = s1;
	//    8   13:aload_2         
	//    9   14:astore_1        
		if(s1 == null)
	//*  10   15:aload_2         
	//*  11   16:ifnonnull       27
			s = bundle.getString("com.facebook.platform.status.ERROR_TYPE");
	//   12   19:aload_0         
	//   13   20:ldc2            #257 <String "com.facebook.platform.status.ERROR_TYPE">
	//   14   23:invokevirtual   #605 <Method String Bundle.getString(String)>
	//   15   26:astore_1        
		String s2 = bundle.getString("error_description");
	//   16   27:aload_0         
	//   17   28:ldc1            #61  <String "error_description">
	//   18   30:invokevirtual   #605 <Method String Bundle.getString(String)>
	//   19   33:astore_3        
		s1 = s2;
	//   20   34:aload_3         
	//   21   35:astore_2        
		if(s2 == null)
	//*  22   36:aload_3         
	//*  23   37:ifnonnull       47
			s1 = bundle.getString("com.facebook.platform.status.ERROR_DESCRIPTION");
	//   24   40:aload_0         
	//   25   41:ldc1            #248 <String "com.facebook.platform.status.ERROR_DESCRIPTION">
	//   26   43:invokevirtual   #605 <Method String Bundle.getString(String)>
	//   27   46:astore_2        
		if(s != null && s.equalsIgnoreCase("UserCanceled"))
	//*  28   47:aload_1         
	//*  29   48:ifnull          69
	//*  30   51:aload_1         
	//*  31   52:ldc1            #94  <String "UserCanceled">
	//*  32   54:invokevirtual   #631 <Method boolean String.equalsIgnoreCase(String)>
	//*  33   57:ifeq            69
			return ((FacebookException) (new FacebookOperationCanceledException(s1)));
	//   34   60:new             #418 <Class FacebookOperationCanceledException>
	//   35   63:dup             
	//   36   64:aload_2         
	//   37   65:invokespecial   #632 <Method void FacebookOperationCanceledException(String)>
	//   38   68:areturn         
		else
			return new FacebookException(s1);
	//   39   69:new             #411 <Class FacebookException>
	//   40   72:dup             
	//   41   73:aload_2         
	//   42   74:invokespecial   #633 <Method void FacebookException(String)>
	//   43   77:areturn         
	}

	public static int getLatestAvailableProtocolVersionForAction(String s, int ai[])
	{
		return getLatestAvailableProtocolVersionForAppInfoList((List)actionToAppInfoMap.get(((Object) (s))), ai);
	//    0    0:getstatic       #294 <Field Map actionToAppInfoMap>
	//    1    3:aload_0         
	//    2    4:invokeinterface #586 <Method Object Map.get(Object)>
	//    3    9:checkcast       #347 <Class List>
	//    4   12:aload_1         
	//    5   13:invokestatic    #639 <Method int getLatestAvailableProtocolVersionForAppInfoList(List, int[])>
	//    6   16:ireturn         
	}

	private static int getLatestAvailableProtocolVersionForAppInfoList(List list, int ai[])
	{
		updateAllAvailableProtocolVersionsAsync();
	//    0    0:invokestatic    #642 <Method void updateAllAvailableProtocolVersionsAsync()>
		if(list == null)
	//*   1    3:aload_0         
	//*   2    4:ifnonnull       9
			return -1;
	//    3    7:iconst_m1       
	//    4    8:ireturn         
		for(list = ((List) (list.iterator())); ((Iterator) (list)).hasNext();)
	//*   5    9:aload_0         
	//*   6   10:invokeinterface #433 <Method Iterator List.iterator()>
	//*   7   15:astore_0        
	//*   8   16:aload_0         
	//*   9   17:invokeinterface #386 <Method boolean Iterator.hasNext()>
	//*  10   22:ifeq            52
		{
			int i = computeLatestAvailableVersionFromVersionSpec(((NativeAppInfo)((Iterator) (list)).next()).getAvailableVersions(), getLatestKnownVersion(), ai);
	//   11   25:aload_0         
	//   12   26:invokeinterface #390 <Method Object Iterator.next()>
	//   13   31:checkcast       #14  <Class NativeProtocol$NativeAppInfo>
	//   14   34:invokevirtual   #646 <Method TreeSet NativeProtocol$NativeAppInfo.getAvailableVersions()>
	//   15   37:invokestatic    #649 <Method int getLatestKnownVersion()>
	//   16   40:aload_1         
	//   17   41:invokestatic    #651 <Method int computeLatestAvailableVersionFromVersionSpec(TreeSet, int, int[])>
	//   18   44:istore_2        
			if(i != -1)
	//*  19   45:iload_2         
	//*  20   46:iconst_m1       
	//*  21   47:icmpeq          16
				return i;
	//   22   50:iload_2         
	//   23   51:ireturn         
		}

		return -1;
	//   24   52:iconst_m1       
	//   25   53:ireturn         
	}

	public static int getLatestAvailableProtocolVersionForService(int i)
	{
		return getLatestAvailableProtocolVersionForAppInfoList(facebookAppInfoList, new int[] {
			i
		});
	//    0    0:getstatic       #288 <Field List facebookAppInfoList>
	//    1    3:iconst_1        
	//    2    4:newarray        int[]
	//    3    6:dup             
	//    4    7:iconst_0        
	//    5    8:iload_0         
	//    6    9:iastore         
	//    7   10:invokestatic    #639 <Method int getLatestAvailableProtocolVersionForAppInfoList(List, int[])>
	//    8   13:ireturn         
	}

	public static final int getLatestKnownVersion()
	{
		return ((Integer)KNOWN_PROTOCOL_VERSIONS.get(0)).intValue();
	//    0    0:getstatic       #315 <Field List KNOWN_PROTOCOL_VERSIONS>
	//    1    3:iconst_0        
	//    2    4:invokeinterface #656 <Method Object List.get(int)>
	//    3    9:checkcast       #303 <Class Integer>
	//    4   12:invokevirtual   #394 <Method int Integer.intValue()>
	//    5   15:ireturn         
	}

	public static Bundle getMethodArgumentsFromIntent(Intent intent)
	{
		if(!isVersionCompatibleWithBucketedIntent(getProtocolVersionFromIntent(intent)))
	//*   0    0:aload_0         
	//*   1    1:invokestatic    #462 <Method int getProtocolVersionFromIntent(Intent)>
	//*   2    4:invokestatic    #595 <Method boolean isVersionCompatibleWithBucketedIntent(int)>
	//*   3    7:ifne            15
			return intent.getExtras();
	//    4   10:aload_0         
	//    5   11:invokevirtual   #626 <Method Bundle Intent.getExtras()>
	//    6   14:areturn         
		else
			return intent.getBundleExtra("com.facebook.platform.protocol.METHOD_ARGS");
	//    7   15:aload_0         
	//    8   16:ldc1            #130 <String "com.facebook.platform.protocol.METHOD_ARGS">
	//    9   18:invokevirtual   #599 <Method Bundle Intent.getBundleExtra(String)>
	//   10   21:areturn         
	}

	public static int getProtocolVersionFromIntent(Intent intent)
	{
		return intent.getIntExtra("com.facebook.platform.protocol.PROTOCOL_VERSION", 0);
	//    0    0:aload_0         
	//    1    1:ldc1            #136 <String "com.facebook.platform.protocol.PROTOCOL_VERSION">
	//    2    3:iconst_0        
	//    3    4:invokevirtual   #661 <Method int Intent.getIntExtra(String, int)>
	//    4    7:ireturn         
	}

	public static Bundle getSuccessResultsFromIntent(Intent intent)
	{
		int i = getProtocolVersionFromIntent(intent);
	//    0    0:aload_0         
	//    1    1:invokestatic    #462 <Method int getProtocolVersionFromIntent(Intent)>
	//    2    4:istore_1        
		intent = ((Intent) (intent.getExtras()));
	//    3    5:aload_0         
	//    4    6:invokevirtual   #626 <Method Bundle Intent.getExtras()>
	//    5    9:astore_0        
		if(isVersionCompatibleWithBucketedIntent(i))
	//*   6   10:iload_1         
	//*   7   11:invokestatic    #595 <Method boolean isVersionCompatibleWithBucketedIntent(int)>
	//*   8   14:ifeq            30
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
	//   14   24:ldc1            #133 <String "com.facebook.platform.protocol.RESULT_ARGS">
	//   15   26:invokevirtual   #622 <Method Bundle Bundle.getBundle(String)>
	//   16   29:areturn         
		} else
		{
			return ((Bundle) (intent));
	//   17   30:aload_0         
	//   18   31:areturn         
		}
	}

	public static boolean isErrorResult(Intent intent)
	{
		Bundle bundle = getBridgeArgumentsFromIntent(intent);
	//    0    0:aload_0         
	//    1    1:invokestatic    #619 <Method Bundle getBridgeArgumentsFromIntent(Intent)>
	//    2    4:astore_1        
		if(bundle != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          16
			return bundle.containsKey("error");
	//    5    9:aload_1         
	//    6   10:ldc1            #55  <String "error">
	//    7   12:invokevirtual   #665 <Method boolean Bundle.containsKey(String)>
	//    8   15:ireturn         
		else
			return intent.hasExtra("com.facebook.platform.status.ERROR_TYPE");
	//    9   16:aload_0         
	//   10   17:ldc2            #257 <String "com.facebook.platform.status.ERROR_TYPE">
	//   11   20:invokevirtual   #668 <Method boolean Intent.hasExtra(String)>
	//   12   23:ireturn         
	}

	public static boolean isVersionCompatibleWithBucketedIntent(int i)
	{
		return KNOWN_PROTOCOL_VERSIONS.contains(((Object) (Integer.valueOf(i)))) && i >= 0x133529d;
	//    0    0:getstatic       #315 <Field List KNOWN_PROTOCOL_VERSIONS>
	//    1    3:iload_0         
	//    2    4:invokestatic    #307 <Method Integer Integer.valueOf(int)>
	//    3    7:invokeinterface #671 <Method boolean List.contains(Object)>
	//    4   12:ifeq            23
	//    5   15:iload_0         
	//    6   16:ldc1            #219 <Int 0x133529d>
	//    7   18:icmplt          23
	//    8   21:iconst_1        
	//    9   22:ireturn         
	//   10   23:iconst_0        
	//   11   24:ireturn         
	}

	public static void setupProtocolRequestIntent(Intent intent, String s, String s1, int i, Bundle bundle)
	{
		String s3 = FacebookSdk.getApplicationId();
	//    0    0:invokestatic    #674 <Method String FacebookSdk.getApplicationId()>
	//    1    3:astore          6
		String s2 = FacebookSdk.getApplicationName();
	//    2    5:invokestatic    #677 <Method String FacebookSdk.getApplicationName()>
	//    3    8:astore          5
		intent.putExtra("com.facebook.platform.protocol.PROTOCOL_VERSION", i).putExtra("com.facebook.platform.protocol.PROTOCOL_ACTION", s1).putExtra("com.facebook.platform.extra.APPLICATION_ID", s3);
	//    4   10:aload_0         
	//    5   11:ldc1            #136 <String "com.facebook.platform.protocol.PROTOCOL_VERSION">
	//    6   13:iload_3         
	//    7   14:invokevirtual   #466 <Method Intent Intent.putExtra(String, int)>
	//    8   17:ldc1            #121 <String "com.facebook.platform.protocol.PROTOCOL_ACTION">
	//    9   19:aload_2         
	//   10   20:invokevirtual   #486 <Method Intent Intent.putExtra(String, String)>
	//   11   23:ldc1            #100 <String "com.facebook.platform.extra.APPLICATION_ID">
	//   12   25:aload           6
	//   13   27:invokevirtual   #486 <Method Intent Intent.putExtra(String, String)>
	//   14   30:pop             
		if(isVersionCompatibleWithBucketedIntent(i))
	//*  15   31:iload_3         
	//*  16   32:invokestatic    #595 <Method boolean isVersionCompatibleWithBucketedIntent(int)>
	//*  17   35:ifeq            94
		{
			s1 = ((String) (new Bundle()));
	//   18   38:new             #408 <Class Bundle>
	//   19   41:dup             
	//   20   42:invokespecial   #409 <Method void Bundle()>
	//   21   45:astore_2        
			((Bundle) (s1)).putString("action_id", s);
	//   22   46:aload_2         
	//   23   47:ldc1            #49  <String "action_id">
	//   24   49:aload_1         
	//   25   50:invokevirtual   #416 <Method void Bundle.putString(String, String)>
			Utility.putNonEmptyString(((Bundle) (s1)), "app_name", s2);
	//   26   53:aload_2         
	//   27   54:ldc1            #52  <String "app_name">
	//   28   56:aload           5
	//   29   58:invokestatic    #681 <Method void Utility.putNonEmptyString(Bundle, String, String)>
			intent.putExtra("com.facebook.platform.protocol.BRIDGE_ARGS", ((Bundle) (s1)));
	//   30   61:aload_0         
	//   31   62:ldc1            #124 <String "com.facebook.platform.protocol.BRIDGE_ARGS">
	//   32   64:aload_2         
	//   33   65:invokevirtual   #478 <Method Intent Intent.putExtra(String, Bundle)>
	//   34   68:pop             
			s = ((String) (bundle));
	//   35   69:aload           4
	//   36   71:astore_1        
			if(bundle == null)
	//*  37   72:aload           4
	//*  38   74:ifnonnull       85
				s = ((String) (new Bundle()));
	//   39   77:new             #408 <Class Bundle>
	//   40   80:dup             
	//   41   81:invokespecial   #409 <Method void Bundle()>
	//   42   84:astore_1        
			intent.putExtra("com.facebook.platform.protocol.METHOD_ARGS", ((Bundle) (s)));
	//   43   85:aload_0         
	//   44   86:ldc1            #130 <String "com.facebook.platform.protocol.METHOD_ARGS">
	//   45   88:aload_1         
	//   46   89:invokevirtual   #478 <Method Intent Intent.putExtra(String, Bundle)>
	//   47   92:pop             
			return;
	//   48   93:return          
		}
		intent.putExtra("com.facebook.platform.protocol.CALL_ID", s);
	//   49   94:aload_0         
	//   50   95:ldc1            #127 <String "com.facebook.platform.protocol.CALL_ID">
	//   51   97:aload_1         
	//   52   98:invokevirtual   #486 <Method Intent Intent.putExtra(String, String)>
	//   53  101:pop             
		if(!Utility.isNullOrEmpty(s2))
	//*  54  102:aload           5
	//*  55  104:invokestatic    #503 <Method boolean Utility.isNullOrEmpty(String)>
	//*  56  107:ifne            119
			intent.putExtra("com.facebook.platform.extra.APPLICATION_NAME", s2);
	//   57  110:aload_0         
	//   58  111:ldc1            #103 <String "com.facebook.platform.extra.APPLICATION_NAME">
	//   59  113:aload           5
	//   60  115:invokevirtual   #486 <Method Intent Intent.putExtra(String, String)>
	//   61  118:pop             
		intent.putExtras(bundle);
	//   62  119:aload_0         
	//   63  120:aload           4
	//   64  122:invokevirtual   #685 <Method Intent Intent.putExtras(Bundle)>
	//   65  125:pop             
	//   66  126:return          
	}

	public static void updateAllAvailableProtocolVersionsAsync()
	{
		if(!protocolVersionsAsyncUpdating.compareAndSet(false, true))
	//*   0    0:getstatic       #301 <Field AtomicBoolean protocolVersionsAsyncUpdating>
	//*   1    3:iconst_0        
	//*   2    4:iconst_1        
	//*   3    5:invokevirtual   #689 <Method boolean AtomicBoolean.compareAndSet(boolean, boolean)>
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
				//    0    0:invokestatic    #20  <Method List NativeProtocol.access$500()>
				//    1    3:invokeinterface #26  <Method Iterator List.iterator()>
				//    2    8:astore_1        
				//    3    9:aload_1         
				//    4   10:invokeinterface #32  <Method boolean Iterator.hasNext()>
				//    5   15:ifeq            34
				//    6   18:aload_1         
				//    7   19:invokeinterface #36  <Method Object Iterator.next()>
				//    8   24:checkcast       #38  <Class NativeProtocol$NativeAppInfo>
				//    9   27:iconst_1        
				//   10   28:invokestatic    #42  <Method void NativeProtocol$NativeAppInfo.access$600(NativeProtocol$NativeAppInfo, boolean)>
				//*  11   31:goto            9
					NativeProtocol.protocolVersionsAsyncUpdating.set(false);
				//   12   34:invokestatic    #46  <Method AtomicBoolean NativeProtocol.access$700()>
				//   13   37:iconst_0        
				//   14   38:invokevirtual   #52  <Method void AtomicBoolean.set(boolean)>
					return;
				//   15   41:return          
					Exception exception;
					exception;
				//   16   42:astore_1        
					NativeProtocol.protocolVersionsAsyncUpdating.set(false);
				//   17   43:invokestatic    #46  <Method AtomicBoolean NativeProtocol.access$700()>
				//   18   46:iconst_0        
				//   19   47:invokevirtual   #52  <Method void AtomicBoolean.set(boolean)>
					throw exception;
				//   20   50:aload_1         
				//   21   51:athrow          
				}

			}
);
	//    6   12:invokestatic    #693 <Method Executor FacebookSdk.getExecutor()>
	//    7   15:new             #6   <Class NativeProtocol$1>
	//    8   18:dup             
	//    9   19:invokespecial   #694 <Method void NativeProtocol$1()>
	//   10   22:invokeinterface #700 <Method void Executor.execute(Runnable)>
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
		ResolveInfo resolveinfo = context.getPackageManager().resolveActivity(intent, 0);
	//    4    6:aload_0         
	//    5    7:invokevirtual   #550 <Method PackageManager Context.getPackageManager()>
	//    6   10:aload_1         
	//    7   11:iconst_0        
	//    8   12:invokevirtual   #704 <Method ResolveInfo PackageManager.resolveActivity(Intent, int)>
	//    9   15:astore_3        
		if(resolveinfo == null)
	//*  10   16:aload_3         
	//*  11   17:ifnonnull       22
			return null;
	//   12   20:aconst_null     
	//   13   21:areturn         
		if(!nativeappinfo.validateSignature(context, resolveinfo.activityInfo.packageName))
	//*  14   22:aload_2         
	//*  15   23:aload_0         
	//*  16   24:aload_3         
	//*  17   25:getfield        #710 <Field ActivityInfo ResolveInfo.activityInfo>
	//*  18   28:getfield        #715 <Field String ActivityInfo.packageName>
	//*  19   31:invokevirtual   #719 <Method boolean NativeProtocol$NativeAppInfo.validateSignature(Context, String)>
	//*  20   34:ifne            39
			return null;
	//   21   37:aconst_null     
	//   22   38:areturn         
		else
			return intent;
	//   23   39:aload_1         
	//   24   40:areturn         
	}

	static Intent validateServiceIntent(Context context, Intent intent, NativeAppInfo nativeappinfo)
	{
		if(intent == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		ResolveInfo resolveinfo = context.getPackageManager().resolveService(intent, 0);
	//    4    6:aload_0         
	//    5    7:invokevirtual   #550 <Method PackageManager Context.getPackageManager()>
	//    6   10:aload_1         
	//    7   11:iconst_0        
	//    8   12:invokevirtual   #722 <Method ResolveInfo PackageManager.resolveService(Intent, int)>
	//    9   15:astore_3        
		if(resolveinfo == null)
	//*  10   16:aload_3         
	//*  11   17:ifnonnull       22
			return null;
	//   12   20:aconst_null     
	//   13   21:areturn         
		if(!nativeappinfo.validateSignature(context, resolveinfo.serviceInfo.packageName))
	//*  14   22:aload_2         
	//*  15   23:aload_0         
	//*  16   24:aload_3         
	//*  17   25:getfield        #726 <Field ServiceInfo ResolveInfo.serviceInfo>
	//*  18   28:getfield        #729 <Field String ServiceInfo.packageName>
	//*  19   31:invokevirtual   #719 <Method boolean NativeProtocol$NativeAppInfo.validateSignature(Context, String)>
	//*  20   34:ifne            39
			return null;
	//   21   37:aconst_null     
	//   22   38:areturn         
		else
			return intent;
	//   23   39:aload_1         
	//   24   40:areturn         
	}

	public static final String ACTION_APPINVITE_DIALOG = "com.facebook.platform.action.request.APPINVITES_DIALOG";
	public static final String ACTION_FEED_DIALOG = "com.facebook.platform.action.request.FEED_DIALOG";
	public static final String ACTION_LIKE_DIALOG = "com.facebook.platform.action.request.LIKE_DIALOG";
	public static final String ACTION_MESSAGE_DIALOG = "com.facebook.platform.action.request.MESSAGE_DIALOG";
	public static final String ACTION_OGACTIONPUBLISH_DIALOG = "com.facebook.platform.action.request.OGACTIONPUBLISH_DIALOG";
	public static final String ACTION_OGMESSAGEPUBLISH_DIALOG = "com.facebook.platform.action.request.OGMESSAGEPUBLISH_DIALOG";
	public static final String AUDIENCE_EVERYONE = "everyone";
	public static final String AUDIENCE_FRIENDS = "friends";
	public static final String AUDIENCE_ME = "only_me";
	public static final String BRIDGE_ARG_ACTION_ID_STRING = "action_id";
	public static final String BRIDGE_ARG_APP_NAME_STRING = "app_name";
	public static final String BRIDGE_ARG_ERROR_BUNDLE = "error";
	public static final String BRIDGE_ARG_ERROR_CODE = "error_code";
	public static final String BRIDGE_ARG_ERROR_DESCRIPTION = "error_description";
	public static final String BRIDGE_ARG_ERROR_JSON = "error_json";
	public static final String BRIDGE_ARG_ERROR_SUBCODE = "error_subcode";
	public static final String BRIDGE_ARG_ERROR_TYPE = "error_type";
	private static final String CONTENT_SCHEME = "content://";
	public static final String ERROR_APPLICATION_ERROR = "ApplicationError";
	public static final String ERROR_NETWORK_ERROR = "NetworkError";
	public static final String ERROR_PERMISSION_DENIED = "PermissionDenied";
	public static final String ERROR_PROTOCOL_ERROR = "ProtocolError";
	public static final String ERROR_SERVICE_DISABLED = "ServiceDisabled";
	public static final String ERROR_UNKNOWN_ERROR = "UnknownError";
	public static final String ERROR_USER_CANCELED = "UserCanceled";
	public static final String EXTRA_ACCESS_TOKEN = "com.facebook.platform.extra.ACCESS_TOKEN";
	public static final String EXTRA_APPLICATION_ID = "com.facebook.platform.extra.APPLICATION_ID";
	public static final String EXTRA_APPLICATION_NAME = "com.facebook.platform.extra.APPLICATION_NAME";
	public static final String EXTRA_DIALOG_COMPLETE_KEY = "com.facebook.platform.extra.DID_COMPLETE";
	public static final String EXTRA_DIALOG_COMPLETION_GESTURE_KEY = "com.facebook.platform.extra.COMPLETION_GESTURE";
	public static final String EXTRA_EXPIRES_SECONDS_SINCE_EPOCH = "com.facebook.platform.extra.EXPIRES_SECONDS_SINCE_EPOCH";
	public static final String EXTRA_GET_INSTALL_DATA_PACKAGE = "com.facebook.platform.extra.INSTALLDATA_PACKAGE";
	public static final String EXTRA_PERMISSIONS = "com.facebook.platform.extra.PERMISSIONS";
	public static final String EXTRA_PROTOCOL_ACTION = "com.facebook.platform.protocol.PROTOCOL_ACTION";
	public static final String EXTRA_PROTOCOL_BRIDGE_ARGS = "com.facebook.platform.protocol.BRIDGE_ARGS";
	public static final String EXTRA_PROTOCOL_CALL_ID = "com.facebook.platform.protocol.CALL_ID";
	public static final String EXTRA_PROTOCOL_METHOD_ARGS = "com.facebook.platform.protocol.METHOD_ARGS";
	public static final String EXTRA_PROTOCOL_METHOD_RESULTS = "com.facebook.platform.protocol.RESULT_ARGS";
	public static final String EXTRA_PROTOCOL_VERSION = "com.facebook.platform.protocol.PROTOCOL_VERSION";
	static final String EXTRA_PROTOCOL_VERSIONS = "com.facebook.platform.extra.PROTOCOL_VERSIONS";
	public static final String EXTRA_USER_ID = "com.facebook.platform.extra.USER_ID";
	private static final NativeAppInfo FACEBOOK_APP_INFO = new KatanaAppInfo();
	private static final String FACEBOOK_PROXY_AUTH_ACTIVITY = "com.facebook.katana.ProxyAuth";
	public static final String FACEBOOK_PROXY_AUTH_APP_ID_KEY = "client_id";
	public static final String FACEBOOK_PROXY_AUTH_E2E_KEY = "e2e";
	public static final String FACEBOOK_PROXY_AUTH_PERMISSIONS_KEY = "scope";
	private static final String FACEBOOK_TOKEN_REFRESH_ACTIVITY = "com.facebook.katana.platform.TokenRefreshService";
	public static final String IMAGE_URL_KEY = "url";
	public static final String IMAGE_USER_GENERATED_KEY = "user_generated";
	static final String INTENT_ACTION_PLATFORM_ACTIVITY = "com.facebook.platform.PLATFORM_ACTIVITY";
	static final String INTENT_ACTION_PLATFORM_SERVICE = "com.facebook.platform.PLATFORM_SERVICE";
	private static final List KNOWN_PROTOCOL_VERSIONS = Arrays.asList(((Object []) (new Integer[] {
		Integer.valueOf(0x13354a2), Integer.valueOf(0x1335433), Integer.valueOf(0x13353e4), Integer.valueOf(0x13353c9), Integer.valueOf(0x133529d), Integer.valueOf(0x1335124), Integer.valueOf(0x13350ac), Integer.valueOf(0x1332d23), Integer.valueOf(0x1332b3a), Integer.valueOf(0x1332ac6), 
		Integer.valueOf(0x133060d)
	})));
	public static final int MESSAGE_GET_ACCESS_TOKEN_REPLY = 0x10001;
	public static final int MESSAGE_GET_ACCESS_TOKEN_REQUEST = 0x10000;
	public static final int MESSAGE_GET_INSTALL_DATA_REPLY = 0x10005;
	public static final int MESSAGE_GET_INSTALL_DATA_REQUEST = 0x10004;
	public static final int MESSAGE_GET_LIKE_STATUS_REPLY = 0x10007;
	public static final int MESSAGE_GET_LIKE_STATUS_REQUEST = 0x10006;
	static final int MESSAGE_GET_PROTOCOL_VERSIONS_REPLY = 0x10003;
	static final int MESSAGE_GET_PROTOCOL_VERSIONS_REQUEST = 0x10002;
	public static final int NO_PROTOCOL_AVAILABLE = -1;
	public static final String OPEN_GRAPH_CREATE_OBJECT_KEY = "fbsdk:create_object";
	private static final String PLATFORM_PROVIDER = ".provider.PlatformProvider";
	private static final String PLATFORM_PROVIDER_VERSIONS = ".provider.PlatformProvider/versions";
	private static final String PLATFORM_PROVIDER_VERSION_COLUMN = "version";
	public static final int PROTOCOL_VERSION_20121101 = 0x133060d;
	public static final int PROTOCOL_VERSION_20130502 = 0x1332ac6;
	public static final int PROTOCOL_VERSION_20130618 = 0x1332b3a;
	public static final int PROTOCOL_VERSION_20131107 = 0x1332d23;
	public static final int PROTOCOL_VERSION_20140204 = 0x13350ac;
	public static final int PROTOCOL_VERSION_20140324 = 0x1335124;
	public static final int PROTOCOL_VERSION_20140701 = 0x133529d;
	public static final int PROTOCOL_VERSION_20141001 = 0x13353c9;
	public static final int PROTOCOL_VERSION_20141028 = 0x13353e4;
	public static final int PROTOCOL_VERSION_20141107 = 0x1335433;
	public static final int PROTOCOL_VERSION_20141218 = 0x13354a2;
	public static final String RESULT_ARGS_ACCESS_TOKEN = "access_token";
	public static final String RESULT_ARGS_DIALOG_COMPLETE_KEY = "didComplete";
	public static final String RESULT_ARGS_DIALOG_COMPLETION_GESTURE_KEY = "completionGesture";
	public static final String RESULT_ARGS_EXPIRES_SECONDS_SINCE_EPOCH = "expires_seconds_since_epoch";
	public static final String RESULT_ARGS_PERMISSIONS = "permissions";
	public static final String STATUS_ERROR_CODE = "com.facebook.platform.status.ERROR_CODE";
	public static final String STATUS_ERROR_DESCRIPTION = "com.facebook.platform.status.ERROR_DESCRIPTION";
	public static final String STATUS_ERROR_JSON = "com.facebook.platform.status.ERROR_JSON";
	public static final String STATUS_ERROR_SUBCODE = "com.facebook.platform.status.ERROR_SUBCODE";
	public static final String STATUS_ERROR_TYPE = "com.facebook.platform.status.ERROR_TYPE";
	public static final String WEB_DIALOG_ACTION = "action";
	public static final String WEB_DIALOG_IS_FALLBACK = "is_fallback";
	public static final String WEB_DIALOG_PARAMS = "params";
	public static final String WEB_DIALOG_URL = "url";
	private static Map actionToAppInfoMap = buildActionToAppInfoMap();
	private static List facebookAppInfoList = buildFacebookAppList();
	private static AtomicBoolean protocolVersionsAsyncUpdating = new AtomicBoolean(false);

	static 
	{
	//    0    0:new             #8   <Class NativeProtocol$KatanaAppInfo>
	//    1    3:dup             
	//    2    4:aconst_null     
	//    3    5:invokespecial   #280 <Method void NativeProtocol$KatanaAppInfo(NativeProtocol$1)>
	//    4    8:putstatic       #282 <Field NativeProtocol$NativeAppInfo FACEBOOK_APP_INFO>
	//    5   11:invokestatic    #286 <Method List buildFacebookAppList()>
	//    6   14:putstatic       #288 <Field List facebookAppInfoList>
	//    7   17:invokestatic    #292 <Method Map buildActionToAppInfoMap()>
	//    8   20:putstatic       #294 <Field Map actionToAppInfoMap>
	//    9   23:new             #296 <Class AtomicBoolean>
	//   10   26:dup             
	//   11   27:iconst_0        
	//   12   28:invokespecial   #299 <Method void AtomicBoolean(boolean)>
	//   13   31:putstatic       #301 <Field AtomicBoolean protocolVersionsAsyncUpdating>
	//   14   34:bipush          11
	//   15   36:anewarray       Integer[]
	//   16   39:dup             
	//   17   40:iconst_0        
	//   18   41:ldc1            #227 <Int 0x13354a2>
	//   19   43:invokestatic    #307 <Method Integer Integer.valueOf(int)>
	//   20   46:aastore         
	//   21   47:dup             
	//   22   48:iconst_1        
	//   23   49:ldc1            #225 <Int 0x1335433>
	//   24   51:invokestatic    #307 <Method Integer Integer.valueOf(int)>
	//   25   54:aastore         
	//   26   55:dup             
	//   27   56:iconst_2        
	//   28   57:ldc1            #223 <Int 0x13353e4>
	//   29   59:invokestatic    #307 <Method Integer Integer.valueOf(int)>
	//   30   62:aastore         
	//   31   63:dup             
	//   32   64:iconst_3        
	//   33   65:ldc1            #221 <Int 0x13353c9>
	//   34   67:invokestatic    #307 <Method Integer Integer.valueOf(int)>
	//   35   70:aastore         
	//   36   71:dup             
	//   37   72:iconst_4        
	//   38   73:ldc1            #219 <Int 0x133529d>
	//   39   75:invokestatic    #307 <Method Integer Integer.valueOf(int)>
	//   40   78:aastore         
	//   41   79:dup             
	//   42   80:iconst_5        
	//   43   81:ldc1            #217 <Int 0x1335124>
	//   44   83:invokestatic    #307 <Method Integer Integer.valueOf(int)>
	//   45   86:aastore         
	//   46   87:dup             
	//   47   88:bipush          6
	//   48   90:ldc1            #215 <Int 0x13350ac>
	//   49   92:invokestatic    #307 <Method Integer Integer.valueOf(int)>
	//   50   95:aastore         
	//   51   96:dup             
	//   52   97:bipush          7
	//   53   99:ldc1            #213 <Int 0x1332d23>
	//   54  101:invokestatic    #307 <Method Integer Integer.valueOf(int)>
	//   55  104:aastore         
	//   56  105:dup             
	//   57  106:bipush          8
	//   58  108:ldc1            #211 <Int 0x1332b3a>
	//   59  110:invokestatic    #307 <Method Integer Integer.valueOf(int)>
	//   60  113:aastore         
	//   61  114:dup             
	//   62  115:bipush          9
	//   63  117:ldc1            #209 <Int 0x1332ac6>
	//   64  119:invokestatic    #307 <Method Integer Integer.valueOf(int)>
	//   65  122:aastore         
	//   66  123:dup             
	//   67  124:bipush          10
	//   68  126:ldc1            #207 <Int 0x133060d>
	//   69  128:invokestatic    #307 <Method Integer Integer.valueOf(int)>
	//   70  131:aastore         
	//   71  132:invokestatic    #313 <Method List Arrays.asList(Object[])>
	//   72  135:putstatic       #315 <Field List KNOWN_PROTOCOL_VERSIONS>
	//*  73  138:return          
	}


/*
	static TreeSet access$000(NativeAppInfo nativeappinfo)
	{
		return fetchAllAvailableProtocolVersionsForAppInfo(nativeappinfo);
	//    0    0:aload_0         
	//    1    1:invokestatic    #323 <Method TreeSet fetchAllAvailableProtocolVersionsForAppInfo(NativeProtocol$NativeAppInfo)>
	//    2    4:areturn         
	}

*/


/*
	static List access$500()
	{
		return facebookAppInfoList;
	//    0    0:getstatic       #288 <Field List facebookAppInfoList>
	//    1    3:areturn         
	}

*/


/*
	static AtomicBoolean access$700()
	{
		return protocolVersionsAsyncUpdating;
	//    0    0:getstatic       #301 <Field AtomicBoolean protocolVersionsAsyncUpdating>
	//    1    3:areturn         
	}

*/
}
