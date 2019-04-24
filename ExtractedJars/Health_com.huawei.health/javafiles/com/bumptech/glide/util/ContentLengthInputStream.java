// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.util;

import android.text.TextUtils;
import android.util.Log;
import java.io.*;

public final class ContentLengthInputStream extends FilterInputStream
{

	ContentLengthInputStream(InputStream inputstream, long l)
	{
		super(inputstream);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #19  <Method void FilterInputStream(InputStream)>
		contentLength = l;
	//    3    5:aload_0         
	//    4    6:lload_2         
	//    5    7:putfield        #21  <Field long contentLength>
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
	//    4    6:getfield        #28  <Field int readSoFar>
	//    5    9:iload_1         
	//    6   10:iadd            
	//    7   11:putfield        #28  <Field int readSoFar>
			return i;
	//    8   14:iload_1         
	//    9   15:ireturn         
		}
		if(contentLength - (long)readSoFar > 0L)
	//*  10   16:aload_0         
	//*  11   17:getfield        #21  <Field long contentLength>
	//*  12   20:aload_0         
	//*  13   21:getfield        #28  <Field int readSoFar>
	//*  14   24:i2l             
	//*  15   25:lsub            
	//*  16   26:lconst_0        
	//*  17   27:lcmp            
	//*  18   28:ifle            73
			throw new IOException((new StringBuilder()).append("Failed to read all expected data, expected: ").append(contentLength).append(", but read: ").append(readSoFar).toString());
	//   19   31:new             #26  <Class IOException>
	//   20   34:dup             
	//   21   35:new             #30  <Class StringBuilder>
	//   22   38:dup             
	//   23   39:invokespecial   #33  <Method void StringBuilder()>
	//   24   42:ldc1            #35  <String "Failed to read all expected data, expected: ">
	//   25   44:invokevirtual   #39  <Method StringBuilder StringBuilder.append(String)>
	//   26   47:aload_0         
	//   27   48:getfield        #21  <Field long contentLength>
	//   28   51:invokevirtual   #42  <Method StringBuilder StringBuilder.append(long)>
	//   29   54:ldc1            #44  <String ", but read: ">
	//   30   56:invokevirtual   #39  <Method StringBuilder StringBuilder.append(String)>
	//   31   59:aload_0         
	//   32   60:getfield        #28  <Field int readSoFar>
	//   33   63:invokevirtual   #47  <Method StringBuilder StringBuilder.append(int)>
	//   34   66:invokevirtual   #51  <Method String StringBuilder.toString()>
	//   35   69:invokespecial   #54  <Method void IOException(String)>
	//   36   72:athrow          
		else
			return i;
	//   37   73:iload_1         
	//   38   74:ireturn         
	}

	public static InputStream obtain(InputStream inputstream, long l)
	{
		return ((InputStream) (new ContentLengthInputStream(inputstream, l)));
	//    0    0:new             #2   <Class ContentLengthInputStream>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:lload_1         
	//    4    6:invokespecial   #59  <Method void ContentLengthInputStream(InputStream, long)>
	//    5    9:areturn         
	}

	public static InputStream obtain(InputStream inputstream, String s)
	{
		return obtain(inputstream, parseContentLength(s));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #64  <Method int parseContentLength(String)>
	//    3    5:i2l             
	//    4    6:invokestatic    #66  <Method InputStream obtain(InputStream, long)>
	//    5    9:areturn         
	}

	private static int parseContentLength(String s)
	{
		if(TextUtils.isEmpty(((CharSequence) (s))))
			break MISSING_BLOCK_LABEL_50;
	//    0    0:aload_0         
	//    1    1:invokestatic    #74  <Method boolean TextUtils.isEmpty(CharSequence)>
	//    2    4:ifne            50
		int i = Integer.parseInt(s);
	//    3    7:aload_0         
	//    4    8:invokestatic    #79  <Method int Integer.parseInt(String)>
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
	//*  11   18:invokestatic    #85  <Method boolean Log.isLoggable(String, int)>
	//*  12   21:ifeq            50
			Log.d("ContentLengthStream", (new StringBuilder()).append("failed to parse content length header: ").append(s).toString(), ((Throwable) (numberformatexception)));
	//   13   24:ldc1            #8   <String "ContentLengthStream">
	//   14   26:new             #30  <Class StringBuilder>
	//   15   29:dup             
	//   16   30:invokespecial   #33  <Method void StringBuilder()>
	//   17   33:ldc1            #87  <String "failed to parse content length header: ">
	//   18   35:invokevirtual   #39  <Method StringBuilder StringBuilder.append(String)>
	//   19   38:aload_0         
	//   20   39:invokevirtual   #39  <Method StringBuilder StringBuilder.append(String)>
	//   21   42:invokevirtual   #51  <Method String StringBuilder.toString()>
	//   22   45:aload_2         
	//   23   46:invokestatic    #91  <Method int Log.d(String, String, Throwable)>
	//   24   49:pop             
		return -1;
	//   25   50:iconst_m1       
	//   26   51:ireturn         
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
	//    3    3:getfield        #21  <Field long contentLength>
	//    4    6:aload_0         
	//    5    7:getfield        #28  <Field int readSoFar>
	//    6   10:i2l             
	//    7   11:lsub            
	//    8   12:aload_0         
	//    9   13:getfield        #97  <Field InputStream in>
	//   10   16:invokevirtual   #101 <Method int InputStream.available()>
	//   11   19:i2l             
	//   12   20:invokestatic    #107 <Method long Math.max(long, long)>
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
	//    3    3:invokespecial   #110 <Method int FilterInputStream.read()>
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
	//*  12   18:invokespecial   #112 <Method int checkReadSoFarOrThrow(int)>
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
	//    5    5:invokevirtual   #116 <Method int read(byte[], int, int)>
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
	//    7    7:invokespecial   #117 <Method int FilterInputStream.read(byte[], int, int)>
	//    8   10:invokespecial   #112 <Method int checkReadSoFarOrThrow(int)>
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
