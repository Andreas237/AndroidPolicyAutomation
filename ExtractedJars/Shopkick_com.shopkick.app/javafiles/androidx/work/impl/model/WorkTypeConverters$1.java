// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package androidx.work.impl.model;

import androidx.work.BackoffPolicy;
import androidx.work.NetworkType;

// Referenced classes of package androidx.work.impl.model:
//			WorkTypeConverters

static class WorkTypeConverters$1
{

	static final int $SwitchMap$androidx$work$BackoffPolicy[];
	static final int $SwitchMap$androidx$work$NetworkType[];
	static final int $SwitchMap$androidx$work$WorkInfo$State[];

	static 
	{
		$SwitchMap$androidx$work$NetworkType = new int[NetworkType.values().length];
	//    0    0:invokestatic    #20  <Method NetworkType[] NetworkType.values()>
	//    1    3:arraylength     
	//    2    4:newarray        int[]
	//    3    6:putstatic       #22  <Field int[] $SwitchMap$androidx$work$NetworkType>
		try
		{
			$SwitchMap$androidx$work$NetworkType[NetworkType.NOT_REQUIRED.ordinal()] = 1;
	//    4    9:getstatic       #22  <Field int[] $SwitchMap$androidx$work$NetworkType>
	//    5   12:getstatic       #26  <Field NetworkType NetworkType.NOT_REQUIRED>
	//    6   15:invokevirtual   #30  <Method int NetworkType.ordinal()>
	//    7   18:iconst_1        
	//    8   19:iastore         
		}
	//*   9   20:getstatic       #22  <Field int[] $SwitchMap$androidx$work$NetworkType>
	//*  10   23:getstatic       #33  <Field NetworkType NetworkType.CONNECTED>
	//*  11   26:invokevirtual   #30  <Method int NetworkType.ordinal()>
	//*  12   29:iconst_2        
	//*  13   30:iastore         
	//*  14   31:getstatic       #22  <Field int[] $SwitchMap$androidx$work$NetworkType>
	//*  15   34:getstatic       #36  <Field NetworkType NetworkType.UNMETERED>
	//*  16   37:invokevirtual   #30  <Method int NetworkType.ordinal()>
	//*  17   40:iconst_3        
	//*  18   41:iastore         
	//*  19   42:getstatic       #22  <Field int[] $SwitchMap$androidx$work$NetworkType>
	//*  20   45:getstatic       #39  <Field NetworkType NetworkType.NOT_ROAMING>
	//*  21   48:invokevirtual   #30  <Method int NetworkType.ordinal()>
	//*  22   51:iconst_4        
	//*  23   52:iastore         
	//*  24   53:getstatic       #22  <Field int[] $SwitchMap$androidx$work$NetworkType>
	//*  25   56:getstatic       #42  <Field NetworkType NetworkType.METERED>
	//*  26   59:invokevirtual   #30  <Method int NetworkType.ordinal()>
	//*  27   62:iconst_5        
	//*  28   63:iastore         
	//*  29   64:invokestatic    #47  <Method BackoffPolicy[] BackoffPolicy.values()>
	//*  30   67:arraylength     
	//*  31   68:newarray        int[]
	//*  32   70:putstatic       #49  <Field int[] $SwitchMap$androidx$work$BackoffPolicy>
	//*  33   73:getstatic       #49  <Field int[] $SwitchMap$androidx$work$BackoffPolicy>
	//*  34   76:getstatic       #53  <Field BackoffPolicy BackoffPolicy.EXPONENTIAL>
	//*  35   79:invokevirtual   #54  <Method int BackoffPolicy.ordinal()>
	//*  36   82:iconst_1        
	//*  37   83:iastore         
	//*  38   84:getstatic       #49  <Field int[] $SwitchMap$androidx$work$BackoffPolicy>
	//*  39   87:getstatic       #57  <Field BackoffPolicy BackoffPolicy.LINEAR>
	//*  40   90:invokevirtual   #54  <Method int BackoffPolicy.ordinal()>
	//*  41   93:iconst_2        
	//*  42   94:iastore         
	//*  43   95:invokestatic    #62  <Method androidx.work.WorkInfo$State[] androidx.work.WorkInfo$State.values()>
	//*  44   98:arraylength     
	//*  45   99:newarray        int[]
	//*  46  101:putstatic       #64  <Field int[] $SwitchMap$androidx$work$WorkInfo$State>
	//*  47  104:getstatic       #64  <Field int[] $SwitchMap$androidx$work$WorkInfo$State>
	//*  48  107:getstatic       #68  <Field androidx.work.WorkInfo$State androidx.work.WorkInfo$State.ENQUEUED>
	//*  49  110:invokevirtual   #69  <Method int androidx.work.WorkInfo$State.ordinal()>
	//*  50  113:iconst_1        
	//*  51  114:iastore         
	//*  52  115:getstatic       #64  <Field int[] $SwitchMap$androidx$work$WorkInfo$State>
	//*  53  118:getstatic       #72  <Field androidx.work.WorkInfo$State androidx.work.WorkInfo$State.RUNNING>
	//*  54  121:invokevirtual   #69  <Method int androidx.work.WorkInfo$State.ordinal()>
	//*  55  124:iconst_2        
	//*  56  125:iastore         
	//*  57  126:getstatic       #64  <Field int[] $SwitchMap$androidx$work$WorkInfo$State>
	//*  58  129:getstatic       #75  <Field androidx.work.WorkInfo$State androidx.work.WorkInfo$State.SUCCEEDED>
	//*  59  132:invokevirtual   #69  <Method int androidx.work.WorkInfo$State.ordinal()>
	//*  60  135:iconst_3        
	//*  61  136:iastore         
	//*  62  137:getstatic       #64  <Field int[] $SwitchMap$androidx$work$WorkInfo$State>
	//*  63  140:getstatic       #78  <Field androidx.work.WorkInfo$State androidx.work.WorkInfo$State.FAILED>
	//*  64  143:invokevirtual   #69  <Method int androidx.work.WorkInfo$State.ordinal()>
	//*  65  146:iconst_4        
	//*  66  147:iastore         
	//*  67  148:getstatic       #64  <Field int[] $SwitchMap$androidx$work$WorkInfo$State>
	//*  68  151:getstatic       #81  <Field androidx.work.WorkInfo$State androidx.work.WorkInfo$State.BLOCKED>
	//*  69  154:invokevirtual   #69  <Method int androidx.work.WorkInfo$State.ordinal()>
	//*  70  157:iconst_5        
	//*  71  158:iastore         
	//*  72  159:getstatic       #64  <Field int[] $SwitchMap$androidx$work$WorkInfo$State>
	//*  73  162:getstatic       #84  <Field androidx.work.WorkInfo$State androidx.work.WorkInfo$State.CANCELLED>
	//*  74  165:invokevirtual   #69  <Method int androidx.work.WorkInfo$State.ordinal()>
	//*  75  168:bipush          6
	//*  76  170:iastore         
	//*  77  171:return          
		catch(NoSuchFieldError nosuchfielderror) { }
	//   78  172:astore_0        
		try
		{
			$SwitchMap$androidx$work$NetworkType[NetworkType.CONNECTED.ordinal()] = 2;
		}
	//*  79  173:goto            20
		catch(NoSuchFieldError nosuchfielderror1) { }
	//   80  176:astore_0        
		try
		{
			$SwitchMap$androidx$work$NetworkType[NetworkType.UNMETERED.ordinal()] = 3;
		}
	//*  81  177:goto            31
		catch(NoSuchFieldError nosuchfielderror2) { }
	//   82  180:astore_0        
		try
		{
			$SwitchMap$androidx$work$NetworkType[NetworkType.NOT_ROAMING.ordinal()] = 4;
		}
	//*  83  181:goto            42
		catch(NoSuchFieldError nosuchfielderror3) { }
	//   84  184:astore_0        
		try
		{
			$SwitchMap$androidx$work$NetworkType[NetworkType.METERED.ordinal()] = 5;
		}
	//*  85  185:goto            53
		catch(NoSuchFieldError nosuchfielderror4) { }
	//   86  188:astore_0        
		$SwitchMap$androidx$work$BackoffPolicy = new int[BackoffPolicy.values().length];
		try
		{
			$SwitchMap$androidx$work$BackoffPolicy[BackoffPolicy.EXPONENTIAL.ordinal()] = 1;
		}
	//*  87  189:goto            64
		catch(NoSuchFieldError nosuchfielderror5) { }
	//   88  192:astore_0        
		try
		{
			$SwitchMap$androidx$work$BackoffPolicy[BackoffPolicy.LINEAR.ordinal()] = 2;
		}
	//*  89  193:goto            84
		catch(NoSuchFieldError nosuchfielderror6) { }
	//   90  196:astore_0        
		$SwitchMap$androidx$work$WorkInfo$State = new int[androidx.work.WorkInfo.State.values().length];
		try
		{
			$SwitchMap$androidx$work$WorkInfo$State[androidx.work.WorkInfo.State.ENQUEUED.ordinal()] = 1;
		}
	//*  91  197:goto            95
		catch(NoSuchFieldError nosuchfielderror7) { }
	//   92  200:astore_0        
		try
		{
			$SwitchMap$androidx$work$WorkInfo$State[androidx.work.WorkInfo.State.RUNNING.ordinal()] = 2;
		}
	//*  93  201:goto            115
		catch(NoSuchFieldError nosuchfielderror8) { }
	//   94  204:astore_0        
		try
		{
			$SwitchMap$androidx$work$WorkInfo$State[androidx.work.WorkInfo.State.SUCCEEDED.ordinal()] = 3;
		}
	//*  95  205:goto            126
		catch(NoSuchFieldError nosuchfielderror9) { }
	//   96  208:astore_0        
		try
		{
			$SwitchMap$androidx$work$WorkInfo$State[androidx.work.WorkInfo.State.FAILED.ordinal()] = 4;
		}
	//*  97  209:goto            137
		catch(NoSuchFieldError nosuchfielderror10) { }
	//   98  212:astore_0        
		try
		{
			$SwitchMap$androidx$work$WorkInfo$State[androidx.work.WorkInfo.State.BLOCKED.ordinal()] = 5;
		}
	//*  99  213:goto            148
		catch(NoSuchFieldError nosuchfielderror11) { }
	//  100  216:astore_0        
		try
		{
			$SwitchMap$androidx$work$WorkInfo$State[androidx.work.WorkInfo.State.CANCELLED.ordinal()] = 6;
		}
	//* 101  217:goto            159
		catch(NoSuchFieldError nosuchfielderror12) { }
	//  102  220:astore_0        
	//* 103  221:return          
	}
}
