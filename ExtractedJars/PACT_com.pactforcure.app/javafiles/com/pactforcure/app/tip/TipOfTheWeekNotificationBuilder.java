// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.pactforcure.app.tip;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.TaskStackBuilder;
import com.pactforcure.app.core.BackboneApplication;
import com.pactforcure.app.studies.Res;
import com.pactforcure.app.ui.TipOfTheWeekResourceActivity;

// Referenced classes of package com.pactforcure.app.tip:
//			TipOfTheWeekContentFetcher

public class TipOfTheWeekNotificationBuilder
{

	public TipOfTheWeekNotificationBuilder()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	public static Notification build(int i)
	{
		if(i <= 0 || i > 40)
	//*   0    0:iload_0         
	//*   1    1:ifle            10
	//*   2    4:iload_0         
	//*   3    5:bipush          40
	//*   4    7:icmple          37
		{
			throw new IllegalArgumentException((new StringBuilder()).append("invalid tip index: ").append(i).toString());
	//    5   10:new             #16  <Class IllegalArgumentException>
	//    6   13:dup             
	//    7   14:new             #18  <Class StringBuilder>
	//    8   17:dup             
	//    9   18:invokespecial   #19  <Method void StringBuilder()>
	//   10   21:ldc1            #21  <String "invalid tip index: ">
	//   11   23:invokevirtual   #25  <Method StringBuilder StringBuilder.append(String)>
	//   12   26:iload_0         
	//   13   27:invokevirtual   #28  <Method StringBuilder StringBuilder.append(int)>
	//   14   30:invokevirtual   #32  <Method String StringBuilder.toString()>
	//   15   33:invokespecial   #35  <Method void IllegalArgumentException(String)>
	//   16   36:athrow          
		} else
		{
			BackboneApplication backboneapplication = BackboneApplication.get();
	//   17   37:invokestatic    #41  <Method BackboneApplication BackboneApplication.get()>
	//   18   40:astore_1        
			Object obj = ((Object) (getIntent(((Context) (backboneapplication)))));
	//   19   41:aload_1         
	//   20   42:invokestatic    #45  <Method Intent getIntent(Context)>
	//   21   45:astore_2        
			obj = ((Object) (TaskStackBuilder.create(((Context) (backboneapplication))).addNextIntentWithParentStack(((Intent) (obj))).getPendingIntent(0, 0x8000000)));
	//   22   46:aload_1         
	//   23   47:invokestatic    #51  <Method TaskStackBuilder TaskStackBuilder.create(Context)>
	//   24   50:aload_2         
	//   25   51:invokevirtual   #55  <Method TaskStackBuilder TaskStackBuilder.addNextIntentWithParentStack(Intent)>
	//   26   54:iconst_0        
	//   27   55:ldc1            #56  <Int 0x8000000>
	//   28   57:invokevirtual   #60  <Method android.app.PendingIntent TaskStackBuilder.getPendingIntent(int, int)>
	//   29   60:astore_2        
			String s = Res.getStudySpecificString(0x7f08036d);
	//   30   61:ldc1            #61  <Int 0x7f08036d>
	//   31   63:invokestatic    #67  <Method String Res.getStudySpecificString(int)>
	//   32   66:astore_3        
			String s1 = TipOfTheWeekContentFetcher.getTipContent(i);
	//   33   67:iload_0         
	//   34   68:invokestatic    #72  <Method String TipOfTheWeekContentFetcher.getTipContent(int)>
	//   35   71:astore          4
			return (new android.support.v4.app.NotificationCompat.Builder(((Context) (backboneapplication)))).setSmallIcon(0x7f020080).setContentTitle(((CharSequence) (s))).setContentText(((CharSequence) (s1))).setStyle(((android.support.v4.app.NotificationCompat.Style) ((new android.support.v4.app.NotificationCompat.BigTextStyle()).bigText(((CharSequence) (s1)))))).setContentIntent(((android.app.PendingIntent) (obj))).setDefaults(7).build();
	//   36   73:new             #74  <Class android.support.v4.app.NotificationCompat$Builder>
	//   37   76:dup             
	//   38   77:aload_1         
	//   39   78:invokespecial   #77  <Method void android.support.v4.app.NotificationCompat$Builder(Context)>
	//   40   81:ldc1            #78  <Int 0x7f020080>
	//   41   83:invokevirtual   #82  <Method android.support.v4.app.NotificationCompat$Builder android.support.v4.app.NotificationCompat$Builder.setSmallIcon(int)>
	//   42   86:aload_3         
	//   43   87:invokevirtual   #86  <Method android.support.v4.app.NotificationCompat$Builder android.support.v4.app.NotificationCompat$Builder.setContentTitle(CharSequence)>
	//   44   90:aload           4
	//   45   92:invokevirtual   #89  <Method android.support.v4.app.NotificationCompat$Builder android.support.v4.app.NotificationCompat$Builder.setContentText(CharSequence)>
	//   46   95:new             #91  <Class android.support.v4.app.NotificationCompat$BigTextStyle>
	//   47   98:dup             
	//   48   99:invokespecial   #92  <Method void android.support.v4.app.NotificationCompat$BigTextStyle()>
	//   49  102:aload           4
	//   50  104:invokevirtual   #96  <Method android.support.v4.app.NotificationCompat$BigTextStyle android.support.v4.app.NotificationCompat$BigTextStyle.bigText(CharSequence)>
	//   51  107:invokevirtual   #100 <Method android.support.v4.app.NotificationCompat$Builder android.support.v4.app.NotificationCompat$Builder.setStyle(android.support.v4.app.NotificationCompat$Style)>
	//   52  110:aload_2         
	//   53  111:invokevirtual   #104 <Method android.support.v4.app.NotificationCompat$Builder android.support.v4.app.NotificationCompat$Builder.setContentIntent(android.app.PendingIntent)>
	//   54  114:bipush          7
	//   55  116:invokevirtual   #107 <Method android.support.v4.app.NotificationCompat$Builder android.support.v4.app.NotificationCompat$Builder.setDefaults(int)>
	//   56  119:invokevirtual   #110 <Method Notification android.support.v4.app.NotificationCompat$Builder.build()>
	//   57  122:areturn         
		}
	}

	public static Intent getIntent(Context context)
	{
		return new Intent(context, com/pactforcure/app/ui/TipOfTheWeekResourceActivity);
	//    0    0:new             #112 <Class Intent>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:ldc1            #114 <Class TipOfTheWeekResourceActivity>
	//    4    7:invokespecial   #117 <Method void Intent(Context, Class)>
	//    5   10:areturn         
	}

	public static final int NOTIFICATION_ID = 0x4c25c70;
}
