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
	//    1    1:invokespecial   #46  <Method void Object()>
		_parent = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #48  <Field CharsToNameCanonicalizer _parent>
		_seed = i;
	//    5    9:aload_0         
	//    6   10:iload_1         
	//    7   11:putfield        #50  <Field int _seed>
		_canonicalize = true;
	//    8   14:aload_0         
	//    9   15:iconst_1        
	//   10   16:putfield        #52  <Field boolean _canonicalize>
		_flags = -1;
	//   11   19:aload_0         
	//   12   20:iconst_m1       
	//   13   21:putfield        #54  <Field int _flags>
		_hashShared = false;
	//   14   24:aload_0         
	//   15   25:iconst_0        
	//   16   26:putfield        #56  <Field boolean _hashShared>
		_longestCollisionList = 0;
	//   17   29:aload_0         
	//   18   30:iconst_0        
	//   19   31:putfield        #58  <Field int _longestCollisionList>
		_tableInfo = new AtomicReference(((Object) (TableInfo.createInitial(64))));
	//   20   34:aload_0         
	//   21   35:new             #60  <Class AtomicReference>
	//   22   38:dup             
	//   23   39:bipush          64
	//   24   41:invokestatic    #64  <Method CharsToNameCanonicalizer$TableInfo CharsToNameCanonicalizer$TableInfo.createInitial(int)>
	//   25   44:invokespecial   #67  <Method void AtomicReference(Object)>
	//   26   47:putfield        #69  <Field AtomicReference _tableInfo>
	//   27   50:return          
	}

	private CharsToNameCanonicalizer(CharsToNameCanonicalizer charstonamecanonicalizer, int i, int j, TableInfo tableinfo)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #46  <Method void Object()>
		_parent = charstonamecanonicalizer;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #48  <Field CharsToNameCanonicalizer _parent>
		_seed = j;
	//    5    9:aload_0         
	//    6   10:iload_3         
	//    7   11:putfield        #50  <Field int _seed>
		_tableInfo = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #69  <Field AtomicReference _tableInfo>
		_flags = i;
	//   11   19:aload_0         
	//   12   20:iload_2         
	//   13   21:putfield        #54  <Field int _flags>
		_canonicalize = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES.enabledIn(i);
	//   14   24:aload_0         
	//   15   25:getstatic       #77  <Field com.fasterxml.jackson.core.JsonFactory$Feature com.fasterxml.jackson.core.JsonFactory$Feature.CANONICALIZE_FIELD_NAMES>
	//   16   28:iload_2         
	//   17   29:invokevirtual   #81  <Method boolean com.fasterxml.jackson.core.JsonFactory$Feature.enabledIn(int)>
	//   18   32:putfield        #52  <Field boolean _canonicalize>
		_symbols = tableinfo.symbols;
	//   19   35:aload_0         
	//   20   36:aload           4
	//   21   38:getfield        #84  <Field String[] CharsToNameCanonicalizer$TableInfo.symbols>
	//   22   41:putfield        #86  <Field String[] _symbols>
		_buckets = tableinfo.buckets;
	//   23   44:aload_0         
	//   24   45:aload           4
	//   25   47:getfield        #89  <Field CharsToNameCanonicalizer$Bucket[] CharsToNameCanonicalizer$TableInfo.buckets>
	//   26   50:putfield        #91  <Field CharsToNameCanonicalizer$Bucket[] _buckets>
		_size = tableinfo.size;
	//   27   53:aload_0         
	//   28   54:aload           4
	//   29   56:getfield        #94  <Field int CharsToNameCanonicalizer$TableInfo.size>
	//   30   59:putfield        #96  <Field int _size>
		_longestCollisionList = tableinfo.longestCollisionList;
	//   31   62:aload_0         
	//   32   63:aload           4
	//   33   65:getfield        #99  <Field int CharsToNameCanonicalizer$TableInfo.longestCollisionList>
	//   34   68:putfield        #58  <Field int _longestCollisionList>
		i = _symbols.length;
	//   35   71:aload_0         
	//   36   72:getfield        #86  <Field String[] _symbols>
	//   37   75:arraylength     
	//   38   76:istore_2        
		_sizeThreshold = _thresholdSize(i);
	//   39   77:aload_0         
	//   40   78:iload_2         
	//   41   79:invokestatic    #103 <Method int _thresholdSize(int)>
	//   42   82:putfield        #105 <Field int _sizeThreshold>
		_indexMask = i - 1;
	//   43   85:aload_0         
	//   44   86:iload_2         
	//   45   87:iconst_1        
	//   46   88:isub            
	//   47   89:putfield        #107 <Field int _indexMask>
		_hashShared = true;
	//   48   92:aload_0         
	//   49   93:iconst_1        
	//   50   94:putfield        #56  <Field boolean _hashShared>
	//   51   97:return          
	}

	private String _addSymbol(char ac[], int i, int j, int k, int l)
	{
		if(_hashShared)
	//*   0    0:aload_0         
	//*   1    1:getfield        #56  <Field boolean _hashShared>
	//*   2    4:ifeq            19
		{
			copyArrays();
	//    3    7:aload_0         
	//    4    8:invokespecial   #112 <Method void copyArrays()>
			_hashShared = false;
	//    5   11:aload_0         
	//    6   12:iconst_0        
	//    7   13:putfield        #56  <Field boolean _hashShared>
		} else
	//*   8   16:goto            47
		if(_size >= _sizeThreshold)
	//*   9   19:aload_0         
	//*  10   20:getfield        #96  <Field int _size>
	//*  11   23:aload_0         
	//*  12   24:getfield        #105 <Field int _sizeThreshold>
	//*  13   27:icmplt          47
		{
			rehash();
	//   14   30:aload_0         
	//   15   31:invokespecial   #115 <Method void rehash()>
			l = _hashToIndex(calcHash(ac, i, j));
	//   16   34:aload_0         
	//   17   35:aload_0         
	//   18   36:aload_1         
	//   19   37:iload_2         
	//   20   38:iload_3         
	//   21   39:invokevirtual   #119 <Method int calcHash(char[], int, int)>
	//   22   42:invokevirtual   #122 <Method int _hashToIndex(int)>
	//   23   45:istore          5
		}
		Object obj = ((Object) (new String(ac, i, j)));
	//   24   47:new             #124 <Class String>
	//   25   50:dup             
	//   26   51:aload_1         
	//   27   52:iload_2         
	//   28   53:iload_3         
	//   29   54:invokespecial   #127 <Method void String(char[], int, int)>
	//   30   57:astore          6
		ac = ((char []) (obj));
	//   31   59:aload           6
	//   32   61:astore_1        
		if(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES.enabledIn(_flags))
	//*  33   62:getstatic       #130 <Field com.fasterxml.jackson.core.JsonFactory$Feature com.fasterxml.jackson.core.JsonFactory$Feature.INTERN_FIELD_NAMES>
	//*  34   65:aload_0         
	//*  35   66:getfield        #54  <Field int _flags>
	//*  36   69:invokevirtual   #81  <Method boolean com.fasterxml.jackson.core.JsonFactory$Feature.enabledIn(int)>
	//*  37   72:ifeq            84
			ac = ((char []) (InternCache.instance.intern(((String) (obj)))));
	//   38   75:getstatic       #136 <Field InternCache InternCache.instance>
	//   39   78:aload           6
	//   40   80:invokevirtual   #140 <Method String InternCache.intern(String)>
	//   41   83:astore_1        
		_size = _size + 1;
	//   42   84:aload_0         
	//   43   85:aload_0         
	//   44   86:getfield        #96  <Field int _size>
	//   45   89:iconst_1        
	//   46   90:iadd            
	//   47   91:putfield        #96  <Field int _size>
		if(_symbols[l] == null)
	//*  48   94:aload_0         
	//*  49   95:getfield        #86  <Field String[] _symbols>
	//*  50   98:iload           5
	//*  51  100:aaload          
	//*  52  101:ifnonnull       114
		{
			_symbols[l] = ((String) (ac));
	//   53  104:aload_0         
	//   54  105:getfield        #86  <Field String[] _symbols>
	//   55  108:iload           5
	//   56  110:aload_1         
	//   57  111:aastore         
			return ((String) (ac));
	//   58  112:aload_1         
	//   59  113:areturn         
		}
		i = l >> 1;
	//   60  114:iload           5
	//   61  116:iconst_1        
	//   62  117:ishr            
	//   63  118:istore_2        
		obj = ((Object) (new Bucket(((String) (ac)), _buckets[i])));
	//   64  119:new             #6   <Class CharsToNameCanonicalizer$Bucket>
	//   65  122:dup             
	//   66  123:aload_1         
	//   67  124:aload_0         
	//   68  125:getfield        #91  <Field CharsToNameCanonicalizer$Bucket[] _buckets>
	//   69  128:iload_2         
	//   70  129:aaload          
	//   71  130:invokespecial   #143 <Method void CharsToNameCanonicalizer$Bucket(String, CharsToNameCanonicalizer$Bucket)>
	//   72  133:astore          6
		j = ((Bucket) (obj)).length;
	//   73  135:aload           6
	//   74  137:getfield        #146 <Field int CharsToNameCanonicalizer$Bucket.length>
	//   75  140:istore_3        
		if(j > 100)
	//*  76  141:iload_3         
	//*  77  142:bipush          100
	//*  78  144:icmple          156
		{
			_handleSpillOverflow(i, ((Bucket) (obj)));
	//   79  147:aload_0         
	//   80  148:iload_2         
	//   81  149:aload           6
	//   82  151:invokespecial   #150 <Method void _handleSpillOverflow(int, CharsToNameCanonicalizer$Bucket)>
			return ((String) (ac));
	//   83  154:aload_1         
	//   84  155:areturn         
		} else
		{
			_buckets[i] = ((Bucket) (obj));
	//   85  156:aload_0         
	//   86  157:getfield        #91  <Field CharsToNameCanonicalizer$Bucket[] _buckets>
	//   87  160:iload_2         
	//   88  161:aload           6
	//   89  163:aastore         
			_longestCollisionList = Math.max(j, _longestCollisionList);
	//   90  164:aload_0         
	//   91  165:iload_3         
	//   92  166:aload_0         
	//   93  167:getfield        #58  <Field int _longestCollisionList>
	//   94  170:invokestatic    #156 <Method int Math.max(int, int)>
	//   95  173:putfield        #58  <Field int _longestCollisionList>
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
	//    6   10:invokevirtual   #162 <Method String CharsToNameCanonicalizer$Bucket.has(char[], int, int)>
	//    7   13:astore          5
			if(s != null)
	//*   8   15:aload           5
	//*   9   17:ifnull          23
				return s;
	//   10   20:aload           5
	//   11   22:areturn         
		}

	//   12   23:aload           4
	//   13   25:getfield        #166 <Field CharsToNameCanonicalizer$Bucket CharsToNameCanonicalizer$Bucket.next>
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
	//*   1    1:getfield        #168 <Field BitSet _overflows>
	//*   2    4:ifnonnull       29
		{
			_overflows = new BitSet();
	//    3    7:aload_0         
	//    4    8:new             #170 <Class BitSet>
	//    5   11:dup             
	//    6   12:invokespecial   #171 <Method void BitSet()>
	//    7   15:putfield        #168 <Field BitSet _overflows>
			_overflows.set(i);
	//    8   18:aload_0         
	//    9   19:getfield        #168 <Field BitSet _overflows>
	//   10   22:iload_1         
	//   11   23:invokevirtual   #174 <Method void BitSet.set(int)>
		} else
	//*  12   26:goto            75
		if(_overflows.get(i))
	//*  13   29:aload_0         
	//*  14   30:getfield        #168 <Field BitSet _overflows>
	//*  15   33:iload_1         
	//*  16   34:invokevirtual   #177 <Method boolean BitSet.get(int)>
	//*  17   37:ifeq            67
		{
			if(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW.enabledIn(_flags))
	//*  18   40:getstatic       #180 <Field com.fasterxml.jackson.core.JsonFactory$Feature com.fasterxml.jackson.core.JsonFactory$Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW>
	//*  19   43:aload_0         
	//*  20   44:getfield        #54  <Field int _flags>
	//*  21   47:invokevirtual   #81  <Method boolean com.fasterxml.jackson.core.JsonFactory$Feature.enabledIn(int)>
	//*  22   50:ifeq            59
				reportTooManyCollisions(100);
	//   23   53:aload_0         
	//   24   54:bipush          100
	//   25   56:invokevirtual   #183 <Method void reportTooManyCollisions(int)>
			_canonicalize = false;
	//   26   59:aload_0         
	//   27   60:iconst_0        
	//   28   61:putfield        #52  <Field boolean _canonicalize>
		} else
	//*  29   64:goto            75
		{
			_overflows.set(i);
	//   30   67:aload_0         
	//   31   68:getfield        #168 <Field BitSet _overflows>
	//   32   71:iload_1         
	//   33   72:invokevirtual   #174 <Method void BitSet.set(int)>
		}
		_symbols[i + i] = bucket.symbol;
	//   34   75:aload_0         
	//   35   76:getfield        #86  <Field String[] _symbols>
	//   36   79:iload_1         
	//   37   80:iload_1         
	//   38   81:iadd            
	//   39   82:aload_2         
	//   40   83:getfield        #187 <Field String CharsToNameCanonicalizer$Bucket.symbol>
	//   41   86:aastore         
		_buckets[i] = null;
	//   42   87:aload_0         
	//   43   88:getfield        #91  <Field CharsToNameCanonicalizer$Bucket[] _buckets>
	//   44   91:iload_1         
	//   45   92:aconst_null     
	//   46   93:aastore         
		_size = _size - bucket.length;
	//   47   94:aload_0         
	//   48   95:aload_0         
	//   49   96:getfield        #96  <Field int _size>
	//   50   99:aload_2         
	//   51  100:getfield        #146 <Field int CharsToNameCanonicalizer$Bucket.length>
	//   52  103:isub            
	//   53  104:putfield        #96  <Field int _size>
		_longestCollisionList = -1;
	//   54  107:aload_0         
	//   55  108:iconst_m1       
	//   56  109:putfield        #58  <Field int _longestCollisionList>
	//   57  112:return          
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
	//    1    1:getfield        #86  <Field String[] _symbols>
	//    2    4:astore_1        
		_symbols = (String[])Arrays.copyOf(aobj, aobj.length);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:aload_1         
	//    6    8:arraylength     
	//    7    9:invokestatic    #200 <Method Object[] Arrays.copyOf(Object[], int)>
	//    8   12:checkcast       #201 <Class String[]>
	//    9   15:putfield        #86  <Field String[] _symbols>
		aobj = ((Object []) (_buckets));
	//   10   18:aload_0         
	//   11   19:getfield        #91  <Field CharsToNameCanonicalizer$Bucket[] _buckets>
	//   12   22:astore_1        
		_buckets = (Bucket[])Arrays.copyOf(aobj, aobj.length);
	//   13   23:aload_0         
	//   14   24:aload_1         
	//   15   25:aload_1         
	//   16   26:arraylength     
	//   17   27:invokestatic    #200 <Method Object[] Arrays.copyOf(Object[], int)>
	//   18   30:checkcast       #202 <Class CharsToNameCanonicalizer$Bucket[]>
	//   19   33:putfield        #91  <Field CharsToNameCanonicalizer$Bucket[] _buckets>
	//   20   36:return          
	}

	public static CharsToNameCanonicalizer createRoot()
	{
		long l = System.currentTimeMillis();
	//    0    0:invokestatic    #210 <Method long System.currentTimeMillis()>
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
	//   11   14:invokestatic    #213 <Method CharsToNameCanonicalizer createRoot(int)>
	//   12   17:areturn         
	}

	protected static CharsToNameCanonicalizer createRoot(int i)
	{
		return new CharsToNameCanonicalizer(i);
	//    0    0:new             #2   <Class CharsToNameCanonicalizer>
	//    1    3:dup             
	//    2    4:iload_0         
	//    3    5:invokespecial   #215 <Method void CharsToNameCanonicalizer(int)>
	//    4    8:areturn         
	}

	private void mergeChild(TableInfo tableinfo)
	{
		int i = tableinfo.size;
	//    0    0:aload_1         
	//    1    1:getfield        #94  <Field int CharsToNameCanonicalizer$TableInfo.size>
	//    2    4:istore_2        
		TableInfo tableinfo1 = (TableInfo)_tableInfo.get();
	//    3    5:aload_0         
	//    4    6:getfield        #69  <Field AtomicReference _tableInfo>
	//    5    9:invokevirtual   #220 <Method Object AtomicReference.get()>
	//    6   12:checkcast       #9   <Class CharsToNameCanonicalizer$TableInfo>
	//    7   15:astore_3        
		if(i == tableinfo1.size)
	//*   8   16:iload_2         
	//*   9   17:aload_3         
	//*  10   18:getfield        #94  <Field int CharsToNameCanonicalizer$TableInfo.size>
	//*  11   21:icmpne          25
			return;
	//   12   24:return          
		if(i > 12000)
	//*  13   25:iload_2         
	//*  14   26:sipush          12000
	//*  15   29:icmple          38
			tableinfo = TableInfo.createInitial(64);
	//   16   32:bipush          64
	//   17   34:invokestatic    #64  <Method CharsToNameCanonicalizer$TableInfo CharsToNameCanonicalizer$TableInfo.createInitial(int)>
	//   18   37:astore_1        
		_tableInfo.compareAndSet(((Object) (tableinfo1)), ((Object) (tableinfo)));
	//   19   38:aload_0         
	//   20   39:getfield        #69  <Field AtomicReference _tableInfo>
	//   21   42:aload_3         
	//   22   43:aload_1         
	//   23   44:invokevirtual   #224 <Method boolean AtomicReference.compareAndSet(Object, Object)>
	//   24   47:pop             
	//   25   48:return          
	}

	private void rehash()
	{
		int i2 = _symbols.length;
	//    0    0:aload_0         
	//    1    1:getfield        #86  <Field String[] _symbols>
	//    2    4:arraylength     
	//    3    5:istore          6
		int i = i2 + i2;
	//    4    7:iload           6
	//    5    9:iload           6
	//    6   11:iadd            
	//    7   12:istore_1        
		if(i > 0x10000)
	//*   8   13:iload_1         
	//*   9   14:ldc1            #21  <Int 0x10000>
	//*  10   16:icmple          59
		{
			_size = 0;
	//   11   19:aload_0         
	//   12   20:iconst_0        
	//   13   21:putfield        #96  <Field int _size>
			_canonicalize = false;
	//   14   24:aload_0         
	//   15   25:iconst_0        
	//   16   26:putfield        #52  <Field boolean _canonicalize>
			_symbols = new String[64];
	//   17   29:aload_0         
	//   18   30:bipush          64
	//   19   32:anewarray       String[]
	//   20   35:putfield        #86  <Field String[] _symbols>
			_buckets = new Bucket[32];
	//   21   38:aload_0         
	//   22   39:bipush          32
	//   23   41:anewarray       Bucket[]
	//   24   44:putfield        #91  <Field CharsToNameCanonicalizer$Bucket[] _buckets>
			_indexMask = 63;
	//   25   47:aload_0         
	//   26   48:bipush          63
	//   27   50:putfield        #107 <Field int _indexMask>
			_hashShared = false;
	//   28   53:aload_0         
	//   29   54:iconst_0        
	//   30   55:putfield        #56  <Field boolean _hashShared>
			return;
	//   31   58:return          
		}
		String as[] = _symbols;
	//   32   59:aload_0         
	//   33   60:getfield        #86  <Field String[] _symbols>
	//   34   63:astore          7
		Bucket abucket[] = _buckets;
	//   35   65:aload_0         
	//   36   66:getfield        #91  <Field CharsToNameCanonicalizer$Bucket[] _buckets>
	//   37   69:astore          8
		_symbols = new String[i];
	//   38   71:aload_0         
	//   39   72:iload_1         
	//   40   73:anewarray       String[]
	//   41   76:putfield        #86  <Field String[] _symbols>
		_buckets = new Bucket[i >> 1];
	//   42   79:aload_0         
	//   43   80:iload_1         
	//   44   81:iconst_1        
	//   45   82:ishr            
	//   46   83:anewarray       Bucket[]
	//   47   86:putfield        #91  <Field CharsToNameCanonicalizer$Bucket[] _buckets>
		_indexMask = i - 1;
	//   48   89:aload_0         
	//   49   90:iload_1         
	//   50   91:iconst_1        
	//   51   92:isub            
	//   52   93:putfield        #107 <Field int _indexMask>
		_sizeThreshold = _thresholdSize(i);
	//   53   96:aload_0         
	//   54   97:iload_1         
	//   55   98:invokestatic    #103 <Method int _thresholdSize(int)>
	//   56  101:putfield        #105 <Field int _sizeThreshold>
		int i1 = 0;
	//   57  104:iconst_0        
	//   58  105:istore_3        
		int k = i1;
	//   59  106:iload_3         
	//   60  107:istore_2        
		int j1;
		for(i = k; i1 < i2; i = j1)
	//*  61  108:iload_2         
	//*  62  109:istore_1        
	//*  63  110:iload_3         
	//*  64  111:iload           6
	//*  65  113:icmpge          225
		{
			Object obj = ((Object) (as[i1]));
	//   66  116:aload           7
	//   67  118:iload_3         
	//   68  119:aaload          
	//   69  120:astore          9
			int l1 = k;
	//   70  122:iload_2         
	//   71  123:istore          5
			j1 = i;
	//   72  125:iload_1         
	//   73  126:istore          4
			if(obj != null)
	//*  74  128:aload           9
	//*  75  130:ifnull          212
			{
				l1 = k + 1;
	//   76  133:iload_2         
	//   77  134:iconst_1        
	//   78  135:iadd            
	//   79  136:istore          5
				k = _hashToIndex(calcHash(((String) (obj))));
	//   80  138:aload_0         
	//   81  139:aload_0         
	//   82  140:aload           9
	//   83  142:invokevirtual   #227 <Method int calcHash(String)>
	//   84  145:invokevirtual   #122 <Method int _hashToIndex(int)>
	//   85  148:istore_2        
				if(_symbols[k] == null)
	//*  86  149:aload_0         
	//*  87  150:getfield        #86  <Field String[] _symbols>
	//*  88  153:iload_2         
	//*  89  154:aaload          
	//*  90  155:ifnonnull       172
				{
					_symbols[k] = ((String) (obj));
	//   91  158:aload_0         
	//   92  159:getfield        #86  <Field String[] _symbols>
	//   93  162:iload_2         
	//   94  163:aload           9
	//   95  165:aastore         
					j1 = i;
	//   96  166:iload_1         
	//   97  167:istore          4
				} else
	//*  98  169:goto            212
				{
					k >>= 1;
	//   99  172:iload_2         
	//  100  173:iconst_1        
	//  101  174:ishr            
	//  102  175:istore_2        
					obj = ((Object) (new Bucket(((String) (obj)), _buckets[k])));
	//  103  176:new             #6   <Class CharsToNameCanonicalizer$Bucket>
	//  104  179:dup             
	//  105  180:aload           9
	//  106  182:aload_0         
	//  107  183:getfield        #91  <Field CharsToNameCanonicalizer$Bucket[] _buckets>
	//  108  186:iload_2         
	//  109  187:aaload          
	//  110  188:invokespecial   #143 <Method void CharsToNameCanonicalizer$Bucket(String, CharsToNameCanonicalizer$Bucket)>
	//  111  191:astore          9
					_buckets[k] = ((Bucket) (obj));
	//  112  193:aload_0         
	//  113  194:getfield        #91  <Field CharsToNameCanonicalizer$Bucket[] _buckets>
	//  114  197:iload_2         
	//  115  198:aload           9
	//  116  200:aastore         
					j1 = Math.max(i, ((Bucket) (obj)).length);
	//  117  201:iload_1         
	//  118  202:aload           9
	//  119  204:getfield        #146 <Field int CharsToNameCanonicalizer$Bucket.length>
	//  120  207:invokestatic    #156 <Method int Math.max(int, int)>
	//  121  210:istore          4
				}
			}
			i1++;
	//  122  212:iload_3         
	//  123  213:iconst_1        
	//  124  214:iadd            
	//  125  215:istore_3        
			k = l1;
	//  126  216:iload           5
	//  127  218:istore_2        
		}

	//  128  219:iload           4
	//  129  221:istore_1        
	//* 130  222:goto            110
		boolean flag = false;
	//  131  225:iconst_0        
	//  132  226:istore          5
		int k1 = i;
	//  133  228:iload_1         
	//  134  229:istore          4
		i1 = k;
	//  135  231:iload_2         
	//  136  232:istore_3        
		for(int j = ((int) (flag)); j < i2 >> 1;)
	//* 137  233:iload           5
	//* 138  235:istore_1        
	//* 139  236:iload_1         
	//* 140  237:iload           6
	//* 141  239:iconst_1        
	//* 142  240:ishr            
	//* 143  241:icmpge          366
		{
			Bucket bucket = abucket[j];
	//  144  244:aload           8
	//  145  246:iload_1         
	//  146  247:aaload          
	//  147  248:astore          7
			int l = k1;
	//  148  250:iload           4
	//  149  252:istore_2        
			for(; bucket != null; bucket = bucket.next)
	//* 150  253:aload           7
	//* 151  255:ifnull          356
			{
				i1++;
	//  152  258:iload_3         
	//  153  259:iconst_1        
	//  154  260:iadd            
	//  155  261:istore_3        
				Object obj1 = ((Object) (bucket.symbol));
	//  156  262:aload           7
	//  157  264:getfield        #187 <Field String CharsToNameCanonicalizer$Bucket.symbol>
	//  158  267:astore          9
				k1 = _hashToIndex(calcHash(((String) (obj1))));
	//  159  269:aload_0         
	//  160  270:aload_0         
	//  161  271:aload           9
	//  162  273:invokevirtual   #227 <Method int calcHash(String)>
	//  163  276:invokevirtual   #122 <Method int _hashToIndex(int)>
	//  164  279:istore          4
				if(_symbols[k1] == null)
	//* 165  281:aload_0         
	//* 166  282:getfield        #86  <Field String[] _symbols>
	//* 167  285:iload           4
	//* 168  287:aaload          
	//* 169  288:ifnonnull       303
				{
					_symbols[k1] = ((String) (obj1));
	//  170  291:aload_0         
	//  171  292:getfield        #86  <Field String[] _symbols>
	//  172  295:iload           4
	//  173  297:aload           9
	//  174  299:aastore         
				} else
	//* 175  300:goto            346
				{
					k1 >>= 1;
	//  176  303:iload           4
	//  177  305:iconst_1        
	//  178  306:ishr            
	//  179  307:istore          4
					obj1 = ((Object) (new Bucket(((String) (obj1)), _buckets[k1])));
	//  180  309:new             #6   <Class CharsToNameCanonicalizer$Bucket>
	//  181  312:dup             
	//  182  313:aload           9
	//  183  315:aload_0         
	//  184  316:getfield        #91  <Field CharsToNameCanonicalizer$Bucket[] _buckets>
	//  185  319:iload           4
	//  186  321:aaload          
	//  187  322:invokespecial   #143 <Method void CharsToNameCanonicalizer$Bucket(String, CharsToNameCanonicalizer$Bucket)>
	//  188  325:astore          9
					_buckets[k1] = ((Bucket) (obj1));
	//  189  327:aload_0         
	//  190  328:getfield        #91  <Field CharsToNameCanonicalizer$Bucket[] _buckets>
	//  191  331:iload           4
	//  192  333:aload           9
	//  193  335:aastore         
					l = Math.max(l, ((Bucket) (obj1)).length);
	//  194  336:iload_2         
	//  195  337:aload           9
	//  196  339:getfield        #146 <Field int CharsToNameCanonicalizer$Bucket.length>
	//  197  342:invokestatic    #156 <Method int Math.max(int, int)>
	//  198  345:istore_2        
				}
			}

	//  199  346:aload           7
	//  200  348:getfield        #166 <Field CharsToNameCanonicalizer$Bucket CharsToNameCanonicalizer$Bucket.next>
	//  201  351:astore          7
	//* 202  353:goto            253
			j++;
	//  203  356:iload_1         
	//  204  357:iconst_1        
	//  205  358:iadd            
	//  206  359:istore_1        
			k1 = l;
	//  207  360:iload_2         
	//  208  361:istore          4
		}

	//* 209  363:goto            236
		_longestCollisionList = k1;
	//  210  366:aload_0         
	//  211  367:iload           4
	//  212  369:putfield        #58  <Field int _longestCollisionList>
		_overflows = null;
	//  213  372:aload_0         
	//  214  373:aconst_null     
	//  215  374:putfield        #168 <Field BitSet _overflows>
		if(i1 != _size)
	//* 216  377:iload_3         
	//* 217  378:aload_0         
	//* 218  379:getfield        #96  <Field int _size>
	//* 219  382:icmpeq          419
			throw new IllegalStateException(String.format("Internal error on SymbolTable.rehash(): had %d entries; now have %d", new Object[] {
				Integer.valueOf(_size), Integer.valueOf(i1)
			}));
	//  220  385:new             #229 <Class IllegalStateException>
	//  221  388:dup             
	//  222  389:ldc1            #231 <String "Internal error on SymbolTable.rehash(): had %d entries; now have %d">
	//  223  391:iconst_2        
	//  224  392:anewarray       Object[]
	//  225  395:dup             
	//  226  396:iconst_0        
	//  227  397:aload_0         
	//  228  398:getfield        #96  <Field int _size>
	//  229  401:invokestatic    #237 <Method Integer Integer.valueOf(int)>
	//  230  404:aastore         
	//  231  405:dup             
	//  232  406:iconst_1        
	//  233  407:iload_3         
	//  234  408:invokestatic    #237 <Method Integer Integer.valueOf(int)>
	//  235  411:aastore         
	//  236  412:invokestatic    #241 <Method String String.format(String, Object[])>
	//  237  415:invokespecial   #244 <Method void IllegalStateException(String)>
	//  238  418:athrow          
		else
			return;
	//  239  419:return          
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
	//   18   20:getfield        #107 <Field int _indexMask>
	//   19   23:iand            
	//   20   24:ireturn         
	}

	public int bucketCount()
	{
		return _symbols.length;
	//    0    0:aload_0         
	//    1    1:getfield        #86  <Field String[] _symbols>
	//    2    4:arraylength     
	//    3    5:ireturn         
	}

	public int calcHash(String s)
	{
		int l = s.length();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #248 <Method int String.length()>
	//    2    4:istore          4
		int i = _seed;
	//    3    6:aload_0         
	//    4    7:getfield        #50  <Field int _seed>
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
	//   16   25:invokevirtual   #252 <Method char String.charAt(int)>
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
	//    1    1:getfield        #50  <Field int _seed>
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

	public int collisionCount()
	{
		Bucket abucket[] = _buckets;
	//    0    0:aload_0         
	//    1    1:getfield        #91  <Field CharsToNameCanonicalizer$Bucket[] _buckets>
	//    2    4:astore          5
		int i = 0;
	//    3    6:iconst_0        
	//    4    7:istore_1        
		int l = abucket.length;
	//    5    8:aload           5
	//    6   10:arraylength     
	//    7   11:istore          4
		int j;
		int k;
		for(j = 0; i < l; j = k)
	//*   8   13:iconst_0        
	//*   9   14:istore_2        
	//*  10   15:iload_1         
	//*  11   16:iload           4
	//*  12   18:icmpge          51
		{
			Bucket bucket = abucket[i];
	//   13   21:aload           5
	//   14   23:iload_1         
	//   15   24:aaload          
	//   16   25:astore          6
			k = j;
	//   17   27:iload_2         
	//   18   28:istore_3        
			if(bucket != null)
	//*  19   29:aload           6
	//*  20   31:ifnull          42
				k = j + bucket.length;
	//   21   34:iload_2         
	//   22   35:aload           6
	//   23   37:getfield        #146 <Field int CharsToNameCanonicalizer$Bucket.length>
	//   24   40:iadd            
	//   25   41:istore_3        
			i++;
	//   26   42:iload_1         
	//   27   43:iconst_1        
	//   28   44:iadd            
	//   29   45:istore_1        
		}

	//   30   46:iload_3         
	//   31   47:istore_2        
	//*  32   48:goto            15
		return j;
	//   33   51:iload_2         
	//   34   52:ireturn         
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
	//*   2    2:icmpge          9
					return "";
	//    3    5:ldc2            #257 <String "">
	//    4    8:areturn         
				if(!_canonicalize)
	//*   5    9:aload_0         
	//*   6   10:getfield        #52  <Field boolean _canonicalize>
	//*   7   13:ifne            27
					return new String(ac, i, j);
	//    8   16:new             #124 <Class String>
	//    9   19:dup             
	//   10   20:aload_1         
	//   11   21:iload_2         
	//   12   22:iload_3         
	//   13   23:invokespecial   #127 <Method void String(char[], int, int)>
	//   14   26:areturn         
				j1 = _hashToIndex(k);
	//   15   27:aload_0         
	//   16   28:iload           4
	//   17   30:invokevirtual   #122 <Method int _hashToIndex(int)>
	//   18   33:istore          7
				String s = _symbols[j1];
	//   19   35:aload_0         
	//   20   36:getfield        #86  <Field String[] _symbols>
	//   21   39:iload           7
	//   22   41:aaload          
	//   23   42:astore          8
				if(s == null)
					break label0;
	//   24   44:aload           8
	//   25   46:ifnull          152
				if(s.length() != j)
					break label1;
	//   26   49:aload           8
	//   27   51:invokevirtual   #248 <Method int String.length()>
	//   28   54:iload_3         
	//   29   55:icmpne          96
				int l = 0;
	//   30   58:iconst_0        
	//   31   59:istore          5
				int i1;
				do
				{
					if(s.charAt(l) != ac[i + l])
						break label1;
	//   32   61:aload           8
	//   33   63:iload           5
	//   34   65:invokevirtual   #252 <Method char String.charAt(int)>
	//   35   68:aload_1         
	//   36   69:iload_2         
	//   37   70:iload           5
	//   38   72:iadd            
	//   39   73:caload          
	//   40   74:icmpne          96
					i1 = l + 1;
	//   41   77:iload           5
	//   42   79:iconst_1        
	//   43   80:iadd            
	//   44   81:istore          6
					l = i1;
	//   45   83:iload           6
	//   46   85:istore          5
				} while(i1 != j);
	//   47   87:iload           6
	//   48   89:iload_3         
	//   49   90:icmpne          61
				return s;
	//   50   93:aload           8
	//   51   95:areturn         
			}
			Object obj = ((Object) (_buckets[j1 >> 1]));
	//   52   96:aload_0         
	//   53   97:getfield        #91  <Field CharsToNameCanonicalizer$Bucket[] _buckets>
	//   54  100:iload           7
	//   55  102:iconst_1        
	//   56  103:ishr            
	//   57  104:aaload          
	//   58  105:astore          8
			if(obj != null)
	//*  59  107:aload           8
	//*  60  109:ifnull          152
			{
				String s1 = ((Bucket) (obj)).has(ac, i, j);
	//   61  112:aload           8
	//   62  114:aload_1         
	//   63  115:iload_2         
	//   64  116:iload_3         
	//   65  117:invokevirtual   #162 <Method String CharsToNameCanonicalizer$Bucket.has(char[], int, int)>
	//   66  120:astore          9
				if(s1 != null)
	//*  67  122:aload           9
	//*  68  124:ifnull          130
					return s1;
	//   69  127:aload           9
	//   70  129:areturn         
				obj = ((Object) (_findSymbol2(ac, i, j, ((Bucket) (obj)).next)));
	//   71  130:aload_0         
	//   72  131:aload_1         
	//   73  132:iload_2         
	//   74  133:iload_3         
	//   75  134:aload           8
	//   76  136:getfield        #166 <Field CharsToNameCanonicalizer$Bucket CharsToNameCanonicalizer$Bucket.next>
	//   77  139:invokespecial   #259 <Method String _findSymbol2(char[], int, int, CharsToNameCanonicalizer$Bucket)>
	//   78  142:astore          8
				if(obj != null)
	//*  79  144:aload           8
	//*  80  146:ifnull          152
					return ((String) (obj));
	//   81  149:aload           8
	//   82  151:areturn         
			}
		}
		return _addSymbol(ac, i, j, k, j1);
	//   83  152:aload_0         
	//   84  153:aload_1         
	//   85  154:iload_2         
	//   86  155:iload_3         
	//   87  156:iload           4
	//   88  158:iload           7
	//   89  160:invokespecial   #261 <Method String _addSymbol(char[], int, int, int, int)>
	//   90  163:areturn         
	}

	public int hashSeed()
	{
		return _seed;
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field int _seed>
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
	//    5    7:getfield        #50  <Field int _seed>
	//    6   10:aload_0         
	//    7   11:getfield        #69  <Field AtomicReference _tableInfo>
	//    8   14:invokevirtual   #220 <Method Object AtomicReference.get()>
	//    9   17:checkcast       #9   <Class CharsToNameCanonicalizer$TableInfo>
	//   10   20:invokespecial   #265 <Method void CharsToNameCanonicalizer(CharsToNameCanonicalizer, int, int, CharsToNameCanonicalizer$TableInfo)>
	//   11   23:areturn         
	}

	public int maxCollisionLength()
	{
		return _longestCollisionList;
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field int _longestCollisionList>
	//    2    4:ireturn         
	}

	public boolean maybeDirty()
	{
		return _hashShared ^ true;
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field boolean _hashShared>
	//    2    4:iconst_1        
	//    3    5:ixor            
	//    4    6:ireturn         
	}

	public void release()
	{
		if(!maybeDirty())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #271 <Method boolean maybeDirty()>
	//*   2    4:ifne            8
			return;
	//    3    7:return          
		if(_parent != null && _canonicalize)
	//*   4    8:aload_0         
	//*   5    9:getfield        #48  <Field CharsToNameCanonicalizer _parent>
	//*   6   12:ifnull          42
	//*   7   15:aload_0         
	//*   8   16:getfield        #52  <Field boolean _canonicalize>
	//*   9   19:ifeq            42
		{
			_parent.mergeChild(new TableInfo(this));
	//   10   22:aload_0         
	//   11   23:getfield        #48  <Field CharsToNameCanonicalizer _parent>
	//   12   26:new             #9   <Class CharsToNameCanonicalizer$TableInfo>
	//   13   29:dup             
	//   14   30:aload_0         
	//   15   31:invokespecial   #274 <Method void CharsToNameCanonicalizer$TableInfo(CharsToNameCanonicalizer)>
	//   16   34:invokespecial   #276 <Method void mergeChild(CharsToNameCanonicalizer$TableInfo)>
			_hashShared = true;
	//   17   37:aload_0         
	//   18   38:iconst_1        
	//   19   39:putfield        #56  <Field boolean _hashShared>
		}
	//   20   42:return          
	}

	protected void reportTooManyCollisions(int i)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #278 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #279 <Method void StringBuilder()>
	//    3    7:astore_2        
		stringbuilder.append("Longest collision chain in symbol table (of size ");
	//    4    8:aload_2         
	//    5    9:ldc2            #281 <String "Longest collision chain in symbol table (of size ">
	//    6   12:invokevirtual   #285 <Method StringBuilder StringBuilder.append(String)>
	//    7   15:pop             
		stringbuilder.append(_size);
	//    8   16:aload_2         
	//    9   17:aload_0         
	//   10   18:getfield        #96  <Field int _size>
	//   11   21:invokevirtual   #288 <Method StringBuilder StringBuilder.append(int)>
	//   12   24:pop             
		stringbuilder.append(") now exceeds maximum, ");
	//   13   25:aload_2         
	//   14   26:ldc2            #290 <String ") now exceeds maximum, ">
	//   15   29:invokevirtual   #285 <Method StringBuilder StringBuilder.append(String)>
	//   16   32:pop             
		stringbuilder.append(i);
	//   17   33:aload_2         
	//   18   34:iload_1         
	//   19   35:invokevirtual   #288 <Method StringBuilder StringBuilder.append(int)>
	//   20   38:pop             
		stringbuilder.append(" -- suspect a DoS attack based on hash collisions");
	//   21   39:aload_2         
	//   22   40:ldc2            #292 <String " -- suspect a DoS attack based on hash collisions">
	//   23   43:invokevirtual   #285 <Method StringBuilder StringBuilder.append(String)>
	//   24   46:pop             
		throw new IllegalStateException(stringbuilder.toString());
	//   25   47:new             #229 <Class IllegalStateException>
	//   26   50:dup             
	//   27   51:aload_2         
	//   28   52:invokevirtual   #296 <Method String StringBuilder.toString()>
	//   29   55:invokespecial   #244 <Method void IllegalStateException(String)>
	//   30   58:athrow          
	}

	public int size()
	{
		if(_tableInfo != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #69  <Field AtomicReference _tableInfo>
	//*   2    4:ifnull          21
			return ((TableInfo)_tableInfo.get()).size;
	//    3    7:aload_0         
	//    4    8:getfield        #69  <Field AtomicReference _tableInfo>
	//    5   11:invokevirtual   #220 <Method Object AtomicReference.get()>
	//    6   14:checkcast       #9   <Class CharsToNameCanonicalizer$TableInfo>
	//    7   17:getfield        #94  <Field int CharsToNameCanonicalizer$TableInfo.size>
	//    8   20:ireturn         
		else
			return _size;
	//    9   21:aload_0         
	//   10   22:getfield        #96  <Field int _size>
	//   11   25:ireturn         
	}

	private static final int DEFAULT_T_SIZE = 64;
	public static final int HASH_MULT = 33;
	static final int MAX_COLL_CHAIN_LENGTH = 100;
	static final int MAX_ENTRIES_FOR_REUSE = 12000;
	private static final int MAX_T_SIZE = 0x10000;
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
	//    1    1:getfield        #96  <Field int _size>
	//    2    4:ireturn         
	}

*/


/*
	static int access$100(CharsToNameCanonicalizer charstonamecanonicalizer)
	{
		return charstonamecanonicalizer._longestCollisionList;
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field int _longestCollisionList>
	//    2    4:ireturn         
	}

*/


/*
	static String[] access$200(CharsToNameCanonicalizer charstonamecanonicalizer)
	{
		return charstonamecanonicalizer._symbols;
	//    0    0:aload_0         
	//    1    1:getfield        #86  <Field String[] _symbols>
	//    2    4:areturn         
	}

*/


/*
	static Bucket[] access$300(CharsToNameCanonicalizer charstonamecanonicalizer)
	{
		return charstonamecanonicalizer._buckets;
	//    0    0:aload_0         
	//    1    1:getfield        #91  <Field CharsToNameCanonicalizer$Bucket[] _buckets>
	//    2    4:areturn         
	}

*/
}
