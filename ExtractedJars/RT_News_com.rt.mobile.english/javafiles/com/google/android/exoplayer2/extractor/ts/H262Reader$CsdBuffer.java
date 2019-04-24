// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.extractor.ts;

import java.util.Arrays;

// Referenced classes of package com.google.android.exoplayer2.extractor.ts:
//			H262Reader

private static final class H262Reader$CsdBuffer
{

	public void onData(byte abyte0[], int i, int j)
	{
		if(!isFilling)
	//*   0    0:aload_0         
	//*   1    1:getfield        #32  <Field boolean isFilling>
	//*   2    4:ifne            8
			return;
	//    3    7:return          
		j -= i;
	//    4    8:iload_3         
	//    5    9:iload_2         
	//    6   10:isub            
	//    7   11:istore_3        
		if(data.length < length + j)
	//*   8   12:aload_0         
	//*   9   13:getfield        #28  <Field byte[] data>
	//*  10   16:arraylength     
	//*  11   17:aload_0         
	//*  12   18:getfield        #34  <Field int length>
	//*  13   21:iload_3         
	//*  14   22:iadd            
	//*  15   23:icmpge          45
			data = Arrays.copyOf(data, (length + j) * 2);
	//   16   26:aload_0         
	//   17   27:aload_0         
	//   18   28:getfield        #28  <Field byte[] data>
	//   19   31:aload_0         
	//   20   32:getfield        #34  <Field int length>
	//   21   35:iload_3         
	//   22   36:iadd            
	//   23   37:iconst_2        
	//   24   38:imul            
	//   25   39:invokestatic    #40  <Method byte[] Arrays.copyOf(byte[], int)>
	//   26   42:putfield        #28  <Field byte[] data>
		System.arraycopy(((Object) (abyte0)), i, ((Object) (data)), length, j);
	//   27   45:aload_1         
	//   28   46:iload_2         
	//   29   47:aload_0         
	//   30   48:getfield        #28  <Field byte[] data>
	//   31   51:aload_0         
	//   32   52:getfield        #34  <Field int length>
	//   33   55:iload_3         
	//   34   56:invokestatic    #46  <Method void System.arraycopy(Object, int, Object, int, int)>
		length = length + j;
	//   35   59:aload_0         
	//   36   60:aload_0         
	//   37   61:getfield        #34  <Field int length>
	//   38   64:iload_3         
	//   39   65:iadd            
	//   40   66:putfield        #34  <Field int length>
	//   41   69:return          
	}

	public boolean onStartCode(int i, int j)
	{
		if(isFilling)
	//*   0    0:aload_0         
	//*   1    1:getfield        #32  <Field boolean isFilling>
	//*   2    4:ifeq            49
		{
			length = length - j;
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #34  <Field int length>
	//    6   12:iload_2         
	//    7   13:isub            
	//    8   14:putfield        #34  <Field int length>
			if(sequenceExtensionPosition == 0 && i == 181)
	//*   9   17:aload_0         
	//*  10   18:getfield        #50  <Field int sequenceExtensionPosition>
	//*  11   21:ifne            42
	//*  12   24:iload_1         
	//*  13   25:sipush          181
	//*  14   28:icmpne          42
			{
				sequenceExtensionPosition = length;
	//   15   31:aload_0         
	//   16   32:aload_0         
	//   17   33:getfield        #34  <Field int length>
	//   18   36:putfield        #50  <Field int sequenceExtensionPosition>
			} else
	//*  19   39:goto            61
			{
				isFilling = false;
	//   20   42:aload_0         
	//   21   43:iconst_0        
	//   22   44:putfield        #32  <Field boolean isFilling>
				return true;
	//   23   47:iconst_1        
	//   24   48:ireturn         
			}
		} else
		if(i == 179)
	//*  25   49:iload_1         
	//*  26   50:sipush          179
	//*  27   53:icmpne          61
			isFilling = true;
	//   28   56:aload_0         
	//   29   57:iconst_1        
	//   30   58:putfield        #32  <Field boolean isFilling>
		onData(START_CODE, 0, START_CODE.length);
	//   31   61:aload_0         
	//   32   62:getstatic       #21  <Field byte[] START_CODE>
	//   33   65:iconst_0        
	//   34   66:getstatic       #21  <Field byte[] START_CODE>
	//   35   69:arraylength     
	//   36   70:invokevirtual   #52  <Method void onData(byte[], int, int)>
		return false;
	//   37   73:iconst_0        
	//   38   74:ireturn         
	}

	public void reset()
	{
		isFilling = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #32  <Field boolean isFilling>
		length = 0;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #34  <Field int length>
		sequenceExtensionPosition = 0;
	//    6   10:aload_0         
	//    7   11:iconst_0        
	//    8   12:putfield        #50  <Field int sequenceExtensionPosition>
	//    9   15:return          
	}

	private static final byte START_CODE[] = {
		0, 0, 1
	};
	public byte data[];
	private boolean isFilling;
	public int length;
	public int sequenceExtensionPosition;

	static 
	{
	//    0    0:iconst_3        
	//    1    1:newarray        byte[]
	//    2    3:dup             
	//    3    4:iconst_0        
	//    4    5:ldc1            #18  <Int 0>
	//    5    7:bastore         
	//    6    8:dup             
	//    7    9:iconst_1        
	//    8   10:ldc1            #18  <Int 0>
	//    9   12:bastore         
	//   10   13:dup             
	//   11   14:iconst_2        
	//   12   15:ldc1            #19  <Int 1>
	//   13   17:bastore         
	//   14   18:putstatic       #21  <Field byte[] START_CODE>
	//*  15   21:return          
	}

	public H262Reader$CsdBuffer(int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void Object()>
		data = new byte[i];
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:newarray        byte[]
	//    5    8:putfield        #28  <Field byte[] data>
	//    6   11:return          
	}
}
