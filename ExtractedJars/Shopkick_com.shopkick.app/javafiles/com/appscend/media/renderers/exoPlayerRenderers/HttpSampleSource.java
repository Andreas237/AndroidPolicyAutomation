// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appscend.media.renderers.exoPlayerRenderers;

import com.google.android.exoplayer.SampleSource;
import java.net.URL;

// Referenced classes of package com.appscend.media.renderers.exoPlayerRenderers:
//			HttpSampleSourceReader

public class HttpSampleSource
	implements SampleSource
{

	HttpSampleSource(URL url, String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		reader = new HttpSampleSourceReader(url, s);
	//    2    4:aload_0         
	//    3    5:new             #15  <Class HttpSampleSourceReader>
	//    4    8:dup             
	//    5    9:aload_1         
	//    6   10:aload_2         
	//    7   11:invokespecial   #17  <Method void HttpSampleSourceReader(URL, String)>
	//    8   14:putfield        #19  <Field HttpSampleSourceReader reader>
	//    9   17:return          
	}

	public com.google.android.exoplayer.SampleSource.SampleSourceReader register()
	{
		return ((com.google.android.exoplayer.SampleSource.SampleSourceReader) (reader));
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field HttpSampleSourceReader reader>
	//    2    4:areturn         
	}

	private HttpSampleSourceReader reader;
}
