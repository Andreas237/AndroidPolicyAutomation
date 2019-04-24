// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.app.AlarmManager;
import android.app.PendingIntent;

class AlarmManagerCompatApi21
{

	AlarmManagerCompatApi21()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	static void setAlarmClock(AlarmManager alarmmanager, long l, PendingIntent pendingintent, PendingIntent pendingintent1)
	{
		alarmmanager.setAlarmClock(new android.app.AlarmManager.AlarmClockInfo(l, pendingintent), pendingintent1);
	//    0    0:aload_0         
	//    1    1:new             #16  <Class android.app.AlarmManager$AlarmClockInfo>
	//    2    4:dup             
	//    3    5:lload_1         
	//    4    6:aload_3         
	//    5    7:invokespecial   #19  <Method void android.app.AlarmManager$AlarmClockInfo(long, PendingIntent)>
	//    6   10:aload           4
	//    7   12:invokevirtual   #24  <Method void AlarmManager.setAlarmClock(android.app.AlarmManager$AlarmClockInfo, PendingIntent)>
	//    8   15:return          
	}
}
