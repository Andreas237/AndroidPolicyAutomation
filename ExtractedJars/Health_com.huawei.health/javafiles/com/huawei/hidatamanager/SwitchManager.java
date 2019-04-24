// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.huawei.hidatamanager;

import android.content.Context;
import android.text.TextUtils;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class SwitchManager
{

	public SwitchManager()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #56  <Method void Object()>
	//    2    4:return          
	}

	public static boolean getModuleSwitchStatus(Context context)
	{
		String s = context.getPackageName();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #64  <Method String Context.getPackageName()>
	//    2    4:astore_2        
		if(TextUtils.isEmpty(((CharSequence) (s))))
	//*   3    5:aload_2         
	//*   4    6:invokestatic    #70  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   5    9:ifeq            14
			return false;
	//    6   12:iconst_0        
	//    7   13:ireturn         
		boolean flag;
		if(android.provider.Settings.Global.getInt(context.getContentResolver(), "smartlearning_enabled", 0) == 1)
	//*   8   14:aload_0         
	//*   9   15:invokevirtual   #74  <Method android.content.ContentResolver Context.getContentResolver()>
	//*  10   18:ldc1            #20  <String "smartlearning_enabled">
	//*  11   20:iconst_0        
	//*  12   21:invokestatic    #80  <Method int android.provider.Settings$Global.getInt(android.content.ContentResolver, String, int)>
	//*  13   24:iconst_1        
	//*  14   25:icmpne          33
			flag = true;
	//   15   28:iconst_1        
	//   16   29:istore_1        
		else
	//*  17   30:goto            35
			flag = false;
	//   18   33:iconst_0        
	//   19   34:istore_1        
		if(!flag)
	//*  20   35:iload_1         
	//*  21   36:ifne            41
			return false;
	//   22   39:iconst_0        
	//   23   40:ireturn         
		s = (String)sPackageSwitchMap.get(((Object) (s)));
	//   24   41:getstatic       #38  <Field Map sPackageSwitchMap>
	//   25   44:aload_2         
	//   26   45:invokeinterface #84  <Method Object Map.get(Object)>
	//   27   50:checkcast       #86  <Class String>
	//   28   53:astore_2        
		if(!TextUtils.isEmpty(((CharSequence) (s))))
	//*  29   54:aload_2         
	//*  30   55:invokestatic    #70  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  31   58:ifne            78
			return android.provider.Settings.Global.getInt(context.getContentResolver(), s, 1) == 1;
	//   32   61:aload_0         
	//   33   62:invokevirtual   #74  <Method android.content.ContentResolver Context.getContentResolver()>
	//   34   65:aload_2         
	//   35   66:iconst_1        
	//   36   67:invokestatic    #80  <Method int android.provider.Settings$Global.getInt(android.content.ContentResolver, String, int)>
	//   37   70:iconst_1        
	//   38   71:icmpne          76
	//   39   74:iconst_1        
	//   40   75:ireturn         
	//   41   76:iconst_0        
	//   42   77:ireturn         
		else
			return false;
	//   43   78:iconst_0        
	//   44   79:ireturn         
	}

	private static final String HEALTH_SWITCH = "pengine_health";
	private static final String HIBOARD_SWITCH = "pengine_hiboard";
	private static final String HISUGGESTION_SWITCH = "pengine_hisuggestion";
	private static final String HIVOICE_SWITCH = "pengine_hivoice";
	private static final String SMART_LEARNING_ENABLED = "smartlearning_enabled";
	private static final int SWITCH_STATUS_ON = 1;
	private static final String TAG = "SwitchManager";
	private static Map sPackageSwitchMap;

	static 
	{
		sPackageSwitchMap = ((Map) (new ConcurrentHashMap()));
	//    0    0:new             #33  <Class ConcurrentHashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #36  <Method void ConcurrentHashMap()>
	//    3    7:putstatic       #38  <Field Map sPackageSwitchMap>
		sPackageSwitchMap.put("com.huawei.intelligent", "pengine_hiboard");
	//    4   10:getstatic       #38  <Field Map sPackageSwitchMap>
	//    5   13:ldc1            #40  <String "com.huawei.intelligent">
	//    6   15:ldc1            #11  <String "pengine_hiboard">
	//    7   17:invokeinterface #46  <Method Object Map.put(Object, Object)>
	//    8   22:pop             
		sPackageSwitchMap.put("com.huawei.suggestion", "pengine_hisuggestion");
	//    9   23:getstatic       #38  <Field Map sPackageSwitchMap>
	//   10   26:ldc1            #48  <String "com.huawei.suggestion">
	//   11   28:ldc1            #14  <String "pengine_hisuggestion">
	//   12   30:invokeinterface #46  <Method Object Map.put(Object, Object)>
	//   13   35:pop             
		sPackageSwitchMap.put("com.huawei.vassistant", "pengine_hivoice");
	//   14   36:getstatic       #38  <Field Map sPackageSwitchMap>
	//   15   39:ldc1            #50  <String "com.huawei.vassistant">
	//   16   41:ldc1            #17  <String "pengine_hivoice">
	//   17   43:invokeinterface #46  <Method Object Map.put(Object, Object)>
	//   18   48:pop             
		sPackageSwitchMap.put("com.huawei.health", "pengine_health");
	//   19   49:getstatic       #38  <Field Map sPackageSwitchMap>
	//   20   52:ldc1            #52  <String "com.huawei.health">
	//   21   54:ldc1            #8   <String "pengine_health">
	//   22   56:invokeinterface #46  <Method Object Map.put(Object, Object)>
	//   23   61:pop             
		sPackageSwitchMap.put("com.huawei.testhidatamanager", "pengine_health");
	//   24   62:getstatic       #38  <Field Map sPackageSwitchMap>
	//   25   65:ldc1            #54  <String "com.huawei.testhidatamanager">
	//   26   67:ldc1            #8   <String "pengine_health">
	//   27   69:invokeinterface #46  <Method Object Map.put(Object, Object)>
	//   28   74:pop             
	//*  29   75:return          
	}
}
