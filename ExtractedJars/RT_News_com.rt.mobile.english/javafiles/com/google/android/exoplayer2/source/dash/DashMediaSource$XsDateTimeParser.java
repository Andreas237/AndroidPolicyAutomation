// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.source.dash;

import android.net.Uri;
import com.google.android.exoplayer2.util.Util;
import java.io.*;

// Referenced classes of package com.google.android.exoplayer2.source.dash:
//			DashMediaSource

private static final class DashMediaSource$XsDateTimeParser
	implements com.google.android.exoplayer2.upstream.ParsingLoadable.Parser
{

	public Long parse(Uri uri, InputStream inputstream)
		throws IOException
	{
		return Long.valueOf(Util.parseXsDateTime((new BufferedReader(((java.io.Reader) (new InputStreamReader(inputstream))))).readLine()));
	//    0    0:new             #23  <Class BufferedReader>
	//    1    3:dup             
	//    2    4:new             #25  <Class InputStreamReader>
	//    3    7:dup             
	//    4    8:aload_2         
	//    5    9:invokespecial   #28  <Method void InputStreamReader(InputStream)>
	//    6   12:invokespecial   #31  <Method void BufferedReader(java.io.Reader)>
	//    7   15:invokevirtual   #35  <Method String BufferedReader.readLine()>
	//    8   18:invokestatic    #41  <Method long Util.parseXsDateTime(String)>
	//    9   21:invokestatic    #47  <Method Long Long.valueOf(long)>
	//   10   24:areturn         
	}

	public volatile Object parse(Uri uri, InputStream inputstream)
		throws IOException
	{
		return ((Object) (parse(uri, inputstream)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #51  <Method Long parse(Uri, InputStream)>
	//    4    6:areturn         
	}

	private DashMediaSource$XsDateTimeParser()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
	//    2    4:return          
	}

	DashMediaSource$XsDateTimeParser(DashMediaSource._cls1 _pcls1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void DashMediaSource$XsDateTimeParser()>
	//    2    4:return          
	}
}
