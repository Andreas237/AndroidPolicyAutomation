// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.cast;

import android.os.Parcel;
import com.google.android.gms.common.internal.ak;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.c;
import com.google.android.gms.common.util.l;
import com.google.android.gms.internal.cast.aj;
import java.util.Arrays;
import org.json.*;

// Referenced classes of package com.google.android.gms.cast:
//			aa, MediaInfo, z

public class MediaQueueItem extends AbstractSafeParcelable
{

	private MediaQueueItem(MediaInfo mediainfo)
	{
		this(mediainfo, 0, true, 0.0D, (1.0D / 0.0D), 0.0D, ((long []) (null)), ((String) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:iconst_1        
	//    4    4:dconst_0        
	//    5    5:ldc2w           #34  <Double (1.0D / 0.0D)>
	//    6    8:dconst_0        
	//    7    9:aconst_null     
	//    8   10:aconst_null     
	//    9   11:invokespecial   #38  <Method void MediaQueueItem(MediaInfo, int, boolean, double, double, double, long[], String)>
		if(mediainfo != null)
	//*  10   14:aload_1         
	//*  11   15:ifnull          19
			return;
	//   12   18:return          
		else
			throw new IllegalArgumentException("media cannot be null.");
	//   13   19:new             #40  <Class IllegalArgumentException>
	//   14   22:dup             
	//   15   23:ldc1            #42  <String "media cannot be null.">
	//   16   25:invokespecial   #45  <Method void IllegalArgumentException(String)>
	//   17   28:athrow          
	}

	MediaQueueItem(MediaInfo mediainfo, int j, boolean flag, double d1, double d2, 
			double d3, long al[], String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #48  <Method void AbstractSafeParcelable()>
		a = mediainfo;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #50  <Field MediaInfo a>
		b = j;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #52  <Field int b>
		c = flag;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #54  <Field boolean c>
		d = d1;
	//   11   19:aload_0         
	//   12   20:dload           4
	//   13   22:putfield        #56  <Field double d>
		e = d2;
	//   14   25:aload_0         
	//   15   26:dload           6
	//   16   28:putfield        #58  <Field double e>
		f = d3;
	//   17   31:aload_0         
	//   18   32:dload           8
	//   19   34:putfield        #60  <Field double f>
		g = al;
	//   20   37:aload_0         
	//   21   38:aload           10
	//   22   40:putfield        #62  <Field long[] g>
		h = s;
	//   23   43:aload_0         
	//   24   44:aload           11
	//   25   46:putfield        #64  <Field String h>
		mediainfo = ((MediaInfo) (h));
	//   26   49:aload_0         
	//   27   50:getfield        #64  <Field String h>
	//   28   53:astore_1        
		if(mediainfo != null)
	//*  29   54:aload_1         
	//*  30   55:ifnull          82
		{
			try
			{
				i = new JSONObject(((String) (mediainfo)));
	//   31   58:aload_0         
	//   32   59:new             #66  <Class JSONObject>
	//   33   62:dup             
	//   34   63:aload_1         
	//   35   64:invokespecial   #67  <Method void JSONObject(String)>
	//   36   67:putfield        #69  <Field JSONObject i>
				return;
	//   37   70:return          
			}
	//*  38   71:aload_0         
	//*  39   72:aconst_null     
	//*  40   73:putfield        #69  <Field JSONObject i>
	//*  41   76:aload_0         
	//*  42   77:aconst_null     
	//*  43   78:putfield        #64  <Field String h>
	//*  44   81:return          
	//*  45   82:aload_0         
	//*  46   83:aconst_null     
	//*  47   84:putfield        #69  <Field JSONObject i>
	//*  48   87:return          
			// Misplaced declaration of an exception variable
			catch(MediaInfo mediainfo)
			{
				i = null;
			}
			h = null;
			return;
		} else
		{
			i = null;
			return;
		}
	//*  49   88:astore_1        
	//*  50   89:goto            71
	}

	MediaQueueItem(MediaInfo mediainfo, z z)
	{
		this(mediainfo);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #72  <Method void MediaQueueItem(MediaInfo)>
	//    3    5:return          
	}

	MediaQueueItem(JSONObject jsonobject)
	{
		this(((MediaInfo) (null)), 0, true, 0.0D, (1.0D / 0.0D), 0.0D, ((long []) (null)), ((String) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:iconst_0        
	//    3    3:iconst_1        
	//    4    4:dconst_0        
	//    5    5:ldc2w           #34  <Double (1.0D / 0.0D)>
	//    6    8:dconst_0        
	//    7    9:aconst_null     
	//    8   10:aconst_null     
	//    9   11:invokespecial   #38  <Method void MediaQueueItem(MediaInfo, int, boolean, double, double, double, long[], String)>
		a(jsonobject);
	//   10   14:aload_0         
	//   11   15:aload_1         
	//   12   16:invokevirtual   #76  <Method boolean a(JSONObject)>
	//   13   19:pop             
	//   14   20:return          
	}

	public MediaInfo a()
	{
		return a;
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field MediaInfo a>
	//    2    4:areturn         
	}

	public final boolean a(JSONObject jsonobject)
	{
		boolean flag2 = jsonobject.has("media");
	//    0    0:aload_1         
	//    1    1:ldc1            #79  <String "media">
	//    2    3:invokevirtual   #83  <Method boolean JSONObject.has(String)>
	//    3    6:istore          8
		boolean flag1 = false;
	//    4    8:iconst_0        
	//    5    9:istore          6
		boolean flag3;
		if(flag2)
	//*   6   11:iload           8
	//*   7   13:ifeq            39
		{
			a = new MediaInfo(jsonobject.getJSONObject("media"));
	//    8   16:aload_0         
	//    9   17:new             #85  <Class MediaInfo>
	//   10   20:dup             
	//   11   21:aload_1         
	//   12   22:ldc1            #79  <String "media">
	//   13   24:invokevirtual   #89  <Method JSONObject JSONObject.getJSONObject(String)>
	//   14   27:invokespecial   #91  <Method void MediaInfo(JSONObject)>
	//   15   30:putfield        #50  <Field MediaInfo a>
			flag3 = true;
	//   16   33:iconst_1        
	//   17   34:istore          9
		} else
	//*  18   36:goto            42
		{
			flag3 = false;
	//   19   39:iconst_0        
	//   20   40:istore          9
		}
		flag2 = flag3;
	//   21   42:iload           9
	//   22   44:istore          8
		if(jsonobject.has("itemId"))
	//*  23   46:aload_1         
	//*  24   47:ldc1            #93  <String "itemId">
	//*  25   49:invokevirtual   #83  <Method boolean JSONObject.has(String)>
	//*  26   52:ifeq            85
		{
			int j = jsonobject.getInt("itemId");
	//   27   55:aload_1         
	//   28   56:ldc1            #93  <String "itemId">
	//   29   58:invokevirtual   #97  <Method int JSONObject.getInt(String)>
	//   30   61:istore          4
			flag2 = flag3;
	//   31   63:iload           9
	//   32   65:istore          8
			if(b != j)
	//*  33   67:aload_0         
	//*  34   68:getfield        #52  <Field int b>
	//*  35   71:iload           4
	//*  36   73:icmpeq          85
			{
				b = j;
	//   37   76:aload_0         
	//   38   77:iload           4
	//   39   79:putfield        #52  <Field int b>
				flag2 = true;
	//   40   82:iconst_1        
	//   41   83:istore          8
			}
		}
		flag3 = flag2;
	//   42   85:iload           8
	//   43   87:istore          9
		if(jsonobject.has("autoplay"))
	//*  44   89:aload_1         
	//*  45   90:ldc1            #99  <String "autoplay">
	//*  46   92:invokevirtual   #83  <Method boolean JSONObject.has(String)>
	//*  47   95:ifeq            128
		{
			boolean flag4 = jsonobject.getBoolean("autoplay");
	//   48   98:aload_1         
	//   49   99:ldc1            #99  <String "autoplay">
	//   50  101:invokevirtual   #102 <Method boolean JSONObject.getBoolean(String)>
	//   51  104:istore          10
			flag3 = flag2;
	//   52  106:iload           8
	//   53  108:istore          9
			if(c != flag4)
	//*  54  110:aload_0         
	//*  55  111:getfield        #54  <Field boolean c>
	//*  56  114:iload           10
	//*  57  116:icmpeq          128
			{
				c = flag4;
	//   58  119:aload_0         
	//   59  120:iload           10
	//   60  122:putfield        #54  <Field boolean c>
				flag3 = true;
	//   61  125:iconst_1        
	//   62  126:istore          9
			}
		}
		flag2 = flag3;
	//   63  128:iload           9
	//   64  130:istore          8
		if(jsonobject.has("startTime"))
	//*  65  132:aload_1         
	//*  66  133:ldc1            #104 <String "startTime">
	//*  67  135:invokevirtual   #83  <Method boolean JSONObject.has(String)>
	//*  68  138:ifeq            176
		{
			double d1 = jsonobject.getDouble("startTime");
	//   69  141:aload_1         
	//   70  142:ldc1            #104 <String "startTime">
	//   71  144:invokevirtual   #108 <Method double JSONObject.getDouble(String)>
	//   72  147:dstore_2        
			flag2 = flag3;
	//   73  148:iload           9
	//   74  150:istore          8
			if(Math.abs(d1 - d) > 9.9999999999999995E-08D)
	//*  75  152:dload_2         
	//*  76  153:aload_0         
	//*  77  154:getfield        #56  <Field double d>
	//*  78  157:dsub            
	//*  79  158:invokestatic    #114 <Method double Math.abs(double)>
	//*  80  161:ldc2w           #115 <Double 9.9999999999999995E-08D>
	//*  81  164:dcmpl           
	//*  82  165:ifle            176
			{
				d = d1;
	//   83  168:aload_0         
	//   84  169:dload_2         
	//   85  170:putfield        #56  <Field double d>
				flag2 = true;
	//   86  173:iconst_1        
	//   87  174:istore          8
			}
		}
		flag3 = flag2;
	//   88  176:iload           8
	//   89  178:istore          9
		if(jsonobject.has("playbackDuration"))
	//*  90  180:aload_1         
	//*  91  181:ldc1            #118 <String "playbackDuration">
	//*  92  183:invokevirtual   #83  <Method boolean JSONObject.has(String)>
	//*  93  186:ifeq            224
		{
			double d2 = jsonobject.getDouble("playbackDuration");
	//   94  189:aload_1         
	//   95  190:ldc1            #118 <String "playbackDuration">
	//   96  192:invokevirtual   #108 <Method double JSONObject.getDouble(String)>
	//   97  195:dstore_2        
			flag3 = flag2;
	//   98  196:iload           8
	//   99  198:istore          9
			if(Math.abs(d2 - e) > 9.9999999999999995E-08D)
	//* 100  200:dload_2         
	//* 101  201:aload_0         
	//* 102  202:getfield        #58  <Field double e>
	//* 103  205:dsub            
	//* 104  206:invokestatic    #114 <Method double Math.abs(double)>
	//* 105  209:ldc2w           #115 <Double 9.9999999999999995E-08D>
	//* 106  212:dcmpl           
	//* 107  213:ifle            224
			{
				e = d2;
	//  108  216:aload_0         
	//  109  217:dload_2         
	//  110  218:putfield        #58  <Field double e>
				flag3 = true;
	//  111  221:iconst_1        
	//  112  222:istore          9
			}
		}
		flag2 = flag3;
	//  113  224:iload           9
	//  114  226:istore          8
		if(jsonobject.has("preloadTime"))
	//* 115  228:aload_1         
	//* 116  229:ldc1            #120 <String "preloadTime">
	//* 117  231:invokevirtual   #83  <Method boolean JSONObject.has(String)>
	//* 118  234:ifeq            272
		{
			double d3 = jsonobject.getDouble("preloadTime");
	//  119  237:aload_1         
	//  120  238:ldc1            #120 <String "preloadTime">
	//  121  240:invokevirtual   #108 <Method double JSONObject.getDouble(String)>
	//  122  243:dstore_2        
			flag2 = flag3;
	//  123  244:iload           9
	//  124  246:istore          8
			if(Math.abs(d3 - f) > 9.9999999999999995E-08D)
	//* 125  248:dload_2         
	//* 126  249:aload_0         
	//* 127  250:getfield        #60  <Field double f>
	//* 128  253:dsub            
	//* 129  254:invokestatic    #114 <Method double Math.abs(double)>
	//* 130  257:ldc2w           #115 <Double 9.9999999999999995E-08D>
	//* 131  260:dcmpl           
	//* 132  261:ifle            272
			{
				f = d3;
	//  133  264:aload_0         
	//  134  265:dload_2         
	//  135  266:putfield        #60  <Field double f>
				flag2 = true;
	//  136  269:iconst_1        
	//  137  270:istore          8
			}
		}
		boolean flag;
		long al[];
		if(jsonobject.has("activeTrackIds"))
	//* 138  272:aload_1         
	//* 139  273:ldc1            #122 <String "activeTrackIds">
	//* 140  275:invokevirtual   #83  <Method boolean JSONObject.has(String)>
	//* 141  278:ifeq            425
		{
			JSONArray jsonarray = jsonobject.getJSONArray("activeTrackIds");
	//  142  281:aload_1         
	//  143  282:ldc1            #122 <String "activeTrackIds">
	//  144  284:invokevirtual   #126 <Method JSONArray JSONObject.getJSONArray(String)>
	//  145  287:astore          11
			int j1 = jsonarray.length();
	//  146  289:aload           11
	//  147  291:invokevirtual   #132 <Method int JSONArray.length()>
	//  148  294:istore          7
			long al1[] = new long[j1];
	//  149  296:iload           7
	//  150  298:newarray        long[]
	//  151  300:astore          12
			for(int k = 0; k < j1; k++)
	//* 152  302:iconst_0        
	//* 153  303:istore          4
	//* 154  305:iload           4
	//* 155  307:iload           7
	//* 156  309:icmpge          333
				al1[k] = jsonarray.getLong(k);
	//  157  312:aload           12
	//  158  314:iload           4
	//  159  316:aload           11
	//  160  318:iload           4
	//  161  320:invokevirtual   #136 <Method long JSONArray.getLong(int)>
	//  162  323:lastore         

	//  163  324:iload           4
	//  164  326:iconst_1        
	//  165  327:iadd            
	//  166  328:istore          4
	//* 167  330:goto            305
			al = g;
	//  168  333:aload_0         
	//  169  334:getfield        #62  <Field long[] g>
	//  170  337:astore          11
			if(al == null)
	//* 171  339:aload           11
	//* 172  341:ifnonnull       354
			{
				flag = true;
	//  173  344:iconst_1        
	//  174  345:istore          4
				al = al1;
	//  175  347:aload           12
	//  176  349:astore          11
			} else
	//* 177  351:goto            432
			if(al.length != j1)
	//* 178  354:aload           11
	//* 179  356:arraylength     
	//* 180  357:iload           7
	//* 181  359:icmpeq          372
			{
				flag = true;
	//  182  362:iconst_1        
	//  183  363:istore          4
				al = al1;
	//  184  365:aload           12
	//  185  367:astore          11
			} else
	//* 186  369:goto            432
			{
				int i1 = 0;
	//  187  372:iconst_0        
	//  188  373:istore          5
				do
				{
					flag = flag1;
	//  189  375:iload           6
	//  190  377:istore          4
					al = al1;
	//  191  379:aload           12
	//  192  381:astore          11
					if(i1 >= j1)
						break;
	//  193  383:iload           5
	//  194  385:iload           7
	//  195  387:icmpge          432
					if(g[i1] != al1[i1])
	//* 196  390:aload_0         
	//* 197  391:getfield        #62  <Field long[] g>
	//* 198  394:iload           5
	//* 199  396:laload          
	//* 200  397:aload           12
	//* 201  399:iload           5
	//* 202  401:laload          
	//* 203  402:lcmp            
	//* 204  403:ifeq            416
					{
						flag = true;
	//  205  406:iconst_1        
	//  206  407:istore          4
						al = al1;
	//  207  409:aload           12
	//  208  411:astore          11
						break;
	//  209  413:goto            432
					}
					i1++;
	//  210  416:iload           5
	//  211  418:iconst_1        
	//  212  419:iadd            
	//  213  420:istore          5
				} while(true);
	//  214  422:goto            375
			}
		} else
		{
			al = null;
	//  215  425:aconst_null     
	//  216  426:astore          11
			flag = flag1;
	//  217  428:iload           6
	//  218  430:istore          4
		}
		if(flag)
	//* 219  432:iload           4
	//* 220  434:ifeq            446
		{
			g = al;
	//  221  437:aload_0         
	//  222  438:aload           11
	//  223  440:putfield        #62  <Field long[] g>
			flag2 = true;
	//  224  443:iconst_1        
	//  225  444:istore          8
		}
		if(jsonobject.has("customData"))
	//* 226  446:aload_1         
	//* 227  447:ldc1            #138 <String "customData">
	//* 228  449:invokevirtual   #83  <Method boolean JSONObject.has(String)>
	//* 229  452:ifeq            468
		{
			i = jsonobject.getJSONObject("customData");
	//  230  455:aload_0         
	//  231  456:aload_1         
	//  232  457:ldc1            #138 <String "customData">
	//  233  459:invokevirtual   #89  <Method JSONObject JSONObject.getJSONObject(String)>
	//  234  462:putfield        #69  <Field JSONObject i>
			flag2 = true;
	//  235  465:iconst_1        
	//  236  466:istore          8
		}
		return flag2;
	//  237  468:iload           8
	//  238  470:ireturn         
	}

	public int b()
	{
		return b;
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field int b>
	//    2    4:ireturn         
	}

	public boolean c()
	{
		return c;
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field boolean c>
	//    2    4:ireturn         
	}

	public double d()
	{
		return d;
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field double d>
	//    2    4:dreturn         
	}

	public double e()
	{
		return e;
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field double e>
	//    2    4:dreturn         
	}

	public boolean equals(Object obj)
	{
		if(this == obj)
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:if_acmpne       7
			return true;
	//    3    5:iconst_1        
	//    4    6:ireturn         
		if(!(obj instanceof MediaQueueItem))
	//*   5    7:aload_1         
	//*   6    8:instanceof      #2   <Class MediaQueueItem>
	//*   7   11:ifne            16
			return false;
	//    8   14:iconst_0        
	//    9   15:ireturn         
		obj = ((Object) ((MediaQueueItem)obj));
	//   10   16:aload_1         
	//   11   17:checkcast       #2   <Class MediaQueueItem>
	//   12   20:astore_1        
		boolean flag;
		if(i == null)
	//*  13   21:aload_0         
	//*  14   22:getfield        #69  <Field JSONObject i>
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
		if(((MediaQueueItem) (obj)).i == null)
	//*  21   35:aload_1         
	//*  22   36:getfield        #69  <Field JSONObject i>
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
		JSONObject jsonobject = i;
	//   34   56:aload_0         
	//   35   57:getfield        #69  <Field JSONObject i>
	//   36   60:astore          4
		if(jsonobject != null)
	//*  37   62:aload           4
	//*  38   64:ifnull          90
		{
			JSONObject jsonobject1 = ((MediaQueueItem) (obj)).i;
	//   39   67:aload_1         
	//   40   68:getfield        #69  <Field JSONObject i>
	//   41   71:astore          5
			if(jsonobject1 != null && !l.a(((Object) (jsonobject)), ((Object) (jsonobject1))))
	//*  42   73:aload           5
	//*  43   75:ifnull          90
	//*  44   78:aload           4
	//*  45   80:aload           5
	//*  46   82:invokestatic    #147 <Method boolean l.a(Object, Object)>
	//*  47   85:ifne            90
				return false;
	//   48   88:iconst_0        
	//   49   89:ireturn         
		}
		return aj.a(((Object) (a)), ((Object) (((MediaQueueItem) (obj)).a))) && b == ((MediaQueueItem) (obj)).b && c == ((MediaQueueItem) (obj)).c && d == ((MediaQueueItem) (obj)).d && e == ((MediaQueueItem) (obj)).e && f == ((MediaQueueItem) (obj)).f && Arrays.equals(g, ((MediaQueueItem) (obj)).g);
	//   50   90:aload_0         
	//   51   91:getfield        #50  <Field MediaInfo a>
	//   52   94:aload_1         
	//   53   95:getfield        #50  <Field MediaInfo a>
	//   54   98:invokestatic    #150 <Method boolean aj.a(Object, Object)>
	//   55  101:ifeq            178
	//   56  104:aload_0         
	//   57  105:getfield        #52  <Field int b>
	//   58  108:aload_1         
	//   59  109:getfield        #52  <Field int b>
	//   60  112:icmpne          178
	//   61  115:aload_0         
	//   62  116:getfield        #54  <Field boolean c>
	//   63  119:aload_1         
	//   64  120:getfield        #54  <Field boolean c>
	//   65  123:icmpne          178
	//   66  126:aload_0         
	//   67  127:getfield        #56  <Field double d>
	//   68  130:aload_1         
	//   69  131:getfield        #56  <Field double d>
	//   70  134:dcmpl           
	//   71  135:ifne            178
	//   72  138:aload_0         
	//   73  139:getfield        #58  <Field double e>
	//   74  142:aload_1         
	//   75  143:getfield        #58  <Field double e>
	//   76  146:dcmpl           
	//   77  147:ifne            178
	//   78  150:aload_0         
	//   79  151:getfield        #60  <Field double f>
	//   80  154:aload_1         
	//   81  155:getfield        #60  <Field double f>
	//   82  158:dcmpl           
	//   83  159:ifne            178
	//   84  162:aload_0         
	//   85  163:getfield        #62  <Field long[] g>
	//   86  166:aload_1         
	//   87  167:getfield        #62  <Field long[] g>
	//   88  170:invokestatic    #155 <Method boolean Arrays.equals(long[], long[])>
	//   89  173:ifeq            178
	//   90  176:iconst_1        
	//   91  177:ireturn         
	//   92  178:iconst_0        
	//   93  179:ireturn         
	}

	public double f()
	{
		return f;
	//    0    0:aload_0         
	//    1    1:getfield        #60  <Field double f>
	//    2    4:dreturn         
	}

	public long[] g()
	{
		return g;
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field long[] g>
	//    2    4:areturn         
	}

	final void h()
	{
		if(a != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #50  <Field MediaInfo a>
	//*   2    4:ifnull          86
		{
			if(!Double.isNaN(d) && d >= 0.0D)
	//*   3    7:aload_0         
	//*   4    8:getfield        #56  <Field double d>
	//*   5   11:invokestatic    #162 <Method boolean Double.isNaN(double)>
	//*   6   14:ifne            76
	//*   7   17:aload_0         
	//*   8   18:getfield        #56  <Field double d>
	//*   9   21:dconst_0        
	//*  10   22:dcmpg           
	//*  11   23:iflt            76
			{
				if(!Double.isNaN(e))
	//*  12   26:aload_0         
	//*  13   27:getfield        #58  <Field double e>
	//*  14   30:invokestatic    #162 <Method boolean Double.isNaN(double)>
	//*  15   33:ifne            66
				{
					if(!Double.isNaN(f) && f >= 0.0D)
	//*  16   36:aload_0         
	//*  17   37:getfield        #60  <Field double f>
	//*  18   40:invokestatic    #162 <Method boolean Double.isNaN(double)>
	//*  19   43:ifne            56
	//*  20   46:aload_0         
	//*  21   47:getfield        #60  <Field double f>
	//*  22   50:dconst_0        
	//*  23   51:dcmpg           
	//*  24   52:iflt            56
						return;
	//   25   55:return          
					else
						throw new IllegalArgumentException("preloadTime cannot be negative or Nan.");
	//   26   56:new             #40  <Class IllegalArgumentException>
	//   27   59:dup             
	//   28   60:ldc1            #164 <String "preloadTime cannot be negative or Nan.">
	//   29   62:invokespecial   #45  <Method void IllegalArgumentException(String)>
	//   30   65:athrow          
				} else
				{
					throw new IllegalArgumentException("playbackDuration cannot be NaN.");
	//   31   66:new             #40  <Class IllegalArgumentException>
	//   32   69:dup             
	//   33   70:ldc1            #166 <String "playbackDuration cannot be NaN.">
	//   34   72:invokespecial   #45  <Method void IllegalArgumentException(String)>
	//   35   75:athrow          
				}
			} else
			{
				throw new IllegalArgumentException("startTime cannot be negative or NaN.");
	//   36   76:new             #40  <Class IllegalArgumentException>
	//   37   79:dup             
	//   38   80:ldc1            #168 <String "startTime cannot be negative or NaN.">
	//   39   82:invokespecial   #45  <Method void IllegalArgumentException(String)>
	//   40   85:athrow          
			}
		} else
		{
			throw new IllegalArgumentException("media cannot be null.");
	//   41   86:new             #40  <Class IllegalArgumentException>
	//   42   89:dup             
	//   43   90:ldc1            #42  <String "media cannot be null.">
	//   44   92:invokespecial   #45  <Method void IllegalArgumentException(String)>
	//   45   95:athrow          
		}
	}

	public int hashCode()
	{
		return ak.a(new Object[] {
			a, Integer.valueOf(b), Boolean.valueOf(c), Double.valueOf(d), Double.valueOf(e), Double.valueOf(f), Integer.valueOf(Arrays.hashCode(g)), String.valueOf(((Object) (i)))
		});
	//    0    0:bipush          8
	//    1    2:anewarray       Object[]
	//    2    5:dup             
	//    3    6:iconst_0        
	//    4    7:aload_0         
	//    5    8:getfield        #50  <Field MediaInfo a>
	//    6   11:aastore         
	//    7   12:dup             
	//    8   13:iconst_1        
	//    9   14:aload_0         
	//   10   15:getfield        #52  <Field int b>
	//   11   18:invokestatic    #177 <Method Integer Integer.valueOf(int)>
	//   12   21:aastore         
	//   13   22:dup             
	//   14   23:iconst_2        
	//   15   24:aload_0         
	//   16   25:getfield        #54  <Field boolean c>
	//   17   28:invokestatic    #182 <Method Boolean Boolean.valueOf(boolean)>
	//   18   31:aastore         
	//   19   32:dup             
	//   20   33:iconst_3        
	//   21   34:aload_0         
	//   22   35:getfield        #56  <Field double d>
	//   23   38:invokestatic    #185 <Method Double Double.valueOf(double)>
	//   24   41:aastore         
	//   25   42:dup             
	//   26   43:iconst_4        
	//   27   44:aload_0         
	//   28   45:getfield        #58  <Field double e>
	//   29   48:invokestatic    #185 <Method Double Double.valueOf(double)>
	//   30   51:aastore         
	//   31   52:dup             
	//   32   53:iconst_5        
	//   33   54:aload_0         
	//   34   55:getfield        #60  <Field double f>
	//   35   58:invokestatic    #185 <Method Double Double.valueOf(double)>
	//   36   61:aastore         
	//   37   62:dup             
	//   38   63:bipush          6
	//   39   65:aload_0         
	//   40   66:getfield        #62  <Field long[] g>
	//   41   69:invokestatic    #188 <Method int Arrays.hashCode(long[])>
	//   42   72:invokestatic    #177 <Method Integer Integer.valueOf(int)>
	//   43   75:aastore         
	//   44   76:dup             
	//   45   77:bipush          7
	//   46   79:aload_0         
	//   47   80:getfield        #69  <Field JSONObject i>
	//   48   83:invokestatic    #193 <Method String String.valueOf(Object)>
	//   49   86:aastore         
	//   50   87:invokestatic    #198 <Method int ak.a(Object[])>
	//   51   90:ireturn         
	}

	public final JSONObject i()
	{
		JSONObject jsonobject = new JSONObject();
	//    0    0:new             #66  <Class JSONObject>
	//    1    3:dup             
	//    2    4:invokespecial   #200 <Method void JSONObject()>
	//    3    7:astore_3        
		int k;
		JSONArray jsonarray;
		long al[];
		jsonobject.put("media", ((Object) (a.l())));
	//    4    8:aload_3         
	//    5    9:ldc1            #79  <String "media">
	//    6   11:aload_0         
	//    7   12:getfield        #50  <Field MediaInfo a>
	//    8   15:invokevirtual   #203 <Method JSONObject com.google.android.gms.cast.MediaInfo.l()>
	//    9   18:invokevirtual   #207 <Method JSONObject JSONObject.put(String, Object)>
	//   10   21:pop             
		if(b != 0)
	//*  11   22:aload_0         
	//*  12   23:getfield        #52  <Field int b>
	//*  13   26:ifeq            40
			jsonobject.put("itemId", b);
	//   14   29:aload_3         
	//   15   30:ldc1            #93  <String "itemId">
	//   16   32:aload_0         
	//   17   33:getfield        #52  <Field int b>
	//   18   36:invokevirtual   #210 <Method JSONObject JSONObject.put(String, int)>
	//   19   39:pop             
		jsonobject.put("autoplay", c);
	//   20   40:aload_3         
	//   21   41:ldc1            #99  <String "autoplay">
	//   22   43:aload_0         
	//   23   44:getfield        #54  <Field boolean c>
	//   24   47:invokevirtual   #213 <Method JSONObject JSONObject.put(String, boolean)>
	//   25   50:pop             
		jsonobject.put("startTime", d);
	//   26   51:aload_3         
	//   27   52:ldc1            #104 <String "startTime">
	//   28   54:aload_0         
	//   29   55:getfield        #56  <Field double d>
	//   30   58:invokevirtual   #216 <Method JSONObject JSONObject.put(String, double)>
	//   31   61:pop             
		if(e != (1.0D / 0.0D))
	//*  32   62:aload_0         
	//*  33   63:getfield        #58  <Field double e>
	//*  34   66:ldc2w           #34  <Double (1.0D / 0.0D)>
	//*  35   69:dcmpl           
	//*  36   70:ifeq            84
			jsonobject.put("playbackDuration", e);
	//   37   73:aload_3         
	//   38   74:ldc1            #118 <String "playbackDuration">
	//   39   76:aload_0         
	//   40   77:getfield        #58  <Field double e>
	//   41   80:invokevirtual   #216 <Method JSONObject JSONObject.put(String, double)>
	//   42   83:pop             
		jsonobject.put("preloadTime", f);
	//   43   84:aload_3         
	//   44   85:ldc1            #120 <String "preloadTime">
	//   45   87:aload_0         
	//   46   88:getfield        #60  <Field double f>
	//   47   91:invokevirtual   #216 <Method JSONObject JSONObject.put(String, double)>
	//   48   94:pop             
		if(g == null)
			break MISSING_BLOCK_LABEL_154;
	//   49   95:aload_0         
	//   50   96:getfield        #62  <Field long[] g>
	//   51   99:ifnull          154
		jsonarray = new JSONArray();
	//   52  102:new             #128 <Class JSONArray>
	//   53  105:dup             
	//   54  106:invokespecial   #217 <Method void JSONArray()>
	//   55  109:astore          4
		al = g;
	//   56  111:aload_0         
	//   57  112:getfield        #62  <Field long[] g>
	//   58  115:astore          5
		k = al.length;
	//   59  117:aload           5
	//   60  119:arraylength     
	//   61  120:istore_2        
		int j = 0;
	//   62  121:iconst_0        
	//   63  122:istore_1        
		while(j < k) 
	//*  64  123:iload_1         
	//*  65  124:iload_2         
	//*  66  125:icmpge          145
		{
			try
			{
				jsonarray.put(al[j]);
	//   67  128:aload           4
	//   68  130:aload           5
	//   69  132:iload_1         
	//   70  133:laload          
	//   71  134:invokevirtual   #220 <Method JSONArray JSONArray.put(long)>
	//   72  137:pop             
			}
	//*  73  138:iload_1         
	//*  74  139:iconst_1        
	//*  75  140:iadd            
	//*  76  141:istore_1        
	//*  77  142:goto            123
	//*  78  145:aload_3         
	//*  79  146:ldc1            #122 <String "activeTrackIds">
	//*  80  148:aload           4
	//*  81  150:invokevirtual   #207 <Method JSONObject JSONObject.put(String, Object)>
	//*  82  153:pop             
	//*  83  154:aload_0         
	//*  84  155:getfield        #69  <Field JSONObject i>
	//*  85  158:ifnull          172
	//*  86  161:aload_3         
	//*  87  162:ldc1            #138 <String "customData">
	//*  88  164:aload_0         
	//*  89  165:getfield        #69  <Field JSONObject i>
	//*  90  168:invokevirtual   #207 <Method JSONObject JSONObject.put(String, Object)>
	//*  91  171:pop             
	//*  92  172:aload_3         
	//*  93  173:areturn         
			catch(JSONException jsonexception)
	//*  94  174:astore          4
			{
				return jsonobject;
	//   95  176:aload_3         
	//   96  177:areturn         
			}
			j++;
		}
		jsonobject.put("activeTrackIds", ((Object) (jsonarray)));
		if(i != null)
			jsonobject.put("customData", ((Object) (i)));
		return jsonobject;
	}

	public void writeToParcel(Parcel parcel, int j)
	{
		Object obj = ((Object) (i));
	//    0    0:aload_0         
	//    1    1:getfield        #69  <Field JSONObject i>
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
	//    9   19:invokevirtual   #226 <Method String JSONObject.toString()>
	//   10   22:astore          4
		h = ((String) (obj));
	//   11   24:aload_0         
	//   12   25:aload           4
	//   13   27:putfield        #64  <Field String h>
		int k = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
	//   14   30:aload_1         
	//   15   31:invokestatic    #231 <Method int c.a(Parcel)>
	//   16   34:istore_3        
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 2, ((android.os.Parcelable) (a())), j, false);
	//   17   35:aload_1         
	//   18   36:iconst_2        
	//   19   37:aload_0         
	//   20   38:invokevirtual   #233 <Method MediaInfo a()>
	//   21   41:iload_2         
	//   22   42:iconst_0        
	//   23   43:invokestatic    #236 <Method void c.a(Parcel, int, android.os.Parcelable, int, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 3, b());
	//   24   46:aload_1         
	//   25   47:iconst_3        
	//   26   48:aload_0         
	//   27   49:invokevirtual   #238 <Method int b()>
	//   28   52:invokestatic    #241 <Method void c.a(Parcel, int, int)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 4, c());
	//   29   55:aload_1         
	//   30   56:iconst_4        
	//   31   57:aload_0         
	//   32   58:invokevirtual   #243 <Method boolean c()>
	//   33   61:invokestatic    #246 <Method void c.a(Parcel, int, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 5, d());
	//   34   64:aload_1         
	//   35   65:iconst_5        
	//   36   66:aload_0         
	//   37   67:invokevirtual   #248 <Method double d()>
	//   38   70:invokestatic    #251 <Method void c.a(Parcel, int, double)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 6, e());
	//   39   73:aload_1         
	//   40   74:bipush          6
	//   41   76:aload_0         
	//   42   77:invokevirtual   #253 <Method double e()>
	//   43   80:invokestatic    #251 <Method void c.a(Parcel, int, double)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 7, f());
	//   44   83:aload_1         
	//   45   84:bipush          7
	//   46   86:aload_0         
	//   47   87:invokevirtual   #255 <Method double f()>
	//   48   90:invokestatic    #251 <Method void c.a(Parcel, int, double)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 8, g(), false);
	//   49   93:aload_1         
	//   50   94:bipush          8
	//   51   96:aload_0         
	//   52   97:invokevirtual   #257 <Method long[] g()>
	//   53  100:iconst_0        
	//   54  101:invokestatic    #260 <Method void c.a(Parcel, int, long[], boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 9, h, false);
	//   55  104:aload_1         
	//   56  105:bipush          9
	//   57  107:aload_0         
	//   58  108:getfield        #64  <Field String h>
	//   59  111:iconst_0        
	//   60  112:invokestatic    #263 <Method void c.a(Parcel, int, String, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, k);
	//   61  115:aload_1         
	//   62  116:iload_3         
	//   63  117:invokestatic    #265 <Method void c.a(Parcel, int)>
	//   64  120:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new aa();
	private MediaInfo a;
	private int b;
	private boolean c;
	private double d;
	private double e;
	private double f;
	private long g[];
	private String h;
	private JSONObject i;

	static 
	{
	//    0    0:new             #26  <Class aa>
	//    1    3:dup             
	//    2    4:invokespecial   #29  <Method void aa()>
	//    3    7:putstatic       #31  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
