// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import java.lang.reflect.*;

class NotificationManagerCompatKitKat
{

	NotificationManagerCompatKitKat()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
	//    2    4:return          
	}

	public static boolean areNotificationsEnabled(Context context)
	{
		int i;
		AppOpsManager appopsmanager;
		appopsmanager = (AppOpsManager)context.getSystemService("appops");
	//    0    0:aload_0         
	//    1    1:ldc1            #34  <String "appops">
	//    2    3:invokevirtual   #40  <Method Object Context.getSystemService(String)>
	//    3    6:checkcast       #42  <Class AppOpsManager>
	//    4    9:astore_2        
		ApplicationInfo applicationinfo = context.getApplicationInfo();
	//    5   10:aload_0         
	//    6   11:invokevirtual   #46  <Method ApplicationInfo Context.getApplicationInfo()>
	//    7   14:astore_3        
		context = ((Context) (context.getApplicationContext().getPackageName()));
	//    8   15:aload_0         
	//    9   16:invokevirtual   #50  <Method Context Context.getApplicationContext()>
	//   10   19:invokevirtual   #54  <Method String Context.getPackageName()>
	//   11   22:astore_0        
		i = applicationinfo.uid;
	//   12   23:aload_3         
	//   13   24:getfield        #60  <Field int ApplicationInfo.uid>
	//   14   27:istore_1        
		try
		{
			Class class1 = Class.forName(((Class) (android/app/AppOpsManager)).getName());
	//   15   28:ldc1            #42  <Class AppOpsManager>
	//   16   30:invokevirtual   #65  <Method String Class.getName()>
	//   17   33:invokestatic    #69  <Method Class Class.forName(String)>
	//   18   36:astore_3        
			i = ((Integer)class1.getMethod("checkOpNoThrow", new Class[] {
				Integer.TYPE, Integer.TYPE, java/lang/String
			}).invoke(((Object) (appopsmanager)), new Object[] {
				Integer.valueOf(((Integer)class1.getDeclaredField("OP_POST_NOTIFICATION").get(java/lang/Integer)).intValue()), Integer.valueOf(i), context
			})).intValue();
	//   19   37:aload_3         
	//   20   38:ldc1            #11  <String "checkOpNoThrow">
	//   21   40:iconst_3        
	//   22   41:anewarray       Class[]
	//   23   44:dup             
	//   24   45:iconst_0        
	//   25   46:getstatic       #75  <Field Class Integer.TYPE>
	//   26   49:aastore         
	//   27   50:dup             
	//   28   51:iconst_1        
	//   29   52:getstatic       #75  <Field Class Integer.TYPE>
	//   30   55:aastore         
	//   31   56:dup             
	//   32   57:iconst_2        
	//   33   58:ldc1            #77  <Class String>
	//   34   60:aastore         
	//   35   61:invokevirtual   #81  <Method Method Class.getMethod(String, Class[])>
	//   36   64:aload_2         
	//   37   65:iconst_3        
	//   38   66:anewarray       Object[]
	//   39   69:dup             
	//   40   70:iconst_0        
	//   41   71:aload_3         
	//   42   72:ldc1            #13  <String "OP_POST_NOTIFICATION">
	//   43   74:invokevirtual   #85  <Method Field Class.getDeclaredField(String)>
	//   44   77:ldc1            #71  <Class Integer>
	//   45   79:invokevirtual   #91  <Method Object Field.get(Object)>
	//   46   82:checkcast       #71  <Class Integer>
	//   47   85:invokevirtual   #95  <Method int Integer.intValue()>
	//   48   88:invokestatic    #99  <Method Integer Integer.valueOf(int)>
	//   49   91:aastore         
	//   50   92:dup             
	//   51   93:iconst_1        
	//   52   94:iload_1         
	//   53   95:invokestatic    #99  <Method Integer Integer.valueOf(int)>
	//   54   98:aastore         
	//   55   99:dup             
	//   56  100:iconst_2        
	//   57  101:aload_0         
	//   58  102:aastore         
	//   59  103:invokevirtual   #105 <Method Object Method.invoke(Object, Object[])>
	//   60  106:checkcast       #71  <Class Integer>
	//   61  109:invokevirtual   #95  <Method int Integer.intValue()>
	//   62  112:istore_1        
		}
	//*  63  113:iload_1         
	//*  64  114:ifne            119
	//*  65  117:iconst_1        
	//*  66  118:ireturn         
	//*  67  119:iconst_0        
	//*  68  120:ireturn         
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*  69  121:astore_0        
		{
			return true;
	//   70  122:iconst_1        
	//   71  123:ireturn         
		}
		return i == 0;
	}

	private static final String CHECK_OP_NO_THROW = "checkOpNoThrow";
	private static final String OP_POST_NOTIFICATION = "OP_POST_NOTIFICATION";
}
