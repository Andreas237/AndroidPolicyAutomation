// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.core.sym;

import com.fasterxml.jackson.core.util.InternCache;
import java.util.Arrays;
import java.util.BitSet;

public final class CharsToNameCanonicalizer
{
	static final class Bucket
	{

		public String has(char ac[], int i, int j)
		{
			if(symbol.length() == j) goto _L2; else goto _L1
		//    0    0:aload_0         
		//    1    1:getfield        #20  <Field String symbol>
		//    2    4:invokevirtual   #32  <Method int String.length()>
		//    3    7:iload_3         
		//    4    8:icmpeq          13
_L1:
			return null;
		//    5   11:aconst_null     
		//    6   12:areturn         
_L2:
			int k = 0;
		//    7   13:iconst_0        
		//    8   14:istore          4
			int l;
			do
			{
				if(symbol.charAt(k) != ac[i + k])
					continue; /* Loop/switch isn't completed */
		//    9   16:aload_0         
		//   10   17:getfield        #20  <Field String symbol>
		//   11   20:iload           4
		//   12   22:invokevirtual   #36  <Method char String.charAt(int)>
		//   13   25:aload_1         
		//   14   26:iload_2         
		//   15   27:iload           4
		//   16   29:iadd            
		//   17   30:caload          
		//   18   31:icmpne          11
				l = k + 1;
		//   19   34:iload           4
		//   20   36:iconst_1        
		//   21   37:iadd            
		//   22   38:istore          5
				k = l;
		//   23   40:iload           5
		//   24   42:istore          4
			} while(l < j);
		//   25   44:iload           5
		//   26   46:iload_3         
		//   27   47:icmplt          16
			break; /* Loop/switch isn't completed */
			if(true) goto _L1; else goto _L3
_L3:
			return symbol;
		//   28   50:aload_0         
		//   29   51:getfield        #20  <Field String symbol>
		//   30   54:areturn         
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
			int i;
			if(bucket == null)
		//*   8   14:aload_2         
		//*   9   15:ifnonnull       26
				i = 1;
		//   10   18:iconst_1        
		//   11   19:istore_3        
			else
		//*  12   20:aload_0         
		//*  13   21:iload_3         
		//*  14   22:putfield        #24  <Field int length>
		//*  15   25:return          
				i = bucket.length + 1;
		//   16   26:aload_2         
		//   17   27:getfield        #24  <Field int length>
		//   18   30:iconst_1        
		//   19   31:iadd            
		//   20   32:istore_3        
			length = i;
		//*  21   33:goto            20
		}
	}


	private CharsToNameCanonicalizer()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #45  <Method void Object()>
		_canonicalize = true;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #47  <Field boolean _canonicalize>
		_flags = -1;
	//    5    9:aload_0         
	//    6   10:iconst_m1       
	//    7   11:putfield        #49  <Field int _flags>
		_dirty = true;
	//    8   14:aload_0         
	//    9   15:iconst_1        
	//   10   16:putfield        #51  <Field boolean _dirty>
		_hashSeed = 0;
	//   11   19:aload_0         
	//   12   20:iconst_0        
	//   13   21:putfield        #53  <Field int _hashSeed>
		_longestCollisionList = 0;
	//   14   24:aload_0         
	//   15   25:iconst_0        
	//   16   26:putfield        #55  <Field int _longestCollisionList>
		initTables(64);
	//   17   29:aload_0         
	//   18   30:bipush          64
	//   19   32:invokespecial   #59  <Method void initTables(int)>
	//   20   35:return          
	}

	private CharsToNameCanonicalizer(CharsToNameCanonicalizer charstonamecanonicalizer, int i, String as[], Bucket abucket[], int j, int k, int l)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #45  <Method void Object()>
		_parent = charstonamecanonicalizer;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #62  <Field CharsToNameCanonicalizer _parent>
		_flags = i;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #49  <Field int _flags>
		_canonicalize = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES.enabledIn(i);
	//    8   14:aload_0         
	//    9   15:getstatic       #68  <Field com.fasterxml.jackson.core.JsonFactory$Feature com.fasterxml.jackson.core.JsonFactory$Feature.CANONICALIZE_FIELD_NAMES>
	//   10   18:iload_2         
	//   11   19:invokevirtual   #72  <Method boolean com.fasterxml.jackson.core.JsonFactory$Feature.enabledIn(int)>
	//   12   22:putfield        #47  <Field boolean _canonicalize>
		_symbols = as;
	//   13   25:aload_0         
	//   14   26:aload_3         
	//   15   27:putfield        #74  <Field String[] _symbols>
		_buckets = abucket;
	//   16   30:aload_0         
	//   17   31:aload           4
	//   18   33:putfield        #76  <Field CharsToNameCanonicalizer$Bucket[] _buckets>
		_size = j;
	//   19   36:aload_0         
	//   20   37:iload           5
	//   21   39:putfield        #78  <Field int _size>
		_hashSeed = k;
	//   22   42:aload_0         
	//   23   43:iload           6
	//   24   45:putfield        #53  <Field int _hashSeed>
		i = as.length;
	//   25   48:aload_3         
	//   26   49:arraylength     
	//   27   50:istore_2        
		_sizeThreshold = _thresholdSize(i);
	//   28   51:aload_0         
	//   29   52:iload_2         
	//   30   53:invokestatic    #82  <Method int _thresholdSize(int)>
	//   31   56:putfield        #84  <Field int _sizeThreshold>
		_indexMask = i - 1;
	//   32   59:aload_0         
	//   33   60:iload_2         
	//   34   61:iconst_1        
	//   35   62:isub            
	//   36   63:putfield        #86  <Field int _indexMask>
		_longestCollisionList = l;
	//   37   66:aload_0         
	//   38   67:iload           7
	//   39   69:putfield        #55  <Field int _longestCollisionList>
		_dirty = false;
	//   40   72:aload_0         
	//   41   73:iconst_0        
	//   42   74:putfield        #51  <Field boolean _dirty>
	//   43   77:return          
	}

	private String _addSymbol(char ac[], int i, int j, int k, int l)
	{
		if(_dirty) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field boolean _dirty>
	//    2    4:ifne            83
_L1:
		copyArrays();
	//    3    7:aload_0         
	//    4    8:invokespecial   #91  <Method void copyArrays()>
		_dirty = true;
	//    5   11:aload_0         
	//    6   12:iconst_1        
	//    7   13:putfield        #51  <Field boolean _dirty>
_L4:
		String s = new String(ac, i, j);
	//    8   16:new             #93  <Class String>
	//    9   19:dup             
	//   10   20:aload_1         
	//   11   21:iload_2         
	//   12   22:iload_3         
	//   13   23:invokespecial   #96  <Method void String(char[], int, int)>
	//   14   26:astore          6
		ac = ((char []) (s));
	//   15   28:aload           6
	//   16   30:astore_1        
		if(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES.enabledIn(_flags))
	//*  17   31:getstatic       #99  <Field com.fasterxml.jackson.core.JsonFactory$Feature com.fasterxml.jackson.core.JsonFactory$Feature.INTERN_FIELD_NAMES>
	//*  18   34:aload_0         
	//*  19   35:getfield        #49  <Field int _flags>
	//*  20   38:invokevirtual   #72  <Method boolean com.fasterxml.jackson.core.JsonFactory$Feature.enabledIn(int)>
	//*  21   41:ifeq            53
			ac = ((char []) (InternCache.instance.intern(s)));
	//   22   44:getstatic       #105 <Field InternCache InternCache.instance>
	//   23   47:aload           6
	//   24   49:invokevirtual   #109 <Method String InternCache.intern(String)>
	//   25   52:astore_1        
		_size = _size + 1;
	//   26   53:aload_0         
	//   27   54:aload_0         
	//   28   55:getfield        #78  <Field int _size>
	//   29   58:iconst_1        
	//   30   59:iadd            
	//   31   60:putfield        #78  <Field int _size>
		if(_symbols[l] == null)
	//*  32   63:aload_0         
	//*  33   64:getfield        #74  <Field String[] _symbols>
	//*  34   67:iload           5
	//*  35   69:aaload          
	//*  36   70:ifnonnull       114
		{
			_symbols[l] = ((String) (ac));
	//   37   73:aload_0         
	//   38   74:getfield        #74  <Field String[] _symbols>
	//   39   77:iload           5
	//   40   79:aload_1         
	//   41   80:aastore         
			return ((String) (ac));
	//   42   81:aload_1         
	//   43   82:areturn         
		}
		break; /* Loop/switch isn't completed */
_L2:
		if(_size >= _sizeThreshold)
	//*  44   83:aload_0         
	//*  45   84:getfield        #78  <Field int _size>
	//*  46   87:aload_0         
	//*  47   88:getfield        #84  <Field int _sizeThreshold>
	//*  48   91:icmplt          16
		{
			rehash();
	//   49   94:aload_0         
	//   50   95:invokespecial   #112 <Method void rehash()>
			l = _hashToIndex(calcHash(ac, i, j));
	//   51   98:aload_0         
	//   52   99:aload_0         
	//   53  100:aload_1         
	//   54  101:iload_2         
	//   55  102:iload_3         
	//   56  103:invokevirtual   #116 <Method int calcHash(char[], int, int)>
	//   57  106:invokevirtual   #119 <Method int _hashToIndex(int)>
	//   58  109:istore          5
		}
		if(true) goto _L4; else goto _L3
	//   59  111:goto            16
_L3:
		i = l >> 1;
	//   60  114:iload           5
	//   61  116:iconst_1        
	//   62  117:ishr            
	//   63  118:istore_2        
		Bucket bucket = new Bucket(((String) (ac)), _buckets[i]);
	//   64  119:new             #6   <Class CharsToNameCanonicalizer$Bucket>
	//   65  122:dup             
	//   66  123:aload_1         
	//   67  124:aload_0         
	//   68  125:getfield        #76  <Field CharsToNameCanonicalizer$Bucket[] _buckets>
	//   69  128:iload_2         
	//   70  129:aaload          
	//   71  130:invokespecial   #122 <Method void CharsToNameCanonicalizer$Bucket(String, CharsToNameCanonicalizer$Bucket)>
	//   72  133:astore          6
		j = bucket.length;
	//   73  135:aload           6
	//   74  137:getfield        #125 <Field int CharsToNameCanonicalizer$Bucket.length>
	//   75  140:istore_3        
		if(j > 100)
	//*  76  141:iload_3         
	//*  77  142:bipush          100
	//*  78  144:icmple          156
		{
			_handleSpillOverflow(i, bucket);
	//   79  147:aload_0         
	//   80  148:iload_2         
	//   81  149:aload           6
	//   82  151:invokespecial   #129 <Method void _handleSpillOverflow(int, CharsToNameCanonicalizer$Bucket)>
			return ((String) (ac));
	//   83  154:aload_1         
	//   84  155:areturn         
		} else
		{
			_buckets[i] = bucket;
	//   85  156:aload_0         
	//   86  157:getfield        #76  <Field CharsToNameCanonicalizer$Bucket[] _buckets>
	//   87  160:iload_2         
	//   88  161:aload           6
	//   89  163:aastore         
			_longestCollisionList = Math.max(j, _longestCollisionList);
	//   90  164:aload_0         
	//   91  165:iload_3         
	//   92  166:aload_0         
	//   93  167:getfield        #55  <Field int _longestCollisionList>
	//   94  170:invokestatic    #135 <Method int Math.max(int, int)>
	//   95  173:putfield        #55  <Field int _longestCollisionList>
			return ((String) (ac));
	//   96  176:aload_1         
	//   97  177:areturn         
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
	//    6   10:invokevirtual   #141 <Method String CharsToNameCanonicalizer$Bucket.has(char[], int, int)>
	//    7   13:astore          5
			if(s != null)
	//*   8   15:aload           5
	//*   9   17:ifnull          23
				return s;
	//   10   20:aload           5
	//   11   22:areturn         
		}

	//   12   23:aload           4
	//   13   25:getfield        #145 <Field CharsToNameCanonicalizer$Bucket CharsToNameCanonicalizer$Bucket.next>
	//   14   28:astore          4
	//*  15   30:goto            0
		return null;
	//   16   33:aconst_null     
	//   17   34:areturn         
	}

	private void _handleSpillOverflow(int i, Bucket bucket)
	{
		if(_overflows == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #147 <Field BitSet _overflows>
	//*   2    4:ifnonnull       64
		{
			_overflows = new BitSet();
	//    3    7:aload_0         
	//    4    8:new             #149 <Class BitSet>
	//    5   11:dup             
	//    6   12:invokespecial   #150 <Method void BitSet()>
	//    7   15:putfield        #147 <Field BitSet _overflows>
			_overflows.set(i);
	//    8   18:aload_0         
	//    9   19:getfield        #147 <Field BitSet _overflows>
	//   10   22:iload_1         
	//   11   23:invokevirtual   #153 <Method void BitSet.set(int)>
		} else
	//*  12   26:aload_0         
	//*  13   27:getfield        #74  <Field String[] _symbols>
	//*  14   30:iload_1         
	//*  15   31:iload_1         
	//*  16   32:iadd            
	//*  17   33:aload_2         
	//*  18   34:getfield        #157 <Field String CharsToNameCanonicalizer$Bucket.symbol>
	//*  19   37:aastore         
	//*  20   38:aload_0         
	//*  21   39:getfield        #76  <Field CharsToNameCanonicalizer$Bucket[] _buckets>
	//*  22   42:iload_1         
	//*  23   43:aconst_null     
	//*  24   44:aastore         
	//*  25   45:aload_0         
	//*  26   46:aload_0         
	//*  27   47:getfield        #78  <Field int _size>
	//*  28   50:aload_2         
	//*  29   51:getfield        #125 <Field int CharsToNameCanonicalizer$Bucket.length>
	//*  30   54:isub            
	//*  31   55:putfield        #78  <Field int _size>
	//*  32   58:aload_0         
	//*  33   59:iconst_m1       
	//*  34   60:putfield        #55  <Field int _longestCollisionList>
	//*  35   63:return          
		if(_overflows.get(i))
	//*  36   64:aload_0         
	//*  37   65:getfield        #147 <Field BitSet _overflows>
	//*  38   68:iload_1         
	//*  39   69:invokevirtual   #160 <Method boolean BitSet.get(int)>
	//*  40   72:ifeq            102
		{
			if(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW.enabledIn(_flags))
	//*  41   75:getstatic       #163 <Field com.fasterxml.jackson.core.JsonFactory$Feature com.fasterxml.jackson.core.JsonFactory$Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW>
	//*  42   78:aload_0         
	//*  43   79:getfield        #49  <Field int _flags>
	//*  44   82:invokevirtual   #72  <Method boolean com.fasterxml.jackson.core.JsonFactory$Feature.enabledIn(int)>
	//*  45   85:ifeq            94
				reportTooManyCollisions(100);
	//   46   88:aload_0         
	//   47   89:bipush          100
	//   48   91:invokevirtual   #166 <Method void reportTooManyCollisions(int)>
			_canonicalize = false;
	//   49   94:aload_0         
	//   50   95:iconst_0        
	//   51   96:putfield        #47  <Field boolean _canonicalize>
		} else
	//*  52   99:goto            26
		{
			_overflows.set(i);
	//   53  102:aload_0         
	//   54  103:getfield        #147 <Field BitSet _overflows>
	//   55  106:iload_1         
	//   56  107:invokevirtual   #153 <Method void BitSet.set(int)>
		}
		_symbols[i + i] = bucket.symbol;
		_buckets[i] = null;
		_size = _size - bucket.length;
		_longestCollisionList = -1;
	//*  57  110:goto            26
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
	//    1    1:getfield        #74  <Field String[] _symbols>
	//    2    4:astore_1        
		_symbols = (String[])Arrays.copyOf(aobj, aobj.length);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:aload_1         
	//    6    8:arraylength     
	//    7    9:invokestatic    #172 <Method Object[] Arrays.copyOf(Object[], int)>
	//    8   12:checkcast       #173 <Class String[]>
	//    9   15:putfield        #74  <Field String[] _symbols>
		aobj = ((Object []) (_buckets));
	//   10   18:aload_0         
	//   11   19:getfield        #76  <Field CharsToNameCanonicalizer$Bucket[] _buckets>
	//   12   22:astore_1        
		_buckets = (Bucket[])Arrays.copyOf(aobj, aobj.length);
	//   13   23:aload_0         
	//   14   24:aload_1         
	//   15   25:aload_1         
	//   16   26:arraylength     
	//   17   27:invokestatic    #172 <Method Object[] Arrays.copyOf(Object[], int)>
	//   18   30:checkcast       #174 <Class CharsToNameCanonicalizer$Bucket[]>
	//   19   33:putfield        #76  <Field CharsToNameCanonicalizer$Bucket[] _buckets>
	//   20   36:return          
	}

	public static CharsToNameCanonicalizer createRoot()
	{
		long l = System.currentTimeMillis();
	//    0    0:invokestatic    #182 <Method long System.currentTimeMillis()>
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
	//   11   14:invokestatic    #185 <Method CharsToNameCanonicalizer createRoot(int)>
	//   12   17:areturn         
	}

	protected static CharsToNameCanonicalizer createRoot(int i)
	{
		return sBootstrapSymbolTable.makeOrphan(i);
	//    0    0:getstatic       #43  <Field CharsToNameCanonicalizer sBootstrapSymbolTable>
	//    1    3:iload_0         
	//    2    4:invokespecial   #188 <Method CharsToNameCanonicalizer makeOrphan(int)>
	//    3    7:areturn         
	}

	private void initTables(int i)
	{
		_symbols = new String[i];
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:anewarray       String[]
	//    3    5:putfield        #74  <Field String[] _symbols>
		_buckets = new Bucket[i >> 1];
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:iconst_1        
	//    7   11:ishr            
	//    8   12:anewarray       Bucket[]
	//    9   15:putfield        #76  <Field CharsToNameCanonicalizer$Bucket[] _buckets>
		_indexMask = i - 1;
	//   10   18:aload_0         
	//   11   19:iload_1         
	//   12   20:iconst_1        
	//   13   21:isub            
	//   14   22:putfield        #86  <Field int _indexMask>
		_size = 0;
	//   15   25:aload_0         
	//   16   26:iconst_0        
	//   17   27:putfield        #78  <Field int _size>
		_longestCollisionList = 0;
	//   18   30:aload_0         
	//   19   31:iconst_0        
	//   20   32:putfield        #55  <Field int _longestCollisionList>
		_sizeThreshold = _thresholdSize(i);
	//   21   35:aload_0         
	//   22   36:iload_1         
	//   23   37:invokestatic    #82  <Method int _thresholdSize(int)>
	//   24   40:putfield        #84  <Field int _sizeThreshold>
	//   25   43:return          
	}

	private CharsToNameCanonicalizer makeOrphan(int i)
	{
		return new CharsToNameCanonicalizer(((CharsToNameCanonicalizer) (null)), -1, _symbols, _buckets, _size, i, _longestCollisionList);
	//    0    0:new             #2   <Class CharsToNameCanonicalizer>
	//    1    3:dup             
	//    2    4:aconst_null     
	//    3    5:iconst_m1       
	//    4    6:aload_0         
	//    5    7:getfield        #74  <Field String[] _symbols>
	//    6   10:aload_0         
	//    7   11:getfield        #76  <Field CharsToNameCanonicalizer$Bucket[] _buckets>
	//    8   14:aload_0         
	//    9   15:getfield        #78  <Field int _size>
	//   10   18:iload_1         
	//   11   19:aload_0         
	//   12   20:getfield        #55  <Field int _longestCollisionList>
	//   13   23:invokespecial   #190 <Method void CharsToNameCanonicalizer(CharsToNameCanonicalizer, int, String[], CharsToNameCanonicalizer$Bucket[], int, int, int)>
	//   14   26:areturn         
	}

	private void mergeChild(CharsToNameCanonicalizer charstonamecanonicalizer)
	{
		if(charstonamecanonicalizer.size() <= 12000)
			break MISSING_BLOCK_LABEL_32;
	//    0    0:aload_1         
	//    1    1:invokevirtual   #196 <Method int size()>
	//    2    4:sipush          12000
	//    3    7:icmple          32
		this;
	//    4   10:aload_0         
		JVM INSTR monitorenter ;
	//    5   11:monitorenter    
		initTables(256);
	//    6   12:aload_0         
	//    7   13:sipush          256
	//    8   16:invokespecial   #59  <Method void initTables(int)>
		_dirty = false;
	//    9   19:aload_0         
	//   10   20:iconst_0        
	//   11   21:putfield        #51  <Field boolean _dirty>
		this;
	//   12   24:aload_0         
		JVM INSTR monitorexit ;
	//   13   25:monitorexit     
		return;
	//   14   26:return          
		charstonamecanonicalizer;
	//   15   27:astore_1        
		this;
	//   16   28:aload_0         
		JVM INSTR monitorexit ;
	//   17   29:monitorexit     
		throw charstonamecanonicalizer;
	//   18   30:aload_1         
	//   19   31:athrow          
		if(charstonamecanonicalizer.size() <= size())
			break MISSING_BLOCK_LABEL_106;
	//   20   32:aload_1         
	//   21   33:invokevirtual   #196 <Method int size()>
	//   22   36:aload_0         
	//   23   37:invokevirtual   #196 <Method int size()>
	//   24   40:icmple          106
		this;
	//   25   43:aload_0         
		JVM INSTR monitorenter ;
	//   26   44:monitorenter    
		_symbols = charstonamecanonicalizer._symbols;
	//   27   45:aload_0         
	//   28   46:aload_1         
	//   29   47:getfield        #74  <Field String[] _symbols>
	//   30   50:putfield        #74  <Field String[] _symbols>
		_buckets = charstonamecanonicalizer._buckets;
	//   31   53:aload_0         
	//   32   54:aload_1         
	//   33   55:getfield        #76  <Field CharsToNameCanonicalizer$Bucket[] _buckets>
	//   34   58:putfield        #76  <Field CharsToNameCanonicalizer$Bucket[] _buckets>
		_size = charstonamecanonicalizer._size;
	//   35   61:aload_0         
	//   36   62:aload_1         
	//   37   63:getfield        #78  <Field int _size>
	//   38   66:putfield        #78  <Field int _size>
		_sizeThreshold = charstonamecanonicalizer._sizeThreshold;
	//   39   69:aload_0         
	//   40   70:aload_1         
	//   41   71:getfield        #84  <Field int _sizeThreshold>
	//   42   74:putfield        #84  <Field int _sizeThreshold>
		_indexMask = charstonamecanonicalizer._indexMask;
	//   43   77:aload_0         
	//   44   78:aload_1         
	//   45   79:getfield        #86  <Field int _indexMask>
	//   46   82:putfield        #86  <Field int _indexMask>
		_longestCollisionList = charstonamecanonicalizer._longestCollisionList;
	//   47   85:aload_0         
	//   48   86:aload_1         
	//   49   87:getfield        #55  <Field int _longestCollisionList>
	//   50   90:putfield        #55  <Field int _longestCollisionList>
		_dirty = false;
	//   51   93:aload_0         
	//   52   94:iconst_0        
	//   53   95:putfield        #51  <Field boolean _dirty>
		this;
	//   54   98:aload_0         
		JVM INSTR monitorexit ;
	//   55   99:monitorexit     
		return;
	//   56  100:return          
		charstonamecanonicalizer;
	//   57  101:astore_1        
		this;
	//   58  102:aload_0         
		JVM INSTR monitorexit ;
	//   59  103:monitorexit     
		throw charstonamecanonicalizer;
	//   60  104:aload_1         
	//   61  105:athrow          
	//   62  106:return          
	}

	private void rehash()
	{
		int l1 = _symbols.length;
	//    0    0:aload_0         
	//    1    1:getfield        #74  <Field String[] _symbols>
	//    2    4:arraylength     
	//    3    5:istore          6
		int i = l1 + l1;
	//    4    7:iload           6
	//    5    9:iload           6
	//    6   11:iadd            
	//    7   12:istore_1        
		if(i > 0x10000)
	//*   8   13:iload_1         
	//*   9   14:ldc1            #18  <Int 0x10000>
	//*  10   16:icmple          59
		{
			_size = 0;
	//   11   19:aload_0         
	//   12   20:iconst_0        
	//   13   21:putfield        #78  <Field int _size>
			_canonicalize = false;
	//   14   24:aload_0         
	//   15   25:iconst_0        
	//   16   26:putfield        #47  <Field boolean _canonicalize>
			_symbols = new String[64];
	//   17   29:aload_0         
	//   18   30:bipush          64
	//   19   32:anewarray       String[]
	//   20   35:putfield        #74  <Field String[] _symbols>
			_buckets = new Bucket[32];
	//   21   38:aload_0         
	//   22   39:bipush          32
	//   23   41:anewarray       Bucket[]
	//   24   44:putfield        #76  <Field CharsToNameCanonicalizer$Bucket[] _buckets>
			_indexMask = 63;
	//   25   47:aload_0         
	//   26   48:bipush          63
	//   27   50:putfield        #86  <Field int _indexMask>
			_dirty = true;
	//   28   53:aload_0         
	//   29   54:iconst_1        
	//   30   55:putfield        #51  <Field boolean _dirty>
		} else
	//*  31   58:return          
		{
			String as[] = _symbols;
	//   32   59:aload_0         
	//   33   60:getfield        #74  <Field String[] _symbols>
	//   34   63:astore          7
			Bucket abucket[] = _buckets;
	//   35   65:aload_0         
	//   36   66:getfield        #76  <Field CharsToNameCanonicalizer$Bucket[] _buckets>
	//   37   69:astore          8
			_symbols = new String[i];
	//   38   71:aload_0         
	//   39   72:iload_1         
	//   40   73:anewarray       String[]
	//   41   76:putfield        #74  <Field String[] _symbols>
			_buckets = new Bucket[i >> 1];
	//   42   79:aload_0         
	//   43   80:iload_1         
	//   44   81:iconst_1        
	//   45   82:ishr            
	//   46   83:anewarray       Bucket[]
	//   47   86:putfield        #76  <Field CharsToNameCanonicalizer$Bucket[] _buckets>
			_indexMask = i - 1;
	//   48   89:aload_0         
	//   49   90:iload_1         
	//   50   91:iconst_1        
	//   51   92:isub            
	//   52   93:putfield        #86  <Field int _indexMask>
			_sizeThreshold = _thresholdSize(i);
	//   53   96:aload_0         
	//   54   97:iload_1         
	//   55   98:invokestatic    #82  <Method int _thresholdSize(int)>
	//   56  101:putfield        #84  <Field int _sizeThreshold>
			int j = 0;
	//   57  104:iconst_0        
	//   58  105:istore_2        
			i = 0;
	//   59  106:iconst_0        
	//   60  107:istore_1        
			int l = 0;
	//   61  108:iconst_0        
	//   62  109:istore_3        
			while(l < l1) 
	//*  63  110:iload_3         
	//*  64  111:iload           6
	//*  65  113:icmpge          225
			{
				Object obj = ((Object) (as[l]));
	//   66  116:aload           7
	//   67  118:iload_3         
	//   68  119:aaload          
	//   69  120:astore          9
				int i1 = j;
	//   70  122:iload_2         
	//   71  123:istore          4
				int k1 = i;
	//   72  125:iload_1         
	//   73  126:istore          5
				if(obj != null)
	//*  74  128:aload           9
	//*  75  130:ifnull          169
				{
					i1 = j + 1;
	//   76  133:iload_2         
	//   77  134:iconst_1        
	//   78  135:iadd            
	//   79  136:istore          4
					j = _hashToIndex(calcHash(((String) (obj))));
	//   80  138:aload_0         
	//   81  139:aload_0         
	//   82  140:aload           9
	//   83  142:invokevirtual   #199 <Method int calcHash(String)>
	//   84  145:invokevirtual   #119 <Method int _hashToIndex(int)>
	//   85  148:istore_2        
					if(_symbols[j] == null)
	//*  86  149:aload_0         
	//*  87  150:getfield        #74  <Field String[] _symbols>
	//*  88  153:iload_2         
	//*  89  154:aaload          
	//*  90  155:ifnonnull       182
					{
						_symbols[j] = ((String) (obj));
	//   91  158:aload_0         
	//   92  159:getfield        #74  <Field String[] _symbols>
	//   93  162:iload_2         
	//   94  163:aload           9
	//   95  165:aastore         
						k1 = i;
	//   96  166:iload_1         
	//   97  167:istore          5
					} else
	//*  98  169:iload_3         
	//*  99  170:iconst_1        
	//* 100  171:iadd            
	//* 101  172:istore_3        
	//* 102  173:iload           4
	//* 103  175:istore_2        
	//* 104  176:iload           5
	//* 105  178:istore_1        
	//* 106  179:goto            110
					{
						j >>= 1;
	//  107  182:iload_2         
	//  108  183:iconst_1        
	//  109  184:ishr            
	//  110  185:istore_2        
						obj = ((Object) (new Bucket(((String) (obj)), _buckets[j])));
	//  111  186:new             #6   <Class CharsToNameCanonicalizer$Bucket>
	//  112  189:dup             
	//  113  190:aload           9
	//  114  192:aload_0         
	//  115  193:getfield        #76  <Field CharsToNameCanonicalizer$Bucket[] _buckets>
	//  116  196:iload_2         
	//  117  197:aaload          
	//  118  198:invokespecial   #122 <Method void CharsToNameCanonicalizer$Bucket(String, CharsToNameCanonicalizer$Bucket)>
	//  119  201:astore          9
						_buckets[j] = ((Bucket) (obj));
	//  120  203:aload_0         
	//  121  204:getfield        #76  <Field CharsToNameCanonicalizer$Bucket[] _buckets>
	//  122  207:iload_2         
	//  123  208:aload           9
	//  124  210:aastore         
						k1 = Math.max(i, ((Bucket) (obj)).length);
	//  125  211:iload_1         
	//  126  212:aload           9
	//  127  214:getfield        #125 <Field int CharsToNameCanonicalizer$Bucket.length>
	//  128  217:invokestatic    #135 <Method int Math.max(int, int)>
	//  129  220:istore          5
					}
				}
				l++;
				j = i1;
				i = k1;
			}
	//* 130  222:goto            169
			l = 0;
	//  131  225:iconst_0        
	//  132  226:istore_3        
			int j1 = i;
	//  133  227:iload_1         
	//  134  228:istore          4
			i = l;
	//  135  230:iload_3         
	//  136  231:istore_1        
			l = j;
	//  137  232:iload_2         
	//  138  233:istore_3        
			while(i < l1 >> 1) 
	//* 139  234:iload_1         
	//* 140  235:iload           6
	//* 141  237:iconst_1        
	//* 142  238:ishr            
	//* 143  239:icmpge          364
			{
				Bucket bucket = abucket[i];
	//  144  242:aload           8
	//  145  244:iload_1         
	//  146  245:aaload          
	//  147  246:astore          7
				int k = j1;
	//  148  248:iload           4
	//  149  250:istore_2        
				while(bucket != null) 
	//* 150  251:aload           7
	//* 151  253:ifnull          354
				{
					l++;
	//  152  256:iload_3         
	//  153  257:iconst_1        
	//  154  258:iadd            
	//  155  259:istore_3        
					Object obj1 = ((Object) (bucket.symbol));
	//  156  260:aload           7
	//  157  262:getfield        #157 <Field String CharsToNameCanonicalizer$Bucket.symbol>
	//  158  265:astore          9
					j1 = _hashToIndex(calcHash(((String) (obj1))));
	//  159  267:aload_0         
	//  160  268:aload_0         
	//  161  269:aload           9
	//  162  271:invokevirtual   #199 <Method int calcHash(String)>
	//  163  274:invokevirtual   #119 <Method int _hashToIndex(int)>
	//  164  277:istore          4
					if(_symbols[j1] == null)
	//* 165  279:aload_0         
	//* 166  280:getfield        #74  <Field String[] _symbols>
	//* 167  283:iload           4
	//* 168  285:aaload          
	//* 169  286:ifnonnull       308
					{
						_symbols[j1] = ((String) (obj1));
	//  170  289:aload_0         
	//  171  290:getfield        #74  <Field String[] _symbols>
	//  172  293:iload           4
	//  173  295:aload           9
	//  174  297:aastore         
					} else
	//* 175  298:aload           7
	//* 176  300:getfield        #145 <Field CharsToNameCanonicalizer$Bucket CharsToNameCanonicalizer$Bucket.next>
	//* 177  303:astore          7
	//* 178  305:goto            251
					{
						j1 >>= 1;
	//  179  308:iload           4
	//  180  310:iconst_1        
	//  181  311:ishr            
	//  182  312:istore          4
						obj1 = ((Object) (new Bucket(((String) (obj1)), _buckets[j1])));
	//  183  314:new             #6   <Class CharsToNameCanonicalizer$Bucket>
	//  184  317:dup             
	//  185  318:aload           9
	//  186  320:aload_0         
	//  187  321:getfield        #76  <Field CharsToNameCanonicalizer$Bucket[] _buckets>
	//  188  324:iload           4
	//  189  326:aaload          
	//  190  327:invokespecial   #122 <Method void CharsToNameCanonicalizer$Bucket(String, CharsToNameCanonicalizer$Bucket)>
	//  191  330:astore          9
						_buckets[j1] = ((Bucket) (obj1));
	//  192  332:aload_0         
	//  193  333:getfield        #76  <Field CharsToNameCanonicalizer$Bucket[] _buckets>
	//  194  336:iload           4
	//  195  338:aload           9
	//  196  340:aastore         
						k = Math.max(k, ((Bucket) (obj1)).length);
	//  197  341:iload_2         
	//  198  342:aload           9
	//  199  344:getfield        #125 <Field int CharsToNameCanonicalizer$Bucket.length>
	//  200  347:invokestatic    #135 <Method int Math.max(int, int)>
	//  201  350:istore_2        
					}
					bucket = bucket.next;
				}
	//* 202  351:goto            298
				i++;
	//  203  354:iload_1         
	//  204  355:iconst_1        
	//  205  356:iadd            
	//  206  357:istore_1        
				j1 = k;
	//  207  358:iload_2         
	//  208  359:istore          4
			}
	//* 209  361:goto            234
			_longestCollisionList = j1;
	//  210  364:aload_0         
	//  211  365:iload           4
	//  212  367:putfield        #55  <Field int _longestCollisionList>
			_overflows = null;
	//  213  370:aload_0         
	//  214  371:aconst_null     
	//  215  372:putfield        #147 <Field BitSet _overflows>
			if(l != _size)
	//* 216  375:iload_3         
	//* 217  376:aload_0         
	//* 218  377:getfield        #78  <Field int _size>
	//* 219  380:icmpeq          58
				throw new Error((new StringBuilder()).append("Internal error on SymbolTable.rehash(): had ").append(_size).append(" entries; now have ").append(l).append(".").toString());
	//  220  383:new             #201 <Class Error>
	//  221  386:dup             
	//  222  387:new             #203 <Class StringBuilder>
	//  223  390:dup             
	//  224  391:invokespecial   #204 <Method void StringBuilder()>
	//  225  394:ldc1            #206 <String "Internal error on SymbolTable.rehash(): had ">
	//  226  396:invokevirtual   #210 <Method StringBuilder StringBuilder.append(String)>
	//  227  399:aload_0         
	//  228  400:getfield        #78  <Field int _size>
	//  229  403:invokevirtual   #213 <Method StringBuilder StringBuilder.append(int)>
	//  230  406:ldc1            #215 <String " entries; now have ">
	//  231  408:invokevirtual   #210 <Method StringBuilder StringBuilder.append(String)>
	//  232  411:iload_3         
	//  233  412:invokevirtual   #213 <Method StringBuilder StringBuilder.append(int)>
	//  234  415:ldc1            #217 <String ".">
	//  235  417:invokevirtual   #210 <Method StringBuilder StringBuilder.append(String)>
	//  236  420:invokevirtual   #221 <Method String StringBuilder.toString()>
	//  237  423:invokespecial   #224 <Method void Error(String)>
	//  238  426:athrow          
		}
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
		return _indexMask & i + (i >>> 3);
	//   12   14:aload_0         
	//   13   15:getfield        #86  <Field int _indexMask>
	//   14   18:iload_1         
	//   15   19:iload_1         
	//   16   20:iconst_3        
	//   17   21:iushr           
	//   18   22:iadd            
	//   19   23:iand            
	//   20   24:ireturn         
	}

	public int bucketCount()
	{
		return _symbols.length;
	//    0    0:aload_0         
	//    1    1:getfield        #74  <Field String[] _symbols>
	//    2    4:arraylength     
	//    3    5:ireturn         
	}

	public int calcHash(String s)
	{
		int l = s.length();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #227 <Method int String.length()>
	//    2    4:istore          4
		int i = _hashSeed;
	//    3    6:aload_0         
	//    4    7:getfield        #53  <Field int _hashSeed>
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
	//   16   25:invokevirtual   #231 <Method char String.charAt(int)>
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
		int k = _hashSeed;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field int _hashSeed>
	//    2    4:istore          4
		for(int l = i; l < i + j; l++)
	//*   3    6:iload_2         
	//*   4    7:istore          5
	//*   5    9:iload           5
	//*   6   11:iload_2         
	//*   7   12:iload_3         
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

	public int collisionCount()
	{
		int j = 0;
	//    0    0:iconst_0        
	//    1    1:istore_2        
		Bucket abucket[] = _buckets;
	//    2    2:aload_0         
	//    3    3:getfield        #76  <Field CharsToNameCanonicalizer$Bucket[] _buckets>
	//    4    6:astore          5
		int l = abucket.length;
	//    5    8:aload           5
	//    6   10:arraylength     
	//    7   11:istore          4
		for(int i = 0; i < l;)
	//*   8   13:iconst_0        
	//*   9   14:istore_1        
	//*  10   15:iload_1         
	//*  11   16:iload           4
	//*  12   18:icmpge          51
		{
			Bucket bucket = abucket[i];
	//   13   21:aload           5
	//   14   23:iload_1         
	//   15   24:aaload          
	//   16   25:astore          6
			int k = j;
	//   17   27:iload_2         
	//   18   28:istore_3        
			if(bucket != null)
	//*  19   29:aload           6
	//*  20   31:ifnull          42
				k = j + bucket.length;
	//   21   34:iload_2         
	//   22   35:aload           6
	//   23   37:getfield        #125 <Field int CharsToNameCanonicalizer$Bucket.length>
	//   24   40:iadd            
	//   25   41:istore_3        
			i++;
	//   26   42:iload_1         
	//   27   43:iconst_1        
	//   28   44:iadd            
	//   29   45:istore_1        
			j = k;
	//   30   46:iload_3         
	//   31   47:istore_2        
		}

	//*  32   48:goto            15
		return j;
	//   33   51:iload_2         
	//   34   52:ireturn         
	}

	public String findSymbol(char ac[], int i, int j, int k)
	{
		if(j >= 1) goto _L2; else goto _L1
	//    0    0:iload_3         
	//    1    1:iconst_1        
	//    2    2:icmpge          12
_L1:
		String s = "";
	//    3    5:ldc1            #236 <String "">
	//    4    7:astore          8
_L4:
		return s;
	//    5    9:aload           8
	//    6   11:areturn         
_L2:
		int j1;
		String s1;
		Bucket bucket;
label0:
		{
			if(!_canonicalize)
	//*   7   12:aload_0         
	//*   8   13:getfield        #47  <Field boolean _canonicalize>
	//*   9   16:ifne            30
				return new String(ac, i, j);
	//   10   19:new             #93  <Class String>
	//   11   22:dup             
	//   12   23:aload_1         
	//   13   24:iload_2         
	//   14   25:iload_3         
	//   15   26:invokespecial   #96  <Method void String(char[], int, int)>
	//   16   29:areturn         
			j1 = _hashToIndex(k);
	//   17   30:aload_0         
	//   18   31:iload           4
	//   19   33:invokevirtual   #119 <Method int _hashToIndex(int)>
	//   20   36:istore          7
			s = _symbols[j1];
	//   21   38:aload_0         
	//   22   39:getfield        #74  <Field String[] _symbols>
	//   23   42:iload           7
	//   24   44:aaload          
	//   25   45:astore          8
			if(s == null)
				break; /* Loop/switch isn't completed */
	//   26   47:aload           8
	//   27   49:ifnull          157
			if(s.length() != j)
				break label0;
	//   28   52:aload           8
	//   29   54:invokevirtual   #227 <Method int String.length()>
	//   30   57:iload_3         
	//   31   58:icmpne          99
			int l = 0;
	//   32   61:iconst_0        
	//   33   62:istore          5
			int i1;
			do
			{
				if(s.charAt(l) != ac[i + l])
					break label0;
	//   34   64:aload           8
	//   35   66:iload           5
	//   36   68:invokevirtual   #231 <Method char String.charAt(int)>
	//   37   71:aload_1         
	//   38   72:iload_2         
	//   39   73:iload           5
	//   40   75:iadd            
	//   41   76:caload          
	//   42   77:icmpne          99
				i1 = l + 1;
	//   43   80:iload           5
	//   44   82:iconst_1        
	//   45   83:iadd            
	//   46   84:istore          6
				l = i1;
	//   47   86:iload           6
	//   48   88:istore          5
			} while(i1 != j);
	//   49   90:iload           6
	//   50   92:iload_3         
	//   51   93:icmpne          64
			return s;
	//   52   96:aload           8
	//   53   98:areturn         
		}
		bucket = _buckets[j1 >> 1];
	//   54   99:aload_0         
	//   55  100:getfield        #76  <Field CharsToNameCanonicalizer$Bucket[] _buckets>
	//   56  103:iload           7
	//   57  105:iconst_1        
	//   58  106:ishr            
	//   59  107:aaload          
	//   60  108:astore          10
		if(bucket == null)
			break; /* Loop/switch isn't completed */
	//   61  110:aload           10
	//   62  112:ifnull          157
		s1 = bucket.has(ac, i, j);
	//   63  115:aload           10
	//   64  117:aload_1         
	//   65  118:iload_2         
	//   66  119:iload_3         
	//   67  120:invokevirtual   #141 <Method String CharsToNameCanonicalizer$Bucket.has(char[], int, int)>
	//   68  123:astore          9
		s = s1;
	//   69  125:aload           9
	//   70  127:astore          8
		if(s1 != null) goto _L4; else goto _L3
	//   71  129:aload           9
	//   72  131:ifnonnull       9
_L3:
		s1 = _findSymbol2(ac, i, j, bucket.next);
	//   73  134:aload_0         
	//   74  135:aload_1         
	//   75  136:iload_2         
	//   76  137:iload_3         
	//   77  138:aload           10
	//   78  140:getfield        #145 <Field CharsToNameCanonicalizer$Bucket CharsToNameCanonicalizer$Bucket.next>
	//   79  143:invokespecial   #238 <Method String _findSymbol2(char[], int, int, CharsToNameCanonicalizer$Bucket)>
	//   80  146:astore          9
		s = s1;
	//   81  148:aload           9
	//   82  150:astore          8
		if(s1 != null) goto _L4; else goto _L5
	//   83  152:aload           9
	//   84  154:ifnonnull       9
_L5:
		return _addSymbol(ac, i, j, k, j1);
	//   85  157:aload_0         
	//   86  158:aload_1         
	//   87  159:iload_2         
	//   88  160:iload_3         
	//   89  161:iload           4
	//   90  163:iload           7
	//   91  165:invokespecial   #240 <Method String _addSymbol(char[], int, int, int, int)>
	//   92  168:areturn         
	}

	public int hashSeed()
	{
		return _hashSeed;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field int _hashSeed>
	//    2    4:ireturn         
	}

	public CharsToNameCanonicalizer makeChild(int i)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		int j;
		int k;
		int l;
		String as[];
		Bucket abucket[];
		as = _symbols;
	//    2    2:aload_0         
	//    3    3:getfield        #74  <Field String[] _symbols>
	//    4    6:astore          5
		abucket = _buckets;
	//    5    8:aload_0         
	//    6    9:getfield        #76  <Field CharsToNameCanonicalizer$Bucket[] _buckets>
	//    7   12:astore          6
		j = _size;
	//    8   14:aload_0         
	//    9   15:getfield        #78  <Field int _size>
	//   10   18:istore_2        
		k = _hashSeed;
	//   11   19:aload_0         
	//   12   20:getfield        #53  <Field int _hashSeed>
	//   13   23:istore_3        
		l = _longestCollisionList;
	//   14   24:aload_0         
	//   15   25:getfield        #55  <Field int _longestCollisionList>
	//   16   28:istore          4
		this;
	//   17   30:aload_0         
		JVM INSTR monitorexit ;
	//   18   31:monitorexit     
		return new CharsToNameCanonicalizer(this, i, as, abucket, j, k, l);
	//   19   32:new             #2   <Class CharsToNameCanonicalizer>
	//   20   35:dup             
	//   21   36:aload_0         
	//   22   37:iload_1         
	//   23   38:aload           5
	//   24   40:aload           6
	//   25   42:iload_2         
	//   26   43:iload_3         
	//   27   44:iload           4
	//   28   46:invokespecial   #190 <Method void CharsToNameCanonicalizer(CharsToNameCanonicalizer, int, String[], CharsToNameCanonicalizer$Bucket[], int, int, int)>
	//   29   49:areturn         
		Exception exception;
		exception;
	//   30   50:astore          5
		this;
	//   31   52:aload_0         
		JVM INSTR monitorexit ;
	//   32   53:monitorexit     
		throw exception;
	//   33   54:aload           5
	//   34   56:athrow          
	}

	public int maxCollisionLength()
	{
		return _longestCollisionList;
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field int _longestCollisionList>
	//    2    4:ireturn         
	}

	public boolean maybeDirty()
	{
		return _dirty;
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field boolean _dirty>
	//    2    4:ireturn         
	}

	public void release()
	{
		while(!maybeDirty() || _parent == null || !_canonicalize) 
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #248 <Method boolean maybeDirty()>
	//*   2    4:ifne            8
			return;
	//    3    7:return          
	//    4    8:aload_0         
	//    5    9:getfield        #62  <Field CharsToNameCanonicalizer _parent>
	//    6   12:ifnull          7
	//    7   15:aload_0         
	//    8   16:getfield        #47  <Field boolean _canonicalize>
	//    9   19:ifeq            7
		_parent.mergeChild(this);
	//   10   22:aload_0         
	//   11   23:getfield        #62  <Field CharsToNameCanonicalizer _parent>
	//   12   26:aload_0         
	//   13   27:invokespecial   #250 <Method void mergeChild(CharsToNameCanonicalizer)>
		_dirty = false;
	//   14   30:aload_0         
	//   15   31:iconst_0        
	//   16   32:putfield        #51  <Field boolean _dirty>
	//   17   35:return          
	}

	protected void reportTooManyCollisions(int i)
	{
		throw new IllegalStateException((new StringBuilder()).append("Longest collision chain in symbol table (of size ").append(_size).append(") now exceeds maximum, ").append(i).append(" -- suspect a DoS attack based on hash collisions").toString());
	//    0    0:new             #252 <Class IllegalStateException>
	//    1    3:dup             
	//    2    4:new             #203 <Class StringBuilder>
	//    3    7:dup             
	//    4    8:invokespecial   #204 <Method void StringBuilder()>
	//    5   11:ldc1            #254 <String "Longest collision chain in symbol table (of size ">
	//    6   13:invokevirtual   #210 <Method StringBuilder StringBuilder.append(String)>
	//    7   16:aload_0         
	//    8   17:getfield        #78  <Field int _size>
	//    9   20:invokevirtual   #213 <Method StringBuilder StringBuilder.append(int)>
	//   10   23:ldc2            #256 <String ") now exceeds maximum, ">
	//   11   26:invokevirtual   #210 <Method StringBuilder StringBuilder.append(String)>
	//   12   29:iload_1         
	//   13   30:invokevirtual   #213 <Method StringBuilder StringBuilder.append(int)>
	//   14   33:ldc2            #258 <String " -- suspect a DoS attack based on hash collisions">
	//   15   36:invokevirtual   #210 <Method StringBuilder StringBuilder.append(String)>
	//   16   39:invokevirtual   #221 <Method String StringBuilder.toString()>
	//   17   42:invokespecial   #259 <Method void IllegalStateException(String)>
	//   18   45:athrow          
	}

	public int size()
	{
		return _size;
	//    0    0:aload_0         
	//    1    1:getfield        #78  <Field int _size>
	//    2    4:ireturn         
	}

	protected static final int DEFAULT_T_SIZE = 64;
	public static final int HASH_MULT = 33;
	static final int MAX_COLL_CHAIN_LENGTH = 100;
	static final int MAX_ENTRIES_FOR_REUSE = 12000;
	protected static final int MAX_T_SIZE = 0x10000;
	static final CharsToNameCanonicalizer sBootstrapSymbolTable = new CharsToNameCanonicalizer();
	protected Bucket _buckets[];
	protected boolean _canonicalize;
	protected boolean _dirty;
	protected final int _flags;
	private final int _hashSeed;
	protected int _indexMask;
	protected int _longestCollisionList;
	protected BitSet _overflows;
	protected CharsToNameCanonicalizer _parent;
	protected int _size;
	protected int _sizeThreshold;
	protected String _symbols[];

	static 
	{
	//    0    0:new             #2   <Class CharsToNameCanonicalizer>
	//    1    3:dup             
	//    2    4:invokespecial   #41  <Method void CharsToNameCanonicalizer()>
	//    3    7:putstatic       #43  <Field CharsToNameCanonicalizer sBootstrapSymbolTable>
	//*   4   10:return          
	}
}
