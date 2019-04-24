// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.michaelrocks.libphonenumber.android;


public class NumberParseException extends Exception
{
	public static final class ErrorType extends Enum
	{

		public static ErrorType valueOf(String s)
		{
			return (ErrorType)Enum.valueOf(io/michaelrocks/libphonenumber/android/NumberParseException$ErrorType, s);
		//    0    0:ldc1            #2   <Class NumberParseException$ErrorType>
		//    1    2:aload_0         
		//    2    3:invokestatic    #47  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class NumberParseException$ErrorType>
		//    4    9:areturn         
		}

		public static ErrorType[] values()
		{
			return (ErrorType[])((ErrorType []) ($VALUES)).clone();
		//    0    0:getstatic       #39  <Field NumberParseException$ErrorType[] $VALUES>
		//    1    3:invokevirtual   #54  <Method Object _5B_Lio.michaelrocks.libphonenumber.android.NumberParseException$ErrorType_3B_.clone()>
		//    2    6:checkcast       #50  <Class NumberParseException$ErrorType[]>
		//    3    9:areturn         
		}

		private static final ErrorType $VALUES[];
		public static final ErrorType INVALID_COUNTRY_CODE;
		public static final ErrorType NOT_A_NUMBER;
		public static final ErrorType TOO_LONG;
		public static final ErrorType TOO_SHORT_AFTER_IDD;
		public static final ErrorType TOO_SHORT_NSN;

		static 
		{
			INVALID_COUNTRY_CODE = new ErrorType("INVALID_COUNTRY_CODE", 0);
		//    0    0:new             #2   <Class NumberParseException$ErrorType>
		//    1    3:dup             
		//    2    4:ldc1            #19  <String "INVALID_COUNTRY_CODE">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #23  <Method void NumberParseException$ErrorType(String, int)>
		//    5   10:putstatic       #25  <Field NumberParseException$ErrorType INVALID_COUNTRY_CODE>
			NOT_A_NUMBER = new ErrorType("NOT_A_NUMBER", 1);
		//    6   13:new             #2   <Class NumberParseException$ErrorType>
		//    7   16:dup             
		//    8   17:ldc1            #26  <String "NOT_A_NUMBER">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #23  <Method void NumberParseException$ErrorType(String, int)>
		//   11   23:putstatic       #28  <Field NumberParseException$ErrorType NOT_A_NUMBER>
			TOO_SHORT_AFTER_IDD = new ErrorType("TOO_SHORT_AFTER_IDD", 2);
		//   12   26:new             #2   <Class NumberParseException$ErrorType>
		//   13   29:dup             
		//   14   30:ldc1            #29  <String "TOO_SHORT_AFTER_IDD">
		//   15   32:iconst_2        
		//   16   33:invokespecial   #23  <Method void NumberParseException$ErrorType(String, int)>
		//   17   36:putstatic       #31  <Field NumberParseException$ErrorType TOO_SHORT_AFTER_IDD>
			TOO_SHORT_NSN = new ErrorType("TOO_SHORT_NSN", 3);
		//   18   39:new             #2   <Class NumberParseException$ErrorType>
		//   19   42:dup             
		//   20   43:ldc1            #32  <String "TOO_SHORT_NSN">
		//   21   45:iconst_3        
		//   22   46:invokespecial   #23  <Method void NumberParseException$ErrorType(String, int)>
		//   23   49:putstatic       #34  <Field NumberParseException$ErrorType TOO_SHORT_NSN>
			TOO_LONG = new ErrorType("TOO_LONG", 4);
		//   24   52:new             #2   <Class NumberParseException$ErrorType>
		//   25   55:dup             
		//   26   56:ldc1            #35  <String "TOO_LONG">
		//   27   58:iconst_4        
		//   28   59:invokespecial   #23  <Method void NumberParseException$ErrorType(String, int)>
		//   29   62:putstatic       #37  <Field NumberParseException$ErrorType TOO_LONG>
			$VALUES = (new ErrorType[] {
				INVALID_COUNTRY_CODE, NOT_A_NUMBER, TOO_SHORT_AFTER_IDD, TOO_SHORT_NSN, TOO_LONG
			});
		//   30   65:iconst_5        
		//   31   66:anewarray       ErrorType[]
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

		private ErrorType(String s, int i)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #41  <Method void Enum(String, int)>
		//    4    6:return          
		}
	}


	public NumberParseException(ErrorType errortype, String s)
	{
		super(s);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:invokespecial   #16  <Method void Exception(String)>
		message = s;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #18  <Field String message>
		errorType = errortype;
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:putfield        #20  <Field NumberParseException$ErrorType errorType>
	//    9   15:return          
	}

	public ErrorType getErrorType()
	{
		return errorType;
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field NumberParseException$ErrorType errorType>
	//    2    4:areturn         
	}

	public String toString()
	{
		return (new StringBuilder()).append("Error type: ").append(((Object) (errorType))).append(". ").append(message).toString();
	//    0    0:new             #27  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #30  <Method void StringBuilder()>
	//    3    7:ldc1            #32  <String "Error type: ">
	//    4    9:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
	//    5   12:aload_0         
	//    6   13:getfield        #20  <Field NumberParseException$ErrorType errorType>
	//    7   16:invokevirtual   #39  <Method StringBuilder StringBuilder.append(Object)>
	//    8   19:ldc1            #41  <String ". ">
	//    9   21:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
	//   10   24:aload_0         
	//   11   25:getfield        #18  <Field String message>
	//   12   28:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
	//   13   31:invokevirtual   #43  <Method String StringBuilder.toString()>
	//   14   34:areturn         
	}

	private ErrorType errorType;
	private String message;
}
