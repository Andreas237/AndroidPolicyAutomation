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
	//    1    1:invokespecial   #35  <Method void Object()>
		_parent = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #37  <Field ByteQuadsCanonicalizer _parent>
		_seed = j;
	//    5    9:aload_0         
	//    6   10:iload_3         
	//    7   11:putfield        #39  <Field int _seed>
		_intern = flag;
	//    8   14:aload_0         
	//    9   15:iload_2         
	//   10   16:putfield        #41  <Field boolean _intern>
		_failOnDoS = flag1;
	//   11   19:aload_0         
	//   12   20:iload           4
	//   13   22:putfield        #43  <Field boolean _failOnDoS>
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
	//   41   67:new             #45  <Class AtomicReference>
	//   42   70:dup             
	//   43   71:iload           5
	//   44   73:invokestatic    #49  <Method ByteQuadsCanonicalizer$TableInfo ByteQuadsCanonicalizer$TableInfo.createInitial(int)>
	//   45   76:invokespecial   #52  <Method void AtomicReference(Object)>
	//   46   79:putfield        #54  <Field AtomicReference _tableInfo>
	//   47   82:return          
	}

	private ByteQuadsCanonicalizer(ByteQuadsCanonicalizer bytequadscanonicalizer, boolean flag, int i, boolean flag1, TableInfo tableinfo)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #35  <Method void Object()>
		_parent = bytequadscanonicalizer;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #37  <Field ByteQuadsCanonicalizer _parent>
		_seed = i;
	//    5    9:aload_0         
	//    6   10:iload_3         
	//    7   11:putfield        #39  <Field int _seed>
		_intern = flag;
	//    8   14:aload_0         
	//    9   15:iload_2         
	//   10   16:putfield        #41  <Field boolean _intern>
		_failOnDoS = flag1;
	//   11   19:aload_0         
	//   12   20:iload           4
	//   13   22:putfield        #43  <Field boolean _failOnDoS>
		_tableInfo = null;
	//   14   25:aload_0         
	//   15   26:aconst_null     
	//   16   27:putfield        #54  <Field AtomicReference _tableInfo>
		_count = tableinfo.count;
	//   17   30:aload_0         
	//   18   31:aload           5
	//   19   33:getfield        #59  <Field int ByteQuadsCanonicalizer$TableInfo.count>
	//   20   36:putfield        #61  <Field int _count>
		_hashSize = tableinfo.size;
	//   21   39:aload_0         
	//   22   40:aload           5
	//   23   42:getfield        #64  <Field int ByteQuadsCanonicalizer$TableInfo.size>
	//   24   45:putfield        #66  <Field int _hashSize>
		_secondaryStart = _hashSize << 2;
	//   25   48:aload_0         
	//   26   49:aload_0         
	//   27   50:getfield        #66  <Field int _hashSize>
	//   28   53:iconst_2        
	//   29   54:ishl            
	//   30   55:putfield        #68  <Field int _secondaryStart>
		i = _secondaryStart;
	//   31   58:aload_0         
	//   32   59:getfield        #68  <Field int _secondaryStart>
	//   33   62:istore_3        
		_tertiaryStart = i + (i >> 1);
	//   34   63:aload_0         
	//   35   64:iload_3         
	//   36   65:iload_3         
	//   37   66:iconst_1        
	//   38   67:ishr            
	//   39   68:iadd            
	//   40   69:putfield        #70  <Field int _tertiaryStart>
		_tertiaryShift = tableinfo.tertiaryShift;
	//   41   72:aload_0         
	//   42   73:aload           5
	//   43   75:getfield        #73  <Field int ByteQuadsCanonicalizer$TableInfo.tertiaryShift>
	//   44   78:putfield        #75  <Field int _tertiaryShift>
		_hashArea = tableinfo.mainHash;
	//   45   81:aload_0         
	//   46   82:aload           5
	//   47   84:getfield        #78  <Field int[] ByteQuadsCanonicalizer$TableInfo.mainHash>
	//   48   87:putfield        #80  <Field int[] _hashArea>
		_names = tableinfo.names;
	//   49   90:aload_0         
	//   50   91:aload           5
	//   51   93:getfield        #83  <Field String[] ByteQuadsCanonicalizer$TableInfo.names>
	//   52   96:putfield        #85  <Field String[] _names>
		_spilloverEnd = tableinfo.spilloverEnd;
	//   53   99:aload_0         
	//   54  100:aload           5
	//   55  102:getfield        #88  <Field int ByteQuadsCanonicalizer$TableInfo.spilloverEnd>
	//   56  105:putfield        #90  <Field int _spilloverEnd>
		_longNameOffset = tableinfo.longNameOffset;
	//   57  108:aload_0         
	//   58  109:aload           5
	//   59  111:getfield        #93  <Field int ByteQuadsCanonicalizer$TableInfo.longNameOffset>
	//   60  114:putfield        #95  <Field int _longNameOffset>
		_needRehash = false;
	//   61  117:aload_0         
	//   62  118:iconst_0        
	//   63  119:putfield        #97  <Field boolean _needRehash>
		_hashShared = true;
	//   64  122:aload_0         
	//   65  123:iconst_1        
	//   66  124:putfield        #99  <Field boolean _hashShared>
	//   67  127:return          
	}

	private int _appendLongName(int ai[], int i)
	{
		int j = _longNameOffset;
	//    0    0:aload_0         
	//    1    1:getfield        #95  <Field int _longNameOffset>
	//    2    4:istore_3        
		int l = j + i;
	//    3    5:iload_3         
	//    4    6:iload_2         
	//    5    7:iadd            
	//    6    8:istore          5
		int ai1[] = _hashArea;
	//    7   10:aload_0         
	//    8   11:getfield        #80  <Field int[] _hashArea>
	//    9   14:astore          8
		if(l > ai1.length)
	//*  10   16:iload           5
	//*  11   18:aload           8
	//*  12   20:arraylength     
	//*  13   21:icmple          76
		{
			int i1 = ai1.length;
	//   14   24:aload           8
	//   15   26:arraylength     
	//   16   27:istore          6
			int j1 = Math.min(4096, _hashSize);
	//   17   29:sipush          4096
	//   18   32:aload_0         
	//   19   33:getfield        #66  <Field int _hashSize>
	//   20   36:invokestatic    #107 <Method int Math.min(int, int)>
	//   21   39:istore          7
			int k = _hashArea.length;
	//   22   41:aload_0         
	//   23   42:getfield        #80  <Field int[] _hashArea>
	//   24   45:arraylength     
	//   25   46:istore          4
			l = Math.max(l - i1, j1);
	//   26   48:iload           5
	//   27   50:iload           6
	//   28   52:isub            
	//   29   53:iload           7
	//   30   55:invokestatic    #110 <Method int Math.max(int, int)>
	//   31   58:istore          5
			_hashArea = Arrays.copyOf(_hashArea, k + l);
	//   32   60:aload_0         
	//   33   61:aload_0         
	//   34   62:getfield        #80  <Field int[] _hashArea>
	//   35   65:iload           4
	//   36   67:iload           5
	//   37   69:iadd            
	//   38   70:invokestatic    #116 <Method int[] Arrays.copyOf(int[], int)>
	//   39   73:putfield        #80  <Field int[] _hashArea>
		}
		System.arraycopy(((Object) (ai)), 0, ((Object) (_hashArea)), j, i);
	//   40   76:aload_1         
	//   41   77:iconst_0        
	//   42   78:aload_0         
	//   43   79:getfield        #80  <Field int[] _hashArea>
	//   44   82:iload_3         
	//   45   83:iload_2         
	//   46   84:invokestatic    #122 <Method void System.arraycopy(Object, int, Object, int, int)>
		_longNameOffset = _longNameOffset + i;
	//   47   87:aload_0         
	//   48   88:aload_0         
	//   49   89:getfield        #95  <Field int _longNameOffset>
	//   50   92:iload_2         
	//   51   93:iadd            
	//   52   94:putfield        #95  <Field int _longNameOffset>
		return j;
	//   53   97:iload_3         
	//   54   98:ireturn         
	}

	private final int _calcOffset(int i)
	{
		return (i & _hashSize - 1) << 2;
	//    0    0:iload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #66  <Field int _hashSize>
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
	//    2    2:invokespecial   #128 <Method int _calcOffset(int)>
	//    3    5:istore_1        
		int ai[] = _hashArea;
	//    4    6:aload_0         
	//    5    7:getfield        #80  <Field int[] _hashArea>
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
	//   16   24:getfield        #68  <Field int _secondaryStart>
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
		j = _tertiaryStart;
	//   32   45:aload_0         
	//   33   46:getfield        #70  <Field int _tertiaryStart>
	//   34   49:istore_2        
		int k = _tertiaryShift;
	//   35   50:aload_0         
	//   36   51:getfield        #75  <Field int _tertiaryShift>
	//   37   54:istore_3        
		j += (i >> k + 2) << k;
	//   38   55:iload_2         
	//   39   56:iload_1         
	//   40   57:iload_3         
	//   41   58:iconst_2        
	//   42   59:iadd            
	//   43   60:ishr            
	//   44   61:iload_3         
	//   45   62:ishl            
	//   46   63:iadd            
	//   47   64:istore_2        
		for(i = j; i < (1 << k) + j; i += 4)
	//*  48   65:iload_2         
	//*  49   66:istore_1        
	//*  50   67:iload_1         
	//*  51   68:iconst_1        
	//*  52   69:iload_3         
	//*  53   70:ishl            
	//*  54   71:iload_2         
	//*  55   72:iadd            
	//*  56   73:icmpge          94
			if(ai[i + 3] == 0)
	//*  57   76:aload           4
	//*  58   78:iload_1         
	//*  59   79:iconst_3        
	//*  60   80:iadd            
	//*  61   81:iaload          
	//*  62   82:ifne            87
				return i;
	//   63   85:iload_1         
	//   64   86:ireturn         

	//   65   87:iload_1         
	//   66   88:iconst_4        
	//   67   89:iadd            
	//   68   90:istore_1        
	//*  69   91:goto            67
		i = _spilloverEnd;
	//   70   94:aload_0         
	//   71   95:getfield        #90  <Field int _spilloverEnd>
	//   72   98:istore_1        
		_spilloverEnd = i + 4;
	//   73   99:aload_0         
	//   74  100:iload_1         
	//   75  101:iconst_4        
	//   76  102:iadd            
	//   77  103:putfield        #90  <Field int _spilloverEnd>
		j = _hashSize;
	//   78  106:aload_0         
	//   79  107:getfield        #66  <Field int _hashSize>
	//   80  110:istore_2        
		if(_spilloverEnd >= j << 3)
	//*  81  111:aload_0         
	//*  82  112:getfield        #90  <Field int _spilloverEnd>
	//*  83  115:iload_2         
	//*  84  116:iconst_3        
	//*  85  117:ishl            
	//*  86  118:icmplt          137
		{
			if(_failOnDoS)
	//*  87  121:aload_0         
	//*  88  122:getfield        #43  <Field boolean _failOnDoS>
	//*  89  125:ifeq            132
				_reportTooManyCollisions();
	//   90  128:aload_0         
	//   91  129:invokevirtual   #131 <Method void _reportTooManyCollisions()>
			_needRehash = true;
	//   92  132:aload_0         
	//   93  133:iconst_1        
	//   94  134:putfield        #97  <Field boolean _needRehash>
		}
		return i;
	//   95  137:iload_1         
	//   96  138:ireturn         
	}

	private String _findSecondary(int i, int j)
	{
		int k = _tertiaryStart;
	//    0    0:aload_0         
	//    1    1:getfield        #70  <Field int _tertiaryStart>
	//    2    4:istore_3        
		int l = _tertiaryShift;
	//    3    5:aload_0         
	//    4    6:getfield        #75  <Field int _tertiaryShift>
	//    5    9:istore          4
		k += (i >> l + 2) << l;
	//    6   11:iload_3         
	//    7   12:iload_1         
	//    8   13:iload           4
	//    9   15:iconst_2        
	//   10   16:iadd            
	//   11   17:ishr            
	//   12   18:iload           4
	//   13   20:ishl            
	//   14   21:iadd            
	//   15   22:istore_3        
		int ai[] = _hashArea;
	//   16   23:aload_0         
	//   17   24:getfield        #80  <Field int[] _hashArea>
	//   18   27:astore          6
		for(i = k; i < (1 << l) + k; i += 4)
	//*  19   29:iload_3         
	//*  20   30:istore_1        
	//*  21   31:iload_1         
	//*  22   32:iconst_1        
	//*  23   33:iload           4
	//*  24   35:ishl            
	//*  25   36:iload_3         
	//*  26   37:iadd            
	//*  27   38:icmpge          86
		{
			int i1 = ai[i + 3];
	//   28   41:aload           6
	//   29   43:iload_1         
	//   30   44:iconst_3        
	//   31   45:iadd            
	//   32   46:iaload          
	//   33   47:istore          5
			if(j == ai[i] && 1 == i1)
	//*  34   49:iload_2         
	//*  35   50:aload           6
	//*  36   52:iload_1         
	//*  37   53:iaload          
	//*  38   54:icmpne          72
	//*  39   57:iconst_1        
	//*  40   58:iload           5
	//*  41   60:icmpne          72
				return _names[i >> 2];
	//   42   63:aload_0         
	//   43   64:getfield        #85  <Field String[] _names>
	//   44   67:iload_1         
	//   45   68:iconst_2        
	//   46   69:ishr            
	//   47   70:aaload          
	//   48   71:areturn         
			if(i1 == 0)
	//*  49   72:iload           5
	//*  50   74:ifne            79
				return null;
	//   51   77:aconst_null     
	//   52   78:areturn         
		}

	//   53   79:iload_1         
	//   54   80:iconst_4        
	//   55   81:iadd            
	//   56   82:istore_1        
	//*  57   83:goto            31
		for(i = _spilloverStart(); i < _spilloverEnd; i += 4)
	//*  58   86:aload_0         
	//*  59   87:invokespecial   #137 <Method int _spilloverStart()>
	//*  60   90:istore_1        
	//*  61   91:iload_1         
	//*  62   92:aload_0         
	//*  63   93:getfield        #90  <Field int _spilloverEnd>
	//*  64   96:icmpge          133
			if(j == ai[i] && 1 == ai[i + 3])
	//*  65   99:iload_2         
	//*  66  100:aload           6
	//*  67  102:iload_1         
	//*  68  103:iaload          
	//*  69  104:icmpne          126
	//*  70  107:iconst_1        
	//*  71  108:aload           6
	//*  72  110:iload_1         
	//*  73  111:iconst_3        
	//*  74  112:iadd            
	//*  75  113:iaload          
	//*  76  114:icmpne          126
				return _names[i >> 2];
	//   77  117:aload_0         
	//   78  118:getfield        #85  <Field String[] _names>
	//   79  121:iload_1         
	//   80  122:iconst_2        
	//   81  123:ishr            
	//   82  124:aaload          
	//   83  125:areturn         

	//   84  126:iload_1         
	//   85  127:iconst_4        
	//   86  128:iadd            
	//   87  129:istore_1        
	//*  88  130:goto            91
		return null;
	//   89  133:aconst_null     
	//   90  134:areturn         
	}

	private String _findSecondary(int i, int j, int k)
	{
		int l = _tertiaryStart;
	//    0    0:aload_0         
	//    1    1:getfield        #70  <Field int _tertiaryStart>
	//    2    4:istore          4
		int i1 = _tertiaryShift;
	//    3    6:aload_0         
	//    4    7:getfield        #75  <Field int _tertiaryShift>
	//    5   10:istore          5
		l += (i >> i1 + 2) << i1;
	//    6   12:iload           4
	//    7   14:iload_1         
	//    8   15:iload           5
	//    9   17:iconst_2        
	//   10   18:iadd            
	//   11   19:ishr            
	//   12   20:iload           5
	//   13   22:ishl            
	//   14   23:iadd            
	//   15   24:istore          4
		int ai[] = _hashArea;
	//   16   26:aload_0         
	//   17   27:getfield        #80  <Field int[] _hashArea>
	//   18   30:astore          7
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
	//   50   79:getfield        #85  <Field String[] _names>
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
	//*  66  102:invokespecial   #137 <Method int _spilloverStart()>
	//*  67  105:istore_1        
	//*  68  106:iload_1         
	//*  69  107:aload_0         
	//*  70  108:getfield        #90  <Field int _spilloverEnd>
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
	//   92  143:getfield        #85  <Field String[] _names>
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
		int i1 = _tertiaryStart;
	//    0    0:aload_0         
	//    1    1:getfield        #70  <Field int _tertiaryStart>
	//    2    4:istore          5
		int j1 = _tertiaryShift;
	//    3    6:aload_0         
	//    4    7:getfield        #75  <Field int _tertiaryShift>
	//    5   10:istore          6
		i1 += (i >> j1 + 2) << j1;
	//    6   12:iload           5
	//    7   14:iload_1         
	//    8   15:iload           6
	//    9   17:iconst_2        
	//   10   18:iadd            
	//   11   19:ishr            
	//   12   20:iload           6
	//   13   22:ishl            
	//   14   23:iadd            
	//   15   24:istore          5
		int ai[] = _hashArea;
	//   16   26:aload_0         
	//   17   27:getfield        #80  <Field int[] _hashArea>
	//   18   30:astore          8
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
	//   57   90:getfield        #85  <Field String[] _names>
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
	//*  73  113:invokespecial   #137 <Method int _spilloverStart()>
	//*  74  116:istore_1        
	//*  75  117:iload_1         
	//*  76  118:aload_0         
	//*  77  119:getfield        #90  <Field int _spilloverEnd>
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
	//  106  165:getfield        #85  <Field String[] _names>
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
		int l = _tertiaryStart;
	//    0    0:aload_0         
	//    1    1:getfield        #70  <Field int _tertiaryStart>
	//    2    4:istore          5
		int i1 = _tertiaryShift;
	//    3    6:aload_0         
	//    4    7:getfield        #75  <Field int _tertiaryShift>
	//    5   10:istore          6
		l += (i >> i1 + 2) << i1;
	//    6   12:iload           5
	//    7   14:iload_1         
	//    8   15:iload           6
	//    9   17:iconst_2        
	//   10   18:iadd            
	//   11   19:ishr            
	//   12   20:iload           6
	//   13   22:ishl            
	//   14   23:iadd            
	//   15   24:istore          5
		int ai1[] = _hashArea;
	//   16   26:aload_0         
	//   17   27:getfield        #80  <Field int[] _hashArea>
	//   18   30:astore          8
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
	//*  50   79:invokespecial   #144 <Method boolean _verifyLongName(int[], int, int)>
	//*  51   82:ifeq            94
				return _names[i >> 2];
	//   52   85:aload_0         
	//   53   86:getfield        #85  <Field String[] _names>
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
	//*  69  109:invokespecial   #137 <Method int _spilloverStart()>
	//*  70  112:istore_1        
	//*  71  113:iload_1         
	//*  72  114:aload_0         
	//*  73  115:getfield        #90  <Field int _spilloverEnd>
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
	//*  95  150:invokespecial   #144 <Method boolean _verifyLongName(int[], int, int)>
	//*  96  153:ifeq            165
				return _names[i >> 2];
	//   97  156:aload_0         
	//   98  157:getfield        #85  <Field String[] _names>
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
	//    1    1:getfield        #66  <Field int _hashSize>
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
	//    1    1:getfield        #80  <Field int[] _hashArea>
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
	//    9   44:invokespecial   #147 <Method boolean _verifyLongName2(int[], int, int)>
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
									j++;
	//   20   60:iload_3         
	//   21   61:iconst_1        
	//   22   62:iadd            
	//   23   63:istore_3        
									i = 1;
	//   24   64:iconst_1        
	//   25   65:istore_2        
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
	//*  10   14:getfield        #80  <Field int[] _hashArea>
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
		if(_count > _hashSize >> 1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #61  <Field int _count>
	//*   2    4:aload_0         
	//*   3    5:getfield        #66  <Field int _hashSize>
	//*   4    8:iconst_1        
	//*   5    9:ishr            
	//*   6   10:icmple          62
		{
			int i = _spilloverEnd;
	//    7   13:aload_0         
	//    8   14:getfield        #90  <Field int _spilloverEnd>
	//    9   17:istore_1        
			int j = _spilloverStart();
	//   10   18:aload_0         
	//   11   19:invokespecial   #137 <Method int _spilloverStart()>
	//   12   22:istore_2        
			int k = _count;
	//   13   23:aload_0         
	//   14   24:getfield        #61  <Field int _count>
	//   15   27:istore_3        
			if(i - j >> 2 > k + 1 >> 7 || (double)k > (double)_hashSize * 0.80000000000000004D)
	//*  16   28:iload_1         
	//*  17   29:iload_2         
	//*  18   30:isub            
	//*  19   31:iconst_2        
	//*  20   32:ishr            
	//*  21   33:iload_3         
	//*  22   34:iconst_1        
	//*  23   35:iadd            
	//*  24   36:bipush          7
	//*  25   38:ishr            
	//*  26   39:icmpgt          57
	//*  27   42:iload_3         
	//*  28   43:i2d             
	//*  29   44:aload_0         
	//*  30   45:getfield        #66  <Field int _hashSize>
	//*  31   48:i2d             
	//*  32   49:ldc2w           #149 <Double 0.80000000000000004D>
	//*  33   52:dmul            
	//*  34   53:dcmpl           
	//*  35   54:ifle            62
				_needRehash = true;
	//   36   57:aload_0         
	//   37   58:iconst_1        
	//   38   59:putfield        #97  <Field boolean _needRehash>
		}
	//   39   62:return          
	}

	private void _verifySharing()
	{
		if(_hashShared)
	//*   0    0:aload_0         
	//*   1    1:getfield        #99  <Field boolean _hashShared>
	//*   2    4:ifeq            49
		{
			Object aobj[] = ((Object []) (_hashArea));
	//    3    7:aload_0         
	//    4    8:getfield        #80  <Field int[] _hashArea>
	//    5   11:astore_1        
			_hashArea = Arrays.copyOf(((int []) (aobj)), aobj.length);
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:aload_1         
	//    9   15:arraylength     
	//   10   16:invokestatic    #116 <Method int[] Arrays.copyOf(int[], int)>
	//   11   19:putfield        #80  <Field int[] _hashArea>
			aobj = ((Object []) (_names));
	//   12   22:aload_0         
	//   13   23:getfield        #85  <Field String[] _names>
	//   14   26:astore_1        
			_names = (String[])Arrays.copyOf(aobj, aobj.length);
	//   15   27:aload_0         
	//   16   28:aload_1         
	//   17   29:aload_1         
	//   18   30:arraylength     
	//   19   31:invokestatic    #154 <Method Object[] Arrays.copyOf(Object[], int)>
	//   20   34:checkcast       #155 <Class String[]>
	//   21   37:putfield        #85  <Field String[] _names>
			_hashShared = false;
	//   22   40:aload_0         
	//   23   41:iconst_0        
	//   24   42:putfield        #99  <Field boolean _hashShared>
			_verifyNeedForRehash();
	//   25   45:aload_0         
	//   26   46:invokespecial   #157 <Method void _verifyNeedForRehash()>
		}
		if(_needRehash)
	//*  27   49:aload_0         
	//*  28   50:getfield        #97  <Field boolean _needRehash>
	//*  29   53:ifeq            60
			rehash();
	//   30   56:aload_0         
	//   31   57:invokespecial   #160 <Method void rehash()>
	//   32   60:return          
	}

	public static ByteQuadsCanonicalizer createRoot()
	{
		long l = System.currentTimeMillis();
	//    0    0:invokestatic    #176 <Method long System.currentTimeMillis()>
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
	//   11   14:invokestatic    #179 <Method ByteQuadsCanonicalizer createRoot(int)>
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
	//    6    9:invokespecial   #181 <Method void ByteQuadsCanonicalizer(int, boolean, int, boolean)>
	//    7   12:areturn         
	}

	private void mergeChild(TableInfo tableinfo)
	{
		int i = tableinfo.count;
	//    0    0:aload_1         
	//    1    1:getfield        #59  <Field int ByteQuadsCanonicalizer$TableInfo.count>
	//    2    4:istore_2        
		TableInfo tableinfo1 = (TableInfo)_tableInfo.get();
	//    3    5:aload_0         
	//    4    6:getfield        #54  <Field AtomicReference _tableInfo>
	//    5    9:invokevirtual   #187 <Method Object AtomicReference.get()>
	//    6   12:checkcast       #6   <Class ByteQuadsCanonicalizer$TableInfo>
	//    7   15:astore_3        
		if(i == tableinfo1.count)
	//*   8   16:iload_2         
	//*   9   17:aload_3         
	//*  10   18:getfield        #59  <Field int ByteQuadsCanonicalizer$TableInfo.count>
	//*  11   21:icmpne          25
			return;
	//   12   24:return          
		if(i > 6000)
	//*  13   25:iload_2         
	//*  14   26:sipush          6000
	//*  15   29:icmple          38
			tableinfo = TableInfo.createInitial(64);
	//   16   32:bipush          64
	//   17   34:invokestatic    #49  <Method ByteQuadsCanonicalizer$TableInfo ByteQuadsCanonicalizer$TableInfo.createInitial(int)>
	//   18   37:astore_1        
		_tableInfo.compareAndSet(((Object) (tableinfo1)), ((Object) (tableinfo)));
	//   19   38:aload_0         
	//   20   39:getfield        #54  <Field AtomicReference _tableInfo>
	//   21   42:aload_3         
	//   22   43:aload_1         
	//   23   44:invokevirtual   #191 <Method boolean AtomicReference.compareAndSet(Object, Object)>
	//   24   47:pop             
	//   25   48:return          
	}

	private void nukeSymbols(boolean flag)
	{
		_count = 0;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #61  <Field int _count>
		_spilloverEnd = _spilloverStart();
	//    3    5:aload_0         
	//    4    6:aload_0         
	//    5    7:invokespecial   #137 <Method int _spilloverStart()>
	//    6   10:putfield        #90  <Field int _spilloverEnd>
		_longNameOffset = _hashSize << 3;
	//    7   13:aload_0         
	//    8   14:aload_0         
	//    9   15:getfield        #66  <Field int _hashSize>
	//   10   18:iconst_3        
	//   11   19:ishl            
	//   12   20:putfield        #95  <Field int _longNameOffset>
		if(flag)
	//*  13   23:iload_1         
	//*  14   24:ifeq            43
		{
			Arrays.fill(_hashArea, 0);
	//   15   27:aload_0         
	//   16   28:getfield        #80  <Field int[] _hashArea>
	//   17   31:iconst_0        
	//   18   32:invokestatic    #197 <Method void Arrays.fill(int[], int)>
			Arrays.fill(((Object []) (_names)), ((Object) (null)));
	//   19   35:aload_0         
	//   20   36:getfield        #85  <Field String[] _names>
	//   21   39:aconst_null     
	//   22   40:invokestatic    #200 <Method void Arrays.fill(Object[], Object)>
		}
	//   23   43:return          
	}

	private void rehash()
	{
		_needRehash = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #97  <Field boolean _needRehash>
		_hashShared = false;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #99  <Field boolean _hashShared>
		int ai2[] = _hashArea;
	//    6   10:aload_0         
	//    7   11:getfield        #80  <Field int[] _hashArea>
	//    8   14:astore          8
		String as[] = _names;
	//    9   16:aload_0         
	//   10   17:getfield        #85  <Field String[] _names>
	//   11   20:astore          9
		int j = _hashSize;
	//   12   22:aload_0         
	//   13   23:getfield        #66  <Field int _hashSize>
	//   14   26:istore_2        
		int k = _count;
	//   15   27:aload_0         
	//   16   28:getfield        #61  <Field int _count>
	//   17   31:istore_3        
		int i = j + j;
	//   18   32:iload_2         
	//   19   33:iload_2         
	//   20   34:iadd            
	//   21   35:istore_1        
		int l = _spilloverEnd;
	//   22   36:aload_0         
	//   23   37:getfield        #90  <Field int _spilloverEnd>
	//   24   40:istore          4
		if(i > 0x10000)
	//*  25   42:iload_1         
	//*  26   43:ldc1            #201 <Int 0x10000>
	//*  27   45:icmple          54
		{
			nukeSymbols(true);
	//   28   48:aload_0         
	//   29   49:iconst_1        
	//   30   50:invokespecial   #203 <Method void nukeSymbols(boolean)>
			return;
	//   31   53:return          
		}
		_hashArea = new int[ai2.length + (j << 3)];
	//   32   54:aload_0         
	//   33   55:aload           8
	//   34   57:arraylength     
	//   35   58:iload_2         
	//   36   59:iconst_3        
	//   37   60:ishl            
	//   38   61:iadd            
	//   39   62:newarray        int[]
	//   40   64:putfield        #80  <Field int[] _hashArea>
		_hashSize = i;
	//   41   67:aload_0         
	//   42   68:iload_1         
	//   43   69:putfield        #66  <Field int _hashSize>
		_secondaryStart = i << 2;
	//   44   72:aload_0         
	//   45   73:iload_1         
	//   46   74:iconst_2        
	//   47   75:ishl            
	//   48   76:putfield        #68  <Field int _secondaryStart>
		j = _secondaryStart;
	//   49   79:aload_0         
	//   50   80:getfield        #68  <Field int _secondaryStart>
	//   51   83:istore_2        
		_tertiaryStart = j + (j >> 1);
	//   52   84:aload_0         
	//   53   85:iload_2         
	//   54   86:iload_2         
	//   55   87:iconst_1        
	//   56   88:ishr            
	//   57   89:iadd            
	//   58   90:putfield        #70  <Field int _tertiaryStart>
		_tertiaryShift = _calcTertiaryShift(i);
	//   59   93:aload_0         
	//   60   94:iload_1         
	//   61   95:invokestatic    #205 <Method int _calcTertiaryShift(int)>
	//   62   98:putfield        #75  <Field int _tertiaryShift>
		_names = new String[as.length << 1];
	//   63  101:aload_0         
	//   64  102:aload           9
	//   65  104:arraylength     
	//   66  105:iconst_1        
	//   67  106:ishl            
	//   68  107:anewarray       String[]
	//   69  110:putfield        #85  <Field String[] _names>
		nukeSymbols(false);
	//   70  113:aload_0         
	//   71  114:iconst_0        
	//   72  115:invokespecial   #203 <Method void nukeSymbols(boolean)>
		int ai[] = new int[16];
	//   73  118:bipush          16
	//   74  120:newarray        int[]
	//   75  122:astore          6
		i = 0;
	//   76  124:iconst_0        
	//   77  125:istore_1        
		j = 0;
	//   78  126:iconst_0        
	//   79  127:istore_2        
		for(; i < l; i += 4)
	//*  80  128:iload_1         
	//*  81  129:iload           4
	//*  82  131:icmpge          344
		{
			int i1 = ai2[i + 3];
	//   83  134:aload           8
	//   84  136:iload_1         
	//   85  137:iconst_3        
	//   86  138:iadd            
	//   87  139:iaload          
	//   88  140:istore          5
			if(i1 == 0)
	//*  89  142:iload           5
	//*  90  144:ifne            150
				continue;
	//   91  147:goto            337
			j++;
	//   92  150:iload_2         
	//   93  151:iconst_1        
	//   94  152:iadd            
	//   95  153:istore_2        
			String s = as[i >> 2];
	//   96  154:aload           9
	//   97  156:iload_1         
	//   98  157:iconst_2        
	//   99  158:ishr            
	//  100  159:aaload          
	//  101  160:astore          10
			switch(i1)
	//* 102  162:iload           5
			{
	//* 103  164:tableswitch     1 3: default 192
	//	               1 285
	//	               2 254
	//	               3 213
			default:
				int ai1[] = ai;
	//  104  192:aload           6
	//  105  194:astore          7
				if(i1 > ai.length)
	//* 106  196:iload           5
	//* 107  198:aload           6
	//* 108  200:arraylength     
	//* 109  201:icmple          306
					ai1 = new int[i1];
	//  110  204:iload           5
	//  111  206:newarray        int[]
	//  112  208:astore          7
	//* 113  210:goto            306
	//* 114  213:aload           6
	//* 115  215:iconst_0        
	//* 116  216:aload           8
	//* 117  218:iload_1         
	//* 118  219:iaload          
	//* 119  220:iastore         
	//* 120  221:aload           6
	//* 121  223:iconst_1        
	//* 122  224:aload           8
	//* 123  226:iload_1         
	//* 124  227:iconst_1        
	//* 125  228:iadd            
	//* 126  229:iaload          
	//* 127  230:iastore         
	//* 128  231:aload           6
	//* 129  233:iconst_2        
	//* 130  234:aload           8
	//* 131  236:iload_1         
	//* 132  237:iconst_2        
	//* 133  238:iadd            
	//* 134  239:iaload          
	//* 135  240:iastore         
	//* 136  241:aload_0         
	//* 137  242:aload           10
	//* 138  244:aload           6
	//* 139  246:iconst_3        
	//* 140  247:invokevirtual   #211 <Method String addName(String, int[], int)>
	//* 141  250:pop             
	//* 142  251:goto            337
	//* 143  254:aload           6
	//* 144  256:iconst_0        
	//* 145  257:aload           8
	//* 146  259:iload_1         
	//* 147  260:iaload          
	//* 148  261:iastore         
	//* 149  262:aload           6
	//* 150  264:iconst_1        
	//* 151  265:aload           8
	//* 152  267:iload_1         
	//* 153  268:iconst_1        
	//* 154  269:iadd            
	//* 155  270:iaload          
	//* 156  271:iastore         
	//* 157  272:aload_0         
	//* 158  273:aload           10
	//* 159  275:aload           6
	//* 160  277:iconst_2        
	//* 161  278:invokevirtual   #211 <Method String addName(String, int[], int)>
	//* 162  281:pop             
	//* 163  282:goto            337
	//* 164  285:aload           6
	//* 165  287:iconst_0        
	//* 166  288:aload           8
	//* 167  290:iload_1         
	//* 168  291:iaload          
	//* 169  292:iastore         
	//* 170  293:aload_0         
	//* 171  294:aload           10
	//* 172  296:aload           6
	//* 173  298:iconst_1        
	//* 174  299:invokevirtual   #211 <Method String addName(String, int[], int)>
	//* 175  302:pop             
	//* 176  303:goto            337
				System.arraycopy(((Object) (ai2)), ai2[i + 1], ((Object) (ai1)), 0, i1);
	//  177  306:aload           8
	//  178  308:aload           8
	//  179  310:iload_1         
	//  180  311:iconst_1        
	//  181  312:iadd            
	//  182  313:iaload          
	//  183  314:aload           7
	//  184  316:iconst_0        
	//  185  317:iload           5
	//  186  319:invokestatic    #122 <Method void System.arraycopy(Object, int, Object, int, int)>
				addName(s, ai1, i1);
	//  187  322:aload_0         
	//  188  323:aload           10
	//  189  325:aload           7
	//  190  327:iload           5
	//  191  329:invokevirtual   #211 <Method String addName(String, int[], int)>
	//  192  332:pop             
				ai = ai1;
	//  193  333:aload           7
	//  194  335:astore          6
				break;

			case 3: // '\003'
				ai[0] = ai2[i];
				ai[1] = ai2[i + 1];
				ai[2] = ai2[i + 2];
				addName(s, ai, 3);
				break;

			case 2: // '\002'
				ai[0] = ai2[i];
				ai[1] = ai2[i + 1];
				addName(s, ai, 2);
				break;

			case 1: // '\001'
				ai[0] = ai2[i];
				addName(s, ai, 1);
				break;
			}
		}

	//  195  337:iload_1         
	//  196  338:iconst_4        
	//  197  339:iadd            
	//  198  340:istore_1        
	//* 199  341:goto            128
		if(j == k)
	//* 200  344:iload_2         
	//* 201  345:iload_3         
	//* 202  346:icmpne          350
		{
			return;
	//  203  349:return          
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//  204  350:new             #213 <Class StringBuilder>
	//  205  353:dup             
	//  206  354:invokespecial   #214 <Method void StringBuilder()>
	//  207  357:astore          6
			stringbuilder.append("Failed rehash(): old count=");
	//  208  359:aload           6
	//  209  361:ldc1            #216 <String "Failed rehash(): old count=">
	//  210  363:invokevirtual   #220 <Method StringBuilder StringBuilder.append(String)>
	//  211  366:pop             
			stringbuilder.append(k);
	//  212  367:aload           6
	//  213  369:iload_3         
	//  214  370:invokevirtual   #223 <Method StringBuilder StringBuilder.append(int)>
	//  215  373:pop             
			stringbuilder.append(", copyCount=");
	//  216  374:aload           6
	//  217  376:ldc1            #225 <String ", copyCount=">
	//  218  378:invokevirtual   #220 <Method StringBuilder StringBuilder.append(String)>
	//  219  381:pop             
			stringbuilder.append(j);
	//  220  382:aload           6
	//  221  384:iload_2         
	//  222  385:invokevirtual   #223 <Method StringBuilder StringBuilder.append(int)>
	//  223  388:pop             
			throw new IllegalStateException(stringbuilder.toString());
	//  224  389:new             #227 <Class IllegalStateException>
	//  225  392:dup             
	//  226  393:aload           6
	//  227  395:invokevirtual   #231 <Method String StringBuilder.toString()>
	//  228  398:invokespecial   #234 <Method void IllegalStateException(String)>
	//  229  401:athrow          
		}
	}

	protected void _reportTooManyCollisions()
	{
		if(_hashSize <= 1024)
	//*   0    0:aload_0         
	//*   1    1:getfield        #66  <Field int _hashSize>
	//*   2    4:sipush          1024
	//*   3    7:icmpgt          11
		{
			return;
	//    4   10:return          
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    5   11:new             #213 <Class StringBuilder>
	//    6   14:dup             
	//    7   15:invokespecial   #214 <Method void StringBuilder()>
	//    8   18:astore_1        
			stringbuilder.append("Spill-over slots in symbol table with ");
	//    9   19:aload_1         
	//   10   20:ldc1            #236 <String "Spill-over slots in symbol table with ">
	//   11   22:invokevirtual   #220 <Method StringBuilder StringBuilder.append(String)>
	//   12   25:pop             
			stringbuilder.append(_count);
	//   13   26:aload_1         
	//   14   27:aload_0         
	//   15   28:getfield        #61  <Field int _count>
	//   16   31:invokevirtual   #223 <Method StringBuilder StringBuilder.append(int)>
	//   17   34:pop             
			stringbuilder.append(" entries, hash area of ");
	//   18   35:aload_1         
	//   19   36:ldc1            #238 <String " entries, hash area of ">
	//   20   38:invokevirtual   #220 <Method StringBuilder StringBuilder.append(String)>
	//   21   41:pop             
			stringbuilder.append(_hashSize);
	//   22   42:aload_1         
	//   23   43:aload_0         
	//   24   44:getfield        #66  <Field int _hashSize>
	//   25   47:invokevirtual   #223 <Method StringBuilder StringBuilder.append(int)>
	//   26   50:pop             
			stringbuilder.append(" slots is now full (all ");
	//   27   51:aload_1         
	//   28   52:ldc1            #240 <String " slots is now full (all ">
	//   29   54:invokevirtual   #220 <Method StringBuilder StringBuilder.append(String)>
	//   30   57:pop             
			stringbuilder.append(_hashSize >> 3);
	//   31   58:aload_1         
	//   32   59:aload_0         
	//   33   60:getfield        #66  <Field int _hashSize>
	//   34   63:iconst_3        
	//   35   64:ishr            
	//   36   65:invokevirtual   #223 <Method StringBuilder StringBuilder.append(int)>
	//   37   68:pop             
			stringbuilder.append(" slots -- suspect a DoS attack based on hash collisions.");
	//   38   69:aload_1         
	//   39   70:ldc1            #242 <String " slots -- suspect a DoS attack based on hash collisions.">
	//   40   72:invokevirtual   #220 <Method StringBuilder StringBuilder.append(String)>
	//   41   75:pop             
			stringbuilder.append(" You can disable the check via `JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW`");
	//   42   76:aload_1         
	//   43   77:ldc1            #244 <String " You can disable the check via `JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW`">
	//   44   79:invokevirtual   #220 <Method StringBuilder StringBuilder.append(String)>
	//   45   82:pop             
			throw new IllegalStateException(stringbuilder.toString());
	//   46   83:new             #227 <Class IllegalStateException>
	//   47   86:dup             
	//   48   87:aload_1         
	//   49   88:invokevirtual   #231 <Method String StringBuilder.toString()>
	//   50   91:invokespecial   #234 <Method void IllegalStateException(String)>
	//   51   94:athrow          
		}
	}

	public String addName(String s, int ai[], int i)
	{
		_verifySharing();
	//    0    0:aload_0         
	//    1    1:invokespecial   #246 <Method void _verifySharing()>
		String s1 = s;
	//    2    4:aload_1         
	//    3    5:astore          6
		if(_intern)
	//*   4    7:aload_0         
	//*   5    8:getfield        #41  <Field boolean _intern>
	//*   6   11:ifeq            23
			s1 = InternCache.instance.intern(s);
	//    7   14:getstatic       #252 <Field InternCache InternCache.instance>
	//    8   17:aload_1         
	//    9   18:invokevirtual   #256 <Method String InternCache.intern(String)>
	//   10   21:astore          6
		switch(i)
	//*  11   23:iload_3         
		{
	//*  12   24:tableswitch     1 3: default 52
	//	               1 208
	//	               2 165
	//	               3 111
		default:
			int k = calcHash(ai, i);
	//   13   52:aload_0         
	//   14   53:aload_2         
	//   15   54:iload_3         
	//   16   55:invokevirtual   #259 <Method int calcHash(int[], int)>
	//   17   58:istore          5
			int j = _findOffsetForAdd(k);
	//   18   60:aload_0         
	//   19   61:iload           5
	//   20   63:invokespecial   #261 <Method int _findOffsetForAdd(int)>
	//   21   66:istore          4
			_hashArea[j] = k;
	//   22   68:aload_0         
	//   23   69:getfield        #80  <Field int[] _hashArea>
	//   24   72:iload           4
	//   25   74:iload           5
	//   26   76:iastore         
			k = _appendLongName(ai, i);
	//   27   77:aload_0         
	//   28   78:aload_2         
	//   29   79:iload_3         
	//   30   80:invokespecial   #263 <Method int _appendLongName(int[], int)>
	//   31   83:istore          5
			s = ((String) (_hashArea));
	//   32   85:aload_0         
	//   33   86:getfield        #80  <Field int[] _hashArea>
	//   34   89:astore_1        
			s[j + 1] = k;
	//   35   90:aload_1         
	//   36   91:iload           4
	//   37   93:iconst_1        
	//   38   94:iadd            
	//   39   95:iload           5
	//   40   97:iastore         
			s[j + 3] = i;
	//   41   98:aload_1         
	//   42   99:iload           4
	//   43  101:iconst_3        
	//   44  102:iadd            
	//   45  103:iload_3         
	//   46  104:iastore         
			i = j;
	//   47  105:iload           4
	//   48  107:istore_3        
			break;

	//*  49  108:goto            237
		case 3: // '\003'
			i = _findOffsetForAdd(calcHash(ai[0], ai[1], ai[2]));
	//   50  111:aload_0         
	//   51  112:aload_0         
	//   52  113:aload_2         
	//   53  114:iconst_0        
	//   54  115:iaload          
	//   55  116:aload_2         
	//   56  117:iconst_1        
	//   57  118:iaload          
	//   58  119:aload_2         
	//   59  120:iconst_2        
	//   60  121:iaload          
	//   61  122:invokevirtual   #266 <Method int calcHash(int, int, int)>
	//   62  125:invokespecial   #261 <Method int _findOffsetForAdd(int)>
	//   63  128:istore_3        
			s = ((String) (_hashArea));
	//   64  129:aload_0         
	//   65  130:getfield        #80  <Field int[] _hashArea>
	//   66  133:astore_1        
			s[i] = ai[0];
	//   67  134:aload_1         
	//   68  135:iload_3         
	//   69  136:aload_2         
	//   70  137:iconst_0        
	//   71  138:iaload          
	//   72  139:iastore         
			s[i + 1] = ai[1];
	//   73  140:aload_1         
	//   74  141:iload_3         
	//   75  142:iconst_1        
	//   76  143:iadd            
	//   77  144:aload_2         
	//   78  145:iconst_1        
	//   79  146:iaload          
	//   80  147:iastore         
			s[i + 2] = ai[2];
	//   81  148:aload_1         
	//   82  149:iload_3         
	//   83  150:iconst_2        
	//   84  151:iadd            
	//   85  152:aload_2         
	//   86  153:iconst_2        
	//   87  154:iaload          
	//   88  155:iastore         
			s[i + 3] = 3;
	//   89  156:aload_1         
	//   90  157:iload_3         
	//   91  158:iconst_3        
	//   92  159:iadd            
	//   93  160:iconst_3        
	//   94  161:iastore         
			break;

	//*  95  162:goto            237
		case 2: // '\002'
			i = _findOffsetForAdd(calcHash(ai[0], ai[1]));
	//   96  165:aload_0         
	//   97  166:aload_0         
	//   98  167:aload_2         
	//   99  168:iconst_0        
	//  100  169:iaload          
	//  101  170:aload_2         
	//  102  171:iconst_1        
	//  103  172:iaload          
	//  104  173:invokevirtual   #268 <Method int calcHash(int, int)>
	//  105  176:invokespecial   #261 <Method int _findOffsetForAdd(int)>
	//  106  179:istore_3        
			s = ((String) (_hashArea));
	//  107  180:aload_0         
	//  108  181:getfield        #80  <Field int[] _hashArea>
	//  109  184:astore_1        
			s[i] = ai[0];
	//  110  185:aload_1         
	//  111  186:iload_3         
	//  112  187:aload_2         
	//  113  188:iconst_0        
	//  114  189:iaload          
	//  115  190:iastore         
			s[i + 1] = ai[1];
	//  116  191:aload_1         
	//  117  192:iload_3         
	//  118  193:iconst_1        
	//  119  194:iadd            
	//  120  195:aload_2         
	//  121  196:iconst_1        
	//  122  197:iaload          
	//  123  198:iastore         
			s[i + 3] = 2;
	//  124  199:aload_1         
	//  125  200:iload_3         
	//  126  201:iconst_3        
	//  127  202:iadd            
	//  128  203:iconst_2        
	//  129  204:iastore         
			break;

	//* 130  205:goto            237
		case 1: // '\001'
			i = _findOffsetForAdd(calcHash(ai[0]));
	//  131  208:aload_0         
	//  132  209:aload_0         
	//  133  210:aload_2         
	//  134  211:iconst_0        
	//  135  212:iaload          
	//  136  213:invokevirtual   #270 <Method int calcHash(int)>
	//  137  216:invokespecial   #261 <Method int _findOffsetForAdd(int)>
	//  138  219:istore_3        
			s = ((String) (_hashArea));
	//  139  220:aload_0         
	//  140  221:getfield        #80  <Field int[] _hashArea>
	//  141  224:astore_1        
			s[i] = ai[0];
	//  142  225:aload_1         
	//  143  226:iload_3         
	//  144  227:aload_2         
	//  145  228:iconst_0        
	//  146  229:iaload          
	//  147  230:iastore         
			s[i + 3] = 1;
	//  148  231:aload_1         
	//  149  232:iload_3         
	//  150  233:iconst_3        
	//  151  234:iadd            
	//  152  235:iconst_1        
	//  153  236:iastore         
			break;
		}
		_names[i >> 2] = s1;
	//  154  237:aload_0         
	//  155  238:getfield        #85  <Field String[] _names>
	//  156  241:iload_3         
	//  157  242:iconst_2        
	//  158  243:ishr            
	//  159  244:aload           6
	//  160  246:aastore         
		_count = _count + 1;
	//  161  247:aload_0         
	//  162  248:aload_0         
	//  163  249:getfield        #61  <Field int _count>
	//  164  252:iconst_1        
	//  165  253:iadd            
	//  166  254:putfield        #61  <Field int _count>
		_verifyNeedForRehash();
	//  167  257:aload_0         
	//  168  258:invokespecial   #157 <Method void _verifyNeedForRehash()>
		return s1;
	//  169  261:aload           6
	//  170  263:areturn         
	}

	public int calcHash(int i)
	{
		i ^= _seed;
	//    0    0:iload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #39  <Field int _seed>
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
	//   16   19:getfield        #39  <Field int _seed>
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
	//    2    2:getfield        #39  <Field int _seed>
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
		if(i >= 4)
	//*   0    0:iload_2         
	//*   1    1:iconst_4        
	//*   2    2:icmplt          98
		{
			int j = ai[0] ^ _seed;
	//    3    5:aload_1         
	//    4    6:iconst_0        
	//    5    7:iaload          
	//    6    8:aload_0         
	//    7    9:getfield        #39  <Field int _seed>
	//    8   12:ixor            
	//    9   13:istore_3        
			j = j + (j >>> 9) + ai[1];
	//   10   14:iload_3         
	//   11   15:iload_3         
	//   12   16:bipush          9
	//   13   18:iushr           
	//   14   19:iadd            
	//   15   20:aload_1         
	//   16   21:iconst_1        
	//   17   22:iaload          
	//   18   23:iadd            
	//   19   24:istore_3        
			j = (j + (j >>> 15)) * 33 ^ ai[2];
	//   20   25:iload_3         
	//   21   26:iload_3         
	//   22   27:bipush          15
	//   23   29:iushr           
	//   24   30:iadd            
	//   25   31:bipush          33
	//   26   33:imul            
	//   27   34:aload_1         
	//   28   35:iconst_2        
	//   29   36:iaload          
	//   30   37:ixor            
	//   31   38:istore_3        
			int l = j + (j >>> 4);
	//   32   39:iload_3         
	//   33   40:iload_3         
	//   34   41:iconst_4        
	//   35   42:iushr           
	//   36   43:iadd            
	//   37   44:istore          4
			for(int k = 3; k < i; k++)
	//*  38   46:iconst_3        
	//*  39   47:istore_3        
	//*  40   48:iload_3         
	//*  41   49:iload_2         
	//*  42   50:icmpge          78
			{
				int i1 = ai[k];
	//   43   53:aload_1         
	//   44   54:iload_3         
	//   45   55:iaload          
	//   46   56:istore          5
				l += i1 ^ i1 >> 21;
	//   47   58:iload           4
	//   48   60:iload           5
	//   49   62:iload           5
	//   50   64:bipush          21
	//   51   66:ishr            
	//   52   67:ixor            
	//   53   68:iadd            
	//   54   69:istore          4
			}

	//   55   71:iload_3         
	//   56   72:iconst_1        
	//   57   73:iadd            
	//   58   74:istore_3        
	//*  59   75:goto            48
			i = l * 0x1003f;
	//   60   78:iload           4
	//   61   80:ldc2            #271 <Int 0x1003f>
	//   62   83:imul            
	//   63   84:istore_2        
			i += i >>> 19;
	//   64   85:iload_2         
	//   65   86:iload_2         
	//   66   87:bipush          19
	//   67   89:iushr           
	//   68   90:iadd            
	//   69   91:istore_2        
			return i << 5 ^ i;
	//   70   92:iload_2         
	//   71   93:iconst_5        
	//   72   94:ishl            
	//   73   95:iload_2         
	//   74   96:ixor            
	//   75   97:ireturn         
		} else
		{
			throw new IllegalArgumentException();
	//   76   98:new             #273 <Class IllegalArgumentException>
	//   77  101:dup             
	//   78  102:invokespecial   #274 <Method void IllegalArgumentException()>
	//   79  105:athrow          
		}
	}

	public String findName(int i)
	{
		int j = _calcOffset(calcHash(i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:iload_1         
	//    3    3:invokevirtual   #270 <Method int calcHash(int)>
	//    4    6:invokespecial   #128 <Method int _calcOffset(int)>
	//    5    9:istore_2        
		int ai[] = _hashArea;
	//    6   10:aload_0         
	//    7   11:getfield        #80  <Field int[] _hashArea>
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
	//   24   37:getfield        #85  <Field String[] _names>
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
	//   35   52:getfield        #68  <Field int _secondaryStart>
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
	//   58   85:getfield        #85  <Field String[] _names>
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
	//   71  103:invokespecial   #278 <Method String _findSecondary(int, int)>
	//   72  106:areturn         
	}

	public String findName(int i, int j)
	{
		int k = _calcOffset(calcHash(i, j));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:iload_1         
	//    3    3:iload_2         
	//    4    4:invokevirtual   #268 <Method int calcHash(int, int)>
	//    5    7:invokespecial   #128 <Method int _calcOffset(int)>
	//    6   10:istore_3        
		int ai[] = _hashArea;
	//    7   11:aload_0         
	//    8   12:getfield        #80  <Field int[] _hashArea>
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
	//   32   50:getfield        #85  <Field String[] _names>
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
	//   43   66:getfield        #68  <Field int _secondaryStart>
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
	//   73  113:getfield        #85  <Field String[] _names>
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
	//   87  133:invokespecial   #280 <Method String _findSecondary(int, int, int)>
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
	//    5    5:invokevirtual   #266 <Method int calcHash(int, int, int)>
	//    6    8:invokespecial   #128 <Method int _calcOffset(int)>
	//    7   11:istore          4
		int ai[] = _hashArea;
	//    8   13:aload_0         
	//    9   14:getfield        #80  <Field int[] _hashArea>
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
	//   40   66:getfield        #85  <Field String[] _names>
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
	//   51   83:getfield        #68  <Field int _secondaryStart>
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
	//   88  142:getfield        #85  <Field String[] _names>
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
	//  103  164:invokespecial   #282 <Method String _findSecondary(int, int, int, int)>
	//  104  167:areturn         
	}

	public String findName(int ai[], int i)
	{
		if(i < 4)
	//*   0    0:iload_2         
	//*   1    1:iconst_4        
	//*   2    2:icmpge          69
			switch(i)
	//*   3    5:iload_2         
			{
	//*   4    6:tableswitch     1 3: default 32
	//	               1 61
	//	               2 50
	//	               3 36
			default:
				return "";
	//    5   32:ldc2            #285 <String "">
	//    6   35:areturn         

			case 3: // '\003'
				return findName(ai[0], ai[1], ai[2]);
	//    7   36:aload_0         
	//    8   37:aload_1         
	//    9   38:iconst_0        
	//   10   39:iaload          
	//   11   40:aload_1         
	//   12   41:iconst_1        
	//   13   42:iaload          
	//   14   43:aload_1         
	//   15   44:iconst_2        
	//   16   45:iaload          
	//   17   46:invokevirtual   #287 <Method String findName(int, int, int)>
	//   18   49:areturn         

			case 2: // '\002'
				return findName(ai[0], ai[1]);
	//   19   50:aload_0         
	//   20   51:aload_1         
	//   21   52:iconst_0        
	//   22   53:iaload          
	//   23   54:aload_1         
	//   24   55:iconst_1        
	//   25   56:iaload          
	//   26   57:invokevirtual   #289 <Method String findName(int, int)>
	//   27   60:areturn         

			case 1: // '\001'
				return findName(ai[0]);
	//   28   61:aload_0         
	//   29   62:aload_1         
	//   30   63:iconst_0        
	//   31   64:iaload          
	//   32   65:invokevirtual   #291 <Method String findName(int)>
	//   33   68:areturn         
			}
		int j = calcHash(ai, i);
	//   34   69:aload_0         
	//   35   70:aload_1         
	//   36   71:iload_2         
	//   37   72:invokevirtual   #259 <Method int calcHash(int[], int)>
	//   38   75:istore_3        
		int k = _calcOffset(j);
	//   39   76:aload_0         
	//   40   77:iload_3         
	//   41   78:invokespecial   #128 <Method int _calcOffset(int)>
	//   42   81:istore          4
		int ai1[] = _hashArea;
	//   43   83:aload_0         
	//   44   84:getfield        #80  <Field int[] _hashArea>
	//   45   87:astore          7
		int l = ai1[k + 3];
	//   46   89:aload           7
	//   47   91:iload           4
	//   48   93:iconst_3        
	//   49   94:iadd            
	//   50   95:iaload          
	//   51   96:istore          5
		if(j == ai1[k] && l == i && _verifyLongName(ai, i, ai1[k + 1]))
	//*  52   98:iload_3         
	//*  53   99:aload           7
	//*  54  101:iload           4
	//*  55  103:iaload          
	//*  56  104:icmpne          139
	//*  57  107:iload           5
	//*  58  109:iload_2         
	//*  59  110:icmpne          139
	//*  60  113:aload_0         
	//*  61  114:aload_1         
	//*  62  115:iload_2         
	//*  63  116:aload           7
	//*  64  118:iload           4
	//*  65  120:iconst_1        
	//*  66  121:iadd            
	//*  67  122:iaload          
	//*  68  123:invokespecial   #144 <Method boolean _verifyLongName(int[], int, int)>
	//*  69  126:ifeq            139
			return _names[k >> 2];
	//   70  129:aload_0         
	//   71  130:getfield        #85  <Field String[] _names>
	//   72  133:iload           4
	//   73  135:iconst_2        
	//   74  136:ishr            
	//   75  137:aaload          
	//   76  138:areturn         
		if(l == 0)
	//*  77  139:iload           5
	//*  78  141:ifne            146
			return null;
	//   79  144:aconst_null     
	//   80  145:areturn         
		l = _secondaryStart + ((k >> 3) << 2);
	//   81  146:aload_0         
	//   82  147:getfield        #68  <Field int _secondaryStart>
	//   83  150:iload           4
	//   84  152:iconst_3        
	//   85  153:ishr            
	//   86  154:iconst_2        
	//   87  155:ishl            
	//   88  156:iadd            
	//   89  157:istore          5
		int i1 = ai1[l + 3];
	//   90  159:aload           7
	//   91  161:iload           5
	//   92  163:iconst_3        
	//   93  164:iadd            
	//   94  165:iaload          
	//   95  166:istore          6
		if(j == ai1[l] && i1 == i && _verifyLongName(ai, i, ai1[l + 1]))
	//*  96  168:iload_3         
	//*  97  169:aload           7
	//*  98  171:iload           5
	//*  99  173:iaload          
	//* 100  174:icmpne          209
	//* 101  177:iload           6
	//* 102  179:iload_2         
	//* 103  180:icmpne          209
	//* 104  183:aload_0         
	//* 105  184:aload_1         
	//* 106  185:iload_2         
	//* 107  186:aload           7
	//* 108  188:iload           5
	//* 109  190:iconst_1        
	//* 110  191:iadd            
	//* 111  192:iaload          
	//* 112  193:invokespecial   #144 <Method boolean _verifyLongName(int[], int, int)>
	//* 113  196:ifeq            209
			return _names[l >> 2];
	//  114  199:aload_0         
	//  115  200:getfield        #85  <Field String[] _names>
	//  116  203:iload           5
	//  117  205:iconst_2        
	//  118  206:ishr            
	//  119  207:aaload          
	//  120  208:areturn         
		else
			return _findSecondary(k, j, ai, i);
	//  121  209:aload_0         
	//  122  210:iload           4
	//  123  212:iload_3         
	//  124  213:aload_1         
	//  125  214:iload_2         
	//  126  215:invokespecial   #293 <Method String _findSecondary(int, int, int[], int)>
	//  127  218:areturn         
	}

	public ByteQuadsCanonicalizer makeChild(int i)
	{
		return new ByteQuadsCanonicalizer(this, com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES.enabledIn(i), _seed, com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW.enabledIn(i), (TableInfo)_tableInfo.get());
	//    0    0:new             #2   <Class ByteQuadsCanonicalizer>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getstatic       #300 <Field com.fasterxml.jackson.core.JsonFactory$Feature com.fasterxml.jackson.core.JsonFactory$Feature.INTERN_FIELD_NAMES>
	//    4    8:iload_1         
	//    5    9:invokevirtual   #304 <Method boolean com.fasterxml.jackson.core.JsonFactory$Feature.enabledIn(int)>
	//    6   12:aload_0         
	//    7   13:getfield        #39  <Field int _seed>
	//    8   16:getstatic       #307 <Field com.fasterxml.jackson.core.JsonFactory$Feature com.fasterxml.jackson.core.JsonFactory$Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW>
	//    9   19:iload_1         
	//   10   20:invokevirtual   #304 <Method boolean com.fasterxml.jackson.core.JsonFactory$Feature.enabledIn(int)>
	//   11   23:aload_0         
	//   12   24:getfield        #54  <Field AtomicReference _tableInfo>
	//   13   27:invokevirtual   #187 <Method Object AtomicReference.get()>
	//   14   30:checkcast       #6   <Class ByteQuadsCanonicalizer$TableInfo>
	//   15   33:invokespecial   #309 <Method void ByteQuadsCanonicalizer(ByteQuadsCanonicalizer, boolean, int, boolean, ByteQuadsCanonicalizer$TableInfo)>
	//   16   36:areturn         
	}

	public boolean maybeDirty()
	{
		return _hashShared ^ true;
	//    0    0:aload_0         
	//    1    1:getfield        #99  <Field boolean _hashShared>
	//    2    4:iconst_1        
	//    3    5:ixor            
	//    4    6:ireturn         
	}

	public int primaryCount()
	{
		int l = _secondaryStart;
	//    0    0:aload_0         
	//    1    1:getfield        #68  <Field int _secondaryStart>
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
	//*  13   19:getfield        #80  <Field int[] _hashArea>
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
	//*   1    1:getfield        #37  <Field ByteQuadsCanonicalizer _parent>
	//*   2    4:ifnull          34
	//*   3    7:aload_0         
	//*   4    8:invokevirtual   #315 <Method boolean maybeDirty()>
	//*   5   11:ifeq            34
		{
			_parent.mergeChild(new TableInfo(this));
	//    6   14:aload_0         
	//    7   15:getfield        #37  <Field ByteQuadsCanonicalizer _parent>
	//    8   18:new             #6   <Class ByteQuadsCanonicalizer$TableInfo>
	//    9   21:dup             
	//   10   22:aload_0         
	//   11   23:invokespecial   #318 <Method void ByteQuadsCanonicalizer$TableInfo(ByteQuadsCanonicalizer)>
	//   12   26:invokespecial   #320 <Method void mergeChild(ByteQuadsCanonicalizer$TableInfo)>
			_hashShared = true;
	//   13   29:aload_0         
	//   14   30:iconst_1        
	//   15   31:putfield        #99  <Field boolean _hashShared>
		}
	//   16   34:return          
	}

	public int secondaryCount()
	{
		int i = _secondaryStart + 3;
	//    0    0:aload_0         
	//    1    1:getfield        #68  <Field int _secondaryStart>
	//    2    4:iconst_3        
	//    3    5:iadd            
	//    4    6:istore_1        
		int l = _tertiaryStart;
	//    5    7:aload_0         
	//    6    8:getfield        #70  <Field int _tertiaryStart>
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
	//*  16   24:getfield        #80  <Field int[] _hashArea>
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

	public int spilloverCount()
	{
		return _spilloverEnd - _spilloverStart() >> 2;
	//    0    0:aload_0         
	//    1    1:getfield        #90  <Field int _spilloverEnd>
	//    2    4:aload_0         
	//    3    5:invokespecial   #137 <Method int _spilloverStart()>
	//    4    8:isub            
	//    5    9:iconst_2        
	//    6   10:ishr            
	//    7   11:ireturn         
	}

	public int tertiaryCount()
	{
		int l = _tertiaryStart + 3;
	//    0    0:aload_0         
	//    1    1:getfield        #70  <Field int _tertiaryStart>
	//    2    4:iconst_3        
	//    3    5:iadd            
	//    4    6:istore          4
		int i1 = _hashSize;
	//    5    8:aload_0         
	//    6    9:getfield        #66  <Field int _hashSize>
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
	//*  20   31:getfield        #80  <Field int[] _hashArea>
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
	//    1    1:invokevirtual   #325 <Method int primaryCount()>
	//    2    4:istore_1        
		int j = secondaryCount();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #327 <Method int secondaryCount()>
	//    5    9:istore_2        
		int k = tertiaryCount();
	//    6   10:aload_0         
	//    7   11:invokevirtual   #329 <Method int tertiaryCount()>
	//    8   14:istore_3        
		int l = spilloverCount();
	//    9   15:aload_0         
	//   10   16:invokevirtual   #331 <Method int spilloverCount()>
	//   11   19:istore          4
		int i1 = totalCount();
	//   12   21:aload_0         
	//   13   22:invokevirtual   #334 <Method int totalCount()>
	//   14   25:istore          5
		return String.format("[%s: size=%d, hashSize=%d, %d/%d/%d/%d pri/sec/ter/spill (=%s), total:%d]", new Object[] {
			((Object)this).getClass().getName(), Integer.valueOf(_count), Integer.valueOf(_hashSize), Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(k), Integer.valueOf(l), Integer.valueOf(i + j + k + l), Integer.valueOf(i1)
		});
	//   15   27:ldc2            #336 <String "[%s: size=%d, hashSize=%d, %d/%d/%d/%d pri/sec/ter/spill (=%s), total:%d]">
	//   16   30:bipush          9
	//   17   32:anewarray       Object[]
	//   18   35:dup             
	//   19   36:iconst_0        
	//   20   37:aload_0         
	//   21   38:invokevirtual   #340 <Method Class Object.getClass()>
	//   22   41:invokevirtual   #345 <Method String Class.getName()>
	//   23   44:aastore         
	//   24   45:dup             
	//   25   46:iconst_1        
	//   26   47:aload_0         
	//   27   48:getfield        #61  <Field int _count>
	//   28   51:invokestatic    #351 <Method Integer Integer.valueOf(int)>
	//   29   54:aastore         
	//   30   55:dup             
	//   31   56:iconst_2        
	//   32   57:aload_0         
	//   33   58:getfield        #66  <Field int _hashSize>
	//   34   61:invokestatic    #351 <Method Integer Integer.valueOf(int)>
	//   35   64:aastore         
	//   36   65:dup             
	//   37   66:iconst_3        
	//   38   67:iload_1         
	//   39   68:invokestatic    #351 <Method Integer Integer.valueOf(int)>
	//   40   71:aastore         
	//   41   72:dup             
	//   42   73:iconst_4        
	//   43   74:iload_2         
	//   44   75:invokestatic    #351 <Method Integer Integer.valueOf(int)>
	//   45   78:aastore         
	//   46   79:dup             
	//   47   80:iconst_5        
	//   48   81:iload_3         
	//   49   82:invokestatic    #351 <Method Integer Integer.valueOf(int)>
	//   50   85:aastore         
	//   51   86:dup             
	//   52   87:bipush          6
	//   53   89:iload           4
	//   54   91:invokestatic    #351 <Method Integer Integer.valueOf(int)>
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
	//   65  106:invokestatic    #351 <Method Integer Integer.valueOf(int)>
	//   66  109:aastore         
	//   67  110:dup             
	//   68  111:bipush          8
	//   69  113:iload           5
	//   70  115:invokestatic    #351 <Method Integer Integer.valueOf(int)>
	//   71  118:aastore         
	//   72  119:invokestatic    #355 <Method String String.format(String, Object[])>
	//   73  122:areturn         
	}

	public int totalCount()
	{
		int l = _hashSize;
	//    0    0:aload_0         
	//    1    1:getfield        #66  <Field int _hashSize>
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
	//*  15   21:getfield        #80  <Field int[] _hashArea>
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
	//    1    1:getfield        #66  <Field int _hashSize>
	//    2    4:ireturn         
	}

*/


/*
	static int access$100(ByteQuadsCanonicalizer bytequadscanonicalizer)
	{
		return bytequadscanonicalizer._count;
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field int _count>
	//    2    4:ireturn         
	}

*/


/*
	static int access$200(ByteQuadsCanonicalizer bytequadscanonicalizer)
	{
		return bytequadscanonicalizer._tertiaryShift;
	//    0    0:aload_0         
	//    1    1:getfield        #75  <Field int _tertiaryShift>
	//    2    4:ireturn         
	}

*/


/*
	static int[] access$300(ByteQuadsCanonicalizer bytequadscanonicalizer)
	{
		return bytequadscanonicalizer._hashArea;
	//    0    0:aload_0         
	//    1    1:getfield        #80  <Field int[] _hashArea>
	//    2    4:areturn         
	}

*/


/*
	static String[] access$400(ByteQuadsCanonicalizer bytequadscanonicalizer)
	{
		return bytequadscanonicalizer._names;
	//    0    0:aload_0         
	//    1    1:getfield        #85  <Field String[] _names>
	//    2    4:areturn         
	}

*/


/*
	static int access$500(ByteQuadsCanonicalizer bytequadscanonicalizer)
	{
		return bytequadscanonicalizer._spilloverEnd;
	//    0    0:aload_0         
	//    1    1:getfield        #90  <Field int _spilloverEnd>
	//    2    4:ireturn         
	}

*/


/*
	static int access$600(ByteQuadsCanonicalizer bytequadscanonicalizer)
	{
		return bytequadscanonicalizer._longNameOffset;
	//    0    0:aload_0         
	//    1    1:getfield        #95  <Field int _longNameOffset>
	//    2    4:ireturn         
	}

*/
}
