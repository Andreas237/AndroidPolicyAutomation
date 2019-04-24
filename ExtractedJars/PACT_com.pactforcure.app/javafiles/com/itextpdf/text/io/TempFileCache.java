// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.io;

import com.itextpdf.text.pdf.PdfObject;
import java.io.*;

public class TempFileCache
{
	public class ObjectPosition
	{

		int length;
		long offset;
		final TempFileCache this$0;

		ObjectPosition(long l, int i)
		{
			this$0 = TempFileCache.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #17  <Field TempFileCache this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #20  <Method void Object()>
			offset = l;
		//    5    9:aload_0         
		//    6   10:lload_2         
		//    7   11:putfield        #22  <Field long offset>
			length = i;
		//    8   14:aload_0         
		//    9   15:iload           4
		//   10   17:putfield        #24  <Field int length>
		//   11   20:return          
		}
	}


	public TempFileCache(String s)
		throws IOException
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void Object()>
		filename = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #24  <Field String filename>
		File file = (new File(s)).getParentFile();
	//    5    9:new             #26  <Class File>
	//    6   12:dup             
	//    7   13:aload_1         
	//    8   14:invokespecial   #28  <Method void File(String)>
	//    9   17:invokevirtual   #32  <Method File File.getParentFile()>
	//   10   20:astore_2        
		if(file != null)
	//*  11   21:aload_2         
	//*  12   22:ifnull          30
			file.mkdirs();
	//   13   25:aload_2         
	//   14   26:invokevirtual   #36  <Method boolean File.mkdirs()>
	//   15   29:pop             
		cache = new RandomAccessFile(s, "rw");
	//   16   30:aload_0         
	//   17   31:new             #38  <Class RandomAccessFile>
	//   18   34:dup             
	//   19   35:aload_1         
	//   20   36:ldc1            #40  <String "rw">
	//   21   38:invokespecial   #43  <Method void RandomAccessFile(String, String)>
	//   22   41:putfield        #45  <Field RandomAccessFile cache>
		baos = new ByteArrayOutputStream();
	//   23   44:aload_0         
	//   24   45:new             #47  <Class ByteArrayOutputStream>
	//   25   48:dup             
	//   26   49:invokespecial   #48  <Method void ByteArrayOutputStream()>
	//   27   52:putfield        #50  <Field ByteArrayOutputStream baos>
	//   28   55:return          
	}

	private byte[] getBuffer(int i)
	{
		if(buf == null || buf.length < i)
	//*   0    0:aload_0         
	//*   1    1:getfield        #56  <Field byte[] buf>
	//*   2    4:ifnull          16
	//*   3    7:aload_0         
	//*   4    8:getfield        #56  <Field byte[] buf>
	//*   5   11:arraylength     
	//*   6   12:iload_1         
	//*   7   13:icmpge          23
			buf = new byte[i];
	//    8   16:aload_0         
	//    9   17:iload_1         
	//   10   18:newarray        byte[]
	//   11   20:putfield        #56  <Field byte[] buf>
		return buf;
	//   12   23:aload_0         
	//   13   24:getfield        #56  <Field byte[] buf>
	//   14   27:areturn         
	}

	public void close()
		throws IOException
	{
		cache.close();
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field RandomAccessFile cache>
	//    2    4:invokevirtual   #59  <Method void RandomAccessFile.close()>
		cache = null;
	//    3    7:aload_0         
	//    4    8:aconst_null     
	//    5    9:putfield        #45  <Field RandomAccessFile cache>
		(new File(filename)).delete();
	//    6   12:new             #26  <Class File>
	//    7   15:dup             
	//    8   16:aload_0         
	//    9   17:getfield        #24  <Field String filename>
	//   10   20:invokespecial   #28  <Method void File(String)>
	//   11   23:invokevirtual   #62  <Method boolean File.delete()>
	//   12   26:pop             
	//   13   27:return          
	}

	public PdfObject get(ObjectPosition objectposition)
		throws IOException, ClassNotFoundException
	{
		PdfObject pdfobject;
		pdfobject = null;
	//    0    0:aconst_null     
	//    1    1:astore_2        
		if(objectposition == null)
			break MISSING_BLOCK_LABEL_73;
	//    2    2:aload_1         
	//    3    3:ifnull          73
		cache.seek(objectposition.offset);
	//    4    6:aload_0         
	//    5    7:getfield        #45  <Field RandomAccessFile cache>
	//    6   10:aload_1         
	//    7   11:getfield        #70  <Field long TempFileCache$ObjectPosition.offset>
	//    8   14:invokevirtual   #74  <Method void RandomAccessFile.seek(long)>
		cache.read(getBuffer(objectposition.length), 0, objectposition.length);
	//    9   17:aload_0         
	//   10   18:getfield        #45  <Field RandomAccessFile cache>
	//   11   21:aload_0         
	//   12   22:aload_1         
	//   13   23:getfield        #78  <Field int TempFileCache$ObjectPosition.length>
	//   14   26:invokespecial   #80  <Method byte[] getBuffer(int)>
	//   15   29:iconst_0        
	//   16   30:aload_1         
	//   17   31:getfield        #78  <Field int TempFileCache$ObjectPosition.length>
	//   18   34:invokevirtual   #84  <Method int RandomAccessFile.read(byte[], int, int)>
	//   19   37:pop             
		objectposition = ((ObjectPosition) (new ObjectInputStream(((java.io.InputStream) (new ByteArrayInputStream(getBuffer(objectposition.length)))))));
	//   20   38:new             #86  <Class ObjectInputStream>
	//   21   41:dup             
	//   22   42:new             #88  <Class ByteArrayInputStream>
	//   23   45:dup             
	//   24   46:aload_0         
	//   25   47:aload_1         
	//   26   48:getfield        #78  <Field int TempFileCache$ObjectPosition.length>
	//   27   51:invokespecial   #80  <Method byte[] getBuffer(int)>
	//   28   54:invokespecial   #91  <Method void ByteArrayInputStream(byte[])>
	//   29   57:invokespecial   #94  <Method void ObjectInputStream(java.io.InputStream)>
	//   30   60:astore_1        
		pdfobject = (PdfObject)((ObjectInputStream) (objectposition)).readObject();
	//   31   61:aload_1         
	//   32   62:invokevirtual   #98  <Method Object ObjectInputStream.readObject()>
	//   33   65:checkcast       #100 <Class PdfObject>
	//   34   68:astore_2        
		((ObjectInputStream) (objectposition)).close();
	//   35   69:aload_1         
	//   36   70:invokevirtual   #101 <Method void ObjectInputStream.close()>
		return pdfobject;
	//   37   73:aload_2         
	//   38   74:areturn         
		Exception exception;
		exception;
	//   39   75:astore_2        
		((ObjectInputStream) (objectposition)).close();
	//   40   76:aload_1         
	//   41   77:invokevirtual   #101 <Method void ObjectInputStream.close()>
		throw exception;
	//   42   80:aload_2         
	//   43   81:athrow          
	}

	public ObjectPosition put(PdfObject pdfobject)
		throws IOException
	{
		baos.reset();
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field ByteArrayOutputStream baos>
	//    2    4:invokevirtual   #106 <Method void ByteArrayOutputStream.reset()>
		ObjectOutputStream objectoutputstream = new ObjectOutputStream(((java.io.OutputStream) (baos)));
	//    3    7:new             #108 <Class ObjectOutputStream>
	//    4   10:dup             
	//    5   11:aload_0         
	//    6   12:getfield        #50  <Field ByteArrayOutputStream baos>
	//    7   15:invokespecial   #111 <Method void ObjectOutputStream(java.io.OutputStream)>
	//    8   18:astore          4
		long l = cache.length();
	//    9   20:aload_0         
	//   10   21:getfield        #45  <Field RandomAccessFile cache>
	//   11   24:invokevirtual   #114 <Method long RandomAccessFile.length()>
	//   12   27:lstore_2        
		objectoutputstream.writeObject(((Object) (pdfobject)));
	//   13   28:aload           4
	//   14   30:aload_1         
	//   15   31:invokevirtual   #118 <Method void ObjectOutputStream.writeObject(Object)>
		cache.seek(l);
	//   16   34:aload_0         
	//   17   35:getfield        #45  <Field RandomAccessFile cache>
	//   18   38:lload_2         
	//   19   39:invokevirtual   #74  <Method void RandomAccessFile.seek(long)>
		cache.write(baos.toByteArray());
	//   20   42:aload_0         
	//   21   43:getfield        #45  <Field RandomAccessFile cache>
	//   22   46:aload_0         
	//   23   47:getfield        #50  <Field ByteArrayOutputStream baos>
	//   24   50:invokevirtual   #122 <Method byte[] ByteArrayOutputStream.toByteArray()>
	//   25   53:invokevirtual   #125 <Method void RandomAccessFile.write(byte[])>
		return new ObjectPosition(l, (int)(cache.length() - l));
	//   26   56:new             #6   <Class TempFileCache$ObjectPosition>
	//   27   59:dup             
	//   28   60:aload_0         
	//   29   61:lload_2         
	//   30   62:aload_0         
	//   31   63:getfield        #45  <Field RandomAccessFile cache>
	//   32   66:invokevirtual   #114 <Method long RandomAccessFile.length()>
	//   33   69:lload_2         
	//   34   70:lsub            
	//   35   71:l2i             
	//   36   72:invokespecial   #128 <Method void TempFileCache$ObjectPosition(TempFileCache, long, int)>
	//   37   75:areturn         
	}

	private ByteArrayOutputStream baos;
	private byte buf[];
	private RandomAccessFile cache;
	private String filename;
}
