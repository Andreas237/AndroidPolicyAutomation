// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.dumpapp;

import java.io.*;

// Referenced classes of package com.facebook.stetho.dumpapp:
//			Framer, DumpappFramingException, UnexpectedFrameException

private class Framer$FramingInputStream extends InputStream
{

	public void close()
		throws IOException
	{
		mClosedHelper.close();
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field Framer$ClosedHelper mClosedHelper>
	//    2    4:invokevirtual   #34  <Method void Framer$ClosedHelper.close()>
	//    3    7:return          
	}

	public int read()
		throws IOException
	{
		byte abyte0[] = new byte[1];
	//    0    0:iconst_1        
	//    1    1:newarray        byte[]
	//    2    3:astore_1        
		if(read(abyte0) == 0)
	//*   3    4:aload_0         
	//*   4    5:aload_1         
	//*   5    6:invokevirtual   #40  <Method int read(byte[])>
	//*   6    9:ifne            14
			return -1;
	//    7   12:iconst_m1       
	//    8   13:ireturn         
		else
			return ((int) (abyte0[0]));
	//    9   14:aload_1         
	//   10   15:iconst_0        
	//   11   16:baload          
	//   12   17:ireturn         
	}

	public int read(byte abyte0[])
		throws IOException
	{
		return read(abyte0, 0, abyte0.length);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:aload_1         
	//    4    4:arraylength     
	//    5    5:invokevirtual   #43  <Method int read(byte[], int, int)>
	//    6    8:ireturn         
	}

	public int read(byte abyte0[], int i, int j)
		throws IOException
	{
		mClosedHelper.throwIfClosed();
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field Framer$ClosedHelper mClosedHelper>
	//    2    4:invokevirtual   #46  <Method void Framer$ClosedHelper.throwIfClosed()>
		Framer framer = Framer.this;
	//    3    7:aload_0         
	//    4    8:getfield        #15  <Field Framer this$0>
	//    5   11:astore          6
		framer;
	//    6   13:aload           6
		JVM INSTR monitorenter ;
	//    7   15:monitorenter    
		byte byte0;
		writeIntFrame((byte)95, j);
	//    8   16:aload_0         
	//    9   17:getfield        #15  <Field Framer this$0>
	//   10   20:bipush          95
	//   11   22:iload_3         
	//   12   23:invokevirtual   #50  <Method void Framer.writeIntFrame(byte, int)>
		byte0 = readFrameType();
	//   13   26:aload_0         
	//   14   27:getfield        #15  <Field Framer this$0>
	//   15   30:invokevirtual   #54  <Method byte Framer.readFrameType()>
	//   16   33:istore          4
		if(byte0 != 45)
			break MISSING_BLOCK_LABEL_132;
	//   17   35:iload           4
	//   18   37:bipush          45
	//   19   39:icmpne          132
		int k = readInt();
	//   20   42:aload_0         
	//   21   43:getfield        #15  <Field Framer this$0>
	//   22   46:invokevirtual   #57  <Method int Framer.readInt()>
	//   23   49:istore          5
		if(k <= 0)
			break MISSING_BLOCK_LABEL_126;
	//   24   51:iload           5
	//   25   53:ifle            126
		if(k > j)
			break MISSING_BLOCK_LABEL_79;
	//   26   56:iload           5
	//   27   58:iload_3         
	//   28   59:icmpgt          79
		Framer.access$200(Framer.this).readFully(abyte0, i, k);
	//   29   62:aload_0         
	//   30   63:getfield        #15  <Field Framer this$0>
	//   31   66:invokestatic    #61  <Method DataInputStream Framer.access$200(Framer)>
	//   32   69:aload_1         
	//   33   70:iload_2         
	//   34   71:iload           5
	//   35   73:invokevirtual   #67  <Method void DataInputStream.readFully(byte[], int, int)>
		break MISSING_BLOCK_LABEL_126;
	//   36   76:goto            126
		abyte0 = ((byte []) (new StringBuilder()));
	//   37   79:new             #69  <Class StringBuilder>
	//   38   82:dup             
	//   39   83:invokespecial   #70  <Method void StringBuilder()>
	//   40   86:astore_1        
		((StringBuilder) (abyte0)).append("Expected at most ");
	//   41   87:aload_1         
	//   42   88:ldc1            #72  <String "Expected at most ">
	//   43   90:invokevirtual   #76  <Method StringBuilder StringBuilder.append(String)>
	//   44   93:pop             
		((StringBuilder) (abyte0)).append(j);
	//   45   94:aload_1         
	//   46   95:iload_3         
	//   47   96:invokevirtual   #79  <Method StringBuilder StringBuilder.append(int)>
	//   48   99:pop             
		((StringBuilder) (abyte0)).append(" bytes, got: ");
	//   49  100:aload_1         
	//   50  101:ldc1            #81  <String " bytes, got: ">
	//   51  103:invokevirtual   #76  <Method StringBuilder StringBuilder.append(String)>
	//   52  106:pop             
		((StringBuilder) (abyte0)).append(k);
	//   53  107:aload_1         
	//   54  108:iload           5
	//   55  110:invokevirtual   #79  <Method StringBuilder StringBuilder.append(int)>
	//   56  113:pop             
		throw new DumpappFramingException(((StringBuilder) (abyte0)).toString());
	//   57  114:new             #83  <Class DumpappFramingException>
	//   58  117:dup             
	//   59  118:aload_1         
	//   60  119:invokevirtual   #87  <Method String StringBuilder.toString()>
	//   61  122:invokespecial   #90  <Method void DumpappFramingException(String)>
	//   62  125:athrow          
		framer;
	//   63  126:aload           6
		JVM INSTR monitorexit ;
	//   64  128:monitorexit     
		return k;
	//   65  129:iload           5
	//   66  131:ireturn         
		throw new UnexpectedFrameException((byte)45, byte0);
	//   67  132:new             #92  <Class UnexpectedFrameException>
	//   68  135:dup             
	//   69  136:bipush          45
	//   70  138:iload           4
	//   71  140:invokespecial   #95  <Method void UnexpectedFrameException(byte, byte)>
	//   72  143:athrow          
		abyte0;
	//   73  144:astore_1        
		framer;
	//   74  145:aload           6
		JVM INSTR monitorexit ;
	//   75  147:monitorexit     
		throw abyte0;
	//   76  148:aload_1         
	//   77  149:athrow          
	}

	public long skip(long l)
		throws IOException
	{
		byte abyte0[] = new byte[(int)Math.min(l, 2048L)];
	//    0    0:lload_1         
	//    1    1:ldc2w           #98  <Long 2048L>
	//    2    4:invokestatic    #105 <Method long Math.min(long, long)>
	//    3    7:l2i             
	//    4    8:newarray        byte[]
	//    5   10:astore          7
		Framer framer = Framer.this;
	//    6   12:aload_0         
	//    7   13:getfield        #15  <Field Framer this$0>
	//    8   16:astore          6
		framer;
	//    9   18:aload           6
		JVM INSTR monitorenter ;
	//   10   20:monitorenter    
		long l1 = 0L;
	//   11   21:lconst_0        
	//   12   22:lstore          4
_L2:
		if(l1 >= l)
			break MISSING_BLOCK_LABEL_45;
	//   13   24:lload           4
	//   14   26:lload_1         
	//   15   27:lcmp            
	//   16   28:ifge            45
		int i = read(abyte0);
	//   17   31:aload_0         
	//   18   32:aload           7
	//   19   34:invokevirtual   #40  <Method int read(byte[])>
	//   20   37:istore_3        
		if(i >= 0)
	//*  21   38:iload_3         
	//*  22   39:ifge            59
			break MISSING_BLOCK_LABEL_59;
	//   23   42:goto            45
		framer;
	//   24   45:aload           6
		JVM INSTR monitorexit ;
	//   25   47:monitorexit     
		return l1;
	//   26   48:lload           4
	//   27   50:lreturn         
		Exception exception;
		exception;
	//   28   51:astore          7
		framer;
	//   29   53:aload           6
		JVM INSTR monitorexit ;
	//   30   55:monitorexit     
		throw exception;
	//   31   56:aload           7
	//   32   58:athrow          
		l1 += i;
	//   33   59:lload           4
	//   34   61:iload_3         
	//   35   62:i2l             
	//   36   63:ladd            
	//   37   64:lstore          4
		if(true) goto _L2; else goto _L1
	//   38   66:goto            24
_L1:
	}

	private final Framer.ClosedHelper mClosedHelper;
	final Framer this$0;

	private Framer$FramingInputStream()
	{
		this$0 = Framer.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field Framer this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #18  <Method void InputStream()>
		mClosedHelper = new Framer.ClosedHelper(((Framer._cls1) (null)));
	//    5    9:aload_0         
	//    6   10:new             #20  <Class Framer$ClosedHelper>
	//    7   13:dup             
	//    8   14:aconst_null     
	//    9   15:invokespecial   #23  <Method void Framer$ClosedHelper(Framer$1)>
	//   10   18:putfield        #25  <Field Framer$ClosedHelper mClosedHelper>
	//   11   21:return          
	}

	Framer$FramingInputStream(Framer._cls1 _pcls1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #29  <Method void Framer$FramingInputStream(Framer)>
	//    3    5:return          
	}
}
