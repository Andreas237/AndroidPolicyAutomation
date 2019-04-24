// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package cn.com.fmsh.util;

import java.io.PrintStream;

// Referenced classes of package cn.com.fmsh.util:
//			FM_Bytes

public class BCCUtil
{

	public BCCUtil()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public static byte calculateBCC(byte abyte0[])
	{
		if(abyte0 == null || abyte0.length < 1)
	//*   0    0:aload_0         
	//*   1    1:ifnull          10
	//*   2    4:aload_0         
	//*   3    5:arraylength     
	//*   4    6:iconst_1        
	//*   5    7:icmpge          12
			return 0;
	//    6   10:iconst_0        
	//    7   11:ireturn         
		if(abyte0.length == 1)
	//*   8   12:aload_0         
	//*   9   13:arraylength     
	//*  10   14:iconst_1        
	//*  11   15:icmpne          22
			return abyte0[0];
	//   12   18:aload_0         
	//   13   19:iconst_0        
	//   14   20:baload          
	//   15   21:ireturn         
		byte byte0 = abyte0[0];
	//   16   22:aload_0         
	//   17   23:iconst_0        
	//   18   24:baload          
	//   19   25:istore_1        
		for(int i = 1; i < abyte0.length; i++)
	//*  20   26:iconst_1        
	//*  21   27:istore_2        
	//*  22   28:goto            42
			byte0 = (byte)(abyte0[i] ^ byte0);
	//   23   31:aload_0         
	//   24   32:iload_2         
	//   25   33:baload          
	//   26   34:iload_1         
	//   27   35:ixor            
	//   28   36:int2byte        
	//   29   37:istore_1        

	//   30   38:iload_2         
	//   31   39:iconst_1        
	//   32   40:iadd            
	//   33   41:istore_2        
	//   34   42:iload_2         
	//   35   43:aload_0         
	//   36   44:arraylength     
	//   37   45:icmplt          31
		return byte0;
	//   38   48:iload_1         
	//   39   49:ireturn         
	}

	public static void main(String args[])
	{
		byte byte0 = calculateBCC(FM_Bytes.hexStringToBytes("383F2981687E5C020000000000000000000000000000000000000000000000000000000000000000201407221459599F9E63D5581EEEF1595FE022419F15E9000000"));
	//    0    0:ldc1            #15  <String "383F2981687E5C020000000000000000000000000000000000000000000000000000000000000000201407221459599F9E63D5581EEEF1595FE022419F15E9000000">
	//    1    2:invokestatic    #21  <Method byte[] FM_Bytes.hexStringToBytes(String)>
	//    2    5:invokestatic    #23  <Method byte calculateBCC(byte[])>
	//    3    8:istore_1        
		System.out.println(String.format("%X", new Object[] {
			Byte.valueOf(byte0)
		}));
	//    4    9:getstatic       #29  <Field PrintStream System.out>
	//    5   12:ldc1            #31  <String "%X">
	//    6   14:iconst_1        
	//    7   15:anewarray       Object[]
	//    8   18:dup             
	//    9   19:iconst_0        
	//   10   20:iload_1         
	//   11   21:invokestatic    #37  <Method Byte Byte.valueOf(byte)>
	//   12   24:aastore         
	//   13   25:invokestatic    #43  <Method String String.format(String, Object[])>
	//   14   28:invokevirtual   #49  <Method void PrintStream.println(String)>
	//   15   31:return          
	}
}
