// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.realtime.util;

import java.io.IOException;
import java.io.Reader;
import java.nio.CharBuffer;
import java.util.*;

public class StringListReader extends Reader
{

	public StringListReader()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Reader()>
		strings = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #21  <Field List strings>
		closed = false;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #23  <Field boolean closed>
		markedCharPos = charPos;
	//    8   14:aload_0         
	//    9   15:aload_0         
	//   10   16:getfield        #25  <Field int charPos>
	//   11   19:putfield        #27  <Field int markedCharPos>
		markedStringListPos = stringListPos;
	//   12   22:aload_0         
	//   13   23:aload_0         
	//   14   24:getfield        #29  <Field int stringListPos>
	//   15   27:putfield        #31  <Field int markedStringListPos>
		frozen = false;
	//   16   30:aload_0         
	//   17   31:iconst_0        
	//   18   32:putfield        #33  <Field boolean frozen>
		strings = ((List) (new ArrayList()));
	//   19   35:aload_0         
	//   20   36:new             #35  <Class ArrayList>
	//   21   39:dup             
	//   22   40:invokespecial   #36  <Method void ArrayList()>
	//   23   43:putfield        #21  <Field List strings>
	//   24   46:return          
	}

	private long advance(long l)
	{
		long l1;
		for(l1 = 0L; stringListPos < strings.size() && l1 < l;)
	//*   0    0:lconst_0        
	//*   1    1:lstore          4
	//*   2    3:aload_0         
	//*   3    4:getfield        #29  <Field int stringListPos>
	//*   4    7:aload_0         
	//*   5    8:getfield        #21  <Field List strings>
	//*   6   11:invokeinterface #45  <Method int List.size()>
	//*   7   16:icmpge          97
	//*   8   19:lload           4
	//*   9   21:lload_1         
	//*  10   22:lcmp            
	//*  11   23:ifge            97
		{
			int i = currentStringRemainingChars();
	//   12   26:aload_0         
	//   13   27:invokespecial   #48  <Method int currentStringRemainingChars()>
	//   14   30:istore_3        
			long l2 = l - l1;
	//   15   31:lload_1         
	//   16   32:lload           4
	//   17   34:lsub            
	//   18   35:lstore          6
			long l3 = i;
	//   19   37:iload_3         
	//   20   38:i2l             
	//   21   39:lstore          8
			if(l2 < l3)
	//*  22   41:lload           6
	//*  23   43:lload           8
	//*  24   45:lcmp            
	//*  25   46:ifge            72
			{
				charPos = (int)((long)charPos + l2);
	//   26   49:aload_0         
	//   27   50:aload_0         
	//   28   51:getfield        #25  <Field int charPos>
	//   29   54:i2l             
	//   30   55:lload           6
	//   31   57:ladd            
	//   32   58:l2i             
	//   33   59:putfield        #25  <Field int charPos>
				l1 += l2;
	//   34   62:lload           4
	//   35   64:lload           6
	//   36   66:ladd            
	//   37   67:lstore          4
			} else
	//*  38   69:goto            3
			{
				l1 += l3;
	//   39   72:lload           4
	//   40   74:lload           8
	//   41   76:ladd            
	//   42   77:lstore          4
				charPos = 0;
	//   43   79:aload_0         
	//   44   80:iconst_0        
	//   45   81:putfield        #25  <Field int charPos>
				stringListPos = stringListPos + 1;
	//   46   84:aload_0         
	//   47   85:aload_0         
	//   48   86:getfield        #29  <Field int stringListPos>
	//   49   89:iconst_1        
	//   50   90:iadd            
	//   51   91:putfield        #29  <Field int stringListPos>
			}
		}

	//*  52   94:goto            3
		return l1;
	//   53   97:lload           4
	//   54   99:lreturn         
	}

	private void checkState()
		throws IOException
	{
		if(!closed)
	//*   0    0:aload_0         
	//*   1    1:getfield        #23  <Field boolean closed>
	//*   2    4:ifne            25
		{
			if(frozen)
	//*   3    7:aload_0         
	//*   4    8:getfield        #33  <Field boolean frozen>
	//*   5   11:ifeq            15
				return;
	//    6   14:return          
			else
				throw new IOException("Reader needs to be frozen before read operations can be called");
	//    7   15:new             #51  <Class IOException>
	//    8   18:dup             
	//    9   19:ldc1            #53  <String "Reader needs to be frozen before read operations can be called">
	//   10   21:invokespecial   #56  <Method void IOException(String)>
	//   11   24:athrow          
		} else
		{
			throw new IOException("Stream already closed");
	//   12   25:new             #51  <Class IOException>
	//   13   28:dup             
	//   14   29:ldc1            #58  <String "Stream already closed">
	//   15   31:invokespecial   #56  <Method void IOException(String)>
	//   16   34:athrow          
		}
	}

	private String currentString()
	{
		if(stringListPos < strings.size())
	//*   0    0:aload_0         
	//*   1    1:getfield        #29  <Field int stringListPos>
	//*   2    4:aload_0         
	//*   3    5:getfield        #21  <Field List strings>
	//*   4    8:invokeinterface #45  <Method int List.size()>
	//*   5   13:icmpge          33
			return (String)strings.get(stringListPos);
	//    6   16:aload_0         
	//    7   17:getfield        #21  <Field List strings>
	//    8   20:aload_0         
	//    9   21:getfield        #29  <Field int stringListPos>
	//   10   24:invokeinterface #65  <Method Object List.get(int)>
	//   11   29:checkcast       #67  <Class String>
	//   12   32:areturn         
		else
			return null;
	//   13   33:aconst_null     
	//   14   34:areturn         
	}

	private int currentStringRemainingChars()
	{
		String s = currentString();
	//    0    0:aload_0         
	//    1    1:invokespecial   #69  <Method String currentString()>
	//    2    4:astore_1        
		if(s == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       11
			return 0;
	//    5    9:iconst_0        
	//    6   10:ireturn         
		else
			return s.length() - charPos;
	//    7   11:aload_1         
	//    8   12:invokevirtual   #72  <Method int String.length()>
	//    9   15:aload_0         
	//   10   16:getfield        #25  <Field int charPos>
	//   11   19:isub            
	//   12   20:ireturn         
	}

	public void addString(String s)
	{
		if(!frozen)
	//*   0    0:aload_0         
	//*   1    1:getfield        #33  <Field boolean frozen>
	//*   2    4:ifne            26
		{
			if(s.length() > 0)
	//*   3    7:aload_1         
	//*   4    8:invokevirtual   #72  <Method int String.length()>
	//*   5   11:ifle            25
				strings.add(((Object) (s)));
	//    6   14:aload_0         
	//    7   15:getfield        #21  <Field List strings>
	//    8   18:aload_1         
	//    9   19:invokeinterface #77  <Method boolean List.add(Object)>
	//   10   24:pop             
			return;
	//   11   25:return          
		} else
		{
			throw new IllegalStateException("Trying to add string after reading");
	//   12   26:new             #79  <Class IllegalStateException>
	//   13   29:dup             
	//   14   30:ldc1            #81  <String "Trying to add string after reading">
	//   15   32:invokespecial   #82  <Method void IllegalStateException(String)>
	//   16   35:athrow          
		}
	}

	public void close()
		throws IOException
	{
		checkState();
	//    0    0:aload_0         
	//    1    1:invokespecial   #85  <Method void checkState()>
		closed = true;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #23  <Field boolean closed>
	//    5    9:return          
	}

	public void freeze()
	{
		if(!frozen)
	//*   0    0:aload_0         
	//*   1    1:getfield        #33  <Field boolean frozen>
	//*   2    4:ifne            13
		{
			frozen = true;
	//    3    7:aload_0         
	//    4    8:iconst_1        
	//    5    9:putfield        #33  <Field boolean frozen>
			return;
	//    6   12:return          
		} else
		{
			throw new IllegalStateException("Trying to freeze frozen StringListReader");
	//    7   13:new             #79  <Class IllegalStateException>
	//    8   16:dup             
	//    9   17:ldc1            #88  <String "Trying to freeze frozen StringListReader">
	//   10   19:invokespecial   #82  <Method void IllegalStateException(String)>
	//   11   22:athrow          
		}
	}

	public void mark(int i)
		throws IOException
	{
		checkState();
	//    0    0:aload_0         
	//    1    1:invokespecial   #85  <Method void checkState()>
		markedCharPos = charPos;
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:getfield        #25  <Field int charPos>
	//    5    9:putfield        #27  <Field int markedCharPos>
		markedStringListPos = stringListPos;
	//    6   12:aload_0         
	//    7   13:aload_0         
	//    8   14:getfield        #29  <Field int stringListPos>
	//    9   17:putfield        #31  <Field int markedStringListPos>
	//   10   20:return          
	}

	public boolean markSupported()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public int read()
		throws IOException
	{
		checkState();
	//    0    0:aload_0         
	//    1    1:invokespecial   #85  <Method void checkState()>
		String s = currentString();
	//    2    4:aload_0         
	//    3    5:invokespecial   #69  <Method String currentString()>
	//    4    8:astore_2        
		if(s == null)
	//*   5    9:aload_2         
	//*   6   10:ifnonnull       15
		{
			return -1;
	//    7   13:iconst_m1       
	//    8   14:ireturn         
		} else
		{
			char c = s.charAt(charPos);
	//    9   15:aload_2         
	//   10   16:aload_0         
	//   11   17:getfield        #25  <Field int charPos>
	//   12   20:invokevirtual   #97  <Method char String.charAt(int)>
	//   13   23:istore_1        
			advance(1L);
	//   14   24:aload_0         
	//   15   25:lconst_1        
	//   16   26:invokespecial   #99  <Method long advance(long)>
	//   17   29:pop2            
			return ((int) (c));
	//   18   30:iload_1         
	//   19   31:ireturn         
		}
	}

	public int read(CharBuffer charbuffer)
		throws IOException
	{
		checkState();
	//    0    0:aload_0         
	//    1    1:invokespecial   #85  <Method void checkState()>
		int j = charbuffer.remaining();
	//    2    4:aload_1         
	//    3    5:invokevirtual   #105 <Method int CharBuffer.remaining()>
	//    4    8:istore_3        
		String s = currentString();
	//    5    9:aload_0         
	//    6   10:invokespecial   #69  <Method String currentString()>
	//    7   13:astore          6
		int i = 0;
	//    8   15:iconst_0        
	//    9   16:istore_2        
		for(; j > 0 && s != null; s = currentString())
	//*  10   17:iload_3         
	//*  11   18:ifle            107
	//*  12   21:aload           6
	//*  13   23:ifnull          107
		{
			int k = Math.min(s.length() - charPos, j);
	//   14   26:aload           6
	//   15   28:invokevirtual   #72  <Method int String.length()>
	//   16   31:aload_0         
	//   17   32:getfield        #25  <Field int charPos>
	//   18   35:isub            
	//   19   36:iload_3         
	//   20   37:invokestatic    #111 <Method int Math.min(int, int)>
	//   21   40:istore          4
			s = (String)strings.get(stringListPos);
	//   22   42:aload_0         
	//   23   43:getfield        #21  <Field List strings>
	//   24   46:aload_0         
	//   25   47:getfield        #29  <Field int stringListPos>
	//   26   50:invokeinterface #65  <Method Object List.get(int)>
	//   27   55:checkcast       #67  <Class String>
	//   28   58:astore          6
			int l = charPos;
	//   29   60:aload_0         
	//   30   61:getfield        #25  <Field int charPos>
	//   31   64:istore          5
			charbuffer.put(s, l, l + k);
	//   32   66:aload_1         
	//   33   67:aload           6
	//   34   69:iload           5
	//   35   71:iload           5
	//   36   73:iload           4
	//   37   75:iadd            
	//   38   76:invokevirtual   #115 <Method CharBuffer CharBuffer.put(String, int, int)>
	//   39   79:pop             
			j -= k;
	//   40   80:iload_3         
	//   41   81:iload           4
	//   42   83:isub            
	//   43   84:istore_3        
			i += k;
	//   44   85:iload_2         
	//   45   86:iload           4
	//   46   88:iadd            
	//   47   89:istore_2        
			advance(k);
	//   48   90:aload_0         
	//   49   91:iload           4
	//   50   93:i2l             
	//   51   94:invokespecial   #99  <Method long advance(long)>
	//   52   97:pop2            
		}

	//   53   98:aload_0         
	//   54   99:invokespecial   #69  <Method String currentString()>
	//   55  102:astore          6
	//*  56  104:goto            17
		if(i <= 0)
	//*  57  107:iload_2         
	//*  58  108:ifgt            120
		{
			if(s != null)
	//*  59  111:aload           6
	//*  60  113:ifnull          118
				return i;
	//   61  116:iload_2         
	//   62  117:ireturn         
			else
				return -1;
	//   63  118:iconst_m1       
	//   64  119:ireturn         
		} else
		{
			return i;
	//   65  120:iload_2         
	//   66  121:ireturn         
		}
	}

	public int read(char ac[], int i, int j)
		throws IOException
	{
		checkState();
	//    0    0:aload_0         
	//    1    1:invokespecial   #85  <Method void checkState()>
		String s = currentString();
	//    2    4:aload_0         
	//    3    5:invokespecial   #69  <Method String currentString()>
	//    4    8:astore          7
		int k;
		for(k = 0; s != null && k < j; s = currentString())
	//*   5   10:iconst_0        
	//*   6   11:istore          4
	//*   7   13:aload           7
	//*   8   15:ifnull          84
	//*   9   18:iload           4
	//*  10   20:iload_3         
	//*  11   21:icmpge          84
		{
			int l = Math.min(currentStringRemainingChars(), j - k);
	//   12   24:aload_0         
	//   13   25:invokespecial   #48  <Method int currentStringRemainingChars()>
	//   14   28:iload_3         
	//   15   29:iload           4
	//   16   31:isub            
	//   17   32:invokestatic    #111 <Method int Math.min(int, int)>
	//   18   35:istore          5
			int i1 = charPos;
	//   19   37:aload_0         
	//   20   38:getfield        #25  <Field int charPos>
	//   21   41:istore          6
			s.getChars(i1, i1 + l, ac, i + k);
	//   22   43:aload           7
	//   23   45:iload           6
	//   24   47:iload           6
	//   25   49:iload           5
	//   26   51:iadd            
	//   27   52:aload_1         
	//   28   53:iload_2         
	//   29   54:iload           4
	//   30   56:iadd            
	//   31   57:invokevirtual   #120 <Method void String.getChars(int, int, char[], int)>
			k += l;
	//   32   60:iload           4
	//   33   62:iload           5
	//   34   64:iadd            
	//   35   65:istore          4
			advance(l);
	//   36   67:aload_0         
	//   37   68:iload           5
	//   38   70:i2l             
	//   39   71:invokespecial   #99  <Method long advance(long)>
	//   40   74:pop2            
		}

	//   41   75:aload_0         
	//   42   76:invokespecial   #69  <Method String currentString()>
	//   43   79:astore          7
	//*  44   81:goto            13
		if(k <= 0)
	//*  45   84:iload           4
	//*  46   86:ifgt            99
		{
			if(s != null)
	//*  47   89:aload           7
	//*  48   91:ifnull          97
				return k;
	//   49   94:iload           4
	//   50   96:ireturn         
			else
				return -1;
	//   51   97:iconst_m1       
	//   52   98:ireturn         
		} else
		{
			return k;
	//   53   99:iload           4
	//   54  101:ireturn         
		}
	}

	public boolean ready()
		throws IOException
	{
		checkState();
	//    0    0:aload_0         
	//    1    1:invokespecial   #85  <Method void checkState()>
		return true;
	//    2    4:iconst_1        
	//    3    5:ireturn         
	}

	public void reset()
		throws IOException
	{
		charPos = markedCharPos;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #27  <Field int markedCharPos>
	//    3    5:putfield        #25  <Field int charPos>
		stringListPos = markedStringListPos;
	//    4    8:aload_0         
	//    5    9:aload_0         
	//    6   10:getfield        #31  <Field int markedStringListPos>
	//    7   13:putfield        #29  <Field int stringListPos>
	//    8   16:return          
	}

	public long skip(long l)
		throws IOException
	{
		checkState();
	//    0    0:aload_0         
	//    1    1:invokespecial   #85  <Method void checkState()>
		return advance(l);
	//    2    4:aload_0         
	//    3    5:lload_1         
	//    4    6:invokespecial   #99  <Method long advance(long)>
	//    5    9:lreturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #126 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #127 <Method void StringBuilder()>
	//    3    7:astore_1        
		for(Iterator iterator = strings.iterator(); iterator.hasNext(); stringbuilder.append((String)iterator.next()));
	//    4    8:aload_0         
	//    5    9:getfield        #21  <Field List strings>
	//    6   12:invokeinterface #131 <Method Iterator List.iterator()>
	//    7   17:astore_2        
	//    8   18:aload_2         
	//    9   19:invokeinterface #136 <Method boolean Iterator.hasNext()>
	//   10   24:ifeq            44
	//   11   27:aload_1         
	//   12   28:aload_2         
	//   13   29:invokeinterface #140 <Method Object Iterator.next()>
	//   14   34:checkcast       #67  <Class String>
	//   15   37:invokevirtual   #144 <Method StringBuilder StringBuilder.append(String)>
	//   16   40:pop             
	//*  17   41:goto            18
		return stringbuilder.toString();
	//   18   44:aload_1         
	//   19   45:invokevirtual   #146 <Method String StringBuilder.toString()>
	//   20   48:areturn         
	}

	private int charPos;
	private boolean closed;
	private boolean frozen;
	private int markedCharPos;
	private int markedStringListPos;
	private int stringListPos;
	private List strings;
}
