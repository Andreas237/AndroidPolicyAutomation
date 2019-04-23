// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appscend.media.renderers.exoPlayerRenderers;

import android.os.AsyncTask;
import android.util.Log;
import com.google.android.exoplayer.*;
import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.nio.ByteBuffer;

public class HttpSampleSourceReader extends AsyncTask
	implements com.google.android.exoplayer.SampleSource.SampleSourceReader
{

	HttpSampleSourceReader(URL url1, String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void AsyncTask()>
		bytes = new byte[0];
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:newarray        byte[]
	//    5    8:putfield        #20  <Field byte[] bytes>
		url = url1;
	//    6   11:aload_0         
	//    7   12:aload_1         
	//    8   13:putfield        #22  <Field URL url>
		mimeType = s;
	//    9   16:aload_0         
	//   10   17:aload_2         
	//   11   18:putfield        #24  <Field String mimeType>
	//   12   21:return          
	}

	public boolean continueBuffering(int i, long l)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public void disable(int i)
	{
		cancel(true);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:invokevirtual   #33  <Method boolean cancel(boolean)>
	//    3    5:pop             
	//    4    6:return          
	}

	protected volatile Object doInBackground(Object aobj[])
	{
		return ((Object) (doInBackground((Void[])aobj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #37  <Class Void[]>
	//    3    5:invokevirtual   #40  <Method Void doInBackground(Void[])>
	//    4    8:areturn         
	}

	protected transient Void doInBackground(Void avoid[])
	{
		try
		{
			bytes = readBytes(url.openConnection().getInputStream());
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:aload_0         
	//    3    3:getfield        #22  <Field URL url>
	//    4    6:invokevirtual   #48  <Method URLConnection URL.openConnection()>
	//    5    9:invokevirtual   #54  <Method InputStream URLConnection.getInputStream()>
	//    6   12:invokevirtual   #58  <Method byte[] readBytes(InputStream)>
	//    7   15:putfield        #20  <Field byte[] bytes>
		}
	//*   8   18:goto            32
		// Misplaced declaration of an exception variable
		catch(Void avoid[])
	//*   9   21:astore_1        
		{
			Log.w("HttpSampleSource", ((Exception) (avoid)).getMessage());
	//   10   22:ldc1            #60  <String "HttpSampleSource">
	//   11   24:aload_1         
	//   12   25:invokevirtual   #64  <Method String Exception.getMessage()>
	//   13   28:invokestatic    #70  <Method int Log.w(String, String)>
	//   14   31:pop             
		}
		return null;
	//   15   32:aconst_null     
	//   16   33:areturn         
	}

	public void enable(int i, long l)
	{
		seekToUs(l);
	//    0    0:aload_0         
	//    1    1:lload_2         
	//    2    2:invokevirtual   #76  <Method void seekToUs(long)>
	//    3    5:return          
	}

	public long getBufferedPositionUs()
	{
		return -2L;
	//    0    0:ldc2w           #79  <Long -2L>
	//    1    3:lreturn         
	}

	public MediaFormat getFormat(int i)
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public int getTrackCount()
	{
		return 1;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public void maybeThrowError()
		throws IOException
	{
	//    0    0:return          
	}

	public boolean prepare(long l)
	{
		if(getStatus() == android.os.AsyncTask.Status.PENDING)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #94  <Method android.os.AsyncTask$Status getStatus()>
	//*   2    4:getstatic       #100 <Field android.os.AsyncTask$Status android.os.AsyncTask$Status.PENDING>
	//*   3    7:if_acmpne       19
			execute(((Object []) (new Void[0])));
	//    4   10:aload_0         
	//    5   11:iconst_0        
	//    6   12:anewarray       Void[]
	//    7   15:invokevirtual   #106 <Method AsyncTask execute(Object[])>
	//    8   18:pop             
		return true;
	//    9   19:iconst_1        
	//   10   20:ireturn         
	}

	protected byte[] readBytes(InputStream inputstream)
		throws IOException
	{
		ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
	//    0    0:new             #108 <Class ByteArrayOutputStream>
	//    1    3:dup             
	//    2    4:invokespecial   #109 <Method void ByteArrayOutputStream()>
	//    3    7:astore_3        
		byte abyte0[] = new byte[1024];
	//    4    8:sipush          1024
	//    5   11:newarray        byte[]
	//    6   13:astore          4
		do
		{
			int i = inputstream.read(abyte0);
	//    7   15:aload_1         
	//    8   16:aload           4
	//    9   18:invokevirtual   #115 <Method int InputStream.read(byte[])>
	//   10   21:istore_2        
			if(i != -1 && !isCancelled())
	//*  11   22:iload_2         
	//*  12   23:iconst_m1       
	//*  13   24:icmpeq          45
	//*  14   27:aload_0         
	//*  15   28:invokevirtual   #119 <Method boolean isCancelled()>
	//*  16   31:ifne            45
				bytearrayoutputstream.write(abyte0, 0, i);
	//   17   34:aload_3         
	//   18   35:aload           4
	//   19   37:iconst_0        
	//   20   38:iload_2         
	//   21   39:invokevirtual   #123 <Method void ByteArrayOutputStream.write(byte[], int, int)>
			else
	//*  22   42:goto            15
				return bytearrayoutputstream.toByteArray();
	//   23   45:aload_3         
	//   24   46:invokevirtual   #127 <Method byte[] ByteArrayOutputStream.toByteArray()>
	//   25   49:areturn         
		} while(true);
	}

	public int readData(int i, long l, MediaFormatHolder mediaformatholder, SampleHolder sampleholder)
	{
		mediaformatholder = ((MediaFormatHolder) (bytes));
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field byte[] bytes>
	//    2    4:astore          4
		if(mediaformatholder.length <= 0)
	//*   3    6:aload           4
	//*   4    8:arraylength     
	//*   5    9:ifgt            15
			return -2;
	//    6   12:bipush          -2
	//    7   14:ireturn         
		if(sampleholder != null)
	//*   8   15:aload           5
	//*   9   17:ifnull          38
		{
			sampleholder.size = mediaformatholder.length;
	//   10   20:aload           5
	//   11   22:aload           4
	//   12   24:arraylength     
	//   13   25:putfield        #135 <Field int SampleHolder.size>
			sampleholder.data = ByteBuffer.wrap(((byte []) (mediaformatholder)));
	//   14   28:aload           5
	//   15   30:aload           4
	//   16   32:invokestatic    #141 <Method ByteBuffer ByteBuffer.wrap(byte[])>
	//   17   35:putfield        #145 <Field ByteBuffer SampleHolder.data>
		}
		return -3;
	//   18   38:bipush          -3
	//   19   40:ireturn         
	}

	public long readDiscontinuity(int i)
	{
		return 0L;
	//    0    0:lconst_0        
	//    1    1:lreturn         
	}

	public void release()
	{
	//    0    0:return          
	}

	public void seekToUs(long l)
	{
	//    0    0:return          
	}

	private byte bytes[];
	private String mimeType;
	private URL url;
}
