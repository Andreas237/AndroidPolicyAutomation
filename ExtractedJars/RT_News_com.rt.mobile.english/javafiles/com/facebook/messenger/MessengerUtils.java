// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.messenger;

import android.app.Activity;
import android.content.*;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import bolts.AppLinks;
import com.facebook.FacebookSdk;
import java.util.*;

// Referenced classes of package com.facebook.messenger:
//			ShareToMessengerParams, MessengerThreadParams

public class MessengerUtils
{

	public MessengerUtils()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #48  <Method void Object()>
	//    2    4:return          
	}

	public static void finishShareToMessenger(Activity activity, ShareToMessengerParams sharetomessengerparams)
	{
		Object obj = ((Object) (activity.getIntent()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #57  <Method Intent Activity.getIntent()>
	//    2    4:astore_3        
		Set set = ((Intent) (obj)).getCategories();
	//    3    5:aload_3         
	//    4    6:invokevirtual   #63  <Method Set Intent.getCategories()>
	//    5    9:astore_2        
		if(set == null)
	//*   6   10:aload_2         
	//*   7   11:ifnonnull       25
		{
			activity.setResult(0, ((Intent) (null)));
	//    8   14:aload_0         
	//    9   15:iconst_0        
	//   10   16:aconst_null     
	//   11   17:invokevirtual   #67  <Method void Activity.setResult(int, Intent)>
			activity.finish();
	//   12   20:aload_0         
	//   13   21:invokevirtual   #70  <Method void Activity.finish()>
			return;
	//   14   24:return          
		}
		if(set.contains("com.facebook.orca.category.PLATFORM_THREAD_20150314"))
	//*  15   25:aload_2         
	//*  16   26:ldc1            #35  <String "com.facebook.orca.category.PLATFORM_THREAD_20150314">
	//*  17   28:invokeinterface #76  <Method boolean Set.contains(Object)>
	//*  18   33:ifeq            161
		{
			obj = ((Object) (AppLinks.getAppLinkExtras(((Intent) (obj)))));
	//   19   36:aload_3         
	//   20   37:invokestatic    #82  <Method Bundle AppLinks.getAppLinkExtras(Intent)>
	//   21   40:astore_3        
			Intent intent = new Intent();
	//   22   41:new             #59  <Class Intent>
	//   23   44:dup             
	//   24   45:invokespecial   #83  <Method void Intent()>
	//   25   48:astore          4
			if(set.contains("com.facebook.orca.category.PLATFORM_THREAD_20150314"))
	//*  26   50:aload_2         
	//*  27   51:ldc1            #35  <String "com.facebook.orca.category.PLATFORM_THREAD_20150314">
	//*  28   53:invokeinterface #76  <Method boolean Set.contains(Object)>
	//*  29   58:ifeq            153
			{
				intent.putExtra("com.facebook.orca.extra.PROTOCOL_VERSION", 0x133782a);
	//   30   61:aload           4
	//   31   63:ldc1            #26  <String "com.facebook.orca.extra.PROTOCOL_VERSION">
	//   32   65:ldc1            #41  <Int 0x133782a>
	//   33   67:invokevirtual   #87  <Method Intent Intent.putExtra(String, int)>
	//   34   70:pop             
				intent.putExtra("com.facebook.orca.extra.THREAD_TOKEN", ((Bundle) (obj)).getString("com.facebook.orca.extra.THREAD_TOKEN"));
	//   35   71:aload           4
	//   36   73:ldc1            #32  <String "com.facebook.orca.extra.THREAD_TOKEN">
	//   37   75:aload_3         
	//   38   76:ldc1            #32  <String "com.facebook.orca.extra.THREAD_TOKEN">
	//   39   78:invokevirtual   #93  <Method String Bundle.getString(String)>
	//   40   81:invokevirtual   #96  <Method Intent Intent.putExtra(String, String)>
	//   41   84:pop             
				intent.setDataAndType(sharetomessengerparams.uri, sharetomessengerparams.mimeType);
	//   42   85:aload           4
	//   43   87:aload_1         
	//   44   88:getfield        #102 <Field Uri ShareToMessengerParams.uri>
	//   45   91:aload_1         
	//   46   92:getfield        #105 <Field String ShareToMessengerParams.mimeType>
	//   47   95:invokevirtual   #109 <Method Intent Intent.setDataAndType(Uri, String)>
	//   48   98:pop             
				intent.setFlags(1);
	//   49   99:aload           4
	//   50  101:iconst_1        
	//   51  102:invokevirtual   #113 <Method Intent Intent.setFlags(int)>
	//   52  105:pop             
				intent.putExtra("com.facebook.orca.extra.APPLICATION_ID", FacebookSdk.getApplicationId());
	//   53  106:aload           4
	//   54  108:ldc1            #8   <String "com.facebook.orca.extra.APPLICATION_ID">
	//   55  110:invokestatic    #119 <Method String FacebookSdk.getApplicationId()>
	//   56  113:invokevirtual   #96  <Method Intent Intent.putExtra(String, String)>
	//   57  116:pop             
				intent.putExtra("com.facebook.orca.extra.METADATA", sharetomessengerparams.metaData);
	//   58  117:aload           4
	//   59  119:ldc1            #20  <String "com.facebook.orca.extra.METADATA">
	//   60  121:aload_1         
	//   61  122:getfield        #122 <Field String ShareToMessengerParams.metaData>
	//   62  125:invokevirtual   #96  <Method Intent Intent.putExtra(String, String)>
	//   63  128:pop             
				intent.putExtra("com.facebook.orca.extra.EXTERNAL_URI", ((android.os.Parcelable) (sharetomessengerparams.externalUri)));
	//   64  129:aload           4
	//   65  131:ldc1            #11  <String "com.facebook.orca.extra.EXTERNAL_URI">
	//   66  133:aload_1         
	//   67  134:getfield        #125 <Field Uri ShareToMessengerParams.externalUri>
	//   68  137:invokevirtual   #128 <Method Intent Intent.putExtra(String, android.os.Parcelable)>
	//   69  140:pop             
				activity.setResult(-1, intent);
	//   70  141:aload_0         
	//   71  142:iconst_m1       
	//   72  143:aload           4
	//   73  145:invokevirtual   #67  <Method void Activity.setResult(int, Intent)>
				activity.finish();
	//   74  148:aload_0         
	//   75  149:invokevirtual   #70  <Method void Activity.finish()>
				return;
	//   76  152:return          
			} else
			{
				throw new RuntimeException();
	//   77  153:new             #130 <Class RuntimeException>
	//   78  156:dup             
	//   79  157:invokespecial   #131 <Method void RuntimeException()>
	//   80  160:athrow          
			}
		} else
		{
			activity.setResult(0, ((Intent) (null)));
	//   81  161:aload_0         
	//   82  162:iconst_0        
	//   83  163:aconst_null     
	//   84  164:invokevirtual   #67  <Method void Activity.setResult(int, Intent)>
			activity.finish();
	//   85  167:aload_0         
	//   86  168:invokevirtual   #70  <Method void Activity.finish()>
			return;
	//   87  171:return          
		}
	}

	private static Set getAllAvailableProtocolVersions(Context context)
	{
		Object obj;
		obj = ((Object) (context.getContentResolver()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #139 <Method ContentResolver Context.getContentResolver()>
	//    2    4:astore_2        
		context = ((Context) (new HashSet()));
	//    3    5:new             #141 <Class HashSet>
	//    4    8:dup             
	//    5    9:invokespecial   #142 <Method void HashSet()>
	//    6   12:astore_0        
		obj = ((Object) (((ContentResolver) (obj)).query(Uri.parse("content://com.facebook.orca.provider.MessengerPlatformProvider/versions"), new String[] {
			"version"
		}, ((String) (null)), ((String []) (null)), ((String) (null)))));
	//    7   13:aload_2         
	//    8   14:ldc1            #144 <String "content://com.facebook.orca.provider.MessengerPlatformProvider/versions">
	//    9   16:invokestatic    #150 <Method Uri Uri.parse(String)>
	//   10   19:iconst_1        
	//   11   20:anewarray       String[]
	//   12   23:dup             
	//   13   24:iconst_0        
	//   14   25:ldc1            #154 <String "version">
	//   15   27:aastore         
	//   16   28:aconst_null     
	//   17   29:aconst_null     
	//   18   30:aconst_null     
	//   19   31:invokevirtual   #160 <Method Cursor ContentResolver.query(Uri, String[], String, String[], String)>
	//   20   34:astore_2        
		if(obj == null)
			break MISSING_BLOCK_LABEL_94;
	//   21   35:aload_2         
	//   22   36:ifnull          94
		int i = ((Cursor) (obj)).getColumnIndex("version");
	//   23   39:aload_2         
	//   24   40:ldc1            #154 <String "version">
	//   25   42:invokeinterface #166 <Method int Cursor.getColumnIndex(String)>
	//   26   47:istore_1        
		for(; ((Cursor) (obj)).moveToNext(); ((Set) (context)).add(((Object) (Integer.valueOf(((Cursor) (obj)).getInt(i))))));
	//   27   48:aload_2         
	//   28   49:invokeinterface #170 <Method boolean Cursor.moveToNext()>
	//   29   54:ifeq            77
	//   30   57:aload_0         
	//   31   58:aload_2         
	//   32   59:iload_1         
	//   33   60:invokeinterface #174 <Method int Cursor.getInt(int)>
	//   34   65:invokestatic    #180 <Method Integer Integer.valueOf(int)>
	//   35   68:invokeinterface #183 <Method boolean Set.add(Object)>
	//   36   73:pop             
	//*  37   74:goto            48
		((Cursor) (obj)).close();
	//   38   77:aload_2         
	//   39   78:invokeinterface #186 <Method void Cursor.close()>
		return ((Set) (context));
	//   40   83:aload_0         
	//   41   84:areturn         
		context;
	//   42   85:astore_0        
		((Cursor) (obj)).close();
	//   43   86:aload_2         
	//   44   87:invokeinterface #186 <Method void Cursor.close()>
		throw context;
	//   45   92:aload_0         
	//   46   93:athrow          
		return ((Set) (context));
	//   47   94:aload_0         
	//   48   95:areturn         
	}

	public static MessengerThreadParams getMessengerThreadParamsForIntent(Intent intent)
	{
		Set set = intent.getCategories();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #63  <Method Set Intent.getCategories()>
	//    2    4:astore_3        
		if(set == null)
	//*   3    5:aload_3         
	//*   4    6:ifnonnull       11
			return null;
	//    5    9:aconst_null     
	//    6   10:areturn         
		if(set.contains("com.facebook.orca.category.PLATFORM_THREAD_20150314"))
	//*   7   11:aload_3         
	//*   8   12:ldc1            #35  <String "com.facebook.orca.category.PLATFORM_THREAD_20150314">
	//*   9   14:invokeinterface #76  <Method boolean Set.contains(Object)>
	//*  10   19:ifeq            104
		{
			intent = ((Intent) (AppLinks.getAppLinkExtras(intent)));
	//   11   22:aload_0         
	//   12   23:invokestatic    #82  <Method Bundle AppLinks.getAppLinkExtras(Intent)>
	//   13   26:astore_0        
			String s = ((Bundle) (intent)).getString("com.facebook.orca.extra.THREAD_TOKEN");
	//   14   27:aload_0         
	//   15   28:ldc1            #32  <String "com.facebook.orca.extra.THREAD_TOKEN">
	//   16   30:invokevirtual   #93  <Method String Bundle.getString(String)>
	//   17   33:astore_3        
			String s1 = ((Bundle) (intent)).getString("com.facebook.orca.extra.METADATA");
	//   18   34:aload_0         
	//   19   35:ldc1            #20  <String "com.facebook.orca.extra.METADATA">
	//   20   37:invokevirtual   #93  <Method String Bundle.getString(String)>
	//   21   40:astore          4
			String s2 = ((Bundle) (intent)).getString("com.facebook.orca.extra.PARTICIPANTS");
	//   22   42:aload_0         
	//   23   43:ldc1            #23  <String "com.facebook.orca.extra.PARTICIPANTS">
	//   24   45:invokevirtual   #93  <Method String Bundle.getString(String)>
	//   25   48:astore          5
			boolean flag = ((Bundle) (intent)).getBoolean("com.facebook.orca.extra.IS_REPLY");
	//   26   50:aload_0         
	//   27   51:ldc1            #17  <String "com.facebook.orca.extra.IS_REPLY">
	//   28   53:invokevirtual   #194 <Method boolean Bundle.getBoolean(String)>
	//   29   56:istore_1        
			boolean flag1 = ((Bundle) (intent)).getBoolean("com.facebook.orca.extra.IS_COMPOSE");
	//   30   57:aload_0         
	//   31   58:ldc1            #14  <String "com.facebook.orca.extra.IS_COMPOSE">
	//   32   60:invokevirtual   #194 <Method boolean Bundle.getBoolean(String)>
	//   33   63:istore_2        
			intent = ((Intent) (MessengerThreadParams.Origin.UNKNOWN));
	//   34   64:getstatic       #200 <Field MessengerThreadParams$Origin MessengerThreadParams$Origin.UNKNOWN>
	//   35   67:astore_0        
			if(flag)
	//*  36   68:iload_1         
	//*  37   69:ifeq            79
				intent = ((Intent) (MessengerThreadParams.Origin.REPLY_FLOW));
	//   38   72:getstatic       #203 <Field MessengerThreadParams$Origin MessengerThreadParams$Origin.REPLY_FLOW>
	//   39   75:astore_0        
			else
	//*  40   76:goto            87
			if(flag1)
	//*  41   79:iload_2         
	//*  42   80:ifeq            87
				intent = ((Intent) (MessengerThreadParams.Origin.COMPOSE_FLOW));
	//   43   83:getstatic       #206 <Field MessengerThreadParams$Origin MessengerThreadParams$Origin.COMPOSE_FLOW>
	//   44   86:astore_0        
			return new MessengerThreadParams(((MessengerThreadParams.Origin) (intent)), s, s1, parseParticipants(s2));
	//   45   87:new             #208 <Class MessengerThreadParams>
	//   46   90:dup             
	//   47   91:aload_0         
	//   48   92:aload_3         
	//   49   93:aload           4
	//   50   95:aload           5
	//   51   97:invokestatic    #212 <Method List parseParticipants(String)>
	//   52  100:invokespecial   #215 <Method void MessengerThreadParams(MessengerThreadParams$Origin, String, String, List)>
	//   53  103:areturn         
		} else
		{
			return null;
	//   54  104:aconst_null     
	//   55  105:areturn         
		}
	}

	public static boolean hasMessengerInstalled(Context context)
	{
		try
		{
			context.getPackageManager().getPackageInfo("com.facebook.orca", 0);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #223 <Method PackageManager Context.getPackageManager()>
	//    2    4:ldc1            #38  <String "com.facebook.orca">
	//    3    6:iconst_0        
	//    4    7:invokevirtual   #229 <Method android.content.pm.PackageInfo PackageManager.getPackageInfo(String, int)>
	//    5   10:pop             
		}
	//*   6   11:iconst_1        
	//*   7   12:ireturn         
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*   8   13:astore_0        
		{
			return false;
	//    9   14:iconst_0        
	//   10   15:ireturn         
		}
		return true;
	}

	public static void openMessengerInPlayStore(Context context)
	{
		ActivityNotFoundException activitynotfoundexception;
		try
		{
			startViewUri(context, "market://details?id=com.facebook.orca");
	//    0    0:aload_0         
	//    1    1:ldc1            #235 <String "market://details?id=com.facebook.orca">
	//    2    3:invokestatic    #239 <Method void startViewUri(Context, String)>
			return;
	//    3    6:return          
		}
	//*   4    7:aload_0         
	//*   5    8:ldc1            #241 <String "http://play.google.com/store/apps/details?id=com.facebook.orca">
	//*   6   10:invokestatic    #239 <Method void startViewUri(Context, String)>
	//*   7   13:return          
		// Misplaced declaration of an exception variable
		catch(ActivityNotFoundException activitynotfoundexception)
		{
			startViewUri(context, "http://play.google.com/store/apps/details?id=com.facebook.orca");
		}
	//*   8   14:astore_1        
	//*   9   15:goto            7
	}

	private static List parseParticipants(String s)
	{
		if(s != null && s.length() != 0)
	//*   0    0:aload_0         
	//*   1    1:ifnull          61
	//*   2    4:aload_0         
	//*   3    5:invokevirtual   #245 <Method int String.length()>
	//*   4    8:ifne            14
	//*   5   11:goto            61
		{
			s = ((String) (s.split(",")));
	//    6   14:aload_0         
	//    7   15:ldc1            #247 <String ",">
	//    8   17:invokevirtual   #251 <Method String[] String.split(String)>
	//    9   20:astore_0        
			ArrayList arraylist = new ArrayList();
	//   10   21:new             #253 <Class ArrayList>
	//   11   24:dup             
	//   12   25:invokespecial   #254 <Method void ArrayList()>
	//   13   28:astore_3        
			int j = s.length;
	//   14   29:aload_0         
	//   15   30:arraylength     
	//   16   31:istore_2        
			for(int i = 0; i < j; i++)
	//*  17   32:iconst_0        
	//*  18   33:istore_1        
	//*  19   34:iload_1         
	//*  20   35:iload_2         
	//*  21   36:icmpge          59
				((List) (arraylist)).add(((Object) (((String) (s[i])).trim())));
	//   22   39:aload_3         
	//   23   40:aload_0         
	//   24   41:iload_1         
	//   25   42:aaload          
	//   26   43:invokevirtual   #257 <Method String String.trim()>
	//   27   46:invokeinterface #260 <Method boolean List.add(Object)>
	//   28   51:pop             

	//   29   52:iload_1         
	//   30   53:iconst_1        
	//   31   54:iadd            
	//   32   55:istore_1        
	//*  33   56:goto            34
			return ((List) (arraylist));
	//   34   59:aload_3         
	//   35   60:areturn         
		} else
		{
			return Collections.emptyList();
	//   36   61:invokestatic    #266 <Method List Collections.emptyList()>
	//   37   64:areturn         
		}
	}

	public static void shareToMessenger(Activity activity, int i, ShareToMessengerParams sharetomessengerparams)
	{
		if(!hasMessengerInstalled(((Context) (activity))))
	//*   0    0:aload_0         
	//*   1    1:invokestatic    #271 <Method boolean hasMessengerInstalled(Context)>
	//*   2    4:ifne            12
		{
			openMessengerInPlayStore(((Context) (activity)));
	//    3    7:aload_0         
	//    4    8:invokestatic    #273 <Method void openMessengerInPlayStore(Context)>
			return;
	//    5   11:return          
		}
		if(getAllAvailableProtocolVersions(((Context) (activity))).contains(((Object) (Integer.valueOf(0x133782a)))))
	//*   6   12:aload_0         
	//*   7   13:invokestatic    #275 <Method Set getAllAvailableProtocolVersions(Context)>
	//*   8   16:ldc1            #41  <Int 0x133782a>
	//*   9   18:invokestatic    #180 <Method Integer Integer.valueOf(int)>
	//*  10   21:invokeinterface #76  <Method boolean Set.contains(Object)>
	//*  11   26:ifeq            36
		{
			shareToMessenger20150314(activity, i, sharetomessengerparams);
	//   12   29:aload_0         
	//   13   30:iload_1         
	//   14   31:aload_2         
	//   15   32:invokestatic    #278 <Method void shareToMessenger20150314(Activity, int, ShareToMessengerParams)>
			return;
	//   16   35:return          
		} else
		{
			openMessengerInPlayStore(((Context) (activity)));
	//   17   36:aload_0         
	//   18   37:invokestatic    #273 <Method void openMessengerInPlayStore(Context)>
			return;
	//   19   40:return          
		}
	}

	private static void shareToMessenger20150314(Activity activity, int i, ShareToMessengerParams sharetomessengerparams)
	{
		Intent intent;
		String s;
		try
		{
			intent = new Intent("android.intent.action.SEND");
	//    0    0:new             #59  <Class Intent>
	//    1    3:dup             
	//    2    4:ldc2            #280 <String "android.intent.action.SEND">
	//    3    7:invokespecial   #283 <Method void Intent(String)>
	//    4   10:astore_3        
			intent.setFlags(1);
	//    5   11:aload_3         
	//    6   12:iconst_1        
	//    7   13:invokevirtual   #113 <Method Intent Intent.setFlags(int)>
	//    8   16:pop             
			intent.setPackage("com.facebook.orca");
	//    9   17:aload_3         
	//   10   18:ldc1            #38  <String "com.facebook.orca">
	//   11   20:invokevirtual   #287 <Method Intent Intent.setPackage(String)>
	//   12   23:pop             
			intent.putExtra("android.intent.extra.STREAM", ((android.os.Parcelable) (sharetomessengerparams.uri)));
	//   13   24:aload_3         
	//   14   25:ldc2            #289 <String "android.intent.extra.STREAM">
	//   15   28:aload_2         
	//   16   29:getfield        #102 <Field Uri ShareToMessengerParams.uri>
	//   17   32:invokevirtual   #128 <Method Intent Intent.putExtra(String, android.os.Parcelable)>
	//   18   35:pop             
			intent.setType(sharetomessengerparams.mimeType);
	//   19   36:aload_3         
	//   20   37:aload_2         
	//   21   38:getfield        #105 <Field String ShareToMessengerParams.mimeType>
	//   22   41:invokevirtual   #292 <Method Intent Intent.setType(String)>
	//   23   44:pop             
			s = FacebookSdk.getApplicationId();
	//   24   45:invokestatic    #119 <Method String FacebookSdk.getApplicationId()>
	//   25   48:astore          4
		}
	//*  26   50:aload           4
	//*  27   52:ifnull          95
	//*  28   55:aload_3         
	//*  29   56:ldc1            #26  <String "com.facebook.orca.extra.PROTOCOL_VERSION">
	//*  30   58:ldc1            #41  <Int 0x133782a>
	//*  31   60:invokevirtual   #87  <Method Intent Intent.putExtra(String, int)>
	//*  32   63:pop             
	//*  33   64:aload_3         
	//*  34   65:ldc1            #8   <String "com.facebook.orca.extra.APPLICATION_ID">
	//*  35   67:aload           4
	//*  36   69:invokevirtual   #96  <Method Intent Intent.putExtra(String, String)>
	//*  37   72:pop             
	//*  38   73:aload_3         
	//*  39   74:ldc1            #20  <String "com.facebook.orca.extra.METADATA">
	//*  40   76:aload_2         
	//*  41   77:getfield        #122 <Field String ShareToMessengerParams.metaData>
	//*  42   80:invokevirtual   #96  <Method Intent Intent.putExtra(String, String)>
	//*  43   83:pop             
	//*  44   84:aload_3         
	//*  45   85:ldc1            #11  <String "com.facebook.orca.extra.EXTERNAL_URI">
	//*  46   87:aload_2         
	//*  47   88:getfield        #125 <Field Uri ShareToMessengerParams.externalUri>
	//*  48   91:invokevirtual   #128 <Method Intent Intent.putExtra(String, android.os.Parcelable)>
	//*  49   94:pop             
	//*  50   95:aload_0         
	//*  51   96:aload_3         
	//*  52   97:iload_1         
	//*  53   98:invokevirtual   #296 <Method void Activity.startActivityForResult(Intent, int)>
	//*  54  101:return          
	//*  55  102:aload_0         
	//*  56  103:aload_0         
	//*  57  104:invokevirtual   #297 <Method PackageManager Activity.getPackageManager()>
	//*  58  107:ldc1            #38  <String "com.facebook.orca">
	//*  59  109:invokevirtual   #300 <Method Intent PackageManager.getLaunchIntentForPackage(String)>
	//*  60  112:invokevirtual   #304 <Method void Activity.startActivity(Intent)>
	//*  61  115:return          
		// Misplaced declaration of an exception variable
		catch(ShareToMessengerParams sharetomessengerparams)
		{
			activity.startActivity(activity.getPackageManager().getLaunchIntentForPackage("com.facebook.orca"));
			return;
		}
		if(s == null)
			break MISSING_BLOCK_LABEL_95;
		intent.putExtra("com.facebook.orca.extra.PROTOCOL_VERSION", 0x133782a);
		intent.putExtra("com.facebook.orca.extra.APPLICATION_ID", s);
		intent.putExtra("com.facebook.orca.extra.METADATA", sharetomessengerparams.metaData);
		intent.putExtra("com.facebook.orca.extra.EXTERNAL_URI", ((android.os.Parcelable) (sharetomessengerparams.externalUri)));
		activity.startActivityForResult(intent, i);
		return;
	//*  62  116:astore_2        
	//*  63  117:goto            102
	}

	private static void startViewUri(Context context, String s)
	{
		context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(s)));
	//    0    0:aload_0         
	//    1    1:new             #59  <Class Intent>
	//    2    4:dup             
	//    3    5:ldc2            #306 <String "android.intent.action.VIEW">
	//    4    8:aload_1         
	//    5    9:invokestatic    #150 <Method Uri Uri.parse(String)>
	//    6   12:invokespecial   #309 <Method void Intent(String, Uri)>
	//    7   15:invokevirtual   #310 <Method void Context.startActivity(Intent)>
	//    8   18:return          
	}

	public static final String EXTRA_APP_ID = "com.facebook.orca.extra.APPLICATION_ID";
	public static final String EXTRA_EXTERNAL_URI = "com.facebook.orca.extra.EXTERNAL_URI";
	public static final String EXTRA_IS_COMPOSE = "com.facebook.orca.extra.IS_COMPOSE";
	public static final String EXTRA_IS_REPLY = "com.facebook.orca.extra.IS_REPLY";
	public static final String EXTRA_METADATA = "com.facebook.orca.extra.METADATA";
	public static final String EXTRA_PARTICIPANTS = "com.facebook.orca.extra.PARTICIPANTS";
	public static final String EXTRA_PROTOCOL_VERSION = "com.facebook.orca.extra.PROTOCOL_VERSION";
	public static final String EXTRA_REPLY_TOKEN_KEY = "com.facebook.orca.extra.REPLY_TOKEN";
	public static final String EXTRA_THREAD_TOKEN_KEY = "com.facebook.orca.extra.THREAD_TOKEN";
	public static final String ORCA_THREAD_CATEGORY_20150314 = "com.facebook.orca.category.PLATFORM_THREAD_20150314";
	public static final String PACKAGE_NAME = "com.facebook.orca";
	public static final int PROTOCOL_VERSION_20150314 = 0x133782a;
	private static final String TAG = "MessengerUtils";
}
