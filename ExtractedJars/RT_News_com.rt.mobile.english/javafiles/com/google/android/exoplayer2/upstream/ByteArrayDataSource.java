// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import com.google.android.exoplayer2.util.Assertions;
import java.io.IOException;

// Referenced classes of package com.google.android.exoplayer2.upstream:
//			DataSource, DataSpec

public final class ByteArrayDataSource
	implements DataSource
{

	public ByteArrayDataSource(byte abyte0[])
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		Assertions.checkNotNull(((Object) (abyte0)));
	//    2    4:aload_1         
	//    3    5:invokestatic    #24  <Method Object Assertions.checkNotNull(Object)>
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
	//   14   22:invokestatic    #28  <Method void Assertions.checkArgument(boolean)>
		data = abyte0;
	//   15   25:aload_0         
	//   16   26:aload_1         
	//   17   27:putfield        #30  <Field byte[] data>
	//   18   30:return          
	}

	public void close()
		throws IOException
	{
		uri = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #36  <Field Uri uri>
	//    3    5:return          
	}

	public Uri getUri()
	{
		return uri;
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field Uri uri>
	//    2    4:areturn         
	}

	public long open(DataSpec dataspec)
		throws IOException
	{
		uri = dataspec.uri;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getfield        #44  <Field Uri DataSpec.uri>
	//    3    5:putfield        #36  <Field Uri uri>
		readPosition = (int)dataspec.position;
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:getfield        #48  <Field long DataSpec.position>
	//    7   13:l2i             
	//    8   14:putfield        #50  <Field int readPosition>
		long l;
		if(dataspec.length == -1L)
	//*   9   17:aload_1         
	//*  10   18:getfield        #53  <Field long DataSpec.length>
	//*  11   21:ldc2w           #54  <Long -1L>
	//*  12   24:lcmp            
	//*  13   25:ifne            43
			l = (long)data.length - dataspec.position;
	//   14   28:aload_0         
	//   15   29:getfield        #30  <Field byte[] data>
	//   16   32:arraylength     
	//   17   33:i2l             
	//   18   34:aload_1         
	//   19   35:getfield        #48  <Field long DataSpec.position>
	//   20   38:lsub            
	//   21   39:lstore_2        
		else
	//*  22   40:goto            48
			l = dataspec.length;
	//   23   43:aload_1         
	//   24   44:getfield        #53  <Field long DataSpec.length>
	//   25   47:lstore_2        
		bytesRemaining = (int)l;
	//   26   48:aload_0         
	//   27   49:lload_2         
	//   28   50:l2i             
	//   29   51:putfield        #57  <Field int bytesRemaining>
		if(bytesRemaining > 0 && readPosition + bytesRemaining <= data.length)
	//*  30   54:aload_0         
	//*  31   55:getfield        #57  <Field int bytesRemaining>
	//*  32   58:ifle            87
	//*  33   61:aload_0         
	//*  34   62:getfield        #50  <Field int readPosition>
	//*  35   65:aload_0         
	//*  36   66:getfield        #57  <Field int bytesRemaining>
	//*  37   69:iadd            
	//*  38   70:aload_0         
	//*  39   71:getfield        #30  <Field byte[] data>
	//*  40   74:arraylength     
	//*  41   75:icmple          81
	//*  42   78:goto            87
		{
			return (long)bytesRemaining;
	//   43   81:aload_0         
	//   44   82:getfield        #57  <Field int bytesRemaining>
	//   45   85:i2l             
	//   46   86:lreturn         
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   47   87:new             #59  <Class StringBuilder>
	//   48   90:dup             
	//   49   91:invokespecial   #60  <Method void StringBuilder()>
	//   50   94:astore          4
			stringbuilder.append("Unsatisfiable range: [");
	//   51   96:aload           4
	//   52   98:ldc1            #62  <String "Unsatisfiable range: [">
	//   53  100:invokevirtual   #66  <Method StringBuilder StringBuilder.append(String)>
	//   54  103:pop             
			stringbuilder.append(readPosition);
	//   55  104:aload           4
	//   56  106:aload_0         
	//   57  107:getfield        #50  <Field int readPosition>
	//   58  110:invokevirtual   #69  <Method StringBuilder StringBuilder.append(int)>
	//   59  113:pop             
			stringbuilder.append(", ");
	//   60  114:aload           4
	//   61  116:ldc1            #71  <String ", ">
	//   62  118:invokevirtual   #66  <Method StringBuilder StringBuilder.append(String)>
	//   63  121:pop             
			stringbuilder.append(dataspec.length);
	//   64  122:aload           4
	//   65  124:aload_1         
	//   66  125:getfield        #53  <Field long DataSpec.length>
	//   67  128:invokevirtual   #74  <Method StringBuilder StringBuilder.append(long)>
	//   68  131:pop             
			stringbuilder.append("], length: ");
	//   69  132:aload           4
	//   70  134:ldc1            #76  <String "], length: ">
	//   71  136:invokevirtual   #66  <Method StringBuilder StringBuilder.append(String)>
	//   72  139:pop             
			stringbuilder.append(data.length);
	//   73  140:aload           4
	//   74  142:aload_0         
	//   75  143:getfield        #30  <Field byte[] data>
	//   76  146:arraylength     
	//   77  147:invokevirtual   #69  <Method StringBuilder StringBuilder.append(int)>
	//   78  150:pop             
			throw new IOException(stringbuilder.toString());
	//   79  151:new             #34  <Class IOException>
	//   80  154:dup             
	//   81  155:aload           4
	//   82  157:invokevirtual   #80  <Method String StringBuilder.toString()>
	//   83  160:invokespecial   #83  <Method void IOException(String)>
	//   84  163:athrow          
		}
	}

	public int read(byte abyte0[], int i, int j)
		throws IOException
	{
		if(j == 0)
	//*   0    0:iload_3         
	//*   1    1:ifne            6
			return 0;
	//    2    4:iconst_0        
	//    3    5:ireturn         
		if(bytesRemaining == 0)
	//*   4    6:aload_0         
	//*   5    7:getfield        #57  <Field int bytesRemaining>
	//*   6   10:ifne            15
		{
			return -1;
	//    7   13:iconst_m1       
	//    8   14:ireturn         
		} else
		{
			j = Math.min(j, bytesRemaining);
	//    9   15:iload_3         
	//   10   16:aload_0         
	//   11   17:getfield        #57  <Field int bytesRemaining>
	//   12   20:invokestatic    #91  <Method int Math.min(int, int)>
	//   13   23:istore_3        
			System.arraycopy(((Object) (data)), readPosition, ((Object) (abyte0)), i, j);
	//   14   24:aload_0         
	//   15   25:getfield        #30  <Field byte[] data>
	//   16   28:aload_0         
	//   17   29:getfield        #50  <Field int readPosition>
	//   18   32:aload_1         
	//   19   33:iload_2         
	//   20   34:iload_3         
	//   21   35:invokestatic    #97  <Method void System.arraycopy(Object, int, Object, int, int)>
			readPosition = readPosition + j;
	//   22   38:aload_0         
	//   23   39:aload_0         
	//   24   40:getfield        #50  <Field int readPosition>
	//   25   43:iload_3         
	//   26   44:iadd            
	//   27   45:putfield        #50  <Field int readPosition>
			bytesRemaining = bytesRemaining - j;
	//   28   48:aload_0         
	//   29   49:aload_0         
	//   30   50:getfield        #57  <Field int bytesRemaining>
	//   31   53:iload_3         
	//   32   54:isub            
	//   33   55:putfield        #57  <Field int bytesRemaining>
			return j;
	//   34   58:iload_3         
	//   35   59:ireturn         
		}
	}

	private int bytesRemaining;
	private final byte data[];
	private int readPosition;
	private Uri uri;
}
