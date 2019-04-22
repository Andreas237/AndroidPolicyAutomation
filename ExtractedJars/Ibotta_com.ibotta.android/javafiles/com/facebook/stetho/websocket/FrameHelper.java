// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.websocket;

import com.facebook.stetho.common.Utf8Charset;

// Referenced classes of package com.facebook.stetho.websocket:
//			Frame

class FrameHelper
{

	FrameHelper()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public static Frame createBinaryFrame(byte abyte0[])
	{
		return createSimpleFrame((byte)2, abyte0);
	//    0    0:iconst_2        
	//    1    1:aload_0         
	//    2    2:invokestatic    #15  <Method Frame createSimpleFrame(byte, byte[])>
	//    3    5:areturn         
	}

	public static Frame createCloseFrame(int i, String s)
	{
		int j;
		if(s != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          17
		{
			s = ((String) (Utf8Charset.encodeUTF8(s)));
	//    2    4:aload_1         
	//    3    5:invokestatic    #23  <Method byte[] Utf8Charset.encodeUTF8(String)>
	//    4    8:astore_1        
			j = s.length + 2;
	//    5    9:aload_1         
	//    6   10:arraylength     
	//    7   11:iconst_2        
	//    8   12:iadd            
	//    9   13:istore_2        
		} else
	//*  10   14:goto            21
		{
			s = null;
	//   11   17:aconst_null     
	//   12   18:astore_1        
			j = 2;
	//   13   19:iconst_2        
	//   14   20:istore_2        
		}
		byte abyte0[] = new byte[j];
	//   15   21:iload_2         
	//   16   22:newarray        byte[]
	//   17   24:astore_3        
		abyte0[0] = (byte)(i >> 8 & 0xff);
	//   18   25:aload_3         
	//   19   26:iconst_0        
	//   20   27:iload_0         
	//   21   28:bipush          8
	//   22   30:ishr            
	//   23   31:sipush          255
	//   24   34:iand            
	//   25   35:int2byte        
	//   26   36:bastore         
		abyte0[1] = (byte)(i & 0xff);
	//   27   37:aload_3         
	//   28   38:iconst_1        
	//   29   39:iload_0         
	//   30   40:sipush          255
	//   31   43:iand            
	//   32   44:int2byte        
	//   33   45:bastore         
		if(s != null)
	//*  34   46:aload_1         
	//*  35   47:ifnull          59
			System.arraycopy(((Object) (s)), 0, ((Object) (abyte0)), 2, s.length);
	//   36   50:aload_1         
	//   37   51:iconst_0        
	//   38   52:aload_3         
	//   39   53:iconst_2        
	//   40   54:aload_1         
	//   41   55:arraylength     
	//   42   56:invokestatic    #29  <Method void System.arraycopy(Object, int, Object, int, int)>
		return createSimpleFrame((byte)8, abyte0);
	//   43   59:bipush          8
	//   44   61:aload_3         
	//   45   62:invokestatic    #15  <Method Frame createSimpleFrame(byte, byte[])>
	//   46   65:areturn         
	}

	public static Frame createPingFrame(byte abyte0[], int i)
	{
		return createSimpleFrame((byte)9, abyte0, i);
	//    0    0:bipush          9
	//    1    2:aload_0         
	//    2    3:iload_1         
	//    3    4:invokestatic    #34  <Method Frame createSimpleFrame(byte, byte[], int)>
	//    4    7:areturn         
	}

	public static Frame createPongFrame(byte abyte0[], int i)
	{
		return createSimpleFrame((byte)10, abyte0, i);
	//    0    0:bipush          10
	//    1    2:aload_0         
	//    2    3:iload_1         
	//    3    4:invokestatic    #34  <Method Frame createSimpleFrame(byte, byte[], int)>
	//    4    7:areturn         
	}

	private static Frame createSimpleFrame(byte byte0, byte abyte0[])
	{
		return createSimpleFrame(byte0, abyte0, abyte0.length);
	//    0    0:iload_0         
	//    1    1:aload_1         
	//    2    2:aload_1         
	//    3    3:arraylength     
	//    4    4:invokestatic    #34  <Method Frame createSimpleFrame(byte, byte[], int)>
	//    5    7:areturn         
	}

	private static Frame createSimpleFrame(byte byte0, byte abyte0[], int i)
	{
		Frame frame = new Frame();
	//    0    0:new             #37  <Class Frame>
	//    1    3:dup             
	//    2    4:invokespecial   #38  <Method void Frame()>
	//    3    7:astore_3        
		frame.fin = true;
	//    4    8:aload_3         
	//    5    9:iconst_1        
	//    6   10:putfield        #42  <Field boolean Frame.fin>
		frame.hasMask = false;
	//    7   13:aload_3         
	//    8   14:iconst_0        
	//    9   15:putfield        #45  <Field boolean Frame.hasMask>
		frame.opcode = byte0;
	//   10   18:aload_3         
	//   11   19:iload_0         
	//   12   20:putfield        #49  <Field byte Frame.opcode>
		frame.payloadLen = i;
	//   13   23:aload_3         
	//   14   24:iload_2         
	//   15   25:i2l             
	//   16   26:putfield        #53  <Field long Frame.payloadLen>
		frame.payloadData = abyte0;
	//   17   29:aload_3         
	//   18   30:aload_1         
	//   19   31:putfield        #57  <Field byte[] Frame.payloadData>
		return frame;
	//   20   34:aload_3         
	//   21   35:areturn         
	}

	public static Frame createTextFrame(String s)
	{
		return createSimpleFrame((byte)1, Utf8Charset.encodeUTF8(s));
	//    0    0:iconst_1        
	//    1    1:aload_0         
	//    2    2:invokestatic    #23  <Method byte[] Utf8Charset.encodeUTF8(String)>
	//    3    5:invokestatic    #15  <Method Frame createSimpleFrame(byte, byte[])>
	//    4    8:areturn         
	}
}
