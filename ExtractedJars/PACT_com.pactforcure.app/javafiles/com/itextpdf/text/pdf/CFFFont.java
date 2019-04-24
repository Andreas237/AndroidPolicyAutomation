// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;

import com.itextpdf.text.ExceptionConverter;
import java.util.Iterator;
import java.util.LinkedList;

// Referenced classes of package com.itextpdf.text.pdf:
//			RandomAccessFileOrArray

public class CFFFont
{
	protected static final class DictNumberItem extends Item
	{

		public void emit(byte abyte0[])
		{
			if(size == 5)
		//*   0    0:aload_0         
		//*   1    1:getfield        #17  <Field int size>
		//*   2    4:iconst_5        
		//*   3    5:icmpne          95
			{
				abyte0[myOffset] = 29;
		//    4    8:aload_1         
		//    5    9:aload_0         
		//    6   10:getfield        #25  <Field int myOffset>
		//    7   13:bipush          29
		//    8   15:bastore         
				abyte0[myOffset + 1] = (byte)(value >>> 24 & 0xff);
		//    9   16:aload_1         
		//   10   17:aload_0         
		//   11   18:getfield        #25  <Field int myOffset>
		//   12   21:iconst_1        
		//   13   22:iadd            
		//   14   23:aload_0         
		//   15   24:getfield        #19  <Field int value>
		//   16   27:bipush          24
		//   17   29:iushr           
		//   18   30:sipush          255
		//   19   33:iand            
		//   20   34:int2byte        
		//   21   35:bastore         
				abyte0[myOffset + 2] = (byte)(value >>> 16 & 0xff);
		//   22   36:aload_1         
		//   23   37:aload_0         
		//   24   38:getfield        #25  <Field int myOffset>
		//   25   41:iconst_2        
		//   26   42:iadd            
		//   27   43:aload_0         
		//   28   44:getfield        #19  <Field int value>
		//   29   47:bipush          16
		//   30   49:iushr           
		//   31   50:sipush          255
		//   32   53:iand            
		//   33   54:int2byte        
		//   34   55:bastore         
				abyte0[myOffset + 3] = (byte)(value >>> 8 & 0xff);
		//   35   56:aload_1         
		//   36   57:aload_0         
		//   37   58:getfield        #25  <Field int myOffset>
		//   38   61:iconst_3        
		//   39   62:iadd            
		//   40   63:aload_0         
		//   41   64:getfield        #19  <Field int value>
		//   42   67:bipush          8
		//   43   69:iushr           
		//   44   70:sipush          255
		//   45   73:iand            
		//   46   74:int2byte        
		//   47   75:bastore         
				abyte0[myOffset + 4] = (byte)(value >>> 0 & 0xff);
		//   48   76:aload_1         
		//   49   77:aload_0         
		//   50   78:getfield        #25  <Field int myOffset>
		//   51   81:iconst_4        
		//   52   82:iadd            
		//   53   83:aload_0         
		//   54   84:getfield        #19  <Field int value>
		//   55   87:iconst_0        
		//   56   88:iushr           
		//   57   89:sipush          255
		//   58   92:iand            
		//   59   93:int2byte        
		//   60   94:bastore         
			}
		//   61   95:return          
		}

		public void increment(int ai[])
		{
			super.increment(ai);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #29  <Method void CFFFont$Item.increment(int[])>
			ai[0] = ai[0] + size;
		//    3    5:aload_1         
		//    4    6:iconst_0        
		//    5    7:aload_1         
		//    6    8:iconst_0        
		//    7    9:iaload          
		//    8   10:aload_0         
		//    9   11:getfield        #17  <Field int size>
		//   10   14:iadd            
		//   11   15:iastore         
		//   12   16:return          
		}

		public int size;
		public final int value;

		public DictNumberItem(int i)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #15  <Method void CFFFont$Item()>
			size = 5;
		//    2    4:aload_0         
		//    3    5:iconst_5        
		//    4    6:putfield        #17  <Field int size>
			value = i;
		//    5    9:aload_0         
		//    6   10:iload_1         
		//    7   11:putfield        #19  <Field int value>
		//    8   14:return          
		}
	}

	protected static final class DictOffsetItem extends OffsetItem
	{

		public void emit(byte abyte0[])
		{
			if(size == 5)
		//*   0    0:aload_0         
		//*   1    1:getfield        #15  <Field int size>
		//*   2    4:iconst_5        
		//*   3    5:icmpne          95
			{
				abyte0[myOffset] = 29;
		//    4    8:aload_1         
		//    5    9:aload_0         
		//    6   10:getfield        #21  <Field int myOffset>
		//    7   13:bipush          29
		//    8   15:bastore         
				abyte0[myOffset + 1] = (byte)(value >>> 24 & 0xff);
		//    9   16:aload_1         
		//   10   17:aload_0         
		//   11   18:getfield        #21  <Field int myOffset>
		//   12   21:iconst_1        
		//   13   22:iadd            
		//   14   23:aload_0         
		//   15   24:getfield        #24  <Field int value>
		//   16   27:bipush          24
		//   17   29:iushr           
		//   18   30:sipush          255
		//   19   33:iand            
		//   20   34:int2byte        
		//   21   35:bastore         
				abyte0[myOffset + 2] = (byte)(value >>> 16 & 0xff);
		//   22   36:aload_1         
		//   23   37:aload_0         
		//   24   38:getfield        #21  <Field int myOffset>
		//   25   41:iconst_2        
		//   26   42:iadd            
		//   27   43:aload_0         
		//   28   44:getfield        #24  <Field int value>
		//   29   47:bipush          16
		//   30   49:iushr           
		//   31   50:sipush          255
		//   32   53:iand            
		//   33   54:int2byte        
		//   34   55:bastore         
				abyte0[myOffset + 3] = (byte)(value >>> 8 & 0xff);
		//   35   56:aload_1         
		//   36   57:aload_0         
		//   37   58:getfield        #21  <Field int myOffset>
		//   38   61:iconst_3        
		//   39   62:iadd            
		//   40   63:aload_0         
		//   41   64:getfield        #24  <Field int value>
		//   42   67:bipush          8
		//   43   69:iushr           
		//   44   70:sipush          255
		//   45   73:iand            
		//   46   74:int2byte        
		//   47   75:bastore         
				abyte0[myOffset + 4] = (byte)(value >>> 0 & 0xff);
		//   48   76:aload_1         
		//   49   77:aload_0         
		//   50   78:getfield        #21  <Field int myOffset>
		//   51   81:iconst_4        
		//   52   82:iadd            
		//   53   83:aload_0         
		//   54   84:getfield        #24  <Field int value>
		//   55   87:iconst_0        
		//   56   88:iushr           
		//   57   89:sipush          255
		//   58   92:iand            
		//   59   93:int2byte        
		//   60   94:bastore         
			}
		//   61   95:return          
		}

		public void increment(int ai[])
		{
			super.increment(ai);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #28  <Method void CFFFont$OffsetItem.increment(int[])>
			ai[0] = ai[0] + size;
		//    3    5:aload_1         
		//    4    6:iconst_0        
		//    5    7:aload_1         
		//    6    8:iconst_0        
		//    7    9:iaload          
		//    8   10:aload_0         
		//    9   11:getfield        #15  <Field int size>
		//   10   14:iadd            
		//   11   15:iastore         
		//   12   16:return          
		}

		public final int size = 5;

		public DictOffsetItem()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #13  <Method void CFFFont$OffsetItem()>
		//    2    4:aload_0         
		//    3    5:iconst_5        
		//    4    6:putfield        #15  <Field int size>
		//    5    9:return          
		}
	}

	protected final class Font
	{

		public int CharsetLength;
		public int CharstringType;
		public int FDArrayCount;
		public int FDArrayOffsets[];
		public int FDArrayOffsize;
		public int FDSelect[];
		public int FDSelectFormat;
		public int FDSelectLength;
		public int PrivateSubrsOffset[];
		public int PrivateSubrsOffsetsArray[][];
		public int SubrsOffsets[];
		public int charset[];
		public int charsetOffset;
		public int charstringsOffset;
		public int charstringsOffsets[];
		public int encodingOffset;
		public int fdarrayOffset;
		public int fdprivateLengths[];
		public int fdprivateOffsets[];
		public int fdprivateSubrs[];
		public int fdselectOffset;
		public String fullName;
		public boolean isCID;
		public String name;
		public int nglyphs;
		public int nstrings;
		public int privateLength;
		public int privateOffset;
		public int privateSubrs;
		final CFFFont this$0;

		protected Font()
		{
			this$0 = CFFFont.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #47  <Field CFFFont this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #50  <Method void Object()>
			isCID = false;
		//    5    9:aload_0         
		//    6   10:iconst_0        
		//    7   11:putfield        #52  <Field boolean isCID>
			privateOffset = -1;
		//    8   14:aload_0         
		//    9   15:iconst_m1       
		//   10   16:putfield        #54  <Field int privateOffset>
			privateLength = -1;
		//   11   19:aload_0         
		//   12   20:iconst_m1       
		//   13   21:putfield        #56  <Field int privateLength>
			privateSubrs = -1;
		//   14   24:aload_0         
		//   15   25:iconst_m1       
		//   16   26:putfield        #58  <Field int privateSubrs>
			charstringsOffset = -1;
		//   17   29:aload_0         
		//   18   30:iconst_m1       
		//   19   31:putfield        #60  <Field int charstringsOffset>
			encodingOffset = -1;
		//   20   34:aload_0         
		//   21   35:iconst_m1       
		//   22   36:putfield        #62  <Field int encodingOffset>
			charsetOffset = -1;
		//   23   39:aload_0         
		//   24   40:iconst_m1       
		//   25   41:putfield        #64  <Field int charsetOffset>
			fdarrayOffset = -1;
		//   26   44:aload_0         
		//   27   45:iconst_m1       
		//   28   46:putfield        #66  <Field int fdarrayOffset>
			fdselectOffset = -1;
		//   29   49:aload_0         
		//   30   50:iconst_m1       
		//   31   51:putfield        #68  <Field int fdselectOffset>
			CharstringType = 2;
		//   32   54:aload_0         
		//   33   55:iconst_2        
		//   34   56:putfield        #70  <Field int CharstringType>
		//   35   59:return          
		}
	}

	protected static final class IndexBaseItem extends Item
	{

		public IndexBaseItem()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #11  <Method void CFFFont$Item()>
		//    2    4:return          
		}
	}

	protected static final class IndexMarkerItem extends Item
	{

		public void xref()
		{
			offItem.set((myOffset - indexBase.myOffset) + 1);
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field CFFFont$OffsetItem offItem>
		//    2    4:aload_0         
		//    3    5:getfield        #26  <Field int myOffset>
		//    4    8:aload_0         
		//    5    9:getfield        #20  <Field CFFFont$IndexBaseItem indexBase>
		//    6   12:getfield        #29  <Field int CFFFont$IndexBaseItem.myOffset>
		//    7   15:isub            
		//    8   16:iconst_1        
		//    9   17:iadd            
		//   10   18:invokevirtual   #35  <Method void CFFFont$OffsetItem.set(int)>
		//   11   21:return          
		}

		private IndexBaseItem indexBase;
		private OffsetItem offItem;

		public IndexMarkerItem(OffsetItem offsetitem, IndexBaseItem indexbaseitem)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #16  <Method void CFFFont$Item()>
			offItem = offsetitem;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #18  <Field CFFFont$OffsetItem offItem>
			indexBase = indexbaseitem;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #20  <Field CFFFont$IndexBaseItem indexBase>
		//    8   14:return          
		}
	}

	protected static final class IndexOffsetItem extends OffsetItem
	{

		public void emit(byte abyte0[])
		{
			int j = 0;
		//    0    0:iconst_0        
		//    1    1:istore_3        
			int k = 0;
		//    2    2:iconst_0        
		//    3    3:istore          4
			int i = 0;
		//    4    5:iconst_0        
		//    5    6:istore_2        
			switch(size)
		//*   6    7:aload_0         
		//*   7    8:getfield        #16  <Field int size>
			{
		//*   8   11:tableswitch     1 4: default 40
		//		               1 114
		//		               2 89
		//		               3 65
		//		               4 41
			default:
				return;
		//    9   40:return          

			case 4: // '\004'
				abyte0[myOffset + 0] = (byte)(value >>> 24 & 0xff);
		//   10   41:aload_1         
		//   11   42:aload_0         
		//   12   43:getfield        #26  <Field int myOffset>
		//   13   46:iconst_0        
		//   14   47:iadd            
		//   15   48:aload_0         
		//   16   49:getfield        #21  <Field int value>
		//   17   52:bipush          24
		//   18   54:iushr           
		//   19   55:sipush          255
		//   20   58:iand            
		//   21   59:int2byte        
		//   22   60:bastore         
				i = 0 + 1;
		//   23   61:iconst_0        
		//   24   62:iconst_1        
		//   25   63:iadd            
		//   26   64:istore_2        
				// fall through

			case 3: // '\003'
				abyte0[myOffset + i] = (byte)(value >>> 16 & 0xff);
		//   27   65:aload_1         
		//   28   66:aload_0         
		//   29   67:getfield        #26  <Field int myOffset>
		//   30   70:iload_2         
		//   31   71:iadd            
		//   32   72:aload_0         
		//   33   73:getfield        #21  <Field int value>
		//   34   76:bipush          16
		//   35   78:iushr           
		//   36   79:sipush          255
		//   37   82:iand            
		//   38   83:int2byte        
		//   39   84:bastore         
				j = i + 1;
		//   40   85:iload_2         
		//   41   86:iconst_1        
		//   42   87:iadd            
		//   43   88:istore_3        
				// fall through

			case 2: // '\002'
				abyte0[myOffset + j] = (byte)(value >>> 8 & 0xff);
		//   44   89:aload_1         
		//   45   90:aload_0         
		//   46   91:getfield        #26  <Field int myOffset>
		//   47   94:iload_3         
		//   48   95:iadd            
		//   49   96:aload_0         
		//   50   97:getfield        #21  <Field int value>
		//   51  100:bipush          8
		//   52  102:iushr           
		//   53  103:sipush          255
		//   54  106:iand            
		//   55  107:int2byte        
		//   56  108:bastore         
				k = j + 1;
		//   57  109:iload_3         
		//   58  110:iconst_1        
		//   59  111:iadd            
		//   60  112:istore          4
				// fall through

			case 1: // '\001'
				abyte0[myOffset + k] = (byte)(value >>> 0 & 0xff);
		//   61  114:aload_1         
		//   62  115:aload_0         
		//   63  116:getfield        #26  <Field int myOffset>
		//   64  119:iload           4
		//   65  121:iadd            
		//   66  122:aload_0         
		//   67  123:getfield        #21  <Field int value>
		//   68  126:iconst_0        
		//   69  127:iushr           
		//   70  128:sipush          255
		//   71  131:iand            
		//   72  132:int2byte        
		//   73  133:bastore         
				return;
		//   74  134:return          
			}
		}

		public void increment(int ai[])
		{
			super.increment(ai);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #30  <Method void CFFFont$OffsetItem.increment(int[])>
			ai[0] = ai[0] + size;
		//    3    5:aload_1         
		//    4    6:iconst_0        
		//    5    7:aload_1         
		//    6    8:iconst_0        
		//    7    9:iaload          
		//    8   10:aload_0         
		//    9   11:getfield        #16  <Field int size>
		//   10   14:iadd            
		//   11   15:iastore         
		//   12   16:return          
		}

		public final int size;

		public IndexOffsetItem(int i)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #14  <Method void CFFFont$OffsetItem()>
			size = i;
		//    2    4:aload_0         
		//    3    5:iload_1         
		//    4    6:putfield        #16  <Field int size>
		//    5    9:return          
		}

		public IndexOffsetItem(int i, int j)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #14  <Method void CFFFont$OffsetItem()>
			size = i;
		//    2    4:aload_0         
		//    3    5:iload_1         
		//    4    6:putfield        #16  <Field int size>
			value = j;
		//    5    9:aload_0         
		//    6   10:iload_2         
		//    7   11:putfield        #21  <Field int value>
		//    8   14:return          
		}
	}

	protected static abstract class Item
	{

		public void emit(byte abyte0[])
		{
		//    0    0:return          
		}

		public void increment(int ai[])
		{
			myOffset = ai[0];
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iconst_0        
		//    3    3:iaload          
		//    4    4:putfield        #15  <Field int myOffset>
		//    5    7:return          
		}

		public void xref()
		{
		//    0    0:return          
		}

		protected int myOffset;

		protected Item()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #13  <Method void Object()>
			myOffset = -1;
		//    2    4:aload_0         
		//    3    5:iconst_m1       
		//    4    6:putfield        #15  <Field int myOffset>
		//    5    9:return          
		}
	}

	protected static final class MarkerItem extends Item
	{

		public void xref()
		{
			p.set(myOffset);
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field CFFFont$OffsetItem p>
		//    2    4:aload_0         
		//    3    5:getfield        #22  <Field int myOffset>
		//    4    8:invokevirtual   #28  <Method void CFFFont$OffsetItem.set(int)>
		//    5   11:return          
		}

		OffsetItem p;

		public MarkerItem(OffsetItem offsetitem)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #14  <Method void CFFFont$Item()>
			p = offsetitem;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #16  <Field CFFFont$OffsetItem p>
		//    5    9:return          
		}
	}

	protected static abstract class OffsetItem extends Item
	{

		public void set(int i)
		{
			value = i;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #18  <Field int value>
		//    3    5:return          
		}

		public int value;

		protected OffsetItem()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #13  <Method void CFFFont$Item()>
		//    2    4:return          
		}
	}

	protected static final class RangeItem extends Item
	{

		public void emit(byte abyte0[])
		{
			int i;
			buf.seek(offset);
		//    0    0:aload_0         
		//    1    1:getfield        #23  <Field RandomAccessFileOrArray buf>
		//    2    4:aload_0         
		//    3    5:getfield        #19  <Field int offset>
		//    4    8:i2l             
		//    5    9:invokevirtual   #34  <Method void RandomAccessFileOrArray.seek(long)>
			i = myOffset;
		//    6   12:aload_0         
		//    7   13:getfield        #37  <Field int myOffset>
		//    8   16:istore_2        
_L1:
			if(i >= myOffset + length)
				break MISSING_BLOCK_LABEL_57;
		//    9   17:iload_2         
		//   10   18:aload_0         
		//   11   19:getfield        #37  <Field int myOffset>
		//   12   22:aload_0         
		//   13   23:getfield        #21  <Field int length>
		//   14   26:iadd            
		//   15   27:icmpge          57
			abyte0[i] = buf.readByte();
		//   16   30:aload_1         
		//   17   31:iload_2         
		//   18   32:aload_0         
		//   19   33:getfield        #23  <Field RandomAccessFileOrArray buf>
		//   20   36:invokevirtual   #41  <Method byte RandomAccessFileOrArray.readByte()>
		//   21   39:bastore         
			i++;
		//   22   40:iload_2         
		//   23   41:iconst_1        
		//   24   42:iadd            
		//   25   43:istore_2        
			  goto _L1
		//*  26   44:goto            17
			abyte0;
		//   27   47:astore_1        
			throw new ExceptionConverter(((Exception) (abyte0)));
		//   28   48:new             #43  <Class ExceptionConverter>
		//   29   51:dup             
		//   30   52:aload_1         
		//   31   53:invokespecial   #46  <Method void ExceptionConverter(Exception)>
		//   32   56:athrow          
		//   33   57:return          
		}

		public void increment(int ai[])
		{
			super.increment(ai);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #50  <Method void CFFFont$Item.increment(int[])>
			ai[0] = ai[0] + length;
		//    3    5:aload_1         
		//    4    6:iconst_0        
		//    5    7:aload_1         
		//    6    8:iconst_0        
		//    7    9:iaload          
		//    8   10:aload_0         
		//    9   11:getfield        #21  <Field int length>
		//   10   14:iadd            
		//   11   15:iastore         
		//   12   16:return          
		}

		private RandomAccessFileOrArray buf;
		public int length;
		public int offset;

		public RangeItem(RandomAccessFileOrArray randomaccessfileorarray, int i, int j)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #17  <Method void CFFFont$Item()>
			offset = i;
		//    2    4:aload_0         
		//    3    5:iload_2         
		//    4    6:putfield        #19  <Field int offset>
			length = j;
		//    5    9:aload_0         
		//    6   10:iload_3         
		//    7   11:putfield        #21  <Field int length>
			buf = randomaccessfileorarray;
		//    8   14:aload_0         
		//    9   15:aload_1         
		//   10   16:putfield        #23  <Field RandomAccessFileOrArray buf>
		//   11   19:return          
		}
	}

	protected static final class StringItem extends Item
	{

		public void emit(byte abyte0[])
		{
			for(int i = 0; i < s.length(); i++)
		//*   0    0:iconst_0        
		//*   1    1:istore_2        
		//*   2    2:iload_2         
		//*   3    3:aload_0         
		//*   4    4:getfield        #16  <Field String s>
		//*   5    7:invokevirtual   #25  <Method int String.length()>
		//*   6   10:icmpge          41
				abyte0[myOffset + i] = (byte)(s.charAt(i) & 0xff);
		//    7   13:aload_1         
		//    8   14:aload_0         
		//    9   15:getfield        #29  <Field int myOffset>
		//   10   18:iload_2         
		//   11   19:iadd            
		//   12   20:aload_0         
		//   13   21:getfield        #16  <Field String s>
		//   14   24:iload_2         
		//   15   25:invokevirtual   #33  <Method char String.charAt(int)>
		//   16   28:sipush          255
		//   17   31:iand            
		//   18   32:int2byte        
		//   19   33:bastore         

		//   20   34:iload_2         
		//   21   35:iconst_1        
		//   22   36:iadd            
		//   23   37:istore_2        
		//*  24   38:goto            2
		//   25   41:return          
		}

		public void increment(int ai[])
		{
			super.increment(ai);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #37  <Method void CFFFont$Item.increment(int[])>
			ai[0] = ai[0] + s.length();
		//    3    5:aload_1         
		//    4    6:iconst_0        
		//    5    7:aload_1         
		//    6    8:iconst_0        
		//    7    9:iaload          
		//    8   10:aload_0         
		//    9   11:getfield        #16  <Field String s>
		//   10   14:invokevirtual   #25  <Method int String.length()>
		//   11   17:iadd            
		//   12   18:iastore         
		//   13   19:return          
		}

		public String s;

		public StringItem(String s1)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #14  <Method void CFFFont$Item()>
			s = s1;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #16  <Field String s>
		//    5    9:return          
		}
	}

	protected static final class SubrMarkerItem extends Item
	{

		public void xref()
		{
			offItem.set(myOffset - indexBase.myOffset);
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field CFFFont$OffsetItem offItem>
		//    2    4:aload_0         
		//    3    5:getfield        #26  <Field int myOffset>
		//    4    8:aload_0         
		//    5    9:getfield        #20  <Field CFFFont$IndexBaseItem indexBase>
		//    6   12:getfield        #29  <Field int CFFFont$IndexBaseItem.myOffset>
		//    7   15:isub            
		//    8   16:invokevirtual   #35  <Method void CFFFont$OffsetItem.set(int)>
		//    9   19:return          
		}

		private IndexBaseItem indexBase;
		private OffsetItem offItem;

		public SubrMarkerItem(OffsetItem offsetitem, IndexBaseItem indexbaseitem)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #16  <Method void CFFFont$Item()>
			offItem = offsetitem;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #18  <Field CFFFont$OffsetItem offItem>
			indexBase = indexbaseitem;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #20  <Field CFFFont$IndexBaseItem indexBase>
		//    8   14:return          
		}
	}

	protected static final class UInt16Item extends Item
	{

		public void emit(byte abyte0[])
		{
			abyte0[myOffset + 0] = (byte)(value >>> 8 & 0xff);
		//    0    0:aload_1         
		//    1    1:aload_0         
		//    2    2:getfield        #23  <Field int myOffset>
		//    3    5:iconst_0        
		//    4    6:iadd            
		//    5    7:aload_0         
		//    6    8:getfield        #16  <Field char value>
		//    7   11:bipush          8
		//    8   13:iushr           
		//    9   14:sipush          255
		//   10   17:iand            
		//   11   18:int2byte        
		//   12   19:bastore         
			abyte0[myOffset + 1] = (byte)(value >>> 0 & 0xff);
		//   13   20:aload_1         
		//   14   21:aload_0         
		//   15   22:getfield        #23  <Field int myOffset>
		//   16   25:iconst_1        
		//   17   26:iadd            
		//   18   27:aload_0         
		//   19   28:getfield        #16  <Field char value>
		//   20   31:iconst_0        
		//   21   32:iushr           
		//   22   33:sipush          255
		//   23   36:iand            
		//   24   37:int2byte        
		//   25   38:bastore         
		//   26   39:return          
		}

		public void increment(int ai[])
		{
			super.increment(ai);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #27  <Method void CFFFont$Item.increment(int[])>
			ai[0] = ai[0] + 2;
		//    3    5:aload_1         
		//    4    6:iconst_0        
		//    5    7:aload_1         
		//    6    8:iconst_0        
		//    7    9:iaload          
		//    8   10:iconst_2        
		//    9   11:iadd            
		//   10   12:iastore         
		//   11   13:return          
		}

		public char value;

		public UInt16Item(char c)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #14  <Method void CFFFont$Item()>
			value = c;
		//    2    4:aload_0         
		//    3    5:iload_1         
		//    4    6:putfield        #16  <Field char value>
		//    5    9:return          
		}
	}

	protected static final class UInt24Item extends Item
	{

		public void emit(byte abyte0[])
		{
			abyte0[myOffset + 0] = (byte)(value >>> 16 & 0xff);
		//    0    0:aload_1         
		//    1    1:aload_0         
		//    2    2:getfield        #22  <Field int myOffset>
		//    3    5:iconst_0        
		//    4    6:iadd            
		//    5    7:aload_0         
		//    6    8:getfield        #16  <Field int value>
		//    7   11:bipush          16
		//    8   13:iushr           
		//    9   14:sipush          255
		//   10   17:iand            
		//   11   18:int2byte        
		//   12   19:bastore         
			abyte0[myOffset + 1] = (byte)(value >>> 8 & 0xff);
		//   13   20:aload_1         
		//   14   21:aload_0         
		//   15   22:getfield        #22  <Field int myOffset>
		//   16   25:iconst_1        
		//   17   26:iadd            
		//   18   27:aload_0         
		//   19   28:getfield        #16  <Field int value>
		//   20   31:bipush          8
		//   21   33:iushr           
		//   22   34:sipush          255
		//   23   37:iand            
		//   24   38:int2byte        
		//   25   39:bastore         
			abyte0[myOffset + 2] = (byte)(value >>> 0 & 0xff);
		//   26   40:aload_1         
		//   27   41:aload_0         
		//   28   42:getfield        #22  <Field int myOffset>
		//   29   45:iconst_2        
		//   30   46:iadd            
		//   31   47:aload_0         
		//   32   48:getfield        #16  <Field int value>
		//   33   51:iconst_0        
		//   34   52:iushr           
		//   35   53:sipush          255
		//   36   56:iand            
		//   37   57:int2byte        
		//   38   58:bastore         
		//   39   59:return          
		}

		public void increment(int ai[])
		{
			super.increment(ai);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #26  <Method void CFFFont$Item.increment(int[])>
			ai[0] = ai[0] + 3;
		//    3    5:aload_1         
		//    4    6:iconst_0        
		//    5    7:aload_1         
		//    6    8:iconst_0        
		//    7    9:iaload          
		//    8   10:iconst_3        
		//    9   11:iadd            
		//   10   12:iastore         
		//   11   13:return          
		}

		public int value;

		public UInt24Item(int i)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #14  <Method void CFFFont$Item()>
			value = i;
		//    2    4:aload_0         
		//    3    5:iload_1         
		//    4    6:putfield        #16  <Field int value>
		//    5    9:return          
		}
	}

	protected static final class UInt32Item extends Item
	{

		public void emit(byte abyte0[])
		{
			abyte0[myOffset + 0] = (byte)(value >>> 24 & 0xff);
		//    0    0:aload_1         
		//    1    1:aload_0         
		//    2    2:getfield        #22  <Field int myOffset>
		//    3    5:iconst_0        
		//    4    6:iadd            
		//    5    7:aload_0         
		//    6    8:getfield        #16  <Field int value>
		//    7   11:bipush          24
		//    8   13:iushr           
		//    9   14:sipush          255
		//   10   17:iand            
		//   11   18:int2byte        
		//   12   19:bastore         
			abyte0[myOffset + 1] = (byte)(value >>> 16 & 0xff);
		//   13   20:aload_1         
		//   14   21:aload_0         
		//   15   22:getfield        #22  <Field int myOffset>
		//   16   25:iconst_1        
		//   17   26:iadd            
		//   18   27:aload_0         
		//   19   28:getfield        #16  <Field int value>
		//   20   31:bipush          16
		//   21   33:iushr           
		//   22   34:sipush          255
		//   23   37:iand            
		//   24   38:int2byte        
		//   25   39:bastore         
			abyte0[myOffset + 2] = (byte)(value >>> 8 & 0xff);
		//   26   40:aload_1         
		//   27   41:aload_0         
		//   28   42:getfield        #22  <Field int myOffset>
		//   29   45:iconst_2        
		//   30   46:iadd            
		//   31   47:aload_0         
		//   32   48:getfield        #16  <Field int value>
		//   33   51:bipush          8
		//   34   53:iushr           
		//   35   54:sipush          255
		//   36   57:iand            
		//   37   58:int2byte        
		//   38   59:bastore         
			abyte0[myOffset + 3] = (byte)(value >>> 0 & 0xff);
		//   39   60:aload_1         
		//   40   61:aload_0         
		//   41   62:getfield        #22  <Field int myOffset>
		//   42   65:iconst_3        
		//   43   66:iadd            
		//   44   67:aload_0         
		//   45   68:getfield        #16  <Field int value>
		//   46   71:iconst_0        
		//   47   72:iushr           
		//   48   73:sipush          255
		//   49   76:iand            
		//   50   77:int2byte        
		//   51   78:bastore         
		//   52   79:return          
		}

		public void increment(int ai[])
		{
			super.increment(ai);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #26  <Method void CFFFont$Item.increment(int[])>
			ai[0] = ai[0] + 4;
		//    3    5:aload_1         
		//    4    6:iconst_0        
		//    5    7:aload_1         
		//    6    8:iconst_0        
		//    7    9:iaload          
		//    8   10:iconst_4        
		//    9   11:iadd            
		//   10   12:iastore         
		//   11   13:return          
		}

		public int value;

		public UInt32Item(int i)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #14  <Method void CFFFont$Item()>
			value = i;
		//    2    4:aload_0         
		//    3    5:iload_1         
		//    4    6:putfield        #16  <Field int value>
		//    5    9:return          
		}
	}

	protected static final class UInt8Item extends Item
	{

		public void emit(byte abyte0[])
		{
			abyte0[myOffset + 0] = (byte)(value >>> 0 & 0xff);
		//    0    0:aload_1         
		//    1    1:aload_0         
		//    2    2:getfield        #23  <Field int myOffset>
		//    3    5:iconst_0        
		//    4    6:iadd            
		//    5    7:aload_0         
		//    6    8:getfield        #16  <Field char value>
		//    7   11:iconst_0        
		//    8   12:iushr           
		//    9   13:sipush          255
		//   10   16:iand            
		//   11   17:int2byte        
		//   12   18:bastore         
		//   13   19:return          
		}

		public void increment(int ai[])
		{
			super.increment(ai);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #27  <Method void CFFFont$Item.increment(int[])>
			ai[0] = ai[0] + 1;
		//    3    5:aload_1         
		//    4    6:iconst_0        
		//    5    7:aload_1         
		//    6    8:iconst_0        
		//    7    9:iaload          
		//    8   10:iconst_1        
		//    9   11:iadd            
		//   10   12:iastore         
		//   11   13:return          
		}

		public char value;

		public UInt8Item(char c)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #14  <Method void CFFFont$Item()>
			value = c;
		//    2    4:aload_0         
		//    3    5:iload_1         
		//    4    6:putfield        #16  <Field char value>
		//    5    9:return          
		}
	}


	public CFFFont(RandomAccessFileOrArray randomaccessfileorarray)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #1012 <Method void Object()>
		args = new Object[48];
	//    2    4:aload_0         
	//    3    5:bipush          48
	//    4    7:anewarray       Object[]
	//    5   10:putfield        #1014 <Field Object[] args>
		arg_count = 0;
	//    6   13:aload_0         
	//    7   14:iconst_0        
	//    8   15:putfield        #1016 <Field int arg_count>
		buf = randomaccessfileorarray;
	//    9   18:aload_0         
	//   10   19:aload_1         
	//   11   20:putfield        #1018 <Field RandomAccessFileOrArray buf>
		seek(0);
	//   12   23:aload_0         
	//   13   24:iconst_0        
	//   14   25:invokevirtual   #1022 <Method void seek(int)>
		getCard8();
	//   15   28:aload_0         
	//   16   29:invokevirtual   #1026 <Method char getCard8()>
	//   17   32:pop             
		getCard8();
	//   18   33:aload_0         
	//   19   34:invokevirtual   #1026 <Method char getCard8()>
	//   20   37:pop             
		int i = ((int) (getCard8()));
	//   21   38:aload_0         
	//   22   39:invokevirtual   #1026 <Method char getCard8()>
	//   23   42:istore_2        
		offSize = ((int) (getCard8()));
	//   24   43:aload_0         
	//   25   44:aload_0         
	//   26   45:invokevirtual   #1026 <Method char getCard8()>
	//   27   48:putfield        #1028 <Field int offSize>
		nameIndexOffset = i;
	//   28   51:aload_0         
	//   29   52:iload_2         
	//   30   53:putfield        #1030 <Field int nameIndexOffset>
		nameOffsets = getIndex(nameIndexOffset);
	//   31   56:aload_0         
	//   32   57:aload_0         
	//   33   58:aload_0         
	//   34   59:getfield        #1030 <Field int nameIndexOffset>
	//   35   62:invokevirtual   #1034 <Method int[] getIndex(int)>
	//   36   65:putfield        #1036 <Field int[] nameOffsets>
		topdictIndexOffset = nameOffsets[nameOffsets.length - 1];
	//   37   68:aload_0         
	//   38   69:aload_0         
	//   39   70:getfield        #1036 <Field int[] nameOffsets>
	//   40   73:aload_0         
	//   41   74:getfield        #1036 <Field int[] nameOffsets>
	//   42   77:arraylength     
	//   43   78:iconst_1        
	//   44   79:isub            
	//   45   80:iaload          
	//   46   81:putfield        #1038 <Field int topdictIndexOffset>
		topdictOffsets = getIndex(topdictIndexOffset);
	//   47   84:aload_0         
	//   48   85:aload_0         
	//   49   86:aload_0         
	//   50   87:getfield        #1038 <Field int topdictIndexOffset>
	//   51   90:invokevirtual   #1034 <Method int[] getIndex(int)>
	//   52   93:putfield        #1040 <Field int[] topdictOffsets>
		stringIndexOffset = topdictOffsets[topdictOffsets.length - 1];
	//   53   96:aload_0         
	//   54   97:aload_0         
	//   55   98:getfield        #1040 <Field int[] topdictOffsets>
	//   56  101:aload_0         
	//   57  102:getfield        #1040 <Field int[] topdictOffsets>
	//   58  105:arraylength     
	//   59  106:iconst_1        
	//   60  107:isub            
	//   61  108:iaload          
	//   62  109:putfield        #1042 <Field int stringIndexOffset>
		stringOffsets = getIndex(stringIndexOffset);
	//   63  112:aload_0         
	//   64  113:aload_0         
	//   65  114:aload_0         
	//   66  115:getfield        #1042 <Field int stringIndexOffset>
	//   67  118:invokevirtual   #1034 <Method int[] getIndex(int)>
	//   68  121:putfield        #1044 <Field int[] stringOffsets>
		gsubrIndexOffset = stringOffsets[stringOffsets.length - 1];
	//   69  124:aload_0         
	//   70  125:aload_0         
	//   71  126:getfield        #1044 <Field int[] stringOffsets>
	//   72  129:aload_0         
	//   73  130:getfield        #1044 <Field int[] stringOffsets>
	//   74  133:arraylength     
	//   75  134:iconst_1        
	//   76  135:isub            
	//   77  136:iaload          
	//   78  137:putfield        #1046 <Field int gsubrIndexOffset>
		gsubrOffsets = getIndex(gsubrIndexOffset);
	//   79  140:aload_0         
	//   80  141:aload_0         
	//   81  142:aload_0         
	//   82  143:getfield        #1046 <Field int gsubrIndexOffset>
	//   83  146:invokevirtual   #1034 <Method int[] getIndex(int)>
	//   84  149:putfield        #1048 <Field int[] gsubrOffsets>
		fonts = new Font[nameOffsets.length - 1];
	//   85  152:aload_0         
	//   86  153:aload_0         
	//   87  154:getfield        #1036 <Field int[] nameOffsets>
	//   88  157:arraylength     
	//   89  158:iconst_1        
	//   90  159:isub            
	//   91  160:anewarray       Font[]
	//   92  163:putfield        #1050 <Field CFFFont$Font[] fonts>
		for(int j = 0; j < nameOffsets.length - 1; j++)
	//*  93  166:iconst_0        
	//*  94  167:istore_2        
	//*  95  168:iload_2         
	//*  96  169:aload_0         
	//*  97  170:getfield        #1036 <Field int[] nameOffsets>
	//*  98  173:arraylength     
	//*  99  174:iconst_1        
	//* 100  175:isub            
	//* 101  176:icmpge          288
		{
			fonts[j] = new Font();
	//  102  179:aload_0         
	//  103  180:getfield        #1050 <Field CFFFont$Font[] fonts>
	//  104  183:iload_2         
	//  105  184:new             #12  <Class CFFFont$Font>
	//  106  187:dup             
	//  107  188:aload_0         
	//  108  189:invokespecial   #1053 <Method void CFFFont$Font(CFFFont)>
	//  109  192:aastore         
			seek(nameOffsets[j]);
	//  110  193:aload_0         
	//  111  194:aload_0         
	//  112  195:getfield        #1036 <Field int[] nameOffsets>
	//  113  198:iload_2         
	//  114  199:iaload          
	//  115  200:invokevirtual   #1022 <Method void seek(int)>
			fonts[j].name = "";
	//  116  203:aload_0         
	//  117  204:getfield        #1050 <Field CFFFont$Font[] fonts>
	//  118  207:iload_2         
	//  119  208:aaload          
	//  120  209:ldc2            #1055 <String "">
	//  121  212:putfield        #1058 <Field String CFFFont$Font.name>
			for(int l = nameOffsets[j]; l < nameOffsets[j + 1]; l++)
	//* 122  215:aload_0         
	//* 123  216:getfield        #1036 <Field int[] nameOffsets>
	//* 124  219:iload_2         
	//* 125  220:iaload          
	//* 126  221:istore_3        
	//* 127  222:iload_3         
	//* 128  223:aload_0         
	//* 129  224:getfield        #1036 <Field int[] nameOffsets>
	//* 130  227:iload_2         
	//* 131  228:iconst_1        
	//* 132  229:iadd            
	//* 133  230:iaload          
	//* 134  231:icmpge          281
			{
				randomaccessfileorarray = ((RandomAccessFileOrArray) (new StringBuilder()));
	//  135  234:new             #1060 <Class StringBuilder>
	//  136  237:dup             
	//  137  238:invokespecial   #1061 <Method void StringBuilder()>
	//  138  241:astore_1        
				Font font = fonts[j];
	//  139  242:aload_0         
	//  140  243:getfield        #1050 <Field CFFFont$Font[] fonts>
	//  141  246:iload_2         
	//  142  247:aaload          
	//  143  248:astore          4
				font.name = ((StringBuilder) (randomaccessfileorarray)).append(font.name).append(getCard8()).toString();
	//  144  250:aload           4
	//  145  252:aload_1         
	//  146  253:aload           4
	//  147  255:getfield        #1058 <Field String CFFFont$Font.name>
	//  148  258:invokevirtual   #1065 <Method StringBuilder StringBuilder.append(String)>
	//  149  261:aload_0         
	//  150  262:invokevirtual   #1026 <Method char getCard8()>
	//  151  265:invokevirtual   #1068 <Method StringBuilder StringBuilder.append(char)>
	//  152  268:invokevirtual   #1072 <Method String StringBuilder.toString()>
	//  153  271:putfield        #1058 <Field String CFFFont$Font.name>
			}

	//  154  274:iload_3         
	//  155  275:iconst_1        
	//  156  276:iadd            
	//  157  277:istore_3        
		}

	//  158  278:goto            222
	//  159  281:iload_2         
	//  160  282:iconst_1        
	//  161  283:iadd            
	//  162  284:istore_2        
	//* 163  285:goto            168
label0:
		for(int k = 0; k < topdictOffsets.length - 1; k++)
	//* 164  288:iconst_0        
	//* 165  289:istore_2        
	//* 166  290:iload_2         
	//* 167  291:aload_0         
	//* 168  292:getfield        #1040 <Field int[] topdictOffsets>
	//* 169  295:arraylength     
	//* 170  296:iconst_1        
	//* 171  297:isub            
	//* 172  298:icmpge          900
		{
			seek(topdictOffsets[k]);
	//  173  301:aload_0         
	//  174  302:aload_0         
	//  175  303:getfield        #1040 <Field int[] topdictOffsets>
	//  176  306:iload_2         
	//  177  307:iaload          
	//  178  308:invokevirtual   #1022 <Method void seek(int)>
			do
			{
				if(getPosition() >= topdictOffsets[k + 1])
					break;
	//  179  311:aload_0         
	//  180  312:invokevirtual   #1076 <Method int getPosition()>
	//  181  315:aload_0         
	//  182  316:getfield        #1040 <Field int[] topdictOffsets>
	//  183  319:iload_2         
	//  184  320:iconst_1        
	//  185  321:iadd            
	//  186  322:iaload          
	//  187  323:icmpge          641
				getDictItem();
	//  188  326:aload_0         
	//  189  327:invokevirtual   #1079 <Method void getDictItem()>
				if(key == "FullName")
	//* 190  330:aload_0         
	//* 191  331:getfield        #1081 <Field String key>
	//* 192  334:ldc1            #86  <String "FullName">
	//* 193  336:if_acmpne       368
					fonts[k].fullName = getString((char)((Integer)args[0]).intValue());
	//  194  339:aload_0         
	//  195  340:getfield        #1050 <Field CFFFont$Font[] fonts>
	//  196  343:iload_2         
	//  197  344:aaload          
	//  198  345:aload_0         
	//  199  346:aload_0         
	//  200  347:getfield        #1014 <Field Object[] args>
	//  201  350:iconst_0        
	//  202  351:aaload          
	//  203  352:checkcast       #1083 <Class Integer>
	//  204  355:invokevirtual   #1086 <Method int Integer.intValue()>
	//  205  358:int2char        
	//  206  359:invokevirtual   #1090 <Method String getString(char)>
	//  207  362:putfield        #1093 <Field String CFFFont$Font.fullName>
				else
	//* 208  365:goto            311
				if(key == "ROS")
	//* 209  368:aload_0         
	//* 210  369:getfield        #1081 <Field String key>
	//* 211  372:ldc1            #206 <String "ROS">
	//* 212  374:if_acmpne       390
					fonts[k].isCID = true;
	//  213  377:aload_0         
	//  214  378:getfield        #1050 <Field CFFFont$Font[] fonts>
	//  215  381:iload_2         
	//  216  382:aaload          
	//  217  383:iconst_1        
	//  218  384:putfield        #1096 <Field boolean CFFFont$Font.isCID>
				else
	//* 219  387:goto            311
				if(key == "Private")
	//* 220  390:aload_0         
	//* 221  391:getfield        #1081 <Field String key>
	//* 222  394:ldc1            #118 <String "Private">
	//* 223  396:if_acmpne       444
				{
					fonts[k].privateLength = ((Integer)args[0]).intValue();
	//  224  399:aload_0         
	//  225  400:getfield        #1050 <Field CFFFont$Font[] fonts>
	//  226  403:iload_2         
	//  227  404:aaload          
	//  228  405:aload_0         
	//  229  406:getfield        #1014 <Field Object[] args>
	//  230  409:iconst_0        
	//  231  410:aaload          
	//  232  411:checkcast       #1083 <Class Integer>
	//  233  414:invokevirtual   #1086 <Method int Integer.intValue()>
	//  234  417:putfield        #1099 <Field int CFFFont$Font.privateLength>
					fonts[k].privateOffset = ((Integer)args[1]).intValue();
	//  235  420:aload_0         
	//  236  421:getfield        #1050 <Field CFFFont$Font[] fonts>
	//  237  424:iload_2         
	//  238  425:aaload          
	//  239  426:aload_0         
	//  240  427:getfield        #1014 <Field Object[] args>
	//  241  430:iconst_1        
	//  242  431:aaload          
	//  243  432:checkcast       #1083 <Class Integer>
	//  244  435:invokevirtual   #1086 <Method int Integer.intValue()>
	//  245  438:putfield        #1102 <Field int CFFFont$Font.privateOffset>
				} else
	//* 246  441:goto            311
				if(key == "charset")
	//* 247  444:aload_0         
	//* 248  445:getfield        #1081 <Field String key>
	//* 249  448:ldc1            #112 <String "charset">
	//* 250  450:if_acmpne       477
					fonts[k].charsetOffset = ((Integer)args[0]).intValue();
	//  251  453:aload_0         
	//  252  454:getfield        #1050 <Field CFFFont$Font[] fonts>
	//  253  457:iload_2         
	//  254  458:aaload          
	//  255  459:aload_0         
	//  256  460:getfield        #1014 <Field Object[] args>
	//  257  463:iconst_0        
	//  258  464:aaload          
	//  259  465:checkcast       #1083 <Class Integer>
	//  260  468:invokevirtual   #1086 <Method int Integer.intValue()>
	//  261  471:putfield        #1105 <Field int CFFFont$Font.charsetOffset>
				else
	//* 262  474:goto            311
				if(key == "CharStrings")
	//* 263  477:aload_0         
	//* 264  478:getfield        #1081 <Field String key>
	//* 265  481:ldc1            #116 <String "CharStrings">
	//* 266  483:if_acmpne       542
				{
					fonts[k].charstringsOffset = ((Integer)args[0]).intValue();
	//  267  486:aload_0         
	//  268  487:getfield        #1050 <Field CFFFont$Font[] fonts>
	//  269  490:iload_2         
	//  270  491:aaload          
	//  271  492:aload_0         
	//  272  493:getfield        #1014 <Field Object[] args>
	//  273  496:iconst_0        
	//  274  497:aaload          
	//  275  498:checkcast       #1083 <Class Integer>
	//  276  501:invokevirtual   #1086 <Method int Integer.intValue()>
	//  277  504:putfield        #1108 <Field int CFFFont$Font.charstringsOffset>
					int i1 = getPosition();
	//  278  507:aload_0         
	//  279  508:invokevirtual   #1076 <Method int getPosition()>
	//  280  511:istore_3        
					fonts[k].charstringsOffsets = getIndex(fonts[k].charstringsOffset);
	//  281  512:aload_0         
	//  282  513:getfield        #1050 <Field CFFFont$Font[] fonts>
	//  283  516:iload_2         
	//  284  517:aaload          
	//  285  518:aload_0         
	//  286  519:aload_0         
	//  287  520:getfield        #1050 <Field CFFFont$Font[] fonts>
	//  288  523:iload_2         
	//  289  524:aaload          
	//  290  525:getfield        #1108 <Field int CFFFont$Font.charstringsOffset>
	//  291  528:invokevirtual   #1034 <Method int[] getIndex(int)>
	//  292  531:putfield        #1111 <Field int[] CFFFont$Font.charstringsOffsets>
					seek(i1);
	//  293  534:aload_0         
	//  294  535:iload_3         
	//  295  536:invokevirtual   #1022 <Method void seek(int)>
				} else
	//* 296  539:goto            311
				if(key == "FDArray")
	//* 297  542:aload_0         
	//* 298  543:getfield        #1081 <Field String key>
	//* 299  546:ldc1            #218 <String "FDArray">
	//* 300  548:if_acmpne       575
					fonts[k].fdarrayOffset = ((Integer)args[0]).intValue();
	//  301  551:aload_0         
	//  302  552:getfield        #1050 <Field CFFFont$Font[] fonts>
	//  303  555:iload_2         
	//  304  556:aaload          
	//  305  557:aload_0         
	//  306  558:getfield        #1014 <Field Object[] args>
	//  307  561:iconst_0        
	//  308  562:aaload          
	//  309  563:checkcast       #1083 <Class Integer>
	//  310  566:invokevirtual   #1086 <Method int Integer.intValue()>
	//  311  569:putfield        #1114 <Field int CFFFont$Font.fdarrayOffset>
				else
	//* 312  572:goto            311
				if(key == "FDSelect")
	//* 313  575:aload_0         
	//* 314  576:getfield        #1081 <Field String key>
	//* 315  579:ldc1            #220 <String "FDSelect">
	//* 316  581:if_acmpne       608
					fonts[k].fdselectOffset = ((Integer)args[0]).intValue();
	//  317  584:aload_0         
	//  318  585:getfield        #1050 <Field CFFFont$Font[] fonts>
	//  319  588:iload_2         
	//  320  589:aaload          
	//  321  590:aload_0         
	//  322  591:getfield        #1014 <Field Object[] args>
	//  323  594:iconst_0        
	//  324  595:aaload          
	//  325  596:checkcast       #1083 <Class Integer>
	//  326  599:invokevirtual   #1086 <Method int Integer.intValue()>
	//  327  602:putfield        #1117 <Field int CFFFont$Font.fdselectOffset>
				else
	//* 328  605:goto            311
				if(key == "CharstringType")
	//* 329  608:aload_0         
	//* 330  609:getfield        #1081 <Field String key>
	//* 331  612:ldc1            #158 <String "CharstringType">
	//* 332  614:if_acmpne       311
					fonts[k].CharstringType = ((Integer)args[0]).intValue();
	//  333  617:aload_0         
	//  334  618:getfield        #1050 <Field CFFFont$Font[] fonts>
	//  335  621:iload_2         
	//  336  622:aaload          
	//  337  623:aload_0         
	//  338  624:getfield        #1014 <Field Object[] args>
	//  339  627:iconst_0        
	//  340  628:aaload          
	//  341  629:checkcast       #1083 <Class Integer>
	//  342  632:invokevirtual   #1086 <Method int Integer.intValue()>
	//  343  635:putfield        #1119 <Field int CFFFont$Font.CharstringType>
			} while(true);
	//  344  638:goto            311
			if(fonts[k].privateOffset >= 0)
	//* 345  641:aload_0         
	//* 346  642:getfield        #1050 <Field CFFFont$Font[] fonts>
	//* 347  645:iload_2         
	//* 348  646:aaload          
	//* 349  647:getfield        #1102 <Field int CFFFont$Font.privateOffset>
	//* 350  650:iflt            739
			{
				seek(fonts[k].privateOffset);
	//  351  653:aload_0         
	//  352  654:aload_0         
	//  353  655:getfield        #1050 <Field CFFFont$Font[] fonts>
	//  354  658:iload_2         
	//  355  659:aaload          
	//  356  660:getfield        #1102 <Field int CFFFont$Font.privateOffset>
	//  357  663:invokevirtual   #1022 <Method void seek(int)>
				do
				{
					if(getPosition() >= fonts[k].privateOffset + fonts[k].privateLength)
						break;
	//  358  666:aload_0         
	//  359  667:invokevirtual   #1076 <Method int getPosition()>
	//  360  670:aload_0         
	//  361  671:getfield        #1050 <Field CFFFont$Font[] fonts>
	//  362  674:iload_2         
	//  363  675:aaload          
	//  364  676:getfield        #1102 <Field int CFFFont$Font.privateOffset>
	//  365  679:aload_0         
	//  366  680:getfield        #1050 <Field CFFFont$Font[] fonts>
	//  367  683:iload_2         
	//  368  684:aaload          
	//  369  685:getfield        #1099 <Field int CFFFont$Font.privateLength>
	//  370  688:iadd            
	//  371  689:icmpge          739
					getDictItem();
	//  372  692:aload_0         
	//  373  693:invokevirtual   #1079 <Method void getDictItem()>
					if(key == "Subrs")
	//* 374  696:aload_0         
	//* 375  697:getfield        #1081 <Field String key>
	//* 376  700:ldc1            #120 <String "Subrs">
	//* 377  702:if_acmpne       666
						fonts[k].privateSubrs = ((Integer)args[0]).intValue() + fonts[k].privateOffset;
	//  378  705:aload_0         
	//  379  706:getfield        #1050 <Field CFFFont$Font[] fonts>
	//  380  709:iload_2         
	//  381  710:aaload          
	//  382  711:aload_0         
	//  383  712:getfield        #1014 <Field Object[] args>
	//  384  715:iconst_0        
	//  385  716:aaload          
	//  386  717:checkcast       #1083 <Class Integer>
	//  387  720:invokevirtual   #1086 <Method int Integer.intValue()>
	//  388  723:aload_0         
	//  389  724:getfield        #1050 <Field CFFFont$Font[] fonts>
	//  390  727:iload_2         
	//  391  728:aaload          
	//  392  729:getfield        #1102 <Field int CFFFont$Font.privateOffset>
	//  393  732:iadd            
	//  394  733:putfield        #1122 <Field int CFFFont$Font.privateSubrs>
				} while(true);
	//  395  736:goto            666
			}
			if(fonts[k].fdarrayOffset < 0)
				continue;
	//  396  739:aload_0         
	//  397  740:getfield        #1050 <Field CFFFont$Font[] fonts>
	//  398  743:iload_2         
	//  399  744:aaload          
	//  400  745:getfield        #1114 <Field int CFFFont$Font.fdarrayOffset>
	//  401  748:iflt            893
			randomaccessfileorarray = ((RandomAccessFileOrArray) (getIndex(fonts[k].fdarrayOffset)));
	//  402  751:aload_0         
	//  403  752:aload_0         
	//  404  753:getfield        #1050 <Field CFFFont$Font[] fonts>
	//  405  756:iload_2         
	//  406  757:aaload          
	//  407  758:getfield        #1114 <Field int CFFFont$Font.fdarrayOffset>
	//  408  761:invokevirtual   #1034 <Method int[] getIndex(int)>
	//  409  764:astore_1        
			fonts[k].fdprivateOffsets = new int[randomaccessfileorarray.length - 1];
	//  410  765:aload_0         
	//  411  766:getfield        #1050 <Field CFFFont$Font[] fonts>
	//  412  769:iload_2         
	//  413  770:aaload          
	//  414  771:aload_1         
	//  415  772:arraylength     
	//  416  773:iconst_1        
	//  417  774:isub            
	//  418  775:newarray        int[]
	//  419  777:putfield        #1125 <Field int[] CFFFont$Font.fdprivateOffsets>
			fonts[k].fdprivateLengths = new int[randomaccessfileorarray.length - 1];
	//  420  780:aload_0         
	//  421  781:getfield        #1050 <Field CFFFont$Font[] fonts>
	//  422  784:iload_2         
	//  423  785:aaload          
	//  424  786:aload_1         
	//  425  787:arraylength     
	//  426  788:iconst_1        
	//  427  789:isub            
	//  428  790:newarray        int[]
	//  429  792:putfield        #1128 <Field int[] CFFFont$Font.fdprivateLengths>
			int j1 = 0;
	//  430  795:iconst_0        
	//  431  796:istore_3        
			do
			{
				if(j1 >= randomaccessfileorarray.length - 1)
					continue label0;
	//  432  797:iload_3         
	//  433  798:aload_1         
	//  434  799:arraylength     
	//  435  800:iconst_1        
	//  436  801:isub            
	//  437  802:icmpge          893
				seek(randomaccessfileorarray[j1]);
	//  438  805:aload_0         
	//  439  806:aload_1         
	//  440  807:iload_3         
	//  441  808:iaload          
	//  442  809:invokevirtual   #1022 <Method void seek(int)>
				do
				{
					if(getPosition() >= randomaccessfileorarray[j1 + 1])
						break;
	//  443  812:aload_0         
	//  444  813:invokevirtual   #1076 <Method int getPosition()>
	//  445  816:aload_1         
	//  446  817:iload_3         
	//  447  818:iconst_1        
	//  448  819:iadd            
	//  449  820:iaload          
	//  450  821:icmpge          886
					getDictItem();
	//  451  824:aload_0         
	//  452  825:invokevirtual   #1079 <Method void getDictItem()>
					if(key == "Private")
	//* 453  828:aload_0         
	//* 454  829:getfield        #1081 <Field String key>
	//* 455  832:ldc1            #118 <String "Private">
	//* 456  834:if_acmpne       812
					{
						fonts[k].fdprivateLengths[j1] = ((Integer)args[0]).intValue();
	//  457  837:aload_0         
	//  458  838:getfield        #1050 <Field CFFFont$Font[] fonts>
	//  459  841:iload_2         
	//  460  842:aaload          
	//  461  843:getfield        #1128 <Field int[] CFFFont$Font.fdprivateLengths>
	//  462  846:iload_3         
	//  463  847:aload_0         
	//  464  848:getfield        #1014 <Field Object[] args>
	//  465  851:iconst_0        
	//  466  852:aaload          
	//  467  853:checkcast       #1083 <Class Integer>
	//  468  856:invokevirtual   #1086 <Method int Integer.intValue()>
	//  469  859:iastore         
						fonts[k].fdprivateOffsets[j1] = ((Integer)args[1]).intValue();
	//  470  860:aload_0         
	//  471  861:getfield        #1050 <Field CFFFont$Font[] fonts>
	//  472  864:iload_2         
	//  473  865:aaload          
	//  474  866:getfield        #1125 <Field int[] CFFFont$Font.fdprivateOffsets>
	//  475  869:iload_3         
	//  476  870:aload_0         
	//  477  871:getfield        #1014 <Field Object[] args>
	//  478  874:iconst_1        
	//  479  875:aaload          
	//  480  876:checkcast       #1083 <Class Integer>
	//  481  879:invokevirtual   #1086 <Method int Integer.intValue()>
	//  482  882:iastore         
					}
				} while(true);
	//  483  883:goto            812
				j1++;
	//  484  886:iload_3         
	//  485  887:iconst_1        
	//  486  888:iadd            
	//  487  889:istore_3        
			} while(true);
	//  488  890:goto            797
		}

	//  489  893:iload_2         
	//  490  894:iconst_1        
	//  491  895:iadd            
	//  492  896:istore_2        
	//* 493  897:goto            290
	//  494  900:return          
	}

	void ReadEncoding(int i)
	{
		seek(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #1022 <Method void seek(int)>
		getCard8();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #1026 <Method char getCard8()>
	//    5    9:pop             
	//    6   10:return          
	}

	public boolean exists(String s)
	{
		for(int i = 0; i < fonts.length; i++)
	//*   0    0:iconst_0        
	//*   1    1:istore_2        
	//*   2    2:iload_2         
	//*   3    3:aload_0         
	//*   4    4:getfield        #1050 <Field CFFFont$Font[] fonts>
	//*   5    7:arraylength     
	//*   6    8:icmpge          36
			if(s.equals(((Object) (fonts[i].name))))
	//*   7   11:aload_1         
	//*   8   12:aload_0         
	//*   9   13:getfield        #1050 <Field CFFFont$Font[] fonts>
	//*  10   16:iload_2         
	//*  11   17:aaload          
	//*  12   18:getfield        #1058 <Field String CFFFont$Font.name>
	//*  13   21:invokevirtual   #1135 <Method boolean String.equals(Object)>
	//*  14   24:ifeq            29
				return true;
	//   15   27:iconst_1        
	//   16   28:ireturn         

	//   17   29:iload_2         
	//   18   30:iconst_1        
	//   19   31:iadd            
	//   20   32:istore_2        
	//*  21   33:goto            2
		return false;
	//   22   36:iconst_0        
	//   23   37:ireturn         
	}

	public byte[] getCID(String s)
	{
		int l = 0;
	//    0    0:iconst_0        
	//    1    1:istore_3        
_L5:
		if(l < fonts.length && !s.equals(((Object) (fonts[l].name)))) goto _L2; else goto _L1
	//    2    2:iload_3         
	//    3    3:aload_0         
	//    4    4:getfield        #1050 <Field CFFFont$Font[] fonts>
	//    5    7:arraylength     
	//    6    8:icmpge          27
	//    7   11:aload_1         
	//    8   12:aload_0         
	//    9   13:getfield        #1050 <Field CFFFont$Font[] fonts>
	//   10   16:iload_3         
	//   11   17:aaload          
	//   12   18:getfield        #1058 <Field String CFFFont$Font.name>
	//   13   21:invokevirtual   #1135 <Method boolean String.equals(Object)>
	//   14   24:ifeq            40
_L1:
		if(l != fonts.length) goto _L4; else goto _L3
	//   15   27:iload_3         
	//   16   28:aload_0         
	//   17   29:getfield        #1050 <Field CFFFont$Font[] fonts>
	//   18   32:arraylength     
	//   19   33:icmpne          47
_L3:
		s = null;
	//   20   36:aconst_null     
	//   21   37:astore_1        
_L10:
		return ((byte []) (s));
	//   22   38:aload_1         
	//   23   39:areturn         
_L2:
		l++;
	//   24   40:iload_3         
	//   25   41:iconst_1        
	//   26   42:iadd            
	//   27   43:istore_3        
		  goto _L5
	//*  28   44:goto            2
_L4:
		int i1;
		Object obj1;
		DictOffsetItem dictoffsetitem1;
		DictOffsetItem dictoffsetitem2;
		DictOffsetItem dictoffsetitem3;
		obj1 = ((Object) (new LinkedList()));
	//   29   47:new             #1139 <Class LinkedList>
	//   30   50:dup             
	//   31   51:invokespecial   #1140 <Method void LinkedList()>
	//   32   54:astore          10
		seek(0);
	//   33   56:aload_0         
	//   34   57:iconst_0        
	//   35   58:invokevirtual   #1022 <Method void seek(int)>
		getCard8();
	//   36   61:aload_0         
	//   37   62:invokevirtual   #1026 <Method char getCard8()>
	//   38   65:pop             
		getCard8();
	//   39   66:aload_0         
	//   40   67:invokevirtual   #1026 <Method char getCard8()>
	//   41   70:pop             
		int i = ((int) (getCard8()));
	//   42   71:aload_0         
	//   43   72:invokevirtual   #1026 <Method char getCard8()>
	//   44   75:istore_2        
		getCard8();
	//   45   76:aload_0         
	//   46   77:invokevirtual   #1026 <Method char getCard8()>
	//   47   80:pop             
		nextIndexOffset = i;
	//   48   81:aload_0         
	//   49   82:iload_2         
	//   50   83:putfield        #1142 <Field int nextIndexOffset>
		((LinkedList) (obj1)).addLast(((Object) (new RangeItem(buf, 0, i))));
	//   51   86:aload           10
	//   52   88:new             #33  <Class CFFFont$RangeItem>
	//   53   91:dup             
	//   54   92:aload_0         
	//   55   93:getfield        #1018 <Field RandomAccessFileOrArray buf>
	//   56   96:iconst_0        
	//   57   97:iload_2         
	//   58   98:invokespecial   #1145 <Method void CFFFont$RangeItem(RandomAccessFileOrArray, int, int)>
	//   59  101:invokevirtual   #1149 <Method void LinkedList.addLast(Object)>
		i1 = -1;
	//   60  104:iconst_m1       
	//   61  105:istore          4
		i = -1;
	//   62  107:iconst_m1       
	//   63  108:istore_2        
		if(!fonts[l].isCID)
	//*  64  109:aload_0         
	//*  65  110:getfield        #1050 <Field CFFFont$Font[] fonts>
	//*  66  113:iload_3         
	//*  67  114:aaload          
	//*  68  115:getfield        #1096 <Field boolean CFFFont$Font.isCID>
	//*  69  118:ifne            158
		{
			seek(fonts[l].charstringsOffset);
	//   70  121:aload_0         
	//   71  122:aload_0         
	//   72  123:getfield        #1050 <Field CFFFont$Font[] fonts>
	//   73  126:iload_3         
	//   74  127:aaload          
	//   75  128:getfield        #1108 <Field int CFFFont$Font.charstringsOffset>
	//   76  131:invokevirtual   #1022 <Method void seek(int)>
			i1 = ((int) (getCard16()));
	//   77  134:aload_0         
	//   78  135:invokevirtual   #1152 <Method char getCard16()>
	//   79  138:istore          4
			seek(stringIndexOffset);
	//   80  140:aload_0         
	//   81  141:aload_0         
	//   82  142:getfield        #1042 <Field int stringIndexOffset>
	//   83  145:invokevirtual   #1022 <Method void seek(int)>
			i = getCard16() + standardStrings.length;
	//   84  148:aload_0         
	//   85  149:invokevirtual   #1152 <Method char getCard16()>
	//   86  152:getstatic       #1007 <Field String[] standardStrings>
	//   87  155:arraylength     
	//   88  156:iadd            
	//   89  157:istore_2        
		}
		((LinkedList) (obj1)).addLast(((Object) (new UInt16Item('\001'))));
	//   90  158:aload           10
	//   91  160:new             #42  <Class CFFFont$UInt16Item>
	//   92  163:dup             
	//   93  164:iconst_1        
	//   94  165:invokespecial   #1155 <Method void CFFFont$UInt16Item(char)>
	//   95  168:invokevirtual   #1149 <Method void LinkedList.addLast(Object)>
		((LinkedList) (obj1)).addLast(((Object) (new UInt8Item('\001'))));
	//   96  171:aload           10
	//   97  173:new             #51  <Class CFFFont$UInt8Item>
	//   98  176:dup             
	//   99  177:iconst_1        
	//  100  178:invokespecial   #1156 <Method void CFFFont$UInt8Item(char)>
	//  101  181:invokevirtual   #1149 <Method void LinkedList.addLast(Object)>
		((LinkedList) (obj1)).addLast(((Object) (new UInt8Item('\001'))));
	//  102  184:aload           10
	//  103  186:new             #51  <Class CFFFont$UInt8Item>
	//  104  189:dup             
	//  105  190:iconst_1        
	//  106  191:invokespecial   #1156 <Method void CFFFont$UInt8Item(char)>
	//  107  194:invokevirtual   #1149 <Method void LinkedList.addLast(Object)>
		((LinkedList) (obj1)).addLast(((Object) (new UInt8Item((char)(fonts[l].name.length() + 1)))));
	//  108  197:aload           10
	//  109  199:new             #51  <Class CFFFont$UInt8Item>
	//  110  202:dup             
	//  111  203:aload_0         
	//  112  204:getfield        #1050 <Field CFFFont$Font[] fonts>
	//  113  207:iload_3         
	//  114  208:aaload          
	//  115  209:getfield        #1058 <Field String CFFFont$Font.name>
	//  116  212:invokevirtual   #1159 <Method int String.length()>
	//  117  215:iconst_1        
	//  118  216:iadd            
	//  119  217:int2char        
	//  120  218:invokespecial   #1156 <Method void CFFFont$UInt8Item(char)>
	//  121  221:invokevirtual   #1149 <Method void LinkedList.addLast(Object)>
		((LinkedList) (obj1)).addLast(((Object) (new StringItem(fonts[l].name))));
	//  122  224:aload           10
	//  123  226:new             #36  <Class CFFFont$StringItem>
	//  124  229:dup             
	//  125  230:aload_0         
	//  126  231:getfield        #1050 <Field CFFFont$Font[] fonts>
	//  127  234:iload_3         
	//  128  235:aaload          
	//  129  236:getfield        #1058 <Field String CFFFont$Font.name>
	//  130  239:invokespecial   #1162 <Method void CFFFont$StringItem(String)>
	//  131  242:invokevirtual   #1149 <Method void LinkedList.addLast(Object)>
		((LinkedList) (obj1)).addLast(((Object) (new UInt16Item('\001'))));
	//  132  245:aload           10
	//  133  247:new             #42  <Class CFFFont$UInt16Item>
	//  134  250:dup             
	//  135  251:iconst_1        
	//  136  252:invokespecial   #1155 <Method void CFFFont$UInt16Item(char)>
	//  137  255:invokevirtual   #1149 <Method void LinkedList.addLast(Object)>
		((LinkedList) (obj1)).addLast(((Object) (new UInt8Item('\002'))));
	//  138  258:aload           10
	//  139  260:new             #51  <Class CFFFont$UInt8Item>
	//  140  263:dup             
	//  141  264:iconst_2        
	//  142  265:invokespecial   #1156 <Method void CFFFont$UInt8Item(char)>
	//  143  268:invokevirtual   #1149 <Method void LinkedList.addLast(Object)>
		((LinkedList) (obj1)).addLast(((Object) (new UInt16Item('\001'))));
	//  144  271:aload           10
	//  145  273:new             #42  <Class CFFFont$UInt16Item>
	//  146  276:dup             
	//  147  277:iconst_1        
	//  148  278:invokespecial   #1155 <Method void CFFFont$UInt16Item(char)>
	//  149  281:invokevirtual   #1149 <Method void LinkedList.addLast(Object)>
		s = ((String) (new IndexOffsetItem(2)));
	//  150  284:new             #21  <Class CFFFont$IndexOffsetItem>
	//  151  287:dup             
	//  152  288:iconst_2        
	//  153  289:invokespecial   #1164 <Method void CFFFont$IndexOffsetItem(int)>
	//  154  292:astore_1        
		((LinkedList) (obj1)).addLast(((Object) (s)));
	//  155  293:aload           10
	//  156  295:aload_1         
	//  157  296:invokevirtual   #1149 <Method void LinkedList.addLast(Object)>
		Object obj = ((Object) (new IndexBaseItem()));
	//  158  299:new             #15  <Class CFFFont$IndexBaseItem>
	//  159  302:dup             
	//  160  303:invokespecial   #1165 <Method void CFFFont$IndexBaseItem()>
	//  161  306:astore          9
		((LinkedList) (obj1)).addLast(obj);
	//  162  308:aload           10
	//  163  310:aload           9
	//  164  312:invokevirtual   #1149 <Method void LinkedList.addLast(Object)>
		dictoffsetitem1 = new DictOffsetItem();
	//  165  315:new             #9   <Class CFFFont$DictOffsetItem>
	//  166  318:dup             
	//  167  319:invokespecial   #1166 <Method void CFFFont$DictOffsetItem()>
	//  168  322:astore          12
		DictOffsetItem dictoffsetitem = new DictOffsetItem();
	//  169  324:new             #9   <Class CFFFont$DictOffsetItem>
	//  170  327:dup             
	//  171  328:invokespecial   #1166 <Method void CFFFont$DictOffsetItem()>
	//  172  331:astore          11
		dictoffsetitem2 = new DictOffsetItem();
	//  173  333:new             #9   <Class CFFFont$DictOffsetItem>
	//  174  336:dup             
	//  175  337:invokespecial   #1166 <Method void CFFFont$DictOffsetItem()>
	//  176  340:astore          13
		dictoffsetitem3 = new DictOffsetItem();
	//  177  342:new             #9   <Class CFFFont$DictOffsetItem>
	//  178  345:dup             
	//  179  346:invokespecial   #1166 <Method void CFFFont$DictOffsetItem()>
	//  180  349:astore          14
		if(!fonts[l].isCID)
	//* 181  351:aload_0         
	//* 182  352:getfield        #1050 <Field CFFFont$Font[] fonts>
	//* 183  355:iload_3         
	//* 184  356:aaload          
	//* 185  357:getfield        #1096 <Field boolean CFFFont$Font.isCID>
	//* 186  360:ifne            474
		{
			((LinkedList) (obj1)).addLast(((Object) (new DictNumberItem(i))));
	//  187  363:aload           10
	//  188  365:new             #6   <Class CFFFont$DictNumberItem>
	//  189  368:dup             
	//  190  369:iload_2         
	//  191  370:invokespecial   #1167 <Method void CFFFont$DictNumberItem(int)>
	//  192  373:invokevirtual   #1149 <Method void LinkedList.addLast(Object)>
			((LinkedList) (obj1)).addLast(((Object) (new DictNumberItem(i + 1))));
	//  193  376:aload           10
	//  194  378:new             #6   <Class CFFFont$DictNumberItem>
	//  195  381:dup             
	//  196  382:iload_2         
	//  197  383:iconst_1        
	//  198  384:iadd            
	//  199  385:invokespecial   #1167 <Method void CFFFont$DictNumberItem(int)>
	//  200  388:invokevirtual   #1149 <Method void LinkedList.addLast(Object)>
			((LinkedList) (obj1)).addLast(((Object) (new DictNumberItem(0))));
	//  201  391:aload           10
	//  202  393:new             #6   <Class CFFFont$DictNumberItem>
	//  203  396:dup             
	//  204  397:iconst_0        
	//  205  398:invokespecial   #1167 <Method void CFFFont$DictNumberItem(int)>
	//  206  401:invokevirtual   #1149 <Method void LinkedList.addLast(Object)>
			((LinkedList) (obj1)).addLast(((Object) (new UInt8Item('\f'))));
	//  207  404:aload           10
	//  208  406:new             #51  <Class CFFFont$UInt8Item>
	//  209  409:dup             
	//  210  410:bipush          12
	//  211  412:invokespecial   #1156 <Method void CFFFont$UInt8Item(char)>
	//  212  415:invokevirtual   #1149 <Method void LinkedList.addLast(Object)>
			((LinkedList) (obj1)).addLast(((Object) (new UInt8Item('\036'))));
	//  213  418:aload           10
	//  214  420:new             #51  <Class CFFFont$UInt8Item>
	//  215  423:dup             
	//  216  424:bipush          30
	//  217  426:invokespecial   #1156 <Method void CFFFont$UInt8Item(char)>
	//  218  429:invokevirtual   #1149 <Method void LinkedList.addLast(Object)>
			((LinkedList) (obj1)).addLast(((Object) (new DictNumberItem(i1))));
	//  219  432:aload           10
	//  220  434:new             #6   <Class CFFFont$DictNumberItem>
	//  221  437:dup             
	//  222  438:iload           4
	//  223  440:invokespecial   #1167 <Method void CFFFont$DictNumberItem(int)>
	//  224  443:invokevirtual   #1149 <Method void LinkedList.addLast(Object)>
			((LinkedList) (obj1)).addLast(((Object) (new UInt8Item('\f'))));
	//  225  446:aload           10
	//  226  448:new             #51  <Class CFFFont$UInt8Item>
	//  227  451:dup             
	//  228  452:bipush          12
	//  229  454:invokespecial   #1156 <Method void CFFFont$UInt8Item(char)>
	//  230  457:invokevirtual   #1149 <Method void LinkedList.addLast(Object)>
			((LinkedList) (obj1)).addLast(((Object) (new UInt8Item('"'))));
	//  231  460:aload           10
	//  232  462:new             #51  <Class CFFFont$UInt8Item>
	//  233  465:dup             
	//  234  466:bipush          34
	//  235  468:invokespecial   #1156 <Method void CFFFont$UInt8Item(char)>
	//  236  471:invokevirtual   #1149 <Method void LinkedList.addLast(Object)>
		}
		((LinkedList) (obj1)).addLast(((Object) (dictoffsetitem2)));
	//  237  474:aload           10
	//  238  476:aload           13
	//  239  478:invokevirtual   #1149 <Method void LinkedList.addLast(Object)>
		((LinkedList) (obj1)).addLast(((Object) (new UInt8Item('\f'))));
	//  240  481:aload           10
	//  241  483:new             #51  <Class CFFFont$UInt8Item>
	//  242  486:dup             
	//  243  487:bipush          12
	//  244  489:invokespecial   #1156 <Method void CFFFont$UInt8Item(char)>
	//  245  492:invokevirtual   #1149 <Method void LinkedList.addLast(Object)>
		((LinkedList) (obj1)).addLast(((Object) (new UInt8Item('$'))));
	//  246  495:aload           10
	//  247  497:new             #51  <Class CFFFont$UInt8Item>
	//  248  500:dup             
	//  249  501:bipush          36
	//  250  503:invokespecial   #1156 <Method void CFFFont$UInt8Item(char)>
	//  251  506:invokevirtual   #1149 <Method void LinkedList.addLast(Object)>
		((LinkedList) (obj1)).addLast(((Object) (dictoffsetitem3)));
	//  252  509:aload           10
	//  253  511:aload           14
	//  254  513:invokevirtual   #1149 <Method void LinkedList.addLast(Object)>
		((LinkedList) (obj1)).addLast(((Object) (new UInt8Item('\f'))));
	//  255  516:aload           10
	//  256  518:new             #51  <Class CFFFont$UInt8Item>
	//  257  521:dup             
	//  258  522:bipush          12
	//  259  524:invokespecial   #1156 <Method void CFFFont$UInt8Item(char)>
	//  260  527:invokevirtual   #1149 <Method void LinkedList.addLast(Object)>
		((LinkedList) (obj1)).addLast(((Object) (new UInt8Item('%'))));
	//  261  530:aload           10
	//  262  532:new             #51  <Class CFFFont$UInt8Item>
	//  263  535:dup             
	//  264  536:bipush          37
	//  265  538:invokespecial   #1156 <Method void CFFFont$UInt8Item(char)>
	//  266  541:invokevirtual   #1149 <Method void LinkedList.addLast(Object)>
		((LinkedList) (obj1)).addLast(((Object) (dictoffsetitem1)));
	//  267  544:aload           10
	//  268  546:aload           12
	//  269  548:invokevirtual   #1149 <Method void LinkedList.addLast(Object)>
		((LinkedList) (obj1)).addLast(((Object) (new UInt8Item('\017'))));
	//  270  551:aload           10
	//  271  553:new             #51  <Class CFFFont$UInt8Item>
	//  272  556:dup             
	//  273  557:bipush          15
	//  274  559:invokespecial   #1156 <Method void CFFFont$UInt8Item(char)>
	//  275  562:invokevirtual   #1149 <Method void LinkedList.addLast(Object)>
		((LinkedList) (obj1)).addLast(((Object) (dictoffsetitem)));
	//  276  565:aload           10
	//  277  567:aload           11
	//  278  569:invokevirtual   #1149 <Method void LinkedList.addLast(Object)>
		((LinkedList) (obj1)).addLast(((Object) (new UInt8Item('\021'))));
	//  279  572:aload           10
	//  280  574:new             #51  <Class CFFFont$UInt8Item>
	//  281  577:dup             
	//  282  578:bipush          17
	//  283  580:invokespecial   #1156 <Method void CFFFont$UInt8Item(char)>
	//  284  583:invokevirtual   #1149 <Method void LinkedList.addLast(Object)>
		seek(topdictOffsets[l]);
	//  285  586:aload_0         
	//  286  587:aload_0         
	//  287  588:getfield        #1040 <Field int[] topdictOffsets>
	//  288  591:iload_3         
	//  289  592:iaload          
	//  290  593:invokevirtual   #1022 <Method void seek(int)>
		do
		{
			if(getPosition() >= topdictOffsets[l + 1])
				break;
	//  291  596:aload_0         
	//  292  597:invokevirtual   #1076 <Method int getPosition()>
	//  293  600:aload_0         
	//  294  601:getfield        #1040 <Field int[] topdictOffsets>
	//  295  604:iload_3         
	//  296  605:iconst_1        
	//  297  606:iadd            
	//  298  607:iaload          
	//  299  608:icmpge          705
			int j = getPosition();
	//  300  611:aload_0         
	//  301  612:invokevirtual   #1076 <Method int getPosition()>
	//  302  615:istore_2        
			getDictItem();
	//  303  616:aload_0         
	//  304  617:invokevirtual   #1079 <Method void getDictItem()>
			int j1 = getPosition();
	//  305  620:aload_0         
	//  306  621:invokevirtual   #1076 <Method int getPosition()>
	//  307  624:istore          5
			if(key != "Encoding" && key != "Private" && key != "FDSelect" && key != "FDArray" && key != "charset" && key != "CharStrings")
	//* 308  626:aload_0         
	//* 309  627:getfield        #1081 <Field String key>
	//* 310  630:ldc1            #114 <String "Encoding">
	//* 311  632:if_acmpeq       596
	//* 312  635:aload_0         
	//* 313  636:getfield        #1081 <Field String key>
	//* 314  639:ldc1            #118 <String "Private">
	//* 315  641:if_acmpeq       596
	//* 316  644:aload_0         
	//* 317  645:getfield        #1081 <Field String key>
	//* 318  648:ldc1            #220 <String "FDSelect">
	//* 319  650:if_acmpeq       596
	//* 320  653:aload_0         
	//* 321  654:getfield        #1081 <Field String key>
	//* 322  657:ldc1            #218 <String "FDArray">
	//* 323  659:if_acmpeq       596
	//* 324  662:aload_0         
	//* 325  663:getfield        #1081 <Field String key>
	//* 326  666:ldc1            #112 <String "charset">
	//* 327  668:if_acmpeq       596
	//* 328  671:aload_0         
	//* 329  672:getfield        #1081 <Field String key>
	//* 330  675:ldc1            #116 <String "CharStrings">
	//* 331  677:if_acmpeq       596
				((LinkedList) (obj1)).add(((Object) (new RangeItem(buf, j, j1 - j))));
	//  332  680:aload           10
	//  333  682:new             #33  <Class CFFFont$RangeItem>
	//  334  685:dup             
	//  335  686:aload_0         
	//  336  687:getfield        #1018 <Field RandomAccessFileOrArray buf>
	//  337  690:iload_2         
	//  338  691:iload           5
	//  339  693:iload_2         
	//  340  694:isub            
	//  341  695:invokespecial   #1145 <Method void CFFFont$RangeItem(RandomAccessFileOrArray, int, int)>
	//  342  698:invokevirtual   #1170 <Method boolean LinkedList.add(Object)>
	//  343  701:pop             
		} while(true);
	//  344  702:goto            596
		((LinkedList) (obj1)).addLast(((Object) (new IndexMarkerItem(((OffsetItem) (s)), ((IndexBaseItem) (obj))))));
	//  345  705:aload           10
	//  346  707:new             #18  <Class CFFFont$IndexMarkerItem>
	//  347  710:dup             
	//  348  711:aload_1         
	//  349  712:aload           9
	//  350  714:invokespecial   #1173 <Method void CFFFont$IndexMarkerItem(CFFFont$OffsetItem, CFFFont$IndexBaseItem)>
	//  351  717:invokevirtual   #1149 <Method void LinkedList.addLast(Object)>
		if(fonts[l].isCID)
	//* 352  720:aload_0         
	//* 353  721:getfield        #1050 <Field CFFFont$Font[] fonts>
	//* 354  724:iload_3         
	//* 355  725:aaload          
	//* 356  726:getfield        #1096 <Field boolean CFFFont$Font.isCID>
	//* 357  729:ifeq            844
		{
			((LinkedList) (obj1)).addLast(((Object) (getEntireIndexRange(stringIndexOffset))));
	//  358  732:aload           10
	//  359  734:aload_0         
	//  360  735:aload_0         
	//  361  736:getfield        #1042 <Field int stringIndexOffset>
	//  362  739:invokevirtual   #1177 <Method CFFFont$RangeItem getEntireIndexRange(int)>
	//  363  742:invokevirtual   #1149 <Method void LinkedList.addLast(Object)>
		} else
	//* 364  745:aload           10
	//* 365  747:aload_0         
	//* 366  748:aload_0         
	//* 367  749:getfield        #1046 <Field int gsubrIndexOffset>
	//* 368  752:invokevirtual   #1177 <Method CFFFont$RangeItem getEntireIndexRange(int)>
	//* 369  755:invokevirtual   #1149 <Method void LinkedList.addLast(Object)>
	//* 370  758:aload_0         
	//* 371  759:getfield        #1050 <Field CFFFont$Font[] fonts>
	//* 372  762:iload_3         
	//* 373  763:aaload          
	//* 374  764:getfield        #1096 <Field boolean CFFFont$Font.isCID>
	//* 375  767:ifeq            1221
	//* 376  770:aload           10
	//* 377  772:new             #27  <Class CFFFont$MarkerItem>
	//* 378  775:dup             
	//* 379  776:aload           11
	//* 380  778:invokespecial   #1180 <Method void CFFFont$MarkerItem(CFFFont$OffsetItem)>
	//* 381  781:invokevirtual   #1149 <Method void LinkedList.addLast(Object)>
	//* 382  784:aload           10
	//* 383  786:aload_0         
	//* 384  787:aload_0         
	//* 385  788:getfield        #1050 <Field CFFFont$Font[] fonts>
	//* 386  791:iload_3         
	//* 387  792:aaload          
	//* 388  793:getfield        #1108 <Field int CFFFont$Font.charstringsOffset>
	//* 389  796:invokevirtual   #1177 <Method CFFFont$RangeItem getEntireIndexRange(int)>
	//* 390  799:invokevirtual   #1149 <Method void LinkedList.addLast(Object)>
	//* 391  802:iconst_1        
	//* 392  803:newarray        int[]
	//* 393  805:astore_1        
	//* 394  806:aload_1         
	//* 395  807:iconst_0        
	//* 396  808:iconst_0        
	//* 397  809:iastore         
	//* 398  810:aload           10
	//* 399  812:invokevirtual   #1184 <Method Iterator LinkedList.iterator()>
	//* 400  815:astore          9
	//* 401  817:aload           9
	//* 402  819:invokeinterface #1190 <Method boolean Iterator.hasNext()>
	//* 403  824:ifeq            1590
	//* 404  827:aload           9
	//* 405  829:invokeinterface #1194 <Method Object Iterator.next()>
	//* 406  834:checkcast       #24  <Class CFFFont$Item>
	//* 407  837:aload_1         
	//* 408  838:invokevirtual   #1198 <Method void CFFFont$Item.increment(int[])>
	//* 409  841:goto            817
		{
			String s1 = (new StringBuilder()).append(fonts[l].name).append("-OneRange").toString();
	//  410  844:new             #1060 <Class StringBuilder>
	//  411  847:dup             
	//  412  848:invokespecial   #1061 <Method void StringBuilder()>
	//  413  851:aload_0         
	//  414  852:getfield        #1050 <Field CFFFont$Font[] fonts>
	//  415  855:iload_3         
	//  416  856:aaload          
	//  417  857:getfield        #1058 <Field String CFFFont$Font.name>
	//  418  860:invokevirtual   #1065 <Method StringBuilder StringBuilder.append(String)>
	//  419  863:ldc2            #1200 <String "-OneRange">
	//  420  866:invokevirtual   #1065 <Method StringBuilder StringBuilder.append(String)>
	//  421  869:invokevirtual   #1072 <Method String StringBuilder.toString()>
	//  422  872:astore          9
			s = s1;
	//  423  874:aload           9
	//  424  876:astore_1        
			if(s1.length() > 127)
	//* 425  877:aload           9
	//* 426  879:invokevirtual   #1159 <Method int String.length()>
	//* 427  882:bipush          127
	//* 428  884:icmple          896
				s = s1.substring(0, 127);
	//  429  887:aload           9
	//  430  889:iconst_0        
	//  431  890:bipush          127
	//  432  892:invokevirtual   #1204 <Method String String.substring(int, int)>
	//  433  895:astore_1        
			s1 = (new StringBuilder()).append("AdobeIdentity").append(s).toString();
	//  434  896:new             #1060 <Class StringBuilder>
	//  435  899:dup             
	//  436  900:invokespecial   #1061 <Method void StringBuilder()>
	//  437  903:ldc2            #1206 <String "AdobeIdentity">
	//  438  906:invokevirtual   #1065 <Method StringBuilder StringBuilder.append(String)>
	//  439  909:aload_1         
	//  440  910:invokevirtual   #1065 <Method StringBuilder StringBuilder.append(String)>
	//  441  913:invokevirtual   #1072 <Method String StringBuilder.toString()>
	//  442  916:astore          9
			int i2 = stringOffsets[stringOffsets.length - 1] - stringOffsets[0];
	//  443  918:aload_0         
	//  444  919:getfield        #1044 <Field int[] stringOffsets>
	//  445  922:aload_0         
	//  446  923:getfield        #1044 <Field int[] stringOffsets>
	//  447  926:arraylength     
	//  448  927:iconst_1        
	//  449  928:isub            
	//  450  929:iaload          
	//  451  930:aload_0         
	//  452  931:getfield        #1044 <Field int[] stringOffsets>
	//  453  934:iconst_0        
	//  454  935:iaload          
	//  455  936:isub            
	//  456  937:istore          6
			int j2 = stringOffsets[0] - 1;
	//  457  939:aload_0         
	//  458  940:getfield        #1044 <Field int[] stringOffsets>
	//  459  943:iconst_0        
	//  460  944:iaload          
	//  461  945:iconst_1        
	//  462  946:isub            
	//  463  947:istore          7
			int k;
			int k2;
			int ai[];
			if(s1.length() + i2 <= 255)
	//* 464  949:aload           9
	//* 465  951:invokevirtual   #1159 <Method int String.length()>
	//* 466  954:iload           6
	//* 467  956:iadd            
	//* 468  957:sipush          255
	//* 469  960:icmpgt          1052
				k = 1;
	//  470  963:iconst_1        
	//  471  964:istore_2        
			else
	//* 472  965:aload           10
	//* 473  967:new             #42  <Class CFFFont$UInt16Item>
	//* 474  970:dup             
	//* 475  971:aload_0         
	//* 476  972:getfield        #1044 <Field int[] stringOffsets>
	//* 477  975:arraylength     
	//* 478  976:iconst_1        
	//* 479  977:isub            
	//* 480  978:iconst_3        
	//* 481  979:iadd            
	//* 482  980:int2char        
	//* 483  981:invokespecial   #1155 <Method void CFFFont$UInt16Item(char)>
	//* 484  984:invokevirtual   #1149 <Method void LinkedList.addLast(Object)>
	//* 485  987:aload           10
	//* 486  989:new             #51  <Class CFFFont$UInt8Item>
	//* 487  992:dup             
	//* 488  993:iload_2         
	//* 489  994:int2char        
	//* 490  995:invokespecial   #1156 <Method void CFFFont$UInt8Item(char)>
	//* 491  998:invokevirtual   #1149 <Method void LinkedList.addLast(Object)>
	//* 492 1001:aload_0         
	//* 493 1002:getfield        #1044 <Field int[] stringOffsets>
	//* 494 1005:astore          15
	//* 495 1007:aload           15
	//* 496 1009:arraylength     
	//* 497 1010:istore          8
	//* 498 1012:iconst_0        
	//* 499 1013:istore          5
	//* 500 1015:iload           5
	//* 501 1017:iload           8
	//* 502 1019:icmpge          1095
	//* 503 1022:aload           10
	//* 504 1024:new             #21  <Class CFFFont$IndexOffsetItem>
	//* 505 1027:dup             
	//* 506 1028:iload_2         
	//* 507 1029:aload           15
	//* 508 1031:iload           5
	//* 509 1033:iaload          
	//* 510 1034:iload           7
	//* 511 1036:isub            
	//* 512 1037:invokespecial   #1209 <Method void CFFFont$IndexOffsetItem(int, int)>
	//* 513 1040:invokevirtual   #1149 <Method void LinkedList.addLast(Object)>
	//* 514 1043:iload           5
	//* 515 1045:iconst_1        
	//* 516 1046:iadd            
	//* 517 1047:istore          5
	//* 518 1049:goto            1015
			if(s1.length() + i2 <= 65535)
	//* 519 1052:aload           9
	//* 520 1054:invokevirtual   #1159 <Method int String.length()>
	//* 521 1057:iload           6
	//* 522 1059:iadd            
	//* 523 1060:ldc2            #1210 <Int 65535>
	//* 524 1063:icmpgt          1071
				k = 2;
	//  525 1066:iconst_2        
	//  526 1067:istore_2        
			else
	//* 527 1068:goto            965
			if(s1.length() + i2 <= 0xffffff)
	//* 528 1071:aload           9
	//* 529 1073:invokevirtual   #1159 <Method int String.length()>
	//* 530 1076:iload           6
	//* 531 1078:iadd            
	//* 532 1079:ldc2            #1211 <Int 0xffffff>
	//* 533 1082:icmpgt          1090
				k = 3;
	//  534 1085:iconst_3        
	//  535 1086:istore_2        
			else
	//* 536 1087:goto            965
				k = 4;
	//  537 1090:iconst_4        
	//  538 1091:istore_2        
			((LinkedList) (obj1)).addLast(((Object) (new UInt16Item((char)((stringOffsets.length - 1) + 3)))));
			((LinkedList) (obj1)).addLast(((Object) (new UInt8Item((char)k))));
			ai = stringOffsets;
			k2 = ai.length;
			for(int k1 = 0; k1 < k2; k1++)
				((LinkedList) (obj1)).addLast(((Object) (new IndexOffsetItem(k, ai[k1] - j2))));

	//* 539 1092:goto            965
			int l1 = (stringOffsets[stringOffsets.length - 1] - j2) + "Adobe".length();
	//  540 1095:aload_0         
	//  541 1096:getfield        #1044 <Field int[] stringOffsets>
	//  542 1099:aload_0         
	//  543 1100:getfield        #1044 <Field int[] stringOffsets>
	//  544 1103:arraylength     
	//  545 1104:iconst_1        
	//  546 1105:isub            
	//  547 1106:iaload          
	//  548 1107:iload           7
	//  549 1109:isub            
	//  550 1110:ldc2            #1213 <String "Adobe">
	//  551 1113:invokevirtual   #1159 <Method int String.length()>
	//  552 1116:iadd            
	//  553 1117:istore          5
			((LinkedList) (obj1)).addLast(((Object) (new IndexOffsetItem(k, l1))));
	//  554 1119:aload           10
	//  555 1121:new             #21  <Class CFFFont$IndexOffsetItem>
	//  556 1124:dup             
	//  557 1125:iload_2         
	//  558 1126:iload           5
	//  559 1128:invokespecial   #1209 <Method void CFFFont$IndexOffsetItem(int, int)>
	//  560 1131:invokevirtual   #1149 <Method void LinkedList.addLast(Object)>
			l1 += "Identity".length();
	//  561 1134:iload           5
	//  562 1136:ldc2            #1215 <String "Identity">
	//  563 1139:invokevirtual   #1159 <Method int String.length()>
	//  564 1142:iadd            
	//  565 1143:istore          5
			((LinkedList) (obj1)).addLast(((Object) (new IndexOffsetItem(k, l1))));
	//  566 1145:aload           10
	//  567 1147:new             #21  <Class CFFFont$IndexOffsetItem>
	//  568 1150:dup             
	//  569 1151:iload_2         
	//  570 1152:iload           5
	//  571 1154:invokespecial   #1209 <Method void CFFFont$IndexOffsetItem(int, int)>
	//  572 1157:invokevirtual   #1149 <Method void LinkedList.addLast(Object)>
			((LinkedList) (obj1)).addLast(((Object) (new IndexOffsetItem(k, l1 + s.length()))));
	//  573 1160:aload           10
	//  574 1162:new             #21  <Class CFFFont$IndexOffsetItem>
	//  575 1165:dup             
	//  576 1166:iload_2         
	//  577 1167:iload           5
	//  578 1169:aload_1         
	//  579 1170:invokevirtual   #1159 <Method int String.length()>
	//  580 1173:iadd            
	//  581 1174:invokespecial   #1209 <Method void CFFFont$IndexOffsetItem(int, int)>
	//  582 1177:invokevirtual   #1149 <Method void LinkedList.addLast(Object)>
			((LinkedList) (obj1)).addLast(((Object) (new RangeItem(buf, stringOffsets[0], i2))));
	//  583 1180:aload           10
	//  584 1182:new             #33  <Class CFFFont$RangeItem>
	//  585 1185:dup             
	//  586 1186:aload_0         
	//  587 1187:getfield        #1018 <Field RandomAccessFileOrArray buf>
	//  588 1190:aload_0         
	//  589 1191:getfield        #1044 <Field int[] stringOffsets>
	//  590 1194:iconst_0        
	//  591 1195:iaload          
	//  592 1196:iload           6
	//  593 1198:invokespecial   #1145 <Method void CFFFont$RangeItem(RandomAccessFileOrArray, int, int)>
	//  594 1201:invokevirtual   #1149 <Method void LinkedList.addLast(Object)>
			((LinkedList) (obj1)).addLast(((Object) (new StringItem(s1))));
	//  595 1204:aload           10
	//  596 1206:new             #36  <Class CFFFont$StringItem>
	//  597 1209:dup             
	//  598 1210:aload           9
	//  599 1212:invokespecial   #1162 <Method void CFFFont$StringItem(String)>
	//  600 1215:invokevirtual   #1149 <Method void LinkedList.addLast(Object)>
		}
		((LinkedList) (obj1)).addLast(((Object) (getEntireIndexRange(gsubrIndexOffset))));
		if(!fonts[l].isCID) goto _L7; else goto _L6
_L6:
		((LinkedList) (obj1)).addLast(((Object) (new MarkerItem(((OffsetItem) (dictoffsetitem))))));
		((LinkedList) (obj1)).addLast(((Object) (getEntireIndexRange(fonts[l].charstringsOffset))));
		s = ((String) (new int[1]));
		s[0] = 0;
		for(obj = ((Object) (((LinkedList) (obj1)).iterator())); ((Iterator) (obj)).hasNext(); ((Item)((Iterator) (obj)).next()).increment(((int []) (s))));
		break; /* Loop/switch isn't completed */
	//* 601 1218:goto            745
_L7:
		((LinkedList) (obj1)).addLast(((Object) (new MarkerItem(((OffsetItem) (dictoffsetitem3))))));
	//  602 1221:aload           10
	//  603 1223:new             #27  <Class CFFFont$MarkerItem>
	//  604 1226:dup             
	//  605 1227:aload           14
	//  606 1229:invokespecial   #1180 <Method void CFFFont$MarkerItem(CFFFont$OffsetItem)>
	//  607 1232:invokevirtual   #1149 <Method void LinkedList.addLast(Object)>
		((LinkedList) (obj1)).addLast(((Object) (new UInt8Item('\003'))));
	//  608 1235:aload           10
	//  609 1237:new             #51  <Class CFFFont$UInt8Item>
	//  610 1240:dup             
	//  611 1241:iconst_3        
	//  612 1242:invokespecial   #1156 <Method void CFFFont$UInt8Item(char)>
	//  613 1245:invokevirtual   #1149 <Method void LinkedList.addLast(Object)>
		((LinkedList) (obj1)).addLast(((Object) (new UInt16Item('\001'))));
	//  614 1248:aload           10
	//  615 1250:new             #42  <Class CFFFont$UInt16Item>
	//  616 1253:dup             
	//  617 1254:iconst_1        
	//  618 1255:invokespecial   #1155 <Method void CFFFont$UInt16Item(char)>
	//  619 1258:invokevirtual   #1149 <Method void LinkedList.addLast(Object)>
		((LinkedList) (obj1)).addLast(((Object) (new UInt16Item('\0'))));
	//  620 1261:aload           10
	//  621 1263:new             #42  <Class CFFFont$UInt16Item>
	//  622 1266:dup             
	//  623 1267:iconst_0        
	//  624 1268:invokespecial   #1155 <Method void CFFFont$UInt16Item(char)>
	//  625 1271:invokevirtual   #1149 <Method void LinkedList.addLast(Object)>
		((LinkedList) (obj1)).addLast(((Object) (new UInt8Item('\0'))));
	//  626 1274:aload           10
	//  627 1276:new             #51  <Class CFFFont$UInt8Item>
	//  628 1279:dup             
	//  629 1280:iconst_0        
	//  630 1281:invokespecial   #1156 <Method void CFFFont$UInt8Item(char)>
	//  631 1284:invokevirtual   #1149 <Method void LinkedList.addLast(Object)>
		((LinkedList) (obj1)).addLast(((Object) (new UInt16Item((char)i1))));
	//  632 1287:aload           10
	//  633 1289:new             #42  <Class CFFFont$UInt16Item>
	//  634 1292:dup             
	//  635 1293:iload           4
	//  636 1295:int2char        
	//  637 1296:invokespecial   #1155 <Method void CFFFont$UInt16Item(char)>
	//  638 1299:invokevirtual   #1149 <Method void LinkedList.addLast(Object)>
		((LinkedList) (obj1)).addLast(((Object) (new MarkerItem(((OffsetItem) (dictoffsetitem1))))));
	//  639 1302:aload           10
	//  640 1304:new             #27  <Class CFFFont$MarkerItem>
	//  641 1307:dup             
	//  642 1308:aload           12
	//  643 1310:invokespecial   #1180 <Method void CFFFont$MarkerItem(CFFFont$OffsetItem)>
	//  644 1313:invokevirtual   #1149 <Method void LinkedList.addLast(Object)>
		((LinkedList) (obj1)).addLast(((Object) (new UInt8Item('\002'))));
	//  645 1316:aload           10
	//  646 1318:new             #51  <Class CFFFont$UInt8Item>
	//  647 1321:dup             
	//  648 1322:iconst_2        
	//  649 1323:invokespecial   #1156 <Method void CFFFont$UInt8Item(char)>
	//  650 1326:invokevirtual   #1149 <Method void LinkedList.addLast(Object)>
		((LinkedList) (obj1)).addLast(((Object) (new UInt16Item('\001'))));
	//  651 1329:aload           10
	//  652 1331:new             #42  <Class CFFFont$UInt16Item>
	//  653 1334:dup             
	//  654 1335:iconst_1        
	//  655 1336:invokespecial   #1155 <Method void CFFFont$UInt16Item(char)>
	//  656 1339:invokevirtual   #1149 <Method void LinkedList.addLast(Object)>
		((LinkedList) (obj1)).addLast(((Object) (new UInt16Item((char)(i1 - 1)))));
	//  657 1342:aload           10
	//  658 1344:new             #42  <Class CFFFont$UInt16Item>
	//  659 1347:dup             
	//  660 1348:iload           4
	//  661 1350:iconst_1        
	//  662 1351:isub            
	//  663 1352:int2char        
	//  664 1353:invokespecial   #1155 <Method void CFFFont$UInt16Item(char)>
	//  665 1356:invokevirtual   #1149 <Method void LinkedList.addLast(Object)>
		((LinkedList) (obj1)).addLast(((Object) (new MarkerItem(((OffsetItem) (dictoffsetitem2))))));
	//  666 1359:aload           10
	//  667 1361:new             #27  <Class CFFFont$MarkerItem>
	//  668 1364:dup             
	//  669 1365:aload           13
	//  670 1367:invokespecial   #1180 <Method void CFFFont$MarkerItem(CFFFont$OffsetItem)>
	//  671 1370:invokevirtual   #1149 <Method void LinkedList.addLast(Object)>
		((LinkedList) (obj1)).addLast(((Object) (new UInt16Item('\001'))));
	//  672 1373:aload           10
	//  673 1375:new             #42  <Class CFFFont$UInt16Item>
	//  674 1378:dup             
	//  675 1379:iconst_1        
	//  676 1380:invokespecial   #1155 <Method void CFFFont$UInt16Item(char)>
	//  677 1383:invokevirtual   #1149 <Method void LinkedList.addLast(Object)>
		((LinkedList) (obj1)).addLast(((Object) (new UInt8Item('\001'))));
	//  678 1386:aload           10
	//  679 1388:new             #51  <Class CFFFont$UInt8Item>
	//  680 1391:dup             
	//  681 1392:iconst_1        
	//  682 1393:invokespecial   #1156 <Method void CFFFont$UInt8Item(char)>
	//  683 1396:invokevirtual   #1149 <Method void LinkedList.addLast(Object)>
		((LinkedList) (obj1)).addLast(((Object) (new UInt8Item('\001'))));
	//  684 1399:aload           10
	//  685 1401:new             #51  <Class CFFFont$UInt8Item>
	//  686 1404:dup             
	//  687 1405:iconst_1        
	//  688 1406:invokespecial   #1156 <Method void CFFFont$UInt8Item(char)>
	//  689 1409:invokevirtual   #1149 <Method void LinkedList.addLast(Object)>
		s = ((String) (new IndexOffsetItem(1)));
	//  690 1412:new             #21  <Class CFFFont$IndexOffsetItem>
	//  691 1415:dup             
	//  692 1416:iconst_1        
	//  693 1417:invokespecial   #1164 <Method void CFFFont$IndexOffsetItem(int)>
	//  694 1420:astore_1        
		((LinkedList) (obj1)).addLast(((Object) (s)));
	//  695 1421:aload           10
	//  696 1423:aload_1         
	//  697 1424:invokevirtual   #1149 <Method void LinkedList.addLast(Object)>
		IndexBaseItem indexbaseitem = new IndexBaseItem();
	//  698 1427:new             #15  <Class CFFFont$IndexBaseItem>
	//  699 1430:dup             
	//  700 1431:invokespecial   #1165 <Method void CFFFont$IndexBaseItem()>
	//  701 1434:astore          9
		((LinkedList) (obj1)).addLast(((Object) (indexbaseitem)));
	//  702 1436:aload           10
	//  703 1438:aload           9
	//  704 1440:invokevirtual   #1149 <Method void LinkedList.addLast(Object)>
		((LinkedList) (obj1)).addLast(((Object) (new DictNumberItem(fonts[l].privateLength))));
	//  705 1443:aload           10
	//  706 1445:new             #6   <Class CFFFont$DictNumberItem>
	//  707 1448:dup             
	//  708 1449:aload_0         
	//  709 1450:getfield        #1050 <Field CFFFont$Font[] fonts>
	//  710 1453:iload_3         
	//  711 1454:aaload          
	//  712 1455:getfield        #1099 <Field int CFFFont$Font.privateLength>
	//  713 1458:invokespecial   #1167 <Method void CFFFont$DictNumberItem(int)>
	//  714 1461:invokevirtual   #1149 <Method void LinkedList.addLast(Object)>
		dictoffsetitem1 = new DictOffsetItem();
	//  715 1464:new             #9   <Class CFFFont$DictOffsetItem>
	//  716 1467:dup             
	//  717 1468:invokespecial   #1166 <Method void CFFFont$DictOffsetItem()>
	//  718 1471:astore          12
		((LinkedList) (obj1)).addLast(((Object) (dictoffsetitem1)));
	//  719 1473:aload           10
	//  720 1475:aload           12
	//  721 1477:invokevirtual   #1149 <Method void LinkedList.addLast(Object)>
		((LinkedList) (obj1)).addLast(((Object) (new UInt8Item('\022'))));
	//  722 1480:aload           10
	//  723 1482:new             #51  <Class CFFFont$UInt8Item>
	//  724 1485:dup             
	//  725 1486:bipush          18
	//  726 1488:invokespecial   #1156 <Method void CFFFont$UInt8Item(char)>
	//  727 1491:invokevirtual   #1149 <Method void LinkedList.addLast(Object)>
		((LinkedList) (obj1)).addLast(((Object) (new IndexMarkerItem(((OffsetItem) (s)), indexbaseitem))));
	//  728 1494:aload           10
	//  729 1496:new             #18  <Class CFFFont$IndexMarkerItem>
	//  730 1499:dup             
	//  731 1500:aload_1         
	//  732 1501:aload           9
	//  733 1503:invokespecial   #1173 <Method void CFFFont$IndexMarkerItem(CFFFont$OffsetItem, CFFFont$IndexBaseItem)>
	//  734 1506:invokevirtual   #1149 <Method void LinkedList.addLast(Object)>
		((LinkedList) (obj1)).addLast(((Object) (new MarkerItem(((OffsetItem) (dictoffsetitem1))))));
	//  735 1509:aload           10
	//  736 1511:new             #27  <Class CFFFont$MarkerItem>
	//  737 1514:dup             
	//  738 1515:aload           12
	//  739 1517:invokespecial   #1180 <Method void CFFFont$MarkerItem(CFFFont$OffsetItem)>
	//  740 1520:invokevirtual   #1149 <Method void LinkedList.addLast(Object)>
		((LinkedList) (obj1)).addLast(((Object) (new RangeItem(buf, fonts[l].privateOffset, fonts[l].privateLength))));
	//  741 1523:aload           10
	//  742 1525:new             #33  <Class CFFFont$RangeItem>
	//  743 1528:dup             
	//  744 1529:aload_0         
	//  745 1530:getfield        #1018 <Field RandomAccessFileOrArray buf>
	//  746 1533:aload_0         
	//  747 1534:getfield        #1050 <Field CFFFont$Font[] fonts>
	//  748 1537:iload_3         
	//  749 1538:aaload          
	//  750 1539:getfield        #1102 <Field int CFFFont$Font.privateOffset>
	//  751 1542:aload_0         
	//  752 1543:getfield        #1050 <Field CFFFont$Font[] fonts>
	//  753 1546:iload_3         
	//  754 1547:aaload          
	//  755 1548:getfield        #1099 <Field int CFFFont$Font.privateLength>
	//  756 1551:invokespecial   #1145 <Method void CFFFont$RangeItem(RandomAccessFileOrArray, int, int)>
	//  757 1554:invokevirtual   #1149 <Method void LinkedList.addLast(Object)>
		if(fonts[l].privateSubrs >= 0)
	//* 758 1557:aload_0         
	//* 759 1558:getfield        #1050 <Field CFFFont$Font[] fonts>
	//* 760 1561:iload_3         
	//* 761 1562:aaload          
	//* 762 1563:getfield        #1122 <Field int CFFFont$Font.privateSubrs>
	//* 763 1566:iflt            770
			((LinkedList) (obj1)).addLast(((Object) (getEntireIndexRange(fonts[l].privateSubrs))));
	//  764 1569:aload           10
	//  765 1571:aload_0         
	//  766 1572:aload_0         
	//  767 1573:getfield        #1050 <Field CFFFont$Font[] fonts>
	//  768 1576:iload_3         
	//  769 1577:aaload          
	//  770 1578:getfield        #1122 <Field int CFFFont$Font.privateSubrs>
	//  771 1581:invokevirtual   #1177 <Method CFFFont$RangeItem getEntireIndexRange(int)>
	//  772 1584:invokevirtual   #1149 <Method void LinkedList.addLast(Object)>
		if(true) goto _L6; else goto _L8
	//  773 1587:goto            770
_L8:
		byte abyte0[];
		for(Iterator iterator = ((LinkedList) (obj1)).iterator(); iterator.hasNext(); ((Item)iterator.next()).xref());
	//  774 1590:aload           10
	//  775 1592:invokevirtual   #1184 <Method Iterator LinkedList.iterator()>
	//  776 1595:astore          9
	//  777 1597:aload           9
	//  778 1599:invokeinterface #1190 <Method boolean Iterator.hasNext()>
	//  779 1604:ifeq            1623
	//  780 1607:aload           9
	//  781 1609:invokeinterface #1194 <Method Object Iterator.next()>
	//  782 1614:checkcast       #24  <Class CFFFont$Item>
	//  783 1617:invokevirtual   #1218 <Method void CFFFont$Item.xref()>
	//* 784 1620:goto            1597
		abyte0 = new byte[s[0]];
	//  785 1623:aload_1         
	//  786 1624:iconst_0        
	//  787 1625:iaload          
	//  788 1626:newarray        byte[]
	//  789 1628:astore          9
		obj1 = ((Object) (((LinkedList) (obj1)).iterator()));
	//  790 1630:aload           10
	//  791 1632:invokevirtual   #1184 <Method Iterator LinkedList.iterator()>
	//  792 1635:astore          10
_L11:
		s = ((String) (abyte0));
	//  793 1637:aload           9
	//  794 1639:astore_1        
		if(!((Iterator) (obj1)).hasNext()) goto _L10; else goto _L9
	//  795 1640:aload           10
	//  796 1642:invokeinterface #1190 <Method boolean Iterator.hasNext()>
	//  797 1647:ifeq            38
_L9:
		((Item)((Iterator) (obj1)).next()).emit(abyte0);
	//  798 1650:aload           10
	//  799 1652:invokeinterface #1194 <Method Object Iterator.next()>
	//  800 1657:checkcast       #24  <Class CFFFont$Item>
	//  801 1660:aload           9
	//  802 1662:invokevirtual   #1222 <Method void CFFFont$Item.emit(byte[])>
		  goto _L11
	//* 803 1665:goto            1637
	}

	char getCard16()
	{
		char c;
		try
		{
			c = buf.readChar();
	//    0    0:aload_0         
	//    1    1:getfield        #1018 <Field RandomAccessFileOrArray buf>
	//    2    4:invokevirtual   #1229 <Method char RandomAccessFileOrArray.readChar()>
	//    3    7:istore_1        
		}
	//*   4    8:iload_1         
	//*   5    9:ireturn         
		catch(Exception exception)
	//*   6   10:astore_2        
		{
			throw new ExceptionConverter(exception);
	//    7   11:new             #1231 <Class ExceptionConverter>
	//    8   14:dup             
	//    9   15:aload_2         
	//   10   16:invokespecial   #1234 <Method void ExceptionConverter(Exception)>
	//   11   19:athrow          
		}
		return c;
	}

	char getCard8()
	{
		byte byte0;
		try
		{
			byte0 = buf.readByte();
	//    0    0:aload_0         
	//    1    1:getfield        #1018 <Field RandomAccessFileOrArray buf>
	//    2    4:invokevirtual   #1238 <Method byte RandomAccessFileOrArray.readByte()>
	//    3    7:istore_1        
		}
	//*   4    8:iload_1         
	//*   5    9:sipush          255
	//*   6   12:iand            
	//*   7   13:int2char        
	//*   8   14:ireturn         
		catch(Exception exception)
	//*   9   15:astore_2        
		{
			throw new ExceptionConverter(exception);
	//   10   16:new             #1231 <Class ExceptionConverter>
	//   11   19:dup             
	//   12   20:aload_2         
	//   13   21:invokespecial   #1234 <Method void ExceptionConverter(Exception)>
	//   14   24:athrow          
		}
		return (char)(byte0 & 0xff);
	}

	protected void getDictItem()
	{
		for(int i = 0; i < arg_count; i++)
	//*   0    0:iconst_0        
	//*   1    1:istore_1        
	//*   2    2:iload_1         
	//*   3    3:aload_0         
	//*   4    4:getfield        #1016 <Field int arg_count>
	//*   5    7:icmpge          24
			args[i] = null;
	//    6   10:aload_0         
	//    7   11:getfield        #1014 <Field Object[] args>
	//    8   14:iload_1         
	//    9   15:aconst_null     
	//   10   16:aastore         

	//   11   17:iload_1         
	//   12   18:iconst_1        
	//   13   19:iadd            
	//   14   20:istore_1        
	//*  15   21:goto            2
		arg_count = 0;
	//   16   24:aload_0         
	//   17   25:iconst_0        
	//   18   26:putfield        #1016 <Field int arg_count>
		key = null;
	//   19   29:aload_0         
	//   20   30:aconst_null     
	//   21   31:putfield        #1081 <Field String key>
		boolean flag = false;
	//   22   34:iconst_0        
	//   23   35:istore          5
label0:
		do
		{
			short word0;
label1:
			{
				StringBuilder stringbuilder;
label2:
				{
					if(flag)
						break label0;
	//   24   37:iload           5
	//   25   39:ifne            608
					word0 = ((short) (getCard8()));
	//   26   42:aload_0         
	//   27   43:invokevirtual   #1026 <Method char getCard8()>
	//   28   46:istore_1        
					if(word0 == 29)
	//*  29   47:iload_1         
	//*  30   48:bipush          29
	//*  31   50:icmpne          84
					{
						word0 = ((short) (getInt()));
	//   32   53:aload_0         
	//   33   54:invokevirtual   #1241 <Method int getInt()>
	//   34   57:istore_1        
						args[arg_count] = ((Object) (Integer.valueOf(((int) (word0)))));
	//   35   58:aload_0         
	//   36   59:getfield        #1014 <Field Object[] args>
	//   37   62:aload_0         
	//   38   63:getfield        #1016 <Field int arg_count>
	//   39   66:iload_1         
	//   40   67:invokestatic    #1245 <Method Integer Integer.valueOf(int)>
	//   41   70:aastore         
						arg_count = arg_count + 1;
	//   42   71:aload_0         
	//   43   72:aload_0         
	//   44   73:getfield        #1016 <Field int arg_count>
	//   45   76:iconst_1        
	//   46   77:iadd            
	//   47   78:putfield        #1016 <Field int arg_count>
						continue;
	//   48   81:goto            37
					}
					if(word0 == 28)
	//*  49   84:iload_1         
	//*  50   85:bipush          28
	//*  51   87:icmpne          121
					{
						word0 = getShort();
	//   52   90:aload_0         
	//   53   91:invokevirtual   #1249 <Method short getShort()>
	//   54   94:istore_1        
						args[arg_count] = ((Object) (Integer.valueOf(((int) (word0)))));
	//   55   95:aload_0         
	//   56   96:getfield        #1014 <Field Object[] args>
	//   57   99:aload_0         
	//   58  100:getfield        #1016 <Field int arg_count>
	//   59  103:iload_1         
	//   60  104:invokestatic    #1245 <Method Integer Integer.valueOf(int)>
	//   61  107:aastore         
						arg_count = arg_count + 1;
	//   62  108:aload_0         
	//   63  109:aload_0         
	//   64  110:getfield        #1016 <Field int arg_count>
	//   65  113:iconst_1        
	//   66  114:iadd            
	//   67  115:putfield        #1016 <Field int arg_count>
						continue;
	//   68  118:goto            37
					}
					if(word0 >= 32 && word0 <= 246)
	//*  69  121:iload_1         
	//*  70  122:bipush          32
	//*  71  124:icmplt          167
	//*  72  127:iload_1         
	//*  73  128:sipush          246
	//*  74  131:icmpgt          167
					{
						word0 = ((short) ((byte)(word0 - 139)));
	//   75  134:iload_1         
	//   76  135:sipush          139
	//   77  138:isub            
	//   78  139:int2byte        
	//   79  140:istore_1        
						args[arg_count] = ((Object) (Integer.valueOf(((int) (word0)))));
	//   80  141:aload_0         
	//   81  142:getfield        #1014 <Field Object[] args>
	//   82  145:aload_0         
	//   83  146:getfield        #1016 <Field int arg_count>
	//   84  149:iload_1         
	//   85  150:invokestatic    #1245 <Method Integer Integer.valueOf(int)>
	//   86  153:aastore         
						arg_count = arg_count + 1;
	//   87  154:aload_0         
	//   88  155:aload_0         
	//   89  156:getfield        #1016 <Field int arg_count>
	//   90  159:iconst_1        
	//   91  160:iadd            
	//   92  161:putfield        #1016 <Field int arg_count>
						continue;
	//   93  164:goto            37
					}
					if(word0 >= 247 && word0 <= 250)
	//*  94  167:iload_1         
	//*  95  168:sipush          247
	//*  96  171:icmplt          226
	//*  97  174:iload_1         
	//*  98  175:sipush          250
	//*  99  178:icmpgt          226
					{
						word0 = (short)((word0 - 247) * 256 + getCard8() + 108);
	//  100  181:iload_1         
	//  101  182:sipush          247
	//  102  185:isub            
	//  103  186:sipush          256
	//  104  189:imul            
	//  105  190:aload_0         
	//  106  191:invokevirtual   #1026 <Method char getCard8()>
	//  107  194:iadd            
	//  108  195:bipush          108
	//  109  197:iadd            
	//  110  198:int2short       
	//  111  199:istore_1        
						args[arg_count] = ((Object) (Integer.valueOf(((int) (word0)))));
	//  112  200:aload_0         
	//  113  201:getfield        #1014 <Field Object[] args>
	//  114  204:aload_0         
	//  115  205:getfield        #1016 <Field int arg_count>
	//  116  208:iload_1         
	//  117  209:invokestatic    #1245 <Method Integer Integer.valueOf(int)>
	//  118  212:aastore         
						arg_count = arg_count + 1;
	//  119  213:aload_0         
	//  120  214:aload_0         
	//  121  215:getfield        #1016 <Field int arg_count>
	//  122  218:iconst_1        
	//  123  219:iadd            
	//  124  220:putfield        #1016 <Field int arg_count>
						continue;
	//  125  223:goto            37
					}
					if(word0 >= 251 && word0 <= 254)
	//* 126  226:iload_1         
	//* 127  227:sipush          251
	//* 128  230:icmplt          288
	//* 129  233:iload_1         
	//* 130  234:sipush          254
	//* 131  237:icmpgt          288
					{
						char c = getCard8();
	//  132  240:aload_0         
	//  133  241:invokevirtual   #1026 <Method char getCard8()>
	//  134  244:istore_2        
						word0 = (short)(-(word0 - 251) * 256 - c - 108);
	//  135  245:iload_1         
	//  136  246:sipush          251
	//  137  249:isub            
	//  138  250:ineg            
	//  139  251:sipush          256
	//  140  254:imul            
	//  141  255:iload_2         
	//  142  256:isub            
	//  143  257:bipush          108
	//  144  259:isub            
	//  145  260:int2short       
	//  146  261:istore_1        
						args[arg_count] = ((Object) (Integer.valueOf(((int) (word0)))));
	//  147  262:aload_0         
	//  148  263:getfield        #1014 <Field Object[] args>
	//  149  266:aload_0         
	//  150  267:getfield        #1016 <Field int arg_count>
	//  151  270:iload_1         
	//  152  271:invokestatic    #1245 <Method Integer Integer.valueOf(int)>
	//  153  274:aastore         
						arg_count = arg_count + 1;
	//  154  275:aload_0         
	//  155  276:aload_0         
	//  156  277:getfield        #1016 <Field int arg_count>
	//  157  280:iconst_1        
	//  158  281:iadd            
	//  159  282:putfield        #1016 <Field int arg_count>
						continue;
	//  160  285:goto            37
					}
					if(word0 != 30)
						break label1;
	//  161  288:iload_1         
	//  162  289:bipush          30
	//  163  291:icmpne          563
					stringbuilder = new StringBuilder("");
	//  164  294:new             #1060 <Class StringBuilder>
	//  165  297:dup             
	//  166  298:ldc2            #1055 <String "">
	//  167  301:invokespecial   #1250 <Method void StringBuilder(String)>
	//  168  304:astore          7
					word0 = 0;
	//  169  306:iconst_0        
	//  170  307:istore_1        
					char c1 = '\0';
	//  171  308:iconst_0        
	//  172  309:istore          6
					byte byte0 = 0;
	//  173  311:iconst_0        
	//  174  312:istore_3        
					int j = 0;
	//  175  313:iconst_0        
	//  176  314:istore_2        
					do
					{
						if(word0 != 0)
							break label2;
	//  177  315:iload_1         
	//  178  316:ifne            536
						byte byte1 = byte0;
	//  179  319:iload_3         
	//  180  320:istore          4
						if(byte0 == 0)
	//* 181  322:iload_3         
	//* 182  323:ifne            335
						{
							c1 = getCard8();
	//  183  326:aload_0         
	//  184  327:invokevirtual   #1026 <Method char getCard8()>
	//  185  330:istore          6
							byte1 = 2;
	//  186  332:iconst_2        
	//  187  333:istore          4
						}
						byte0 = byte1;
	//  188  335:iload           4
	//  189  337:istore_3        
						if(byte1 == 1)
	//* 190  338:iload           4
	//* 191  340:iconst_1        
	//* 192  341:icmpne          356
						{
							j = c1 / 16;
	//  193  344:iload           6
	//  194  346:bipush          16
	//  195  348:idiv            
	//  196  349:istore_2        
							byte0 = (byte)(byte1 - 1);
	//  197  350:iload           4
	//  198  352:iconst_1        
	//  199  353:isub            
	//  200  354:int2byte        
	//  201  355:istore_3        
						}
						byte1 = byte0;
	//  202  356:iload_3         
	//  203  357:istore          4
						if(byte0 == 2)
	//* 204  359:iload_3         
	//* 205  360:iconst_2        
	//* 206  361:icmpne          376
						{
							j = c1 % 16;
	//  207  364:iload           6
	//  208  366:bipush          16
	//  209  368:irem            
	//  210  369:istore_2        
							byte1 = (byte)(byte0 - 1);
	//  211  370:iload_3         
	//  212  371:iconst_1        
	//  213  372:isub            
	//  214  373:int2byte        
	//  215  374:istore          4
						}
						switch(j)
	//* 216  376:iload_2         
						{
	//* 217  377:tableswitch     10 15: default 416
	//	               10 442
	//	               11 457
	//	               12 472
	//	               13 416
	//	               14 487
	//	               15 502
						case 13: // '\r'
						default:
							if(j >= 0 && j <= 9)
	//* 218  416:iload_2         
	//* 219  417:iflt            510
	//* 220  420:iload_2         
	//* 221  421:bipush          9
	//* 222  423:icmpgt          510
							{
								stringbuilder.append(String.valueOf(j));
	//  223  426:aload           7
	//  224  428:iload_2         
	//  225  429:invokestatic    #1253 <Method String String.valueOf(int)>
	//  226  432:invokevirtual   #1065 <Method StringBuilder StringBuilder.append(String)>
	//  227  435:pop             
								byte0 = byte1;
	//  228  436:iload           4
	//  229  438:istore_3        
							} else
	//* 230  439:goto            315
	//* 231  442:aload           7
	//* 232  444:ldc2            #1255 <String ".">
	//* 233  447:invokevirtual   #1065 <Method StringBuilder StringBuilder.append(String)>
	//* 234  450:pop             
	//* 235  451:iload           4
	//* 236  453:istore_3        
	//* 237  454:goto            315
	//* 238  457:aload           7
	//* 239  459:ldc2            #302 <String "E">
	//* 240  462:invokevirtual   #1065 <Method StringBuilder StringBuilder.append(String)>
	//* 241  465:pop             
	//* 242  466:iload           4
	//* 243  468:istore_3        
	//* 244  469:goto            315
	//* 245  472:aload           7
	//* 246  474:ldc2            #1257 <String "E-">
	//* 247  477:invokevirtual   #1065 <Method StringBuilder StringBuilder.append(String)>
	//* 248  480:pop             
	//* 249  481:iload           4
	//* 250  483:istore_3        
	//* 251  484:goto            315
	//* 252  487:aload           7
	//* 253  489:ldc2            #1259 <String "-">
	//* 254  492:invokevirtual   #1065 <Method StringBuilder StringBuilder.append(String)>
	//* 255  495:pop             
	//* 256  496:iload           4
	//* 257  498:istore_3        
	//* 258  499:goto            315
	//* 259  502:iconst_1        
	//* 260  503:istore_1        
	//* 261  504:iload           4
	//* 262  506:istore_3        
	//* 263  507:goto            315
							{
								stringbuilder.append("<NIBBLE ERROR: ").append(j).append('>');
	//  264  510:aload           7
	//  265  512:ldc2            #1261 <String "<NIBBLE ERROR: ">
	//  266  515:invokevirtual   #1065 <Method StringBuilder StringBuilder.append(String)>
	//  267  518:iload_2         
	//  268  519:invokevirtual   #1264 <Method StringBuilder StringBuilder.append(int)>
	//  269  522:bipush          62
	//  270  524:invokevirtual   #1068 <Method StringBuilder StringBuilder.append(char)>
	//  271  527:pop             
								word0 = 1;
	//  272  528:iconst_1        
	//  273  529:istore_1        
								byte0 = byte1;
	//  274  530:iload           4
	//  275  532:istore_3        
							}
							break;

						case 10: // '\n'
							stringbuilder.append(".");
							byte0 = byte1;
							break;

						case 11: // '\013'
							stringbuilder.append("E");
							byte0 = byte1;
							break;

						case 12: // '\f'
							stringbuilder.append("E-");
							byte0 = byte1;
							break;

						case 14: // '\016'
							stringbuilder.append("-");
							byte0 = byte1;
							break;

						case 15: // '\017'
							word0 = 1;
							byte0 = byte1;
							break;
						}
					} while(true);
				}
	//* 276  533:goto            315
				args[arg_count] = ((Object) (stringbuilder.toString()));
	//  277  536:aload_0         
	//  278  537:getfield        #1014 <Field Object[] args>
	//  279  540:aload_0         
	//  280  541:getfield        #1016 <Field int arg_count>
	//  281  544:aload           7
	//  282  546:invokevirtual   #1072 <Method String StringBuilder.toString()>
	//  283  549:aastore         
				arg_count = arg_count + 1;
	//  284  550:aload_0         
	//  285  551:aload_0         
	//  286  552:getfield        #1016 <Field int arg_count>
	//  287  555:iconst_1        
	//  288  556:iadd            
	//  289  557:putfield        #1016 <Field int arg_count>
				continue;
	//  290  560:goto            37
			}
			if(word0 <= 21)
	//* 291  563:iload_1         
	//* 292  564:bipush          21
	//* 293  566:icmpgt          37
			{
				flag = true;
	//  294  569:iconst_1        
	//  295  570:istore          5
				if(word0 != 12)
	//* 296  572:iload_1         
	//* 297  573:bipush          12
	//* 298  575:icmpeq          590
					key = operatorNames[word0];
	//  299  578:aload_0         
	//  300  579:getstatic       #224 <Field String[] operatorNames>
	//  301  582:iload_1         
	//  302  583:aaload          
	//  303  584:putfield        #1081 <Field String key>
				else
	//* 304  587:goto            37
					key = operatorNames[getCard8() + 32];
	//  305  590:aload_0         
	//  306  591:getstatic       #224 <Field String[] operatorNames>
	//  307  594:aload_0         
	//  308  595:invokevirtual   #1026 <Method char getCard8()>
	//  309  598:bipush          32
	//  310  600:iadd            
	//  311  601:aaload          
	//  312  602:putfield        #1081 <Field String key>
			}
		} while(true);
	//  313  605:goto            37
	//  314  608:return          
	}

	protected RangeItem getEntireIndexRange(int i)
	{
		seek(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #1022 <Method void seek(int)>
		char c = getCard16();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #1152 <Method char getCard16()>
	//    5    9:istore_2        
		if(c == 0)
	//*   6   10:iload_2         
	//*   7   11:ifne            28
		{
			return new RangeItem(buf, i, 2);
	//    8   14:new             #33  <Class CFFFont$RangeItem>
	//    9   17:dup             
	//   10   18:aload_0         
	//   11   19:getfield        #1018 <Field RandomAccessFileOrArray buf>
	//   12   22:iload_1         
	//   13   23:iconst_2        
	//   14   24:invokespecial   #1145 <Method void CFFFont$RangeItem(RandomAccessFileOrArray, int, int)>
	//   15   27:areturn         
		} else
		{
			char c1 = getCard8();
	//   16   28:aload_0         
	//   17   29:invokevirtual   #1026 <Method char getCard8()>
	//   18   32:istore_3        
			seek(i + 2 + 1 + c * c1);
	//   19   33:aload_0         
	//   20   34:iload_1         
	//   21   35:iconst_2        
	//   22   36:iadd            
	//   23   37:iconst_1        
	//   24   38:iadd            
	//   25   39:iload_2         
	//   26   40:iload_3         
	//   27   41:imul            
	//   28   42:iadd            
	//   29   43:invokevirtual   #1022 <Method void seek(int)>
			int j = getOffset(((int) (c1)));
	//   30   46:aload_0         
	//   31   47:iload_3         
	//   32   48:invokevirtual   #1268 <Method int getOffset(int)>
	//   33   51:istore          4
			return new RangeItem(buf, i, (c + 1) * c1 + 3 + (j - 1));
	//   34   53:new             #33  <Class CFFFont$RangeItem>
	//   35   56:dup             
	//   36   57:aload_0         
	//   37   58:getfield        #1018 <Field RandomAccessFileOrArray buf>
	//   38   61:iload_1         
	//   39   62:iload_2         
	//   40   63:iconst_1        
	//   41   64:iadd            
	//   42   65:iload_3         
	//   43   66:imul            
	//   44   67:iconst_3        
	//   45   68:iadd            
	//   46   69:iload           4
	//   47   71:iconst_1        
	//   48   72:isub            
	//   49   73:iadd            
	//   50   74:invokespecial   #1145 <Method void CFFFont$RangeItem(RandomAccessFileOrArray, int, int)>
	//   51   77:areturn         
		}
	}

	int[] getIndex(int i)
	{
		seek(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #1022 <Method void seek(int)>
		char c = getCard16();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #1152 <Method char getCard16()>
	//    5    9:istore_3        
		int ai[] = new int[c + 1];
	//    6   10:iload_3         
	//    7   11:iconst_1        
	//    8   12:iadd            
	//    9   13:newarray        int[]
	//   10   15:astore          5
		if(c == 0)
	//*  11   17:iload_3         
	//*  12   18:ifne            29
		{
			ai[0] = -1;
	//   13   21:aload           5
	//   14   23:iconst_0        
	//   15   24:iconst_m1       
	//   16   25:iastore         
		} else
	//*  17   26:aload           5
	//*  18   28:areturn         
		{
			char c1 = getCard8();
	//   19   29:aload_0         
	//   20   30:invokevirtual   #1026 <Method char getCard8()>
	//   21   33:istore          4
			int j = 0;
	//   22   35:iconst_0        
	//   23   36:istore_2        
			while(j <= c) 
	//*  24   37:iload_2         
	//*  25   38:iload_3         
	//*  26   39:icmpgt          26
			{
				ai[j] = ((i + 2 + 1 + (c + 1) * c1) - 1) + getOffset(((int) (c1)));
	//   27   42:aload           5
	//   28   44:iload_2         
	//   29   45:iload_1         
	//   30   46:iconst_2        
	//   31   47:iadd            
	//   32   48:iconst_1        
	//   33   49:iadd            
	//   34   50:iload_3         
	//   35   51:iconst_1        
	//   36   52:iadd            
	//   37   53:iload           4
	//   38   55:imul            
	//   39   56:iadd            
	//   40   57:iconst_1        
	//   41   58:isub            
	//   42   59:aload_0         
	//   43   60:iload           4
	//   44   62:invokevirtual   #1268 <Method int getOffset(int)>
	//   45   65:iadd            
	//   46   66:iastore         
				j++;
	//   47   67:iload_2         
	//   48   68:iconst_1        
	//   49   69:iadd            
	//   50   70:istore_2        
			}
		}
		return ai;
	//*  51   71:goto            37
	}

	int getInt()
	{
		int i;
		try
		{
			i = buf.readInt();
	//    0    0:aload_0         
	//    1    1:getfield        #1018 <Field RandomAccessFileOrArray buf>
	//    2    4:invokevirtual   #1271 <Method int RandomAccessFileOrArray.readInt()>
	//    3    7:istore_1        
		}
	//*   4    8:iload_1         
	//*   5    9:ireturn         
		catch(Exception exception)
	//*   6   10:astore_2        
		{
			throw new ExceptionConverter(exception);
	//    7   11:new             #1231 <Class ExceptionConverter>
	//    8   14:dup             
	//    9   15:aload_2         
	//   10   16:invokespecial   #1234 <Method void ExceptionConverter(Exception)>
	//   11   19:athrow          
		}
		return i;
	}

	public String[] getNames()
	{
		String as[] = new String[fonts.length];
	//    0    0:aload_0         
	//    1    1:getfield        #1050 <Field CFFFont$Font[] fonts>
	//    2    4:arraylength     
	//    3    5:anewarray       String[]
	//    4    8:astore_2        
		for(int i = 0; i < fonts.length; i++)
	//*   5    9:iconst_0        
	//*   6   10:istore_1        
	//*   7   11:iload_1         
	//*   8   12:aload_0         
	//*   9   13:getfield        #1050 <Field CFFFont$Font[] fonts>
	//*  10   16:arraylength     
	//*  11   17:icmpge          39
			as[i] = fonts[i].name;
	//   12   20:aload_2         
	//   13   21:iload_1         
	//   14   22:aload_0         
	//   15   23:getfield        #1050 <Field CFFFont$Font[] fonts>
	//   16   26:iload_1         
	//   17   27:aaload          
	//   18   28:getfield        #1058 <Field String CFFFont$Font.name>
	//   19   31:aastore         

	//   20   32:iload_1         
	//   21   33:iconst_1        
	//   22   34:iadd            
	//   23   35:istore_1        
	//*  24   36:goto            11
		return as;
	//   25   39:aload_2         
	//   26   40:areturn         
	}

	int getOffset(int i)
	{
		int k = 0;
	//    0    0:iconst_0        
	//    1    1:istore_3        
		for(int j = 0; j < i; j++)
	//*   2    2:iconst_0        
	//*   3    3:istore_2        
	//*   4    4:iload_2         
	//*   5    5:iload_1         
	//*   6    6:icmpge          27
			k = k * 256 + getCard8();
	//    7    9:iload_3         
	//    8   10:sipush          256
	//    9   13:imul            
	//   10   14:aload_0         
	//   11   15:invokevirtual   #1026 <Method char getCard8()>
	//   12   18:iadd            
	//   13   19:istore_3        

	//   14   20:iload_2         
	//   15   21:iconst_1        
	//   16   22:iadd            
	//   17   23:istore_2        
	//*  18   24:goto            4
		return k;
	//   19   27:iload_3         
	//   20   28:ireturn         
	}

	int getPosition()
	{
		long l;
		try
		{
			l = buf.getFilePointer();
	//    0    0:aload_0         
	//    1    1:getfield        #1018 <Field RandomAccessFileOrArray buf>
	//    2    4:invokevirtual   #1277 <Method long RandomAccessFileOrArray.getFilePointer()>
	//    3    7:lstore_1        
		}
	//*   4    8:lload_1         
	//*   5    9:l2i             
	//*   6   10:ireturn         
		catch(Exception exception)
	//*   7   11:astore_3        
		{
			throw new ExceptionConverter(exception);
	//    8   12:new             #1231 <Class ExceptionConverter>
	//    9   15:dup             
	//   10   16:aload_3         
	//   11   17:invokespecial   #1234 <Method void ExceptionConverter(Exception)>
	//   12   20:athrow          
		}
		return (int)l;
	}

	short getShort()
	{
		short word0;
		try
		{
			word0 = buf.readShort();
	//    0    0:aload_0         
	//    1    1:getfield        #1018 <Field RandomAccessFileOrArray buf>
	//    2    4:invokevirtual   #1280 <Method short RandomAccessFileOrArray.readShort()>
	//    3    7:istore_1        
		}
	//*   4    8:iload_1         
	//*   5    9:ireturn         
		catch(Exception exception)
	//*   6   10:astore_2        
		{
			throw new ExceptionConverter(exception);
	//    7   11:new             #1231 <Class ExceptionConverter>
	//    8   14:dup             
	//    9   15:aload_2         
	//   10   16:invokespecial   #1234 <Method void ExceptionConverter(Exception)>
	//   11   19:athrow          
		}
		return word0;
	}

	public String getString(char c)
	{
		if(c < standardStrings.length)
	//*   0    0:iload_1         
	//*   1    1:getstatic       #1007 <Field String[] standardStrings>
	//*   2    4:arraylength     
	//*   3    5:icmpge          14
			return standardStrings[c];
	//    4    8:getstatic       #1007 <Field String[] standardStrings>
	//    5   11:iload_1         
	//    6   12:aaload          
	//    7   13:areturn         
		if(c >= (standardStrings.length + stringOffsets.length) - 1)
	//*   8   14:iload_1         
	//*   9   15:getstatic       #1007 <Field String[] standardStrings>
	//*  10   18:arraylength     
	//*  11   19:aload_0         
	//*  12   20:getfield        #1044 <Field int[] stringOffsets>
	//*  13   23:arraylength     
	//*  14   24:iadd            
	//*  15   25:iconst_1        
	//*  16   26:isub            
	//*  17   27:icmplt          32
			return null;
	//   18   30:aconst_null     
	//   19   31:areturn         
		int i = c - standardStrings.length;
	//   20   32:iload_1         
	//   21   33:getstatic       #1007 <Field String[] standardStrings>
	//   22   36:arraylength     
	//   23   37:isub            
	//   24   38:istore_2        
		int j = getPosition();
	//   25   39:aload_0         
	//   26   40:invokevirtual   #1076 <Method int getPosition()>
	//   27   43:istore_3        
		seek(stringOffsets[i]);
	//   28   44:aload_0         
	//   29   45:aload_0         
	//   30   46:getfield        #1044 <Field int[] stringOffsets>
	//   31   49:iload_2         
	//   32   50:iaload          
	//   33   51:invokevirtual   #1022 <Method void seek(int)>
		StringBuffer stringbuffer = new StringBuffer();
	//   34   54:new             #1282 <Class StringBuffer>
	//   35   57:dup             
	//   36   58:invokespecial   #1283 <Method void StringBuffer()>
	//   37   61:astore          4
		for(c = ((char) (stringOffsets[i])); c < stringOffsets[i + 1]; c++)
	//*  38   63:aload_0         
	//*  39   64:getfield        #1044 <Field int[] stringOffsets>
	//*  40   67:iload_2         
	//*  41   68:iaload          
	//*  42   69:istore_1        
	//*  43   70:iload_1         
	//*  44   71:aload_0         
	//*  45   72:getfield        #1044 <Field int[] stringOffsets>
	//*  46   75:iload_2         
	//*  47   76:iconst_1        
	//*  48   77:iadd            
	//*  49   78:iaload          
	//*  50   79:icmpge          99
			stringbuffer.append(getCard8());
	//   51   82:aload           4
	//   52   84:aload_0         
	//   53   85:invokevirtual   #1026 <Method char getCard8()>
	//   54   88:invokevirtual   #1286 <Method StringBuffer StringBuffer.append(char)>
	//   55   91:pop             

	//   56   92:iload_1         
	//   57   93:iconst_1        
	//   58   94:iadd            
	//   59   95:istore_1        
	//*  60   96:goto            70
		seek(j);
	//   61   99:aload_0         
	//   62  100:iload_3         
	//   63  101:invokevirtual   #1022 <Method void seek(int)>
		return stringbuffer.toString();
	//   64  104:aload           4
	//   65  106:invokevirtual   #1287 <Method String StringBuffer.toString()>
	//   66  109:areturn         
	}

	public boolean isCID(String s)
	{
		for(int i = 0; i < fonts.length; i++)
	//*   0    0:iconst_0        
	//*   1    1:istore_2        
	//*   2    2:iload_2         
	//*   3    3:aload_0         
	//*   4    4:getfield        #1050 <Field CFFFont$Font[] fonts>
	//*   5    7:arraylength     
	//*   6    8:icmpge          44
			if(s.equals(((Object) (fonts[i].name))))
	//*   7   11:aload_1         
	//*   8   12:aload_0         
	//*   9   13:getfield        #1050 <Field CFFFont$Font[] fonts>
	//*  10   16:iload_2         
	//*  11   17:aaload          
	//*  12   18:getfield        #1058 <Field String CFFFont$Font.name>
	//*  13   21:invokevirtual   #1135 <Method boolean String.equals(Object)>
	//*  14   24:ifeq            37
				return fonts[i].isCID;
	//   15   27:aload_0         
	//   16   28:getfield        #1050 <Field CFFFont$Font[] fonts>
	//   17   31:iload_2         
	//   18   32:aaload          
	//   19   33:getfield        #1096 <Field boolean CFFFont$Font.isCID>
	//   20   36:ireturn         

	//   21   37:iload_2         
	//   22   38:iconst_1        
	//   23   39:iadd            
	//   24   40:istore_2        
	//*  25   41:goto            2
		return false;
	//   26   44:iconst_0        
	//   27   45:ireturn         
	}

	void seek(int i)
	{
		try
		{
			buf.seek(i);
	//    0    0:aload_0         
	//    1    1:getfield        #1018 <Field RandomAccessFileOrArray buf>
	//    2    4:iload_1         
	//    3    5:i2l             
	//    4    6:invokevirtual   #1290 <Method void RandomAccessFileOrArray.seek(long)>
			return;
	//    5    9:return          
		}
		catch(Exception exception)
	//*   6   10:astore_2        
		{
			throw new ExceptionConverter(exception);
	//    7   11:new             #1231 <Class ExceptionConverter>
	//    8   14:dup             
	//    9   15:aload_2         
	//   10   16:invokespecial   #1234 <Method void ExceptionConverter(Exception)>
	//   11   19:athrow          
		}
	}

	static final String operatorNames[] = {
		"version", "Notice", "FullName", "FamilyName", "Weight", "FontBBox", "BlueValues", "OtherBlues", "FamilyBlues", "FamilyOtherBlues", 
		"StdHW", "StdVW", "UNKNOWN_12", "UniqueID", "XUID", "charset", "Encoding", "CharStrings", "Private", "Subrs", 
		"defaultWidthX", "nominalWidthX", "UNKNOWN_22", "UNKNOWN_23", "UNKNOWN_24", "UNKNOWN_25", "UNKNOWN_26", "UNKNOWN_27", "UNKNOWN_28", "UNKNOWN_29", 
		"UNKNOWN_30", "UNKNOWN_31", "Copyright", "isFixedPitch", "ItalicAngle", "UnderlinePosition", "UnderlineThickness", "PaintType", "CharstringType", "FontMatrix", 
		"StrokeWidth", "BlueScale", "BlueShift", "BlueFuzz", "StemSnapH", "StemSnapV", "ForceBold", "UNKNOWN_12_15", "UNKNOWN_12_16", "LanguageGroup", 
		"ExpansionFactor", "initialRandomSeed", "SyntheticBase", "PostScript", "BaseFontName", "BaseFontBlend", "UNKNOWN_12_24", "UNKNOWN_12_25", "UNKNOWN_12_26", "UNKNOWN_12_27", 
		"UNKNOWN_12_28", "UNKNOWN_12_29", "ROS", "CIDFontVersion", "CIDFontRevision", "CIDFontType", "CIDCount", "UIDBase", "FDArray", "FDSelect", 
		"FontName"
	};
	static final String standardStrings[] = {
		".notdef", "space", "exclam", "quotedbl", "numbersign", "dollar", "percent", "ampersand", "quoteright", "parenleft", 
		"parenright", "asterisk", "plus", "comma", "hyphen", "period", "slash", "zero", "one", "two", 
		"three", "four", "five", "six", "seven", "eight", "nine", "colon", "semicolon", "less", 
		"equal", "greater", "question", "at", "A", "B", "C", "D", "E", "F", 
		"G", "H", "I", "J", "K", "L", "M", "N", "O", "P", 
		"Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", 
		"bracketleft", "backslash", "bracketright", "asciicircum", "underscore", "quoteleft", "a", "b", "c", "d", 
		"e", "f", "g", "h", "i", "j", "k", "l", "m", "n", 
		"o", "p", "q", "r", "s", "t", "u", "v", "w", "x", 
		"y", "z", "braceleft", "bar", "braceright", "asciitilde", "exclamdown", "cent", "sterling", "fraction", 
		"yen", "florin", "section", "currency", "quotesingle", "quotedblleft", "guillemotleft", "guilsinglleft", "guilsinglright", "fi", 
		"fl", "endash", "dagger", "daggerdbl", "periodcentered", "paragraph", "bullet", "quotesinglbase", "quotedblbase", "quotedblright", 
		"guillemotright", "ellipsis", "perthousand", "questiondown", "grave", "acute", "circumflex", "tilde", "macron", "breve", 
		"dotaccent", "dieresis", "ring", "cedilla", "hungarumlaut", "ogonek", "caron", "emdash", "AE", "ordfeminine", 
		"Lslash", "Oslash", "OE", "ordmasculine", "ae", "dotlessi", "lslash", "oslash", "oe", "germandbls", 
		"onesuperior", "logicalnot", "mu", "trademark", "Eth", "onehalf", "plusminus", "Thorn", "onequarter", "divide", 
		"brokenbar", "degree", "thorn", "threequarters", "twosuperior", "registered", "minus", "eth", "multiply", "threesuperior", 
		"copyright", "Aacute", "Acircumflex", "Adieresis", "Agrave", "Aring", "Atilde", "Ccedilla", "Eacute", "Ecircumflex", 
		"Edieresis", "Egrave", "Iacute", "Icircumflex", "Idieresis", "Igrave", "Ntilde", "Oacute", "Ocircumflex", "Odieresis", 
		"Ograve", "Otilde", "Scaron", "Uacute", "Ucircumflex", "Udieresis", "Ugrave", "Yacute", "Ydieresis", "Zcaron", 
		"aacute", "acircumflex", "adieresis", "agrave", "aring", "atilde", "ccedilla", "eacute", "ecircumflex", "edieresis", 
		"egrave", "iacute", "icircumflex", "idieresis", "igrave", "ntilde", "oacute", "ocircumflex", "odieresis", "ograve", 
		"otilde", "scaron", "uacute", "ucircumflex", "udieresis", "ugrave", "yacute", "ydieresis", "zcaron", "exclamsmall", 
		"Hungarumlautsmall", "dollaroldstyle", "dollarsuperior", "ampersandsmall", "Acutesmall", "parenleftsuperior", "parenrightsuperior", "twodotenleader", "onedotenleader", "zerooldstyle", 
		"oneoldstyle", "twooldstyle", "threeoldstyle", "fouroldstyle", "fiveoldstyle", "sixoldstyle", "sevenoldstyle", "eightoldstyle", "nineoldstyle", "commasuperior", 
		"threequartersemdash", "periodsuperior", "questionsmall", "asuperior", "bsuperior", "centsuperior", "dsuperior", "esuperior", "isuperior", "lsuperior", 
		"msuperior", "nsuperior", "osuperior", "rsuperior", "ssuperior", "tsuperior", "ff", "ffi", "ffl", "parenleftinferior", 
		"parenrightinferior", "Circumflexsmall", "hyphensuperior", "Gravesmall", "Asmall", "Bsmall", "Csmall", "Dsmall", "Esmall", "Fsmall", 
		"Gsmall", "Hsmall", "Ismall", "Jsmall", "Ksmall", "Lsmall", "Msmall", "Nsmall", "Osmall", "Psmall", 
		"Qsmall", "Rsmall", "Ssmall", "Tsmall", "Usmall", "Vsmall", "Wsmall", "Xsmall", "Ysmall", "Zsmall", 
		"colonmonetary", "onefitted", "rupiah", "Tildesmall", "exclamdownsmall", "centoldstyle", "Lslashsmall", "Scaronsmall", "Zcaronsmall", "Dieresissmall", 
		"Brevesmall", "Caronsmall", "Dotaccentsmall", "Macronsmall", "figuredash", "hypheninferior", "Ogoneksmall", "Ringsmall", "Cedillasmall", "questiondownsmall", 
		"oneeighth", "threeeighths", "fiveeighths", "seveneighths", "onethird", "twothirds", "zerosuperior", "foursuperior", "fivesuperior", "sixsuperior", 
		"sevensuperior", "eightsuperior", "ninesuperior", "zeroinferior", "oneinferior", "twoinferior", "threeinferior", "fourinferior", "fiveinferior", "sixinferior", 
		"seveninferior", "eightinferior", "nineinferior", "centinferior", "dollarinferior", "periodinferior", "commainferior", "Agravesmall", "Aacutesmall", "Acircumflexsmall", 
		"Atildesmall", "Adieresissmall", "Aringsmall", "AEsmall", "Ccedillasmall", "Egravesmall", "Eacutesmall", "Ecircumflexsmall", "Edieresissmall", "Igravesmall", 
		"Iacutesmall", "Icircumflexsmall", "Idieresissmall", "Ethsmall", "Ntildesmall", "Ogravesmall", "Oacutesmall", "Ocircumflexsmall", "Otildesmall", "Odieresissmall", 
		"OEsmall", "Oslashsmall", "Ugravesmall", "Uacutesmall", "Ucircumflexsmall", "Udieresissmall", "Yacutesmall", "Thornsmall", "Ydieresissmall", "001.000", 
		"001.001", "001.002", "001.003", "Black", "Bold", "Book", "Light", "Medium", "Regular", "Roman", 
		"Semibold"
	};
	protected int arg_count;
	protected Object args[];
	protected RandomAccessFileOrArray buf;
	protected Font fonts[];
	protected int gsubrIndexOffset;
	protected int gsubrOffsets[];
	protected String key;
	protected int nameIndexOffset;
	protected int nameOffsets[];
	int nextIndexOffset;
	private int offSize;
	protected int stringIndexOffset;
	protected int stringOffsets[];
	protected int topdictIndexOffset;
	protected int topdictOffsets[];

	static 
	{
	//    0    0:bipush          71
	//    1    2:anewarray       String[]
	//    2    5:dup             
	//    3    6:iconst_0        
	//    4    7:ldc1            #82  <String "version">
	//    5    9:aastore         
	//    6   10:dup             
	//    7   11:iconst_1        
	//    8   12:ldc1            #84  <String "Notice">
	//    9   14:aastore         
	//   10   15:dup             
	//   11   16:iconst_2        
	//   12   17:ldc1            #86  <String "FullName">
	//   13   19:aastore         
	//   14   20:dup             
	//   15   21:iconst_3        
	//   16   22:ldc1            #88  <String "FamilyName">
	//   17   24:aastore         
	//   18   25:dup             
	//   19   26:iconst_4        
	//   20   27:ldc1            #90  <String "Weight">
	//   21   29:aastore         
	//   22   30:dup             
	//   23   31:iconst_5        
	//   24   32:ldc1            #92  <String "FontBBox">
	//   25   34:aastore         
	//   26   35:dup             
	//   27   36:bipush          6
	//   28   38:ldc1            #94  <String "BlueValues">
	//   29   40:aastore         
	//   30   41:dup             
	//   31   42:bipush          7
	//   32   44:ldc1            #96  <String "OtherBlues">
	//   33   46:aastore         
	//   34   47:dup             
	//   35   48:bipush          8
	//   36   50:ldc1            #98  <String "FamilyBlues">
	//   37   52:aastore         
	//   38   53:dup             
	//   39   54:bipush          9
	//   40   56:ldc1            #100 <String "FamilyOtherBlues">
	//   41   58:aastore         
	//   42   59:dup             
	//   43   60:bipush          10
	//   44   62:ldc1            #102 <String "StdHW">
	//   45   64:aastore         
	//   46   65:dup             
	//   47   66:bipush          11
	//   48   68:ldc1            #104 <String "StdVW">
	//   49   70:aastore         
	//   50   71:dup             
	//   51   72:bipush          12
	//   52   74:ldc1            #106 <String "UNKNOWN_12">
	//   53   76:aastore         
	//   54   77:dup             
	//   55   78:bipush          13
	//   56   80:ldc1            #108 <String "UniqueID">
	//   57   82:aastore         
	//   58   83:dup             
	//   59   84:bipush          14
	//   60   86:ldc1            #110 <String "XUID">
	//   61   88:aastore         
	//   62   89:dup             
	//   63   90:bipush          15
	//   64   92:ldc1            #112 <String "charset">
	//   65   94:aastore         
	//   66   95:dup             
	//   67   96:bipush          16
	//   68   98:ldc1            #114 <String "Encoding">
	//   69  100:aastore         
	//   70  101:dup             
	//   71  102:bipush          17
	//   72  104:ldc1            #116 <String "CharStrings">
	//   73  106:aastore         
	//   74  107:dup             
	//   75  108:bipush          18
	//   76  110:ldc1            #118 <String "Private">
	//   77  112:aastore         
	//   78  113:dup             
	//   79  114:bipush          19
	//   80  116:ldc1            #120 <String "Subrs">
	//   81  118:aastore         
	//   82  119:dup             
	//   83  120:bipush          20
	//   84  122:ldc1            #122 <String "defaultWidthX">
	//   85  124:aastore         
	//   86  125:dup             
	//   87  126:bipush          21
	//   88  128:ldc1            #124 <String "nominalWidthX">
	//   89  130:aastore         
	//   90  131:dup             
	//   91  132:bipush          22
	//   92  134:ldc1            #126 <String "UNKNOWN_22">
	//   93  136:aastore         
	//   94  137:dup             
	//   95  138:bipush          23
	//   96  140:ldc1            #128 <String "UNKNOWN_23">
	//   97  142:aastore         
	//   98  143:dup             
	//   99  144:bipush          24
	//  100  146:ldc1            #130 <String "UNKNOWN_24">
	//  101  148:aastore         
	//  102  149:dup             
	//  103  150:bipush          25
	//  104  152:ldc1            #132 <String "UNKNOWN_25">
	//  105  154:aastore         
	//  106  155:dup             
	//  107  156:bipush          26
	//  108  158:ldc1            #134 <String "UNKNOWN_26">
	//  109  160:aastore         
	//  110  161:dup             
	//  111  162:bipush          27
	//  112  164:ldc1            #136 <String "UNKNOWN_27">
	//  113  166:aastore         
	//  114  167:dup             
	//  115  168:bipush          28
	//  116  170:ldc1            #138 <String "UNKNOWN_28">
	//  117  172:aastore         
	//  118  173:dup             
	//  119  174:bipush          29
	//  120  176:ldc1            #140 <String "UNKNOWN_29">
	//  121  178:aastore         
	//  122  179:dup             
	//  123  180:bipush          30
	//  124  182:ldc1            #142 <String "UNKNOWN_30">
	//  125  184:aastore         
	//  126  185:dup             
	//  127  186:bipush          31
	//  128  188:ldc1            #144 <String "UNKNOWN_31">
	//  129  190:aastore         
	//  130  191:dup             
	//  131  192:bipush          32
	//  132  194:ldc1            #146 <String "Copyright">
	//  133  196:aastore         
	//  134  197:dup             
	//  135  198:bipush          33
	//  136  200:ldc1            #148 <String "isFixedPitch">
	//  137  202:aastore         
	//  138  203:dup             
	//  139  204:bipush          34
	//  140  206:ldc1            #150 <String "ItalicAngle">
	//  141  208:aastore         
	//  142  209:dup             
	//  143  210:bipush          35
	//  144  212:ldc1            #152 <String "UnderlinePosition">
	//  145  214:aastore         
	//  146  215:dup             
	//  147  216:bipush          36
	//  148  218:ldc1            #154 <String "UnderlineThickness">
	//  149  220:aastore         
	//  150  221:dup             
	//  151  222:bipush          37
	//  152  224:ldc1            #156 <String "PaintType">
	//  153  226:aastore         
	//  154  227:dup             
	//  155  228:bipush          38
	//  156  230:ldc1            #158 <String "CharstringType">
	//  157  232:aastore         
	//  158  233:dup             
	//  159  234:bipush          39
	//  160  236:ldc1            #160 <String "FontMatrix">
	//  161  238:aastore         
	//  162  239:dup             
	//  163  240:bipush          40
	//  164  242:ldc1            #162 <String "StrokeWidth">
	//  165  244:aastore         
	//  166  245:dup             
	//  167  246:bipush          41
	//  168  248:ldc1            #164 <String "BlueScale">
	//  169  250:aastore         
	//  170  251:dup             
	//  171  252:bipush          42
	//  172  254:ldc1            #166 <String "BlueShift">
	//  173  256:aastore         
	//  174  257:dup             
	//  175  258:bipush          43
	//  176  260:ldc1            #168 <String "BlueFuzz">
	//  177  262:aastore         
	//  178  263:dup             
	//  179  264:bipush          44
	//  180  266:ldc1            #170 <String "StemSnapH">
	//  181  268:aastore         
	//  182  269:dup             
	//  183  270:bipush          45
	//  184  272:ldc1            #172 <String "StemSnapV">
	//  185  274:aastore         
	//  186  275:dup             
	//  187  276:bipush          46
	//  188  278:ldc1            #174 <String "ForceBold">
	//  189  280:aastore         
	//  190  281:dup             
	//  191  282:bipush          47
	//  192  284:ldc1            #176 <String "UNKNOWN_12_15">
	//  193  286:aastore         
	//  194  287:dup             
	//  195  288:bipush          48
	//  196  290:ldc1            #178 <String "UNKNOWN_12_16">
	//  197  292:aastore         
	//  198  293:dup             
	//  199  294:bipush          49
	//  200  296:ldc1            #180 <String "LanguageGroup">
	//  201  298:aastore         
	//  202  299:dup             
	//  203  300:bipush          50
	//  204  302:ldc1            #182 <String "ExpansionFactor">
	//  205  304:aastore         
	//  206  305:dup             
	//  207  306:bipush          51
	//  208  308:ldc1            #184 <String "initialRandomSeed">
	//  209  310:aastore         
	//  210  311:dup             
	//  211  312:bipush          52
	//  212  314:ldc1            #186 <String "SyntheticBase">
	//  213  316:aastore         
	//  214  317:dup             
	//  215  318:bipush          53
	//  216  320:ldc1            #188 <String "PostScript">
	//  217  322:aastore         
	//  218  323:dup             
	//  219  324:bipush          54
	//  220  326:ldc1            #190 <String "BaseFontName">
	//  221  328:aastore         
	//  222  329:dup             
	//  223  330:bipush          55
	//  224  332:ldc1            #192 <String "BaseFontBlend">
	//  225  334:aastore         
	//  226  335:dup             
	//  227  336:bipush          56
	//  228  338:ldc1            #194 <String "UNKNOWN_12_24">
	//  229  340:aastore         
	//  230  341:dup             
	//  231  342:bipush          57
	//  232  344:ldc1            #196 <String "UNKNOWN_12_25">
	//  233  346:aastore         
	//  234  347:dup             
	//  235  348:bipush          58
	//  236  350:ldc1            #198 <String "UNKNOWN_12_26">
	//  237  352:aastore         
	//  238  353:dup             
	//  239  354:bipush          59
	//  240  356:ldc1            #200 <String "UNKNOWN_12_27">
	//  241  358:aastore         
	//  242  359:dup             
	//  243  360:bipush          60
	//  244  362:ldc1            #202 <String "UNKNOWN_12_28">
	//  245  364:aastore         
	//  246  365:dup             
	//  247  366:bipush          61
	//  248  368:ldc1            #204 <String "UNKNOWN_12_29">
	//  249  370:aastore         
	//  250  371:dup             
	//  251  372:bipush          62
	//  252  374:ldc1            #206 <String "ROS">
	//  253  376:aastore         
	//  254  377:dup             
	//  255  378:bipush          63
	//  256  380:ldc1            #208 <String "CIDFontVersion">
	//  257  382:aastore         
	//  258  383:dup             
	//  259  384:bipush          64
	//  260  386:ldc1            #210 <String "CIDFontRevision">
	//  261  388:aastore         
	//  262  389:dup             
	//  263  390:bipush          65
	//  264  392:ldc1            #212 <String "CIDFontType">
	//  265  394:aastore         
	//  266  395:dup             
	//  267  396:bipush          66
	//  268  398:ldc1            #214 <String "CIDCount">
	//  269  400:aastore         
	//  270  401:dup             
	//  271  402:bipush          67
	//  272  404:ldc1            #216 <String "UIDBase">
	//  273  406:aastore         
	//  274  407:dup             
	//  275  408:bipush          68
	//  276  410:ldc1            #218 <String "FDArray">
	//  277  412:aastore         
	//  278  413:dup             
	//  279  414:bipush          69
	//  280  416:ldc1            #220 <String "FDSelect">
	//  281  418:aastore         
	//  282  419:dup             
	//  283  420:bipush          70
	//  284  422:ldc1            #222 <String "FontName">
	//  285  424:aastore         
	//  286  425:putstatic       #224 <Field String[] operatorNames>
	//  287  428:sipush          391
	//  288  431:anewarray       String[]
	//  289  434:dup             
	//  290  435:iconst_0        
	//  291  436:ldc1            #226 <String ".notdef">
	//  292  438:aastore         
	//  293  439:dup             
	//  294  440:iconst_1        
	//  295  441:ldc1            #228 <String "space">
	//  296  443:aastore         
	//  297  444:dup             
	//  298  445:iconst_2        
	//  299  446:ldc1            #230 <String "exclam">
	//  300  448:aastore         
	//  301  449:dup             
	//  302  450:iconst_3        
	//  303  451:ldc1            #232 <String "quotedbl">
	//  304  453:aastore         
	//  305  454:dup             
	//  306  455:iconst_4        
	//  307  456:ldc1            #234 <String "numbersign">
	//  308  458:aastore         
	//  309  459:dup             
	//  310  460:iconst_5        
	//  311  461:ldc1            #236 <String "dollar">
	//  312  463:aastore         
	//  313  464:dup             
	//  314  465:bipush          6
	//  315  467:ldc1            #238 <String "percent">
	//  316  469:aastore         
	//  317  470:dup             
	//  318  471:bipush          7
	//  319  473:ldc1            #240 <String "ampersand">
	//  320  475:aastore         
	//  321  476:dup             
	//  322  477:bipush          8
	//  323  479:ldc1            #242 <String "quoteright">
	//  324  481:aastore         
	//  325  482:dup             
	//  326  483:bipush          9
	//  327  485:ldc1            #244 <String "parenleft">
	//  328  487:aastore         
	//  329  488:dup             
	//  330  489:bipush          10
	//  331  491:ldc1            #246 <String "parenright">
	//  332  493:aastore         
	//  333  494:dup             
	//  334  495:bipush          11
	//  335  497:ldc1            #248 <String "asterisk">
	//  336  499:aastore         
	//  337  500:dup             
	//  338  501:bipush          12
	//  339  503:ldc1            #250 <String "plus">
	//  340  505:aastore         
	//  341  506:dup             
	//  342  507:bipush          13
	//  343  509:ldc1            #252 <String "comma">
	//  344  511:aastore         
	//  345  512:dup             
	//  346  513:bipush          14
	//  347  515:ldc1            #254 <String "hyphen">
	//  348  517:aastore         
	//  349  518:dup             
	//  350  519:bipush          15
	//  351  521:ldc2            #256 <String "period">
	//  352  524:aastore         
	//  353  525:dup             
	//  354  526:bipush          16
	//  355  528:ldc2            #258 <String "slash">
	//  356  531:aastore         
	//  357  532:dup             
	//  358  533:bipush          17
	//  359  535:ldc2            #260 <String "zero">
	//  360  538:aastore         
	//  361  539:dup             
	//  362  540:bipush          18
	//  363  542:ldc2            #262 <String "one">
	//  364  545:aastore         
	//  365  546:dup             
	//  366  547:bipush          19
	//  367  549:ldc2            #264 <String "two">
	//  368  552:aastore         
	//  369  553:dup             
	//  370  554:bipush          20
	//  371  556:ldc2            #266 <String "three">
	//  372  559:aastore         
	//  373  560:dup             
	//  374  561:bipush          21
	//  375  563:ldc2            #268 <String "four">
	//  376  566:aastore         
	//  377  567:dup             
	//  378  568:bipush          22
	//  379  570:ldc2            #270 <String "five">
	//  380  573:aastore         
	//  381  574:dup             
	//  382  575:bipush          23
	//  383  577:ldc2            #272 <String "six">
	//  384  580:aastore         
	//  385  581:dup             
	//  386  582:bipush          24
	//  387  584:ldc2            #274 <String "seven">
	//  388  587:aastore         
	//  389  588:dup             
	//  390  589:bipush          25
	//  391  591:ldc2            #276 <String "eight">
	//  392  594:aastore         
	//  393  595:dup             
	//  394  596:bipush          26
	//  395  598:ldc2            #278 <String "nine">
	//  396  601:aastore         
	//  397  602:dup             
	//  398  603:bipush          27
	//  399  605:ldc2            #280 <String "colon">
	//  400  608:aastore         
	//  401  609:dup             
	//  402  610:bipush          28
	//  403  612:ldc2            #282 <String "semicolon">
	//  404  615:aastore         
	//  405  616:dup             
	//  406  617:bipush          29
	//  407  619:ldc2            #284 <String "less">
	//  408  622:aastore         
	//  409  623:dup             
	//  410  624:bipush          30
	//  411  626:ldc2            #286 <String "equal">
	//  412  629:aastore         
	//  413  630:dup             
	//  414  631:bipush          31
	//  415  633:ldc2            #288 <String "greater">
	//  416  636:aastore         
	//  417  637:dup             
	//  418  638:bipush          32
	//  419  640:ldc2            #290 <String "question">
	//  420  643:aastore         
	//  421  644:dup             
	//  422  645:bipush          33
	//  423  647:ldc2            #292 <String "at">
	//  424  650:aastore         
	//  425  651:dup             
	//  426  652:bipush          34
	//  427  654:ldc2            #294 <String "A">
	//  428  657:aastore         
	//  429  658:dup             
	//  430  659:bipush          35
	//  431  661:ldc2            #296 <String "B">
	//  432  664:aastore         
	//  433  665:dup             
	//  434  666:bipush          36
	//  435  668:ldc2            #298 <String "C">
	//  436  671:aastore         
	//  437  672:dup             
	//  438  673:bipush          37
	//  439  675:ldc2            #300 <String "D">
	//  440  678:aastore         
	//  441  679:dup             
	//  442  680:bipush          38
	//  443  682:ldc2            #302 <String "E">
	//  444  685:aastore         
	//  445  686:dup             
	//  446  687:bipush          39
	//  447  689:ldc2            #304 <String "F">
	//  448  692:aastore         
	//  449  693:dup             
	//  450  694:bipush          40
	//  451  696:ldc2            #306 <String "G">
	//  452  699:aastore         
	//  453  700:dup             
	//  454  701:bipush          41
	//  455  703:ldc2            #308 <String "H">
	//  456  706:aastore         
	//  457  707:dup             
	//  458  708:bipush          42
	//  459  710:ldc2            #309 <String "I">
	//  460  713:aastore         
	//  461  714:dup             
	//  462  715:bipush          43
	//  463  717:ldc2            #311 <String "J">
	//  464  720:aastore         
	//  465  721:dup             
	//  466  722:bipush          44
	//  467  724:ldc2            #313 <String "K">
	//  468  727:aastore         
	//  469  728:dup             
	//  470  729:bipush          45
	//  471  731:ldc2            #315 <String "L">
	//  472  734:aastore         
	//  473  735:dup             
	//  474  736:bipush          46
	//  475  738:ldc2            #317 <String "M">
	//  476  741:aastore         
	//  477  742:dup             
	//  478  743:bipush          47
	//  479  745:ldc2            #319 <String "N">
	//  480  748:aastore         
	//  481  749:dup             
	//  482  750:bipush          48
	//  483  752:ldc2            #321 <String "O">
	//  484  755:aastore         
	//  485  756:dup             
	//  486  757:bipush          49
	//  487  759:ldc2            #323 <String "P">
	//  488  762:aastore         
	//  489  763:dup             
	//  490  764:bipush          50
	//  491  766:ldc2            #325 <String "Q">
	//  492  769:aastore         
	//  493  770:dup             
	//  494  771:bipush          51
	//  495  773:ldc2            #327 <String "R">
	//  496  776:aastore         
	//  497  777:dup             
	//  498  778:bipush          52
	//  499  780:ldc2            #329 <String "S">
	//  500  783:aastore         
	//  501  784:dup             
	//  502  785:bipush          53
	//  503  787:ldc2            #331 <String "T">
	//  504  790:aastore         
	//  505  791:dup             
	//  506  792:bipush          54
	//  507  794:ldc2            #333 <String "U">
	//  508  797:aastore         
	//  509  798:dup             
	//  510  799:bipush          55
	//  511  801:ldc2            #335 <String "V">
	//  512  804:aastore         
	//  513  805:dup             
	//  514  806:bipush          56
	//  515  808:ldc2            #337 <String "W">
	//  516  811:aastore         
	//  517  812:dup             
	//  518  813:bipush          57
	//  519  815:ldc2            #339 <String "X">
	//  520  818:aastore         
	//  521  819:dup             
	//  522  820:bipush          58
	//  523  822:ldc2            #341 <String "Y">
	//  524  825:aastore         
	//  525  826:dup             
	//  526  827:bipush          59
	//  527  829:ldc2            #343 <String "Z">
	//  528  832:aastore         
	//  529  833:dup             
	//  530  834:bipush          60
	//  531  836:ldc2            #345 <String "bracketleft">
	//  532  839:aastore         
	//  533  840:dup             
	//  534  841:bipush          61
	//  535  843:ldc2            #347 <String "backslash">
	//  536  846:aastore         
	//  537  847:dup             
	//  538  848:bipush          62
	//  539  850:ldc2            #349 <String "bracketright">
	//  540  853:aastore         
	//  541  854:dup             
	//  542  855:bipush          63
	//  543  857:ldc2            #351 <String "asciicircum">
	//  544  860:aastore         
	//  545  861:dup             
	//  546  862:bipush          64
	//  547  864:ldc2            #353 <String "underscore">
	//  548  867:aastore         
	//  549  868:dup             
	//  550  869:bipush          65
	//  551  871:ldc2            #355 <String "quoteleft">
	//  552  874:aastore         
	//  553  875:dup             
	//  554  876:bipush          66
	//  555  878:ldc2            #357 <String "a">
	//  556  881:aastore         
	//  557  882:dup             
	//  558  883:bipush          67
	//  559  885:ldc2            #359 <String "b">
	//  560  888:aastore         
	//  561  889:dup             
	//  562  890:bipush          68
	//  563  892:ldc2            #361 <String "c">
	//  564  895:aastore         
	//  565  896:dup             
	//  566  897:bipush          69
	//  567  899:ldc2            #363 <String "d">
	//  568  902:aastore         
	//  569  903:dup             
	//  570  904:bipush          70
	//  571  906:ldc2            #365 <String "e">
	//  572  909:aastore         
	//  573  910:dup             
	//  574  911:bipush          71
	//  575  913:ldc2            #367 <String "f">
	//  576  916:aastore         
	//  577  917:dup             
	//  578  918:bipush          72
	//  579  920:ldc2            #369 <String "g">
	//  580  923:aastore         
	//  581  924:dup             
	//  582  925:bipush          73
	//  583  927:ldc2            #371 <String "h">
	//  584  930:aastore         
	//  585  931:dup             
	//  586  932:bipush          74
	//  587  934:ldc2            #373 <String "i">
	//  588  937:aastore         
	//  589  938:dup             
	//  590  939:bipush          75
	//  591  941:ldc2            #375 <String "j">
	//  592  944:aastore         
	//  593  945:dup             
	//  594  946:bipush          76
	//  595  948:ldc2            #377 <String "k">
	//  596  951:aastore         
	//  597  952:dup             
	//  598  953:bipush          77
	//  599  955:ldc2            #379 <String "l">
	//  600  958:aastore         
	//  601  959:dup             
	//  602  960:bipush          78
	//  603  962:ldc2            #381 <String "m">
	//  604  965:aastore         
	//  605  966:dup             
	//  606  967:bipush          79
	//  607  969:ldc2            #383 <String "n">
	//  608  972:aastore         
	//  609  973:dup             
	//  610  974:bipush          80
	//  611  976:ldc2            #385 <String "o">
	//  612  979:aastore         
	//  613  980:dup             
	//  614  981:bipush          81
	//  615  983:ldc2            #387 <String "p">
	//  616  986:aastore         
	//  617  987:dup             
	//  618  988:bipush          82
	//  619  990:ldc2            #389 <String "q">
	//  620  993:aastore         
	//  621  994:dup             
	//  622  995:bipush          83
	//  623  997:ldc2            #391 <String "r">
	//  624 1000:aastore         
	//  625 1001:dup             
	//  626 1002:bipush          84
	//  627 1004:ldc2            #393 <String "s">
	//  628 1007:aastore         
	//  629 1008:dup             
	//  630 1009:bipush          85
	//  631 1011:ldc2            #395 <String "t">
	//  632 1014:aastore         
	//  633 1015:dup             
	//  634 1016:bipush          86
	//  635 1018:ldc2            #397 <String "u">
	//  636 1021:aastore         
	//  637 1022:dup             
	//  638 1023:bipush          87
	//  639 1025:ldc2            #399 <String "v">
	//  640 1028:aastore         
	//  641 1029:dup             
	//  642 1030:bipush          88
	//  643 1032:ldc2            #401 <String "w">
	//  644 1035:aastore         
	//  645 1036:dup             
	//  646 1037:bipush          89
	//  647 1039:ldc2            #403 <String "x">
	//  648 1042:aastore         
	//  649 1043:dup             
	//  650 1044:bipush          90
	//  651 1046:ldc2            #405 <String "y">
	//  652 1049:aastore         
	//  653 1050:dup             
	//  654 1051:bipush          91
	//  655 1053:ldc2            #407 <String "z">
	//  656 1056:aastore         
	//  657 1057:dup             
	//  658 1058:bipush          92
	//  659 1060:ldc2            #409 <String "braceleft">
	//  660 1063:aastore         
	//  661 1064:dup             
	//  662 1065:bipush          93
	//  663 1067:ldc2            #411 <String "bar">
	//  664 1070:aastore         
	//  665 1071:dup             
	//  666 1072:bipush          94
	//  667 1074:ldc2            #413 <String "braceright">
	//  668 1077:aastore         
	//  669 1078:dup             
	//  670 1079:bipush          95
	//  671 1081:ldc2            #415 <String "asciitilde">
	//  672 1084:aastore         
	//  673 1085:dup             
	//  674 1086:bipush          96
	//  675 1088:ldc2            #417 <String "exclamdown">
	//  676 1091:aastore         
	//  677 1092:dup             
	//  678 1093:bipush          97
	//  679 1095:ldc2            #419 <String "cent">
	//  680 1098:aastore         
	//  681 1099:dup             
	//  682 1100:bipush          98
	//  683 1102:ldc2            #421 <String "sterling">
	//  684 1105:aastore         
	//  685 1106:dup             
	//  686 1107:bipush          99
	//  687 1109:ldc2            #423 <String "fraction">
	//  688 1112:aastore         
	//  689 1113:dup             
	//  690 1114:bipush          100
	//  691 1116:ldc2            #425 <String "yen">
	//  692 1119:aastore         
	//  693 1120:dup             
	//  694 1121:bipush          101
	//  695 1123:ldc2            #427 <String "florin">
	//  696 1126:aastore         
	//  697 1127:dup             
	//  698 1128:bipush          102
	//  699 1130:ldc2            #429 <String "section">
	//  700 1133:aastore         
	//  701 1134:dup             
	//  702 1135:bipush          103
	//  703 1137:ldc2            #431 <String "currency">
	//  704 1140:aastore         
	//  705 1141:dup             
	//  706 1142:bipush          104
	//  707 1144:ldc2            #433 <String "quotesingle">
	//  708 1147:aastore         
	//  709 1148:dup             
	//  710 1149:bipush          105
	//  711 1151:ldc2            #435 <String "quotedblleft">
	//  712 1154:aastore         
	//  713 1155:dup             
	//  714 1156:bipush          106
	//  715 1158:ldc2            #437 <String "guillemotleft">
	//  716 1161:aastore         
	//  717 1162:dup             
	//  718 1163:bipush          107
	//  719 1165:ldc2            #439 <String "guilsinglleft">
	//  720 1168:aastore         
	//  721 1169:dup             
	//  722 1170:bipush          108
	//  723 1172:ldc2            #441 <String "guilsinglright">
	//  724 1175:aastore         
	//  725 1176:dup             
	//  726 1177:bipush          109
	//  727 1179:ldc2            #443 <String "fi">
	//  728 1182:aastore         
	//  729 1183:dup             
	//  730 1184:bipush          110
	//  731 1186:ldc2            #445 <String "fl">
	//  732 1189:aastore         
	//  733 1190:dup             
	//  734 1191:bipush          111
	//  735 1193:ldc2            #447 <String "endash">
	//  736 1196:aastore         
	//  737 1197:dup             
	//  738 1198:bipush          112
	//  739 1200:ldc2            #449 <String "dagger">
	//  740 1203:aastore         
	//  741 1204:dup             
	//  742 1205:bipush          113
	//  743 1207:ldc2            #451 <String "daggerdbl">
	//  744 1210:aastore         
	//  745 1211:dup             
	//  746 1212:bipush          114
	//  747 1214:ldc2            #453 <String "periodcentered">
	//  748 1217:aastore         
	//  749 1218:dup             
	//  750 1219:bipush          115
	//  751 1221:ldc2            #455 <String "paragraph">
	//  752 1224:aastore         
	//  753 1225:dup             
	//  754 1226:bipush          116
	//  755 1228:ldc2            #457 <String "bullet">
	//  756 1231:aastore         
	//  757 1232:dup             
	//  758 1233:bipush          117
	//  759 1235:ldc2            #459 <String "quotesinglbase">
	//  760 1238:aastore         
	//  761 1239:dup             
	//  762 1240:bipush          118
	//  763 1242:ldc2            #461 <String "quotedblbase">
	//  764 1245:aastore         
	//  765 1246:dup             
	//  766 1247:bipush          119
	//  767 1249:ldc2            #463 <String "quotedblright">
	//  768 1252:aastore         
	//  769 1253:dup             
	//  770 1254:bipush          120
	//  771 1256:ldc2            #465 <String "guillemotright">
	//  772 1259:aastore         
	//  773 1260:dup             
	//  774 1261:bipush          121
	//  775 1263:ldc2            #467 <String "ellipsis">
	//  776 1266:aastore         
	//  777 1267:dup             
	//  778 1268:bipush          122
	//  779 1270:ldc2            #469 <String "perthousand">
	//  780 1273:aastore         
	//  781 1274:dup             
	//  782 1275:bipush          123
	//  783 1277:ldc2            #471 <String "questiondown">
	//  784 1280:aastore         
	//  785 1281:dup             
	//  786 1282:bipush          124
	//  787 1284:ldc2            #473 <String "grave">
	//  788 1287:aastore         
	//  789 1288:dup             
	//  790 1289:bipush          125
	//  791 1291:ldc2            #475 <String "acute">
	//  792 1294:aastore         
	//  793 1295:dup             
	//  794 1296:bipush          126
	//  795 1298:ldc2            #477 <String "circumflex">
	//  796 1301:aastore         
	//  797 1302:dup             
	//  798 1303:bipush          127
	//  799 1305:ldc2            #479 <String "tilde">
	//  800 1308:aastore         
	//  801 1309:dup             
	//  802 1310:sipush          128
	//  803 1313:ldc2            #481 <String "macron">
	//  804 1316:aastore         
	//  805 1317:dup             
	//  806 1318:sipush          129
	//  807 1321:ldc2            #483 <String "breve">
	//  808 1324:aastore         
	//  809 1325:dup             
	//  810 1326:sipush          130
	//  811 1329:ldc2            #485 <String "dotaccent">
	//  812 1332:aastore         
	//  813 1333:dup             
	//  814 1334:sipush          131
	//  815 1337:ldc2            #487 <String "dieresis">
	//  816 1340:aastore         
	//  817 1341:dup             
	//  818 1342:sipush          132
	//  819 1345:ldc2            #489 <String "ring">
	//  820 1348:aastore         
	//  821 1349:dup             
	//  822 1350:sipush          133
	//  823 1353:ldc2            #491 <String "cedilla">
	//  824 1356:aastore         
	//  825 1357:dup             
	//  826 1358:sipush          134
	//  827 1361:ldc2            #493 <String "hungarumlaut">
	//  828 1364:aastore         
	//  829 1365:dup             
	//  830 1366:sipush          135
	//  831 1369:ldc2            #495 <String "ogonek">
	//  832 1372:aastore         
	//  833 1373:dup             
	//  834 1374:sipush          136
	//  835 1377:ldc2            #497 <String "caron">
	//  836 1380:aastore         
	//  837 1381:dup             
	//  838 1382:sipush          137
	//  839 1385:ldc2            #499 <String "emdash">
	//  840 1388:aastore         
	//  841 1389:dup             
	//  842 1390:sipush          138
	//  843 1393:ldc2            #501 <String "AE">
	//  844 1396:aastore         
	//  845 1397:dup             
	//  846 1398:sipush          139
	//  847 1401:ldc2            #503 <String "ordfeminine">
	//  848 1404:aastore         
	//  849 1405:dup             
	//  850 1406:sipush          140
	//  851 1409:ldc2            #505 <String "Lslash">
	//  852 1412:aastore         
	//  853 1413:dup             
	//  854 1414:sipush          141
	//  855 1417:ldc2            #507 <String "Oslash">
	//  856 1420:aastore         
	//  857 1421:dup             
	//  858 1422:sipush          142
	//  859 1425:ldc2            #509 <String "OE">
	//  860 1428:aastore         
	//  861 1429:dup             
	//  862 1430:sipush          143
	//  863 1433:ldc2            #511 <String "ordmasculine">
	//  864 1436:aastore         
	//  865 1437:dup             
	//  866 1438:sipush          144
	//  867 1441:ldc2            #513 <String "ae">
	//  868 1444:aastore         
	//  869 1445:dup             
	//  870 1446:sipush          145
	//  871 1449:ldc2            #515 <String "dotlessi">
	//  872 1452:aastore         
	//  873 1453:dup             
	//  874 1454:sipush          146
	//  875 1457:ldc2            #517 <String "lslash">
	//  876 1460:aastore         
	//  877 1461:dup             
	//  878 1462:sipush          147
	//  879 1465:ldc2            #519 <String "oslash">
	//  880 1468:aastore         
	//  881 1469:dup             
	//  882 1470:sipush          148
	//  883 1473:ldc2            #521 <String "oe">
	//  884 1476:aastore         
	//  885 1477:dup             
	//  886 1478:sipush          149
	//  887 1481:ldc2            #523 <String "germandbls">
	//  888 1484:aastore         
	//  889 1485:dup             
	//  890 1486:sipush          150
	//  891 1489:ldc2            #525 <String "onesuperior">
	//  892 1492:aastore         
	//  893 1493:dup             
	//  894 1494:sipush          151
	//  895 1497:ldc2            #527 <String "logicalnot">
	//  896 1500:aastore         
	//  897 1501:dup             
	//  898 1502:sipush          152
	//  899 1505:ldc2            #529 <String "mu">
	//  900 1508:aastore         
	//  901 1509:dup             
	//  902 1510:sipush          153
	//  903 1513:ldc2            #531 <String "trademark">
	//  904 1516:aastore         
	//  905 1517:dup             
	//  906 1518:sipush          154
	//  907 1521:ldc2            #533 <String "Eth">
	//  908 1524:aastore         
	//  909 1525:dup             
	//  910 1526:sipush          155
	//  911 1529:ldc2            #535 <String "onehalf">
	//  912 1532:aastore         
	//  913 1533:dup             
	//  914 1534:sipush          156
	//  915 1537:ldc2            #537 <String "plusminus">
	//  916 1540:aastore         
	//  917 1541:dup             
	//  918 1542:sipush          157
	//  919 1545:ldc2            #539 <String "Thorn">
	//  920 1548:aastore         
	//  921 1549:dup             
	//  922 1550:sipush          158
	//  923 1553:ldc2            #541 <String "onequarter">
	//  924 1556:aastore         
	//  925 1557:dup             
	//  926 1558:sipush          159
	//  927 1561:ldc2            #543 <String "divide">
	//  928 1564:aastore         
	//  929 1565:dup             
	//  930 1566:sipush          160
	//  931 1569:ldc2            #545 <String "brokenbar">
	//  932 1572:aastore         
	//  933 1573:dup             
	//  934 1574:sipush          161
	//  935 1577:ldc2            #547 <String "degree">
	//  936 1580:aastore         
	//  937 1581:dup             
	//  938 1582:sipush          162
	//  939 1585:ldc2            #549 <String "thorn">
	//  940 1588:aastore         
	//  941 1589:dup             
	//  942 1590:sipush          163
	//  943 1593:ldc2            #551 <String "threequarters">
	//  944 1596:aastore         
	//  945 1597:dup             
	//  946 1598:sipush          164
	//  947 1601:ldc2            #553 <String "twosuperior">
	//  948 1604:aastore         
	//  949 1605:dup             
	//  950 1606:sipush          165
	//  951 1609:ldc2            #555 <String "registered">
	//  952 1612:aastore         
	//  953 1613:dup             
	//  954 1614:sipush          166
	//  955 1617:ldc2            #557 <String "minus">
	//  956 1620:aastore         
	//  957 1621:dup             
	//  958 1622:sipush          167
	//  959 1625:ldc2            #559 <String "eth">
	//  960 1628:aastore         
	//  961 1629:dup             
	//  962 1630:sipush          168
	//  963 1633:ldc2            #561 <String "multiply">
	//  964 1636:aastore         
	//  965 1637:dup             
	//  966 1638:sipush          169
	//  967 1641:ldc2            #563 <String "threesuperior">
	//  968 1644:aastore         
	//  969 1645:dup             
	//  970 1646:sipush          170
	//  971 1649:ldc2            #565 <String "copyright">
	//  972 1652:aastore         
	//  973 1653:dup             
	//  974 1654:sipush          171
	//  975 1657:ldc2            #567 <String "Aacute">
	//  976 1660:aastore         
	//  977 1661:dup             
	//  978 1662:sipush          172
	//  979 1665:ldc2            #569 <String "Acircumflex">
	//  980 1668:aastore         
	//  981 1669:dup             
	//  982 1670:sipush          173
	//  983 1673:ldc2            #571 <String "Adieresis">
	//  984 1676:aastore         
	//  985 1677:dup             
	//  986 1678:sipush          174
	//  987 1681:ldc2            #573 <String "Agrave">
	//  988 1684:aastore         
	//  989 1685:dup             
	//  990 1686:sipush          175
	//  991 1689:ldc2            #575 <String "Aring">
	//  992 1692:aastore         
	//  993 1693:dup             
	//  994 1694:sipush          176
	//  995 1697:ldc2            #577 <String "Atilde">
	//  996 1700:aastore         
	//  997 1701:dup             
	//  998 1702:sipush          177
	//  999 1705:ldc2            #579 <String "Ccedilla">
	// 1000 1708:aastore         
	// 1001 1709:dup             
	// 1002 1710:sipush          178
	// 1003 1713:ldc2            #581 <String "Eacute">
	// 1004 1716:aastore         
	// 1005 1717:dup             
	// 1006 1718:sipush          179
	// 1007 1721:ldc2            #583 <String "Ecircumflex">
	// 1008 1724:aastore         
	// 1009 1725:dup             
	// 1010 1726:sipush          180
	// 1011 1729:ldc2            #585 <String "Edieresis">
	// 1012 1732:aastore         
	// 1013 1733:dup             
	// 1014 1734:sipush          181
	// 1015 1737:ldc2            #587 <String "Egrave">
	// 1016 1740:aastore         
	// 1017 1741:dup             
	// 1018 1742:sipush          182
	// 1019 1745:ldc2            #589 <String "Iacute">
	// 1020 1748:aastore         
	// 1021 1749:dup             
	// 1022 1750:sipush          183
	// 1023 1753:ldc2            #591 <String "Icircumflex">
	// 1024 1756:aastore         
	// 1025 1757:dup             
	// 1026 1758:sipush          184
	// 1027 1761:ldc2            #593 <String "Idieresis">
	// 1028 1764:aastore         
	// 1029 1765:dup             
	// 1030 1766:sipush          185
	// 1031 1769:ldc2            #595 <String "Igrave">
	// 1032 1772:aastore         
	// 1033 1773:dup             
	// 1034 1774:sipush          186
	// 1035 1777:ldc2            #597 <String "Ntilde">
	// 1036 1780:aastore         
	// 1037 1781:dup             
	// 1038 1782:sipush          187
	// 1039 1785:ldc2            #599 <String "Oacute">
	// 1040 1788:aastore         
	// 1041 1789:dup             
	// 1042 1790:sipush          188
	// 1043 1793:ldc2            #601 <String "Ocircumflex">
	// 1044 1796:aastore         
	// 1045 1797:dup             
	// 1046 1798:sipush          189
	// 1047 1801:ldc2            #603 <String "Odieresis">
	// 1048 1804:aastore         
	// 1049 1805:dup             
	// 1050 1806:sipush          190
	// 1051 1809:ldc2            #605 <String "Ograve">
	// 1052 1812:aastore         
	// 1053 1813:dup             
	// 1054 1814:sipush          191
	// 1055 1817:ldc2            #607 <String "Otilde">
	// 1056 1820:aastore         
	// 1057 1821:dup             
	// 1058 1822:sipush          192
	// 1059 1825:ldc2            #609 <String "Scaron">
	// 1060 1828:aastore         
	// 1061 1829:dup             
	// 1062 1830:sipush          193
	// 1063 1833:ldc2            #611 <String "Uacute">
	// 1064 1836:aastore         
	// 1065 1837:dup             
	// 1066 1838:sipush          194
	// 1067 1841:ldc2            #613 <String "Ucircumflex">
	// 1068 1844:aastore         
	// 1069 1845:dup             
	// 1070 1846:sipush          195
	// 1071 1849:ldc2            #615 <String "Udieresis">
	// 1072 1852:aastore         
	// 1073 1853:dup             
	// 1074 1854:sipush          196
	// 1075 1857:ldc2            #617 <String "Ugrave">
	// 1076 1860:aastore         
	// 1077 1861:dup             
	// 1078 1862:sipush          197
	// 1079 1865:ldc2            #619 <String "Yacute">
	// 1080 1868:aastore         
	// 1081 1869:dup             
	// 1082 1870:sipush          198
	// 1083 1873:ldc2            #621 <String "Ydieresis">
	// 1084 1876:aastore         
	// 1085 1877:dup             
	// 1086 1878:sipush          199
	// 1087 1881:ldc2            #623 <String "Zcaron">
	// 1088 1884:aastore         
	// 1089 1885:dup             
	// 1090 1886:sipush          200
	// 1091 1889:ldc2            #625 <String "aacute">
	// 1092 1892:aastore         
	// 1093 1893:dup             
	// 1094 1894:sipush          201
	// 1095 1897:ldc2            #627 <String "acircumflex">
	// 1096 1900:aastore         
	// 1097 1901:dup             
	// 1098 1902:sipush          202
	// 1099 1905:ldc2            #629 <String "adieresis">
	// 1100 1908:aastore         
	// 1101 1909:dup             
	// 1102 1910:sipush          203
	// 1103 1913:ldc2            #631 <String "agrave">
	// 1104 1916:aastore         
	// 1105 1917:dup             
	// 1106 1918:sipush          204
	// 1107 1921:ldc2            #633 <String "aring">
	// 1108 1924:aastore         
	// 1109 1925:dup             
	// 1110 1926:sipush          205
	// 1111 1929:ldc2            #635 <String "atilde">
	// 1112 1932:aastore         
	// 1113 1933:dup             
	// 1114 1934:sipush          206
	// 1115 1937:ldc2            #637 <String "ccedilla">
	// 1116 1940:aastore         
	// 1117 1941:dup             
	// 1118 1942:sipush          207
	// 1119 1945:ldc2            #639 <String "eacute">
	// 1120 1948:aastore         
	// 1121 1949:dup             
	// 1122 1950:sipush          208
	// 1123 1953:ldc2            #641 <String "ecircumflex">
	// 1124 1956:aastore         
	// 1125 1957:dup             
	// 1126 1958:sipush          209
	// 1127 1961:ldc2            #643 <String "edieresis">
	// 1128 1964:aastore         
	// 1129 1965:dup             
	// 1130 1966:sipush          210
	// 1131 1969:ldc2            #645 <String "egrave">
	// 1132 1972:aastore         
	// 1133 1973:dup             
	// 1134 1974:sipush          211
	// 1135 1977:ldc2            #647 <String "iacute">
	// 1136 1980:aastore         
	// 1137 1981:dup             
	// 1138 1982:sipush          212
	// 1139 1985:ldc2            #649 <String "icircumflex">
	// 1140 1988:aastore         
	// 1141 1989:dup             
	// 1142 1990:sipush          213
	// 1143 1993:ldc2            #651 <String "idieresis">
	// 1144 1996:aastore         
	// 1145 1997:dup             
	// 1146 1998:sipush          214
	// 1147 2001:ldc2            #653 <String "igrave">
	// 1148 2004:aastore         
	// 1149 2005:dup             
	// 1150 2006:sipush          215
	// 1151 2009:ldc2            #655 <String "ntilde">
	// 1152 2012:aastore         
	// 1153 2013:dup             
	// 1154 2014:sipush          216
	// 1155 2017:ldc2            #657 <String "oacute">
	// 1156 2020:aastore         
	// 1157 2021:dup             
	// 1158 2022:sipush          217
	// 1159 2025:ldc2            #659 <String "ocircumflex">
	// 1160 2028:aastore         
	// 1161 2029:dup             
	// 1162 2030:sipush          218
	// 1163 2033:ldc2            #661 <String "odieresis">
	// 1164 2036:aastore         
	// 1165 2037:dup             
	// 1166 2038:sipush          219
	// 1167 2041:ldc2            #663 <String "ograve">
	// 1168 2044:aastore         
	// 1169 2045:dup             
	// 1170 2046:sipush          220
	// 1171 2049:ldc2            #665 <String "otilde">
	// 1172 2052:aastore         
	// 1173 2053:dup             
	// 1174 2054:sipush          221
	// 1175 2057:ldc2            #667 <String "scaron">
	// 1176 2060:aastore         
	// 1177 2061:dup             
	// 1178 2062:sipush          222
	// 1179 2065:ldc2            #669 <String "uacute">
	// 1180 2068:aastore         
	// 1181 2069:dup             
	// 1182 2070:sipush          223
	// 1183 2073:ldc2            #671 <String "ucircumflex">
	// 1184 2076:aastore         
	// 1185 2077:dup             
	// 1186 2078:sipush          224
	// 1187 2081:ldc2            #673 <String "udieresis">
	// 1188 2084:aastore         
	// 1189 2085:dup             
	// 1190 2086:sipush          225
	// 1191 2089:ldc2            #675 <String "ugrave">
	// 1192 2092:aastore         
	// 1193 2093:dup             
	// 1194 2094:sipush          226
	// 1195 2097:ldc2            #677 <String "yacute">
	// 1196 2100:aastore         
	// 1197 2101:dup             
	// 1198 2102:sipush          227
	// 1199 2105:ldc2            #679 <String "ydieresis">
	// 1200 2108:aastore         
	// 1201 2109:dup             
	// 1202 2110:sipush          228
	// 1203 2113:ldc2            #681 <String "zcaron">
	// 1204 2116:aastore         
	// 1205 2117:dup             
	// 1206 2118:sipush          229
	// 1207 2121:ldc2            #683 <String "exclamsmall">
	// 1208 2124:aastore         
	// 1209 2125:dup             
	// 1210 2126:sipush          230
	// 1211 2129:ldc2            #685 <String "Hungarumlautsmall">
	// 1212 2132:aastore         
	// 1213 2133:dup             
	// 1214 2134:sipush          231
	// 1215 2137:ldc2            #687 <String "dollaroldstyle">
	// 1216 2140:aastore         
	// 1217 2141:dup             
	// 1218 2142:sipush          232
	// 1219 2145:ldc2            #689 <String "dollarsuperior">
	// 1220 2148:aastore         
	// 1221 2149:dup             
	// 1222 2150:sipush          233
	// 1223 2153:ldc2            #691 <String "ampersandsmall">
	// 1224 2156:aastore         
	// 1225 2157:dup             
	// 1226 2158:sipush          234
	// 1227 2161:ldc2            #693 <String "Acutesmall">
	// 1228 2164:aastore         
	// 1229 2165:dup             
	// 1230 2166:sipush          235
	// 1231 2169:ldc2            #695 <String "parenleftsuperior">
	// 1232 2172:aastore         
	// 1233 2173:dup             
	// 1234 2174:sipush          236
	// 1235 2177:ldc2            #697 <String "parenrightsuperior">
	// 1236 2180:aastore         
	// 1237 2181:dup             
	// 1238 2182:sipush          237
	// 1239 2185:ldc2            #699 <String "twodotenleader">
	// 1240 2188:aastore         
	// 1241 2189:dup             
	// 1242 2190:sipush          238
	// 1243 2193:ldc2            #701 <String "onedotenleader">
	// 1244 2196:aastore         
	// 1245 2197:dup             
	// 1246 2198:sipush          239
	// 1247 2201:ldc2            #703 <String "zerooldstyle">
	// 1248 2204:aastore         
	// 1249 2205:dup             
	// 1250 2206:sipush          240
	// 1251 2209:ldc2            #705 <String "oneoldstyle">
	// 1252 2212:aastore         
	// 1253 2213:dup             
	// 1254 2214:sipush          241
	// 1255 2217:ldc2            #707 <String "twooldstyle">
	// 1256 2220:aastore         
	// 1257 2221:dup             
	// 1258 2222:sipush          242
	// 1259 2225:ldc2            #709 <String "threeoldstyle">
	// 1260 2228:aastore         
	// 1261 2229:dup             
	// 1262 2230:sipush          243
	// 1263 2233:ldc2            #711 <String "fouroldstyle">
	// 1264 2236:aastore         
	// 1265 2237:dup             
	// 1266 2238:sipush          244
	// 1267 2241:ldc2            #713 <String "fiveoldstyle">
	// 1268 2244:aastore         
	// 1269 2245:dup             
	// 1270 2246:sipush          245
	// 1271 2249:ldc2            #715 <String "sixoldstyle">
	// 1272 2252:aastore         
	// 1273 2253:dup             
	// 1274 2254:sipush          246
	// 1275 2257:ldc2            #717 <String "sevenoldstyle">
	// 1276 2260:aastore         
	// 1277 2261:dup             
	// 1278 2262:sipush          247
	// 1279 2265:ldc2            #719 <String "eightoldstyle">
	// 1280 2268:aastore         
	// 1281 2269:dup             
	// 1282 2270:sipush          248
	// 1283 2273:ldc2            #721 <String "nineoldstyle">
	// 1284 2276:aastore         
	// 1285 2277:dup             
	// 1286 2278:sipush          249
	// 1287 2281:ldc2            #723 <String "commasuperior">
	// 1288 2284:aastore         
	// 1289 2285:dup             
	// 1290 2286:sipush          250
	// 1291 2289:ldc2            #725 <String "threequartersemdash">
	// 1292 2292:aastore         
	// 1293 2293:dup             
	// 1294 2294:sipush          251
	// 1295 2297:ldc2            #727 <String "periodsuperior">
	// 1296 2300:aastore         
	// 1297 2301:dup             
	// 1298 2302:sipush          252
	// 1299 2305:ldc2            #729 <String "questionsmall">
	// 1300 2308:aastore         
	// 1301 2309:dup             
	// 1302 2310:sipush          253
	// 1303 2313:ldc2            #731 <String "asuperior">
	// 1304 2316:aastore         
	// 1305 2317:dup             
	// 1306 2318:sipush          254
	// 1307 2321:ldc2            #733 <String "bsuperior">
	// 1308 2324:aastore         
	// 1309 2325:dup             
	// 1310 2326:sipush          255
	// 1311 2329:ldc2            #735 <String "centsuperior">
	// 1312 2332:aastore         
	// 1313 2333:dup             
	// 1314 2334:sipush          256
	// 1315 2337:ldc2            #737 <String "dsuperior">
	// 1316 2340:aastore         
	// 1317 2341:dup             
	// 1318 2342:sipush          257
	// 1319 2345:ldc2            #739 <String "esuperior">
	// 1320 2348:aastore         
	// 1321 2349:dup             
	// 1322 2350:sipush          258
	// 1323 2353:ldc2            #741 <String "isuperior">
	// 1324 2356:aastore         
	// 1325 2357:dup             
	// 1326 2358:sipush          259
	// 1327 2361:ldc2            #743 <String "lsuperior">
	// 1328 2364:aastore         
	// 1329 2365:dup             
	// 1330 2366:sipush          260
	// 1331 2369:ldc2            #745 <String "msuperior">
	// 1332 2372:aastore         
	// 1333 2373:dup             
	// 1334 2374:sipush          261
	// 1335 2377:ldc2            #747 <String "nsuperior">
	// 1336 2380:aastore         
	// 1337 2381:dup             
	// 1338 2382:sipush          262
	// 1339 2385:ldc2            #749 <String "osuperior">
	// 1340 2388:aastore         
	// 1341 2389:dup             
	// 1342 2390:sipush          263
	// 1343 2393:ldc2            #751 <String "rsuperior">
	// 1344 2396:aastore         
	// 1345 2397:dup             
	// 1346 2398:sipush          264
	// 1347 2401:ldc2            #753 <String "ssuperior">
	// 1348 2404:aastore         
	// 1349 2405:dup             
	// 1350 2406:sipush          265
	// 1351 2409:ldc2            #755 <String "tsuperior">
	// 1352 2412:aastore         
	// 1353 2413:dup             
	// 1354 2414:sipush          266
	// 1355 2417:ldc2            #757 <String "ff">
	// 1356 2420:aastore         
	// 1357 2421:dup             
	// 1358 2422:sipush          267
	// 1359 2425:ldc2            #759 <String "ffi">
	// 1360 2428:aastore         
	// 1361 2429:dup             
	// 1362 2430:sipush          268
	// 1363 2433:ldc2            #761 <String "ffl">
	// 1364 2436:aastore         
	// 1365 2437:dup             
	// 1366 2438:sipush          269
	// 1367 2441:ldc2            #763 <String "parenleftinferior">
	// 1368 2444:aastore         
	// 1369 2445:dup             
	// 1370 2446:sipush          270
	// 1371 2449:ldc2            #765 <String "parenrightinferior">
	// 1372 2452:aastore         
	// 1373 2453:dup             
	// 1374 2454:sipush          271
	// 1375 2457:ldc2            #767 <String "Circumflexsmall">
	// 1376 2460:aastore         
	// 1377 2461:dup             
	// 1378 2462:sipush          272
	// 1379 2465:ldc2            #769 <String "hyphensuperior">
	// 1380 2468:aastore         
	// 1381 2469:dup             
	// 1382 2470:sipush          273
	// 1383 2473:ldc2            #771 <String "Gravesmall">
	// 1384 2476:aastore         
	// 1385 2477:dup             
	// 1386 2478:sipush          274
	// 1387 2481:ldc2            #773 <String "Asmall">
	// 1388 2484:aastore         
	// 1389 2485:dup             
	// 1390 2486:sipush          275
	// 1391 2489:ldc2            #775 <String "Bsmall">
	// 1392 2492:aastore         
	// 1393 2493:dup             
	// 1394 2494:sipush          276
	// 1395 2497:ldc2            #777 <String "Csmall">
	// 1396 2500:aastore         
	// 1397 2501:dup             
	// 1398 2502:sipush          277
	// 1399 2505:ldc2            #779 <String "Dsmall">
	// 1400 2508:aastore         
	// 1401 2509:dup             
	// 1402 2510:sipush          278
	// 1403 2513:ldc2            #781 <String "Esmall">
	// 1404 2516:aastore         
	// 1405 2517:dup             
	// 1406 2518:sipush          279
	// 1407 2521:ldc2            #783 <String "Fsmall">
	// 1408 2524:aastore         
	// 1409 2525:dup             
	// 1410 2526:sipush          280
	// 1411 2529:ldc2            #785 <String "Gsmall">
	// 1412 2532:aastore         
	// 1413 2533:dup             
	// 1414 2534:sipush          281
	// 1415 2537:ldc2            #787 <String "Hsmall">
	// 1416 2540:aastore         
	// 1417 2541:dup             
	// 1418 2542:sipush          282
	// 1419 2545:ldc2            #789 <String "Ismall">
	// 1420 2548:aastore         
	// 1421 2549:dup             
	// 1422 2550:sipush          283
	// 1423 2553:ldc2            #791 <String "Jsmall">
	// 1424 2556:aastore         
	// 1425 2557:dup             
	// 1426 2558:sipush          284
	// 1427 2561:ldc2            #793 <String "Ksmall">
	// 1428 2564:aastore         
	// 1429 2565:dup             
	// 1430 2566:sipush          285
	// 1431 2569:ldc2            #795 <String "Lsmall">
	// 1432 2572:aastore         
	// 1433 2573:dup             
	// 1434 2574:sipush          286
	// 1435 2577:ldc2            #797 <String "Msmall">
	// 1436 2580:aastore         
	// 1437 2581:dup             
	// 1438 2582:sipush          287
	// 1439 2585:ldc2            #799 <String "Nsmall">
	// 1440 2588:aastore         
	// 1441 2589:dup             
	// 1442 2590:sipush          288
	// 1443 2593:ldc2            #801 <String "Osmall">
	// 1444 2596:aastore         
	// 1445 2597:dup             
	// 1446 2598:sipush          289
	// 1447 2601:ldc2            #803 <String "Psmall">
	// 1448 2604:aastore         
	// 1449 2605:dup             
	// 1450 2606:sipush          290
	// 1451 2609:ldc2            #805 <String "Qsmall">
	// 1452 2612:aastore         
	// 1453 2613:dup             
	// 1454 2614:sipush          291
	// 1455 2617:ldc2            #807 <String "Rsmall">
	// 1456 2620:aastore         
	// 1457 2621:dup             
	// 1458 2622:sipush          292
	// 1459 2625:ldc2            #809 <String "Ssmall">
	// 1460 2628:aastore         
	// 1461 2629:dup             
	// 1462 2630:sipush          293
	// 1463 2633:ldc2            #811 <String "Tsmall">
	// 1464 2636:aastore         
	// 1465 2637:dup             
	// 1466 2638:sipush          294
	// 1467 2641:ldc2            #813 <String "Usmall">
	// 1468 2644:aastore         
	// 1469 2645:dup             
	// 1470 2646:sipush          295
	// 1471 2649:ldc2            #815 <String "Vsmall">
	// 1472 2652:aastore         
	// 1473 2653:dup             
	// 1474 2654:sipush          296
	// 1475 2657:ldc2            #817 <String "Wsmall">
	// 1476 2660:aastore         
	// 1477 2661:dup             
	// 1478 2662:sipush          297
	// 1479 2665:ldc2            #819 <String "Xsmall">
	// 1480 2668:aastore         
	// 1481 2669:dup             
	// 1482 2670:sipush          298
	// 1483 2673:ldc2            #821 <String "Ysmall">
	// 1484 2676:aastore         
	// 1485 2677:dup             
	// 1486 2678:sipush          299
	// 1487 2681:ldc2            #823 <String "Zsmall">
	// 1488 2684:aastore         
	// 1489 2685:dup             
	// 1490 2686:sipush          300
	// 1491 2689:ldc2            #825 <String "colonmonetary">
	// 1492 2692:aastore         
	// 1493 2693:dup             
	// 1494 2694:sipush          301
	// 1495 2697:ldc2            #827 <String "onefitted">
	// 1496 2700:aastore         
	// 1497 2701:dup             
	// 1498 2702:sipush          302
	// 1499 2705:ldc2            #829 <String "rupiah">
	// 1500 2708:aastore         
	// 1501 2709:dup             
	// 1502 2710:sipush          303
	// 1503 2713:ldc2            #831 <String "Tildesmall">
	// 1504 2716:aastore         
	// 1505 2717:dup             
	// 1506 2718:sipush          304
	// 1507 2721:ldc2            #833 <String "exclamdownsmall">
	// 1508 2724:aastore         
	// 1509 2725:dup             
	// 1510 2726:sipush          305
	// 1511 2729:ldc2            #835 <String "centoldstyle">
	// 1512 2732:aastore         
	// 1513 2733:dup             
	// 1514 2734:sipush          306
	// 1515 2737:ldc2            #837 <String "Lslashsmall">
	// 1516 2740:aastore         
	// 1517 2741:dup             
	// 1518 2742:sipush          307
	// 1519 2745:ldc2            #839 <String "Scaronsmall">
	// 1520 2748:aastore         
	// 1521 2749:dup             
	// 1522 2750:sipush          308
	// 1523 2753:ldc2            #841 <String "Zcaronsmall">
	// 1524 2756:aastore         
	// 1525 2757:dup             
	// 1526 2758:sipush          309
	// 1527 2761:ldc2            #843 <String "Dieresissmall">
	// 1528 2764:aastore         
	// 1529 2765:dup             
	// 1530 2766:sipush          310
	// 1531 2769:ldc2            #845 <String "Brevesmall">
	// 1532 2772:aastore         
	// 1533 2773:dup             
	// 1534 2774:sipush          311
	// 1535 2777:ldc2            #847 <String "Caronsmall">
	// 1536 2780:aastore         
	// 1537 2781:dup             
	// 1538 2782:sipush          312
	// 1539 2785:ldc2            #849 <String "Dotaccentsmall">
	// 1540 2788:aastore         
	// 1541 2789:dup             
	// 1542 2790:sipush          313
	// 1543 2793:ldc2            #851 <String "Macronsmall">
	// 1544 2796:aastore         
	// 1545 2797:dup             
	// 1546 2798:sipush          314
	// 1547 2801:ldc2            #853 <String "figuredash">
	// 1548 2804:aastore         
	// 1549 2805:dup             
	// 1550 2806:sipush          315
	// 1551 2809:ldc2            #855 <String "hypheninferior">
	// 1552 2812:aastore         
	// 1553 2813:dup             
	// 1554 2814:sipush          316
	// 1555 2817:ldc2            #857 <String "Ogoneksmall">
	// 1556 2820:aastore         
	// 1557 2821:dup             
	// 1558 2822:sipush          317
	// 1559 2825:ldc2            #859 <String "Ringsmall">
	// 1560 2828:aastore         
	// 1561 2829:dup             
	// 1562 2830:sipush          318
	// 1563 2833:ldc2            #861 <String "Cedillasmall">
	// 1564 2836:aastore         
	// 1565 2837:dup             
	// 1566 2838:sipush          319
	// 1567 2841:ldc2            #863 <String "questiondownsmall">
	// 1568 2844:aastore         
	// 1569 2845:dup             
	// 1570 2846:sipush          320
	// 1571 2849:ldc2            #865 <String "oneeighth">
	// 1572 2852:aastore         
	// 1573 2853:dup             
	// 1574 2854:sipush          321
	// 1575 2857:ldc2            #867 <String "threeeighths">
	// 1576 2860:aastore         
	// 1577 2861:dup             
	// 1578 2862:sipush          322
	// 1579 2865:ldc2            #869 <String "fiveeighths">
	// 1580 2868:aastore         
	// 1581 2869:dup             
	// 1582 2870:sipush          323
	// 1583 2873:ldc2            #871 <String "seveneighths">
	// 1584 2876:aastore         
	// 1585 2877:dup             
	// 1586 2878:sipush          324
	// 1587 2881:ldc2            #873 <String "onethird">
	// 1588 2884:aastore         
	// 1589 2885:dup             
	// 1590 2886:sipush          325
	// 1591 2889:ldc2            #875 <String "twothirds">
	// 1592 2892:aastore         
	// 1593 2893:dup             
	// 1594 2894:sipush          326
	// 1595 2897:ldc2            #877 <String "zerosuperior">
	// 1596 2900:aastore         
	// 1597 2901:dup             
	// 1598 2902:sipush          327
	// 1599 2905:ldc2            #879 <String "foursuperior">
	// 1600 2908:aastore         
	// 1601 2909:dup             
	// 1602 2910:sipush          328
	// 1603 2913:ldc2            #881 <String "fivesuperior">
	// 1604 2916:aastore         
	// 1605 2917:dup             
	// 1606 2918:sipush          329
	// 1607 2921:ldc2            #883 <String "sixsuperior">
	// 1608 2924:aastore         
	// 1609 2925:dup             
	// 1610 2926:sipush          330
	// 1611 2929:ldc2            #885 <String "sevensuperior">
	// 1612 2932:aastore         
	// 1613 2933:dup             
	// 1614 2934:sipush          331
	// 1615 2937:ldc2            #887 <String "eightsuperior">
	// 1616 2940:aastore         
	// 1617 2941:dup             
	// 1618 2942:sipush          332
	// 1619 2945:ldc2            #889 <String "ninesuperior">
	// 1620 2948:aastore         
	// 1621 2949:dup             
	// 1622 2950:sipush          333
	// 1623 2953:ldc2            #891 <String "zeroinferior">
	// 1624 2956:aastore         
	// 1625 2957:dup             
	// 1626 2958:sipush          334
	// 1627 2961:ldc2            #893 <String "oneinferior">
	// 1628 2964:aastore         
	// 1629 2965:dup             
	// 1630 2966:sipush          335
	// 1631 2969:ldc2            #895 <String "twoinferior">
	// 1632 2972:aastore         
	// 1633 2973:dup             
	// 1634 2974:sipush          336
	// 1635 2977:ldc2            #897 <String "threeinferior">
	// 1636 2980:aastore         
	// 1637 2981:dup             
	// 1638 2982:sipush          337
	// 1639 2985:ldc2            #899 <String "fourinferior">
	// 1640 2988:aastore         
	// 1641 2989:dup             
	// 1642 2990:sipush          338
	// 1643 2993:ldc2            #901 <String "fiveinferior">
	// 1644 2996:aastore         
	// 1645 2997:dup             
	// 1646 2998:sipush          339
	// 1647 3001:ldc2            #903 <String "sixinferior">
	// 1648 3004:aastore         
	// 1649 3005:dup             
	// 1650 3006:sipush          340
	// 1651 3009:ldc2            #905 <String "seveninferior">
	// 1652 3012:aastore         
	// 1653 3013:dup             
	// 1654 3014:sipush          341
	// 1655 3017:ldc2            #907 <String "eightinferior">
	// 1656 3020:aastore         
	// 1657 3021:dup             
	// 1658 3022:sipush          342
	// 1659 3025:ldc2            #909 <String "nineinferior">
	// 1660 3028:aastore         
	// 1661 3029:dup             
	// 1662 3030:sipush          343
	// 1663 3033:ldc2            #911 <String "centinferior">
	// 1664 3036:aastore         
	// 1665 3037:dup             
	// 1666 3038:sipush          344
	// 1667 3041:ldc2            #913 <String "dollarinferior">
	// 1668 3044:aastore         
	// 1669 3045:dup             
	// 1670 3046:sipush          345
	// 1671 3049:ldc2            #915 <String "periodinferior">
	// 1672 3052:aastore         
	// 1673 3053:dup             
	// 1674 3054:sipush          346
	// 1675 3057:ldc2            #917 <String "commainferior">
	// 1676 3060:aastore         
	// 1677 3061:dup             
	// 1678 3062:sipush          347
	// 1679 3065:ldc2            #919 <String "Agravesmall">
	// 1680 3068:aastore         
	// 1681 3069:dup             
	// 1682 3070:sipush          348
	// 1683 3073:ldc2            #921 <String "Aacutesmall">
	// 1684 3076:aastore         
	// 1685 3077:dup             
	// 1686 3078:sipush          349
	// 1687 3081:ldc2            #923 <String "Acircumflexsmall">
	// 1688 3084:aastore         
	// 1689 3085:dup             
	// 1690 3086:sipush          350
	// 1691 3089:ldc2            #925 <String "Atildesmall">
	// 1692 3092:aastore         
	// 1693 3093:dup             
	// 1694 3094:sipush          351
	// 1695 3097:ldc2            #927 <String "Adieresissmall">
	// 1696 3100:aastore         
	// 1697 3101:dup             
	// 1698 3102:sipush          352
	// 1699 3105:ldc2            #929 <String "Aringsmall">
	// 1700 3108:aastore         
	// 1701 3109:dup             
	// 1702 3110:sipush          353
	// 1703 3113:ldc2            #931 <String "AEsmall">
	// 1704 3116:aastore         
	// 1705 3117:dup             
	// 1706 3118:sipush          354
	// 1707 3121:ldc2            #933 <String "Ccedillasmall">
	// 1708 3124:aastore         
	// 1709 3125:dup             
	// 1710 3126:sipush          355
	// 1711 3129:ldc2            #935 <String "Egravesmall">
	// 1712 3132:aastore         
	// 1713 3133:dup             
	// 1714 3134:sipush          356
	// 1715 3137:ldc2            #937 <String "Eacutesmall">
	// 1716 3140:aastore         
	// 1717 3141:dup             
	// 1718 3142:sipush          357
	// 1719 3145:ldc2            #939 <String "Ecircumflexsmall">
	// 1720 3148:aastore         
	// 1721 3149:dup             
	// 1722 3150:sipush          358
	// 1723 3153:ldc2            #941 <String "Edieresissmall">
	// 1724 3156:aastore         
	// 1725 3157:dup             
	// 1726 3158:sipush          359
	// 1727 3161:ldc2            #943 <String "Igravesmall">
	// 1728 3164:aastore         
	// 1729 3165:dup             
	// 1730 3166:sipush          360
	// 1731 3169:ldc2            #945 <String "Iacutesmall">
	// 1732 3172:aastore         
	// 1733 3173:dup             
	// 1734 3174:sipush          361
	// 1735 3177:ldc2            #947 <String "Icircumflexsmall">
	// 1736 3180:aastore         
	// 1737 3181:dup             
	// 1738 3182:sipush          362
	// 1739 3185:ldc2            #949 <String "Idieresissmall">
	// 1740 3188:aastore         
	// 1741 3189:dup             
	// 1742 3190:sipush          363
	// 1743 3193:ldc2            #951 <String "Ethsmall">
	// 1744 3196:aastore         
	// 1745 3197:dup             
	// 1746 3198:sipush          364
	// 1747 3201:ldc2            #953 <String "Ntildesmall">
	// 1748 3204:aastore         
	// 1749 3205:dup             
	// 1750 3206:sipush          365
	// 1751 3209:ldc2            #955 <String "Ogravesmall">
	// 1752 3212:aastore         
	// 1753 3213:dup             
	// 1754 3214:sipush          366
	// 1755 3217:ldc2            #957 <String "Oacutesmall">
	// 1756 3220:aastore         
	// 1757 3221:dup             
	// 1758 3222:sipush          367
	// 1759 3225:ldc2            #959 <String "Ocircumflexsmall">
	// 1760 3228:aastore         
	// 1761 3229:dup             
	// 1762 3230:sipush          368
	// 1763 3233:ldc2            #961 <String "Otildesmall">
	// 1764 3236:aastore         
	// 1765 3237:dup             
	// 1766 3238:sipush          369
	// 1767 3241:ldc2            #963 <String "Odieresissmall">
	// 1768 3244:aastore         
	// 1769 3245:dup             
	// 1770 3246:sipush          370
	// 1771 3249:ldc2            #965 <String "OEsmall">
	// 1772 3252:aastore         
	// 1773 3253:dup             
	// 1774 3254:sipush          371
	// 1775 3257:ldc2            #967 <String "Oslashsmall">
	// 1776 3260:aastore         
	// 1777 3261:dup             
	// 1778 3262:sipush          372
	// 1779 3265:ldc2            #969 <String "Ugravesmall">
	// 1780 3268:aastore         
	// 1781 3269:dup             
	// 1782 3270:sipush          373
	// 1783 3273:ldc2            #971 <String "Uacutesmall">
	// 1784 3276:aastore         
	// 1785 3277:dup             
	// 1786 3278:sipush          374
	// 1787 3281:ldc2            #973 <String "Ucircumflexsmall">
	// 1788 3284:aastore         
	// 1789 3285:dup             
	// 1790 3286:sipush          375
	// 1791 3289:ldc2            #975 <String "Udieresissmall">
	// 1792 3292:aastore         
	// 1793 3293:dup             
	// 1794 3294:sipush          376
	// 1795 3297:ldc2            #977 <String "Yacutesmall">
	// 1796 3300:aastore         
	// 1797 3301:dup             
	// 1798 3302:sipush          377
	// 1799 3305:ldc2            #979 <String "Thornsmall">
	// 1800 3308:aastore         
	// 1801 3309:dup             
	// 1802 3310:sipush          378
	// 1803 3313:ldc2            #981 <String "Ydieresissmall">
	// 1804 3316:aastore         
	// 1805 3317:dup             
	// 1806 3318:sipush          379
	// 1807 3321:ldc2            #983 <String "001.000">
	// 1808 3324:aastore         
	// 1809 3325:dup             
	// 1810 3326:sipush          380
	// 1811 3329:ldc2            #985 <String "001.001">
	// 1812 3332:aastore         
	// 1813 3333:dup             
	// 1814 3334:sipush          381
	// 1815 3337:ldc2            #987 <String "001.002">
	// 1816 3340:aastore         
	// 1817 3341:dup             
	// 1818 3342:sipush          382
	// 1819 3345:ldc2            #989 <String "001.003">
	// 1820 3348:aastore         
	// 1821 3349:dup             
	// 1822 3350:sipush          383
	// 1823 3353:ldc2            #991 <String "Black">
	// 1824 3356:aastore         
	// 1825 3357:dup             
	// 1826 3358:sipush          384
	// 1827 3361:ldc2            #993 <String "Bold">
	// 1828 3364:aastore         
	// 1829 3365:dup             
	// 1830 3366:sipush          385
	// 1831 3369:ldc2            #995 <String "Book">
	// 1832 3372:aastore         
	// 1833 3373:dup             
	// 1834 3374:sipush          386
	// 1835 3377:ldc2            #997 <String "Light">
	// 1836 3380:aastore         
	// 1837 3381:dup             
	// 1838 3382:sipush          387
	// 1839 3385:ldc2            #999 <String "Medium">
	// 1840 3388:aastore         
	// 1841 3389:dup             
	// 1842 3390:sipush          388
	// 1843 3393:ldc2            #1001 <String "Regular">
	// 1844 3396:aastore         
	// 1845 3397:dup             
	// 1846 3398:sipush          389
	// 1847 3401:ldc2            #1003 <String "Roman">
	// 1848 3404:aastore         
	// 1849 3405:dup             
	// 1850 3406:sipush          390
	// 1851 3409:ldc2            #1005 <String "Semibold">
	// 1852 3412:aastore         
	// 1853 3413:putstatic       #1007 <Field String[] standardStrings>
	//*1854 3416:return          
	}
}
