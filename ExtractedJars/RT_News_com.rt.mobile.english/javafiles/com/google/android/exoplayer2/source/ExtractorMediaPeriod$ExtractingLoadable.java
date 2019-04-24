// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.source;

import android.net.Uri;
import android.os.Handler;
import com.google.android.exoplayer2.extractor.*;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.util.*;
import java.io.IOException;

// Referenced classes of package com.google.android.exoplayer2.source:
//			ExtractorMediaPeriod

final class ExtractorMediaPeriod$ExtractingLoadable
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
		dataSpec = new DataSpec(uri, l1, -1L, ExtractorMediaPeriod.access$800(ExtractorMediaPeriod.this));
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
		if(((ExtractorInput) (defaultextractorinput)).getPosition() > l + ExtractorMediaPeriod.access$900(ExtractorMediaPeriod.this))
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
			ExtractorMediaPeriod.access$1100(ExtractorMediaPeriod.this).post(ExtractorMediaPeriod.access$1000(ExtractorMediaPeriod.this));
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
	private final ExtractorMediaPeriod.ExtractorHolder extractorHolder;
	private long length;
	private volatile boolean loadCanceled;
	private final ConditionVariable loadCondition;
	private boolean pendingExtractorSeek;
	private final PositionHolder positionHolder = new PositionHolder();
	private long seekTimeUs;
	final ExtractorMediaPeriod this$0;
	private final Uri uri;


/*
	static DataSpec access$400(ExtractorMediaPeriod$ExtractingLoadable extractormediaperiod$extractingloadable)
	{
		return extractormediaperiod$extractingloadable.dataSpec;
	//    0    0:aload_0         
	//    1    1:getfield        #73  <Field DataSpec dataSpec>
	//    2    4:areturn         
	}

*/


/*
	static long access$500(ExtractorMediaPeriod$ExtractingLoadable extractormediaperiod$extractingloadable)
	{
		return extractormediaperiod$extractingloadable.seekTimeUs;
	//    0    0:aload_0         
	//    1    1:getfield        #77  <Field long seekTimeUs>
	//    2    4:lreturn         
	}

*/


/*
	static long access$600(ExtractorMediaPeriod$ExtractingLoadable extractormediaperiod$extractingloadable)
	{
		return extractormediaperiod$extractingloadable.bytesLoaded;
	//    0    0:aload_0         
	//    1    1:getfield        #80  <Field long bytesLoaded>
	//    2    4:lreturn         
	}

*/


/*
	static long access$700(ExtractorMediaPeriod$ExtractingLoadable extractormediaperiod$extractingloadable)
	{
		return extractormediaperiod$extractingloadable.length;
	//    0    0:aload_0         
	//    1    1:getfield        #68  <Field long length>
	//    2    4:lreturn         
	}

*/

	public ExtractorMediaPeriod$ExtractingLoadable(Uri uri1, DataSource datasource, ExtractorMediaPeriod.ExtractorHolder extractorholder, ConditionVariable conditionvariable)
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
		extractorHolder = (ExtractorMediaPeriod.ExtractorHolder)Assertions.checkNotNull(((Object) (extractorholder)));
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
