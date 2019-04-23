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

	private Alarms()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void Object()>
	//    2    4:return          
	}

	public static void cancelAlarm(Context context, WorkManagerImpl workmanagerimpl, String s)
	{
		workmanagerimpl = ((WorkManagerImpl) (workmanagerimpl.getWorkDatabase().systemIdInfoDao()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #35  <Method WorkDatabase WorkManagerImpl.getWorkDatabase()>
	//    2    4:invokevirtual   #41  <Method SystemIdInfoDao WorkDatabase.systemIdInfoDao()>
	//    3    7:astore_1        
		SystemIdInfo systemidinfo = ((SystemIdInfoDao) (workmanagerimpl)).getSystemIdInfo(s);
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:invokeinterface #47  <Method SystemIdInfo SystemIdInfoDao.getSystemIdInfo(String)>
	//    7   15:astore_3        
		if(systemidinfo != null)
	//*   8   16:aload_3         
	//*   9   17:ifnull          62
		{
			cancelExactAlarm(context, s, systemidinfo.systemId);
	//   10   20:aload_0         
	//   11   21:aload_2         
	//   12   22:aload_3         
	//   13   23:getfield        #53  <Field int SystemIdInfo.systemId>
	//   14   26:invokestatic    #57  <Method void cancelExactAlarm(Context, String, int)>
			Logger.get().debug(TAG, String.format("Removing SystemIdInfo for workSpecId (%s)", new Object[] {
				s
			}), new Throwable[0]);
	//   15   29:invokestatic    #61  <Method Logger Logger.get()>
	//   16   32:getstatic       #22  <Field String TAG>
	//   17   35:ldc1            #63  <String "Removing SystemIdInfo for workSpecId (%s)">
	//   18   37:iconst_1        
	//   19   38:anewarray       Object[]
	//   20   41:dup             
	//   21   42:iconst_0        
	//   22   43:aload_2         
	//   23   44:aastore         
	//   24   45:invokestatic    #69  <Method String String.format(String, Object[])>
	//   25   48:iconst_0        
	//   26   49:anewarray       Throwable[]
	//   27   52:invokevirtual   #75  <Method void Logger.debug(String, String, Throwable[])>
			((SystemIdInfoDao) (workmanagerimpl)).removeSystemIdInfo(s);
	//   28   55:aload_1         
	//   29   56:aload_2         
	//   30   57:invokeinterface #79  <Method void SystemIdInfoDao.removeSystemIdInfo(String)>
		}
	//   31   62:return          
	}

	private static void cancelExactAlarm(Context context, String s, int i)
	{
		AlarmManager alarmmanager = (AlarmManager)context.getSystemService("alarm");
	//    0    0:aload_0         
	//    1    1:ldc1            #82  <String "alarm">
	//    2    3:invokevirtual   #88  <Method Object Context.getSystemService(String)>
	//    3    6:checkcast       #90  <Class AlarmManager>
	//    4    9:astore_3        
		context = ((Context) (PendingIntent.getService(context, i, CommandHandler.createDelayMetIntent(context, s), 0x20000000)));
	//    5   10:aload_0         
	//    6   11:iload_2         
	//    7   12:aload_0         
	//    8   13:aload_1         
	//    9   14:invokestatic    #96  <Method android.content.Intent CommandHandler.createDelayMetIntent(Context, String)>
	//   10   17:ldc1            #97  <Int 0x20000000>
	//   11   19:invokestatic    #103 <Method PendingIntent PendingIntent.getService(Context, int, android.content.Intent, int)>
	//   12   22:astore_0        
		if(context != null && alarmmanager != null)
	//*  13   23:aload_0         
	//*  14   24:ifnull          69
	//*  15   27:aload_3         
	//*  16   28:ifnull          69
		{
			Logger.get().debug(TAG, String.format("Cancelling existing alarm with (workSpecId, systemId) (%s, %s)", new Object[] {
				s, Integer.valueOf(i)
			}), new Throwable[0]);
	//   17   31:invokestatic    #61  <Method Logger Logger.get()>
	//   18   34:getstatic       #22  <Field String TAG>
	//   19   37:ldc1            #105 <String "Cancelling existing alarm with (workSpecId, systemId) (%s, %s)">
	//   20   39:iconst_2        
	//   21   40:anewarray       Object[]
	//   22   43:dup             
	//   23   44:iconst_0        
	//   24   45:aload_1         
	//   25   46:aastore         
	//   26   47:dup             
	//   27   48:iconst_1        
	//   28   49:iload_2         
	//   29   50:invokestatic    #111 <Method Integer Integer.valueOf(int)>
	//   30   53:aastore         
	//   31   54:invokestatic    #69  <Method String String.format(String, Object[])>
	//   32   57:iconst_0        
	//   33   58:anewarray       Throwable[]
	//   34   61:invokevirtual   #75  <Method void Logger.debug(String, String, Throwable[])>
			alarmmanager.cancel(((PendingIntent) (context)));
	//   35   64:aload_3         
	//   36   65:aload_0         
	//   37   66:invokevirtual   #115 <Method void AlarmManager.cancel(PendingIntent)>
		}
	//   38   69:return          
	}

	public static void setAlarm(Context context, WorkManagerImpl workmanagerimpl, String s, long l)
	{
		workmanagerimpl = ((WorkManagerImpl) (workmanagerimpl.getWorkDatabase().systemIdInfoDao()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #35  <Method WorkDatabase WorkManagerImpl.getWorkDatabase()>
	//    2    4:invokevirtual   #41  <Method SystemIdInfoDao WorkDatabase.systemIdInfoDao()>
	//    3    7:astore_1        
		SystemIdInfo systemidinfo = ((SystemIdInfoDao) (workmanagerimpl)).getSystemIdInfo(s);
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:invokeinterface #47  <Method SystemIdInfo SystemIdInfoDao.getSystemIdInfo(String)>
	//    7   15:astore          6
		if(systemidinfo != null)
	//*   8   17:aload           6
	//*   9   19:ifnull          44
		{
			cancelExactAlarm(context, s, systemidinfo.systemId);
	//   10   22:aload_0         
	//   11   23:aload_2         
	//   12   24:aload           6
	//   13   26:getfield        #53  <Field int SystemIdInfo.systemId>
	//   14   29:invokestatic    #57  <Method void cancelExactAlarm(Context, String, int)>
			setExactAlarm(context, s, systemidinfo.systemId, l);
	//   15   32:aload_0         
	//   16   33:aload_2         
	//   17   34:aload           6
	//   18   36:getfield        #53  <Field int SystemIdInfo.systemId>
	//   19   39:lload_3         
	//   20   40:invokestatic    #121 <Method void setExactAlarm(Context, String, int, long)>
			return;
	//   21   43:return          
		} else
		{
			int i = (new IdGenerator(context)).nextAlarmManagerId();
	//   22   44:new             #123 <Class IdGenerator>
	//   23   47:dup             
	//   24   48:aload_0         
	//   25   49:invokespecial   #126 <Method void IdGenerator(Context)>
	//   26   52:invokevirtual   #130 <Method int IdGenerator.nextAlarmManagerId()>
	//   27   55:istore          5
			((SystemIdInfoDao) (workmanagerimpl)).insertSystemIdInfo(new SystemIdInfo(s, i));
	//   28   57:aload_1         
	//   29   58:new             #49  <Class SystemIdInfo>
	//   30   61:dup             
	//   31   62:aload_2         
	//   32   63:iload           5
	//   33   65:invokespecial   #133 <Method void SystemIdInfo(String, int)>
	//   34   68:invokeinterface #137 <Method void SystemIdInfoDao.insertSystemIdInfo(SystemIdInfo)>
			setExactAlarm(context, s, i, l);
	//   35   73:aload_0         
	//   36   74:aload_2         
	//   37   75:iload           5
	//   38   77:lload_3         
	//   39   78:invokestatic    #121 <Method void setExactAlarm(Context, String, int, long)>
			return;
	//   40   81:return          
		}
	}

	private static void setExactAlarm(Context context, String s, int i, long l)
	{
		AlarmManager alarmmanager = (AlarmManager)context.getSystemService("alarm");
	//    0    0:aload_0         
	//    1    1:ldc1            #82  <String "alarm">
	//    2    3:invokevirtual   #88  <Method Object Context.getSystemService(String)>
	//    3    6:checkcast       #90  <Class AlarmManager>
	//    4    9:astore          5
		context = ((Context) (PendingIntent.getService(context, i, CommandHandler.createDelayMetIntent(context, s), 0x40000000)));
	//    5   11:aload_0         
	//    6   12:iload_2         
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:invokestatic    #96  <Method android.content.Intent CommandHandler.createDelayMetIntent(Context, String)>
	//   10   18:ldc1            #138 <Int 0x40000000>
	//   11   20:invokestatic    #103 <Method PendingIntent PendingIntent.getService(Context, int, android.content.Intent, int)>
	//   12   23:astore_0        
		if(alarmmanager != null)
	//*  13   24:aload           5
	//*  14   26:ifnull          54
		{
			if(android.os.Build.VERSION.SDK_INT >= 19)
	//*  15   29:getstatic       #143 <Field int android.os.Build$VERSION.SDK_INT>
	//*  16   32:bipush          19
	//*  17   34:icmplt          46
			{
				alarmmanager.setExact(0, l, ((PendingIntent) (context)));
	//   18   37:aload           5
	//   19   39:iconst_0        
	//   20   40:lload_3         
	//   21   41:aload_0         
	//   22   42:invokevirtual   #147 <Method void AlarmManager.setExact(int, long, PendingIntent)>
				return;
	//   23   45:return          
			}
			alarmmanager.set(0, l, ((PendingIntent) (context)));
	//   24   46:aload           5
	//   25   48:iconst_0        
	//   26   49:lload_3         
	//   27   50:aload_0         
	//   28   51:invokevirtual   #150 <Method void AlarmManager.set(int, long, PendingIntent)>
		}
	//   29   54:return          
	}

	private static final String TAG = Logger.tagWithPrefix("Alarms");

	static 
	{
	//    0    0:ldc1            #14  <String "Alarms">
	//    1    2:invokestatic    #20  <Method String Logger.tagWithPrefix(String)>
	//    2    5:putstatic       #22  <Field String TAG>
	//*   3    8:return          
	}
}
