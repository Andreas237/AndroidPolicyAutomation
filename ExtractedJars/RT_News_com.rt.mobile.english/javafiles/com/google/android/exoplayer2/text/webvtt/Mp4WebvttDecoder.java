// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.text.webvtt;

import com.google.android.exoplayer2.text.*;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import java.util.*;

// Referenced classes of package com.google.android.exoplayer2.text.webvtt:
//			WebvttCueParser, Mp4WebvttSubtitle

public final class Mp4WebvttDecoder extends SimpleSubtitleDecoder
{

	public Mp4WebvttDecoder()
	{
		super("Mp4WebvttDecoder");
	//    0    0:aload_0         
	//    1    1:ldc1            #38  <String "Mp4WebvttDecoder">
	//    2    3:invokespecial   #41  <Method void SimpleSubtitleDecoder(String)>
	//    3    6:aload_0         
	//    4    7:new             #43  <Class ParsableByteArray>
	//    5   10:dup             
	//    6   11:invokespecial   #45  <Method void ParsableByteArray()>
	//    7   14:putfield        #47  <Field ParsableByteArray sampleData>
	//    8   17:aload_0         
	//    9   18:new             #49  <Class WebvttCue$Builder>
	//   10   21:dup             
	//   11   22:invokespecial   #50  <Method void WebvttCue$Builder()>
	//   12   25:putfield        #52  <Field WebvttCue$Builder builder>
	//   13   28:return          
	}

	private static Cue parseVttCueBox(ParsableByteArray parsablebytearray, WebvttCue.Builder builder1, int i)
		throws SubtitleDecoderException
	{
		builder1.reset();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #59  <Method void WebvttCue$Builder.reset()>
		do
		{
			if(i <= 0)
				break;
	//    2    4:iload_2         
	//    3    5:ifle            113
			if(i < 8)
	//*   4    8:iload_2         
	//*   5    9:bipush          8
	//*   6   11:icmpge          24
				throw new SubtitleDecoderException("Incomplete vtt cue box header found.");
	//    7   14:new             #56  <Class SubtitleDecoderException>
	//    8   17:dup             
	//    9   18:ldc1            #61  <String "Incomplete vtt cue box header found.">
	//   10   20:invokespecial   #62  <Method void SubtitleDecoderException(String)>
	//   11   23:athrow          
			int j = parsablebytearray.readInt();
	//   12   24:aload_0         
	//   13   25:invokevirtual   #66  <Method int ParsableByteArray.readInt()>
	//   14   28:istore_3        
			int k = parsablebytearray.readInt();
	//   15   29:aload_0         
	//   16   30:invokevirtual   #66  <Method int ParsableByteArray.readInt()>
	//   17   33:istore          4
			j -= 8;
	//   18   35:iload_3         
	//   19   36:bipush          8
	//   20   38:isub            
	//   21   39:istore_3        
			String s = Util.fromUtf8Bytes(parsablebytearray.data, parsablebytearray.getPosition(), j);
	//   22   40:aload_0         
	//   23   41:getfield        #70  <Field byte[] ParsableByteArray.data>
	//   24   44:aload_0         
	//   25   45:invokevirtual   #73  <Method int ParsableByteArray.getPosition()>
	//   26   48:iload_3         
	//   27   49:invokestatic    #77  <Method String Util.fromUtf8Bytes(byte[], int, int)>
	//   28   52:astore          5
			parsablebytearray.skipBytes(j);
	//   29   54:aload_0         
	//   30   55:iload_3         
	//   31   56:invokevirtual   #81  <Method void ParsableByteArray.skipBytes(int)>
			j = i - 8 - j;
	//   32   59:iload_2         
	//   33   60:bipush          8
	//   34   62:isub            
	//   35   63:iload_3         
	//   36   64:isub            
	//   37   65:istore_3        
			if(k == TYPE_sttg)
	//*  38   66:iload           4
	//*  39   68:getstatic       #30  <Field int TYPE_sttg>
	//*  40   71:icmpne          85
			{
				WebvttCueParser.parseCueSettingsList(s, builder1);
	//   41   74:aload           5
	//   42   76:aload_1         
	//   43   77:invokestatic    #87  <Method void WebvttCueParser.parseCueSettingsList(String, WebvttCue$Builder)>
				i = j;
	//   44   80:iload_3         
	//   45   81:istore_2        
			} else
	//*  46   82:goto            4
			{
				i = j;
	//   47   85:iload_3         
	//   48   86:istore_2        
				if(k == TYPE_payl)
	//*  49   87:iload           4
	//*  50   89:getstatic       #26  <Field int TYPE_payl>
	//*  51   92:icmpne          4
				{
					WebvttCueParser.parseCueText(((String) (null)), s.trim(), builder1, Collections.emptyList());
	//   52   95:aconst_null     
	//   53   96:aload           5
	//   54   98:invokevirtual   #93  <Method String String.trim()>
	//   55  101:aload_1         
	//   56  102:invokestatic    #99  <Method List Collections.emptyList()>
	//   57  105:invokestatic    #103 <Method void WebvttCueParser.parseCueText(String, String, WebvttCue$Builder, List)>
					i = j;
	//   58  108:iload_3         
	//   59  109:istore_2        
				}
			}
		} while(true);
	//   60  110:goto            4
		return ((Cue) (builder1.build()));
	//   61  113:aload_1         
	//   62  114:invokevirtual   #107 <Method WebvttCue WebvttCue$Builder.build()>
	//   63  117:areturn         
	}

	protected volatile Subtitle decode(byte abyte0[], int i, boolean flag)
		throws SubtitleDecoderException
	{
		return ((Subtitle) (decode(abyte0, i, flag)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:invokevirtual   #113 <Method Mp4WebvttSubtitle decode(byte[], int, boolean)>
	//    5    7:areturn         
	}

	protected Mp4WebvttSubtitle decode(byte abyte0[], int i, boolean flag)
		throws SubtitleDecoderException
	{
		sampleData.reset(abyte0, i);
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field ParsableByteArray sampleData>
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:invokevirtual   #116 <Method void ParsableByteArray.reset(byte[], int)>
		abyte0 = ((byte []) (new ArrayList()));
	//    5    9:new             #118 <Class ArrayList>
	//    6   12:dup             
	//    7   13:invokespecial   #119 <Method void ArrayList()>
	//    8   16:astore_1        
		while(sampleData.bytesLeft() > 0) 
	//*   9   17:aload_0         
	//*  10   18:getfield        #47  <Field ParsableByteArray sampleData>
	//*  11   21:invokevirtual   #122 <Method int ParsableByteArray.bytesLeft()>
	//*  12   24:ifle            109
		{
			if(sampleData.bytesLeft() < 8)
	//*  13   27:aload_0         
	//*  14   28:getfield        #47  <Field ParsableByteArray sampleData>
	//*  15   31:invokevirtual   #122 <Method int ParsableByteArray.bytesLeft()>
	//*  16   34:bipush          8
	//*  17   36:icmpge          49
				throw new SubtitleDecoderException("Incomplete Mp4Webvtt Top Level box header found.");
	//   18   39:new             #56  <Class SubtitleDecoderException>
	//   19   42:dup             
	//   20   43:ldc1            #124 <String "Incomplete Mp4Webvtt Top Level box header found.">
	//   21   45:invokespecial   #62  <Method void SubtitleDecoderException(String)>
	//   22   48:athrow          
			i = sampleData.readInt();
	//   23   49:aload_0         
	//   24   50:getfield        #47  <Field ParsableByteArray sampleData>
	//   25   53:invokevirtual   #66  <Method int ParsableByteArray.readInt()>
	//   26   56:istore_2        
			if(sampleData.readInt() == TYPE_vttc)
	//*  27   57:aload_0         
	//*  28   58:getfield        #47  <Field ParsableByteArray sampleData>
	//*  29   61:invokevirtual   #66  <Method int ParsableByteArray.readInt()>
	//*  30   64:getstatic       #34  <Field int TYPE_vttc>
	//*  31   67:icmpne          95
				((List) (abyte0)).add(((Object) (parseVttCueBox(sampleData, builder, i - 8))));
	//   32   70:aload_1         
	//   33   71:aload_0         
	//   34   72:getfield        #47  <Field ParsableByteArray sampleData>
	//   35   75:aload_0         
	//   36   76:getfield        #52  <Field WebvttCue$Builder builder>
	//   37   79:iload_2         
	//   38   80:bipush          8
	//   39   82:isub            
	//   40   83:invokestatic    #126 <Method Cue parseVttCueBox(ParsableByteArray, WebvttCue$Builder, int)>
	//   41   86:invokeinterface #132 <Method boolean List.add(Object)>
	//   42   91:pop             
			else
	//*  43   92:goto            17
				sampleData.skipBytes(i - 8);
	//   44   95:aload_0         
	//   45   96:getfield        #47  <Field ParsableByteArray sampleData>
	//   46   99:iload_2         
	//   47  100:bipush          8
	//   48  102:isub            
	//   49  103:invokevirtual   #81  <Method void ParsableByteArray.skipBytes(int)>
		}
	//*  50  106:goto            17
		return new Mp4WebvttSubtitle(((List) (abyte0)));
	//   51  109:new             #134 <Class Mp4WebvttSubtitle>
	//   52  112:dup             
	//   53  113:aload_1         
	//   54  114:invokespecial   #137 <Method void Mp4WebvttSubtitle(List)>
	//   55  117:areturn         
	}

	private static final int BOX_HEADER_SIZE = 8;
	private static final int TYPE_payl = Util.getIntegerCodeForString("payl");
	private static final int TYPE_sttg = Util.getIntegerCodeForString("sttg");
	private static final int TYPE_vttc = Util.getIntegerCodeForString("vttc");
	private final WebvttCue.Builder builder = new WebvttCue.Builder();
	private final ParsableByteArray sampleData = new ParsableByteArray();

	static 
	{
	//    0    0:ldc1            #18  <String "payl">
	//    1    2:invokestatic    #24  <Method int Util.getIntegerCodeForString(String)>
	//    2    5:putstatic       #26  <Field int TYPE_payl>
	//    3    8:ldc1            #28  <String "sttg">
	//    4   10:invokestatic    #24  <Method int Util.getIntegerCodeForString(String)>
	//    5   13:putstatic       #30  <Field int TYPE_sttg>
	//    6   16:ldc1            #32  <String "vttc">
	//    7   18:invokestatic    #24  <Method int Util.getIntegerCodeForString(String)>
	//    8   21:putstatic       #34  <Field int TYPE_vttc>
	//*   9   24:return          
	}
}
