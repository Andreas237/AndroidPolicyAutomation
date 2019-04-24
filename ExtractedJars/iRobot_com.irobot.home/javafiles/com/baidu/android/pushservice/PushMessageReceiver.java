// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.baidu.android.pushservice;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import com.baidu.android.pushservice.config.ModeConfig;
import com.baidu.android.pushservice.e.a;
import com.baidu.android.pushservice.f.i;
import com.baidu.android.pushservice.f.k;
import com.baidu.android.pushservice.f.p;
import com.baidu.android.pushservice.h.m;
import com.baidu.android.pushservice.h.q;
import com.baidu.android.pushservice.h.v;
import com.baidu.android.pushservice.message.a.j;
import com.baidu.android.pushservice.message.a.l;
import com.xiaomi.mipush.sdk.MiPushClient;
import com.xiaomi.mipush.sdk.MiPushCommandMessage;
import com.xiaomi.mipush.sdk.MiPushMessage;
import com.xiaomi.mipush.sdk.PushMessageHelper;
import com.xiaomi.mipush.sdk.f;
import com.xiaomi.mipush.sdk.g;
import com.xiaomi.xmpush.thrift.c;
import com.xiaomi.xmpush.thrift.e;
import com.xiaomi.xmpush.thrift.h;
import com.xiaomi.xmpush.thrift.n;
import com.xiaomi.xmpush.thrift.u;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.apache.thrift.b;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.baidu.android.pushservice:
//			f, CommandService, PushServiceReceiver, a, 
//			PushSettings

public abstract class PushMessageReceiver extends BroadcastReceiver
{
	private static class a extends Handler
	{

		protected final WeakReference d;

		public a(Context context)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #15  <Method void Handler()>
			d = new WeakReference(((Object) (context)));
		//    2    4:aload_0         
		//    3    5:new             #17  <Class WeakReference>
		//    4    8:dup             
		//    5    9:aload_1         
		//    6   10:invokespecial   #20  <Method void WeakReference(Object)>
		//    7   13:putfield        #22  <Field WeakReference d>
		//    8   16:return          
		}
	}

	private static final class b extends Enum
	{

		private int a()
		{
			return d;
		//    0    0:aload_0         
		//    1    1:getfield        #41  <Field int d>
		//    2    4:ireturn         
		}

		static int a(b b1)
		{
			return b1.a();
		//    0    0:aload_0         
		//    1    1:invokespecial   #47  <Method int a()>
		//    2    4:ireturn         
		}

		public static b valueOf(String s)
		{
			return (b)Enum.valueOf(com/baidu/android/pushservice/PushMessageReceiver$b, s);
		//    0    0:ldc1            #2   <Class PushMessageReceiver$b>
		//    1    2:aload_0         
		//    2    3:invokestatic    #52  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class PushMessageReceiver$b>
		//    4    9:areturn         
		}

		public static b[] values()
		{
			return (b[])((b []) (e)).clone();
		//    0    0:getstatic       #35  <Field PushMessageReceiver$b[] e>
		//    1    3:invokevirtual   #59  <Method Object _5B_Lcom.baidu.android.pushservice.PushMessageReceiver$b_3B_.clone()>
		//    2    6:checkcast       #55  <Class PushMessageReceiver$b[]>
		//    3    9:areturn         
		}

		public static final b a;
		public static final b b;
		public static final b c;
		private static final b e[];
		private int d;

		static 
		{
			a = new b("MSG_PASS", 0, 1);
		//    0    0:new             #2   <Class PushMessageReceiver$b>
		//    1    3:dup             
		//    2    4:ldc1            #19  <String "MSG_PASS">
		//    3    6:iconst_0        
		//    4    7:iconst_1        
		//    5    8:invokespecial   #23  <Method void PushMessageReceiver$b(String, int, int)>
		//    6   11:putstatic       #25  <Field PushMessageReceiver$b a>
			b = new b("MSG_ARRIVED", 1, 2);
		//    7   14:new             #2   <Class PushMessageReceiver$b>
		//    8   17:dup             
		//    9   18:ldc1            #27  <String "MSG_ARRIVED">
		//   10   20:iconst_1        
		//   11   21:iconst_2        
		//   12   22:invokespecial   #23  <Method void PushMessageReceiver$b(String, int, int)>
		//   13   25:putstatic       #29  <Field PushMessageReceiver$b b>
			c = new b("MSG_CLICKED", 2, 3);
		//   14   28:new             #2   <Class PushMessageReceiver$b>
		//   15   31:dup             
		//   16   32:ldc1            #31  <String "MSG_CLICKED">
		//   17   34:iconst_2        
		//   18   35:iconst_3        
		//   19   36:invokespecial   #23  <Method void PushMessageReceiver$b(String, int, int)>
		//   20   39:putstatic       #33  <Field PushMessageReceiver$b c>
			e = (new b[] {
				a, b, c
			});
		//   21   42:iconst_3        
		//   22   43:anewarray       b[]
		//   23   46:dup             
		//   24   47:iconst_0        
		//   25   48:getstatic       #25  <Field PushMessageReceiver$b a>
		//   26   51:aastore         
		//   27   52:dup             
		//   28   53:iconst_1        
		//   29   54:getstatic       #29  <Field PushMessageReceiver$b b>
		//   30   57:aastore         
		//   31   58:dup             
		//   32   59:iconst_2        
		//   33   60:getstatic       #33  <Field PushMessageReceiver$b c>
		//   34   63:aastore         
		//   35   64:putstatic       #35  <Field PushMessageReceiver$b[] e>
		//*  36   67:return          
		}

		private b(String s, int i, int k)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #39  <Method void Enum(String, int)>
			d = k;
		//    4    6:aload_0         
		//    5    7:iload_3         
		//    6    8:putfield        #41  <Field int d>
		//    7   11:return          
		}
	}


	public PushMessageReceiver()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #27  <Method void BroadcastReceiver()>
	//    2    4:return          
	}

	private Object getActionMsg(h h1, boolean flag, Context context)
	{
		Object obj;
		String s;
		StringBuilder stringbuilder;
		try
		{
			context = ((Context) ((org.apache.thrift.b)decryptXmOrigMsg(context, h1)));
	//    0    0:aload_0         
	//    1    1:aload_3         
	//    2    2:aload_1         
	//    3    3:invokevirtual   #41  <Method Object decryptXmOrigMsg(Context, h)>
	//    4    6:checkcast       #43  <Class b>
	//    5    9:astore_3        
		}
	//*   6   10:aload_3         
	//*   7   11:ifnonnull       56
	//*   8   14:getstatic       #45  <Field String TAG>
	//*   9   17:astore_3        
	//*  10   18:new             #47  <Class StringBuilder>
	//*  11   21:dup             
	//*  12   22:invokespecial   #48  <Method void StringBuilder()>
	//*  13   25:astore          4
	//*  14   27:aload           4
	//*  15   29:ldc1            #50  <String "receiving an un-recognized message. ">
	//*  16   31:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//*  17   34:pop             
	//*  18   35:aload           4
	//*  19   37:aload_1         
	//*  20   38:getfield        #59  <Field com.xiaomi.xmpush.thrift.a h.a>
	//*  21   41:invokevirtual   #62  <Method StringBuilder StringBuilder.append(Object)>
	//*  22   44:pop             
	//*  23   45:aload_3         
	//*  24   46:aload           4
	//*  25   48:invokevirtual   #66  <Method String StringBuilder.toString()>
	//*  26   51:invokestatic    #72  <Method void a.d(String, String)>
	//*  27   54:aconst_null     
	//*  28   55:areturn         
	//*  29   56:aload_1         
	//*  30   57:invokevirtual   #75  <Method com.xiaomi.xmpush.thrift.a h.a()>
	//*  31   60:astore          4
	//*  32   62:getstatic       #45  <Field String TAG>
	//*  33   65:astore          5
	//*  34   67:new             #47  <Class StringBuilder>
	//*  35   70:dup             
	//*  36   71:invokespecial   #48  <Method void StringBuilder()>
	//*  37   74:astore          6
	//*  38   76:aload           6
	//*  39   78:ldc1            #77  <String "processing a message, action=">
	//*  40   80:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//*  41   83:pop             
	//*  42   84:aload           6
	//*  43   86:aload           4
	//*  44   88:invokevirtual   #62  <Method StringBuilder StringBuilder.append(Object)>
	//*  45   91:pop             
	//*  46   92:aload           5
	//*  47   94:aload           6
	//*  48   96:invokevirtual   #66  <Method String StringBuilder.toString()>
	//*  49   99:invokestatic    #79  <Method void a.b(String, String)>
	//*  50  102:aload_3         
	//*  51  103:checkcast       #81  <Class n>
	//*  52  106:invokevirtual   #85  <Method com.xiaomi.xmpush.thrift.b n.l()>
	//*  53  109:ifnonnull       122
	//*  54  112:getstatic       #45  <Field String TAG>
	//*  55  115:ldc1            #87  <String "receive an empty message without push content!">
	//*  56  117:invokestatic    #72  <Method void a.d(String, String)>
	//*  57  120:aconst_null     
	//*  58  121:areturn         
	//*  59  122:aload_3         
	//*  60  123:checkcast       #81  <Class n>
	//*  61  126:aload_1         
	//*  62  127:invokevirtual   #91  <Method c h.m()>
	//*  63  130:iload_2         
	//*  64  131:invokestatic    #97  <Method MiPushMessage PushMessageHelper.generateMessage(n, c, boolean)>
	//*  65  134:astore_1        
	//*  66  135:aload_1         
	//*  67  136:areturn         
		// Misplaced declaration of an exception variable
		catch(h h1)
	//*  68  137:astore_1        
		{
			com.baidu.android.pushservice.e.a.a(TAG, ((Throwable) (h1)));
	//   69  138:getstatic       #45  <Field String TAG>
	//   70  141:aload_1         
	//   71  142:invokestatic    #100 <Method void a.a(String, Throwable)>
			return ((Object) (null));
	//   72  145:aconst_null     
	//   73  146:areturn         
		}
		if(context != null)
			break MISSING_BLOCK_LABEL_56;
		context = ((Context) (TAG));
		obj = ((Object) (new StringBuilder()));
		((StringBuilder) (obj)).append("receiving an un-recognized message. ");
		((StringBuilder) (obj)).append(((Object) (h1.a)));
		com.baidu.android.pushservice.e.a.d(((String) (context)), ((StringBuilder) (obj)).toString());
		return ((Object) (null));
		obj = ((Object) (h1.a()));
		s = TAG;
		stringbuilder = new StringBuilder();
		stringbuilder.append("processing a message, action=");
		stringbuilder.append(obj);
		com.baidu.android.pushservice.e.a.b(s, stringbuilder.toString());
		if(((n)context).l() != null)
			break MISSING_BLOCK_LABEL_122;
		com.baidu.android.pushservice.e.a.d(TAG, "receive an empty message without push content!");
		return ((Object) (null));
		h1 = ((h) (PushMessageHelper.generateMessage((n)context, h1.m(), flag)));
		return ((Object) (h1));
	}

	private String getLauncherActivityName(Context context, String s)
	{
		Intent intent = new Intent();
	//    0    0:new             #104 <Class Intent>
	//    1    3:dup             
	//    2    4:invokespecial   #105 <Method void Intent()>
	//    3    7:astore_3        
		intent.setAction("android.intent.action.MAIN");
	//    4    8:aload_3         
	//    5    9:ldc1            #107 <String "android.intent.action.MAIN">
	//    6   11:invokevirtual   #111 <Method Intent Intent.setAction(String)>
	//    7   14:pop             
		intent.addCategory("android.intent.category.LAUNCHER");
	//    8   15:aload_3         
	//    9   16:ldc1            #113 <String "android.intent.category.LAUNCHER">
	//   10   18:invokevirtual   #116 <Method Intent Intent.addCategory(String)>
	//   11   21:pop             
		intent.setPackage(s);
	//   12   22:aload_3         
	//   13   23:aload_2         
	//   14   24:invokevirtual   #119 <Method Intent Intent.setPackage(String)>
	//   15   27:pop             
		for(context = ((Context) (context.getPackageManager().queryIntentActivities(intent, 0).iterator())); ((Iterator) (context)).hasNext();)
	//*  16   28:aload_1         
	//*  17   29:invokevirtual   #125 <Method PackageManager Context.getPackageManager()>
	//*  18   32:aload_3         
	//*  19   33:iconst_0        
	//*  20   34:invokevirtual   #131 <Method List PackageManager.queryIntentActivities(Intent, int)>
	//*  21   37:invokeinterface #137 <Method Iterator List.iterator()>
	//*  22   42:astore_1        
	//*  23   43:aload_1         
	//*  24   44:invokeinterface #143 <Method boolean Iterator.hasNext()>
	//*  25   49:ifeq            77
		{
			s = ((String) ((ResolveInfo)((Iterator) (context)).next()));
	//   26   52:aload_1         
	//   27   53:invokeinterface #147 <Method Object Iterator.next()>
	//   28   58:checkcast       #149 <Class ResolveInfo>
	//   29   61:astore_2        
			if(((ResolveInfo) (s)).activityInfo != null)
	//*  30   62:aload_2         
	//*  31   63:getfield        #153 <Field ActivityInfo ResolveInfo.activityInfo>
	//*  32   66:ifnull          43
				return ((ResolveInfo) (s)).activityInfo.name;
	//   33   69:aload_2         
	//   34   70:getfield        #153 <Field ActivityInfo ResolveInfo.activityInfo>
	//   35   73:getfield        #158 <Field String ActivityInfo.name>
	//   36   76:areturn         
		}

		return null;
	//   37   77:aconst_null     
	//   38   78:areturn         
	}

	private void handleIntentUri(Context context, MiPushMessage mipushmessage, com.baidu.android.pushservice.message.b b1)
	{
		mipushmessage = ((MiPushMessage) (mipushmessage.getExtra()));
	//    0    0:aload_2         
	//    1    1:invokevirtual   #168 <Method Map MiPushMessage.getExtra()>
	//    2    4:astore_2        
		if(mipushmessage == null)
			break MISSING_BLOCK_LABEL_291;
	//    3    5:aload_2         
	//    4    6:ifnull          291
		Object obj;
		if(!((Map) (mipushmessage)).containsKey("notify_effect"))
			break MISSING_BLOCK_LABEL_291;
	//    5    9:aload_2         
	//    6   10:ldc1            #170 <String "notify_effect">
	//    7   12:invokeinterface #176 <Method boolean Map.containsKey(Object)>
	//    8   17:ifeq            291
		obj = ((Object) ((String)((Map) (mipushmessage)).get("notify_effect")));
	//    9   20:aload_2         
	//   10   21:ldc1            #170 <String "notify_effect">
	//   11   23:invokeinterface #180 <Method Object Map.get(Object)>
	//   12   28:checkcast       #182 <Class String>
	//   13   31:astore          4
		String s1 = TAG;
	//   14   33:getstatic       #45  <Field String TAG>
	//   15   36:astore          5
		StringBuilder stringbuilder1 = new StringBuilder();
	//   16   38:new             #47  <Class StringBuilder>
	//   17   41:dup             
	//   18   42:invokespecial   #48  <Method void StringBuilder()>
	//   19   45:astore          6
		stringbuilder1.append("XM> onNotificationClicked, notify_effect=");
	//   20   47:aload           6
	//   21   49:ldc1            #184 <String "XM> onNotificationClicked, notify_effect=">
	//   22   51:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//   23   54:pop             
		stringbuilder1.append(((String) (obj)));
	//   24   55:aload           6
	//   25   57:aload           4
	//   26   59:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//   27   62:pop             
		com.baidu.android.pushservice.e.a.b(s1, stringbuilder1.toString());
	//   28   63:aload           5
	//   29   65:aload           6
	//   30   67:invokevirtual   #66  <Method String StringBuilder.toString()>
	//   31   70:invokestatic    #79  <Method void a.b(String, String)>
		if(TextUtils.isEmpty(((CharSequence) (obj))) || !((String) (obj)).equals("2"))
			break MISSING_BLOCK_LABEL_291;
	//   32   73:aload           4
	//   33   75:invokestatic    #190 <Method boolean TextUtils.isEmpty(CharSequence)>
	//   34   78:ifne            291
	//   35   81:aload           4
	//   36   83:ldc1            #192 <String "2">
	//   37   85:invokevirtual   #195 <Method boolean String.equals(Object)>
	//   38   88:ifeq            291
		mipushmessage = ((MiPushMessage) ((String)((Map) (mipushmessage)).get("intent_uri")));
	//   39   91:aload_2         
	//   40   92:ldc1            #197 <String "intent_uri">
	//   41   94:invokeinterface #180 <Method Object Map.get(Object)>
	//   42   99:checkcast       #182 <Class String>
	//   43  102:astore_2        
		if(TextUtils.isEmpty(((CharSequence) (mipushmessage))))
			break MISSING_BLOCK_LABEL_291;
	//   44  103:aload_2         
	//   45  104:invokestatic    #190 <Method boolean TextUtils.isEmpty(CharSequence)>
	//   46  107:ifne            291
		obj = ((Object) (context.getPackageManager()));
	//   47  110:aload_1         
	//   48  111:invokevirtual   #125 <Method PackageManager Context.getPackageManager()>
	//   49  114:astore          4
		mipushmessage = ((MiPushMessage) (Intent.parseUri(((String) (mipushmessage)), 0)));
	//   50  116:aload_2         
	//   51  117:iconst_0        
	//   52  118:invokestatic    #201 <Method Intent Intent.parseUri(String, int)>
	//   53  121:astore_2        
		((Intent) (mipushmessage)).setPackage(context.getPackageName());
	//   54  122:aload_2         
	//   55  123:aload_1         
	//   56  124:invokevirtual   #204 <Method String Context.getPackageName()>
	//   57  127:invokevirtual   #119 <Method Intent Intent.setPackage(String)>
	//   58  130:pop             
		if(((PackageManager) (obj)).queryBroadcastReceivers(((Intent) (mipushmessage)), 0).size() > 0)
	//*  59  131:aload           4
	//*  60  133:aload_2         
	//*  61  134:iconst_0        
	//*  62  135:invokevirtual   #207 <Method List PackageManager.queryBroadcastReceivers(Intent, int)>
	//*  63  138:invokeinterface #211 <Method int List.size()>
	//*  64  143:ifle            193
		{
			b1 = ((com.baidu.android.pushservice.message.b) (TAG));
	//   65  146:getstatic       #45  <Field String TAG>
	//   66  149:astore_3        
			obj = ((Object) (new StringBuilder()));
	//   67  150:new             #47  <Class StringBuilder>
	//   68  153:dup             
	//   69  154:invokespecial   #48  <Method void StringBuilder()>
	//   70  157:astore          4
			((StringBuilder) (obj)).append("XM> Intent broadcasted to app! ===> ");
	//   71  159:aload           4
	//   72  161:ldc1            #213 <String "XM> Intent broadcasted to app! ===> ">
	//   73  163:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//   74  166:pop             
			((StringBuilder) (obj)).append(((Intent) (mipushmessage)).toUri(0));
	//   75  167:aload           4
	//   76  169:aload_2         
	//   77  170:iconst_0        
	//   78  171:invokevirtual   #217 <Method String Intent.toUri(int)>
	//   79  174:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//   80  177:pop             
			com.baidu.android.pushservice.e.a.c(((String) (b1)), ((StringBuilder) (obj)).toString());
	//   81  178:aload_3         
	//   82  179:aload           4
	//   83  181:invokevirtual   #66  <Method String StringBuilder.toString()>
	//   84  184:invokestatic    #220 <Method void a.c(String, String)>
			context.sendBroadcast(((Intent) (mipushmessage)));
	//   85  187:aload_1         
	//   86  188:aload_2         
	//   87  189:invokevirtual   #224 <Method void Context.sendBroadcast(Intent)>
			return;
	//   88  192:return          
		}
		try
		{
			if(((PackageManager) (obj)).queryIntentActivities(((Intent) (mipushmessage)), 0).size() > 0)
	//*  89  193:aload           4
	//*  90  195:aload_2         
	//*  91  196:iconst_0        
	//*  92  197:invokevirtual   #131 <Method List PackageManager.queryIntentActivities(Intent, int)>
	//*  93  200:invokeinterface #211 <Method int List.size()>
	//*  94  205:ifle            291
			{
				String s = TAG;
	//   95  208:getstatic       #45  <Field String TAG>
	//   96  211:astore          4
				StringBuilder stringbuilder = new StringBuilder();
	//   97  213:new             #47  <Class StringBuilder>
	//   98  216:dup             
	//   99  217:invokespecial   #48  <Method void StringBuilder()>
	//  100  220:astore          5
				stringbuilder.append("XM> Intent sent to actvity! ===> ");
	//  101  222:aload           5
	//  102  224:ldc1            #226 <String "XM> Intent sent to actvity! ===> ">
	//  103  226:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//  104  229:pop             
				stringbuilder.append(((Intent) (mipushmessage)).toUri(0));
	//  105  230:aload           5
	//  106  232:aload_2         
	//  107  233:iconst_0        
	//  108  234:invokevirtual   #217 <Method String Intent.toUri(int)>
	//  109  237:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//  110  240:pop             
				com.baidu.android.pushservice.e.a.c(s, stringbuilder.toString());
	//  111  241:aload           4
	//  112  243:aload           5
	//  113  245:invokevirtual   #66  <Method String StringBuilder.toString()>
	//  114  248:invokestatic    #220 <Method void a.c(String, String)>
				((Intent) (mipushmessage)).addFlags(0x10000000);
	//  115  251:aload_2         
	//  116  252:ldc1            #227 <Int 0x10000000>
	//  117  254:invokevirtual   #231 <Method Intent Intent.addFlags(int)>
	//  118  257:pop             
				((Intent) (mipushmessage)).putExtra("open_type", 1);
	//  119  258:aload_2         
	//  120  259:ldc1            #233 <String "open_type">
	//  121  261:iconst_1        
	//  122  262:invokevirtual   #236 <Method Intent Intent.putExtra(String, int)>
	//  123  265:pop             
				((Intent) (mipushmessage)).putExtra("msgid", b1.m);
	//  124  266:aload_2         
	//  125  267:ldc1            #238 <String "msgid">
	//  126  269:aload_3         
	//  127  270:getfield        #242 <Field String com.baidu.android.pushservice.message.b.m>
	//  128  273:invokevirtual   #245 <Method Intent Intent.putExtra(String, String)>
	//  129  276:pop             
				context.startActivity(((Intent) (mipushmessage)));
	//  130  277:aload_1         
	//  131  278:aload_2         
	//  132  279:invokevirtual   #248 <Method void Context.startActivity(Intent)>
				return;
	//  133  282:return          
			}
		}
		// Misplaced declaration of an exception variable
		catch(Context context)
	//* 134  283:astore_1        
		{
			com.baidu.android.pushservice.e.a.a(TAG, ((Throwable) (context)));
	//  135  284:getstatic       #45  <Field String TAG>
	//  136  287:aload_1         
	//  137  288:invokestatic    #100 <Method void a.a(String, Throwable)>
		}
	//  138  291:return          
	}

	private void handlePushMetaInfo(h h1, Context context)
	{
		try
		{
			c c1 = h1.m();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #91  <Method c h.m()>
	//    2    4:astore_3        
			e e1 = new e();
	//    3    5:new             #252 <Class e>
	//    4    8:dup             
	//    5    9:invokespecial   #253 <Method void e()>
	//    6   12:astore          4
			e1.b(h1.h());
	//    7   14:aload           4
	//    8   16:aload_1         
	//    9   17:invokevirtual   #256 <Method String h.h()>
	//   10   20:invokevirtual   #259 <Method e e.b(String)>
	//   11   23:pop             
			e1.a(c1.b());
	//   12   24:aload           4
	//   13   26:aload_3         
	//   14   27:invokevirtual   #263 <Method String c.b()>
	//   15   30:invokevirtual   #265 <Method e e.a(String)>
	//   16   33:pop             
			e1.a(c1.d());
	//   17   34:aload           4
	//   18   36:aload_3         
	//   19   37:invokevirtual   #268 <Method long c.d()>
	//   20   40:invokevirtual   #271 <Method e e.a(long)>
	//   21   43:pop             
			if(!TextUtils.isEmpty(((CharSequence) (c1.f()))))
	//*  22   44:aload_3         
	//*  23   45:invokevirtual   #274 <Method String c.f()>
	//*  24   48:invokestatic    #190 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  25   51:ifne            64
				e1.c(c1.f());
	//   26   54:aload           4
	//   27   56:aload_3         
	//   28   57:invokevirtual   #274 <Method String c.f()>
	//   29   60:invokevirtual   #276 <Method e e.c(String)>
	//   30   63:pop             
			g.a(context).a(((org.apache.thrift.b) (e1)), com.xiaomi.xmpush.thrift.a.f, false, h1.m());
	//   31   64:aload_2         
	//   32   65:invokestatic    #281 <Method g g.a(Context)>
	//   33   68:aload           4
	//   34   70:getstatic       #285 <Field com.xiaomi.xmpush.thrift.a com.xiaomi.xmpush.thrift.a.f>
	//   35   73:iconst_0        
	//   36   74:aload_1         
	//   37   75:invokevirtual   #91  <Method c h.m()>
	//   38   78:invokevirtual   #288 <Method void g.a(b, com.xiaomi.xmpush.thrift.a, boolean, c)>
			return;
	//   39   81:return          
		}
		// Misplaced declaration of an exception variable
		catch(h h1)
	//*  40   82:astore_1        
		{
			com.baidu.android.pushservice.e.a.a(TAG, ((Throwable) (h1)));
	//   41   83:getstatic       #45  <Field String TAG>
	//   42   86:aload_1         
	//   43   87:invokestatic    #100 <Method void a.a(String, Throwable)>
		}
	//   44   90:return          
	}

	private void handleXiaoMiMessage(Intent intent, Context context)
	{
		int i;
		i = intent.getIntExtra("message_type", 1);
	//    0    0:aload_1         
	//    1    1:ldc2            #292 <String "message_type">
	//    2    4:iconst_1        
	//    3    5:invokevirtual   #296 <Method int Intent.getIntExtra(String, int)>
	//    4    8:istore_3        
		String s = TAG;
	//    5    9:getstatic       #45  <Field String TAG>
	//    6   12:astore          5
		StringBuilder stringbuilder = new StringBuilder();
	//    7   14:new             #47  <Class StringBuilder>
	//    8   17:dup             
	//    9   18:invokespecial   #48  <Method void StringBuilder()>
	//   10   21:astore          6
		stringbuilder.append("XM> message_type= ");
	//   11   23:aload           6
	//   12   25:ldc2            #298 <String "XM> message_type= ">
	//   13   28:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//   14   31:pop             
		stringbuilder.append(i);
	//   15   32:aload           6
	//   16   34:iload_3         
	//   17   35:invokevirtual   #301 <Method StringBuilder StringBuilder.append(int)>
	//   18   38:pop             
		com.baidu.android.pushservice.e.a.b(s, stringbuilder.toString());
	//   19   39:aload           5
	//   20   41:aload           6
	//   21   43:invokevirtual   #66  <Method String StringBuilder.toString()>
	//   22   46:invokestatic    #79  <Method void a.b(String, String)>
		if(i == 1) goto _L2; else goto _L1
	//   23   49:iload_3         
	//   24   50:iconst_1        
	//   25   51:icmpeq          218
_L1:
		i;
	//   26   54:iload_3         
		JVM INSTR tableswitch 3 4: default 700
	//	               3 90
	//	               4 90;
	//   27   55:tableswitch     3 4: default 700
	//	               3 90
	//	               4 90
		   goto _L3 _L4 _L4
_L3:
		intent = ((Intent) (TAG));
	//   28   76:getstatic       #45  <Field String TAG>
	//   29   79:astore_1        
		context = "XM> err for msg type!!!";
	//   30   80:ldc2            #303 <String "XM> err for msg type!!!">
	//   31   83:astore_2        
_L19:
		boolean flag;
		Object obj;
		byte abyte0[];
		com.xiaomi.mipush.sdk.a a1;
		c c1;
		try
		{
			com.baidu.android.pushservice.e.a.e(((String) (intent)), ((String) (context)));
	//   32   84:aload_1         
	//   33   85:aload_2         
	//   34   86:invokestatic    #306 <Method void a.e(String, String)>
			return;
	//   35   89:return          
		}
	//*  36   90:aload_1         
	//*  37   91:ldc2            #308 <String "key_command">
	//*  38   94:invokevirtual   #312 <Method java.io.Serializable Intent.getSerializableExtra(String)>
	//*  39   97:astore_1        
	//*  40   98:aload_1         
	//*  41   99:ifnull          699
	//*  42  102:aload_1         
	//*  43  103:checkcast       #314 <Class MiPushCommandMessage>
	//*  44  106:invokevirtual   #317 <Method String MiPushCommandMessage.getCommand()>
	//*  45  109:ldc2            #319 <String "register">
	//*  46  112:invokestatic    #322 <Method boolean TextUtils.equals(CharSequence, CharSequence)>
	//*  47  115:ifeq            699
	//*  48  118:aload_1         
	//*  49  119:checkcast       #314 <Class MiPushCommandMessage>
	//*  50  122:invokevirtual   #326 <Method List MiPushCommandMessage.getCommandArguments()>
	//*  51  125:astore_1        
	//*  52  126:aload_1         
	//*  53  127:ifnull          203
	//*  54  130:aload_1         
	//*  55  131:invokeinterface #328 <Method boolean List.isEmpty()>
	//*  56  136:ifne            203
	//*  57  139:aload_1         
	//*  58  140:iconst_0        
	//*  59  141:invokeinterface #331 <Method Object List.get(int)>
	//*  60  146:checkcast       #182 <Class String>
	//*  61  149:astore_1        
	//*  62  150:getstatic       #45  <Field String TAG>
	//*  63  153:astore          5
	//*  64  155:new             #47  <Class StringBuilder>
	//*  65  158:dup             
	//*  66  159:invokespecial   #48  <Method void StringBuilder()>
	//*  67  162:astore          6
	//*  68  164:aload           6
	//*  69  166:ldc2            #333 <String "XM> regId= ">
	//*  70  169:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//*  71  172:pop             
	//*  72  173:aload           6
	//*  73  175:aload_1         
	//*  74  176:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//*  75  179:pop             
	//*  76  180:aload           5
	//*  77  182:aload           6
	//*  78  184:invokevirtual   #66  <Method String StringBuilder.toString()>
	//*  79  187:invokestatic    #79  <Method void a.b(String, String)>
	//*  80  190:aload_1         
	//*  81  191:invokestatic    #190 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  82  194:ifne            699
	//*  83  197:aload_2         
	//*  84  198:aload_1         
	//*  85  199:invokestatic    #338 <Method void com.baidu.android.pushservice.f.a(Context, String)>
	//*  86  202:return          
	//*  87  203:aload_2         
	//*  88  204:invokestatic    #341 <Method void com.baidu.android.pushservice.f.e(Context)>
	//*  89  207:getstatic       #45  <Field String TAG>
	//*  90  210:ldc2            #343 <String "the xiaomi appid or appkey is error, please check!">
	//*  91  213:aload_2         
	//*  92  214:invokestatic    #348 <Method void com.baidu.android.pushservice.e.b.b(String, String, Context)>
	//*  93  217:return          
	//*  94  218:aload_2         
	//*  95  219:invokestatic    #353 <Method f f.a(Context)>
	//*  96  222:aload_1         
	//*  97  223:invokevirtual   #356 <Method com.xiaomi.mipush.sdk.PushMessageHandler$a f.a(Intent)>
	//*  98  226:astore          5
	//*  99  228:aload           5
	//* 100  230:ifnull          502
	//* 101  233:aload           5
	//* 102  235:instanceof      #164 <Class MiPushMessage>
	//* 103  238:ifeq            373
	//* 104  241:getstatic       #45  <Field String TAG>
	//* 105  244:ldc2            #358 <String "XM> is a MiPushMessage">
	//* 106  247:invokestatic    #79  <Method void a.b(String, String)>
	//* 107  250:aload           5
	//* 108  252:checkcast       #164 <Class MiPushMessage>
	//* 109  255:invokevirtual   #361 <Method int MiPushMessage.getPassThrough()>
	//* 110  258:iconst_1        
	//* 111  259:icmpne          326
	//* 112  262:aload_0         
	//* 113  263:aload_2         
	//* 114  264:aload           5
	//* 115  266:checkcast       #164 <Class MiPushMessage>
	//* 116  269:getstatic       #364 <Field PushMessageReceiver$b com.baidu.android.pushservice.PushMessageReceiver$b.a>
	//* 117  272:invokestatic    #367 <Method int com.baidu.android.pushservice.PushMessageReceiver$b.a(PushMessageReceiver$b)>
	//* 118  275:invokespecial   #371 <Method void handleXiaomiMessageCallBack(Context, MiPushMessage, int)>
	//* 119  278:aload           5
	//* 120  280:checkcast       #164 <Class MiPushMessage>
	//* 121  283:invokevirtual   #374 <Method String MiPushMessage.getContent()>
	//* 122  286:astore_1        
	//* 123  287:getstatic       #45  <Field String TAG>
	//* 124  290:astore_2        
	//* 125  291:new             #47  <Class StringBuilder>
	//* 126  294:dup             
	//* 127  295:invokespecial   #48  <Method void StringBuilder()>
	//* 128  298:astore          5
	//* 129  300:aload           5
	//* 130  302:ldc2            #376 <String "XM> passthrough msg, content = ">
	//* 131  305:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//* 132  308:pop             
	//* 133  309:aload           5
	//* 134  311:aload_1         
	//* 135  312:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//* 136  315:pop             
	//* 137  316:aload_2         
	//* 138  317:aload           5
	//* 139  319:invokevirtual   #66  <Method String StringBuilder.toString()>
	//* 140  322:invokestatic    #79  <Method void a.b(String, String)>
	//* 141  325:return          
	//* 142  326:aload           5
	//* 143  328:checkcast       #164 <Class MiPushMessage>
	//* 144  331:invokevirtual   #379 <Method boolean MiPushMessage.isNotified()>
	//* 145  334:ifeq            363
	//* 146  337:getstatic       #45  <Field String TAG>
	//* 147  340:ldc2            #381 <String "XM> isNotified=true">
	//* 148  343:invokestatic    #79  <Method void a.b(String, String)>
	//* 149  346:aload_0         
	//* 150  347:aload_2         
	//* 151  348:aload           5
	//* 152  350:checkcast       #164 <Class MiPushMessage>
	//* 153  353:getstatic       #383 <Field PushMessageReceiver$b com.baidu.android.pushservice.PushMessageReceiver$b.c>
	//* 154  356:invokestatic    #367 <Method int com.baidu.android.pushservice.PushMessageReceiver$b.a(PushMessageReceiver$b)>
	//* 155  359:invokespecial   #371 <Method void handleXiaomiMessageCallBack(Context, MiPushMessage, int)>
	//* 156  362:return          
	//* 157  363:getstatic       #45  <Field String TAG>
	//* 158  366:ldc2            #385 <String "XM> MessageArrived">
	//* 159  369:invokestatic    #79  <Method void a.b(String, String)>
	//* 160  372:return          
	//* 161  373:aload           5
	//* 162  375:instanceof      #314 <Class MiPushCommandMessage>
	//* 163  378:ifeq            699
	//* 164  381:aload           5
	//* 165  383:checkcast       #314 <Class MiPushCommandMessage>
	//* 166  386:invokevirtual   #317 <Method String MiPushCommandMessage.getCommand()>
	//* 167  389:ldc2            #319 <String "register">
	//* 168  392:invokestatic    #322 <Method boolean TextUtils.equals(CharSequence, CharSequence)>
	//* 169  395:ifeq            699
	//* 170  398:aload           5
	//* 171  400:checkcast       #314 <Class MiPushCommandMessage>
	//* 172  403:astore          5
	//* 173  405:aload           5
	//* 174  407:invokevirtual   #326 <Method List MiPushCommandMessage.getCommandArguments()>
	//* 175  410:astore_1        
	//* 176  411:aload_1         
	//* 177  412:ifnull          485
	//* 178  415:aload_1         
	//* 179  416:invokeinterface #328 <Method boolean List.isEmpty()>
	//* 180  421:ifne            485
	//* 181  424:aload_1         
	//* 182  425:iconst_0        
	//* 183  426:invokeinterface #331 <Method Object List.get(int)>
	//* 184  431:checkcast       #182 <Class String>
	//* 185  434:astore_1        
	//* 186  435:getstatic       #45  <Field String TAG>
	//* 187  438:astore          5
	//* 188  440:new             #47  <Class StringBuilder>
	//* 189  443:dup             
	//* 190  444:invokespecial   #48  <Method void StringBuilder()>
	//* 191  447:astore          6
	//* 192  449:aload           6
	//* 193  451:ldc2            #333 <String "XM> regId= ">
	//* 194  454:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//* 195  457:pop             
	//* 196  458:aload           6
	//* 197  460:aload_1         
	//* 198  461:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//* 199  464:pop             
	//* 200  465:aload           5
	//* 201  467:aload           6
	//* 202  469:invokevirtual   #66  <Method String StringBuilder.toString()>
	//* 203  472:invokestatic    #79  <Method void a.b(String, String)>
	//* 204  475:aload_1         
	//* 205  476:invokestatic    #190 <Method boolean TextUtils.isEmpty(CharSequence)>
	//* 206  479:ifne            699
	//* 207  482:goto            197
	//* 208  485:aload_2         
	//* 209  486:invokestatic    #341 <Method void com.baidu.android.pushservice.f.e(Context)>
	//* 210  489:getstatic       #45  <Field String TAG>
	//* 211  492:astore_1        
	//* 212  493:aload           5
	//* 213  495:invokevirtual   #388 <Method String MiPushCommandMessage.getReason()>
	//* 214  498:astore_2        
	//* 215  499:goto            84
	//* 216  502:getstatic       #45  <Field String TAG>
	//* 217  505:ldc2            #390 <String "XM> realMessage is null, go on handle">
	//* 218  508:invokestatic    #72  <Method void a.d(String, String)>
	//* 219  511:aload_1         
	//* 220  512:ldc2            #392 <String "mipush_payload">
	//* 221  515:invokevirtual   #396 <Method byte[] Intent.getByteArrayExtra(String)>
	//* 222  518:astore          6
	//* 223  520:aload_1         
	//* 224  521:ldc2            #398 <String "mipush_notified">
	//* 225  524:iconst_0        
	//* 226  525:invokevirtual   #402 <Method boolean Intent.getBooleanExtra(String, boolean)>
	//* 227  528:istore          4
	//* 228  530:aload_1         
	//* 229  531:ldc2            #404 <String "mrt">
	//* 230  534:invokevirtual   #408 <Method String Intent.getStringExtra(String)>
	//* 231  537:astore_1        
	//* 232  538:aload           6
	//* 233  540:ifnonnull       553
	//* 234  543:getstatic       #45  <Field String TAG>
	//* 235  546:ldc2            #410 <String "XM> receiving an empty message!">
	//* 236  549:invokestatic    #72  <Method void a.d(String, String)>
	//* 237  552:return          
	//* 238  553:new             #56  <Class h>
	//* 239  556:dup             
	//* 240  557:invokespecial   #411 <Method void h()>
	//* 241  560:astore          5
	//* 242  562:aload           5
	//* 243  564:aload           6
	//* 244  566:invokestatic    #416 <Method void u.a(b, byte[])>
	//* 245  569:aload_2         
	//* 246  570:invokestatic    #421 <Method com.xiaomi.mipush.sdk.a com.xiaomi.mipush.sdk.a.a(Context)>
	//* 247  573:astore          6
	//* 248  575:aload           5
	//* 249  577:invokevirtual   #91  <Method c h.m()>
	//* 250  580:astore          7
	//* 251  582:aload           5
	//* 252  584:invokevirtual   #75  <Method com.xiaomi.xmpush.thrift.a h.a()>
	//* 253  587:getstatic       #423 <Field com.xiaomi.xmpush.thrift.a com.xiaomi.xmpush.thrift.a.e>
	//* 254  590:if_acmpne       652
	//* 255  593:aload           7
	//* 256  595:ifnull          652
	//* 257  598:aload           6
	//* 258  600:invokevirtual   #425 <Method boolean com.xiaomi.mipush.sdk.a.l()>
	//* 259  603:ifne            652
	//* 260  606:iload           4
	//* 261  608:ifne            652
	//* 262  611:aload           7
	//* 263  613:ifnull          645
	//* 264  616:aload           5
	//* 265  618:invokevirtual   #91  <Method c h.m()>
	//* 266  621:ldc2            #404 <String "mrt">
	//* 267  624:aload_1         
	//* 268  625:invokevirtual   #427 <Method void c.a(String, String)>
	//* 269  628:aload           5
	//* 270  630:invokevirtual   #91  <Method c h.m()>
	//* 271  633:ldc2            #429 <String "mat">
	//* 272  636:invokestatic    #434 <Method long System.currentTimeMillis()>
	//* 273  639:invokestatic    #439 <Method String Long.toString(long)>
	//* 274  642:invokevirtual   #427 <Method void c.a(String, String)>
	//* 275  645:aload_0         
	//* 276  646:aload           5
	//* 277  648:aload_2         
	//* 278  649:invokespecial   #441 <Method void handlePushMetaInfo(h, Context)>
	//* 279  652:aload_0         
	//* 280  653:aload           5
	//* 281  655:iload           4
	//* 282  657:aload_2         
	//* 283  658:invokespecial   #443 <Method Object getActionMsg(h, boolean, Context)>
	//* 284  661:astore_1        
	//* 285  662:aload_1         
	//* 286  663:ifnull          699
	//* 287  666:getstatic       #45  <Field String TAG>
	//* 288  669:ldc2            #445 <String "XM> msg clicked-----------------">
	//* 289  672:invokestatic    #79  <Method void a.b(String, String)>
	//* 290  675:aload_0         
	//* 291  676:aload_2         
	//* 292  677:aload_1         
	//* 293  678:checkcast       #164 <Class MiPushMessage>
	//* 294  681:getstatic       #383 <Field PushMessageReceiver$b com.baidu.android.pushservice.PushMessageReceiver$b.c>
	//* 295  684:invokestatic    #367 <Method int com.baidu.android.pushservice.PushMessageReceiver$b.a(PushMessageReceiver$b)>
	//* 296  687:invokespecial   #371 <Method void handleXiaomiMessageCallBack(Context, MiPushMessage, int)>
	//* 297  690:return          
		// Misplaced declaration of an exception variable
		catch(Intent intent)
	//* 298  691:astore_1        
		{
			com.baidu.android.pushservice.e.a.a(TAG, ((Throwable) (intent)));
	//  299  692:getstatic       #45  <Field String TAG>
	//  300  695:aload_1         
	//  301  696:invokestatic    #100 <Method void a.a(String, Throwable)>
		}
		  goto _L5
_L4:
		intent = ((Intent) (intent.getSerializableExtra("key_command")));
		if(intent == null) goto _L5; else goto _L6
_L6:
		if(!TextUtils.equals(((CharSequence) (((MiPushCommandMessage)intent).getCommand())), "register")) goto _L5; else goto _L7
_L7:
		intent = ((Intent) (((MiPushCommandMessage)intent).getCommandArguments()));
		if(intent == null) goto _L9; else goto _L8
_L8:
		if(((List) (intent)).isEmpty()) goto _L9; else goto _L10
_L10:
		intent = ((Intent) ((String)((List) (intent)).get(0)));
		String s1 = TAG;
		StringBuilder stringbuilder1 = new StringBuilder();
		stringbuilder1.append("XM> regId= ");
		stringbuilder1.append(((String) (intent)));
		com.baidu.android.pushservice.e.a.b(s1, stringbuilder1.toString());
		if(TextUtils.isEmpty(((CharSequence) (intent)))) goto _L5; else goto _L11
_L11:
		com.baidu.android.pushservice.f.a(context, ((String) (intent)));
		return;
_L9:
		com.baidu.android.pushservice.f.e(context);
		com.baidu.android.pushservice.e.b.b(TAG, "the xiaomi appid or appkey is error, please check!", context);
		return;
_L2:
		obj = ((Object) (f.a(context).a(intent)));
		if(obj == null) goto _L13; else goto _L12
_L12:
		if(!(obj instanceof MiPushMessage)) goto _L15; else goto _L14
_L14:
		com.baidu.android.pushservice.e.a.b(TAG, "XM> is a MiPushMessage");
		if(((MiPushMessage)obj).getPassThrough() == 1)
		{
			handleXiaomiMessageCallBack(context, (MiPushMessage)obj, com.baidu.android.pushservice.b.a(com.baidu.android.pushservice.b.a));
			intent = ((Intent) (((MiPushMessage)obj).getContent()));
			context = ((Context) (TAG));
			obj = ((Object) (new StringBuilder()));
			((StringBuilder) (obj)).append("XM> passthrough msg, content = ");
			((StringBuilder) (obj)).append(((String) (intent)));
			com.baidu.android.pushservice.e.a.b(((String) (context)), ((StringBuilder) (obj)).toString());
			return;
		}
		if(((MiPushMessage)obj).isNotified())
		{
			com.baidu.android.pushservice.e.a.b(TAG, "XM> isNotified=true");
			handleXiaomiMessageCallBack(context, (MiPushMessage)obj, com.baidu.android.pushservice.b.a(com.baidu.android.pushservice.b.c));
			return;
		}
		com.baidu.android.pushservice.e.a.b(TAG, "XM> MessageArrived");
		return;
_L15:
		if(!(obj instanceof MiPushCommandMessage) || !TextUtils.equals(((CharSequence) (((MiPushCommandMessage)obj).getCommand())), "register"))
			break; /* Loop/switch isn't completed */
		obj = ((Object) ((MiPushCommandMessage)obj));
		intent = ((Intent) (((MiPushCommandMessage) (obj)).getCommandArguments()));
		if(intent == null) goto _L17; else goto _L16
_L16:
		if(((List) (intent)).isEmpty()) goto _L17; else goto _L18
_L18:
		intent = ((Intent) ((String)((List) (intent)).get(0)));
		obj = ((Object) (TAG));
		StringBuilder stringbuilder2 = new StringBuilder();
		stringbuilder2.append("XM> regId= ");
		stringbuilder2.append(((String) (intent)));
		com.baidu.android.pushservice.e.a.b(((String) (obj)), stringbuilder2.toString());
		if(TextUtils.isEmpty(((CharSequence) (intent)))) goto _L5; else goto _L11
_L17:
		com.baidu.android.pushservice.f.e(context);
		intent = ((Intent) (TAG));
		context = ((Context) (((MiPushCommandMessage) (obj)).getReason()));
		  goto _L19
_L13:
		com.baidu.android.pushservice.e.a.d(TAG, "XM> realMessage is null, go on handle");
		abyte0 = intent.getByteArrayExtra("mipush_payload");
		flag = intent.getBooleanExtra("mipush_notified", false);
		intent = ((Intent) (intent.getStringExtra("mrt")));
		if(abyte0 != null) goto _L21; else goto _L20
_L20:
		com.baidu.android.pushservice.e.a.d(TAG, "XM> receiving an empty message!");
		return;
_L21:
		obj = ((Object) (new h()));
		u.a(((org.apache.thrift.b) (obj)), abyte0);
		a1 = com.xiaomi.mipush.sdk.a.a(context);
		c1 = ((h) (obj)).m();
		if(((h) (obj)).a() != com.xiaomi.xmpush.thrift.a.e || c1 == null)
			break MISSING_BLOCK_LABEL_652;
		if(a1.l() || flag)
			break MISSING_BLOCK_LABEL_652;
		if(c1 == null) goto _L23; else goto _L22
_L22:
		((h) (obj)).m().a("mrt", ((String) (intent)));
		((h) (obj)).m().a("mat", Long.toString(System.currentTimeMillis()));
_L23:
		handlePushMetaInfo(((h) (obj)), context);
		intent = ((Intent) (getActionMsg(((h) (obj)), flag, context)));
		if(intent == null) goto _L5; else goto _L24
_L24:
		com.baidu.android.pushservice.e.a.b(TAG, "XM> msg clicked-----------------");
		handleXiaomiMessageCallBack(context, (MiPushMessage)intent, com.baidu.android.pushservice.b.a(com.baidu.android.pushservice.b.c));
		return;
_L5:
	//  302  699:return          
	//* 303  700:goto            76
	}

	private void handleXiaomiMessageCallBack(Context context, MiPushMessage mipushmessage, int i)
	{
		boolean flag;
		Object obj;
		Object obj1;
		obj = ((Object) (mipushmessage.getContent()));
	//    0    0:aload_2         
	//    1    1:invokevirtual   #374 <Method String MiPushMessage.getContent()>
	//    2    4:astore          6
		obj1 = ((Object) (TAG));
	//    3    6:getstatic       #45  <Field String TAG>
	//    4    9:astore          7
		StringBuilder stringbuilder1 = new StringBuilder();
	//    5   11:new             #47  <Class StringBuilder>
	//    6   14:dup             
	//    7   15:invokespecial   #48  <Method void StringBuilder()>
	//    8   18:astore          8
		stringbuilder1.append("XM> ");
	//    9   20:aload           8
	//   10   22:ldc2            #447 <String "XM> ">
	//   11   25:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//   12   28:pop             
		stringbuilder1.append(((String) (obj)));
	//   13   29:aload           8
	//   14   31:aload           6
	//   15   33:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//   16   36:pop             
		com.baidu.android.pushservice.e.a.b(((String) (obj1)), stringbuilder1.toString());
	//   17   37:aload           7
	//   18   39:aload           8
	//   19   41:invokevirtual   #66  <Method String StringBuilder.toString()>
	//   20   44:invokestatic    #79  <Method void a.b(String, String)>
		obj1 = ((Object) (new com.baidu.android.pushservice.message.b()));
	//   21   47:new             #240 <Class com.baidu.android.pushservice.message.b>
	//   22   50:dup             
	//   23   51:invokespecial   #448 <Method void com.baidu.android.pushservice.message.b()>
	//   24   54:astore          7
		flag = msgFromXMConsole(((String) (obj)));
	//   25   56:aload           6
	//   26   58:invokestatic    #452 <Method boolean msgFromXMConsole(String)>
	//   27   61:istore          5
		if(!flag)
			break MISSING_BLOCK_LABEL_91;
	//   28   63:iload           5
	//   29   65:ifeq            91
		com.baidu.android.pushservice.e.a.b(TAG, "XM> msgFromXmConsole=true-----------------");
	//   30   68:getstatic       #45  <Field String TAG>
	//   31   71:ldc2            #454 <String "XM> msgFromXmConsole=true-----------------">
	//   32   74:invokestatic    #79  <Method void a.b(String, String)>
		obj1.n = l.b.a();
	//   33   77:aload           7
	//   34   79:getstatic       #459 <Field l l.b>
	//   35   82:invokevirtual   #461 <Method int l.a()>
	//   36   85:putfield        #465 <Field int com.baidu.android.pushservice.message.b.n>
		break MISSING_BLOCK_LABEL_101;
	//   37   88:goto            101
		obj = ((Object) (((com.baidu.android.pushservice.message.b) (obj1)).b(context, ((String) (obj)))));
	//   38   91:aload           7
	//   39   93:aload_1         
	//   40   94:aload           6
	//   41   96:invokevirtual   #467 <Method String com.baidu.android.pushservice.message.b.b(Context, String)>
	//   42   99:astore          6
		if(com.baidu.android.pushservice.h.u.B(context)) goto _L2; else goto _L1
	//   43  101:aload_1         
	//   44  102:invokestatic    #473 <Method boolean com.baidu.android.pushservice.h.u.B(Context)>
	//   45  105:ifne            111
	//*  46  108:goto            666
_L2:
		if(i == com.baidu.android.pushservice.b.a(com.baidu.android.pushservice.b.c) || !com.baidu.android.pushservice.h.u.x(context, ((com.baidu.android.pushservice.message.b) (obj1)).m)) goto _L4; else goto _L3
	//   47  111:iload_3         
	//   48  112:getstatic       #383 <Field PushMessageReceiver$b com.baidu.android.pushservice.PushMessageReceiver$b.c>
	//   49  115:invokestatic    #367 <Method int com.baidu.android.pushservice.PushMessageReceiver$b.a(PushMessageReceiver$b)>
	//   50  118:icmpeq          181
	//   51  121:aload_1         
	//   52  122:aload           7
	//   53  124:getfield        #242 <Field String com.baidu.android.pushservice.message.b.m>
	//   54  127:invokestatic    #477 <Method boolean com.baidu.android.pushservice.h.u.x(Context, String)>
	//   55  130:ifeq            181
_L3:
		mipushmessage = ((MiPushMessage) (TAG));
	//   56  133:getstatic       #45  <Field String TAG>
	//   57  136:astore_2        
		obj = ((Object) (new StringBuilder()));
	//   58  137:new             #47  <Class StringBuilder>
	//   59  140:dup             
	//   60  141:invokespecial   #48  <Method void StringBuilder()>
	//   61  144:astore          6
		((StringBuilder) (obj)).append("XM> msgid is duplicated!!! msgid=");
	//   62  146:aload           6
	//   63  148:ldc2            #479 <String "XM> msgid is duplicated!!! msgid=">
	//   64  151:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//   65  154:pop             
		((StringBuilder) (obj)).append(((com.baidu.android.pushservice.message.b) (obj1)).m);
	//   66  155:aload           6
	//   67  157:aload           7
	//   68  159:getfield        #242 <Field String com.baidu.android.pushservice.message.b.m>
	//   69  162:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//   70  165:pop             
		com.baidu.android.pushservice.e.a.d(((String) (mipushmessage)), ((StringBuilder) (obj)).toString());
	//   71  166:aload_2         
	//   72  167:aload           6
	//   73  169:invokevirtual   #66  <Method String StringBuilder.toString()>
	//   74  172:invokestatic    #72  <Method void a.d(String, String)>
		byte byte0 = 4;
	//   75  175:iconst_4        
	//   76  176:istore          4
		  goto _L5
	//*  77  178:goto            457
_L4:
		if(((com.baidu.android.pushservice.message.b) (obj1)).n != l.p.a()) goto _L7; else goto _L6
	//   78  181:aload           7
	//   79  183:getfield        #465 <Field int com.baidu.android.pushservice.message.b.n>
	//   80  186:getstatic       #482 <Field l l.p>
	//   81  189:invokevirtual   #461 <Method int l.a()>
	//   82  192:icmpne          202
_L6:
		com.baidu.android.pushservice.h.u.D(context);
	//   83  195:aload_1         
	//   84  196:invokestatic    #485 <Method void com.baidu.android.pushservice.h.u.D(Context)>
		  goto _L1
	//*  85  199:goto            666
_L7:
		if(((com.baidu.android.pushservice.message.b) (obj1)).n != l.o.a()) goto _L9; else goto _L8
	//   86  202:aload           7
	//   87  204:getfield        #465 <Field int com.baidu.android.pushservice.message.b.n>
	//   88  207:getstatic       #488 <Field l l.o>
	//   89  210:invokevirtual   #461 <Method int l.a()>
	//   90  213:icmpne          223
_L8:
		com.baidu.android.pushservice.h.u.E(context);
	//   91  216:aload_1         
	//   92  217:invokestatic    #491 <Method void com.baidu.android.pushservice.h.u.E(Context)>
		  goto _L1
	//*  93  220:goto            666
_L9:
		if(((com.baidu.android.pushservice.message.b) (obj1)).n != l.g.a() && ((com.baidu.android.pushservice.message.b) (obj1)).n != l.c.a() && ((com.baidu.android.pushservice.message.b) (obj1)).n != l.b.a() && ((com.baidu.android.pushservice.message.b) (obj1)).n != l.f.a() && ((com.baidu.android.pushservice.message.b) (obj1)).n != l.d.a() && ((com.baidu.android.pushservice.message.b) (obj1)).n != l.e.a()) goto _L11; else goto _L10
	//   94  223:aload           7
	//   95  225:getfield        #465 <Field int com.baidu.android.pushservice.message.b.n>
	//   96  228:getstatic       #494 <Field l l.g>
	//   97  231:invokevirtual   #461 <Method int l.a()>
	//   98  234:icmpeq          326
	//   99  237:aload           7
	//  100  239:getfield        #465 <Field int com.baidu.android.pushservice.message.b.n>
	//  101  242:getstatic       #496 <Field l l.c>
	//  102  245:invokevirtual   #461 <Method int l.a()>
	//  103  248:icmpeq          326
	//  104  251:aload           7
	//  105  253:getfield        #465 <Field int com.baidu.android.pushservice.message.b.n>
	//  106  256:getstatic       #459 <Field l l.b>
	//  107  259:invokevirtual   #461 <Method int l.a()>
	//  108  262:icmpeq          326
	//  109  265:aload           7
	//  110  267:getfield        #465 <Field int com.baidu.android.pushservice.message.b.n>
	//  111  270:getstatic       #498 <Field l l.f>
	//  112  273:invokevirtual   #461 <Method int l.a()>
	//  113  276:icmpeq          326
	//  114  279:aload           7
	//  115  281:getfield        #465 <Field int com.baidu.android.pushservice.message.b.n>
	//  116  284:getstatic       #500 <Field l l.d>
	//  117  287:invokevirtual   #461 <Method int l.a()>
	//  118  290:icmpeq          326
	//  119  293:aload           7
	//  120  295:getfield        #465 <Field int com.baidu.android.pushservice.message.b.n>
	//  121  298:getstatic       #502 <Field l l.e>
	//  122  301:invokevirtual   #461 <Method int l.a()>
	//  123  304:icmpne          310
	//* 124  307:goto            326
_L11:
		com.baidu.android.pushservice.e.a.b(TAG, "XM> pXmMsg.exType is unknow-----------------");
	//  125  310:getstatic       #45  <Field String TAG>
	//  126  313:ldc2            #504 <String "XM> pXmMsg.exType is unknow-----------------">
	//  127  316:invokestatic    #79  <Method void a.b(String, String)>
		byte0 = 6;
	//  128  319:bipush          6
	//  129  321:istore          4
		  goto _L5
	//* 130  323:goto            457
_L10:
		if(i != com.baidu.android.pushservice.b.a(com.baidu.android.pushservice.b.a)) goto _L13; else goto _L12
	//  131  326:iload_3         
	//  132  327:getstatic       #364 <Field PushMessageReceiver$b com.baidu.android.pushservice.PushMessageReceiver$b.a>
	//  133  330:invokestatic    #367 <Method int com.baidu.android.pushservice.PushMessageReceiver$b.a(PushMessageReceiver$b)>
	//  134  333:icmpne          362
_L12:
		onMessage(context, ((String) (obj)), ((String) (null)));
	//  135  336:aload_0         
	//  136  337:aload_1         
	//  137  338:aload           6
	//  138  340:aconst_null     
	//  139  341:invokevirtual   #508 <Method void onMessage(Context, String, String)>
		obj = ((Object) (TAG));
	//  140  344:getstatic       #45  <Field String TAG>
	//  141  347:astore          6
		mipushmessage = "XM> onMessage call back-----------------";
	//  142  349:ldc2            #510 <String "XM> onMessage call back-----------------">
	//  143  352:astore_2        
_L16:
		try
		{
			com.baidu.android.pushservice.e.a.b(((String) (obj)), ((String) (mipushmessage)));
	//  144  353:aload           6
	//  145  355:aload_2         
	//  146  356:invokestatic    #79  <Method void a.b(String, String)>
			break; /* Loop/switch isn't completed */
	//  147  359:goto            444
		}
	//* 148  362:iload_3         
	//* 149  363:getstatic       #512 <Field PushMessageReceiver$b com.baidu.android.pushservice.PushMessageReceiver$b.b>
	//* 150  366:invokestatic    #367 <Method int com.baidu.android.pushservice.PushMessageReceiver$b.a(PushMessageReceiver$b)>
	//* 151  369:icmpne          399
	//* 152  372:aload_0         
	//* 153  373:aload_1         
	//* 154  374:aload_2         
	//* 155  375:invokevirtual   #515 <Method String MiPushMessage.getTitle()>
	//* 156  378:aload_2         
	//* 157  379:invokevirtual   #518 <Method String MiPushMessage.getDescription()>
	//* 158  382:aload           6
	//* 159  384:invokevirtual   #522 <Method void onNotificationArrived(Context, String, String, String)>
	//* 160  387:getstatic       #45  <Field String TAG>
	//* 161  390:astore          6
	//* 162  392:ldc2            #524 <String "XM> onNotificationArrived call back-----------------">
	//* 163  395:astore_2        
	//* 164  396:goto            353
	//* 165  399:iload_3         
	//* 166  400:getstatic       #383 <Field PushMessageReceiver$b com.baidu.android.pushservice.PushMessageReceiver$b.c>
	//* 167  403:invokestatic    #367 <Method int com.baidu.android.pushservice.PushMessageReceiver$b.a(PushMessageReceiver$b)>
	//* 168  406:icmpne          444
	//* 169  409:aload_0         
	//* 170  410:aload_1         
	//* 171  411:aload_2         
	//* 172  412:invokevirtual   #515 <Method String MiPushMessage.getTitle()>
	//* 173  415:aload_2         
	//* 174  416:invokevirtual   #518 <Method String MiPushMessage.getDescription()>
	//* 175  419:aload           6
	//* 176  421:invokevirtual   #527 <Method void onNotificationClicked(Context, String, String, String)>
	//* 177  424:aload_0         
	//* 178  425:aload_1         
	//* 179  426:aload_2         
	//* 180  427:aload           7
	//* 181  429:invokespecial   #529 <Method void handleIntentUri(Context, MiPushMessage, com.baidu.android.pushservice.message.b)>
	//* 182  432:getstatic       #45  <Field String TAG>
	//* 183  435:astore          6
	//* 184  437:ldc2            #531 <String "XM> onNotificationClicked call back-----------------">
	//* 185  440:astore_2        
	//* 186  441:goto            353
	//* 187  444:iload_3         
	//* 188  445:getstatic       #364 <Field PushMessageReceiver$b com.baidu.android.pushservice.PushMessageReceiver$b.a>
	//* 189  448:invokestatic    #367 <Method int com.baidu.android.pushservice.PushMessageReceiver$b.a(PushMessageReceiver$b)>
	//* 190  451:icmpne          672
	//* 191  454:goto            666
	//* 192  457:iload           5
	//* 193  459:ifne            665
	//* 194  462:iload_3         
	//* 195  463:getstatic       #364 <Field PushMessageReceiver$b com.baidu.android.pushservice.PushMessageReceiver$b.a>
	//* 196  466:invokestatic    #367 <Method int com.baidu.android.pushservice.PushMessageReceiver$b.a(PushMessageReceiver$b)>
	//* 197  469:icmpne          532
	//* 198  472:aload           7
	//* 199  474:getfield        #242 <Field String com.baidu.android.pushservice.message.b.m>
	//* 200  477:astore_2        
	//* 201  478:aload           7
	//* 202  480:getfield        #534 <Field int com.baidu.android.pushservice.message.b.j>
	//* 203  483:istore_3        
	//* 204  484:new             #47  <Class StringBuilder>
	//* 205  487:dup             
	//* 206  488:invokespecial   #48  <Method void StringBuilder()>
	//* 207  491:astore          6
	//* 208  493:aload           6
	//* 209  495:aload           7
	//* 210  497:getfield        #537 <Field String com.baidu.android.pushservice.message.b.k>
	//* 211  500:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//* 212  503:pop             
	//* 213  504:aload           6
	//* 214  506:ldc2            #539 <String "">
	//* 215  509:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//* 216  512:pop             
	//* 217  513:aload           6
	//* 218  515:invokevirtual   #66  <Method String StringBuilder.toString()>
	//* 219  518:astore          6
	//* 220  520:aload_1         
	//* 221  521:aload_2         
	//* 222  522:iload           4
	//* 223  524:iload_3         
	//* 224  525:aload           6
	//* 225  527:iconst_2        
	//* 226  528:invokestatic    #544 <Method void com.baidu.android.pushservice.h.f.a(Context, String, int, int, String, int)>
	//* 227  531:return          
	//* 228  532:iload_3         
	//* 229  533:getstatic       #512 <Field PushMessageReceiver$b com.baidu.android.pushservice.PushMessageReceiver$b.b>
	//* 230  536:invokestatic    #367 <Method int com.baidu.android.pushservice.PushMessageReceiver$b.a(PushMessageReceiver$b)>
	//* 231  539:icmpne          593
	//* 232  542:aload           7
	//* 233  544:getfield        #242 <Field String com.baidu.android.pushservice.message.b.m>
	//* 234  547:astore_2        
	//* 235  548:aload           7
	//* 236  550:getfield        #534 <Field int com.baidu.android.pushservice.message.b.j>
	//* 237  553:istore_3        
	//* 238  554:new             #47  <Class StringBuilder>
	//* 239  557:dup             
	//* 240  558:invokespecial   #48  <Method void StringBuilder()>
	//* 241  561:astore          6
	//* 242  563:aload           6
	//* 243  565:aload           7
	//* 244  567:getfield        #537 <Field String com.baidu.android.pushservice.message.b.k>
	//* 245  570:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//* 246  573:pop             
	//* 247  574:aload           6
	//* 248  576:ldc2            #539 <String "">
	//* 249  579:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//* 250  582:pop             
	//* 251  583:aload           6
	//* 252  585:invokevirtual   #66  <Method String StringBuilder.toString()>
	//* 253  588:astore          6
	//* 254  590:goto            520
	//* 255  593:iload_3         
	//* 256  594:getstatic       #383 <Field PushMessageReceiver$b com.baidu.android.pushservice.PushMessageReceiver$b.c>
	//* 257  597:invokestatic    #367 <Method int com.baidu.android.pushservice.PushMessageReceiver$b.a(PushMessageReceiver$b)>
	//* 258  600:icmpne          665
	//* 259  603:aload           7
	//* 260  605:getfield        #242 <Field String com.baidu.android.pushservice.message.b.m>
	//* 261  608:astore_2        
	//* 262  609:aload           7
	//* 263  611:getfield        #534 <Field int com.baidu.android.pushservice.message.b.j>
	//* 264  614:istore_3        
	//* 265  615:new             #47  <Class StringBuilder>
	//* 266  618:dup             
	//* 267  619:invokespecial   #48  <Method void StringBuilder()>
	//* 268  622:astore          6
	//* 269  624:aload           6
	//* 270  626:aload           7
	//* 271  628:getfield        #537 <Field String com.baidu.android.pushservice.message.b.k>
	//* 272  631:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//* 273  634:pop             
	//* 274  635:aload           6
	//* 275  637:ldc2            #539 <String "">
	//* 276  640:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//* 277  643:pop             
	//* 278  644:aload_1         
	//* 279  645:aload_2         
	//* 280  646:iload_3         
	//* 281  647:aload           6
	//* 282  649:invokevirtual   #66  <Method String StringBuilder.toString()>
	//* 283  652:iconst_2        
	//* 284  653:invokestatic    #547 <Method void com.baidu.android.pushservice.h.f.a(Context, String, int, String, int)>
	//* 285  656:return          
		// Misplaced declaration of an exception variable
		catch(Context context)
	//* 286  657:astore_1        
		{
			com.baidu.android.pushservice.e.a.a(TAG, ((Throwable) (context)));
	//  287  658:getstatic       #45  <Field String TAG>
	//  288  661:aload_1         
	//  289  662:invokestatic    #100 <Method void a.a(String, Throwable)>
		}
		  goto _L14
_L13:
		if(i != com.baidu.android.pushservice.b.a(com.baidu.android.pushservice.b.b))
			break MISSING_BLOCK_LABEL_399;
		onNotificationArrived(context, mipushmessage.getTitle(), mipushmessage.getDescription(), ((String) (obj)));
		obj = ((Object) (TAG));
		mipushmessage = "XM> onNotificationArrived call back-----------------";
		continue; /* Loop/switch isn't completed */
		if(i != com.baidu.android.pushservice.b.a(com.baidu.android.pushservice.b.c))
			break; /* Loop/switch isn't completed */
		onNotificationClicked(context, mipushmessage.getTitle(), mipushmessage.getDescription(), ((String) (obj)));
		handleIntentUri(context, mipushmessage, ((com.baidu.android.pushservice.message.b) (obj1)));
		obj = ((Object) (TAG));
		mipushmessage = "XM> onNotificationClicked call back-----------------";
		if(true) goto _L16; else goto _L15
_L15:
		if(i != com.baidu.android.pushservice.b.a(com.baidu.android.pushservice.b.a)) goto _L17; else goto _L1
_L5:
		if(flag) goto _L14; else goto _L18
_L18:
		if(i != com.baidu.android.pushservice.b.a(com.baidu.android.pushservice.b.a))
			break MISSING_BLOCK_LABEL_532;
		mipushmessage = ((MiPushMessage) (((com.baidu.android.pushservice.message.b) (obj1)).m));
		i = ((com.baidu.android.pushservice.message.b) (obj1)).j;
		obj = ((Object) (new StringBuilder()));
		((StringBuilder) (obj)).append(((com.baidu.android.pushservice.message.b) (obj1)).k);
		((StringBuilder) (obj)).append("");
		obj = ((Object) (((StringBuilder) (obj)).toString()));
_L20:
		com.baidu.android.pushservice.h.f.a(context, ((String) (mipushmessage)), ((int) (byte0)), i, ((String) (obj)), 2);
		return;
label0:
		{
			if(i != com.baidu.android.pushservice.b.a(com.baidu.android.pushservice.b.b))
				break label0;
			mipushmessage = ((MiPushMessage) (((com.baidu.android.pushservice.message.b) (obj1)).m));
			i = ((com.baidu.android.pushservice.message.b) (obj1)).j;
			obj = ((Object) (new StringBuilder()));
			((StringBuilder) (obj)).append(((com.baidu.android.pushservice.message.b) (obj1)).k);
			((StringBuilder) (obj)).append("");
			obj = ((Object) (((StringBuilder) (obj)).toString()));
		}
		if(true) goto _L20; else goto _L19
_L19:
		if(i == com.baidu.android.pushservice.b.a(com.baidu.android.pushservice.b.c))
		{
			mipushmessage = ((MiPushMessage) (((com.baidu.android.pushservice.message.b) (obj1)).m));
			i = ((com.baidu.android.pushservice.message.b) (obj1)).j;
			StringBuilder stringbuilder = new StringBuilder();
			stringbuilder.append(((com.baidu.android.pushservice.message.b) (obj1)).k);
			stringbuilder.append("");
			com.baidu.android.pushservice.h.f.a(context, ((String) (mipushmessage)), i, stringbuilder.toString(), 2);
			return;
		}
_L14:
		return;
	//  290  665:return          
_L1:
		byte0 = 0;
	//  291  666:iconst_0        
	//  292  667:istore          4
		continue; /* Loop/switch isn't completed */
	//  293  669:goto            457
_L17:
		byte0 = 1;
	//  294  672:iconst_1        
	//  295  673:istore          4
		if(true) goto _L5; else goto _L21
	//  296  675:goto            457
_L21:
	}

	private static boolean msgFromXMConsole(String s)
	{
label0:
		{
			try
			{
				if(new JSONObject(s) != null)
					break label0;
	//    0    0:new             #549 <Class JSONObject>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #552 <Method void JSONObject(String)>
	//    4    8:ifnonnull       22
				com.baidu.android.pushservice.e.a.d(TAG, "msg from xiaomi platform!!!!");
	//    5   11:getstatic       #45  <Field String TAG>
	//    6   14:ldc2            #554 <String "msg from xiaomi platform!!!!">
	//    7   17:invokestatic    #72  <Method void a.d(String, String)>
			}
	//*   8   20:iconst_1        
	//*   9   21:ireturn         
	//*  10   22:iconst_0        
	//*  11   23:ireturn         
	//*  12   24:getstatic       #45  <Field String TAG>
	//*  13   27:ldc2            #554 <String "msg from xiaomi platform!!!!">
	//*  14   30:invokestatic    #72  <Method void a.d(String, String)>
	//*  15   33:iconst_1        
	//*  16   34:ireturn         
			// Misplaced declaration of an exception variable
			catch(String s)
			{
				com.baidu.android.pushservice.e.a.d(TAG, "msg from xiaomi platform!!!!");
				return true;
			}
			return true;
		}
		return false;
	//*  17   35:astore_0        
	//*  18   36:goto            24
	}

	private void sendCallback(Context context, Intent intent, int i)
	{
		try
		{
			intent.putExtra("bd.cross.request.RESULT_CODE", i);
	//    0    0:aload_2         
	//    1    1:ldc2            #556 <String "bd.cross.request.RESULT_CODE">
	//    2    4:iload_3         
	//    3    5:invokevirtual   #236 <Method Intent Intent.putExtra(String, int)>
	//    4    8:pop             
			intent.setClass(context, com/baidu/android/pushservice/CommandService);
	//    5    9:aload_2         
	//    6   10:aload_1         
	//    7   11:ldc2            #558 <Class CommandService>
	//    8   14:invokevirtual   #562 <Method Intent Intent.setClass(Context, Class)>
	//    9   17:pop             
			intent.putExtra("bd.cross.request.COMMAND_TYPE", "bd.cross.command.MESSAGE_ACK");
	//   10   18:aload_2         
	//   11   19:ldc2            #564 <String "bd.cross.request.COMMAND_TYPE">
	//   12   22:ldc2            #566 <String "bd.cross.command.MESSAGE_ACK">
	//   13   25:invokevirtual   #245 <Method Intent Intent.putExtra(String, String)>
	//   14   28:pop             
			context.startService(intent);
	//   15   29:aload_1         
	//   16   30:aload_2         
	//   17   31:invokevirtual   #570 <Method android.content.ComponentName Context.startService(Intent)>
	//   18   34:pop             
			return;
	//   19   35:return          
		}
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*  20   36:astore_1        
		{
			com.baidu.android.pushservice.e.a.a(TAG, ((Throwable) (context)));
	//   21   37:getstatic       #45  <Field String TAG>
	//   22   40:aload_1         
	//   23   41:invokestatic    #100 <Method void a.a(String, Throwable)>
		}
	//   24   44:return          
	}

	private void startApplicationLauncher(Context context, String s, String s1, String s2)
	{
		if(s2 == null)
			break MISSING_BLOCK_LABEL_16;
	//    0    0:aload           4
	//    1    2:ifnull          16
		s2 = ((String) (Intent.parseUri(s2, 0)));
	//    2    5:aload           4
	//    3    7:iconst_0        
	//    4    8:invokestatic    #201 <Method Intent Intent.parseUri(String, int)>
	//    5   11:astore          4
		break MISSING_BLOCK_LABEL_25;
	//    6   13:goto            25
		s2 = ((String) (new Intent()));
	//    7   16:new             #104 <Class Intent>
	//    8   19:dup             
	//    9   20:invokespecial   #105 <Method void Intent()>
	//   10   23:astore          4
		String s3 = getLauncherActivityName(context, s);
	//   11   25:aload_0         
	//   12   26:aload_1         
	//   13   27:aload_2         
	//   14   28:invokespecial   #573 <Method String getLauncherActivityName(Context, String)>
	//   15   31:astore          5
		if(s3 != null)
	//*  16   33:aload           5
	//*  17   35:ifnull          93
			try
			{
				((Intent) (s2)).setClassName(s, s3);
	//   18   38:aload           4
	//   19   40:aload_2         
	//   20   41:aload           5
	//   21   43:invokevirtual   #576 <Method Intent Intent.setClassName(String, String)>
	//   22   46:pop             
				((Intent) (s2)).setFlags(((Intent) (s2)).getFlags() | 0x10000000);
	//   23   47:aload           4
	//   24   49:aload           4
	//   25   51:invokevirtual   #579 <Method int Intent.getFlags()>
	//   26   54:ldc1            #227 <Int 0x10000000>
	//   27   56:ior             
	//   28   57:invokevirtual   #582 <Method Intent Intent.setFlags(int)>
	//   29   60:pop             
				((Intent) (s2)).putExtra("open_type", 1);
	//   30   61:aload           4
	//   31   63:ldc1            #233 <String "open_type">
	//   32   65:iconst_1        
	//   33   66:invokevirtual   #236 <Method Intent Intent.putExtra(String, int)>
	//   34   69:pop             
				((Intent) (s2)).putExtra("msgid", s1);
	//   35   70:aload           4
	//   36   72:ldc1            #238 <String "msgid">
	//   37   74:aload_3         
	//   38   75:invokevirtual   #245 <Method Intent Intent.putExtra(String, String)>
	//   39   78:pop             
				context.startActivity(((Intent) (s2)));
	//   40   79:aload_1         
	//   41   80:aload           4
	//   42   82:invokevirtual   #248 <Method void Context.startActivity(Intent)>
				return;
	//   43   85:return          
			}
	//*  44   86:getstatic       #45  <Field String TAG>
	//*  45   89:aload_1         
	//*  46   90:invokestatic    #100 <Method void a.a(String, Throwable)>
	//*  47   93:return          
			// Misplaced declaration of an exception variable
			catch(Context context)
			{
				com.baidu.android.pushservice.e.a.a(TAG, ((Throwable) (context)));
			}
		return;
	//*  48   94:astore_1        
	//*  49   95:goto            86
	}

	public Object decryptXmOrigMsg(Context context, h h1)
	{
		if(h1.c())
	//*   0    0:aload_2         
	//*   1    1:invokevirtual   #584 <Method boolean h.c()>
	//*   2    4:ifeq            175
		{
			context = ((Context) (new SecretKeySpec(com.xiaomi.channel.commonutils.string.a.a(com.xiaomi.mipush.sdk.a.a(context).f()), "AES")));
	//    3    7:new             #586 <Class SecretKeySpec>
	//    4   10:dup             
	//    5   11:aload_1         
	//    6   12:invokestatic    #421 <Method com.xiaomi.mipush.sdk.a com.xiaomi.mipush.sdk.a.a(Context)>
	//    7   15:invokevirtual   #587 <Method String com.xiaomi.mipush.sdk.a.f()>
	//    8   18:invokestatic    #591 <Method byte[] com.xiaomi.channel.commonutils.string.a.a(String)>
	//    9   21:ldc2            #593 <String "AES">
	//   10   24:invokespecial   #596 <Method void SecretKeySpec(byte[], String)>
	//   11   27:astore_1        
			IvParameterSpec ivparameterspec = new IvParameterSpec(new byte[] {
				100, 23, 84, 114, 72, 0, 4, 97, 73, 97, 
				2, 52, 84, 102, 18, 32
			});
	//   12   28:new             #598 <Class IvParameterSpec>
	//   13   31:dup             
	//   14   32:bipush          16
	//   15   34:newarray        byte[]
	//   16   36:dup             
	//   17   37:iconst_0        
	//   18   38:ldc2            #599 <Int 100>
	//   19   41:bastore         
	//   20   42:dup             
	//   21   43:iconst_1        
	//   22   44:ldc2            #600 <Int 23>
	//   23   47:bastore         
	//   24   48:dup             
	//   25   49:iconst_2        
	//   26   50:ldc2            #601 <Int 84>
	//   27   53:bastore         
	//   28   54:dup             
	//   29   55:iconst_3        
	//   30   56:ldc2            #602 <Int 114>
	//   31   59:bastore         
	//   32   60:dup             
	//   33   61:iconst_4        
	//   34   62:ldc2            #603 <Int 72>
	//   35   65:bastore         
	//   36   66:dup             
	//   37   67:iconst_5        
	//   38   68:ldc2            #604 <Int 0>
	//   39   71:bastore         
	//   40   72:dup             
	//   41   73:bipush          6
	//   42   75:ldc2            #605 <Int 4>
	//   43   78:bastore         
	//   44   79:dup             
	//   45   80:bipush          7
	//   46   82:ldc2            #606 <Int 97>
	//   47   85:bastore         
	//   48   86:dup             
	//   49   87:bipush          8
	//   50   89:ldc2            #607 <Int 73>
	//   51   92:bastore         
	//   52   93:dup             
	//   53   94:bipush          9
	//   54   96:ldc2            #606 <Int 97>
	//   55   99:bastore         
	//   56  100:dup             
	//   57  101:bipush          10
	//   58  103:ldc2            #608 <Int 2>
	//   59  106:bastore         
	//   60  107:dup             
	//   61  108:bipush          11
	//   62  110:ldc2            #609 <Int 52>
	//   63  113:bastore         
	//   64  114:dup             
	//   65  115:bipush          12
	//   66  117:ldc2            #601 <Int 84>
	//   67  120:bastore         
	//   68  121:dup             
	//   69  122:bipush          13
	//   70  124:ldc2            #610 <Int 102>
	//   71  127:bastore         
	//   72  128:dup             
	//   73  129:bipush          14
	//   74  131:ldc2            #611 <Int 18>
	//   75  134:bastore         
	//   76  135:dup             
	//   77  136:bipush          15
	//   78  138:ldc2            #612 <Int 32>
	//   79  141:bastore         
	//   80  142:invokespecial   #615 <Method void IvParameterSpec(byte[])>
	//   81  145:astore_3        
			Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
	//   82  146:ldc2            #617 <String "AES/CBC/PKCS5Padding">
	//   83  149:invokestatic    #623 <Method Cipher Cipher.getInstance(String)>
	//   84  152:astore          4
			cipher.init(2, ((java.security.Key) (context)), ((java.security.spec.AlgorithmParameterSpec) (ivparameterspec)));
	//   85  154:aload           4
	//   86  156:iconst_2        
	//   87  157:aload_1         
	//   88  158:aload_3         
	//   89  159:invokevirtual   #627 <Method void Cipher.init(int, java.security.Key, java.security.spec.AlgorithmParameterSpec)>
			context = ((Context) (cipher.doFinal(h1.f())));
	//   90  162:aload           4
	//   91  164:aload_2         
	//   92  165:invokevirtual   #630 <Method byte[] h.f()>
	//   93  168:invokevirtual   #634 <Method byte[] Cipher.doFinal(byte[])>
	//   94  171:astore_1        
			break MISSING_BLOCK_LABEL_180;
	//   95  172:goto            180
		}
		context = ((Context) (h1.f()));
	//   96  175:aload_2         
	//   97  176:invokevirtual   #630 <Method byte[] h.f()>
	//   98  179:astore_1        
		h1 = ((h) (new n()));
	//   99  180:new             #81  <Class n>
	//  100  183:dup             
	//  101  184:invokespecial   #635 <Method void n()>
	//  102  187:astore_2        
		if(h1 != null)
	//* 103  188:aload_2         
	//* 104  189:ifnull          200
			try
			{
				u.a((org.apache.thrift.b)h1, ((byte []) (context)));
	//  105  192:aload_2         
	//  106  193:checkcast       #43  <Class b>
	//  107  196:aload_1         
	//  108  197:invokestatic    #416 <Method void u.a(b, byte[])>
			}
	//* 109  200:aload_2         
	//* 110  201:areturn         
			// Misplaced declaration of an exception variable
			catch(Context context)
	//* 111  202:astore_1        
			{
				com.baidu.android.pushservice.e.a.a(TAG, ((Throwable) (context)));
	//  112  203:getstatic       #45  <Field String TAG>
	//  113  206:aload_1         
	//  114  207:invokestatic    #100 <Method void a.a(String, Throwable)>
				return ((Object) (null));
	//  115  210:aconst_null     
	//  116  211:areturn         
			}
		return ((Object) (h1));
	}

	public abstract void onBind(Context context, int i, String s, String s1, String s2, String s3);

	public void onCheckBindState(Context context, int i, String s, boolean flag)
	{
	//    0    0:return          
	}

	public abstract void onDelTags(Context context, int i, List list, List list1, String s);

	public abstract void onListTags(Context context, int i, List list, String s);

	public abstract void onMessage(Context context, String s, String s1);

	public abstract void onNotificationArrived(Context context, String s, String s1, String s2);

	public abstract void onNotificationClicked(Context context, String s, String s1, String s2);

	public final void onReceive(Context context, Intent intent)
	{
		if(intent == null) goto _L2; else goto _L1
	//    0    0:aload_2         
	//    1    1:ifnull          2796
_L1:
		if(intent.getAction() == null)
	//*   2    4:aload_2         
	//*   3    5:invokevirtual   #650 <Method String Intent.getAction()>
	//*   4    8:ifnonnull       12
			return;
	//    5   11:return          
		intent.getByteArrayExtra("baidu_message_secur_info");
	//    6   12:aload_2         
	//    7   13:ldc2            #652 <String "baidu_message_secur_info">
	//    8   16:invokevirtual   #396 <Method byte[] Intent.getByteArrayExtra(String)>
	//    9   19:pop             
		int i;
		boolean flag1;
		Object obj;
		obj = ((Object) (intent.getAction()));
	//   10   20:aload_2         
	//   11   21:invokevirtual   #650 <Method String Intent.getAction()>
	//   12   24:astore          9
		flag1 = ((String) (obj)).equals("com.baidu.android.pushservice.action.MESSAGE");
	//   13   26:aload           9
	//   14   28:ldc2            #654 <String "com.baidu.android.pushservice.action.MESSAGE">
	//   15   31:invokevirtual   #195 <Method boolean String.equals(Object)>
	//   16   34:istore          6
		i = 4;
	//   17   36:iconst_4        
	//   18   37:istore_3        
		if(!flag1 && !((String) (obj)).equals("com.baidu.android.pushservice.action.LAPP_MESSAGE")) goto _L4; else goto _L3
	//   19   38:iload           6
	//   20   40:ifne            2615
	//   21   43:aload           9
	//   22   45:ldc2            #656 <String "com.baidu.android.pushservice.action.LAPP_MESSAGE">
	//   23   48:invokevirtual   #195 <Method boolean String.equals(Object)>
	//   24   51:ifeq            57
	//*  25   54:goto            2615
_L4:
		int k;
		boolean flag;
		flag1 = ((String) (obj)).equals("com.baidu.android.pushservice.action.RECEIVE");
	//   26   57:aload           9
	//   27   59:ldc2            #658 <String "com.baidu.android.pushservice.action.RECEIVE">
	//   28   62:invokevirtual   #195 <Method boolean String.equals(Object)>
	//   29   65:istore          6
		flag = false;
	//   30   67:iconst_0        
	//   31   68:istore          5
		k = 0;
	//   32   70:iconst_0        
	//   33   71:istore          4
		if(!flag1 && !((String) (obj)).equals(((Object) (ACTION_LAPP_RECEIVE)))) goto _L6; else goto _L5
	//   34   73:iload           6
	//   35   75:ifne            966
	//   36   78:aload           9
	//   37   80:getstatic       #660 <Field String ACTION_LAPP_RECEIVE>
	//   38   83:invokevirtual   #195 <Method boolean String.equals(Object)>
	//   39   86:ifeq            92
	//*  40   89:goto            966
_L6:
		if(!((String) (obj)).equals("com.baidu.android.pushservice.action.notification.CLICK")) goto _L8; else goto _L7
	//   41   92:aload           9
	//   42   94:ldc2            #662 <String "com.baidu.android.pushservice.action.notification.CLICK">
	//   43   97:invokevirtual   #195 <Method boolean String.equals(Object)>
	//   44  100:ifeq            162
_L7:
		obj = ((Object) (intent.getStringExtra("notification_title")));
	//   45  103:aload_2         
	//   46  104:ldc2            #664 <String "notification_title">
	//   47  107:invokevirtual   #408 <Method String Intent.getStringExtra(String)>
	//   48  110:astore          9
		String s = intent.getStringExtra("notification_content");
	//   49  112:aload_2         
	//   50  113:ldc2            #666 <String "notification_content">
	//   51  116:invokevirtual   #408 <Method String Intent.getStringExtra(String)>
	//   52  119:astore          10
		String s1 = intent.getStringExtra("extra_extra_custom_content");
	//   53  121:aload_2         
	//   54  122:ldc2            #668 <String "extra_extra_custom_content">
	//   55  125:invokevirtual   #408 <Method String Intent.getStringExtra(String)>
	//   56  128:astore          11
		if(com.baidu.android.pushservice.h.u.a(context, intent.getStringExtra("com.baidu.pushservice.app_id"), ((String) (obj)), s, s1))
	//*  57  130:aload_1         
	//*  58  131:aload_2         
	//*  59  132:ldc2            #670 <String "com.baidu.pushservice.app_id">
	//*  60  135:invokevirtual   #408 <Method String Intent.getStringExtra(String)>
	//*  61  138:aload           9
	//*  62  140:aload           10
	//*  63  142:aload           11
	//*  64  144:invokestatic    #673 <Method boolean com.baidu.android.pushservice.h.u.a(Context, String, String, String, String)>
	//*  65  147:ifeq            2769
		{
			onNotificationClicked(context, ((String) (obj)), s, s1);
	//   66  150:aload_0         
	//   67  151:aload_1         
	//   68  152:aload           9
	//   69  154:aload           10
	//   70  156:aload           11
	//   71  158:invokevirtual   #527 <Method void onNotificationClicked(Context, String, String, String)>
			return;
	//   72  161:return          
		}
		  goto _L9
_L8:
		if(!((String) (obj)).equals("com.huawei.android.push.intent.REGISTRATION")) goto _L11; else goto _L10
	//   73  162:aload           9
	//   74  164:ldc2            #675 <String "com.huawei.android.push.intent.REGISTRATION">
	//   75  167:invokevirtual   #195 <Method boolean String.equals(Object)>
	//   76  170:ifeq            260
_L10:
		if(ModeConfig.isHuaweiProxyMode(context))
	//*  77  173:aload_1         
	//*  78  174:invokestatic    #680 <Method boolean ModeConfig.isHuaweiProxyMode(Context)>
	//*  79  177:ifeq            2769
			try
			{
				intent = ((Intent) (new String(intent.getByteArrayExtra("device_token"), "UTF-8")));
	//   80  180:new             #182 <Class String>
	//   81  183:dup             
	//   82  184:aload_2         
	//   83  185:ldc2            #682 <String "device_token">
	//   84  188:invokevirtual   #396 <Method byte[] Intent.getByteArrayExtra(String)>
	//   85  191:ldc2            #684 <String "UTF-8">
	//   86  194:invokespecial   #685 <Method void String(byte[], String)>
	//   87  197:astore_2        
				obj = ((Object) (TAG));
	//   88  198:getstatic       #45  <Field String TAG>
	//   89  201:astore          9
				StringBuilder stringbuilder3 = new StringBuilder();
	//   90  203:new             #47  <Class StringBuilder>
	//   91  206:dup             
	//   92  207:invokespecial   #48  <Method void StringBuilder()>
	//   93  210:astore          10
				stringbuilder3.append("huawei token arrive, value=");
	//   94  212:aload           10
	//   95  214:ldc2            #687 <String "huawei token arrive, value=">
	//   96  217:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//   97  220:pop             
				stringbuilder3.append(((String) (intent)));
	//   98  221:aload           10
	//   99  223:aload_2         
	//  100  224:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//  101  227:pop             
				com.baidu.android.pushservice.e.a.c(((String) (obj)), stringbuilder3.toString());
	//  102  228:aload           9
	//  103  230:aload           10
	//  104  232:invokevirtual   #66  <Method String StringBuilder.toString()>
	//  105  235:invokestatic    #220 <Method void a.c(String, String)>
				if(!TextUtils.isEmpty(((CharSequence) (intent))))
	//* 106  238:aload_2         
	//* 107  239:invokestatic    #190 <Method boolean TextUtils.isEmpty(CharSequence)>
	//* 108  242:ifne            2769
				{
					com.baidu.android.pushservice.f.a(context, ((String) (intent)));
	//  109  245:aload_1         
	//  110  246:aload_2         
	//  111  247:invokestatic    #338 <Method void com.baidu.android.pushservice.f.a(Context, String)>
					return;
	//  112  250:return          
				}
			}
			// Misplaced declaration of an exception variable
			catch(Context context)
	//* 113  251:astore_1        
			{
				com.baidu.android.pushservice.e.a.a(TAG, ((Throwable) (context)));
	//  114  252:getstatic       #45  <Field String TAG>
	//  115  255:aload_1         
	//  116  256:invokestatic    #100 <Method void a.a(String, Throwable)>
				return;
	//  117  259:return          
			}
		  goto _L9
_L11:
		if(!((String) (obj)).equals("com.huawei.intent.action.PUSH")) goto _L13; else goto _L12
	//  118  260:aload           9
	//  119  262:ldc2            #689 <String "com.huawei.intent.action.PUSH">
	//  120  265:invokevirtual   #195 <Method boolean String.equals(Object)>
	//  121  268:ifeq            473
_L12:
		if(!ModeConfig.isHuaweiProxyMode(context))
	//* 122  271:aload_1         
	//* 123  272:invokestatic    #680 <Method boolean ModeConfig.isHuaweiProxyMode(Context)>
	//* 124  275:ifne            279
			return;
	//  125  278:return          
		intent = ((Intent) (new String(intent.getByteArrayExtra("selfshow_info"), "UTF-8")));
	//  126  279:new             #182 <Class String>
	//  127  282:dup             
	//  128  283:aload_2         
	//  129  284:ldc2            #691 <String "selfshow_info">
	//  130  287:invokevirtual   #396 <Method byte[] Intent.getByteArrayExtra(String)>
	//  131  290:ldc2            #684 <String "UTF-8">
	//  132  293:invokespecial   #685 <Method void String(byte[], String)>
	//  133  296:astore_2        
		obj = ((Object) (TAG));
	//  134  297:getstatic       #45  <Field String TAG>
	//  135  300:astore          9
		StringBuilder stringbuilder4 = new StringBuilder();
	//  136  302:new             #47  <Class StringBuilder>
	//  137  305:dup             
	//  138  306:invokespecial   #48  <Method void StringBuilder()>
	//  139  309:astore          10
		stringbuilder4.append("Receive Notify Message   = ");
	//  140  311:aload           10
	//  141  313:ldc2            #693 <String "Receive Notify Message   = ">
	//  142  316:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//  143  319:pop             
		stringbuilder4.append(((String) (intent)));
	//  144  320:aload           10
	//  145  322:aload_2         
	//  146  323:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//  147  326:pop             
		com.baidu.android.pushservice.e.a.c(((String) (obj)), stringbuilder4.toString());
	//  148  327:aload           9
	//  149  329:aload           10
	//  150  331:invokevirtual   #66  <Method String StringBuilder.toString()>
	//  151  334:invokestatic    #220 <Method void a.c(String, String)>
		if(TextUtils.isEmpty(((CharSequence) (intent))) || context == null) goto _L9; else goto _L14
	//  152  337:aload_2         
	//  153  338:invokestatic    #190 <Method boolean TextUtils.isEmpty(CharSequence)>
	//  154  341:ifne            2769
	//  155  344:aload_1         
	//  156  345:ifnull          2769
_L14:
		intent = ((Intent) (j.a(context, ((String) (intent)))));
	//  157  348:aload_1         
	//  158  349:aload_2         
	//  159  350:invokestatic    #698 <Method com.baidu.android.pushservice.message.b j.a(Context, String)>
	//  160  353:astore_2        
		obj = ((Object) (((com.baidu.android.pushservice.message.b) (intent)).a(context)));
	//  161  354:aload_2         
	//  162  355:aload_1         
	//  163  356:invokevirtual   #701 <Method com.baidu.android.pushservice.message.PublicMsg com.baidu.android.pushservice.message.b.a(Context)>
	//  164  359:astore          9
		if(obj == null)
	//* 165  361:aload           9
	//* 166  363:ifnonnull       367
			return;
	//  167  366:return          
		if(!com.baidu.android.pushservice.h.u.B(context))
	//* 168  367:aload_1         
	//* 169  368:invokestatic    #473 <Method boolean com.baidu.android.pushservice.h.u.B(Context)>
	//* 170  371:ifne            379
		{
			i = 0;
	//  171  374:iconst_0        
	//  172  375:istore_3        
			break MISSING_BLOCK_LABEL_417;
	//  173  376:goto            417
		}
		if(com.baidu.android.pushservice.h.u.x(context, ((com.baidu.android.pushservice.message.b) (intent)).a))
	//* 174  379:aload_1         
	//* 175  380:aload_2         
	//* 176  381:getfield        #703 <Field String com.baidu.android.pushservice.message.b.a>
	//* 177  384:invokestatic    #477 <Method boolean com.baidu.android.pushservice.h.u.x(Context, String)>
	//* 178  387:ifeq            393
			break MISSING_BLOCK_LABEL_417;
	//  179  390:goto            417
		com.baidu.android.pushservice.PushServiceReceiver.a(context, context.getPackageName(), "com.baidu.android.pushservice.CommandService", ((com.baidu.android.pushservice.message.PublicMsg) (obj)));
	//  180  393:aload_1         
	//  181  394:aload_1         
	//  182  395:invokevirtual   #204 <Method String Context.getPackageName()>
	//  183  398:ldc2            #705 <String "com.baidu.android.pushservice.CommandService">
	//  184  401:aload           9
	//  185  403:invokestatic    #710 <Method void com.baidu.android.pushservice.PushServiceReceiver.a(Context, String, String, com.baidu.android.pushservice.message.PublicMsg)>
		com.baidu.android.pushservice.e.a.c(TAG, "show HWNotify Message");
	//  186  406:getstatic       #45  <Field String TAG>
	//  187  409:ldc2            #712 <String "show HWNotify Message">
	//  188  412:invokestatic    #220 <Method void a.c(String, String)>
		i = 1;
	//  189  415:iconst_1        
	//  190  416:istore_3        
		obj = ((Object) (((com.baidu.android.pushservice.message.b) (intent)).a));
	//  191  417:aload_2         
	//  192  418:getfield        #703 <Field String com.baidu.android.pushservice.message.b.a>
	//  193  421:astore          9
		k = ((com.baidu.android.pushservice.message.b) (intent)).j;
	//  194  423:aload_2         
	//  195  424:getfield        #534 <Field int com.baidu.android.pushservice.message.b.j>
	//  196  427:istore          4
		StringBuilder stringbuilder5 = new StringBuilder();
	//  197  429:new             #47  <Class StringBuilder>
	//  198  432:dup             
	//  199  433:invokespecial   #48  <Method void StringBuilder()>
	//  200  436:astore          10
		stringbuilder5.append(((com.baidu.android.pushservice.message.b) (intent)).k);
	//  201  438:aload           10
	//  202  440:aload_2         
	//  203  441:getfield        #537 <Field String com.baidu.android.pushservice.message.b.k>
	//  204  444:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//  205  447:pop             
		stringbuilder5.append("");
	//  206  448:aload           10
	//  207  450:ldc2            #539 <String "">
	//  208  453:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//  209  456:pop             
		com.baidu.android.pushservice.h.f.a(context, ((String) (obj)), i, k, stringbuilder5.toString(), 1);
	//  210  457:aload_1         
	//  211  458:aload           9
	//  212  460:iload_3         
	//  213  461:iload           4
	//  214  463:aload           10
	//  215  465:invokevirtual   #66  <Method String StringBuilder.toString()>
	//  216  468:iconst_1        
	//  217  469:invokestatic    #544 <Method void com.baidu.android.pushservice.h.f.a(Context, String, int, int, String, int)>
		return;
	//  218  472:return          
_L13:
		if(!((String) (obj)).equals("com.huawei.android.push.intent.RECEIVE")) goto _L16; else goto _L15
	//  219  473:aload           9
	//  220  475:ldc2            #714 <String "com.huawei.android.push.intent.RECEIVE">
	//  221  478:invokevirtual   #195 <Method boolean String.equals(Object)>
	//  222  481:ifeq            798
_L15:
		if(!ModeConfig.isHuaweiProxyMode(context))
	//* 223  484:aload_1         
	//* 224  485:invokestatic    #680 <Method boolean ModeConfig.isHuaweiProxyMode(Context)>
	//* 225  488:ifne            492
			return;
	//  226  491:return          
		obj = ((Object) (intent.getByteArrayExtra("msg_data")));
	//  227  492:aload_2         
	//  228  493:ldc2            #716 <String "msg_data">
	//  229  496:invokevirtual   #396 <Method byte[] Intent.getByteArrayExtra(String)>
	//  230  499:astore          9
		intent = ((Intent) (intent.getByteArrayExtra("device_token")));
	//  231  501:aload_2         
	//  232  502:ldc2            #682 <String "device_token">
	//  233  505:invokevirtual   #396 <Method byte[] Intent.getByteArrayExtra(String)>
	//  234  508:astore_2        
		Object obj1;
		obj = ((Object) (new String(((byte []) (obj)), "utf-8")));
	//  235  509:new             #182 <Class String>
	//  236  512:dup             
	//  237  513:aload           9
	//  238  515:ldc2            #718 <String "utf-8">
	//  239  518:invokespecial   #685 <Method void String(byte[], String)>
	//  240  521:astore          9
		intent = ((Intent) (new String(((byte []) (intent)), "utf-8")));
	//  241  523:new             #182 <Class String>
	//  242  526:dup             
	//  243  527:aload_2         
	//  244  528:ldc2            #718 <String "utf-8">
	//  245  531:invokespecial   #685 <Method void String(byte[], String)>
	//  246  534:astore_2        
		obj1 = ((Object) (new com.baidu.android.pushservice.message.b()));
	//  247  535:new             #240 <Class com.baidu.android.pushservice.message.b>
	//  248  538:dup             
	//  249  539:invokespecial   #448 <Method void com.baidu.android.pushservice.message.b()>
	//  250  542:astore          10
		obj = ((Object) (((com.baidu.android.pushservice.message.b) (obj1)).a(context, ((String) (obj)))));
	//  251  544:aload           10
	//  252  546:aload_1         
	//  253  547:aload           9
	//  254  549:invokevirtual   #720 <Method String com.baidu.android.pushservice.message.b.a(Context, String)>
	//  255  552:astore          9
		if(m.b(context, "bdpush_hwsignresult", 1) == 0)
	//* 256  554:aload_1         
	//* 257  555:ldc2            #722 <String "bdpush_hwsignresult">
	//* 258  558:iconst_1        
	//* 259  559:invokestatic    #727 <Method int m.b(Context, String, int)>
	//* 260  562:ifne            566
			return;
	//  261  565:return          
		if(com.baidu.android.pushservice.h.u.B(context)) goto _L18; else goto _L17
	//  262  566:aload_1         
	//  263  567:invokestatic    #473 <Method boolean com.baidu.android.pushservice.h.u.B(Context)>
	//  264  570:ifne            576
	//* 265  573:goto            2818
_L18:
		if(!com.baidu.android.pushservice.h.u.x(context, ((com.baidu.android.pushservice.message.b) (obj1)).m)) goto _L20; else goto _L19
	//  266  576:aload_1         
	//  267  577:aload           10
	//  268  579:getfield        #242 <Field String com.baidu.android.pushservice.message.b.m>
	//  269  582:invokestatic    #477 <Method boolean com.baidu.android.pushservice.h.u.x(Context, String)>
	//  270  585:ifeq            591
	//* 271  588:goto            684
_L20:
		if(((com.baidu.android.pushservice.message.b) (obj1)).n != l.p.a()) goto _L22; else goto _L21
	//  272  591:aload           10
	//  273  593:getfield        #465 <Field int com.baidu.android.pushservice.message.b.n>
	//  274  596:getstatic       #482 <Field l l.p>
	//  275  599:invokevirtual   #461 <Method int l.a()>
	//  276  602:icmpne          612
_L21:
		com.baidu.android.pushservice.h.u.D(context);
	//  277  605:aload_1         
	//  278  606:invokestatic    #485 <Method void com.baidu.android.pushservice.h.u.D(Context)>
		  goto _L17
	//* 279  609:goto            2818
_L22:
		if(((com.baidu.android.pushservice.message.b) (obj1)).n != l.o.a()) goto _L24; else goto _L23
	//  280  612:aload           10
	//  281  614:getfield        #465 <Field int com.baidu.android.pushservice.message.b.n>
	//  282  617:getstatic       #488 <Field l l.o>
	//  283  620:invokevirtual   #461 <Method int l.a()>
	//  284  623:icmpne          633
_L23:
		com.baidu.android.pushservice.h.u.E(context);
	//  285  626:aload_1         
	//  286  627:invokestatic    #491 <Method void com.baidu.android.pushservice.h.u.E(Context)>
		  goto _L17
	//* 287  630:goto            2818
_L24:
		if(((com.baidu.android.pushservice.message.b) (obj1)).n != l.g.a() && ((com.baidu.android.pushservice.message.b) (obj1)).n != l.b.a()) goto _L26; else goto _L25
	//  288  633:aload           10
	//  289  635:getfield        #465 <Field int com.baidu.android.pushservice.message.b.n>
	//  290  638:getstatic       #494 <Field l l.g>
	//  291  641:invokevirtual   #461 <Method int l.a()>
	//  292  644:icmpeq          664
	//  293  647:aload           10
	//  294  649:getfield        #465 <Field int com.baidu.android.pushservice.message.b.n>
	//  295  652:getstatic       #459 <Field l l.b>
	//  296  655:invokevirtual   #461 <Method int l.a()>
	//  297  658:icmpne          2823
	//* 298  661:goto            664
_L25:
		onMessage(context, ((String) (obj)), ((String) (null)));
	//  299  664:aload_0         
	//  300  665:aload_1         
	//  301  666:aload           9
	//  302  668:aconst_null     
	//  303  669:invokevirtual   #508 <Method void onMessage(Context, String, String)>
		com.baidu.android.pushservice.e.a.c(TAG, "receive HWPassthrough Message");
	//  304  672:getstatic       #45  <Field String TAG>
	//  305  675:ldc2            #729 <String "receive HWPassthrough Message">
	//  306  678:invokestatic    #220 <Method void a.c(String, String)>
		  goto _L17
	//* 307  681:goto            2818
_L19:
		String s2 = ((com.baidu.android.pushservice.message.b) (obj1)).m;
	//  308  684:aload           10
	//  309  686:getfield        #242 <Field String com.baidu.android.pushservice.message.b.m>
	//  310  689:astore          11
		k = ((com.baidu.android.pushservice.message.b) (obj1)).j;
	//  311  691:aload           10
	//  312  693:getfield        #534 <Field int com.baidu.android.pushservice.message.b.j>
	//  313  696:istore          4
		StringBuilder stringbuilder8 = new StringBuilder();
	//  314  698:new             #47  <Class StringBuilder>
	//  315  701:dup             
	//  316  702:invokespecial   #48  <Method void StringBuilder()>
	//  317  705:astore          12
		stringbuilder8.append(((com.baidu.android.pushservice.message.b) (obj1)).k);
	//  318  707:aload           12
	//  319  709:aload           10
	//  320  711:getfield        #537 <Field String com.baidu.android.pushservice.message.b.k>
	//  321  714:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//  322  717:pop             
		stringbuilder8.append("");
	//  323  718:aload           12
	//  324  720:ldc2            #539 <String "">
	//  325  723:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//  326  726:pop             
		com.baidu.android.pushservice.h.f.a(context, s2, i, k, stringbuilder8.toString(), 1);
	//  327  727:aload_1         
	//  328  728:aload           11
	//  329  730:iload_3         
	//  330  731:iload           4
	//  331  733:aload           12
	//  332  735:invokevirtual   #66  <Method String StringBuilder.toString()>
	//  333  738:iconst_1        
	//  334  739:invokestatic    #544 <Method void com.baidu.android.pushservice.h.f.a(Context, String, int, int, String, int)>
		context = ((Context) (TAG));
	//  335  742:getstatic       #45  <Field String TAG>
	//  336  745:astore_1        
		obj1 = ((Object) (new StringBuilder()));
	//  337  746:new             #47  <Class StringBuilder>
	//  338  749:dup             
	//  339  750:invokespecial   #48  <Method void StringBuilder()>
	//  340  753:astore          10
		((StringBuilder) (obj1)).append("receive huawei passthrough message  =  ");
	//  341  755:aload           10
	//  342  757:ldc2            #731 <String "receive huawei passthrough message  =  ">
	//  343  760:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//  344  763:pop             
		((StringBuilder) (obj1)).append(((String) (obj)));
	//  345  764:aload           10
	//  346  766:aload           9
	//  347  768:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//  348  771:pop             
		((StringBuilder) (obj1)).append("   DeviceToken = ");
	//  349  772:aload           10
	//  350  774:ldc2            #733 <String "   DeviceToken = ">
	//  351  777:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//  352  780:pop             
		((StringBuilder) (obj1)).append(((String) (intent)));
	//  353  781:aload           10
	//  354  783:aload_2         
	//  355  784:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//  356  787:pop             
		com.baidu.android.pushservice.e.a.c(((String) (context)), ((StringBuilder) (obj1)).toString());
	//  357  788:aload_1         
	//  358  789:aload           10
	//  359  791:invokevirtual   #66  <Method String StringBuilder.toString()>
	//  360  794:invokestatic    #220 <Method void a.c(String, String)>
		return;
	//  361  797:return          
_L16:
		if(((String) (obj)).equals("com.xiaomi.mipush.RECEIVE_MESSAGE"))
	//* 362  798:aload           9
	//* 363  800:ldc2            #735 <String "com.xiaomi.mipush.RECEIVE_MESSAGE">
	//* 364  803:invokevirtual   #195 <Method boolean String.equals(Object)>
	//* 365  806:ifeq            874
		{
			obj1 = ((Object) (TAG));
	//  366  809:getstatic       #45  <Field String TAG>
	//  367  812:astore          10
			StringBuilder stringbuilder6 = new StringBuilder();
	//  368  814:new             #47  <Class StringBuilder>
	//  369  817:dup             
	//  370  818:invokespecial   #48  <Method void StringBuilder()>
	//  371  821:astore          11
			stringbuilder6.append("XM> action = ");
	//  372  823:aload           11
	//  373  825:ldc2            #737 <String "XM> action = ">
	//  374  828:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//  375  831:pop             
			stringbuilder6.append(((String) (obj)));
	//  376  832:aload           11
	//  377  834:aload           9
	//  378  836:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//  379  839:pop             
			com.baidu.android.pushservice.e.a.b(((String) (obj1)), stringbuilder6.toString());
	//  380  840:aload           10
	//  381  842:aload           11
	//  382  844:invokevirtual   #66  <Method String StringBuilder.toString()>
	//  383  847:invokestatic    #79  <Method void a.b(String, String)>
			if(!ModeConfig.isXiaomiProxyMode(context))
	//* 384  850:aload_1         
	//* 385  851:invokestatic    #740 <Method boolean ModeConfig.isXiaomiProxyMode(Context)>
	//* 386  854:ifne            867
			{
				com.baidu.android.pushservice.e.a.d(TAG, "XM> not xiaomi proxy mode! ");
	//  387  857:getstatic       #45  <Field String TAG>
	//  388  860:ldc2            #742 <String "XM> not xiaomi proxy mode! ">
	//  389  863:invokestatic    #72  <Method void a.d(String, String)>
				return;
	//  390  866:return          
			} else
			{
				handleXiaoMiMessage(intent, context);
	//  391  867:aload_0         
	//  392  868:aload_2         
	//  393  869:aload_1         
	//  394  870:invokespecial   #744 <Method void handleXiaoMiMessage(Intent, Context)>
				return;
	//  395  873:return          
			}
		}
		if(((String) (obj)).equals("com.xiaomi.mipush.MESSAGE_ARRIVED"))
	//* 396  874:aload           9
	//* 397  876:ldc2            #746 <String "com.xiaomi.mipush.MESSAGE_ARRIVED">
	//* 398  879:invokevirtual   #195 <Method boolean String.equals(Object)>
	//* 399  882:ifeq            2769
		{
			obj1 = ((Object) (TAG));
	//  400  885:getstatic       #45  <Field String TAG>
	//  401  888:astore          10
			StringBuilder stringbuilder7 = new StringBuilder();
	//  402  890:new             #47  <Class StringBuilder>
	//  403  893:dup             
	//  404  894:invokespecial   #48  <Method void StringBuilder()>
	//  405  897:astore          11
			stringbuilder7.append("XM> action = ");
	//  406  899:aload           11
	//  407  901:ldc2            #737 <String "XM> action = ">
	//  408  904:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//  409  907:pop             
			stringbuilder7.append(((String) (obj)));
	//  410  908:aload           11
	//  411  910:aload           9
	//  412  912:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//  413  915:pop             
			com.baidu.android.pushservice.e.a.b(((String) (obj1)), stringbuilder7.toString());
	//  414  916:aload           10
	//  415  918:aload           11
	//  416  920:invokevirtual   #66  <Method String StringBuilder.toString()>
	//  417  923:invokestatic    #79  <Method void a.b(String, String)>
			if(!ModeConfig.isXiaomiProxyMode(context))
	//* 418  926:aload_1         
	//* 419  927:invokestatic    #740 <Method boolean ModeConfig.isXiaomiProxyMode(Context)>
	//* 420  930:ifne            943
			{
				com.baidu.android.pushservice.e.a.d(TAG, "XM> not xiaomi proxy mode! ");
	//  421  933:getstatic       #45  <Field String TAG>
	//  422  936:ldc2            #742 <String "XM> not xiaomi proxy mode! ">
	//  423  939:invokestatic    #72  <Method void a.d(String, String)>
				return;
	//  424  942:return          
			} else
			{
				handleXiaomiMessageCallBack(context, (MiPushMessage)f.a(context).a(intent), com.baidu.android.pushservice.b.a(com.baidu.android.pushservice.b.b));
	//  425  943:aload_0         
	//  426  944:aload_1         
	//  427  945:aload_1         
	//  428  946:invokestatic    #353 <Method f f.a(Context)>
	//  429  949:aload_2         
	//  430  950:invokevirtual   #356 <Method com.xiaomi.mipush.sdk.PushMessageHandler$a f.a(Intent)>
	//  431  953:checkcast       #164 <Class MiPushMessage>
	//  432  956:getstatic       #512 <Field PushMessageReceiver$b com.baidu.android.pushservice.PushMessageReceiver$b.b>
	//  433  959:invokestatic    #367 <Method int com.baidu.android.pushservice.PushMessageReceiver$b.a(PushMessageReceiver$b)>
	//  434  962:invokespecial   #371 <Method void handleXiaomiMessageCallBack(Context, MiPushMessage, int)>
				return;
	//  435  965:return          
			}
		}
		  goto _L9
_L5:
		obj1 = ((Object) (intent.getStringExtra("method")));
	//  436  966:aload_2         
	//  437  967:ldc2            #748 <String "method">
	//  438  970:invokevirtual   #408 <Method String Intent.getStringExtra(String)>
	//  439  973:astore          10
		if(TextUtils.isEmpty(((CharSequence) (obj1))))
	//* 440  975:aload           10
	//* 441  977:invokestatic    #190 <Method boolean TextUtils.isEmpty(CharSequence)>
	//* 442  980:ifeq            984
			return;
	//  443  983:return          
		i = intent.getIntExtra("error_msg", 0);
	//  444  984:aload_2         
	//  445  985:ldc2            #750 <String "error_msg">
	//  446  988:iconst_0        
	//  447  989:invokevirtual   #296 <Method int Intent.getIntExtra(String, int)>
	//  448  992:istore_3        
		obj = "";
	//  449  993:ldc2            #539 <String "">
	//  450  996:astore          9
		if(intent.getByteArrayExtra("content") != null)
	//* 451  998:aload_2         
	//* 452  999:ldc2            #752 <String "content">
	//* 453 1002:invokevirtual   #396 <Method byte[] Intent.getByteArrayExtra(String)>
	//* 454 1005:ifnull          1024
			obj = ((Object) (new String(intent.getByteArrayExtra("content"))));
	//  455 1008:new             #182 <Class String>
	//  456 1011:dup             
	//  457 1012:aload_2         
	//  458 1013:ldc2            #752 <String "content">
	//  459 1016:invokevirtual   #396 <Method byte[] Intent.getByteArrayExtra(String)>
	//  460 1019:invokespecial   #753 <Method void String(byte[])>
	//  461 1022:astore          9
		if(!((String) (obj1)).equals("com.baidu.android.pushservice.action.notification.ARRIVED")) goto _L28; else goto _L27
	//  462 1024:aload           10
	//  463 1026:ldc2            #755 <String "com.baidu.android.pushservice.action.notification.ARRIVED">
	//  464 1029:invokevirtual   #195 <Method boolean String.equals(Object)>
	//  465 1032:ifeq            1094
_L27:
		obj = ((Object) (intent.getStringExtra("notification_title")));
	//  466 1035:aload_2         
	//  467 1036:ldc2            #664 <String "notification_title">
	//  468 1039:invokevirtual   #408 <Method String Intent.getStringExtra(String)>
	//  469 1042:astore          9
		obj1 = ((Object) (intent.getStringExtra("notification_content")));
	//  470 1044:aload_2         
	//  471 1045:ldc2            #666 <String "notification_content">
	//  472 1048:invokevirtual   #408 <Method String Intent.getStringExtra(String)>
	//  473 1051:astore          10
		String s3 = intent.getStringExtra("extra_extra_custom_content");
	//  474 1053:aload_2         
	//  475 1054:ldc2            #668 <String "extra_extra_custom_content">
	//  476 1057:invokevirtual   #408 <Method String Intent.getStringExtra(String)>
	//  477 1060:astore          11
		if(com.baidu.android.pushservice.h.u.a(context, intent.getStringExtra("com.baidu.pushservice.app_id"), ((String) (obj)), ((String) (obj1)), s3))
	//* 478 1062:aload_1         
	//* 479 1063:aload_2         
	//* 480 1064:ldc2            #670 <String "com.baidu.pushservice.app_id">
	//* 481 1067:invokevirtual   #408 <Method String Intent.getStringExtra(String)>
	//* 482 1070:aload           9
	//* 483 1072:aload           10
	//* 484 1074:aload           11
	//* 485 1076:invokestatic    #673 <Method boolean com.baidu.android.pushservice.h.u.a(Context, String, String, String, String)>
	//* 486 1079:ifeq            2769
		{
			onNotificationArrived(context, ((String) (obj)), ((String) (obj1)), s3);
	//  487 1082:aload_0         
	//  488 1083:aload_1         
	//  489 1084:aload           9
	//  490 1086:aload           10
	//  491 1088:aload           11
	//  492 1090:invokevirtual   #522 <Method void onNotificationArrived(Context, String, String, String)>
			return;
	//  493 1093:return          
		}
		  goto _L9
_L28:
		if(!((String) (obj1)).equals("method_bind") && !((String) (obj1)).equals("method_deal_lapp_bind_intent")) goto _L30; else goto _L29
	//  494 1094:aload           10
	//  495 1096:ldc2            #757 <String "method_bind">
	//  496 1099:invokevirtual   #195 <Method boolean String.equals(Object)>
	//  497 1102:ifne            1790
	//  498 1105:aload           10
	//  499 1107:ldc2            #759 <String "method_deal_lapp_bind_intent">
	//  500 1110:invokevirtual   #195 <Method boolean String.equals(Object)>
	//  501 1113:ifeq            1119
	//* 502 1116:goto            1790
_L30:
		if(!((String) (obj1)).equals("method_unbind") && !((String) (obj1)).equals("method_lapp_unbind")) goto _L32; else goto _L31
	//  503 1119:aload           10
	//  504 1121:ldc2            #761 <String "method_unbind">
	//  505 1124:invokevirtual   #195 <Method boolean String.equals(Object)>
	//  506 1127:ifne            1647
	//  507 1130:aload           10
	//  508 1132:ldc2            #763 <String "method_lapp_unbind">
	//  509 1135:invokevirtual   #195 <Method boolean String.equals(Object)>
	//  510 1138:ifeq            1144
	//* 511 1141:goto            1647
_L32:
		if(((String) (obj1)).equals("method_get_lapp_bind_state"))
	//* 512 1144:aload           10
	//* 513 1146:ldc2            #765 <String "method_get_lapp_bind_state">
	//* 514 1149:invokevirtual   #195 <Method boolean String.equals(Object)>
	//* 515 1152:ifeq            1177
		{
			onCheckBindState(context, i, intent.getStringExtra("secret_key"), intent.getBooleanExtra("lapp_bind_state", false));
	//  516 1155:aload_0         
	//  517 1156:aload_1         
	//  518 1157:iload_3         
	//  519 1158:aload_2         
	//  520 1159:ldc2            #767 <String "secret_key">
	//  521 1162:invokevirtual   #408 <Method String Intent.getStringExtra(String)>
	//  522 1165:aload_2         
	//  523 1166:ldc2            #769 <String "lapp_bind_state">
	//  524 1169:iconst_0        
	//  525 1170:invokevirtual   #402 <Method boolean Intent.getBooleanExtra(String, boolean)>
	//  526 1173:invokevirtual   #771 <Method void onCheckBindState(Context, int, String, boolean)>
			return;
	//  527 1176:return          
		}
		if(!((String) (obj1)).equals("method_set_tags") && !((String) (obj1)).equals("method_set_lapp_tags")) goto _L34; else goto _L33
	//  528 1177:aload           10
	//  529 1179:ldc2            #773 <String "method_set_tags">
	//  530 1182:invokevirtual   #195 <Method boolean String.equals(Object)>
	//  531 1185:ifne            1449
	//  532 1188:aload           10
	//  533 1190:ldc2            #775 <String "method_set_lapp_tags">
	//  534 1193:invokevirtual   #195 <Method boolean String.equals(Object)>
	//  535 1196:ifeq            1202
	//* 536 1199:goto            1449
_L34:
		if(!((String) (obj1)).equals("method_del_tags") && !((String) (obj1)).equals("method_del_lapp_tags")) goto _L36; else goto _L35
	//  537 1202:aload           10
	//  538 1204:ldc2            #777 <String "method_del_tags">
	//  539 1207:invokevirtual   #195 <Method boolean String.equals(Object)>
	//  540 1210:ifne            1291
	//  541 1213:aload           10
	//  542 1215:ldc2            #779 <String "method_del_lapp_tags">
	//  543 1218:invokevirtual   #195 <Method boolean String.equals(Object)>
	//  544 1221:ifeq            1227
	//* 545 1224:goto            1291
_L36:
		if(((String) (obj1)).equals("method_listtags") || ((String) (obj1)).equals("method_list_lapp_tags"))
	//* 546 1227:aload           10
	//* 547 1229:ldc2            #781 <String "method_listtags">
	//* 548 1232:invokevirtual   #195 <Method boolean String.equals(Object)>
	//* 549 1235:ifne            1249
	//* 550 1238:aload           10
	//* 551 1240:ldc2            #783 <String "method_list_lapp_tags">
	//* 552 1243:invokevirtual   #195 <Method boolean String.equals(Object)>
	//* 553 1246:ifeq            2769
		{
			try
			{
				obj = ((Object) ((new JSONObject(((String) (obj)))).getString("request_id")));
	//  554 1249:new             #549 <Class JSONObject>
	//  555 1252:dup             
	//  556 1253:aload           9
	//  557 1255:invokespecial   #552 <Method void JSONObject(String)>
	//  558 1258:ldc2            #785 <String "request_id">
	//  559 1261:invokevirtual   #788 <Method String JSONObject.getString(String)>
	//  560 1264:astore          9
				onListTags(context, i, ((List) (intent.getStringArrayListExtra("tags_list"))), ((String) (obj)));
	//  561 1266:aload_0         
	//  562 1267:aload_1         
	//  563 1268:iload_3         
	//  564 1269:aload_2         
	//  565 1270:ldc2            #790 <String "tags_list">
	//  566 1273:invokevirtual   #794 <Method ArrayList Intent.getStringArrayListExtra(String)>
	//  567 1276:aload           9
	//  568 1278:invokevirtual   #796 <Method void onListTags(Context, int, List, String)>
				return;
	//  569 1281:return          
			}
	//* 570 1282:aload_0         
	//* 571 1283:aload_1         
	//* 572 1284:iload_3         
	//* 573 1285:aconst_null     
	//* 574 1286:aconst_null     
	//* 575 1287:invokevirtual   #796 <Method void onListTags(Context, int, List, String)>
	//* 576 1290:return          
	//* 577 1291:new             #549 <Class JSONObject>
	//* 578 1294:dup             
	//* 579 1295:aload           9
	//* 580 1297:invokespecial   #552 <Method void JSONObject(String)>
	//* 581 1300:astore          9
	//* 582 1302:aload           9
	//* 583 1304:ldc2            #785 <String "request_id">
	//* 584 1307:invokevirtual   #788 <Method String JSONObject.getString(String)>
	//* 585 1310:astore_2        
	//* 586 1311:aload           9
	//* 587 1313:ldc2            #798 <String "response_params">
	//* 588 1316:invokevirtual   #802 <Method JSONObject JSONObject.getJSONObject(String)>
	//* 589 1319:astore          9
	//* 590 1321:aload           9
	//* 591 1323:ifnonnull       1327
	//* 592 1326:return          
	//* 593 1327:aload           9
	//* 594 1329:ldc2            #804 <String "details">
	//* 595 1332:invokevirtual   #808 <Method JSONArray JSONObject.getJSONArray(String)>
	//* 596 1335:astore          9
	//* 597 1337:aload           9
	//* 598 1339:ifnonnull       1343
	//* 599 1342:return          
	//* 600 1343:new             #810 <Class ArrayList>
	//* 601 1346:dup             
	//* 602 1347:invokespecial   #811 <Method void ArrayList()>
	//* 603 1350:astore          10
	//* 604 1352:new             #810 <Class ArrayList>
	//* 605 1355:dup             
	//* 606 1356:invokespecial   #811 <Method void ArrayList()>
	//* 607 1359:astore          11
	//* 608 1361:iload           4
	//* 609 1363:aload           9
	//* 610 1365:invokevirtual   #816 <Method int JSONArray.length()>
	//* 611 1368:icmpge          1427
	//* 612 1371:aload           9
	//* 613 1373:iload           4
	//* 614 1375:invokevirtual   #819 <Method JSONObject JSONArray.getJSONObject(int)>
	//* 615 1378:astore          12
	//* 616 1380:aload           12
	//* 617 1382:ldc2            #821 <String "tag">
	//* 618 1385:invokevirtual   #788 <Method String JSONObject.getString(String)>
	//* 619 1388:astore          13
	//* 620 1390:aload           12
	//* 621 1392:ldc2            #823 <String "result">
	//* 622 1395:invokevirtual   #827 <Method int JSONObject.getInt(String)>
	//* 623 1398:ifne            1414
	//* 624 1401:aload           10
	//* 625 1403:aload           13
	//* 626 1405:invokeinterface #830 <Method boolean List.add(Object)>
	//* 627 1410:pop             
	//* 628 1411:goto            2829
	//* 629 1414:aload           11
	//* 630 1416:aload           13
	//* 631 1418:invokeinterface #830 <Method boolean List.add(Object)>
	//* 632 1423:pop             
	//* 633 1424:goto            2829
	//* 634 1427:aload_0         
	//* 635 1428:aload_1         
	//* 636 1429:iload_3         
	//* 637 1430:aload           10
	//* 638 1432:aload           11
	//* 639 1434:aload_2         
	//* 640 1435:invokevirtual   #832 <Method void onDelTags(Context, int, List, List, String)>
	//* 641 1438:return          
	//* 642 1439:aload_0         
	//* 643 1440:aload_1         
	//* 644 1441:iload_3         
	//* 645 1442:aconst_null     
	//* 646 1443:aconst_null     
	//* 647 1444:aconst_null     
	//* 648 1445:invokevirtual   #832 <Method void onDelTags(Context, int, List, List, String)>
	//* 649 1448:return          
	//* 650 1449:new             #549 <Class JSONObject>
	//* 651 1452:dup             
	//* 652 1453:aload           9
	//* 653 1455:invokespecial   #552 <Method void JSONObject(String)>
	//* 654 1458:astore          9
	//* 655 1460:aload           9
	//* 656 1462:ldc2            #785 <String "request_id">
	//* 657 1465:invokevirtual   #788 <Method String JSONObject.getString(String)>
	//* 658 1468:astore_2        
	//* 659 1469:aload           9
	//* 660 1471:ldc2            #750 <String "error_msg">
	//* 661 1474:invokevirtual   #835 <Method String JSONObject.optString(String)>
	//* 662 1477:invokestatic    #190 <Method boolean TextUtils.isEmpty(CharSequence)>
	//* 663 1480:ifne            1505
	//* 664 1483:aload_0         
	//* 665 1484:aload_1         
	//* 666 1485:iload_3         
	//* 667 1486:new             #810 <Class ArrayList>
	//* 668 1489:dup             
	//* 669 1490:invokespecial   #811 <Method void ArrayList()>
	//* 670 1493:new             #810 <Class ArrayList>
	//* 671 1496:dup             
	//* 672 1497:invokespecial   #811 <Method void ArrayList()>
	//* 673 1500:aload_2         
	//* 674 1501:invokevirtual   #838 <Method void onSetTags(Context, int, List, List, String)>
	//* 675 1504:return          
	//* 676 1505:aload           9
	//* 677 1507:ldc2            #798 <String "response_params">
	//* 678 1510:invokevirtual   #841 <Method JSONObject JSONObject.optJSONObject(String)>
	//* 679 1513:astore          9
	//* 680 1515:aload           9
	//* 681 1517:ifnonnull       1521
	//* 682 1520:return          
	//* 683 1521:aload           9
	//* 684 1523:ldc2            #804 <String "details">
	//* 685 1526:invokevirtual   #808 <Method JSONArray JSONObject.getJSONArray(String)>
	//* 686 1529:astore          9
	//* 687 1531:aload           9
	//* 688 1533:ifnonnull       1537
	//* 689 1536:return          
	//* 690 1537:new             #810 <Class ArrayList>
	//* 691 1540:dup             
	//* 692 1541:invokespecial   #811 <Method void ArrayList()>
	//* 693 1544:astore          10
	//* 694 1546:new             #810 <Class ArrayList>
	//* 695 1549:dup             
	//* 696 1550:invokespecial   #811 <Method void ArrayList()>
	//* 697 1553:astore          11
	//* 698 1555:iload           5
	//* 699 1557:istore          4
	//* 700 1559:iload           4
	//* 701 1561:aload           9
	//* 702 1563:invokevirtual   #816 <Method int JSONArray.length()>
	//* 703 1566:icmpge          1625
	//* 704 1569:aload           9
	//* 705 1571:iload           4
	//* 706 1573:invokevirtual   #819 <Method JSONObject JSONArray.getJSONObject(int)>
	//* 707 1576:astore          12
	//* 708 1578:aload           12
	//* 709 1580:ldc2            #821 <String "tag">
	//* 710 1583:invokevirtual   #788 <Method String JSONObject.getString(String)>
	//* 711 1586:astore          13
	//* 712 1588:aload           12
	//* 713 1590:ldc2            #823 <String "result">
	//* 714 1593:invokevirtual   #827 <Method int JSONObject.getInt(String)>
	//* 715 1596:ifne            1612
	//* 716 1599:aload           10
	//* 717 1601:aload           13
	//* 718 1603:invokeinterface #830 <Method boolean List.add(Object)>
	//* 719 1608:pop             
	//* 720 1609:goto            2838
	//* 721 1612:aload           11
	//* 722 1614:aload           13
	//* 723 1616:invokeinterface #830 <Method boolean List.add(Object)>
	//* 724 1621:pop             
	//* 725 1622:goto            2838
	//* 726 1625:aload_0         
	//* 727 1626:aload_1         
	//* 728 1627:iload_3         
	//* 729 1628:aload           10
	//* 730 1630:aload           11
	//* 731 1632:aload_2         
	//* 732 1633:invokevirtual   #838 <Method void onSetTags(Context, int, List, List, String)>
	//* 733 1636:return          
	//* 734 1637:aload_0         
	//* 735 1638:aload_1         
	//* 736 1639:iload_3         
	//* 737 1640:aconst_null     
	//* 738 1641:aconst_null     
	//* 739 1642:aconst_null     
	//* 740 1643:invokevirtual   #838 <Method void onSetTags(Context, int, List, List, String)>
	//* 741 1646:return          
	//* 742 1647:aload_1         
	//* 743 1648:ldc2            #843 <String "bindcache">
	//* 744 1651:iconst_0        
	//* 745 1652:invokevirtual   #847 <Method SharedPreferences Context.getSharedPreferences(String, int)>
	//* 746 1655:invokeinterface #853 <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//* 747 1660:astore_2        
	//* 748 1661:aload_0         
	//* 749 1662:aload_1         
	//* 750 1663:iload_3         
	//* 751 1664:new             #549 <Class JSONObject>
	//* 752 1667:dup             
	//* 753 1668:aload           9
	//* 754 1670:invokespecial   #552 <Method void JSONObject(String)>
	//* 755 1673:ldc2            #785 <String "request_id">
	//* 756 1676:invokevirtual   #788 <Method String JSONObject.getString(String)>
	//* 757 1679:invokevirtual   #857 <Method void onUnbind(Context, int, String)>
	//* 758 1682:aload_2         
	//* 759 1683:ldc2            #859 <String "bind_status">
	//* 760 1686:iconst_0        
	//* 761 1687:invokeinterface #865 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putBoolean(String, boolean)>
	//* 762 1692:pop             
	//* 763 1693:aload_2         
	//* 764 1694:invokeinterface #868 <Method boolean android.content.SharedPreferences$Editor.commit()>
	//* 765 1699:pop             
	//* 766 1700:goto            1728
	//* 767 1703:aload_0         
	//* 768 1704:aload_1         
	//* 769 1705:iload_3         
	//* 770 1706:aconst_null     
	//* 771 1707:invokevirtual   #857 <Method void onUnbind(Context, int, String)>
	//* 772 1710:aload_2         
	//* 773 1711:ldc2            #859 <String "bind_status">
	//* 774 1714:iconst_0        
	//* 775 1715:invokeinterface #865 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putBoolean(String, boolean)>
	//* 776 1720:pop             
	//* 777 1721:aload_2         
	//* 778 1722:invokeinterface #868 <Method boolean android.content.SharedPreferences$Editor.commit()>
	//* 779 1727:pop             
	//* 780 1728:aload_1         
	//* 781 1729:invokestatic    #740 <Method boolean ModeConfig.isXiaomiProxyMode(Context)>
	//* 782 1732:ifeq            1748
	//* 783 1735:aload_1         
	//* 784 1736:invokestatic    #873 <Method void MiPushClient.unregisterPush(Context)>
	//* 785 1739:getstatic       #45  <Field String TAG>
	//* 786 1742:ldc2            #875 <String "XM> MiPushClient.unregisterPush is call!!!">
	//* 787 1745:invokestatic    #79  <Method void a.b(String, String)>
	//* 788 1748:new             #47  <Class StringBuilder>
	//* 789 1751:dup             
	//* 790 1752:invokespecial   #48  <Method void StringBuilder()>
	//* 791 1755:astore_2        
	//* 792 1756:aload_2         
	//* 793 1757:ldc2            #877 <String "unbind from">
	//* 794 1760:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//* 795 1763:pop             
	//* 796 1764:aload_2         
	//* 797 1765:aload_1         
	//* 798 1766:invokevirtual   #204 <Method String Context.getPackageName()>
	//* 799 1769:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//* 800 1772:pop             
	//* 801 1773:aload_2         
	//* 802 1774:ldc2            #879 <String " errorCode ">
	//* 803 1777:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//* 804 1780:pop             
	//* 805 1781:aload_2         
	//* 806 1782:iload_3         
	//* 807 1783:invokevirtual   #301 <Method StringBuilder StringBuilder.append(int)>
	//* 808 1786:pop             
	//* 809 1787:goto            2590
	//* 810 1790:invokestatic    #883 <Method int com.baidu.android.pushservice.a.b()>
	//* 811 1793:ifle            1807
	//* 812 1796:aload_1         
	//* 813 1797:ldc2            #885 <String "039905">
	//* 814 1800:iload_3         
	//* 815 1801:aload           9
	//* 816 1803:invokestatic    #890 <Method long p.a(Context, String, int, String)>
	//* 817 1806:pop2            
	//* 818 1807:iload_3         
	//* 819 1808:ifne            2522
	//* 820 1811:aload           9
	//* 821 1813:invokestatic    #190 <Method boolean TextUtils.isEmpty(CharSequence)>
	//* 822 1816:ifne            2522
	//* 823 1819:new             #549 <Class JSONObject>
	//* 824 1822:dup             
	//* 825 1823:aload           9
	//* 826 1825:invokespecial   #552 <Method void JSONObject(String)>
	//* 827 1828:astore          9
	//* 828 1830:aload           9
	//* 829 1832:ldc2            #785 <String "request_id">
	//* 830 1835:invokevirtual   #788 <Method String JSONObject.getString(String)>
	//* 831 1838:astore          11
	//* 832 1840:aload           9
	//* 833 1842:ldc2            #798 <String "response_params">
	//* 834 1845:invokevirtual   #802 <Method JSONObject JSONObject.getJSONObject(String)>
	//* 835 1848:astore          9
	//* 836 1850:aload           9
	//* 837 1852:ldc2            #892 <String "appid">
	//* 838 1855:invokevirtual   #788 <Method String JSONObject.getString(String)>
	//* 839 1858:astore          12
	//* 840 1860:aload_1         
	//* 841 1861:aload           12
	//* 842 1863:invokestatic    #896 <Method void com.baidu.android.pushservice.PushSettings.b(Context, String)>
	//* 843 1866:aload           9
	//* 844 1868:ldc2            #898 <String "channel_id">
	//* 845 1871:invokevirtual   #788 <Method String JSONObject.getString(String)>
	//* 846 1874:astore          13
	//* 847 1876:aload           9
	//* 848 1878:ldc2            #900 <String "user_id">
	//* 849 1881:invokevirtual   #788 <Method String JSONObject.getString(String)>
	//* 850 1884:astore          14
	//* 851 1886:lconst_0        
	//* 852 1887:lstore          7
	//* 853 1889:aload_2         
	//* 854 1890:ldc2            #902 <String "real_bind">
	//* 855 1893:invokevirtual   #905 <Method boolean Intent.hasExtra(String)>
	//* 856 1896:istore          6
	//* 857 1898:iload           6
	//* 858 1900:ifeq            1940
	//* 859 1903:invokestatic    #434 <Method long System.currentTimeMillis()>
	//* 860 1906:lstore          7
	//* 861 1908:aload_2         
	//* 862 1909:ldc2            #907 <String "access_token">
	//* 863 1912:invokevirtual   #408 <Method String Intent.getStringExtra(String)>
	//* 864 1915:astore          9
	//* 865 1917:aload_2         
	//* 866 1918:ldc2            #767 <String "secret_key">
	//* 867 1921:invokevirtual   #408 <Method String Intent.getStringExtra(String)>
	//* 868 1924:astore          10
	//* 869 1926:aload           9
	//* 870 1928:astore_2        
	//* 871 1929:aload           10
	//* 872 1931:astore          9
	//* 873 1933:goto            1945
	//* 874 1936:astore_2        
	//* 875 1937:goto            2406
	//* 876 1940:aconst_null     
	//* 877 1941:astore_2        
	//* 878 1942:aload_2         
	//* 879 1943:astore          9
	//* 880 1945:aload_1         
	//* 881 1946:aload           12
	//* 882 1948:aload           13
	//* 883 1950:aload           11
	//* 884 1952:aload           14
	//* 885 1954:iconst_1        
	//* 886 1955:aload_1         
	//* 887 1956:aload_1         
	//* 888 1957:invokevirtual   #204 <Method String Context.getPackageName()>
	//* 889 1960:invokestatic    #910 <Method int com.baidu.android.pushservice.h.u.d(Context, String)>
	//* 890 1963:lload           7
	//* 891 1965:aload_2         
	//* 892 1966:aload           9
	//* 893 1968:invokestatic    #913 <Method void m.a(Context, String, String, String, String, boolean, int, long, String, String)>
	//* 894 1971:iload_3         
	//* 895 1972:istore          4
	//* 896 1974:aload_0         
	//* 897 1975:aload_1         
	//* 898 1976:iload_3         
	//* 899 1977:aload           12
	//* 900 1979:aload           14
	//* 901 1981:aload           13
	//* 902 1983:aload           11
	//* 903 1985:invokevirtual   #915 <Method void onBind(Context, int, String, String, String, String)>
	//* 904 1988:getstatic       #45  <Field String TAG>
	//* 905 1991:astore_2        
	//* 906 1992:new             #47  <Class StringBuilder>
	//* 907 1995:dup             
	//* 908 1996:invokespecial   #48  <Method void StringBuilder()>
	//* 909 1999:astore          9
	//* 910 2001:aload           9
	//* 911 2003:ldc2            #917 <String "PushMessageReceiver#onBind from">
	//* 912 2006:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//* 913 2009:pop             
	//* 914 2010:aload           9
	//* 915 2012:aload_1         
	//* 916 2013:invokevirtual   #204 <Method String Context.getPackageName()>
	//* 917 2016:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//* 918 2019:pop             
	//* 919 2020:aload           9
	//* 920 2022:ldc2            #919 <String ", errorCode= ">
	//* 921 2025:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//* 922 2028:pop             
	//* 923 2029:aload           9
	//* 924 2031:iload           4
	//* 925 2033:invokevirtual   #301 <Method StringBuilder StringBuilder.append(int)>
	//* 926 2036:pop             
	//* 927 2037:aload           9
	//* 928 2039:ldc2            #921 <String ", appid=  ">
	//* 929 2042:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//* 930 2045:pop             
	//* 931 2046:aload           9
	//* 932 2048:aload           12
	//* 933 2050:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//* 934 2053:pop             
	//* 935 2054:aload           9
	//* 936 2056:ldc2            #923 <String ", userId=">
	//* 937 2059:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//* 938 2062:pop             
	//* 939 2063:aload           9
	//* 940 2065:aload           14
	//* 941 2067:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//* 942 2070:pop             
	//* 943 2071:aload           9
	//* 944 2073:ldc2            #925 <String ", channelId=">
	//* 945 2076:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//* 946 2079:pop             
	//* 947 2080:aload           9
	//* 948 2082:aload           13
	//* 949 2084:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//* 950 2087:pop             
	//* 951 2088:aload           9
	//* 952 2090:ldc2            #927 <String ", requestId=">
	//* 953 2093:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//* 954 2096:pop             
	//* 955 2097:aload           9
	//* 956 2099:aload           11
	//* 957 2101:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//* 958 2104:pop             
	//* 959 2105:aload           9
	//* 960 2107:ldc2            #929 <String ", at time of ">
	//* 961 2110:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//* 962 2113:pop             
	//* 963 2114:aload           9
	//* 964 2116:invokestatic    #434 <Method long System.currentTimeMillis()>
	//* 965 2119:invokevirtual   #932 <Method StringBuilder StringBuilder.append(long)>
	//* 966 2122:pop             
	//* 967 2123:aload_2         
	//* 968 2124:aload           9
	//* 969 2126:invokevirtual   #66  <Method String StringBuilder.toString()>
	//* 970 2129:invokestatic    #220 <Method void a.c(String, String)>
	//* 971 2132:new             #47  <Class StringBuilder>
	//* 972 2135:dup             
	//* 973 2136:invokespecial   #48  <Method void StringBuilder()>
	//* 974 2139:astore_2        
	//* 975 2140:aload_2         
	//* 976 2141:ldc2            #917 <String "PushMessageReceiver#onBind from">
	//* 977 2144:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//* 978 2147:pop             
	//* 979 2148:aload_2         
	//* 980 2149:aload_1         
	//* 981 2150:invokevirtual   #204 <Method String Context.getPackageName()>
	//* 982 2153:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//* 983 2156:pop             
	//* 984 2157:aload_2         
	//* 985 2158:ldc2            #919 <String ", errorCode= ">
	//* 986 2161:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//* 987 2164:pop             
	//* 988 2165:aload_2         
	//* 989 2166:iload           4
	//* 990 2168:invokevirtual   #301 <Method StringBuilder StringBuilder.append(int)>
	//* 991 2171:pop             
	//* 992 2172:aload_2         
	//* 993 2173:ldc2            #921 <String ", appid=  ">
	//* 994 2176:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//* 995 2179:pop             
	//* 996 2180:aload_2         
	//* 997 2181:aload           12
	//* 998 2183:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//* 999 2186:pop             
	//*1000 2187:aload_2         
	//*1001 2188:ldc2            #923 <String ", userId=">
	//*1002 2191:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//*1003 2194:pop             
	//*1004 2195:aload_2         
	//*1005 2196:aload           14
	//*1006 2198:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//*1007 2201:pop             
	//*1008 2202:aload_2         
	//*1009 2203:ldc2            #925 <String ", channelId=">
	//*1010 2206:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//*1011 2209:pop             
	//*1012 2210:aload_2         
	//*1013 2211:aload           13
	//*1014 2213:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//*1015 2216:pop             
	//*1016 2217:aload_2         
	//*1017 2218:ldc2            #927 <String ", requestId=">
	//*1018 2221:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//*1019 2224:pop             
	//*1020 2225:aload_2         
	//*1021 2226:aload           11
	//*1022 2228:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//*1023 2231:pop             
	//*1024 2232:aload_2         
	//*1025 2233:ldc2            #929 <String ", at time of ">
	//*1026 2236:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//*1027 2239:pop             
	//*1028 2240:aload_2         
	//*1029 2241:invokestatic    #434 <Method long System.currentTimeMillis()>
	//*1030 2244:invokevirtual   #932 <Method StringBuilder StringBuilder.append(long)>
	//*1031 2247:pop             
	//*1032 2248:aload_2         
	//*1033 2249:invokevirtual   #66  <Method String StringBuilder.toString()>
	//*1034 2252:aload_1         
	//*1035 2253:invokestatic    #935 <Method void com.baidu.android.pushservice.h.u.b(String, Context)>
	//*1036 2256:new             #47  <Class StringBuilder>
	//*1037 2259:dup             
	//*1038 2260:invokespecial   #48  <Method void StringBuilder()>
	//*1039 2263:astore_2        
	//*1040 2264:aload_2         
	//*1041 2265:aload_1         
	//*1042 2266:invokevirtual   #204 <Method String Context.getPackageName()>
	//*1043 2269:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//*1044 2272:pop             
	//*1045 2273:aload_2         
	//*1046 2274:ldc2            #937 <String ",">
	//*1047 2277:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//*1048 2280:pop             
	//*1049 2281:aload_2         
	//*1050 2282:aload           12
	//*1051 2284:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//*1052 2287:pop             
	//*1053 2288:aload_2         
	//*1054 2289:ldc2            #937 <String ",">
	//*1055 2292:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//*1056 2295:pop             
	//*1057 2296:aload_2         
	//*1058 2297:aload           14
	//*1059 2299:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//*1060 2302:pop             
	//*1061 2303:aload_2         
	//*1062 2304:ldc2            #937 <String ",">
	//*1063 2307:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//*1064 2310:pop             
	//*1065 2311:aload_2         
	//*1066 2312:ldc2            #939 <String "false">
	//*1067 2315:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//*1068 2318:pop             
	//*1069 2319:aload_2         
	//*1070 2320:ldc2            #937 <String ",">
	//*1071 2323:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//*1072 2326:pop             
	//*1073 2327:aload_2         
	//*1074 2328:invokestatic    #942 <Method short com.baidu.android.pushservice.a.a()>
	//*1075 2331:invokevirtual   #301 <Method StringBuilder StringBuilder.append(int)>
	//*1076 2334:pop             
	//*1077 2335:aload_1         
	//*1078 2336:invokestatic    #947 <Method com.baidu.android.pushservice.b.b com.baidu.android.pushservice.b.b.a(Context)>
	//*1079 2339:aload_2         
	//*1080 2340:invokevirtual   #66  <Method String StringBuilder.toString()>
	//*1081 2343:invokevirtual   #949 <Method String com.baidu.android.pushservice.b.b.b(String)>
	//*1082 2346:astore_2        
	//*1083 2347:aload_1         
	//*1084 2348:aload_2         
	//*1085 2349:invokestatic    #953 <Method void q.g(Context, String)>
	//*1086 2352:aload_1         
	//*1087 2353:invokestatic    #956 <Method boolean com.baidu.android.pushservice.h.u.H(Context)>
	//*1088 2356:ifeq            2769
	//*1089 2359:new             #47  <Class StringBuilder>
	//*1090 2362:dup             
	//*1091 2363:invokespecial   #48  <Method void StringBuilder()>
	//*1092 2366:astore          9
	//*1093 2368:aload           9
	//*1094 2370:aload_1         
	//*1095 2371:invokevirtual   #204 <Method String Context.getPackageName()>
	//*1096 2374:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//*1097 2377:pop             
	//*1098 2378:aload           9
	//*1099 2380:ldc2            #958 <String ".self_push_sync">
	//*1100 2383:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//*1101 2386:pop             
	//*1102 2387:aload_1         
	//*1103 2388:aload           9
	//*1104 2390:invokevirtual   #66  <Method String StringBuilder.toString()>
	//*1105 2393:ldc2            #960 <String "bindinfo">
	//*1106 2396:aload_2         
	//*1107 2397:invokestatic    #964 <Method void v.a(Context, String, String, String)>
	//*1108 2400:return          
	//*1109 2401:astore_2        
	//*1110 2402:goto            2406
	//*1111 2405:astore_2        
	//*1112 2406:aload_0         
	//*1113 2407:aload_1         
	//*1114 2408:iload_3         
	//*1115 2409:aconst_null     
	//*1116 2410:aconst_null     
	//*1117 2411:aconst_null     
	//*1118 2412:aconst_null     
	//*1119 2413:invokevirtual   #915 <Method void onBind(Context, int, String, String, String, String)>
	//*1120 2416:invokestatic    #883 <Method int com.baidu.android.pushservice.a.b()>
	//*1121 2419:ifle            2435
	//*1122 2422:aload_1         
	//*1123 2423:ldc2            #885 <String "039905">
	//*1124 2426:iconst_m1       
	//*1125 2427:aload_2         
	//*1126 2428:invokestatic    #967 <Method String com.baidu.android.pushservice.h.u.a(Throwable)>
	//*1127 2431:invokestatic    #890 <Method long p.a(Context, String, int, String)>
	//*1128 2434:pop2            
	//*1129 2435:new             #47  <Class StringBuilder>
	//*1130 2438:dup             
	//*1131 2439:invokespecial   #48  <Method void StringBuilder()>
	//*1132 2442:astore          9
	//*1133 2444:aload           9
	//*1134 2446:ldc2            #969 <String "onBind from">
	//*1135 2449:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//*1136 2452:pop             
	//*1137 2453:aload           9
	//*1138 2455:aload_1         
	//*1139 2456:invokevirtual   #204 <Method String Context.getPackageName()>
	//*1140 2459:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//*1141 2462:pop             
	//*1142 2463:aload           9
	//*1143 2465:ldc2            #879 <String " errorCode ">
	//*1144 2468:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//*1145 2471:pop             
	//*1146 2472:aload           9
	//*1147 2474:iload_3         
	//*1148 2475:invokevirtual   #301 <Method StringBuilder StringBuilder.append(int)>
	//*1149 2478:pop             
	//*1150 2479:aload           9
	//*1151 2481:ldc2            #971 <String " at time of ">
	//*1152 2484:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//*1153 2487:pop             
	//*1154 2488:aload           9
	//*1155 2490:invokestatic    #434 <Method long System.currentTimeMillis()>
	//*1156 2493:invokevirtual   #932 <Method StringBuilder StringBuilder.append(long)>
	//*1157 2496:pop             
	//*1158 2497:aload           9
	//*1159 2499:ldc2            #973 <String " exception ">
	//*1160 2502:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//*1161 2505:pop             
	//*1162 2506:aload           9
	//*1163 2508:aload_2         
	//*1164 2509:invokestatic    #967 <Method String com.baidu.android.pushservice.h.u.a(Throwable)>
	//*1165 2512:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//*1166 2515:pop             
	//*1167 2516:aload           9
	//*1168 2518:astore_2        
	//*1169 2519:goto            2606
	//*1170 2522:aload_0         
	//*1171 2523:aload_1         
	//*1172 2524:iload_3         
	//*1173 2525:aconst_null     
	//*1174 2526:aconst_null     
	//*1175 2527:aconst_null     
	//*1176 2528:aconst_null     
	//*1177 2529:invokevirtual   #915 <Method void onBind(Context, int, String, String, String, String)>
	//*1178 2532:invokestatic    #883 <Method int com.baidu.android.pushservice.a.b()>
	//*1179 2535:ifle            2551
	//*1180 2538:aload_1         
	//*1181 2539:ldc2            #885 <String "039905">
	//*1182 2542:iconst_m1       
	//*1183 2543:iload_3         
	//*1184 2544:invokestatic    #976 <Method String String.valueOf(int)>
	//*1185 2547:invokestatic    #890 <Method long p.a(Context, String, int, String)>
	//*1186 2550:pop2            
	//*1187 2551:new             #47  <Class StringBuilder>
	//*1188 2554:dup             
	//*1189 2555:invokespecial   #48  <Method void StringBuilder()>
	//*1190 2558:astore_2        
	//*1191 2559:aload_2         
	//*1192 2560:ldc2            #969 <String "onBind from">
	//*1193 2563:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//*1194 2566:pop             
	//*1195 2567:aload_2         
	//*1196 2568:aload_1         
	//*1197 2569:invokevirtual   #204 <Method String Context.getPackageName()>
	//*1198 2572:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//*1199 2575:pop             
	//*1200 2576:aload_2         
	//*1201 2577:ldc2            #879 <String " errorCode ">
	//*1202 2580:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//*1203 2583:pop             
	//*1204 2584:aload_2         
	//*1205 2585:iload_3         
	//*1206 2586:invokevirtual   #301 <Method StringBuilder StringBuilder.append(int)>
	//*1207 2589:pop             
	//*1208 2590:aload_2         
	//*1209 2591:ldc2            #971 <String " at time of ">
	//*1210 2594:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//*1211 2597:pop             
	//*1212 2598:aload_2         
	//*1213 2599:invokestatic    #434 <Method long System.currentTimeMillis()>
	//*1214 2602:invokevirtual   #932 <Method StringBuilder StringBuilder.append(long)>
	//*1215 2605:pop             
	//*1216 2606:aload_2         
	//*1217 2607:invokevirtual   #66  <Method String StringBuilder.toString()>
	//*1218 2610:aload_1         
	//*1219 2611:invokestatic    #935 <Method void com.baidu.android.pushservice.h.u.b(String, Context)>
	//*1220 2614:return          
	//*1221 2615:aload_1         
	//*1222 2616:invokestatic    #979 <Method boolean ModeConfig.isProxyMode(Context)>
	//*1223 2619:ifeq            2623
	//*1224 2622:return          
	//*1225 2623:aload_2         
	//*1226 2624:invokevirtual   #983 <Method Bundle Intent.getExtras()>
	//*1227 2627:ifnonnull       2631
	//*1228 2630:return          
	//*1229 2631:aload_2         
	//*1230 2632:ldc2            #652 <String "baidu_message_secur_info">
	//*1231 2635:invokevirtual   #396 <Method byte[] Intent.getByteArrayExtra(String)>
	//*1232 2638:astore          9
	//*1233 2640:aload_2         
	//*1234 2641:ldc2            #985 <String "baidu_message_body">
	//*1235 2644:invokevirtual   #396 <Method byte[] Intent.getByteArrayExtra(String)>
	//*1236 2647:astore          10
	//*1237 2649:aload_2         
	//*1238 2650:ldc2            #987 <String "message_id">
	//*1239 2653:invokevirtual   #408 <Method String Intent.getStringExtra(String)>
	//*1240 2656:astore          11
	//*1241 2658:aload_2         
	//*1242 2659:ldc2            #989 <String "baidu_message_type">
	//*1243 2662:iconst_m1       
	//*1244 2663:invokevirtual   #296 <Method int Intent.getIntExtra(String, int)>
	//*1245 2666:istore_3        
	//*1246 2667:aload_2         
	//*1247 2668:ldc2            #991 <String "app_id">
	//*1248 2671:invokevirtual   #408 <Method String Intent.getStringExtra(String)>
	//*1249 2674:astore          12
	//*1250 2676:aload           9
	//*1251 2678:ifnull          2770
	//*1252 2681:aload           10
	//*1253 2683:ifnull          2770
	//*1254 2686:aload           11
	//*1255 2688:invokestatic    #190 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*1256 2691:ifne            2770
	//*1257 2694:aload           12
	//*1258 2696:invokestatic    #190 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*1259 2699:ifne            2770
	//*1260 2702:iload_3         
	//*1261 2703:iconst_m1       
	//*1262 2704:icmpne          2710
	//*1263 2707:goto            2770
	//*1264 2710:aload_1         
	//*1265 2711:aload           11
	//*1266 2713:invokestatic    #994 <Method boolean com.baidu.android.pushservice.h.u.r(Context, String)>
	//*1267 2716:ifeq            2736
	//*1268 2719:getstatic       #45  <Field String TAG>
	//*1269 2722:ldc2            #996 <String " receive message duplicated !">
	//*1270 2725:invokestatic    #306 <Method void a.e(String, String)>
	//*1271 2728:aload_0         
	//*1272 2729:aload_1         
	//*1273 2730:aload_2         
	//*1274 2731:iconst_4        
	//*1275 2732:invokespecial   #33  <Method void sendCallback(Context, Intent, int)>
	//*1276 2735:return          
	//*1277 2736:new             #8   <Class PushMessageReceiver$2>
	//*1278 2739:dup             
	//*1279 2740:aload_0         
	//*1280 2741:aload_1         
	//*1281 2742:iload_3         
	//*1282 2743:aload           12
	//*1283 2745:aload           11
	//*1284 2747:aload           9
	//*1285 2749:aload           10
	//*1286 2751:aload_2         
	//*1287 2752:new             #6   <Class PushMessageReceiver$1>
	//*1288 2755:dup             
	//*1289 2756:aload_0         
	//*1290 2757:aload_1         
	//*1291 2758:aload_1         
	//*1292 2759:aload_2         
	//*1293 2760:invokespecial   #999 <Method void PushMessageReceiver$1(PushMessageReceiver, Context, Context, Intent)>
	//*1294 2763:invokespecial   #1002 <Method void PushMessageReceiver$2(PushMessageReceiver, Context, int, String, String, byte[], byte[], Intent, PushMessageReceiver$a)>
	//*1295 2766:invokevirtual   #1005 <Method void PushMessageReceiver$2.start()>
	//*1296 2769:return          
	//*1297 2770:getstatic       #45  <Field String TAG>
	//*1298 2773:ldc2            #1007 <String " receive message error !">
	//*1299 2776:invokestatic    #306 <Method void a.e(String, String)>
	//*1300 2779:aload_0         
	//*1301 2780:aload_1         
	//*1302 2781:aload_2         
	//*1303 2782:iconst_2        
	//*1304 2783:invokespecial   #33  <Method void sendCallback(Context, Intent, int)>
	//*1305 2786:return          
	//*1306 2787:getstatic       #45  <Field String TAG>
	//*1307 2790:ldc2            #1009 <String "attack by null Serializable data and return">
	//*1308 2793:invokestatic    #220 <Method void a.c(String, String)>
	//*1309 2796:return          
	//*1310 2797:astore_1        
	//*1311 2798:goto            2787
			// Misplaced declaration of an exception variable
			catch(Intent intent)
			{
				onListTags(context, i, ((List) (null)), ((String) (null)));
			}
			return;
		}
		  goto _L9
_L35:
		obj = ((Object) (new JSONObject(((String) (obj)))));
		intent = ((Intent) (((JSONObject) (obj)).getString("request_id")));
		obj = ((Object) (((JSONObject) (obj)).getJSONObject("response_params")));
		if(obj == null)
			return;
		obj = ((Object) (((JSONObject) (obj)).getJSONArray("details")));
		if(obj == null)
			return;
		Object obj2;
		obj1 = ((Object) (new ArrayList()));
		obj2 = ((Object) (new ArrayList()));
_L53:
		if(k >= ((JSONArray) (obj)).length()) goto _L38; else goto _L37
_L37:
		Object obj3;
		String s4;
		obj3 = ((Object) (((JSONArray) (obj)).getJSONObject(k)));
		s4 = ((JSONObject) (obj3)).getString("tag");
		if(((JSONObject) (obj3)).getInt("result") != 0) goto _L40; else goto _L39
_L39:
		((List) (obj1)).add(((Object) (s4)));
		  goto _L41
_L40:
		((List) (obj2)).add(((Object) (s4)));
		  goto _L41
_L38:
		try
		{
			onDelTags(context, i, ((List) (obj1)), ((List) (obj2)), ((String) (intent)));
			return;
		}
	//*1312 2801:astore_2        
	//*1313 2802:goto            1282
		// Misplaced declaration of an exception variable
		catch(Intent intent)
		{
			onDelTags(context, i, ((List) (null)), ((List) (null)), ((String) (null)));
		}
		return;
_L33:
		obj = ((Object) (new JSONObject(((String) (obj)))));
		intent = ((Intent) (((JSONObject) (obj)).getString("request_id")));
		if(!TextUtils.isEmpty(((CharSequence) (((JSONObject) (obj)).optString("error_msg")))))
		{
			onSetTags(context, i, ((List) (new ArrayList())), ((List) (new ArrayList())), ((String) (intent)));
			return;
		}
		obj = ((Object) (((JSONObject) (obj)).optJSONObject("response_params")));
		if(obj == null)
			return;
		obj = ((Object) (((JSONObject) (obj)).getJSONArray("details")));
		if(obj == null)
			return;
		obj1 = ((Object) (new ArrayList()));
		obj2 = ((Object) (new ArrayList()));
		k = ((int) (flag));
_L54:
		if(k >= ((JSONArray) (obj)).length())
			break MISSING_BLOCK_LABEL_1625;
		obj3 = ((Object) (((JSONArray) (obj)).getJSONObject(k)));
		s4 = ((JSONObject) (obj3)).getString("tag");
		if(((JSONObject) (obj3)).getInt("result") == 0)
		{
			((List) (obj1)).add(((Object) (s4)));
			break MISSING_BLOCK_LABEL_2838;
		}
		((List) (obj2)).add(((Object) (s4)));
		break MISSING_BLOCK_LABEL_2838;
		try
		{
			onSetTags(context, i, ((List) (obj1)), ((List) (obj2)), ((String) (intent)));
			return;
		}
	//*1314 2805:astore_2        
	//*1315 2806:goto            1439
		// Misplaced declaration of an exception variable
		catch(Intent intent)
		{
			onSetTags(context, i, ((List) (null)), ((List) (null)), ((String) (null)));
		}
		return;
_L31:
		intent = ((Intent) (context.getSharedPreferences("bindcache", 0).edit()));
		try
		{
			onUnbind(context, i, (new JSONObject(((String) (obj)))).getString("request_id"));
			((android.content.SharedPreferences.Editor) (intent)).putBoolean("bind_status", false);
			((android.content.SharedPreferences.Editor) (intent)).commit();
		}
	//*1316 2809:astore_2        
	//*1317 2810:goto            1637
		// Misplaced declaration of an exception variable
		catch(JSONException jsonexception)
		{
			onUnbind(context, i, ((String) (null)));
			((android.content.SharedPreferences.Editor) (intent)).putBoolean("bind_status", false);
			((android.content.SharedPreferences.Editor) (intent)).commit();
		}
		if(ModeConfig.isXiaomiProxyMode(context))
		{
			MiPushClient.unregisterPush(context);
			com.baidu.android.pushservice.e.a.b(TAG, "XM> MiPushClient.unregisterPush is call!!!");
		}
		intent = ((Intent) (new StringBuilder()));
		((StringBuilder) (intent)).append("unbind from");
		((StringBuilder) (intent)).append(context.getPackageName());
		((StringBuilder) (intent)).append(" errorCode ");
		((StringBuilder) (intent)).append(i);
		  goto _L42
_L29:
		if(com.baidu.android.pushservice.a.b() > 0)
			p.a(context, "039905", i, ((String) (obj)));
		if(i != 0 || TextUtils.isEmpty(((CharSequence) (obj)))) goto _L44; else goto _L43
_L43:
		String s5;
		obj = ((Object) (new JSONObject(((String) (obj)))));
		obj2 = ((Object) (((JSONObject) (obj)).getString("request_id")));
		obj = ((Object) (((JSONObject) (obj)).getJSONObject("response_params")));
		obj3 = ((Object) (((JSONObject) (obj)).getString("appid")));
		com.baidu.android.pushservice.PushSettings.b(context, ((String) (obj3)));
		s4 = ((JSONObject) (obj)).getString("channel_id");
		s5 = ((JSONObject) (obj)).getString("user_id");
		long l1 = 0L;
		flag1 = intent.hasExtra("real_bind");
		if(!flag1) goto _L46; else goto _L45
_L45:
		l1 = System.currentTimeMillis();
		obj = ((Object) (intent.getStringExtra("access_token")));
		obj1 = ((Object) (intent.getStringExtra("secret_key")));
		intent = ((Intent) (obj));
		obj = obj1;
		  goto _L47
		intent;
		  goto _L48
_L46:
		intent = null;
		obj = ((Object) (intent));
_L47:
		m.a(context, ((String) (obj3)), s4, ((String) (obj2)), s5, true, com.baidu.android.pushservice.h.u.d(context, context.getPackageName()), l1, ((String) (intent)), ((String) (obj)));
		k = i;
		onBind(context, i, ((String) (obj3)), s5, s4, ((String) (obj2)));
		intent = ((Intent) (TAG));
		StringBuilder stringbuilder = new StringBuilder();
		stringbuilder.append("PushMessageReceiver#onBind from");
		stringbuilder.append(context.getPackageName());
		stringbuilder.append(", errorCode= ");
		stringbuilder.append(k);
		stringbuilder.append(", appid=  ");
		stringbuilder.append(((String) (obj3)));
		stringbuilder.append(", userId=");
		stringbuilder.append(s5);
		stringbuilder.append(", channelId=");
		stringbuilder.append(s4);
		stringbuilder.append(", requestId=");
		stringbuilder.append(((String) (obj2)));
		stringbuilder.append(", at time of ");
		stringbuilder.append(System.currentTimeMillis());
		com.baidu.android.pushservice.e.a.c(((String) (intent)), stringbuilder.toString());
		intent = ((Intent) (new StringBuilder()));
		((StringBuilder) (intent)).append("PushMessageReceiver#onBind from");
		((StringBuilder) (intent)).append(context.getPackageName());
		((StringBuilder) (intent)).append(", errorCode= ");
		((StringBuilder) (intent)).append(k);
		((StringBuilder) (intent)).append(", appid=  ");
		((StringBuilder) (intent)).append(((String) (obj3)));
		((StringBuilder) (intent)).append(", userId=");
		((StringBuilder) (intent)).append(s5);
		((StringBuilder) (intent)).append(", channelId=");
		((StringBuilder) (intent)).append(s4);
		((StringBuilder) (intent)).append(", requestId=");
		((StringBuilder) (intent)).append(((String) (obj2)));
		((StringBuilder) (intent)).append(", at time of ");
		((StringBuilder) (intent)).append(System.currentTimeMillis());
		com.baidu.android.pushservice.h.u.b(((StringBuilder) (intent)).toString(), context);
		intent = ((Intent) (new StringBuilder()));
		((StringBuilder) (intent)).append(context.getPackageName());
		((StringBuilder) (intent)).append(",");
		((StringBuilder) (intent)).append(((String) (obj3)));
		((StringBuilder) (intent)).append(",");
		((StringBuilder) (intent)).append(s5);
		((StringBuilder) (intent)).append(",");
		((StringBuilder) (intent)).append("false");
		((StringBuilder) (intent)).append(",");
		((StringBuilder) (intent)).append(((int) (com.baidu.android.pushservice.a.a())));
		intent = ((Intent) (com.baidu.android.pushservice.b.b.a(context).b(((StringBuilder) (intent)).toString())));
		q.g(context, ((String) (intent)));
		if(com.baidu.android.pushservice.h.u.H(context))
		{
			StringBuilder stringbuilder1 = new StringBuilder();
			stringbuilder1.append(context.getPackageName());
			stringbuilder1.append(".self_push_sync");
			v.a(context, stringbuilder1.toString(), "bindinfo", ((String) (intent)));
			return;
		}
		  goto _L9
		intent;
		  goto _L48
		intent;
_L48:
		onBind(context, i, ((String) (null)), ((String) (null)), ((String) (null)), ((String) (null)));
		if(com.baidu.android.pushservice.a.b() > 0)
			p.a(context, "039905", -1, com.baidu.android.pushservice.h.u.a(((Throwable) (intent))));
		StringBuilder stringbuilder2 = new StringBuilder();
		stringbuilder2.append("onBind from");
		stringbuilder2.append(context.getPackageName());
		stringbuilder2.append(" errorCode ");
		stringbuilder2.append(i);
		stringbuilder2.append(" at time of ");
		stringbuilder2.append(System.currentTimeMillis());
		stringbuilder2.append(" exception ");
		stringbuilder2.append(com.baidu.android.pushservice.h.u.a(((Throwable) (intent))));
		intent = ((Intent) (stringbuilder2));
		  goto _L49
_L44:
		onBind(context, i, ((String) (null)), ((String) (null)), ((String) (null)), ((String) (null)));
		if(com.baidu.android.pushservice.a.b() > 0)
			p.a(context, "039905", -1, String.valueOf(i));
		intent = ((Intent) (new StringBuilder()));
		((StringBuilder) (intent)).append("onBind from");
		((StringBuilder) (intent)).append(context.getPackageName());
		((StringBuilder) (intent)).append(" errorCode ");
		((StringBuilder) (intent)).append(i);
_L42:
		((StringBuilder) (intent)).append(" at time of ");
		((StringBuilder) (intent)).append(System.currentTimeMillis());
_L49:
		com.baidu.android.pushservice.h.u.b(((StringBuilder) (intent)).toString(), context);
		return;
_L3:
		byte abyte0[];
		byte abyte1[];
		if(ModeConfig.isProxyMode(context))
			return;
		if(intent.getExtras() == null)
			return;
		abyte0 = intent.getByteArrayExtra("baidu_message_secur_info");
		abyte1 = intent.getByteArrayExtra("baidu_message_body");
		obj2 = ((Object) (intent.getStringExtra("message_id")));
		i = intent.getIntExtra("baidu_message_type", -1);
		obj3 = ((Object) (intent.getStringExtra("app_id")));
		if(abyte0 != null && abyte1 != null && !TextUtils.isEmpty(((CharSequence) (obj2))) && !TextUtils.isEmpty(((CharSequence) (obj3))) && i != -1) goto _L51; else goto _L50
_L51:
		if(com.baidu.android.pushservice.h.u.r(context, ((String) (obj2))))
		{
			com.baidu.android.pushservice.e.a.e(TAG, " receive message duplicated !");
			sendCallback(context, intent, 4);
			return;
		}
		((_cls2) (new Thread(context, i, ((String) (obj3)), ((String) (obj2)), abyte0, abyte1, intent, ((a) (new a(context, context, intent) {

			public void handleMessage(Message message)
			{
				if(d.get() != null)
			//*   0    0:aload_0         
			//*   1    1:getfield        #33  <Field WeakReference d>
			//*   2    4:invokevirtual   #39  <Method Object WeakReference.get()>
			//*   3    7:ifnull          62
				{
					c.onMessage((Context)d.get(), message.getData().getString("message"), message.getData().getString("custom_content"));
			//    4   10:aload_0         
			//    5   11:getfield        #19  <Field PushMessageReceiver c>
			//    6   14:aload_0         
			//    7   15:getfield        #33  <Field WeakReference d>
			//    8   18:invokevirtual   #39  <Method Object WeakReference.get()>
			//    9   21:checkcast       #41  <Class Context>
			//   10   24:aload_1         
			//   11   25:invokevirtual   #47  <Method Bundle Message.getData()>
			//   12   28:ldc1            #49  <String "message">
			//   13   30:invokevirtual   #55  <Method String Bundle.getString(String)>
			//   14   33:aload_1         
			//   15   34:invokevirtual   #47  <Method Bundle Message.getData()>
			//   16   37:ldc1            #57  <String "custom_content">
			//   17   39:invokevirtual   #55  <Method String Bundle.getString(String)>
			//   18   42:invokevirtual   #61  <Method void PushMessageReceiver.onMessage(Context, String, String)>
					c.sendCallback(a, b, 10);
			//   19   45:aload_0         
			//   20   46:getfield        #19  <Field PushMessageReceiver c>
			//   21   49:aload_0         
			//   22   50:getfield        #21  <Field Context a>
			//   23   53:aload_0         
			//   24   54:getfield        #23  <Field Intent b>
			//   25   57:bipush          10
			//   26   59:invokestatic    #65  <Method void PushMessageReceiver.access$000(PushMessageReceiver, Context, Intent, int)>
				}
			//   27   62:return          
			}

			final Context a;
			final Intent b;
			final PushMessageReceiver c;

			
			{
				c = PushMessageReceiver.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field PushMessageReceiver c>
				a = context1;
			//    3    5:aload_0         
			//    4    6:aload_3         
			//    5    7:putfield        #21  <Field Context a>
				b = intent;
			//    6   10:aload_0         
			//    7   11:aload           4
			//    8   13:putfield        #23  <Field Intent b>
				super(context);
			//    9   16:aload_0         
			//   10   17:aload_2         
			//   11   18:invokespecial   #26  <Method void PushMessageReceiver$a(Context)>
			//   12   21:return          
			}
		}
))) {

			public void run()
			{
				String as[] = com.baidu.android.pushservice.message.a.h.a(a, b, c, d, e, f);
			//    0    0:aload_0         
			//    1    1:getfield        #31  <Field Context a>
			//    2    4:aload_0         
			//    3    5:getfield        #33  <Field int b>
			//    4    8:aload_0         
			//    5    9:getfield        #35  <Field String c>
			//    6   12:aload_0         
			//    7   13:getfield        #37  <Field String d>
			//    8   16:aload_0         
			//    9   17:getfield        #39  <Field byte[] e>
			//   10   20:aload_0         
			//   11   21:getfield        #41  <Field byte[] f>
			//   12   24:invokestatic    #55  <Method String[] com.baidu.android.pushservice.message.a.h.a(Context, int, String, String, byte[], byte[])>
			//   13   27:astore_1        
				if(as != null && as.length == 2)
			//*  14   28:aload_1         
			//*  15   29:ifnull          174
			//*  16   32:aload_1         
			//*  17   33:arraylength     
			//*  18   34:iconst_2        
			//*  19   35:icmpeq          41
			//*  20   38:goto            174
				{
					Object obj4 = ((Object) (new Message()));
			//   21   41:new             #57  <Class Message>
			//   22   44:dup             
			//   23   45:invokespecial   #58  <Method void Message()>
			//   24   48:astore_2        
					Bundle bundle = new Bundle();
			//   25   49:new             #60  <Class Bundle>
			//   26   52:dup             
			//   27   53:invokespecial   #61  <Method void Bundle()>
			//   28   56:astore_3        
					bundle.putString("message", as[0]);
			//   29   57:aload_3         
			//   30   58:ldc1            #63  <String "message">
			//   31   60:aload_1         
			//   32   61:iconst_0        
			//   33   62:aaload          
			//   34   63:invokevirtual   #67  <Method void Bundle.putString(String, String)>
					bundle.putString("custom_content", as[1]);
			//   35   66:aload_3         
			//   36   67:ldc1            #69  <String "custom_content">
			//   37   69:aload_1         
			//   38   70:iconst_1        
			//   39   71:aaload          
			//   40   72:invokevirtual   #67  <Method void Bundle.putString(String, String)>
					((Message) (obj4)).setData(bundle);
			//   41   75:aload_2         
			//   42   76:aload_3         
			//   43   77:invokevirtual   #73  <Method void Message.setData(Bundle)>
					h.sendMessage(((Message) (obj4)));
			//   44   80:aload_0         
			//   45   81:getfield        #45  <Field PushMessageReceiver$a h>
			//   46   84:aload_2         
			//   47   85:invokevirtual   #79  <Method boolean PushMessageReceiver$a.sendMessage(Message)>
			//   48   88:pop             
					obj4 = ((Object) (new StringBuilder()));
			//   49   89:new             #81  <Class StringBuilder>
			//   50   92:dup             
			//   51   93:invokespecial   #82  <Method void StringBuilder()>
			//   52   96:astore_2        
					((StringBuilder) (obj4)).append("message ");
			//   53   97:aload_2         
			//   54   98:ldc1            #84  <String "message ">
			//   55  100:invokevirtual   #88  <Method StringBuilder StringBuilder.append(String)>
			//   56  103:pop             
					((StringBuilder) (obj4)).append(as[0]);
			//   57  104:aload_2         
			//   58  105:aload_1         
			//   59  106:iconst_0        
			//   60  107:aaload          
			//   61  108:invokevirtual   #88  <Method StringBuilder StringBuilder.append(String)>
			//   62  111:pop             
					((StringBuilder) (obj4)).append(" at time of ");
			//   63  112:aload_2         
			//   64  113:ldc1            #90  <String " at time of ">
			//   65  115:invokevirtual   #88  <Method StringBuilder StringBuilder.append(String)>
			//   66  118:pop             
					((StringBuilder) (obj4)).append(System.currentTimeMillis());
			//   67  119:aload_2         
			//   68  120:invokestatic    #96  <Method long System.currentTimeMillis()>
			//   69  123:invokevirtual   #99  <Method StringBuilder StringBuilder.append(long)>
			//   70  126:pop             
					com.baidu.android.pushservice.h.u.b(((StringBuilder) (obj4)).toString(), a);
			//   71  127:aload_2         
			//   72  128:invokevirtual   #103 <Method String StringBuilder.toString()>
			//   73  131:aload_0         
			//   74  132:getfield        #31  <Field Context a>
			//   75  135:invokestatic    #108 <Method void com.baidu.android.pushservice.h.u.b(String, Context)>
					if(com.baidu.android.pushservice.a.b() > 0)
			//*  76  138:invokestatic    #113 <Method int com.baidu.android.pushservice.a.b()>
			//*  77  141:ifle            173
						com.baidu.android.pushservice.f.k.b(a, c, d, b, as[0].getBytes(), 0, i.a);
			//   78  144:aload_0         
			//   79  145:getfield        #31  <Field Context a>
			//   80  148:aload_0         
			//   81  149:getfield        #35  <Field String c>
			//   82  152:aload_0         
			//   83  153:getfield        #37  <Field String d>
			//   84  156:aload_0         
			//   85  157:getfield        #33  <Field int b>
			//   86  160:aload_1         
			//   87  161:iconst_0        
			//   88  162:aaload          
			//   89  163:invokevirtual   #119 <Method byte[] String.getBytes()>
			//   90  166:iconst_0        
			//   91  167:getstatic       #123 <Field int i.a>
			//   92  170:invokestatic    #128 <Method void k.b(Context, String, String, int, byte[], int, int)>
					return;
			//   93  173:return          
				} else
				{
					com.baidu.android.pushservice.e.a.e(PushMessageReceiver.TAG, " check message error !");
			//   94  174:getstatic       #131 <Field String PushMessageReceiver.TAG>
			//   95  177:ldc1            #133 <String " check message error !">
			//   96  179:invokestatic    #137 <Method void a.e(String, String)>
					i.sendCallback(a, g, 9);
			//   97  182:aload_0         
			//   98  183:getfield        #29  <Field PushMessageReceiver i>
			//   99  186:aload_0         
			//  100  187:getfield        #31  <Field Context a>
			//  101  190:aload_0         
			//  102  191:getfield        #43  <Field Intent g>
			//  103  194:bipush          9
			//  104  196:invokestatic    #141 <Method void PushMessageReceiver.access$000(PushMessageReceiver, Context, Intent, int)>
					return;
			//  105  199:return          
				}
			}

			final Context a;
			final int b;
			final String c;
			final String d;
			final byte e[];
			final byte f[];
			final Intent g;
			final a h;
			final PushMessageReceiver i;

			
			{
				i = PushMessageReceiver.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #29  <Field PushMessageReceiver i>
				a = context;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #31  <Field Context a>
				b = i1;
			//    6   10:aload_0         
			//    7   11:iload_3         
			//    8   12:putfield        #33  <Field int b>
				c = s;
			//    9   15:aload_0         
			//   10   16:aload           4
			//   11   18:putfield        #35  <Field String c>
				d = s1;
			//   12   21:aload_0         
			//   13   22:aload           5
			//   14   24:putfield        #37  <Field String d>
				e = abyte0;
			//   15   27:aload_0         
			//   16   28:aload           6
			//   17   30:putfield        #39  <Field byte[] e>
				f = abyte1;
			//   18   33:aload_0         
			//   19   34:aload           7
			//   20   36:putfield        #41  <Field byte[] f>
				g = intent;
			//   21   39:aload_0         
			//   22   40:aload           8
			//   23   42:putfield        #43  <Field Intent g>
				h = a1;
			//   24   45:aload_0         
			//   25   46:aload           9
			//   26   48:putfield        #45  <Field PushMessageReceiver$a h>
				super();
			//   27   51:aload_0         
			//   28   52:invokespecial   #48  <Method void Thread()>
			//   29   55:return          
			}
		}
)).start();
_L9:
		return;
_L50:
		com.baidu.android.pushservice.e.a.e(TAG, " receive message error !");
		sendCallback(context, intent, 2);
		return;
_L52:
		com.baidu.android.pushservice.e.a.c(TAG, "attack by null Serializable data and return");
_L2:
		return;
		context;
		JSONException jsonexception;
		if(true) goto _L52; else goto _L17
	//*1318 2813:astore          9
	//*1319 2815:goto            1703
_L17:
		i = 0;
	// 1320 2818:iconst_0        
	// 1321 2819:istore_3        
		  goto _L19
	//*1322 2820:goto            684
_L26:
		i = 6;
	// 1323 2823:bipush          6
	// 1324 2825:istore_3        
		  goto _L19
	//*1325 2826:goto            684
_L41:
		k++;
	// 1326 2829:iload           4
	// 1327 2831:iconst_1        
	// 1328 2832:iadd            
	// 1329 2833:istore          4
		  goto _L53
	//*1330 2835:goto            1361
		k++;
	// 1331 2838:iload           4
	// 1332 2840:iconst_1        
	// 1333 2841:iadd            
	// 1334 2842:istore          4
		  goto _L54
	//*1335 2844:goto            1559
	}

	public abstract void onSetTags(Context context, int i, List list, List list1, String s);

	public abstract void onUnbind(Context context, int i, String s);

	private static String ACTION_LAPP_RECEIVE = "com.baidu.android.pushservice.action.lapp.RECEIVE";
	public static final String TAG = "PushMessageReceiver";

	static 
	{
	//    0    0:return          
	}


/*
	static void access$000(PushMessageReceiver pushmessagereceiver, Context context, Intent intent, int i)
	{
		pushmessagereceiver.sendCallback(context, intent, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #33  <Method void sendCallback(Context, Intent, int)>
		return;
	//    5    7:return          
	}

*/
}
