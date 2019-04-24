// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.resource.bitmap;

import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;
import java.io.*;

public class RecyclableBufferedInputStream extends FilterInputStream
{
	public static class InvalidMarkException extends IOException
	{

		private static final long serialVersionUID = 0x37664863L;

		public InvalidMarkException(String s)
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
	//    3    3:ldc1            #19  <Int 0x10000>
	//    4    5:invokespecial   #22  <Method void RecyclableBufferedInputStream(InputStream, ArrayPool, int)>
	//    5    8:return          
	}

	RecyclableBufferedInputStream(InputStream inputstream, ArrayPool arraypool, int i)
	{
		super(inputstream);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #26  <Method void FilterInputStream(InputStream)>
		markpos = -1;
	//    3    5:aload_0         
	//    4    6:iconst_m1       
	//    5    7:putfield        #28  <Field int markpos>
		byteArrayPool = arraypool;
	//    6   10:aload_0         
	//    7   11:aload_2         
	//    8   12:putfield        #30  <Field ArrayPool byteArrayPool>
		buf = (byte[])arraypool.get(i, [B);
	//    9   15:aload_0         
	//   10   16:aload_2         
	//   11   17:iload_3         
	//   12   18:ldc1            #31  <Class byte[]>
	//   13   20:invokeinterface #37  <Method Object ArrayPool.get(int, Class)>
	//   14   25:checkcast       #31  <Class byte[]>
	//   15   28:putfield        #39  <Field byte[] buf>
	//   16   31:return          
	}

	private int fillbuf(InputStream inputstream, byte abyte0[])
		throws IOException
	{
		if(markpos == -1 || pos - markpos >= marklimit)
	//*   0    0:aload_0         
	//*   1    1:getfield        #28  <Field int markpos>
	//*   2    4:iconst_m1       
	//*   3    5:icmpeq          24
	//*   4    8:aload_0         
	//*   5    9:getfield        #45  <Field int pos>
	//*   6   12:aload_0         
	//*   7   13:getfield        #28  <Field int markpos>
	//*   8   16:isub            
	//*   9   17:aload_0         
	//*  10   18:getfield        #47  <Field int marklimit>
	//*  11   21:icmplt          51
		{
			int i = inputstream.read(abyte0);
	//   12   24:aload_1         
	//   13   25:aload_2         
	//   14   26:invokevirtual   #53  <Method int InputStream.read(byte[])>
	//   15   29:istore_3        
			if(i > 0)
	//*  16   30:iload_3         
	//*  17   31:ifle            49
			{
				markpos = -1;
	//   18   34:aload_0         
	//   19   35:iconst_m1       
	//   20   36:putfield        #28  <Field int markpos>
				pos = 0;
	//   21   39:aload_0         
	//   22   40:iconst_0        
	//   23   41:putfield        #45  <Field int pos>
				count = i;
	//   24   44:aload_0         
	//   25   45:iload_3         
	//   26   46:putfield        #55  <Field int count>
			}
			return i;
	//   27   49:iload_3         
	//   28   50:ireturn         
		}
		byte abyte1[];
		if(markpos == 0 && marklimit > abyte0.length && count == abyte0.length)
	//*  29   51:aload_0         
	//*  30   52:getfield        #28  <Field int markpos>
	//*  31   55:ifne            147
	//*  32   58:aload_0         
	//*  33   59:getfield        #47  <Field int marklimit>
	//*  34   62:aload_2         
	//*  35   63:arraylength     
	//*  36   64:icmple          147
	//*  37   67:aload_0         
	//*  38   68:getfield        #55  <Field int count>
	//*  39   71:aload_2         
	//*  40   72:arraylength     
	//*  41   73:icmpne          147
		{
			int l = abyte0.length * 2;
	//   42   76:aload_2         
	//   43   77:arraylength     
	//   44   78:iconst_2        
	//   45   79:imul            
	//   46   80:istore          4
			int j = l;
	//   47   82:iload           4
	//   48   84:istore_3        
			if(l > marklimit)
	//*  49   85:iload           4
	//*  50   87:aload_0         
	//*  51   88:getfield        #47  <Field int marklimit>
	//*  52   91:icmple          99
				j = marklimit;
	//   53   94:aload_0         
	//   54   95:getfield        #47  <Field int marklimit>
	//   55   98:istore_3        
			abyte1 = (byte[])byteArrayPool.get(j, [B);
	//   56   99:aload_0         
	//   57  100:getfield        #30  <Field ArrayPool byteArrayPool>
	//   58  103:iload_3         
	//   59  104:ldc1            #31  <Class byte[]>
	//   60  106:invokeinterface #37  <Method Object ArrayPool.get(int, Class)>
	//   61  111:checkcast       #31  <Class byte[]>
	//   62  114:astore          5
			System.arraycopy(((Object) (abyte0)), 0, ((Object) (abyte1)), 0, abyte0.length);
	//   63  116:aload_2         
	//   64  117:iconst_0        
	//   65  118:aload           5
	//   66  120:iconst_0        
	//   67  121:aload_2         
	//   68  122:arraylength     
	//   69  123:invokestatic    #61  <Method void System.arraycopy(Object, int, Object, int, int)>
			buf = abyte1;
	//   70  126:aload_0         
	//   71  127:aload           5
	//   72  129:putfield        #39  <Field byte[] buf>
			byteArrayPool.put(((Object) (abyte0)), [B);
	//   73  132:aload_0         
	//   74  133:getfield        #30  <Field ArrayPool byteArrayPool>
	//   75  136:aload_2         
	//   76  137:ldc1            #31  <Class byte[]>
	//   77  139:invokeinterface #65  <Method void ArrayPool.put(Object, Class)>
		} else
	//*  78  144:goto            177
		{
			abyte1 = abyte0;
	//   79  147:aload_2         
	//   80  148:astore          5
			if(markpos > 0)
	//*  81  150:aload_0         
	//*  82  151:getfield        #28  <Field int markpos>
	//*  83  154:ifle            177
			{
				System.arraycopy(((Object) (abyte0)), markpos, ((Object) (abyte0)), 0, abyte0.length - markpos);
	//   84  157:aload_2         
	//   85  158:aload_0         
	//   86  159:getfield        #28  <Field int markpos>
	//   87  162:aload_2         
	//   88  163:iconst_0        
	//   89  164:aload_2         
	//   90  165:arraylength     
	//   91  166:aload_0         
	//   92  167:getfield        #28  <Field int markpos>
	//   93  170:isub            
	//   94  171:invokestatic    #61  <Method void System.arraycopy(Object, int, Object, int, int)>
				abyte1 = abyte0;
	//   95  174:aload_2         
	//   96  175:astore          5
			}
		}
		pos = pos - markpos;
	//   97  177:aload_0         
	//   98  178:aload_0         
	//   99  179:getfield        #45  <Field int pos>
	//  100  182:aload_0         
	//  101  183:getfield        #28  <Field int markpos>
	//  102  186:isub            
	//  103  187:putfield        #45  <Field int pos>
		markpos = 0;
	//  104  190:aload_0         
	//  105  191:iconst_0        
	//  106  192:putfield        #28  <Field int markpos>
		count = 0;
	//  107  195:aload_0         
	//  108  196:iconst_0        
	//  109  197:putfield        #55  <Field int count>
		int i1 = inputstream.read(abyte1, pos, abyte1.length - pos);
	//  110  200:aload_1         
	//  111  201:aload           5
	//  112  203:aload_0         
	//  113  204:getfield        #45  <Field int pos>
	//  114  207:aload           5
	//  115  209:arraylength     
	//  116  210:aload_0         
	//  117  211:getfield        #45  <Field int pos>
	//  118  214:isub            
	//  119  215:invokevirtual   #68  <Method int InputStream.read(byte[], int, int)>
	//  120  218:istore          4
		int k;
		if(i1 <= 0)
	//* 121  220:iload           4
	//* 122  222:ifgt            233
			k = pos;
	//  123  225:aload_0         
	//  124  226:getfield        #45  <Field int pos>
	//  125  229:istore_3        
		else
	//* 126  230:goto            241
			k = pos + i1;
	//  127  233:aload_0         
	//  128  234:getfield        #45  <Field int pos>
	//  129  237:iload           4
	//  130  239:iadd            
	//  131  240:istore_3        
		count = k;
	//  132  241:aload_0         
	//  133  242:iload_3         
	//  134  243:putfield        #55  <Field int count>
		return i1;
	//  135  246:iload           4
	//  136  248:ireturn         
	}

	private static IOException streamClosed()
		throws IOException
	{
		throw new IOException("BufferedInputStream is closed");
	//    0    0:new             #43  <Class IOException>
	//    1    3:dup             
	//    2    4:ldc1            #73  <String "BufferedInputStream is closed">
	//    3    6:invokespecial   #76  <Method void IOException(String)>
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
	//    3    3:getfield        #82  <Field InputStream in>
	//    4    6:astore          4
		if(buf != null && inputstream != null)
			break MISSING_BLOCK_LABEL_24;
	//    5    8:aload_0         
	//    6    9:getfield        #39  <Field byte[] buf>
	//    7   12:ifnull          20
	//    8   15:aload           4
	//    9   17:ifnonnull       24
		throw streamClosed();
	//   10   20:invokestatic    #84  <Method IOException streamClosed()>
	//   11   23:athrow          
		int i;
		int j;
		int k;
		i = count;
	//   12   24:aload_0         
	//   13   25:getfield        #55  <Field int count>
	//   14   28:istore_1        
		j = pos;
	//   15   29:aload_0         
	//   16   30:getfield        #45  <Field int pos>
	//   17   33:istore_2        
		k = inputstream.available();
	//   18   34:aload           4
	//   19   36:invokevirtual   #86  <Method int InputStream.available()>
	//   20   39:istore_3        
		this;
	//   21   40:aload_0         
		JVM INSTR monitorexit ;
	//   22   41:monitorexit     
		return (i - j) + k;
	//   23   42:iload_1         
	//   24   43:iload_2         
	//   25   44:isub            
	//   26   45:iload_3         
	//   27   46:iadd            
	//   28   47:ireturn         
		Exception exception;
		exception;
	//   29   48:astore          4
	//*  30   50:aload_0         
		throw exception;
	//   31   51:monitorexit     
	//   32   52:aload           4
	//   33   54:athrow          
	}

	public void close()
		throws IOException
	{
		if(buf != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #39  <Field byte[] buf>
	//*   2    4:ifnull          27
		{
			byteArrayPool.put(((Object) (buf)), [B);
	//    3    7:aload_0         
	//    4    8:getfield        #30  <Field ArrayPool byteArrayPool>
	//    5   11:aload_0         
	//    6   12:getfield        #39  <Field byte[] buf>
	//    7   15:ldc1            #31  <Class byte[]>
	//    8   17:invokeinterface #65  <Method void ArrayPool.put(Object, Class)>
			buf = null;
	//    9   22:aload_0         
	//   10   23:aconst_null     
	//   11   24:putfield        #39  <Field byte[] buf>
		}
		InputStream inputstream = in;
	//   12   27:aload_0         
	//   13   28:getfield        #82  <Field InputStream in>
	//   14   31:astore_1        
		in = null;
	//   15   32:aload_0         
	//   16   33:aconst_null     
	//   17   34:putfield        #82  <Field InputStream in>
		if(inputstream != null)
	//*  18   37:aload_1         
	//*  19   38:ifnull          45
			inputstream.close();
	//   20   41:aload_1         
	//   21   42:invokevirtual   #90  <Method void InputStream.close()>
	//   22   45:return          
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
	//    4    4:getfield        #39  <Field byte[] buf>
	//    5    7:arraylength     
	//    6    8:putfield        #47  <Field int marklimit>
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
	//    4    4:getfield        #47  <Field int marklimit>
	//    5    7:iload_1         
	//    6    8:invokestatic    #99  <Method int Math.max(int, int)>
	//    7   11:putfield        #47  <Field int marklimit>
		markpos = pos;
	//    8   14:aload_0         
	//    9   15:aload_0         
	//   10   16:getfield        #45  <Field int pos>
	//   11   19:putfield        #28  <Field int markpos>
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
	//    3    3:getfield        #39  <Field byte[] buf>
	//    4    6:astore_3        
		inputstream = in;
	//    5    7:aload_0         
	//    6    8:getfield        #82  <Field InputStream in>
	//    7   11:astore_2        
		if(abyte1 != null && inputstream != null)
			break MISSING_BLOCK_LABEL_24;
	//    8   12:aload_3         
	//    9   13:ifnull          20
	//   10   16:aload_2         
	//   11   17:ifnonnull       24
		throw streamClosed();
	//   12   20:invokestatic    #84  <Method IOException streamClosed()>
	//   13   23:athrow          
		if(pos < count || fillbuf(inputstream, abyte1) != -1)
			break MISSING_BLOCK_LABEL_49;
	//   14   24:aload_0         
	//   15   25:getfield        #45  <Field int pos>
	//   16   28:aload_0         
	//   17   29:getfield        #55  <Field int count>
	//   18   32:icmplt          49
	//   19   35:aload_0         
	//   20   36:aload_2         
	//   21   37:aload_3         
	//   22   38:invokespecial   #103 <Method int fillbuf(InputStream, byte[])>
	//   23   41:iconst_m1       
	//   24   42:icmpne          49
		this;
	//   25   45:aload_0         
		JVM INSTR monitorexit ;
	//   26   46:monitorexit     
		return -1;
	//   27   47:iconst_m1       
	//   28   48:ireturn         
		byte abyte0[] = abyte1;
	//   29   49:aload_3         
	//   30   50:astore_2        
		if(abyte1 == buf)
			break MISSING_BLOCK_LABEL_74;
	//   31   51:aload_3         
	//   32   52:aload_0         
	//   33   53:getfield        #39  <Field byte[] buf>
	//   34   56:if_acmpeq       74
		abyte1 = buf;
	//   35   59:aload_0         
	//   36   60:getfield        #39  <Field byte[] buf>
	//   37   63:astore_3        
		abyte0 = abyte1;
	//   38   64:aload_3         
	//   39   65:astore_2        
		if(abyte1 != null)
			break MISSING_BLOCK_LABEL_74;
	//   40   66:aload_3         
	//   41   67:ifnonnull       74
		throw streamClosed();
	//   42   70:invokestatic    #84  <Method IOException streamClosed()>
	//   43   73:athrow          
		int i;
		if(count - pos <= 0)
			break MISSING_BLOCK_LABEL_110;
	//   44   74:aload_0         
	//   45   75:getfield        #55  <Field int count>
	//   46   78:aload_0         
	//   47   79:getfield        #45  <Field int pos>
	//   48   82:isub            
	//   49   83:ifle            110
		i = pos;
	//   50   86:aload_0         
	//   51   87:getfield        #45  <Field int pos>
	//   52   90:istore_1        
		pos = i + 1;
	//   53   91:aload_0         
	//   54   92:iload_1         
	//   55   93:iconst_1        
	//   56   94:iadd            
	//   57   95:putfield        #45  <Field int pos>
		i = ((int) (abyte0[i]));
	//   58   98:aload_2         
	//   59   99:iload_1         
	//   60  100:baload          
	//   61  101:istore_1        
		this;
	//   62  102:aload_0         
		JVM INSTR monitorexit ;
	//   63  103:monitorexit     
		return i & 0xff;
	//   64  104:iload_1         
	//   65  105:sipush          255
	//   66  108:iand            
	//   67  109:ireturn         
		this;
	//   68  110:aload_0         
		JVM INSTR monitorexit ;
	//   69  111:monitorexit     
		return -1;
	//   70  112:iconst_m1       
	//   71  113:ireturn         
		Exception exception;
		exception;
	//   72  114:astore_2        
	//*  73  115:aload_0         
		throw exception;
	//   74  116:monitorexit     
	//   75  117:aload_2         
	//   76  118:athrow          
	}

	public int read(byte abyte0[], int i, int j)
		throws IOException
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		byte abyte2[] = buf;
	//    2    2:aload_0         
	//    3    3:getfield        #39  <Field byte[] buf>
	//    4    6:astore          8
		if(abyte2 != null)
			break MISSING_BLOCK_LABEL_17;
	//    5    8:aload           8
	//    6   10:ifnonnull       17
		throw streamClosed();
	//    7   13:invokestatic    #84  <Method IOException streamClosed()>
	//    8   16:athrow          
		if(j != 0)
			break MISSING_BLOCK_LABEL_25;
	//    9   17:iload_3         
	//   10   18:ifne            25
		this;
	//   11   21:aload_0         
		JVM INSTR monitorexit ;
	//   12   22:monitorexit     
		return 0;
	//   13   23:iconst_0        
	//   14   24:ireturn         
		InputStream inputstream = in;
	//   15   25:aload_0         
	//   16   26:getfield        #82  <Field InputStream in>
	//   17   29:astore          9
		if(inputstream != null)
			break MISSING_BLOCK_LABEL_40;
	//   18   31:aload           9
	//   19   33:ifnonnull       40
		throw streamClosed();
	//   20   36:invokestatic    #84  <Method IOException streamClosed()>
	//   21   39:athrow          
		if(pos >= count) goto _L2; else goto _L1
	//   22   40:aload_0         
	//   23   41:getfield        #45  <Field int pos>
	//   24   44:aload_0         
	//   25   45:getfield        #55  <Field int count>
	//   26   48:icmpge          361
_L1:
		if(count - pos < j) goto _L4; else goto _L3
	//   27   51:aload_0         
	//   28   52:getfield        #55  <Field int count>
	//   29   55:aload_0         
	//   30   56:getfield        #45  <Field int pos>
	//   31   59:isub            
	//   32   60:iload_3         
	//   33   61:icmplt          70
_L3:
		int k = j;
	//   34   64:iload_3         
	//   35   65:istore          4
		  goto _L5
	//*  36   67:goto            81
_L4:
		k = count - pos;
	//   37   70:aload_0         
	//   38   71:getfield        #55  <Field int count>
	//   39   74:aload_0         
	//   40   75:getfield        #45  <Field int pos>
	//   41   78:isub            
	//   42   79:istore          4
_L5:
		System.arraycopy(((Object) (abyte2)), pos, ((Object) (abyte0)), i, k);
	//   43   81:aload           8
	//   44   83:aload_0         
	//   45   84:getfield        #45  <Field int pos>
	//   46   87:aload_1         
	//   47   88:iload_2         
	//   48   89:iload           4
	//   49   91:invokestatic    #61  <Method void System.arraycopy(Object, int, Object, int, int)>
		pos = pos + k;
	//   50   94:aload_0         
	//   51   95:aload_0         
	//   52   96:getfield        #45  <Field int pos>
	//   53   99:iload           4
	//   54  101:iadd            
	//   55  102:putfield        #45  <Field int pos>
		if(k == j) goto _L7; else goto _L6
	//   56  105:iload           4
	//   57  107:iload_3         
	//   58  108:icmpeq          119
_L6:
		if(inputstream.available() != 0) goto _L8; else goto _L7
	//   59  111:aload           9
	//   60  113:invokevirtual   #86  <Method int InputStream.available()>
	//   61  116:ifne            347
_L7:
		this;
	//   62  119:aload_0         
		JVM INSTR monitorexit ;
	//   63  120:monitorexit     
		return k;
	//   64  121:iload           4
	//   65  123:ireturn         
_L10:
		int i1;
		if(markpos != -1 || k < abyte2.length)
			break MISSING_BLOCK_LABEL_180;
	//   66  124:aload_0         
	//   67  125:getfield        #28  <Field int markpos>
	//   68  128:iconst_m1       
	//   69  129:icmpne          180
	//   70  132:iload           4
	//   71  134:aload           8
	//   72  136:arraylength     
	//   73  137:icmplt          180
		i1 = inputstream.read(abyte0, i, k);
	//   74  140:aload           9
	//   75  142:aload_1         
	//   76  143:iload_2         
	//   77  144:iload           4
	//   78  146:invokevirtual   #68  <Method int InputStream.read(byte[], int, int)>
	//   79  149:istore          6
		byte abyte1[] = abyte2;
	//   80  151:aload           8
	//   81  153:astore          7
		int l = i1;
	//   82  155:iload           6
	//   83  157:istore          5
		if(i1 != -1)
			break MISSING_BLOCK_LABEL_295;
	//   84  159:iload           6
	//   85  161:iconst_m1       
	//   86  162:icmpne          295
		if(k == j)
	//*  87  165:iload           4
	//*  88  167:iload_3         
	//*  89  168:icmpne          367
			i = -1;
	//   90  171:iconst_m1       
	//   91  172:istore_2        
		else
	//*  92  173:goto            176
	//*  93  176:aload_0         
	//*  94  177:monitorexit     
	//*  95  178:iload_2         
	//*  96  179:ireturn         
	//*  97  180:aload_0         
	//*  98  181:aload           9
	//*  99  183:aload           8
	//* 100  185:invokespecial   #103 <Method int fillbuf(InputStream, byte[])>
	//* 101  188:iconst_m1       
	//* 102  189:icmpne          207
	//* 103  192:iload           4
	//* 104  194:iload_3         
	//* 105  195:icmpne          375
	//* 106  198:iconst_m1       
	//* 107  199:istore_2        
	//* 108  200:goto            203
	//* 109  203:aload_0         
	//* 110  204:monitorexit     
	//* 111  205:iload_2         
	//* 112  206:ireturn         
	//* 113  207:aload           8
	//* 114  209:astore          7
	//* 115  211:aload           8
	//* 116  213:aload_0         
	//* 117  214:getfield        #39  <Field byte[] buf>
	//* 118  217:if_acmpeq       239
	//* 119  220:aload_0         
	//* 120  221:getfield        #39  <Field byte[] buf>
	//* 121  224:astore          8
	//* 122  226:aload           8
	//* 123  228:astore          7
	//* 124  230:aload           8
	//* 125  232:ifnonnull       239
	//* 126  235:invokestatic    #84  <Method IOException streamClosed()>
	//* 127  238:athrow          
	//* 128  239:aload_0         
	//* 129  240:getfield        #55  <Field int count>
	//* 130  243:aload_0         
	//* 131  244:getfield        #45  <Field int pos>
	//* 132  247:isub            
	//* 133  248:iload           4
	//* 134  250:icmplt          260
	//* 135  253:iload           4
	//* 136  255:istore          5
	//* 137  257:goto            271
	//* 138  260:aload_0         
	//* 139  261:getfield        #55  <Field int count>
	//* 140  264:aload_0         
	//* 141  265:getfield        #45  <Field int pos>
	//* 142  268:isub            
	//* 143  269:istore          5
	//* 144  271:aload           7
	//* 145  273:aload_0         
	//* 146  274:getfield        #45  <Field int pos>
	//* 147  277:aload_1         
	//* 148  278:iload_2         
	//* 149  279:iload           5
	//* 150  281:invokestatic    #61  <Method void System.arraycopy(Object, int, Object, int, int)>
	//* 151  284:aload_0         
	//* 152  285:aload_0         
	//* 153  286:getfield        #45  <Field int pos>
	//* 154  289:iload           5
	//* 155  291:iadd            
	//* 156  292:putfield        #45  <Field int pos>
	//* 157  295:iload           4
	//* 158  297:iload           5
	//* 159  299:isub            
	//* 160  300:istore          4
	//* 161  302:iload           4
	//* 162  304:ifne            311
	//* 163  307:aload_0         
	//* 164  308:monitorexit     
	//* 165  309:iload_3         
	//* 166  310:ireturn         
	//* 167  311:aload           9
	//* 168  313:invokevirtual   #86  <Method int InputStream.available()>
	//* 169  316:istore          6
	//* 170  318:iload           6
	//* 171  320:ifne            330
	//* 172  323:aload_0         
	//* 173  324:monitorexit     
	//* 174  325:iload_3         
	//* 175  326:iload           4
	//* 176  328:isub            
	//* 177  329:ireturn         
	//* 178  330:iload_2         
	//* 179  331:iload           5
	//* 180  333:iadd            
	//* 181  334:istore_2        
	//* 182  335:aload           7
	//* 183  337:astore          8
	//* 184  339:goto            124
	//* 185  342:astore_1        
	//* 186  343:aload_0         
	//* 187  344:monitorexit     
	//* 188  345:aload_1         
	//* 189  346:athrow          
	//* 190  347:iload_2         
	//* 191  348:iload           4
	//* 192  350:iadd            
	//* 193  351:istore_2        
	//* 194  352:iload_3         
	//* 195  353:iload           4
	//* 196  355:isub            
	//* 197  356:istore          4
	//* 198  358:goto            124
	//* 199  361:iload_3         
	//* 200  362:istore          4
	//* 201  364:goto            124
			i = j - k;
	//  202  367:iload_3         
	//  203  368:iload           4
	//  204  370:isub            
	//  205  371:istore_2        
		this;
		JVM INSTR monitorexit ;
		return i;
		if(fillbuf(inputstream, abyte2) != -1)
			break MISSING_BLOCK_LABEL_207;
		if(k == j)
			i = -1;
		else
	//* 206  372:goto            176
			i = j - k;
	//  207  375:iload_3         
	//  208  376:iload           4
	//  209  378:isub            
	//  210  379:istore_2        
		this;
		JVM INSTR monitorexit ;
		return i;
		abyte1 = abyte2;
		if(abyte2 == buf)
			break MISSING_BLOCK_LABEL_239;
		abyte2 = buf;
		abyte1 = abyte2;
		if(abyte2 != null)
			break MISSING_BLOCK_LABEL_239;
		throw streamClosed();
		if(count - pos >= k)
		{
			l = k;
			break MISSING_BLOCK_LABEL_271;
		}
		l = count - pos;
		System.arraycopy(((Object) (abyte1)), pos, ((Object) (abyte0)), i, l);
		pos = pos + l;
		k -= l;
		if(k != 0)
			break MISSING_BLOCK_LABEL_311;
		this;
		JVM INSTR monitorexit ;
		return j;
		i1 = inputstream.available();
		if(i1 != 0)
			break MISSING_BLOCK_LABEL_330;
		this;
		JVM INSTR monitorexit ;
		return j - k;
		i += l;
		abyte2 = abyte1;
		continue; /* Loop/switch isn't completed */
		abyte0;
		throw abyte0;
_L8:
		i += k;
		k = j - k;
		continue; /* Loop/switch isn't completed */
_L2:
		k = j;
		if(true) goto _L10; else goto _L9
_L9:
	//* 211  380:goto            203
	}

	public void release()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(buf != null)
	//*   2    2:aload_0         
	//*   3    3:getfield        #39  <Field byte[] buf>
	//*   4    6:ifnull          29
		{
			byteArrayPool.put(((Object) (buf)), [B);
	//    5    9:aload_0         
	//    6   10:getfield        #30  <Field ArrayPool byteArrayPool>
	//    7   13:aload_0         
	//    8   14:getfield        #39  <Field byte[] buf>
	//    9   17:ldc1            #31  <Class byte[]>
	//   10   19:invokeinterface #65  <Method void ArrayPool.put(Object, Class)>
			buf = null;
	//   11   24:aload_0         
	//   12   25:aconst_null     
	//   13   26:putfield        #39  <Field byte[] buf>
		}
		this;
	//   14   29:aload_0         
		JVM INSTR monitorexit ;
	//   15   30:monitorexit     
		return;
	//   16   31:return          
		Exception exception;
		exception;
	//   17   32:astore_1        
	//*  18   33:aload_0         
		throw exception;
	//   19   34:monitorexit     
	//   20   35:aload_1         
	//   21   36:athrow          
	}

	public void reset()
		throws IOException
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(buf == null)
	//*   2    2:aload_0         
	//*   3    3:getfield        #39  <Field byte[] buf>
	//*   4    6:ifnonnull       19
			throw new IOException("Stream is closed");
	//    5    9:new             #43  <Class IOException>
	//    6   12:dup             
	//    7   13:ldc1            #107 <String "Stream is closed">
	//    8   15:invokespecial   #76  <Method void IOException(String)>
	//    9   18:athrow          
		if(-1 == markpos)
	//*  10   19:iconst_m1       
	//*  11   20:aload_0         
	//*  12   21:getfield        #28  <Field int markpos>
	//*  13   24:icmpne          69
			throw new InvalidMarkException((new StringBuilder()).append("Mark has been invalidated, pos: ").append(pos).append(" markLimit: ").append(marklimit).toString());
	//   14   27:new             #6   <Class RecyclableBufferedInputStream$InvalidMarkException>
	//   15   30:dup             
	//   16   31:new             #109 <Class StringBuilder>
	//   17   34:dup             
	//   18   35:invokespecial   #111 <Method void StringBuilder()>
	//   19   38:ldc1            #113 <String "Mark has been invalidated, pos: ">
	//   20   40:invokevirtual   #117 <Method StringBuilder StringBuilder.append(String)>
	//   21   43:aload_0         
	//   22   44:getfield        #45  <Field int pos>
	//   23   47:invokevirtual   #120 <Method StringBuilder StringBuilder.append(int)>
	//   24   50:ldc1            #122 <String " markLimit: ">
	//   25   52:invokevirtual   #117 <Method StringBuilder StringBuilder.append(String)>
	//   26   55:aload_0         
	//   27   56:getfield        #47  <Field int marklimit>
	//   28   59:invokevirtual   #120 <Method StringBuilder StringBuilder.append(int)>
	//   29   62:invokevirtual   #126 <Method String StringBuilder.toString()>
	//   30   65:invokespecial   #127 <Method void RecyclableBufferedInputStream$InvalidMarkException(String)>
	//   31   68:athrow          
		pos = markpos;
	//   32   69:aload_0         
	//   33   70:aload_0         
	//   34   71:getfield        #28  <Field int markpos>
	//   35   74:putfield        #45  <Field int pos>
		this;
	//   36   77:aload_0         
		JVM INSTR monitorexit ;
	//   37   78:monitorexit     
		return;
	//   38   79:return          
		Exception exception;
		exception;
	//   39   80:astore_1        
	//*  40   81:aload_0         
		throw exception;
	//   41   82:monitorexit     
	//   42   83:aload_1         
	//   43   84:athrow          
	}

	public long skip(long l)
		throws IOException
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		byte abyte0[];
		InputStream inputstream;
		abyte0 = buf;
	//    2    2:aload_0         
	//    3    3:getfield        #39  <Field byte[] buf>
	//    4    6:astore          7
		inputstream = in;
	//    5    8:aload_0         
	//    6    9:getfield        #82  <Field InputStream in>
	//    7   12:astore          8
		if(abyte0 != null)
			break MISSING_BLOCK_LABEL_23;
	//    8   14:aload           7
	//    9   16:ifnonnull       23
		throw streamClosed();
	//   10   19:invokestatic    #84  <Method IOException streamClosed()>
	//   11   22:athrow          
		if(l >= 1L)
			break MISSING_BLOCK_LABEL_33;
	//   12   23:lload_1         
	//   13   24:lconst_1        
	//   14   25:lcmp            
	//   15   26:ifge            33
		this;
	//   16   29:aload_0         
		JVM INSTR monitorexit ;
	//   17   30:monitorexit     
		return 0L;
	//   18   31:lconst_0        
	//   19   32:lreturn         
		if(inputstream != null)
			break MISSING_BLOCK_LABEL_42;
	//   20   33:aload           8
	//   21   35:ifnonnull       42
		throw streamClosed();
	//   22   38:invokestatic    #84  <Method IOException streamClosed()>
	//   23   41:athrow          
		if((long)(count - pos) < l)
			break MISSING_BLOCK_LABEL_73;
	//   24   42:aload_0         
	//   25   43:getfield        #55  <Field int count>
	//   26   46:aload_0         
	//   27   47:getfield        #45  <Field int pos>
	//   28   50:isub            
	//   29   51:i2l             
	//   30   52:lload_1         
	//   31   53:lcmp            
	//   32   54:iflt            73
		pos = (int)((long)pos + l);
	//   33   57:aload_0         
	//   34   58:aload_0         
	//   35   59:getfield        #45  <Field int pos>
	//   36   62:i2l             
	//   37   63:lload_1         
	//   38   64:ladd            
	//   39   65:l2i             
	//   40   66:putfield        #45  <Field int pos>
		this;
	//   41   69:aload_0         
		JVM INSTR monitorexit ;
	//   42   70:monitorexit     
		return l;
	//   43   71:lload_1         
	//   44   72:lreturn         
		long l1;
		l1 = count - pos;
	//   45   73:aload_0         
	//   46   74:getfield        #55  <Field int count>
	//   47   77:aload_0         
	//   48   78:getfield        #45  <Field int pos>
	//   49   81:isub            
	//   50   82:i2l             
	//   51   83:lstore_3        
		pos = count;
	//   52   84:aload_0         
	//   53   85:aload_0         
	//   54   86:getfield        #55  <Field int count>
	//   55   89:putfield        #45  <Field int pos>
		if(markpos == -1 || l > (long)marklimit)
			break MISSING_BLOCK_LABEL_191;
	//   56   92:aload_0         
	//   57   93:getfield        #28  <Field int markpos>
	//   58   96:iconst_m1       
	//   59   97:icmpeq          191
	//   60  100:lload_1         
	//   61  101:aload_0         
	//   62  102:getfield        #47  <Field int marklimit>
	//   63  105:i2l             
	//   64  106:lcmp            
	//   65  107:ifgt            191
		if(fillbuf(inputstream, abyte0) != -1)
			break MISSING_BLOCK_LABEL_126;
	//   66  110:aload_0         
	//   67  111:aload           8
	//   68  113:aload           7
	//   69  115:invokespecial   #103 <Method int fillbuf(InputStream, byte[])>
	//   70  118:iconst_m1       
	//   71  119:icmpne          126
		this;
	//   72  122:aload_0         
		JVM INSTR monitorexit ;
	//   73  123:monitorexit     
		return l1;
	//   74  124:lload_3         
	//   75  125:lreturn         
		if((long)(count - pos) < l - l1)
			break MISSING_BLOCK_LABEL_161;
	//   76  126:aload_0         
	//   77  127:getfield        #55  <Field int count>
	//   78  130:aload_0         
	//   79  131:getfield        #45  <Field int pos>
	//   80  134:isub            
	//   81  135:i2l             
	//   82  136:lload_1         
	//   83  137:lload_3         
	//   84  138:lsub            
	//   85  139:lcmp            
	//   86  140:iflt            161
		pos = (int)((long)pos + (l - l1));
	//   87  143:aload_0         
	//   88  144:aload_0         
	//   89  145:getfield        #45  <Field int pos>
	//   90  148:i2l             
	//   91  149:lload_1         
	//   92  150:lload_3         
	//   93  151:lsub            
	//   94  152:ladd            
	//   95  153:l2i             
	//   96  154:putfield        #45  <Field int pos>
		this;
	//   97  157:aload_0         
		JVM INSTR monitorexit ;
	//   98  158:monitorexit     
		return l;
	//   99  159:lload_1         
	//  100  160:lreturn         
		long l2;
		l = count;
	//  101  161:aload_0         
	//  102  162:getfield        #55  <Field int count>
	//  103  165:i2l             
	//  104  166:lstore_1        
		l2 = pos;
	//  105  167:aload_0         
	//  106  168:getfield        #45  <Field int pos>
	//  107  171:i2l             
	//  108  172:lstore          5
		pos = count;
	//  109  174:aload_0         
	//  110  175:aload_0         
	//  111  176:getfield        #55  <Field int count>
	//  112  179:putfield        #45  <Field int pos>
		this;
	//  113  182:aload_0         
		JVM INSTR monitorexit ;
	//  114  183:monitorexit     
		return (l + l1) - l2;
	//  115  184:lload_1         
	//  116  185:lload_3         
	//  117  186:ladd            
	//  118  187:lload           5
	//  119  189:lsub            
	//  120  190:lreturn         
		l = inputstream.skip(l - l1);
	//  121  191:aload           8
	//  122  193:lload_1         
	//  123  194:lload_3         
	//  124  195:lsub            
	//  125  196:invokevirtual   #131 <Method long InputStream.skip(long)>
	//  126  199:lstore_1        
		this;
	//  127  200:aload_0         
		JVM INSTR monitorexit ;
	//  128  201:monitorexit     
		return l + l1;
	//  129  202:lload_1         
	//  130  203:lload_3         
	//  131  204:ladd            
	//  132  205:lreturn         
		Exception exception;
		exception;
	//  133  206:astore          7
	//* 134  208:aload_0         
		throw exception;
	//  135  209:monitorexit     
	//  136  210:aload           7
	//  137  212:athrow          
	}

	private volatile byte buf[];
	private final ArrayPool byteArrayPool;
	private int count;
	private int marklimit;
	private int markpos;
	private int pos;
}
