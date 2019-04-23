// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package androidx.work.impl.background.systemalarm;

import android.content.*;
import androidx.work.*;
import androidx.work.impl.model.WorkSpec;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package androidx.work.impl.background.systemalarm:
//			ConstraintProxyUpdateReceiver, CommandHandler

abstract class ConstraintProxy extends BroadcastReceiver
{
	public static class BatteryChargingProxy extends ConstraintProxy
	{

		public volatile void onReceive(Context context, Intent intent)
		{
			onReceive(context, intent);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #14  <Method void ConstraintProxy.onReceive(Context, Intent)>
		//    4    6:return          
		}

		public BatteryChargingProxy()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #9   <Method void ConstraintProxy()>
		//    2    4:return          
		}
	}

	public static class BatteryNotLowProxy extends ConstraintProxy
	{

		public volatile void onReceive(Context context, Intent intent)
		{
			onReceive(context, intent);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #14  <Method void ConstraintProxy.onReceive(Context, Intent)>
		//    4    6:return          
		}

		public BatteryNotLowProxy()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #9   <Method void ConstraintProxy()>
		//    2    4:return          
		}
	}

	public static class NetworkStateProxy extends ConstraintProxy
	{

		public volatile void onReceive(Context context, Intent intent)
		{
			onReceive(context, intent);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #14  <Method void ConstraintProxy.onReceive(Context, Intent)>
		//    4    6:return          
		}

		public NetworkStateProxy()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #9   <Method void ConstraintProxy()>
		//    2    4:return          
		}
	}

	public static class StorageNotLowProxy extends ConstraintProxy
	{

		public volatile void onReceive(Context context, Intent intent)
		{
			onReceive(context, intent);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #14  <Method void ConstraintProxy.onReceive(Context, Intent)>
		//    4    6:return          
		}

		public StorageNotLowProxy()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #9   <Method void ConstraintProxy()>
		//    2    4:return          
		}
	}


	ConstraintProxy()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #34  <Method void BroadcastReceiver()>
	//    2    4:return          
	}

	static void updateAll(Context context, List list)
	{
		list = ((List) (list.iterator()));
	//    0    0:aload_1         
	//    1    1:invokeinterface #42  <Method Iterator List.iterator()>
	//    2    6:astore_1        
		boolean flag4 = false;
	//    3    7:iconst_0        
	//    4    8:istore          6
		boolean flag3 = flag4;
	//    5   10:iload           6
	//    6   12:istore          5
		boolean flag2 = flag3;
	//    7   14:iload           5
	//    8   16:istore          4
		boolean flag1 = flag2;
	//    9   18:iload           4
	//   10   20:istore_3        
		boolean flag5;
		boolean flag6;
		boolean flag7;
		boolean flag8;
label0:
		do
		{
			do
			{
				do
				{
					do
					{
						flag5 = flag4;
	//   11   21:iload           6
	//   12   23:istore          7
						flag7 = flag3;
	//   13   25:iload           5
	//   14   27:istore          9
						flag8 = flag2;
	//   15   29:iload           4
	//   16   31:istore          10
						flag6 = flag1;
	//   17   33:iload_3         
	//   18   34:istore          8
						if(!((Iterator) (list)).hasNext())
							break label0;
	//   19   36:aload_1         
	//   20   37:invokeinterface #48  <Method boolean Iterator.hasNext()>
	//   21   42:ifeq            192
						Constraints constraints = ((WorkSpec)((Iterator) (list)).next()).constraints;
	//   22   45:aload_1         
	//   23   46:invokeinterface #52  <Method Object Iterator.next()>
	//   24   51:checkcast       #54  <Class WorkSpec>
	//   25   54:getfield        #58  <Field Constraints WorkSpec.constraints>
	//   26   57:astore          11
						flag5 = flag4 | constraints.requiresBatteryNotLow();
	//   27   59:iload           6
	//   28   61:aload           11
	//   29   63:invokevirtual   #63  <Method boolean Constraints.requiresBatteryNotLow()>
	//   30   66:ior             
	//   31   67:istore          7
						flag7 = flag3 | constraints.requiresCharging();
	//   32   69:iload           5
	//   33   71:aload           11
	//   34   73:invokevirtual   #66  <Method boolean Constraints.requiresCharging()>
	//   35   76:ior             
	//   36   77:istore          9
						flag8 = flag2 | constraints.requiresStorageNotLow();
	//   37   79:iload           4
	//   38   81:aload           11
	//   39   83:invokevirtual   #69  <Method boolean Constraints.requiresStorageNotLow()>
	//   40   86:ior             
	//   41   87:istore          10
						boolean flag;
						if(constraints.getRequiredNetworkType() != NetworkType.NOT_REQUIRED)
	//*  42   89:aload           11
	//*  43   91:invokevirtual   #73  <Method NetworkType Constraints.getRequiredNetworkType()>
	//*  44   94:getstatic       #79  <Field NetworkType NetworkType.NOT_REQUIRED>
	//*  45   97:if_acmpeq       105
							flag = true;
	//   46  100:iconst_1        
	//   47  101:istore_2        
						else
	//*  48  102:goto            107
							flag = false;
	//   49  105:iconst_0        
	//   50  106:istore_2        
						flag6 = flag1 | flag;
	//   51  107:iload_3         
	//   52  108:iload_2         
	//   53  109:ior             
	//   54  110:istore          8
						flag4 = flag5;
	//   55  112:iload           7
	//   56  114:istore          6
						flag3 = flag7;
	//   57  116:iload           9
	//   58  118:istore          5
						flag2 = flag8;
	//   59  120:iload           10
	//   60  122:istore          4
						flag1 = flag6;
	//   61  124:iload           8
	//   62  126:istore_3        
					} while(!flag5);
	//   63  127:iload           7
	//   64  129:ifeq            21
					flag4 = flag5;
	//   65  132:iload           7
	//   66  134:istore          6
					flag3 = flag7;
	//   67  136:iload           9
	//   68  138:istore          5
					flag2 = flag8;
	//   69  140:iload           10
	//   70  142:istore          4
					flag1 = flag6;
	//   71  144:iload           8
	//   72  146:istore_3        
				} while(!flag7);
	//   73  147:iload           9
	//   74  149:ifeq            21
				flag4 = flag5;
	//   75  152:iload           7
	//   76  154:istore          6
				flag3 = flag7;
	//   77  156:iload           9
	//   78  158:istore          5
				flag2 = flag8;
	//   79  160:iload           10
	//   80  162:istore          4
				flag1 = flag6;
	//   81  164:iload           8
	//   82  166:istore_3        
			} while(!flag8);
	//   83  167:iload           10
	//   84  169:ifeq            21
			flag4 = flag5;
	//   85  172:iload           7
	//   86  174:istore          6
			flag3 = flag7;
	//   87  176:iload           9
	//   88  178:istore          5
			flag2 = flag8;
	//   89  180:iload           10
	//   90  182:istore          4
			flag1 = flag6;
	//   91  184:iload           8
	//   92  186:istore_3        
		} while(!flag6);
	//   93  187:iload           8
	//   94  189:ifeq            21
		context.sendBroadcast(ConstraintProxyUpdateReceiver.newConstraintProxyUpdateIntent(context, flag5, flag7, flag8, flag6));
	//   95  192:aload_0         
	//   96  193:aload_0         
	//   97  194:iload           7
	//   98  196:iload           9
	//   99  198:iload           10
	//  100  200:iload           8
	//  101  202:invokestatic    #85  <Method Intent ConstraintProxyUpdateReceiver.newConstraintProxyUpdateIntent(Context, boolean, boolean, boolean, boolean)>
	//  102  205:invokevirtual   #91  <Method void Context.sendBroadcast(Intent)>
	//  103  208:return          
	}

	public void onReceive(Context context, Intent intent)
	{
		Logger.get().debug(TAG, String.format("onReceive : %s", new Object[] {
			intent
		}), new Throwable[0]);
	//    0    0:invokestatic    #99  <Method Logger Logger.get()>
	//    1    3:getstatic       #30  <Field String TAG>
	//    2    6:ldc1            #101 <String "onReceive : %s">
	//    3    8:iconst_1        
	//    4    9:anewarray       Object[]
	//    5   12:dup             
	//    6   13:iconst_0        
	//    7   14:aload_2         
	//    8   15:aastore         
	//    9   16:invokestatic    #109 <Method String String.format(String, Object[])>
	//   10   19:iconst_0        
	//   11   20:anewarray       Throwable[]
	//   12   23:invokevirtual   #115 <Method void Logger.debug(String, String, Throwable[])>
		context.startService(CommandHandler.createConstraintsChangedIntent(context));
	//   13   26:aload_1         
	//   14   27:aload_1         
	//   15   28:invokestatic    #121 <Method Intent CommandHandler.createConstraintsChangedIntent(Context)>
	//   16   31:invokevirtual   #125 <Method android.content.ComponentName Context.startService(Intent)>
	//   17   34:pop             
	//   18   35:return          
	}

	private static final String TAG = Logger.tagWithPrefix("ConstraintProxy");

	static 
	{
	//    0    0:ldc1            #22  <String "ConstraintProxy">
	//    1    2:invokestatic    #28  <Method String Logger.tagWithPrefix(String)>
	//    2    5:putstatic       #30  <Field String TAG>
	//*   3    8:return          
	}
}
