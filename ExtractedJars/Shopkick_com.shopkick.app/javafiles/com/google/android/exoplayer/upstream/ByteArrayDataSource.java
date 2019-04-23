// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.upstream;

import com.google.android.exoplayer.util.Assertions;
import java.io.IOException;

// Referenced classes of package com.google.android.exoplayer.upstream:
//			DataSource, DataSpec

public final class ByteArrayDataSource
	implements DataSource
{

	public ByteArrayDataSource(byte abyte0[])
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		Assertions.checkNotNull(((Object) (abyte0)));
	//    2    4:aload_1         
	//    3    5:invokestatic    #22  <Method Object Assertions.checkNotNull(Object)>
	//    4    8:pop             
		boolean flag;
		if(abyte0.length > 0)
	//*   5    9:aload_1         
	//*   6   10:arraylength     
	//*   7   11:ifle            19
			flag = true;
	//    8   14:iconst_1        
	//    9   15:istore_2        
		else
	//*  10   16:goto            21
			flag = false;
	//   11   19:iconst_0        
	//   12   20:istore_2        
		Assertions.checkArgument(flag);
	//   13   21:iload_2         
	//   14   22:invokestatic    #26  <Method void Assertions.checkArgument(boolean)>
		data = abyte0;
	//   15   25:aload_0         
	//   16   26:aload_1         
	//   17   27:putfield        #28  <Field byte[] data>
	//   18   30:return          
	}

	public void close()
		throws IOException
	{
	//    0    0:return          
	}

	public long open(DataSpec dataspec)
		throws IOException
	{
		readPosition = (int)dataspec.position;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getfield        #41  <Field long DataSpec.position>
	//    3    5:l2i             
	//    4    6:putfield        #43  <Field int readPosition>
		long l;
		if(dataspec.length == -1L)
	//*   5    9:aload_1         
	//*   6   10:getfield        #46  <Field long DataSpec.length>
	//*   7   13:ldc2w           #47  <Long -1L>
	//*   8   16:lcmp            
	//*   9   17:ifne            35
			l = (long)data.length - dataspec.position;
	//   10   20:aload_0         
	//   11   21:getfield        #28  <Field byte[] data>
	//   12   24:arraylength     
	//   13   25:i2l             
	//   14   26:aload_1         
	//   15   27:getfield        #41  <Field long DataSpec.position>
	//   16   30:lsub            
	//   17   31:lstore_3        
		else
	//*  18   32:goto            40
			l = dataspec.length;
	//   19   35:aload_1         
	//   20   36:getfield        #46  <Field long DataSpec.length>
	//   21   39:lstore_3        
		remainingBytes = (int)l;
	//   22   40:aload_0         
	//   23   41:lload_3         
	//   24   42:l2i             
	//   25   43:putfield        #50  <Field int remainingBytes>
		int i = remainingBytes;
	//   26   46:aload_0         
	//   27   47:getfield        #50  <Field int remainingBytes>
	//   28   50:istore_2        
		if(i > 0 && readPosition + i <= data.length)
	//*  29   51:iload_2         
	//*  30   52:ifle            72
	//*  31   55:aload_0         
	//*  32   56:getfield        #43  <Field int readPosition>
	//*  33   59:iload_2         
	//*  34   60:iadd            
	//*  35   61:aload_0         
	//*  36   62:getfield        #28  <Field byte[] data>
	//*  37   65:arraylength     
	//*  38   66:icmpgt          72
		{
			return (long)i;
	//   39   69:iload_2         
	//   40   70:i2l             
	//   41   71:lreturn         
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   42   72:new             #52  <Class StringBuilder>
	//   43   75:dup             
	//   44   76:invokespecial   #53  <Method void StringBuilder()>
	//   45   79:astore          5
			stringbuilder.append("Unsatisfiable range: [");
	//   46   81:aload           5
	//   47   83:ldc1            #55  <String "Unsatisfiable range: [">
	//   48   85:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//   49   88:pop             
			stringbuilder.append(readPosition);
	//   50   89:aload           5
	//   51   91:aload_0         
	//   52   92:getfield        #43  <Field int readPosition>
	//   53   95:invokevirtual   #62  <Method StringBuilder StringBuilder.append(int)>
	//   54   98:pop             
			stringbuilder.append(", ");
	//   55   99:aload           5
	//   56  101:ldc1            #64  <String ", ">
	//   57  103:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//   58  106:pop             
			stringbuilder.append(dataspec.length);
	//   59  107:aload           5
	//   60  109:aload_1         
	//   61  110:getfield        #46  <Field long DataSpec.length>
	//   62  113:invokevirtual   #67  <Method StringBuilder StringBuilder.append(long)>
	//   63  116:pop             
			stringbuilder.append("], length: ");
	//   64  117:aload           5
	//   65  119:ldc1            #69  <String "], length: ">
	//   66  121:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//   67  124:pop             
			stringbuilder.append(data.length);
	//   68  125:aload           5
	//   69  127:aload_0         
	//   70  128:getfield        #28  <Field byte[] data>
	//   71  131:arraylength     
	//   72  132:invokevirtual   #62  <Method StringBuilder StringBuilder.append(int)>
	//   73  135:pop             
			throw new IOException(stringbuilder.toString());
	//   74  136:new             #32  <Class IOException>
	//   75  139:dup             
	//   76  140:aload           5
	//   77  142:invokevirtual   #73  <Method String StringBuilder.toString()>
	//   78  145:invokespecial   #76  <Method void IOException(String)>
	//   79  148:athrow          
		}
	}

	public int read(byte abyte0[], int i, int j)
		throws IOException
	{
		int k = remainingBytes;
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field int remainingBytes>
	//    2    4:istore          4
		if(k == 0)
	//*   3    6:iload           4
	//*   4    8:ifne            13
		{
			return -1;
	//    5   11:iconst_m1       
	//    6   12:ireturn         
		} else
		{
			j = Math.min(j, k);
	//    7   13:iload_3         
	//    8   14:iload           4
	//    9   16:invokestatic    #84  <Method int Math.min(int, int)>
	//   10   19:istore_3        
			System.arraycopy(((Object) (data)), readPosition, ((Object) (abyte0)), i, j);
	//   11   20:aload_0         
	//   12   21:getfield        #28  <Field byte[] data>
	//   13   24:aload_0         
	//   14   25:getfield        #43  <Field int readPosition>
	//   15   28:aload_1         
	//   16   29:iload_2         
	//   17   30:iload_3         
	//   18   31:invokestatic    #90  <Method void System.arraycopy(Object, int, Object, int, int)>
			readPosition = readPosition + j;
	//   19   34:aload_0         
	//   20   35:aload_0         
	//   21   36:getfield        #43  <Field int readPosition>
	//   22   39:iload_3         
	//   23   40:iadd            
	//   24   41:putfield        #43  <Field int readPosition>
			remainingBytes = remainingBytes - j;
	//   25   44:aload_0         
	//   26   45:aload_0         
	//   27   46:getfield        #50  <Field int remainingBytes>
	//   28   49:iload_3         
	//   29   50:isub            
	//   30   51:putfield        #50  <Field int remainingBytes>
			return j;
	//   31   54:iload_3         
	//   32   55:ireturn         
		}
	}

	private final byte data[];
	private int readPosition;
	private int remainingBytes;
}
