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
		//    9   11:invokestatic    #68  <Method int ByteQuadsCanonicalizer._calcTertiaryShift(int)>
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
		//   20   27:invokespecial   #72  <Method void ByteQuadsCanonicalizer$TableInfo(int, int, int, int[], String[], int, int)>
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
		//    4    6:invokestatic    #42  <Method int ByteQuadsCanonicalizer.access$000(ByteQuadsCanonicalizer)>
		//    5    9:putfield        #24  <Field int size>
			count = bytequadscanonicalizer._count;
		//    6   12:aload_0         
		//    7   13:aload_1         
		//    8   14:invokestatic    #45  <Method int ByteQuadsCanonicalizer.access$100(ByteQuadsCanonicalizer)>
		//    9   17:putfield        #26  <Field int count>
			tertiaryShift = bytequadscanonicalizer._tertiaryShift;
		//   10   20:aload_0         
		//   11   21:aload_1         
		//   12   22:invokestatic    #48  <Method int ByteQuadsCanonicalizer.access$200(ByteQuadsCanonicalizer)>
		//   13   25:putfield        #28  <Field int tertiaryShift>
			mainHash = bytequadscanonicalizer._hashArea;
		//   14   28:aload_0         
		//   15   29:aload_1         
		//   16   30:invokestatic    #52  <Method int[] ByteQuadsCanonicalizer.access$300(ByteQuadsCanonicalizer)>
		//   17   33:putfield        #30  <Field int[] mainHash>
			names = bytequadscanonicalizer._names;
		//   18   36:aload_0         
		//   19   37:aload_1         
		//   20   38:invokestatic    #56  <Method String[] ByteQuadsCanonicalizer.access$400(ByteQuadsCanonicalizer)>
		//   21   41:putfield        #32  <Field String[] names>
			spilloverEnd = bytequadscanonicalizer._spilloverEnd;
		//   22   44:aload_0         
		//   23   45:aload_1         
		//   24   46:invokestatic    #59  <Method int ByteQuadsCanonicalizer.access$500(ByteQuadsCanonicalizer)>
		//   25   49:putfield        #34  <Field int spilloverEnd>
			longNameOffset = bytequadscanonicalizer._longNameOffset;
		//   26   52:aload_0         
		//   27   53:aload_1         
		//   28   54:invokestatic    #62  <Method int ByteQuadsCanonicalizer.access$600(ByteQuadsCanonicalizer)>
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
		j = 16;
	//   14   25:bipush          16
	//   15   27:istore_3        
		int k;
		if(i < 16)
	//*  16   28:iload_1         
	//*  17   29:bipush          16
	//*  18   31:icmpge          40
			k = j;
	//   19   34:iload_3         
	//   20   35:istore          5
		else
	//*  21   37:goto            66
		if((i - 1 & i) != 0)
	//*  22   40:iload_1         
	//*  23   41:iconst_1        
	//*  24   42:isub            
	//*  25   43:iload_1         
	//*  26   44:iand            
	//*  27   45:ifeq            63
			do
			{
				k = j;
	//   28   48:iload_3         
	//   29   49:istore          5
				if(j >= i)
					break;
	//   30   51:iload_3         
	//   31   52:iload_1         
	//   32   53:icmpge          66
				j += j;
	//   33   56:iload_3         
	//   34   57:iload_3         
	//   35   58:iadd            
	//   36   59:istore_3        
			} while(true);
	//   37   60:goto            48
		else
			k = i;
	//   38   63:iload_1         
	//   39   64:istore          5
		_tableInfo = new AtomicReference(((Object) (TableInfo.createInitial(k))));
	//   40   66:aload_0         
	//   41   67:new             #59  <Class AtomicReference>
	//   42   70:dup             
	//   43   71:iload           5
	//   44   73:invokestatic    #63  <Method ByteQuadsCanonicalizer$TableInfo ByteQuadsCanonicalizer$TableInfo.createInitial(int)>
	//   45   76:invokespecial   #66  <Method void AtomicReference(Object)>
	//   46   79:putfield        #68  <Field AtomicReference _tableInfo>
	//   47   82:return          
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
		int l = j + i;
	//    3    5:iload_3         
	//    4    6:iload_2         
	//    5    7:iadd            
	//    6    8:istore          5
		if(l > _hashArea.length)
	//*   7   10:iload           5
	//*   8   12:aload_0         
	//*   9   13:getfield        #94  <Field int[] _hashArea>
	//*  10   16:arraylength     
	//*  11   17:icmple          74
		{
			int i1 = _hashArea.length;
	//   12   20:aload_0         
	//   13   21:getfield        #94  <Field int[] _hashArea>
	//   14   24:arraylength     
	//   15   25:istore          6
			int j1 = Math.min(4096, _hashSize);
	//   16   27:sipush          4096
	//   17   30:aload_0         
	//   18   31:getfield        #80  <Field int _hashSize>
	//   19   34:invokestatic    #121 <Method int Math.min(int, int)>
	//   20   37:istore          7
			int k = _hashArea.length;
	//   21   39:aload_0         
	//   22   40:getfield        #94  <Field int[] _hashArea>
	//   23   43:arraylength     
	//   24   44:istore          4
			l = Math.max(l - i1, j1);
	//   25   46:iload           5
	//   26   48:iload           6
	//   27   50:isub            
	//   28   51:iload           7
	//   29   53:invokestatic    #124 <Method int Math.max(int, int)>
	//   30   56:istore          5
			_hashArea = Arrays.copyOf(_hashArea, k + l);
	//   31   58:aload_0         
	//   32   59:aload_0         
	//   33   60:getfield        #94  <Field int[] _hashArea>
	//   34   63:iload           4
	//   35   65:iload           5
	//   36   67:iadd            
	//   37   68:invokestatic    #130 <Method int[] Arrays.copyOf(int[], int)>
	//   38   71:putfield        #94  <Field int[] _hashArea>
		}
		System.arraycopy(((Object) (ai)), 0, ((Object) (_hashArea)), j, i);
	//   39   74:aload_1         
	//   40   75:iconst_0        
	//   41   76:aload_0         
	//   42   77:getfield        #94  <Field int[] _hashArea>
	//   43   80:iload_3         
	//   44   81:iload_2         
	//   45   82:invokestatic    #136 <Method void System.arraycopy(Object, int, Object, int, int)>
		_longNameOffset = _longNameOffset + i;
	//   46   85:aload_0         
	//   47   86:aload_0         
	//   48   87:getfield        #109 <Field int _longNameOffset>
	//   49   90:iload_2         
	//   50   91:iadd            
	//   51   92:putfield        #109 <Field int _longNameOffset>
		return j;
	//   52   95:iload_3         
	//   53   96:ireturn         
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
		i = _calcOffset(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #142 <Method int _calcOffset(int)>
	//    3    5:istore_1        
		int ai[] = _hashArea;
	//    4    6:aload_0         
	//    5    7:getfield        #94  <Field int[] _hashArea>
	//    6   10:astore          4
		if(ai[i + 3] == 0)
	//*   7   12:aload           4
	//*   8   14:iload_1         
	//*   9   15:iconst_3        
	//*  10   16:iadd            
	//*  11   17:iaload          
	//*  12   18:ifne            23
			return i;
	//   13   21:iload_1         
	//   14   22:ireturn         
		int j = _secondaryStart + ((i >> 3) << 2);
	//   15   23:aload_0         
	//   16   24:getfield        #82  <Field int _secondaryStart>
	//   17   27:iload_1         
	//   18   28:iconst_3        
	//   19   29:ishr            
	//   20   30:iconst_2        
	//   21   31:ishl            
	//   22   32:iadd            
	//   23   33:istore_2        
		if(ai[j + 3] == 0)
	//*  24   34:aload           4
	//*  25   36:iload_2         
	//*  26   37:iconst_3        
	//*  27   38:iadd            
	//*  28   39:iaload          
	//*  29   40:ifne            45
			return j;
	//   30   43:iload_2         
	//   31   44:ireturn         
		j = _tertiaryStart + ((i >> _tertiaryShift + 2) << _tertiaryShift);
	//   32   45:aload_0         
	//   33   46:getfield        #84  <Field int _tertiaryStart>
	//   34   49:iload_1         
	//   35   50:aload_0         
	//   36   51:getfield        #89  <Field int _tertiaryShift>
	//   37   54:iconst_2        
	//   38   55:iadd            
	//   39   56:ishr            
	//   40   57:aload_0         
	//   41   58:getfield        #89  <Field int _tertiaryShift>
	//   42   61:ishl            
	//   43   62:iadd            
	//   44   63:istore_2        
		int k = _tertiaryShift;
	//   45   64:aload_0         
	//   46   65:getfield        #89  <Field int _tertiaryShift>
	//   47   68:istore_3        
		for(i = j; i < (1 << k) + j; i += 4)
	//*  48   69:iload_2         
	//*  49   70:istore_1        
	//*  50   71:iload_1         
	//*  51   72:iconst_1        
	//*  52   73:iload_3         
	//*  53   74:ishl            
	//*  54   75:iload_2         
	//*  55   76:iadd            
	//*  56   77:icmpge          98
			if(ai[i + 3] == 0)
	//*  57   80:aload           4
	//*  58   82:iload_1         
	//*  59   83:iconst_3        
	//*  60   84:iadd            
	//*  61   85:iaload          
	//*  62   86:ifne            91
				return i;
	//   63   89:iload_1         
	//   64   90:ireturn         

	//   65   91:iload_1         
	//   66   92:iconst_4        
	//   67   93:iadd            
	//   68   94:istore_1        
	//*  69   95:goto            71
		i = _spilloverEnd;
	//   70   98:aload_0         
	//   71   99:getfield        #104 <Field int _spilloverEnd>
	//   72  102:istore_1        
		_spilloverEnd = _spilloverEnd + 4;
	//   73  103:aload_0         
	//   74  104:aload_0         
	//   75  105:getfield        #104 <Field int _spilloverEnd>
	//   76  108:iconst_4        
	//   77  109:iadd            
	//   78  110:putfield        #104 <Field int _spilloverEnd>
		j = _hashSize;
	//   79  113:aload_0         
	//   80  114:getfield        #80  <Field int _hashSize>
	//   81  117:istore_2        
		if(_spilloverEnd >= j << 3)
	//*  82  118:aload_0         
	//*  83  119:getfield        #104 <Field int _spilloverEnd>
	//*  84  122:iload_2         
	//*  85  123:iconst_3        
	//*  86  124:ishl            
	//*  87  125:icmplt          144
		{
			if(_failOnDoS)
	//*  88  128:aload_0         
	//*  89  129:getfield        #57  <Field boolean _failOnDoS>
	//*  90  132:ifeq            139
				_reportTooManyCollisions();
	//   91  135:aload_0         
	//   92  136:invokevirtual   #145 <Method void _reportTooManyCollisions()>
			_needRehash = true;
	//   93  139:aload_0         
	//   94  140:iconst_1        
	//   95  141:putfield        #111 <Field boolean _needRehash>
		}
		return i;
	//   96  144:iload_1         
	//   97  145:ireturn         
	}

	private String _findSecondary(int i, int j)
	{
		int k = _tertiaryStart + ((i >> _tertiaryShift + 2) << _tertiaryShift);
	//    0    0:aload_0         
	//    1    1:getfield        #84  <Field int _tertiaryStart>
	//    2    4:iload_1         
	//    3    5:aload_0         
	//    4    6:getfield        #89  <Field int _tertiaryShift>
	//    5    9:iconst_2        
	//    6   10:iadd            
	//    7   11:ishr            
	//    8   12:aload_0         
	//    9   13:getfield        #89  <Field int _tertiaryShift>
	//   10   16:ishl            
	//   11   17:iadd            
	//   12   18:istore_3        
		int ai[] = _hashArea;
	//   13   19:aload_0         
	//   14   20:getfield        #94  <Field int[] _hashArea>
	//   15   23:astore          6
		int l = _tertiaryShift;
	//   16   25:aload_0         
	//   17   26:getfield        #89  <Field int _tertiaryShift>
	//   18   29:istore          4
		for(i = k; i < (1 << l) + k; i += 4)
	//*  19   31:iload_3         
	//*  20   32:istore_1        
	//*  21   33:iload_1         
	//*  22   34:iconst_1        
	//*  23   35:iload           4
	//*  24   37:ishl            
	//*  25   38:iload_3         
	//*  26   39:iadd            
	//*  27   40:icmpge          88
		{
			int i1 = ai[i + 3];
	//   28   43:aload           6
	//   29   45:iload_1         
	//   30   46:iconst_3        
	//   31   47:iadd            
	//   32   48:iaload          
	//   33   49:istore          5
			if(j == ai[i] && 1 == i1)
	//*  34   51:iload_2         
	//*  35   52:aload           6
	//*  36   54:iload_1         
	//*  37   55:iaload          
	//*  38   56:icmpne          74
	//*  39   59:iconst_1        
	//*  40   60:iload           5
	//*  41   62:icmpne          74
				return _names[i >> 2];
	//   42   65:aload_0         
	//   43   66:getfield        #99  <Field String[] _names>
	//   44   69:iload_1         
	//   45   70:iconst_2        
	//   46   71:ishr            
	//   47   72:aaload          
	//   48   73:areturn         
			if(i1 == 0)
	//*  49   74:iload           5
	//*  50   76:ifne            81
				return null;
	//   51   79:aconst_null     
	//   52   80:areturn         
		}

	//   53   81:iload_1         
	//   54   82:iconst_4        
	//   55   83:iadd            
	//   56   84:istore_1        
	//*  57   85:goto            33
		for(i = _spilloverStart(); i < _spilloverEnd; i += 4)
	//*  58   88:aload_0         
	//*  59   89:invokespecial   #151 <Method int _spilloverStart()>
	//*  60   92:istore_1        
	//*  61   93:iload_1         
	//*  62   94:aload_0         
	//*  63   95:getfield        #104 <Field int _spilloverEnd>
	//*  64   98:icmpge          135
			if(j == ai[i] && 1 == ai[i + 3])
	//*  65  101:iload_2         
	//*  66  102:aload           6
	//*  67  104:iload_1         
	//*  68  105:iaload          
	//*  69  106:icmpne          128
	//*  70  109:iconst_1        
	//*  71  110:aload           6
	//*  72  112:iload_1         
	//*  73  113:iconst_3        
	//*  74  114:iadd            
	//*  75  115:iaload          
	//*  76  116:icmpne          128
				return _names[i >> 2];
	//   77  119:aload_0         
	//   78  120:getfield        #99  <Field String[] _names>
	//   79  123:iload_1         
	//   80  124:iconst_2        
	//   81  125:ishr            
	//   82  126:aaload          
	//   83  127:areturn         

	//   84  128:iload_1         
	//   85  129:iconst_4        
	//   86  130:iadd            
	//   87  131:istore_1        
	//*  88  132:goto            93
		return null;
	//   89  135:aconst_null     
	//   90  136:areturn         
	}

	private String _findSecondary(int i, int j, int k)
	{
		int l = _tertiaryStart + ((i >> _tertiaryShift + 2) << _tertiaryShift);
	//    0    0:aload_0         
	//    1    1:getfield        #84  <Field int _tertiaryStart>
	//    2    4:iload_1         
	//    3    5:aload_0         
	//    4    6:getfield        #89  <Field int _tertiaryShift>
	//    5    9:iconst_2        
	//    6   10:iadd            
	//    7   11:ishr            
	//    8   12:aload_0         
	//    9   13:getfield        #89  <Field int _tertiaryShift>
	//   10   16:ishl            
	//   11   17:iadd            
	//   12   18:istore          4
		int ai[] = _hashArea;
	//   13   20:aload_0         
	//   14   21:getfield        #94  <Field int[] _hashArea>
	//   15   24:astore          7
		int i1 = _tertiaryShift;
	//   16   26:aload_0         
	//   17   27:getfield        #89  <Field int _tertiaryShift>
	//   18   30:istore          5
		for(i = l; i < (1 << i1) + l; i += 4)
	//*  19   32:iload           4
	//*  20   34:istore_1        
	//*  21   35:iload_1         
	//*  22   36:iconst_1        
	//*  23   37:iload           5
	//*  24   39:ishl            
	//*  25   40:iload           4
	//*  26   42:iadd            
	//*  27   43:icmpge          101
		{
			int j1 = ai[i + 3];
	//   28   46:aload           7
	//   29   48:iload_1         
	//   30   49:iconst_3        
	//   31   50:iadd            
	//   32   51:iaload          
	//   33   52:istore          6
			if(j == ai[i] && k == ai[i + 1] && 2 == j1)
	//*  34   54:iload_2         
	//*  35   55:aload           7
	//*  36   57:iload_1         
	//*  37   58:iaload          
	//*  38   59:icmpne          87
	//*  39   62:iload_3         
	//*  40   63:aload           7
	//*  41   65:iload_1         
	//*  42   66:iconst_1        
	//*  43   67:iadd            
	//*  44   68:iaload          
	//*  45   69:icmpne          87
	//*  46   72:iconst_2        
	//*  47   73:iload           6
	//*  48   75:icmpne          87
				return _names[i >> 2];
	//   49   78:aload_0         
	//   50   79:getfield        #99  <Field String[] _names>
	//   51   82:iload_1         
	//   52   83:iconst_2        
	//   53   84:ishr            
	//   54   85:aaload          
	//   55   86:areturn         
			if(j1 == 0)
	//*  56   87:iload           6
	//*  57   89:ifne            94
				return null;
	//   58   92:aconst_null     
	//   59   93:areturn         
		}

	//   60   94:iload_1         
	//   61   95:iconst_4        
	//   62   96:iadd            
	//   63   97:istore_1        
	//*  64   98:goto            35
		for(i = _spilloverStart(); i < _spilloverEnd; i += 4)
	//*  65  101:aload_0         
	//*  66  102:invokespecial   #151 <Method int _spilloverStart()>
	//*  67  105:istore_1        
	//*  68  106:iload_1         
	//*  69  107:aload_0         
	//*  70  108:getfield        #104 <Field int _spilloverEnd>
	//*  71  111:icmpge          158
			if(j == ai[i] && k == ai[i + 1] && 2 == ai[i + 3])
	//*  72  114:iload_2         
	//*  73  115:aload           7
	//*  74  117:iload_1         
	//*  75  118:iaload          
	//*  76  119:icmpne          151
	//*  77  122:iload_3         
	//*  78  123:aload           7
	//*  79  125:iload_1         
	//*  80  126:iconst_1        
	//*  81  127:iadd            
	//*  82  128:iaload          
	//*  83  129:icmpne          151
	//*  84  132:iconst_2        
	//*  85  133:aload           7
	//*  86  135:iload_1         
	//*  87  136:iconst_3        
	//*  88  137:iadd            
	//*  89  138:iaload          
	//*  90  139:icmpne          151
				return _names[i >> 2];
	//   91  142:aload_0         
	//   92  143:getfield        #99  <Field String[] _names>
	//   93  146:iload_1         
	//   94  147:iconst_2        
	//   95  148:ishr            
	//   96  149:aaload          
	//   97  150:areturn         

	//   98  151:iload_1         
	//   99  152:iconst_4        
	//  100  153:iadd            
	//  101  154:istore_1        
	//* 102  155:goto            106
		return null;
	//  103  158:aconst_null     
	//  104  159:areturn         
	}

	private String _findSecondary(int i, int j, int k, int l)
	{
		int i1 = _tertiaryStart + ((i >> _tertiaryShift + 2) << _tertiaryShift);
	//    0    0:aload_0         
	//    1    1:getfield        #84  <Field int _tertiaryStart>
	//    2    4:iload_1         
	//    3    5:aload_0         
	//    4    6:getfield        #89  <Field int _tertiaryShift>
	//    5    9:iconst_2        
	//    6   10:iadd            
	//    7   11:ishr            
	//    8   12:aload_0         
	//    9   13:getfield        #89  <Field int _tertiaryShift>
	//   10   16:ishl            
	//   11   17:iadd            
	//   12   18:istore          5
		int ai[] = _hashArea;
	//   13   20:aload_0         
	//   14   21:getfield        #94  <Field int[] _hashArea>
	//   15   24:astore          8
		int j1 = _tertiaryShift;
	//   16   26:aload_0         
	//   17   27:getfield        #89  <Field int _tertiaryShift>
	//   18   30:istore          6
		for(i = i1; i < (1 << j1) + i1; i += 4)
	//*  19   32:iload           5
	//*  20   34:istore_1        
	//*  21   35:iload_1         
	//*  22   36:iconst_1        
	//*  23   37:iload           6
	//*  24   39:ishl            
	//*  25   40:iload           5
	//*  26   42:iadd            
	//*  27   43:icmpge          112
		{
			int k1 = ai[i + 3];
	//   28   46:aload           8
	//   29   48:iload_1         
	//   30   49:iconst_3        
	//   31   50:iadd            
	//   32   51:iaload          
	//   33   52:istore          7
			if(j == ai[i] && k == ai[i + 1] && l == ai[i + 2] && 3 == k1)
	//*  34   54:iload_2         
	//*  35   55:aload           8
	//*  36   57:iload_1         
	//*  37   58:iaload          
	//*  38   59:icmpne          98
	//*  39   62:iload_3         
	//*  40   63:aload           8
	//*  41   65:iload_1         
	//*  42   66:iconst_1        
	//*  43   67:iadd            
	//*  44   68:iaload          
	//*  45   69:icmpne          98
	//*  46   72:iload           4
	//*  47   74:aload           8
	//*  48   76:iload_1         
	//*  49   77:iconst_2        
	//*  50   78:iadd            
	//*  51   79:iaload          
	//*  52   80:icmpne          98
	//*  53   83:iconst_3        
	//*  54   84:iload           7
	//*  55   86:icmpne          98
				return _names[i >> 2];
	//   56   89:aload_0         
	//   57   90:getfield        #99  <Field String[] _names>
	//   58   93:iload_1         
	//   59   94:iconst_2        
	//   60   95:ishr            
	//   61   96:aaload          
	//   62   97:areturn         
			if(k1 == 0)
	//*  63   98:iload           7
	//*  64  100:ifne            105
				return null;
	//   65  103:aconst_null     
	//   66  104:areturn         
		}

	//   67  105:iload_1         
	//   68  106:iconst_4        
	//   69  107:iadd            
	//   70  108:istore_1        
	//*  71  109:goto            35
		for(i = _spilloverStart(); i < _spilloverEnd; i += 4)
	//*  72  112:aload_0         
	//*  73  113:invokespecial   #151 <Method int _spilloverStart()>
	//*  74  116:istore_1        
	//*  75  117:iload_1         
	//*  76  118:aload_0         
	//*  77  119:getfield        #104 <Field int _spilloverEnd>
	//*  78  122:icmpge          180
			if(j == ai[i] && k == ai[i + 1] && l == ai[i + 2] && 3 == ai[i + 3])
	//*  79  125:iload_2         
	//*  80  126:aload           8
	//*  81  128:iload_1         
	//*  82  129:iaload          
	//*  83  130:icmpne          173
	//*  84  133:iload_3         
	//*  85  134:aload           8
	//*  86  136:iload_1         
	//*  87  137:iconst_1        
	//*  88  138:iadd            
	//*  89  139:iaload          
	//*  90  140:icmpne          173
	//*  91  143:iload           4
	//*  92  145:aload           8
	//*  93  147:iload_1         
	//*  94  148:iconst_2        
	//*  95  149:iadd            
	//*  96  150:iaload          
	//*  97  151:icmpne          173
	//*  98  154:iconst_3        
	//*  99  155:aload           8
	//* 100  157:iload_1         
	//* 101  158:iconst_3        
	//* 102  159:iadd            
	//* 103  160:iaload          
	//* 104  161:icmpne          173
				return _names[i >> 2];
	//  105  164:aload_0         
	//  106  165:getfield        #99  <Field String[] _names>
	//  107  168:iload_1         
	//  108  169:iconst_2        
	//  109  170:ishr            
	//  110  171:aaload          
	//  111  172:areturn         

	//  112  173:iload_1         
	//  113  174:iconst_4        
	//  114  175:iadd            
	//  115  176:istore_1        
	//* 116  177:goto            117
		return null;
	//  117  180:aconst_null     
	//  118  181:areturn         
	}

	private String _findSecondary(int i, int j, int ai[], int k)
	{
		int l = _tertiaryStart + ((i >> _tertiaryShift + 2) << _tertiaryShift);
	//    0    0:aload_0         
	//    1    1:getfield        #84  <Field int _tertiaryStart>
	//    2    4:iload_1         
	//    3    5:aload_0         
	//    4    6:getfield        #89  <Field int _tertiaryShift>
	//    5    9:iconst_2        
	//    6   10:iadd            
	//    7   11:ishr            
	//    8   12:aload_0         
	//    9   13:getfield        #89  <Field int _tertiaryShift>
	//   10   16:ishl            
	//   11   17:iadd            
	//   12   18:istore          5
		int ai1[] = _hashArea;
	//   13   20:aload_0         
	//   14   21:getfield        #94  <Field int[] _hashArea>
	//   15   24:astore          8
		int i1 = _tertiaryShift;
	//   16   26:aload_0         
	//   17   27:getfield        #89  <Field int _tertiaryShift>
	//   18   30:istore          6
		for(i = l; i < (1 << i1) + l; i += 4)
	//*  19   32:iload           5
	//*  20   34:istore_1        
	//*  21   35:iload_1         
	//*  22   36:iconst_1        
	//*  23   37:iload           6
	//*  24   39:ishl            
	//*  25   40:iload           5
	//*  26   42:iadd            
	//*  27   43:icmpge          108
		{
			int j1 = ai1[i + 3];
	//   28   46:aload           8
	//   29   48:iload_1         
	//   30   49:iconst_3        
	//   31   50:iadd            
	//   32   51:iaload          
	//   33   52:istore          7
			if(j == ai1[i] && k == j1 && _verifyLongName(ai, k, ai1[i + 1]))
	//*  34   54:iload_2         
	//*  35   55:aload           8
	//*  36   57:iload_1         
	//*  37   58:iaload          
	//*  38   59:icmpne          94
	//*  39   62:iload           4
	//*  40   64:iload           7
	//*  41   66:icmpne          94
	//*  42   69:aload_0         
	//*  43   70:aload_3         
	//*  44   71:iload           4
	//*  45   73:aload           8
	//*  46   75:iload_1         
	//*  47   76:iconst_1        
	//*  48   77:iadd            
	//*  49   78:iaload          
	//*  50   79:invokespecial   #158 <Method boolean _verifyLongName(int[], int, int)>
	//*  51   82:ifeq            94
				return _names[i >> 2];
	//   52   85:aload_0         
	//   53   86:getfield        #99  <Field String[] _names>
	//   54   89:iload_1         
	//   55   90:iconst_2        
	//   56   91:ishr            
	//   57   92:aaload          
	//   58   93:areturn         
			if(j1 == 0)
	//*  59   94:iload           7
	//*  60   96:ifne            101
				return null;
	//   61   99:aconst_null     
	//   62  100:areturn         
		}

	//   63  101:iload_1         
	//   64  102:iconst_4        
	//   65  103:iadd            
	//   66  104:istore_1        
	//*  67  105:goto            35
		for(i = _spilloverStart(); i < _spilloverEnd; i += 4)
	//*  68  108:aload_0         
	//*  69  109:invokespecial   #151 <Method int _spilloverStart()>
	//*  70  112:istore_1        
	//*  71  113:iload_1         
	//*  72  114:aload_0         
	//*  73  115:getfield        #104 <Field int _spilloverEnd>
	//*  74  118:icmpge          172
			if(j == ai1[i] && k == ai1[i + 3] && _verifyLongName(ai, k, ai1[i + 1]))
	//*  75  121:iload_2         
	//*  76  122:aload           8
	//*  77  124:iload_1         
	//*  78  125:iaload          
	//*  79  126:icmpne          165
	//*  80  129:iload           4
	//*  81  131:aload           8
	//*  82  133:iload_1         
	//*  83  134:iconst_3        
	//*  84  135:iadd            
	//*  85  136:iaload          
	//*  86  137:icmpne          165
	//*  87  140:aload_0         
	//*  88  141:aload_3         
	//*  89  142:iload           4
	//*  90  144:aload           8
	//*  91  146:iload_1         
	//*  92  147:iconst_1        
	//*  93  148:iadd            
	//*  94  149:iaload          
	//*  95  150:invokespecial   #158 <Method boolean _verifyLongName(int[], int, int)>
	//*  96  153:ifeq            165
				return _names[i >> 2];
	//   97  156:aload_0         
	//   98  157:getfield        #99  <Field String[] _names>
	//   99  160:iload_1         
	//  100  161:iconst_2        
	//  101  162:ishr            
	//  102  163:aaload          
	//  103  164:areturn         

	//  104  165:iload_1         
	//  105  166:iconst_4        
	//  106  167:iadd            
	//  107  168:istore_1        
	//* 108  169:goto            113
		return null;
	//  109  172:aconst_null     
	//  110  173:areturn         
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
		int ai1[];
label0:
		{
label1:
			{
label2:
				{
label3:
					{
label4:
						{
label5:
							{
								ai1 = _hashArea;
	//    0    0:aload_0         
	//    1    1:getfield        #94  <Field int[] _hashArea>
	//    2    4:astore          6
								switch(i)
	//*   3    6:iload_2         
								{
	//*   4    7:tableswitch     4 8: default 40
	//	               4 156
	//	               5 127
	//	               6 98
	//	               7 69
	//	               8 48
								default:
									return _verifyLongName2(ai, i, j);
	//    5   40:aload_0         
	//    6   41:aload_1         
	//    7   42:iload_2         
	//    8   43:iload_3         
	//    9   44:invokespecial   #161 <Method boolean _verifyLongName2(int[], int, int)>
	//   10   47:ireturn         

								case 4: // '\004'
									break label1;

								case 5: // '\005'
									break label3;

								case 6: // '\006'
									break label5;

								case 8: // '\b'
									if(ai[0] != ai1[j])
	//*  11   48:aload_1         
	//*  12   49:iconst_0        
	//*  13   50:iaload          
	//*  14   51:aload           6
	//*  15   53:iload_3         
	//*  16   54:iaload          
	//*  17   55:icmpeq          60
										return false;
	//   18   58:iconst_0        
	//   19   59:ireturn         
									i = 1;
	//   20   60:iconst_1        
	//   21   61:istore_2        
									j++;
	//   22   62:iload_3         
	//   23   63:iconst_1        
	//   24   64:iadd            
	//   25   65:istore_3        
									break;
	//   26   66:goto            71

								case 7: // '\007'
									i = 0;
	//   27   69:iconst_0        
	//   28   70:istore_2        
									break;
								}
								int k = i + 1;
	//   29   71:iload_2         
	//   30   72:iconst_1        
	//   31   73:iadd            
	//   32   74:istore          4
								if(ai[i] != ai1[j])
	//*  33   76:aload_1         
	//*  34   77:iload_2         
	//*  35   78:iaload          
	//*  36   79:aload           6
	//*  37   81:iload_3         
	//*  38   82:iaload          
	//*  39   83:icmpeq          88
									return false;
	//   40   86:iconst_0        
	//   41   87:ireturn         
								j++;
	//   42   88:iload_3         
	//   43   89:iconst_1        
	//   44   90:iadd            
	//   45   91:istore_3        
								i = k;
	//   46   92:iload           4
	//   47   94:istore_2        
								break label4;
	//   48   95:goto            100
							}
							i = 0;
	//   49   98:iconst_0        
	//   50   99:istore_2        
						}
						int l = i + 1;
	//   51  100:iload_2         
	//   52  101:iconst_1        
	//   53  102:iadd            
	//   54  103:istore          4
						if(ai[i] != ai1[j])
	//*  55  105:aload_1         
	//*  56  106:iload_2         
	//*  57  107:iaload          
	//*  58  108:aload           6
	//*  59  110:iload_3         
	//*  60  111:iaload          
	//*  61  112:icmpeq          117
							return false;
	//   62  115:iconst_0        
	//   63  116:ireturn         
						j++;
	//   64  117:iload_3         
	//   65  118:iconst_1        
	//   66  119:iadd            
	//   67  120:istore_3        
						i = l;
	//   68  121:iload           4
	//   69  123:istore_2        
						break label2;
	//   70  124:goto            129
					}
					i = 0;
	//   71  127:iconst_0        
	//   72  128:istore_2        
				}
				int i1 = i + 1;
	//   73  129:iload_2         
	//   74  130:iconst_1        
	//   75  131:iadd            
	//   76  132:istore          4
				if(ai[i] != ai1[j])
	//*  77  134:aload_1         
	//*  78  135:iload_2         
	//*  79  136:iaload          
	//*  80  137:aload           6
	//*  81  139:iload_3         
	//*  82  140:iaload          
	//*  83  141:icmpeq          146
					return false;
	//   84  144:iconst_0        
	//   85  145:ireturn         
				j++;
	//   86  146:iload_3         
	//   87  147:iconst_1        
	//   88  148:iadd            
	//   89  149:istore_3        
				i = i1;
	//   90  150:iload           4
	//   91  152:istore_2        
				break label0;
	//   92  153:goto            158
			}
			i = 0;
	//   93  156:iconst_0        
	//   94  157:istore_2        
		}
		int j1 = i + 1;
	//   95  158:iload_2         
	//   96  159:iconst_1        
	//   97  160:iadd            
	//   98  161:istore          4
		int k1 = ai[i];
	//   99  163:aload_1         
	//  100  164:iload_2         
	//  101  165:iaload          
	//  102  166:istore          5
		i = j + 1;
	//  103  168:iload_3         
	//  104  169:iconst_1        
	//  105  170:iadd            
	//  106  171:istore_2        
		if(k1 != ai1[j])
	//* 107  172:iload           5
	//* 108  174:aload           6
	//* 109  176:iload_3         
	//* 110  177:iaload          
	//* 111  178:icmpeq          183
			return false;
	//  112  181:iconst_0        
	//  113  182:ireturn         
		j = j1 + 1;
	//  114  183:iload           4
	//  115  185:iconst_1        
	//  116  186:iadd            
	//  117  187:istore_3        
		j1 = ai[j1];
	//  118  188:aload_1         
	//  119  189:iload           4
	//  120  191:iaload          
	//  121  192:istore          4
		k1 = i + 1;
	//  122  194:iload_2         
	//  123  195:iconst_1        
	//  124  196:iadd            
	//  125  197:istore          5
		if(j1 != ai1[i])
	//* 126  199:iload           4
	//* 127  201:aload           6
	//* 128  203:iload_2         
	//* 129  204:iaload          
	//* 130  205:icmpeq          210
			return false;
	//  131  208:iconst_0        
	//  132  209:ireturn         
		if(ai[j] != ai1[k1])
	//* 133  210:aload_1         
	//* 134  211:iload_3         
	//* 135  212:iaload          
	//* 136  213:aload           6
	//* 137  215:iload           5
	//* 138  217:iaload          
	//* 139  218:icmpeq          223
			return false;
	//  140  221:iconst_0        
	//  141  222:ireturn         
		return ai[j + 1] == ai1[k1 + 1];
	//  142  223:aload_1         
	//  143  224:iload_3         
	//  144  225:iconst_1        
	//  145  226:iadd            
	//  146  227:iaload          
	//  147  228:aload           6
	//  148  230:iload           5
	//  149  232:iconst_1        
	//  150  233:iadd            
	//  151  234:iaload          
	//  152  235:icmpeq          240
	//  153  238:iconst_0        
	//  154  239:ireturn         
	//  155  240:iconst_1        
	//  156  241:ireturn         
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
	//    0    0:invokestatic    #190 <Method long System.currentTimeMillis()>
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
	//   11   14:invokestatic    #193 <Method ByteQuadsCanonicalizer createRoot(int)>
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
	//    6    9:invokespecial   #195 <Method void ByteQuadsCanonicalizer(int, boolean, int, boolean)>
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
	//    5    9:invokevirtual   #201 <Method Object AtomicReference.get()>
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
	//   23   44:invokevirtual   #205 <Method boolean AtomicReference.compareAndSet(Object, Object)>
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
	//   18   32:invokestatic    #211 <Method void Arrays.fill(int[], int)>
			Arrays.fill(((Object []) (_names)), ((Object) (null)));
	//   19   35:aload_0         
	//   20   36:getfield        #99  <Field String[] _names>
	//   21   39:aconst_null     
	//   22   40:invokestatic    #214 <Method void Arrays.fill(Object[], Object)>
		}
	//   23   43:return          
	}

	private void rehash()
	{
		_needRehash = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #111 <Field boolean _needRehash>
		_hashShared = false;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #113 <Field boolean _hashShared>
		int ai2[] = _hashArea;
	//    6   10:aload_0         
	//    7   11:getfield        #94  <Field int[] _hashArea>
	//    8   14:astore          8
		String as[] = _names;
	//    9   16:aload_0         
	//   10   17:getfield        #99  <Field String[] _names>
	//   11   20:astore          9
		int i = _hashSize;
	//   12   22:aload_0         
	//   13   23:getfield        #80  <Field int _hashSize>
	//   14   26:istore_1        
		int l = _count;
	//   15   27:aload_0         
	//   16   28:getfield        #75  <Field int _count>
	//   17   31:istore_3        
		int k = i + i;
	//   18   32:iload_1         
	//   19   33:iload_1         
	//   20   34:iadd            
	//   21   35:istore_2        
		int i1 = _spilloverEnd;
	//   22   36:aload_0         
	//   23   37:getfield        #104 <Field int _spilloverEnd>
	//   24   40:istore          4
		if(k > 0x10000)
	//*  25   42:iload_2         
	//*  26   43:ldc1            #14  <Int 0x10000>
	//*  27   45:icmple          54
		{
			nukeSymbols(true);
	//   28   48:aload_0         
	//   29   49:iconst_1        
	//   30   50:invokespecial   #216 <Method void nukeSymbols(boolean)>
			return;
	//   31   53:return          
		}
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
		_hashSize = k;
	//   41   67:aload_0         
	//   42   68:iload_2         
	//   43   69:putfield        #80  <Field int _hashSize>
		_secondaryStart = k << 2;
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
		_tertiaryShift = _calcTertiaryShift(k);
	//   58   94:aload_0         
	//   59   95:iload_2         
	//   60   96:invokestatic    #218 <Method int _calcTertiaryShift(int)>
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
	//   71  116:invokespecial   #216 <Method void nukeSymbols(boolean)>
		int ai[] = new int[16];
	//   72  119:bipush          16
	//   73  121:newarray        int[]
	//   74  123:astore          6
		k = 0;
	//   75  125:iconst_0        
	//   76  126:istore_2        
		for(int j = k; j < i1; j += 4)
	//*  77  127:iload_2         
	//*  78  128:istore_1        
	//*  79  129:iload_1         
	//*  80  130:iload           4
	//*  81  132:icmpge          344
		{
			int j1 = ai2[j + 3];
	//   82  135:aload           8
	//   83  137:iload_1         
	//   84  138:iconst_3        
	//   85  139:iadd            
	//   86  140:iaload          
	//   87  141:istore          5
			if(j1 == 0)
	//*  88  143:iload           5
	//*  89  145:ifne            151
				continue;
	//   90  148:goto            337
			k++;
	//   91  151:iload_2         
	//   92  152:iconst_1        
	//   93  153:iadd            
	//   94  154:istore_2        
			String s = as[j >> 2];
	//   95  155:aload           9
	//   96  157:iload_1         
	//   97  158:iconst_2        
	//   98  159:ishr            
	//   99  160:aaload          
	//  100  161:astore          10
			switch(j1)
	//* 101  163:iload           5
			{
	//* 102  165:tableswitch     1 3: default 192
	//	               1 285
	//	               2 254
	//	               3 213
			default:
				int ai1[] = ai;
	//  103  192:aload           6
	//  104  194:astore          7
				if(j1 > ai.length)
	//* 105  196:iload           5
	//* 106  198:aload           6
	//* 107  200:arraylength     
	//* 108  201:icmple          306
					ai1 = new int[j1];
	//  109  204:iload           5
	//  110  206:newarray        int[]
	//  111  208:astore          7
	//* 112  210:goto            306
	//* 113  213:aload           6
	//* 114  215:iconst_0        
	//* 115  216:aload           8
	//* 116  218:iload_1         
	//* 117  219:iaload          
	//* 118  220:iastore         
	//* 119  221:aload           6
	//* 120  223:iconst_1        
	//* 121  224:aload           8
	//* 122  226:iload_1         
	//* 123  227:iconst_1        
	//* 124  228:iadd            
	//* 125  229:iaload          
	//* 126  230:iastore         
	//* 127  231:aload           6
	//* 128  233:iconst_2        
	//* 129  234:aload           8
	//* 130  236:iload_1         
	//* 131  237:iconst_2        
	//* 132  238:iadd            
	//* 133  239:iaload          
	//* 134  240:iastore         
	//* 135  241:aload_0         
	//* 136  242:aload           10
	//* 137  244:aload           6
	//* 138  246:iconst_3        
	//* 139  247:invokevirtual   #224 <Method String addName(String, int[], int)>
	//* 140  250:pop             
	//* 141  251:goto            337
	//* 142  254:aload           6
	//* 143  256:iconst_0        
	//* 144  257:aload           8
	//* 145  259:iload_1         
	//* 146  260:iaload          
	//* 147  261:iastore         
	//* 148  262:aload           6
	//* 149  264:iconst_1        
	//* 150  265:aload           8
	//* 151  267:iload_1         
	//* 152  268:iconst_1        
	//* 153  269:iadd            
	//* 154  270:iaload          
	//* 155  271:iastore         
	//* 156  272:aload_0         
	//* 157  273:aload           10
	//* 158  275:aload           6
	//* 159  277:iconst_2        
	//* 160  278:invokevirtual   #224 <Method String addName(String, int[], int)>
	//* 161  281:pop             
	//* 162  282:goto            337
	//* 163  285:aload           6
	//* 164  287:iconst_0        
	//* 165  288:aload           8
	//* 166  290:iload_1         
	//* 167  291:iaload          
	//* 168  292:iastore         
	//* 169  293:aload_0         
	//* 170  294:aload           10
	//* 171  296:aload           6
	//* 172  298:iconst_1        
	//* 173  299:invokevirtual   #224 <Method String addName(String, int[], int)>
	//* 174  302:pop             
	//* 175  303:goto            337
				System.arraycopy(((Object) (ai2)), ai2[j + 1], ((Object) (ai1)), 0, j1);
	//  176  306:aload           8
	//  177  308:aload           8
	//  178  310:iload_1         
	//  179  311:iconst_1        
	//  180  312:iadd            
	//  181  313:iaload          
	//  182  314:aload           7
	//  183  316:iconst_0        
	//  184  317:iload           5
	//  185  319:invokestatic    #136 <Method void System.arraycopy(Object, int, Object, int, int)>
				addName(s, ai1, j1);
	//  186  322:aload_0         
	//  187  323:aload           10
	//  188  325:aload           7
	//  189  327:iload           5
	//  190  329:invokevirtual   #224 <Method String addName(String, int[], int)>
	//  191  332:pop             
				ai = ai1;
	//  192  333:aload           7
	//  193  335:astore          6
				break;

			case 3: // '\003'
				ai[0] = ai2[j];
				ai[1] = ai2[j + 1];
				ai[2] = ai2[j + 2];
				addName(s, ai, 3);
				break;

			case 2: // '\002'
				ai[0] = ai2[j];
				ai[1] = ai2[j + 1];
				addName(s, ai, 2);
				break;

			case 1: // '\001'
				ai[0] = ai2[j];
				addName(s, ai, 1);
				break;
			}
		}

	//  194  337:iload_1         
	//  195  338:iconst_4        
	//  196  339:iadd            
	//  197  340:istore_1        
	//* 198  341:goto            129
		if(k != l)
	//* 199  344:iload_2         
	//* 200  345:iload_3         
	//* 201  346:icmpeq          401
		{
			StringBuilder stringbuilder = new StringBuilder();
	//  202  349:new             #226 <Class StringBuilder>
	//  203  352:dup             
	//  204  353:invokespecial   #227 <Method void StringBuilder()>
	//  205  356:astore          6
			stringbuilder.append("Failed rehash(): old count=");
	//  206  358:aload           6
	//  207  360:ldc1            #229 <String "Failed rehash(): old count=">
	//  208  362:invokevirtual   #233 <Method StringBuilder StringBuilder.append(String)>
	//  209  365:pop             
			stringbuilder.append(l);
	//  210  366:aload           6
	//  211  368:iload_3         
	//  212  369:invokevirtual   #236 <Method StringBuilder StringBuilder.append(int)>
	//  213  372:pop             
			stringbuilder.append(", copyCount=");
	//  214  373:aload           6
	//  215  375:ldc1            #238 <String ", copyCount=">
	//  216  377:invokevirtual   #233 <Method StringBuilder StringBuilder.append(String)>
	//  217  380:pop             
			stringbuilder.append(k);
	//  218  381:aload           6
	//  219  383:iload_2         
	//  220  384:invokevirtual   #236 <Method StringBuilder StringBuilder.append(int)>
	//  221  387:pop             
			throw new IllegalStateException(stringbuilder.toString());
	//  222  388:new             #240 <Class IllegalStateException>
	//  223  391:dup             
	//  224  392:aload           6
	//  225  394:invokevirtual   #244 <Method String StringBuilder.toString()>
	//  226  397:invokespecial   #247 <Method void IllegalStateException(String)>
	//  227  400:athrow          
		} else
		{
			return;
	//  228  401:return          
		}
	}

	protected void _reportTooManyCollisions()
	{
		if(_hashSize <= 1024)
	//*   0    0:aload_0         
	//*   1    1:getfield        #80  <Field int _hashSize>
	//*   2    4:sipush          1024
	//*   3    7:icmpgt          11
		{
			return;
	//    4   10:return          
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    5   11:new             #226 <Class StringBuilder>
	//    6   14:dup             
	//    7   15:invokespecial   #227 <Method void StringBuilder()>
	//    8   18:astore_1        
			stringbuilder.append("Spill-over slots in symbol table with ");
	//    9   19:aload_1         
	//   10   20:ldc1            #249 <String "Spill-over slots in symbol table with ">
	//   11   22:invokevirtual   #233 <Method StringBuilder StringBuilder.append(String)>
	//   12   25:pop             
			stringbuilder.append(_count);
	//   13   26:aload_1         
	//   14   27:aload_0         
	//   15   28:getfield        #75  <Field int _count>
	//   16   31:invokevirtual   #236 <Method StringBuilder StringBuilder.append(int)>
	//   17   34:pop             
			stringbuilder.append(" entries, hash area of ");
	//   18   35:aload_1         
	//   19   36:ldc1            #251 <String " entries, hash area of ">
	//   20   38:invokevirtual   #233 <Method StringBuilder StringBuilder.append(String)>
	//   21   41:pop             
			stringbuilder.append(_hashSize);
	//   22   42:aload_1         
	//   23   43:aload_0         
	//   24   44:getfield        #80  <Field int _hashSize>
	//   25   47:invokevirtual   #236 <Method StringBuilder StringBuilder.append(int)>
	//   26   50:pop             
			stringbuilder.append(" slots is now full (all ");
	//   27   51:aload_1         
	//   28   52:ldc1            #253 <String " slots is now full (all ">
	//   29   54:invokevirtual   #233 <Method StringBuilder StringBuilder.append(String)>
	//   30   57:pop             
			stringbuilder.append(_hashSize >> 3);
	//   31   58:aload_1         
	//   32   59:aload_0         
	//   33   60:getfield        #80  <Field int _hashSize>
	//   34   63:iconst_3        
	//   35   64:ishr            
	//   36   65:invokevirtual   #236 <Method StringBuilder StringBuilder.append(int)>
	//   37   68:pop             
			stringbuilder.append(" slots -- suspect a DoS attack based on hash collisions.");
	//   38   69:aload_1         
	//   39   70:ldc1            #255 <String " slots -- suspect a DoS attack based on hash collisions.">
	//   40   72:invokevirtual   #233 <Method StringBuilder StringBuilder.append(String)>
	//   41   75:pop             
			stringbuilder.append(" You can disable the check via `JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW`");
	//   42   76:aload_1         
	//   43   77:ldc2            #257 <String " You can disable the check via `JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW`">
	//   44   80:invokevirtual   #233 <Method StringBuilder StringBuilder.append(String)>
	//   45   83:pop             
			throw new IllegalStateException(stringbuilder.toString());
	//   46   84:new             #240 <Class IllegalStateException>
	//   47   87:dup             
	//   48   88:aload_1         
	//   49   89:invokevirtual   #244 <Method String StringBuilder.toString()>
	//   50   92:invokespecial   #247 <Method void IllegalStateException(String)>
	//   51   95:athrow          
		}
	}

	public String addName(String s, int i)
	{
		_verifySharing();
	//    0    0:aload_0         
	//    1    1:invokespecial   #260 <Method void _verifySharing()>
		String s1 = s;
	//    2    4:aload_1         
	//    3    5:astore          4
		if(_intern)
	//*   4    7:aload_0         
	//*   5    8:getfield        #55  <Field boolean _intern>
	//*   6   11:ifeq            23
			s1 = InternCache.instance.intern(s);
	//    7   14:getstatic       #266 <Field InternCache InternCache.instance>
	//    8   17:aload_1         
	//    9   18:invokevirtual   #270 <Method String InternCache.intern(String)>
	//   10   21:astore          4
		int j = _findOffsetForAdd(calcHash(i));
	//   11   23:aload_0         
	//   12   24:aload_0         
	//   13   25:iload_2         
	//   14   26:invokevirtual   #273 <Method int calcHash(int)>
	//   15   29:invokespecial   #275 <Method int _findOffsetForAdd(int)>
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
	//    1    1:invokespecial   #260 <Method void _verifySharing()>
		String s1 = s;
	//    2    4:aload_1         
	//    3    5:astore          5
		if(_intern)
	//*   4    7:aload_0         
	//*   5    8:getfield        #55  <Field boolean _intern>
	//*   6   11:ifeq            23
			s1 = InternCache.instance.intern(s);
	//    7   14:getstatic       #266 <Field InternCache InternCache.instance>
	//    8   17:aload_1         
	//    9   18:invokevirtual   #270 <Method String InternCache.intern(String)>
	//   10   21:astore          5
		int k;
		if(j == 0)
	//*  11   23:iload_3         
	//*  12   24:ifne            37
			k = calcHash(i);
	//   13   27:aload_0         
	//   14   28:iload_2         
	//   15   29:invokevirtual   #273 <Method int calcHash(int)>
	//   16   32:istore          4
		else
	//*  17   34:goto            45
			k = calcHash(i, j);
	//   18   37:aload_0         
	//   19   38:iload_2         
	//   20   39:iload_3         
	//   21   40:invokevirtual   #278 <Method int calcHash(int, int)>
	//   22   43:istore          4
		k = _findOffsetForAdd(k);
	//   23   45:aload_0         
	//   24   46:iload           4
	//   25   48:invokespecial   #275 <Method int _findOffsetForAdd(int)>
	//   26   51:istore          4
		_hashArea[k] = i;
	//   27   53:aload_0         
	//   28   54:getfield        #94  <Field int[] _hashArea>
	//   29   57:iload           4
	//   30   59:iload_2         
	//   31   60:iastore         
		_hashArea[k + 1] = j;
	//   32   61:aload_0         
	//   33   62:getfield        #94  <Field int[] _hashArea>
	//   34   65:iload           4
	//   35   67:iconst_1        
	//   36   68:iadd            
	//   37   69:iload_3         
	//   38   70:iastore         
		_hashArea[k + 3] = 2;
	//   39   71:aload_0         
	//   40   72:getfield        #94  <Field int[] _hashArea>
	//   41   75:iload           4
	//   42   77:iconst_3        
	//   43   78:iadd            
	//   44   79:iconst_2        
	//   45   80:iastore         
		_names[k >> 2] = s1;
	//   46   81:aload_0         
	//   47   82:getfield        #99  <Field String[] _names>
	//   48   85:iload           4
	//   49   87:iconst_2        
	//   50   88:ishr            
	//   51   89:aload           5
	//   52   91:aastore         
		_count = _count + 1;
	//   53   92:aload_0         
	//   54   93:aload_0         
	//   55   94:getfield        #75  <Field int _count>
	//   56   97:iconst_1        
	//   57   98:iadd            
	//   58   99:putfield        #75  <Field int _count>
		_verifyNeedForRehash();
	//   59  102:aload_0         
	//   60  103:invokespecial   #171 <Method void _verifyNeedForRehash()>
		return s1;
	//   61  106:aload           5
	//   62  108:areturn         
	}

	public String addName(String s, int i, int j, int k)
	{
		_verifySharing();
	//    0    0:aload_0         
	//    1    1:invokespecial   #260 <Method void _verifySharing()>
		String s1 = s;
	//    2    4:aload_1         
	//    3    5:astore          6
		if(_intern)
	//*   4    7:aload_0         
	//*   5    8:getfield        #55  <Field boolean _intern>
	//*   6   11:ifeq            23
			s1 = InternCache.instance.intern(s);
	//    7   14:getstatic       #266 <Field InternCache InternCache.instance>
	//    8   17:aload_1         
	//    9   18:invokevirtual   #270 <Method String InternCache.intern(String)>
	//   10   21:astore          6
		int l = _findOffsetForAdd(calcHash(i, j, k));
	//   11   23:aload_0         
	//   12   24:aload_0         
	//   13   25:iload_2         
	//   14   26:iload_3         
	//   15   27:iload           4
	//   16   29:invokevirtual   #282 <Method int calcHash(int, int, int)>
	//   17   32:invokespecial   #275 <Method int _findOffsetForAdd(int)>
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
		_verifySharing();
	//    0    0:aload_0         
	//    1    1:invokespecial   #260 <Method void _verifySharing()>
		String s1 = s;
	//    2    4:aload_1         
	//    3    5:astore          6
		if(_intern)
	//*   4    7:aload_0         
	//*   5    8:getfield        #55  <Field boolean _intern>
	//*   6   11:ifeq            23
			s1 = InternCache.instance.intern(s);
	//    7   14:getstatic       #266 <Field InternCache InternCache.instance>
	//    8   17:aload_1         
	//    9   18:invokevirtual   #270 <Method String InternCache.intern(String)>
	//   10   21:astore          6
		switch(i)
	//*  11   23:iload_3         
		{
	//*  12   24:tableswitch     1 3: default 52
	//	               1 220
	//	               2 173
	//	               3 112
		default:
			int k = calcHash(ai, i);
	//   13   52:aload_0         
	//   14   53:aload_2         
	//   15   54:iload_3         
	//   16   55:invokevirtual   #284 <Method int calcHash(int[], int)>
	//   17   58:istore          5
			int j = _findOffsetForAdd(k);
	//   18   60:aload_0         
	//   19   61:iload           5
	//   20   63:invokespecial   #275 <Method int _findOffsetForAdd(int)>
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
	//   30   80:invokespecial   #286 <Method int _appendLongName(int[], int)>
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
			break;

	//*  48  109:goto            250
		case 3: // '\003'
			i = _findOffsetForAdd(calcHash(ai[0], ai[1], ai[2]));
	//   49  112:aload_0         
	//   50  113:aload_0         
	//   51  114:aload_2         
	//   52  115:iconst_0        
	//   53  116:iaload          
	//   54  117:aload_2         
	//   55  118:iconst_1        
	//   56  119:iaload          
	//   57  120:aload_2         
	//   58  121:iconst_2        
	//   59  122:iaload          
	//   60  123:invokevirtual   #282 <Method int calcHash(int, int, int)>
	//   61  126:invokespecial   #275 <Method int _findOffsetForAdd(int)>
	//   62  129:istore_3        
			_hashArea[i] = ai[0];
	//   63  130:aload_0         
	//   64  131:getfield        #94  <Field int[] _hashArea>
	//   65  134:iload_3         
	//   66  135:aload_2         
	//   67  136:iconst_0        
	//   68  137:iaload          
	//   69  138:iastore         
			_hashArea[i + 1] = ai[1];
	//   70  139:aload_0         
	//   71  140:getfield        #94  <Field int[] _hashArea>
	//   72  143:iload_3         
	//   73  144:iconst_1        
	//   74  145:iadd            
	//   75  146:aload_2         
	//   76  147:iconst_1        
	//   77  148:iaload          
	//   78  149:iastore         
			_hashArea[i + 2] = ai[2];
	//   79  150:aload_0         
	//   80  151:getfield        #94  <Field int[] _hashArea>
	//   81  154:iload_3         
	//   82  155:iconst_2        
	//   83  156:iadd            
	//   84  157:aload_2         
	//   85  158:iconst_2        
	//   86  159:iaload          
	//   87  160:iastore         
			_hashArea[i + 3] = 3;
	//   88  161:aload_0         
	//   89  162:getfield        #94  <Field int[] _hashArea>
	//   90  165:iload_3         
	//   91  166:iconst_3        
	//   92  167:iadd            
	//   93  168:iconst_3        
	//   94  169:iastore         
			break;

	//*  95  170:goto            250
		case 2: // '\002'
			i = _findOffsetForAdd(calcHash(ai[0], ai[1]));
	//   96  173:aload_0         
	//   97  174:aload_0         
	//   98  175:aload_2         
	//   99  176:iconst_0        
	//  100  177:iaload          
	//  101  178:aload_2         
	//  102  179:iconst_1        
	//  103  180:iaload          
	//  104  181:invokevirtual   #278 <Method int calcHash(int, int)>
	//  105  184:invokespecial   #275 <Method int _findOffsetForAdd(int)>
	//  106  187:istore_3        
			_hashArea[i] = ai[0];
	//  107  188:aload_0         
	//  108  189:getfield        #94  <Field int[] _hashArea>
	//  109  192:iload_3         
	//  110  193:aload_2         
	//  111  194:iconst_0        
	//  112  195:iaload          
	//  113  196:iastore         
			_hashArea[i + 1] = ai[1];
	//  114  197:aload_0         
	//  115  198:getfield        #94  <Field int[] _hashArea>
	//  116  201:iload_3         
	//  117  202:iconst_1        
	//  118  203:iadd            
	//  119  204:aload_2         
	//  120  205:iconst_1        
	//  121  206:iaload          
	//  122  207:iastore         
			_hashArea[i + 3] = 2;
	//  123  208:aload_0         
	//  124  209:getfield        #94  <Field int[] _hashArea>
	//  125  212:iload_3         
	//  126  213:iconst_3        
	//  127  214:iadd            
	//  128  215:iconst_2        
	//  129  216:iastore         
			break;

	//* 130  217:goto            250
		case 1: // '\001'
			i = _findOffsetForAdd(calcHash(ai[0]));
	//  131  220:aload_0         
	//  132  221:aload_0         
	//  133  222:aload_2         
	//  134  223:iconst_0        
	//  135  224:iaload          
	//  136  225:invokevirtual   #273 <Method int calcHash(int)>
	//  137  228:invokespecial   #275 <Method int _findOffsetForAdd(int)>
	//  138  231:istore_3        
			_hashArea[i] = ai[0];
	//  139  232:aload_0         
	//  140  233:getfield        #94  <Field int[] _hashArea>
	//  141  236:iload_3         
	//  142  237:aload_2         
	//  143  238:iconst_0        
	//  144  239:iaload          
	//  145  240:iastore         
			_hashArea[i + 3] = 1;
	//  146  241:aload_0         
	//  147  242:getfield        #94  <Field int[] _hashArea>
	//  148  245:iload_3         
	//  149  246:iconst_3        
	//  150  247:iadd            
	//  151  248:iconst_1        
	//  152  249:iastore         
			break;
		}
		_names[i >> 2] = s1;
	//  153  250:aload_0         
	//  154  251:getfield        #99  <Field String[] _names>
	//  155  254:iload_3         
	//  156  255:iconst_2        
	//  157  256:ishr            
	//  158  257:aload           6
	//  159  259:aastore         
		_count = _count + 1;
	//  160  260:aload_0         
	//  161  261:aload_0         
	//  162  262:getfield        #75  <Field int _count>
	//  163  265:iconst_1        
	//  164  266:iadd            
	//  165  267:putfield        #75  <Field int _count>
		_verifyNeedForRehash();
	//  166  270:aload_0         
	//  167  271:invokespecial   #171 <Method void _verifyNeedForRehash()>
		return s1;
	//  168  274:aload           6
	//  169  276:areturn         
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
	//    3    5:new             #289 <Class IllegalArgumentException>
	//    4    8:dup             
	//    5    9:invokespecial   #290 <Method void IllegalArgumentException()>
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
		return i << 5 ^ i;
	//   74   99:iload_2         
	//   75  100:iconst_5        
	//   76  101:ishl            
	//   77  102:iload_2         
	//   78  103:ixor            
	//   79  104:ireturn         
	}

	public String findName(int i)
	{
		int j = _calcOffset(calcHash(i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:iload_1         
	//    3    3:invokevirtual   #273 <Method int calcHash(int)>
	//    4    6:invokespecial   #142 <Method int _calcOffset(int)>
	//    5    9:istore_2        
		int ai[] = _hashArea;
	//    6   10:aload_0         
	//    7   11:getfield        #94  <Field int[] _hashArea>
	//    8   14:astore          5
		int k = ai[j + 3];
	//    9   16:aload           5
	//   10   18:iload_2         
	//   11   19:iconst_3        
	//   12   20:iadd            
	//   13   21:iaload          
	//   14   22:istore_3        
		if(k == 1)
	//*  15   23:iload_3         
	//*  16   24:iconst_1        
	//*  17   25:icmpne          45
		{
			if(ai[j] == i)
	//*  18   28:aload           5
	//*  19   30:iload_2         
	//*  20   31:iaload          
	//*  21   32:iload_1         
	//*  22   33:icmpne          51
				return _names[j >> 2];
	//   23   36:aload_0         
	//   24   37:getfield        #99  <Field String[] _names>
	//   25   40:iload_2         
	//   26   41:iconst_2        
	//   27   42:ishr            
	//   28   43:aaload          
	//   29   44:areturn         
		} else
		if(k == 0)
	//*  30   45:iload_3         
	//*  31   46:ifne            51
			return null;
	//   32   49:aconst_null     
	//   33   50:areturn         
		k = _secondaryStart + ((j >> 3) << 2);
	//   34   51:aload_0         
	//   35   52:getfield        #82  <Field int _secondaryStart>
	//   36   55:iload_2         
	//   37   56:iconst_3        
	//   38   57:ishr            
	//   39   58:iconst_2        
	//   40   59:ishl            
	//   41   60:iadd            
	//   42   61:istore_3        
		int l = ai[k + 3];
	//   43   62:aload           5
	//   44   64:iload_3         
	//   45   65:iconst_3        
	//   46   66:iadd            
	//   47   67:iaload          
	//   48   68:istore          4
		if(l == 1)
	//*  49   70:iload           4
	//*  50   72:iconst_1        
	//*  51   73:icmpne          93
		{
			if(ai[k] == i)
	//*  52   76:aload           5
	//*  53   78:iload_3         
	//*  54   79:iaload          
	//*  55   80:iload_1         
	//*  56   81:icmpne          100
				return _names[k >> 2];
	//   57   84:aload_0         
	//   58   85:getfield        #99  <Field String[] _names>
	//   59   88:iload_3         
	//   60   89:iconst_2        
	//   61   90:ishr            
	//   62   91:aaload          
	//   63   92:areturn         
		} else
		if(l == 0)
	//*  64   93:iload           4
	//*  65   95:ifne            100
			return null;
	//   66   98:aconst_null     
	//   67   99:areturn         
		return _findSecondary(j, i);
	//   68  100:aload_0         
	//   69  101:iload_2         
	//   70  102:iload_1         
	//   71  103:invokespecial   #294 <Method String _findSecondary(int, int)>
	//   72  106:areturn         
	}

	public String findName(int i, int j)
	{
		int k = _calcOffset(calcHash(i, j));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:iload_1         
	//    3    3:iload_2         
	//    4    4:invokevirtual   #278 <Method int calcHash(int, int)>
	//    5    7:invokespecial   #142 <Method int _calcOffset(int)>
	//    6   10:istore_3        
		int ai[] = _hashArea;
	//    7   11:aload_0         
	//    8   12:getfield        #94  <Field int[] _hashArea>
	//    9   15:astore          6
		int l = ai[k + 3];
	//   10   17:aload           6
	//   11   19:iload_3         
	//   12   20:iconst_3        
	//   13   21:iadd            
	//   14   22:iaload          
	//   15   23:istore          4
		if(l == 2)
	//*  16   25:iload           4
	//*  17   27:iconst_2        
	//*  18   28:icmpne          58
		{
			if(i == ai[k] && j == ai[k + 1])
	//*  19   31:iload_1         
	//*  20   32:aload           6
	//*  21   34:iload_3         
	//*  22   35:iaload          
	//*  23   36:icmpne          65
	//*  24   39:iload_2         
	//*  25   40:aload           6
	//*  26   42:iload_3         
	//*  27   43:iconst_1        
	//*  28   44:iadd            
	//*  29   45:iaload          
	//*  30   46:icmpne          65
				return _names[k >> 2];
	//   31   49:aload_0         
	//   32   50:getfield        #99  <Field String[] _names>
	//   33   53:iload_3         
	//   34   54:iconst_2        
	//   35   55:ishr            
	//   36   56:aaload          
	//   37   57:areturn         
		} else
		if(l == 0)
	//*  38   58:iload           4
	//*  39   60:ifne            65
			return null;
	//   40   63:aconst_null     
	//   41   64:areturn         
		l = _secondaryStart + ((k >> 3) << 2);
	//   42   65:aload_0         
	//   43   66:getfield        #82  <Field int _secondaryStart>
	//   44   69:iload_3         
	//   45   70:iconst_3        
	//   46   71:ishr            
	//   47   72:iconst_2        
	//   48   73:ishl            
	//   49   74:iadd            
	//   50   75:istore          4
		int i1 = ai[l + 3];
	//   51   77:aload           6
	//   52   79:iload           4
	//   53   81:iconst_3        
	//   54   82:iadd            
	//   55   83:iaload          
	//   56   84:istore          5
		if(i1 == 2)
	//*  57   86:iload           5
	//*  58   88:iconst_2        
	//*  59   89:icmpne          122
		{
			if(i == ai[l] && j == ai[l + 1])
	//*  60   92:iload_1         
	//*  61   93:aload           6
	//*  62   95:iload           4
	//*  63   97:iaload          
	//*  64   98:icmpne          129
	//*  65  101:iload_2         
	//*  66  102:aload           6
	//*  67  104:iload           4
	//*  68  106:iconst_1        
	//*  69  107:iadd            
	//*  70  108:iaload          
	//*  71  109:icmpne          129
				return _names[l >> 2];
	//   72  112:aload_0         
	//   73  113:getfield        #99  <Field String[] _names>
	//   74  116:iload           4
	//   75  118:iconst_2        
	//   76  119:ishr            
	//   77  120:aaload          
	//   78  121:areturn         
		} else
		if(i1 == 0)
	//*  79  122:iload           5
	//*  80  124:ifne            129
			return null;
	//   81  127:aconst_null     
	//   82  128:areturn         
		return _findSecondary(k, i, j);
	//   83  129:aload_0         
	//   84  130:iload_3         
	//   85  131:iload_1         
	//   86  132:iload_2         
	//   87  133:invokespecial   #296 <Method String _findSecondary(int, int, int)>
	//   88  136:areturn         
	}

	public String findName(int i, int j, int k)
	{
		int l = _calcOffset(calcHash(i, j, k));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:iload_1         
	//    3    3:iload_2         
	//    4    4:iload_3         
	//    5    5:invokevirtual   #282 <Method int calcHash(int, int, int)>
	//    6    8:invokespecial   #142 <Method int _calcOffset(int)>
	//    7   11:istore          4
		int ai[] = _hashArea;
	//    8   13:aload_0         
	//    9   14:getfield        #94  <Field int[] _hashArea>
	//   10   17:astore          7
		int i1 = ai[l + 3];
	//   11   19:aload           7
	//   12   21:iload           4
	//   13   23:iconst_3        
	//   14   24:iadd            
	//   15   25:iaload          
	//   16   26:istore          5
		if(i1 == 3)
	//*  17   28:iload           5
	//*  18   30:iconst_3        
	//*  19   31:icmpne          75
		{
			if(i == ai[l] && ai[l + 1] == j && ai[l + 2] == k)
	//*  20   34:iload_1         
	//*  21   35:aload           7
	//*  22   37:iload           4
	//*  23   39:iaload          
	//*  24   40:icmpne          82
	//*  25   43:aload           7
	//*  26   45:iload           4
	//*  27   47:iconst_1        
	//*  28   48:iadd            
	//*  29   49:iaload          
	//*  30   50:iload_2         
	//*  31   51:icmpne          82
	//*  32   54:aload           7
	//*  33   56:iload           4
	//*  34   58:iconst_2        
	//*  35   59:iadd            
	//*  36   60:iaload          
	//*  37   61:iload_3         
	//*  38   62:icmpne          82
				return _names[l >> 2];
	//   39   65:aload_0         
	//   40   66:getfield        #99  <Field String[] _names>
	//   41   69:iload           4
	//   42   71:iconst_2        
	//   43   72:ishr            
	//   44   73:aaload          
	//   45   74:areturn         
		} else
		if(i1 == 0)
	//*  46   75:iload           5
	//*  47   77:ifne            82
			return null;
	//   48   80:aconst_null     
	//   49   81:areturn         
		i1 = _secondaryStart + ((l >> 3) << 2);
	//   50   82:aload_0         
	//   51   83:getfield        #82  <Field int _secondaryStart>
	//   52   86:iload           4
	//   53   88:iconst_3        
	//   54   89:ishr            
	//   55   90:iconst_2        
	//   56   91:ishl            
	//   57   92:iadd            
	//   58   93:istore          5
		int j1 = ai[i1 + 3];
	//   59   95:aload           7
	//   60   97:iload           5
	//   61   99:iconst_3        
	//   62  100:iadd            
	//   63  101:iaload          
	//   64  102:istore          6
		if(j1 == 3)
	//*  65  104:iload           6
	//*  66  106:iconst_3        
	//*  67  107:icmpne          151
		{
			if(i == ai[i1] && ai[i1 + 1] == j && ai[i1 + 2] == k)
	//*  68  110:iload_1         
	//*  69  111:aload           7
	//*  70  113:iload           5
	//*  71  115:iaload          
	//*  72  116:icmpne          158
	//*  73  119:aload           7
	//*  74  121:iload           5
	//*  75  123:iconst_1        
	//*  76  124:iadd            
	//*  77  125:iaload          
	//*  78  126:iload_2         
	//*  79  127:icmpne          158
	//*  80  130:aload           7
	//*  81  132:iload           5
	//*  82  134:iconst_2        
	//*  83  135:iadd            
	//*  84  136:iaload          
	//*  85  137:iload_3         
	//*  86  138:icmpne          158
				return _names[i1 >> 2];
	//   87  141:aload_0         
	//   88  142:getfield        #99  <Field String[] _names>
	//   89  145:iload           5
	//   90  147:iconst_2        
	//   91  148:ishr            
	//   92  149:aaload          
	//   93  150:areturn         
		} else
		if(j1 == 0)
	//*  94  151:iload           6
	//*  95  153:ifne            158
			return null;
	//   96  156:aconst_null     
	//   97  157:areturn         
		return _findSecondary(l, i, j, k);
	//   98  158:aload_0         
	//   99  159:iload           4
	//  100  161:iload_1         
	//  101  162:iload_2         
	//  102  163:iload_3         
	//  103  164:invokespecial   #298 <Method String _findSecondary(int, int, int, int)>
	//  104  167:areturn         
	}

	public String findName(int ai[], int i)
	{
		if(i < 4)
	//*   0    0:iload_2         
	//*   1    1:iconst_4        
	//*   2    2:icmpge          48
		{
			if(i == 3)
	//*   3    5:iload_2         
	//*   4    6:iconst_3        
	//*   5    7:icmpne          24
				return findName(ai[0], ai[1], ai[2]);
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:iconst_0        
	//    9   13:iaload          
	//   10   14:aload_1         
	//   11   15:iconst_1        
	//   12   16:iaload          
	//   13   17:aload_1         
	//   14   18:iconst_2        
	//   15   19:iaload          
	//   16   20:invokevirtual   #301 <Method String findName(int, int, int)>
	//   17   23:areturn         
			if(i == 2)
	//*  18   24:iload_2         
	//*  19   25:iconst_2        
	//*  20   26:icmpne          40
				return findName(ai[0], ai[1]);
	//   21   29:aload_0         
	//   22   30:aload_1         
	//   23   31:iconst_0        
	//   24   32:iaload          
	//   25   33:aload_1         
	//   26   34:iconst_1        
	//   27   35:iaload          
	//   28   36:invokevirtual   #303 <Method String findName(int, int)>
	//   29   39:areturn         
			else
				return findName(ai[0]);
	//   30   40:aload_0         
	//   31   41:aload_1         
	//   32   42:iconst_0        
	//   33   43:iaload          
	//   34   44:invokevirtual   #305 <Method String findName(int)>
	//   35   47:areturn         
		}
		int j = calcHash(ai, i);
	//   36   48:aload_0         
	//   37   49:aload_1         
	//   38   50:iload_2         
	//   39   51:invokevirtual   #284 <Method int calcHash(int[], int)>
	//   40   54:istore_3        
		int k = _calcOffset(j);
	//   41   55:aload_0         
	//   42   56:iload_3         
	//   43   57:invokespecial   #142 <Method int _calcOffset(int)>
	//   44   60:istore          4
		int ai1[] = _hashArea;
	//   45   62:aload_0         
	//   46   63:getfield        #94  <Field int[] _hashArea>
	//   47   66:astore          7
		int l = ai1[k + 3];
	//   48   68:aload           7
	//   49   70:iload           4
	//   50   72:iconst_3        
	//   51   73:iadd            
	//   52   74:iaload          
	//   53   75:istore          5
		if(j == ai1[k] && l == i && _verifyLongName(ai, i, ai1[k + 1]))
	//*  54   77:iload_3         
	//*  55   78:aload           7
	//*  56   80:iload           4
	//*  57   82:iaload          
	//*  58   83:icmpne          118
	//*  59   86:iload           5
	//*  60   88:iload_2         
	//*  61   89:icmpne          118
	//*  62   92:aload_0         
	//*  63   93:aload_1         
	//*  64   94:iload_2         
	//*  65   95:aload           7
	//*  66   97:iload           4
	//*  67   99:iconst_1        
	//*  68  100:iadd            
	//*  69  101:iaload          
	//*  70  102:invokespecial   #158 <Method boolean _verifyLongName(int[], int, int)>
	//*  71  105:ifeq            118
			return _names[k >> 2];
	//   72  108:aload_0         
	//   73  109:getfield        #99  <Field String[] _names>
	//   74  112:iload           4
	//   75  114:iconst_2        
	//   76  115:ishr            
	//   77  116:aaload          
	//   78  117:areturn         
		if(l == 0)
	//*  79  118:iload           5
	//*  80  120:ifne            125
			return null;
	//   81  123:aconst_null     
	//   82  124:areturn         
		l = _secondaryStart + ((k >> 3) << 2);
	//   83  125:aload_0         
	//   84  126:getfield        #82  <Field int _secondaryStart>
	//   85  129:iload           4
	//   86  131:iconst_3        
	//   87  132:ishr            
	//   88  133:iconst_2        
	//   89  134:ishl            
	//   90  135:iadd            
	//   91  136:istore          5
		int i1 = ai1[l + 3];
	//   92  138:aload           7
	//   93  140:iload           5
	//   94  142:iconst_3        
	//   95  143:iadd            
	//   96  144:iaload          
	//   97  145:istore          6
		if(j == ai1[l] && i1 == i && _verifyLongName(ai, i, ai1[l + 1]))
	//*  98  147:iload_3         
	//*  99  148:aload           7
	//* 100  150:iload           5
	//* 101  152:iaload          
	//* 102  153:icmpne          188
	//* 103  156:iload           6
	//* 104  158:iload_2         
	//* 105  159:icmpne          188
	//* 106  162:aload_0         
	//* 107  163:aload_1         
	//* 108  164:iload_2         
	//* 109  165:aload           7
	//* 110  167:iload           5
	//* 111  169:iconst_1        
	//* 112  170:iadd            
	//* 113  171:iaload          
	//* 114  172:invokespecial   #158 <Method boolean _verifyLongName(int[], int, int)>
	//* 115  175:ifeq            188
			return _names[l >> 2];
	//  116  178:aload_0         
	//  117  179:getfield        #99  <Field String[] _names>
	//  118  182:iload           5
	//  119  184:iconst_2        
	//  120  185:ishr            
	//  121  186:aaload          
	//  122  187:areturn         
		else
			return _findSecondary(k, j, ai, i);
	//  123  188:aload_0         
	//  124  189:iload           4
	//  125  191:iload_3         
	//  126  192:aload_1         
	//  127  193:iload_2         
	//  128  194:invokespecial   #307 <Method String _findSecondary(int, int, int[], int)>
	//  129  197:areturn         
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
	//    3    5:getstatic       #315 <Field com.fasterxml.jackson.core.JsonFactory$Feature com.fasterxml.jackson.core.JsonFactory$Feature.INTERN_FIELD_NAMES>
	//    4    8:iload_1         
	//    5    9:invokevirtual   #319 <Method boolean com.fasterxml.jackson.core.JsonFactory$Feature.enabledIn(int)>
	//    6   12:aload_0         
	//    7   13:getfield        #53  <Field int _seed>
	//    8   16:getstatic       #322 <Field com.fasterxml.jackson.core.JsonFactory$Feature com.fasterxml.jackson.core.JsonFactory$Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW>
	//    9   19:iload_1         
	//   10   20:invokevirtual   #319 <Method boolean com.fasterxml.jackson.core.JsonFactory$Feature.enabledIn(int)>
	//   11   23:aload_0         
	//   12   24:getfield        #68  <Field AtomicReference _tableInfo>
	//   13   27:invokevirtual   #201 <Method Object AtomicReference.get()>
	//   14   30:checkcast       #6   <Class ByteQuadsCanonicalizer$TableInfo>
	//   15   33:invokespecial   #324 <Method void ByteQuadsCanonicalizer(ByteQuadsCanonicalizer, boolean, int, boolean, ByteQuadsCanonicalizer$TableInfo)>
	//   16   36:areturn         
	}

	public boolean maybeDirty()
	{
		return _hashShared ^ true;
	//    0    0:aload_0         
	//    1    1:getfield        #113 <Field boolean _hashShared>
	//    2    4:iconst_1        
	//    3    5:ixor            
	//    4    6:ireturn         
	}

	public int primaryCount()
	{
		int l = _secondaryStart;
	//    0    0:aload_0         
	//    1    1:getfield        #82  <Field int _secondaryStart>
	//    2    4:istore          4
		int j = 0;
	//    3    6:iconst_0        
	//    4    7:istore_2        
		for(int i = 3; i < l;)
	//*   5    8:iconst_3        
	//*   6    9:istore_1        
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
	//*   4    8:invokevirtual   #330 <Method boolean maybeDirty()>
	//*   5   11:ifeq            34
		{
			_parent.mergeChild(new TableInfo(this));
	//    6   14:aload_0         
	//    7   15:getfield        #51  <Field ByteQuadsCanonicalizer _parent>
	//    8   18:new             #6   <Class ByteQuadsCanonicalizer$TableInfo>
	//    9   21:dup             
	//   10   22:aload_0         
	//   11   23:invokespecial   #333 <Method void ByteQuadsCanonicalizer$TableInfo(ByteQuadsCanonicalizer)>
	//   12   26:invokespecial   #335 <Method void mergeChild(ByteQuadsCanonicalizer$TableInfo)>
			_hashShared = true;
	//   13   29:aload_0         
	//   14   30:iconst_1        
	//   15   31:putfield        #113 <Field boolean _hashShared>
		}
	//   16   34:return          
	}

	public int secondaryCount()
	{
		int i = _secondaryStart + 3;
	//    0    0:aload_0         
	//    1    1:getfield        #82  <Field int _secondaryStart>
	//    2    4:iconst_3        
	//    3    5:iadd            
	//    4    6:istore_1        
		int l = _tertiaryStart;
	//    5    7:aload_0         
	//    6    8:getfield        #84  <Field int _tertiaryStart>
	//    7   11:istore          4
		int j;
		int k;
		for(j = 0; i < l; j = k)
	//*   8   13:iconst_0        
	//*   9   14:istore_2        
	//*  10   15:iload_1         
	//*  11   16:iload           4
	//*  12   18:icmpge          45
		{
			k = j;
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
		}

	//   28   40:iload_3         
	//   29   41:istore_2        
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
	//    5   11:invokevirtual   #201 <Method Object AtomicReference.get()>
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
		int l = _tertiaryStart + 3;
	//    0    0:aload_0         
	//    1    1:getfield        #84  <Field int _tertiaryStart>
	//    2    4:iconst_3        
	//    3    5:iadd            
	//    4    6:istore          4
		int i1 = _hashSize;
	//    5    8:aload_0         
	//    6    9:getfield        #80  <Field int _hashSize>
	//    7   12:istore          5
		int k = 0;
	//    8   14:iconst_0        
	//    9   15:istore_3        
		for(int i = l; i < i1 + l;)
	//*  10   16:iload           4
	//*  11   18:istore_1        
	//*  12   19:iload_1         
	//*  13   20:iload           5
	//*  14   22:iload           4
	//*  15   24:iadd            
	//*  16   25:icmpge          52
		{
			int j = k;
	//   17   28:iload_3         
	//   18   29:istore_2        
			if(_hashArea[i] != 0)
	//*  19   30:aload_0         
	//*  20   31:getfield        #94  <Field int[] _hashArea>
	//*  21   34:iload_1         
	//*  22   35:iaload          
	//*  23   36:ifeq            43
				j = k + 1;
	//   24   39:iload_3         
	//   25   40:iconst_1        
	//   26   41:iadd            
	//   27   42:istore_2        
			i += 4;
	//   28   43:iload_1         
	//   29   44:iconst_4        
	//   30   45:iadd            
	//   31   46:istore_1        
			k = j;
	//   32   47:iload_2         
	//   33   48:istore_3        
		}

	//*  34   49:goto            19
		return k;
	//   35   52:iload_3         
	//   36   53:ireturn         
	}

	public String toString()
	{
		int i = primaryCount();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #340 <Method int primaryCount()>
	//    2    4:istore_1        
		int j = secondaryCount();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #342 <Method int secondaryCount()>
	//    5    9:istore_2        
		int k = tertiaryCount();
	//    6   10:aload_0         
	//    7   11:invokevirtual   #344 <Method int tertiaryCount()>
	//    8   14:istore_3        
		int l = spilloverCount();
	//    9   15:aload_0         
	//   10   16:invokevirtual   #346 <Method int spilloverCount()>
	//   11   19:istore          4
		int i1 = totalCount();
	//   12   21:aload_0         
	//   13   22:invokevirtual   #349 <Method int totalCount()>
	//   14   25:istore          5
		return String.format("[%s: size=%d, hashSize=%d, %d/%d/%d/%d pri/sec/ter/spill (=%s), total:%d]", new Object[] {
			((Object)this).getClass().getName(), Integer.valueOf(_count), Integer.valueOf(_hashSize), Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(k), Integer.valueOf(l), Integer.valueOf(i + j + k + l), Integer.valueOf(i1)
		});
	//   15   27:ldc2            #351 <String "[%s: size=%d, hashSize=%d, %d/%d/%d/%d pri/sec/ter/spill (=%s), total:%d]">
	//   16   30:bipush          9
	//   17   32:anewarray       Object[]
	//   18   35:dup             
	//   19   36:iconst_0        
	//   20   37:aload_0         
	//   21   38:invokevirtual   #355 <Method Class Object.getClass()>
	//   22   41:invokevirtual   #360 <Method String Class.getName()>
	//   23   44:aastore         
	//   24   45:dup             
	//   25   46:iconst_1        
	//   26   47:aload_0         
	//   27   48:getfield        #75  <Field int _count>
	//   28   51:invokestatic    #366 <Method Integer Integer.valueOf(int)>
	//   29   54:aastore         
	//   30   55:dup             
	//   31   56:iconst_2        
	//   32   57:aload_0         
	//   33   58:getfield        #80  <Field int _hashSize>
	//   34   61:invokestatic    #366 <Method Integer Integer.valueOf(int)>
	//   35   64:aastore         
	//   36   65:dup             
	//   37   66:iconst_3        
	//   38   67:iload_1         
	//   39   68:invokestatic    #366 <Method Integer Integer.valueOf(int)>
	//   40   71:aastore         
	//   41   72:dup             
	//   42   73:iconst_4        
	//   43   74:iload_2         
	//   44   75:invokestatic    #366 <Method Integer Integer.valueOf(int)>
	//   45   78:aastore         
	//   46   79:dup             
	//   47   80:iconst_5        
	//   48   81:iload_3         
	//   49   82:invokestatic    #366 <Method Integer Integer.valueOf(int)>
	//   50   85:aastore         
	//   51   86:dup             
	//   52   87:bipush          6
	//   53   89:iload           4
	//   54   91:invokestatic    #366 <Method Integer Integer.valueOf(int)>
	//   55   94:aastore         
	//   56   95:dup             
	//   57   96:bipush          7
	//   58   98:iload_1         
	//   59   99:iload_2         
	//   60  100:iadd            
	//   61  101:iload_3         
	//   62  102:iadd            
	//   63  103:iload           4
	//   64  105:iadd            
	//   65  106:invokestatic    #366 <Method Integer Integer.valueOf(int)>
	//   66  109:aastore         
	//   67  110:dup             
	//   68  111:bipush          8
	//   69  113:iload           5
	//   70  115:invokestatic    #366 <Method Integer Integer.valueOf(int)>
	//   71  118:aastore         
	//   72  119:invokestatic    #370 <Method String String.format(String, Object[])>
	//   73  122:areturn         
	}

	public int totalCount()
	{
		int l = _hashSize;
	//    0    0:aload_0         
	//    1    1:getfield        #80  <Field int _hashSize>
	//    2    4:istore          4
		int i = 3;
	//    3    6:iconst_3        
	//    4    7:istore_1        
		int j;
		int k;
		for(j = 0; i < l << 3; j = k)
	//*   5    8:iconst_0        
	//*   6    9:istore_2        
	//*   7   10:iload_1         
	//*   8   11:iload           4
	//*   9   13:iconst_3        
	//*  10   14:ishl            
	//*  11   15:icmpge          42
		{
			k = j;
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
		}

	//   27   37:iload_3         
	//   28   38:istore_2        
	//*  29   39:goto            10
		return j;
	//   30   42:iload_2         
	//   31   43:ireturn         
	}

	private static final int DEFAULT_T_SIZE = 64;
	static final int MAX_ENTRIES_FOR_REUSE = 6000;
	private static final int MAX_T_SIZE = 0x10000;
	private static final int MIN_HASH_SIZE = 16;
	private static final int MULT = 33;
	private static final int MULT2 = 0x1003f;
	private static final int MULT3 = 31;
	private int _count;
	private final boolean _failOnDoS;
	private int _hashArea[];
	private boolean _hashShared;
	private int _hashSize;
	private boolean _intern;
	private int _longNameOffset;
	private String _names[];
	private transient boolean _needRehash;
	private final ByteQuadsCanonicalizer _parent;
	private int _secondaryStart;
	private final int _seed;
	private int _spilloverEnd;
	private final AtomicReference _tableInfo;
	private int _tertiaryShift;
	private int _tertiaryStart;


/*
	static int access$000(ByteQuadsCanonicalizer bytequadscanonicalizer)
	{
		return bytequadscanonicalizer._hashSize;
	//    0    0:aload_0         
	//    1    1:getfield        #80  <Field int _hashSize>
	//    2    4:ireturn         
	}

*/


/*
	static int access$100(ByteQuadsCanonicalizer bytequadscanonicalizer)
	{
		return bytequadscanonicalizer._count;
	//    0    0:aload_0         
	//    1    1:getfield        #75  <Field int _count>
	//    2    4:ireturn         
	}

*/


/*
	static int access$200(ByteQuadsCanonicalizer bytequadscanonicalizer)
	{
		return bytequadscanonicalizer._tertiaryShift;
	//    0    0:aload_0         
	//    1    1:getfield        #89  <Field int _tertiaryShift>
	//    2    4:ireturn         
	}

*/


/*
	static int[] access$300(ByteQuadsCanonicalizer bytequadscanonicalizer)
	{
		return bytequadscanonicalizer._hashArea;
	//    0    0:aload_0         
	//    1    1:getfield        #94  <Field int[] _hashArea>
	//    2    4:areturn         
	}

*/


/*
	static String[] access$400(ByteQuadsCanonicalizer bytequadscanonicalizer)
	{
		return bytequadscanonicalizer._names;
	//    0    0:aload_0         
	//    1    1:getfield        #99  <Field String[] _names>
	//    2    4:areturn         
	}

*/


/*
	static int access$500(ByteQuadsCanonicalizer bytequadscanonicalizer)
	{
		return bytequadscanonicalizer._spilloverEnd;
	//    0    0:aload_0         
	//    1    1:getfield        #104 <Field int _spilloverEnd>
	//    2    4:ireturn         
	}

*/


/*
	static int access$600(ByteQuadsCanonicalizer bytequadscanonicalizer)
	{
		return bytequadscanonicalizer._longNameOffset;
	//    0    0:aload_0         
	//    1    1:getfield        #109 <Field int _longNameOffset>
	//    2    4:ireturn         
	}

*/
}
