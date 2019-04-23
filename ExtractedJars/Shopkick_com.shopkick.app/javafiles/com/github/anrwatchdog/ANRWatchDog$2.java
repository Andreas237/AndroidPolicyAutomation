// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.anrwatchdog;

import android.util.Log;

// Referenced classes of package com.github.anrwatchdog:
//			ANRWatchDog

static final class ANRWatchDog$2
	implements terruptionListener
{

	public void onInterrupted(InterruptedException interruptedexception)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #17  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #18  <Method void StringBuilder()>
	//    3    7:astore_2        
		stringbuilder.append("Interrupted: ");
	//    4    8:aload_2         
	//    5    9:ldc1            #20  <String "Interrupted: ">
	//    6   11:invokevirtual   #24  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(interruptedexception.getMessage());
	//    8   15:aload_2         
	//    9   16:aload_1         
	//   10   17:invokevirtual   #30  <Method String InterruptedException.getMessage()>
	//   11   20:invokevirtual   #24  <Method StringBuilder StringBuilder.append(String)>
	//   12   23:pop             
		Log.w("ANRWatchdog", stringbuilder.toString());
	//   13   24:ldc1            #32  <String "ANRWatchdog">
	//   14   26:aload_2         
	//   15   27:invokevirtual   #35  <Method String StringBuilder.toString()>
	//   16   30:invokestatic    #41  <Method int Log.w(String, String)>
	//   17   33:pop             
	//   18   34:return          
	}

	ANRWatchDog$2()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
	//    2    4:return          
	}
}
