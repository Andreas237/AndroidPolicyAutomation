// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.comscore.utils;

import android.content.*;
import android.preference.PreferenceManager;
import com.comscore.analytics.Core;
import com.comscore.analytics.comScore;
import com.comscore.applications.EventType;
import java.net.URLDecoder;
import java.util.HashMap;

// Referenced classes of package com.comscore.utils:
//			CSLog

public class InstallReferrerReceiver extends BroadcastReceiver
{

	public InstallReferrerReceiver()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void BroadcastReceiver()>
	//    2    4:return          
	}

	private void a(String s, Context context)
	{
		context = ((Context) (PreferenceManager.getDefaultSharedPreferences(context).edit()));
	//    0    0:aload_2         
	//    1    1:invokestatic    #27  <Method SharedPreferences PreferenceManager.getDefaultSharedPreferences(Context)>
	//    2    4:invokeinterface #33  <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//    3    9:astore_2        
		((android.content.SharedPreferences.Editor) (context)).putString("CS_REFERRER_PREF_KEY", s);
	//    4   10:aload_2         
	//    5   11:ldc1            #9   <String "CS_REFERRER_PREF_KEY">
	//    6   13:aload_1         
	//    7   14:invokeinterface #39  <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putString(String, String)>
	//    8   19:pop             
		((android.content.SharedPreferences.Editor) (context)).commit();
	//    9   20:aload_2         
	//   10   21:invokeinterface #43  <Method boolean android.content.SharedPreferences$Editor.commit()>
	//   11   26:pop             
		CSLog.d("InstallReferrerReceiver", "Stored data");
	//   12   27:ldc1            #15  <String "InstallReferrerReceiver">
	//   13   29:ldc1            #45  <String "Stored data">
	//   14   31:invokestatic    #51  <Method void CSLog.d(Object, String)>
	//   15   34:return          
	}

	public static HashMap retrieveReferrerLabels(Context context)
	{
		Object obj = ((Object) (PreferenceManager.getDefaultSharedPreferences(context)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #27  <Method SharedPreferences PreferenceManager.getDefaultSharedPreferences(Context)>
	//    2    4:astore_1        
		if(((SharedPreferences) (obj)).contains("CS_REFERRER_PREF_KEY"))
	//*   3    5:aload_1         
	//*   4    6:ldc1            #9   <String "CS_REFERRER_PREF_KEY">
	//*   5    8:invokeinterface #57  <Method boolean SharedPreferences.contains(String)>
	//*   6   13:ifeq            118
		{
			context = ((Context) (((SharedPreferences) (obj)).edit()));
	//    7   16:aload_1         
	//    8   17:invokeinterface #33  <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//    9   22:astore_0        
			obj = ((Object) (((SharedPreferences) (obj)).getString("CS_REFERRER_PREF_KEY", "CS_NONE")));
	//   10   23:aload_1         
	//   11   24:ldc1            #9   <String "CS_REFERRER_PREF_KEY">
	//   12   26:ldc1            #7   <String "CS_NONE">
	//   13   28:invokeinterface #61  <Method String SharedPreferences.getString(String, String)>
	//   14   33:astore_1        
			String s = comScore.getAppName().toString();
	//   15   34:invokestatic    #67  <Method String comScore.getAppName()>
	//   16   37:invokevirtual   #72  <Method String String.toString()>
	//   17   40:astore_2        
			StringBuilder stringbuilder = new StringBuilder();
	//   18   41:new             #74  <Class StringBuilder>
	//   19   44:dup             
	//   20   45:invokespecial   #75  <Method void StringBuilder()>
	//   21   48:astore_3        
			stringbuilder.append("referrer was set as: '");
	//   22   49:aload_3         
	//   23   50:ldc1            #77  <String "referrer was set as: '">
	//   24   52:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//   25   55:pop             
			stringbuilder.append(((String) (obj)));
	//   26   56:aload_3         
	//   27   57:aload_1         
	//   28   58:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//   29   61:pop             
			stringbuilder.append("'");
	//   30   62:aload_3         
	//   31   63:ldc1            #83  <String "'">
	//   32   65:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//   33   68:pop             
			CSLog.d(((Object) (s)), stringbuilder.toString());
	//   34   69:aload_2         
	//   35   70:aload_3         
	//   36   71:invokevirtual   #84  <Method String StringBuilder.toString()>
	//   37   74:invokestatic    #51  <Method void CSLog.d(Object, String)>
			((android.content.SharedPreferences.Editor) (context)).remove("CS_REFERRER_PREF_KEY");
	//   38   77:aload_0         
	//   39   78:ldc1            #9   <String "CS_REFERRER_PREF_KEY">
	//   40   80:invokeinterface #88  <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.remove(String)>
	//   41   85:pop             
			((android.content.SharedPreferences.Editor) (context)).commit();
	//   42   86:aload_0         
	//   43   87:invokeinterface #43  <Method boolean android.content.SharedPreferences$Editor.commit()>
	//   44   92:pop             
			if(obj != null && ((String) (obj)).length() > 0 && !((String) (obj)).equals("CS_NONE"))
	//*  45   93:aload_1         
	//*  46   94:ifnull          118
	//*  47   97:aload_1         
	//*  48   98:invokevirtual   #92  <Method int String.length()>
	//*  49  101:ifle            118
	//*  50  104:aload_1         
	//*  51  105:ldc1            #7   <String "CS_NONE">
	//*  52  107:invokevirtual   #96  <Method boolean String.equals(Object)>
	//*  53  110:ifne            118
				return splitReferrer(((String) (obj)));
	//   54  113:aload_1         
	//   55  114:invokestatic    #100 <Method HashMap splitReferrer(String)>
	//   56  117:areturn         
		}
		return null;
	//   57  118:aconst_null     
	//   58  119:areturn         
	}

	public static HashMap splitReferrer(String s)
	{
		HashMap hashmap = new HashMap();
	//    0    0:new             #104 <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #105 <Method void HashMap()>
	//    3    7:astore          4
		if(s != null && s.length() > 0)
	//*   4    9:aload_0         
	//*   5   10:ifnull          123
	//*   6   13:aload_0         
	//*   7   14:invokevirtual   #92  <Method int String.length()>
	//*   8   17:ifle            123
		{
			s = ((String) (s.split("&")));
	//    9   20:aload_0         
	//   10   21:ldc1            #107 <String "&">
	//   11   23:invokevirtual   #111 <Method String[] String.split(String)>
	//   12   26:astore_0        
			int j = s.length;
	//   13   27:aload_0         
	//   14   28:arraylength     
	//   15   29:istore_2        
			for(int i = 0; i < j; i++)
	//*  16   30:iconst_0        
	//*  17   31:istore_1        
	//*  18   32:iload_1         
	//*  19   33:iload_2         
	//*  20   34:icmpge          95
			{
				String s1 = ((String) (s[i]));
	//   21   37:aload_0         
	//   22   38:iload_1         
	//   23   39:aaload          
	//   24   40:astore          5
				int k = s1.indexOf("=");
	//   25   42:aload           5
	//   26   44:ldc1            #113 <String "=">
	//   27   46:invokevirtual   #117 <Method int String.indexOf(String)>
	//   28   49:istore_3        
				if(k >= 0)
	//*  29   50:iload_3         
	//*  30   51:iflt            78
					hashmap.put(((Object) (s1.substring(0, k))), ((Object) (s1.substring(k + 1))));
	//   31   54:aload           4
	//   32   56:aload           5
	//   33   58:iconst_0        
	//   34   59:iload_3         
	//   35   60:invokevirtual   #121 <Method String String.substring(int, int)>
	//   36   63:aload           5
	//   37   65:iload_3         
	//   38   66:iconst_1        
	//   39   67:iadd            
	//   40   68:invokevirtual   #124 <Method String String.substring(int)>
	//   41   71:invokevirtual   #128 <Method Object HashMap.put(Object, Object)>
	//   42   74:pop             
				else
	//*  43   75:goto            88
					hashmap.put("ns_ap_referrer", ((Object) (s1)));
	//   44   78:aload           4
	//   45   80:ldc1            #12  <String "ns_ap_referrer">
	//   46   82:aload           5
	//   47   84:invokevirtual   #128 <Method Object HashMap.put(Object, Object)>
	//   48   87:pop             
			}

	//   49   88:iload_1         
	//   50   89:iconst_1        
	//   51   90:iadd            
	//   52   91:istore_1        
	//*  53   92:goto            32
			if(hashmap.size() > 0 && !hashmap.containsKey("ns_ap_referrer"))
	//*  54   95:aload           4
	//*  55   97:invokevirtual   #131 <Method int HashMap.size()>
	//*  56  100:ifle            123
	//*  57  103:aload           4
	//*  58  105:ldc1            #12  <String "ns_ap_referrer">
	//*  59  107:invokevirtual   #134 <Method boolean HashMap.containsKey(Object)>
	//*  60  110:ifne            123
				hashmap.put("ns_ap_referrer", "1");
	//   61  113:aload           4
	//   62  115:ldc1            #12  <String "ns_ap_referrer">
	//   63  117:ldc1            #136 <String "1">
	//   64  119:invokevirtual   #128 <Method Object HashMap.put(Object, Object)>
	//   65  122:pop             
		}
		return hashmap;
	//   66  123:aload           4
	//   67  125:areturn         
	}

	public void onReceive(Context context, Intent intent)
	{
		Object obj;
		Object obj1;
		CSLog.d("InstallReferrerReceiver", "onReceive()");
	//    0    0:ldc1            #15  <String "InstallReferrerReceiver">
	//    1    2:ldc1            #143 <String "onReceive()">
	//    2    4:invokestatic    #51  <Method void CSLog.d(Object, String)>
		obj1 = "CS_NONE";
	//    3    7:ldc1            #7   <String "CS_NONE">
	//    4    9:astore          4
		obj = obj1;
	//    5   11:aload           4
	//    6   13:astore_3        
		if(intent == null)
			break MISSING_BLOCK_LABEL_136;
	//    7   14:aload_2         
	//    8   15:ifnull          136
		obj = obj1;
	//    9   18:aload           4
	//   10   20:astore_3        
		if(!intent.getAction().equals("com.android.vending.INSTALL_REFERRER"))
			break MISSING_BLOCK_LABEL_136;
	//   11   21:aload_2         
	//   12   22:invokevirtual   #148 <Method String Intent.getAction()>
	//   13   25:ldc1            #150 <String "com.android.vending.INSTALL_REFERRER">
	//   14   27:invokevirtual   #96  <Method boolean String.equals(Object)>
	//   15   30:ifeq            136
		intent = ((Intent) (intent.getStringExtra("referrer")));
	//   16   33:aload_2         
	//   17   34:ldc1            #152 <String "referrer">
	//   18   36:invokevirtual   #156 <Method String Intent.getStringExtra(String)>
	//   19   39:astore_2        
		obj = obj1;
	//   20   40:aload           4
	//   21   42:astore_3        
		if(intent == null)
			break MISSING_BLOCK_LABEL_136;
	//   22   43:aload_2         
	//   23   44:ifnull          136
		intent = ((Intent) (URLDecoder.decode(((String) (intent)), "UTF-8")));
	//   24   47:aload_2         
	//   25   48:ldc1            #158 <String "UTF-8">
	//   26   50:invokestatic    #163 <Method String URLDecoder.decode(String, String)>
	//   27   53:astore_2        
		try
		{
			context.getSharedPreferences("referrer", 0).edit().putString("referrer", ((String) (intent))).commit();
	//   28   54:aload_1         
	//   29   55:ldc1            #152 <String "referrer">
	//   30   57:iconst_0        
	//   31   58:invokevirtual   #169 <Method SharedPreferences Context.getSharedPreferences(String, int)>
	//   32   61:invokeinterface #33  <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//   33   66:ldc1            #152 <String "referrer">
	//   34   68:aload_2         
	//   35   69:invokeinterface #39  <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putString(String, String)>
	//   36   74:invokeinterface #43  <Method boolean android.content.SharedPreferences$Editor.commit()>
	//   37   79:pop             
		}
	//*  38   80:aload_2         
	//*  39   81:astore_3        
	//*  40   82:goto            136
		// Misplaced declaration of an exception variable
		catch(Object obj1)
	//*  41   85:astore          4
		{
			obj = ((Object) (intent));
	//   42   87:aload_2         
	//   43   88:astore_3        
			intent = ((Intent) (obj1));
	//   44   89:aload           4
	//   45   91:astore_2        
			break MISSING_BLOCK_LABEL_99;
	//   46   92:goto            99
		}
		obj = ((Object) (intent));
		break MISSING_BLOCK_LABEL_136;
		intent;
	//   47   95:astore_2        
		obj = obj1;
	//   48   96:aload           4
	//   49   98:astore_3        
		StringBuilder stringbuilder = new StringBuilder();
	//   50   99:new             #74  <Class StringBuilder>
	//   51  102:dup             
	//   52  103:invokespecial   #75  <Method void StringBuilder()>
	//   53  106:astore          4
		stringbuilder.append("onReceive()");
	//   54  108:aload           4
	//   55  110:ldc1            #143 <String "onReceive()">
	//   56  112:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//   57  115:pop             
		stringbuilder.append(((Exception) (intent)).getMessage());
	//   58  116:aload           4
	//   59  118:aload_2         
	//   60  119:invokevirtual   #172 <Method String Exception.getMessage()>
	//   61  122:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//   62  125:pop             
		CSLog.e("InstallReferrerReceiver", stringbuilder.toString());
	//   63  126:ldc1            #15  <String "InstallReferrerReceiver">
	//   64  128:aload           4
	//   65  130:invokevirtual   #84  <Method String StringBuilder.toString()>
	//   66  133:invokestatic    #175 <Method void CSLog.e(Object, String)>
		intent = ((Intent) (new StringBuilder()));
	//   67  136:new             #74  <Class StringBuilder>
	//   68  139:dup             
	//   69  140:invokespecial   #75  <Method void StringBuilder()>
	//   70  143:astore_2        
		((StringBuilder) (intent)).append("Received referrer: '");
	//   71  144:aload_2         
	//   72  145:ldc1            #177 <String "Received referrer: '">
	//   73  147:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//   74  150:pop             
		((StringBuilder) (intent)).append(((String) (obj)));
	//   75  151:aload_2         
	//   76  152:aload_3         
	//   77  153:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//   78  156:pop             
		((StringBuilder) (intent)).append("'");
	//   79  157:aload_2         
	//   80  158:ldc1            #83  <String "'">
	//   81  160:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//   82  163:pop             
		CSLog.d("InstallReferrerReceiver", ((StringBuilder) (intent)).toString());
	//   83  164:ldc1            #15  <String "InstallReferrerReceiver">
	//   84  166:aload_2         
	//   85  167:invokevirtual   #84  <Method String StringBuilder.toString()>
	//   86  170:invokestatic    #51  <Method void CSLog.d(Object, String)>
		if(obj != "CS_NONE")
	//*  87  173:aload_3         
	//*  88  174:ldc1            #7   <String "CS_NONE">
	//*  89  176:if_acmpeq       220
		{
			intent = ((Intent) (comScore.getCore()));
	//   90  179:invokestatic    #181 <Method Core comScore.getCore()>
	//   91  182:astore_2        
			if(intent != null && ((Core) (intent)).getAppContext() != null && ((Core) (intent)).getColdStartCount() > 0)
	//*  92  183:aload_2         
	//*  93  184:ifnull          214
	//*  94  187:aload_2         
	//*  95  188:invokevirtual   #187 <Method Context Core.getAppContext()>
	//*  96  191:ifnull          214
	//*  97  194:aload_2         
	//*  98  195:invokevirtual   #190 <Method int Core.getColdStartCount()>
	//*  99  198:ifle            214
			{
				((Core) (intent)).notify(EventType.HIDDEN, splitReferrer(((String) (obj))), true);
	//  100  201:aload_2         
	//  101  202:getstatic       #196 <Field EventType EventType.HIDDEN>
	//  102  205:aload_3         
	//  103  206:invokestatic    #100 <Method HashMap splitReferrer(String)>
	//  104  209:iconst_1        
	//  105  210:invokevirtual   #200 <Method void Core.notify(EventType, HashMap, boolean)>
				return;
	//  106  213:return          
			}
			a(((String) (obj)), context);
	//  107  214:aload_0         
	//  108  215:aload_3         
	//  109  216:aload_1         
	//  110  217:invokespecial   #202 <Method void a(String, Context)>
		}
		return;
	//  111  220:return          
	}

	public static final String CS_NONE = "CS_NONE";
	public static final String CS_REFERRER_PREF_KEY = "CS_REFERRER_PREF_KEY";
	public static final String REFERRER_LABEL = "ns_ap_referrer";
	private static final String a = "InstallReferrerReceiver";
}
