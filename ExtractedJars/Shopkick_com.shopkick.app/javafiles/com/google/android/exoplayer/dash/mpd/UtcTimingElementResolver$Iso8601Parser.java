// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.dash.mpd;

import com.google.android.exoplayer.ParserException;
import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

// Referenced classes of package com.google.android.exoplayer.dash.mpd:
//			UtcTimingElementResolver

private static class UtcTimingElementResolver$Iso8601Parser
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
			inputstream = ((InputStream) (new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.US)));
	//    9   19:new             #41  <Class SimpleDateFormat>
	//   10   22:dup             
	//   11   23:ldc1            #43  <String "yyyy-MM-dd'T'HH:mm:ss'Z'">
	//   12   25:getstatic       #49  <Field Locale Locale.US>
	//   13   28:invokespecial   #52  <Method void SimpleDateFormat(String, Locale)>
	//   14   31:astore_2        
			((SimpleDateFormat) (inputstream)).setTimeZone(TimeZone.getTimeZone("UTC"));
	//   15   32:aload_2         
	//   16   33:ldc1            #54  <String "UTC">
	//   17   35:invokestatic    #60  <Method TimeZone TimeZone.getTimeZone(String)>
	//   18   38:invokevirtual   #64  <Method void SimpleDateFormat.setTimeZone(TimeZone)>
			l = ((SimpleDateFormat) (inputstream)).parse(s).getTime();
	//   19   41:aload_2         
	//   20   42:aload_1         
	//   21   43:invokevirtual   #67  <Method Date SimpleDateFormat.parse(String)>
	//   22   46:invokevirtual   #73  <Method long Date.getTime()>
	//   23   49:lstore_3        
		}
	//*  24   50:lload_3         
	//*  25   51:invokestatic    #79  <Method Long Long.valueOf(long)>
	//*  26   54:areturn         
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  27   55:astore_1        
		{
			throw new ParserException(((Throwable) (s)));
	//   28   56:new             #21  <Class ParserException>
	//   29   59:dup             
	//   30   60:aload_1         
	//   31   61:invokespecial   #82  <Method void ParserException(Throwable)>
	//   32   64:athrow          
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
	//    3    3:invokevirtual   #86  <Method Long parse(String, InputStream)>
	//    4    6:areturn         
	}

	private UtcTimingElementResolver$Iso8601Parser()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
	//    2    4:return          
	}

	UtcTimingElementResolver$Iso8601Parser(UtcTimingElementResolver._cls1 _pcls1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void UtcTimingElementResolver$Iso8601Parser()>
	//    2    4:return          
	}
}
