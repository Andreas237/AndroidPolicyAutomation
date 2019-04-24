// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package cn.com.fmsh.script.bean;

import cn.com.fmsh.util.FM_Bytes;
import java.io.PrintStream;

public class ApduResponse
{

	public ApduResponse()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}

	public static void main(String args[])
	{
		args = ((String []) (FM_Bytes.hexStringToBytes("01")));
	//    0    0:ldc1            #18  <String "01">
	//    1    2:invokestatic    #24  <Method byte[] FM_Bytes.hexStringToBytes(String)>
	//    2    5:astore_0        
		ApduResponse apduresponse = new ApduResponse();
	//    3    6:new             #2   <Class ApduResponse>
	//    4    9:dup             
	//    5   10:invokespecial   #25  <Method void ApduResponse()>
	//    6   13:astore_1        
		apduresponse.setResult(((byte []) (args)));
	//    7   14:aload_1         
	//    8   15:aload_0         
	//    9   16:invokevirtual   #29  <Method void setResult(byte[])>
		System.out.println(FM_Bytes.bytesToHexString(apduresponse.toBytes()));
	//   10   19:getstatic       #35  <Field PrintStream System.out>
	//   11   22:aload_1         
	//   12   23:invokevirtual   #39  <Method byte[] toBytes()>
	//   13   26:invokestatic    #43  <Method String FM_Bytes.bytesToHexString(byte[])>
	//   14   29:invokevirtual   #49  <Method void PrintStream.println(String)>
	//   15   32:return          
	}

	public byte[] getApdu()
	{
		return apdu;
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field byte[] apdu>
	//    2    4:areturn         
	}

	public int getId()
	{
		return id;
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field int id>
	//    2    4:ireturn         
	}

	public byte[] getResult()
	{
		return result;
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field byte[] result>
	//    2    4:areturn         
	}

	public void setApdu(byte abyte0[])
	{
		apdu = abyte0;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #52  <Field byte[] apdu>
	//    3    5:return          
	}

	public void setId(int i)
	{
		id = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #56  <Field int id>
	//    3    5:return          
	}

	public void setResult(byte abyte0[])
	{
		result = abyte0;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #59  <Field byte[] result>
	//    3    5:return          
	}

	public byte[] toBytes()
	{
		if(result == null || result.length < 1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #59  <Field byte[] result>
	//*   2    4:ifnull          16
	//*   3    7:aload_0         
	//*   4    8:getfield        #59  <Field byte[] result>
	//*   5   11:arraylength     
	//*   6   12:iconst_1        
	//*   7   13:icmpge          18
			return null;
	//    8   16:aconst_null     
	//    9   17:areturn         
		byte abyte0[] = new byte[result.length + 3];
	//   10   18:aload_0         
	//   11   19:getfield        #59  <Field byte[] result>
	//   12   22:arraylength     
	//   13   23:iconst_3        
	//   14   24:iadd            
	//   15   25:newarray        byte[]
	//   16   27:astore_2        
		abyte0[0] = -94;
	//   17   28:aload_2         
	//   18   29:iconst_0        
	//   19   30:bipush          -94
	//   20   32:bastore         
		abyte0[1] = (byte)(result.length + 1);
	//   21   33:aload_2         
	//   22   34:iconst_1        
	//   23   35:aload_0         
	//   24   36:getfield        #59  <Field byte[] result>
	//   25   39:arraylength     
	//   26   40:iconst_1        
	//   27   41:iadd            
	//   28   42:int2byte        
	//   29   43:bastore         
		abyte0[2] = (byte)id;
	//   30   44:aload_2         
	//   31   45:iconst_2        
	//   32   46:aload_0         
	//   33   47:getfield        #56  <Field int id>
	//   34   50:int2byte        
	//   35   51:bastore         
		for(int i = 0; i < result.length; i++)
	//*  36   52:iconst_0        
	//*  37   53:istore_1        
	//*  38   54:goto            72
			abyte0[i + 3] = result[i];
	//   39   57:aload_2         
	//   40   58:iload_1         
	//   41   59:iconst_3        
	//   42   60:iadd            
	//   43   61:aload_0         
	//   44   62:getfield        #59  <Field byte[] result>
	//   45   65:iload_1         
	//   46   66:baload          
	//   47   67:bastore         

	//   48   68:iload_1         
	//   49   69:iconst_1        
	//   50   70:iadd            
	//   51   71:istore_1        
	//   52   72:iload_1         
	//   53   73:aload_0         
	//   54   74:getfield        #59  <Field byte[] result>
	//   55   77:arraylength     
	//   56   78:icmplt          57
		return abyte0;
	//   57   81:aload_2         
	//   58   82:areturn         
	}

	private byte apdu[];
	private int id;
	private byte result[];
}
