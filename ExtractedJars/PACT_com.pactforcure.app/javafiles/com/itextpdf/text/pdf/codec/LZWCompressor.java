// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.codec;

import java.io.IOException;
import java.io.OutputStream;

// Referenced classes of package com.itextpdf.text.pdf.codec:
//			BitFile, LZWStringTable

public class LZWCompressor
{

	public LZWCompressor(OutputStream outputstream, int i, boolean flag)
		throws IOException
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Object()>
		boolean flag1;
		if(!flag)
	//*   2    4:iload_3         
	//*   3    5:ifne            137
			flag1 = true;
	//    4    8:iconst_1        
	//    5    9:istore          4
		else
	//*   6   11:aload_0         
	//*   7   12:new             #27  <Class BitFile>
	//*   8   15:dup             
	//*   9   16:aload_1         
	//*  10   17:iload           4
	//*  11   19:invokespecial   #30  <Method void BitFile(OutputStream, boolean)>
	//*  12   22:putfield        #32  <Field BitFile bf_>
	//*  13   25:aload_0         
	//*  14   26:iload_2         
	//*  15   27:putfield        #34  <Field int codeSize_>
	//*  16   30:aload_0         
	//*  17   31:iload_3         
	//*  18   32:putfield        #36  <Field boolean tiffFudge_>
	//*  19   35:aload_0         
	//*  20   36:iconst_1        
	//*  21   37:aload_0         
	//*  22   38:getfield        #34  <Field int codeSize_>
	//*  23   41:ishl            
	//*  24   42:putfield        #38  <Field int clearCode_>
	//*  25   45:aload_0         
	//*  26   46:aload_0         
	//*  27   47:getfield        #38  <Field int clearCode_>
	//*  28   50:iconst_1        
	//*  29   51:iadd            
	//*  30   52:putfield        #40  <Field int endOfInfo_>
	//*  31   55:aload_0         
	//*  32   56:aload_0         
	//*  33   57:getfield        #34  <Field int codeSize_>
	//*  34   60:iconst_1        
	//*  35   61:iadd            
	//*  36   62:putfield        #42  <Field int numBits_>
	//*  37   65:aload_0         
	//*  38   66:iconst_1        
	//*  39   67:aload_0         
	//*  40   68:getfield        #42  <Field int numBits_>
	//*  41   71:ishl            
	//*  42   72:iconst_1        
	//*  43   73:isub            
	//*  44   74:putfield        #44  <Field int limit_>
	//*  45   77:aload_0         
	//*  46   78:getfield        #36  <Field boolean tiffFudge_>
	//*  47   81:ifeq            94
	//*  48   84:aload_0         
	//*  49   85:aload_0         
	//*  50   86:getfield        #44  <Field int limit_>
	//*  51   89:iconst_1        
	//*  52   90:isub            
	//*  53   91:putfield        #44  <Field int limit_>
	//*  54   94:aload_0         
	//*  55   95:iconst_m1       
	//*  56   96:putfield        #46  <Field short prefix_>
	//*  57   99:aload_0         
	//*  58  100:new             #48  <Class LZWStringTable>
	//*  59  103:dup             
	//*  60  104:invokespecial   #49  <Method void LZWStringTable()>
	//*  61  107:putfield        #51  <Field LZWStringTable lzss_>
	//*  62  110:aload_0         
	//*  63  111:getfield        #51  <Field LZWStringTable lzss_>
	//*  64  114:aload_0         
	//*  65  115:getfield        #34  <Field int codeSize_>
	//*  66  118:invokevirtual   #55  <Method void LZWStringTable.ClearTable(int)>
	//*  67  121:aload_0         
	//*  68  122:getfield        #32  <Field BitFile bf_>
	//*  69  125:aload_0         
	//*  70  126:getfield        #38  <Field int clearCode_>
	//*  71  129:aload_0         
	//*  72  130:getfield        #42  <Field int numBits_>
	//*  73  133:invokevirtual   #59  <Method void BitFile.writeBits(int, int)>
	//*  74  136:return          
			flag1 = false;
	//   75  137:iconst_0        
	//   76  138:istore          4
		bf_ = new BitFile(outputstream, flag1);
		codeSize_ = i;
		tiffFudge_ = flag;
		clearCode_ = 1 << codeSize_;
		endOfInfo_ = clearCode_ + 1;
		numBits_ = codeSize_ + 1;
		limit_ = (1 << numBits_) - 1;
		if(tiffFudge_)
			limit_ = limit_ - 1;
		prefix_ = -1;
		lzss_ = new LZWStringTable();
		lzss_.ClearTable(codeSize_);
		bf_.writeBits(clearCode_, numBits_);
	//*  77  140:goto            11
	}

	public void compress(byte abyte0[], int i, int j)
		throws IOException
	{
		int k = i;
	//    0    0:iload_2         
	//    1    1:istore          6
		while(k < i + j) 
	//*   2    3:iload           6
	//*   3    5:iload_2         
	//*   4    6:iload_3         
	//*   5    7:iadd            
	//*   6    8:icmpge          190
		{
			byte byte0 = abyte0[k];
	//    7   11:aload_1         
	//    8   12:iload           6
	//    9   14:baload          
	//   10   15:istore          4
			short word0 = lzss_.FindCharString(prefix_, byte0);
	//   11   17:aload_0         
	//   12   18:getfield        #51  <Field LZWStringTable lzss_>
	//   13   21:aload_0         
	//   14   22:getfield        #46  <Field short prefix_>
	//   15   25:iload           4
	//   16   27:invokevirtual   #67  <Method short LZWStringTable.FindCharString(short, byte)>
	//   17   30:istore          5
			if(word0 != -1)
	//*  18   32:iload           5
	//*  19   34:iconst_m1       
	//*  20   35:icmpeq          53
			{
				prefix_ = word0;
	//   21   38:aload_0         
	//   22   39:iload           5
	//   23   41:putfield        #46  <Field short prefix_>
			} else
	//*  24   44:iload           6
	//*  25   46:iconst_1        
	//*  26   47:iadd            
	//*  27   48:istore          6
	//*  28   50:goto            3
			{
				bf_.writeBits(((int) (prefix_)), numBits_);
	//   29   53:aload_0         
	//   30   54:getfield        #32  <Field BitFile bf_>
	//   31   57:aload_0         
	//   32   58:getfield        #46  <Field short prefix_>
	//   33   61:aload_0         
	//   34   62:getfield        #42  <Field int numBits_>
	//   35   65:invokevirtual   #59  <Method void BitFile.writeBits(int, int)>
				if(lzss_.AddCharString(prefix_, byte0) > limit_)
	//*  36   68:aload_0         
	//*  37   69:getfield        #51  <Field LZWStringTable lzss_>
	//*  38   72:aload_0         
	//*  39   73:getfield        #46  <Field short prefix_>
	//*  40   76:iload           4
	//*  41   78:invokevirtual   #71  <Method int LZWStringTable.AddCharString(short, byte)>
	//*  42   81:aload_0         
	//*  43   82:getfield        #44  <Field int limit_>
	//*  44   85:icmple          162
				{
					if(numBits_ == 12)
	//*  45   88:aload_0         
	//*  46   89:getfield        #42  <Field int numBits_>
	//*  47   92:bipush          12
	//*  48   94:icmpne          177
					{
						bf_.writeBits(clearCode_, numBits_);
	//   49   97:aload_0         
	//   50   98:getfield        #32  <Field BitFile bf_>
	//   51  101:aload_0         
	//   52  102:getfield        #38  <Field int clearCode_>
	//   53  105:aload_0         
	//   54  106:getfield        #42  <Field int numBits_>
	//   55  109:invokevirtual   #59  <Method void BitFile.writeBits(int, int)>
						lzss_.ClearTable(codeSize_);
	//   56  112:aload_0         
	//   57  113:getfield        #51  <Field LZWStringTable lzss_>
	//   58  116:aload_0         
	//   59  117:getfield        #34  <Field int codeSize_>
	//   60  120:invokevirtual   #55  <Method void LZWStringTable.ClearTable(int)>
						numBits_ = codeSize_ + 1;
	//   61  123:aload_0         
	//   62  124:aload_0         
	//   63  125:getfield        #34  <Field int codeSize_>
	//   64  128:iconst_1        
	//   65  129:iadd            
	//   66  130:putfield        #42  <Field int numBits_>
					} else
	//*  67  133:aload_0         
	//*  68  134:iconst_1        
	//*  69  135:aload_0         
	//*  70  136:getfield        #42  <Field int numBits_>
	//*  71  139:ishl            
	//*  72  140:iconst_1        
	//*  73  141:isub            
	//*  74  142:putfield        #44  <Field int limit_>
	//*  75  145:aload_0         
	//*  76  146:getfield        #36  <Field boolean tiffFudge_>
	//*  77  149:ifeq            162
	//*  78  152:aload_0         
	//*  79  153:aload_0         
	//*  80  154:getfield        #44  <Field int limit_>
	//*  81  157:iconst_1        
	//*  82  158:isub            
	//*  83  159:putfield        #44  <Field int limit_>
	//*  84  162:aload_0         
	//*  85  163:iload           4
	//*  86  165:int2short       
	//*  87  166:sipush          255
	//*  88  169:iand            
	//*  89  170:int2short       
	//*  90  171:putfield        #46  <Field short prefix_>
	//*  91  174:goto            44
					{
						numBits_ = numBits_ + 1;
	//   92  177:aload_0         
	//   93  178:aload_0         
	//   94  179:getfield        #42  <Field int numBits_>
	//   95  182:iconst_1        
	//   96  183:iadd            
	//   97  184:putfield        #42  <Field int numBits_>
					}
					limit_ = (1 << numBits_) - 1;
					if(tiffFudge_)
						limit_ = limit_ - 1;
				}
				prefix_ = (short)((short)byte0 & 0xff);
			}
			k++;
		}
	//*  98  187:goto            133
	//   99  190:return          
	}

	public void flush()
		throws IOException
	{
		if(prefix_ != -1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #46  <Field short prefix_>
	//*   2    4:iconst_m1       
	//*   3    5:icmpeq          23
			bf_.writeBits(((int) (prefix_)), numBits_);
	//    4    8:aload_0         
	//    5    9:getfield        #32  <Field BitFile bf_>
	//    6   12:aload_0         
	//    7   13:getfield        #46  <Field short prefix_>
	//    8   16:aload_0         
	//    9   17:getfield        #42  <Field int numBits_>
	//   10   20:invokevirtual   #59  <Method void BitFile.writeBits(int, int)>
		bf_.writeBits(endOfInfo_, numBits_);
	//   11   23:aload_0         
	//   12   24:getfield        #32  <Field BitFile bf_>
	//   13   27:aload_0         
	//   14   28:getfield        #40  <Field int endOfInfo_>
	//   15   31:aload_0         
	//   16   32:getfield        #42  <Field int numBits_>
	//   17   35:invokevirtual   #59  <Method void BitFile.writeBits(int, int)>
		bf_.flush();
	//   18   38:aload_0         
	//   19   39:getfield        #32  <Field BitFile bf_>
	//   20   42:invokevirtual   #74  <Method void BitFile.flush()>
	//   21   45:return          
	}

	BitFile bf_;
	int clearCode_;
	int codeSize_;
	int endOfInfo_;
	int limit_;
	LZWStringTable lzss_;
	int numBits_;
	short prefix_;
	boolean tiffFudge_;
}
