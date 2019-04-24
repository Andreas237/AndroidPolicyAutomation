// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package cn.com.fmsh.communication.core;

import cn.com.fmsh.util.FM_Bytes;
import cn.com.fmsh.util.log.FMLog;
import cn.com.fmsh.util.log.LogFactory;
import cn.com.fmsh.util.socket.DataLengthHandle;
import java.io.DataInputStream;
import java.io.IOException;

public class NFCosDataLengthHandler
	implements DataLengthHandle
{

	public NFCosDataLengthHandler()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		fmLog = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #19  <Field FMLog fmLog>
		logTag = ((Class) (cn/com/fmsh/communication/core/NFCosDataLengthHandler)).getName();
	//    5    9:aload_0         
	//    6   10:ldc1            #2   <Class NFCosDataLengthHandler>
	//    7   12:invokevirtual   #25  <Method String Class.getName()>
	//    8   15:putfield        #27  <Field String logTag>
	//    9   18:return          
	}

	public int getDataSize(DataInputStream datainputstream)
		throws IOException
	{
		if(fmLog != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #19  <Field FMLog fmLog>
	//*   2    4:ifnull          17
			fmLog = LogFactory.getInstance().getLog();
	//    3    7:aload_0         
	//    4    8:invokestatic    #38  <Method LogFactory LogFactory.getInstance()>
	//    5   11:invokevirtual   #42  <Method FMLog LogFactory.getLog()>
	//    6   14:putfield        #19  <Field FMLog fmLog>
		if(datainputstream == null)
	//*   7   17:aload_1         
	//*   8   18:ifnonnull       23
			return -1;
	//    9   21:iconst_m1       
	//   10   22:ireturn         
		int i = datainputstream.available();
	//   11   23:aload_1         
	//   12   24:invokevirtual   #48  <Method int DataInputStream.available()>
	//   13   27:istore          4
		if(fmLog != null)
	//*  14   29:aload_0         
	//*  15   30:getfield        #19  <Field FMLog fmLog>
	//*  16   33:ifnull          66
			fmLog.debug(logTag, (new StringBuilder("DataInputStream available:")).append(i).toString());
	//   17   36:aload_0         
	//   18   37:getfield        #19  <Field FMLog fmLog>
	//   19   40:aload_0         
	//   20   41:getfield        #27  <Field String logTag>
	//   21   44:new             #50  <Class StringBuilder>
	//   22   47:dup             
	//   23   48:ldc1            #52  <String "DataInputStream available:">
	//   24   50:invokespecial   #55  <Method void StringBuilder(String)>
	//   25   53:iload           4
	//   26   55:invokevirtual   #59  <Method StringBuilder StringBuilder.append(int)>
	//   27   58:invokevirtual   #62  <Method String StringBuilder.toString()>
	//   28   61:invokeinterface #68  <Method void FMLog.debug(String, String)>
		byte byte3 = datainputstream.readByte();
	//   29   66:aload_1         
	//   30   67:invokevirtual   #72  <Method byte DataInputStream.readByte()>
	//   31   70:istore          5
		do
		{
			byte byte2;
			byte byte4;
			for(byte2 = datainputstream.readByte(); byte3 != ~byte2; byte2 = byte4)
	//*  32   72:aload_1         
	//*  33   73:invokevirtual   #72  <Method byte DataInputStream.readByte()>
	//*  34   76:istore          4
	//*  35   78:iload           5
	//*  36   80:iload           4
	//*  37   82:iconst_m1       
	//*  38   83:ixor            
	//*  39   84:icmpeq          104
			{
				byte4 = datainputstream.readByte();
	//   40   87:aload_1         
	//   41   88:invokevirtual   #72  <Method byte DataInputStream.readByte()>
	//   42   91:istore          6
				byte3 = byte2;
	//   43   93:iload           4
	//   44   95:istore          5
			}

	//   45   97:iload           6
	//   46   99:istore          4
	//*  47  101:goto            78
			byte byte0 = datainputstream.readByte();
	//   48  104:aload_1         
	//   49  105:invokevirtual   #72  <Method byte DataInputStream.readByte()>
	//   50  108:istore_2        
			byte byte1 = datainputstream.readByte();
	//   51  109:aload_1         
	//   52  110:invokevirtual   #72  <Method byte DataInputStream.readByte()>
	//   53  113:istore_3        
			if(byte2 != (byte0 ^ byte1))
	//*  54  114:iload           4
	//*  55  116:iload_2         
	//*  56  117:iload_3         
	//*  57  118:ixor            
	//*  58  119:icmpne          125
	//*  59  122:goto            142
			{
				byte byte5 = datainputstream.readByte();
	//   60  125:aload_1         
	//   61  126:invokevirtual   #72  <Method byte DataInputStream.readByte()>
	//   62  129:istore          6
				byte3 = byte2;
	//   63  131:iload           4
	//   64  133:istore          5
				byte2 = byte5;
	//   65  135:iload           6
	//   66  137:istore          4
			} else
	//*  67  139:goto            78
			{
				datainputstream = ((DataInputStream) (new byte[4]));
	//   68  142:iconst_4        
	//   69  143:newarray        byte[]
	//   70  145:astore_1        
				datainputstream[2] = byte0;
	//   71  146:aload_1         
	//   72  147:iconst_2        
	//   73  148:iload_2         
	//   74  149:bastore         
				datainputstream[3] = byte1;
	//   75  150:aload_1         
	//   76  151:iconst_3        
	//   77  152:iload_3         
	//   78  153:bastore         
				return FM_Bytes.bytesToInt(((byte []) (datainputstream)));
	//   79  154:aload_1         
	//   80  155:invokestatic    #78  <Method int FM_Bytes.bytesToInt(byte[])>
	//   81  158:ireturn         
			}
		} while(true);
	}

	public byte[] initDataSize(int i)
	{
		byte abyte0[] = new byte[4];
	//    0    0:iconst_4        
	//    1    1:newarray        byte[]
	//    2    3:astore_2        
		byte abyte1[] = FM_Bytes.intToBytes(i, 2);
	//    3    4:iload_1         
	//    4    5:iconst_2        
	//    5    6:invokestatic    #85  <Method byte[] FM_Bytes.intToBytes(int, int)>
	//    6    9:astore_3        
		abyte0[1] = (byte)(abyte1[0] ^ abyte1[1]);
	//    7   10:aload_2         
	//    8   11:iconst_1        
	//    9   12:aload_3         
	//   10   13:iconst_0        
	//   11   14:baload          
	//   12   15:aload_3         
	//   13   16:iconst_1        
	//   14   17:baload          
	//   15   18:ixor            
	//   16   19:int2byte        
	//   17   20:bastore         
		abyte0[0] = (byte)(~abyte0[1]);
	//   18   21:aload_2         
	//   19   22:iconst_0        
	//   20   23:aload_2         
	//   21   24:iconst_1        
	//   22   25:baload          
	//   23   26:iconst_m1       
	//   24   27:ixor            
	//   25   28:int2byte        
	//   26   29:bastore         
		abyte0[2] = abyte1[0];
	//   27   30:aload_2         
	//   28   31:iconst_2        
	//   29   32:aload_3         
	//   30   33:iconst_0        
	//   31   34:baload          
	//   32   35:bastore         
		abyte0[3] = abyte1[1];
	//   33   36:aload_2         
	//   34   37:iconst_3        
	//   35   38:aload_3         
	//   36   39:iconst_1        
	//   37   40:baload          
	//   38   41:bastore         
		return abyte0;
	//   39   42:aload_2         
	//   40   43:areturn         
	}

	private static final int DATA_SIZE_LENGTH = 4;
	private FMLog fmLog;
	private String logTag;
}
