// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.internal;


// Referenced classes of package com.facebook.internal:
//			FetchedAppSettingsManager

static final class FetchedAppSettingsManager$FetchAppSettingState extends Enum
{

	public static FetchedAppSettingsManager$FetchAppSettingState valueOf(String s)
	{
		return (FetchedAppSettingsManager$FetchAppSettingState)Enum.valueOf(com/facebook/internal/FetchedAppSettingsManager$FetchAppSettingState, s);
	//    0    0:ldc1            #2   <Class FetchedAppSettingsManager$FetchAppSettingState>
	//    1    2:aload_0         
	//    2    3:invokestatic    #43  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class FetchedAppSettingsManager$FetchAppSettingState>
	//    4    9:areturn         
	}

	public static FetchedAppSettingsManager$FetchAppSettingState[] values()
	{
		return (FetchedAppSettingsManager$FetchAppSettingState[])((FetchedAppSettingsManager$FetchAppSettingState []) ($VALUES)).clone();
	//    0    0:getstatic       #35  <Field FetchedAppSettingsManager$FetchAppSettingState[] $VALUES>
	//    1    3:invokevirtual   #50  <Method Object _5B_Lcom.facebook.internal.FetchedAppSettingsManager$FetchAppSettingState_3B_.clone()>
	//    2    6:checkcast       #46  <Class FetchedAppSettingsManager$FetchAppSettingState[]>
	//    3    9:areturn         
	}

	private static final FetchedAppSettingsManager$FetchAppSettingState $VALUES[];
	public static final FetchedAppSettingsManager$FetchAppSettingState ERROR;
	public static final FetchedAppSettingsManager$FetchAppSettingState LOADING;
	public static final FetchedAppSettingsManager$FetchAppSettingState NOT_LOADED;
	public static final FetchedAppSettingsManager$FetchAppSettingState SUCCESS;

	static 
	{
		NOT_LOADED = new FetchedAppSettingsManager$FetchAppSettingState("NOT_LOADED", 0);
	//    0    0:new             #2   <Class FetchedAppSettingsManager$FetchAppSettingState>
	//    1    3:dup             
	//    2    4:ldc1            #18  <String "NOT_LOADED">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #22  <Method void FetchedAppSettingsManager$FetchAppSettingState(String, int)>
	//    5   10:putstatic       #24  <Field FetchedAppSettingsManager$FetchAppSettingState NOT_LOADED>
		LOADING = new FetchedAppSettingsManager$FetchAppSettingState("LOADING", 1);
	//    6   13:new             #2   <Class FetchedAppSettingsManager$FetchAppSettingState>
	//    7   16:dup             
	//    8   17:ldc1            #25  <String "LOADING">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #22  <Method void FetchedAppSettingsManager$FetchAppSettingState(String, int)>
	//   11   23:putstatic       #27  <Field FetchedAppSettingsManager$FetchAppSettingState LOADING>
		SUCCESS = new FetchedAppSettingsManager$FetchAppSettingState("SUCCESS", 2);
	//   12   26:new             #2   <Class FetchedAppSettingsManager$FetchAppSettingState>
	//   13   29:dup             
	//   14   30:ldc1            #28  <String "SUCCESS">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #22  <Method void FetchedAppSettingsManager$FetchAppSettingState(String, int)>
	//   17   36:putstatic       #30  <Field FetchedAppSettingsManager$FetchAppSettingState SUCCESS>
		ERROR = new FetchedAppSettingsManager$FetchAppSettingState("ERROR", 3);
	//   18   39:new             #2   <Class FetchedAppSettingsManager$FetchAppSettingState>
	//   19   42:dup             
	//   20   43:ldc1            #31  <String "ERROR">
	//   21   45:iconst_3        
	//   22   46:invokespecial   #22  <Method void FetchedAppSettingsManager$FetchAppSettingState(String, int)>
	//   23   49:putstatic       #33  <Field FetchedAppSettingsManager$FetchAppSettingState ERROR>
		$VALUES = (new FetchedAppSettingsManager$FetchAppSettingState[] {
			NOT_LOADED, LOADING, SUCCESS, ERROR
		});
	//   24   52:iconst_4        
	//   25   53:anewarray       FetchedAppSettingsManager$FetchAppSettingState[]
	//   26   56:dup             
	//   27   57:iconst_0        
	//   28   58:getstatic       #24  <Field FetchedAppSettingsManager$FetchAppSettingState NOT_LOADED>
	//   29   61:aastore         
	//   30   62:dup             
	//   31   63:iconst_1        
	//   32   64:getstatic       #27  <Field FetchedAppSettingsManager$FetchAppSettingState LOADING>
	//   33   67:aastore         
	//   34   68:dup             
	//   35   69:iconst_2        
	//   36   70:getstatic       #30  <Field FetchedAppSettingsManager$FetchAppSettingState SUCCESS>
	//   37   73:aastore         
	//   38   74:dup             
	//   39   75:iconst_3        
	//   40   76:getstatic       #33  <Field FetchedAppSettingsManager$FetchAppSettingState ERROR>
	//   41   79:aastore         
	//   42   80:putstatic       #35  <Field FetchedAppSettingsManager$FetchAppSettingState[] $VALUES>
	//*  43   83:return          
	}

	private FetchedAppSettingsManager$FetchAppSettingState(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #37  <Method void Enum(String, int)>
	//    4    6:return          
	}
}
