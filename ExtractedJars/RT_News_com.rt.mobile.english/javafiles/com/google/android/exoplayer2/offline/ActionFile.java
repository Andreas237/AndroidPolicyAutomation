// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.offline;

import com.google.android.exoplayer2.util.AtomicFile;
import com.google.android.exoplayer2.util.Util;
import java.io.*;

// Referenced classes of package com.google.android.exoplayer2.offline:
//			DownloadAction

public final class ActionFile
{

	public ActionFile(File file)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		actionFile = file;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #18  <Field File actionFile>
		atomicFile = new AtomicFile(file);
	//    5    9:aload_0         
	//    6   10:new             #20  <Class AtomicFile>
	//    7   13:dup             
	//    8   14:aload_1         
	//    9   15:invokespecial   #22  <Method void AtomicFile(File)>
	//   10   18:putfield        #24  <Field AtomicFile atomicFile>
	//   11   21:return          
	}

	public transient DownloadAction[] load(DownloadAction.Deserializer adeserializer[])
		throws IOException
	{
		int i;
		boolean flag = actionFile.exists();
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field File actionFile>
	//    2    4:invokevirtual   #35  <Method boolean File.exists()>
	//    3    7:istore          4
		i = 0;
	//    4    9:iconst_0        
	//    5   10:istore_2        
		if(!flag)
	//*   6   11:iload           4
	//*   7   13:ifne            21
			return new DownloadAction[0];
	//    8   16:iconst_0        
	//    9   17:anewarray       DownloadAction[]
	//   10   20:areturn         
		java.io.InputStream inputstream = atomicFile.openRead();
	//   11   21:aload_0         
	//   12   22:getfield        #24  <Field AtomicFile atomicFile>
	//   13   25:invokevirtual   #41  <Method java.io.InputStream AtomicFile.openRead()>
	//   14   28:astore          5
		int j;
		DataInputStream datainputstream;
		datainputstream = new DataInputStream(inputstream);
	//   15   30:new             #43  <Class DataInputStream>
	//   16   33:dup             
	//   17   34:aload           5
	//   18   36:invokespecial   #46  <Method void DataInputStream(java.io.InputStream)>
	//   19   39:astore          6
		j = datainputstream.readInt();
	//   20   41:aload           6
	//   21   43:invokevirtual   #50  <Method int DataInputStream.readInt()>
	//   22   46:istore_3        
		if(j <= 0)
			break MISSING_BLOCK_LABEL_84;
	//   23   47:iload_3         
	//   24   48:ifle            84
		adeserializer = ((DownloadAction.Deserializer []) (new StringBuilder()));
	//   25   51:new             #52  <Class StringBuilder>
	//   26   54:dup             
	//   27   55:invokespecial   #53  <Method void StringBuilder()>
	//   28   58:astore_1        
		((StringBuilder) (adeserializer)).append("Unsupported action file version: ");
	//   29   59:aload_1         
	//   30   60:ldc1            #55  <String "Unsupported action file version: ">
	//   31   62:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//   32   65:pop             
		((StringBuilder) (adeserializer)).append(j);
	//   33   66:aload_1         
	//   34   67:iload_3         
	//   35   68:invokevirtual   #62  <Method StringBuilder StringBuilder.append(int)>
	//   36   71:pop             
		throw new IOException(((StringBuilder) (adeserializer)).toString());
	//   37   72:new             #29  <Class IOException>
	//   38   75:dup             
	//   39   76:aload_1         
	//   40   77:invokevirtual   #66  <Method String StringBuilder.toString()>
	//   41   80:invokespecial   #69  <Method void IOException(String)>
	//   42   83:athrow          
		DownloadAction adownloadaction[];
		j = datainputstream.readInt();
	//   43   84:aload           6
	//   44   86:invokevirtual   #50  <Method int DataInputStream.readInt()>
	//   45   89:istore_3        
		adownloadaction = new DownloadAction[j];
	//   46   90:iload_3         
	//   47   91:anewarray       DownloadAction[]
	//   48   94:astore          7
_L2:
		if(i >= j)
			break; /* Loop/switch isn't completed */
	//   49   96:iload_2         
	//   50   97:iload_3         
	//   51   98:icmpge          118
		adownloadaction[i] = DownloadAction.deserializeFromStream(adeserializer, ((java.io.InputStream) (datainputstream)));
	//   52  101:aload           7
	//   53  103:iload_2         
	//   54  104:aload_1         
	//   55  105:aload           6
	//   56  107:invokestatic    #73  <Method DownloadAction DownloadAction.deserializeFromStream(DownloadAction$Deserializer[], java.io.InputStream)>
	//   57  110:aastore         
		i++;
	//   58  111:iload_2         
	//   59  112:iconst_1        
	//   60  113:iadd            
	//   61  114:istore_2        
		if(true) goto _L2; else goto _L1
	//   62  115:goto            96
_L1:
		Util.closeQuietly(((java.io.Closeable) (inputstream)));
	//   63  118:aload           5
	//   64  120:invokestatic    #79  <Method void Util.closeQuietly(java.io.Closeable)>
		return adownloadaction;
	//   65  123:aload           7
	//   66  125:areturn         
		Exception exception1;
		exception1;
	//   67  126:astore          6
		Exception exception;
		adeserializer = ((DownloadAction.Deserializer []) (inputstream));
	//   68  128:aload           5
	//   69  130:astore_1        
		exception = exception1;
	//   70  131:aload           6
	//   71  133:astore          5
		break MISSING_BLOCK_LABEL_142;
	//   72  135:goto            142
		exception;
	//   73  138:astore          5
		adeserializer = null;
	//   74  140:aconst_null     
	//   75  141:astore_1        
		Util.closeQuietly(((java.io.Closeable) (adeserializer)));
	//   76  142:aload_1         
	//   77  143:invokestatic    #79  <Method void Util.closeQuietly(java.io.Closeable)>
		throw exception;
	//   78  146:aload           5
	//   79  148:athrow          
	}

	public transient void store(DownloadAction adownloadaction[])
		throws IOException
	{
		DataOutputStream dataoutputstream = new DataOutputStream(atomicFile.startWrite());
	//    0    0:new             #84  <Class DataOutputStream>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #24  <Field AtomicFile atomicFile>
	//    4    8:invokevirtual   #88  <Method java.io.OutputStream AtomicFile.startWrite()>
	//    5   11:invokespecial   #91  <Method void DataOutputStream(java.io.OutputStream)>
	//    6   14:astore          4
		int i = 0;
	//    7   16:iconst_0        
	//    8   17:istore_2        
		int j;
		dataoutputstream.writeInt(0);
	//    9   18:aload           4
	//   10   20:iconst_0        
	//   11   21:invokevirtual   #95  <Method void DataOutputStream.writeInt(int)>
		dataoutputstream.writeInt(adownloadaction.length);
	//   12   24:aload           4
	//   13   26:aload_1         
	//   14   27:arraylength     
	//   15   28:invokevirtual   #95  <Method void DataOutputStream.writeInt(int)>
		j = adownloadaction.length;
	//   16   31:aload_1         
	//   17   32:arraylength     
	//   18   33:istore_3        
_L2:
		if(i >= j)
			break; /* Loop/switch isn't completed */
	//   19   34:iload_2         
	//   20   35:iload_3         
	//   21   36:icmpge          54
		DownloadAction.serializeToStream(adownloadaction[i], ((java.io.OutputStream) (dataoutputstream)));
	//   22   39:aload_1         
	//   23   40:iload_2         
	//   24   41:aaload          
	//   25   42:aload           4
	//   26   44:invokestatic    #99  <Method void DownloadAction.serializeToStream(DownloadAction, java.io.OutputStream)>
		i++;
	//   27   47:iload_2         
	//   28   48:iconst_1        
	//   29   49:iadd            
	//   30   50:istore_2        
		if(true) goto _L2; else goto _L1
	//   31   51:goto            34
_L1:
		atomicFile.endWrite(((java.io.OutputStream) (dataoutputstream)));
	//   32   54:aload_0         
	//   33   55:getfield        #24  <Field AtomicFile atomicFile>
	//   34   58:aload           4
	//   35   60:invokevirtual   #102 <Method void AtomicFile.endWrite(java.io.OutputStream)>
		Util.closeQuietly(((java.io.Closeable) (null)));
	//   36   63:aconst_null     
	//   37   64:invokestatic    #79  <Method void Util.closeQuietly(java.io.Closeable)>
		return;
	//   38   67:return          
		Exception exception1;
		exception1;
	//   39   68:astore          5
		Exception exception;
		adownloadaction = ((DownloadAction []) (dataoutputstream));
	//   40   70:aload           4
	//   41   72:astore_1        
		exception = exception1;
	//   42   73:aload           5
	//   43   75:astore          4
		break MISSING_BLOCK_LABEL_84;
	//   44   77:goto            84
		exception;
	//   45   80:astore          4
		adownloadaction = null;
	//   46   82:aconst_null     
	//   47   83:astore_1        
		Util.closeQuietly(((java.io.Closeable) (adownloadaction)));
	//   48   84:aload_1         
	//   49   85:invokestatic    #79  <Method void Util.closeQuietly(java.io.Closeable)>
		throw exception;
	//   50   88:aload           4
	//   51   90:athrow          
	}

	static final int VERSION = 0;
	private final File actionFile;
	private final AtomicFile atomicFile;
}
