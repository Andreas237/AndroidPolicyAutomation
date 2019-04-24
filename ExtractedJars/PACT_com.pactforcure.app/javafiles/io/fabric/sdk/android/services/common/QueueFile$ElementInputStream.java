// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.fabric.sdk.android.services.common;

import java.io.*;

// Referenced classes of package io.fabric.sdk.android.services.common:
//			QueueFile

private final class QueueFile$ElementInputStream extends InputStream
{

	public int read()
		throws IOException
	{
		if(remaining == 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #33  <Field int remaining>
	//*   2    4:ifne            9
		{
			return -1;
	//    3    7:iconst_m1       
	//    4    8:ireturn         
		} else
		{
			QueueFile.access$400(QueueFile.this).seek(position);
	//    5    9:aload_0         
	//    6   10:getfield        #16  <Field QueueFile this$0>
	//    7   13:invokestatic    #45  <Method RandomAccessFile QueueFile.access$400(QueueFile)>
	//    8   16:aload_0         
	//    9   17:getfield        #28  <Field int position>
	//   10   20:i2l             
	//   11   21:invokevirtual   #51  <Method void RandomAccessFile.seek(long)>
			int i = QueueFile.access$400(QueueFile.this).read();
	//   12   24:aload_0         
	//   13   25:getfield        #16  <Field QueueFile this$0>
	//   14   28:invokestatic    #45  <Method RandomAccessFile QueueFile.access$400(QueueFile)>
	//   15   31:invokevirtual   #53  <Method int RandomAccessFile.read()>
	//   16   34:istore_1        
			position = QueueFile.access$100(QueueFile.this, position + 1);
	//   17   35:aload_0         
	//   18   36:aload_0         
	//   19   37:getfield        #16  <Field QueueFile this$0>
	//   20   40:aload_0         
	//   21   41:getfield        #28  <Field int position>
	//   22   44:iconst_1        
	//   23   45:iadd            
	//   24   46:invokestatic    #27  <Method int QueueFile.access$100(QueueFile, int)>
	//   25   49:putfield        #28  <Field int position>
			remaining = remaining - 1;
	//   26   52:aload_0         
	//   27   53:aload_0         
	//   28   54:getfield        #33  <Field int remaining>
	//   29   57:iconst_1        
	//   30   58:isub            
	//   31   59:putfield        #33  <Field int remaining>
			return i;
	//   32   62:iload_1         
	//   33   63:ireturn         
		}
	}

	public int read(byte abyte0[], int i, int j)
		throws IOException
	{
		QueueFile.access$200(((Object) (abyte0)), "buffer");
	//    0    0:aload_1         
	//    1    1:ldc1            #57  <String "buffer">
	//    2    3:invokestatic    #61  <Method Object QueueFile.access$200(Object, String)>
	//    3    6:pop             
		if((i | j) < 0 || j > abyte0.length - i)
	//*   4    7:iload_2         
	//*   5    8:iload_3         
	//*   6    9:ior             
	//*   7   10:iflt            21
	//*   8   13:iload_3         
	//*   9   14:aload_1         
	//*  10   15:arraylength     
	//*  11   16:iload_2         
	//*  12   17:isub            
	//*  13   18:icmple          29
			throw new ArrayIndexOutOfBoundsException();
	//   14   21:new             #63  <Class ArrayIndexOutOfBoundsException>
	//   15   24:dup             
	//   16   25:invokespecial   #64  <Method void ArrayIndexOutOfBoundsException()>
	//   17   28:athrow          
		if(remaining > 0)
	//*  18   29:aload_0         
	//*  19   30:getfield        #33  <Field int remaining>
	//*  20   33:ifle            100
		{
			int k = j;
	//   21   36:iload_3         
	//   22   37:istore          4
			if(j > remaining)
	//*  23   39:iload_3         
	//*  24   40:aload_0         
	//*  25   41:getfield        #33  <Field int remaining>
	//*  26   44:icmple          53
				k = remaining;
	//   27   47:aload_0         
	//   28   48:getfield        #33  <Field int remaining>
	//   29   51:istore          4
			QueueFile.access$300(QueueFile.this, position, abyte0, i, k);
	//   30   53:aload_0         
	//   31   54:getfield        #16  <Field QueueFile this$0>
	//   32   57:aload_0         
	//   33   58:getfield        #28  <Field int position>
	//   34   61:aload_1         
	//   35   62:iload_2         
	//   36   63:iload           4
	//   37   65:invokestatic    #68  <Method void QueueFile.access$300(QueueFile, int, byte[], int, int)>
			position = QueueFile.access$100(QueueFile.this, position + k);
	//   38   68:aload_0         
	//   39   69:aload_0         
	//   40   70:getfield        #16  <Field QueueFile this$0>
	//   41   73:aload_0         
	//   42   74:getfield        #28  <Field int position>
	//   43   77:iload           4
	//   44   79:iadd            
	//   45   80:invokestatic    #27  <Method int QueueFile.access$100(QueueFile, int)>
	//   46   83:putfield        #28  <Field int position>
			remaining = remaining - k;
	//   47   86:aload_0         
	//   48   87:aload_0         
	//   49   88:getfield        #33  <Field int remaining>
	//   50   91:iload           4
	//   51   93:isub            
	//   52   94:putfield        #33  <Field int remaining>
			return k;
	//   53   97:iload           4
	//   54   99:ireturn         
		} else
		{
			return -1;
	//   55  100:iconst_m1       
	//   56  101:ireturn         
		}
	}

	private int position;
	private int remaining;
	final QueueFile this$0;

	private QueueFile$ElementInputStream(QueueFile.Element element)
	{
		this$0 = QueueFile.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field QueueFile this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void InputStream()>
		position = QueueFile.access$100(QueueFile.this, element.position + 4);
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:aload_2         
	//    8   12:getfield        #23  <Field int QueueFile$Element.position>
	//    9   15:iconst_4        
	//   10   16:iadd            
	//   11   17:invokestatic    #27  <Method int QueueFile.access$100(QueueFile, int)>
	//   12   20:putfield        #28  <Field int position>
		remaining = element.length;
	//   13   23:aload_0         
	//   14   24:aload_2         
	//   15   25:getfield        #31  <Field int QueueFile$Element.length>
	//   16   28:putfield        #33  <Field int remaining>
	//   17   31:return          
	}

	QueueFile$ElementInputStream(QueueFile.Element element, QueueFile._cls1 _pcls1)
	{
		this(element);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #37  <Method void QueueFile$ElementInputStream(QueueFile, QueueFile$Element)>
	//    4    6:return          
	}
}
