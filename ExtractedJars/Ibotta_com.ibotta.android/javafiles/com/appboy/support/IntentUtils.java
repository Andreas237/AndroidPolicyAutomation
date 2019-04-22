// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy.support;

import android.content.*;
import android.content.pm.*;
import java.util.*;

// Referenced classes of package com.appboy.support:
//			AppboyLogger

public final class IntentUtils
{

	public IntentUtils()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #37  <Method void Object()>
	//    2    4:return          
	}

	public static void addComponentAndSendBroadcast(Context context, Intent intent)
	{
		Object obj = ((Object) (context.getPackageManager().queryBroadcastReceivers(intent, 0)));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #45  <Method PackageManager Context.getPackageManager()>
	//    2    4:aload_1         
	//    3    5:iconst_0        
	//    4    6:invokevirtual   #51  <Method List PackageManager.queryBroadcastReceivers(Intent, int)>
	//    5    9:astore_2        
		if(obj == null)
	//*   6   10:aload_2         
	//*   7   11:ifnonnull       52
		{
			context = ((Context) (a));
	//    8   14:getstatic       #28  <Field String a>
	//    9   17:astore_0        
			obj = ((Object) (new StringBuilder()));
	//   10   18:new             #53  <Class StringBuilder>
	//   11   21:dup             
	//   12   22:invokespecial   #54  <Method void StringBuilder()>
	//   13   25:astore_2        
			((StringBuilder) (obj)).append("No components found for the following intent: ");
	//   14   26:aload_2         
	//   15   27:ldc1            #56  <String "No components found for the following intent: ">
	//   16   29:invokevirtual   #60  <Method StringBuilder StringBuilder.append(String)>
	//   17   32:pop             
			((StringBuilder) (obj)).append(intent.getAction());
	//   18   33:aload_2         
	//   19   34:aload_1         
	//   20   35:invokevirtual   #65  <Method String Intent.getAction()>
	//   21   38:invokevirtual   #60  <Method StringBuilder StringBuilder.append(String)>
	//   22   41:pop             
			AppboyLogger.d(((String) (context)), ((StringBuilder) (obj)).toString());
	//   23   42:aload_0         
	//   24   43:aload_2         
	//   25   44:invokevirtual   #68  <Method String StringBuilder.toString()>
	//   26   47:invokestatic    #74  <Method int AppboyLogger.d(String, String)>
	//   27   50:pop             
			return;
	//   28   51:return          
		}
		Intent intent1;
		for(obj = ((Object) (((List) (obj)).iterator())); ((Iterator) (obj)).hasNext(); context.sendBroadcast(intent1))
	//*  29   52:aload_2         
	//*  30   53:invokeinterface #80  <Method Iterator List.iterator()>
	//*  31   58:astore_2        
	//*  32   59:aload_2         
	//*  33   60:invokeinterface #86  <Method boolean Iterator.hasNext()>
	//*  34   65:ifeq            127
		{
			ResolveInfo resolveinfo = (ResolveInfo)((Iterator) (obj)).next();
	//   35   68:aload_2         
	//   36   69:invokeinterface #90  <Method Object Iterator.next()>
	//   37   74:checkcast       #92  <Class ResolveInfo>
	//   38   77:astore_3        
			intent1 = new Intent(intent);
	//   39   78:new             #62  <Class Intent>
	//   40   81:dup             
	//   41   82:aload_1         
	//   42   83:invokespecial   #95  <Method void Intent(Intent)>
	//   43   86:astore          4
			intent1.setComponent(new ComponentName(resolveinfo.activityInfo.applicationInfo.packageName, resolveinfo.activityInfo.name));
	//   44   88:aload           4
	//   45   90:new             #97  <Class ComponentName>
	//   46   93:dup             
	//   47   94:aload_3         
	//   48   95:getfield        #101 <Field ActivityInfo ResolveInfo.activityInfo>
	//   49   98:getfield        #107 <Field ApplicationInfo ActivityInfo.applicationInfo>
	//   50  101:getfield        #112 <Field String ApplicationInfo.packageName>
	//   51  104:aload_3         
	//   52  105:getfield        #101 <Field ActivityInfo ResolveInfo.activityInfo>
	//   53  108:getfield        #115 <Field String ActivityInfo.name>
	//   54  111:invokespecial   #118 <Method void ComponentName(String, String)>
	//   55  114:invokevirtual   #122 <Method Intent Intent.setComponent(ComponentName)>
	//   56  117:pop             
		}

	//   57  118:aload_0         
	//   58  119:aload           4
	//   59  121:invokevirtual   #125 <Method void Context.sendBroadcast(Intent)>
	//*  60  124:goto            59
	//   61  127:return          
	}

	public static int getRequestCode()
	{
		return b.nextInt();
	//    0    0:getstatic       #35  <Field Random b>
	//    1    3:invokevirtual   #130 <Method int Random.nextInt()>
	//    2    6:ireturn         
	}

	private static final String a = String.format("%s.%s", new Object[] {
		"Appboy v3.1.0 .", ((Class) (com/appboy/support/IntentUtils)).getName()
	});
	private static final Random b = new Random();

	static 
	{
	//    0    0:ldc1            #12  <String "%s.%s">
	//    1    2:iconst_2        
	//    2    3:anewarray       Object[]
	//    3    6:dup             
	//    4    7:iconst_0        
	//    5    8:ldc1            #14  <String "Appboy v3.1.0 .">
	//    6   10:aastore         
	//    7   11:dup             
	//    8   12:iconst_1        
	//    9   13:ldc1            #2   <Class IntentUtils>
	//   10   15:invokevirtual   #20  <Method String Class.getName()>
	//   11   18:aastore         
	//   12   19:invokestatic    #26  <Method String String.format(String, Object[])>
	//   13   22:putstatic       #28  <Field String a>
	//   14   25:new             #30  <Class Random>
	//   15   28:dup             
	//   16   29:invokespecial   #33  <Method void Random()>
	//   17   32:putstatic       #35  <Field Random b>
	//*  18   35:return          
	}
}
