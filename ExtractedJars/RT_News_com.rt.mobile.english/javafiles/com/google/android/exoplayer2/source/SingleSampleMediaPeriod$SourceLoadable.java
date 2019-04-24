// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;
import java.util.Arrays;

// Referenced classes of package com.google.android.exoplayer2.source:
//			SingleSampleMediaPeriod

static final class SingleSampleMediaPeriod$SourceLoadable
	implements com.google.android.exoplayer2.upstream.Loader.Loadable
{

	public void cancelLoad()
	{
	//    0    0:return          
	}

	public void load()
		throws IOException, InterruptedException
	{
		int i;
		i = 0;
	//    0    0:iconst_0        
	//    1    1:istore_1        
		sampleSize = 0;
	//    2    2:aload_0         
	//    3    3:iconst_0        
	//    4    4:putfield        #31  <Field int sampleSize>
		dataSource.open(dataSpec);
	//    5    7:aload_0         
	//    6    8:getfield        #26  <Field DataSource dataSource>
	//    7   11:aload_0         
	//    8   12:getfield        #24  <Field DataSpec dataSpec>
	//    9   15:invokeinterface #47  <Method long DataSource.open(DataSpec)>
	//   10   20:pop2            
_L2:
		if(i == -1)
			break; /* Loop/switch isn't completed */
	//   11   21:iload_1         
	//   12   22:iconst_m1       
	//   13   23:icmpeq          116
		sampleSize = sampleSize + i;
	//   14   26:aload_0         
	//   15   27:aload_0         
	//   16   28:getfield        #31  <Field int sampleSize>
	//   17   31:iload_1         
	//   18   32:iadd            
	//   19   33:putfield        #31  <Field int sampleSize>
		if(sampleData == null)
	//*  20   36:aload_0         
	//*  21   37:getfield        #35  <Field byte[] sampleData>
	//*  22   40:ifnonnull       55
		{
			sampleData = new byte[1024];
	//   23   43:aload_0         
	//   24   44:sipush          1024
	//   25   47:newarray        byte[]
	//   26   49:putfield        #35  <Field byte[] sampleData>
			break MISSING_BLOCK_LABEL_85;
	//   27   52:goto            85
		}
		if(sampleSize == sampleData.length)
	//*  28   55:aload_0         
	//*  29   56:getfield        #31  <Field int sampleSize>
	//*  30   59:aload_0         
	//*  31   60:getfield        #35  <Field byte[] sampleData>
	//*  32   63:arraylength     
	//*  33   64:icmpne          85
			sampleData = Arrays.copyOf(sampleData, sampleData.length * 2);
	//   34   67:aload_0         
	//   35   68:aload_0         
	//   36   69:getfield        #35  <Field byte[] sampleData>
	//   37   72:aload_0         
	//   38   73:getfield        #35  <Field byte[] sampleData>
	//   39   76:arraylength     
	//   40   77:iconst_2        
	//   41   78:imul            
	//   42   79:invokestatic    #53  <Method byte[] Arrays.copyOf(byte[], int)>
	//   43   82:putfield        #35  <Field byte[] sampleData>
		i = dataSource.read(sampleData, sampleSize, sampleData.length - sampleSize);
	//   44   85:aload_0         
	//   45   86:getfield        #26  <Field DataSource dataSource>
	//   46   89:aload_0         
	//   47   90:getfield        #35  <Field byte[] sampleData>
	//   48   93:aload_0         
	//   49   94:getfield        #31  <Field int sampleSize>
	//   50   97:aload_0         
	//   51   98:getfield        #35  <Field byte[] sampleData>
	//   52  101:arraylength     
	//   53  102:aload_0         
	//   54  103:getfield        #31  <Field int sampleSize>
	//   55  106:isub            
	//   56  107:invokeinterface #57  <Method int DataSource.read(byte[], int, int)>
	//   57  112:istore_1        
		if(true) goto _L2; else goto _L1
	//   58  113:goto            21
_L1:
		Util.closeQuietly(dataSource);
	//   59  116:aload_0         
	//   60  117:getfield        #26  <Field DataSource dataSource>
	//   61  120:invokestatic    #63  <Method void Util.closeQuietly(DataSource)>
		return;
	//   62  123:return          
		Exception exception;
		exception;
	//   63  124:astore_2        
		Util.closeQuietly(dataSource);
	//   64  125:aload_0         
	//   65  126:getfield        #26  <Field DataSource dataSource>
	//   66  129:invokestatic    #63  <Method void Util.closeQuietly(DataSource)>
		throw exception;
	//   67  132:aload_2         
	//   68  133:athrow          
	}

	private final DataSource dataSource;
	public final DataSpec dataSpec;
	private byte sampleData[];
	private int sampleSize;


/*
	static int access$100(SingleSampleMediaPeriod$SourceLoadable singlesamplemediaperiod$sourceloadable)
	{
		return singlesamplemediaperiod$sourceloadable.sampleSize;
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field int sampleSize>
	//    2    4:ireturn         
	}

*/


/*
	static byte[] access$200(SingleSampleMediaPeriod$SourceLoadable singlesamplemediaperiod$sourceloadable)
	{
		return singlesamplemediaperiod$sourceloadable.sampleData;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field byte[] sampleData>
	//    2    4:areturn         
	}

*/

	public SingleSampleMediaPeriod$SourceLoadable(DataSpec dataspec, DataSource datasource)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void Object()>
		dataSpec = dataspec;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #24  <Field DataSpec dataSpec>
		dataSource = datasource;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #26  <Field DataSource dataSource>
	//    8   14:return          
	}
}
