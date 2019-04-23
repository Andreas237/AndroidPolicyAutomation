// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.TextureView;
import com.google.android.gms.ads.internal.aw;
import com.google.android.gms.common.util.e;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.gms.internal.ads:
//			yr, p, bwk, m, 
//			wx, v, acm, ad, 
//			yo, yq, zzbbi, xg, 
//			aa

public final class adf
{

	public adf(Context context, zzbbi zzbbi1, String s, ad ad1, aa aa)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #40  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #42  <Class yr>
	//    4    8:dup             
	//    5    9:invokespecial   #43  <Method void yr()>
	//    6   12:ldc1            #45  <String "min_1">
	//    7   14:ldc2w           #46  <Double 4.9406564584124654E-324D>
	//    8   17:dconst_1        
	//    9   18:invokevirtual   #50  <Method yr yr.a(String, double, double)>
	//   10   21:ldc1            #52  <String "1_5">
	//   11   23:dconst_1        
	//   12   24:ldc2w           #53  <Double 5D>
	//   13   27:invokevirtual   #50  <Method yr yr.a(String, double, double)>
	//   14   30:ldc1            #56  <String "5_10">
	//   15   32:ldc2w           #53  <Double 5D>
	//   16   35:ldc2w           #57  <Double 10D>
	//   17   38:invokevirtual   #50  <Method yr yr.a(String, double, double)>
	//   18   41:ldc1            #60  <String "10_20">
	//   19   43:ldc2w           #57  <Double 10D>
	//   20   46:ldc2w           #61  <Double 20D>
	//   21   49:invokevirtual   #50  <Method yr yr.a(String, double, double)>
	//   22   52:ldc1            #64  <String "20_30">
	//   23   54:ldc2w           #61  <Double 20D>
	//   24   57:ldc2w           #65  <Double 30D>
	//   25   60:invokevirtual   #50  <Method yr yr.a(String, double, double)>
	//   26   63:ldc1            #68  <String "30_max">
	//   27   65:ldc2w           #65  <Double 30D>
	//   28   68:ldc2w           #69  <Double 1.7976931348623157E+308D>
	//   29   71:invokevirtual   #50  <Method yr yr.a(String, double, double)>
	//   30   74:invokevirtual   #73  <Method yo yr.a()>
	//   31   77:putfield        #75  <Field yo f>
		i = false;
	//   32   80:aload_0         
	//   33   81:iconst_0        
	//   34   82:putfield        #77  <Field boolean i>
		j = false;
	//   35   85:aload_0         
	//   36   86:iconst_0        
	//   37   87:putfield        #79  <Field boolean j>
		k = false;
	//   38   90:aload_0         
	//   39   91:iconst_0        
	//   40   92:putfield        #81  <Field boolean k>
		l = false;
	//   41   95:aload_0         
	//   42   96:iconst_0        
	//   43   97:putfield        #83  <Field boolean l>
		q = -1L;
	//   44  100:aload_0         
	//   45  101:ldc2w           #84  <Long -1L>
	//   46  104:putfield        #87  <Field long q>
		a = context;
	//   47  107:aload_0         
	//   48  108:aload_1         
	//   49  109:putfield        #89  <Field Context a>
		c = zzbbi1;
	//   50  112:aload_0         
	//   51  113:aload_2         
	//   52  114:putfield        #91  <Field zzbbi c>
		b = s;
	//   53  117:aload_0         
	//   54  118:aload_3         
	//   55  119:putfield        #93  <Field String b>
		e = ad1;
	//   56  122:aload_0         
	//   57  123:aload           4
	//   58  125:putfield        #95  <Field ad e>
		d = aa;
	//   59  128:aload_0         
	//   60  129:aload           5
	//   61  131:putfield        #97  <Field aa d>
		context = ((Context) (p.u));
	//   62  134:getstatic       #103 <Field com.google.android.gms.internal.ads.e p.u>
	//   63  137:astore_1        
		context = ((Context) ((String)com.google.android.gms.internal.ads.bwk.e().a(((com.google.android.gms.internal.ads.e) (context)))));
	//   64  138:invokestatic    #108 <Method m com.google.android.gms.internal.ads.bwk.e()>
	//   65  141:aload_1         
	//   66  142:invokevirtual   #113 <Method Object m.a(com.google.android.gms.internal.ads.e)>
	//   67  145:checkcast       #115 <Class String>
	//   68  148:astore_1        
		if(context == null)
	//*  69  149:aload_1         
	//*  70  150:ifnonnull       169
		{
			h = new String[0];
	//   71  153:aload_0         
	//   72  154:iconst_0        
	//   73  155:anewarray       String[]
	//   74  158:putfield        #117 <Field String[] h>
			g = new long[0];
	//   75  161:aload_0         
	//   76  162:iconst_0        
	//   77  163:newarray        long[]
	//   78  165:putfield        #119 <Field long[] g>
			return;
	//   79  168:return          
		}
		context = ((Context) (TextUtils.split(((String) (context)), ",")));
	//   80  169:aload_1         
	//   81  170:ldc1            #121 <String ",">
	//   82  172:invokestatic    #127 <Method String[] TextUtils.split(String, String)>
	//   83  175:astore_1        
		h = new String[context.length];
	//   84  176:aload_0         
	//   85  177:aload_1         
	//   86  178:arraylength     
	//   87  179:anewarray       String[]
	//   88  182:putfield        #117 <Field String[] h>
		g = new long[context.length];
	//   89  185:aload_0         
	//   90  186:aload_1         
	//   91  187:arraylength     
	//   92  188:newarray        long[]
	//   93  190:putfield        #119 <Field long[] g>
		for(int i1 = 0; i1 < context.length; i1++)
	//*  94  193:iconst_0        
	//*  95  194:istore          6
	//*  96  196:iload           6
	//*  97  198:aload_1         
	//*  98  199:arraylength     
	//*  99  200:icmpge          246
		{
			try
			{
				g[i1] = Long.parseLong(((String) (context[i1])));
	//  100  203:aload_0         
	//  101  204:getfield        #119 <Field long[] g>
	//  102  207:iload           6
	//  103  209:aload_1         
	//  104  210:iload           6
	//  105  212:aaload          
	//  106  213:invokestatic    #133 <Method long Long.parseLong(String)>
	//  107  216:lastore         
				continue;
	//  108  217:goto            237
			}
			// Misplaced declaration of an exception variable
			catch(zzbbi zzbbi1)
	//* 109  220:astore_2        
			{
				wx.c("Unable to parse frame hash target time number.", ((Throwable) (zzbbi1)));
	//  110  221:ldc1            #135 <String "Unable to parse frame hash target time number.">
	//  111  223:aload_2         
	//  112  224:invokestatic    #140 <Method void wx.c(String, Throwable)>
			}
			g[i1] = -1L;
	//  113  227:aload_0         
	//  114  228:getfield        #119 <Field long[] g>
	//  115  231:iload           6
	//  116  233:ldc2w           #84  <Long -1L>
	//  117  236:lastore         
		}

	//  118  237:iload           6
	//  119  239:iconst_1        
	//  120  240:iadd            
	//  121  241:istore          6
	//* 122  243:goto            196
	//  123  246:return          
	}

	public final void a()
	{
		if(i)
	//*   0    0:aload_0         
	//*   1    1:getfield        #77  <Field boolean i>
	//*   2    4:ifeq            42
		{
			if(j)
	//*   3    7:aload_0         
	//*   4    8:getfield        #79  <Field boolean j>
	//*   5   11:ifeq            15
			{
				return;
	//    6   14:return          
			} else
			{
				v.a(e, d, new String[] {
					"vfr2"
				});
	//    7   15:aload_0         
	//    8   16:getfield        #95  <Field ad e>
	//    9   19:aload_0         
	//   10   20:getfield        #97  <Field aa d>
	//   11   23:iconst_1        
	//   12   24:anewarray       String[]
	//   13   27:dup             
	//   14   28:iconst_0        
	//   15   29:ldc1            #143 <String "vfr2">
	//   16   31:aastore         
	//   17   32:invokestatic    #148 <Method boolean v.a(ad, aa, String[])>
	//   18   35:pop             
				j = true;
	//   19   36:aload_0         
	//   20   37:iconst_1        
	//   21   38:putfield        #79  <Field boolean j>
				return;
	//   22   41:return          
			}
		} else
		{
			return;
	//   23   42:return          
		}
	}

	public final void a(acm acm1)
	{
		v.a(e, d, new String[] {
			"vpc2"
		});
	//    0    0:aload_0         
	//    1    1:getfield        #95  <Field ad e>
	//    2    4:aload_0         
	//    3    5:getfield        #97  <Field aa d>
	//    4    8:iconst_1        
	//    5    9:anewarray       String[]
	//    6   12:dup             
	//    7   13:iconst_0        
	//    8   14:ldc1            #151 <String "vpc2">
	//    9   16:aastore         
	//   10   17:invokestatic    #148 <Method boolean v.a(ad, aa, String[])>
	//   11   20:pop             
		i = true;
	//   12   21:aload_0         
	//   13   22:iconst_1        
	//   14   23:putfield        #77  <Field boolean i>
		ad ad1 = e;
	//   15   26:aload_0         
	//   16   27:getfield        #95  <Field ad e>
	//   17   30:astore_2        
		if(ad1 != null)
	//*  18   31:aload_2         
	//*  19   32:ifnull          45
			ad1.a("vpn", acm1.a());
	//   20   35:aload_2         
	//   21   36:ldc1            #153 <String "vpn">
	//   22   38:aload_1         
	//   23   39:invokevirtual   #158 <Method String acm.a()>
	//   24   42:invokevirtual   #163 <Method void ad.a(String, String)>
		n = acm1;
	//   25   45:aload_0         
	//   26   46:aload_1         
	//   27   47:putfield        #165 <Field acm n>
	//   28   50:return          
	}

	public final void b()
	{
		com.google.android.gms.internal.ads.e e1 = p.t;
	//    0    0:getstatic       #168 <Field com.google.android.gms.internal.ads.e p.t>
	//    1    3:astore_2        
		if(((Boolean)com.google.android.gms.internal.ads.bwk.e().a(e1)).booleanValue() && !o)
	//*   2    4:invokestatic    #108 <Method m com.google.android.gms.internal.ads.bwk.e()>
	//*   3    7:aload_2         
	//*   4    8:invokevirtual   #113 <Method Object m.a(com.google.android.gms.internal.ads.e)>
	//*   5   11:checkcast       #170 <Class Boolean>
	//*   6   14:invokevirtual   #174 <Method boolean Boolean.booleanValue()>
	//*   7   17:ifeq            335
	//*   8   20:aload_0         
	//*   9   21:getfield        #176 <Field boolean o>
	//*  10   24:ifne            335
		{
			Bundle bundle = new Bundle();
	//   11   27:new             #178 <Class Bundle>
	//   12   30:dup             
	//   13   31:invokespecial   #179 <Method void Bundle()>
	//   14   34:astore_3        
			bundle.putString("type", "native-player-metrics");
	//   15   35:aload_3         
	//   16   36:ldc1            #181 <String "type">
	//   17   38:ldc1            #183 <String "native-player-metrics">
	//   18   40:invokevirtual   #186 <Method void Bundle.putString(String, String)>
			bundle.putString("request", b);
	//   19   43:aload_3         
	//   20   44:ldc1            #188 <String "request">
	//   21   46:aload_0         
	//   22   47:getfield        #93  <Field String b>
	//   23   50:invokevirtual   #186 <Method void Bundle.putString(String, String)>
			bundle.putString("player", n.a());
	//   24   53:aload_3         
	//   25   54:ldc1            #190 <String "player">
	//   26   56:aload_0         
	//   27   57:getfield        #165 <Field acm n>
	//   28   60:invokevirtual   #158 <Method String acm.a()>
	//   29   63:invokevirtual   #186 <Method void Bundle.putString(String, String)>
			String s;
			yq yq1;
			for(Iterator iterator = f.a().iterator(); iterator.hasNext(); bundle.putString(s, Double.toString(yq1.b)))
	//*  30   66:aload_0         
	//*  31   67:getfield        #75  <Field yo f>
	//*  32   70:invokevirtual   #195 <Method List yo.a()>
	//*  33   73:invokeinterface #201 <Method Iterator List.iterator()>
	//*  34   78:astore          4
	//*  35   80:aload           4
	//*  36   82:invokeinterface #206 <Method boolean Iterator.hasNext()>
	//*  37   87:ifeq            217
			{
				yq1 = (yq)iterator.next();
	//   38   90:aload           4
	//   39   92:invokeinterface #210 <Method Object Iterator.next()>
	//   40   97:checkcast       #212 <Class yq>
	//   41  100:astore          5
				s = String.valueOf("fps_c_");
	//   42  102:ldc1            #214 <String "fps_c_">
	//   43  104:invokestatic    #218 <Method String String.valueOf(Object)>
	//   44  107:astore_2        
				String s3 = String.valueOf(((Object) (yq1.a)));
	//   45  108:aload           5
	//   46  110:getfield        #220 <Field String yq.a>
	//   47  113:invokestatic    #218 <Method String String.valueOf(Object)>
	//   48  116:astore          6
				if(s3.length() != 0)
	//*  49  118:aload           6
	//*  50  120:invokevirtual   #224 <Method int String.length()>
	//*  51  123:ifeq            136
					s = s.concat(s3);
	//   52  126:aload_2         
	//   53  127:aload           6
	//   54  129:invokevirtual   #228 <Method String String.concat(String)>
	//   55  132:astore_2        
				else
	//*  56  133:goto            145
					s = new String(s);
	//   57  136:new             #115 <Class String>
	//   58  139:dup             
	//   59  140:aload_2         
	//   60  141:invokespecial   #231 <Method void String(String)>
	//   61  144:astore_2        
				bundle.putString(s, Integer.toString(yq1.c));
	//   62  145:aload_3         
	//   63  146:aload_2         
	//   64  147:aload           5
	//   65  149:getfield        #234 <Field int yq.c>
	//   66  152:invokestatic    #240 <Method String Integer.toString(int)>
	//   67  155:invokevirtual   #186 <Method void Bundle.putString(String, String)>
				s = String.valueOf("fps_p_");
	//   68  158:ldc1            #242 <String "fps_p_">
	//   69  160:invokestatic    #218 <Method String String.valueOf(Object)>
	//   70  163:astore_2        
				s3 = String.valueOf(((Object) (yq1.a)));
	//   71  164:aload           5
	//   72  166:getfield        #220 <Field String yq.a>
	//   73  169:invokestatic    #218 <Method String String.valueOf(Object)>
	//   74  172:astore          6
				if(s3.length() != 0)
	//*  75  174:aload           6
	//*  76  176:invokevirtual   #224 <Method int String.length()>
	//*  77  179:ifeq            192
					s = s.concat(s3);
	//   78  182:aload_2         
	//   79  183:aload           6
	//   80  185:invokevirtual   #228 <Method String String.concat(String)>
	//   81  188:astore_2        
				else
	//*  82  189:goto            201
					s = new String(s);
	//   83  192:new             #115 <Class String>
	//   84  195:dup             
	//   85  196:aload_2         
	//   86  197:invokespecial   #231 <Method void String(String)>
	//   87  200:astore_2        
			}

	//   88  201:aload_3         
	//   89  202:aload_2         
	//   90  203:aload           5
	//   91  205:getfield        #245 <Field double yq.b>
	//   92  208:invokestatic    #250 <Method String Double.toString(double)>
	//   93  211:invokevirtual   #186 <Method void Bundle.putString(String, String)>
	//*  94  214:goto            80
			int i1 = 0;
	//   95  217:iconst_0        
	//   96  218:istore_1        
			do
			{
				long al[] = g;
	//   97  219:aload_0         
	//   98  220:getfield        #119 <Field long[] g>
	//   99  223:astore          4
				if(i1 >= al.length)
					break;
	//  100  225:iload_1         
	//  101  226:aload           4
	//  102  228:arraylength     
	//  103  229:icmpge          308
				String s1 = h[i1];
	//  104  232:aload_0         
	//  105  233:getfield        #117 <Field String[] h>
	//  106  236:iload_1         
	//  107  237:aaload          
	//  108  238:astore_2        
				if(s1 != null)
	//* 109  239:aload_2         
	//* 110  240:ifnull          301
				{
					String s2 = String.valueOf(((Object) (Long.valueOf(al[i1]))));
	//  111  243:aload           4
	//  112  245:iload_1         
	//  113  246:laload          
	//  114  247:invokestatic    #253 <Method Long Long.valueOf(long)>
	//  115  250:invokestatic    #218 <Method String String.valueOf(Object)>
	//  116  253:astore          4
					StringBuilder stringbuilder = new StringBuilder(String.valueOf(((Object) (s2))).length() + 3);
	//  117  255:new             #255 <Class StringBuilder>
	//  118  258:dup             
	//  119  259:aload           4
	//  120  261:invokestatic    #218 <Method String String.valueOf(Object)>
	//  121  264:invokevirtual   #224 <Method int String.length()>
	//  122  267:iconst_3        
	//  123  268:iadd            
	//  124  269:invokespecial   #258 <Method void StringBuilder(int)>
	//  125  272:astore          5
					stringbuilder.append("fh_");
	//  126  274:aload           5
	//  127  276:ldc2            #260 <String "fh_">
	//  128  279:invokevirtual   #264 <Method StringBuilder StringBuilder.append(String)>
	//  129  282:pop             
					stringbuilder.append(s2);
	//  130  283:aload           5
	//  131  285:aload           4
	//  132  287:invokevirtual   #264 <Method StringBuilder StringBuilder.append(String)>
	//  133  290:pop             
					bundle.putString(stringbuilder.toString(), s1);
	//  134  291:aload_3         
	//  135  292:aload           5
	//  136  294:invokevirtual   #266 <Method String StringBuilder.toString()>
	//  137  297:aload_2         
	//  138  298:invokevirtual   #186 <Method void Bundle.putString(String, String)>
				}
				i1++;
	//  139  301:iload_1         
	//  140  302:iconst_1        
	//  141  303:iadd            
	//  142  304:istore_1        
			} while(true);
	//  143  305:goto            219
			aw.e().a(a, c.a, "gmob-apps", bundle, true);
	//  144  308:invokestatic    #271 <Method xg aw.e()>
	//  145  311:aload_0         
	//  146  312:getfield        #89  <Field Context a>
	//  147  315:aload_0         
	//  148  316:getfield        #91  <Field zzbbi c>
	//  149  319:getfield        #274 <Field String zzbbi.a>
	//  150  322:ldc2            #276 <String "gmob-apps">
	//  151  325:aload_3         
	//  152  326:iconst_1        
	//  153  327:invokevirtual   #281 <Method void xg.a(Context, String, String, Bundle, boolean)>
			o = true;
	//  154  330:aload_0         
	//  155  331:iconst_1        
	//  156  332:putfield        #176 <Field boolean o>
		}
	//  157  335:return          
	}

	public final void b(acm acm1)
	{
		if(k && !l)
	//*   0    0:aload_0         
	//*   1    1:getfield        #81  <Field boolean k>
	//*   2    4:ifeq            60
	//*   3    7:aload_0         
	//*   4    8:getfield        #83  <Field boolean l>
	//*   5   11:ifne            60
		{
			if(wx.a() && !l)
	//*   6   14:invokestatic    #283 <Method boolean wx.a()>
	//*   7   17:ifeq            33
	//*   8   20:aload_0         
	//*   9   21:getfield        #83  <Field boolean l>
	//*  10   24:ifne            33
				wx.a("VideoMetricsMixin first frame");
	//   11   27:ldc2            #285 <String "VideoMetricsMixin first frame">
	//   12   30:invokestatic    #287 <Method void wx.a(String)>
			v.a(e, d, new String[] {
				"vff2"
			});
	//   13   33:aload_0         
	//   14   34:getfield        #95  <Field ad e>
	//   15   37:aload_0         
	//   16   38:getfield        #97  <Field aa d>
	//   17   41:iconst_1        
	//   18   42:anewarray       String[]
	//   19   45:dup             
	//   20   46:iconst_0        
	//   21   47:ldc2            #289 <String "vff2">
	//   22   50:aastore         
	//   23   51:invokestatic    #148 <Method boolean v.a(ad, aa, String[])>
	//   24   54:pop             
			l = true;
	//   25   55:aload_0         
	//   26   56:iconst_1        
	//   27   57:putfield        #83  <Field boolean l>
		}
		long l2 = aw.l().c();
	//   28   60:invokestatic    #292 <Method e aw.l()>
	//   29   63:invokeinterface #297 <Method long e.c()>
	//   30   68:lstore          10
		if(m && p && q != -1L)
	//*  31   70:aload_0         
	//*  32   71:getfield        #299 <Field boolean m>
	//*  33   74:ifeq            138
	//*  34   77:aload_0         
	//*  35   78:getfield        #301 <Field boolean p>
	//*  36   81:ifeq            138
	//*  37   84:aload_0         
	//*  38   85:getfield        #87  <Field long q>
	//*  39   88:ldc2w           #84  <Long -1L>
	//*  40   91:lcmp            
	//*  41   92:ifeq            138
		{
			double d1 = TimeUnit.SECONDS.toNanos(1L);
	//   42   95:getstatic       #307 <Field TimeUnit TimeUnit.SECONDS>
	//   43   98:lconst_1        
	//   44   99:invokevirtual   #311 <Method long TimeUnit.toNanos(long)>
	//   45  102:l2d             
	//   46  103:dstore_2        
			double d2 = l2 - q;
	//   47  104:lload           10
	//   48  106:aload_0         
	//   49  107:getfield        #87  <Field long q>
	//   50  110:lsub            
	//   51  111:l2d             
	//   52  112:dstore          4
			Double.isNaN(d1);
	//   53  114:dload_2         
	//   54  115:invokestatic    #315 <Method boolean Double.isNaN(double)>
	//   55  118:pop             
			Double.isNaN(d2);
	//   56  119:dload           4
	//   57  121:invokestatic    #315 <Method boolean Double.isNaN(double)>
	//   58  124:pop             
			d1 /= d2;
	//   59  125:dload_2         
	//   60  126:dload           4
	//   61  128:ddiv            
	//   62  129:dstore_2        
			f.a(d1);
	//   63  130:aload_0         
	//   64  131:getfield        #75  <Field yo f>
	//   65  134:dload_2         
	//   66  135:invokevirtual   #318 <Method void yo.a(double)>
		}
		p = m;
	//   67  138:aload_0         
	//   68  139:aload_0         
	//   69  140:getfield        #299 <Field boolean m>
	//   70  143:putfield        #301 <Field boolean p>
		q = l2;
	//   71  146:aload_0         
	//   72  147:lload           10
	//   73  149:putfield        #87  <Field long q>
		com.google.android.gms.internal.ads.e e1 = p.v;
	//   74  152:getstatic       #321 <Field com.google.android.gms.internal.ads.e p.v>
	//   75  155:astore          16
		l2 = ((Long)com.google.android.gms.internal.ads.bwk.e().a(e1)).longValue();
	//   76  157:invokestatic    #108 <Method m com.google.android.gms.internal.ads.bwk.e()>
	//   77  160:aload           16
	//   78  162:invokevirtual   #113 <Method Object m.a(com.google.android.gms.internal.ads.e)>
	//   79  165:checkcast       #129 <Class Long>
	//   80  168:invokevirtual   #324 <Method long Long.longValue()>
	//   81  171:lstore          10
		long l4 = acm1.getCurrentPosition();
	//   82  173:aload_1         
	//   83  174:invokevirtual   #327 <Method int acm.getCurrentPosition()>
	//   84  177:i2l             
	//   85  178:lstore          12
		int i1 = 0;
	//   86  180:iconst_0        
	//   87  181:istore          6
		do
		{
			String as[] = h;
	//   88  183:aload_0         
	//   89  184:getfield        #117 <Field String[] h>
	//   90  187:astore          16
			if(i1 < as.length)
	//*  91  189:iload           6
	//*  92  191:aload           16
	//*  93  193:arraylength     
	//*  94  194:icmpge          380
			{
				if(as[i1] == null && l2 > Math.abs(l4 - g[i1]))
	//*  95  197:aload           16
	//*  96  199:iload           6
	//*  97  201:aaload          
	//*  98  202:ifnonnull       371
	//*  99  205:lload           10
	//* 100  207:lload           12
	//* 101  209:aload_0         
	//* 102  210:getfield        #119 <Field long[] g>
	//* 103  213:iload           6
	//* 104  215:laload          
	//* 105  216:lsub            
	//* 106  217:invokestatic    #332 <Method long Math.abs(long)>
	//* 107  220:lcmp            
	//* 108  221:ifle            368
				{
					String as1[] = h;
	//  109  224:aload_0         
	//  110  225:getfield        #117 <Field String[] h>
	//  111  228:astore          16
					acm1 = ((acm) (((TextureView) (acm1)).getBitmap(8, 8)));
	//  112  230:aload_1         
	//  113  231:bipush          8
	//  114  233:bipush          8
	//  115  235:invokevirtual   #338 <Method Bitmap TextureView.getBitmap(int, int)>
	//  116  238:astore_1        
					long l3 = 63L;
	//  117  239:ldc2w           #339 <Long 63L>
	//  118  242:lstore          10
					int j1 = 0;
	//  119  244:iconst_0        
	//  120  245:istore          7
					long l5 = 0L;
	//  121  247:lconst_0        
	//  122  248:lstore          12
					for(; j1 < 8; j1++)
	//* 123  250:iload           7
	//* 124  252:bipush          8
	//* 125  254:icmpge          344
					{
						for(int k1 = 0; k1 < 8;)
	//* 126  257:iconst_0        
	//* 127  258:istore          8
	//* 128  260:iload           8
	//* 129  262:bipush          8
	//* 130  264:icmpge          335
						{
							int l1 = ((Bitmap) (acm1)).getPixel(k1, j1);
	//  131  267:aload_1         
	//  132  268:iload           8
	//  133  270:iload           7
	//  134  272:invokevirtual   #346 <Method int Bitmap.getPixel(int, int)>
	//  135  275:istore          9
							long l6;
							if(Color.blue(l1) + Color.red(l1) + Color.green(l1) > 128)
	//* 136  277:iload           9
	//* 137  279:invokestatic    #352 <Method int Color.blue(int)>
	//* 138  282:iload           9
	//* 139  284:invokestatic    #355 <Method int Color.red(int)>
	//* 140  287:iadd            
	//* 141  288:iload           9
	//* 142  290:invokestatic    #358 <Method int Color.green(int)>
	//* 143  293:iadd            
	//* 144  294:sipush          128
	//* 145  297:icmple          306
								l6 = 1L;
	//  146  300:lconst_1        
	//  147  301:lstore          14
							else
	//* 148  303:goto            309
								l6 = 0L;
	//  149  306:lconst_0        
	//  150  307:lstore          14
							l5 |= l6 << (int)l3;
	//  151  309:lload           12
	//  152  311:lload           14
	//  153  313:lload           10
	//  154  315:l2i             
	//  155  316:lshl            
	//  156  317:lor             
	//  157  318:lstore          12
							k1++;
	//  158  320:iload           8
	//  159  322:iconst_1        
	//  160  323:iadd            
	//  161  324:istore          8
							l3--;
	//  162  326:lload           10
	//  163  328:lconst_1        
	//  164  329:lsub            
	//  165  330:lstore          10
						}

					}

	//  166  332:goto            260
	//  167  335:iload           7
	//  168  337:iconst_1        
	//  169  338:iadd            
	//  170  339:istore          7
	//* 171  341:goto            250
					as1[i1] = String.format("%016X", new Object[] {
						Long.valueOf(l5)
					});
	//  172  344:aload           16
	//  173  346:iload           6
	//  174  348:ldc2            #360 <String "%016X">
	//  175  351:iconst_1        
	//  176  352:anewarray       Object[]
	//  177  355:dup             
	//  178  356:iconst_0        
	//  179  357:lload           12
	//  180  359:invokestatic    #253 <Method Long Long.valueOf(long)>
	//  181  362:aastore         
	//  182  363:invokestatic    #364 <Method String String.format(String, Object[])>
	//  183  366:aastore         
					return;
	//  184  367:return          
				}
	//* 185  368:goto            371
				i1++;
	//  186  371:iload           6
	//  187  373:iconst_1        
	//  188  374:iadd            
	//  189  375:istore          6
			} else
	//* 190  377:goto            183
			{
				return;
	//  191  380:return          
			}
		} while(true);
	}

	public final void c()
	{
		m = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #299 <Field boolean m>
		if(j && !k)
	//*   3    5:aload_0         
	//*   4    6:getfield        #79  <Field boolean j>
	//*   5    9:ifeq            46
	//*   6   12:aload_0         
	//*   7   13:getfield        #81  <Field boolean k>
	//*   8   16:ifne            46
		{
			v.a(e, d, new String[] {
				"vfp2"
			});
	//    9   19:aload_0         
	//   10   20:getfield        #95  <Field ad e>
	//   11   23:aload_0         
	//   12   24:getfield        #97  <Field aa d>
	//   13   27:iconst_1        
	//   14   28:anewarray       String[]
	//   15   31:dup             
	//   16   32:iconst_0        
	//   17   33:ldc2            #366 <String "vfp2">
	//   18   36:aastore         
	//   19   37:invokestatic    #148 <Method boolean v.a(ad, aa, String[])>
	//   20   40:pop             
			k = true;
	//   21   41:aload_0         
	//   22   42:iconst_1        
	//   23   43:putfield        #81  <Field boolean k>
		}
	//   24   46:return          
	}

	public final void d()
	{
		m = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #299 <Field boolean m>
	//    3    5:return          
	}

	private final Context a;
	private final String b;
	private final zzbbi c;
	private final aa d;
	private final ad e;
	private final yo f = (new yr()).a("min_1", 4.9406564584124654E-324D, 1.0D).a("1_5", 1.0D, 5D).a("5_10", 5D, 10D).a("10_20", 10D, 20D).a("20_30", 20D, 30D).a("30_max", 30D, 1.7976931348623157E+308D).a();
	private final long g[];
	private final String h[];
	private boolean i;
	private boolean j;
	private boolean k;
	private boolean l;
	private boolean m;
	private acm n;
	private boolean o;
	private boolean p;
	private long q;
}
