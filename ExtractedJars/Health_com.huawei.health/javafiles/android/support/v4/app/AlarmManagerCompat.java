// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.app.AlarmManager;
import android.app.PendingIntent;

// Referenced classes of package android.support.v4.app:
//			AlarmManagerCompatApi21, AlarmManagerCompatApi23, AlarmManagerCompatKitKat

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
	//*   0    0:getstatic       #17  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          17
		{
			AlarmManagerCompatApi21.setAlarmClock(alarmmanager, l, pendingintent, pendingintent1);
	//    3    8:aload_0         
	//    4    9:lload_1         
	//    5   10:aload_3         
	//    6   11:aload           4
	//    7   13:invokestatic    #21  <Method void AlarmManagerCompatApi21.setAlarmClock(AlarmManager, long, PendingIntent, PendingIntent)>
			return;
	//    8   16:return          
		} else
		{
			setExact(alarmmanager, 0, l, pendingintent1);
	//    9   17:aload_0         
	//   10   18:iconst_0        
	//   11   19:lload_1         
	//   12   20:aload           4
	//   13   22:invokestatic    #25  <Method void setExact(AlarmManager, int, long, PendingIntent)>
			return;
	//   14   25:return          
		}
	}

	public static void setAndAllowWhileIdle(AlarmManager alarmmanager, int i, long l, PendingIntent pendingintent)
	{
		if(android.os.Build.VERSION.SDK_INT >= 23)
	//*   0    0:getstatic       #17  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          23
	//*   2    5:icmplt          17
		{
			AlarmManagerCompatApi23.setAndAllowWhileIdle(alarmmanager, i, l, pendingintent);
	//    3    8:aload_0         
	//    4    9:iload_1         
	//    5   10:lload_2         
	//    6   11:aload           4
	//    7   13:invokestatic    #30  <Method void AlarmManagerCompatApi23.setAndAllowWhileIdle(AlarmManager, int, long, PendingIntent)>
			return;
	//    8   16:return          
		} else
		{
			alarmmanager.set(i, l, pendingintent);
	//    9   17:aload_0         
	//   10   18:iload_1         
	//   11   19:lload_2         
	//   12   20:aload           4
	//   13   22:invokevirtual   #36  <Method void AlarmManager.set(int, long, PendingIntent)>
			return;
	//   14   25:return          
		}
	}

	public static void setExact(AlarmManager alarmmanager, int i, long l, PendingIntent pendingintent)
	{
		if(android.os.Build.VERSION.SDK_INT >= 19)
	//*   0    0:getstatic       #17  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          19
	//*   2    5:icmplt          17
		{
			AlarmManagerCompatKitKat.setExact(alarmmanager, i, l, pendingintent);
	//    3    8:aload_0         
	//    4    9:iload_1         
	//    5   10:lload_2         
	//    6   11:aload           4
	//    7   13:invokestatic    #39  <Method void AlarmManagerCompatKitKat.setExact(AlarmManager, int, long, PendingIntent)>
			return;
	//    8   16:return          
		} else
		{
			alarmmanager.set(i, l, pendingintent);
	//    9   17:aload_0         
	//   10   18:iload_1         
	//   11   19:lload_2         
	//   12   20:aload           4
	//   13   22:invokevirtual   #36  <Method void AlarmManager.set(int, long, PendingIntent)>
			return;
	//   14   25:return          
		}
	}

	public static void setExactAndAllowWhileIdle(AlarmManager alarmmanager, int i, long l, PendingIntent pendingintent)
	{
		if(android.os.Build.VERSION.SDK_INT >= 23)
	//*   0    0:getstatic       #17  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          23
	//*   2    5:icmplt          17
		{
			AlarmManagerCompatApi23.setExactAndAllowWhileIdle(alarmmanager, i, l, pendingintent);
	//    3    8:aload_0         
	//    4    9:iload_1         
	//    5   10:lload_2         
	//    6   11:aload           4
	//    7   13:invokestatic    #42  <Method void AlarmManagerCompatApi23.setExactAndAllowWhileIdle(AlarmManager, int, long, PendingIntent)>
			return;
	//    8   16:return          
		} else
		{
			setExact(alarmmanager, i, l, pendingintent);
	//    9   17:aload_0         
	//   10   18:iload_1         
	//   11   19:lload_2         
	//   12   20:aload           4
	//   13   22:invokestatic    #25  <Method void setExact(AlarmManager, int, long, PendingIntent)>
			return;
	//   14   25:return          
		}
	}
}
