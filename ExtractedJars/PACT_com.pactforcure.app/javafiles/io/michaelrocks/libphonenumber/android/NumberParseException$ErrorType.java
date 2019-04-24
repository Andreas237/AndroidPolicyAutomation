// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.michaelrocks.libphonenumber.android;


// Referenced classes of package io.michaelrocks.libphonenumber.android:
//			NumberParseException

public static final class NumberParseException$ErrorType extends Enum
{

	public static NumberParseException$ErrorType valueOf(String s)
	{
		return (NumberParseException$ErrorType)Enum.valueOf(io/michaelrocks/libphonenumber/android/NumberParseException$ErrorType, s);
	//    0    0:ldc1            #2   <Class NumberParseException$ErrorType>
	//    1    2:aload_0         
	//    2    3:invokestatic    #47  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class NumberParseException$ErrorType>
	//    4    9:areturn         
	}

	public static NumberParseException$ErrorType[] values()
	{
		return (NumberParseException$ErrorType[])((NumberParseException$ErrorType []) ($VALUES)).clone();
	//    0    0:getstatic       #39  <Field NumberParseException$ErrorType[] $VALUES>
	//    1    3:invokevirtual   #54  <Method Object _5B_Lio.michaelrocks.libphonenumber.android.NumberParseException$ErrorType_3B_.clone()>
	//    2    6:checkcast       #50  <Class NumberParseException$ErrorType[]>
	//    3    9:areturn         
	}

	private static final NumberParseException$ErrorType $VALUES[];
	public static final NumberParseException$ErrorType INVALID_COUNTRY_CODE;
	public static final NumberParseException$ErrorType NOT_A_NUMBER;
	public static final NumberParseException$ErrorType TOO_LONG;
	public static final NumberParseException$ErrorType TOO_SHORT_AFTER_IDD;
	public static final NumberParseException$ErrorType TOO_SHORT_NSN;

	static 
	{
		INVALID_COUNTRY_CODE = new NumberParseException$ErrorType("INVALID_COUNTRY_CODE", 0);
	//    0    0:new             #2   <Class NumberParseException$ErrorType>
	//    1    3:dup             
	//    2    4:ldc1            #19  <String "INVALID_COUNTRY_CODE">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #23  <Method void NumberParseException$ErrorType(String, int)>
	//    5   10:putstatic       #25  <Field NumberParseException$ErrorType INVALID_COUNTRY_CODE>
		NOT_A_NUMBER = new NumberParseException$ErrorType("NOT_A_NUMBER", 1);
	//    6   13:new             #2   <Class NumberParseException$ErrorType>
	//    7   16:dup             
	//    8   17:ldc1            #26  <String "NOT_A_NUMBER">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #23  <Method void NumberParseException$ErrorType(String, int)>
	//   11   23:putstatic       #28  <Field NumberParseException$ErrorType NOT_A_NUMBER>
		TOO_SHORT_AFTER_IDD = new NumberParseException$ErrorType("TOO_SHORT_AFTER_IDD", 2);
	//   12   26:new             #2   <Class NumberParseException$ErrorType>
	//   13   29:dup             
	//   14   30:ldc1            #29  <String "TOO_SHORT_AFTER_IDD">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #23  <Method void NumberParseException$ErrorType(String, int)>
	//   17   36:putstatic       #31  <Field NumberParseException$ErrorType TOO_SHORT_AFTER_IDD>
		TOO_SHORT_NSN = new NumberParseException$ErrorType("TOO_SHORT_NSN", 3);
	//   18   39:new             #2   <Class NumberParseException$ErrorType>
	//   19   42:dup             
	//   20   43:ldc1            #32  <String "TOO_SHORT_NSN">
	//   21   45:iconst_3        
	//   22   46:invokespecial   #23  <Method void NumberParseException$ErrorType(String, int)>
	//   23   49:putstatic       #34  <Field NumberParseException$ErrorType TOO_SHORT_NSN>
		TOO_LONG = new NumberParseException$ErrorType("TOO_LONG", 4);
	//   24   52:new             #2   <Class NumberParseException$ErrorType>
	//   25   55:dup             
	//   26   56:ldc1            #35  <String "TOO_LONG">
	//   27   58:iconst_4        
	//   28   59:invokespecial   #23  <Method void NumberParseException$ErrorType(String, int)>
	//   29   62:putstatic       #37  <Field NumberParseException$ErrorType TOO_LONG>
		$VALUES = (new NumberParseException$ErrorType[] {
			INVALID_COUNTRY_CODE, NOT_A_NUMBER, TOO_SHORT_AFTER_IDD, TOO_SHORT_NSN, TOO_LONG
		});
	//   30   65:iconst_5        
	//   31   66:anewarray       NumberParseException$ErrorType[]
	//   32   69:dup             
	//   33   70:iconst_0        
	//   34   71:getstatic       #25  <Field NumberParseException$ErrorType INVALID_COUNTRY_CODE>
	//   35   74:aastore         
	//   36   75:dup             
	//   37   76:iconst_1        
	//   38   77:getstatic       #28  <Field NumberParseException$ErrorType NOT_A_NUMBER>
	//   39   80:aastore         
	//   40   81:dup             
	//   41   82:iconst_2        
	//   42   83:getstatic       #31  <Field NumberParseException$ErrorType TOO_SHORT_AFTER_IDD>
	//   43   86:aastore         
	//   44   87:dup             
	//   45   88:iconst_3        
	//   46   89:getstatic       #34  <Field NumberParseException$ErrorType TOO_SHORT_NSN>
	//   47   92:aastore         
	//   48   93:dup             
	//   49   94:iconst_4        
	//   50   95:getstatic       #37  <Field NumberParseException$ErrorType TOO_LONG>
	//   51   98:aastore         
	//   52   99:putstatic       #39  <Field NumberParseException$ErrorType[] $VALUES>
	//*  53  102:return          
	}

	private NumberParseException$ErrorType(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #41  <Method void Enum(String, int)>
	//    4    6:return          
	}
}
