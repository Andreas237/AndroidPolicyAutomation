// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.offline;

import android.net.Uri;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

// Referenced classes of package com.google.android.exoplayer2.offline:
//			FilterableManifest

public final class FilteringManifestParser
	implements com.google.android.exoplayer2.upstream.ParsingLoadable.Parser
{

	public FilteringManifestParser(com.google.android.exoplayer2.upstream.ParsingLoadable.Parser parser1, List list)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		parser = parser1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #20  <Field com.google.android.exoplayer2.upstream.ParsingLoadable$Parser parser>
		trackKeys = list;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #22  <Field List trackKeys>
	//    8   14:return          
	}

	public FilterableManifest parse(Uri uri, InputStream inputstream)
		throws IOException
	{
		inputstream = ((InputStream) ((FilterableManifest)parser.parse(uri, inputstream)));
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field com.google.android.exoplayer2.upstream.ParsingLoadable$Parser parser>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokeinterface #32  <Method Object com.google.android.exoplayer2.upstream.ParsingLoadable$Parser.parse(Uri, InputStream)>
	//    5   11:checkcast       #34  <Class FilterableManifest>
	//    6   14:astore_2        
		uri = ((Uri) (inputstream));
	//    7   15:aload_2         
	//    8   16:astore_1        
		if(trackKeys != null)
	//*   9   17:aload_0         
	//*  10   18:getfield        #22  <Field List trackKeys>
	//*  11   21:ifnull          52
		{
			if(trackKeys.isEmpty())
	//*  12   24:aload_0         
	//*  13   25:getfield        #22  <Field List trackKeys>
	//*  14   28:invokeinterface #40  <Method boolean List.isEmpty()>
	//*  15   33:ifeq            38
				return ((FilterableManifest) (inputstream));
	//   16   36:aload_2         
	//   17   37:areturn         
			uri = ((Uri) ((FilterableManifest)((FilterableManifest) (inputstream)).copy(trackKeys)));
	//   18   38:aload_2         
	//   19   39:aload_0         
	//   20   40:getfield        #22  <Field List trackKeys>
	//   21   43:invokeinterface #44  <Method Object FilterableManifest.copy(List)>
	//   22   48:checkcast       #34  <Class FilterableManifest>
	//   23   51:astore_1        
		}
		return ((FilterableManifest) (uri));
	//   24   52:aload_1         
	//   25   53:areturn         
	}

	public volatile Object parse(Uri uri, InputStream inputstream)
		throws IOException
	{
		return ((Object) (parse(uri, inputstream)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #48  <Method FilterableManifest parse(Uri, InputStream)>
	//    4    6:areturn         
	}

	private final com.google.android.exoplayer2.upstream.ParsingLoadable.Parser parser;
	private final List trackKeys;
}
