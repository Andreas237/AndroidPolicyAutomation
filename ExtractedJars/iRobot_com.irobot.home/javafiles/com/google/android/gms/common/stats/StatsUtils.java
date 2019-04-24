// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.stats;

import android.content.Context;
import android.content.Intent;
import android.os.Process;
import android.text.TextUtils;

public class StatsUtils
{

	public StatsUtils()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #9   <Method void Object()>
	//    2    4:return          
	}

	public static String getEventKey(Context context, Intent intent)
	{
		long l = System.identityHashCode(((Object) (context)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #18  <Method int System.identityHashCode(Object)>
	//    2    4:i2l             
	//    3    5:lstore_2        
		return String.valueOf((long)System.identityHashCode(((Object) (intent))) | l << 32);
	//    4    6:aload_1         
	//    5    7:invokestatic    #18  <Method int System.identityHashCode(Object)>
	//    6   10:i2l             
	//    7   11:lload_2         
	//    8   12:bipush          32
	//    9   14:lshl            
	//   10   15:lor             
	//   11   16:invokestatic    #24  <Method String String.valueOf(long)>
	//   12   19:areturn         
	}

	public static String getEventKey(android.os.PowerManager.WakeLock wakelock, String s)
	{
		String s1 = String.valueOf(((Object) (String.valueOf((long)Process.myPid() << 32 | (long)System.identityHashCode(((Object) (wakelock)))))));
	//    0    0:invokestatic    #32  <Method int Process.myPid()>
	//    1    3:i2l             
	//    2    4:bipush          32
	//    3    6:lshl            
	//    4    7:aload_0         
	//    5    8:invokestatic    #18  <Method int System.identityHashCode(Object)>
	//    6   11:i2l             
	//    7   12:lor             
	//    8   13:invokestatic    #24  <Method String String.valueOf(long)>
	//    9   16:invokestatic    #35  <Method String String.valueOf(Object)>
	//   10   19:astore_2        
		wakelock = ((android.os.PowerManager.WakeLock) (s));
	//   11   20:aload_1         
	//   12   21:astore_0        
		if(TextUtils.isEmpty(((CharSequence) (s))))
	//*  13   22:aload_1         
	//*  14   23:invokestatic    #41  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  15   26:ifeq            32
			wakelock = "";
	//   16   29:ldc1            #43  <String "">
	//   17   31:astore_0        
		wakelock = ((android.os.PowerManager.WakeLock) (String.valueOf(((Object) (wakelock)))));
	//   18   32:aload_0         
	//   19   33:invokestatic    #35  <Method String String.valueOf(Object)>
	//   20   36:astore_0        
		if(((String) (wakelock)).length() != 0)
	//*  21   37:aload_0         
	//*  22   38:invokevirtual   #46  <Method int String.length()>
	//*  23   41:ifeq            50
			return s1.concat(((String) (wakelock)));
	//   24   44:aload_2         
	//   25   45:aload_0         
	//   26   46:invokevirtual   #50  <Method String String.concat(String)>
	//   27   49:areturn         
		else
			return new String(s1);
	//   28   50:new             #20  <Class String>
	//   29   53:dup             
	//   30   54:aload_2         
	//   31   55:invokespecial   #53  <Method void String(String)>
	//   32   58:areturn         
	}
}
