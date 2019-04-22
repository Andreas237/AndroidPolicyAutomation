// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package androidx.work.impl.background.systemalarm;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import androidx.work.Logger;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.model.SystemIdInfo;
import androidx.work.impl.model.SystemIdInfoDao;
import androidx.work.impl.utils.IdGenerator;

// Referenced classes of package androidx.work.impl.background.systemalarm:
//			CommandHandler

class Alarms
{

	public static void cancelAlarm(Context context, WorkManagerImpl workmanagerimpl, String s)
	{
		workmanagerimpl = ((WorkManagerImpl) (workmanagerimpl.getWorkDatabase().systemIdInfoDao()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #17  <Method WorkDatabase WorkManagerImpl.getWorkDatabase()>
	//    2    4:invokevirtual   #23  <Method SystemIdInfoDao WorkDatabase.systemIdInfoDao()>
	//    3    7:astore_1        
		SystemIdInfo systemidinfo = ((SystemIdInfoDao) (workmanagerimpl)).getSystemIdInfo(s);
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:invokeinterface #29  <Method SystemIdInfo SystemIdInfoDao.getSystemIdInfo(String)>
	//    7   15:astore_3        
		if(systemidinfo != null)
	//*   8   16:aload_3         
	//*   9   17:ifnull          58
		{
			cancelExactAlarm(context, s, systemidinfo.systemId);
	//   10   20:aload_0         
	//   11   21:aload_2         
	//   12   22:aload_3         
	//   13   23:getfield        #35  <Field int SystemIdInfo.systemId>
	//   14   26:invokestatic    #39  <Method void cancelExactAlarm(Context, String, int)>
			Logger.debug("Alarms", String.format("Removing SystemIdInfo for workSpecId (%s)", new Object[] {
				s
			}), new Throwable[0]);
	//   15   29:ldc1            #41  <String "Alarms">
	//   16   31:ldc1            #43  <String "Removing SystemIdInfo for workSpecId (%s)">
	//   17   33:iconst_1        
	//   18   34:anewarray       Object[]
	//   19   37:dup             
	//   20   38:iconst_0        
	//   21   39:aload_2         
	//   22   40:aastore         
	//   23   41:invokestatic    #49  <Method String String.format(String, Object[])>
	//   24   44:iconst_0        
	//   25   45:anewarray       Throwable[]
	//   26   48:invokestatic    #57  <Method void Logger.debug(String, String, Throwable[])>
			((SystemIdInfoDao) (workmanagerimpl)).removeSystemIdInfo(s);
	//   27   51:aload_1         
	//   28   52:aload_2         
	//   29   53:invokeinterface #61  <Method void SystemIdInfoDao.removeSystemIdInfo(String)>
		}
	//   30   58:return          
	}

	private static void cancelExactAlarm(Context context, String s, int i)
	{
		AlarmManager alarmmanager = (AlarmManager)context.getSystemService("alarm");
	//    0    0:aload_0         
	//    1    1:ldc1            #65  <String "alarm">
	//    2    3:invokevirtual   #71  <Method Object Context.getSystemService(String)>
	//    3    6:checkcast       #73  <Class AlarmManager>
	//    4    9:astore_3        
		context = ((Context) (PendingIntent.getService(context, i, CommandHandler.createDelayMetIntent(context, s), 0x20000000)));
	//    5   10:aload_0         
	//    6   11:iload_2         
	//    7   12:aload_0         
	//    8   13:aload_1         
	//    9   14:invokestatic    #79  <Method android.content.Intent CommandHandler.createDelayMetIntent(Context, String)>
	//   10   17:ldc1            #80  <Int 0x20000000>
	//   11   19:invokestatic    #86  <Method PendingIntent PendingIntent.getService(Context, int, android.content.Intent, int)>
	//   12   22:astore_0        
		if(context != null && alarmmanager != null)
	//*  13   23:aload_0         
	//*  14   24:ifnull          65
	//*  15   27:aload_3         
	//*  16   28:ifnull          65
		{
			Logger.debug("Alarms", String.format("Cancelling existing alarm with (workSpecId, systemId) (%s, %s)", new Object[] {
				s, Integer.valueOf(i)
			}), new Throwable[0]);
	//   17   31:ldc1            #41  <String "Alarms">
	//   18   33:ldc1            #88  <String "Cancelling existing alarm with (workSpecId, systemId) (%s, %s)">
	//   19   35:iconst_2        
	//   20   36:anewarray       Object[]
	//   21   39:dup             
	//   22   40:iconst_0        
	//   23   41:aload_1         
	//   24   42:aastore         
	//   25   43:dup             
	//   26   44:iconst_1        
	//   27   45:iload_2         
	//   28   46:invokestatic    #94  <Method Integer Integer.valueOf(int)>
	//   29   49:aastore         
	//   30   50:invokestatic    #49  <Method String String.format(String, Object[])>
	//   31   53:iconst_0        
	//   32   54:anewarray       Throwable[]
	//   33   57:invokestatic    #57  <Method void Logger.debug(String, String, Throwable[])>
			alarmmanager.cancel(((PendingIntent) (context)));
	//   34   60:aload_3         
	//   35   61:aload_0         
	//   36   62:invokevirtual   #98  <Method void AlarmManager.cancel(PendingIntent)>
		}
	//   37   65:return          
	}

	public static void setAlarm(Context context, WorkManagerImpl workmanagerimpl, String s, long l)
	{
		workmanagerimpl = ((WorkManagerImpl) (workmanagerimpl.getWorkDatabase().systemIdInfoDao()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #17  <Method WorkDatabase WorkManagerImpl.getWorkDatabase()>
	//    2    4:invokevirtual   #23  <Method SystemIdInfoDao WorkDatabase.systemIdInfoDao()>
	//    3    7:astore_1        
		SystemIdInfo systemidinfo = ((SystemIdInfoDao) (workmanagerimpl)).getSystemIdInfo(s);
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:invokeinterface #29  <Method SystemIdInfo SystemIdInfoDao.getSystemIdInfo(String)>
	//    7   15:astore          6
		if(systemidinfo != null)
	//*   8   17:aload           6
	//*   9   19:ifnull          44
		{
			cancelExactAlarm(context, s, systemidinfo.systemId);
	//   10   22:aload_0         
	//   11   23:aload_2         
	//   12   24:aload           6
	//   13   26:getfield        #35  <Field int SystemIdInfo.systemId>
	//   14   29:invokestatic    #39  <Method void cancelExactAlarm(Context, String, int)>
			setExactAlarm(context, s, systemidinfo.systemId, l);
	//   15   32:aload_0         
	//   16   33:aload_2         
	//   17   34:aload           6
	//   18   36:getfield        #35  <Field int SystemIdInfo.systemId>
	//   19   39:lload_3         
	//   20   40:invokestatic    #104 <Method void setExactAlarm(Context, String, int, long)>
			return;
	//   21   43:return          
		} else
		{
			int i = (new IdGenerator(context)).nextAlarmManagerId();
	//   22   44:new             #106 <Class IdGenerator>
	//   23   47:dup             
	//   24   48:aload_0         
	//   25   49:invokespecial   #110 <Method void IdGenerator(Context)>
	//   26   52:invokevirtual   #114 <Method int IdGenerator.nextAlarmManagerId()>
	//   27   55:istore          5
			((SystemIdInfoDao) (workmanagerimpl)).insertSystemIdInfo(new SystemIdInfo(s, i));
	//   28   57:aload_1         
	//   29   58:new             #31  <Class SystemIdInfo>
	//   30   61:dup             
	//   31   62:aload_2         
	//   32   63:iload           5
	//   33   65:invokespecial   #117 <Method void SystemIdInfo(String, int)>
	//   34   68:invokeinterface #121 <Method void SystemIdInfoDao.insertSystemIdInfo(SystemIdInfo)>
			setExactAlarm(context, s, i, l);
	//   35   73:aload_0         
	//   36   74:aload_2         
	//   37   75:iload           5
	//   38   77:lload_3         
	//   39   78:invokestatic    #104 <Method void setExactAlarm(Context, String, int, long)>
			return;
	//   40   81:return          
		}
	}

	private static void setExactAlarm(Context context, String s, int i, long l)
	{
		AlarmManager alarmmanager = (AlarmManager)context.getSystemService("alarm");
	//    0    0:aload_0         
	//    1    1:ldc1            #65  <String "alarm">
	//    2    3:invokevirtual   #71  <Method Object Context.getSystemService(String)>
	//    3    6:checkcast       #73  <Class AlarmManager>
	//    4    9:astore          5
		context = ((Context) (PendingIntent.getService(context, i, CommandHandler.createDelayMetIntent(context, s), 0x40000000)));
	//    5   11:aload_0         
	//    6   12:iload_2         
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:invokestatic    #79  <Method android.content.Intent CommandHandler.createDelayMetIntent(Context, String)>
	//   10   18:ldc1            #122 <Int 0x40000000>
	//   11   20:invokestatic    #86  <Method PendingIntent PendingIntent.getService(Context, int, android.content.Intent, int)>
	//   12   23:astore_0        
		if(alarmmanager != null)
	//*  13   24:aload           5
	//*  14   26:ifnull          54
		{
			if(android.os.Build.VERSION.SDK_INT >= 19)
	//*  15   29:getstatic       #127 <Field int android.os.Build$VERSION.SDK_INT>
	//*  16   32:bipush          19
	//*  17   34:icmplt          46
			{
				alarmmanager.setExact(0, l, ((PendingIntent) (context)));
	//   18   37:aload           5
	//   19   39:iconst_0        
	//   20   40:lload_3         
	//   21   41:aload_0         
	//   22   42:invokevirtual   #131 <Method void AlarmManager.setExact(int, long, PendingIntent)>
				return;
	//   23   45:return          
			}
			alarmmanager.set(0, l, ((PendingIntent) (context)));
	//   24   46:aload           5
	//   25   48:iconst_0        
	//   26   49:lload_3         
	//   27   50:aload_0         
	//   28   51:invokevirtual   #134 <Method void AlarmManager.set(int, long, PendingIntent)>
		}
	//   29   54:return          
	}
}
