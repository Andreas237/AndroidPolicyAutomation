// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.dash.mpd;

import com.google.android.exoplayer.ParserException;
import com.google.android.exoplayer.util.Util;
import java.io.*;
import java.text.ParseException;

// Referenced classes of package com.google.android.exoplayer.dash.mpd:
//			UtcTimingElementResolver

private static class UtcTimingElementResolver$XsDateTimeParser
	implements com.google.android.exoplayer.upstream.UriLoadable.Parser
{

	public Long parse(String s, InputStream inputstream)
		throws ParserException, IOException
	{
		s = (new BufferedReader(((java.io.Reader) (new InputStreamReader(inputstream))))).readLine();
	//    0    0:new             #27  <Class BufferedReader>
	//    1    3:dup             
	//    2    4:new             #29  <Class InputStreamReader>
	//    3    7:dup             
	//    4    8:aload_2         
	//    5    9:invokespecial   #32  <Method void InputStreamReader(InputStream)>
	//    6   12:invokespecial   #35  <Method void BufferedReader(java.io.Reader)>
	//    7   15:invokevirtual   #39  <Method String BufferedReader.readLine()>
	//    8   18:astore_1        
		long l;
		try
		{
			l = Util.parseXsDateTime(s);
	//    9   19:aload_1         
	//   10   20:invokestatic    #45  <Method long Util.parseXsDateTime(String)>
	//   11   23:lstore_3        
		}
	//*  12   24:lload_3         
	//*  13   25:invokestatic    #51  <Method Long Long.valueOf(long)>
	//*  14   28:areturn         
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  15   29:astore_1        
		{
			throw new ParserException(((Throwable) (s)));
	//   16   30:new             #21  <Class ParserException>
	//   17   33:dup             
	//   18   34:aload_1         
	//   19   35:invokespecial   #54  <Method void ParserException(Throwable)>
	//   20   38:athrow          
		}
		return Long.valueOf(l);
	}

	public volatile Object parse(String s, InputStream inputstream)
		throws ParserException, IOException
	{
		return ((Object) (parse(s, inputstream)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #58  <Method Long parse(String, InputStream)>
	//    4    6:areturn         
	}

	private UtcTimingElementResolver$XsDateTimeParser()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
	//    2    4:return          
	}

	UtcTimingElementResolver$XsDateTimeParser(UtcTimingElementResolver._cls1 _pcls1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void UtcTimingElementResolver$XsDateTimeParser()>
	//    2    4:return          
	}
}
