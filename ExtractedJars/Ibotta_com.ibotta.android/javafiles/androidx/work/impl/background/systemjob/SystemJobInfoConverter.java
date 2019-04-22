// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package androidx.work.impl.background.systemjob;

import android.app.job.JobInfo;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import androidx.work.*;
import androidx.work.impl.model.WorkSpec;
import java.util.Iterator;

// Referenced classes of package androidx.work.impl.background.systemjob:
//			SystemJobService

class SystemJobInfoConverter
{

	SystemJobInfoConverter(Context context)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void Object()>
		mWorkServiceComponent = new ComponentName(context.getApplicationContext(), androidx/work/impl/background/systemjob/SystemJobService);
	//    2    4:aload_0         
	//    3    5:new             #26  <Class ComponentName>
	//    4    8:dup             
	//    5    9:aload_1         
	//    6   10:invokevirtual   #32  <Method Context Context.getApplicationContext()>
	//    7   13:ldc1            #34  <Class SystemJobService>
	//    8   15:invokespecial   #37  <Method void ComponentName(Context, Class)>
	//    9   18:putfield        #39  <Field ComponentName mWorkServiceComponent>
	//   10   21:return          
	}

	private static android.app.job.JobInfo.TriggerContentUri convertContentUriTrigger(androidx.work.ContentUriTriggers.Trigger trigger)
	{
		throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
	//    0    0:new             #47  <Class RuntimeException>
	//    1    3:dup             
	//    2    4:ldc1            #49  <String "d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n">
	//    3    6:invokespecial   #54  <Method void Runtime(String)>
	//    4    9:athrow          
	}

	static int convertNetworkType(NetworkType networktype)
	{
		static class _cls1
		{

			static final int $SwitchMap$androidx$work$NetworkType[];

			static 
			{
				$SwitchMap$androidx$work$NetworkType = new int[NetworkType.values().length];
			//    0    0:invokestatic    #18  <Method NetworkType[] NetworkType.values()>
			//    1    3:arraylength     
			//    2    4:newarray        int[]
			//    3    6:putstatic       #20  <Field int[] $SwitchMap$androidx$work$NetworkType>
				try
				{
					$SwitchMap$androidx$work$NetworkType[NetworkType.NOT_REQUIRED.ordinal()] = 1;
			//    4    9:getstatic       #20  <Field int[] $SwitchMap$androidx$work$NetworkType>
			//    5   12:getstatic       #24  <Field NetworkType NetworkType.NOT_REQUIRED>
			//    6   15:invokevirtual   #28  <Method int NetworkType.ordinal()>
			//    7   18:iconst_1        
			//    8   19:iastore         
				}
			//*   9   20:getstatic       #20  <Field int[] $SwitchMap$androidx$work$NetworkType>
			//*  10   23:getstatic       #31  <Field NetworkType NetworkType.CONNECTED>
			//*  11   26:invokevirtual   #28  <Method int NetworkType.ordinal()>
			//*  12   29:iconst_2        
			//*  13   30:iastore         
			//*  14   31:getstatic       #20  <Field int[] $SwitchMap$androidx$work$NetworkType>
			//*  15   34:getstatic       #34  <Field NetworkType NetworkType.UNMETERED>
			//*  16   37:invokevirtual   #28  <Method int NetworkType.ordinal()>
			//*  17   40:iconst_3        
			//*  18   41:iastore         
			//*  19   42:getstatic       #20  <Field int[] $SwitchMap$androidx$work$NetworkType>
			//*  20   45:getstatic       #37  <Field NetworkType NetworkType.NOT_ROAMING>
			//*  21   48:invokevirtual   #28  <Method int NetworkType.ordinal()>
			//*  22   51:iconst_4        
			//*  23   52:iastore         
			//*  24   53:getstatic       #20  <Field int[] $SwitchMap$androidx$work$NetworkType>
			//*  25   56:getstatic       #40  <Field NetworkType NetworkType.METERED>
			//*  26   59:invokevirtual   #28  <Method int NetworkType.ordinal()>
			//*  27   62:iconst_5        
			//*  28   63:iastore         
			//*  29   64:return          
				catch(NoSuchFieldError nosuchfielderror) { }
			//   30   65:astore_0        
				try
				{
					$SwitchMap$androidx$work$NetworkType[NetworkType.CONNECTED.ordinal()] = 2;
				}
			//*  31   66:goto            20
				catch(NoSuchFieldError nosuchfielderror1) { }
			//   32   69:astore_0        
				try
				{
					$SwitchMap$androidx$work$NetworkType[NetworkType.UNMETERED.ordinal()] = 3;
				}
			//*  33   70:goto            31
				catch(NoSuchFieldError nosuchfielderror2) { }
			//   34   73:astore_0        
				try
				{
					$SwitchMap$androidx$work$NetworkType[NetworkType.NOT_ROAMING.ordinal()] = 4;
				}
			//*  35   74:goto            42
				catch(NoSuchFieldError nosuchfielderror3) { }
			//   36   77:astore_0        
				try
				{
					$SwitchMap$androidx$work$NetworkType[NetworkType.METERED.ordinal()] = 5;
				}
			//*  37   78:goto            53
				catch(NoSuchFieldError nosuchfielderror4) { }
			//   38   81:astore_0        
			//*  39   82:return          
			}
		}

		switch(_cls1..SwitchMap.androidx.work.NetworkType[networktype.ordinal()])
	//*   0    0:getstatic       #60  <Field int[] SystemJobInfoConverter$1.$SwitchMap$androidx$work$NetworkType>
	//*   1    3:aload_0         
	//*   2    4:invokevirtual   #66  <Method int NetworkType.ordinal()>
	//*   3    7:iaload          
		{
		default:
			break;

	//*   4    8:tableswitch     1 5: default 44
	//	               1 71
	//	               2 69
	//	               3 67
	//	               4 57
	//	               5 47
	//*   5   44:goto            73
		case 5: // '\005'
			if(android.os.Build.VERSION.SDK_INT >= 26)
	//*   6   47:getstatic       #72  <Field int android.os.Build$VERSION.SDK_INT>
	//*   7   50:bipush          26
	//*   8   52:icmplt          73
				return 4;
	//    9   55:iconst_4        
	//   10   56:ireturn         
			break;

		case 4: // '\004'
			if(android.os.Build.VERSION.SDK_INT >= 24)
	//*  11   57:getstatic       #72  <Field int android.os.Build$VERSION.SDK_INT>
	//*  12   60:bipush          24
	//*  13   62:icmplt          73
				return 3;
	//   14   65:iconst_3        
	//   15   66:ireturn         
			break;

		case 3: // '\003'
			return 2;
	//   16   67:iconst_2        
	//   17   68:ireturn         

		case 2: // '\002'
			return 1;
	//   18   69:iconst_1        
	//   19   70:ireturn         

		case 1: // '\001'
			return 0;
	//   20   71:iconst_0        
	//   21   72:ireturn         
		}
		Logger.debug("SystemJobInfoConverter", String.format("API version too low. Cannot convert network type value %s", new Object[] {
			networktype
		}), new Throwable[0]);
	//   22   73:ldc1            #74  <String "SystemJobInfoConverter">
	//   23   75:ldc1            #76  <String "API version too low. Cannot convert network type value %s">
	//   24   77:iconst_1        
	//   25   78:anewarray       Object[]
	//   26   81:dup             
	//   27   82:iconst_0        
	//   28   83:aload_0         
	//   29   84:aastore         
	//   30   85:invokestatic    #82  <Method String String.format(String, Object[])>
	//   31   88:iconst_0        
	//   32   89:anewarray       Throwable[]
	//   33   92:invokestatic    #90  <Method void Logger.debug(String, String, Throwable[])>
		return 1;
	//   34   95:iconst_1        
	//   35   96:ireturn         
	}

	JobInfo convert(WorkSpec workspec, int i)
	{
		Constraints constraints = workspec.constraints;
	//    0    0:aload_1         
	//    1    1:getfield        #98  <Field Constraints WorkSpec.constraints>
	//    2    4:astore          4
		int j = convertNetworkType(constraints.getRequiredNetworkType());
	//    3    6:aload           4
	//    4    8:invokevirtual   #104 <Method NetworkType Constraints.getRequiredNetworkType()>
	//    5   11:invokestatic    #106 <Method int convertNetworkType(NetworkType)>
	//    6   14:istore_3        
		Object obj = ((Object) (new PersistableBundle()));
	//    7   15:new             #108 <Class PersistableBundle>
	//    8   18:dup             
	//    9   19:invokespecial   #109 <Method void PersistableBundle()>
	//   10   22:astore          5
		((PersistableBundle) (obj)).putString("EXTRA_WORK_SPEC_ID", workspec.id);
	//   11   24:aload           5
	//   12   26:ldc1            #111 <String "EXTRA_WORK_SPEC_ID">
	//   13   28:aload_1         
	//   14   29:getfield        #115 <Field String WorkSpec.id>
	//   15   32:invokevirtual   #119 <Method void PersistableBundle.putString(String, String)>
		((PersistableBundle) (obj)).putBoolean("EXTRA_IS_PERIODIC", workspec.isPeriodic());
	//   16   35:aload           5
	//   17   37:ldc1            #121 <String "EXTRA_IS_PERIODIC">
	//   18   39:aload_1         
	//   19   40:invokevirtual   #125 <Method boolean WorkSpec.isPeriodic()>
	//   20   43:invokevirtual   #129 <Method void PersistableBundle.putBoolean(String, boolean)>
		obj = ((Object) ((new android.app.job.JobInfo.Builder(i, mWorkServiceComponent)).setRequiredNetworkType(j).setRequiresCharging(constraints.requiresCharging()).setRequiresDeviceIdle(constraints.requiresDeviceIdle()).setExtras(((PersistableBundle) (obj)))));
	//   21   46:new             #131 <Class android.app.job.JobInfo$Builder>
	//   22   49:dup             
	//   23   50:iload_2         
	//   24   51:aload_0         
	//   25   52:getfield        #39  <Field ComponentName mWorkServiceComponent>
	//   26   55:invokespecial   #134 <Method void android.app.job.JobInfo$Builder(int, ComponentName)>
	//   27   58:iload_3         
	//   28   59:invokevirtual   #138 <Method android.app.job.JobInfo$Builder android.app.job.JobInfo$Builder.setRequiredNetworkType(int)>
	//   29   62:aload           4
	//   30   64:invokevirtual   #141 <Method boolean Constraints.requiresCharging()>
	//   31   67:invokevirtual   #145 <Method android.app.job.JobInfo$Builder android.app.job.JobInfo$Builder.setRequiresCharging(boolean)>
	//   32   70:aload           4
	//   33   72:invokevirtual   #148 <Method boolean Constraints.requiresDeviceIdle()>
	//   34   75:invokevirtual   #151 <Method android.app.job.JobInfo$Builder android.app.job.JobInfo$Builder.setRequiresDeviceIdle(boolean)>
	//   35   78:aload           5
	//   36   80:invokevirtual   #155 <Method android.app.job.JobInfo$Builder android.app.job.JobInfo$Builder.setExtras(PersistableBundle)>
	//   37   83:astore          5
		if(!constraints.requiresDeviceIdle())
	//*  38   85:aload           4
	//*  39   87:invokevirtual   #148 <Method boolean Constraints.requiresDeviceIdle()>
	//*  40   90:ifne            121
		{
			if(workspec.backoffPolicy == BackoffPolicy.LINEAR)
	//*  41   93:aload_1         
	//*  42   94:getfield        #159 <Field BackoffPolicy WorkSpec.backoffPolicy>
	//*  43   97:getstatic       #164 <Field BackoffPolicy BackoffPolicy.LINEAR>
	//*  44  100:if_acmpne       108
				i = 0;
	//   45  103:iconst_0        
	//   46  104:istore_2        
			else
	//*  47  105:goto            110
				i = 1;
	//   48  108:iconst_1        
	//   49  109:istore_2        
			((android.app.job.JobInfo.Builder) (obj)).setBackoffCriteria(workspec.backoffDelayDuration, i);
	//   50  110:aload           5
	//   51  112:aload_1         
	//   52  113:getfield        #168 <Field long WorkSpec.backoffDelayDuration>
	//   53  116:iload_2         
	//   54  117:invokevirtual   #172 <Method android.app.job.JobInfo$Builder android.app.job.JobInfo$Builder.setBackoffCriteria(long, int)>
	//   55  120:pop             
		}
		if(workspec.isPeriodic())
	//*  56  121:aload_1         
	//*  57  122:invokevirtual   #125 <Method boolean WorkSpec.isPeriodic()>
	//*  58  125:ifeq            177
		{
			if(android.os.Build.VERSION.SDK_INT >= 24)
	//*  59  128:getstatic       #72  <Field int android.os.Build$VERSION.SDK_INT>
	//*  60  131:bipush          24
	//*  61  133:icmplt          153
			{
				((android.app.job.JobInfo.Builder) (obj)).setPeriodic(workspec.intervalDuration, workspec.flexDuration);
	//   62  136:aload           5
	//   63  138:aload_1         
	//   64  139:getfield        #175 <Field long WorkSpec.intervalDuration>
	//   65  142:aload_1         
	//   66  143:getfield        #178 <Field long WorkSpec.flexDuration>
	//   67  146:invokevirtual   #182 <Method android.app.job.JobInfo$Builder android.app.job.JobInfo$Builder.setPeriodic(long, long)>
	//   68  149:pop             
			} else
	//*  69  150:goto            187
			{
				Logger.debug("SystemJobInfoConverter", "Flex duration is currently not supported before API 24. Ignoring.", new Throwable[0]);
	//   70  153:ldc1            #74  <String "SystemJobInfoConverter">
	//   71  155:ldc1            #184 <String "Flex duration is currently not supported before API 24. Ignoring.">
	//   72  157:iconst_0        
	//   73  158:anewarray       Throwable[]
	//   74  161:invokestatic    #90  <Method void Logger.debug(String, String, Throwable[])>
				((android.app.job.JobInfo.Builder) (obj)).setPeriodic(workspec.intervalDuration);
	//   75  164:aload           5
	//   76  166:aload_1         
	//   77  167:getfield        #175 <Field long WorkSpec.intervalDuration>
	//   78  170:invokevirtual   #187 <Method android.app.job.JobInfo$Builder android.app.job.JobInfo$Builder.setPeriodic(long)>
	//   79  173:pop             
			}
		} else
	//*  80  174:goto            187
		{
			((android.app.job.JobInfo.Builder) (obj)).setMinimumLatency(workspec.initialDelay);
	//   81  177:aload           5
	//   82  179:aload_1         
	//   83  180:getfield        #190 <Field long WorkSpec.initialDelay>
	//   84  183:invokevirtual   #193 <Method android.app.job.JobInfo$Builder android.app.job.JobInfo$Builder.setMinimumLatency(long)>
	//   85  186:pop             
		}
		if(android.os.Build.VERSION.SDK_INT >= 24 && constraints.hasContentUriTriggers())
	//*  86  187:getstatic       #72  <Field int android.os.Build$VERSION.SDK_INT>
	//*  87  190:bipush          24
	//*  88  192:icmplt          242
	//*  89  195:aload           4
	//*  90  197:invokevirtual   #196 <Method boolean Constraints.hasContentUriTriggers()>
	//*  91  200:ifeq            242
			for(workspec = ((WorkSpec) (constraints.getContentUriTriggers().iterator())); ((Iterator) (workspec)).hasNext(); ((android.app.job.JobInfo.Builder) (obj)).addTriggerContentUri(convertContentUriTrigger((androidx.work.ContentUriTriggers.Trigger)((Iterator) (workspec)).next())));
	//   92  203:aload           4
	//   93  205:invokevirtual   #200 <Method ContentUriTriggers Constraints.getContentUriTriggers()>
	//   94  208:invokevirtual   #206 <Method Iterator ContentUriTriggers.iterator()>
	//   95  211:astore_1        
	//   96  212:aload_1         
	//   97  213:invokeinterface #211 <Method boolean Iterator.hasNext()>
	//   98  218:ifeq            242
	//   99  221:aload           5
	//  100  223:aload_1         
	//  101  224:invokeinterface #215 <Method Object Iterator.next()>
	//  102  229:checkcast       #217 <Class androidx.work.ContentUriTriggers$Trigger>
	//  103  232:invokestatic    #219 <Method android.app.job.JobInfo$TriggerContentUri convertContentUriTrigger(androidx.work.ContentUriTriggers$Trigger)>
	//  104  235:invokevirtual   #223 <Method android.app.job.JobInfo$Builder android.app.job.JobInfo$Builder.addTriggerContentUri(android.app.job.JobInfo$TriggerContentUri)>
	//  105  238:pop             
	//* 106  239:goto            212
		((android.app.job.JobInfo.Builder) (obj)).setPersisted(false);
	//  107  242:aload           5
	//  108  244:iconst_0        
	//  109  245:invokevirtual   #226 <Method android.app.job.JobInfo$Builder android.app.job.JobInfo$Builder.setPersisted(boolean)>
	//  110  248:pop             
		if(android.os.Build.VERSION.SDK_INT >= 26)
	//* 111  249:getstatic       #72  <Field int android.os.Build$VERSION.SDK_INT>
	//* 112  252:bipush          26
	//* 113  254:icmplt          279
		{
			((android.app.job.JobInfo.Builder) (obj)).setRequiresBatteryNotLow(constraints.requiresBatteryNotLow());
	//  114  257:aload           5
	//  115  259:aload           4
	//  116  261:invokevirtual   #229 <Method boolean Constraints.requiresBatteryNotLow()>
	//  117  264:invokevirtual   #232 <Method android.app.job.JobInfo$Builder android.app.job.JobInfo$Builder.setRequiresBatteryNotLow(boolean)>
	//  118  267:pop             
			((android.app.job.JobInfo.Builder) (obj)).setRequiresStorageNotLow(constraints.requiresStorageNotLow());
	//  119  268:aload           5
	//  120  270:aload           4
	//  121  272:invokevirtual   #235 <Method boolean Constraints.requiresStorageNotLow()>
	//  122  275:invokevirtual   #238 <Method android.app.job.JobInfo$Builder android.app.job.JobInfo$Builder.setRequiresStorageNotLow(boolean)>
	//  123  278:pop             
		}
		return ((android.app.job.JobInfo.Builder) (obj)).build();
	//  124  279:aload           5
	//  125  281:invokevirtual   #242 <Method JobInfo android.app.job.JobInfo$Builder.build()>
	//  126  284:areturn         
	}

	private final ComponentName mWorkServiceComponent;
}
