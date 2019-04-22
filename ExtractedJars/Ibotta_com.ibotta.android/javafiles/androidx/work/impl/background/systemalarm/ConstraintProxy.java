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
	//    1    1:invokespecial   #20  <Method void BroadcastReceiver()>
	//    2    4:return          
	}

	static void updateAll(Context context, List list)
	{
		list = ((List) (list.iterator()));
	//    0    0:aload_1         
	//    1    1:invokeinterface #29  <Method Iterator List.iterator()>
	//    2    6:astore_1        
		boolean flag4 = false;
	//    3    7:iconst_0        
	//    4    8:istore          6
		boolean flag3 = false;
	//    5   10:iconst_0        
	//    6   11:istore          5
		boolean flag2 = false;
	//    7   13:iconst_0        
	//    8   14:istore          4
		boolean flag1 = false;
	//    9   16:iconst_0        
	//   10   17:istore_3        
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
	//   11   18:iload           6
	//   12   20:istore          7
						flag7 = flag3;
	//   13   22:iload           5
	//   14   24:istore          9
						flag8 = flag2;
	//   15   26:iload           4
	//   16   28:istore          10
						flag6 = flag1;
	//   17   30:iload_3         
	//   18   31:istore          8
						if(!((Iterator) (list)).hasNext())
							break label0;
	//   19   33:aload_1         
	//   20   34:invokeinterface #35  <Method boolean Iterator.hasNext()>
	//   21   39:ifeq            189
						Constraints constraints = ((WorkSpec)((Iterator) (list)).next()).constraints;
	//   22   42:aload_1         
	//   23   43:invokeinterface #39  <Method Object Iterator.next()>
	//   24   48:checkcast       #41  <Class WorkSpec>
	//   25   51:getfield        #45  <Field Constraints WorkSpec.constraints>
	//   26   54:astore          11
						flag5 = flag4 | constraints.requiresBatteryNotLow();
	//   27   56:iload           6
	//   28   58:aload           11
	//   29   60:invokevirtual   #50  <Method boolean Constraints.requiresBatteryNotLow()>
	//   30   63:ior             
	//   31   64:istore          7
						flag7 = flag3 | constraints.requiresCharging();
	//   32   66:iload           5
	//   33   68:aload           11
	//   34   70:invokevirtual   #53  <Method boolean Constraints.requiresCharging()>
	//   35   73:ior             
	//   36   74:istore          9
						flag8 = flag2 | constraints.requiresStorageNotLow();
	//   37   76:iload           4
	//   38   78:aload           11
	//   39   80:invokevirtual   #56  <Method boolean Constraints.requiresStorageNotLow()>
	//   40   83:ior             
	//   41   84:istore          10
						boolean flag;
						if(constraints.getRequiredNetworkType() != NetworkType.NOT_REQUIRED)
	//*  42   86:aload           11
	//*  43   88:invokevirtual   #60  <Method NetworkType Constraints.getRequiredNetworkType()>
	//*  44   91:getstatic       #66  <Field NetworkType NetworkType.NOT_REQUIRED>
	//*  45   94:if_acmpeq       102
							flag = true;
	//   46   97:iconst_1        
	//   47   98:istore_2        
						else
	//*  48   99:goto            104
							flag = false;
	//   49  102:iconst_0        
	//   50  103:istore_2        
						flag6 = flag1 | flag;
	//   51  104:iload_3         
	//   52  105:iload_2         
	//   53  106:ior             
	//   54  107:istore          8
						flag4 = flag5;
	//   55  109:iload           7
	//   56  111:istore          6
						flag3 = flag7;
	//   57  113:iload           9
	//   58  115:istore          5
						flag2 = flag8;
	//   59  117:iload           10
	//   60  119:istore          4
						flag1 = flag6;
	//   61  121:iload           8
	//   62  123:istore_3        
					} while(!flag5);
	//   63  124:iload           7
	//   64  126:ifeq            18
					flag4 = flag5;
	//   65  129:iload           7
	//   66  131:istore          6
					flag3 = flag7;
	//   67  133:iload           9
	//   68  135:istore          5
					flag2 = flag8;
	//   69  137:iload           10
	//   70  139:istore          4
					flag1 = flag6;
	//   71  141:iload           8
	//   72  143:istore_3        
				} while(!flag7);
	//   73  144:iload           9
	//   74  146:ifeq            18
				flag4 = flag5;
	//   75  149:iload           7
	//   76  151:istore          6
				flag3 = flag7;
	//   77  153:iload           9
	//   78  155:istore          5
				flag2 = flag8;
	//   79  157:iload           10
	//   80  159:istore          4
				flag1 = flag6;
	//   81  161:iload           8
	//   82  163:istore_3        
			} while(!flag8);
	//   83  164:iload           10
	//   84  166:ifeq            18
			flag4 = flag5;
	//   85  169:iload           7
	//   86  171:istore          6
			flag3 = flag7;
	//   87  173:iload           9
	//   88  175:istore          5
			flag2 = flag8;
	//   89  177:iload           10
	//   90  179:istore          4
			flag1 = flag6;
	//   91  181:iload           8
	//   92  183:istore_3        
		} while(!flag6);
	//   93  184:iload           8
	//   94  186:ifeq            18
		context.sendBroadcast(ConstraintProxyUpdateReceiver.newConstraintProxyUpdateIntent(flag5, flag7, flag8, flag6));
	//   95  189:aload_0         
	//   96  190:iload           7
	//   97  192:iload           9
	//   98  194:iload           10
	//   99  196:iload           8
	//  100  198:invokestatic    #72  <Method Intent ConstraintProxyUpdateReceiver.newConstraintProxyUpdateIntent(boolean, boolean, boolean, boolean)>
	//  101  201:invokevirtual   #78  <Method void Context.sendBroadcast(Intent)>
	//  102  204:return          
	}

	public void onReceive(Context context, Intent intent)
	{
		Logger.debug("ConstraintProxy", String.format("onReceive : %s", new Object[] {
			intent
		}), new Throwable[0]);
	//    0    0:ldc1            #84  <String "ConstraintProxy">
	//    1    2:ldc1            #86  <String "onReceive : %s">
	//    2    4:iconst_1        
	//    3    5:anewarray       Object[]
	//    4    8:dup             
	//    5    9:iconst_0        
	//    6   10:aload_2         
	//    7   11:aastore         
	//    8   12:invokestatic    #94  <Method String String.format(String, Object[])>
	//    9   15:iconst_0        
	//   10   16:anewarray       Throwable[]
	//   11   19:invokestatic    #102 <Method void Logger.debug(String, String, Throwable[])>
		context.startService(CommandHandler.createConstraintsChangedIntent(context));
	//   12   22:aload_1         
	//   13   23:aload_1         
	//   14   24:invokestatic    #108 <Method Intent CommandHandler.createConstraintsChangedIntent(Context)>
	//   15   27:invokevirtual   #112 <Method android.content.ComponentName Context.startService(Intent)>
	//   16   30:pop             
	//   17   31:return          
	}
}
