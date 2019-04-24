// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.codec;


// Referenced classes of package com.itextpdf.text.pdf.codec:
//			TiffWriter

public static class TiffWriter$FieldLong extends TiffWriter$FieldBase
{

	public TiffWriter$FieldLong(int i, int j)
	{
		super(i, 4, 1);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_4        
	//    3    3:iconst_1        
	//    4    4:invokespecial   #12  <Method void TiffWriter$FieldBase(int, int, int)>
		data = new byte[4];
	//    5    7:aload_0         
	//    6    8:iconst_4        
	//    7    9:newarray        byte[]
	//    8   11:putfield        #16  <Field byte[] data>
		data[0] = (byte)(j >> 24);
	//    9   14:aload_0         
	//   10   15:getfield        #16  <Field byte[] data>
	//   11   18:iconst_0        
	//   12   19:iload_2         
	//   13   20:bipush          24
	//   14   22:ishr            
	//   15   23:int2byte        
	//   16   24:bastore         
		data[1] = (byte)(j >> 16);
	//   17   25:aload_0         
	//   18   26:getfield        #16  <Field byte[] data>
	//   19   29:iconst_1        
	//   20   30:iload_2         
	//   21   31:bipush          16
	//   22   33:ishr            
	//   23   34:int2byte        
	//   24   35:bastore         
		data[2] = (byte)(j >> 8);
	//   25   36:aload_0         
	//   26   37:getfield        #16  <Field byte[] data>
	//   27   40:iconst_2        
	//   28   41:iload_2         
	//   29   42:bipush          8
	//   30   44:ishr            
	//   31   45:int2byte        
	//   32   46:bastore         
		data[3] = (byte)j;
	//   33   47:aload_0         
	//   34   48:getfield        #16  <Field byte[] data>
	//   35   51:iconst_3        
	//   36   52:iload_2         
	//   37   53:int2byte        
	//   38   54:bastore         
	//   39   55:return          
	}

	public TiffWriter$FieldLong(int i, int ai[])
	{
		super(i, 4, ai.length);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_4        
	//    3    3:aload_2         
	//    4    4:arraylength     
	//    5    5:invokespecial   #12  <Method void TiffWriter$FieldBase(int, int, int)>
		data = new byte[ai.length * 4];
	//    6    8:aload_0         
	//    7    9:aload_2         
	//    8   10:arraylength     
	//    9   11:iconst_4        
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
	//*  22   29:icmpge          127
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
			abyte0[j] = (byte)(l >> 24);
	//   34   48:aload           7
	//   35   50:iload_3         
	//   36   51:iload           5
	//   37   53:bipush          24
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
			abyte0[i1] = (byte)(l >> 16);
	//   48   69:aload           7
	//   49   71:iload           6
	//   50   73:iload           5
	//   51   75:bipush          16
	//   52   77:ishr            
	//   53   78:int2byte        
	//   54   79:bastore         
			abyte0 = data;
	//   55   80:aload_0         
	//   56   81:getfield        #16  <Field byte[] data>
	//   57   84:astore          7
			i1 = j + 1;
	//   58   86:iload_3         
	//   59   87:iconst_1        
	//   60   88:iadd            
	//   61   89:istore          6
			abyte0[j] = (byte)(l >> 8);
	//   62   91:aload           7
	//   63   93:iload_3         
	//   64   94:iload           5
	//   65   96:bipush          8
	//   66   98:ishr            
	//   67   99:int2byte        
	//   68  100:bastore         
			abyte0 = data;
	//   69  101:aload_0         
	//   70  102:getfield        #16  <Field byte[] data>
	//   71  105:astore          7
			j = i1 + 1;
	//   72  107:iload           6
	//   73  109:iconst_1        
	//   74  110:iadd            
	//   75  111:istore_3        
			abyte0[i1] = (byte)l;
	//   76  112:aload           7
	//   77  114:iload           6
	//   78  116:iload           5
	//   79  118:int2byte        
	//   80  119:bastore         
		}

	//   81  120:iload_1         
	//   82  121:iconst_1        
	//   83  122:iadd            
	//   84  123:istore_1        
	//*  85  124:goto            26
	//   86  127:return          
	}
}
