// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package cn.com.fmsh.script;

import cn.com.fmsh.script.exception.FMScriptHandleException;

public interface ApduHandler
{
	public static final class ApduHandlerType extends Enum
	{

		public static ApduHandlerType valueOf(String s)
		{
			return (ApduHandlerType)Enum.valueOf(cn/com/fmsh/script/ApduHandler$ApduHandlerType, s);
		//    0    0:ldc1            #2   <Class ApduHandler$ApduHandlerType>
		//    1    2:aload_0         
		//    2    3:invokestatic    #58  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class ApduHandler$ApduHandlerType>
		//    4    9:areturn         
		}

		public static ApduHandlerType[] values()
		{
			ApduHandlerType aapduhandlertype[] = ENUM$VALUES;
		//    0    0:getstatic       #45  <Field ApduHandler$ApduHandlerType[] ENUM$VALUES>
		//    1    3:astore_1        
			int i = aapduhandlertype.length;
		//    2    4:aload_1         
		//    3    5:arraylength     
		//    4    6:istore_0        
			ApduHandlerType aapduhandlertype1[] = new ApduHandlerType[i];
		//    5    7:iload_0         
		//    6    8:anewarray       ApduHandlerType[]
		//    7   11:astore_2        
			System.arraycopy(((Object) (aapduhandlertype)), 0, ((Object) (aapduhandlertype1)), 0, i);
		//    8   12:aload_1         
		//    9   13:iconst_0        
		//   10   14:aload_2         
		//   11   15:iconst_0        
		//   12   16:iload_0         
		//   13   17:invokestatic    #66  <Method void System.arraycopy(Object, int, Object, int, int)>
			return aapduhandlertype1;
		//   14   20:aload_2         
		//   15   21:areturn         
		}

		public String getDescription()
		{
			return description;
		//    0    0:aload_0         
		//    1    1:getfield        #53  <Field String description>
		//    2    4:areturn         
		}

		public int getValue()
		{
			return value;
		//    0    0:aload_0         
		//    1    1:getfield        #51  <Field int value>
		//    2    4:ireturn         
		}

		public static final ApduHandlerType BLUETOOTH;
		private static final ApduHandlerType ENUM$VALUES[];
		public static final ApduHandlerType FM8301;
		public static final ApduHandlerType NFC;
		public static final ApduHandlerType OPEN_MOBILE;
		private String description;
		private int value;

		static 
		{
			OPEN_MOBILE = new ApduHandlerType("OPEN_MOBILE", 0, 1, "openMobile");
		//    0    0:new             #2   <Class ApduHandler$ApduHandlerType>
		//    1    3:dup             
		//    2    4:ldc1            #22  <String "OPEN_MOBILE">
		//    3    6:iconst_0        
		//    4    7:iconst_1        
		//    5    8:ldc1            #24  <String "openMobile">
		//    6   10:invokespecial   #28  <Method void ApduHandler$ApduHandlerType(String, int, int, String)>
		//    7   13:putstatic       #30  <Field ApduHandler$ApduHandlerType OPEN_MOBILE>
			NFC = new ApduHandlerType("NFC", 1, 2, "NFC");
		//    8   16:new             #2   <Class ApduHandler$ApduHandlerType>
		//    9   19:dup             
		//   10   20:ldc1            #31  <String "NFC">
		//   11   22:iconst_1        
		//   12   23:iconst_2        
		//   13   24:ldc1            #31  <String "NFC">
		//   14   26:invokespecial   #28  <Method void ApduHandler$ApduHandlerType(String, int, int, String)>
		//   15   29:putstatic       #33  <Field ApduHandler$ApduHandlerType NFC>
			FM8301 = new ApduHandlerType("FM8301", 2, 3, "fm8301");
		//   16   32:new             #2   <Class ApduHandler$ApduHandlerType>
		//   17   35:dup             
		//   18   36:ldc1            #34  <String "FM8301">
		//   19   38:iconst_2        
		//   20   39:iconst_3        
		//   21   40:ldc1            #36  <String "fm8301">
		//   22   42:invokespecial   #28  <Method void ApduHandler$ApduHandlerType(String, int, int, String)>
		//   23   45:putstatic       #38  <Field ApduHandler$ApduHandlerType FM8301>
			BLUETOOTH = new ApduHandlerType("BLUETOOTH", 3, 4, "blueTooth");
		//   24   48:new             #2   <Class ApduHandler$ApduHandlerType>
		//   25   51:dup             
		//   26   52:ldc1            #39  <String "BLUETOOTH">
		//   27   54:iconst_3        
		//   28   55:iconst_4        
		//   29   56:ldc1            #41  <String "blueTooth">
		//   30   58:invokespecial   #28  <Method void ApduHandler$ApduHandlerType(String, int, int, String)>
		//   31   61:putstatic       #43  <Field ApduHandler$ApduHandlerType BLUETOOTH>
			ENUM$VALUES = (new ApduHandlerType[] {
				OPEN_MOBILE, NFC, FM8301, BLUETOOTH
			});
		//   32   64:iconst_4        
		//   33   65:anewarray       ApduHandlerType[]
		//   34   68:dup             
		//   35   69:iconst_0        
		//   36   70:getstatic       #30  <Field ApduHandler$ApduHandlerType OPEN_MOBILE>
		//   37   73:aastore         
		//   38   74:dup             
		//   39   75:iconst_1        
		//   40   76:getstatic       #33  <Field ApduHandler$ApduHandlerType NFC>
		//   41   79:aastore         
		//   42   80:dup             
		//   43   81:iconst_2        
		//   44   82:getstatic       #38  <Field ApduHandler$ApduHandlerType FM8301>
		//   45   85:aastore         
		//   46   86:dup             
		//   47   87:iconst_3        
		//   48   88:getstatic       #43  <Field ApduHandler$ApduHandlerType BLUETOOTH>
		//   49   91:aastore         
		//   50   92:putstatic       #45  <Field ApduHandler$ApduHandlerType[] ENUM$VALUES>
		//*  51   95:return          
		}

		private ApduHandlerType(String s, int i, int j, String s1)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #49  <Method void Enum(String, int)>
			value = j;
		//    4    6:aload_0         
		//    5    7:iload_3         
		//    6    8:putfield        #51  <Field int value>
			description = s1;
		//    7   11:aload_0         
		//    8   12:aload           4
		//    9   14:putfield        #53  <Field String description>
		//   10   17:return          
		}
	}


	public abstract void close();

	public abstract boolean connect();

	public abstract ApduHandlerType getApduHandlerType();

	public abstract boolean isConnect();

	public abstract boolean open(byte abyte0[]);

	public abstract byte[] transceive(byte abyte0[])
		throws FMScriptHandleException;
}
