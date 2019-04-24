// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.pactforcure.app.tip;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.pactforcure.app.participant.Participant;
import com.pactforcure.app.participant.ParticipantStorage;
import java.util.Calendar;
import java.util.Date;
import org.apache.commons.lang3.time.DateUtils;

// Referenced classes of package com.pactforcure.app.tip:
//			TipOfTheWeekContentFetcher, TipOfTheWeekAlarmReceiver

public class TipOfTheWeekNotificationScheduler
{

	public TipOfTheWeekNotificationScheduler()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	private static long DEBUG_getNextSundayEightPm()
	{
		Calendar calendar = Calendar.getInstance();
	//    0    0:invokestatic    #20  <Method Calendar Calendar.getInstance()>
	//    1    3:astore_0        
		calendar.add(12, 1);
	//    2    4:aload_0         
	//    3    5:bipush          12
	//    4    7:iconst_1        
	//    5    8:invokevirtual   #24  <Method void Calendar.add(int, int)>
		return calendar.getTimeInMillis();
	//    6   11:aload_0         
	//    7   12:invokevirtual   #27  <Method long Calendar.getTimeInMillis()>
	//    8   15:lreturn         
	}

	public static Date getNextSundayEightPm()
	{
		return getNextSundayEightPm(Calendar.getInstance());
	//    0    0:invokestatic    #20  <Method Calendar Calendar.getInstance()>
	//    1    3:invokestatic    #32  <Method Date getNextSundayEightPm(Calendar)>
	//    2    6:areturn         
	}

	public static Date getNextSundayEightPm(Calendar calendar)
	{
		Calendar calendar1;
		calendar1 = Calendar.getInstance();
	//    0    0:invokestatic    #20  <Method Calendar Calendar.getInstance()>
	//    1    3:astore_1        
		calendar1.setTime(calendar.getTime());
	//    2    4:aload_1         
	//    3    5:aload_0         
	//    4    6:invokevirtual   #35  <Method Date Calendar.getTime()>
	//    5    9:invokevirtual   #39  <Method void Calendar.setTime(Date)>
		calendar1.set(7, 1);
	//    6   12:aload_1         
	//    7   13:bipush          7
	//    8   15:iconst_1        
	//    9   16:invokevirtual   #42  <Method void Calendar.set(int, int)>
		calendar1.set(11, 20);
	//   10   19:aload_1         
	//   11   20:bipush          11
	//   12   22:bipush          20
	//   13   24:invokevirtual   #42  <Method void Calendar.set(int, int)>
		calendar1.set(12, 0);
	//   14   27:aload_1         
	//   15   28:bipush          12
	//   16   30:iconst_0        
	//   17   31:invokevirtual   #42  <Method void Calendar.set(int, int)>
		calendar1.set(13, 0);
	//   18   34:aload_1         
	//   19   35:bipush          13
	//   20   37:iconst_0        
	//   21   38:invokevirtual   #42  <Method void Calendar.set(int, int)>
		if(DateUtils.isSameDay(calendar1, calendar)) goto _L2; else goto _L1
	//   22   41:aload_1         
	//   23   42:aload_0         
	//   24   43:invokestatic    #48  <Method boolean DateUtils.isSameDay(Calendar, Calendar)>
	//   25   46:ifne            62
_L1:
		calendar1.add(6, 7);
	//   26   49:aload_1         
	//   27   50:bipush          6
	//   28   52:bipush          7
	//   29   54:invokevirtual   #24  <Method void Calendar.add(int, int)>
_L4:
		return calendar1.getTime();
	//   30   57:aload_1         
	//   31   58:invokevirtual   #35  <Method Date Calendar.getTime()>
	//   32   61:areturn         
_L2:
		if(calendar.after(((Object) (calendar1))) || Math.abs(calendar.getTimeInMillis() - calendar1.getTimeInMillis()) <= 100L)
	//*  33   62:aload_0         
	//*  34   63:aload_1         
	//*  35   64:invokevirtual   #52  <Method boolean Calendar.after(Object)>
	//*  36   67:ifne            89
	//*  37   70:aload_0         
	//*  38   71:invokevirtual   #27  <Method long Calendar.getTimeInMillis()>
	//*  39   74:aload_1         
	//*  40   75:invokevirtual   #27  <Method long Calendar.getTimeInMillis()>
	//*  41   78:lsub            
	//*  42   79:invokestatic    #58  <Method long Math.abs(long)>
	//*  43   82:ldc2w           #59  <Long 100L>
	//*  44   85:lcmp            
	//*  45   86:ifgt            57
			calendar1.add(6, 7);
	//   46   89:aload_1         
	//   47   90:bipush          6
	//   48   92:bipush          7
	//   49   94:invokevirtual   #24  <Method void Calendar.add(int, int)>
		if(true) goto _L4; else goto _L3
	//   50   97:goto            57
_L3:
	}

	public static void scheduleNextNotificationIfNecessaryAndPossible(Context context)
	{
		Participant participant;
		participant = ParticipantStorage.getParticipant();
	//    0    0:invokestatic    #68  <Method Participant ParticipantStorage.getParticipant()>
	//    1    3:astore          4
		break MISSING_BLOCK_LABEL_5;
		if(participant != null && participant.getSignedPDF() != null)
	//*   2    5:aload           4
	//*   3    7:ifnonnull       11
	//*   4   10:return          
	//*   5   11:aload           4
	//*   6   13:invokevirtual   #73  <Method Date Participant.getSignedPDF()>
	//*   7   16:ifnull          10
		{
			int i = TipOfTheWeekContentFetcher.getNumberOfDeliveredTips();
	//    8   19:invokestatic    #79  <Method int TipOfTheWeekContentFetcher.getNumberOfDeliveredTips()>
	//    9   22:istore_1        
			if(i < 40)
	//*  10   23:iload_1         
	//*  11   24:bipush          40
	//*  12   26:icmpge          10
			{
				Object obj = ((Object) (new Intent(context, com/pactforcure/app/tip/TipOfTheWeekAlarmReceiver)));
	//   13   29:new             #81  <Class Intent>
	//   14   32:dup             
	//   15   33:aload_0         
	//   16   34:ldc1            #83  <Class TipOfTheWeekAlarmReceiver>
	//   17   36:invokespecial   #86  <Method void Intent(Context, Class)>
	//   18   39:astore          4
				((Intent) (obj)).putExtra("TIP_INDEX", i + 1);
	//   19   41:aload           4
	//   20   43:ldc1            #7   <String "TIP_INDEX">
	//   21   45:iload_1         
	//   22   46:iconst_1        
	//   23   47:iadd            
	//   24   48:invokevirtual   #90  <Method Intent Intent.putExtra(String, int)>
	//   25   51:pop             
				long l = getNextSundayEightPm().getTime();
	//   26   52:invokestatic    #92  <Method Date getNextSundayEightPm()>
	//   27   55:invokevirtual   #96  <Method long Date.getTime()>
	//   28   58:lstore_2        
				obj = ((Object) (PendingIntent.getBroadcast(context, 0, ((Intent) (obj)), 0x8000000)));
	//   29   59:aload_0         
	//   30   60:iconst_0        
	//   31   61:aload           4
	//   32   63:ldc1            #97  <Int 0x8000000>
	//   33   65:invokestatic    #103 <Method PendingIntent PendingIntent.getBroadcast(Context, int, Intent, int)>
	//   34   68:astore          4
				((AlarmManager)context.getSystemService("alarm")).set(0, l, ((PendingIntent) (obj)));
	//   35   70:aload_0         
	//   36   71:ldc1            #105 <String "alarm">
	//   37   73:invokevirtual   #111 <Method Object Context.getSystemService(String)>
	//   38   76:checkcast       #113 <Class AlarmManager>
	//   39   79:iconst_0        
	//   40   80:lload_2         
	//   41   81:aload           4
	//   42   83:invokevirtual   #116 <Method void AlarmManager.set(int, long, PendingIntent)>
				return;
	//   43   86:return          
			}
		}
		return;
	}

	public static final String TIP_INDEX = "TIP_INDEX";
}
