// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.extractor.ts;

import com.google.android.exoplayer2.util.Assertions;
import java.util.Arrays;

final class NalUnitTargetBuffer
{

	public NalUnitTargetBuffer(int i, int j)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		targetType = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #19  <Field int targetType>
		nalData = new byte[3 + j];
	//    5    9:aload_0         
	//    6   10:iconst_3        
	//    7   11:iload_2         
	//    8   12:iadd            
	//    9   13:newarray        byte[]
	//   10   15:putfield        #21  <Field byte[] nalData>
		nalData[2] = 1;
	//   11   18:aload_0         
	//   12   19:getfield        #21  <Field byte[] nalData>
	//   13   22:iconst_2        
	//   14   23:iconst_1        
	//   15   24:bastore         
	//   16   25:return          
	}

	public void appendToNalUnit(byte abyte0[], int i, int j)
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
		if(nalData.length < nalLength + j)
	//*   8   12:aload_0         
	//*   9   13:getfield        #21  <Field byte[] nalData>
	//*  10   16:arraylength     
	//*  11   17:aload_0         
	//*  12   18:getfield        #28  <Field int nalLength>
	//*  13   21:iload_3         
	//*  14   22:iadd            
	//*  15   23:icmpge          45
			nalData = Arrays.copyOf(nalData, (nalLength + j) * 2);
	//   16   26:aload_0         
	//   17   27:aload_0         
	//   18   28:getfield        #21  <Field byte[] nalData>
	//   19   31:aload_0         
	//   20   32:getfield        #28  <Field int nalLength>
	//   21   35:iload_3         
	//   22   36:iadd            
	//   23   37:iconst_2        
	//   24   38:imul            
	//   25   39:invokestatic    #34  <Method byte[] Arrays.copyOf(byte[], int)>
	//   26   42:putfield        #21  <Field byte[] nalData>
		System.arraycopy(((Object) (abyte0)), i, ((Object) (nalData)), nalLength, j);
	//   27   45:aload_1         
	//   28   46:iload_2         
	//   29   47:aload_0         
	//   30   48:getfield        #21  <Field byte[] nalData>
	//   31   51:aload_0         
	//   32   52:getfield        #28  <Field int nalLength>
	//   33   55:iload_3         
	//   34   56:invokestatic    #40  <Method void System.arraycopy(Object, int, Object, int, int)>
		nalLength = nalLength + j;
	//   35   59:aload_0         
	//   36   60:aload_0         
	//   37   61:getfield        #28  <Field int nalLength>
	//   38   64:iload_3         
	//   39   65:iadd            
	//   40   66:putfield        #28  <Field int nalLength>
	//   41   69:return          
	}

	public boolean endNalUnit(int i)
	{
		if(!isFilling)
	//*   0    0:aload_0         
	//*   1    1:getfield        #26  <Field boolean isFilling>
	//*   2    4:ifne            9
		{
			return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		} else
		{
			nalLength = nalLength - i;
	//    5    9:aload_0         
	//    6   10:aload_0         
	//    7   11:getfield        #28  <Field int nalLength>
	//    8   14:iload_1         
	//    9   15:isub            
	//   10   16:putfield        #28  <Field int nalLength>
			isFilling = false;
	//   11   19:aload_0         
	//   12   20:iconst_0        
	//   13   21:putfield        #26  <Field boolean isFilling>
			isCompleted = true;
	//   14   24:aload_0         
	//   15   25:iconst_1        
	//   16   26:putfield        #44  <Field boolean isCompleted>
			return true;
	//   17   29:iconst_1        
	//   18   30:ireturn         
		}
	}

	public boolean isCompleted()
	{
		return isCompleted;
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field boolean isCompleted>
	//    2    4:ireturn         
	}

	public void reset()
	{
		isFilling = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #26  <Field boolean isFilling>
		isCompleted = false;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #44  <Field boolean isCompleted>
	//    6   10:return          
	}

	public void startNalUnit(int i)
	{
		boolean flag1 = isFilling;
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field boolean isFilling>
	//    2    4:istore_3        
		boolean flag = true;
	//    3    5:iconst_1        
	//    4    6:istore_2        
		Assertions.checkState(flag1 ^ true);
	//    5    7:iload_3         
	//    6    8:iconst_1        
	//    7    9:ixor            
	//    8   10:invokestatic    #54  <Method void Assertions.checkState(boolean)>
		if(i != targetType)
	//*   9   13:iload_1         
	//*  10   14:aload_0         
	//*  11   15:getfield        #19  <Field int targetType>
	//*  12   18:icmpne          24
	//*  13   21:goto            26
			flag = false;
	//   14   24:iconst_0        
	//   15   25:istore_2        
		isFilling = flag;
	//   16   26:aload_0         
	//   17   27:iload_2         
	//   18   28:putfield        #26  <Field boolean isFilling>
		if(isFilling)
	//*  19   31:aload_0         
	//*  20   32:getfield        #26  <Field boolean isFilling>
	//*  21   35:ifeq            48
		{
			nalLength = 3;
	//   22   38:aload_0         
	//   23   39:iconst_3        
	//   24   40:putfield        #28  <Field int nalLength>
			isCompleted = false;
	//   25   43:aload_0         
	//   26   44:iconst_0        
	//   27   45:putfield        #44  <Field boolean isCompleted>
		}
	//   28   48:return          
	}

	private boolean isCompleted;
	private boolean isFilling;
	public byte nalData[];
	public int nalLength;
	private final int targetType;
}
