// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.core.util;

import com.fasterxml.jackson.core.io.NumberInput;
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
	//    1    1:invokespecial   #32  <Method void Object()>
		_allocator = bufferrecycler;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #34  <Field BufferRecycler _allocator>
	//    5    9:return          
	}

	private char[] buf(int i)
	{
		BufferRecycler bufferrecycler = _allocator;
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field BufferRecycler _allocator>
	//    2    4:astore_2        
		if(bufferrecycler != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          16
			return bufferrecycler.allocCharBuffer(2, i);
	//    5    9:aload_2         
	//    6   10:iconst_2        
	//    7   11:iload_1         
	//    8   12:invokevirtual   #42  <Method char[] BufferRecycler.allocCharBuffer(int, int)>
	//    9   15:areturn         
		else
			return new char[Math.max(i, 1000)];
	//   10   16:iload_1         
	//   11   17:sipush          1000
	//   12   20:invokestatic    #48  <Method int Math.max(int, int)>
	//   13   23:newarray        char[]
	//   14   25:areturn         
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
	//    2    2:putfield        #52  <Field boolean _hasSegments>
		_segments.clear();
	//    3    5:aload_0         
	//    4    6:getfield        #54  <Field ArrayList _segments>
	//    5    9:invokevirtual   #59  <Method void ArrayList.clear()>
		_segmentSize = 0;
	//    6   12:aload_0         
	//    7   13:iconst_0        
	//    8   14:putfield        #61  <Field int _segmentSize>
		_currentSize = 0;
	//    9   17:aload_0         
	//   10   18:iconst_0        
	//   11   19:putfield        #63  <Field int _currentSize>
	//   12   22:return          
	}

	private void expand(int i)
	{
		if(_segments == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #54  <Field ArrayList _segments>
	//*   2    4:ifnonnull       18
			_segments = new ArrayList();
	//    3    7:aload_0         
	//    4    8:new             #56  <Class ArrayList>
	//    5   11:dup             
	//    6   12:invokespecial   #66  <Method void ArrayList()>
	//    7   15:putfield        #54  <Field ArrayList _segments>
		char ac[] = _currentSegment;
	//    8   18:aload_0         
	//    9   19:getfield        #68  <Field char[] _currentSegment>
	//   10   22:astore_3        
		_hasSegments = true;
	//   11   23:aload_0         
	//   12   24:iconst_1        
	//   13   25:putfield        #52  <Field boolean _hasSegments>
		_segments.add(((Object) (ac)));
	//   14   28:aload_0         
	//   15   29:getfield        #54  <Field ArrayList _segments>
	//   16   32:aload_3         
	//   17   33:invokevirtual   #72  <Method boolean ArrayList.add(Object)>
	//   18   36:pop             
		_segmentSize = _segmentSize + ac.length;
	//   19   37:aload_0         
	//   20   38:aload_0         
	//   21   39:getfield        #61  <Field int _segmentSize>
	//   22   42:aload_3         
	//   23   43:arraylength     
	//   24   44:iadd            
	//   25   45:putfield        #61  <Field int _segmentSize>
		_currentSize = 0;
	//   26   48:aload_0         
	//   27   49:iconst_0        
	//   28   50:putfield        #63  <Field int _currentSize>
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
	//*  47   79:ldc1            #73  <Int 0x40000>
	//*  48   81:icmple          87
				i = 0x40000;
	//   49   84:ldc1            #73  <Int 0x40000>
	//   50   86:istore_1        
		}
		_currentSegment = carr(i);
	//   51   87:aload_0         
	//   52   88:aload_0         
	//   53   89:iload_1         
	//   54   90:invokespecial   #75  <Method char[] carr(int)>
	//   55   93:putfield        #68  <Field char[] _currentSegment>
	//   56   96:return          
	}

	private char[] resultArray()
	{
		String s = _resultString;
	//    0    0:aload_0         
	//    1    1:getfield        #79  <Field String _resultString>
	//    2    4:astore          5
		if(s != null)
	//*   3    6:aload           5
	//*   4    8:ifnull          17
			return s.toCharArray();
	//    5   11:aload           5
	//    6   13:invokevirtual   #84  <Method char[] String.toCharArray()>
	//    7   16:areturn         
		int i = _inputStart;
	//    8   17:aload_0         
	//    9   18:getfield        #86  <Field int _inputStart>
	//   10   21:istore_1        
		if(i >= 0)
	//*  11   22:iload_1         
	//*  12   23:iflt            65
		{
			int k = _inputLen;
	//   13   26:aload_0         
	//   14   27:getfield        #88  <Field int _inputLen>
	//   15   30:istore_2        
			if(k < 1)
	//*  16   31:iload_2         
	//*  17   32:iconst_1        
	//*  18   33:icmpge          40
				return NO_CHARS;
	//   19   36:getstatic       #27  <Field char[] NO_CHARS>
	//   20   39:areturn         
			if(i == 0)
	//*  21   40:iload_1         
	//*  22   41:ifne            53
				return Arrays.copyOf(_inputBuffer, k);
	//   23   44:aload_0         
	//   24   45:getfield        #90  <Field char[] _inputBuffer>
	//   25   48:iload_2         
	//   26   49:invokestatic    #96  <Method char[] Arrays.copyOf(char[], int)>
	//   27   52:areturn         
			else
				return Arrays.copyOfRange(_inputBuffer, i, k + i);
	//   28   53:aload_0         
	//   29   54:getfield        #90  <Field char[] _inputBuffer>
	//   30   57:iload_1         
	//   31   58:iload_2         
	//   32   59:iload_1         
	//   33   60:iadd            
	//   34   61:invokestatic    #100 <Method char[] Arrays.copyOfRange(char[], int, int)>
	//   35   64:areturn         
		}
		i = size();
	//   36   65:aload_0         
	//   37   66:invokevirtual   #104 <Method int size()>
	//   38   69:istore_1        
		if(i < 1)
	//*  39   70:iload_1         
	//*  40   71:iconst_1        
	//*  41   72:icmpge          79
			return NO_CHARS;
	//   42   75:getstatic       #27  <Field char[] NO_CHARS>
	//   43   78:areturn         
		char ac[] = carr(i);
	//   44   79:aload_0         
	//   45   80:iload_1         
	//   46   81:invokespecial   #75  <Method char[] carr(int)>
	//   47   84:astore          5
		ArrayList arraylist = _segments;
	//   48   86:aload_0         
	//   49   87:getfield        #54  <Field ArrayList _segments>
	//   50   90:astore          6
		int i1;
		if(arraylist != null)
	//*  51   92:aload           6
	//*  52   94:ifnull          154
		{
			int j1 = arraylist.size();
	//   53   97:aload           6
	//   54   99:invokevirtual   #105 <Method int ArrayList.size()>
	//   55  102:istore          4
			int l = 0;
	//   56  104:iconst_0        
	//   57  105:istore_2        
			int j = 0;
	//   58  106:iconst_0        
	//   59  107:istore_1        
			do
			{
				i1 = j;
	//   60  108:iload_1         
	//   61  109:istore_3        
				if(l >= j1)
					break;
	//   62  110:iload_2         
	//   63  111:iload           4
	//   64  113:icmpge          156
				char ac1[] = (char[])_segments.get(l);
	//   65  116:aload_0         
	//   66  117:getfield        #54  <Field ArrayList _segments>
	//   67  120:iload_2         
	//   68  121:invokevirtual   #109 <Method Object ArrayList.get(int)>
	//   69  124:checkcast       #110 <Class char[]>
	//   70  127:astore          6
				i1 = ac1.length;
	//   71  129:aload           6
	//   72  131:arraylength     
	//   73  132:istore_3        
				System.arraycopy(((Object) (ac1)), 0, ((Object) (ac)), j, i1);
	//   74  133:aload           6
	//   75  135:iconst_0        
	//   76  136:aload           5
	//   77  138:iload_1         
	//   78  139:iload_3         
	//   79  140:invokestatic    #116 <Method void System.arraycopy(Object, int, Object, int, int)>
				j += i1;
	//   80  143:iload_1         
	//   81  144:iload_3         
	//   82  145:iadd            
	//   83  146:istore_1        
				l++;
	//   84  147:iload_2         
	//   85  148:iconst_1        
	//   86  149:iadd            
	//   87  150:istore_2        
			} while(true);
	//   88  151:goto            108
		} else
		{
			i1 = 0;
	//   89  154:iconst_0        
	//   90  155:istore_3        
		}
		System.arraycopy(((Object) (_currentSegment)), 0, ((Object) (ac)), i1, _currentSize);
	//   91  156:aload_0         
	//   92  157:getfield        #68  <Field char[] _currentSegment>
	//   93  160:iconst_0        
	//   94  161:aload           5
	//   95  163:iload_3         
	//   96  164:aload_0         
	//   97  165:getfield        #63  <Field int _currentSize>
	//   98  168:invokestatic    #116 <Method void System.arraycopy(Object, int, Object, int, int)>
		return ac;
	//   99  171:aload           5
	//  100  173:areturn         
	}

	private void unshare(int i)
	{
		int j = _inputLen;
	//    0    0:aload_0         
	//    1    1:getfield        #88  <Field int _inputLen>
	//    2    4:istore_2        
		_inputLen = 0;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #88  <Field int _inputLen>
		char ac[] = _inputBuffer;
	//    6   10:aload_0         
	//    7   11:getfield        #90  <Field char[] _inputBuffer>
	//    8   14:astore          4
		_inputBuffer = null;
	//    9   16:aload_0         
	//   10   17:aconst_null     
	//   11   18:putfield        #90  <Field char[] _inputBuffer>
		int k = _inputStart;
	//   12   21:aload_0         
	//   13   22:getfield        #86  <Field int _inputStart>
	//   14   25:istore_3        
		_inputStart = -1;
	//   15   26:aload_0         
	//   16   27:iconst_m1       
	//   17   28:putfield        #86  <Field int _inputStart>
		i += j;
	//   18   31:iload_1         
	//   19   32:iload_2         
	//   20   33:iadd            
	//   21   34:istore_1        
		char ac1[] = _currentSegment;
	//   22   35:aload_0         
	//   23   36:getfield        #68  <Field char[] _currentSegment>
	//   24   39:astore          5
		if(ac1 == null || i > ac1.length)
	//*  25   41:aload           5
	//*  26   43:ifnull          53
	//*  27   46:iload_1         
	//*  28   47:aload           5
	//*  29   49:arraylength     
	//*  30   50:icmple          62
			_currentSegment = buf(i);
	//   31   53:aload_0         
	//   32   54:aload_0         
	//   33   55:iload_1         
	//   34   56:invokespecial   #119 <Method char[] buf(int)>
	//   35   59:putfield        #68  <Field char[] _currentSegment>
		if(j > 0)
	//*  36   62:iload_2         
	//*  37   63:ifle            78
			System.arraycopy(((Object) (ac)), k, ((Object) (_currentSegment)), 0, j);
	//   38   66:aload           4
	//   39   68:iload_3         
	//   40   69:aload_0         
	//   41   70:getfield        #68  <Field char[] _currentSegment>
	//   42   73:iconst_0        
	//   43   74:iload_2         
	//   44   75:invokestatic    #116 <Method void System.arraycopy(Object, int, Object, int, int)>
		_segmentSize = 0;
	//   45   78:aload_0         
	//   46   79:iconst_0        
	//   47   80:putfield        #61  <Field int _segmentSize>
		_currentSize = j;
	//   48   83:aload_0         
	//   49   84:iload_2         
	//   50   85:putfield        #63  <Field int _currentSize>
	//   51   88:return          
	}

	public void append(char c)
	{
		if(_inputStart >= 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #86  <Field int _inputStart>
	//*   2    4:iflt            13
			unshare(16);
	//    3    7:aload_0         
	//    4    8:bipush          16
	//    5   10:invokespecial   #123 <Method void unshare(int)>
		_resultString = null;
	//    6   13:aload_0         
	//    7   14:aconst_null     
	//    8   15:putfield        #79  <Field String _resultString>
		_resultArray = null;
	//    9   18:aload_0         
	//   10   19:aconst_null     
	//   11   20:putfield        #125 <Field char[] _resultArray>
		char ac1[] = _currentSegment;
	//   12   23:aload_0         
	//   13   24:getfield        #68  <Field char[] _currentSegment>
	//   14   27:astore          4
		char ac[] = ac1;
	//   15   29:aload           4
	//   16   31:astore_3        
		if(_currentSize >= ac1.length)
	//*  17   32:aload_0         
	//*  18   33:getfield        #63  <Field int _currentSize>
	//*  19   36:aload           4
	//*  20   38:arraylength     
	//*  21   39:icmplt          52
		{
			expand(1);
	//   22   42:aload_0         
	//   23   43:iconst_1        
	//   24   44:invokespecial   #127 <Method void expand(int)>
			ac = _currentSegment;
	//   25   47:aload_0         
	//   26   48:getfield        #68  <Field char[] _currentSegment>
	//   27   51:astore_3        
		}
		int i = _currentSize;
	//   28   52:aload_0         
	//   29   53:getfield        #63  <Field int _currentSize>
	//   30   56:istore_2        
		_currentSize = i + 1;
	//   31   57:aload_0         
	//   32   58:iload_2         
	//   33   59:iconst_1        
	//   34   60:iadd            
	//   35   61:putfield        #63  <Field int _currentSize>
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
	//*   1    1:getfield        #86  <Field int _inputStart>
	//*   2    4:iflt            12
			unshare(j);
	//    3    7:aload_0         
	//    4    8:iload_3         
	//    5    9:invokespecial   #123 <Method void unshare(int)>
		_resultString = null;
	//    6   12:aload_0         
	//    7   13:aconst_null     
	//    8   14:putfield        #79  <Field String _resultString>
		_resultArray = null;
	//    9   17:aload_0         
	//   10   18:aconst_null     
	//   11   19:putfield        #125 <Field char[] _resultArray>
		char ac[] = _currentSegment;
	//   12   22:aload_0         
	//   13   23:getfield        #68  <Field char[] _currentSegment>
	//   14   26:astore          8
		int k = ac.length;
	//   15   28:aload           8
	//   16   30:arraylength     
	//   17   31:istore          4
		int i1 = _currentSize;
	//   18   33:aload_0         
	//   19   34:getfield        #63  <Field int _currentSize>
	//   20   37:istore          6
		int j1 = k - i1;
	//   21   39:iload           4
	//   22   41:iload           6
	//   23   43:isub            
	//   24   44:istore          7
		if(j1 >= j)
	//*  25   46:iload           7
	//*  26   48:iload_3         
	//*  27   49:icmplt          75
		{
			s.getChars(i, i + j, ac, i1);
	//   28   52:aload_1         
	//   29   53:iload_2         
	//   30   54:iload_2         
	//   31   55:iload_3         
	//   32   56:iadd            
	//   33   57:aload           8
	//   34   59:iload           6
	//   35   61:invokevirtual   #132 <Method void String.getChars(int, int, char[], int)>
			_currentSize = _currentSize + j;
	//   36   64:aload_0         
	//   37   65:aload_0         
	//   38   66:getfield        #63  <Field int _currentSize>
	//   39   69:iload_3         
	//   40   70:iadd            
	//   41   71:putfield        #63  <Field int _currentSize>
			return;
	//   42   74:return          
		}
		k = i;
	//   43   75:iload_2         
	//   44   76:istore          4
		int l = j;
	//   45   78:iload_3         
	//   46   79:istore          5
		if(j1 > 0)
	//*  47   81:iload           7
	//*  48   83:ifle            109
		{
			k = i + j1;
	//   49   86:iload_2         
	//   50   87:iload           7
	//   51   89:iadd            
	//   52   90:istore          4
			s.getChars(i, k, ac, i1);
	//   53   92:aload_1         
	//   54   93:iload_2         
	//   55   94:iload           4
	//   56   96:aload           8
	//   57   98:iload           6
	//   58  100:invokevirtual   #132 <Method void String.getChars(int, int, char[], int)>
			l = j - j1;
	//   59  103:iload_3         
	//   60  104:iload           7
	//   61  106:isub            
	//   62  107:istore          5
		}
		do
		{
			expand(l);
	//   63  109:aload_0         
	//   64  110:iload           5
	//   65  112:invokespecial   #127 <Method void expand(int)>
			j = Math.min(_currentSegment.length, l);
	//   66  115:aload_0         
	//   67  116:getfield        #68  <Field char[] _currentSegment>
	//   68  119:arraylength     
	//   69  120:iload           5
	//   70  122:invokestatic    #135 <Method int Math.min(int, int)>
	//   71  125:istore_3        
			i = k + j;
	//   72  126:iload           4
	//   73  128:iload_3         
	//   74  129:iadd            
	//   75  130:istore_2        
			s.getChars(k, i, _currentSegment, 0);
	//   76  131:aload_1         
	//   77  132:iload           4
	//   78  134:iload_2         
	//   79  135:aload_0         
	//   80  136:getfield        #68  <Field char[] _currentSegment>
	//   81  139:iconst_0        
	//   82  140:invokevirtual   #132 <Method void String.getChars(int, int, char[], int)>
			_currentSize = _currentSize + j;
	//   83  143:aload_0         
	//   84  144:aload_0         
	//   85  145:getfield        #63  <Field int _currentSize>
	//   86  148:iload_3         
	//   87  149:iadd            
	//   88  150:putfield        #63  <Field int _currentSize>
			l -= j;
	//   89  153:iload           5
	//   90  155:iload_3         
	//   91  156:isub            
	//   92  157:istore          5
			if(l <= 0)
	//*  93  159:iload           5
	//*  94  161:ifgt            165
				return;
	//   95  164:return          
			k = i;
	//   96  165:iload_2         
	//   97  166:istore          4
		} while(true);
	//   98  168:goto            109
	}

	public void append(char ac[], int i, int j)
	{
		if(_inputStart >= 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #86  <Field int _inputStart>
	//*   2    4:iflt            12
			unshare(j);
	//    3    7:aload_0         
	//    4    8:iload_3         
	//    5    9:invokespecial   #123 <Method void unshare(int)>
		_resultString = null;
	//    6   12:aload_0         
	//    7   13:aconst_null     
	//    8   14:putfield        #79  <Field String _resultString>
		_resultArray = null;
	//    9   17:aload_0         
	//   10   18:aconst_null     
	//   11   19:putfield        #125 <Field char[] _resultArray>
		char ac1[] = _currentSegment;
	//   12   22:aload_0         
	//   13   23:getfield        #68  <Field char[] _currentSegment>
	//   14   26:astore          8
		int k = ac1.length;
	//   15   28:aload           8
	//   16   30:arraylength     
	//   17   31:istore          4
		int i1 = _currentSize;
	//   18   33:aload_0         
	//   19   34:getfield        #63  <Field int _currentSize>
	//   20   37:istore          6
		int j1 = k - i1;
	//   21   39:iload           4
	//   22   41:iload           6
	//   23   43:isub            
	//   24   44:istore          7
		if(j1 >= j)
	//*  25   46:iload           7
	//*  26   48:iload_3         
	//*  27   49:icmplt          73
		{
			System.arraycopy(((Object) (ac)), i, ((Object) (ac1)), i1, j);
	//   28   52:aload_1         
	//   29   53:iload_2         
	//   30   54:aload           8
	//   31   56:iload           6
	//   32   58:iload_3         
	//   33   59:invokestatic    #116 <Method void System.arraycopy(Object, int, Object, int, int)>
			_currentSize = _currentSize + j;
	//   34   62:aload_0         
	//   35   63:aload_0         
	//   36   64:getfield        #63  <Field int _currentSize>
	//   37   67:iload_3         
	//   38   68:iadd            
	//   39   69:putfield        #63  <Field int _currentSize>
			return;
	//   40   72:return          
		}
		int l = i;
	//   41   73:iload_2         
	//   42   74:istore          5
		k = j;
	//   43   76:iload_3         
	//   44   77:istore          4
		if(j1 > 0)
	//*  45   79:iload           7
	//*  46   81:ifle            107
		{
			System.arraycopy(((Object) (ac)), i, ((Object) (ac1)), i1, j1);
	//   47   84:aload_1         
	//   48   85:iload_2         
	//   49   86:aload           8
	//   50   88:iload           6
	//   51   90:iload           7
	//   52   92:invokestatic    #116 <Method void System.arraycopy(Object, int, Object, int, int)>
			l = i + j1;
	//   53   95:iload_2         
	//   54   96:iload           7
	//   55   98:iadd            
	//   56   99:istore          5
			k = j - j1;
	//   57  101:iload_3         
	//   58  102:iload           7
	//   59  104:isub            
	//   60  105:istore          4
		}
		do
		{
			expand(k);
	//   61  107:aload_0         
	//   62  108:iload           4
	//   63  110:invokespecial   #127 <Method void expand(int)>
			i = Math.min(_currentSegment.length, k);
	//   64  113:aload_0         
	//   65  114:getfield        #68  <Field char[] _currentSegment>
	//   66  117:arraylength     
	//   67  118:iload           4
	//   68  120:invokestatic    #135 <Method int Math.min(int, int)>
	//   69  123:istore_2        
			System.arraycopy(((Object) (ac)), l, ((Object) (_currentSegment)), 0, i);
	//   70  124:aload_1         
	//   71  125:iload           5
	//   72  127:aload_0         
	//   73  128:getfield        #68  <Field char[] _currentSegment>
	//   74  131:iconst_0        
	//   75  132:iload_2         
	//   76  133:invokestatic    #116 <Method void System.arraycopy(Object, int, Object, int, int)>
			_currentSize = _currentSize + i;
	//   77  136:aload_0         
	//   78  137:aload_0         
	//   79  138:getfield        #63  <Field int _currentSize>
	//   80  141:iload_2         
	//   81  142:iadd            
	//   82  143:putfield        #63  <Field int _currentSize>
			l += i;
	//   83  146:iload           5
	//   84  148:iload_2         
	//   85  149:iadd            
	//   86  150:istore          5
			i = k - i;
	//   87  152:iload           4
	//   88  154:iload_2         
	//   89  155:isub            
	//   90  156:istore_2        
			k = i;
	//   91  157:iload_2         
	//   92  158:istore          4
		} while(i > 0);
	//   93  160:iload_2         
	//   94  161:ifgt            107
	//   95  164:return          
	}

	public char[] contentsAsArray()
	{
		char ac1[] = _resultArray;
	//    0    0:aload_0         
	//    1    1:getfield        #125 <Field char[] _resultArray>
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
	//    8   12:invokespecial   #139 <Method char[] resultArray()>
	//    9   15:astore_1        
			_resultArray = ac;
	//   10   16:aload_0         
	//   11   17:aload_1         
	//   12   18:putfield        #125 <Field char[] _resultArray>
		}
		return ac;
	//   13   21:aload_1         
	//   14   22:areturn         
	}

	public BigDecimal contentsAsDecimal()
		throws NumberFormatException
	{
		char ac[] = _resultArray;
	//    0    0:aload_0         
	//    1    1:getfield        #125 <Field char[] _resultArray>
	//    2    4:astore_2        
		if(ac != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          14
			return NumberInput.parseBigDecimal(ac);
	//    5    9:aload_2         
	//    6   10:invokestatic    #149 <Method BigDecimal NumberInput.parseBigDecimal(char[])>
	//    7   13:areturn         
		int i = _inputStart;
	//    8   14:aload_0         
	//    9   15:getfield        #86  <Field int _inputStart>
	//   10   18:istore_1        
		if(i >= 0)
	//*  11   19:iload_1         
	//*  12   20:iflt            42
		{
			char ac1[] = _inputBuffer;
	//   13   23:aload_0         
	//   14   24:getfield        #90  <Field char[] _inputBuffer>
	//   15   27:astore_2        
			if(ac1 != null)
	//*  16   28:aload_2         
	//*  17   29:ifnull          42
				return NumberInput.parseBigDecimal(ac1, i, _inputLen);
	//   18   32:aload_2         
	//   19   33:iload_1         
	//   20   34:aload_0         
	//   21   35:getfield        #88  <Field int _inputLen>
	//   22   38:invokestatic    #152 <Method BigDecimal NumberInput.parseBigDecimal(char[], int, int)>
	//   23   41:areturn         
		}
		if(_segmentSize == 0)
	//*  24   42:aload_0         
	//*  25   43:getfield        #61  <Field int _segmentSize>
	//*  26   46:ifne            68
		{
			char ac2[] = _currentSegment;
	//   27   49:aload_0         
	//   28   50:getfield        #68  <Field char[] _currentSegment>
	//   29   53:astore_2        
			if(ac2 != null)
	//*  30   54:aload_2         
	//*  31   55:ifnull          68
				return NumberInput.parseBigDecimal(ac2, 0, _currentSize);
	//   32   58:aload_2         
	//   33   59:iconst_0        
	//   34   60:aload_0         
	//   35   61:getfield        #63  <Field int _currentSize>
	//   36   64:invokestatic    #152 <Method BigDecimal NumberInput.parseBigDecimal(char[], int, int)>
	//   37   67:areturn         
		}
		return NumberInput.parseBigDecimal(contentsAsArray());
	//   38   68:aload_0         
	//   39   69:invokevirtual   #154 <Method char[] contentsAsArray()>
	//   40   72:invokestatic    #149 <Method BigDecimal NumberInput.parseBigDecimal(char[])>
	//   41   75:areturn         
	}

	public double contentsAsDouble()
		throws NumberFormatException
	{
		return NumberInput.parseDouble(contentsAsString());
	//    0    0:aload_0         
	//    1    1:invokevirtual   #161 <Method String contentsAsString()>
	//    2    4:invokestatic    #165 <Method double NumberInput.parseDouble(String)>
	//    3    7:dreturn         
	}

	public int contentsAsInt(boolean flag)
	{
		int i = _inputStart;
	//    0    0:aload_0         
	//    1    1:getfield        #86  <Field int _inputStart>
	//    2    4:istore_2        
		if(i >= 0)
	//*   3    5:iload_2         
	//*   4    6:iflt            47
		{
			char ac[] = _inputBuffer;
	//    5    9:aload_0         
	//    6   10:getfield        #90  <Field char[] _inputBuffer>
	//    7   13:astore_3        
			if(ac != null)
	//*   8   14:aload_3         
	//*   9   15:ifnull          47
				if(flag)
	//*  10   18:iload_1         
	//*  11   19:ifeq            37
					return -NumberInput.parseInt(ac, i + 1, _inputLen - 1);
	//   12   22:aload_3         
	//   13   23:iload_2         
	//   14   24:iconst_1        
	//   15   25:iadd            
	//   16   26:aload_0         
	//   17   27:getfield        #88  <Field int _inputLen>
	//   18   30:iconst_1        
	//   19   31:isub            
	//   20   32:invokestatic    #171 <Method int NumberInput.parseInt(char[], int, int)>
	//   21   35:ineg            
	//   22   36:ireturn         
				else
					return NumberInput.parseInt(ac, i, _inputLen);
	//   23   37:aload_3         
	//   24   38:iload_2         
	//   25   39:aload_0         
	//   26   40:getfield        #88  <Field int _inputLen>
	//   27   43:invokestatic    #171 <Method int NumberInput.parseInt(char[], int, int)>
	//   28   46:ireturn         
		}
		if(flag)
	//*  29   47:iload_1         
	//*  30   48:ifeq            67
			return -NumberInput.parseInt(_currentSegment, 1, _currentSize - 1);
	//   31   51:aload_0         
	//   32   52:getfield        #68  <Field char[] _currentSegment>
	//   33   55:iconst_1        
	//   34   56:aload_0         
	//   35   57:getfield        #63  <Field int _currentSize>
	//   36   60:iconst_1        
	//   37   61:isub            
	//   38   62:invokestatic    #171 <Method int NumberInput.parseInt(char[], int, int)>
	//   39   65:ineg            
	//   40   66:ireturn         
		else
			return NumberInput.parseInt(_currentSegment, 0, _currentSize);
	//   41   67:aload_0         
	//   42   68:getfield        #68  <Field char[] _currentSegment>
	//   43   71:iconst_0        
	//   44   72:aload_0         
	//   45   73:getfield        #63  <Field int _currentSize>
	//   46   76:invokestatic    #171 <Method int NumberInput.parseInt(char[], int, int)>
	//   47   79:ireturn         
	}

	public long contentsAsLong(boolean flag)
	{
		int i = _inputStart;
	//    0    0:aload_0         
	//    1    1:getfield        #86  <Field int _inputStart>
	//    2    4:istore_2        
		if(i >= 0)
	//*   3    5:iload_2         
	//*   4    6:iflt            47
		{
			char ac[] = _inputBuffer;
	//    5    9:aload_0         
	//    6   10:getfield        #90  <Field char[] _inputBuffer>
	//    7   13:astore_3        
			if(ac != null)
	//*   8   14:aload_3         
	//*   9   15:ifnull          47
				if(flag)
	//*  10   18:iload_1         
	//*  11   19:ifeq            37
					return -NumberInput.parseLong(ac, i + 1, _inputLen - 1);
	//   12   22:aload_3         
	//   13   23:iload_2         
	//   14   24:iconst_1        
	//   15   25:iadd            
	//   16   26:aload_0         
	//   17   27:getfield        #88  <Field int _inputLen>
	//   18   30:iconst_1        
	//   19   31:isub            
	//   20   32:invokestatic    #177 <Method long NumberInput.parseLong(char[], int, int)>
	//   21   35:lneg            
	//   22   36:lreturn         
				else
					return NumberInput.parseLong(ac, i, _inputLen);
	//   23   37:aload_3         
	//   24   38:iload_2         
	//   25   39:aload_0         
	//   26   40:getfield        #88  <Field int _inputLen>
	//   27   43:invokestatic    #177 <Method long NumberInput.parseLong(char[], int, int)>
	//   28   46:lreturn         
		}
		if(flag)
	//*  29   47:iload_1         
	//*  30   48:ifeq            67
			return -NumberInput.parseLong(_currentSegment, 1, _currentSize - 1);
	//   31   51:aload_0         
	//   32   52:getfield        #68  <Field char[] _currentSegment>
	//   33   55:iconst_1        
	//   34   56:aload_0         
	//   35   57:getfield        #63  <Field int _currentSize>
	//   36   60:iconst_1        
	//   37   61:isub            
	//   38   62:invokestatic    #177 <Method long NumberInput.parseLong(char[], int, int)>
	//   39   65:lneg            
	//   40   66:lreturn         
		else
			return NumberInput.parseLong(_currentSegment, 0, _currentSize);
	//   41   67:aload_0         
	//   42   68:getfield        #68  <Field char[] _currentSegment>
	//   43   71:iconst_0        
	//   44   72:aload_0         
	//   45   73:getfield        #63  <Field int _currentSize>
	//   46   76:invokestatic    #177 <Method long NumberInput.parseLong(char[], int, int)>
	//   47   79:lreturn         
	}

	public String contentsAsString()
	{
		if(_resultString == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #79  <Field String _resultString>
	//*   2    4:ifnonnull       213
		{
			char ac[] = _resultArray;
	//    3    7:aload_0         
	//    4    8:getfield        #125 <Field char[] _resultArray>
	//    5   11:astore_3        
			if(ac != null)
	//*   6   12:aload_3         
	//*   7   13:ifnull          31
			{
				_resultString = new String(ac);
	//    8   16:aload_0         
	//    9   17:new             #81  <Class String>
	//   10   20:dup             
	//   11   21:aload_3         
	//   12   22:invokespecial   #180 <Method void String(char[])>
	//   13   25:putfield        #79  <Field String _resultString>
			} else
	//*  14   28:goto            213
			{
				int i = _inputStart;
	//   15   31:aload_0         
	//   16   32:getfield        #86  <Field int _inputStart>
	//   17   35:istore_1        
				if(i >= 0)
	//*  18   36:iload_1         
	//*  19   37:iflt            79
				{
					int l = _inputLen;
	//   20   40:aload_0         
	//   21   41:getfield        #88  <Field int _inputLen>
	//   22   44:istore_2        
					if(l < 1)
	//*  23   45:iload_2         
	//*  24   46:iconst_1        
	//*  25   47:icmpge          59
					{
						_resultString = "";
	//   26   50:aload_0         
	//   27   51:ldc1            #182 <String "">
	//   28   53:putfield        #79  <Field String _resultString>
						return "";
	//   29   56:ldc1            #182 <String "">
	//   30   58:areturn         
					}
					_resultString = new String(_inputBuffer, i, l);
	//   31   59:aload_0         
	//   32   60:new             #81  <Class String>
	//   33   63:dup             
	//   34   64:aload_0         
	//   35   65:getfield        #90  <Field char[] _inputBuffer>
	//   36   68:iload_1         
	//   37   69:iload_2         
	//   38   70:invokespecial   #184 <Method void String(char[], int, int)>
	//   39   73:putfield        #79  <Field String _resultString>
				} else
	//*  40   76:goto            213
				{
					int j = _segmentSize;
	//   41   79:aload_0         
	//   42   80:getfield        #61  <Field int _segmentSize>
	//   43   83:istore_1        
					int i1 = _currentSize;
	//   44   84:aload_0         
	//   45   85:getfield        #63  <Field int _currentSize>
	//   46   88:istore_2        
					if(j == 0)
	//*  47   89:iload_1         
	//*  48   90:ifne            125
					{
						String s;
						if(i1 == 0)
	//*  49   93:iload_2         
	//*  50   94:ifne            103
							s = "";
	//   51   97:ldc1            #182 <String "">
	//   52   99:astore_3        
						else
	//*  53  100:goto            117
							s = new String(_currentSegment, 0, i1);
	//   54  103:new             #81  <Class String>
	//   55  106:dup             
	//   56  107:aload_0         
	//   57  108:getfield        #68  <Field char[] _currentSegment>
	//   58  111:iconst_0        
	//   59  112:iload_2         
	//   60  113:invokespecial   #184 <Method void String(char[], int, int)>
	//   61  116:astore_3        
						_resultString = s;
	//   62  117:aload_0         
	//   63  118:aload_3         
	//   64  119:putfield        #79  <Field String _resultString>
					} else
	//*  65  122:goto            213
					{
						StringBuilder stringbuilder = new StringBuilder(j + i1);
	//   66  125:new             #186 <Class StringBuilder>
	//   67  128:dup             
	//   68  129:iload_1         
	//   69  130:iload_2         
	//   70  131:iadd            
	//   71  132:invokespecial   #188 <Method void StringBuilder(int)>
	//   72  135:astore_3        
						ArrayList arraylist = _segments;
	//   73  136:aload_0         
	//   74  137:getfield        #54  <Field ArrayList _segments>
	//   75  140:astore          4
						if(arraylist != null)
	//*  76  142:aload           4
	//*  77  144:ifnull          191
						{
							int j1 = arraylist.size();
	//   78  147:aload           4
	//   79  149:invokevirtual   #105 <Method int ArrayList.size()>
	//   80  152:istore_2        
							for(int k = 0; k < j1; k++)
	//*  81  153:iconst_0        
	//*  82  154:istore_1        
	//*  83  155:iload_1         
	//*  84  156:iload_2         
	//*  85  157:icmpge          191
							{
								char ac1[] = (char[])_segments.get(k);
	//   86  160:aload_0         
	//   87  161:getfield        #54  <Field ArrayList _segments>
	//   88  164:iload_1         
	//   89  165:invokevirtual   #109 <Method Object ArrayList.get(int)>
	//   90  168:checkcast       #110 <Class char[]>
	//   91  171:astore          4
								stringbuilder.append(ac1, 0, ac1.length);
	//   92  173:aload_3         
	//   93  174:aload           4
	//   94  176:iconst_0        
	//   95  177:aload           4
	//   96  179:arraylength     
	//   97  180:invokevirtual   #191 <Method StringBuilder StringBuilder.append(char[], int, int)>
	//   98  183:pop             
							}

	//   99  184:iload_1         
	//  100  185:iconst_1        
	//  101  186:iadd            
	//  102  187:istore_1        
						}
	//* 103  188:goto            155
						stringbuilder.append(_currentSegment, 0, _currentSize);
	//  104  191:aload_3         
	//  105  192:aload_0         
	//  106  193:getfield        #68  <Field char[] _currentSegment>
	//  107  196:iconst_0        
	//  108  197:aload_0         
	//  109  198:getfield        #63  <Field int _currentSize>
	//  110  201:invokevirtual   #191 <Method StringBuilder StringBuilder.append(char[], int, int)>
	//  111  204:pop             
						_resultString = stringbuilder.toString();
	//  112  205:aload_0         
	//  113  206:aload_3         
	//  114  207:invokevirtual   #194 <Method String StringBuilder.toString()>
	//  115  210:putfield        #79  <Field String _resultString>
					}
				}
			}
		}
		return _resultString;
	//  116  213:aload_0         
	//  117  214:getfield        #79  <Field String _resultString>
	//  118  217:areturn         
	}

	public char[] emptyAndGetCurrentSegment()
	{
		_inputStart = -1;
	//    0    0:aload_0         
	//    1    1:iconst_m1       
	//    2    2:putfield        #86  <Field int _inputStart>
		_currentSize = 0;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #63  <Field int _currentSize>
		_inputLen = 0;
	//    6   10:aload_0         
	//    7   11:iconst_0        
	//    8   12:putfield        #88  <Field int _inputLen>
		_inputBuffer = null;
	//    9   15:aload_0         
	//   10   16:aconst_null     
	//   11   17:putfield        #90  <Field char[] _inputBuffer>
		_resultString = null;
	//   12   20:aload_0         
	//   13   21:aconst_null     
	//   14   22:putfield        #79  <Field String _resultString>
		_resultArray = null;
	//   15   25:aload_0         
	//   16   26:aconst_null     
	//   17   27:putfield        #125 <Field char[] _resultArray>
		if(_hasSegments)
	//*  18   30:aload_0         
	//*  19   31:getfield        #52  <Field boolean _hasSegments>
	//*  20   34:ifeq            41
			clearSegments();
	//   21   37:aload_0         
	//   22   38:invokespecial   #197 <Method void clearSegments()>
		char ac1[] = _currentSegment;
	//   23   41:aload_0         
	//   24   42:getfield        #68  <Field char[] _currentSegment>
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
	//   32   54:invokespecial   #119 <Method char[] buf(int)>
	//   33   57:astore_1        
			_currentSegment = ac;
	//   34   58:aload_0         
	//   35   59:aload_1         
	//   36   60:putfield        #68  <Field char[] _currentSegment>
		}
		return ac;
	//   37   63:aload_1         
	//   38   64:areturn         
	}

	public char[] expandCurrentSegment()
	{
		char ac[] = _currentSegment;
	//    0    0:aload_0         
	//    1    1:getfield        #68  <Field char[] _currentSegment>
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
	//*  15   19:ldc1            #73  <Int 0x40000>
	//*  16   21:icmple          30
			i = (k >> 2) + k;
	//   17   24:iload_3         
	//   18   25:iconst_2        
	//   19   26:ishr            
	//   20   27:iload_3         
	//   21   28:iadd            
	//   22   29:istore_1        
		ac = Arrays.copyOf(ac, i);
	//   23   30:aload           4
	//   24   32:iload_1         
	//   25   33:invokestatic    #96  <Method char[] Arrays.copyOf(char[], int)>
	//   26   36:astore          4
		_currentSegment = ac;
	//   27   38:aload_0         
	//   28   39:aload           4
	//   29   41:putfield        #68  <Field char[] _currentSegment>
		return ac;
	//   30   44:aload           4
	//   31   46:areturn         
	}

	public char[] finishCurrentSegment()
	{
		if(_segments == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #54  <Field ArrayList _segments>
	//*   2    4:ifnonnull       18
			_segments = new ArrayList();
	//    3    7:aload_0         
	//    4    8:new             #56  <Class ArrayList>
	//    5   11:dup             
	//    6   12:invokespecial   #66  <Method void ArrayList()>
	//    7   15:putfield        #54  <Field ArrayList _segments>
		_hasSegments = true;
	//    8   18:aload_0         
	//    9   19:iconst_1        
	//   10   20:putfield        #52  <Field boolean _hasSegments>
		_segments.add(((Object) (_currentSegment)));
	//   11   23:aload_0         
	//   12   24:getfield        #54  <Field ArrayList _segments>
	//   13   27:aload_0         
	//   14   28:getfield        #68  <Field char[] _currentSegment>
	//   15   31:invokevirtual   #72  <Method boolean ArrayList.add(Object)>
	//   16   34:pop             
		int i = _currentSegment.length;
	//   17   35:aload_0         
	//   18   36:getfield        #68  <Field char[] _currentSegment>
	//   19   39:arraylength     
	//   20   40:istore_1        
		_segmentSize = _segmentSize + i;
	//   21   41:aload_0         
	//   22   42:aload_0         
	//   23   43:getfield        #61  <Field int _segmentSize>
	//   24   46:iload_1         
	//   25   47:iadd            
	//   26   48:putfield        #61  <Field int _segmentSize>
		_currentSize = 0;
	//   27   51:aload_0         
	//   28   52:iconst_0        
	//   29   53:putfield        #63  <Field int _currentSize>
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
	//*  45   79:ldc1            #73  <Int 0x40000>
	//*  46   81:icmple          87
				i = 0x40000;
	//   47   84:ldc1            #73  <Int 0x40000>
	//   48   86:istore_1        
		}
		char ac[] = carr(i);
	//   49   87:aload_0         
	//   50   88:iload_1         
	//   51   89:invokespecial   #75  <Method char[] carr(int)>
	//   52   92:astore_3        
		_currentSegment = ac;
	//   53   93:aload_0         
	//   54   94:aload_3         
	//   55   95:putfield        #68  <Field char[] _currentSegment>
		return ac;
	//   56   98:aload_3         
	//   57   99:areturn         
	}

	public char[] getCurrentSegment()
	{
		if(_inputStart >= 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #86  <Field int _inputStart>
	//*   2    4:iflt            15
		{
			unshare(1);
	//    3    7:aload_0         
	//    4    8:iconst_1        
	//    5    9:invokespecial   #123 <Method void unshare(int)>
		} else
	//*   6   12:goto            50
		{
			char ac[] = _currentSegment;
	//    7   15:aload_0         
	//    8   16:getfield        #68  <Field char[] _currentSegment>
	//    9   19:astore_1        
			if(ac == null)
	//*  10   20:aload_1         
	//*  11   21:ifnonnull       36
				_currentSegment = buf(0);
	//   12   24:aload_0         
	//   13   25:aload_0         
	//   14   26:iconst_0        
	//   15   27:invokespecial   #119 <Method char[] buf(int)>
	//   16   30:putfield        #68  <Field char[] _currentSegment>
			else
	//*  17   33:goto            50
			if(_currentSize >= ac.length)
	//*  18   36:aload_0         
	//*  19   37:getfield        #63  <Field int _currentSize>
	//*  20   40:aload_1         
	//*  21   41:arraylength     
	//*  22   42:icmplt          50
				expand(1);
	//   23   45:aload_0         
	//   24   46:iconst_1        
	//   25   47:invokespecial   #127 <Method void expand(int)>
		}
		return _currentSegment;
	//   26   50:aload_0         
	//   27   51:getfield        #68  <Field char[] _currentSegment>
	//   28   54:areturn         
	}

	public int getCurrentSegmentSize()
	{
		return _currentSize;
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field int _currentSize>
	//    2    4:ireturn         
	}

	public char[] getTextBuffer()
	{
		if(_inputStart >= 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #86  <Field int _inputStart>
	//*   2    4:iflt            12
			return _inputBuffer;
	//    3    7:aload_0         
	//    4    8:getfield        #90  <Field char[] _inputBuffer>
	//    5   11:areturn         
		char ac[] = _resultArray;
	//    6   12:aload_0         
	//    7   13:getfield        #125 <Field char[] _resultArray>
	//    8   16:astore_1        
		if(ac != null)
	//*   9   17:aload_1         
	//*  10   18:ifnull          23
			return ac;
	//   11   21:aload_1         
	//   12   22:areturn         
		String s = _resultString;
	//   13   23:aload_0         
	//   14   24:getfield        #79  <Field String _resultString>
	//   15   27:astore_1        
		if(s != null)
	//*  16   28:aload_1         
	//*  17   29:ifnull          44
		{
			char ac1[] = s.toCharArray();
	//   18   32:aload_1         
	//   19   33:invokevirtual   #84  <Method char[] String.toCharArray()>
	//   20   36:astore_1        
			_resultArray = ac1;
	//   21   37:aload_0         
	//   22   38:aload_1         
	//   23   39:putfield        #125 <Field char[] _resultArray>
			return ac1;
	//   24   42:aload_1         
	//   25   43:areturn         
		}
		if(!_hasSegments)
	//*  26   44:aload_0         
	//*  27   45:getfield        #52  <Field boolean _hasSegments>
	//*  28   48:ifne            68
		{
			char ac3[] = _currentSegment;
	//   29   51:aload_0         
	//   30   52:getfield        #68  <Field char[] _currentSegment>
	//   31   55:astore_2        
			char ac2[] = ac3;
	//   32   56:aload_2         
	//   33   57:astore_1        
			if(ac3 == null)
	//*  34   58:aload_2         
	//*  35   59:ifnonnull       66
				ac2 = NO_CHARS;
	//   36   62:getstatic       #27  <Field char[] NO_CHARS>
	//   37   65:astore_1        
			return ac2;
	//   38   66:aload_1         
	//   39   67:areturn         
		} else
		{
			return contentsAsArray();
	//   40   68:aload_0         
	//   41   69:invokevirtual   #154 <Method char[] contentsAsArray()>
	//   42   72:areturn         
		}
	}

	public int getTextOffset()
	{
		int i = _inputStart;
	//    0    0:aload_0         
	//    1    1:getfield        #86  <Field int _inputStart>
	//    2    4:istore_1        
		if(i >= 0)
	//*   3    5:iload_1         
	//*   4    6:iflt            11
			return i;
	//    5    9:iload_1         
	//    6   10:ireturn         
		else
			return 0;
	//    7   11:iconst_0        
	//    8   12:ireturn         
	}

	public void releaseBuffers()
	{
		if(_allocator == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #34  <Field BufferRecycler _allocator>
	//*   2    4:ifnonnull       12
		{
			resetWithEmpty();
	//    3    7:aload_0         
	//    4    8:invokevirtual   #207 <Method void resetWithEmpty()>
			return;
	//    5   11:return          
		}
		if(_currentSegment != null)
	//*   6   12:aload_0         
	//*   7   13:getfield        #68  <Field char[] _currentSegment>
	//*   8   16:ifnull          42
		{
			resetWithEmpty();
	//    9   19:aload_0         
	//   10   20:invokevirtual   #207 <Method void resetWithEmpty()>
			char ac[] = _currentSegment;
	//   11   23:aload_0         
	//   12   24:getfield        #68  <Field char[] _currentSegment>
	//   13   27:astore_1        
			_currentSegment = null;
	//   14   28:aload_0         
	//   15   29:aconst_null     
	//   16   30:putfield        #68  <Field char[] _currentSegment>
			_allocator.releaseCharBuffer(2, ac);
	//   17   33:aload_0         
	//   18   34:getfield        #34  <Field BufferRecycler _allocator>
	//   19   37:iconst_2        
	//   20   38:aload_1         
	//   21   39:invokevirtual   #211 <Method void BufferRecycler.releaseCharBuffer(int, char[])>
		}
	//   22   42:return          
	}

	public void resetWithCopy(char ac[], int i, int j)
	{
		_inputBuffer = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #90  <Field char[] _inputBuffer>
		_inputStart = -1;
	//    3    5:aload_0         
	//    4    6:iconst_m1       
	//    5    7:putfield        #86  <Field int _inputStart>
		_inputLen = 0;
	//    6   10:aload_0         
	//    7   11:iconst_0        
	//    8   12:putfield        #88  <Field int _inputLen>
		_resultString = null;
	//    9   15:aload_0         
	//   10   16:aconst_null     
	//   11   17:putfield        #79  <Field String _resultString>
		_resultArray = null;
	//   12   20:aload_0         
	//   13   21:aconst_null     
	//   14   22:putfield        #125 <Field char[] _resultArray>
		if(_hasSegments)
	//*  15   25:aload_0         
	//*  16   26:getfield        #52  <Field boolean _hasSegments>
	//*  17   29:ifeq            39
			clearSegments();
	//   18   32:aload_0         
	//   19   33:invokespecial   #197 <Method void clearSegments()>
		else
	//*  20   36:goto            55
		if(_currentSegment == null)
	//*  21   39:aload_0         
	//*  22   40:getfield        #68  <Field char[] _currentSegment>
	//*  23   43:ifnonnull       55
			_currentSegment = buf(j);
	//   24   46:aload_0         
	//   25   47:aload_0         
	//   26   48:iload_3         
	//   27   49:invokespecial   #119 <Method char[] buf(int)>
	//   28   52:putfield        #68  <Field char[] _currentSegment>
		_segmentSize = 0;
	//   29   55:aload_0         
	//   30   56:iconst_0        
	//   31   57:putfield        #61  <Field int _segmentSize>
		_currentSize = 0;
	//   32   60:aload_0         
	//   33   61:iconst_0        
	//   34   62:putfield        #63  <Field int _currentSize>
		append(ac, i, j);
	//   35   65:aload_0         
	//   36   66:aload_1         
	//   37   67:iload_2         
	//   38   68:iload_3         
	//   39   69:invokevirtual   #214 <Method void append(char[], int, int)>
	//   40   72:return          
	}

	public void resetWithEmpty()
	{
		_inputStart = -1;
	//    0    0:aload_0         
	//    1    1:iconst_m1       
	//    2    2:putfield        #86  <Field int _inputStart>
		_currentSize = 0;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #63  <Field int _currentSize>
		_inputLen = 0;
	//    6   10:aload_0         
	//    7   11:iconst_0        
	//    8   12:putfield        #88  <Field int _inputLen>
		_inputBuffer = null;
	//    9   15:aload_0         
	//   10   16:aconst_null     
	//   11   17:putfield        #90  <Field char[] _inputBuffer>
		_resultString = null;
	//   12   20:aload_0         
	//   13   21:aconst_null     
	//   14   22:putfield        #79  <Field String _resultString>
		_resultArray = null;
	//   15   25:aload_0         
	//   16   26:aconst_null     
	//   17   27:putfield        #125 <Field char[] _resultArray>
		if(_hasSegments)
	//*  18   30:aload_0         
	//*  19   31:getfield        #52  <Field boolean _hasSegments>
	//*  20   34:ifeq            41
			clearSegments();
	//   21   37:aload_0         
	//   22   38:invokespecial   #197 <Method void clearSegments()>
	//   23   41:return          
	}

	public void resetWithShared(char ac[], int i, int j)
	{
		_resultString = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #79  <Field String _resultString>
		_resultArray = null;
	//    3    5:aload_0         
	//    4    6:aconst_null     
	//    5    7:putfield        #125 <Field char[] _resultArray>
		_inputBuffer = ac;
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:putfield        #90  <Field char[] _inputBuffer>
		_inputStart = i;
	//    9   15:aload_0         
	//   10   16:iload_2         
	//   11   17:putfield        #86  <Field int _inputStart>
		_inputLen = j;
	//   12   20:aload_0         
	//   13   21:iload_3         
	//   14   22:putfield        #88  <Field int _inputLen>
		if(_hasSegments)
	//*  15   25:aload_0         
	//*  16   26:getfield        #52  <Field boolean _hasSegments>
	//*  17   29:ifeq            36
			clearSegments();
	//   18   32:aload_0         
	//   19   33:invokespecial   #197 <Method void clearSegments()>
	//   20   36:return          
	}

	public void resetWithString(String s)
	{
		_inputBuffer = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #90  <Field char[] _inputBuffer>
		_inputStart = -1;
	//    3    5:aload_0         
	//    4    6:iconst_m1       
	//    5    7:putfield        #86  <Field int _inputStart>
		_inputLen = 0;
	//    6   10:aload_0         
	//    7   11:iconst_0        
	//    8   12:putfield        #88  <Field int _inputLen>
		_resultString = s;
	//    9   15:aload_0         
	//   10   16:aload_1         
	//   11   17:putfield        #79  <Field String _resultString>
		_resultArray = null;
	//   12   20:aload_0         
	//   13   21:aconst_null     
	//   14   22:putfield        #125 <Field char[] _resultArray>
		if(_hasSegments)
	//*  15   25:aload_0         
	//*  16   26:getfield        #52  <Field boolean _hasSegments>
	//*  17   29:ifeq            36
			clearSegments();
	//   18   32:aload_0         
	//   19   33:invokespecial   #197 <Method void clearSegments()>
		_currentSize = 0;
	//   20   36:aload_0         
	//   21   37:iconst_0        
	//   22   38:putfield        #63  <Field int _currentSize>
	//   23   41:return          
	}

	public String setCurrentAndReturn(int i)
	{
		_currentSize = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #63  <Field int _currentSize>
		if(_segmentSize > 0)
	//*   3    5:aload_0         
	//*   4    6:getfield        #61  <Field int _segmentSize>
	//*   5    9:ifle            17
			return contentsAsString();
	//    6   12:aload_0         
	//    7   13:invokevirtual   #161 <Method String contentsAsString()>
	//    8   16:areturn         
		i = _currentSize;
	//    9   17:aload_0         
	//   10   18:getfield        #63  <Field int _currentSize>
	//   11   21:istore_1        
		String s;
		if(i == 0)
	//*  12   22:iload_1         
	//*  13   23:ifne            32
			s = "";
	//   14   26:ldc1            #182 <String "">
	//   15   28:astore_2        
		else
	//*  16   29:goto            46
			s = new String(_currentSegment, 0, i);
	//   17   32:new             #81  <Class String>
	//   18   35:dup             
	//   19   36:aload_0         
	//   20   37:getfield        #68  <Field char[] _currentSegment>
	//   21   40:iconst_0        
	//   22   41:iload_1         
	//   23   42:invokespecial   #184 <Method void String(char[], int, int)>
	//   24   45:astore_2        
		_resultString = s;
	//   25   46:aload_0         
	//   26   47:aload_2         
	//   27   48:putfield        #79  <Field String _resultString>
		return s;
	//   28   51:aload_2         
	//   29   52:areturn         
	}

	public void setCurrentLength(int i)
	{
		_currentSize = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #63  <Field int _currentSize>
	//    3    5:return          
	}

	public int size()
	{
		if(_inputStart >= 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #86  <Field int _inputStart>
	//*   2    4:iflt            12
			return _inputLen;
	//    3    7:aload_0         
	//    4    8:getfield        #88  <Field int _inputLen>
	//    5   11:ireturn         
		char ac[] = _resultArray;
	//    6   12:aload_0         
	//    7   13:getfield        #125 <Field char[] _resultArray>
	//    8   16:astore_1        
		if(ac != null)
	//*   9   17:aload_1         
	//*  10   18:ifnull          24
			return ac.length;
	//   11   21:aload_1         
	//   12   22:arraylength     
	//   13   23:ireturn         
		String s = _resultString;
	//   14   24:aload_0         
	//   15   25:getfield        #79  <Field String _resultString>
	//   16   28:astore_1        
		if(s != null)
	//*  17   29:aload_1         
	//*  18   30:ifnull          38
			return s.length();
	//   19   33:aload_1         
	//   20   34:invokevirtual   #223 <Method int String.length()>
	//   21   37:ireturn         
		else
			return _segmentSize + _currentSize;
	//   22   38:aload_0         
	//   23   39:getfield        #61  <Field int _segmentSize>
	//   24   42:aload_0         
	//   25   43:getfield        #63  <Field int _currentSize>
	//   26   46:iadd            
	//   27   47:ireturn         
	}

	public String toString()
	{
		return contentsAsString();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #161 <Method String contentsAsString()>
	//    2    4:areturn         
	}

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
	//    2    3:putstatic       #27  <Field char[] NO_CHARS>
	//*   3    6:return          
	}
}
