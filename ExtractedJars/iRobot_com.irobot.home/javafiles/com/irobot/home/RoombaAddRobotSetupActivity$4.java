// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import com.irobot.core.AddRobotServiceDataState;

// Referenced classes of package com.irobot.home:
//			RoombaAddRobotSetupActivity

static class RoombaAddRobotSetupActivity$4
{

	static final int a[];

	static 
	{
		a = new int[AddRobotServiceDataState.values().length];
	//    0    0:invokestatic    #18  <Method AddRobotServiceDataState[] AddRobotServiceDataState.values()>
	//    1    3:arraylength     
	//    2    4:newarray        int[]
	//    3    6:putstatic       #20  <Field int[] a>
		try
		{
			a[AddRobotServiceDataState.AddRobotStarted.ordinal()] = 1;
	//    4    9:getstatic       #20  <Field int[] a>
	//    5   12:getstatic       #24  <Field AddRobotServiceDataState AddRobotServiceDataState.AddRobotStarted>
	//    6   15:invokevirtual   #28  <Method int AddRobotServiceDataState.ordinal()>
	//    7   18:iconst_1        
	//    8   19:iastore         
		}
	//*   9   20:getstatic       #20  <Field int[] a>
	//*  10   23:getstatic       #31  <Field AddRobotServiceDataState AddRobotServiceDataState.AddRobotConnectedToAsset>
	//*  11   26:invokevirtual   #28  <Method int AddRobotServiceDataState.ordinal()>
	//*  12   29:iconst_2        
	//*  13   30:iastore         
	//*  14   31:getstatic       #20  <Field int[] a>
	//*  15   34:getstatic       #34  <Field AddRobotServiceDataState AddRobotServiceDataState.AddRobotInProgress>
	//*  16   37:invokevirtual   #28  <Method int AddRobotServiceDataState.ordinal()>
	//*  17   40:iconst_3        
	//*  18   41:iastore         
	//*  19   42:getstatic       #20  <Field int[] a>
	//*  20   45:getstatic       #37  <Field AddRobotServiceDataState AddRobotServiceDataState.PasswordAvailable>
	//*  21   48:invokevirtual   #28  <Method int AddRobotServiceDataState.ordinal()>
	//*  22   51:iconst_4        
	//*  23   52:iastore         
	//*  24   53:getstatic       #20  <Field int[] a>
	//*  25   56:getstatic       #40  <Field AddRobotServiceDataState AddRobotServiceDataState.AddRobotFinished>
	//*  26   59:invokevirtual   #28  <Method int AddRobotServiceDataState.ordinal()>
	//*  27   62:iconst_5        
	//*  28   63:iastore         
	//*  29   64:getstatic       #20  <Field int[] a>
	//*  30   67:getstatic       #43  <Field AddRobotServiceDataState AddRobotServiceDataState.AddRobotBadState>
	//*  31   70:invokevirtual   #28  <Method int AddRobotServiceDataState.ordinal()>
	//*  32   73:bipush          6
	//*  33   75:iastore         
	//*  34   76:getstatic       #20  <Field int[] a>
	//*  35   79:getstatic       #46  <Field AddRobotServiceDataState AddRobotServiceDataState.AddRobotSslHandshakeError>
	//*  36   82:invokevirtual   #28  <Method int AddRobotServiceDataState.ordinal()>
	//*  37   85:bipush          7
	//*  38   87:iastore         
	//*  39   88:getstatic       #20  <Field int[] a>
	//*  40   91:getstatic       #49  <Field AddRobotServiceDataState AddRobotServiceDataState.AddRobotTimedOutConnecting>
	//*  41   94:invokevirtual   #28  <Method int AddRobotServiceDataState.ordinal()>
	//*  42   97:bipush          8
	//*  43   99:iastore         
	//*  44  100:getstatic       #20  <Field int[] a>
	//*  45  103:getstatic       #52  <Field AddRobotServiceDataState AddRobotServiceDataState.AddRobotTimedOutGettingPassword>
	//*  46  106:invokevirtual   #28  <Method int AddRobotServiceDataState.ordinal()>
	//*  47  109:bipush          9
	//*  48  111:iastore         
	//*  49  112:return          
		catch(NoSuchFieldError nosuchfielderror) { }
	//   50  113:astore_0        
		try
		{
			a[AddRobotServiceDataState.AddRobotConnectedToAsset.ordinal()] = 2;
		}
	//*  51  114:goto            20
		catch(NoSuchFieldError nosuchfielderror1) { }
	//   52  117:astore_0        
		try
		{
			a[AddRobotServiceDataState.AddRobotInProgress.ordinal()] = 3;
		}
	//*  53  118:goto            31
		catch(NoSuchFieldError nosuchfielderror2) { }
	//   54  121:astore_0        
		try
		{
			a[AddRobotServiceDataState.PasswordAvailable.ordinal()] = 4;
		}
	//*  55  122:goto            42
		catch(NoSuchFieldError nosuchfielderror3) { }
	//   56  125:astore_0        
		try
		{
			a[AddRobotServiceDataState.AddRobotFinished.ordinal()] = 5;
		}
	//*  57  126:goto            53
		catch(NoSuchFieldError nosuchfielderror4) { }
	//   58  129:astore_0        
		try
		{
			a[AddRobotServiceDataState.AddRobotBadState.ordinal()] = 6;
		}
	//*  59  130:goto            64
		catch(NoSuchFieldError nosuchfielderror5) { }
	//   60  133:astore_0        
		try
		{
			a[AddRobotServiceDataState.AddRobotSslHandshakeError.ordinal()] = 7;
		}
	//*  61  134:goto            76
		catch(NoSuchFieldError nosuchfielderror6) { }
	//   62  137:astore_0        
		try
		{
			a[AddRobotServiceDataState.AddRobotTimedOutConnecting.ordinal()] = 8;
		}
	//*  63  138:goto            88
		catch(NoSuchFieldError nosuchfielderror7) { }
	//   64  141:astore_0        
		try
		{
			a[AddRobotServiceDataState.AddRobotTimedOutGettingPassword.ordinal()] = 9;
		}
	//*  65  142:goto            100
		catch(NoSuchFieldError nosuchfielderror8) { }
	//   66  145:astore_0        
	//*  67  146:return          
	}
}
