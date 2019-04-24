// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.codec.CCITTG4Encoder;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.Hashtable;

// Referenced classes of package com.itextpdf.text.pdf:
//			PdfContentByte

public class BarcodeDatamatrix
{
	private static class DmParams
	{

		int dataBlock;
		int dataSize;
		int errorBlock;
		int height;
		int heightSection;
		int width;
		int widthSection;

		DmParams(int i, int j, int k, int l, int i1, int j1, int k1)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #20  <Method void Object()>
			height = i;
		//    2    4:aload_0         
		//    3    5:iload_1         
		//    4    6:putfield        #22  <Field int height>
			width = j;
		//    5    9:aload_0         
		//    6   10:iload_2         
		//    7   11:putfield        #24  <Field int width>
			heightSection = k;
		//    8   14:aload_0         
		//    9   15:iload_3         
		//   10   16:putfield        #26  <Field int heightSection>
			widthSection = l;
		//   11   19:aload_0         
		//   12   20:iload           4
		//   13   22:putfield        #28  <Field int widthSection>
			dataSize = i1;
		//   14   25:aload_0         
		//   15   26:iload           5
		//   16   28:putfield        #30  <Field int dataSize>
			dataBlock = j1;
		//   17   31:aload_0         
		//   18   32:iload           6
		//   19   34:putfield        #32  <Field int dataBlock>
			errorBlock = k1;
		//   20   37:aload_0         
		//   21   38:iload           7
		//   22   40:putfield        #34  <Field int errorBlock>
		//   23   43:return          
		}
	}

	static class Placement
	{

		private void corner1(int i)
		{
			module(nrow - 1, 0, i, 0);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #30  <Field int nrow>
		//    3    5:iconst_1        
		//    4    6:isub            
		//    5    7:iconst_0        
		//    6    8:iload_1         
		//    7    9:iconst_0        
		//    8   10:invokespecial   #34  <Method void module(int, int, int, int)>
			module(nrow - 1, 1, i, 1);
		//    9   13:aload_0         
		//   10   14:aload_0         
		//   11   15:getfield        #30  <Field int nrow>
		//   12   18:iconst_1        
		//   13   19:isub            
		//   14   20:iconst_1        
		//   15   21:iload_1         
		//   16   22:iconst_1        
		//   17   23:invokespecial   #34  <Method void module(int, int, int, int)>
			module(nrow - 1, 2, i, 2);
		//   18   26:aload_0         
		//   19   27:aload_0         
		//   20   28:getfield        #30  <Field int nrow>
		//   21   31:iconst_1        
		//   22   32:isub            
		//   23   33:iconst_2        
		//   24   34:iload_1         
		//   25   35:iconst_2        
		//   26   36:invokespecial   #34  <Method void module(int, int, int, int)>
			module(0, ncol - 2, i, 3);
		//   27   39:aload_0         
		//   28   40:iconst_0        
		//   29   41:aload_0         
		//   30   42:getfield        #36  <Field int ncol>
		//   31   45:iconst_2        
		//   32   46:isub            
		//   33   47:iload_1         
		//   34   48:iconst_3        
		//   35   49:invokespecial   #34  <Method void module(int, int, int, int)>
			module(0, ncol - 1, i, 4);
		//   36   52:aload_0         
		//   37   53:iconst_0        
		//   38   54:aload_0         
		//   39   55:getfield        #36  <Field int ncol>
		//   40   58:iconst_1        
		//   41   59:isub            
		//   42   60:iload_1         
		//   43   61:iconst_4        
		//   44   62:invokespecial   #34  <Method void module(int, int, int, int)>
			module(1, ncol - 1, i, 5);
		//   45   65:aload_0         
		//   46   66:iconst_1        
		//   47   67:aload_0         
		//   48   68:getfield        #36  <Field int ncol>
		//   49   71:iconst_1        
		//   50   72:isub            
		//   51   73:iload_1         
		//   52   74:iconst_5        
		//   53   75:invokespecial   #34  <Method void module(int, int, int, int)>
			module(2, ncol - 1, i, 6);
		//   54   78:aload_0         
		//   55   79:iconst_2        
		//   56   80:aload_0         
		//   57   81:getfield        #36  <Field int ncol>
		//   58   84:iconst_1        
		//   59   85:isub            
		//   60   86:iload_1         
		//   61   87:bipush          6
		//   62   89:invokespecial   #34  <Method void module(int, int, int, int)>
			module(3, ncol - 1, i, 7);
		//   63   92:aload_0         
		//   64   93:iconst_3        
		//   65   94:aload_0         
		//   66   95:getfield        #36  <Field int ncol>
		//   67   98:iconst_1        
		//   68   99:isub            
		//   69  100:iload_1         
		//   70  101:bipush          7
		//   71  103:invokespecial   #34  <Method void module(int, int, int, int)>
		//   72  106:return          
		}

		private void corner2(int i)
		{
			module(nrow - 3, 0, i, 0);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #30  <Field int nrow>
		//    3    5:iconst_3        
		//    4    6:isub            
		//    5    7:iconst_0        
		//    6    8:iload_1         
		//    7    9:iconst_0        
		//    8   10:invokespecial   #34  <Method void module(int, int, int, int)>
			module(nrow - 2, 0, i, 1);
		//    9   13:aload_0         
		//   10   14:aload_0         
		//   11   15:getfield        #30  <Field int nrow>
		//   12   18:iconst_2        
		//   13   19:isub            
		//   14   20:iconst_0        
		//   15   21:iload_1         
		//   16   22:iconst_1        
		//   17   23:invokespecial   #34  <Method void module(int, int, int, int)>
			module(nrow - 1, 0, i, 2);
		//   18   26:aload_0         
		//   19   27:aload_0         
		//   20   28:getfield        #30  <Field int nrow>
		//   21   31:iconst_1        
		//   22   32:isub            
		//   23   33:iconst_0        
		//   24   34:iload_1         
		//   25   35:iconst_2        
		//   26   36:invokespecial   #34  <Method void module(int, int, int, int)>
			module(0, ncol - 4, i, 3);
		//   27   39:aload_0         
		//   28   40:iconst_0        
		//   29   41:aload_0         
		//   30   42:getfield        #36  <Field int ncol>
		//   31   45:iconst_4        
		//   32   46:isub            
		//   33   47:iload_1         
		//   34   48:iconst_3        
		//   35   49:invokespecial   #34  <Method void module(int, int, int, int)>
			module(0, ncol - 3, i, 4);
		//   36   52:aload_0         
		//   37   53:iconst_0        
		//   38   54:aload_0         
		//   39   55:getfield        #36  <Field int ncol>
		//   40   58:iconst_3        
		//   41   59:isub            
		//   42   60:iload_1         
		//   43   61:iconst_4        
		//   44   62:invokespecial   #34  <Method void module(int, int, int, int)>
			module(0, ncol - 2, i, 5);
		//   45   65:aload_0         
		//   46   66:iconst_0        
		//   47   67:aload_0         
		//   48   68:getfield        #36  <Field int ncol>
		//   49   71:iconst_2        
		//   50   72:isub            
		//   51   73:iload_1         
		//   52   74:iconst_5        
		//   53   75:invokespecial   #34  <Method void module(int, int, int, int)>
			module(0, ncol - 1, i, 6);
		//   54   78:aload_0         
		//   55   79:iconst_0        
		//   56   80:aload_0         
		//   57   81:getfield        #36  <Field int ncol>
		//   58   84:iconst_1        
		//   59   85:isub            
		//   60   86:iload_1         
		//   61   87:bipush          6
		//   62   89:invokespecial   #34  <Method void module(int, int, int, int)>
			module(1, ncol - 1, i, 7);
		//   63   92:aload_0         
		//   64   93:iconst_1        
		//   65   94:aload_0         
		//   66   95:getfield        #36  <Field int ncol>
		//   67   98:iconst_1        
		//   68   99:isub            
		//   69  100:iload_1         
		//   70  101:bipush          7
		//   71  103:invokespecial   #34  <Method void module(int, int, int, int)>
		//   72  106:return          
		}

		private void corner3(int i)
		{
			module(nrow - 3, 0, i, 0);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #30  <Field int nrow>
		//    3    5:iconst_3        
		//    4    6:isub            
		//    5    7:iconst_0        
		//    6    8:iload_1         
		//    7    9:iconst_0        
		//    8   10:invokespecial   #34  <Method void module(int, int, int, int)>
			module(nrow - 2, 0, i, 1);
		//    9   13:aload_0         
		//   10   14:aload_0         
		//   11   15:getfield        #30  <Field int nrow>
		//   12   18:iconst_2        
		//   13   19:isub            
		//   14   20:iconst_0        
		//   15   21:iload_1         
		//   16   22:iconst_1        
		//   17   23:invokespecial   #34  <Method void module(int, int, int, int)>
			module(nrow - 1, 0, i, 2);
		//   18   26:aload_0         
		//   19   27:aload_0         
		//   20   28:getfield        #30  <Field int nrow>
		//   21   31:iconst_1        
		//   22   32:isub            
		//   23   33:iconst_0        
		//   24   34:iload_1         
		//   25   35:iconst_2        
		//   26   36:invokespecial   #34  <Method void module(int, int, int, int)>
			module(0, ncol - 2, i, 3);
		//   27   39:aload_0         
		//   28   40:iconst_0        
		//   29   41:aload_0         
		//   30   42:getfield        #36  <Field int ncol>
		//   31   45:iconst_2        
		//   32   46:isub            
		//   33   47:iload_1         
		//   34   48:iconst_3        
		//   35   49:invokespecial   #34  <Method void module(int, int, int, int)>
			module(0, ncol - 1, i, 4);
		//   36   52:aload_0         
		//   37   53:iconst_0        
		//   38   54:aload_0         
		//   39   55:getfield        #36  <Field int ncol>
		//   40   58:iconst_1        
		//   41   59:isub            
		//   42   60:iload_1         
		//   43   61:iconst_4        
		//   44   62:invokespecial   #34  <Method void module(int, int, int, int)>
			module(1, ncol - 1, i, 5);
		//   45   65:aload_0         
		//   46   66:iconst_1        
		//   47   67:aload_0         
		//   48   68:getfield        #36  <Field int ncol>
		//   49   71:iconst_1        
		//   50   72:isub            
		//   51   73:iload_1         
		//   52   74:iconst_5        
		//   53   75:invokespecial   #34  <Method void module(int, int, int, int)>
			module(2, ncol - 1, i, 6);
		//   54   78:aload_0         
		//   55   79:iconst_2        
		//   56   80:aload_0         
		//   57   81:getfield        #36  <Field int ncol>
		//   58   84:iconst_1        
		//   59   85:isub            
		//   60   86:iload_1         
		//   61   87:bipush          6
		//   62   89:invokespecial   #34  <Method void module(int, int, int, int)>
			module(3, ncol - 1, i, 7);
		//   63   92:aload_0         
		//   64   93:iconst_3        
		//   65   94:aload_0         
		//   66   95:getfield        #36  <Field int ncol>
		//   67   98:iconst_1        
		//   68   99:isub            
		//   69  100:iload_1         
		//   70  101:bipush          7
		//   71  103:invokespecial   #34  <Method void module(int, int, int, int)>
		//   72  106:return          
		}

		private void corner4(int i)
		{
			module(nrow - 1, 0, i, 0);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #30  <Field int nrow>
		//    3    5:iconst_1        
		//    4    6:isub            
		//    5    7:iconst_0        
		//    6    8:iload_1         
		//    7    9:iconst_0        
		//    8   10:invokespecial   #34  <Method void module(int, int, int, int)>
			module(nrow - 1, ncol - 1, i, 1);
		//    9   13:aload_0         
		//   10   14:aload_0         
		//   11   15:getfield        #30  <Field int nrow>
		//   12   18:iconst_1        
		//   13   19:isub            
		//   14   20:aload_0         
		//   15   21:getfield        #36  <Field int ncol>
		//   16   24:iconst_1        
		//   17   25:isub            
		//   18   26:iload_1         
		//   19   27:iconst_1        
		//   20   28:invokespecial   #34  <Method void module(int, int, int, int)>
			module(0, ncol - 3, i, 2);
		//   21   31:aload_0         
		//   22   32:iconst_0        
		//   23   33:aload_0         
		//   24   34:getfield        #36  <Field int ncol>
		//   25   37:iconst_3        
		//   26   38:isub            
		//   27   39:iload_1         
		//   28   40:iconst_2        
		//   29   41:invokespecial   #34  <Method void module(int, int, int, int)>
			module(0, ncol - 2, i, 3);
		//   30   44:aload_0         
		//   31   45:iconst_0        
		//   32   46:aload_0         
		//   33   47:getfield        #36  <Field int ncol>
		//   34   50:iconst_2        
		//   35   51:isub            
		//   36   52:iload_1         
		//   37   53:iconst_3        
		//   38   54:invokespecial   #34  <Method void module(int, int, int, int)>
			module(0, ncol - 1, i, 4);
		//   39   57:aload_0         
		//   40   58:iconst_0        
		//   41   59:aload_0         
		//   42   60:getfield        #36  <Field int ncol>
		//   43   63:iconst_1        
		//   44   64:isub            
		//   45   65:iload_1         
		//   46   66:iconst_4        
		//   47   67:invokespecial   #34  <Method void module(int, int, int, int)>
			module(1, ncol - 3, i, 5);
		//   48   70:aload_0         
		//   49   71:iconst_1        
		//   50   72:aload_0         
		//   51   73:getfield        #36  <Field int ncol>
		//   52   76:iconst_3        
		//   53   77:isub            
		//   54   78:iload_1         
		//   55   79:iconst_5        
		//   56   80:invokespecial   #34  <Method void module(int, int, int, int)>
			module(1, ncol - 2, i, 6);
		//   57   83:aload_0         
		//   58   84:iconst_1        
		//   59   85:aload_0         
		//   60   86:getfield        #36  <Field int ncol>
		//   61   89:iconst_2        
		//   62   90:isub            
		//   63   91:iload_1         
		//   64   92:bipush          6
		//   65   94:invokespecial   #34  <Method void module(int, int, int, int)>
			module(1, ncol - 1, i, 7);
		//   66   97:aload_0         
		//   67   98:iconst_1        
		//   68   99:aload_0         
		//   69  100:getfield        #36  <Field int ncol>
		//   70  103:iconst_1        
		//   71  104:isub            
		//   72  105:iload_1         
		//   73  106:bipush          7
		//   74  108:invokespecial   #34  <Method void module(int, int, int, int)>
		//   75  111:return          
		}

		static short[] doPlacement(int i, int j)
		{
			Integer integer = Integer.valueOf(i * 1000 + j);
		//    0    0:iload_0         
		//    1    1:sipush          1000
		//    2    4:imul            
		//    3    5:iload_1         
		//    4    6:iadd            
		//    5    7:invokestatic    #47  <Method Integer Integer.valueOf(int)>
		//    6   10:astore_2        
			short aword0[] = (short[])cache.get(((Object) (integer)));
		//    7   11:getstatic       #24  <Field Hashtable cache>
		//    8   14:aload_2         
		//    9   15:invokevirtual   #51  <Method Object Hashtable.get(Object)>
		//   10   18:checkcast       #52  <Class short[]>
		//   11   21:astore_3        
			if(aword0 != null)
		//*  12   22:aload_3         
		//*  13   23:ifnull          28
			{
				return aword0;
		//   14   26:aload_3         
		//   15   27:areturn         
			} else
			{
				Placement placement = new Placement();
		//   16   28:new             #2   <Class BarcodeDatamatrix$Placement>
		//   17   31:dup             
		//   18   32:invokespecial   #53  <Method void BarcodeDatamatrix$Placement()>
		//   19   35:astore_3        
				placement.nrow = i;
		//   20   36:aload_3         
		//   21   37:iload_0         
		//   22   38:putfield        #30  <Field int nrow>
				placement.ncol = j;
		//   23   41:aload_3         
		//   24   42:iload_1         
		//   25   43:putfield        #36  <Field int ncol>
				placement.array = new short[i * j];
		//   26   46:aload_3         
		//   27   47:iload_0         
		//   28   48:iload_1         
		//   29   49:imul            
		//   30   50:newarray        short[]
		//   31   52:putfield        #55  <Field short[] array>
				placement.ecc200();
		//   32   55:aload_3         
		//   33   56:invokespecial   #58  <Method void ecc200()>
				cache.put(((Object) (integer)), ((Object) (placement.array)));
		//   34   59:getstatic       #24  <Field Hashtable cache>
		//   35   62:aload_2         
		//   36   63:aload_3         
		//   37   64:getfield        #55  <Field short[] array>
		//   38   67:invokevirtual   #62  <Method Object Hashtable.put(Object, Object)>
		//   39   70:pop             
				return placement.array;
		//   40   71:aload_3         
		//   41   72:getfield        #55  <Field short[] array>
		//   42   75:areturn         
			}
		}

		private void ecc200()
		{
			Arrays.fill(array, (short)0);
		//    0    0:aload_0         
		//    1    1:getfield        #55  <Field short[] array>
		//    2    4:iconst_0        
		//    3    5:invokestatic    #68  <Method void Arrays.fill(short[], short)>
			int j1 = 1;
		//    4    8:iconst_1        
		//    5    9:istore          4
			int k = 4;
		//    6   11:iconst_4        
		//    7   12:istore_2        
			int i1 = 0;
		//    8   13:iconst_0        
		//    9   14:istore_3        
			int l1;
			do
			{
				int i;
				int k1;
				do
				{
					i = j1;
		//   10   15:iload           4
		//   11   17:istore_1        
					if(k == nrow)
		//*  12   18:iload_2         
		//*  13   19:aload_0         
		//*  14   20:getfield        #30  <Field int nrow>
		//*  15   23:icmpne          44
					{
						i = j1;
		//   16   26:iload           4
		//   17   28:istore_1        
						if(i1 == 0)
		//*  18   29:iload_3         
		//*  19   30:ifne            44
						{
							corner1(j1);
		//   20   33:aload_0         
		//   21   34:iload           4
		//   22   36:invokespecial   #70  <Method void corner1(int)>
							i = j1 + 1;
		//   23   39:iload           4
		//   24   41:iconst_1        
		//   25   42:iadd            
		//   26   43:istore_1        
						}
					}
					k1 = i;
		//   27   44:iload_1         
		//   28   45:istore          5
					if(k == nrow - 2)
		//*  29   47:iload_2         
		//*  30   48:aload_0         
		//*  31   49:getfield        #30  <Field int nrow>
		//*  32   52:iconst_2        
		//*  33   53:isub            
		//*  34   54:icmpne          86
					{
						k1 = i;
		//   35   57:iload_1         
		//   36   58:istore          5
						if(i1 == 0)
		//*  37   60:iload_3         
		//*  38   61:ifne            86
						{
							k1 = i;
		//   39   64:iload_1         
		//   40   65:istore          5
							if(ncol % 4 != 0)
		//*  41   67:aload_0         
		//*  42   68:getfield        #36  <Field int ncol>
		//*  43   71:iconst_4        
		//*  44   72:irem            
		//*  45   73:ifeq            86
							{
								corner2(i);
		//   46   76:aload_0         
		//   47   77:iload_1         
		//   48   78:invokespecial   #72  <Method void corner2(int)>
								k1 = i + 1;
		//   49   81:iload_1         
		//   50   82:iconst_1        
		//   51   83:iadd            
		//   52   84:istore          5
							}
						}
					}
					j1 = k1;
		//   53   86:iload           5
		//   54   88:istore          4
					if(k == nrow - 2)
		//*  55   90:iload_2         
		//*  56   91:aload_0         
		//*  57   92:getfield        #30  <Field int nrow>
		//*  58   95:iconst_2        
		//*  59   96:isub            
		//*  60   97:icmpne          135
					{
						j1 = k1;
		//   61  100:iload           5
		//   62  102:istore          4
						if(i1 == 0)
		//*  63  104:iload_3         
		//*  64  105:ifne            135
						{
							j1 = k1;
		//   65  108:iload           5
		//   66  110:istore          4
							if(ncol % 8 == 4)
		//*  67  112:aload_0         
		//*  68  113:getfield        #36  <Field int ncol>
		//*  69  116:bipush          8
		//*  70  118:irem            
		//*  71  119:iconst_4        
		//*  72  120:icmpne          135
							{
								corner3(k1);
		//   73  123:aload_0         
		//   74  124:iload           5
		//   75  126:invokespecial   #74  <Method void corner3(int)>
								j1 = k1 + 1;
		//   76  129:iload           5
		//   77  131:iconst_1        
		//   78  132:iadd            
		//   79  133:istore          4
							}
						}
					}
					i = j1;
		//   80  135:iload           4
		//   81  137:istore_1        
					k1 = i1;
		//   82  138:iload_3         
		//   83  139:istore          5
					l1 = k;
		//   84  141:iload_2         
		//   85  142:istore          6
					if(k == nrow + 4)
		//*  86  144:iload_2         
		//*  87  145:aload_0         
		//*  88  146:getfield        #30  <Field int nrow>
		//*  89  149:iconst_4        
		//*  90  150:iadd            
		//*  91  151:icmpne          204
					{
						i = j1;
		//   92  154:iload           4
		//   93  156:istore_1        
						k1 = i1;
		//   94  157:iload_3         
		//   95  158:istore          5
						l1 = k;
		//   96  160:iload_2         
		//   97  161:istore          6
						if(i1 == 2)
		//*  98  163:iload_3         
		//*  99  164:iconst_2        
		//* 100  165:icmpne          204
						{
							i = j1;
		//  101  168:iload           4
		//  102  170:istore_1        
							k1 = i1;
		//  103  171:iload_3         
		//  104  172:istore          5
							l1 = k;
		//  105  174:iload_2         
		//  106  175:istore          6
							if(ncol % 8 == 0)
		//* 107  177:aload_0         
		//* 108  178:getfield        #36  <Field int ncol>
		//* 109  181:bipush          8
		//* 110  183:irem            
		//* 111  184:ifne            204
							{
								corner4(j1);
		//  112  187:aload_0         
		//  113  188:iload           4
		//  114  190:invokespecial   #76  <Method void corner4(int)>
								i = j1 + 1;
		//  115  193:iload           4
		//  116  195:iconst_1        
		//  117  196:iadd            
		//  118  197:istore_1        
								l1 = k;
		//  119  198:iload_2         
		//  120  199:istore          6
								k1 = i1;
		//  121  201:iload_3         
		//  122  202:istore          5
							}
						}
					}
					do
					{
						k = i;
		//  123  204:iload_1         
		//  124  205:istore_2        
						if(l1 < nrow)
		//* 125  206:iload           6
		//* 126  208:aload_0         
		//* 127  209:getfield        #30  <Field int nrow>
		//* 128  212:icmpge          255
						{
							k = i;
		//  129  215:iload_1         
		//  130  216:istore_2        
							if(k1 >= 0)
		//* 131  217:iload           5
		//* 132  219:iflt            255
							{
								k = i;
		//  133  222:iload_1         
		//  134  223:istore_2        
								if(array[ncol * l1 + k1] == 0)
		//* 135  224:aload_0         
		//* 136  225:getfield        #55  <Field short[] array>
		//* 137  228:aload_0         
		//* 138  229:getfield        #36  <Field int ncol>
		//* 139  232:iload           6
		//* 140  234:imul            
		//* 141  235:iload           5
		//* 142  237:iadd            
		//* 143  238:saload          
		//* 144  239:ifne            255
								{
									utah(l1, k1, i);
		//  145  242:aload_0         
		//  146  243:iload           6
		//  147  245:iload           5
		//  148  247:iload_1         
		//  149  248:invokespecial   #80  <Method void utah(int, int, int)>
									k = i + 1;
		//  150  251:iload_1         
		//  151  252:iconst_1        
		//  152  253:iadd            
		//  153  254:istore_2        
								}
							}
						}
						j1 = l1 - 2;
		//  154  255:iload           6
		//  155  257:iconst_2        
		//  156  258:isub            
		//  157  259:istore          4
						i1 = k1 + 2;
		//  158  261:iload           5
		//  159  263:iconst_2        
		//  160  264:iadd            
		//  161  265:istore_3        
						if(j1 < 0)
							break;
		//  162  266:iload           4
		//  163  268:iflt            288
						i = k;
		//  164  271:iload_2         
		//  165  272:istore_1        
						k1 = i1;
		//  166  273:iload_3         
		//  167  274:istore          5
						l1 = j1;
		//  168  276:iload           4
		//  169  278:istore          6
					} while(i1 < ncol);
		//  170  280:iload_3         
		//  171  281:aload_0         
		//  172  282:getfield        #36  <Field int ncol>
		//  173  285:icmplt          204
					j1++;
		//  174  288:iload           4
		//  175  290:iconst_1        
		//  176  291:iadd            
		//  177  292:istore          4
					k1 = i1 + 3;
		//  178  294:iload_3         
		//  179  295:iconst_3        
		//  180  296:iadd            
		//  181  297:istore          5
					i = k;
		//  182  299:iload_2         
		//  183  300:istore_1        
					i1 = j1;
		//  184  301:iload           4
		//  185  303:istore_3        
					k = k1;
		//  186  304:iload           5
		//  187  306:istore_2        
					do
					{
						if(i1 >= 0 && k < ncol && array[ncol * i1 + k] == 0)
		//* 188  307:iload_3         
		//* 189  308:iflt            486
		//* 190  311:iload_2         
		//* 191  312:aload_0         
		//* 192  313:getfield        #36  <Field int ncol>
		//* 193  316:icmpge          486
		//* 194  319:aload_0         
		//* 195  320:getfield        #55  <Field short[] array>
		//* 196  323:aload_0         
		//* 197  324:getfield        #36  <Field int ncol>
		//* 198  327:iload_3         
		//* 199  328:imul            
		//* 200  329:iload_2         
		//* 201  330:iadd            
		//* 202  331:saload          
		//* 203  332:ifne            486
						{
							j1 = i + 1;
		//  204  335:iload_1         
		//  205  336:iconst_1        
		//  206  337:iadd            
		//  207  338:istore          4
							utah(i1, k, i);
		//  208  340:aload_0         
		//  209  341:iload_3         
		//  210  342:iload_2         
		//  211  343:iload_1         
		//  212  344:invokespecial   #80  <Method void utah(int, int, int)>
							i = j1;
		//  213  347:iload           4
		//  214  349:istore_1        
						}
						i1 += 2;
		//  215  350:iload_3         
		//  216  351:iconst_2        
		//  217  352:iadd            
		//  218  353:istore_3        
						k -= 2;
		//  219  354:iload_2         
		//  220  355:iconst_2        
		//  221  356:isub            
		//  222  357:istore_2        
					} while(i1 < nrow && k >= 0);
		//  223  358:iload_3         
		//  224  359:aload_0         
		//  225  360:getfield        #30  <Field int nrow>
		//  226  363:icmpge          370
		//  227  366:iload_2         
		//  228  367:ifge            483
					k1 = i1 + 3;
		//  229  370:iload_3         
		//  230  371:iconst_3        
		//  231  372:iadd            
		//  232  373:istore          5
					l1 = k + 1;
		//  233  375:iload_2         
		//  234  376:iconst_1        
		//  235  377:iadd            
		//  236  378:istore          6
					j1 = i;
		//  237  380:iload_1         
		//  238  381:istore          4
					i1 = l1;
		//  239  383:iload           6
		//  240  385:istore_3        
					k = k1;
		//  241  386:iload           5
		//  242  388:istore_2        
				} while(k1 < nrow);
		//  243  389:iload           5
		//  244  391:aload_0         
		//  245  392:getfield        #30  <Field int nrow>
		//  246  395:icmplt          15
				j1 = i;
		//  247  398:iload_1         
		//  248  399:istore          4
				i1 = l1;
		//  249  401:iload           6
		//  250  403:istore_3        
				k = k1;
		//  251  404:iload           5
		//  252  406:istore_2        
			} while(l1 < ncol);
		//  253  407:iload           6
		//  254  409:aload_0         
		//  255  410:getfield        #36  <Field int ncol>
		//  256  413:icmplt          15
			if(array[nrow * ncol - 1] == 0)
		//* 257  416:aload_0         
		//* 258  417:getfield        #55  <Field short[] array>
		//* 259  420:aload_0         
		//* 260  421:getfield        #30  <Field int nrow>
		//* 261  424:aload_0         
		//* 262  425:getfield        #36  <Field int ncol>
		//* 263  428:imul            
		//* 264  429:iconst_1        
		//* 265  430:isub            
		//* 266  431:saload          
		//* 267  432:ifne            482
			{
				short aword0[] = array;
		//  268  435:aload_0         
		//  269  436:getfield        #55  <Field short[] array>
		//  270  439:astore          7
				int j = nrow;
		//  271  441:aload_0         
		//  272  442:getfield        #30  <Field int nrow>
		//  273  445:istore_1        
				int l = ncol;
		//  274  446:aload_0         
		//  275  447:getfield        #36  <Field int ncol>
		//  276  450:istore_2        
				array[nrow * ncol - ncol - 2] = 1;
		//  277  451:aload_0         
		//  278  452:getfield        #55  <Field short[] array>
		//  279  455:aload_0         
		//  280  456:getfield        #30  <Field int nrow>
		//  281  459:aload_0         
		//  282  460:getfield        #36  <Field int ncol>
		//  283  463:imul            
		//  284  464:aload_0         
		//  285  465:getfield        #36  <Field int ncol>
		//  286  468:isub            
		//  287  469:iconst_2        
		//  288  470:isub            
		//  289  471:iconst_1        
		//  290  472:sastore         
				aword0[j * l - 1] = 1;
		//  291  473:aload           7
		//  292  475:iload_1         
		//  293  476:iload_2         
		//  294  477:imul            
		//  295  478:iconst_1        
		//  296  479:isub            
		//  297  480:iconst_1        
		//  298  481:sastore         
			}
		//  299  482:return          
		//* 300  483:goto            307
		//* 301  486:goto            350
		}

		private void module(int i, int j, int k, int l)
		{
			int i1 = i;
		//    0    0:iload_1         
		//    1    1:istore          5
			int j1 = j;
		//    2    3:iload_2         
		//    3    4:istore          6
			if(i < 0)
		//*   4    6:iload_1         
		//*   5    7:ifge            33
			{
				i1 = i + nrow;
		//    6   10:iload_1         
		//    7   11:aload_0         
		//    8   12:getfield        #30  <Field int nrow>
		//    9   15:iadd            
		//   10   16:istore          5
				j1 = j + (4 - (nrow + 4) % 8);
		//   11   18:iload_2         
		//   12   19:iconst_4        
		//   13   20:aload_0         
		//   14   21:getfield        #30  <Field int nrow>
		//   15   24:iconst_4        
		//   16   25:iadd            
		//   17   26:bipush          8
		//   18   28:irem            
		//   19   29:isub            
		//   20   30:iadd            
		//   21   31:istore          6
			}
			j = i1;
		//   22   33:iload           5
		//   23   35:istore_2        
			i = j1;
		//   24   36:iload           6
		//   25   38:istore_1        
			if(j1 < 0)
		//*  26   39:iload           6
		//*  27   41:ifge            67
			{
				i = j1 + ncol;
		//   28   44:iload           6
		//   29   46:aload_0         
		//   30   47:getfield        #36  <Field int ncol>
		//   31   50:iadd            
		//   32   51:istore_1        
				j = i1 + (4 - (ncol + 4) % 8);
		//   33   52:iload           5
		//   34   54:iconst_4        
		//   35   55:aload_0         
		//   36   56:getfield        #36  <Field int ncol>
		//   37   59:iconst_4        
		//   38   60:iadd            
		//   39   61:bipush          8
		//   40   63:irem            
		//   41   64:isub            
		//   42   65:iadd            
		//   43   66:istore_2        
			}
			array[ncol * j + i] = (short)(k * 8 + l);
		//   44   67:aload_0         
		//   45   68:getfield        #55  <Field short[] array>
		//   46   71:aload_0         
		//   47   72:getfield        #36  <Field int ncol>
		//   48   75:iload_2         
		//   49   76:imul            
		//   50   77:iload_1         
		//   51   78:iadd            
		//   52   79:iload_3         
		//   53   80:bipush          8
		//   54   82:imul            
		//   55   83:iload           4
		//   56   85:iadd            
		//   57   86:int2short       
		//   58   87:sastore         
		//   59   88:return          
		}

		private void utah(int i, int j, int k)
		{
			module(i - 2, j - 2, k, 0);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:iconst_2        
		//    3    3:isub            
		//    4    4:iload_2         
		//    5    5:iconst_2        
		//    6    6:isub            
		//    7    7:iload_3         
		//    8    8:iconst_0        
		//    9    9:invokespecial   #34  <Method void module(int, int, int, int)>
			module(i - 2, j - 1, k, 1);
		//   10   12:aload_0         
		//   11   13:iload_1         
		//   12   14:iconst_2        
		//   13   15:isub            
		//   14   16:iload_2         
		//   15   17:iconst_1        
		//   16   18:isub            
		//   17   19:iload_3         
		//   18   20:iconst_1        
		//   19   21:invokespecial   #34  <Method void module(int, int, int, int)>
			module(i - 1, j - 2, k, 2);
		//   20   24:aload_0         
		//   21   25:iload_1         
		//   22   26:iconst_1        
		//   23   27:isub            
		//   24   28:iload_2         
		//   25   29:iconst_2        
		//   26   30:isub            
		//   27   31:iload_3         
		//   28   32:iconst_2        
		//   29   33:invokespecial   #34  <Method void module(int, int, int, int)>
			module(i - 1, j - 1, k, 3);
		//   30   36:aload_0         
		//   31   37:iload_1         
		//   32   38:iconst_1        
		//   33   39:isub            
		//   34   40:iload_2         
		//   35   41:iconst_1        
		//   36   42:isub            
		//   37   43:iload_3         
		//   38   44:iconst_3        
		//   39   45:invokespecial   #34  <Method void module(int, int, int, int)>
			module(i - 1, j, k, 4);
		//   40   48:aload_0         
		//   41   49:iload_1         
		//   42   50:iconst_1        
		//   43   51:isub            
		//   44   52:iload_2         
		//   45   53:iload_3         
		//   46   54:iconst_4        
		//   47   55:invokespecial   #34  <Method void module(int, int, int, int)>
			module(i, j - 2, k, 5);
		//   48   58:aload_0         
		//   49   59:iload_1         
		//   50   60:iload_2         
		//   51   61:iconst_2        
		//   52   62:isub            
		//   53   63:iload_3         
		//   54   64:iconst_5        
		//   55   65:invokespecial   #34  <Method void module(int, int, int, int)>
			module(i, j - 1, k, 6);
		//   56   68:aload_0         
		//   57   69:iload_1         
		//   58   70:iload_2         
		//   59   71:iconst_1        
		//   60   72:isub            
		//   61   73:iload_3         
		//   62   74:bipush          6
		//   63   76:invokespecial   #34  <Method void module(int, int, int, int)>
			module(i, j, k, 7);
		//   64   79:aload_0         
		//   65   80:iload_1         
		//   66   81:iload_2         
		//   67   82:iload_3         
		//   68   83:bipush          7
		//   69   85:invokespecial   #34  <Method void module(int, int, int, int)>
		//   70   88:return          
		}

		private static final Hashtable cache = new Hashtable();
		private short array[];
		private int ncol;
		private int nrow;

		static 
		{
		//    0    0:new             #19  <Class Hashtable>
		//    1    3:dup             
		//    2    4:invokespecial   #22  <Method void Hashtable()>
		//    3    7:putstatic       #24  <Field Hashtable cache>
		//*   4   10:return          
		}

		private Placement()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #26  <Method void Object()>
		//    2    4:return          
		}
	}

	static class ReedSolomon
	{

		static void generateECC(byte abyte0[], int i, int j, int k)
		{
			int k1 = (i + 2) / j;
		//    0    0:iload_1         
		//    1    1:iconst_2        
		//    2    2:iadd            
		//    3    3:iload_2         
		//    4    4:idiv            
		//    5    5:istore          6
			byte abyte1[] = new byte[256];
		//    6    7:sipush          256
		//    7   10:newarray        byte[]
		//    8   12:astore          7
			byte abyte2[] = new byte[256];
		//    9   14:sipush          256
		//   10   17:newarray        byte[]
		//   11   19:astore          8
			int ai[] = getPoly(k);
		//   12   21:iload_3         
		//   13   22:invokestatic    #74  <Method int[] getPoly(int)>
		//   14   25:astore          9
			for(j = 0; j < k1; j++)
		//*  15   27:iconst_0        
		//*  16   28:istore_2        
		//*  17   29:iload_2         
		//*  18   30:iload           6
		//*  19   32:icmpge          133
			{
				int j1 = j;
		//   20   35:iload_2         
		//   21   36:istore          5
				int l;
				for(l = 0; j1 < i; l++)
		//*  22   38:iconst_0        
		//*  23   39:istore          4
		//*  24   41:iload           5
		//*  25   43:iload_1         
		//*  26   44:icmpge          72
				{
					abyte1[l] = abyte0[j1];
		//   27   47:aload           7
		//   28   49:iload           4
		//   29   51:aload_0         
		//   30   52:iload           5
		//   31   54:baload          
		//   32   55:bastore         
					j1 += k1;
		//   33   56:iload           5
		//   34   58:iload           6
		//   35   60:iadd            
		//   36   61:istore          5
				}

		//   37   63:iload           4
		//   38   65:iconst_1        
		//   39   66:iadd            
		//   40   67:istore          4
		//*  41   69:goto            41
				reedSolomonBlock(abyte1, l, abyte2, k, ai);
		//   42   72:aload           7
		//   43   74:iload           4
		//   44   76:aload           8
		//   45   78:iload_3         
		//   46   79:aload           9
		//   47   81:invokestatic    #78  <Method void reedSolomonBlock(byte[], int, byte[], int, int[])>
				j1 = j;
		//   48   84:iload_2         
		//   49   85:istore          5
				for(int i1 = 0; j1 < k * k1; i1++)
		//*  50   87:iconst_0        
		//*  51   88:istore          4
		//*  52   90:iload           5
		//*  53   92:iload_3         
		//*  54   93:iload           6
		//*  55   95:imul            
		//*  56   96:icmpge          126
				{
					abyte0[i + j1] = abyte2[i1];
		//   57   99:aload_0         
		//   58  100:iload_1         
		//   59  101:iload           5
		//   60  103:iadd            
		//   61  104:aload           8
		//   62  106:iload           4
		//   63  108:baload          
		//   64  109:bastore         
					j1 += k1;
		//   65  110:iload           5
		//   66  112:iload           6
		//   67  114:iadd            
		//   68  115:istore          5
				}

		//   69  117:iload           4
		//   70  119:iconst_1        
		//   71  120:iadd            
		//   72  121:istore          4
			}

		//   73  123:goto            90
		//   74  126:iload_2         
		//   75  127:iconst_1        
		//   76  128:iadd            
		//   77  129:istore_2        
		//*  78  130:goto            29
		//   79  133:return          
		}

		private static int[] getPoly(int i)
		{
			switch(i)
		//*   0    0:iload_0         
			{
		//*   1    1:lookupswitch    16: default 140
		//		               5: 142
		//		               7: 146
		//		               10: 150
		//		               11: 154
		//		               12: 158
		//		               14: 162
		//		               18: 166
		//		               20: 170
		//		               24: 174
		//		               28: 178
		//		               36: 182
		//		               42: 186
		//		               48: 190
		//		               56: 194
		//		               62: 198
		//		               68: 202
			default:
				return null;
		//    2  140:aconst_null     
		//    3  141:areturn         

			case 5: // '\005'
				return poly5;
		//    4  142:getstatic       #34  <Field int[] poly5>
		//    5  145:areturn         

			case 7: // '\007'
				return poly7;
		//    6  146:getstatic       #36  <Field int[] poly7>
		//    7  149:areturn         

			case 10: // '\n'
				return poly10;
		//    8  150:getstatic       #38  <Field int[] poly10>
		//    9  153:areturn         

			case 11: // '\013'
				return poly11;
		//   10  154:getstatic       #40  <Field int[] poly11>
		//   11  157:areturn         

			case 12: // '\f'
				return poly12;
		//   12  158:getstatic       #42  <Field int[] poly12>
		//   13  161:areturn         

			case 14: // '\016'
				return poly14;
		//   14  162:getstatic       #44  <Field int[] poly14>
		//   15  165:areturn         

			case 18: // '\022'
				return poly18;
		//   16  166:getstatic       #46  <Field int[] poly18>
		//   17  169:areturn         

			case 20: // '\024'
				return poly20;
		//   18  170:getstatic       #48  <Field int[] poly20>
		//   19  173:areturn         

			case 24: // '\030'
				return poly24;
		//   20  174:getstatic       #50  <Field int[] poly24>
		//   21  177:areturn         

			case 28: // '\034'
				return poly28;
		//   22  178:getstatic       #52  <Field int[] poly28>
		//   23  181:areturn         

			case 36: // '$'
				return poly36;
		//   24  182:getstatic       #54  <Field int[] poly36>
		//   25  185:areturn         

			case 42: // '*'
				return poly42;
		//   26  186:getstatic       #56  <Field int[] poly42>
		//   27  189:areturn         

			case 48: // '0'
				return poly48;
		//   28  190:getstatic       #58  <Field int[] poly48>
		//   29  193:areturn         

			case 56: // '8'
				return poly56;
		//   30  194:getstatic       #60  <Field int[] poly56>
		//   31  197:areturn         

			case 62: // '>'
				return poly62;
		//   32  198:getstatic       #62  <Field int[] poly62>
		//   33  201:areturn         

			case 68: // 'D'
				return poly68;
		//   34  202:getstatic       #64  <Field int[] poly68>
		//   35  205:areturn         
			}
		}

		private static void reedSolomonBlock(byte abyte0[], int i, byte abyte1[], int j, int ai[])
		{
			for(int k = 0; k <= j; k++)
		//*   0    0:iconst_0        
		//*   1    1:istore          5
		//*   2    3:iload           5
		//*   3    5:iload_3         
		//*   4    6:icmpgt          23
				abyte1[k] = 0;
		//    5    9:aload_2         
		//    6   10:iload           5
		//    7   12:iconst_0        
		//    8   13:bastore         

		//    9   14:iload           5
		//   10   16:iconst_1        
		//   11   17:iadd            
		//   12   18:istore          5
		//*  13   20:goto            3
			for(int l = 0; l < i; l++)
		//*  14   23:iconst_0        
		//*  15   24:istore          5
		//*  16   26:iload           5
		//*  17   28:iload_1         
		//*  18   29:icmpge          133
			{
				int j1 = (abyte1[0] ^ abyte0[l]) & 0xff;
		//   19   32:aload_2         
		//   20   33:iconst_0        
		//   21   34:baload          
		//   22   35:aload_0         
		//   23   36:iload           5
		//   24   38:baload          
		//   25   39:ixor            
		//   26   40:sipush          255
		//   27   43:iand            
		//   28   44:istore          8
				int i1 = 0;
		//   29   46:iconst_0        
		//   30   47:istore          6
				while(i1 < j) 
		//*  31   49:iload           6
		//*  32   51:iload_3         
		//*  33   52:icmpge          124
				{
					byte byte1 = abyte1[i1 + 1];
		//   34   55:aload_2         
		//   35   56:iload           6
		//   36   58:iconst_1        
		//   37   59:iadd            
		//   38   60:baload          
		//   39   61:istore          9
					byte byte0;
					if(j1 == 0)
		//*  40   63:iload           8
		//*  41   65:ifne            90
						byte0 = 0;
		//   42   68:iconst_0        
		//   43   69:istore          7
					else
		//*  44   71:aload_2         
		//*  45   72:iload           6
		//*  46   74:iload           7
		//*  47   76:iload           9
		//*  48   78:ixor            
		//*  49   79:int2byte        
		//*  50   80:bastore         
		//*  51   81:iload           6
		//*  52   83:iconst_1        
		//*  53   84:iadd            
		//*  54   85:istore          6
		//*  55   87:goto            49
						byte0 = (byte)alog[(log[j1] + log[ai[j - i1 - 1]]) % 255];
		//   56   90:getstatic       #32  <Field int[] alog>
		//   57   93:getstatic       #30  <Field int[] log>
		//   58   96:iload           8
		//   59   98:iaload          
		//   60   99:getstatic       #30  <Field int[] log>
		//   61  102:aload           4
		//   62  104:iload_3         
		//   63  105:iload           6
		//   64  107:isub            
		//   65  108:iconst_1        
		//   66  109:isub            
		//   67  110:iaload          
		//   68  111:iaload          
		//   69  112:iadd            
		//   70  113:sipush          255
		//   71  116:irem            
		//   72  117:iaload          
		//   73  118:int2byte        
		//   74  119:istore          7
					abyte1[i1] = (byte)(byte0 ^ byte1);
					i1++;
				}
			}

		//   75  121:goto            71
		//   76  124:iload           5
		//   77  126:iconst_1        
		//   78  127:iadd            
		//   79  128:istore          5
		//*  80  130:goto            26
		//   81  133:return          
		}

		private static final int alog[] = {
			1, 2, 4, 8, 16, 32, 64, 128, 45, 90, 
			180, 69, 138, 57, 114, 228, 229, 231, 227, 235, 
			251, 219, 155, 27, 54, 108, 216, 157, 23, 46, 
			92, 184, 93, 186, 89, 178, 73, 146, 9, 18, 
			36, 72, 144, 13, 26, 52, 104, 208, 141, 55, 
			110, 220, 149, 7, 14, 28, 56, 112, 224, 237, 
			247, 195, 171, 123, 246, 193, 175, 115, 230, 225, 
			239, 243, 203, 187, 91, 182, 65, 130, 41, 82, 
			164, 101, 202, 185, 95, 190, 81, 162, 105, 210, 
			137, 63, 126, 252, 213, 135, 35, 70, 140, 53, 
			106, 212, 133, 39, 78, 156, 21, 42, 84, 168, 
			125, 250, 217, 159, 19, 38, 76, 152, 29, 58, 
			116, 232, 253, 215, 131, 43, 86, 172, 117, 234, 
			249, 223, 147, 11, 22, 44, 88, 176, 77, 154, 
			25, 50, 100, 200, 189, 87, 174, 113, 226, 233, 
			255, 211, 139, 59, 118, 236, 245, 199, 163, 107, 
			214, 129, 47, 94, 188, 85, 170, 121, 242, 201, 
			191, 83, 166, 97, 194, 169, 127, 254, 209, 143, 
			51, 102, 204, 181, 71, 142, 49, 98, 196, 165, 
			103, 206, 177, 79, 158, 17, 34, 68, 136, 61, 
			122, 244, 197, 167, 99, 198, 161, 111, 222, 145, 
			15, 30, 60, 120, 240, 205, 183, 67, 134, 33, 
			66, 132, 37, 74, 148, 5, 10, 20, 40, 80, 
			160, 109, 218, 153, 31, 62, 124, 248, 221, 151, 
			3, 6, 12, 24, 48, 96, 192, 173, 119, 238, 
			241, 207, 179, 75, 150, 1
		};
		private static final int log[] = {
			0, 255, 1, 240, 2, 225, 241, 53, 3, 38, 
			226, 133, 242, 43, 54, 210, 4, 195, 39, 114, 
			227, 106, 134, 28, 243, 140, 44, 23, 55, 118, 
			211, 234, 5, 219, 196, 96, 40, 222, 115, 103, 
			228, 78, 107, 125, 135, 8, 29, 162, 244, 186, 
			141, 180, 45, 99, 24, 49, 56, 13, 119, 153, 
			212, 199, 235, 91, 6, 76, 220, 217, 197, 11, 
			97, 184, 41, 36, 223, 253, 116, 138, 104, 193, 
			229, 86, 79, 171, 108, 165, 126, 145, 136, 34, 
			9, 74, 30, 32, 163, 84, 245, 173, 187, 204, 
			142, 81, 181, 190, 46, 88, 100, 159, 25, 231, 
			50, 207, 57, 147, 14, 67, 120, 128, 154, 248, 
			213, 167, 200, 63, 236, 110, 92, 176, 7, 161, 
			77, 124, 221, 102, 218, 95, 198, 90, 12, 152, 
			98, 48, 185, 179, 42, 209, 37, 132, 224, 52, 
			254, 239, 117, 233, 139, 22, 105, 27, 194, 113, 
			230, 206, 87, 158, 80, 189, 172, 203, 109, 175, 
			166, 62, 127, 247, 146, 66, 137, 192, 35, 252, 
			10, 183, 75, 216, 31, 83, 33, 73, 164, 144, 
			85, 170, 246, 65, 174, 61, 188, 202, 205, 157, 
			143, 169, 82, 72, 182, 215, 191, 251, 47, 178, 
			89, 151, 101, 94, 160, 123, 26, 112, 232, 21, 
			51, 238, 208, 131, 58, 69, 148, 18, 15, 16, 
			68, 17, 121, 149, 129, 19, 155, 59, 249, 70, 
			214, 250, 168, 71, 201, 156, 64, 60, 237, 130, 
			111, 20, 93, 122, 177, 150
		};
		private static final int poly10[] = {
			28, 24, 185, 166, 223, 248, 116, 255, 110, 61
		};
		private static final int poly11[] = {
			175, 138, 205, 12, 194, 168, 39, 245, 60, 97, 
			120
		};
		private static final int poly12[] = {
			41, 153, 158, 91, 61, 42, 142, 213, 97, 178, 
			100, 242
		};
		private static final int poly14[] = {
			156, 97, 192, 252, 95, 9, 157, 119, 138, 45, 
			18, 186, 83, 185
		};
		private static final int poly18[] = {
			83, 195, 100, 39, 188, 75, 66, 61, 241, 213, 
			109, 129, 94, 254, 225, 48, 90, 188
		};
		private static final int poly20[] = {
			15, 195, 244, 9, 233, 71, 168, 2, 188, 160, 
			153, 145, 253, 79, 108, 82, 27, 174, 186, 172
		};
		private static final int poly24[] = {
			52, 190, 88, 205, 109, 39, 176, 21, 155, 197, 
			251, 223, 155, 21, 5, 172, 254, 124, 12, 181, 
			184, 96, 50, 193
		};
		private static final int poly28[] = {
			211, 231, 43, 97, 71, 96, 103, 174, 37, 151, 
			170, 53, 75, 34, 249, 121, 17, 138, 110, 213, 
			141, 136, 120, 151, 233, 168, 93, 255
		};
		private static final int poly36[] = {
			245, 127, 242, 218, 130, 250, 162, 181, 102, 120, 
			84, 179, 220, 251, 80, 182, 229, 18, 2, 4, 
			68, 33, 101, 137, 95, 119, 115, 44, 175, 184, 
			59, 25, 225, 98, 81, 112
		};
		private static final int poly42[] = {
			77, 193, 137, 31, 19, 38, 22, 153, 247, 105, 
			122, 2, 245, 133, 242, 8, 175, 95, 100, 9, 
			167, 105, 214, 111, 57, 121, 21, 1, 253, 57, 
			54, 101, 248, 202, 69, 50, 150, 177, 226, 5, 
			9, 5
		};
		private static final int poly48[] = {
			245, 132, 172, 223, 96, 32, 117, 22, 238, 133, 
			238, 231, 205, 188, 237, 87, 191, 106, 16, 147, 
			118, 23, 37, 90, 170, 205, 131, 88, 120, 100, 
			66, 138, 186, 240, 82, 44, 176, 87, 187, 147, 
			160, 175, 69, 213, 92, 253, 225, 19
		};
		private static final int poly5[] = {
			228, 48, 15, 111, 62
		};
		private static final int poly56[] = {
			175, 9, 223, 238, 12, 17, 220, 208, 100, 29, 
			175, 170, 230, 192, 215, 235, 150, 159, 36, 223, 
			38, 200, 132, 54, 228, 146, 218, 234, 117, 203, 
			29, 232, 144, 238, 22, 150, 201, 117, 62, 207, 
			164, 13, 137, 245, 127, 67, 247, 28, 155, 43, 
			203, 107, 233, 53, 143, 46
		};
		private static final int poly62[] = {
			242, 93, 169, 50, 144, 210, 39, 118, 202, 188, 
			201, 189, 143, 108, 196, 37, 185, 112, 134, 230, 
			245, 63, 197, 190, 250, 106, 185, 221, 175, 64, 
			114, 71, 161, 44, 147, 6, 27, 218, 51, 63, 
			87, 10, 40, 130, 188, 17, 163, 31, 176, 170, 
			4, 107, 232, 7, 94, 166, 224, 124, 86, 47, 
			11, 204
		};
		private static final int poly68[] = {
			220, 228, 173, 89, 251, 149, 159, 56, 89, 33, 
			147, 244, 154, 36, 73, 127, 213, 136, 248, 180, 
			234, 197, 158, 177, 68, 122, 93, 213, 15, 160, 
			227, 236, 66, 139, 153, 185, 202, 167, 179, 25, 
			220, 232, 96, 210, 231, 136, 223, 239, 181, 241, 
			59, 52, 172, 25, 49, 232, 211, 189, 64, 54, 
			108, 153, 132, 63, 96, 103, 82, 186
		};
		private static final int poly7[] = {
			23, 68, 144, 134, 240, 92, 254
		};

		static 
		{
		//    0    0:sipush          256
		//    1    3:newarray        int[]
		//    2    5:dup             
		//    3    6:iconst_0        
		//    4    7:iconst_0        
		//    5    8:iastore         
		//    6    9:dup             
		//    7   10:iconst_1        
		//    8   11:sipush          255
		//    9   14:iastore         
		//   10   15:dup             
		//   11   16:iconst_2        
		//   12   17:iconst_1        
		//   13   18:iastore         
		//   14   19:dup             
		//   15   20:iconst_3        
		//   16   21:sipush          240
		//   17   24:iastore         
		//   18   25:dup             
		//   19   26:iconst_4        
		//   20   27:iconst_2        
		//   21   28:iastore         
		//   22   29:dup             
		//   23   30:iconst_5        
		//   24   31:sipush          225
		//   25   34:iastore         
		//   26   35:dup             
		//   27   36:bipush          6
		//   28   38:sipush          241
		//   29   41:iastore         
		//   30   42:dup             
		//   31   43:bipush          7
		//   32   45:bipush          53
		//   33   47:iastore         
		//   34   48:dup             
		//   35   49:bipush          8
		//   36   51:iconst_3        
		//   37   52:iastore         
		//   38   53:dup             
		//   39   54:bipush          9
		//   40   56:bipush          38
		//   41   58:iastore         
		//   42   59:dup             
		//   43   60:bipush          10
		//   44   62:sipush          226
		//   45   65:iastore         
		//   46   66:dup             
		//   47   67:bipush          11
		//   48   69:sipush          133
		//   49   72:iastore         
		//   50   73:dup             
		//   51   74:bipush          12
		//   52   76:sipush          242
		//   53   79:iastore         
		//   54   80:dup             
		//   55   81:bipush          13
		//   56   83:bipush          43
		//   57   85:iastore         
		//   58   86:dup             
		//   59   87:bipush          14
		//   60   89:bipush          54
		//   61   91:iastore         
		//   62   92:dup             
		//   63   93:bipush          15
		//   64   95:sipush          210
		//   65   98:iastore         
		//   66   99:dup             
		//   67  100:bipush          16
		//   68  102:iconst_4        
		//   69  103:iastore         
		//   70  104:dup             
		//   71  105:bipush          17
		//   72  107:sipush          195
		//   73  110:iastore         
		//   74  111:dup             
		//   75  112:bipush          18
		//   76  114:bipush          39
		//   77  116:iastore         
		//   78  117:dup             
		//   79  118:bipush          19
		//   80  120:bipush          114
		//   81  122:iastore         
		//   82  123:dup             
		//   83  124:bipush          20
		//   84  126:sipush          227
		//   85  129:iastore         
		//   86  130:dup             
		//   87  131:bipush          21
		//   88  133:bipush          106
		//   89  135:iastore         
		//   90  136:dup             
		//   91  137:bipush          22
		//   92  139:sipush          134
		//   93  142:iastore         
		//   94  143:dup             
		//   95  144:bipush          23
		//   96  146:bipush          28
		//   97  148:iastore         
		//   98  149:dup             
		//   99  150:bipush          24
		//  100  152:sipush          243
		//  101  155:iastore         
		//  102  156:dup             
		//  103  157:bipush          25
		//  104  159:sipush          140
		//  105  162:iastore         
		//  106  163:dup             
		//  107  164:bipush          26
		//  108  166:bipush          44
		//  109  168:iastore         
		//  110  169:dup             
		//  111  170:bipush          27
		//  112  172:bipush          23
		//  113  174:iastore         
		//  114  175:dup             
		//  115  176:bipush          28
		//  116  178:bipush          55
		//  117  180:iastore         
		//  118  181:dup             
		//  119  182:bipush          29
		//  120  184:bipush          118
		//  121  186:iastore         
		//  122  187:dup             
		//  123  188:bipush          30
		//  124  190:sipush          211
		//  125  193:iastore         
		//  126  194:dup             
		//  127  195:bipush          31
		//  128  197:sipush          234
		//  129  200:iastore         
		//  130  201:dup             
		//  131  202:bipush          32
		//  132  204:iconst_5        
		//  133  205:iastore         
		//  134  206:dup             
		//  135  207:bipush          33
		//  136  209:sipush          219
		//  137  212:iastore         
		//  138  213:dup             
		//  139  214:bipush          34
		//  140  216:sipush          196
		//  141  219:iastore         
		//  142  220:dup             
		//  143  221:bipush          35
		//  144  223:bipush          96
		//  145  225:iastore         
		//  146  226:dup             
		//  147  227:bipush          36
		//  148  229:bipush          40
		//  149  231:iastore         
		//  150  232:dup             
		//  151  233:bipush          37
		//  152  235:sipush          222
		//  153  238:iastore         
		//  154  239:dup             
		//  155  240:bipush          38
		//  156  242:bipush          115
		//  157  244:iastore         
		//  158  245:dup             
		//  159  246:bipush          39
		//  160  248:bipush          103
		//  161  250:iastore         
		//  162  251:dup             
		//  163  252:bipush          40
		//  164  254:sipush          228
		//  165  257:iastore         
		//  166  258:dup             
		//  167  259:bipush          41
		//  168  261:bipush          78
		//  169  263:iastore         
		//  170  264:dup             
		//  171  265:bipush          42
		//  172  267:bipush          107
		//  173  269:iastore         
		//  174  270:dup             
		//  175  271:bipush          43
		//  176  273:bipush          125
		//  177  275:iastore         
		//  178  276:dup             
		//  179  277:bipush          44
		//  180  279:sipush          135
		//  181  282:iastore         
		//  182  283:dup             
		//  183  284:bipush          45
		//  184  286:bipush          8
		//  185  288:iastore         
		//  186  289:dup             
		//  187  290:bipush          46
		//  188  292:bipush          29
		//  189  294:iastore         
		//  190  295:dup             
		//  191  296:bipush          47
		//  192  298:sipush          162
		//  193  301:iastore         
		//  194  302:dup             
		//  195  303:bipush          48
		//  196  305:sipush          244
		//  197  308:iastore         
		//  198  309:dup             
		//  199  310:bipush          49
		//  200  312:sipush          186
		//  201  315:iastore         
		//  202  316:dup             
		//  203  317:bipush          50
		//  204  319:sipush          141
		//  205  322:iastore         
		//  206  323:dup             
		//  207  324:bipush          51
		//  208  326:sipush          180
		//  209  329:iastore         
		//  210  330:dup             
		//  211  331:bipush          52
		//  212  333:bipush          45
		//  213  335:iastore         
		//  214  336:dup             
		//  215  337:bipush          53
		//  216  339:bipush          99
		//  217  341:iastore         
		//  218  342:dup             
		//  219  343:bipush          54
		//  220  345:bipush          24
		//  221  347:iastore         
		//  222  348:dup             
		//  223  349:bipush          55
		//  224  351:bipush          49
		//  225  353:iastore         
		//  226  354:dup             
		//  227  355:bipush          56
		//  228  357:bipush          56
		//  229  359:iastore         
		//  230  360:dup             
		//  231  361:bipush          57
		//  232  363:bipush          13
		//  233  365:iastore         
		//  234  366:dup             
		//  235  367:bipush          58
		//  236  369:bipush          119
		//  237  371:iastore         
		//  238  372:dup             
		//  239  373:bipush          59
		//  240  375:sipush          153
		//  241  378:iastore         
		//  242  379:dup             
		//  243  380:bipush          60
		//  244  382:sipush          212
		//  245  385:iastore         
		//  246  386:dup             
		//  247  387:bipush          61
		//  248  389:sipush          199
		//  249  392:iastore         
		//  250  393:dup             
		//  251  394:bipush          62
		//  252  396:sipush          235
		//  253  399:iastore         
		//  254  400:dup             
		//  255  401:bipush          63
		//  256  403:bipush          91
		//  257  405:iastore         
		//  258  406:dup             
		//  259  407:bipush          64
		//  260  409:bipush          6
		//  261  411:iastore         
		//  262  412:dup             
		//  263  413:bipush          65
		//  264  415:bipush          76
		//  265  417:iastore         
		//  266  418:dup             
		//  267  419:bipush          66
		//  268  421:sipush          220
		//  269  424:iastore         
		//  270  425:dup             
		//  271  426:bipush          67
		//  272  428:sipush          217
		//  273  431:iastore         
		//  274  432:dup             
		//  275  433:bipush          68
		//  276  435:sipush          197
		//  277  438:iastore         
		//  278  439:dup             
		//  279  440:bipush          69
		//  280  442:bipush          11
		//  281  444:iastore         
		//  282  445:dup             
		//  283  446:bipush          70
		//  284  448:bipush          97
		//  285  450:iastore         
		//  286  451:dup             
		//  287  452:bipush          71
		//  288  454:sipush          184
		//  289  457:iastore         
		//  290  458:dup             
		//  291  459:bipush          72
		//  292  461:bipush          41
		//  293  463:iastore         
		//  294  464:dup             
		//  295  465:bipush          73
		//  296  467:bipush          36
		//  297  469:iastore         
		//  298  470:dup             
		//  299  471:bipush          74
		//  300  473:sipush          223
		//  301  476:iastore         
		//  302  477:dup             
		//  303  478:bipush          75
		//  304  480:sipush          253
		//  305  483:iastore         
		//  306  484:dup             
		//  307  485:bipush          76
		//  308  487:bipush          116
		//  309  489:iastore         
		//  310  490:dup             
		//  311  491:bipush          77
		//  312  493:sipush          138
		//  313  496:iastore         
		//  314  497:dup             
		//  315  498:bipush          78
		//  316  500:bipush          104
		//  317  502:iastore         
		//  318  503:dup             
		//  319  504:bipush          79
		//  320  506:sipush          193
		//  321  509:iastore         
		//  322  510:dup             
		//  323  511:bipush          80
		//  324  513:sipush          229
		//  325  516:iastore         
		//  326  517:dup             
		//  327  518:bipush          81
		//  328  520:bipush          86
		//  329  522:iastore         
		//  330  523:dup             
		//  331  524:bipush          82
		//  332  526:bipush          79
		//  333  528:iastore         
		//  334  529:dup             
		//  335  530:bipush          83
		//  336  532:sipush          171
		//  337  535:iastore         
		//  338  536:dup             
		//  339  537:bipush          84
		//  340  539:bipush          108
		//  341  541:iastore         
		//  342  542:dup             
		//  343  543:bipush          85
		//  344  545:sipush          165
		//  345  548:iastore         
		//  346  549:dup             
		//  347  550:bipush          86
		//  348  552:bipush          126
		//  349  554:iastore         
		//  350  555:dup             
		//  351  556:bipush          87
		//  352  558:sipush          145
		//  353  561:iastore         
		//  354  562:dup             
		//  355  563:bipush          88
		//  356  565:sipush          136
		//  357  568:iastore         
		//  358  569:dup             
		//  359  570:bipush          89
		//  360  572:bipush          34
		//  361  574:iastore         
		//  362  575:dup             
		//  363  576:bipush          90
		//  364  578:bipush          9
		//  365  580:iastore         
		//  366  581:dup             
		//  367  582:bipush          91
		//  368  584:bipush          74
		//  369  586:iastore         
		//  370  587:dup             
		//  371  588:bipush          92
		//  372  590:bipush          30
		//  373  592:iastore         
		//  374  593:dup             
		//  375  594:bipush          93
		//  376  596:bipush          32
		//  377  598:iastore         
		//  378  599:dup             
		//  379  600:bipush          94
		//  380  602:sipush          163
		//  381  605:iastore         
		//  382  606:dup             
		//  383  607:bipush          95
		//  384  609:bipush          84
		//  385  611:iastore         
		//  386  612:dup             
		//  387  613:bipush          96
		//  388  615:sipush          245
		//  389  618:iastore         
		//  390  619:dup             
		//  391  620:bipush          97
		//  392  622:sipush          173
		//  393  625:iastore         
		//  394  626:dup             
		//  395  627:bipush          98
		//  396  629:sipush          187
		//  397  632:iastore         
		//  398  633:dup             
		//  399  634:bipush          99
		//  400  636:sipush          204
		//  401  639:iastore         
		//  402  640:dup             
		//  403  641:bipush          100
		//  404  643:sipush          142
		//  405  646:iastore         
		//  406  647:dup             
		//  407  648:bipush          101
		//  408  650:bipush          81
		//  409  652:iastore         
		//  410  653:dup             
		//  411  654:bipush          102
		//  412  656:sipush          181
		//  413  659:iastore         
		//  414  660:dup             
		//  415  661:bipush          103
		//  416  663:sipush          190
		//  417  666:iastore         
		//  418  667:dup             
		//  419  668:bipush          104
		//  420  670:bipush          46
		//  421  672:iastore         
		//  422  673:dup             
		//  423  674:bipush          105
		//  424  676:bipush          88
		//  425  678:iastore         
		//  426  679:dup             
		//  427  680:bipush          106
		//  428  682:bipush          100
		//  429  684:iastore         
		//  430  685:dup             
		//  431  686:bipush          107
		//  432  688:sipush          159
		//  433  691:iastore         
		//  434  692:dup             
		//  435  693:bipush          108
		//  436  695:bipush          25
		//  437  697:iastore         
		//  438  698:dup             
		//  439  699:bipush          109
		//  440  701:sipush          231
		//  441  704:iastore         
		//  442  705:dup             
		//  443  706:bipush          110
		//  444  708:bipush          50
		//  445  710:iastore         
		//  446  711:dup             
		//  447  712:bipush          111
		//  448  714:sipush          207
		//  449  717:iastore         
		//  450  718:dup             
		//  451  719:bipush          112
		//  452  721:bipush          57
		//  453  723:iastore         
		//  454  724:dup             
		//  455  725:bipush          113
		//  456  727:sipush          147
		//  457  730:iastore         
		//  458  731:dup             
		//  459  732:bipush          114
		//  460  734:bipush          14
		//  461  736:iastore         
		//  462  737:dup             
		//  463  738:bipush          115
		//  464  740:bipush          67
		//  465  742:iastore         
		//  466  743:dup             
		//  467  744:bipush          116
		//  468  746:bipush          120
		//  469  748:iastore         
		//  470  749:dup             
		//  471  750:bipush          117
		//  472  752:sipush          128
		//  473  755:iastore         
		//  474  756:dup             
		//  475  757:bipush          118
		//  476  759:sipush          154
		//  477  762:iastore         
		//  478  763:dup             
		//  479  764:bipush          119
		//  480  766:sipush          248
		//  481  769:iastore         
		//  482  770:dup             
		//  483  771:bipush          120
		//  484  773:sipush          213
		//  485  776:iastore         
		//  486  777:dup             
		//  487  778:bipush          121
		//  488  780:sipush          167
		//  489  783:iastore         
		//  490  784:dup             
		//  491  785:bipush          122
		//  492  787:sipush          200
		//  493  790:iastore         
		//  494  791:dup             
		//  495  792:bipush          123
		//  496  794:bipush          63
		//  497  796:iastore         
		//  498  797:dup             
		//  499  798:bipush          124
		//  500  800:sipush          236
		//  501  803:iastore         
		//  502  804:dup             
		//  503  805:bipush          125
		//  504  807:bipush          110
		//  505  809:iastore         
		//  506  810:dup             
		//  507  811:bipush          126
		//  508  813:bipush          92
		//  509  815:iastore         
		//  510  816:dup             
		//  511  817:bipush          127
		//  512  819:sipush          176
		//  513  822:iastore         
		//  514  823:dup             
		//  515  824:sipush          128
		//  516  827:bipush          7
		//  517  829:iastore         
		//  518  830:dup             
		//  519  831:sipush          129
		//  520  834:sipush          161
		//  521  837:iastore         
		//  522  838:dup             
		//  523  839:sipush          130
		//  524  842:bipush          77
		//  525  844:iastore         
		//  526  845:dup             
		//  527  846:sipush          131
		//  528  849:bipush          124
		//  529  851:iastore         
		//  530  852:dup             
		//  531  853:sipush          132
		//  532  856:sipush          221
		//  533  859:iastore         
		//  534  860:dup             
		//  535  861:sipush          133
		//  536  864:bipush          102
		//  537  866:iastore         
		//  538  867:dup             
		//  539  868:sipush          134
		//  540  871:sipush          218
		//  541  874:iastore         
		//  542  875:dup             
		//  543  876:sipush          135
		//  544  879:bipush          95
		//  545  881:iastore         
		//  546  882:dup             
		//  547  883:sipush          136
		//  548  886:sipush          198
		//  549  889:iastore         
		//  550  890:dup             
		//  551  891:sipush          137
		//  552  894:bipush          90
		//  553  896:iastore         
		//  554  897:dup             
		//  555  898:sipush          138
		//  556  901:bipush          12
		//  557  903:iastore         
		//  558  904:dup             
		//  559  905:sipush          139
		//  560  908:sipush          152
		//  561  911:iastore         
		//  562  912:dup             
		//  563  913:sipush          140
		//  564  916:bipush          98
		//  565  918:iastore         
		//  566  919:dup             
		//  567  920:sipush          141
		//  568  923:bipush          48
		//  569  925:iastore         
		//  570  926:dup             
		//  571  927:sipush          142
		//  572  930:sipush          185
		//  573  933:iastore         
		//  574  934:dup             
		//  575  935:sipush          143
		//  576  938:sipush          179
		//  577  941:iastore         
		//  578  942:dup             
		//  579  943:sipush          144
		//  580  946:bipush          42
		//  581  948:iastore         
		//  582  949:dup             
		//  583  950:sipush          145
		//  584  953:sipush          209
		//  585  956:iastore         
		//  586  957:dup             
		//  587  958:sipush          146
		//  588  961:bipush          37
		//  589  963:iastore         
		//  590  964:dup             
		//  591  965:sipush          147
		//  592  968:sipush          132
		//  593  971:iastore         
		//  594  972:dup             
		//  595  973:sipush          148
		//  596  976:sipush          224
		//  597  979:iastore         
		//  598  980:dup             
		//  599  981:sipush          149
		//  600  984:bipush          52
		//  601  986:iastore         
		//  602  987:dup             
		//  603  988:sipush          150
		//  604  991:sipush          254
		//  605  994:iastore         
		//  606  995:dup             
		//  607  996:sipush          151
		//  608  999:sipush          239
		//  609 1002:iastore         
		//  610 1003:dup             
		//  611 1004:sipush          152
		//  612 1007:bipush          117
		//  613 1009:iastore         
		//  614 1010:dup             
		//  615 1011:sipush          153
		//  616 1014:sipush          233
		//  617 1017:iastore         
		//  618 1018:dup             
		//  619 1019:sipush          154
		//  620 1022:sipush          139
		//  621 1025:iastore         
		//  622 1026:dup             
		//  623 1027:sipush          155
		//  624 1030:bipush          22
		//  625 1032:iastore         
		//  626 1033:dup             
		//  627 1034:sipush          156
		//  628 1037:bipush          105
		//  629 1039:iastore         
		//  630 1040:dup             
		//  631 1041:sipush          157
		//  632 1044:bipush          27
		//  633 1046:iastore         
		//  634 1047:dup             
		//  635 1048:sipush          158
		//  636 1051:sipush          194
		//  637 1054:iastore         
		//  638 1055:dup             
		//  639 1056:sipush          159
		//  640 1059:bipush          113
		//  641 1061:iastore         
		//  642 1062:dup             
		//  643 1063:sipush          160
		//  644 1066:sipush          230
		//  645 1069:iastore         
		//  646 1070:dup             
		//  647 1071:sipush          161
		//  648 1074:sipush          206
		//  649 1077:iastore         
		//  650 1078:dup             
		//  651 1079:sipush          162
		//  652 1082:bipush          87
		//  653 1084:iastore         
		//  654 1085:dup             
		//  655 1086:sipush          163
		//  656 1089:sipush          158
		//  657 1092:iastore         
		//  658 1093:dup             
		//  659 1094:sipush          164
		//  660 1097:bipush          80
		//  661 1099:iastore         
		//  662 1100:dup             
		//  663 1101:sipush          165
		//  664 1104:sipush          189
		//  665 1107:iastore         
		//  666 1108:dup             
		//  667 1109:sipush          166
		//  668 1112:sipush          172
		//  669 1115:iastore         
		//  670 1116:dup             
		//  671 1117:sipush          167
		//  672 1120:sipush          203
		//  673 1123:iastore         
		//  674 1124:dup             
		//  675 1125:sipush          168
		//  676 1128:bipush          109
		//  677 1130:iastore         
		//  678 1131:dup             
		//  679 1132:sipush          169
		//  680 1135:sipush          175
		//  681 1138:iastore         
		//  682 1139:dup             
		//  683 1140:sipush          170
		//  684 1143:sipush          166
		//  685 1146:iastore         
		//  686 1147:dup             
		//  687 1148:sipush          171
		//  688 1151:bipush          62
		//  689 1153:iastore         
		//  690 1154:dup             
		//  691 1155:sipush          172
		//  692 1158:bipush          127
		//  693 1160:iastore         
		//  694 1161:dup             
		//  695 1162:sipush          173
		//  696 1165:sipush          247
		//  697 1168:iastore         
		//  698 1169:dup             
		//  699 1170:sipush          174
		//  700 1173:sipush          146
		//  701 1176:iastore         
		//  702 1177:dup             
		//  703 1178:sipush          175
		//  704 1181:bipush          66
		//  705 1183:iastore         
		//  706 1184:dup             
		//  707 1185:sipush          176
		//  708 1188:sipush          137
		//  709 1191:iastore         
		//  710 1192:dup             
		//  711 1193:sipush          177
		//  712 1196:sipush          192
		//  713 1199:iastore         
		//  714 1200:dup             
		//  715 1201:sipush          178
		//  716 1204:bipush          35
		//  717 1206:iastore         
		//  718 1207:dup             
		//  719 1208:sipush          179
		//  720 1211:sipush          252
		//  721 1214:iastore         
		//  722 1215:dup             
		//  723 1216:sipush          180
		//  724 1219:bipush          10
		//  725 1221:iastore         
		//  726 1222:dup             
		//  727 1223:sipush          181
		//  728 1226:sipush          183
		//  729 1229:iastore         
		//  730 1230:dup             
		//  731 1231:sipush          182
		//  732 1234:bipush          75
		//  733 1236:iastore         
		//  734 1237:dup             
		//  735 1238:sipush          183
		//  736 1241:sipush          216
		//  737 1244:iastore         
		//  738 1245:dup             
		//  739 1246:sipush          184
		//  740 1249:bipush          31
		//  741 1251:iastore         
		//  742 1252:dup             
		//  743 1253:sipush          185
		//  744 1256:bipush          83
		//  745 1258:iastore         
		//  746 1259:dup             
		//  747 1260:sipush          186
		//  748 1263:bipush          33
		//  749 1265:iastore         
		//  750 1266:dup             
		//  751 1267:sipush          187
		//  752 1270:bipush          73
		//  753 1272:iastore         
		//  754 1273:dup             
		//  755 1274:sipush          188
		//  756 1277:sipush          164
		//  757 1280:iastore         
		//  758 1281:dup             
		//  759 1282:sipush          189
		//  760 1285:sipush          144
		//  761 1288:iastore         
		//  762 1289:dup             
		//  763 1290:sipush          190
		//  764 1293:bipush          85
		//  765 1295:iastore         
		//  766 1296:dup             
		//  767 1297:sipush          191
		//  768 1300:sipush          170
		//  769 1303:iastore         
		//  770 1304:dup             
		//  771 1305:sipush          192
		//  772 1308:sipush          246
		//  773 1311:iastore         
		//  774 1312:dup             
		//  775 1313:sipush          193
		//  776 1316:bipush          65
		//  777 1318:iastore         
		//  778 1319:dup             
		//  779 1320:sipush          194
		//  780 1323:sipush          174
		//  781 1326:iastore         
		//  782 1327:dup             
		//  783 1328:sipush          195
		//  784 1331:bipush          61
		//  785 1333:iastore         
		//  786 1334:dup             
		//  787 1335:sipush          196
		//  788 1338:sipush          188
		//  789 1341:iastore         
		//  790 1342:dup             
		//  791 1343:sipush          197
		//  792 1346:sipush          202
		//  793 1349:iastore         
		//  794 1350:dup             
		//  795 1351:sipush          198
		//  796 1354:sipush          205
		//  797 1357:iastore         
		//  798 1358:dup             
		//  799 1359:sipush          199
		//  800 1362:sipush          157
		//  801 1365:iastore         
		//  802 1366:dup             
		//  803 1367:sipush          200
		//  804 1370:sipush          143
		//  805 1373:iastore         
		//  806 1374:dup             
		//  807 1375:sipush          201
		//  808 1378:sipush          169
		//  809 1381:iastore         
		//  810 1382:dup             
		//  811 1383:sipush          202
		//  812 1386:bipush          82
		//  813 1388:iastore         
		//  814 1389:dup             
		//  815 1390:sipush          203
		//  816 1393:bipush          72
		//  817 1395:iastore         
		//  818 1396:dup             
		//  819 1397:sipush          204
		//  820 1400:sipush          182
		//  821 1403:iastore         
		//  822 1404:dup             
		//  823 1405:sipush          205
		//  824 1408:sipush          215
		//  825 1411:iastore         
		//  826 1412:dup             
		//  827 1413:sipush          206
		//  828 1416:sipush          191
		//  829 1419:iastore         
		//  830 1420:dup             
		//  831 1421:sipush          207
		//  832 1424:sipush          251
		//  833 1427:iastore         
		//  834 1428:dup             
		//  835 1429:sipush          208
		//  836 1432:bipush          47
		//  837 1434:iastore         
		//  838 1435:dup             
		//  839 1436:sipush          209
		//  840 1439:sipush          178
		//  841 1442:iastore         
		//  842 1443:dup             
		//  843 1444:sipush          210
		//  844 1447:bipush          89
		//  845 1449:iastore         
		//  846 1450:dup             
		//  847 1451:sipush          211
		//  848 1454:sipush          151
		//  849 1457:iastore         
		//  850 1458:dup             
		//  851 1459:sipush          212
		//  852 1462:bipush          101
		//  853 1464:iastore         
		//  854 1465:dup             
		//  855 1466:sipush          213
		//  856 1469:bipush          94
		//  857 1471:iastore         
		//  858 1472:dup             
		//  859 1473:sipush          214
		//  860 1476:sipush          160
		//  861 1479:iastore         
		//  862 1480:dup             
		//  863 1481:sipush          215
		//  864 1484:bipush          123
		//  865 1486:iastore         
		//  866 1487:dup             
		//  867 1488:sipush          216
		//  868 1491:bipush          26
		//  869 1493:iastore         
		//  870 1494:dup             
		//  871 1495:sipush          217
		//  872 1498:bipush          112
		//  873 1500:iastore         
		//  874 1501:dup             
		//  875 1502:sipush          218
		//  876 1505:sipush          232
		//  877 1508:iastore         
		//  878 1509:dup             
		//  879 1510:sipush          219
		//  880 1513:bipush          21
		//  881 1515:iastore         
		//  882 1516:dup             
		//  883 1517:sipush          220
		//  884 1520:bipush          51
		//  885 1522:iastore         
		//  886 1523:dup             
		//  887 1524:sipush          221
		//  888 1527:sipush          238
		//  889 1530:iastore         
		//  890 1531:dup             
		//  891 1532:sipush          222
		//  892 1535:sipush          208
		//  893 1538:iastore         
		//  894 1539:dup             
		//  895 1540:sipush          223
		//  896 1543:sipush          131
		//  897 1546:iastore         
		//  898 1547:dup             
		//  899 1548:sipush          224
		//  900 1551:bipush          58
		//  901 1553:iastore         
		//  902 1554:dup             
		//  903 1555:sipush          225
		//  904 1558:bipush          69
		//  905 1560:iastore         
		//  906 1561:dup             
		//  907 1562:sipush          226
		//  908 1565:sipush          148
		//  909 1568:iastore         
		//  910 1569:dup             
		//  911 1570:sipush          227
		//  912 1573:bipush          18
		//  913 1575:iastore         
		//  914 1576:dup             
		//  915 1577:sipush          228
		//  916 1580:bipush          15
		//  917 1582:iastore         
		//  918 1583:dup             
		//  919 1584:sipush          229
		//  920 1587:bipush          16
		//  921 1589:iastore         
		//  922 1590:dup             
		//  923 1591:sipush          230
		//  924 1594:bipush          68
		//  925 1596:iastore         
		//  926 1597:dup             
		//  927 1598:sipush          231
		//  928 1601:bipush          17
		//  929 1603:iastore         
		//  930 1604:dup             
		//  931 1605:sipush          232
		//  932 1608:bipush          121
		//  933 1610:iastore         
		//  934 1611:dup             
		//  935 1612:sipush          233
		//  936 1615:sipush          149
		//  937 1618:iastore         
		//  938 1619:dup             
		//  939 1620:sipush          234
		//  940 1623:sipush          129
		//  941 1626:iastore         
		//  942 1627:dup             
		//  943 1628:sipush          235
		//  944 1631:bipush          19
		//  945 1633:iastore         
		//  946 1634:dup             
		//  947 1635:sipush          236
		//  948 1638:sipush          155
		//  949 1641:iastore         
		//  950 1642:dup             
		//  951 1643:sipush          237
		//  952 1646:bipush          59
		//  953 1648:iastore         
		//  954 1649:dup             
		//  955 1650:sipush          238
		//  956 1653:sipush          249
		//  957 1656:iastore         
		//  958 1657:dup             
		//  959 1658:sipush          239
		//  960 1661:bipush          70
		//  961 1663:iastore         
		//  962 1664:dup             
		//  963 1665:sipush          240
		//  964 1668:sipush          214
		//  965 1671:iastore         
		//  966 1672:dup             
		//  967 1673:sipush          241
		//  968 1676:sipush          250
		//  969 1679:iastore         
		//  970 1680:dup             
		//  971 1681:sipush          242
		//  972 1684:sipush          168
		//  973 1687:iastore         
		//  974 1688:dup             
		//  975 1689:sipush          243
		//  976 1692:bipush          71
		//  977 1694:iastore         
		//  978 1695:dup             
		//  979 1696:sipush          244
		//  980 1699:sipush          201
		//  981 1702:iastore         
		//  982 1703:dup             
		//  983 1704:sipush          245
		//  984 1707:sipush          156
		//  985 1710:iastore         
		//  986 1711:dup             
		//  987 1712:sipush          246
		//  988 1715:bipush          64
		//  989 1717:iastore         
		//  990 1718:dup             
		//  991 1719:sipush          247
		//  992 1722:bipush          60
		//  993 1724:iastore         
		//  994 1725:dup             
		//  995 1726:sipush          248
		//  996 1729:sipush          237
		//  997 1732:iastore         
		//  998 1733:dup             
		//  999 1734:sipush          249
		// 1000 1737:sipush          130
		// 1001 1740:iastore         
		// 1002 1741:dup             
		// 1003 1742:sipush          250
		// 1004 1745:bipush          111
		// 1005 1747:iastore         
		// 1006 1748:dup             
		// 1007 1749:sipush          251
		// 1008 1752:bipush          20
		// 1009 1754:iastore         
		// 1010 1755:dup             
		// 1011 1756:sipush          252
		// 1012 1759:bipush          93
		// 1013 1761:iastore         
		// 1014 1762:dup             
		// 1015 1763:sipush          253
		// 1016 1766:bipush          122
		// 1017 1768:iastore         
		// 1018 1769:dup             
		// 1019 1770:sipush          254
		// 1020 1773:sipush          177
		// 1021 1776:iastore         
		// 1022 1777:dup             
		// 1023 1778:sipush          255
		// 1024 1781:sipush          150
		// 1025 1784:iastore         
		// 1026 1785:putstatic       #30  <Field int[] log>
		// 1027 1788:sipush          256
		// 1028 1791:newarray        int[]
		// 1029 1793:dup             
		// 1030 1794:iconst_0        
		// 1031 1795:iconst_1        
		// 1032 1796:iastore         
		// 1033 1797:dup             
		// 1034 1798:iconst_1        
		// 1035 1799:iconst_2        
		// 1036 1800:iastore         
		// 1037 1801:dup             
		// 1038 1802:iconst_2        
		// 1039 1803:iconst_4        
		// 1040 1804:iastore         
		// 1041 1805:dup             
		// 1042 1806:iconst_3        
		// 1043 1807:bipush          8
		// 1044 1809:iastore         
		// 1045 1810:dup             
		// 1046 1811:iconst_4        
		// 1047 1812:bipush          16
		// 1048 1814:iastore         
		// 1049 1815:dup             
		// 1050 1816:iconst_5        
		// 1051 1817:bipush          32
		// 1052 1819:iastore         
		// 1053 1820:dup             
		// 1054 1821:bipush          6
		// 1055 1823:bipush          64
		// 1056 1825:iastore         
		// 1057 1826:dup             
		// 1058 1827:bipush          7
		// 1059 1829:sipush          128
		// 1060 1832:iastore         
		// 1061 1833:dup             
		// 1062 1834:bipush          8
		// 1063 1836:bipush          45
		// 1064 1838:iastore         
		// 1065 1839:dup             
		// 1066 1840:bipush          9
		// 1067 1842:bipush          90
		// 1068 1844:iastore         
		// 1069 1845:dup             
		// 1070 1846:bipush          10
		// 1071 1848:sipush          180
		// 1072 1851:iastore         
		// 1073 1852:dup             
		// 1074 1853:bipush          11
		// 1075 1855:bipush          69
		// 1076 1857:iastore         
		// 1077 1858:dup             
		// 1078 1859:bipush          12
		// 1079 1861:sipush          138
		// 1080 1864:iastore         
		// 1081 1865:dup             
		// 1082 1866:bipush          13
		// 1083 1868:bipush          57
		// 1084 1870:iastore         
		// 1085 1871:dup             
		// 1086 1872:bipush          14
		// 1087 1874:bipush          114
		// 1088 1876:iastore         
		// 1089 1877:dup             
		// 1090 1878:bipush          15
		// 1091 1880:sipush          228
		// 1092 1883:iastore         
		// 1093 1884:dup             
		// 1094 1885:bipush          16
		// 1095 1887:sipush          229
		// 1096 1890:iastore         
		// 1097 1891:dup             
		// 1098 1892:bipush          17
		// 1099 1894:sipush          231
		// 1100 1897:iastore         
		// 1101 1898:dup             
		// 1102 1899:bipush          18
		// 1103 1901:sipush          227
		// 1104 1904:iastore         
		// 1105 1905:dup             
		// 1106 1906:bipush          19
		// 1107 1908:sipush          235
		// 1108 1911:iastore         
		// 1109 1912:dup             
		// 1110 1913:bipush          20
		// 1111 1915:sipush          251
		// 1112 1918:iastore         
		// 1113 1919:dup             
		// 1114 1920:bipush          21
		// 1115 1922:sipush          219
		// 1116 1925:iastore         
		// 1117 1926:dup             
		// 1118 1927:bipush          22
		// 1119 1929:sipush          155
		// 1120 1932:iastore         
		// 1121 1933:dup             
		// 1122 1934:bipush          23
		// 1123 1936:bipush          27
		// 1124 1938:iastore         
		// 1125 1939:dup             
		// 1126 1940:bipush          24
		// 1127 1942:bipush          54
		// 1128 1944:iastore         
		// 1129 1945:dup             
		// 1130 1946:bipush          25
		// 1131 1948:bipush          108
		// 1132 1950:iastore         
		// 1133 1951:dup             
		// 1134 1952:bipush          26
		// 1135 1954:sipush          216
		// 1136 1957:iastore         
		// 1137 1958:dup             
		// 1138 1959:bipush          27
		// 1139 1961:sipush          157
		// 1140 1964:iastore         
		// 1141 1965:dup             
		// 1142 1966:bipush          28
		// 1143 1968:bipush          23
		// 1144 1970:iastore         
		// 1145 1971:dup             
		// 1146 1972:bipush          29
		// 1147 1974:bipush          46
		// 1148 1976:iastore         
		// 1149 1977:dup             
		// 1150 1978:bipush          30
		// 1151 1980:bipush          92
		// 1152 1982:iastore         
		// 1153 1983:dup             
		// 1154 1984:bipush          31
		// 1155 1986:sipush          184
		// 1156 1989:iastore         
		// 1157 1990:dup             
		// 1158 1991:bipush          32
		// 1159 1993:bipush          93
		// 1160 1995:iastore         
		// 1161 1996:dup             
		// 1162 1997:bipush          33
		// 1163 1999:sipush          186
		// 1164 2002:iastore         
		// 1165 2003:dup             
		// 1166 2004:bipush          34
		// 1167 2006:bipush          89
		// 1168 2008:iastore         
		// 1169 2009:dup             
		// 1170 2010:bipush          35
		// 1171 2012:sipush          178
		// 1172 2015:iastore         
		// 1173 2016:dup             
		// 1174 2017:bipush          36
		// 1175 2019:bipush          73
		// 1176 2021:iastore         
		// 1177 2022:dup             
		// 1178 2023:bipush          37
		// 1179 2025:sipush          146
		// 1180 2028:iastore         
		// 1181 2029:dup             
		// 1182 2030:bipush          38
		// 1183 2032:bipush          9
		// 1184 2034:iastore         
		// 1185 2035:dup             
		// 1186 2036:bipush          39
		// 1187 2038:bipush          18
		// 1188 2040:iastore         
		// 1189 2041:dup             
		// 1190 2042:bipush          40
		// 1191 2044:bipush          36
		// 1192 2046:iastore         
		// 1193 2047:dup             
		// 1194 2048:bipush          41
		// 1195 2050:bipush          72
		// 1196 2052:iastore         
		// 1197 2053:dup             
		// 1198 2054:bipush          42
		// 1199 2056:sipush          144
		// 1200 2059:iastore         
		// 1201 2060:dup             
		// 1202 2061:bipush          43
		// 1203 2063:bipush          13
		// 1204 2065:iastore         
		// 1205 2066:dup             
		// 1206 2067:bipush          44
		// 1207 2069:bipush          26
		// 1208 2071:iastore         
		// 1209 2072:dup             
		// 1210 2073:bipush          45
		// 1211 2075:bipush          52
		// 1212 2077:iastore         
		// 1213 2078:dup             
		// 1214 2079:bipush          46
		// 1215 2081:bipush          104
		// 1216 2083:iastore         
		// 1217 2084:dup             
		// 1218 2085:bipush          47
		// 1219 2087:sipush          208
		// 1220 2090:iastore         
		// 1221 2091:dup             
		// 1222 2092:bipush          48
		// 1223 2094:sipush          141
		// 1224 2097:iastore         
		// 1225 2098:dup             
		// 1226 2099:bipush          49
		// 1227 2101:bipush          55
		// 1228 2103:iastore         
		// 1229 2104:dup             
		// 1230 2105:bipush          50
		// 1231 2107:bipush          110
		// 1232 2109:iastore         
		// 1233 2110:dup             
		// 1234 2111:bipush          51
		// 1235 2113:sipush          220
		// 1236 2116:iastore         
		// 1237 2117:dup             
		// 1238 2118:bipush          52
		// 1239 2120:sipush          149
		// 1240 2123:iastore         
		// 1241 2124:dup             
		// 1242 2125:bipush          53
		// 1243 2127:bipush          7
		// 1244 2129:iastore         
		// 1245 2130:dup             
		// 1246 2131:bipush          54
		// 1247 2133:bipush          14
		// 1248 2135:iastore         
		// 1249 2136:dup             
		// 1250 2137:bipush          55
		// 1251 2139:bipush          28
		// 1252 2141:iastore         
		// 1253 2142:dup             
		// 1254 2143:bipush          56
		// 1255 2145:bipush          56
		// 1256 2147:iastore         
		// 1257 2148:dup             
		// 1258 2149:bipush          57
		// 1259 2151:bipush          112
		// 1260 2153:iastore         
		// 1261 2154:dup             
		// 1262 2155:bipush          58
		// 1263 2157:sipush          224
		// 1264 2160:iastore         
		// 1265 2161:dup             
		// 1266 2162:bipush          59
		// 1267 2164:sipush          237
		// 1268 2167:iastore         
		// 1269 2168:dup             
		// 1270 2169:bipush          60
		// 1271 2171:sipush          247
		// 1272 2174:iastore         
		// 1273 2175:dup             
		// 1274 2176:bipush          61
		// 1275 2178:sipush          195
		// 1276 2181:iastore         
		// 1277 2182:dup             
		// 1278 2183:bipush          62
		// 1279 2185:sipush          171
		// 1280 2188:iastore         
		// 1281 2189:dup             
		// 1282 2190:bipush          63
		// 1283 2192:bipush          123
		// 1284 2194:iastore         
		// 1285 2195:dup             
		// 1286 2196:bipush          64
		// 1287 2198:sipush          246
		// 1288 2201:iastore         
		// 1289 2202:dup             
		// 1290 2203:bipush          65
		// 1291 2205:sipush          193
		// 1292 2208:iastore         
		// 1293 2209:dup             
		// 1294 2210:bipush          66
		// 1295 2212:sipush          175
		// 1296 2215:iastore         
		// 1297 2216:dup             
		// 1298 2217:bipush          67
		// 1299 2219:bipush          115
		// 1300 2221:iastore         
		// 1301 2222:dup             
		// 1302 2223:bipush          68
		// 1303 2225:sipush          230
		// 1304 2228:iastore         
		// 1305 2229:dup             
		// 1306 2230:bipush          69
		// 1307 2232:sipush          225
		// 1308 2235:iastore         
		// 1309 2236:dup             
		// 1310 2237:bipush          70
		// 1311 2239:sipush          239
		// 1312 2242:iastore         
		// 1313 2243:dup             
		// 1314 2244:bipush          71
		// 1315 2246:sipush          243
		// 1316 2249:iastore         
		// 1317 2250:dup             
		// 1318 2251:bipush          72
		// 1319 2253:sipush          203
		// 1320 2256:iastore         
		// 1321 2257:dup             
		// 1322 2258:bipush          73
		// 1323 2260:sipush          187
		// 1324 2263:iastore         
		// 1325 2264:dup             
		// 1326 2265:bipush          74
		// 1327 2267:bipush          91
		// 1328 2269:iastore         
		// 1329 2270:dup             
		// 1330 2271:bipush          75
		// 1331 2273:sipush          182
		// 1332 2276:iastore         
		// 1333 2277:dup             
		// 1334 2278:bipush          76
		// 1335 2280:bipush          65
		// 1336 2282:iastore         
		// 1337 2283:dup             
		// 1338 2284:bipush          77
		// 1339 2286:sipush          130
		// 1340 2289:iastore         
		// 1341 2290:dup             
		// 1342 2291:bipush          78
		// 1343 2293:bipush          41
		// 1344 2295:iastore         
		// 1345 2296:dup             
		// 1346 2297:bipush          79
		// 1347 2299:bipush          82
		// 1348 2301:iastore         
		// 1349 2302:dup             
		// 1350 2303:bipush          80
		// 1351 2305:sipush          164
		// 1352 2308:iastore         
		// 1353 2309:dup             
		// 1354 2310:bipush          81
		// 1355 2312:bipush          101
		// 1356 2314:iastore         
		// 1357 2315:dup             
		// 1358 2316:bipush          82
		// 1359 2318:sipush          202
		// 1360 2321:iastore         
		// 1361 2322:dup             
		// 1362 2323:bipush          83
		// 1363 2325:sipush          185
		// 1364 2328:iastore         
		// 1365 2329:dup             
		// 1366 2330:bipush          84
		// 1367 2332:bipush          95
		// 1368 2334:iastore         
		// 1369 2335:dup             
		// 1370 2336:bipush          85
		// 1371 2338:sipush          190
		// 1372 2341:iastore         
		// 1373 2342:dup             
		// 1374 2343:bipush          86
		// 1375 2345:bipush          81
		// 1376 2347:iastore         
		// 1377 2348:dup             
		// 1378 2349:bipush          87
		// 1379 2351:sipush          162
		// 1380 2354:iastore         
		// 1381 2355:dup             
		// 1382 2356:bipush          88
		// 1383 2358:bipush          105
		// 1384 2360:iastore         
		// 1385 2361:dup             
		// 1386 2362:bipush          89
		// 1387 2364:sipush          210
		// 1388 2367:iastore         
		// 1389 2368:dup             
		// 1390 2369:bipush          90
		// 1391 2371:sipush          137
		// 1392 2374:iastore         
		// 1393 2375:dup             
		// 1394 2376:bipush          91
		// 1395 2378:bipush          63
		// 1396 2380:iastore         
		// 1397 2381:dup             
		// 1398 2382:bipush          92
		// 1399 2384:bipush          126
		// 1400 2386:iastore         
		// 1401 2387:dup             
		// 1402 2388:bipush          93
		// 1403 2390:sipush          252
		// 1404 2393:iastore         
		// 1405 2394:dup             
		// 1406 2395:bipush          94
		// 1407 2397:sipush          213
		// 1408 2400:iastore         
		// 1409 2401:dup             
		// 1410 2402:bipush          95
		// 1411 2404:sipush          135
		// 1412 2407:iastore         
		// 1413 2408:dup             
		// 1414 2409:bipush          96
		// 1415 2411:bipush          35
		// 1416 2413:iastore         
		// 1417 2414:dup             
		// 1418 2415:bipush          97
		// 1419 2417:bipush          70
		// 1420 2419:iastore         
		// 1421 2420:dup             
		// 1422 2421:bipush          98
		// 1423 2423:sipush          140
		// 1424 2426:iastore         
		// 1425 2427:dup             
		// 1426 2428:bipush          99
		// 1427 2430:bipush          53
		// 1428 2432:iastore         
		// 1429 2433:dup             
		// 1430 2434:bipush          100
		// 1431 2436:bipush          106
		// 1432 2438:iastore         
		// 1433 2439:dup             
		// 1434 2440:bipush          101
		// 1435 2442:sipush          212
		// 1436 2445:iastore         
		// 1437 2446:dup             
		// 1438 2447:bipush          102
		// 1439 2449:sipush          133
		// 1440 2452:iastore         
		// 1441 2453:dup             
		// 1442 2454:bipush          103
		// 1443 2456:bipush          39
		// 1444 2458:iastore         
		// 1445 2459:dup             
		// 1446 2460:bipush          104
		// 1447 2462:bipush          78
		// 1448 2464:iastore         
		// 1449 2465:dup             
		// 1450 2466:bipush          105
		// 1451 2468:sipush          156
		// 1452 2471:iastore         
		// 1453 2472:dup             
		// 1454 2473:bipush          106
		// 1455 2475:bipush          21
		// 1456 2477:iastore         
		// 1457 2478:dup             
		// 1458 2479:bipush          107
		// 1459 2481:bipush          42
		// 1460 2483:iastore         
		// 1461 2484:dup             
		// 1462 2485:bipush          108
		// 1463 2487:bipush          84
		// 1464 2489:iastore         
		// 1465 2490:dup             
		// 1466 2491:bipush          109
		// 1467 2493:sipush          168
		// 1468 2496:iastore         
		// 1469 2497:dup             
		// 1470 2498:bipush          110
		// 1471 2500:bipush          125
		// 1472 2502:iastore         
		// 1473 2503:dup             
		// 1474 2504:bipush          111
		// 1475 2506:sipush          250
		// 1476 2509:iastore         
		// 1477 2510:dup             
		// 1478 2511:bipush          112
		// 1479 2513:sipush          217
		// 1480 2516:iastore         
		// 1481 2517:dup             
		// 1482 2518:bipush          113
		// 1483 2520:sipush          159
		// 1484 2523:iastore         
		// 1485 2524:dup             
		// 1486 2525:bipush          114
		// 1487 2527:bipush          19
		// 1488 2529:iastore         
		// 1489 2530:dup             
		// 1490 2531:bipush          115
		// 1491 2533:bipush          38
		// 1492 2535:iastore         
		// 1493 2536:dup             
		// 1494 2537:bipush          116
		// 1495 2539:bipush          76
		// 1496 2541:iastore         
		// 1497 2542:dup             
		// 1498 2543:bipush          117
		// 1499 2545:sipush          152
		// 1500 2548:iastore         
		// 1501 2549:dup             
		// 1502 2550:bipush          118
		// 1503 2552:bipush          29
		// 1504 2554:iastore         
		// 1505 2555:dup             
		// 1506 2556:bipush          119
		// 1507 2558:bipush          58
		// 1508 2560:iastore         
		// 1509 2561:dup             
		// 1510 2562:bipush          120
		// 1511 2564:bipush          116
		// 1512 2566:iastore         
		// 1513 2567:dup             
		// 1514 2568:bipush          121
		// 1515 2570:sipush          232
		// 1516 2573:iastore         
		// 1517 2574:dup             
		// 1518 2575:bipush          122
		// 1519 2577:sipush          253
		// 1520 2580:iastore         
		// 1521 2581:dup             
		// 1522 2582:bipush          123
		// 1523 2584:sipush          215
		// 1524 2587:iastore         
		// 1525 2588:dup             
		// 1526 2589:bipush          124
		// 1527 2591:sipush          131
		// 1528 2594:iastore         
		// 1529 2595:dup             
		// 1530 2596:bipush          125
		// 1531 2598:bipush          43
		// 1532 2600:iastore         
		// 1533 2601:dup             
		// 1534 2602:bipush          126
		// 1535 2604:bipush          86
		// 1536 2606:iastore         
		// 1537 2607:dup             
		// 1538 2608:bipush          127
		// 1539 2610:sipush          172
		// 1540 2613:iastore         
		// 1541 2614:dup             
		// 1542 2615:sipush          128
		// 1543 2618:bipush          117
		// 1544 2620:iastore         
		// 1545 2621:dup             
		// 1546 2622:sipush          129
		// 1547 2625:sipush          234
		// 1548 2628:iastore         
		// 1549 2629:dup             
		// 1550 2630:sipush          130
		// 1551 2633:sipush          249
		// 1552 2636:iastore         
		// 1553 2637:dup             
		// 1554 2638:sipush          131
		// 1555 2641:sipush          223
		// 1556 2644:iastore         
		// 1557 2645:dup             
		// 1558 2646:sipush          132
		// 1559 2649:sipush          147
		// 1560 2652:iastore         
		// 1561 2653:dup             
		// 1562 2654:sipush          133
		// 1563 2657:bipush          11
		// 1564 2659:iastore         
		// 1565 2660:dup             
		// 1566 2661:sipush          134
		// 1567 2664:bipush          22
		// 1568 2666:iastore         
		// 1569 2667:dup             
		// 1570 2668:sipush          135
		// 1571 2671:bipush          44
		// 1572 2673:iastore         
		// 1573 2674:dup             
		// 1574 2675:sipush          136
		// 1575 2678:bipush          88
		// 1576 2680:iastore         
		// 1577 2681:dup             
		// 1578 2682:sipush          137
		// 1579 2685:sipush          176
		// 1580 2688:iastore         
		// 1581 2689:dup             
		// 1582 2690:sipush          138
		// 1583 2693:bipush          77
		// 1584 2695:iastore         
		// 1585 2696:dup             
		// 1586 2697:sipush          139
		// 1587 2700:sipush          154
		// 1588 2703:iastore         
		// 1589 2704:dup             
		// 1590 2705:sipush          140
		// 1591 2708:bipush          25
		// 1592 2710:iastore         
		// 1593 2711:dup             
		// 1594 2712:sipush          141
		// 1595 2715:bipush          50
		// 1596 2717:iastore         
		// 1597 2718:dup             
		// 1598 2719:sipush          142
		// 1599 2722:bipush          100
		// 1600 2724:iastore         
		// 1601 2725:dup             
		// 1602 2726:sipush          143
		// 1603 2729:sipush          200
		// 1604 2732:iastore         
		// 1605 2733:dup             
		// 1606 2734:sipush          144
		// 1607 2737:sipush          189
		// 1608 2740:iastore         
		// 1609 2741:dup             
		// 1610 2742:sipush          145
		// 1611 2745:bipush          87
		// 1612 2747:iastore         
		// 1613 2748:dup             
		// 1614 2749:sipush          146
		// 1615 2752:sipush          174
		// 1616 2755:iastore         
		// 1617 2756:dup             
		// 1618 2757:sipush          147
		// 1619 2760:bipush          113
		// 1620 2762:iastore         
		// 1621 2763:dup             
		// 1622 2764:sipush          148
		// 1623 2767:sipush          226
		// 1624 2770:iastore         
		// 1625 2771:dup             
		// 1626 2772:sipush          149
		// 1627 2775:sipush          233
		// 1628 2778:iastore         
		// 1629 2779:dup             
		// 1630 2780:sipush          150
		// 1631 2783:sipush          255
		// 1632 2786:iastore         
		// 1633 2787:dup             
		// 1634 2788:sipush          151
		// 1635 2791:sipush          211
		// 1636 2794:iastore         
		// 1637 2795:dup             
		// 1638 2796:sipush          152
		// 1639 2799:sipush          139
		// 1640 2802:iastore         
		// 1641 2803:dup             
		// 1642 2804:sipush          153
		// 1643 2807:bipush          59
		// 1644 2809:iastore         
		// 1645 2810:dup             
		// 1646 2811:sipush          154
		// 1647 2814:bipush          118
		// 1648 2816:iastore         
		// 1649 2817:dup             
		// 1650 2818:sipush          155
		// 1651 2821:sipush          236
		// 1652 2824:iastore         
		// 1653 2825:dup             
		// 1654 2826:sipush          156
		// 1655 2829:sipush          245
		// 1656 2832:iastore         
		// 1657 2833:dup             
		// 1658 2834:sipush          157
		// 1659 2837:sipush          199
		// 1660 2840:iastore         
		// 1661 2841:dup             
		// 1662 2842:sipush          158
		// 1663 2845:sipush          163
		// 1664 2848:iastore         
		// 1665 2849:dup             
		// 1666 2850:sipush          159
		// 1667 2853:bipush          107
		// 1668 2855:iastore         
		// 1669 2856:dup             
		// 1670 2857:sipush          160
		// 1671 2860:sipush          214
		// 1672 2863:iastore         
		// 1673 2864:dup             
		// 1674 2865:sipush          161
		// 1675 2868:sipush          129
		// 1676 2871:iastore         
		// 1677 2872:dup             
		// 1678 2873:sipush          162
		// 1679 2876:bipush          47
		// 1680 2878:iastore         
		// 1681 2879:dup             
		// 1682 2880:sipush          163
		// 1683 2883:bipush          94
		// 1684 2885:iastore         
		// 1685 2886:dup             
		// 1686 2887:sipush          164
		// 1687 2890:sipush          188
		// 1688 2893:iastore         
		// 1689 2894:dup             
		// 1690 2895:sipush          165
		// 1691 2898:bipush          85
		// 1692 2900:iastore         
		// 1693 2901:dup             
		// 1694 2902:sipush          166
		// 1695 2905:sipush          170
		// 1696 2908:iastore         
		// 1697 2909:dup             
		// 1698 2910:sipush          167
		// 1699 2913:bipush          121
		// 1700 2915:iastore         
		// 1701 2916:dup             
		// 1702 2917:sipush          168
		// 1703 2920:sipush          242
		// 1704 2923:iastore         
		// 1705 2924:dup             
		// 1706 2925:sipush          169
		// 1707 2928:sipush          201
		// 1708 2931:iastore         
		// 1709 2932:dup             
		// 1710 2933:sipush          170
		// 1711 2936:sipush          191
		// 1712 2939:iastore         
		// 1713 2940:dup             
		// 1714 2941:sipush          171
		// 1715 2944:bipush          83
		// 1716 2946:iastore         
		// 1717 2947:dup             
		// 1718 2948:sipush          172
		// 1719 2951:sipush          166
		// 1720 2954:iastore         
		// 1721 2955:dup             
		// 1722 2956:sipush          173
		// 1723 2959:bipush          97
		// 1724 2961:iastore         
		// 1725 2962:dup             
		// 1726 2963:sipush          174
		// 1727 2966:sipush          194
		// 1728 2969:iastore         
		// 1729 2970:dup             
		// 1730 2971:sipush          175
		// 1731 2974:sipush          169
		// 1732 2977:iastore         
		// 1733 2978:dup             
		// 1734 2979:sipush          176
		// 1735 2982:bipush          127
		// 1736 2984:iastore         
		// 1737 2985:dup             
		// 1738 2986:sipush          177
		// 1739 2989:sipush          254
		// 1740 2992:iastore         
		// 1741 2993:dup             
		// 1742 2994:sipush          178
		// 1743 2997:sipush          209
		// 1744 3000:iastore         
		// 1745 3001:dup             
		// 1746 3002:sipush          179
		// 1747 3005:sipush          143
		// 1748 3008:iastore         
		// 1749 3009:dup             
		// 1750 3010:sipush          180
		// 1751 3013:bipush          51
		// 1752 3015:iastore         
		// 1753 3016:dup             
		// 1754 3017:sipush          181
		// 1755 3020:bipush          102
		// 1756 3022:iastore         
		// 1757 3023:dup             
		// 1758 3024:sipush          182
		// 1759 3027:sipush          204
		// 1760 3030:iastore         
		// 1761 3031:dup             
		// 1762 3032:sipush          183
		// 1763 3035:sipush          181
		// 1764 3038:iastore         
		// 1765 3039:dup             
		// 1766 3040:sipush          184
		// 1767 3043:bipush          71
		// 1768 3045:iastore         
		// 1769 3046:dup             
		// 1770 3047:sipush          185
		// 1771 3050:sipush          142
		// 1772 3053:iastore         
		// 1773 3054:dup             
		// 1774 3055:sipush          186
		// 1775 3058:bipush          49
		// 1776 3060:iastore         
		// 1777 3061:dup             
		// 1778 3062:sipush          187
		// 1779 3065:bipush          98
		// 1780 3067:iastore         
		// 1781 3068:dup             
		// 1782 3069:sipush          188
		// 1783 3072:sipush          196
		// 1784 3075:iastore         
		// 1785 3076:dup             
		// 1786 3077:sipush          189
		// 1787 3080:sipush          165
		// 1788 3083:iastore         
		// 1789 3084:dup             
		// 1790 3085:sipush          190
		// 1791 3088:bipush          103
		// 1792 3090:iastore         
		// 1793 3091:dup             
		// 1794 3092:sipush          191
		// 1795 3095:sipush          206
		// 1796 3098:iastore         
		// 1797 3099:dup             
		// 1798 3100:sipush          192
		// 1799 3103:sipush          177
		// 1800 3106:iastore         
		// 1801 3107:dup             
		// 1802 3108:sipush          193
		// 1803 3111:bipush          79
		// 1804 3113:iastore         
		// 1805 3114:dup             
		// 1806 3115:sipush          194
		// 1807 3118:sipush          158
		// 1808 3121:iastore         
		// 1809 3122:dup             
		// 1810 3123:sipush          195
		// 1811 3126:bipush          17
		// 1812 3128:iastore         
		// 1813 3129:dup             
		// 1814 3130:sipush          196
		// 1815 3133:bipush          34
		// 1816 3135:iastore         
		// 1817 3136:dup             
		// 1818 3137:sipush          197
		// 1819 3140:bipush          68
		// 1820 3142:iastore         
		// 1821 3143:dup             
		// 1822 3144:sipush          198
		// 1823 3147:sipush          136
		// 1824 3150:iastore         
		// 1825 3151:dup             
		// 1826 3152:sipush          199
		// 1827 3155:bipush          61
		// 1828 3157:iastore         
		// 1829 3158:dup             
		// 1830 3159:sipush          200
		// 1831 3162:bipush          122
		// 1832 3164:iastore         
		// 1833 3165:dup             
		// 1834 3166:sipush          201
		// 1835 3169:sipush          244
		// 1836 3172:iastore         
		// 1837 3173:dup             
		// 1838 3174:sipush          202
		// 1839 3177:sipush          197
		// 1840 3180:iastore         
		// 1841 3181:dup             
		// 1842 3182:sipush          203
		// 1843 3185:sipush          167
		// 1844 3188:iastore         
		// 1845 3189:dup             
		// 1846 3190:sipush          204
		// 1847 3193:bipush          99
		// 1848 3195:iastore         
		// 1849 3196:dup             
		// 1850 3197:sipush          205
		// 1851 3200:sipush          198
		// 1852 3203:iastore         
		// 1853 3204:dup             
		// 1854 3205:sipush          206
		// 1855 3208:sipush          161
		// 1856 3211:iastore         
		// 1857 3212:dup             
		// 1858 3213:sipush          207
		// 1859 3216:bipush          111
		// 1860 3218:iastore         
		// 1861 3219:dup             
		// 1862 3220:sipush          208
		// 1863 3223:sipush          222
		// 1864 3226:iastore         
		// 1865 3227:dup             
		// 1866 3228:sipush          209
		// 1867 3231:sipush          145
		// 1868 3234:iastore         
		// 1869 3235:dup             
		// 1870 3236:sipush          210
		// 1871 3239:bipush          15
		// 1872 3241:iastore         
		// 1873 3242:dup             
		// 1874 3243:sipush          211
		// 1875 3246:bipush          30
		// 1876 3248:iastore         
		// 1877 3249:dup             
		// 1878 3250:sipush          212
		// 1879 3253:bipush          60
		// 1880 3255:iastore         
		// 1881 3256:dup             
		// 1882 3257:sipush          213
		// 1883 3260:bipush          120
		// 1884 3262:iastore         
		// 1885 3263:dup             
		// 1886 3264:sipush          214
		// 1887 3267:sipush          240
		// 1888 3270:iastore         
		// 1889 3271:dup             
		// 1890 3272:sipush          215
		// 1891 3275:sipush          205
		// 1892 3278:iastore         
		// 1893 3279:dup             
		// 1894 3280:sipush          216
		// 1895 3283:sipush          183
		// 1896 3286:iastore         
		// 1897 3287:dup             
		// 1898 3288:sipush          217
		// 1899 3291:bipush          67
		// 1900 3293:iastore         
		// 1901 3294:dup             
		// 1902 3295:sipush          218
		// 1903 3298:sipush          134
		// 1904 3301:iastore         
		// 1905 3302:dup             
		// 1906 3303:sipush          219
		// 1907 3306:bipush          33
		// 1908 3308:iastore         
		// 1909 3309:dup             
		// 1910 3310:sipush          220
		// 1911 3313:bipush          66
		// 1912 3315:iastore         
		// 1913 3316:dup             
		// 1914 3317:sipush          221
		// 1915 3320:sipush          132
		// 1916 3323:iastore         
		// 1917 3324:dup             
		// 1918 3325:sipush          222
		// 1919 3328:bipush          37
		// 1920 3330:iastore         
		// 1921 3331:dup             
		// 1922 3332:sipush          223
		// 1923 3335:bipush          74
		// 1924 3337:iastore         
		// 1925 3338:dup             
		// 1926 3339:sipush          224
		// 1927 3342:sipush          148
		// 1928 3345:iastore         
		// 1929 3346:dup             
		// 1930 3347:sipush          225
		// 1931 3350:iconst_5        
		// 1932 3351:iastore         
		// 1933 3352:dup             
		// 1934 3353:sipush          226
		// 1935 3356:bipush          10
		// 1936 3358:iastore         
		// 1937 3359:dup             
		// 1938 3360:sipush          227
		// 1939 3363:bipush          20
		// 1940 3365:iastore         
		// 1941 3366:dup             
		// 1942 3367:sipush          228
		// 1943 3370:bipush          40
		// 1944 3372:iastore         
		// 1945 3373:dup             
		// 1946 3374:sipush          229
		// 1947 3377:bipush          80
		// 1948 3379:iastore         
		// 1949 3380:dup             
		// 1950 3381:sipush          230
		// 1951 3384:sipush          160
		// 1952 3387:iastore         
		// 1953 3388:dup             
		// 1954 3389:sipush          231
		// 1955 3392:bipush          109
		// 1956 3394:iastore         
		// 1957 3395:dup             
		// 1958 3396:sipush          232
		// 1959 3399:sipush          218
		// 1960 3402:iastore         
		// 1961 3403:dup             
		// 1962 3404:sipush          233
		// 1963 3407:sipush          153
		// 1964 3410:iastore         
		// 1965 3411:dup             
		// 1966 3412:sipush          234
		// 1967 3415:bipush          31
		// 1968 3417:iastore         
		// 1969 3418:dup             
		// 1970 3419:sipush          235
		// 1971 3422:bipush          62
		// 1972 3424:iastore         
		// 1973 3425:dup             
		// 1974 3426:sipush          236
		// 1975 3429:bipush          124
		// 1976 3431:iastore         
		// 1977 3432:dup             
		// 1978 3433:sipush          237
		// 1979 3436:sipush          248
		// 1980 3439:iastore         
		// 1981 3440:dup             
		// 1982 3441:sipush          238
		// 1983 3444:sipush          221
		// 1984 3447:iastore         
		// 1985 3448:dup             
		// 1986 3449:sipush          239
		// 1987 3452:sipush          151
		// 1988 3455:iastore         
		// 1989 3456:dup             
		// 1990 3457:sipush          240
		// 1991 3460:iconst_3        
		// 1992 3461:iastore         
		// 1993 3462:dup             
		// 1994 3463:sipush          241
		// 1995 3466:bipush          6
		// 1996 3468:iastore         
		// 1997 3469:dup             
		// 1998 3470:sipush          242
		// 1999 3473:bipush          12
		// 2000 3475:iastore         
		// 2001 3476:dup             
		// 2002 3477:sipush          243
		// 2003 3480:bipush          24
		// 2004 3482:iastore         
		// 2005 3483:dup             
		// 2006 3484:sipush          244
		// 2007 3487:bipush          48
		// 2008 3489:iastore         
		// 2009 3490:dup             
		// 2010 3491:sipush          245
		// 2011 3494:bipush          96
		// 2012 3496:iastore         
		// 2013 3497:dup             
		// 2014 3498:sipush          246
		// 2015 3501:sipush          192
		// 2016 3504:iastore         
		// 2017 3505:dup             
		// 2018 3506:sipush          247
		// 2019 3509:sipush          173
		// 2020 3512:iastore         
		// 2021 3513:dup             
		// 2022 3514:sipush          248
		// 2023 3517:bipush          119
		// 2024 3519:iastore         
		// 2025 3520:dup             
		// 2026 3521:sipush          249
		// 2027 3524:sipush          238
		// 2028 3527:iastore         
		// 2029 3528:dup             
		// 2030 3529:sipush          250
		// 2031 3532:sipush          241
		// 2032 3535:iastore         
		// 2033 3536:dup             
		// 2034 3537:sipush          251
		// 2035 3540:sipush          207
		// 2036 3543:iastore         
		// 2037 3544:dup             
		// 2038 3545:sipush          252
		// 2039 3548:sipush          179
		// 2040 3551:iastore         
		// 2041 3552:dup             
		// 2042 3553:sipush          253
		// 2043 3556:bipush          75
		// 2044 3558:iastore         
		// 2045 3559:dup             
		// 2046 3560:sipush          254
		// 2047 3563:sipush          150
		// 2048 3566:iastore         
		// 2049 3567:dup             
		// 2050 3568:sipush          255
		// 2051 3571:iconst_1        
		// 2052 3572:iastore         
		// 2053 3573:putstatic       #32  <Field int[] alog>
		// 2054 3576:iconst_5        
		// 2055 3577:newarray        int[]
		// 2056 3579:dup             
		// 2057 3580:iconst_0        
		// 2058 3581:sipush          228
		// 2059 3584:iastore         
		// 2060 3585:dup             
		// 2061 3586:iconst_1        
		// 2062 3587:bipush          48
		// 2063 3589:iastore         
		// 2064 3590:dup             
		// 2065 3591:iconst_2        
		// 2066 3592:bipush          15
		// 2067 3594:iastore         
		// 2068 3595:dup             
		// 2069 3596:iconst_3        
		// 2070 3597:bipush          111
		// 2071 3599:iastore         
		// 2072 3600:dup             
		// 2073 3601:iconst_4        
		// 2074 3602:bipush          62
		// 2075 3604:iastore         
		// 2076 3605:putstatic       #34  <Field int[] poly5>
		// 2077 3608:bipush          7
		// 2078 3610:newarray        int[]
		// 2079 3612:dup             
		// 2080 3613:iconst_0        
		// 2081 3614:bipush          23
		// 2082 3616:iastore         
		// 2083 3617:dup             
		// 2084 3618:iconst_1        
		// 2085 3619:bipush          68
		// 2086 3621:iastore         
		// 2087 3622:dup             
		// 2088 3623:iconst_2        
		// 2089 3624:sipush          144
		// 2090 3627:iastore         
		// 2091 3628:dup             
		// 2092 3629:iconst_3        
		// 2093 3630:sipush          134
		// 2094 3633:iastore         
		// 2095 3634:dup             
		// 2096 3635:iconst_4        
		// 2097 3636:sipush          240
		// 2098 3639:iastore         
		// 2099 3640:dup             
		// 2100 3641:iconst_5        
		// 2101 3642:bipush          92
		// 2102 3644:iastore         
		// 2103 3645:dup             
		// 2104 3646:bipush          6
		// 2105 3648:sipush          254
		// 2106 3651:iastore         
		// 2107 3652:putstatic       #36  <Field int[] poly7>
		// 2108 3655:bipush          10
		// 2109 3657:newarray        int[]
		// 2110 3659:dup             
		// 2111 3660:iconst_0        
		// 2112 3661:bipush          28
		// 2113 3663:iastore         
		// 2114 3664:dup             
		// 2115 3665:iconst_1        
		// 2116 3666:bipush          24
		// 2117 3668:iastore         
		// 2118 3669:dup             
		// 2119 3670:iconst_2        
		// 2120 3671:sipush          185
		// 2121 3674:iastore         
		// 2122 3675:dup             
		// 2123 3676:iconst_3        
		// 2124 3677:sipush          166
		// 2125 3680:iastore         
		// 2126 3681:dup             
		// 2127 3682:iconst_4        
		// 2128 3683:sipush          223
		// 2129 3686:iastore         
		// 2130 3687:dup             
		// 2131 3688:iconst_5        
		// 2132 3689:sipush          248
		// 2133 3692:iastore         
		// 2134 3693:dup             
		// 2135 3694:bipush          6
		// 2136 3696:bipush          116
		// 2137 3698:iastore         
		// 2138 3699:dup             
		// 2139 3700:bipush          7
		// 2140 3702:sipush          255
		// 2141 3705:iastore         
		// 2142 3706:dup             
		// 2143 3707:bipush          8
		// 2144 3709:bipush          110
		// 2145 3711:iastore         
		// 2146 3712:dup             
		// 2147 3713:bipush          9
		// 2148 3715:bipush          61
		// 2149 3717:iastore         
		// 2150 3718:putstatic       #38  <Field int[] poly10>
		// 2151 3721:bipush          11
		// 2152 3723:newarray        int[]
		// 2153 3725:dup             
		// 2154 3726:iconst_0        
		// 2155 3727:sipush          175
		// 2156 3730:iastore         
		// 2157 3731:dup             
		// 2158 3732:iconst_1        
		// 2159 3733:sipush          138
		// 2160 3736:iastore         
		// 2161 3737:dup             
		// 2162 3738:iconst_2        
		// 2163 3739:sipush          205
		// 2164 3742:iastore         
		// 2165 3743:dup             
		// 2166 3744:iconst_3        
		// 2167 3745:bipush          12
		// 2168 3747:iastore         
		// 2169 3748:dup             
		// 2170 3749:iconst_4        
		// 2171 3750:sipush          194
		// 2172 3753:iastore         
		// 2173 3754:dup             
		// 2174 3755:iconst_5        
		// 2175 3756:sipush          168
		// 2176 3759:iastore         
		// 2177 3760:dup             
		// 2178 3761:bipush          6
		// 2179 3763:bipush          39
		// 2180 3765:iastore         
		// 2181 3766:dup             
		// 2182 3767:bipush          7
		// 2183 3769:sipush          245
		// 2184 3772:iastore         
		// 2185 3773:dup             
		// 2186 3774:bipush          8
		// 2187 3776:bipush          60
		// 2188 3778:iastore         
		// 2189 3779:dup             
		// 2190 3780:bipush          9
		// 2191 3782:bipush          97
		// 2192 3784:iastore         
		// 2193 3785:dup             
		// 2194 3786:bipush          10
		// 2195 3788:bipush          120
		// 2196 3790:iastore         
		// 2197 3791:putstatic       #40  <Field int[] poly11>
		// 2198 3794:bipush          12
		// 2199 3796:newarray        int[]
		// 2200 3798:dup             
		// 2201 3799:iconst_0        
		// 2202 3800:bipush          41
		// 2203 3802:iastore         
		// 2204 3803:dup             
		// 2205 3804:iconst_1        
		// 2206 3805:sipush          153
		// 2207 3808:iastore         
		// 2208 3809:dup             
		// 2209 3810:iconst_2        
		// 2210 3811:sipush          158
		// 2211 3814:iastore         
		// 2212 3815:dup             
		// 2213 3816:iconst_3        
		// 2214 3817:bipush          91
		// 2215 3819:iastore         
		// 2216 3820:dup             
		// 2217 3821:iconst_4        
		// 2218 3822:bipush          61
		// 2219 3824:iastore         
		// 2220 3825:dup             
		// 2221 3826:iconst_5        
		// 2222 3827:bipush          42
		// 2223 3829:iastore         
		// 2224 3830:dup             
		// 2225 3831:bipush          6
		// 2226 3833:sipush          142
		// 2227 3836:iastore         
		// 2228 3837:dup             
		// 2229 3838:bipush          7
		// 2230 3840:sipush          213
		// 2231 3843:iastore         
		// 2232 3844:dup             
		// 2233 3845:bipush          8
		// 2234 3847:bipush          97
		// 2235 3849:iastore         
		// 2236 3850:dup             
		// 2237 3851:bipush          9
		// 2238 3853:sipush          178
		// 2239 3856:iastore         
		// 2240 3857:dup             
		// 2241 3858:bipush          10
		// 2242 3860:bipush          100
		// 2243 3862:iastore         
		// 2244 3863:dup             
		// 2245 3864:bipush          11
		// 2246 3866:sipush          242
		// 2247 3869:iastore         
		// 2248 3870:putstatic       #42  <Field int[] poly12>
		// 2249 3873:bipush          14
		// 2250 3875:newarray        int[]
		// 2251 3877:dup             
		// 2252 3878:iconst_0        
		// 2253 3879:sipush          156
		// 2254 3882:iastore         
		// 2255 3883:dup             
		// 2256 3884:iconst_1        
		// 2257 3885:bipush          97
		// 2258 3887:iastore         
		// 2259 3888:dup             
		// 2260 3889:iconst_2        
		// 2261 3890:sipush          192
		// 2262 3893:iastore         
		// 2263 3894:dup             
		// 2264 3895:iconst_3        
		// 2265 3896:sipush          252
		// 2266 3899:iastore         
		// 2267 3900:dup             
		// 2268 3901:iconst_4        
		// 2269 3902:bipush          95
		// 2270 3904:iastore         
		// 2271 3905:dup             
		// 2272 3906:iconst_5        
		// 2273 3907:bipush          9
		// 2274 3909:iastore         
		// 2275 3910:dup             
		// 2276 3911:bipush          6
		// 2277 3913:sipush          157
		// 2278 3916:iastore         
		// 2279 3917:dup             
		// 2280 3918:bipush          7
		// 2281 3920:bipush          119
		// 2282 3922:iastore         
		// 2283 3923:dup             
		// 2284 3924:bipush          8
		// 2285 3926:sipush          138
		// 2286 3929:iastore         
		// 2287 3930:dup             
		// 2288 3931:bipush          9
		// 2289 3933:bipush          45
		// 2290 3935:iastore         
		// 2291 3936:dup             
		// 2292 3937:bipush          10
		// 2293 3939:bipush          18
		// 2294 3941:iastore         
		// 2295 3942:dup             
		// 2296 3943:bipush          11
		// 2297 3945:sipush          186
		// 2298 3948:iastore         
		// 2299 3949:dup             
		// 2300 3950:bipush          12
		// 2301 3952:bipush          83
		// 2302 3954:iastore         
		// 2303 3955:dup             
		// 2304 3956:bipush          13
		// 2305 3958:sipush          185
		// 2306 3961:iastore         
		// 2307 3962:putstatic       #44  <Field int[] poly14>
		// 2308 3965:bipush          18
		// 2309 3967:newarray        int[]
		// 2310 3969:dup             
		// 2311 3970:iconst_0        
		// 2312 3971:bipush          83
		// 2313 3973:iastore         
		// 2314 3974:dup             
		// 2315 3975:iconst_1        
		// 2316 3976:sipush          195
		// 2317 3979:iastore         
		// 2318 3980:dup             
		// 2319 3981:iconst_2        
		// 2320 3982:bipush          100
		// 2321 3984:iastore         
		// 2322 3985:dup             
		// 2323 3986:iconst_3        
		// 2324 3987:bipush          39
		// 2325 3989:iastore         
		// 2326 3990:dup             
		// 2327 3991:iconst_4        
		// 2328 3992:sipush          188
		// 2329 3995:iastore         
		// 2330 3996:dup             
		// 2331 3997:iconst_5        
		// 2332 3998:bipush          75
		// 2333 4000:iastore         
		// 2334 4001:dup             
		// 2335 4002:bipush          6
		// 2336 4004:bipush          66
		// 2337 4006:iastore         
		// 2338 4007:dup             
		// 2339 4008:bipush          7
		// 2340 4010:bipush          61
		// 2341 4012:iastore         
		// 2342 4013:dup             
		// 2343 4014:bipush          8
		// 2344 4016:sipush          241
		// 2345 4019:iastore         
		// 2346 4020:dup             
		// 2347 4021:bipush          9
		// 2348 4023:sipush          213
		// 2349 4026:iastore         
		// 2350 4027:dup             
		// 2351 4028:bipush          10
		// 2352 4030:bipush          109
		// 2353 4032:iastore         
		// 2354 4033:dup             
		// 2355 4034:bipush          11
		// 2356 4036:sipush          129
		// 2357 4039:iastore         
		// 2358 4040:dup             
		// 2359 4041:bipush          12
		// 2360 4043:bipush          94
		// 2361 4045:iastore         
		// 2362 4046:dup             
		// 2363 4047:bipush          13
		// 2364 4049:sipush          254
		// 2365 4052:iastore         
		// 2366 4053:dup             
		// 2367 4054:bipush          14
		// 2368 4056:sipush          225
		// 2369 4059:iastore         
		// 2370 4060:dup             
		// 2371 4061:bipush          15
		// 2372 4063:bipush          48
		// 2373 4065:iastore         
		// 2374 4066:dup             
		// 2375 4067:bipush          16
		// 2376 4069:bipush          90
		// 2377 4071:iastore         
		// 2378 4072:dup             
		// 2379 4073:bipush          17
		// 2380 4075:sipush          188
		// 2381 4078:iastore         
		// 2382 4079:putstatic       #46  <Field int[] poly18>
		// 2383 4082:bipush          20
		// 2384 4084:newarray        int[]
		// 2385 4086:dup             
		// 2386 4087:iconst_0        
		// 2387 4088:bipush          15
		// 2388 4090:iastore         
		// 2389 4091:dup             
		// 2390 4092:iconst_1        
		// 2391 4093:sipush          195
		// 2392 4096:iastore         
		// 2393 4097:dup             
		// 2394 4098:iconst_2        
		// 2395 4099:sipush          244
		// 2396 4102:iastore         
		// 2397 4103:dup             
		// 2398 4104:iconst_3        
		// 2399 4105:bipush          9
		// 2400 4107:iastore         
		// 2401 4108:dup             
		// 2402 4109:iconst_4        
		// 2403 4110:sipush          233
		// 2404 4113:iastore         
		// 2405 4114:dup             
		// 2406 4115:iconst_5        
		// 2407 4116:bipush          71
		// 2408 4118:iastore         
		// 2409 4119:dup             
		// 2410 4120:bipush          6
		// 2411 4122:sipush          168
		// 2412 4125:iastore         
		// 2413 4126:dup             
		// 2414 4127:bipush          7
		// 2415 4129:iconst_2        
		// 2416 4130:iastore         
		// 2417 4131:dup             
		// 2418 4132:bipush          8
		// 2419 4134:sipush          188
		// 2420 4137:iastore         
		// 2421 4138:dup             
		// 2422 4139:bipush          9
		// 2423 4141:sipush          160
		// 2424 4144:iastore         
		// 2425 4145:dup             
		// 2426 4146:bipush          10
		// 2427 4148:sipush          153
		// 2428 4151:iastore         
		// 2429 4152:dup             
		// 2430 4153:bipush          11
		// 2431 4155:sipush          145
		// 2432 4158:iastore         
		// 2433 4159:dup             
		// 2434 4160:bipush          12
		// 2435 4162:sipush          253
		// 2436 4165:iastore         
		// 2437 4166:dup             
		// 2438 4167:bipush          13
		// 2439 4169:bipush          79
		// 2440 4171:iastore         
		// 2441 4172:dup             
		// 2442 4173:bipush          14
		// 2443 4175:bipush          108
		// 2444 4177:iastore         
		// 2445 4178:dup             
		// 2446 4179:bipush          15
		// 2447 4181:bipush          82
		// 2448 4183:iastore         
		// 2449 4184:dup             
		// 2450 4185:bipush          16
		// 2451 4187:bipush          27
		// 2452 4189:iastore         
		// 2453 4190:dup             
		// 2454 4191:bipush          17
		// 2455 4193:sipush          174
		// 2456 4196:iastore         
		// 2457 4197:dup             
		// 2458 4198:bipush          18
		// 2459 4200:sipush          186
		// 2460 4203:iastore         
		// 2461 4204:dup             
		// 2462 4205:bipush          19
		// 2463 4207:sipush          172
		// 2464 4210:iastore         
		// 2465 4211:putstatic       #48  <Field int[] poly20>
		// 2466 4214:bipush          24
		// 2467 4216:newarray        int[]
		// 2468 4218:dup             
		// 2469 4219:iconst_0        
		// 2470 4220:bipush          52
		// 2471 4222:iastore         
		// 2472 4223:dup             
		// 2473 4224:iconst_1        
		// 2474 4225:sipush          190
		// 2475 4228:iastore         
		// 2476 4229:dup             
		// 2477 4230:iconst_2        
		// 2478 4231:bipush          88
		// 2479 4233:iastore         
		// 2480 4234:dup             
		// 2481 4235:iconst_3        
		// 2482 4236:sipush          205
		// 2483 4239:iastore         
		// 2484 4240:dup             
		// 2485 4241:iconst_4        
		// 2486 4242:bipush          109
		// 2487 4244:iastore         
		// 2488 4245:dup             
		// 2489 4246:iconst_5        
		// 2490 4247:bipush          39
		// 2491 4249:iastore         
		// 2492 4250:dup             
		// 2493 4251:bipush          6
		// 2494 4253:sipush          176
		// 2495 4256:iastore         
		// 2496 4257:dup             
		// 2497 4258:bipush          7
		// 2498 4260:bipush          21
		// 2499 4262:iastore         
		// 2500 4263:dup             
		// 2501 4264:bipush          8
		// 2502 4266:sipush          155
		// 2503 4269:iastore         
		// 2504 4270:dup             
		// 2505 4271:bipush          9
		// 2506 4273:sipush          197
		// 2507 4276:iastore         
		// 2508 4277:dup             
		// 2509 4278:bipush          10
		// 2510 4280:sipush          251
		// 2511 4283:iastore         
		// 2512 4284:dup             
		// 2513 4285:bipush          11
		// 2514 4287:sipush          223
		// 2515 4290:iastore         
		// 2516 4291:dup             
		// 2517 4292:bipush          12
		// 2518 4294:sipush          155
		// 2519 4297:iastore         
		// 2520 4298:dup             
		// 2521 4299:bipush          13
		// 2522 4301:bipush          21
		// 2523 4303:iastore         
		// 2524 4304:dup             
		// 2525 4305:bipush          14
		// 2526 4307:iconst_5        
		// 2527 4308:iastore         
		// 2528 4309:dup             
		// 2529 4310:bipush          15
		// 2530 4312:sipush          172
		// 2531 4315:iastore         
		// 2532 4316:dup             
		// 2533 4317:bipush          16
		// 2534 4319:sipush          254
		// 2535 4322:iastore         
		// 2536 4323:dup             
		// 2537 4324:bipush          17
		// 2538 4326:bipush          124
		// 2539 4328:iastore         
		// 2540 4329:dup             
		// 2541 4330:bipush          18
		// 2542 4332:bipush          12
		// 2543 4334:iastore         
		// 2544 4335:dup             
		// 2545 4336:bipush          19
		// 2546 4338:sipush          181
		// 2547 4341:iastore         
		// 2548 4342:dup             
		// 2549 4343:bipush          20
		// 2550 4345:sipush          184
		// 2551 4348:iastore         
		// 2552 4349:dup             
		// 2553 4350:bipush          21
		// 2554 4352:bipush          96
		// 2555 4354:iastore         
		// 2556 4355:dup             
		// 2557 4356:bipush          22
		// 2558 4358:bipush          50
		// 2559 4360:iastore         
		// 2560 4361:dup             
		// 2561 4362:bipush          23
		// 2562 4364:sipush          193
		// 2563 4367:iastore         
		// 2564 4368:putstatic       #50  <Field int[] poly24>
		// 2565 4371:bipush          28
		// 2566 4373:newarray        int[]
		// 2567 4375:dup             
		// 2568 4376:iconst_0        
		// 2569 4377:sipush          211
		// 2570 4380:iastore         
		// 2571 4381:dup             
		// 2572 4382:iconst_1        
		// 2573 4383:sipush          231
		// 2574 4386:iastore         
		// 2575 4387:dup             
		// 2576 4388:iconst_2        
		// 2577 4389:bipush          43
		// 2578 4391:iastore         
		// 2579 4392:dup             
		// 2580 4393:iconst_3        
		// 2581 4394:bipush          97
		// 2582 4396:iastore         
		// 2583 4397:dup             
		// 2584 4398:iconst_4        
		// 2585 4399:bipush          71
		// 2586 4401:iastore         
		// 2587 4402:dup             
		// 2588 4403:iconst_5        
		// 2589 4404:bipush          96
		// 2590 4406:iastore         
		// 2591 4407:dup             
		// 2592 4408:bipush          6
		// 2593 4410:bipush          103
		// 2594 4412:iastore         
		// 2595 4413:dup             
		// 2596 4414:bipush          7
		// 2597 4416:sipush          174
		// 2598 4419:iastore         
		// 2599 4420:dup             
		// 2600 4421:bipush          8
		// 2601 4423:bipush          37
		// 2602 4425:iastore         
		// 2603 4426:dup             
		// 2604 4427:bipush          9
		// 2605 4429:sipush          151
		// 2606 4432:iastore         
		// 2607 4433:dup             
		// 2608 4434:bipush          10
		// 2609 4436:sipush          170
		// 2610 4439:iastore         
		// 2611 4440:dup             
		// 2612 4441:bipush          11
		// 2613 4443:bipush          53
		// 2614 4445:iastore         
		// 2615 4446:dup             
		// 2616 4447:bipush          12
		// 2617 4449:bipush          75
		// 2618 4451:iastore         
		// 2619 4452:dup             
		// 2620 4453:bipush          13
		// 2621 4455:bipush          34
		// 2622 4457:iastore         
		// 2623 4458:dup             
		// 2624 4459:bipush          14
		// 2625 4461:sipush          249
		// 2626 4464:iastore         
		// 2627 4465:dup             
		// 2628 4466:bipush          15
		// 2629 4468:bipush          121
		// 2630 4470:iastore         
		// 2631 4471:dup             
		// 2632 4472:bipush          16
		// 2633 4474:bipush          17
		// 2634 4476:iastore         
		// 2635 4477:dup             
		// 2636 4478:bipush          17
		// 2637 4480:sipush          138
		// 2638 4483:iastore         
		// 2639 4484:dup             
		// 2640 4485:bipush          18
		// 2641 4487:bipush          110
		// 2642 4489:iastore         
		// 2643 4490:dup             
		// 2644 4491:bipush          19
		// 2645 4493:sipush          213
		// 2646 4496:iastore         
		// 2647 4497:dup             
		// 2648 4498:bipush          20
		// 2649 4500:sipush          141
		// 2650 4503:iastore         
		// 2651 4504:dup             
		// 2652 4505:bipush          21
		// 2653 4507:sipush          136
		// 2654 4510:iastore         
		// 2655 4511:dup             
		// 2656 4512:bipush          22
		// 2657 4514:bipush          120
		// 2658 4516:iastore         
		// 2659 4517:dup             
		// 2660 4518:bipush          23
		// 2661 4520:sipush          151
		// 2662 4523:iastore         
		// 2663 4524:dup             
		// 2664 4525:bipush          24
		// 2665 4527:sipush          233
		// 2666 4530:iastore         
		// 2667 4531:dup             
		// 2668 4532:bipush          25
		// 2669 4534:sipush          168
		// 2670 4537:iastore         
		// 2671 4538:dup             
		// 2672 4539:bipush          26
		// 2673 4541:bipush          93
		// 2674 4543:iastore         
		// 2675 4544:dup             
		// 2676 4545:bipush          27
		// 2677 4547:sipush          255
		// 2678 4550:iastore         
		// 2679 4551:putstatic       #52  <Field int[] poly28>
		// 2680 4554:bipush          36
		// 2681 4556:newarray        int[]
		// 2682 4558:dup             
		// 2683 4559:iconst_0        
		// 2684 4560:sipush          245
		// 2685 4563:iastore         
		// 2686 4564:dup             
		// 2687 4565:iconst_1        
		// 2688 4566:bipush          127
		// 2689 4568:iastore         
		// 2690 4569:dup             
		// 2691 4570:iconst_2        
		// 2692 4571:sipush          242
		// 2693 4574:iastore         
		// 2694 4575:dup             
		// 2695 4576:iconst_3        
		// 2696 4577:sipush          218
		// 2697 4580:iastore         
		// 2698 4581:dup             
		// 2699 4582:iconst_4        
		// 2700 4583:sipush          130
		// 2701 4586:iastore         
		// 2702 4587:dup             
		// 2703 4588:iconst_5        
		// 2704 4589:sipush          250
		// 2705 4592:iastore         
		// 2706 4593:dup             
		// 2707 4594:bipush          6
		// 2708 4596:sipush          162
		// 2709 4599:iastore         
		// 2710 4600:dup             
		// 2711 4601:bipush          7
		// 2712 4603:sipush          181
		// 2713 4606:iastore         
		// 2714 4607:dup             
		// 2715 4608:bipush          8
		// 2716 4610:bipush          102
		// 2717 4612:iastore         
		// 2718 4613:dup             
		// 2719 4614:bipush          9
		// 2720 4616:bipush          120
		// 2721 4618:iastore         
		// 2722 4619:dup             
		// 2723 4620:bipush          10
		// 2724 4622:bipush          84
		// 2725 4624:iastore         
		// 2726 4625:dup             
		// 2727 4626:bipush          11
		// 2728 4628:sipush          179
		// 2729 4631:iastore         
		// 2730 4632:dup             
		// 2731 4633:bipush          12
		// 2732 4635:sipush          220
		// 2733 4638:iastore         
		// 2734 4639:dup             
		// 2735 4640:bipush          13
		// 2736 4642:sipush          251
		// 2737 4645:iastore         
		// 2738 4646:dup             
		// 2739 4647:bipush          14
		// 2740 4649:bipush          80
		// 2741 4651:iastore         
		// 2742 4652:dup             
		// 2743 4653:bipush          15
		// 2744 4655:sipush          182
		// 2745 4658:iastore         
		// 2746 4659:dup             
		// 2747 4660:bipush          16
		// 2748 4662:sipush          229
		// 2749 4665:iastore         
		// 2750 4666:dup             
		// 2751 4667:bipush          17
		// 2752 4669:bipush          18
		// 2753 4671:iastore         
		// 2754 4672:dup             
		// 2755 4673:bipush          18
		// 2756 4675:iconst_2        
		// 2757 4676:iastore         
		// 2758 4677:dup             
		// 2759 4678:bipush          19
		// 2760 4680:iconst_4        
		// 2761 4681:iastore         
		// 2762 4682:dup             
		// 2763 4683:bipush          20
		// 2764 4685:bipush          68
		// 2765 4687:iastore         
		// 2766 4688:dup             
		// 2767 4689:bipush          21
		// 2768 4691:bipush          33
		// 2769 4693:iastore         
		// 2770 4694:dup             
		// 2771 4695:bipush          22
		// 2772 4697:bipush          101
		// 2773 4699:iastore         
		// 2774 4700:dup             
		// 2775 4701:bipush          23
		// 2776 4703:sipush          137
		// 2777 4706:iastore         
		// 2778 4707:dup             
		// 2779 4708:bipush          24
		// 2780 4710:bipush          95
		// 2781 4712:iastore         
		// 2782 4713:dup             
		// 2783 4714:bipush          25
		// 2784 4716:bipush          119
		// 2785 4718:iastore         
		// 2786 4719:dup             
		// 2787 4720:bipush          26
		// 2788 4722:bipush          115
		// 2789 4724:iastore         
		// 2790 4725:dup             
		// 2791 4726:bipush          27
		// 2792 4728:bipush          44
		// 2793 4730:iastore         
		// 2794 4731:dup             
		// 2795 4732:bipush          28
		// 2796 4734:sipush          175
		// 2797 4737:iastore         
		// 2798 4738:dup             
		// 2799 4739:bipush          29
		// 2800 4741:sipush          184
		// 2801 4744:iastore         
		// 2802 4745:dup             
		// 2803 4746:bipush          30
		// 2804 4748:bipush          59
		// 2805 4750:iastore         
		// 2806 4751:dup             
		// 2807 4752:bipush          31
		// 2808 4754:bipush          25
		// 2809 4756:iastore         
		// 2810 4757:dup             
		// 2811 4758:bipush          32
		// 2812 4760:sipush          225
		// 2813 4763:iastore         
		// 2814 4764:dup             
		// 2815 4765:bipush          33
		// 2816 4767:bipush          98
		// 2817 4769:iastore         
		// 2818 4770:dup             
		// 2819 4771:bipush          34
		// 2820 4773:bipush          81
		// 2821 4775:iastore         
		// 2822 4776:dup             
		// 2823 4777:bipush          35
		// 2824 4779:bipush          112
		// 2825 4781:iastore         
		// 2826 4782:putstatic       #54  <Field int[] poly36>
		// 2827 4785:bipush          42
		// 2828 4787:newarray        int[]
		// 2829 4789:dup             
		// 2830 4790:iconst_0        
		// 2831 4791:bipush          77
		// 2832 4793:iastore         
		// 2833 4794:dup             
		// 2834 4795:iconst_1        
		// 2835 4796:sipush          193
		// 2836 4799:iastore         
		// 2837 4800:dup             
		// 2838 4801:iconst_2        
		// 2839 4802:sipush          137
		// 2840 4805:iastore         
		// 2841 4806:dup             
		// 2842 4807:iconst_3        
		// 2843 4808:bipush          31
		// 2844 4810:iastore         
		// 2845 4811:dup             
		// 2846 4812:iconst_4        
		// 2847 4813:bipush          19
		// 2848 4815:iastore         
		// 2849 4816:dup             
		// 2850 4817:iconst_5        
		// 2851 4818:bipush          38
		// 2852 4820:iastore         
		// 2853 4821:dup             
		// 2854 4822:bipush          6
		// 2855 4824:bipush          22
		// 2856 4826:iastore         
		// 2857 4827:dup             
		// 2858 4828:bipush          7
		// 2859 4830:sipush          153
		// 2860 4833:iastore         
		// 2861 4834:dup             
		// 2862 4835:bipush          8
		// 2863 4837:sipush          247
		// 2864 4840:iastore         
		// 2865 4841:dup             
		// 2866 4842:bipush          9
		// 2867 4844:bipush          105
		// 2868 4846:iastore         
		// 2869 4847:dup             
		// 2870 4848:bipush          10
		// 2871 4850:bipush          122
		// 2872 4852:iastore         
		// 2873 4853:dup             
		// 2874 4854:bipush          11
		// 2875 4856:iconst_2        
		// 2876 4857:iastore         
		// 2877 4858:dup             
		// 2878 4859:bipush          12
		// 2879 4861:sipush          245
		// 2880 4864:iastore         
		// 2881 4865:dup             
		// 2882 4866:bipush          13
		// 2883 4868:sipush          133
		// 2884 4871:iastore         
		// 2885 4872:dup             
		// 2886 4873:bipush          14
		// 2887 4875:sipush          242
		// 2888 4878:iastore         
		// 2889 4879:dup             
		// 2890 4880:bipush          15
		// 2891 4882:bipush          8
		// 2892 4884:iastore         
		// 2893 4885:dup             
		// 2894 4886:bipush          16
		// 2895 4888:sipush          175
		// 2896 4891:iastore         
		// 2897 4892:dup             
		// 2898 4893:bipush          17
		// 2899 4895:bipush          95
		// 2900 4897:iastore         
		// 2901 4898:dup             
		// 2902 4899:bipush          18
		// 2903 4901:bipush          100
		// 2904 4903:iastore         
		// 2905 4904:dup             
		// 2906 4905:bipush          19
		// 2907 4907:bipush          9
		// 2908 4909:iastore         
		// 2909 4910:dup             
		// 2910 4911:bipush          20
		// 2911 4913:sipush          167
		// 2912 4916:iastore         
		// 2913 4917:dup             
		// 2914 4918:bipush          21
		// 2915 4920:bipush          105
		// 2916 4922:iastore         
		// 2917 4923:dup             
		// 2918 4924:bipush          22
		// 2919 4926:sipush          214
		// 2920 4929:iastore         
		// 2921 4930:dup             
		// 2922 4931:bipush          23
		// 2923 4933:bipush          111
		// 2924 4935:iastore         
		// 2925 4936:dup             
		// 2926 4937:bipush          24
		// 2927 4939:bipush          57
		// 2928 4941:iastore         
		// 2929 4942:dup             
		// 2930 4943:bipush          25
		// 2931 4945:bipush          121
		// 2932 4947:iastore         
		// 2933 4948:dup             
		// 2934 4949:bipush          26
		// 2935 4951:bipush          21
		// 2936 4953:iastore         
		// 2937 4954:dup             
		// 2938 4955:bipush          27
		// 2939 4957:iconst_1        
		// 2940 4958:iastore         
		// 2941 4959:dup             
		// 2942 4960:bipush          28
		// 2943 4962:sipush          253
		// 2944 4965:iastore         
		// 2945 4966:dup             
		// 2946 4967:bipush          29
		// 2947 4969:bipush          57
		// 2948 4971:iastore         
		// 2949 4972:dup             
		// 2950 4973:bipush          30
		// 2951 4975:bipush          54
		// 2952 4977:iastore         
		// 2953 4978:dup             
		// 2954 4979:bipush          31
		// 2955 4981:bipush          101
		// 2956 4983:iastore         
		// 2957 4984:dup             
		// 2958 4985:bipush          32
		// 2959 4987:sipush          248
		// 2960 4990:iastore         
		// 2961 4991:dup             
		// 2962 4992:bipush          33
		// 2963 4994:sipush          202
		// 2964 4997:iastore         
		// 2965 4998:dup             
		// 2966 4999:bipush          34
		// 2967 5001:bipush          69
		// 2968 5003:iastore         
		// 2969 5004:dup             
		// 2970 5005:bipush          35
		// 2971 5007:bipush          50
		// 2972 5009:iastore         
		// 2973 5010:dup             
		// 2974 5011:bipush          36
		// 2975 5013:sipush          150
		// 2976 5016:iastore         
		// 2977 5017:dup             
		// 2978 5018:bipush          37
		// 2979 5020:sipush          177
		// 2980 5023:iastore         
		// 2981 5024:dup             
		// 2982 5025:bipush          38
		// 2983 5027:sipush          226
		// 2984 5030:iastore         
		// 2985 5031:dup             
		// 2986 5032:bipush          39
		// 2987 5034:iconst_5        
		// 2988 5035:iastore         
		// 2989 5036:dup             
		// 2990 5037:bipush          40
		// 2991 5039:bipush          9
		// 2992 5041:iastore         
		// 2993 5042:dup             
		// 2994 5043:bipush          41
		// 2995 5045:iconst_5        
		// 2996 5046:iastore         
		// 2997 5047:putstatic       #56  <Field int[] poly42>
		// 2998 5050:bipush          48
		// 2999 5052:newarray        int[]
		// 3000 5054:dup             
		// 3001 5055:iconst_0        
		// 3002 5056:sipush          245
		// 3003 5059:iastore         
		// 3004 5060:dup             
		// 3005 5061:iconst_1        
		// 3006 5062:sipush          132
		// 3007 5065:iastore         
		// 3008 5066:dup             
		// 3009 5067:iconst_2        
		// 3010 5068:sipush          172
		// 3011 5071:iastore         
		// 3012 5072:dup             
		// 3013 5073:iconst_3        
		// 3014 5074:sipush          223
		// 3015 5077:iastore         
		// 3016 5078:dup             
		// 3017 5079:iconst_4        
		// 3018 5080:bipush          96
		// 3019 5082:iastore         
		// 3020 5083:dup             
		// 3021 5084:iconst_5        
		// 3022 5085:bipush          32
		// 3023 5087:iastore         
		// 3024 5088:dup             
		// 3025 5089:bipush          6
		// 3026 5091:bipush          117
		// 3027 5093:iastore         
		// 3028 5094:dup             
		// 3029 5095:bipush          7
		// 3030 5097:bipush          22
		// 3031 5099:iastore         
		// 3032 5100:dup             
		// 3033 5101:bipush          8
		// 3034 5103:sipush          238
		// 3035 5106:iastore         
		// 3036 5107:dup             
		// 3037 5108:bipush          9
		// 3038 5110:sipush          133
		// 3039 5113:iastore         
		// 3040 5114:dup             
		// 3041 5115:bipush          10
		// 3042 5117:sipush          238
		// 3043 5120:iastore         
		// 3044 5121:dup             
		// 3045 5122:bipush          11
		// 3046 5124:sipush          231
		// 3047 5127:iastore         
		// 3048 5128:dup             
		// 3049 5129:bipush          12
		// 3050 5131:sipush          205
		// 3051 5134:iastore         
		// 3052 5135:dup             
		// 3053 5136:bipush          13
		// 3054 5138:sipush          188
		// 3055 5141:iastore         
		// 3056 5142:dup             
		// 3057 5143:bipush          14
		// 3058 5145:sipush          237
		// 3059 5148:iastore         
		// 3060 5149:dup             
		// 3061 5150:bipush          15
		// 3062 5152:bipush          87
		// 3063 5154:iastore         
		// 3064 5155:dup             
		// 3065 5156:bipush          16
		// 3066 5158:sipush          191
		// 3067 5161:iastore         
		// 3068 5162:dup             
		// 3069 5163:bipush          17
		// 3070 5165:bipush          106
		// 3071 5167:iastore         
		// 3072 5168:dup             
		// 3073 5169:bipush          18
		// 3074 5171:bipush          16
		// 3075 5173:iastore         
		// 3076 5174:dup             
		// 3077 5175:bipush          19
		// 3078 5177:sipush          147
		// 3079 5180:iastore         
		// 3080 5181:dup             
		// 3081 5182:bipush          20
		// 3082 5184:bipush          118
		// 3083 5186:iastore         
		// 3084 5187:dup             
		// 3085 5188:bipush          21
		// 3086 5190:bipush          23
		// 3087 5192:iastore         
		// 3088 5193:dup             
		// 3089 5194:bipush          22
		// 3090 5196:bipush          37
		// 3091 5198:iastore         
		// 3092 5199:dup             
		// 3093 5200:bipush          23
		// 3094 5202:bipush          90
		// 3095 5204:iastore         
		// 3096 5205:dup             
		// 3097 5206:bipush          24
		// 3098 5208:sipush          170
		// 3099 5211:iastore         
		// 3100 5212:dup             
		// 3101 5213:bipush          25
		// 3102 5215:sipush          205
		// 3103 5218:iastore         
		// 3104 5219:dup             
		// 3105 5220:bipush          26
		// 3106 5222:sipush          131
		// 3107 5225:iastore         
		// 3108 5226:dup             
		// 3109 5227:bipush          27
		// 3110 5229:bipush          88
		// 3111 5231:iastore         
		// 3112 5232:dup             
		// 3113 5233:bipush          28
		// 3114 5235:bipush          120
		// 3115 5237:iastore         
		// 3116 5238:dup             
		// 3117 5239:bipush          29
		// 3118 5241:bipush          100
		// 3119 5243:iastore         
		// 3120 5244:dup             
		// 3121 5245:bipush          30
		// 3122 5247:bipush          66
		// 3123 5249:iastore         
		// 3124 5250:dup             
		// 3125 5251:bipush          31
		// 3126 5253:sipush          138
		// 3127 5256:iastore         
		// 3128 5257:dup             
		// 3129 5258:bipush          32
		// 3130 5260:sipush          186
		// 3131 5263:iastore         
		// 3132 5264:dup             
		// 3133 5265:bipush          33
		// 3134 5267:sipush          240
		// 3135 5270:iastore         
		// 3136 5271:dup             
		// 3137 5272:bipush          34
		// 3138 5274:bipush          82
		// 3139 5276:iastore         
		// 3140 5277:dup             
		// 3141 5278:bipush          35
		// 3142 5280:bipush          44
		// 3143 5282:iastore         
		// 3144 5283:dup             
		// 3145 5284:bipush          36
		// 3146 5286:sipush          176
		// 3147 5289:iastore         
		// 3148 5290:dup             
		// 3149 5291:bipush          37
		// 3150 5293:bipush          87
		// 3151 5295:iastore         
		// 3152 5296:dup             
		// 3153 5297:bipush          38
		// 3154 5299:sipush          187
		// 3155 5302:iastore         
		// 3156 5303:dup             
		// 3157 5304:bipush          39
		// 3158 5306:sipush          147
		// 3159 5309:iastore         
		// 3160 5310:dup             
		// 3161 5311:bipush          40
		// 3162 5313:sipush          160
		// 3163 5316:iastore         
		// 3164 5317:dup             
		// 3165 5318:bipush          41
		// 3166 5320:sipush          175
		// 3167 5323:iastore         
		// 3168 5324:dup             
		// 3169 5325:bipush          42
		// 3170 5327:bipush          69
		// 3171 5329:iastore         
		// 3172 5330:dup             
		// 3173 5331:bipush          43
		// 3174 5333:sipush          213
		// 3175 5336:iastore         
		// 3176 5337:dup             
		// 3177 5338:bipush          44
		// 3178 5340:bipush          92
		// 3179 5342:iastore         
		// 3180 5343:dup             
		// 3181 5344:bipush          45
		// 3182 5346:sipush          253
		// 3183 5349:iastore         
		// 3184 5350:dup             
		// 3185 5351:bipush          46
		// 3186 5353:sipush          225
		// 3187 5356:iastore         
		// 3188 5357:dup             
		// 3189 5358:bipush          47
		// 3190 5360:bipush          19
		// 3191 5362:iastore         
		// 3192 5363:putstatic       #58  <Field int[] poly48>
		// 3193 5366:bipush          56
		// 3194 5368:newarray        int[]
		// 3195 5370:dup             
		// 3196 5371:iconst_0        
		// 3197 5372:sipush          175
		// 3198 5375:iastore         
		// 3199 5376:dup             
		// 3200 5377:iconst_1        
		// 3201 5378:bipush          9
		// 3202 5380:iastore         
		// 3203 5381:dup             
		// 3204 5382:iconst_2        
		// 3205 5383:sipush          223
		// 3206 5386:iastore         
		// 3207 5387:dup             
		// 3208 5388:iconst_3        
		// 3209 5389:sipush          238
		// 3210 5392:iastore         
		// 3211 5393:dup             
		// 3212 5394:iconst_4        
		// 3213 5395:bipush          12
		// 3214 5397:iastore         
		// 3215 5398:dup             
		// 3216 5399:iconst_5        
		// 3217 5400:bipush          17
		// 3218 5402:iastore         
		// 3219 5403:dup             
		// 3220 5404:bipush          6
		// 3221 5406:sipush          220
		// 3222 5409:iastore         
		// 3223 5410:dup             
		// 3224 5411:bipush          7
		// 3225 5413:sipush          208
		// 3226 5416:iastore         
		// 3227 5417:dup             
		// 3228 5418:bipush          8
		// 3229 5420:bipush          100
		// 3230 5422:iastore         
		// 3231 5423:dup             
		// 3232 5424:bipush          9
		// 3233 5426:bipush          29
		// 3234 5428:iastore         
		// 3235 5429:dup             
		// 3236 5430:bipush          10
		// 3237 5432:sipush          175
		// 3238 5435:iastore         
		// 3239 5436:dup             
		// 3240 5437:bipush          11
		// 3241 5439:sipush          170
		// 3242 5442:iastore         
		// 3243 5443:dup             
		// 3244 5444:bipush          12
		// 3245 5446:sipush          230
		// 3246 5449:iastore         
		// 3247 5450:dup             
		// 3248 5451:bipush          13
		// 3249 5453:sipush          192
		// 3250 5456:iastore         
		// 3251 5457:dup             
		// 3252 5458:bipush          14
		// 3253 5460:sipush          215
		// 3254 5463:iastore         
		// 3255 5464:dup             
		// 3256 5465:bipush          15
		// 3257 5467:sipush          235
		// 3258 5470:iastore         
		// 3259 5471:dup             
		// 3260 5472:bipush          16
		// 3261 5474:sipush          150
		// 3262 5477:iastore         
		// 3263 5478:dup             
		// 3264 5479:bipush          17
		// 3265 5481:sipush          159
		// 3266 5484:iastore         
		// 3267 5485:dup             
		// 3268 5486:bipush          18
		// 3269 5488:bipush          36
		// 3270 5490:iastore         
		// 3271 5491:dup             
		// 3272 5492:bipush          19
		// 3273 5494:sipush          223
		// 3274 5497:iastore         
		// 3275 5498:dup             
		// 3276 5499:bipush          20
		// 3277 5501:bipush          38
		// 3278 5503:iastore         
		// 3279 5504:dup             
		// 3280 5505:bipush          21
		// 3281 5507:sipush          200
		// 3282 5510:iastore         
		// 3283 5511:dup             
		// 3284 5512:bipush          22
		// 3285 5514:sipush          132
		// 3286 5517:iastore         
		// 3287 5518:dup             
		// 3288 5519:bipush          23
		// 3289 5521:bipush          54
		// 3290 5523:iastore         
		// 3291 5524:dup             
		// 3292 5525:bipush          24
		// 3293 5527:sipush          228
		// 3294 5530:iastore         
		// 3295 5531:dup             
		// 3296 5532:bipush          25
		// 3297 5534:sipush          146
		// 3298 5537:iastore         
		// 3299 5538:dup             
		// 3300 5539:bipush          26
		// 3301 5541:sipush          218
		// 3302 5544:iastore         
		// 3303 5545:dup             
		// 3304 5546:bipush          27
		// 3305 5548:sipush          234
		// 3306 5551:iastore         
		// 3307 5552:dup             
		// 3308 5553:bipush          28
		// 3309 5555:bipush          117
		// 3310 5557:iastore         
		// 3311 5558:dup             
		// 3312 5559:bipush          29
		// 3313 5561:sipush          203
		// 3314 5564:iastore         
		// 3315 5565:dup             
		// 3316 5566:bipush          30
		// 3317 5568:bipush          29
		// 3318 5570:iastore         
		// 3319 5571:dup             
		// 3320 5572:bipush          31
		// 3321 5574:sipush          232
		// 3322 5577:iastore         
		// 3323 5578:dup             
		// 3324 5579:bipush          32
		// 3325 5581:sipush          144
		// 3326 5584:iastore         
		// 3327 5585:dup             
		// 3328 5586:bipush          33
		// 3329 5588:sipush          238
		// 3330 5591:iastore         
		// 3331 5592:dup             
		// 3332 5593:bipush          34
		// 3333 5595:bipush          22
		// 3334 5597:iastore         
		// 3335 5598:dup             
		// 3336 5599:bipush          35
		// 3337 5601:sipush          150
		// 3338 5604:iastore         
		// 3339 5605:dup             
		// 3340 5606:bipush          36
		// 3341 5608:sipush          201
		// 3342 5611:iastore         
		// 3343 5612:dup             
		// 3344 5613:bipush          37
		// 3345 5615:bipush          117
		// 3346 5617:iastore         
		// 3347 5618:dup             
		// 3348 5619:bipush          38
		// 3349 5621:bipush          62
		// 3350 5623:iastore         
		// 3351 5624:dup             
		// 3352 5625:bipush          39
		// 3353 5627:sipush          207
		// 3354 5630:iastore         
		// 3355 5631:dup             
		// 3356 5632:bipush          40
		// 3357 5634:sipush          164
		// 3358 5637:iastore         
		// 3359 5638:dup             
		// 3360 5639:bipush          41
		// 3361 5641:bipush          13
		// 3362 5643:iastore         
		// 3363 5644:dup             
		// 3364 5645:bipush          42
		// 3365 5647:sipush          137
		// 3366 5650:iastore         
		// 3367 5651:dup             
		// 3368 5652:bipush          43
		// 3369 5654:sipush          245
		// 3370 5657:iastore         
		// 3371 5658:dup             
		// 3372 5659:bipush          44
		// 3373 5661:bipush          127
		// 3374 5663:iastore         
		// 3375 5664:dup             
		// 3376 5665:bipush          45
		// 3377 5667:bipush          67
		// 3378 5669:iastore         
		// 3379 5670:dup             
		// 3380 5671:bipush          46
		// 3381 5673:sipush          247
		// 3382 5676:iastore         
		// 3383 5677:dup             
		// 3384 5678:bipush          47
		// 3385 5680:bipush          28
		// 3386 5682:iastore         
		// 3387 5683:dup             
		// 3388 5684:bipush          48
		// 3389 5686:sipush          155
		// 3390 5689:iastore         
		// 3391 5690:dup             
		// 3392 5691:bipush          49
		// 3393 5693:bipush          43
		// 3394 5695:iastore         
		// 3395 5696:dup             
		// 3396 5697:bipush          50
		// 3397 5699:sipush          203
		// 3398 5702:iastore         
		// 3399 5703:dup             
		// 3400 5704:bipush          51
		// 3401 5706:bipush          107
		// 3402 5708:iastore         
		// 3403 5709:dup             
		// 3404 5710:bipush          52
		// 3405 5712:sipush          233
		// 3406 5715:iastore         
		// 3407 5716:dup             
		// 3408 5717:bipush          53
		// 3409 5719:bipush          53
		// 3410 5721:iastore         
		// 3411 5722:dup             
		// 3412 5723:bipush          54
		// 3413 5725:sipush          143
		// 3414 5728:iastore         
		// 3415 5729:dup             
		// 3416 5730:bipush          55
		// 3417 5732:bipush          46
		// 3418 5734:iastore         
		// 3419 5735:putstatic       #60  <Field int[] poly56>
		// 3420 5738:bipush          62
		// 3421 5740:newarray        int[]
		// 3422 5742:dup             
		// 3423 5743:iconst_0        
		// 3424 5744:sipush          242
		// 3425 5747:iastore         
		// 3426 5748:dup             
		// 3427 5749:iconst_1        
		// 3428 5750:bipush          93
		// 3429 5752:iastore         
		// 3430 5753:dup             
		// 3431 5754:iconst_2        
		// 3432 5755:sipush          169
		// 3433 5758:iastore         
		// 3434 5759:dup             
		// 3435 5760:iconst_3        
		// 3436 5761:bipush          50
		// 3437 5763:iastore         
		// 3438 5764:dup             
		// 3439 5765:iconst_4        
		// 3440 5766:sipush          144
		// 3441 5769:iastore         
		// 3442 5770:dup             
		// 3443 5771:iconst_5        
		// 3444 5772:sipush          210
		// 3445 5775:iastore         
		// 3446 5776:dup             
		// 3447 5777:bipush          6
		// 3448 5779:bipush          39
		// 3449 5781:iastore         
		// 3450 5782:dup             
		// 3451 5783:bipush          7
		// 3452 5785:bipush          118
		// 3453 5787:iastore         
		// 3454 5788:dup             
		// 3455 5789:bipush          8
		// 3456 5791:sipush          202
		// 3457 5794:iastore         
		// 3458 5795:dup             
		// 3459 5796:bipush          9
		// 3460 5798:sipush          188
		// 3461 5801:iastore         
		// 3462 5802:dup             
		// 3463 5803:bipush          10
		// 3464 5805:sipush          201
		// 3465 5808:iastore         
		// 3466 5809:dup             
		// 3467 5810:bipush          11
		// 3468 5812:sipush          189
		// 3469 5815:iastore         
		// 3470 5816:dup             
		// 3471 5817:bipush          12
		// 3472 5819:sipush          143
		// 3473 5822:iastore         
		// 3474 5823:dup             
		// 3475 5824:bipush          13
		// 3476 5826:bipush          108
		// 3477 5828:iastore         
		// 3478 5829:dup             
		// 3479 5830:bipush          14
		// 3480 5832:sipush          196
		// 3481 5835:iastore         
		// 3482 5836:dup             
		// 3483 5837:bipush          15
		// 3484 5839:bipush          37
		// 3485 5841:iastore         
		// 3486 5842:dup             
		// 3487 5843:bipush          16
		// 3488 5845:sipush          185
		// 3489 5848:iastore         
		// 3490 5849:dup             
		// 3491 5850:bipush          17
		// 3492 5852:bipush          112
		// 3493 5854:iastore         
		// 3494 5855:dup             
		// 3495 5856:bipush          18
		// 3496 5858:sipush          134
		// 3497 5861:iastore         
		// 3498 5862:dup             
		// 3499 5863:bipush          19
		// 3500 5865:sipush          230
		// 3501 5868:iastore         
		// 3502 5869:dup             
		// 3503 5870:bipush          20
		// 3504 5872:sipush          245
		// 3505 5875:iastore         
		// 3506 5876:dup             
		// 3507 5877:bipush          21
		// 3508 5879:bipush          63
		// 3509 5881:iastore         
		// 3510 5882:dup             
		// 3511 5883:bipush          22
		// 3512 5885:sipush          197
		// 3513 5888:iastore         
		// 3514 5889:dup             
		// 3515 5890:bipush          23
		// 3516 5892:sipush          190
		// 3517 5895:iastore         
		// 3518 5896:dup             
		// 3519 5897:bipush          24
		// 3520 5899:sipush          250
		// 3521 5902:iastore         
		// 3522 5903:dup             
		// 3523 5904:bipush          25
		// 3524 5906:bipush          106
		// 3525 5908:iastore         
		// 3526 5909:dup             
		// 3527 5910:bipush          26
		// 3528 5912:sipush          185
		// 3529 5915:iastore         
		// 3530 5916:dup             
		// 3531 5917:bipush          27
		// 3532 5919:sipush          221
		// 3533 5922:iastore         
		// 3534 5923:dup             
		// 3535 5924:bipush          28
		// 3536 5926:sipush          175
		// 3537 5929:iastore         
		// 3538 5930:dup             
		// 3539 5931:bipush          29
		// 3540 5933:bipush          64
		// 3541 5935:iastore         
		// 3542 5936:dup             
		// 3543 5937:bipush          30
		// 3544 5939:bipush          114
		// 3545 5941:iastore         
		// 3546 5942:dup             
		// 3547 5943:bipush          31
		// 3548 5945:bipush          71
		// 3549 5947:iastore         
		// 3550 5948:dup             
		// 3551 5949:bipush          32
		// 3552 5951:sipush          161
		// 3553 5954:iastore         
		// 3554 5955:dup             
		// 3555 5956:bipush          33
		// 3556 5958:bipush          44
		// 3557 5960:iastore         
		// 3558 5961:dup             
		// 3559 5962:bipush          34
		// 3560 5964:sipush          147
		// 3561 5967:iastore         
		// 3562 5968:dup             
		// 3563 5969:bipush          35
		// 3564 5971:bipush          6
		// 3565 5973:iastore         
		// 3566 5974:dup             
		// 3567 5975:bipush          36
		// 3568 5977:bipush          27
		// 3569 5979:iastore         
		// 3570 5980:dup             
		// 3571 5981:bipush          37
		// 3572 5983:sipush          218
		// 3573 5986:iastore         
		// 3574 5987:dup             
		// 3575 5988:bipush          38
		// 3576 5990:bipush          51
		// 3577 5992:iastore         
		// 3578 5993:dup             
		// 3579 5994:bipush          39
		// 3580 5996:bipush          63
		// 3581 5998:iastore         
		// 3582 5999:dup             
		// 3583 6000:bipush          40
		// 3584 6002:bipush          87
		// 3585 6004:iastore         
		// 3586 6005:dup             
		// 3587 6006:bipush          41
		// 3588 6008:bipush          10
		// 3589 6010:iastore         
		// 3590 6011:dup             
		// 3591 6012:bipush          42
		// 3592 6014:bipush          40
		// 3593 6016:iastore         
		// 3594 6017:dup             
		// 3595 6018:bipush          43
		// 3596 6020:sipush          130
		// 3597 6023:iastore         
		// 3598 6024:dup             
		// 3599 6025:bipush          44
		// 3600 6027:sipush          188
		// 3601 6030:iastore         
		// 3602 6031:dup             
		// 3603 6032:bipush          45
		// 3604 6034:bipush          17
		// 3605 6036:iastore         
		// 3606 6037:dup             
		// 3607 6038:bipush          46
		// 3608 6040:sipush          163
		// 3609 6043:iastore         
		// 3610 6044:dup             
		// 3611 6045:bipush          47
		// 3612 6047:bipush          31
		// 3613 6049:iastore         
		// 3614 6050:dup             
		// 3615 6051:bipush          48
		// 3616 6053:sipush          176
		// 3617 6056:iastore         
		// 3618 6057:dup             
		// 3619 6058:bipush          49
		// 3620 6060:sipush          170
		// 3621 6063:iastore         
		// 3622 6064:dup             
		// 3623 6065:bipush          50
		// 3624 6067:iconst_4        
		// 3625 6068:iastore         
		// 3626 6069:dup             
		// 3627 6070:bipush          51
		// 3628 6072:bipush          107
		// 3629 6074:iastore         
		// 3630 6075:dup             
		// 3631 6076:bipush          52
		// 3632 6078:sipush          232
		// 3633 6081:iastore         
		// 3634 6082:dup             
		// 3635 6083:bipush          53
		// 3636 6085:bipush          7
		// 3637 6087:iastore         
		// 3638 6088:dup             
		// 3639 6089:bipush          54
		// 3640 6091:bipush          94
		// 3641 6093:iastore         
		// 3642 6094:dup             
		// 3643 6095:bipush          55
		// 3644 6097:sipush          166
		// 3645 6100:iastore         
		// 3646 6101:dup             
		// 3647 6102:bipush          56
		// 3648 6104:sipush          224
		// 3649 6107:iastore         
		// 3650 6108:dup             
		// 3651 6109:bipush          57
		// 3652 6111:bipush          124
		// 3653 6113:iastore         
		// 3654 6114:dup             
		// 3655 6115:bipush          58
		// 3656 6117:bipush          86
		// 3657 6119:iastore         
		// 3658 6120:dup             
		// 3659 6121:bipush          59
		// 3660 6123:bipush          47
		// 3661 6125:iastore         
		// 3662 6126:dup             
		// 3663 6127:bipush          60
		// 3664 6129:bipush          11
		// 3665 6131:iastore         
		// 3666 6132:dup             
		// 3667 6133:bipush          61
		// 3668 6135:sipush          204
		// 3669 6138:iastore         
		// 3670 6139:putstatic       #62  <Field int[] poly62>
		// 3671 6142:bipush          68
		// 3672 6144:newarray        int[]
		// 3673 6146:dup             
		// 3674 6147:iconst_0        
		// 3675 6148:sipush          220
		// 3676 6151:iastore         
		// 3677 6152:dup             
		// 3678 6153:iconst_1        
		// 3679 6154:sipush          228
		// 3680 6157:iastore         
		// 3681 6158:dup             
		// 3682 6159:iconst_2        
		// 3683 6160:sipush          173
		// 3684 6163:iastore         
		// 3685 6164:dup             
		// 3686 6165:iconst_3        
		// 3687 6166:bipush          89
		// 3688 6168:iastore         
		// 3689 6169:dup             
		// 3690 6170:iconst_4        
		// 3691 6171:sipush          251
		// 3692 6174:iastore         
		// 3693 6175:dup             
		// 3694 6176:iconst_5        
		// 3695 6177:sipush          149
		// 3696 6180:iastore         
		// 3697 6181:dup             
		// 3698 6182:bipush          6
		// 3699 6184:sipush          159
		// 3700 6187:iastore         
		// 3701 6188:dup             
		// 3702 6189:bipush          7
		// 3703 6191:bipush          56
		// 3704 6193:iastore         
		// 3705 6194:dup             
		// 3706 6195:bipush          8
		// 3707 6197:bipush          89
		// 3708 6199:iastore         
		// 3709 6200:dup             
		// 3710 6201:bipush          9
		// 3711 6203:bipush          33
		// 3712 6205:iastore         
		// 3713 6206:dup             
		// 3714 6207:bipush          10
		// 3715 6209:sipush          147
		// 3716 6212:iastore         
		// 3717 6213:dup             
		// 3718 6214:bipush          11
		// 3719 6216:sipush          244
		// 3720 6219:iastore         
		// 3721 6220:dup             
		// 3722 6221:bipush          12
		// 3723 6223:sipush          154
		// 3724 6226:iastore         
		// 3725 6227:dup             
		// 3726 6228:bipush          13
		// 3727 6230:bipush          36
		// 3728 6232:iastore         
		// 3729 6233:dup             
		// 3730 6234:bipush          14
		// 3731 6236:bipush          73
		// 3732 6238:iastore         
		// 3733 6239:dup             
		// 3734 6240:bipush          15
		// 3735 6242:bipush          127
		// 3736 6244:iastore         
		// 3737 6245:dup             
		// 3738 6246:bipush          16
		// 3739 6248:sipush          213
		// 3740 6251:iastore         
		// 3741 6252:dup             
		// 3742 6253:bipush          17
		// 3743 6255:sipush          136
		// 3744 6258:iastore         
		// 3745 6259:dup             
		// 3746 6260:bipush          18
		// 3747 6262:sipush          248
		// 3748 6265:iastore         
		// 3749 6266:dup             
		// 3750 6267:bipush          19
		// 3751 6269:sipush          180
		// 3752 6272:iastore         
		// 3753 6273:dup             
		// 3754 6274:bipush          20
		// 3755 6276:sipush          234
		// 3756 6279:iastore         
		// 3757 6280:dup             
		// 3758 6281:bipush          21
		// 3759 6283:sipush          197
		// 3760 6286:iastore         
		// 3761 6287:dup             
		// 3762 6288:bipush          22
		// 3763 6290:sipush          158
		// 3764 6293:iastore         
		// 3765 6294:dup             
		// 3766 6295:bipush          23
		// 3767 6297:sipush          177
		// 3768 6300:iastore         
		// 3769 6301:dup             
		// 3770 6302:bipush          24
		// 3771 6304:bipush          68
		// 3772 6306:iastore         
		// 3773 6307:dup             
		// 3774 6308:bipush          25
		// 3775 6310:bipush          122
		// 3776 6312:iastore         
		// 3777 6313:dup             
		// 3778 6314:bipush          26
		// 3779 6316:bipush          93
		// 3780 6318:iastore         
		// 3781 6319:dup             
		// 3782 6320:bipush          27
		// 3783 6322:sipush          213
		// 3784 6325:iastore         
		// 3785 6326:dup             
		// 3786 6327:bipush          28
		// 3787 6329:bipush          15
		// 3788 6331:iastore         
		// 3789 6332:dup             
		// 3790 6333:bipush          29
		// 3791 6335:sipush          160
		// 3792 6338:iastore         
		// 3793 6339:dup             
		// 3794 6340:bipush          30
		// 3795 6342:sipush          227
		// 3796 6345:iastore         
		// 3797 6346:dup             
		// 3798 6347:bipush          31
		// 3799 6349:sipush          236
		// 3800 6352:iastore         
		// 3801 6353:dup             
		// 3802 6354:bipush          32
		// 3803 6356:bipush          66
		// 3804 6358:iastore         
		// 3805 6359:dup             
		// 3806 6360:bipush          33
		// 3807 6362:sipush          139
		// 3808 6365:iastore         
		// 3809 6366:dup             
		// 3810 6367:bipush          34
		// 3811 6369:sipush          153
		// 3812 6372:iastore         
		// 3813 6373:dup             
		// 3814 6374:bipush          35
		// 3815 6376:sipush          185
		// 3816 6379:iastore         
		// 3817 6380:dup             
		// 3818 6381:bipush          36
		// 3819 6383:sipush          202
		// 3820 6386:iastore         
		// 3821 6387:dup             
		// 3822 6388:bipush          37
		// 3823 6390:sipush          167
		// 3824 6393:iastore         
		// 3825 6394:dup             
		// 3826 6395:bipush          38
		// 3827 6397:sipush          179
		// 3828 6400:iastore         
		// 3829 6401:dup             
		// 3830 6402:bipush          39
		// 3831 6404:bipush          25
		// 3832 6406:iastore         
		// 3833 6407:dup             
		// 3834 6408:bipush          40
		// 3835 6410:sipush          220
		// 3836 6413:iastore         
		// 3837 6414:dup             
		// 3838 6415:bipush          41
		// 3839 6417:sipush          232
		// 3840 6420:iastore         
		// 3841 6421:dup             
		// 3842 6422:bipush          42
		// 3843 6424:bipush          96
		// 3844 6426:iastore         
		// 3845 6427:dup             
		// 3846 6428:bipush          43
		// 3847 6430:sipush          210
		// 3848 6433:iastore         
		// 3849 6434:dup             
		// 3850 6435:bipush          44
		// 3851 6437:sipush          231
		// 3852 6440:iastore         
		// 3853 6441:dup             
		// 3854 6442:bipush          45
		// 3855 6444:sipush          136
		// 3856 6447:iastore         
		// 3857 6448:dup             
		// 3858 6449:bipush          46
		// 3859 6451:sipush          223
		// 3860 6454:iastore         
		// 3861 6455:dup             
		// 3862 6456:bipush          47
		// 3863 6458:sipush          239
		// 3864 6461:iastore         
		// 3865 6462:dup             
		// 3866 6463:bipush          48
		// 3867 6465:sipush          181
		// 3868 6468:iastore         
		// 3869 6469:dup             
		// 3870 6470:bipush          49
		// 3871 6472:sipush          241
		// 3872 6475:iastore         
		// 3873 6476:dup             
		// 3874 6477:bipush          50
		// 3875 6479:bipush          59
		// 3876 6481:iastore         
		// 3877 6482:dup             
		// 3878 6483:bipush          51
		// 3879 6485:bipush          52
		// 3880 6487:iastore         
		// 3881 6488:dup             
		// 3882 6489:bipush          52
		// 3883 6491:sipush          172
		// 3884 6494:iastore         
		// 3885 6495:dup             
		// 3886 6496:bipush          53
		// 3887 6498:bipush          25
		// 3888 6500:iastore         
		// 3889 6501:dup             
		// 3890 6502:bipush          54
		// 3891 6504:bipush          49
		// 3892 6506:iastore         
		// 3893 6507:dup             
		// 3894 6508:bipush          55
		// 3895 6510:sipush          232
		// 3896 6513:iastore         
		// 3897 6514:dup             
		// 3898 6515:bipush          56
		// 3899 6517:sipush          211
		// 3900 6520:iastore         
		// 3901 6521:dup             
		// 3902 6522:bipush          57
		// 3903 6524:sipush          189
		// 3904 6527:iastore         
		// 3905 6528:dup             
		// 3906 6529:bipush          58
		// 3907 6531:bipush          64
		// 3908 6533:iastore         
		// 3909 6534:dup             
		// 3910 6535:bipush          59
		// 3911 6537:bipush          54
		// 3912 6539:iastore         
		// 3913 6540:dup             
		// 3914 6541:bipush          60
		// 3915 6543:bipush          108
		// 3916 6545:iastore         
		// 3917 6546:dup             
		// 3918 6547:bipush          61
		// 3919 6549:sipush          153
		// 3920 6552:iastore         
		// 3921 6553:dup             
		// 3922 6554:bipush          62
		// 3923 6556:sipush          132
		// 3924 6559:iastore         
		// 3925 6560:dup             
		// 3926 6561:bipush          63
		// 3927 6563:bipush          63
		// 3928 6565:iastore         
		// 3929 6566:dup             
		// 3930 6567:bipush          64
		// 3931 6569:bipush          96
		// 3932 6571:iastore         
		// 3933 6572:dup             
		// 3934 6573:bipush          65
		// 3935 6575:bipush          103
		// 3936 6577:iastore         
		// 3937 6578:dup             
		// 3938 6579:bipush          66
		// 3939 6581:bipush          82
		// 3940 6583:iastore         
		// 3941 6584:dup             
		// 3942 6585:bipush          67
		// 3943 6587:sipush          186
		// 3944 6590:iastore         
		// 3945 6591:putstatic       #64  <Field int[] poly68>
		//*3946 6594:return          
		}

		ReedSolomon()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #68  <Method void Object()>
		//    2    4:return          
		}
	}


	public BarcodeDatamatrix()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #66  <Method void Object()>
		forceSquareSize = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #68  <Field boolean forceSquareSize>
	//    5    9:return          
	}

	private static int C40OrTextEncodation(byte abyte0[], int i, int j, byte abyte1[], int k, int l, boolean flag)
	{
		if(j == 0)
	//*   0    0:iload_2         
	//*   1    1:ifne            8
		{
			i = 0;
	//    2    4:iconst_0        
	//    3    5:istore_1        
		} else
	//*   4    6:iload_1         
	//*   5    7:ireturn         
		{
			int i1;
			int j1;
			int k1;
			int i2;
			int k2;
			String s;
			String s1;
			int ai[];
			if(flag)
	//*   6    8:iload           6
	//*   7   10:ifeq            189
			{
				abyte1[k + 0] = -26;
	//    8   13:aload_3         
	//    9   14:iload           4
	//   10   16:iconst_0        
	//   11   17:iadd            
	//   12   18:bipush          -26
	//   13   20:bastore         
				k1 = 0 + 1;
	//   14   21:iconst_0        
	//   15   22:iconst_1        
	//   16   23:iadd            
	//   17   24:istore          9
			} else
	//*  18   26:iload           6
	//*  19   28:ifeq            205
	//*  20   31:ldc1            #72  <String " 0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ">
	//*  21   33:astore          15
	//*  22   35:ldc1            #74  <String "`abcdefghijklmnopqrstuvwxyz{|}~\177">
	//*  23   37:astore          16
	//*  24   39:iload_2         
	//*  25   40:iconst_4        
	//*  26   41:imul            
	//*  27   42:bipush          10
	//*  28   44:iadd            
	//*  29   45:newarray        int[]
	//*  30   47:astore          17
	//*  31   49:iconst_0        
	//*  32   50:istore          11
	//*  33   52:iconst_0        
	//*  34   53:istore          10
	//*  35   55:iconst_0        
	//*  36   56:istore          7
	//*  37   58:iconst_0        
	//*  38   59:istore          8
	//*  39   61:iload           8
	//*  40   63:iload_2         
	//*  41   64:icmpge          341
	//*  42   67:iload           10
	//*  43   69:istore          12
	//*  44   71:iload           7
	//*  45   73:iconst_3        
	//*  46   74:irem            
	//*  47   75:ifne            86
	//*  48   78:iload           8
	//*  49   80:istore          11
	//*  50   82:iload           7
	//*  51   84:istore          12
	//*  52   86:aload_0         
	//*  53   87:iload_1         
	//*  54   88:iload           8
	//*  55   90:iadd            
	//*  56   91:baload          
	//*  57   92:sipush          255
	//*  58   95:iand            
	//*  59   96:istore          14
	//*  60   98:iload           14
	//*  61  100:istore          13
	//*  62  102:iload           7
	//*  63  104:istore          10
	//*  64  106:iload           14
	//*  65  108:bipush          127
	//*  66  110:icmple          146
	//*  67  113:iload           14
	//*  68  115:sipush          128
	//*  69  118:isub            
	//*  70  119:istore          13
	//*  71  121:iload           7
	//*  72  123:iconst_1        
	//*  73  124:iadd            
	//*  74  125:istore          14
	//*  75  127:aload           17
	//*  76  129:iload           7
	//*  77  131:iconst_1        
	//*  78  132:iastore         
	//*  79  133:iload           14
	//*  80  135:iconst_1        
	//*  81  136:iadd            
	//*  82  137:istore          10
	//*  83  139:aload           17
	//*  84  141:iload           14
	//*  85  143:bipush          30
	//*  86  145:iastore         
	//*  87  146:aload           15
	//*  88  148:iload           13
	//*  89  150:int2char        
	//*  90  151:invokevirtual   #80  <Method int String.indexOf(int)>
	//*  91  154:istore          7
	//*  92  156:iload           7
	//*  93  158:iflt            216
	//*  94  161:aload           17
	//*  95  163:iload           10
	//*  96  165:iload           7
	//*  97  167:iconst_3        
	//*  98  168:iadd            
	//*  99  169:iastore         
	//* 100  170:iload           10
	//* 101  172:iconst_1        
	//* 102  173:iadd            
	//* 103  174:istore          7
	//* 104  176:iload           8
	//* 105  178:iconst_1        
	//* 106  179:iadd            
	//* 107  180:istore          8
	//* 108  182:iload           12
	//* 109  184:istore          10
	//* 110  186:goto            61
			{
				abyte1[k + 0] = -17;
	//  111  189:aload_3         
	//  112  190:iload           4
	//  113  192:iconst_0        
	//  114  193:iadd            
	//  115  194:bipush          -17
	//  116  196:bastore         
				k1 = 0 + 1;
	//  117  197:iconst_0        
	//  118  198:iconst_1        
	//  119  199:iadd            
	//  120  200:istore          9
			}
			if(flag)
			{
				s = " 0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
				s1 = "`abcdefghijklmnopqrstuvwxyz{|}~\177";
			} else
	//* 121  202:goto            26
			{
				s = " 0123456789abcdefghijklmnopqrstuvwxyz";
	//  122  205:ldc1            #82  <String " 0123456789abcdefghijklmnopqrstuvwxyz">
	//  123  207:astore          15
				s1 = "`ABCDEFGHIJKLMNOPQRSTUVWXYZ{|}~\177";
	//  124  209:ldc1            #84  <String "`ABCDEFGHIJKLMNOPQRSTUVWXYZ{|}~\177">
	//  125  211:astore          16
			}
			ai = new int[j * 4 + 10];
			k2 = 0;
			i2 = 0;
			i1 = 0;
			j1 = 0;
			while(j1 < j) 
			{
				int i3 = i2;
				if(i1 % 3 == 0)
				{
					k2 = j1;
					i3 = i1;
				}
				int k3 = abyte0[i + j1] & 0xff;
				int j3 = k3;
				i2 = i1;
				if(k3 > 127)
				{
					j3 = k3 - 128;
					k3 = i1 + 1;
					ai[i1] = 1;
					i2 = k3 + 1;
					ai[k3] = 30;
				}
				i1 = s.indexOf(((int) ((char)j3)));
				if(i1 >= 0)
				{
					ai[i2] = i1 + 3;
					i1 = i2 + 1;
				} else
	//* 126  213:goto            39
				if(j3 < 32)
	//* 127  216:iload           13
	//* 128  218:bipush          32
	//* 129  220:icmpge          251
				{
					int l3 = i2 + 1;
	//  130  223:iload           10
	//  131  225:iconst_1        
	//  132  226:iadd            
	//  133  227:istore          14
					ai[i2] = 0;
	//  134  229:aload           17
	//  135  231:iload           10
	//  136  233:iconst_0        
	//  137  234:iastore         
					i1 = l3 + 1;
	//  138  235:iload           14
	//  139  237:iconst_1        
	//  140  238:iadd            
	//  141  239:istore          7
					ai[l3] = j3;
	//  142  241:aload           17
	//  143  243:iload           14
	//  144  245:iload           13
	//  145  247:iastore         
				} else
	//* 146  248:goto            176
				{
					int i4 = "!\"#$%&'()*+,-./:;<=>?@[\\]^_".indexOf(((int) ((char)j3)));
	//  147  251:ldc1            #86  <String "!\"#$%&'()*+,-./:;<=>?@[\\]^_">
	//  148  253:iload           13
	//  149  255:int2char        
	//  150  256:invokevirtual   #80  <Method int String.indexOf(int)>
	//  151  259:istore          14
					if(i4 >= 0)
	//* 152  261:iload           14
	//* 153  263:iflt            294
					{
						j3 = i2 + 1;
	//  154  266:iload           10
	//  155  268:iconst_1        
	//  156  269:iadd            
	//  157  270:istore          13
						ai[i2] = 1;
	//  158  272:aload           17
	//  159  274:iload           10
	//  160  276:iconst_1        
	//  161  277:iastore         
						i1 = j3 + 1;
	//  162  278:iload           13
	//  163  280:iconst_1        
	//  164  281:iadd            
	//  165  282:istore          7
						ai[j3] = i4;
	//  166  284:aload           17
	//  167  286:iload           13
	//  168  288:iload           14
	//  169  290:iastore         
					} else
	//* 170  291:goto            176
					{
						j3 = s1.indexOf(((int) ((char)j3)));
	//  171  294:aload           16
	//  172  296:iload           13
	//  173  298:int2char        
	//  174  299:invokevirtual   #80  <Method int String.indexOf(int)>
	//  175  302:istore          13
						i1 = i2;
	//  176  304:iload           10
	//  177  306:istore          7
						if(j3 >= 0)
	//* 178  308:iload           13
	//* 179  310:iflt            176
						{
							int j4 = i2 + 1;
	//  180  313:iload           10
	//  181  315:iconst_1        
	//  182  316:iadd            
	//  183  317:istore          14
							ai[i2] = 2;
	//  184  319:aload           17
	//  185  321:iload           10
	//  186  323:iconst_2        
	//  187  324:iastore         
							i1 = j4 + 1;
	//  188  325:iload           14
	//  189  327:iconst_1        
	//  190  328:iadd            
	//  191  329:istore          7
							ai[j4] = j3;
	//  192  331:aload           17
	//  193  333:iload           14
	//  194  335:iload           13
	//  195  337:iastore         
						}
					}
				}
				j1++;
				i2 = i3;
			}
	//* 196  338:goto            176
			if(i1 % 3 != 0)
	//* 197  341:iload           7
	//* 198  343:iconst_3        
	//* 199  344:irem            
	//* 200  345:ifeq            505
			{
				i = k2;
	//  201  348:iload           11
	//  202  350:istore_1        
				i1 = i2;
	//  203  351:iload           10
	//  204  353:istore          7
			} else
	//* 205  355:iload           7
	//* 206  357:iconst_3        
	//* 207  358:idiv            
	//* 208  359:iconst_2        
	//* 209  360:imul            
	//* 210  361:iload           5
	//* 211  363:iconst_2        
	//* 212  364:isub            
	//* 213  365:icmple          370
	//* 214  368:iconst_m1       
	//* 215  369:ireturn         
	//* 216  370:iconst_0        
	//* 217  371:istore          10
	//* 218  373:iload           9
	//* 219  375:istore          8
	//* 220  377:iload           10
	//* 221  379:istore          9
	//* 222  381:iload           9
	//* 223  383:iload           7
	//* 224  385:icmpge          465
	//* 225  388:aload           17
	//* 226  390:iload           9
	//* 227  392:iaload          
	//* 228  393:sipush          1600
	//* 229  396:imul            
	//* 230  397:aload           17
	//* 231  399:iload           9
	//* 232  401:iconst_1        
	//* 233  402:iadd            
	//* 234  403:iaload          
	//* 235  404:bipush          40
	//* 236  406:imul            
	//* 237  407:iadd            
	//* 238  408:aload           17
	//* 239  410:iload           9
	//* 240  412:iconst_2        
	//* 241  413:iadd            
	//* 242  414:iaload          
	//* 243  415:iadd            
	//* 244  416:iconst_1        
	//* 245  417:iadd            
	//* 246  418:istore          10
	//* 247  420:iload           8
	//* 248  422:iconst_1        
	//* 249  423:iadd            
	//* 250  424:istore          11
	//* 251  426:aload_3         
	//* 252  427:iload           4
	//* 253  429:iload           8
	//* 254  431:iadd            
	//* 255  432:iload           10
	//* 256  434:sipush          256
	//* 257  437:idiv            
	//* 258  438:int2byte        
	//* 259  439:bastore         
	//* 260  440:iload           11
	//* 261  442:iconst_1        
	//* 262  443:iadd            
	//* 263  444:istore          8
	//* 264  446:aload_3         
	//* 265  447:iload           4
	//* 266  449:iload           11
	//* 267  451:iadd            
	//* 268  452:iload           10
	//* 269  454:int2byte        
	//* 270  455:bastore         
	//* 271  456:iload           9
	//* 272  458:iconst_3        
	//* 273  459:iadd            
	//* 274  460:istore          9
	//* 275  462:goto            381
	//* 276  465:iload           8
	//* 277  467:iconst_1        
	//* 278  468:iadd            
	//* 279  469:istore          4
	//* 280  471:aload_3         
	//* 281  472:iload           8
	//* 282  474:bipush          -2
	//* 283  476:bastore         
	//* 284  477:aload_0         
	//* 285  478:iload_1         
	//* 286  479:iload_2         
	//* 287  480:iload_1         
	//* 288  481:isub            
	//* 289  482:aload_3         
	//* 290  483:iload           4
	//* 291  485:iload           5
	//* 292  487:iload           4
	//* 293  489:isub            
	//* 294  490:invokestatic    #90  <Method int asciiEncodation(byte[], int, int, byte[], int, int)>
	//* 295  493:istore_2        
	//* 296  494:iload_2         
	//* 297  495:istore_1        
	//* 298  496:iload_2         
	//* 299  497:iflt            6
	//* 300  500:iload_2         
	//* 301  501:iload           4
	//* 302  503:iadd            
	//* 303  504:ireturn         
			{
				i = j1;
	//  304  505:iload           8
	//  305  507:istore_1        
			}
			if((i1 / 3) * 2 > l - 2)
				return -1;
			i2 = 0;
			j1 = k1;
			for(int l1 = i2; l1 < i1; l1 += 3)
			{
				int j2 = ai[l1] * 1600 + ai[l1 + 1] * 40 + ai[l1 + 2] + 1;
				int l2 = j1 + 1;
				abyte1[k + j1] = (byte)(j2 / 256);
				j1 = l2 + 1;
				abyte1[k + l2] = (byte)j2;
			}

			k = j1 + 1;
			abyte1[j1] = -2;
			j = asciiEncodation(abyte0, i, j - i, abyte1, k, l - k);
			i = j;
			if(j >= 0)
				return j + k;
		}
		return i;
	//* 306  508:goto            355
	}

	private static int EdifactEncodation(byte abyte0[], int i, int j, byte abyte1[], int k, int l)
	{
		int j1;
		int i2;
		int k2;
		int i3;
		int l3;
		if(j == 0)
	//*   0    0:iload_2         
	//*   1    1:ifne            6
			return 0;
	//    2    4:iconst_0        
	//    3    5:ireturn         
		l3 = 0;
	//    4    6:iconst_0        
	//    5    7:istore          17
		i3 = 0;
	//    6    9:iconst_0        
	//    7   10:istore          12
		k2 = 18;
	//    8   12:bipush          18
	//    9   14:istore          10
		i2 = 1;
	//   10   16:iconst_1        
	//   11   17:istore          8
		j1 = 0;
	//   12   19:iconst_0        
	//   13   20:istore          7
_L17:
		int i1;
		int j2;
		boolean flag1;
		int i4;
		flag1 = ((boolean) (i2));
	//   14   22:iload           8
	//   15   24:istore          16
		j2 = i3;
	//   16   26:iload           12
	//   17   28:istore          9
		i4 = k2;
	//   18   30:iload           10
	//   19   32:istore          18
		i1 = j1;
	//   20   34:iload           7
	//   21   36:istore          6
		if(l3 >= j) goto _L2; else goto _L1
	//   22   38:iload           17
	//   23   40:iload_2         
	//   24   41:icmpge          123
_L1:
		int j4 = abyte0[l3 + i] & 0xff;
	//   25   44:aload_0         
	//   26   45:iload           17
	//   27   47:iload_1         
	//   28   48:iadd            
	//   29   49:baload          
	//   30   50:sipush          255
	//   31   53:iand            
	//   32   54:istore          19
		if((j4 & 0xe0) != 64 && (j4 & 0xe0) != 32 || j4 == 95) goto _L4; else goto _L3
	//   33   56:iload           19
	//   34   58:sipush          224
	//   35   61:iand            
	//   36   62:bipush          64
	//   37   64:icmpeq          78
	//   38   67:iload           19
	//   39   69:sipush          224
	//   40   72:iand            
	//   41   73:bipush          32
	//   42   75:icmpne          288
	//   43   78:iload           19
	//   44   80:bipush          95
	//   45   82:icmpeq          288
_L3:
		int l2;
		int j3;
		l2 = i2;
	//   46   85:iload           8
	//   47   87:istore          11
		j3 = j1;
	//   48   89:iload           7
	//   49   91:istore          13
		if(i2 == 0) goto _L6; else goto _L5
	//   50   93:iload           8
	//   51   95:ifeq            149
_L5:
		if(j1 + 1 <= l) goto _L8; else goto _L7
	//   52   98:iload           7
	//   53  100:iconst_1        
	//   54  101:iadd            
	//   55  102:iload           5
	//   56  104:icmple          131
_L7:
		i1 = j1;
	//   57  107:iload           7
	//   58  109:istore          6
		i4 = k2;
	//   59  111:iload           10
	//   60  113:istore          18
		j2 = i3;
	//   61  115:iload           12
	//   62  117:istore          9
		flag1 = ((boolean) (i2));
	//   63  119:iload           8
	//   64  121:istore          16
_L2:
		if(l3 != j)
	//*  65  123:iload           17
	//*  66  125:iload_2         
	//*  67  126:icmpeq          557
			return -1;
	//   68  129:iconst_m1       
	//   69  130:ireturn         
		break MISSING_BLOCK_LABEL_557;
_L8:
		abyte1[k + j1] = -16;
	//   70  131:aload_3         
	//   71  132:iload           4
	//   72  134:iload           7
	//   73  136:iadd            
	//   74  137:bipush          -16
	//   75  139:bastore         
		l2 = 0;
	//   76  140:iconst_0        
	//   77  141:istore          11
		j3 = j1 + 1;
	//   78  143:iload           7
	//   79  145:iconst_1        
	//   80  146:iadd            
	//   81  147:istore          13
_L6:
		i3 |= (j4 & 0x3f) << k2;
	//   82  149:iload           12
	//   83  151:iload           19
	//   84  153:bipush          63
	//   85  155:iand            
	//   86  156:iload           10
	//   87  158:ishl            
	//   88  159:ior             
	//   89  160:istore          12
		if(k2 != 0) goto _L10; else goto _L9
	//   90  162:iload           10
	//   91  164:ifne            270
_L9:
		flag1 = ((boolean) (l2));
	//   92  167:iload           11
	//   93  169:istore          16
		j2 = i3;
	//   94  171:iload           12
	//   95  173:istore          9
		i4 = k2;
	//   96  175:iload           10
	//   97  177:istore          18
		i1 = j3;
	//   98  179:iload           13
	//   99  181:istore          6
		if(j3 + 3 > l) goto _L2; else goto _L11
	//  100  183:iload           13
	//  101  185:iconst_3        
	//  102  186:iadd            
	//  103  187:iload           5
	//  104  189:icmpgt          123
_L11:
		i1 = j3 + 1;
	//  105  192:iload           13
	//  106  194:iconst_1        
	//  107  195:iadd            
	//  108  196:istore          6
		abyte1[k + j3] = (byte)(i3 >> 16);
	//  109  198:aload_3         
	//  110  199:iload           4
	//  111  201:iload           13
	//  112  203:iadd            
	//  113  204:iload           12
	//  114  206:bipush          16
	//  115  208:ishr            
	//  116  209:int2byte        
	//  117  210:bastore         
		j1 = i1 + 1;
	//  118  211:iload           6
	//  119  213:iconst_1        
	//  120  214:iadd            
	//  121  215:istore          7
		abyte1[k + i1] = (byte)(i3 >> 8);
	//  122  217:aload_3         
	//  123  218:iload           4
	//  124  220:iload           6
	//  125  222:iadd            
	//  126  223:iload           12
	//  127  225:bipush          8
	//  128  227:ishr            
	//  129  228:int2byte        
	//  130  229:bastore         
		i1 = j1 + 1;
	//  131  230:iload           7
	//  132  232:iconst_1        
	//  133  233:iadd            
	//  134  234:istore          6
		abyte1[k + j1] = (byte)i3;
	//  135  236:aload_3         
	//  136  237:iload           4
	//  137  239:iload           7
	//  138  241:iadd            
	//  139  242:iload           12
	//  140  244:int2byte        
	//  141  245:bastore         
		i3 = 0;
	//  142  246:iconst_0        
	//  143  247:istore          12
		k2 = 18;
	//  144  249:bipush          18
	//  145  251:istore          10
		i2 = l2;
	//  146  253:iload           11
	//  147  255:istore          8
_L12:
		l3++;
	//  148  257:iload           17
	//  149  259:iconst_1        
	//  150  260:iadd            
	//  151  261:istore          17
		j1 = i1;
	//  152  263:iload           6
	//  153  265:istore          7
		continue; /* Loop/switch isn't completed */
	//  154  267:goto            22
_L10:
		k2 -= 6;
	//  155  270:iload           10
	//  156  272:bipush          6
	//  157  274:isub            
	//  158  275:istore          10
		i1 = j3;
	//  159  277:iload           13
	//  160  279:istore          6
		i2 = l2;
	//  161  281:iload           11
	//  162  283:istore          8
		  goto _L12
	//* 163  285:goto            257
_L4:
		int k3;
		boolean flag;
		flag = ((boolean) (i2));
	//  164  288:iload           8
	//  165  290:istore          15
		j3 = i3;
	//  166  292:iload           12
	//  167  294:istore          13
		l2 = k2;
	//  168  296:iload           10
	//  169  298:istore          11
		k3 = j1;
	//  170  300:iload           7
	//  171  302:istore          14
		if(i2 != 0)
			break MISSING_BLOCK_LABEL_440;
	//  172  304:iload           8
	//  173  306:ifne            440
		l2 = i3 | 31 << k2;
	//  174  309:iload           12
	//  175  311:bipush          31
	//  176  313:iload           10
	//  177  315:ishl            
	//  178  316:ior             
	//  179  317:istore          11
		flag1 = ((boolean) (i2));
	//  180  319:iload           8
	//  181  321:istore          16
		j2 = l2;
	//  182  323:iload           11
	//  183  325:istore          9
		i4 = k2;
	//  184  327:iload           10
	//  185  329:istore          18
		i1 = j1;
	//  186  331:iload           7
	//  187  333:istore          6
		if((j1 + 3) - k2 / 8 > l) goto _L2; else goto _L13
	//  188  335:iload           7
	//  189  337:iconst_3        
	//  190  338:iadd            
	//  191  339:iload           10
	//  192  341:bipush          8
	//  193  343:idiv            
	//  194  344:isub            
	//  195  345:iload           5
	//  196  347:icmpgt          123
_L13:
		i1 = j1 + 1;
	//  197  350:iload           7
	//  198  352:iconst_1        
	//  199  353:iadd            
	//  200  354:istore          6
		abyte1[k + j1] = (byte)(l2 >> 16);
	//  201  356:aload_3         
	//  202  357:iload           4
	//  203  359:iload           7
	//  204  361:iadd            
	//  205  362:iload           11
	//  206  364:bipush          16
	//  207  366:ishr            
	//  208  367:int2byte        
	//  209  368:bastore         
		if(k2 <= 12)
	//* 210  369:iload           10
	//* 211  371:bipush          12
	//* 212  373:icmpgt          843
		{
			j1 = i1 + 1;
	//  213  376:iload           6
	//  214  378:iconst_1        
	//  215  379:iadd            
	//  216  380:istore          7
			abyte1[k + i1] = (byte)(l2 >> 8);
	//  217  382:aload_3         
	//  218  383:iload           4
	//  219  385:iload           6
	//  220  387:iadd            
	//  221  388:iload           11
	//  222  390:bipush          8
	//  223  392:ishr            
	//  224  393:int2byte        
	//  225  394:bastore         
			i1 = j1;
	//  226  395:iload           7
	//  227  397:istore          6
		}
		if(k2 <= 6)
	//* 228  399:iload           10
	//* 229  401:bipush          6
	//* 230  403:icmpgt          840
		{
			j1 = i1 + 1;
	//  231  406:iload           6
	//  232  408:iconst_1        
	//  233  409:iadd            
	//  234  410:istore          7
			abyte1[k + i1] = (byte)l2;
	//  235  412:aload_3         
	//  236  413:iload           4
	//  237  415:iload           6
	//  238  417:iadd            
	//  239  418:iload           11
	//  240  420:int2byte        
	//  241  421:bastore         
			i1 = j1;
	//  242  422:iload           7
	//  243  424:istore          6
		}
		flag = true;
	//  244  426:iconst_1        
	//  245  427:istore          15
		l2 = 18;
	//  246  429:bipush          18
	//  247  431:istore          11
		j3 = 0;
	//  248  433:iconst_0        
	//  249  434:istore          13
		k3 = i1;
	//  250  436:iload           6
	//  251  438:istore          14
		i2 = j4;
	//  252  440:iload           19
	//  253  442:istore          8
		j1 = k3;
	//  254  444:iload           14
	//  255  446:istore          7
		if(j4 <= 127)
			break MISSING_BLOCK_LABEL_501;
	//  256  448:iload           19
	//  257  450:bipush          127
	//  258  452:icmple          501
		flag1 = flag;
	//  259  455:iload           15
	//  260  457:istore          16
		j2 = j3;
	//  261  459:iload           13
	//  262  461:istore          9
		i4 = l2;
	//  263  463:iload           11
	//  264  465:istore          18
		i1 = k3;
	//  265  467:iload           14
	//  266  469:istore          6
		if(k3 >= l) goto _L2; else goto _L14
	//  267  471:iload           14
	//  268  473:iload           5
	//  269  475:icmpge          123
_L14:
		abyte1[k + k3] = -21;
	//  270  478:aload_3         
	//  271  479:iload           4
	//  272  481:iload           14
	//  273  483:iadd            
	//  274  484:bipush          -21
	//  275  486:bastore         
		i2 = j4 - 128;
	//  276  487:iload           19
	//  277  489:sipush          128
	//  278  492:isub            
	//  279  493:istore          8
		j1 = k3 + 1;
	//  280  495:iload           14
	//  281  497:iconst_1        
	//  282  498:iadd            
	//  283  499:istore          7
		flag1 = flag;
	//  284  501:iload           15
	//  285  503:istore          16
		j2 = j3;
	//  286  505:iload           13
	//  287  507:istore          9
		i4 = l2;
	//  288  509:iload           11
	//  289  511:istore          18
		i1 = j1;
	//  290  513:iload           7
	//  291  515:istore          6
		if(j1 >= l) goto _L2; else goto _L15
	//  292  517:iload           7
	//  293  519:iload           5
	//  294  521:icmpge          123
_L15:
		i1 = j1 + 1;
	//  295  524:iload           7
	//  296  526:iconst_1        
	//  297  527:iadd            
	//  298  528:istore          6
		abyte1[k + j1] = (byte)(i2 + 1);
	//  299  530:aload_3         
	//  300  531:iload           4
	//  301  533:iload           7
	//  302  535:iadd            
	//  303  536:iload           8
	//  304  538:iconst_1        
	//  305  539:iadd            
	//  306  540:int2byte        
	//  307  541:bastore         
		i2 = ((int) (flag));
	//  308  542:iload           15
	//  309  544:istore          8
		i3 = j3;
	//  310  546:iload           13
	//  311  548:istore          12
		k2 = l2;
	//  312  550:iload           11
	//  313  552:istore          10
		  goto _L12
	//* 314  554:goto            257
label0:
		{
			int k1 = 0x7fffffff;
	//  315  557:ldc1            #92  <Int 0x7fffffff>
	//  316  559:istore          7
			i = 0;
	//  317  561:iconst_0        
	//  318  562:istore_1        
label1:
			do
			{
label2:
				{
					j = k1;
	//  319  563:iload           7
	//  320  565:istore_2        
					if(i < dmSizes.length)
	//* 321  566:iload_1         
	//* 322  567:getstatic       #63  <Field BarcodeDatamatrix$DmParams[] dmSizes>
	//* 323  570:arraylength     
	//* 324  571:icmpge          607
					{
						if(dmSizes[i].dataSize < k + i1 + (3 - i4 / 6))
							break label2;
	//  325  574:getstatic       #63  <Field BarcodeDatamatrix$DmParams[] dmSizes>
	//  326  577:iload_1         
	//  327  578:aaload          
	//  328  579:getfield        #95  <Field int BarcodeDatamatrix$DmParams.dataSize>
	//  329  582:iload           4
	//  330  584:iload           6
	//  331  586:iadd            
	//  332  587:iconst_3        
	//  333  588:iload           18
	//  334  590:bipush          6
	//  335  592:idiv            
	//  336  593:isub            
	//  337  594:iadd            
	//  338  595:icmplt          728
						j = dmSizes[i].dataSize;
	//  339  598:getstatic       #63  <Field BarcodeDatamatrix$DmParams[] dmSizes>
	//  340  601:iload_1         
	//  341  602:aaload          
	//  342  603:getfield        #95  <Field int BarcodeDatamatrix$DmParams.dataSize>
	//  343  606:istore_2        
					}
					if(j - k - i1 > 2 || i4 < 6)
						break label1;
	//  344  607:iload_2         
	//  345  608:iload           4
	//  346  610:isub            
	//  347  611:iload           6
	//  348  613:isub            
	//  349  614:iconst_2        
	//  350  615:icmpgt          735
	//  351  618:iload           18
	//  352  620:bipush          6
	//  353  622:icmplt          735
					j = i1;
	//  354  625:iload           6
	//  355  627:istore_2        
					if(i4 <= 12)
	//* 356  628:iload           18
	//* 357  630:bipush          12
	//* 358  632:icmpgt          676
					{
						j = ((int) ((byte)(j2 >> 18 & 0x3f)));
	//  359  635:iload           9
	//  360  637:bipush          18
	//  361  639:ishr            
	//  362  640:bipush          63
	//  363  642:iand            
	//  364  643:int2byte        
	//  365  644:istore_2        
						i = j;
	//  366  645:iload_2         
	//  367  646:istore_1        
						if((j & 0x20) == 0)
	//* 368  647:iload_2         
	//* 369  648:bipush          32
	//* 370  650:iand            
	//* 371  651:ifne            660
							i = ((int) ((byte)(j | 0x40)));
	//  372  654:iload_2         
	//  373  655:bipush          64
	//  374  657:ior             
	//  375  658:int2byte        
	//  376  659:istore_1        
						abyte1[k + i1] = (byte)(i + 1);
	//  377  660:aload_3         
	//  378  661:iload           4
	//  379  663:iload           6
	//  380  665:iadd            
	//  381  666:iload_1         
	//  382  667:iconst_1        
	//  383  668:iadd            
	//  384  669:int2byte        
	//  385  670:bastore         
						j = i1 + 1;
	//  386  671:iload           6
	//  387  673:iconst_1        
	//  388  674:iadd            
	//  389  675:istore_2        
					}
					i = j;
	//  390  676:iload_2         
	//  391  677:istore_1        
					if(i4 <= 6)
	//* 392  678:iload           18
	//* 393  680:bipush          6
	//* 394  682:icmpgt          835
					{
						l = ((int) ((byte)(j2 >> 12 & 0x3f)));
	//  395  685:iload           9
	//  396  687:bipush          12
	//  397  689:ishr            
	//  398  690:bipush          63
	//  399  692:iand            
	//  400  693:int2byte        
	//  401  694:istore          5
						i = l;
	//  402  696:iload           5
	//  403  698:istore_1        
						if((l & 0x20) == 0)
	//* 404  699:iload           5
	//* 405  701:bipush          32
	//* 406  703:iand            
	//* 407  704:ifne            714
							i = ((int) ((byte)(l | 0x40)));
	//  408  707:iload           5
	//  409  709:bipush          64
	//  410  711:ior             
	//  411  712:int2byte        
	//  412  713:istore_1        
						abyte1[k + j] = (byte)(i + 1);
	//  413  714:aload_3         
	//  414  715:iload           4
	//  415  717:iload_2         
	//  416  718:iadd            
	//  417  719:iload_1         
	//  418  720:iconst_1        
	//  419  721:iadd            
	//  420  722:int2byte        
	//  421  723:bastore         
						return j + 1;
	//  422  724:iload_2         
	//  423  725:iconst_1        
	//  424  726:iadd            
	//  425  727:ireturn         
					}
					break label0;
				}
				i++;
	//  426  728:iload_1         
	//  427  729:iconst_1        
	//  428  730:iadd            
	//  429  731:istore_1        
			} while(true);
	//  430  732:goto            563
			i = i1;
	//  431  735:iload           6
	//  432  737:istore_1        
			if(!flag1)
	//* 433  738:iload           16
	//* 434  740:ifne            835
			{
				int l1 = j2 | 31 << i4;
	//  435  743:iload           9
	//  436  745:bipush          31
	//  437  747:iload           18
	//  438  749:ishl            
	//  439  750:ior             
	//  440  751:istore          7
				if((i1 + 3) - i4 / 8 > l)
	//* 441  753:iload           6
	//* 442  755:iconst_3        
	//* 443  756:iadd            
	//* 444  757:iload           18
	//* 445  759:bipush          8
	//* 446  761:idiv            
	//* 447  762:isub            
	//* 448  763:iload           5
	//* 449  765:icmple          770
					return -1;
	//  450  768:iconst_m1       
	//  451  769:ireturn         
				j = i1 + 1;
	//  452  770:iload           6
	//  453  772:iconst_1        
	//  454  773:iadd            
	//  455  774:istore_2        
				abyte1[k + i1] = (byte)(l1 >> 16);
	//  456  775:aload_3         
	//  457  776:iload           4
	//  458  778:iload           6
	//  459  780:iadd            
	//  460  781:iload           7
	//  461  783:bipush          16
	//  462  785:ishr            
	//  463  786:int2byte        
	//  464  787:bastore         
				if(i4 <= 12)
	//* 465  788:iload           18
	//* 466  790:bipush          12
	//* 467  792:icmpgt          837
				{
					i = j + 1;
	//  468  795:iload_2         
	//  469  796:iconst_1        
	//  470  797:iadd            
	//  471  798:istore_1        
					abyte1[k + j] = (byte)(l1 >> 8);
	//  472  799:aload_3         
	//  473  800:iload           4
	//  474  802:iload_2         
	//  475  803:iadd            
	//  476  804:iload           7
	//  477  806:bipush          8
	//  478  808:ishr            
	//  479  809:int2byte        
	//  480  810:bastore         
					j = i;
	//  481  811:iload_1         
	//  482  812:istore_2        
				}
				i = j;
	//  483  813:iload_2         
	//  484  814:istore_1        
				if(i4 <= 6)
	//* 485  815:iload           18
	//* 486  817:bipush          6
	//* 487  819:icmpgt          835
				{
					abyte1[k + j] = (byte)l1;
	//  488  822:aload_3         
	//  489  823:iload           4
	//  490  825:iload_2         
	//  491  826:iadd            
	//  492  827:iload           7
	//  493  829:int2byte        
	//  494  830:bastore         
					return j + 1;
	//  495  831:iload_2         
	//  496  832:iconst_1        
	//  497  833:iadd            
	//  498  834:ireturn         
				}
			}
		}
		return i;
	//  499  835:iload_1         
	//  500  836:ireturn         
		if(true) goto _L17; else goto _L16
	//  501  837:goto            813
_L16:
	//* 502  840:goto            426
	//* 503  843:goto            399
	}

	private static int X12Encodation(byte abyte0[], int i, int j, byte abyte1[], int k, int l)
	{
		int i1;
		int j1;
		byte abyte2[];
		if(j == 0)
	//*   0    0:iload_2         
	//*   1    1:ifne            6
			return 0;
	//    2    4:iconst_0        
	//    3    5:ireturn         
		j1 = 0;
	//    4    6:iconst_0        
	//    5    7:istore          7
		abyte2 = new byte[j];
	//    6    9:iload_2         
	//    7   10:newarray        byte[]
	//    8   12:astore          10
		i1 = 0;
	//    9   14:iconst_0        
	//   10   15:istore          6
		while(j1 < j) 
	//*  11   17:iload           7
	//*  12   19:iload_2         
	//*  13   20:icmpge          131
		{
			int k1 = "\r*> 0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ".indexOf(((int) ((char)abyte0[j1 + i])));
	//   14   23:ldc1            #44  <String "\r*> 0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ">
	//   15   25:aload_0         
	//   16   26:iload           7
	//   17   28:iload_1         
	//   18   29:iadd            
	//   19   30:baload          
	//   20   31:int2char        
	//   21   32:invokevirtual   #80  <Method int String.indexOf(int)>
	//   22   35:istore          8
			if(k1 >= 0)
	//*  23   37:iload           8
	//*  24   39:iflt            65
			{
				abyte2[j1] = (byte)k1;
	//   25   42:aload           10
	//   26   44:iload           7
	//   27   46:iload           8
	//   28   48:int2byte        
	//   29   49:bastore         
				i1++;
	//   30   50:iload           6
	//   31   52:iconst_1        
	//   32   53:iadd            
	//   33   54:istore          6
			} else
	//*  34   56:iload           7
	//*  35   58:iconst_1        
	//*  36   59:iadd            
	//*  37   60:istore          7
	//*  38   62:goto            17
			{
				abyte2[j1] = 100;
	//   39   65:aload           10
	//   40   67:iload           7
	//   41   69:bipush          100
	//   42   71:bastore         
				int l1 = i1;
	//   43   72:iload           6
	//   44   74:istore          8
				if(i1 >= 6)
	//*  45   76:iload           6
	//*  46   78:bipush          6
	//*  47   80:icmplt          94
					l1 = i1 - (i1 / 3) * 3;
	//   48   83:iload           6
	//   49   85:iload           6
	//   50   87:iconst_3        
	//   51   88:idiv            
	//   52   89:iconst_3        
	//   53   90:imul            
	//   54   91:isub            
	//   55   92:istore          8
				for(i1 = 0; i1 < l1; i1++)
	//*  56   94:iconst_0        
	//*  57   95:istore          6
	//*  58   97:iload           6
	//*  59   99:iload           8
	//*  60  101:icmpge          125
					abyte2[j1 - i1 - 1] = 100;
	//   61  104:aload           10
	//   62  106:iload           7
	//   63  108:iload           6
	//   64  110:isub            
	//   65  111:iconst_1        
	//   66  112:isub            
	//   67  113:bipush          100
	//   68  115:bastore         

	//   69  116:iload           6
	//   70  118:iconst_1        
	//   71  119:iadd            
	//   72  120:istore          6
	//*  73  122:goto            97
				i1 = 0;
	//   74  125:iconst_0        
	//   75  126:istore          6
			}
			j1++;
		}
	//*  76  128:goto            56
		int i2 = i1;
	//   77  131:iload           6
	//   78  133:istore          8
		if(i1 >= 6)
	//*  79  135:iload           6
	//*  80  137:bipush          6
	//*  81  139:icmplt          153
			i2 = i1 - (i1 / 3) * 3;
	//   82  142:iload           6
	//   83  144:iload           6
	//   84  146:iconst_3        
	//   85  147:idiv            
	//   86  148:iconst_3        
	//   87  149:imul            
	//   88  150:isub            
	//   89  151:istore          8
		for(i1 = 0; i1 < i2; i1++)
	//*  90  153:iconst_0        
	//*  91  154:istore          6
	//*  92  156:iload           6
	//*  93  158:iload           8
	//*  94  160:icmpge          184
			abyte2[j1 - i1 - 1] = 100;
	//   95  163:aload           10
	//   96  165:iload           7
	//   97  167:iload           6
	//   98  169:isub            
	//   99  170:iconst_1        
	//  100  171:isub            
	//  101  172:bipush          100
	//  102  174:bastore         

	//  103  175:iload           6
	//  104  177:iconst_1        
	//  105  178:iadd            
	//  106  179:istore          6
	//* 107  181:goto            156
		j1 = 0;
	//  108  184:iconst_0        
	//  109  185:istore          7
		i1 = 0;
	//  110  187:iconst_0        
	//  111  188:istore          6
_L11:
		int j2 = i1;
	//  112  190:iload           6
	//  113  192:istore          8
		if(j1 >= j) goto _L2; else goto _L1
	//  114  194:iload           7
	//  115  196:iload_2         
	//  116  197:icmpge          218
_L1:
		j2 = ((int) (abyte2[j1]));
	//  117  200:aload           10
	//  118  202:iload           7
	//  119  204:baload          
	//  120  205:istore          8
		if(i1 < l) goto _L4; else goto _L3
	//  121  207:iload           6
	//  122  209:iload           5
	//  123  211:icmplt          253
_L3:
		j2 = i1;
	//  124  214:iload           6
	//  125  216:istore          8
_L2:
		i = 100;
	//  126  218:bipush          100
	//  127  220:istore_1        
		if(j > 0)
	//* 128  221:iload_2         
	//* 129  222:ifle            232
			i = ((int) (abyte2[j - 1]));
	//  130  225:aload           10
	//  131  227:iload_2         
	//  132  228:iconst_1        
	//  133  229:isub            
	//  134  230:baload          
	//  135  231:istore_1        
		if(j1 != j || i < 40 && j2 >= l)
	//* 136  232:iload           7
	//* 137  234:iload_2         
	//* 138  235:icmpne          251
	//* 139  238:iload_1         
	//* 140  239:bipush          40
	//* 141  241:icmpge          519
	//* 142  244:iload           8
	//* 143  246:iload           5
	//* 144  248:icmplt          519
			return -1;
	//  145  251:iconst_m1       
	//  146  252:ireturn         
		break MISSING_BLOCK_LABEL_519;
_L4:
		if(j2 >= 40) goto _L6; else goto _L5
	//  147  253:iload           8
	//  148  255:bipush          40
	//  149  257:icmpge          401
_L5:
		int k2;
label0:
		{
			if(j1 != 0)
	//* 150  260:iload           7
	//* 151  262:ifeq            290
			{
				k2 = i1;
	//  152  265:iload           6
	//  153  267:istore          9
				if(j1 <= 0)
					break label0;
	//  154  269:iload           7
	//  155  271:ifle            305
				k2 = i1;
	//  156  274:iload           6
	//  157  276:istore          9
				if(abyte2[j1 - 1] <= 40)
					break label0;
	//  158  278:aload           10
	//  159  280:iload           7
	//  160  282:iconst_1        
	//  161  283:isub            
	//  162  284:baload          
	//  163  285:bipush          40
	//  164  287:icmple          305
			}
			abyte1[k + i1] = -18;
	//  165  290:aload_3         
	//  166  291:iload           4
	//  167  293:iload           6
	//  168  295:iadd            
	//  169  296:bipush          -18
	//  170  298:bastore         
			k2 = i1 + 1;
	//  171  299:iload           6
	//  172  301:iconst_1        
	//  173  302:iadd            
	//  174  303:istore          9
		}
		j2 = k2;
	//  175  305:iload           9
	//  176  307:istore          8
		if(k2 + 2 > l)
			continue; /* Loop/switch isn't completed */
	//  177  309:iload           9
	//  178  311:iconst_2        
	//  179  312:iadd            
	//  180  313:iload           5
	//  181  315:icmpgt          218
		j2 = abyte2[j1] * 1600 + abyte2[j1 + 1] * 40 + abyte2[j1 + 2] + 1;
	//  182  318:aload           10
	//  183  320:iload           7
	//  184  322:baload          
	//  185  323:sipush          1600
	//  186  326:imul            
	//  187  327:aload           10
	//  188  329:iload           7
	//  189  331:iconst_1        
	//  190  332:iadd            
	//  191  333:baload          
	//  192  334:bipush          40
	//  193  336:imul            
	//  194  337:iadd            
	//  195  338:aload           10
	//  196  340:iload           7
	//  197  342:iconst_2        
	//  198  343:iadd            
	//  199  344:baload          
	//  200  345:iadd            
	//  201  346:iconst_1        
	//  202  347:iadd            
	//  203  348:istore          8
		i1 = k2 + 1;
	//  204  350:iload           9
	//  205  352:iconst_1        
	//  206  353:iadd            
	//  207  354:istore          6
		abyte1[k + k2] = (byte)(j2 / 256);
	//  208  356:aload_3         
	//  209  357:iload           4
	//  210  359:iload           9
	//  211  361:iadd            
	//  212  362:iload           8
	//  213  364:sipush          256
	//  214  367:idiv            
	//  215  368:int2byte        
	//  216  369:bastore         
		abyte1[k + i1] = (byte)j2;
	//  217  370:aload_3         
	//  218  371:iload           4
	//  219  373:iload           6
	//  220  375:iadd            
	//  221  376:iload           8
	//  222  378:int2byte        
	//  223  379:bastore         
		j1 += 2;
	//  224  380:iload           7
	//  225  382:iconst_2        
	//  226  383:iadd            
	//  227  384:istore          7
		i1++;
	//  228  386:iload           6
	//  229  388:iconst_1        
	//  230  389:iadd            
	//  231  390:istore          6
_L8:
		j1++;
	//  232  392:iload           7
	//  233  394:iconst_1        
	//  234  395:iadd            
	//  235  396:istore          7
		continue; /* Loop/switch isn't completed */
	//  236  398:goto            190
_L6:
		if(j1 > 0 && abyte2[j1 - 1] < 40)
	//* 237  401:iload           7
	//* 238  403:ifle            545
	//* 239  406:aload           10
	//* 240  408:iload           7
	//* 241  410:iconst_1        
	//* 242  411:isub            
	//* 243  412:baload          
	//* 244  413:bipush          40
	//* 245  415:icmpge          545
		{
			j2 = i1 + 1;
	//  246  418:iload           6
	//  247  420:iconst_1        
	//  248  421:iadd            
	//  249  422:istore          8
			abyte1[k + i1] = -2;
	//  250  424:aload_3         
	//  251  425:iload           4
	//  252  427:iload           6
	//  253  429:iadd            
	//  254  430:bipush          -2
	//  255  432:bastore         
			i1 = j2;
	//  256  433:iload           8
	//  257  435:istore          6
		}
		int l2 = abyte0[j1 + i] & 0xff;
	//  258  437:aload_0         
	//  259  438:iload           7
	//  260  440:iload_1         
	//  261  441:iadd            
	//  262  442:baload          
	//  263  443:sipush          255
	//  264  446:iand            
	//  265  447:istore          9
		if(l2 > 127)
	//* 266  449:iload           9
	//* 267  451:bipush          127
	//* 268  453:icmple          542
		{
			j2 = i1 + 1;
	//  269  456:iload           6
	//  270  458:iconst_1        
	//  271  459:iadd            
	//  272  460:istore          8
			abyte1[k + i1] = -21;
	//  273  462:aload_3         
	//  274  463:iload           4
	//  275  465:iload           6
	//  276  467:iadd            
	//  277  468:bipush          -21
	//  278  470:bastore         
			l2 -= 128;
	//  279  471:iload           9
	//  280  473:sipush          128
	//  281  476:isub            
	//  282  477:istore          9
			i1 = j2;
	//  283  479:iload           8
	//  284  481:istore          6
		}
		j2 = i1;
	//  285  483:iload           6
	//  286  485:istore          8
		if(i1 >= l)
			break; /* Loop/switch isn't completed */
	//  287  487:iload           6
	//  288  489:iload           5
	//  289  491:icmpge          218
		j2 = i1 + 1;
	//  290  494:iload           6
	//  291  496:iconst_1        
	//  292  497:iadd            
	//  293  498:istore          8
		abyte1[k + i1] = (byte)(l2 + 1);
	//  294  500:aload_3         
	//  295  501:iload           4
	//  296  503:iload           6
	//  297  505:iadd            
	//  298  506:iload           9
	//  299  508:iconst_1        
	//  300  509:iadd            
	//  301  510:int2byte        
	//  302  511:bastore         
		i1 = j2;
	//  303  512:iload           8
	//  304  514:istore          6
		if(true) goto _L8; else goto _L7
	//  305  516:goto            392
_L7:
		if(true) goto _L2; else goto _L9
_L9:
		if(i < 40)
	//* 306  519:iload_1         
	//* 307  520:bipush          40
	//* 308  522:icmpge          539
		{
			abyte1[k + j2] = -2;
	//  309  525:aload_3         
	//  310  526:iload           4
	//  311  528:iload           8
	//  312  530:iadd            
	//  313  531:bipush          -2
	//  314  533:bastore         
			return j2 + 1;
	//  315  534:iload           8
	//  316  536:iconst_1        
	//  317  537:iadd            
	//  318  538:ireturn         
		}
		return j2;
	//  319  539:iload           8
	//  320  541:ireturn         
		if(true) goto _L11; else goto _L10
	//  321  542:goto            483
_L10:
	//* 322  545:goto            437
	}

	private static int asciiEncodation(byte abyte0[], int i, int j, byte abyte1[], int k, int l)
	{
		int i1;
		int j1;
		i1 = j + i;
	//    0    0:iload_2         
	//    1    1:iload_1         
	//    2    2:iadd            
	//    3    3:istore          6
		j1 = l + k;
	//    4    5:iload           5
	//    5    7:iload           4
	//    6    9:iadd            
	//    7   10:istore          7
		j = k;
	//    8   12:iload           4
	//    9   14:istore_2        
		l = i;
	//   10   15:iload_1         
	//   11   16:istore          5
		i = j;
	//   12   18:iload_2         
	//   13   19:istore_1        
		j = l;
	//   14   20:iload           5
	//   15   22:istore_2        
_L5:
		if(j >= i1)
			break; /* Loop/switch isn't completed */
	//   16   23:iload_2         
	//   17   24:iload           6
	//   18   26:icmpge          184
		if(i < j1) goto _L2; else goto _L1
	//   19   29:iload_1         
	//   20   30:iload           7
	//   21   32:icmplt          37
_L1:
		return -1;
	//   22   35:iconst_m1       
	//   23   36:ireturn         
_L2:
		int k1;
		l = j + 1;
	//   24   37:iload_2         
	//   25   38:iconst_1        
	//   26   39:iadd            
	//   27   40:istore          5
		k1 = abyte0[j] & 0xff;
	//   28   42:aload_0         
	//   29   43:iload_2         
	//   30   44:baload          
	//   31   45:sipush          255
	//   32   48:iand            
	//   33   49:istore          8
		if(isDigit(k1) && l < i1 && isDigit(abyte0[l] & 0xff))
	//*  34   51:iload           8
	//*  35   53:invokestatic    #100 <Method boolean isDigit(int)>
	//*  36   56:ifeq            120
	//*  37   59:iload           5
	//*  38   61:iload           6
	//*  39   63:icmpge          120
	//*  40   66:aload_0         
	//*  41   67:iload           5
	//*  42   69:baload          
	//*  43   70:sipush          255
	//*  44   73:iand            
	//*  45   74:invokestatic    #100 <Method boolean isDigit(int)>
	//*  46   77:ifeq            120
		{
			j = l + 1;
	//   47   80:iload           5
	//   48   82:iconst_1        
	//   49   83:iadd            
	//   50   84:istore_2        
			abyte1[i] = (byte)((((k1 - 48) * 10 + (abyte0[l] & 0xff)) - 48) + 130);
	//   51   85:aload_3         
	//   52   86:iload_1         
	//   53   87:iload           8
	//   54   89:bipush          48
	//   55   91:isub            
	//   56   92:bipush          10
	//   57   94:imul            
	//   58   95:aload_0         
	//   59   96:iload           5
	//   60   98:baload          
	//   61   99:sipush          255
	//   62  102:iand            
	//   63  103:iadd            
	//   64  104:bipush          48
	//   65  106:isub            
	//   66  107:sipush          130
	//   67  110:iadd            
	//   68  111:int2byte        
	//   69  112:bastore         
			i++;
	//   70  113:iload_1         
	//   71  114:iconst_1        
	//   72  115:iadd            
	//   73  116:istore_1        
			continue; /* Loop/switch isn't completed */
	//   74  117:goto            23
		}
		if(k1 <= 127)
			break; /* Loop/switch isn't completed */
	//   75  120:iload           8
	//   76  122:bipush          127
	//   77  124:icmple          166
		if(i + 1 < j1)
	//*  78  127:iload_1         
	//*  79  128:iconst_1        
	//*  80  129:iadd            
	//*  81  130:iload           7
	//*  82  132:icmpge          35
		{
			j = i + 1;
	//   83  135:iload_1         
	//   84  136:iconst_1        
	//   85  137:iadd            
	//   86  138:istore_2        
			abyte1[i] = -21;
	//   87  139:aload_3         
	//   88  140:iload_1         
	//   89  141:bipush          -21
	//   90  143:bastore         
			i = j + 1;
	//   91  144:iload_2         
	//   92  145:iconst_1        
	//   93  146:iadd            
	//   94  147:istore_1        
			abyte1[j] = (byte)((k1 - 128) + 1);
	//   95  148:aload_3         
	//   96  149:iload_2         
	//   97  150:iload           8
	//   98  152:sipush          128
	//   99  155:isub            
	//  100  156:iconst_1        
	//  101  157:iadd            
	//  102  158:int2byte        
	//  103  159:bastore         
			j = l;
	//  104  160:iload           5
	//  105  162:istore_2        
			continue; /* Loop/switch isn't completed */
	//  106  163:goto            23
		}
		if(true) goto _L1; else goto _L3
_L3:
		abyte1[i] = (byte)(k1 + 1);
	//  107  166:aload_3         
	//  108  167:iload_1         
	//  109  168:iload           8
	//  110  170:iconst_1        
	//  111  171:iadd            
	//  112  172:int2byte        
	//  113  173:bastore         
		i++;
	//  114  174:iload_1         
	//  115  175:iconst_1        
	//  116  176:iadd            
	//  117  177:istore_1        
		j = l;
	//  118  178:iload           5
	//  119  180:istore_2        
		if(true) goto _L5; else goto _L4
	//  120  181:goto            23
_L4:
		return i - k;
	//  121  184:iload_1         
	//  122  185:iload           4
	//  123  187:isub            
	//  124  188:ireturn         
	}

	private static int b256Encodation(byte abyte0[], int i, int j, byte abyte1[], int k, int l)
	{
		byte byte0 = -1;
	//    0    0:iconst_m1       
	//    1    1:istore          7
		if(j != 0) goto _L2; else goto _L1
	//    2    3:iload_2         
	//    3    4:ifne            13
_L1:
		int i1 = 0;
	//    4    7:iconst_0        
	//    5    8:istore          6
_L4:
		return i1;
	//    6   10:iload           6
	//    7   12:ireturn         
_L2:
		if(j >= 250)
			break; /* Loop/switch isn't completed */
	//    8   13:iload_2         
	//    9   14:sipush          250
	//   10   17:icmpge          32
		i1 = ((int) (byte0));
	//   11   20:iload           7
	//   12   22:istore          6
		if(j + 2 > l) goto _L4; else goto _L3
	//   13   24:iload_2         
	//   14   25:iconst_2        
	//   15   26:iadd            
	//   16   27:iload           5
	//   17   29:icmpgt          10
_L3:
		if(j < 250)
			break; /* Loop/switch isn't completed */
	//   18   32:iload_2         
	//   19   33:sipush          250
	//   20   36:icmplt          51
		i1 = ((int) (byte0));
	//   21   39:iload           7
	//   22   41:istore          6
		if(j + 3 > l) goto _L4; else goto _L5
	//   23   43:iload_2         
	//   24   44:iconst_3        
	//   25   45:iadd            
	//   26   46:iload           5
	//   27   48:icmpgt          10
_L5:
		abyte1[k] = -25;
	//   28   51:aload_3         
	//   29   52:iload           4
	//   30   54:bipush          -25
	//   31   56:bastore         
		int j1;
		if(j < 250)
	//*  32   57:iload_2         
	//*  33   58:sipush          250
	//*  34   61:icmpge          160
		{
			abyte1[k + 1] = (byte)j;
	//   35   64:aload_3         
	//   36   65:iload           4
	//   37   67:iconst_1        
	//   38   68:iadd            
	//   39   69:iload_2         
	//   40   70:int2byte        
	//   41   71:bastore         
			l = 2;
	//   42   72:iconst_2        
	//   43   73:istore          5
		} else
	//*  44   75:aload_0         
	//*  45   76:iload_1         
	//*  46   77:aload_3         
	//*  47   78:iload           5
	//*  48   80:iload           4
	//*  49   82:iadd            
	//*  50   83:iload_2         
	//*  51   84:invokestatic    #107 <Method void System.arraycopy(Object, int, Object, int, int)>
	//*  52   87:iload           5
	//*  53   89:iload_2         
	//*  54   90:iload           4
	//*  55   92:iadd            
	//*  56   93:iadd            
	//*  57   94:istore          6
	//*  58   96:iload           4
	//*  59   98:iconst_1        
	//*  60   99:iadd            
	//*  61  100:istore_1        
	//*  62  101:iload_1         
	//*  63  102:iload           6
	//*  64  104:icmpge          194
	//*  65  107:aload_3         
	//*  66  108:iload_1         
	//*  67  109:baload          
	//*  68  110:sipush          255
	//*  69  113:iand            
	//*  70  114:iload_1         
	//*  71  115:iconst_1        
	//*  72  116:iadd            
	//*  73  117:sipush          149
	//*  74  120:imul            
	//*  75  121:sipush          255
	//*  76  124:irem            
	//*  77  125:iconst_1        
	//*  78  126:iadd            
	//*  79  127:iadd            
	//*  80  128:istore          5
	//*  81  130:iload           5
	//*  82  132:istore_2        
	//*  83  133:iload           5
	//*  84  135:sipush          255
	//*  85  138:icmple          148
	//*  86  141:iload           5
	//*  87  143:sipush          256
	//*  88  146:isub            
	//*  89  147:istore_2        
	//*  90  148:aload_3         
	//*  91  149:iload_1         
	//*  92  150:iload_2         
	//*  93  151:int2byte        
	//*  94  152:bastore         
	//*  95  153:iload_1         
	//*  96  154:iconst_1        
	//*  97  155:iadd            
	//*  98  156:istore_1        
	//*  99  157:goto            101
		{
			abyte1[k + 1] = (byte)(j / 250 + 249);
	//  100  160:aload_3         
	//  101  161:iload           4
	//  102  163:iconst_1        
	//  103  164:iadd            
	//  104  165:iload_2         
	//  105  166:sipush          250
	//  106  169:idiv            
	//  107  170:sipush          249
	//  108  173:iadd            
	//  109  174:int2byte        
	//  110  175:bastore         
			abyte1[k + 2] = (byte)(j % 250);
	//  111  176:aload_3         
	//  112  177:iload           4
	//  113  179:iconst_2        
	//  114  180:iadd            
	//  115  181:iload_2         
	//  116  182:sipush          250
	//  117  185:irem            
	//  118  186:int2byte        
	//  119  187:bastore         
			l = 3;
	//  120  188:iconst_3        
	//  121  189:istore          5
		}
		System.arraycopy(((Object) (abyte0)), i, ((Object) (abyte1)), l + k, j);
		j1 = l + (j + k);
		for(i = k + 1; i < j1; i++)
		{
			l = (abyte1[i] & 0xff) + (((i + 1) * 149) % 255 + 1);
			j = l;
			if(l > 255)
				j = l - 256;
			abyte1[i] = (byte)j;
		}

	//* 122  191:goto            75
		return j1 - k;
	//  123  194:iload           6
	//  124  196:iload           4
	//  125  198:isub            
	//  126  199:ireturn         
	}

	private void draw(byte abyte0[], int i, DmParams dmparams)
	{
		int j2 = (dmparams.width + ws * 2 + 7) / 8;
	//    0    0:aload_3         
	//    1    1:getfield        #111 <Field int BarcodeDatamatrix$DmParams.width>
	//    2    4:aload_0         
	//    3    5:getfield        #113 <Field int ws>
	//    4    8:iconst_2        
	//    5    9:imul            
	//    6   10:iadd            
	//    7   11:bipush          7
	//    8   13:iadd            
	//    9   14:bipush          8
	//   10   16:idiv            
	//   11   17:istore          8
		Arrays.fill(image, (byte)0);
	//   12   19:aload_0         
	//   13   20:getfield        #115 <Field byte[] image>
	//   14   23:iconst_0        
	//   15   24:invokestatic    #121 <Method void Arrays.fill(byte[], byte)>
		for(i = ws; i < dmparams.height + ws; i += dmparams.heightSection)
	//*  16   27:aload_0         
	//*  17   28:getfield        #113 <Field int ws>
	//*  18   31:istore_2        
	//*  19   32:iload_2         
	//*  20   33:aload_3         
	//*  21   34:getfield        #123 <Field int BarcodeDatamatrix$DmParams.height>
	//*  22   37:aload_0         
	//*  23   38:getfield        #113 <Field int ws>
	//*  24   41:iadd            
	//*  25   42:icmpge          93
		{
			for(int j = ws; j < dmparams.width + ws; j += 2)
	//*  26   45:aload_0         
	//*  27   46:getfield        #113 <Field int ws>
	//*  28   49:istore          4
	//*  29   51:iload           4
	//*  30   53:aload_3         
	//*  31   54:getfield        #111 <Field int BarcodeDatamatrix$DmParams.width>
	//*  32   57:aload_0         
	//*  33   58:getfield        #113 <Field int ws>
	//*  34   61:iadd            
	//*  35   62:icmpge          83
				setBit(j, i, j2);
	//   36   65:aload_0         
	//   37   66:iload           4
	//   38   68:iload_2         
	//   39   69:iload           8
	//   40   71:invokespecial   #127 <Method void setBit(int, int, int)>

	//   41   74:iload           4
	//   42   76:iconst_2        
	//   43   77:iadd            
	//   44   78:istore          4
		}

	//   45   80:goto            51
	//   46   83:iload_2         
	//   47   84:aload_3         
	//   48   85:getfield        #130 <Field int BarcodeDatamatrix$DmParams.heightSection>
	//   49   88:iadd            
	//   50   89:istore_2        
	//*  51   90:goto            32
		for(i = (dmparams.heightSection - 1) + ws; i < dmparams.height + ws; i += dmparams.heightSection)
	//*  52   93:aload_3         
	//*  53   94:getfield        #130 <Field int BarcodeDatamatrix$DmParams.heightSection>
	//*  54   97:iconst_1        
	//*  55   98:isub            
	//*  56   99:aload_0         
	//*  57  100:getfield        #113 <Field int ws>
	//*  58  103:iadd            
	//*  59  104:istore_2        
	//*  60  105:iload_2         
	//*  61  106:aload_3         
	//*  62  107:getfield        #123 <Field int BarcodeDatamatrix$DmParams.height>
	//*  63  110:aload_0         
	//*  64  111:getfield        #113 <Field int ws>
	//*  65  114:iadd            
	//*  66  115:icmpge          166
		{
			for(int k = ws; k < dmparams.width + ws; k++)
	//*  67  118:aload_0         
	//*  68  119:getfield        #113 <Field int ws>
	//*  69  122:istore          4
	//*  70  124:iload           4
	//*  71  126:aload_3         
	//*  72  127:getfield        #111 <Field int BarcodeDatamatrix$DmParams.width>
	//*  73  130:aload_0         
	//*  74  131:getfield        #113 <Field int ws>
	//*  75  134:iadd            
	//*  76  135:icmpge          156
				setBit(k, i, j2);
	//   77  138:aload_0         
	//   78  139:iload           4
	//   79  141:iload_2         
	//   80  142:iload           8
	//   81  144:invokespecial   #127 <Method void setBit(int, int, int)>

	//   82  147:iload           4
	//   83  149:iconst_1        
	//   84  150:iadd            
	//   85  151:istore          4
		}

	//   86  153:goto            124
	//   87  156:iload_2         
	//   88  157:aload_3         
	//   89  158:getfield        #130 <Field int BarcodeDatamatrix$DmParams.heightSection>
	//   90  161:iadd            
	//   91  162:istore_2        
	//*  92  163:goto            105
		for(i = ws; i < dmparams.width + ws; i += dmparams.widthSection)
	//*  93  166:aload_0         
	//*  94  167:getfield        #113 <Field int ws>
	//*  95  170:istore_2        
	//*  96  171:iload_2         
	//*  97  172:aload_3         
	//*  98  173:getfield        #111 <Field int BarcodeDatamatrix$DmParams.width>
	//*  99  176:aload_0         
	//* 100  177:getfield        #113 <Field int ws>
	//* 101  180:iadd            
	//* 102  181:icmpge          232
		{
			for(int l = ws; l < dmparams.height + ws; l++)
	//* 103  184:aload_0         
	//* 104  185:getfield        #113 <Field int ws>
	//* 105  188:istore          4
	//* 106  190:iload           4
	//* 107  192:aload_3         
	//* 108  193:getfield        #123 <Field int BarcodeDatamatrix$DmParams.height>
	//* 109  196:aload_0         
	//* 110  197:getfield        #113 <Field int ws>
	//* 111  200:iadd            
	//* 112  201:icmpge          222
				setBit(i, l, j2);
	//  113  204:aload_0         
	//  114  205:iload_2         
	//  115  206:iload           4
	//  116  208:iload           8
	//  117  210:invokespecial   #127 <Method void setBit(int, int, int)>

	//  118  213:iload           4
	//  119  215:iconst_1        
	//  120  216:iadd            
	//  121  217:istore          4
		}

	//  122  219:goto            190
	//  123  222:iload_2         
	//  124  223:aload_3         
	//  125  224:getfield        #133 <Field int BarcodeDatamatrix$DmParams.widthSection>
	//  126  227:iadd            
	//  127  228:istore_2        
	//* 128  229:goto            171
		for(i = (dmparams.widthSection - 1) + ws; i < dmparams.width + ws; i += dmparams.widthSection)
	//* 129  232:aload_3         
	//* 130  233:getfield        #133 <Field int BarcodeDatamatrix$DmParams.widthSection>
	//* 131  236:iconst_1        
	//* 132  237:isub            
	//* 133  238:aload_0         
	//* 134  239:getfield        #113 <Field int ws>
	//* 135  242:iadd            
	//* 136  243:istore_2        
	//* 137  244:iload_2         
	//* 138  245:aload_3         
	//* 139  246:getfield        #111 <Field int BarcodeDatamatrix$DmParams.width>
	//* 140  249:aload_0         
	//* 141  250:getfield        #113 <Field int ws>
	//* 142  253:iadd            
	//* 143  254:icmpge          307
		{
			for(int i1 = ws + 1; i1 < dmparams.height + ws; i1 += 2)
	//* 144  257:aload_0         
	//* 145  258:getfield        #113 <Field int ws>
	//* 146  261:iconst_1        
	//* 147  262:iadd            
	//* 148  263:istore          4
	//* 149  265:iload           4
	//* 150  267:aload_3         
	//* 151  268:getfield        #123 <Field int BarcodeDatamatrix$DmParams.height>
	//* 152  271:aload_0         
	//* 153  272:getfield        #113 <Field int ws>
	//* 154  275:iadd            
	//* 155  276:icmpge          297
				setBit(i, i1, j2);
	//  156  279:aload_0         
	//  157  280:iload_2         
	//  158  281:iload           4
	//  159  283:iload           8
	//  160  285:invokespecial   #127 <Method void setBit(int, int, int)>

	//  161  288:iload           4
	//  162  290:iconst_2        
	//  163  291:iadd            
	//  164  292:istore          4
		}

	//  165  294:goto            265
	//  166  297:iload_2         
	//  167  298:aload_3         
	//  168  299:getfield        #133 <Field int BarcodeDatamatrix$DmParams.widthSection>
	//  169  302:iadd            
	//  170  303:istore_2        
	//* 171  304:goto            244
		int l1 = 0;
	//  172  307:iconst_0        
	//  173  308:istore          6
		for(i = 0; i < dmparams.height; i += dmparams.heightSection)
	//* 174  310:iconst_0        
	//* 175  311:istore_2        
	//* 176  312:iload_2         
	//* 177  313:aload_3         
	//* 178  314:getfield        #123 <Field int BarcodeDatamatrix$DmParams.height>
	//* 179  317:icmpge          478
		{
			for(int j1 = 1; j1 < dmparams.heightSection - 1; j1++)
	//* 180  320:iconst_1        
	//* 181  321:istore          4
	//* 182  323:iload           4
	//* 183  325:aload_3         
	//* 184  326:getfield        #130 <Field int BarcodeDatamatrix$DmParams.heightSection>
	//* 185  329:iconst_1        
	//* 186  330:isub            
	//* 187  331:icmpge          468
			{
				for(int k1 = 0; k1 < dmparams.width; k1 += dmparams.widthSection)
	//* 188  334:iconst_0        
	//* 189  335:istore          5
	//* 190  337:iload           5
	//* 191  339:aload_3         
	//* 192  340:getfield        #111 <Field int BarcodeDatamatrix$DmParams.width>
	//* 193  343:icmpge          459
				{
					for(int i2 = 1; i2 < dmparams.widthSection - 1;)
	//* 194  346:iconst_1        
	//* 195  347:istore          7
	//* 196  349:iload           7
	//* 197  351:aload_3         
	//* 198  352:getfield        #133 <Field int BarcodeDatamatrix$DmParams.widthSection>
	//* 199  355:iconst_1        
	//* 200  356:isub            
	//* 201  357:icmpge          447
					{
						short word0 = place[l1];
	//  202  360:aload_0         
	//  203  361:getfield        #135 <Field short[] place>
	//  204  364:iload           6
	//  205  366:saload          
	//  206  367:istore          9
						if(word0 == 1 || word0 > 1 && (abyte0[word0 / 8 - 1] & 0xff & 128 >> word0 % 8) != 0)
	//* 207  369:iload           9
	//* 208  371:iconst_1        
	//* 209  372:icmpeq          407
	//* 210  375:iload           9
	//* 211  377:iconst_1        
	//* 212  378:icmple          432
	//* 213  381:aload_1         
	//* 214  382:iload           9
	//* 215  384:bipush          8
	//* 216  386:idiv            
	//* 217  387:iconst_1        
	//* 218  388:isub            
	//* 219  389:baload          
	//* 220  390:sipush          255
	//* 221  393:iand            
	//* 222  394:sipush          128
	//* 223  397:iload           9
	//* 224  399:bipush          8
	//* 225  401:irem            
	//* 226  402:ishr            
	//* 227  403:iand            
	//* 228  404:ifeq            432
							setBit(i2 + k1 + ws, j1 + i + ws, j2);
	//  229  407:aload_0         
	//  230  408:iload           7
	//  231  410:iload           5
	//  232  412:iadd            
	//  233  413:aload_0         
	//  234  414:getfield        #113 <Field int ws>
	//  235  417:iadd            
	//  236  418:iload           4
	//  237  420:iload_2         
	//  238  421:iadd            
	//  239  422:aload_0         
	//  240  423:getfield        #113 <Field int ws>
	//  241  426:iadd            
	//  242  427:iload           8
	//  243  429:invokespecial   #127 <Method void setBit(int, int, int)>
						i2++;
	//  244  432:iload           7
	//  245  434:iconst_1        
	//  246  435:iadd            
	//  247  436:istore          7
						l1++;
	//  248  438:iload           6
	//  249  440:iconst_1        
	//  250  441:iadd            
	//  251  442:istore          6
					}

				}

	//  252  444:goto            349
	//  253  447:iload           5
	//  254  449:aload_3         
	//  255  450:getfield        #133 <Field int BarcodeDatamatrix$DmParams.widthSection>
	//  256  453:iadd            
	//  257  454:istore          5
			}

	//  258  456:goto            337
	//  259  459:iload           4
	//  260  461:iconst_1        
	//  261  462:iadd            
	//  262  463:istore          4
		}

	//  263  465:goto            323
	//  264  468:iload_2         
	//  265  469:aload_3         
	//  266  470:getfield        #130 <Field int BarcodeDatamatrix$DmParams.heightSection>
	//  267  473:iadd            
	//  268  474:istore_2        
	//* 269  475:goto            312
	//  270  478:return          
	}

	private static int getEncodation(byte abyte0[], int i, int j, byte abyte1[], int k, int l, int i1, boolean flag)
	{
		int ai[] = new int[6];
	//    0    0:bipush          6
	//    1    2:newarray        int[]
	//    2    4:astore          12
		int j1;
		if(l < 0)
	//*   3    6:iload           5
	//*   4    8:ifge            17
		{
			j1 = -1;
	//    5   11:iconst_m1       
	//    6   12:istore          8
		} else
	//*   7   14:iload           8
	//*   8   16:ireturn         
		{
			i1 &= 7;
	//    9   17:iload           6
	//   10   19:bipush          7
	//   11   21:iand            
	//   12   22:istore          6
			if(i1 == 0)
	//*  13   24:iload           6
	//*  14   26:ifne            437
			{
				ai[0] = asciiEncodation(abyte0, i, j, abyte1, k, l);
	//   15   29:aload           12
	//   16   31:iconst_0        
	//   17   32:aload_0         
	//   18   33:iload_1         
	//   19   34:iload_2         
	//   20   35:aload_3         
	//   21   36:iload           4
	//   22   38:iload           5
	//   23   40:invokestatic    #90  <Method int asciiEncodation(byte[], int, int, byte[], int, int)>
	//   24   43:iastore         
				if(flag && ai[0] >= 0)
	//*  25   44:iload           7
	//*  26   46:ifeq            61
	//*  27   49:aload           12
	//*  28   51:iconst_0        
	//*  29   52:iaload          
	//*  30   53:iflt            61
					return ai[0];
	//   31   56:aload           12
	//   32   58:iconst_0        
	//   33   59:iaload          
	//   34   60:ireturn         
				ai[1] = C40OrTextEncodation(abyte0, i, j, abyte1, k, l, false);
	//   35   61:aload           12
	//   36   63:iconst_1        
	//   37   64:aload_0         
	//   38   65:iload_1         
	//   39   66:iload_2         
	//   40   67:aload_3         
	//   41   68:iload           4
	//   42   70:iload           5
	//   43   72:iconst_0        
	//   44   73:invokestatic    #139 <Method int C40OrTextEncodation(byte[], int, int, byte[], int, int, boolean)>
	//   45   76:iastore         
				if(flag && ai[1] >= 0)
	//*  46   77:iload           7
	//*  47   79:ifeq            94
	//*  48   82:aload           12
	//*  49   84:iconst_1        
	//*  50   85:iaload          
	//*  51   86:iflt            94
					return ai[1];
	//   52   89:aload           12
	//   53   91:iconst_1        
	//   54   92:iaload          
	//   55   93:ireturn         
				ai[2] = C40OrTextEncodation(abyte0, i, j, abyte1, k, l, true);
	//   56   94:aload           12
	//   57   96:iconst_2        
	//   58   97:aload_0         
	//   59   98:iload_1         
	//   60   99:iload_2         
	//   61  100:aload_3         
	//   62  101:iload           4
	//   63  103:iload           5
	//   64  105:iconst_1        
	//   65  106:invokestatic    #139 <Method int C40OrTextEncodation(byte[], int, int, byte[], int, int, boolean)>
	//   66  109:iastore         
				if(flag && ai[2] >= 0)
	//*  67  110:iload           7
	//*  68  112:ifeq            127
	//*  69  115:aload           12
	//*  70  117:iconst_2        
	//*  71  118:iaload          
	//*  72  119:iflt            127
					return ai[2];
	//   73  122:aload           12
	//   74  124:iconst_2        
	//   75  125:iaload          
	//   76  126:ireturn         
				ai[3] = b256Encodation(abyte0, i, j, abyte1, k, l);
	//   77  127:aload           12
	//   78  129:iconst_3        
	//   79  130:aload_0         
	//   80  131:iload_1         
	//   81  132:iload_2         
	//   82  133:aload_3         
	//   83  134:iload           4
	//   84  136:iload           5
	//   85  138:invokestatic    #141 <Method int b256Encodation(byte[], int, int, byte[], int, int)>
	//   86  141:iastore         
				if(flag && ai[3] >= 0)
	//*  87  142:iload           7
	//*  88  144:ifeq            159
	//*  89  147:aload           12
	//*  90  149:iconst_3        
	//*  91  150:iaload          
	//*  92  151:iflt            159
					return ai[3];
	//   93  154:aload           12
	//   94  156:iconst_3        
	//   95  157:iaload          
	//   96  158:ireturn         
				ai[4] = X12Encodation(abyte0, i, j, abyte1, k, l);
	//   97  159:aload           12
	//   98  161:iconst_4        
	//   99  162:aload_0         
	//  100  163:iload_1         
	//  101  164:iload_2         
	//  102  165:aload_3         
	//  103  166:iload           4
	//  104  168:iload           5
	//  105  170:invokestatic    #143 <Method int X12Encodation(byte[], int, int, byte[], int, int)>
	//  106  173:iastore         
				if(flag && ai[4] >= 0)
	//* 107  174:iload           7
	//* 108  176:ifeq            191
	//* 109  179:aload           12
	//* 110  181:iconst_4        
	//* 111  182:iaload          
	//* 112  183:iflt            191
					return ai[4];
	//  113  186:aload           12
	//  114  188:iconst_4        
	//  115  189:iaload          
	//  116  190:ireturn         
				ai[5] = EdifactEncodation(abyte0, i, j, abyte1, k, l);
	//  117  191:aload           12
	//  118  193:iconst_5        
	//  119  194:aload_0         
	//  120  195:iload_1         
	//  121  196:iload_2         
	//  122  197:aload_3         
	//  123  198:iload           4
	//  124  200:iload           5
	//  125  202:invokestatic    #145 <Method int EdifactEncodation(byte[], int, int, byte[], int, int)>
	//  126  205:iastore         
				if(flag && ai[5] >= 0)
	//* 127  206:iload           7
	//* 128  208:ifeq            223
	//* 129  211:aload           12
	//* 130  213:iconst_5        
	//* 131  214:iaload          
	//* 132  215:iflt            223
					return ai[5];
	//  133  218:aload           12
	//  134  220:iconst_5        
	//  135  221:iaload          
	//  136  222:ireturn         
				if(ai[0] < 0 && ai[1] < 0 && ai[2] < 0 && ai[3] < 0 && ai[4] < 0 && ai[5] < 0)
	//* 137  223:aload           12
	//* 138  225:iconst_0        
	//* 139  226:iaload          
	//* 140  227:ifge            267
	//* 141  230:aload           12
	//* 142  232:iconst_1        
	//* 143  233:iaload          
	//* 144  234:ifge            267
	//* 145  237:aload           12
	//* 146  239:iconst_2        
	//* 147  240:iaload          
	//* 148  241:ifge            267
	//* 149  244:aload           12
	//* 150  246:iconst_3        
	//* 151  247:iaload          
	//* 152  248:ifge            267
	//* 153  251:aload           12
	//* 154  253:iconst_4        
	//* 155  254:iaload          
	//* 156  255:ifge            267
	//* 157  258:aload           12
	//* 158  260:iconst_5        
	//* 159  261:iaload          
	//* 160  262:ifge            267
					return -1;
	//  161  265:iconst_m1       
	//  162  266:ireturn         
				int k1 = 0;
	//  163  267:iconst_0        
	//  164  268:istore          9
				j1 = 0x1869f;
	//  165  270:ldc1            #146 <Int 0x1869f>
	//  166  272:istore          8
				for(i1 = 0; i1 < 6;)
	//* 167  274:iconst_0        
	//* 168  275:istore          6
	//* 169  277:iload           6
	//* 170  279:bipush          6
	//* 171  281:icmpge          346
				{
					int i2 = j1;
	//  172  284:iload           8
	//  173  286:istore          11
					int l1 = k1;
	//  174  288:iload           9
	//  175  290:istore          10
					if(ai[i1] >= 0)
	//* 176  292:aload           12
	//* 177  294:iload           6
	//* 178  296:iaload          
	//* 179  297:iflt            329
					{
						i2 = j1;
	//  180  300:iload           8
	//  181  302:istore          11
						l1 = k1;
	//  182  304:iload           9
	//  183  306:istore          10
						if(ai[i1] < j1)
	//* 184  308:aload           12
	//* 185  310:iload           6
	//* 186  312:iaload          
	//* 187  313:iload           8
	//* 188  315:icmpge          329
						{
							i2 = ai[i1];
	//  189  318:aload           12
	//  190  320:iload           6
	//  191  322:iaload          
	//  192  323:istore          11
							l1 = i1;
	//  193  325:iload           6
	//  194  327:istore          10
						}
					}
					i1++;
	//  195  329:iload           6
	//  196  331:iconst_1        
	//  197  332:iadd            
	//  198  333:istore          6
					j1 = i2;
	//  199  335:iload           11
	//  200  337:istore          8
					k1 = l1;
	//  201  339:iload           10
	//  202  341:istore          9
				}

	//* 203  343:goto            277
				if(k1 == 0)
	//* 204  346:iload           9
	//* 205  348:ifne            363
					return asciiEncodation(abyte0, i, j, abyte1, k, l);
	//  206  351:aload_0         
	//  207  352:iload_1         
	//  208  353:iload_2         
	//  209  354:aload_3         
	//  210  355:iload           4
	//  211  357:iload           5
	//  212  359:invokestatic    #90  <Method int asciiEncodation(byte[], int, int, byte[], int, int)>
	//  213  362:ireturn         
				if(k1 == 1)
	//* 214  363:iload           9
	//* 215  365:iconst_1        
	//* 216  366:icmpne          382
					return C40OrTextEncodation(abyte0, i, j, abyte1, k, l, false);
	//  217  369:aload_0         
	//  218  370:iload_1         
	//  219  371:iload_2         
	//  220  372:aload_3         
	//  221  373:iload           4
	//  222  375:iload           5
	//  223  377:iconst_0        
	//  224  378:invokestatic    #139 <Method int C40OrTextEncodation(byte[], int, int, byte[], int, int, boolean)>
	//  225  381:ireturn         
				if(k1 == 2)
	//* 226  382:iload           9
	//* 227  384:iconst_2        
	//* 228  385:icmpne          401
					return C40OrTextEncodation(abyte0, i, j, abyte1, k, l, true);
	//  229  388:aload_0         
	//  230  389:iload_1         
	//  231  390:iload_2         
	//  232  391:aload_3         
	//  233  392:iload           4
	//  234  394:iload           5
	//  235  396:iconst_1        
	//  236  397:invokestatic    #139 <Method int C40OrTextEncodation(byte[], int, int, byte[], int, int, boolean)>
	//  237  400:ireturn         
				if(k1 == 3)
	//* 238  401:iload           9
	//* 239  403:iconst_3        
	//* 240  404:icmpne          419
					return b256Encodation(abyte0, i, j, abyte1, k, l);
	//  241  407:aload_0         
	//  242  408:iload_1         
	//  243  409:iload_2         
	//  244  410:aload_3         
	//  245  411:iload           4
	//  246  413:iload           5
	//  247  415:invokestatic    #141 <Method int b256Encodation(byte[], int, int, byte[], int, int)>
	//  248  418:ireturn         
				if(k1 == 4)
	//* 249  419:iload           9
	//* 250  421:iconst_4        
	//* 251  422:icmpne          14
					return X12Encodation(abyte0, i, j, abyte1, k, l);
	//  252  425:aload_0         
	//  253  426:iload_1         
	//  254  427:iload_2         
	//  255  428:aload_3         
	//  256  429:iload           4
	//  257  431:iload           5
	//  258  433:invokestatic    #143 <Method int X12Encodation(byte[], int, int, byte[], int, int)>
	//  259  436:ireturn         
			} else
			{
				switch(i1)
	//* 260  437:iload           6
				{
	//* 261  439:tableswitch     1 7: default 480
	//	               1 482
	//	               2 494
	//	               3 507
	//	               4 520
	//	               5 532
	//	               6 544
	//	               7 556
				default:
					return -1;
	//  262  480:iconst_m1       
	//  263  481:ireturn         

				case 1: // '\001'
					return asciiEncodation(abyte0, i, j, abyte1, k, l);
	//  264  482:aload_0         
	//  265  483:iload_1         
	//  266  484:iload_2         
	//  267  485:aload_3         
	//  268  486:iload           4
	//  269  488:iload           5
	//  270  490:invokestatic    #90  <Method int asciiEncodation(byte[], int, int, byte[], int, int)>
	//  271  493:ireturn         

				case 2: // '\002'
					return C40OrTextEncodation(abyte0, i, j, abyte1, k, l, true);
	//  272  494:aload_0         
	//  273  495:iload_1         
	//  274  496:iload_2         
	//  275  497:aload_3         
	//  276  498:iload           4
	//  277  500:iload           5
	//  278  502:iconst_1        
	//  279  503:invokestatic    #139 <Method int C40OrTextEncodation(byte[], int, int, byte[], int, int, boolean)>
	//  280  506:ireturn         

				case 3: // '\003'
					return C40OrTextEncodation(abyte0, i, j, abyte1, k, l, false);
	//  281  507:aload_0         
	//  282  508:iload_1         
	//  283  509:iload_2         
	//  284  510:aload_3         
	//  285  511:iload           4
	//  286  513:iload           5
	//  287  515:iconst_0        
	//  288  516:invokestatic    #139 <Method int C40OrTextEncodation(byte[], int, int, byte[], int, int, boolean)>
	//  289  519:ireturn         

				case 4: // '\004'
					return b256Encodation(abyte0, i, j, abyte1, k, l);
	//  290  520:aload_0         
	//  291  521:iload_1         
	//  292  522:iload_2         
	//  293  523:aload_3         
	//  294  524:iload           4
	//  295  526:iload           5
	//  296  528:invokestatic    #141 <Method int b256Encodation(byte[], int, int, byte[], int, int)>
	//  297  531:ireturn         

				case 5: // '\005'
					return X12Encodation(abyte0, i, j, abyte1, k, l);
	//  298  532:aload_0         
	//  299  533:iload_1         
	//  300  534:iload_2         
	//  301  535:aload_3         
	//  302  536:iload           4
	//  303  538:iload           5
	//  304  540:invokestatic    #143 <Method int X12Encodation(byte[], int, int, byte[], int, int)>
	//  305  543:ireturn         

				case 6: // '\006'
					return EdifactEncodation(abyte0, i, j, abyte1, k, l);
	//  306  544:aload_0         
	//  307  545:iload_1         
	//  308  546:iload_2         
	//  309  547:aload_3         
	//  310  548:iload           4
	//  311  550:iload           5
	//  312  552:invokestatic    #145 <Method int EdifactEncodation(byte[], int, int, byte[], int, int)>
	//  313  555:ireturn         

				case 7: // '\007'
					break;
				}
				if(j > l)
	//* 314  556:iload_2         
	//* 315  557:iload           5
	//* 316  559:icmple          564
				{
					return -1;
	//  317  562:iconst_m1       
	//  318  563:ireturn         
				} else
				{
					System.arraycopy(((Object) (abyte0)), i, ((Object) (abyte1)), k, j);
	//  319  564:aload_0         
	//  320  565:iload_1         
	//  321  566:aload_3         
	//  322  567:iload           4
	//  323  569:iload_2         
	//  324  570:invokestatic    #107 <Method void System.arraycopy(Object, int, Object, int, int)>
					return j;
	//  325  573:iload_2         
	//  326  574:ireturn         
				}
			}
		}
		return j1;
	}

	private static int getNumber(byte abyte0[], int i, int j)
	{
		int l = 0;
	//    0    0:iconst_0        
	//    1    1:istore          4
		for(int k = 0; k < j;)
	//*   2    3:iconst_0        
	//*   3    4:istore_3        
	//*   4    5:iload_3         
	//*   5    6:iload_2         
	//*   6    7:icmpge          59
		{
			int i1 = abyte0[i] & 0xff;
	//    7   10:aload_0         
	//    8   11:iload_1         
	//    9   12:baload          
	//   10   13:sipush          255
	//   11   16:iand            
	//   12   17:istore          5
			if(i1 < 48 || i1 > 57)
	//*  13   19:iload           5
	//*  14   21:bipush          48
	//*  15   23:icmplt          33
	//*  16   26:iload           5
	//*  17   28:bipush          57
	//*  18   30:icmple          35
				return -1;
	//   19   33:iconst_m1       
	//   20   34:ireturn         
			l = (l * 10 + i1) - 48;
	//   21   35:iload           4
	//   22   37:bipush          10
	//   23   39:imul            
	//   24   40:iload           5
	//   25   42:iadd            
	//   26   43:bipush          48
	//   27   45:isub            
	//   28   46:istore          4
			k++;
	//   29   48:iload_3         
	//   30   49:iconst_1        
	//   31   50:iadd            
	//   32   51:istore_3        
			i++;
	//   33   52:iload_1         
	//   34   53:iconst_1        
	//   35   54:iadd            
	//   36   55:istore_1        
		}

	//*  37   56:goto            5
		return l;
	//   38   59:iload           4
	//   39   61:ireturn         
	}

	private static boolean isDigit(int i)
	{
		return i >= 48 && i <= 57;
	//    0    0:iload_0         
	//    1    1:bipush          48
	//    2    3:icmplt          14
	//    3    6:iload_0         
	//    4    7:bipush          57
	//    5    9:icmpgt          14
	//    6   12:iconst_1        
	//    7   13:ireturn         
	//    8   14:iconst_0        
	//    9   15:ireturn         
	}

	private static void makePadding(byte abyte0[], int i, int j)
	{
		if(j <= 0)
	//*   0    0:iload_2         
	//*   1    1:ifgt            5
			return;
	//    2    4:return          
		int k = i + 1;
	//    3    5:iload_1         
	//    4    6:iconst_1        
	//    5    7:iadd            
	//    6    8:istore_3        
		abyte0[i] = -127;
	//    7    9:aload_0         
	//    8   10:iload_1         
	//    9   11:bipush          -127
	//   10   13:bastore         
		i = k;
	//   11   14:iload_3         
	//   12   15:istore_1        
		do
		{
			int l = j - 1;
	//   13   16:iload_2         
	//   14   17:iconst_1        
	//   15   18:isub            
	//   16   19:istore_3        
			if(l > 0)
	//*  17   20:iload_3         
	//*  18   21:ifle            75
			{
				int i1 = ((i + 1) * 149) % 253 + 129 + 1;
	//   19   24:iload_1         
	//   20   25:iconst_1        
	//   21   26:iadd            
	//   22   27:sipush          149
	//   23   30:imul            
	//   24   31:sipush          253
	//   25   34:irem            
	//   26   35:sipush          129
	//   27   38:iadd            
	//   28   39:iconst_1        
	//   29   40:iadd            
	//   30   41:istore          4
				j = i1;
	//   31   43:iload           4
	//   32   45:istore_2        
				if(i1 > 254)
	//*  33   46:iload           4
	//*  34   48:sipush          254
	//*  35   51:icmple          61
					j = i1 - 254;
	//   36   54:iload           4
	//   37   56:sipush          254
	//   38   59:isub            
	//   39   60:istore_2        
				abyte0[i] = (byte)j;
	//   40   61:aload_0         
	//   41   62:iload_1         
	//   42   63:iload_2         
	//   43   64:int2byte        
	//   44   65:bastore         
				i++;
	//   45   66:iload_1         
	//   46   67:iconst_1        
	//   47   68:iadd            
	//   48   69:istore_1        
				j = l;
	//   49   70:iload_3         
	//   50   71:istore_2        
			} else
	//*  51   72:goto            16
			{
				return;
	//   52   75:return          
			}
		} while(true);
	}

	private int processExtensions(byte abyte0[], int i, int j, byte abyte1[])
	{
		int k;
		int l;
		int i1;
		if((options & 0x20) == 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #154 <Field int options>
	//*   2    4:bipush          32
	//*   3    6:iand            
	//*   4    7:ifne            12
			return 0;
	//    5   10:iconst_0        
	//    6   11:ireturn         
		l = 0;
	//    7   12:iconst_0        
	//    8   13:istore          6
		k = 0;
	//    9   15:iconst_0        
	//   10   16:istore          5
		i1 = 0;
	//   11   18:iconst_0        
	//   12   19:istore          7
_L9:
		int k2;
		int l2;
		if(i1 >= j)
			break MISSING_BLOCK_LABEL_740;
	//   13   21:iload           7
	//   14   23:iload_3         
	//   15   24:icmpge          740
		if(l > 20)
	//*  16   27:iload           6
	//*  17   29:bipush          20
	//*  18   31:icmple          36
			return -1;
	//   19   34:iconst_m1       
	//   20   35:ireturn         
		l2 = i1 + 1;
	//   21   36:iload           7
	//   22   38:iconst_1        
	//   23   39:iadd            
	//   24   40:istore          9
		i1 = ((int) (abyte0[i + i1]));
	//   25   42:aload_1         
	//   26   43:iload_2         
	//   27   44:iload           7
	//   28   46:iadd            
	//   29   47:baload          
	//   30   48:istore          7
		k2 = l + 1;
	//   31   50:iload           6
	//   32   52:iconst_1        
	//   33   53:iadd            
	//   34   54:istore          8
		i1 & 0xff;
	//   35   56:iload           7
	//   36   58:sipush          255
	//   37   61:iand            
		JVM INSTR lookupswitch 6: default 120
	//	               46: 135
	//	               101: 144
	//	               102: 686
	//	               109: 584
	//	               112: 552
	//	               115: 359;
	//   38   62:lookupswitch    6: default 120
	//	               46: 135
	//	               101: 144
	//	               102: 686
	//	               109: 584
	//	               112: 552
	//	               115: 359
		   goto _L1 _L2 _L3 _L4 _L5 _L6 _L7
_L4:
		break MISSING_BLOCK_LABEL_686;
_L2:
		break; /* Loop/switch isn't completed */
_L1:
		l = l2;
	//   39  120:iload           9
	//   40  122:istore          6
_L10:
		i1 = l;
	//   41  124:iload           6
	//   42  126:istore          7
		l = k2;
	//   43  128:iload           8
	//   44  130:istore          6
		if(true) goto _L9; else goto _L8
	//   45  132:goto            21
_L8:
		extOut = l2;
	//   46  135:aload_0         
	//   47  136:iload           9
	//   48  138:putfield        #156 <Field int extOut>
		return k;
	//   49  141:iload           5
	//   50  143:ireturn         
_L3:
		if(l2 + 6 > j)
	//*  51  144:iload           9
	//*  52  146:bipush          6
	//*  53  148:iadd            
	//*  54  149:iload_3         
	//*  55  150:icmple          155
			return -1;
	//   56  153:iconst_m1       
	//   57  154:ireturn         
		int j1 = getNumber(abyte0, i + l2, 6);
	//   58  155:aload_1         
	//   59  156:iload_2         
	//   60  157:iload           9
	//   61  159:iadd            
	//   62  160:bipush          6
	//   63  162:invokestatic    #158 <Method int getNumber(byte[], int, int)>
	//   64  165:istore          7
		if(j1 < 0)
	//*  65  167:iload           7
	//*  66  169:ifge            174
			return -1;
	//   67  172:iconst_m1       
	//   68  173:ireturn         
		l = l2 + 6;
	//   69  174:iload           9
	//   70  176:bipush          6
	//   71  178:iadd            
	//   72  179:istore          6
		l2 = k + 1;
	//   73  181:iload           5
	//   74  183:iconst_1        
	//   75  184:iadd            
	//   76  185:istore          9
		abyte1[k] = -15;
	//   77  187:aload           4
	//   78  189:iload           5
	//   79  191:bipush          -15
	//   80  193:bastore         
		if(j1 < 127)
	//*  81  194:iload           7
	//*  82  196:bipush          127
	//*  83  198:icmpge          220
		{
			abyte1[l2] = (byte)(j1 + 1);
	//   84  201:aload           4
	//   85  203:iload           9
	//   86  205:iload           7
	//   87  207:iconst_1        
	//   88  208:iadd            
	//   89  209:int2byte        
	//   90  210:bastore         
			k = l2 + 1;
	//   91  211:iload           9
	//   92  213:iconst_1        
	//   93  214:iadd            
	//   94  215:istore          5
		} else
	//*  95  217:goto            124
		if(j1 < 16383)
	//*  96  220:iload           7
	//*  97  222:sipush          16383
	//*  98  225:icmpge          279
		{
			int i3 = l2 + 1;
	//   99  228:iload           9
	//  100  230:iconst_1        
	//  101  231:iadd            
	//  102  232:istore          10
			abyte1[l2] = (byte)((j1 - 127) / 254 + 128);
	//  103  234:aload           4
	//  104  236:iload           9
	//  105  238:iload           7
	//  106  240:bipush          127
	//  107  242:isub            
	//  108  243:sipush          254
	//  109  246:idiv            
	//  110  247:sipush          128
	//  111  250:iadd            
	//  112  251:int2byte        
	//  113  252:bastore         
			k = i3 + 1;
	//  114  253:iload           10
	//  115  255:iconst_1        
	//  116  256:iadd            
	//  117  257:istore          5
			abyte1[i3] = (byte)((j1 - 127) % 254 + 1);
	//  118  259:aload           4
	//  119  261:iload           10
	//  120  263:iload           7
	//  121  265:bipush          127
	//  122  267:isub            
	//  123  268:sipush          254
	//  124  271:irem            
	//  125  272:iconst_1        
	//  126  273:iadd            
	//  127  274:int2byte        
	//  128  275:bastore         
		} else
	//* 129  276:goto            124
		{
			k = l2 + 1;
	//  130  279:iload           9
	//  131  281:iconst_1        
	//  132  282:iadd            
	//  133  283:istore          5
			abyte1[l2] = (byte)((j1 - 16383) / 64516 + 192);
	//  134  285:aload           4
	//  135  287:iload           9
	//  136  289:iload           7
	//  137  291:sipush          16383
	//  138  294:isub            
	//  139  295:ldc1            #159 <Int 64516>
	//  140  297:idiv            
	//  141  298:sipush          192
	//  142  301:iadd            
	//  143  302:int2byte        
	//  144  303:bastore         
			l2 = k + 1;
	//  145  304:iload           5
	//  146  306:iconst_1        
	//  147  307:iadd            
	//  148  308:istore          9
			abyte1[k] = (byte)(((j1 - 16383) / 254) % 254 + 1);
	//  149  310:aload           4
	//  150  312:iload           5
	//  151  314:iload           7
	//  152  316:sipush          16383
	//  153  319:isub            
	//  154  320:sipush          254
	//  155  323:idiv            
	//  156  324:sipush          254
	//  157  327:irem            
	//  158  328:iconst_1        
	//  159  329:iadd            
	//  160  330:int2byte        
	//  161  331:bastore         
			abyte1[l2] = (byte)((j1 - 16383) % 254 + 1);
	//  162  332:aload           4
	//  163  334:iload           9
	//  164  336:iload           7
	//  165  338:sipush          16383
	//  166  341:isub            
	//  167  342:sipush          254
	//  168  345:irem            
	//  169  346:iconst_1        
	//  170  347:iadd            
	//  171  348:int2byte        
	//  172  349:bastore         
			k = l2 + 1;
	//  173  350:iload           9
	//  174  352:iconst_1        
	//  175  353:iadd            
	//  176  354:istore          5
		}
		  goto _L10
	//* 177  356:goto            124
_L7:
		if(k2 != 1)
	//* 178  359:iload           8
	//* 179  361:iconst_1        
	//* 180  362:icmpeq          367
			return -1;
	//  181  365:iconst_m1       
	//  182  366:ireturn         
		if(l2 + 9 > j)
	//* 183  367:iload           9
	//* 184  369:bipush          9
	//* 185  371:iadd            
	//* 186  372:iload_3         
	//* 187  373:icmple          378
			return -1;
	//  188  376:iconst_m1       
	//  189  377:ireturn         
		int k1 = getNumber(abyte0, i + l2, 2);
	//  190  378:aload_1         
	//  191  379:iload_2         
	//  192  380:iload           9
	//  193  382:iadd            
	//  194  383:iconst_2        
	//  195  384:invokestatic    #158 <Method int getNumber(byte[], int, int)>
	//  196  387:istore          7
		if(k1 <= 0 || k1 > 16)
	//* 197  389:iload           7
	//* 198  391:ifle            401
	//* 199  394:iload           7
	//* 200  396:bipush          16
	//* 201  398:icmple          403
			return -1;
	//  202  401:iconst_m1       
	//  203  402:ireturn         
		l = l2 + 2;
	//  204  403:iload           9
	//  205  405:iconst_2        
	//  206  406:iadd            
	//  207  407:istore          6
		l2 = getNumber(abyte0, i + l, 2);
	//  208  409:aload_1         
	//  209  410:iload_2         
	//  210  411:iload           6
	//  211  413:iadd            
	//  212  414:iconst_2        
	//  213  415:invokestatic    #158 <Method int getNumber(byte[], int, int)>
	//  214  418:istore          9
		if(l2 <= 1 || l2 > 16)
	//* 215  420:iload           9
	//* 216  422:iconst_1        
	//* 217  423:icmple          433
	//* 218  426:iload           9
	//* 219  428:bipush          16
	//* 220  430:icmple          435
			return -1;
	//  221  433:iconst_m1       
	//  222  434:ireturn         
		l += 2;
	//  223  435:iload           6
	//  224  437:iconst_2        
	//  225  438:iadd            
	//  226  439:istore          6
		int j3 = getNumber(abyte0, i + l, 5);
	//  227  441:aload_1         
	//  228  442:iload_2         
	//  229  443:iload           6
	//  230  445:iadd            
	//  231  446:iconst_5        
	//  232  447:invokestatic    #158 <Method int getNumber(byte[], int, int)>
	//  233  450:istore          10
		if(j3 < 0 || k1 >= 64516)
	//* 234  452:iload           10
	//* 235  454:iflt            464
	//* 236  457:iload           7
	//* 237  459:ldc1            #159 <Int 64516>
	//* 238  461:icmplt          466
			return -1;
	//  239  464:iconst_m1       
	//  240  465:ireturn         
		l += 5;
	//  241  466:iload           6
	//  242  468:iconst_5        
	//  243  469:iadd            
	//  244  470:istore          6
		int k3 = k + 1;
	//  245  472:iload           5
	//  246  474:iconst_1        
	//  247  475:iadd            
	//  248  476:istore          11
		abyte1[k] = -23;
	//  249  478:aload           4
	//  250  480:iload           5
	//  251  482:bipush          -23
	//  252  484:bastore         
		k = k3 + 1;
	//  253  485:iload           11
	//  254  487:iconst_1        
	//  255  488:iadd            
	//  256  489:istore          5
		abyte1[k3] = (byte)(k1 - 1 << 4 | 17 - l2);
	//  257  491:aload           4
	//  258  493:iload           11
	//  259  495:iload           7
	//  260  497:iconst_1        
	//  261  498:isub            
	//  262  499:iconst_4        
	//  263  500:ishl            
	//  264  501:bipush          17
	//  265  503:iload           9
	//  266  505:isub            
	//  267  506:ior             
	//  268  507:int2byte        
	//  269  508:bastore         
		k1 = k + 1;
	//  270  509:iload           5
	//  271  511:iconst_1        
	//  272  512:iadd            
	//  273  513:istore          7
		abyte1[k] = (byte)(j3 / 254 + 1);
	//  274  515:aload           4
	//  275  517:iload           5
	//  276  519:iload           10
	//  277  521:sipush          254
	//  278  524:idiv            
	//  279  525:iconst_1        
	//  280  526:iadd            
	//  281  527:int2byte        
	//  282  528:bastore         
		abyte1[k1] = (byte)(j3 % 254 + 1);
	//  283  529:aload           4
	//  284  531:iload           7
	//  285  533:iload           10
	//  286  535:sipush          254
	//  287  538:irem            
	//  288  539:iconst_1        
	//  289  540:iadd            
	//  290  541:int2byte        
	//  291  542:bastore         
		k = k1 + 1;
	//  292  543:iload           7
	//  293  545:iconst_1        
	//  294  546:iadd            
	//  295  547:istore          5
		  goto _L10
	//* 296  549:goto            124
_L6:
		if(k2 != 1)
	//* 297  552:iload           8
	//* 298  554:iconst_1        
	//* 299  555:icmpeq          560
			return -1;
	//  300  558:iconst_m1       
	//  301  559:ireturn         
		int l1 = k + 1;
	//  302  560:iload           5
	//  303  562:iconst_1        
	//  304  563:iadd            
	//  305  564:istore          7
		abyte1[k] = -22;
	//  306  566:aload           4
	//  307  568:iload           5
	//  308  570:bipush          -22
	//  309  572:bastore         
		l = l2;
	//  310  573:iload           9
	//  311  575:istore          6
		k = l1;
	//  312  577:iload           7
	//  313  579:istore          5
		  goto _L10
	//* 314  581:goto            124
_L5:
		if(k2 != 1)
	//* 315  584:iload           8
	//* 316  586:iconst_1        
	//* 317  587:icmpeq          592
			return -1;
	//  318  590:iconst_m1       
	//  319  591:ireturn         
		if(l2 + 1 > j)
	//* 320  592:iload           9
	//* 321  594:iconst_1        
	//* 322  595:iadd            
	//* 323  596:iload_3         
	//* 324  597:icmple          602
			return -1;
	//  325  600:iconst_m1       
	//  326  601:ireturn         
		int i2 = abyte0[i + l2] & 0xff;
	//  327  602:aload_1         
	//  328  603:iload_2         
	//  329  604:iload           9
	//  330  606:iadd            
	//  331  607:baload          
	//  332  608:sipush          255
	//  333  611:iand            
	//  334  612:istore          7
		if(i2 != 53 && i2 != 53)
	//* 335  614:iload           7
	//* 336  616:bipush          53
	//* 337  618:icmpeq          630
	//* 338  621:iload           7
	//* 339  623:bipush          53
	//* 340  625:icmpeq          630
			return -1;
	//  341  628:iconst_m1       
	//  342  629:ireturn         
		l = k + 1;
	//  343  630:iload           5
	//  344  632:iconst_1        
	//  345  633:iadd            
	//  346  634:istore          6
		abyte1[k] = -22;
	//  347  636:aload           4
	//  348  638:iload           5
	//  349  640:bipush          -22
	//  350  642:bastore         
		if(i2 == 53)
	//* 351  643:iload           7
	//* 352  645:bipush          53
	//* 353  647:icmpne          678
			k = 236;
	//  354  650:sipush          236
	//  355  653:istore          5
		else
	//* 356  655:aload           4
	//* 357  657:iload           6
	//* 358  659:iload           5
	//* 359  661:int2byte        
	//* 360  662:bastore         
	//* 361  663:iload           6
	//* 362  665:iconst_1        
	//* 363  666:iadd            
	//* 364  667:istore          5
	//* 365  669:iload           9
	//* 366  671:iconst_1        
	//* 367  672:iadd            
	//* 368  673:istore          6
	//* 369  675:goto            124
			k = 237;
	//  370  678:sipush          237
	//  371  681:istore          5
		abyte1[l] = (byte)k;
		k = l + 1;
		l = l2 + 1;
		  goto _L10
	//* 372  683:goto            655
		if(k2 != 1 && (k2 != 2 || abyte0[i] != 115 && abyte0[i] != 109))
	//* 373  686:iload           8
	//* 374  688:iconst_1        
	//* 375  689:icmpeq          716
	//* 376  692:iload           8
	//* 377  694:iconst_2        
	//* 378  695:icmpne          714
	//* 379  698:aload_1         
	//* 380  699:iload_2         
	//* 381  700:baload          
	//* 382  701:bipush          115
	//* 383  703:icmpeq          716
	//* 384  706:aload_1         
	//* 385  707:iload_2         
	//* 386  708:baload          
	//* 387  709:bipush          109
	//* 388  711:icmpeq          716
			return -1;
	//  389  714:iconst_m1       
	//  390  715:ireturn         
		int j2 = k + 1;
	//  391  716:iload           5
	//  392  718:iconst_1        
	//  393  719:iadd            
	//  394  720:istore          7
		abyte1[k] = -24;
	//  395  722:aload           4
	//  396  724:iload           5
	//  397  726:bipush          -24
	//  398  728:bastore         
		l = l2;
	//  399  729:iload           9
	//  400  731:istore          6
		k = j2;
	//  401  733:iload           7
	//  402  735:istore          5
		  goto _L10
	//* 403  737:goto            124
		return -1;
	//  404  740:iconst_m1       
	//  405  741:ireturn         
	}

	private void setBit(int i, int j, int k)
	{
		byte abyte0[] = image;
	//    0    0:aload_0         
	//    1    1:getfield        #115 <Field byte[] image>
	//    2    4:astore          4
		j = j * k + i / 8;
	//    3    6:iload_2         
	//    4    7:iload_3         
	//    5    8:imul            
	//    6    9:iload_1         
	//    7   10:bipush          8
	//    8   12:idiv            
	//    9   13:iadd            
	//   10   14:istore_2        
		abyte0[j] = (byte)(abyte0[j] | (byte)(128 >> (i & 7)));
	//   11   15:aload           4
	//   12   17:iload_2         
	//   13   18:aload           4
	//   14   20:iload_2         
	//   15   21:baload          
	//   16   22:sipush          128
	//   17   25:iload_1         
	//   18   26:bipush          7
	//   19   28:iand            
	//   20   29:ishr            
	//   21   30:int2byte        
	//   22   31:ior             
	//   23   32:int2byte        
	//   24   33:bastore         
	//   25   34:return          
	}

	public Image createImage()
		throws BadElementException
	{
		if(image == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #115 <Field byte[] image>
	//*   2    4:ifnonnull       9
		{
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		} else
		{
			byte abyte0[] = CCITTG4Encoder.compress(image, width + ws * 2, height + ws * 2);
	//    5    9:aload_0         
	//    6   10:getfield        #115 <Field byte[] image>
	//    7   13:aload_0         
	//    8   14:getfield        #164 <Field int width>
	//    9   17:aload_0         
	//   10   18:getfield        #113 <Field int ws>
	//   11   21:iconst_2        
	//   12   22:imul            
	//   13   23:iadd            
	//   14   24:aload_0         
	//   15   25:getfield        #165 <Field int height>
	//   16   28:aload_0         
	//   17   29:getfield        #113 <Field int ws>
	//   18   32:iconst_2        
	//   19   33:imul            
	//   20   34:iadd            
	//   21   35:invokestatic    #171 <Method byte[] CCITTG4Encoder.compress(byte[], int, int)>
	//   22   38:astore_1        
			return Image.getInstance(width + ws * 2, height + ws * 2, false, 256, 0, abyte0, ((int []) (null)));
	//   23   39:aload_0         
	//   24   40:getfield        #164 <Field int width>
	//   25   43:aload_0         
	//   26   44:getfield        #113 <Field int ws>
	//   27   47:iconst_2        
	//   28   48:imul            
	//   29   49:iadd            
	//   30   50:aload_0         
	//   31   51:getfield        #165 <Field int height>
	//   32   54:aload_0         
	//   33   55:getfield        #113 <Field int ws>
	//   34   58:iconst_2        
	//   35   59:imul            
	//   36   60:iadd            
	//   37   61:iconst_0        
	//   38   62:sipush          256
	//   39   65:iconst_0        
	//   40   66:aload_1         
	//   41   67:aconst_null     
	//   42   68:invokestatic    #177 <Method Image Image.getInstance(int, int, boolean, int, int, byte[], int[])>
	//   43   71:areturn         
		}
	}

	public int generate(String s)
		throws UnsupportedEncodingException
	{
		s = ((String) (s.getBytes("iso-8859-1")));
	//    0    0:aload_1         
	//    1    1:ldc1            #184 <String "iso-8859-1">
	//    2    3:invokevirtual   #188 <Method byte[] String.getBytes(String)>
	//    3    6:astore_1        
		return generate(((byte []) (s)), 0, s.length);
	//    4    7:aload_0         
	//    5    8:aload_1         
	//    6    9:iconst_0        
	//    7   10:aload_1         
	//    8   11:arraylength     
	//    9   12:invokevirtual   #190 <Method int generate(byte[], int, int)>
	//   10   15:ireturn         
	}

	public int generate(byte abyte0[], int i, int j)
	{
		int i1;
		byte abyte1[];
		abyte1 = new byte[2500];
	//    0    0:sipush          2500
	//    1    3:newarray        byte[]
	//    2    5:astore          7
		extOut = 0;
	//    3    7:aload_0         
	//    4    8:iconst_0        
	//    5    9:putfield        #156 <Field int extOut>
		i1 = processExtensions(abyte0, i, j, abyte1);
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:iload_2         
	//    9   15:iload_3         
	//   10   16:aload           7
	//   11   18:invokespecial   #192 <Method int processExtensions(byte[], int, int, byte[])>
	//   12   21:istore          5
		if(i1 < 0)
	//*  13   23:iload           5
	//*  14   25:ifge            30
			return 5;
	//   15   28:iconst_5        
	//   16   29:ireturn         
		if(height != 0 && width != 0)
			break MISSING_BLOCK_LABEL_192;
	//   17   30:aload_0         
	//   18   31:getfield        #165 <Field int height>
	//   19   34:ifeq            44
	//   20   37:aload_0         
	//   21   38:getfield        #164 <Field int width>
	//   22   41:ifne            192
		DmParams dmparams = dmSizes[dmSizes.length - 1];
	//   23   44:getstatic       #63  <Field BarcodeDatamatrix$DmParams[] dmSizes>
	//   24   47:getstatic       #63  <Field BarcodeDatamatrix$DmParams[] dmSizes>
	//   25   50:arraylength     
	//   26   51:iconst_1        
	//   27   52:isub            
	//   28   53:aaload          
	//   29   54:astore          6
		i = getEncodation(abyte0, i + extOut, j - extOut, abyte1, i1, dmparams.dataSize - i1, options, false);
	//   30   56:aload_1         
	//   31   57:iload_2         
	//   32   58:aload_0         
	//   33   59:getfield        #156 <Field int extOut>
	//   34   62:iadd            
	//   35   63:iload_3         
	//   36   64:aload_0         
	//   37   65:getfield        #156 <Field int extOut>
	//   38   68:isub            
	//   39   69:aload           7
	//   40   71:iload           5
	//   41   73:aload           6
	//   42   75:getfield        #95  <Field int BarcodeDatamatrix$DmParams.dataSize>
	//   43   78:iload           5
	//   44   80:isub            
	//   45   81:aload_0         
	//   46   82:getfield        #154 <Field int options>
	//   47   85:iconst_0        
	//   48   86:invokestatic    #194 <Method int getEncodation(byte[], int, int, byte[], int, int, int, boolean)>
	//   49   89:istore_2        
		if(i < 0)
	//*  50   90:iload_2         
	//*  51   91:ifge            96
			return 1;
	//   52   94:iconst_1        
	//   53   95:ireturn         
		j = i + i1;
	//   54   96:iload_2         
	//   55   97:iload           5
	//   56   99:iadd            
	//   57  100:istore_3        
		i = 0;
	//   58  101:iconst_0        
	//   59  102:istore_2        
_L3:
		if(i < dmSizes.length && (dmSizes[i].dataSize < j || forceSquareSize && dmSizes[i].width != dmSizes[i].height)) goto _L2; else goto _L1
	//   60  103:iload_2         
	//   61  104:getstatic       #63  <Field BarcodeDatamatrix$DmParams[] dmSizes>
	//   62  107:arraylength     
	//   63  108:icmpge          149
	//   64  111:getstatic       #63  <Field BarcodeDatamatrix$DmParams[] dmSizes>
	//   65  114:iload_2         
	//   66  115:aaload          
	//   67  116:getfield        #95  <Field int BarcodeDatamatrix$DmParams.dataSize>
	//   68  119:iload_3         
	//   69  120:icmplt          185
	//   70  123:aload_0         
	//   71  124:getfield        #68  <Field boolean forceSquareSize>
	//   72  127:ifeq            149
	//   73  130:getstatic       #63  <Field BarcodeDatamatrix$DmParams[] dmSizes>
	//   74  133:iload_2         
	//   75  134:aaload          
	//   76  135:getfield        #111 <Field int BarcodeDatamatrix$DmParams.width>
	//   77  138:getstatic       #63  <Field BarcodeDatamatrix$DmParams[] dmSizes>
	//   78  141:iload_2         
	//   79  142:aaload          
	//   80  143:getfield        #123 <Field int BarcodeDatamatrix$DmParams.height>
	//   81  146:icmpne          185
_L1:
		abyte0 = ((byte []) (dmSizes[i]));
	//   82  149:getstatic       #63  <Field BarcodeDatamatrix$DmParams[] dmSizes>
	//   83  152:iload_2         
	//   84  153:aaload          
	//   85  154:astore_1        
		height = ((DmParams) (abyte0)).height;
	//   86  155:aload_0         
	//   87  156:aload_1         
	//   88  157:getfield        #123 <Field int BarcodeDatamatrix$DmParams.height>
	//   89  160:putfield        #165 <Field int height>
		width = ((DmParams) (abyte0)).width;
	//   90  163:aload_0         
	//   91  164:aload_1         
	//   92  165:getfield        #111 <Field int BarcodeDatamatrix$DmParams.width>
	//   93  168:putfield        #164 <Field int width>
		i = j;
	//   94  171:iload_3         
	//   95  172:istore_2        
_L4:
		if((options & 0x40) != 0)
	//*  96  173:aload_0         
	//*  97  174:getfield        #154 <Field int options>
	//*  98  177:bipush          64
	//*  99  179:iand            
	//* 100  180:ifeq            315
		{
			return 0;
	//  101  183:iconst_0        
	//  102  184:ireturn         
		} else
	//* 103  185:iload_2         
	//* 104  186:iconst_1        
	//* 105  187:iadd            
	//* 106  188:istore_2        
	//* 107  189:goto            103
	//* 108  192:iconst_0        
	//* 109  193:istore          4
	//* 110  195:iload           4
	//* 111  197:getstatic       #63  <Field BarcodeDatamatrix$DmParams[] dmSizes>
	//* 112  200:arraylength     
	//* 113  201:icmpge          236
	//* 114  204:aload_0         
	//* 115  205:getfield        #165 <Field int height>
	//* 116  208:getstatic       #63  <Field BarcodeDatamatrix$DmParams[] dmSizes>
	//* 117  211:iload           4
	//* 118  213:aaload          
	//* 119  214:getfield        #123 <Field int BarcodeDatamatrix$DmParams.height>
	//* 120  217:icmpne          247
	//* 121  220:aload_0         
	//* 122  221:getfield        #164 <Field int width>
	//* 123  224:getstatic       #63  <Field BarcodeDatamatrix$DmParams[] dmSizes>
	//* 124  227:iload           4
	//* 125  229:aaload          
	//* 126  230:getfield        #111 <Field int BarcodeDatamatrix$DmParams.width>
	//* 127  233:icmpne          247
	//* 128  236:iload           4
	//* 129  238:getstatic       #63  <Field BarcodeDatamatrix$DmParams[] dmSizes>
	//* 130  241:arraylength     
	//* 131  242:icmpne          256
	//* 132  245:iconst_3        
	//* 133  246:ireturn         
	//* 134  247:iload           4
	//* 135  249:iconst_1        
	//* 136  250:iadd            
	//* 137  251:istore          4
	//* 138  253:goto            195
	//* 139  256:getstatic       #63  <Field BarcodeDatamatrix$DmParams[] dmSizes>
	//* 140  259:iload           4
	//* 141  261:aaload          
	//* 142  262:astore          6
	//* 143  264:aload_1         
	//* 144  265:iload_2         
	//* 145  266:aload_0         
	//* 146  267:getfield        #156 <Field int extOut>
	//* 147  270:iadd            
	//* 148  271:iload_3         
	//* 149  272:aload_0         
	//* 150  273:getfield        #156 <Field int extOut>
	//* 151  276:isub            
	//* 152  277:aload           7
	//* 153  279:iload           5
	//* 154  281:aload           6
	//* 155  283:getfield        #95  <Field int BarcodeDatamatrix$DmParams.dataSize>
	//* 156  286:iload           5
	//* 157  288:isub            
	//* 158  289:aload_0         
	//* 159  290:getfield        #154 <Field int options>
	//* 160  293:iconst_1        
	//* 161  294:invokestatic    #194 <Method int getEncodation(byte[], int, int, byte[], int, int, int, boolean)>
	//* 162  297:istore_2        
	//* 163  298:iload_2         
	//* 164  299:ifge            304
	//* 165  302:iconst_1        
	//* 166  303:ireturn         
	//* 167  304:iload_2         
	//* 168  305:iload           5
	//* 169  307:iadd            
	//* 170  308:istore_2        
	//* 171  309:aload           6
	//* 172  311:astore_1        
	//* 173  312:goto            173
		{
			image = new byte[((((DmParams) (abyte0)).width + ws * 2 + 7) / 8) * (((DmParams) (abyte0)).height + ws * 2)];
	//  174  315:aload_0         
	//  175  316:aload_1         
	//  176  317:getfield        #111 <Field int BarcodeDatamatrix$DmParams.width>
	//  177  320:aload_0         
	//  178  321:getfield        #113 <Field int ws>
	//  179  324:iconst_2        
	//  180  325:imul            
	//  181  326:iadd            
	//  182  327:bipush          7
	//  183  329:iadd            
	//  184  330:bipush          8
	//  185  332:idiv            
	//  186  333:aload_1         
	//  187  334:getfield        #123 <Field int BarcodeDatamatrix$DmParams.height>
	//  188  337:aload_0         
	//  189  338:getfield        #113 <Field int ws>
	//  190  341:iconst_2        
	//  191  342:imul            
	//  192  343:iadd            
	//  193  344:imul            
	//  194  345:newarray        byte[]
	//  195  347:putfield        #115 <Field byte[] image>
			makePadding(abyte1, i, ((DmParams) (abyte0)).dataSize - i);
	//  196  350:aload           7
	//  197  352:iload_2         
	//  198  353:aload_1         
	//  199  354:getfield        #95  <Field int BarcodeDatamatrix$DmParams.dataSize>
	//  200  357:iload_2         
	//  201  358:isub            
	//  202  359:invokestatic    #196 <Method void makePadding(byte[], int, int)>
			place = Placement.doPlacement(((DmParams) (abyte0)).height - (((DmParams) (abyte0)).height / ((DmParams) (abyte0)).heightSection) * 2, ((DmParams) (abyte0)).width - (((DmParams) (abyte0)).width / ((DmParams) (abyte0)).widthSection) * 2);
	//  203  362:aload_0         
	//  204  363:aload_1         
	//  205  364:getfield        #123 <Field int BarcodeDatamatrix$DmParams.height>
	//  206  367:aload_1         
	//  207  368:getfield        #123 <Field int BarcodeDatamatrix$DmParams.height>
	//  208  371:aload_1         
	//  209  372:getfield        #130 <Field int BarcodeDatamatrix$DmParams.heightSection>
	//  210  375:idiv            
	//  211  376:iconst_2        
	//  212  377:imul            
	//  213  378:isub            
	//  214  379:aload_1         
	//  215  380:getfield        #111 <Field int BarcodeDatamatrix$DmParams.width>
	//  216  383:aload_1         
	//  217  384:getfield        #111 <Field int BarcodeDatamatrix$DmParams.width>
	//  218  387:aload_1         
	//  219  388:getfield        #133 <Field int BarcodeDatamatrix$DmParams.widthSection>
	//  220  391:idiv            
	//  221  392:iconst_2        
	//  222  393:imul            
	//  223  394:isub            
	//  224  395:invokestatic    #200 <Method short[] BarcodeDatamatrix$Placement.doPlacement(int, int)>
	//  225  398:putfield        #135 <Field short[] place>
			i = ((DmParams) (abyte0)).dataSize;
	//  226  401:aload_1         
	//  227  402:getfield        #95  <Field int BarcodeDatamatrix$DmParams.dataSize>
	//  228  405:istore_2        
			j = (((DmParams) (abyte0)).dataSize + 2) / ((DmParams) (abyte0)).dataBlock;
	//  229  406:aload_1         
	//  230  407:getfield        #95  <Field int BarcodeDatamatrix$DmParams.dataSize>
	//  231  410:iconst_2        
	//  232  411:iadd            
	//  233  412:aload_1         
	//  234  413:getfield        #203 <Field int BarcodeDatamatrix$DmParams.dataBlock>
	//  235  416:idiv            
	//  236  417:istore_3        
			int l = ((DmParams) (abyte0)).errorBlock;
	//  237  418:aload_1         
	//  238  419:getfield        #206 <Field int BarcodeDatamatrix$DmParams.errorBlock>
	//  239  422:istore          4
			ReedSolomon.generateECC(abyte1, ((DmParams) (abyte0)).dataSize, ((DmParams) (abyte0)).dataBlock, ((DmParams) (abyte0)).errorBlock);
	//  240  424:aload           7
	//  241  426:aload_1         
	//  242  427:getfield        #95  <Field int BarcodeDatamatrix$DmParams.dataSize>
	//  243  430:aload_1         
	//  244  431:getfield        #203 <Field int BarcodeDatamatrix$DmParams.dataBlock>
	//  245  434:aload_1         
	//  246  435:getfield        #206 <Field int BarcodeDatamatrix$DmParams.errorBlock>
	//  247  438:invokestatic    #210 <Method void BarcodeDatamatrix$ReedSolomon.generateECC(byte[], int, int, int)>
			draw(abyte1, i + j * l, ((DmParams) (abyte0)));
	//  248  441:aload_0         
	//  249  442:aload           7
	//  250  444:iload_2         
	//  251  445:iload_3         
	//  252  446:iload           4
	//  253  448:imul            
	//  254  449:iadd            
	//  255  450:aload_1         
	//  256  451:invokespecial   #212 <Method void draw(byte[], int, BarcodeDatamatrix$DmParams)>
			return 0;
	//  257  454:iconst_0        
	//  258  455:ireturn         
		}
_L2:
		i++;
		  goto _L3
		int k = 0;
		do
		{
			if(k >= dmSizes.length || height == dmSizes[k].height && width == dmSizes[k].width)
			{
				if(k == dmSizes.length)
					return 3;
				break;
			}
			k++;
		} while(true);
		DmParams dmparams1 = dmSizes[k];
		i = getEncodation(abyte0, i + extOut, j - extOut, abyte1, i1, dmparams1.dataSize - i1, options, true);
		if(i < 0)
			return 1;
		i += i1;
		abyte0 = ((byte []) (dmparams1));
		  goto _L4
	}

	public int getHeight()
	{
		return height;
	//    0    0:aload_0         
	//    1    1:getfield        #165 <Field int height>
	//    2    4:ireturn         
	}

	public byte[] getImage()
	{
		return image;
	//    0    0:aload_0         
	//    1    1:getfield        #115 <Field byte[] image>
	//    2    4:areturn         
	}

	public int getOptions()
	{
		return options;
	//    0    0:aload_0         
	//    1    1:getfield        #154 <Field int options>
	//    2    4:ireturn         
	}

	public int getWidth()
	{
		return width;
	//    0    0:aload_0         
	//    1    1:getfield        #164 <Field int width>
	//    2    4:ireturn         
	}

	public int getWs()
	{
		return ws;
	//    0    0:aload_0         
	//    1    1:getfield        #113 <Field int ws>
	//    2    4:ireturn         
	}

	public void placeBarcode(PdfContentByte pdfcontentbyte, BaseColor basecolor, float f, float f1)
	{
		int k = width + ws * 2;
	//    0    0:aload_0         
	//    1    1:getfield        #164 <Field int width>
	//    2    4:aload_0         
	//    3    5:getfield        #113 <Field int ws>
	//    4    8:iconst_2        
	//    5    9:imul            
	//    6   10:iadd            
	//    7   11:istore          7
		int l = height + ws * 2;
	//    8   13:aload_0         
	//    9   14:getfield        #165 <Field int height>
	//   10   17:aload_0         
	//   11   18:getfield        #113 <Field int ws>
	//   12   21:iconst_2        
	//   13   22:imul            
	//   14   23:iadd            
	//   15   24:istore          8
		int i1 = (k + 7) / 8;
	//   16   26:iload           7
	//   17   28:bipush          7
	//   18   30:iadd            
	//   19   31:bipush          8
	//   20   33:idiv            
	//   21   34:istore          9
		pdfcontentbyte.setColorFill(basecolor);
	//   22   36:aload_1         
	//   23   37:aload_2         
	//   24   38:invokevirtual   #227 <Method void PdfContentByte.setColorFill(BaseColor)>
		for(int i = 0; i < l; i++)
	//*  25   41:iconst_0        
	//*  26   42:istore          5
	//*  27   44:iload           5
	//*  28   46:iload           8
	//*  29   48:icmpge          135
		{
			for(int j = 0; j < k; j++)
	//*  30   51:iconst_0        
	//*  31   52:istore          6
	//*  32   54:iload           6
	//*  33   56:iload           7
	//*  34   58:icmpge          126
				if(((image[j / 8 + i * i1] & 0xff) << j % 8 & 0x80) != 0)
	//*  35   61:aload_0         
	//*  36   62:getfield        #115 <Field byte[] image>
	//*  37   65:iload           6
	//*  38   67:bipush          8
	//*  39   69:idiv            
	//*  40   70:iload           5
	//*  41   72:iload           9
	//*  42   74:imul            
	//*  43   75:iadd            
	//*  44   76:baload          
	//*  45   77:sipush          255
	//*  46   80:iand            
	//*  47   81:iload           6
	//*  48   83:bipush          8
	//*  49   85:irem            
	//*  50   86:ishl            
	//*  51   87:sipush          128
	//*  52   90:iand            
	//*  53   91:ifeq            117
					pdfcontentbyte.rectangle((float)j * f1, (float)(l - i - 1) * f, f1, f);
	//   54   94:aload_1         
	//   55   95:iload           6
	//   56   97:i2f             
	//   57   98:fload           4
	//   58  100:fmul            
	//   59  101:iload           8
	//   60  103:iload           5
	//   61  105:isub            
	//   62  106:iconst_1        
	//   63  107:isub            
	//   64  108:i2f             
	//   65  109:fload_3         
	//   66  110:fmul            
	//   67  111:fload           4
	//   68  113:fload_3         
	//   69  114:invokevirtual   #231 <Method void PdfContentByte.rectangle(float, float, float, float)>

	//   70  117:iload           6
	//   71  119:iconst_1        
	//   72  120:iadd            
	//   73  121:istore          6
		}

	//   74  123:goto            54
	//   75  126:iload           5
	//   76  128:iconst_1        
	//   77  129:iadd            
	//   78  130:istore          5
	//*  79  132:goto            44
		pdfcontentbyte.fill();
	//   80  135:aload_1         
	//   81  136:invokevirtual   #233 <Method void PdfContentByte.fill()>
	//   82  139:return          
	}

	public void setForceSquareSize(boolean flag)
	{
		forceSquareSize = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #68  <Field boolean forceSquareSize>
	//    3    5:return          
	}

	public void setHeight(int i)
	{
		height = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #165 <Field int height>
	//    3    5:return          
	}

	public void setOptions(int i)
	{
		options = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #154 <Field int options>
	//    3    5:return          
	}

	public void setWidth(int i)
	{
		width = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #164 <Field int width>
	//    3    5:return          
	}

	public void setWs(int i)
	{
		ws = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #113 <Field int ws>
	//    3    5:return          
	}

	public static final int DM_ASCII = 1;
	public static final int DM_AUTO = 0;
	public static final int DM_B256 = 4;
	public static final int DM_C40 = 2;
	public static final int DM_EDIFACT = 6;
	public static final int DM_ERROR_EXTENSION = 5;
	public static final int DM_ERROR_INVALID_SQUARE = 3;
	public static final int DM_ERROR_TEXT_TOO_BIG = 1;
	public static final int DM_EXTENSION = 32;
	public static final int DM_NO_ERROR = 0;
	public static final int DM_RAW = 7;
	public static final int DM_TEST = 64;
	public static final int DM_TEXT = 3;
	public static final int DM_X21 = 5;
	private static final DmParams dmSizes[] = {
		new DmParams(10, 10, 10, 10, 3, 3, 5), new DmParams(12, 12, 12, 12, 5, 5, 7), new DmParams(8, 18, 8, 18, 5, 5, 7), new DmParams(14, 14, 14, 14, 8, 8, 10), new DmParams(8, 32, 8, 16, 10, 10, 11), new DmParams(16, 16, 16, 16, 12, 12, 12), new DmParams(12, 26, 12, 26, 16, 16, 14), new DmParams(18, 18, 18, 18, 18, 18, 14), new DmParams(20, 20, 20, 20, 22, 22, 18), new DmParams(12, 36, 12, 18, 22, 22, 18), 
		new DmParams(22, 22, 22, 22, 30, 30, 20), new DmParams(16, 36, 16, 18, 32, 32, 24), new DmParams(24, 24, 24, 24, 36, 36, 24), new DmParams(26, 26, 26, 26, 44, 44, 28), new DmParams(16, 48, 16, 24, 49, 49, 28), new DmParams(32, 32, 16, 16, 62, 62, 36), new DmParams(36, 36, 18, 18, 86, 86, 42), new DmParams(40, 40, 20, 20, 114, 114, 48), new DmParams(44, 44, 22, 22, 144, 144, 56), new DmParams(48, 48, 24, 24, 174, 174, 68), 
		new DmParams(52, 52, 26, 26, 204, 102, 42), new DmParams(64, 64, 16, 16, 280, 140, 56), new DmParams(72, 72, 18, 18, 368, 92, 36), new DmParams(80, 80, 20, 20, 456, 114, 48), new DmParams(88, 88, 22, 22, 576, 144, 56), new DmParams(96, 96, 24, 24, 696, 174, 68), new DmParams(104, 104, 26, 26, 816, 136, 56), new DmParams(120, 120, 20, 20, 1050, 175, 68), new DmParams(132, 132, 22, 22, 1304, 163, 62), new DmParams(144, 144, 24, 24, 1558, 156, 62)
	};
	private static final String x12 = "\r*> 0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	private int extOut;
	private boolean forceSquareSize;
	private int height;
	private byte image[];
	private int options;
	private short place[];
	private int width;
	private int ws;

	static 
	{
	//    0    0:bipush          30
	//    1    2:anewarray       DmParams[]
	//    2    5:dup             
	//    3    6:iconst_0        
	//    4    7:new             #6   <Class BarcodeDatamatrix$DmParams>
	//    5   10:dup             
	//    6   11:bipush          10
	//    7   13:bipush          10
	//    8   15:bipush          10
	//    9   17:bipush          10
	//   10   19:iconst_3        
	//   11   20:iconst_3        
	//   12   21:iconst_5        
	//   13   22:invokespecial   #61  <Method void BarcodeDatamatrix$DmParams(int, int, int, int, int, int, int)>
	//   14   25:aastore         
	//   15   26:dup             
	//   16   27:iconst_1        
	//   17   28:new             #6   <Class BarcodeDatamatrix$DmParams>
	//   18   31:dup             
	//   19   32:bipush          12
	//   20   34:bipush          12
	//   21   36:bipush          12
	//   22   38:bipush          12
	//   23   40:iconst_5        
	//   24   41:iconst_5        
	//   25   42:bipush          7
	//   26   44:invokespecial   #61  <Method void BarcodeDatamatrix$DmParams(int, int, int, int, int, int, int)>
	//   27   47:aastore         
	//   28   48:dup             
	//   29   49:iconst_2        
	//   30   50:new             #6   <Class BarcodeDatamatrix$DmParams>
	//   31   53:dup             
	//   32   54:bipush          8
	//   33   56:bipush          18
	//   34   58:bipush          8
	//   35   60:bipush          18
	//   36   62:iconst_5        
	//   37   63:iconst_5        
	//   38   64:bipush          7
	//   39   66:invokespecial   #61  <Method void BarcodeDatamatrix$DmParams(int, int, int, int, int, int, int)>
	//   40   69:aastore         
	//   41   70:dup             
	//   42   71:iconst_3        
	//   43   72:new             #6   <Class BarcodeDatamatrix$DmParams>
	//   44   75:dup             
	//   45   76:bipush          14
	//   46   78:bipush          14
	//   47   80:bipush          14
	//   48   82:bipush          14
	//   49   84:bipush          8
	//   50   86:bipush          8
	//   51   88:bipush          10
	//   52   90:invokespecial   #61  <Method void BarcodeDatamatrix$DmParams(int, int, int, int, int, int, int)>
	//   53   93:aastore         
	//   54   94:dup             
	//   55   95:iconst_4        
	//   56   96:new             #6   <Class BarcodeDatamatrix$DmParams>
	//   57   99:dup             
	//   58  100:bipush          8
	//   59  102:bipush          32
	//   60  104:bipush          8
	//   61  106:bipush          16
	//   62  108:bipush          10
	//   63  110:bipush          10
	//   64  112:bipush          11
	//   65  114:invokespecial   #61  <Method void BarcodeDatamatrix$DmParams(int, int, int, int, int, int, int)>
	//   66  117:aastore         
	//   67  118:dup             
	//   68  119:iconst_5        
	//   69  120:new             #6   <Class BarcodeDatamatrix$DmParams>
	//   70  123:dup             
	//   71  124:bipush          16
	//   72  126:bipush          16
	//   73  128:bipush          16
	//   74  130:bipush          16
	//   75  132:bipush          12
	//   76  134:bipush          12
	//   77  136:bipush          12
	//   78  138:invokespecial   #61  <Method void BarcodeDatamatrix$DmParams(int, int, int, int, int, int, int)>
	//   79  141:aastore         
	//   80  142:dup             
	//   81  143:bipush          6
	//   82  145:new             #6   <Class BarcodeDatamatrix$DmParams>
	//   83  148:dup             
	//   84  149:bipush          12
	//   85  151:bipush          26
	//   86  153:bipush          12
	//   87  155:bipush          26
	//   88  157:bipush          16
	//   89  159:bipush          16
	//   90  161:bipush          14
	//   91  163:invokespecial   #61  <Method void BarcodeDatamatrix$DmParams(int, int, int, int, int, int, int)>
	//   92  166:aastore         
	//   93  167:dup             
	//   94  168:bipush          7
	//   95  170:new             #6   <Class BarcodeDatamatrix$DmParams>
	//   96  173:dup             
	//   97  174:bipush          18
	//   98  176:bipush          18
	//   99  178:bipush          18
	//  100  180:bipush          18
	//  101  182:bipush          18
	//  102  184:bipush          18
	//  103  186:bipush          14
	//  104  188:invokespecial   #61  <Method void BarcodeDatamatrix$DmParams(int, int, int, int, int, int, int)>
	//  105  191:aastore         
	//  106  192:dup             
	//  107  193:bipush          8
	//  108  195:new             #6   <Class BarcodeDatamatrix$DmParams>
	//  109  198:dup             
	//  110  199:bipush          20
	//  111  201:bipush          20
	//  112  203:bipush          20
	//  113  205:bipush          20
	//  114  207:bipush          22
	//  115  209:bipush          22
	//  116  211:bipush          18
	//  117  213:invokespecial   #61  <Method void BarcodeDatamatrix$DmParams(int, int, int, int, int, int, int)>
	//  118  216:aastore         
	//  119  217:dup             
	//  120  218:bipush          9
	//  121  220:new             #6   <Class BarcodeDatamatrix$DmParams>
	//  122  223:dup             
	//  123  224:bipush          12
	//  124  226:bipush          36
	//  125  228:bipush          12
	//  126  230:bipush          18
	//  127  232:bipush          22
	//  128  234:bipush          22
	//  129  236:bipush          18
	//  130  238:invokespecial   #61  <Method void BarcodeDatamatrix$DmParams(int, int, int, int, int, int, int)>
	//  131  241:aastore         
	//  132  242:dup             
	//  133  243:bipush          10
	//  134  245:new             #6   <Class BarcodeDatamatrix$DmParams>
	//  135  248:dup             
	//  136  249:bipush          22
	//  137  251:bipush          22
	//  138  253:bipush          22
	//  139  255:bipush          22
	//  140  257:bipush          30
	//  141  259:bipush          30
	//  142  261:bipush          20
	//  143  263:invokespecial   #61  <Method void BarcodeDatamatrix$DmParams(int, int, int, int, int, int, int)>
	//  144  266:aastore         
	//  145  267:dup             
	//  146  268:bipush          11
	//  147  270:new             #6   <Class BarcodeDatamatrix$DmParams>
	//  148  273:dup             
	//  149  274:bipush          16
	//  150  276:bipush          36
	//  151  278:bipush          16
	//  152  280:bipush          18
	//  153  282:bipush          32
	//  154  284:bipush          32
	//  155  286:bipush          24
	//  156  288:invokespecial   #61  <Method void BarcodeDatamatrix$DmParams(int, int, int, int, int, int, int)>
	//  157  291:aastore         
	//  158  292:dup             
	//  159  293:bipush          12
	//  160  295:new             #6   <Class BarcodeDatamatrix$DmParams>
	//  161  298:dup             
	//  162  299:bipush          24
	//  163  301:bipush          24
	//  164  303:bipush          24
	//  165  305:bipush          24
	//  166  307:bipush          36
	//  167  309:bipush          36
	//  168  311:bipush          24
	//  169  313:invokespecial   #61  <Method void BarcodeDatamatrix$DmParams(int, int, int, int, int, int, int)>
	//  170  316:aastore         
	//  171  317:dup             
	//  172  318:bipush          13
	//  173  320:new             #6   <Class BarcodeDatamatrix$DmParams>
	//  174  323:dup             
	//  175  324:bipush          26
	//  176  326:bipush          26
	//  177  328:bipush          26
	//  178  330:bipush          26
	//  179  332:bipush          44
	//  180  334:bipush          44
	//  181  336:bipush          28
	//  182  338:invokespecial   #61  <Method void BarcodeDatamatrix$DmParams(int, int, int, int, int, int, int)>
	//  183  341:aastore         
	//  184  342:dup             
	//  185  343:bipush          14
	//  186  345:new             #6   <Class BarcodeDatamatrix$DmParams>
	//  187  348:dup             
	//  188  349:bipush          16
	//  189  351:bipush          48
	//  190  353:bipush          16
	//  191  355:bipush          24
	//  192  357:bipush          49
	//  193  359:bipush          49
	//  194  361:bipush          28
	//  195  363:invokespecial   #61  <Method void BarcodeDatamatrix$DmParams(int, int, int, int, int, int, int)>
	//  196  366:aastore         
	//  197  367:dup             
	//  198  368:bipush          15
	//  199  370:new             #6   <Class BarcodeDatamatrix$DmParams>
	//  200  373:dup             
	//  201  374:bipush          32
	//  202  376:bipush          32
	//  203  378:bipush          16
	//  204  380:bipush          16
	//  205  382:bipush          62
	//  206  384:bipush          62
	//  207  386:bipush          36
	//  208  388:invokespecial   #61  <Method void BarcodeDatamatrix$DmParams(int, int, int, int, int, int, int)>
	//  209  391:aastore         
	//  210  392:dup             
	//  211  393:bipush          16
	//  212  395:new             #6   <Class BarcodeDatamatrix$DmParams>
	//  213  398:dup             
	//  214  399:bipush          36
	//  215  401:bipush          36
	//  216  403:bipush          18
	//  217  405:bipush          18
	//  218  407:bipush          86
	//  219  409:bipush          86
	//  220  411:bipush          42
	//  221  413:invokespecial   #61  <Method void BarcodeDatamatrix$DmParams(int, int, int, int, int, int, int)>
	//  222  416:aastore         
	//  223  417:dup             
	//  224  418:bipush          17
	//  225  420:new             #6   <Class BarcodeDatamatrix$DmParams>
	//  226  423:dup             
	//  227  424:bipush          40
	//  228  426:bipush          40
	//  229  428:bipush          20
	//  230  430:bipush          20
	//  231  432:bipush          114
	//  232  434:bipush          114
	//  233  436:bipush          48
	//  234  438:invokespecial   #61  <Method void BarcodeDatamatrix$DmParams(int, int, int, int, int, int, int)>
	//  235  441:aastore         
	//  236  442:dup             
	//  237  443:bipush          18
	//  238  445:new             #6   <Class BarcodeDatamatrix$DmParams>
	//  239  448:dup             
	//  240  449:bipush          44
	//  241  451:bipush          44
	//  242  453:bipush          22
	//  243  455:bipush          22
	//  244  457:sipush          144
	//  245  460:sipush          144
	//  246  463:bipush          56
	//  247  465:invokespecial   #61  <Method void BarcodeDatamatrix$DmParams(int, int, int, int, int, int, int)>
	//  248  468:aastore         
	//  249  469:dup             
	//  250  470:bipush          19
	//  251  472:new             #6   <Class BarcodeDatamatrix$DmParams>
	//  252  475:dup             
	//  253  476:bipush          48
	//  254  478:bipush          48
	//  255  480:bipush          24
	//  256  482:bipush          24
	//  257  484:sipush          174
	//  258  487:sipush          174
	//  259  490:bipush          68
	//  260  492:invokespecial   #61  <Method void BarcodeDatamatrix$DmParams(int, int, int, int, int, int, int)>
	//  261  495:aastore         
	//  262  496:dup             
	//  263  497:bipush          20
	//  264  499:new             #6   <Class BarcodeDatamatrix$DmParams>
	//  265  502:dup             
	//  266  503:bipush          52
	//  267  505:bipush          52
	//  268  507:bipush          26
	//  269  509:bipush          26
	//  270  511:sipush          204
	//  271  514:bipush          102
	//  272  516:bipush          42
	//  273  518:invokespecial   #61  <Method void BarcodeDatamatrix$DmParams(int, int, int, int, int, int, int)>
	//  274  521:aastore         
	//  275  522:dup             
	//  276  523:bipush          21
	//  277  525:new             #6   <Class BarcodeDatamatrix$DmParams>
	//  278  528:dup             
	//  279  529:bipush          64
	//  280  531:bipush          64
	//  281  533:bipush          16
	//  282  535:bipush          16
	//  283  537:sipush          280
	//  284  540:sipush          140
	//  285  543:bipush          56
	//  286  545:invokespecial   #61  <Method void BarcodeDatamatrix$DmParams(int, int, int, int, int, int, int)>
	//  287  548:aastore         
	//  288  549:dup             
	//  289  550:bipush          22
	//  290  552:new             #6   <Class BarcodeDatamatrix$DmParams>
	//  291  555:dup             
	//  292  556:bipush          72
	//  293  558:bipush          72
	//  294  560:bipush          18
	//  295  562:bipush          18
	//  296  564:sipush          368
	//  297  567:bipush          92
	//  298  569:bipush          36
	//  299  571:invokespecial   #61  <Method void BarcodeDatamatrix$DmParams(int, int, int, int, int, int, int)>
	//  300  574:aastore         
	//  301  575:dup             
	//  302  576:bipush          23
	//  303  578:new             #6   <Class BarcodeDatamatrix$DmParams>
	//  304  581:dup             
	//  305  582:bipush          80
	//  306  584:bipush          80
	//  307  586:bipush          20
	//  308  588:bipush          20
	//  309  590:sipush          456
	//  310  593:bipush          114
	//  311  595:bipush          48
	//  312  597:invokespecial   #61  <Method void BarcodeDatamatrix$DmParams(int, int, int, int, int, int, int)>
	//  313  600:aastore         
	//  314  601:dup             
	//  315  602:bipush          24
	//  316  604:new             #6   <Class BarcodeDatamatrix$DmParams>
	//  317  607:dup             
	//  318  608:bipush          88
	//  319  610:bipush          88
	//  320  612:bipush          22
	//  321  614:bipush          22
	//  322  616:sipush          576
	//  323  619:sipush          144
	//  324  622:bipush          56
	//  325  624:invokespecial   #61  <Method void BarcodeDatamatrix$DmParams(int, int, int, int, int, int, int)>
	//  326  627:aastore         
	//  327  628:dup             
	//  328  629:bipush          25
	//  329  631:new             #6   <Class BarcodeDatamatrix$DmParams>
	//  330  634:dup             
	//  331  635:bipush          96
	//  332  637:bipush          96
	//  333  639:bipush          24
	//  334  641:bipush          24
	//  335  643:sipush          696
	//  336  646:sipush          174
	//  337  649:bipush          68
	//  338  651:invokespecial   #61  <Method void BarcodeDatamatrix$DmParams(int, int, int, int, int, int, int)>
	//  339  654:aastore         
	//  340  655:dup             
	//  341  656:bipush          26
	//  342  658:new             #6   <Class BarcodeDatamatrix$DmParams>
	//  343  661:dup             
	//  344  662:bipush          104
	//  345  664:bipush          104
	//  346  666:bipush          26
	//  347  668:bipush          26
	//  348  670:sipush          816
	//  349  673:sipush          136
	//  350  676:bipush          56
	//  351  678:invokespecial   #61  <Method void BarcodeDatamatrix$DmParams(int, int, int, int, int, int, int)>
	//  352  681:aastore         
	//  353  682:dup             
	//  354  683:bipush          27
	//  355  685:new             #6   <Class BarcodeDatamatrix$DmParams>
	//  356  688:dup             
	//  357  689:bipush          120
	//  358  691:bipush          120
	//  359  693:bipush          20
	//  360  695:bipush          20
	//  361  697:sipush          1050
	//  362  700:sipush          175
	//  363  703:bipush          68
	//  364  705:invokespecial   #61  <Method void BarcodeDatamatrix$DmParams(int, int, int, int, int, int, int)>
	//  365  708:aastore         
	//  366  709:dup             
	//  367  710:bipush          28
	//  368  712:new             #6   <Class BarcodeDatamatrix$DmParams>
	//  369  715:dup             
	//  370  716:sipush          132
	//  371  719:sipush          132
	//  372  722:bipush          22
	//  373  724:bipush          22
	//  374  726:sipush          1304
	//  375  729:sipush          163
	//  376  732:bipush          62
	//  377  734:invokespecial   #61  <Method void BarcodeDatamatrix$DmParams(int, int, int, int, int, int, int)>
	//  378  737:aastore         
	//  379  738:dup             
	//  380  739:bipush          29
	//  381  741:new             #6   <Class BarcodeDatamatrix$DmParams>
	//  382  744:dup             
	//  383  745:sipush          144
	//  384  748:sipush          144
	//  385  751:bipush          24
	//  386  753:bipush          24
	//  387  755:sipush          1558
	//  388  758:sipush          156
	//  389  761:bipush          62
	//  390  763:invokespecial   #61  <Method void BarcodeDatamatrix$DmParams(int, int, int, int, int, int, int)>
	//  391  766:aastore         
	//  392  767:putstatic       #63  <Field BarcodeDatamatrix$DmParams[] dmSizes>
	//* 393  770:return          
	}
}
