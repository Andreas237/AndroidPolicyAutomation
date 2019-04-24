// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package cn.com.fmsh.util.socket;

import cn.com.fmsh.util.FM_Bytes;
import cn.com.fmsh.util.log.FMLog;
import cn.com.fmsh.util.log.LogFactory;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.Arrays;

// Referenced classes of package cn.com.fmsh.util.socket:
//			DataLengthHandle

public class ReceiveHandler
{

	private ReceiveHandler()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
		fmLog = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #21  <Field FMLog fmLog>
	//    5    9:return          
	}

	public static ReceiveHandler instance()
	{
		return new ReceiveHandler();
	//    0    0:new             #2   <Class ReceiveHandler>
	//    1    3:dup             
	//    2    4:invokespecial   #25  <Method void ReceiveHandler()>
	//    3    7:areturn         
	}

	public void cancel()
	{
		setStop(true);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:invokevirtual   #30  <Method void setStop(boolean)>
	//    3    5:return          
	}

	public boolean isStop()
	{
		return isStop;
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field boolean isStop>
	//    2    4:ireturn         
	}

	public byte[] receive(DataLengthHandle datalengthhandle, int i, DataInputStream datainputstream)
		throws IOException
	{
		isStop = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #33  <Field boolean isStop>
		if(fmLog == null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #21  <Field FMLog fmLog>
	//*   5    9:ifnonnull       22
			fmLog = LogFactory.getInstance().getLog();
	//    6   12:aload_0         
	//    7   13:invokestatic    #43  <Method LogFactory LogFactory.getInstance()>
	//    8   16:invokevirtual   #47  <Method FMLog LogFactory.getLog()>
	//    9   19:putfield        #21  <Field FMLog fmLog>
		if(datalengthhandle == null)
	//*  10   22:aload_1         
	//*  11   23:ifnonnull       32
			return receive(datainputstream);
	//   12   26:aload_0         
	//   13   27:aload_3         
	//   14   28:invokevirtual   #50  <Method byte[] receive(DataInputStream)>
	//   15   31:areturn         
		int k = datalengthhandle.getDataSize(datainputstream);
	//   16   32:aload_1         
	//   17   33:aload_3         
	//   18   34:invokeinterface #56  <Method int DataLengthHandle.getDataSize(DataInputStream)>
	//   19   39:istore          5
		if(k <= 0)
	//*  20   41:iload           5
	//*  21   43:ifgt            52
			return receive(datainputstream);
	//   22   46:aload_0         
	//   23   47:aload_3         
	//   24   48:invokevirtual   #50  <Method byte[] receive(DataInputStream)>
	//   25   51:areturn         
		int j = i;
	//   26   52:iload_2         
	//   27   53:istore          4
		if(i <= 0)
	//*  28   55:iload_2         
	//*  29   56:ifgt            64
			j = 5000;
	//   30   59:sipush          5000
	//   31   62:istore          4
		datalengthhandle = ((DataLengthHandle) (new byte[k]));
	//   32   64:iload           5
	//   33   66:newarray        byte[]
	//   34   68:astore_1        
		long l = System.currentTimeMillis();
	//   35   69:invokestatic    #62  <Method long System.currentTimeMillis()>
	//   36   72:lstore          6
		for(i = 0; i < k; i += datainputstream.read(((byte []) (datalengthhandle)), i, k - i))
	//*  37   74:iconst_0        
	//*  38   75:istore_2        
	//*  39   76:goto            155
			if(System.currentTimeMillis() - l >= (long)j)
	//*  40   79:invokestatic    #62  <Method long System.currentTimeMillis()>
	//*  41   82:lload           6
	//*  42   84:lsub            
	//*  43   85:iload           4
	//*  44   87:i2l             
	//*  45   88:lcmp            
	//*  46   89:iflt            142
			{
				if(fmLog != null)
	//*  47   92:aload_0         
	//*  48   93:getfield        #21  <Field FMLog fmLog>
	//*  49   96:ifnull          112
					fmLog.debug("ReceiveHandler", "\u63A5\u53D7\u6570\u636E\u8D85\u65F6");
	//   50   99:aload_0         
	//   51  100:getfield        #21  <Field FMLog fmLog>
	//   52  103:ldc1            #11  <String "ReceiveHandler">
	//   53  105:ldc1            #64  <String "\u63A5\u53D7\u6570\u636E\u8D85\u65F6">
	//   54  107:invokeinterface #70  <Method void FMLog.debug(String, String)>
				throw new IOException((new StringBuilder("\u5728\u6307\u5B9A\u7684\u65F6\u95F4[")).append(j).append("]\u5185\u672A\u63A5\u6536\u5230\u6307\u5B9A\u957F\u5EA6\u7684\u6570\u636E").toString());
	//   55  112:new             #37  <Class IOException>
	//   56  115:dup             
	//   57  116:new             #72  <Class StringBuilder>
	//   58  119:dup             
	//   59  120:ldc1            #74  <String "\u5728\u6307\u5B9A\u7684\u65F6\u95F4[">
	//   60  122:invokespecial   #77  <Method void StringBuilder(String)>
	//   61  125:iload           4
	//   62  127:invokevirtual   #81  <Method StringBuilder StringBuilder.append(int)>
	//   63  130:ldc1            #83  <String "]\u5185\u672A\u63A5\u6536\u5230\u6307\u5B9A\u957F\u5EA6\u7684\u6570\u636E">
	//   64  132:invokevirtual   #86  <Method StringBuilder StringBuilder.append(String)>
	//   65  135:invokevirtual   #90  <Method String StringBuilder.toString()>
	//   66  138:invokespecial   #91  <Method void IOException(String)>
	//   67  141:athrow          
			}

	//   68  142:iload_2         
	//   69  143:aload_3         
	//   70  144:aload_1         
	//   71  145:iload_2         
	//   72  146:iload           5
	//   73  148:iload_2         
	//   74  149:isub            
	//   75  150:invokevirtual   #97  <Method int DataInputStream.read(byte[], int, int)>
	//   76  153:iadd            
	//   77  154:istore_2        
	//   78  155:iload_2         
	//   79  156:iload           5
	//   80  158:icmplt          79
		return ((byte []) (datalengthhandle));
	//   81  161:aload_1         
	//   82  162:areturn         
	}

	public byte[] receive(DataInputStream datainputstream)
		throws IOException
	{
		byte abyte0[] = null;
	//    0    0:aconst_null     
	//    1    1:astore_3        
		byte abyte1[] = new byte[1024];
	//    2    2:sipush          1024
	//    3    5:newarray        byte[]
	//    4    7:astore          4
		int i = datainputstream.available();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #102 <Method int DataInputStream.available()>
	//    7   13:istore_2        
		if(fmLog != null)
	//*   8   14:aload_0         
	//*   9   15:getfield        #21  <Field FMLog fmLog>
	//*  10   18:ifnull          48
			fmLog.debug("ReceiveHandler", (new StringBuilder("DataInputStream available:")).append(i).toString());
	//   11   21:aload_0         
	//   12   22:getfield        #21  <Field FMLog fmLog>
	//   13   25:ldc1            #11  <String "ReceiveHandler">
	//   14   27:new             #72  <Class StringBuilder>
	//   15   30:dup             
	//   16   31:ldc1            #104 <String "DataInputStream available:">
	//   17   33:invokespecial   #77  <Method void StringBuilder(String)>
	//   18   36:iload_2         
	//   19   37:invokevirtual   #81  <Method StringBuilder StringBuilder.append(int)>
	//   20   40:invokevirtual   #90  <Method String StringBuilder.toString()>
	//   21   43:invokeinterface #70  <Method void FMLog.debug(String, String)>
	//*  22   48:goto            110
		while((i = datainputstream.read(abyte1)) > 0) 
		{
			if(fmLog != null)
	//*  23   51:aload_0         
	//*  24   52:getfield        #21  <Field FMLog fmLog>
	//*  25   55:ifnull          85
				fmLog.debug("ReceiveHandler", (new StringBuilder("in.read length:")).append(i).toString());
	//   26   58:aload_0         
	//   27   59:getfield        #21  <Field FMLog fmLog>
	//   28   62:ldc1            #11  <String "ReceiveHandler">
	//   29   64:new             #72  <Class StringBuilder>
	//   30   67:dup             
	//   31   68:ldc1            #106 <String "in.read length:">
	//   32   70:invokespecial   #77  <Method void StringBuilder(String)>
	//   33   73:iload_2         
	//   34   74:invokevirtual   #81  <Method StringBuilder StringBuilder.append(int)>
	//   35   77:invokevirtual   #90  <Method String StringBuilder.toString()>
	//   36   80:invokeinterface #70  <Method void FMLog.debug(String, String)>
			if(abyte0 == null)
	//*  37   85:aload_3         
	//*  38   86:ifnonnull       99
				abyte0 = Arrays.copyOf(abyte1, i);
	//   39   89:aload           4
	//   40   91:iload_2         
	//   41   92:invokestatic    #112 <Method byte[] Arrays.copyOf(byte[], int)>
	//   42   95:astore_3        
			else
	//*  43   96:goto            110
				FM_Bytes.join(abyte0, Arrays.copyOf(abyte1, i));
	//   44   99:aload_3         
	//   45  100:aload           4
	//   46  102:iload_2         
	//   47  103:invokestatic    #112 <Method byte[] Arrays.copyOf(byte[], int)>
	//   48  106:invokestatic    #118 <Method byte[] FM_Bytes.join(byte[], byte[])>
	//   49  109:pop             
		}
	//   50  110:aload_1         
	//   51  111:aload           4
	//   52  113:invokevirtual   #121 <Method int DataInputStream.read(byte[])>
	//   53  116:istore_2        
	//   54  117:iload_2         
	//   55  118:ifgt            51
		return abyte0;
	//   56  121:aload_3         
	//   57  122:areturn         
	}

	public void setStop(boolean flag)
	{
		isStop = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #33  <Field boolean isStop>
	//    3    5:return          
	}

	private static final int defaultTimeout = 5000;
	private static final String logTag = "ReceiveHandler";
	FMLog fmLog;
	private boolean isStop;
}
