// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import android.content.*;
import android.os.Process;
import android.util.Log;

// Referenced classes of package o:
//			dhu, dio

static final class dhu$3 extends BroadcastReceiver
{

	public void onReceive(Context context, Intent intent)
	{
		if(context == null || intent == null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          8
	//*   2    4:aload_2         
	//*   3    5:ifnonnull       17
		{
			Log.w("LogUtil_LogConfig", "sLogConfigReceiver receive null,deal failed,return");
	//    4    8:ldc1            #15  <String "LogUtil_LogConfig">
	//    5   10:ldc1            #17  <String "sLogConfigReceiver receive null,deal failed,return">
	//    6   12:invokestatic    #23  <Method int Log.w(String, String)>
	//    7   15:pop             
			return;
	//    8   16:return          
		}
		intent = ((Intent) (intent.getAction()));
	//    9   17:aload_2         
	//   10   18:invokevirtual   #29  <Method String Intent.getAction()>
	//   11   21:astore_2        
		if(intent == null)
	//*  12   22:aload_2         
	//*  13   23:ifnonnull       35
		{
			Log.w("LogUtil_LogConfig", "sLogConfigReceiver receive action null,deal failed,return");
	//   14   26:ldc1            #15  <String "LogUtil_LogConfig">
	//   15   28:ldc1            #31  <String "sLogConfigReceiver receive action null,deal failed,return">
	//   16   30:invokestatic    #23  <Method int Log.w(String, String)>
	//   17   33:pop             
			return;
	//   18   34:return          
		}
		Log.i("LogUtil_LogConfig", (new StringBuilder()).append("sLogConfigReceiver receive,deal:").append(((String) (intent))).toString());
	//   19   35:ldc1            #15  <String "LogUtil_LogConfig">
	//   20   37:new             #33  <Class StringBuilder>
	//   21   40:dup             
	//   22   41:invokespecial   #34  <Method void StringBuilder()>
	//   23   44:ldc1            #36  <String "sLogConfigReceiver receive,deal:">
	//   24   46:invokevirtual   #40  <Method StringBuilder StringBuilder.append(String)>
	//   25   49:aload_2         
	//   26   50:invokevirtual   #40  <Method StringBuilder StringBuilder.append(String)>
	//   27   53:invokevirtual   #43  <Method String StringBuilder.toString()>
	//   28   56:invokestatic    #46  <Method int Log.i(String, String)>
	//   29   59:pop             
		if(((String) (intent)).equals("com.huawei.health.update_log_config_area"))
	//*  30   60:aload_2         
	//*  31   61:ldc1            #48  <String "com.huawei.health.update_log_config_area">
	//*  32   63:invokevirtual   #54  <Method boolean String.equals(Object)>
	//*  33   66:ifeq            106
		{
			dhu.e(context, (new StringBuilder()).append("ACTION_UPDATE_LOG_CONFIG_AREA message deal for process:").append(dio.d()).append(" pid:").append(Process.myPid()).toString());
	//   34   69:aload_1         
	//   35   70:new             #33  <Class StringBuilder>
	//   36   73:dup             
	//   37   74:invokespecial   #34  <Method void StringBuilder()>
	//   38   77:ldc1            #56  <String "ACTION_UPDATE_LOG_CONFIG_AREA message deal for process:">
	//   39   79:invokevirtual   #40  <Method StringBuilder StringBuilder.append(String)>
	//   40   82:invokestatic    #61  <Method String dio.d()>
	//   41   85:invokevirtual   #40  <Method StringBuilder StringBuilder.append(String)>
	//   42   88:ldc1            #63  <String " pid:">
	//   43   90:invokevirtual   #40  <Method StringBuilder StringBuilder.append(String)>
	//   44   93:invokestatic    #69  <Method int Process.myPid()>
	//   45   96:invokevirtual   #72  <Method StringBuilder StringBuilder.append(int)>
	//   46   99:invokevirtual   #43  <Method String StringBuilder.toString()>
	//   47  102:invokestatic    #76  <Method void dhu.e(Context, String)>
			return;
	//   48  105:return          
		}
		if(((String) (intent)).equals("com.huawei.health.update_log_config_user"))
	//*  49  106:aload_2         
	//*  50  107:ldc1            #78  <String "com.huawei.health.update_log_config_user">
	//*  51  109:invokevirtual   #54  <Method boolean String.equals(Object)>
	//*  52  112:ifeq            118
			dhu.t();
	//   53  115:invokestatic    #81  <Method void dhu.t()>
	//   54  118:return          
	}

	dhu$3()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void BroadcastReceiver()>
	//    2    4:return          
	}
}
