// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.ads.interactivemedia.v3.impl;

import android.content.Context;
import android.util.Log;
import com.google.ads.interactivemedia.v3.api.Ad;
import com.google.ads.interactivemedia.v3.api.AdError;
import com.google.ads.interactivemedia.v3.api.AdErrorEvent;
import com.google.ads.interactivemedia.v3.api.AdsRenderingSettings;
import com.google.ads.interactivemedia.v3.api.BaseDisplayContainer;
import com.google.ads.interactivemedia.v3.api.BaseManager;
import com.google.ads.interactivemedia.v3.api.player.VideoProgressUpdate;
import com.google.ads.interactivemedia.v3.impl.c.b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.google.ads.interactivemedia.v3.impl:
//			w, a, ab, d, 
//			al, u, c, aa, 
//			l, t, ad

abstract class q
	implements BaseManager, ab.d
{

	protected q(String s, ab ab1, ad ad, BaseDisplayContainer basedisplaycontainer, a a1, Context context, boolean flag)
		throws AdError
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #38  <Method void Object()>
		f = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #40  <Field boolean f>
	//    5    9:aload_0         
	//    6   10:new             #42  <Class ArrayList>
	//    7   13:dup             
	//    8   14:iconst_1        
	//    9   15:invokespecial   #45  <Method void ArrayList(int)>
	//   10   18:putfield        #47  <Field List g>
	//   11   21:aload_0         
	//   12   22:new             #49  <Class w>
	//   13   25:dup             
	//   14   26:invokespecial   #50  <Method void w()>
	//   15   29:putfield        #52  <Field w h>
		b = s;
	//   16   32:aload_0         
	//   17   33:aload_1         
	//   18   34:putfield        #54  <Field String b>
		a = ab1;
	//   19   37:aload_0         
	//   20   38:aload_2         
	//   21   39:putfield        #56  <Field ab a>
		if(a1 != null)
	//*  22   42:aload           5
	//*  23   44:ifnull          56
			j = a1;
	//   24   47:aload_0         
	//   25   48:aload           5
	//   26   50:putfield        #58  <Field a j>
		else
	//*  27   53:goto            76
			j = new a(s, ab1, ((android.view.View) (basedisplaycontainer.getAdContainer())));
	//   28   56:aload_0         
	//   29   57:new             #60  <Class a>
	//   30   60:dup             
	//   31   61:aload_1         
	//   32   62:aload_2         
	//   33   63:aload           4
	//   34   65:invokeinterface #66  <Method android.view.ViewGroup BaseDisplayContainer.getAdContainer()>
	//   35   70:invokespecial   #69  <Method void a(String, ab, android.view.View)>
	//   36   73:putfield        #58  <Field a j>
		j.a(flag);
	//   37   76:aload_0         
	//   38   77:getfield        #58  <Field a j>
	//   39   80:iload           7
	//   40   82:invokevirtual   #72  <Method void a.a(boolean)>
		ab1.a(((ab.d) (this)), s);
	//   41   85:aload_2         
	//   42   86:aload_0         
	//   43   87:aload_1         
	//   44   88:invokevirtual   #77  <Method void ab.a(ab$d, String)>
		j.a();
	//   45   91:aload_0         
	//   46   92:getfield        #58  <Field a j>
	//   47   95:invokevirtual   #79  <Method void a.a()>
	//   48   98:return          
	}

	private void a(com.google.ads.interactivemedia.v3.api.AdEvent.AdEventType adeventtype)
	{
		a(adeventtype, ((Map) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #85  <Method void a(com.google.ads.interactivemedia.v3.api.AdEvent$AdEventType, Map)>
	//    4    6:return          
	}

	private void a(com.google.ads.interactivemedia.v3.api.AdEvent.AdEventType adeventtype, Map map)
	{
		adeventtype = ((com.google.ads.interactivemedia.v3.api.AdEvent.AdEventType) (new d(adeventtype, ((Ad) (i)), map)));
	//    0    0:new             #87  <Class d>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aload_0         
	//    4    6:getfield        #89  <Field com.google.ads.interactivemedia.v3.impl.data.b i>
	//    5    9:aload_2         
	//    6   10:invokespecial   #92  <Method void d(com.google.ads.interactivemedia.v3.api.AdEvent$AdEventType, Ad, Map)>
	//    7   13:astore_1        
		for(map = ((Map) (g.iterator())); ((Iterator) (map)).hasNext(); ((com.google.ads.interactivemedia.v3.api.AdEvent.AdEventListener)((Iterator) (map)).next()).onAdEvent(((com.google.ads.interactivemedia.v3.api.AdEvent) (adeventtype))));
	//    8   14:aload_0         
	//    9   15:getfield        #47  <Field List g>
	//   10   18:invokeinterface #98  <Method Iterator List.iterator()>
	//   11   23:astore_2        
	//   12   24:aload_2         
	//   13   25:invokeinterface #104 <Method boolean Iterator.hasNext()>
	//   14   30:ifeq            51
	//   15   33:aload_2         
	//   16   34:invokeinterface #108 <Method Object Iterator.next()>
	//   17   39:checkcast       #110 <Class com.google.ads.interactivemedia.v3.api.AdEvent$AdEventListener>
	//   18   42:aload_1         
	//   19   43:invokeinterface #114 <Method void com.google.ads.interactivemedia.v3.api.AdEvent$AdEventListener.onAdEvent(com.google.ads.interactivemedia.v3.api.AdEvent)>
	//*  20   48:goto            24
	//   21   51:return          
	}

	protected void a()
	{
		c.e();
	//    0    0:aload_0         
	//    1    1:getfield        #118 <Field al c>
	//    2    4:invokeinterface #122 <Method void al.e()>
		u u1 = e;
	//    3    9:aload_0         
	//    4   10:getfield        #124 <Field u e>
	//    5   13:astore_1        
		if(u1 != null)
	//*   6   14:aload_1         
	//*   7   15:ifnull          22
			u1.c();
	//    8   18:aload_1         
	//    9   19:invokevirtual   #128 <Method void u.c()>
		j.b();
	//   10   22:aload_0         
	//   11   23:getfield        #58  <Field a j>
	//   12   26:invokevirtual   #130 <Method void com.google.ads.interactivemedia.v3.impl.a.b()>
		a.c(b);
	//   13   29:aload_0         
	//   14   30:getfield        #56  <Field ab a>
	//   15   33:aload_0         
	//   16   34:getfield        #54  <Field String b>
	//   17   37:invokevirtual   #133 <Method void ab.c(String)>
		i = null;
	//   18   40:aload_0         
	//   19   41:aconst_null     
	//   20   42:putfield        #89  <Field com.google.ads.interactivemedia.v3.impl.data.b i>
	//   21   45:return          
	}

	public void a(com.google.ads.interactivemedia.v3.api.AdError.AdErrorType aderrortype, int k, String s)
	{
		a(((AdErrorEvent) (new c(new AdError(aderrortype, k, s)))));
	//    0    0:aload_0         
	//    1    1:new             #136 <Class c>
	//    2    4:dup             
	//    3    5:new             #35  <Class AdError>
	//    4    8:dup             
	//    5    9:aload_1         
	//    6   10:iload_2         
	//    7   11:aload_3         
	//    8   12:invokespecial   #138 <Method void AdError(com.google.ads.interactivemedia.v3.api.AdError$AdErrorType, int, String)>
	//    9   15:invokespecial   #141 <Method void c(AdError)>
	//   10   18:invokevirtual   #144 <Method void a(AdErrorEvent)>
	//   11   21:return          
	}

	public void a(com.google.ads.interactivemedia.v3.api.AdError.AdErrorType aderrortype, com.google.ads.interactivemedia.v3.api.AdError.AdErrorCode aderrorcode, String s)
	{
		a(((AdErrorEvent) (new c(new AdError(aderrortype, aderrorcode, s)))));
	//    0    0:aload_0         
	//    1    1:new             #136 <Class c>
	//    2    4:dup             
	//    3    5:new             #35  <Class AdError>
	//    4    8:dup             
	//    5    9:aload_1         
	//    6   10:aload_2         
	//    7   11:aload_3         
	//    8   12:invokespecial   #147 <Method void AdError(com.google.ads.interactivemedia.v3.api.AdError$AdErrorType, com.google.ads.interactivemedia.v3.api.AdError$AdErrorCode, String)>
	//    9   15:invokespecial   #141 <Method void c(AdError)>
	//   10   18:invokevirtual   #144 <Method void a(AdErrorEvent)>
	//   11   21:return          
	}

	void a(AdErrorEvent aderrorevent)
	{
		h.a(aderrorevent);
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field w h>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #148 <Method void w.a(AdErrorEvent)>
	//    4    8:return          
	}

	protected void a(aa.c c1)
	{
		a.b(new aa(aa.b.adsManager, c1, b));
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field ab a>
	//    2    4:new             #151 <Class aa>
	//    3    7:dup             
	//    4    8:getstatic       #157 <Field aa$b aa$b.adsManager>
	//    5   11:aload_1         
	//    6   12:aload_0         
	//    7   13:getfield        #54  <Field String b>
	//    8   16:invokespecial   #160 <Method void aa(aa$b, aa$c, String)>
	//    9   19:invokevirtual   #163 <Method void com.google.ads.interactivemedia.v3.impl.ab.b(aa)>
	//   10   22:return          
	}

	public void a(ab.c c1)
	{
		com.google.ads.interactivemedia.v3.api.AdEvent.AdEventType adeventtype = c1.a;
	//    0    0:aload_1         
	//    1    1:getfield        #169 <Field com.google.ads.interactivemedia.v3.api.AdEvent$AdEventType ab$c.a>
	//    2    4:astore_2        
		Object obj = ((Object) (c1.b));
	//    3    5:aload_1         
	//    4    6:getfield        #171 <Field com.google.ads.interactivemedia.v3.impl.data.b com.google.ads.interactivemedia.v3.impl.ab$c.b>
	//    5    9:astore_3        
		static class _cls1
		{

			static final int a[];

			static 
			{
				a = new int[com.google.ads.interactivemedia.v3.api.AdEvent.AdEventType.values().length];
			//    0    0:invokestatic    #18  <Method com.google.ads.interactivemedia.v3.api.AdEvent$AdEventType[] com.google.ads.interactivemedia.v3.api.AdEvent$AdEventType.values()>
			//    1    3:arraylength     
			//    2    4:newarray        int[]
			//    3    6:putstatic       #20  <Field int[] a>
				try
				{
					a[com.google.ads.interactivemedia.v3.api.AdEvent.AdEventType.LOADED.ordinal()] = 1;
			//    4    9:getstatic       #20  <Field int[] a>
			//    5   12:getstatic       #24  <Field com.google.ads.interactivemedia.v3.api.AdEvent$AdEventType com.google.ads.interactivemedia.v3.api.AdEvent$AdEventType.LOADED>
			//    6   15:invokevirtual   #28  <Method int com.google.ads.interactivemedia.v3.api.AdEvent$AdEventType.ordinal()>
			//    7   18:iconst_1        
			//    8   19:iastore         
				}
			//*   9   20:getstatic       #20  <Field int[] a>
			//*  10   23:getstatic       #31  <Field com.google.ads.interactivemedia.v3.api.AdEvent$AdEventType com.google.ads.interactivemedia.v3.api.AdEvent$AdEventType.STARTED>
			//*  11   26:invokevirtual   #28  <Method int com.google.ads.interactivemedia.v3.api.AdEvent$AdEventType.ordinal()>
			//*  12   29:iconst_2        
			//*  13   30:iastore         
			//*  14   31:getstatic       #20  <Field int[] a>
			//*  15   34:getstatic       #34  <Field com.google.ads.interactivemedia.v3.api.AdEvent$AdEventType com.google.ads.interactivemedia.v3.api.AdEvent$AdEventType.COMPLETED>
			//*  16   37:invokevirtual   #28  <Method int com.google.ads.interactivemedia.v3.api.AdEvent$AdEventType.ordinal()>
			//*  17   40:iconst_3        
			//*  18   41:iastore         
			//*  19   42:getstatic       #20  <Field int[] a>
			//*  20   45:getstatic       #37  <Field com.google.ads.interactivemedia.v3.api.AdEvent$AdEventType com.google.ads.interactivemedia.v3.api.AdEvent$AdEventType.SKIPPED>
			//*  21   48:invokevirtual   #28  <Method int com.google.ads.interactivemedia.v3.api.AdEvent$AdEventType.ordinal()>
			//*  22   51:iconst_4        
			//*  23   52:iastore         
			//*  24   53:getstatic       #20  <Field int[] a>
			//*  25   56:getstatic       #40  <Field com.google.ads.interactivemedia.v3.api.AdEvent$AdEventType com.google.ads.interactivemedia.v3.api.AdEvent$AdEventType.CONTENT_PAUSE_REQUESTED>
			//*  26   59:invokevirtual   #28  <Method int com.google.ads.interactivemedia.v3.api.AdEvent$AdEventType.ordinal()>
			//*  27   62:iconst_5        
			//*  28   63:iastore         
			//*  29   64:getstatic       #20  <Field int[] a>
			//*  30   67:getstatic       #43  <Field com.google.ads.interactivemedia.v3.api.AdEvent$AdEventType com.google.ads.interactivemedia.v3.api.AdEvent$AdEventType.CONTENT_RESUME_REQUESTED>
			//*  31   70:invokevirtual   #28  <Method int com.google.ads.interactivemedia.v3.api.AdEvent$AdEventType.ordinal()>
			//*  32   73:bipush          6
			//*  33   75:iastore         
			//*  34   76:getstatic       #20  <Field int[] a>
			//*  35   79:getstatic       #46  <Field com.google.ads.interactivemedia.v3.api.AdEvent$AdEventType com.google.ads.interactivemedia.v3.api.AdEvent$AdEventType.CLICKED>
			//*  36   82:invokevirtual   #28  <Method int com.google.ads.interactivemedia.v3.api.AdEvent$AdEventType.ordinal()>
			//*  37   85:bipush          7
			//*  38   87:iastore         
			//*  39   88:getstatic       #20  <Field int[] a>
			//*  40   91:getstatic       #49  <Field com.google.ads.interactivemedia.v3.api.AdEvent$AdEventType com.google.ads.interactivemedia.v3.api.AdEvent$AdEventType.ICON_TAPPED>
			//*  41   94:invokevirtual   #28  <Method int com.google.ads.interactivemedia.v3.api.AdEvent$AdEventType.ordinal()>
			//*  42   97:bipush          8
			//*  43   99:iastore         
			//*  44  100:return          
				catch(NoSuchFieldError nosuchfielderror) { }
			//   45  101:astore_0        
				try
				{
					a[com.google.ads.interactivemedia.v3.api.AdEvent.AdEventType.STARTED.ordinal()] = 2;
				}
			//*  46  102:goto            20
				catch(NoSuchFieldError nosuchfielderror1) { }
			//   47  105:astore_0        
				try
				{
					a[com.google.ads.interactivemedia.v3.api.AdEvent.AdEventType.COMPLETED.ordinal()] = 3;
				}
			//*  48  106:goto            31
				catch(NoSuchFieldError nosuchfielderror2) { }
			//   49  109:astore_0        
				try
				{
					a[com.google.ads.interactivemedia.v3.api.AdEvent.AdEventType.SKIPPED.ordinal()] = 4;
				}
			//*  50  110:goto            42
				catch(NoSuchFieldError nosuchfielderror3) { }
			//   51  113:astore_0        
				try
				{
					a[com.google.ads.interactivemedia.v3.api.AdEvent.AdEventType.CONTENT_PAUSE_REQUESTED.ordinal()] = 5;
				}
			//*  52  114:goto            53
				catch(NoSuchFieldError nosuchfielderror4) { }
			//   53  117:astore_0        
				try
				{
					a[com.google.ads.interactivemedia.v3.api.AdEvent.AdEventType.CONTENT_RESUME_REQUESTED.ordinal()] = 6;
				}
			//*  54  118:goto            64
				catch(NoSuchFieldError nosuchfielderror5) { }
			//   55  121:astore_0        
				try
				{
					a[com.google.ads.interactivemedia.v3.api.AdEvent.AdEventType.CLICKED.ordinal()] = 7;
				}
			//*  56  122:goto            76
				catch(NoSuchFieldError nosuchfielderror6) { }
			//   57  125:astore_0        
				try
				{
					a[com.google.ads.interactivemedia.v3.api.AdEvent.AdEventType.ICON_TAPPED.ordinal()] = 8;
				}
			//*  58  126:goto            88
				catch(NoSuchFieldError nosuchfielderror7) { }
			//   59  129:astore_0        
			//*  60  130:return          
			}
		}

		switch(_cls1.a[adeventtype.ordinal()])
	//*   6   10:getstatic       #174 <Field int[] q$1.a>
	//*   7   13:aload_2         
	//*   8   14:invokevirtual   #180 <Method int com.google.ads.interactivemedia.v3.api.AdEvent$AdEventType.ordinal()>
	//*   9   17:iaload          
		{
	//*  10   18:tableswitch     1 8: default 64
	//	               1 194
	//	               2 172
	//	               3 160
	//	               4 160
	//	               5 137
	//	               6 114
	//	               7 91
	//	               8 67
	//*  11   64:goto            199
		case 8: // '\b'
			if(!com.google.ads.interactivemedia.v3.impl.c.b.a(c1.f))
	//*  12   67:aload_1         
	//*  13   68:getfield        #182 <Field String ab$c.f>
	//*  14   71:invokestatic    #187 <Method boolean b.a(String)>
	//*  15   74:ifne            199
				a.d(c1.f);
	//   16   77:aload_0         
	//   17   78:getfield        #56  <Field ab a>
	//   18   81:aload_1         
	//   19   82:getfield        #182 <Field String ab$c.f>
	//   20   85:invokevirtual   #189 <Method void ab.d(String)>
			break;

	//*  21   88:goto            199
		case 7: // '\007'
			obj = ((Object) (((com.google.ads.interactivemedia.v3.impl.data.b) (obj)).getClickThruUrl()));
	//   22   91:aload_3         
	//   23   92:invokevirtual   #195 <Method String com.google.ads.interactivemedia.v3.impl.data.b.getClickThruUrl()>
	//   24   95:astore_3        
			if(!com.google.ads.interactivemedia.v3.impl.c.b.a(((String) (obj))))
	//*  25   96:aload_3         
	//*  26   97:invokestatic    #187 <Method boolean b.a(String)>
	//*  27  100:ifne            199
				a.d(((String) (obj)));
	//   28  103:aload_0         
	//   29  104:getfield        #56  <Field ab a>
	//   30  107:aload_3         
	//   31  108:invokevirtual   #189 <Method void ab.d(String)>
			break;

	//*  32  111:goto            199
		case 6: // '\006'
			obj = ((Object) (e));
	//   33  114:aload_0         
	//   34  115:getfield        #124 <Field u e>
	//   35  118:astore_3        
			if(obj != null)
	//*  36  119:aload_3         
	//*  37  120:ifnull          127
				((u) (obj)).b();
	//   38  123:aload_3         
	//   39  124:invokevirtual   #196 <Method void com.google.ads.interactivemedia.v3.impl.u.b()>
			j.d();
	//   40  127:aload_0         
	//   41  128:getfield        #58  <Field a j>
	//   42  131:invokevirtual   #198 <Method void a.d()>
			break;

	//*  43  134:goto            199
		case 5: // '\005'
			obj = ((Object) (e));
	//   44  137:aload_0         
	//   45  138:getfield        #124 <Field u e>
	//   46  141:astore_3        
			if(obj != null)
	//*  47  142:aload_3         
	//*  48  143:ifnull          150
				((u) (obj)).c();
	//   49  146:aload_3         
	//   50  147:invokevirtual   #128 <Method void u.c()>
			j.c();
	//   51  150:aload_0         
	//   52  151:getfield        #58  <Field a j>
	//   53  154:invokevirtual   #199 <Method void a.c()>
			break;

	//*  54  157:goto            199
		case 3: // '\003'
		case 4: // '\004'
			c.b();
	//   55  160:aload_0         
	//   56  161:getfield        #118 <Field al c>
	//   57  164:invokeinterface #200 <Method void com.google.ads.interactivemedia.v3.impl.al.b()>
			break;

	//*  58  169:goto            199
		case 2: // '\002'
			if(obj != null)
	//*  59  172:aload_3         
	//*  60  173:ifnull          181
				a(((com.google.ads.interactivemedia.v3.impl.data.b) (obj)));
	//   61  176:aload_0         
	//   62  177:aload_3         
	//   63  178:invokevirtual   #203 <Method void a(com.google.ads.interactivemedia.v3.impl.data.b)>
			c.a(((com.google.ads.interactivemedia.v3.impl.data.b) (obj)));
	//   64  181:aload_0         
	//   65  182:getfield        #118 <Field al c>
	//   66  185:aload_3         
	//   67  186:invokeinterface #204 <Method void al.a(com.google.ads.interactivemedia.v3.impl.data.b)>
			break;

	//*  68  191:goto            199
		case 1: // '\001'
			a(((com.google.ads.interactivemedia.v3.impl.data.b) (obj)));
	//   69  194:aload_0         
	//   70  195:aload_3         
	//   71  196:invokevirtual   #203 <Method void a(com.google.ads.interactivemedia.v3.impl.data.b)>
			break;
		}
		if(c1.c != null)
	//*  72  199:aload_1         
	//*  73  200:getfield        #207 <Field Map ab$c.c>
	//*  74  203:ifnull          218
			a(adeventtype, c1.c);
	//   75  206:aload_0         
	//   76  207:aload_2         
	//   77  208:aload_1         
	//   78  209:getfield        #207 <Field Map ab$c.c>
	//   79  212:invokespecial   #85  <Method void a(com.google.ads.interactivemedia.v3.api.AdEvent$AdEventType, Map)>
		else
	//*  80  215:goto            223
			a(adeventtype);
	//   81  218:aload_0         
	//   82  219:aload_2         
	//   83  220:invokespecial   #209 <Method void a(com.google.ads.interactivemedia.v3.api.AdEvent$AdEventType)>
		if(adeventtype == com.google.ads.interactivemedia.v3.api.AdEvent.AdEventType.COMPLETED || adeventtype == com.google.ads.interactivemedia.v3.api.AdEvent.AdEventType.SKIPPED)
	//*  84  223:aload_2         
	//*  85  224:getstatic       #212 <Field com.google.ads.interactivemedia.v3.api.AdEvent$AdEventType com.google.ads.interactivemedia.v3.api.AdEvent$AdEventType.COMPLETED>
	//*  86  227:if_acmpeq       237
	//*  87  230:aload_2         
	//*  88  231:getstatic       #215 <Field com.google.ads.interactivemedia.v3.api.AdEvent$AdEventType com.google.ads.interactivemedia.v3.api.AdEvent$AdEventType.SKIPPED>
	//*  89  234:if_acmpne       242
			a(((com.google.ads.interactivemedia.v3.impl.data.b) (null)));
	//   90  237:aload_0         
	//   91  238:aconst_null     
	//   92  239:invokevirtual   #203 <Method void a(com.google.ads.interactivemedia.v3.impl.data.b)>
	//   93  242:return          
	}

	void a(com.google.ads.interactivemedia.v3.impl.data.b b1)
	{
		i = b1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #89  <Field com.google.ads.interactivemedia.v3.impl.data.b i>
	//    3    5:return          
	}

	public void a(Map map)
	{
	//    0    0:return          
	}

	public void addAdErrorListener(com.google.ads.interactivemedia.v3.api.AdErrorEvent.AdErrorListener aderrorlistener)
	{
		h.a(aderrorlistener);
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field w h>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #221 <Method void w.a(com.google.ads.interactivemedia.v3.api.AdErrorEvent$AdErrorListener)>
	//    4    8:return          
	}

	public void addAdEventListener(com.google.ads.interactivemedia.v3.api.AdEvent.AdEventListener adeventlistener)
	{
		g.add(((Object) (adeventlistener)));
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field List g>
	//    2    4:aload_1         
	//    3    5:invokeinterface #227 <Method boolean List.add(Object)>
	//    4   10:pop             
	//    5   11:return          
	}

	public void destroy()
	{
		a(aa.c.destroy);
	//    0    0:aload_0         
	//    1    1:getstatic       #233 <Field aa$c aa$c.destroy>
	//    2    4:invokevirtual   #235 <Method void a(aa$c)>
		f = true;
	//    3    7:aload_0         
	//    4    8:iconst_1        
	//    5    9:putfield        #40  <Field boolean f>
	//    6   12:return          
	}

	public VideoProgressUpdate getAdProgress()
	{
		if(f)
	//*   0    0:aload_0         
	//*   1    1:getfield        #40  <Field boolean f>
	//*   2    4:ifeq            11
			return VideoProgressUpdate.VIDEO_TIME_NOT_READY;
	//    3    7:getstatic       #243 <Field VideoProgressUpdate VideoProgressUpdate.VIDEO_TIME_NOT_READY>
	//    4   10:areturn         
		else
			return c.getAdProgress();
	//    5   11:aload_0         
	//    6   12:getfield        #118 <Field al c>
	//    7   15:invokeinterface #245 <Method VideoProgressUpdate al.getAdProgress()>
	//    8   20:areturn         
	}

	public Ad getCurrentAd()
	{
		return ((Ad) (i));
	//    0    0:aload_0         
	//    1    1:getfield        #89  <Field com.google.ads.interactivemedia.v3.impl.data.b i>
	//    2    4:areturn         
	}

	public void init()
	{
		init(((AdsRenderingSettings) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokevirtual   #251 <Method void init(AdsRenderingSettings)>
	//    3    5:return          
	}

	public void init(AdsRenderingSettings adsrenderingsettings)
	{
		HashMap hashmap = new HashMap();
	//    0    0:new             #253 <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #254 <Method void HashMap()>
	//    3    7:astore          5
		Object obj;
		if(adsrenderingsettings == null)
	//*   4    9:aload_1         
	//*   5   10:ifnonnull       25
			obj = ((Object) (new l()));
	//    6   13:new             #256 <Class l>
	//    7   16:dup             
	//    8   17:invokespecial   #257 <Method void l()>
	//    9   20:astore          4
		else
	//*  10   22:goto            28
			obj = ((Object) (adsrenderingsettings));
	//   11   25:aload_1         
	//   12   26:astore          4
		((Map) (hashmap)).put("adsRenderingSettings", obj);
	//   13   28:aload           5
	//   14   30:ldc2            #259 <String "adsRenderingSettings">
	//   15   33:aload           4
	//   16   35:invokeinterface #265 <Method Object Map.put(Object, Object)>
	//   17   40:pop             
		obj = ((Object) (e));
	//   18   41:aload_0         
	//   19   42:getfield        #124 <Field u e>
	//   20   45:astore          4
		if(obj != null)
	//*  21   47:aload           4
	//*  22   49:ifnull          131
		{
			obj = ((Object) (((u) (obj)).a()));
	//   23   52:aload           4
	//   24   54:invokevirtual   #267 <Method VideoProgressUpdate u.a()>
	//   25   57:astore          4
			if(!((VideoProgressUpdate) (obj)).equals(((Object) (VideoProgressUpdate.VIDEO_TIME_NOT_READY))))
	//*  26   59:aload           4
	//*  27   61:getstatic       #243 <Field VideoProgressUpdate VideoProgressUpdate.VIDEO_TIME_NOT_READY>
	//*  28   64:invokevirtual   #270 <Method boolean VideoProgressUpdate.equals(Object)>
	//*  29   67:ifne            131
			{
				double d1 = ((VideoProgressUpdate) (obj)).getCurrentTime();
	//   30   70:aload           4
	//   31   72:invokevirtual   #274 <Method float VideoProgressUpdate.getCurrentTime()>
	//   32   75:f2d             
	//   33   76:dstore_2        
				obj = ((Object) (new StringBuilder(68)));
	//   34   77:new             #276 <Class StringBuilder>
	//   35   80:dup             
	//   36   81:bipush          68
	//   37   83:invokespecial   #277 <Method void StringBuilder(int)>
	//   38   86:astore          4
				((StringBuilder) (obj)).append("AdsManager.init -> Setting contentStartTime ");
	//   39   88:aload           4
	//   40   90:ldc2            #279 <String "AdsManager.init -> Setting contentStartTime ">
	//   41   93:invokevirtual   #283 <Method StringBuilder StringBuilder.append(String)>
	//   42   96:pop             
				((StringBuilder) (obj)).append(d1);
	//   43   97:aload           4
	//   44   99:dload_2         
	//   45  100:invokevirtual   #286 <Method StringBuilder StringBuilder.append(double)>
	//   46  103:pop             
				Log.d("IMASDK", ((StringBuilder) (obj)).toString());
	//   47  104:ldc2            #288 <String "IMASDK">
	//   48  107:aload           4
	//   49  109:invokevirtual   #291 <Method String StringBuilder.toString()>
	//   50  112:invokestatic    #296 <Method int Log.d(String, String)>
	//   51  115:pop             
				((Map) (hashmap)).put("contentStartTime", ((Object) (Double.valueOf(d1))));
	//   52  116:aload           5
	//   53  118:ldc2            #298 <String "contentStartTime">
	//   54  121:dload_2         
	//   55  122:invokestatic    #304 <Method Double Double.valueOf(double)>
	//   56  125:invokeinterface #265 <Method Object Map.put(Object, Object)>
	//   57  130:pop             
			}
		}
		if(!isCustomPlaybackUsed())
	//*  58  131:aload_0         
	//*  59  132:invokevirtual   #307 <Method boolean isCustomPlaybackUsed()>
	//*  60  135:ifne            153
			((Map) (hashmap)).put("sdkOwnedPlayer", ((Object) (Boolean.valueOf(true))));
	//   61  138:aload           5
	//   62  140:ldc2            #309 <String "sdkOwnedPlayer">
	//   63  143:iconst_1        
	//   64  144:invokestatic    #314 <Method Boolean Boolean.valueOf(boolean)>
	//   65  147:invokeinterface #265 <Method Object Map.put(Object, Object)>
	//   66  152:pop             
		c.a();
	//   67  153:aload_0         
	//   68  154:getfield        #118 <Field al c>
	//   69  157:invokeinterface #315 <Method void al.a()>
		a.a(adsrenderingsettings);
	//   70  162:aload_0         
	//   71  163:getfield        #56  <Field ab a>
	//   72  166:aload_1         
	//   73  167:invokevirtual   #317 <Method void ab.a(AdsRenderingSettings)>
		a.b(new aa(aa.b.adsManager, aa.c.init, b, ((Object) (hashmap))));
	//   74  170:aload_0         
	//   75  171:getfield        #56  <Field ab a>
	//   76  174:new             #151 <Class aa>
	//   77  177:dup             
	//   78  178:getstatic       #157 <Field aa$b aa$b.adsManager>
	//   79  181:getstatic       #319 <Field aa$c aa$c.init>
	//   80  184:aload_0         
	//   81  185:getfield        #54  <Field String b>
	//   82  188:aload           5
	//   83  190:invokespecial   #322 <Method void aa(aa$b, aa$c, String, Object)>
	//   84  193:invokevirtual   #163 <Method void com.google.ads.interactivemedia.v3.impl.ab.b(aa)>
	//   85  196:return          
	}

	public abstract boolean isCustomPlaybackUsed();

	public void removeAdErrorListener(com.google.ads.interactivemedia.v3.api.AdErrorEvent.AdErrorListener aderrorlistener)
	{
		h.b(aderrorlistener);
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field w h>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #325 <Method void com.google.ads.interactivemedia.v3.impl.w.b(com.google.ads.interactivemedia.v3.api.AdErrorEvent$AdErrorListener)>
	//    4    8:return          
	}

	public void removeAdEventListener(com.google.ads.interactivemedia.v3.api.AdEvent.AdEventListener adeventlistener)
	{
		g.remove(((Object) (adeventlistener)));
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field List g>
	//    2    4:aload_1         
	//    3    5:invokeinterface #329 <Method boolean List.remove(Object)>
	//    4   10:pop             
	//    5   11:return          
	}

	protected final ab a;
	protected final String b;
	protected al c;
	protected t d;
	protected u e;
	protected boolean f;
	private final List g = new ArrayList(1);
	private final w h = new w();
	private com.google.ads.interactivemedia.v3.impl.data.b i;
	private a j;
}
