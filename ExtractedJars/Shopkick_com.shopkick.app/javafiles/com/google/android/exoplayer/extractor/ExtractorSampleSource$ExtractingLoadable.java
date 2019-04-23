// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.extractor;

import android.net.Uri;
import com.google.android.exoplayer.upstream.*;
import com.google.android.exoplayer.util.Assertions;
import com.google.android.exoplayer.util.Util;
import java.io.IOException;

// Referenced classes of package com.google.android.exoplayer.extractor:
//			ExtractorSampleSource, PositionHolder, DefaultExtractorInput, Extractor, 
//			ExtractorInput

private static class ExtractorSampleSource$ExtractingLoadable
	implements com.google.android.exoplayer.upstream.Loader.Loadable
{

	public void cancelLoad()
	{
		loadCanceled = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #68  <Field boolean loadCanceled>
	//    3    5:return          
	}

	public boolean isLoadCanceled()
	{
		return loadCanceled;
	//    0    0:aload_0         
	//    1    1:getfield        #68  <Field boolean loadCanceled>
	//    2    4:ireturn         
	}

	public void load()
		throws IOException, InterruptedException
	{
		int i = 0;
	//    0    0:iconst_0        
	//    1    1:istore_1        
_L4:
		if(i != 0 || loadCanceled)
			break; /* Loop/switch isn't completed */
	//    2    2:iload_1         
	//    3    3:ifne            257
	//    4    6:aload_0         
	//    5    7:getfield        #68  <Field boolean loadCanceled>
	//    6   10:ifne            257
		long l;
		long l1;
		l1 = positionHolder.position;
	//    7   13:aload_0         
	//    8   14:getfield        #58  <Field PositionHolder positionHolder>
	//    9   17:getfield        #62  <Field long PositionHolder.position>
	//   10   20:lstore          6
		l = dataSource.open(new DataSpec(uri, l1, -1L, ((String) (null))));
	//   11   22:aload_0         
	//   12   23:getfield        #43  <Field DataSource dataSource>
	//   13   26:new             #77  <Class DataSpec>
	//   14   29:dup             
	//   15   30:aload_0         
	//   16   31:getfield        #39  <Field Uri uri>
	//   17   34:lload           6
	//   18   36:ldc2w           #78  <Long -1L>
	//   19   39:aconst_null     
	//   20   40:invokespecial   #82  <Method void DataSpec(Uri, long, long, String)>
	//   21   43:invokeinterface #86  <Method long DataSource.open(DataSpec)>
	//   22   48:lstore          4
		if(l != -1L)
	//*  23   50:lload           4
	//*  24   52:ldc2w           #78  <Long -1L>
	//*  25   55:lcmp            
	//*  26   56:ifeq            258
			l += l1;
	//   27   59:lload           4
	//   28   61:lload           6
	//   29   63:ladd            
	//   30   64:lstore          4
	//*  31   66:goto            69
		DefaultExtractorInput defaultextractorinput = new DefaultExtractorInput(dataSource, l1, l);
	//   32   69:new             #88  <Class DefaultExtractorInput>
	//   33   72:dup             
	//   34   73:aload_0         
	//   35   74:getfield        #43  <Field DataSource dataSource>
	//   36   77:lload           6
	//   37   79:lload           4
	//   38   81:invokespecial   #91  <Method void DefaultExtractorInput(DataSource, long, long)>
	//   39   84:astore          9
		int k = i;
	//   40   86:iload_1         
	//   41   87:istore_3        
		Extractor extractor = extractorHolder.selectExtractor(((ExtractorInput) (defaultextractorinput)));
	//   42   88:aload_0         
	//   43   89:getfield        #47  <Field ExtractorSampleSource$ExtractorHolder extractorHolder>
	//   44   92:aload           9
	//   45   94:invokevirtual   #95  <Method Extractor ExtractorSampleSource$ExtractorHolder.selectExtractor(ExtractorInput)>
	//   46   97:astore          8
		int j;
		j = i;
	//   47   99:iload_1         
	//   48  100:istore_2        
		k = i;
	//   49  101:iload_1         
	//   50  102:istore_3        
		if(!pendingExtractorSeek)
			break MISSING_BLOCK_LABEL_128;
	//   51  103:aload_0         
	//   52  104:getfield        #64  <Field boolean pendingExtractorSeek>
	//   53  107:ifeq            128
		k = i;
	//   54  110:iload_1         
	//   55  111:istore_3        
		extractor.seek();
	//   56  112:aload           8
	//   57  114:invokeinterface #100 <Method void Extractor.seek()>
		k = i;
	//   58  119:iload_1         
	//   59  120:istore_3        
		pendingExtractorSeek = false;
	//   60  121:aload_0         
	//   61  122:iconst_0        
	//   62  123:putfield        #64  <Field boolean pendingExtractorSeek>
		j = i;
	//   63  126:iload_1         
	//   64  127:istore_2        
_L2:
		if(j != 0)
			break; /* Loop/switch isn't completed */
	//   65  128:iload_2         
	//   66  129:ifne            175
		k = j;
	//   67  132:iload_2         
	//   68  133:istore_3        
		if(loadCanceled)
			break; /* Loop/switch isn't completed */
	//   69  134:aload_0         
	//   70  135:getfield        #68  <Field boolean loadCanceled>
	//   71  138:ifne            175
		k = j;
	//   72  141:iload_2         
	//   73  142:istore_3        
		allocator.blockWhileTotalBytesAllocatedExceeds(requestedBufferSize);
	//   74  143:aload_0         
	//   75  144:getfield        #51  <Field Allocator allocator>
	//   76  147:aload_0         
	//   77  148:getfield        #53  <Field int requestedBufferSize>
	//   78  151:invokeinterface #104 <Method void Allocator.blockWhileTotalBytesAllocatedExceeds(int)>
		k = j;
	//   79  156:iload_2         
	//   80  157:istore_3        
		j = extractor.read(((ExtractorInput) (defaultextractorinput)), positionHolder);
	//   81  158:aload           8
	//   82  160:aload           9
	//   83  162:aload_0         
	//   84  163:getfield        #58  <Field PositionHolder positionHolder>
	//   85  166:invokeinterface #108 <Method int Extractor.read(ExtractorInput, PositionHolder)>
	//   86  171:istore_2        
		if(true) goto _L2; else goto _L1
	//   87  172:goto            128
_L1:
		if(j == 1)
	//*  88  175:iload_2         
	//*  89  176:iconst_1        
	//*  90  177:icmpne          185
		{
			i = 0;
	//   91  180:iconst_0        
	//   92  181:istore_1        
		} else
	//*  93  182:goto            201
		{
			positionHolder.position = ((ExtractorInput) (defaultextractorinput)).getPosition();
	//   94  185:aload_0         
	//   95  186:getfield        #58  <Field PositionHolder positionHolder>
	//   96  189:aload           9
	//   97  191:invokeinterface #114 <Method long ExtractorInput.getPosition()>
	//   98  196:putfield        #62  <Field long PositionHolder.position>
			i = j;
	//   99  199:iload_2         
	//  100  200:istore_1        
		}
		Util.closeQuietly(dataSource);
	//  101  201:aload_0         
	//  102  202:getfield        #43  <Field DataSource dataSource>
	//  103  205:invokestatic    #120 <Method void Util.closeQuietly(DataSource)>
		if(true) goto _L4; else goto _L3
	//  104  208:goto            2
		Exception exception;
		exception;
	//  105  211:astore          8
		i = k;
	//  106  213:iload_3         
	//  107  214:istore_1        
		break MISSING_BLOCK_LABEL_223;
	//  108  215:goto            223
		exception;
	//  109  218:astore          8
		defaultextractorinput = null;
	//  110  220:aconst_null     
	//  111  221:astore          9
		if(i != 1 && defaultextractorinput != null)
	//* 112  223:iload_1         
	//* 113  224:iconst_1        
	//* 114  225:icmpeq          247
	//* 115  228:aload           9
	//* 116  230:ifnull          247
			positionHolder.position = ((ExtractorInput) (defaultextractorinput)).getPosition();
	//  117  233:aload_0         
	//  118  234:getfield        #58  <Field PositionHolder positionHolder>
	//  119  237:aload           9
	//  120  239:invokeinterface #114 <Method long ExtractorInput.getPosition()>
	//  121  244:putfield        #62  <Field long PositionHolder.position>
		Util.closeQuietly(dataSource);
	//  122  247:aload_0         
	//  123  248:getfield        #43  <Field DataSource dataSource>
	//  124  251:invokestatic    #120 <Method void Util.closeQuietly(DataSource)>
		throw exception;
	//  125  254:aload           8
	//  126  256:athrow          
_L3:
	//  127  257:return          
	//* 128  258:goto            69
	}

	private final Allocator allocator;
	private final DataSource dataSource;
	private final ExtractorSampleSource.ExtractorHolder extractorHolder;
	private volatile boolean loadCanceled;
	private boolean pendingExtractorSeek;
	private final PositionHolder positionHolder = new PositionHolder();
	private final int requestedBufferSize;
	private final Uri uri;

	public ExtractorSampleSource$ExtractingLoadable(Uri uri1, DataSource datasource, ExtractorSampleSource.ExtractorHolder extractorholder, Allocator allocator1, int i, long l)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #29  <Method void Object()>
		uri = (Uri)Assertions.checkNotNull(((Object) (uri1)));
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokestatic    #35  <Method Object Assertions.checkNotNull(Object)>
	//    5    9:checkcast       #37  <Class Uri>
	//    6   12:putfield        #39  <Field Uri uri>
		dataSource = (DataSource)Assertions.checkNotNull(((Object) (datasource)));
	//    7   15:aload_0         
	//    8   16:aload_2         
	//    9   17:invokestatic    #35  <Method Object Assertions.checkNotNull(Object)>
	//   10   20:checkcast       #41  <Class DataSource>
	//   11   23:putfield        #43  <Field DataSource dataSource>
		extractorHolder = (ExtractorSampleSource.ExtractorHolder)Assertions.checkNotNull(((Object) (extractorholder)));
	//   12   26:aload_0         
	//   13   27:aload_3         
	//   14   28:invokestatic    #35  <Method Object Assertions.checkNotNull(Object)>
	//   15   31:checkcast       #45  <Class ExtractorSampleSource$ExtractorHolder>
	//   16   34:putfield        #47  <Field ExtractorSampleSource$ExtractorHolder extractorHolder>
		allocator = (Allocator)Assertions.checkNotNull(((Object) (allocator1)));
	//   17   37:aload_0         
	//   18   38:aload           4
	//   19   40:invokestatic    #35  <Method Object Assertions.checkNotNull(Object)>
	//   20   43:checkcast       #49  <Class Allocator>
	//   21   46:putfield        #51  <Field Allocator allocator>
		requestedBufferSize = i;
	//   22   49:aload_0         
	//   23   50:iload           5
	//   24   52:putfield        #53  <Field int requestedBufferSize>
	//   25   55:aload_0         
	//   26   56:new             #55  <Class PositionHolder>
	//   27   59:dup             
	//   28   60:invokespecial   #56  <Method void PositionHolder()>
	//   29   63:putfield        #58  <Field PositionHolder positionHolder>
		positionHolder.position = l;
	//   30   66:aload_0         
	//   31   67:getfield        #58  <Field PositionHolder positionHolder>
	//   32   70:lload           6
	//   33   72:putfield        #62  <Field long PositionHolder.position>
		pendingExtractorSeek = true;
	//   34   75:aload_0         
	//   35   76:iconst_1        
	//   36   77:putfield        #64  <Field boolean pendingExtractorSeek>
	//   37   80:return          
	}
}
