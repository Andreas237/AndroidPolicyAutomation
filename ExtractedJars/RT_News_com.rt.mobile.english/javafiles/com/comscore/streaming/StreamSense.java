// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.comscore.streaming;

import com.comscore.analytics.Core;
import com.comscore.analytics.comScore;
import com.comscore.utils.CSLog;
import com.comscore.utils.Utils;
import com.comscore.utils.task.TaskExecutor;
import java.util.*;

// Referenced classes of package com.comscore.streaming:
//			StreamSenseState, StreamSensePlaylist, StreamSenseEventType, StreamSenseClip, 
//			StreamSenseListener, d, a, b, 
//			c, e, StreamSenseMediaPlayer, StreamSenseVideoView, 
//			StreamSenseUtils, f

public class StreamSense
{

	public StreamSense()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #47  <Method void Object()>
		c = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #49  <Field String c>
		f = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #51  <Field StreamSenseState f>
		h = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #53  <Field StreamSensePlaylist h>
		i = null;
	//   11   19:aload_0         
	//   12   20:aconst_null     
	//   13   21:putfield        #55  <Field Runnable i>
		j = true;
	//   14   24:aload_0         
	//   15   25:iconst_1        
	//   16   26:putfield        #57  <Field boolean j>
		l = null;
	//   17   29:aload_0         
	//   18   30:aconst_null     
	//   19   31:putfield        #59  <Field f l>
		CSLog.d(((Object) (this)), "StreamSense()");
	//   20   34:aload_0         
	//   21   35:ldc1            #61  <String "StreamSense()">
	//   22   37:invokestatic    #66  <Method void CSLog.d(Object, String)>
		a = comScore.getCore();
	//   23   40:aload_0         
	//   24   41:invokestatic    #72  <Method Core comScore.getCore()>
	//   25   44:putfield        #74  <Field Core a>
		b = new HashMap();
	//   26   47:aload_0         
	//   27   48:new             #76  <Class HashMap>
	//   28   51:dup             
	//   29   52:invokespecial   #77  <Method void HashMap()>
	//   30   55:putfield        #79  <Field HashMap b>
		g = 1;
	//   31   58:aload_0         
	//   32   59:iconst_1        
	//   33   60:putfield        #81  <Field int g>
		f = StreamSenseState.IDLE;
	//   34   63:aload_0         
	//   35   64:getstatic       #86  <Field StreamSenseState StreamSenseState.IDLE>
	//   36   67:putfield        #51  <Field StreamSenseState f>
		h = new StreamSensePlaylist();
	//   37   70:aload_0         
	//   38   71:new             #88  <Class StreamSensePlaylist>
	//   39   74:dup             
	//   40   75:invokespecial   #89  <Method void StreamSensePlaylist()>
	//   41   78:putfield        #53  <Field StreamSensePlaylist h>
		i = null;
	//   42   81:aload_0         
	//   43   82:aconst_null     
	//   44   83:putfield        #55  <Field Runnable i>
		j = true;
	//   45   86:aload_0         
	//   46   87:iconst_1        
	//   47   88:putfield        #57  <Field boolean j>
		m = null;
	//   48   91:aload_0         
	//   49   92:aconst_null     
	//   50   93:putfield        #91  <Field Runnable m>
		o = 0;
	//   51   96:aload_0         
	//   52   97:iconst_0        
	//   53   98:putfield        #93  <Field int o>
		f();
	//   54  101:aload_0         
	//   55  102:invokespecial   #95  <Method void f()>
		k = null;
	//   56  105:aload_0         
	//   57  106:aconst_null     
	//   58  107:putfield        #97  <Field Runnable k>
		l = null;
	//   59  110:aload_0         
	//   60  111:aconst_null     
	//   61  112:putfield        #59  <Field f l>
		q = false;
	//   62  115:aload_0         
	//   63  116:iconst_0        
	//   64  117:putfield        #99  <Field boolean q>
		r = null;
	//   65  120:aload_0         
	//   66  121:aconst_null     
	//   67  122:putfield        #101 <Field StreamSenseState r>
		e = 0L;
	//   68  125:aload_0         
	//   69  126:lconst_0        
	//   70  127:putfield        #103 <Field long e>
		x = 0x124f80;
	//   71  130:aload_0         
	//   72  131:ldc1            #104 <Int 0x124f80>
	//   73  133:putfield        #106 <Field int x>
		y = 500;
	//   74  136:aload_0         
	//   75  137:sipush          500
	//   76  140:putfield        #108 <Field int y>
		v = ((List) (new ArrayList()));
	//   77  143:aload_0         
	//   78  144:new             #110 <Class ArrayList>
	//   79  147:dup             
	//   80  148:invokespecial   #111 <Method void ArrayList()>
	//   81  151:putfield        #113 <Field List v>
		w = n();
	//   82  154:aload_0         
	//   83  155:aload_0         
	//   84  156:invokespecial   #116 <Method List n()>
	//   85  159:putfield        #118 <Field List w>
		reset();
	//   86  162:aload_0         
	//   87  163:invokevirtual   #121 <Method void reset()>
	//   88  166:return          
	}

	private long a(long l1)
	{
		for(Iterator iterator = w.iterator(); iterator.hasNext();)
	//*   0    0:aload_0         
	//*   1    1:getfield        #118 <Field List w>
	//*   2    4:invokeinterface #129 <Method Iterator List.iterator()>
	//*   3    9:astore_3        
	//*   4   10:aload_3         
	//*   5   11:invokeinterface #135 <Method boolean Iterator.hasNext()>
	//*   6   16:ifeq            71
		{
			HashMap hashmap = (HashMap)iterator.next();
	//    7   19:aload_3         
	//    8   20:invokeinterface #139 <Method Object Iterator.next()>
	//    9   25:checkcast       #76  <Class HashMap>
	//   10   28:astore          4
			Long long1 = (Long)hashmap.get("playingtime");
	//   11   30:aload           4
	//   12   32:ldc1            #141 <String "playingtime">
	//   13   34:invokevirtual   #145 <Method Object HashMap.get(Object)>
	//   14   37:checkcast       #147 <Class Long>
	//   15   40:astore          5
			if(long1 == null || l1 < long1.longValue())
	//*  16   42:aload           5
	//*  17   44:ifnull          57
	//*  18   47:lload_1         
	//*  19   48:aload           5
	//*  20   50:invokevirtual   #151 <Method long Long.longValue()>
	//*  21   53:lcmp            
	//*  22   54:ifge            10
				return ((Long)hashmap.get("interval")).longValue();
	//   23   57:aload           4
	//   24   59:ldc1            #153 <String "interval">
	//   25   61:invokevirtual   #145 <Method Object HashMap.get(Object)>
	//   26   64:checkcast       #147 <Class Long>
	//   27   67:invokevirtual   #151 <Method long Long.longValue()>
	//   28   70:lreturn         
		}

		return 0L;
	//   29   71:lconst_0        
	//   30   72:lreturn         
	}

	private StreamSenseState a(StreamSenseEventType streamsenseeventtype)
	{
		if(streamsenseeventtype == StreamSenseEventType.PLAY)
	//*   0    0:aload_1         
	//*   1    1:getstatic       #160 <Field StreamSenseEventType StreamSenseEventType.PLAY>
	//*   2    4:if_acmpne       11
			return StreamSenseState.PLAYING;
	//    3    7:getstatic       #163 <Field StreamSenseState StreamSenseState.PLAYING>
	//    4   10:areturn         
		if(streamsenseeventtype == StreamSenseEventType.PAUSE)
	//*   5   11:aload_1         
	//*   6   12:getstatic       #166 <Field StreamSenseEventType StreamSenseEventType.PAUSE>
	//*   7   15:if_acmpne       22
			return StreamSenseState.PAUSED;
	//    8   18:getstatic       #169 <Field StreamSenseState StreamSenseState.PAUSED>
	//    9   21:areturn         
		if(streamsenseeventtype == StreamSenseEventType.BUFFER)
	//*  10   22:aload_1         
	//*  11   23:getstatic       #172 <Field StreamSenseEventType StreamSenseEventType.BUFFER>
	//*  12   26:if_acmpne       33
			return StreamSenseState.BUFFERING;
	//   13   29:getstatic       #175 <Field StreamSenseState StreamSenseState.BUFFERING>
	//   14   32:areturn         
		if(streamsenseeventtype == StreamSenseEventType.END)
	//*  15   33:aload_1         
	//*  16   34:getstatic       #178 <Field StreamSenseEventType StreamSenseEventType.END>
	//*  17   37:if_acmpne       44
			return StreamSenseState.IDLE;
	//   18   40:getstatic       #86  <Field StreamSenseState StreamSenseState.IDLE>
	//   19   43:areturn         
		else
			return null;
	//   20   44:aconst_null     
	//   21   45:areturn         
	}

	private HashMap a(StreamSenseEventType streamsenseeventtype, HashMap hashmap)
	{
		if(!a.isEnabled())
	//*   0    0:aload_0         
	//*   1    1:getfield        #74  <Field Core a>
	//*   2    4:invokevirtual   #184 <Method boolean Core.isEnabled()>
	//*   3    7:ifne            18
			new HashMap();
	//    4   10:new             #76  <Class HashMap>
	//    5   13:dup             
	//    6   14:invokespecial   #77  <Method void HashMap()>
	//    7   17:pop             
		Object obj = ((Object) (new StringBuilder()));
	//    8   18:new             #186 <Class StringBuilder>
	//    9   21:dup             
	//   10   22:invokespecial   #187 <Method void StringBuilder()>
	//   11   25:astore_3        
		((StringBuilder) (obj)).append("createMeasurementLabels(");
	//   12   26:aload_3         
	//   13   27:ldc1            #189 <String "createMeasurementLabels(">
	//   14   29:invokevirtual   #193 <Method StringBuilder StringBuilder.append(String)>
	//   15   32:pop             
		((StringBuilder) (obj)).append(((Object) (streamsenseeventtype)));
	//   16   33:aload_3         
	//   17   34:aload_1         
	//   18   35:invokevirtual   #196 <Method StringBuilder StringBuilder.append(Object)>
	//   19   38:pop             
		((StringBuilder) (obj)).append(")");
	//   20   39:aload_3         
	//   21   40:ldc1            #198 <String ")">
	//   22   42:invokevirtual   #193 <Method StringBuilder StringBuilder.append(String)>
	//   23   45:pop             
		CSLog.d(((Object) (this)), ((StringBuilder) (obj)).toString());
	//   24   46:aload_0         
	//   25   47:aload_3         
	//   26   48:invokevirtual   #202 <Method String StringBuilder.toString()>
	//   27   51:invokestatic    #66  <Method void CSLog.d(Object, String)>
		obj = ((Object) (new HashMap()));
	//   28   54:new             #76  <Class HashMap>
	//   29   57:dup             
	//   30   58:invokespecial   #77  <Method void HashMap()>
	//   31   61:astore_3        
		if(hashmap != null)
	//*  32   62:aload_2         
	//*  33   63:ifnull          71
			((HashMap) (obj)).putAll(((java.util.Map) (hashmap)));
	//   34   66:aload_3         
	//   35   67:aload_2         
	//   36   68:invokevirtual   #206 <Method void HashMap.putAll(java.util.Map)>
		if(!((HashMap) (obj)).containsKey("ns_ts"))
	//*  37   71:aload_3         
	//*  38   72:ldc1            #208 <String "ns_ts">
	//*  39   74:invokevirtual   #212 <Method boolean HashMap.containsKey(Object)>
	//*  40   77:ifne            93
			((HashMap) (obj)).put("ns_ts", ((Object) (String.valueOf(System.currentTimeMillis()))));
	//   41   80:aload_3         
	//   42   81:ldc1            #208 <String "ns_ts">
	//   43   83:invokestatic    #217 <Method long System.currentTimeMillis()>
	//   44   86:invokestatic    #223 <Method String String.valueOf(long)>
	//   45   89:invokevirtual   #227 <Method Object HashMap.put(Object, Object)>
	//   46   92:pop             
		if(streamsenseeventtype != null && !((HashMap) (obj)).containsKey("ns_st_ev"))
	//*  47   93:aload_1         
	//*  48   94:ifnull          117
	//*  49   97:aload_3         
	//*  50   98:ldc1            #229 <String "ns_st_ev">
	//*  51  100:invokevirtual   #212 <Method boolean HashMap.containsKey(Object)>
	//*  52  103:ifne            117
			((HashMap) (obj)).put("ns_st_ev", ((Object) (streamsenseeventtype.toString())));
	//   53  106:aload_3         
	//   54  107:ldc1            #229 <String "ns_st_ev">
	//   55  109:aload_1         
	//   56  110:invokevirtual   #230 <Method String StreamSenseEventType.toString()>
	//   57  113:invokevirtual   #227 <Method Object HashMap.put(Object, Object)>
	//   58  116:pop             
		((HashMap) (obj)).putAll(((java.util.Map) (getLabels())));
	//   59  117:aload_3         
	//   60  118:aload_0         
	//   61  119:invokevirtual   #234 <Method HashMap getLabels()>
	//   62  122:invokevirtual   #206 <Method void HashMap.putAll(java.util.Map)>
		b(streamsenseeventtype, ((HashMap) (obj)));
	//   63  125:aload_0         
	//   64  126:aload_1         
	//   65  127:aload_3         
	//   66  128:invokespecial   #236 <Method HashMap b(StreamSenseEventType, HashMap)>
	//   67  131:pop             
		h.a(streamsenseeventtype, ((HashMap) (obj)));
	//   68  132:aload_0         
	//   69  133:getfield        #53  <Field StreamSensePlaylist h>
	//   70  136:aload_1         
	//   71  137:aload_3         
	//   72  138:invokevirtual   #238 <Method HashMap StreamSensePlaylist.a(StreamSenseEventType, HashMap)>
	//   73  141:pop             
		h.getClip().a(streamsenseeventtype, ((HashMap) (obj)));
	//   74  142:aload_0         
	//   75  143:getfield        #53  <Field StreamSensePlaylist h>
	//   76  146:invokevirtual   #242 <Method StreamSenseClip StreamSensePlaylist.getClip()>
	//   77  149:aload_1         
	//   78  150:aload_3         
	//   79  151:invokevirtual   #245 <Method HashMap StreamSenseClip.a(StreamSenseEventType, HashMap)>
	//   80  154:pop             
		if(!((HashMap) (obj)).containsKey("ns_st_mp"))
	//*  81  155:aload_3         
	//*  82  156:ldc1            #247 <String "ns_st_mp">
	//*  83  158:invokevirtual   #212 <Method boolean HashMap.containsKey(Object)>
	//*  84  161:ifne            175
			((HashMap) (obj)).put("ns_st_mp", ((Object) (s)));
	//   85  164:aload_3         
	//   86  165:ldc1            #247 <String "ns_st_mp">
	//   87  167:aload_0         
	//   88  168:getfield        #249 <Field String s>
	//   89  171:invokevirtual   #227 <Method Object HashMap.put(Object, Object)>
	//   90  174:pop             
		if(!((HashMap) (obj)).containsKey("ns_st_mv"))
	//*  91  175:aload_3         
	//*  92  176:ldc1            #251 <String "ns_st_mv">
	//*  93  178:invokevirtual   #212 <Method boolean HashMap.containsKey(Object)>
	//*  94  181:ifne            195
			((HashMap) (obj)).put("ns_st_mv", ((Object) (t)));
	//   95  184:aload_3         
	//   96  185:ldc1            #251 <String "ns_st_mv">
	//   97  187:aload_0         
	//   98  188:getfield        #253 <Field String t>
	//   99  191:invokevirtual   #227 <Method Object HashMap.put(Object, Object)>
	//  100  194:pop             
		if(!((HashMap) (obj)).containsKey("ns_st_ub"))
	//* 101  195:aload_3         
	//* 102  196:ldc1            #255 <String "ns_st_ub">
	//* 103  198:invokevirtual   #212 <Method boolean HashMap.containsKey(Object)>
	//* 104  201:ifne            214
			((HashMap) (obj)).put("ns_st_ub", "0");
	//  105  204:aload_3         
	//  106  205:ldc1            #255 <String "ns_st_ub">
	//  107  207:ldc2            #257 <String "0">
	//  108  210:invokevirtual   #227 <Method Object HashMap.put(Object, Object)>
	//  109  213:pop             
		if(!((HashMap) (obj)).containsKey("ns_st_br"))
	//* 110  214:aload_3         
	//* 111  215:ldc2            #259 <String "ns_st_br">
	//* 112  218:invokevirtual   #212 <Method boolean HashMap.containsKey(Object)>
	//* 113  221:ifne            235
			((HashMap) (obj)).put("ns_st_br", "0");
	//  114  224:aload_3         
	//  115  225:ldc2            #259 <String "ns_st_br">
	//  116  228:ldc2            #257 <String "0">
	//  117  231:invokevirtual   #227 <Method Object HashMap.put(Object, Object)>
	//  118  234:pop             
		if(!((HashMap) (obj)).containsKey("ns_st_pn"))
	//* 119  235:aload_3         
	//* 120  236:ldc2            #261 <String "ns_st_pn">
	//* 121  239:invokevirtual   #212 <Method boolean HashMap.containsKey(Object)>
	//* 122  242:ifne            256
			((HashMap) (obj)).put("ns_st_pn", "1");
	//  123  245:aload_3         
	//  124  246:ldc2            #261 <String "ns_st_pn">
	//  125  249:ldc2            #263 <String "1">
	//  126  252:invokevirtual   #227 <Method Object HashMap.put(Object, Object)>
	//  127  255:pop             
		if(!((HashMap) (obj)).containsKey("ns_st_tp"))
	//* 128  256:aload_3         
	//* 129  257:ldc2            #265 <String "ns_st_tp">
	//* 130  260:invokevirtual   #212 <Method boolean HashMap.containsKey(Object)>
	//* 131  263:ifne            277
			((HashMap) (obj)).put("ns_st_tp", "1");
	//  132  266:aload_3         
	//  133  267:ldc2            #265 <String "ns_st_tp">
	//  134  270:ldc2            #263 <String "1">
	//  135  273:invokevirtual   #227 <Method Object HashMap.put(Object, Object)>
	//  136  276:pop             
		if(!((HashMap) (obj)).containsKey("ns_st_it"))
	//* 137  277:aload_3         
	//* 138  278:ldc2            #267 <String "ns_st_it">
	//* 139  281:invokevirtual   #212 <Method boolean HashMap.containsKey(Object)>
	//* 140  284:ifne            298
			((HashMap) (obj)).put("ns_st_it", "c");
	//  141  287:aload_3         
	//  142  288:ldc2            #267 <String "ns_st_it">
	//  143  291:ldc2            #268 <String "c">
	//  144  294:invokevirtual   #227 <Method Object HashMap.put(Object, Object)>
	//  145  297:pop             
		((HashMap) (obj)).put("ns_st_sv", "4.1508.28");
	//  146  298:aload_3         
	//  147  299:ldc2            #270 <String "ns_st_sv">
	//  148  302:ldc2            #272 <String "4.1508.28">
	//  149  305:invokevirtual   #227 <Method Object HashMap.put(Object, Object)>
	//  150  308:pop             
		return ((HashMap) (obj));
	//  151  309:aload_3         
	//  152  310:areturn         
	}

	static void a(StreamSense streamsense)
	{
		streamsense.j();
	//    0    0:aload_0         
	//    1    1:invokespecial   #277 <Method void j()>
	//    2    4:return          
	}

	static void a(StreamSense streamsense, StreamSenseState streamsensestate, HashMap hashmap)
	{
		streamsense.a(streamsensestate, hashmap);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #281 <Method void a(StreamSenseState, HashMap)>
	//    4    6:return          
	}

	private void a(StreamSenseState streamsensestate, HashMap hashmap)
	{
		if(!a.isEnabled())
	//*   0    0:aload_0         
	//*   1    1:getfield        #74  <Field Core a>
	//*   2    4:invokevirtual   #184 <Method boolean Core.isEnabled()>
	//*   3    7:ifne            11
			return;
	//    4   10:return          
		StringBuilder stringbuilder = new StringBuilder();
	//    5   11:new             #186 <Class StringBuilder>
	//    6   14:dup             
	//    7   15:invokespecial   #187 <Method void StringBuilder()>
	//    8   18:astore          9
		stringbuilder.append("transitionTo(");
	//    9   20:aload           9
	//   10   22:ldc2            #283 <String "transitionTo(">
	//   11   25:invokevirtual   #193 <Method StringBuilder StringBuilder.append(String)>
	//   12   28:pop             
		stringbuilder.append(((Object) (streamsensestate)));
	//   13   29:aload           9
	//   14   31:aload_1         
	//   15   32:invokevirtual   #196 <Method StringBuilder StringBuilder.append(Object)>
	//   16   35:pop             
		stringbuilder.append(", ");
	//   17   36:aload           9
	//   18   38:ldc2            #285 <String ", ">
	//   19   41:invokevirtual   #193 <Method StringBuilder StringBuilder.append(String)>
	//   20   44:pop             
		stringbuilder.append(((Object) (hashmap)));
	//   21   45:aload           9
	//   22   47:aload_2         
	//   23   48:invokevirtual   #196 <Method StringBuilder StringBuilder.append(Object)>
	//   24   51:pop             
		stringbuilder.append(")");
	//   25   52:aload           9
	//   26   54:ldc1            #198 <String ")">
	//   27   56:invokevirtual   #193 <Method StringBuilder StringBuilder.append(String)>
	//   28   59:pop             
		CSLog.d(((Object) (this)), stringbuilder.toString());
	//   29   60:aload_0         
	//   30   61:aload           9
	//   31   63:invokevirtual   #202 <Method String StringBuilder.toString()>
	//   32   66:invokestatic    #66  <Method void CSLog.d(Object, String)>
		l();
	//   33   69:aload_0         
	//   34   70:invokespecial   #287 <Method void l()>
		if(c(streamsensestate))
	//*  35   73:aload_0         
	//*  36   74:aload_1         
	//*  37   75:invokespecial   #290 <Method boolean c(StreamSenseState)>
	//*  38   78:ifeq            254
		{
			StreamSenseState streamsensestate1 = getState();
	//   39   81:aload_0         
	//   40   82:invokevirtual   #294 <Method StreamSenseState getState()>
	//   41   85:astore          9
			long l2 = d;
	//   42   87:aload_0         
	//   43   88:getfield        #296 <Field long d>
	//   44   91:lstore          5
			long l3 = f(hashmap);
	//   45   93:aload_0         
	//   46   94:aload_2         
	//   47   95:invokespecial   #299 <Method long f(HashMap)>
	//   48   98:lstore          7
			long l1 = 0L;
	//   49  100:lconst_0        
	//   50  101:lstore_3        
			if(l2 >= 0L)
	//*  51  102:lload           5
	//*  52  104:lconst_0        
	//*  53  105:lcmp            
	//*  54  106:iflt            115
				l1 = l3 - l2;
	//   55  109:lload           7
	//   56  111:lload           5
	//   57  113:lsub            
	//   58  114:lstore_3        
			b(getState(), hashmap);
	//   59  115:aload_0         
	//   60  116:aload_0         
	//   61  117:invokevirtual   #294 <Method StreamSenseState getState()>
	//   62  120:aload_2         
	//   63  121:invokespecial   #301 <Method void b(StreamSenseState, HashMap)>
			c(streamsensestate, hashmap);
	//   64  124:aload_0         
	//   65  125:aload_1         
	//   66  126:aload_2         
	//   67  127:invokespecial   #303 <Method void c(StreamSenseState, HashMap)>
			d(streamsensestate);
	//   68  130:aload_0         
	//   69  131:aload_1         
	//   70  132:invokespecial   #306 <Method void d(StreamSenseState)>
			for(Iterator iterator = v.iterator(); iterator.hasNext(); ((StreamSenseListener)iterator.next()).onStateChange(streamsensestate1, streamsensestate, hashmap, l1));
	//   71  135:aload_0         
	//   72  136:getfield        #113 <Field List v>
	//   73  139:invokeinterface #129 <Method Iterator List.iterator()>
	//   74  144:astore          10
	//   75  146:aload           10
	//   76  148:invokeinterface #135 <Method boolean Iterator.hasNext()>
	//   77  153:ifeq            179
	//   78  156:aload           10
	//   79  158:invokeinterface #139 <Method Object Iterator.next()>
	//   80  163:checkcast       #308 <Class StreamSenseListener>
	//   81  166:aload           9
	//   82  168:aload_1         
	//   83  169:aload_2         
	//   84  170:lload_3         
	//   85  171:invokeinterface #312 <Method void StreamSenseListener.onStateChange(StreamSenseState, StreamSenseState, HashMap, long)>
	//*  86  176:goto            146
			c(hashmap);
	//   87  179:aload_0         
	//   88  180:aload_2         
	//   89  181:invokespecial   #315 <Method void c(HashMap)>
			h.b(hashmap, streamsensestate);
	//   90  184:aload_0         
	//   91  185:getfield        #53  <Field StreamSensePlaylist h>
	//   92  188:aload_2         
	//   93  189:aload_1         
	//   94  190:invokevirtual   #318 <Method void StreamSensePlaylist.b(HashMap, StreamSenseState)>
			h.getClip().b(hashmap, streamsensestate);
	//   95  193:aload_0         
	//   96  194:getfield        #53  <Field StreamSensePlaylist h>
	//   97  197:invokevirtual   #242 <Method StreamSenseClip StreamSensePlaylist.getClip()>
	//   98  200:aload_2         
	//   99  201:aload_1         
	//  100  202:invokevirtual   #319 <Method void StreamSenseClip.b(HashMap, StreamSenseState)>
			streamsensestate = ((StreamSenseState) (a(streamsensestate.toEventType(), hashmap)));
	//  101  205:aload_0         
	//  102  206:aload_1         
	//  103  207:invokevirtual   #323 <Method StreamSenseEventType StreamSenseState.toEventType()>
	//  104  210:aload_2         
	//  105  211:invokespecial   #324 <Method HashMap a(StreamSenseEventType, HashMap)>
	//  106  214:astore_1        
			((HashMap) (streamsensestate)).putAll(((java.util.Map) (hashmap)));
	//  107  215:aload_1         
	//  108  216:aload_2         
	//  109  217:invokevirtual   #206 <Method void HashMap.putAll(java.util.Map)>
			if(b(f))
	//* 110  220:aload_0         
	//* 111  221:aload_0         
	//* 112  222:getfield        #51  <Field StreamSenseState f>
	//* 113  225:invokespecial   #326 <Method boolean b(StreamSenseState)>
	//* 114  228:ifeq            254
			{
				a(((HashMap) (streamsensestate)));
	//  115  231:aload_0         
	//  116  232:aload_1         
	//  117  233:invokevirtual   #328 <Method void a(HashMap)>
				r = f;
	//  118  236:aload_0         
	//  119  237:aload_0         
	//  120  238:getfield        #51  <Field StreamSenseState f>
	//  121  241:putfield        #101 <Field StreamSenseState r>
				g = g + 1;
	//  122  244:aload_0         
	//  123  245:aload_0         
	//  124  246:getfield        #81  <Field int g>
	//  125  249:iconst_1        
	//  126  250:iadd            
	//  127  251:putfield        #81  <Field int g>
			}
		}
	//  128  254:return          
	}

	private void a(StreamSenseState streamsensestate, HashMap hashmap, long l1)
	{
		if(!a.isEnabled())
	//*   0    0:aload_0         
	//*   1    1:getfield        #74  <Field Core a>
	//*   2    4:invokevirtual   #184 <Method boolean Core.isEnabled()>
	//*   3    7:ifne            11
		{
			return;
	//    4   10:return          
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    5   11:new             #186 <Class StringBuilder>
	//    6   14:dup             
	//    7   15:invokespecial   #187 <Method void StringBuilder()>
	//    8   18:astore          5
			stringbuilder.append("transitionTo(");
	//    9   20:aload           5
	//   10   22:ldc2            #283 <String "transitionTo(">
	//   11   25:invokevirtual   #193 <Method StringBuilder StringBuilder.append(String)>
	//   12   28:pop             
			stringbuilder.append(((Object) (streamsensestate)));
	//   13   29:aload           5
	//   14   31:aload_1         
	//   15   32:invokevirtual   #196 <Method StringBuilder StringBuilder.append(Object)>
	//   16   35:pop             
			stringbuilder.append(", ");
	//   17   36:aload           5
	//   18   38:ldc2            #285 <String ", ">
	//   19   41:invokevirtual   #193 <Method StringBuilder StringBuilder.append(String)>
	//   20   44:pop             
			stringbuilder.append(((Object) (hashmap)));
	//   21   45:aload           5
	//   22   47:aload_2         
	//   23   48:invokevirtual   #196 <Method StringBuilder StringBuilder.append(Object)>
	//   24   51:pop             
			stringbuilder.append(", ");
	//   25   52:aload           5
	//   26   54:ldc2            #285 <String ", ">
	//   27   57:invokevirtual   #193 <Method StringBuilder StringBuilder.append(String)>
	//   28   60:pop             
			stringbuilder.append(l1);
	//   29   61:aload           5
	//   30   63:lload_3         
	//   31   64:invokevirtual   #333 <Method StringBuilder StringBuilder.append(long)>
	//   32   67:pop             
			stringbuilder.append(")");
	//   33   68:aload           5
	//   34   70:ldc1            #198 <String ")">
	//   35   72:invokevirtual   #193 <Method StringBuilder StringBuilder.append(String)>
	//   36   75:pop             
			CSLog.d(((Object) (this)), stringbuilder.toString());
	//   37   76:aload_0         
	//   38   77:aload           5
	//   39   79:invokevirtual   #202 <Method String StringBuilder.toString()>
	//   40   82:invokestatic    #66  <Method void CSLog.d(Object, String)>
			l();
	//   41   85:aload_0         
	//   42   86:invokespecial   #287 <Method void l()>
			l = ((f) (new d(this, streamsensestate, hashmap)));
	//   43   89:aload_0         
	//   44   90:new             #335 <Class d>
	//   45   93:dup             
	//   46   94:aload_0         
	//   47   95:aload_1         
	//   48   96:aload_2         
	//   49   97:invokespecial   #337 <Method void d(StreamSense, StreamSenseState, HashMap)>
	//   50  100:putfield        #59  <Field f l>
			a.getTaskExecutor().execute(((Runnable) (l)), l1);
	//   51  103:aload_0         
	//   52  104:getfield        #74  <Field Core a>
	//   53  107:invokevirtual   #341 <Method TaskExecutor Core.getTaskExecutor()>
	//   54  110:aload_0         
	//   55  111:getfield        #59  <Field f l>
	//   56  114:lload_3         
	//   57  115:invokevirtual   #347 <Method boolean TaskExecutor.execute(Runnable, long)>
	//   58  118:pop             
			return;
	//   59  119:return          
		}
	}

	private boolean a(StreamSenseState streamsensestate)
	{
		boolean flag1 = a.isEnabled();
	//    0    0:aload_0         
	//    1    1:getfield        #74  <Field Core a>
	//    2    4:invokevirtual   #184 <Method boolean Core.isEnabled()>
	//    3    7:istore_3        
		boolean flag = false;
	//    4    8:iconst_0        
	//    5    9:istore_2        
		if(!flag1)
	//*   6   10:iload_3         
	//*   7   11:ifne            16
			return false;
	//    8   14:iconst_0        
	//    9   15:ireturn         
		if(streamsensestate == StreamSenseState.PLAYING || streamsensestate == StreamSenseState.PAUSED)
	//*  10   16:aload_1         
	//*  11   17:getstatic       #163 <Field StreamSenseState StreamSenseState.PLAYING>
	//*  12   20:if_acmpeq       30
	//*  13   23:aload_1         
	//*  14   24:getstatic       #169 <Field StreamSenseState StreamSenseState.PAUSED>
	//*  15   27:if_acmpne       32
			flag = true;
	//   16   30:iconst_1        
	//   17   31:istore_2        
		return flag;
	//   18   32:iload_2         
	//   19   33:ireturn         
	}

	public static StreamSense analyticsFor(StreamSenseMediaPlayer streamsensemediaplayer)
	{
		StreamSense streamsense = new StreamSense();
	//    0    0:new             #2   <Class StreamSense>
	//    1    3:dup             
	//    2    4:invokespecial   #352 <Method void StreamSense()>
	//    3    7:astore_1        
		streamsense.engageTo(streamsensemediaplayer);
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:invokevirtual   #356 <Method void engageTo(StreamSenseMediaPlayer)>
		streamsense.setPausePlaySwitchDelayEnabled(true);
	//    7   13:aload_1         
	//    8   14:iconst_1        
	//    9   15:invokevirtual   #360 <Method void setPausePlaySwitchDelayEnabled(boolean)>
		return streamsense;
	//   10   18:aload_1         
	//   11   19:areturn         
	}

	public static StreamSense analyticsFor(StreamSenseVideoView streamsensevideoview)
	{
		StreamSense streamsense = new StreamSense();
	//    0    0:new             #2   <Class StreamSense>
	//    1    3:dup             
	//    2    4:invokespecial   #352 <Method void StreamSense()>
	//    3    7:astore_1        
		streamsense.engageTo(streamsensevideoview);
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:invokevirtual   #365 <Method void engageTo(StreamSenseVideoView)>
		return streamsense;
	//    7   13:aload_1         
	//    8   14:areturn         
	}

	private HashMap b(StreamSenseEventType streamsenseeventtype, HashMap hashmap)
	{
label0:
		{
			long l1;
label1:
			{
				if(!a.isEnabled())
	//*   0    0:aload_0         
	//*   1    1:getfield        #74  <Field Core a>
	//*   2    4:invokevirtual   #184 <Method boolean Core.isEnabled()>
	//*   3    7:ifne            18
					return new HashMap();
	//    4   10:new             #76  <Class HashMap>
	//    5   13:dup             
	//    6   14:invokespecial   #77  <Method void HashMap()>
	//    7   17:areturn         
				if(hashmap == null)
	//*   8   18:aload_2         
	//*   9   19:ifnull          25
	//*  10   22:goto            33
					hashmap = new HashMap();
	//   11   25:new             #76  <Class HashMap>
	//   12   28:dup             
	//   13   29:invokespecial   #77  <Method void HashMap()>
	//   14   32:astore_2        
				hashmap.put("ns_st_ec", ((Object) (String.valueOf(g))));
	//   15   33:aload_2         
	//   16   34:ldc2            #367 <String "ns_st_ec">
	//   17   37:aload_0         
	//   18   38:getfield        #81  <Field int g>
	//   19   41:invokestatic    #370 <Method String String.valueOf(int)>
	//   20   44:invokevirtual   #227 <Method Object HashMap.put(Object, Object)>
	//   21   47:pop             
				if(hashmap.containsKey("ns_st_po"))
					break label0;
	//   22   48:aload_2         
	//   23   49:ldc2            #372 <String "ns_st_po">
	//   24   52:invokevirtual   #212 <Method boolean HashMap.containsKey(Object)>
	//   25   55:ifne            141
				long l2 = e;
	//   26   58:aload_0         
	//   27   59:getfield        #103 <Field long e>
	//   28   62:lstore          5
				long l3 = f(hashmap);
	//   29   64:aload_0         
	//   30   65:aload_2         
	//   31   66:invokespecial   #299 <Method long f(HashMap)>
	//   32   69:lstore          7
				if(streamsenseeventtype != StreamSenseEventType.PLAY && streamsenseeventtype != StreamSenseEventType.KEEP_ALIVE && streamsenseeventtype != StreamSenseEventType.HEART_BEAT)
	//*  33   71:aload_1         
	//*  34   72:getstatic       #160 <Field StreamSenseEventType StreamSenseEventType.PLAY>
	//*  35   75:if_acmpeq       112
	//*  36   78:aload_1         
	//*  37   79:getstatic       #375 <Field StreamSenseEventType StreamSenseEventType.KEEP_ALIVE>
	//*  38   82:if_acmpeq       112
	//*  39   85:aload_1         
	//*  40   86:getstatic       #378 <Field StreamSenseEventType StreamSenseEventType.HEART_BEAT>
	//*  41   89:if_acmpeq       112
				{
					l1 = l2;
	//   42   92:lload           5
	//   43   94:lstore_3        
					if(streamsenseeventtype != null)
						break label1;
	//   44   95:aload_1         
	//   45   96:ifnonnull       129
					l1 = l2;
	//   46   99:lload           5
	//   47  101:lstore_3        
					if(f != StreamSenseState.PLAYING)
						break label1;
	//   48  102:aload_0         
	//   49  103:getfield        #51  <Field StreamSenseState f>
	//   50  106:getstatic       #163 <Field StreamSenseState StreamSenseState.PLAYING>
	//   51  109:if_acmpne       129
				}
				l1 = l2 + (l3 - h.getClip().getPlaybackTimestamp());
	//   52  112:lload           5
	//   53  114:lload           7
	//   54  116:aload_0         
	//   55  117:getfield        #53  <Field StreamSensePlaylist h>
	//   56  120:invokevirtual   #242 <Method StreamSenseClip StreamSensePlaylist.getClip()>
	//   57  123:invokevirtual   #381 <Method long StreamSenseClip.getPlaybackTimestamp()>
	//   58  126:lsub            
	//   59  127:ladd            
	//   60  128:lstore_3        
			}
			hashmap.put("ns_st_po", ((Object) (String.valueOf(l1))));
	//   61  129:aload_2         
	//   62  130:ldc2            #372 <String "ns_st_po">
	//   63  133:lload_3         
	//   64  134:invokestatic    #223 <Method String String.valueOf(long)>
	//   65  137:invokevirtual   #227 <Method Object HashMap.put(Object, Object)>
	//   66  140:pop             
		}
		if(streamsenseeventtype == StreamSenseEventType.HEART_BEAT)
	//*  67  141:aload_1         
	//*  68  142:getstatic       #378 <Field StreamSenseEventType StreamSenseEventType.HEART_BEAT>
	//*  69  145:if_acmpne       174
		{
			hashmap.put("ns_st_hc", ((Object) (String.valueOf(o))));
	//   70  148:aload_2         
	//   71  149:ldc2            #383 <String "ns_st_hc">
	//   72  152:aload_0         
	//   73  153:getfield        #93  <Field int o>
	//   74  156:invokestatic    #370 <Method String String.valueOf(int)>
	//   75  159:invokevirtual   #227 <Method Object HashMap.put(Object, Object)>
	//   76  162:pop             
			hashmap.put("ns_st_pe", "1");
	//   77  163:aload_2         
	//   78  164:ldc2            #385 <String "ns_st_pe">
	//   79  167:ldc2            #263 <String "1">
	//   80  170:invokevirtual   #227 <Method Object HashMap.put(Object, Object)>
	//   81  173:pop             
		}
		return hashmap;
	//   82  174:aload_2         
	//   83  175:areturn         
	}

	private void b(StreamSenseState streamsensestate, HashMap hashmap)
	{
		if(!a.isEnabled())
	//*   0    0:aload_0         
	//*   1    1:getfield        #74  <Field Core a>
	//*   2    4:invokevirtual   #184 <Method boolean Core.isEnabled()>
	//*   3    7:ifne            11
			return;
	//    4   10:return          
		StringBuilder stringbuilder = new StringBuilder();
	//    5   11:new             #186 <Class StringBuilder>
	//    6   14:dup             
	//    7   15:invokespecial   #187 <Method void StringBuilder()>
	//    8   18:astore          5
		stringbuilder.append("onExit(");
	//    9   20:aload           5
	//   10   22:ldc2            #387 <String "onExit(">
	//   11   25:invokevirtual   #193 <Method StringBuilder StringBuilder.append(String)>
	//   12   28:pop             
		stringbuilder.append(((Object) (streamsensestate)));
	//   13   29:aload           5
	//   14   31:aload_1         
	//   15   32:invokevirtual   #196 <Method StringBuilder StringBuilder.append(Object)>
	//   16   35:pop             
		stringbuilder.append(", ");
	//   17   36:aload           5
	//   18   38:ldc2            #285 <String ", ">
	//   19   41:invokevirtual   #193 <Method StringBuilder StringBuilder.append(String)>
	//   20   44:pop             
		stringbuilder.append(((Object) (hashmap)));
	//   21   45:aload           5
	//   22   47:aload_2         
	//   23   48:invokevirtual   #196 <Method StringBuilder StringBuilder.append(Object)>
	//   24   51:pop             
		stringbuilder.append(")");
	//   25   52:aload           5
	//   26   54:ldc1            #198 <String ")">
	//   27   56:invokevirtual   #193 <Method StringBuilder StringBuilder.append(String)>
	//   28   59:pop             
		CSLog.d(((Object) (this)), stringbuilder.toString());
	//   29   60:aload_0         
	//   30   61:aload           5
	//   31   63:invokevirtual   #202 <Method String StringBuilder.toString()>
	//   32   66:invokestatic    #66  <Method void CSLog.d(Object, String)>
		long l1 = f(hashmap);
	//   33   69:aload_0         
	//   34   70:aload_2         
	//   35   71:invokespecial   #299 <Method long f(HashMap)>
	//   36   74:lstore_3        
		if(streamsensestate == StreamSenseState.PLAYING)
	//*  37   75:aload_1         
	//*  38   76:getstatic       #163 <Field StreamSenseState StreamSenseState.PLAYING>
	//*  39   79:if_acmpne       99
		{
			h.a(l1);
	//   40   82:aload_0         
	//   41   83:getfield        #53  <Field StreamSensePlaylist h>
	//   42   86:lload_3         
	//   43   87:invokevirtual   #390 <Method void StreamSensePlaylist.a(long)>
			e();
	//   44   90:aload_0         
	//   45   91:invokespecial   #392 <Method void e()>
			h();
	//   46   94:aload_0         
	//   47   95:invokespecial   #394 <Method void h()>
			return;
	//   48   98:return          
		}
		if(streamsensestate == StreamSenseState.BUFFERING)
	//*  49   99:aload_1         
	//*  50  100:getstatic       #175 <Field StreamSenseState StreamSenseState.BUFFERING>
	//*  51  103:if_acmpne       119
		{
			h.b(l1);
	//   52  106:aload_0         
	//   53  107:getfield        #53  <Field StreamSensePlaylist h>
	//   54  110:lload_3         
	//   55  111:invokevirtual   #396 <Method void StreamSensePlaylist.b(long)>
			k();
	//   56  114:aload_0         
	//   57  115:invokespecial   #398 <Method void k()>
			return;
	//   58  118:return          
		}
		if(streamsensestate == StreamSenseState.IDLE)
	//*  59  119:aload_1         
	//*  60  120:getstatic       #86  <Field StreamSenseState StreamSenseState.IDLE>
	//*  61  123:if_acmpne       143
			getClip().reset(getClip().getLabels().keySet());
	//   62  126:aload_0         
	//   63  127:invokevirtual   #399 <Method StreamSenseClip getClip()>
	//   64  130:aload_0         
	//   65  131:invokevirtual   #399 <Method StreamSenseClip getClip()>
	//   66  134:invokevirtual   #400 <Method HashMap StreamSenseClip.getLabels()>
	//   67  137:invokevirtual   #404 <Method Set HashMap.keySet()>
	//   68  140:invokevirtual   #407 <Method void StreamSenseClip.reset(Set)>
	//   69  143:return          
	}

	private void b(HashMap hashmap)
	{
		if(!a.isEnabled())
	//*   0    0:aload_0         
	//*   1    1:getfield        #74  <Field Core a>
	//*   2    4:invokevirtual   #184 <Method boolean Core.isEnabled()>
	//*   3    7:ifne            11
			return;
	//    4   10:return          
		if(f(hashmap) < 0L)
	//*   5   11:aload_0         
	//*   6   12:aload_1         
	//*   7   13:invokespecial   #299 <Method long f(HashMap)>
	//*   8   16:lconst_0        
	//*   9   17:lcmp            
	//*  10   18:ifge            34
			hashmap.put("ns_ts", ((Object) (String.valueOf(System.currentTimeMillis()))));
	//   11   21:aload_1         
	//   12   22:ldc1            #208 <String "ns_ts">
	//   13   24:invokestatic    #217 <Method long System.currentTimeMillis()>
	//   14   27:invokestatic    #223 <Method String String.valueOf(long)>
	//   15   30:invokevirtual   #227 <Method Object HashMap.put(Object, Object)>
	//   16   33:pop             
	//   17   34:return          
	}

	private boolean b(StreamSenseState streamsensestate)
	{
		StreamSenseState streamsensestate1 = StreamSenseState.PAUSED;
	//    0    0:getstatic       #169 <Field StreamSenseState StreamSenseState.PAUSED>
	//    1    3:astore          4
		boolean flag1 = false;
	//    2    5:iconst_0        
	//    3    6:istore_3        
		if(streamsensestate == streamsensestate1 && (r == StreamSenseState.IDLE || r == null))
	//*   4    7:aload_1         
	//*   5    8:aload           4
	//*   6   10:if_acmpne       32
	//*   7   13:aload_0         
	//*   8   14:getfield        #101 <Field StreamSenseState r>
	//*   9   17:getstatic       #86  <Field StreamSenseState StreamSenseState.IDLE>
	//*  10   20:if_acmpeq       30
	//*  11   23:aload_0         
	//*  12   24:getfield        #101 <Field StreamSenseState r>
	//*  13   27:ifnonnull       32
			return false;
	//   14   30:iconst_0        
	//   15   31:ireturn         
		boolean flag = flag1;
	//   16   32:iload_3         
	//   17   33:istore_2        
		if(streamsensestate != StreamSenseState.BUFFERING)
	//*  18   34:aload_1         
	//*  19   35:getstatic       #175 <Field StreamSenseState StreamSenseState.BUFFERING>
	//*  20   38:if_acmpeq       53
		{
			flag = flag1;
	//   21   41:iload_3         
	//   22   42:istore_2        
			if(r != streamsensestate)
	//*  23   43:aload_0         
	//*  24   44:getfield        #101 <Field StreamSenseState r>
	//*  25   47:aload_1         
	//*  26   48:if_acmpeq       53
				flag = true;
	//   27   51:iconst_1        
	//   28   52:istore_2        
		}
		return flag;
	//   29   53:iload_2         
	//   30   54:ireturn         
	}

	private void c()
	{
		if(!a.isEnabled())
	//*   0    0:aload_0         
	//*   1    1:getfield        #74  <Field Core a>
	//*   2    4:invokevirtual   #184 <Method boolean Core.isEnabled()>
	//*   3    7:ifne            11
			return;
	//    4   10:return          
		k();
	//    5   11:aload_0         
	//    6   12:invokespecial   #398 <Method void k()>
		if(isPauseOnBufferingEnabled() && b(StreamSenseState.PAUSED))
	//*   7   15:aload_0         
	//*   8   16:invokevirtual   #411 <Method boolean isPauseOnBufferingEnabled()>
	//*   9   19:ifeq            64
	//*  10   22:aload_0         
	//*  11   23:getstatic       #169 <Field StreamSenseState StreamSenseState.PAUSED>
	//*  12   26:invokespecial   #326 <Method boolean b(StreamSenseState)>
	//*  13   29:ifeq            64
		{
			i = ((Runnable) (new a(this)));
	//   14   32:aload_0         
	//   15   33:new             #413 <Class a>
	//   16   36:dup             
	//   17   37:aload_0         
	//   18   38:invokespecial   #415 <Method void a(StreamSense)>
	//   19   41:putfield        #55  <Field Runnable i>
			a.getTaskExecutor().execute(i, y);
	//   20   44:aload_0         
	//   21   45:getfield        #74  <Field Core a>
	//   22   48:invokevirtual   #341 <Method TaskExecutor Core.getTaskExecutor()>
	//   23   51:aload_0         
	//   24   52:getfield        #55  <Field Runnable i>
	//   25   55:aload_0         
	//   26   56:getfield        #108 <Field int y>
	//   27   59:i2l             
	//   28   60:invokevirtual   #347 <Method boolean TaskExecutor.execute(Runnable, long)>
	//   29   63:pop             
		}
	//   30   64:return          
	}

	private void c(StreamSenseState streamsensestate, HashMap hashmap)
	{
		if(!a.isEnabled())
	//*   0    0:aload_0         
	//*   1    1:getfield        #74  <Field Core a>
	//*   2    4:invokevirtual   #184 <Method boolean Core.isEnabled()>
	//*   3    7:ifne            11
			return;
	//    4   10:return          
		StringBuilder stringbuilder = new StringBuilder();
	//    5   11:new             #186 <Class StringBuilder>
	//    6   14:dup             
	//    7   15:invokespecial   #187 <Method void StringBuilder()>
	//    8   18:astore          5
		stringbuilder.append("onEnter(");
	//    9   20:aload           5
	//   10   22:ldc2            #417 <String "onEnter(">
	//   11   25:invokevirtual   #193 <Method StringBuilder StringBuilder.append(String)>
	//   12   28:pop             
		stringbuilder.append(((Object) (streamsensestate)));
	//   13   29:aload           5
	//   14   31:aload_1         
	//   15   32:invokevirtual   #196 <Method StringBuilder StringBuilder.append(Object)>
	//   16   35:pop             
		stringbuilder.append(", ");
	//   17   36:aload           5
	//   18   38:ldc2            #285 <String ", ">
	//   19   41:invokevirtual   #193 <Method StringBuilder StringBuilder.append(String)>
	//   20   44:pop             
		stringbuilder.append(((Object) (hashmap)));
	//   21   45:aload           5
	//   22   47:aload_2         
	//   23   48:invokevirtual   #196 <Method StringBuilder StringBuilder.append(Object)>
	//   24   51:pop             
		stringbuilder.append(")");
	//   25   52:aload           5
	//   26   54:ldc1            #198 <String ")">
	//   27   56:invokevirtual   #193 <Method StringBuilder StringBuilder.append(String)>
	//   28   59:pop             
		CSLog.d(((Object) (this)), stringbuilder.toString());
	//   29   60:aload_0         
	//   30   61:aload           5
	//   31   63:invokevirtual   #202 <Method String StringBuilder.toString()>
	//   32   66:invokestatic    #66  <Method void CSLog.d(Object, String)>
		long l1 = f(hashmap);
	//   33   69:aload_0         
	//   34   70:aload_2         
	//   35   71:invokespecial   #299 <Method long f(HashMap)>
	//   36   74:lstore_3        
		e = e(hashmap);
	//   37   75:aload_0         
	//   38   76:aload_0         
	//   39   77:aload_2         
	//   40   78:invokespecial   #419 <Method long e(HashMap)>
	//   41   81:putfield        #103 <Field long e>
		if(streamsensestate == StreamSenseState.PLAYING)
	//*  42   84:aload_1         
	//*  43   85:getstatic       #163 <Field StreamSenseState StreamSenseState.PLAYING>
	//*  44   88:if_acmpne       148
		{
			d();
	//   45   91:aload_0         
	//   46   92:invokespecial   #421 <Method void d()>
			g();
	//   47   95:aload_0         
	//   48   96:invokespecial   #423 <Method void g()>
			h.getClip().c(l1);
	//   49   99:aload_0         
	//   50  100:getfield        #53  <Field StreamSensePlaylist h>
	//   51  103:invokevirtual   #242 <Method StreamSenseClip StreamSensePlaylist.getClip()>
	//   52  106:lload_3         
	//   53  107:invokevirtual   #425 <Method void StreamSenseClip.c(long)>
			if(b(streamsensestate))
	//*  54  110:aload_0         
	//*  55  111:aload_1         
	//*  56  112:invokespecial   #326 <Method boolean b(StreamSenseState)>
	//*  57  115:ifeq            212
			{
				h.getClip().d();
	//   58  118:aload_0         
	//   59  119:getfield        #53  <Field StreamSensePlaylist h>
	//   60  122:invokevirtual   #242 <Method StreamSenseClip StreamSensePlaylist.getClip()>
	//   61  125:invokevirtual   #426 <Method void StreamSenseClip.d()>
				if(h.a() < 1)
	//*  62  128:aload_0         
	//*  63  129:getfield        #53  <Field StreamSensePlaylist h>
	//*  64  132:invokevirtual   #429 <Method int StreamSensePlaylist.a()>
	//*  65  135:iconst_1        
	//*  66  136:icmpge          212
				{
					h.a(1);
	//   67  139:aload_0         
	//   68  140:getfield        #53  <Field StreamSensePlaylist h>
	//   69  143:iconst_1        
	//   70  144:invokevirtual   #432 <Method void StreamSensePlaylist.a(int)>
					return;
	//   71  147:return          
				}
			}
		} else
		if(streamsensestate == StreamSenseState.PAUSED)
	//*  72  148:aload_1         
	//*  73  149:getstatic       #169 <Field StreamSenseState StreamSenseState.PAUSED>
	//*  74  152:if_acmpne       171
		{
			if(b(streamsensestate))
	//*  75  155:aload_0         
	//*  76  156:aload_1         
	//*  77  157:invokespecial   #326 <Method boolean b(StreamSenseState)>
	//*  78  160:ifeq            212
			{
				h.f();
	//   79  163:aload_0         
	//   80  164:getfield        #53  <Field StreamSensePlaylist h>
	//   81  167:invokevirtual   #433 <Method void StreamSensePlaylist.f()>
				return;
	//   82  170:return          
			}
		} else
		if(streamsensestate == StreamSenseState.BUFFERING)
	//*  83  171:aload_1         
	//*  84  172:getstatic       #175 <Field StreamSenseState StreamSenseState.BUFFERING>
	//*  85  175:if_acmpne       201
		{
			h.getClip().d(l1);
	//   86  178:aload_0         
	//   87  179:getfield        #53  <Field StreamSensePlaylist h>
	//   88  182:invokevirtual   #242 <Method StreamSenseClip StreamSensePlaylist.getClip()>
	//   89  185:lload_3         
	//   90  186:invokevirtual   #435 <Method void StreamSenseClip.d(long)>
			if(j)
	//*  91  189:aload_0         
	//*  92  190:getfield        #57  <Field boolean j>
	//*  93  193:ifeq            212
			{
				c();
	//   94  196:aload_0         
	//   95  197:invokespecial   #437 <Method void c()>
				return;
	//   96  200:return          
			}
		} else
		if(streamsensestate == StreamSenseState.IDLE)
	//*  97  201:aload_1         
	//*  98  202:getstatic       #86  <Field StreamSenseState StreamSenseState.IDLE>
	//*  99  205:if_acmpne       212
			f();
	//  100  208:aload_0         
	//  101  209:invokespecial   #95  <Method void f()>
	//  102  212:return          
	}

	private void c(HashMap hashmap)
	{
		String s1;
		if(!a.isEnabled())
	//*   0    0:aload_0         
	//*   1    1:getfield        #74  <Field Core a>
	//*   2    4:invokevirtual   #184 <Method boolean Core.isEnabled()>
	//*   3    7:ifne            11
			return;
	//    4   10:return          
		s1 = (String)hashmap.get("ns_st_mp");
	//    5   11:aload_1         
	//    6   12:ldc1            #247 <String "ns_st_mp">
	//    7   14:invokevirtual   #145 <Method Object HashMap.get(Object)>
	//    8   17:checkcast       #219 <Class String>
	//    9   20:astore_2        
		if(s1 != null)
	//*  10   21:aload_2         
	//*  11   22:ifnull          37
		{
			s = s1;
	//   12   25:aload_0         
	//   13   26:aload_2         
	//   14   27:putfield        #249 <Field String s>
			hashmap.remove("ns_st_mp");
	//   15   30:aload_1         
	//   16   31:ldc1            #247 <String "ns_st_mp">
	//   17   33:invokevirtual   #442 <Method Object HashMap.remove(Object)>
	//   18   36:pop             
		}
		s1 = (String)hashmap.get("ns_st_mv");
	//   19   37:aload_1         
	//   20   38:ldc1            #251 <String "ns_st_mv">
	//   21   40:invokevirtual   #145 <Method Object HashMap.get(Object)>
	//   22   43:checkcast       #219 <Class String>
	//   23   46:astore_2        
		if(s1 != null)
	//*  24   47:aload_2         
	//*  25   48:ifnull          63
		{
			t = s1;
	//   26   51:aload_0         
	//   27   52:aload_2         
	//   28   53:putfield        #253 <Field String t>
			hashmap.remove("ns_st_mv");
	//   29   56:aload_1         
	//   30   57:ldc1            #251 <String "ns_st_mv">
	//   31   59:invokevirtual   #442 <Method Object HashMap.remove(Object)>
	//   32   62:pop             
		}
		s1 = (String)hashmap.get("ns_st_ec");
	//   33   63:aload_1         
	//   34   64:ldc2            #367 <String "ns_st_ec">
	//   35   67:invokevirtual   #145 <Method Object HashMap.get(Object)>
	//   36   70:checkcast       #219 <Class String>
	//   37   73:astore_2        
		if(s1 == null)
			break MISSING_BLOCK_LABEL_94;
	//   38   74:aload_2         
	//   39   75:ifnull          94
		g = Integer.parseInt(s1);
	//   40   78:aload_0         
	//   41   79:aload_2         
	//   42   80:invokestatic    #448 <Method int Integer.parseInt(String)>
	//   43   83:putfield        #81  <Field int g>
		hashmap.remove("ns_st_ec");
	//   44   86:aload_1         
	//   45   87:ldc2            #367 <String "ns_st_ec">
	//   46   90:invokevirtual   #442 <Method Object HashMap.remove(Object)>
	//   47   93:pop             
		return;
	//   48   94:return          
		hashmap;
	//   49   95:astore_1        
	//   50   96:return          
	}

	private boolean c(StreamSenseState streamsensestate)
	{
		return streamsensestate != null && getState() != streamsensestate;
	//    0    0:aload_1         
	//    1    1:ifnull          14
	//    2    4:aload_0         
	//    3    5:invokevirtual   #294 <Method StreamSenseState getState()>
	//    4    8:aload_1         
	//    5    9:if_acmpeq       14
	//    6   12:iconst_1        
	//    7   13:ireturn         
	//    8   14:iconst_0        
	//    9   15:ireturn         
	}

	private void d()
	{
		if(!a.isEnabled())
	//*   0    0:aload_0         
	//*   1    1:getfield        #74  <Field Core a>
	//*   2    4:invokevirtual   #184 <Method boolean Core.isEnabled()>
	//*   3    7:ifne            11
			return;
	//    4   10:return          
		i();
	//    5   11:aload_0         
	//    6   12:invokespecial   #450 <Method void i()>
		if(w != null)
	//*   7   15:aload_0         
	//*   8   16:getfield        #118 <Field List w>
	//*   9   19:ifnull          155
		{
			long l1;
			StringBuilder stringbuilder;
			String s1;
			if(n >= 0L)
	//*  10   22:aload_0         
	//*  11   23:getfield        #452 <Field long n>
	//*  12   26:lconst_0        
	//*  13   27:lcmp            
	//*  14   28:iflt            81
			{
				l1 = n;
	//   15   31:aload_0         
	//   16   32:getfield        #452 <Field long n>
	//   17   35:lstore_1        
				stringbuilder = new StringBuilder();
	//   18   36:new             #186 <Class StringBuilder>
	//   19   39:dup             
	//   20   40:invokespecial   #187 <Method void StringBuilder()>
	//   21   43:astore_3        
				s1 = "Resuming heart beat timer. Next event in ";
	//   22   44:ldc2            #454 <String "Resuming heart beat timer. Next event in ">
	//   23   47:astore          4
			} else
	//*  24   49:aload_3         
	//*  25   50:aload           4
	//*  26   52:invokevirtual   #193 <Method StringBuilder StringBuilder.append(String)>
	//*  27   55:pop             
	//*  28   56:aload_3         
	//*  29   57:lload_1         
	//*  30   58:invokevirtual   #333 <Method StringBuilder StringBuilder.append(long)>
	//*  31   61:pop             
	//*  32   62:aload_3         
	//*  33   63:ldc2            #456 <String " ms">
	//*  34   66:invokevirtual   #193 <Method StringBuilder StringBuilder.append(String)>
	//*  35   69:pop             
	//*  36   70:aload_0         
	//*  37   71:aload_3         
	//*  38   72:invokevirtual   #202 <Method String StringBuilder.toString()>
	//*  39   75:invokestatic    #66  <Method void CSLog.d(Object, String)>
	//*  40   78:goto            112
			{
				l1 = a(h.getClip().f());
	//   41   81:aload_0         
	//   42   82:aload_0         
	//   43   83:getfield        #53  <Field StreamSensePlaylist h>
	//   44   86:invokevirtual   #242 <Method StreamSenseClip StreamSensePlaylist.getClip()>
	//   45   89:invokevirtual   #458 <Method long StreamSenseClip.f()>
	//   46   92:invokespecial   #460 <Method long a(long)>
	//   47   95:lstore_1        
				stringbuilder = new StringBuilder();
	//   48   96:new             #186 <Class StringBuilder>
	//   49   99:dup             
	//   50  100:invokespecial   #187 <Method void StringBuilder()>
	//   51  103:astore_3        
				s1 = "Starting heart beat timer. Next event in ";
	//   52  104:ldc2            #462 <String "Starting heart beat timer. Next event in ">
	//   53  107:astore          4
			}
			stringbuilder.append(s1);
			stringbuilder.append(l1);
			stringbuilder.append(" ms");
			CSLog.d(((Object) (this)), stringbuilder.toString());
	//*  54  109:goto            49
			if(l1 > 0L)
	//*  55  112:lload_1         
	//*  56  113:lconst_0        
	//*  57  114:lcmp            
	//*  58  115:ifle            155
			{
				p = System.currentTimeMillis() + l1;
	//   59  118:aload_0         
	//   60  119:invokestatic    #217 <Method long System.currentTimeMillis()>
	//   61  122:lload_1         
	//   62  123:ladd            
	//   63  124:putfield        #464 <Field long p>
				m = ((Runnable) (new b(this)));
	//   64  127:aload_0         
	//   65  128:new             #466 <Class b>
	//   66  131:dup             
	//   67  132:aload_0         
	//   68  133:invokespecial   #467 <Method void b(StreamSense)>
	//   69  136:putfield        #91  <Field Runnable m>
				a.getTaskExecutor().execute(m, l1);
	//   70  139:aload_0         
	//   71  140:getfield        #74  <Field Core a>
	//   72  143:invokevirtual   #341 <Method TaskExecutor Core.getTaskExecutor()>
	//   73  146:aload_0         
	//   74  147:getfield        #91  <Field Runnable m>
	//   75  150:lload_1         
	//   76  151:invokevirtual   #347 <Method boolean TaskExecutor.execute(Runnable, long)>
	//   77  154:pop             
			}
		}
	//   78  155:return          
	}

	private void d(StreamSenseState streamsensestate)
	{
		if(!a.isEnabled())
	//*   0    0:aload_0         
	//*   1    1:getfield        #74  <Field Core a>
	//*   2    4:invokevirtual   #184 <Method boolean Core.isEnabled()>
	//*   3    7:ifne            11
		{
			return;
	//    4   10:return          
		} else
		{
			f = streamsensestate;
	//    5   11:aload_0         
	//    6   12:aload_1         
	//    7   13:putfield        #51  <Field StreamSenseState f>
			d = System.currentTimeMillis();
	//    8   16:aload_0         
	//    9   17:invokestatic    #217 <Method long System.currentTimeMillis()>
	//   10   20:putfield        #296 <Field long d>
			return;
	//   11   23:return          
		}
	}

	private void d(HashMap hashmap)
	{
		if(!a.isEnabled())
	//*   0    0:aload_0         
	//*   1    1:getfield        #74  <Field Core a>
	//*   2    4:invokevirtual   #184 <Method boolean Core.isEnabled()>
	//*   3    7:ifne            11
		{
			return;
	//    4   10:return          
		} else
		{
			u = g(((HashMap) (null)));
	//    5   11:aload_0         
	//    6   12:aload_0         
	//    7   13:aconst_null     
	//    8   14:invokespecial   #470 <Method HashMap g(HashMap)>
	//    9   17:putfield        #472 <Field HashMap u>
			u.putAll(((java.util.Map) (hashmap)));
	//   10   20:aload_0         
	//   11   21:getfield        #472 <Field HashMap u>
	//   12   24:aload_1         
	//   13   25:invokevirtual   #206 <Method void HashMap.putAll(java.util.Map)>
			return;
	//   14   28:return          
		}
	}

	private long e(HashMap hashmap)
	{
		if(!hashmap.containsKey("ns_st_po"))
			break MISSING_BLOCK_LABEL_29;
	//    0    0:aload_1         
	//    1    1:ldc2            #372 <String "ns_st_po">
	//    2    4:invokevirtual   #212 <Method boolean HashMap.containsKey(Object)>
	//    3    7:ifeq            29
		long l1 = Long.valueOf((String)hashmap.get("ns_st_po")).longValue();
	//    4   10:aload_1         
	//    5   11:ldc2            #372 <String "ns_st_po">
	//    6   14:invokevirtual   #145 <Method Object HashMap.get(Object)>
	//    7   17:checkcast       #219 <Class String>
	//    8   20:invokestatic    #475 <Method Long Long.valueOf(String)>
	//    9   23:invokevirtual   #151 <Method long Long.longValue()>
	//   10   26:lstore_2        
		return l1;
	//   11   27:lload_2         
	//   12   28:lreturn         
_L2:
		return -1L;
	//   13   29:ldc2w           #476 <Long -1L>
	//   14   32:lreturn         
		hashmap;
	//   15   33:astore_1        
		if(true) goto _L2; else goto _L1
_L1:
	//*  16   34:goto            29
	}

	private void e()
	{
		if(!a.isEnabled())
	//*   0    0:aload_0         
	//*   1    1:getfield        #74  <Field Core a>
	//*   2    4:invokevirtual   #184 <Method boolean Core.isEnabled()>
	//*   3    7:ifne            11
		{
			return;
	//    4   10:return          
		} else
		{
			CSLog.d(((Object) (this)), "Pausing heartbeat timer.");
	//    5   11:aload_0         
	//    6   12:ldc2            #480 <String "Pausing heartbeat timer.">
	//    7   15:invokestatic    #66  <Method void CSLog.d(Object, String)>
			i();
	//    8   18:aload_0         
	//    9   19:invokespecial   #450 <Method void i()>
			n = p - System.currentTimeMillis();
	//   10   22:aload_0         
	//   11   23:aload_0         
	//   12   24:getfield        #464 <Field long p>
	//   13   27:invokestatic    #217 <Method long System.currentTimeMillis()>
	//   14   30:lsub            
	//   15   31:putfield        #452 <Field long n>
			p = -1L;
	//   16   34:aload_0         
	//   17   35:ldc2w           #476 <Long -1L>
	//   18   38:putfield        #464 <Field long p>
			return;
	//   19   41:return          
		}
	}

	private long f(HashMap hashmap)
	{
		if(!hashmap.containsKey("ns_ts"))
			break MISSING_BLOCK_LABEL_27;
	//    0    0:aload_1         
	//    1    1:ldc1            #208 <String "ns_ts">
	//    2    3:invokevirtual   #212 <Method boolean HashMap.containsKey(Object)>
	//    3    6:ifeq            27
		long l1 = Long.valueOf((String)hashmap.get("ns_ts")).longValue();
	//    4    9:aload_1         
	//    5   10:ldc1            #208 <String "ns_ts">
	//    6   12:invokevirtual   #145 <Method Object HashMap.get(Object)>
	//    7   15:checkcast       #219 <Class String>
	//    8   18:invokestatic    #475 <Method Long Long.valueOf(String)>
	//    9   21:invokevirtual   #151 <Method long Long.longValue()>
	//   10   24:lstore_2        
		return l1;
	//   11   25:lload_2         
	//   12   26:lreturn         
_L2:
		return -1L;
	//   13   27:ldc2w           #476 <Long -1L>
	//   14   30:lreturn         
		hashmap;
	//   15   31:astore_1        
		if(true) goto _L2; else goto _L1
_L1:
	//*  16   32:goto            27
	}

	private void f()
	{
		if(!a.isEnabled())
	//*   0    0:aload_0         
	//*   1    1:getfield        #74  <Field Core a>
	//*   2    4:invokevirtual   #184 <Method boolean Core.isEnabled()>
	//*   3    7:ifne            11
		{
			return;
	//    4   10:return          
		} else
		{
			CSLog.d(((Object) (this)), "Resetting heartbeat timer.");
	//    5   11:aload_0         
	//    6   12:ldc2            #482 <String "Resetting heartbeat timer.">
	//    7   15:invokestatic    #66  <Method void CSLog.d(Object, String)>
			n = -1L;
	//    8   18:aload_0         
	//    9   19:ldc2w           #476 <Long -1L>
	//   10   22:putfield        #452 <Field long n>
			p = -1L;
	//   11   25:aload_0         
	//   12   26:ldc2w           #476 <Long -1L>
	//   13   29:putfield        #464 <Field long p>
			o = 0;
	//   14   32:aload_0         
	//   15   33:iconst_0        
	//   16   34:putfield        #93  <Field int o>
			return;
	//   17   37:return          
		}
	}

	private HashMap g(HashMap hashmap)
	{
		return a(f.toEventType(), hashmap);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #51  <Field StreamSenseState f>
	//    3    5:invokevirtual   #323 <Method StreamSenseEventType StreamSenseState.toEventType()>
	//    4    8:aload_1         
	//    5    9:invokespecial   #324 <Method HashMap a(StreamSenseEventType, HashMap)>
	//    6   12:areturn         
	}

	private void g()
	{
		if(!a.isEnabled())
	//*   0    0:aload_0         
	//*   1    1:getfield        #74  <Field Core a>
	//*   2    4:invokevirtual   #184 <Method boolean Core.isEnabled()>
	//*   3    7:ifne            11
		{
			return;
	//    4   10:return          
		} else
		{
			CSLog.d(((Object) (this)), "Starting keep alive timer");
	//    5   11:aload_0         
	//    6   12:ldc2            #485 <String "Starting keep alive timer">
	//    7   15:invokestatic    #66  <Method void CSLog.d(Object, String)>
			h();
	//    8   18:aload_0         
	//    9   19:invokespecial   #394 <Method void h()>
			k = ((Runnable) (new c(this)));
	//   10   22:aload_0         
	//   11   23:new             #487 <Class c>
	//   12   26:dup             
	//   13   27:aload_0         
	//   14   28:invokespecial   #488 <Method void c(StreamSense)>
	//   15   31:putfield        #97  <Field Runnable k>
			a.getTaskExecutor().execute(k, x, true, x);
	//   16   34:aload_0         
	//   17   35:getfield        #74  <Field Core a>
	//   18   38:invokevirtual   #341 <Method TaskExecutor Core.getTaskExecutor()>
	//   19   41:aload_0         
	//   20   42:getfield        #97  <Field Runnable k>
	//   21   45:aload_0         
	//   22   46:getfield        #106 <Field int x>
	//   23   49:i2l             
	//   24   50:iconst_1        
	//   25   51:aload_0         
	//   26   52:getfield        #106 <Field int x>
	//   27   55:i2l             
	//   28   56:invokevirtual   #491 <Method boolean TaskExecutor.execute(Runnable, long, boolean, long)>
	//   29   59:pop             
			return;
	//   30   60:return          
		}
	}

	public static String getVersion()
	{
		return "4.1508.28";
	//    0    0:ldc2            #272 <String "4.1508.28">
	//    1    3:areturn         
	}

	private void h()
	{
		if(!a.isEnabled())
	//*   0    0:aload_0         
	//*   1    1:getfield        #74  <Field Core a>
	//*   2    4:invokevirtual   #184 <Method boolean Core.isEnabled()>
	//*   3    7:ifne            11
			return;
	//    4   10:return          
		CSLog.d(((Object) (this)), "stopKeepAliveTask()");
	//    5   11:aload_0         
	//    6   12:ldc2            #494 <String "stopKeepAliveTask()">
	//    7   15:invokestatic    #66  <Method void CSLog.d(Object, String)>
		if(k != null)
	//*   8   18:aload_0         
	//*   9   19:getfield        #97  <Field Runnable k>
	//*  10   22:ifnull          44
		{
			a.getTaskExecutor().removeEnqueuedTask(k);
	//   11   25:aload_0         
	//   12   26:getfield        #74  <Field Core a>
	//   13   29:invokevirtual   #341 <Method TaskExecutor Core.getTaskExecutor()>
	//   14   32:aload_0         
	//   15   33:getfield        #97  <Field Runnable k>
	//   16   36:invokevirtual   #498 <Method void TaskExecutor.removeEnqueuedTask(Runnable)>
			k = null;
	//   17   39:aload_0         
	//   18   40:aconst_null     
	//   19   41:putfield        #97  <Field Runnable k>
		}
	//   20   44:return          
	}

	private void i()
	{
		if(!a.isEnabled())
	//*   0    0:aload_0         
	//*   1    1:getfield        #74  <Field Core a>
	//*   2    4:invokevirtual   #184 <Method boolean Core.isEnabled()>
	//*   3    7:ifne            11
			return;
	//    4   10:return          
		CSLog.d(((Object) (this)), "releaseHeartBeatTask()");
	//    5   11:aload_0         
	//    6   12:ldc2            #500 <String "releaseHeartBeatTask()">
	//    7   15:invokestatic    #66  <Method void CSLog.d(Object, String)>
		if(m != null)
	//*   8   18:aload_0         
	//*   9   19:getfield        #91  <Field Runnable m>
	//*  10   22:ifnull          44
		{
			a.getTaskExecutor().removeEnqueuedTask(m);
	//   11   25:aload_0         
	//   12   26:getfield        #74  <Field Core a>
	//   13   29:invokevirtual   #341 <Method TaskExecutor Core.getTaskExecutor()>
	//   14   32:aload_0         
	//   15   33:getfield        #91  <Field Runnable m>
	//   16   36:invokevirtual   #498 <Method void TaskExecutor.removeEnqueuedTask(Runnable)>
			m = null;
	//   17   39:aload_0         
	//   18   40:aconst_null     
	//   19   41:putfield        #91  <Field Runnable m>
		}
	//   20   44:return          
	}

	private void j()
	{
		if(!a.isEnabled())
	//*   0    0:aload_0         
	//*   1    1:getfield        #74  <Field Core a>
	//*   2    4:invokevirtual   #184 <Method boolean Core.isEnabled()>
	//*   3    7:ifne            11
			return;
	//    4   10:return          
		CSLog.d(((Object) (this)), "Firing paused on buffering event");
	//    5   11:aload_0         
	//    6   12:ldc2            #502 <String "Firing paused on buffering event">
	//    7   15:invokestatic    #66  <Method void CSLog.d(Object, String)>
		if(r == StreamSenseState.PLAYING)
	//*   8   18:aload_0         
	//*   9   19:getfield        #101 <Field StreamSenseState r>
	//*  10   22:getstatic       #163 <Field StreamSenseState StreamSenseState.PLAYING>
	//*  11   25:if_acmpne       71
		{
			h.h();
	//   12   28:aload_0         
	//   13   29:getfield        #53  <Field StreamSensePlaylist h>
	//   14   32:invokevirtual   #503 <Method void StreamSensePlaylist.h()>
			h.f();
	//   15   35:aload_0         
	//   16   36:getfield        #53  <Field StreamSensePlaylist h>
	//   17   39:invokevirtual   #433 <Method void StreamSensePlaylist.f()>
			a(a(StreamSenseEventType.PAUSE, ((HashMap) (null))));
	//   18   42:aload_0         
	//   19   43:aload_0         
	//   20   44:getstatic       #166 <Field StreamSenseEventType StreamSenseEventType.PAUSE>
	//   21   47:aconst_null     
	//   22   48:invokespecial   #324 <Method HashMap a(StreamSenseEventType, HashMap)>
	//   23   51:invokevirtual   #328 <Method void a(HashMap)>
			g = g + 1;
	//   24   54:aload_0         
	//   25   55:aload_0         
	//   26   56:getfield        #81  <Field int g>
	//   27   59:iconst_1        
	//   28   60:iadd            
	//   29   61:putfield        #81  <Field int g>
			r = StreamSenseState.PAUSED;
	//   30   64:aload_0         
	//   31   65:getstatic       #169 <Field StreamSenseState StreamSenseState.PAUSED>
	//   32   68:putfield        #101 <Field StreamSenseState r>
		}
	//   33   71:return          
	}

	private void k()
	{
		if(!a.isEnabled())
	//*   0    0:aload_0         
	//*   1    1:getfield        #74  <Field Core a>
	//*   2    4:invokevirtual   #184 <Method boolean Core.isEnabled()>
	//*   3    7:ifne            11
			return;
	//    4   10:return          
		CSLog.d(((Object) (this)), "stopPausedOnBufferingTask()");
	//    5   11:aload_0         
	//    6   12:ldc2            #505 <String "stopPausedOnBufferingTask()">
	//    7   15:invokestatic    #66  <Method void CSLog.d(Object, String)>
		if(i != null)
	//*   8   18:aload_0         
	//*   9   19:getfield        #55  <Field Runnable i>
	//*  10   22:ifnull          44
		{
			a.getTaskExecutor().removeEnqueuedTask(i);
	//   11   25:aload_0         
	//   12   26:getfield        #74  <Field Core a>
	//   13   29:invokevirtual   #341 <Method TaskExecutor Core.getTaskExecutor()>
	//   14   32:aload_0         
	//   15   33:getfield        #55  <Field Runnable i>
	//   16   36:invokevirtual   #498 <Method void TaskExecutor.removeEnqueuedTask(Runnable)>
			i = null;
	//   17   39:aload_0         
	//   18   40:aconst_null     
	//   19   41:putfield        #55  <Field Runnable i>
		}
	//   20   44:return          
	}

	private void l()
	{
		if(!a.isEnabled())
	//*   0    0:aload_0         
	//*   1    1:getfield        #74  <Field Core a>
	//*   2    4:invokevirtual   #184 <Method boolean Core.isEnabled()>
	//*   3    7:ifne            11
			return;
	//    4   10:return          
		CSLog.d(((Object) (this)), "stopDelayedTransitionTask()");
	//    5   11:aload_0         
	//    6   12:ldc2            #507 <String "stopDelayedTransitionTask()">
	//    7   15:invokestatic    #66  <Method void CSLog.d(Object, String)>
		if(l != null)
	//*   8   18:aload_0         
	//*   9   19:getfield        #59  <Field f l>
	//*  10   22:ifnull          44
		{
			a.getTaskExecutor().removeEnqueuedTask(((Runnable) (l)));
	//   11   25:aload_0         
	//   12   26:getfield        #74  <Field Core a>
	//   13   29:invokevirtual   #341 <Method TaskExecutor Core.getTaskExecutor()>
	//   14   32:aload_0         
	//   15   33:getfield        #59  <Field f l>
	//   16   36:invokevirtual   #498 <Method void TaskExecutor.removeEnqueuedTask(Runnable)>
			l = null;
	//   17   39:aload_0         
	//   18   40:aconst_null     
	//   19   41:putfield        #59  <Field f l>
		}
	//   20   44:return          
	}

	private boolean m()
	{
		android.content.Context context = a.getAppContext();
	//    0    0:aload_0         
	//    1    1:getfield        #74  <Field Core a>
	//    2    4:invokevirtual   #511 <Method android.content.Context Core.getAppContext()>
	//    3    7:astore_1        
		String s1 = a.getPublisherSecret();
	//    4    8:aload_0         
	//    5    9:getfield        #74  <Field Core a>
	//    6   12:invokevirtual   #514 <Method String Core.getPublisherSecret()>
	//    7   15:astore_2        
		String s2 = a.getPixelURL();
	//    8   16:aload_0         
	//    9   17:getfield        #74  <Field Core a>
	//   10   20:invokevirtual   #517 <Method String Core.getPixelURL()>
	//   11   23:astore_3        
		return context == null || s1 == null || s1.length() == 0 || s2 == null || s2.length() == 0;
	//   12   24:aload_1         
	//   13   25:ifnull          55
	//   14   28:aload_2         
	//   15   29:ifnull          55
	//   16   32:aload_2         
	//   17   33:invokevirtual   #520 <Method int String.length()>
	//   18   36:ifeq            55
	//   19   39:aload_3         
	//   20   40:ifnull          55
	//   21   43:aload_3         
	//   22   44:invokevirtual   #520 <Method int String.length()>
	//   23   47:ifne            53
	//   24   50:goto            55
	//   25   53:iconst_0        
	//   26   54:ireturn         
	//   27   55:iconst_1        
	//   28   56:ireturn         
	}

	private List n()
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #110 <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #111 <Method void ArrayList()>
	//    3    7:astore_1        
		HashMap hashmap = new HashMap();
	//    4    8:new             #76  <Class HashMap>
	//    5   11:dup             
	//    6   12:invokespecial   #77  <Method void HashMap()>
	//    7   15:astore_2        
		hashmap.put("playingtime", ((Object) (Long.valueOf(60000L))));
	//    8   16:aload_2         
	//    9   17:ldc1            #141 <String "playingtime">
	//   10   19:ldc2w           #521 <Long 60000L>
	//   11   22:invokestatic    #525 <Method Long Long.valueOf(long)>
	//   12   25:invokevirtual   #227 <Method Object HashMap.put(Object, Object)>
	//   13   28:pop             
		hashmap.put("interval", ((Object) (Long.valueOf(10000L))));
	//   14   29:aload_2         
	//   15   30:ldc1            #153 <String "interval">
	//   16   32:ldc2w           #526 <Long 10000L>
	//   17   35:invokestatic    #525 <Method Long Long.valueOf(long)>
	//   18   38:invokevirtual   #227 <Method Object HashMap.put(Object, Object)>
	//   19   41:pop             
		((List) (arraylist)).add(((Object) (hashmap)));
	//   20   42:aload_1         
	//   21   43:aload_2         
	//   22   44:invokeinterface #530 <Method boolean List.add(Object)>
	//   23   49:pop             
		hashmap = new HashMap();
	//   24   50:new             #76  <Class HashMap>
	//   25   53:dup             
	//   26   54:invokespecial   #77  <Method void HashMap()>
	//   27   57:astore_2        
		hashmap.put("playingtime", ((Object) (null)));
	//   28   58:aload_2         
	//   29   59:ldc1            #141 <String "playingtime">
	//   30   61:aconst_null     
	//   31   62:invokevirtual   #227 <Method Object HashMap.put(Object, Object)>
	//   32   65:pop             
		hashmap.put("interval", ((Object) (Long.valueOf(60000L))));
	//   33   66:aload_2         
	//   34   67:ldc1            #153 <String "interval">
	//   35   69:ldc2w           #521 <Long 60000L>
	//   36   72:invokestatic    #525 <Method Long Long.valueOf(long)>
	//   37   75:invokevirtual   #227 <Method Object HashMap.put(Object, Object)>
	//   38   78:pop             
		((List) (arraylist)).add(((Object) (hashmap)));
	//   39   79:aload_1         
	//   40   80:aload_2         
	//   41   81:invokeinterface #530 <Method boolean List.add(Object)>
	//   42   86:pop             
		return ((List) (arraylist));
	//   43   87:aload_1         
	//   44   88:areturn         
	}

	protected void a()
	{
		if(!a.isEnabled())
	//*   0    0:aload_0         
	//*   1    1:getfield        #74  <Field Core a>
	//*   2    4:invokevirtual   #184 <Method boolean Core.isEnabled()>
	//*   3    7:ifne            11
		{
			return;
	//    4   10:return          
		} else
		{
			CSLog.d(((Object) (this)), "Firing heart beat");
	//    5   11:aload_0         
	//    6   12:ldc2            #533 <String "Firing heart beat">
	//    7   15:invokestatic    #66  <Method void CSLog.d(Object, String)>
			o = o + 1;
	//    8   18:aload_0         
	//    9   19:aload_0         
	//   10   20:getfield        #93  <Field int o>
	//   11   23:iconst_1        
	//   12   24:iadd            
	//   13   25:putfield        #93  <Field int o>
			a(a(StreamSenseEventType.HEART_BEAT, ((HashMap) (null))));
	//   14   28:aload_0         
	//   15   29:aload_0         
	//   16   30:getstatic       #378 <Field StreamSenseEventType StreamSenseEventType.HEART_BEAT>
	//   17   33:aconst_null     
	//   18   34:invokespecial   #324 <Method HashMap a(StreamSenseEventType, HashMap)>
	//   19   37:invokevirtual   #328 <Method void a(HashMap)>
			n = -1L;
	//   20   40:aload_0         
	//   21   41:ldc2w           #476 <Long -1L>
	//   22   44:putfield        #452 <Field long n>
			d();
	//   23   47:aload_0         
	//   24   48:invokespecial   #421 <Method void d()>
			return;
	//   25   51:return          
		}
	}

	protected void a(HashMap hashmap)
	{
		a(hashmap, true);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_1        
	//    3    3:invokevirtual   #536 <Method void a(HashMap, boolean)>
	//    4    6:return          
	}

	protected void a(HashMap hashmap, boolean flag)
	{
		if(!a.isEnabled())
	//*   0    0:aload_0         
	//*   1    1:getfield        #74  <Field Core a>
	//*   2    4:invokevirtual   #184 <Method boolean Core.isEnabled()>
	//*   3    7:ifne            11
			return;
	//    4   10:return          
		StringBuilder stringbuilder = new StringBuilder();
	//    5   11:new             #186 <Class StringBuilder>
	//    6   14:dup             
	//    7   15:invokespecial   #187 <Method void StringBuilder()>
	//    8   18:astore_3        
		stringbuilder.append("dispatch(");
	//    9   19:aload_3         
	//   10   20:ldc2            #538 <String "dispatch(">
	//   11   23:invokevirtual   #193 <Method StringBuilder StringBuilder.append(String)>
	//   12   26:pop             
		stringbuilder.append(((Object) (hashmap)));
	//   13   27:aload_3         
	//   14   28:aload_1         
	//   15   29:invokevirtual   #196 <Method StringBuilder StringBuilder.append(Object)>
	//   16   32:pop             
		stringbuilder.append(", ");
	//   17   33:aload_3         
	//   18   34:ldc2            #285 <String ", ">
	//   19   37:invokevirtual   #193 <Method StringBuilder StringBuilder.append(String)>
	//   20   40:pop             
		stringbuilder.append(flag);
	//   21   41:aload_3         
	//   22   42:iload_2         
	//   23   43:invokevirtual   #541 <Method StringBuilder StringBuilder.append(boolean)>
	//   24   46:pop             
		stringbuilder.append(")");
	//   25   47:aload_3         
	//   26   48:ldc1            #198 <String ")">
	//   27   50:invokevirtual   #193 <Method StringBuilder StringBuilder.append(String)>
	//   28   53:pop             
		CSLog.d(((Object) (this)), stringbuilder.toString());
	//   29   54:aload_0         
	//   30   55:aload_3         
	//   31   56:invokevirtual   #202 <Method String StringBuilder.toString()>
	//   32   59:invokestatic    #66  <Method void CSLog.d(Object, String)>
		if(flag)
	//*  33   62:iload_2         
	//*  34   63:ifeq            71
			d(hashmap);
	//   35   66:aload_0         
	//   36   67:aload_1         
	//   37   68:invokespecial   #543 <Method void d(HashMap)>
		if(!m())
	//*  38   71:aload_0         
	//*  39   72:invokespecial   #545 <Method boolean m()>
	//*  40   75:ifne            105
		{
			String s1 = c;
	//   41   78:aload_0         
	//   42   79:getfield        #49  <Field String c>
	//   43   82:astore_3        
			a.getTaskExecutor().execute(((Runnable) (new e(this, hashmap, s1))), true);
	//   44   83:aload_0         
	//   45   84:getfield        #74  <Field Core a>
	//   46   87:invokevirtual   #341 <Method TaskExecutor Core.getTaskExecutor()>
	//   47   90:new             #547 <Class e>
	//   48   93:dup             
	//   49   94:aload_0         
	//   50   95:aload_1         
	//   51   96:aload_3         
	//   52   97:invokespecial   #550 <Method void e(StreamSense, HashMap, String)>
	//   53  100:iconst_1        
	//   54  101:invokevirtual   #553 <Method boolean TaskExecutor.execute(Runnable, boolean)>
	//   55  104:pop             
		}
	//   56  105:return          
	}

	public void addListener(StreamSenseListener streamsenselistener)
	{
		if(!a.isEnabled())
	//*   0    0:aload_0         
	//*   1    1:getfield        #74  <Field Core a>
	//*   2    4:invokevirtual   #184 <Method boolean Core.isEnabled()>
	//*   3    7:ifne            11
		{
			return;
	//    4   10:return          
		} else
		{
			v.add(((Object) (streamsenselistener)));
	//    5   11:aload_0         
	//    6   12:getfield        #113 <Field List v>
	//    7   15:aload_1         
	//    8   16:invokeinterface #530 <Method boolean List.add(Object)>
	//    9   21:pop             
			return;
	//   10   22:return          
		}
	}

	protected void b()
	{
		if(!a.isEnabled())
	//*   0    0:aload_0         
	//*   1    1:getfield        #74  <Field Core a>
	//*   2    4:invokevirtual   #184 <Method boolean Core.isEnabled()>
	//*   3    7:ifne            11
		{
			return;
	//    4   10:return          
		} else
		{
			CSLog.d(((Object) (this)), "Firing keep alive");
	//    5   11:aload_0         
	//    6   12:ldc2            #558 <String "Firing keep alive">
	//    7   15:invokestatic    #66  <Method void CSLog.d(Object, String)>
			a(a(StreamSenseEventType.KEEP_ALIVE, ((HashMap) (null))));
	//    8   18:aload_0         
	//    9   19:aload_0         
	//   10   20:getstatic       #375 <Field StreamSenseEventType StreamSenseEventType.KEEP_ALIVE>
	//   11   23:aconst_null     
	//   12   24:invokespecial   #324 <Method HashMap a(StreamSenseEventType, HashMap)>
	//   13   27:invokevirtual   #328 <Method void a(HashMap)>
			g = g + 1;
	//   14   30:aload_0         
	//   15   31:aload_0         
	//   16   32:getfield        #81  <Field int g>
	//   17   35:iconst_1        
	//   18   36:iadd            
	//   19   37:putfield        #81  <Field int g>
			return;
	//   20   40:return          
		}
	}

	public void engageTo(StreamSenseMediaPlayer streamsensemediaplayer)
	{
		streamsensemediaplayer.setStreamSense(this);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #563 <Method void StreamSenseMediaPlayer.setStreamSense(StreamSense)>
	//    3    5:return          
	}

	public void engageTo(StreamSenseVideoView streamsensevideoview)
	{
		streamsensevideoview.setStreamSense(this);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #566 <Method void StreamSenseVideoView.setStreamSense(StreamSense)>
	//    3    5:return          
	}

	public HashMap exportState()
	{
		return u;
	//    0    0:aload_0         
	//    1    1:getfield        #472 <Field HashMap u>
	//    2    4:areturn         
	}

	public StreamSenseClip getClip()
	{
		return h.getClip();
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field StreamSensePlaylist h>
	//    2    4:invokevirtual   #242 <Method StreamSenseClip StreamSensePlaylist.getClip()>
	//    3    7:areturn         
	}

	public int getKeepAliveInterval()
	{
		return x;
	//    0    0:aload_0         
	//    1    1:getfield        #106 <Field int x>
	//    2    4:ireturn         
	}

	public String getLabel(String s1)
	{
		return (String)b.get(((Object) (s1)));
	//    0    0:aload_0         
	//    1    1:getfield        #79  <Field HashMap b>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #145 <Method Object HashMap.get(Object)>
	//    4    8:checkcast       #219 <Class String>
	//    5   11:areturn         
	}

	public HashMap getLabels()
	{
		return b;
	//    0    0:aload_0         
	//    1    1:getfield        #79  <Field HashMap b>
	//    2    4:areturn         
	}

	public int getPauseOnBufferingInterval()
	{
		return y;
	//    0    0:aload_0         
	//    1    1:getfield        #108 <Field int y>
	//    2    4:ireturn         
	}

	public String getPixelURL()
	{
		return c;
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field String c>
	//    2    4:areturn         
	}

	public StreamSensePlaylist getPlaylist()
	{
		return h;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field StreamSensePlaylist h>
	//    2    4:areturn         
	}

	public StreamSenseState getState()
	{
		return f;
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field StreamSenseState f>
	//    2    4:areturn         
	}

	public void importState(HashMap hashmap)
	{
		if(!a.isEnabled())
	//*   0    0:aload_0         
	//*   1    1:getfield        #74  <Field Core a>
	//*   2    4:invokevirtual   #184 <Method boolean Core.isEnabled()>
	//*   3    7:ifne            11
		{
			return;
	//    4   10:return          
		} else
		{
			reset();
	//    5   11:aload_0         
	//    6   12:invokevirtual   #121 <Method void reset()>
			hashmap = Utils.mapOfStrings(((java.util.Map) (hashmap)));
	//    7   15:aload_1         
	//    8   16:invokestatic    #581 <Method HashMap Utils.mapOfStrings(java.util.Map)>
	//    9   19:astore_1        
			h.b(hashmap, ((StreamSenseState) (null)));
	//   10   20:aload_0         
	//   11   21:getfield        #53  <Field StreamSensePlaylist h>
	//   12   24:aload_1         
	//   13   25:aconst_null     
	//   14   26:invokevirtual   #318 <Method void StreamSensePlaylist.b(HashMap, StreamSenseState)>
			h.getClip().b(hashmap, ((StreamSenseState) (null)));
	//   15   29:aload_0         
	//   16   30:getfield        #53  <Field StreamSensePlaylist h>
	//   17   33:invokevirtual   #242 <Method StreamSenseClip StreamSensePlaylist.getClip()>
	//   18   36:aload_1         
	//   19   37:aconst_null     
	//   20   38:invokevirtual   #319 <Method void StreamSenseClip.b(HashMap, StreamSenseState)>
			c(hashmap);
	//   21   41:aload_0         
	//   22   42:aload_1         
	//   23   43:invokespecial   #315 <Method void c(HashMap)>
			g = g + 1;
	//   24   46:aload_0         
	//   25   47:aload_0         
	//   26   48:getfield        #81  <Field int g>
	//   27   51:iconst_1        
	//   28   52:iadd            
	//   29   53:putfield        #81  <Field int g>
			return;
	//   30   56:return          
		}
	}

	public boolean isPauseOnBufferingEnabled()
	{
		return j;
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field boolean j>
	//    2    4:ireturn         
	}

	public boolean isPausePlaySwitchDelayEnabled()
	{
		return q;
	//    0    0:aload_0         
	//    1    1:getfield        #99  <Field boolean q>
	//    2    4:ireturn         
	}

	public void notify(StreamSenseEventType streamsenseeventtype, long l1)
	{
		notify(streamsenseeventtype, new HashMap(), l1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:new             #76  <Class HashMap>
	//    3    5:dup             
	//    4    6:invokespecial   #77  <Method void HashMap()>
	//    5    9:lload_2         
	//    6   10:invokevirtual   #587 <Method void notify(StreamSenseEventType, HashMap, long)>
	//    7   13:return          
	}

	public void notify(StreamSenseEventType streamsenseeventtype, HashMap hashmap, long l1)
	{
		if(!a.isEnabled())
	//*   0    0:aload_0         
	//*   1    1:getfield        #74  <Field Core a>
	//*   2    4:invokevirtual   #184 <Method boolean Core.isEnabled()>
	//*   3    7:ifne            11
			return;
	//    4   10:return          
		Object obj = ((Object) (new StringBuilder()));
	//    5   11:new             #186 <Class StringBuilder>
	//    6   14:dup             
	//    7   15:invokespecial   #187 <Method void StringBuilder()>
	//    8   18:astore          5
		((StringBuilder) (obj)).append("notify(");
	//    9   20:aload           5
	//   10   22:ldc2            #589 <String "notify(">
	//   11   25:invokevirtual   #193 <Method StringBuilder StringBuilder.append(String)>
	//   12   28:pop             
		((StringBuilder) (obj)).append(((Object) (streamsenseeventtype)));
	//   13   29:aload           5
	//   14   31:aload_1         
	//   15   32:invokevirtual   #196 <Method StringBuilder StringBuilder.append(Object)>
	//   16   35:pop             
		((StringBuilder) (obj)).append(", ");
	//   17   36:aload           5
	//   18   38:ldc2            #285 <String ", ">
	//   19   41:invokevirtual   #193 <Method StringBuilder StringBuilder.append(String)>
	//   20   44:pop             
		((StringBuilder) (obj)).append(((Object) (hashmap)));
	//   21   45:aload           5
	//   22   47:aload_2         
	//   23   48:invokevirtual   #196 <Method StringBuilder StringBuilder.append(Object)>
	//   24   51:pop             
		((StringBuilder) (obj)).append(")");
	//   25   52:aload           5
	//   26   54:ldc1            #198 <String ")">
	//   27   56:invokevirtual   #193 <Method StringBuilder StringBuilder.append(String)>
	//   28   59:pop             
		CSLog.d(((Object) (this)), ((StringBuilder) (obj)).toString());
	//   29   60:aload_0         
	//   30   61:aload           5
	//   31   63:invokevirtual   #202 <Method String StringBuilder.toString()>
	//   32   66:invokestatic    #66  <Method void CSLog.d(Object, String)>
		obj = ((Object) (a(streamsenseeventtype)));
	//   33   69:aload_0         
	//   34   70:aload_1         
	//   35   71:invokespecial   #591 <Method StreamSenseState a(StreamSenseEventType)>
	//   36   74:astore          5
		hashmap = Utils.mapOfStrings(((java.util.Map) (hashmap)));
	//   37   76:aload_2         
	//   38   77:invokestatic    #581 <Method HashMap Utils.mapOfStrings(java.util.Map)>
	//   39   80:astore_2        
		b(hashmap);
	//   40   81:aload_0         
	//   41   82:aload_2         
	//   42   83:invokespecial   #593 <Method void b(HashMap)>
		if(!hashmap.containsKey("ns_st_po"))
	//*  43   86:aload_2         
	//*  44   87:ldc2            #372 <String "ns_st_po">
	//*  45   90:invokevirtual   #212 <Method boolean HashMap.containsKey(Object)>
	//*  46   93:ifne            108
			hashmap.put("ns_st_po", ((Object) (String.valueOf(l1))));
	//   47   96:aload_2         
	//   48   97:ldc2            #372 <String "ns_st_po">
	//   49  100:lload_3         
	//   50  101:invokestatic    #223 <Method String String.valueOf(long)>
	//   51  104:invokevirtual   #227 <Method Object HashMap.put(Object, Object)>
	//   52  107:pop             
		if(streamsenseeventtype != StreamSenseEventType.PLAY && streamsenseeventtype != StreamSenseEventType.PAUSE && streamsenseeventtype != StreamSenseEventType.BUFFER && streamsenseeventtype != StreamSenseEventType.END)
	//*  53  108:aload_1         
	//*  54  109:getstatic       #160 <Field StreamSenseEventType StreamSenseEventType.PLAY>
	//*  55  112:if_acmpeq       168
	//*  56  115:aload_1         
	//*  57  116:getstatic       #166 <Field StreamSenseEventType StreamSenseEventType.PAUSE>
	//*  58  119:if_acmpeq       168
	//*  59  122:aload_1         
	//*  60  123:getstatic       #172 <Field StreamSenseEventType StreamSenseEventType.BUFFER>
	//*  61  126:if_acmpeq       168
	//*  62  129:aload_1         
	//*  63  130:getstatic       #178 <Field StreamSenseEventType StreamSenseEventType.END>
	//*  64  133:if_acmpne       139
	//*  65  136:goto            168
		{
			streamsenseeventtype = ((StreamSenseEventType) (a(streamsenseeventtype, hashmap)));
	//   66  139:aload_0         
	//   67  140:aload_1         
	//   68  141:aload_2         
	//   69  142:invokespecial   #324 <Method HashMap a(StreamSenseEventType, HashMap)>
	//   70  145:astore_1        
			((HashMap) (streamsenseeventtype)).putAll(((java.util.Map) (hashmap)));
	//   71  146:aload_1         
	//   72  147:aload_2         
	//   73  148:invokevirtual   #206 <Method void HashMap.putAll(java.util.Map)>
			a(((HashMap) (streamsenseeventtype)), false);
	//   74  151:aload_0         
	//   75  152:aload_1         
	//   76  153:iconst_0        
	//   77  154:invokevirtual   #536 <Method void a(HashMap, boolean)>
			g = g + 1;
	//   78  157:aload_0         
	//   79  158:aload_0         
	//   80  159:getfield        #81  <Field int g>
	//   81  162:iconst_1        
	//   82  163:iadd            
	//   83  164:putfield        #81  <Field int g>
			return;
	//   84  167:return          
		}
		if(isPausePlaySwitchDelayEnabled() && a(f) && a(((StreamSenseState) (obj))) && (f != StreamSenseState.PLAYING || obj != StreamSenseState.PAUSED || l != null))
	//*  85  168:aload_0         
	//*  86  169:invokevirtual   #595 <Method boolean isPausePlaySwitchDelayEnabled()>
	//*  87  172:ifeq            231
	//*  88  175:aload_0         
	//*  89  176:aload_0         
	//*  90  177:getfield        #51  <Field StreamSenseState f>
	//*  91  180:invokespecial   #597 <Method boolean a(StreamSenseState)>
	//*  92  183:ifeq            231
	//*  93  186:aload_0         
	//*  94  187:aload           5
	//*  95  189:invokespecial   #597 <Method boolean a(StreamSenseState)>
	//*  96  192:ifeq            231
	//*  97  195:aload_0         
	//*  98  196:getfield        #51  <Field StreamSenseState f>
	//*  99  199:getstatic       #163 <Field StreamSenseState StreamSenseState.PLAYING>
	//* 100  202:if_acmpne       220
	//* 101  205:aload           5
	//* 102  207:getstatic       #169 <Field StreamSenseState StreamSenseState.PAUSED>
	//* 103  210:if_acmpne       220
	//* 104  213:aload_0         
	//* 105  214:getfield        #59  <Field f l>
	//* 106  217:ifnull          231
		{
			a(((StreamSenseState) (obj)), hashmap, 500L);
	//  107  220:aload_0         
	//  108  221:aload           5
	//  109  223:aload_2         
	//  110  224:ldc2w           #598 <Long 500L>
	//  111  227:invokespecial   #601 <Method void a(StreamSenseState, HashMap, long)>
			return;
	//  112  230:return          
		} else
		{
			a(((StreamSenseState) (obj)), hashmap);
	//  113  231:aload_0         
	//  114  232:aload           5
	//  115  234:aload_2         
	//  116  235:invokespecial   #281 <Method void a(StreamSenseState, HashMap)>
			return;
	//  117  238:return          
		}
	}

	public void removeListener(StreamSenseListener streamsenselistener)
	{
		if(!a.isEnabled())
	//*   0    0:aload_0         
	//*   1    1:getfield        #74  <Field Core a>
	//*   2    4:invokevirtual   #184 <Method boolean Core.isEnabled()>
	//*   3    7:ifne            11
		{
			return;
	//    4   10:return          
		} else
		{
			v.remove(((Object) (streamsenselistener)));
	//    5   11:aload_0         
	//    6   12:getfield        #113 <Field List v>
	//    7   15:aload_1         
	//    8   16:invokeinterface #605 <Method boolean List.remove(Object)>
	//    9   21:pop             
			return;
	//   10   22:return          
		}
	}

	public void reset()
	{
		reset(((Set) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokevirtual   #606 <Method void reset(Set)>
	//    3    5:return          
	}

	public void reset(Set set)
	{
		if(!a.isEnabled())
	//*   0    0:aload_0         
	//*   1    1:getfield        #74  <Field Core a>
	//*   2    4:invokevirtual   #184 <Method boolean Core.isEnabled()>
	//*   3    7:ifne            11
			return;
	//    4   10:return          
		CSLog.d(((Object) (this)), "Reset()");
	//    5   11:aload_0         
	//    6   12:ldc2            #608 <String "Reset()">
	//    7   15:invokestatic    #66  <Method void CSLog.d(Object, String)>
		h.reset(set);
	//    8   18:aload_0         
	//    9   19:getfield        #53  <Field StreamSensePlaylist h>
	//   10   22:aload_1         
	//   11   23:invokevirtual   #609 <Method void StreamSensePlaylist.reset(Set)>
		h.d(0);
	//   12   26:aload_0         
	//   13   27:getfield        #53  <Field StreamSensePlaylist h>
	//   14   30:iconst_0        
	//   15   31:invokevirtual   #611 <Method void StreamSensePlaylist.d(int)>
		StreamSensePlaylist streamsenseplaylist = h;
	//   16   34:aload_0         
	//   17   35:getfield        #53  <Field StreamSensePlaylist h>
	//   18   38:astore_2        
		StringBuilder stringbuilder = new StringBuilder();
	//   19   39:new             #186 <Class StringBuilder>
	//   20   42:dup             
	//   21   43:invokespecial   #187 <Method void StringBuilder()>
	//   22   46:astore_3        
		stringbuilder.append(System.currentTimeMillis());
	//   23   47:aload_3         
	//   24   48:invokestatic    #217 <Method long System.currentTimeMillis()>
	//   25   51:invokevirtual   #333 <Method StringBuilder StringBuilder.append(long)>
	//   26   54:pop             
		stringbuilder.append("_1");
	//   27   55:aload_3         
	//   28   56:ldc2            #613 <String "_1">
	//   29   59:invokevirtual   #193 <Method StringBuilder StringBuilder.append(String)>
	//   30   62:pop             
		streamsenseplaylist.setPlaylistId(stringbuilder.toString());
	//   31   63:aload_2         
	//   32   64:aload_3         
	//   33   65:invokevirtual   #202 <Method String StringBuilder.toString()>
	//   34   68:invokevirtual   #617 <Method void StreamSensePlaylist.setPlaylistId(String)>
		h.getClip().reset(set);
	//   35   71:aload_0         
	//   36   72:getfield        #53  <Field StreamSensePlaylist h>
	//   37   75:invokevirtual   #242 <Method StreamSenseClip StreamSensePlaylist.getClip()>
	//   38   78:aload_1         
	//   39   79:invokevirtual   #407 <Method void StreamSenseClip.reset(Set)>
		if(set != null && !set.isEmpty())
	//*  40   82:aload_1         
	//*  41   83:ifnull          106
	//*  42   86:aload_1         
	//*  43   87:invokeinterface #622 <Method boolean Set.isEmpty()>
	//*  44   92:ifne            106
			StreamSenseUtils.filterMap(((java.util.Map) (b)), set);
	//   45   95:aload_0         
	//   46   96:getfield        #79  <Field HashMap b>
	//   47   99:aload_1         
	//   48  100:invokestatic    #628 <Method void StreamSenseUtils.filterMap(java.util.Map, Set)>
		else
	//*  49  103:goto            113
			b.clear();
	//   50  106:aload_0         
	//   51  107:getfield        #79  <Field HashMap b>
	//   52  110:invokevirtual   #631 <Method void HashMap.clear()>
		g = 1;
	//   53  113:aload_0         
	//   54  114:iconst_1        
	//   55  115:putfield        #81  <Field int g>
		o = 0;
	//   56  118:aload_0         
	//   57  119:iconst_0        
	//   58  120:putfield        #93  <Field int o>
		e();
	//   59  123:aload_0         
	//   60  124:invokespecial   #392 <Method void e()>
		f();
	//   61  127:aload_0         
	//   62  128:invokespecial   #95  <Method void f()>
		h();
	//   63  131:aload_0         
	//   64  132:invokespecial   #394 <Method void h()>
		k();
	//   65  135:aload_0         
	//   66  136:invokespecial   #398 <Method void k()>
		l();
	//   67  139:aload_0         
	//   68  140:invokespecial   #287 <Method void l()>
		f = StreamSenseState.IDLE;
	//   69  143:aload_0         
	//   70  144:getstatic       #86  <Field StreamSenseState StreamSenseState.IDLE>
	//   71  147:putfield        #51  <Field StreamSenseState f>
		d = -1L;
	//   72  150:aload_0         
	//   73  151:ldc2w           #476 <Long -1L>
	//   74  154:putfield        #296 <Field long d>
		r = null;
	//   75  157:aload_0         
	//   76  158:aconst_null     
	//   77  159:putfield        #101 <Field StreamSenseState r>
		s = "android_puppet";
	//   78  162:aload_0         
	//   79  163:ldc2            #633 <String "android_puppet">
	//   80  166:putfield        #249 <Field String s>
		t = "4.1508.28";
	//   81  169:aload_0         
	//   82  170:ldc2            #272 <String "4.1508.28">
	//   83  173:putfield        #253 <Field String t>
		u = null;
	//   84  176:aload_0         
	//   85  177:aconst_null     
	//   86  178:putfield        #472 <Field HashMap u>
	//   87  181:return          
	}

	public Boolean setClip(HashMap hashmap)
	{
		return setClip(hashmap, false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:invokevirtual   #639 <Method Boolean setClip(HashMap, boolean)>
	//    4    6:areturn         
	}

	public Boolean setClip(HashMap hashmap, boolean flag)
	{
		if(!a.isEnabled())
	//*   0    0:aload_0         
	//*   1    1:getfield        #74  <Field Core a>
	//*   2    4:invokevirtual   #184 <Method boolean Core.isEnabled()>
	//*   3    7:ifne            14
			return Boolean.FALSE;
	//    4   10:getstatic       #646 <Field Boolean Boolean.FALSE>
	//    5   13:areturn         
		Boolean boolean1 = Boolean.FALSE;
	//    6   14:getstatic       #646 <Field Boolean Boolean.FALSE>
	//    7   17:astore_3        
		if(f == StreamSenseState.IDLE)
	//*   8   18:aload_0         
	//*   9   19:getfield        #51  <Field StreamSenseState f>
	//*  10   22:getstatic       #86  <Field StreamSenseState StreamSenseState.IDLE>
	//*  11   25:if_acmpne       68
		{
			h.getClip().reset();
	//   12   28:aload_0         
	//   13   29:getfield        #53  <Field StreamSensePlaylist h>
	//   14   32:invokevirtual   #242 <Method StreamSenseClip StreamSensePlaylist.getClip()>
	//   15   35:invokevirtual   #647 <Method void StreamSenseClip.reset()>
			h.getClip().a(Utils.mapOfStrings(((java.util.Map) (hashmap))), ((StreamSenseState) (null)));
	//   16   38:aload_0         
	//   17   39:getfield        #53  <Field StreamSensePlaylist h>
	//   18   42:invokevirtual   #242 <Method StreamSenseClip StreamSensePlaylist.getClip()>
	//   19   45:aload_1         
	//   20   46:invokestatic    #581 <Method HashMap Utils.mapOfStrings(java.util.Map)>
	//   21   49:aconst_null     
	//   22   50:invokevirtual   #649 <Method void StreamSenseClip.a(HashMap, StreamSenseState)>
			if(flag)
	//*  23   53:iload_2         
	//*  24   54:ifeq            64
				h.b();
	//   25   57:aload_0         
	//   26   58:getfield        #53  <Field StreamSensePlaylist h>
	//   27   61:invokevirtual   #651 <Method void StreamSensePlaylist.b()>
			boolean1 = Boolean.TRUE;
	//   28   64:getstatic       #654 <Field Boolean Boolean.TRUE>
	//   29   67:astore_3        
		}
		return boolean1;
	//   30   68:aload_3         
	//   31   69:areturn         
	}

	public void setHeartbeatIntervals(List list)
	{
		if(!a.isEnabled())
	//*   0    0:aload_0         
	//*   1    1:getfield        #74  <Field Core a>
	//*   2    4:invokevirtual   #184 <Method boolean Core.isEnabled()>
	//*   3    7:ifne            11
		{
			return;
	//    4   10:return          
		} else
		{
			w = list;
	//    5   11:aload_0         
	//    6   12:aload_1         
	//    7   13:putfield        #118 <Field List w>
			return;
	//    8   16:return          
		}
	}

	public void setKeepAliveInterval(int i1)
	{
		if(!a.isEnabled())
	//*   0    0:aload_0         
	//*   1    1:getfield        #74  <Field Core a>
	//*   2    4:invokevirtual   #184 <Method boolean Core.isEnabled()>
	//*   3    7:ifne            11
		{
			return;
	//    4   10:return          
		} else
		{
			x = i1;
	//    5   11:aload_0         
	//    6   12:iload_1         
	//    7   13:putfield        #106 <Field int x>
			return;
	//    8   16:return          
		}
	}

	public void setLabel(String s1, String s2)
	{
		if(!a.isEnabled())
	//*   0    0:aload_0         
	//*   1    1:getfield        #74  <Field Core a>
	//*   2    4:invokevirtual   #184 <Method boolean Core.isEnabled()>
	//*   3    7:ifne            11
			return;
	//    4   10:return          
		if(s2 == null)
	//*   5   11:aload_2         
	//*   6   12:ifnonnull       25
		{
			b.remove(((Object) (s1)));
	//    7   15:aload_0         
	//    8   16:getfield        #79  <Field HashMap b>
	//    9   19:aload_1         
	//   10   20:invokevirtual   #442 <Method Object HashMap.remove(Object)>
	//   11   23:pop             
			return;
	//   12   24:return          
		} else
		{
			b.put(((Object) (s1)), ((Object) (s2)));
	//   13   25:aload_0         
	//   14   26:getfield        #79  <Field HashMap b>
	//   15   29:aload_1         
	//   16   30:aload_2         
	//   17   31:invokevirtual   #227 <Method Object HashMap.put(Object, Object)>
	//   18   34:pop             
			return;
	//   19   35:return          
		}
	}

	public void setLabels(HashMap hashmap)
	{
		if(!a.isEnabled())
	//*   0    0:aload_0         
	//*   1    1:getfield        #74  <Field Core a>
	//*   2    4:invokevirtual   #184 <Method boolean Core.isEnabled()>
	//*   3    7:ifne            11
			return;
	//    4   10:return          
		if(hashmap != null)
	//*   5   11:aload_1         
	//*   6   12:ifnull          42
		{
			if(b == null)
	//*   7   15:aload_0         
	//*   8   16:getfield        #79  <Field HashMap b>
	//*   9   19:ifnonnull       31
			{
				b = Utils.mapOfStrings(((java.util.Map) (hashmap)));
	//   10   22:aload_0         
	//   11   23:aload_1         
	//   12   24:invokestatic    #581 <Method HashMap Utils.mapOfStrings(java.util.Map)>
	//   13   27:putfield        #79  <Field HashMap b>
				return;
	//   14   30:return          
			}
			b.putAll(((java.util.Map) (Utils.mapOfStrings(((java.util.Map) (hashmap))))));
	//   15   31:aload_0         
	//   16   32:getfield        #79  <Field HashMap b>
	//   17   35:aload_1         
	//   18   36:invokestatic    #581 <Method HashMap Utils.mapOfStrings(java.util.Map)>
	//   19   39:invokevirtual   #206 <Method void HashMap.putAll(java.util.Map)>
		}
	//   20   42:return          
	}

	public void setPauseOnBufferingEnabled(boolean flag)
	{
		if(!a.isEnabled())
	//*   0    0:aload_0         
	//*   1    1:getfield        #74  <Field Core a>
	//*   2    4:invokevirtual   #184 <Method boolean Core.isEnabled()>
	//*   3    7:ifne            11
		{
			return;
	//    4   10:return          
		} else
		{
			j = flag;
	//    5   11:aload_0         
	//    6   12:iload_1         
	//    7   13:putfield        #57  <Field boolean j>
			return;
	//    8   16:return          
		}
	}

	public void setPauseOnBufferingInterval(int i1)
	{
		if(!a.isEnabled())
	//*   0    0:aload_0         
	//*   1    1:getfield        #74  <Field Core a>
	//*   2    4:invokevirtual   #184 <Method boolean Core.isEnabled()>
	//*   3    7:ifne            11
		{
			return;
	//    4   10:return          
		} else
		{
			y = i1;
	//    5   11:aload_0         
	//    6   12:iload_1         
	//    7   13:putfield        #108 <Field int y>
			return;
	//    8   16:return          
		}
	}

	public void setPausePlaySwitchDelayEnabled(boolean flag)
	{
		if(!a.isEnabled())
	//*   0    0:aload_0         
	//*   1    1:getfield        #74  <Field Core a>
	//*   2    4:invokevirtual   #184 <Method boolean Core.isEnabled()>
	//*   3    7:ifne            11
		{
			return;
	//    4   10:return          
		} else
		{
			q = flag;
	//    5   11:aload_0         
	//    6   12:iload_1         
	//    7   13:putfield        #99  <Field boolean q>
			return;
	//    8   16:return          
		}
	}

	public String setPixelURL(String s1)
	{
		if(!a.isEnabled())
	//*   0    0:aload_0         
	//*   1    1:getfield        #74  <Field Core a>
	//*   2    4:invokevirtual   #184 <Method boolean Core.isEnabled()>
	//*   3    7:ifne            15
			return c;
	//    4   10:aload_0         
	//    5   11:getfield        #49  <Field String c>
	//    6   14:areturn         
		if(s1 != null && s1.length() != 0)
	//*   7   15:aload_1         
	//*   8   16:ifnull          206
	//*   9   19:aload_1         
	//*  10   20:invokevirtual   #520 <Method int String.length()>
	//*  11   23:ifne            29
	//*  12   26:goto            206
		{
			int i1 = s1.indexOf('?');
	//   13   29:aload_1         
	//   14   30:bipush          63
	//   15   32:invokevirtual   #669 <Method int String.indexOf(int)>
	//   16   35:istore_2        
			Object obj;
			if(i1 >= 0)
	//*  17   36:iload_2         
	//*  18   37:iflt            164
			{
				obj = ((Object) (s1));
	//   19   40:aload_1         
	//   20   41:astore          5
				if(i1 < s1.length() - 1)
	//*  21   43:iload_2         
	//*  22   44:aload_1         
	//*  23   45:invokevirtual   #520 <Method int String.length()>
	//*  24   48:iconst_1        
	//*  25   49:isub            
	//*  26   50:icmpge          195
				{
					int k1 = i1 + 1;
	//   27   53:iload_2         
	//   28   54:iconst_1        
	//   29   55:iadd            
	//   30   56:istore_3        
					String as[] = s1.substring(k1).split("&");
	//   31   57:aload_1         
	//   32   58:iload_3         
	//   33   59:invokevirtual   #672 <Method String String.substring(int)>
	//   34   62:ldc2            #674 <String "&">
	//   35   65:invokevirtual   #678 <Method String[] String.split(String)>
	//   36   68:astore          7
					int l1 = as.length;
	//   37   70:aload           7
	//   38   72:arraylength     
	//   39   73:istore          4
					for(int j1 = 0; j1 < l1; j1++)
	//*  40   75:iconst_0        
	//*  41   76:istore_2        
	//*  42   77:iload_2         
	//*  43   78:iload           4
	//*  44   80:icmpge          153
					{
						obj = ((Object) (as[j1].split("=")));
	//   45   83:aload           7
	//   46   85:iload_2         
	//   47   86:aaload          
	//   48   87:ldc2            #680 <String "=">
	//   49   90:invokevirtual   #678 <Method String[] String.split(String)>
	//   50   93:astore          5
						String s2;
						if(obj.length == 2)
	//*  51   95:aload           5
	//*  52   97:arraylength     
	//*  53   98:iconst_2        
	//*  54   99:icmpne          125
						{
							s2 = ((String) (obj[0]));
	//   55  102:aload           5
	//   56  104:iconst_0        
	//   57  105:aaload          
	//   58  106:astore          6
							obj = ((Object) (obj[1]));
	//   59  108:aload           5
	//   60  110:iconst_1        
	//   61  111:aaload          
	//   62  112:astore          5
						} else
	//*  63  114:aload_0         
	//*  64  115:aload           6
	//*  65  117:aload           5
	//*  66  119:invokevirtual   #682 <Method void setLabel(String, String)>
	//*  67  122:goto            146
						{
							if(obj.length != 1)
								continue;
	//   68  125:aload           5
	//   69  127:arraylength     
	//   70  128:iconst_1        
	//   71  129:icmpne          146
							s2 = "name";
	//   72  132:ldc2            #684 <String "name">
	//   73  135:astore          6
							obj = ((Object) (obj[0]));
	//   74  137:aload           5
	//   75  139:iconst_0        
	//   76  140:aaload          
	//   77  141:astore          5
						}
						setLabel(s2, ((String) (obj)));
					}

	//   78  143:goto            114
	//   79  146:iload_2         
	//   80  147:iconst_1        
	//   81  148:iadd            
	//   82  149:istore_2        
	//*  83  150:goto            77
					obj = ((Object) (s1.substring(0, k1)));
	//   84  153:aload_1         
	//   85  154:iconst_0        
	//   86  155:iload_3         
	//   87  156:invokevirtual   #687 <Method String String.substring(int, int)>
	//   88  159:astore          5
				}
			} else
	//*  89  161:goto            195
			{
				obj = ((Object) (new StringBuilder()));
	//   90  164:new             #186 <Class StringBuilder>
	//   91  167:dup             
	//   92  168:invokespecial   #187 <Method void StringBuilder()>
	//   93  171:astore          5
				((StringBuilder) (obj)).append(s1);
	//   94  173:aload           5
	//   95  175:aload_1         
	//   96  176:invokevirtual   #193 <Method StringBuilder StringBuilder.append(String)>
	//   97  179:pop             
				((StringBuilder) (obj)).append('?');
	//   98  180:aload           5
	//   99  182:bipush          63
	//  100  184:invokevirtual   #690 <Method StringBuilder StringBuilder.append(char)>
	//  101  187:pop             
				obj = ((Object) (((StringBuilder) (obj)).toString()));
	//  102  188:aload           5
	//  103  190:invokevirtual   #202 <Method String StringBuilder.toString()>
	//  104  193:astore          5
			}
			c = ((String) (obj));
	//  105  195:aload_0         
	//  106  196:aload           5
	//  107  198:putfield        #49  <Field String c>
			return c;
	//  108  201:aload_0         
	//  109  202:getfield        #49  <Field String c>
	//  110  205:areturn         
		} else
		{
			return null;
	//  111  206:aconst_null     
	//  112  207:areturn         
		}
	}

	public Boolean setPlaylist(HashMap hashmap)
	{
		if(!a.isEnabled())
	//*   0    0:aload_0         
	//*   1    1:getfield        #74  <Field Core a>
	//*   2    4:invokevirtual   #184 <Method boolean Core.isEnabled()>
	//*   3    7:ifne            14
			return Boolean.FALSE;
	//    4   10:getstatic       #646 <Field Boolean Boolean.FALSE>
	//    5   13:areturn         
		Boolean boolean1 = Boolean.FALSE;
	//    6   14:getstatic       #646 <Field Boolean Boolean.FALSE>
	//    7   17:astore_2        
		if(f == StreamSenseState.IDLE)
	//*   8   18:aload_0         
	//*   9   19:getfield        #51  <Field StreamSenseState f>
	//*  10   22:getstatic       #86  <Field StreamSenseState StreamSenseState.IDLE>
	//*  11   25:if_acmpne       68
		{
			h.i();
	//   12   28:aload_0         
	//   13   29:getfield        #53  <Field StreamSensePlaylist h>
	//   14   32:invokevirtual   #692 <Method void StreamSensePlaylist.i()>
			h.reset();
	//   15   35:aload_0         
	//   16   36:getfield        #53  <Field StreamSensePlaylist h>
	//   17   39:invokevirtual   #693 <Method void StreamSensePlaylist.reset()>
			h.getClip().reset();
	//   18   42:aload_0         
	//   19   43:getfield        #53  <Field StreamSensePlaylist h>
	//   20   46:invokevirtual   #242 <Method StreamSenseClip StreamSensePlaylist.getClip()>
	//   21   49:invokevirtual   #647 <Method void StreamSenseClip.reset()>
			h.a(Utils.mapOfStrings(((java.util.Map) (hashmap))), ((StreamSenseState) (null)));
	//   22   52:aload_0         
	//   23   53:getfield        #53  <Field StreamSensePlaylist h>
	//   24   56:aload_1         
	//   25   57:invokestatic    #581 <Method HashMap Utils.mapOfStrings(java.util.Map)>
	//   26   60:aconst_null     
	//   27   61:invokevirtual   #694 <Method void StreamSensePlaylist.a(HashMap, StreamSenseState)>
			boolean1 = Boolean.TRUE;
	//   28   64:getstatic       #654 <Field Boolean Boolean.TRUE>
	//   29   67:astore_2        
		}
		return boolean1;
	//   30   68:aload_2         
	//   31   69:areturn         
	}

	protected Core a;
	private HashMap b;
	private String c;
	private long d;
	private long e;
	private StreamSenseState f;
	private int g;
	private StreamSensePlaylist h;
	private Runnable i;
	private boolean j;
	private Runnable k;
	private f l;
	private Runnable m;
	private long n;
	private int o;
	private long p;
	private boolean q;
	private StreamSenseState r;
	private String s;
	private String t;
	private HashMap u;
	private List v;
	private List w;
	private int x;
	private int y;
}
