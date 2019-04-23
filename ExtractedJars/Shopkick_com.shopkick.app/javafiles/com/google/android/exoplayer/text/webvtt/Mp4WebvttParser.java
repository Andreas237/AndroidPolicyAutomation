// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.text.webvtt;

import com.google.android.exoplayer.ParserException;
import com.google.android.exoplayer.text.*;
import com.google.android.exoplayer.util.ParsableByteArray;
import com.google.android.exoplayer.util.Util;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.exoplayer.text.webvtt:
//			WebvttCueParser, Mp4WebvttSubtitle

public final class Mp4WebvttParser
	implements SubtitleParser
{

	public Mp4WebvttParser()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #40  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #42  <Class ParsableByteArray>
	//    4    8:dup             
	//    5    9:invokespecial   #43  <Method void ParsableByteArray()>
	//    6   12:putfield        #45  <Field ParsableByteArray sampleData>
	//    7   15:aload_0         
	//    8   16:new             #47  <Class WebvttCue$Builder>
	//    9   19:dup             
	//   10   20:invokespecial   #48  <Method void WebvttCue$Builder()>
	//   11   23:putfield        #50  <Field WebvttCue$Builder builder>
	//   12   26:return          
	}

	private static Cue parseVttCueBox(ParsableByteArray parsablebytearray, WebvttCue.Builder builder1, int i)
		throws ParserException
	{
		builder1.reset();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #57  <Method void WebvttCue$Builder.reset()>
		while(i > 0) 
	//*   2    4:iload_2         
	//*   3    5:ifle            113
			if(i >= 8)
	//*   4    8:iload_2         
	//*   5    9:bipush          8
	//*   6   11:icmplt          103
			{
				int j = parsablebytearray.readInt();
	//    7   14:aload_0         
	//    8   15:invokevirtual   #61  <Method int ParsableByteArray.readInt()>
	//    9   18:istore_3        
				int k = parsablebytearray.readInt();
	//   10   19:aload_0         
	//   11   20:invokevirtual   #61  <Method int ParsableByteArray.readInt()>
	//   12   23:istore          4
				j -= 8;
	//   13   25:iload_3         
	//   14   26:bipush          8
	//   15   28:isub            
	//   16   29:istore_3        
				String s = new String(parsablebytearray.data, parsablebytearray.getPosition(), j);
	//   17   30:new             #63  <Class String>
	//   18   33:dup             
	//   19   34:aload_0         
	//   20   35:getfield        #67  <Field byte[] ParsableByteArray.data>
	//   21   38:aload_0         
	//   22   39:invokevirtual   #70  <Method int ParsableByteArray.getPosition()>
	//   23   42:iload_3         
	//   24   43:invokespecial   #73  <Method void String(byte[], int, int)>
	//   25   46:astore          5
				parsablebytearray.skipBytes(j);
	//   26   48:aload_0         
	//   27   49:iload_3         
	//   28   50:invokevirtual   #77  <Method void ParsableByteArray.skipBytes(int)>
				j = i - 8 - j;
	//   29   53:iload_2         
	//   30   54:bipush          8
	//   31   56:isub            
	//   32   57:iload_3         
	//   33   58:isub            
	//   34   59:istore_3        
				if(k == TYPE_sttg)
	//*  35   60:iload           4
	//*  36   62:getstatic       #32  <Field int TYPE_sttg>
	//*  37   65:icmpne          79
				{
					WebvttCueParser.parseCueSettingsList(s, builder1);
	//   38   68:aload           5
	//   39   70:aload_1         
	//   40   71:invokestatic    #83  <Method void WebvttCueParser.parseCueSettingsList(String, WebvttCue$Builder)>
					i = j;
	//   41   74:iload_3         
	//   42   75:istore_2        
				} else
	//*  43   76:goto            4
				{
					i = j;
	//   44   79:iload_3         
	//   45   80:istore_2        
					if(k == TYPE_payl)
	//*  46   81:iload           4
	//*  47   83:getstatic       #28  <Field int TYPE_payl>
	//*  48   86:icmpne          4
					{
						WebvttCueParser.parseCueText(s.trim(), builder1);
	//   49   89:aload           5
	//   50   91:invokevirtual   #87  <Method String String.trim()>
	//   51   94:aload_1         
	//   52   95:invokestatic    #90  <Method void WebvttCueParser.parseCueText(String, WebvttCue$Builder)>
						i = j;
	//   53   98:iload_3         
	//   54   99:istore_2        
					}
				}
			} else
	//*  55  100:goto            4
			{
				throw new ParserException("Incomplete vtt cue box header found.");
	//   56  103:new             #54  <Class ParserException>
	//   57  106:dup             
	//   58  107:ldc1            #92  <String "Incomplete vtt cue box header found.">
	//   59  109:invokespecial   #95  <Method void ParserException(String)>
	//   60  112:athrow          
			}
		return ((Cue) (builder1.build()));
	//   61  113:aload_1         
	//   62  114:invokevirtual   #99  <Method WebvttCue WebvttCue$Builder.build()>
	//   63  117:areturn         
	}

	public boolean canParse(String s)
	{
		return "application/x-mp4vtt".equals(((Object) (s)));
	//    0    0:ldc1            #104 <String "application/x-mp4vtt">
	//    1    2:aload_1         
	//    2    3:invokevirtual   #108 <Method boolean String.equals(Object)>
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
	//    4    4:invokevirtual   #113 <Method Mp4WebvttSubtitle parse(byte[], int, int)>
	//    5    7:areturn         
	}

	public Mp4WebvttSubtitle parse(byte abyte0[], int i, int j)
		throws ParserException
	{
		sampleData.reset(abyte0, j + i);
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field ParsableByteArray sampleData>
	//    2    4:aload_1         
	//    3    5:iload_3         
	//    4    6:iload_2         
	//    5    7:iadd            
	//    6    8:invokevirtual   #116 <Method void ParsableByteArray.reset(byte[], int)>
		sampleData.setPosition(i);
	//    7   11:aload_0         
	//    8   12:getfield        #45  <Field ParsableByteArray sampleData>
	//    9   15:iload_2         
	//   10   16:invokevirtual   #119 <Method void ParsableByteArray.setPosition(int)>
		abyte0 = ((byte []) (new ArrayList()));
	//   11   19:new             #121 <Class ArrayList>
	//   12   22:dup             
	//   13   23:invokespecial   #122 <Method void ArrayList()>
	//   14   26:astore_1        
		while(sampleData.bytesLeft() > 0) 
	//*  15   27:aload_0         
	//*  16   28:getfield        #45  <Field ParsableByteArray sampleData>
	//*  17   31:invokevirtual   #125 <Method int ParsableByteArray.bytesLeft()>
	//*  18   34:ifle            119
			if(sampleData.bytesLeft() >= 8)
	//*  19   37:aload_0         
	//*  20   38:getfield        #45  <Field ParsableByteArray sampleData>
	//*  21   41:invokevirtual   #125 <Method int ParsableByteArray.bytesLeft()>
	//*  22   44:bipush          8
	//*  23   46:icmplt          109
			{
				i = sampleData.readInt();
	//   24   49:aload_0         
	//   25   50:getfield        #45  <Field ParsableByteArray sampleData>
	//   26   53:invokevirtual   #61  <Method int ParsableByteArray.readInt()>
	//   27   56:istore_2        
				if(sampleData.readInt() == TYPE_vttc)
	//*  28   57:aload_0         
	//*  29   58:getfield        #45  <Field ParsableByteArray sampleData>
	//*  30   61:invokevirtual   #61  <Method int ParsableByteArray.readInt()>
	//*  31   64:getstatic       #36  <Field int TYPE_vttc>
	//*  32   67:icmpne          95
					((List) (abyte0)).add(((Object) (parseVttCueBox(sampleData, builder, i - 8))));
	//   33   70:aload_1         
	//   34   71:aload_0         
	//   35   72:getfield        #45  <Field ParsableByteArray sampleData>
	//   36   75:aload_0         
	//   37   76:getfield        #50  <Field WebvttCue$Builder builder>
	//   38   79:iload_2         
	//   39   80:bipush          8
	//   40   82:isub            
	//   41   83:invokestatic    #127 <Method Cue parseVttCueBox(ParsableByteArray, WebvttCue$Builder, int)>
	//   42   86:invokeinterface #132 <Method boolean List.add(Object)>
	//   43   91:pop             
				else
	//*  44   92:goto            27
					sampleData.skipBytes(i - 8);
	//   45   95:aload_0         
	//   46   96:getfield        #45  <Field ParsableByteArray sampleData>
	//   47   99:iload_2         
	//   48  100:bipush          8
	//   49  102:isub            
	//   50  103:invokevirtual   #77  <Method void ParsableByteArray.skipBytes(int)>
			} else
	//*  51  106:goto            27
			{
				throw new ParserException("Incomplete Mp4Webvtt Top Level box header found.");
	//   52  109:new             #54  <Class ParserException>
	//   53  112:dup             
	//   54  113:ldc1            #134 <String "Incomplete Mp4Webvtt Top Level box header found.">
	//   55  115:invokespecial   #95  <Method void ParserException(String)>
	//   56  118:athrow          
			}
		return new Mp4WebvttSubtitle(((List) (abyte0)));
	//   57  119:new             #136 <Class Mp4WebvttSubtitle>
	//   58  122:dup             
	//   59  123:aload_1         
	//   60  124:invokespecial   #139 <Method void Mp4WebvttSubtitle(List)>
	//   61  127:areturn         
	}

	private static final int BOX_HEADER_SIZE = 8;
	private static final int TYPE_payl = Util.getIntegerCodeForString("payl");
	private static final int TYPE_sttg = Util.getIntegerCodeForString("sttg");
	private static final int TYPE_vttc = Util.getIntegerCodeForString("vttc");
	private final WebvttCue.Builder builder = new WebvttCue.Builder();
	private final ParsableByteArray sampleData = new ParsableByteArray();

	static 
	{
	//    0    0:ldc1            #20  <String "payl">
	//    1    2:invokestatic    #26  <Method int Util.getIntegerCodeForString(String)>
	//    2    5:putstatic       #28  <Field int TYPE_payl>
	//    3    8:ldc1            #30  <String "sttg">
	//    4   10:invokestatic    #26  <Method int Util.getIntegerCodeForString(String)>
	//    5   13:putstatic       #32  <Field int TYPE_sttg>
	//    6   16:ldc1            #34  <String "vttc">
	//    7   18:invokestatic    #26  <Method int Util.getIntegerCodeForString(String)>
	//    8   21:putstatic       #36  <Field int TYPE_vttc>
	//*   9   24:return          
	}
}
