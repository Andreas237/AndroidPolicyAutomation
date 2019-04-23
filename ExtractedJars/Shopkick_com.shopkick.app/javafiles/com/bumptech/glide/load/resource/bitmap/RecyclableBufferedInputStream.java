// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.resource.bitmap;

import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;
import java.io.*;

public class RecyclableBufferedInputStream extends FilterInputStream
{
	static class InvalidMarkException extends IOException
	{

		private static final long serialVersionUID = 0x37664863L;

		InvalidMarkException(String s)
		{
			super(s);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #15  <Method void IOException(String)>
		//    3    5:return          
		}
	}


	public RecyclableBufferedInputStream(InputStream inputstream, ArrayPool arraypool)
	{
		this(inputstream, arraypool, 0x10000);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:ldc1            #20  <Int 0x10000>
	//    4    5:invokespecial   #23  <Method void RecyclableBufferedInputStream(InputStream, ArrayPool, int)>
	//    5    8:return          
	}

	RecyclableBufferedInputStream(InputStream inputstream, ArrayPool arraypool, int i)
	{
		super(inputstream);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #29  <Method void FilterInputStream(InputStream)>
		markpos = -1;
	//    3    5:aload_0         
	//    4    6:iconst_m1       
	//    5    7:putfield        #31  <Field int markpos>
		byteArrayPool = arraypool;
	//    6   10:aload_0         
	//    7   11:aload_2         
	//    8   12:putfield        #33  <Field ArrayPool byteArrayPool>
		buf = (byte[])arraypool.get(i, [B);
	//    9   15:aload_0         
	//   10   16:aload_2         
	//   11   17:iload_3         
	//   12   18:ldc1            #34  <Class byte[]>
	//   13   20:invokeinterface #40  <Method Object ArrayPool.get(int, Class)>
	//   14   25:checkcast       #34  <Class byte[]>
	//   15   28:putfield        #42  <Field byte[] buf>
	//   16   31:return          
	}

	private int fillbuf(InputStream inputstream, byte abyte0[])
		throws IOException
	{
		int i = markpos;
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field int markpos>
	//    2    4:istore_3        
		if(i != -1)
	//*   3    5:iload_3         
	//*   4    6:iconst_m1       
	//*   5    7:icmpeq          216
		{
			int k = pos;
	//    6   10:aload_0         
	//    7   11:getfield        #49  <Field int pos>
	//    8   14:istore          5
			int j = marklimit;
	//    9   16:aload_0         
	//   10   17:getfield        #51  <Field int marklimit>
	//   11   20:istore          4
			if(k - i < j)
	//*  12   22:iload           5
	//*  13   24:iload_3         
	//*  14   25:isub            
	//*  15   26:iload           4
	//*  16   28:icmplt          34
	//*  17   31:goto            216
			{
				byte abyte1[];
				if(i == 0 && j > abyte0.length && count == abyte0.length)
	//*  18   34:iload_3         
	//*  19   35:ifne            119
	//*  20   38:iload           4
	//*  21   40:aload_2         
	//*  22   41:arraylength     
	//*  23   42:icmple          119
	//*  24   45:aload_0         
	//*  25   46:getfield        #53  <Field int count>
	//*  26   49:aload_2         
	//*  27   50:arraylength     
	//*  28   51:icmpne          119
				{
					int l = abyte0.length * 2;
	//   29   54:aload_2         
	//   30   55:arraylength     
	//   31   56:iconst_2        
	//   32   57:imul            
	//   33   58:istore          5
					i = l;
	//   34   60:iload           5
	//   35   62:istore_3        
					if(l > j)
	//*  36   63:iload           5
	//*  37   65:iload           4
	//*  38   67:icmple          73
						i = j;
	//   39   70:iload           4
	//   40   72:istore_3        
					abyte1 = (byte[])byteArrayPool.get(i, [B);
	//   41   73:aload_0         
	//   42   74:getfield        #33  <Field ArrayPool byteArrayPool>
	//   43   77:iload_3         
	//   44   78:ldc1            #34  <Class byte[]>
	//   45   80:invokeinterface #40  <Method Object ArrayPool.get(int, Class)>
	//   46   85:checkcast       #34  <Class byte[]>
	//   47   88:astore          6
					System.arraycopy(((Object) (abyte0)), 0, ((Object) (abyte1)), 0, abyte0.length);
	//   48   90:aload_2         
	//   49   91:iconst_0        
	//   50   92:aload           6
	//   51   94:iconst_0        
	//   52   95:aload_2         
	//   53   96:arraylength     
	//   54   97:invokestatic    #59  <Method void System.arraycopy(Object, int, Object, int, int)>
					buf = abyte1;
	//   55  100:aload_0         
	//   56  101:aload           6
	//   57  103:putfield        #42  <Field byte[] buf>
					byteArrayPool.put(((Object) (abyte0)));
	//   58  106:aload_0         
	//   59  107:getfield        #33  <Field ArrayPool byteArrayPool>
	//   60  110:aload_2         
	//   61  111:invokeinterface #63  <Method void ArrayPool.put(Object)>
				} else
	//*  62  116:goto            145
				{
					i = markpos;
	//   63  119:aload_0         
	//   64  120:getfield        #31  <Field int markpos>
	//   65  123:istore_3        
					abyte1 = abyte0;
	//   66  124:aload_2         
	//   67  125:astore          6
					if(i > 0)
	//*  68  127:iload_3         
	//*  69  128:ifle            145
					{
						System.arraycopy(((Object) (abyte0)), i, ((Object) (abyte0)), 0, abyte0.length - i);
	//   70  131:aload_2         
	//   71  132:iload_3         
	//   72  133:aload_2         
	//   73  134:iconst_0        
	//   74  135:aload_2         
	//   75  136:arraylength     
	//   76  137:iload_3         
	//   77  138:isub            
	//   78  139:invokestatic    #59  <Method void System.arraycopy(Object, int, Object, int, int)>
						abyte1 = abyte0;
	//   79  142:aload_2         
	//   80  143:astore          6
					}
				}
				pos = pos - markpos;
	//   81  145:aload_0         
	//   82  146:aload_0         
	//   83  147:getfield        #49  <Field int pos>
	//   84  150:aload_0         
	//   85  151:getfield        #31  <Field int markpos>
	//   86  154:isub            
	//   87  155:putfield        #49  <Field int pos>
				markpos = 0;
	//   88  158:aload_0         
	//   89  159:iconst_0        
	//   90  160:putfield        #31  <Field int markpos>
				count = 0;
	//   91  163:aload_0         
	//   92  164:iconst_0        
	//   93  165:putfield        #53  <Field int count>
				i = pos;
	//   94  168:aload_0         
	//   95  169:getfield        #49  <Field int pos>
	//   96  172:istore_3        
				j = inputstream.read(abyte1, i, abyte1.length - i);
	//   97  173:aload_1         
	//   98  174:aload           6
	//   99  176:iload_3         
	//  100  177:aload           6
	//  101  179:arraylength     
	//  102  180:iload_3         
	//  103  181:isub            
	//  104  182:invokevirtual   #69  <Method int InputStream.read(byte[], int, int)>
	//  105  185:istore          4
				if(j <= 0)
	//* 106  187:iload           4
	//* 107  189:ifgt            200
					i = pos;
	//  108  192:aload_0         
	//  109  193:getfield        #49  <Field int pos>
	//  110  196:istore_3        
				else
	//* 111  197:goto            208
					i = pos + j;
	//  112  200:aload_0         
	//  113  201:getfield        #49  <Field int pos>
	//  114  204:iload           4
	//  115  206:iadd            
	//  116  207:istore_3        
				count = i;
	//  117  208:aload_0         
	//  118  209:iload_3         
	//  119  210:putfield        #53  <Field int count>
				return j;
	//  120  213:iload           4
	//  121  215:ireturn         
			}
		}
		i = inputstream.read(abyte0);
	//  122  216:aload_1         
	//  123  217:aload_2         
	//  124  218:invokevirtual   #72  <Method int InputStream.read(byte[])>
	//  125  221:istore_3        
		if(i > 0)
	//* 126  222:iload_3         
	//* 127  223:ifle            241
		{
			markpos = -1;
	//  128  226:aload_0         
	//  129  227:iconst_m1       
	//  130  228:putfield        #31  <Field int markpos>
			pos = 0;
	//  131  231:aload_0         
	//  132  232:iconst_0        
	//  133  233:putfield        #49  <Field int pos>
			count = i;
	//  134  236:aload_0         
	//  135  237:iload_3         
	//  136  238:putfield        #53  <Field int count>
		}
		return i;
	//  137  241:iload_3         
	//  138  242:ireturn         
	}

	private static IOException streamClosed()
		throws IOException
	{
		throw new IOException("BufferedInputStream is closed");
	//    0    0:new             #47  <Class IOException>
	//    1    3:dup             
	//    2    4:ldc1            #77  <String "BufferedInputStream is closed">
	//    3    6:invokespecial   #80  <Method void IOException(String)>
	//    4    9:athrow          
	}

	public int available()
		throws IOException
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		InputStream inputstream = in;
	//    2    2:aload_0         
	//    3    3:getfield        #86  <Field InputStream in>
	//    4    6:astore          4
		if(buf == null || inputstream == null)
			break MISSING_BLOCK_LABEL_44;
	//    5    8:aload_0         
	//    6    9:getfield        #42  <Field byte[] buf>
	//    7   12:ifnull          44
	//    8   15:aload           4
	//    9   17:ifnull          44
		int i;
		int j;
		int k;
		i = count;
	//   10   20:aload_0         
	//   11   21:getfield        #53  <Field int count>
	//   12   24:istore_1        
		j = pos;
	//   13   25:aload_0         
	//   14   26:getfield        #49  <Field int pos>
	//   15   29:istore_2        
		k = inputstream.available();
	//   16   30:aload           4
	//   17   32:invokevirtual   #88  <Method int InputStream.available()>
	//   18   35:istore_3        
		this;
	//   19   36:aload_0         
		JVM INSTR monitorexit ;
	//   20   37:monitorexit     
		return (i - j) + k;
	//   21   38:iload_1         
	//   22   39:iload_2         
	//   23   40:isub            
	//   24   41:iload_3         
	//   25   42:iadd            
	//   26   43:ireturn         
		throw streamClosed();
	//   27   44:invokestatic    #90  <Method IOException streamClosed()>
	//   28   47:athrow          
		Exception exception;
		exception;
	//   29   48:astore          4
		this;
	//   30   50:aload_0         
		JVM INSTR monitorexit ;
	//   31   51:monitorexit     
		throw exception;
	//   32   52:aload           4
	//   33   54:athrow          
	}

	public void close()
		throws IOException
	{
		if(buf != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #42  <Field byte[] buf>
	//*   2    4:ifnull          25
		{
			byteArrayPool.put(((Object) (buf)));
	//    3    7:aload_0         
	//    4    8:getfield        #33  <Field ArrayPool byteArrayPool>
	//    5   11:aload_0         
	//    6   12:getfield        #42  <Field byte[] buf>
	//    7   15:invokeinterface #63  <Method void ArrayPool.put(Object)>
			buf = null;
	//    8   20:aload_0         
	//    9   21:aconst_null     
	//   10   22:putfield        #42  <Field byte[] buf>
		}
		InputStream inputstream = in;
	//   11   25:aload_0         
	//   12   26:getfield        #86  <Field InputStream in>
	//   13   29:astore_1        
		in = null;
	//   14   30:aload_0         
	//   15   31:aconst_null     
	//   16   32:putfield        #86  <Field InputStream in>
		if(inputstream != null)
	//*  17   35:aload_1         
	//*  18   36:ifnull          43
			inputstream.close();
	//   19   39:aload_1         
	//   20   40:invokevirtual   #94  <Method void InputStream.close()>
	//   21   43:return          
	}

	public void fixMarkLimit()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		marklimit = buf.length;
	//    2    2:aload_0         
	//    3    3:aload_0         
	//    4    4:getfield        #42  <Field byte[] buf>
	//    5    7:arraylength     
	//    6    8:putfield        #51  <Field int marklimit>
		this;
	//    7   11:aload_0         
		JVM INSTR monitorexit ;
	//    8   12:monitorexit     
		return;
	//    9   13:return          
		Exception exception;
		exception;
	//   10   14:astore_1        
	//*  11   15:aload_0         
		throw exception;
	//   12   16:monitorexit     
	//   13   17:aload_1         
	//   14   18:athrow          
	}

	public void mark(int i)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		marklimit = Math.max(marklimit, i);
	//    2    2:aload_0         
	//    3    3:aload_0         
	//    4    4:getfield        #51  <Field int marklimit>
	//    5    7:iload_1         
	//    6    8:invokestatic    #103 <Method int Math.max(int, int)>
	//    7   11:putfield        #51  <Field int marklimit>
		markpos = pos;
	//    8   14:aload_0         
	//    9   15:aload_0         
	//   10   16:getfield        #49  <Field int pos>
	//   11   19:putfield        #31  <Field int markpos>
		this;
	//   12   22:aload_0         
		JVM INSTR monitorexit ;
	//   13   23:monitorexit     
		return;
	//   14   24:return          
		Exception exception;
		exception;
	//   15   25:astore_2        
	//*  16   26:aload_0         
		throw exception;
	//   17   27:monitorexit     
	//   18   28:aload_2         
	//   19   29:athrow          
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
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		InputStream inputstream;
		byte abyte1[];
		abyte1 = buf;
	//    2    2:aload_0         
	//    3    3:getfield        #42  <Field byte[] buf>
	//    4    6:astore_3        
		inputstream = in;
	//    5    7:aload_0         
	//    6    8:getfield        #86  <Field InputStream in>
	//    7   11:astore_2        
		if(abyte1 == null || inputstream == null)
			break MISSING_BLOCK_LABEL_113;
	//    8   12:aload_3         
	//    9   13:ifnull          113
	//   10   16:aload_2         
	//   11   17:ifnull          113
		int i;
		if(pos < count)
			break MISSING_BLOCK_LABEL_47;
	//   12   20:aload_0         
	//   13   21:getfield        #49  <Field int pos>
	//   14   24:aload_0         
	//   15   25:getfield        #53  <Field int count>
	//   16   28:icmplt          47
		i = fillbuf(inputstream, abyte1);
	//   17   31:aload_0         
	//   18   32:aload_2         
	//   19   33:aload_3         
	//   20   34:invokespecial   #107 <Method int fillbuf(InputStream, byte[])>
	//   21   37:istore_1        
		if(i != -1)
			break MISSING_BLOCK_LABEL_47;
	//   22   38:iload_1         
	//   23   39:iconst_m1       
	//   24   40:icmpne          47
		this;
	//   25   43:aload_0         
		JVM INSTR monitorexit ;
	//   26   44:monitorexit     
		return -1;
	//   27   45:iconst_m1       
	//   28   46:ireturn         
		byte abyte0[] = abyte1;
	//   29   47:aload_3         
	//   30   48:astore_2        
		if(abyte1 == buf)
			break MISSING_BLOCK_LABEL_73;
	//   31   49:aload_3         
	//   32   50:aload_0         
	//   33   51:getfield        #42  <Field byte[] buf>
	//   34   54:if_acmpeq       73
		abyte0 = buf;
	//   35   57:aload_0         
	//   36   58:getfield        #42  <Field byte[] buf>
	//   37   61:astore_2        
		if(abyte0 != null)
	//*  38   62:aload_2         
	//*  39   63:ifnull          69
			break MISSING_BLOCK_LABEL_73;
	//   40   66:goto            73
		throw streamClosed();
	//   41   69:invokestatic    #90  <Method IOException streamClosed()>
	//   42   72:athrow          
		if(count - pos <= 0)
			break MISSING_BLOCK_LABEL_109;
	//   43   73:aload_0         
	//   44   74:getfield        #53  <Field int count>
	//   45   77:aload_0         
	//   46   78:getfield        #49  <Field int pos>
	//   47   81:isub            
	//   48   82:ifle            109
		i = pos;
	//   49   85:aload_0         
	//   50   86:getfield        #49  <Field int pos>
	//   51   89:istore_1        
		pos = i + 1;
	//   52   90:aload_0         
	//   53   91:iload_1         
	//   54   92:iconst_1        
	//   55   93:iadd            
	//   56   94:putfield        #49  <Field int pos>
		i = ((int) (abyte0[i]));
	//   57   97:aload_2         
	//   58   98:iload_1         
	//   59   99:baload          
	//   60  100:istore_1        
		this;
	//   61  101:aload_0         
		JVM INSTR monitorexit ;
	//   62  102:monitorexit     
		return i & 0xff;
	//   63  103:iload_1         
	//   64  104:sipush          255
	//   65  107:iand            
	//   66  108:ireturn         
		this;
	//   67  109:aload_0         
		JVM INSTR monitorexit ;
	//   68  110:monitorexit     
		return -1;
	//   69  111:iconst_m1       
	//   70  112:ireturn         
		throw streamClosed();
	//   71  113:invokestatic    #90  <Method IOException streamClosed()>
	//   72  116:athrow          
		Exception exception;
		exception;
	//   73  117:astore_2        
		this;
	//   74  118:aload_0         
		JVM INSTR monitorexit ;
	//   75  119:monitorexit     
		throw exception;
	//   76  120:aload_2         
	//   77  121:athrow          
	}

	public int read(byte abyte0[], int i, int j)
		throws IOException
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		byte abyte1[] = buf;
	//    2    2:aload_0         
	//    3    3:getfield        #42  <Field byte[] buf>
	//    4    6:astore          8
		if(abyte1 == null)
			break MISSING_BLOCK_LABEL_384;
	//    5    8:aload           8
	//    6   10:ifnull          384
		if(j == 0)
	//*   7   13:iload_3         
	//*   8   14:ifne            21
	//*   9   17:aload_0         
			return 0;
	//   10   18:monitorexit     
	//   11   19:iconst_0        
	//   12   20:ireturn         
		InputStream inputstream = in;
	//   13   21:aload_0         
	//   14   22:getfield        #86  <Field InputStream in>
	//   15   25:astore          10
		if(inputstream == null) goto _L2; else goto _L1
	//   16   27:aload           10
	//   17   29:ifnull          380
_L1:
		if(pos >= count)
			break MISSING_BLOCK_LABEL_141;
	//   18   32:aload_0         
	//   19   33:getfield        #49  <Field int pos>
	//   20   36:aload_0         
	//   21   37:getfield        #53  <Field int count>
	//   22   40:icmpge          141
		int k;
		if(count - pos >= j)
	//*  23   43:aload_0         
	//*  24   44:getfield        #53  <Field int count>
	//*  25   47:aload_0         
	//*  26   48:getfield        #49  <Field int pos>
	//*  27   51:isub            
	//*  28   52:iload_3         
	//*  29   53:icmplt          62
		{
			k = j;
	//   30   56:iload_3         
	//   31   57:istore          4
			break MISSING_BLOCK_LABEL_73;
	//   32   59:goto            73
		}
		k = count - pos;
	//   33   62:aload_0         
	//   34   63:getfield        #53  <Field int count>
	//   35   66:aload_0         
	//   36   67:getfield        #49  <Field int pos>
	//   37   70:isub            
	//   38   71:istore          4
		System.arraycopy(((Object) (abyte1)), pos, ((Object) (abyte0)), i, k);
	//   39   73:aload           8
	//   40   75:aload_0         
	//   41   76:getfield        #49  <Field int pos>
	//   42   79:aload_1         
	//   43   80:iload_2         
	//   44   81:iload           4
	//   45   83:invokestatic    #59  <Method void System.arraycopy(Object, int, Object, int, int)>
		pos = pos + k;
	//   46   86:aload_0         
	//   47   87:aload_0         
	//   48   88:getfield        #49  <Field int pos>
	//   49   91:iload           4
	//   50   93:iadd            
	//   51   94:putfield        #49  <Field int pos>
		if(k == j)
			break MISSING_BLOCK_LABEL_136;
	//   52   97:iload           4
	//   53   99:iload_3         
	//   54  100:icmpeq          136
		int l = inputstream.available();
	//   55  103:aload           10
	//   56  105:invokevirtual   #88  <Method int InputStream.available()>
	//   57  108:istore          5
		if(l != 0)
	//*  58  110:iload           5
	//*  59  112:ifne            118
	//*  60  115:goto            136
		{
			l = i + k;
	//   61  118:iload_2         
	//   62  119:iload           4
	//   63  121:iadd            
	//   64  122:istore          5
			i = j - k;
	//   65  124:iload_3         
	//   66  125:iload           4
	//   67  127:isub            
	//   68  128:istore_2        
			k = l;
	//   69  129:iload           5
	//   70  131:istore          4
			break MISSING_BLOCK_LABEL_150;
	//   71  133:goto            150
		}
		this;
	//   72  136:aload_0         
		JVM INSTR monitorexit ;
	//   73  137:monitorexit     
		return k;
	//   74  138:iload           4
	//   75  140:ireturn         
		l = j;
	//   76  141:iload_3         
	//   77  142:istore          5
		k = i;
	//   78  144:iload_2         
	//   79  145:istore          4
		i = l;
	//   80  147:iload           5
	//   81  149:istore_2        
_L3:
		int i1 = markpos;
	//   82  150:aload_0         
	//   83  151:getfield        #31  <Field int markpos>
	//   84  154:istore          6
		l = -1;
	//   85  156:iconst_m1       
	//   86  157:istore          5
		if(i1 != -1)
			break MISSING_BLOCK_LABEL_211;
	//   87  159:iload           6
	//   88  161:iconst_m1       
	//   89  162:icmpne          211
		int j1;
		if(i < abyte1.length)
			break MISSING_BLOCK_LABEL_211;
	//   90  165:iload_2         
	//   91  166:aload           8
	//   92  168:arraylength     
	//   93  169:icmplt          211
		j1 = inputstream.read(abyte0, k, i);
	//   94  172:aload           10
	//   95  174:aload_1         
	//   96  175:iload           4
	//   97  177:iload_2         
	//   98  178:invokevirtual   #69  <Method int InputStream.read(byte[], int, int)>
	//   99  181:istore          7
		i1 = j1;
	//  100  183:iload           7
	//  101  185:istore          6
		if(j1 == -1)
	//* 102  187:iload           7
	//* 103  189:iconst_m1       
	//* 104  190:icmpne          339
		{
			if(i != j)
	//* 105  193:iload_2         
	//* 106  194:iload_3         
	//* 107  195:icmpne          201
	//* 108  198:goto            206
				l = j - i;
	//  109  201:iload_3         
	//  110  202:iload_2         
	//  111  203:isub            
	//  112  204:istore          5
	//* 113  206:aload_0         
			return l;
	//  114  207:monitorexit     
	//  115  208:iload           5
	//  116  210:ireturn         
		}
		break MISSING_BLOCK_LABEL_339;
		i1 = fillbuf(inputstream, abyte1);
	//  117  211:aload_0         
	//  118  212:aload           10
	//  119  214:aload           8
	//  120  216:invokespecial   #107 <Method int fillbuf(InputStream, byte[])>
	//  121  219:istore          6
		byte abyte2[];
		if(i1 == -1)
	//* 122  221:iload           6
	//* 123  223:iconst_m1       
	//* 124  224:icmpne          245
		{
			if(i != j)
	//* 125  227:iload_2         
	//* 126  228:iload_3         
	//* 127  229:icmpne          235
	//* 128  232:goto            240
				l = j - i;
	//  129  235:iload_3         
	//  130  236:iload_2         
	//  131  237:isub            
	//  132  238:istore          5
	//* 133  240:aload_0         
			return l;
	//  134  241:monitorexit     
	//  135  242:iload           5
	//  136  244:ireturn         
		}
		abyte2 = abyte1;
	//  137  245:aload           8
	//  138  247:astore          9
		if(abyte1 == buf)
			break MISSING_BLOCK_LABEL_276;
	//  139  249:aload           8
	//  140  251:aload_0         
	//  141  252:getfield        #42  <Field byte[] buf>
	//  142  255:if_acmpeq       276
		abyte2 = buf;
	//  143  258:aload_0         
	//  144  259:getfield        #42  <Field byte[] buf>
	//  145  262:astore          9
		if(abyte2 != null)
	//* 146  264:aload           9
	//* 147  266:ifnull          272
			break MISSING_BLOCK_LABEL_276;
	//  148  269:goto            276
		throw streamClosed();
	//  149  272:invokestatic    #90  <Method IOException streamClosed()>
	//  150  275:athrow          
		if(count - pos >= i)
	//* 151  276:aload_0         
	//* 152  277:getfield        #53  <Field int count>
	//* 153  280:aload_0         
	//* 154  281:getfield        #49  <Field int pos>
	//* 155  284:isub            
	//* 156  285:iload_2         
	//* 157  286:icmplt          295
		{
			l = i;
	//  158  289:iload_2         
	//  159  290:istore          5
			break MISSING_BLOCK_LABEL_306;
	//  160  292:goto            306
		}
		l = count - pos;
	//  161  295:aload_0         
	//  162  296:getfield        #53  <Field int count>
	//  163  299:aload_0         
	//  164  300:getfield        #49  <Field int pos>
	//  165  303:isub            
	//  166  304:istore          5
		System.arraycopy(((Object) (abyte2)), pos, ((Object) (abyte0)), k, l);
	//  167  306:aload           9
	//  168  308:aload_0         
	//  169  309:getfield        #49  <Field int pos>
	//  170  312:aload_1         
	//  171  313:iload           4
	//  172  315:iload           5
	//  173  317:invokestatic    #59  <Method void System.arraycopy(Object, int, Object, int, int)>
		pos = pos + l;
	//  174  320:aload_0         
	//  175  321:aload_0         
	//  176  322:getfield        #49  <Field int pos>
	//  177  325:iload           5
	//  178  327:iadd            
	//  179  328:putfield        #49  <Field int pos>
		i1 = l;
	//  180  331:iload           5
	//  181  333:istore          6
		abyte1 = abyte2;
	//  182  335:aload           9
	//  183  337:astore          8
		i -= i1;
	//  184  339:iload_2         
	//  185  340:iload           6
	//  186  342:isub            
	//  187  343:istore_2        
		if(i == 0)
	//* 188  344:iload_2         
	//* 189  345:ifne            352
	//* 190  348:aload_0         
			return j;
	//  191  349:monitorexit     
	//  192  350:iload_3         
	//  193  351:ireturn         
		l = inputstream.available();
	//  194  352:aload           10
	//  195  354:invokevirtual   #88  <Method int InputStream.available()>
	//  196  357:istore          5
		if(l != 0)
			break MISSING_BLOCK_LABEL_370;
	//  197  359:iload           5
	//  198  361:ifne            370
		this;
	//  199  364:aload_0         
		JVM INSTR monitorexit ;
	//  200  365:monitorexit     
		return j - i;
	//  201  366:iload_3         
	//  202  367:iload_2         
	//  203  368:isub            
	//  204  369:ireturn         
		k += i1;
	//  205  370:iload           4
	//  206  372:iload           6
	//  207  374:iadd            
	//  208  375:istore          4
		if(true) goto _L3; else goto _L2
	//  209  377:goto            150
_L2:
		throw streamClosed();
	//  210  380:invokestatic    #90  <Method IOException streamClosed()>
	//  211  383:athrow          
		throw streamClosed();
	//  212  384:invokestatic    #90  <Method IOException streamClosed()>
	//  213  387:athrow          
		abyte0;
	//  214  388:astore_1        
		this;
	//  215  389:aload_0         
		JVM INSTR monitorexit ;
	//  216  390:monitorexit     
		throw abyte0;
	//  217  391:aload_1         
	//  218  392:athrow          
	}

	public void release()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(buf != null)
	//*   2    2:aload_0         
	//*   3    3:getfield        #42  <Field byte[] buf>
	//*   4    6:ifnull          27
		{
			byteArrayPool.put(((Object) (buf)));
	//    5    9:aload_0         
	//    6   10:getfield        #33  <Field ArrayPool byteArrayPool>
	//    7   13:aload_0         
	//    8   14:getfield        #42  <Field byte[] buf>
	//    9   17:invokeinterface #63  <Method void ArrayPool.put(Object)>
			buf = null;
	//   10   22:aload_0         
	//   11   23:aconst_null     
	//   12   24:putfield        #42  <Field byte[] buf>
		}
		this;
	//   13   27:aload_0         
		JVM INSTR monitorexit ;
	//   14   28:monitorexit     
		return;
	//   15   29:return          
		Exception exception;
		exception;
	//   16   30:astore_1        
	//*  17   31:aload_0         
		throw exception;
	//   18   32:monitorexit     
	//   19   33:aload_1         
	//   20   34:athrow          
	}

	public void reset()
		throws IOException
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(buf == null)
			break MISSING_BLOCK_LABEL_80;
	//    2    2:aload_0         
	//    3    3:getfield        #42  <Field byte[] buf>
	//    4    6:ifnull          80
		if(-1 == markpos)
			break MISSING_BLOCK_LABEL_28;
	//    5    9:iconst_m1       
	//    6   10:aload_0         
	//    7   11:getfield        #31  <Field int markpos>
	//    8   14:icmpeq          28
		pos = markpos;
	//    9   17:aload_0         
	//   10   18:aload_0         
	//   11   19:getfield        #31  <Field int markpos>
	//   12   22:putfield        #49  <Field int pos>
		this;
	//   13   25:aload_0         
		JVM INSTR monitorexit ;
	//   14   26:monitorexit     
		return;
	//   15   27:return          
		StringBuilder stringbuilder = new StringBuilder();
	//   16   28:new             #111 <Class StringBuilder>
	//   17   31:dup             
	//   18   32:invokespecial   #113 <Method void StringBuilder()>
	//   19   35:astore_1        
		stringbuilder.append("Mark has been invalidated, pos: ");
	//   20   36:aload_1         
	//   21   37:ldc1            #115 <String "Mark has been invalidated, pos: ">
	//   22   39:invokevirtual   #119 <Method StringBuilder StringBuilder.append(String)>
	//   23   42:pop             
		stringbuilder.append(pos);
	//   24   43:aload_1         
	//   25   44:aload_0         
	//   26   45:getfield        #49  <Field int pos>
	//   27   48:invokevirtual   #122 <Method StringBuilder StringBuilder.append(int)>
	//   28   51:pop             
		stringbuilder.append(" markLimit: ");
	//   29   52:aload_1         
	//   30   53:ldc1            #124 <String " markLimit: ">
	//   31   55:invokevirtual   #119 <Method StringBuilder StringBuilder.append(String)>
	//   32   58:pop             
		stringbuilder.append(marklimit);
	//   33   59:aload_1         
	//   34   60:aload_0         
	//   35   61:getfield        #51  <Field int marklimit>
	//   36   64:invokevirtual   #122 <Method StringBuilder StringBuilder.append(int)>
	//   37   67:pop             
		throw new InvalidMarkException(stringbuilder.toString());
	//   38   68:new             #6   <Class RecyclableBufferedInputStream$InvalidMarkException>
	//   39   71:dup             
	//   40   72:aload_1         
	//   41   73:invokevirtual   #128 <Method String StringBuilder.toString()>
	//   42   76:invokespecial   #129 <Method void RecyclableBufferedInputStream$InvalidMarkException(String)>
	//   43   79:athrow          
		throw new IOException("Stream is closed");
	//   44   80:new             #47  <Class IOException>
	//   45   83:dup             
	//   46   84:ldc1            #131 <String "Stream is closed">
	//   47   86:invokespecial   #80  <Method void IOException(String)>
	//   48   89:athrow          
		Exception exception;
		exception;
	//   49   90:astore_1        
		this;
	//   50   91:aload_0         
		JVM INSTR monitorexit ;
	//   51   92:monitorexit     
		throw exception;
	//   52   93:aload_1         
	//   53   94:athrow          
	}

	public long skip(long l)
		throws IOException
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(l < 1L)
	//*   2    2:lload_1         
	//*   3    3:lconst_1        
	//*   4    4:lcmp            
	//*   5    5:ifge            12
	//*   6    8:aload_0         
			return 0L;
	//    7    9:monitorexit     
	//    8   10:lconst_0        
	//    9   11:lreturn         
		byte abyte0[] = buf;
	//   10   12:aload_0         
	//   11   13:getfield        #42  <Field byte[] buf>
	//   12   16:astore          8
		if(abyte0 == null)
			break MISSING_BLOCK_LABEL_212;
	//   13   18:aload           8
	//   14   20:ifnull          212
		InputStream inputstream = in;
	//   15   23:aload_0         
	//   16   24:getfield        #86  <Field InputStream in>
	//   17   27:astore          9
		if(inputstream == null)
			break MISSING_BLOCK_LABEL_208;
	//   18   29:aload           9
	//   19   31:ifnull          208
		if((long)(count - pos) < l)
			break MISSING_BLOCK_LABEL_65;
	//   20   34:aload_0         
	//   21   35:getfield        #53  <Field int count>
	//   22   38:aload_0         
	//   23   39:getfield        #49  <Field int pos>
	//   24   42:isub            
	//   25   43:i2l             
	//   26   44:lload_1         
	//   27   45:lcmp            
	//   28   46:iflt            65
		pos = (int)((long)pos + l);
	//   29   49:aload_0         
	//   30   50:aload_0         
	//   31   51:getfield        #49  <Field int pos>
	//   32   54:i2l             
	//   33   55:lload_1         
	//   34   56:ladd            
	//   35   57:l2i             
	//   36   58:putfield        #49  <Field int pos>
		this;
	//   37   61:aload_0         
		JVM INSTR monitorexit ;
	//   38   62:monitorexit     
		return l;
	//   39   63:lload_1         
	//   40   64:lreturn         
		int i;
		long l1;
		l1 = (long)count - (long)pos;
	//   41   65:aload_0         
	//   42   66:getfield        #53  <Field int count>
	//   43   69:i2l             
	//   44   70:aload_0         
	//   45   71:getfield        #49  <Field int pos>
	//   46   74:i2l             
	//   47   75:lsub            
	//   48   76:lstore          4
		pos = count;
	//   49   78:aload_0         
	//   50   79:aload_0         
	//   51   80:getfield        #53  <Field int count>
	//   52   83:putfield        #49  <Field int pos>
		if(markpos == -1 || l > (long)marklimit)
			break MISSING_BLOCK_LABEL_191;
	//   53   86:aload_0         
	//   54   87:getfield        #31  <Field int markpos>
	//   55   90:iconst_m1       
	//   56   91:icmpeq          191
	//   57   94:lload_1         
	//   58   95:aload_0         
	//   59   96:getfield        #51  <Field int marklimit>
	//   60   99:i2l             
	//   61  100:lcmp            
	//   62  101:ifgt            191
		i = fillbuf(inputstream, abyte0);
	//   63  104:aload_0         
	//   64  105:aload           9
	//   65  107:aload           8
	//   66  109:invokespecial   #107 <Method int fillbuf(InputStream, byte[])>
	//   67  112:istore_3        
		if(i != -1)
			break MISSING_BLOCK_LABEL_123;
	//   68  113:iload_3         
	//   69  114:iconst_m1       
	//   70  115:icmpne          123
		this;
	//   71  118:aload_0         
		JVM INSTR monitorexit ;
	//   72  119:monitorexit     
		return l1;
	//   73  120:lload           4
	//   74  122:lreturn         
		if((long)(count - pos) < l - l1)
			break MISSING_BLOCK_LABEL_160;
	//   75  123:aload_0         
	//   76  124:getfield        #53  <Field int count>
	//   77  127:aload_0         
	//   78  128:getfield        #49  <Field int pos>
	//   79  131:isub            
	//   80  132:i2l             
	//   81  133:lload_1         
	//   82  134:lload           4
	//   83  136:lsub            
	//   84  137:lcmp            
	//   85  138:iflt            160
		pos = (int)(((long)pos + l) - l1);
	//   86  141:aload_0         
	//   87  142:aload_0         
	//   88  143:getfield        #49  <Field int pos>
	//   89  146:i2l             
	//   90  147:lload_1         
	//   91  148:ladd            
	//   92  149:lload           4
	//   93  151:lsub            
	//   94  152:l2i             
	//   95  153:putfield        #49  <Field int pos>
		this;
	//   96  156:aload_0         
		JVM INSTR monitorexit ;
	//   97  157:monitorexit     
		return l;
	//   98  158:lload_1         
	//   99  159:lreturn         
		long l2;
		l = count;
	//  100  160:aload_0         
	//  101  161:getfield        #53  <Field int count>
	//  102  164:i2l             
	//  103  165:lstore_1        
		l2 = pos;
	//  104  166:aload_0         
	//  105  167:getfield        #49  <Field int pos>
	//  106  170:i2l             
	//  107  171:lstore          6
		pos = count;
	//  108  173:aload_0         
	//  109  174:aload_0         
	//  110  175:getfield        #53  <Field int count>
	//  111  178:putfield        #49  <Field int pos>
		this;
	//  112  181:aload_0         
		JVM INSTR monitorexit ;
	//  113  182:monitorexit     
		return (l1 + l) - l2;
	//  114  183:lload           4
	//  115  185:lload_1         
	//  116  186:ladd            
	//  117  187:lload           6
	//  118  189:lsub            
	//  119  190:lreturn         
		l = inputstream.skip(l - l1);
	//  120  191:aload           9
	//  121  193:lload_1         
	//  122  194:lload           4
	//  123  196:lsub            
	//  124  197:invokevirtual   #135 <Method long InputStream.skip(long)>
	//  125  200:lstore_1        
		this;
	//  126  201:aload_0         
		JVM INSTR monitorexit ;
	//  127  202:monitorexit     
		return l1 + l;
	//  128  203:lload           4
	//  129  205:lload_1         
	//  130  206:ladd            
	//  131  207:lreturn         
		throw streamClosed();
	//  132  208:invokestatic    #90  <Method IOException streamClosed()>
	//  133  211:athrow          
		throw streamClosed();
	//  134  212:invokestatic    #90  <Method IOException streamClosed()>
	//  135  215:athrow          
		Exception exception;
		exception;
	//  136  216:astore          8
		this;
	//  137  218:aload_0         
		JVM INSTR monitorexit ;
	//  138  219:monitorexit     
		throw exception;
	//  139  220:aload           8
	//  140  222:athrow          
	}

	private volatile byte buf[];
	private final ArrayPool byteArrayPool;
	private int count;
	private int marklimit;
	private int markpos;
	private int pos;
}
