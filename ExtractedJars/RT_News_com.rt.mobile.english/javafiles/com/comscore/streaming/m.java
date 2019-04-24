// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.comscore.streaming;

import com.comscore.utils.CSLog;
import java.util.HashMap;
import java.util.TimerTask;

// Referenced classes of package com.comscore.streaming:
//			StreamSenseVideoView

class m extends TimerTask
{

	m(StreamSenseVideoView streamsensevideoview, long l, HashMap hashmap)
	{
		c = streamsensevideoview;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field StreamSenseVideoView c>
		a = l;
	//    3    5:aload_0         
	//    4    6:lload_2         
	//    5    7:putfield        #16  <Field long a>
		b = hashmap;
	//    6   10:aload_0         
	//    7   11:aload           4
	//    8   13:putfield        #18  <Field HashMap b>
		super();
	//    9   16:aload_0         
	//   10   17:invokespecial   #21  <Method void TimerTask()>
	//   11   20:return          
	}

	public void run()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #25  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #26  <Method void StringBuilder()>
	//    3    7:astore          7
		stringbuilder.append("startEventTimer -> lastPosition:");
	//    4    9:aload           7
	//    5   11:ldc1            #28  <String "startEventTimer -> lastPosition:">
	//    6   13:invokevirtual   #32  <Method StringBuilder StringBuilder.append(String)>
	//    7   16:pop             
		stringbuilder.append(a);
	//    8   17:aload           7
	//    9   19:aload_0         
	//   10   20:getfield        #16  <Field long a>
	//   11   23:invokevirtual   #35  <Method StringBuilder StringBuilder.append(long)>
	//   12   26:pop             
		stringbuilder.append(" currentPosition:");
	//   13   27:aload           7
	//   14   29:ldc1            #37  <String " currentPosition:">
	//   15   31:invokevirtual   #32  <Method StringBuilder StringBuilder.append(String)>
	//   16   34:pop             
		stringbuilder.append(StreamSenseVideoView.a(c));
	//   17   35:aload           7
	//   18   37:aload_0         
	//   19   38:getfield        #14  <Field StreamSenseVideoView c>
	//   20   41:invokestatic    #42  <Method long StreamSenseVideoView.a(StreamSenseVideoView)>
	//   21   44:invokevirtual   #35  <Method StringBuilder StringBuilder.append(long)>
	//   22   47:pop             
		CSLog.d("StreamSenseVideoView", stringbuilder.toString());
	//   23   48:ldc1            #44  <String "StreamSenseVideoView">
	//   24   50:aload           7
	//   25   52:invokevirtual   #48  <Method String StringBuilder.toString()>
	//   26   55:invokestatic    #54  <Method void CSLog.d(Object, String)>
		long l = Long.parseLong((String)b.get("ns_ts"));
	//   27   58:aload_0         
	//   28   59:getfield        #18  <Field HashMap b>
	//   29   62:ldc1            #56  <String "ns_ts">
	//   30   64:invokevirtual   #62  <Method Object HashMap.get(Object)>
	//   31   67:checkcast       #64  <Class String>
	//   32   70:invokestatic    #70  <Method long Long.parseLong(String)>
	//   33   73:lstore_1        
		long l1 = StreamSenseVideoView.a(c) - a;
	//   34   74:aload_0         
	//   35   75:getfield        #14  <Field StreamSenseVideoView c>
	//   36   78:invokestatic    #42  <Method long StreamSenseVideoView.a(StreamSenseVideoView)>
	//   37   81:aload_0         
	//   38   82:getfield        #16  <Field long a>
	//   39   85:lsub            
	//   40   86:lstore_3        
		long l2 = System.currentTimeMillis();
	//   41   87:invokestatic    #76  <Method long System.currentTimeMillis()>
	//   42   90:lstore          5
		if(l1 >= 500L)
	//*  43   92:lload_3         
	//*  44   93:ldc2w           #77  <Long 500L>
	//*  45   96:lcmp            
	//*  46   97:iflt            226
		{
			l1 = l2 - l - l1;
	//   47  100:lload           5
	//   48  102:lload_1         
	//   49  103:lsub            
	//   50  104:lload_3         
	//   51  105:lsub            
	//   52  106:lstore_3        
			if(l1 > 0L)
	//*  53  107:lload_3         
	//*  54  108:lconst_0        
	//*  55  109:lcmp            
	//*  56  110:ifle            172
			{
				StreamSenseVideoView.a(c, l1);
	//   57  113:aload_0         
	//   58  114:getfield        #14  <Field StreamSenseVideoView c>
	//   59  117:lload_3         
	//   60  118:invokestatic    #81  <Method long StreamSenseVideoView.a(StreamSenseVideoView, long)>
	//   61  121:pop2            
				StringBuilder stringbuilder1 = new StringBuilder();
	//   62  122:new             #25  <Class StringBuilder>
	//   63  125:dup             
	//   64  126:invokespecial   #26  <Method void StringBuilder()>
	//   65  129:astore          7
				stringbuilder1.append("addToBufferingTotal=");
	//   66  131:aload           7
	//   67  133:ldc1            #83  <String "addToBufferingTotal=">
	//   68  135:invokevirtual   #32  <Method StringBuilder StringBuilder.append(String)>
	//   69  138:pop             
				stringbuilder1.append(l1);
	//   70  139:aload           7
	//   71  141:lload_3         
	//   72  142:invokevirtual   #35  <Method StringBuilder StringBuilder.append(long)>
	//   73  145:pop             
				CSLog.d("StreamSenseVideoView", stringbuilder1.toString());
	//   74  146:ldc1            #44  <String "StreamSenseVideoView">
	//   75  148:aload           7
	//   76  150:invokevirtual   #48  <Method String StringBuilder.toString()>
	//   77  153:invokestatic    #54  <Method void CSLog.d(Object, String)>
				b.put("ns_ts", ((Object) (String.valueOf(l + l1))));
	//   78  156:aload_0         
	//   79  157:getfield        #18  <Field HashMap b>
	//   80  160:ldc1            #56  <String "ns_ts">
	//   81  162:lload_1         
	//   82  163:lload_3         
	//   83  164:ladd            
	//   84  165:invokestatic    #87  <Method String String.valueOf(long)>
	//   85  168:invokevirtual   #91  <Method Object HashMap.put(Object, Object)>
	//   86  171:pop             
			}
			b.put("ns_st_bt", ((Object) (String.valueOf(StreamSenseVideoView.b(c)))));
	//   87  172:aload_0         
	//   88  173:getfield        #18  <Field HashMap b>
	//   89  176:ldc1            #93  <String "ns_st_bt">
	//   90  178:aload_0         
	//   91  179:getfield        #14  <Field StreamSenseVideoView c>
	//   92  182:invokestatic    #95  <Method long StreamSenseVideoView.b(StreamSenseVideoView)>
	//   93  185:invokestatic    #87  <Method String String.valueOf(long)>
	//   94  188:invokevirtual   #91  <Method Object HashMap.put(Object, Object)>
	//   95  191:pop             
			StreamSenseVideoView.c(c);
	//   96  192:aload_0         
	//   97  193:getfield        #14  <Field StreamSenseVideoView c>
	//   98  196:invokestatic    #98  <Method boolean StreamSenseVideoView.c(StreamSenseVideoView)>
	//   99  199:pop             
			StreamSenseVideoView.a(c, b, StreamSenseVideoView.a(c));
	//  100  200:aload_0         
	//  101  201:getfield        #14  <Field StreamSenseVideoView c>
	//  102  204:aload_0         
	//  103  205:getfield        #18  <Field HashMap b>
	//  104  208:aload_0         
	//  105  209:getfield        #14  <Field StreamSenseVideoView c>
	//  106  212:invokestatic    #42  <Method long StreamSenseVideoView.a(StreamSenseVideoView)>
	//  107  215:invokestatic    #101 <Method void StreamSenseVideoView.a(StreamSenseVideoView, HashMap, long)>
			StreamSenseVideoView.d(c);
	//  108  218:aload_0         
	//  109  219:getfield        #14  <Field StreamSenseVideoView c>
	//  110  222:invokestatic    #104 <Method void StreamSenseVideoView.d(StreamSenseVideoView)>
			return;
	//  111  225:return          
		} else
		{
			StreamSenseVideoView.c(c);
	//  112  226:aload_0         
	//  113  227:getfield        #14  <Field StreamSenseVideoView c>
	//  114  230:invokestatic    #98  <Method boolean StreamSenseVideoView.c(StreamSenseVideoView)>
	//  115  233:pop             
			StreamSenseVideoView.a(c, b);
	//  116  234:aload_0         
	//  117  235:getfield        #14  <Field StreamSenseVideoView c>
	//  118  238:aload_0         
	//  119  239:getfield        #18  <Field HashMap b>
	//  120  242:invokestatic    #107 <Method void StreamSenseVideoView.a(StreamSenseVideoView, HashMap)>
			return;
	//  121  245:return          
		}
	}

	final long a;
	final HashMap b;
	final StreamSenseVideoView c;
}
