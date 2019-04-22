// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package androidx.work.impl.utils;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import androidx.work.Logger;

public class PackageManagerHelper
{

	public static void setComponentEnabled(Context context, Class class1, boolean flag)
	{
		int i;
		Object obj;
		try
		{
			obj = ((Object) (context.getPackageManager()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #15  <Method PackageManager Context.getPackageManager()>
	//    2    4:astore          4
			context = ((Context) (new ComponentName(context, class1.getName())));
	//    3    6:new             #17  <Class ComponentName>
	//    4    9:dup             
	//    5   10:aload_0         
	//    6   11:aload_1         
	//    7   12:invokevirtual   #23  <Method String Class.getName()>
	//    8   15:invokespecial   #27  <Method void ComponentName(Context, String)>
	//    9   18:astore_0        
		}
	//*  10   19:iload_2         
	//*  11   20:ifeq            132
	//*  12   23:iconst_1        
	//*  13   24:istore_3        
	//*  14   25:goto            28
	//*  15   28:aload           4
	//*  16   30:aload_0         
	//*  17   31:iload_3         
	//*  18   32:iconst_1        
	//*  19   33:invokevirtual   #33  <Method void PackageManager.setComponentEnabledSetting(ComponentName, int, int)>
	//*  20   36:aload_1         
	//*  21   37:invokevirtual   #23  <Method String Class.getName()>
	//*  22   40:astore          4
	//*  23   42:iload_2         
	//*  24   43:ifeq            137
	//*  25   46:ldc1            #35  <String "enabled">
	//*  26   48:astore_0        
	//*  27   49:goto            52
	//*  28   52:ldc1            #37  <String "PackageManagerHelper">
	//*  29   54:ldc1            #39  <String "%s %s">
	//*  30   56:iconst_2        
	//*  31   57:anewarray       Object[]
	//*  32   60:dup             
	//*  33   61:iconst_0        
	//*  34   62:aload           4
	//*  35   64:aastore         
	//*  36   65:dup             
	//*  37   66:iconst_1        
	//*  38   67:aload_0         
	//*  39   68:aastore         
	//*  40   69:invokestatic    #45  <Method String String.format(String, Object[])>
	//*  41   72:iconst_0        
	//*  42   73:anewarray       Throwable[]
	//*  43   76:invokestatic    #53  <Method void Logger.debug(String, String, Throwable[])>
	//*  44   79:return          
		catch(Exception exception)
	//*  45   80:astore          4
		{
			class1 = ((Class) (class1.getName()));
	//   46   82:aload_1         
	//   47   83:invokevirtual   #23  <Method String Class.getName()>
	//   48   86:astore_1        
			if(flag)
	//*  49   87:iload_2         
	//*  50   88:ifeq            97
				context = "enabled";
	//   51   91:ldc1            #35  <String "enabled">
	//   52   93:astore_0        
			else
	//*  53   94:goto            100
				context = "disabled";
	//   54   97:ldc1            #55  <String "disabled">
	//   55   99:astore_0        
			Logger.debug("PackageManagerHelper", String.format("%s could not be %s", new Object[] {
				class1, context
			}), new Throwable[] {
				exception
			});
	//   56  100:ldc1            #37  <String "PackageManagerHelper">
	//   57  102:ldc1            #57  <String "%s could not be %s">
	//   58  104:iconst_2        
	//   59  105:anewarray       Object[]
	//   60  108:dup             
	//   61  109:iconst_0        
	//   62  110:aload_1         
	//   63  111:aastore         
	//   64  112:dup             
	//   65  113:iconst_1        
	//   66  114:aload_0         
	//   67  115:aastore         
	//   68  116:invokestatic    #45  <Method String String.format(String, Object[])>
	//   69  119:iconst_1        
	//   70  120:anewarray       Throwable[]
	//   71  123:dup             
	//   72  124:iconst_0        
	//   73  125:aload           4
	//   74  127:aastore         
	//   75  128:invokestatic    #53  <Method void Logger.debug(String, String, Throwable[])>
			return;
	//   76  131:return          
		}
		if(flag)
			i = 1;
		else
			i = 2;
	//   77  132:iconst_2        
	//   78  133:istore_3        
		((PackageManager) (obj)).setComponentEnabledSetting(((ComponentName) (context)), i, 1);
		obj = ((Object) (class1.getName()));
		if(flag)
			context = "enabled";
		else
	//*  79  134:goto            28
			context = "disabled";
	//   80  137:ldc1            #55  <String "disabled">
	//   81  139:astore_0        
		Logger.debug("PackageManagerHelper", String.format("%s %s", new Object[] {
			obj, context
		}), new Throwable[0]);
		return;
	//*  82  140:goto            52
	}
}
