// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.huawei.operation;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.login.ui.login.LoginInit;
import java.lang.reflect.Field;
import java.util.Date;
import java.util.LinkedHashMap;
import o.*;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.huawei.operation:
//			OpAnalyticsImpl

public class OpAnalyticsUtil
{

	private OpAnalyticsUtil()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
	//    2    4:return          
	}

	OpAnalyticsUtil(_cls1 _pcls1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void OpAnalyticsUtil()>
	//    2    4:return          
	}

	private LinkedHashMap buildMap(LinkedHashMap linkedhashmap)
	{
		LinkedHashMap linkedhashmap1 = linkedhashmap;
	//    0    0:aload_1         
	//    1    1:astore_2        
		if(linkedhashmap == null)
	//*   2    2:aload_1         
	//*   3    3:ifnonnull       14
			linkedhashmap1 = new LinkedHashMap();
	//    4    6:new             #27  <Class LinkedHashMap>
	//    5    9:dup             
	//    6   10:invokespecial   #28  <Method void LinkedHashMap()>
	//    7   13:astore_2        
		linkedhashmap1.put("ID", ((Object) (cxc.d(LoginInit.getInstance(BaseApplication.a()).getUsetId(), "SHA-256"))));
	//    8   14:aload_2         
	//    9   15:ldc1            #30  <String "ID">
	//   10   17:invokestatic    #36  <Method Context BaseApplication.a()>
	//   11   20:invokestatic    #42  <Method LoginInit LoginInit.getInstance(Context)>
	//   12   23:invokevirtual   #46  <Method String LoginInit.getUsetId()>
	//   13   26:ldc1            #48  <String "SHA-256">
	//   14   28:invokestatic    #54  <Method String cxc.d(String, String)>
	//   15   31:invokevirtual   #58  <Method Object LinkedHashMap.put(Object, Object)>
	//   16   34:pop             
		linkedhashmap1.put("VER", "1");
	//   17   35:aload_2         
	//   18   36:ldc1            #60  <String "VER">
	//   19   38:ldc1            #62  <String "1">
	//   20   40:invokevirtual   #58  <Method Object LinkedHashMap.put(Object, Object)>
	//   21   43:pop             
		linkedhashmap1.put("time", ((Object) (String.valueOf(((Object) (new Date(System.currentTimeMillis())))))));
	//   22   44:aload_2         
	//   23   45:ldc1            #64  <String "time">
	//   24   47:new             #66  <Class Date>
	//   25   50:dup             
	//   26   51:invokestatic    #72  <Method long System.currentTimeMillis()>
	//   27   54:invokespecial   #75  <Method void Date(long)>
	//   28   57:invokestatic    #81  <Method String String.valueOf(Object)>
	//   29   60:invokevirtual   #58  <Method Object LinkedHashMap.put(Object, Object)>
	//   30   63:pop             
		return linkedhashmap1;
	//   31   64:aload_2         
	//   32   65:areturn         
	}

	private boolean checkVersion()
	{
		boolean flag = getVersion().equals("beta");
	//    0    0:aload_0         
	//    1    1:invokespecial   #88  <Method String getVersion()>
	//    2    4:ldc1            #90  <String "beta">
	//    3    6:invokevirtual   #94  <Method boolean String.equals(Object)>
	//    4    9:istore_1        
		dho.b("OpAnalyticsUtil", new Object[] {
			(new StringBuilder()).append("checkVersion isBeta = ").append(flag).toString()
		});
	//    5   10:ldc1            #16  <String "OpAnalyticsUtil">
	//    6   12:iconst_1        
	//    7   13:anewarray       Object[]
	//    8   16:dup             
	//    9   17:iconst_0        
	//   10   18:new             #96  <Class StringBuilder>
	//   11   21:dup             
	//   12   22:invokespecial   #97  <Method void StringBuilder()>
	//   13   25:ldc1            #99  <String "checkVersion isBeta = ">
	//   14   27:invokevirtual   #103 <Method StringBuilder StringBuilder.append(String)>
	//   15   30:iload_1         
	//   16   31:invokevirtual   #106 <Method StringBuilder StringBuilder.append(boolean)>
	//   17   34:invokevirtual   #109 <Method String StringBuilder.toString()>
	//   18   37:aastore         
	//   19   38:invokestatic    #115 <Method void dho.b(String, Object[])>
		if(flag)
	//*  20   41:iload_1         
	//*  21   42:ifeq            47
			return true;
	//   22   45:iconst_1        
	//   23   46:ireturn         
		else
			return "true".equals(((Object) (getRule(30005, "ai-common-003"))));
	//   24   47:ldc1            #117 <String "true">
	//   25   49:aload_0         
	//   26   50:sipush          30005
	//   27   53:ldc1            #13  <String "ai-common-003">
	//   28   55:invokespecial   #121 <Method String getRule(int, String)>
	//   29   58:invokevirtual   #94  <Method boolean String.equals(Object)>
	//   30   61:ireturn         
	}

	public static OpAnalyticsUtil getInstance()
	{
	/* block-local class not found */
	class OpAnalyticsUtilHolder {}

		return OpAnalyticsUtilHolder.access._mth100();
	//    0    0:invokestatic    #125 <Method OpAnalyticsUtil OpAnalyticsUtil$OpAnalyticsUtilHolder.access$100()>
	//    1    3:areturn         
	}

	private String getRule(int i, String s)
	{
		s = dct.c(BaseApplication.a(), String.valueOf(i), s);
	//    0    0:invokestatic    #36  <Method Context BaseApplication.a()>
	//    1    3:iload_1         
	//    2    4:invokestatic    #130 <Method String String.valueOf(int)>
	//    3    7:aload_2         
	//    4    8:invokestatic    #136 <Method String dct.c(Context, String, String)>
	//    5   11:astore_2        
		dho.b("OpAnalyticsUtil", new Object[] {
			(new StringBuilder()).append("ruleStr = ").append(s).toString()
		});
	//    6   12:ldc1            #16  <String "OpAnalyticsUtil">
	//    7   14:iconst_1        
	//    8   15:anewarray       Object[]
	//    9   18:dup             
	//   10   19:iconst_0        
	//   11   20:new             #96  <Class StringBuilder>
	//   12   23:dup             
	//   13   24:invokespecial   #97  <Method void StringBuilder()>
	//   14   27:ldc1            #138 <String "ruleStr = ">
	//   15   29:invokevirtual   #103 <Method StringBuilder StringBuilder.append(String)>
	//   16   32:aload_2         
	//   17   33:invokevirtual   #103 <Method StringBuilder StringBuilder.append(String)>
	//   18   36:invokevirtual   #109 <Method String StringBuilder.toString()>
	//   19   39:aastore         
	//   20   40:invokestatic    #115 <Method void dho.b(String, Object[])>
		if(TextUtils.isEmpty(((CharSequence) (s))))
			break MISSING_BLOCK_LABEL_101;
	//   21   43:aload_2         
	//   22   44:invokestatic    #144 <Method boolean TextUtils.isEmpty(CharSequence)>
	//   23   47:ifne            101
		boolean flag = (new JSONObject(s)).getBoolean("enable");
	//   24   50:new             #146 <Class JSONObject>
	//   25   53:dup             
	//   26   54:aload_2         
	//   27   55:invokespecial   #149 <Method void JSONObject(String)>
	//   28   58:ldc1            #151 <String "enable">
	//   29   60:invokevirtual   #155 <Method boolean JSONObject.getBoolean(String)>
	//   30   63:istore_3        
		if(flag)
	//*  31   64:iload_3         
	//*  32   65:ifeq            74
			s = "true";
	//   33   68:ldc1            #117 <String "true">
	//   34   70:astore_2        
		else
	//*  35   71:goto            77
			s = "false";
	//   36   74:ldc1            #157 <String "false">
	//   37   76:astore_2        
		return s;
	//   38   77:aload_2         
	//   39   78:areturn         
		s;
	//   40   79:astore_2        
		dho.f("OpAnalyticsUtil", new Object[] {
			"isRuleOpen JSONException e = ", ((JSONException) (s)).getMessage()
		});
	//   41   80:ldc1            #16  <String "OpAnalyticsUtil">
	//   42   82:iconst_2        
	//   43   83:anewarray       Object[]
	//   44   86:dup             
	//   45   87:iconst_0        
	//   46   88:ldc1            #159 <String "isRuleOpen JSONException e = ">
	//   47   90:aastore         
	//   48   91:dup             
	//   49   92:iconst_1        
	//   50   93:aload_2         
	//   51   94:invokevirtual   #162 <Method String JSONException.getMessage()>
	//   52   97:aastore         
	//   53   98:invokestatic    #165 <Method void dho.f(String, Object[])>
		return "";
	//   54  101:ldc1            #167 <String "">
	//   55  103:areturn         
	}

	private String getVersion()
	{
		String s = "";
	//    0    0:ldc1            #167 <String "">
	//    1    2:astore_1        
		String s1 = s;
	//    2    3:aload_1         
	//    3    4:astore_2        
		String s2 = s;
	//    4    5:aload_1         
	//    5    6:astore_3        
		String s3 = s;
	//    6    7:aload_1         
	//    7    8:astore          4
		try
		{
			s = (String)Class.forName((new StringBuilder()).append(BaseApplication.a().getPackageName()).append(".BuildConfig").toString()).getField("BUILD_TYPE").get(((Object) (null)));
	//    8   10:new             #96  <Class StringBuilder>
	//    9   13:dup             
	//   10   14:invokespecial   #97  <Method void StringBuilder()>
	//   11   17:invokestatic    #36  <Method Context BaseApplication.a()>
	//   12   20:invokevirtual   #178 <Method String Context.getPackageName()>
	//   13   23:invokevirtual   #103 <Method StringBuilder StringBuilder.append(String)>
	//   14   26:ldc1            #180 <String ".BuildConfig">
	//   15   28:invokevirtual   #103 <Method StringBuilder StringBuilder.append(String)>
	//   16   31:invokevirtual   #109 <Method String StringBuilder.toString()>
	//   17   34:invokestatic    #186 <Method Class Class.forName(String)>
	//   18   37:ldc1            #188 <String "BUILD_TYPE">
	//   19   39:invokevirtual   #192 <Method Field Class.getField(String)>
	//   20   42:aconst_null     
	//   21   43:invokevirtual   #198 <Method Object Field.get(Object)>
	//   22   46:checkcast       #77  <Class String>
	//   23   49:astore_1        
		}
	//*  24   50:aload_1         
	//*  25   51:astore_2        
	//*  26   52:aload_1         
	//*  27   53:astore_3        
	//*  28   54:aload_1         
	//*  29   55:astore          4
	//*  30   57:ldc1            #16  <String "OpAnalyticsUtil">
	//*  31   59:iconst_2        
	//*  32   60:anewarray       Object[]
	//*  33   63:dup             
	//*  34   64:iconst_0        
	//*  35   65:ldc1            #200 <String "BUILD_TYPE = ">
	//*  36   67:aastore         
	//*  37   68:dup             
	//*  38   69:iconst_1        
	//*  39   70:aload_1         
	//*  40   71:aastore         
	//*  41   72:invokestatic    #115 <Method void dho.b(String, Object[])>
	//*  42   75:aload_1         
	//*  43   76:areturn         
		catch(ClassNotFoundException classnotfoundexception)
	//*  44   77:astore_1        
		{
			dho.f("OpAnalyticsUtil", new Object[] {
				"isRelease ClassNotFoundException e = ", classnotfoundexception.getMessage()
			});
	//   45   78:ldc1            #16  <String "OpAnalyticsUtil">
	//   46   80:iconst_2        
	//   47   81:anewarray       Object[]
	//   48   84:dup             
	//   49   85:iconst_0        
	//   50   86:ldc1            #202 <String "isRelease ClassNotFoundException e = ">
	//   51   88:aastore         
	//   52   89:dup             
	//   53   90:iconst_1        
	//   54   91:aload_1         
	//   55   92:invokevirtual   #203 <Method String ClassNotFoundException.getMessage()>
	//   56   95:aastore         
	//   57   96:invokestatic    #165 <Method void dho.f(String, Object[])>
			return s1;
	//   58   99:aload_2         
	//   59  100:areturn         
		}
		catch(NoSuchFieldException nosuchfieldexception)
	//*  60  101:astore_1        
		{
			dho.f("OpAnalyticsUtil", new Object[] {
				"isRelease NoSuchFieldException e = ", nosuchfieldexception.getMessage()
			});
	//   61  102:ldc1            #16  <String "OpAnalyticsUtil">
	//   62  104:iconst_2        
	//   63  105:anewarray       Object[]
	//   64  108:dup             
	//   65  109:iconst_0        
	//   66  110:ldc1            #205 <String "isRelease NoSuchFieldException e = ">
	//   67  112:aastore         
	//   68  113:dup             
	//   69  114:iconst_1        
	//   70  115:aload_1         
	//   71  116:invokevirtual   #206 <Method String NoSuchFieldException.getMessage()>
	//   72  119:aastore         
	//   73  120:invokestatic    #165 <Method void dho.f(String, Object[])>
			return s2;
	//   74  123:aload_3         
	//   75  124:areturn         
		}
		catch(IllegalAccessException illegalaccessexception)
	//*  76  125:astore_1        
		{
			dho.f("OpAnalyticsUtil", new Object[] {
				"isRelease IllegalAccessException e = ", illegalaccessexception.getMessage()
			});
	//   77  126:ldc1            #16  <String "OpAnalyticsUtil">
	//   78  128:iconst_2        
	//   79  129:anewarray       Object[]
	//   80  132:dup             
	//   81  133:iconst_0        
	//   82  134:ldc1            #208 <String "isRelease IllegalAccessException e = ">
	//   83  136:aastore         
	//   84  137:dup             
	//   85  138:iconst_1        
	//   86  139:aload_1         
	//   87  140:invokevirtual   #209 <Method String IllegalAccessException.getMessage()>
	//   88  143:aastore         
	//   89  144:invokestatic    #165 <Method void dho.f(String, Object[])>
			return s3;
	//   90  147:aload           4
	//   91  149:areturn         
		}
		s1 = s;
		s2 = s;
		s3 = s;
		dho.b("OpAnalyticsUtil", new Object[] {
			"BUILD_TYPE = ", s
		});
		return s;
	}

	public static void init(Context context)
	{
		if(czu.i())
	//*   0    0:invokestatic    #216 <Method boolean czu.i()>
	//*   1    3:ifeq            44
		{
			o.cjy.b b = new o.cjy.b(context);
	//    2    6:new             #218 <Class o.cjy$b>
	//    3    9:dup             
	//    4   10:aload_0         
	//    5   11:invokespecial   #220 <Method void o.cjy$b(Context)>
	//    6   14:astore_1        
			cze.c(context).d("biOperation", ((o.cza) (new _cls1(b, context))));
	//    7   15:aload_0         
	//    8   16:invokestatic    #225 <Method cze cze.c(Context)>
	//    9   19:ldc1            #227 <String "biOperation">
	//   10   21:new             #229 <Class OpAnalyticsUtil$1>
	//   11   24:dup             
	//   12   25:aload_1         
	//   13   26:aload_0         
	//   14   27:invokespecial   #232 <Method void OpAnalyticsUtil$1(o.cjy$b, Context)>
	//   15   30:invokevirtual   #235 <Method void cze.d(String, o.cza)>
			if(!dbf.v(context))
	//*  16   33:aload_0         
	//*  17   34:invokestatic    #241 <Method boolean dbf.v(Context)>
	//*  18   37:ifne            44
				cjj.c(context);
	//   19   40:aload_0         
	//   20   41:invokestatic    #245 <Method void cjj.c(Context)>
		}
	//   21   44:return          
	}

	public int setEvent(String s, LinkedHashMap linkedhashmap)
	{
		if(czu.i())
	//*   0    0:invokestatic    #216 <Method boolean czu.i()>
	//*   1    3:ifeq            45
		{
			if(dgk.d())
	//*   2    6:invokestatic    #251 <Method boolean dgk.d()>
	//*   3    9:ifeq            35
			{
				cxg.e("OpAnalyticsUtil", "setEvent()");
	//    4   12:ldc1            #16  <String "OpAnalyticsUtil">
	//    5   14:ldc1            #253 <String "setEvent()">
	//    6   16:invokestatic    #259 <Method void cxg.e(String, String)>
				int i = OpAnalyticsImpl.setEvent(1, s, buildMap(linkedhashmap));
	//    7   19:iconst_1        
	//    8   20:aload_1         
	//    9   21:aload_0         
	//   10   22:aload_2         
	//   11   23:invokespecial   #261 <Method LinkedHashMap buildMap(LinkedHashMap)>
	//   12   26:invokestatic    #266 <Method int OpAnalyticsImpl.setEvent(int, String, LinkedHashMap)>
	//   13   29:istore_3        
				OpAnalyticsImpl.onReport();
	//   14   30:invokestatic    #269 <Method void OpAnalyticsImpl.onReport()>
				return i;
	//   15   33:iload_3         
	//   16   34:ireturn         
			} else
			{
				cxg.c("OpAnalyticsUtil", "setEvent() AnalyticsStatus is false");
	//   17   35:ldc1            #16  <String "OpAnalyticsUtil">
	//   18   37:ldc2            #271 <String "setEvent() AnalyticsStatus is false">
	//   19   40:invokestatic    #273 <Method void cxg.c(String, String)>
				return -1;
	//   20   43:iconst_m1       
	//   21   44:ireturn         
			}
		} else
		{
			cxg.c("OpAnalyticsUtil", "setEvent() BuildConfig.SUPPORT_ANALYTICS = true");
	//   22   45:ldc1            #16  <String "OpAnalyticsUtil">
	//   23   47:ldc2            #275 <String "setEvent() BuildConfig.SUPPORT_ANALYTICS = true">
	//   24   50:invokestatic    #273 <Method void cxg.c(String, String)>
			return -1;
	//   25   53:iconst_m1       
	//   26   54:ireturn         
		}
	}

	public int setEvent2nd(String s, LinkedHashMap linkedhashmap)
	{
		return setEvent(s, linkedhashmap);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #279 <Method int setEvent(String, LinkedHashMap)>
	//    4    6:ireturn         
	}

	public void setEventWithActionType(int i, String s)
	{
		LinkedHashMap linkedhashmap = new LinkedHashMap();
	//    0    0:new             #27  <Class LinkedHashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #28  <Method void LinkedHashMap()>
	//    3    7:astore_3        
		linkedhashmap.put("actiontype", ((Object) (String.valueOf(i))));
	//    4    8:aload_3         
	//    5    9:ldc2            #283 <String "actiontype">
	//    6   12:iload_1         
	//    7   13:invokestatic    #130 <Method String String.valueOf(int)>
	//    8   16:invokevirtual   #58  <Method Object LinkedHashMap.put(Object, Object)>
	//    9   19:pop             
		setEvent(s, linkedhashmap);
	//   10   20:aload_0         
	//   11   21:aload_2         
	//   12   22:aload_3         
	//   13   23:invokevirtual   #279 <Method int setEvent(String, LinkedHashMap)>
	//   14   26:pop             
	//   15   27:return          
	}

	private static final int ERROR = -1;
	private static final String RULE_ANALYTICS = "ai-common-003";
	private static final String TAG = "OpAnalyticsUtil";

	/* member class not found */
	class _cls1 {}

}
