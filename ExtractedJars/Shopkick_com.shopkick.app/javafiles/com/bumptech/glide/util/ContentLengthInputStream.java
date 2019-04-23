// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.util;

import android.text.TextUtils;
import android.util.Log;
import java.io.*;

public final class ContentLengthInputStream extends FilterInputStream
{

	private ContentLengthInputStream(InputStream inputstream, long l)
	{
		super(inputstream);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #20  <Method void FilterInputStream(InputStream)>
		contentLength = l;
	//    3    5:aload_0         
	//    4    6:lload_2         
	//    5    7:putfield        #22  <Field long contentLength>
	//    6   10:return          
	}

	private int checkReadSoFarOrThrow(int i)
		throws IOException
	{
		if(i >= 0)
	//*   0    0:iload_1         
	//*   1    1:iflt            16
		{
			readSoFar = readSoFar + i;
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:getfield        #30  <Field int readSoFar>
	//    5    9:iload_1         
	//    6   10:iadd            
	//    7   11:putfield        #30  <Field int readSoFar>
			return i;
	//    8   14:iload_1         
	//    9   15:ireturn         
		}
		if(contentLength - (long)readSoFar <= 0L)
	//*  10   16:aload_0         
	//*  11   17:getfield        #22  <Field long contentLength>
	//*  12   20:aload_0         
	//*  13   21:getfield        #30  <Field int readSoFar>
	//*  14   24:i2l             
	//*  15   25:lsub            
	//*  16   26:lconst_0        
	//*  17   27:lcmp            
	//*  18   28:ifgt            33
		{
			return i;
	//   19   31:iload_1         
	//   20   32:ireturn         
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   21   33:new             #32  <Class StringBuilder>
	//   22   36:dup             
	//   23   37:invokespecial   #35  <Method void StringBuilder()>
	//   24   40:astore_2        
			stringbuilder.append("Failed to read all expected data, expected: ");
	//   25   41:aload_2         
	//   26   42:ldc1            #37  <String "Failed to read all expected data, expected: ">
	//   27   44:invokevirtual   #41  <Method StringBuilder StringBuilder.append(String)>
	//   28   47:pop             
			stringbuilder.append(contentLength);
	//   29   48:aload_2         
	//   30   49:aload_0         
	//   31   50:getfield        #22  <Field long contentLength>
	//   32   53:invokevirtual   #44  <Method StringBuilder StringBuilder.append(long)>
	//   33   56:pop             
			stringbuilder.append(", but read: ");
	//   34   57:aload_2         
	//   35   58:ldc1            #46  <String ", but read: ">
	//   36   60:invokevirtual   #41  <Method StringBuilder StringBuilder.append(String)>
	//   37   63:pop             
			stringbuilder.append(readSoFar);
	//   38   64:aload_2         
	//   39   65:aload_0         
	//   40   66:getfield        #30  <Field int readSoFar>
	//   41   69:invokevirtual   #49  <Method StringBuilder StringBuilder.append(int)>
	//   42   72:pop             
			throw new IOException(stringbuilder.toString());
	//   43   73:new             #28  <Class IOException>
	//   44   76:dup             
	//   45   77:aload_2         
	//   46   78:invokevirtual   #53  <Method String StringBuilder.toString()>
	//   47   81:invokespecial   #56  <Method void IOException(String)>
	//   48   84:athrow          
		}
	}

	public static InputStream obtain(InputStream inputstream, long l)
	{
		return ((InputStream) (new ContentLengthInputStream(inputstream, l)));
	//    0    0:new             #2   <Class ContentLengthInputStream>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:lload_1         
	//    4    6:invokespecial   #61  <Method void ContentLengthInputStream(InputStream, long)>
	//    5    9:areturn         
	}

	public static InputStream obtain(InputStream inputstream, String s)
	{
		return obtain(inputstream, parseContentLength(s));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #68  <Method int parseContentLength(String)>
	//    3    5:i2l             
	//    4    6:invokestatic    #70  <Method InputStream obtain(InputStream, long)>
	//    5    9:areturn         
	}

	private static int parseContentLength(String s)
	{
		if(TextUtils.isEmpty(((CharSequence) (s))))
			break MISSING_BLOCK_LABEL_56;
	//    0    0:aload_0         
	//    1    1:invokestatic    #78  <Method boolean TextUtils.isEmpty(CharSequence)>
	//    2    4:ifne            56
		int i = Integer.parseInt(s);
	//    3    7:aload_0         
	//    4    8:invokestatic    #83  <Method int Integer.parseInt(String)>
	//    5   11:istore_1        
		return i;
	//    6   12:iload_1         
	//    7   13:ireturn         
		NumberFormatException numberformatexception;
		numberformatexception;
	//    8   14:astore_2        
		if(Log.isLoggable("ContentLengthStream", 3))
	//*   9   15:ldc1            #8   <String "ContentLengthStream">
	//*  10   17:iconst_3        
	//*  11   18:invokestatic    #89  <Method boolean Log.isLoggable(String, int)>
	//*  12   21:ifeq            56
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   13   24:new             #32  <Class StringBuilder>
	//   14   27:dup             
	//   15   28:invokespecial   #35  <Method void StringBuilder()>
	//   16   31:astore_3        
			stringbuilder.append("failed to parse content length header: ");
	//   17   32:aload_3         
	//   18   33:ldc1            #91  <String "failed to parse content length header: ">
	//   19   35:invokevirtual   #41  <Method StringBuilder StringBuilder.append(String)>
	//   20   38:pop             
			stringbuilder.append(s);
	//   21   39:aload_3         
	//   22   40:aload_0         
	//   23   41:invokevirtual   #41  <Method StringBuilder StringBuilder.append(String)>
	//   24   44:pop             
			Log.d("ContentLengthStream", stringbuilder.toString(), ((Throwable) (numberformatexception)));
	//   25   45:ldc1            #8   <String "ContentLengthStream">
	//   26   47:aload_3         
	//   27   48:invokevirtual   #53  <Method String StringBuilder.toString()>
	//   28   51:aload_2         
	//   29   52:invokestatic    #95  <Method int Log.d(String, String, Throwable)>
	//   30   55:pop             
		}
		return -1;
	//   31   56:iconst_m1       
	//   32   57:ireturn         
	}

	public int available()
		throws IOException
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		long l = Math.max(contentLength - (long)readSoFar, in.available());
	//    2    2:aload_0         
	//    3    3:getfield        #22  <Field long contentLength>
	//    4    6:aload_0         
	//    5    7:getfield        #30  <Field int readSoFar>
	//    6   10:i2l             
	//    7   11:lsub            
	//    8   12:aload_0         
	//    9   13:getfield        #101 <Field InputStream in>
	//   10   16:invokevirtual   #105 <Method int InputStream.available()>
	//   11   19:i2l             
	//   12   20:invokestatic    #111 <Method long Math.max(long, long)>
	//   13   23:lstore_2        
		int i = (int)l;
	//   14   24:lload_2         
	//   15   25:l2i             
	//   16   26:istore_1        
		this;
	//   17   27:aload_0         
		JVM INSTR monitorexit ;
	//   18   28:monitorexit     
		return i;
	//   19   29:iload_1         
	//   20   30:ireturn         
		Exception exception;
		exception;
	//   21   31:astore          4
	//*  22   33:aload_0         
		throw exception;
	//   23   34:monitorexit     
	//   24   35:aload           4
	//   25   37:athrow          
	}

	public int read()
		throws IOException
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		int j = super.read();
	//    2    2:aload_0         
	//    3    3:invokespecial   #114 <Method int FilterInputStream.read()>
	//    4    6:istore_2        
		int i;
		Exception exception;
		if(j >= 0)
	//*   5    7:iload_2         
	//*   6    8:iflt            31
			i = 1;
	//    7   11:iconst_1        
	//    8   12:istore_1        
		else
	//*   9   13:goto            16
	//*  10   16:aload_0         
	//*  11   17:iload_1         
	//*  12   18:invokespecial   #116 <Method int checkReadSoFarOrThrow(int)>
	//*  13   21:pop             
	//*  14   22:aload_0         
	//*  15   23:monitorexit     
	//*  16   24:iload_2         
	//*  17   25:ireturn         
	//*  18   26:astore_3        
	//*  19   27:aload_0         
	//*  20   28:monitorexit     
	//*  21   29:aload_3         
	//*  22   30:athrow          
			i = -1;
	//   23   31:iconst_m1       
	//   24   32:istore_1        
		checkReadSoFarOrThrow(i);
		this;
		JVM INSTR monitorexit ;
		return j;
		exception;
		throw exception;
	//*  25   33:goto            16
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
	//    5    5:invokevirtual   #120 <Method int read(byte[], int, int)>
	//    6    8:ireturn         
	}

	public int read(byte abyte0[], int i, int j)
		throws IOException
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		i = checkReadSoFarOrThrow(super.read(abyte0, i, j));
	//    2    2:aload_0         
	//    3    3:aload_0         
	//    4    4:aload_1         
	//    5    5:iload_2         
	//    6    6:iload_3         
	//    7    7:invokespecial   #121 <Method int FilterInputStream.read(byte[], int, int)>
	//    8   10:invokespecial   #116 <Method int checkReadSoFarOrThrow(int)>
	//    9   13:istore_2        
		this;
	//   10   14:aload_0         
		JVM INSTR monitorexit ;
	//   11   15:monitorexit     
		return i;
	//   12   16:iload_2         
	//   13   17:ireturn         
		abyte0;
	//   14   18:astore_1        
	//*  15   19:aload_0         
		throw abyte0;
	//   16   20:monitorexit     
	//   17   21:aload_1         
	//   18   22:athrow          
	}

	private static final String TAG = "ContentLengthStream";
	private static final int UNKNOWN = -1;
	private final long contentLength;
	private int readSoFar;
}
