// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.hls;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Queue;

// Referenced classes of package com.google.android.exoplayer.hls:
//			HlsPlaylistParser

private static class HlsPlaylistParser$LineIterator
{

	public boolean hasNext()
		throws IOException
	{
		if(next != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #32  <Field String next>
	//*   2    4:ifnull          9
			return true;
	//    3    7:iconst_1        
	//    4    8:ireturn         
		if(!extraLines.isEmpty())
	//*   5    9:aload_0         
	//*   6   10:getfield        #21  <Field Queue extraLines>
	//*   7   13:invokeinterface #37  <Method boolean Queue.isEmpty()>
	//*   8   18:ifne            39
		{
			next = (String)extraLines.poll();
	//    9   21:aload_0         
	//   10   22:aload_0         
	//   11   23:getfield        #21  <Field Queue extraLines>
	//   12   26:invokeinterface #41  <Method Object Queue.poll()>
	//   13   31:checkcast       #43  <Class String>
	//   14   34:putfield        #32  <Field String next>
			return true;
	//   15   37:iconst_1        
	//   16   38:ireturn         
		}
		do
		{
			String s = reader.readLine();
	//   17   39:aload_0         
	//   18   40:getfield        #23  <Field BufferedReader reader>
	//   19   43:invokevirtual   #49  <Method String BufferedReader.readLine()>
	//   20   46:astore_1        
			next = s;
	//   21   47:aload_0         
	//   22   48:aload_1         
	//   23   49:putfield        #32  <Field String next>
			if(s != null)
	//*  24   52:aload_1         
	//*  25   53:ifnull          79
			{
				next = next.trim();
	//   26   56:aload_0         
	//   27   57:aload_0         
	//   28   58:getfield        #32  <Field String next>
	//   29   61:invokevirtual   #52  <Method String String.trim()>
	//   30   64:putfield        #32  <Field String next>
				if(!next.isEmpty())
	//*  31   67:aload_0         
	//*  32   68:getfield        #32  <Field String next>
	//*  33   71:invokevirtual   #53  <Method boolean String.isEmpty()>
	//*  34   74:ifne            39
					return true;
	//   35   77:iconst_1        
	//   36   78:ireturn         
			} else
			{
				return false;
	//   37   79:iconst_0        
	//   38   80:ireturn         
			}
		} while(true);
	}

	public String next()
		throws IOException
	{
		if(hasNext())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #56  <Method boolean hasNext()>
	//*   2    4:ifeq            19
		{
			String s = next;
	//    3    7:aload_0         
	//    4    8:getfield        #32  <Field String next>
	//    5   11:astore_1        
			next = null;
	//    6   12:aload_0         
	//    7   13:aconst_null     
	//    8   14:putfield        #32  <Field String next>
			return s;
	//    9   17:aload_1         
	//   10   18:areturn         
		} else
		{
			return null;
	//   11   19:aconst_null     
	//   12   20:areturn         
		}
	}

	private final Queue extraLines;
	private String next;
	private final BufferedReader reader;

	public HlsPlaylistParser$LineIterator(Queue queue, BufferedReader bufferedreader)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
		extraLines = queue;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #21  <Field Queue extraLines>
		reader = bufferedreader;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #23  <Field BufferedReader reader>
	//    8   14:return          
	}
}
