// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.extractor.ts;

import java.util.Arrays;

// Referenced classes of package com.google.android.exoplayer.extractor.ts:
//			H262Reader

private static final class H262Reader$CsdBuffer
{

	public void onData(byte abyte0[], int i, int j)
	{
		if(!isFilling)
	//*   0    0:aload_0         
	//*   1    1:getfield        #26  <Field boolean isFilling>
	//*   2    4:ifne            8
			return;
	//    3    7:return          
		j -= i;
	//    4    8:iload_3         
	//    5    9:iload_2         
	//    6   10:isub            
	//    7   11:istore_3        
		byte abyte1[] = data;
	//    8   12:aload_0         
	//    9   13:getfield        #21  <Field byte[] data>
	//   10   16:astore          6
		int k = abyte1.length;
	//   11   18:aload           6
	//   12   20:arraylength     
	//   13   21:istore          4
		int l = length;
	//   14   23:aload_0         
	//   15   24:getfield        #28  <Field int length>
	//   16   27:istore          5
		if(k < l + j)
	//*  17   29:iload           4
	//*  18   31:iload           5
	//*  19   33:iload_3         
	//*  20   34:iadd            
	//*  21   35:icmpge          53
			data = Arrays.copyOf(abyte1, (l + j) * 2);
	//   22   38:aload_0         
	//   23   39:aload           6
	//   24   41:iload           5
	//   25   43:iload_3         
	//   26   44:iadd            
	//   27   45:iconst_2        
	//   28   46:imul            
	//   29   47:invokestatic    #34  <Method byte[] Arrays.copyOf(byte[], int)>
	//   30   50:putfield        #21  <Field byte[] data>
		System.arraycopy(((Object) (abyte0)), i, ((Object) (data)), length, j);
	//   31   53:aload_1         
	//   32   54:iload_2         
	//   33   55:aload_0         
	//   34   56:getfield        #21  <Field byte[] data>
	//   35   59:aload_0         
	//   36   60:getfield        #28  <Field int length>
	//   37   63:iload_3         
	//   38   64:invokestatic    #40  <Method void System.arraycopy(Object, int, Object, int, int)>
		length = length + j;
	//   39   67:aload_0         
	//   40   68:aload_0         
	//   41   69:getfield        #28  <Field int length>
	//   42   72:iload_3         
	//   43   73:iadd            
	//   44   74:putfield        #28  <Field int length>
	//   45   77:return          
	}

	public boolean onStartCode(int i, int j)
	{
		if(isFilling)
	//*   0    0:aload_0         
	//*   1    1:getfield        #26  <Field boolean isFilling>
	//*   2    4:ifeq            48
			if(sequenceExtensionPosition == 0 && i == 181)
	//*   3    7:aload_0         
	//*   4    8:getfield        #44  <Field int sequenceExtensionPosition>
	//*   5   11:ifne            31
	//*   6   14:iload_1         
	//*   7   15:sipush          181
	//*   8   18:icmpne          31
			{
				sequenceExtensionPosition = length;
	//    9   21:aload_0         
	//   10   22:aload_0         
	//   11   23:getfield        #28  <Field int length>
	//   12   26:putfield        #44  <Field int sequenceExtensionPosition>
				return false;
	//   13   29:iconst_0        
	//   14   30:ireturn         
			} else
			{
				length = length - j;
	//   15   31:aload_0         
	//   16   32:aload_0         
	//   17   33:getfield        #28  <Field int length>
	//   18   36:iload_2         
	//   19   37:isub            
	//   20   38:putfield        #28  <Field int length>
				isFilling = false;
	//   21   41:aload_0         
	//   22   42:iconst_0        
	//   23   43:putfield        #26  <Field boolean isFilling>
				return true;
	//   24   46:iconst_1        
	//   25   47:ireturn         
			}
		if(i == 179)
	//*  26   48:iload_1         
	//*  27   49:sipush          179
	//*  28   52:icmpne          60
			isFilling = true;
	//   29   55:aload_0         
	//   30   56:iconst_1        
	//   31   57:putfield        #26  <Field boolean isFilling>
		return false;
	//   32   60:iconst_0        
	//   33   61:ireturn         
	}

	public void reset()
	{
		isFilling = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #26  <Field boolean isFilling>
		length = 0;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #28  <Field int length>
		sequenceExtensionPosition = 0;
	//    6   10:aload_0         
	//    7   11:iconst_0        
	//    8   12:putfield        #44  <Field int sequenceExtensionPosition>
	//    9   15:return          
	}

	public byte data[];
	private boolean isFilling;
	public int length;
	public int sequenceExtensionPosition;

	public H262Reader$CsdBuffer(int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
		data = new byte[i];
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:newarray        byte[]
	//    5    8:putfield        #21  <Field byte[] data>
	//    6   11:return          
	}
}
