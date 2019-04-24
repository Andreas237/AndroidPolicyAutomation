// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package cn.com.fmsh.communication.core;

import cn.com.fmsh.communication.exception.session.OpenSessionException;

public class OpenSessionResponse
{

	public OpenSessionResponse()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:bipush          32
	//    4    7:putfield        #25  <Field int DATA_LENGTH>
	//    5   10:aload_0         
	//    6   11:iconst_0        
	//    7   12:putfield        #27  <Field int TERMINAL_RANDOM_OFFSET>
	//    8   15:aload_0         
	//    9   16:bipush          8
	//   10   18:putfield        #29  <Field int TERMINAL_RANDOM_LENGTH>
	//   11   21:aload_0         
	//   12   22:bipush          8
	//   13   24:putfield        #31  <Field int SESSION_NUMBER_OFFSET>
	//   14   27:aload_0         
	//   15   28:iconst_4        
	//   16   29:putfield        #33  <Field int SESSION_NUMBER_LENGTH>
	//   17   32:aload_0         
	//   18   33:bipush          12
	//   19   35:putfield        #35  <Field int SESSION_KEY_OFFSET>
	//   20   38:aload_0         
	//   21   39:bipush          16
	//   22   41:putfield        #37  <Field int SESSION_KEY_LENGTH>
	//   23   44:aload_0         
	//   24   45:bipush          28
	//   25   47:putfield        #39  <Field int SERIAL_NUMBER_OFFSET>
	//   26   50:aload_0         
	//   27   51:iconst_4        
	//   28   52:putfield        #41  <Field int SERIAL_NUMBER_LENGTH>
		terminalRandom = new byte[8];
	//   29   55:aload_0         
	//   30   56:bipush          8
	//   31   58:newarray        byte[]
	//   32   60:putfield        #43  <Field byte[] terminalRandom>
		sessionNumber = new byte[4];
	//   33   63:aload_0         
	//   34   64:iconst_4        
	//   35   65:newarray        byte[]
	//   36   67:putfield        #45  <Field byte[] sessionNumber>
		sessionKey = new byte[16];
	//   37   70:aload_0         
	//   38   71:bipush          16
	//   39   73:newarray        byte[]
	//   40   75:putfield        #47  <Field byte[] sessionKey>
		serialNumber = new byte[4];
	//   41   78:aload_0         
	//   42   79:iconst_4        
	//   43   80:newarray        byte[]
	//   44   82:putfield        #49  <Field byte[] serialNumber>
	//   45   85:return          
	}

	public void fromBytes(byte abyte0[])
		throws OpenSessionException
	{
		if(abyte0 == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       5
			return;
	//    2    4:return          
		if(abyte0.length != 32)
	//*   3    5:aload_1         
	//*   4    6:arraylength     
	//*   5    7:bipush          32
	//*   6    9:icmpeq          22
			throw new OpenSessionException("\u7B7E\u5230\u54CD\u5E94\u6570\u636E\u957F\u5EA6\u4E0D\u5408\u6CD5");
	//    7   12:new             #54  <Class OpenSessionException>
	//    8   15:dup             
	//    9   16:ldc1            #56  <String "\u7B7E\u5230\u54CD\u5E94\u6570\u636E\u957F\u5EA6\u4E0D\u5408\u6CD5">
	//   10   18:invokespecial   #59  <Method void OpenSessionException(String)>
	//   11   21:athrow          
		for(int i = 0; i < 8; i++)
	//*  12   22:iconst_0        
	//*  13   23:istore_2        
	//*  14   24:goto            42
			terminalRandom[i] = abyte0[i + 0];
	//   15   27:aload_0         
	//   16   28:getfield        #43  <Field byte[] terminalRandom>
	//   17   31:iload_2         
	//   18   32:aload_1         
	//   19   33:iload_2         
	//   20   34:iconst_0        
	//   21   35:iadd            
	//   22   36:baload          
	//   23   37:bastore         

	//   24   38:iload_2         
	//   25   39:iconst_1        
	//   26   40:iadd            
	//   27   41:istore_2        
	//   28   42:iload_2         
	//   29   43:bipush          8
	//   30   45:icmplt          27
		for(int j = 0; j < 4; j++)
	//*  31   48:iconst_0        
	//*  32   49:istore_2        
	//*  33   50:goto            69
			sessionNumber[j] = abyte0[j + 8];
	//   34   53:aload_0         
	//   35   54:getfield        #45  <Field byte[] sessionNumber>
	//   36   57:iload_2         
	//   37   58:aload_1         
	//   38   59:iload_2         
	//   39   60:bipush          8
	//   40   62:iadd            
	//   41   63:baload          
	//   42   64:bastore         

	//   43   65:iload_2         
	//   44   66:iconst_1        
	//   45   67:iadd            
	//   46   68:istore_2        
	//   47   69:iload_2         
	//   48   70:iconst_4        
	//   49   71:icmplt          53
		for(int k = 0; k < 16; k++)
	//*  50   74:iconst_0        
	//*  51   75:istore_2        
	//*  52   76:goto            95
			sessionKey[k] = abyte0[k + 12];
	//   53   79:aload_0         
	//   54   80:getfield        #47  <Field byte[] sessionKey>
	//   55   83:iload_2         
	//   56   84:aload_1         
	//   57   85:iload_2         
	//   58   86:bipush          12
	//   59   88:iadd            
	//   60   89:baload          
	//   61   90:bastore         

	//   62   91:iload_2         
	//   63   92:iconst_1        
	//   64   93:iadd            
	//   65   94:istore_2        
	//   66   95:iload_2         
	//   67   96:bipush          16
	//   68   98:icmplt          79
		for(int l = 0; l < 4; l++)
	//*  69  101:iconst_0        
	//*  70  102:istore_2        
	//*  71  103:goto            122
			serialNumber[l] = abyte0[l + 28];
	//   72  106:aload_0         
	//   73  107:getfield        #49  <Field byte[] serialNumber>
	//   74  110:iload_2         
	//   75  111:aload_1         
	//   76  112:iload_2         
	//   77  113:bipush          28
	//   78  115:iadd            
	//   79  116:baload          
	//   80  117:bastore         

	//   81  118:iload_2         
	//   82  119:iconst_1        
	//   83  120:iadd            
	//   84  121:istore_2        
	//   85  122:iload_2         
	//   86  123:iconst_4        
	//   87  124:icmplt          106
	//   88  127:return          
	}

	public byte[] getSerialNumber()
	{
		return serialNumber;
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field byte[] serialNumber>
	//    2    4:areturn         
	}

	public byte[] getSessionKey()
	{
		return sessionKey;
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field byte[] sessionKey>
	//    2    4:areturn         
	}

	public byte[] getSessionNumber()
	{
		return sessionNumber;
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field byte[] sessionNumber>
	//    2    4:areturn         
	}

	public byte[] getTerminalRandom()
	{
		return terminalRandom;
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field byte[] terminalRandom>
	//    2    4:areturn         
	}

	public void setSerialNumber(byte abyte0[])
	{
		serialNumber = abyte0;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #49  <Field byte[] serialNumber>
	//    3    5:return          
	}

	public void setSessionKey(byte abyte0[])
	{
		sessionKey = abyte0;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #47  <Field byte[] sessionKey>
	//    3    5:return          
	}

	public void setSessionNumber(byte abyte0[])
	{
		sessionNumber = abyte0;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #45  <Field byte[] sessionNumber>
	//    3    5:return          
	}

	public void setTerminalRandom(byte abyte0[])
	{
		terminalRandom = abyte0;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #43  <Field byte[] terminalRandom>
	//    3    5:return          
	}

	public byte[] toBytes()
	{
		byte abyte0[] = new byte[32];
	//    0    0:bipush          32
	//    1    2:newarray        byte[]
	//    2    4:astore_2        
		for(int i = 0; i < 8; i++)
	//*   3    5:iconst_0        
	//*   4    6:istore_1        
	//*   5    7:goto            25
			abyte0[i + 0] = terminalRandom[i];
	//    6   10:aload_2         
	//    7   11:iload_1         
	//    8   12:iconst_0        
	//    9   13:iadd            
	//   10   14:aload_0         
	//   11   15:getfield        #43  <Field byte[] terminalRandom>
	//   12   18:iload_1         
	//   13   19:baload          
	//   14   20:bastore         

	//   15   21:iload_1         
	//   16   22:iconst_1        
	//   17   23:iadd            
	//   18   24:istore_1        
	//   19   25:iload_1         
	//   20   26:bipush          8
	//   21   28:icmplt          10
		for(int j = 0; j < 4; j++)
	//*  22   31:iconst_0        
	//*  23   32:istore_1        
	//*  24   33:goto            52
			abyte0[j + 8] = sessionNumber[j];
	//   25   36:aload_2         
	//   26   37:iload_1         
	//   27   38:bipush          8
	//   28   40:iadd            
	//   29   41:aload_0         
	//   30   42:getfield        #45  <Field byte[] sessionNumber>
	//   31   45:iload_1         
	//   32   46:baload          
	//   33   47:bastore         

	//   34   48:iload_1         
	//   35   49:iconst_1        
	//   36   50:iadd            
	//   37   51:istore_1        
	//   38   52:iload_1         
	//   39   53:iconst_4        
	//   40   54:icmplt          36
		for(int k = 0; k < 16; k++)
	//*  41   57:iconst_0        
	//*  42   58:istore_1        
	//*  43   59:goto            78
			abyte0[k + 12] = sessionKey[k];
	//   44   62:aload_2         
	//   45   63:iload_1         
	//   46   64:bipush          12
	//   47   66:iadd            
	//   48   67:aload_0         
	//   49   68:getfield        #47  <Field byte[] sessionKey>
	//   50   71:iload_1         
	//   51   72:baload          
	//   52   73:bastore         

	//   53   74:iload_1         
	//   54   75:iconst_1        
	//   55   76:iadd            
	//   56   77:istore_1        
	//   57   78:iload_1         
	//   58   79:bipush          16
	//   59   81:icmplt          62
		for(int l = 0; l < 4; l++)
	//*  60   84:iconst_0        
	//*  61   85:istore_1        
	//*  62   86:goto            105
			abyte0[l + 28] = serialNumber[l];
	//   63   89:aload_2         
	//   64   90:iload_1         
	//   65   91:bipush          28
	//   66   93:iadd            
	//   67   94:aload_0         
	//   68   95:getfield        #49  <Field byte[] serialNumber>
	//   69   98:iload_1         
	//   70   99:baload          
	//   71  100:bastore         

	//   72  101:iload_1         
	//   73  102:iconst_1        
	//   74  103:iadd            
	//   75  104:istore_1        
	//   76  105:iload_1         
	//   77  106:iconst_4        
	//   78  107:icmplt          89
		return abyte0;
	//   79  110:aload_2         
	//   80  111:areturn         
	}

	public final int DATA_LENGTH = 32;
	private final int SERIAL_NUMBER_LENGTH = 4;
	private final int SERIAL_NUMBER_OFFSET = 28;
	public final int SESSION_KEY_LENGTH = 16;
	private final int SESSION_KEY_OFFSET = 12;
	private final int SESSION_NUMBER_LENGTH = 4;
	private final int SESSION_NUMBER_OFFSET = 8;
	private final int TERMINAL_RANDOM_LENGTH = 8;
	private final int TERMINAL_RANDOM_OFFSET = 0;
	private byte serialNumber[];
	private byte sessionKey[];
	private byte sessionNumber[];
	private byte terminalRandom[];
}
