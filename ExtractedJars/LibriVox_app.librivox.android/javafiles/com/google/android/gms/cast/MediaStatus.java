// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.cast;

import android.os.Parcel;
import android.util.SparseArray;
import com.google.android.gms.common.internal.ak;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.c;
import com.google.android.gms.common.util.l;
import com.google.android.gms.internal.cast.aj;
import java.util.*;
import org.json.*;

// Referenced classes of package com.google.android.gms.cast:
//			ae, MediaQueueItem, MediaInfo, o, 
//			AdBreakStatus, VideoInfo

public class MediaStatus extends AbstractSafeParcelable
{

	MediaStatus(MediaInfo mediainfo, long l1, int i1, double d1, int j1, 
			int k1, long l2, long l3, double d2, 
			boolean flag, long al[], int i2, int j2, String s1, int k2, List list, 
			boolean flag1, AdBreakStatus adbreakstatus, VideoInfo videoinfo)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #53  <Method void AbstractSafeParcelable()>
		q = new ArrayList();
	//    2    4:aload_0         
	//    3    5:new             #55  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #56  <Method void ArrayList()>
	//    6   12:putfield        #58  <Field ArrayList q>
		u = new SparseArray();
	//    7   15:aload_0         
	//    8   16:new             #60  <Class SparseArray>
	//    9   19:dup             
	//   10   20:invokespecial   #61  <Method void SparseArray()>
	//   11   23:putfield        #63  <Field SparseArray u>
		a = mediainfo;
	//   12   26:aload_0         
	//   13   27:aload_1         
	//   14   28:putfield        #65  <Field MediaInfo a>
		b = l1;
	//   15   31:aload_0         
	//   16   32:lload_2         
	//   17   33:putfield        #67  <Field long b>
		c = i1;
	//   18   36:aload_0         
	//   19   37:iload           4
	//   20   39:putfield        #69  <Field int c>
		d = d1;
	//   21   42:aload_0         
	//   22   43:dload           5
	//   23   45:putfield        #71  <Field double d>
		e = j1;
	//   24   48:aload_0         
	//   25   49:iload           7
	//   26   51:putfield        #73  <Field int e>
		f = k1;
	//   27   54:aload_0         
	//   28   55:iload           8
	//   29   57:putfield        #75  <Field int f>
		g = l2;
	//   30   60:aload_0         
	//   31   61:lload           9
	//   32   63:putfield        #77  <Field long g>
		h = l3;
	//   33   66:aload_0         
	//   34   67:lload           11
	//   35   69:putfield        #79  <Field long h>
		i = d2;
	//   36   72:aload_0         
	//   37   73:dload           13
	//   38   75:putfield        #81  <Field double i>
		j = flag;
	//   39   78:aload_0         
	//   40   79:iload           15
	//   41   81:putfield        #83  <Field boolean j>
		k = al;
	//   42   84:aload_0         
	//   43   85:aload           16
	//   44   87:putfield        #85  <Field long[] k>
		l = i2;
	//   45   90:aload_0         
	//   46   91:iload           17
	//   47   93:putfield        #87  <Field int l>
		m = j2;
	//   48   96:aload_0         
	//   49   97:iload           18
	//   50   99:putfield        #89  <Field int m>
		n = s1;
	//   51  102:aload_0         
	//   52  103:aload           19
	//   53  105:putfield        #91  <Field String n>
		mediainfo = ((MediaInfo) (n));
	//   54  108:aload_0         
	//   55  109:getfield        #91  <Field String n>
	//   56  112:astore_1        
		if(mediainfo != null)
	//*  57  113:aload_1         
	//*  58  114:ifnull          145
			try
			{
				o = new JSONObject(((String) (mediainfo)));
	//   59  117:aload_0         
	//   60  118:new             #93  <Class JSONObject>
	//   61  121:dup             
	//   62  122:aload_1         
	//   63  123:invokespecial   #96  <Method void JSONObject(String)>
	//   64  126:putfield        #98  <Field JSONObject o>
			}
	//*  65  129:goto            150
	//*  66  132:aload_0         
	//*  67  133:aconst_null     
	//*  68  134:putfield        #98  <Field JSONObject o>
	//*  69  137:aload_0         
	//*  70  138:aconst_null     
	//*  71  139:putfield        #91  <Field String n>
	//*  72  142:goto            150
	//*  73  145:aload_0         
	//*  74  146:aconst_null     
	//*  75  147:putfield        #98  <Field JSONObject o>
	//*  76  150:aload_0         
	//*  77  151:iload           20
	//*  78  153:putfield        #100 <Field int p>
	//*  79  156:aload           21
	//*  80  158:ifnull          198
	//*  81  161:aload           21
	//*  82  163:invokeinterface #106 <Method boolean List.isEmpty()>
	//*  83  168:ifne            198
	//*  84  171:aload_0         
	//*  85  172:aload           21
	//*  86  174:aload           21
	//*  87  176:invokeinterface #110 <Method int List.size()>
	//*  88  181:anewarray       MediaQueueItem[]
	//*  89  184:invokeinterface #116 <Method Object[] List.toArray(Object[])>
	//*  90  189:checkcast       #118 <Class MediaQueueItem[]>
	//*  91  192:invokespecial   #121 <Method void a(MediaQueueItem[])>
	//*  92  195:goto            198
	//*  93  198:aload_0         
	//*  94  199:iload           22
	//*  95  201:putfield        #123 <Field boolean r>
	//*  96  204:aload_0         
	//*  97  205:aload           23
	//*  98  207:putfield        #125 <Field AdBreakStatus s>
	//*  99  210:aload_0         
	//* 100  211:aload           24
	//* 101  213:putfield        #127 <Field VideoInfo t>
	//* 102  216:return          
			// Misplaced declaration of an exception variable
			catch(MediaInfo mediainfo)
			{
				o = null;
				n = null;
			}
		else
			o = null;
		p = k2;
		if(list != null && !list.isEmpty())
			a((MediaQueueItem[])list.toArray(((Object []) (new MediaQueueItem[list.size()]))));
		r = flag1;
		s = adbreakstatus;
		t = videoinfo;
	//* 103  217:astore_1        
	//* 104  218:goto            132
	}

	public MediaStatus(JSONObject jsonobject)
	{
		this(((MediaInfo) (null)), 0L, 0, 0.0D, 0, 0, 0L, 0L, 0.0D, false, ((long []) (null)), 0, 0, ((String) (null)), 0, ((List) (null)), false, ((AdBreakStatus) (null)), ((VideoInfo) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:lconst_0        
	//    3    3:iconst_0        
	//    4    4:dconst_0        
	//    5    5:iconst_0        
	//    6    6:iconst_0        
	//    7    7:lconst_0        
	//    8    8:lconst_0        
	//    9    9:dconst_0        
	//   10   10:iconst_0        
	//   11   11:aconst_null     
	//   12   12:iconst_0        
	//   13   13:iconst_0        
	//   14   14:aconst_null     
	//   15   15:iconst_0        
	//   16   16:aconst_null     
	//   17   17:iconst_0        
	//   18   18:aconst_null     
	//   19   19:aconst_null     
	//   20   20:invokespecial   #130 <Method void MediaStatus(MediaInfo, long, int, double, int, int, long, long, double, boolean, long[], int, int, String, int, List, boolean, AdBreakStatus, VideoInfo)>
		a(jsonobject, 0);
	//   21   23:aload_0         
	//   22   24:aload_1         
	//   23   25:iconst_0        
	//   24   26:invokevirtual   #133 <Method int a(JSONObject, int)>
	//   25   29:pop             
	//   26   30:return          
	}

	private final void a(MediaQueueItem amediaqueueitem[])
	{
		q.clear();
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field ArrayList q>
	//    2    4:invokevirtual   #136 <Method void ArrayList.clear()>
		u.clear();
	//    3    7:aload_0         
	//    4    8:getfield        #63  <Field SparseArray u>
	//    5   11:invokevirtual   #137 <Method void SparseArray.clear()>
		for(int i1 = 0; i1 < amediaqueueitem.length; i1++)
	//*   6   14:iconst_0        
	//*   7   15:istore_2        
	//*   8   16:iload_2         
	//*   9   17:aload_1         
	//*  10   18:arraylength     
	//*  11   19:icmpge          57
		{
			MediaQueueItem mediaqueueitem = amediaqueueitem[i1];
	//   12   22:aload_1         
	//   13   23:iload_2         
	//   14   24:aaload          
	//   15   25:astore_3        
			q.add(((Object) (mediaqueueitem)));
	//   16   26:aload_0         
	//   17   27:getfield        #58  <Field ArrayList q>
	//   18   30:aload_3         
	//   19   31:invokevirtual   #141 <Method boolean ArrayList.add(Object)>
	//   20   34:pop             
			u.put(mediaqueueitem.b(), ((Object) (Integer.valueOf(i1))));
	//   21   35:aload_0         
	//   22   36:getfield        #63  <Field SparseArray u>
	//   23   39:aload_3         
	//   24   40:invokevirtual   #143 <Method int MediaQueueItem.b()>
	//   25   43:iload_2         
	//   26   44:invokestatic    #149 <Method Integer Integer.valueOf(int)>
	//   27   47:invokevirtual   #153 <Method void SparseArray.put(int, Object)>
		}

	//   28   50:iload_2         
	//   29   51:iconst_1        
	//   30   52:iadd            
	//   31   53:istore_2        
	//*  32   54:goto            16
	//   33   57:return          
	}

	private static boolean a(int i1, int j1, int k1, int l1)
	{
		if(i1 != 1)
	//*   0    0:iload_0         
	//*   1    1:iconst_1        
	//*   2    2:icmpeq          7
			return false;
	//    3    5:iconst_0        
	//    4    6:ireturn         
		switch(j1)
	//*   5    7:iload_1         
		{
	//*   6    8:tableswitch     1 3: default 36
	//	               1 47
	//	               2 38
	//	               3 47
		default:
			return true;
	//    7   36:iconst_1        
	//    8   37:ireturn         

		case 2: // '\002'
			return l1 != 2;
	//    9   38:iload_3         
	//   10   39:iconst_2        
	//   11   40:icmpeq          45
	//   12   43:iconst_1        
	//   13   44:ireturn         
	//   14   45:iconst_0        
	//   15   46:ireturn         

		case 1: // '\001'
		case 3: // '\003'
			break;
		}
		return k1 == 0;
	//   16   47:iload_2         
	//   17   48:ifne            53
	//   18   51:iconst_1        
	//   19   52:ireturn         
	//   20   53:iconst_0        
	//   21   54:ireturn         
	}

	public final int a(JSONObject jsonobject, int i1)
	{
		int l1;
		int j2;
		boolean flag;
		long al1[];
		Object obj;
label0:
		{
label1:
			{
				long al2[];
label2:
				{
					long l4 = jsonobject.getLong("mediaSessionId");
	//    0    0:aload_1         
	//    1    1:ldc1            #156 <String "mediaSessionId">
	//    2    3:invokevirtual   #160 <Method long JSONObject.getLong(String)>
	//    3    6:lstore          10
					long l7 = b;
	//    4    8:aload_0         
	//    5    9:getfield        #67  <Field long b>
	//    6   12:lstore          12
					flag = false;
	//    7   14:iconst_0        
	//    8   15:istore          14
					int i2;
					if(l4 != l7)
	//*   9   17:lload           10
	//*  10   19:lload           12
	//*  11   21:lcmp            
	//*  12   22:ifeq            37
					{
						b = l4;
	//   13   25:aload_0         
	//   14   26:lload           10
	//   15   28:putfield        #67  <Field long b>
						i2 = 1;
	//   16   31:iconst_1        
	//   17   32:istore          6
					} else
	//*  18   34:goto            40
					{
						i2 = 0;
	//   19   37:iconst_0        
	//   20   38:istore          6
					}
					int j3 = i2;
	//   21   40:iload           6
	//   22   42:istore          7
					if(jsonobject.has("playerState"))
	//*  23   44:aload_1         
	//*  24   45:ldc1            #162 <String "playerState">
	//*  25   47:invokevirtual   #166 <Method boolean JSONObject.has(String)>
	//*  26   50:ifeq            284
					{
						String s1 = jsonobject.getString("playerState");
	//   27   53:aload_1         
	//   28   54:ldc1            #162 <String "playerState">
	//   29   56:invokevirtual   #170 <Method String JSONObject.getString(String)>
	//   30   59:astore          16
						boolean flag1 = s1.equals("IDLE");
	//   31   61:aload           16
	//   32   63:ldc1            #172 <String "IDLE">
	//   33   65:invokevirtual   #177 <Method boolean String.equals(Object)>
	//   34   68:istore          15
						byte byte0 = 4;
	//   35   70:iconst_4        
	//   36   71:istore          9
						int j1;
						if(flag1)
	//*  37   73:iload           15
	//*  38   75:ifeq            84
							j1 = 1;
	//   39   78:iconst_1        
	//   40   79:istore          5
						else
	//*  41   81:goto            135
						if(s1.equals("PLAYING"))
	//*  42   84:aload           16
	//*  43   86:ldc1            #179 <String "PLAYING">
	//*  44   88:invokevirtual   #177 <Method boolean String.equals(Object)>
	//*  45   91:ifeq            100
							j1 = 2;
	//   46   94:iconst_2        
	//   47   95:istore          5
						else
	//*  48   97:goto            135
						if(s1.equals("PAUSED"))
	//*  49  100:aload           16
	//*  50  102:ldc1            #181 <String "PAUSED">
	//*  51  104:invokevirtual   #177 <Method boolean String.equals(Object)>
	//*  52  107:ifeq            116
							j1 = 3;
	//   53  110:iconst_3        
	//   54  111:istore          5
						else
	//*  55  113:goto            135
						if(s1.equals("BUFFERING"))
	//*  56  116:aload           16
	//*  57  118:ldc1            #183 <String "BUFFERING">
	//*  58  120:invokevirtual   #177 <Method boolean String.equals(Object)>
	//*  59  123:ifeq            132
							j1 = 4;
	//   60  126:iconst_4        
	//   61  127:istore          5
						else
	//*  62  129:goto            135
							j1 = 0;
	//   63  132:iconst_0        
	//   64  133:istore          5
						int l3 = i2;
	//   65  135:iload           6
	//   66  137:istore          8
						if(j1 != e)
	//*  67  139:iload           5
	//*  68  141:aload_0         
	//*  69  142:getfield        #73  <Field int e>
	//*  70  145:icmpeq          160
						{
							e = j1;
	//   71  148:aload_0         
	//   72  149:iload           5
	//   73  151:putfield        #73  <Field int e>
							l3 = i2 | 2;
	//   74  154:iload           6
	//   75  156:iconst_2        
	//   76  157:ior             
	//   77  158:istore          8
						}
						j3 = l3;
	//   78  160:iload           8
	//   79  162:istore          7
						if(j1 == 1)
	//*  80  164:iload           5
	//*  81  166:iconst_1        
	//*  82  167:icmpne          284
						{
							j3 = l3;
	//   83  170:iload           8
	//   84  172:istore          7
							if(jsonobject.has("idleReason"))
	//*  85  174:aload_1         
	//*  86  175:ldc1            #185 <String "idleReason">
	//*  87  177:invokevirtual   #166 <Method boolean JSONObject.has(String)>
	//*  88  180:ifeq            284
							{
								String s2 = jsonobject.getString("idleReason");
	//   89  183:aload_1         
	//   90  184:ldc1            #185 <String "idleReason">
	//   91  186:invokevirtual   #170 <Method String JSONObject.getString(String)>
	//   92  189:astore          16
								int k1;
								if(s2.equals("CANCELLED"))
	//*  93  191:aload           16
	//*  94  193:ldc1            #187 <String "CANCELLED">
	//*  95  195:invokevirtual   #177 <Method boolean String.equals(Object)>
	//*  96  198:ifeq            207
									k1 = 2;
	//   97  201:iconst_2        
	//   98  202:istore          5
								else
	//*  99  204:goto            259
								if(s2.equals("INTERRUPTED"))
	//* 100  207:aload           16
	//* 101  209:ldc1            #189 <String "INTERRUPTED">
	//* 102  211:invokevirtual   #177 <Method boolean String.equals(Object)>
	//* 103  214:ifeq            223
									k1 = 3;
	//  104  217:iconst_3        
	//  105  218:istore          5
								else
	//* 106  220:goto            259
								if(s2.equals("FINISHED"))
	//* 107  223:aload           16
	//* 108  225:ldc1            #191 <String "FINISHED">
	//* 109  227:invokevirtual   #177 <Method boolean String.equals(Object)>
	//* 110  230:ifeq            239
									k1 = 1;
	//  111  233:iconst_1        
	//  112  234:istore          5
								else
	//* 113  236:goto            259
								if(s2.equals("ERROR"))
	//* 114  239:aload           16
	//* 115  241:ldc1            #193 <String "ERROR">
	//* 116  243:invokevirtual   #177 <Method boolean String.equals(Object)>
	//* 117  246:ifeq            256
									k1 = ((int) (byte0));
	//  118  249:iload           9
	//  119  251:istore          5
								else
	//* 120  253:goto            259
									k1 = 0;
	//  121  256:iconst_0        
	//  122  257:istore          5
								j3 = l3;
	//  123  259:iload           8
	//  124  261:istore          7
								if(k1 != f)
	//* 125  263:iload           5
	//* 126  265:aload_0         
	//* 127  266:getfield        #75  <Field int f>
	//* 128  269:icmpeq          284
								{
									f = k1;
	//  129  272:aload_0         
	//  130  273:iload           5
	//  131  275:putfield        #75  <Field int f>
									j3 = l3 | 2;
	//  132  278:iload           8
	//  133  280:iconst_2        
	//  134  281:ior             
	//  135  282:istore          7
								}
							}
						}
					}
					l1 = j3;
	//  136  284:iload           7
	//  137  286:istore          5
					if(jsonobject.has("playbackRate"))
	//* 138  288:aload_1         
	//* 139  289:ldc1            #195 <String "playbackRate">
	//* 140  291:invokevirtual   #166 <Method boolean JSONObject.has(String)>
	//* 141  294:ifeq            328
					{
						double d1 = jsonobject.getDouble("playbackRate");
	//  142  297:aload_1         
	//  143  298:ldc1            #195 <String "playbackRate">
	//  144  300:invokevirtual   #199 <Method double JSONObject.getDouble(String)>
	//  145  303:dstore_3        
						l1 = j3;
	//  146  304:iload           7
	//  147  306:istore          5
						if(d != d1)
	//* 148  308:aload_0         
	//* 149  309:getfield        #71  <Field double d>
	//* 150  312:dload_3         
	//* 151  313:dcmpl           
	//* 152  314:ifeq            328
						{
							d = d1;
	//  153  317:aload_0         
	//  154  318:dload_3         
	//  155  319:putfield        #71  <Field double d>
							l1 = j3 | 2;
	//  156  322:iload           7
	//  157  324:iconst_2        
	//  158  325:ior             
	//  159  326:istore          5
						}
					}
					j3 = l1;
	//  160  328:iload           5
	//  161  330:istore          7
					if(jsonobject.has("currentTime"))
	//* 162  332:aload_1         
	//* 163  333:ldc1            #201 <String "currentTime">
	//* 164  335:invokevirtual   #166 <Method boolean JSONObject.has(String)>
	//* 165  338:ifeq            388
					{
						long l5 = (long)(jsonobject.getDouble("currentTime") * 1000D);
	//  166  341:aload_1         
	//  167  342:ldc1            #201 <String "currentTime">
	//  168  344:invokevirtual   #199 <Method double JSONObject.getDouble(String)>
	//  169  347:ldc2w           #202 <Double 1000D>
	//  170  350:dmul            
	//  171  351:d2l             
	//  172  352:lstore          10
						i2 = l1;
	//  173  354:iload           5
	//  174  356:istore          6
						if(l5 != g)
	//* 175  358:lload           10
	//* 176  360:aload_0         
	//* 177  361:getfield        #77  <Field long g>
	//* 178  364:lcmp            
	//* 179  365:ifeq            380
						{
							g = l5;
	//  180  368:aload_0         
	//  181  369:lload           10
	//  182  371:putfield        #77  <Field long g>
							i2 = l1 | 2;
	//  183  374:iload           5
	//  184  376:iconst_2        
	//  185  377:ior             
	//  186  378:istore          6
						}
						j3 = i2 | 0x80;
	//  187  380:iload           6
	//  188  382:sipush          128
	//  189  385:ior             
	//  190  386:istore          7
					}
					i2 = j3;
	//  191  388:iload           7
	//  192  390:istore          6
					if(jsonobject.has("supportedMediaCommands"))
	//* 193  392:aload_1         
	//* 194  393:ldc1            #205 <String "supportedMediaCommands">
	//* 195  395:invokevirtual   #166 <Method boolean JSONObject.has(String)>
	//* 196  398:ifeq            435
					{
						long l6 = jsonobject.getLong("supportedMediaCommands");
	//  197  401:aload_1         
	//  198  402:ldc1            #205 <String "supportedMediaCommands">
	//  199  404:invokevirtual   #160 <Method long JSONObject.getLong(String)>
	//  200  407:lstore          10
						i2 = j3;
	//  201  409:iload           7
	//  202  411:istore          6
						if(l6 != h)
	//* 203  413:lload           10
	//* 204  415:aload_0         
	//* 205  416:getfield        #79  <Field long h>
	//* 206  419:lcmp            
	//* 207  420:ifeq            435
						{
							h = l6;
	//  208  423:aload_0         
	//  209  424:lload           10
	//  210  426:putfield        #79  <Field long h>
							i2 = j3 | 2;
	//  211  429:iload           7
	//  212  431:iconst_2        
	//  213  432:ior             
	//  214  433:istore          6
						}
					}
					l1 = i2;
	//  215  435:iload           6
	//  216  437:istore          5
					if(jsonobject.has("volume"))
	//* 217  439:aload_1         
	//* 218  440:ldc1            #207 <String "volume">
	//* 219  442:invokevirtual   #166 <Method boolean JSONObject.has(String)>
	//* 220  445:ifeq            528
					{
						l1 = i2;
	//  221  448:iload           6
	//  222  450:istore          5
						if((i1 & 1) == 0)
	//* 223  452:iload_2         
	//* 224  453:iconst_1        
	//* 225  454:iand            
	//* 226  455:ifne            528
						{
							JSONObject jsonobject1 = jsonobject.getJSONObject("volume");
	//  227  458:aload_1         
	//  228  459:ldc1            #207 <String "volume">
	//  229  461:invokevirtual   #211 <Method JSONObject JSONObject.getJSONObject(String)>
	//  230  464:astore          16
							double d2 = jsonobject1.getDouble("level");
	//  231  466:aload           16
	//  232  468:ldc1            #213 <String "level">
	//  233  470:invokevirtual   #199 <Method double JSONObject.getDouble(String)>
	//  234  473:dstore_3        
							i1 = i2;
	//  235  474:iload           6
	//  236  476:istore_2        
							if(d2 != i)
	//* 237  477:dload_3         
	//* 238  478:aload_0         
	//* 239  479:getfield        #81  <Field double i>
	//* 240  482:dcmpl           
	//* 241  483:ifeq            496
							{
								i = d2;
	//  242  486:aload_0         
	//  243  487:dload_3         
	//  244  488:putfield        #81  <Field double i>
								i1 = i2 | 2;
	//  245  491:iload           6
	//  246  493:iconst_2        
	//  247  494:ior             
	//  248  495:istore_2        
							}
							boolean flag2 = jsonobject1.getBoolean("muted");
	//  249  496:aload           16
	//  250  498:ldc1            #215 <String "muted">
	//  251  500:invokevirtual   #218 <Method boolean JSONObject.getBoolean(String)>
	//  252  503:istore          15
							l1 = i1;
	//  253  505:iload_2         
	//  254  506:istore          5
							if(flag2 != j)
	//* 255  508:iload           15
	//* 256  510:aload_0         
	//* 257  511:getfield        #83  <Field boolean j>
	//* 258  514:icmpeq          528
							{
								j = flag2;
	//  259  517:aload_0         
	//  260  518:iload           15
	//  261  520:putfield        #83  <Field boolean j>
								l1 = i1 | 2;
	//  262  523:iload_2         
	//  263  524:iconst_2        
	//  264  525:ior             
	//  265  526:istore          5
							}
						}
					}
					boolean flag3 = jsonobject.has("activeTrackIds");
	//  266  528:aload_1         
	//  267  529:ldc1            #220 <String "activeTrackIds">
	//  268  531:invokevirtual   #166 <Method boolean JSONObject.has(String)>
	//  269  534:istore          15
					obj = null;
	//  270  536:aconst_null     
	//  271  537:astore          17
					if(!flag3)
						break label1;
	//  272  539:iload           15
	//  273  541:ifeq            682
					JSONArray jsonarray = jsonobject.getJSONArray("activeTrackIds");
	//  274  544:aload_1         
	//  275  545:ldc1            #220 <String "activeTrackIds">
	//  276  547:invokevirtual   #224 <Method JSONArray JSONObject.getJSONArray(String)>
	//  277  550:astore          16
					i2 = jsonarray.length();
	//  278  552:aload           16
	//  279  554:invokevirtual   #229 <Method int JSONArray.length()>
	//  280  557:istore          6
					al2 = new long[i2];
	//  281  559:iload           6
	//  282  561:newarray        long[]
	//  283  563:astore          18
					for(i1 = 0; i1 < i2; i1++)
	//* 284  565:iconst_0        
	//* 285  566:istore_2        
	//* 286  567:iload_2         
	//* 287  568:iload           6
	//* 288  570:icmpge          590
						al2[i1] = jsonarray.getLong(i1);
	//  289  573:aload           18
	//  290  575:iload_2         
	//  291  576:aload           16
	//  292  578:iload_2         
	//  293  579:invokevirtual   #232 <Method long JSONArray.getLong(int)>
	//  294  582:lastore         

	//  295  583:iload_2         
	//  296  584:iconst_1        
	//  297  585:iadd            
	//  298  586:istore_2        
	//* 299  587:goto            567
					long al[] = k;
	//  300  590:aload_0         
	//  301  591:getfield        #85  <Field long[] k>
	//  302  594:astore          16
					if(al == null)
	//* 303  596:aload           16
	//* 304  598:ifnonnull       606
					{
						i1 = 1;
	//  305  601:iconst_1        
	//  306  602:istore_2        
						break label2;
	//  307  603:goto            655
					}
					if(al.length != i2)
	//* 308  606:aload           16
	//* 309  608:arraylength     
	//* 310  609:iload           6
	//* 311  611:icmpeq          619
					{
						i1 = 1;
	//  312  614:iconst_1        
	//  313  615:istore_2        
						break label2;
	//  314  616:goto            655
					}
					i1 = 0;
	//  315  619:iconst_0        
	//  316  620:istore_2        
					do
					{
						if(i1 >= i2)
							break;
	//  317  621:iload_2         
	//  318  622:iload           6
	//  319  624:icmpge          653
						if(k[i1] != al2[i1])
	//* 320  627:aload_0         
	//* 321  628:getfield        #85  <Field long[] k>
	//* 322  631:iload_2         
	//* 323  632:laload          
	//* 324  633:aload           18
	//* 325  635:iload_2         
	//* 326  636:laload          
	//* 327  637:lcmp            
	//* 328  638:ifeq            646
						{
							i1 = 1;
	//  329  641:iconst_1        
	//  330  642:istore_2        
							break label2;
	//  331  643:goto            655
						}
						i1++;
	//  332  646:iload_2         
	//  333  647:iconst_1        
	//  334  648:iadd            
	//  335  649:istore_2        
					} while(true);
	//  336  650:goto            621
					i1 = 0;
	//  337  653:iconst_0        
	//  338  654:istore_2        
				}
				al1 = al2;
	//  339  655:aload           18
	//  340  657:astore          16
				j2 = i1;
	//  341  659:iload_2         
	//  342  660:istore          6
				if(i1 != 0)
	//* 343  662:iload_2         
	//* 344  663:ifeq            704
				{
					k = al2;
	//  345  666:aload_0         
	//  346  667:aload           18
	//  347  669:putfield        #85  <Field long[] k>
					al1 = al2;
	//  348  672:aload           18
	//  349  674:astore          16
					j2 = i1;
	//  350  676:iload_2         
	//  351  677:istore          6
				}
				break label0;
	//  352  679:goto            704
			}
			if(k != null)
	//* 353  682:aload_0         
	//* 354  683:getfield        #85  <Field long[] k>
	//* 355  686:ifnull          698
			{
				al1 = null;
	//  356  689:aconst_null     
	//  357  690:astore          16
				j2 = 1;
	//  358  692:iconst_1        
	//  359  693:istore          6
			} else
	//* 360  695:goto            704
			{
				al1 = null;
	//  361  698:aconst_null     
	//  362  699:astore          16
				j2 = 0;
	//  363  701:iconst_0        
	//  364  702:istore          6
			}
		}
label3:
		{
			JSONObject jsonobject2;
label4:
			{
				i1 = l1;
	//  365  704:iload           5
	//  366  706:istore_2        
				if(j2 != 0)
	//* 367  707:iload           6
	//* 368  709:ifeq            723
				{
					k = al1;
	//  369  712:aload_0         
	//  370  713:aload           16
	//  371  715:putfield        #85  <Field long[] k>
					i1 = l1 | 2;
	//  372  718:iload           5
	//  373  720:iconst_2        
	//  374  721:ior             
	//  375  722:istore_2        
				}
				l1 = i1;
	//  376  723:iload_2         
	//  377  724:istore          5
				if(jsonobject.has("customData"))
	//* 378  726:aload_1         
	//* 379  727:ldc1            #234 <String "customData">
	//* 380  729:invokevirtual   #166 <Method boolean JSONObject.has(String)>
	//* 381  732:ifeq            755
				{
					o = jsonobject.getJSONObject("customData");
	//  382  735:aload_0         
	//  383  736:aload_1         
	//  384  737:ldc1            #234 <String "customData">
	//  385  739:invokevirtual   #211 <Method JSONObject JSONObject.getJSONObject(String)>
	//  386  742:putfield        #98  <Field JSONObject o>
					n = null;
	//  387  745:aload_0         
	//  388  746:aconst_null     
	//  389  747:putfield        #91  <Field String n>
					l1 = i1 | 2;
	//  390  750:iload_2         
	//  391  751:iconst_2        
	//  392  752:ior             
	//  393  753:istore          5
				}
				i1 = l1;
	//  394  755:iload           5
	//  395  757:istore_2        
				if(!jsonobject.has("media"))
					break label3;
	//  396  758:aload_1         
	//  397  759:ldc1            #236 <String "media">
	//  398  761:invokevirtual   #166 <Method boolean JSONObject.has(String)>
	//  399  764:ifeq            850
				jsonobject2 = jsonobject.getJSONObject("media");
	//  400  767:aload_1         
	//  401  768:ldc1            #236 <String "media">
	//  402  770:invokevirtual   #211 <Method JSONObject JSONObject.getJSONObject(String)>
	//  403  773:astore          16
				MediaInfo mediainfo2 = new MediaInfo(jsonobject2);
	//  404  775:new             #238 <Class MediaInfo>
	//  405  778:dup             
	//  406  779:aload           16
	//  407  781:invokespecial   #240 <Method void MediaInfo(JSONObject)>
	//  408  784:astore          18
				MediaInfo mediainfo3 = a;
	//  409  786:aload_0         
	//  410  787:getfield        #65  <Field MediaInfo a>
	//  411  790:astore          19
				if(mediainfo3 != null)
	//* 412  792:aload           19
	//* 413  794:ifnull          820
				{
					j2 = l1;
	//  414  797:iload           5
	//  415  799:istore          6
					if(mediainfo3 == null)
						break label4;
	//  416  801:aload           19
	//  417  803:ifnull          832
					j2 = l1;
	//  418  806:iload           5
	//  419  808:istore          6
					if(mediainfo3.equals(((Object) (mediainfo2))))
						break label4;
	//  420  810:aload           19
	//  421  812:aload           18
	//  422  814:invokevirtual   #241 <Method boolean MediaInfo.equals(Object)>
	//  423  817:ifne            832
				}
				a = mediainfo2;
	//  424  820:aload_0         
	//  425  821:aload           18
	//  426  823:putfield        #65  <Field MediaInfo a>
				j2 = l1 | 2;
	//  427  826:iload           5
	//  428  828:iconst_2        
	//  429  829:ior             
	//  430  830:istore          6
			}
			i1 = j2;
	//  431  832:iload           6
	//  432  834:istore_2        
			if(jsonobject2.has("metadata"))
	//* 433  835:aload           16
	//* 434  837:ldc1            #243 <String "metadata">
	//* 435  839:invokevirtual   #166 <Method boolean JSONObject.has(String)>
	//* 436  842:ifeq            850
				i1 = j2 | 4;
	//  437  845:iload           6
	//  438  847:iconst_4        
	//  439  848:ior             
	//  440  849:istore_2        
		}
label5:
		{
label6:
			{
label7:
				{
					l1 = i1;
	//  441  850:iload_2         
	//  442  851:istore          5
					if(jsonobject.has("currentItemId"))
	//* 443  853:aload_1         
	//* 444  854:ldc1            #245 <String "currentItemId">
	//* 445  856:invokevirtual   #166 <Method boolean JSONObject.has(String)>
	//* 446  859:ifeq            893
					{
						int k2 = jsonobject.getInt("currentItemId");
	//  447  862:aload_1         
	//  448  863:ldc1            #245 <String "currentItemId">
	//  449  865:invokevirtual   #249 <Method int JSONObject.getInt(String)>
	//  450  868:istore          6
						l1 = i1;
	//  451  870:iload_2         
	//  452  871:istore          5
						if(c != k2)
	//* 453  873:aload_0         
	//* 454  874:getfield        #69  <Field int c>
	//* 455  877:iload           6
	//* 456  879:icmpeq          893
						{
							c = k2;
	//  457  882:aload_0         
	//  458  883:iload           6
	//  459  885:putfield        #69  <Field int c>
							l1 = i1 | 2;
	//  460  888:iload_2         
	//  461  889:iconst_2        
	//  462  890:ior             
	//  463  891:istore          5
						}
					}
					int l2 = jsonobject.optInt("preloadedItemId", 0);
	//  464  893:aload_1         
	//  465  894:ldc1            #251 <String "preloadedItemId">
	//  466  896:iconst_0        
	//  467  897:invokevirtual   #255 <Method int JSONObject.optInt(String, int)>
	//  468  900:istore          6
					i1 = l1;
	//  469  902:iload           5
	//  470  904:istore_2        
					if(m != l2)
	//* 471  905:aload_0         
	//* 472  906:getfield        #89  <Field int m>
	//* 473  909:iload           6
	//* 474  911:icmpeq          926
					{
						m = l2;
	//  475  914:aload_0         
	//  476  915:iload           6
	//  477  917:putfield        #89  <Field int m>
						i1 = l1 | 0x10;
	//  478  920:iload           5
	//  479  922:bipush          16
	//  480  924:ior             
	//  481  925:istore_2        
					}
					l2 = jsonobject.optInt("loadingItemId", 0);
	//  482  926:aload_1         
	//  483  927:ldc2            #257 <String "loadingItemId">
	//  484  930:iconst_0        
	//  485  931:invokevirtual   #255 <Method int JSONObject.optInt(String, int)>
	//  486  934:istore          6
					l1 = i1;
	//  487  936:iload_2         
	//  488  937:istore          5
					if(l != l2)
	//* 489  939:aload_0         
	//* 490  940:getfield        #87  <Field int l>
	//* 491  943:iload           6
	//* 492  945:icmpeq          959
					{
						l = l2;
	//  493  948:aload_0         
	//  494  949:iload           6
	//  495  951:putfield        #87  <Field int l>
						l1 = i1 | 2;
	//  496  954:iload_2         
	//  497  955:iconst_2        
	//  498  956:ior             
	//  499  957:istore          5
					}
					MediaInfo mediainfo = a;
	//  500  959:aload_0         
	//  501  960:getfield        #65  <Field MediaInfo a>
	//  502  963:astore          16
					l2 = -1;
	//  503  965:iconst_m1       
	//  504  966:istore          6
					if(mediainfo == null)
	//* 505  968:aload           16
	//* 506  970:ifnonnull       978
						i1 = -1;
	//  507  973:iconst_m1       
	//  508  974:istore_2        
					else
	//* 509  975:goto            984
						i1 = mediainfo.b();
	//  510  978:aload           16
	//  511  980:invokevirtual   #258 <Method int MediaInfo.b()>
	//  512  983:istore_2        
					if(a(e, f, l, i1))
						break label6;
	//  513  984:aload_0         
	//  514  985:getfield        #73  <Field int e>
	//  515  988:aload_0         
	//  516  989:getfield        #75  <Field int f>
	//  517  992:aload_0         
	//  518  993:getfield        #87  <Field int l>
	//  519  996:iload_2         
	//  520  997:invokestatic    #260 <Method boolean a(int, int, int, int)>
	//  521 1000:ifne            1564
					if(jsonobject.has("repeatMode"))
	//* 522 1003:aload_1         
	//* 523 1004:ldc2            #262 <String "repeatMode">
	//* 524 1007:invokevirtual   #166 <Method boolean JSONObject.has(String)>
	//* 525 1010:ifeq            1267
					{
						String s3 = jsonobject.getString("repeatMode");
	//  526 1013:aload_1         
	//  527 1014:ldc2            #262 <String "repeatMode">
	//  528 1017:invokevirtual   #170 <Method String JSONObject.getString(String)>
	//  529 1020:astore          18
						Integer integer = ((Integer) (obj));
	//  530 1022:aload           17
	//  531 1024:astore          16
						if(s3 != null)
	//* 532 1026:aload           18
	//* 533 1028:ifnull          1216
						{
							i1 = s3.hashCode();
	//  534 1031:aload           18
	//  535 1033:invokevirtual   #265 <Method int String.hashCode()>
	//  536 1036:istore_2        
							if(i1 != 0xbd57d3ef)
	//* 537 1037:iload_2         
	//* 538 1038:ldc2            #266 <Int 0xbd57d3ef>
	//* 539 1041:icmpeq          1128
							{
								if(i1 != 0xc69b5f6c)
	//* 540 1044:iload_2         
	//* 541 1045:ldc2            #267 <Int 0xc69b5f6c>
	//* 542 1048:icmpeq          1109
								{
									if(i1 != 0x621b08dd)
	//* 543 1051:iload_2         
	//* 544 1052:ldc2            #268 <Int 0x621b08dd>
	//* 545 1055:icmpeq          1090
									{
										if(i1 != 0x621b3cab)
	//* 546 1058:iload_2         
	//* 547 1059:ldc2            #269 <Int 0x621b3cab>
	//* 548 1062:icmpeq          1071
										{
											i1 = l2;
	//  549 1065:iload           6
	//  550 1067:istore_2        
										} else
	//* 551 1068:goto            1144
										{
											i1 = l2;
	//  552 1071:iload           6
	//  553 1073:istore_2        
											if(s3.equals("REPEAT_OFF"))
	//* 554 1074:aload           18
	//* 555 1076:ldc2            #271 <String "REPEAT_OFF">
	//* 556 1079:invokevirtual   #177 <Method boolean String.equals(Object)>
	//* 557 1082:ifeq            1144
												i1 = 0;
	//  558 1085:iconst_0        
	//  559 1086:istore_2        
										}
									} else
	//* 560 1087:goto            1144
									{
										i1 = l2;
	//  561 1090:iload           6
	//  562 1092:istore_2        
										if(s3.equals("REPEAT_ALL"))
	//* 563 1093:aload           18
	//* 564 1095:ldc2            #273 <String "REPEAT_ALL">
	//* 565 1098:invokevirtual   #177 <Method boolean String.equals(Object)>
	//* 566 1101:ifeq            1144
											i1 = 1;
	//  567 1104:iconst_1        
	//  568 1105:istore_2        
									}
								} else
	//* 569 1106:goto            1144
								{
									i1 = l2;
	//  570 1109:iload           6
	//  571 1111:istore_2        
									if(s3.equals("REPEAT_SINGLE"))
	//* 572 1112:aload           18
	//* 573 1114:ldc2            #275 <String "REPEAT_SINGLE">
	//* 574 1117:invokevirtual   #177 <Method boolean String.equals(Object)>
	//* 575 1120:ifeq            1144
										i1 = 2;
	//  576 1123:iconst_2        
	//  577 1124:istore_2        
								}
							} else
	//* 578 1125:goto            1144
							{
								i1 = l2;
	//  579 1128:iload           6
	//  580 1130:istore_2        
								if(s3.equals("REPEAT_ALL_AND_SHUFFLE"))
	//* 581 1131:aload           18
	//* 582 1133:ldc2            #277 <String "REPEAT_ALL_AND_SHUFFLE">
	//* 583 1136:invokevirtual   #177 <Method boolean String.equals(Object)>
	//* 584 1139:ifeq            1144
									i1 = 3;
	//  585 1142:iconst_3        
	//  586 1143:istore_2        
							}
							switch(i1)
	//* 587 1144:iload_2         
							{
	//* 588 1145:tableswitch     0 3: default 1176
	//	               0 1210
	//	               1 1201
	//	               2 1192
	//	               3 1183
							default:
								integer = ((Integer) (obj));
	//  589 1176:aload           17
	//  590 1178:astore          16
								break;

	//* 591 1180:goto            1216
							case 3: // '\003'
								integer = Integer.valueOf(3);
	//  592 1183:iconst_3        
	//  593 1184:invokestatic    #149 <Method Integer Integer.valueOf(int)>
	//  594 1187:astore          16
								break;

	//* 595 1189:goto            1216
							case 2: // '\002'
								integer = Integer.valueOf(2);
	//  596 1192:iconst_2        
	//  597 1193:invokestatic    #149 <Method Integer Integer.valueOf(int)>
	//  598 1196:astore          16
								break;

	//* 599 1198:goto            1216
							case 1: // '\001'
								integer = Integer.valueOf(1);
	//  600 1201:iconst_1        
	//  601 1202:invokestatic    #149 <Method Integer Integer.valueOf(int)>
	//  602 1205:astore          16
								break;

	//* 603 1207:goto            1216
							case 0: // '\0'
								integer = Integer.valueOf(0);
	//  604 1210:iconst_0        
	//  605 1211:invokestatic    #149 <Method Integer Integer.valueOf(int)>
	//  606 1214:astore          16
								break;
							}
						}
						if(integer == null)
	//* 607 1216:aload           16
	//* 608 1218:ifnonnull       1229
							i1 = p;
	//  609 1221:aload_0         
	//  610 1222:getfield        #100 <Field int p>
	//  611 1225:istore_2        
						else
	//* 612 1226:goto            1235
							i1 = integer.intValue();
	//  613 1229:aload           16
	//  614 1231:invokevirtual   #280 <Method int Integer.intValue()>
	//  615 1234:istore_2        
						integer = Integer.valueOf(i1);
	//  616 1235:iload_2         
	//  617 1236:invokestatic    #149 <Method Integer Integer.valueOf(int)>
	//  618 1239:astore          16
						if(p != integer.intValue())
	//* 619 1241:aload_0         
	//* 620 1242:getfield        #100 <Field int p>
	//* 621 1245:aload           16
	//* 622 1247:invokevirtual   #280 <Method int Integer.intValue()>
	//* 623 1250:icmpeq          1267
						{
							p = integer.intValue();
	//  624 1253:aload_0         
	//  625 1254:aload           16
	//  626 1256:invokevirtual   #280 <Method int Integer.intValue()>
	//  627 1259:putfield        #100 <Field int p>
							i1 = 1;
	//  628 1262:iconst_1        
	//  629 1263:istore_2        
							break label7;
	//  630 1264:goto            1269
						}
					}
					i1 = 0;
	//  631 1267:iconst_0        
	//  632 1268:istore_2        
				}
				int i3;
label8:
				{
					i3 = i1;
	//  633 1269:iload_2         
	//  634 1270:istore          6
					if(!jsonobject.has("items"))
						break label8;
	//  635 1272:aload_1         
	//  636 1273:ldc2            #282 <String "items">
	//  637 1276:invokevirtual   #166 <Method boolean JSONObject.has(String)>
	//  638 1279:ifeq            1547
					JSONArray jsonarray1 = jsonobject.getJSONArray("items");
	//  639 1282:aload_1         
	//  640 1283:ldc2            #282 <String "items">
	//  641 1286:invokevirtual   #224 <Method JSONArray JSONObject.getJSONArray(String)>
	//  642 1289:astore          16
					int k3 = jsonarray1.length();
	//  643 1291:aload           16
	//  644 1293:invokevirtual   #229 <Method int JSONArray.length()>
	//  645 1296:istore          7
					SparseArray sparsearray = new SparseArray();
	//  646 1298:new             #60  <Class SparseArray>
	//  647 1301:dup             
	//  648 1302:invokespecial   #61  <Method void SparseArray()>
	//  649 1305:astore          17
					for(i3 = 0; i3 < k3; i3++)
	//* 650 1307:iconst_0        
	//* 651 1308:istore          6
	//* 652 1310:iload           6
	//* 653 1312:iload           7
	//* 654 1314:icmpge          1349
						sparsearray.put(i3, ((Object) (Integer.valueOf(jsonarray1.getJSONObject(i3).getInt("itemId")))));
	//  655 1317:aload           17
	//  656 1319:iload           6
	//  657 1321:aload           16
	//  658 1323:iload           6
	//  659 1325:invokevirtual   #285 <Method JSONObject JSONArray.getJSONObject(int)>
	//  660 1328:ldc2            #287 <String "itemId">
	//  661 1331:invokevirtual   #249 <Method int JSONObject.getInt(String)>
	//  662 1334:invokestatic    #149 <Method Integer Integer.valueOf(int)>
	//  663 1337:invokevirtual   #153 <Method void SparseArray.put(int, Object)>

	//  664 1340:iload           6
	//  665 1342:iconst_1        
	//  666 1343:iadd            
	//  667 1344:istore          6
	//* 668 1346:goto            1310
					MediaQueueItem amediaqueueitem[] = new MediaQueueItem[k3];
	//  669 1349:iload           7
	//  670 1351:anewarray       MediaQueueItem[]
	//  671 1354:astore          18
					for(i3 = 0; i3 < k3; i3++)
	//* 672 1356:iconst_0        
	//* 673 1357:istore          6
	//* 674 1359:iload           6
	//* 675 1361:iload           7
	//* 676 1363:icmpge          1521
					{
label9:
						{
							Integer integer1 = (Integer)sparsearray.get(i3);
	//  677 1366:aload           17
	//  678 1368:iload           6
	//  679 1370:invokevirtual   #291 <Method Object SparseArray.get(int)>
	//  680 1373:checkcast       #145 <Class Integer>
	//  681 1376:astore          20
							JSONObject jsonobject3 = jsonarray1.getJSONObject(i3);
	//  682 1378:aload           16
	//  683 1380:iload           6
	//  684 1382:invokevirtual   #285 <Method JSONObject JSONArray.getJSONObject(int)>
	//  685 1385:astore          19
							MediaQueueItem mediaqueueitem = b(integer1.intValue());
	//  686 1387:aload_0         
	//  687 1388:aload           20
	//  688 1390:invokevirtual   #280 <Method int Integer.intValue()>
	//  689 1393:invokevirtual   #294 <Method MediaQueueItem b(int)>
	//  690 1396:astore          21
							if(mediaqueueitem != null)
	//* 691 1398:aload           21
	//* 692 1400:ifnull          1442
							{
								i1 |= ((int) (mediaqueueitem.a(jsonobject3)));
	//  693 1403:iload_2         
	//  694 1404:aload           21
	//  695 1406:aload           19
	//  696 1408:invokevirtual   #297 <Method boolean MediaQueueItem.a(JSONObject)>
	//  697 1411:ior             
	//  698 1412:istore_2        
								amediaqueueitem[i3] = mediaqueueitem;
	//  699 1413:aload           18
	//  700 1415:iload           6
	//  701 1417:aload           21
	//  702 1419:aastore         
								if(i3 != c(integer1.intValue()).intValue())
	//* 703 1420:iload           6
	//* 704 1422:aload_0         
	//* 705 1423:aload           20
	//* 706 1425:invokevirtual   #280 <Method int Integer.intValue()>
	//* 707 1428:invokevirtual   #299 <Method Integer c(int)>
	//* 708 1431:invokevirtual   #280 <Method int Integer.intValue()>
	//* 709 1434:icmpeq          1512
									i1 = 1;
	//  710 1437:iconst_1        
	//  711 1438:istore_2        
								continue;
	//  712 1439:goto            1512
							}
							if(integer1.intValue() == c)
	//* 713 1442:aload           20
	//* 714 1444:invokevirtual   #280 <Method int Integer.intValue()>
	//* 715 1447:aload_0         
	//* 716 1448:getfield        #69  <Field int c>
	//* 717 1451:icmpne          1496
							{
								MediaInfo mediainfo4 = a;
	//  718 1454:aload_0         
	//  719 1455:getfield        #65  <Field MediaInfo a>
	//  720 1458:astore          20
								if(mediainfo4 != null)
	//* 721 1460:aload           20
	//* 722 1462:ifnull          1496
								{
									amediaqueueitem[i3] = (new o(mediainfo4)).a();
	//  723 1465:aload           18
	//  724 1467:iload           6
	//  725 1469:new             #301 <Class o>
	//  726 1472:dup             
	//  727 1473:aload           20
	//  728 1475:invokespecial   #304 <Method void o(MediaInfo)>
	//  729 1478:invokevirtual   #307 <Method MediaQueueItem o.a()>
	//  730 1481:aastore         
									amediaqueueitem[i3].a(jsonobject3);
	//  731 1482:aload           18
	//  732 1484:iload           6
	//  733 1486:aaload          
	//  734 1487:aload           19
	//  735 1489:invokevirtual   #297 <Method boolean MediaQueueItem.a(JSONObject)>
	//  736 1492:pop             
									break label9;
	//  737 1493:goto            1510
								}
							}
							amediaqueueitem[i3] = new MediaQueueItem(jsonobject3);
	//  738 1496:aload           18
	//  739 1498:iload           6
	//  740 1500:new             #112 <Class MediaQueueItem>
	//  741 1503:dup             
	//  742 1504:aload           19
	//  743 1506:invokespecial   #308 <Method void MediaQueueItem(JSONObject)>
	//  744 1509:aastore         
						}
						i1 = 1;
	//  745 1510:iconst_1        
	//  746 1511:istore_2        
					}

	//  747 1512:iload           6
	//  748 1514:iconst_1        
	//  749 1515:iadd            
	//  750 1516:istore          6
	//* 751 1518:goto            1359
					if(q.size() != k3)
	//* 752 1521:aload_0         
	//* 753 1522:getfield        #58  <Field ArrayList q>
	//* 754 1525:invokevirtual   #309 <Method int ArrayList.size()>
	//* 755 1528:iload           7
	//* 756 1530:icmpeq          1538
						i1 = 1;
	//  757 1533:iconst_1        
	//  758 1534:istore_2        
	//* 759 1535:goto            1538
					a(amediaqueueitem);
	//  760 1538:aload_0         
	//  761 1539:aload           18
	//  762 1541:invokespecial   #121 <Method void a(MediaQueueItem[])>
					i3 = i1;
	//  763 1544:iload_2         
	//  764 1545:istore          6
				}
				i1 = l1;
	//  765 1547:iload           5
	//  766 1549:istore_2        
				if(i3 != 0)
	//* 767 1550:iload           6
	//* 768 1552:ifeq            1617
					i1 = l1 | 8;
	//  769 1555:iload           5
	//  770 1557:bipush          8
	//  771 1559:ior             
	//  772 1560:istore_2        
				break label5;
	//  773 1561:goto            1617
			}
			c = 0;
	//  774 1564:aload_0         
	//  775 1565:iconst_0        
	//  776 1566:putfield        #69  <Field int c>
			l = 0;
	//  777 1569:aload_0         
	//  778 1570:iconst_0        
	//  779 1571:putfield        #87  <Field int l>
			m = 0;
	//  780 1574:aload_0         
	//  781 1575:iconst_0        
	//  782 1576:putfield        #89  <Field int m>
			i1 = l1;
	//  783 1579:iload           5
	//  784 1581:istore_2        
			if(!q.isEmpty())
	//* 785 1582:aload_0         
	//* 786 1583:getfield        #58  <Field ArrayList q>
	//* 787 1586:invokevirtual   #310 <Method boolean ArrayList.isEmpty()>
	//* 788 1589:ifne            1617
			{
				p = 0;
	//  789 1592:aload_0         
	//  790 1593:iconst_0        
	//  791 1594:putfield        #100 <Field int p>
				q.clear();
	//  792 1597:aload_0         
	//  793 1598:getfield        #58  <Field ArrayList q>
	//  794 1601:invokevirtual   #136 <Method void ArrayList.clear()>
				u.clear();
	//  795 1604:aload_0         
	//  796 1605:getfield        #63  <Field SparseArray u>
	//  797 1608:invokevirtual   #137 <Method void SparseArray.clear()>
				i1 = l1 | 8;
	//  798 1611:iload           5
	//  799 1613:bipush          8
	//  800 1615:ior             
	//  801 1616:istore_2        
			}
		}
label10:
		{
			AdBreakStatus adbreakstatus = AdBreakStatus.a(jsonobject.optJSONObject("breakStatus"));
	//  802 1617:aload_1         
	//  803 1618:ldc2            #312 <String "breakStatus">
	//  804 1621:invokevirtual   #315 <Method JSONObject JSONObject.optJSONObject(String)>
	//  805 1624:invokestatic    #320 <Method AdBreakStatus AdBreakStatus.a(JSONObject)>
	//  806 1627:astore          16
			if(s != null || adbreakstatus == null)
	//* 807 1629:aload_0         
	//* 808 1630:getfield        #125 <Field AdBreakStatus s>
	//* 809 1633:ifnonnull       1641
	//* 810 1636:aload           16
	//* 811 1638:ifnonnull       1668
			{
				AdBreakStatus adbreakstatus1 = s;
	//  812 1641:aload_0         
	//  813 1642:getfield        #125 <Field AdBreakStatus s>
	//  814 1645:astore          17
				l1 = i1;
	//  815 1647:iload_2         
	//  816 1648:istore          5
				if(adbreakstatus1 == null)
					break label10;
	//  817 1650:aload           17
	//  818 1652:ifnull          1694
				l1 = i1;
	//  819 1655:iload_2         
	//  820 1656:istore          5
				if(adbreakstatus1.equals(((Object) (adbreakstatus))))
					break label10;
	//  821 1658:aload           17
	//  822 1660:aload           16
	//  823 1662:invokevirtual   #321 <Method boolean AdBreakStatus.equals(Object)>
	//  824 1665:ifne            1694
			}
			if(adbreakstatus != null)
	//* 825 1668:aload           16
	//* 826 1670:ifnull          1676
				flag = true;
	//  827 1673:iconst_1        
	//  828 1674:istore          14
			r = flag;
	//  829 1676:aload_0         
	//  830 1677:iload           14
	//  831 1679:putfield        #123 <Field boolean r>
			s = adbreakstatus;
	//  832 1682:aload_0         
	//  833 1683:aload           16
	//  834 1685:putfield        #125 <Field AdBreakStatus s>
			l1 = i1 | 0x20;
	//  835 1688:iload_2         
	//  836 1689:bipush          32
	//  837 1691:ior             
	//  838 1692:istore          5
		}
label11:
		{
			VideoInfo videoinfo = VideoInfo.a(jsonobject.optJSONObject("videoInfo"));
	//  839 1694:aload_1         
	//  840 1695:ldc2            #323 <String "videoInfo">
	//  841 1698:invokevirtual   #315 <Method JSONObject JSONObject.optJSONObject(String)>
	//  842 1701:invokestatic    #328 <Method VideoInfo VideoInfo.a(JSONObject)>
	//  843 1704:astore          16
			if(t != null || videoinfo == null)
	//* 844 1706:aload_0         
	//* 845 1707:getfield        #127 <Field VideoInfo t>
	//* 846 1710:ifnonnull       1718
	//* 847 1713:aload           16
	//* 848 1715:ifnonnull       1745
			{
				VideoInfo videoinfo1 = t;
	//  849 1718:aload_0         
	//  850 1719:getfield        #127 <Field VideoInfo t>
	//  851 1722:astore          17
				i1 = l1;
	//  852 1724:iload           5
	//  853 1726:istore_2        
				if(videoinfo1 == null)
					break label11;
	//  854 1727:aload           17
	//  855 1729:ifnull          1757
				i1 = l1;
	//  856 1732:iload           5
	//  857 1734:istore_2        
				if(videoinfo1.equals(((Object) (videoinfo))))
					break label11;
	//  858 1735:aload           17
	//  859 1737:aload           16
	//  860 1739:invokevirtual   #329 <Method boolean VideoInfo.equals(Object)>
	//  861 1742:ifne            1757
			}
			t = videoinfo;
	//  862 1745:aload_0         
	//  863 1746:aload           16
	//  864 1748:putfield        #127 <Field VideoInfo t>
			i1 = l1 | 0x40;
	//  865 1751:iload           5
	//  866 1753:bipush          64
	//  867 1755:ior             
	//  868 1756:istore_2        
		}
		l1 = i1;
	//  869 1757:iload_2         
	//  870 1758:istore          5
		if(jsonobject.has("breakInfo"))
	//* 871 1760:aload_1         
	//* 872 1761:ldc2            #331 <String "breakInfo">
	//* 873 1764:invokevirtual   #166 <Method boolean JSONObject.has(String)>
	//* 874 1767:ifeq            1801
		{
			MediaInfo mediainfo1 = a;
	//  875 1770:aload_0         
	//  876 1771:getfield        #65  <Field MediaInfo a>
	//  877 1774:astore          16
			l1 = i1;
	//  878 1776:iload_2         
	//  879 1777:istore          5
			if(mediainfo1 != null)
	//* 880 1779:aload           16
	//* 881 1781:ifnull          1801
			{
				mediainfo1.a(jsonobject.getJSONObject("breakInfo"));
	//  882 1784:aload           16
	//  883 1786:aload_1         
	//  884 1787:ldc2            #331 <String "breakInfo">
	//  885 1790:invokevirtual   #211 <Method JSONObject JSONObject.getJSONObject(String)>
	//  886 1793:invokevirtual   #333 <Method void MediaInfo.a(JSONObject)>
				l1 = i1 | 2;
	//  887 1796:iload_2         
	//  888 1797:iconst_2        
	//  889 1798:ior             
	//  890 1799:istore          5
			}
		}
		return l1;
	//  891 1801:iload           5
	//  892 1803:ireturn         
	}

	public final long a()
	{
		return b;
	//    0    0:aload_0         
	//    1    1:getfield        #67  <Field long b>
	//    2    4:lreturn         
	}

	public MediaQueueItem a(int i1)
	{
		return b(i1);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #294 <Method MediaQueueItem b(int)>
	//    3    5:areturn         
	}

	public final void a(boolean flag)
	{
		r = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #123 <Field boolean r>
	//    3    5:return          
	}

	public int b()
	{
		return e;
	//    0    0:aload_0         
	//    1    1:getfield        #73  <Field int e>
	//    2    4:ireturn         
	}

	public MediaQueueItem b(int i1)
	{
		Integer integer = (Integer)u.get(i1);
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field SparseArray u>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #291 <Method Object SparseArray.get(int)>
	//    4    8:checkcast       #145 <Class Integer>
	//    5   11:astore_2        
		if(integer == null)
	//*   6   12:aload_2         
	//*   7   13:ifnonnull       18
			return null;
	//    8   16:aconst_null     
	//    9   17:areturn         
		else
			return (MediaQueueItem)q.get(integer.intValue());
	//   10   18:aload_0         
	//   11   19:getfield        #58  <Field ArrayList q>
	//   12   22:aload_2         
	//   13   23:invokevirtual   #280 <Method int Integer.intValue()>
	//   14   26:invokevirtual   #336 <Method Object ArrayList.get(int)>
	//   15   29:checkcast       #112 <Class MediaQueueItem>
	//   16   32:areturn         
	}

	public int c()
	{
		return f;
	//    0    0:aload_0         
	//    1    1:getfield        #75  <Field int f>
	//    2    4:ireturn         
	}

	public Integer c(int i1)
	{
		return (Integer)u.get(i1);
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field SparseArray u>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #291 <Method Object SparseArray.get(int)>
	//    4    8:checkcast       #145 <Class Integer>
	//    5   11:areturn         
	}

	public double d()
	{
		return d;
	//    0    0:aload_0         
	//    1    1:getfield        #71  <Field double d>
	//    2    4:dreturn         
	}

	public MediaInfo e()
	{
		return a;
	//    0    0:aload_0         
	//    1    1:getfield        #65  <Field MediaInfo a>
	//    2    4:areturn         
	}

	public boolean equals(Object obj)
	{
label0:
		{
			boolean flag;
label1:
			{
				if(this == obj)
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:if_acmpne       7
					return true;
	//    3    5:iconst_1        
	//    4    6:ireturn         
				if(!(obj instanceof MediaStatus))
	//*   5    7:aload_1         
	//*   6    8:instanceof      #2   <Class MediaStatus>
	//*   7   11:ifne            16
					return false;
	//    8   14:iconst_0        
	//    9   15:ireturn         
				obj = ((Object) ((MediaStatus)obj));
	//   10   16:aload_1         
	//   11   17:checkcast       #2   <Class MediaStatus>
	//   12   20:astore_1        
				if(o == null)
	//*  13   21:aload_0         
	//*  14   22:getfield        #98  <Field JSONObject o>
	//*  15   25:ifnonnull       33
					flag = true;
	//   16   28:iconst_1        
	//   17   29:istore_2        
				else
	//*  18   30:goto            35
					flag = false;
	//   19   33:iconst_0        
	//   20   34:istore_2        
				boolean flag1;
				if(((MediaStatus) (obj)).o == null)
	//*  21   35:aload_1         
	//*  22   36:getfield        #98  <Field JSONObject o>
	//*  23   39:ifnonnull       47
					flag1 = true;
	//   24   42:iconst_1        
	//   25   43:istore_3        
				else
	//*  26   44:goto            49
					flag1 = false;
	//   27   47:iconst_0        
	//   28   48:istore_3        
				if(flag != flag1)
	//*  29   49:iload_2         
	//*  30   50:iload_3         
	//*  31   51:icmpeq          56
					return false;
	//   32   54:iconst_0        
	//   33   55:ireturn         
				if(b != ((MediaStatus) (obj)).b || c != ((MediaStatus) (obj)).c || d != ((MediaStatus) (obj)).d || e != ((MediaStatus) (obj)).e || f != ((MediaStatus) (obj)).f || g != ((MediaStatus) (obj)).g || i != ((MediaStatus) (obj)).i || j != ((MediaStatus) (obj)).j || l != ((MediaStatus) (obj)).l || m != ((MediaStatus) (obj)).m || p != ((MediaStatus) (obj)).p || !Arrays.equals(k, ((MediaStatus) (obj)).k) || !aj.a(((Object) (Long.valueOf(h))), ((Object) (Long.valueOf(((MediaStatus) (obj)).h)))) || !aj.a(((Object) (q)), ((Object) (((MediaStatus) (obj)).q))) || !aj.a(((Object) (a)), ((Object) (((MediaStatus) (obj)).a))))
					break label0;
	//   34   56:aload_0         
	//   35   57:getfield        #67  <Field long b>
	//   36   60:aload_1         
	//   37   61:getfield        #67  <Field long b>
	//   38   64:lcmp            
	//   39   65:ifne            343
	//   40   68:aload_0         
	//   41   69:getfield        #69  <Field int c>
	//   42   72:aload_1         
	//   43   73:getfield        #69  <Field int c>
	//   44   76:icmpne          343
	//   45   79:aload_0         
	//   46   80:getfield        #71  <Field double d>
	//   47   83:aload_1         
	//   48   84:getfield        #71  <Field double d>
	//   49   87:dcmpl           
	//   50   88:ifne            343
	//   51   91:aload_0         
	//   52   92:getfield        #73  <Field int e>
	//   53   95:aload_1         
	//   54   96:getfield        #73  <Field int e>
	//   55   99:icmpne          343
	//   56  102:aload_0         
	//   57  103:getfield        #75  <Field int f>
	//   58  106:aload_1         
	//   59  107:getfield        #75  <Field int f>
	//   60  110:icmpne          343
	//   61  113:aload_0         
	//   62  114:getfield        #77  <Field long g>
	//   63  117:aload_1         
	//   64  118:getfield        #77  <Field long g>
	//   65  121:lcmp            
	//   66  122:ifne            343
	//   67  125:aload_0         
	//   68  126:getfield        #81  <Field double i>
	//   69  129:aload_1         
	//   70  130:getfield        #81  <Field double i>
	//   71  133:dcmpl           
	//   72  134:ifne            343
	//   73  137:aload_0         
	//   74  138:getfield        #83  <Field boolean j>
	//   75  141:aload_1         
	//   76  142:getfield        #83  <Field boolean j>
	//   77  145:icmpne          343
	//   78  148:aload_0         
	//   79  149:getfield        #87  <Field int l>
	//   80  152:aload_1         
	//   81  153:getfield        #87  <Field int l>
	//   82  156:icmpne          343
	//   83  159:aload_0         
	//   84  160:getfield        #89  <Field int m>
	//   85  163:aload_1         
	//   86  164:getfield        #89  <Field int m>
	//   87  167:icmpne          343
	//   88  170:aload_0         
	//   89  171:getfield        #100 <Field int p>
	//   90  174:aload_1         
	//   91  175:getfield        #100 <Field int p>
	//   92  178:icmpne          343
	//   93  181:aload_0         
	//   94  182:getfield        #85  <Field long[] k>
	//   95  185:aload_1         
	//   96  186:getfield        #85  <Field long[] k>
	//   97  189:invokestatic    #343 <Method boolean Arrays.equals(long[], long[])>
	//   98  192:ifeq            343
	//   99  195:aload_0         
	//  100  196:getfield        #79  <Field long h>
	//  101  199:invokestatic    #348 <Method Long Long.valueOf(long)>
	//  102  202:aload_1         
	//  103  203:getfield        #79  <Field long h>
	//  104  206:invokestatic    #348 <Method Long Long.valueOf(long)>
	//  105  209:invokestatic    #353 <Method boolean aj.a(Object, Object)>
	//  106  212:ifeq            343
	//  107  215:aload_0         
	//  108  216:getfield        #58  <Field ArrayList q>
	//  109  219:aload_1         
	//  110  220:getfield        #58  <Field ArrayList q>
	//  111  223:invokestatic    #353 <Method boolean aj.a(Object, Object)>
	//  112  226:ifeq            343
	//  113  229:aload_0         
	//  114  230:getfield        #65  <Field MediaInfo a>
	//  115  233:aload_1         
	//  116  234:getfield        #65  <Field MediaInfo a>
	//  117  237:invokestatic    #353 <Method boolean aj.a(Object, Object)>
	//  118  240:ifeq            343
				JSONObject jsonobject = o;
	//  119  243:aload_0         
	//  120  244:getfield        #98  <Field JSONObject o>
	//  121  247:astore          4
				if(jsonobject != null)
	//* 122  249:aload           4
	//* 123  251:ifnull          280
				{
					JSONObject jsonobject1 = ((MediaStatus) (obj)).o;
	//  124  254:aload_1         
	//  125  255:getfield        #98  <Field JSONObject o>
	//  126  258:astore          5
					if(jsonobject1 != null && !com.google.android.gms.common.util.l.a(((Object) (jsonobject)), ((Object) (jsonobject1))))
	//* 127  260:aload           5
	//* 128  262:ifnull          280
	//* 129  265:aload           4
	//* 130  267:aload           5
	//* 131  269:invokestatic    #356 <Method boolean l.a(Object, Object)>
	//* 132  272:ifne            280
					{
						flag = false;
	//  133  275:iconst_0        
	//  134  276:istore_2        
						break label1;
	//  135  277:goto            282
					}
				}
				flag = true;
	//  136  280:iconst_1        
	//  137  281:istore_2        
			}
			if(flag && r == ((MediaStatus) (obj)).o() && aj.a(((Object) (s)), ((Object) (((MediaStatus) (obj)).s))) && aj.a(((Object) (t)), ((Object) (((MediaStatus) (obj)).t))) && aj.a(((Object) (null)), ((Object) (null))) && ak.a(((Object) (null)), ((Object) (null))))
	//* 138  282:iload_2         
	//* 139  283:ifeq            343
	//* 140  286:aload_0         
	//* 141  287:getfield        #123 <Field boolean r>
	//* 142  290:aload_1         
	//* 143  291:invokevirtual   #358 <Method boolean o()>
	//* 144  294:icmpne          343
	//* 145  297:aload_0         
	//* 146  298:getfield        #125 <Field AdBreakStatus s>
	//* 147  301:aload_1         
	//* 148  302:getfield        #125 <Field AdBreakStatus s>
	//* 149  305:invokestatic    #353 <Method boolean aj.a(Object, Object)>
	//* 150  308:ifeq            343
	//* 151  311:aload_0         
	//* 152  312:getfield        #127 <Field VideoInfo t>
	//* 153  315:aload_1         
	//* 154  316:getfield        #127 <Field VideoInfo t>
	//* 155  319:invokestatic    #353 <Method boolean aj.a(Object, Object)>
	//* 156  322:ifeq            343
	//* 157  325:aconst_null     
	//* 158  326:aconst_null     
	//* 159  327:invokestatic    #353 <Method boolean aj.a(Object, Object)>
	//* 160  330:ifeq            343
	//* 161  333:aconst_null     
	//* 162  334:aconst_null     
	//* 163  335:invokestatic    #361 <Method boolean ak.a(Object, Object)>
	//* 164  338:ifeq            343
				return true;
	//  165  341:iconst_1        
	//  166  342:ireturn         
		}
		return false;
	//  167  343:iconst_0        
	//  168  344:ireturn         
	}

	public long f()
	{
		return g;
	//    0    0:aload_0         
	//    1    1:getfield        #77  <Field long g>
	//    2    4:lreturn         
	}

	public double g()
	{
		return i;
	//    0    0:aload_0         
	//    1    1:getfield        #81  <Field double i>
	//    2    4:dreturn         
	}

	public boolean h()
	{
		return j;
	//    0    0:aload_0         
	//    1    1:getfield        #83  <Field boolean j>
	//    2    4:ireturn         
	}

	public int hashCode()
	{
		return ak.a(new Object[] {
			a, Long.valueOf(b), Integer.valueOf(c), Double.valueOf(d), Integer.valueOf(e), Integer.valueOf(f), Long.valueOf(g), Long.valueOf(h), Double.valueOf(i), Boolean.valueOf(j), 
			Integer.valueOf(Arrays.hashCode(k)), Integer.valueOf(l), Integer.valueOf(m), String.valueOf(((Object) (o))), Integer.valueOf(p), q, Boolean.valueOf(r), s, t, null, 
			null
		});
	//    0    0:bipush          21
	//    1    2:anewarray       Object[]
	//    2    5:dup             
	//    3    6:iconst_0        
	//    4    7:aload_0         
	//    5    8:getfield        #65  <Field MediaInfo a>
	//    6   11:aastore         
	//    7   12:dup             
	//    8   13:iconst_1        
	//    9   14:aload_0         
	//   10   15:getfield        #67  <Field long b>
	//   11   18:invokestatic    #348 <Method Long Long.valueOf(long)>
	//   12   21:aastore         
	//   13   22:dup             
	//   14   23:iconst_2        
	//   15   24:aload_0         
	//   16   25:getfield        #69  <Field int c>
	//   17   28:invokestatic    #149 <Method Integer Integer.valueOf(int)>
	//   18   31:aastore         
	//   19   32:dup             
	//   20   33:iconst_3        
	//   21   34:aload_0         
	//   22   35:getfield        #71  <Field double d>
	//   23   38:invokestatic    #368 <Method Double Double.valueOf(double)>
	//   24   41:aastore         
	//   25   42:dup             
	//   26   43:iconst_4        
	//   27   44:aload_0         
	//   28   45:getfield        #73  <Field int e>
	//   29   48:invokestatic    #149 <Method Integer Integer.valueOf(int)>
	//   30   51:aastore         
	//   31   52:dup             
	//   32   53:iconst_5        
	//   33   54:aload_0         
	//   34   55:getfield        #75  <Field int f>
	//   35   58:invokestatic    #149 <Method Integer Integer.valueOf(int)>
	//   36   61:aastore         
	//   37   62:dup             
	//   38   63:bipush          6
	//   39   65:aload_0         
	//   40   66:getfield        #77  <Field long g>
	//   41   69:invokestatic    #348 <Method Long Long.valueOf(long)>
	//   42   72:aastore         
	//   43   73:dup             
	//   44   74:bipush          7
	//   45   76:aload_0         
	//   46   77:getfield        #79  <Field long h>
	//   47   80:invokestatic    #348 <Method Long Long.valueOf(long)>
	//   48   83:aastore         
	//   49   84:dup             
	//   50   85:bipush          8
	//   51   87:aload_0         
	//   52   88:getfield        #81  <Field double i>
	//   53   91:invokestatic    #368 <Method Double Double.valueOf(double)>
	//   54   94:aastore         
	//   55   95:dup             
	//   56   96:bipush          9
	//   57   98:aload_0         
	//   58   99:getfield        #83  <Field boolean j>
	//   59  102:invokestatic    #373 <Method Boolean Boolean.valueOf(boolean)>
	//   60  105:aastore         
	//   61  106:dup             
	//   62  107:bipush          10
	//   63  109:aload_0         
	//   64  110:getfield        #85  <Field long[] k>
	//   65  113:invokestatic    #376 <Method int Arrays.hashCode(long[])>
	//   66  116:invokestatic    #149 <Method Integer Integer.valueOf(int)>
	//   67  119:aastore         
	//   68  120:dup             
	//   69  121:bipush          11
	//   70  123:aload_0         
	//   71  124:getfield        #87  <Field int l>
	//   72  127:invokestatic    #149 <Method Integer Integer.valueOf(int)>
	//   73  130:aastore         
	//   74  131:dup             
	//   75  132:bipush          12
	//   76  134:aload_0         
	//   77  135:getfield        #89  <Field int m>
	//   78  138:invokestatic    #149 <Method Integer Integer.valueOf(int)>
	//   79  141:aastore         
	//   80  142:dup             
	//   81  143:bipush          13
	//   82  145:aload_0         
	//   83  146:getfield        #98  <Field JSONObject o>
	//   84  149:invokestatic    #379 <Method String String.valueOf(Object)>
	//   85  152:aastore         
	//   86  153:dup             
	//   87  154:bipush          14
	//   88  156:aload_0         
	//   89  157:getfield        #100 <Field int p>
	//   90  160:invokestatic    #149 <Method Integer Integer.valueOf(int)>
	//   91  163:aastore         
	//   92  164:dup             
	//   93  165:bipush          15
	//   94  167:aload_0         
	//   95  168:getfield        #58  <Field ArrayList q>
	//   96  171:aastore         
	//   97  172:dup             
	//   98  173:bipush          16
	//   99  175:aload_0         
	//  100  176:getfield        #123 <Field boolean r>
	//  101  179:invokestatic    #373 <Method Boolean Boolean.valueOf(boolean)>
	//  102  182:aastore         
	//  103  183:dup             
	//  104  184:bipush          17
	//  105  186:aload_0         
	//  106  187:getfield        #125 <Field AdBreakStatus s>
	//  107  190:aastore         
	//  108  191:dup             
	//  109  192:bipush          18
	//  110  194:aload_0         
	//  111  195:getfield        #127 <Field VideoInfo t>
	//  112  198:aastore         
	//  113  199:dup             
	//  114  200:bipush          19
	//  115  202:aconst_null     
	//  116  203:aastore         
	//  117  204:dup             
	//  118  205:bipush          20
	//  119  207:aconst_null     
	//  120  208:aastore         
	//  121  209:invokestatic    #382 <Method int ak.a(Object[])>
	//  122  212:ireturn         
	}

	public long[] i()
	{
		return k;
	//    0    0:aload_0         
	//    1    1:getfield        #85  <Field long[] k>
	//    2    4:areturn         
	}

	public int j()
	{
		return c;
	//    0    0:aload_0         
	//    1    1:getfield        #69  <Field int c>
	//    2    4:ireturn         
	}

	public int k()
	{
		return l;
	//    0    0:aload_0         
	//    1    1:getfield        #87  <Field int l>
	//    2    4:ireturn         
	}

	public int l()
	{
		return m;
	//    0    0:aload_0         
	//    1    1:getfield        #89  <Field int m>
	//    2    4:ireturn         
	}

	public int m()
	{
		return p;
	//    0    0:aload_0         
	//    1    1:getfield        #100 <Field int p>
	//    2    4:ireturn         
	}

	public int n()
	{
		return q.size();
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field ArrayList q>
	//    2    4:invokevirtual   #309 <Method int ArrayList.size()>
	//    3    7:ireturn         
	}

	public boolean o()
	{
		return r;
	//    0    0:aload_0         
	//    1    1:getfield        #123 <Field boolean r>
	//    2    4:ireturn         
	}

	public AdBreakStatus p()
	{
		return s;
	//    0    0:aload_0         
	//    1    1:getfield        #125 <Field AdBreakStatus s>
	//    2    4:areturn         
	}

	public VideoInfo q()
	{
		return t;
	//    0    0:aload_0         
	//    1    1:getfield        #127 <Field VideoInfo t>
	//    2    4:areturn         
	}

	public void writeToParcel(Parcel parcel, int i1)
	{
		Object obj = ((Object) (o));
	//    0    0:aload_0         
	//    1    1:getfield        #98  <Field JSONObject o>
	//    2    4:astore          4
		if(obj == null)
	//*   3    6:aload           4
	//*   4    8:ifnonnull       17
			obj = null;
	//    5   11:aconst_null     
	//    6   12:astore          4
		else
	//*   7   14:goto            24
			obj = ((Object) (((JSONObject) (obj)).toString()));
	//    8   17:aload           4
	//    9   19:invokevirtual   #391 <Method String JSONObject.toString()>
	//   10   22:astore          4
		n = ((String) (obj));
	//   11   24:aload_0         
	//   12   25:aload           4
	//   13   27:putfield        #91  <Field String n>
		int j1 = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
	//   14   30:aload_1         
	//   15   31:invokestatic    #396 <Method int c.a(Parcel)>
	//   16   34:istore_3        
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 2, ((android.os.Parcelable) (e())), i1, false);
	//   17   35:aload_1         
	//   18   36:iconst_2        
	//   19   37:aload_0         
	//   20   38:invokevirtual   #398 <Method MediaInfo e()>
	//   21   41:iload_2         
	//   22   42:iconst_0        
	//   23   43:invokestatic    #401 <Method void c.a(Parcel, int, android.os.Parcelable, int, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 3, b);
	//   24   46:aload_1         
	//   25   47:iconst_3        
	//   26   48:aload_0         
	//   27   49:getfield        #67  <Field long b>
	//   28   52:invokestatic    #404 <Method void c.a(Parcel, int, long)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 4, j());
	//   29   55:aload_1         
	//   30   56:iconst_4        
	//   31   57:aload_0         
	//   32   58:invokevirtual   #406 <Method int j()>
	//   33   61:invokestatic    #409 <Method void c.a(Parcel, int, int)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 5, d());
	//   34   64:aload_1         
	//   35   65:iconst_5        
	//   36   66:aload_0         
	//   37   67:invokevirtual   #411 <Method double d()>
	//   38   70:invokestatic    #414 <Method void c.a(Parcel, int, double)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 6, b());
	//   39   73:aload_1         
	//   40   74:bipush          6
	//   41   76:aload_0         
	//   42   77:invokevirtual   #415 <Method int b()>
	//   43   80:invokestatic    #409 <Method void c.a(Parcel, int, int)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 7, c());
	//   44   83:aload_1         
	//   45   84:bipush          7
	//   46   86:aload_0         
	//   47   87:invokevirtual   #417 <Method int c()>
	//   48   90:invokestatic    #409 <Method void c.a(Parcel, int, int)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 8, f());
	//   49   93:aload_1         
	//   50   94:bipush          8
	//   51   96:aload_0         
	//   52   97:invokevirtual   #419 <Method long f()>
	//   53  100:invokestatic    #404 <Method void c.a(Parcel, int, long)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 9, h);
	//   54  103:aload_1         
	//   55  104:bipush          9
	//   56  106:aload_0         
	//   57  107:getfield        #79  <Field long h>
	//   58  110:invokestatic    #404 <Method void c.a(Parcel, int, long)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 10, g());
	//   59  113:aload_1         
	//   60  114:bipush          10
	//   61  116:aload_0         
	//   62  117:invokevirtual   #421 <Method double g()>
	//   63  120:invokestatic    #414 <Method void c.a(Parcel, int, double)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 11, h());
	//   64  123:aload_1         
	//   65  124:bipush          11
	//   66  126:aload_0         
	//   67  127:invokevirtual   #423 <Method boolean h()>
	//   68  130:invokestatic    #426 <Method void c.a(Parcel, int, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 12, i(), false);
	//   69  133:aload_1         
	//   70  134:bipush          12
	//   71  136:aload_0         
	//   72  137:invokevirtual   #428 <Method long[] i()>
	//   73  140:iconst_0        
	//   74  141:invokestatic    #431 <Method void c.a(Parcel, int, long[], boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 13, k());
	//   75  144:aload_1         
	//   76  145:bipush          13
	//   77  147:aload_0         
	//   78  148:invokevirtual   #433 <Method int k()>
	//   79  151:invokestatic    #409 <Method void c.a(Parcel, int, int)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 14, l());
	//   80  154:aload_1         
	//   81  155:bipush          14
	//   82  157:aload_0         
	//   83  158:invokevirtual   #435 <Method int l()>
	//   84  161:invokestatic    #409 <Method void c.a(Parcel, int, int)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 15, n, false);
	//   85  164:aload_1         
	//   86  165:bipush          15
	//   87  167:aload_0         
	//   88  168:getfield        #91  <Field String n>
	//   89  171:iconst_0        
	//   90  172:invokestatic    #438 <Method void c.a(Parcel, int, String, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 16, p);
	//   91  175:aload_1         
	//   92  176:bipush          16
	//   93  178:aload_0         
	//   94  179:getfield        #100 <Field int p>
	//   95  182:invokestatic    #409 <Method void c.a(Parcel, int, int)>
		com.google.android.gms.common.internal.safeparcel.c.c(parcel, 17, ((List) (q)), false);
	//   96  185:aload_1         
	//   97  186:bipush          17
	//   98  188:aload_0         
	//   99  189:getfield        #58  <Field ArrayList q>
	//  100  192:iconst_0        
	//  101  193:invokestatic    #441 <Method void c.c(Parcel, int, List, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 18, o());
	//  102  196:aload_1         
	//  103  197:bipush          18
	//  104  199:aload_0         
	//  105  200:invokevirtual   #358 <Method boolean o()>
	//  106  203:invokestatic    #426 <Method void c.a(Parcel, int, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 19, ((android.os.Parcelable) (p())), i1, false);
	//  107  206:aload_1         
	//  108  207:bipush          19
	//  109  209:aload_0         
	//  110  210:invokevirtual   #443 <Method AdBreakStatus p()>
	//  111  213:iload_2         
	//  112  214:iconst_0        
	//  113  215:invokestatic    #401 <Method void c.a(Parcel, int, android.os.Parcelable, int, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 20, ((android.os.Parcelable) (q())), i1, false);
	//  114  218:aload_1         
	//  115  219:bipush          20
	//  116  221:aload_0         
	//  117  222:invokevirtual   #445 <Method VideoInfo q()>
	//  118  225:iload_2         
	//  119  226:iconst_0        
	//  120  227:invokestatic    #401 <Method void c.a(Parcel, int, android.os.Parcelable, int, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, j1);
	//  121  230:aload_1         
	//  122  231:iload_3         
	//  123  232:invokestatic    #447 <Method void c.a(Parcel, int)>
	//  124  235:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new ae();
	private MediaInfo a;
	private long b;
	private int c;
	private double d;
	private int e;
	private int f;
	private long g;
	private long h;
	private double i;
	private boolean j;
	private long k[];
	private int l;
	private int m;
	private String n;
	private JSONObject o;
	private int p;
	private final ArrayList q;
	private boolean r;
	private AdBreakStatus s;
	private VideoInfo t;
	private final SparseArray u;

	static 
	{
	//    0    0:new             #43  <Class ae>
	//    1    3:dup             
	//    2    4:invokespecial   #46  <Method void ae()>
	//    3    7:putstatic       #48  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
