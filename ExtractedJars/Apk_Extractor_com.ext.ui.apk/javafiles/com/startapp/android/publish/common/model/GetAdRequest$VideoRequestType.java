// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.startapp.android.publish.common.model;


// Referenced classes of package com.startapp.android.publish.common.model:
//			GetAdRequest

protected static final class GetAdRequest$VideoRequestType extends Enum
{

	public static GetAdRequest$VideoRequestType valueOf(String s)
	{
		return (GetAdRequest$VideoRequestType)Enum.valueOf(com/startapp/android/publish/common/model/GetAdRequest$VideoRequestType, s);
	//    0    0:ldc1            #2   <Class GetAdRequest$VideoRequestType>
	//    1    2:aload_0         
	//    2    3:invokestatic    #43  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class GetAdRequest$VideoRequestType>
	//    4    9:areturn         
	}

	public static GetAdRequest$VideoRequestType[] values()
	{
		return (GetAdRequest$VideoRequestType[])((GetAdRequest$VideoRequestType []) ($VALUES)).clone();
	//    0    0:getstatic       #35  <Field GetAdRequest$VideoRequestType[] $VALUES>
	//    1    3:invokevirtual   #50  <Method Object _5B_Lcom.startapp.android.publish.common.model.GetAdRequest$VideoRequestType_3B_.clone()>
	//    2    6:checkcast       #46  <Class GetAdRequest$VideoRequestType[]>
	//    3    9:areturn         
	}

	private static final GetAdRequest$VideoRequestType $VALUES[];
	public static final GetAdRequest$VideoRequestType DISABLED;
	public static final GetAdRequest$VideoRequestType ENABLED;
	public static final GetAdRequest$VideoRequestType FORCED;
	public static final GetAdRequest$VideoRequestType FORCED_NONVAST;

	static 
	{
		ENABLED = new GetAdRequest$VideoRequestType("ENABLED", 0);
	//    0    0:new             #2   <Class GetAdRequest$VideoRequestType>
	//    1    3:dup             
	//    2    4:ldc1            #18  <String "ENABLED">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #22  <Method void GetAdRequest$VideoRequestType(String, int)>
	//    5   10:putstatic       #24  <Field GetAdRequest$VideoRequestType ENABLED>
		DISABLED = new GetAdRequest$VideoRequestType("DISABLED", 1);
	//    6   13:new             #2   <Class GetAdRequest$VideoRequestType>
	//    7   16:dup             
	//    8   17:ldc1            #25  <String "DISABLED">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #22  <Method void GetAdRequest$VideoRequestType(String, int)>
	//   11   23:putstatic       #27  <Field GetAdRequest$VideoRequestType DISABLED>
		FORCED = new GetAdRequest$VideoRequestType("FORCED", 2);
	//   12   26:new             #2   <Class GetAdRequest$VideoRequestType>
	//   13   29:dup             
	//   14   30:ldc1            #28  <String "FORCED">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #22  <Method void GetAdRequest$VideoRequestType(String, int)>
	//   17   36:putstatic       #30  <Field GetAdRequest$VideoRequestType FORCED>
		FORCED_NONVAST = new GetAdRequest$VideoRequestType("FORCED_NONVAST", 3);
	//   18   39:new             #2   <Class GetAdRequest$VideoRequestType>
	//   19   42:dup             
	//   20   43:ldc1            #31  <String "FORCED_NONVAST">
	//   21   45:iconst_3        
	//   22   46:invokespecial   #22  <Method void GetAdRequest$VideoRequestType(String, int)>
	//   23   49:putstatic       #33  <Field GetAdRequest$VideoRequestType FORCED_NONVAST>
		$VALUES = (new GetAdRequest$VideoRequestType[] {
			ENABLED, DISABLED, FORCED, FORCED_NONVAST
		});
	//   24   52:iconst_4        
	//   25   53:anewarray       GetAdRequest$VideoRequestType[]
	//   26   56:dup             
	//   27   57:iconst_0        
	//   28   58:getstatic       #24  <Field GetAdRequest$VideoRequestType ENABLED>
	//   29   61:aastore         
	//   30   62:dup             
	//   31   63:iconst_1        
	//   32   64:getstatic       #27  <Field GetAdRequest$VideoRequestType DISABLED>
	//   33   67:aastore         
	//   34   68:dup             
	//   35   69:iconst_2        
	//   36   70:getstatic       #30  <Field GetAdRequest$VideoRequestType FORCED>
	//   37   73:aastore         
	//   38   74:dup             
	//   39   75:iconst_3        
	//   40   76:getstatic       #33  <Field GetAdRequest$VideoRequestType FORCED_NONVAST>
	//   41   79:aastore         
	//   42   80:putstatic       #35  <Field GetAdRequest$VideoRequestType[] $VALUES>
	//*  43   83:return          
	}

	private GetAdRequest$VideoRequestType(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #37  <Method void Enum(String, int)>
	//    4    6:return          
	}
}
