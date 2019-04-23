// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.view.FrameMetrics;
import android.view.Window;

// Referenced classes of package android.support.v4.app:
//			FrameMetricsAggregator

class FrameMetricsAggregator$FrameMetricsApi24Impl$1
	implements android.view.Window.OnFrameMetricsAvailableListener
{

	public void onFrameMetricsAvailable(Window window, FrameMetrics framemetrics, int i)
	{
		if((mTrackingFlags & 1) != 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #17  <Field FrameMetricsAggregator$FrameMetricsApi24Impl this$0>
	//*   2    4:getfield        #27  <Field int FrameMetricsAggregator$FrameMetricsApi24Impl.mTrackingFlags>
	//*   3    7:iconst_1        
	//*   4    8:iand            
	//*   5    9:ifeq            33
		{
			window = ((Window) (FrameMetricsAggregator.FrameMetricsApi24Impl.this));
	//    6   12:aload_0         
	//    7   13:getfield        #17  <Field FrameMetricsAggregator$FrameMetricsApi24Impl this$0>
	//    8   16:astore_1        
			((FrameMetricsAggregator.FrameMetricsApi24Impl) (window)).addDurationItem(((FrameMetricsAggregator.FrameMetricsApi24Impl) (window)).mMetrics[0], framemetrics.getMetric(8));
	//    9   17:aload_1         
	//   10   18:aload_1         
	//   11   19:getfield        #31  <Field android.util.SparseIntArray[] FrameMetricsAggregator$FrameMetricsApi24Impl.mMetrics>
	//   12   22:iconst_0        
	//   13   23:aaload          
	//   14   24:aload_2         
	//   15   25:bipush          8
	//   16   27:invokevirtual   #37  <Method long FrameMetrics.getMetric(int)>
	//   17   30:invokevirtual   #41  <Method void FrameMetricsAggregator$FrameMetricsApi24Impl.addDurationItem(android.util.SparseIntArray, long)>
		}
		if((mTrackingFlags & 2) != 0)
	//*  18   33:aload_0         
	//*  19   34:getfield        #17  <Field FrameMetricsAggregator$FrameMetricsApi24Impl this$0>
	//*  20   37:getfield        #27  <Field int FrameMetricsAggregator$FrameMetricsApi24Impl.mTrackingFlags>
	//*  21   40:iconst_2        
	//*  22   41:iand            
	//*  23   42:ifeq            65
		{
			window = ((Window) (FrameMetricsAggregator.FrameMetricsApi24Impl.this));
	//   24   45:aload_0         
	//   25   46:getfield        #17  <Field FrameMetricsAggregator$FrameMetricsApi24Impl this$0>
	//   26   49:astore_1        
			((FrameMetricsAggregator.FrameMetricsApi24Impl) (window)).addDurationItem(((FrameMetricsAggregator.FrameMetricsApi24Impl) (window)).mMetrics[1], framemetrics.getMetric(1));
	//   27   50:aload_1         
	//   28   51:aload_1         
	//   29   52:getfield        #31  <Field android.util.SparseIntArray[] FrameMetricsAggregator$FrameMetricsApi24Impl.mMetrics>
	//   30   55:iconst_1        
	//   31   56:aaload          
	//   32   57:aload_2         
	//   33   58:iconst_1        
	//   34   59:invokevirtual   #37  <Method long FrameMetrics.getMetric(int)>
	//   35   62:invokevirtual   #41  <Method void FrameMetricsAggregator$FrameMetricsApi24Impl.addDurationItem(android.util.SparseIntArray, long)>
		}
		if((mTrackingFlags & 4) != 0)
	//*  36   65:aload_0         
	//*  37   66:getfield        #17  <Field FrameMetricsAggregator$FrameMetricsApi24Impl this$0>
	//*  38   69:getfield        #27  <Field int FrameMetricsAggregator$FrameMetricsApi24Impl.mTrackingFlags>
	//*  39   72:iconst_4        
	//*  40   73:iand            
	//*  41   74:ifeq            97
		{
			window = ((Window) (FrameMetricsAggregator.FrameMetricsApi24Impl.this));
	//   42   77:aload_0         
	//   43   78:getfield        #17  <Field FrameMetricsAggregator$FrameMetricsApi24Impl this$0>
	//   44   81:astore_1        
			((FrameMetricsAggregator.FrameMetricsApi24Impl) (window)).addDurationItem(((FrameMetricsAggregator.FrameMetricsApi24Impl) (window)).mMetrics[2], framemetrics.getMetric(3));
	//   45   82:aload_1         
	//   46   83:aload_1         
	//   47   84:getfield        #31  <Field android.util.SparseIntArray[] FrameMetricsAggregator$FrameMetricsApi24Impl.mMetrics>
	//   48   87:iconst_2        
	//   49   88:aaload          
	//   50   89:aload_2         
	//   51   90:iconst_3        
	//   52   91:invokevirtual   #37  <Method long FrameMetrics.getMetric(int)>
	//   53   94:invokevirtual   #41  <Method void FrameMetricsAggregator$FrameMetricsApi24Impl.addDurationItem(android.util.SparseIntArray, long)>
		}
		if((mTrackingFlags & 8) != 0)
	//*  54   97:aload_0         
	//*  55   98:getfield        #17  <Field FrameMetricsAggregator$FrameMetricsApi24Impl this$0>
	//*  56  101:getfield        #27  <Field int FrameMetricsAggregator$FrameMetricsApi24Impl.mTrackingFlags>
	//*  57  104:bipush          8
	//*  58  106:iand            
	//*  59  107:ifeq            130
		{
			window = ((Window) (FrameMetricsAggregator.FrameMetricsApi24Impl.this));
	//   60  110:aload_0         
	//   61  111:getfield        #17  <Field FrameMetricsAggregator$FrameMetricsApi24Impl this$0>
	//   62  114:astore_1        
			((FrameMetricsAggregator.FrameMetricsApi24Impl) (window)).addDurationItem(((FrameMetricsAggregator.FrameMetricsApi24Impl) (window)).mMetrics[3], framemetrics.getMetric(4));
	//   63  115:aload_1         
	//   64  116:aload_1         
	//   65  117:getfield        #31  <Field android.util.SparseIntArray[] FrameMetricsAggregator$FrameMetricsApi24Impl.mMetrics>
	//   66  120:iconst_3        
	//   67  121:aaload          
	//   68  122:aload_2         
	//   69  123:iconst_4        
	//   70  124:invokevirtual   #37  <Method long FrameMetrics.getMetric(int)>
	//   71  127:invokevirtual   #41  <Method void FrameMetricsAggregator$FrameMetricsApi24Impl.addDurationItem(android.util.SparseIntArray, long)>
		}
		if((mTrackingFlags & 0x10) != 0)
	//*  72  130:aload_0         
	//*  73  131:getfield        #17  <Field FrameMetricsAggregator$FrameMetricsApi24Impl this$0>
	//*  74  134:getfield        #27  <Field int FrameMetricsAggregator$FrameMetricsApi24Impl.mTrackingFlags>
	//*  75  137:bipush          16
	//*  76  139:iand            
	//*  77  140:ifeq            163
		{
			window = ((Window) (FrameMetricsAggregator.FrameMetricsApi24Impl.this));
	//   78  143:aload_0         
	//   79  144:getfield        #17  <Field FrameMetricsAggregator$FrameMetricsApi24Impl this$0>
	//   80  147:astore_1        
			((FrameMetricsAggregator.FrameMetricsApi24Impl) (window)).addDurationItem(((FrameMetricsAggregator.FrameMetricsApi24Impl) (window)).mMetrics[4], framemetrics.getMetric(5));
	//   81  148:aload_1         
	//   82  149:aload_1         
	//   83  150:getfield        #31  <Field android.util.SparseIntArray[] FrameMetricsAggregator$FrameMetricsApi24Impl.mMetrics>
	//   84  153:iconst_4        
	//   85  154:aaload          
	//   86  155:aload_2         
	//   87  156:iconst_5        
	//   88  157:invokevirtual   #37  <Method long FrameMetrics.getMetric(int)>
	//   89  160:invokevirtual   #41  <Method void FrameMetricsAggregator$FrameMetricsApi24Impl.addDurationItem(android.util.SparseIntArray, long)>
		}
		if((mTrackingFlags & 0x40) != 0)
	//*  90  163:aload_0         
	//*  91  164:getfield        #17  <Field FrameMetricsAggregator$FrameMetricsApi24Impl this$0>
	//*  92  167:getfield        #27  <Field int FrameMetricsAggregator$FrameMetricsApi24Impl.mTrackingFlags>
	//*  93  170:bipush          64
	//*  94  172:iand            
	//*  95  173:ifeq            198
		{
			window = ((Window) (FrameMetricsAggregator.FrameMetricsApi24Impl.this));
	//   96  176:aload_0         
	//   97  177:getfield        #17  <Field FrameMetricsAggregator$FrameMetricsApi24Impl this$0>
	//   98  180:astore_1        
			((FrameMetricsAggregator.FrameMetricsApi24Impl) (window)).addDurationItem(((FrameMetricsAggregator.FrameMetricsApi24Impl) (window)).mMetrics[6], framemetrics.getMetric(7));
	//   99  181:aload_1         
	//  100  182:aload_1         
	//  101  183:getfield        #31  <Field android.util.SparseIntArray[] FrameMetricsAggregator$FrameMetricsApi24Impl.mMetrics>
	//  102  186:bipush          6
	//  103  188:aaload          
	//  104  189:aload_2         
	//  105  190:bipush          7
	//  106  192:invokevirtual   #37  <Method long FrameMetrics.getMetric(int)>
	//  107  195:invokevirtual   #41  <Method void FrameMetricsAggregator$FrameMetricsApi24Impl.addDurationItem(android.util.SparseIntArray, long)>
		}
		if((mTrackingFlags & 0x20) != 0)
	//* 108  198:aload_0         
	//* 109  199:getfield        #17  <Field FrameMetricsAggregator$FrameMetricsApi24Impl this$0>
	//* 110  202:getfield        #27  <Field int FrameMetricsAggregator$FrameMetricsApi24Impl.mTrackingFlags>
	//* 111  205:bipush          32
	//* 112  207:iand            
	//* 113  208:ifeq            232
		{
			window = ((Window) (FrameMetricsAggregator.FrameMetricsApi24Impl.this));
	//  114  211:aload_0         
	//  115  212:getfield        #17  <Field FrameMetricsAggregator$FrameMetricsApi24Impl this$0>
	//  116  215:astore_1        
			((FrameMetricsAggregator.FrameMetricsApi24Impl) (window)).addDurationItem(((FrameMetricsAggregator.FrameMetricsApi24Impl) (window)).mMetrics[5], framemetrics.getMetric(6));
	//  117  216:aload_1         
	//  118  217:aload_1         
	//  119  218:getfield        #31  <Field android.util.SparseIntArray[] FrameMetricsAggregator$FrameMetricsApi24Impl.mMetrics>
	//  120  221:iconst_5        
	//  121  222:aaload          
	//  122  223:aload_2         
	//  123  224:bipush          6
	//  124  226:invokevirtual   #37  <Method long FrameMetrics.getMetric(int)>
	//  125  229:invokevirtual   #41  <Method void FrameMetricsAggregator$FrameMetricsApi24Impl.addDurationItem(android.util.SparseIntArray, long)>
		}
		if((mTrackingFlags & 0x80) != 0)
	//* 126  232:aload_0         
	//* 127  233:getfield        #17  <Field FrameMetricsAggregator$FrameMetricsApi24Impl this$0>
	//* 128  236:getfield        #27  <Field int FrameMetricsAggregator$FrameMetricsApi24Impl.mTrackingFlags>
	//* 129  239:sipush          128
	//* 130  242:iand            
	//* 131  243:ifeq            267
		{
			window = ((Window) (FrameMetricsAggregator.FrameMetricsApi24Impl.this));
	//  132  246:aload_0         
	//  133  247:getfield        #17  <Field FrameMetricsAggregator$FrameMetricsApi24Impl this$0>
	//  134  250:astore_1        
			((FrameMetricsAggregator.FrameMetricsApi24Impl) (window)).addDurationItem(((FrameMetricsAggregator.FrameMetricsApi24Impl) (window)).mMetrics[7], framemetrics.getMetric(0));
	//  135  251:aload_1         
	//  136  252:aload_1         
	//  137  253:getfield        #31  <Field android.util.SparseIntArray[] FrameMetricsAggregator$FrameMetricsApi24Impl.mMetrics>
	//  138  256:bipush          7
	//  139  258:aaload          
	//  140  259:aload_2         
	//  141  260:iconst_0        
	//  142  261:invokevirtual   #37  <Method long FrameMetrics.getMetric(int)>
	//  143  264:invokevirtual   #41  <Method void FrameMetricsAggregator$FrameMetricsApi24Impl.addDurationItem(android.util.SparseIntArray, long)>
		}
		if((mTrackingFlags & 0x100) != 0)
	//* 144  267:aload_0         
	//* 145  268:getfield        #17  <Field FrameMetricsAggregator$FrameMetricsApi24Impl this$0>
	//* 146  271:getfield        #27  <Field int FrameMetricsAggregator$FrameMetricsApi24Impl.mTrackingFlags>
	//* 147  274:sipush          256
	//* 148  277:iand            
	//* 149  278:ifeq            302
		{
			window = ((Window) (FrameMetricsAggregator.FrameMetricsApi24Impl.this));
	//  150  281:aload_0         
	//  151  282:getfield        #17  <Field FrameMetricsAggregator$FrameMetricsApi24Impl this$0>
	//  152  285:astore_1        
			((FrameMetricsAggregator.FrameMetricsApi24Impl) (window)).addDurationItem(((FrameMetricsAggregator.FrameMetricsApi24Impl) (window)).mMetrics[8], framemetrics.getMetric(2));
	//  153  286:aload_1         
	//  154  287:aload_1         
	//  155  288:getfield        #31  <Field android.util.SparseIntArray[] FrameMetricsAggregator$FrameMetricsApi24Impl.mMetrics>
	//  156  291:bipush          8
	//  157  293:aaload          
	//  158  294:aload_2         
	//  159  295:iconst_2        
	//  160  296:invokevirtual   #37  <Method long FrameMetrics.getMetric(int)>
	//  161  299:invokevirtual   #41  <Method void FrameMetricsAggregator$FrameMetricsApi24Impl.addDurationItem(android.util.SparseIntArray, long)>
		}
	//  162  302:return          
	}

	final FrameMetricsAggregator.FrameMetricsApi24Impl this$0;

	FrameMetricsAggregator$FrameMetricsApi24Impl$1()
	{
		this$0 = FrameMetricsAggregator.FrameMetricsApi24Impl.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field FrameMetricsAggregator$FrameMetricsApi24Impl this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void Object()>
	//    5    9:return          
	}
}
