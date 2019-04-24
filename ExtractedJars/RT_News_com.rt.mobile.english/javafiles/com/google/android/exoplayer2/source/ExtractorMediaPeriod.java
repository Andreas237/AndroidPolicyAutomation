// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.source;

import android.net.Uri;
import android.os.Handler;
import com.google.android.exoplayer2.*;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.extractor.*;
import com.google.android.exoplayer2.trackselection.TrackSelection;
import com.google.android.exoplayer2.upstream.*;
import com.google.android.exoplayer2.util.*;
import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;

// Referenced classes of package com.google.android.exoplayer2.source:
//			MediaPeriod, SampleQueue, UnrecognizedInputFormatException, TrackGroup, 
//			TrackGroupArray, SampleStream

final class ExtractorMediaPeriod
	implements MediaPeriod, ExtractorOutput, com.google.android.exoplayer2.upstream.Loader.Callback, com.google.android.exoplayer2.upstream.Loader.ReleaseCallback, SampleQueue.UpstreamFormatChangedListener
{
	final class ExtractingLoadable
		implements com.google.android.exoplayer2.upstream.Loader.Loadable
	{

		public void cancelLoad()
		{
			loadCanceled = true;
		//    0    0:aload_0         
		//    1    1:iconst_1        
		//    2    2:putfield        #84  <Field boolean loadCanceled>
		//    3    5:return          
		}

		public void load()
			throws IOException, InterruptedException
		{
			int i = 0;
		//    0    0:iconst_0        
		//    1    1:istore_1        
_L4:
			if(i != 0 || loadCanceled)
				break MISSING_BLOCK_LABEL_414;
		//    2    2:iload_1         
		//    3    3:ifne            414
		//    4    6:aload_0         
		//    5    7:getfield        #84  <Field boolean loadCanceled>
		//    6   10:ifne            414
			long l1;
			DefaultExtractorInput defaultextractorinput;
			l1 = positionHolder.position;
		//    7   13:aload_0         
		//    8   14:getfield        #62  <Field PositionHolder positionHolder>
		//    9   17:getfield        #92  <Field long PositionHolder.position>
		//   10   20:lstore          6
			dataSpec = new DataSpec(uri, l1, -1L, customCacheKey);
		//   11   22:aload_0         
		//   12   23:new             #94  <Class DataSpec>
		//   13   26:dup             
		//   14   27:aload_0         
		//   15   28:getfield        #47  <Field Uri uri>
		//   16   31:lload           6
		//   17   33:ldc2w           #65  <Long -1L>
		//   18   36:aload_0         
		//   19   37:getfield        #34  <Field ExtractorMediaPeriod this$0>
		//   20   40:invokestatic    #98  <Method String ExtractorMediaPeriod.access$800(ExtractorMediaPeriod)>
		//   21   43:invokespecial   #101 <Method void DataSpec(Uri, long, long, String)>
		//   22   46:putfield        #73  <Field DataSpec dataSpec>
			length = dataSource.open(dataSpec);
		//   23   49:aload_0         
		//   24   50:aload_0         
		//   25   51:getfield        #51  <Field DataSource dataSource>
		//   26   54:aload_0         
		//   27   55:getfield        #73  <Field DataSpec dataSpec>
		//   28   58:invokeinterface #105 <Method long DataSource.open(DataSpec)>
		//   29   63:putfield        #68  <Field long length>
			if(length != -1L)
		//*  30   66:aload_0         
		//*  31   67:getfield        #68  <Field long length>
		//*  32   70:ldc2w           #65  <Long -1L>
		//*  33   73:lcmp            
		//*  34   74:ifeq            88
				length = length + l1;
		//   35   77:aload_0         
		//   36   78:aload_0         
		//   37   79:getfield        #68  <Field long length>
		//   38   82:lload           6
		//   39   84:ladd            
		//   40   85:putfield        #68  <Field long length>
			defaultextractorinput = new DefaultExtractorInput(dataSource, l1, length);
		//   41   88:new             #107 <Class DefaultExtractorInput>
		//   42   91:dup             
		//   43   92:aload_0         
		//   44   93:getfield        #51  <Field DataSource dataSource>
		//   45   96:lload           6
		//   46   98:aload_0         
		//   47   99:getfield        #68  <Field long length>
		//   48  102:invokespecial   #110 <Method void DefaultExtractorInput(DataSource, long, long)>
		//   49  105:astore          9
			int k = i;
		//   50  107:iload_1         
		//   51  108:istore_3        
			Extractor extractor = extractorHolder.selectExtractor(((ExtractorInput) (defaultextractorinput)), dataSource.getUri());
		//   52  109:aload_0         
		//   53  110:getfield        #55  <Field ExtractorMediaPeriod$ExtractorHolder extractorHolder>
		//   54  113:aload           9
		//   55  115:aload_0         
		//   56  116:getfield        #51  <Field DataSource dataSource>
		//   57  119:invokeinterface #114 <Method Uri DataSource.getUri()>
		//   58  124:invokevirtual   #118 <Method Extractor ExtractorMediaPeriod$ExtractorHolder.selectExtractor(ExtractorInput, Uri)>
		//   59  127:astore          8
			int j;
			long l;
			j = i;
		//   60  129:iload_1         
		//   61  130:istore_2        
			l = l1;
		//   62  131:lload           6
		//   63  133:lstore          4
			k = i;
		//   64  135:iload_1         
		//   65  136:istore_3        
			if(!pendingExtractorSeek)
				break MISSING_BLOCK_LABEL_172;
		//   66  137:aload_0         
		//   67  138:getfield        #64  <Field boolean pendingExtractorSeek>
		//   68  141:ifeq            172
			k = i;
		//   69  144:iload_1         
		//   70  145:istore_3        
			extractor.seek(l1, seekTimeUs);
		//   71  146:aload           8
		//   72  148:lload           6
		//   73  150:aload_0         
		//   74  151:getfield        #77  <Field long seekTimeUs>
		//   75  154:invokeinterface #124 <Method void Extractor.seek(long, long)>
			k = i;
		//   76  159:iload_1         
		//   77  160:istore_3        
			pendingExtractorSeek = false;
		//   78  161:aload_0         
		//   79  162:iconst_0        
		//   80  163:putfield        #64  <Field boolean pendingExtractorSeek>
			l = l1;
		//   81  166:lload           6
		//   82  168:lstore          4
			j = i;
		//   83  170:iload_1         
		//   84  171:istore_2        
_L2:
			if(j != 0)
				break MISSING_BLOCK_LABEL_284;
		//   85  172:iload_2         
		//   86  173:ifne            284
			k = j;
		//   87  176:iload_2         
		//   88  177:istore_3        
			if(loadCanceled)
				break MISSING_BLOCK_LABEL_284;
		//   89  178:aload_0         
		//   90  179:getfield        #84  <Field boolean loadCanceled>
		//   91  182:ifne            284
			k = j;
		//   92  185:iload_2         
		//   93  186:istore_3        
			loadCondition.block();
		//   94  187:aload_0         
		//   95  188:getfield        #57  <Field ConditionVariable loadCondition>
		//   96  191:invokevirtual   #129 <Method void ConditionVariable.block()>
			k = j;
		//   97  194:iload_2         
		//   98  195:istore_3        
			i = extractor.read(((ExtractorInput) (defaultextractorinput)), positionHolder);
		//   99  196:aload           8
		//  100  198:aload           9
		//  101  200:aload_0         
		//  102  201:getfield        #62  <Field PositionHolder positionHolder>
		//  103  204:invokeinterface #133 <Method int Extractor.read(ExtractorInput, PositionHolder)>
		//  104  209:istore_1        
			l1 = l;
		//  105  210:lload           4
		//  106  212:lstore          6
			if(((ExtractorInput) (defaultextractorinput)).getPosition() > l + continueLoadingCheckIntervalBytes)
		//* 107  214:aload           9
		//* 108  216:invokeinterface #139 <Method long ExtractorInput.getPosition()>
		//* 109  221:lload           4
		//* 110  223:aload_0         
		//* 111  224:getfield        #34  <Field ExtractorMediaPeriod this$0>
		//* 112  227:invokestatic    #143 <Method long ExtractorMediaPeriod.access$900(ExtractorMediaPeriod)>
		//* 113  230:ladd            
		//* 114  231:lcmp            
		//* 115  232:ifle            270
			{
				l1 = ((ExtractorInput) (defaultextractorinput)).getPosition();
		//  116  235:aload           9
		//  117  237:invokeinterface #139 <Method long ExtractorInput.getPosition()>
		//  118  242:lstore          6
				loadCondition.close();
		//  119  244:aload_0         
		//  120  245:getfield        #57  <Field ConditionVariable loadCondition>
		//  121  248:invokevirtual   #147 <Method boolean ConditionVariable.close()>
		//  122  251:pop             
				handler.post(onContinueLoadingRequestedRunnable);
		//  123  252:aload_0         
		//  124  253:getfield        #34  <Field ExtractorMediaPeriod this$0>
		//  125  256:invokestatic    #151 <Method Handler ExtractorMediaPeriod.access$1100(ExtractorMediaPeriod)>
		//  126  259:aload_0         
		//  127  260:getfield        #34  <Field ExtractorMediaPeriod this$0>
		//  128  263:invokestatic    #155 <Method Runnable ExtractorMediaPeriod.access$1000(ExtractorMediaPeriod)>
		//  129  266:invokevirtual   #161 <Method boolean Handler.post(Runnable)>
		//  130  269:pop             
			}
			j = i;
		//  131  270:iload_1         
		//  132  271:istore_2        
			l = l1;
		//  133  272:lload           6
		//  134  274:lstore          4
			if(true) goto _L2; else goto _L1
		//  135  276:goto            172
_L1:
			Exception exception;
			exception;
		//  136  279:astore          8
			break; /* Loop/switch isn't completed */
		//  137  281:goto            358
			if(j == 1)
		//* 138  284:iload_2         
		//* 139  285:iconst_1        
		//* 140  286:icmpne          294
			{
				i = 0;
		//  141  289:iconst_0        
		//  142  290:istore_1        
			} else
		//* 143  291:goto            336
			{
				i = j;
		//  144  294:iload_2         
		//  145  295:istore_1        
				if(defaultextractorinput != null)
		//* 146  296:aload           9
		//* 147  298:ifnull          336
				{
					positionHolder.position = ((ExtractorInput) (defaultextractorinput)).getPosition();
		//  148  301:aload_0         
		//  149  302:getfield        #62  <Field PositionHolder positionHolder>
		//  150  305:aload           9
		//  151  307:invokeinterface #139 <Method long ExtractorInput.getPosition()>
		//  152  312:putfield        #92  <Field long PositionHolder.position>
					bytesLoaded = positionHolder.position - dataSpec.absoluteStreamPosition;
		//  153  315:aload_0         
		//  154  316:aload_0         
		//  155  317:getfield        #62  <Field PositionHolder positionHolder>
		//  156  320:getfield        #92  <Field long PositionHolder.position>
		//  157  323:aload_0         
		//  158  324:getfield        #73  <Field DataSpec dataSpec>
		//  159  327:getfield        #164 <Field long DataSpec.absoluteStreamPosition>
		//  160  330:lsub            
		//  161  331:putfield        #80  <Field long bytesLoaded>
					i = j;
		//  162  334:iload_2         
		//  163  335:istore_1        
				}
			}
			Util.closeQuietly(dataSource);
		//  164  336:aload_0         
		//  165  337:getfield        #51  <Field DataSource dataSource>
		//  166  340:invokestatic    #170 <Method void Util.closeQuietly(DataSource)>
			if(true) goto _L4; else goto _L3
		//  167  343:goto            2
			exception;
		//  168  346:astore          8
			i = k;
		//  169  348:iload_3         
		//  170  349:istore_1        
			  goto _L3
		//* 171  350:goto            358
			exception;
		//  172  353:astore          8
			defaultextractorinput = null;
		//  173  355:aconst_null     
		//  174  356:astore          9
_L3:
			if(i != 1 && defaultextractorinput != null)
		//* 175  358:iload_1         
		//* 176  359:iconst_1        
		//* 177  360:icmpne          366
		//* 178  363:goto            404
		//* 179  366:aload           9
		//* 180  368:ifnull          404
			{
				positionHolder.position = ((ExtractorInput) (defaultextractorinput)).getPosition();
		//  181  371:aload_0         
		//  182  372:getfield        #62  <Field PositionHolder positionHolder>
		//  183  375:aload           9
		//  184  377:invokeinterface #139 <Method long ExtractorInput.getPosition()>
		//  185  382:putfield        #92  <Field long PositionHolder.position>
				bytesLoaded = positionHolder.position - dataSpec.absoluteStreamPosition;
		//  186  385:aload_0         
		//  187  386:aload_0         
		//  188  387:getfield        #62  <Field PositionHolder positionHolder>
		//  189  390:getfield        #92  <Field long PositionHolder.position>
		//  190  393:aload_0         
		//  191  394:getfield        #73  <Field DataSpec dataSpec>
		//  192  397:getfield        #164 <Field long DataSpec.absoluteStreamPosition>
		//  193  400:lsub            
		//  194  401:putfield        #80  <Field long bytesLoaded>
			}
			Util.closeQuietly(dataSource);
		//  195  404:aload_0         
		//  196  405:getfield        #51  <Field DataSource dataSource>
		//  197  408:invokestatic    #170 <Method void Util.closeQuietly(DataSource)>
			throw exception;
		//  198  411:aload           8
		//  199  413:athrow          
		//  200  414:return          
		}

		public void setLoadPosition(long l, long l1)
		{
			positionHolder.position = l;
		//    0    0:aload_0         
		//    1    1:getfield        #62  <Field PositionHolder positionHolder>
		//    2    4:lload_1         
		//    3    5:putfield        #92  <Field long PositionHolder.position>
			seekTimeUs = l1;
		//    4    8:aload_0         
		//    5    9:lload_3         
		//    6   10:putfield        #77  <Field long seekTimeUs>
			pendingExtractorSeek = true;
		//    7   13:aload_0         
		//    8   14:iconst_1        
		//    9   15:putfield        #64  <Field boolean pendingExtractorSeek>
		//   10   18:return          
		}

		private long bytesLoaded;
		private final DataSource dataSource;
		private DataSpec dataSpec;
		private final ExtractorHolder extractorHolder;
		private long length;
		private volatile boolean loadCanceled;
		private final ConditionVariable loadCondition;
		private boolean pendingExtractorSeek;
		private final PositionHolder positionHolder = new PositionHolder();
		private long seekTimeUs;
		final ExtractorMediaPeriod this$0;
		private final Uri uri;


/*
		static DataSpec access$400(ExtractingLoadable extractingloadable)
		{
			return extractingloadable.dataSpec;
		//    0    0:aload_0         
		//    1    1:getfield        #73  <Field DataSpec dataSpec>
		//    2    4:areturn         
		}

*/


/*
		static long access$500(ExtractingLoadable extractingloadable)
		{
			return extractingloadable.seekTimeUs;
		//    0    0:aload_0         
		//    1    1:getfield        #77  <Field long seekTimeUs>
		//    2    4:lreturn         
		}

*/


/*
		static long access$600(ExtractingLoadable extractingloadable)
		{
			return extractingloadable.bytesLoaded;
		//    0    0:aload_0         
		//    1    1:getfield        #80  <Field long bytesLoaded>
		//    2    4:lreturn         
		}

*/


/*
		static long access$700(ExtractingLoadable extractingloadable)
		{
			return extractingloadable.length;
		//    0    0:aload_0         
		//    1    1:getfield        #68  <Field long length>
		//    2    4:lreturn         
		}

*/

		public ExtractingLoadable(Uri uri1, DataSource datasource, ExtractorHolder extractorholder, ConditionVariable conditionvariable)
		{
			this$0 = ExtractorMediaPeriod.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #34  <Field ExtractorMediaPeriod this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #37  <Method void Object()>
			uri = (Uri)Assertions.checkNotNull(((Object) (uri1)));
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:invokestatic    #43  <Method Object Assertions.checkNotNull(Object)>
		//    8   14:checkcast       #45  <Class Uri>
		//    9   17:putfield        #47  <Field Uri uri>
			dataSource = (DataSource)Assertions.checkNotNull(((Object) (datasource)));
		//   10   20:aload_0         
		//   11   21:aload_3         
		//   12   22:invokestatic    #43  <Method Object Assertions.checkNotNull(Object)>
		//   13   25:checkcast       #49  <Class DataSource>
		//   14   28:putfield        #51  <Field DataSource dataSource>
			extractorHolder = (ExtractorHolder)Assertions.checkNotNull(((Object) (extractorholder)));
		//   15   31:aload_0         
		//   16   32:aload           4
		//   17   34:invokestatic    #43  <Method Object Assertions.checkNotNull(Object)>
		//   18   37:checkcast       #53  <Class ExtractorMediaPeriod$ExtractorHolder>
		//   19   40:putfield        #55  <Field ExtractorMediaPeriod$ExtractorHolder extractorHolder>
			loadCondition = conditionvariable;
		//   20   43:aload_0         
		//   21   44:aload           5
		//   22   46:putfield        #57  <Field ConditionVariable loadCondition>
		//   23   49:aload_0         
		//   24   50:new             #59  <Class PositionHolder>
		//   25   53:dup             
		//   26   54:invokespecial   #60  <Method void PositionHolder()>
		//   27   57:putfield        #62  <Field PositionHolder positionHolder>
			pendingExtractorSeek = true;
		//   28   60:aload_0         
		//   29   61:iconst_1        
		//   30   62:putfield        #64  <Field boolean pendingExtractorSeek>
			length = -1L;
		//   31   65:aload_0         
		//   32   66:ldc2w           #65  <Long -1L>
		//   33   69:putfield        #68  <Field long length>
		//   34   72:return          
		}
	}

	private static final class ExtractorHolder
	{

		public void release()
		{
			if(extractor != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #26  <Field Extractor extractor>
		//*   2    4:ifnull          21
			{
				extractor.release();
		//    3    7:aload_0         
		//    4    8:getfield        #26  <Field Extractor extractor>
		//    5   11:invokeinterface #30  <Method void Extractor.release()>
				extractor = null;
		//    6   16:aload_0         
		//    7   17:aconst_null     
		//    8   18:putfield        #26  <Field Extractor extractor>
			}
		//    9   21:return          
		}

		public Extractor selectExtractor(ExtractorInput extractorinput, Uri uri1)
			throws IOException, InterruptedException
		{
			int i;
			int j;
			Extractor aextractor[];
			if(extractor != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #26  <Field Extractor extractor>
		//*   2    4:ifnull          12
				return extractor;
		//    3    7:aload_0         
		//    4    8:getfield        #26  <Field Extractor extractor>
		//    5   11:areturn         
			aextractor = extractors;
		//    6   12:aload_0         
		//    7   13:getfield        #20  <Field Extractor[] extractors>
		//    8   16:astore          5
			j = aextractor.length;
		//    9   18:aload           5
		//   10   20:arraylength     
		//   11   21:istore          4
			i = 0;
		//   12   23:iconst_0        
		//   13   24:istore_3        
_L2:
			Extractor extractor1;
			if(i >= j)
				break; /* Loop/switch isn't completed */
		//   14   25:iload_3         
		//   15   26:iload           4
		//   16   28:icmpge          85
			extractor1 = aextractor[i];
		//   17   31:aload           5
		//   18   33:iload_3         
		//   19   34:aaload          
		//   20   35:astore          6
			if(!extractor1.sniff(extractorinput))
				break MISSING_BLOCK_LABEL_72;
		//   21   37:aload           6
		//   22   39:aload_1         
		//   23   40:invokeinterface #42  <Method boolean Extractor.sniff(ExtractorInput)>
		//   24   45:ifeq            72
			extractor = extractor1;
		//   25   48:aload_0         
		//   26   49:aload           6
		//   27   51:putfield        #26  <Field Extractor extractor>
			extractorinput.resetPeekPosition();
		//   28   54:aload_1         
		//   29   55:invokeinterface #47  <Method void ExtractorInput.resetPeekPosition()>
			break; /* Loop/switch isn't completed */
		//   30   60:goto            85
			uri1;
		//   31   63:astore_2        
			extractorinput.resetPeekPosition();
		//   32   64:aload_1         
		//   33   65:invokeinterface #47  <Method void ExtractorInput.resetPeekPosition()>
			throw uri1;
		//   34   70:aload_2         
		//   35   71:athrow          
_L3:
			extractorinput.resetPeekPosition();
		//   36   72:aload_1         
		//   37   73:invokeinterface #47  <Method void ExtractorInput.resetPeekPosition()>
			i++;
		//   38   78:iload_3         
		//   39   79:iconst_1        
		//   40   80:iadd            
		//   41   81:istore_3        
			if(true) goto _L2; else goto _L1
		//   42   82:goto            25
_L1:
			if(extractor == null)
		//*  43   85:aload_0         
		//*  44   86:getfield        #26  <Field Extractor extractor>
		//*  45   89:ifnonnull       139
			{
				extractorinput = ((ExtractorInput) (new StringBuilder()));
		//   46   92:new             #49  <Class StringBuilder>
		//   47   95:dup             
		//   48   96:invokespecial   #50  <Method void StringBuilder()>
		//   49   99:astore_1        
				((StringBuilder) (extractorinput)).append("None of the available extractors (");
		//   50  100:aload_1         
		//   51  101:ldc1            #52  <String "None of the available extractors (">
		//   52  103:invokevirtual   #56  <Method StringBuilder StringBuilder.append(String)>
		//   53  106:pop             
				((StringBuilder) (extractorinput)).append(Util.getCommaDelimitedSimpleClassNames(((Object []) (extractors))));
		//   54  107:aload_1         
		//   55  108:aload_0         
		//   56  109:getfield        #20  <Field Extractor[] extractors>
		//   57  112:invokestatic    #62  <Method String Util.getCommaDelimitedSimpleClassNames(Object[])>
		//   58  115:invokevirtual   #56  <Method StringBuilder StringBuilder.append(String)>
		//   59  118:pop             
				((StringBuilder) (extractorinput)).append(") could read the stream.");
		//   60  119:aload_1         
		//   61  120:ldc1            #64  <String ") could read the stream.">
		//   62  122:invokevirtual   #56  <Method StringBuilder StringBuilder.append(String)>
		//   63  125:pop             
				throw new UnrecognizedInputFormatException(((StringBuilder) (extractorinput)).toString(), uri1);
		//   64  126:new             #66  <Class UnrecognizedInputFormatException>
		//   65  129:dup             
		//   66  130:aload_1         
		//   67  131:invokevirtual   #70  <Method String StringBuilder.toString()>
		//   68  134:aload_2         
		//   69  135:invokespecial   #73  <Method void UnrecognizedInputFormatException(String, Uri)>
		//   70  138:athrow          
			} else
			{
				extractor.init(extractorOutput);
		//   71  139:aload_0         
		//   72  140:getfield        #26  <Field Extractor extractor>
		//   73  143:aload_0         
		//   74  144:getfield        #22  <Field ExtractorOutput extractorOutput>
		//   75  147:invokeinterface #77  <Method void Extractor.init(ExtractorOutput)>
				return extractor;
		//   76  152:aload_0         
		//   77  153:getfield        #26  <Field Extractor extractor>
		//   78  156:areturn         
			}
			EOFException eofexception;
			eofexception;
		//   79  157:astore          6
			  goto _L3
		//*  80  159:goto            72
		}

		private Extractor extractor;
		private final ExtractorOutput extractorOutput;
		private final Extractor extractors[];

		public ExtractorHolder(Extractor aextractor[], ExtractorOutput extractoroutput)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #18  <Method void Object()>
			extractors = aextractor;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #20  <Field Extractor[] extractors>
			extractorOutput = extractoroutput;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #22  <Field ExtractorOutput extractorOutput>
		//    8   14:return          
		}
	}

	static interface Listener
	{

		public abstract void onSourceInfoRefreshed(long l, boolean flag);
	}

	private final class SampleStreamImpl
		implements SampleStream
	{

		public boolean isReady()
		{
			return ExtractorMediaPeriod.this.isReady(track);
		//    0    0:aload_0         
		//    1    1:getfield        #17  <Field ExtractorMediaPeriod this$0>
		//    2    4:aload_0         
		//    3    5:getfield        #22  <Field int track>
		//    4    8:invokevirtual   #30  <Method boolean ExtractorMediaPeriod.isReady(int)>
		//    5   11:ireturn         
		}

		public void maybeThrowError()
			throws IOException
		{
			ExtractorMediaPeriod.this.maybeThrowError();
		//    0    0:aload_0         
		//    1    1:getfield        #17  <Field ExtractorMediaPeriod this$0>
		//    2    4:invokevirtual   #35  <Method void ExtractorMediaPeriod.maybeThrowError()>
		//    3    7:return          
		}

		public int readData(FormatHolder formatholder, DecoderInputBuffer decoderinputbuffer, boolean flag)
		{
			return ExtractorMediaPeriod.this.readData(track, formatholder, decoderinputbuffer, flag);
		//    0    0:aload_0         
		//    1    1:getfield        #17  <Field ExtractorMediaPeriod this$0>
		//    2    4:aload_0         
		//    3    5:getfield        #22  <Field int track>
		//    4    8:aload_1         
		//    5    9:aload_2         
		//    6   10:iload_3         
		//    7   11:invokevirtual   #41  <Method int ExtractorMediaPeriod.readData(int, FormatHolder, DecoderInputBuffer, boolean)>
		//    8   14:ireturn         
		}

		public int skipData(long l)
		{
			return ExtractorMediaPeriod.this.skipData(track, l);
		//    0    0:aload_0         
		//    1    1:getfield        #17  <Field ExtractorMediaPeriod this$0>
		//    2    4:aload_0         
		//    3    5:getfield        #22  <Field int track>
		//    4    8:lload_1         
		//    5    9:invokevirtual   #46  <Method int ExtractorMediaPeriod.skipData(int, long)>
		//    6   12:ireturn         
		}

		final ExtractorMediaPeriod this$0;
		private final int track;


/*
		static int access$300(SampleStreamImpl samplestreamimpl)
		{
			return samplestreamimpl.track;
		//    0    0:aload_0         
		//    1    1:getfield        #22  <Field int track>
		//    2    4:ireturn         
		}

*/

		public SampleStreamImpl(int i)
		{
			this$0 = ExtractorMediaPeriod.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #17  <Field ExtractorMediaPeriod this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #20  <Method void Object()>
			track = i;
		//    5    9:aload_0         
		//    6   10:iload_2         
		//    7   11:putfield        #22  <Field int track>
		//    8   14:return          
		}
	}


	public ExtractorMediaPeriod(Uri uri1, DataSource datasource, Extractor aextractor[], int i, MediaSourceEventListener.EventDispatcher eventdispatcher, Listener listener1, Allocator allocator1, 
			String s, int j)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #98  <Method void Object()>
		uri = uri1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #100 <Field Uri uri>
		dataSource = datasource;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #102 <Field DataSource dataSource>
		minLoadableRetryCount = i;
	//    8   14:aload_0         
	//    9   15:iload           4
	//   10   17:putfield        #104 <Field int minLoadableRetryCount>
		eventDispatcher = eventdispatcher;
	//   11   20:aload_0         
	//   12   21:aload           5
	//   13   23:putfield        #106 <Field MediaSourceEventListener$EventDispatcher eventDispatcher>
		listener = listener1;
	//   14   26:aload_0         
	//   15   27:aload           6
	//   16   29:putfield        #108 <Field ExtractorMediaPeriod$Listener listener>
		allocator = allocator1;
	//   17   32:aload_0         
	//   18   33:aload           7
	//   19   35:putfield        #110 <Field Allocator allocator>
		customCacheKey = s;
	//   20   38:aload_0         
	//   21   39:aload           8
	//   22   41:putfield        #112 <Field String customCacheKey>
		continueLoadingCheckIntervalBytes = j;
	//   23   44:aload_0         
	//   24   45:iload           9
	//   25   47:i2l             
	//   26   48:putfield        #114 <Field long continueLoadingCheckIntervalBytes>
	//   27   51:aload_0         
	//   28   52:new             #116 <Class Loader>
	//   29   55:dup             
	//   30   56:ldc1            #118 <String "Loader:ExtractorMediaPeriod">
	//   31   58:invokespecial   #121 <Method void Loader(String)>
	//   32   61:putfield        #123 <Field Loader loader>
		extractorHolder = new ExtractorHolder(aextractor, ((ExtractorOutput) (this)));
	//   33   64:aload_0         
	//   34   65:new             #24  <Class ExtractorMediaPeriod$ExtractorHolder>
	//   35   68:dup             
	//   36   69:aload_3         
	//   37   70:aload_0         
	//   38   71:invokespecial   #126 <Method void ExtractorMediaPeriod$ExtractorHolder(Extractor[], ExtractorOutput)>
	//   39   74:putfield        #128 <Field ExtractorMediaPeriod$ExtractorHolder extractorHolder>
	//   40   77:aload_0         
	//   41   78:new             #130 <Class ConditionVariable>
	//   42   81:dup             
	//   43   82:invokespecial   #131 <Method void ConditionVariable()>
	//   44   85:putfield        #133 <Field ConditionVariable loadCondition>
	//   45   88:aload_0         
	//   46   89:new             #17  <Class ExtractorMediaPeriod$1>
	//   47   92:dup             
	//   48   93:aload_0         
	//   49   94:invokespecial   #136 <Method void ExtractorMediaPeriod$1(ExtractorMediaPeriod)>
	//   50   97:putfield        #138 <Field Runnable maybeFinishPrepareRunnable>
	//   51  100:aload_0         
	//   52  101:new             #19  <Class ExtractorMediaPeriod$2>
	//   53  104:dup             
	//   54  105:aload_0         
	//   55  106:invokespecial   #139 <Method void ExtractorMediaPeriod$2(ExtractorMediaPeriod)>
	//   56  109:putfield        #141 <Field Runnable onContinueLoadingRequestedRunnable>
	//   57  112:aload_0         
	//   58  113:new             #143 <Class Handler>
	//   59  116:dup             
	//   60  117:invokespecial   #144 <Method void Handler()>
	//   61  120:putfield        #146 <Field Handler handler>
		sampleQueueTrackIds = new int[0];
	//   62  123:aload_0         
	//   63  124:iconst_0        
	//   64  125:newarray        int[]
	//   65  127:putfield        #148 <Field int[] sampleQueueTrackIds>
		sampleQueues = new SampleQueue[0];
	//   66  130:aload_0         
	//   67  131:iconst_0        
	//   68  132:anewarray       SampleQueue[]
	//   69  135:putfield        #152 <Field SampleQueue[] sampleQueues>
		pendingResetPositionUs = 0x1L;
	//   70  138:aload_0         
	//   71  139:ldc2w           #153 <Long 0x1L>
	//   72  142:putfield        #156 <Field long pendingResetPositionUs>
		length = -1L;
	//   73  145:aload_0         
	//   74  146:ldc2w           #157 <Long -1L>
	//   75  149:putfield        #160 <Field long length>
		durationUs = 0x1L;
	//   76  152:aload_0         
	//   77  153:ldc2w           #153 <Long 0x1L>
	//   78  156:putfield        #162 <Field long durationUs>
		j = i;
	//   79  159:iload           4
	//   80  161:istore          9
		if(i == -1)
	//*  81  163:iload           4
	//*  82  165:iconst_m1       
	//*  83  166:icmpne          172
			j = 3;
	//   84  169:iconst_3        
	//   85  170:istore          9
		actualMinLoadableRetryCount = j;
	//   86  172:aload_0         
	//   87  173:iload           9
	//   88  175:putfield        #164 <Field int actualMinLoadableRetryCount>
		eventdispatcher.mediaPeriodCreated();
	//   89  178:aload           5
	//   90  180:invokevirtual   #169 <Method void MediaSourceEventListener$EventDispatcher.mediaPeriodCreated()>
	//   91  183:return          
	}

	private boolean configureRetry(ExtractingLoadable extractingloadable, int i)
	{
		if(length == -1L && (seekMap == null || seekMap.getDurationUs() == 0x1L))
	//*   0    0:aload_0         
	//*   1    1:getfield        #160 <Field long length>
	//*   2    4:ldc2w           #157 <Long -1L>
	//*   3    7:lcmp            
	//*   4    8:ifne            119
	//*   5   11:aload_0         
	//*   6   12:getfield        #195 <Field SeekMap seekMap>
	//*   7   15:ifnull          37
	//*   8   18:aload_0         
	//*   9   19:getfield        #195 <Field SeekMap seekMap>
	//*  10   22:invokeinterface #201 <Method long SeekMap.getDurationUs()>
	//*  11   27:ldc2w           #153 <Long 0x1L>
	//*  12   30:lcmp            
	//*  13   31:ifeq            37
	//*  14   34:goto            119
		{
			boolean flag = prepared;
	//   15   37:aload_0         
	//   16   38:getfield        #203 <Field boolean prepared>
	//   17   41:istore          4
			i = 0;
	//   18   43:iconst_0        
	//   19   44:istore_2        
			if(flag && !suppressRead())
	//*  20   45:iload           4
	//*  21   47:ifeq            64
	//*  22   50:aload_0         
	//*  23   51:invokespecial   #207 <Method boolean suppressRead()>
	//*  24   54:ifne            64
			{
				pendingDeferredRetry = true;
	//   25   57:aload_0         
	//   26   58:iconst_1        
	//   27   59:putfield        #209 <Field boolean pendingDeferredRetry>
				return false;
	//   28   62:iconst_0        
	//   29   63:ireturn         
			}
			notifyDiscontinuity = prepared;
	//   30   64:aload_0         
	//   31   65:aload_0         
	//   32   66:getfield        #203 <Field boolean prepared>
	//   33   69:putfield        #211 <Field boolean notifyDiscontinuity>
			lastSeekPositionUs = 0L;
	//   34   72:aload_0         
	//   35   73:lconst_0        
	//   36   74:putfield        #213 <Field long lastSeekPositionUs>
			extractedSamplesCountAtStartOfLoad = 0;
	//   37   77:aload_0         
	//   38   78:iconst_0        
	//   39   79:putfield        #215 <Field int extractedSamplesCountAtStartOfLoad>
			SampleQueue asamplequeue[] = sampleQueues;
	//   40   82:aload_0         
	//   41   83:getfield        #152 <Field SampleQueue[] sampleQueues>
	//   42   86:astore          5
			for(int j = asamplequeue.length; i < j; i++)
	//*  43   88:aload           5
	//*  44   90:arraylength     
	//*  45   91:istore_3        
	//*  46   92:iload_2         
	//*  47   93:iload_3         
	//*  48   94:icmpge          111
				asamplequeue[i].reset();
	//   49   97:aload           5
	//   50   99:iload_2         
	//   51  100:aaload          
	//   52  101:invokevirtual   #218 <Method void SampleQueue.reset()>

	//   53  104:iload_2         
	//   54  105:iconst_1        
	//   55  106:iadd            
	//   56  107:istore_2        
	//*  57  108:goto            92
			extractingloadable.setLoadPosition(0L, 0L);
	//   58  111:aload_1         
	//   59  112:lconst_0        
	//   60  113:lconst_0        
	//   61  114:invokevirtual   #222 <Method void ExtractorMediaPeriod$ExtractingLoadable.setLoadPosition(long, long)>
			return true;
	//   62  117:iconst_1        
	//   63  118:ireturn         
		} else
		{
			extractedSamplesCountAtStartOfLoad = i;
	//   64  119:aload_0         
	//   65  120:iload_2         
	//   66  121:putfield        #215 <Field int extractedSamplesCountAtStartOfLoad>
			return true;
	//   67  124:iconst_1        
	//   68  125:ireturn         
		}
	}

	private void copyLengthFromLoader(ExtractingLoadable extractingloadable)
	{
		if(length == -1L)
	//*   0    0:aload_0         
	//*   1    1:getfield        #160 <Field long length>
	//*   2    4:ldc2w           #157 <Long -1L>
	//*   3    7:lcmp            
	//*   4    8:ifne            19
			length = extractingloadable.length;
	//    5   11:aload_0         
	//    6   12:aload_1         
	//    7   13:invokestatic    #228 <Method long ExtractorMediaPeriod$ExtractingLoadable.access$700(ExtractorMediaPeriod$ExtractingLoadable)>
	//    8   16:putfield        #160 <Field long length>
	//    9   19:return          
	}

	private int getExtractedSamplesCount()
	{
		SampleQueue asamplequeue[] = sampleQueues;
	//    0    0:aload_0         
	//    1    1:getfield        #152 <Field SampleQueue[] sampleQueues>
	//    2    4:astore          4
		int i = 0;
	//    3    6:iconst_0        
	//    4    7:istore_1        
		int k = asamplequeue.length;
	//    5    8:aload           4
	//    6   10:arraylength     
	//    7   11:istore_3        
		int j = 0;
	//    8   12:iconst_0        
	//    9   13:istore_2        
		for(; i < k; i++)
	//*  10   14:iload_1         
	//*  11   15:iload_3         
	//*  12   16:icmpge          36
			j += asamplequeue[i].getWriteIndex();
	//   13   19:iload_2         
	//   14   20:aload           4
	//   15   22:iload_1         
	//   16   23:aaload          
	//   17   24:invokevirtual   #233 <Method int SampleQueue.getWriteIndex()>
	//   18   27:iadd            
	//   19   28:istore_2        

	//   20   29:iload_1         
	//   21   30:iconst_1        
	//   22   31:iadd            
	//   23   32:istore_1        
	//*  24   33:goto            14
		return j;
	//   25   36:iload_2         
	//   26   37:ireturn         
	}

	private long getLargestQueuedTimestampUs()
	{
		SampleQueue asamplequeue[] = sampleQueues;
	//    0    0:aload_0         
	//    1    1:getfield        #152 <Field SampleQueue[] sampleQueues>
	//    2    4:astore          5
		long l = 0x0L;
	//    3    6:ldc2w           #235 <Long 0x0L>
	//    4    9:lstore_3        
		int i = 0;
	//    5   10:iconst_0        
	//    6   11:istore_1        
		for(int j = asamplequeue.length; i < j; i++)
	//*   7   12:aload           5
	//*   8   14:arraylength     
	//*   9   15:istore_2        
	//*  10   16:iload_1         
	//*  11   17:iload_2         
	//*  12   18:icmpge          40
			l = Math.max(l, asamplequeue[i].getLargestQueuedTimestampUs());
	//   13   21:lload_3         
	//   14   22:aload           5
	//   15   24:iload_1         
	//   16   25:aaload          
	//   17   26:invokevirtual   #238 <Method long SampleQueue.getLargestQueuedTimestampUs()>
	//   18   29:invokestatic    #244 <Method long Math.max(long, long)>
	//   19   32:lstore_3        

	//   20   33:iload_1         
	//   21   34:iconst_1        
	//   22   35:iadd            
	//   23   36:istore_1        
	//*  24   37:goto            16
		return l;
	//   25   40:lload_3         
	//   26   41:lreturn         
	}

	private static boolean isLoadableExceptionFatal(IOException ioexception)
	{
		return ioexception instanceof UnrecognizedInputFormatException;
	//    0    0:aload_0         
	//    1    1:instanceof      #248 <Class UnrecognizedInputFormatException>
	//    2    4:ireturn         
	}

	private boolean isPendingReset()
	{
		return pendingResetPositionUs != 0x1L;
	//    0    0:aload_0         
	//    1    1:getfield        #156 <Field long pendingResetPositionUs>
	//    2    4:ldc2w           #153 <Long 0x1L>
	//    3    7:lcmp            
	//    4    8:ifeq            13
	//    5   11:iconst_1        
	//    6   12:ireturn         
	//    7   13:iconst_0        
	//    8   14:ireturn         
	}

	private void maybeFinishPrepare()
	{
		if(!released && !prepared && seekMap != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #179 <Field boolean released>
	//*   2    4:ifne            309
	//*   3    7:aload_0         
	//*   4    8:getfield        #203 <Field boolean prepared>
	//*   5   11:ifne            309
	//*   6   14:aload_0         
	//*   7   15:getfield        #195 <Field SeekMap seekMap>
	//*   8   18:ifnull          309
		{
			if(!sampleQueuesBuilt)
	//*   9   21:aload_0         
	//*  10   22:getfield        #251 <Field boolean sampleQueuesBuilt>
	//*  11   25:ifne            29
				return;
	//   12   28:return          
			Object aobj[] = ((Object []) (sampleQueues));
	//   13   29:aload_0         
	//   14   30:getfield        #152 <Field SampleQueue[] sampleQueues>
	//   15   33:astore          5
			int k = aobj.length;
	//   16   35:aload           5
	//   17   37:arraylength     
	//   18   38:istore_2        
			for(int i = 0; i < k; i++)
	//*  19   39:iconst_0        
	//*  20   40:istore_1        
	//*  21   41:iload_1         
	//*  22   42:iload_2         
	//*  23   43:icmpge          64
				if(aobj[i].getUpstreamFormat() == null)
	//*  24   46:aload           5
	//*  25   48:iload_1         
	//*  26   49:aaload          
	//*  27   50:invokevirtual   #255 <Method Format SampleQueue.getUpstreamFormat()>
	//*  28   53:ifnonnull       57
					return;
	//   29   56:return          

	//   30   57:iload_1         
	//   31   58:iconst_1        
	//   32   59:iadd            
	//   33   60:istore_1        
	//*  34   61:goto            41
			loadCondition.close();
	//   35   64:aload_0         
	//   36   65:getfield        #133 <Field ConditionVariable loadCondition>
	//   37   68:invokevirtual   #258 <Method boolean ConditionVariable.close()>
	//   38   71:pop             
			k = sampleQueues.length;
	//   39   72:aload_0         
	//   40   73:getfield        #152 <Field SampleQueue[] sampleQueues>
	//   41   76:arraylength     
	//   42   77:istore_2        
			aobj = ((Object []) (new TrackGroup[k]));
	//   43   78:iload_2         
	//   44   79:anewarray       TrackGroup[]
	//   45   82:astore          5
			trackIsAudioVideoFlags = new boolean[k];
	//   46   84:aload_0         
	//   47   85:iload_2         
	//   48   86:newarray        boolean[]
	//   49   88:putfield        #262 <Field boolean[] trackIsAudioVideoFlags>
			trackEnabledStates = new boolean[k];
	//   50   91:aload_0         
	//   51   92:iload_2         
	//   52   93:newarray        boolean[]
	//   53   95:putfield        #264 <Field boolean[] trackEnabledStates>
			trackFormatNotificationSent = new boolean[k];
	//   54   98:aload_0         
	//   55   99:iload_2         
	//   56  100:newarray        boolean[]
	//   57  102:putfield        #266 <Field boolean[] trackFormatNotificationSent>
			durationUs = seekMap.getDurationUs();
	//   58  105:aload_0         
	//   59  106:aload_0         
	//   60  107:getfield        #195 <Field SeekMap seekMap>
	//   61  110:invokeinterface #201 <Method long SeekMap.getDurationUs()>
	//   62  115:putfield        #162 <Field long durationUs>
			int j = 0;
	//   63  118:iconst_0        
	//   64  119:istore_1        
			do
			{
				boolean flag1 = true;
	//   65  120:iconst_1        
	//   66  121:istore          4
				if(j >= k)
					break;
	//   67  123:iload_1         
	//   68  124:iload_2         
	//   69  125:icmpge          217
				Object obj = ((Object) (sampleQueues[j].getUpstreamFormat()));
	//   70  128:aload_0         
	//   71  129:getfield        #152 <Field SampleQueue[] sampleQueues>
	//   72  132:iload_1         
	//   73  133:aaload          
	//   74  134:invokevirtual   #255 <Method Format SampleQueue.getUpstreamFormat()>
	//   75  137:astore          6
				aobj[j] = new TrackGroup(new Format[] {
					obj
				});
	//   76  139:aload           5
	//   77  141:iload_1         
	//   78  142:new             #260 <Class TrackGroup>
	//   79  145:dup             
	//   80  146:iconst_1        
	//   81  147:anewarray       Format[]
	//   82  150:dup             
	//   83  151:iconst_0        
	//   84  152:aload           6
	//   85  154:aastore         
	//   86  155:invokespecial   #271 <Method void TrackGroup(Format[])>
	//   87  158:aastore         
				obj = ((Object) (((Format) (obj)).sampleMimeType));
	//   88  159:aload           6
	//   89  161:getfield        #274 <Field String Format.sampleMimeType>
	//   90  164:astore          6
				boolean flag = flag1;
	//   91  166:iload           4
	//   92  168:istore_3        
				if(!MimeTypes.isVideo(((String) (obj))))
	//*  93  169:aload           6
	//*  94  171:invokestatic    #280 <Method boolean MimeTypes.isVideo(String)>
	//*  95  174:ifne            193
					if(MimeTypes.isAudio(((String) (obj))))
	//*  96  177:aload           6
	//*  97  179:invokestatic    #283 <Method boolean MimeTypes.isAudio(String)>
	//*  98  182:ifeq            191
						flag = flag1;
	//   99  185:iload           4
	//  100  187:istore_3        
					else
	//* 101  188:goto            193
						flag = false;
	//  102  191:iconst_0        
	//  103  192:istore_3        
				trackIsAudioVideoFlags[j] = flag;
	//  104  193:aload_0         
	//  105  194:getfield        #262 <Field boolean[] trackIsAudioVideoFlags>
	//  106  197:iload_1         
	//  107  198:iload_3         
	//  108  199:bastore         
				haveAudioVideoTracks = flag | haveAudioVideoTracks;
	//  109  200:aload_0         
	//  110  201:iload_3         
	//  111  202:aload_0         
	//  112  203:getfield        #285 <Field boolean haveAudioVideoTracks>
	//  113  206:ior             
	//  114  207:putfield        #285 <Field boolean haveAudioVideoTracks>
				j++;
	//  115  210:iload_1         
	//  116  211:iconst_1        
	//  117  212:iadd            
	//  118  213:istore_1        
			} while(true);
	//  119  214:goto            120
			tracks = new TrackGroupArray(((TrackGroup []) (aobj)));
	//  120  217:aload_0         
	//  121  218:new             #287 <Class TrackGroupArray>
	//  122  221:dup             
	//  123  222:aload           5
	//  124  224:invokespecial   #290 <Method void TrackGroupArray(TrackGroup[])>
	//  125  227:putfield        #292 <Field TrackGroupArray tracks>
			if(minLoadableRetryCount == -1 && length == -1L && seekMap.getDurationUs() == 0x1L)
	//* 126  230:aload_0         
	//* 127  231:getfield        #104 <Field int minLoadableRetryCount>
	//* 128  234:iconst_m1       
	//* 129  235:icmpne          271
	//* 130  238:aload_0         
	//* 131  239:getfield        #160 <Field long length>
	//* 132  242:ldc2w           #157 <Long -1L>
	//* 133  245:lcmp            
	//* 134  246:ifne            271
	//* 135  249:aload_0         
	//* 136  250:getfield        #195 <Field SeekMap seekMap>
	//* 137  253:invokeinterface #201 <Method long SeekMap.getDurationUs()>
	//* 138  258:ldc2w           #153 <Long 0x1L>
	//* 139  261:lcmp            
	//* 140  262:ifne            271
				actualMinLoadableRetryCount = 6;
	//  141  265:aload_0         
	//  142  266:bipush          6
	//  143  268:putfield        #164 <Field int actualMinLoadableRetryCount>
			prepared = true;
	//  144  271:aload_0         
	//  145  272:iconst_1        
	//  146  273:putfield        #203 <Field boolean prepared>
			listener.onSourceInfoRefreshed(durationUs, seekMap.isSeekable());
	//  147  276:aload_0         
	//  148  277:getfield        #108 <Field ExtractorMediaPeriod$Listener listener>
	//  149  280:aload_0         
	//  150  281:getfield        #162 <Field long durationUs>
	//  151  284:aload_0         
	//  152  285:getfield        #195 <Field SeekMap seekMap>
	//  153  288:invokeinterface #295 <Method boolean SeekMap.isSeekable()>
	//  154  293:invokeinterface #299 <Method void ExtractorMediaPeriod$Listener.onSourceInfoRefreshed(long, boolean)>
			callback.onPrepared(((MediaPeriod) (this)));
	//  155  298:aload_0         
	//  156  299:getfield        #187 <Field MediaPeriod$Callback callback>
	//  157  302:aload_0         
	//  158  303:invokeinterface #305 <Method void MediaPeriod$Callback.onPrepared(MediaPeriod)>
			return;
	//  159  308:return          
		} else
		{
			return;
	//  160  309:return          
		}
	}

	private void maybeNotifyTrackFormat(int i)
	{
		if(!trackFormatNotificationSent[i])
	//*   0    0:aload_0         
	//*   1    1:getfield        #266 <Field boolean[] trackFormatNotificationSent>
	//*   2    4:iload_1         
	//*   3    5:baload          
	//*   4    6:ifne            50
		{
			Format format = tracks.get(i).getFormat(0);
	//    5    9:aload_0         
	//    6   10:getfield        #292 <Field TrackGroupArray tracks>
	//    7   13:iload_1         
	//    8   14:invokevirtual   #311 <Method TrackGroup TrackGroupArray.get(int)>
	//    9   17:iconst_0        
	//   10   18:invokevirtual   #315 <Method Format TrackGroup.getFormat(int)>
	//   11   21:astore_2        
			eventDispatcher.downstreamFormatChanged(MimeTypes.getTrackType(format.sampleMimeType), format, 0, ((Object) (null)), lastSeekPositionUs);
	//   12   22:aload_0         
	//   13   23:getfield        #106 <Field MediaSourceEventListener$EventDispatcher eventDispatcher>
	//   14   26:aload_2         
	//   15   27:getfield        #274 <Field String Format.sampleMimeType>
	//   16   30:invokestatic    #319 <Method int MimeTypes.getTrackType(String)>
	//   17   33:aload_2         
	//   18   34:iconst_0        
	//   19   35:aconst_null     
	//   20   36:aload_0         
	//   21   37:getfield        #213 <Field long lastSeekPositionUs>
	//   22   40:invokevirtual   #323 <Method void MediaSourceEventListener$EventDispatcher.downstreamFormatChanged(int, Format, int, Object, long)>
			trackFormatNotificationSent[i] = true;
	//   23   43:aload_0         
	//   24   44:getfield        #266 <Field boolean[] trackFormatNotificationSent>
	//   25   47:iload_1         
	//   26   48:iconst_1        
	//   27   49:bastore         
		}
	//   28   50:return          
	}

	private void maybeStartDeferredRetry(int i)
	{
		if(pendingDeferredRetry && trackIsAudioVideoFlags[i])
	//*   0    0:aload_0         
	//*   1    1:getfield        #209 <Field boolean pendingDeferredRetry>
	//*   2    4:ifeq            93
	//*   3    7:aload_0         
	//*   4    8:getfield        #262 <Field boolean[] trackIsAudioVideoFlags>
	//*   5   11:iload_1         
	//*   6   12:baload          
	//*   7   13:ifeq            93
		{
			if(sampleQueues[i].hasNextSample())
	//*   8   16:aload_0         
	//*   9   17:getfield        #152 <Field SampleQueue[] sampleQueues>
	//*  10   20:iload_1         
	//*  11   21:aaload          
	//*  12   22:invokevirtual   #327 <Method boolean SampleQueue.hasNextSample()>
	//*  13   25:ifeq            29
				return;
	//   14   28:return          
			pendingResetPositionUs = 0L;
	//   15   29:aload_0         
	//   16   30:lconst_0        
	//   17   31:putfield        #156 <Field long pendingResetPositionUs>
			i = 0;
	//   18   34:iconst_0        
	//   19   35:istore_1        
			pendingDeferredRetry = false;
	//   20   36:aload_0         
	//   21   37:iconst_0        
	//   22   38:putfield        #209 <Field boolean pendingDeferredRetry>
			notifyDiscontinuity = true;
	//   23   41:aload_0         
	//   24   42:iconst_1        
	//   25   43:putfield        #211 <Field boolean notifyDiscontinuity>
			lastSeekPositionUs = 0L;
	//   26   46:aload_0         
	//   27   47:lconst_0        
	//   28   48:putfield        #213 <Field long lastSeekPositionUs>
			extractedSamplesCountAtStartOfLoad = 0;
	//   29   51:aload_0         
	//   30   52:iconst_0        
	//   31   53:putfield        #215 <Field int extractedSamplesCountAtStartOfLoad>
			SampleQueue asamplequeue[] = sampleQueues;
	//   32   56:aload_0         
	//   33   57:getfield        #152 <Field SampleQueue[] sampleQueues>
	//   34   60:astore_3        
			for(int j = asamplequeue.length; i < j; i++)
	//*  35   61:aload_3         
	//*  36   62:arraylength     
	//*  37   63:istore_2        
	//*  38   64:iload_1         
	//*  39   65:iload_2         
	//*  40   66:icmpge          82
				asamplequeue[i].reset();
	//   41   69:aload_3         
	//   42   70:iload_1         
	//   43   71:aaload          
	//   44   72:invokevirtual   #218 <Method void SampleQueue.reset()>

	//   45   75:iload_1         
	//   46   76:iconst_1        
	//   47   77:iadd            
	//   48   78:istore_1        
	//*  49   79:goto            64
			callback.onContinueLoadingRequested(((SequenceableLoader) (this)));
	//   50   82:aload_0         
	//   51   83:getfield        #187 <Field MediaPeriod$Callback callback>
	//   52   86:aload_0         
	//   53   87:invokeinterface #331 <Method void MediaPeriod$Callback.onContinueLoadingRequested(SequenceableLoader)>
			return;
	//   54   92:return          
		} else
		{
			return;
	//   55   93:return          
		}
	}

	private boolean seekInsideBufferUs(long l)
	{
		int j = sampleQueues.length;
	//    0    0:aload_0         
	//    1    1:getfield        #152 <Field SampleQueue[] sampleQueues>
	//    2    4:arraylength     
	//    3    5:istore          5
		int i = 0;
	//    4    7:iconst_0        
	//    5    8:istore_3        
		do
		{
			boolean flag = true;
	//    6    9:iconst_1        
	//    7   10:istore          4
			if(i < j)
	//*   8   12:iload_3         
	//*   9   13:iload           5
	//*  10   15:icmpge          79
			{
				SampleQueue samplequeue = sampleQueues[i];
	//   11   18:aload_0         
	//   12   19:getfield        #152 <Field SampleQueue[] sampleQueues>
	//   13   22:iload_3         
	//   14   23:aaload          
	//   15   24:astore          6
				samplequeue.rewind();
	//   16   26:aload           6
	//   17   28:invokevirtual   #336 <Method void SampleQueue.rewind()>
				if(samplequeue.advanceTo(l, true, false) == -1)
	//*  18   31:aload           6
	//*  19   33:lload_1         
	//*  20   34:iconst_1        
	//*  21   35:iconst_0        
	//*  22   36:invokevirtual   #340 <Method int SampleQueue.advanceTo(long, boolean, boolean)>
	//*  23   39:iconst_m1       
	//*  24   40:icmpeq          46
	//*  25   43:goto            49
					flag = false;
	//   26   46:iconst_0        
	//   27   47:istore          4
				if(!flag && (trackIsAudioVideoFlags[i] || !haveAudioVideoTracks))
	//*  28   49:iload           4
	//*  29   51:ifne            72
	//*  30   54:aload_0         
	//*  31   55:getfield        #262 <Field boolean[] trackIsAudioVideoFlags>
	//*  32   58:iload_3         
	//*  33   59:baload          
	//*  34   60:ifne            70
	//*  35   63:aload_0         
	//*  36   64:getfield        #285 <Field boolean haveAudioVideoTracks>
	//*  37   67:ifne            72
					return false;
	//   38   70:iconst_0        
	//   39   71:ireturn         
				i++;
	//   40   72:iload_3         
	//   41   73:iconst_1        
	//   42   74:iadd            
	//   43   75:istore_3        
			} else
	//*  44   76:goto            9
			{
				return true;
	//   45   79:iconst_1        
	//   46   80:ireturn         
			}
		} while(true);
	}

	private void startLoading()
	{
		ExtractingLoadable extractingloadable = new ExtractingLoadable(uri, dataSource, extractorHolder, loadCondition);
	//    0    0:new             #21  <Class ExtractorMediaPeriod$ExtractingLoadable>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:getfield        #100 <Field Uri uri>
	//    5    9:aload_0         
	//    6   10:getfield        #102 <Field DataSource dataSource>
	//    7   13:aload_0         
	//    8   14:getfield        #128 <Field ExtractorMediaPeriod$ExtractorHolder extractorHolder>
	//    9   17:aload_0         
	//   10   18:getfield        #133 <Field ConditionVariable loadCondition>
	//   11   21:invokespecial   #344 <Method void ExtractorMediaPeriod$ExtractingLoadable(ExtractorMediaPeriod, Uri, DataSource, ExtractorMediaPeriod$ExtractorHolder, ConditionVariable)>
	//   12   24:astore_3        
		if(prepared)
	//*  13   25:aload_0         
	//*  14   26:getfield        #203 <Field boolean prepared>
	//*  15   29:ifeq            109
		{
			Assertions.checkState(isPendingReset());
	//   16   32:aload_0         
	//   17   33:invokespecial   #346 <Method boolean isPendingReset()>
	//   18   36:invokestatic    #352 <Method void Assertions.checkState(boolean)>
			if(durationUs != 0x1L && pendingResetPositionUs >= durationUs)
	//*  19   39:aload_0         
	//*  20   40:getfield        #162 <Field long durationUs>
	//*  21   43:ldc2w           #153 <Long 0x1L>
	//*  22   46:lcmp            
	//*  23   47:ifeq            75
	//*  24   50:aload_0         
	//*  25   51:getfield        #156 <Field long pendingResetPositionUs>
	//*  26   54:aload_0         
	//*  27   55:getfield        #162 <Field long durationUs>
	//*  28   58:lcmp            
	//*  29   59:iflt            75
			{
				loadingFinished = true;
	//   30   62:aload_0         
	//   31   63:iconst_1        
	//   32   64:putfield        #354 <Field boolean loadingFinished>
				pendingResetPositionUs = 0x1L;
	//   33   67:aload_0         
	//   34   68:ldc2w           #153 <Long 0x1L>
	//   35   71:putfield        #156 <Field long pendingResetPositionUs>
				return;
	//   36   74:return          
			}
			extractingloadable.setLoadPosition(seekMap.getSeekPoints(pendingResetPositionUs).first.position, pendingResetPositionUs);
	//   37   75:aload_3         
	//   38   76:aload_0         
	//   39   77:getfield        #195 <Field SeekMap seekMap>
	//   40   80:aload_0         
	//   41   81:getfield        #156 <Field long pendingResetPositionUs>
	//   42   84:invokeinterface #358 <Method com.google.android.exoplayer2.extractor.SeekMap$SeekPoints SeekMap.getSeekPoints(long)>
	//   43   89:getfield        #364 <Field SeekPoint com.google.android.exoplayer2.extractor.SeekMap$SeekPoints.first>
	//   44   92:getfield        #369 <Field long SeekPoint.position>
	//   45   95:aload_0         
	//   46   96:getfield        #156 <Field long pendingResetPositionUs>
	//   47   99:invokevirtual   #222 <Method void ExtractorMediaPeriod$ExtractingLoadable.setLoadPosition(long, long)>
			pendingResetPositionUs = 0x1L;
	//   48  102:aload_0         
	//   49  103:ldc2w           #153 <Long 0x1L>
	//   50  106:putfield        #156 <Field long pendingResetPositionUs>
		}
		extractedSamplesCountAtStartOfLoad = getExtractedSamplesCount();
	//   51  109:aload_0         
	//   52  110:aload_0         
	//   53  111:invokespecial   #371 <Method int getExtractedSamplesCount()>
	//   54  114:putfield        #215 <Field int extractedSamplesCountAtStartOfLoad>
		long l = loader.startLoading(((com.google.android.exoplayer2.upstream.Loader.Loadable) (extractingloadable)), ((com.google.android.exoplayer2.upstream.Loader.Callback) (this)), actualMinLoadableRetryCount);
	//   55  117:aload_0         
	//   56  118:getfield        #123 <Field Loader loader>
	//   57  121:aload_3         
	//   58  122:aload_0         
	//   59  123:aload_0         
	//   60  124:getfield        #164 <Field int actualMinLoadableRetryCount>
	//   61  127:invokevirtual   #374 <Method long Loader.startLoading(com.google.android.exoplayer2.upstream.Loader$Loadable, com.google.android.exoplayer2.upstream.Loader$Callback, int)>
	//   62  130:lstore_1        
		eventDispatcher.loadStarted(extractingloadable.dataSpec, 1, -1, ((Format) (null)), 0, ((Object) (null)), extractingloadable.seekTimeUs, durationUs, l);
	//   63  131:aload_0         
	//   64  132:getfield        #106 <Field MediaSourceEventListener$EventDispatcher eventDispatcher>
	//   65  135:aload_3         
	//   66  136:invokestatic    #378 <Method DataSpec ExtractorMediaPeriod$ExtractingLoadable.access$400(ExtractorMediaPeriod$ExtractingLoadable)>
	//   67  139:iconst_1        
	//   68  140:iconst_m1       
	//   69  141:aconst_null     
	//   70  142:iconst_0        
	//   71  143:aconst_null     
	//   72  144:aload_3         
	//   73  145:invokestatic    #381 <Method long ExtractorMediaPeriod$ExtractingLoadable.access$500(ExtractorMediaPeriod$ExtractingLoadable)>
	//   74  148:aload_0         
	//   75  149:getfield        #162 <Field long durationUs>
	//   76  152:lload_1         
	//   77  153:invokevirtual   #385 <Method void MediaSourceEventListener$EventDispatcher.loadStarted(DataSpec, int, int, Format, int, Object, long, long, long)>
	//   78  156:return          
	}

	private boolean suppressRead()
	{
		return notifyDiscontinuity || isPendingReset();
	//    0    0:aload_0         
	//    1    1:getfield        #211 <Field boolean notifyDiscontinuity>
	//    2    4:ifne            19
	//    3    7:aload_0         
	//    4    8:invokespecial   #346 <Method boolean isPendingReset()>
	//    5   11:ifeq            17
	//    6   14:goto            19
	//    7   17:iconst_0        
	//    8   18:ireturn         
	//    9   19:iconst_1        
	//   10   20:ireturn         
	}

	public boolean continueLoading(long l)
	{
		if(!loadingFinished && !pendingDeferredRetry && (!prepared || enabledTrackCount != 0))
	//*   0    0:aload_0         
	//*   1    1:getfield        #354 <Field boolean loadingFinished>
	//*   2    4:ifne            57
	//*   3    7:aload_0         
	//*   4    8:getfield        #209 <Field boolean pendingDeferredRetry>
	//*   5   11:ifne            57
	//*   6   14:aload_0         
	//*   7   15:getfield        #203 <Field boolean prepared>
	//*   8   18:ifeq            31
	//*   9   21:aload_0         
	//*  10   22:getfield        #388 <Field int enabledTrackCount>
	//*  11   25:ifne            31
	//*  12   28:goto            57
		{
			boolean flag = loadCondition.open();
	//   13   31:aload_0         
	//   14   32:getfield        #133 <Field ConditionVariable loadCondition>
	//   15   35:invokevirtual   #391 <Method boolean ConditionVariable.open()>
	//   16   38:istore_3        
			if(!loader.isLoading())
	//*  17   39:aload_0         
	//*  18   40:getfield        #123 <Field Loader loader>
	//*  19   43:invokevirtual   #394 <Method boolean Loader.isLoading()>
	//*  20   46:ifne            55
			{
				startLoading();
	//   21   49:aload_0         
	//   22   50:invokespecial   #396 <Method void startLoading()>
				flag = true;
	//   23   53:iconst_1        
	//   24   54:istore_3        
			}
			return flag;
	//   25   55:iload_3         
	//   26   56:ireturn         
		} else
		{
			return false;
	//   27   57:iconst_0        
	//   28   58:ireturn         
		}
	}

	public void discardBuffer(long l, boolean flag)
	{
		SampleQueue asamplequeue[] = sampleQueues;
	//    0    0:aload_0         
	//    1    1:getfield        #152 <Field SampleQueue[] sampleQueues>
	//    2    4:astore          6
		int i = 0;
	//    3    6:iconst_0        
	//    4    7:istore          4
		for(int j = asamplequeue.length; i < j; i++)
	//*   5    9:aload           6
	//*   6   11:arraylength     
	//*   7   12:istore          5
	//*   8   14:iload           4
	//*   9   16:iload           5
	//*  10   18:icmpge          49
			sampleQueues[i].discardTo(l, flag, trackEnabledStates[i]);
	//   11   21:aload_0         
	//   12   22:getfield        #152 <Field SampleQueue[] sampleQueues>
	//   13   25:iload           4
	//   14   27:aaload          
	//   15   28:lload_1         
	//   16   29:iload_3         
	//   17   30:aload_0         
	//   18   31:getfield        #264 <Field boolean[] trackEnabledStates>
	//   19   34:iload           4
	//   20   36:baload          
	//   21   37:invokevirtual   #401 <Method void SampleQueue.discardTo(long, boolean, boolean)>

	//   22   40:iload           4
	//   23   42:iconst_1        
	//   24   43:iadd            
	//   25   44:istore          4
	//*  26   46:goto            14
	//   27   49:return          
	}

	public void endTracks()
	{
		sampleQueuesBuilt = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #251 <Field boolean sampleQueuesBuilt>
		handler.post(maybeFinishPrepareRunnable);
	//    3    5:aload_0         
	//    4    6:getfield        #146 <Field Handler handler>
	//    5    9:aload_0         
	//    6   10:getfield        #138 <Field Runnable maybeFinishPrepareRunnable>
	//    7   13:invokevirtual   #406 <Method boolean Handler.post(Runnable)>
	//    8   16:pop             
	//    9   17:return          
	}

	public long getAdjustedSeekPositionUs(long l, SeekParameters seekparameters)
	{
		if(!seekMap.isSeekable())
	//*   0    0:aload_0         
	//*   1    1:getfield        #195 <Field SeekMap seekMap>
	//*   2    4:invokeinterface #295 <Method boolean SeekMap.isSeekable()>
	//*   3    9:ifne            14
		{
			return 0L;
	//    4   12:lconst_0        
	//    5   13:lreturn         
		} else
		{
			com.google.android.exoplayer2.extractor.SeekMap.SeekPoints seekpoints = seekMap.getSeekPoints(l);
	//    6   14:aload_0         
	//    7   15:getfield        #195 <Field SeekMap seekMap>
	//    8   18:lload_1         
	//    9   19:invokeinterface #358 <Method com.google.android.exoplayer2.extractor.SeekMap$SeekPoints SeekMap.getSeekPoints(long)>
	//   10   24:astore          4
			return Util.resolveSeekPositionUs(l, seekparameters, seekpoints.first.timeUs, seekpoints.second.timeUs);
	//   11   26:lload_1         
	//   12   27:aload_3         
	//   13   28:aload           4
	//   14   30:getfield        #364 <Field SeekPoint com.google.android.exoplayer2.extractor.SeekMap$SeekPoints.first>
	//   15   33:getfield        #411 <Field long SeekPoint.timeUs>
	//   16   36:aload           4
	//   17   38:getfield        #414 <Field SeekPoint com.google.android.exoplayer2.extractor.SeekMap$SeekPoints.second>
	//   18   41:getfield        #411 <Field long SeekPoint.timeUs>
	//   19   44:invokestatic    #420 <Method long Util.resolveSeekPositionUs(long, SeekParameters, long, long)>
	//   20   47:lreturn         
		}
	}

	public long getBufferedPositionUs()
	{
		if(loadingFinished)
	//*   0    0:aload_0         
	//*   1    1:getfield        #354 <Field boolean loadingFinished>
	//*   2    4:ifeq            11
			return 0x0L;
	//    3    7:ldc2w           #235 <Long 0x0L>
	//    4   10:lreturn         
		if(isPendingReset())
	//*   5   11:aload_0         
	//*   6   12:invokespecial   #346 <Method boolean isPendingReset()>
	//*   7   15:ifeq            23
			return pendingResetPositionUs;
	//    8   18:aload_0         
	//    9   19:getfield        #156 <Field long pendingResetPositionUs>
	//   10   22:lreturn         
		long l2;
		if(haveAudioVideoTracks)
	//*  11   23:aload_0         
	//*  12   24:getfield        #285 <Field boolean haveAudioVideoTracks>
	//*  13   27:ifeq            87
		{
			long l = 0xffffffffL;
	//   14   30:ldc2w           #422 <Long 0xffffffffL>
	//   15   33:lstore_3        
			int j = sampleQueues.length;
	//   16   34:aload_0         
	//   17   35:getfield        #152 <Field SampleQueue[] sampleQueues>
	//   18   38:arraylength     
	//   19   39:istore_2        
			int i = 0;
	//   20   40:iconst_0        
	//   21   41:istore_1        
			do
			{
				l2 = l;
	//   22   42:lload_3         
	//   23   43:lstore          5
				if(i >= j)
					break;
	//   24   45:iload_1         
	//   25   46:iload_2         
	//   26   47:icmpge          93
				l2 = l;
	//   27   50:lload_3         
	//   28   51:lstore          5
				if(trackIsAudioVideoFlags[i])
	//*  29   53:aload_0         
	//*  30   54:getfield        #262 <Field boolean[] trackIsAudioVideoFlags>
	//*  31   57:iload_1         
	//*  32   58:baload          
	//*  33   59:ifeq            77
					l2 = Math.min(l, sampleQueues[i].getLargestQueuedTimestampUs());
	//   34   62:lload_3         
	//   35   63:aload_0         
	//   36   64:getfield        #152 <Field SampleQueue[] sampleQueues>
	//   37   67:iload_1         
	//   38   68:aaload          
	//   39   69:invokevirtual   #238 <Method long SampleQueue.getLargestQueuedTimestampUs()>
	//   40   72:invokestatic    #426 <Method long Math.min(long, long)>
	//   41   75:lstore          5
				i++;
	//   42   77:iload_1         
	//   43   78:iconst_1        
	//   44   79:iadd            
	//   45   80:istore_1        
				l = l2;
	//   46   81:lload           5
	//   47   83:lstore_3        
			} while(true);
	//   48   84:goto            42
		} else
		{
			l2 = getLargestQueuedTimestampUs();
	//   49   87:aload_0         
	//   50   88:invokespecial   #427 <Method long getLargestQueuedTimestampUs()>
	//   51   91:lstore          5
		}
		long l1 = l2;
	//   52   93:lload           5
	//   53   95:lstore_3        
		if(l2 == 0x0L)
	//*  54   96:lload           5
	//*  55   98:ldc2w           #235 <Long 0x0L>
	//*  56  101:lcmp            
	//*  57  102:ifne            110
			l1 = lastSeekPositionUs;
	//   58  105:aload_0         
	//   59  106:getfield        #213 <Field long lastSeekPositionUs>
	//   60  109:lstore_3        
		return l1;
	//   61  110:lload_3         
	//   62  111:lreturn         
	}

	public long getNextLoadPositionUs()
	{
		if(enabledTrackCount == 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #388 <Field int enabledTrackCount>
	//*   2    4:ifne            11
			return 0x0L;
	//    3    7:ldc2w           #235 <Long 0x0L>
	//    4   10:lreturn         
		else
			return getBufferedPositionUs();
	//    5   11:aload_0         
	//    6   12:invokevirtual   #430 <Method long getBufferedPositionUs()>
	//    7   15:lreturn         
	}

	public TrackGroupArray getTrackGroups()
	{
		return tracks;
	//    0    0:aload_0         
	//    1    1:getfield        #292 <Field TrackGroupArray tracks>
	//    2    4:areturn         
	}

	boolean isReady(int i)
	{
		return !suppressRead() && (loadingFinished || sampleQueues[i].hasNextSample());
	//    0    0:aload_0         
	//    1    1:invokespecial   #207 <Method boolean suppressRead()>
	//    2    4:ifne            28
	//    3    7:aload_0         
	//    4    8:getfield        #354 <Field boolean loadingFinished>
	//    5   11:ifne            26
	//    6   14:aload_0         
	//    7   15:getfield        #152 <Field SampleQueue[] sampleQueues>
	//    8   18:iload_1         
	//    9   19:aaload          
	//   10   20:invokevirtual   #327 <Method boolean SampleQueue.hasNextSample()>
	//   11   23:ifeq            28
	//   12   26:iconst_1        
	//   13   27:ireturn         
	//   14   28:iconst_0        
	//   15   29:ireturn         
	}

	void maybeThrowError()
		throws IOException
	{
		loader.maybeThrowError(actualMinLoadableRetryCount);
	//    0    0:aload_0         
	//    1    1:getfield        #123 <Field Loader loader>
	//    2    4:aload_0         
	//    3    5:getfield        #164 <Field int actualMinLoadableRetryCount>
	//    4    8:invokevirtual   #439 <Method void Loader.maybeThrowError(int)>
	//    5   11:return          
	}

	public void maybeThrowPrepareError()
		throws IOException
	{
		maybeThrowError();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #443 <Method void maybeThrowError()>
	//    2    4:return          
	}

	public void onLoadCanceled(ExtractingLoadable extractingloadable, long l, long l1, boolean flag)
	{
		eventDispatcher.loadCanceled(extractingloadable.dataSpec, 1, -1, ((Format) (null)), 0, ((Object) (null)), extractingloadable.seekTimeUs, durationUs, l, l1, extractingloadable.bytesLoaded);
	//    0    0:aload_0         
	//    1    1:getfield        #106 <Field MediaSourceEventListener$EventDispatcher eventDispatcher>
	//    2    4:aload_1         
	//    3    5:invokestatic    #378 <Method DataSpec ExtractorMediaPeriod$ExtractingLoadable.access$400(ExtractorMediaPeriod$ExtractingLoadable)>
	//    4    8:iconst_1        
	//    5    9:iconst_m1       
	//    6   10:aconst_null     
	//    7   11:iconst_0        
	//    8   12:aconst_null     
	//    9   13:aload_1         
	//   10   14:invokestatic    #381 <Method long ExtractorMediaPeriod$ExtractingLoadable.access$500(ExtractorMediaPeriod$ExtractingLoadable)>
	//   11   17:aload_0         
	//   12   18:getfield        #162 <Field long durationUs>
	//   13   21:lload_2         
	//   14   22:lload           4
	//   15   24:aload_1         
	//   16   25:invokestatic    #448 <Method long ExtractorMediaPeriod$ExtractingLoadable.access$600(ExtractorMediaPeriod$ExtractingLoadable)>
	//   17   28:invokevirtual   #452 <Method void MediaSourceEventListener$EventDispatcher.loadCanceled(DataSpec, int, int, Format, int, Object, long, long, long, long, long)>
		if(!flag)
	//*  18   31:iload           6
	//*  19   33:ifne            93
		{
			copyLengthFromLoader(extractingloadable);
	//   20   36:aload_0         
	//   21   37:aload_1         
	//   22   38:invokespecial   #454 <Method void copyLengthFromLoader(ExtractorMediaPeriod$ExtractingLoadable)>
			extractingloadable = ((ExtractingLoadable) (sampleQueues));
	//   23   41:aload_0         
	//   24   42:getfield        #152 <Field SampleQueue[] sampleQueues>
	//   25   45:astore_1        
			int j = extractingloadable.length;
	//   26   46:aload_1         
	//   27   47:arraylength     
	//   28   48:istore          8
			for(int i = 0; i < j; i++)
	//*  29   50:iconst_0        
	//*  30   51:istore          7
	//*  31   53:iload           7
	//*  32   55:iload           8
	//*  33   57:icmpge          76
				((SampleQueue) (extractingloadable[i])).reset();
	//   34   60:aload_1         
	//   35   61:iload           7
	//   36   63:aaload          
	//   37   64:invokevirtual   #218 <Method void SampleQueue.reset()>

	//   38   67:iload           7
	//   39   69:iconst_1        
	//   40   70:iadd            
	//   41   71:istore          7
	//*  42   73:goto            53
			if(enabledTrackCount > 0)
	//*  43   76:aload_0         
	//*  44   77:getfield        #388 <Field int enabledTrackCount>
	//*  45   80:ifle            93
				callback.onContinueLoadingRequested(((SequenceableLoader) (this)));
	//   46   83:aload_0         
	//   47   84:getfield        #187 <Field MediaPeriod$Callback callback>
	//   48   87:aload_0         
	//   49   88:invokeinterface #331 <Method void MediaPeriod$Callback.onContinueLoadingRequested(SequenceableLoader)>
		}
	//   50   93:return          
	}

	public volatile void onLoadCanceled(com.google.android.exoplayer2.upstream.Loader.Loadable loadable, long l, long l1, boolean flag)
	{
		onLoadCanceled((ExtractingLoadable)loadable, l, l1, flag);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #21  <Class ExtractorMediaPeriod$ExtractingLoadable>
	//    3    5:lload_2         
	//    4    6:lload           4
	//    5    8:iload           6
	//    6   10:invokevirtual   #457 <Method void onLoadCanceled(ExtractorMediaPeriod$ExtractingLoadable, long, long, boolean)>
	//    7   13:return          
	}

	public void onLoadCompleted(ExtractingLoadable extractingloadable, long l, long l1)
	{
		if(durationUs == 0x1L)
	//*   0    0:aload_0         
	//*   1    1:getfield        #162 <Field long durationUs>
	//*   2    4:ldc2w           #153 <Long 0x1L>
	//*   3    7:lcmp            
	//*   4    8:ifne            68
		{
			long l2 = getLargestQueuedTimestampUs();
	//    5   11:aload_0         
	//    6   12:invokespecial   #427 <Method long getLargestQueuedTimestampUs()>
	//    7   15:lstore          6
			if(l2 == 0x0L)
	//*   8   17:lload           6
	//*   9   19:ldc2w           #235 <Long 0x0L>
	//*  10   22:lcmp            
	//*  11   23:ifne            32
				l2 = 0L;
	//   12   26:lconst_0        
	//   13   27:lstore          6
			else
	//*  14   29:goto            40
				l2 += 10000L;
	//   15   32:lload           6
	//   16   34:ldc2w           #34  <Long 10000L>
	//   17   37:ladd            
	//   18   38:lstore          6
			durationUs = l2;
	//   19   40:aload_0         
	//   20   41:lload           6
	//   21   43:putfield        #162 <Field long durationUs>
			listener.onSourceInfoRefreshed(durationUs, seekMap.isSeekable());
	//   22   46:aload_0         
	//   23   47:getfield        #108 <Field ExtractorMediaPeriod$Listener listener>
	//   24   50:aload_0         
	//   25   51:getfield        #162 <Field long durationUs>
	//   26   54:aload_0         
	//   27   55:getfield        #195 <Field SeekMap seekMap>
	//   28   58:invokeinterface #295 <Method boolean SeekMap.isSeekable()>
	//   29   63:invokeinterface #299 <Method void ExtractorMediaPeriod$Listener.onSourceInfoRefreshed(long, boolean)>
		}
		eventDispatcher.loadCompleted(extractingloadable.dataSpec, 1, -1, ((Format) (null)), 0, ((Object) (null)), extractingloadable.seekTimeUs, durationUs, l, l1, extractingloadable.bytesLoaded);
	//   30   68:aload_0         
	//   31   69:getfield        #106 <Field MediaSourceEventListener$EventDispatcher eventDispatcher>
	//   32   72:aload_1         
	//   33   73:invokestatic    #378 <Method DataSpec ExtractorMediaPeriod$ExtractingLoadable.access$400(ExtractorMediaPeriod$ExtractingLoadable)>
	//   34   76:iconst_1        
	//   35   77:iconst_m1       
	//   36   78:aconst_null     
	//   37   79:iconst_0        
	//   38   80:aconst_null     
	//   39   81:aload_1         
	//   40   82:invokestatic    #381 <Method long ExtractorMediaPeriod$ExtractingLoadable.access$500(ExtractorMediaPeriod$ExtractingLoadable)>
	//   41   85:aload_0         
	//   42   86:getfield        #162 <Field long durationUs>
	//   43   89:lload_2         
	//   44   90:lload           4
	//   45   92:aload_1         
	//   46   93:invokestatic    #448 <Method long ExtractorMediaPeriod$ExtractingLoadable.access$600(ExtractorMediaPeriod$ExtractingLoadable)>
	//   47   96:invokevirtual   #462 <Method void MediaSourceEventListener$EventDispatcher.loadCompleted(DataSpec, int, int, Format, int, Object, long, long, long, long, long)>
		copyLengthFromLoader(extractingloadable);
	//   48   99:aload_0         
	//   49  100:aload_1         
	//   50  101:invokespecial   #454 <Method void copyLengthFromLoader(ExtractorMediaPeriod$ExtractingLoadable)>
		loadingFinished = true;
	//   51  104:aload_0         
	//   52  105:iconst_1        
	//   53  106:putfield        #354 <Field boolean loadingFinished>
		callback.onContinueLoadingRequested(((SequenceableLoader) (this)));
	//   54  109:aload_0         
	//   55  110:getfield        #187 <Field MediaPeriod$Callback callback>
	//   56  113:aload_0         
	//   57  114:invokeinterface #331 <Method void MediaPeriod$Callback.onContinueLoadingRequested(SequenceableLoader)>
	//   58  119:return          
	}

	public volatile void onLoadCompleted(com.google.android.exoplayer2.upstream.Loader.Loadable loadable, long l, long l1)
	{
		onLoadCompleted((ExtractingLoadable)loadable, l, l1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #21  <Class ExtractorMediaPeriod$ExtractingLoadable>
	//    3    5:lload_2         
	//    4    6:lload           4
	//    5    8:invokevirtual   #465 <Method void onLoadCompleted(ExtractorMediaPeriod$ExtractingLoadable, long, long)>
	//    6   11:return          
	}

	public int onLoadError(ExtractingLoadable extractingloadable, long l, long l1, IOException ioexception)
	{
		boolean flag1 = isLoadableExceptionFatal(ioexception);
	//    0    0:aload           6
	//    1    2:invokestatic    #469 <Method boolean isLoadableExceptionFatal(IOException)>
	//    2    5:istore          10
		eventDispatcher.loadError(extractingloadable.dataSpec, 1, -1, ((Format) (null)), 0, ((Object) (null)), extractingloadable.seekTimeUs, durationUs, l, l1, extractingloadable.bytesLoaded, ioexception, flag1);
	//    3    7:aload_0         
	//    4    8:getfield        #106 <Field MediaSourceEventListener$EventDispatcher eventDispatcher>
	//    5   11:aload_1         
	//    6   12:invokestatic    #378 <Method DataSpec ExtractorMediaPeriod$ExtractingLoadable.access$400(ExtractorMediaPeriod$ExtractingLoadable)>
	//    7   15:iconst_1        
	//    8   16:iconst_m1       
	//    9   17:aconst_null     
	//   10   18:iconst_0        
	//   11   19:aconst_null     
	//   12   20:aload_1         
	//   13   21:invokestatic    #381 <Method long ExtractorMediaPeriod$ExtractingLoadable.access$500(ExtractorMediaPeriod$ExtractingLoadable)>
	//   14   24:aload_0         
	//   15   25:getfield        #162 <Field long durationUs>
	//   16   28:lload_2         
	//   17   29:lload           4
	//   18   31:aload_1         
	//   19   32:invokestatic    #448 <Method long ExtractorMediaPeriod$ExtractingLoadable.access$600(ExtractorMediaPeriod$ExtractingLoadable)>
	//   20   35:aload           6
	//   21   37:iload           10
	//   22   39:invokevirtual   #473 <Method void MediaSourceEventListener$EventDispatcher.loadError(DataSpec, int, int, Format, int, Object, long, long, long, long, long, IOException, boolean)>
		copyLengthFromLoader(extractingloadable);
	//   23   42:aload_0         
	//   24   43:aload_1         
	//   25   44:invokespecial   #454 <Method void copyLengthFromLoader(ExtractorMediaPeriod$ExtractingLoadable)>
		if(flag1)
	//*  26   47:iload           10
	//*  27   49:ifeq            54
			return 3;
	//   28   52:iconst_3        
	//   29   53:ireturn         
		int j = getExtractedSamplesCount();
	//   30   54:aload_0         
	//   31   55:invokespecial   #371 <Method int getExtractedSamplesCount()>
	//   32   58:istore          9
		int i = extractedSamplesCountAtStartOfLoad;
	//   33   60:aload_0         
	//   34   61:getfield        #215 <Field int extractedSamplesCountAtStartOfLoad>
	//   35   64:istore          7
		byte byte0 = 0;
	//   36   66:iconst_0        
	//   37   67:istore          8
		boolean flag;
		if(j > i)
	//*  38   69:iload           9
	//*  39   71:iload           7
	//*  40   73:icmple          82
			flag = true;
	//   41   76:iconst_1        
	//   42   77:istore          7
		else
	//*  43   79:goto            85
			flag = false;
	//   44   82:iconst_0        
	//   45   83:istore          7
		if(configureRetry(extractingloadable, j))
	//*  46   85:aload_0         
	//*  47   86:aload_1         
	//*  48   87:iload           9
	//*  49   89:invokespecial   #475 <Method boolean configureRetry(ExtractorMediaPeriod$ExtractingLoadable, int)>
	//*  50   92:ifeq            102
		{
			if(flag)
	//*  51   95:iload           7
	//*  52   97:ifeq            105
				return 1;
	//   53  100:iconst_1        
	//   54  101:ireturn         
		} else
		{
			byte0 = 2;
	//   55  102:iconst_2        
	//   56  103:istore          8
		}
		return ((int) (byte0));
	//   57  105:iload           8
	//   58  107:ireturn         
	}

	public volatile int onLoadError(com.google.android.exoplayer2.upstream.Loader.Loadable loadable, long l, long l1, IOException ioexception)
	{
		return onLoadError((ExtractingLoadable)loadable, l, l1, ioexception);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #21  <Class ExtractorMediaPeriod$ExtractingLoadable>
	//    3    5:lload_2         
	//    4    6:lload           4
	//    5    8:aload           6
	//    6   10:invokevirtual   #478 <Method int onLoadError(ExtractorMediaPeriod$ExtractingLoadable, long, long, IOException)>
	//    7   13:ireturn         
	}

	public void onLoaderReleased()
	{
		SampleQueue asamplequeue[] = sampleQueues;
	//    0    0:aload_0         
	//    1    1:getfield        #152 <Field SampleQueue[] sampleQueues>
	//    2    4:astore_3        
		int i = 0;
	//    3    5:iconst_0        
	//    4    6:istore_1        
		for(int j = asamplequeue.length; i < j; i++)
	//*   5    7:aload_3         
	//*   6    8:arraylength     
	//*   7    9:istore_2        
	//*   8   10:iload_1         
	//*   9   11:iload_2         
	//*  10   12:icmpge          28
			asamplequeue[i].reset();
	//   11   15:aload_3         
	//   12   16:iload_1         
	//   13   17:aaload          
	//   14   18:invokevirtual   #218 <Method void SampleQueue.reset()>

	//   15   21:iload_1         
	//   16   22:iconst_1        
	//   17   23:iadd            
	//   18   24:istore_1        
	//*  19   25:goto            10
		extractorHolder.release();
	//   20   28:aload_0         
	//   21   29:getfield        #128 <Field ExtractorMediaPeriod$ExtractorHolder extractorHolder>
	//   22   32:invokevirtual   #482 <Method void ExtractorMediaPeriod$ExtractorHolder.release()>
	//   23   35:return          
	}

	public void onUpstreamFormatChanged(Format format)
	{
		handler.post(maybeFinishPrepareRunnable);
	//    0    0:aload_0         
	//    1    1:getfield        #146 <Field Handler handler>
	//    2    4:aload_0         
	//    3    5:getfield        #138 <Field Runnable maybeFinishPrepareRunnable>
	//    4    8:invokevirtual   #406 <Method boolean Handler.post(Runnable)>
	//    5   11:pop             
	//    6   12:return          
	}

	public void prepare(MediaPeriod.Callback callback1, long l)
	{
		callback = callback1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #187 <Field MediaPeriod$Callback callback>
		loadCondition.open();
	//    3    5:aload_0         
	//    4    6:getfield        #133 <Field ConditionVariable loadCondition>
	//    5    9:invokevirtual   #391 <Method boolean ConditionVariable.open()>
	//    6   12:pop             
		startLoading();
	//    7   13:aload_0         
	//    8   14:invokespecial   #396 <Method void startLoading()>
	//    9   17:return          
	}

	int readData(int i, FormatHolder formatholder, DecoderInputBuffer decoderinputbuffer, boolean flag)
	{
		if(suppressRead())
	//*   0    0:aload_0         
	//*   1    1:invokespecial   #207 <Method boolean suppressRead()>
	//*   2    4:ifeq            10
			return -3;
	//    3    7:bipush          -3
	//    4    9:ireturn         
		int j = sampleQueues[i].read(formatholder, decoderinputbuffer, flag, loadingFinished, lastSeekPositionUs);
	//    5   10:aload_0         
	//    6   11:getfield        #152 <Field SampleQueue[] sampleQueues>
	//    7   14:iload_1         
	//    8   15:aaload          
	//    9   16:aload_2         
	//   10   17:aload_3         
	//   11   18:iload           4
	//   12   20:aload_0         
	//   13   21:getfield        #354 <Field boolean loadingFinished>
	//   14   24:aload_0         
	//   15   25:getfield        #213 <Field long lastSeekPositionUs>
	//   16   28:invokevirtual   #492 <Method int SampleQueue.read(FormatHolder, DecoderInputBuffer, boolean, boolean, long)>
	//   17   31:istore          5
		if(j == -4)
	//*  18   33:iload           5
	//*  19   35:bipush          -4
	//*  20   37:icmpne          48
		{
			maybeNotifyTrackFormat(i);
	//   21   40:aload_0         
	//   22   41:iload_1         
	//   23   42:invokespecial   #494 <Method void maybeNotifyTrackFormat(int)>
			return j;
	//   24   45:iload           5
	//   25   47:ireturn         
		}
		if(j == -3)
	//*  26   48:iload           5
	//*  27   50:bipush          -3
	//*  28   52:icmpne          60
			maybeStartDeferredRetry(i);
	//   29   55:aload_0         
	//   30   56:iload_1         
	//   31   57:invokespecial   #496 <Method void maybeStartDeferredRetry(int)>
		return j;
	//   32   60:iload           5
	//   33   62:ireturn         
	}

	public long readDiscontinuity()
	{
		if(!notifiedReadingStarted)
	//*   0    0:aload_0         
	//*   1    1:getfield        #499 <Field boolean notifiedReadingStarted>
	//*   2    4:ifne            19
		{
			eventDispatcher.readingStarted();
	//    3    7:aload_0         
	//    4    8:getfield        #106 <Field MediaSourceEventListener$EventDispatcher eventDispatcher>
	//    5   11:invokevirtual   #502 <Method void MediaSourceEventListener$EventDispatcher.readingStarted()>
			notifiedReadingStarted = true;
	//    6   14:aload_0         
	//    7   15:iconst_1        
	//    8   16:putfield        #499 <Field boolean notifiedReadingStarted>
		}
		if(notifyDiscontinuity && (loadingFinished || getExtractedSamplesCount() > extractedSamplesCountAtStartOfLoad))
	//*   9   19:aload_0         
	//*  10   20:getfield        #211 <Field boolean notifyDiscontinuity>
	//*  11   23:ifeq            54
	//*  12   26:aload_0         
	//*  13   27:getfield        #354 <Field boolean loadingFinished>
	//*  14   30:ifne            44
	//*  15   33:aload_0         
	//*  16   34:invokespecial   #371 <Method int getExtractedSamplesCount()>
	//*  17   37:aload_0         
	//*  18   38:getfield        #215 <Field int extractedSamplesCountAtStartOfLoad>
	//*  19   41:icmple          54
		{
			notifyDiscontinuity = false;
	//   20   44:aload_0         
	//   21   45:iconst_0        
	//   22   46:putfield        #211 <Field boolean notifyDiscontinuity>
			return lastSeekPositionUs;
	//   23   49:aload_0         
	//   24   50:getfield        #213 <Field long lastSeekPositionUs>
	//   25   53:lreturn         
		} else
		{
			return 0x1L;
	//   26   54:ldc2w           #153 <Long 0x1L>
	//   27   57:lreturn         
		}
	}

	public void reevaluateBuffer(long l)
	{
	//    0    0:return          
	}

	public void release()
	{
		if(prepared)
	//*   0    0:aload_0         
	//*   1    1:getfield        #203 <Field boolean prepared>
	//*   2    4:ifeq            35
		{
			SampleQueue asamplequeue[] = sampleQueues;
	//    3    7:aload_0         
	//    4    8:getfield        #152 <Field SampleQueue[] sampleQueues>
	//    5   11:astore_3        
			int j = asamplequeue.length;
	//    6   12:aload_3         
	//    7   13:arraylength     
	//    8   14:istore_2        
			for(int i = 0; i < j; i++)
	//*   9   15:iconst_0        
	//*  10   16:istore_1        
	//*  11   17:iload_1         
	//*  12   18:iload_2         
	//*  13   19:icmpge          35
				asamplequeue[i].discardToEnd();
	//   14   22:aload_3         
	//   15   23:iload_1         
	//   16   24:aaload          
	//   17   25:invokevirtual   #507 <Method void SampleQueue.discardToEnd()>

	//   18   28:iload_1         
	//   19   29:iconst_1        
	//   20   30:iadd            
	//   21   31:istore_1        
		}
	//*  22   32:goto            17
		loader.release(((com.google.android.exoplayer2.upstream.Loader.ReleaseCallback) (this)));
	//   23   35:aload_0         
	//   24   36:getfield        #123 <Field Loader loader>
	//   25   39:aload_0         
	//   26   40:invokevirtual   #510 <Method void Loader.release(com.google.android.exoplayer2.upstream.Loader$ReleaseCallback)>
		handler.removeCallbacksAndMessages(((Object) (null)));
	//   27   43:aload_0         
	//   28   44:getfield        #146 <Field Handler handler>
	//   29   47:aconst_null     
	//   30   48:invokevirtual   #514 <Method void Handler.removeCallbacksAndMessages(Object)>
		callback = null;
	//   31   51:aload_0         
	//   32   52:aconst_null     
	//   33   53:putfield        #187 <Field MediaPeriod$Callback callback>
		released = true;
	//   34   56:aload_0         
	//   35   57:iconst_1        
	//   36   58:putfield        #179 <Field boolean released>
		eventDispatcher.mediaPeriodReleased();
	//   37   61:aload_0         
	//   38   62:getfield        #106 <Field MediaSourceEventListener$EventDispatcher eventDispatcher>
	//   39   65:invokevirtual   #517 <Method void MediaSourceEventListener$EventDispatcher.mediaPeriodReleased()>
	//   40   68:return          
	}

	public void seekMap(SeekMap seekmap)
	{
		seekMap = seekmap;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #195 <Field SeekMap seekMap>
		handler.post(maybeFinishPrepareRunnable);
	//    3    5:aload_0         
	//    4    6:getfield        #146 <Field Handler handler>
	//    5    9:aload_0         
	//    6   10:getfield        #138 <Field Runnable maybeFinishPrepareRunnable>
	//    7   13:invokevirtual   #406 <Method boolean Handler.post(Runnable)>
	//    8   16:pop             
	//    9   17:return          
	}

	public long seekToUs(long l)
	{
		if(!seekMap.isSeekable())
	//*   0    0:aload_0         
	//*   1    1:getfield        #195 <Field SeekMap seekMap>
	//*   2    4:invokeinterface #295 <Method boolean SeekMap.isSeekable()>
	//*   3    9:ifeq            15
	//*   4   12:goto            17
			l = 0L;
	//    5   15:lconst_0        
	//    6   16:lstore_1        
		lastSeekPositionUs = l;
	//    7   17:aload_0         
	//    8   18:lload_1         
	//    9   19:putfield        #213 <Field long lastSeekPositionUs>
		int i = 0;
	//   10   22:iconst_0        
	//   11   23:istore_3        
		notifyDiscontinuity = false;
	//   12   24:aload_0         
	//   13   25:iconst_0        
	//   14   26:putfield        #211 <Field boolean notifyDiscontinuity>
		if(!isPendingReset() && seekInsideBufferUs(l))
	//*  15   29:aload_0         
	//*  16   30:invokespecial   #346 <Method boolean isPendingReset()>
	//*  17   33:ifne            46
	//*  18   36:aload_0         
	//*  19   37:lload_1         
	//*  20   38:invokespecial   #522 <Method boolean seekInsideBufferUs(long)>
	//*  21   41:ifeq            46
			return l;
	//   22   44:lload_1         
	//   23   45:lreturn         
		pendingDeferredRetry = false;
	//   24   46:aload_0         
	//   25   47:iconst_0        
	//   26   48:putfield        #209 <Field boolean pendingDeferredRetry>
		pendingResetPositionUs = l;
	//   27   51:aload_0         
	//   28   52:lload_1         
	//   29   53:putfield        #156 <Field long pendingResetPositionUs>
		loadingFinished = false;
	//   30   56:aload_0         
	//   31   57:iconst_0        
	//   32   58:putfield        #354 <Field boolean loadingFinished>
		if(loader.isLoading())
	//*  33   61:aload_0         
	//*  34   62:getfield        #123 <Field Loader loader>
	//*  35   65:invokevirtual   #394 <Method boolean Loader.isLoading()>
	//*  36   68:ifeq            80
		{
			loader.cancelLoading();
	//   37   71:aload_0         
	//   38   72:getfield        #123 <Field Loader loader>
	//   39   75:invokevirtual   #525 <Method void Loader.cancelLoading()>
			return l;
	//   40   78:lload_1         
	//   41   79:lreturn         
		}
		SampleQueue asamplequeue[] = sampleQueues;
	//   42   80:aload_0         
	//   43   81:getfield        #152 <Field SampleQueue[] sampleQueues>
	//   44   84:astore          5
		for(int j = asamplequeue.length; i < j; i++)
	//*  45   86:aload           5
	//*  46   88:arraylength     
	//*  47   89:istore          4
	//*  48   91:iload_3         
	//*  49   92:iload           4
	//*  50   94:icmpge          111
			asamplequeue[i].reset();
	//   51   97:aload           5
	//   52   99:iload_3         
	//   53  100:aaload          
	//   54  101:invokevirtual   #218 <Method void SampleQueue.reset()>

	//   55  104:iload_3         
	//   56  105:iconst_1        
	//   57  106:iadd            
	//   58  107:istore_3        
	//*  59  108:goto            91
		return l;
	//   60  111:lload_1         
	//   61  112:lreturn         
	}

	public long selectTracks(TrackSelection atrackselection[], boolean aflag[], SampleStream asamplestream[], boolean aflag1[], long l)
	{
		Assertions.checkState(prepared);
	//    0    0:aload_0         
	//    1    1:getfield        #203 <Field boolean prepared>
	//    2    4:invokestatic    #352 <Method void Assertions.checkState(boolean)>
		int j1 = enabledTrackCount;
	//    3    7:aload_0         
	//    4    8:getfield        #388 <Field int enabledTrackCount>
	//    5   11:istore          8
		boolean flag3 = false;
	//    6   13:iconst_0        
	//    7   14:istore          11
		boolean flag4 = false;
	//    8   16:iconst_0        
	//    9   17:istore          12
		boolean flag2 = false;
	//   10   19:iconst_0        
	//   11   20:istore          10
		for(int i = 0; i < atrackselection.length; i++)
	//*  12   22:iconst_0        
	//*  13   23:istore          7
	//*  14   25:iload           7
	//*  15   27:aload_1         
	//*  16   28:arraylength     
	//*  17   29:icmpge          107
			if(asamplestream[i] != null && (atrackselection[i] == null || !aflag[i]))
	//*  18   32:aload_3         
	//*  19   33:iload           7
	//*  20   35:aaload          
	//*  21   36:ifnull          98
	//*  22   39:aload_1         
	//*  23   40:iload           7
	//*  24   42:aaload          
	//*  25   43:ifnull          53
	//*  26   46:aload_2         
	//*  27   47:iload           7
	//*  28   49:baload          
	//*  29   50:ifne            98
			{
				int i2 = ((SampleStreamImpl)asamplestream[i]).track;
	//   30   53:aload_3         
	//   31   54:iload           7
	//   32   56:aaload          
	//   33   57:checkcast       #30  <Class ExtractorMediaPeriod$SampleStreamImpl>
	//   34   60:invokestatic    #531 <Method int ExtractorMediaPeriod$SampleStreamImpl.access$300(ExtractorMediaPeriod$SampleStreamImpl)>
	//   35   63:istore          9
				Assertions.checkState(trackEnabledStates[i2]);
	//   36   65:aload_0         
	//   37   66:getfield        #264 <Field boolean[] trackEnabledStates>
	//   38   69:iload           9
	//   39   71:baload          
	//   40   72:invokestatic    #352 <Method void Assertions.checkState(boolean)>
				enabledTrackCount = enabledTrackCount - 1;
	//   41   75:aload_0         
	//   42   76:aload_0         
	//   43   77:getfield        #388 <Field int enabledTrackCount>
	//   44   80:iconst_1        
	//   45   81:isub            
	//   46   82:putfield        #388 <Field int enabledTrackCount>
				trackEnabledStates[i2] = false;
	//   47   85:aload_0         
	//   48   86:getfield        #264 <Field boolean[] trackEnabledStates>
	//   49   89:iload           9
	//   50   91:iconst_0        
	//   51   92:bastore         
				asamplestream[i] = null;
	//   52   93:aload_3         
	//   53   94:iload           7
	//   54   96:aconst_null     
	//   55   97:aastore         
			}

	//   56   98:iload           7
	//   57  100:iconst_1        
	//   58  101:iadd            
	//   59  102:istore          7
	//*  60  104:goto            25
		boolean flag;
		if(seenFirstTrackSelection ? j1 == 0 : l != 0L)
	//*  61  107:aload_0         
	//*  62  108:getfield        #533 <Field boolean seenFirstTrackSelection>
	//*  63  111:ifeq            131
	//*  64  114:iload           8
	//*  65  116:ifne            125
			flag = true;
	//   66  119:iconst_1        
	//   67  120:istore          7
		else
	//*  68  122:goto            141
			flag = false;
	//   69  125:iconst_0        
	//   70  126:istore          7
	//   71  128:goto            141
	//   72  131:lload           5
	//   73  133:lconst_0        
	//   74  134:lcmp            
	//   75  135:ifeq            125
	//*  76  138:goto            119
		j1 = 0;
	//   77  141:iconst_0        
	//   78  142:istore          8
		boolean flag1;
		for(flag1 = flag; j1 < atrackselection.length; flag1 = flag)
	//*  79  144:iload           7
	//*  80  146:istore          9
	//*  81  148:iload           8
	//*  82  150:aload_1         
	//*  83  151:arraylength     
	//*  84  152:icmpge          357
		{
			flag = flag1;
	//   85  155:iload           9
	//   86  157:istore          7
			if(asamplestream[j1] == null)
	//*  87  159:aload_3         
	//*  88  160:iload           8
	//*  89  162:aaload          
	//*  90  163:ifnonnull       344
			{
				flag = flag1;
	//   91  166:iload           9
	//   92  168:istore          7
				if(atrackselection[j1] != null)
	//*  93  170:aload_1         
	//*  94  171:iload           8
	//*  95  173:aaload          
	//*  96  174:ifnull          344
				{
					aflag = ((boolean []) (atrackselection[j1]));
	//   97  177:aload_1         
	//   98  178:iload           8
	//   99  180:aaload          
	//  100  181:astore_2        
					boolean flag5;
					if(((TrackSelection) (aflag)).length() == 1)
	//* 101  182:aload_2         
	//* 102  183:invokeinterface #537 <Method int TrackSelection.length()>
	//* 103  188:iconst_1        
	//* 104  189:icmpne          198
						flag5 = true;
	//  105  192:iconst_1        
	//  106  193:istore          16
					else
	//* 107  195:goto            201
						flag5 = false;
	//  108  198:iconst_0        
	//  109  199:istore          16
					Assertions.checkState(flag5);
	//  110  201:iload           16
	//  111  203:invokestatic    #352 <Method void Assertions.checkState(boolean)>
					if(((TrackSelection) (aflag)).getIndexInTrackGroup(0) == 0)
	//* 112  206:aload_2         
	//* 113  207:iconst_0        
	//* 114  208:invokeinterface #541 <Method int TrackSelection.getIndexInTrackGroup(int)>
	//* 115  213:ifne            222
						flag5 = true;
	//  116  216:iconst_1        
	//  117  217:istore          16
					else
	//* 118  219:goto            225
						flag5 = false;
	//  119  222:iconst_0        
	//  120  223:istore          16
					Assertions.checkState(flag5);
	//  121  225:iload           16
	//  122  227:invokestatic    #352 <Method void Assertions.checkState(boolean)>
					int j2 = tracks.indexOf(((TrackSelection) (aflag)).getTrackGroup());
	//  123  230:aload_0         
	//  124  231:getfield        #292 <Field TrackGroupArray tracks>
	//  125  234:aload_2         
	//  126  235:invokeinterface #545 <Method TrackGroup TrackSelection.getTrackGroup()>
	//  127  240:invokevirtual   #549 <Method int TrackGroupArray.indexOf(TrackGroup)>
	//  128  243:istore          13
					Assertions.checkState(trackEnabledStates[j2] ^ true);
	//  129  245:aload_0         
	//  130  246:getfield        #264 <Field boolean[] trackEnabledStates>
	//  131  249:iload           13
	//  132  251:baload          
	//  133  252:iconst_1        
	//  134  253:ixor            
	//  135  254:invokestatic    #352 <Method void Assertions.checkState(boolean)>
					enabledTrackCount = enabledTrackCount + 1;
	//  136  257:aload_0         
	//  137  258:aload_0         
	//  138  259:getfield        #388 <Field int enabledTrackCount>
	//  139  262:iconst_1        
	//  140  263:iadd            
	//  141  264:putfield        #388 <Field int enabledTrackCount>
					trackEnabledStates[j2] = true;
	//  142  267:aload_0         
	//  143  268:getfield        #264 <Field boolean[] trackEnabledStates>
	//  144  271:iload           13
	//  145  273:iconst_1        
	//  146  274:bastore         
					asamplestream[j1] = ((SampleStream) (new SampleStreamImpl(j2)));
	//  147  275:aload_3         
	//  148  276:iload           8
	//  149  278:new             #30  <Class ExtractorMediaPeriod$SampleStreamImpl>
	//  150  281:dup             
	//  151  282:aload_0         
	//  152  283:iload           13
	//  153  285:invokespecial   #552 <Method void ExtractorMediaPeriod$SampleStreamImpl(ExtractorMediaPeriod, int)>
	//  154  288:aastore         
					aflag1[j1] = true;
	//  155  289:aload           4
	//  156  291:iload           8
	//  157  293:iconst_1        
	//  158  294:bastore         
					flag = flag1;
	//  159  295:iload           9
	//  160  297:istore          7
					if(!flag1)
	//* 161  299:iload           9
	//* 162  301:ifne            344
					{
						aflag = ((boolean []) (sampleQueues[j2]));
	//  163  304:aload_0         
	//  164  305:getfield        #152 <Field SampleQueue[] sampleQueues>
	//  165  308:iload           13
	//  166  310:aaload          
	//  167  311:astore_2        
						((SampleQueue) (aflag)).rewind();
	//  168  312:aload_2         
	//  169  313:invokevirtual   #336 <Method void SampleQueue.rewind()>
						if(((SampleQueue) (aflag)).advanceTo(l, true, true) == -1 && ((SampleQueue) (aflag)).getReadIndex() != 0)
	//* 170  316:aload_2         
	//* 171  317:lload           5
	//* 172  319:iconst_1        
	//* 173  320:iconst_1        
	//* 174  321:invokevirtual   #340 <Method int SampleQueue.advanceTo(long, boolean, boolean)>
	//* 175  324:iconst_m1       
	//* 176  325:icmpne          341
	//* 177  328:aload_2         
	//* 178  329:invokevirtual   #555 <Method int SampleQueue.getReadIndex()>
	//* 179  332:ifeq            341
							flag = true;
	//  180  335:iconst_1        
	//  181  336:istore          7
						else
	//* 182  338:goto            344
							flag = false;
	//  183  341:iconst_0        
	//  184  342:istore          7
					}
				}
			}
			j1++;
	//  185  344:iload           8
	//  186  346:iconst_1        
	//  187  347:iadd            
	//  188  348:istore          8
		}

	//  189  350:iload           7
	//  190  352:istore          9
	//* 191  354:goto            148
		long l2;
		if(enabledTrackCount == 0)
	//* 192  357:aload_0         
	//* 193  358:getfield        #388 <Field int enabledTrackCount>
	//* 194  361:ifne            474
		{
			pendingDeferredRetry = false;
	//  195  364:aload_0         
	//  196  365:iconst_0        
	//  197  366:putfield        #209 <Field boolean pendingDeferredRetry>
			notifyDiscontinuity = false;
	//  198  369:aload_0         
	//  199  370:iconst_0        
	//  200  371:putfield        #211 <Field boolean notifyDiscontinuity>
			if(loader.isLoading())
	//* 201  374:aload_0         
	//* 202  375:getfield        #123 <Field Loader loader>
	//* 203  378:invokevirtual   #394 <Method boolean Loader.isLoading()>
	//* 204  381:ifeq            434
			{
				atrackselection = ((TrackSelection []) (sampleQueues));
	//  205  384:aload_0         
	//  206  385:getfield        #152 <Field SampleQueue[] sampleQueues>
	//  207  388:astore_1        
				int k1 = atrackselection.length;
	//  208  389:aload_1         
	//  209  390:arraylength     
	//  210  391:istore          8
				for(int j = ((int) (flag2)); j < k1; j++)
	//* 211  393:iload           10
	//* 212  395:istore          7
	//* 213  397:iload           7
	//* 214  399:iload           8
	//* 215  401:icmpge          420
					((SampleQueue) (atrackselection[j])).discardToEnd();
	//  216  404:aload_1         
	//  217  405:iload           7
	//  218  407:aaload          
	//  219  408:invokevirtual   #507 <Method void SampleQueue.discardToEnd()>

	//  220  411:iload           7
	//  221  413:iconst_1        
	//  222  414:iadd            
	//  223  415:istore          7
	//* 224  417:goto            397
				loader.cancelLoading();
	//  225  420:aload_0         
	//  226  421:getfield        #123 <Field Loader loader>
	//  227  424:invokevirtual   #525 <Method void Loader.cancelLoading()>
				l2 = l;
	//  228  427:lload           5
	//  229  429:lstore          14
			} else
	//* 230  431:goto            528
			{
				atrackselection = ((TrackSelection []) (sampleQueues));
	//  231  434:aload_0         
	//  232  435:getfield        #152 <Field SampleQueue[] sampleQueues>
	//  233  438:astore_1        
				int l1 = atrackselection.length;
	//  234  439:aload_1         
	//  235  440:arraylength     
	//  236  441:istore          8
				int k = ((int) (flag3));
	//  237  443:iload           11
	//  238  445:istore          7
				do
				{
					l2 = l;
	//  239  447:lload           5
	//  240  449:lstore          14
					if(k >= l1)
						break;
	//  241  451:iload           7
	//  242  453:iload           8
	//  243  455:icmpge          528
					((SampleQueue) (atrackselection[k])).reset();
	//  244  458:aload_1         
	//  245  459:iload           7
	//  246  461:aaload          
	//  247  462:invokevirtual   #218 <Method void SampleQueue.reset()>
					k++;
	//  248  465:iload           7
	//  249  467:iconst_1        
	//  250  468:iadd            
	//  251  469:istore          7
				} while(true);
	//  252  471:goto            447
			}
		} else
		{
			l2 = l;
	//  253  474:lload           5
	//  254  476:lstore          14
			if(flag1)
	//* 255  478:iload           9
	//* 256  480:ifeq            528
			{
				l = seekToUs(l);
	//  257  483:aload_0         
	//  258  484:lload           5
	//  259  486:invokevirtual   #557 <Method long seekToUs(long)>
	//  260  489:lstore          5
				int i1 = ((int) (flag4));
	//  261  491:iload           12
	//  262  493:istore          7
				do
				{
					l2 = l;
	//  263  495:lload           5
	//  264  497:lstore          14
					if(i1 >= asamplestream.length)
						break;
	//  265  499:iload           7
	//  266  501:aload_3         
	//  267  502:arraylength     
	//  268  503:icmpge          528
					if(asamplestream[i1] != null)
	//* 269  506:aload_3         
	//* 270  507:iload           7
	//* 271  509:aaload          
	//* 272  510:ifnull          519
						aflag1[i1] = true;
	//  273  513:aload           4
	//  274  515:iload           7
	//  275  517:iconst_1        
	//  276  518:bastore         
					i1++;
	//  277  519:iload           7
	//  278  521:iconst_1        
	//  279  522:iadd            
	//  280  523:istore          7
				} while(true);
	//  281  525:goto            495
			}
		}
		seenFirstTrackSelection = true;
	//  282  528:aload_0         
	//  283  529:iconst_1        
	//  284  530:putfield        #533 <Field boolean seenFirstTrackSelection>
		return l2;
	//  285  533:lload           14
	//  286  535:lreturn         
	}

	int skipData(int i, long l)
	{
		boolean flag = suppressRead();
	//    0    0:aload_0         
	//    1    1:invokespecial   #207 <Method boolean suppressRead()>
	//    2    4:istore          6
		int j = 0;
	//    3    6:iconst_0        
	//    4    7:istore          4
		if(flag)
	//*   5    9:iload           6
	//*   6   11:ifeq            16
			return 0;
	//    7   14:iconst_0        
	//    8   15:ireturn         
		SampleQueue samplequeue = sampleQueues[i];
	//    9   16:aload_0         
	//   10   17:getfield        #152 <Field SampleQueue[] sampleQueues>
	//   11   20:iload_1         
	//   12   21:aaload          
	//   13   22:astore          7
		if(loadingFinished && l > samplequeue.getLargestQueuedTimestampUs())
	//*  14   24:aload_0         
	//*  15   25:getfield        #354 <Field boolean loadingFinished>
	//*  16   28:ifeq            51
	//*  17   31:lload_2         
	//*  18   32:aload           7
	//*  19   34:invokevirtual   #238 <Method long SampleQueue.getLargestQueuedTimestampUs()>
	//*  20   37:lcmp            
	//*  21   38:ifle            51
		{
			j = samplequeue.advanceToEnd();
	//   22   41:aload           7
	//   23   43:invokevirtual   #562 <Method int SampleQueue.advanceToEnd()>
	//   24   46:istore          4
		} else
	//*  25   48:goto            74
		{
			int k = samplequeue.advanceTo(l, true, true);
	//   26   51:aload           7
	//   27   53:lload_2         
	//   28   54:iconst_1        
	//   29   55:iconst_1        
	//   30   56:invokevirtual   #340 <Method int SampleQueue.advanceTo(long, boolean, boolean)>
	//   31   59:istore          5
			if(k != -1)
	//*  32   61:iload           5
	//*  33   63:iconst_m1       
	//*  34   64:icmpne          70
	//*  35   67:goto            74
				j = k;
	//   36   70:iload           5
	//   37   72:istore          4
		}
		if(j > 0)
	//*  38   74:iload           4
	//*  39   76:ifle            87
		{
			maybeNotifyTrackFormat(i);
	//   40   79:aload_0         
	//   41   80:iload_1         
	//   42   81:invokespecial   #494 <Method void maybeNotifyTrackFormat(int)>
			return j;
	//   43   84:iload           4
	//   44   86:ireturn         
		} else
		{
			maybeStartDeferredRetry(i);
	//   45   87:aload_0         
	//   46   88:iload_1         
	//   47   89:invokespecial   #496 <Method void maybeStartDeferredRetry(int)>
			return j;
	//   48   92:iload           4
	//   49   94:ireturn         
		}
	}

	public TrackOutput track(int i, int j)
	{
		SampleQueue asamplequeue[] = sampleQueues;
	//    0    0:aload_0         
	//    1    1:getfield        #152 <Field SampleQueue[] sampleQueues>
	//    2    4:astore          4
		j = 0;
	//    3    6:iconst_0        
	//    4    7:istore_2        
		int k;
		for(k = asamplequeue.length; j < k; j++)
	//*   5    8:aload           4
	//*   6   10:arraylength     
	//*   7   11:istore_3        
	//*   8   12:iload_2         
	//*   9   13:iload_3         
	//*  10   14:icmpge          41
			if(sampleQueueTrackIds[j] == i)
	//*  11   17:aload_0         
	//*  12   18:getfield        #148 <Field int[] sampleQueueTrackIds>
	//*  13   21:iload_2         
	//*  14   22:iaload          
	//*  15   23:iload_1         
	//*  16   24:icmpne          34
				return ((TrackOutput) (sampleQueues[j]));
	//   17   27:aload_0         
	//   18   28:getfield        #152 <Field SampleQueue[] sampleQueues>
	//   19   31:iload_2         
	//   20   32:aaload          
	//   21   33:areturn         

	//   22   34:iload_2         
	//   23   35:iconst_1        
	//   24   36:iadd            
	//   25   37:istore_2        
	//*  26   38:goto            12
		SampleQueue samplequeue = new SampleQueue(allocator);
	//   27   41:new             #150 <Class SampleQueue>
	//   28   44:dup             
	//   29   45:aload_0         
	//   30   46:getfield        #110 <Field Allocator allocator>
	//   31   49:invokespecial   #567 <Method void SampleQueue(Allocator)>
	//   32   52:astore          4
		samplequeue.setUpstreamFormatChangeListener(((SampleQueue.UpstreamFormatChangedListener) (this)));
	//   33   54:aload           4
	//   34   56:aload_0         
	//   35   57:invokevirtual   #571 <Method void SampleQueue.setUpstreamFormatChangeListener(SampleQueue$UpstreamFormatChangedListener)>
		int ai[] = sampleQueueTrackIds;
	//   36   60:aload_0         
	//   37   61:getfield        #148 <Field int[] sampleQueueTrackIds>
	//   38   64:astore          5
		j = k + 1;
	//   39   66:iload_3         
	//   40   67:iconst_1        
	//   41   68:iadd            
	//   42   69:istore_2        
		sampleQueueTrackIds = Arrays.copyOf(ai, j);
	//   43   70:aload_0         
	//   44   71:aload           5
	//   45   73:iload_2         
	//   46   74:invokestatic    #577 <Method int[] Arrays.copyOf(int[], int)>
	//   47   77:putfield        #148 <Field int[] sampleQueueTrackIds>
		sampleQueueTrackIds[k] = i;
	//   48   80:aload_0         
	//   49   81:getfield        #148 <Field int[] sampleQueueTrackIds>
	//   50   84:iload_3         
	//   51   85:iload_1         
	//   52   86:iastore         
		sampleQueues = (SampleQueue[])Arrays.copyOf(((Object []) (sampleQueues)), j);
	//   53   87:aload_0         
	//   54   88:aload_0         
	//   55   89:getfield        #152 <Field SampleQueue[] sampleQueues>
	//   56   92:iload_2         
	//   57   93:invokestatic    #580 <Method Object[] Arrays.copyOf(Object[], int)>
	//   58   96:checkcast       #581 <Class SampleQueue[]>
	//   59   99:putfield        #152 <Field SampleQueue[] sampleQueues>
		sampleQueues[k] = samplequeue;
	//   60  102:aload_0         
	//   61  103:getfield        #152 <Field SampleQueue[] sampleQueues>
	//   62  106:iload_3         
	//   63  107:aload           4
	//   64  109:aastore         
		return ((TrackOutput) (samplequeue));
	//   65  110:aload           4
	//   66  112:areturn         
	}

	private static final long DEFAULT_LAST_SAMPLE_DURATION_US = 10000L;
	private int actualMinLoadableRetryCount;
	private final Allocator allocator;
	private MediaPeriod.Callback callback;
	private final long continueLoadingCheckIntervalBytes;
	private final String customCacheKey;
	private final DataSource dataSource;
	private long durationUs;
	private int enabledTrackCount;
	private final MediaSourceEventListener.EventDispatcher eventDispatcher;
	private int extractedSamplesCountAtStartOfLoad;
	private final ExtractorHolder extractorHolder;
	private final Handler handler = new Handler();
	private boolean haveAudioVideoTracks;
	private long lastSeekPositionUs;
	private long length;
	private final Listener listener;
	private final ConditionVariable loadCondition = new ConditionVariable();
	private final Loader loader = new Loader("Loader:ExtractorMediaPeriod");
	private boolean loadingFinished;
	private final Runnable maybeFinishPrepareRunnable = new Runnable() {

		public void run()
		{
			maybeFinishPrepare();
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field ExtractorMediaPeriod this$0>
		//    2    4:invokestatic    #24  <Method void ExtractorMediaPeriod.access$000(ExtractorMediaPeriod)>
		//    3    7:return          
		}

		final ExtractorMediaPeriod this$0;

			
			{
				this$0 = ExtractorMediaPeriod.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field ExtractorMediaPeriod this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
	}
;
	private final int minLoadableRetryCount;
	private boolean notifiedReadingStarted;
	private boolean notifyDiscontinuity;
	private final Runnable onContinueLoadingRequestedRunnable = new Runnable() {

		public void run()
		{
			if(!released)
		//*   0    0:aload_0         
		//*   1    1:getfield        #16  <Field ExtractorMediaPeriod this$0>
		//*   2    4:invokestatic    #25  <Method boolean ExtractorMediaPeriod.access$100(ExtractorMediaPeriod)>
		//*   3    7:ifne            26
				callback.onContinueLoadingRequested(((SequenceableLoader) (ExtractorMediaPeriod.this)));
		//    4   10:aload_0         
		//    5   11:getfield        #16  <Field ExtractorMediaPeriod this$0>
		//    6   14:invokestatic    #29  <Method MediaPeriod$Callback ExtractorMediaPeriod.access$200(ExtractorMediaPeriod)>
		//    7   17:aload_0         
		//    8   18:getfield        #16  <Field ExtractorMediaPeriod this$0>
		//    9   21:invokeinterface #35  <Method void MediaPeriod$Callback.onContinueLoadingRequested(SequenceableLoader)>
		//   10   26:return          
		}

		final ExtractorMediaPeriod this$0;

			
			{
				this$0 = ExtractorMediaPeriod.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field ExtractorMediaPeriod this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
	}
;
	private boolean pendingDeferredRetry;
	private long pendingResetPositionUs;
	private boolean prepared;
	private boolean released;
	private int sampleQueueTrackIds[];
	private SampleQueue sampleQueues[];
	private boolean sampleQueuesBuilt;
	private SeekMap seekMap;
	private boolean seenFirstTrackSelection;
	private boolean trackEnabledStates[];
	private boolean trackFormatNotificationSent[];
	private boolean trackIsAudioVideoFlags[];
	private TrackGroupArray tracks;
	private final Uri uri;


/*
	static void access$000(ExtractorMediaPeriod extractormediaperiod)
	{
		extractormediaperiod.maybeFinishPrepare();
	//    0    0:aload_0         
	//    1    1:invokespecial   #175 <Method void maybeFinishPrepare()>
		return;
	//    2    4:return          
	}

*/


/*
	static boolean access$100(ExtractorMediaPeriod extractormediaperiod)
	{
		return extractormediaperiod.released;
	//    0    0:aload_0         
	//    1    1:getfield        #179 <Field boolean released>
	//    2    4:ireturn         
	}

*/


/*
	static Runnable access$1000(ExtractorMediaPeriod extractormediaperiod)
	{
		return extractormediaperiod.onContinueLoadingRequestedRunnable;
	//    0    0:aload_0         
	//    1    1:getfield        #141 <Field Runnable onContinueLoadingRequestedRunnable>
	//    2    4:areturn         
	}

*/


/*
	static Handler access$1100(ExtractorMediaPeriod extractormediaperiod)
	{
		return extractormediaperiod.handler;
	//    0    0:aload_0         
	//    1    1:getfield        #146 <Field Handler handler>
	//    2    4:areturn         
	}

*/


/*
	static MediaPeriod.Callback access$200(ExtractorMediaPeriod extractormediaperiod)
	{
		return extractormediaperiod.callback;
	//    0    0:aload_0         
	//    1    1:getfield        #187 <Field MediaPeriod$Callback callback>
	//    2    4:areturn         
	}

*/


/*
	static String access$800(ExtractorMediaPeriod extractormediaperiod)
	{
		return extractormediaperiod.customCacheKey;
	//    0    0:aload_0         
	//    1    1:getfield        #112 <Field String customCacheKey>
	//    2    4:areturn         
	}

*/


/*
	static long access$900(ExtractorMediaPeriod extractormediaperiod)
	{
		return extractormediaperiod.continueLoadingCheckIntervalBytes;
	//    0    0:aload_0         
	//    1    1:getfield        #114 <Field long continueLoadingCheckIntervalBytes>
	//    2    4:lreturn         
	}

*/
}
