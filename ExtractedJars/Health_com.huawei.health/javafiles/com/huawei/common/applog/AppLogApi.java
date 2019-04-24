// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.huawei.common.applog;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.text.TextUtils;
import android.util.Base64;
import com.huawei.common.applog.bean.Event;
import com.huawei.feedback.a.b.b;
import com.huawei.feedback.bean.a;
import com.huawei.feedback.component.AutoUploadService;
import com.huawei.feedback.d;
import com.huawei.feedback.e;
import com.huawei.feedback.g;
import com.huawei.feedback.logic.CrashHandler;
import com.huawei.phoneserviceuni.common.e.c;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.huawei.common.applog:
//			a, e

public class AppLogApi
{

	public AppLogApi()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #93  <Method void Object()>
	//    2    4:return          
	}

	public static boolean checkPolicyOver(Context context)
	{
		if(context == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       13
		{
			c.e("AppLogApi", "checkPolicyOver context null,false!");
	//    2    4:ldc1            #12  <String "AppLogApi">
	//    3    6:ldc1            #113 <String "checkPolicyOver context null,false!">
	//    4    8:invokestatic    #119 <Method void c.e(String, String)>
			return false;
	//    5   11:iconst_0        
	//    6   12:ireturn         
		}
		boolean flag = false;
	//    7   13:iconst_0        
	//    8   14:istore_2        
		long l = (new SecureRandom()).nextInt(0x36ee80);
	//    9   15:new             #121 <Class SecureRandom>
	//   10   18:dup             
	//   11   19:invokespecial   #122 <Method void SecureRandom()>
	//   12   22:ldc1            #123 <Int 0x36ee80>
	//   13   24:invokevirtual   #127 <Method int SecureRandom.nextInt(int)>
	//   14   27:i2l             
	//   15   28:lstore_3        
		long l1 = System.currentTimeMillis();
	//   16   29:invokestatic    #133 <Method long System.currentTimeMillis()>
	//   17   32:lstore          5
		long l2 = b.a().a(context);
	//   18   34:invokestatic    #139 <Method b b.a()>
	//   19   37:aload_0         
	//   20   38:invokevirtual   #142 <Method long b.a(Context)>
	//   21   41:lstore          7
		c.e("AppLogApi", (new StringBuilder()).append("checkPolicyOver beforeTimeMillis").append(l2).toString());
	//   22   43:ldc1            #12  <String "AppLogApi">
	//   23   45:new             #144 <Class StringBuilder>
	//   24   48:dup             
	//   25   49:invokespecial   #145 <Method void StringBuilder()>
	//   26   52:ldc1            #147 <String "checkPolicyOver beforeTimeMillis">
	//   27   54:invokevirtual   #151 <Method StringBuilder StringBuilder.append(String)>
	//   28   57:lload           7
	//   29   59:invokevirtual   #154 <Method StringBuilder StringBuilder.append(long)>
	//   30   62:invokevirtual   #157 <Method String StringBuilder.toString()>
	//   31   65:invokestatic    #119 <Method void c.e(String, String)>
		if(-1L == l2)
	//*  32   68:ldc2w           #158 <Long -1L>
	//*  33   71:lload           7
	//*  34   73:lcmp            
	//*  35   74:ifne            98
		{
			c.e("AppLogApi", "checkPolicyOver -1==beforeTimeMillis!");
	//   36   77:ldc1            #12  <String "AppLogApi">
	//   37   79:ldc1            #161 <String "checkPolicyOver -1==beforeTimeMillis!">
	//   38   81:invokestatic    #119 <Method void c.e(String, String)>
			b.a().a(context, l1);
	//   39   84:invokestatic    #139 <Method b b.a()>
	//   40   87:aload_0         
	//   41   88:lload           5
	//   42   90:invokevirtual   #164 <Method void b.a(Context, long)>
			flag = true;
	//   43   93:iconst_1        
	//   44   94:istore_2        
		} else
	//*  45   95:goto            226
		{
			int j = b.a().h(context);
	//   46   98:invokestatic    #139 <Method b b.a()>
	//   47  101:aload_0         
	//   48  102:invokevirtual   #168 <Method int b.h(Context)>
	//   49  105:istore_1        
			long l3 = 0x5265c00L * (long)j;
	//   50  106:ldc2w           #169 <Long 0x5265c00L>
	//   51  109:iload_1         
	//   52  110:i2l             
	//   53  111:lmul            
	//   54  112:lstore          9
			c.e("AppLogApi", (new StringBuilder()).append("checkPolicyOver policy").append(j).toString());
	//   55  114:ldc1            #12  <String "AppLogApi">
	//   56  116:new             #144 <Class StringBuilder>
	//   57  119:dup             
	//   58  120:invokespecial   #145 <Method void StringBuilder()>
	//   59  123:ldc1            #172 <String "checkPolicyOver policy">
	//   60  125:invokevirtual   #151 <Method StringBuilder StringBuilder.append(String)>
	//   61  128:iload_1         
	//   62  129:invokevirtual   #175 <Method StringBuilder StringBuilder.append(int)>
	//   63  132:invokevirtual   #157 <Method String StringBuilder.toString()>
	//   64  135:invokestatic    #119 <Method void c.e(String, String)>
			if(-1 == j)
	//*  65  138:iconst_m1       
	//*  66  139:iload_1         
	//*  67  140:icmpne          156
			{
				flag = true;
	//   68  143:iconst_1        
	//   69  144:istore_2        
				b.a().f(context, 1);
	//   70  145:invokestatic    #139 <Method b b.a()>
	//   71  148:aload_0         
	//   72  149:iconst_1        
	//   73  150:invokevirtual   #179 <Method void b.f(Context, int)>
			} else
	//*  74  153:goto            226
			if(l1 - l2 > l3 + l)
	//*  75  156:lload           5
	//*  76  158:lload           7
	//*  77  160:lsub            
	//*  78  161:lload           9
	//*  79  163:lload_3         
	//*  80  164:ladd            
	//*  81  165:lcmp            
	//*  82  166:ifle            226
			{
				c.e("AppLogApi", (new StringBuilder()).append("checkPolicyOver currentTimeMillis-beforeTimeMillis").append(l1 - l2).toString());
	//   83  169:ldc1            #12  <String "AppLogApi">
	//   84  171:new             #144 <Class StringBuilder>
	//   85  174:dup             
	//   86  175:invokespecial   #145 <Method void StringBuilder()>
	//   87  178:ldc1            #181 <String "checkPolicyOver currentTimeMillis-beforeTimeMillis">
	//   88  180:invokevirtual   #151 <Method StringBuilder StringBuilder.append(String)>
	//   89  183:lload           5
	//   90  185:lload           7
	//   91  187:lsub            
	//   92  188:invokevirtual   #154 <Method StringBuilder StringBuilder.append(long)>
	//   93  191:invokevirtual   #157 <Method String StringBuilder.toString()>
	//   94  194:invokestatic    #119 <Method void c.e(String, String)>
				c.e("AppLogApi", (new StringBuilder()).append("checkPolicyOver (policymillis+randommillis)").append(l3 + l).toString());
	//   95  197:ldc1            #12  <String "AppLogApi">
	//   96  199:new             #144 <Class StringBuilder>
	//   97  202:dup             
	//   98  203:invokespecial   #145 <Method void StringBuilder()>
	//   99  206:ldc1            #183 <String "checkPolicyOver (policymillis+randommillis)">
	//  100  208:invokevirtual   #151 <Method StringBuilder StringBuilder.append(String)>
	//  101  211:lload           9
	//  102  213:lload_3         
	//  103  214:ladd            
	//  104  215:invokevirtual   #154 <Method StringBuilder StringBuilder.append(long)>
	//  105  218:invokevirtual   #157 <Method String StringBuilder.toString()>
	//  106  221:invokestatic    #119 <Method void c.e(String, String)>
				flag = true;
	//  107  224:iconst_1        
	//  108  225:istore_2        
			}
		}
		c.e("AppLogApi", (new StringBuilder()).append("checkPolicyOver ").append(flag).toString());
	//  109  226:ldc1            #12  <String "AppLogApi">
	//  110  228:new             #144 <Class StringBuilder>
	//  111  231:dup             
	//  112  232:invokespecial   #145 <Method void StringBuilder()>
	//  113  235:ldc1            #185 <String "checkPolicyOver ">
	//  114  237:invokevirtual   #151 <Method StringBuilder StringBuilder.append(String)>
	//  115  240:iload_2         
	//  116  241:invokevirtual   #188 <Method StringBuilder StringBuilder.append(boolean)>
	//  117  244:invokevirtual   #157 <Method String StringBuilder.toString()>
	//  118  247:invokestatic    #119 <Method void c.e(String, String)>
		return flag;
	//  119  250:iload_2         
	//  120  251:ireturn         
	}

	public static boolean checkTimeOver(Context context)
	{
		boolean flag;
label0:
		{
			if(context == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       13
			{
				c.e("AppLogApi", "checkTimeOver context null,false!");
	//    2    4:ldc1            #12  <String "AppLogApi">
	//    3    6:ldc1            #191 <String "checkTimeOver context null,false!">
	//    4    8:invokestatic    #119 <Method void c.e(String, String)>
				return false;
	//    5   11:iconst_0        
	//    6   12:ireturn         
			}
			boolean flag1 = false;
	//    7   13:iconst_0        
	//    8   14:istore_2        
			long l = System.currentTimeMillis();
	//    9   15:invokestatic    #133 <Method long System.currentTimeMillis()>
	//   10   18:lstore_3        
			c.e("AppLogApi", (new StringBuilder()).append("currentTimeMillis!").append(l).toString());
	//   11   19:ldc1            #12  <String "AppLogApi">
	//   12   21:new             #144 <Class StringBuilder>
	//   13   24:dup             
	//   14   25:invokespecial   #145 <Method void StringBuilder()>
	//   15   28:ldc1            #193 <String "currentTimeMillis!">
	//   16   30:invokevirtual   #151 <Method StringBuilder StringBuilder.append(String)>
	//   17   33:lload_3         
	//   18   34:invokevirtual   #154 <Method StringBuilder StringBuilder.append(long)>
	//   19   37:invokevirtual   #157 <Method String StringBuilder.toString()>
	//   20   40:invokestatic    #119 <Method void c.e(String, String)>
			long l1 = b.a().b(context);
	//   21   43:invokestatic    #139 <Method b b.a()>
	//   22   46:aload_0         
	//   23   47:invokevirtual   #196 <Method long b.b(Context)>
	//   24   50:lstore          5
			c.e("AppLogApi", (new StringBuilder()).append("beforeTimeMillis!").append(l1).toString());
	//   25   52:ldc1            #12  <String "AppLogApi">
	//   26   54:new             #144 <Class StringBuilder>
	//   27   57:dup             
	//   28   58:invokespecial   #145 <Method void StringBuilder()>
	//   29   61:ldc1            #198 <String "beforeTimeMillis!">
	//   30   63:invokevirtual   #151 <Method StringBuilder StringBuilder.append(String)>
	//   31   66:lload           5
	//   32   68:invokevirtual   #154 <Method StringBuilder StringBuilder.append(long)>
	//   33   71:invokevirtual   #157 <Method String StringBuilder.toString()>
	//   34   74:invokestatic    #119 <Method void c.e(String, String)>
			if(-1L != l1)
	//*  35   77:ldc2w           #158 <Long -1L>
	//*  36   80:lload           5
	//*  37   82:lcmp            
	//*  38   83:ifeq            108
			{
				flag = flag1;
	//   39   86:iload_2         
	//   40   87:istore_1        
				if(l - l1 <= 0x927c0L)
					break label0;
	//   41   88:lload_3         
	//   42   89:lload           5
	//   43   91:lsub            
	//   44   92:ldc2w           #199 <Long 0x927c0L>
	//   45   95:lcmp            
	//   46   96:ifle            125
				flag = flag1;
	//   47   99:iload_2         
	//   48  100:istore_1        
				if(!com.huawei.feedback.e.q(context))
					break label0;
	//   49  101:aload_0         
	//   50  102:invokestatic    #205 <Method boolean e.q(Context)>
	//   51  105:ifeq            125
			}
			b.a().b(context, l);
	//   52  108:invokestatic    #139 <Method b b.a()>
	//   53  111:aload_0         
	//   54  112:lload_3         
	//   55  113:invokevirtual   #207 <Method void b.b(Context, long)>
			c.e("AppLogApi", "setTenMinAutoCheckTime!");
	//   56  116:ldc1            #12  <String "AppLogApi">
	//   57  118:ldc1            #209 <String "setTenMinAutoCheckTime!">
	//   58  120:invokestatic    #119 <Method void c.e(String, String)>
			flag = true;
	//   59  123:iconst_1        
	//   60  124:istore_1        
		}
		c.e("AppLogApi", (new StringBuilder()).append("checkTimeOver ").append(flag).toString());
	//   61  125:ldc1            #12  <String "AppLogApi">
	//   62  127:new             #144 <Class StringBuilder>
	//   63  130:dup             
	//   64  131:invokespecial   #145 <Method void StringBuilder()>
	//   65  134:ldc1            #211 <String "checkTimeOver ">
	//   66  136:invokevirtual   #151 <Method StringBuilder StringBuilder.append(String)>
	//   67  139:iload_1         
	//   68  140:invokevirtual   #188 <Method StringBuilder StringBuilder.append(boolean)>
	//   69  143:invokevirtual   #157 <Method String StringBuilder.toString()>
	//   70  146:invokestatic    #119 <Method void c.e(String, String)>
		return flag;
	//   71  149:iload_1         
	//   72  150:ireturn         
	}

	public static void checkUploadlog(Context context)
	{
		if(context == null || !com.huawei.feedback.e.m(context))
	//*   0    0:aload_0         
	//*   1    1:ifnull          11
	//*   2    4:aload_0         
	//*   3    5:invokestatic    #216 <Method boolean e.m(Context)>
	//*   4    8:ifne            19
		{
			c.e("AppLogApi", "checkUploadlog isAllowUpload false");
	//    5   11:ldc1            #12  <String "AppLogApi">
	//    6   13:ldc1            #218 <String "checkUploadlog isAllowUpload false">
	//    7   15:invokestatic    #119 <Method void c.e(String, String)>
			return;
	//    8   18:return          
		} else
		{
			(new Handler()).postDelayed(((Runnable) (new _cls2(context))), 15000L);
	//    9   19:new             #220 <Class Handler>
	//   10   22:dup             
	//   11   23:invokespecial   #221 <Method void Handler()>
	//   12   26:new             #223 <Class AppLogApi$2>
	//   13   29:dup             
	//   14   30:aload_0         
	//   15   31:invokespecial   #225 <Method void AppLogApi$2(Context)>
	//   16   34:ldc2w           #226 <Long 15000L>
	//   17   37:invokevirtual   #231 <Method boolean Handler.postDelayed(Runnable, long)>
	//   18   40:pop             
			return;
	//   19   41:return          
		}
	}

	private static File creatEventlogzip(List list, Bundle bundle, String s)
	{
		Object obj;
		Object obj2;
		BufferedWriter bufferedwriter;
		Object obj3;
		Object obj4;
		OutputStreamWriter outputstreamwriter;
		BufferedWriter bufferedwriter1;
		FileOutputStream fileoutputstream1;
		OutputStreamWriter outputstreamwriter1;
		BufferedWriter bufferedwriter2;
		FileOutputStream fileoutputstream2;
		OutputStreamWriter outputstreamwriter2;
		Object obj5;
		Object obj6;
		Object obj7;
		Object obj8;
		Object obj9;
		Object obj10;
		File file;
		ArrayList arraylist;
		String s3;
		c.e("AppLogApi", "begin creatEventlogzip!");
	//    0    0:ldc1            #12  <String "AppLogApi">
	//    1    2:ldc1            #243 <String "begin creatEventlogzip!">
	//    2    4:invokestatic    #119 <Method void c.e(String, String)>
		obj5 = null;
	//    3    7:aconst_null     
	//    4    8:astore          17
		obj6 = null;
	//    5   10:aconst_null     
	//    6   11:astore          18
		obj7 = null;
	//    7   13:aconst_null     
	//    8   14:astore          19
		bufferedwriter = null;
	//    9   16:aconst_null     
	//   10   17:astore          7
		String s1 = null;
	//   11   19:aconst_null     
	//   12   20:astore          5
		arraylist = new ArrayList();
	//   13   22:new             #66  <Class ArrayList>
	//   14   25:dup             
	//   15   26:invokespecial   #69  <Method void ArrayList()>
	//   16   29:astore          24
		obj = ((Object) (s1));
	//   17   31:aload           5
	//   18   33:astore          4
		if(list == null)
			break MISSING_BLOCK_LABEL_1225;
	//   19   35:aload_0         
	//   20   36:ifnull          1225
		obj = ((Object) (s1));
	//   21   39:aload           5
	//   22   41:astore          4
		if(list.size() <= 0)
			break MISSING_BLOCK_LABEL_1225;
	//   23   43:aload_0         
	//   24   44:invokeinterface #248 <Method int List.size()>
	//   25   49:ifle            1225
		for(int j = 0; j < list.size(); j++)
	//*  26   52:iconst_0        
	//*  27   53:istore_3        
	//*  28   54:iload_3         
	//*  29   55:aload_0         
	//*  30   56:invokeinterface #248 <Method int List.size()>
	//*  31   61:icmpge          92
			((List) (arraylist)).add(((Object) (((a)list.get(j)).f())));
	//   32   64:aload           24
	//   33   66:aload_0         
	//   34   67:iload_3         
	//   35   68:invokeinterface #252 <Method Object List.get(int)>
	//   36   73:checkcast       #254 <Class a>
	//   37   76:invokevirtual   #256 <Method String a.f()>
	//   38   79:invokeinterface #260 <Method boolean List.add(Object)>
	//   39   84:pop             

	//   40   85:iload_3         
	//   41   86:iconst_1        
	//   42   87:iadd            
	//   43   88:istore_3        
	//*  44   89:goto            54
		list = ((List) (bundle.getString("LogVersion")));
	//   45   92:aload_1         
	//   46   93:ldc2            #262 <String "LogVersion">
	//   47   96:invokevirtual   #268 <Method String Bundle.getString(String)>
	//   48   99:astore_0        
		obj = ((Object) (bundle.getString("LogSubversion")));
	//   49  100:aload_1         
	//   50  101:ldc2            #270 <String "LogSubversion">
	//   51  104:invokevirtual   #268 <Method String Bundle.getString(String)>
	//   52  107:astore          4
		s1 = bundle.getString("ProductName");
	//   53  109:aload_1         
	//   54  110:ldc2            #272 <String "ProductName">
	//   55  113:invokevirtual   #268 <Method String Bundle.getString(String)>
	//   56  116:astore          5
		obj2 = ((Object) (bundle.getString("ProductVersion")));
	//   57  118:aload_1         
	//   58  119:ldc2            #274 <String "ProductVersion">
	//   59  122:invokevirtual   #268 <Method String Bundle.getString(String)>
	//   60  125:astore          6
		obj3 = ((Object) (bundle.getString("SN")));
	//   61  127:aload_1         
	//   62  128:ldc2            #276 <String "SN">
	//   63  131:invokevirtual   #268 <Method String Bundle.getString(String)>
	//   64  134:astore          8
		obj4 = ((Object) (bundle.getString("IMEI")));
	//   65  136:aload_1         
	//   66  137:ldc2            #278 <String "IMEI">
	//   67  140:invokevirtual   #268 <Method String Bundle.getString(String)>
	//   68  143:astore          9
		bundle = ((Bundle) (new JSONObject()));
	//   69  145:new             #280 <Class JSONObject>
	//   70  148:dup             
	//   71  149:invokespecial   #281 <Method void JSONObject()>
	//   72  152:astore_1        
		try
		{
			((JSONObject) (bundle)).putOpt("LogVersion", ((Object) (list)));
	//   73  153:aload_1         
	//   74  154:ldc2            #262 <String "LogVersion">
	//   75  157:aload_0         
	//   76  158:invokevirtual   #285 <Method JSONObject JSONObject.putOpt(String, Object)>
	//   77  161:pop             
			((JSONObject) (bundle)).putOpt("LogSubversion", obj);
	//   78  162:aload_1         
	//   79  163:ldc2            #270 <String "LogSubversion">
	//   80  166:aload           4
	//   81  168:invokevirtual   #285 <Method JSONObject JSONObject.putOpt(String, Object)>
	//   82  171:pop             
			((JSONObject) (bundle)).putOpt("ProductName", ((Object) (s1)));
	//   83  172:aload_1         
	//   84  173:ldc2            #272 <String "ProductName">
	//   85  176:aload           5
	//   86  178:invokevirtual   #285 <Method JSONObject JSONObject.putOpt(String, Object)>
	//   87  181:pop             
			((JSONObject) (bundle)).putOpt("ProductVersion", obj2);
	//   88  182:aload_1         
	//   89  183:ldc2            #274 <String "ProductVersion">
	//   90  186:aload           6
	//   91  188:invokevirtual   #285 <Method JSONObject JSONObject.putOpt(String, Object)>
	//   92  191:pop             
			((JSONObject) (bundle)).putOpt("SN", obj3);
	//   93  192:aload_1         
	//   94  193:ldc2            #276 <String "SN">
	//   95  196:aload           8
	//   96  198:invokevirtual   #285 <Method JSONObject JSONObject.putOpt(String, Object)>
	//   97  201:pop             
			((JSONObject) (bundle)).putOpt("IMEI", obj4);
	//   98  202:aload_1         
	//   99  203:ldc2            #278 <String "IMEI">
	//  100  206:aload           9
	//  101  208:invokevirtual   #285 <Method JSONObject JSONObject.putOpt(String, Object)>
	//  102  211:pop             
		}
	//* 103  212:goto            244
		// Misplaced declaration of an exception variable
		catch(List list)
	//* 104  215:astore_0        
		{
			c.e("AppLogApi", (new StringBuilder()).append("JSONException!").append(((JSONException) (list)).getMessage()).toString());
	//  105  216:ldc1            #12  <String "AppLogApi">
	//  106  218:new             #144 <Class StringBuilder>
	//  107  221:dup             
	//  108  222:invokespecial   #145 <Method void StringBuilder()>
	//  109  225:ldc2            #287 <String "JSONException!">
	//  110  228:invokevirtual   #151 <Method StringBuilder StringBuilder.append(String)>
	//  111  231:aload_0         
	//  112  232:invokevirtual   #290 <Method String JSONException.getMessage()>
	//  113  235:invokevirtual   #151 <Method StringBuilder StringBuilder.append(String)>
	//  114  238:invokevirtual   #157 <Method String StringBuilder.toString()>
	//  115  241:invokestatic    #119 <Method void c.e(String, String)>
		}
		s3 = ((JSONObject) (bundle)).toString();
	//  116  244:aload_1         
	//  117  245:invokevirtual   #291 <Method String JSONObject.toString()>
	//  118  248:astore          25
		file = new File(s, "eventinfo.log");
	//  119  250:new             #293 <Class File>
	//  120  253:dup             
	//  121  254:aload_2         
	//  122  255:ldc2            #295 <String "eventinfo.log">
	//  123  258:invokespecial   #297 <Method void File(String, String)>
	//  124  261:astore          23
		c.e("AppLogApi", (new StringBuilder()).append("Eventlog path").append(file.toString()).toString());
	//  125  263:ldc1            #12  <String "AppLogApi">
	//  126  265:new             #144 <Class StringBuilder>
	//  127  268:dup             
	//  128  269:invokespecial   #145 <Method void StringBuilder()>
	//  129  272:ldc2            #299 <String "Eventlog path">
	//  130  275:invokevirtual   #151 <Method StringBuilder StringBuilder.append(String)>
	//  131  278:aload           23
	//  132  280:invokevirtual   #300 <Method String File.toString()>
	//  133  283:invokevirtual   #151 <Method StringBuilder StringBuilder.append(String)>
	//  134  286:invokevirtual   #157 <Method String StringBuilder.toString()>
	//  135  289:invokestatic    #119 <Method void c.e(String, String)>
		fileoutputstream1 = null;
	//  136  292:aconst_null     
	//  137  293:astore          12
		fileoutputstream2 = null;
	//  138  295:aconst_null     
	//  139  296:astore          15
		bundle = null;
	//  140  298:aconst_null     
	//  141  299:astore_1        
		obj4 = null;
	//  142  300:aconst_null     
	//  143  301:astore          9
		obj8 = null;
	//  144  303:aconst_null     
	//  145  304:astore          20
		obj9 = null;
	//  146  306:aconst_null     
	//  147  307:astore          21
		obj10 = null;
	//  148  309:aconst_null     
	//  149  310:astore          22
		obj2 = null;
	//  150  312:aconst_null     
	//  151  313:astore          6
		obj3 = ((Object) (bufferedwriter));
	//  152  315:aload           7
	//  153  317:astore          8
		outputstreamwriter = ((OutputStreamWriter) (obj2));
	//  154  319:aload           6
	//  155  321:astore          10
		bufferedwriter1 = ((BufferedWriter) (obj5));
	//  156  323:aload           17
	//  157  325:astore          11
		outputstreamwriter1 = ((OutputStreamWriter) (obj8));
	//  158  327:aload           20
	//  159  329:astore          13
		bufferedwriter2 = ((BufferedWriter) (obj6));
	//  160  331:aload           18
	//  161  333:astore          14
		outputstreamwriter2 = ((OutputStreamWriter) (obj9));
	//  162  335:aload           21
	//  163  337:astore          16
		list = ((List) (obj7));
	//  164  339:aload           19
	//  165  341:astore_0        
		obj = ((Object) (obj10));
	//  166  342:aload           22
	//  167  344:astore          4
		FileOutputStream fileoutputstream = new FileOutputStream(file);
	//  168  346:new             #302 <Class FileOutputStream>
	//  169  349:dup             
	//  170  350:aload           23
	//  171  352:invokespecial   #305 <Method void FileOutputStream(File)>
	//  172  355:astore          5
		obj3 = ((Object) (bufferedwriter));
	//  173  357:aload           7
	//  174  359:astore          8
		obj4 = ((Object) (fileoutputstream));
	//  175  361:aload           5
	//  176  363:astore          9
		outputstreamwriter = ((OutputStreamWriter) (obj2));
	//  177  365:aload           6
	//  178  367:astore          10
		bufferedwriter1 = ((BufferedWriter) (obj5));
	//  179  369:aload           17
	//  180  371:astore          11
		fileoutputstream1 = fileoutputstream;
	//  181  373:aload           5
	//  182  375:astore          12
		outputstreamwriter1 = ((OutputStreamWriter) (obj8));
	//  183  377:aload           20
	//  184  379:astore          13
		bufferedwriter2 = ((BufferedWriter) (obj6));
	//  185  381:aload           18
	//  186  383:astore          14
		fileoutputstream2 = fileoutputstream;
	//  187  385:aload           5
	//  188  387:astore          15
		outputstreamwriter2 = ((OutputStreamWriter) (obj9));
	//  189  389:aload           21
	//  190  391:astore          16
		list = ((List) (obj7));
	//  191  393:aload           19
	//  192  395:astore_0        
		bundle = ((Bundle) (fileoutputstream));
	//  193  396:aload           5
	//  194  398:astore_1        
		obj = ((Object) (obj10));
	//  195  399:aload           22
	//  196  401:astore          4
		obj2 = ((Object) (new OutputStreamWriter(((java.io.OutputStream) (fileoutputstream)), "UTF-8")));
	//  197  403:new             #307 <Class OutputStreamWriter>
	//  198  406:dup             
	//  199  407:aload           5
	//  200  409:ldc2            #309 <String "UTF-8">
	//  201  412:invokespecial   #312 <Method void OutputStreamWriter(java.io.OutputStream, String)>
	//  202  415:astore          6
		obj3 = ((Object) (bufferedwriter));
	//  203  417:aload           7
	//  204  419:astore          8
		obj4 = ((Object) (fileoutputstream));
	//  205  421:aload           5
	//  206  423:astore          9
		outputstreamwriter = ((OutputStreamWriter) (obj2));
	//  207  425:aload           6
	//  208  427:astore          10
		bufferedwriter1 = ((BufferedWriter) (obj5));
	//  209  429:aload           17
	//  210  431:astore          11
		fileoutputstream1 = fileoutputstream;
	//  211  433:aload           5
	//  212  435:astore          12
		outputstreamwriter1 = ((OutputStreamWriter) (obj2));
	//  213  437:aload           6
	//  214  439:astore          13
		bufferedwriter2 = ((BufferedWriter) (obj6));
	//  215  441:aload           18
	//  216  443:astore          14
		fileoutputstream2 = fileoutputstream;
	//  217  445:aload           5
	//  218  447:astore          15
		outputstreamwriter2 = ((OutputStreamWriter) (obj2));
	//  219  449:aload           6
	//  220  451:astore          16
		list = ((List) (obj7));
	//  221  453:aload           19
	//  222  455:astore_0        
		bundle = ((Bundle) (fileoutputstream));
	//  223  456:aload           5
	//  224  458:astore_1        
		obj = obj2;
	//  225  459:aload           6
	//  226  461:astore          4
		bufferedwriter = new BufferedWriter(((java.io.Writer) (obj2)));
	//  227  463:new             #314 <Class BufferedWriter>
	//  228  466:dup             
	//  229  467:aload           6
	//  230  469:invokespecial   #317 <Method void BufferedWriter(java.io.Writer)>
	//  231  472:astore          7
		obj3 = ((Object) (bufferedwriter));
	//  232  474:aload           7
	//  233  476:astore          8
		obj4 = ((Object) (fileoutputstream));
	//  234  478:aload           5
	//  235  480:astore          9
		outputstreamwriter = ((OutputStreamWriter) (obj2));
	//  236  482:aload           6
	//  237  484:astore          10
		bufferedwriter1 = bufferedwriter;
	//  238  486:aload           7
	//  239  488:astore          11
		fileoutputstream1 = fileoutputstream;
	//  240  490:aload           5
	//  241  492:astore          12
		outputstreamwriter1 = ((OutputStreamWriter) (obj2));
	//  242  494:aload           6
	//  243  496:astore          13
		bufferedwriter2 = bufferedwriter;
	//  244  498:aload           7
	//  245  500:astore          14
		fileoutputstream2 = fileoutputstream;
	//  246  502:aload           5
	//  247  504:astore          15
		outputstreamwriter2 = ((OutputStreamWriter) (obj2));
	//  248  506:aload           6
	//  249  508:astore          16
		list = ((List) (bufferedwriter));
	//  250  510:aload           7
	//  251  512:astore_0        
		bundle = ((Bundle) (fileoutputstream));
	//  252  513:aload           5
	//  253  515:astore_1        
		obj = obj2;
	//  254  516:aload           6
	//  255  518:astore          4
		bufferedwriter.append(((CharSequence) ((new StringBuilder()).append(s3).append('\n').toString())));
	//  256  520:aload           7
	//  257  522:new             #144 <Class StringBuilder>
	//  258  525:dup             
	//  259  526:invokespecial   #145 <Method void StringBuilder()>
	//  260  529:aload           25
	//  261  531:invokevirtual   #151 <Method StringBuilder StringBuilder.append(String)>
	//  262  534:bipush          10
	//  263  536:invokevirtual   #320 <Method StringBuilder StringBuilder.append(char)>
	//  264  539:invokevirtual   #157 <Method String StringBuilder.toString()>
	//  265  542:invokevirtual   #323 <Method java.io.Writer BufferedWriter.append(CharSequence)>
	//  266  545:pop             
		int k = 0;
	//  267  546:iconst_0        
	//  268  547:istore_3        
_L2:
		obj3 = ((Object) (bufferedwriter));
	//  269  548:aload           7
	//  270  550:astore          8
		obj4 = ((Object) (fileoutputstream));
	//  271  552:aload           5
	//  272  554:astore          9
		outputstreamwriter = ((OutputStreamWriter) (obj2));
	//  273  556:aload           6
	//  274  558:astore          10
		bufferedwriter1 = bufferedwriter;
	//  275  560:aload           7
	//  276  562:astore          11
		fileoutputstream1 = fileoutputstream;
	//  277  564:aload           5
	//  278  566:astore          12
		outputstreamwriter1 = ((OutputStreamWriter) (obj2));
	//  279  568:aload           6
	//  280  570:astore          13
		bufferedwriter2 = bufferedwriter;
	//  281  572:aload           7
	//  282  574:astore          14
		fileoutputstream2 = fileoutputstream;
	//  283  576:aload           5
	//  284  578:astore          15
		outputstreamwriter2 = ((OutputStreamWriter) (obj2));
	//  285  580:aload           6
	//  286  582:astore          16
		list = ((List) (bufferedwriter));
	//  287  584:aload           7
	//  288  586:astore_0        
		bundle = ((Bundle) (fileoutputstream));
	//  289  587:aload           5
	//  290  589:astore_1        
		obj = obj2;
	//  291  590:aload           6
	//  292  592:astore          4
		if(k >= ((List) (arraylist)).size())
			break; /* Loop/switch isn't completed */
	//  293  594:iload_3         
	//  294  595:aload           24
	//  295  597:invokeinterface #248 <Method int List.size()>
	//  296  602:icmpge          693
		obj3 = ((Object) (bufferedwriter));
	//  297  605:aload           7
	//  298  607:astore          8
		obj4 = ((Object) (fileoutputstream));
	//  299  609:aload           5
	//  300  611:astore          9
		outputstreamwriter = ((OutputStreamWriter) (obj2));
	//  301  613:aload           6
	//  302  615:astore          10
		bufferedwriter1 = bufferedwriter;
	//  303  617:aload           7
	//  304  619:astore          11
		fileoutputstream1 = fileoutputstream;
	//  305  621:aload           5
	//  306  623:astore          12
		outputstreamwriter1 = ((OutputStreamWriter) (obj2));
	//  307  625:aload           6
	//  308  627:astore          13
		bufferedwriter2 = bufferedwriter;
	//  309  629:aload           7
	//  310  631:astore          14
		fileoutputstream2 = fileoutputstream;
	//  311  633:aload           5
	//  312  635:astore          15
		outputstreamwriter2 = ((OutputStreamWriter) (obj2));
	//  313  637:aload           6
	//  314  639:astore          16
		list = ((List) (bufferedwriter));
	//  315  641:aload           7
	//  316  643:astore_0        
		bundle = ((Bundle) (fileoutputstream));
	//  317  644:aload           5
	//  318  646:astore_1        
		obj = obj2;
	//  319  647:aload           6
	//  320  649:astore          4
		bufferedwriter.append(((CharSequence) ((new StringBuilder()).append((String)((List) (arraylist)).get(k)).append('\n').toString())));
	//  321  651:aload           7
	//  322  653:new             #144 <Class StringBuilder>
	//  323  656:dup             
	//  324  657:invokespecial   #145 <Method void StringBuilder()>
	//  325  660:aload           24
	//  326  662:iload_3         
	//  327  663:invokeinterface #252 <Method Object List.get(int)>
	//  328  668:checkcast       #325 <Class String>
	//  329  671:invokevirtual   #151 <Method StringBuilder StringBuilder.append(String)>
	//  330  674:bipush          10
	//  331  676:invokevirtual   #320 <Method StringBuilder StringBuilder.append(char)>
	//  332  679:invokevirtual   #157 <Method String StringBuilder.toString()>
	//  333  682:invokevirtual   #323 <Method java.io.Writer BufferedWriter.append(CharSequence)>
	//  334  685:pop             
		k++;
	//  335  686:iload_3         
	//  336  687:iconst_1        
	//  337  688:iadd            
	//  338  689:istore_3        
		if(true) goto _L2; else goto _L1
	//  339  690:goto            548
_L1:
		obj3 = ((Object) (bufferedwriter));
	//  340  693:aload           7
	//  341  695:astore          8
		obj4 = ((Object) (fileoutputstream));
	//  342  697:aload           5
	//  343  699:astore          9
		outputstreamwriter = ((OutputStreamWriter) (obj2));
	//  344  701:aload           6
	//  345  703:astore          10
		bufferedwriter1 = bufferedwriter;
	//  346  705:aload           7
	//  347  707:astore          11
		fileoutputstream1 = fileoutputstream;
	//  348  709:aload           5
	//  349  711:astore          12
		outputstreamwriter1 = ((OutputStreamWriter) (obj2));
	//  350  713:aload           6
	//  351  715:astore          13
		bufferedwriter2 = bufferedwriter;
	//  352  717:aload           7
	//  353  719:astore          14
		fileoutputstream2 = fileoutputstream;
	//  354  721:aload           5
	//  355  723:astore          15
		outputstreamwriter2 = ((OutputStreamWriter) (obj2));
	//  356  725:aload           6
	//  357  727:astore          16
		list = ((List) (bufferedwriter));
	//  358  729:aload           7
	//  359  731:astore_0        
		bundle = ((Bundle) (fileoutputstream));
	//  360  732:aload           5
	//  361  734:astore_1        
		obj = obj2;
	//  362  735:aload           6
	//  363  737:astore          4
		bufferedwriter.flush();
	//  364  739:aload           7
	//  365  741:invokevirtual   #328 <Method void BufferedWriter.flush()>
		com.huawei.phoneserviceuni.common.e.b.a(fileoutputstream, "AppLogApi");
	//  366  744:aload           5
	//  367  746:ldc1            #12  <String "AppLogApi">
	//  368  748:invokestatic    #333 <Method void com.huawei.phoneserviceuni.common.e.b.a(FileOutputStream, String)>
		com.huawei.phoneserviceuni.common.e.b.a(((OutputStreamWriter) (obj2)), "AppLogApi");
	//  369  751:aload           6
	//  370  753:ldc1            #12  <String "AppLogApi">
	//  371  755:invokestatic    #336 <Method void com.huawei.phoneserviceuni.common.e.b.a(OutputStreamWriter, String)>
		if(bufferedwriter != null)
	//* 372  758:aload           7
	//* 373  760:ifnull          1059
			try
			{
				bufferedwriter.close();
	//  374  763:aload           7
	//  375  765:invokevirtual   #339 <Method void BufferedWriter.close()>
			}
	//* 376  768:goto            1059
			// Misplaced declaration of an exception variable
			catch(List list)
	//* 377  771:astore_0        
			{
				c.e("AppLogApi", "shutdown IOException");
	//  378  772:ldc1            #12  <String "AppLogApi">
	//  379  774:ldc2            #341 <String "shutdown IOException">
	//  380  777:invokestatic    #119 <Method void c.e(String, String)>
			}
		break MISSING_BLOCK_LABEL_1059;
	//  381  780:goto            1059
		Object obj1;
		obj1;
	//  382  783:astore          5
		list = ((List) (obj3));
	//  383  785:aload           8
	//  384  787:astore_0        
		bundle = ((Bundle) (obj4));
	//  385  788:aload           9
	//  386  790:astore_1        
		obj = ((Object) (outputstreamwriter));
	//  387  791:aload           10
	//  388  793:astore          4
		c.e("AppLogApi", (new StringBuilder()).append("creatEventlogzip FileNotFoundException!").append(((FileNotFoundException) (obj1)).getMessage()).toString());
	//  389  795:ldc1            #12  <String "AppLogApi">
	//  390  797:new             #144 <Class StringBuilder>
	//  391  800:dup             
	//  392  801:invokespecial   #145 <Method void StringBuilder()>
	//  393  804:ldc2            #343 <String "creatEventlogzip FileNotFoundException!">
	//  394  807:invokevirtual   #151 <Method StringBuilder StringBuilder.append(String)>
	//  395  810:aload           5
	//  396  812:invokevirtual   #344 <Method String FileNotFoundException.getMessage()>
	//  397  815:invokevirtual   #151 <Method StringBuilder StringBuilder.append(String)>
	//  398  818:invokevirtual   #157 <Method String StringBuilder.toString()>
	//  399  821:invokestatic    #119 <Method void c.e(String, String)>
		com.huawei.phoneserviceuni.common.e.b.a(((FileOutputStream) (obj4)), "AppLogApi");
	//  400  824:aload           9
	//  401  826:ldc1            #12  <String "AppLogApi">
	//  402  828:invokestatic    #333 <Method void com.huawei.phoneserviceuni.common.e.b.a(FileOutputStream, String)>
		com.huawei.phoneserviceuni.common.e.b.a(outputstreamwriter, "AppLogApi");
	//  403  831:aload           10
	//  404  833:ldc1            #12  <String "AppLogApi">
	//  405  835:invokestatic    #336 <Method void com.huawei.phoneserviceuni.common.e.b.a(OutputStreamWriter, String)>
		if(obj3 != null)
	//* 406  838:aload           8
	//* 407  840:ifnull          1059
			try
			{
				((BufferedWriter) (obj3)).close();
	//  408  843:aload           8
	//  409  845:invokevirtual   #339 <Method void BufferedWriter.close()>
			}
	//* 410  848:goto            1059
			// Misplaced declaration of an exception variable
			catch(List list)
	//* 411  851:astore_0        
			{
				c.e("AppLogApi", "shutdown IOException");
	//  412  852:ldc1            #12  <String "AppLogApi">
	//  413  854:ldc2            #341 <String "shutdown IOException">
	//  414  857:invokestatic    #119 <Method void c.e(String, String)>
			}
		break MISSING_BLOCK_LABEL_1059;
	//  415  860:goto            1059
		obj1;
	//  416  863:astore          5
		list = ((List) (bufferedwriter1));
	//  417  865:aload           11
	//  418  867:astore_0        
		bundle = ((Bundle) (fileoutputstream1));
	//  419  868:aload           12
	//  420  870:astore_1        
		obj = ((Object) (outputstreamwriter1));
	//  421  871:aload           13
	//  422  873:astore          4
		c.e("AppLogApi", (new StringBuilder()).append("creatEventlogzip UnsupportedEncodingException!").append(((UnsupportedEncodingException) (obj1)).getMessage()).toString());
	//  423  875:ldc1            #12  <String "AppLogApi">
	//  424  877:new             #144 <Class StringBuilder>
	//  425  880:dup             
	//  426  881:invokespecial   #145 <Method void StringBuilder()>
	//  427  884:ldc2            #346 <String "creatEventlogzip UnsupportedEncodingException!">
	//  428  887:invokevirtual   #151 <Method StringBuilder StringBuilder.append(String)>
	//  429  890:aload           5
	//  430  892:invokevirtual   #347 <Method String UnsupportedEncodingException.getMessage()>
	//  431  895:invokevirtual   #151 <Method StringBuilder StringBuilder.append(String)>
	//  432  898:invokevirtual   #157 <Method String StringBuilder.toString()>
	//  433  901:invokestatic    #119 <Method void c.e(String, String)>
		com.huawei.phoneserviceuni.common.e.b.a(fileoutputstream1, "AppLogApi");
	//  434  904:aload           12
	//  435  906:ldc1            #12  <String "AppLogApi">
	//  436  908:invokestatic    #333 <Method void com.huawei.phoneserviceuni.common.e.b.a(FileOutputStream, String)>
		com.huawei.phoneserviceuni.common.e.b.a(outputstreamwriter1, "AppLogApi");
	//  437  911:aload           13
	//  438  913:ldc1            #12  <String "AppLogApi">
	//  439  915:invokestatic    #336 <Method void com.huawei.phoneserviceuni.common.e.b.a(OutputStreamWriter, String)>
		if(bufferedwriter1 != null)
	//* 440  918:aload           11
	//* 441  920:ifnull          1059
			try
			{
				bufferedwriter1.close();
	//  442  923:aload           11
	//  443  925:invokevirtual   #339 <Method void BufferedWriter.close()>
			}
	//* 444  928:goto            1059
			// Misplaced declaration of an exception variable
			catch(List list)
	//* 445  931:astore_0        
			{
				c.e("AppLogApi", "shutdown IOException");
	//  446  932:ldc1            #12  <String "AppLogApi">
	//  447  934:ldc2            #341 <String "shutdown IOException">
	//  448  937:invokestatic    #119 <Method void c.e(String, String)>
			}
		break MISSING_BLOCK_LABEL_1059;
	//  449  940:goto            1059
		obj1;
	//  450  943:astore          5
		list = ((List) (bufferedwriter2));
	//  451  945:aload           14
	//  452  947:astore_0        
		bundle = ((Bundle) (fileoutputstream2));
	//  453  948:aload           15
	//  454  950:astore_1        
		obj = ((Object) (outputstreamwriter2));
	//  455  951:aload           16
	//  456  953:astore          4
		c.e("AppLogApi", (new StringBuilder()).append("creatEventlogzip IOException!").append(((IOException) (obj1)).getMessage()).toString());
	//  457  955:ldc1            #12  <String "AppLogApi">
	//  458  957:new             #144 <Class StringBuilder>
	//  459  960:dup             
	//  460  961:invokespecial   #145 <Method void StringBuilder()>
	//  461  964:ldc2            #349 <String "creatEventlogzip IOException!">
	//  462  967:invokevirtual   #151 <Method StringBuilder StringBuilder.append(String)>
	//  463  970:aload           5
	//  464  972:invokevirtual   #350 <Method String IOException.getMessage()>
	//  465  975:invokevirtual   #151 <Method StringBuilder StringBuilder.append(String)>
	//  466  978:invokevirtual   #157 <Method String StringBuilder.toString()>
	//  467  981:invokestatic    #119 <Method void c.e(String, String)>
		com.huawei.phoneserviceuni.common.e.b.a(fileoutputstream2, "AppLogApi");
	//  468  984:aload           15
	//  469  986:ldc1            #12  <String "AppLogApi">
	//  470  988:invokestatic    #333 <Method void com.huawei.phoneserviceuni.common.e.b.a(FileOutputStream, String)>
		com.huawei.phoneserviceuni.common.e.b.a(outputstreamwriter2, "AppLogApi");
	//  471  991:aload           16
	//  472  993:ldc1            #12  <String "AppLogApi">
	//  473  995:invokestatic    #336 <Method void com.huawei.phoneserviceuni.common.e.b.a(OutputStreamWriter, String)>
		if(bufferedwriter2 != null)
	//* 474  998:aload           14
	//* 475 1000:ifnull          1059
			try
			{
				bufferedwriter2.close();
	//  476 1003:aload           14
	//  477 1005:invokevirtual   #339 <Method void BufferedWriter.close()>
			}
	//* 478 1008:goto            1059
			// Misplaced declaration of an exception variable
			catch(List list)
	//* 479 1011:astore_0        
			{
				c.e("AppLogApi", "shutdown IOException");
	//  480 1012:ldc1            #12  <String "AppLogApi">
	//  481 1014:ldc2            #341 <String "shutdown IOException">
	//  482 1017:invokestatic    #119 <Method void c.e(String, String)>
			}
		break MISSING_BLOCK_LABEL_1059;
	//  483 1020:goto            1059
		s;
	//  484 1023:astore_2        
		com.huawei.phoneserviceuni.common.e.b.a(((FileOutputStream) (bundle)), "AppLogApi");
	//  485 1024:aload_1         
	//  486 1025:ldc1            #12  <String "AppLogApi">
	//  487 1027:invokestatic    #333 <Method void com.huawei.phoneserviceuni.common.e.b.a(FileOutputStream, String)>
		com.huawei.phoneserviceuni.common.e.b.a(((OutputStreamWriter) (obj)), "AppLogApi");
	//  488 1030:aload           4
	//  489 1032:ldc1            #12  <String "AppLogApi">
	//  490 1034:invokestatic    #336 <Method void com.huawei.phoneserviceuni.common.e.b.a(OutputStreamWriter, String)>
		if(list != null)
	//* 491 1037:aload_0         
	//* 492 1038:ifnull          1057
			try
			{
				((BufferedWriter) (list)).close();
	//  493 1041:aload_0         
	//  494 1042:invokevirtual   #339 <Method void BufferedWriter.close()>
			}
	//* 495 1045:goto            1057
			// Misplaced declaration of an exception variable
			catch(List list)
	//* 496 1048:astore_0        
			{
				c.e("AppLogApi", "shutdown IOException");
	//  497 1049:ldc1            #12  <String "AppLogApi">
	//  498 1051:ldc2            #341 <String "shutdown IOException">
	//  499 1054:invokestatic    #119 <Method void c.e(String, String)>
			}
		throw s;
	//  500 1057:aload_2         
	//  501 1058:athrow          
		list = ((List) (Build.MODEL));
	//  502 1059:getstatic       #355 <Field String Build.MODEL>
	//  503 1062:astore_0        
		bundle = ((Bundle) (Build.DISPLAY));
	//  504 1063:getstatic       #358 <Field String Build.DISPLAY>
	//  505 1066:astore_1        
		obj = ((Object) (new Date()));
	//  506 1067:new             #360 <Class Date>
	//  507 1070:dup             
	//  508 1071:invokespecial   #361 <Method void Date()>
	//  509 1074:astore          4
		obj = ((Object) ((new SimpleDateFormat("yyyyMMddHHmmss")).format(((Date) (obj)))));
	//  510 1076:new             #363 <Class SimpleDateFormat>
	//  511 1079:dup             
	//  512 1080:ldc2            #365 <String "yyyyMMddHHmmss">
	//  513 1083:invokespecial   #368 <Method void SimpleDateFormat(String)>
	//  514 1086:aload           4
	//  515 1088:invokevirtual   #372 <Method String SimpleDateFormat.format(Date)>
	//  516 1091:astore          4
		String s2 = com.huawei.phoneserviceuni.common.e.a.b.b.a(com.huawei.feedback.e.x(mContext).toUpperCase(Locale.US));
	//  517 1093:getstatic       #54  <Field Context mContext>
	//  518 1096:invokestatic    #376 <Method String e.x(Context)>
	//  519 1099:getstatic       #382 <Field Locale Locale.US>
	//  520 1102:invokevirtual   #386 <Method String String.toUpperCase(Locale)>
	//  521 1105:invokestatic    #390 <Method String com.huawei.phoneserviceuni.common.e.a.b.b.a(String)>
	//  522 1108:astore          5
		obj = ((Object) (new File(s, (new StringBuilder()).append("Eventid_").append(((String) (list))).append("_").append(((String) (bundle))).append("_").append(s2).append("_").append(((String) (obj))).append("_eventinfo.zip").toString())));
	//  523 1110:new             #293 <Class File>
	//  524 1113:dup             
	//  525 1114:aload_2         
	//  526 1115:new             #144 <Class StringBuilder>
	//  527 1118:dup             
	//  528 1119:invokespecial   #145 <Method void StringBuilder()>
	//  529 1122:ldc2            #392 <String "Eventid_">
	//  530 1125:invokevirtual   #151 <Method StringBuilder StringBuilder.append(String)>
	//  531 1128:aload_0         
	//  532 1129:invokevirtual   #151 <Method StringBuilder StringBuilder.append(String)>
	//  533 1132:ldc2            #394 <String "_">
	//  534 1135:invokevirtual   #151 <Method StringBuilder StringBuilder.append(String)>
	//  535 1138:aload_1         
	//  536 1139:invokevirtual   #151 <Method StringBuilder StringBuilder.append(String)>
	//  537 1142:ldc2            #394 <String "_">
	//  538 1145:invokevirtual   #151 <Method StringBuilder StringBuilder.append(String)>
	//  539 1148:aload           5
	//  540 1150:invokevirtual   #151 <Method StringBuilder StringBuilder.append(String)>
	//  541 1153:ldc2            #394 <String "_">
	//  542 1156:invokevirtual   #151 <Method StringBuilder StringBuilder.append(String)>
	//  543 1159:aload           4
	//  544 1161:invokevirtual   #151 <Method StringBuilder StringBuilder.append(String)>
	//  545 1164:ldc2            #396 <String "_eventinfo.zip">
	//  546 1167:invokevirtual   #151 <Method StringBuilder StringBuilder.append(String)>
	//  547 1170:invokevirtual   #157 <Method String StringBuilder.toString()>
	//  548 1173:invokespecial   #297 <Method void File(String, String)>
	//  549 1176:astore          4
		c.e("AppLogApi", (new StringBuilder()).append("Eventlogzip path").append(((File) (obj)).getPath()).toString());
	//  550 1178:ldc1            #12  <String "AppLogApi">
	//  551 1180:new             #144 <Class StringBuilder>
	//  552 1183:dup             
	//  553 1184:invokespecial   #145 <Method void StringBuilder()>
	//  554 1187:ldc2            #398 <String "Eventlogzip path">
	//  555 1190:invokevirtual   #151 <Method StringBuilder StringBuilder.append(String)>
	//  556 1193:aload           4
	//  557 1195:invokevirtual   #401 <Method String File.getPath()>
	//  558 1198:invokevirtual   #151 <Method StringBuilder StringBuilder.append(String)>
	//  559 1201:invokevirtual   #157 <Method String StringBuilder.toString()>
	//  560 1204:invokestatic    #119 <Method void c.e(String, String)>
		com.huawei.feedback.e.b(file.getPath(), ((File) (obj)).getPath());
	//  561 1207:aload           23
	//  562 1209:invokevirtual   #401 <Method String File.getPath()>
	//  563 1212:aload           4
	//  564 1214:invokevirtual   #401 <Method String File.getPath()>
	//  565 1217:invokestatic    #403 <Method void e.b(String, String)>
		com.huawei.feedback.e.b(file);
	//  566 1220:aload           23
	//  567 1222:invokestatic    #405 <Method void e.b(File)>
		return ((File) (obj));
	//  568 1225:aload           4
	//  569 1227:areturn         
	}

	public static String createBiglogzip(Context context, long l, Bundle bundle, boolean flag)
	{
		com.huawei.feedback.a.a.a a1;
		if(context == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       7
			return "";
	//    2    4:ldc1            #44  <String "">
	//    3    6:areturn         
		c.e("AppLogApi", "begin to createBiglogzip!");
	//    4    7:ldc1            #12  <String "AppLogApi">
	//    5    9:ldc2            #411 <String "begin to createBiglogzip!">
	//    6   12:invokestatic    #119 <Method void c.e(String, String)>
		autouploadloglist.clear();
	//    7   15:getstatic       #71  <Field List autouploadloglist>
	//    8   18:invokeinterface #414 <Method void List.clear()>
		if(l <= 0L && !flag)
			break MISSING_BLOCK_LABEL_308;
	//    9   23:lload_1         
	//   10   24:lconst_0        
	//   11   25:lcmp            
	//   12   26:ifgt            34
	//   13   29:iload           4
	//   14   31:ifeq            308
		a1 = new com.huawei.feedback.a.a.a(context);
	//   15   34:new             #416 <Class com.huawei.feedback.a.a.a>
	//   16   37:dup             
	//   17   38:aload_0         
	//   18   39:invokespecial   #417 <Method void com.huawei.feedback.a.a.a(Context)>
	//   19   42:astore          11
		Object obj = d.ag;
	//   20   44:getstatic       #423 <Field Object d.ag>
	//   21   47:astore          12
		obj;
	//   22   49:aload           12
		JVM INSTR monitorenter ;
	//   23   51:monitorenter    
		List list;
		list = com.huawei.feedback.a.a.b.a(a1, true);
	//   24   52:aload           11
	//   25   54:iconst_1        
	//   26   55:invokestatic    #428 <Method List com.huawei.feedback.a.a.b.a(com.huawei.feedback.a.a.a, boolean)>
	//   27   58:astore          13
		c.e("AppLogApi", (new StringBuilder()).append("autohasloglist").append(list.size()).toString());
	//   28   60:ldc1            #12  <String "AppLogApi">
	//   29   62:new             #144 <Class StringBuilder>
	//   30   65:dup             
	//   31   66:invokespecial   #145 <Method void StringBuilder()>
	//   32   69:ldc2            #430 <String "autohasloglist">
	//   33   72:invokevirtual   #151 <Method StringBuilder StringBuilder.append(String)>
	//   34   75:aload           13
	//   35   77:invokeinterface #248 <Method int List.size()>
	//   36   82:invokevirtual   #175 <Method StringBuilder StringBuilder.append(int)>
	//   37   85:invokevirtual   #157 <Method String StringBuilder.toString()>
	//   38   88:invokestatic    #119 <Method void c.e(String, String)>
		obj;
	//   39   91:aload           12
		JVM INSTR monitorexit ;
	//   40   93:monitorexit     
		  goto _L1
	//*  41   94:goto            103
		context;
	//   42   97:astore_0        
	//*  43   98:aload           12
		throw context;
	//   44  100:monitorexit     
	//   45  101:aload_0         
	//   46  102:athrow          
_L1:
		if(list.size() > 0)
	//*  47  103:aload           13
	//*  48  105:invokeinterface #248 <Method int List.size()>
	//*  49  110:ifle            202
		{
			int k = list.size();
	//   50  113:aload           13
	//   51  115:invokeinterface #248 <Method int List.size()>
	//   52  120:istore          6
			long l1 = 0L;
	//   53  122:lconst_0        
	//   54  123:lstore          7
			long l2 = getRemainMaxSize(l, context);
	//   55  125:lload_1         
	//   56  126:aload_0         
	//   57  127:invokestatic    #434 <Method long getRemainMaxSize(long, Context)>
	//   58  130:lstore          9
			int j = 0;
	//   59  132:iconst_0        
	//   60  133:istore          5
			l = l1;
	//   61  135:lload           7
	//   62  137:lstore_1        
			do
			{
				if(j >= k)
					break;
	//   63  138:iload           5
	//   64  140:iload           6
	//   65  142:icmpge          202
				l += ((a)list.get(j)).d();
	//   66  145:lload_1         
	//   67  146:aload           13
	//   68  148:iload           5
	//   69  150:invokeinterface #252 <Method Object List.get(int)>
	//   70  155:checkcast       #254 <Class a>
	//   71  158:invokevirtual   #437 <Method long a.d()>
	//   72  161:ladd            
	//   73  162:lstore_1        
				if(l > l2 && !flag)
					break;
	//   74  163:lload_1         
	//   75  164:lload           9
	//   76  166:lcmp            
	//   77  167:ifle            175
	//   78  170:iload           4
	//   79  172:ifeq            202
				autouploadloglist.add(list.get(j));
	//   80  175:getstatic       #71  <Field List autouploadloglist>
	//   81  178:aload           13
	//   82  180:iload           5
	//   83  182:invokeinterface #252 <Method Object List.get(int)>
	//   84  187:invokeinterface #260 <Method boolean List.add(Object)>
	//   85  192:pop             
				j++;
	//   86  193:iload           5
	//   87  195:iconst_1        
	//   88  196:iadd            
	//   89  197:istore          5
			} while(true);
	//   90  199:goto            138
		}
		obj = d.ag;
	//   91  202:getstatic       #423 <Field Object d.ag>
	//   92  205:astore          12
		obj;
	//   93  207:aload           12
		JVM INSTR monitorenter ;
	//   94  209:monitorenter    
		autonologlist = com.huawei.feedback.a.a.b.a(a1, false);
	//   95  210:aload           11
	//   96  212:iconst_0        
	//   97  213:invokestatic    #428 <Method List com.huawei.feedback.a.a.b.a(com.huawei.feedback.a.a.a, boolean)>
	//   98  216:putstatic       #64  <Field List autonologlist>
		obj;
	//   99  219:aload           12
		JVM INSTR monitorexit ;
	//  100  221:monitorexit     
		  goto _L2
	//* 101  222:goto            231
		context;
	//  102  225:astore_0        
	//* 103  226:aload           12
		throw context;
	//  104  228:monitorexit     
	//  105  229:aload_0         
	//  106  230:athrow          
_L2:
		ArrayList arraylist = new ArrayList();
	//  107  231:new             #66  <Class ArrayList>
	//  108  234:dup             
	//  109  235:invokespecial   #69  <Method void ArrayList()>
	//  110  238:astore          11
		ArrayList arraylist1 = new ArrayList();
	//  111  240:new             #66  <Class ArrayList>
	//  112  243:dup             
	//  113  244:invokespecial   #69  <Method void ArrayList()>
	//  114  247:astore          12
		((List) (arraylist)).addAll(((java.util.Collection) (autouploadloglist)));
	//  115  249:aload           11
	//  116  251:getstatic       #71  <Field List autouploadloglist>
	//  117  254:invokeinterface #441 <Method boolean List.addAll(java.util.Collection)>
	//  118  259:pop             
		((List) (arraylist1)).addAll(((java.util.Collection) (autonologlist)));
	//  119  260:aload           12
	//  120  262:getstatic       #64  <Field List autonologlist>
	//  121  265:invokeinterface #441 <Method boolean List.addAll(java.util.Collection)>
	//  122  270:pop             
		context = ((Context) (packageBigLogFile(((List) (arraylist)), ((List) (arraylist1)), context, bundle)));
	//  123  271:aload           11
	//  124  273:aload           12
	//  125  275:aload_0         
	//  126  276:aload_3         
	//  127  277:invokestatic    #445 <Method String packageBigLogFile(List, List, Context, Bundle)>
	//  128  280:astore_0        
		c.e("AppLogApi", (new StringBuilder()).append("Biglogzip path").append(((String) (context))).toString());
	//  129  281:ldc1            #12  <String "AppLogApi">
	//  130  283:new             #144 <Class StringBuilder>
	//  131  286:dup             
	//  132  287:invokespecial   #145 <Method void StringBuilder()>
	//  133  290:ldc2            #447 <String "Biglogzip path">
	//  134  293:invokevirtual   #151 <Method StringBuilder StringBuilder.append(String)>
	//  135  296:aload_0         
	//  136  297:invokevirtual   #151 <Method StringBuilder StringBuilder.append(String)>
	//  137  300:invokevirtual   #157 <Method String StringBuilder.toString()>
	//  138  303:invokestatic    #119 <Method void c.e(String, String)>
		return ((String) (context));
	//  139  306:aload_0         
	//  140  307:areturn         
		c.e("AppLogApi", "no remain size !");
	//  141  308:ldc1            #12  <String "AppLogApi">
	//  142  310:ldc2            #449 <String "no remain size !">
	//  143  313:invokestatic    #119 <Method void c.e(String, String)>
		context.stopService(new Intent(context, com/huawei/feedback/component/AutoUploadService));
	//  144  316:aload_0         
	//  145  317:new             #451 <Class Intent>
	//  146  320:dup             
	//  147  321:aload_0         
	//  148  322:ldc2            #453 <Class AutoUploadService>
	//  149  325:invokespecial   #456 <Method void Intent(Context, Class)>
	//  150  328:invokevirtual   #462 <Method boolean Context.stopService(Intent)>
	//  151  331:pop             
		return "";
	//  152  332:ldc1            #44  <String "">
	//  153  334:areturn         
	}

	public static void d(String s, String s1)
	{
		if(isLoggable(1))
	//*   0    0:iconst_1        
	//*   1    1:invokestatic    #466 <Method boolean isLoggable(int)>
	//*   2    4:ifeq            61
		{
			int j = Process.myTid();
	//    3    7:invokestatic    #471 <Method int Process.myTid()>
	//    4   10:istore_2        
			s = (new StringBuilder()).append(s).append("(").append(j).append(")").toString();
	//    5   11:new             #144 <Class StringBuilder>
	//    6   14:dup             
	//    7   15:invokespecial   #145 <Method void StringBuilder()>
	//    8   18:aload_0         
	//    9   19:invokevirtual   #151 <Method StringBuilder StringBuilder.append(String)>
	//   10   22:ldc2            #473 <String "(">
	//   11   25:invokevirtual   #151 <Method StringBuilder StringBuilder.append(String)>
	//   12   28:iload_2         
	//   13   29:invokevirtual   #175 <Method StringBuilder StringBuilder.append(int)>
	//   14   32:ldc2            #475 <String ")">
	//   15   35:invokevirtual   #151 <Method StringBuilder StringBuilder.append(String)>
	//   16   38:invokevirtual   #157 <Method String StringBuilder.toString()>
	//   17   41:astore_0        
			com.huawei.common.applog.a.a().a(new com.huawei.common.applog.bean.a("D", s, s1));
	//   18   42:invokestatic    #480 <Method com.huawei.common.applog.a com.huawei.common.applog.a.a()>
	//   19   45:new             #482 <Class com.huawei.common.applog.bean.a>
	//   20   48:dup             
	//   21   49:ldc2            #484 <String "D">
	//   22   52:aload_0         
	//   23   53:aload_1         
	//   24   54:invokespecial   #487 <Method void com.huawei.common.applog.bean.a(String, String, String)>
	//   25   57:invokevirtual   #490 <Method boolean com.huawei.common.applog.a.a(com.huawei.common.applog.bean.a)>
	//   26   60:pop             
		}
	//   27   61:return          
	}

	public static void deleteOverTimeLog(Context context)
	{
		c.e("AppLogApi", "deleteOverTimeLog ");
	//    0    0:ldc1            #12  <String "AppLogApi">
	//    1    2:ldc2            #493 <String "deleteOverTimeLog ">
	//    2    5:invokestatic    #119 <Method void c.e(String, String)>
		context = ((Context) (new com.huawei.feedback.a.a.a(context)));
	//    3    8:new             #416 <Class com.huawei.feedback.a.a.a>
	//    4   11:dup             
	//    5   12:aload_0         
	//    6   13:invokespecial   #417 <Method void com.huawei.feedback.a.a.a(Context)>
	//    7   16:astore_0        
		Object obj = d.ag;
	//    8   17:getstatic       #423 <Field Object d.ag>
	//    9   20:astore          6
		obj;
	//   10   22:aload           6
		JVM INSTR monitorenter ;
	//   11   24:monitorenter    
		List list;
		c.e("AppLogApi", "deleteOverTimeLog selectall ");
	//   12   25:ldc1            #12  <String "AppLogApi">
	//   13   27:ldc2            #495 <String "deleteOverTimeLog selectall ">
	//   14   30:invokestatic    #119 <Method void c.e(String, String)>
		list = com.huawei.feedback.a.a.b.a(((com.huawei.feedback.a.a.a) (context)));
	//   15   33:aload_0         
	//   16   34:invokestatic    #498 <Method List com.huawei.feedback.a.a.b.a(com.huawei.feedback.a.a.a)>
	//   17   37:astore          5
		obj;
	//   18   39:aload           6
		JVM INSTR monitorexit ;
	//   19   41:monitorexit     
		  goto _L1
	//*  20   42:goto            51
		context;
	//   21   45:astore_0        
	//*  22   46:aload           6
		throw context;
	//   23   48:monitorexit     
	//   24   49:aload_0         
	//   25   50:athrow          
_L1:
		int j;
		int k;
		long l;
		if(list.size() <= 0)
			break MISSING_BLOCK_LABEL_263;
	//   26   51:aload           5
	//   27   53:invokeinterface #248 <Method int List.size()>
	//   28   58:ifle            263
		k = list.size();
	//   29   61:aload           5
	//   30   63:invokeinterface #248 <Method int List.size()>
	//   31   68:istore_2        
		c.e("AppLogApi", (new StringBuilder()).append("deleteOverTimeLog ").append(k).toString());
	//   32   69:ldc1            #12  <String "AppLogApi">
	//   33   71:new             #144 <Class StringBuilder>
	//   34   74:dup             
	//   35   75:invokespecial   #145 <Method void StringBuilder()>
	//   36   78:ldc2            #493 <String "deleteOverTimeLog ">
	//   37   81:invokevirtual   #151 <Method StringBuilder StringBuilder.append(String)>
	//   38   84:iload_2         
	//   39   85:invokevirtual   #175 <Method StringBuilder StringBuilder.append(int)>
	//   40   88:invokevirtual   #157 <Method String StringBuilder.toString()>
	//   41   91:invokestatic    #119 <Method void c.e(String, String)>
		l = System.currentTimeMillis();
	//   42   94:invokestatic    #133 <Method long System.currentTimeMillis()>
	//   43   97:lstore_3        
		j = 0;
	//   44   98:iconst_0        
	//   45   99:istore_1        
_L5:
		if(j >= k) goto _L3; else goto _L2
	//   46  100:iload_1         
	//   47  101:iload_2         
	//   48  102:icmpge          263
_L2:
		a a1;
		if(l - Long.parseLong(((a)list.get(j)).e()) < 0xf731400L)
			continue; /* Loop/switch isn't completed */
	//   49  105:lload_3         
	//   50  106:aload           5
	//   51  108:iload_1         
	//   52  109:invokeinterface #252 <Method Object List.get(int)>
	//   53  114:checkcast       #254 <Class a>
	//   54  117:invokevirtual   #500 <Method String a.e()>
	//   55  120:invokestatic    #506 <Method long Long.parseLong(String)>
	//   56  123:lsub            
	//   57  124:ldc2w           #507 <Long 0xf731400L>
	//   58  127:lcmp            
	//   59  128:iflt            256
		c.e("AppLogApi", (new StringBuilder()).append("000deleteOverTimeLog ").append(j).toString());
	//   60  131:ldc1            #12  <String "AppLogApi">
	//   61  133:new             #144 <Class StringBuilder>
	//   62  136:dup             
	//   63  137:invokespecial   #145 <Method void StringBuilder()>
	//   64  140:ldc2            #510 <String "000deleteOverTimeLog ">
	//   65  143:invokevirtual   #151 <Method StringBuilder StringBuilder.append(String)>
	//   66  146:iload_1         
	//   67  147:invokevirtual   #175 <Method StringBuilder StringBuilder.append(int)>
	//   68  150:invokevirtual   #157 <Method String StringBuilder.toString()>
	//   69  153:invokestatic    #119 <Method void c.e(String, String)>
		a1 = (a)list.get(j);
	//   70  156:aload           5
	//   71  158:iload_1         
	//   72  159:invokeinterface #252 <Method Object List.get(int)>
	//   73  164:checkcast       #254 <Class a>
	//   74  167:astore          7
		obj = d.ag;
	//   75  169:getstatic       #423 <Field Object d.ag>
	//   76  172:astore          6
		obj;
	//   77  174:aload           6
		JVM INSTR monitorenter ;
	//   78  176:monitorenter    
		c.e("AppLogApi", "deleteOverTimeLog delete ");
	//   79  177:ldc1            #12  <String "AppLogApi">
	//   80  179:ldc2            #512 <String "deleteOverTimeLog delete ">
	//   81  182:invokestatic    #119 <Method void c.e(String, String)>
		com.huawei.feedback.a.a.b.b(((com.huawei.feedback.a.a.a) (context)), a1);
	//   82  185:aload_0         
	//   83  186:aload           7
	//   84  188:invokestatic    #515 <Method void com.huawei.feedback.a.a.b.b(com.huawei.feedback.a.a.a, a)>
		obj;
	//   85  191:aload           6
		JVM INSTR monitorexit ;
	//   86  193:monitorexit     
		  goto _L4
	//*  87  194:goto            203
		context;
	//   88  197:astore_0        
	//*  89  198:aload           6
		throw context;
	//   90  200:monitorexit     
	//   91  201:aload_0         
	//   92  202:athrow          
_L4:
		String s = a1.c();
	//   93  203:aload           7
	//   94  205:invokevirtual   #518 <Method String a.c()>
	//   95  208:astore          6
		c.e("AppLogApi", (new StringBuilder()).append("deleteOverTimeLog filepath").append(s).toString());
	//   96  210:ldc1            #12  <String "AppLogApi">
	//   97  212:new             #144 <Class StringBuilder>
	//   98  215:dup             
	//   99  216:invokespecial   #145 <Method void StringBuilder()>
	//  100  219:ldc2            #520 <String "deleteOverTimeLog filepath">
	//  101  222:invokevirtual   #151 <Method StringBuilder StringBuilder.append(String)>
	//  102  225:aload           6
	//  103  227:invokevirtual   #151 <Method StringBuilder StringBuilder.append(String)>
	//  104  230:invokevirtual   #157 <Method String StringBuilder.toString()>
	//  105  233:invokestatic    #119 <Method void c.e(String, String)>
		if(!TextUtils.isEmpty(((CharSequence) (s))))
	//* 106  236:aload           6
	//* 107  238:invokestatic    #526 <Method boolean TextUtils.isEmpty(CharSequence)>
	//* 108  241:ifne            256
			com.huawei.feedback.e.b(new File(s));
	//  109  244:new             #293 <Class File>
	//  110  247:dup             
	//  111  248:aload           6
	//  112  250:invokespecial   #527 <Method void File(String)>
	//  113  253:invokestatic    #405 <Method void e.b(File)>
		j++;
	//  114  256:iload_1         
	//  115  257:iconst_1        
	//  116  258:iadd            
	//  117  259:istore_1        
		  goto _L5
	//* 118  260:goto            100
_L3:
	//  119  263:return          
	}

	public static void e(String s, String s1)
	{
		if(isLoggable(4))
	//*   0    0:iconst_4        
	//*   1    1:invokestatic    #466 <Method boolean isLoggable(int)>
	//*   2    4:ifeq            61
		{
			int j = Process.myTid();
	//    3    7:invokestatic    #471 <Method int Process.myTid()>
	//    4   10:istore_2        
			s = (new StringBuilder()).append(s).append("(").append(j).append(")").toString();
	//    5   11:new             #144 <Class StringBuilder>
	//    6   14:dup             
	//    7   15:invokespecial   #145 <Method void StringBuilder()>
	//    8   18:aload_0         
	//    9   19:invokevirtual   #151 <Method StringBuilder StringBuilder.append(String)>
	//   10   22:ldc2            #473 <String "(">
	//   11   25:invokevirtual   #151 <Method StringBuilder StringBuilder.append(String)>
	//   12   28:iload_2         
	//   13   29:invokevirtual   #175 <Method StringBuilder StringBuilder.append(int)>
	//   14   32:ldc2            #475 <String ")">
	//   15   35:invokevirtual   #151 <Method StringBuilder StringBuilder.append(String)>
	//   16   38:invokevirtual   #157 <Method String StringBuilder.toString()>
	//   17   41:astore_0        
			com.huawei.common.applog.a.a().a(new com.huawei.common.applog.bean.a("E", s, s1));
	//   18   42:invokestatic    #480 <Method com.huawei.common.applog.a com.huawei.common.applog.a.a()>
	//   19   45:new             #482 <Class com.huawei.common.applog.bean.a>
	//   20   48:dup             
	//   21   49:ldc2            #529 <String "E">
	//   22   52:aload_0         
	//   23   53:aload_1         
	//   24   54:invokespecial   #487 <Method void com.huawei.common.applog.bean.a(String, String, String)>
	//   25   57:invokevirtual   #490 <Method boolean com.huawei.common.applog.a.a(com.huawei.common.applog.bean.a)>
	//   26   60:pop             
		}
	//   27   61:return          
	}

	public static void e(String s, String s1, Bundle bundle, Boolean boolean1, String s2, Context context)
	{
		if(context == null || bundle == null)
	//*   0    0:aload           5
	//*   1    2:ifnull          9
	//*   2    5:aload_2         
	//*   3    6:ifnonnull       18
		{
			c.e("AppLogApi", "null==context fail!");
	//    4    9:ldc1            #12  <String "AppLogApi">
	//    5   11:ldc2            #532 <String "null==context fail!">
	//    6   14:invokestatic    #119 <Method void c.e(String, String)>
			return;
	//    7   17:return          
		}
		mContext = context;
	//    8   18:aload           5
	//    9   20:putstatic       #54  <Field Context mContext>
		String s5 = bundle.getString("MetaData");
	//   10   23:aload_2         
	//   11   24:ldc2            #534 <String "MetaData">
	//   12   27:invokevirtual   #268 <Method String Bundle.getString(String)>
	//   13   30:astore          9
		String s3 = s2;
	//   14   32:aload           4
	//   15   34:astore          8
		if(!TextUtils.isEmpty(((CharSequence) (s5))))
	//*  16   36:aload           9
	//*  17   38:invokestatic    #526 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  18   41:ifne            66
			s3 = (new StringBuilder()).append(s2).append(s5).toString();
	//   19   44:new             #144 <Class StringBuilder>
	//   20   47:dup             
	//   21   48:invokespecial   #145 <Method void StringBuilder()>
	//   22   51:aload           4
	//   23   53:invokevirtual   #151 <Method StringBuilder StringBuilder.append(String)>
	//   24   56:aload           9
	//   25   58:invokevirtual   #151 <Method StringBuilder StringBuilder.append(String)>
	//   26   61:invokevirtual   #157 <Method String StringBuilder.toString()>
	//   27   64:astore          8
		e(s, s3);
	//   28   66:aload_0         
	//   29   67:aload           8
	//   30   69:invokestatic    #535 <Method void e(String, String)>
		if(com.huawei.feedback.e.m(context) && isTimeCanPackage())
	//*  31   72:aload           5
	//*  32   74:invokestatic    #216 <Method boolean e.m(Context)>
	//*  33   77:ifeq            270
	//*  34   80:invokestatic    #538 <Method boolean isTimeCanPackage()>
	//*  35   83:ifeq            270
		{
			mUploadFile = boolean1.booleanValue();
	//   36   86:aload_3         
	//   37   87:invokevirtual   #543 <Method boolean Boolean.booleanValue()>
	//   38   90:putstatic       #50  <Field boolean mUploadFile>
			bundle.putString("LogVersion", logVersion);
	//   39   93:aload_2         
	//   40   94:ldc2            #262 <String "LogVersion">
	//   41   97:getstatic       #58  <Field String logVersion>
	//   42  100:invokevirtual   #546 <Method void Bundle.putString(String, String)>
			bundle.putString("LogSubversion", logSubversion);
	//   43  103:aload_2         
	//   44  104:ldc2            #270 <String "LogSubversion">
	//   45  107:getstatic       #60  <Field String logSubversion>
	//   46  110:invokevirtual   #546 <Method void Bundle.putString(String, String)>
			bundle.putString("ProductName", Build.MODEL);
	//   47  113:aload_2         
	//   48  114:ldc2            #272 <String "ProductName">
	//   49  117:getstatic       #355 <Field String Build.MODEL>
	//   50  120:invokevirtual   #546 <Method void Bundle.putString(String, String)>
			bundle.putString("ProductVersion", Build.DISPLAY);
	//   51  123:aload_2         
	//   52  124:ldc2            #274 <String "ProductVersion">
	//   53  127:getstatic       #358 <Field String Build.DISPLAY>
	//   54  130:invokevirtual   #546 <Method void Bundle.putString(String, String)>
			s2 = com.huawei.feedback.e.x(mContext);
	//   55  133:getstatic       #54  <Field Context mContext>
	//   56  136:invokestatic    #376 <Method String e.x(Context)>
	//   57  139:astore          4
			String s4 = com.huawei.feedback.e.r(context);
	//   58  141:aload           5
	//   59  143:invokestatic    #549 <Method String e.r(Context)>
	//   60  146:astore          8
			s = s4;
	//   61  148:aload           8
	//   62  150:astore_0        
			if(TextUtils.isEmpty(((CharSequence) (s4))))
	//*  63  151:aload           8
	//*  64  153:invokestatic    #526 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  65  156:ifeq            162
				s = s2;
	//   66  159:aload           4
	//   67  161:astore_0        
			bundle.putString("SN", s2);
	//   68  162:aload_2         
	//   69  163:ldc2            #276 <String "SN">
	//   70  166:aload           4
	//   71  168:invokevirtual   #546 <Method void Bundle.putString(String, String)>
			bundle.putString("IMEI", s);
	//   72  171:aload_2         
	//   73  172:ldc2            #278 <String "IMEI">
	//   74  175:aload_0         
	//   75  176:invokevirtual   #546 <Method void Bundle.putString(String, String)>
			bundle.putString("Eventid", s1);
	//   76  179:aload_2         
	//   77  180:ldc2            #551 <String "Eventid">
	//   78  183:aload_1         
	//   79  184:invokevirtual   #546 <Method void Bundle.putString(String, String)>
			long l = System.currentTimeMillis();
	//   80  187:invokestatic    #133 <Method long System.currentTimeMillis()>
	//   81  190:lstore          6
			bundle.putString("HappenTime", (new StringBuilder()).append("").append(l).toString());
	//   82  192:aload_2         
	//   83  193:ldc2            #553 <String "HappenTime">
	//   84  196:new             #144 <Class StringBuilder>
	//   85  199:dup             
	//   86  200:invokespecial   #145 <Method void StringBuilder()>
	//   87  203:ldc1            #44  <String "">
	//   88  205:invokevirtual   #151 <Method StringBuilder StringBuilder.append(String)>
	//   89  208:lload           6
	//   90  210:invokevirtual   #154 <Method StringBuilder StringBuilder.append(long)>
	//   91  213:invokevirtual   #157 <Method String StringBuilder.toString()>
	//   92  216:invokevirtual   #546 <Method void Bundle.putString(String, String)>
			mMetaData = bundle;
	//   93  219:aload_2         
	//   94  220:putstatic       #52  <Field Bundle mMetaData>
			if(boolean1.booleanValue())
	//*  95  223:aload_3         
	//*  96  224:invokevirtual   #543 <Method boolean Boolean.booleanValue()>
	//*  97  227:ifeq            253
			{
				c.e("AppLogApi", "need upload file ,begin package small to SD!");
	//   98  230:ldc1            #12  <String "AppLogApi">
	//   99  232:ldc2            #555 <String "need upload file ,begin package small to SD!">
	//  100  235:invokestatic    #119 <Method void c.e(String, String)>
				packageToSDcard(context, s1, mMetaData, myHandler);
	//  101  238:aload           5
	//  102  240:aload_1         
	//  103  241:getstatic       #52  <Field Bundle mMetaData>
	//  104  244:getstatic       #86  <Field Handler myHandler>
	//  105  247:invokestatic    #559 <Method void packageToSDcard(Context, String, Bundle, Handler)>
			} else
	//* 106  250:goto            269
			{
				c.e("AppLogApi", "no need upload file!");
	//  107  253:ldc1            #12  <String "AppLogApi">
	//  108  255:ldc2            #561 <String "no need upload file!">
	//  109  258:invokestatic    #119 <Method void c.e(String, String)>
				myHandler.sendEmptyMessage(1);
	//  110  261:getstatic       #86  <Field Handler myHandler>
	//  111  264:iconst_1        
	//  112  265:invokevirtual   #564 <Method boolean Handler.sendEmptyMessage(int)>
	//  113  268:pop             
			}
			return;
	//  114  269:return          
		} else
		{
			c.e("AppLogApi", "isAllowUpload denied!");
	//  115  270:ldc1            #12  <String "AppLogApi">
	//  116  272:ldc2            #566 <String "isAllowUpload denied!">
	//  117  275:invokestatic    #119 <Method void c.e(String, String)>
			return;
	//  118  278:return          
		}
	}

	public static void e(String s, String s1, Bundle bundle, Boolean boolean1, String s2, String s3, Context context)
	{
		if(context == null || bundle == null)
	//*   0    0:aload           6
	//*   1    2:ifnull          9
	//*   2    5:aload_2         
	//*   3    6:ifnonnull       18
		{
			c.e("AppLogApi", "out logPath null==context fail!");
	//    4    9:ldc1            #12  <String "AppLogApi">
	//    5   11:ldc2            #569 <String "out logPath null==context fail!">
	//    6   14:invokestatic    #119 <Method void c.e(String, String)>
			return;
	//    7   17:return          
		}
		mContext = context;
	//    8   18:aload           6
	//    9   20:putstatic       #54  <Field Context mContext>
		if(com.huawei.feedback.e.m(context) && isTimeCanPackage())
	//*  10   23:aload           6
	//*  11   25:invokestatic    #216 <Method boolean e.m(Context)>
	//*  12   28:ifeq            200
	//*  13   31:invokestatic    #538 <Method boolean isTimeCanPackage()>
	//*  14   34:ifeq            200
		{
			mUploadFile = boolean1.booleanValue();
	//   15   37:aload_3         
	//   16   38:invokevirtual   #543 <Method boolean Boolean.booleanValue()>
	//   17   41:putstatic       #50  <Field boolean mUploadFile>
			bundle.putString("LogVersion", logVersion);
	//   18   44:aload_2         
	//   19   45:ldc2            #262 <String "LogVersion">
	//   20   48:getstatic       #58  <Field String logVersion>
	//   21   51:invokevirtual   #546 <Method void Bundle.putString(String, String)>
			bundle.putString("LogSubversion", logSubversion);
	//   22   54:aload_2         
	//   23   55:ldc2            #270 <String "LogSubversion">
	//   24   58:getstatic       #60  <Field String logSubversion>
	//   25   61:invokevirtual   #546 <Method void Bundle.putString(String, String)>
			bundle.putString("ProductName", Build.MODEL);
	//   26   64:aload_2         
	//   27   65:ldc2            #272 <String "ProductName">
	//   28   68:getstatic       #355 <Field String Build.MODEL>
	//   29   71:invokevirtual   #546 <Method void Bundle.putString(String, String)>
			bundle.putString("ProductVersion", Build.DISPLAY);
	//   30   74:aload_2         
	//   31   75:ldc2            #274 <String "ProductVersion">
	//   32   78:getstatic       #358 <Field String Build.DISPLAY>
	//   33   81:invokevirtual   #546 <Method void Bundle.putString(String, String)>
			String s4 = com.huawei.feedback.e.x(mContext);
	//   34   84:getstatic       #54  <Field Context mContext>
	//   35   87:invokestatic    #376 <Method String e.x(Context)>
	//   36   90:astore          9
			context = ((Context) (com.huawei.feedback.e.r(context)));
	//   37   92:aload           6
	//   38   94:invokestatic    #549 <Method String e.r(Context)>
	//   39   97:astore          6
			s = ((String) (context));
	//   40   99:aload           6
	//   41  101:astore_0        
			if(TextUtils.isEmpty(((CharSequence) (context))))
	//*  42  102:aload           6
	//*  43  104:invokestatic    #526 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  44  107:ifeq            113
				s = s4;
	//   45  110:aload           9
	//   46  112:astore_0        
			bundle.putString("SN", s4);
	//   47  113:aload_2         
	//   48  114:ldc2            #276 <String "SN">
	//   49  117:aload           9
	//   50  119:invokevirtual   #546 <Method void Bundle.putString(String, String)>
			bundle.putString("IMEI", s);
	//   51  122:aload_2         
	//   52  123:ldc2            #278 <String "IMEI">
	//   53  126:aload_0         
	//   54  127:invokevirtual   #546 <Method void Bundle.putString(String, String)>
			bundle.putString("Eventid", s1);
	//   55  130:aload_2         
	//   56  131:ldc2            #551 <String "Eventid">
	//   57  134:aload_1         
	//   58  135:invokevirtual   #546 <Method void Bundle.putString(String, String)>
			long l = System.currentTimeMillis();
	//   59  138:invokestatic    #133 <Method long System.currentTimeMillis()>
	//   60  141:lstore          7
			bundle.putString("HappenTime", (new StringBuilder()).append("").append(l).toString());
	//   61  143:aload_2         
	//   62  144:ldc2            #553 <String "HappenTime">
	//   63  147:new             #144 <Class StringBuilder>
	//   64  150:dup             
	//   65  151:invokespecial   #145 <Method void StringBuilder()>
	//   66  154:ldc1            #44  <String "">
	//   67  156:invokevirtual   #151 <Method StringBuilder StringBuilder.append(String)>
	//   68  159:lload           7
	//   69  161:invokevirtual   #154 <Method StringBuilder StringBuilder.append(long)>
	//   70  164:invokevirtual   #157 <Method String StringBuilder.toString()>
	//   71  167:invokevirtual   #546 <Method void Bundle.putString(String, String)>
			mMetaData = bundle;
	//   72  170:aload_2         
	//   73  171:putstatic       #52  <Field Bundle mMetaData>
			if(boolean1.booleanValue())
	//*  74  174:aload_3         
	//*  75  175:invokevirtual   #543 <Method boolean Boolean.booleanValue()>
	//*  76  178:ifeq            191
			{
				key = s3;
	//   77  181:aload           5
	//   78  183:putstatic       #48  <Field String key>
				logfilePath = s2;
	//   79  186:aload           4
	//   80  188:putstatic       #46  <Field String logfilePath>
			}
			myHandler.sendEmptyMessage(1);
	//   81  191:getstatic       #86  <Field Handler myHandler>
	//   82  194:iconst_1        
	//   83  195:invokevirtual   #564 <Method boolean Handler.sendEmptyMessage(int)>
	//   84  198:pop             
			return;
	//   85  199:return          
		} else
		{
			c.e("AppLogApi", "isAllowUpload denied!");
	//   86  200:ldc1            #12  <String "AppLogApi">
	//   87  202:ldc2            #566 <String "isAllowUpload denied!">
	//   88  205:invokestatic    #119 <Method void c.e(String, String)>
			return;
	//   89  208:return          
		}
	}

	public static void flushReport()
	{
		com.huawei.common.applog.e.a(mContext, isHttpProtocol);
	//    0    0:getstatic       #54  <Field Context mContext>
	//    1    3:getstatic       #62  <Field boolean isHttpProtocol>
	//    2    6:invokestatic    #575 <Method void com.huawei.common.applog.e.a(Context, boolean)>
	//    3    9:return          
	}

	public static List getAutonologlist()
	{
		return autonologlist;
	//    0    0:getstatic       #64  <Field List autonologlist>
	//    1    3:areturn         
	}

	public static List getAutouploadloglist()
	{
		return autouploadloglist;
	//    0    0:getstatic       #71  <Field List autouploadloglist>
	//    1    3:areturn         
	}

	public static String getEncryImei(String s)
	{
		return com.huawei.phoneserviceuni.common.e.a.b.b.a(s);
	//    0    0:aload_0         
	//    1    1:invokestatic    #390 <Method String com.huawei.phoneserviceuni.common.e.a.b.b.a(String)>
	//    2    4:areturn         
	}

	private static long getRemainMaxSize(long l, Context context)
	{
		int j = com.huawei.feedback.e.g(context);
	//    0    0:aload_2         
	//    1    1:invokestatic    #583 <Method int e.g(Context)>
	//    2    4:istore_3        
		if(j == 2)
	//*   3    5:iload_3         
	//*   4    6:iconst_2        
	//*   5    7:icmpne          24
			if(l < 0x4b000L)
	//*   6   10:lload_0         
	//*   7   11:ldc2w           #584 <Long 0x4b000L>
	//*   8   14:lcmp            
	//*   9   15:ifge            20
				return l;
	//   10   18:lload_0         
	//   11   19:lreturn         
			else
				return 0x4b000L;
	//   12   20:ldc2w           #584 <Long 0x4b000L>
	//   13   23:lreturn         
		if(j == 1)
	//*  14   24:iload_3         
	//*  15   25:iconst_1        
	//*  16   26:icmpne          43
		{
			if(l < 0xaf000L)
	//*  17   29:lload_0         
	//*  18   30:ldc2w           #586 <Long 0xaf000L>
	//*  19   33:lcmp            
	//*  20   34:ifge            39
				return l;
	//   21   37:lload_0         
	//   22   38:lreturn         
			else
				return 0xaf000L;
	//   23   39:ldc2w           #586 <Long 0xaf000L>
	//   24   42:lreturn         
		} else
		{
			return 0L;
	//   25   43:lconst_0        
	//   26   44:lreturn         
		}
	}

	public static int getremainUploadSize(int j, Context context)
	{
		if(context == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       14
		{
			c.e("AppLogApi", "getremainUploadSize context null,false!");
	//    2    4:ldc1            #12  <String "AppLogApi">
	//    3    6:ldc2            #591 <String "getremainUploadSize context null,false!">
	//    4    9:invokestatic    #119 <Method void c.e(String, String)>
			return 0;
	//    5   12:iconst_0        
	//    6   13:ireturn         
		}
		int k = Calendar.getInstance().get(2) + 1;
	//    7   14:invokestatic    #597 <Method Calendar Calendar.getInstance()>
	//    8   17:iconst_2        
	//    9   18:invokevirtual   #599 <Method int Calendar.get(int)>
	//   10   21:iconst_1        
	//   11   22:iadd            
	//   12   23:istore_2        
		if(k != b.a().c(context))
	//*  13   24:iload_2         
	//*  14   25:invokestatic    #139 <Method b b.a()>
	//*  15   28:aload_1         
	//*  16   29:invokevirtual   #601 <Method int b.c(Context)>
	//*  17   32:icmpeq          75
		{
			b.a().a(context, k);
	//   18   35:invokestatic    #139 <Method b b.a()>
	//   19   38:aload_1         
	//   20   39:iload_2         
	//   21   40:invokevirtual   #603 <Method void b.a(Context, int)>
			b.a().b(context, 0);
	//   22   43:invokestatic    #139 <Method b b.a()>
	//   23   46:aload_1         
	//   24   47:iconst_0        
	//   25   48:invokevirtual   #605 <Method void b.b(Context, int)>
			b.a().c(context, 0);
	//   26   51:invokestatic    #139 <Method b b.a()>
	//   27   54:aload_1         
	//   28   55:iconst_0        
	//   29   56:invokevirtual   #607 <Method void b.c(Context, int)>
			b.a().e(context, 0);
	//   30   59:invokestatic    #139 <Method b b.a()>
	//   31   62:aload_1         
	//   32   63:iconst_0        
	//   33   64:invokevirtual   #609 <Method void b.e(Context, int)>
			b.a().d(context, 0);
	//   34   67:invokestatic    #139 <Method b b.a()>
	//   35   70:aload_1         
	//   36   71:iconst_0        
	//   37   72:invokevirtual   #611 <Method void b.d(Context, int)>
		}
		k = 0;
	//   38   75:iconst_0        
	//   39   76:istore_2        
		if(j == 1)
	//*  40   77:iload_0         
	//*  41   78:iconst_1        
	//*  42   79:icmpne          160
		{
			if(!context.getPackageName().equalsIgnoreCase("com.huawei.phoneservice"))
	//*  43   82:aload_1         
	//*  44   83:invokevirtual   #614 <Method String Context.getPackageName()>
	//*  45   86:ldc2            #616 <String "com.huawei.phoneservice">
	//*  46   89:invokevirtual   #620 <Method boolean String.equalsIgnoreCase(String)>
	//*  47   92:ifne            100
				j = 1;
	//   48   95:iconst_1        
	//   49   96:istore_0        
			else
	//*  50   97:goto            102
				j = 0;
	//   51  100:iconst_0        
	//   52  101:istore_0        
			if(j != 0)
	//*  53  102:iload_0         
	//*  54  103:ifeq            121
				j = 0x200000 - b.a().d(context);
	//   55  106:ldc2            #621 <Int 0x200000>
	//   56  109:invokestatic    #139 <Method b b.a()>
	//   57  112:aload_1         
	//   58  113:invokevirtual   #623 <Method int b.d(Context)>
	//   59  116:isub            
	//   60  117:istore_0        
			else
	//*  61  118:goto            133
				j = 0x500000 - b.a().d(context);
	//   62  121:ldc2            #624 <Int 0x500000>
	//   63  124:invokestatic    #139 <Method b b.a()>
	//   64  127:aload_1         
	//   65  128:invokevirtual   #623 <Method int b.d(Context)>
	//   66  131:isub            
	//   67  132:istore_0        
			k = 0x800000 - b.a().f(context);
	//   68  133:ldc2            #625 <Int 0x800000>
	//   69  136:invokestatic    #139 <Method b b.a()>
	//   70  139:aload_1         
	//   71  140:invokevirtual   #627 <Method int b.f(Context)>
	//   72  143:isub            
	//   73  144:istore_2        
			if(j >= k)
	//*  74  145:iload_0         
	//*  75  146:iload_2         
	//*  76  147:icmpge          153
	//*  77  150:goto            155
				j = k;
	//   78  153:iload_2         
	//   79  154:istore_0        
			k = j;
	//   80  155:iload_0         
	//   81  156:istore_2        
		} else
	//*  82  157:goto            199
		if(j == 2)
	//*  83  160:iload_0         
	//*  84  161:iconst_2        
	//*  85  162:icmpne          199
		{
			k = 0x100000 - b.a().e(context);
	//   86  165:ldc2            #628 <Int 0x100000>
	//   87  168:invokestatic    #139 <Method b b.a()>
	//   88  171:aload_1         
	//   89  172:invokevirtual   #630 <Method int b.e(Context)>
	//   90  175:isub            
	//   91  176:istore_2        
			j = 0x180000 - b.a().g(context);
	//   92  177:ldc2            #631 <Int 0x180000>
	//   93  180:invokestatic    #139 <Method b b.a()>
	//   94  183:aload_1         
	//   95  184:invokevirtual   #632 <Method int b.g(Context)>
	//   96  187:isub            
	//   97  188:istore_0        
			if(k >= j)
	//*  98  189:iload_2         
	//*  99  190:iload_0         
	//* 100  191:icmpge          197
	//* 101  194:goto            199
				k = j;
	//  102  197:iload_0         
	//  103  198:istore_2        
		}
		c.e("AppLogApi", (new StringBuilder()).append("remainsize ").append(k).toString());
	//  104  199:ldc1            #12  <String "AppLogApi">
	//  105  201:new             #144 <Class StringBuilder>
	//  106  204:dup             
	//  107  205:invokespecial   #145 <Method void StringBuilder()>
	//  108  208:ldc2            #634 <String "remainsize ">
	//  109  211:invokevirtual   #151 <Method StringBuilder StringBuilder.append(String)>
	//  110  214:iload_2         
	//  111  215:invokevirtual   #175 <Method StringBuilder StringBuilder.append(int)>
	//  112  218:invokevirtual   #157 <Method String StringBuilder.toString()>
	//  113  221:invokestatic    #119 <Method void c.e(String, String)>
		return k;
	//  114  224:iload_2         
	//  115  225:ireturn         
	}

	public static void i(String s, String s1)
	{
		if(isLoggable(2))
	//*   0    0:iconst_2        
	//*   1    1:invokestatic    #466 <Method boolean isLoggable(int)>
	//*   2    4:ifeq            61
		{
			int j = Process.myTid();
	//    3    7:invokestatic    #471 <Method int Process.myTid()>
	//    4   10:istore_2        
			s = (new StringBuilder()).append(s).append("(").append(j).append(")").toString();
	//    5   11:new             #144 <Class StringBuilder>
	//    6   14:dup             
	//    7   15:invokespecial   #145 <Method void StringBuilder()>
	//    8   18:aload_0         
	//    9   19:invokevirtual   #151 <Method StringBuilder StringBuilder.append(String)>
	//   10   22:ldc2            #473 <String "(">
	//   11   25:invokevirtual   #151 <Method StringBuilder StringBuilder.append(String)>
	//   12   28:iload_2         
	//   13   29:invokevirtual   #175 <Method StringBuilder StringBuilder.append(int)>
	//   14   32:ldc2            #475 <String ")">
	//   15   35:invokevirtual   #151 <Method StringBuilder StringBuilder.append(String)>
	//   16   38:invokevirtual   #157 <Method String StringBuilder.toString()>
	//   17   41:astore_0        
			com.huawei.common.applog.a.a().a(new com.huawei.common.applog.bean.a("I", s, s1));
	//   18   42:invokestatic    #480 <Method com.huawei.common.applog.a com.huawei.common.applog.a.a()>
	//   19   45:new             #482 <Class com.huawei.common.applog.bean.a>
	//   20   48:dup             
	//   21   49:ldc2            #636 <String "I">
	//   22   52:aload_0         
	//   23   53:aload_1         
	//   24   54:invokespecial   #487 <Method void com.huawei.common.applog.bean.a(String, String, String)>
	//   25   57:invokevirtual   #490 <Method boolean com.huawei.common.applog.a.a(com.huawei.common.applog.bean.a)>
	//   26   60:pop             
		}
	//   27   61:return          
	}

	public static void init(Context context, Param param)
	{
		(new CrashHandler()).init(context);
	//    0    0:new             #640 <Class CrashHandler>
	//    1    3:dup             
	//    2    4:invokespecial   #641 <Method void CrashHandler()>
	//    3    7:aload_0         
	//    4    8:invokevirtual   #643 <Method void CrashHandler.init(Context)>
		int j = -1;
	//    5   11:iconst_m1       
	//    6   12:istore_2        
		int k = -1;
	//    7   13:iconst_m1       
	//    8   14:istore_3        
		String s = "";
	//    9   15:ldc1            #44  <String "">
	//   10   17:astore          5
		boolean flag = false;
	//   11   19:iconst_0        
	//   12   20:istore          4
		if(param != null)
	//*  13   22:aload_1         
	//*  14   23:ifnull          132
		{
	/* block-local class not found */
	class Param {}

			j = param.getLogLevel();
	//   15   26:aload_1         
	//   16   27:invokevirtual   #646 <Method int AppLogApi$Param.getLogLevel()>
	//   17   30:istore_2        
			if(j != -1)
	//*  18   31:iload_2         
	//*  19   32:iconst_m1       
	//*  20   33:icmpeq          40
				sysLevel = j;
	//   21   36:iload_2         
	//   22   37:putstatic       #42  <Field int sysLevel>
			k = param.getPerFileSize();
	//   23   40:aload_1         
	//   24   41:invokevirtual   #649 <Method int AppLogApi$Param.getPerFileSize()>
	//   25   44:istore_3        
			j = k;
	//   26   45:iload_3         
	//   27   46:istore_2        
			if(k > 0)
	//*  28   47:iload_3         
	//*  29   48:ifle            70
			{
				j = k;
	//   30   51:iload_3         
	//   31   52:istore_2        
				if(k > 1024)
	//*  32   53:iload_3         
	//*  33   54:sipush          1024
	//*  34   57:icmple          64
					j = 1024;
	//   35   60:sipush          1024
	//   36   63:istore_2        
				j *= 1024;
	//   37   64:iload_2         
	//   38   65:sipush          1024
	//   39   68:imul            
	//   40   69:istore_2        
			}
			k = param.getLogFileMaxnum();
	//   41   70:aload_1         
	//   42   71:invokevirtual   #652 <Method int AppLogApi$Param.getLogFileMaxnum()>
	//   43   74:istore_3        
			s = param.getLogWritePath();
	//   44   75:aload_1         
	//   45   76:invokevirtual   #655 <Method String AppLogApi$Param.getLogWritePath()>
	//   46   79:astore          5
			flag = param.getShutdown_Immediate();
	//   47   81:aload_1         
	//   48   82:invokevirtual   #658 <Method boolean AppLogApi$Param.getShutdown_Immediate()>
	//   49   85:istore          4
			reportCycle = com.huawei.common.applog.e.a(param.getReportCycle());
	//   50   87:aload_1         
	//   51   88:invokevirtual   #661 <Method int AppLogApi$Param.getReportCycle()>
	//   52   91:invokestatic    #663 <Method int com.huawei.common.applog.e.a(int)>
	//   53   94:putstatic       #108 <Field int reportCycle>
			c.e("ReportApi", (new StringBuilder()).append("init reportCycle==").append(reportCycle).toString());
	//   54   97:ldc2            #665 <String "ReportApi">
	//   55  100:new             #144 <Class StringBuilder>
	//   56  103:dup             
	//   57  104:invokespecial   #145 <Method void StringBuilder()>
	//   58  107:ldc2            #667 <String "init reportCycle==">
	//   59  110:invokevirtual   #151 <Method StringBuilder StringBuilder.append(String)>
	//   60  113:getstatic       #108 <Field int reportCycle>
	//   61  116:invokevirtual   #175 <Method StringBuilder StringBuilder.append(int)>
	//   62  119:invokevirtual   #157 <Method String StringBuilder.toString()>
	//   63  122:invokestatic    #119 <Method void c.e(String, String)>
			isHttpProtocol = param.getHttpProtocol();
	//   64  125:aload_1         
	//   65  126:invokevirtual   #670 <Method boolean AppLogApi$Param.getHttpProtocol()>
	//   66  129:putstatic       #62  <Field boolean isHttpProtocol>
		}
		if(context != null)
	//*  67  132:aload_0         
	//*  68  133:ifnull          140
			mContext = context;
	//   69  136:aload_0         
	//   70  137:putstatic       #54  <Field Context mContext>
		if(sysLevel < 5)
	//*  71  140:getstatic       #42  <Field int sysLevel>
	//*  72  143:iconst_5        
	//*  73  144:icmpge          160
			com.huawei.common.applog.a.a().a(context, j, s, k, flag);
	//   74  147:invokestatic    #480 <Method com.huawei.common.applog.a com.huawei.common.applog.a.a()>
	//   75  150:aload_0         
	//   76  151:iload_2         
	//   77  152:aload           5
	//   78  154:iload_3         
	//   79  155:iload           4
	//   80  157:invokevirtual   #673 <Method void com.huawei.common.applog.a.a(Context, int, String, int, boolean)>
	//   81  160:return          
	}

	public static boolean isLoggable(int j)
	{
		return j >= sysLevel;
	//    0    0:iload_0         
	//    1    1:getstatic       #42  <Field int sysLevel>
	//    2    4:icmplt          9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	private static boolean isTimeCanPackage()
	{
		long l = System.currentTimeMillis();
	//    0    0:invokestatic    #133 <Method long System.currentTimeMillis()>
	//    1    3:lstore_0        
		if(firstTime == 0L || l - firstTime > 100L)
	//*   2    4:getstatic       #73  <Field long firstTime>
	//*   3    7:lconst_0        
	//*   4    8:lcmp            
	//*   5    9:ifeq            24
	//*   6   12:lload_0         
	//*   7   13:getstatic       #73  <Field long firstTime>
	//*   8   16:lsub            
	//*   9   17:ldc2w           #674 <Long 100L>
	//*  10   20:lcmp            
	//*  11   21:ifle            30
		{
			firstTime = l;
	//   12   24:lload_0         
	//   13   25:putstatic       #73  <Field long firstTime>
			return true;
	//   14   28:iconst_1        
	//   15   29:ireturn         
		} else
		{
			c.e("AppLogApi", "it is not time yet!");
	//   16   30:ldc1            #12  <String "AppLogApi">
	//   17   32:ldc2            #677 <String "it is not time yet!">
	//   18   35:invokestatic    #119 <Method void c.e(String, String)>
			return false;
	//   19   38:iconst_0        
	//   20   39:ireturn         
		}
	}

	private static String packageBigLogFile(List list, List list1, Context context, Bundle bundle)
	{
		Object obj = ((Object) (context.getFilesDir().getPath()));
	//    0    0:aload_2         
	//    1    1:invokevirtual   #681 <Method File Context.getFilesDir()>
	//    2    4:invokevirtual   #401 <Method String File.getPath()>
	//    3    7:astore          7
		String s = Build.MODEL;
	//    4    9:getstatic       #355 <Field String Build.MODEL>
	//    5   12:astore          8
		String s1 = Build.DISPLAY;
	//    6   14:getstatic       #358 <Field String Build.DISPLAY>
	//    7   17:astore          9
		Object obj1 = ((Object) (new Date()));
	//    8   19:new             #360 <Class Date>
	//    9   22:dup             
	//   10   23:invokespecial   #361 <Method void Date()>
	//   11   26:astore          10
		obj1 = ((Object) ((new SimpleDateFormat("yyyyMMddHHmmss")).format(((Date) (obj1)))));
	//   12   28:new             #363 <Class SimpleDateFormat>
	//   13   31:dup             
	//   14   32:ldc2            #365 <String "yyyyMMddHHmmss">
	//   15   35:invokespecial   #368 <Method void SimpleDateFormat(String)>
	//   16   38:aload           10
	//   17   40:invokevirtual   #372 <Method String SimpleDateFormat.format(Date)>
	//   18   43:astore          10
		String s2 = com.huawei.phoneserviceuni.common.e.a.b.b.a(com.huawei.feedback.e.x(mContext).toUpperCase(Locale.US));
	//   19   45:getstatic       #54  <Field Context mContext>
	//   20   48:invokestatic    #376 <Method String e.x(Context)>
	//   21   51:getstatic       #382 <Field Locale Locale.US>
	//   22   54:invokevirtual   #386 <Method String String.toUpperCase(Locale)>
	//   23   57:invokestatic    #390 <Method String com.huawei.phoneserviceuni.common.e.a.b.b.a(String)>
	//   24   60:astore          11
		s = (new StringBuilder()).append("/Eventid_").append(s).append("_").append(s1).append("_").append(s2).append("_").append(((String) (obj1))).append("_ALL.zip").toString();
	//   25   62:new             #144 <Class StringBuilder>
	//   26   65:dup             
	//   27   66:invokespecial   #145 <Method void StringBuilder()>
	//   28   69:ldc2            #683 <String "/Eventid_">
	//   29   72:invokevirtual   #151 <Method StringBuilder StringBuilder.append(String)>
	//   30   75:aload           8
	//   31   77:invokevirtual   #151 <Method StringBuilder StringBuilder.append(String)>
	//   32   80:ldc2            #394 <String "_">
	//   33   83:invokevirtual   #151 <Method StringBuilder StringBuilder.append(String)>
	//   34   86:aload           9
	//   35   88:invokevirtual   #151 <Method StringBuilder StringBuilder.append(String)>
	//   36   91:ldc2            #394 <String "_">
	//   37   94:invokevirtual   #151 <Method StringBuilder StringBuilder.append(String)>
	//   38   97:aload           11
	//   39   99:invokevirtual   #151 <Method StringBuilder StringBuilder.append(String)>
	//   40  102:ldc2            #394 <String "_">
	//   41  105:invokevirtual   #151 <Method StringBuilder StringBuilder.append(String)>
	//   42  108:aload           10
	//   43  110:invokevirtual   #151 <Method StringBuilder StringBuilder.append(String)>
	//   44  113:ldc2            #685 <String "_ALL.zip">
	//   45  116:invokevirtual   #151 <Method StringBuilder StringBuilder.append(String)>
	//   46  119:invokevirtual   #157 <Method String StringBuilder.toString()>
	//   47  122:astore          8
		int k = list.size();
	//   48  124:aload_0         
	//   49  125:invokeinterface #248 <Method int List.size()>
	//   50  130:istore          5
		c.b("AppLogApi", (new StringBuilder()).append("hasloglistsize").append(k).toString());
	//   51  132:ldc1            #12  <String "AppLogApi">
	//   52  134:new             #144 <Class StringBuilder>
	//   53  137:dup             
	//   54  138:invokespecial   #145 <Method void StringBuilder()>
	//   55  141:ldc2            #687 <String "hasloglistsize">
	//   56  144:invokevirtual   #151 <Method StringBuilder StringBuilder.append(String)>
	//   57  147:iload           5
	//   58  149:invokevirtual   #175 <Method StringBuilder StringBuilder.append(int)>
	//   59  152:invokevirtual   #157 <Method String StringBuilder.toString()>
	//   60  155:invokestatic    #688 <Method void c.b(String, String)>
		list1 = ((List) (creatEventlogzip(list1, bundle, ((String) (obj)))));
	//   61  158:aload_1         
	//   62  159:aload_3         
	//   63  160:aload           7
	//   64  162:invokestatic    #690 <Method File creatEventlogzip(List, Bundle, String)>
	//   65  165:astore_1        
		int j = k;
	//   66  166:iload           5
	//   67  168:istore          4
		if(list1 != null)
	//*  68  170:aload_1         
	//*  69  171:ifnull          180
			j = k + 1;
	//   70  174:iload           5
	//   71  176:iconst_1        
	//   72  177:iadd            
	//   73  178:istore          4
		if(j == 0)
	//*  74  180:iload           4
	//*  75  182:ifne            196
		{
			c.e("AppLogApi", "no hasloglistsize,stop!");
	//   76  185:ldc1            #12  <String "AppLogApi">
	//   77  187:ldc2            #692 <String "no hasloglistsize,stop!">
	//   78  190:invokestatic    #119 <Method void c.e(String, String)>
			return "";
	//   79  193:ldc1            #44  <String "">
	//   80  195:areturn         
		}
		bundle = ((Bundle) (new File[j]));
	//   81  196:iload           4
	//   82  198:anewarray       File[]
	//   83  201:astore_3        
		for(int l = 0; l < list.size(); l++)
	//*  84  202:iconst_0        
	//*  85  203:istore          5
	//*  86  205:iload           5
	//*  87  207:aload_0         
	//*  88  208:invokeinterface #248 <Method int List.size()>
	//*  89  213:icmpge          293
		{
			c.e("AppLogApi", (new StringBuilder()).append("fileName").append(l).append(((a)list.get(l)).c()).toString());
	//   90  216:ldc1            #12  <String "AppLogApi">
	//   91  218:new             #144 <Class StringBuilder>
	//   92  221:dup             
	//   93  222:invokespecial   #145 <Method void StringBuilder()>
	//   94  225:ldc2            #694 <String "fileName">
	//   95  228:invokevirtual   #151 <Method StringBuilder StringBuilder.append(String)>
	//   96  231:iload           5
	//   97  233:invokevirtual   #175 <Method StringBuilder StringBuilder.append(int)>
	//   98  236:aload_0         
	//   99  237:iload           5
	//  100  239:invokeinterface #252 <Method Object List.get(int)>
	//  101  244:checkcast       #254 <Class a>
	//  102  247:invokevirtual   #518 <Method String a.c()>
	//  103  250:invokevirtual   #151 <Method StringBuilder StringBuilder.append(String)>
	//  104  253:invokevirtual   #157 <Method String StringBuilder.toString()>
	//  105  256:invokestatic    #119 <Method void c.e(String, String)>
			bundle[l] = ((/*<invalid signature>*/java.lang.Object) (new File(((a)list.get(l)).c())));
	//  106  259:aload_3         
	//  107  260:iload           5
	//  108  262:new             #293 <Class File>
	//  109  265:dup             
	//  110  266:aload_0         
	//  111  267:iload           5
	//  112  269:invokeinterface #252 <Method Object List.get(int)>
	//  113  274:checkcast       #254 <Class a>
	//  114  277:invokevirtual   #518 <Method String a.c()>
	//  115  280:invokespecial   #527 <Method void File(String)>
	//  116  283:aastore         
		}

	//  117  284:iload           5
	//  118  286:iconst_1        
	//  119  287:iadd            
	//  120  288:istore          5
	//* 121  290:goto            205
		if(list1 != null)
	//* 122  293:aload_1         
	//* 123  294:ifnull          304
			bundle[j - 1] = ((/*<invalid signature>*/java.lang.Object) (list1));
	//  124  297:aload_3         
	//  125  298:iload           4
	//  126  300:iconst_1        
	//  127  301:isub            
	//  128  302:aload_1         
	//  129  303:aastore         
		list = ((List) ((new StringBuilder()).append(((String) (obj))).append(s).toString()));
	//  130  304:new             #144 <Class StringBuilder>
	//  131  307:dup             
	//  132  308:invokespecial   #145 <Method void StringBuilder()>
	//  133  311:aload           7
	//  134  313:invokevirtual   #151 <Method StringBuilder StringBuilder.append(String)>
	//  135  316:aload           8
	//  136  318:invokevirtual   #151 <Method StringBuilder StringBuilder.append(String)>
	//  137  321:invokevirtual   #157 <Method String StringBuilder.toString()>
	//  138  324:astore_0        
		obj = ((Object) (new File(((String) (list)))));
	//  139  325:new             #293 <Class File>
	//  140  328:dup             
	//  141  329:aload_0         
	//  142  330:invokespecial   #527 <Method void File(String)>
	//  143  333:astore          7
		c.e("AppLogApi", (new StringBuilder()).append("no aes zip logzipPath fileName").append(((String) (list))).toString());
	//  144  335:ldc1            #12  <String "AppLogApi">
	//  145  337:new             #144 <Class StringBuilder>
	//  146  340:dup             
	//  147  341:invokespecial   #145 <Method void StringBuilder()>
	//  148  344:ldc2            #696 <String "no aes zip logzipPath fileName">
	//  149  347:invokevirtual   #151 <Method StringBuilder StringBuilder.append(String)>
	//  150  350:aload_0         
	//  151  351:invokevirtual   #151 <Method StringBuilder StringBuilder.append(String)>
	//  152  354:invokevirtual   #157 <Method String StringBuilder.toString()>
	//  153  357:invokestatic    #119 <Method void c.e(String, String)>
		boolean flag = com.huawei.feedback.e.a(((File []) (bundle)), ((File) (obj)), context);
	//  154  360:aload_3         
	//  155  361:aload           7
	//  156  363:aload_2         
	//  157  364:invokestatic    #699 <Method boolean e.a(File[], File, Context)>
	//  158  367:istore          6
		com.huawei.feedback.e.b(((File) (list1)));
	//  159  369:aload_1         
	//  160  370:invokestatic    #405 <Method void e.b(File)>
		if(flag)
	//* 161  373:iload           6
	//* 162  375:ifeq            388
		{
			c.e("AppLogApi", "packageBigLogFile OK!");
	//  163  378:ldc1            #12  <String "AppLogApi">
	//  164  380:ldc2            #701 <String "packageBigLogFile OK!">
	//  165  383:invokestatic    #119 <Method void c.e(String, String)>
			return ((String) (list));
	//  166  386:aload_0         
	//  167  387:areturn         
		} else
		{
			c.e("AppLogApi", "packageBigLogFile fail!");
	//  168  388:ldc1            #12  <String "AppLogApi">
	//  169  390:ldc2            #703 <String "packageBigLogFile fail!">
	//  170  393:invokestatic    #119 <Method void c.e(String, String)>
			return "";
	//  171  396:ldc1            #44  <String "">
	//  172  398:areturn         
		}
	}

	public static void packageToSDcard(Context context, String s, Bundle bundle, Handler handler)
	{
		Object obj = ((Object) (bundle.getString("logwritePath")));
	//    0    0:aload_2         
	//    1    1:ldc2            #706 <String "logwritePath">
	//    2    4:invokevirtual   #268 <Method String Bundle.getString(String)>
	//    3    7:astore          5
		ArrayList arraylist = bundle.getStringArrayList("logwritePathList");
	//    4    9:aload_2         
	//    5   10:ldc2            #708 <String "logwritePathList">
	//    6   13:invokevirtual   #712 <Method ArrayList Bundle.getStringArrayList(String)>
	//    7   16:astore          6
		String s1 = ((String) (obj));
	//    8   18:aload           5
	//    9   20:astore          4
		if(TextUtils.isEmpty(((CharSequence) (obj))))
	//*  10   22:aload           5
	//*  11   24:invokestatic    #526 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  12   27:ifeq            64
			s1 = (new StringBuilder()).append(context.getFilesDir().getPath()).append(File.separator).append("feedbacklogs").toString();
	//   13   30:new             #144 <Class StringBuilder>
	//   14   33:dup             
	//   15   34:invokespecial   #145 <Method void StringBuilder()>
	//   16   37:aload_0         
	//   17   38:invokevirtual   #681 <Method File Context.getFilesDir()>
	//   18   41:invokevirtual   #401 <Method String File.getPath()>
	//   19   44:invokevirtual   #151 <Method StringBuilder StringBuilder.append(String)>
	//   20   47:getstatic       #715 <Field String File.separator>
	//   21   50:invokevirtual   #151 <Method StringBuilder StringBuilder.append(String)>
	//   22   53:ldc2            #717 <String "feedbacklogs">
	//   23   56:invokevirtual   #151 <Method StringBuilder StringBuilder.append(String)>
	//   24   59:invokevirtual   #157 <Method String StringBuilder.toString()>
	//   25   62:astore          4
		String s2 = Build.MODEL;
	//   26   64:getstatic       #355 <Field String Build.MODEL>
	//   27   67:astore          7
		String s3 = Build.DISPLAY;
	//   28   69:getstatic       #358 <Field String Build.DISPLAY>
	//   29   72:astore          8
		obj = ((Object) (new Date()));
	//   30   74:new             #360 <Class Date>
	//   31   77:dup             
	//   32   78:invokespecial   #361 <Method void Date()>
	//   33   81:astore          5
		String s4 = (new SimpleDateFormat("yyyyMMddHHmmss")).format(((Date) (obj)));
	//   34   83:new             #363 <Class SimpleDateFormat>
	//   35   86:dup             
	//   36   87:ldc2            #365 <String "yyyyMMddHHmmss">
	//   37   90:invokespecial   #368 <Method void SimpleDateFormat(String)>
	//   38   93:aload           5
	//   39   95:invokevirtual   #372 <Method String SimpleDateFormat.format(Date)>
	//   40   98:astore          9
		String s5 = com.huawei.phoneserviceuni.common.e.a.b.b.a(com.huawei.feedback.e.x(mContext).toUpperCase(Locale.US));
	//   41  100:getstatic       #54  <Field Context mContext>
	//   42  103:invokestatic    #376 <Method String e.x(Context)>
	//   43  106:getstatic       #382 <Field Locale Locale.US>
	//   44  109:invokevirtual   #386 <Method String String.toUpperCase(Locale)>
	//   45  112:invokestatic    #390 <Method String com.huawei.phoneserviceuni.common.e.a.b.b.a(String)>
	//   46  115:astore          10
		obj = ((Object) ((new StringBuilder()).append("/Eventid_").append(s2).append("_").append(s3).append("_").append(s5).append("_").append(s4).append("_").append(s).append(".zip").toString()));
	//   47  117:new             #144 <Class StringBuilder>
	//   48  120:dup             
	//   49  121:invokespecial   #145 <Method void StringBuilder()>
	//   50  124:ldc2            #683 <String "/Eventid_">
	//   51  127:invokevirtual   #151 <Method StringBuilder StringBuilder.append(String)>
	//   52  130:aload           7
	//   53  132:invokevirtual   #151 <Method StringBuilder StringBuilder.append(String)>
	//   54  135:ldc2            #394 <String "_">
	//   55  138:invokevirtual   #151 <Method StringBuilder StringBuilder.append(String)>
	//   56  141:aload           8
	//   57  143:invokevirtual   #151 <Method StringBuilder StringBuilder.append(String)>
	//   58  146:ldc2            #394 <String "_">
	//   59  149:invokevirtual   #151 <Method StringBuilder StringBuilder.append(String)>
	//   60  152:aload           10
	//   61  154:invokevirtual   #151 <Method StringBuilder StringBuilder.append(String)>
	//   62  157:ldc2            #394 <String "_">
	//   63  160:invokevirtual   #151 <Method StringBuilder StringBuilder.append(String)>
	//   64  163:aload           9
	//   65  165:invokevirtual   #151 <Method StringBuilder StringBuilder.append(String)>
	//   66  168:ldc2            #394 <String "_">
	//   67  171:invokevirtual   #151 <Method StringBuilder StringBuilder.append(String)>
	//   68  174:aload_1         
	//   69  175:invokevirtual   #151 <Method StringBuilder StringBuilder.append(String)>
	//   70  178:ldc2            #719 <String ".zip">
	//   71  181:invokevirtual   #151 <Method StringBuilder StringBuilder.append(String)>
	//   72  184:invokevirtual   #157 <Method String StringBuilder.toString()>
	//   73  187:astore          5
		s = (new StringBuilder()).append("/temp_Eventid_").append(s2).append("_").append(s3).append("_").append(s5).append("_").append(s4).append("_").append(s).append(".zip").toString();
	//   74  189:new             #144 <Class StringBuilder>
	//   75  192:dup             
	//   76  193:invokespecial   #145 <Method void StringBuilder()>
	//   77  196:ldc2            #721 <String "/temp_Eventid_">
	//   78  199:invokevirtual   #151 <Method StringBuilder StringBuilder.append(String)>
	//   79  202:aload           7
	//   80  204:invokevirtual   #151 <Method StringBuilder StringBuilder.append(String)>
	//   81  207:ldc2            #394 <String "_">
	//   82  210:invokevirtual   #151 <Method StringBuilder StringBuilder.append(String)>
	//   83  213:aload           8
	//   84  215:invokevirtual   #151 <Method StringBuilder StringBuilder.append(String)>
	//   85  218:ldc2            #394 <String "_">
	//   86  221:invokevirtual   #151 <Method StringBuilder StringBuilder.append(String)>
	//   87  224:aload           10
	//   88  226:invokevirtual   #151 <Method StringBuilder StringBuilder.append(String)>
	//   89  229:ldc2            #394 <String "_">
	//   90  232:invokevirtual   #151 <Method StringBuilder StringBuilder.append(String)>
	//   91  235:aload           9
	//   92  237:invokevirtual   #151 <Method StringBuilder StringBuilder.append(String)>
	//   93  240:ldc2            #394 <String "_">
	//   94  243:invokevirtual   #151 <Method StringBuilder StringBuilder.append(String)>
	//   95  246:aload_1         
	//   96  247:invokevirtual   #151 <Method StringBuilder StringBuilder.append(String)>
	//   97  250:ldc2            #719 <String ".zip">
	//   98  253:invokevirtual   #151 <Method StringBuilder StringBuilder.append(String)>
	//   99  256:invokevirtual   #157 <Method String StringBuilder.toString()>
	//  100  259:astore_1        
		s = (new StringBuilder()).append(s1).append(s).toString();
	//  101  260:new             #144 <Class StringBuilder>
	//  102  263:dup             
	//  103  264:invokespecial   #145 <Method void StringBuilder()>
	//  104  267:aload           4
	//  105  269:invokevirtual   #151 <Method StringBuilder StringBuilder.append(String)>
	//  106  272:aload_1         
	//  107  273:invokevirtual   #151 <Method StringBuilder StringBuilder.append(String)>
	//  108  276:invokevirtual   #157 <Method String StringBuilder.toString()>
	//  109  279:astore_1        
		logfilePath = (new StringBuilder()).append(context.getFilesDir().getPath()).append(File.separator).append("feedbackuploadlogs").append(((String) (obj))).toString();
	//  110  280:new             #144 <Class StringBuilder>
	//  111  283:dup             
	//  112  284:invokespecial   #145 <Method void StringBuilder()>
	//  113  287:aload_0         
	//  114  288:invokevirtual   #681 <Method File Context.getFilesDir()>
	//  115  291:invokevirtual   #401 <Method String File.getPath()>
	//  116  294:invokevirtual   #151 <Method StringBuilder StringBuilder.append(String)>
	//  117  297:getstatic       #715 <Field String File.separator>
	//  118  300:invokevirtual   #151 <Method StringBuilder StringBuilder.append(String)>
	//  119  303:ldc2            #723 <String "feedbackuploadlogs">
	//  120  306:invokevirtual   #151 <Method StringBuilder StringBuilder.append(String)>
	//  121  309:aload           5
	//  122  311:invokevirtual   #151 <Method StringBuilder StringBuilder.append(String)>
	//  123  314:invokevirtual   #157 <Method String StringBuilder.toString()>
	//  124  317:putstatic       #46  <Field String logfilePath>
		byte abyte0[] = new byte[16];
	//  125  320:bipush          16
	//  126  322:newarray        byte[]
	//  127  324:astore          5
		g.a(abyte0);
	//  128  326:aload           5
	//  129  328:invokestatic    #728 <Method void g.a(byte[])>
		key = Base64.encodeToString(abyte0, 2);
	//  130  331:aload           5
	//  131  333:iconst_2        
	//  132  334:invokestatic    #734 <Method String Base64.encodeToString(byte[], int)>
	//  133  337:putstatic       #48  <Field String key>
		(new Thread(((Runnable) (new com.huawei.feedback.logic.a(logfilePath, s, s1, key, bundle, arraylist, handler, context, false))))).start();
	//  134  340:new             #736 <Class Thread>
	//  135  343:dup             
	//  136  344:new             #738 <Class com.huawei.feedback.logic.a>
	//  137  347:dup             
	//  138  348:getstatic       #46  <Field String logfilePath>
	//  139  351:aload_1         
	//  140  352:aload           4
	//  141  354:getstatic       #48  <Field String key>
	//  142  357:aload_2         
	//  143  358:aload           6
	//  144  360:aload_3         
	//  145  361:aload_0         
	//  146  362:iconst_0        
	//  147  363:invokespecial   #741 <Method void com.huawei.feedback.logic.a(String, String, String, String, Bundle, ArrayList, Handler, Context, boolean)>
	//  148  366:invokespecial   #744 <Method void Thread(Runnable)>
	//  149  369:invokevirtual   #747 <Method void Thread.start()>
	//  150  372:return          
	}

	public static void reportEvent(Context context, Event event)
	{
		if(context == null || event == null)
	//*   0    0:aload_0         
	//*   1    1:ifnull          8
	//*   2    4:aload_1         
	//*   3    5:ifnonnull       18
		{
			c.e("ReportApi", "context or event is empty!");
	//    4    8:ldc2            #665 <String "ReportApi">
	//    5   11:ldc2            #751 <String "context or event is empty!">
	//    6   14:invokestatic    #119 <Method void c.e(String, String)>
			return;
	//    7   17:return          
		}
		if(mContext == null)
	//*   8   18:getstatic       #54  <Field Context mContext>
	//*   9   21:ifnonnull       28
			mContext = context;
	//   10   24:aload_0         
	//   11   25:putstatic       #54  <Field Context mContext>
		com.huawei.common.applog.e.a(context, event, reportHandler);
	//   12   28:aload_0         
	//   13   29:aload_1         
	//   14   30:getstatic       #91  <Field Handler reportHandler>
	//   15   33:invokestatic    #754 <Method void com.huawei.common.applog.e.a(Context, Event, Handler)>
	//   16   36:return          
	}

	public static void setAutoUploadFlag(Context context, int j)
	{
		if(j == 1)
	//*   0    0:iload_1         
	//*   1    1:iconst_1        
	//*   2    2:icmpne          35
		{
			c.b("AppLogApi", "setAutoUploadFlag flag 1");
	//    3    5:ldc1            #12  <String "AppLogApi">
	//    4    7:ldc2            #757 <String "setAutoUploadFlag flag 1">
	//    5   10:invokestatic    #688 <Method void c.b(String, String)>
			b.a().a(context, true);
	//    6   13:invokestatic    #139 <Method b b.a()>
	//    7   16:aload_0         
	//    8   17:iconst_1        
	//    9   18:invokevirtual   #758 <Method void b.a(Context, boolean)>
			Process.setThreadPriority(10);
	//   10   21:bipush          10
	//   11   23:invokestatic    #762 <Method void Process.setThreadPriority(int)>
			b.a().b(context, true);
	//   12   26:invokestatic    #139 <Method b b.a()>
	//   13   29:aload_0         
	//   14   30:iconst_1        
	//   15   31:invokevirtual   #764 <Method void b.b(Context, boolean)>
			return;
	//   16   34:return          
		} else
		{
			c.b("AppLogApi", "setAutoUploadFlag flag default");
	//   17   35:ldc1            #12  <String "AppLogApi">
	//   18   37:ldc2            #766 <String "setAutoUploadFlag flag default">
	//   19   40:invokestatic    #688 <Method void c.b(String, String)>
			b.a().a(context, false);
	//   20   43:invokestatic    #139 <Method b b.a()>
	//   21   46:aload_0         
	//   22   47:iconst_0        
	//   23   48:invokevirtual   #758 <Method void b.a(Context, boolean)>
			b.a().b(context, false);
	//   24   51:invokestatic    #139 <Method b b.a()>
	//   25   54:aload_0         
	//   26   55:iconst_0        
	//   27   56:invokevirtual   #764 <Method void b.b(Context, boolean)>
			return;
	//   28   59:return          
		}
	}

	public static void setAutoUploadFlag(Context context, boolean flag)
	{
		b.a().a(context, flag);
	//    0    0:invokestatic    #139 <Method b b.a()>
	//    1    3:aload_0         
	//    2    4:iload_1         
	//    3    5:invokevirtual   #758 <Method void b.a(Context, boolean)>
	//    4    8:return          
	}

	public static void setImmediateUploadFlag(Context context, boolean flag)
	{
		b.a().c(context, flag);
	//    0    0:invokestatic    #139 <Method b b.a()>
	//    1    3:aload_0         
	//    2    4:iload_1         
	//    3    5:invokevirtual   #769 <Method void b.c(Context, boolean)>
	//    4    8:return          
	}

	public static void setMultiPackageName(Context context, String s)
	{
		b.a().a(context, s);
	//    0    0:invokestatic    #139 <Method b b.a()>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:invokevirtual   #773 <Method void b.a(Context, String)>
	//    4    8:return          
	}

	public static void v(String s, String s1)
	{
		if(isLoggable(0))
	//*   0    0:iconst_0        
	//*   1    1:invokestatic    #466 <Method boolean isLoggable(int)>
	//*   2    4:ifeq            61
		{
			int j = Process.myTid();
	//    3    7:invokestatic    #471 <Method int Process.myTid()>
	//    4   10:istore_2        
			s = (new StringBuilder()).append(s).append("(").append(j).append(")").toString();
	//    5   11:new             #144 <Class StringBuilder>
	//    6   14:dup             
	//    7   15:invokespecial   #145 <Method void StringBuilder()>
	//    8   18:aload_0         
	//    9   19:invokevirtual   #151 <Method StringBuilder StringBuilder.append(String)>
	//   10   22:ldc2            #473 <String "(">
	//   11   25:invokevirtual   #151 <Method StringBuilder StringBuilder.append(String)>
	//   12   28:iload_2         
	//   13   29:invokevirtual   #175 <Method StringBuilder StringBuilder.append(int)>
	//   14   32:ldc2            #475 <String ")">
	//   15   35:invokevirtual   #151 <Method StringBuilder StringBuilder.append(String)>
	//   16   38:invokevirtual   #157 <Method String StringBuilder.toString()>
	//   17   41:astore_0        
			com.huawei.common.applog.a.a().a(new com.huawei.common.applog.bean.a("V", s, s1));
	//   18   42:invokestatic    #480 <Method com.huawei.common.applog.a com.huawei.common.applog.a.a()>
	//   19   45:new             #482 <Class com.huawei.common.applog.bean.a>
	//   20   48:dup             
	//   21   49:ldc2            #776 <String "V">
	//   22   52:aload_0         
	//   23   53:aload_1         
	//   24   54:invokespecial   #487 <Method void com.huawei.common.applog.bean.a(String, String, String)>
	//   25   57:invokevirtual   #490 <Method boolean com.huawei.common.applog.a.a(com.huawei.common.applog.bean.a)>
	//   26   60:pop             
		}
	//   27   61:return          
	}

	public static void w(String s, String s1)
	{
		if(isLoggable(3))
	//*   0    0:iconst_3        
	//*   1    1:invokestatic    #466 <Method boolean isLoggable(int)>
	//*   2    4:ifeq            61
		{
			int j = Process.myTid();
	//    3    7:invokestatic    #471 <Method int Process.myTid()>
	//    4   10:istore_2        
			s = (new StringBuilder()).append(s).append("(").append(j).append(")").toString();
	//    5   11:new             #144 <Class StringBuilder>
	//    6   14:dup             
	//    7   15:invokespecial   #145 <Method void StringBuilder()>
	//    8   18:aload_0         
	//    9   19:invokevirtual   #151 <Method StringBuilder StringBuilder.append(String)>
	//   10   22:ldc2            #473 <String "(">
	//   11   25:invokevirtual   #151 <Method StringBuilder StringBuilder.append(String)>
	//   12   28:iload_2         
	//   13   29:invokevirtual   #175 <Method StringBuilder StringBuilder.append(int)>
	//   14   32:ldc2            #475 <String ")">
	//   15   35:invokevirtual   #151 <Method StringBuilder StringBuilder.append(String)>
	//   16   38:invokevirtual   #157 <Method String StringBuilder.toString()>
	//   17   41:astore_0        
			com.huawei.common.applog.a.a().a(new com.huawei.common.applog.bean.a("W", s, s1));
	//   18   42:invokestatic    #480 <Method com.huawei.common.applog.a com.huawei.common.applog.a.a()>
	//   19   45:new             #482 <Class com.huawei.common.applog.bean.a>
	//   20   48:dup             
	//   21   49:ldc2            #779 <String "W">
	//   22   52:aload_0         
	//   23   53:aload_1         
	//   24   54:invokespecial   #487 <Method void com.huawei.common.applog.bean.a(String, String, String)>
	//   25   57:invokevirtual   #490 <Method boolean com.huawei.common.applog.a.a(com.huawei.common.applog.bean.a)>
	//   26   60:pop             
		}
	//   27   61:return          
	}

	private static final String TAG = "AppLogApi";
	private static List autonologlist = null;
	private static List autouploadloglist = new ArrayList();
	private static long firstTime = 0L;
	private static boolean isHttpProtocol = false;
	private static String key = "";
	private static String logSubversion = "1";
	private static String logVersion = "1";
	private static String logfilePath = "";
	private static Context mContext = null;
	private static Bundle mMetaData = null;
	private static boolean mUploadFile = false;
	private static Handler myHandler = new _cls1(Looper.getMainLooper());
	private static int reportCycle = 0;
	private static Handler reportHandler = new _cls3(Looper.getMainLooper());
	private static int sysLevel = 0;

	static 
	{
		sysLevel = 2;
	//    0    0:iconst_2        
	//    1    1:putstatic       #42  <Field int sysLevel>
	//    2    4:ldc1            #44  <String "">
	//    3    6:putstatic       #46  <Field String logfilePath>
	//    4    9:ldc1            #44  <String "">
	//    5   11:putstatic       #48  <Field String key>
		mUploadFile = false;
	//    6   14:iconst_0        
	//    7   15:putstatic       #50  <Field boolean mUploadFile>
	//    8   18:aconst_null     
	//    9   19:putstatic       #52  <Field Bundle mMetaData>
	//   10   22:aconst_null     
	//   11   23:putstatic       #54  <Field Context mContext>
	//   12   26:ldc1            #56  <String "1">
	//   13   28:putstatic       #58  <Field String logVersion>
	//   14   31:ldc1            #56  <String "1">
	//   15   33:putstatic       #60  <Field String logSubversion>
		isHttpProtocol = true;
	//   16   36:iconst_1        
	//   17   37:putstatic       #62  <Field boolean isHttpProtocol>
	//   18   40:aconst_null     
	//   19   41:putstatic       #64  <Field List autonologlist>
	//   20   44:new             #66  <Class ArrayList>
	//   21   47:dup             
	//   22   48:invokespecial   #69  <Method void ArrayList()>
	//   23   51:putstatic       #71  <Field List autouploadloglist>
		firstTime = 0L;
	//   24   54:lconst_0        
	//   25   55:putstatic       #73  <Field long firstTime>
	//   26   58:new             #75  <Class AppLogApi$1>
	//   27   61:dup             
	//   28   62:invokestatic    #81  <Method Looper Looper.getMainLooper()>
	//   29   65:invokespecial   #84  <Method void AppLogApi$1(Looper)>
	//   30   68:putstatic       #86  <Field Handler myHandler>
	//   31   71:new             #88  <Class AppLogApi$3>
	//   32   74:dup             
	//   33   75:invokestatic    #81  <Method Looper Looper.getMainLooper()>
	//   34   78:invokespecial   #89  <Method void AppLogApi$3(Looper)>
	//   35   81:putstatic       #91  <Field Handler reportHandler>
	//*  36   84:return          
	}


/*
	static Context access$000()
	{
		return mContext;
	//    0    0:getstatic       #54  <Field Context mContext>
	//    1    3:areturn         
	}

*/


/*
	static String access$100()
	{
		return key;
	//    0    0:getstatic       #48  <Field String key>
	//    1    3:areturn         
	}

*/


/*
	static String access$200()
	{
		return logfilePath;
	//    0    0:getstatic       #46  <Field String logfilePath>
	//    1    3:areturn         
	}

*/


/*
	static boolean access$300()
	{
		return mUploadFile;
	//    0    0:getstatic       #50  <Field boolean mUploadFile>
	//    1    3:ireturn         
	}

*/


/*
	static Bundle access$400()
	{
		return mMetaData;
	//    0    0:getstatic       #52  <Field Bundle mMetaData>
	//    1    3:areturn         
	}

*/


/*
	static String access$500()
	{
		return logVersion;
	//    0    0:getstatic       #58  <Field String logVersion>
	//    1    3:areturn         
	}

*/


/*
	static String access$600()
	{
		return logSubversion;
	//    0    0:getstatic       #60  <Field String logSubversion>
	//    1    3:areturn         
	}

*/


/*
	static int access$700()
	{
		return reportCycle;
	//    0    0:getstatic       #108 <Field int reportCycle>
	//    1    3:ireturn         
	}

*/


/*
	static boolean access$800()
	{
		return isHttpProtocol;
	//    0    0:getstatic       #62  <Field boolean isHttpProtocol>
	//    1    3:ireturn         
	}

*/

	// Unreferenced inner class com/huawei/common/applog/AppLogApi$LogLevel
	/* block-local class not found */
	class LogLevel {}


	/* member class not found */
	class _cls2 {}


	/* member class not found */
	class _cls1 {}


	/* member class not found */
	class _cls3 {}

}
