// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.apollographql.apollo.internal;


// Referenced classes of package com.apollographql.apollo.internal:
//			RealApolloSubscriptionCall, CallState

static class RealApolloSubscriptionCall$1
{

	static final int $SwitchMap$com$apollographql$apollo$internal$CallState[];

	static 
	{
		$SwitchMap$com$apollographql$apollo$internal$CallState = new int[CallState.values().length];
	//    0    0:invokestatic    #18  <Method CallState[] CallState.values()>
	//    1    3:arraylength     
	//    2    4:newarray        int[]
	//    3    6:putstatic       #20  <Field int[] $SwitchMap$com$apollographql$apollo$internal$CallState>
		try
		{
			$SwitchMap$com$apollographql$apollo$internal$CallState[CallState.IDLE.ordinal()] = 1;
	//    4    9:getstatic       #20  <Field int[] $SwitchMap$com$apollographql$apollo$internal$CallState>
	//    5   12:getstatic       #24  <Field CallState CallState.IDLE>
	//    6   15:invokevirtual   #28  <Method int CallState.ordinal()>
	//    7   18:iconst_1        
	//    8   19:iastore         
		}
	//*   9   20:getstatic       #20  <Field int[] $SwitchMap$com$apollographql$apollo$internal$CallState>
	//*  10   23:getstatic       #31  <Field CallState CallState.CANCELED>
	//*  11   26:invokevirtual   #28  <Method int CallState.ordinal()>
	//*  12   29:iconst_2        
	//*  13   30:iastore         
	//*  14   31:getstatic       #20  <Field int[] $SwitchMap$com$apollographql$apollo$internal$CallState>
	//*  15   34:getstatic       #34  <Field CallState CallState.TERMINATED>
	//*  16   37:invokevirtual   #28  <Method int CallState.ordinal()>
	//*  17   40:iconst_3        
	//*  18   41:iastore         
	//*  19   42:getstatic       #20  <Field int[] $SwitchMap$com$apollographql$apollo$internal$CallState>
	//*  20   45:getstatic       #37  <Field CallState CallState.ACTIVE>
	//*  21   48:invokevirtual   #28  <Method int CallState.ordinal()>
	//*  22   51:iconst_4        
	//*  23   52:iastore         
	//*  24   53:return          
		catch(NoSuchFieldError nosuchfielderror) { }
	//   25   54:astore_0        
		try
		{
			$SwitchMap$com$apollographql$apollo$internal$CallState[CallState.CANCELED.ordinal()] = 2;
		}
	//*  26   55:goto            20
		catch(NoSuchFieldError nosuchfielderror1) { }
	//   27   58:astore_0        
		try
		{
			$SwitchMap$com$apollographql$apollo$internal$CallState[CallState.TERMINATED.ordinal()] = 3;
		}
	//*  28   59:goto            31
		catch(NoSuchFieldError nosuchfielderror2) { }
	//   29   62:astore_0        
		try
		{
			$SwitchMap$com$apollographql$apollo$internal$CallState[CallState.ACTIVE.ordinal()] = 4;
		}
	//*  30   63:goto            42
		catch(NoSuchFieldError nosuchfielderror3) { }
	//   31   66:astore_0        
	//*  32   67:return          
	}
}
