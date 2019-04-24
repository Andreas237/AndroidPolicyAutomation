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
		if((FrameMetricsAggregator.FrameMetricsApi24Impl.access$100(FrameMetricsAggregator.FrameMetricsApi24Impl.this) & 1) != 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #17  <Field FrameMetricsAggregator$FrameMetricsApi24Impl this$0>
	//*   2    4:invokestatic    #27  <Method int FrameMetricsAggregator$FrameMetricsApi24Impl.access$100(FrameMetricsAggregator$FrameMetricsApi24Impl)>
	//*   3    7:iconst_1        
	//*   4    8:iand            
	//*   5    9:ifeq            34
			addDurationItem(FrameMetricsAggregator.FrameMetricsApi24Impl.access$200(FrameMetricsAggregator.FrameMetricsApi24Impl.this)[0], framemetrics.getMetric(8));
	//    6   12:aload_0         
	//    7   13:getfield        #17  <Field FrameMetricsAggregator$FrameMetricsApi24Impl this$0>
	//    8   16:aload_0         
	//    9   17:getfield        #17  <Field FrameMetricsAggregator$FrameMetricsApi24Impl this$0>
	//   10   20:invokestatic    #31  <Method android.util.SparseIntArray[] FrameMetricsAggregator$FrameMetricsApi24Impl.access$200(FrameMetricsAggregator$FrameMetricsApi24Impl)>
	//   11   23:iconst_0        
	//   12   24:aaload          
	//   13   25:aload_2         
	//   14   26:bipush          8
	//   15   28:invokevirtual   #37  <Method long FrameMetrics.getMetric(int)>
	//   16   31:invokevirtual   #41  <Method void FrameMetricsAggregator$FrameMetricsApi24Impl.addDurationItem(android.util.SparseIntArray, long)>
		if((FrameMetricsAggregator.FrameMetricsApi24Impl.access$100(FrameMetricsAggregator.FrameMetricsApi24Impl.this) & 2) != 0)
	//*  17   34:aload_0         
	//*  18   35:getfield        #17  <Field FrameMetricsAggregator$FrameMetricsApi24Impl this$0>
	//*  19   38:invokestatic    #27  <Method int FrameMetricsAggregator$FrameMetricsApi24Impl.access$100(FrameMetricsAggregator$FrameMetricsApi24Impl)>
	//*  20   41:iconst_2        
	//*  21   42:iand            
	//*  22   43:ifeq            67
			addDurationItem(FrameMetricsAggregator.FrameMetricsApi24Impl.access$200(FrameMetricsAggregator.FrameMetricsApi24Impl.this)[1], framemetrics.getMetric(1));
	//   23   46:aload_0         
	//   24   47:getfield        #17  <Field FrameMetricsAggregator$FrameMetricsApi24Impl this$0>
	//   25   50:aload_0         
	//   26   51:getfield        #17  <Field FrameMetricsAggregator$FrameMetricsApi24Impl this$0>
	//   27   54:invokestatic    #31  <Method android.util.SparseIntArray[] FrameMetricsAggregator$FrameMetricsApi24Impl.access$200(FrameMetricsAggregator$FrameMetricsApi24Impl)>
	//   28   57:iconst_1        
	//   29   58:aaload          
	//   30   59:aload_2         
	//   31   60:iconst_1        
	//   32   61:invokevirtual   #37  <Method long FrameMetrics.getMetric(int)>
	//   33   64:invokevirtual   #41  <Method void FrameMetricsAggregator$FrameMetricsApi24Impl.addDurationItem(android.util.SparseIntArray, long)>
		if((FrameMetricsAggregator.FrameMetricsApi24Impl.access$100(FrameMetricsAggregator.FrameMetricsApi24Impl.this) & 4) != 0)
	//*  34   67:aload_0         
	//*  35   68:getfield        #17  <Field FrameMetricsAggregator$FrameMetricsApi24Impl this$0>
	//*  36   71:invokestatic    #27  <Method int FrameMetricsAggregator$FrameMetricsApi24Impl.access$100(FrameMetricsAggregator$FrameMetricsApi24Impl)>
	//*  37   74:iconst_4        
	//*  38   75:iand            
	//*  39   76:ifeq            100
			addDurationItem(FrameMetricsAggregator.FrameMetricsApi24Impl.access$200(FrameMetricsAggregator.FrameMetricsApi24Impl.this)[2], framemetrics.getMetric(3));
	//   40   79:aload_0         
	//   41   80:getfield        #17  <Field FrameMetricsAggregator$FrameMetricsApi24Impl this$0>
	//   42   83:aload_0         
	//   43   84:getfield        #17  <Field FrameMetricsAggregator$FrameMetricsApi24Impl this$0>
	//   44   87:invokestatic    #31  <Method android.util.SparseIntArray[] FrameMetricsAggregator$FrameMetricsApi24Impl.access$200(FrameMetricsAggregator$FrameMetricsApi24Impl)>
	//   45   90:iconst_2        
	//   46   91:aaload          
	//   47   92:aload_2         
	//   48   93:iconst_3        
	//   49   94:invokevirtual   #37  <Method long FrameMetrics.getMetric(int)>
	//   50   97:invokevirtual   #41  <Method void FrameMetricsAggregator$FrameMetricsApi24Impl.addDurationItem(android.util.SparseIntArray, long)>
		if((FrameMetricsAggregator.FrameMetricsApi24Impl.access$100(FrameMetricsAggregator.FrameMetricsApi24Impl.this) & 8) != 0)
	//*  51  100:aload_0         
	//*  52  101:getfield        #17  <Field FrameMetricsAggregator$FrameMetricsApi24Impl this$0>
	//*  53  104:invokestatic    #27  <Method int FrameMetricsAggregator$FrameMetricsApi24Impl.access$100(FrameMetricsAggregator$FrameMetricsApi24Impl)>
	//*  54  107:bipush          8
	//*  55  109:iand            
	//*  56  110:ifeq            134
			addDurationItem(FrameMetricsAggregator.FrameMetricsApi24Impl.access$200(FrameMetricsAggregator.FrameMetricsApi24Impl.this)[3], framemetrics.getMetric(4));
	//   57  113:aload_0         
	//   58  114:getfield        #17  <Field FrameMetricsAggregator$FrameMetricsApi24Impl this$0>
	//   59  117:aload_0         
	//   60  118:getfield        #17  <Field FrameMetricsAggregator$FrameMetricsApi24Impl this$0>
	//   61  121:invokestatic    #31  <Method android.util.SparseIntArray[] FrameMetricsAggregator$FrameMetricsApi24Impl.access$200(FrameMetricsAggregator$FrameMetricsApi24Impl)>
	//   62  124:iconst_3        
	//   63  125:aaload          
	//   64  126:aload_2         
	//   65  127:iconst_4        
	//   66  128:invokevirtual   #37  <Method long FrameMetrics.getMetric(int)>
	//   67  131:invokevirtual   #41  <Method void FrameMetricsAggregator$FrameMetricsApi24Impl.addDurationItem(android.util.SparseIntArray, long)>
		if((FrameMetricsAggregator.FrameMetricsApi24Impl.access$100(FrameMetricsAggregator.FrameMetricsApi24Impl.this) & 0x10) != 0)
	//*  68  134:aload_0         
	//*  69  135:getfield        #17  <Field FrameMetricsAggregator$FrameMetricsApi24Impl this$0>
	//*  70  138:invokestatic    #27  <Method int FrameMetricsAggregator$FrameMetricsApi24Impl.access$100(FrameMetricsAggregator$FrameMetricsApi24Impl)>
	//*  71  141:bipush          16
	//*  72  143:iand            
	//*  73  144:ifeq            168
			addDurationItem(FrameMetricsAggregator.FrameMetricsApi24Impl.access$200(FrameMetricsAggregator.FrameMetricsApi24Impl.this)[4], framemetrics.getMetric(5));
	//   74  147:aload_0         
	//   75  148:getfield        #17  <Field FrameMetricsAggregator$FrameMetricsApi24Impl this$0>
	//   76  151:aload_0         
	//   77  152:getfield        #17  <Field FrameMetricsAggregator$FrameMetricsApi24Impl this$0>
	//   78  155:invokestatic    #31  <Method android.util.SparseIntArray[] FrameMetricsAggregator$FrameMetricsApi24Impl.access$200(FrameMetricsAggregator$FrameMetricsApi24Impl)>
	//   79  158:iconst_4        
	//   80  159:aaload          
	//   81  160:aload_2         
	//   82  161:iconst_5        
	//   83  162:invokevirtual   #37  <Method long FrameMetrics.getMetric(int)>
	//   84  165:invokevirtual   #41  <Method void FrameMetricsAggregator$FrameMetricsApi24Impl.addDurationItem(android.util.SparseIntArray, long)>
		if((FrameMetricsAggregator.FrameMetricsApi24Impl.access$100(FrameMetricsAggregator.FrameMetricsApi24Impl.this) & 0x40) != 0)
	//*  85  168:aload_0         
	//*  86  169:getfield        #17  <Field FrameMetricsAggregator$FrameMetricsApi24Impl this$0>
	//*  87  172:invokestatic    #27  <Method int FrameMetricsAggregator$FrameMetricsApi24Impl.access$100(FrameMetricsAggregator$FrameMetricsApi24Impl)>
	//*  88  175:bipush          64
	//*  89  177:iand            
	//*  90  178:ifeq            204
			addDurationItem(FrameMetricsAggregator.FrameMetricsApi24Impl.access$200(FrameMetricsAggregator.FrameMetricsApi24Impl.this)[6], framemetrics.getMetric(7));
	//   91  181:aload_0         
	//   92  182:getfield        #17  <Field FrameMetricsAggregator$FrameMetricsApi24Impl this$0>
	//   93  185:aload_0         
	//   94  186:getfield        #17  <Field FrameMetricsAggregator$FrameMetricsApi24Impl this$0>
	//   95  189:invokestatic    #31  <Method android.util.SparseIntArray[] FrameMetricsAggregator$FrameMetricsApi24Impl.access$200(FrameMetricsAggregator$FrameMetricsApi24Impl)>
	//   96  192:bipush          6
	//   97  194:aaload          
	//   98  195:aload_2         
	//   99  196:bipush          7
	//  100  198:invokevirtual   #37  <Method long FrameMetrics.getMetric(int)>
	//  101  201:invokevirtual   #41  <Method void FrameMetricsAggregator$FrameMetricsApi24Impl.addDurationItem(android.util.SparseIntArray, long)>
		if((FrameMetricsAggregator.FrameMetricsApi24Impl.access$100(FrameMetricsAggregator.FrameMetricsApi24Impl.this) & 0x20) != 0)
	//* 102  204:aload_0         
	//* 103  205:getfield        #17  <Field FrameMetricsAggregator$FrameMetricsApi24Impl this$0>
	//* 104  208:invokestatic    #27  <Method int FrameMetricsAggregator$FrameMetricsApi24Impl.access$100(FrameMetricsAggregator$FrameMetricsApi24Impl)>
	//* 105  211:bipush          32
	//* 106  213:iand            
	//* 107  214:ifeq            239
			addDurationItem(FrameMetricsAggregator.FrameMetricsApi24Impl.access$200(FrameMetricsAggregator.FrameMetricsApi24Impl.this)[5], framemetrics.getMetric(6));
	//  108  217:aload_0         
	//  109  218:getfield        #17  <Field FrameMetricsAggregator$FrameMetricsApi24Impl this$0>
	//  110  221:aload_0         
	//  111  222:getfield        #17  <Field FrameMetricsAggregator$FrameMetricsApi24Impl this$0>
	//  112  225:invokestatic    #31  <Method android.util.SparseIntArray[] FrameMetricsAggregator$FrameMetricsApi24Impl.access$200(FrameMetricsAggregator$FrameMetricsApi24Impl)>
	//  113  228:iconst_5        
	//  114  229:aaload          
	//  115  230:aload_2         
	//  116  231:bipush          6
	//  117  233:invokevirtual   #37  <Method long FrameMetrics.getMetric(int)>
	//  118  236:invokevirtual   #41  <Method void FrameMetricsAggregator$FrameMetricsApi24Impl.addDurationItem(android.util.SparseIntArray, long)>
		if((FrameMetricsAggregator.FrameMetricsApi24Impl.access$100(FrameMetricsAggregator.FrameMetricsApi24Impl.this) & 0x80) != 0)
	//* 119  239:aload_0         
	//* 120  240:getfield        #17  <Field FrameMetricsAggregator$FrameMetricsApi24Impl this$0>
	//* 121  243:invokestatic    #27  <Method int FrameMetricsAggregator$FrameMetricsApi24Impl.access$100(FrameMetricsAggregator$FrameMetricsApi24Impl)>
	//* 122  246:sipush          128
	//* 123  249:iand            
	//* 124  250:ifeq            275
			addDurationItem(FrameMetricsAggregator.FrameMetricsApi24Impl.access$200(FrameMetricsAggregator.FrameMetricsApi24Impl.this)[7], framemetrics.getMetric(0));
	//  125  253:aload_0         
	//  126  254:getfield        #17  <Field FrameMetricsAggregator$FrameMetricsApi24Impl this$0>
	//  127  257:aload_0         
	//  128  258:getfield        #17  <Field FrameMetricsAggregator$FrameMetricsApi24Impl this$0>
	//  129  261:invokestatic    #31  <Method android.util.SparseIntArray[] FrameMetricsAggregator$FrameMetricsApi24Impl.access$200(FrameMetricsAggregator$FrameMetricsApi24Impl)>
	//  130  264:bipush          7
	//  131  266:aaload          
	//  132  267:aload_2         
	//  133  268:iconst_0        
	//  134  269:invokevirtual   #37  <Method long FrameMetrics.getMetric(int)>
	//  135  272:invokevirtual   #41  <Method void FrameMetricsAggregator$FrameMetricsApi24Impl.addDurationItem(android.util.SparseIntArray, long)>
		if((FrameMetricsAggregator.FrameMetricsApi24Impl.access$100(FrameMetricsAggregator.FrameMetricsApi24Impl.this) & 0x100) != 0)
	//* 136  275:aload_0         
	//* 137  276:getfield        #17  <Field FrameMetricsAggregator$FrameMetricsApi24Impl this$0>
	//* 138  279:invokestatic    #27  <Method int FrameMetricsAggregator$FrameMetricsApi24Impl.access$100(FrameMetricsAggregator$FrameMetricsApi24Impl)>
	//* 139  282:sipush          256
	//* 140  285:iand            
	//* 141  286:ifeq            311
			addDurationItem(FrameMetricsAggregator.FrameMetricsApi24Impl.access$200(FrameMetricsAggregator.FrameMetricsApi24Impl.this)[8], framemetrics.getMetric(2));
	//  142  289:aload_0         
	//  143  290:getfield        #17  <Field FrameMetricsAggregator$FrameMetricsApi24Impl this$0>
	//  144  293:aload_0         
	//  145  294:getfield        #17  <Field FrameMetricsAggregator$FrameMetricsApi24Impl this$0>
	//  146  297:invokestatic    #31  <Method android.util.SparseIntArray[] FrameMetricsAggregator$FrameMetricsApi24Impl.access$200(FrameMetricsAggregator$FrameMetricsApi24Impl)>
	//  147  300:bipush          8
	//  148  302:aaload          
	//  149  303:aload_2         
	//  150  304:iconst_2        
	//  151  305:invokevirtual   #37  <Method long FrameMetrics.getMetric(int)>
	//  152  308:invokevirtual   #41  <Method void FrameMetricsAggregator$FrameMetricsApi24Impl.addDurationItem(android.util.SparseIntArray, long)>
	//  153  311:return          
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
