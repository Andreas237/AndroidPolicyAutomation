// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.apollographql.apollo.interceptor;


// Referenced classes of package com.apollographql.apollo.interceptor:
//			ApolloInterceptor

public static final class ApolloInterceptor$FetchSourceType extends Enum
{

	public static ApolloInterceptor$FetchSourceType valueOf(String s)
	{
		return (ApolloInterceptor$FetchSourceType)Enum.valueOf(com/apollographql/apollo/interceptor/ApolloInterceptor$FetchSourceType, s);
	//    0    0:ldc1            #2   <Class ApolloInterceptor$FetchSourceType>
	//    1    2:aload_0         
	//    2    3:invokestatic    #35  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class ApolloInterceptor$FetchSourceType>
	//    4    9:areturn         
	}

	public static ApolloInterceptor$FetchSourceType[] values()
	{
		return (ApolloInterceptor$FetchSourceType[])((ApolloInterceptor$FetchSourceType []) ($VALUES)).clone();
	//    0    0:getstatic       #27  <Field ApolloInterceptor$FetchSourceType[] $VALUES>
	//    1    3:invokevirtual   #42  <Method Object _5B_Lcom.apollographql.apollo.interceptor.ApolloInterceptor$FetchSourceType_3B_.clone()>
	//    2    6:checkcast       #38  <Class ApolloInterceptor$FetchSourceType[]>
	//    3    9:areturn         
	}

	private static final ApolloInterceptor$FetchSourceType $VALUES[];
	public static final ApolloInterceptor$FetchSourceType CACHE;
	public static final ApolloInterceptor$FetchSourceType NETWORK;

	static 
	{
		CACHE = new ApolloInterceptor$FetchSourceType("CACHE", 0);
	//    0    0:new             #2   <Class ApolloInterceptor$FetchSourceType>
	//    1    3:dup             
	//    2    4:ldc1            #16  <String "CACHE">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #20  <Method void ApolloInterceptor$FetchSourceType(String, int)>
	//    5   10:putstatic       #22  <Field ApolloInterceptor$FetchSourceType CACHE>
		NETWORK = new ApolloInterceptor$FetchSourceType("NETWORK", 1);
	//    6   13:new             #2   <Class ApolloInterceptor$FetchSourceType>
	//    7   16:dup             
	//    8   17:ldc1            #23  <String "NETWORK">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #20  <Method void ApolloInterceptor$FetchSourceType(String, int)>
	//   11   23:putstatic       #25  <Field ApolloInterceptor$FetchSourceType NETWORK>
		$VALUES = (new ApolloInterceptor$FetchSourceType[] {
			CACHE, NETWORK
		});
	//   12   26:iconst_2        
	//   13   27:anewarray       ApolloInterceptor$FetchSourceType[]
	//   14   30:dup             
	//   15   31:iconst_0        
	//   16   32:getstatic       #22  <Field ApolloInterceptor$FetchSourceType CACHE>
	//   17   35:aastore         
	//   18   36:dup             
	//   19   37:iconst_1        
	//   20   38:getstatic       #25  <Field ApolloInterceptor$FetchSourceType NETWORK>
	//   21   41:aastore         
	//   22   42:putstatic       #27  <Field ApolloInterceptor$FetchSourceType[] $VALUES>
	//*  23   45:return          
	}

	private ApolloInterceptor$FetchSourceType(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #29  <Method void Enum(String, int)>
	//    4    6:return          
	}
}
