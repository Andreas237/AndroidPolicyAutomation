// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.util;

import com.google.android.gms.common.internal.Preconditions;
import java.io.*;
import java.nio.channels.FileChannel;

// Referenced classes of package com.google.android.gms.common.util:
//			IOUtils, zzb

private static final class IOUtils$zzb
{

	public final byte[] zzdd()
		throws IOException
	{
		FileInputStream fileinputstream = new FileInputStream(file);
	//    0    0:new             #34  <Class FileInputStream>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #24  <Field File file>
	//    4    8:invokespecial   #35  <Method void FileInputStream(File)>
	//    5   11:astore_2        
		byte abyte0[] = IOUtils.zzb(((java.io.InputStream) (fileinputstream)), fileinputstream.getChannel().size());
	//    6   12:aload_2         
	//    7   13:aload_2         
	//    8   14:invokevirtual   #39  <Method FileChannel FileInputStream.getChannel()>
	//    9   17:invokevirtual   #45  <Method long FileChannel.size()>
	//   10   20:invokestatic    #48  <Method byte[] IOUtils.zzb(java.io.InputStream, long)>
	//   11   23:astore_1        
		IOUtils.closeQuietly(((java.io.Closeable) (fileinputstream)));
	//   12   24:aload_2         
	//   13   25:invokestatic    #52  <Method void IOUtils.closeQuietly(java.io.Closeable)>
		return abyte0;
	//   14   28:aload_1         
	//   15   29:areturn         
		Exception exception;
		exception;
	//   16   30:astore_1        
		break MISSING_BLOCK_LABEL_37;
	//   17   31:goto            37
		exception;
	//   18   34:astore_1        
		fileinputstream = null;
	//   19   35:aconst_null     
	//   20   36:astore_2        
		IOUtils.closeQuietly(((java.io.Closeable) (fileinputstream)));
	//   21   37:aload_2         
	//   22   38:invokestatic    #52  <Method void IOUtils.closeQuietly(java.io.Closeable)>
		throw exception;
	//   23   41:aload_1         
	//   24   42:athrow          
	}

	private final File file;

	private IOUtils$zzb(File file1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
		file = (File)Preconditions.checkNotNull(((Object) (file1)));
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokestatic    #20  <Method Object Preconditions.checkNotNull(Object)>
	//    5    9:checkcast       #22  <Class File>
	//    6   12:putfield        #24  <Field File file>
	//    7   15:return          
	}

	IOUtils$zzb(File file1, zzb zzb1)
	{
		this(file1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #28  <Method void IOUtils$zzb(File)>
	//    3    5:return          
	}
}
