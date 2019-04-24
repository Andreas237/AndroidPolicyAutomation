// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package cn.com.fmsh.communication.core;

import cn.com.fmsh.util.FM_CN;
import cn.com.fmsh.util.Util4Java;

public class CloseSessionRequest
{

	public CloseSessionRequest()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
	//    2    4:return          
	}

	public void fromBytes(byte abyte0[])
	{
		if(abyte0 == null || abyte0.length != 7)
	//*   0    0:aload_1         
	//*   1    1:ifnull          11
	//*   2    4:aload_1         
	//*   3    5:arraylength     
	//*   4    6:bipush          7
	//*   5    8:icmpeq          12
		{
			return;
	//    6   11:return          
		} else
		{
			terminalTime = abyte0;
	//    7   12:aload_0         
	//    8   13:aload_1         
	//    9   14:putfield        #20  <Field byte[] terminalTime>
			return;
	//   10   17:return          
		}
	}

	public byte[] getTerminalTime()
	{
		return terminalTime;
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field byte[] terminalTime>
	//    2    4:areturn         
	}

	public void setTerminalTime(byte abyte0[])
	{
		terminalTime = abyte0;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #20  <Field byte[] terminalTime>
	//    3    5:return          
	}

	public byte[] toBytes()
	{
		byte abyte0[] = new byte[7];
	//    0    0:bipush          7
	//    1    2:newarray        byte[]
	//    2    4:astore_2        
		if(terminalTime == null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #20  <Field byte[] terminalTime>
	//*   5    9:ifnonnull       24
			terminalTime = FM_CN.string2Bcd(Util4Java.date2string("yyyyMMddHHmmss"));
	//    6   12:aload_0         
	//    7   13:ldc1            #26  <String "yyyyMMddHHmmss">
	//    8   15:invokestatic    #32  <Method String Util4Java.date2string(String)>
	//    9   18:invokestatic    #38  <Method byte[] FM_CN.string2Bcd(String)>
	//   10   21:putfield        #20  <Field byte[] terminalTime>
		for(int i = 0; i < 7; i++)
	//*  11   24:iconst_0        
	//*  12   25:istore_1        
	//*  13   26:goto            44
			abyte0[i + 0] = terminalTime[i];
	//   14   29:aload_2         
	//   15   30:iload_1         
	//   16   31:iconst_0        
	//   17   32:iadd            
	//   18   33:aload_0         
	//   19   34:getfield        #20  <Field byte[] terminalTime>
	//   20   37:iload_1         
	//   21   38:baload          
	//   22   39:bastore         

	//   23   40:iload_1         
	//   24   41:iconst_1        
	//   25   42:iadd            
	//   26   43:istore_1        
	//   27   44:iload_1         
	//   28   45:bipush          7
	//   29   47:icmplt          29
		return abyte0;
	//   30   50:aload_2         
	//   31   51:areturn         
	}

	private static final int TERMINAL_TIME_LENGTH = 7;
	private static final int TERMINAL_TIME_OFFSET = 0;
	private byte terminalTime[];
}
