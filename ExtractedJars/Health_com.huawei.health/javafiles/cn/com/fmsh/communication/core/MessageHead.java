// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package cn.com.fmsh.communication.core;

import cn.com.fmsh.util.FM_Bytes;

// Referenced classes of package cn.com.fmsh.communication.core:
//			ControlWord

public class MessageHead
{
	public static final class CheckType extends Enum
	{

		public static CheckType valueOf(String s)
		{
			return (CheckType)Enum.valueOf(cn/com/fmsh/communication/core/MessageHead$CheckType, s);
		//    0    0:ldc1            #2   <Class MessageHead$CheckType>
		//    1    2:aload_0         
		//    2    3:invokestatic    #44  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class MessageHead$CheckType>
		//    4    9:areturn         
		}

		public static CheckType[] values()
		{
			CheckType achecktype[] = ENUM$VALUES;
		//    0    0:getstatic       #33  <Field MessageHead$CheckType[] ENUM$VALUES>
		//    1    3:astore_1        
			int i = achecktype.length;
		//    2    4:aload_1         
		//    3    5:arraylength     
		//    4    6:istore_0        
			CheckType achecktype1[] = new CheckType[i];
		//    5    7:iload_0         
		//    6    8:anewarray       CheckType[]
		//    7   11:astore_2        
			System.arraycopy(((Object) (achecktype)), 0, ((Object) (achecktype1)), 0, i);
		//    8   12:aload_1         
		//    9   13:iconst_0        
		//   10   14:aload_2         
		//   11   15:iconst_0        
		//   12   16:iload_0         
		//   13   17:invokestatic    #52  <Method void System.arraycopy(Object, int, Object, int, int)>
			return achecktype1;
		//   14   20:aload_2         
		//   15   21:areturn         
		}

		public int getValue()
		{
			return value;
		//    0    0:aload_0         
		//    1    1:getfield        #39  <Field int value>
		//    2    4:ireturn         
		}

		public static final CheckType CRC16;
		private static final CheckType ENUM$VALUES[];
		public static final CheckType MAC;
		public static final CheckType NOCHECK;
		private int value;

		static 
		{
			NOCHECK = new CheckType("NOCHECK", 0, 0);
		//    0    0:new             #2   <Class MessageHead$CheckType>
		//    1    3:dup             
		//    2    4:ldc1            #19  <String "NOCHECK">
		//    3    6:iconst_0        
		//    4    7:iconst_0        
		//    5    8:invokespecial   #23  <Method void MessageHead$CheckType(String, int, int)>
		//    6   11:putstatic       #25  <Field MessageHead$CheckType NOCHECK>
			MAC = new CheckType("MAC", 1, 1);
		//    7   14:new             #2   <Class MessageHead$CheckType>
		//    8   17:dup             
		//    9   18:ldc1            #26  <String "MAC">
		//   10   20:iconst_1        
		//   11   21:iconst_1        
		//   12   22:invokespecial   #23  <Method void MessageHead$CheckType(String, int, int)>
		//   13   25:putstatic       #28  <Field MessageHead$CheckType MAC>
			CRC16 = new CheckType("CRC16", 2, 2);
		//   14   28:new             #2   <Class MessageHead$CheckType>
		//   15   31:dup             
		//   16   32:ldc1            #29  <String "CRC16">
		//   17   34:iconst_2        
		//   18   35:iconst_2        
		//   19   36:invokespecial   #23  <Method void MessageHead$CheckType(String, int, int)>
		//   20   39:putstatic       #31  <Field MessageHead$CheckType CRC16>
			ENUM$VALUES = (new CheckType[] {
				NOCHECK, MAC, CRC16
			});
		//   21   42:iconst_3        
		//   22   43:anewarray       CheckType[]
		//   23   46:dup             
		//   24   47:iconst_0        
		//   25   48:getstatic       #25  <Field MessageHead$CheckType NOCHECK>
		//   26   51:aastore         
		//   27   52:dup             
		//   28   53:iconst_1        
		//   29   54:getstatic       #28  <Field MessageHead$CheckType MAC>
		//   30   57:aastore         
		//   31   58:dup             
		//   32   59:iconst_2        
		//   33   60:getstatic       #31  <Field MessageHead$CheckType CRC16>
		//   34   63:aastore         
		//   35   64:putstatic       #33  <Field MessageHead$CheckType[] ENUM$VALUES>
		//*  36   67:return          
		}

		private CheckType(String s, int i, int j)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #37  <Method void Enum(String, int)>
			value = j;
		//    4    6:aload_0         
		//    5    7:iload_3         
		//    6    8:putfield        #39  <Field int value>
		//    7   11:return          
		}
	}

	public static final class SecurityLevel extends Enum
	{

		public static SecurityLevel valueOf(String s)
		{
			return (SecurityLevel)Enum.valueOf(cn/com/fmsh/communication/core/MessageHead$SecurityLevel, s);
		//    0    0:ldc1            #2   <Class MessageHead$SecurityLevel>
		//    1    2:aload_0         
		//    2    3:invokestatic    #40  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class MessageHead$SecurityLevel>
		//    4    9:areturn         
		}

		public static SecurityLevel[] values()
		{
			SecurityLevel asecuritylevel[] = ENUM$VALUES;
		//    0    0:getstatic       #29  <Field MessageHead$SecurityLevel[] ENUM$VALUES>
		//    1    3:astore_1        
			int i = asecuritylevel.length;
		//    2    4:aload_1         
		//    3    5:arraylength     
		//    4    6:istore_0        
			SecurityLevel asecuritylevel1[] = new SecurityLevel[i];
		//    5    7:iload_0         
		//    6    8:anewarray       SecurityLevel[]
		//    7   11:astore_2        
			System.arraycopy(((Object) (asecuritylevel)), 0, ((Object) (asecuritylevel1)), 0, i);
		//    8   12:aload_1         
		//    9   13:iconst_0        
		//   10   14:aload_2         
		//   11   15:iconst_0        
		//   12   16:iload_0         
		//   13   17:invokestatic    #48  <Method void System.arraycopy(Object, int, Object, int, int)>
			return asecuritylevel1;
		//   14   20:aload_2         
		//   15   21:areturn         
		}

		public int getValue()
		{
			return value;
		//    0    0:aload_0         
		//    1    1:getfield        #35  <Field int value>
		//    2    4:ireturn         
		}

		public static final SecurityLevel CIPHER;
		private static final SecurityLevel ENUM$VALUES[];
		public static final SecurityLevel PLAIN;
		private int value;

		static 
		{
			PLAIN = new SecurityLevel("PLAIN", 0, 0);
		//    0    0:new             #2   <Class MessageHead$SecurityLevel>
		//    1    3:dup             
		//    2    4:ldc1            #18  <String "PLAIN">
		//    3    6:iconst_0        
		//    4    7:iconst_0        
		//    5    8:invokespecial   #22  <Method void MessageHead$SecurityLevel(String, int, int)>
		//    6   11:putstatic       #24  <Field MessageHead$SecurityLevel PLAIN>
			CIPHER = new SecurityLevel("CIPHER", 1, 1);
		//    7   14:new             #2   <Class MessageHead$SecurityLevel>
		//    8   17:dup             
		//    9   18:ldc1            #25  <String "CIPHER">
		//   10   20:iconst_1        
		//   11   21:iconst_1        
		//   12   22:invokespecial   #22  <Method void MessageHead$SecurityLevel(String, int, int)>
		//   13   25:putstatic       #27  <Field MessageHead$SecurityLevel CIPHER>
			ENUM$VALUES = (new SecurityLevel[] {
				PLAIN, CIPHER
			});
		//   14   28:iconst_2        
		//   15   29:anewarray       SecurityLevel[]
		//   16   32:dup             
		//   17   33:iconst_0        
		//   18   34:getstatic       #24  <Field MessageHead$SecurityLevel PLAIN>
		//   19   37:aastore         
		//   20   38:dup             
		//   21   39:iconst_1        
		//   22   40:getstatic       #27  <Field MessageHead$SecurityLevel CIPHER>
		//   23   43:aastore         
		//   24   44:putstatic       #29  <Field MessageHead$SecurityLevel[] ENUM$VALUES>
		//*  25   47:return          
		}

		private SecurityLevel(String s, int i, int j)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #33  <Method void Enum(String, int)>
			value = j;
		//    4    6:aload_0         
		//    5    7:iload_3         
		//    6    8:putfield        #35  <Field int value>
		//    7   11:return          
		}
	}


	public MessageHead()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #35  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:iconst_2        
	//    4    6:putfield        #37  <Field int SECURITY_LEVEL_OFFSET>
	//    5    9:aload_0         
	//    6   10:iconst_2        
	//    7   11:putfield        #39  <Field int SECURITY_LEVEL_LENGTH>
	//    8   14:aload_0         
	//    9   15:iconst_4        
	//   10   16:putfield        #41  <Field int SERIAL_NUMBER_OFFSET>
	//   11   19:aload_0         
	//   12   20:iconst_4        
	//   13   21:putfield        #43  <Field int SERIAL_NUMBER_LENGTH>
	//   14   24:aload_0         
	//   15   25:bipush          8
	//   16   27:putfield        #45  <Field int SESSION_NUMBER_OFFSET>
	//   17   30:aload_0         
	//   18   31:iconst_4        
	//   19   32:putfield        #47  <Field int SESSION_NUMBER_LENGTH>
		serialNumber = 0L;
	//   20   35:aload_0         
	//   21   36:lconst_0        
	//   22   37:putfield        #49  <Field long serialNumber>
		controlWord = new ControlWord();
	//   23   40:aload_0         
	//   24   41:new             #51  <Class ControlWord>
	//   25   44:dup             
	//   26   45:invokespecial   #52  <Method void ControlWord()>
	//   27   48:putfield        #54  <Field ControlWord controlWord>
		securityLevel = new byte[4];
	//   28   51:aload_0         
	//   29   52:iconst_4        
	//   30   53:newarray        byte[]
	//   31   55:putfield        #56  <Field byte[] securityLevel>
		sessionNumber = new byte[4];
	//   32   58:aload_0         
	//   33   59:iconst_4        
	//   34   60:newarray        byte[]
	//   35   62:putfield        #58  <Field byte[] sessionNumber>
	//   36   65:return          
	}

	public void fromBytes(byte abyte0[])
	{
		if(abyte0 == null || abyte0.length != 12)
	//*   0    0:aload_1         
	//*   1    1:ifnull          11
	//*   2    4:aload_1         
	//*   3    5:arraylength     
	//*   4    6:bipush          12
	//*   5    8:icmpeq          12
			return;
	//    6   11:return          
		protocolVersion = abyte0[0];
	//    7   12:aload_0         
	//    8   13:aload_1         
	//    9   14:iconst_0        
	//   10   15:baload          
	//   11   16:putfield        #63  <Field byte protocolVersion>
		controlWord.fromBytes(abyte0[1]);
	//   12   19:aload_0         
	//   13   20:getfield        #54  <Field ControlWord controlWord>
	//   14   23:aload_1         
	//   15   24:iconst_1        
	//   16   25:baload          
	//   17   26:invokevirtual   #66  <Method void ControlWord.fromBytes(byte)>
		for(int i = 0; i < 2; i++)
	//*  18   29:iconst_0        
	//*  19   30:istore_2        
	//*  20   31:goto            49
			securityLevel[i] = abyte0[i + 2];
	//   21   34:aload_0         
	//   22   35:getfield        #56  <Field byte[] securityLevel>
	//   23   38:iload_2         
	//   24   39:aload_1         
	//   25   40:iload_2         
	//   26   41:iconst_2        
	//   27   42:iadd            
	//   28   43:baload          
	//   29   44:bastore         

	//   30   45:iload_2         
	//   31   46:iconst_1        
	//   32   47:iadd            
	//   33   48:istore_2        
	//   34   49:iload_2         
	//   35   50:iconst_2        
	//   36   51:icmplt          34
		byte abyte1[] = new byte[4];
	//   37   54:iconst_4        
	//   38   55:newarray        byte[]
	//   39   57:astore_3        
		for(int j = 0; j < 4; j++)
	//*  40   58:iconst_0        
	//*  41   59:istore_2        
	//*  42   60:goto            75
			abyte1[j] = abyte0[j + 4];
	//   43   63:aload_3         
	//   44   64:iload_2         
	//   45   65:aload_1         
	//   46   66:iload_2         
	//   47   67:iconst_4        
	//   48   68:iadd            
	//   49   69:baload          
	//   50   70:bastore         

	//   51   71:iload_2         
	//   52   72:iconst_1        
	//   53   73:iadd            
	//   54   74:istore_2        
	//   55   75:iload_2         
	//   56   76:iconst_4        
	//   57   77:icmplt          63
		serialNumber = FM_Bytes.bytesToLong(FM_Bytes.join(new byte[1], abyte1));
	//   58   80:aload_0         
	//   59   81:iconst_1        
	//   60   82:newarray        byte[]
	//   61   84:aload_3         
	//   62   85:invokestatic    #72  <Method byte[] FM_Bytes.join(byte[], byte[])>
	//   63   88:invokestatic    #76  <Method long FM_Bytes.bytesToLong(byte[])>
	//   64   91:putfield        #49  <Field long serialNumber>
		for(int k = 0; k < 4; k++)
	//*  65   94:iconst_0        
	//*  66   95:istore_2        
	//*  67   96:goto            115
			sessionNumber[k] = abyte0[k + 8];
	//   68   99:aload_0         
	//   69  100:getfield        #58  <Field byte[] sessionNumber>
	//   70  103:iload_2         
	//   71  104:aload_1         
	//   72  105:iload_2         
	//   73  106:bipush          8
	//   74  108:iadd            
	//   75  109:baload          
	//   76  110:bastore         

	//   77  111:iload_2         
	//   78  112:iconst_1        
	//   79  113:iadd            
	//   80  114:istore_2        
	//   81  115:iload_2         
	//   82  116:iconst_4        
	//   83  117:icmplt          99
	//   84  120:return          
	}

	public ControlWord getControlWord()
	{
		return controlWord;
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field ControlWord controlWord>
	//    2    4:areturn         
	}

	public byte getProtocolVersion()
	{
		return protocolVersion;
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field byte protocolVersion>
	//    2    4:ireturn         
	}

	public byte[] getSecurityLevel()
	{
		return securityLevel;
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field byte[] securityLevel>
	//    2    4:areturn         
	}

	public long getSerialNumber()
	{
		return serialNumber;
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field long serialNumber>
	//    2    4:lreturn         
	}

	public byte[] getSessionNumber()
	{
		return sessionNumber;
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field byte[] sessionNumber>
	//    2    4:areturn         
	}

	public void setControlWord(ControlWord controlword)
	{
		controlWord = controlword;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #54  <Field ControlWord controlWord>
	//    3    5:return          
	}

	public void setProtocolVersion(byte byte0)
	{
		protocolVersion = byte0;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #63  <Field byte protocolVersion>
	//    3    5:return          
	}

	public void setSecurityLevel(byte abyte0[])
	{
		securityLevel = abyte0;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #56  <Field byte[] securityLevel>
	//    3    5:return          
	}

	public void setSerialNumber(long l)
	{
		serialNumber = l;
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:putfield        #49  <Field long serialNumber>
	//    3    5:return          
	}

	public void setSessionNumber(byte abyte0[])
	{
		sessionNumber = abyte0;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #58  <Field byte[] sessionNumber>
	//    3    5:return          
	}

	public byte[] toBytes()
	{
		byte abyte0[] = new byte[12];
	//    0    0:bipush          12
	//    1    2:newarray        byte[]
	//    2    4:astore_2        
		abyte0[0] = protocolVersion;
	//    3    5:aload_2         
	//    4    6:iconst_0        
	//    5    7:aload_0         
	//    6    8:getfield        #63  <Field byte protocolVersion>
	//    7   11:bastore         
		abyte0[1] = controlWord.toBytes();
	//    8   12:aload_2         
	//    9   13:iconst_1        
	//   10   14:aload_0         
	//   11   15:getfield        #54  <Field ControlWord controlWord>
	//   12   18:invokevirtual   #95  <Method byte ControlWord.toBytes()>
	//   13   21:bastore         
		for(int i = 0; i < 2; i++)
	//*  14   22:iconst_0        
	//*  15   23:istore_1        
	//*  16   24:goto            42
			abyte0[i + 2] = securityLevel[i];
	//   17   27:aload_2         
	//   18   28:iload_1         
	//   19   29:iconst_2        
	//   20   30:iadd            
	//   21   31:aload_0         
	//   22   32:getfield        #56  <Field byte[] securityLevel>
	//   23   35:iload_1         
	//   24   36:baload          
	//   25   37:bastore         

	//   26   38:iload_1         
	//   27   39:iconst_1        
	//   28   40:iadd            
	//   29   41:istore_1        
	//   30   42:iload_1         
	//   31   43:iconst_2        
	//   32   44:icmplt          27
		byte abyte1[] = FM_Bytes.longToBytes(serialNumber, 4);
	//   33   47:aload_0         
	//   34   48:getfield        #49  <Field long serialNumber>
	//   35   51:iconst_4        
	//   36   52:invokestatic    #99  <Method byte[] FM_Bytes.longToBytes(long, int)>
	//   37   55:astore_3        
		for(int j = 0; j < 4; j++)
	//*  38   56:iconst_0        
	//*  39   57:istore_1        
	//*  40   58:goto            73
			abyte0[j + 4] = abyte1[j];
	//   41   61:aload_2         
	//   42   62:iload_1         
	//   43   63:iconst_4        
	//   44   64:iadd            
	//   45   65:aload_3         
	//   46   66:iload_1         
	//   47   67:baload          
	//   48   68:bastore         

	//   49   69:iload_1         
	//   50   70:iconst_1        
	//   51   71:iadd            
	//   52   72:istore_1        
	//   53   73:iload_1         
	//   54   74:iconst_4        
	//   55   75:icmplt          61
		for(int k = 0; k < 4; k++)
	//*  56   78:iconst_0        
	//*  57   79:istore_1        
	//*  58   80:goto            99
			abyte0[k + 8] = sessionNumber[k];
	//   59   83:aload_2         
	//   60   84:iload_1         
	//   61   85:bipush          8
	//   62   87:iadd            
	//   63   88:aload_0         
	//   64   89:getfield        #58  <Field byte[] sessionNumber>
	//   65   92:iload_1         
	//   66   93:baload          
	//   67   94:bastore         

	//   68   95:iload_1         
	//   69   96:iconst_1        
	//   70   97:iadd            
	//   71   98:istore_1        
	//   72   99:iload_1         
	//   73  100:iconst_4        
	//   74  101:icmplt          83
		return abyte0;
	//   75  104:aload_2         
	//   76  105:areturn         
	}

	public static final int MESSAGE_HEAD_LENGTH = 12;
	public static final long SERIAL_MAK = 0xffffffffL;
	private final int SECURITY_LEVEL_LENGTH = 2;
	private final int SECURITY_LEVEL_OFFSET = 2;
	private final int SERIAL_NUMBER_LENGTH = 4;
	private final int SERIAL_NUMBER_OFFSET = 4;
	private final int SESSION_NUMBER_LENGTH = 4;
	private final int SESSION_NUMBER_OFFSET = 8;
	private ControlWord controlWord;
	private byte protocolVersion;
	private byte securityLevel[];
	private long serialNumber;
	private byte sessionNumber[];
}
