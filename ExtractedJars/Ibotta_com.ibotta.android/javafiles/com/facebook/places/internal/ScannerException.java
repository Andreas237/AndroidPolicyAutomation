// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.places.internal;


public class ScannerException extends Exception
{
	public static final class Type extends Enum
	{

		public static Type valueOf(String s)
		{
			return (Type)Enum.valueOf(com/facebook/places/internal/ScannerException$Type, s);
		//    0    0:ldc1            #2   <Class ScannerException$Type>
		//    1    2:aload_0         
		//    2    3:invokestatic    #51  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class ScannerException$Type>
		//    4    9:areturn         
		}

		public static Type[] values()
		{
			return (Type[])((Type []) ($VALUES)).clone();
		//    0    0:getstatic       #43  <Field ScannerException$Type[] $VALUES>
		//    1    3:invokevirtual   #58  <Method Object _5B_Lcom.facebook.places.internal.ScannerException$Type_3B_.clone()>
		//    2    6:checkcast       #54  <Class ScannerException$Type[]>
		//    3    9:areturn         
		}

		private static final Type $VALUES[];
		public static final Type DISABLED;
		public static final Type NOT_SUPPORTED;
		public static final Type PERMISSION_DENIED;
		public static final Type SCAN_ALREADY_IN_PROGRESS;
		public static final Type TIMEOUT;
		public static final Type UNKNOWN_ERROR;

		static 
		{
			NOT_SUPPORTED = new Type("NOT_SUPPORTED", 0);
		//    0    0:new             #2   <Class ScannerException$Type>
		//    1    3:dup             
		//    2    4:ldc1            #20  <String "NOT_SUPPORTED">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #24  <Method void ScannerException$Type(String, int)>
		//    5   10:putstatic       #26  <Field ScannerException$Type NOT_SUPPORTED>
			PERMISSION_DENIED = new Type("PERMISSION_DENIED", 1);
		//    6   13:new             #2   <Class ScannerException$Type>
		//    7   16:dup             
		//    8   17:ldc1            #27  <String "PERMISSION_DENIED">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #24  <Method void ScannerException$Type(String, int)>
		//   11   23:putstatic       #29  <Field ScannerException$Type PERMISSION_DENIED>
			DISABLED = new Type("DISABLED", 2);
		//   12   26:new             #2   <Class ScannerException$Type>
		//   13   29:dup             
		//   14   30:ldc1            #30  <String "DISABLED">
		//   15   32:iconst_2        
		//   16   33:invokespecial   #24  <Method void ScannerException$Type(String, int)>
		//   17   36:putstatic       #32  <Field ScannerException$Type DISABLED>
			SCAN_ALREADY_IN_PROGRESS = new Type("SCAN_ALREADY_IN_PROGRESS", 3);
		//   18   39:new             #2   <Class ScannerException$Type>
		//   19   42:dup             
		//   20   43:ldc1            #33  <String "SCAN_ALREADY_IN_PROGRESS">
		//   21   45:iconst_3        
		//   22   46:invokespecial   #24  <Method void ScannerException$Type(String, int)>
		//   23   49:putstatic       #35  <Field ScannerException$Type SCAN_ALREADY_IN_PROGRESS>
			UNKNOWN_ERROR = new Type("UNKNOWN_ERROR", 4);
		//   24   52:new             #2   <Class ScannerException$Type>
		//   25   55:dup             
		//   26   56:ldc1            #36  <String "UNKNOWN_ERROR">
		//   27   58:iconst_4        
		//   28   59:invokespecial   #24  <Method void ScannerException$Type(String, int)>
		//   29   62:putstatic       #38  <Field ScannerException$Type UNKNOWN_ERROR>
			TIMEOUT = new Type("TIMEOUT", 5);
		//   30   65:new             #2   <Class ScannerException$Type>
		//   31   68:dup             
		//   32   69:ldc1            #39  <String "TIMEOUT">
		//   33   71:iconst_5        
		//   34   72:invokespecial   #24  <Method void ScannerException$Type(String, int)>
		//   35   75:putstatic       #41  <Field ScannerException$Type TIMEOUT>
			$VALUES = (new Type[] {
				NOT_SUPPORTED, PERMISSION_DENIED, DISABLED, SCAN_ALREADY_IN_PROGRESS, UNKNOWN_ERROR, TIMEOUT
			});
		//   36   78:bipush          6
		//   37   80:anewarray       Type[]
		//   38   83:dup             
		//   39   84:iconst_0        
		//   40   85:getstatic       #26  <Field ScannerException$Type NOT_SUPPORTED>
		//   41   88:aastore         
		//   42   89:dup             
		//   43   90:iconst_1        
		//   44   91:getstatic       #29  <Field ScannerException$Type PERMISSION_DENIED>
		//   45   94:aastore         
		//   46   95:dup             
		//   47   96:iconst_2        
		//   48   97:getstatic       #32  <Field ScannerException$Type DISABLED>
		//   49  100:aastore         
		//   50  101:dup             
		//   51  102:iconst_3        
		//   52  103:getstatic       #35  <Field ScannerException$Type SCAN_ALREADY_IN_PROGRESS>
		//   53  106:aastore         
		//   54  107:dup             
		//   55  108:iconst_4        
		//   56  109:getstatic       #38  <Field ScannerException$Type UNKNOWN_ERROR>
		//   57  112:aastore         
		//   58  113:dup             
		//   59  114:iconst_5        
		//   60  115:getstatic       #41  <Field ScannerException$Type TIMEOUT>
		//   61  118:aastore         
		//   62  119:putstatic       #43  <Field ScannerException$Type[] $VALUES>
		//*  63  122:return          
		}

		private Type(String s, int i)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #45  <Method void Enum(String, int)>
		//    4    6:return          
		}
	}


	public Type type;
}
