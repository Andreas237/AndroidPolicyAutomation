// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.codec;


// Referenced classes of package com.itextpdf.text.pdf.codec:
//			TiffWriter

public static class TiffWriter$FieldShort extends TiffWriter.FieldBase
{

	public TiffWriter$FieldShort(int i, int j)
	{
		super(i, 3, 1);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_3        
	//    3    3:iconst_1        
	//    4    4:invokespecial   #12  <Method void TiffWriter$FieldBase(int, int, int)>
		data = new byte[2];
	//    5    7:aload_0         
	//    6    8:iconst_2        
	//    7    9:newarray        byte[]
	//    8   11:putfield        #16  <Field byte[] data>
		data[0] = (byte)(j >> 8);
	//    9   14:aload_0         
	//   10   15:getfield        #16  <Field byte[] data>
	//   11   18:iconst_0        
	//   12   19:iload_2         
	//   13   20:bipush          8
	//   14   22:ishr            
	//   15   23:int2byte        
	//   16   24:bastore         
		data[1] = (byte)j;
	//   17   25:aload_0         
	//   18   26:getfield        #16  <Field byte[] data>
	//   19   29:iconst_1        
	//   20   30:iload_2         
	//   21   31:int2byte        
	//   22   32:bastore         
	//   23   33:return          
	}

	public TiffWriter$FieldShort(int i, int ai[])
	{
		super(i, 3, ai.length);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_3        
	//    3    3:aload_2         
	//    4    4:arraylength     
	//    5    5:invokespecial   #12  <Method void TiffWriter$FieldBase(int, int, int)>
		data = new byte[ai.length * 2];
	//    6    8:aload_0         
	//    7    9:aload_2         
	//    8   10:arraylength     
	//    9   11:iconst_2        
	//   10   12:imul            
	//   11   13:newarray        byte[]
	//   12   15:putfield        #16  <Field byte[] data>
		int k = ai.length;
	//   13   18:aload_2         
	//   14   19:arraylength     
	//   15   20:istore          4
		i = 0;
	//   16   22:iconst_0        
	//   17   23:istore_1        
		int j = 0;
	//   18   24:iconst_0        
	//   19   25:istore_3        
		for(; i < k; i++)
	//*  20   26:iload_1         
	//*  21   27:iload           4
	//*  22   29:icmpge          84
		{
			int l = ai[i];
	//   23   32:aload_2         
	//   24   33:iload_1         
	//   25   34:iaload          
	//   26   35:istore          5
			byte abyte0[] = data;
	//   27   37:aload_0         
	//   28   38:getfield        #16  <Field byte[] data>
	//   29   41:astore          7
			int i1 = j + 1;
	//   30   43:iload_3         
	//   31   44:iconst_1        
	//   32   45:iadd            
	//   33   46:istore          6
			abyte0[j] = (byte)(l >> 8);
	//   34   48:aload           7
	//   35   50:iload_3         
	//   36   51:iload           5
	//   37   53:bipush          8
	//   38   55:ishr            
	//   39   56:int2byte        
	//   40   57:bastore         
			abyte0 = data;
	//   41   58:aload_0         
	//   42   59:getfield        #16  <Field byte[] data>
	//   43   62:astore          7
			j = i1 + 1;
	//   44   64:iload           6
	//   45   66:iconst_1        
	//   46   67:iadd            
	//   47   68:istore_3        
			abyte0[i1] = (byte)l;
	//   48   69:aload           7
	//   49   71:iload           6
	//   50   73:iload           5
	//   51   75:int2byte        
	//   52   76:bastore         
		}

	//   53   77:iload_1         
	//   54   78:iconst_1        
	//   55   79:iadd            
	//   56   80:istore_1        
	//*  57   81:goto            26
	//   58   84:return          
	}
}
