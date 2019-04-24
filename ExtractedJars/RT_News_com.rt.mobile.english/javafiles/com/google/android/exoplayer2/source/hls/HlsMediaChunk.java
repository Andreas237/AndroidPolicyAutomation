// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.source.hls;

import android.util.Pair;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.extractor.*;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.id3.Id3Decoder;
import com.google.android.exoplayer2.metadata.id3.PrivFrame;
import com.google.android.exoplayer2.source.chunk.MediaChunk;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.util.*;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.google.android.exoplayer2.source.hls:
//			Aes128DataSource, HlsExtractorFactory, HlsSampleStreamWrapper

final class HlsMediaChunk extends MediaChunk
{

	public HlsMediaChunk(HlsExtractorFactory hlsextractorfactory, DataSource datasource, DataSpec dataspec, DataSpec dataspec1, com.google.android.exoplayer2.source.hls.playlist.HlsMasterPlaylist.HlsUrl hlsurl, List list, int i, 
			Object obj, long l, long l1, long l2, 
			int j, boolean flag, boolean flag1, TimestampAdjuster timestampadjuster, HlsMediaChunk hlsmediachunk, DrmInitData drminitdata, byte abyte0[], 
			byte abyte1[])
	{
		super(buildDataSource(datasource, abyte0, abyte1), dataspec, hlsurl.format, i, obj, l, l1, l2);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:aload           21
	//    3    4:aload           22
	//    4    6:invokestatic    #57  <Method DataSource buildDataSource(DataSource, byte[], byte[])>
	//    5    9:aload_3         
	//    6   10:aload           5
	//    7   12:getfield        #63  <Field com.google.android.exoplayer2.Format com.google.android.exoplayer2.source.hls.playlist.HlsMasterPlaylist$HlsUrl.format>
	//    8   15:iload           7
	//    9   17:aload           8
	//   10   19:lload           9
	//   11   21:lload           11
	//   12   23:lload           13
	//   13   25:invokespecial   #66  <Method void MediaChunk(DataSource, DataSpec, com.google.android.exoplayer2.Format, int, Object, long, long, long)>
		discontinuitySequenceNumber = j;
	//   14   28:aload_0         
	//   15   29:iload           15
	//   16   31:putfield        #68  <Field int discontinuitySequenceNumber>
		initDataSpec = dataspec1;
	//   17   34:aload_0         
	//   18   35:aload           4
	//   19   37:putfield        #70  <Field DataSpec initDataSpec>
		hlsUrl = hlsurl;
	//   20   40:aload_0         
	//   21   41:aload           5
	//   22   43:putfield        #72  <Field com.google.android.exoplayer2.source.hls.playlist.HlsMasterPlaylist$HlsUrl hlsUrl>
		isMasterTimestampSource = flag1;
	//   23   46:aload_0         
	//   24   47:iload           17
	//   25   49:putfield        #74  <Field boolean isMasterTimestampSource>
		timestampAdjuster = timestampadjuster;
	//   26   52:aload_0         
	//   27   53:aload           18
	//   28   55:putfield        #76  <Field TimestampAdjuster timestampAdjuster>
		isEncrypted = dataSource instanceof Aes128DataSource;
	//   29   58:aload_0         
	//   30   59:aload_0         
	//   31   60:getfield        #79  <Field DataSource dataSource>
	//   32   63:instanceof      #81  <Class Aes128DataSource>
	//   33   66:putfield        #83  <Field boolean isEncrypted>
		hasGapTag = flag;
	//   34   69:aload_0         
	//   35   70:iload           16
	//   36   72:putfield        #85  <Field boolean hasGapTag>
		flag1 = true;
	//   37   75:iconst_1        
	//   38   76:istore          17
		if(hlsmediachunk != null)
	//*  39   78:aload           19
	//*  40   80:ifnull          144
		{
			if(hlsmediachunk.hlsUrl != hlsurl)
	//*  41   83:aload           19
	//*  42   85:getfield        #72  <Field com.google.android.exoplayer2.source.hls.playlist.HlsMasterPlaylist$HlsUrl hlsUrl>
	//*  43   88:aload           5
	//*  44   90:if_acmpeq       99
				flag = true;
	//   45   93:iconst_1        
	//   46   94:istore          16
			else
	//*  47   96:goto            102
				flag = false;
	//   48   99:iconst_0        
	//   49  100:istore          16
			shouldSpliceIn = flag;
	//   50  102:aload_0         
	//   51  103:iload           16
	//   52  105:putfield        #87  <Field boolean shouldSpliceIn>
			if(hlsmediachunk.discontinuitySequenceNumber == j && !shouldSpliceIn)
	//*  53  108:aload           19
	//*  54  110:getfield        #68  <Field int discontinuitySequenceNumber>
	//*  55  113:iload           15
	//*  56  115:icmpne          138
	//*  57  118:aload_0         
	//*  58  119:getfield        #87  <Field boolean shouldSpliceIn>
	//*  59  122:ifeq            128
	//*  60  125:goto            138
				hlsurl = ((com.google.android.exoplayer2.source.hls.playlist.HlsMasterPlaylist.HlsUrl) (hlsmediachunk.extractor));
	//   61  128:aload           19
	//   62  130:getfield        #89  <Field Extractor extractor>
	//   63  133:astore          5
			else
	//*  64  135:goto            141
				hlsurl = null;
	//   65  138:aconst_null     
	//   66  139:astore          5
		} else
	//*  67  141:goto            152
		{
			shouldSpliceIn = false;
	//   68  144:aload_0         
	//   69  145:iconst_0        
	//   70  146:putfield        #87  <Field boolean shouldSpliceIn>
			hlsurl = null;
	//   71  149:aconst_null     
	//   72  150:astore          5
		}
		hlsextractorfactory = ((HlsExtractorFactory) (hlsextractorfactory.createExtractor(((Extractor) (hlsurl)), dataspec.uri, trackFormat, list, drminitdata, timestampadjuster)));
	//   73  152:aload_1         
	//   74  153:aload           5
	//   75  155:aload_3         
	//   76  156:getfield        #95  <Field android.net.Uri DataSpec.uri>
	//   77  159:aload_0         
	//   78  160:getfield        #98  <Field com.google.android.exoplayer2.Format trackFormat>
	//   79  163:aload           6
	//   80  165:aload           20
	//   81  167:aload           18
	//   82  169:invokeinterface #104 <Method Pair HlsExtractorFactory.createExtractor(Extractor, android.net.Uri, com.google.android.exoplayer2.Format, List, DrmInitData, TimestampAdjuster)>
	//   83  174:astore_1        
		extractor = (Extractor)((Pair) (hlsextractorfactory)).first;
	//   84  175:aload_0         
	//   85  176:aload_1         
	//   86  177:getfield        #110 <Field Object Pair.first>
	//   87  180:checkcast       #112 <Class Extractor>
	//   88  183:putfield        #89  <Field Extractor extractor>
		isPackedAudioExtractor = ((Boolean)((Pair) (hlsextractorfactory)).second).booleanValue();
	//   89  186:aload_0         
	//   90  187:aload_1         
	//   91  188:getfield        #115 <Field Object Pair.second>
	//   92  191:checkcast       #117 <Class Boolean>
	//   93  194:invokevirtual   #121 <Method boolean Boolean.booleanValue()>
	//   94  197:putfield        #123 <Field boolean isPackedAudioExtractor>
		if(extractor == hlsurl)
	//*  95  200:aload_0         
	//*  96  201:getfield        #89  <Field Extractor extractor>
	//*  97  204:aload           5
	//*  98  206:if_acmpne       215
			flag = true;
	//   99  209:iconst_1        
	//  100  210:istore          16
		else
	//* 101  212:goto            218
			flag = false;
	//  102  215:iconst_0        
	//  103  216:istore          16
		reusingExtractor = flag;
	//  104  218:aload_0         
	//  105  219:iload           16
	//  106  221:putfield        #125 <Field boolean reusingExtractor>
		if(reusingExtractor && dataspec1 != null)
	//* 107  224:aload_0         
	//* 108  225:getfield        #125 <Field boolean reusingExtractor>
	//* 109  228:ifeq            243
	//* 110  231:aload           4
	//* 111  233:ifnull          243
			flag = flag1;
	//  112  236:iload           17
	//  113  238:istore          16
		else
	//* 114  240:goto            246
			flag = false;
	//  115  243:iconst_0        
	//  116  244:istore          16
		initLoadCompleted = flag;
	//  117  246:aload_0         
	//  118  247:iload           16
	//  119  249:putfield        #127 <Field boolean initLoadCompleted>
		if(isPackedAudioExtractor)
	//* 120  252:aload_0         
	//* 121  253:getfield        #123 <Field boolean isPackedAudioExtractor>
	//* 122  256:ifeq            320
		{
			if(hlsmediachunk != null && hlsmediachunk.id3Data != null)
	//* 123  259:aload           19
	//* 124  261:ifnull          293
	//* 125  264:aload           19
	//* 126  266:getfield        #129 <Field ParsableByteArray id3Data>
	//* 127  269:ifnull          293
			{
				id3Decoder = hlsmediachunk.id3Decoder;
	//  128  272:aload_0         
	//  129  273:aload           19
	//  130  275:getfield        #131 <Field Id3Decoder id3Decoder>
	//  131  278:putfield        #131 <Field Id3Decoder id3Decoder>
				id3Data = hlsmediachunk.id3Data;
	//  132  281:aload_0         
	//  133  282:aload           19
	//  134  284:getfield        #129 <Field ParsableByteArray id3Data>
	//  135  287:putfield        #129 <Field ParsableByteArray id3Data>
			} else
	//* 136  290:goto            330
			{
				id3Decoder = new Id3Decoder();
	//  137  293:aload_0         
	//  138  294:new             #133 <Class Id3Decoder>
	//  139  297:dup             
	//  140  298:invokespecial   #134 <Method void Id3Decoder()>
	//  141  301:putfield        #131 <Field Id3Decoder id3Decoder>
				id3Data = new ParsableByteArray(10);
	//  142  304:aload_0         
	//  143  305:new             #136 <Class ParsableByteArray>
	//  144  308:dup             
	//  145  309:bipush          10
	//  146  311:invokespecial   #139 <Method void ParsableByteArray(int)>
	//  147  314:putfield        #129 <Field ParsableByteArray id3Data>
			}
		} else
	//* 148  317:goto            330
		{
			id3Decoder = null;
	//  149  320:aload_0         
	//  150  321:aconst_null     
	//  151  322:putfield        #131 <Field Id3Decoder id3Decoder>
			id3Data = null;
	//  152  325:aload_0         
	//  153  326:aconst_null     
	//  154  327:putfield        #129 <Field ParsableByteArray id3Data>
		}
		initDataSource = datasource;
	//  155  330:aload_0         
	//  156  331:aload_2         
	//  157  332:putfield        #141 <Field DataSource initDataSource>
		uid = uidSource.getAndIncrement();
	//  158  335:aload_0         
	//  159  336:getstatic       #51  <Field AtomicInteger uidSource>
	//  160  339:invokevirtual   #145 <Method int AtomicInteger.getAndIncrement()>
	//  161  342:putfield        #147 <Field int uid>
	//  162  345:return          
	}

	private static DataSource buildDataSource(DataSource datasource, byte abyte0[], byte abyte1[])
	{
		if(abyte0 != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          15
			return ((DataSource) (new Aes128DataSource(datasource, abyte0, abyte1)));
	//    2    4:new             #81  <Class Aes128DataSource>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:aload_2         
	//    7   11:invokespecial   #152 <Method void Aes128DataSource(DataSource, byte[], byte[])>
	//    8   14:areturn         
		else
			return datasource;
	//    9   15:aload_0         
	//   10   16:areturn         
	}

	private void loadMedia()
		throws IOException, InterruptedException
	{
		boolean flag;
		boolean flag1;
		Object obj;
label0:
		{
			boolean flag2 = isEncrypted;
	//    0    0:aload_0         
	//    1    1:getfield        #83  <Field boolean isEncrypted>
	//    2    4:istore          4
			flag1 = false;
	//    3    6:iconst_0        
	//    4    7:istore_3        
			if(flag2)
	//*   5    8:iload           4
	//*   6   10:ifeq            39
			{
				DataSpec dataspec = dataSpec;
	//    7   13:aload_0         
	//    8   14:getfield        #160 <Field DataSpec dataSpec>
	//    9   17:astore          8
				obj = ((Object) (dataspec));
	//   10   19:aload           8
	//   11   21:astore          7
				if(bytesLoaded != 0)
	//*  12   23:aload_0         
	//*  13   24:getfield        #162 <Field int bytesLoaded>
	//*  14   27:ifeq            53
				{
					flag = true;
	//   15   30:iconst_1        
	//   16   31:istore_1        
					obj = ((Object) (dataspec));
	//   17   32:aload           8
	//   18   34:astore          7
					break label0;
	//   19   36:goto            55
				}
			} else
			{
				obj = ((Object) (dataSpec.subrange(bytesLoaded)));
	//   20   39:aload_0         
	//   21   40:getfield        #160 <Field DataSpec dataSpec>
	//   22   43:aload_0         
	//   23   44:getfield        #162 <Field int bytesLoaded>
	//   24   47:i2l             
	//   25   48:invokevirtual   #166 <Method DataSpec DataSpec.subrange(long)>
	//   26   51:astore          7
			}
			flag = false;
	//   27   53:iconst_0        
	//   28   54:istore_1        
		}
		if(!isMasterTimestampSource)
	//*  29   55:aload_0         
	//*  30   56:getfield        #74  <Field boolean isMasterTimestampSource>
	//*  31   59:ifne            72
			timestampAdjuster.waitUntilInitialized();
	//   32   62:aload_0         
	//   33   63:getfield        #76  <Field TimestampAdjuster timestampAdjuster>
	//   34   66:invokevirtual   #171 <Method void TimestampAdjuster.waitUntilInitialized()>
		else
	//*  35   69:goto            97
		if(timestampAdjuster.getFirstSampleTimestampUs() == 0xffffffffL)
	//*  36   72:aload_0         
	//*  37   73:getfield        #76  <Field TimestampAdjuster timestampAdjuster>
	//*  38   76:invokevirtual   #175 <Method long TimestampAdjuster.getFirstSampleTimestampUs()>
	//*  39   79:ldc2w           #176 <Long 0xffffffffL>
	//*  40   82:lcmp            
	//*  41   83:ifne            97
			timestampAdjuster.setFirstSampleTimestampUs(startTimeUs);
	//   42   86:aload_0         
	//   43   87:getfield        #76  <Field TimestampAdjuster timestampAdjuster>
	//   44   90:aload_0         
	//   45   91:getfield        #181 <Field long startTimeUs>
	//   46   94:invokevirtual   #185 <Method void TimestampAdjuster.setFirstSampleTimestampUs(long)>
		long l;
		HlsSampleStreamWrapper hlssamplestreamwrapper;
		obj = ((Object) (new DefaultExtractorInput(dataSource, ((DataSpec) (obj)).absoluteStreamPosition, dataSource.open(((DataSpec) (obj))))));
	//   47   97:new             #187 <Class DefaultExtractorInput>
	//   48  100:dup             
	//   49  101:aload_0         
	//   50  102:getfield        #79  <Field DataSource dataSource>
	//   51  105:aload           7
	//   52  107:getfield        #190 <Field long DataSpec.absoluteStreamPosition>
	//   53  110:aload_0         
	//   54  111:getfield        #79  <Field DataSource dataSource>
	//   55  114:aload           7
	//   56  116:invokeinterface #196 <Method long DataSource.open(DataSpec)>
	//   57  121:invokespecial   #199 <Method void DefaultExtractorInput(DataSource, long, long)>
	//   58  124:astore          7
		if(!isPackedAudioExtractor || id3TimestampPeeked)
			break MISSING_BLOCK_LABEL_195;
	//   59  126:aload_0         
	//   60  127:getfield        #123 <Field boolean isPackedAudioExtractor>
	//   61  130:ifeq            195
	//   62  133:aload_0         
	//   63  134:getfield        #201 <Field boolean id3TimestampPeeked>
	//   64  137:ifne            195
		l = peekId3PrivTimestamp(((ExtractorInput) (obj)));
	//   65  140:aload_0         
	//   66  141:aload           7
	//   67  143:invokespecial   #205 <Method long peekId3PrivTimestamp(ExtractorInput)>
	//   68  146:lstore          5
		id3TimestampPeeked = true;
	//   69  148:aload_0         
	//   70  149:iconst_1        
	//   71  150:putfield        #201 <Field boolean id3TimestampPeeked>
		hlssamplestreamwrapper = output;
	//   72  153:aload_0         
	//   73  154:getfield        #207 <Field HlsSampleStreamWrapper output>
	//   74  157:astore          8
		if(l == 0x1L)
			break MISSING_BLOCK_LABEL_182;
	//   75  159:lload           5
	//   76  161:ldc2w           #208 <Long 0x1L>
	//   77  164:lcmp            
	//   78  165:ifeq            182
		l = timestampAdjuster.adjustTsTimestamp(l);
	//   79  168:aload_0         
	//   80  169:getfield        #76  <Field TimestampAdjuster timestampAdjuster>
	//   81  172:lload           5
	//   82  174:invokevirtual   #213 <Method long TimestampAdjuster.adjustTsTimestamp(long)>
	//   83  177:lstore          5
		break MISSING_BLOCK_LABEL_188;
	//   84  179:goto            188
		l = startTimeUs;
	//   85  182:aload_0         
	//   86  183:getfield        #181 <Field long startTimeUs>
	//   87  186:lstore          5
		hlssamplestreamwrapper.setSampleOffsetUs(l);
	//   88  188:aload           8
	//   89  190:lload           5
	//   90  192:invokevirtual   #218 <Method void HlsSampleStreamWrapper.setSampleOffsetUs(long)>
		int i;
		i = ((int) (flag1));
	//   91  195:iload_3         
	//   92  196:istore_2        
		if(!flag)
			break MISSING_BLOCK_LABEL_214;
	//   93  197:iload_1         
	//   94  198:ifeq            214
		((ExtractorInput) (obj)).skipFully(bytesLoaded);
	//   95  201:aload           7
	//   96  203:aload_0         
	//   97  204:getfield        #162 <Field int bytesLoaded>
	//   98  207:invokeinterface #223 <Method void ExtractorInput.skipFully(int)>
		i = ((int) (flag1));
	//   99  212:iload_3         
	//  100  213:istore_2        
_L2:
		if(i != 0)
			break MISSING_BLOCK_LABEL_266;
	//  101  214:iload_2         
	//  102  215:ifne            266
		if(loadCanceled)
			break MISSING_BLOCK_LABEL_266;
	//  103  218:aload_0         
	//  104  219:getfield        #225 <Field boolean loadCanceled>
	//  105  222:ifne            266
		i = extractor.read(((ExtractorInput) (obj)), ((com.google.android.exoplayer2.extractor.PositionHolder) (null)));
	//  106  225:aload_0         
	//  107  226:getfield        #89  <Field Extractor extractor>
	//  108  229:aload           7
	//  109  231:aconst_null     
	//  110  232:invokeinterface #229 <Method int Extractor.read(ExtractorInput, com.google.android.exoplayer2.extractor.PositionHolder)>
	//  111  237:istore_2        
		if(true) goto _L2; else goto _L1
	//  112  238:goto            214
_L1:
		Exception exception1;
		exception1;
	//  113  241:astore          8
		bytesLoaded = (int)(((ExtractorInput) (obj)).getPosition() - dataSpec.absoluteStreamPosition);
	//  114  243:aload_0         
	//  115  244:aload           7
	//  116  246:invokeinterface #232 <Method long ExtractorInput.getPosition()>
	//  117  251:aload_0         
	//  118  252:getfield        #160 <Field DataSpec dataSpec>
	//  119  255:getfield        #190 <Field long DataSpec.absoluteStreamPosition>
	//  120  258:lsub            
	//  121  259:l2i             
	//  122  260:putfield        #162 <Field int bytesLoaded>
		throw exception1;
	//  123  263:aload           8
	//  124  265:athrow          
		bytesLoaded = (int)(((ExtractorInput) (obj)).getPosition() - dataSpec.absoluteStreamPosition);
	//  125  266:aload_0         
	//  126  267:aload           7
	//  127  269:invokeinterface #232 <Method long ExtractorInput.getPosition()>
	//  128  274:aload_0         
	//  129  275:getfield        #160 <Field DataSpec dataSpec>
	//  130  278:getfield        #190 <Field long DataSpec.absoluteStreamPosition>
	//  131  281:lsub            
	//  132  282:l2i             
	//  133  283:putfield        #162 <Field int bytesLoaded>
		Util.closeQuietly(dataSource);
	//  134  286:aload_0         
	//  135  287:getfield        #79  <Field DataSource dataSource>
	//  136  290:invokestatic    #238 <Method void Util.closeQuietly(DataSource)>
		return;
	//  137  293:return          
		Exception exception;
		exception;
	//  138  294:astore          7
		Util.closeQuietly(dataSource);
	//  139  296:aload_0         
	//  140  297:getfield        #79  <Field DataSource dataSource>
	//  141  300:invokestatic    #238 <Method void Util.closeQuietly(DataSource)>
		throw exception;
	//  142  303:aload           7
	//  143  305:athrow          
	}

	private void maybeLoadInitData()
		throws IOException, InterruptedException
	{
		Object obj;
		if(initLoadCompleted)
			break MISSING_BLOCK_LABEL_146;
	//    0    0:aload_0         
	//    1    1:getfield        #127 <Field boolean initLoadCompleted>
	//    2    4:ifne            146
		if(initDataSpec == null)
	//*   3    7:aload_0         
	//*   4    8:getfield        #70  <Field DataSpec initDataSpec>
	//*   5   11:ifnonnull       15
			return;
	//    6   14:return          
		obj = ((Object) (initDataSpec.subrange(initSegmentBytesLoaded)));
	//    7   15:aload_0         
	//    8   16:getfield        #70  <Field DataSpec initDataSpec>
	//    9   19:aload_0         
	//   10   20:getfield        #242 <Field int initSegmentBytesLoaded>
	//   11   23:i2l             
	//   12   24:invokevirtual   #166 <Method DataSpec DataSpec.subrange(long)>
	//   13   27:astore_2        
		obj = ((Object) (new DefaultExtractorInput(initDataSource, ((DataSpec) (obj)).absoluteStreamPosition, initDataSource.open(((DataSpec) (obj))))));
	//   14   28:new             #187 <Class DefaultExtractorInput>
	//   15   31:dup             
	//   16   32:aload_0         
	//   17   33:getfield        #141 <Field DataSource initDataSource>
	//   18   36:aload_2         
	//   19   37:getfield        #190 <Field long DataSpec.absoluteStreamPosition>
	//   20   40:aload_0         
	//   21   41:getfield        #141 <Field DataSource initDataSource>
	//   22   44:aload_2         
	//   23   45:invokeinterface #196 <Method long DataSource.open(DataSpec)>
	//   24   50:invokespecial   #199 <Method void DefaultExtractorInput(DataSource, long, long)>
	//   25   53:astore_2        
		int i = 0;
	//   26   54:iconst_0        
	//   27   55:istore_1        
_L2:
		if(i != 0)
			break; /* Loop/switch isn't completed */
	//   28   56:iload_1         
	//   29   57:ifne            104
		if(loadCanceled)
			break; /* Loop/switch isn't completed */
	//   30   60:aload_0         
	//   31   61:getfield        #225 <Field boolean loadCanceled>
	//   32   64:ifne            104
		i = extractor.read(((ExtractorInput) (obj)), ((com.google.android.exoplayer2.extractor.PositionHolder) (null)));
	//   33   67:aload_0         
	//   34   68:getfield        #89  <Field Extractor extractor>
	//   35   71:aload_2         
	//   36   72:aconst_null     
	//   37   73:invokeinterface #229 <Method int Extractor.read(ExtractorInput, com.google.android.exoplayer2.extractor.PositionHolder)>
	//   38   78:istore_1        
		if(true) goto _L2; else goto _L1
	//   39   79:goto            56
		Exception exception1;
		exception1;
	//   40   82:astore_3        
		initSegmentBytesLoaded = (int)(((ExtractorInput) (obj)).getPosition() - initDataSpec.absoluteStreamPosition);
	//   41   83:aload_0         
	//   42   84:aload_2         
	//   43   85:invokeinterface #232 <Method long ExtractorInput.getPosition()>
	//   44   90:aload_0         
	//   45   91:getfield        #70  <Field DataSpec initDataSpec>
	//   46   94:getfield        #190 <Field long DataSpec.absoluteStreamPosition>
	//   47   97:lsub            
	//   48   98:l2i             
	//   49   99:putfield        #242 <Field int initSegmentBytesLoaded>
		throw exception1;
	//   50  102:aload_3         
	//   51  103:athrow          
_L1:
		initSegmentBytesLoaded = (int)(((ExtractorInput) (obj)).getPosition() - initDataSpec.absoluteStreamPosition);
	//   52  104:aload_0         
	//   53  105:aload_2         
	//   54  106:invokeinterface #232 <Method long ExtractorInput.getPosition()>
	//   55  111:aload_0         
	//   56  112:getfield        #70  <Field DataSpec initDataSpec>
	//   57  115:getfield        #190 <Field long DataSpec.absoluteStreamPosition>
	//   58  118:lsub            
	//   59  119:l2i             
	//   60  120:putfield        #242 <Field int initSegmentBytesLoaded>
		Util.closeQuietly(initDataSource);
	//   61  123:aload_0         
	//   62  124:getfield        #141 <Field DataSource initDataSource>
	//   63  127:invokestatic    #238 <Method void Util.closeQuietly(DataSource)>
		initLoadCompleted = true;
	//   64  130:aload_0         
	//   65  131:iconst_1        
	//   66  132:putfield        #127 <Field boolean initLoadCompleted>
		return;
	//   67  135:return          
		Exception exception;
		exception;
	//   68  136:astore_2        
		Util.closeQuietly(initDataSource);
	//   69  137:aload_0         
	//   70  138:getfield        #141 <Field DataSource initDataSource>
	//   71  141:invokestatic    #238 <Method void Util.closeQuietly(DataSource)>
		throw exception;
	//   72  144:aload_2         
	//   73  145:athrow          
	//   74  146:return          
	}

	private long peekId3PrivTimestamp(ExtractorInput extractorinput)
		throws IOException, InterruptedException
	{
		extractorinput.resetPeekPosition();
	//    0    0:aload_1         
	//    1    1:invokeinterface #245 <Method void ExtractorInput.resetPeekPosition()>
		if(!extractorinput.peekFully(id3Data.data, 0, 10, true))
	//*   2    6:aload_1         
	//*   3    7:aload_0         
	//*   4    8:getfield        #129 <Field ParsableByteArray id3Data>
	//*   5   11:getfield        #249 <Field byte[] ParsableByteArray.data>
	//*   6   14:iconst_0        
	//*   7   15:bipush          10
	//*   8   17:iconst_1        
	//*   9   18:invokeinterface #253 <Method boolean ExtractorInput.peekFully(byte[], int, int, boolean)>
	//*  10   23:ifne            30
			return 0x1L;
	//   11   26:ldc2w           #208 <Long 0x1L>
	//   12   29:lreturn         
		id3Data.reset(10);
	//   13   30:aload_0         
	//   14   31:getfield        #129 <Field ParsableByteArray id3Data>
	//   15   34:bipush          10
	//   16   36:invokevirtual   #256 <Method void ParsableByteArray.reset(int)>
		if(id3Data.readUnsignedInt24() != Id3Decoder.ID3_TAG)
	//*  17   39:aload_0         
	//*  18   40:getfield        #129 <Field ParsableByteArray id3Data>
	//*  19   43:invokevirtual   #259 <Method int ParsableByteArray.readUnsignedInt24()>
	//*  20   46:getstatic       #262 <Field int Id3Decoder.ID3_TAG>
	//*  21   49:icmpeq          56
			return 0x1L;
	//   22   52:ldc2w           #208 <Long 0x1L>
	//   23   55:lreturn         
		id3Data.skipBytes(3);
	//   24   56:aload_0         
	//   25   57:getfield        #129 <Field ParsableByteArray id3Data>
	//   26   60:iconst_3        
	//   27   61:invokevirtual   #265 <Method void ParsableByteArray.skipBytes(int)>
		int i = id3Data.readSynchSafeInt();
	//   28   64:aload_0         
	//   29   65:getfield        #129 <Field ParsableByteArray id3Data>
	//   30   68:invokevirtual   #268 <Method int ParsableByteArray.readSynchSafeInt()>
	//   31   71:istore_2        
		int k = i + 10;
	//   32   72:iload_2         
	//   33   73:bipush          10
	//   34   75:iadd            
	//   35   76:istore_3        
		if(k > id3Data.capacity())
	//*  36   77:iload_3         
	//*  37   78:aload_0         
	//*  38   79:getfield        #129 <Field ParsableByteArray id3Data>
	//*  39   82:invokevirtual   #271 <Method int ParsableByteArray.capacity()>
	//*  40   85:icmple          121
		{
			byte abyte0[] = id3Data.data;
	//   41   88:aload_0         
	//   42   89:getfield        #129 <Field ParsableByteArray id3Data>
	//   43   92:getfield        #249 <Field byte[] ParsableByteArray.data>
	//   44   95:astore          4
			id3Data.reset(k);
	//   45   97:aload_0         
	//   46   98:getfield        #129 <Field ParsableByteArray id3Data>
	//   47  101:iload_3         
	//   48  102:invokevirtual   #256 <Method void ParsableByteArray.reset(int)>
			System.arraycopy(((Object) (abyte0)), 0, ((Object) (id3Data.data)), 0, 10);
	//   49  105:aload           4
	//   50  107:iconst_0        
	//   51  108:aload_0         
	//   52  109:getfield        #129 <Field ParsableByteArray id3Data>
	//   53  112:getfield        #249 <Field byte[] ParsableByteArray.data>
	//   54  115:iconst_0        
	//   55  116:bipush          10
	//   56  118:invokestatic    #277 <Method void System.arraycopy(Object, int, Object, int, int)>
		}
		if(!extractorinput.peekFully(id3Data.data, 10, i, true))
	//*  57  121:aload_1         
	//*  58  122:aload_0         
	//*  59  123:getfield        #129 <Field ParsableByteArray id3Data>
	//*  60  126:getfield        #249 <Field byte[] ParsableByteArray.data>
	//*  61  129:bipush          10
	//*  62  131:iload_2         
	//*  63  132:iconst_1        
	//*  64  133:invokeinterface #253 <Method boolean ExtractorInput.peekFully(byte[], int, int, boolean)>
	//*  65  138:ifne            145
			return 0x1L;
	//   66  141:ldc2w           #208 <Long 0x1L>
	//   67  144:lreturn         
		extractorinput = ((ExtractorInput) (id3Decoder.decode(id3Data.data, i)));
	//   68  145:aload_0         
	//   69  146:getfield        #131 <Field Id3Decoder id3Decoder>
	//   70  149:aload_0         
	//   71  150:getfield        #129 <Field ParsableByteArray id3Data>
	//   72  153:getfield        #249 <Field byte[] ParsableByteArray.data>
	//   73  156:iload_2         
	//   74  157:invokevirtual   #281 <Method Metadata Id3Decoder.decode(byte[], int)>
	//   75  160:astore_1        
		if(extractorinput == null)
	//*  76  161:aload_1         
	//*  77  162:ifnonnull       169
			return 0x1L;
	//   78  165:ldc2w           #208 <Long 0x1L>
	//   79  168:lreturn         
		k = ((Metadata) (extractorinput)).length();
	//   80  169:aload_1         
	//   81  170:invokevirtual   #286 <Method int Metadata.length()>
	//   82  173:istore_3        
		for(int j = 0; j < k; j++)
	//*  83  174:iconst_0        
	//*  84  175:istore_2        
	//*  85  176:iload_2         
	//*  86  177:iload_3         
	//*  87  178:icmpge          263
		{
			Object obj = ((Object) (((Metadata) (extractorinput)).get(j)));
	//   88  181:aload_1         
	//   89  182:iload_2         
	//   90  183:invokevirtual   #290 <Method com.google.android.exoplayer2.metadata.Metadata$Entry Metadata.get(int)>
	//   91  186:astore          4
			if(!(obj instanceof PrivFrame))
				continue;
	//   92  188:aload           4
	//   93  190:instanceof      #292 <Class PrivFrame>
	//   94  193:ifeq            256
			obj = ((Object) ((PrivFrame)obj));
	//   95  196:aload           4
	//   96  198:checkcast       #292 <Class PrivFrame>
	//   97  201:astore          4
			if("com.apple.streaming.transportStreamTimestamp".equals(((Object) (((PrivFrame) (obj)).owner))))
	//*  98  203:ldc1            #8   <String "com.apple.streaming.transportStreamTimestamp">
	//*  99  205:aload           4
	//* 100  207:getfield        #295 <Field String PrivFrame.owner>
	//* 101  210:invokevirtual   #301 <Method boolean String.equals(Object)>
	//* 102  213:ifeq            256
			{
				System.arraycopy(((Object) (((PrivFrame) (obj)).privateData)), 0, ((Object) (id3Data.data)), 0, 8);
	//  103  216:aload           4
	//  104  218:getfield        #304 <Field byte[] PrivFrame.privateData>
	//  105  221:iconst_0        
	//  106  222:aload_0         
	//  107  223:getfield        #129 <Field ParsableByteArray id3Data>
	//  108  226:getfield        #249 <Field byte[] ParsableByteArray.data>
	//  109  229:iconst_0        
	//  110  230:bipush          8
	//  111  232:invokestatic    #277 <Method void System.arraycopy(Object, int, Object, int, int)>
				id3Data.reset(8);
	//  112  235:aload_0         
	//  113  236:getfield        #129 <Field ParsableByteArray id3Data>
	//  114  239:bipush          8
	//  115  241:invokevirtual   #256 <Method void ParsableByteArray.reset(int)>
				return id3Data.readLong() & 0xffffffffL;
	//  116  244:aload_0         
	//  117  245:getfield        #129 <Field ParsableByteArray id3Data>
	//  118  248:invokevirtual   #307 <Method long ParsableByteArray.readLong()>
	//  119  251:ldc2w           #308 <Long 0xffffffffL>
	//  120  254:land            
	//  121  255:lreturn         
			}
		}

	//  122  256:iload_2         
	//  123  257:iconst_1        
	//  124  258:iadd            
	//  125  259:istore_2        
	//* 126  260:goto            176
		return 0x1L;
	//  127  263:ldc2w           #208 <Long 0x1L>
	//  128  266:lreturn         
	}

	public long bytesLoaded()
	{
		return (long)bytesLoaded;
	//    0    0:aload_0         
	//    1    1:getfield        #162 <Field int bytesLoaded>
	//    2    4:i2l             
	//    3    5:lreturn         
	}

	public void cancelLoad()
	{
		loadCanceled = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #225 <Field boolean loadCanceled>
	//    3    5:return          
	}

	public void init(HlsSampleStreamWrapper hlssamplestreamwrapper)
	{
		output = hlssamplestreamwrapper;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #207 <Field HlsSampleStreamWrapper output>
		hlssamplestreamwrapper.init(uid, shouldSpliceIn, reusingExtractor);
	//    3    5:aload_1         
	//    4    6:aload_0         
	//    5    7:getfield        #147 <Field int uid>
	//    6   10:aload_0         
	//    7   11:getfield        #87  <Field boolean shouldSpliceIn>
	//    8   14:aload_0         
	//    9   15:getfield        #125 <Field boolean reusingExtractor>
	//   10   18:invokevirtual   #315 <Method void HlsSampleStreamWrapper.init(int, boolean, boolean)>
		if(!reusingExtractor)
	//*  11   21:aload_0         
	//*  12   22:getfield        #125 <Field boolean reusingExtractor>
	//*  13   25:ifne            38
			extractor.init(((com.google.android.exoplayer2.extractor.ExtractorOutput) (hlssamplestreamwrapper)));
	//   14   28:aload_0         
	//   15   29:getfield        #89  <Field Extractor extractor>
	//   16   32:aload_1         
	//   17   33:invokeinterface #318 <Method void Extractor.init(com.google.android.exoplayer2.extractor.ExtractorOutput)>
	//   18   38:return          
	}

	public boolean isLoadCompleted()
	{
		return loadCompleted;
	//    0    0:aload_0         
	//    1    1:getfield        #321 <Field boolean loadCompleted>
	//    2    4:ireturn         
	}

	public void load()
		throws IOException, InterruptedException
	{
		maybeLoadInitData();
	//    0    0:aload_0         
	//    1    1:invokespecial   #324 <Method void maybeLoadInitData()>
		if(!loadCanceled)
	//*   2    4:aload_0         
	//*   3    5:getfield        #225 <Field boolean loadCanceled>
	//*   4    8:ifne            27
		{
			if(!hasGapTag)
	//*   5   11:aload_0         
	//*   6   12:getfield        #85  <Field boolean hasGapTag>
	//*   7   15:ifne            22
				loadMedia();
	//    8   18:aload_0         
	//    9   19:invokespecial   #326 <Method void loadMedia()>
			loadCompleted = true;
	//   10   22:aload_0         
	//   11   23:iconst_1        
	//   12   24:putfield        #321 <Field boolean loadCompleted>
		}
	//   13   27:return          
	}

	private static final String PRIV_TIMESTAMP_FRAME_OWNER = "com.apple.streaming.transportStreamTimestamp";
	private static final AtomicInteger uidSource = new AtomicInteger();
	private int bytesLoaded;
	public final int discontinuitySequenceNumber;
	private final Extractor extractor;
	private final boolean hasGapTag;
	public final com.google.android.exoplayer2.source.hls.playlist.HlsMasterPlaylist.HlsUrl hlsUrl;
	private final ParsableByteArray id3Data;
	private final Id3Decoder id3Decoder;
	private boolean id3TimestampPeeked;
	private final DataSource initDataSource;
	private final DataSpec initDataSpec;
	private boolean initLoadCompleted;
	private int initSegmentBytesLoaded;
	private final boolean isEncrypted;
	private final boolean isMasterTimestampSource;
	private final boolean isPackedAudioExtractor;
	private volatile boolean loadCanceled;
	private volatile boolean loadCompleted;
	private HlsSampleStreamWrapper output;
	private final boolean reusingExtractor;
	private final boolean shouldSpliceIn;
	private final TimestampAdjuster timestampAdjuster;
	public final int uid;

	static 
	{
	//    0    0:new             #46  <Class AtomicInteger>
	//    1    3:dup             
	//    2    4:invokespecial   #49  <Method void AtomicInteger()>
	//    3    7:putstatic       #51  <Field AtomicInteger uidSource>
	//*   4   10:return          
	}
}
