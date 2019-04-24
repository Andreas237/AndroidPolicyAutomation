// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.ext.ui;

import android.content.*;
import android.os.Bundle;
import android.support.v7.ci;
import android.support.v7.cj;

// Referenced classes of package com.ext.ui:
//			AutoBackupService

public class AppUpdateReceiver extends BroadcastReceiver
{

	public AppUpdateReceiver()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void BroadcastReceiver()>
		a = "AppUpdateReceiver";
	//    2    4:aload_0         
	//    3    5:ldc1            #12  <String "AppUpdateReceiver">
	//    4    7:putfield        #14  <Field String a>
	//    5   10:return          
	}

	public void onReceive(Context context, Intent intent)
	{
		if(!cj.a().b("auto_bkp", false))
	//*   0    0:invokestatic    #22  <Method cj cj.a()>
	//*   1    3:ldc1            #24  <String "auto_bkp">
	//*   2    5:iconst_0        
	//*   3    6:invokevirtual   #28  <Method boolean cj.b(String, boolean)>
	//*   4    9:ifne            13
		{
			return;
	//    5   12:return          
		} else
		{
			int i = intent.getExtras().getInt("android.intent.extra.UID");
	//    6   13:aload_2         
	//    7   14:invokevirtual   #34  <Method Bundle Intent.getExtras()>
	//    8   17:ldc1            #36  <String "android.intent.extra.UID">
	//    9   19:invokevirtual   #42  <Method int Bundle.getInt(String)>
	//   10   22:istore_3        
			ci.a(a, (new StringBuilder()).append(" val :").append(i).toString());
	//   11   23:aload_0         
	//   12   24:getfield        #14  <Field String a>
	//   13   27:new             #44  <Class StringBuilder>
	//   14   30:dup             
	//   15   31:invokespecial   #45  <Method void StringBuilder()>
	//   16   34:ldc1            #47  <String " val :">
	//   17   36:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//   18   39:iload_3         
	//   19   40:invokevirtual   #54  <Method StringBuilder StringBuilder.append(int)>
	//   20   43:invokevirtual   #58  <Method String StringBuilder.toString()>
	//   21   46:invokestatic    #63  <Method void ci.a(String, String)>
			intent = new Intent(context, com/ext/ui/AutoBackupService);
	//   22   49:new             #30  <Class Intent>
	//   23   52:dup             
	//   24   53:aload_1         
	//   25   54:ldc1            #65  <Class AutoBackupService>
	//   26   56:invokespecial   #68  <Method void Intent(Context, Class)>
	//   27   59:astore_2        
			intent.addFlags(0x10000000);
	//   28   60:aload_2         
	//   29   61:ldc1            #69  <Int 0x10000000>
	//   30   63:invokevirtual   #73  <Method Intent Intent.addFlags(int)>
	//   31   66:pop             
			intent.putExtra("android.intent.extra.UID", i);
	//   32   67:aload_2         
	//   33   68:ldc1            #36  <String "android.intent.extra.UID">
	//   34   70:iload_3         
	//   35   71:invokevirtual   #77  <Method Intent Intent.putExtra(String, int)>
	//   36   74:pop             
			context.startService(intent);
	//   37   75:aload_1         
	//   38   76:aload_2         
	//   39   77:invokevirtual   #83  <Method android.content.ComponentName Context.startService(Intent)>
	//   40   80:pop             
			return;
	//   41   81:return          
		}
	}

	private String a;
}
