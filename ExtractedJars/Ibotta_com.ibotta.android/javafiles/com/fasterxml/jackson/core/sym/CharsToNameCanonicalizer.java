// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.core.sym;

import com.fasterxml.jackson.core.util.InternCache;
import java.util.Arrays;
import java.util.BitSet;
import java.util.concurrent.atomic.AtomicReference;

public final class CharsToNameCanonicalizer
{
	static final class Bucket
	{

		public String has(char ac[], int i, int j)
		{
			if(symbol.length() != j)
		//*   0    0:aload_0         
		//*   1    1:getfield        #20  <Field String symbol>
		//*   2    4:invokevirtual   #32  <Method int String.length()>
		//*   3    7:iload_3         
		//*   4    8:icmpeq          13
				return null;
		//    5   11:aconst_null     
		//    6   12:areturn         
			int k = 0;
		//    7   13:iconst_0        
		//    8   14:istore          4
			int l;
			do
			{
				if(symbol.charAt(k) != ac[i + k])
		//*   9   16:aload_0         
		//*  10   17:getfield        #20  <Field String symbol>
		//*  11   20:iload           4
		//*  12   22:invokevirtual   #36  <Method char String.charAt(int)>
		//*  13   25:aload_1         
		//*  14   26:iload_2         
		//*  15   27:iload           4
		//*  16   29:iadd            
		//*  17   30:caload          
		//*  18   31:icmpeq          36
					return null;
		//   19   34:aconst_null     
		//   20   35:areturn         
				l = k + 1;
		//   21   36:iload           4
		//   22   38:iconst_1        
		//   23   39:iadd            
		//   24   40:istore          5
				k = l;
		//   25   42:iload           5
		//   26   44:istore          4
			} while(l < j);
		//   27   46:iload           5
		//   28   48:iload_3         
		//   29   49:icmplt          16
			return symbol;
		//   30   52:aload_0         
		//   31   53:getfield        #20  <Field String symbol>
		//   32   56:areturn         
		}

		public final int length;
		public final Bucket next;
		public final String symbol;

		public Bucket(String s, Bucket bucket)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #18  <Method void Object()>
			symbol = s;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #20  <Field String symbol>
			next = bucket;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #22  <Field CharsToNameCanonicalizer$Bucket next>
			int i = 1;
		//    8   14:iconst_1        
		//    9   15:istore_3        
			if(bucket != null)
		//*  10   16:aload_2         
		//*  11   17:ifnonnull       23
		//*  12   20:goto            30
				i = 1 + bucket.length;
		//   13   23:iconst_1        
		//   14   24:aload_2         
		//   15   25:getfield        #24  <Field int length>
		//   16   28:iadd            
		//   17   29:istore_3        
			length = i;
		//   18   30:aload_0         
		//   19   31:iload_3         
		//   20   32:putfield        #24  <Field int length>
		//   21   35:return          
		}
	}

	private static final class TableInfo
	{

		public static TableInfo createInitial(int i)
		{
			return new TableInfo(0, 0, new String[i], new Bucket[i >> 1]);
		//    0    0:new             #2   <Class CharsToNameCanonicalizer$TableInfo>
		//    1    3:dup             
		//    2    4:iconst_0        
		//    3    5:iconst_0        
		//    4    6:iload_0         
		//    5    7:anewarray       String[]
		//    6   10:iload_0         
		//    7   11:iconst_1        
		//    8   12:ishr            
		//    9   13:anewarray       Bucket[]
		//   10   16:invokespecial   #52  <Method void CharsToNameCanonicalizer$TableInfo(int, int, String[], CharsToNameCanonicalizer$Bucket[])>
		//   11   19:areturn         
		}

		final Bucket buckets[];
		final int longestCollisionList;
		final int size;
		final String symbols[];

		public TableInfo(int i, int j, String as[], Bucket abucket[])
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #19  <Method void Object()>
			size = i;
		//    2    4:aload_0         
		//    3    5:iload_1         
		//    4    6:putfield        #21  <Field int size>
			longestCollisionList = j;
		//    5    9:aload_0         
		//    6   10:iload_2         
		//    7   11:putfield        #23  <Field int longestCollisionList>
			symbols = as;
		//    8   14:aload_0         
		//    9   15:aload_3         
		//   10   16:putfield        #25  <Field String[] symbols>
			buckets = abucket;
		//   11   19:aload_0         
		//   12   20:aload           4
		//   13   22:putfield        #27  <Field CharsToNameCanonicalizer$Bucket[] buckets>
		//   14   25:return          
		}

		public TableInfo(CharsToNameCanonicalizer charstonamecanonicalizer)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #19  <Method void Object()>
			size = charstonamecanonicalizer._size;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:invokestatic    #33  <Method int CharsToNameCanonicalizer.access$000(CharsToNameCanonicalizer)>
		//    5    9:putfield        #21  <Field int size>
			longestCollisionList = charstonamecanonicalizer._longestCollisionList;
		//    6   12:aload_0         
		//    7   13:aload_1         
		//    8   14:invokestatic    #36  <Method int CharsToNameCanonicalizer.access$100(CharsToNameCanonicalizer)>
		//    9   17:putfield        #23  <Field int longestCollisionList>
			symbols = charstonamecanonicalizer._symbols;
		//   10   20:aload_0         
		//   11   21:aload_1         
		//   12   22:invokestatic    #40  <Method String[] CharsToNameCanonicalizer.access$200(CharsToNameCanonicalizer)>
		//   13   25:putfield        #25  <Field String[] symbols>
			buckets = charstonamecanonicalizer._buckets;
		//   14   28:aload_0         
		//   15   29:aload_1         
		//   16   30:invokestatic    #44  <Method CharsToNameCanonicalizer$Bucket[] CharsToNameCanonicalizer.access$300(CharsToNameCanonicalizer)>
		//   17   33:putfield        #27  <Field CharsToNameCanonicalizer$Bucket[] buckets>
		//   18   36:return          
		}
	}


	private CharsToNameCanonicalizer(int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #36  <Method void Object()>
		_parent = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #38  <Field CharsToNameCanonicalizer _parent>
		_seed = i;
	//    5    9:aload_0         
	//    6   10:iload_1         
	//    7   11:putfield        #40  <Field int _seed>
		_canonicalize = true;
	//    8   14:aload_0         
	//    9   15:iconst_1        
	//   10   16:putfield        #42  <Field boolean _canonicalize>
		_flags = -1;
	//   11   19:aload_0         
	//   12   20:iconst_m1       
	//   13   21:putfield        #44  <Field int _flags>
		_hashShared = false;
	//   14   24:aload_0         
	//   15   25:iconst_0        
	//   16   26:putfield        #46  <Field boolean _hashShared>
		_longestCollisionList = 0;
	//   17   29:aload_0         
	//   18   30:iconst_0        
	//   19   31:putfield        #48  <Field int _longestCollisionList>
		_tableInfo = new AtomicReference(((Object) (TableInfo.createInitial(64))));
	//   20   34:aload_0         
	//   21   35:new             #50  <Class AtomicReference>
	//   22   38:dup             
	//   23   39:bipush          64
	//   24   41:invokestatic    #54  <Method CharsToNameCanonicalizer$TableInfo CharsToNameCanonicalizer$TableInfo.createInitial(int)>
	//   25   44:invokespecial   #57  <Method void AtomicReference(Object)>
	//   26   47:putfield        #59  <Field AtomicReference _tableInfo>
	//   27   50:return          
	}

	private CharsToNameCanonicalizer(CharsToNameCanonicalizer charstonamecanonicalizer, int i, int j, TableInfo tableinfo)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #36  <Method void Object()>
		_parent = charstonamecanonicalizer;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #38  <Field CharsToNameCanonicalizer _parent>
		_seed = j;
	//    5    9:aload_0         
	//    6   10:iload_3         
	//    7   11:putfield        #40  <Field int _seed>
		_tableInfo = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #59  <Field AtomicReference _tableInfo>
		_flags = i;
	//   11   19:aload_0         
	//   12   20:iload_2         
	//   13   21:putfield        #44  <Field int _flags>
		_canonicalize = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES.enabledIn(i);
	//   14   24:aload_0         
	//   15   25:getstatic       #67  <Field com.fasterxml.jackson.core.JsonFactory$Feature com.fasterxml.jackson.core.JsonFactory$Feature.CANONICALIZE_FIELD_NAMES>
	//   16   28:iload_2         
	//   17   29:invokevirtual   #71  <Method boolean com.fasterxml.jackson.core.JsonFactory$Feature.enabledIn(int)>
	//   18   32:putfield        #42  <Field boolean _canonicalize>
		_symbols = tableinfo.symbols;
	//   19   35:aload_0         
	//   20   36:aload           4
	//   21   38:getfield        #74  <Field String[] CharsToNameCanonicalizer$TableInfo.symbols>
	//   22   41:putfield        #76  <Field String[] _symbols>
		_buckets = tableinfo.buckets;
	//   23   44:aload_0         
	//   24   45:aload           4
	//   25   47:getfield        #79  <Field CharsToNameCanonicalizer$Bucket[] CharsToNameCanonicalizer$TableInfo.buckets>
	//   26   50:putfield        #81  <Field CharsToNameCanonicalizer$Bucket[] _buckets>
		_size = tableinfo.size;
	//   27   53:aload_0         
	//   28   54:aload           4
	//   29   56:getfield        #84  <Field int CharsToNameCanonicalizer$TableInfo.size>
	//   30   59:putfield        #86  <Field int _size>
		_longestCollisionList = tableinfo.longestCollisionList;
	//   31   62:aload_0         
	//   32   63:aload           4
	//   33   65:getfield        #89  <Field int CharsToNameCanonicalizer$TableInfo.longestCollisionList>
	//   34   68:putfield        #48  <Field int _longestCollisionList>
		i = _symbols.length;
	//   35   71:aload_0         
	//   36   72:getfield        #76  <Field String[] _symbols>
	//   37   75:arraylength     
	//   38   76:istore_2        
		_sizeThreshold = _thresholdSize(i);
	//   39   77:aload_0         
	//   40   78:iload_2         
	//   41   79:invokestatic    #93  <Method int _thresholdSize(int)>
	//   42   82:putfield        #95  <Field int _sizeThreshold>
		_indexMask = i - 1;
	//   43   85:aload_0         
	//   44   86:iload_2         
	//   45   87:iconst_1        
	//   46   88:isub            
	//   47   89:putfield        #97  <Field int _indexMask>
		_hashShared = true;
	//   48   92:aload_0         
	//   49   93:iconst_1        
	//   50   94:putfield        #46  <Field boolean _hashShared>
	//   51   97:return          
	}

	private String _addSymbol(char ac[], int i, int j, int k, int l)
	{
		if(_hashShared)
	//*   0    0:aload_0         
	//*   1    1:getfield        #46  <Field boolean _hashShared>
	//*   2    4:ifeq            19
		{
			copyArrays();
	//    3    7:aload_0         
	//    4    8:invokespecial   #102 <Method void copyArrays()>
			_hashShared = false;
	//    5   11:aload_0         
	//    6   12:iconst_0        
	//    7   13:putfield        #46  <Field boolean _hashShared>
		} else
	//*   8   16:goto            47
		if(_size >= _sizeThreshold)
	//*   9   19:aload_0         
	//*  10   20:getfield        #86  <Field int _size>
	//*  11   23:aload_0         
	//*  12   24:getfield        #95  <Field int _sizeThreshold>
	//*  13   27:icmplt          47
		{
			rehash();
	//   14   30:aload_0         
	//   15   31:invokespecial   #105 <Method void rehash()>
			l = _hashToIndex(calcHash(ac, i, j));
	//   16   34:aload_0         
	//   17   35:aload_0         
	//   18   36:aload_1         
	//   19   37:iload_2         
	//   20   38:iload_3         
	//   21   39:invokevirtual   #109 <Method int calcHash(char[], int, int)>
	//   22   42:invokevirtual   #112 <Method int _hashToIndex(int)>
	//   23   45:istore          5
		}
		Object obj = ((Object) (new String(ac, i, j)));
	//   24   47:new             #114 <Class String>
	//   25   50:dup             
	//   26   51:aload_1         
	//   27   52:iload_2         
	//   28   53:iload_3         
	//   29   54:invokespecial   #117 <Method void String(char[], int, int)>
	//   30   57:astore          6
		ac = ((char []) (obj));
	//   31   59:aload           6
	//   32   61:astore_1        
		if(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES.enabledIn(_flags))
	//*  33   62:getstatic       #120 <Field com.fasterxml.jackson.core.JsonFactory$Feature com.fasterxml.jackson.core.JsonFactory$Feature.INTERN_FIELD_NAMES>
	//*  34   65:aload_0         
	//*  35   66:getfield        #44  <Field int _flags>
	//*  36   69:invokevirtual   #71  <Method boolean com.fasterxml.jackson.core.JsonFactory$Feature.enabledIn(int)>
	//*  37   72:ifeq            84
			ac = ((char []) (InternCache.instance.intern(((String) (obj)))));
	//   38   75:getstatic       #126 <Field InternCache InternCache.instance>
	//   39   78:aload           6
	//   40   80:invokevirtual   #130 <Method String InternCache.intern(String)>
	//   41   83:astore_1        
		_size = _size + 1;
	//   42   84:aload_0         
	//   43   85:aload_0         
	//   44   86:getfield        #86  <Field int _size>
	//   45   89:iconst_1        
	//   46   90:iadd            
	//   47   91:putfield        #86  <Field int _size>
		String as[] = _symbols;
	//   48   94:aload_0         
	//   49   95:getfield        #76  <Field String[] _symbols>
	//   50   98:astore          6
		if(as[l] == null)
	//*  51  100:aload           6
	//*  52  102:iload           5
	//*  53  104:aaload          
	//*  54  105:ifnonnull       116
		{
			as[l] = ((String) (ac));
	//   55  108:aload           6
	//   56  110:iload           5
	//   57  112:aload_1         
	//   58  113:aastore         
			return ((String) (ac));
	//   59  114:aload_1         
	//   60  115:areturn         
		}
		i = l >> 1;
	//   61  116:iload           5
	//   62  118:iconst_1        
	//   63  119:ishr            
	//   64  120:istore_2        
		as = ((String []) (new Bucket(((String) (ac)), _buckets[i])));
	//   65  121:new             #6   <Class CharsToNameCanonicalizer$Bucket>
	//   66  124:dup             
	//   67  125:aload_1         
	//   68  126:aload_0         
	//   69  127:getfield        #81  <Field CharsToNameCanonicalizer$Bucket[] _buckets>
	//   70  130:iload_2         
	//   71  131:aaload          
	//   72  132:invokespecial   #133 <Method void CharsToNameCanonicalizer$Bucket(String, CharsToNameCanonicalizer$Bucket)>
	//   73  135:astore          6
		j = ((Bucket) (as)).length;
	//   74  137:aload           6
	//   75  139:getfield        #136 <Field int CharsToNameCanonicalizer$Bucket.length>
	//   76  142:istore_3        
		if(j > 100)
	//*  77  143:iload_3         
	//*  78  144:bipush          100
	//*  79  146:icmple          158
		{
			_handleSpillOverflow(i, ((Bucket) (as)));
	//   80  149:aload_0         
	//   81  150:iload_2         
	//   82  151:aload           6
	//   83  153:invokespecial   #140 <Method void _handleSpillOverflow(int, CharsToNameCanonicalizer$Bucket)>
			return ((String) (ac));
	//   84  156:aload_1         
	//   85  157:areturn         
		} else
		{
			_buckets[i] = ((Bucket) (as));
	//   86  158:aload_0         
	//   87  159:getfield        #81  <Field CharsToNameCanonicalizer$Bucket[] _buckets>
	//   88  162:iload_2         
	//   89  163:aload           6
	//   90  165:aastore         
			_longestCollisionList = Math.max(j, _longestCollisionList);
	//   91  166:aload_0         
	//   92  167:iload_3         
	//   93  168:aload_0         
	//   94  169:getfield        #48  <Field int _longestCollisionList>
	//   95  172:invokestatic    #146 <Method int Math.max(int, int)>
	//   96  175:putfield        #48  <Field int _longestCollisionList>
			return ((String) (ac));
	//   97  178:aload_1         
	//   98  179:areturn         
		}
	}

	private String _findSymbol2(char ac[], int i, int j, Bucket bucket)
	{
		for(; bucket != null; bucket = bucket.next)
	//*   0    0:aload           4
	//*   1    2:ifnull          33
		{
			String s = bucket.has(ac, i, j);
	//    2    5:aload           4
	//    3    7:aload_1         
	//    4    8:iload_2         
	//    5    9:iload_3         
	//    6   10:invokevirtual   #152 <Method String CharsToNameCanonicalizer$Bucket.has(char[], int, int)>
	//    7   13:astore          5
			if(s != null)
	//*   8   15:aload           5
	//*   9   17:ifnull          23
				return s;
	//   10   20:aload           5
	//   11   22:areturn         
		}

	//   12   23:aload           4
	//   13   25:getfield        #156 <Field CharsToNameCanonicalizer$Bucket CharsToNameCanonicalizer$Bucket.next>
	//   14   28:astore          4
	//*  15   30:goto            0
		return null;
	//   16   33:aconst_null     
	//   17   34:areturn         
	}

	private void _handleSpillOverflow(int i, Bucket bucket)
	{
		BitSet bitset = _overflows;
	//    0    0:aload_0         
	//    1    1:getfield        #158 <Field BitSet _overflows>
	//    2    4:astore_3        
		if(bitset == null)
	//*   3    5:aload_3         
	//*   4    6:ifnonnull       31
		{
			_overflows = new BitSet();
	//    5    9:aload_0         
	//    6   10:new             #160 <Class BitSet>
	//    7   13:dup             
	//    8   14:invokespecial   #161 <Method void BitSet()>
	//    9   17:putfield        #158 <Field BitSet _overflows>
			_overflows.set(i);
	//   10   20:aload_0         
	//   11   21:getfield        #158 <Field BitSet _overflows>
	//   12   24:iload_1         
	//   13   25:invokevirtual   #164 <Method void BitSet.set(int)>
		} else
	//*  14   28:goto            74
		if(bitset.get(i))
	//*  15   31:aload_3         
	//*  16   32:iload_1         
	//*  17   33:invokevirtual   #167 <Method boolean BitSet.get(int)>
	//*  18   36:ifeq            66
		{
			if(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW.enabledIn(_flags))
	//*  19   39:getstatic       #170 <Field com.fasterxml.jackson.core.JsonFactory$Feature com.fasterxml.jackson.core.JsonFactory$Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW>
	//*  20   42:aload_0         
	//*  21   43:getfield        #44  <Field int _flags>
	//*  22   46:invokevirtual   #71  <Method boolean com.fasterxml.jackson.core.JsonFactory$Feature.enabledIn(int)>
	//*  23   49:ifeq            58
				reportTooManyCollisions(100);
	//   24   52:aload_0         
	//   25   53:bipush          100
	//   26   55:invokevirtual   #173 <Method void reportTooManyCollisions(int)>
			_canonicalize = false;
	//   27   58:aload_0         
	//   28   59:iconst_0        
	//   29   60:putfield        #42  <Field boolean _canonicalize>
		} else
	//*  30   63:goto            74
		{
			_overflows.set(i);
	//   31   66:aload_0         
	//   32   67:getfield        #158 <Field BitSet _overflows>
	//   33   70:iload_1         
	//   34   71:invokevirtual   #164 <Method void BitSet.set(int)>
		}
		_symbols[i + i] = bucket.symbol;
	//   35   74:aload_0         
	//   36   75:getfield        #76  <Field String[] _symbols>
	//   37   78:iload_1         
	//   38   79:iload_1         
	//   39   80:iadd            
	//   40   81:aload_2         
	//   41   82:getfield        #177 <Field String CharsToNameCanonicalizer$Bucket.symbol>
	//   42   85:aastore         
		_buckets[i] = null;
	//   43   86:aload_0         
	//   44   87:getfield        #81  <Field CharsToNameCanonicalizer$Bucket[] _buckets>
	//   45   90:iload_1         
	//   46   91:aconst_null     
	//   47   92:aastore         
		_size = _size - bucket.length;
	//   48   93:aload_0         
	//   49   94:aload_0         
	//   50   95:getfield        #86  <Field int _size>
	//   51   98:aload_2         
	//   52   99:getfield        #136 <Field int CharsToNameCanonicalizer$Bucket.length>
	//   53  102:isub            
	//   54  103:putfield        #86  <Field int _size>
		_longestCollisionList = -1;
	//   55  106:aload_0         
	//   56  107:iconst_m1       
	//   57  108:putfield        #48  <Field int _longestCollisionList>
	//   58  111:return          
	}

	private static int _thresholdSize(int i)
	{
		return i - (i >> 2);
	//    0    0:iload_0         
	//    1    1:iload_0         
	//    2    2:iconst_2        
	//    3    3:ishr            
	//    4    4:isub            
	//    5    5:ireturn         
	}

	private void copyArrays()
	{
		Object aobj[] = ((Object []) (_symbols));
	//    0    0:aload_0         
	//    1    1:getfield        #76  <Field String[] _symbols>
	//    2    4:astore_1        
		_symbols = (String[])Arrays.copyOf(aobj, aobj.length);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:aload_1         
	//    6    8:arraylength     
	//    7    9:invokestatic    #190 <Method Object[] Arrays.copyOf(Object[], int)>
	//    8   12:checkcast       #191 <Class String[]>
	//    9   15:putfield        #76  <Field String[] _symbols>
		aobj = ((Object []) (_buckets));
	//   10   18:aload_0         
	//   11   19:getfield        #81  <Field CharsToNameCanonicalizer$Bucket[] _buckets>
	//   12   22:astore_1        
		_buckets = (Bucket[])Arrays.copyOf(aobj, aobj.length);
	//   13   23:aload_0         
	//   14   24:aload_1         
	//   15   25:aload_1         
	//   16   26:arraylength     
	//   17   27:invokestatic    #190 <Method Object[] Arrays.copyOf(Object[], int)>
	//   18   30:checkcast       #192 <Class CharsToNameCanonicalizer$Bucket[]>
	//   19   33:putfield        #81  <Field CharsToNameCanonicalizer$Bucket[] _buckets>
	//   20   36:return          
	}

	public static CharsToNameCanonicalizer createRoot()
	{
		long l = System.currentTimeMillis();
	//    0    0:invokestatic    #200 <Method long System.currentTimeMillis()>
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
	//   11   14:invokestatic    #203 <Method CharsToNameCanonicalizer createRoot(int)>
	//   12   17:areturn         
	}

	protected static CharsToNameCanonicalizer createRoot(int i)
	{
		return new CharsToNameCanonicalizer(i);
	//    0    0:new             #2   <Class CharsToNameCanonicalizer>
	//    1    3:dup             
	//    2    4:iload_0         
	//    3    5:invokespecial   #205 <Method void CharsToNameCanonicalizer(int)>
	//    4    8:areturn         
	}

	private void mergeChild(TableInfo tableinfo)
	{
		int i = tableinfo.size;
	//    0    0:aload_1         
	//    1    1:getfield        #84  <Field int CharsToNameCanonicalizer$TableInfo.size>
	//    2    4:istore_2        
		TableInfo tableinfo1 = (TableInfo)_tableInfo.get();
	//    3    5:aload_0         
	//    4    6:getfield        #59  <Field AtomicReference _tableInfo>
	//    5    9:invokevirtual   #210 <Method Object AtomicReference.get()>
	//    6   12:checkcast       #9   <Class CharsToNameCanonicalizer$TableInfo>
	//    7   15:astore_3        
		if(i == tableinfo1.size)
	//*   8   16:iload_2         
	//*   9   17:aload_3         
	//*  10   18:getfield        #84  <Field int CharsToNameCanonicalizer$TableInfo.size>
	//*  11   21:icmpne          25
			return;
	//   12   24:return          
		if(i > 12000)
	//*  13   25:iload_2         
	//*  14   26:sipush          12000
	//*  15   29:icmple          38
			tableinfo = TableInfo.createInitial(64);
	//   16   32:bipush          64
	//   17   34:invokestatic    #54  <Method CharsToNameCanonicalizer$TableInfo CharsToNameCanonicalizer$TableInfo.createInitial(int)>
	//   18   37:astore_1        
		_tableInfo.compareAndSet(((Object) (tableinfo1)), ((Object) (tableinfo)));
	//   19   38:aload_0         
	//   20   39:getfield        #59  <Field AtomicReference _tableInfo>
	//   21   42:aload_3         
	//   22   43:aload_1         
	//   23   44:invokevirtual   #214 <Method boolean AtomicReference.compareAndSet(Object, Object)>
	//   24   47:pop             
	//   25   48:return          
	}

	private void rehash()
	{
		String as[] = _symbols;
	//    0    0:aload_0         
	//    1    1:getfield        #76  <Field String[] _symbols>
	//    2    4:astore          7
		int l1 = as.length;
	//    3    6:aload           7
	//    4    8:arraylength     
	//    5    9:istore          6
		int i = l1 + l1;
	//    6   11:iload           6
	//    7   13:iload           6
	//    8   15:iadd            
	//    9   16:istore_1        
		if(i > 0x10000)
	//*  10   17:iload_1         
	//*  11   18:ldc1            #215 <Int 0x10000>
	//*  12   20:icmple          63
		{
			_size = 0;
	//   13   23:aload_0         
	//   14   24:iconst_0        
	//   15   25:putfield        #86  <Field int _size>
			_canonicalize = false;
	//   16   28:aload_0         
	//   17   29:iconst_0        
	//   18   30:putfield        #42  <Field boolean _canonicalize>
			_symbols = new String[64];
	//   19   33:aload_0         
	//   20   34:bipush          64
	//   21   36:anewarray       String[]
	//   22   39:putfield        #76  <Field String[] _symbols>
			_buckets = new Bucket[32];
	//   23   42:aload_0         
	//   24   43:bipush          32
	//   25   45:anewarray       Bucket[]
	//   26   48:putfield        #81  <Field CharsToNameCanonicalizer$Bucket[] _buckets>
			_indexMask = 63;
	//   27   51:aload_0         
	//   28   52:bipush          63
	//   29   54:putfield        #97  <Field int _indexMask>
			_hashShared = false;
	//   30   57:aload_0         
	//   31   58:iconst_0        
	//   32   59:putfield        #46  <Field boolean _hashShared>
			return;
	//   33   62:return          
		}
		Bucket abucket[] = _buckets;
	//   34   63:aload_0         
	//   35   64:getfield        #81  <Field CharsToNameCanonicalizer$Bucket[] _buckets>
	//   36   67:astore          8
		_symbols = new String[i];
	//   37   69:aload_0         
	//   38   70:iload_1         
	//   39   71:anewarray       String[]
	//   40   74:putfield        #76  <Field String[] _symbols>
		_buckets = new Bucket[i >> 1];
	//   41   77:aload_0         
	//   42   78:iload_1         
	//   43   79:iconst_1        
	//   44   80:ishr            
	//   45   81:anewarray       Bucket[]
	//   46   84:putfield        #81  <Field CharsToNameCanonicalizer$Bucket[] _buckets>
		_indexMask = i - 1;
	//   47   87:aload_0         
	//   48   88:iload_1         
	//   49   89:iconst_1        
	//   50   90:isub            
	//   51   91:putfield        #97  <Field int _indexMask>
		_sizeThreshold = _thresholdSize(i);
	//   52   94:aload_0         
	//   53   95:iload_1         
	//   54   96:invokestatic    #93  <Method int _thresholdSize(int)>
	//   55   99:putfield        #95  <Field int _sizeThreshold>
		int l = 0;
	//   56  102:iconst_0        
	//   57  103:istore_3        
		int j = 0;
	//   58  104:iconst_0        
	//   59  105:istore_2        
		int i1;
		for(i = 0; l < l1; i = i1)
	//*  60  106:iconst_0        
	//*  61  107:istore_1        
	//*  62  108:iload_3         
	//*  63  109:iload           6
	//*  64  111:icmpge          225
		{
			Object obj = ((Object) (as[l]));
	//   65  114:aload           7
	//   66  116:iload_3         
	//   67  117:aaload          
	//   68  118:astore          9
			int k1 = j;
	//   69  120:iload_2         
	//   70  121:istore          5
			i1 = i;
	//   71  123:iload_1         
	//   72  124:istore          4
			if(obj != null)
	//*  73  126:aload           9
	//*  74  128:ifnull          212
			{
				k1 = j + 1;
	//   75  131:iload_2         
	//   76  132:iconst_1        
	//   77  133:iadd            
	//   78  134:istore          5
				j = _hashToIndex(calcHash(((String) (obj))));
	//   79  136:aload_0         
	//   80  137:aload_0         
	//   81  138:aload           9
	//   82  140:invokevirtual   #218 <Method int calcHash(String)>
	//   83  143:invokevirtual   #112 <Method int _hashToIndex(int)>
	//   84  146:istore_2        
				String as1[] = _symbols;
	//   85  147:aload_0         
	//   86  148:getfield        #76  <Field String[] _symbols>
	//   87  151:astore          10
				if(as1[j] == null)
	//*  88  153:aload           10
	//*  89  155:iload_2         
	//*  90  156:aaload          
	//*  91  157:ifnonnull       172
				{
					as1[j] = ((String) (obj));
	//   92  160:aload           10
	//   93  162:iload_2         
	//   94  163:aload           9
	//   95  165:aastore         
					i1 = i;
	//   96  166:iload_1         
	//   97  167:istore          4
				} else
	//*  98  169:goto            212
				{
					j >>= 1;
	//   99  172:iload_2         
	//  100  173:iconst_1        
	//  101  174:ishr            
	//  102  175:istore_2        
					obj = ((Object) (new Bucket(((String) (obj)), _buckets[j])));
	//  103  176:new             #6   <Class CharsToNameCanonicalizer$Bucket>
	//  104  179:dup             
	//  105  180:aload           9
	//  106  182:aload_0         
	//  107  183:getfield        #81  <Field CharsToNameCanonicalizer$Bucket[] _buckets>
	//  108  186:iload_2         
	//  109  187:aaload          
	//  110  188:invokespecial   #133 <Method void CharsToNameCanonicalizer$Bucket(String, CharsToNameCanonicalizer$Bucket)>
	//  111  191:astore          9
					_buckets[j] = ((Bucket) (obj));
	//  112  193:aload_0         
	//  113  194:getfield        #81  <Field CharsToNameCanonicalizer$Bucket[] _buckets>
	//  114  197:iload_2         
	//  115  198:aload           9
	//  116  200:aastore         
					i1 = Math.max(i, ((Bucket) (obj)).length);
	//  117  201:iload_1         
	//  118  202:aload           9
	//  119  204:getfield        #136 <Field int CharsToNameCanonicalizer$Bucket.length>
	//  120  207:invokestatic    #146 <Method int Math.max(int, int)>
	//  121  210:istore          4
				}
			}
			l++;
	//  122  212:iload_3         
	//  123  213:iconst_1        
	//  124  214:iadd            
	//  125  215:istore_3        
			j = k1;
	//  126  216:iload           5
	//  127  218:istore_2        
		}

	//  128  219:iload           4
	//  129  221:istore_1        
	//* 130  222:goto            108
		boolean flag = false;
	//  131  225:iconst_0        
	//  132  226:istore          5
		int j1 = i;
	//  133  228:iload_1         
	//  134  229:istore          4
		l = j;
	//  135  231:iload_2         
	//  136  232:istore_3        
		for(i = ((int) (flag)); i < l1 >> 1;)
	//* 137  233:iload           5
	//* 138  235:istore_1        
	//* 139  236:iload_1         
	//* 140  237:iload           6
	//* 141  239:iconst_1        
	//* 142  240:ishr            
	//* 143  241:icmpge          368
		{
			Bucket bucket = abucket[i];
	//  144  244:aload           8
	//  145  246:iload_1         
	//  146  247:aaload          
	//  147  248:astore          7
			int k = j1;
	//  148  250:iload           4
	//  149  252:istore_2        
			for(; bucket != null; bucket = bucket.next)
	//* 150  253:aload           7
	//* 151  255:ifnull          358
			{
				l++;
	//  152  258:iload_3         
	//  153  259:iconst_1        
	//  154  260:iadd            
	//  155  261:istore_3        
				Object obj1 = ((Object) (bucket.symbol));
	//  156  262:aload           7
	//  157  264:getfield        #177 <Field String CharsToNameCanonicalizer$Bucket.symbol>
	//  158  267:astore          9
				j1 = _hashToIndex(calcHash(((String) (obj1))));
	//  159  269:aload_0         
	//  160  270:aload_0         
	//  161  271:aload           9
	//  162  273:invokevirtual   #218 <Method int calcHash(String)>
	//  163  276:invokevirtual   #112 <Method int _hashToIndex(int)>
	//  164  279:istore          4
				String as2[] = _symbols;
	//  165  281:aload_0         
	//  166  282:getfield        #76  <Field String[] _symbols>
	//  167  285:astore          10
				if(as2[j1] == null)
	//* 168  287:aload           10
	//* 169  289:iload           4
	//* 170  291:aaload          
	//* 171  292:ifnonnull       305
				{
					as2[j1] = ((String) (obj1));
	//  172  295:aload           10
	//  173  297:iload           4
	//  174  299:aload           9
	//  175  301:aastore         
				} else
	//* 176  302:goto            348
				{
					j1 >>= 1;
	//  177  305:iload           4
	//  178  307:iconst_1        
	//  179  308:ishr            
	//  180  309:istore          4
					obj1 = ((Object) (new Bucket(((String) (obj1)), _buckets[j1])));
	//  181  311:new             #6   <Class CharsToNameCanonicalizer$Bucket>
	//  182  314:dup             
	//  183  315:aload           9
	//  184  317:aload_0         
	//  185  318:getfield        #81  <Field CharsToNameCanonicalizer$Bucket[] _buckets>
	//  186  321:iload           4
	//  187  323:aaload          
	//  188  324:invokespecial   #133 <Method void CharsToNameCanonicalizer$Bucket(String, CharsToNameCanonicalizer$Bucket)>
	//  189  327:astore          9
					_buckets[j1] = ((Bucket) (obj1));
	//  190  329:aload_0         
	//  191  330:getfield        #81  <Field CharsToNameCanonicalizer$Bucket[] _buckets>
	//  192  333:iload           4
	//  193  335:aload           9
	//  194  337:aastore         
					k = Math.max(k, ((Bucket) (obj1)).length);
	//  195  338:iload_2         
	//  196  339:aload           9
	//  197  341:getfield        #136 <Field int CharsToNameCanonicalizer$Bucket.length>
	//  198  344:invokestatic    #146 <Method int Math.max(int, int)>
	//  199  347:istore_2        
				}
			}

	//  200  348:aload           7
	//  201  350:getfield        #156 <Field CharsToNameCanonicalizer$Bucket CharsToNameCanonicalizer$Bucket.next>
	//  202  353:astore          7
	//* 203  355:goto            253
			i++;
	//  204  358:iload_1         
	//  205  359:iconst_1        
	//  206  360:iadd            
	//  207  361:istore_1        
			j1 = k;
	//  208  362:iload_2         
	//  209  363:istore          4
		}

	//* 210  365:goto            236
		_longestCollisionList = j1;
	//  211  368:aload_0         
	//  212  369:iload           4
	//  213  371:putfield        #48  <Field int _longestCollisionList>
		_overflows = null;
	//  214  374:aload_0         
	//  215  375:aconst_null     
	//  216  376:putfield        #158 <Field BitSet _overflows>
		i = _size;
	//  217  379:aload_0         
	//  218  380:getfield        #86  <Field int _size>
	//  219  383:istore_1        
		if(l == i)
	//* 220  384:iload_3         
	//* 221  385:iload_1         
	//* 222  386:icmpne          390
			return;
	//  223  389:return          
		else
			throw new IllegalStateException(String.format("Internal error on SymbolTable.rehash(): had %d entries; now have %d", new Object[] {
				Integer.valueOf(i), Integer.valueOf(l)
			}));
	//  224  390:new             #220 <Class IllegalStateException>
	//  225  393:dup             
	//  226  394:ldc1            #222 <String "Internal error on SymbolTable.rehash(): had %d entries; now have %d">
	//  227  396:iconst_2        
	//  228  397:anewarray       Object[]
	//  229  400:dup             
	//  230  401:iconst_0        
	//  231  402:iload_1         
	//  232  403:invokestatic    #228 <Method Integer Integer.valueOf(int)>
	//  233  406:aastore         
	//  234  407:dup             
	//  235  408:iconst_1        
	//  236  409:iload_3         
	//  237  410:invokestatic    #228 <Method Integer Integer.valueOf(int)>
	//  238  413:aastore         
	//  239  414:invokestatic    #232 <Method String String.format(String, Object[])>
	//  240  417:invokespecial   #235 <Method void IllegalStateException(String)>
	//  241  420:athrow          
	}

	public int _hashToIndex(int i)
	{
		i += i >>> 15;
	//    0    0:iload_1         
	//    1    1:iload_1         
	//    2    2:bipush          15
	//    3    4:iushr           
	//    4    5:iadd            
	//    5    6:istore_1        
		i ^= i << 7;
	//    6    7:iload_1         
	//    7    8:iload_1         
	//    8    9:bipush          7
	//    9   11:ishl            
	//   10   12:ixor            
	//   11   13:istore_1        
		return i + (i >>> 3) & _indexMask;
	//   12   14:iload_1         
	//   13   15:iload_1         
	//   14   16:iconst_3        
	//   15   17:iushr           
	//   16   18:iadd            
	//   17   19:aload_0         
	//   18   20:getfield        #97  <Field int _indexMask>
	//   19   23:iand            
	//   20   24:ireturn         
	}

	public int calcHash(String s)
	{
		int l = s.length();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #238 <Method int String.length()>
	//    2    4:istore          4
		int i = _seed;
	//    3    6:aload_0         
	//    4    7:getfield        #40  <Field int _seed>
	//    5   10:istore_2        
		for(int j = 0; j < l; j++)
	//*   6   11:iconst_0        
	//*   7   12:istore_3        
	//*   8   13:iload_3         
	//*   9   14:iload           4
	//*  10   16:icmpge          37
			i = i * 33 + s.charAt(j);
	//   11   19:iload_2         
	//   12   20:bipush          33
	//   13   22:imul            
	//   14   23:aload_1         
	//   15   24:iload_3         
	//   16   25:invokevirtual   #242 <Method char String.charAt(int)>
	//   17   28:iadd            
	//   18   29:istore_2        

	//   19   30:iload_3         
	//   20   31:iconst_1        
	//   21   32:iadd            
	//   22   33:istore_3        
	//*  23   34:goto            13
		int k = i;
	//   24   37:iload_2         
	//   25   38:istore_3        
		if(i == 0)
	//*  26   39:iload_2         
	//*  27   40:ifne            45
			k = 1;
	//   28   43:iconst_1        
	//   29   44:istore_3        
		return k;
	//   30   45:iload_3         
	//   31   46:ireturn         
	}

	public int calcHash(char ac[], int i, int j)
	{
		int k = _seed;
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field int _seed>
	//    2    4:istore          4
		for(int l = i; l < j + i; l++)
	//*   3    6:iload_2         
	//*   4    7:istore          5
	//*   5    9:iload           5
	//*   6   11:iload_3         
	//*   7   12:iload_2         
	//*   8   13:iadd            
	//*   9   14:icmpge          38
			k = k * 33 + ac[l];
	//   10   17:iload           4
	//   11   19:bipush          33
	//   12   21:imul            
	//   13   22:aload_1         
	//   14   23:iload           5
	//   15   25:caload          
	//   16   26:iadd            
	//   17   27:istore          4

	//   18   29:iload           5
	//   19   31:iconst_1        
	//   20   32:iadd            
	//   21   33:istore          5
	//*  22   35:goto            9
		i = k;
	//   23   38:iload           4
	//   24   40:istore_2        
		if(k == 0)
	//*  25   41:iload           4
	//*  26   43:ifne            48
			i = 1;
	//   27   46:iconst_1        
	//   28   47:istore_2        
		return i;
	//   29   48:iload_2         
	//   30   49:ireturn         
	}

	public String findSymbol(char ac[], int i, int j, int k)
	{
		int j1;
label0:
		{
label1:
			{
				if(j < 1)
	//*   0    0:iload_3         
	//*   1    1:iconst_1        
	//*   2    2:icmpge          8
					return "";
	//    3    5:ldc1            #246 <String "">
	//    4    7:areturn         
				if(!_canonicalize)
	//*   5    8:aload_0         
	//*   6    9:getfield        #42  <Field boolean _canonicalize>
	//*   7   12:ifne            26
					return new String(ac, i, j);
	//    8   15:new             #114 <Class String>
	//    9   18:dup             
	//   10   19:aload_1         
	//   11   20:iload_2         
	//   12   21:iload_3         
	//   13   22:invokespecial   #117 <Method void String(char[], int, int)>
	//   14   25:areturn         
				j1 = _hashToIndex(k);
	//   15   26:aload_0         
	//   16   27:iload           4
	//   17   29:invokevirtual   #112 <Method int _hashToIndex(int)>
	//   18   32:istore          7
				String s = _symbols[j1];
	//   19   34:aload_0         
	//   20   35:getfield        #76  <Field String[] _symbols>
	//   21   38:iload           7
	//   22   40:aaload          
	//   23   41:astore          8
				if(s == null)
					break label0;
	//   24   43:aload           8
	//   25   45:ifnull          151
				if(s.length() != j)
					break label1;
	//   26   48:aload           8
	//   27   50:invokevirtual   #238 <Method int String.length()>
	//   28   53:iload_3         
	//   29   54:icmpne          95
				int l = 0;
	//   30   57:iconst_0        
	//   31   58:istore          5
				int i1;
				do
				{
					if(s.charAt(l) != ac[i + l])
						break label1;
	//   32   60:aload           8
	//   33   62:iload           5
	//   34   64:invokevirtual   #242 <Method char String.charAt(int)>
	//   35   67:aload_1         
	//   36   68:iload_2         
	//   37   69:iload           5
	//   38   71:iadd            
	//   39   72:caload          
	//   40   73:icmpne          95
					i1 = l + 1;
	//   41   76:iload           5
	//   42   78:iconst_1        
	//   43   79:iadd            
	//   44   80:istore          6
					l = i1;
	//   45   82:iload           6
	//   46   84:istore          5
				} while(i1 != j);
	//   47   86:iload           6
	//   48   88:iload_3         
	//   49   89:icmpne          60
				return s;
	//   50   92:aload           8
	//   51   94:areturn         
			}
			Object obj = ((Object) (_buckets[j1 >> 1]));
	//   52   95:aload_0         
	//   53   96:getfield        #81  <Field CharsToNameCanonicalizer$Bucket[] _buckets>
	//   54   99:iload           7
	//   55  101:iconst_1        
	//   56  102:ishr            
	//   57  103:aaload          
	//   58  104:astore          8
			if(obj != null)
	//*  59  106:aload           8
	//*  60  108:ifnull          151
			{
				String s1 = ((Bucket) (obj)).has(ac, i, j);
	//   61  111:aload           8
	//   62  113:aload_1         
	//   63  114:iload_2         
	//   64  115:iload_3         
	//   65  116:invokevirtual   #152 <Method String CharsToNameCanonicalizer$Bucket.has(char[], int, int)>
	//   66  119:astore          9
				if(s1 != null)
	//*  67  121:aload           9
	//*  68  123:ifnull          129
					return s1;
	//   69  126:aload           9
	//   70  128:areturn         
				obj = ((Object) (_findSymbol2(ac, i, j, ((Bucket) (obj)).next)));
	//   71  129:aload_0         
	//   72  130:aload_1         
	//   73  131:iload_2         
	//   74  132:iload_3         
	//   75  133:aload           8
	//   76  135:getfield        #156 <Field CharsToNameCanonicalizer$Bucket CharsToNameCanonicalizer$Bucket.next>
	//   77  138:invokespecial   #248 <Method String _findSymbol2(char[], int, int, CharsToNameCanonicalizer$Bucket)>
	//   78  141:astore          8
				if(obj != null)
	//*  79  143:aload           8
	//*  80  145:ifnull          151
					return ((String) (obj));
	//   81  148:aload           8
	//   82  150:areturn         
			}
		}
		return _addSymbol(ac, i, j, k, j1);
	//   83  151:aload_0         
	//   84  152:aload_1         
	//   85  153:iload_2         
	//   86  154:iload_3         
	//   87  155:iload           4
	//   88  157:iload           7
	//   89  159:invokespecial   #250 <Method String _addSymbol(char[], int, int, int, int)>
	//   90  162:areturn         
	}

	public int hashSeed()
	{
		return _seed;
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field int _seed>
	//    2    4:ireturn         
	}

	public CharsToNameCanonicalizer makeChild(int i)
	{
		return new CharsToNameCanonicalizer(this, i, _seed, (TableInfo)_tableInfo.get());
	//    0    0:new             #2   <Class CharsToNameCanonicalizer>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:aload_0         
	//    5    7:getfield        #40  <Field int _seed>
	//    6   10:aload_0         
	//    7   11:getfield        #59  <Field AtomicReference _tableInfo>
	//    8   14:invokevirtual   #210 <Method Object AtomicReference.get()>
	//    9   17:checkcast       #9   <Class CharsToNameCanonicalizer$TableInfo>
	//   10   20:invokespecial   #254 <Method void CharsToNameCanonicalizer(CharsToNameCanonicalizer, int, int, CharsToNameCanonicalizer$TableInfo)>
	//   11   23:areturn         
	}

	public boolean maybeDirty()
	{
		return _hashShared ^ true;
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field boolean _hashShared>
	//    2    4:iconst_1        
	//    3    5:ixor            
	//    4    6:ireturn         
	}

	public void release()
	{
		if(!maybeDirty())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #259 <Method boolean maybeDirty()>
	//*   2    4:ifne            8
			return;
	//    3    7:return          
		CharsToNameCanonicalizer charstonamecanonicalizer = _parent;
	//    4    8:aload_0         
	//    5    9:getfield        #38  <Field CharsToNameCanonicalizer _parent>
	//    6   12:astore_1        
		if(charstonamecanonicalizer != null && _canonicalize)
	//*   7   13:aload_1         
	//*   8   14:ifnull          41
	//*   9   17:aload_0         
	//*  10   18:getfield        #42  <Field boolean _canonicalize>
	//*  11   21:ifeq            41
		{
			charstonamecanonicalizer.mergeChild(new TableInfo(this));
	//   12   24:aload_1         
	//   13   25:new             #9   <Class CharsToNameCanonicalizer$TableInfo>
	//   14   28:dup             
	//   15   29:aload_0         
	//   16   30:invokespecial   #262 <Method void CharsToNameCanonicalizer$TableInfo(CharsToNameCanonicalizer)>
	//   17   33:invokespecial   #264 <Method void mergeChild(CharsToNameCanonicalizer$TableInfo)>
			_hashShared = true;
	//   18   36:aload_0         
	//   19   37:iconst_1        
	//   20   38:putfield        #46  <Field boolean _hashShared>
		}
	//   21   41:return          
	}

	protected void reportTooManyCollisions(int i)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #266 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #267 <Method void StringBuilder()>
	//    3    7:astore_2        
		stringbuilder.append("Longest collision chain in symbol table (of size ");
	//    4    8:aload_2         
	//    5    9:ldc2            #269 <String "Longest collision chain in symbol table (of size ">
	//    6   12:invokevirtual   #273 <Method StringBuilder StringBuilder.append(String)>
	//    7   15:pop             
		stringbuilder.append(_size);
	//    8   16:aload_2         
	//    9   17:aload_0         
	//   10   18:getfield        #86  <Field int _size>
	//   11   21:invokevirtual   #276 <Method StringBuilder StringBuilder.append(int)>
	//   12   24:pop             
		stringbuilder.append(") now exceeds maximum, ");
	//   13   25:aload_2         
	//   14   26:ldc2            #278 <String ") now exceeds maximum, ">
	//   15   29:invokevirtual   #273 <Method StringBuilder StringBuilder.append(String)>
	//   16   32:pop             
		stringbuilder.append(i);
	//   17   33:aload_2         
	//   18   34:iload_1         
	//   19   35:invokevirtual   #276 <Method StringBuilder StringBuilder.append(int)>
	//   20   38:pop             
		stringbuilder.append(" -- suspect a DoS attack based on hash collisions");
	//   21   39:aload_2         
	//   22   40:ldc2            #280 <String " -- suspect a DoS attack based on hash collisions">
	//   23   43:invokevirtual   #273 <Method StringBuilder StringBuilder.append(String)>
	//   24   46:pop             
		throw new IllegalStateException(stringbuilder.toString());
	//   25   47:new             #220 <Class IllegalStateException>
	//   26   50:dup             
	//   27   51:aload_2         
	//   28   52:invokevirtual   #284 <Method String StringBuilder.toString()>
	//   29   55:invokespecial   #235 <Method void IllegalStateException(String)>
	//   30   58:athrow          
	}

	private Bucket _buckets[];
	private boolean _canonicalize;
	private final int _flags;
	private boolean _hashShared;
	private int _indexMask;
	private int _longestCollisionList;
	private BitSet _overflows;
	private final CharsToNameCanonicalizer _parent;
	private final int _seed;
	private int _size;
	private int _sizeThreshold;
	private String _symbols[];
	private final AtomicReference _tableInfo;


/*
	static int access$000(CharsToNameCanonicalizer charstonamecanonicalizer)
	{
		return charstonamecanonicalizer._size;
	//    0    0:aload_0         
	//    1    1:getfield        #86  <Field int _size>
	//    2    4:ireturn         
	}

*/


/*
	static int access$100(CharsToNameCanonicalizer charstonamecanonicalizer)
	{
		return charstonamecanonicalizer._longestCollisionList;
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field int _longestCollisionList>
	//    2    4:ireturn         
	}

*/


/*
	static String[] access$200(CharsToNameCanonicalizer charstonamecanonicalizer)
	{
		return charstonamecanonicalizer._symbols;
	//    0    0:aload_0         
	//    1    1:getfield        #76  <Field String[] _symbols>
	//    2    4:areturn         
	}

*/


/*
	static Bucket[] access$300(CharsToNameCanonicalizer charstonamecanonicalizer)
	{
		return charstonamecanonicalizer._buckets;
	//    0    0:aload_0         
	//    1    1:getfield        #81  <Field CharsToNameCanonicalizer$Bucket[] _buckets>
	//    2    4:areturn         
	}

*/
}
