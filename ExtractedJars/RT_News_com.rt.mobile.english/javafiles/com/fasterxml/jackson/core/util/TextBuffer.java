// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.core.util;

import com.fasterxml.jackson.core.io.NumberInput;
import java.io.IOException;
import java.io.Writer;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;

// Referenced classes of package com.fasterxml.jackson.core.util:
//			BufferRecycler

public final class TextBuffer
{

	public TextBuffer(BufferRecycler bufferrecycler)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #36  <Method void Object()>
		_allocator = bufferrecycler;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #38  <Field BufferRecycler _allocator>
	//    5    9:return          
	}

	private char[] buf(int i)
	{
		if(_allocator != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #38  <Field BufferRecycler _allocator>
	//*   2    4:ifnull          17
			return _allocator.allocCharBuffer(2, i);
	//    3    7:aload_0         
	//    4    8:getfield        #38  <Field BufferRecycler _allocator>
	//    5   11:iconst_2        
	//    6   12:iload_1         
	//    7   13:invokevirtual   #46  <Method char[] BufferRecycler.allocCharBuffer(int, int)>
	//    8   16:areturn         
		else
			return new char[Math.max(i, 1000)];
	//    9   17:iload_1         
	//   10   18:sipush          1000
	//   11   21:invokestatic    #52  <Method int Math.max(int, int)>
	//   12   24:newarray        char[]
	//   13   26:areturn         
	}

	private char[] carr(int i)
	{
		return new char[i];
	//    0    0:iload_1         
	//    1    1:newarray        char[]
	//    2    3:areturn         
	}

	private void clearSegments()
	{
		_hasSegments = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #56  <Field boolean _hasSegments>
		_segments.clear();
	//    3    5:aload_0         
	//    4    6:getfield        #58  <Field ArrayList _segments>
	//    5    9:invokevirtual   #63  <Method void ArrayList.clear()>
		_segmentSize = 0;
	//    6   12:aload_0         
	//    7   13:iconst_0        
	//    8   14:putfield        #65  <Field int _segmentSize>
		_currentSize = 0;
	//    9   17:aload_0         
	//   10   18:iconst_0        
	//   11   19:putfield        #67  <Field int _currentSize>
	//   12   22:return          
	}

	private void expand(int i)
	{
		if(_segments == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #58  <Field ArrayList _segments>
	//*   2    4:ifnonnull       18
			_segments = new ArrayList();
	//    3    7:aload_0         
	//    4    8:new             #60  <Class ArrayList>
	//    5   11:dup             
	//    6   12:invokespecial   #70  <Method void ArrayList()>
	//    7   15:putfield        #58  <Field ArrayList _segments>
		char ac[] = _currentSegment;
	//    8   18:aload_0         
	//    9   19:getfield        #72  <Field char[] _currentSegment>
	//   10   22:astore_3        
		_hasSegments = true;
	//   11   23:aload_0         
	//   12   24:iconst_1        
	//   13   25:putfield        #56  <Field boolean _hasSegments>
		_segments.add(((Object) (ac)));
	//   14   28:aload_0         
	//   15   29:getfield        #58  <Field ArrayList _segments>
	//   16   32:aload_3         
	//   17   33:invokevirtual   #76  <Method boolean ArrayList.add(Object)>
	//   18   36:pop             
		_segmentSize = _segmentSize + ac.length;
	//   19   37:aload_0         
	//   20   38:aload_0         
	//   21   39:getfield        #65  <Field int _segmentSize>
	//   22   42:aload_3         
	//   23   43:arraylength     
	//   24   44:iadd            
	//   25   45:putfield        #65  <Field int _segmentSize>
		_currentSize = 0;
	//   26   48:aload_0         
	//   27   49:iconst_0        
	//   28   50:putfield        #67  <Field int _currentSize>
		i = ac.length;
	//   29   53:aload_3         
	//   30   54:arraylength     
	//   31   55:istore_1        
		int j = i + (i >> 1);
	//   32   56:iload_1         
	//   33   57:iload_1         
	//   34   58:iconst_1        
	//   35   59:ishr            
	//   36   60:iadd            
	//   37   61:istore_2        
		if(j < 1000)
	//*  38   62:iload_2         
	//*  39   63:sipush          1000
	//*  40   66:icmpge          76
		{
			i = 1000;
	//   41   69:sipush          1000
	//   42   72:istore_1        
		} else
	//*  43   73:goto            87
		{
			i = j;
	//   44   76:iload_2         
	//   45   77:istore_1        
			if(j > 0x40000)
	//*  46   78:iload_2         
	//*  47   79:ldc1            #7   <Int 0x40000>
	//*  48   81:icmple          87
				i = 0x40000;
	//   49   84:ldc1            #7   <Int 0x40000>
	//   50   86:istore_1        
		}
		_currentSegment = carr(i);
	//   51   87:aload_0         
	//   52   88:aload_0         
	//   53   89:iload_1         
	//   54   90:invokespecial   #78  <Method char[] carr(int)>
	//   55   93:putfield        #72  <Field char[] _currentSegment>
	//   56   96:return          
	}

	private char[] resultArray()
	{
		if(_resultString != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #82  <Field String _resultString>
	//*   2    4:ifnull          15
			return _resultString.toCharArray();
	//    3    7:aload_0         
	//    4    8:getfield        #82  <Field String _resultString>
	//    5   11:invokevirtual   #87  <Method char[] String.toCharArray()>
	//    6   14:areturn         
		if(_inputStart >= 0)
	//*   7   15:aload_0         
	//*   8   16:getfield        #89  <Field int _inputStart>
	//*   9   19:iflt            66
		{
			int i = _inputLen;
	//   10   22:aload_0         
	//   11   23:getfield        #91  <Field int _inputLen>
	//   12   26:istore_1        
			if(i < 1)
	//*  13   27:iload_1         
	//*  14   28:iconst_1        
	//*  15   29:icmpge          36
				return NO_CHARS;
	//   16   32:getstatic       #31  <Field char[] NO_CHARS>
	//   17   35:areturn         
			int l = _inputStart;
	//   18   36:aload_0         
	//   19   37:getfield        #89  <Field int _inputStart>
	//   20   40:istore_2        
			if(l == 0)
	//*  21   41:iload_2         
	//*  22   42:ifne            54
				return Arrays.copyOf(_inputBuffer, i);
	//   23   45:aload_0         
	//   24   46:getfield        #93  <Field char[] _inputBuffer>
	//   25   49:iload_1         
	//   26   50:invokestatic    #99  <Method char[] Arrays.copyOf(char[], int)>
	//   27   53:areturn         
			else
				return Arrays.copyOfRange(_inputBuffer, l, i + l);
	//   28   54:aload_0         
	//   29   55:getfield        #93  <Field char[] _inputBuffer>
	//   30   58:iload_2         
	//   31   59:iload_1         
	//   32   60:iload_2         
	//   33   61:iadd            
	//   34   62:invokestatic    #103 <Method char[] Arrays.copyOfRange(char[], int, int)>
	//   35   65:areturn         
		}
		int j = size();
	//   36   66:aload_0         
	//   37   67:invokevirtual   #107 <Method int size()>
	//   38   70:istore_1        
		if(j < 1)
	//*  39   71:iload_1         
	//*  40   72:iconst_1        
	//*  41   73:icmpge          80
			return NO_CHARS;
	//   42   76:getstatic       #31  <Field char[] NO_CHARS>
	//   43   79:areturn         
		char ac[] = carr(j);
	//   44   80:aload_0         
	//   45   81:iload_1         
	//   46   82:invokespecial   #78  <Method char[] carr(int)>
	//   47   85:astore          5
		int j1;
		if(_segments != null)
	//*  48   87:aload_0         
	//*  49   88:getfield        #58  <Field ArrayList _segments>
	//*  50   91:ifnull          153
		{
			int k1 = _segments.size();
	//   51   94:aload_0         
	//   52   95:getfield        #58  <Field ArrayList _segments>
	//   53   98:invokevirtual   #108 <Method int ArrayList.size()>
	//   54  101:istore          4
			int i1 = 0;
	//   55  103:iconst_0        
	//   56  104:istore_2        
			int k = i1;
	//   57  105:iload_2         
	//   58  106:istore_1        
			do
			{
				j1 = k;
	//   59  107:iload_1         
	//   60  108:istore_3        
				if(i1 >= k1)
					break;
	//   61  109:iload_2         
	//   62  110:iload           4
	//   63  112:icmpge          155
				char ac1[] = (char[])_segments.get(i1);
	//   64  115:aload_0         
	//   65  116:getfield        #58  <Field ArrayList _segments>
	//   66  119:iload_2         
	//   67  120:invokevirtual   #112 <Method Object ArrayList.get(int)>
	//   68  123:checkcast       #113 <Class char[]>
	//   69  126:astore          6
				j1 = ac1.length;
	//   70  128:aload           6
	//   71  130:arraylength     
	//   72  131:istore_3        
				System.arraycopy(((Object) (ac1)), 0, ((Object) (ac)), k, j1);
	//   73  132:aload           6
	//   74  134:iconst_0        
	//   75  135:aload           5
	//   76  137:iload_1         
	//   77  138:iload_3         
	//   78  139:invokestatic    #119 <Method void System.arraycopy(Object, int, Object, int, int)>
				k += j1;
	//   79  142:iload_1         
	//   80  143:iload_3         
	//   81  144:iadd            
	//   82  145:istore_1        
				i1++;
	//   83  146:iload_2         
	//   84  147:iconst_1        
	//   85  148:iadd            
	//   86  149:istore_2        
			} while(true);
	//   87  150:goto            107
		} else
		{
			j1 = 0;
	//   88  153:iconst_0        
	//   89  154:istore_3        
		}
		System.arraycopy(((Object) (_currentSegment)), 0, ((Object) (ac)), j1, _currentSize);
	//   90  155:aload_0         
	//   91  156:getfield        #72  <Field char[] _currentSegment>
	//   92  159:iconst_0        
	//   93  160:aload           5
	//   94  162:iload_3         
	//   95  163:aload_0         
	//   96  164:getfield        #67  <Field int _currentSize>
	//   97  167:invokestatic    #119 <Method void System.arraycopy(Object, int, Object, int, int)>
		return ac;
	//   98  170:aload           5
	//   99  172:areturn         
	}

	private void unshare(int i)
	{
		int j = _inputLen;
	//    0    0:aload_0         
	//    1    1:getfield        #91  <Field int _inputLen>
	//    2    4:istore_2        
		_inputLen = 0;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #91  <Field int _inputLen>
		char ac[] = _inputBuffer;
	//    6   10:aload_0         
	//    7   11:getfield        #93  <Field char[] _inputBuffer>
	//    8   14:astore          4
		_inputBuffer = null;
	//    9   16:aload_0         
	//   10   17:aconst_null     
	//   11   18:putfield        #93  <Field char[] _inputBuffer>
		int k = _inputStart;
	//   12   21:aload_0         
	//   13   22:getfield        #89  <Field int _inputStart>
	//   14   25:istore_3        
		_inputStart = -1;
	//   15   26:aload_0         
	//   16   27:iconst_m1       
	//   17   28:putfield        #89  <Field int _inputStart>
		i += j;
	//   18   31:iload_1         
	//   19   32:iload_2         
	//   20   33:iadd            
	//   21   34:istore_1        
		if(_currentSegment == null || i > _currentSegment.length)
	//*  22   35:aload_0         
	//*  23   36:getfield        #72  <Field char[] _currentSegment>
	//*  24   39:ifnull          51
	//*  25   42:iload_1         
	//*  26   43:aload_0         
	//*  27   44:getfield        #72  <Field char[] _currentSegment>
	//*  28   47:arraylength     
	//*  29   48:icmple          60
			_currentSegment = buf(i);
	//   30   51:aload_0         
	//   31   52:aload_0         
	//   32   53:iload_1         
	//   33   54:invokespecial   #122 <Method char[] buf(int)>
	//   34   57:putfield        #72  <Field char[] _currentSegment>
		if(j > 0)
	//*  35   60:iload_2         
	//*  36   61:ifle            76
			System.arraycopy(((Object) (ac)), k, ((Object) (_currentSegment)), 0, j);
	//   37   64:aload           4
	//   38   66:iload_3         
	//   39   67:aload_0         
	//   40   68:getfield        #72  <Field char[] _currentSegment>
	//   41   71:iconst_0        
	//   42   72:iload_2         
	//   43   73:invokestatic    #119 <Method void System.arraycopy(Object, int, Object, int, int)>
		_segmentSize = 0;
	//   44   76:aload_0         
	//   45   77:iconst_0        
	//   46   78:putfield        #65  <Field int _segmentSize>
		_currentSize = j;
	//   47   81:aload_0         
	//   48   82:iload_2         
	//   49   83:putfield        #67  <Field int _currentSize>
	//   50   86:return          
	}

	public void append(char c)
	{
		if(_inputStart >= 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #89  <Field int _inputStart>
	//*   2    4:iflt            13
			unshare(16);
	//    3    7:aload_0         
	//    4    8:bipush          16
	//    5   10:invokespecial   #126 <Method void unshare(int)>
		_resultString = null;
	//    6   13:aload_0         
	//    7   14:aconst_null     
	//    8   15:putfield        #82  <Field String _resultString>
		_resultArray = null;
	//    9   18:aload_0         
	//   10   19:aconst_null     
	//   11   20:putfield        #128 <Field char[] _resultArray>
		char ac1[] = _currentSegment;
	//   12   23:aload_0         
	//   13   24:getfield        #72  <Field char[] _currentSegment>
	//   14   27:astore          4
		char ac[] = ac1;
	//   15   29:aload           4
	//   16   31:astore_3        
		if(_currentSize >= ac1.length)
	//*  17   32:aload_0         
	//*  18   33:getfield        #67  <Field int _currentSize>
	//*  19   36:aload           4
	//*  20   38:arraylength     
	//*  21   39:icmplt          52
		{
			expand(1);
	//   22   42:aload_0         
	//   23   43:iconst_1        
	//   24   44:invokespecial   #130 <Method void expand(int)>
			ac = _currentSegment;
	//   25   47:aload_0         
	//   26   48:getfield        #72  <Field char[] _currentSegment>
	//   27   51:astore_3        
		}
		int i = _currentSize;
	//   28   52:aload_0         
	//   29   53:getfield        #67  <Field int _currentSize>
	//   30   56:istore_2        
		_currentSize = i + 1;
	//   31   57:aload_0         
	//   32   58:iload_2         
	//   33   59:iconst_1        
	//   34   60:iadd            
	//   35   61:putfield        #67  <Field int _currentSize>
		ac[i] = c;
	//   36   64:aload_3         
	//   37   65:iload_2         
	//   38   66:iload_1         
	//   39   67:castore         
	//   40   68:return          
	}

	public void append(String s, int i, int j)
	{
		if(_inputStart >= 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #89  <Field int _inputStart>
	//*   2    4:iflt            12
			unshare(j);
	//    3    7:aload_0         
	//    4    8:iload_3         
	//    5    9:invokespecial   #126 <Method void unshare(int)>
		_resultString = null;
	//    6   12:aload_0         
	//    7   13:aconst_null     
	//    8   14:putfield        #82  <Field String _resultString>
		_resultArray = null;
	//    9   17:aload_0         
	//   10   18:aconst_null     
	//   11   19:putfield        #128 <Field char[] _resultArray>
		char ac[] = _currentSegment;
	//   12   22:aload_0         
	//   13   23:getfield        #72  <Field char[] _currentSegment>
	//   14   26:astore          7
		int i1 = ac.length - _currentSize;
	//   15   28:aload           7
	//   16   30:arraylength     
	//   17   31:aload_0         
	//   18   32:getfield        #67  <Field int _currentSize>
	//   19   35:isub            
	//   20   36:istore          6
		if(i1 >= j)
	//*  21   38:iload           6
	//*  22   40:iload_3         
	//*  23   41:icmplt          69
		{
			s.getChars(i, i + j, ac, _currentSize);
	//   24   44:aload_1         
	//   25   45:iload_2         
	//   26   46:iload_2         
	//   27   47:iload_3         
	//   28   48:iadd            
	//   29   49:aload           7
	//   30   51:aload_0         
	//   31   52:getfield        #67  <Field int _currentSize>
	//   32   55:invokevirtual   #135 <Method void String.getChars(int, int, char[], int)>
			_currentSize = _currentSize + j;
	//   33   58:aload_0         
	//   34   59:aload_0         
	//   35   60:getfield        #67  <Field int _currentSize>
	//   36   63:iload_3         
	//   37   64:iadd            
	//   38   65:putfield        #67  <Field int _currentSize>
			return;
	//   39   68:return          
		}
		int k = i;
	//   40   69:iload_2         
	//   41   70:istore          4
		int l = j;
	//   42   72:iload_3         
	//   43   73:istore          5
		if(i1 > 0)
	//*  44   75:iload           6
	//*  45   77:ifle            105
		{
			k = i + i1;
	//   46   80:iload_2         
	//   47   81:iload           6
	//   48   83:iadd            
	//   49   84:istore          4
			s.getChars(i, k, ac, _currentSize);
	//   50   86:aload_1         
	//   51   87:iload_2         
	//   52   88:iload           4
	//   53   90:aload           7
	//   54   92:aload_0         
	//   55   93:getfield        #67  <Field int _currentSize>
	//   56   96:invokevirtual   #135 <Method void String.getChars(int, int, char[], int)>
			l = j - i1;
	//   57   99:iload_3         
	//   58  100:iload           6
	//   59  102:isub            
	//   60  103:istore          5
		}
		do
		{
			expand(l);
	//   61  105:aload_0         
	//   62  106:iload           5
	//   63  108:invokespecial   #130 <Method void expand(int)>
			j = Math.min(_currentSegment.length, l);
	//   64  111:aload_0         
	//   65  112:getfield        #72  <Field char[] _currentSegment>
	//   66  115:arraylength     
	//   67  116:iload           5
	//   68  118:invokestatic    #138 <Method int Math.min(int, int)>
	//   69  121:istore_3        
			i = k + j;
	//   70  122:iload           4
	//   71  124:iload_3         
	//   72  125:iadd            
	//   73  126:istore_2        
			s.getChars(k, i, _currentSegment, 0);
	//   74  127:aload_1         
	//   75  128:iload           4
	//   76  130:iload_2         
	//   77  131:aload_0         
	//   78  132:getfield        #72  <Field char[] _currentSegment>
	//   79  135:iconst_0        
	//   80  136:invokevirtual   #135 <Method void String.getChars(int, int, char[], int)>
			_currentSize = _currentSize + j;
	//   81  139:aload_0         
	//   82  140:aload_0         
	//   83  141:getfield        #67  <Field int _currentSize>
	//   84  144:iload_3         
	//   85  145:iadd            
	//   86  146:putfield        #67  <Field int _currentSize>
			l -= j;
	//   87  149:iload           5
	//   88  151:iload_3         
	//   89  152:isub            
	//   90  153:istore          5
			if(l <= 0)
	//*  91  155:iload           5
	//*  92  157:ifgt            161
				return;
	//   93  160:return          
			k = i;
	//   94  161:iload_2         
	//   95  162:istore          4
		} while(true);
	//   96  164:goto            105
	}

	public void append(char ac[], int i, int j)
	{
		if(_inputStart >= 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #89  <Field int _inputStart>
	//*   2    4:iflt            12
			unshare(j);
	//    3    7:aload_0         
	//    4    8:iload_3         
	//    5    9:invokespecial   #126 <Method void unshare(int)>
		_resultString = null;
	//    6   12:aload_0         
	//    7   13:aconst_null     
	//    8   14:putfield        #82  <Field String _resultString>
		_resultArray = null;
	//    9   17:aload_0         
	//   10   18:aconst_null     
	//   11   19:putfield        #128 <Field char[] _resultArray>
		char ac1[] = _currentSegment;
	//   12   22:aload_0         
	//   13   23:getfield        #72  <Field char[] _currentSegment>
	//   14   26:astore          7
		int i1 = ac1.length - _currentSize;
	//   15   28:aload           7
	//   16   30:arraylength     
	//   17   31:aload_0         
	//   18   32:getfield        #67  <Field int _currentSize>
	//   19   35:isub            
	//   20   36:istore          6
		if(i1 >= j)
	//*  21   38:iload           6
	//*  22   40:iload_3         
	//*  23   41:icmplt          67
		{
			System.arraycopy(((Object) (ac)), i, ((Object) (ac1)), _currentSize, j);
	//   24   44:aload_1         
	//   25   45:iload_2         
	//   26   46:aload           7
	//   27   48:aload_0         
	//   28   49:getfield        #67  <Field int _currentSize>
	//   29   52:iload_3         
	//   30   53:invokestatic    #119 <Method void System.arraycopy(Object, int, Object, int, int)>
			_currentSize = _currentSize + j;
	//   31   56:aload_0         
	//   32   57:aload_0         
	//   33   58:getfield        #67  <Field int _currentSize>
	//   34   61:iload_3         
	//   35   62:iadd            
	//   36   63:putfield        #67  <Field int _currentSize>
			return;
	//   37   66:return          
		}
		int l = i;
	//   38   67:iload_2         
	//   39   68:istore          5
		int k = j;
	//   40   70:iload_3         
	//   41   71:istore          4
		if(i1 > 0)
	//*  42   73:iload           6
	//*  43   75:ifle            103
		{
			System.arraycopy(((Object) (ac)), i, ((Object) (ac1)), _currentSize, i1);
	//   44   78:aload_1         
	//   45   79:iload_2         
	//   46   80:aload           7
	//   47   82:aload_0         
	//   48   83:getfield        #67  <Field int _currentSize>
	//   49   86:iload           6
	//   50   88:invokestatic    #119 <Method void System.arraycopy(Object, int, Object, int, int)>
			l = i + i1;
	//   51   91:iload_2         
	//   52   92:iload           6
	//   53   94:iadd            
	//   54   95:istore          5
			k = j - i1;
	//   55   97:iload_3         
	//   56   98:iload           6
	//   57  100:isub            
	//   58  101:istore          4
		}
		do
		{
			expand(k);
	//   59  103:aload_0         
	//   60  104:iload           4
	//   61  106:invokespecial   #130 <Method void expand(int)>
			i = Math.min(_currentSegment.length, k);
	//   62  109:aload_0         
	//   63  110:getfield        #72  <Field char[] _currentSegment>
	//   64  113:arraylength     
	//   65  114:iload           4
	//   66  116:invokestatic    #138 <Method int Math.min(int, int)>
	//   67  119:istore_2        
			System.arraycopy(((Object) (ac)), l, ((Object) (_currentSegment)), 0, i);
	//   68  120:aload_1         
	//   69  121:iload           5
	//   70  123:aload_0         
	//   71  124:getfield        #72  <Field char[] _currentSegment>
	//   72  127:iconst_0        
	//   73  128:iload_2         
	//   74  129:invokestatic    #119 <Method void System.arraycopy(Object, int, Object, int, int)>
			_currentSize = _currentSize + i;
	//   75  132:aload_0         
	//   76  133:aload_0         
	//   77  134:getfield        #67  <Field int _currentSize>
	//   78  137:iload_2         
	//   79  138:iadd            
	//   80  139:putfield        #67  <Field int _currentSize>
			l += i;
	//   81  142:iload           5
	//   82  144:iload_2         
	//   83  145:iadd            
	//   84  146:istore          5
			i = k - i;
	//   85  148:iload           4
	//   86  150:iload_2         
	//   87  151:isub            
	//   88  152:istore_2        
			k = i;
	//   89  153:iload_2         
	//   90  154:istore          4
		} while(i > 0);
	//   91  156:iload_2         
	//   92  157:ifgt            103
	//   93  160:return          
	}

	public char[] contentsAsArray()
	{
		char ac1[] = _resultArray;
	//    0    0:aload_0         
	//    1    1:getfield        #128 <Field char[] _resultArray>
	//    2    4:astore_2        
		char ac[] = ac1;
	//    3    5:aload_2         
	//    4    6:astore_1        
		if(ac1 == null)
	//*   5    7:aload_2         
	//*   6    8:ifnonnull       21
		{
			ac = resultArray();
	//    7   11:aload_0         
	//    8   12:invokespecial   #142 <Method char[] resultArray()>
	//    9   15:astore_1        
			_resultArray = ac;
	//   10   16:aload_0         
	//   11   17:aload_1         
	//   12   18:putfield        #128 <Field char[] _resultArray>
		}
		return ac;
	//   13   21:aload_1         
	//   14   22:areturn         
	}

	public BigDecimal contentsAsDecimal()
		throws NumberFormatException
	{
		if(_resultArray != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #128 <Field char[] _resultArray>
	//*   2    4:ifnull          15
			return NumberInput.parseBigDecimal(_resultArray);
	//    3    7:aload_0         
	//    4    8:getfield        #128 <Field char[] _resultArray>
	//    5   11:invokestatic    #152 <Method BigDecimal NumberInput.parseBigDecimal(char[])>
	//    6   14:areturn         
		if(_inputStart >= 0 && _inputBuffer != null)
	//*   7   15:aload_0         
	//*   8   16:getfield        #89  <Field int _inputStart>
	//*   9   19:iflt            45
	//*  10   22:aload_0         
	//*  11   23:getfield        #93  <Field char[] _inputBuffer>
	//*  12   26:ifnull          45
			return NumberInput.parseBigDecimal(_inputBuffer, _inputStart, _inputLen);
	//   13   29:aload_0         
	//   14   30:getfield        #93  <Field char[] _inputBuffer>
	//   15   33:aload_0         
	//   16   34:getfield        #89  <Field int _inputStart>
	//   17   37:aload_0         
	//   18   38:getfield        #91  <Field int _inputLen>
	//   19   41:invokestatic    #155 <Method BigDecimal NumberInput.parseBigDecimal(char[], int, int)>
	//   20   44:areturn         
		if(_segmentSize == 0 && _currentSegment != null)
	//*  21   45:aload_0         
	//*  22   46:getfield        #65  <Field int _segmentSize>
	//*  23   49:ifne            72
	//*  24   52:aload_0         
	//*  25   53:getfield        #72  <Field char[] _currentSegment>
	//*  26   56:ifnull          72
			return NumberInput.parseBigDecimal(_currentSegment, 0, _currentSize);
	//   27   59:aload_0         
	//   28   60:getfield        #72  <Field char[] _currentSegment>
	//   29   63:iconst_0        
	//   30   64:aload_0         
	//   31   65:getfield        #67  <Field int _currentSize>
	//   32   68:invokestatic    #155 <Method BigDecimal NumberInput.parseBigDecimal(char[], int, int)>
	//   33   71:areturn         
		else
			return NumberInput.parseBigDecimal(contentsAsArray());
	//   34   72:aload_0         
	//   35   73:invokevirtual   #157 <Method char[] contentsAsArray()>
	//   36   76:invokestatic    #152 <Method BigDecimal NumberInput.parseBigDecimal(char[])>
	//   37   79:areturn         
	}

	public double contentsAsDouble()
		throws NumberFormatException
	{
		return NumberInput.parseDouble(contentsAsString());
	//    0    0:aload_0         
	//    1    1:invokevirtual   #164 <Method String contentsAsString()>
	//    2    4:invokestatic    #168 <Method double NumberInput.parseDouble(String)>
	//    3    7:dreturn         
	}

	public String contentsAsString()
	{
		if(_resultString == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #82  <Field String _resultString>
	//*   2    4:ifnonnull       214
			if(_resultArray != null)
	//*   3    7:aload_0         
	//*   4    8:getfield        #128 <Field char[] _resultArray>
	//*   5   11:ifnull          32
				_resultString = new String(_resultArray);
	//    6   14:aload_0         
	//    7   15:new             #84  <Class String>
	//    8   18:dup             
	//    9   19:aload_0         
	//   10   20:getfield        #128 <Field char[] _resultArray>
	//   11   23:invokespecial   #171 <Method void String(char[])>
	//   12   26:putfield        #82  <Field String _resultString>
			else
	//*  13   29:goto            214
			if(_inputStart >= 0)
	//*  14   32:aload_0         
	//*  15   33:getfield        #89  <Field int _inputStart>
	//*  16   36:iflt            82
			{
				if(_inputLen < 1)
	//*  17   39:aload_0         
	//*  18   40:getfield        #91  <Field int _inputLen>
	//*  19   43:iconst_1        
	//*  20   44:icmpge          56
				{
					_resultString = "";
	//   21   47:aload_0         
	//   22   48:ldc1            #173 <String "">
	//   23   50:putfield        #82  <Field String _resultString>
					return "";
	//   24   53:ldc1            #173 <String "">
	//   25   55:areturn         
				}
				_resultString = new String(_inputBuffer, _inputStart, _inputLen);
	//   26   56:aload_0         
	//   27   57:new             #84  <Class String>
	//   28   60:dup             
	//   29   61:aload_0         
	//   30   62:getfield        #93  <Field char[] _inputBuffer>
	//   31   65:aload_0         
	//   32   66:getfield        #89  <Field int _inputStart>
	//   33   69:aload_0         
	//   34   70:getfield        #91  <Field int _inputLen>
	//   35   73:invokespecial   #175 <Method void String(char[], int, int)>
	//   36   76:putfield        #82  <Field String _resultString>
			} else
	//*  37   79:goto            214
			{
				int i = _segmentSize;
	//   38   82:aload_0         
	//   39   83:getfield        #65  <Field int _segmentSize>
	//   40   86:istore_1        
				int k = _currentSize;
	//   41   87:aload_0         
	//   42   88:getfield        #67  <Field int _currentSize>
	//   43   91:istore_2        
				if(i == 0)
	//*  44   92:iload_1         
	//*  45   93:ifne            128
				{
					String s;
					if(k == 0)
	//*  46   96:iload_2         
	//*  47   97:ifne            106
						s = "";
	//   48  100:ldc1            #173 <String "">
	//   49  102:astore_3        
					else
	//*  50  103:goto            120
						s = new String(_currentSegment, 0, k);
	//   51  106:new             #84  <Class String>
	//   52  109:dup             
	//   53  110:aload_0         
	//   54  111:getfield        #72  <Field char[] _currentSegment>
	//   55  114:iconst_0        
	//   56  115:iload_2         
	//   57  116:invokespecial   #175 <Method void String(char[], int, int)>
	//   58  119:astore_3        
					_resultString = s;
	//   59  120:aload_0         
	//   60  121:aload_3         
	//   61  122:putfield        #82  <Field String _resultString>
				} else
	//*  62  125:goto            214
				{
					StringBuilder stringbuilder = new StringBuilder(i + k);
	//   63  128:new             #177 <Class StringBuilder>
	//   64  131:dup             
	//   65  132:iload_1         
	//   66  133:iload_2         
	//   67  134:iadd            
	//   68  135:invokespecial   #179 <Method void StringBuilder(int)>
	//   69  138:astore_3        
					if(_segments != null)
	//*  70  139:aload_0         
	//*  71  140:getfield        #58  <Field ArrayList _segments>
	//*  72  143:ifnull          192
					{
						int l = _segments.size();
	//   73  146:aload_0         
	//   74  147:getfield        #58  <Field ArrayList _segments>
	//   75  150:invokevirtual   #108 <Method int ArrayList.size()>
	//   76  153:istore_2        
						for(int j = 0; j < l; j++)
	//*  77  154:iconst_0        
	//*  78  155:istore_1        
	//*  79  156:iload_1         
	//*  80  157:iload_2         
	//*  81  158:icmpge          192
						{
							char ac[] = (char[])_segments.get(j);
	//   82  161:aload_0         
	//   83  162:getfield        #58  <Field ArrayList _segments>
	//   84  165:iload_1         
	//   85  166:invokevirtual   #112 <Method Object ArrayList.get(int)>
	//   86  169:checkcast       #113 <Class char[]>
	//   87  172:astore          4
							stringbuilder.append(ac, 0, ac.length);
	//   88  174:aload_3         
	//   89  175:aload           4
	//   90  177:iconst_0        
	//   91  178:aload           4
	//   92  180:arraylength     
	//   93  181:invokevirtual   #182 <Method StringBuilder StringBuilder.append(char[], int, int)>
	//   94  184:pop             
						}

	//   95  185:iload_1         
	//   96  186:iconst_1        
	//   97  187:iadd            
	//   98  188:istore_1        
					}
	//*  99  189:goto            156
					stringbuilder.append(_currentSegment, 0, _currentSize);
	//  100  192:aload_3         
	//  101  193:aload_0         
	//  102  194:getfield        #72  <Field char[] _currentSegment>
	//  103  197:iconst_0        
	//  104  198:aload_0         
	//  105  199:getfield        #67  <Field int _currentSize>
	//  106  202:invokevirtual   #182 <Method StringBuilder StringBuilder.append(char[], int, int)>
	//  107  205:pop             
					_resultString = stringbuilder.toString();
	//  108  206:aload_0         
	//  109  207:aload_3         
	//  110  208:invokevirtual   #185 <Method String StringBuilder.toString()>
	//  111  211:putfield        #82  <Field String _resultString>
				}
			}
		return _resultString;
	//  112  214:aload_0         
	//  113  215:getfield        #82  <Field String _resultString>
	//  114  218:areturn         
	}

	public int contentsToWriter(Writer writer)
		throws IOException
	{
		if(_resultArray != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #128 <Field char[] _resultArray>
	//*   2    4:ifnull          21
		{
			writer.write(_resultArray);
	//    3    7:aload_1         
	//    4    8:aload_0         
	//    5    9:getfield        #128 <Field char[] _resultArray>
	//    6   12:invokevirtual   #194 <Method void Writer.write(char[])>
			return _resultArray.length;
	//    7   15:aload_0         
	//    8   16:getfield        #128 <Field char[] _resultArray>
	//    9   19:arraylength     
	//   10   20:ireturn         
		}
		if(_resultString != null)
	//*  11   21:aload_0         
	//*  12   22:getfield        #82  <Field String _resultString>
	//*  13   25:ifnull          44
		{
			writer.write(_resultString);
	//   14   28:aload_1         
	//   15   29:aload_0         
	//   16   30:getfield        #82  <Field String _resultString>
	//   17   33:invokevirtual   #197 <Method void Writer.write(String)>
			return _resultString.length();
	//   18   36:aload_0         
	//   19   37:getfield        #82  <Field String _resultString>
	//   20   40:invokevirtual   #200 <Method int String.length()>
	//   21   43:ireturn         
		}
		if(_inputStart >= 0)
	//*  22   44:aload_0         
	//*  23   45:getfield        #89  <Field int _inputStart>
	//*  24   48:iflt            75
		{
			int i = _inputLen;
	//   25   51:aload_0         
	//   26   52:getfield        #91  <Field int _inputLen>
	//   27   55:istore_2        
			if(i > 0)
	//*  28   56:iload_2         
	//*  29   57:ifle            73
				writer.write(_inputBuffer, _inputStart, i);
	//   30   60:aload_1         
	//   31   61:aload_0         
	//   32   62:getfield        #93  <Field char[] _inputBuffer>
	//   33   65:aload_0         
	//   34   66:getfield        #89  <Field int _inputStart>
	//   35   69:iload_2         
	//   36   70:invokevirtual   #202 <Method void Writer.write(char[], int, int)>
			return i;
	//   37   73:iload_2         
	//   38   74:ireturn         
		}
		int l;
		if(_segments != null)
	//*  39   75:aload_0         
	//*  40   76:getfield        #58  <Field ArrayList _segments>
	//*  41   79:ifnull          145
		{
			int k1 = _segments.size();
	//   42   82:aload_0         
	//   43   83:getfield        #58  <Field ArrayList _segments>
	//   44   86:invokevirtual   #108 <Method int ArrayList.size()>
	//   45   89:istore          5
			int i1 = 0;
	//   46   91:iconst_0        
	//   47   92:istore          4
			int j = i1;
	//   48   94:iload           4
	//   49   96:istore_2        
			do
			{
				l = j;
	//   50   97:iload_2         
	//   51   98:istore_3        
				if(i1 >= k1)
					break;
	//   52   99:iload           4
	//   53  101:iload           5
	//   54  103:icmpge          147
				char ac[] = (char[])_segments.get(i1);
	//   55  106:aload_0         
	//   56  107:getfield        #58  <Field ArrayList _segments>
	//   57  110:iload           4
	//   58  112:invokevirtual   #112 <Method Object ArrayList.get(int)>
	//   59  115:checkcast       #113 <Class char[]>
	//   60  118:astore          6
				l = ac.length;
	//   61  120:aload           6
	//   62  122:arraylength     
	//   63  123:istore_3        
				writer.write(ac, 0, l);
	//   64  124:aload_1         
	//   65  125:aload           6
	//   66  127:iconst_0        
	//   67  128:iload_3         
	//   68  129:invokevirtual   #202 <Method void Writer.write(char[], int, int)>
				j += l;
	//   69  132:iload_2         
	//   70  133:iload_3         
	//   71  134:iadd            
	//   72  135:istore_2        
				i1++;
	//   73  136:iload           4
	//   74  138:iconst_1        
	//   75  139:iadd            
	//   76  140:istore          4
			} while(true);
	//   77  142:goto            97
		} else
		{
			l = 0;
	//   78  145:iconst_0        
	//   79  146:istore_3        
		}
		int j1 = _currentSize;
	//   80  147:aload_0         
	//   81  148:getfield        #67  <Field int _currentSize>
	//   82  151:istore          4
		int k = l;
	//   83  153:iload_3         
	//   84  154:istore_2        
		if(j1 > 0)
	//*  85  155:iload           4
	//*  86  157:ifle            176
		{
			writer.write(_currentSegment, 0, j1);
	//   87  160:aload_1         
	//   88  161:aload_0         
	//   89  162:getfield        #72  <Field char[] _currentSegment>
	//   90  165:iconst_0        
	//   91  166:iload           4
	//   92  168:invokevirtual   #202 <Method void Writer.write(char[], int, int)>
			k = l + j1;
	//   93  171:iload_3         
	//   94  172:iload           4
	//   95  174:iadd            
	//   96  175:istore_2        
		}
		return k;
	//   97  176:iload_2         
	//   98  177:ireturn         
	}

	public char[] emptyAndGetCurrentSegment()
	{
		_inputStart = -1;
	//    0    0:aload_0         
	//    1    1:iconst_m1       
	//    2    2:putfield        #89  <Field int _inputStart>
		_currentSize = 0;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #67  <Field int _currentSize>
		_inputLen = 0;
	//    6   10:aload_0         
	//    7   11:iconst_0        
	//    8   12:putfield        #91  <Field int _inputLen>
		_inputBuffer = null;
	//    9   15:aload_0         
	//   10   16:aconst_null     
	//   11   17:putfield        #93  <Field char[] _inputBuffer>
		_resultString = null;
	//   12   20:aload_0         
	//   13   21:aconst_null     
	//   14   22:putfield        #82  <Field String _resultString>
		_resultArray = null;
	//   15   25:aload_0         
	//   16   26:aconst_null     
	//   17   27:putfield        #128 <Field char[] _resultArray>
		if(_hasSegments)
	//*  18   30:aload_0         
	//*  19   31:getfield        #56  <Field boolean _hasSegments>
	//*  20   34:ifeq            41
			clearSegments();
	//   21   37:aload_0         
	//   22   38:invokespecial   #205 <Method void clearSegments()>
		char ac1[] = _currentSegment;
	//   23   41:aload_0         
	//   24   42:getfield        #72  <Field char[] _currentSegment>
	//   25   45:astore_2        
		char ac[] = ac1;
	//   26   46:aload_2         
	//   27   47:astore_1        
		if(ac1 == null)
	//*  28   48:aload_2         
	//*  29   49:ifnonnull       63
		{
			ac = buf(0);
	//   30   52:aload_0         
	//   31   53:iconst_0        
	//   32   54:invokespecial   #122 <Method char[] buf(int)>
	//   33   57:astore_1        
			_currentSegment = ac;
	//   34   58:aload_0         
	//   35   59:aload_1         
	//   36   60:putfield        #72  <Field char[] _currentSegment>
		}
		return ac;
	//   37   63:aload_1         
	//   38   64:areturn         
	}

	public void ensureNotShared()
	{
		if(_inputStart >= 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #89  <Field int _inputStart>
	//*   2    4:iflt            13
			unshare(16);
	//    3    7:aload_0         
	//    4    8:bipush          16
	//    5   10:invokespecial   #126 <Method void unshare(int)>
	//    6   13:return          
	}

	public char[] expandCurrentSegment()
	{
		char ac[] = _currentSegment;
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field char[] _currentSegment>
	//    2    4:astore          4
		int k = ac.length;
	//    3    6:aload           4
	//    4    8:arraylength     
	//    5    9:istore_3        
		int j = (k >> 1) + k;
	//    6   10:iload_3         
	//    7   11:iconst_1        
	//    8   12:ishr            
	//    9   13:iload_3         
	//   10   14:iadd            
	//   11   15:istore_2        
		int i = j;
	//   12   16:iload_2         
	//   13   17:istore_1        
		if(j > 0x40000)
	//*  14   18:iload_2         
	//*  15   19:ldc1            #7   <Int 0x40000>
	//*  16   21:icmple          30
			i = k + (k >> 2);
	//   17   24:iload_3         
	//   18   25:iload_3         
	//   19   26:iconst_2        
	//   20   27:ishr            
	//   21   28:iadd            
	//   22   29:istore_1        
		ac = Arrays.copyOf(ac, i);
	//   23   30:aload           4
	//   24   32:iload_1         
	//   25   33:invokestatic    #99  <Method char[] Arrays.copyOf(char[], int)>
	//   26   36:astore          4
		_currentSegment = ac;
	//   27   38:aload_0         
	//   28   39:aload           4
	//   29   41:putfield        #72  <Field char[] _currentSegment>
		return ac;
	//   30   44:aload           4
	//   31   46:areturn         
	}

	public char[] expandCurrentSegment(int i)
	{
		char ac[] = _currentSegment;
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field char[] _currentSegment>
	//    2    4:astore_2        
		if(ac.length >= i)
	//*   3    5:aload_2         
	//*   4    6:arraylength     
	//*   5    7:iload_1         
	//*   6    8:icmplt          13
		{
			return ac;
	//    7   11:aload_2         
	//    8   12:areturn         
		} else
		{
			ac = Arrays.copyOf(ac, i);
	//    9   13:aload_2         
	//   10   14:iload_1         
	//   11   15:invokestatic    #99  <Method char[] Arrays.copyOf(char[], int)>
	//   12   18:astore_2        
			_currentSegment = ac;
	//   13   19:aload_0         
	//   14   20:aload_2         
	//   15   21:putfield        #72  <Field char[] _currentSegment>
			return ac;
	//   16   24:aload_2         
	//   17   25:areturn         
		}
	}

	public char[] finishCurrentSegment()
	{
		if(_segments == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #58  <Field ArrayList _segments>
	//*   2    4:ifnonnull       18
			_segments = new ArrayList();
	//    3    7:aload_0         
	//    4    8:new             #60  <Class ArrayList>
	//    5   11:dup             
	//    6   12:invokespecial   #70  <Method void ArrayList()>
	//    7   15:putfield        #58  <Field ArrayList _segments>
		_hasSegments = true;
	//    8   18:aload_0         
	//    9   19:iconst_1        
	//   10   20:putfield        #56  <Field boolean _hasSegments>
		_segments.add(((Object) (_currentSegment)));
	//   11   23:aload_0         
	//   12   24:getfield        #58  <Field ArrayList _segments>
	//   13   27:aload_0         
	//   14   28:getfield        #72  <Field char[] _currentSegment>
	//   15   31:invokevirtual   #76  <Method boolean ArrayList.add(Object)>
	//   16   34:pop             
		int i = _currentSegment.length;
	//   17   35:aload_0         
	//   18   36:getfield        #72  <Field char[] _currentSegment>
	//   19   39:arraylength     
	//   20   40:istore_1        
		_segmentSize = _segmentSize + i;
	//   21   41:aload_0         
	//   22   42:aload_0         
	//   23   43:getfield        #65  <Field int _segmentSize>
	//   24   46:iload_1         
	//   25   47:iadd            
	//   26   48:putfield        #65  <Field int _segmentSize>
		_currentSize = 0;
	//   27   51:aload_0         
	//   28   52:iconst_0        
	//   29   53:putfield        #67  <Field int _currentSize>
		int j = i + (i >> 1);
	//   30   56:iload_1         
	//   31   57:iload_1         
	//   32   58:iconst_1        
	//   33   59:ishr            
	//   34   60:iadd            
	//   35   61:istore_2        
		if(j < 1000)
	//*  36   62:iload_2         
	//*  37   63:sipush          1000
	//*  38   66:icmpge          76
		{
			i = 1000;
	//   39   69:sipush          1000
	//   40   72:istore_1        
		} else
	//*  41   73:goto            87
		{
			i = j;
	//   42   76:iload_2         
	//   43   77:istore_1        
			if(j > 0x40000)
	//*  44   78:iload_2         
	//*  45   79:ldc1            #7   <Int 0x40000>
	//*  46   81:icmple          87
				i = 0x40000;
	//   47   84:ldc1            #7   <Int 0x40000>
	//   48   86:istore_1        
		}
		char ac[] = carr(i);
	//   49   87:aload_0         
	//   50   88:iload_1         
	//   51   89:invokespecial   #78  <Method char[] carr(int)>
	//   52   92:astore_3        
		_currentSegment = ac;
	//   53   93:aload_0         
	//   54   94:aload_3         
	//   55   95:putfield        #72  <Field char[] _currentSegment>
		return ac;
	//   56   98:aload_3         
	//   57   99:areturn         
	}

	public char[] getCurrentSegment()
	{
		if(_inputStart >= 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #89  <Field int _inputStart>
	//*   2    4:iflt            15
		{
			unshare(1);
	//    3    7:aload_0         
	//    4    8:iconst_1        
	//    5    9:invokespecial   #126 <Method void unshare(int)>
		} else
	//*   6   12:goto            50
		{
			char ac[] = _currentSegment;
	//    7   15:aload_0         
	//    8   16:getfield        #72  <Field char[] _currentSegment>
	//    9   19:astore_1        
			if(ac == null)
	//*  10   20:aload_1         
	//*  11   21:ifnonnull       36
				_currentSegment = buf(0);
	//   12   24:aload_0         
	//   13   25:aload_0         
	//   14   26:iconst_0        
	//   15   27:invokespecial   #122 <Method char[] buf(int)>
	//   16   30:putfield        #72  <Field char[] _currentSegment>
			else
	//*  17   33:goto            50
			if(_currentSize >= ac.length)
	//*  18   36:aload_0         
	//*  19   37:getfield        #67  <Field int _currentSize>
	//*  20   40:aload_1         
	//*  21   41:arraylength     
	//*  22   42:icmplt          50
				expand(1);
	//   23   45:aload_0         
	//   24   46:iconst_1        
	//   25   47:invokespecial   #130 <Method void expand(int)>
		}
		return _currentSegment;
	//   26   50:aload_0         
	//   27   51:getfield        #72  <Field char[] _currentSegment>
	//   28   54:areturn         
	}

	public int getCurrentSegmentSize()
	{
		return _currentSize;
	//    0    0:aload_0         
	//    1    1:getfield        #67  <Field int _currentSize>
	//    2    4:ireturn         
	}

	public char[] getTextBuffer()
	{
		if(_inputStart >= 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #89  <Field int _inputStart>
	//*   2    4:iflt            12
			return _inputBuffer;
	//    3    7:aload_0         
	//    4    8:getfield        #93  <Field char[] _inputBuffer>
	//    5   11:areturn         
		if(_resultArray != null)
	//*   6   12:aload_0         
	//*   7   13:getfield        #128 <Field char[] _resultArray>
	//*   8   16:ifnull          24
			return _resultArray;
	//    9   19:aload_0         
	//   10   20:getfield        #128 <Field char[] _resultArray>
	//   11   23:areturn         
		if(_resultString != null)
	//*  12   24:aload_0         
	//*  13   25:getfield        #82  <Field String _resultString>
	//*  14   28:ifnull          46
		{
			char ac[] = _resultString.toCharArray();
	//   15   31:aload_0         
	//   16   32:getfield        #82  <Field String _resultString>
	//   17   35:invokevirtual   #87  <Method char[] String.toCharArray()>
	//   18   38:astore_1        
			_resultArray = ac;
	//   19   39:aload_0         
	//   20   40:aload_1         
	//   21   41:putfield        #128 <Field char[] _resultArray>
			return ac;
	//   22   44:aload_1         
	//   23   45:areturn         
		}
		if(!_hasSegments)
	//*  24   46:aload_0         
	//*  25   47:getfield        #56  <Field boolean _hasSegments>
	//*  26   50:ifne            69
		{
			if(_currentSegment == null)
	//*  27   53:aload_0         
	//*  28   54:getfield        #72  <Field char[] _currentSegment>
	//*  29   57:ifnonnull       64
				return NO_CHARS;
	//   30   60:getstatic       #31  <Field char[] NO_CHARS>
	//   31   63:areturn         
			else
				return _currentSegment;
	//   32   64:aload_0         
	//   33   65:getfield        #72  <Field char[] _currentSegment>
	//   34   68:areturn         
		} else
		{
			return contentsAsArray();
	//   35   69:aload_0         
	//   36   70:invokevirtual   #157 <Method char[] contentsAsArray()>
	//   37   73:areturn         
		}
	}

	public int getTextOffset()
	{
		if(_inputStart >= 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #89  <Field int _inputStart>
	//*   2    4:iflt            12
			return _inputStart;
	//    3    7:aload_0         
	//    4    8:getfield        #89  <Field int _inputStart>
	//    5   11:ireturn         
		else
			return 0;
	//    6   12:iconst_0        
	//    7   13:ireturn         
	}

	public boolean hasTextAsCharacters()
	{
		if(_inputStart < 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #89  <Field int _inputStart>
	//*   2    4:ifge            27
		{
			if(_resultArray != null)
	//*   3    7:aload_0         
	//*   4    8:getfield        #128 <Field char[] _resultArray>
	//*   5   11:ifnull          16
				return true;
	//    6   14:iconst_1        
	//    7   15:ireturn         
			return _resultString == null;
	//    8   16:aload_0         
	//    9   17:getfield        #82  <Field String _resultString>
	//   10   20:ifnull          25
	//   11   23:iconst_0        
	//   12   24:ireturn         
	//   13   25:iconst_1        
	//   14   26:ireturn         
		} else
		{
			return true;
	//   15   27:iconst_1        
	//   16   28:ireturn         
		}
	}

	public void releaseBuffers()
	{
		if(_allocator == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #38  <Field BufferRecycler _allocator>
	//*   2    4:ifnonnull       12
		{
			resetWithEmpty();
	//    3    7:aload_0         
	//    4    8:invokevirtual   #218 <Method void resetWithEmpty()>
			return;
	//    5   11:return          
		}
		if(_currentSegment != null)
	//*   6   12:aload_0         
	//*   7   13:getfield        #72  <Field char[] _currentSegment>
	//*   8   16:ifnull          42
		{
			resetWithEmpty();
	//    9   19:aload_0         
	//   10   20:invokevirtual   #218 <Method void resetWithEmpty()>
			char ac[] = _currentSegment;
	//   11   23:aload_0         
	//   12   24:getfield        #72  <Field char[] _currentSegment>
	//   13   27:astore_1        
			_currentSegment = null;
	//   14   28:aload_0         
	//   15   29:aconst_null     
	//   16   30:putfield        #72  <Field char[] _currentSegment>
			_allocator.releaseCharBuffer(2, ac);
	//   17   33:aload_0         
	//   18   34:getfield        #38  <Field BufferRecycler _allocator>
	//   19   37:iconst_2        
	//   20   38:aload_1         
	//   21   39:invokevirtual   #222 <Method void BufferRecycler.releaseCharBuffer(int, char[])>
		}
	//   22   42:return          
	}

	public void resetWithCopy(char ac[], int i, int j)
	{
		_inputBuffer = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #93  <Field char[] _inputBuffer>
		_inputStart = -1;
	//    3    5:aload_0         
	//    4    6:iconst_m1       
	//    5    7:putfield        #89  <Field int _inputStart>
		_inputLen = 0;
	//    6   10:aload_0         
	//    7   11:iconst_0        
	//    8   12:putfield        #91  <Field int _inputLen>
		_resultString = null;
	//    9   15:aload_0         
	//   10   16:aconst_null     
	//   11   17:putfield        #82  <Field String _resultString>
		_resultArray = null;
	//   12   20:aload_0         
	//   13   21:aconst_null     
	//   14   22:putfield        #128 <Field char[] _resultArray>
		if(_hasSegments)
	//*  15   25:aload_0         
	//*  16   26:getfield        #56  <Field boolean _hasSegments>
	//*  17   29:ifeq            39
			clearSegments();
	//   18   32:aload_0         
	//   19   33:invokespecial   #205 <Method void clearSegments()>
		else
	//*  20   36:goto            55
		if(_currentSegment == null)
	//*  21   39:aload_0         
	//*  22   40:getfield        #72  <Field char[] _currentSegment>
	//*  23   43:ifnonnull       55
			_currentSegment = buf(j);
	//   24   46:aload_0         
	//   25   47:aload_0         
	//   26   48:iload_3         
	//   27   49:invokespecial   #122 <Method char[] buf(int)>
	//   28   52:putfield        #72  <Field char[] _currentSegment>
		_segmentSize = 0;
	//   29   55:aload_0         
	//   30   56:iconst_0        
	//   31   57:putfield        #65  <Field int _segmentSize>
		_currentSize = 0;
	//   32   60:aload_0         
	//   33   61:iconst_0        
	//   34   62:putfield        #67  <Field int _currentSize>
		append(ac, i, j);
	//   35   65:aload_0         
	//   36   66:aload_1         
	//   37   67:iload_2         
	//   38   68:iload_3         
	//   39   69:invokevirtual   #225 <Method void append(char[], int, int)>
	//   40   72:return          
	}

	public void resetWithEmpty()
	{
		_inputStart = -1;
	//    0    0:aload_0         
	//    1    1:iconst_m1       
	//    2    2:putfield        #89  <Field int _inputStart>
		_currentSize = 0;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #67  <Field int _currentSize>
		_inputLen = 0;
	//    6   10:aload_0         
	//    7   11:iconst_0        
	//    8   12:putfield        #91  <Field int _inputLen>
		_inputBuffer = null;
	//    9   15:aload_0         
	//   10   16:aconst_null     
	//   11   17:putfield        #93  <Field char[] _inputBuffer>
		_resultString = null;
	//   12   20:aload_0         
	//   13   21:aconst_null     
	//   14   22:putfield        #82  <Field String _resultString>
		_resultArray = null;
	//   15   25:aload_0         
	//   16   26:aconst_null     
	//   17   27:putfield        #128 <Field char[] _resultArray>
		if(_hasSegments)
	//*  18   30:aload_0         
	//*  19   31:getfield        #56  <Field boolean _hasSegments>
	//*  20   34:ifeq            41
			clearSegments();
	//   21   37:aload_0         
	//   22   38:invokespecial   #205 <Method void clearSegments()>
	//   23   41:return          
	}

	public void resetWithShared(char ac[], int i, int j)
	{
		_resultString = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #82  <Field String _resultString>
		_resultArray = null;
	//    3    5:aload_0         
	//    4    6:aconst_null     
	//    5    7:putfield        #128 <Field char[] _resultArray>
		_inputBuffer = ac;
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:putfield        #93  <Field char[] _inputBuffer>
		_inputStart = i;
	//    9   15:aload_0         
	//   10   16:iload_2         
	//   11   17:putfield        #89  <Field int _inputStart>
		_inputLen = j;
	//   12   20:aload_0         
	//   13   21:iload_3         
	//   14   22:putfield        #91  <Field int _inputLen>
		if(_hasSegments)
	//*  15   25:aload_0         
	//*  16   26:getfield        #56  <Field boolean _hasSegments>
	//*  17   29:ifeq            36
			clearSegments();
	//   18   32:aload_0         
	//   19   33:invokespecial   #205 <Method void clearSegments()>
	//   20   36:return          
	}

	public void resetWithString(String s)
	{
		_inputBuffer = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #93  <Field char[] _inputBuffer>
		_inputStart = -1;
	//    3    5:aload_0         
	//    4    6:iconst_m1       
	//    5    7:putfield        #89  <Field int _inputStart>
		_inputLen = 0;
	//    6   10:aload_0         
	//    7   11:iconst_0        
	//    8   12:putfield        #91  <Field int _inputLen>
		_resultString = s;
	//    9   15:aload_0         
	//   10   16:aload_1         
	//   11   17:putfield        #82  <Field String _resultString>
		_resultArray = null;
	//   12   20:aload_0         
	//   13   21:aconst_null     
	//   14   22:putfield        #128 <Field char[] _resultArray>
		if(_hasSegments)
	//*  15   25:aload_0         
	//*  16   26:getfield        #56  <Field boolean _hasSegments>
	//*  17   29:ifeq            36
			clearSegments();
	//   18   32:aload_0         
	//   19   33:invokespecial   #205 <Method void clearSegments()>
		_currentSize = 0;
	//   20   36:aload_0         
	//   21   37:iconst_0        
	//   22   38:putfield        #67  <Field int _currentSize>
	//   23   41:return          
	}

	public String setCurrentAndReturn(int i)
	{
		_currentSize = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #67  <Field int _currentSize>
		if(_segmentSize > 0)
	//*   3    5:aload_0         
	//*   4    6:getfield        #65  <Field int _segmentSize>
	//*   5    9:ifle            17
			return contentsAsString();
	//    6   12:aload_0         
	//    7   13:invokevirtual   #164 <Method String contentsAsString()>
	//    8   16:areturn         
		i = _currentSize;
	//    9   17:aload_0         
	//   10   18:getfield        #67  <Field int _currentSize>
	//   11   21:istore_1        
		String s;
		if(i == 0)
	//*  12   22:iload_1         
	//*  13   23:ifne            32
			s = "";
	//   14   26:ldc1            #173 <String "">
	//   15   28:astore_2        
		else
	//*  16   29:goto            46
			s = new String(_currentSegment, 0, i);
	//   17   32:new             #84  <Class String>
	//   18   35:dup             
	//   19   36:aload_0         
	//   20   37:getfield        #72  <Field char[] _currentSegment>
	//   21   40:iconst_0        
	//   22   41:iload_1         
	//   23   42:invokespecial   #175 <Method void String(char[], int, int)>
	//   24   45:astore_2        
		_resultString = s;
	//   25   46:aload_0         
	//   26   47:aload_2         
	//   27   48:putfield        #82  <Field String _resultString>
		return s;
	//   28   51:aload_2         
	//   29   52:areturn         
	}

	public void setCurrentLength(int i)
	{
		_currentSize = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #67  <Field int _currentSize>
	//    3    5:return          
	}

	public int size()
	{
		if(_inputStart >= 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #89  <Field int _inputStart>
	//*   2    4:iflt            12
			return _inputLen;
	//    3    7:aload_0         
	//    4    8:getfield        #91  <Field int _inputLen>
	//    5   11:ireturn         
		if(_resultArray != null)
	//*   6   12:aload_0         
	//*   7   13:getfield        #128 <Field char[] _resultArray>
	//*   8   16:ifnull          25
			return _resultArray.length;
	//    9   19:aload_0         
	//   10   20:getfield        #128 <Field char[] _resultArray>
	//   11   23:arraylength     
	//   12   24:ireturn         
		if(_resultString != null)
	//*  13   25:aload_0         
	//*  14   26:getfield        #82  <Field String _resultString>
	//*  15   29:ifnull          40
			return _resultString.length();
	//   16   32:aload_0         
	//   17   33:getfield        #82  <Field String _resultString>
	//   18   36:invokevirtual   #200 <Method int String.length()>
	//   19   39:ireturn         
		else
			return _segmentSize + _currentSize;
	//   20   40:aload_0         
	//   21   41:getfield        #65  <Field int _segmentSize>
	//   22   44:aload_0         
	//   23   45:getfield        #67  <Field int _currentSize>
	//   24   48:iadd            
	//   25   49:ireturn         
	}

	public String toString()
	{
		return contentsAsString();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #164 <Method String contentsAsString()>
	//    2    4:areturn         
	}

	static final int MAX_SEGMENT_LEN = 0x40000;
	static final int MIN_SEGMENT_LEN = 1000;
	static final char NO_CHARS[] = new char[0];
	private final BufferRecycler _allocator;
	private char _currentSegment[];
	private int _currentSize;
	private boolean _hasSegments;
	private char _inputBuffer[];
	private int _inputLen;
	private int _inputStart;
	private char _resultArray[];
	private String _resultString;
	private int _segmentSize;
	private ArrayList _segments;

	static 
	{
	//    0    0:iconst_0        
	//    1    1:newarray        char[]
	//    2    3:putstatic       #31  <Field char[] NO_CHARS>
	//*   3    6:return          
	}
}
