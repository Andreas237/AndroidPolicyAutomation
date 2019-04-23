// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.extractor;

import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import android.util.SparseArray;
import com.google.android.exoplayer.*;
import com.google.android.exoplayer.drm.DrmInitData;
import com.google.android.exoplayer.upstream.*;
import com.google.android.exoplayer.util.Assertions;
import com.google.android.exoplayer.util.Util;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.exoplayer.extractor:
//			ExtractorOutput, Extractor, SeekMap, TrackOutput, 
//			PositionHolder, DefaultExtractorInput, ExtractorInput, DefaultTrackOutput

public final class ExtractorSampleSource
	implements SampleSource, com.google.android.exoplayer.SampleSource.SampleSourceReader, ExtractorOutput, com.google.android.exoplayer.upstream.Loader.Callback
{
	public static interface EventListener
	{

		public abstract void onLoadError(int i, IOException ioexception);
	}

	private static class ExtractingLoadable
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
		private final ExtractorHolder extractorHolder;
		private volatile boolean loadCanceled;
		private boolean pendingExtractorSeek;
		private final PositionHolder positionHolder = new PositionHolder();
		private final int requestedBufferSize;
		private final Uri uri;

		public ExtractingLoadable(Uri uri1, DataSource datasource, ExtractorHolder extractorholder, Allocator allocator1, int i, long l)
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
			extractorHolder = (ExtractorHolder)Assertions.checkNotNull(((Object) (extractorholder)));
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

	private static final class ExtractorHolder
	{

		public void release()
		{
			Extractor extractor1 = extractor;
		//    0    0:aload_0         
		//    1    1:getfield        #26  <Field Extractor extractor>
		//    2    4:astore_1        
			if(extractor1 != null)
		//*   3    5:aload_1         
		//*   4    6:ifnull          20
			{
				extractor1.release();
		//    5    9:aload_1         
		//    6   10:invokeinterface #30  <Method void Extractor.release()>
				extractor = null;
		//    7   15:aload_0         
		//    8   16:aconst_null     
		//    9   17:putfield        #26  <Field Extractor extractor>
			}
		//   10   20:return          
		}

		public Extractor selectExtractor(ExtractorInput extractorinput)
			throws UnrecognizedInputFormatException, IOException, InterruptedException
		{
			int i;
			int j;
			Extractor aextractor[];
			Extractor extractor1 = extractor;
		//    0    0:aload_0         
		//    1    1:getfield        #26  <Field Extractor extractor>
		//    2    4:astore          4
			if(extractor1 != null)
		//*   3    6:aload           4
		//*   4    8:ifnull          14
				return extractor1;
		//    5   11:aload           4
		//    6   13:areturn         
			aextractor = extractors;
		//    7   14:aload_0         
		//    8   15:getfield        #20  <Field Extractor[] extractors>
		//    9   18:astore          4
			j = aextractor.length;
		//   10   20:aload           4
		//   11   22:arraylength     
		//   12   23:istore_3        
			i = 0;
		//   13   24:iconst_0        
		//   14   25:istore_2        
_L2:
			Extractor extractor2;
			if(i >= j)
				break; /* Loop/switch isn't completed */
		//   15   26:iload_2         
		//   16   27:iload_3         
		//   17   28:icmpge          87
			extractor2 = aextractor[i];
		//   18   31:aload           4
		//   19   33:iload_2         
		//   20   34:aaload          
		//   21   35:astore          5
			if(!extractor2.sniff(extractorinput))
				break MISSING_BLOCK_LABEL_74;
		//   22   37:aload           5
		//   23   39:aload_1         
		//   24   40:invokeinterface #44  <Method boolean Extractor.sniff(ExtractorInput)>
		//   25   45:ifeq            74
			extractor = extractor2;
		//   26   48:aload_0         
		//   27   49:aload           5
		//   28   51:putfield        #26  <Field Extractor extractor>
			extractorinput.resetPeekPosition();
		//   29   54:aload_1         
		//   30   55:invokeinterface #49  <Method void ExtractorInput.resetPeekPosition()>
			break; /* Loop/switch isn't completed */
		//   31   60:goto            87
			Exception exception;
			exception;
		//   32   63:astore          4
			extractorinput.resetPeekPosition();
		//   33   65:aload_1         
		//   34   66:invokeinterface #49  <Method void ExtractorInput.resetPeekPosition()>
			throw exception;
		//   35   71:aload           4
		//   36   73:athrow          
_L3:
			extractorinput.resetPeekPosition();
		//   37   74:aload_1         
		//   38   75:invokeinterface #49  <Method void ExtractorInput.resetPeekPosition()>
			i++;
		//   39   80:iload_2         
		//   40   81:iconst_1        
		//   41   82:iadd            
		//   42   83:istore_2        
			if(true) goto _L2; else goto _L1
		//   43   84:goto            26
_L1:
			extractorinput = ((ExtractorInput) (extractor));
		//   44   87:aload_0         
		//   45   88:getfield        #26  <Field Extractor extractor>
		//   46   91:astore_1        
			if(extractorinput != null)
		//*  47   92:aload_1         
		//*  48   93:ifnull          111
			{
				((Extractor) (extractorinput)).init(extractorOutput);
		//   49   96:aload_1         
		//   50   97:aload_0         
		//   51   98:getfield        #22  <Field ExtractorOutput extractorOutput>
		//   52  101:invokeinterface #53  <Method void Extractor.init(ExtractorOutput)>
				return extractor;
		//   53  106:aload_0         
		//   54  107:getfield        #26  <Field Extractor extractor>
		//   55  110:areturn         
			} else
			{
				throw new UnrecognizedInputFormatException(extractors);
		//   56  111:new             #34  <Class ExtractorSampleSource$UnrecognizedInputFormatException>
		//   57  114:dup             
		//   58  115:aload_0         
		//   59  116:getfield        #20  <Field Extractor[] extractors>
		//   60  119:invokespecial   #56  <Method void ExtractorSampleSource$UnrecognizedInputFormatException(Extractor[])>
		//   61  122:athrow          
			}
			EOFException eofexception;
			eofexception;
		//   62  123:astore          5
			  goto _L3
		//*  63  125:goto            74
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

	public static final class UnrecognizedInputFormatException extends ParserException
	{

		public UnrecognizedInputFormatException(Extractor aextractor[])
		{
			StringBuilder stringbuilder = new StringBuilder();
		//    0    0:new             #11  <Class StringBuilder>
		//    1    3:dup             
		//    2    4:invokespecial   #14  <Method void StringBuilder()>
		//    3    7:astore_2        
			stringbuilder.append("None of the available extractors (");
		//    4    8:aload_2         
		//    5    9:ldc1            #16  <String "None of the available extractors (">
		//    6   11:invokevirtual   #20  <Method StringBuilder StringBuilder.append(String)>
		//    7   14:pop             
			stringbuilder.append(Util.getCommaDelimitedSimpleClassNames(((Object []) (aextractor))));
		//    8   15:aload_2         
		//    9   16:aload_1         
		//   10   17:invokestatic    #26  <Method String Util.getCommaDelimitedSimpleClassNames(Object[])>
		//   11   20:invokevirtual   #20  <Method StringBuilder StringBuilder.append(String)>
		//   12   23:pop             
			stringbuilder.append(") could read the stream.");
		//   13   24:aload_2         
		//   14   25:ldc1            #28  <String ") could read the stream.">
		//   15   27:invokevirtual   #20  <Method StringBuilder StringBuilder.append(String)>
		//   16   30:pop             
			super(stringbuilder.toString());
		//   17   31:aload_0         
		//   18   32:aload_2         
		//   19   33:invokevirtual   #32  <Method String StringBuilder.toString()>
		//   20   36:invokespecial   #35  <Method void ParserException(String)>
		//   21   39:return          
		}
	}


	public transient ExtractorSampleSource(Uri uri1, DataSource datasource, Allocator allocator1, int i, int j, Handler handler, EventListener eventlistener, 
			int k, Extractor aextractor[])
	{
label0:
		{
			((Object)this).Object();
	//    0    0:aload_0         
	//    1    1:invokespecial   #154 <Method void Object()>
			uri = uri1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #156 <Field Uri uri>
			dataSource = datasource;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #158 <Field DataSource dataSource>
			eventListener = eventlistener;
	//    8   14:aload_0         
	//    9   15:aload           7
	//   10   17:putfield        #160 <Field ExtractorSampleSource$EventListener eventListener>
			eventHandler = handler;
	//   11   20:aload_0         
	//   12   21:aload           6
	//   13   23:putfield        #162 <Field Handler eventHandler>
			eventSourceId = k;
	//   14   26:aload_0         
	//   15   27:iload           8
	//   16   29:putfield        #164 <Field int eventSourceId>
			allocator = allocator1;
	//   17   32:aload_0         
	//   18   33:aload_3         
	//   19   34:putfield        #166 <Field Allocator allocator>
			requestedBufferSize = i;
	//   20   37:aload_0         
	//   21   38:iload           4
	//   22   40:putfield        #168 <Field int requestedBufferSize>
			minLoadableRetryCount = j;
	//   23   43:aload_0         
	//   24   44:iload           5
	//   25   46:putfield        #170 <Field int minLoadableRetryCount>
			if(aextractor != null)
	//*  26   49:aload           9
	//*  27   51:ifnull          63
			{
				uri1 = ((Uri) (aextractor));
	//   28   54:aload           9
	//   29   56:astore_1        
				if(aextractor.length != 0)
					break label0;
	//   30   57:aload           9
	//   31   59:arraylength     
	//   32   60:ifne            143
			}
			datasource = ((DataSource) (new Extractor[DEFAULT_EXTRACTOR_CLASSES.size()]));
	//   33   63:getstatic       #107 <Field List DEFAULT_EXTRACTOR_CLASSES>
	//   34   66:invokeinterface #174 <Method int List.size()>
	//   35   71:anewarray       Extractor[]
	//   36   74:astore_2        
			i = 0;
	//   37   75:iconst_0        
	//   38   76:istore          4
			do
			{
				uri1 = ((Uri) (datasource));
	//   39   78:aload_2         
	//   40   79:astore_1        
				if(i >= datasource.length)
					break;
	//   41   80:iload           4
	//   42   82:aload_2         
	//   43   83:arraylength     
	//   44   84:icmpge          143
				try
				{
					datasource[i] = ((/*<invalid signature>*/java.lang.Object) ((Extractor)((Class)DEFAULT_EXTRACTOR_CLASSES.get(i)).newInstance()));
	//   45   87:aload_2         
	//   46   88:iload           4
	//   47   90:getstatic       #107 <Field List DEFAULT_EXTRACTOR_CLASSES>
	//   48   93:iload           4
	//   49   95:invokeinterface #178 <Method Object List.get(int)>
	//   50  100:checkcast       #111 <Class Class>
	//   51  103:invokevirtual   #182 <Method Object Class.newInstance()>
	//   52  106:checkcast       #117 <Class Extractor>
	//   53  109:aastore         
				}
	//*  54  110:iload           4
	//*  55  112:iconst_1        
	//*  56  113:iadd            
	//*  57  114:istore          4
	//*  58  116:goto            78
	//*  59  119:astore_1        
	//*  60  120:new             #184 <Class IllegalStateException>
	//*  61  123:dup             
	//*  62  124:ldc1            #186 <String "Unexpected error creating default extractor">
	//*  63  126:aload_1         
	//*  64  127:invokespecial   #189 <Method void IllegalStateException(String, Throwable)>
	//*  65  130:athrow          
				// Misplaced declaration of an exception variable
				catch(Uri uri1)
	//*  66  131:astore_1        
				{
					throw new IllegalStateException("Unexpected error creating default extractor", ((Throwable) (uri1)));
	//   67  132:new             #184 <Class IllegalStateException>
	//   68  135:dup             
	//   69  136:ldc1            #186 <String "Unexpected error creating default extractor">
	//   70  138:aload_1         
	//   71  139:invokespecial   #189 <Method void IllegalStateException(String, Throwable)>
	//   72  142:athrow          
				}
				// Misplaced declaration of an exception variable
				catch(Uri uri1)
				{
					throw new IllegalStateException("Unexpected error creating default extractor", ((Throwable) (uri1)));
				}
				i++;
			} while(true);
		}
		extractorHolder = new ExtractorHolder(((Extractor []) (uri1)), ((ExtractorOutput) (this)));
	//   73  143:aload_0         
	//   74  144:new             #24  <Class ExtractorSampleSource$ExtractorHolder>
	//   75  147:dup             
	//   76  148:aload_1         
	//   77  149:aload_0         
	//   78  150:invokespecial   #192 <Method void ExtractorSampleSource$ExtractorHolder(Extractor[], ExtractorOutput)>
	//   79  153:putfield        #194 <Field ExtractorSampleSource$ExtractorHolder extractorHolder>
		sampleQueues = new SparseArray();
	//   80  156:aload_0         
	//   81  157:new             #196 <Class SparseArray>
	//   82  160:dup             
	//   83  161:invokespecial   #197 <Method void SparseArray()>
	//   84  164:putfield        #199 <Field SparseArray sampleQueues>
		pendingResetPositionUs = 0x0L;
	//   85  167:aload_0         
	//   86  168:ldc2w           #44  <Long 0x0L>
	//   87  171:putfield        #201 <Field long pendingResetPositionUs>
	//   88  174:return          
	}

	public transient ExtractorSampleSource(Uri uri1, DataSource datasource, Allocator allocator1, int i, int j, Extractor aextractor[])
	{
		ExtractorSampleSource(uri1, datasource, allocator1, i, j, ((Handler) (null)), ((EventListener) (null)), 0, aextractor);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:iload           4
	//    5    6:iload           5
	//    6    8:aconst_null     
	//    7    9:aconst_null     
	//    8   10:iconst_0        
	//    9   11:aload           6
	//   10   13:invokespecial   #204 <Method void ExtractorSampleSource(Uri, DataSource, Allocator, int, int, Handler, ExtractorSampleSource$EventListener, int, Extractor[])>
	//   11   16:return          
	}

	public transient ExtractorSampleSource(Uri uri1, DataSource datasource, Allocator allocator1, int i, Handler handler, EventListener eventlistener, int j, 
			Extractor aextractor[])
	{
		ExtractorSampleSource(uri1, datasource, allocator1, i, -1, handler, eventlistener, j, aextractor);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:iload           4
	//    5    6:iconst_m1       
	//    6    7:aload           5
	//    7    9:aload           6
	//    8   11:iload           7
	//    9   13:aload           8
	//   10   15:invokespecial   #204 <Method void ExtractorSampleSource(Uri, DataSource, Allocator, int, int, Handler, ExtractorSampleSource$EventListener, int, Extractor[])>
	//   11   18:return          
	}

	public transient ExtractorSampleSource(Uri uri1, DataSource datasource, Allocator allocator1, int i, Extractor aextractor[])
	{
		ExtractorSampleSource(uri1, datasource, allocator1, i, -1, aextractor);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:iload           4
	//    5    6:iconst_m1       
	//    6    7:aload           5
	//    7    9:invokespecial   #208 <Method void ExtractorSampleSource(Uri, DataSource, Allocator, int, int, Extractor[])>
	//    8   12:return          
	}

	private void clearState()
	{
		for(int i = 0; i < sampleQueues.size(); i++)
	//*   0    0:iconst_0        
	//*   1    1:istore_1        
	//*   2    2:iload_1         
	//*   3    3:aload_0         
	//*   4    4:getfield        #199 <Field SparseArray sampleQueues>
	//*   5    7:invokevirtual   #219 <Method int SparseArray.size()>
	//*   6   10:icmpge          34
			((InternalTrackOutput)sampleQueues.valueAt(i)).clear();
	//    7   13:aload_0         
	//    8   14:getfield        #199 <Field SparseArray sampleQueues>
	//    9   17:iload_1         
	//   10   18:invokevirtual   #222 <Method Object SparseArray.valueAt(int)>
	//   11   21:checkcast       #27  <Class ExtractorSampleSource$InternalTrackOutput>
	//   12   24:invokevirtual   #225 <Method void ExtractorSampleSource$InternalTrackOutput.clear()>

	//   13   27:iload_1         
	//   14   28:iconst_1        
	//   15   29:iadd            
	//   16   30:istore_1        
	//*  17   31:goto            2
		loadable = null;
	//   18   34:aload_0         
	//   19   35:aconst_null     
	//   20   36:putfield        #227 <Field ExtractorSampleSource$ExtractingLoadable loadable>
		currentLoadableException = null;
	//   21   39:aload_0         
	//   22   40:aconst_null     
	//   23   41:putfield        #229 <Field IOException currentLoadableException>
		currentLoadableExceptionCount = 0;
	//   24   44:aload_0         
	//   25   45:iconst_0        
	//   26   46:putfield        #231 <Field int currentLoadableExceptionCount>
	//   27   49:return          
	}

	private ExtractingLoadable createLoadableFromPositionUs(long l)
	{
		return new ExtractingLoadable(uri, dataSource, extractorHolder, allocator, requestedBufferSize, seekMap.getPosition(l));
	//    0    0:new             #21  <Class ExtractorSampleSource$ExtractingLoadable>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #156 <Field Uri uri>
	//    4    8:aload_0         
	//    5    9:getfield        #158 <Field DataSource dataSource>
	//    6   12:aload_0         
	//    7   13:getfield        #194 <Field ExtractorSampleSource$ExtractorHolder extractorHolder>
	//    8   16:aload_0         
	//    9   17:getfield        #166 <Field Allocator allocator>
	//   10   20:aload_0         
	//   11   21:getfield        #168 <Field int requestedBufferSize>
	//   12   24:aload_0         
	//   13   25:getfield        #235 <Field SeekMap seekMap>
	//   14   28:lload_1         
	//   15   29:invokeinterface #241 <Method long SeekMap.getPosition(long)>
	//   16   34:invokespecial   #244 <Method void ExtractorSampleSource$ExtractingLoadable(Uri, DataSource, ExtractorSampleSource$ExtractorHolder, Allocator, int, long)>
	//   17   37:areturn         
	}

	private ExtractingLoadable createLoadableFromStart()
	{
		return new ExtractingLoadable(uri, dataSource, extractorHolder, allocator, requestedBufferSize, 0L);
	//    0    0:new             #21  <Class ExtractorSampleSource$ExtractingLoadable>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #156 <Field Uri uri>
	//    4    8:aload_0         
	//    5    9:getfield        #158 <Field DataSource dataSource>
	//    6   12:aload_0         
	//    7   13:getfield        #194 <Field ExtractorSampleSource$ExtractorHolder extractorHolder>
	//    8   16:aload_0         
	//    9   17:getfield        #166 <Field Allocator allocator>
	//   10   20:aload_0         
	//   11   21:getfield        #168 <Field int requestedBufferSize>
	//   12   24:lconst_0        
	//   13   25:invokespecial   #244 <Method void ExtractorSampleSource$ExtractingLoadable(Uri, DataSource, ExtractorSampleSource$ExtractorHolder, Allocator, int, long)>
	//   14   28:areturn         
	}

	private void discardSamplesForDisabledTracks(long l)
	{
		int i = 0;
	//    0    0:iconst_0        
	//    1    1:istore_3        
		do
		{
			boolean aflag[] = trackEnabledStates;
	//    2    2:aload_0         
	//    3    3:getfield        #250 <Field boolean[] trackEnabledStates>
	//    4    6:astore          4
			if(i < aflag.length)
	//*   5    8:iload_3         
	//*   6    9:aload           4
	//*   7   11:arraylength     
	//*   8   12:icmpge          44
			{
				if(!aflag[i])
	//*   9   15:aload           4
	//*  10   17:iload_3         
	//*  11   18:baload          
	//*  12   19:ifne            37
					((InternalTrackOutput)sampleQueues.valueAt(i)).discardUntil(l);
	//   13   22:aload_0         
	//   14   23:getfield        #199 <Field SparseArray sampleQueues>
	//   15   26:iload_3         
	//   16   27:invokevirtual   #222 <Method Object SparseArray.valueAt(int)>
	//   17   30:checkcast       #27  <Class ExtractorSampleSource$InternalTrackOutput>
	//   18   33:lload_1         
	//   19   34:invokevirtual   #253 <Method void ExtractorSampleSource$InternalTrackOutput.discardUntil(long)>
				i++;
	//   20   37:iload_3         
	//   21   38:iconst_1        
	//   22   39:iadd            
	//   23   40:istore_3        
			} else
	//*  24   41:goto            2
			{
				return;
	//   25   44:return          
			}
		} while(true);
	}

	private long getRetryDelayMillis(long l)
	{
		return Math.min((l - 1L) * 1000L, 5000L);
	//    0    0:lload_1         
	//    1    1:lconst_1        
	//    2    2:lsub            
	//    3    3:ldc2w           #255 <Long 1000L>
	//    4    6:lmul            
	//    5    7:ldc2w           #257 <Long 5000L>
	//    6   10:invokestatic    #264 <Method long Math.min(long, long)>
	//    7   13:lreturn         
	}

	private boolean haveFormatsForAllTracks()
	{
		for(int i = 0; i < sampleQueues.size(); i++)
	//*   0    0:iconst_0        
	//*   1    1:istore_1        
	//*   2    2:iload_1         
	//*   3    3:aload_0         
	//*   4    4:getfield        #199 <Field SparseArray sampleQueues>
	//*   5    7:invokevirtual   #219 <Method int SparseArray.size()>
	//*   6   10:icmpge          39
			if(!((InternalTrackOutput)sampleQueues.valueAt(i)).hasFormat())
	//*   7   13:aload_0         
	//*   8   14:getfield        #199 <Field SparseArray sampleQueues>
	//*   9   17:iload_1         
	//*  10   18:invokevirtual   #222 <Method Object SparseArray.valueAt(int)>
	//*  11   21:checkcast       #27  <Class ExtractorSampleSource$InternalTrackOutput>
	//*  12   24:invokevirtual   #269 <Method boolean ExtractorSampleSource$InternalTrackOutput.hasFormat()>
	//*  13   27:ifne            32
				return false;
	//   14   30:iconst_0        
	//   15   31:ireturn         

	//   16   32:iload_1         
	//   17   33:iconst_1        
	//   18   34:iadd            
	//   19   35:istore_1        
	//*  20   36:goto            2
		return true;
	//   21   39:iconst_1        
	//   22   40:ireturn         
	}

	private boolean isCurrentLoadableExceptionFatal()
	{
		return currentLoadableException instanceof UnrecognizedInputFormatException;
	//    0    0:aload_0         
	//    1    1:getfield        #229 <Field IOException currentLoadableException>
	//    2    4:instanceof      #30  <Class ExtractorSampleSource$UnrecognizedInputFormatException>
	//    3    7:ireturn         
	}

	private boolean isPendingReset()
	{
		return pendingResetPositionUs != 0x0L;
	//    0    0:aload_0         
	//    1    1:getfield        #201 <Field long pendingResetPositionUs>
	//    2    4:ldc2w           #44  <Long 0x0L>
	//    3    7:lcmp            
	//    4    8:ifeq            13
	//    5   11:iconst_1        
	//    6   12:ireturn         
	//    7   13:iconst_0        
	//    8   14:ireturn         
	}

	private void maybeStartLoading()
	{
		if(!loadingFinished)
	//*   0    0:aload_0         
	//*   1    1:getfield        #274 <Field boolean loadingFinished>
	//*   2    4:ifne            347
		{
			if(loader.isLoading())
	//*   3    7:aload_0         
	//*   4    8:getfield        #276 <Field Loader loader>
	//*   5   11:invokevirtual   #281 <Method boolean Loader.isLoading()>
	//*   6   14:ifeq            18
				return;
	//    7   17:return          
			IOException ioexception = currentLoadableException;
	//    8   18:aload_0         
	//    9   19:getfield        #229 <Field IOException currentLoadableException>
	//   10   22:astore          6
			boolean flag = false;
	//   11   24:iconst_0        
	//   12   25:istore_2        
			int i = 0;
	//   13   26:iconst_0        
	//   14   27:istore_1        
			if(ioexception != null)
	//*  15   28:aload           6
	//*  16   30:ifnull          234
			{
				if(isCurrentLoadableExceptionFatal())
	//*  17   33:aload_0         
	//*  18   34:invokespecial   #283 <Method boolean isCurrentLoadableExceptionFatal()>
	//*  19   37:ifeq            41
					return;
	//   20   40:return          
				boolean flag1;
				if(loadable != null)
	//*  21   41:aload_0         
	//*  22   42:getfield        #227 <Field ExtractorSampleSource$ExtractingLoadable loadable>
	//*  23   45:ifnull          53
					flag1 = true;
	//   24   48:iconst_1        
	//   25   49:istore_3        
				else
	//*  26   50:goto            55
					flag1 = false;
	//   27   53:iconst_0        
	//   28   54:istore_3        
				Assertions.checkState(flag1);
	//   29   55:iload_3         
	//   30   56:invokestatic    #289 <Method void Assertions.checkState(boolean)>
				if(SystemClock.elapsedRealtime() - currentLoadableExceptionTimestamp >= getRetryDelayMillis(currentLoadableExceptionCount))
	//*  31   59:invokestatic    #295 <Method long SystemClock.elapsedRealtime()>
	//*  32   62:aload_0         
	//*  33   63:getfield        #297 <Field long currentLoadableExceptionTimestamp>
	//*  34   66:lsub            
	//*  35   67:aload_0         
	//*  36   68:aload_0         
	//*  37   69:getfield        #231 <Field int currentLoadableExceptionCount>
	//*  38   72:i2l             
	//*  39   73:invokespecial   #299 <Method long getRetryDelayMillis(long)>
	//*  40   76:lcmp            
	//*  41   77:iflt            233
				{
					currentLoadableException = null;
	//   42   80:aload_0         
	//   43   81:aconst_null     
	//   44   82:putfield        #229 <Field IOException currentLoadableException>
					if(!prepared)
	//*  45   85:aload_0         
	//*  46   86:getfield        #301 <Field boolean prepared>
	//*  47   89:ifne            135
					{
						for(; i < sampleQueues.size(); i++)
	//*  48   92:iload_1         
	//*  49   93:aload_0         
	//*  50   94:getfield        #199 <Field SparseArray sampleQueues>
	//*  51   97:invokevirtual   #219 <Method int SparseArray.size()>
	//*  52  100:icmpge          124
							((InternalTrackOutput)sampleQueues.valueAt(i)).clear();
	//   53  103:aload_0         
	//   54  104:getfield        #199 <Field SparseArray sampleQueues>
	//   55  107:iload_1         
	//   56  108:invokevirtual   #222 <Method Object SparseArray.valueAt(int)>
	//   57  111:checkcast       #27  <Class ExtractorSampleSource$InternalTrackOutput>
	//   58  114:invokevirtual   #225 <Method void ExtractorSampleSource$InternalTrackOutput.clear()>

	//   59  117:iload_1         
	//   60  118:iconst_1        
	//   61  119:iadd            
	//   62  120:istore_1        
	//*  63  121:goto            92
						loadable = createLoadableFromStart();
	//   64  124:aload_0         
	//   65  125:aload_0         
	//   66  126:invokespecial   #303 <Method ExtractorSampleSource$ExtractingLoadable createLoadableFromStart()>
	//   67  129:putfield        #227 <Field ExtractorSampleSource$ExtractingLoadable loadable>
					} else
	//*  68  132:goto            213
					if(!seekMap.isSeekable() && maxTrackDurationUs == -1L)
	//*  69  135:aload_0         
	//*  70  136:getfield        #235 <Field SeekMap seekMap>
	//*  71  139:invokeinterface #306 <Method boolean SeekMap.isSeekable()>
	//*  72  144:ifne            213
	//*  73  147:aload_0         
	//*  74  148:getfield        #308 <Field long maxTrackDurationUs>
	//*  75  151:ldc2w           #309 <Long -1L>
	//*  76  154:lcmp            
	//*  77  155:ifne            213
					{
						for(int j = ((int) (flag)); j < sampleQueues.size(); j++)
	//*  78  158:iload_2         
	//*  79  159:istore_1        
	//*  80  160:iload_1         
	//*  81  161:aload_0         
	//*  82  162:getfield        #199 <Field SparseArray sampleQueues>
	//*  83  165:invokevirtual   #219 <Method int SparseArray.size()>
	//*  84  168:icmpge          192
							((InternalTrackOutput)sampleQueues.valueAt(j)).clear();
	//   85  171:aload_0         
	//   86  172:getfield        #199 <Field SparseArray sampleQueues>
	//   87  175:iload_1         
	//   88  176:invokevirtual   #222 <Method Object SparseArray.valueAt(int)>
	//   89  179:checkcast       #27  <Class ExtractorSampleSource$InternalTrackOutput>
	//   90  182:invokevirtual   #225 <Method void ExtractorSampleSource$InternalTrackOutput.clear()>

	//   91  185:iload_1         
	//   92  186:iconst_1        
	//   93  187:iadd            
	//   94  188:istore_1        
	//*  95  189:goto            160
						loadable = createLoadableFromStart();
	//   96  192:aload_0         
	//   97  193:aload_0         
	//   98  194:invokespecial   #303 <Method ExtractorSampleSource$ExtractingLoadable createLoadableFromStart()>
	//   99  197:putfield        #227 <Field ExtractorSampleSource$ExtractingLoadable loadable>
						pendingNextSampleUs = downstreamPositionUs;
	//  100  200:aload_0         
	//  101  201:aload_0         
	//  102  202:getfield        #312 <Field long downstreamPositionUs>
	//  103  205:putfield        #314 <Field long pendingNextSampleUs>
						havePendingNextSampleUs = true;
	//  104  208:aload_0         
	//  105  209:iconst_1        
	//  106  210:putfield        #316 <Field boolean havePendingNextSampleUs>
					}
					extractedSampleCountAtStartOfLoad = extractedSampleCount;
	//  107  213:aload_0         
	//  108  214:aload_0         
	//  109  215:getfield        #217 <Field int extractedSampleCount>
	//  110  218:putfield        #318 <Field int extractedSampleCountAtStartOfLoad>
					loader.startLoading(((com.google.android.exoplayer.upstream.Loader.Loadable) (loadable)), ((com.google.android.exoplayer.upstream.Loader.Callback) (this)));
	//  111  221:aload_0         
	//  112  222:getfield        #276 <Field Loader loader>
	//  113  225:aload_0         
	//  114  226:getfield        #227 <Field ExtractorSampleSource$ExtractingLoadable loadable>
	//  115  229:aload_0         
	//  116  230:invokevirtual   #322 <Method void Loader.startLoading(com.google.android.exoplayer.upstream.Loader$Loadable, com.google.android.exoplayer.upstream.Loader$Callback)>
				}
				return;
	//  117  233:return          
			}
			sampleTimeOffsetUs = 0L;
	//  118  234:aload_0         
	//  119  235:lconst_0        
	//  120  236:putfield        #324 <Field long sampleTimeOffsetUs>
			havePendingNextSampleUs = false;
	//  121  239:aload_0         
	//  122  240:iconst_0        
	//  123  241:putfield        #316 <Field boolean havePendingNextSampleUs>
			if(!prepared)
	//* 124  244:aload_0         
	//* 125  245:getfield        #301 <Field boolean prepared>
	//* 126  248:ifne            262
			{
				loadable = createLoadableFromStart();
	//  127  251:aload_0         
	//  128  252:aload_0         
	//  129  253:invokespecial   #303 <Method ExtractorSampleSource$ExtractingLoadable createLoadableFromStart()>
	//  130  256:putfield        #227 <Field ExtractorSampleSource$ExtractingLoadable loadable>
			} else
	//* 131  259:goto            326
			{
				Assertions.checkState(isPendingReset());
	//  132  262:aload_0         
	//  133  263:invokespecial   #326 <Method boolean isPendingReset()>
	//  134  266:invokestatic    #289 <Method void Assertions.checkState(boolean)>
				long l = maxTrackDurationUs;
	//  135  269:aload_0         
	//  136  270:getfield        #308 <Field long maxTrackDurationUs>
	//  137  273:lstore          4
				if(l != -1L && pendingResetPositionUs >= l)
	//* 138  275:lload           4
	//* 139  277:ldc2w           #309 <Long -1L>
	//* 140  280:lcmp            
	//* 141  281:ifeq            307
	//* 142  284:aload_0         
	//* 143  285:getfield        #201 <Field long pendingResetPositionUs>
	//* 144  288:lload           4
	//* 145  290:lcmp            
	//* 146  291:iflt            307
				{
					loadingFinished = true;
	//  147  294:aload_0         
	//  148  295:iconst_1        
	//  149  296:putfield        #274 <Field boolean loadingFinished>
					pendingResetPositionUs = 0x0L;
	//  150  299:aload_0         
	//  151  300:ldc2w           #44  <Long 0x0L>
	//  152  303:putfield        #201 <Field long pendingResetPositionUs>
					return;
	//  153  306:return          
				}
				loadable = createLoadableFromPositionUs(pendingResetPositionUs);
	//  154  307:aload_0         
	//  155  308:aload_0         
	//  156  309:aload_0         
	//  157  310:getfield        #201 <Field long pendingResetPositionUs>
	//  158  313:invokespecial   #328 <Method ExtractorSampleSource$ExtractingLoadable createLoadableFromPositionUs(long)>
	//  159  316:putfield        #227 <Field ExtractorSampleSource$ExtractingLoadable loadable>
				pendingResetPositionUs = 0x0L;
	//  160  319:aload_0         
	//  161  320:ldc2w           #44  <Long 0x0L>
	//  162  323:putfield        #201 <Field long pendingResetPositionUs>
			}
			extractedSampleCountAtStartOfLoad = extractedSampleCount;
	//  163  326:aload_0         
	//  164  327:aload_0         
	//  165  328:getfield        #217 <Field int extractedSampleCount>
	//  166  331:putfield        #318 <Field int extractedSampleCountAtStartOfLoad>
			loader.startLoading(((com.google.android.exoplayer.upstream.Loader.Loadable) (loadable)), ((com.google.android.exoplayer.upstream.Loader.Callback) (this)));
	//  167  334:aload_0         
	//  168  335:getfield        #276 <Field Loader loader>
	//  169  338:aload_0         
	//  170  339:getfield        #227 <Field ExtractorSampleSource$ExtractingLoadable loadable>
	//  171  342:aload_0         
	//  172  343:invokevirtual   #322 <Method void Loader.startLoading(com.google.android.exoplayer.upstream.Loader$Loadable, com.google.android.exoplayer.upstream.Loader$Callback)>
			return;
	//  173  346:return          
		} else
		{
			return;
	//  174  347:return          
		}
	}

	private void notifyLoadError(final IOException e)
	{
		Handler handler = eventHandler;
	//    0    0:aload_0         
	//    1    1:getfield        #162 <Field Handler eventHandler>
	//    2    4:astore_2        
		if(handler != null && eventListener != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          30
	//*   5    9:aload_0         
	//*   6   10:getfield        #160 <Field ExtractorSampleSource$EventListener eventListener>
	//*   7   13:ifnull          30
			handler.post(new Runnable() {

				public void run()
				{
					eventListener.onLoadError(eventSourceId, e);
				//    0    0:aload_0         
				//    1    1:getfield        #19  <Field ExtractorSampleSource this$0>
				//    2    4:invokestatic    #30  <Method ExtractorSampleSource$EventListener ExtractorSampleSource.access$200(ExtractorSampleSource)>
				//    3    7:aload_0         
				//    4    8:getfield        #19  <Field ExtractorSampleSource this$0>
				//    5   11:invokestatic    #34  <Method int ExtractorSampleSource.access$100(ExtractorSampleSource)>
				//    6   14:aload_0         
				//    7   15:getfield        #21  <Field IOException val$e>
				//    8   18:invokeinterface #40  <Method void ExtractorSampleSource$EventListener.onLoadError(int, IOException)>
				//    9   23:return          
				}

				final ExtractorSampleSource this$0;
				final IOException val$e;

			
			{
				this$0 = ExtractorSampleSource.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field ExtractorSampleSource this$0>
				e = ioexception;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field IOException val$e>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
			}
);
	//    8   16:aload_2         
	//    9   17:new             #16  <Class ExtractorSampleSource$2>
	//   10   20:dup             
	//   11   21:aload_0         
	//   12   22:aload_1         
	//   13   23:invokespecial   #333 <Method void ExtractorSampleSource$2(ExtractorSampleSource, IOException)>
	//   14   26:invokevirtual   #339 <Method boolean Handler.post(Runnable)>
	//   15   29:pop             
	//   16   30:return          
	}

	private void restartFrom(long l)
	{
		pendingResetPositionUs = l;
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:putfield        #201 <Field long pendingResetPositionUs>
		loadingFinished = false;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #274 <Field boolean loadingFinished>
		if(loader.isLoading())
	//*   6   10:aload_0         
	//*   7   11:getfield        #276 <Field Loader loader>
	//*   8   14:invokevirtual   #281 <Method boolean Loader.isLoading()>
	//*   9   17:ifeq            28
		{
			loader.cancelLoading();
	//   10   20:aload_0         
	//   11   21:getfield        #276 <Field Loader loader>
	//   12   24:invokevirtual   #343 <Method void Loader.cancelLoading()>
			return;
	//   13   27:return          
		} else
		{
			clearState();
	//   14   28:aload_0         
	//   15   29:invokespecial   #345 <Method void clearState()>
			maybeStartLoading();
	//   16   32:aload_0         
	//   17   33:invokespecial   #347 <Method void maybeStartLoading()>
			return;
	//   18   36:return          
		}
	}

	public boolean continueBuffering(int i, long l)
	{
		Assertions.checkState(prepared);
	//    0    0:aload_0         
	//    1    1:getfield        #301 <Field boolean prepared>
	//    2    4:invokestatic    #289 <Method void Assertions.checkState(boolean)>
		Assertions.checkState(trackEnabledStates[i]);
	//    3    7:aload_0         
	//    4    8:getfield        #250 <Field boolean[] trackEnabledStates>
	//    5   11:iload_1         
	//    6   12:baload          
	//    7   13:invokestatic    #289 <Method void Assertions.checkState(boolean)>
		downstreamPositionUs = l;
	//    8   16:aload_0         
	//    9   17:lload_2         
	//   10   18:putfield        #312 <Field long downstreamPositionUs>
		discardSamplesForDisabledTracks(downstreamPositionUs);
	//   11   21:aload_0         
	//   12   22:aload_0         
	//   13   23:getfield        #312 <Field long downstreamPositionUs>
	//   14   26:invokespecial   #351 <Method void discardSamplesForDisabledTracks(long)>
		if(loadingFinished)
	//*  15   29:aload_0         
	//*  16   30:getfield        #274 <Field boolean loadingFinished>
	//*  17   33:ifeq            38
			return true;
	//   18   36:iconst_1        
	//   19   37:ireturn         
		maybeStartLoading();
	//   20   38:aload_0         
	//   21   39:invokespecial   #347 <Method void maybeStartLoading()>
		if(isPendingReset())
	//*  22   42:aload_0         
	//*  23   43:invokespecial   #326 <Method boolean isPendingReset()>
	//*  24   46:ifeq            51
			return false;
	//   25   49:iconst_0        
	//   26   50:ireturn         
		else
			return ((InternalTrackOutput)sampleQueues.valueAt(i)).isEmpty() ^ true;
	//   27   51:aload_0         
	//   28   52:getfield        #199 <Field SparseArray sampleQueues>
	//   29   55:iload_1         
	//   30   56:invokevirtual   #222 <Method Object SparseArray.valueAt(int)>
	//   31   59:checkcast       #27  <Class ExtractorSampleSource$InternalTrackOutput>
	//   32   62:invokevirtual   #354 <Method boolean ExtractorSampleSource$InternalTrackOutput.isEmpty()>
	//   33   65:iconst_1        
	//   34   66:ixor            
	//   35   67:ireturn         
	}

	public void disable(int i)
	{
		Assertions.checkState(prepared);
	//    0    0:aload_0         
	//    1    1:getfield        #301 <Field boolean prepared>
	//    2    4:invokestatic    #289 <Method void Assertions.checkState(boolean)>
		Assertions.checkState(trackEnabledStates[i]);
	//    3    7:aload_0         
	//    4    8:getfield        #250 <Field boolean[] trackEnabledStates>
	//    5   11:iload_1         
	//    6   12:baload          
	//    7   13:invokestatic    #289 <Method void Assertions.checkState(boolean)>
		enabledTrackCount = enabledTrackCount - 1;
	//    8   16:aload_0         
	//    9   17:aload_0         
	//   10   18:getfield        #358 <Field int enabledTrackCount>
	//   11   21:iconst_1        
	//   12   22:isub            
	//   13   23:putfield        #358 <Field int enabledTrackCount>
		trackEnabledStates[i] = false;
	//   14   26:aload_0         
	//   15   27:getfield        #250 <Field boolean[] trackEnabledStates>
	//   16   30:iload_1         
	//   17   31:iconst_0        
	//   18   32:bastore         
		if(enabledTrackCount == 0)
	//*  19   33:aload_0         
	//*  20   34:getfield        #358 <Field int enabledTrackCount>
	//*  21   37:ifne            79
		{
			downstreamPositionUs = 0x0L;
	//   22   40:aload_0         
	//   23   41:ldc2w           #44  <Long 0x0L>
	//   24   44:putfield        #312 <Field long downstreamPositionUs>
			if(loader.isLoading())
	//*  25   47:aload_0         
	//*  26   48:getfield        #276 <Field Loader loader>
	//*  27   51:invokevirtual   #281 <Method boolean Loader.isLoading()>
	//*  28   54:ifeq            65
			{
				loader.cancelLoading();
	//   29   57:aload_0         
	//   30   58:getfield        #276 <Field Loader loader>
	//   31   61:invokevirtual   #343 <Method void Loader.cancelLoading()>
				return;
	//   32   64:return          
			}
			clearState();
	//   33   65:aload_0         
	//   34   66:invokespecial   #345 <Method void clearState()>
			allocator.trim(0);
	//   35   69:aload_0         
	//   36   70:getfield        #166 <Field Allocator allocator>
	//   37   73:iconst_0        
	//   38   74:invokeinterface #363 <Method void Allocator.trim(int)>
		}
	//   39   79:return          
	}

	public void drmInitData(DrmInitData drminitdata)
	{
		drmInitData = drminitdata;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #366 <Field DrmInitData drmInitData>
	//    3    5:return          
	}

	public void enable(int i, long l)
	{
		Assertions.checkState(prepared);
	//    0    0:aload_0         
	//    1    1:getfield        #301 <Field boolean prepared>
	//    2    4:invokestatic    #289 <Method void Assertions.checkState(boolean)>
		Assertions.checkState(trackEnabledStates[i] ^ true);
	//    3    7:aload_0         
	//    4    8:getfield        #250 <Field boolean[] trackEnabledStates>
	//    5   11:iload_1         
	//    6   12:baload          
	//    7   13:iconst_1        
	//    8   14:ixor            
	//    9   15:invokestatic    #289 <Method void Assertions.checkState(boolean)>
		enabledTrackCount = enabledTrackCount + 1;
	//   10   18:aload_0         
	//   11   19:aload_0         
	//   12   20:getfield        #358 <Field int enabledTrackCount>
	//   13   23:iconst_1        
	//   14   24:iadd            
	//   15   25:putfield        #358 <Field int enabledTrackCount>
		trackEnabledStates[i] = true;
	//   16   28:aload_0         
	//   17   29:getfield        #250 <Field boolean[] trackEnabledStates>
	//   18   32:iload_1         
	//   19   33:iconst_1        
	//   20   34:bastore         
		pendingMediaFormat[i] = true;
	//   21   35:aload_0         
	//   22   36:getfield        #370 <Field boolean[] pendingMediaFormat>
	//   23   39:iload_1         
	//   24   40:iconst_1        
	//   25   41:bastore         
		pendingDiscontinuities[i] = false;
	//   26   42:aload_0         
	//   27   43:getfield        #372 <Field boolean[] pendingDiscontinuities>
	//   28   46:iload_1         
	//   29   47:iconst_0        
	//   30   48:bastore         
		if(enabledTrackCount == 1)
	//*  31   49:aload_0         
	//*  32   50:getfield        #358 <Field int enabledTrackCount>
	//*  33   53:iconst_1        
	//*  34   54:icmpne          86
		{
			if(!seekMap.isSeekable())
	//*  35   57:aload_0         
	//*  36   58:getfield        #235 <Field SeekMap seekMap>
	//*  37   61:invokeinterface #306 <Method boolean SeekMap.isSeekable()>
	//*  38   66:ifne            71
				l = 0L;
	//   39   69:lconst_0        
	//   40   70:lstore_2        
			downstreamPositionUs = l;
	//   41   71:aload_0         
	//   42   72:lload_2         
	//   43   73:putfield        #312 <Field long downstreamPositionUs>
			lastSeekPositionUs = l;
	//   44   76:aload_0         
	//   45   77:lload_2         
	//   46   78:putfield        #374 <Field long lastSeekPositionUs>
			restartFrom(l);
	//   47   81:aload_0         
	//   48   82:lload_2         
	//   49   83:invokespecial   #376 <Method void restartFrom(long)>
		}
	//   50   86:return          
	}

	public void endTracks()
	{
		tracksBuilt = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #379 <Field boolean tracksBuilt>
	//    3    5:return          
	}

	public long getBufferedPositionUs()
	{
		if(loadingFinished)
	//*   0    0:aload_0         
	//*   1    1:getfield        #274 <Field boolean loadingFinished>
	//*   2    4:ifeq            11
			return -3L;
	//    3    7:ldc2w           #381 <Long -3L>
	//    4   10:lreturn         
		if(isPendingReset())
	//*   5   11:aload_0         
	//*   6   12:invokespecial   #326 <Method boolean isPendingReset()>
	//*   7   15:ifeq            23
			return pendingResetPositionUs;
	//    8   18:aload_0         
	//    9   19:getfield        #201 <Field long pendingResetPositionUs>
	//   10   22:lreturn         
		int i = 0;
	//   11   23:iconst_0        
	//   12   24:istore_1        
		long l = 0x0L;
	//   13   25:ldc2w           #44  <Long 0x0L>
	//   14   28:lstore_2        
		for(; i < sampleQueues.size(); i++)
	//*  15   29:iload_1         
	//*  16   30:aload_0         
	//*  17   31:getfield        #199 <Field SparseArray sampleQueues>
	//*  18   34:invokevirtual   #219 <Method int SparseArray.size()>
	//*  19   37:icmpge          66
			l = Math.max(l, ((InternalTrackOutput)sampleQueues.valueAt(i)).getLargestParsedTimestampUs());
	//   20   40:lload_2         
	//   21   41:aload_0         
	//   22   42:getfield        #199 <Field SparseArray sampleQueues>
	//   23   45:iload_1         
	//   24   46:invokevirtual   #222 <Method Object SparseArray.valueAt(int)>
	//   25   49:checkcast       #27  <Class ExtractorSampleSource$InternalTrackOutput>
	//   26   52:invokevirtual   #385 <Method long ExtractorSampleSource$InternalTrackOutput.getLargestParsedTimestampUs()>
	//   27   55:invokestatic    #388 <Method long Math.max(long, long)>
	//   28   58:lstore_2        

	//   29   59:iload_1         
	//   30   60:iconst_1        
	//   31   61:iadd            
	//   32   62:istore_1        
	//*  33   63:goto            29
		long l1 = l;
	//   34   66:lload_2         
	//   35   67:lstore          4
		if(l == 0x0L)
	//*  36   69:lload_2         
	//*  37   70:ldc2w           #44  <Long 0x0L>
	//*  38   73:lcmp            
	//*  39   74:ifne            83
			l1 = downstreamPositionUs;
	//   40   77:aload_0         
	//   41   78:getfield        #312 <Field long downstreamPositionUs>
	//   42   81:lstore          4
		return l1;
	//   43   83:lload           4
	//   44   85:lreturn         
	}

	public MediaFormat getFormat(int i)
	{
		Assertions.checkState(prepared);
	//    0    0:aload_0         
	//    1    1:getfield        #301 <Field boolean prepared>
	//    2    4:invokestatic    #289 <Method void Assertions.checkState(boolean)>
		return mediaFormats[i];
	//    3    7:aload_0         
	//    4    8:getfield        #392 <Field MediaFormat[] mediaFormats>
	//    5   11:iload_1         
	//    6   12:aaload          
	//    7   13:areturn         
	}

	public int getTrackCount()
	{
		return sampleQueues.size();
	//    0    0:aload_0         
	//    1    1:getfield        #199 <Field SparseArray sampleQueues>
	//    2    4:invokevirtual   #219 <Method int SparseArray.size()>
	//    3    7:ireturn         
	}

	public void maybeThrowError()
		throws IOException
	{
		if(currentLoadableException == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #229 <Field IOException currentLoadableException>
	//*   2    4:ifnonnull       8
			return;
	//    3    7:return          
		if(!isCurrentLoadableExceptionFatal())
	//*   4    8:aload_0         
	//*   5    9:invokespecial   #283 <Method boolean isCurrentLoadableExceptionFatal()>
	//*   6   12:ifne            69
		{
			int i = minLoadableRetryCount;
	//    7   15:aload_0         
	//    8   16:getfield        #170 <Field int minLoadableRetryCount>
	//    9   19:istore_1        
			if(i == -1)
	//*  10   20:iload_1         
	//*  11   21:iconst_m1       
	//*  12   22:icmpeq          28
	//*  13   25:goto            55
				if(seekMap != null && !seekMap.isSeekable())
	//*  14   28:aload_0         
	//*  15   29:getfield        #235 <Field SeekMap seekMap>
	//*  16   32:ifnull          53
	//*  17   35:aload_0         
	//*  18   36:getfield        #235 <Field SeekMap seekMap>
	//*  19   39:invokeinterface #306 <Method boolean SeekMap.isSeekable()>
	//*  20   44:ifne            53
					i = 6;
	//   21   47:bipush          6
	//   22   49:istore_1        
				else
	//*  23   50:goto            55
					i = 3;
	//   24   53:iconst_3        
	//   25   54:istore_1        
			if(currentLoadableExceptionCount <= i)
	//*  26   55:aload_0         
	//*  27   56:getfield        #231 <Field int currentLoadableExceptionCount>
	//*  28   59:iload_1         
	//*  29   60:icmpgt          64
				return;
	//   30   63:return          
			else
				throw currentLoadableException;
	//   31   64:aload_0         
	//   32   65:getfield        #229 <Field IOException currentLoadableException>
	//   33   68:athrow          
		} else
		{
			throw currentLoadableException;
	//   34   69:aload_0         
	//   35   70:getfield        #229 <Field IOException currentLoadableException>
	//   36   73:athrow          
		}
	}

	public void onLoadCanceled(com.google.android.exoplayer.upstream.Loader.Loadable loadable1)
	{
		if(enabledTrackCount > 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #358 <Field int enabledTrackCount>
	//*   2    4:ifle            16
		{
			restartFrom(pendingResetPositionUs);
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #201 <Field long pendingResetPositionUs>
	//    6   12:invokespecial   #376 <Method void restartFrom(long)>
			return;
	//    7   15:return          
		} else
		{
			clearState();
	//    8   16:aload_0         
	//    9   17:invokespecial   #345 <Method void clearState()>
			allocator.trim(0);
	//   10   20:aload_0         
	//   11   21:getfield        #166 <Field Allocator allocator>
	//   12   24:iconst_0        
	//   13   25:invokeinterface #363 <Method void Allocator.trim(int)>
			return;
	//   14   30:return          
		}
	}

	public void onLoadCompleted(com.google.android.exoplayer.upstream.Loader.Loadable loadable1)
	{
		loadingFinished = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #274 <Field boolean loadingFinished>
	//    3    5:return          
	}

	public void onLoadError(com.google.android.exoplayer.upstream.Loader.Loadable loadable1, IOException ioexception)
	{
		currentLoadableException = ioexception;
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:putfield        #229 <Field IOException currentLoadableException>
		int j = extractedSampleCount;
	//    3    5:aload_0         
	//    4    6:getfield        #217 <Field int extractedSampleCount>
	//    5    9:istore          4
		int k = extractedSampleCountAtStartOfLoad;
	//    6   11:aload_0         
	//    7   12:getfield        #318 <Field int extractedSampleCountAtStartOfLoad>
	//    8   15:istore          5
		int i = 1;
	//    9   17:iconst_1        
	//   10   18:istore_3        
		if(j <= k)
	//*  11   19:iload           4
	//*  12   21:iload           5
	//*  13   23:icmple          29
	//*  14   26:goto            36
			i = 1 + currentLoadableExceptionCount;
	//   15   29:iconst_1        
	//   16   30:aload_0         
	//   17   31:getfield        #231 <Field int currentLoadableExceptionCount>
	//   18   34:iadd            
	//   19   35:istore_3        
		currentLoadableExceptionCount = i;
	//   20   36:aload_0         
	//   21   37:iload_3         
	//   22   38:putfield        #231 <Field int currentLoadableExceptionCount>
		currentLoadableExceptionTimestamp = SystemClock.elapsedRealtime();
	//   23   41:aload_0         
	//   24   42:invokestatic    #295 <Method long SystemClock.elapsedRealtime()>
	//   25   45:putfield        #297 <Field long currentLoadableExceptionTimestamp>
		notifyLoadError(ioexception);
	//   26   48:aload_0         
	//   27   49:aload_2         
	//   28   50:invokespecial   #404 <Method void notifyLoadError(IOException)>
		maybeStartLoading();
	//   29   53:aload_0         
	//   30   54:invokespecial   #347 <Method void maybeStartLoading()>
	//   31   57:return          
	}

	public boolean prepare(long l)
	{
		if(prepared)
	//*   0    0:aload_0         
	//*   1    1:getfield        #301 <Field boolean prepared>
	//*   2    4:ifeq            9
			return true;
	//    3    7:iconst_1        
	//    4    8:ireturn         
		if(loader == null)
	//*   5    9:aload_0         
	//*   6   10:getfield        #276 <Field Loader loader>
	//*   7   13:ifnonnull       30
			loader = new Loader("Loader:ExtractorSampleSource");
	//    8   16:aload_0         
	//    9   17:new             #278 <Class Loader>
	//   10   20:dup             
	//   11   21:ldc2            #408 <String "Loader:ExtractorSampleSource">
	//   12   24:invokespecial   #411 <Method void Loader(String)>
	//   13   27:putfield        #276 <Field Loader loader>
		maybeStartLoading();
	//   14   30:aload_0         
	//   15   31:invokespecial   #347 <Method void maybeStartLoading()>
		SeekMap seekmap = seekMap;
	//   16   34:aload_0         
	//   17   35:getfield        #235 <Field SeekMap seekMap>
	//   18   38:astore          5
		int i = 0;
	//   19   40:iconst_0        
	//   20   41:istore_3        
		if(seekmap != null && tracksBuilt && haveFormatsForAllTracks())
	//*  21   42:aload           5
	//*  22   44:ifnull          188
	//*  23   47:aload_0         
	//*  24   48:getfield        #379 <Field boolean tracksBuilt>
	//*  25   51:ifeq            188
	//*  26   54:aload_0         
	//*  27   55:invokespecial   #413 <Method boolean haveFormatsForAllTracks()>
	//*  28   58:ifeq            188
		{
			int j = sampleQueues.size();
	//   29   61:aload_0         
	//   30   62:getfield        #199 <Field SparseArray sampleQueues>
	//   31   65:invokevirtual   #219 <Method int SparseArray.size()>
	//   32   68:istore          4
			trackEnabledStates = new boolean[j];
	//   33   70:aload_0         
	//   34   71:iload           4
	//   35   73:newarray        boolean[]
	//   36   75:putfield        #250 <Field boolean[] trackEnabledStates>
			pendingDiscontinuities = new boolean[j];
	//   37   78:aload_0         
	//   38   79:iload           4
	//   39   81:newarray        boolean[]
	//   40   83:putfield        #372 <Field boolean[] pendingDiscontinuities>
			pendingMediaFormat = new boolean[j];
	//   41   86:aload_0         
	//   42   87:iload           4
	//   43   89:newarray        boolean[]
	//   44   91:putfield        #370 <Field boolean[] pendingMediaFormat>
			mediaFormats = new MediaFormat[j];
	//   45   94:aload_0         
	//   46   95:iload           4
	//   47   97:anewarray       MediaFormat[]
	//   48  100:putfield        #392 <Field MediaFormat[] mediaFormats>
			maxTrackDurationUs = -1L;
	//   49  103:aload_0         
	//   50  104:ldc2w           #309 <Long -1L>
	//   51  107:putfield        #308 <Field long maxTrackDurationUs>
			for(; i < j; i++)
	//*  52  110:iload_3         
	//*  53  111:iload           4
	//*  54  113:icmpge          181
			{
				MediaFormat mediaformat = ((InternalTrackOutput)sampleQueues.valueAt(i)).getFormat();
	//   55  116:aload_0         
	//   56  117:getfield        #199 <Field SparseArray sampleQueues>
	//   57  120:iload_3         
	//   58  121:invokevirtual   #222 <Method Object SparseArray.valueAt(int)>
	//   59  124:checkcast       #27  <Class ExtractorSampleSource$InternalTrackOutput>
	//   60  127:invokevirtual   #418 <Method MediaFormat ExtractorSampleSource$InternalTrackOutput.getFormat()>
	//   61  130:astore          5
				mediaFormats[i] = mediaformat;
	//   62  132:aload_0         
	//   63  133:getfield        #392 <Field MediaFormat[] mediaFormats>
	//   64  136:iload_3         
	//   65  137:aload           5
	//   66  139:aastore         
				if(mediaformat.durationUs != -1L && mediaformat.durationUs > maxTrackDurationUs)
	//*  67  140:aload           5
	//*  68  142:getfield        #421 <Field long MediaFormat.durationUs>
	//*  69  145:ldc2w           #309 <Long -1L>
	//*  70  148:lcmp            
	//*  71  149:ifeq            174
	//*  72  152:aload           5
	//*  73  154:getfield        #421 <Field long MediaFormat.durationUs>
	//*  74  157:aload_0         
	//*  75  158:getfield        #308 <Field long maxTrackDurationUs>
	//*  76  161:lcmp            
	//*  77  162:ifle            174
					maxTrackDurationUs = mediaformat.durationUs;
	//   78  165:aload_0         
	//   79  166:aload           5
	//   80  168:getfield        #421 <Field long MediaFormat.durationUs>
	//   81  171:putfield        #308 <Field long maxTrackDurationUs>
			}

	//   82  174:iload_3         
	//   83  175:iconst_1        
	//   84  176:iadd            
	//   85  177:istore_3        
	//*  86  178:goto            110
			prepared = true;
	//   87  181:aload_0         
	//   88  182:iconst_1        
	//   89  183:putfield        #301 <Field boolean prepared>
			return true;
	//   90  186:iconst_1        
	//   91  187:ireturn         
		} else
		{
			return false;
	//   92  188:iconst_0        
	//   93  189:ireturn         
		}
	}

	public int readData(int i, long l, MediaFormatHolder mediaformatholder, SampleHolder sampleholder)
	{
		downstreamPositionUs = l;
	//    0    0:aload_0         
	//    1    1:lload_2         
	//    2    2:putfield        #312 <Field long downstreamPositionUs>
		if(!pendingDiscontinuities[i])
	//*   3    5:aload_0         
	//*   4    6:getfield        #372 <Field boolean[] pendingDiscontinuities>
	//*   5    9:iload_1         
	//*   6   10:baload          
	//*   7   11:ifne            190
		{
			if(isPendingReset())
	//*   8   14:aload_0         
	//*   9   15:invokespecial   #326 <Method boolean isPendingReset()>
	//*  10   18:ifeq            24
				return -2;
	//   11   21:bipush          -2
	//   12   23:ireturn         
			InternalTrackOutput internaltrackoutput = (InternalTrackOutput)sampleQueues.valueAt(i);
	//   13   24:aload_0         
	//   14   25:getfield        #199 <Field SparseArray sampleQueues>
	//   15   28:iload_1         
	//   16   29:invokevirtual   #222 <Method Object SparseArray.valueAt(int)>
	//   17   32:checkcast       #27  <Class ExtractorSampleSource$InternalTrackOutput>
	//   18   35:astore          7
			if(pendingMediaFormat[i])
	//*  19   37:aload_0         
	//*  20   38:getfield        #370 <Field boolean[] pendingMediaFormat>
	//*  21   41:iload_1         
	//*  22   42:baload          
	//*  23   43:ifeq            75
			{
				mediaformatholder.format = internaltrackoutput.getFormat();
	//   24   46:aload           4
	//   25   48:aload           7
	//   26   50:invokevirtual   #418 <Method MediaFormat ExtractorSampleSource$InternalTrackOutput.getFormat()>
	//   27   53:putfield        #429 <Field MediaFormat MediaFormatHolder.format>
				mediaformatholder.drmInitData = drmInitData;
	//   28   56:aload           4
	//   29   58:aload_0         
	//   30   59:getfield        #366 <Field DrmInitData drmInitData>
	//   31   62:putfield        #430 <Field DrmInitData MediaFormatHolder.drmInitData>
				pendingMediaFormat[i] = false;
	//   32   65:aload_0         
	//   33   66:getfield        #370 <Field boolean[] pendingMediaFormat>
	//   34   69:iload_1         
	//   35   70:iconst_0        
	//   36   71:bastore         
				return -4;
	//   37   72:bipush          -4
	//   38   74:ireturn         
			}
			if(internaltrackoutput.getSample(sampleholder))
	//*  39   75:aload           7
	//*  40   77:aload           5
	//*  41   79:invokevirtual   #434 <Method boolean ExtractorSampleSource$InternalTrackOutput.getSample(SampleHolder)>
	//*  42   82:ifeq            178
			{
				if(sampleholder.timeUs < lastSeekPositionUs)
	//*  43   85:aload           5
	//*  44   87:getfield        #439 <Field long SampleHolder.timeUs>
	//*  45   90:aload_0         
	//*  46   91:getfield        #374 <Field long lastSeekPositionUs>
	//*  47   94:lcmp            
	//*  48   95:ifge            103
					i = 1;
	//   49   98:iconst_1        
	//   50   99:istore_1        
				else
	//*  51  100:goto            105
					i = 0;
	//   52  103:iconst_0        
	//   53  104:istore_1        
				int j = sampleholder.flags;
	//   54  105:aload           5
	//   55  107:getfield        #442 <Field int SampleHolder.flags>
	//   56  110:istore          6
				if(i != 0)
	//*  57  112:iload_1         
	//*  58  113:ifeq            123
					i = 0x8000000;
	//   59  116:ldc2            #443 <Int 0x8000000>
	//   60  119:istore_1        
				else
	//*  61  120:goto            125
					i = 0;
	//   62  123:iconst_0        
	//   63  124:istore_1        
				sampleholder.flags = i | j;
	//   64  125:aload           5
	//   65  127:iload_1         
	//   66  128:iload           6
	//   67  130:ior             
	//   68  131:putfield        #442 <Field int SampleHolder.flags>
				if(havePendingNextSampleUs)
	//*  69  134:aload_0         
	//*  70  135:getfield        #316 <Field boolean havePendingNextSampleUs>
	//*  71  138:ifeq            160
				{
					sampleTimeOffsetUs = pendingNextSampleUs - sampleholder.timeUs;
	//   72  141:aload_0         
	//   73  142:aload_0         
	//   74  143:getfield        #314 <Field long pendingNextSampleUs>
	//   75  146:aload           5
	//   76  148:getfield        #439 <Field long SampleHolder.timeUs>
	//   77  151:lsub            
	//   78  152:putfield        #324 <Field long sampleTimeOffsetUs>
					havePendingNextSampleUs = false;
	//   79  155:aload_0         
	//   80  156:iconst_0        
	//   81  157:putfield        #316 <Field boolean havePendingNextSampleUs>
				}
				sampleholder.timeUs = sampleholder.timeUs + sampleTimeOffsetUs;
	//   82  160:aload           5
	//   83  162:aload           5
	//   84  164:getfield        #439 <Field long SampleHolder.timeUs>
	//   85  167:aload_0         
	//   86  168:getfield        #324 <Field long sampleTimeOffsetUs>
	//   87  171:ladd            
	//   88  172:putfield        #439 <Field long SampleHolder.timeUs>
				return -3;
	//   89  175:bipush          -3
	//   90  177:ireturn         
			}
			return !loadingFinished ? -2 : -1;
	//   91  178:aload_0         
	//   92  179:getfield        #274 <Field boolean loadingFinished>
	//   93  182:ifeq            187
	//   94  185:iconst_m1       
	//   95  186:ireturn         
	//   96  187:bipush          -2
	//   97  189:ireturn         
		} else
		{
			return -2;
	//   98  190:bipush          -2
	//   99  192:ireturn         
		}
	}

	public long readDiscontinuity(int i)
	{
		boolean aflag[] = pendingDiscontinuities;
	//    0    0:aload_0         
	//    1    1:getfield        #372 <Field boolean[] pendingDiscontinuities>
	//    2    4:astore_2        
		if(aflag[i])
	//*   3    5:aload_2         
	//*   4    6:iload_1         
	//*   5    7:baload          
	//*   6    8:ifeq            20
		{
			aflag[i] = false;
	//    7   11:aload_2         
	//    8   12:iload_1         
	//    9   13:iconst_0        
	//   10   14:bastore         
			return lastSeekPositionUs;
	//   11   15:aload_0         
	//   12   16:getfield        #374 <Field long lastSeekPositionUs>
	//   13   19:lreturn         
		} else
		{
			return 0x0L;
	//   14   20:ldc2w           #44  <Long 0x0L>
	//   15   23:lreturn         
		}
	}

	public com.google.android.exoplayer.SampleSource.SampleSourceReader register()
	{
		remainingReleaseCount = remainingReleaseCount + 1;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #449 <Field int remainingReleaseCount>
	//    3    5:iconst_1        
	//    4    6:iadd            
	//    5    7:putfield        #449 <Field int remainingReleaseCount>
		return ((com.google.android.exoplayer.SampleSource.SampleSourceReader) (this));
	//    6   10:aload_0         
	//    7   11:areturn         
	}

	public void release()
	{
		boolean flag;
		if(remainingReleaseCount > 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #449 <Field int remainingReleaseCount>
	//*   2    4:ifle            12
			flag = true;
	//    3    7:iconst_1        
	//    4    8:istore_2        
		else
	//*   5    9:goto            14
			flag = false;
	//    6   12:iconst_0        
	//    7   13:istore_2        
		Assertions.checkState(flag);
	//    8   14:iload_2         
	//    9   15:invokestatic    #289 <Method void Assertions.checkState(boolean)>
		int i = remainingReleaseCount - 1;
	//   10   18:aload_0         
	//   11   19:getfield        #449 <Field int remainingReleaseCount>
	//   12   22:iconst_1        
	//   13   23:isub            
	//   14   24:istore_1        
		remainingReleaseCount = i;
	//   15   25:aload_0         
	//   16   26:iload_1         
	//   17   27:putfield        #449 <Field int remainingReleaseCount>
		if(i == 0)
	//*  18   30:iload_1         
	//*  19   31:ifne            60
		{
			Loader loader1 = loader;
	//   20   34:aload_0         
	//   21   35:getfield        #276 <Field Loader loader>
	//   22   38:astore_3        
			if(loader1 != null)
	//*  23   39:aload_3         
	//*  24   40:ifnull          60
			{
				loader1.release(new Runnable() {

					public void run()
					{
						extractorHolder.release();
					//    0    0:aload_0         
					//    1    1:getfield        #17  <Field ExtractorSampleSource this$0>
					//    2    4:invokestatic    #25  <Method ExtractorSampleSource$ExtractorHolder ExtractorSampleSource.access$000(ExtractorSampleSource)>
					//    3    7:invokevirtual   #28  <Method void ExtractorSampleSource$ExtractorHolder.release()>
					//    4   10:return          
					}

					final ExtractorSampleSource this$0;

			
			{
				this$0 = ExtractorSampleSource.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field ExtractorSampleSource this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
				}
);
	//   25   43:aload_3         
	//   26   44:new             #14  <Class ExtractorSampleSource$1>
	//   27   47:dup             
	//   28   48:aload_0         
	//   29   49:invokespecial   #453 <Method void ExtractorSampleSource$1(ExtractorSampleSource)>
	//   30   52:invokevirtual   #456 <Method void Loader.release(Runnable)>
				loader = null;
	//   31   55:aload_0         
	//   32   56:aconst_null     
	//   33   57:putfield        #276 <Field Loader loader>
			}
		}
	//   34   60:return          
	}

	public void seekMap(SeekMap seekmap)
	{
		seekMap = seekmap;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #235 <Field SeekMap seekMap>
	//    3    5:return          
	}

	public void seekToUs(long l)
	{
		Assertions.checkState(prepared);
	//    0    0:aload_0         
	//    1    1:getfield        #301 <Field boolean prepared>
	//    2    4:invokestatic    #289 <Method void Assertions.checkState(boolean)>
		int i = enabledTrackCount;
	//    3    7:aload_0         
	//    4    8:getfield        #358 <Field int enabledTrackCount>
	//    5   11:istore_3        
		boolean flag1 = false;
	//    6   12:iconst_0        
	//    7   13:istore          5
		boolean flag2;
		if(i > 0)
	//*   8   15:iload_3         
	//*   9   16:ifle            25
			flag2 = true;
	//   10   19:iconst_1        
	//   11   20:istore          8
		else
	//*  12   22:goto            28
			flag2 = false;
	//   13   25:iconst_0        
	//   14   26:istore          8
		Assertions.checkState(flag2);
	//   15   28:iload           8
	//   16   30:invokestatic    #289 <Method void Assertions.checkState(boolean)>
		if(!seekMap.isSeekable())
	//*  17   33:aload_0         
	//*  18   34:getfield        #235 <Field SeekMap seekMap>
	//*  19   37:invokeinterface #306 <Method boolean SeekMap.isSeekable()>
	//*  20   42:ifne            47
			l = 0L;
	//   21   45:lconst_0        
	//   22   46:lstore_1        
		long l1;
		if(isPendingReset())
	//*  23   47:aload_0         
	//*  24   48:invokespecial   #326 <Method boolean isPendingReset()>
	//*  25   51:ifeq            63
			l1 = pendingResetPositionUs;
	//   26   54:aload_0         
	//   27   55:getfield        #201 <Field long pendingResetPositionUs>
	//   28   58:lstore          6
		else
	//*  29   60:goto            69
			l1 = downstreamPositionUs;
	//   30   63:aload_0         
	//   31   64:getfield        #312 <Field long downstreamPositionUs>
	//   32   67:lstore          6
		downstreamPositionUs = l;
	//   33   69:aload_0         
	//   34   70:lload_1         
	//   35   71:putfield        #312 <Field long downstreamPositionUs>
		lastSeekPositionUs = l;
	//   36   74:aload_0         
	//   37   75:lload_1         
	//   38   76:putfield        #374 <Field long lastSeekPositionUs>
		if(l1 == l)
	//*  39   79:lload           6
	//*  40   81:lload_1         
	//*  41   82:lcmp            
	//*  42   83:ifne            87
			return;
	//   43   86:return          
		boolean flag = isPendingReset() ^ true;
	//   44   87:aload_0         
	//   45   88:invokespecial   #326 <Method boolean isPendingReset()>
	//   46   91:iconst_1        
	//   47   92:ixor            
	//   48   93:istore_3        
		for(int j = 0; flag && j < sampleQueues.size(); j++)
	//*  49   94:iconst_0        
	//*  50   95:istore          4
	//*  51   97:iload_3         
	//*  52   98:ifeq            141
	//*  53  101:iload           4
	//*  54  103:aload_0         
	//*  55  104:getfield        #199 <Field SparseArray sampleQueues>
	//*  56  107:invokevirtual   #219 <Method int SparseArray.size()>
	//*  57  110:icmpge          141
			flag &= ((InternalTrackOutput)sampleQueues.valueAt(j)).skipToKeyframeBefore(l);
	//   58  113:iload_3         
	//   59  114:aload_0         
	//   60  115:getfield        #199 <Field SparseArray sampleQueues>
	//   61  118:iload           4
	//   62  120:invokevirtual   #222 <Method Object SparseArray.valueAt(int)>
	//   63  123:checkcast       #27  <Class ExtractorSampleSource$InternalTrackOutput>
	//   64  126:lload_1         
	//   65  127:invokevirtual   #461 <Method boolean ExtractorSampleSource$InternalTrackOutput.skipToKeyframeBefore(long)>
	//   66  130:iand            
	//   67  131:istore_3        

	//   68  132:iload           4
	//   69  134:iconst_1        
	//   70  135:iadd            
	//   71  136:istore          4
	//*  72  138:goto            97
		int k = ((int) (flag1));
	//   73  141:iload           5
	//   74  143:istore          4
		if(!flag)
	//*  75  145:iload_3         
	//*  76  146:ifne            158
		{
			restartFrom(l);
	//   77  149:aload_0         
	//   78  150:lload_1         
	//   79  151:invokespecial   #376 <Method void restartFrom(long)>
			k = ((int) (flag1));
	//   80  154:iload           5
	//   81  156:istore          4
		}
		do
		{
			boolean aflag[] = pendingDiscontinuities;
	//   82  158:aload_0         
	//   83  159:getfield        #372 <Field boolean[] pendingDiscontinuities>
	//   84  162:astore          9
			if(k < aflag.length)
	//*  85  164:iload           4
	//*  86  166:aload           9
	//*  87  168:arraylength     
	//*  88  169:icmpge          187
			{
				aflag[k] = true;
	//   89  172:aload           9
	//   90  174:iload           4
	//   91  176:iconst_1        
	//   92  177:bastore         
				k++;
	//   93  178:iload           4
	//   94  180:iconst_1        
	//   95  181:iadd            
	//   96  182:istore          4
			} else
	//*  97  184:goto            158
			{
				return;
	//   98  187:return          
			}
		} while(true);
	}

	public TrackOutput track(int i)
	{
		InternalTrackOutput internaltrackoutput1 = (InternalTrackOutput)sampleQueues.get(i);
	//    0    0:aload_0         
	//    1    1:getfield        #199 <Field SparseArray sampleQueues>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #464 <Method Object SparseArray.get(int)>
	//    4    8:checkcast       #27  <Class ExtractorSampleSource$InternalTrackOutput>
	//    5   11:astore_3        
		InternalTrackOutput internaltrackoutput = internaltrackoutput1;
	//    6   12:aload_3         
	//    7   13:astore_2        
		if(internaltrackoutput1 == null)
	//*   8   14:aload_3         
	//*   9   15:ifnonnull       40
		{
			internaltrackoutput = new ((InternalTrackOutput)this).InternalTrackOutput(allocator);
	//   10   18:new             #27  <Class ExtractorSampleSource$InternalTrackOutput>
	//   11   21:dup             
	//   12   22:aload_0         
	//   13   23:aload_0         
	//   14   24:getfield        #166 <Field Allocator allocator>
	//   15   27:invokespecial   #467 <Method void ExtractorSampleSource$InternalTrackOutput(ExtractorSampleSource, Allocator)>
	//   16   30:astore_2        
			sampleQueues.put(i, ((Object) (internaltrackoutput)));
	//   17   31:aload_0         
	//   18   32:getfield        #199 <Field SparseArray sampleQueues>
	//   19   35:iload_1         
	//   20   36:aload_2         
	//   21   37:invokevirtual   #471 <Method void SparseArray.put(int, Object)>
		}
		return ((TrackOutput) (internaltrackoutput));
	//   22   40:aload_2         
	//   23   41:areturn         
	}

	private static final List DEFAULT_EXTRACTOR_CLASSES;
	public static final int DEFAULT_MIN_LOADABLE_RETRY_COUNT_LIVE = 6;
	public static final int DEFAULT_MIN_LOADABLE_RETRY_COUNT_ON_DEMAND = 3;
	private static final int MIN_RETRY_COUNT_DEFAULT_FOR_MEDIA = -1;
	private static final long NO_RESET_PENDING = 0x0L;
	private final Allocator allocator;
	private IOException currentLoadableException;
	private int currentLoadableExceptionCount;
	private long currentLoadableExceptionTimestamp;
	private final DataSource dataSource;
	private long downstreamPositionUs;
	private volatile DrmInitData drmInitData;
	private int enabledTrackCount;
	private final Handler eventHandler;
	private final EventListener eventListener;
	private final int eventSourceId;
	private int extractedSampleCount;
	private int extractedSampleCountAtStartOfLoad;
	private final ExtractorHolder extractorHolder;
	private boolean havePendingNextSampleUs;
	private long lastSeekPositionUs;
	private ExtractingLoadable loadable;
	private Loader loader;
	private boolean loadingFinished;
	private long maxTrackDurationUs;
	private MediaFormat mediaFormats[];
	private final int minLoadableRetryCount;
	private boolean pendingDiscontinuities[];
	private boolean pendingMediaFormat[];
	private long pendingNextSampleUs;
	private long pendingResetPositionUs;
	private boolean prepared;
	private int remainingReleaseCount;
	private final int requestedBufferSize;
	private final SparseArray sampleQueues;
	private long sampleTimeOffsetUs;
	private volatile SeekMap seekMap;
	private boolean trackEnabledStates[];
	private volatile boolean tracksBuilt;
	private final Uri uri;

	static 
	{
		DEFAULT_EXTRACTOR_CLASSES = ((List) (new ArrayList()));
	//    0    0:new             #102 <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #105 <Method void ArrayList()>
	//    3    7:putstatic       #107 <Field List DEFAULT_EXTRACTOR_CLASSES>
		try
		{
			DEFAULT_EXTRACTOR_CLASSES.add(((Object) (Class.forName("com.google.android.exoplayer.extractor.webm.WebmExtractor").asSubclass(com/google/android/exoplayer/extractor/Extractor))));
	//    4   10:getstatic       #107 <Field List DEFAULT_EXTRACTOR_CLASSES>
	//    5   13:ldc1            #109 <String "com.google.android.exoplayer.extractor.webm.WebmExtractor">
	//    6   15:invokestatic    #115 <Method Class Class.forName(String)>
	//    7   18:ldc1            #117 <Class Extractor>
	//    8   20:invokevirtual   #121 <Method Class Class.asSubclass(Class)>
	//    9   23:invokeinterface #127 <Method boolean List.add(Object)>
	//   10   28:pop             
		}
	//*  11   29:getstatic       #107 <Field List DEFAULT_EXTRACTOR_CLASSES>
	//*  12   32:ldc1            #129 <String "com.google.android.exoplayer.extractor.mp4.FragmentedMp4Extractor">
	//*  13   34:invokestatic    #115 <Method Class Class.forName(String)>
	//*  14   37:ldc1            #117 <Class Extractor>
	//*  15   39:invokevirtual   #121 <Method Class Class.asSubclass(Class)>
	//*  16   42:invokeinterface #127 <Method boolean List.add(Object)>
	//*  17   47:pop             
	//*  18   48:getstatic       #107 <Field List DEFAULT_EXTRACTOR_CLASSES>
	//*  19   51:ldc1            #131 <String "com.google.android.exoplayer.extractor.mp4.Mp4Extractor">
	//*  20   53:invokestatic    #115 <Method Class Class.forName(String)>
	//*  21   56:ldc1            #117 <Class Extractor>
	//*  22   58:invokevirtual   #121 <Method Class Class.asSubclass(Class)>
	//*  23   61:invokeinterface #127 <Method boolean List.add(Object)>
	//*  24   66:pop             
	//*  25   67:getstatic       #107 <Field List DEFAULT_EXTRACTOR_CLASSES>
	//*  26   70:ldc1            #133 <String "com.google.android.exoplayer.extractor.mp3.Mp3Extractor">
	//*  27   72:invokestatic    #115 <Method Class Class.forName(String)>
	//*  28   75:ldc1            #117 <Class Extractor>
	//*  29   77:invokevirtual   #121 <Method Class Class.asSubclass(Class)>
	//*  30   80:invokeinterface #127 <Method boolean List.add(Object)>
	//*  31   85:pop             
	//*  32   86:getstatic       #107 <Field List DEFAULT_EXTRACTOR_CLASSES>
	//*  33   89:ldc1            #135 <String "com.google.android.exoplayer.extractor.ts.AdtsExtractor">
	//*  34   91:invokestatic    #115 <Method Class Class.forName(String)>
	//*  35   94:ldc1            #117 <Class Extractor>
	//*  36   96:invokevirtual   #121 <Method Class Class.asSubclass(Class)>
	//*  37   99:invokeinterface #127 <Method boolean List.add(Object)>
	//*  38  104:pop             
	//*  39  105:getstatic       #107 <Field List DEFAULT_EXTRACTOR_CLASSES>
	//*  40  108:ldc1            #137 <String "com.google.android.exoplayer.extractor.ts.TsExtractor">
	//*  41  110:invokestatic    #115 <Method Class Class.forName(String)>
	//*  42  113:ldc1            #117 <Class Extractor>
	//*  43  115:invokevirtual   #121 <Method Class Class.asSubclass(Class)>
	//*  44  118:invokeinterface #127 <Method boolean List.add(Object)>
	//*  45  123:pop             
	//*  46  124:getstatic       #107 <Field List DEFAULT_EXTRACTOR_CLASSES>
	//*  47  127:ldc1            #139 <String "com.google.android.exoplayer.extractor.flv.FlvExtractor">
	//*  48  129:invokestatic    #115 <Method Class Class.forName(String)>
	//*  49  132:ldc1            #117 <Class Extractor>
	//*  50  134:invokevirtual   #121 <Method Class Class.asSubclass(Class)>
	//*  51  137:invokeinterface #127 <Method boolean List.add(Object)>
	//*  52  142:pop             
	//*  53  143:getstatic       #107 <Field List DEFAULT_EXTRACTOR_CLASSES>
	//*  54  146:ldc1            #141 <String "com.google.android.exoplayer.extractor.ogg.OggExtractor">
	//*  55  148:invokestatic    #115 <Method Class Class.forName(String)>
	//*  56  151:ldc1            #117 <Class Extractor>
	//*  57  153:invokevirtual   #121 <Method Class Class.asSubclass(Class)>
	//*  58  156:invokeinterface #127 <Method boolean List.add(Object)>
	//*  59  161:pop             
	//*  60  162:getstatic       #107 <Field List DEFAULT_EXTRACTOR_CLASSES>
	//*  61  165:ldc1            #143 <String "com.google.android.exoplayer.extractor.ts.PsExtractor">
	//*  62  167:invokestatic    #115 <Method Class Class.forName(String)>
	//*  63  170:ldc1            #117 <Class Extractor>
	//*  64  172:invokevirtual   #121 <Method Class Class.asSubclass(Class)>
	//*  65  175:invokeinterface #127 <Method boolean List.add(Object)>
	//*  66  180:pop             
	//*  67  181:getstatic       #107 <Field List DEFAULT_EXTRACTOR_CLASSES>
	//*  68  184:ldc1            #145 <String "com.google.android.exoplayer.extractor.wav.WavExtractor">
	//*  69  186:invokestatic    #115 <Method Class Class.forName(String)>
	//*  70  189:ldc1            #117 <Class Extractor>
	//*  71  191:invokevirtual   #121 <Method Class Class.asSubclass(Class)>
	//*  72  194:invokeinterface #127 <Method boolean List.add(Object)>
	//*  73  199:pop             
	//*  74  200:getstatic       #107 <Field List DEFAULT_EXTRACTOR_CLASSES>
	//*  75  203:ldc1            #147 <String "com.google.android.exoplayer.ext.flac.FlacExtractor">
	//*  76  205:invokestatic    #115 <Method Class Class.forName(String)>
	//*  77  208:ldc1            #117 <Class Extractor>
	//*  78  210:invokevirtual   #121 <Method Class Class.asSubclass(Class)>
	//*  79  213:invokeinterface #127 <Method boolean List.add(Object)>
	//*  80  218:pop             
	//*  81  219:return          
		catch(ClassNotFoundException classnotfoundexception) { }
	//   82  220:astore_0        
		try
		{
			DEFAULT_EXTRACTOR_CLASSES.add(((Object) (Class.forName("com.google.android.exoplayer.extractor.mp4.FragmentedMp4Extractor").asSubclass(com/google/android/exoplayer/extractor/Extractor))));
		}
	//*  83  221:goto            29
		catch(ClassNotFoundException classnotfoundexception1) { }
	//   84  224:astore_0        
		try
		{
			DEFAULT_EXTRACTOR_CLASSES.add(((Object) (Class.forName("com.google.android.exoplayer.extractor.mp4.Mp4Extractor").asSubclass(com/google/android/exoplayer/extractor/Extractor))));
		}
	//*  85  225:goto            48
		catch(ClassNotFoundException classnotfoundexception2) { }
	//   86  228:astore_0        
		try
		{
			DEFAULT_EXTRACTOR_CLASSES.add(((Object) (Class.forName("com.google.android.exoplayer.extractor.mp3.Mp3Extractor").asSubclass(com/google/android/exoplayer/extractor/Extractor))));
		}
	//*  87  229:goto            67
		catch(ClassNotFoundException classnotfoundexception3) { }
	//   88  232:astore_0        
		try
		{
			DEFAULT_EXTRACTOR_CLASSES.add(((Object) (Class.forName("com.google.android.exoplayer.extractor.ts.AdtsExtractor").asSubclass(com/google/android/exoplayer/extractor/Extractor))));
		}
	//*  89  233:goto            86
		catch(ClassNotFoundException classnotfoundexception4) { }
	//   90  236:astore_0        
		try
		{
			DEFAULT_EXTRACTOR_CLASSES.add(((Object) (Class.forName("com.google.android.exoplayer.extractor.ts.TsExtractor").asSubclass(com/google/android/exoplayer/extractor/Extractor))));
		}
	//*  91  237:goto            105
		catch(ClassNotFoundException classnotfoundexception5) { }
	//   92  240:astore_0        
		try
		{
			DEFAULT_EXTRACTOR_CLASSES.add(((Object) (Class.forName("com.google.android.exoplayer.extractor.flv.FlvExtractor").asSubclass(com/google/android/exoplayer/extractor/Extractor))));
		}
	//*  93  241:goto            124
		catch(ClassNotFoundException classnotfoundexception6) { }
	//   94  244:astore_0        
		try
		{
			DEFAULT_EXTRACTOR_CLASSES.add(((Object) (Class.forName("com.google.android.exoplayer.extractor.ogg.OggExtractor").asSubclass(com/google/android/exoplayer/extractor/Extractor))));
		}
	//*  95  245:goto            143
		catch(ClassNotFoundException classnotfoundexception7) { }
	//   96  248:astore_0        
		try
		{
			DEFAULT_EXTRACTOR_CLASSES.add(((Object) (Class.forName("com.google.android.exoplayer.extractor.ts.PsExtractor").asSubclass(com/google/android/exoplayer/extractor/Extractor))));
		}
	//*  97  249:goto            162
		catch(ClassNotFoundException classnotfoundexception8) { }
	//   98  252:astore_0        
		try
		{
			DEFAULT_EXTRACTOR_CLASSES.add(((Object) (Class.forName("com.google.android.exoplayer.extractor.wav.WavExtractor").asSubclass(com/google/android/exoplayer/extractor/Extractor))));
		}
	//*  99  253:goto            181
		catch(ClassNotFoundException classnotfoundexception9) { }
	//  100  256:astore_0        
		try
		{
			DEFAULT_EXTRACTOR_CLASSES.add(((Object) (Class.forName("com.google.android.exoplayer.ext.flac.FlacExtractor").asSubclass(com/google/android/exoplayer/extractor/Extractor))));
		}
	//* 101  257:goto            200
		catch(ClassNotFoundException classnotfoundexception10) { }
	//  102  260:astore_0        
	//* 103  261:return          
	}


/*
	static ExtractorHolder access$000(ExtractorSampleSource extractorsamplesource)
	{
		return extractorsamplesource.extractorHolder;
	//    0    0:aload_0         
	//    1    1:getfield        #194 <Field ExtractorSampleSource$ExtractorHolder extractorHolder>
	//    2    4:areturn         
	}

*/


/*
	static int access$100(ExtractorSampleSource extractorsamplesource)
	{
		return extractorsamplesource.eventSourceId;
	//    0    0:aload_0         
	//    1    1:getfield        #164 <Field int eventSourceId>
	//    2    4:ireturn         
	}

*/


/*
	static EventListener access$200(ExtractorSampleSource extractorsamplesource)
	{
		return extractorsamplesource.eventListener;
	//    0    0:aload_0         
	//    1    1:getfield        #160 <Field ExtractorSampleSource$EventListener eventListener>
	//    2    4:areturn         
	}

*/


/*
	static int access$308(ExtractorSampleSource extractorsamplesource)
	{
		int i = extractorsamplesource.extractedSampleCount;
	//    0    0:aload_0         
	//    1    1:getfield        #217 <Field int extractedSampleCount>
	//    2    4:istore_1        
		extractorsamplesource.extractedSampleCount = i + 1;
	//    3    5:aload_0         
	//    4    6:iload_1         
	//    5    7:iconst_1        
	//    6    8:iadd            
	//    7    9:putfield        #217 <Field int extractedSampleCount>
		return i;
	//    8   12:iload_1         
	//    9   13:ireturn         
	}

*/
}
