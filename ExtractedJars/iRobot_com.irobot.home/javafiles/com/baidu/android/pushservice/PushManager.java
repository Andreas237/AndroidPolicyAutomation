// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.baidu.android.pushservice;

import android.content.*;
import android.os.Build;
import android.text.TextUtils;
import com.baidu.android.pushservice.config.ModeConfig;
import com.baidu.android.pushservice.e.a;
import com.baidu.android.pushservice.e.b;
import com.baidu.android.pushservice.f.p;
import com.baidu.android.pushservice.h.m;
import com.baidu.android.pushservice.h.o;
import com.baidu.android.pushservice.h.t;
import com.baidu.android.pushservice.h.u;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;

// Referenced classes of package com.baidu.android.pushservice:
//			f, PushSettings, a, d, 
//			h, PushNotificationBuilder

public class PushManager
{

	public PushManager()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
	//    2    4:return          
	}

	public static void bind(Context context, int i)
	{
		Intent intent = com.baidu.android.pushservice.f.a(context, i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #24  <Method Intent com.baidu.android.pushservice.f.a(Context, int)>
	//    3    5:astore_2        
		if(intent == null)
	//*   4    6:aload_2         
	//*   5    7:ifnonnull       11
		{
			return;
	//    6   10:return          
		} else
		{
			b.a("PushManager", "a bind intent send", context.getApplicationContext());
	//    7   11:ldc1            #11  <String "PushManager">
	//    8   13:ldc1            #26  <String "a bind intent send">
	//    9   15:aload_0         
	//   10   16:invokevirtual   #32  <Method Context Context.getApplicationContext()>
	//   11   19:invokestatic    #37  <Method void b.a(String, String, Context)>
			com.baidu.android.pushservice.f.a(context, intent);
	//   12   22:aload_0         
	//   13   23:aload_2         
	//   14   24:invokestatic    #40  <Method boolean com.baidu.android.pushservice.f.a(Context, Intent)>
	//   15   27:pop             
			u.b("Bind by selfEventHandler", context);
	//   16   28:ldc1            #42  <String "Bind by selfEventHandler">
	//   17   30:aload_0         
	//   18   31:invokestatic    #48  <Method void u.b(String, Context)>
			return;
	//   19   34:return          
		}
	}

	public static void bindGroup(Context context, String s)
	{
		Intent intent = com.baidu.android.pushservice.f.a(context);
	//    0    0:aload_0         
	//    1    1:invokestatic    #53  <Method Intent com.baidu.android.pushservice.f.a(Context)>
	//    2    4:astore_2        
		if(intent == null)
	//*   3    5:aload_2         
	//*   4    6:ifnonnull       10
		{
			return;
	//    5    9:return          
		} else
		{
			intent.putExtra("method", "method_gbind");
	//    6   10:aload_2         
	//    7   11:ldc1            #55  <String "method">
	//    8   13:ldc1            #57  <String "method_gbind">
	//    9   15:invokevirtual   #63  <Method Intent Intent.putExtra(String, String)>
	//   10   18:pop             
			intent.putExtra("gid", s);
	//   11   19:aload_2         
	//   12   20:ldc1            #65  <String "gid">
	//   13   22:aload_1         
	//   14   23:invokevirtual   #63  <Method Intent Intent.putExtra(String, String)>
	//   15   26:pop             
			intent.setFlags(intent.getFlags() | 0x20);
	//   16   27:aload_2         
	//   17   28:aload_2         
	//   18   29:invokevirtual   #69  <Method int Intent.getFlags()>
	//   19   32:bipush          32
	//   20   34:ior             
	//   21   35:invokevirtual   #73  <Method Intent Intent.setFlags(int)>
	//   22   38:pop             
			b.a("PushManager", "a bindGroup intent send ", context.getApplicationContext());
	//   23   39:ldc1            #11  <String "PushManager">
	//   24   41:ldc1            #75  <String "a bindGroup intent send ">
	//   25   43:aload_0         
	//   26   44:invokevirtual   #32  <Method Context Context.getApplicationContext()>
	//   27   47:invokestatic    #37  <Method void b.a(String, String, Context)>
			com.baidu.android.pushservice.f.b(context, intent);
	//   28   50:aload_0         
	//   29   51:aload_2         
	//   30   52:invokestatic    #78  <Method void com.baidu.android.pushservice.f.b(Context, Intent)>
			return;
	//   31   55:return          
		}
	}

	public static void bindPushService(Context context, int i, String s)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #82  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #83  <Method void StringBuilder()>
	//    3    7:astore_3        
		stringbuilder.append("startWork at time of ");
	//    4    8:aload_3         
	//    5    9:ldc1            #85  <String "startWork at time of ">
	//    6   11:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(System.currentTimeMillis());
	//    8   15:aload_3         
	//    9   16:invokestatic    #95  <Method long System.currentTimeMillis()>
	//   10   19:invokevirtual   #98  <Method StringBuilder StringBuilder.append(long)>
	//   11   22:pop             
		u.b(stringbuilder.toString(), context);
	//   12   23:aload_3         
	//   13   24:invokevirtual   #102 <Method String StringBuilder.toString()>
	//   14   27:aload_0         
	//   15   28:invokestatic    #48  <Method void u.b(String, Context)>
		t.a(context);
	//   16   31:aload_0         
	//   17   32:invokestatic    #107 <Method void t.a(Context)>
		if(i == 4)
	//*  18   35:iload_1         
	//*  19   36:iconst_4        
	//*  20   37:icmpne          47
		{
			lightAppBind(context, 0, s);
	//   21   40:aload_0         
	//   22   41:iconst_0        
	//   23   42:aload_2         
	//   24   43:invokestatic    #110 <Method void lightAppBind(Context, int, String)>
			return;
	//   25   46:return          
		}
		if(i == 3)
	//*  26   47:iload_1         
	//*  27   48:iconst_3        
	//*  28   49:icmpne          59
		{
			webAppBind(context, 0, s);
	//   29   52:aload_0         
	//   30   53:iconst_0        
	//   31   54:aload_2         
	//   32   55:invokestatic    #113 <Method void webAppBind(Context, int, String)>
			return;
	//   33   58:return          
		} else
		{
			bind(context, 0);
	//   34   59:aload_0         
	//   35   60:iconst_0        
	//   36   61:invokestatic    #115 <Method void bind(Context, int)>
			return;
	//   37   64:return          
		}
	}

	private static Intent createLappMethodIntent(Context context, String s)
	{
		context = ((Context) (u.e(context)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #120 <Method Intent u.e(Context)>
	//    2    4:astore_0        
		((Intent) (context)).putExtra("secret_key", s);
	//    3    5:aload_0         
	//    4    6:ldc1            #122 <String "secret_key">
	//    5    8:aload_1         
	//    6    9:invokevirtual   #63  <Method Intent Intent.putExtra(String, String)>
	//    7   12:pop             
		return ((Intent) (context));
	//    8   13:aload_0         
	//    9   14:areturn         
	}

	private static Intent createSDKMethodIntent(Context context, String s)
	{
		context = ((Context) (t.c(context)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #126 <Method Intent t.c(Context)>
	//    2    4:astore_0        
		((Intent) (context)).putExtra("secret_key", s);
	//    3    5:aload_0         
	//    4    6:ldc1            #122 <String "secret_key">
	//    5    8:aload_1         
	//    6    9:invokevirtual   #63  <Method Intent Intent.putExtra(String, String)>
	//    7   12:pop             
		return ((Intent) (context));
	//    8   13:aload_0         
	//    9   14:areturn         
	}

	public static void delLappTags(Context context, String s, List list)
	{
		Intent intent = f.g(context);
	//    0    0:aload_0         
	//    1    1:invokestatic    #131 <Method Intent f.g(Context)>
	//    2    4:astore          4
		if(intent == null)
	//*   3    6:aload           4
	//*   4    8:ifnonnull       12
			return;
	//    5   11:return          
		if(list != null && list.size() != 0)
	//*   6   12:aload_2         
	//*   7   13:ifnull          232
	//*   8   16:aload_2         
	//*   9   17:invokeinterface #136 <Method int List.size()>
	//*  10   22:ifne            28
	//*  11   25:goto            232
		{
			Object obj = "[";
	//   12   28:ldc1            #138 <String "[">
	//   13   30:astore_3        
			Iterator iterator = list.iterator();
	//   14   31:aload_2         
	//   15   32:invokeinterface #142 <Method Iterator List.iterator()>
	//   16   37:astore          5
			for(list = ((List) (obj)); iterator.hasNext(); list = ((List) (((StringBuilder) (obj)).toString())))
	//*  17   39:aload_3         
	//*  18   40:astore_2        
	//*  19   41:aload           5
	//*  20   43:invokeinterface #148 <Method boolean Iterator.hasNext()>
	//*  21   48:ifeq            150
			{
				obj = ((Object) ((String)iterator.next()));
	//   22   51:aload           5
	//   23   53:invokeinterface #152 <Method Object Iterator.next()>
	//   24   58:checkcast       #154 <Class String>
	//   25   61:astore_3        
				StringBuilder stringbuilder = new StringBuilder();
	//   26   62:new             #82  <Class StringBuilder>
	//   27   65:dup             
	//   28   66:invokespecial   #83  <Method void StringBuilder()>
	//   29   69:astore          6
				stringbuilder.append(((String) (list)));
	//   30   71:aload           6
	//   31   73:aload_2         
	//   32   74:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//   33   77:pop             
				stringbuilder.append("\"");
	//   34   78:aload           6
	//   35   80:ldc1            #156 <String "\"">
	//   36   82:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//   37   85:pop             
				list = ((List) (stringbuilder.toString()));
	//   38   86:aload           6
	//   39   88:invokevirtual   #102 <Method String StringBuilder.toString()>
	//   40   91:astore_2        
				stringbuilder = new StringBuilder();
	//   41   92:new             #82  <Class StringBuilder>
	//   42   95:dup             
	//   43   96:invokespecial   #83  <Method void StringBuilder()>
	//   44   99:astore          6
				stringbuilder.append(((String) (list)));
	//   45  101:aload           6
	//   46  103:aload_2         
	//   47  104:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//   48  107:pop             
				stringbuilder.append(((String) (obj)));
	//   49  108:aload           6
	//   50  110:aload_3         
	//   51  111:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//   52  114:pop             
				list = ((List) (stringbuilder.toString()));
	//   53  115:aload           6
	//   54  117:invokevirtual   #102 <Method String StringBuilder.toString()>
	//   55  120:astore_2        
				obj = ((Object) (new StringBuilder()));
	//   56  121:new             #82  <Class StringBuilder>
	//   57  124:dup             
	//   58  125:invokespecial   #83  <Method void StringBuilder()>
	//   59  128:astore_3        
				((StringBuilder) (obj)).append(((String) (list)));
	//   60  129:aload_3         
	//   61  130:aload_2         
	//   62  131:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//   63  134:pop             
				((StringBuilder) (obj)).append("\",");
	//   64  135:aload_3         
	//   65  136:ldc1            #158 <String "\",">
	//   66  138:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//   67  141:pop             
			}

	//   68  142:aload_3         
	//   69  143:invokevirtual   #102 <Method String StringBuilder.toString()>
	//   70  146:astore_2        
	//*  71  147:goto            41
			obj = ((Object) (list));
	//   72  150:aload_2         
	//   73  151:astore_3        
			if(((String) (list)).length() > 0)
	//*  74  152:aload_2         
	//*  75  153:invokevirtual   #161 <Method int String.length()>
	//*  76  156:ifle            171
				obj = ((Object) (((String) (list)).substring(0, ((String) (list)).length() - 1)));
	//   77  159:aload_2         
	//   78  160:iconst_0        
	//   79  161:aload_2         
	//   80  162:invokevirtual   #161 <Method int String.length()>
	//   81  165:iconst_1        
	//   82  166:isub            
	//   83  167:invokevirtual   #165 <Method String String.substring(int, int)>
	//   84  170:astore_3        
			list = ((List) (new StringBuilder()));
	//   85  171:new             #82  <Class StringBuilder>
	//   86  174:dup             
	//   87  175:invokespecial   #83  <Method void StringBuilder()>
	//   88  178:astore_2        
			((StringBuilder) (list)).append(((String) (obj)));
	//   89  179:aload_2         
	//   90  180:aload_3         
	//   91  181:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//   92  184:pop             
			((StringBuilder) (list)).append("]");
	//   93  185:aload_2         
	//   94  186:ldc1            #167 <String "]">
	//   95  188:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//   96  191:pop             
			list = ((List) (((StringBuilder) (list)).toString()));
	//   97  192:aload_2         
	//   98  193:invokevirtual   #102 <Method String StringBuilder.toString()>
	//   99  196:astore_2        
			intent.putExtra("method", "method_del_lapp_tags");
	//  100  197:aload           4
	//  101  199:ldc1            #55  <String "method">
	//  102  201:ldc1            #169 <String "method_del_lapp_tags">
	//  103  203:invokevirtual   #63  <Method Intent Intent.putExtra(String, String)>
	//  104  206:pop             
			intent.putExtra("secret_key", s);
	//  105  207:aload           4
	//  106  209:ldc1            #122 <String "secret_key">
	//  107  211:aload_1         
	//  108  212:invokevirtual   #63  <Method Intent Intent.putExtra(String, String)>
	//  109  215:pop             
			intent.putExtra("tags", ((String) (list)));
	//  110  216:aload           4
	//  111  218:ldc1            #171 <String "tags">
	//  112  220:aload_2         
	//  113  221:invokevirtual   #63  <Method Intent Intent.putExtra(String, String)>
	//  114  224:pop             
			com.baidu.android.pushservice.f.b(context, intent);
	//  115  225:aload_0         
	//  116  226:aload           4
	//  117  228:invokestatic    #78  <Method void com.baidu.android.pushservice.f.b(Context, Intent)>
			return;
	//  118  231:return          
		} else
		{
			a.d("PushManager", "No tags specified, do nothing.");
	//  119  232:ldc1            #11  <String "PushManager">
	//  120  234:ldc1            #173 <String "No tags specified, do nothing.">
	//  121  236:invokestatic    #179 <Method void a.d(String, String)>
			return;
	//  122  239:return          
		}
	}

	public static void delSDKTags(Context context, String s, List list)
	{
		Intent intent = u.f(context);
	//    0    0:aload_0         
	//    1    1:invokestatic    #185 <Method Intent u.f(Context)>
	//    2    4:astore          4
		if(intent == null)
	//*   3    6:aload           4
	//*   4    8:ifnonnull       12
			return;
	//    5   11:return          
		if(list != null && list.size() != 0)
	//*   6   12:aload_2         
	//*   7   13:ifnull          243
	//*   8   16:aload_2         
	//*   9   17:invokeinterface #136 <Method int List.size()>
	//*  10   22:ifne            28
	//*  11   25:goto            243
		{
			Object obj = "[";
	//   12   28:ldc1            #138 <String "[">
	//   13   30:astore_3        
			Iterator iterator = list.iterator();
	//   14   31:aload_2         
	//   15   32:invokeinterface #142 <Method Iterator List.iterator()>
	//   16   37:astore          5
			for(list = ((List) (obj)); iterator.hasNext(); list = ((List) (((StringBuilder) (obj)).toString())))
	//*  17   39:aload_3         
	//*  18   40:astore_2        
	//*  19   41:aload           5
	//*  20   43:invokeinterface #148 <Method boolean Iterator.hasNext()>
	//*  21   48:ifeq            150
			{
				obj = ((Object) ((String)iterator.next()));
	//   22   51:aload           5
	//   23   53:invokeinterface #152 <Method Object Iterator.next()>
	//   24   58:checkcast       #154 <Class String>
	//   25   61:astore_3        
				StringBuilder stringbuilder = new StringBuilder();
	//   26   62:new             #82  <Class StringBuilder>
	//   27   65:dup             
	//   28   66:invokespecial   #83  <Method void StringBuilder()>
	//   29   69:astore          6
				stringbuilder.append(((String) (list)));
	//   30   71:aload           6
	//   31   73:aload_2         
	//   32   74:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//   33   77:pop             
				stringbuilder.append("\"");
	//   34   78:aload           6
	//   35   80:ldc1            #156 <String "\"">
	//   36   82:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//   37   85:pop             
				list = ((List) (stringbuilder.toString()));
	//   38   86:aload           6
	//   39   88:invokevirtual   #102 <Method String StringBuilder.toString()>
	//   40   91:astore_2        
				stringbuilder = new StringBuilder();
	//   41   92:new             #82  <Class StringBuilder>
	//   42   95:dup             
	//   43   96:invokespecial   #83  <Method void StringBuilder()>
	//   44   99:astore          6
				stringbuilder.append(((String) (list)));
	//   45  101:aload           6
	//   46  103:aload_2         
	//   47  104:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//   48  107:pop             
				stringbuilder.append(((String) (obj)));
	//   49  108:aload           6
	//   50  110:aload_3         
	//   51  111:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//   52  114:pop             
				list = ((List) (stringbuilder.toString()));
	//   53  115:aload           6
	//   54  117:invokevirtual   #102 <Method String StringBuilder.toString()>
	//   55  120:astore_2        
				obj = ((Object) (new StringBuilder()));
	//   56  121:new             #82  <Class StringBuilder>
	//   57  124:dup             
	//   58  125:invokespecial   #83  <Method void StringBuilder()>
	//   59  128:astore_3        
				((StringBuilder) (obj)).append(((String) (list)));
	//   60  129:aload_3         
	//   61  130:aload_2         
	//   62  131:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//   63  134:pop             
				((StringBuilder) (obj)).append("\",");
	//   64  135:aload_3         
	//   65  136:ldc1            #158 <String "\",">
	//   66  138:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//   67  141:pop             
			}

	//   68  142:aload_3         
	//   69  143:invokevirtual   #102 <Method String StringBuilder.toString()>
	//   70  146:astore_2        
	//*  71  147:goto            41
			obj = ((Object) (list));
	//   72  150:aload_2         
	//   73  151:astore_3        
			if(((String) (list)).length() > 0)
	//*  74  152:aload_2         
	//*  75  153:invokevirtual   #161 <Method int String.length()>
	//*  76  156:ifle            171
				obj = ((Object) (((String) (list)).substring(0, ((String) (list)).length() - 1)));
	//   77  159:aload_2         
	//   78  160:iconst_0        
	//   79  161:aload_2         
	//   80  162:invokevirtual   #161 <Method int String.length()>
	//   81  165:iconst_1        
	//   82  166:isub            
	//   83  167:invokevirtual   #165 <Method String String.substring(int, int)>
	//   84  170:astore_3        
			list = ((List) (new StringBuilder()));
	//   85  171:new             #82  <Class StringBuilder>
	//   86  174:dup             
	//   87  175:invokespecial   #83  <Method void StringBuilder()>
	//   88  178:astore_2        
			((StringBuilder) (list)).append(((String) (obj)));
	//   89  179:aload_2         
	//   90  180:aload_3         
	//   91  181:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//   92  184:pop             
			((StringBuilder) (list)).append("]");
	//   93  185:aload_2         
	//   94  186:ldc1            #167 <String "]">
	//   95  188:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//   96  191:pop             
			list = ((List) (((StringBuilder) (list)).toString()));
	//   97  192:aload_2         
	//   98  193:invokevirtual   #102 <Method String StringBuilder.toString()>
	//   99  196:astore_2        
			intent.putExtra("secret_key", s);
	//  100  197:aload           4
	//  101  199:ldc1            #122 <String "secret_key">
	//  102  201:aload_1         
	//  103  202:invokevirtual   #63  <Method Intent Intent.putExtra(String, String)>
	//  104  205:pop             
			intent.putExtra("method", "method_del_sdk_tags");
	//  105  206:aload           4
	//  106  208:ldc1            #55  <String "method">
	//  107  210:ldc1            #187 <String "method_del_sdk_tags">
	//  108  212:invokevirtual   #63  <Method Intent Intent.putExtra(String, String)>
	//  109  215:pop             
			intent.putExtra("tags", ((String) (list)));
	//  110  216:aload           4
	//  111  218:ldc1            #171 <String "tags">
	//  112  220:aload_2         
	//  113  221:invokevirtual   #63  <Method Intent Intent.putExtra(String, String)>
	//  114  224:pop             
			b.a("PushManager", "a delSDKTags intent send", context.getApplicationContext());
	//  115  225:ldc1            #11  <String "PushManager">
	//  116  227:ldc1            #189 <String "a delSDKTags intent send">
	//  117  229:aload_0         
	//  118  230:invokevirtual   #32  <Method Context Context.getApplicationContext()>
	//  119  233:invokestatic    #37  <Method void b.a(String, String, Context)>
			com.baidu.android.pushservice.f.b(context, intent);
	//  120  236:aload_0         
	//  121  237:aload           4
	//  122  239:invokestatic    #78  <Method void com.baidu.android.pushservice.f.b(Context, Intent)>
			return;
	//  123  242:return          
		} else
		{
			a.d("PushManager", "No tags specified, do nothing.");
	//  124  243:ldc1            #11  <String "PushManager">
	//  125  245:ldc1            #173 <String "No tags specified, do nothing.">
	//  126  247:invokestatic    #179 <Method void a.d(String, String)>
			return;
	//  127  250:return          
		}
	}

	public static void delTags(Context context, List list)
	{
		if(list != null && list.size() != 0)
	//*   0    0:aload_1         
	//*   1    1:ifnull          229
	//*   2    4:aload_1         
	//*   3    5:invokeinterface #136 <Method int List.size()>
	//*   4   10:ifne            16
	//*   5   13:goto            229
		{
			Intent intent = com.baidu.android.pushservice.f.a(context);
	//    6   16:aload_0         
	//    7   17:invokestatic    #53  <Method Intent com.baidu.android.pushservice.f.a(Context)>
	//    8   20:astore_3        
			if(intent == null)
	//*   9   21:aload_3         
	//*  10   22:ifnonnull       26
				return;
	//   11   25:return          
			Object obj = "[";
	//   12   26:ldc1            #138 <String "[">
	//   13   28:astore_2        
			Iterator iterator = list.iterator();
	//   14   29:aload_1         
	//   15   30:invokeinterface #142 <Method Iterator List.iterator()>
	//   16   35:astore          4
			for(list = ((List) (obj)); iterator.hasNext(); list = ((List) (((StringBuilder) (obj)).toString())))
	//*  17   37:aload_2         
	//*  18   38:astore_1        
	//*  19   39:aload           4
	//*  20   41:invokeinterface #148 <Method boolean Iterator.hasNext()>
	//*  21   46:ifeq            148
			{
				obj = ((Object) ((String)iterator.next()));
	//   22   49:aload           4
	//   23   51:invokeinterface #152 <Method Object Iterator.next()>
	//   24   56:checkcast       #154 <Class String>
	//   25   59:astore_2        
				StringBuilder stringbuilder = new StringBuilder();
	//   26   60:new             #82  <Class StringBuilder>
	//   27   63:dup             
	//   28   64:invokespecial   #83  <Method void StringBuilder()>
	//   29   67:astore          5
				stringbuilder.append(((String) (list)));
	//   30   69:aload           5
	//   31   71:aload_1         
	//   32   72:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//   33   75:pop             
				stringbuilder.append("\"");
	//   34   76:aload           5
	//   35   78:ldc1            #156 <String "\"">
	//   36   80:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//   37   83:pop             
				list = ((List) (stringbuilder.toString()));
	//   38   84:aload           5
	//   39   86:invokevirtual   #102 <Method String StringBuilder.toString()>
	//   40   89:astore_1        
				stringbuilder = new StringBuilder();
	//   41   90:new             #82  <Class StringBuilder>
	//   42   93:dup             
	//   43   94:invokespecial   #83  <Method void StringBuilder()>
	//   44   97:astore          5
				stringbuilder.append(((String) (list)));
	//   45   99:aload           5
	//   46  101:aload_1         
	//   47  102:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//   48  105:pop             
				stringbuilder.append(((String) (obj)));
	//   49  106:aload           5
	//   50  108:aload_2         
	//   51  109:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//   52  112:pop             
				list = ((List) (stringbuilder.toString()));
	//   53  113:aload           5
	//   54  115:invokevirtual   #102 <Method String StringBuilder.toString()>
	//   55  118:astore_1        
				obj = ((Object) (new StringBuilder()));
	//   56  119:new             #82  <Class StringBuilder>
	//   57  122:dup             
	//   58  123:invokespecial   #83  <Method void StringBuilder()>
	//   59  126:astore_2        
				((StringBuilder) (obj)).append(((String) (list)));
	//   60  127:aload_2         
	//   61  128:aload_1         
	//   62  129:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//   63  132:pop             
				((StringBuilder) (obj)).append("\",");
	//   64  133:aload_2         
	//   65  134:ldc1            #158 <String "\",">
	//   66  136:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//   67  139:pop             
			}

	//   68  140:aload_2         
	//   69  141:invokevirtual   #102 <Method String StringBuilder.toString()>
	//   70  144:astore_1        
	//*  71  145:goto            39
			obj = ((Object) (list));
	//   72  148:aload_1         
	//   73  149:astore_2        
			if(((String) (list)).length() > 0)
	//*  74  150:aload_1         
	//*  75  151:invokevirtual   #161 <Method int String.length()>
	//*  76  154:ifle            169
				obj = ((Object) (((String) (list)).substring(0, ((String) (list)).length() - 1)));
	//   77  157:aload_1         
	//   78  158:iconst_0        
	//   79  159:aload_1         
	//   80  160:invokevirtual   #161 <Method int String.length()>
	//   81  163:iconst_1        
	//   82  164:isub            
	//   83  165:invokevirtual   #165 <Method String String.substring(int, int)>
	//   84  168:astore_2        
			list = ((List) (new StringBuilder()));
	//   85  169:new             #82  <Class StringBuilder>
	//   86  172:dup             
	//   87  173:invokespecial   #83  <Method void StringBuilder()>
	//   88  176:astore_1        
			((StringBuilder) (list)).append(((String) (obj)));
	//   89  177:aload_1         
	//   90  178:aload_2         
	//   91  179:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//   92  182:pop             
			((StringBuilder) (list)).append("]");
	//   93  183:aload_1         
	//   94  184:ldc1            #167 <String "]">
	//   95  186:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//   96  189:pop             
			list = ((List) (((StringBuilder) (list)).toString()));
	//   97  190:aload_1         
	//   98  191:invokevirtual   #102 <Method String StringBuilder.toString()>
	//   99  194:astore_1        
			intent.putExtra("method", "method_del_tags");
	//  100  195:aload_3         
	//  101  196:ldc1            #55  <String "method">
	//  102  198:ldc1            #193 <String "method_del_tags">
	//  103  200:invokevirtual   #63  <Method Intent Intent.putExtra(String, String)>
	//  104  203:pop             
			intent.putExtra("tags", ((String) (list)));
	//  105  204:aload_3         
	//  106  205:ldc1            #171 <String "tags">
	//  107  207:aload_1         
	//  108  208:invokevirtual   #63  <Method Intent Intent.putExtra(String, String)>
	//  109  211:pop             
			b.a("PushManager", "a delTags intent send", context.getApplicationContext());
	//  110  212:ldc1            #11  <String "PushManager">
	//  111  214:ldc1            #195 <String "a delTags intent send">
	//  112  216:aload_0         
	//  113  217:invokevirtual   #32  <Method Context Context.getApplicationContext()>
	//  114  220:invokestatic    #37  <Method void b.a(String, String, Context)>
			com.baidu.android.pushservice.f.b(context, intent);
	//  115  223:aload_0         
	//  116  224:aload_3         
	//  117  225:invokestatic    #78  <Method void com.baidu.android.pushservice.f.b(Context, Intent)>
			return;
	//  118  228:return          
		} else
		{
			a.d("PushManager", "No tags specified, do nothing.");
	//  119  229:ldc1            #11  <String "PushManager">
	//  120  231:ldc1            #173 <String "No tags specified, do nothing.">
	//  121  233:invokestatic    #179 <Method void a.d(String, String)>
			return;
	//  122  236:return          
		}
	}

	public static void deleteMessages(Context context, String as[])
	{
		if(as == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       5
			return;
	//    2    4:return          
		Intent intent = com.baidu.android.pushservice.f.a(context);
	//    3    5:aload_0         
	//    4    6:invokestatic    #53  <Method Intent com.baidu.android.pushservice.f.a(Context)>
	//    5    9:astore_2        
		if(intent == null)
	//*   6   10:aload_2         
	//*   7   11:ifnonnull       15
		{
			return;
	//    8   14:return          
		} else
		{
			intent.putExtra("method", "method_delete");
	//    9   15:aload_2         
	//   10   16:ldc1            #55  <String "method">
	//   11   18:ldc1            #200 <String "method_delete">
	//   12   20:invokevirtual   #63  <Method Intent Intent.putExtra(String, String)>
	//   13   23:pop             
			intent.putExtra("msg_ids", as);
	//   14   24:aload_2         
	//   15   25:ldc1            #202 <String "msg_ids">
	//   16   27:aload_1         
	//   17   28:invokevirtual   #205 <Method Intent Intent.putExtra(String, String[])>
	//   18   31:pop             
			com.baidu.android.pushservice.f.b(context, intent);
	//   19   32:aload_0         
	//   20   33:aload_2         
	//   21   34:invokestatic    #78  <Method void com.baidu.android.pushservice.f.b(Context, Intent)>
			return;
	//   22   37:return          
		}
	}

	public static void disableLbs(Context context)
	{
		if(f.h(context))
	//*   0    0:aload_0         
	//*   1    1:invokestatic    #210 <Method boolean f.h(Context)>
	//*   2    4:ifeq            8
		{
			return;
	//    3    7:return          
		} else
		{
			com.baidu.android.pushservice.PushSettings.a(context, false);
	//    4    8:aload_0         
	//    5    9:iconst_0        
	//    6   10:invokestatic    #215 <Method void com.baidu.android.pushservice.PushSettings.a(Context, boolean)>
			return;
	//    7   13:return          
		}
	}

	public static void enableHuaweiProxy(Context context, boolean flag)
	{
		int i;
		if(flag)
	//*   0    0:iload_1         
	//*   1    1:ifeq            14
			i = 1;
	//    2    4:iconst_1        
	//    3    5:istore_2        
		else
	//*   4    6:aload_0         
	//*   5    7:ldc1            #218 <String "com.baidu.android.pushservice.PushSettings.hw_proxy_mode">
	//*   6    9:iload_2         
	//*   7   10:invokestatic    #223 <Method void m.a(Context, String, int)>
	//*   8   13:return          
			i = 0;
	//    9   14:iconst_0        
	//   10   15:istore_2        
		m.a(context, "com.baidu.android.pushservice.PushSettings.hw_proxy_mode", i);
	//*  11   16:goto            6
	}

	public static void enableLbs(Context context)
	{
		if(f.h(context))
	//*   0    0:aload_0         
	//*   1    1:invokestatic    #210 <Method boolean f.h(Context)>
	//*   2    4:ifeq            8
		{
			return;
	//    3    7:return          
		} else
		{
			com.baidu.android.pushservice.PushSettings.a(context, true);
	//    4    8:aload_0         
	//    5    9:iconst_1        
	//    6   10:invokestatic    #215 <Method void com.baidu.android.pushservice.PushSettings.a(Context, boolean)>
			return;
	//    7   13:return          
		}
	}

	public static void enableXiaomiProxy(Context context, boolean flag, String s, String s1)
	{
		if(TextUtils.isEmpty(((CharSequence) (s))))
	//*   0    0:aload_2         
	//*   1    1:invokestatic    #232 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   2    4:ifeq            17
		{
			a.d("PushManager", "appId is null!");
	//    3    7:ldc1            #11  <String "PushManager">
	//    4    9:ldc1            #234 <String "appId is null!">
	//    5   11:invokestatic    #179 <Method void a.d(String, String)>
		} else
	//*   6   14:goto            29
		{
			f.d = s;
	//    7   17:aload_2         
	//    8   18:putstatic       #236 <Field String f.d>
			m.a(context, "BD_PROXY_APPID_KEY", s);
	//    9   21:aload_0         
	//   10   22:ldc1            #238 <String "BD_PROXY_APPID_KEY">
	//   11   24:aload_2         
	//   12   25:invokestatic    #241 <Method boolean m.a(Context, String, String)>
	//   13   28:pop             
		}
		if(TextUtils.isEmpty(((CharSequence) (s1))))
	//*  14   29:aload_3         
	//*  15   30:invokestatic    #232 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  16   33:ifeq            46
		{
			a.d("PushManager", "appKey is null!");
	//   17   36:ldc1            #11  <String "PushManager">
	//   18   38:ldc1            #243 <String "appKey is null!">
	//   19   40:invokestatic    #179 <Method void a.d(String, String)>
		} else
	//*  20   43:goto            58
		{
			f.e = s1;
	//   21   46:aload_3         
	//   22   47:putstatic       #245 <Field String f.e>
			m.a(context, "BD_PROXY_APPKEY_KEY", s1);
	//   23   50:aload_0         
	//   24   51:ldc1            #247 <String "BD_PROXY_APPKEY_KEY">
	//   25   53:aload_3         
	//   26   54:invokestatic    #241 <Method boolean m.a(Context, String, String)>
	//   27   57:pop             
		}
		int i;
		if(flag)
	//*  28   58:iload_1         
	//*  29   59:ifeq            74
			i = 1;
	//   30   62:iconst_1        
	//   31   63:istore          4
		else
	//*  32   65:aload_0         
	//*  33   66:ldc1            #249 <String "com.baidu.android.pushservice.PushSettings.xm_proxy_mode">
	//*  34   68:iload           4
	//*  35   70:invokestatic    #223 <Method void m.a(Context, String, int)>
	//*  36   73:return          
			i = 0;
	//   37   74:iconst_0        
	//   38   75:istore          4
		m.a(context, "com.baidu.android.pushservice.PushSettings.xm_proxy_mode", i);
	//*  39   77:goto            65
	}

	public static void fetchGroupMessages(Context context, String s, int i, int j)
	{
		Intent intent = f.g(context);
	//    0    0:aload_0         
	//    1    1:invokestatic    #131 <Method Intent f.g(Context)>
	//    2    4:astore          4
		if(intent == null)
	//*   3    6:aload           4
	//*   4    8:ifnonnull       12
		{
			return;
	//    5   11:return          
		} else
		{
			intent.putExtra("method", "method_fetchgmsg");
	//    6   12:aload           4
	//    7   14:ldc1            #55  <String "method">
	//    8   16:ldc1            #253 <String "method_fetchgmsg">
	//    9   18:invokevirtual   #63  <Method Intent Intent.putExtra(String, String)>
	//   10   21:pop             
			intent.putExtra("gid", s);
	//   11   22:aload           4
	//   12   24:ldc1            #65  <String "gid">
	//   13   26:aload_1         
	//   14   27:invokevirtual   #63  <Method Intent Intent.putExtra(String, String)>
	//   15   30:pop             
			intent.putExtra("group_fetch_type", i);
	//   16   31:aload           4
	//   17   33:ldc1            #255 <String "group_fetch_type">
	//   18   35:iload_2         
	//   19   36:invokevirtual   #258 <Method Intent Intent.putExtra(String, int)>
	//   20   39:pop             
			intent.putExtra("group_fetch_num", j);
	//   21   40:aload           4
	//   22   42:ldc2            #260 <String "group_fetch_num">
	//   23   45:iload_3         
	//   24   46:invokevirtual   #258 <Method Intent Intent.putExtra(String, int)>
	//   25   49:pop             
			b.a("PushManager", "a fetchGroupMessages intent send", context.getApplicationContext());
	//   26   50:ldc1            #11  <String "PushManager">
	//   27   52:ldc2            #262 <String "a fetchGroupMessages intent send">
	//   28   55:aload_0         
	//   29   56:invokevirtual   #32  <Method Context Context.getApplicationContext()>
	//   30   59:invokestatic    #37  <Method void b.a(String, String, Context)>
			com.baidu.android.pushservice.f.b(context, intent);
	//   31   62:aload_0         
	//   32   63:aload           4
	//   33   65:invokestatic    #78  <Method void com.baidu.android.pushservice.f.b(Context, Intent)>
			return;
	//   34   68:return          
		}
	}

	public static void fetchMessages(Context context, int i, int j)
	{
		Intent intent = com.baidu.android.pushservice.f.a(context);
	//    0    0:aload_0         
	//    1    1:invokestatic    #53  <Method Intent com.baidu.android.pushservice.f.a(Context)>
	//    2    4:astore_3        
		if(intent == null)
	//*   3    5:aload_3         
	//*   4    6:ifnonnull       10
		{
			return;
	//    5    9:return          
		} else
		{
			intent.putExtra("method", "method_fetch");
	//    6   10:aload_3         
	//    7   11:ldc1            #55  <String "method">
	//    8   13:ldc2            #266 <String "method_fetch">
	//    9   16:invokevirtual   #63  <Method Intent Intent.putExtra(String, String)>
	//   10   19:pop             
			intent.putExtra("fetch_type", i);
	//   11   20:aload_3         
	//   12   21:ldc2            #268 <String "fetch_type">
	//   13   24:iload_1         
	//   14   25:invokevirtual   #258 <Method Intent Intent.putExtra(String, int)>
	//   15   28:pop             
			intent.putExtra("fetch_num", j);
	//   16   29:aload_3         
	//   17   30:ldc2            #270 <String "fetch_num">
	//   18   33:iload_2         
	//   19   34:invokevirtual   #258 <Method Intent Intent.putExtra(String, int)>
	//   20   37:pop             
			com.baidu.android.pushservice.f.b(context, intent);
	//   21   38:aload_0         
	//   22   39:aload_3         
	//   23   40:invokestatic    #78  <Method void com.baidu.android.pushservice.f.b(Context, Intent)>
			return;
	//   24   43:return          
		}
	}

	public static void getGroupInfo(Context context, String s)
	{
		Intent intent = f.g(context);
	//    0    0:aload_0         
	//    1    1:invokestatic    #131 <Method Intent f.g(Context)>
	//    2    4:astore_2        
		if(intent == null)
	//*   3    5:aload_2         
	//*   4    6:ifnonnull       10
		{
			return;
	//    5    9:return          
		} else
		{
			intent.putExtra("method", "method_ginfo");
	//    6   10:aload_2         
	//    7   11:ldc1            #55  <String "method">
	//    8   13:ldc2            #273 <String "method_ginfo">
	//    9   16:invokevirtual   #63  <Method Intent Intent.putExtra(String, String)>
	//   10   19:pop             
			intent.putExtra("gid", s);
	//   11   20:aload_2         
	//   12   21:ldc1            #65  <String "gid">
	//   13   23:aload_1         
	//   14   24:invokevirtual   #63  <Method Intent Intent.putExtra(String, String)>
	//   15   27:pop             
			b.a("PushManager", "a getGroupInfo intent send", context.getApplicationContext());
	//   16   28:ldc1            #11  <String "PushManager">
	//   17   30:ldc2            #275 <String "a getGroupInfo intent send">
	//   18   33:aload_0         
	//   19   34:invokevirtual   #32  <Method Context Context.getApplicationContext()>
	//   20   37:invokestatic    #37  <Method void b.a(String, String, Context)>
			com.baidu.android.pushservice.f.b(context, intent);
	//   21   40:aload_0         
	//   22   41:aload_2         
	//   23   42:invokestatic    #78  <Method void com.baidu.android.pushservice.f.b(Context, Intent)>
			return;
	//   24   45:return          
		}
	}

	public static void getGroupList(Context context)
	{
		Intent intent = f.g(context);
	//    0    0:aload_0         
	//    1    1:invokestatic    #131 <Method Intent f.g(Context)>
	//    2    4:astore_1        
		if(intent == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       10
		{
			return;
	//    5    9:return          
		} else
		{
			intent.putExtra("method", "method_glist");
	//    6   10:aload_1         
	//    7   11:ldc1            #55  <String "method">
	//    8   13:ldc2            #278 <String "method_glist">
	//    9   16:invokevirtual   #63  <Method Intent Intent.putExtra(String, String)>
	//   10   19:pop             
			b.a("PushManager", "a getGroupList intent send", context.getApplicationContext());
	//   11   20:ldc1            #11  <String "PushManager">
	//   12   22:ldc2            #280 <String "a getGroupList intent send">
	//   13   25:aload_0         
	//   14   26:invokevirtual   #32  <Method Context Context.getApplicationContext()>
	//   15   29:invokestatic    #37  <Method void b.a(String, String, Context)>
			com.baidu.android.pushservice.f.b(context, intent);
	//   16   32:aload_0         
	//   17   33:aload_1         
	//   18   34:invokestatic    #78  <Method void com.baidu.android.pushservice.f.b(Context, Intent)>
			return;
	//   19   37:return          
		}
	}

	public static void getGroupMessageCounts(Context context, String s)
	{
		Intent intent = f.g(context);
	//    0    0:aload_0         
	//    1    1:invokestatic    #131 <Method Intent f.g(Context)>
	//    2    4:astore_2        
		if(intent == null)
	//*   3    5:aload_2         
	//*   4    6:ifnonnull       10
		{
			return;
	//    5    9:return          
		} else
		{
			intent.putExtra("method", "method_countgmsg");
	//    6   10:aload_2         
	//    7   11:ldc1            #55  <String "method">
	//    8   13:ldc2            #283 <String "method_countgmsg">
	//    9   16:invokevirtual   #63  <Method Intent Intent.putExtra(String, String)>
	//   10   19:pop             
			intent.putExtra("gid", s);
	//   11   20:aload_2         
	//   12   21:ldc1            #65  <String "gid">
	//   13   23:aload_1         
	//   14   24:invokevirtual   #63  <Method Intent Intent.putExtra(String, String)>
	//   15   27:pop             
			b.a("PushManager", "a getGroupMessageCounts intent send", context.getApplicationContext());
	//   16   28:ldc1            #11  <String "PushManager">
	//   17   30:ldc2            #285 <String "a getGroupMessageCounts intent send">
	//   18   33:aload_0         
	//   19   34:invokevirtual   #32  <Method Context Context.getApplicationContext()>
	//   20   37:invokestatic    #37  <Method void b.a(String, String, Context)>
			com.baidu.android.pushservice.f.b(context, intent);
	//   21   40:aload_0         
	//   22   41:aload_2         
	//   23   42:invokestatic    #78  <Method void com.baidu.android.pushservice.f.b(Context, Intent)>
			return;
	//   24   45:return          
		}
	}

	public static String getHWNotifyCheckInfo(Context context, Intent intent)
	{
		if(intent == null)
			break MISSING_BLOCK_LABEL_19;
	//    0    0:aload_1         
	//    1    1:ifnull          19
		context = ((Context) (f.d(context, intent)));
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokestatic    #291 <Method String f.d(Context, Intent)>
	//    5    9:astore_0        
		return ((String) (context));
	//    6   10:aload_0         
	//    7   11:areturn         
		context;
	//    8   12:astore_0        
		a.a("PushManager", ((Throwable) (context)));
	//    9   13:ldc1            #11  <String "PushManager">
	//   10   15:aload_0         
	//   11   16:invokestatic    #294 <Method void a.a(String, Throwable)>
		return null;
	//   12   19:aconst_null     
	//   13   20:areturn         
	}

	public static String getHWNotifySignInfo(Context context, Intent intent)
	{
		if(intent == null)
			break MISSING_BLOCK_LABEL_19;
	//    0    0:aload_1         
	//    1    1:ifnull          19
		context = ((Context) (f.c(context, intent)));
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokestatic    #297 <Method String f.c(Context, Intent)>
	//    5    9:astore_0        
		return ((String) (context));
	//    6   10:aload_0         
	//    7   11:areturn         
		context;
	//    8   12:astore_0        
		a.a("PushManager", ((Throwable) (context)));
	//    9   13:ldc1            #11  <String "PushManager">
	//   10   15:aload_0         
	//   11   16:invokestatic    #294 <Method void a.a(String, Throwable)>
		return null;
	//   12   19:aconst_null     
	//   13   20:areturn         
	}

	public static void getLappBindState(Context context, String s)
	{
		if(f.h(context))
	//*   0    0:aload_0         
	//*   1    1:invokestatic    #210 <Method boolean f.h(Context)>
	//*   2    4:ifeq            8
		{
			return;
	//    3    7:return          
		} else
		{
			s = ((String) (createLappMethodIntent(context, s)));
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokestatic    #300 <Method Intent createLappMethodIntent(Context, String)>
	//    7   13:astore_1        
			((Intent) (s)).putExtra("method", "method_get_lapp_bind_state");
	//    8   14:aload_1         
	//    9   15:ldc1            #55  <String "method">
	//   10   17:ldc2            #302 <String "method_get_lapp_bind_state">
	//   11   20:invokevirtual   #63  <Method Intent Intent.putExtra(String, String)>
	//   12   23:pop             
			com.baidu.android.pushservice.f.b(context, ((Intent) (s)));
	//   13   24:aload_0         
	//   14   25:aload_1         
	//   15   26:invokestatic    #78  <Method void com.baidu.android.pushservice.f.b(Context, Intent)>
			return;
	//   16   29:return          
		}
	}

	public static void getMessageCounts(Context context)
	{
		Intent intent = com.baidu.android.pushservice.f.a(context);
	//    0    0:aload_0         
	//    1    1:invokestatic    #53  <Method Intent com.baidu.android.pushservice.f.a(Context)>
	//    2    4:astore_1        
		if(intent == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       10
		{
			return;
	//    5    9:return          
		} else
		{
			intent.putExtra("method", "method_count");
	//    6   10:aload_1         
	//    7   11:ldc1            #55  <String "method">
	//    8   13:ldc2            #305 <String "method_count">
	//    9   16:invokevirtual   #63  <Method Intent Intent.putExtra(String, String)>
	//   10   19:pop             
			com.baidu.android.pushservice.f.b(context, intent);
	//   11   20:aload_0         
	//   12   21:aload_1         
	//   13   22:invokestatic    #78  <Method void com.baidu.android.pushservice.f.b(Context, Intent)>
			return;
	//   14   25:return          
		}
	}

	public static int getProxyType(Context context)
	{
		ModeConfig.getInstance(context);
	//    0    0:aload_0         
	//    1    1:invokestatic    #313 <Method ModeConfig ModeConfig.getInstance(Context)>
	//    2    4:pop             
		if(ModeConfig.isHuaweiProxyMode(context))
	//*   3    5:aload_0         
	//*   4    6:invokestatic    #316 <Method boolean ModeConfig.isHuaweiProxyMode(Context)>
	//*   5    9:ifeq            14
			return 1;
	//    6   12:iconst_1        
	//    7   13:ireturn         
		ModeConfig.getInstance(context);
	//    8   14:aload_0         
	//    9   15:invokestatic    #313 <Method ModeConfig ModeConfig.getInstance(Context)>
	//   10   18:pop             
		return !ModeConfig.isXiaomiProxyMode(context) ? 0 : 2;
	//   11   19:aload_0         
	//   12   20:invokestatic    #319 <Method boolean ModeConfig.isXiaomiProxyMode(Context)>
	//   13   23:ifeq            28
	//   14   26:iconst_2        
	//   15   27:ireturn         
	//   16   28:iconst_0        
	//   17   29:ireturn         
	}

	public static boolean hwMessageVerify(Context context, String s, String s1)
	{
		if(TextUtils.isEmpty(((CharSequence) (s))) || s1 == null)
			break MISSING_BLOCK_LABEL_27;
	//    0    0:aload_1         
	//    1    1:invokestatic    #232 <Method boolean TextUtils.isEmpty(CharSequence)>
	//    2    4:ifne            27
	//    3    7:aload_2         
	//    4    8:ifnull          27
		boolean flag = com.baidu.android.pushservice.f.a(context, s, s1);
	//    5   11:aload_0         
	//    6   12:aload_1         
	//    7   13:aload_2         
	//    8   14:invokestatic    #321 <Method boolean com.baidu.android.pushservice.f.a(Context, String, String)>
	//    9   17:istore_3        
		return flag;
	//   10   18:iload_3         
	//   11   19:ireturn         
		context;
	//   12   20:astore_0        
		a.a("PushManager", ((Throwable) (context)));
	//   13   21:ldc1            #11  <String "PushManager">
	//   14   23:aload_0         
	//   15   24:invokestatic    #294 <Method void a.a(String, Throwable)>
		return false;
	//   16   27:iconst_0        
	//   17   28:ireturn         
	}

	public static void insertPassThroughMessageClick(Context context, String s, String s1)
	{
		if(s == null || s1 == null)
			break MISSING_BLOCK_LABEL_171;
	//    0    0:aload_1         
	//    1    1:ifnull          171
	//    2    4:aload_2         
	//    3    5:ifnull          171
		Intent intent = new Intent();
	//    4    8:new             #59  <Class Intent>
	//    5   11:dup             
	//    6   12:invokespecial   #324 <Method void Intent()>
	//    7   15:astore          4
		if(intent == null)
			break MISSING_BLOCK_LABEL_171;
	//    8   17:aload           4
	//    9   19:ifnull          171
		String s2;
		if(ModeConfig.isProxyMode(context))
	//*  10   22:aload_0         
	//*  11   23:invokestatic    #327 <Method boolean ModeConfig.isProxyMode(Context)>
	//*  12   26:ifeq            37
		{
			s2 = context.getPackageName();
	//   13   29:aload_0         
	//   14   30:invokevirtual   #330 <Method String Context.getPackageName()>
	//   15   33:astore_3        
			break MISSING_BLOCK_LABEL_42;
	//   16   34:goto            42
		}
		s2 = u.y(context);
	//   17   37:aload_0         
	//   18   38:invokestatic    #334 <Method String u.y(Context)>
	//   19   41:astore_3        
		if(s2 != null)
	//*  20   42:aload_3         
	//*  21   43:ifnull          171
		{
			try
			{
				StringBuilder stringbuilder = new StringBuilder();
	//   22   46:new             #82  <Class StringBuilder>
	//   23   49:dup             
	//   24   50:invokespecial   #83  <Method void StringBuilder()>
	//   25   53:astore          5
				stringbuilder.append("PassThroughMessageClick  : ");
	//   26   55:aload           5
	//   27   57:ldc2            #336 <String "PassThroughMessageClick  : ">
	//   28   60:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//   29   63:pop             
				stringbuilder.append(s2);
	//   30   64:aload           5
	//   31   66:aload_3         
	//   32   67:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//   33   70:pop             
				b.a("PushManager", stringbuilder.toString(), context.getApplicationContext());
	//   34   71:ldc1            #11  <String "PushManager">
	//   35   73:aload           5
	//   36   75:invokevirtual   #102 <Method String StringBuilder.toString()>
	//   37   78:aload_0         
	//   38   79:invokevirtual   #32  <Method Context Context.getApplicationContext()>
	//   39   82:invokestatic    #37  <Method void b.a(String, String, Context)>
				intent.putExtra("app_id", s1);
	//   40   85:aload           4
	//   41   87:ldc2            #338 <String "app_id">
	//   42   90:aload_2         
	//   43   91:invokevirtual   #63  <Method Intent Intent.putExtra(String, String)>
	//   44   94:pop             
				intent.putExtra("msg_id", s);
	//   45   95:aload           4
	//   46   97:ldc2            #340 <String "msg_id">
	//   47  100:aload_1         
	//   48  101:invokevirtual   #63  <Method Intent Intent.putExtra(String, String)>
	//   49  104:pop             
				intent.setAction("com.baidu.android.pushservice.action.passthrough.notification.CLICK");
	//   50  105:aload           4
	//   51  107:ldc2            #342 <String "com.baidu.android.pushservice.action.passthrough.notification.CLICK">
	//   52  110:invokevirtual   #346 <Method Intent Intent.setAction(String)>
	//   53  113:pop             
				intent.setClassName(s2, "com.baidu.android.pushservice.CommandService");
	//   54  114:aload           4
	//   55  116:aload_3         
	//   56  117:ldc2            #348 <String "com.baidu.android.pushservice.CommandService">
	//   57  120:invokevirtual   #351 <Method Intent Intent.setClassName(String, String)>
	//   58  123:pop             
				context.startService(intent);
	//   59  124:aload_0         
	//   60  125:aload           4
	//   61  127:invokevirtual   #355 <Method android.content.ComponentName Context.startService(Intent)>
	//   62  130:pop             
				return;
	//   63  131:return          
			}
			// Misplaced declaration of an exception variable
			catch(String s)
	//*  64  132:astore_1        
			{
				s1 = ((String) (new StringBuilder()));
	//   65  133:new             #82  <Class StringBuilder>
	//   66  136:dup             
	//   67  137:invokespecial   #83  <Method void StringBuilder()>
	//   68  140:astore_2        
			}
			((StringBuilder) (s1)).append("error ");
	//   69  141:aload_2         
	//   70  142:ldc2            #357 <String "error ">
	//   71  145:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//   72  148:pop             
			((StringBuilder) (s1)).append(((Exception) (s)).getMessage());
	//   73  149:aload_2         
	//   74  150:aload_1         
	//   75  151:invokevirtual   #360 <Method String Exception.getMessage()>
	//   76  154:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//   77  157:pop             
			b.b("PushManager", ((StringBuilder) (s1)).toString(), context.getApplicationContext());
	//   78  158:ldc1            #11  <String "PushManager">
	//   79  160:aload_2         
	//   80  161:invokevirtual   #102 <Method String StringBuilder.toString()>
	//   81  164:aload_0         
	//   82  165:invokevirtual   #32  <Method Context Context.getApplicationContext()>
	//   83  168:invokestatic    #362 <Method void b.b(String, String, Context)>
		}
	//   84  171:return          
	}

	public static void insertPassThroughMessageDelete(Context context, String s, String s1)
	{
		if(s == null || s1 == null)
			break MISSING_BLOCK_LABEL_171;
	//    0    0:aload_1         
	//    1    1:ifnull          171
	//    2    4:aload_2         
	//    3    5:ifnull          171
		Intent intent = new Intent();
	//    4    8:new             #59  <Class Intent>
	//    5   11:dup             
	//    6   12:invokespecial   #324 <Method void Intent()>
	//    7   15:astore          4
		if(intent == null)
			break MISSING_BLOCK_LABEL_171;
	//    8   17:aload           4
	//    9   19:ifnull          171
		String s2;
		if(ModeConfig.isProxyMode(context))
	//*  10   22:aload_0         
	//*  11   23:invokestatic    #327 <Method boolean ModeConfig.isProxyMode(Context)>
	//*  12   26:ifeq            37
		{
			s2 = context.getPackageName();
	//   13   29:aload_0         
	//   14   30:invokevirtual   #330 <Method String Context.getPackageName()>
	//   15   33:astore_3        
			break MISSING_BLOCK_LABEL_42;
	//   16   34:goto            42
		}
		s2 = u.y(context);
	//   17   37:aload_0         
	//   18   38:invokestatic    #334 <Method String u.y(Context)>
	//   19   41:astore_3        
		if(s2 != null)
	//*  20   42:aload_3         
	//*  21   43:ifnull          171
		{
			try
			{
				StringBuilder stringbuilder = new StringBuilder();
	//   22   46:new             #82  <Class StringBuilder>
	//   23   49:dup             
	//   24   50:invokespecial   #83  <Method void StringBuilder()>
	//   25   53:astore          5
				stringbuilder.append("PassThroughMessageDelete  : ");
	//   26   55:aload           5
	//   27   57:ldc2            #365 <String "PassThroughMessageDelete  : ">
	//   28   60:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//   29   63:pop             
				stringbuilder.append(s2);
	//   30   64:aload           5
	//   31   66:aload_3         
	//   32   67:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//   33   70:pop             
				b.a("PushManager", stringbuilder.toString(), context.getApplicationContext());
	//   34   71:ldc1            #11  <String "PushManager">
	//   35   73:aload           5
	//   36   75:invokevirtual   #102 <Method String StringBuilder.toString()>
	//   37   78:aload_0         
	//   38   79:invokevirtual   #32  <Method Context Context.getApplicationContext()>
	//   39   82:invokestatic    #37  <Method void b.a(String, String, Context)>
				intent.putExtra("app_id", s1);
	//   40   85:aload           4
	//   41   87:ldc2            #338 <String "app_id">
	//   42   90:aload_2         
	//   43   91:invokevirtual   #63  <Method Intent Intent.putExtra(String, String)>
	//   44   94:pop             
				intent.putExtra("msg_id", s);
	//   45   95:aload           4
	//   46   97:ldc2            #340 <String "msg_id">
	//   47  100:aload_1         
	//   48  101:invokevirtual   #63  <Method Intent Intent.putExtra(String, String)>
	//   49  104:pop             
				intent.setAction("com.baidu.android.pushservice.action.passthrough.notification.DELETE");
	//   50  105:aload           4
	//   51  107:ldc2            #367 <String "com.baidu.android.pushservice.action.passthrough.notification.DELETE">
	//   52  110:invokevirtual   #346 <Method Intent Intent.setAction(String)>
	//   53  113:pop             
				intent.setClassName(s2, "com.baidu.android.pushservice.CommandService");
	//   54  114:aload           4
	//   55  116:aload_3         
	//   56  117:ldc2            #348 <String "com.baidu.android.pushservice.CommandService">
	//   57  120:invokevirtual   #351 <Method Intent Intent.setClassName(String, String)>
	//   58  123:pop             
				context.startService(intent);
	//   59  124:aload_0         
	//   60  125:aload           4
	//   61  127:invokevirtual   #355 <Method android.content.ComponentName Context.startService(Intent)>
	//   62  130:pop             
				return;
	//   63  131:return          
			}
			// Misplaced declaration of an exception variable
			catch(String s)
	//*  64  132:astore_1        
			{
				s1 = ((String) (new StringBuilder()));
	//   65  133:new             #82  <Class StringBuilder>
	//   66  136:dup             
	//   67  137:invokespecial   #83  <Method void StringBuilder()>
	//   68  140:astore_2        
			}
			((StringBuilder) (s1)).append("error ");
	//   69  141:aload_2         
	//   70  142:ldc2            #357 <String "error ">
	//   71  145:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//   72  148:pop             
			((StringBuilder) (s1)).append(((Exception) (s)).getMessage());
	//   73  149:aload_2         
	//   74  150:aload_1         
	//   75  151:invokevirtual   #360 <Method String Exception.getMessage()>
	//   76  154:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//   77  157:pop             
			b.b("PushManager", ((StringBuilder) (s1)).toString(), context.getApplicationContext());
	//   78  158:ldc1            #11  <String "PushManager">
	//   79  160:aload_2         
	//   80  161:invokevirtual   #102 <Method String StringBuilder.toString()>
	//   81  164:aload_0         
	//   82  165:invokevirtual   #32  <Method Context Context.getApplicationContext()>
	//   83  168:invokestatic    #362 <Method void b.b(String, String, Context)>
		}
	//   84  171:return          
	}

	public static void insertPassThroughMessageNotified(Context context, String s, String s1)
	{
		if(s == null || s1 == null)
			break MISSING_BLOCK_LABEL_171;
	//    0    0:aload_1         
	//    1    1:ifnull          171
	//    2    4:aload_2         
	//    3    5:ifnull          171
		Intent intent = new Intent();
	//    4    8:new             #59  <Class Intent>
	//    5   11:dup             
	//    6   12:invokespecial   #324 <Method void Intent()>
	//    7   15:astore          4
		if(intent == null)
			break MISSING_BLOCK_LABEL_171;
	//    8   17:aload           4
	//    9   19:ifnull          171
		String s2;
		if(ModeConfig.isProxyMode(context))
	//*  10   22:aload_0         
	//*  11   23:invokestatic    #327 <Method boolean ModeConfig.isProxyMode(Context)>
	//*  12   26:ifeq            37
		{
			s2 = context.getPackageName();
	//   13   29:aload_0         
	//   14   30:invokevirtual   #330 <Method String Context.getPackageName()>
	//   15   33:astore_3        
			break MISSING_BLOCK_LABEL_42;
	//   16   34:goto            42
		}
		s2 = u.y(context);
	//   17   37:aload_0         
	//   18   38:invokestatic    #334 <Method String u.y(Context)>
	//   19   41:astore_3        
		if(s2 != null)
	//*  20   42:aload_3         
	//*  21   43:ifnull          171
		{
			try
			{
				StringBuilder stringbuilder = new StringBuilder();
	//   22   46:new             #82  <Class StringBuilder>
	//   23   49:dup             
	//   24   50:invokespecial   #83  <Method void StringBuilder()>
	//   25   53:astore          5
				stringbuilder.append("PassThroughMessageNotified  : ");
	//   26   55:aload           5
	//   27   57:ldc2            #370 <String "PassThroughMessageNotified  : ">
	//   28   60:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//   29   63:pop             
				stringbuilder.append(s2);
	//   30   64:aload           5
	//   31   66:aload_3         
	//   32   67:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//   33   70:pop             
				b.a("PushManager", stringbuilder.toString(), context.getApplicationContext());
	//   34   71:ldc1            #11  <String "PushManager">
	//   35   73:aload           5
	//   36   75:invokevirtual   #102 <Method String StringBuilder.toString()>
	//   37   78:aload_0         
	//   38   79:invokevirtual   #32  <Method Context Context.getApplicationContext()>
	//   39   82:invokestatic    #37  <Method void b.a(String, String, Context)>
				intent.putExtra("app_id", s1);
	//   40   85:aload           4
	//   41   87:ldc2            #338 <String "app_id">
	//   42   90:aload_2         
	//   43   91:invokevirtual   #63  <Method Intent Intent.putExtra(String, String)>
	//   44   94:pop             
				intent.putExtra("msg_id", s);
	//   45   95:aload           4
	//   46   97:ldc2            #340 <String "msg_id">
	//   47  100:aload_1         
	//   48  101:invokevirtual   #63  <Method Intent Intent.putExtra(String, String)>
	//   49  104:pop             
				intent.setAction("com.baidu.android.pushservice.action.passthrough.notification.NOTIFIED");
	//   50  105:aload           4
	//   51  107:ldc2            #372 <String "com.baidu.android.pushservice.action.passthrough.notification.NOTIFIED">
	//   52  110:invokevirtual   #346 <Method Intent Intent.setAction(String)>
	//   53  113:pop             
				intent.setClassName(s2, "com.baidu.android.pushservice.CommandService");
	//   54  114:aload           4
	//   55  116:aload_3         
	//   56  117:ldc2            #348 <String "com.baidu.android.pushservice.CommandService">
	//   57  120:invokevirtual   #351 <Method Intent Intent.setClassName(String, String)>
	//   58  123:pop             
				context.startService(intent);
	//   59  124:aload_0         
	//   60  125:aload           4
	//   61  127:invokevirtual   #355 <Method android.content.ComponentName Context.startService(Intent)>
	//   62  130:pop             
				return;
	//   63  131:return          
			}
			// Misplaced declaration of an exception variable
			catch(String s)
	//*  64  132:astore_1        
			{
				s1 = ((String) (new StringBuilder()));
	//   65  133:new             #82  <Class StringBuilder>
	//   66  136:dup             
	//   67  137:invokespecial   #83  <Method void StringBuilder()>
	//   68  140:astore_2        
			}
			((StringBuilder) (s1)).append("error ");
	//   69  141:aload_2         
	//   70  142:ldc2            #357 <String "error ">
	//   71  145:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//   72  148:pop             
			((StringBuilder) (s1)).append(((Exception) (s)).getMessage());
	//   73  149:aload_2         
	//   74  150:aload_1         
	//   75  151:invokevirtual   #360 <Method String Exception.getMessage()>
	//   76  154:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//   77  157:pop             
			b.b("PushManager", ((StringBuilder) (s1)).toString(), context.getApplicationContext());
	//   78  158:ldc1            #11  <String "PushManager">
	//   79  160:aload_2         
	//   80  161:invokevirtual   #102 <Method String StringBuilder.toString()>
	//   81  164:aload_0         
	//   82  165:invokevirtual   #32  <Method Context Context.getApplicationContext()>
	//   83  168:invokestatic    #362 <Method void b.b(String, String, Context)>
		}
	//   84  171:return          
	}

	public static boolean isPushEnabled(Context context)
	{
		if(f.h(context))
	//*   0    0:aload_0         
	//*   1    1:invokestatic    #210 <Method boolean f.h(Context)>
	//*   2    4:ifeq            9
			return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		else
			return u.c(context) ^ true;
	//    5    9:aload_0         
	//    6   10:invokestatic    #375 <Method boolean u.c(Context)>
	//    7   13:iconst_1        
	//    8   14:ixor            
	//    9   15:ireturn         
	}

	private static void lightAppBind(Context context, int i, String s)
	{
		Intent intent = f.g(context);
	//    0    0:aload_0         
	//    1    1:invokestatic    #131 <Method Intent f.g(Context)>
	//    2    4:astore_3        
		if(intent == null)
	//*   3    5:aload_3         
	//*   4    6:ifnonnull       10
		{
			return;
	//    5    9:return          
		} else
		{
			intent.putExtra("method", "method_deal_lapp_bind_intent");
	//    6   10:aload_3         
	//    7   11:ldc1            #55  <String "method">
	//    8   13:ldc2            #377 <String "method_deal_lapp_bind_intent">
	//    9   16:invokevirtual   #63  <Method Intent Intent.putExtra(String, String)>
	//   10   19:pop             
			intent.putExtra("bind_name", Build.MODEL);
	//   11   20:aload_3         
	//   12   21:ldc2            #379 <String "bind_name">
	//   13   24:getstatic       #384 <Field String Build.MODEL>
	//   14   27:invokevirtual   #63  <Method Intent Intent.putExtra(String, String)>
	//   15   30:pop             
			intent.putExtra("bind_status", i);
	//   16   31:aload_3         
	//   17   32:ldc2            #386 <String "bind_status">
	//   18   35:iload_1         
	//   19   36:invokevirtual   #258 <Method Intent Intent.putExtra(String, int)>
	//   20   39:pop             
			intent.putExtra("push_sdk_version", ((int) (com.baidu.android.pushservice.a.a())));
	//   21   40:aload_3         
	//   22   41:ldc2            #388 <String "push_sdk_version">
	//   23   44:invokestatic    #393 <Method short com.baidu.android.pushservice.a.a()>
	//   24   47:invokevirtual   #258 <Method Intent Intent.putExtra(String, int)>
	//   25   50:pop             
			intent.putExtra("secret_key", s);
	//   26   51:aload_3         
	//   27   52:ldc1            #122 <String "secret_key">
	//   28   54:aload_2         
	//   29   55:invokevirtual   #63  <Method Intent Intent.putExtra(String, String)>
	//   30   58:pop             
			intent.setFlags(intent.getFlags() | 0x20);
	//   31   59:aload_3         
	//   32   60:aload_3         
	//   33   61:invokevirtual   #69  <Method int Intent.getFlags()>
	//   34   64:bipush          32
	//   35   66:ior             
	//   36   67:invokevirtual   #73  <Method Intent Intent.setFlags(int)>
	//   37   70:pop             
			com.baidu.android.pushservice.f.b(context, intent);
	//   38   71:aload_0         
	//   39   72:aload_3         
	//   40   73:invokestatic    #78  <Method void com.baidu.android.pushservice.f.b(Context, Intent)>
			return;
	//   41   76:return          
		}
	}

	public static void listSDKTags(Context context, String s)
	{
		Intent intent = u.f(context);
	//    0    0:aload_0         
	//    1    1:invokestatic    #185 <Method Intent u.f(Context)>
	//    2    4:astore_2        
		if(intent == null)
	//*   3    5:aload_2         
	//*   4    6:ifnonnull       10
		{
			return;
	//    5    9:return          
		} else
		{
			intent.putExtra("secret_key", s);
	//    6   10:aload_2         
	//    7   11:ldc1            #122 <String "secret_key">
	//    8   13:aload_1         
	//    9   14:invokevirtual   #63  <Method Intent Intent.putExtra(String, String)>
	//   10   17:pop             
			intent.putExtra("method", "method_list_sdk_tags");
	//   11   18:aload_2         
	//   12   19:ldc1            #55  <String "method">
	//   13   21:ldc2            #396 <String "method_list_sdk_tags">
	//   14   24:invokevirtual   #63  <Method Intent Intent.putExtra(String, String)>
	//   15   27:pop             
			b.a("PushManager", "a listSDKTags intent send", context.getApplicationContext());
	//   16   28:ldc1            #11  <String "PushManager">
	//   17   30:ldc2            #398 <String "a listSDKTags intent send">
	//   18   33:aload_0         
	//   19   34:invokevirtual   #32  <Method Context Context.getApplicationContext()>
	//   20   37:invokestatic    #37  <Method void b.a(String, String, Context)>
			com.baidu.android.pushservice.f.b(context, intent);
	//   21   40:aload_0         
	//   22   41:aload_2         
	//   23   42:invokestatic    #78  <Method void com.baidu.android.pushservice.f.b(Context, Intent)>
			return;
	//   24   45:return          
		}
	}

	public static void listTags(Context context)
	{
		Intent intent = com.baidu.android.pushservice.f.a(context);
	//    0    0:aload_0         
	//    1    1:invokestatic    #53  <Method Intent com.baidu.android.pushservice.f.a(Context)>
	//    2    4:astore_1        
		if(intent == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       10
		{
			return;
	//    5    9:return          
		} else
		{
			intent.putExtra("method", "method_listtags");
	//    6   10:aload_1         
	//    7   11:ldc1            #55  <String "method">
	//    8   13:ldc2            #401 <String "method_listtags">
	//    9   16:invokevirtual   #63  <Method Intent Intent.putExtra(String, String)>
	//   10   19:pop             
			b.a("PushManager", "a listTags intent send", context.getApplicationContext());
	//   11   20:ldc1            #11  <String "PushManager">
	//   12   22:ldc2            #403 <String "a listTags intent send">
	//   13   25:aload_0         
	//   14   26:invokevirtual   #32  <Method Context Context.getApplicationContext()>
	//   15   29:invokestatic    #37  <Method void b.a(String, String, Context)>
			com.baidu.android.pushservice.f.b(context, intent);
	//   16   32:aload_0         
	//   17   33:aload_1         
	//   18   34:invokestatic    #78  <Method void com.baidu.android.pushservice.f.b(Context, Intent)>
			return;
	//   19   37:return          
		}
	}

	public static void resumeWork(Context context)
	{
		if(f.h(context))
	//*   0    0:aload_0         
	//*   1    1:invokestatic    #210 <Method boolean f.h(Context)>
	//*   2    4:ifeq            8
		{
			return;
	//    3    7:return          
		} else
		{
			com.baidu.android.pushservice.a.b(context, true);
	//    4    8:aload_0         
	//    5    9:iconst_1        
	//    6   10:invokestatic    #406 <Method void com.baidu.android.pushservice.a.b(Context, boolean)>
			u.a(context, true, true);
	//    7   13:aload_0         
	//    8   14:iconst_1        
	//    9   15:iconst_1        
	//   10   16:invokestatic    #409 <Method void u.a(Context, boolean, boolean)>
			com.baidu.android.pushservice.a.a(context, true);
	//   11   19:aload_0         
	//   12   20:iconst_1        
	//   13   21:invokestatic    #410 <Method void com.baidu.android.pushservice.a.a(Context, boolean)>
			t.a(context);
	//   14   24:aload_0         
	//   15   25:invokestatic    #107 <Method void t.a(Context)>
			bind(context, 0);
	//   16   28:aload_0         
	//   17   29:iconst_0        
	//   18   30:invokestatic    #115 <Method void bind(Context, int)>
			return;
	//   19   33:return          
		}
	}

	private static void sdkBind(Context context, int i, String s, int j)
	{
		Intent intent = u.f(context);
	//    0    0:aload_0         
	//    1    1:invokestatic    #185 <Method Intent u.f(Context)>
	//    2    4:astore          4
		if(intent == null)
	//*   3    6:aload           4
	//*   4    8:ifnonnull       12
		{
			return;
	//    5   11:return          
		} else
		{
			intent.putExtra("method", "method_sdk_bind");
	//    6   12:aload           4
	//    7   14:ldc1            #55  <String "method">
	//    8   16:ldc2            #414 <String "method_sdk_bind">
	//    9   19:invokevirtual   #63  <Method Intent Intent.putExtra(String, String)>
	//   10   22:pop             
			intent.putExtra("bind_name", Build.MODEL);
	//   11   23:aload           4
	//   12   25:ldc2            #379 <String "bind_name">
	//   13   28:getstatic       #384 <Field String Build.MODEL>
	//   14   31:invokevirtual   #63  <Method Intent Intent.putExtra(String, String)>
	//   15   34:pop             
			intent.putExtra("bind_status", i);
	//   16   35:aload           4
	//   17   37:ldc2            #386 <String "bind_status">
	//   18   40:iload_1         
	//   19   41:invokevirtual   #258 <Method Intent Intent.putExtra(String, int)>
	//   20   44:pop             
			intent.putExtra("push_sdk_version", ((int) (com.baidu.android.pushservice.a.a())));
	//   21   45:aload           4
	//   22   47:ldc2            #388 <String "push_sdk_version">
	//   23   50:invokestatic    #393 <Method short com.baidu.android.pushservice.a.a()>
	//   24   53:invokevirtual   #258 <Method Intent Intent.putExtra(String, int)>
	//   25   56:pop             
			intent.putExtra("secret_key", s);
	//   26   57:aload           4
	//   27   59:ldc1            #122 <String "secret_key">
	//   28   61:aload_2         
	//   29   62:invokevirtual   #63  <Method Intent Intent.putExtra(String, String)>
	//   30   65:pop             
			intent.putExtra("sdk_client_version", j);
	//   31   66:aload           4
	//   32   68:ldc2            #416 <String "sdk_client_version">
	//   33   71:iload_3         
	//   34   72:invokevirtual   #258 <Method Intent Intent.putExtra(String, int)>
	//   35   75:pop             
			intent.setFlags(intent.getFlags() | 0x20);
	//   36   76:aload           4
	//   37   78:aload           4
	//   38   80:invokevirtual   #69  <Method int Intent.getFlags()>
	//   39   83:bipush          32
	//   40   85:ior             
	//   41   86:invokevirtual   #73  <Method Intent Intent.setFlags(int)>
	//   42   89:pop             
			b.a("PushManager", "a sdkbing intent send", context.getApplicationContext());
	//   43   90:ldc1            #11  <String "PushManager">
	//   44   92:ldc2            #418 <String "a sdkbing intent send">
	//   45   95:aload_0         
	//   46   96:invokevirtual   #32  <Method Context Context.getApplicationContext()>
	//   47   99:invokestatic    #37  <Method void b.a(String, String, Context)>
			com.baidu.android.pushservice.f.b(context, intent);
	//   48  102:aload_0         
	//   49  103:aload           4
	//   50  105:invokestatic    #78  <Method void com.baidu.android.pushservice.f.b(Context, Intent)>
			return;
	//   51  108:return          
		}
	}

	public static void sdkStartWork(Context context, String s, int i)
	{
		if(f.h(context))
	//*   0    0:aload_0         
	//*   1    1:invokestatic    #210 <Method boolean f.h(Context)>
	//*   2    4:ifeq            8
		{
			return;
	//    3    7:return          
		} else
		{
			com.baidu.android.pushservice.a.b(context, true);
	//    4    8:aload_0         
	//    5    9:iconst_1        
	//    6   10:invokestatic    #406 <Method void com.baidu.android.pushservice.a.b(Context, boolean)>
			u.a(context, true, true);
	//    7   13:aload_0         
	//    8   14:iconst_1        
	//    9   15:iconst_1        
	//   10   16:invokestatic    #409 <Method void u.a(Context, boolean, boolean)>
			t.a(context);
	//   11   19:aload_0         
	//   12   20:invokestatic    #107 <Method void t.a(Context)>
			sdkBind(context, 0, s, i);
	//   13   23:aload_0         
	//   14   24:iconst_0        
	//   15   25:aload_1         
	//   16   26:iload_2         
	//   17   27:invokestatic    #421 <Method void sdkBind(Context, int, String, int)>
			return;
	//   18   30:return          
		}
	}

	public static void sdkUnbind(Context context, String s)
	{
		if(f.h(context))
	//*   0    0:aload_0         
	//*   1    1:invokestatic    #210 <Method boolean f.h(Context)>
	//*   2    4:ifeq            8
		{
			return;
	//    3    7:return          
		} else
		{
			s = ((String) (createSDKMethodIntent(context, s)));
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokestatic    #424 <Method Intent createSDKMethodIntent(Context, String)>
	//    7   13:astore_1        
			((Intent) (s)).putExtra("method", "method_sdk_unbind");
	//    8   14:aload_1         
	//    9   15:ldc1            #55  <String "method">
	//   10   17:ldc2            #426 <String "method_sdk_unbind">
	//   11   20:invokevirtual   #63  <Method Intent Intent.putExtra(String, String)>
	//   12   23:pop             
			com.baidu.android.pushservice.f.b(context, ((Intent) (s)));
	//   13   24:aload_0         
	//   14   25:aload_1         
	//   15   26:invokestatic    #78  <Method void com.baidu.android.pushservice.f.b(Context, Intent)>
			return;
	//   16   29:return          
		}
	}

	public static void sendMsgToUser(Context context, String s, String s1, String s2, String s3)
	{
		Intent intent = com.baidu.android.pushservice.f.a(context);
	//    0    0:aload_0         
	//    1    1:invokestatic    #53  <Method Intent com.baidu.android.pushservice.f.a(Context)>
	//    2    4:astore          5
		if(intent == null)
	//*   3    6:aload           5
	//*   4    8:ifnonnull       12
		{
			return;
	//    5   11:return          
		} else
		{
			intent.putExtra("method", "method_send_msg_to_user");
	//    6   12:aload           5
	//    7   14:ldc1            #55  <String "method">
	//    8   16:ldc2            #430 <String "method_send_msg_to_user">
	//    9   19:invokevirtual   #63  <Method Intent Intent.putExtra(String, String)>
	//   10   22:pop             
			intent.putExtra("app_id", s);
	//   11   23:aload           5
	//   12   25:ldc2            #338 <String "app_id">
	//   13   28:aload_1         
	//   14   29:invokevirtual   #63  <Method Intent Intent.putExtra(String, String)>
	//   15   32:pop             
			intent.putExtra("user_id", s1);
	//   16   33:aload           5
	//   17   35:ldc2            #432 <String "user_id">
	//   18   38:aload_2         
	//   19   39:invokevirtual   #63  <Method Intent Intent.putExtra(String, String)>
	//   20   42:pop             
			intent.putExtra("push_ msg_key", s2);
	//   21   43:aload           5
	//   22   45:ldc2            #434 <String "push_ msg_key">
	//   23   48:aload_3         
	//   24   49:invokevirtual   #63  <Method Intent Intent.putExtra(String, String)>
	//   25   52:pop             
			intent.putExtra("push_ msg", s3);
	//   26   53:aload           5
	//   27   55:ldc2            #436 <String "push_ msg">
	//   28   58:aload           4
	//   29   60:invokevirtual   #63  <Method Intent Intent.putExtra(String, String)>
	//   30   63:pop             
			com.baidu.android.pushservice.f.b(context, intent);
	//   31   64:aload_0         
	//   32   65:aload           5
	//   33   67:invokestatic    #78  <Method void com.baidu.android.pushservice.f.b(Context, Intent)>
			return;
	//   34   70:return          
		}
	}

	public static void setDefaultNotificationBuilder(Context context, PushNotificationBuilder pushnotificationbuilder)
	{
		if(f.h(context))
	//*   0    0:aload_0         
	//*   1    1:invokestatic    #210 <Method boolean f.h(Context)>
	//*   2    4:ifeq            8
		{
			return;
	//    3    7:return          
		} else
		{
			com.baidu.android.pushservice.d.a(context, pushnotificationbuilder);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokestatic    #442 <Method void com.baidu.android.pushservice.d.a(Context, PushNotificationBuilder)>
			return;
	//    7   13:return          
		}
	}

	public static void setLappTags(Context context, String s, List list)
	{
		if(f.h(context))
	//*   0    0:aload_0         
	//*   1    1:invokestatic    #210 <Method boolean f.h(Context)>
	//*   2    4:ifeq            8
			return;
	//    3    7:return          
		if(list != null && list.size() != 0)
	//*   4    8:aload_2         
	//*   5    9:ifnull          231
	//*   6   12:aload_2         
	//*   7   13:invokeinterface #136 <Method int List.size()>
	//*   8   18:ifne            24
	//*   9   21:goto            231
		{
			Object obj = "[";
	//   10   24:ldc1            #138 <String "[">
	//   11   26:astore_3        
			Iterator iterator = list.iterator();
	//   12   27:aload_2         
	//   13   28:invokeinterface #142 <Method Iterator List.iterator()>
	//   14   33:astore          4
			for(list = ((List) (obj)); iterator.hasNext(); list = ((List) (((StringBuilder) (obj)).toString())))
	//*  15   35:aload_3         
	//*  16   36:astore_2        
	//*  17   37:aload           4
	//*  18   39:invokeinterface #148 <Method boolean Iterator.hasNext()>
	//*  19   44:ifeq            146
			{
				obj = ((Object) ((String)iterator.next()));
	//   20   47:aload           4
	//   21   49:invokeinterface #152 <Method Object Iterator.next()>
	//   22   54:checkcast       #154 <Class String>
	//   23   57:astore_3        
				StringBuilder stringbuilder = new StringBuilder();
	//   24   58:new             #82  <Class StringBuilder>
	//   25   61:dup             
	//   26   62:invokespecial   #83  <Method void StringBuilder()>
	//   27   65:astore          5
				stringbuilder.append(((String) (list)));
	//   28   67:aload           5
	//   29   69:aload_2         
	//   30   70:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//   31   73:pop             
				stringbuilder.append("\"");
	//   32   74:aload           5
	//   33   76:ldc1            #156 <String "\"">
	//   34   78:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//   35   81:pop             
				list = ((List) (stringbuilder.toString()));
	//   36   82:aload           5
	//   37   84:invokevirtual   #102 <Method String StringBuilder.toString()>
	//   38   87:astore_2        
				stringbuilder = new StringBuilder();
	//   39   88:new             #82  <Class StringBuilder>
	//   40   91:dup             
	//   41   92:invokespecial   #83  <Method void StringBuilder()>
	//   42   95:astore          5
				stringbuilder.append(((String) (list)));
	//   43   97:aload           5
	//   44   99:aload_2         
	//   45  100:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//   46  103:pop             
				stringbuilder.append(((String) (obj)));
	//   47  104:aload           5
	//   48  106:aload_3         
	//   49  107:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//   50  110:pop             
				list = ((List) (stringbuilder.toString()));
	//   51  111:aload           5
	//   52  113:invokevirtual   #102 <Method String StringBuilder.toString()>
	//   53  116:astore_2        
				obj = ((Object) (new StringBuilder()));
	//   54  117:new             #82  <Class StringBuilder>
	//   55  120:dup             
	//   56  121:invokespecial   #83  <Method void StringBuilder()>
	//   57  124:astore_3        
				((StringBuilder) (obj)).append(((String) (list)));
	//   58  125:aload_3         
	//   59  126:aload_2         
	//   60  127:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//   61  130:pop             
				((StringBuilder) (obj)).append("\",");
	//   62  131:aload_3         
	//   63  132:ldc1            #158 <String "\",">
	//   64  134:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//   65  137:pop             
			}

	//   66  138:aload_3         
	//   67  139:invokevirtual   #102 <Method String StringBuilder.toString()>
	//   68  142:astore_2        
	//*  69  143:goto            37
			obj = ((Object) (list));
	//   70  146:aload_2         
	//   71  147:astore_3        
			if(((String) (list)).length() > 0)
	//*  72  148:aload_2         
	//*  73  149:invokevirtual   #161 <Method int String.length()>
	//*  74  152:ifle            167
				obj = ((Object) (((String) (list)).substring(0, ((String) (list)).length() - 1)));
	//   75  155:aload_2         
	//   76  156:iconst_0        
	//   77  157:aload_2         
	//   78  158:invokevirtual   #161 <Method int String.length()>
	//   79  161:iconst_1        
	//   80  162:isub            
	//   81  163:invokevirtual   #165 <Method String String.substring(int, int)>
	//   82  166:astore_3        
			list = ((List) (new StringBuilder()));
	//   83  167:new             #82  <Class StringBuilder>
	//   84  170:dup             
	//   85  171:invokespecial   #83  <Method void StringBuilder()>
	//   86  174:astore_2        
			((StringBuilder) (list)).append(((String) (obj)));
	//   87  175:aload_2         
	//   88  176:aload_3         
	//   89  177:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//   90  180:pop             
			((StringBuilder) (list)).append("]");
	//   91  181:aload_2         
	//   92  182:ldc1            #167 <String "]">
	//   93  184:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//   94  187:pop             
			list = ((List) (((StringBuilder) (list)).toString()));
	//   95  188:aload_2         
	//   96  189:invokevirtual   #102 <Method String StringBuilder.toString()>
	//   97  192:astore_2        
			obj = ((Object) (createLappMethodIntent(context, s)));
	//   98  193:aload_0         
	//   99  194:aload_1         
	//  100  195:invokestatic    #300 <Method Intent createLappMethodIntent(Context, String)>
	//  101  198:astore_3        
			((Intent) (obj)).putExtra("secret_key", s);
	//  102  199:aload_3         
	//  103  200:ldc1            #122 <String "secret_key">
	//  104  202:aload_1         
	//  105  203:invokevirtual   #63  <Method Intent Intent.putExtra(String, String)>
	//  106  206:pop             
			((Intent) (obj)).putExtra("method", "method_set_lapp_tags");
	//  107  207:aload_3         
	//  108  208:ldc1            #55  <String "method">
	//  109  210:ldc2            #445 <String "method_set_lapp_tags">
	//  110  213:invokevirtual   #63  <Method Intent Intent.putExtra(String, String)>
	//  111  216:pop             
			((Intent) (obj)).putExtra("tags", ((String) (list)));
	//  112  217:aload_3         
	//  113  218:ldc1            #171 <String "tags">
	//  114  220:aload_2         
	//  115  221:invokevirtual   #63  <Method Intent Intent.putExtra(String, String)>
	//  116  224:pop             
			com.baidu.android.pushservice.f.b(context, ((Intent) (obj)));
	//  117  225:aload_0         
	//  118  226:aload_3         
	//  119  227:invokestatic    #78  <Method void com.baidu.android.pushservice.f.b(Context, Intent)>
			return;
	//  120  230:return          
		} else
		{
			a.d("PushManager", "No tags specified, do nothing.");
	//  121  231:ldc1            #11  <String "PushManager">
	//  122  233:ldc1            #173 <String "No tags specified, do nothing.">
	//  123  235:invokestatic    #179 <Method void a.d(String, String)>
			return;
	//  124  238:return          
		}
	}

	public static void setMediaNotificationBuilder(Context context, PushNotificationBuilder pushnotificationbuilder)
	{
		if(f.h(context))
	//*   0    0:aload_0         
	//*   1    1:invokestatic    #210 <Method boolean f.h(Context)>
	//*   2    4:ifeq            8
		{
			return;
	//    3    7:return          
		} else
		{
			com.baidu.android.pushservice.d.b(context, pushnotificationbuilder);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokestatic    #448 <Method void com.baidu.android.pushservice.d.b(Context, PushNotificationBuilder)>
			return;
	//    7   13:return          
		}
	}

	public static void setNoDisturbMode(Context context, int i, int j, int k, int l)
	{
		if(f.h(context))
	//*   0    0:aload_0         
	//*   1    1:invokestatic    #210 <Method boolean f.h(Context)>
	//*   2    4:ifeq            8
			return;
	//    3    7:return          
		if(i >= 0 && i <= 23 && k >= 0 && k <= 23)
	//*   4    8:iload_1         
	//*   5    9:iflt            128
	//*   6   12:iload_1         
	//*   7   13:bipush          23
	//*   8   15:icmpgt          128
	//*   9   18:iload_3         
	//*  10   19:iflt            128
	//*  11   22:iload_3         
	//*  12   23:bipush          23
	//*  13   25:icmple          31
	//*  14   28:goto            128
		{
			if(j >= 0 && j <= 59 && l >= 0 && l <= 59)
	//*  15   31:iload_2         
	//*  16   32:iflt            115
	//*  17   35:iload_2         
	//*  18   36:bipush          59
	//*  19   38:icmpgt          115
	//*  20   41:iload           4
	//*  21   43:iflt            115
	//*  22   46:iload           4
	//*  23   48:bipush          59
	//*  24   50:icmple          56
	//*  25   53:goto            115
			{
				String s = context.getPackageName();
	//   26   56:aload_0         
	//   27   57:invokevirtual   #330 <Method String Context.getPackageName()>
	//   28   60:astore          5
				StringBuilder stringbuilder = new StringBuilder();
	//   29   62:new             #82  <Class StringBuilder>
	//   30   65:dup             
	//   31   66:invokespecial   #83  <Method void StringBuilder()>
	//   32   69:astore          6
				stringbuilder.append("PushManager setNoDisturbMode package name: ");
	//   33   71:aload           6
	//   34   73:ldc2            #452 <String "PushManager setNoDisturbMode package name: ">
	//   35   76:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//   36   79:pop             
				stringbuilder.append(s);
	//   37   80:aload           6
	//   38   82:aload           5
	//   39   84:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//   40   87:pop             
				b.a("PushManager", stringbuilder.toString(), context.getApplicationContext());
	//   41   88:ldc1            #11  <String "PushManager">
	//   42   90:aload           6
	//   43   92:invokevirtual   #102 <Method String StringBuilder.toString()>
	//   44   95:aload_0         
	//   45   96:invokevirtual   #32  <Method Context Context.getApplicationContext()>
	//   46   99:invokestatic    #37  <Method void b.a(String, String, Context)>
				o.a(context, s, i, j, k, l);
	//   47  102:aload_0         
	//   48  103:aload           5
	//   49  105:iload_1         
	//   50  106:iload_2         
	//   51  107:iload_3         
	//   52  108:iload           4
	//   53  110:invokestatic    #457 <Method long o.a(Context, String, int, int, int, int)>
	//   54  113:pop2            
				return;
	//   55  114:return          
			} else
			{
				b.a("PushManager", "setNoDisturbMode minute parameters illegal!", context.getApplicationContext());
	//   56  115:ldc1            #11  <String "PushManager">
	//   57  117:ldc2            #459 <String "setNoDisturbMode minute parameters illegal!">
	//   58  120:aload_0         
	//   59  121:invokevirtual   #32  <Method Context Context.getApplicationContext()>
	//   60  124:invokestatic    #37  <Method void b.a(String, String, Context)>
				return;
	//   61  127:return          
			}
		} else
		{
			b.a("PushManager", "setNoDisturbMode hour parameters illegal!", context.getApplicationContext());
	//   62  128:ldc1            #11  <String "PushManager">
	//   63  130:ldc2            #461 <String "setNoDisturbMode hour parameters illegal!">
	//   64  133:aload_0         
	//   65  134:invokevirtual   #32  <Method Context Context.getApplicationContext()>
	//   66  137:invokestatic    #37  <Method void b.a(String, String, Context)>
			return;
	//   67  140:return          
		}
	}

	public static void setNotificationBuilder(Context context, int i, PushNotificationBuilder pushnotificationbuilder)
	{
		if(f.h(context))
	//*   0    0:aload_0         
	//*   1    1:invokestatic    #210 <Method boolean f.h(Context)>
	//*   2    4:ifeq            8
			return;
	//    3    7:return          
		if(i >= 1 && i <= 1000)
	//*   4    8:iload_1         
	//*   5    9:iconst_1        
	//*   6   10:icmplt          27
	//*   7   13:iload_1         
	//*   8   14:sipush          1000
	//*   9   17:icmpgt          27
		{
			com.baidu.android.pushservice.d.a(context, i, pushnotificationbuilder);
	//   10   20:aload_0         
	//   11   21:iload_1         
	//   12   22:aload_2         
	//   13   23:invokestatic    #465 <Method void com.baidu.android.pushservice.d.a(Context, int, PushNotificationBuilder)>
			return;
	//   14   26:return          
		} else
		{
			b.b("PushManager", "set notification builder error, id is illegal !", context.getApplicationContext());
	//   15   27:ldc1            #11  <String "PushManager">
	//   16   29:ldc2            #467 <String "set notification builder error, id is illegal !">
	//   17   32:aload_0         
	//   18   33:invokevirtual   #32  <Method Context Context.getApplicationContext()>
	//   19   36:invokestatic    #362 <Method void b.b(String, String, Context)>
			return;
	//   20   39:return          
		}
	}

	public static void setSDKTags(Context context, String s, List list)
	{
		if(list != null && list.size() != 0)
	//*   0    0:aload_2         
	//*   1    1:ifnull          245
	//*   2    4:aload_2         
	//*   3    5:invokeinterface #136 <Method int List.size()>
	//*   4   10:ifne            16
	//*   5   13:goto            245
		{
			Intent intent = u.f(context);
	//    6   16:aload_0         
	//    7   17:invokestatic    #185 <Method Intent u.f(Context)>
	//    8   20:astore          4
			if(intent == null)
	//*   9   22:aload           4
	//*  10   24:ifnonnull       28
				return;
	//   11   27:return          
			Object obj = "[";
	//   12   28:ldc1            #138 <String "[">
	//   13   30:astore_3        
			Iterator iterator = list.iterator();
	//   14   31:aload_2         
	//   15   32:invokeinterface #142 <Method Iterator List.iterator()>
	//   16   37:astore          5
			for(list = ((List) (obj)); iterator.hasNext(); list = ((List) (((StringBuilder) (obj)).toString())))
	//*  17   39:aload_3         
	//*  18   40:astore_2        
	//*  19   41:aload           5
	//*  20   43:invokeinterface #148 <Method boolean Iterator.hasNext()>
	//*  21   48:ifeq            150
			{
				obj = ((Object) ((String)iterator.next()));
	//   22   51:aload           5
	//   23   53:invokeinterface #152 <Method Object Iterator.next()>
	//   24   58:checkcast       #154 <Class String>
	//   25   61:astore_3        
				StringBuilder stringbuilder = new StringBuilder();
	//   26   62:new             #82  <Class StringBuilder>
	//   27   65:dup             
	//   28   66:invokespecial   #83  <Method void StringBuilder()>
	//   29   69:astore          6
				stringbuilder.append(((String) (list)));
	//   30   71:aload           6
	//   31   73:aload_2         
	//   32   74:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//   33   77:pop             
				stringbuilder.append("\"");
	//   34   78:aload           6
	//   35   80:ldc1            #156 <String "\"">
	//   36   82:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//   37   85:pop             
				list = ((List) (stringbuilder.toString()));
	//   38   86:aload           6
	//   39   88:invokevirtual   #102 <Method String StringBuilder.toString()>
	//   40   91:astore_2        
				stringbuilder = new StringBuilder();
	//   41   92:new             #82  <Class StringBuilder>
	//   42   95:dup             
	//   43   96:invokespecial   #83  <Method void StringBuilder()>
	//   44   99:astore          6
				stringbuilder.append(((String) (list)));
	//   45  101:aload           6
	//   46  103:aload_2         
	//   47  104:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//   48  107:pop             
				stringbuilder.append(((String) (obj)));
	//   49  108:aload           6
	//   50  110:aload_3         
	//   51  111:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//   52  114:pop             
				list = ((List) (stringbuilder.toString()));
	//   53  115:aload           6
	//   54  117:invokevirtual   #102 <Method String StringBuilder.toString()>
	//   55  120:astore_2        
				obj = ((Object) (new StringBuilder()));
	//   56  121:new             #82  <Class StringBuilder>
	//   57  124:dup             
	//   58  125:invokespecial   #83  <Method void StringBuilder()>
	//   59  128:astore_3        
				((StringBuilder) (obj)).append(((String) (list)));
	//   60  129:aload_3         
	//   61  130:aload_2         
	//   62  131:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//   63  134:pop             
				((StringBuilder) (obj)).append("\",");
	//   64  135:aload_3         
	//   65  136:ldc1            #158 <String "\",">
	//   66  138:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//   67  141:pop             
			}

	//   68  142:aload_3         
	//   69  143:invokevirtual   #102 <Method String StringBuilder.toString()>
	//   70  146:astore_2        
	//*  71  147:goto            41
			obj = ((Object) (list));
	//   72  150:aload_2         
	//   73  151:astore_3        
			if(((String) (list)).length() > 0)
	//*  74  152:aload_2         
	//*  75  153:invokevirtual   #161 <Method int String.length()>
	//*  76  156:ifle            171
				obj = ((Object) (((String) (list)).substring(0, ((String) (list)).length() - 1)));
	//   77  159:aload_2         
	//   78  160:iconst_0        
	//   79  161:aload_2         
	//   80  162:invokevirtual   #161 <Method int String.length()>
	//   81  165:iconst_1        
	//   82  166:isub            
	//   83  167:invokevirtual   #165 <Method String String.substring(int, int)>
	//   84  170:astore_3        
			list = ((List) (new StringBuilder()));
	//   85  171:new             #82  <Class StringBuilder>
	//   86  174:dup             
	//   87  175:invokespecial   #83  <Method void StringBuilder()>
	//   88  178:astore_2        
			((StringBuilder) (list)).append(((String) (obj)));
	//   89  179:aload_2         
	//   90  180:aload_3         
	//   91  181:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//   92  184:pop             
			((StringBuilder) (list)).append("]");
	//   93  185:aload_2         
	//   94  186:ldc1            #167 <String "]">
	//   95  188:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//   96  191:pop             
			list = ((List) (((StringBuilder) (list)).toString()));
	//   97  192:aload_2         
	//   98  193:invokevirtual   #102 <Method String StringBuilder.toString()>
	//   99  196:astore_2        
			intent.putExtra("secret_key", s);
	//  100  197:aload           4
	//  101  199:ldc1            #122 <String "secret_key">
	//  102  201:aload_1         
	//  103  202:invokevirtual   #63  <Method Intent Intent.putExtra(String, String)>
	//  104  205:pop             
			intent.putExtra("method", "method_set_sdk_tags");
	//  105  206:aload           4
	//  106  208:ldc1            #55  <String "method">
	//  107  210:ldc2            #470 <String "method_set_sdk_tags">
	//  108  213:invokevirtual   #63  <Method Intent Intent.putExtra(String, String)>
	//  109  216:pop             
			intent.putExtra("tags", ((String) (list)));
	//  110  217:aload           4
	//  111  219:ldc1            #171 <String "tags">
	//  112  221:aload_2         
	//  113  222:invokevirtual   #63  <Method Intent Intent.putExtra(String, String)>
	//  114  225:pop             
			b.a("PushManager", "a setSDKTags intent send", context.getApplicationContext());
	//  115  226:ldc1            #11  <String "PushManager">
	//  116  228:ldc2            #472 <String "a setSDKTags intent send">
	//  117  231:aload_0         
	//  118  232:invokevirtual   #32  <Method Context Context.getApplicationContext()>
	//  119  235:invokestatic    #37  <Method void b.a(String, String, Context)>
			com.baidu.android.pushservice.f.b(context, intent);
	//  120  238:aload_0         
	//  121  239:aload           4
	//  122  241:invokestatic    #78  <Method void com.baidu.android.pushservice.f.b(Context, Intent)>
			return;
	//  123  244:return          
		} else
		{
			a.d("PushManager", "No tags specified, do nothing.");
	//  124  245:ldc1            #11  <String "PushManager">
	//  125  247:ldc1            #173 <String "No tags specified, do nothing.">
	//  126  249:invokestatic    #179 <Method void a.d(String, String)>
			return;
	//  127  252:return          
		}
	}

	public static void setTags(Context context, List list)
	{
		if(list != null && list.size() != 0)
	//*   0    0:aload_1         
	//*   1    1:ifnull          231
	//*   2    4:aload_1         
	//*   3    5:invokeinterface #136 <Method int List.size()>
	//*   4   10:ifne            16
	//*   5   13:goto            231
		{
			Intent intent = com.baidu.android.pushservice.f.a(context);
	//    6   16:aload_0         
	//    7   17:invokestatic    #53  <Method Intent com.baidu.android.pushservice.f.a(Context)>
	//    8   20:astore_3        
			if(intent == null)
	//*   9   21:aload_3         
	//*  10   22:ifnonnull       26
				return;
	//   11   25:return          
			Object obj = "[";
	//   12   26:ldc1            #138 <String "[">
	//   13   28:astore_2        
			Iterator iterator = list.iterator();
	//   14   29:aload_1         
	//   15   30:invokeinterface #142 <Method Iterator List.iterator()>
	//   16   35:astore          4
			for(list = ((List) (obj)); iterator.hasNext(); list = ((List) (((StringBuilder) (obj)).toString())))
	//*  17   37:aload_2         
	//*  18   38:astore_1        
	//*  19   39:aload           4
	//*  20   41:invokeinterface #148 <Method boolean Iterator.hasNext()>
	//*  21   46:ifeq            148
			{
				obj = ((Object) ((String)iterator.next()));
	//   22   49:aload           4
	//   23   51:invokeinterface #152 <Method Object Iterator.next()>
	//   24   56:checkcast       #154 <Class String>
	//   25   59:astore_2        
				StringBuilder stringbuilder = new StringBuilder();
	//   26   60:new             #82  <Class StringBuilder>
	//   27   63:dup             
	//   28   64:invokespecial   #83  <Method void StringBuilder()>
	//   29   67:astore          5
				stringbuilder.append(((String) (list)));
	//   30   69:aload           5
	//   31   71:aload_1         
	//   32   72:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//   33   75:pop             
				stringbuilder.append("\"");
	//   34   76:aload           5
	//   35   78:ldc1            #156 <String "\"">
	//   36   80:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//   37   83:pop             
				list = ((List) (stringbuilder.toString()));
	//   38   84:aload           5
	//   39   86:invokevirtual   #102 <Method String StringBuilder.toString()>
	//   40   89:astore_1        
				stringbuilder = new StringBuilder();
	//   41   90:new             #82  <Class StringBuilder>
	//   42   93:dup             
	//   43   94:invokespecial   #83  <Method void StringBuilder()>
	//   44   97:astore          5
				stringbuilder.append(((String) (list)));
	//   45   99:aload           5
	//   46  101:aload_1         
	//   47  102:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//   48  105:pop             
				stringbuilder.append(((String) (obj)));
	//   49  106:aload           5
	//   50  108:aload_2         
	//   51  109:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//   52  112:pop             
				list = ((List) (stringbuilder.toString()));
	//   53  113:aload           5
	//   54  115:invokevirtual   #102 <Method String StringBuilder.toString()>
	//   55  118:astore_1        
				obj = ((Object) (new StringBuilder()));
	//   56  119:new             #82  <Class StringBuilder>
	//   57  122:dup             
	//   58  123:invokespecial   #83  <Method void StringBuilder()>
	//   59  126:astore_2        
				((StringBuilder) (obj)).append(((String) (list)));
	//   60  127:aload_2         
	//   61  128:aload_1         
	//   62  129:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//   63  132:pop             
				((StringBuilder) (obj)).append("\",");
	//   64  133:aload_2         
	//   65  134:ldc1            #158 <String "\",">
	//   66  136:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//   67  139:pop             
			}

	//   68  140:aload_2         
	//   69  141:invokevirtual   #102 <Method String StringBuilder.toString()>
	//   70  144:astore_1        
	//*  71  145:goto            39
			obj = ((Object) (list));
	//   72  148:aload_1         
	//   73  149:astore_2        
			if(((String) (list)).length() > 0)
	//*  74  150:aload_1         
	//*  75  151:invokevirtual   #161 <Method int String.length()>
	//*  76  154:ifle            169
				obj = ((Object) (((String) (list)).substring(0, ((String) (list)).length() - 1)));
	//   77  157:aload_1         
	//   78  158:iconst_0        
	//   79  159:aload_1         
	//   80  160:invokevirtual   #161 <Method int String.length()>
	//   81  163:iconst_1        
	//   82  164:isub            
	//   83  165:invokevirtual   #165 <Method String String.substring(int, int)>
	//   84  168:astore_2        
			list = ((List) (new StringBuilder()));
	//   85  169:new             #82  <Class StringBuilder>
	//   86  172:dup             
	//   87  173:invokespecial   #83  <Method void StringBuilder()>
	//   88  176:astore_1        
			((StringBuilder) (list)).append(((String) (obj)));
	//   89  177:aload_1         
	//   90  178:aload_2         
	//   91  179:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//   92  182:pop             
			((StringBuilder) (list)).append("]");
	//   93  183:aload_1         
	//   94  184:ldc1            #167 <String "]">
	//   95  186:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//   96  189:pop             
			list = ((List) (((StringBuilder) (list)).toString()));
	//   97  190:aload_1         
	//   98  191:invokevirtual   #102 <Method String StringBuilder.toString()>
	//   99  194:astore_1        
			intent.putExtra("method", "method_set_tags");
	//  100  195:aload_3         
	//  101  196:ldc1            #55  <String "method">
	//  102  198:ldc2            #475 <String "method_set_tags">
	//  103  201:invokevirtual   #63  <Method Intent Intent.putExtra(String, String)>
	//  104  204:pop             
			intent.putExtra("tags", ((String) (list)));
	//  105  205:aload_3         
	//  106  206:ldc1            #171 <String "tags">
	//  107  208:aload_1         
	//  108  209:invokevirtual   #63  <Method Intent Intent.putExtra(String, String)>
	//  109  212:pop             
			b.a("PushManager", "a setTags intent send ", context.getApplicationContext());
	//  110  213:ldc1            #11  <String "PushManager">
	//  111  215:ldc2            #477 <String "a setTags intent send ">
	//  112  218:aload_0         
	//  113  219:invokevirtual   #32  <Method Context Context.getApplicationContext()>
	//  114  222:invokestatic    #37  <Method void b.a(String, String, Context)>
			com.baidu.android.pushservice.f.b(context, intent);
	//  115  225:aload_0         
	//  116  226:aload_3         
	//  117  227:invokestatic    #78  <Method void com.baidu.android.pushservice.f.b(Context, Intent)>
			return;
	//  118  230:return          
		} else
		{
			a.d("PushManager", "No tags specified, do nothing.");
	//  119  231:ldc1            #11  <String "PushManager">
	//  120  233:ldc1            #173 <String "No tags specified, do nothing.">
	//  121  235:invokestatic    #179 <Method void a.d(String, String)>
			return;
	//  122  238:return          
		}
	}

	public static void startWork(Context context, int i, String s)
	{
		if(f.h(context))
	//*   0    0:aload_0         
	//*   1    1:invokestatic    #210 <Method boolean f.h(Context)>
	//*   2    4:ifeq            8
			return;
	//    3    7:return          
		com.baidu.android.pushservice.f.a = i;
	//    4    8:iload_1         
	//    5    9:putstatic       #481 <Field int com.baidu.android.pushservice.f.a>
		com.baidu.android.pushservice.f.b = s;
	//    6   12:aload_2         
	//    7   13:putstatic       #483 <Field String com.baidu.android.pushservice.f.b>
		com.baidu.android.pushservice.h.b(context);
	//    8   16:aload_0         
	//    9   17:invokestatic    #487 <Method void com.baidu.android.pushservice.h.b(Context)>
		boolean flag = u.k(context, s);
	//   10   20:aload_0         
	//   11   21:aload_2         
	//   12   22:invokestatic    #491 <Method boolean u.k(Context, String)>
	//   13   25:istore_3        
		s = ((String) (new StringBuilder()));
	//   14   26:new             #82  <Class StringBuilder>
	//   15   29:dup             
	//   16   30:invokespecial   #83  <Method void StringBuilder()>
	//   17   33:astore_2        
		((StringBuilder) (s)).append("startWork from ");
	//   18   34:aload_2         
	//   19   35:ldc2            #493 <String "startWork from ">
	//   20   38:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//   21   41:pop             
		((StringBuilder) (s)).append(context.getPackageName());
	//   22   42:aload_2         
	//   23   43:aload_0         
	//   24   44:invokevirtual   #330 <Method String Context.getPackageName()>
	//   25   47:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//   26   50:pop             
		((StringBuilder) (s)).append(" check: ");
	//   27   51:aload_2         
	//   28   52:ldc2            #495 <String " check: ">
	//   29   55:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//   30   58:pop             
		((StringBuilder) (s)).append(flag);
	//   31   59:aload_2         
	//   32   60:iload_3         
	//   33   61:invokevirtual   #498 <Method StringBuilder StringBuilder.append(boolean)>
	//   34   64:pop             
		b.a("PushManager", ((StringBuilder) (s)).toString(), context.getApplicationContext());
	//   35   65:ldc1            #11  <String "PushManager">
	//   36   67:aload_2         
	//   37   68:invokevirtual   #102 <Method String StringBuilder.toString()>
	//   38   71:aload_0         
	//   39   72:invokevirtual   #32  <Method Context Context.getApplicationContext()>
	//   40   75:invokestatic    #37  <Method void b.a(String, String, Context)>
		s = ((String) (new StringBuilder()));
	//   41   78:new             #82  <Class StringBuilder>
	//   42   81:dup             
	//   43   82:invokespecial   #83  <Method void StringBuilder()>
	//   44   85:astore_2        
		((StringBuilder) (s)).append("startWork from ");
	//   45   86:aload_2         
	//   46   87:ldc2            #493 <String "startWork from ">
	//   47   90:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//   48   93:pop             
		((StringBuilder) (s)).append(context.getPackageName());
	//   49   94:aload_2         
	//   50   95:aload_0         
	//   51   96:invokevirtual   #330 <Method String Context.getPackageName()>
	//   52   99:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//   53  102:pop             
		((StringBuilder) (s)).append(" check: ");
	//   54  103:aload_2         
	//   55  104:ldc2            #495 <String " check: ">
	//   56  107:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//   57  110:pop             
		((StringBuilder) (s)).append(flag);
	//   58  111:aload_2         
	//   59  112:iload_3         
	//   60  113:invokevirtual   #498 <Method StringBuilder StringBuilder.append(boolean)>
	//   61  116:pop             
		u.b(((StringBuilder) (s)).toString(), context);
	//   62  117:aload_2         
	//   63  118:invokevirtual   #102 <Method String StringBuilder.toString()>
	//   64  121:aload_0         
	//   65  122:invokestatic    #48  <Method void u.b(String, Context)>
		if(flag)
	//*  66  125:iload_3         
	//*  67  126:ifeq            139
		{
			startWork(context, i, com.baidu.android.pushservice.f.b, true);
	//   68  129:aload_0         
	//   69  130:iload_1         
	//   70  131:getstatic       #483 <Field String com.baidu.android.pushservice.f.b>
	//   71  134:iconst_1        
	//   72  135:invokestatic    #501 <Method void startWork(Context, int, String, boolean)>
			return;
	//   73  138:return          
		} else
		{
			com.baidu.android.pushservice.f.b(context, 10101);
	//   74  139:aload_0         
	//   75  140:sipush          10101
	//   76  143:invokestatic    #503 <Method void com.baidu.android.pushservice.f.b(Context, int)>
			return;
	//   77  146:return          
		}
	}

	public static void startWork(Context context, int i, String s, boolean flag)
	{
		if(f.h(context))
	//*   0    0:aload_0         
	//*   1    1:invokestatic    #210 <Method boolean f.h(Context)>
	//*   2    4:ifeq            8
			return;
	//    3    7:return          
		if(ModeConfig.isProxyMode(context))
	//*   4    8:aload_0         
	//*   5    9:invokestatic    #327 <Method boolean ModeConfig.isProxyMode(Context)>
	//*   6   12:ifeq            31
		{
			u.D(context);
	//    7   15:aload_0         
	//    8   16:invokestatic    #508 <Method void u.D(Context)>
			u.E(context);
	//    9   19:aload_0         
	//   10   20:invokestatic    #511 <Method void u.E(Context)>
			a.c("PushManager", "proxyMode, uploadPushAPPInfo & uploadPushLBSAPPListInfo");
	//   11   23:ldc1            #11  <String "PushManager">
	//   12   25:ldc2            #513 <String "proxyMode, uploadPushAPPInfo & uploadPushLBSAPPListInfo">
	//   13   28:invokestatic    #515 <Method void a.c(String, String)>
		}
		boolean flag1 = com.baidu.android.pushservice.f.b(context);
	//   14   31:aload_0         
	//   15   32:invokestatic    #517 <Method boolean com.baidu.android.pushservice.f.b(Context)>
	//   16   35:istore          4
		com.baidu.android.pushservice.a.b(context, true);
	//   17   37:aload_0         
	//   18   38:iconst_1        
	//   19   39:invokestatic    #406 <Method void com.baidu.android.pushservice.a.b(Context, boolean)>
		u.a(context, true, true);
	//   20   42:aload_0         
	//   21   43:iconst_1        
	//   22   44:iconst_1        
	//   23   45:invokestatic    #409 <Method void u.a(Context, boolean, boolean)>
		StringBuilder stringbuilder = new StringBuilder();
	//   24   48:new             #82  <Class StringBuilder>
	//   25   51:dup             
	//   26   52:invokespecial   #83  <Method void StringBuilder()>
	//   27   55:astore          6
		stringbuilder.append("startWork from");
	//   28   57:aload           6
	//   29   59:ldc2            #519 <String "startWork from">
	//   30   62:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//   31   65:pop             
		stringbuilder.append(context.getPackageName());
	//   32   66:aload           6
	//   33   68:aload_0         
	//   34   69:invokevirtual   #330 <Method String Context.getPackageName()>
	//   35   72:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//   36   75:pop             
		stringbuilder.append(" at time of ");
	//   37   76:aload           6
	//   38   78:ldc2            #521 <String " at time of ">
	//   39   81:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//   40   84:pop             
		stringbuilder.append(System.currentTimeMillis());
	//   41   85:aload           6
	//   42   87:invokestatic    #95  <Method long System.currentTimeMillis()>
	//   43   90:invokevirtual   #98  <Method StringBuilder StringBuilder.append(long)>
	//   44   93:pop             
		u.b(stringbuilder.toString(), context);
	//   45   94:aload           6
	//   46   96:invokevirtual   #102 <Method String StringBuilder.toString()>
	//   47   99:aload_0         
	//   48  100:invokestatic    #48  <Method void u.b(String, Context)>
		if(flag)
	//*  49  103:iload_3         
	//*  50  104:ifeq            459
		{
			Object obj1 = ((Object) (context.getSharedPreferences("com.baidu.pushservice.BIND_CACHE", 0)));
	//   51  107:aload_0         
	//   52  108:ldc2            #523 <String "com.baidu.pushservice.BIND_CACHE">
	//   53  111:iconst_0        
	//   54  112:invokevirtual   #527 <Method SharedPreferences Context.getSharedPreferences(String, int)>
	//   55  115:astore          9
			flag = ((SharedPreferences) (obj1)).getBoolean("bind_status", false);
	//   56  117:aload           9
	//   57  119:ldc2            #386 <String "bind_status">
	//   58  122:iconst_0        
	//   59  123:invokeinterface #533 <Method boolean SharedPreferences.getBoolean(String, boolean)>
	//   60  128:istore_3        
			Object obj = ((Object) (((SharedPreferences) (obj1)).getString("request_id", "")));
	//   61  129:aload           9
	//   62  131:ldc2            #535 <String "request_id">
	//   63  134:ldc2            #537 <String "">
	//   64  137:invokeinterface #541 <Method String SharedPreferences.getString(String, String)>
	//   65  142:astore          6
			String s1 = ((SharedPreferences) (obj1)).getString("appid", "");
	//   66  144:aload           9
	//   67  146:ldc2            #543 <String "appid">
	//   68  149:ldc2            #537 <String "">
	//   69  152:invokeinterface #541 <Method String SharedPreferences.getString(String, String)>
	//   70  157:astore          7
			String s2 = ((SharedPreferences) (obj1)).getString("channel_id", "");
	//   71  159:aload           9
	//   72  161:ldc2            #545 <String "channel_id">
	//   73  164:ldc2            #537 <String "">
	//   74  167:invokeinterface #541 <Method String SharedPreferences.getString(String, String)>
	//   75  172:astore          8
			obj1 = ((Object) (((SharedPreferences) (obj1)).getString("user_id", "")));
	//   76  174:aload           9
	//   77  176:ldc2            #432 <String "user_id">
	//   78  179:ldc2            #537 <String "">
	//   79  182:invokeinterface #541 <Method String SharedPreferences.getString(String, String)>
	//   80  187:astore          9
			try
			{
				obj = ((Object) (com.baidu.android.pushservice.f.a(((String) (obj)), s1, s2, ((String) (obj1)))));
	//   81  189:aload           6
	//   82  191:aload           7
	//   83  193:aload           8
	//   84  195:aload           9
	//   85  197:invokestatic    #548 <Method String com.baidu.android.pushservice.f.a(String, String, String, String)>
	//   86  200:astore          6
			}
	//*  87  202:goto            253
			// Misplaced declaration of an exception variable
			catch(Object obj)
	//*  88  205:astore          6
			{
				StringBuilder stringbuilder1 = new StringBuilder();
	//   89  207:new             #82  <Class StringBuilder>
	//   90  210:dup             
	//   91  211:invokespecial   #83  <Method void StringBuilder()>
	//   92  214:astore          7
				stringbuilder1.append("error ");
	//   93  216:aload           7
	//   94  218:ldc2            #357 <String "error ">
	//   95  221:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//   96  224:pop             
				stringbuilder1.append(((JSONException) (obj)).getMessage());
	//   97  225:aload           7
	//   98  227:aload           6
	//   99  229:invokevirtual   #549 <Method String JSONException.getMessage()>
	//  100  232:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//  101  235:pop             
				b.b("PushManager", stringbuilder1.toString(), context.getApplicationContext());
	//  102  236:ldc1            #11  <String "PushManager">
	//  103  238:aload           7
	//  104  240:invokevirtual   #102 <Method String StringBuilder.toString()>
	//  105  243:aload_0         
	//  106  244:invokevirtual   #32  <Method Context Context.getApplicationContext()>
	//  107  247:invokestatic    #362 <Method void b.b(String, String, Context)>
				obj = null;
	//  108  250:aconst_null     
	//  109  251:astore          6
			}
			boolean flag2 = com.baidu.android.pushservice.f.a(context, i, s);
	//  110  253:aload_0         
	//  111  254:iload_1         
	//  112  255:aload_2         
	//  113  256:invokestatic    #552 <Method boolean com.baidu.android.pushservice.f.a(Context, int, String)>
	//  114  259:istore          5
			if(flag && flag2 && obj != null && !flag1)
	//* 115  261:iload_3         
	//* 116  262:ifeq            459
	//* 117  265:iload           5
	//* 118  267:ifeq            459
	//* 119  270:aload           6
	//* 120  272:ifnull          459
	//* 121  275:iload           4
	//* 122  277:ifne            459
			{
				s = ((String) (new Intent()));
	//  123  280:new             #59  <Class Intent>
	//  124  283:dup             
	//  125  284:invokespecial   #324 <Method void Intent()>
	//  126  287:astore_2        
				((Intent) (s)).putExtra("method", "method_bind");
	//  127  288:aload_2         
	//  128  289:ldc1            #55  <String "method">
	//  129  291:ldc2            #554 <String "method_bind">
	//  130  294:invokevirtual   #63  <Method Intent Intent.putExtra(String, String)>
	//  131  297:pop             
				((Intent) (s)).putExtra("error_msg", 0);
	//  132  298:aload_2         
	//  133  299:ldc2            #556 <String "error_msg">
	//  134  302:iconst_0        
	//  135  303:invokevirtual   #258 <Method Intent Intent.putExtra(String, int)>
	//  136  306:pop             
				((Intent) (s)).putExtra("content", ((String) (obj)).getBytes());
	//  137  307:aload_2         
	//  138  308:ldc2            #558 <String "content">
	//  139  311:aload           6
	//  140  313:invokevirtual   #562 <Method byte[] String.getBytes()>
	//  141  316:invokevirtual   #565 <Method Intent Intent.putExtra(String, byte[])>
	//  142  319:pop             
				((Intent) (s)).putExtra("bind_status", 0);
	//  143  320:aload_2         
	//  144  321:ldc2            #386 <String "bind_status">
	//  145  324:iconst_0        
	//  146  325:invokevirtual   #258 <Method Intent Intent.putExtra(String, int)>
	//  147  328:pop             
				StringBuilder stringbuilder2 = new StringBuilder();
	//  148  329:new             #82  <Class StringBuilder>
	//  149  332:dup             
	//  150  333:invokespecial   #83  <Method void StringBuilder()>
	//  151  336:astore          7
				stringbuilder2.append("new startWork> sendResult to ");
	//  152  338:aload           7
	//  153  340:ldc2            #567 <String "new startWork> sendResult to ">
	//  154  343:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//  155  346:pop             
				stringbuilder2.append(context.getPackageName());
	//  156  347:aload           7
	//  157  349:aload_0         
	//  158  350:invokevirtual   #330 <Method String Context.getPackageName()>
	//  159  353:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//  160  356:pop             
				stringbuilder2.append(" ,method:");
	//  161  357:aload           7
	//  162  359:ldc2            #569 <String " ,method:">
	//  163  362:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//  164  365:pop             
				stringbuilder2.append("method_bind");
	//  165  366:aload           7
	//  166  368:ldc2            #554 <String "method_bind">
	//  167  371:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//  168  374:pop             
				stringbuilder2.append(" ,errorCode : ");
	//  169  375:aload           7
	//  170  377:ldc2            #571 <String " ,errorCode : ">
	//  171  380:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//  172  383:pop             
				stringbuilder2.append(0);
	//  173  384:aload           7
	//  174  386:iconst_0        
	//  175  387:invokevirtual   #574 <Method StringBuilder StringBuilder.append(int)>
	//  176  390:pop             
				stringbuilder2.append(" ,content : ");
	//  177  391:aload           7
	//  178  393:ldc2            #576 <String " ,content : ">
	//  179  396:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//  180  399:pop             
				stringbuilder2.append(new String(((String) (obj))));
	//  181  400:aload           7
	//  182  402:new             #154 <Class String>
	//  183  405:dup             
	//  184  406:aload           6
	//  185  408:invokespecial   #579 <Method void String(String)>
	//  186  411:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//  187  414:pop             
				b.a("PushManager", stringbuilder2.toString(), context.getApplicationContext());
	//  188  415:ldc1            #11  <String "PushManager">
	//  189  417:aload           7
	//  190  419:invokevirtual   #102 <Method String StringBuilder.toString()>
	//  191  422:aload_0         
	//  192  423:invokevirtual   #32  <Method Context Context.getApplicationContext()>
	//  193  426:invokestatic    #37  <Method void b.a(String, String, Context)>
				u.b(context, ((Intent) (s)), "com.baidu.android.pushservice.action.RECEIVE", context.getPackageName());
	//  194  429:aload_0         
	//  195  430:aload_2         
	//  196  431:ldc2            #581 <String "com.baidu.android.pushservice.action.RECEIVE">
	//  197  434:aload_0         
	//  198  435:invokevirtual   #330 <Method String Context.getPackageName()>
	//  199  438:invokestatic    #584 <Method void u.b(Context, Intent, String, String)>
				if(com.baidu.android.pushservice.a.b() > 0)
	//* 200  441:invokestatic    #586 <Method int com.baidu.android.pushservice.a.b()>
	//* 201  444:ifle            458
					p.a(context, "039901", 1, ((String) (obj)));
	//  202  447:aload_0         
	//  203  448:ldc2            #588 <String "039901">
	//  204  451:iconst_1        
	//  205  452:aload           6
	//  206  454:invokestatic    #593 <Method long p.a(Context, String, int, String)>
	//  207  457:pop2            
				return;
	//  208  458:return          
			}
		}
		com.baidu.android.pushservice.f.b(context, i, s);
	//  209  459:aload_0         
	//  210  460:iload_1         
	//  211  461:aload_2         
	//  212  462:invokestatic    #595 <Method void com.baidu.android.pushservice.f.b(Context, int, String)>
	//  213  465:return          
	}

	public static void startWork(Context context, String s, String s1)
	{
		if(f.h(context))
	//*   0    0:aload_0         
	//*   1    1:invokestatic    #210 <Method boolean f.h(Context)>
	//*   2    4:ifeq            8
			return;
	//    3    7:return          
		com.baidu.android.pushservice.f.a = 2;
	//    4    8:iconst_2        
	//    5    9:putstatic       #481 <Field int com.baidu.android.pushservice.f.a>
		com.baidu.android.pushservice.f.b = s;
	//    6   12:aload_1         
	//    7   13:putstatic       #483 <Field String com.baidu.android.pushservice.f.b>
		f.c = s1;
	//    8   16:aload_2         
	//    9   17:putstatic       #597 <Field String f.c>
		if(ModeConfig.isProxyMode(context))
	//*  10   20:aload_0         
	//*  11   21:invokestatic    #327 <Method boolean ModeConfig.isProxyMode(Context)>
	//*  12   24:ifeq            43
		{
			u.D(context);
	//   13   27:aload_0         
	//   14   28:invokestatic    #508 <Method void u.D(Context)>
			u.E(context);
	//   15   31:aload_0         
	//   16   32:invokestatic    #511 <Method void u.E(Context)>
			a.c("PushManager", "proxyMode, uploadPushAPPInfo & uploadPushLBSAPPListInfo");
	//   17   35:ldc1            #11  <String "PushManager">
	//   18   37:ldc2            #513 <String "proxyMode, uploadPushAPPInfo & uploadPushLBSAPPListInfo">
	//   19   40:invokestatic    #515 <Method void a.c(String, String)>
		}
		com.baidu.android.pushservice.a.b(context, true);
	//   20   43:aload_0         
	//   21   44:iconst_1        
	//   22   45:invokestatic    #406 <Method void com.baidu.android.pushservice.a.b(Context, boolean)>
		u.a(context, true, true);
	//   23   48:aload_0         
	//   24   49:iconst_1        
	//   25   50:iconst_1        
	//   26   51:invokestatic    #409 <Method void u.a(Context, boolean, boolean)>
		m.a(context, "com.baidu.android.pushservice.PushManager.LOGIN_TYPE", 2);
	//   27   54:aload_0         
	//   28   55:ldc2            #599 <String "com.baidu.android.pushservice.PushManager.LOGIN_TYPE">
	//   29   58:iconst_2        
	//   30   59:invokestatic    #223 <Method void m.a(Context, String, int)>
		m.a(context, "com.baidu.android.pushservice.PushManager.LONGIN_VALUE", s);
	//   31   62:aload_0         
	//   32   63:ldc2            #601 <String "com.baidu.android.pushservice.PushManager.LONGIN_VALUE">
	//   33   66:aload_1         
	//   34   67:invokestatic    #241 <Method boolean m.a(Context, String, String)>
	//   35   70:pop             
		m.a(context, "com.baidu.android.pushservice.PushManager.BDUSS", s1);
	//   36   71:aload_0         
	//   37   72:ldc2            #603 <String "com.baidu.android.pushservice.PushManager.BDUSS">
	//   38   75:aload_2         
	//   39   76:invokestatic    #241 <Method boolean m.a(Context, String, String)>
	//   40   79:pop             
		t.a(context);
	//   41   80:aload_0         
	//   42   81:invokestatic    #107 <Method void t.a(Context)>
		com.baidu.android.pushservice.f.b(context, 2, "");
	//   43   84:aload_0         
	//   44   85:iconst_2        
	//   45   86:ldc2            #537 <String "">
	//   46   89:invokestatic    #595 <Method void com.baidu.android.pushservice.f.b(Context, int, String)>
	//   47   92:return          
	}

	public static void stopWork(Context context)
	{
		if(f.h(context))
	//*   0    0:aload_0         
	//*   1    1:invokestatic    #210 <Method boolean f.h(Context)>
	//*   2    4:ifeq            8
		{
			return;
	//    3    7:return          
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    4    8:new             #82  <Class StringBuilder>
	//    5   11:dup             
	//    6   12:invokespecial   #83  <Method void StringBuilder()>
	//    7   15:astore_1        
			stringbuilder.append("stopWork from");
	//    8   16:aload_1         
	//    9   17:ldc2            #606 <String "stopWork from">
	//   10   20:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//   11   23:pop             
			stringbuilder.append(context.getPackageName());
	//   12   24:aload_1         
	//   13   25:aload_0         
	//   14   26:invokevirtual   #330 <Method String Context.getPackageName()>
	//   15   29:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//   16   32:pop             
			stringbuilder.append(" at time of ");
	//   17   33:aload_1         
	//   18   34:ldc2            #521 <String " at time of ">
	//   19   37:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//   20   40:pop             
			stringbuilder.append(System.currentTimeMillis());
	//   21   41:aload_1         
	//   22   42:invokestatic    #95  <Method long System.currentTimeMillis()>
	//   23   45:invokevirtual   #98  <Method StringBuilder StringBuilder.append(long)>
	//   24   48:pop             
			u.b(stringbuilder.toString(), context);
	//   25   49:aload_1         
	//   26   50:invokevirtual   #102 <Method String StringBuilder.toString()>
	//   27   53:aload_0         
	//   28   54:invokestatic    #48  <Method void u.b(String, Context)>
			unbind(context);
	//   29   57:aload_0         
	//   30   58:invokestatic    #609 <Method void unbind(Context)>
			com.baidu.android.pushservice.a.b(context, false);
	//   31   61:aload_0         
	//   32   62:iconst_0        
	//   33   63:invokestatic    #406 <Method void com.baidu.android.pushservice.a.b(Context, boolean)>
			u.a(context, true, true);
	//   34   66:aload_0         
	//   35   67:iconst_1        
	//   36   68:iconst_1        
	//   37   69:invokestatic    #409 <Method void u.a(Context, boolean, boolean)>
			com.baidu.android.pushservice.a.a(context, true);
	//   38   72:aload_0         
	//   39   73:iconst_1        
	//   40   74:invokestatic    #410 <Method void com.baidu.android.pushservice.a.a(Context, boolean)>
			u.f(context, context.getPackageName());
	//   41   77:aload_0         
	//   42   78:aload_0         
	//   43   79:invokevirtual   #330 <Method String Context.getPackageName()>
	//   44   82:invokestatic    #611 <Method void u.f(Context, String)>
			context = ((Context) (context.getSharedPreferences("com.baidu.pushservice.BIND_CACHE", 0).edit()));
	//   45   85:aload_0         
	//   46   86:ldc2            #523 <String "com.baidu.pushservice.BIND_CACHE">
	//   47   89:iconst_0        
	//   48   90:invokevirtual   #527 <Method SharedPreferences Context.getSharedPreferences(String, int)>
	//   49   93:invokeinterface #615 <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//   50   98:astore_0        
			((android.content.SharedPreferences.Editor) (context)).putBoolean("bind_status", false);
	//   51   99:aload_0         
	//   52  100:ldc2            #386 <String "bind_status">
	//   53  103:iconst_0        
	//   54  104:invokeinterface #621 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putBoolean(String, boolean)>
	//   55  109:pop             
			((android.content.SharedPreferences.Editor) (context)).commit();
	//   56  110:aload_0         
	//   57  111:invokeinterface #624 <Method boolean android.content.SharedPreferences$Editor.commit()>
	//   58  116:pop             
			return;
	//   59  117:return          
		}
	}

	public static void unbind(Context context)
	{
		Intent intent = com.baidu.android.pushservice.f.a(context);
	//    0    0:aload_0         
	//    1    1:invokestatic    #53  <Method Intent com.baidu.android.pushservice.f.a(Context)>
	//    2    4:astore_1        
		if(intent == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       10
		{
			return;
	//    5    9:return          
		} else
		{
			intent.putExtra("method", "method_unbind");
	//    6   10:aload_1         
	//    7   11:ldc1            #55  <String "method">
	//    8   13:ldc2            #626 <String "method_unbind">
	//    9   16:invokevirtual   #63  <Method Intent Intent.putExtra(String, String)>
	//   10   19:pop             
			com.baidu.android.pushservice.f.b(context, intent);
	//   11   20:aload_0         
	//   12   21:aload_1         
	//   13   22:invokestatic    #78  <Method void com.baidu.android.pushservice.f.b(Context, Intent)>
			return;
	//   14   25:return          
		}
	}

	public static void unbindGroup(Context context, String s)
	{
		Intent intent = f.g(context);
	//    0    0:aload_0         
	//    1    1:invokestatic    #131 <Method Intent f.g(Context)>
	//    2    4:astore_2        
		if(intent == null)
	//*   3    5:aload_2         
	//*   4    6:ifnonnull       10
		{
			return;
	//    5    9:return          
		} else
		{
			intent.putExtra("method", "method_gunbind");
	//    6   10:aload_2         
	//    7   11:ldc1            #55  <String "method">
	//    8   13:ldc2            #629 <String "method_gunbind">
	//    9   16:invokevirtual   #63  <Method Intent Intent.putExtra(String, String)>
	//   10   19:pop             
			intent.putExtra("gid", s);
	//   11   20:aload_2         
	//   12   21:ldc1            #65  <String "gid">
	//   13   23:aload_1         
	//   14   24:invokevirtual   #63  <Method Intent Intent.putExtra(String, String)>
	//   15   27:pop             
			b.a("PushManager", "a unbindGroup intent send", context.getApplicationContext());
	//   16   28:ldc1            #11  <String "PushManager">
	//   17   30:ldc2            #631 <String "a unbindGroup intent send">
	//   18   33:aload_0         
	//   19   34:invokevirtual   #32  <Method Context Context.getApplicationContext()>
	//   20   37:invokestatic    #37  <Method void b.a(String, String, Context)>
			com.baidu.android.pushservice.f.b(context, intent);
	//   21   40:aload_0         
	//   22   41:aload_2         
	//   23   42:invokestatic    #78  <Method void com.baidu.android.pushservice.f.b(Context, Intent)>
			return;
	//   24   45:return          
		}
	}

	private static void webAppBind(Context context, int i, String s)
	{
		Intent intent = f.g(context);
	//    0    0:aload_0         
	//    1    1:invokestatic    #131 <Method Intent f.g(Context)>
	//    2    4:astore_3        
		if(intent == null)
	//*   3    5:aload_3         
	//*   4    6:ifnonnull       10
		{
			return;
	//    5    9:return          
		} else
		{
			intent.putExtra("method", "method_deal_webapp_bind_intent");
	//    6   10:aload_3         
	//    7   11:ldc1            #55  <String "method">
	//    8   13:ldc2            #633 <String "method_deal_webapp_bind_intent">
	//    9   16:invokevirtual   #63  <Method Intent Intent.putExtra(String, String)>
	//   10   19:pop             
			intent.putExtra("bind_name", Build.MODEL);
	//   11   20:aload_3         
	//   12   21:ldc2            #379 <String "bind_name">
	//   13   24:getstatic       #384 <Field String Build.MODEL>
	//   14   27:invokevirtual   #63  <Method Intent Intent.putExtra(String, String)>
	//   15   30:pop             
			intent.putExtra("bind_status", i);
	//   16   31:aload_3         
	//   17   32:ldc2            #386 <String "bind_status">
	//   18   35:iload_1         
	//   19   36:invokevirtual   #258 <Method Intent Intent.putExtra(String, int)>
	//   20   39:pop             
			intent.putExtra("push_sdk_version", ((int) (com.baidu.android.pushservice.a.a())));
	//   21   40:aload_3         
	//   22   41:ldc2            #388 <String "push_sdk_version">
	//   23   44:invokestatic    #393 <Method short com.baidu.android.pushservice.a.a()>
	//   24   47:invokevirtual   #258 <Method Intent Intent.putExtra(String, int)>
	//   25   50:pop             
			intent.putExtra("secret_key", s);
	//   26   51:aload_3         
	//   27   52:ldc1            #122 <String "secret_key">
	//   28   54:aload_2         
	//   29   55:invokevirtual   #63  <Method Intent Intent.putExtra(String, String)>
	//   30   58:pop             
			intent.setFlags(intent.getFlags() | 0x20);
	//   31   59:aload_3         
	//   32   60:aload_3         
	//   33   61:invokevirtual   #69  <Method int Intent.getFlags()>
	//   34   64:bipush          32
	//   35   66:ior             
	//   36   67:invokevirtual   #73  <Method Intent Intent.setFlags(int)>
	//   37   70:pop             
			com.baidu.android.pushservice.f.b(context, intent);
	//   38   71:aload_0         
	//   39   72:aload_3         
	//   40   73:invokestatic    #78  <Method void com.baidu.android.pushservice.f.b(Context, Intent)>
			return;
	//   41   76:return          
		}
	}

	private static final String TAG = "PushManager";
}
