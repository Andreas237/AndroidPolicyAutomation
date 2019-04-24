// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.ui;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import com.google.android.exoplayer2.offline.DownloadAction;

public final class DownloadNotificationUtil
{

	private DownloadNotificationUtil()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
	//    2    4:return          
	}

	public static Notification buildDownloadCompletedNotification(Context context, int i, String s, PendingIntent pendingintent, String s1)
	{
		return newNotificationBuilder(context, i, s, pendingintent, s1, R.string.exo_download_completed).build();
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:getstatic       #22  <Field int R$string.exo_download_completed>
	//    6    9:invokestatic    #26  <Method android.support.v4.app.NotificationCompat$Builder newNotificationBuilder(Context, int, String, PendingIntent, String, int)>
	//    7   12:invokevirtual   #32  <Method Notification android.support.v4.app.NotificationCompat$Builder.build()>
	//    8   15:areturn         
	}

	public static Notification buildDownloadFailedNotification(Context context, int i, String s, PendingIntent pendingintent, String s1)
	{
		return newNotificationBuilder(context, i, s, pendingintent, s1, R.string.exo_download_failed).build();
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:getstatic       #37  <Field int R$string.exo_download_failed>
	//    6    9:invokestatic    #26  <Method android.support.v4.app.NotificationCompat$Builder newNotificationBuilder(Context, int, String, PendingIntent, String, int)>
	//    7   12:invokevirtual   #32  <Method Notification android.support.v4.app.NotificationCompat$Builder.build()>
	//    8   15:areturn         
	}

	public static Notification buildProgressNotification(Context context, int i, String s, PendingIntent pendingintent, String s1, com.google.android.exoplayer2.offline.DownloadManager.TaskState ataskstate[])
	{
		int i1 = ataskstate.length;
	//    0    0:aload           5
	//    1    2:arraylength     
	//    2    3:istore          15
		boolean flag = true;
	//    3    5:iconst_1        
	//    4    6:istore          8
		boolean flag3 = false;
	//    5    8:iconst_0        
	//    6    9:istore          13
		int j = ((int) (flag3));
	//    7   11:iload           13
	//    8   13:istore          9
		boolean flag1 = ((boolean) (j));
	//    9   15:iload           9
	//   10   17:istore          10
		int k = ((int) (flag1));
	//   11   19:iload           10
	//   12   21:istore          11
		float f = 0.0F;
	//   13   23:fconst_0        
	//   14   24:fstore          6
		int l = k;
	//   15   26:iload           11
	//   16   28:istore          14
		boolean flag2 = ((boolean) (j));
	//   17   30:iload           9
	//   18   32:istore          12
		for(j = l; j < i1; j++)
	//*  19   34:iload           14
	//*  20   36:istore          9
	//*  21   38:iload           9
	//*  22   40:iload           15
	//*  23   42:icmpge          166
		{
			com.google.android.exoplayer2.offline.DownloadManager.TaskState taskstate = ataskstate[j];
	//   24   45:aload           5
	//   25   47:iload           9
	//   26   49:aaload          
	//   27   50:astore          17
			if(taskstate.state != 1 && taskstate.state != 2)
	//*  28   52:aload           17
	//*  29   54:getfield        #44  <Field int com.google.android.exoplayer2.offline.DownloadManager$TaskState.state>
	//*  30   57:iconst_1        
	//*  31   58:icmpeq          73
	//*  32   61:aload           17
	//*  33   63:getfield        #44  <Field int com.google.android.exoplayer2.offline.DownloadManager$TaskState.state>
	//*  34   66:iconst_2        
	//*  35   67:icmpeq          73
				continue;
	//   36   70:goto            157
			if(taskstate.action.isRemoveAction)
	//*  37   73:aload           17
	//*  38   75:getfield        #48  <Field DownloadAction com.google.android.exoplayer2.offline.DownloadManager$TaskState.action>
	//*  39   78:getfield        #54  <Field boolean DownloadAction.isRemoveAction>
	//*  40   81:ifeq            90
			{
				flag2 = true;
	//   41   84:iconst_1        
	//   42   85:istore          12
				continue;
	//   43   87:goto            157
			}
			float f1 = f;
	//   44   90:fload           6
	//   45   92:fstore          7
			if(taskstate.downloadPercentage != -1F)
	//*  46   94:aload           17
	//*  47   96:getfield        #58  <Field float com.google.android.exoplayer2.offline.DownloadManager$TaskState.downloadPercentage>
	//*  48   99:ldc1            #59  <Float -1F>
	//*  49  101:fcmpl           
	//*  50  102:ifeq            118
			{
				f1 = f + taskstate.downloadPercentage;
	//   51  105:fload           6
	//   52  107:aload           17
	//   53  109:getfield        #58  <Field float com.google.android.exoplayer2.offline.DownloadManager$TaskState.downloadPercentage>
	//   54  112:fadd            
	//   55  113:fstore          7
				flag = false;
	//   56  115:iconst_0        
	//   57  116:istore          8
			}
			if(taskstate.downloadedBytes > 0L)
	//*  58  118:aload           17
	//*  59  120:getfield        #63  <Field long com.google.android.exoplayer2.offline.DownloadManager$TaskState.downloadedBytes>
	//*  60  123:lconst_0        
	//*  61  124:lcmp            
	//*  62  125:ifle            134
				flag3 = true;
	//   63  128:iconst_1        
	//   64  129:istore          13
			else
	//*  65  131:goto            137
				flag3 = false;
	//   66  134:iconst_0        
	//   67  135:istore          13
			k++;
	//   68  137:iload           11
	//   69  139:iconst_1        
	//   70  140:iadd            
	//   71  141:istore          11
			flag1 = flag3 | flag1;
	//   72  143:iload           13
	//   73  145:iload           10
	//   74  147:ior             
	//   75  148:istore          10
			flag3 = true;
	//   76  150:iconst_1        
	//   77  151:istore          13
			f = f1;
	//   78  153:fload           7
	//   79  155:fstore          6
		}

	//   80  157:iload           9
	//   81  159:iconst_1        
	//   82  160:iadd            
	//   83  161:istore          9
	//*  84  163:goto            38
		if(flag3)
	//*  85  166:iload           13
	//*  86  168:ifeq            179
			j = R.string.exo_download_downloading;
	//   87  171:getstatic       #66  <Field int R$string.exo_download_downloading>
	//   88  174:istore          9
		else
	//*  89  176:goto            195
		if(flag2)
	//*  90  179:iload           12
	//*  91  181:ifeq            192
			j = R.string.exo_download_removing;
	//   92  184:getstatic       #69  <Field int R$string.exo_download_removing>
	//   93  187:istore          9
		else
	//*  94  189:goto            176
			j = 0;
	//   95  192:iconst_0        
	//   96  193:istore          9
		context = ((Context) (newNotificationBuilder(context, i, s, pendingintent, s1, j)));
	//   97  195:aload_0         
	//   98  196:iload_1         
	//   99  197:aload_2         
	//  100  198:aload_3         
	//  101  199:aload           4
	//  102  201:iload           9
	//  103  203:invokestatic    #26  <Method android.support.v4.app.NotificationCompat$Builder newNotificationBuilder(Context, int, String, PendingIntent, String, int)>
	//  104  206:astore_0        
		boolean flag4;
		if(flag3)
	//* 105  207:iload           13
	//* 106  209:ifeq            242
		{
			i = (int)(f / (float)k);
	//  107  212:fload           6
	//  108  214:iload           11
	//  109  216:i2f             
	//  110  217:fdiv            
	//  111  218:f2i             
	//  112  219:istore_1        
			if(flag && flag1)
	//* 113  220:iload           8
	//* 114  222:ifeq            236
	//* 115  225:iload           10
	//* 116  227:ifeq            236
				flag4 = true;
	//  117  230:iconst_1        
	//  118  231:istore          16
			else
	//* 119  233:goto            247
				flag4 = false;
	//  120  236:iconst_0        
	//  121  237:istore          16
		} else
	//* 122  239:goto            247
		{
			flag4 = true;
	//  123  242:iconst_1        
	//  124  243:istore          16
			i = 0;
	//  125  245:iconst_0        
	//  126  246:istore_1        
		}
		((android.support.v4.app.NotificationCompat.Builder) (context)).setProgress(100, i, flag4);
	//  127  247:aload_0         
	//  128  248:bipush          100
	//  129  250:iload_1         
	//  130  251:iload           16
	//  131  253:invokevirtual   #73  <Method android.support.v4.app.NotificationCompat$Builder android.support.v4.app.NotificationCompat$Builder.setProgress(int, int, boolean)>
	//  132  256:pop             
		((android.support.v4.app.NotificationCompat.Builder) (context)).setOngoing(true);
	//  133  257:aload_0         
	//  134  258:iconst_1        
	//  135  259:invokevirtual   #77  <Method android.support.v4.app.NotificationCompat$Builder android.support.v4.app.NotificationCompat$Builder.setOngoing(boolean)>
	//  136  262:pop             
		((android.support.v4.app.NotificationCompat.Builder) (context)).setShowWhen(false);
	//  137  263:aload_0         
	//  138  264:iconst_0        
	//  139  265:invokevirtual   #80  <Method android.support.v4.app.NotificationCompat$Builder android.support.v4.app.NotificationCompat$Builder.setShowWhen(boolean)>
	//  140  268:pop             
		return ((android.support.v4.app.NotificationCompat.Builder) (context)).build();
	//  141  269:aload_0         
	//  142  270:invokevirtual   #32  <Method Notification android.support.v4.app.NotificationCompat$Builder.build()>
	//  143  273:areturn         
	}

	private static android.support.v4.app.NotificationCompat.Builder newNotificationBuilder(Context context, int i, String s, PendingIntent pendingintent, String s1, int j)
	{
		s = ((String) ((new android.support.v4.app.NotificationCompat.Builder(context, s)).setSmallIcon(i)));
	//    0    0:new             #28  <Class android.support.v4.app.NotificationCompat$Builder>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_2         
	//    4    6:invokespecial   #83  <Method void android.support.v4.app.NotificationCompat$Builder(Context, String)>
	//    5    9:iload_1         
	//    6   10:invokevirtual   #87  <Method android.support.v4.app.NotificationCompat$Builder android.support.v4.app.NotificationCompat$Builder.setSmallIcon(int)>
	//    7   13:astore_2        
		if(j != 0)
	//*   8   14:iload           5
	//*   9   16:ifeq            33
			((android.support.v4.app.NotificationCompat.Builder) (s)).setContentTitle(((CharSequence) (context.getResources().getString(j))));
	//   10   19:aload_2         
	//   11   20:aload_0         
	//   12   21:invokevirtual   #93  <Method Resources Context.getResources()>
	//   13   24:iload           5
	//   14   26:invokevirtual   #99  <Method String Resources.getString(int)>
	//   15   29:invokevirtual   #103 <Method android.support.v4.app.NotificationCompat$Builder android.support.v4.app.NotificationCompat$Builder.setContentTitle(CharSequence)>
	//   16   32:pop             
		if(pendingintent != null)
	//*  17   33:aload_3         
	//*  18   34:ifnull          43
			((android.support.v4.app.NotificationCompat.Builder) (s)).setContentIntent(pendingintent);
	//   19   37:aload_2         
	//   20   38:aload_3         
	//   21   39:invokevirtual   #107 <Method android.support.v4.app.NotificationCompat$Builder android.support.v4.app.NotificationCompat$Builder.setContentIntent(PendingIntent)>
	//   22   42:pop             
		if(s1 != null)
	//*  23   43:aload           4
	//*  24   45:ifnull          65
			((android.support.v4.app.NotificationCompat.Builder) (s)).setStyle(((android.support.v4.app.NotificationCompat.Style) ((new android.support.v4.app.NotificationCompat.BigTextStyle()).bigText(((CharSequence) (s1))))));
	//   25   48:aload_2         
	//   26   49:new             #109 <Class android.support.v4.app.NotificationCompat$BigTextStyle>
	//   27   52:dup             
	//   28   53:invokespecial   #110 <Method void android.support.v4.app.NotificationCompat$BigTextStyle()>
	//   29   56:aload           4
	//   30   58:invokevirtual   #114 <Method android.support.v4.app.NotificationCompat$BigTextStyle android.support.v4.app.NotificationCompat$BigTextStyle.bigText(CharSequence)>
	//   31   61:invokevirtual   #118 <Method android.support.v4.app.NotificationCompat$Builder android.support.v4.app.NotificationCompat$Builder.setStyle(android.support.v4.app.NotificationCompat$Style)>
	//   32   64:pop             
		return ((android.support.v4.app.NotificationCompat.Builder) (s));
	//   33   65:aload_2         
	//   34   66:areturn         
	}

	private static final int NULL_STRING_ID = 0;
}
