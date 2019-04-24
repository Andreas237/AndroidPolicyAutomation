// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.text.webvtt;

import android.text.TextUtils;
import com.google.android.exoplayer2.text.*;
import com.google.android.exoplayer2.util.ParsableByteArray;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.exoplayer2.text.webvtt:
//			WebvttCueParser, CssParser, WebvttParserUtil, WebvttSubtitle

public final class WebvttDecoder extends SimpleSubtitleDecoder
{

	public WebvttDecoder()
	{
		super("WebvttDecoder");
	//    0    0:aload_0         
	//    1    1:ldc1            #37  <String "WebvttDecoder">
	//    2    3:invokespecial   #40  <Method void SimpleSubtitleDecoder(String)>
	//    3    6:aload_0         
	//    4    7:new             #42  <Class WebvttCueParser>
	//    5   10:dup             
	//    6   11:invokespecial   #44  <Method void WebvttCueParser()>
	//    7   14:putfield        #46  <Field WebvttCueParser cueParser>
	//    8   17:aload_0         
	//    9   18:new             #48  <Class ParsableByteArray>
	//   10   21:dup             
	//   11   22:invokespecial   #49  <Method void ParsableByteArray()>
	//   12   25:putfield        #51  <Field ParsableByteArray parsableWebvttData>
	//   13   28:aload_0         
	//   14   29:new             #53  <Class WebvttCue$Builder>
	//   15   32:dup             
	//   16   33:invokespecial   #54  <Method void WebvttCue$Builder()>
	//   17   36:putfield        #56  <Field WebvttCue$Builder webvttCueBuilder>
	//   18   39:aload_0         
	//   19   40:new             #58  <Class CssParser>
	//   20   43:dup             
	//   21   44:invokespecial   #59  <Method void CssParser()>
	//   22   47:putfield        #61  <Field CssParser cssParser>
	//   23   50:aload_0         
	//   24   51:new             #63  <Class ArrayList>
	//   25   54:dup             
	//   26   55:invokespecial   #64  <Method void ArrayList()>
	//   27   58:putfield        #66  <Field List definedStyles>
	//   28   61:return          
	}

	private static int getNextEvent(ParsableByteArray parsablebytearray)
	{
		int i = 0;
	//    0    0:iconst_0        
	//    1    1:istore_2        
		byte byte0;
		for(byte0 = -1; byte0 == -1;)
	//*   2    2:iconst_m1       
	//*   3    3:istore_1        
	//*   4    4:iload_1         
	//*   5    5:iconst_m1       
	//*   6    6:icmpne          61
		{
			i = parsablebytearray.getPosition();
	//    7    9:aload_0         
	//    8   10:invokevirtual   #73  <Method int ParsableByteArray.getPosition()>
	//    9   13:istore_2        
			String s = parsablebytearray.readLine();
	//   10   14:aload_0         
	//   11   15:invokevirtual   #77  <Method String ParsableByteArray.readLine()>
	//   12   18:astore_3        
			if(s == null)
	//*  13   19:aload_3         
	//*  14   20:ifnonnull       28
				byte0 = 0;
	//   15   23:iconst_0        
	//   16   24:istore_1        
			else
	//*  17   25:goto            4
			if("STYLE".equals(((Object) (s))))
	//*  18   28:ldc1            #22  <String "STYLE">
	//*  19   30:aload_3         
	//*  20   31:invokevirtual   #83  <Method boolean String.equals(Object)>
	//*  21   34:ifeq            42
				byte0 = 2;
	//   22   37:iconst_2        
	//   23   38:istore_1        
			else
	//*  24   39:goto            4
			if("NOTE".startsWith(s))
	//*  25   42:ldc1            #8   <String "NOTE">
	//*  26   44:aload_3         
	//*  27   45:invokevirtual   #87  <Method boolean String.startsWith(String)>
	//*  28   48:ifeq            56
				byte0 = 1;
	//   29   51:iconst_1        
	//   30   52:istore_1        
			else
	//*  31   53:goto            4
				byte0 = 3;
	//   32   56:iconst_3        
	//   33   57:istore_1        
		}

	//*  34   58:goto            4
		parsablebytearray.setPosition(i);
	//   35   61:aload_0         
	//   36   62:iload_2         
	//   37   63:invokevirtual   #91  <Method void ParsableByteArray.setPosition(int)>
		return ((int) (byte0));
	//   38   66:iload_1         
	//   39   67:ireturn         
	}

	private static void skipComment(ParsableByteArray parsablebytearray)
	{
		while(!TextUtils.isEmpty(((CharSequence) (parsablebytearray.readLine())))) ;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #77  <Method String ParsableByteArray.readLine()>
	//    2    4:invokestatic    #99  <Method boolean TextUtils.isEmpty(CharSequence)>
	//    3    7:ifne            13
	//*   4   10:goto            0
	//    5   13:return          
	}

	protected volatile Subtitle decode(byte abyte0[], int i, boolean flag)
		throws SubtitleDecoderException
	{
		return ((Subtitle) (decode(abyte0, i, flag)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:invokevirtual   #106 <Method WebvttSubtitle decode(byte[], int, boolean)>
	//    5    7:areturn         
	}

	protected WebvttSubtitle decode(byte abyte0[], int i, boolean flag)
		throws SubtitleDecoderException
	{
		parsableWebvttData.reset(abyte0, i);
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field ParsableByteArray parsableWebvttData>
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:invokevirtual   #111 <Method void ParsableByteArray.reset(byte[], int)>
		webvttCueBuilder.reset();
	//    5    9:aload_0         
	//    6   10:getfield        #56  <Field WebvttCue$Builder webvttCueBuilder>
	//    7   13:invokevirtual   #113 <Method void WebvttCue$Builder.reset()>
		definedStyles.clear();
	//    8   16:aload_0         
	//    9   17:getfield        #66  <Field List definedStyles>
	//   10   20:invokeinterface #118 <Method void List.clear()>
		WebvttParserUtil.validateWebvttHeaderLine(parsableWebvttData);
	//   11   25:aload_0         
	//   12   26:getfield        #51  <Field ParsableByteArray parsableWebvttData>
	//   13   29:invokestatic    #123 <Method void WebvttParserUtil.validateWebvttHeaderLine(ParsableByteArray)>
		while(!TextUtils.isEmpty(((CharSequence) (parsableWebvttData.readLine())))) ;
	//   14   32:aload_0         
	//   15   33:getfield        #51  <Field ParsableByteArray parsableWebvttData>
	//   16   36:invokevirtual   #77  <Method String ParsableByteArray.readLine()>
	//   17   39:invokestatic    #99  <Method boolean TextUtils.isEmpty(CharSequence)>
	//   18   42:ifne            48
	//*  19   45:goto            32
		abyte0 = ((byte []) (new ArrayList()));
	//   20   48:new             #63  <Class ArrayList>
	//   21   51:dup             
	//   22   52:invokespecial   #64  <Method void ArrayList()>
	//   23   55:astore_1        
		do
		{
			i = getNextEvent(parsableWebvttData);
	//   24   56:aload_0         
	//   25   57:getfield        #51  <Field ParsableByteArray parsableWebvttData>
	//   26   60:invokestatic    #125 <Method int getNextEvent(ParsableByteArray)>
	//   27   63:istore_2        
			if(i == 0)
				break;
	//   28   64:iload_2         
	//   29   65:ifeq            195
			if(i == 1)
	//*  30   68:iload_2         
	//*  31   69:iconst_1        
	//*  32   70:icmpne          83
				skipComment(parsableWebvttData);
	//   33   73:aload_0         
	//   34   74:getfield        #51  <Field ParsableByteArray parsableWebvttData>
	//   35   77:invokestatic    #127 <Method void skipComment(ParsableByteArray)>
			else
	//*  36   80:goto            56
			if(i == 2)
	//*  37   83:iload_2         
	//*  38   84:iconst_2        
	//*  39   85:icmpne          146
			{
				if(!((ArrayList) (abyte0)).isEmpty())
	//*  40   88:aload_1         
	//*  41   89:invokevirtual   #130 <Method boolean ArrayList.isEmpty()>
	//*  42   92:ifne            105
					throw new SubtitleDecoderException("A style block was found after the first cue.");
	//   43   95:new             #103 <Class SubtitleDecoderException>
	//   44   98:dup             
	//   45   99:ldc1            #132 <String "A style block was found after the first cue.">
	//   46  101:invokespecial   #133 <Method void SubtitleDecoderException(String)>
	//   47  104:athrow          
				parsableWebvttData.readLine();
	//   48  105:aload_0         
	//   49  106:getfield        #51  <Field ParsableByteArray parsableWebvttData>
	//   50  109:invokevirtual   #77  <Method String ParsableByteArray.readLine()>
	//   51  112:pop             
				WebvttCssStyle webvttcssstyle = cssParser.parseBlock(parsableWebvttData);
	//   52  113:aload_0         
	//   53  114:getfield        #61  <Field CssParser cssParser>
	//   54  117:aload_0         
	//   55  118:getfield        #51  <Field ParsableByteArray parsableWebvttData>
	//   56  121:invokevirtual   #137 <Method WebvttCssStyle CssParser.parseBlock(ParsableByteArray)>
	//   57  124:astore          4
				if(webvttcssstyle != null)
	//*  58  126:aload           4
	//*  59  128:ifnull          56
					definedStyles.add(((Object) (webvttcssstyle)));
	//   60  131:aload_0         
	//   61  132:getfield        #66  <Field List definedStyles>
	//   62  135:aload           4
	//   63  137:invokeinterface #140 <Method boolean List.add(Object)>
	//   64  142:pop             
			} else
	//*  65  143:goto            56
			if(i == 3 && cueParser.parseCue(parsableWebvttData, webvttCueBuilder, definedStyles))
	//*  66  146:iload_2         
	//*  67  147:iconst_3        
	//*  68  148:icmpne          56
	//*  69  151:aload_0         
	//*  70  152:getfield        #46  <Field WebvttCueParser cueParser>
	//*  71  155:aload_0         
	//*  72  156:getfield        #51  <Field ParsableByteArray parsableWebvttData>
	//*  73  159:aload_0         
	//*  74  160:getfield        #56  <Field WebvttCue$Builder webvttCueBuilder>
	//*  75  163:aload_0         
	//*  76  164:getfield        #66  <Field List definedStyles>
	//*  77  167:invokevirtual   #144 <Method boolean WebvttCueParser.parseCue(ParsableByteArray, WebvttCue$Builder, List)>
	//*  78  170:ifeq            56
			{
				((ArrayList) (abyte0)).add(((Object) (webvttCueBuilder.build())));
	//   79  173:aload_1         
	//   80  174:aload_0         
	//   81  175:getfield        #56  <Field WebvttCue$Builder webvttCueBuilder>
	//   82  178:invokevirtual   #148 <Method WebvttCue WebvttCue$Builder.build()>
	//   83  181:invokevirtual   #149 <Method boolean ArrayList.add(Object)>
	//   84  184:pop             
				webvttCueBuilder.reset();
	//   85  185:aload_0         
	//   86  186:getfield        #56  <Field WebvttCue$Builder webvttCueBuilder>
	//   87  189:invokevirtual   #113 <Method void WebvttCue$Builder.reset()>
			}
		} while(true);
	//   88  192:goto            56
		return new WebvttSubtitle(((List) (abyte0)));
	//   89  195:new             #151 <Class WebvttSubtitle>
	//   90  198:dup             
	//   91  199:aload_1         
	//   92  200:invokespecial   #154 <Method void WebvttSubtitle(List)>
	//   93  203:areturn         
	}

	private static final String COMMENT_START = "NOTE";
	private static final int EVENT_COMMENT = 1;
	private static final int EVENT_CUE = 3;
	private static final int EVENT_END_OF_FILE = 0;
	private static final int EVENT_NONE = -1;
	private static final int EVENT_STYLE_BLOCK = 2;
	private static final String STYLE_START = "STYLE";
	private final CssParser cssParser = new CssParser();
	private final WebvttCueParser cueParser = new WebvttCueParser();
	private final List definedStyles = new ArrayList();
	private final ParsableByteArray parsableWebvttData = new ParsableByteArray();
	private final WebvttCue.Builder webvttCueBuilder = new WebvttCue.Builder();
}
