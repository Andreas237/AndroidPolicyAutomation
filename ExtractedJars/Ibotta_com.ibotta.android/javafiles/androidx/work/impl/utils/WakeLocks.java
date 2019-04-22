// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package androidx.work.impl.utils;

import android.content.Context;
import android.os.PowerManager;

public class WakeLocks
{

	public static android.os.PowerManager.WakeLock newWakeLock(Context context, String s)
	{
		context = ((Context) ((PowerManager)context.getApplicationContext().getSystemService("power")));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #17  <Method Context Context.getApplicationContext()>
	//    2    4:ldc1            #19  <String "power">
	//    3    6:invokevirtual   #23  <Method Object Context.getSystemService(String)>
	//    4    9:checkcast       #25  <Class PowerManager>
	//    5   12:astore_0        
		StringBuilder stringbuilder = new StringBuilder();
	//    6   13:new             #27  <Class StringBuilder>
	//    7   16:dup             
	//    8   17:invokespecial   #31  <Method void StringBuilder()>
	//    9   20:astore_2        
		stringbuilder.append("WorkManager: ");
	//   10   21:aload_2         
	//   11   22:ldc1            #33  <String "WorkManager: ">
	//   12   24:invokevirtual   #37  <Method StringBuilder StringBuilder.append(String)>
	//   13   27:pop             
		stringbuilder.append(s);
	//   14   28:aload_2         
	//   15   29:aload_1         
	//   16   30:invokevirtual   #37  <Method StringBuilder StringBuilder.append(String)>
	//   17   33:pop             
		return ((PowerManager) (context)).newWakeLock(1, stringbuilder.toString());
	//   18   34:aload_0         
	//   19   35:iconst_1        
	//   20   36:aload_2         
	//   21   37:invokevirtual   #41  <Method String StringBuilder.toString()>
	//   22   40:invokevirtual   #44  <Method android.os.PowerManager$WakeLock PowerManager.newWakeLock(int, String)>
	//   23   43:areturn         
	}
}
