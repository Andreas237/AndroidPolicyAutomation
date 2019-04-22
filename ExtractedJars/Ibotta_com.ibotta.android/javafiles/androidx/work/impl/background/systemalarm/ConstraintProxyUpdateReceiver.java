// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package androidx.work.impl.background.systemalarm;

import android.content.*;
import androidx.work.Logger;
import androidx.work.impl.utils.PackageManagerHelper;

public class ConstraintProxyUpdateReceiver extends BroadcastReceiver
{

	public ConstraintProxyUpdateReceiver()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void BroadcastReceiver()>
	//    2    4:return          
	}

	public static Intent newConstraintProxyUpdateIntent(boolean flag, boolean flag1, boolean flag2, boolean flag3)
	{
		Intent intent = new Intent("androidx.work.impl.background.systemalarm.UpdateProxies");
	//    0    0:new             #13  <Class Intent>
	//    1    3:dup             
	//    2    4:ldc1            #15  <String "androidx.work.impl.background.systemalarm.UpdateProxies">
	//    3    6:invokespecial   #18  <Method void Intent(String)>
	//    4    9:astore          4
		intent.putExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", flag).putExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", flag1).putExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", flag2).putExtra("KEY_NETWORK_STATE_PROXY_ENABLED", flag3);
	//    5   11:aload           4
	//    6   13:ldc1            #20  <String "KEY_BATTERY_NOT_LOW_PROXY_ENABLED">
	//    7   15:iload_0         
	//    8   16:invokevirtual   #24  <Method Intent Intent.putExtra(String, boolean)>
	//    9   19:ldc1            #26  <String "KEY_BATTERY_CHARGING_PROXY_ENABLED">
	//   10   21:iload_1         
	//   11   22:invokevirtual   #24  <Method Intent Intent.putExtra(String, boolean)>
	//   12   25:ldc1            #28  <String "KEY_STORAGE_NOT_LOW_PROXY_ENABLED">
	//   13   27:iload_2         
	//   14   28:invokevirtual   #24  <Method Intent Intent.putExtra(String, boolean)>
	//   15   31:ldc1            #30  <String "KEY_NETWORK_STATE_PROXY_ENABLED">
	//   16   33:iload_3         
	//   17   34:invokevirtual   #24  <Method Intent Intent.putExtra(String, boolean)>
	//   18   37:pop             
		return intent;
	//   19   38:aload           4
	//   20   40:areturn         
	}

	public void onReceive(Context context, Intent intent)
	{
		String s;
		if(intent != null)
	//*   0    0:aload_2         
	//*   1    1:ifnull          13
			s = intent.getAction();
	//    2    4:aload_2         
	//    3    5:invokevirtual   #36  <Method String Intent.getAction()>
	//    4    8:astore          7
		else
	//*   5   10:goto            16
			s = null;
	//    6   13:aconst_null     
	//    7   14:astore          7
		if(!"androidx.work.impl.background.systemalarm.UpdateProxies".equals(((Object) (s))))
	//*   8   16:ldc1            #15  <String "androidx.work.impl.background.systemalarm.UpdateProxies">
	//*   9   18:aload           7
	//*  10   20:invokevirtual   #42  <Method boolean String.equals(Object)>
	//*  11   23:ifne            50
		{
			Logger.debug("ConstrntProxyUpdtRecvr", String.format("Ignoring unknown action %s", new Object[] {
				s
			}), new Throwable[0]);
	//   12   26:ldc1            #44  <String "ConstrntProxyUpdtRecvr">
	//   13   28:ldc1            #46  <String "Ignoring unknown action %s">
	//   14   30:iconst_1        
	//   15   31:anewarray       Object[]
	//   16   34:dup             
	//   17   35:iconst_0        
	//   18   36:aload           7
	//   19   38:aastore         
	//   20   39:invokestatic    #52  <Method String String.format(String, Object[])>
	//   21   42:iconst_0        
	//   22   43:anewarray       Throwable[]
	//   23   46:invokestatic    #60  <Method void Logger.debug(String, String, Throwable[])>
			return;
	//   24   49:return          
		} else
		{
			boolean flag = intent.getBooleanExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", false);
	//   25   50:aload_2         
	//   26   51:ldc1            #20  <String "KEY_BATTERY_NOT_LOW_PROXY_ENABLED">
	//   27   53:iconst_0        
	//   28   54:invokevirtual   #64  <Method boolean Intent.getBooleanExtra(String, boolean)>
	//   29   57:istore_3        
			boolean flag1 = intent.getBooleanExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", false);
	//   30   58:aload_2         
	//   31   59:ldc1            #26  <String "KEY_BATTERY_CHARGING_PROXY_ENABLED">
	//   32   61:iconst_0        
	//   33   62:invokevirtual   #64  <Method boolean Intent.getBooleanExtra(String, boolean)>
	//   34   65:istore          4
			boolean flag2 = intent.getBooleanExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", false);
	//   35   67:aload_2         
	//   36   68:ldc1            #28  <String "KEY_STORAGE_NOT_LOW_PROXY_ENABLED">
	//   37   70:iconst_0        
	//   38   71:invokevirtual   #64  <Method boolean Intent.getBooleanExtra(String, boolean)>
	//   39   74:istore          5
			boolean flag3 = intent.getBooleanExtra("KEY_NETWORK_STATE_PROXY_ENABLED", false);
	//   40   76:aload_2         
	//   41   77:ldc1            #30  <String "KEY_NETWORK_STATE_PROXY_ENABLED">
	//   42   79:iconst_0        
	//   43   80:invokevirtual   #64  <Method boolean Intent.getBooleanExtra(String, boolean)>
	//   44   83:istore          6
			Logger.debug("ConstrntProxyUpdtRecvr", String.format("Updating proxies: BatteryNotLowProxy enabled (%s), BatteryChargingProxy enabled (%s), StorageNotLowProxy (%s), NetworkStateProxy enabled (%s)", new Object[] {
				Boolean.valueOf(flag), Boolean.valueOf(flag1), Boolean.valueOf(flag2), Boolean.valueOf(flag3)
			}), new Throwable[0]);
	//   45   85:ldc1            #44  <String "ConstrntProxyUpdtRecvr">
	//   46   87:ldc1            #66  <String "Updating proxies: BatteryNotLowProxy enabled (%s), BatteryChargingProxy enabled (%s), StorageNotLowProxy (%s), NetworkStateProxy enabled (%s)">
	//   47   89:iconst_4        
	//   48   90:anewarray       Object[]
	//   49   93:dup             
	//   50   94:iconst_0        
	//   51   95:iload_3         
	//   52   96:invokestatic    #72  <Method Boolean Boolean.valueOf(boolean)>
	//   53   99:aastore         
	//   54  100:dup             
	//   55  101:iconst_1        
	//   56  102:iload           4
	//   57  104:invokestatic    #72  <Method Boolean Boolean.valueOf(boolean)>
	//   58  107:aastore         
	//   59  108:dup             
	//   60  109:iconst_2        
	//   61  110:iload           5
	//   62  112:invokestatic    #72  <Method Boolean Boolean.valueOf(boolean)>
	//   63  115:aastore         
	//   64  116:dup             
	//   65  117:iconst_3        
	//   66  118:iload           6
	//   67  120:invokestatic    #72  <Method Boolean Boolean.valueOf(boolean)>
	//   68  123:aastore         
	//   69  124:invokestatic    #52  <Method String String.format(String, Object[])>
	//   70  127:iconst_0        
	//   71  128:anewarray       Throwable[]
	//   72  131:invokestatic    #60  <Method void Logger.debug(String, String, Throwable[])>
			PackageManagerHelper.setComponentEnabled(context, androidx/work/impl/background/systemalarm/ConstraintProxy$BatteryNotLowProxy, flag);
	//   73  134:aload_1         
	//   74  135:ldc1            #74  <Class ConstraintProxy$BatteryNotLowProxy>
	//   75  137:iload_3         
	//   76  138:invokestatic    #80  <Method void PackageManagerHelper.setComponentEnabled(Context, Class, boolean)>
			PackageManagerHelper.setComponentEnabled(context, androidx/work/impl/background/systemalarm/ConstraintProxy$BatteryChargingProxy, flag1);
	//   77  141:aload_1         
	//   78  142:ldc1            #82  <Class ConstraintProxy$BatteryChargingProxy>
	//   79  144:iload           4
	//   80  146:invokestatic    #80  <Method void PackageManagerHelper.setComponentEnabled(Context, Class, boolean)>
			PackageManagerHelper.setComponentEnabled(context, androidx/work/impl/background/systemalarm/ConstraintProxy$StorageNotLowProxy, flag2);
	//   81  149:aload_1         
	//   82  150:ldc1            #84  <Class ConstraintProxy$StorageNotLowProxy>
	//   83  152:iload           5
	//   84  154:invokestatic    #80  <Method void PackageManagerHelper.setComponentEnabled(Context, Class, boolean)>
			PackageManagerHelper.setComponentEnabled(context, androidx/work/impl/background/systemalarm/ConstraintProxy$NetworkStateProxy, flag3);
	//   85  157:aload_1         
	//   86  158:ldc1            #86  <Class ConstraintProxy$NetworkStateProxy>
	//   87  160:iload           6
	//   88  162:invokestatic    #80  <Method void PackageManagerHelper.setComponentEnabled(Context, Class, boolean)>
			return;
	//   89  165:return          
		}
	}
}
