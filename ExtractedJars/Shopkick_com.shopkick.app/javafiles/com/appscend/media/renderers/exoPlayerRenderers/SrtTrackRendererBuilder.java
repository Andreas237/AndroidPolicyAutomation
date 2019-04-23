// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appscend.media.renderers.exoPlayerRenderers;

import android.content.Context;
import com.google.android.exoplayer.text.SubtitleParser;
import com.google.android.exoplayer.text.TextTrackRenderer;
import com.google.android.exoplayer.text.subrip.SubripParser;
import java.net.MalformedURLException;
import java.net.URL;

// Referenced classes of package com.appscend.media.renderers.exoPlayerRenderers:
//			HttpSampleSource, ExoPlayerInterface

public class SrtTrackRendererBuilder
{

	public SrtTrackRendererBuilder()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public TextTrackRenderer build(Context context, ExoPlayerInterface exoplayerinterface, String s)
	{
		try
		{
			context = ((Context) (new TextTrackRenderer(((com.google.android.exoplayer.SampleSource) (new HttpSampleSource(new URL(s), "application/x-subrip"))), ((com.google.android.exoplayer.text.TextRenderer) (exoplayerinterface)), context.getApplicationContext().getMainLooper(), new SubtitleParser[] {
				new SubripParser()
			})));
	//    0    0:new             #15  <Class TextTrackRenderer>
	//    1    3:dup             
	//    2    4:new             #17  <Class HttpSampleSource>
	//    3    7:dup             
	//    4    8:new             #19  <Class URL>
	//    5   11:dup             
	//    6   12:aload_3         
	//    7   13:invokespecial   #22  <Method void URL(String)>
	//    8   16:ldc1            #24  <String "application/x-subrip">
	//    9   18:invokespecial   #27  <Method void HttpSampleSource(URL, String)>
	//   10   21:aload_2         
	//   11   22:aload_1         
	//   12   23:invokevirtual   #33  <Method Context Context.getApplicationContext()>
	//   13   26:invokevirtual   #37  <Method android.os.Looper Context.getMainLooper()>
	//   14   29:iconst_1        
	//   15   30:anewarray       SubtitleParser[]
	//   16   33:dup             
	//   17   34:iconst_0        
	//   18   35:new             #41  <Class SubripParser>
	//   19   38:dup             
	//   20   39:invokespecial   #42  <Method void SubripParser()>
	//   21   42:aastore         
	//   22   43:invokespecial   #45  <Method void TextTrackRenderer(com.google.android.exoplayer.SampleSource, com.google.android.exoplayer.text.TextRenderer, android.os.Looper, SubtitleParser[])>
	//   23   46:astore_1        
		}
	//*  24   47:aload_1         
	//*  25   48:areturn         
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*  26   49:astore_1        
		{
			((MalformedURLException) (context)).printStackTrace();
	//   27   50:aload_1         
	//   28   51:invokevirtual   #48  <Method void MalformedURLException.printStackTrace()>
			return null;
	//   29   54:aconst_null     
	//   30   55:areturn         
		}
		return ((TextTrackRenderer) (context));
	}
}
