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
	//    1    1:invokespecial   #33  <Method void BroadcastReceiver()>
	//    2    4:return          
	}

	public static Intent newConstraintProxyUpdateIntent(Context context, boolean flag, boolean flag1, boolean flag2, boolean flag3)
	{
		Intent intent = new Intent("androidx.work.impl.background.systemalarm.UpdateProxies");
	//    0    0:new             #37  <Class Intent>
	//    1    3:dup             
	//    2    4:ldc1            #8   <String "androidx.work.impl.background.systemalarm.UpdateProxies">
	//    3    6:invokespecial   #40  <Method void Intent(String)>
	//    4    9:astore          5
		intent.setComponent(new ComponentName(context, androidx/work/impl/background/systemalarm/ConstraintProxyUpdateReceiver));
	//    5   11:aload           5
	//    6   13:new             #42  <Class ComponentName>
	//    7   16:dup             
	//    8   17:aload_0         
	//    9   18:ldc1            #2   <Class ConstraintProxyUpdateReceiver>
	//   10   20:invokespecial   #45  <Method void ComponentName(Context, Class)>
	//   11   23:invokevirtual   #49  <Method Intent Intent.setComponent(ComponentName)>
	//   12   26:pop             
		intent.putExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", flag).putExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", flag1).putExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", flag2).putExtra("KEY_NETWORK_STATE_PROXY_ENABLED", flag3);
	//   13   27:aload           5
	//   14   29:ldc1            #12  <String "KEY_BATTERY_NOT_LOW_PROXY_ENABLED">
	//   15   31:iload_1         
	//   16   32:invokevirtual   #53  <Method Intent Intent.putExtra(String, boolean)>
	//   17   35:ldc1            #10  <String "KEY_BATTERY_CHARGING_PROXY_ENABLED">
	//   18   37:iload_2         
	//   19   38:invokevirtual   #53  <Method Intent Intent.putExtra(String, boolean)>
	//   20   41:ldc1            #16  <String "KEY_STORAGE_NOT_LOW_PROXY_ENABLED">
	//   21   43:iload_3         
	//   22   44:invokevirtual   #53  <Method Intent Intent.putExtra(String, boolean)>
	//   23   47:ldc1            #14  <String "KEY_NETWORK_STATE_PROXY_ENABLED">
	//   24   49:iload           4
	//   25   51:invokevirtual   #53  <Method Intent Intent.putExtra(String, boolean)>
	//   26   54:pop             
		return intent;
	//   27   55:aload           5
	//   28   57:areturn         
	}

	public void onReceive(Context context, Intent intent)
	{
		String s;
		if(intent != null)
	//*   0    0:aload_2         
	//*   1    1:ifnull          13
			s = intent.getAction();
	//    2    4:aload_2         
	//    3    5:invokevirtual   #59  <Method String Intent.getAction()>
	//    4    8:astore          7
		else
	//*   5   10:goto            16
			s = null;
	//    6   13:aconst_null     
	//    7   14:astore          7
		if(!"androidx.work.impl.background.systemalarm.UpdateProxies".equals(((Object) (s))))
	//*   8   16:ldc1            #8   <String "androidx.work.impl.background.systemalarm.UpdateProxies">
	//*   9   18:aload           7
	//*  10   20:invokevirtual   #65  <Method boolean String.equals(Object)>
	//*  11   23:ifne            54
		{
			Logger.get().debug(TAG, String.format("Ignoring unknown action %s", new Object[] {
				s
			}), new Throwable[0]);
	//   12   26:invokestatic    #69  <Method Logger Logger.get()>
	//   13   29:getstatic       #29  <Field String TAG>
	//   14   32:ldc1            #71  <String "Ignoring unknown action %s">
	//   15   34:iconst_1        
	//   16   35:anewarray       Object[]
	//   17   38:dup             
	//   18   39:iconst_0        
	//   19   40:aload           7
	//   20   42:aastore         
	//   21   43:invokestatic    #77  <Method String String.format(String, Object[])>
	//   22   46:iconst_0        
	//   23   47:anewarray       Throwable[]
	//   24   50:invokevirtual   #83  <Method void Logger.debug(String, String, Throwable[])>
			return;
	//   25   53:return          
		} else
		{
			boolean flag = intent.getBooleanExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", false);
	//   26   54:aload_2         
	//   27   55:ldc1            #12  <String "KEY_BATTERY_NOT_LOW_PROXY_ENABLED">
	//   28   57:iconst_0        
	//   29   58:invokevirtual   #87  <Method boolean Intent.getBooleanExtra(String, boolean)>
	//   30   61:istore_3        
			boolean flag1 = intent.getBooleanExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", false);
	//   31   62:aload_2         
	//   32   63:ldc1            #10  <String "KEY_BATTERY_CHARGING_PROXY_ENABLED">
	//   33   65:iconst_0        
	//   34   66:invokevirtual   #87  <Method boolean Intent.getBooleanExtra(String, boolean)>
	//   35   69:istore          4
			boolean flag2 = intent.getBooleanExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", false);
	//   36   71:aload_2         
	//   37   72:ldc1            #16  <String "KEY_STORAGE_NOT_LOW_PROXY_ENABLED">
	//   38   74:iconst_0        
	//   39   75:invokevirtual   #87  <Method boolean Intent.getBooleanExtra(String, boolean)>
	//   40   78:istore          5
			boolean flag3 = intent.getBooleanExtra("KEY_NETWORK_STATE_PROXY_ENABLED", false);
	//   41   80:aload_2         
	//   42   81:ldc1            #14  <String "KEY_NETWORK_STATE_PROXY_ENABLED">
	//   43   83:iconst_0        
	//   44   84:invokevirtual   #87  <Method boolean Intent.getBooleanExtra(String, boolean)>
	//   45   87:istore          6
			Logger.get().debug(TAG, String.format("Updating proxies: BatteryNotLowProxy enabled (%s), BatteryChargingProxy enabled (%s), StorageNotLowProxy (%s), NetworkStateProxy enabled (%s)", new Object[] {
				Boolean.valueOf(flag), Boolean.valueOf(flag1), Boolean.valueOf(flag2), Boolean.valueOf(flag3)
			}), new Throwable[0]);
	//   46   89:invokestatic    #69  <Method Logger Logger.get()>
	//   47   92:getstatic       #29  <Field String TAG>
	//   48   95:ldc1            #89  <String "Updating proxies: BatteryNotLowProxy enabled (%s), BatteryChargingProxy enabled (%s), StorageNotLowProxy (%s), NetworkStateProxy enabled (%s)">
	//   49   97:iconst_4        
	//   50   98:anewarray       Object[]
	//   51  101:dup             
	//   52  102:iconst_0        
	//   53  103:iload_3         
	//   54  104:invokestatic    #95  <Method Boolean Boolean.valueOf(boolean)>
	//   55  107:aastore         
	//   56  108:dup             
	//   57  109:iconst_1        
	//   58  110:iload           4
	//   59  112:invokestatic    #95  <Method Boolean Boolean.valueOf(boolean)>
	//   60  115:aastore         
	//   61  116:dup             
	//   62  117:iconst_2        
	//   63  118:iload           5
	//   64  120:invokestatic    #95  <Method Boolean Boolean.valueOf(boolean)>
	//   65  123:aastore         
	//   66  124:dup             
	//   67  125:iconst_3        
	//   68  126:iload           6
	//   69  128:invokestatic    #95  <Method Boolean Boolean.valueOf(boolean)>
	//   70  131:aastore         
	//   71  132:invokestatic    #77  <Method String String.format(String, Object[])>
	//   72  135:iconst_0        
	//   73  136:anewarray       Throwable[]
	//   74  139:invokevirtual   #83  <Method void Logger.debug(String, String, Throwable[])>
			PackageManagerHelper.setComponentEnabled(context, androidx/work/impl/background/systemalarm/ConstraintProxy$BatteryNotLowProxy, flag);
	//   75  142:aload_1         
	//   76  143:ldc1            #97  <Class ConstraintProxy$BatteryNotLowProxy>
	//   77  145:iload_3         
	//   78  146:invokestatic    #103 <Method void PackageManagerHelper.setComponentEnabled(Context, Class, boolean)>
			PackageManagerHelper.setComponentEnabled(context, androidx/work/impl/background/systemalarm/ConstraintProxy$BatteryChargingProxy, flag1);
	//   79  149:aload_1         
	//   80  150:ldc1            #105 <Class ConstraintProxy$BatteryChargingProxy>
	//   81  152:iload           4
	//   82  154:invokestatic    #103 <Method void PackageManagerHelper.setComponentEnabled(Context, Class, boolean)>
			PackageManagerHelper.setComponentEnabled(context, androidx/work/impl/background/systemalarm/ConstraintProxy$StorageNotLowProxy, flag2);
	//   83  157:aload_1         
	//   84  158:ldc1            #107 <Class ConstraintProxy$StorageNotLowProxy>
	//   85  160:iload           5
	//   86  162:invokestatic    #103 <Method void PackageManagerHelper.setComponentEnabled(Context, Class, boolean)>
			PackageManagerHelper.setComponentEnabled(context, androidx/work/impl/background/systemalarm/ConstraintProxy$NetworkStateProxy, flag3);
	//   87  165:aload_1         
	//   88  166:ldc1            #109 <Class ConstraintProxy$NetworkStateProxy>
	//   89  168:iload           6
	//   90  170:invokestatic    #103 <Method void PackageManagerHelper.setComponentEnabled(Context, Class, boolean)>
			return;
	//   91  173:return          
		}
	}

	static final String ACTION = "androidx.work.impl.background.systemalarm.UpdateProxies";
	static final String KEY_BATTERY_CHARGING_PROXY_ENABLED = "KEY_BATTERY_CHARGING_PROXY_ENABLED";
	static final String KEY_BATTERY_NOT_LOW_PROXY_ENABLED = "KEY_BATTERY_NOT_LOW_PROXY_ENABLED";
	static final String KEY_NETWORK_STATE_PROXY_ENABLED = "KEY_NETWORK_STATE_PROXY_ENABLED";
	static final String KEY_STORAGE_NOT_LOW_PROXY_ENABLED = "KEY_STORAGE_NOT_LOW_PROXY_ENABLED";
	private static final String TAG = Logger.tagWithPrefix("ConstrntProxyUpdtRecvr");

	static 
	{
	//    0    0:ldc1            #21  <String "ConstrntProxyUpdtRecvr">
	//    1    2:invokestatic    #27  <Method String Logger.tagWithPrefix(String)>
	//    2    5:putstatic       #29  <Field String TAG>
	//*   3    8:return          
	}
}
