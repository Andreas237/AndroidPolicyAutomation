// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.apollographql.apollo.internal;


// Referenced classes of package com.apollographql.apollo.internal:
//			RealApolloCall, CallState

static class RealApolloCall$3
{

	static final int $SwitchMap$com$apollographql$apollo$interceptor$ApolloInterceptor$FetchSourceType[];
	static final int $SwitchMap$com$apollographql$apollo$internal$CallState[];

	static 
	{
		$SwitchMap$com$apollographql$apollo$interceptor$ApolloInterceptor$FetchSourceType = new int[com.apollographql.apollo.interceptor..FetchSourceType.values().length];
	//    0    0:invokestatic    #19  <Method com.apollographql.apollo.interceptor.ApolloInterceptor$FetchSourceType[] com.apollographql.apollo.interceptor.ApolloInterceptor$FetchSourceType.values()>
	//    1    3:arraylength     
	//    2    4:newarray        int[]
	//    3    6:putstatic       #21  <Field int[] $SwitchMap$com$apollographql$apollo$interceptor$ApolloInterceptor$FetchSourceType>
		try
		{
			$SwitchMap$com$apollographql$apollo$interceptor$ApolloInterceptor$FetchSourceType[com.apollographql.apollo.interceptor..FetchSourceType.CACHE.ordinal()] = 1;
	//    4    9:getstatic       #21  <Field int[] $SwitchMap$com$apollographql$apollo$interceptor$ApolloInterceptor$FetchSourceType>
	//    5   12:getstatic       #25  <Field com.apollographql.apollo.interceptor.ApolloInterceptor$FetchSourceType com.apollographql.apollo.interceptor.ApolloInterceptor$FetchSourceType.CACHE>
	//    6   15:invokevirtual   #29  <Method int com.apollographql.apollo.interceptor.ApolloInterceptor$FetchSourceType.ordinal()>
	//    7   18:iconst_1        
	//    8   19:iastore         
		}
	//*   9   20:getstatic       #21  <Field int[] $SwitchMap$com$apollographql$apollo$interceptor$ApolloInterceptor$FetchSourceType>
	//*  10   23:getstatic       #32  <Field com.apollographql.apollo.interceptor.ApolloInterceptor$FetchSourceType com.apollographql.apollo.interceptor.ApolloInterceptor$FetchSourceType.NETWORK>
	//*  11   26:invokevirtual   #29  <Method int com.apollographql.apollo.interceptor.ApolloInterceptor$FetchSourceType.ordinal()>
	//*  12   29:iconst_2        
	//*  13   30:iastore         
	//*  14   31:invokestatic    #37  <Method CallState[] CallState.values()>
	//*  15   34:arraylength     
	//*  16   35:newarray        int[]
	//*  17   37:putstatic       #39  <Field int[] $SwitchMap$com$apollographql$apollo$internal$CallState>
	//*  18   40:getstatic       #39  <Field int[] $SwitchMap$com$apollographql$apollo$internal$CallState>
	//*  19   43:getstatic       #43  <Field CallState CallState.ACTIVE>
	//*  20   46:invokevirtual   #44  <Method int CallState.ordinal()>
	//*  21   49:iconst_1        
	//*  22   50:iastore         
	//*  23   51:getstatic       #39  <Field int[] $SwitchMap$com$apollographql$apollo$internal$CallState>
	//*  24   54:getstatic       #47  <Field CallState CallState.IDLE>
	//*  25   57:invokevirtual   #44  <Method int CallState.ordinal()>
	//*  26   60:iconst_2        
	//*  27   61:iastore         
	//*  28   62:getstatic       #39  <Field int[] $SwitchMap$com$apollographql$apollo$internal$CallState>
	//*  29   65:getstatic       #50  <Field CallState CallState.CANCELED>
	//*  30   68:invokevirtual   #44  <Method int CallState.ordinal()>
	//*  31   71:iconst_3        
	//*  32   72:iastore         
	//*  33   73:getstatic       #39  <Field int[] $SwitchMap$com$apollographql$apollo$internal$CallState>
	//*  34   76:getstatic       #53  <Field CallState CallState.TERMINATED>
	//*  35   79:invokevirtual   #44  <Method int CallState.ordinal()>
	//*  36   82:iconst_4        
	//*  37   83:iastore         
	//*  38   84:return          
		catch(NoSuchFieldError nosuchfielderror) { }
	//   39   85:astore_0        
		try
		{
			$SwitchMap$com$apollographql$apollo$interceptor$ApolloInterceptor$FetchSourceType[com.apollographql.apollo.interceptor..FetchSourceType.NETWORK.ordinal()] = 2;
		}
	//*  40   86:goto            20
		catch(NoSuchFieldError nosuchfielderror1) { }
	//   41   89:astore_0        
		$SwitchMap$com$apollographql$apollo$internal$CallState = new int[CallState.values().length];
		try
		{
			$SwitchMap$com$apollographql$apollo$internal$CallState[CallState.ACTIVE.ordinal()] = 1;
		}
	//*  42   90:goto            31
		catch(NoSuchFieldError nosuchfielderror2) { }
	//   43   93:astore_0        
		try
		{
			$SwitchMap$com$apollographql$apollo$internal$CallState[CallState.IDLE.ordinal()] = 2;
		}
	//*  44   94:goto            51
		catch(NoSuchFieldError nosuchfielderror3) { }
	//   45   97:astore_0        
		try
		{
			$SwitchMap$com$apollographql$apollo$internal$CallState[CallState.CANCELED.ordinal()] = 3;
		}
	//*  46   98:goto            62
		catch(NoSuchFieldError nosuchfielderror4) { }
	//   47  101:astore_0        
		try
		{
			$SwitchMap$com$apollographql$apollo$internal$CallState[CallState.TERMINATED.ordinal()] = 4;
		}
	//*  48  102:goto            73
		catch(NoSuchFieldError nosuchfielderror5) { }
	//   49  105:astore_0        
	//*  50  106:return          
	}
}
