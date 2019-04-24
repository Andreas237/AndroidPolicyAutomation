// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.codec;

import java.io.IOException;
import java.io.OutputStream;
import java.util.*;

// Referenced classes of package com.itextpdf.text.pdf.codec:
//			LZWCompressor

public class TiffWriter
{
	public static class FieldAscii extends FieldBase
	{

		public FieldAscii(int i, String s)
		{
			super(i, 2, s.getBytes().length + 1);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:iconst_2        
		//    3    3:aload_2         
		//    4    4:invokevirtual   #15  <Method byte[] String.getBytes()>
		//    5    7:arraylength     
		//    6    8:iconst_1        
		//    7    9:iadd            
		//    8   10:invokespecial   #18  <Method void TiffWriter$FieldBase(int, int, int)>
			s = ((String) (s.getBytes()));
		//    9   13:aload_2         
		//   10   14:invokevirtual   #15  <Method byte[] String.getBytes()>
		//   11   17:astore_2        
			data = new byte[s.length + 1];
		//   12   18:aload_0         
		//   13   19:aload_2         
		//   14   20:arraylength     
		//   15   21:iconst_1        
		//   16   22:iadd            
		//   17   23:newarray        byte[]
		//   18   25:putfield        #22  <Field byte[] data>
			System.arraycopy(((Object) (s)), 0, ((Object) (data)), 0, s.length);
		//   19   28:aload_2         
		//   20   29:iconst_0        
		//   21   30:aload_0         
		//   22   31:getfield        #22  <Field byte[] data>
		//   23   34:iconst_0        
		//   24   35:aload_2         
		//   25   36:arraylength     
		//   26   37:invokestatic    #28  <Method void System.arraycopy(Object, int, Object, int, int)>
		//   27   40:return          
		}
	}

	public static abstract class FieldBase
	{

		public int getTag()
		{
			return tag;
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field int tag>
		//    2    4:ireturn         
		}

		public int getValueSize()
		{
			return data.length + 1 & -2;
		//    0    0:aload_0         
		//    1    1:getfield        #31  <Field byte[] data>
		//    2    4:arraylength     
		//    3    5:iconst_1        
		//    4    6:iadd            
		//    5    7:bipush          -2
		//    6    9:iand            
		//    7   10:ireturn         
		}

		public void setOffset(int i)
		{
			offset = i;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #35  <Field int offset>
		//    3    5:return          
		}

		public void writeField(OutputStream outputstream)
			throws IOException
		{
			TiffWriter.writeShort(tag, outputstream);
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field int tag>
		//    2    4:aload_1         
		//    3    5:invokestatic    #43  <Method void TiffWriter.writeShort(int, OutputStream)>
			TiffWriter.writeShort(fieldType, outputstream);
		//    4    8:aload_0         
		//    5    9:getfield        #23  <Field int fieldType>
		//    6   12:aload_1         
		//    7   13:invokestatic    #43  <Method void TiffWriter.writeShort(int, OutputStream)>
			TiffWriter.writeLong(count, outputstream);
		//    8   16:aload_0         
		//    9   17:getfield        #25  <Field int count>
		//   10   20:aload_1         
		//   11   21:invokestatic    #46  <Method void TiffWriter.writeLong(int, OutputStream)>
			if(data.length <= 4)
		//*  12   24:aload_0         
		//*  13   25:getfield        #31  <Field byte[] data>
		//*  14   28:arraylength     
		//*  15   29:iconst_4        
		//*  16   30:icmpgt          64
			{
				outputstream.write(data);
		//   17   33:aload_1         
		//   18   34:aload_0         
		//   19   35:getfield        #31  <Field byte[] data>
		//   20   38:invokevirtual   #52  <Method void OutputStream.write(byte[])>
				for(int i = data.length; i < 4; i++)
		//*  21   41:aload_0         
		//*  22   42:getfield        #31  <Field byte[] data>
		//*  23   45:arraylength     
		//*  24   46:istore_2        
		//*  25   47:iload_2         
		//*  26   48:iconst_4        
		//*  27   49:icmpge          72
					outputstream.write(0);
		//   28   52:aload_1         
		//   29   53:iconst_0        
		//   30   54:invokevirtual   #54  <Method void OutputStream.write(int)>

		//   31   57:iload_2         
		//   32   58:iconst_1        
		//   33   59:iadd            
		//   34   60:istore_2        
			} else
		//*  35   61:goto            47
			{
				TiffWriter.writeLong(offset, outputstream);
		//   36   64:aload_0         
		//   37   65:getfield        #35  <Field int offset>
		//   38   68:aload_1         
		//   39   69:invokestatic    #46  <Method void TiffWriter.writeLong(int, OutputStream)>
			}
		//   40   72:return          
		}

		public void writeValue(OutputStream outputstream)
			throws IOException
		{
			if(data.length > 4)
		//*   0    0:aload_0         
		//*   1    1:getfield        #31  <Field byte[] data>
		//*   2    4:arraylength     
		//*   3    5:iconst_4        
		//*   4    6:icmpgt          10
		//*   5    9:return          
			{
				outputstream.write(data);
		//    6   10:aload_1         
		//    7   11:aload_0         
		//    8   12:getfield        #31  <Field byte[] data>
		//    9   15:invokevirtual   #52  <Method void OutputStream.write(byte[])>
				if((data.length & 1) == 1)
		//*  10   18:aload_0         
		//*  11   19:getfield        #31  <Field byte[] data>
		//*  12   22:arraylength     
		//*  13   23:iconst_1        
		//*  14   24:iand            
		//*  15   25:iconst_1        
		//*  16   26:icmpne          9
				{
					outputstream.write(0);
		//   17   29:aload_1         
		//   18   30:iconst_0        
		//   19   31:invokevirtual   #54  <Method void OutputStream.write(int)>
					return;
		//   20   34:return          
				}
			}
		}

		private int count;
		protected byte data[];
		private int fieldType;
		private int offset;
		private int tag;

		protected FieldBase(int i, int j, int k)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #19  <Method void Object()>
			tag = i;
		//    2    4:aload_0         
		//    3    5:iload_1         
		//    4    6:putfield        #21  <Field int tag>
			fieldType = j;
		//    5    9:aload_0         
		//    6   10:iload_2         
		//    7   11:putfield        #23  <Field int fieldType>
			count = k;
		//    8   14:aload_0         
		//    9   15:iload_3         
		//   10   16:putfield        #25  <Field int count>
		//   11   19:return          
		}
	}

	public static class FieldByte extends FieldBase
	{

		public FieldByte(int i, byte abyte0[])
		{
			super(i, 1, abyte0.length);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:iconst_1        
		//    3    3:aload_2         
		//    4    4:arraylength     
		//    5    5:invokespecial   #12  <Method void TiffWriter$FieldBase(int, int, int)>
			data = abyte0;
		//    6    8:aload_0         
		//    7    9:aload_2         
		//    8   10:putfield        #16  <Field byte[] data>
		//    9   13:return          
		}
	}

	public static class FieldImage extends FieldBase
	{

		public FieldImage(byte abyte0[])
		{
			super(273, 4, 1);
		//    0    0:aload_0         
		//    1    1:sipush          273
		//    2    4:iconst_4        
		//    3    5:iconst_1        
		//    4    6:invokespecial   #12  <Method void TiffWriter$FieldBase(int, int, int)>
			data = abyte0;
		//    5    9:aload_0         
		//    6   10:aload_1         
		//    7   11:putfield        #16  <Field byte[] data>
		//    8   14:return          
		}
	}

	public static class FieldLong extends FieldBase
	{

		public FieldLong(int i, int j)
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

		public FieldLong(int i, int ai[])
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

	public static class FieldRational extends FieldBase
	{

		public FieldRational(int i, int ai[])
		{
			this(i, new int[][] {
				ai
			});
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:iconst_1        
		//    3    3:anewarray       int[][]
		//    4    6:dup             
		//    5    7:iconst_0        
		//    6    8:aload_2         
		//    7    9:aastore         
		//    8   10:invokespecial   #14  <Method void TiffWriter$FieldRational(int, int[][])>
		//    9   13:return          
		}

		public FieldRational(int i, int ai[][])
		{
			super(i, 5, ai.length);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:iconst_5        
		//    3    3:aload_2         
		//    4    4:arraylength     
		//    5    5:invokespecial   #18  <Method void TiffWriter$FieldBase(int, int, int)>
			data = new byte[ai.length * 8];
		//    6    8:aload_0         
		//    7    9:aload_2         
		//    8   10:arraylength     
		//    9   11:bipush          8
		//   10   13:imul            
		//   11   14:newarray        byte[]
		//   12   16:putfield        #22  <Field byte[] data>
			int k = ai.length;
		//   13   19:aload_2         
		//   14   20:arraylength     
		//   15   21:istore          4
			i = 0;
		//   16   23:iconst_0        
		//   17   24:istore_1        
			int j = 0;
		//   18   25:iconst_0        
		//   19   26:istore_3        
			for(; i < k; i++)
		//*  20   27:iload_1         
		//*  21   28:iload           4
		//*  22   30:icmpge          227
			{
				int ai1[] = ai[i];
		//   23   33:aload_2         
		//   24   34:iload_1         
		//   25   35:aaload          
		//   26   36:astore          6
				byte abyte0[] = data;
		//   27   38:aload_0         
		//   28   39:getfield        #22  <Field byte[] data>
		//   29   42:astore          7
				int l = j + 1;
		//   30   44:iload_3         
		//   31   45:iconst_1        
		//   32   46:iadd            
		//   33   47:istore          5
				abyte0[j] = (byte)(ai1[0] >> 24);
		//   34   49:aload           7
		//   35   51:iload_3         
		//   36   52:aload           6
		//   37   54:iconst_0        
		//   38   55:iaload          
		//   39   56:bipush          24
		//   40   58:ishr            
		//   41   59:int2byte        
		//   42   60:bastore         
				abyte0 = data;
		//   43   61:aload_0         
		//   44   62:getfield        #22  <Field byte[] data>
		//   45   65:astore          7
				j = l + 1;
		//   46   67:iload           5
		//   47   69:iconst_1        
		//   48   70:iadd            
		//   49   71:istore_3        
				abyte0[l] = (byte)(ai1[0] >> 16);
		//   50   72:aload           7
		//   51   74:iload           5
		//   52   76:aload           6
		//   53   78:iconst_0        
		//   54   79:iaload          
		//   55   80:bipush          16
		//   56   82:ishr            
		//   57   83:int2byte        
		//   58   84:bastore         
				abyte0 = data;
		//   59   85:aload_0         
		//   60   86:getfield        #22  <Field byte[] data>
		//   61   89:astore          7
				l = j + 1;
		//   62   91:iload_3         
		//   63   92:iconst_1        
		//   64   93:iadd            
		//   65   94:istore          5
				abyte0[j] = (byte)(ai1[0] >> 8);
		//   66   96:aload           7
		//   67   98:iload_3         
		//   68   99:aload           6
		//   69  101:iconst_0        
		//   70  102:iaload          
		//   71  103:bipush          8
		//   72  105:ishr            
		//   73  106:int2byte        
		//   74  107:bastore         
				abyte0 = data;
		//   75  108:aload_0         
		//   76  109:getfield        #22  <Field byte[] data>
		//   77  112:astore          7
				j = l + 1;
		//   78  114:iload           5
		//   79  116:iconst_1        
		//   80  117:iadd            
		//   81  118:istore_3        
				abyte0[l] = (byte)ai1[0];
		//   82  119:aload           7
		//   83  121:iload           5
		//   84  123:aload           6
		//   85  125:iconst_0        
		//   86  126:iaload          
		//   87  127:int2byte        
		//   88  128:bastore         
				abyte0 = data;
		//   89  129:aload_0         
		//   90  130:getfield        #22  <Field byte[] data>
		//   91  133:astore          7
				l = j + 1;
		//   92  135:iload_3         
		//   93  136:iconst_1        
		//   94  137:iadd            
		//   95  138:istore          5
				abyte0[j] = (byte)(ai1[1] >> 24);
		//   96  140:aload           7
		//   97  142:iload_3         
		//   98  143:aload           6
		//   99  145:iconst_1        
		//  100  146:iaload          
		//  101  147:bipush          24
		//  102  149:ishr            
		//  103  150:int2byte        
		//  104  151:bastore         
				abyte0 = data;
		//  105  152:aload_0         
		//  106  153:getfield        #22  <Field byte[] data>
		//  107  156:astore          7
				j = l + 1;
		//  108  158:iload           5
		//  109  160:iconst_1        
		//  110  161:iadd            
		//  111  162:istore_3        
				abyte0[l] = (byte)(ai1[1] >> 16);
		//  112  163:aload           7
		//  113  165:iload           5
		//  114  167:aload           6
		//  115  169:iconst_1        
		//  116  170:iaload          
		//  117  171:bipush          16
		//  118  173:ishr            
		//  119  174:int2byte        
		//  120  175:bastore         
				abyte0 = data;
		//  121  176:aload_0         
		//  122  177:getfield        #22  <Field byte[] data>
		//  123  180:astore          7
				l = j + 1;
		//  124  182:iload_3         
		//  125  183:iconst_1        
		//  126  184:iadd            
		//  127  185:istore          5
				abyte0[j] = (byte)(ai1[1] >> 8);
		//  128  187:aload           7
		//  129  189:iload_3         
		//  130  190:aload           6
		//  131  192:iconst_1        
		//  132  193:iaload          
		//  133  194:bipush          8
		//  134  196:ishr            
		//  135  197:int2byte        
		//  136  198:bastore         
				abyte0 = data;
		//  137  199:aload_0         
		//  138  200:getfield        #22  <Field byte[] data>
		//  139  203:astore          7
				j = l + 1;
		//  140  205:iload           5
		//  141  207:iconst_1        
		//  142  208:iadd            
		//  143  209:istore_3        
				abyte0[l] = (byte)ai1[1];
		//  144  210:aload           7
		//  145  212:iload           5
		//  146  214:aload           6
		//  147  216:iconst_1        
		//  148  217:iaload          
		//  149  218:int2byte        
		//  150  219:bastore         
			}

		//  151  220:iload_1         
		//  152  221:iconst_1        
		//  153  222:iadd            
		//  154  223:istore_1        
		//* 155  224:goto            27
		//  156  227:return          
		}
	}

	public static class FieldShort extends FieldBase
	{

		public FieldShort(int i, int j)
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

		public FieldShort(int i, int ai[])
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

	public static class FieldUndefined extends FieldBase
	{

		public FieldUndefined(int i, byte abyte0[])
		{
			super(i, 7, abyte0.length);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:bipush          7
		//    3    4:aload_2         
		//    4    5:arraylength     
		//    5    6:invokespecial   #12  <Method void TiffWriter$FieldBase(int, int, int)>
			data = abyte0;
		//    6    9:aload_0         
		//    7   10:aload_2         
		//    8   11:putfield        #16  <Field byte[] data>
		//    9   14:return          
		}
	}


	public TiffWriter()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #35  <Method void Object()>
		ifd = new TreeMap();
	//    2    4:aload_0         
	//    3    5:new             #37  <Class TreeMap>
	//    4    8:dup             
	//    5    9:invokespecial   #38  <Method void TreeMap()>
	//    6   12:putfield        #40  <Field TreeMap ifd>
	//    7   15:return          
	}

	public static void compressLZW(OutputStream outputstream, int i, byte abyte0[], int j, int k, int l)
		throws IOException
	{
		boolean flag = true;
	//    0    0:iconst_1        
	//    1    1:istore          6
		LZWCompressor lzwcompressor = new LZWCompressor(outputstream, 8, true);
	//    2    3:new             #47  <Class LZWCompressor>
	//    3    6:dup             
	//    4    7:aload_0         
	//    5    8:bipush          8
	//    6   10:iconst_1        
	//    7   11:invokespecial   #50  <Method void LZWCompressor(OutputStream, int, boolean)>
	//    8   14:astore          8
		if(i == 2)
	//*   9   16:iload_1         
	//*  10   17:iconst_2        
	//*  11   18:icmpne          43
			i = ((int) (flag));
	//   12   21:iload           6
	//   13   23:istore_1        
		else
	//*  14   24:iload_1         
	//*  15   25:ifne            48
	//*  16   28:aload           8
	//*  17   30:aload_2         
	//*  18   31:iconst_0        
	//*  19   32:aload_2         
	//*  20   33:arraylength     
	//*  21   34:invokevirtual   #54  <Method void LZWCompressor.compress(byte[], int, int)>
	//*  22   37:aload           8
	//*  23   39:invokevirtual   #57  <Method void LZWCompressor.flush()>
	//*  24   42:return          
			i = 0;
	//   25   43:iconst_0        
	//   26   44:istore_1        
		if(i == 0)
		{
			lzwcompressor.compress(abyte0, 0, abyte0.length);
		} else
	//*  27   45:goto            24
		{
			int i1 = 0;
	//   28   48:iconst_0        
	//   29   49:istore          6
			if(i != 0)
	//*  30   51:iload_1         
	//*  31   52:ifeq            116
				outputstream = ((OutputStream) (new byte[l]));
	//   32   55:iload           5
	//   33   57:newarray        byte[]
	//   34   59:astore_0        
			else
	//*  35   60:iconst_0        
	//*  36   61:istore_1        
	//*  37   62:iload_1         
	//*  38   63:iload_3         
	//*  39   64:icmpge          37
	//*  40   67:aload_2         
	//*  41   68:iload           6
	//*  42   70:aload_0         
	//*  43   71:iconst_0        
	//*  44   72:iload           5
	//*  45   74:invokestatic    #63  <Method void System.arraycopy(Object, int, Object, int, int)>
	//*  46   77:iload           5
	//*  47   79:iconst_1        
	//*  48   80:isub            
	//*  49   81:istore          7
	//*  50   83:iload           7
	//*  51   85:iload           4
	//*  52   87:icmplt          121
	//*  53   90:aload_0         
	//*  54   91:iload           7
	//*  55   93:aload_0         
	//*  56   94:iload           7
	//*  57   96:baload          
	//*  58   97:aload_0         
	//*  59   98:iload           7
	//*  60  100:iload           4
	//*  61  102:isub            
	//*  62  103:baload          
	//*  63  104:isub            
	//*  64  105:int2byte        
	//*  65  106:bastore         
	//*  66  107:iload           7
	//*  67  109:iconst_1        
	//*  68  110:isub            
	//*  69  111:istore          7
	//*  70  113:goto            83
				outputstream = null;
	//   71  116:aconst_null     
	//   72  117:astore_0        
			i = 0;
			while(i < j) 
			{
				System.arraycopy(((Object) (abyte0)), i1, ((Object) (outputstream)), 0, l);
				for(int j1 = l - 1; j1 >= k; j1--)
					outputstream[j1] = (byte)(outputstream[j1] - outputstream[j1 - k]);

	//*  73  118:goto            60
				lzwcompressor.compress(((byte []) (outputstream)), 0, l);
	//   74  121:aload           8
	//   75  123:aload_0         
	//   76  124:iconst_0        
	//   77  125:iload           5
	//   78  127:invokevirtual   #54  <Method void LZWCompressor.compress(byte[], int, int)>
				i1 += l;
	//   79  130:iload           6
	//   80  132:iload           5
	//   81  134:iadd            
	//   82  135:istore          6
				i++;
	//   83  137:iload_1         
	//   84  138:iconst_1        
	//   85  139:iadd            
	//   86  140:istore_1        
			}
		}
		lzwcompressor.flush();
	//*  87  141:goto            62
	}

	public static void writeLong(int i, OutputStream outputstream)
		throws IOException
	{
		outputstream.write(i >> 24 & 0xff);
	//    0    0:aload_1         
	//    1    1:iload_0         
	//    2    2:bipush          24
	//    3    4:ishr            
	//    4    5:sipush          255
	//    5    8:iand            
	//    6    9:invokevirtual   #72  <Method void OutputStream.write(int)>
		outputstream.write(i >> 16 & 0xff);
	//    7   12:aload_1         
	//    8   13:iload_0         
	//    9   14:bipush          16
	//   10   16:ishr            
	//   11   17:sipush          255
	//   12   20:iand            
	//   13   21:invokevirtual   #72  <Method void OutputStream.write(int)>
		outputstream.write(i >> 8 & 0xff);
	//   14   24:aload_1         
	//   15   25:iload_0         
	//   16   26:bipush          8
	//   17   28:ishr            
	//   18   29:sipush          255
	//   19   32:iand            
	//   20   33:invokevirtual   #72  <Method void OutputStream.write(int)>
		outputstream.write(i & 0xff);
	//   21   36:aload_1         
	//   22   37:iload_0         
	//   23   38:sipush          255
	//   24   41:iand            
	//   25   42:invokevirtual   #72  <Method void OutputStream.write(int)>
	//   26   45:return          
	}

	public static void writeShort(int i, OutputStream outputstream)
		throws IOException
	{
		outputstream.write(i >> 8 & 0xff);
	//    0    0:aload_1         
	//    1    1:iload_0         
	//    2    2:bipush          8
	//    3    4:ishr            
	//    4    5:sipush          255
	//    5    8:iand            
	//    6    9:invokevirtual   #72  <Method void OutputStream.write(int)>
		outputstream.write(i & 0xff);
	//    7   12:aload_1         
	//    8   13:iload_0         
	//    9   14:sipush          255
	//   10   17:iand            
	//   11   18:invokevirtual   #72  <Method void OutputStream.write(int)>
	//   12   21:return          
	}

	public void addField(FieldBase fieldbase)
	{
		ifd.put(((Object) (Integer.valueOf(fieldbase.getTag()))), ((Object) (fieldbase)));
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field TreeMap ifd>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #79  <Method int TiffWriter$FieldBase.getTag()>
	//    4    8:invokestatic    #85  <Method Integer Integer.valueOf(int)>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #89  <Method Object TreeMap.put(Object, Object)>
	//    7   15:pop             
	//    8   16:return          
	}

	public int getIfdSize()
	{
		return ifd.size() * 12 + 6;
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field TreeMap ifd>
	//    2    4:invokevirtual   #93  <Method int TreeMap.size()>
	//    3    7:bipush          12
	//    4    9:imul            
	//    5   10:bipush          6
	//    6   12:iadd            
	//    7   13:ireturn         
	}

	public void writeFile(OutputStream outputstream)
		throws IOException
	{
		outputstream.write(77);
	//    0    0:aload_1         
	//    1    1:bipush          77
	//    2    3:invokevirtual   #72  <Method void OutputStream.write(int)>
		outputstream.write(77);
	//    3    6:aload_1         
	//    4    7:bipush          77
	//    5    9:invokevirtual   #72  <Method void OutputStream.write(int)>
		outputstream.write(0);
	//    6   12:aload_1         
	//    7   13:iconst_0        
	//    8   14:invokevirtual   #72  <Method void OutputStream.write(int)>
		outputstream.write(42);
	//    9   17:aload_1         
	//   10   18:bipush          42
	//   11   20:invokevirtual   #72  <Method void OutputStream.write(int)>
		writeLong(8, outputstream);
	//   12   23:bipush          8
	//   13   25:aload_1         
	//   14   26:invokestatic    #97  <Method void writeLong(int, OutputStream)>
		writeShort(ifd.size(), outputstream);
	//   15   29:aload_0         
	//   16   30:getfield        #40  <Field TreeMap ifd>
	//   17   33:invokevirtual   #93  <Method int TreeMap.size()>
	//   18   36:aload_1         
	//   19   37:invokestatic    #99  <Method void writeShort(int, OutputStream)>
		int i = getIfdSize() + 8;
	//   20   40:aload_0         
	//   21   41:invokevirtual   #101 <Method int getIfdSize()>
	//   22   44:bipush          8
	//   23   46:iadd            
	//   24   47:istore_2        
		for(Iterator iterator = ifd.values().iterator(); iterator.hasNext();)
	//*  25   48:aload_0         
	//*  26   49:getfield        #40  <Field TreeMap ifd>
	//*  27   52:invokevirtual   #105 <Method Collection TreeMap.values()>
	//*  28   55:invokeinterface #111 <Method Iterator Collection.iterator()>
	//*  29   60:astore          5
	//*  30   62:aload           5
	//*  31   64:invokeinterface #117 <Method boolean Iterator.hasNext()>
	//*  32   69:ifeq            121
		{
			FieldBase fieldbase = (FieldBase)iterator.next();
	//   33   72:aload           5
	//   34   74:invokeinterface #121 <Method Object Iterator.next()>
	//   35   79:checkcast       #9   <Class TiffWriter$FieldBase>
	//   36   82:astore          6
			int k = fieldbase.getValueSize();
	//   37   84:aload           6
	//   38   86:invokevirtual   #124 <Method int TiffWriter$FieldBase.getValueSize()>
	//   39   89:istore          4
			int j = i;
	//   40   91:iload_2         
	//   41   92:istore_3        
			if(k > 4)
	//*  42   93:iload           4
	//*  43   95:iconst_4        
	//*  44   96:icmple          110
			{
				fieldbase.setOffset(i);
	//   45   99:aload           6
	//   46  101:iload_2         
	//   47  102:invokevirtual   #127 <Method void TiffWriter$FieldBase.setOffset(int)>
				j = i + k;
	//   48  105:iload_2         
	//   49  106:iload           4
	//   50  108:iadd            
	//   51  109:istore_3        
			}
			fieldbase.writeField(outputstream);
	//   52  110:aload           6
	//   53  112:aload_1         
	//   54  113:invokevirtual   #130 <Method void TiffWriter$FieldBase.writeField(OutputStream)>
			i = j;
	//   55  116:iload_3         
	//   56  117:istore_2        
		}

	//*  57  118:goto            62
		writeLong(0, outputstream);
	//   58  121:iconst_0        
	//   59  122:aload_1         
	//   60  123:invokestatic    #97  <Method void writeLong(int, OutputStream)>
		for(Iterator iterator1 = ifd.values().iterator(); iterator1.hasNext(); ((FieldBase)iterator1.next()).writeValue(outputstream));
	//   61  126:aload_0         
	//   62  127:getfield        #40  <Field TreeMap ifd>
	//   63  130:invokevirtual   #105 <Method Collection TreeMap.values()>
	//   64  133:invokeinterface #111 <Method Iterator Collection.iterator()>
	//   65  138:astore          5
	//   66  140:aload           5
	//   67  142:invokeinterface #117 <Method boolean Iterator.hasNext()>
	//   68  147:ifeq            167
	//   69  150:aload           5
	//   70  152:invokeinterface #121 <Method Object Iterator.next()>
	//   71  157:checkcast       #9   <Class TiffWriter$FieldBase>
	//   72  160:aload_1         
	//   73  161:invokevirtual   #133 <Method void TiffWriter$FieldBase.writeValue(OutputStream)>
	//*  74  164:goto            140
	//   75  167:return          
	}

	private TreeMap ifd;
}
