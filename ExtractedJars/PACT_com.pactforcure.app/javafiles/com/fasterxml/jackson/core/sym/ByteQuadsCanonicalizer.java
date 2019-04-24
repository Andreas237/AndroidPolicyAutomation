// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.core.sym;

import com.fasterxml.jackson.core.util.InternCache;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

public final class ByteQuadsCanonicalizer
{
	private static final class TableInfo
	{

		public static TableInfo createInitial(int i)
		{
			int j = i << 3;
		//    0    0:iload_0         
		//    1    1:iconst_3        
		//    2    2:ishl            
		//    3    3:istore_1        
			return new TableInfo(i, 0, ByteQuadsCanonicalizer._calcTertiaryShift(i), new int[j], new String[i << 1], j - i, j);
		//    4    4:new             #2   <Class ByteQuadsCanonicalizer$TableInfo>
		//    5    7:dup             
		//    6    8:iload_0         
		//    7    9:iconst_0        
		//    8   10:iload_0         
		//    9   11:invokestatic    #65  <Method int ByteQuadsCanonicalizer._calcTertiaryShift(int)>
		//   10   14:iload_1         
		//   11   15:newarray        int[]
		//   12   17:iload_0         
		//   13   18:iconst_1        
		//   14   19:ishl            
		//   15   20:anewarray       String[]
		//   16   23:iload_1         
		//   17   24:iload_0         
		//   18   25:isub            
		//   19   26:iload_1         
		//   20   27:invokespecial   #69  <Method void ByteQuadsCanonicalizer$TableInfo(int, int, int, int[], String[], int, int)>
		//   21   30:areturn         
		}

		public final int count;
		public final int longNameOffset;
		public final int mainHash[];
		public final String names[];
		public final int size;
		public final int spilloverEnd;
		public final int tertiaryShift;

		public TableInfo(int i, int j, int k, int ai[], String as[], int l, int i1)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #22  <Method void Object()>
			size = i;
		//    2    4:aload_0         
		//    3    5:iload_1         
		//    4    6:putfield        #24  <Field int size>
			count = j;
		//    5    9:aload_0         
		//    6   10:iload_2         
		//    7   11:putfield        #26  <Field int count>
			tertiaryShift = k;
		//    8   14:aload_0         
		//    9   15:iload_3         
		//   10   16:putfield        #28  <Field int tertiaryShift>
			mainHash = ai;
		//   11   19:aload_0         
		//   12   20:aload           4
		//   13   22:putfield        #30  <Field int[] mainHash>
			names = as;
		//   14   25:aload_0         
		//   15   26:aload           5
		//   16   28:putfield        #32  <Field String[] names>
			spilloverEnd = l;
		//   17   31:aload_0         
		//   18   32:iload           6
		//   19   34:putfield        #34  <Field int spilloverEnd>
			longNameOffset = i1;
		//   20   37:aload_0         
		//   21   38:iload           7
		//   22   40:putfield        #36  <Field int longNameOffset>
		//   23   43:return          
		}

		public TableInfo(ByteQuadsCanonicalizer bytequadscanonicalizer)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #22  <Method void Object()>
			size = bytequadscanonicalizer._hashSize;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:getfield        #41  <Field int ByteQuadsCanonicalizer._hashSize>
		//    5    9:putfield        #24  <Field int size>
			count = bytequadscanonicalizer._count;
		//    6   12:aload_0         
		//    7   13:aload_1         
		//    8   14:getfield        #44  <Field int ByteQuadsCanonicalizer._count>
		//    9   17:putfield        #26  <Field int count>
			tertiaryShift = bytequadscanonicalizer._tertiaryShift;
		//   10   20:aload_0         
		//   11   21:aload_1         
		//   12   22:getfield        #47  <Field int ByteQuadsCanonicalizer._tertiaryShift>
		//   13   25:putfield        #28  <Field int tertiaryShift>
			mainHash = bytequadscanonicalizer._hashArea;
		//   14   28:aload_0         
		//   15   29:aload_1         
		//   16   30:getfield        #50  <Field int[] ByteQuadsCanonicalizer._hashArea>
		//   17   33:putfield        #30  <Field int[] mainHash>
			names = bytequadscanonicalizer._names;
		//   18   36:aload_0         
		//   19   37:aload_1         
		//   20   38:getfield        #53  <Field String[] ByteQuadsCanonicalizer._names>
		//   21   41:putfield        #32  <Field String[] names>
			spilloverEnd = bytequadscanonicalizer._spilloverEnd;
		//   22   44:aload_0         
		//   23   45:aload_1         
		//   24   46:getfield        #56  <Field int ByteQuadsCanonicalizer._spilloverEnd>
		//   25   49:putfield        #34  <Field int spilloverEnd>
			longNameOffset = bytequadscanonicalizer._longNameOffset;
		//   26   52:aload_0         
		//   27   53:aload_1         
		//   28   54:getfield        #59  <Field int ByteQuadsCanonicalizer._longNameOffset>
		//   29   57:putfield        #36  <Field int longNameOffset>
		//   30   60:return          
		}
	}


	private ByteQuadsCanonicalizer(int i, boolean flag, int j, boolean flag1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #49  <Method void Object()>
		_parent = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #51  <Field ByteQuadsCanonicalizer _parent>
		_seed = j;
	//    5    9:aload_0         
	//    6   10:iload_3         
	//    7   11:putfield        #53  <Field int _seed>
		_intern = flag;
	//    8   14:aload_0         
	//    9   15:iload_2         
	//   10   16:putfield        #55  <Field boolean _intern>
		_failOnDoS = flag1;
	//   11   19:aload_0         
	//   12   20:iload           4
	//   13   22:putfield        #57  <Field boolean _failOnDoS>
		if(i >= 16) goto _L2; else goto _L1
	//   14   25:iload_1         
	//   15   26:bipush          16
	//   16   28:icmpge          50
_L1:
		j = 16;
	//   17   31:bipush          16
	//   18   33:istore_3        
_L4:
		_tableInfo = new AtomicReference(((Object) (TableInfo.createInitial(j))));
	//   19   34:aload_0         
	//   20   35:new             #59  <Class AtomicReference>
	//   21   38:dup             
	//   22   39:iload_3         
	//   23   40:invokestatic    #63  <Method ByteQuadsCanonicalizer$TableInfo ByteQuadsCanonicalizer$TableInfo.createInitial(int)>
	//   24   43:invokespecial   #66  <Method void AtomicReference(Object)>
	//   25   46:putfield        #68  <Field AtomicReference _tableInfo>
		return;
	//   26   49:return          
_L2:
		j = i;
	//   27   50:iload_1         
	//   28   51:istore_3        
		if((i - 1 & i) != 0)
	//*  29   52:iload_1         
	//*  30   53:iconst_1        
	//*  31   54:isub            
	//*  32   55:iload_1         
	//*  33   56:iand            
	//*  34   57:ifeq            34
		{
			j = 16;
	//   35   60:bipush          16
	//   36   62:istore_3        
			while(j < i) 
	//*  37   63:iload_3         
	//*  38   64:iload_1         
	//*  39   65:icmpge          75
				j += j;
	//   40   68:iload_3         
	//   41   69:iload_3         
	//   42   70:iadd            
	//   43   71:istore_3        
		}
		if(true) goto _L4; else goto _L3
	//   44   72:goto            63
_L3:
	//*  45   75:goto            34
	}

	private ByteQuadsCanonicalizer(ByteQuadsCanonicalizer bytequadscanonicalizer, boolean flag, int i, boolean flag1, TableInfo tableinfo)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #49  <Method void Object()>
		_parent = bytequadscanonicalizer;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #51  <Field ByteQuadsCanonicalizer _parent>
		_seed = i;
	//    5    9:aload_0         
	//    6   10:iload_3         
	//    7   11:putfield        #53  <Field int _seed>
		_intern = flag;
	//    8   14:aload_0         
	//    9   15:iload_2         
	//   10   16:putfield        #55  <Field boolean _intern>
		_failOnDoS = flag1;
	//   11   19:aload_0         
	//   12   20:iload           4
	//   13   22:putfield        #57  <Field boolean _failOnDoS>
		_tableInfo = null;
	//   14   25:aload_0         
	//   15   26:aconst_null     
	//   16   27:putfield        #68  <Field AtomicReference _tableInfo>
		_count = tableinfo.count;
	//   17   30:aload_0         
	//   18   31:aload           5
	//   19   33:getfield        #73  <Field int ByteQuadsCanonicalizer$TableInfo.count>
	//   20   36:putfield        #75  <Field int _count>
		_hashSize = tableinfo.size;
	//   21   39:aload_0         
	//   22   40:aload           5
	//   23   42:getfield        #78  <Field int ByteQuadsCanonicalizer$TableInfo.size>
	//   24   45:putfield        #80  <Field int _hashSize>
		_secondaryStart = _hashSize << 2;
	//   25   48:aload_0         
	//   26   49:aload_0         
	//   27   50:getfield        #80  <Field int _hashSize>
	//   28   53:iconst_2        
	//   29   54:ishl            
	//   30   55:putfield        #82  <Field int _secondaryStart>
		_tertiaryStart = _secondaryStart + (_secondaryStart >> 1);
	//   31   58:aload_0         
	//   32   59:aload_0         
	//   33   60:getfield        #82  <Field int _secondaryStart>
	//   34   63:aload_0         
	//   35   64:getfield        #82  <Field int _secondaryStart>
	//   36   67:iconst_1        
	//   37   68:ishr            
	//   38   69:iadd            
	//   39   70:putfield        #84  <Field int _tertiaryStart>
		_tertiaryShift = tableinfo.tertiaryShift;
	//   40   73:aload_0         
	//   41   74:aload           5
	//   42   76:getfield        #87  <Field int ByteQuadsCanonicalizer$TableInfo.tertiaryShift>
	//   43   79:putfield        #89  <Field int _tertiaryShift>
		_hashArea = tableinfo.mainHash;
	//   44   82:aload_0         
	//   45   83:aload           5
	//   46   85:getfield        #92  <Field int[] ByteQuadsCanonicalizer$TableInfo.mainHash>
	//   47   88:putfield        #94  <Field int[] _hashArea>
		_names = tableinfo.names;
	//   48   91:aload_0         
	//   49   92:aload           5
	//   50   94:getfield        #97  <Field String[] ByteQuadsCanonicalizer$TableInfo.names>
	//   51   97:putfield        #99  <Field String[] _names>
		_spilloverEnd = tableinfo.spilloverEnd;
	//   52  100:aload_0         
	//   53  101:aload           5
	//   54  103:getfield        #102 <Field int ByteQuadsCanonicalizer$TableInfo.spilloverEnd>
	//   55  106:putfield        #104 <Field int _spilloverEnd>
		_longNameOffset = tableinfo.longNameOffset;
	//   56  109:aload_0         
	//   57  110:aload           5
	//   58  112:getfield        #107 <Field int ByteQuadsCanonicalizer$TableInfo.longNameOffset>
	//   59  115:putfield        #109 <Field int _longNameOffset>
		_needRehash = false;
	//   60  118:aload_0         
	//   61  119:iconst_0        
	//   62  120:putfield        #111 <Field boolean _needRehash>
		_hashShared = true;
	//   63  123:aload_0         
	//   64  124:iconst_1        
	//   65  125:putfield        #113 <Field boolean _hashShared>
	//   66  128:return          
	}

	private int _appendLongName(int ai[], int i)
	{
		int j = _longNameOffset;
	//    0    0:aload_0         
	//    1    1:getfield        #109 <Field int _longNameOffset>
	//    2    4:istore_3        
		if(j + i > _hashArea.length)
	//*   3    5:iload_3         
	//*   4    6:iload_2         
	//*   5    7:iadd            
	//*   6    8:aload_0         
	//*   7    9:getfield        #94  <Field int[] _hashArea>
	//*   8   12:arraylength     
	//*   9   13:icmple          71
		{
			int l = _hashArea.length;
	//   10   16:aload_0         
	//   11   17:getfield        #94  <Field int[] _hashArea>
	//   12   20:arraylength     
	//   13   21:istore          5
			int i1 = Math.min(4096, _hashSize);
	//   14   23:sipush          4096
	//   15   26:aload_0         
	//   16   27:getfield        #80  <Field int _hashSize>
	//   17   30:invokestatic    #121 <Method int Math.min(int, int)>
	//   18   33:istore          6
			int k = _hashArea.length;
	//   19   35:aload_0         
	//   20   36:getfield        #94  <Field int[] _hashArea>
	//   21   39:arraylength     
	//   22   40:istore          4
			l = Math.max((j + i) - l, i1);
	//   23   42:iload_3         
	//   24   43:iload_2         
	//   25   44:iadd            
	//   26   45:iload           5
	//   27   47:isub            
	//   28   48:iload           6
	//   29   50:invokestatic    #124 <Method int Math.max(int, int)>
	//   30   53:istore          5
			_hashArea = Arrays.copyOf(_hashArea, k + l);
	//   31   55:aload_0         
	//   32   56:aload_0         
	//   33   57:getfield        #94  <Field int[] _hashArea>
	//   34   60:iload           4
	//   35   62:iload           5
	//   36   64:iadd            
	//   37   65:invokestatic    #130 <Method int[] Arrays.copyOf(int[], int)>
	//   38   68:putfield        #94  <Field int[] _hashArea>
		}
		System.arraycopy(((Object) (ai)), 0, ((Object) (_hashArea)), j, i);
	//   39   71:aload_1         
	//   40   72:iconst_0        
	//   41   73:aload_0         
	//   42   74:getfield        #94  <Field int[] _hashArea>
	//   43   77:iload_3         
	//   44   78:iload_2         
	//   45   79:invokestatic    #136 <Method void System.arraycopy(Object, int, Object, int, int)>
		_longNameOffset = _longNameOffset + i;
	//   46   82:aload_0         
	//   47   83:aload_0         
	//   48   84:getfield        #109 <Field int _longNameOffset>
	//   49   87:iload_2         
	//   50   88:iadd            
	//   51   89:putfield        #109 <Field int _longNameOffset>
		return j;
	//   52   92:iload_3         
	//   53   93:ireturn         
	}

	private final int _calcOffset(int i)
	{
		return (i & _hashSize - 1) << 2;
	//    0    0:iload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #80  <Field int _hashSize>
	//    3    5:iconst_1        
	//    4    6:isub            
	//    5    7:iand            
	//    6    8:iconst_2        
	//    7    9:ishl            
	//    8   10:ireturn         
	}

	static int _calcTertiaryShift(int i)
	{
		i >>= 2;
	//    0    0:iload_0         
	//    1    1:iconst_2        
	//    2    2:ishr            
	//    3    3:istore_0        
		if(i < 64)
	//*   4    4:iload_0         
	//*   5    5:bipush          64
	//*   6    7:icmpge          12
			return 4;
	//    7   10:iconst_4        
	//    8   11:ireturn         
		if(i <= 256)
	//*   9   12:iload_0         
	//*  10   13:sipush          256
	//*  11   16:icmpgt          21
			return 5;
	//   12   19:iconst_5        
	//   13   20:ireturn         
		return i > 1024 ? 7 : 6;
	//   14   21:iload_0         
	//   15   22:sipush          1024
	//   16   25:icmpgt          31
	//   17   28:bipush          6
	//   18   30:ireturn         
	//   19   31:bipush          7
	//   20   33:ireturn         
	}

	private int _findOffsetForAdd(int i)
	{
		int j;
		int ai[];
		j = _calcOffset(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #142 <Method int _calcOffset(int)>
	//    3    5:istore_2        
		ai = _hashArea;
	//    4    6:aload_0         
	//    5    7:getfield        #94  <Field int[] _hashArea>
	//    6   10:astore          5
		if(ai[j + 3] != 0) goto _L2; else goto _L1
	//    7   12:aload           5
	//    8   14:iload_2         
	//    9   15:iconst_3        
	//   10   16:iadd            
	//   11   17:iaload          
	//   12   18:ifne            25
_L1:
		i = j;
	//   13   21:iload_2         
	//   14   22:istore_1        
_L4:
		return i;
	//   15   23:iload_1         
	//   16   24:ireturn         
_L2:
		int i1 = _secondaryStart + ((j >> 3) << 2);
	//   17   25:aload_0         
	//   18   26:getfield        #82  <Field int _secondaryStart>
	//   19   29:iload_2         
	//   20   30:iconst_3        
	//   21   31:ishr            
	//   22   32:iconst_2        
	//   23   33:ishl            
	//   24   34:iadd            
	//   25   35:istore_3        
		i = i1;
	//   26   36:iload_3         
	//   27   37:istore_1        
		if(ai[i1 + 3] != 0)
	//*  28   38:aload           5
	//*  29   40:iload_3         
	//*  30   41:iconst_3        
	//*  31   42:iadd            
	//*  32   43:iaload          
	//*  33   44:ifeq            23
		{
			int j1 = _tertiaryStart + ((j >> _tertiaryShift + 2) << _tertiaryShift);
	//   34   47:aload_0         
	//   35   48:getfield        #84  <Field int _tertiaryStart>
	//   36   51:iload_2         
	//   37   52:aload_0         
	//   38   53:getfield        #89  <Field int _tertiaryShift>
	//   39   56:iconst_2        
	//   40   57:iadd            
	//   41   58:ishr            
	//   42   59:aload_0         
	//   43   60:getfield        #89  <Field int _tertiaryShift>
	//   44   63:ishl            
	//   45   64:iadd            
	//   46   65:istore_3        
			int k1 = _tertiaryShift;
	//   47   66:aload_0         
	//   48   67:getfield        #89  <Field int _tertiaryShift>
	//   49   70:istore          4
			i = j1;
	//   50   72:iload_3         
	//   51   73:istore_1        
label0:
			do
			{
label1:
				{
					int k = i;
	//   52   74:iload_1         
	//   53   75:istore_2        
					if(k >= j1 + (1 << k1))
						break label1;
	//   54   76:iload_2         
	//   55   77:iload_3         
	//   56   78:iconst_1        
	//   57   79:iload           4
	//   58   81:ishl            
	//   59   82:iadd            
	//   60   83:icmpge          104
					i = k;
	//   61   86:iload_2         
	//   62   87:istore_1        
					if(ai[k + 3] == 0)
						break label0;
	//   63   88:aload           5
	//   64   90:iload_2         
	//   65   91:iconst_3        
	//   66   92:iadd            
	//   67   93:iaload          
	//   68   94:ifeq            23
					i = k + 4;
	//   69   97:iload_2         
	//   70   98:iconst_4        
	//   71   99:iadd            
	//   72  100:istore_1        
				}
			} while(true);
	//   73  101:goto            74
		}
		if(true) goto _L4; else goto _L3
_L3:
		i = _spilloverEnd;
	//   74  104:aload_0         
	//   75  105:getfield        #104 <Field int _spilloverEnd>
	//   76  108:istore_1        
		_spilloverEnd = _spilloverEnd + 4;
	//   77  109:aload_0         
	//   78  110:aload_0         
	//   79  111:getfield        #104 <Field int _spilloverEnd>
	//   80  114:iconst_4        
	//   81  115:iadd            
	//   82  116:putfield        #104 <Field int _spilloverEnd>
		int l = _hashSize;
	//   83  119:aload_0         
	//   84  120:getfield        #80  <Field int _hashSize>
	//   85  123:istore_2        
		if(_spilloverEnd >= l << 3)
	//*  86  124:aload_0         
	//*  87  125:getfield        #104 <Field int _spilloverEnd>
	//*  88  128:iload_2         
	//*  89  129:iconst_3        
	//*  90  130:ishl            
	//*  91  131:icmplt          150
		{
			if(_failOnDoS)
	//*  92  134:aload_0         
	//*  93  135:getfield        #57  <Field boolean _failOnDoS>
	//*  94  138:ifeq            145
				_reportTooManyCollisions();
	//   95  141:aload_0         
	//   96  142:invokevirtual   #145 <Method void _reportTooManyCollisions()>
			_needRehash = true;
	//   97  145:aload_0         
	//   98  146:iconst_1        
	//   99  147:putfield        #111 <Field boolean _needRehash>
		}
		return i;
	//  100  150:iload_1         
	//  101  151:ireturn         
	}

	private String _findSecondary(int i, int j)
	{
		int k;
		int l;
		Object obj;
		int ai[];
		obj = null;
	//    0    0:aconst_null     
	//    1    1:astore          7
		k = _tertiaryStart + ((i >> _tertiaryShift + 2) << _tertiaryShift);
	//    2    3:aload_0         
	//    3    4:getfield        #84  <Field int _tertiaryStart>
	//    4    7:iload_1         
	//    5    8:aload_0         
	//    6    9:getfield        #89  <Field int _tertiaryShift>
	//    7   12:iconst_2        
	//    8   13:iadd            
	//    9   14:ishr            
	//   10   15:aload_0         
	//   11   16:getfield        #89  <Field int _tertiaryShift>
	//   12   19:ishl            
	//   13   20:iadd            
	//   14   21:istore_3        
		ai = _hashArea;
	//   15   22:aload_0         
	//   16   23:getfield        #94  <Field int[] _hashArea>
	//   17   26:astore          8
		l = _tertiaryShift;
	//   18   28:aload_0         
	//   19   29:getfield        #89  <Field int _tertiaryShift>
	//   20   32:istore          4
		i = k;
	//   21   34:iload_3         
	//   22   35:istore_1        
_L7:
		if(i >= k + (1 << l)) goto _L2; else goto _L1
	//   23   36:iload_1         
	//   24   37:iload_3         
	//   25   38:iconst_1        
	//   26   39:iload           4
	//   27   41:ishl            
	//   28   42:iadd            
	//   29   43:icmpge          97
_L1:
		int i1 = ai[i + 3];
	//   30   46:aload           8
	//   31   48:iload_1         
	//   32   49:iconst_3        
	//   33   50:iadd            
	//   34   51:iaload          
	//   35   52:istore          5
		if(j != ai[i] || 1 != i1) goto _L4; else goto _L3
	//   36   54:iload_2         
	//   37   55:aload           8
	//   38   57:iload_1         
	//   39   58:iaload          
	//   40   59:icmpne          81
	//   41   62:iconst_1        
	//   42   63:iload           5
	//   43   65:icmpne          81
_L3:
		String s = _names[i >> 2];
	//   44   68:aload_0         
	//   45   69:getfield        #99  <Field String[] _names>
	//   46   72:iload_1         
	//   47   73:iconst_2        
	//   48   74:ishr            
	//   49   75:aaload          
	//   50   76:astore          6
_L6:
		return s;
	//   51   78:aload           6
	//   52   80:areturn         
_L4:
		s = ((String) (obj));
	//   53   81:aload           7
	//   54   83:astore          6
		if(i1 == 0) goto _L6; else goto _L5
	//   55   85:iload           5
	//   56   87:ifeq            78
_L5:
		i += 4;
	//   57   90:iload_1         
	//   58   91:iconst_4        
	//   59   92:iadd            
	//   60   93:istore_1        
		  goto _L7
	//*  61   94:goto            36
_L2:
		i = _spilloverStart();
	//   62   97:aload_0         
	//   63   98:invokespecial   #151 <Method int _spilloverStart()>
	//   64  101:istore_1        
_L9:
		s = ((String) (obj));
	//   65  102:aload           7
	//   66  104:astore          6
		if(i >= _spilloverEnd) goto _L6; else goto _L8
	//   67  106:iload_1         
	//   68  107:aload_0         
	//   69  108:getfield        #104 <Field int _spilloverEnd>
	//   70  111:icmpge          78
_L8:
		if(j == ai[i] && 1 == ai[i + 3])
	//*  71  114:iload_2         
	//*  72  115:aload           8
	//*  73  117:iload_1         
	//*  74  118:iaload          
	//*  75  119:icmpne          141
	//*  76  122:iconst_1        
	//*  77  123:aload           8
	//*  78  125:iload_1         
	//*  79  126:iconst_3        
	//*  80  127:iadd            
	//*  81  128:iaload          
	//*  82  129:icmpne          141
			return _names[i >> 2];
	//   83  132:aload_0         
	//   84  133:getfield        #99  <Field String[] _names>
	//   85  136:iload_1         
	//   86  137:iconst_2        
	//   87  138:ishr            
	//   88  139:aaload          
	//   89  140:areturn         
		i += 4;
	//   90  141:iload_1         
	//   91  142:iconst_4        
	//   92  143:iadd            
	//   93  144:istore_1        
		  goto _L9
	//*  94  145:goto            102
	}

	private String _findSecondary(int i, int j, int k)
	{
		int l;
		int i1;
		Object obj;
		int ai[];
		obj = null;
	//    0    0:aconst_null     
	//    1    1:astore          8
		l = _tertiaryStart + ((i >> _tertiaryShift + 2) << _tertiaryShift);
	//    2    3:aload_0         
	//    3    4:getfield        #84  <Field int _tertiaryStart>
	//    4    7:iload_1         
	//    5    8:aload_0         
	//    6    9:getfield        #89  <Field int _tertiaryShift>
	//    7   12:iconst_2        
	//    8   13:iadd            
	//    9   14:ishr            
	//   10   15:aload_0         
	//   11   16:getfield        #89  <Field int _tertiaryShift>
	//   12   19:ishl            
	//   13   20:iadd            
	//   14   21:istore          4
		ai = _hashArea;
	//   15   23:aload_0         
	//   16   24:getfield        #94  <Field int[] _hashArea>
	//   17   27:astore          9
		i1 = _tertiaryShift;
	//   18   29:aload_0         
	//   19   30:getfield        #89  <Field int _tertiaryShift>
	//   20   33:istore          5
		i = l;
	//   21   35:iload           4
	//   22   37:istore_1        
_L7:
		if(i >= l + (1 << i1)) goto _L2; else goto _L1
	//   23   38:iload_1         
	//   24   39:iload           4
	//   25   41:iconst_1        
	//   26   42:iload           5
	//   27   44:ishl            
	//   28   45:iadd            
	//   29   46:icmpge          110
_L1:
		int j1 = ai[i + 3];
	//   30   49:aload           9
	//   31   51:iload_1         
	//   32   52:iconst_3        
	//   33   53:iadd            
	//   34   54:iaload          
	//   35   55:istore          6
		if(j != ai[i] || k != ai[i + 1] || 2 != j1) goto _L4; else goto _L3
	//   36   57:iload_2         
	//   37   58:aload           9
	//   38   60:iload_1         
	//   39   61:iaload          
	//   40   62:icmpne          94
	//   41   65:iload_3         
	//   42   66:aload           9
	//   43   68:iload_1         
	//   44   69:iconst_1        
	//   45   70:iadd            
	//   46   71:iaload          
	//   47   72:icmpne          94
	//   48   75:iconst_2        
	//   49   76:iload           6
	//   50   78:icmpne          94
_L3:
		String s = _names[i >> 2];
	//   51   81:aload_0         
	//   52   82:getfield        #99  <Field String[] _names>
	//   53   85:iload_1         
	//   54   86:iconst_2        
	//   55   87:ishr            
	//   56   88:aaload          
	//   57   89:astore          7
_L6:
		return s;
	//   58   91:aload           7
	//   59   93:areturn         
_L4:
		s = ((String) (obj));
	//   60   94:aload           8
	//   61   96:astore          7
		if(j1 == 0) goto _L6; else goto _L5
	//   62   98:iload           6
	//   63  100:ifeq            91
_L5:
		i += 4;
	//   64  103:iload_1         
	//   65  104:iconst_4        
	//   66  105:iadd            
	//   67  106:istore_1        
		  goto _L7
	//*  68  107:goto            38
_L2:
		i = _spilloverStart();
	//   69  110:aload_0         
	//   70  111:invokespecial   #151 <Method int _spilloverStart()>
	//   71  114:istore_1        
_L9:
		s = ((String) (obj));
	//   72  115:aload           8
	//   73  117:astore          7
		if(i >= _spilloverEnd) goto _L6; else goto _L8
	//   74  119:iload_1         
	//   75  120:aload_0         
	//   76  121:getfield        #104 <Field int _spilloverEnd>
	//   77  124:icmpge          91
_L8:
		if(j == ai[i] && k == ai[i + 1] && 2 == ai[i + 3])
	//*  78  127:iload_2         
	//*  79  128:aload           9
	//*  80  130:iload_1         
	//*  81  131:iaload          
	//*  82  132:icmpne          164
	//*  83  135:iload_3         
	//*  84  136:aload           9
	//*  85  138:iload_1         
	//*  86  139:iconst_1        
	//*  87  140:iadd            
	//*  88  141:iaload          
	//*  89  142:icmpne          164
	//*  90  145:iconst_2        
	//*  91  146:aload           9
	//*  92  148:iload_1         
	//*  93  149:iconst_3        
	//*  94  150:iadd            
	//*  95  151:iaload          
	//*  96  152:icmpne          164
			return _names[i >> 2];
	//   97  155:aload_0         
	//   98  156:getfield        #99  <Field String[] _names>
	//   99  159:iload_1         
	//  100  160:iconst_2        
	//  101  161:ishr            
	//  102  162:aaload          
	//  103  163:areturn         
		i += 4;
	//  104  164:iload_1         
	//  105  165:iconst_4        
	//  106  166:iadd            
	//  107  167:istore_1        
		  goto _L9
	//* 108  168:goto            115
	}

	private String _findSecondary(int i, int j, int k, int l)
	{
		int i1;
		int j1;
		Object obj;
		int ai[];
		obj = null;
	//    0    0:aconst_null     
	//    1    1:astore          9
		i1 = _tertiaryStart + ((i >> _tertiaryShift + 2) << _tertiaryShift);
	//    2    3:aload_0         
	//    3    4:getfield        #84  <Field int _tertiaryStart>
	//    4    7:iload_1         
	//    5    8:aload_0         
	//    6    9:getfield        #89  <Field int _tertiaryShift>
	//    7   12:iconst_2        
	//    8   13:iadd            
	//    9   14:ishr            
	//   10   15:aload_0         
	//   11   16:getfield        #89  <Field int _tertiaryShift>
	//   12   19:ishl            
	//   13   20:iadd            
	//   14   21:istore          5
		ai = _hashArea;
	//   15   23:aload_0         
	//   16   24:getfield        #94  <Field int[] _hashArea>
	//   17   27:astore          10
		j1 = _tertiaryShift;
	//   18   29:aload_0         
	//   19   30:getfield        #89  <Field int _tertiaryShift>
	//   20   33:istore          6
		i = i1;
	//   21   35:iload           5
	//   22   37:istore_1        
_L7:
		if(i >= i1 + (1 << j1)) goto _L2; else goto _L1
	//   23   38:iload_1         
	//   24   39:iload           5
	//   25   41:iconst_1        
	//   26   42:iload           6
	//   27   44:ishl            
	//   28   45:iadd            
	//   29   46:icmpge          121
_L1:
		int k1 = ai[i + 3];
	//   30   49:aload           10
	//   31   51:iload_1         
	//   32   52:iconst_3        
	//   33   53:iadd            
	//   34   54:iaload          
	//   35   55:istore          7
		if(j != ai[i] || k != ai[i + 1] || l != ai[i + 2] || 3 != k1) goto _L4; else goto _L3
	//   36   57:iload_2         
	//   37   58:aload           10
	//   38   60:iload_1         
	//   39   61:iaload          
	//   40   62:icmpne          105
	//   41   65:iload_3         
	//   42   66:aload           10
	//   43   68:iload_1         
	//   44   69:iconst_1        
	//   45   70:iadd            
	//   46   71:iaload          
	//   47   72:icmpne          105
	//   48   75:iload           4
	//   49   77:aload           10
	//   50   79:iload_1         
	//   51   80:iconst_2        
	//   52   81:iadd            
	//   53   82:iaload          
	//   54   83:icmpne          105
	//   55   86:iconst_3        
	//   56   87:iload           7
	//   57   89:icmpne          105
_L3:
		String s = _names[i >> 2];
	//   58   92:aload_0         
	//   59   93:getfield        #99  <Field String[] _names>
	//   60   96:iload_1         
	//   61   97:iconst_2        
	//   62   98:ishr            
	//   63   99:aaload          
	//   64  100:astore          8
_L6:
		return s;
	//   65  102:aload           8
	//   66  104:areturn         
_L4:
		s = ((String) (obj));
	//   67  105:aload           9
	//   68  107:astore          8
		if(k1 == 0) goto _L6; else goto _L5
	//   69  109:iload           7
	//   70  111:ifeq            102
_L5:
		i += 4;
	//   71  114:iload_1         
	//   72  115:iconst_4        
	//   73  116:iadd            
	//   74  117:istore_1        
		  goto _L7
	//*  75  118:goto            38
_L2:
		i = _spilloverStart();
	//   76  121:aload_0         
	//   77  122:invokespecial   #151 <Method int _spilloverStart()>
	//   78  125:istore_1        
_L9:
		s = ((String) (obj));
	//   79  126:aload           9
	//   80  128:astore          8
		if(i >= _spilloverEnd) goto _L6; else goto _L8
	//   81  130:iload_1         
	//   82  131:aload_0         
	//   83  132:getfield        #104 <Field int _spilloverEnd>
	//   84  135:icmpge          102
_L8:
		if(j == ai[i] && k == ai[i + 1] && l == ai[i + 2] && 3 == ai[i + 3])
	//*  85  138:iload_2         
	//*  86  139:aload           10
	//*  87  141:iload_1         
	//*  88  142:iaload          
	//*  89  143:icmpne          186
	//*  90  146:iload_3         
	//*  91  147:aload           10
	//*  92  149:iload_1         
	//*  93  150:iconst_1        
	//*  94  151:iadd            
	//*  95  152:iaload          
	//*  96  153:icmpne          186
	//*  97  156:iload           4
	//*  98  158:aload           10
	//*  99  160:iload_1         
	//* 100  161:iconst_2        
	//* 101  162:iadd            
	//* 102  163:iaload          
	//* 103  164:icmpne          186
	//* 104  167:iconst_3        
	//* 105  168:aload           10
	//* 106  170:iload_1         
	//* 107  171:iconst_3        
	//* 108  172:iadd            
	//* 109  173:iaload          
	//* 110  174:icmpne          186
			return _names[i >> 2];
	//  111  177:aload_0         
	//  112  178:getfield        #99  <Field String[] _names>
	//  113  181:iload_1         
	//  114  182:iconst_2        
	//  115  183:ishr            
	//  116  184:aaload          
	//  117  185:areturn         
		i += 4;
	//  118  186:iload_1         
	//  119  187:iconst_4        
	//  120  188:iadd            
	//  121  189:istore_1        
		  goto _L9
	//* 122  190:goto            126
	}

	private String _findSecondary(int i, int j, int ai[], int k)
	{
		int l;
		int i1;
		Object obj;
		int ai1[];
		obj = null;
	//    0    0:aconst_null     
	//    1    1:astore          9
		l = _tertiaryStart + ((i >> _tertiaryShift + 2) << _tertiaryShift);
	//    2    3:aload_0         
	//    3    4:getfield        #84  <Field int _tertiaryStart>
	//    4    7:iload_1         
	//    5    8:aload_0         
	//    6    9:getfield        #89  <Field int _tertiaryShift>
	//    7   12:iconst_2        
	//    8   13:iadd            
	//    9   14:ishr            
	//   10   15:aload_0         
	//   11   16:getfield        #89  <Field int _tertiaryShift>
	//   12   19:ishl            
	//   13   20:iadd            
	//   14   21:istore          5
		ai1 = _hashArea;
	//   15   23:aload_0         
	//   16   24:getfield        #94  <Field int[] _hashArea>
	//   17   27:astore          10
		i1 = _tertiaryShift;
	//   18   29:aload_0         
	//   19   30:getfield        #89  <Field int _tertiaryShift>
	//   20   33:istore          6
		i = l;
	//   21   35:iload           5
	//   22   37:istore_1        
_L7:
		if(i >= l + (1 << i1)) goto _L2; else goto _L1
	//   23   38:iload_1         
	//   24   39:iload           5
	//   25   41:iconst_1        
	//   26   42:iload           6
	//   27   44:ishl            
	//   28   45:iadd            
	//   29   46:icmpge          117
_L1:
		int j1 = ai1[i + 3];
	//   30   49:aload           10
	//   31   51:iload_1         
	//   32   52:iconst_3        
	//   33   53:iadd            
	//   34   54:iaload          
	//   35   55:istore          7
		if(j != ai1[i] || k != j1 || !_verifyLongName(ai, k, ai1[i + 1])) goto _L4; else goto _L3
	//   36   57:iload_2         
	//   37   58:aload           10
	//   38   60:iload_1         
	//   39   61:iaload          
	//   40   62:icmpne          101
	//   41   65:iload           4
	//   42   67:iload           7
	//   43   69:icmpne          101
	//   44   72:aload_0         
	//   45   73:aload_3         
	//   46   74:iload           4
	//   47   76:aload           10
	//   48   78:iload_1         
	//   49   79:iconst_1        
	//   50   80:iadd            
	//   51   81:iaload          
	//   52   82:invokespecial   #158 <Method boolean _verifyLongName(int[], int, int)>
	//   53   85:ifeq            101
_L3:
		String s = _names[i >> 2];
	//   54   88:aload_0         
	//   55   89:getfield        #99  <Field String[] _names>
	//   56   92:iload_1         
	//   57   93:iconst_2        
	//   58   94:ishr            
	//   59   95:aaload          
	//   60   96:astore          8
_L6:
		return s;
	//   61   98:aload           8
	//   62  100:areturn         
_L4:
		s = ((String) (obj));
	//   63  101:aload           9
	//   64  103:astore          8
		if(j1 == 0) goto _L6; else goto _L5
	//   65  105:iload           7
	//   66  107:ifeq            98
_L5:
		i += 4;
	//   67  110:iload_1         
	//   68  111:iconst_4        
	//   69  112:iadd            
	//   70  113:istore_1        
		  goto _L7
	//*  71  114:goto            38
_L2:
		i = _spilloverStart();
	//   72  117:aload_0         
	//   73  118:invokespecial   #151 <Method int _spilloverStart()>
	//   74  121:istore_1        
_L9:
		s = ((String) (obj));
	//   75  122:aload           9
	//   76  124:astore          8
		if(i >= _spilloverEnd) goto _L6; else goto _L8
	//   77  126:iload_1         
	//   78  127:aload_0         
	//   79  128:getfield        #104 <Field int _spilloverEnd>
	//   80  131:icmpge          98
_L8:
		if(j == ai1[i] && k == ai1[i + 3] && _verifyLongName(ai, k, ai1[i + 1]))
	//*  81  134:iload_2         
	//*  82  135:aload           10
	//*  83  137:iload_1         
	//*  84  138:iaload          
	//*  85  139:icmpne          178
	//*  86  142:iload           4
	//*  87  144:aload           10
	//*  88  146:iload_1         
	//*  89  147:iconst_3        
	//*  90  148:iadd            
	//*  91  149:iaload          
	//*  92  150:icmpne          178
	//*  93  153:aload_0         
	//*  94  154:aload_3         
	//*  95  155:iload           4
	//*  96  157:aload           10
	//*  97  159:iload_1         
	//*  98  160:iconst_1        
	//*  99  161:iadd            
	//* 100  162:iaload          
	//* 101  163:invokespecial   #158 <Method boolean _verifyLongName(int[], int, int)>
	//* 102  166:ifeq            178
			return _names[i >> 2];
	//  103  169:aload_0         
	//  104  170:getfield        #99  <Field String[] _names>
	//  105  173:iload_1         
	//  106  174:iconst_2        
	//  107  175:ishr            
	//  108  176:aaload          
	//  109  177:areturn         
		i += 4;
	//  110  178:iload_1         
	//  111  179:iconst_4        
	//  112  180:iadd            
	//  113  181:istore_1        
		  goto _L9
	//* 114  182:goto            122
	}

	private final int _spilloverStart()
	{
		int i = _hashSize;
	//    0    0:aload_0         
	//    1    1:getfield        #80  <Field int _hashSize>
	//    2    4:istore_1        
		return (i << 3) - i;
	//    3    5:iload_1         
	//    4    6:iconst_3        
	//    5    7:ishl            
	//    6    8:iload_1         
	//    7    9:isub            
	//    8   10:ireturn         
	}

	private boolean _verifyLongName(int ai[], int i, int j)
	{
		int k;
		int i1;
		int l1;
		int i2;
		int j2;
		int k2;
		int l2;
		int i3;
		boolean flag1;
		int ai1[];
		flag1 = false;
	//    0    0:iconst_0        
	//    1    1:istore          13
		ai1 = _hashArea;
	//    2    3:aload_0         
	//    3    4:getfield        #94  <Field int[] _hashArea>
	//    4    7:astore          14
		k2 = 0;
	//    5    9:iconst_0        
	//    6   10:istore          9
		l2 = 0;
	//    7   12:iconst_0        
	//    8   13:istore          10
		i3 = 0;
	//    9   15:iconst_0        
	//   10   16:istore          11
		i2 = 0;
	//   11   18:iconst_0        
	//   12   19:istore          7
		k = j;
	//   13   21:iload_3         
	//   14   22:istore          4
		i1 = j;
	//   15   24:iload_3         
	//   16   25:istore          5
		j2 = j;
	//   17   27:iload_3         
	//   18   28:istore          8
		l1 = j;
	//   19   30:iload_3         
	//   20   31:istore          6
		i;
	//   21   33:iload_2         
		JVM INSTR tableswitch 4 8: default 68
	//	               4 180
	//	               5 154
	//	               6 128
	//	               7 102
	//	               8 80;
	//   22   34:tableswitch     4 8: default 68
	//	               4 180
	//	               5 154
	//	               6 128
	//	               7 102
	//	               8 80
		   goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
		boolean flag = _verifyLongName2(ai, i, j);
	//   23   68:aload_0         
	//   24   69:aload_1         
	//   25   70:iload_2         
	//   26   71:iload_3         
	//   27   72:invokespecial   #161 <Method boolean _verifyLongName2(int[], int, int)>
	//   28   75:istore          12
_L8:
		return flag;
	//   29   77:iload           12
	//   30   79:ireturn         
_L6:
		if(ai[0] != ai1[j])
	//*  31   80:aload_1         
	//*  32   81:iconst_0        
	//*  33   82:iaload          
	//*  34   83:aload           14
	//*  35   85:iload_3         
	//*  36   86:iaload          
	//*  37   87:icmpeq          92
			return false;
	//   38   90:iconst_0        
	//   39   91:ireturn         
		i2 = 0 + 1;
	//   40   92:iconst_0        
	//   41   93:iconst_1        
	//   42   94:iadd            
	//   43   95:istore          7
		k = j + 1;
	//   44   97:iload_3         
	//   45   98:iconst_1        
	//   46   99:iadd            
	//   47  100:istore          4
_L5:
		if(ai[i2] != ai1[k])
	//*  48  102:aload_1         
	//*  49  103:iload           7
	//*  50  105:iaload          
	//*  51  106:aload           14
	//*  52  108:iload           4
	//*  53  110:iaload          
	//*  54  111:icmpeq          116
			return false;
	//   55  114:iconst_0        
	//   56  115:ireturn         
		k2 = i2 + 1;
	//   57  116:iload           7
	//   58  118:iconst_1        
	//   59  119:iadd            
	//   60  120:istore          9
		i1 = k + 1;
	//   61  122:iload           4
	//   62  124:iconst_1        
	//   63  125:iadd            
	//   64  126:istore          5
_L4:
		if(ai[k2] != ai1[i1])
	//*  65  128:aload_1         
	//*  66  129:iload           9
	//*  67  131:iaload          
	//*  68  132:aload           14
	//*  69  134:iload           5
	//*  70  136:iaload          
	//*  71  137:icmpeq          142
			return false;
	//   72  140:iconst_0        
	//   73  141:ireturn         
		l2 = k2 + 1;
	//   74  142:iload           9
	//   75  144:iconst_1        
	//   76  145:iadd            
	//   77  146:istore          10
		j2 = i1 + 1;
	//   78  148:iload           5
	//   79  150:iconst_1        
	//   80  151:iadd            
	//   81  152:istore          8
_L3:
		if(ai[l2] != ai1[j2])
	//*  82  154:aload_1         
	//*  83  155:iload           10
	//*  84  157:iaload          
	//*  85  158:aload           14
	//*  86  160:iload           8
	//*  87  162:iaload          
	//*  88  163:icmpeq          168
			return false;
	//   89  166:iconst_0        
	//   90  167:ireturn         
		i3 = l2 + 1;
	//   91  168:iload           10
	//   92  170:iconst_1        
	//   93  171:iadd            
	//   94  172:istore          11
		l1 = j2 + 1;
	//   95  174:iload           8
	//   96  176:iconst_1        
	//   97  177:iadd            
	//   98  178:istore          6
_L2:
		j = i3 + 1;
	//   99  180:iload           11
	//  100  182:iconst_1        
	//  101  183:iadd            
	//  102  184:istore_3        
		int l = ai[i3];
	//  103  185:aload_1         
	//  104  186:iload           11
	//  105  188:iaload          
	//  106  189:istore          4
		i = l1 + 1;
	//  107  191:iload           6
	//  108  193:iconst_1        
	//  109  194:iadd            
	//  110  195:istore_2        
		if(l != ai1[l1])
	//* 111  196:iload           4
	//* 112  198:aload           14
	//* 113  200:iload           6
	//* 114  202:iaload          
	//* 115  203:icmpeq          208
			return false;
	//  116  206:iconst_0        
	//  117  207:ireturn         
		l = j + 1;
	//  118  208:iload_3         
	//  119  209:iconst_1        
	//  120  210:iadd            
	//  121  211:istore          4
		int j1 = ai[j];
	//  122  213:aload_1         
	//  123  214:iload_3         
	//  124  215:iaload          
	//  125  216:istore          5
		j = i + 1;
	//  126  218:iload_2         
	//  127  219:iconst_1        
	//  128  220:iadd            
	//  129  221:istore_3        
		flag = flag1;
	//  130  222:iload           13
	//  131  224:istore          12
		if(j1 == ai1[i])
	//* 132  226:iload           5
	//* 133  228:aload           14
	//* 134  230:iload_2         
	//* 135  231:iaload          
	//* 136  232:icmpne          77
		{
			i = l + 1;
	//  137  235:iload           4
	//  138  237:iconst_1        
	//  139  238:iadd            
	//  140  239:istore_2        
			l = ai[l];
	//  141  240:aload_1         
	//  142  241:iload           4
	//  143  243:iaload          
	//  144  244:istore          4
			int k1 = j + 1;
	//  145  246:iload_3         
	//  146  247:iconst_1        
	//  147  248:iadd            
	//  148  249:istore          5
			if(l != ai1[j])
	//* 149  251:iload           4
	//* 150  253:aload           14
	//* 151  255:iload_3         
	//* 152  256:iaload          
	//* 153  257:icmpeq          262
				return false;
	//  154  260:iconst_0        
	//  155  261:ireturn         
			flag = flag1;
	//  156  262:iload           13
	//  157  264:istore          12
			if(ai[i] == ai1[k1])
	//* 158  266:aload_1         
	//* 159  267:iload_2         
	//* 160  268:iaload          
	//* 161  269:aload           14
	//* 162  271:iload           5
	//* 163  273:iaload          
	//* 164  274:icmpne          77
				return true;
	//  165  277:iconst_1        
	//  166  278:ireturn         
		}
		if(true) goto _L8; else goto _L7
_L7:
	}

	private boolean _verifyLongName2(int ai[], int i, int j)
	{
		int k = 0;
	//    0    0:iconst_0        
	//    1    1:istore          4
		do
		{
			int l = k + 1;
	//    2    3:iload           4
	//    3    5:iconst_1        
	//    4    6:iadd            
	//    5    7:istore          5
			if(ai[k] != _hashArea[j])
	//*   6    9:aload_1         
	//*   7   10:iload           4
	//*   8   12:iaload          
	//*   9   13:aload_0         
	//*  10   14:getfield        #94  <Field int[] _hashArea>
	//*  11   17:iload_3         
	//*  12   18:iaload          
	//*  13   19:icmpeq          24
				return false;
	//   14   22:iconst_0        
	//   15   23:ireturn         
			if(l >= i)
	//*  16   24:iload           5
	//*  17   26:iload_2         
	//*  18   27:icmplt          32
				return true;
	//   19   30:iconst_1        
	//   20   31:ireturn         
			k = l;
	//   21   32:iload           5
	//   22   34:istore          4
			j++;
	//   23   36:iload_3         
	//   24   37:iconst_1        
	//   25   38:iadd            
	//   26   39:istore_3        
		} while(true);
	//   27   40:goto            3
	}

	private void _verifyNeedForRehash()
	{
		if(_count > _hashSize >> 1 && (_spilloverEnd - _spilloverStart() >> 2 > _count + 1 >> 7 || (double)_count > (double)_hashSize * 0.80000000000000004D))
	//*   0    0:aload_0         
	//*   1    1:getfield        #75  <Field int _count>
	//*   2    4:aload_0         
	//*   3    5:getfield        #80  <Field int _hashSize>
	//*   4    8:iconst_1        
	//*   5    9:ishr            
	//*   6   10:icmple          59
	//*   7   13:aload_0         
	//*   8   14:getfield        #104 <Field int _spilloverEnd>
	//*   9   17:aload_0         
	//*  10   18:invokespecial   #151 <Method int _spilloverStart()>
	//*  11   21:isub            
	//*  12   22:iconst_2        
	//*  13   23:ishr            
	//*  14   24:aload_0         
	//*  15   25:getfield        #75  <Field int _count>
	//*  16   28:iconst_1        
	//*  17   29:iadd            
	//*  18   30:bipush          7
	//*  19   32:ishr            
	//*  20   33:icmpgt          54
	//*  21   36:aload_0         
	//*  22   37:getfield        #75  <Field int _count>
	//*  23   40:i2d             
	//*  24   41:aload_0         
	//*  25   42:getfield        #80  <Field int _hashSize>
	//*  26   45:i2d             
	//*  27   46:ldc2w           #163 <Double 0.80000000000000004D>
	//*  28   49:dmul            
	//*  29   50:dcmpl           
	//*  30   51:ifle            59
			_needRehash = true;
	//   31   54:aload_0         
	//   32   55:iconst_1        
	//   33   56:putfield        #111 <Field boolean _needRehash>
	//   34   59:return          
	}

	private void _verifySharing()
	{
		if(_hashShared)
	//*   0    0:aload_0         
	//*   1    1:getfield        #113 <Field boolean _hashShared>
	//*   2    4:ifeq            51
		{
			_hashArea = Arrays.copyOf(_hashArea, _hashArea.length);
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #94  <Field int[] _hashArea>
	//    6   12:aload_0         
	//    7   13:getfield        #94  <Field int[] _hashArea>
	//    8   16:arraylength     
	//    9   17:invokestatic    #130 <Method int[] Arrays.copyOf(int[], int)>
	//   10   20:putfield        #94  <Field int[] _hashArea>
			_names = (String[])Arrays.copyOf(((Object []) (_names)), _names.length);
	//   11   23:aload_0         
	//   12   24:aload_0         
	//   13   25:getfield        #99  <Field String[] _names>
	//   14   28:aload_0         
	//   15   29:getfield        #99  <Field String[] _names>
	//   16   32:arraylength     
	//   17   33:invokestatic    #168 <Method Object[] Arrays.copyOf(Object[], int)>
	//   18   36:checkcast       #169 <Class String[]>
	//   19   39:putfield        #99  <Field String[] _names>
			_hashShared = false;
	//   20   42:aload_0         
	//   21   43:iconst_0        
	//   22   44:putfield        #113 <Field boolean _hashShared>
			_verifyNeedForRehash();
	//   23   47:aload_0         
	//   24   48:invokespecial   #171 <Method void _verifyNeedForRehash()>
		}
		if(_needRehash)
	//*  25   51:aload_0         
	//*  26   52:getfield        #111 <Field boolean _needRehash>
	//*  27   55:ifeq            62
			rehash();
	//   28   58:aload_0         
	//   29   59:invokespecial   #174 <Method void rehash()>
	//   30   62:return          
	}

	public static ByteQuadsCanonicalizer createRoot()
	{
		long l = System.currentTimeMillis();
	//    0    0:invokestatic    #180 <Method long System.currentTimeMillis()>
	//    1    3:lstore_0        
		return createRoot((int)l + (int)(l >>> 32) | 1);
	//    2    4:lload_0         
	//    3    5:l2i             
	//    4    6:lload_0         
	//    5    7:bipush          32
	//    6    9:lushr           
	//    7   10:l2i             
	//    8   11:iadd            
	//    9   12:iconst_1        
	//   10   13:ior             
	//   11   14:invokestatic    #183 <Method ByteQuadsCanonicalizer createRoot(int)>
	//   12   17:areturn         
	}

	protected static ByteQuadsCanonicalizer createRoot(int i)
	{
		return new ByteQuadsCanonicalizer(64, true, i, true);
	//    0    0:new             #2   <Class ByteQuadsCanonicalizer>
	//    1    3:dup             
	//    2    4:bipush          64
	//    3    6:iconst_1        
	//    4    7:iload_0         
	//    5    8:iconst_1        
	//    6    9:invokespecial   #185 <Method void ByteQuadsCanonicalizer(int, boolean, int, boolean)>
	//    7   12:areturn         
	}

	private void mergeChild(TableInfo tableinfo)
	{
		int i = tableinfo.count;
	//    0    0:aload_1         
	//    1    1:getfield        #73  <Field int ByteQuadsCanonicalizer$TableInfo.count>
	//    2    4:istore_2        
		TableInfo tableinfo1 = (TableInfo)_tableInfo.get();
	//    3    5:aload_0         
	//    4    6:getfield        #68  <Field AtomicReference _tableInfo>
	//    5    9:invokevirtual   #191 <Method Object AtomicReference.get()>
	//    6   12:checkcast       #6   <Class ByteQuadsCanonicalizer$TableInfo>
	//    7   15:astore_3        
		if(i == tableinfo1.count)
	//*   8   16:iload_2         
	//*   9   17:aload_3         
	//*  10   18:getfield        #73  <Field int ByteQuadsCanonicalizer$TableInfo.count>
	//*  11   21:icmpne          25
			return;
	//   12   24:return          
		if(i > 6000)
	//*  13   25:iload_2         
	//*  14   26:sipush          6000
	//*  15   29:icmple          38
			tableinfo = TableInfo.createInitial(64);
	//   16   32:bipush          64
	//   17   34:invokestatic    #63  <Method ByteQuadsCanonicalizer$TableInfo ByteQuadsCanonicalizer$TableInfo.createInitial(int)>
	//   18   37:astore_1        
		_tableInfo.compareAndSet(((Object) (tableinfo1)), ((Object) (tableinfo)));
	//   19   38:aload_0         
	//   20   39:getfield        #68  <Field AtomicReference _tableInfo>
	//   21   42:aload_3         
	//   22   43:aload_1         
	//   23   44:invokevirtual   #195 <Method boolean AtomicReference.compareAndSet(Object, Object)>
	//   24   47:pop             
	//   25   48:return          
	}

	private void nukeSymbols(boolean flag)
	{
		_count = 0;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #75  <Field int _count>
		_spilloverEnd = _spilloverStart();
	//    3    5:aload_0         
	//    4    6:aload_0         
	//    5    7:invokespecial   #151 <Method int _spilloverStart()>
	//    6   10:putfield        #104 <Field int _spilloverEnd>
		_longNameOffset = _hashSize << 3;
	//    7   13:aload_0         
	//    8   14:aload_0         
	//    9   15:getfield        #80  <Field int _hashSize>
	//   10   18:iconst_3        
	//   11   19:ishl            
	//   12   20:putfield        #109 <Field int _longNameOffset>
		if(flag)
	//*  13   23:iload_1         
	//*  14   24:ifeq            43
		{
			Arrays.fill(_hashArea, 0);
	//   15   27:aload_0         
	//   16   28:getfield        #94  <Field int[] _hashArea>
	//   17   31:iconst_0        
	//   18   32:invokestatic    #201 <Method void Arrays.fill(int[], int)>
			Arrays.fill(((Object []) (_names)), ((Object) (null)));
	//   19   35:aload_0         
	//   20   36:getfield        #99  <Field String[] _names>
	//   21   39:aconst_null     
	//   22   40:invokestatic    #204 <Method void Arrays.fill(Object[], Object)>
		}
	//   23   43:return          
	}

	private void rehash()
	{
		int i;
		int j;
		int k;
		int l;
		int ai2[];
		String as[];
		_needRehash = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #111 <Field boolean _needRehash>
		_hashShared = false;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #113 <Field boolean _hashShared>
		ai2 = _hashArea;
	//    6   10:aload_0         
	//    7   11:getfield        #94  <Field int[] _hashArea>
	//    8   14:astore          8
		as = _names;
	//    9   16:aload_0         
	//   10   17:getfield        #99  <Field String[] _names>
	//   11   20:astore          9
		i = _hashSize;
	//   12   22:aload_0         
	//   13   23:getfield        #80  <Field int _hashSize>
	//   14   26:istore_1        
		k = _count;
	//   15   27:aload_0         
	//   16   28:getfield        #75  <Field int _count>
	//   17   31:istore_3        
		j = i + i;
	//   18   32:iload_1         
	//   19   33:iload_1         
	//   20   34:iadd            
	//   21   35:istore_2        
		l = _spilloverEnd;
	//   22   36:aload_0         
	//   23   37:getfield        #104 <Field int _spilloverEnd>
	//   24   40:istore          4
		if(j <= 0x10000) goto _L2; else goto _L1
	//   25   42:iload_2         
	//   26   43:ldc1            #14  <Int 0x10000>
	//   27   45:icmple          54
_L1:
		nukeSymbols(true);
	//   28   48:aload_0         
	//   29   49:iconst_1        
	//   30   50:invokespecial   #206 <Method void nukeSymbols(boolean)>
_L8:
		return;
	//   31   53:return          
_L2:
		int ai[];
		_hashArea = new int[ai2.length + (i << 3)];
	//   32   54:aload_0         
	//   33   55:aload           8
	//   34   57:arraylength     
	//   35   58:iload_1         
	//   36   59:iconst_3        
	//   37   60:ishl            
	//   38   61:iadd            
	//   39   62:newarray        int[]
	//   40   64:putfield        #94  <Field int[] _hashArea>
		_hashSize = j;
	//   41   67:aload_0         
	//   42   68:iload_2         
	//   43   69:putfield        #80  <Field int _hashSize>
		_secondaryStart = j << 2;
	//   44   72:aload_0         
	//   45   73:iload_2         
	//   46   74:iconst_2        
	//   47   75:ishl            
	//   48   76:putfield        #82  <Field int _secondaryStart>
		_tertiaryStart = _secondaryStart + (_secondaryStart >> 1);
	//   49   79:aload_0         
	//   50   80:aload_0         
	//   51   81:getfield        #82  <Field int _secondaryStart>
	//   52   84:aload_0         
	//   53   85:getfield        #82  <Field int _secondaryStart>
	//   54   88:iconst_1        
	//   55   89:ishr            
	//   56   90:iadd            
	//   57   91:putfield        #84  <Field int _tertiaryStart>
		_tertiaryShift = _calcTertiaryShift(j);
	//   58   94:aload_0         
	//   59   95:iload_2         
	//   60   96:invokestatic    #208 <Method int _calcTertiaryShift(int)>
	//   61   99:putfield        #89  <Field int _tertiaryShift>
		_names = new String[as.length << 1];
	//   62  102:aload_0         
	//   63  103:aload           9
	//   64  105:arraylength     
	//   65  106:iconst_1        
	//   66  107:ishl            
	//   67  108:anewarray       String[]
	//   68  111:putfield        #99  <Field String[] _names>
		nukeSymbols(false);
	//   69  114:aload_0         
	//   70  115:iconst_0        
	//   71  116:invokespecial   #206 <Method void nukeSymbols(boolean)>
		j = 0;
	//   72  119:iconst_0        
	//   73  120:istore_2        
		ai = new int[16];
	//   74  121:bipush          16
	//   75  123:newarray        int[]
	//   76  125:astore          6
		i = 0;
	//   77  127:iconst_0        
	//   78  128:istore_1        
_L4:
		int i1;
		if(i >= l)
			continue; /* Loop/switch isn't completed */
	//   79  129:iload_1         
	//   80  130:iload           4
	//   81  132:icmpge          341
		i1 = ai2[i + 3];
	//   82  135:aload           8
	//   83  137:iload_1         
	//   84  138:iconst_3        
	//   85  139:iadd            
	//   86  140:iaload          
	//   87  141:istore          5
		if(i1 != 0)
			break; /* Loop/switch isn't completed */
	//   88  143:iload           5
	//   89  145:ifne            155
_L6:
		i += 4;
	//   90  148:iload_1         
	//   91  149:iconst_4        
	//   92  150:iadd            
	//   93  151:istore_1        
		if(true) goto _L4; else goto _L3
	//   94  152:goto            129
_L3:
		j++;
	//   95  155:iload_2         
	//   96  156:iconst_1        
	//   97  157:iadd            
	//   98  158:istore_2        
		String s = as[i >> 2];
	//   99  159:aload           9
	//  100  161:iload_1         
	//  101  162:iconst_2        
	//  102  163:ishr            
	//  103  164:aaload          
	//  104  165:astore          10
		switch(i1)
	//* 105  167:iload           5
		{
	//* 106  169:tableswitch     1 3: default 196
	//	               1 248
	//	               2 269
	//	               3 300
		default:
			int ai1[] = ai;
	//  107  196:aload           6
	//  108  198:astore          7
			if(i1 > ai.length)
	//* 109  200:iload           5
	//* 110  202:aload           6
	//* 111  204:arraylength     
	//* 112  205:icmple          214
				ai1 = new int[i1];
	//  113  208:iload           5
	//  114  210:newarray        int[]
	//  115  212:astore          7
			System.arraycopy(((Object) (ai2)), ai2[i + 1], ((Object) (ai1)), 0, i1);
	//  116  214:aload           8
	//  117  216:aload           8
	//  118  218:iload_1         
	//  119  219:iconst_1        
	//  120  220:iadd            
	//  121  221:iaload          
	//  122  222:aload           7
	//  123  224:iconst_0        
	//  124  225:iload           5
	//  125  227:invokestatic    #136 <Method void System.arraycopy(Object, int, Object, int, int)>
			addName(s, ai1, i1);
	//  126  230:aload_0         
	//  127  231:aload           10
	//  128  233:aload           7
	//  129  235:iload           5
	//  130  237:invokevirtual   #214 <Method String addName(String, int[], int)>
	//  131  240:pop             
			ai = ai1;
	//  132  241:aload           7
	//  133  243:astore          6
			break;

	//* 134  245:goto            148
		case 1: // '\001'
			ai[0] = ai2[i];
	//  135  248:aload           6
	//  136  250:iconst_0        
	//  137  251:aload           8
	//  138  253:iload_1         
	//  139  254:iaload          
	//  140  255:iastore         
			addName(s, ai, 1);
	//  141  256:aload_0         
	//  142  257:aload           10
	//  143  259:aload           6
	//  144  261:iconst_1        
	//  145  262:invokevirtual   #214 <Method String addName(String, int[], int)>
	//  146  265:pop             
			break;

	//* 147  266:goto            148
		case 2: // '\002'
			ai[0] = ai2[i];
	//  148  269:aload           6
	//  149  271:iconst_0        
	//  150  272:aload           8
	//  151  274:iload_1         
	//  152  275:iaload          
	//  153  276:iastore         
			ai[1] = ai2[i + 1];
	//  154  277:aload           6
	//  155  279:iconst_1        
	//  156  280:aload           8
	//  157  282:iload_1         
	//  158  283:iconst_1        
	//  159  284:iadd            
	//  160  285:iaload          
	//  161  286:iastore         
			addName(s, ai, 2);
	//  162  287:aload_0         
	//  163  288:aload           10
	//  164  290:aload           6
	//  165  292:iconst_2        
	//  166  293:invokevirtual   #214 <Method String addName(String, int[], int)>
	//  167  296:pop             
			break;

	//* 168  297:goto            148
		case 3: // '\003'
			ai[0] = ai2[i];
	//  169  300:aload           6
	//  170  302:iconst_0        
	//  171  303:aload           8
	//  172  305:iload_1         
	//  173  306:iaload          
	//  174  307:iastore         
			ai[1] = ai2[i + 1];
	//  175  308:aload           6
	//  176  310:iconst_1        
	//  177  311:aload           8
	//  178  313:iload_1         
	//  179  314:iconst_1        
	//  180  315:iadd            
	//  181  316:iaload          
	//  182  317:iastore         
			ai[2] = ai2[i + 2];
	//  183  318:aload           6
	//  184  320:iconst_2        
	//  185  321:aload           8
	//  186  323:iload_1         
	//  187  324:iconst_2        
	//  188  325:iadd            
	//  189  326:iaload          
	//  190  327:iastore         
			addName(s, ai, 3);
	//  191  328:aload_0         
	//  192  329:aload           10
	//  193  331:aload           6
	//  194  333:iconst_3        
	//  195  334:invokevirtual   #214 <Method String addName(String, int[], int)>
	//  196  337:pop             
			break;
		}
		if(true) goto _L6; else goto _L5
_L5:
	//* 197  338:goto            148
		if(j == k) goto _L8; else goto _L7
	//  198  341:iload_2         
	//  199  342:iload_3         
	//  200  343:icmpeq          53
_L7:
		throw new IllegalStateException((new StringBuilder()).append("Failed rehash(): old count=").append(k).append(", copyCount=").append(j).toString());
	//  201  346:new             #216 <Class IllegalStateException>
	//  202  349:dup             
	//  203  350:new             #218 <Class StringBuilder>
	//  204  353:dup             
	//  205  354:invokespecial   #219 <Method void StringBuilder()>
	//  206  357:ldc1            #221 <String "Failed rehash(): old count=">
	//  207  359:invokevirtual   #225 <Method StringBuilder StringBuilder.append(String)>
	//  208  362:iload_3         
	//  209  363:invokevirtual   #228 <Method StringBuilder StringBuilder.append(int)>
	//  210  366:ldc1            #230 <String ", copyCount=">
	//  211  368:invokevirtual   #225 <Method StringBuilder StringBuilder.append(String)>
	//  212  371:iload_2         
	//  213  372:invokevirtual   #228 <Method StringBuilder StringBuilder.append(int)>
	//  214  375:invokevirtual   #234 <Method String StringBuilder.toString()>
	//  215  378:invokespecial   #237 <Method void IllegalStateException(String)>
	//  216  381:athrow          
	}

	protected void _reportTooManyCollisions()
	{
		if(_hashSize <= 1024)
	//*   0    0:aload_0         
	//*   1    1:getfield        #80  <Field int _hashSize>
	//*   2    4:sipush          1024
	//*   3    7:icmpgt          11
			return;
	//    4   10:return          
		else
			throw new IllegalStateException((new StringBuilder()).append("Spill-over slots in symbol table with ").append(_count).append(" entries, hash area of ").append(_hashSize).append(" slots is now full (all ").append(_hashSize >> 3).append(" slots -- suspect a DoS attack based on hash collisions.").append(" You can disable the check via `JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW`").toString());
	//    5   11:new             #216 <Class IllegalStateException>
	//    6   14:dup             
	//    7   15:new             #218 <Class StringBuilder>
	//    8   18:dup             
	//    9   19:invokespecial   #219 <Method void StringBuilder()>
	//   10   22:ldc1            #239 <String "Spill-over slots in symbol table with ">
	//   11   24:invokevirtual   #225 <Method StringBuilder StringBuilder.append(String)>
	//   12   27:aload_0         
	//   13   28:getfield        #75  <Field int _count>
	//   14   31:invokevirtual   #228 <Method StringBuilder StringBuilder.append(int)>
	//   15   34:ldc1            #241 <String " entries, hash area of ">
	//   16   36:invokevirtual   #225 <Method StringBuilder StringBuilder.append(String)>
	//   17   39:aload_0         
	//   18   40:getfield        #80  <Field int _hashSize>
	//   19   43:invokevirtual   #228 <Method StringBuilder StringBuilder.append(int)>
	//   20   46:ldc1            #243 <String " slots is now full (all ">
	//   21   48:invokevirtual   #225 <Method StringBuilder StringBuilder.append(String)>
	//   22   51:aload_0         
	//   23   52:getfield        #80  <Field int _hashSize>
	//   24   55:iconst_3        
	//   25   56:ishr            
	//   26   57:invokevirtual   #228 <Method StringBuilder StringBuilder.append(int)>
	//   27   60:ldc1            #245 <String " slots -- suspect a DoS attack based on hash collisions.">
	//   28   62:invokevirtual   #225 <Method StringBuilder StringBuilder.append(String)>
	//   29   65:ldc1            #247 <String " You can disable the check via `JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW`">
	//   30   67:invokevirtual   #225 <Method StringBuilder StringBuilder.append(String)>
	//   31   70:invokevirtual   #234 <Method String StringBuilder.toString()>
	//   32   73:invokespecial   #237 <Method void IllegalStateException(String)>
	//   33   76:athrow          
	}

	public String addName(String s, int i)
	{
		_verifySharing();
	//    0    0:aload_0         
	//    1    1:invokespecial   #250 <Method void _verifySharing()>
		String s1 = s;
	//    2    4:aload_1         
	//    3    5:astore          4
		if(_intern)
	//*   4    7:aload_0         
	//*   5    8:getfield        #55  <Field boolean _intern>
	//*   6   11:ifeq            23
			s1 = InternCache.instance.intern(s);
	//    7   14:getstatic       #256 <Field InternCache InternCache.instance>
	//    8   17:aload_1         
	//    9   18:invokevirtual   #260 <Method String InternCache.intern(String)>
	//   10   21:astore          4
		int j = _findOffsetForAdd(calcHash(i));
	//   11   23:aload_0         
	//   12   24:aload_0         
	//   13   25:iload_2         
	//   14   26:invokevirtual   #263 <Method int calcHash(int)>
	//   15   29:invokespecial   #265 <Method int _findOffsetForAdd(int)>
	//   16   32:istore_3        
		_hashArea[j] = i;
	//   17   33:aload_0         
	//   18   34:getfield        #94  <Field int[] _hashArea>
	//   19   37:iload_3         
	//   20   38:iload_2         
	//   21   39:iastore         
		_hashArea[j + 3] = 1;
	//   22   40:aload_0         
	//   23   41:getfield        #94  <Field int[] _hashArea>
	//   24   44:iload_3         
	//   25   45:iconst_3        
	//   26   46:iadd            
	//   27   47:iconst_1        
	//   28   48:iastore         
		_names[j >> 2] = s1;
	//   29   49:aload_0         
	//   30   50:getfield        #99  <Field String[] _names>
	//   31   53:iload_3         
	//   32   54:iconst_2        
	//   33   55:ishr            
	//   34   56:aload           4
	//   35   58:aastore         
		_count = _count + 1;
	//   36   59:aload_0         
	//   37   60:aload_0         
	//   38   61:getfield        #75  <Field int _count>
	//   39   64:iconst_1        
	//   40   65:iadd            
	//   41   66:putfield        #75  <Field int _count>
		_verifyNeedForRehash();
	//   42   69:aload_0         
	//   43   70:invokespecial   #171 <Method void _verifyNeedForRehash()>
		return s1;
	//   44   73:aload           4
	//   45   75:areturn         
	}

	public String addName(String s, int i, int j)
	{
		_verifySharing();
	//    0    0:aload_0         
	//    1    1:invokespecial   #250 <Method void _verifySharing()>
		String s1 = s;
	//    2    4:aload_1         
	//    3    5:astore          5
		if(_intern)
	//*   4    7:aload_0         
	//*   5    8:getfield        #55  <Field boolean _intern>
	//*   6   11:ifeq            23
			s1 = InternCache.instance.intern(s);
	//    7   14:getstatic       #256 <Field InternCache InternCache.instance>
	//    8   17:aload_1         
	//    9   18:invokevirtual   #260 <Method String InternCache.intern(String)>
	//   10   21:astore          5
		int k;
		if(j == 0)
	//*  11   23:iload_3         
	//*  12   24:ifne            98
			k = calcHash(i);
	//   13   27:aload_0         
	//   14   28:iload_2         
	//   15   29:invokevirtual   #263 <Method int calcHash(int)>
	//   16   32:istore          4
		else
	//*  17   34:aload_0         
	//*  18   35:iload           4
	//*  19   37:invokespecial   #265 <Method int _findOffsetForAdd(int)>
	//*  20   40:istore          4
	//*  21   42:aload_0         
	//*  22   43:getfield        #94  <Field int[] _hashArea>
	//*  23   46:iload           4
	//*  24   48:iload_2         
	//*  25   49:iastore         
	//*  26   50:aload_0         
	//*  27   51:getfield        #94  <Field int[] _hashArea>
	//*  28   54:iload           4
	//*  29   56:iconst_1        
	//*  30   57:iadd            
	//*  31   58:iload_3         
	//*  32   59:iastore         
	//*  33   60:aload_0         
	//*  34   61:getfield        #94  <Field int[] _hashArea>
	//*  35   64:iload           4
	//*  36   66:iconst_3        
	//*  37   67:iadd            
	//*  38   68:iconst_2        
	//*  39   69:iastore         
	//*  40   70:aload_0         
	//*  41   71:getfield        #99  <Field String[] _names>
	//*  42   74:iload           4
	//*  43   76:iconst_2        
	//*  44   77:ishr            
	//*  45   78:aload           5
	//*  46   80:aastore         
	//*  47   81:aload_0         
	//*  48   82:aload_0         
	//*  49   83:getfield        #75  <Field int _count>
	//*  50   86:iconst_1        
	//*  51   87:iadd            
	//*  52   88:putfield        #75  <Field int _count>
	//*  53   91:aload_0         
	//*  54   92:invokespecial   #171 <Method void _verifyNeedForRehash()>
	//*  55   95:aload           5
	//*  56   97:areturn         
			k = calcHash(i, j);
	//   57   98:aload_0         
	//   58   99:iload_2         
	//   59  100:iload_3         
	//   60  101:invokevirtual   #268 <Method int calcHash(int, int)>
	//   61  104:istore          4
		k = _findOffsetForAdd(k);
		_hashArea[k] = i;
		_hashArea[k + 1] = j;
		_hashArea[k + 3] = 2;
		_names[k >> 2] = s1;
		_count = _count + 1;
		_verifyNeedForRehash();
		return s1;
	//*  62  106:goto            34
	}

	public String addName(String s, int i, int j, int k)
	{
		_verifySharing();
	//    0    0:aload_0         
	//    1    1:invokespecial   #250 <Method void _verifySharing()>
		String s1 = s;
	//    2    4:aload_1         
	//    3    5:astore          6
		if(_intern)
	//*   4    7:aload_0         
	//*   5    8:getfield        #55  <Field boolean _intern>
	//*   6   11:ifeq            23
			s1 = InternCache.instance.intern(s);
	//    7   14:getstatic       #256 <Field InternCache InternCache.instance>
	//    8   17:aload_1         
	//    9   18:invokevirtual   #260 <Method String InternCache.intern(String)>
	//   10   21:astore          6
		int l = _findOffsetForAdd(calcHash(i, j, k));
	//   11   23:aload_0         
	//   12   24:aload_0         
	//   13   25:iload_2         
	//   14   26:iload_3         
	//   15   27:iload           4
	//   16   29:invokevirtual   #272 <Method int calcHash(int, int, int)>
	//   17   32:invokespecial   #265 <Method int _findOffsetForAdd(int)>
	//   18   35:istore          5
		_hashArea[l] = i;
	//   19   37:aload_0         
	//   20   38:getfield        #94  <Field int[] _hashArea>
	//   21   41:iload           5
	//   22   43:iload_2         
	//   23   44:iastore         
		_hashArea[l + 1] = j;
	//   24   45:aload_0         
	//   25   46:getfield        #94  <Field int[] _hashArea>
	//   26   49:iload           5
	//   27   51:iconst_1        
	//   28   52:iadd            
	//   29   53:iload_3         
	//   30   54:iastore         
		_hashArea[l + 2] = k;
	//   31   55:aload_0         
	//   32   56:getfield        #94  <Field int[] _hashArea>
	//   33   59:iload           5
	//   34   61:iconst_2        
	//   35   62:iadd            
	//   36   63:iload           4
	//   37   65:iastore         
		_hashArea[l + 3] = 3;
	//   38   66:aload_0         
	//   39   67:getfield        #94  <Field int[] _hashArea>
	//   40   70:iload           5
	//   41   72:iconst_3        
	//   42   73:iadd            
	//   43   74:iconst_3        
	//   44   75:iastore         
		_names[l >> 2] = s1;
	//   45   76:aload_0         
	//   46   77:getfield        #99  <Field String[] _names>
	//   47   80:iload           5
	//   48   82:iconst_2        
	//   49   83:ishr            
	//   50   84:aload           6
	//   51   86:aastore         
		_count = _count + 1;
	//   52   87:aload_0         
	//   53   88:aload_0         
	//   54   89:getfield        #75  <Field int _count>
	//   55   92:iconst_1        
	//   56   93:iadd            
	//   57   94:putfield        #75  <Field int _count>
		_verifyNeedForRehash();
	//   58   97:aload_0         
	//   59   98:invokespecial   #171 <Method void _verifyNeedForRehash()>
		return s1;
	//   60  101:aload           6
	//   61  103:areturn         
	}

	public String addName(String s, int ai[], int i)
	{
		String s1;
		_verifySharing();
	//    0    0:aload_0         
	//    1    1:invokespecial   #250 <Method void _verifySharing()>
		s1 = s;
	//    2    4:aload_1         
	//    3    5:astore          6
		if(_intern)
	//*   4    7:aload_0         
	//*   5    8:getfield        #55  <Field boolean _intern>
	//*   6   11:ifeq            23
			s1 = InternCache.instance.intern(s);
	//    7   14:getstatic       #256 <Field InternCache InternCache.instance>
	//    8   17:aload_1         
	//    9   18:invokevirtual   #260 <Method String InternCache.intern(String)>
	//   10   21:astore          6
		i;
	//   11   23:iload_3         
		JVM INSTR tableswitch 1 3: default 52
	//	               1 136
	//	               2 169
	//	               3 216;
	//   12   24:tableswitch     1 3: default 52
	//	               1 136
	//	               2 169
	//	               3 216
		   goto _L1 _L2 _L3 _L4
_L1:
		int k = calcHash(ai, i);
	//   13   52:aload_0         
	//   14   53:aload_2         
	//   15   54:iload_3         
	//   16   55:invokevirtual   #274 <Method int calcHash(int[], int)>
	//   17   58:istore          5
		int j = _findOffsetForAdd(k);
	//   18   60:aload_0         
	//   19   61:iload           5
	//   20   63:invokespecial   #265 <Method int _findOffsetForAdd(int)>
	//   21   66:istore          4
		_hashArea[j] = k;
	//   22   68:aload_0         
	//   23   69:getfield        #94  <Field int[] _hashArea>
	//   24   72:iload           4
	//   25   74:iload           5
	//   26   76:iastore         
		k = _appendLongName(ai, i);
	//   27   77:aload_0         
	//   28   78:aload_2         
	//   29   79:iload_3         
	//   30   80:invokespecial   #276 <Method int _appendLongName(int[], int)>
	//   31   83:istore          5
		_hashArea[j + 1] = k;
	//   32   85:aload_0         
	//   33   86:getfield        #94  <Field int[] _hashArea>
	//   34   89:iload           4
	//   35   91:iconst_1        
	//   36   92:iadd            
	//   37   93:iload           5
	//   38   95:iastore         
		_hashArea[j + 3] = i;
	//   39   96:aload_0         
	//   40   97:getfield        #94  <Field int[] _hashArea>
	//   41  100:iload           4
	//   42  102:iconst_3        
	//   43  103:iadd            
	//   44  104:iload_3         
	//   45  105:iastore         
		i = j;
	//   46  106:iload           4
	//   47  108:istore_3        
_L6:
		_names[i >> 2] = s1;
	//   48  109:aload_0         
	//   49  110:getfield        #99  <Field String[] _names>
	//   50  113:iload_3         
	//   51  114:iconst_2        
	//   52  115:ishr            
	//   53  116:aload           6
	//   54  118:aastore         
		_count = _count + 1;
	//   55  119:aload_0         
	//   56  120:aload_0         
	//   57  121:getfield        #75  <Field int _count>
	//   58  124:iconst_1        
	//   59  125:iadd            
	//   60  126:putfield        #75  <Field int _count>
		_verifyNeedForRehash();
	//   61  129:aload_0         
	//   62  130:invokespecial   #171 <Method void _verifyNeedForRehash()>
		return s1;
	//   63  133:aload           6
	//   64  135:areturn         
_L2:
		i = _findOffsetForAdd(calcHash(ai[0]));
	//   65  136:aload_0         
	//   66  137:aload_0         
	//   67  138:aload_2         
	//   68  139:iconst_0        
	//   69  140:iaload          
	//   70  141:invokevirtual   #263 <Method int calcHash(int)>
	//   71  144:invokespecial   #265 <Method int _findOffsetForAdd(int)>
	//   72  147:istore_3        
		_hashArea[i] = ai[0];
	//   73  148:aload_0         
	//   74  149:getfield        #94  <Field int[] _hashArea>
	//   75  152:iload_3         
	//   76  153:aload_2         
	//   77  154:iconst_0        
	//   78  155:iaload          
	//   79  156:iastore         
		_hashArea[i + 3] = 1;
	//   80  157:aload_0         
	//   81  158:getfield        #94  <Field int[] _hashArea>
	//   82  161:iload_3         
	//   83  162:iconst_3        
	//   84  163:iadd            
	//   85  164:iconst_1        
	//   86  165:iastore         
		continue; /* Loop/switch isn't completed */
	//   87  166:goto            109
_L3:
		i = _findOffsetForAdd(calcHash(ai[0], ai[1]));
	//   88  169:aload_0         
	//   89  170:aload_0         
	//   90  171:aload_2         
	//   91  172:iconst_0        
	//   92  173:iaload          
	//   93  174:aload_2         
	//   94  175:iconst_1        
	//   95  176:iaload          
	//   96  177:invokevirtual   #268 <Method int calcHash(int, int)>
	//   97  180:invokespecial   #265 <Method int _findOffsetForAdd(int)>
	//   98  183:istore_3        
		_hashArea[i] = ai[0];
	//   99  184:aload_0         
	//  100  185:getfield        #94  <Field int[] _hashArea>
	//  101  188:iload_3         
	//  102  189:aload_2         
	//  103  190:iconst_0        
	//  104  191:iaload          
	//  105  192:iastore         
		_hashArea[i + 1] = ai[1];
	//  106  193:aload_0         
	//  107  194:getfield        #94  <Field int[] _hashArea>
	//  108  197:iload_3         
	//  109  198:iconst_1        
	//  110  199:iadd            
	//  111  200:aload_2         
	//  112  201:iconst_1        
	//  113  202:iaload          
	//  114  203:iastore         
		_hashArea[i + 3] = 2;
	//  115  204:aload_0         
	//  116  205:getfield        #94  <Field int[] _hashArea>
	//  117  208:iload_3         
	//  118  209:iconst_3        
	//  119  210:iadd            
	//  120  211:iconst_2        
	//  121  212:iastore         
		continue; /* Loop/switch isn't completed */
	//  122  213:goto            109
_L4:
		i = _findOffsetForAdd(calcHash(ai[0], ai[1], ai[2]));
	//  123  216:aload_0         
	//  124  217:aload_0         
	//  125  218:aload_2         
	//  126  219:iconst_0        
	//  127  220:iaload          
	//  128  221:aload_2         
	//  129  222:iconst_1        
	//  130  223:iaload          
	//  131  224:aload_2         
	//  132  225:iconst_2        
	//  133  226:iaload          
	//  134  227:invokevirtual   #272 <Method int calcHash(int, int, int)>
	//  135  230:invokespecial   #265 <Method int _findOffsetForAdd(int)>
	//  136  233:istore_3        
		_hashArea[i] = ai[0];
	//  137  234:aload_0         
	//  138  235:getfield        #94  <Field int[] _hashArea>
	//  139  238:iload_3         
	//  140  239:aload_2         
	//  141  240:iconst_0        
	//  142  241:iaload          
	//  143  242:iastore         
		_hashArea[i + 1] = ai[1];
	//  144  243:aload_0         
	//  145  244:getfield        #94  <Field int[] _hashArea>
	//  146  247:iload_3         
	//  147  248:iconst_1        
	//  148  249:iadd            
	//  149  250:aload_2         
	//  150  251:iconst_1        
	//  151  252:iaload          
	//  152  253:iastore         
		_hashArea[i + 2] = ai[2];
	//  153  254:aload_0         
	//  154  255:getfield        #94  <Field int[] _hashArea>
	//  155  258:iload_3         
	//  156  259:iconst_2        
	//  157  260:iadd            
	//  158  261:aload_2         
	//  159  262:iconst_2        
	//  160  263:iaload          
	//  161  264:iastore         
		_hashArea[i + 3] = 3;
	//  162  265:aload_0         
	//  163  266:getfield        #94  <Field int[] _hashArea>
	//  164  269:iload_3         
	//  165  270:iconst_3        
	//  166  271:iadd            
	//  167  272:iconst_3        
	//  168  273:iastore         
		if(true) goto _L6; else goto _L5
	//  169  274:goto            109
_L5:
	}

	public int bucketCount()
	{
		return _hashSize;
	//    0    0:aload_0         
	//    1    1:getfield        #80  <Field int _hashSize>
	//    2    4:ireturn         
	}

	public int calcHash(int i)
	{
		i ^= _seed;
	//    0    0:iload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #53  <Field int _seed>
	//    3    5:ixor            
	//    4    6:istore_1        
		i += i >>> 16;
	//    5    7:iload_1         
	//    6    8:iload_1         
	//    7    9:bipush          16
	//    8   11:iushr           
	//    9   12:iadd            
	//   10   13:istore_1        
		i ^= i << 3;
	//   11   14:iload_1         
	//   12   15:iload_1         
	//   13   16:iconst_3        
	//   14   17:ishl            
	//   15   18:ixor            
	//   16   19:istore_1        
		return i + (i >>> 12);
	//   17   20:iload_1         
	//   18   21:iload_1         
	//   19   22:bipush          12
	//   20   24:iushr           
	//   21   25:iadd            
	//   22   26:ireturn         
	}

	public int calcHash(int i, int j)
	{
		i += i >>> 15;
	//    0    0:iload_1         
	//    1    1:iload_1         
	//    2    2:bipush          15
	//    3    4:iushr           
	//    4    5:iadd            
	//    5    6:istore_1        
		i = (i ^ i >>> 9) + j * 33 ^ _seed;
	//    6    7:iload_1         
	//    7    8:iload_1         
	//    8    9:bipush          9
	//    9   11:iushr           
	//   10   12:ixor            
	//   11   13:iload_2         
	//   12   14:bipush          33
	//   13   16:imul            
	//   14   17:iadd            
	//   15   18:aload_0         
	//   16   19:getfield        #53  <Field int _seed>
	//   17   22:ixor            
	//   18   23:istore_1        
		i += i >>> 16;
	//   19   24:iload_1         
	//   20   25:iload_1         
	//   21   26:bipush          16
	//   22   28:iushr           
	//   23   29:iadd            
	//   24   30:istore_1        
		i ^= i >>> 4;
	//   25   31:iload_1         
	//   26   32:iload_1         
	//   27   33:iconst_4        
	//   28   34:iushr           
	//   29   35:ixor            
	//   30   36:istore_1        
		return i + (i << 3);
	//   31   37:iload_1         
	//   32   38:iload_1         
	//   33   39:iconst_3        
	//   34   40:ishl            
	//   35   41:iadd            
	//   36   42:ireturn         
	}

	public int calcHash(int i, int j, int k)
	{
		i ^= _seed;
	//    0    0:iload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #53  <Field int _seed>
	//    3    5:ixor            
	//    4    6:istore_1        
		i = ((i + (i >>> 9)) * 31 + j) * 33;
	//    5    7:iload_1         
	//    6    8:iload_1         
	//    7    9:bipush          9
	//    8   11:iushr           
	//    9   12:iadd            
	//   10   13:bipush          31
	//   11   15:imul            
	//   12   16:iload_2         
	//   13   17:iadd            
	//   14   18:bipush          33
	//   15   20:imul            
	//   16   21:istore_1        
		i = i + (i >>> 15) ^ k;
	//   17   22:iload_1         
	//   18   23:iload_1         
	//   19   24:bipush          15
	//   20   26:iushr           
	//   21   27:iadd            
	//   22   28:iload_3         
	//   23   29:ixor            
	//   24   30:istore_1        
		i += i >>> 4;
	//   25   31:iload_1         
	//   26   32:iload_1         
	//   27   33:iconst_4        
	//   28   34:iushr           
	//   29   35:iadd            
	//   30   36:istore_1        
		i += i >>> 15;
	//   31   37:iload_1         
	//   32   38:iload_1         
	//   33   39:bipush          15
	//   34   41:iushr           
	//   35   42:iadd            
	//   36   43:istore_1        
		return i ^ i << 9;
	//   37   44:iload_1         
	//   38   45:iload_1         
	//   39   46:bipush          9
	//   40   48:ishl            
	//   41   49:ixor            
	//   42   50:ireturn         
	}

	public int calcHash(int ai[], int i)
	{
		if(i < 4)
	//*   0    0:iload_2         
	//*   1    1:iconst_4        
	//*   2    2:icmpge          13
			throw new IllegalArgumentException();
	//    3    5:new             #279 <Class IllegalArgumentException>
	//    4    8:dup             
	//    5    9:invokespecial   #280 <Method void IllegalArgumentException()>
	//    6   12:athrow          
		int j = ai[0] ^ _seed;
	//    7   13:aload_1         
	//    8   14:iconst_0        
	//    9   15:iaload          
	//   10   16:aload_0         
	//   11   17:getfield        #53  <Field int _seed>
	//   12   20:ixor            
	//   13   21:istore_3        
		j = j + (j >>> 9) + ai[1];
	//   14   22:iload_3         
	//   15   23:iload_3         
	//   16   24:bipush          9
	//   17   26:iushr           
	//   18   27:iadd            
	//   19   28:aload_1         
	//   20   29:iconst_1        
	//   21   30:iaload          
	//   22   31:iadd            
	//   23   32:istore_3        
		j = (j + (j >>> 15)) * 33 ^ ai[2];
	//   24   33:iload_3         
	//   25   34:iload_3         
	//   26   35:bipush          15
	//   27   37:iushr           
	//   28   38:iadd            
	//   29   39:bipush          33
	//   30   41:imul            
	//   31   42:aload_1         
	//   32   43:iconst_2        
	//   33   44:iaload          
	//   34   45:ixor            
	//   35   46:istore_3        
		int l = j + (j >>> 4);
	//   36   47:iload_3         
	//   37   48:iload_3         
	//   38   49:iconst_4        
	//   39   50:iushr           
	//   40   51:iadd            
	//   41   52:istore          4
		for(int k = 3; k < i; k++)
	//*  42   54:iconst_3        
	//*  43   55:istore_3        
	//*  44   56:iload_3         
	//*  45   57:iload_2         
	//*  46   58:icmpge          86
		{
			int i1 = ai[k];
	//   47   61:aload_1         
	//   48   62:iload_3         
	//   49   63:iaload          
	//   50   64:istore          5
			l += i1 ^ i1 >> 21;
	//   51   66:iload           4
	//   52   68:iload           5
	//   53   70:iload           5
	//   54   72:bipush          21
	//   55   74:ishr            
	//   56   75:ixor            
	//   57   76:iadd            
	//   58   77:istore          4
		}

	//   59   79:iload_3         
	//   60   80:iconst_1        
	//   61   81:iadd            
	//   62   82:istore_3        
	//*  63   83:goto            56
		i = l * 0x1003f;
	//   64   86:iload           4
	//   65   88:ldc1            #20  <Int 0x1003f>
	//   66   90:imul            
	//   67   91:istore_2        
		i += i >>> 19;
	//   68   92:iload_2         
	//   69   93:iload_2         
	//   70   94:bipush          19
	//   71   96:iushr           
	//   72   97:iadd            
	//   73   98:istore_2        
		return i ^ i << 5;
	//   74   99:iload_2         
	//   75  100:iload_2         
	//   76  101:iconst_5        
	//   77  102:ishl            
	//   78  103:ixor            
	//   79  104:ireturn         
	}

	public String findName(int i)
	{
		int j;
		int k;
		Object obj;
		int ai[];
		obj = null;
	//    0    0:aconst_null     
	//    1    1:astore          6
		j = _calcOffset(calcHash(i));
	//    2    3:aload_0         
	//    3    4:aload_0         
	//    4    5:iload_1         
	//    5    6:invokevirtual   #263 <Method int calcHash(int)>
	//    6    9:invokespecial   #142 <Method int _calcOffset(int)>
	//    7   12:istore_2        
		ai = _hashArea;
	//    8   13:aload_0         
	//    9   14:getfield        #94  <Field int[] _hashArea>
	//   10   17:astore          7
		k = ai[j + 3];
	//   11   19:aload           7
	//   12   21:iload_2         
	//   13   22:iconst_3        
	//   14   23:iadd            
	//   15   24:iaload          
	//   16   25:istore_3        
		if(k != 1) goto _L2; else goto _L1
	//   17   26:iload_3         
	//   18   27:iconst_1        
	//   19   28:icmpne          52
_L1:
		if(ai[j] != i) goto _L4; else goto _L3
	//   20   31:aload           7
	//   21   33:iload_2         
	//   22   34:iaload          
	//   23   35:iload_1         
	//   24   36:icmpne          60
_L3:
		String s = _names[j >> 2];
	//   25   39:aload_0         
	//   26   40:getfield        #99  <Field String[] _names>
	//   27   43:iload_2         
	//   28   44:iconst_2        
	//   29   45:ishr            
	//   30   46:aaload          
	//   31   47:astore          5
_L5:
		return s;
	//   32   49:aload           5
	//   33   51:areturn         
_L2:
		s = ((String) (obj));
	//   34   52:aload           6
	//   35   54:astore          5
		if(k == 0) goto _L5; else goto _L4
	//   36   56:iload_3         
	//   37   57:ifeq            49
_L4:
		int i1;
		int l = _secondaryStart + ((j >> 3) << 2);
	//   38   60:aload_0         
	//   39   61:getfield        #82  <Field int _secondaryStart>
	//   40   64:iload_2         
	//   41   65:iconst_3        
	//   42   66:ishr            
	//   43   67:iconst_2        
	//   44   68:ishl            
	//   45   69:iadd            
	//   46   70:istore_3        
		i1 = ai[l + 3];
	//   47   71:aload           7
	//   48   73:iload_3         
	//   49   74:iconst_3        
	//   50   75:iadd            
	//   51   76:iaload          
	//   52   77:istore          4
		if(i1 == 1)
	//*  53   79:iload           4
	//*  54   81:iconst_1        
	//*  55   82:icmpne          102
		{
			if(ai[l] == i)
	//*  56   85:aload           7
	//*  57   87:iload_3         
	//*  58   88:iaload          
	//*  59   89:iload_1         
	//*  60   90:icmpne          111
				return _names[l >> 2];
	//   61   93:aload_0         
	//   62   94:getfield        #99  <Field String[] _names>
	//   63   97:iload_3         
	//   64   98:iconst_2        
	//   65   99:ishr            
	//   66  100:aaload          
	//   67  101:areturn         
			break; /* Loop/switch isn't completed */
		}
		s = ((String) (obj));
	//   68  102:aload           6
	//   69  104:astore          5
		if(i1 == 0) goto _L5; else goto _L6
	//   70  106:iload           4
	//   71  108:ifeq            49
_L6:
		return _findSecondary(j, i);
	//   72  111:aload_0         
	//   73  112:iload_2         
	//   74  113:iload_1         
	//   75  114:invokespecial   #284 <Method String _findSecondary(int, int)>
	//   76  117:areturn         
	}

	public String findName(int i, int j)
	{
		int k;
		int l;
		Object obj;
		int ai[];
		obj = null;
	//    0    0:aconst_null     
	//    1    1:astore          7
		k = _calcOffset(calcHash(i, j));
	//    2    3:aload_0         
	//    3    4:aload_0         
	//    4    5:iload_1         
	//    5    6:iload_2         
	//    6    7:invokevirtual   #268 <Method int calcHash(int, int)>
	//    7   10:invokespecial   #142 <Method int _calcOffset(int)>
	//    8   13:istore_3        
		ai = _hashArea;
	//    9   14:aload_0         
	//   10   15:getfield        #94  <Field int[] _hashArea>
	//   11   18:astore          8
		l = ai[k + 3];
	//   12   20:aload           8
	//   13   22:iload_3         
	//   14   23:iconst_3        
	//   15   24:iadd            
	//   16   25:iaload          
	//   17   26:istore          4
		if(l != 2) goto _L2; else goto _L1
	//   18   28:iload           4
	//   19   30:iconst_2        
	//   20   31:icmpne          65
_L1:
		if(i != ai[k] || j != ai[k + 1]) goto _L4; else goto _L3
	//   21   34:iload_1         
	//   22   35:aload           8
	//   23   37:iload_3         
	//   24   38:iaload          
	//   25   39:icmpne          74
	//   26   42:iload_2         
	//   27   43:aload           8
	//   28   45:iload_3         
	//   29   46:iconst_1        
	//   30   47:iadd            
	//   31   48:iaload          
	//   32   49:icmpne          74
_L3:
		String s = _names[k >> 2];
	//   33   52:aload_0         
	//   34   53:getfield        #99  <Field String[] _names>
	//   35   56:iload_3         
	//   36   57:iconst_2        
	//   37   58:ishr            
	//   38   59:aaload          
	//   39   60:astore          6
_L5:
		return s;
	//   40   62:aload           6
	//   41   64:areturn         
_L2:
		s = ((String) (obj));
	//   42   65:aload           7
	//   43   67:astore          6
		if(l == 0) goto _L5; else goto _L4
	//   44   69:iload           4
	//   45   71:ifeq            62
_L4:
		int j1;
		int i1 = _secondaryStart + ((k >> 3) << 2);
	//   46   74:aload_0         
	//   47   75:getfield        #82  <Field int _secondaryStart>
	//   48   78:iload_3         
	//   49   79:iconst_3        
	//   50   80:ishr            
	//   51   81:iconst_2        
	//   52   82:ishl            
	//   53   83:iadd            
	//   54   84:istore          4
		j1 = ai[i1 + 3];
	//   55   86:aload           8
	//   56   88:iload           4
	//   57   90:iconst_3        
	//   58   91:iadd            
	//   59   92:iaload          
	//   60   93:istore          5
		if(j1 == 2)
	//*  61   95:iload           5
	//*  62   97:iconst_2        
	//*  63   98:icmpne          131
		{
			if(i == ai[i1] && j == ai[i1 + 1])
	//*  64  101:iload_1         
	//*  65  102:aload           8
	//*  66  104:iload           4
	//*  67  106:iaload          
	//*  68  107:icmpne          140
	//*  69  110:iload_2         
	//*  70  111:aload           8
	//*  71  113:iload           4
	//*  72  115:iconst_1        
	//*  73  116:iadd            
	//*  74  117:iaload          
	//*  75  118:icmpne          140
				return _names[i1 >> 2];
	//   76  121:aload_0         
	//   77  122:getfield        #99  <Field String[] _names>
	//   78  125:iload           4
	//   79  127:iconst_2        
	//   80  128:ishr            
	//   81  129:aaload          
	//   82  130:areturn         
			break; /* Loop/switch isn't completed */
		}
		s = ((String) (obj));
	//   83  131:aload           7
	//   84  133:astore          6
		if(j1 == 0) goto _L5; else goto _L6
	//   85  135:iload           5
	//   86  137:ifeq            62
_L6:
		return _findSecondary(k, i, j);
	//   87  140:aload_0         
	//   88  141:iload_3         
	//   89  142:iload_1         
	//   90  143:iload_2         
	//   91  144:invokespecial   #286 <Method String _findSecondary(int, int, int)>
	//   92  147:areturn         
	}

	public String findName(int i, int j, int k)
	{
		int l;
		int i1;
		Object obj;
		int ai[];
		obj = null;
	//    0    0:aconst_null     
	//    1    1:astore          8
		l = _calcOffset(calcHash(i, j, k));
	//    2    3:aload_0         
	//    3    4:aload_0         
	//    4    5:iload_1         
	//    5    6:iload_2         
	//    6    7:iload_3         
	//    7    8:invokevirtual   #272 <Method int calcHash(int, int, int)>
	//    8   11:invokespecial   #142 <Method int _calcOffset(int)>
	//    9   14:istore          4
		ai = _hashArea;
	//   10   16:aload_0         
	//   11   17:getfield        #94  <Field int[] _hashArea>
	//   12   20:astore          9
		i1 = ai[l + 3];
	//   13   22:aload           9
	//   14   24:iload           4
	//   15   26:iconst_3        
	//   16   27:iadd            
	//   17   28:iaload          
	//   18   29:istore          5
		if(i1 != 3) goto _L2; else goto _L1
	//   19   31:iload           5
	//   20   33:iconst_3        
	//   21   34:icmpne          82
_L1:
		if(i != ai[l] || ai[l + 1] != j || ai[l + 2] != k) goto _L4; else goto _L3
	//   22   37:iload_1         
	//   23   38:aload           9
	//   24   40:iload           4
	//   25   42:iaload          
	//   26   43:icmpne          91
	//   27   46:aload           9
	//   28   48:iload           4
	//   29   50:iconst_1        
	//   30   51:iadd            
	//   31   52:iaload          
	//   32   53:iload_2         
	//   33   54:icmpne          91
	//   34   57:aload           9
	//   35   59:iload           4
	//   36   61:iconst_2        
	//   37   62:iadd            
	//   38   63:iaload          
	//   39   64:iload_3         
	//   40   65:icmpne          91
_L3:
		String s = _names[l >> 2];
	//   41   68:aload_0         
	//   42   69:getfield        #99  <Field String[] _names>
	//   43   72:iload           4
	//   44   74:iconst_2        
	//   45   75:ishr            
	//   46   76:aaload          
	//   47   77:astore          7
_L5:
		return s;
	//   48   79:aload           7
	//   49   81:areturn         
_L2:
		s = ((String) (obj));
	//   50   82:aload           8
	//   51   84:astore          7
		if(i1 == 0) goto _L5; else goto _L4
	//   52   86:iload           5
	//   53   88:ifeq            79
_L4:
		int k1;
		int j1 = _secondaryStart + ((l >> 3) << 2);
	//   54   91:aload_0         
	//   55   92:getfield        #82  <Field int _secondaryStart>
	//   56   95:iload           4
	//   57   97:iconst_3        
	//   58   98:ishr            
	//   59   99:iconst_2        
	//   60  100:ishl            
	//   61  101:iadd            
	//   62  102:istore          5
		k1 = ai[j1 + 3];
	//   63  104:aload           9
	//   64  106:iload           5
	//   65  108:iconst_3        
	//   66  109:iadd            
	//   67  110:iaload          
	//   68  111:istore          6
		if(k1 == 3)
	//*  69  113:iload           6
	//*  70  115:iconst_3        
	//*  71  116:icmpne          160
		{
			if(i == ai[j1] && ai[j1 + 1] == j && ai[j1 + 2] == k)
	//*  72  119:iload_1         
	//*  73  120:aload           9
	//*  74  122:iload           5
	//*  75  124:iaload          
	//*  76  125:icmpne          169
	//*  77  128:aload           9
	//*  78  130:iload           5
	//*  79  132:iconst_1        
	//*  80  133:iadd            
	//*  81  134:iaload          
	//*  82  135:iload_2         
	//*  83  136:icmpne          169
	//*  84  139:aload           9
	//*  85  141:iload           5
	//*  86  143:iconst_2        
	//*  87  144:iadd            
	//*  88  145:iaload          
	//*  89  146:iload_3         
	//*  90  147:icmpne          169
				return _names[j1 >> 2];
	//   91  150:aload_0         
	//   92  151:getfield        #99  <Field String[] _names>
	//   93  154:iload           5
	//   94  156:iconst_2        
	//   95  157:ishr            
	//   96  158:aaload          
	//   97  159:areturn         
			break; /* Loop/switch isn't completed */
		}
		s = ((String) (obj));
	//   98  160:aload           8
	//   99  162:astore          7
		if(k1 == 0) goto _L5; else goto _L6
	//  100  164:iload           6
	//  101  166:ifeq            79
_L6:
		return _findSecondary(l, i, j, k);
	//  102  169:aload_0         
	//  103  170:iload           4
	//  104  172:iload_1         
	//  105  173:iload_2         
	//  106  174:iload_3         
	//  107  175:invokespecial   #288 <Method String _findSecondary(int, int, int, int)>
	//  108  178:areturn         
	}

	public String findName(int ai[], int i)
	{
		Object obj = null;
	//    0    0:aconst_null     
	//    1    1:astore          9
		if(i >= 4) goto _L2; else goto _L1
	//    2    3:iload_2         
	//    3    4:iconst_4        
	//    4    5:icmpge          55
_L1:
		if(i != 3) goto _L4; else goto _L3
	//    5    8:iload_2         
	//    6    9:iconst_3        
	//    7   10:icmpne          31
_L3:
		String s = findName(ai[0], ai[1], ai[2]);
	//    8   13:aload_0         
	//    9   14:aload_1         
	//   10   15:iconst_0        
	//   11   16:iaload          
	//   12   17:aload_1         
	//   13   18:iconst_1        
	//   14   19:iaload          
	//   15   20:aload_1         
	//   16   21:iconst_2        
	//   17   22:iaload          
	//   18   23:invokevirtual   #291 <Method String findName(int, int, int)>
	//   19   26:astore          8
_L6:
		return s;
	//   20   28:aload           8
	//   21   30:areturn         
_L4:
		if(i == 2)
	//*  22   31:iload_2         
	//*  23   32:iconst_2        
	//*  24   33:icmpne          47
			return findName(ai[0], ai[1]);
	//   25   36:aload_0         
	//   26   37:aload_1         
	//   27   38:iconst_0        
	//   28   39:iaload          
	//   29   40:aload_1         
	//   30   41:iconst_1        
	//   31   42:iaload          
	//   32   43:invokevirtual   #293 <Method String findName(int, int)>
	//   33   46:areturn         
		else
			return findName(ai[0]);
	//   34   47:aload_0         
	//   35   48:aload_1         
	//   36   49:iconst_0        
	//   37   50:iaload          
	//   38   51:invokevirtual   #295 <Method String findName(int)>
	//   39   54:areturn         
_L2:
		int j = calcHash(ai, i);
	//   40   55:aload_0         
	//   41   56:aload_1         
	//   42   57:iload_2         
	//   43   58:invokevirtual   #274 <Method int calcHash(int[], int)>
	//   44   61:istore_3        
		int k = _calcOffset(j);
	//   45   62:aload_0         
	//   46   63:iload_3         
	//   47   64:invokespecial   #142 <Method int _calcOffset(int)>
	//   48   67:istore          4
		int ai1[] = _hashArea;
	//   49   69:aload_0         
	//   50   70:getfield        #94  <Field int[] _hashArea>
	//   51   73:astore          10
		int l = ai1[k + 3];
	//   52   75:aload           10
	//   53   77:iload           4
	//   54   79:iconst_3        
	//   55   80:iadd            
	//   56   81:iaload          
	//   57   82:istore          5
		if(j == ai1[k] && l == i && _verifyLongName(ai, i, ai1[k + 1]))
	//*  58   84:iload_3         
	//*  59   85:aload           10
	//*  60   87:iload           4
	//*  61   89:iaload          
	//*  62   90:icmpne          125
	//*  63   93:iload           5
	//*  64   95:iload_2         
	//*  65   96:icmpne          125
	//*  66   99:aload_0         
	//*  67  100:aload_1         
	//*  68  101:iload_2         
	//*  69  102:aload           10
	//*  70  104:iload           4
	//*  71  106:iconst_1        
	//*  72  107:iadd            
	//*  73  108:iaload          
	//*  74  109:invokespecial   #158 <Method boolean _verifyLongName(int[], int, int)>
	//*  75  112:ifeq            125
			return _names[k >> 2];
	//   76  115:aload_0         
	//   77  116:getfield        #99  <Field String[] _names>
	//   78  119:iload           4
	//   79  121:iconst_2        
	//   80  122:ishr            
	//   81  123:aaload          
	//   82  124:areturn         
		s = ((String) (obj));
	//   83  125:aload           9
	//   84  127:astore          8
		if(l != 0)
	//*  85  129:iload           5
	//*  86  131:ifeq            28
		{
			int i1 = _secondaryStart + ((k >> 3) << 2);
	//   87  134:aload_0         
	//   88  135:getfield        #82  <Field int _secondaryStart>
	//   89  138:iload           4
	//   90  140:iconst_3        
	//   91  141:ishr            
	//   92  142:iconst_2        
	//   93  143:ishl            
	//   94  144:iadd            
	//   95  145:istore          6
			int j1 = ai1[i1 + 3];
	//   96  147:aload           10
	//   97  149:iload           6
	//   98  151:iconst_3        
	//   99  152:iadd            
	//  100  153:iaload          
	//  101  154:istore          7
			if(j == ai1[i1] && j1 == i && _verifyLongName(ai, i, ai1[i1 + 1]))
	//* 102  156:iload_3         
	//* 103  157:aload           10
	//* 104  159:iload           6
	//* 105  161:iaload          
	//* 106  162:icmpne          197
	//* 107  165:iload           7
	//* 108  167:iload_2         
	//* 109  168:icmpne          197
	//* 110  171:aload_0         
	//* 111  172:aload_1         
	//* 112  173:iload_2         
	//* 113  174:aload           10
	//* 114  176:iload           6
	//* 115  178:iconst_1        
	//* 116  179:iadd            
	//* 117  180:iaload          
	//* 118  181:invokespecial   #158 <Method boolean _verifyLongName(int[], int, int)>
	//* 119  184:ifeq            197
				return _names[i1 >> 2];
	//  120  187:aload_0         
	//  121  188:getfield        #99  <Field String[] _names>
	//  122  191:iload           6
	//  123  193:iconst_2        
	//  124  194:ishr            
	//  125  195:aaload          
	//  126  196:areturn         
			s = ((String) (obj));
	//  127  197:aload           9
	//  128  199:astore          8
			if(l != 0)
	//* 129  201:iload           5
	//* 130  203:ifeq            28
				return _findSecondary(k, j, ai, i);
	//  131  206:aload_0         
	//  132  207:iload           4
	//  133  209:iload_3         
	//  134  210:aload_1         
	//  135  211:iload_2         
	//  136  212:invokespecial   #297 <Method String _findSecondary(int, int, int[], int)>
	//  137  215:areturn         
		}
		if(true) goto _L6; else goto _L5
_L5:
	}

	public int hashSeed()
	{
		return _seed;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field int _seed>
	//    2    4:ireturn         
	}

	public ByteQuadsCanonicalizer makeChild(int i)
	{
		return new ByteQuadsCanonicalizer(this, com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES.enabledIn(i), _seed, com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW.enabledIn(i), (TableInfo)_tableInfo.get());
	//    0    0:new             #2   <Class ByteQuadsCanonicalizer>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getstatic       #305 <Field com.fasterxml.jackson.core.JsonFactory$Feature com.fasterxml.jackson.core.JsonFactory$Feature.INTERN_FIELD_NAMES>
	//    4    8:iload_1         
	//    5    9:invokevirtual   #309 <Method boolean com.fasterxml.jackson.core.JsonFactory$Feature.enabledIn(int)>
	//    6   12:aload_0         
	//    7   13:getfield        #53  <Field int _seed>
	//    8   16:getstatic       #312 <Field com.fasterxml.jackson.core.JsonFactory$Feature com.fasterxml.jackson.core.JsonFactory$Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW>
	//    9   19:iload_1         
	//   10   20:invokevirtual   #309 <Method boolean com.fasterxml.jackson.core.JsonFactory$Feature.enabledIn(int)>
	//   11   23:aload_0         
	//   12   24:getfield        #68  <Field AtomicReference _tableInfo>
	//   13   27:invokevirtual   #191 <Method Object AtomicReference.get()>
	//   14   30:checkcast       #6   <Class ByteQuadsCanonicalizer$TableInfo>
	//   15   33:invokespecial   #314 <Method void ByteQuadsCanonicalizer(ByteQuadsCanonicalizer, boolean, int, boolean, ByteQuadsCanonicalizer$TableInfo)>
	//   16   36:areturn         
	}

	public boolean maybeDirty()
	{
		return !_hashShared;
	//    0    0:aload_0         
	//    1    1:getfield        #113 <Field boolean _hashShared>
	//    2    4:ifne            9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	public int primaryCount()
	{
		int j = 0;
	//    0    0:iconst_0        
	//    1    1:istore_2        
		int i = 3;
	//    2    2:iconst_3        
	//    3    3:istore_1        
		for(int l = _secondaryStart; i < l;)
	//*   4    4:aload_0         
	//*   5    5:getfield        #82  <Field int _secondaryStart>
	//*   6    8:istore          4
	//*   7   10:iload_1         
	//*   8   11:iload           4
	//*   9   13:icmpge          40
		{
			int k = j;
	//   10   16:iload_2         
	//   11   17:istore_3        
			if(_hashArea[i] != 0)
	//*  12   18:aload_0         
	//*  13   19:getfield        #94  <Field int[] _hashArea>
	//*  14   22:iload_1         
	//*  15   23:iaload          
	//*  16   24:ifeq            31
				k = j + 1;
	//   17   27:iload_2         
	//   18   28:iconst_1        
	//   19   29:iadd            
	//   20   30:istore_3        
			i += 4;
	//   21   31:iload_1         
	//   22   32:iconst_4        
	//   23   33:iadd            
	//   24   34:istore_1        
			j = k;
	//   25   35:iload_3         
	//   26   36:istore_2        
		}

	//*  27   37:goto            10
		return j;
	//   28   40:iload_2         
	//   29   41:ireturn         
	}

	public void release()
	{
		if(_parent != null && maybeDirty())
	//*   0    0:aload_0         
	//*   1    1:getfield        #51  <Field ByteQuadsCanonicalizer _parent>
	//*   2    4:ifnull          34
	//*   3    7:aload_0         
	//*   4    8:invokevirtual   #320 <Method boolean maybeDirty()>
	//*   5   11:ifeq            34
		{
			_parent.mergeChild(new TableInfo(this));
	//    6   14:aload_0         
	//    7   15:getfield        #51  <Field ByteQuadsCanonicalizer _parent>
	//    8   18:new             #6   <Class ByteQuadsCanonicalizer$TableInfo>
	//    9   21:dup             
	//   10   22:aload_0         
	//   11   23:invokespecial   #323 <Method void ByteQuadsCanonicalizer$TableInfo(ByteQuadsCanonicalizer)>
	//   12   26:invokespecial   #325 <Method void mergeChild(ByteQuadsCanonicalizer$TableInfo)>
			_hashShared = true;
	//   13   29:aload_0         
	//   14   30:iconst_1        
	//   15   31:putfield        #113 <Field boolean _hashShared>
		}
	//   16   34:return          
	}

	public int secondaryCount()
	{
		int j = 0;
	//    0    0:iconst_0        
	//    1    1:istore_2        
		int i = _secondaryStart + 3;
	//    2    2:aload_0         
	//    3    3:getfield        #82  <Field int _secondaryStart>
	//    4    6:iconst_3        
	//    5    7:iadd            
	//    6    8:istore_1        
		for(int l = _tertiaryStart; i < l;)
	//*   7    9:aload_0         
	//*   8   10:getfield        #84  <Field int _tertiaryStart>
	//*   9   13:istore          4
	//*  10   15:iload_1         
	//*  11   16:iload           4
	//*  12   18:icmpge          45
		{
			int k = j;
	//   13   21:iload_2         
	//   14   22:istore_3        
			if(_hashArea[i] != 0)
	//*  15   23:aload_0         
	//*  16   24:getfield        #94  <Field int[] _hashArea>
	//*  17   27:iload_1         
	//*  18   28:iaload          
	//*  19   29:ifeq            36
				k = j + 1;
	//   20   32:iload_2         
	//   21   33:iconst_1        
	//   22   34:iadd            
	//   23   35:istore_3        
			i += 4;
	//   24   36:iload_1         
	//   25   37:iconst_4        
	//   26   38:iadd            
	//   27   39:istore_1        
			j = k;
	//   28   40:iload_3         
	//   29   41:istore_2        
		}

	//*  30   42:goto            15
		return j;
	//   31   45:iload_2         
	//   32   46:ireturn         
	}

	public int size()
	{
		if(_tableInfo != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #68  <Field AtomicReference _tableInfo>
	//*   2    4:ifnull          21
			return ((TableInfo)_tableInfo.get()).count;
	//    3    7:aload_0         
	//    4    8:getfield        #68  <Field AtomicReference _tableInfo>
	//    5   11:invokevirtual   #191 <Method Object AtomicReference.get()>
	//    6   14:checkcast       #6   <Class ByteQuadsCanonicalizer$TableInfo>
	//    7   17:getfield        #73  <Field int ByteQuadsCanonicalizer$TableInfo.count>
	//    8   20:ireturn         
		else
			return _count;
	//    9   21:aload_0         
	//   10   22:getfield        #75  <Field int _count>
	//   11   25:ireturn         
	}

	public int spilloverCount()
	{
		return _spilloverEnd - _spilloverStart() >> 2;
	//    0    0:aload_0         
	//    1    1:getfield        #104 <Field int _spilloverEnd>
	//    2    4:aload_0         
	//    3    5:invokespecial   #151 <Method int _spilloverStart()>
	//    4    8:isub            
	//    5    9:iconst_2        
	//    6   10:ishr            
	//    7   11:ireturn         
	}

	public int tertiaryCount()
	{
		int j = 0;
	//    0    0:iconst_0        
	//    1    1:istore_2        
		int k = _tertiaryStart + 3;
	//    2    2:aload_0         
	//    3    3:getfield        #84  <Field int _tertiaryStart>
	//    4    6:iconst_3        
	//    5    7:iadd            
	//    6    8:istore_3        
		int i1 = _hashSize;
	//    7    9:aload_0         
	//    8   10:getfield        #80  <Field int _hashSize>
	//    9   13:istore          5
		int i = k;
	//   10   15:iload_3         
	//   11   16:istore_1        
		do
		{
			int l = i;
	//   12   17:iload_1         
	//   13   18:istore          4
			if(l < k + i1)
	//*  14   20:iload           4
	//*  15   22:iload_3         
	//*  16   23:iload           5
	//*  17   25:iadd            
	//*  18   26:icmpge          59
			{
				i = j;
	//   19   29:iload_2         
	//   20   30:istore_1        
				if(_hashArea[l] != 0)
	//*  21   31:aload_0         
	//*  22   32:getfield        #94  <Field int[] _hashArea>
	//*  23   35:iload           4
	//*  24   37:iaload          
	//*  25   38:ifeq            45
					i = j + 1;
	//   26   41:iload_2         
	//   27   42:iconst_1        
	//   28   43:iadd            
	//   29   44:istore_1        
				l += 4;
	//   30   45:iload           4
	//   31   47:iconst_4        
	//   32   48:iadd            
	//   33   49:istore          4
				j = i;
	//   34   51:iload_1         
	//   35   52:istore_2        
				i = l;
	//   36   53:iload           4
	//   37   55:istore_1        
			} else
	//*  38   56:goto            17
			{
				return j;
	//   39   59:iload_2         
	//   40   60:ireturn         
			}
		} while(true);
	}

	public String toString()
	{
		int i = primaryCount();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #330 <Method int primaryCount()>
	//    2    4:istore_1        
		int j = secondaryCount();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #332 <Method int secondaryCount()>
	//    5    9:istore_2        
		int k = tertiaryCount();
	//    6   10:aload_0         
	//    7   11:invokevirtual   #334 <Method int tertiaryCount()>
	//    8   14:istore_3        
		int l = spilloverCount();
	//    9   15:aload_0         
	//   10   16:invokevirtual   #336 <Method int spilloverCount()>
	//   11   19:istore          4
		int i1 = totalCount();
	//   12   21:aload_0         
	//   13   22:invokevirtual   #339 <Method int totalCount()>
	//   14   25:istore          5
		return String.format("[%s: size=%d, hashSize=%d, %d/%d/%d/%d pri/sec/ter/spill (=%s), total:%d]", new Object[] {
			((Object)this).getClass().getName(), Integer.valueOf(_count), Integer.valueOf(_hashSize), Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(k), Integer.valueOf(l), Integer.valueOf(i1), Integer.valueOf(i + j + k + l), Integer.valueOf(i1)
		});
	//   15   27:ldc2            #341 <String "[%s: size=%d, hashSize=%d, %d/%d/%d/%d pri/sec/ter/spill (=%s), total:%d]">
	//   16   30:bipush          10
	//   17   32:anewarray       Object[]
	//   18   35:dup             
	//   19   36:iconst_0        
	//   20   37:aload_0         
	//   21   38:invokevirtual   #345 <Method Class Object.getClass()>
	//   22   41:invokevirtual   #350 <Method String Class.getName()>
	//   23   44:aastore         
	//   24   45:dup             
	//   25   46:iconst_1        
	//   26   47:aload_0         
	//   27   48:getfield        #75  <Field int _count>
	//   28   51:invokestatic    #356 <Method Integer Integer.valueOf(int)>
	//   29   54:aastore         
	//   30   55:dup             
	//   31   56:iconst_2        
	//   32   57:aload_0         
	//   33   58:getfield        #80  <Field int _hashSize>
	//   34   61:invokestatic    #356 <Method Integer Integer.valueOf(int)>
	//   35   64:aastore         
	//   36   65:dup             
	//   37   66:iconst_3        
	//   38   67:iload_1         
	//   39   68:invokestatic    #356 <Method Integer Integer.valueOf(int)>
	//   40   71:aastore         
	//   41   72:dup             
	//   42   73:iconst_4        
	//   43   74:iload_2         
	//   44   75:invokestatic    #356 <Method Integer Integer.valueOf(int)>
	//   45   78:aastore         
	//   46   79:dup             
	//   47   80:iconst_5        
	//   48   81:iload_3         
	//   49   82:invokestatic    #356 <Method Integer Integer.valueOf(int)>
	//   50   85:aastore         
	//   51   86:dup             
	//   52   87:bipush          6
	//   53   89:iload           4
	//   54   91:invokestatic    #356 <Method Integer Integer.valueOf(int)>
	//   55   94:aastore         
	//   56   95:dup             
	//   57   96:bipush          7
	//   58   98:iload           5
	//   59  100:invokestatic    #356 <Method Integer Integer.valueOf(int)>
	//   60  103:aastore         
	//   61  104:dup             
	//   62  105:bipush          8
	//   63  107:iload_1         
	//   64  108:iload_2         
	//   65  109:iadd            
	//   66  110:iload_3         
	//   67  111:iadd            
	//   68  112:iload           4
	//   69  114:iadd            
	//   70  115:invokestatic    #356 <Method Integer Integer.valueOf(int)>
	//   71  118:aastore         
	//   72  119:dup             
	//   73  120:bipush          9
	//   74  122:iload           5
	//   75  124:invokestatic    #356 <Method Integer Integer.valueOf(int)>
	//   76  127:aastore         
	//   77  128:invokestatic    #360 <Method String String.format(String, Object[])>
	//   78  131:areturn         
	}

	public int totalCount()
	{
		int j = 0;
	//    0    0:iconst_0        
	//    1    1:istore_2        
		int i = 3;
	//    2    2:iconst_3        
	//    3    3:istore_1        
		for(int l = _hashSize; i < l << 3;)
	//*   4    4:aload_0         
	//*   5    5:getfield        #80  <Field int _hashSize>
	//*   6    8:istore          4
	//*   7   10:iload_1         
	//*   8   11:iload           4
	//*   9   13:iconst_3        
	//*  10   14:ishl            
	//*  11   15:icmpge          42
		{
			int k = j;
	//   12   18:iload_2         
	//   13   19:istore_3        
			if(_hashArea[i] != 0)
	//*  14   20:aload_0         
	//*  15   21:getfield        #94  <Field int[] _hashArea>
	//*  16   24:iload_1         
	//*  17   25:iaload          
	//*  18   26:ifeq            33
				k = j + 1;
	//   19   29:iload_2         
	//   20   30:iconst_1        
	//   21   31:iadd            
	//   22   32:istore_3        
			i += 4;
	//   23   33:iload_1         
	//   24   34:iconst_4        
	//   25   35:iadd            
	//   26   36:istore_1        
			j = k;
	//   27   37:iload_3         
	//   28   38:istore_2        
		}

	//*  29   39:goto            10
		return j;
	//   30   42:iload_2         
	//   31   43:ireturn         
	}

	private static final int DEFAULT_T_SIZE = 64;
	static final int MAX_ENTRIES_FOR_REUSE = 6000;
	private static final int MAX_T_SIZE = 0x10000;
	static final int MIN_HASH_SIZE = 16;
	private static final int MULT = 33;
	private static final int MULT2 = 0x1003f;
	private static final int MULT3 = 31;
	protected int _count;
	protected final boolean _failOnDoS;
	protected int _hashArea[];
	private boolean _hashShared;
	protected int _hashSize;
	protected boolean _intern;
	protected int _longNameOffset;
	protected String _names[];
	private transient boolean _needRehash;
	protected final ByteQuadsCanonicalizer _parent;
	protected int _secondaryStart;
	private final int _seed;
	protected int _spilloverEnd;
	protected final AtomicReference _tableInfo;
	protected int _tertiaryShift;
	protected int _tertiaryStart;
}
