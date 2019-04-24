// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package cn.com.fmsh.util;

import java.io.PrintStream;

// Referenced classes of package cn.com.fmsh.util:
//			FM_Bytes

public class CRCUtil
{

	public CRCUtil()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public static byte[] calculateCRC16(byte abyte0[])
	{
		int k = abyte0.length;
	//    0    0:aload_0         
	//    1    1:arraylength     
	//    2    2:istore          5
		short word0 = 0;
	//    3    4:iconst_0        
	//    4    5:istore_1        
		for(int i = 0; i < k; i++)
	//*   5    6:iconst_0        
	//*   6    7:istore_2        
	//*   7    8:goto            72
		{
			short word1 = (short)(abyte0[i] << 8);
	//    8   11:aload_0         
	//    9   12:iload_2         
	//   10   13:baload          
	//   11   14:bipush          8
	//   12   16:ishl            
	//   13   17:int2short       
	//   14   18:istore_3        
			for(int j = 0; j < 8; j++)
	//*  15   19:iconst_0        
	//*  16   20:istore          4
	//*  17   22:goto            61
			{
				if((short)(word0 ^ word1) <= 0)
	//*  18   25:iload_1         
	//*  19   26:iload_3         
	//*  20   27:ixor            
	//*  21   28:int2short       
	//*  22   29:ifgt            45
					word0 = (short)((short)(word0 << 1) ^ 0x1021);
	//   23   32:iload_1         
	//   24   33:iconst_1        
	//   25   34:ishl            
	//   26   35:int2short       
	//   27   36:sipush          4129
	//   28   39:ixor            
	//   29   40:int2short       
	//   30   41:istore_1        
				else
	//*  31   42:goto            50
					word0 <<= 1;
	//   32   45:iload_1         
	//   33   46:iconst_1        
	//   34   47:ishl            
	//   35   48:int2short       
	//   36   49:istore_1        
				word1 <<= 1;
	//   37   50:iload_3         
	//   38   51:iconst_1        
	//   39   52:ishl            
	//   40   53:int2short       
	//   41   54:istore_3        
			}

	//   42   55:iload           4
	//   43   57:iconst_1        
	//   44   58:iadd            
	//   45   59:istore          4
	//   46   61:iload           4
	//   47   63:bipush          8
	//   48   65:icmplt          25
		}

	//   49   68:iload_2         
	//   50   69:iconst_1        
	//   51   70:iadd            
	//   52   71:istore_2        
	//   53   72:iload_2         
	//   54   73:iload           5
	//   55   75:icmplt          11
		return FM_Bytes.intToBytes(((int) (word0)), 2);
	//   56   78:iload_1         
	//   57   79:iconst_2        
	//   58   80:invokestatic    #17  <Method byte[] FM_Bytes.intToBytes(int, int)>
	//   59   83:areturn         
	}

	public static void main(String args[])
	{
		args = ((String []) (calculateCRC16(FM_Bytes.hexStringToBytes("01000000000000000300000000000000000000000000000000000000000000000000000000000000000000000000000000000030910E01010E10423244303832443232443134444345308E0101"))));
	//    0    0:ldc1            #21  <String "01000000000000000300000000000000000000000000000000000000000000000000000000000000000000000000000000000030910E01010E10423244303832443232443134444345308E0101">
	//    1    2:invokestatic    #25  <Method byte[] FM_Bytes.hexStringToBytes(String)>
	//    2    5:invokestatic    #27  <Method byte[] calculateCRC16(byte[])>
	//    3    8:astore_0        
		System.out.println(FM_Bytes.bytesToHexString(((byte []) (args))));
	//    4    9:getstatic       #33  <Field PrintStream System.out>
	//    5   12:aload_0         
	//    6   13:invokestatic    #37  <Method String FM_Bytes.bytesToHexString(byte[])>
	//    7   16:invokevirtual   #43  <Method void PrintStream.println(String)>
		System.out.println(65535);
	//    8   19:getstatic       #33  <Field PrintStream System.out>
	//    9   22:ldc1            #44  <Int 65535>
	//   10   24:invokevirtual   #47  <Method void PrintStream.println(int)>
	//   11   27:return          
	}
}
