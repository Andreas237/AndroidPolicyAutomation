// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.text.webvtt;

import android.text.TextUtils;
import com.google.android.exoplayer.ParserException;
import com.google.android.exoplayer.text.Subtitle;
import com.google.android.exoplayer.text.SubtitleParser;
import com.google.android.exoplayer.util.ParsableByteArray;
import java.util.ArrayList;

// Referenced classes of package com.google.android.exoplayer.text.webvtt:
//			WebvttCueParser, WebvttParserUtil, WebvttSubtitle

public final class WebvttParser
	implements SubtitleParser
{

	public WebvttParser()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #18  <Class WebvttCueParser>
	//    4    8:dup             
	//    5    9:invokespecial   #19  <Method void WebvttCueParser()>
	//    6   12:putfield        #21  <Field WebvttCueParser cueParser>
	//    7   15:aload_0         
	//    8   16:new             #23  <Class ParsableByteArray>
	//    9   19:dup             
	//   10   20:invokespecial   #24  <Method void ParsableByteArray()>
	//   11   23:putfield        #26  <Field ParsableByteArray parsableWebvttData>
	//   12   26:aload_0         
	//   13   27:new             #28  <Class WebvttCue$Builder>
	//   14   30:dup             
	//   15   31:invokespecial   #29  <Method void WebvttCue$Builder()>
	//   16   34:putfield        #31  <Field WebvttCue$Builder webvttCueBuilder>
	//   17   37:return          
	}

	public final boolean canParse(String s)
	{
		return "text/vtt".equals(((Object) (s)));
	//    0    0:ldc1            #36  <String "text/vtt">
	//    1    2:aload_1         
	//    2    3:invokevirtual   #42  <Method boolean String.equals(Object)>
	//    3    6:ireturn         
	}

	public volatile Subtitle parse(byte abyte0[], int i, int j)
		throws ParserException
	{
		return ((Subtitle) (parse(abyte0, i, j)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:invokevirtual   #49  <Method WebvttSubtitle parse(byte[], int, int)>
	//    5    7:areturn         
	}

	public final WebvttSubtitle parse(byte abyte0[], int i, int j)
		throws ParserException
	{
		parsableWebvttData.reset(abyte0, j + i);
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field ParsableByteArray parsableWebvttData>
	//    2    4:aload_1         
	//    3    5:iload_3         
	//    4    6:iload_2         
	//    5    7:iadd            
	//    6    8:invokevirtual   #54  <Method void ParsableByteArray.reset(byte[], int)>
		parsableWebvttData.setPosition(i);
	//    7   11:aload_0         
	//    8   12:getfield        #26  <Field ParsableByteArray parsableWebvttData>
	//    9   15:iload_2         
	//   10   16:invokevirtual   #58  <Method void ParsableByteArray.setPosition(int)>
		webvttCueBuilder.reset();
	//   11   19:aload_0         
	//   12   20:getfield        #31  <Field WebvttCue$Builder webvttCueBuilder>
	//   13   23:invokevirtual   #60  <Method void WebvttCue$Builder.reset()>
		WebvttParserUtil.validateWebvttHeaderLine(parsableWebvttData);
	//   14   26:aload_0         
	//   15   27:getfield        #26  <Field ParsableByteArray parsableWebvttData>
	//   16   30:invokestatic    #66  <Method void WebvttParserUtil.validateWebvttHeaderLine(ParsableByteArray)>
		while(!TextUtils.isEmpty(((CharSequence) (parsableWebvttData.readLine())))) ;
	//   17   33:aload_0         
	//   18   34:getfield        #26  <Field ParsableByteArray parsableWebvttData>
	//   19   37:invokevirtual   #70  <Method String ParsableByteArray.readLine()>
	//   20   40:invokestatic    #76  <Method boolean TextUtils.isEmpty(CharSequence)>
	//   21   43:ifne            49
	//*  22   46:goto            33
		abyte0 = ((byte []) (new ArrayList()));
	//   23   49:new             #78  <Class ArrayList>
	//   24   52:dup             
	//   25   53:invokespecial   #79  <Method void ArrayList()>
	//   26   56:astore_1        
		for(; cueParser.parseNextValidCue(parsableWebvttData, webvttCueBuilder); webvttCueBuilder.reset())
	//*  27   57:aload_0         
	//*  28   58:getfield        #21  <Field WebvttCueParser cueParser>
	//*  29   61:aload_0         
	//*  30   62:getfield        #26  <Field ParsableByteArray parsableWebvttData>
	//*  31   65:aload_0         
	//*  32   66:getfield        #31  <Field WebvttCue$Builder webvttCueBuilder>
	//*  33   69:invokevirtual   #83  <Method boolean WebvttCueParser.parseNextValidCue(ParsableByteArray, WebvttCue$Builder)>
	//*  34   72:ifeq            97
			((ArrayList) (abyte0)).add(((Object) (webvttCueBuilder.build())));
	//   35   75:aload_1         
	//   36   76:aload_0         
	//   37   77:getfield        #31  <Field WebvttCue$Builder webvttCueBuilder>
	//   38   80:invokevirtual   #87  <Method WebvttCue WebvttCue$Builder.build()>
	//   39   83:invokevirtual   #90  <Method boolean ArrayList.add(Object)>
	//   40   86:pop             

	//   41   87:aload_0         
	//   42   88:getfield        #31  <Field WebvttCue$Builder webvttCueBuilder>
	//   43   91:invokevirtual   #60  <Method void WebvttCue$Builder.reset()>
	//*  44   94:goto            57
		return new WebvttSubtitle(((java.util.List) (abyte0)));
	//   45   97:new             #92  <Class WebvttSubtitle>
	//   46  100:dup             
	//   47  101:aload_1         
	//   48  102:invokespecial   #95  <Method void WebvttSubtitle(java.util.List)>
	//   49  105:areturn         
	}

	private final WebvttCueParser cueParser = new WebvttCueParser();
	private final ParsableByteArray parsableWebvttData = new ParsableByteArray();
	private final WebvttCue.Builder webvttCueBuilder = new WebvttCue.Builder();
}
