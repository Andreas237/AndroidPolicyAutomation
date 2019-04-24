// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.app.AlarmManager;
import android.app.PendingIntent;

public final class AlarmManagerCompat
{

	private AlarmManagerCompat()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public static void setAlarmClock(AlarmManager alarmmanager, long l, PendingIntent pendingintent, PendingIntent pendingintent1)
	{
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:getstatic       #18  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          24
		{
			alarmmanager.setAlarmClock(new android.app.AlarmManager.AlarmClockInfo(l, pendingintent), pendingintent1);
	//    3    8:aload_0         
	//    4    9:new             #20  <Class android.app.AlarmManager$AlarmClockInfo>
	//    5   12:dup             
	//    6   13:lload_1         
	//    7   14:aload_3         
	//    8   15:invokespecial   #23  <Method void android.app.AlarmManager$AlarmClockInfo(long, PendingIntent)>
	//    9   18:aload           4
	//   10   20:invokevirtual   #28  <Method void AlarmManager.setAlarmClock(android.app.AlarmManager$AlarmClockInfo, PendingIntent)>
			return;
	//   11   23:return          
		} else
		{
			setExact(alarmmanager, 0, l, pendingintent1);
	//   12   24:aload_0         
	//   13   25:iconst_0        
	//   14   26:lload_1         
	//   15   27:aload           4
	//   16   29:invokestatic    #32  <Method void setExact(AlarmManager, int, long, PendingIntent)>
			return;
	//   17   32:return          
		}
	}

	public static void setAndAllowWhileIdle(AlarmManager alarmmanager, int i, long l, PendingIntent pendingintent)
	{
		if(android.os.Build.VERSION.SDK_INT >= 23)
	//*   0    0:getstatic       #18  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          23
	//*   2    5:icmplt          17
		{
			alarmmanager.setAndAllowWhileIdle(i, l, pendingintent);
	//    3    8:aload_0         
	//    4    9:iload_1         
	//    5   10:lload_2         
	//    6   11:aload           4
	//    7   13:invokevirtual   #37  <Method void AlarmManager.setAndAllowWhileIdle(int, long, PendingIntent)>
			return;
	//    8   16:return          
		} else
		{
			alarmmanager.set(i, l, pendingintent);
	//    9   17:aload_0         
	//   10   18:iload_1         
	//   11   19:lload_2         
	//   12   20:aload           4
	//   13   22:invokevirtual   #40  <Method void AlarmManager.set(int, long, PendingIntent)>
			return;
	//   14   25:return          
		}
	}

	public static void setExact(AlarmManager alarmmanager, int i, long l, PendingIntent pendingintent)
	{
		if(android.os.Build.VERSION.SDK_INT >= 19)
	//*   0    0:getstatic       #18  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          19
	//*   2    5:icmplt          17
		{
			alarmmanager.setExact(i, l, pendingintent);
	//    3    8:aload_0         
	//    4    9:iload_1         
	//    5   10:lload_2         
	//    6   11:aload           4
	//    7   13:invokevirtual   #42  <Method void AlarmManager.setExact(int, long, PendingIntent)>
			return;
	//    8   16:return          
		} else
		{
			alarmmanager.set(i, l, pendingintent);
	//    9   17:aload_0         
	//   10   18:iload_1         
	//   11   19:lload_2         
	//   12   20:aload           4
	//   13   22:invokevirtual   #40  <Method void AlarmManager.set(int, long, PendingIntent)>
			return;
	//   14   25:return          
		}
	}

	public static void setExactAndAllowWhileIdle(AlarmManager alarmmanager, int i, long l, PendingIntent pendingintent)
	{
		if(android.os.Build.VERSION.SDK_INT >= 23)
	//*   0    0:getstatic       #18  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          23
	//*   2    5:icmplt          17
		{
			alarmmanager.setExactAndAllowWhileIdle(i, l, pendingintent);
	//    3    8:aload_0         
	//    4    9:iload_1         
	//    5   10:lload_2         
	//    6   11:aload           4
	//    7   13:invokevirtual   #45  <Method void AlarmManager.setExactAndAllowWhileIdle(int, long, PendingIntent)>
			return;
	//    8   16:return          
		} else
		{
			setExact(alarmmanager, i, l, pendingintent);
	//    9   17:aload_0         
	//   10   18:iload_1         
	//   11   19:lload_2         
	//   12   20:aload           4
	//   13   22:invokestatic    #32  <Method void setExact(AlarmManager, int, long, PendingIntent)>
			return;
	//   14   25:return          
		}
	}
}
