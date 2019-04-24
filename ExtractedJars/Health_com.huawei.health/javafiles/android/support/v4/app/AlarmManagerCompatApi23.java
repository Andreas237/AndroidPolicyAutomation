// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.app.AlarmManager;
import android.app.PendingIntent;

class AlarmManagerCompatApi23
{

	AlarmManagerCompatApi23()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	static void setAndAllowWhileIdle(AlarmManager alarmmanager, int i, long l, PendingIntent pendingintent)
	{
		alarmmanager.setAndAllowWhileIdle(i, l, pendingintent);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:lload_2         
	//    3    3:aload           4
	//    4    5:invokevirtual   #19  <Method void AlarmManager.setAndAllowWhileIdle(int, long, PendingIntent)>
	//    5    8:return          
	}

	static void setExactAndAllowWhileIdle(AlarmManager alarmmanager, int i, long l, PendingIntent pendingintent)
	{
		alarmmanager.setExactAndAllowWhileIdle(i, l, pendingintent);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:lload_2         
	//    3    3:aload           4
	//    4    5:invokevirtual   #22  <Method void AlarmManager.setExactAndAllowWhileIdle(int, long, PendingIntent)>
	//    5    8:return          
	}
}
