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

	private PackageManagerHelper()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void Object()>
	//    2    4:return          
	}

	public static boolean isComponentExplicitlyEnabled(Context context, Class class1)
	{
		return isComponentExplicitlyEnabled(context, class1.getName());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #30  <Method String Class.getName()>
	//    3    5:invokestatic    #33  <Method boolean isComponentExplicitlyEnabled(Context, String)>
	//    4    8:ireturn         
	}

	public static boolean isComponentExplicitlyEnabled(Context context, String s)
	{
		return context.getPackageManager().getComponentEnabledSetting(new ComponentName(context, s)) == 1;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #39  <Method PackageManager Context.getPackageManager()>
	//    2    4:new             #41  <Class ComponentName>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #44  <Method void ComponentName(Context, String)>
	//    7   13:invokevirtual   #50  <Method int PackageManager.getComponentEnabledSetting(ComponentName)>
	//    8   16:iconst_1        
	//    9   17:icmpne          22
	//   10   20:iconst_1        
	//   11   21:ireturn         
	//   12   22:iconst_0        
	//   13   23:ireturn         
	}

	public static void setComponentEnabled(Context context, Class class1, boolean flag)
	{
		int i;
		Object obj;
		String s;
		String s1;
		try
		{
			obj = ((Object) (context.getPackageManager()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #39  <Method PackageManager Context.getPackageManager()>
	//    2    4:astore          4
			context = ((Context) (new ComponentName(context, class1.getName())));
	//    3    6:new             #41  <Class ComponentName>
	//    4    9:dup             
	//    5   10:aload_0         
	//    6   11:aload_1         
	//    7   12:invokevirtual   #30  <Method String Class.getName()>
	//    8   15:invokespecial   #44  <Method void ComponentName(Context, String)>
	//    9   18:astore_0        
		}
	//*  10   19:iload_2         
	//*  11   20:ifeq            156
	//*  12   23:iconst_1        
	//*  13   24:istore_3        
	//*  14   25:goto            28
	//*  15   28:aload           4
	//*  16   30:aload_0         
	//*  17   31:iload_3         
	//*  18   32:iconst_1        
	//*  19   33:invokevirtual   #59  <Method void PackageManager.setComponentEnabledSetting(ComponentName, int, int)>
	//*  20   36:invokestatic    #63  <Method Logger Logger.get()>
	//*  21   39:astore          4
	//*  22   41:getstatic       #18  <Field String TAG>
	//*  23   44:astore          5
	//*  24   46:aload_1         
	//*  25   47:invokevirtual   #30  <Method String Class.getName()>
	//*  26   50:astore          6
	//*  27   52:iload_2         
	//*  28   53:ifeq            161
	//*  29   56:ldc1            #65  <String "enabled">
	//*  30   58:astore_0        
	//*  31   59:goto            62
	//*  32   62:aload           4
	//*  33   64:aload           5
	//*  34   66:ldc1            #67  <String "%s %s">
	//*  35   68:iconst_2        
	//*  36   69:anewarray       Object[]
	//*  37   72:dup             
	//*  38   73:iconst_0        
	//*  39   74:aload           6
	//*  40   76:aastore         
	//*  41   77:dup             
	//*  42   78:iconst_1        
	//*  43   79:aload_0         
	//*  44   80:aastore         
	//*  45   81:invokestatic    #73  <Method String String.format(String, Object[])>
	//*  46   84:iconst_0        
	//*  47   85:anewarray       Throwable[]
	//*  48   88:invokevirtual   #79  <Method void Logger.debug(String, String, Throwable[])>
	//*  49   91:return          
		catch(Exception exception)
	//*  50   92:astore          4
		{
			Logger logger = Logger.get();
	//   51   94:invokestatic    #63  <Method Logger Logger.get()>
	//   52   97:astore          5
			String s2 = TAG;
	//   53   99:getstatic       #18  <Field String TAG>
	//   54  102:astore          6
			class1 = ((Class) (class1.getName()));
	//   55  104:aload_1         
	//   56  105:invokevirtual   #30  <Method String Class.getName()>
	//   57  108:astore_1        
			if(flag)
	//*  58  109:iload_2         
	//*  59  110:ifeq            119
				context = "enabled";
	//   60  113:ldc1            #65  <String "enabled">
	//   61  115:astore_0        
			else
	//*  62  116:goto            122
				context = "disabled";
	//   63  119:ldc1            #81  <String "disabled">
	//   64  121:astore_0        
			logger.debug(s2, String.format("%s could not be %s", new Object[] {
				class1, context
			}), new Throwable[] {
				exception
			});
	//   65  122:aload           5
	//   66  124:aload           6
	//   67  126:ldc1            #83  <String "%s could not be %s">
	//   68  128:iconst_2        
	//   69  129:anewarray       Object[]
	//   70  132:dup             
	//   71  133:iconst_0        
	//   72  134:aload_1         
	//   73  135:aastore         
	//   74  136:dup             
	//   75  137:iconst_1        
	//   76  138:aload_0         
	//   77  139:aastore         
	//   78  140:invokestatic    #73  <Method String String.format(String, Object[])>
	//   79  143:iconst_1        
	//   80  144:anewarray       Throwable[]
	//   81  147:dup             
	//   82  148:iconst_0        
	//   83  149:aload           4
	//   84  151:aastore         
	//   85  152:invokevirtual   #79  <Method void Logger.debug(String, String, Throwable[])>
			return;
	//   86  155:return          
		}
		if(flag)
			i = 1;
		else
			i = 2;
	//   87  156:iconst_2        
	//   88  157:istore_3        
		((PackageManager) (obj)).setComponentEnabledSetting(((ComponentName) (context)), i, 1);
		obj = ((Object) (Logger.get()));
		s = TAG;
		s1 = class1.getName();
		if(flag)
			context = "enabled";
		else
	//*  89  158:goto            28
			context = "disabled";
	//   90  161:ldc1            #81  <String "disabled">
	//   91  163:astore_0        
		((Logger) (obj)).debug(s, String.format("%s %s", new Object[] {
			s1, context
		}), new Throwable[0]);
		return;
	//*  92  164:goto            62
	}

	private static final String TAG = Logger.tagWithPrefix("PackageManagerHelper");

	static 
	{
	//    0    0:ldc1            #10  <String "PackageManagerHelper">
	//    1    2:invokestatic    #16  <Method String Logger.tagWithPrefix(String)>
	//    2    5:putstatic       #18  <Field String TAG>
	//*   3    8:return          
	}
}
