// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.apollographql.apollo.internal.response;


// Referenced classes of package com.apollographql.apollo.internal.response:
//			RealResponseWriter

static class RealResponseWriter$1
{

	static final int $SwitchMap$com$apollographql$apollo$api$ResponseField$Type[];

	static 
	{
		$SwitchMap$com$apollographql$apollo$api$ResponseField$Type = new int[com.apollographql.apollo.api.ResponseField.Type.values().length];
	//    0    0:invokestatic    #18  <Method com.apollographql.apollo.api.ResponseField$Type[] com.apollographql.apollo.api.ResponseField$Type.values()>
	//    1    3:arraylength     
	//    2    4:newarray        int[]
	//    3    6:putstatic       #20  <Field int[] $SwitchMap$com$apollographql$apollo$api$ResponseField$Type>
		try
		{
			$SwitchMap$com$apollographql$apollo$api$ResponseField$Type[com.apollographql.apollo.api.ResponseField.Type.OBJECT.ordinal()] = 1;
	//    4    9:getstatic       #20  <Field int[] $SwitchMap$com$apollographql$apollo$api$ResponseField$Type>
	//    5   12:getstatic       #24  <Field com.apollographql.apollo.api.ResponseField$Type com.apollographql.apollo.api.ResponseField$Type.OBJECT>
	//    6   15:invokevirtual   #28  <Method int com.apollographql.apollo.api.ResponseField$Type.ordinal()>
	//    7   18:iconst_1        
	//    8   19:iastore         
		}
	//*   9   20:getstatic       #20  <Field int[] $SwitchMap$com$apollographql$apollo$api$ResponseField$Type>
	//*  10   23:getstatic       #31  <Field com.apollographql.apollo.api.ResponseField$Type com.apollographql.apollo.api.ResponseField$Type.LIST>
	//*  11   26:invokevirtual   #28  <Method int com.apollographql.apollo.api.ResponseField$Type.ordinal()>
	//*  12   29:iconst_2        
	//*  13   30:iastore         
	//*  14   31:return          
		catch(NoSuchFieldError nosuchfielderror) { }
	//   15   32:astore_0        
		try
		{
			$SwitchMap$com$apollographql$apollo$api$ResponseField$Type[com.apollographql.apollo.api.ResponseField.Type.LIST.ordinal()] = 2;
		}
	//*  16   33:goto            20
		catch(NoSuchFieldError nosuchfielderror1) { }
	//   17   36:astore_0        
	//*  18   37:return          
	}
}
