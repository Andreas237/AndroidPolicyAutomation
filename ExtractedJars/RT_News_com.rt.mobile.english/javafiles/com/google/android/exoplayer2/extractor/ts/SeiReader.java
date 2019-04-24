// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.extractor.ts;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.text.cea.CeaUtil;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.ParsableByteArray;
import java.util.List;

final class SeiReader
{

	public SeiReader(List list)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
		closedCaptionFormats = list;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #16  <Field List closedCaptionFormats>
		outputs = new TrackOutput[list.size()];
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:invokeinterface #22  <Method int List.size()>
	//    8   16:anewarray       TrackOutput[]
	//    9   19:putfield        #26  <Field TrackOutput[] outputs>
	//   10   22:return          
	}

	public void consume(long l, ParsableByteArray parsablebytearray)
	{
		CeaUtil.consume(l, parsablebytearray, outputs);
	//    0    0:lload_1         
	//    1    1:aload_3         
	//    2    2:aload_0         
	//    3    3:getfield        #26  <Field TrackOutput[] outputs>
	//    4    6:invokestatic    #36  <Method void CeaUtil.consume(long, ParsableByteArray, TrackOutput[])>
	//    5    9:return          
	}

	public void createTracks(ExtractorOutput extractoroutput, TsPayloadReader.TrackIdGenerator trackidgenerator)
	{
		for(int i = 0; i < outputs.length; i++)
	//*   0    0:iconst_0        
	//*   1    1:istore_3        
	//*   2    2:iload_3         
	//*   3    3:aload_0         
	//*   4    4:getfield        #26  <Field TrackOutput[] outputs>
	//*   5    7:arraylength     
	//*   6    8:icmpge          188
		{
			trackidgenerator.generateNewId();
	//    7   11:aload_2         
	//    8   12:invokevirtual   #43  <Method void TsPayloadReader$TrackIdGenerator.generateNewId()>
			TrackOutput trackoutput = extractoroutput.track(trackidgenerator.getTrackId(), 3);
	//    9   15:aload_1         
	//   10   16:aload_2         
	//   11   17:invokevirtual   #46  <Method int TsPayloadReader$TrackIdGenerator.getTrackId()>
	//   12   20:iconst_3        
	//   13   21:invokeinterface #52  <Method TrackOutput ExtractorOutput.track(int, int)>
	//   14   26:astore          6
			Format format = (Format)closedCaptionFormats.get(i);
	//   15   28:aload_0         
	//   16   29:getfield        #16  <Field List closedCaptionFormats>
	//   17   32:iload_3         
	//   18   33:invokeinterface #56  <Method Object List.get(int)>
	//   19   38:checkcast       #58  <Class Format>
	//   20   41:astore          7
			String s = format.sampleMimeType;
	//   21   43:aload           7
	//   22   45:getfield        #62  <Field String Format.sampleMimeType>
	//   23   48:astore          8
			boolean flag;
			if(!"application/cea-608".equals(((Object) (s))) && !"application/cea-708".equals(((Object) (s))))
	//*  24   50:ldc1            #64  <String "application/cea-608">
	//*  25   52:aload           8
	//*  26   54:invokevirtual   #70  <Method boolean String.equals(Object)>
	//*  27   57:ifne            79
	//*  28   60:ldc1            #72  <String "application/cea-708">
	//*  29   62:aload           8
	//*  30   64:invokevirtual   #70  <Method boolean String.equals(Object)>
	//*  31   67:ifeq            73
	//*  32   70:goto            79
				flag = false;
	//   33   73:iconst_0        
	//   34   74:istore          4
			else
	//*  35   76:goto            82
				flag = true;
	//   36   79:iconst_1        
	//   37   80:istore          4
			Object obj = ((Object) (new StringBuilder()));
	//   38   82:new             #74  <Class StringBuilder>
	//   39   85:dup             
	//   40   86:invokespecial   #75  <Method void StringBuilder()>
	//   41   89:astore          5
			((StringBuilder) (obj)).append("Invalid closed caption mime type provided: ");
	//   42   91:aload           5
	//   43   93:ldc1            #77  <String "Invalid closed caption mime type provided: ">
	//   44   95:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//   45   98:pop             
			((StringBuilder) (obj)).append(s);
	//   46   99:aload           5
	//   47  101:aload           8
	//   48  103:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//   49  106:pop             
			Assertions.checkArgument(flag, ((Object) (((StringBuilder) (obj)).toString())));
	//   50  107:iload           4
	//   51  109:aload           5
	//   52  111:invokevirtual   #85  <Method String StringBuilder.toString()>
	//   53  114:invokestatic    #91  <Method void Assertions.checkArgument(boolean, Object)>
			if(format.id != null)
	//*  54  117:aload           7
	//*  55  119:getfield        #94  <Field String Format.id>
	//*  56  122:ifnull          135
				obj = ((Object) (format.id));
	//   57  125:aload           7
	//   58  127:getfield        #94  <Field String Format.id>
	//   59  130:astore          5
			else
	//*  60  132:goto            141
				obj = ((Object) (trackidgenerator.getFormatId()));
	//   61  135:aload_2         
	//   62  136:invokevirtual   #97  <Method String TsPayloadReader$TrackIdGenerator.getFormatId()>
	//   63  139:astore          5
			trackoutput.format(Format.createTextSampleFormat(((String) (obj)), s, ((String) (null)), -1, format.selectionFlags, format.language, format.accessibilityChannel, ((com.google.android.exoplayer2.drm.DrmInitData) (null))));
	//   64  141:aload           6
	//   65  143:aload           5
	//   66  145:aload           8
	//   67  147:aconst_null     
	//   68  148:iconst_m1       
	//   69  149:aload           7
	//   70  151:getfield        #101 <Field int Format.selectionFlags>
	//   71  154:aload           7
	//   72  156:getfield        #104 <Field String Format.language>
	//   73  159:aload           7
	//   74  161:getfield        #107 <Field int Format.accessibilityChannel>
	//   75  164:aconst_null     
	//   76  165:invokestatic    #111 <Method Format Format.createTextSampleFormat(String, String, String, int, int, String, int, com.google.android.exoplayer2.drm.DrmInitData)>
	//   77  168:invokeinterface #115 <Method void TrackOutput.format(Format)>
			outputs[i] = trackoutput;
	//   78  173:aload_0         
	//   79  174:getfield        #26  <Field TrackOutput[] outputs>
	//   80  177:iload_3         
	//   81  178:aload           6
	//   82  180:aastore         
		}

	//   83  181:iload_3         
	//   84  182:iconst_1        
	//   85  183:iadd            
	//   86  184:istore_3        
	//*  87  185:goto            2
	//   88  188:return          
	}

	private final List closedCaptionFormats;
	private final TrackOutput outputs[];
}
