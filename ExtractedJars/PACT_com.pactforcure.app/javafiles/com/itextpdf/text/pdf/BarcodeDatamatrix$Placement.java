// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;

import java.util.Arrays;
import java.util.Hashtable;

// Referenced classes of package com.itextpdf.text.pdf:
//			BarcodeDatamatrix

static class BarcodeDatamatrix$Placement
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
			BarcodeDatamatrix$Placement barcodedatamatrix$placement = new BarcodeDatamatrix$Placement();
	//   16   28:new             #2   <Class BarcodeDatamatrix$Placement>
	//   17   31:dup             
	//   18   32:invokespecial   #53  <Method void BarcodeDatamatrix$Placement()>
	//   19   35:astore_3        
			barcodedatamatrix$placement.nrow = i;
	//   20   36:aload_3         
	//   21   37:iload_0         
	//   22   38:putfield        #30  <Field int nrow>
			barcodedatamatrix$placement.ncol = j;
	//   23   41:aload_3         
	//   24   42:iload_1         
	//   25   43:putfield        #36  <Field int ncol>
			barcodedatamatrix$placement.array = new short[i * j];
	//   26   46:aload_3         
	//   27   47:iload_0         
	//   28   48:iload_1         
	//   29   49:imul            
	//   30   50:newarray        short[]
	//   31   52:putfield        #55  <Field short[] array>
			barcodedatamatrix$placement.ecc200();
	//   32   55:aload_3         
	//   33   56:invokespecial   #58  <Method void ecc200()>
			cache.put(((Object) (integer)), ((Object) (barcodedatamatrix$placement.array)));
	//   34   59:getstatic       #24  <Field Hashtable cache>
	//   35   62:aload_2         
	//   36   63:aload_3         
	//   37   64:getfield        #55  <Field short[] array>
	//   38   67:invokevirtual   #62  <Method Object Hashtable.put(Object, Object)>
	//   39   70:pop             
			return barcodedatamatrix$placement.array;
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

	private BarcodeDatamatrix$Placement()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void Object()>
	//    2    4:return          
	}
}
