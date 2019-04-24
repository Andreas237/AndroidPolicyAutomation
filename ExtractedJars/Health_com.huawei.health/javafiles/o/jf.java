// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import android.app.PendingIntent;
import android.content.*;
import android.net.ConnectivityManager;
import android.net.wifi.*;
import android.os.Bundle;
import android.os.SystemClock;
import android.telephony.*;
import android.telephony.cdma.CdmaCellLocation;
import android.telephony.gsm.GsmCellLocation;
import android.text.TextUtils;
import android.util.Log;
import com.amap.api.location.AMapLocation;
import com.amap.api.location.core.*;
import java.util.*;
import org.json.JSONObject;

// Referenced classes of package o:
//			jv, jy, ka, jr, 
//			ke, jt, kk, kb, 
//			jq, in, ju, jp, 
//			jx, js

public class jf
	implements jv
{
	class a
		implements jp.b
	{

		public void c(int i1)
		{
			a.c = i1;
		//    0    0:aload_0         
		//    1    1:getfield        #14  <Field jf a>
		//    2    4:iload_1         
		//    3    5:putfield        #23  <Field int o.jf.c>
		//    4    8:return          
		}

		final jf a;

		a()
		{
			a = jf.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #14  <Field jf a>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #17  <Method void Object()>
		//    5    9:return          
		}
	}

	class e extends BroadcastReceiver
	{

		public void onReceive(Context context, Intent intent)
		{
			if(intent == null)
		//*   0    0:aload_2         
		//*   1    1:ifnonnull       5
				return;
		//    2    4:return          
			intent = ((Intent) (intent.getAction()));
		//    3    5:aload_2         
		//    4    6:invokevirtual   #32  <Method String Intent.getAction()>
		//    5    9:astore_2        
			if(!((String) (intent)).equals("android.net.wifi.SCAN_RESULTS"))
				break MISSING_BLOCK_LABEL_89;
		//    6   10:aload_2         
		//    7   11:ldc1            #34  <String "android.net.wifi.SCAN_RESULTS">
		//    8   13:invokevirtual   #40  <Method boolean String.equals(Object)>
		//    9   16:ifeq            89
			context = ((Context) (o.jf.c(a)));
		//   10   19:aload_0         
		//   11   20:getfield        #13  <Field jf a>
		//   12   23:invokestatic    #44  <Method WifiManager o.jf.c(jf)>
		//   13   26:astore_1        
			if(context == null)
		//*  14   27:aload_1         
		//*  15   28:ifnonnull       32
				return;
		//   16   31:return          
			int i1;
			int j1;
			try
			{
				o.jf.d(a, o.jf.c(a).getScanResults());
		//   17   32:aload_0         
		//   18   33:getfield        #13  <Field jf a>
		//   19   36:aload_0         
		//   20   37:getfield        #13  <Field jf a>
		//   21   40:invokestatic    #44  <Method WifiManager o.jf.c(jf)>
		//   22   43:invokevirtual   #50  <Method List WifiManager.getScanResults()>
		//   23   46:invokestatic    #54  <Method List o.jf.d(jf, List)>
		//   24   49:pop             
				o.jf.c(a, ke.b());
		//   25   50:aload_0         
		//   26   51:getfield        #13  <Field jf a>
		//   27   54:invokestatic    #60  <Method long ke.b()>
		//   28   57:invokestatic    #63  <Method long o.jf.c(jf, long)>
		//   29   60:pop2            
				if(o.jf.d(a) == null)
		//*  30   61:aload_0         
		//*  31   62:getfield        #13  <Field jf a>
		//*  32   65:invokestatic    #66  <Method List o.jf.d(jf)>
		//*  33   68:ifnonnull       317
					o.jf.d(a, ((List) (new ArrayList())));
		//   34   71:aload_0         
		//   35   72:getfield        #13  <Field jf a>
		//   36   75:new             #68  <Class ArrayList>
		//   37   78:dup             
		//   38   79:invokespecial   #69  <Method void ArrayList()>
		//   39   82:invokestatic    #54  <Method List o.jf.d(jf, List)>
		//   40   85:pop             
			}
		//*  41   86:goto            317
		//*  42   89:aload_2         
		//*  43   90:ldc1            #71  <String "android.net.wifi.WIFI_STATE_CHANGED">
		//*  44   92:invokevirtual   #40  <Method boolean String.equals(Object)>
		//*  45   95:ifeq            201
		//*  46   98:aload_0         
		//*  47   99:getfield        #13  <Field jf a>
		//*  48  102:invokestatic    #44  <Method WifiManager o.jf.c(jf)>
		//*  49  105:astore_1        
		//*  50  106:aload_1         
		//*  51  107:ifnonnull       111
		//*  52  110:return          
		//*  53  111:iconst_4        
		//*  54  112:istore_3        
		//*  55  113:aload_0         
		//*  56  114:getfield        #13  <Field jf a>
		//*  57  117:invokestatic    #44  <Method WifiManager o.jf.c(jf)>
		//*  58  120:invokevirtual   #75  <Method int WifiManager.getWifiState()>
		//*  59  123:istore          4
		//*  60  125:iload           4
		//*  61  127:istore_3        
		//*  62  128:goto            132
		//*  63  131:astore_1        
		//*  64  132:iload_3         
		//*  65  133:tableswitch     0 4: default 168
		//		               0 181
		//		               1 171
		//		               2 324
		//		               3 324
		//		               4 191
		//*  66  168:goto            324
		//*  67  171:aload_0         
		//*  68  172:getfield        #13  <Field jf a>
		//*  69  175:invokestatic    #78  <Method void jf.g(jf)>
		//*  70  178:goto            324
		//*  71  181:aload_0         
		//*  72  182:getfield        #13  <Field jf a>
		//*  73  185:invokestatic    #78  <Method void jf.g(jf)>
		//*  74  188:goto            324
		//*  75  191:aload_0         
		//*  76  192:getfield        #13  <Field jf a>
		//*  77  195:invokestatic    #78  <Method void jf.g(jf)>
		//*  78  198:goto            324
		//*  79  201:aload_2         
		//*  80  202:ldc1            #80  <String "android.intent.action.SCREEN_ON">
		//*  81  204:invokevirtual   #40  <Method boolean String.equals(Object)>
		//*  82  207:ifeq            239
		//*  83  210:aload_0         
		//*  84  211:getfield        #13  <Field jf a>
		//*  85  214:invokestatic    #83  <Method void jf.i(jf)>
		//*  86  217:aload_0         
		//*  87  218:getfield        #13  <Field jf a>
		//*  88  221:invokestatic    #86  <Method void jf.h(jf)>
		//*  89  224:ldc2w           #87  <Long 10000L>
		//*  90  227:putstatic       #93  <Field long jq.i>
		//*  91  230:ldc2w           #94  <Long 30000L>
		//*  92  233:putstatic       #98  <Field long jq.f>
		//*  93  236:goto            317
		//*  94  239:aload_2         
		//*  95  240:ldc1            #100 <String "android.intent.action.SCREEN_OFF">
		//*  96  242:invokevirtual   #40  <Method boolean String.equals(Object)>
		//*  97  245:ifeq            274
		//*  98  248:aload_0         
		//*  99  249:getfield        #13  <Field jf a>
		//* 100  252:invokestatic    #104 <Method int jf.k(jf)>
		//* 101  255:iconst_5        
		//* 102  256:icmplt          317
		//* 103  259:ldc2w           #105 <Long 20000L>
		//* 104  262:putstatic       #93  <Field long jq.i>
		//* 105  265:ldc2w           #107 <Long 60000L>
		//* 106  268:putstatic       #98  <Field long jq.f>
		//* 107  271:goto            317
		//* 108  274:aload_2         
		//* 109  275:ldc1            #110 <String "android.intent.action.AIRPLANE_MODE">
		//* 110  277:invokevirtual   #40  <Method boolean String.equals(Object)>
		//* 111  280:ifeq            298
		//* 112  283:aload_0         
		//* 113  284:getfield        #13  <Field jf a>
		//* 114  287:aload_1         
		//* 115  288:invokestatic    #113 <Method boolean o.ke.a(Context)>
		//* 116  291:invokestatic    #116 <Method boolean o.jf.c(jf, boolean)>
		//* 117  294:pop             
		//* 118  295:goto            317
		//* 119  298:aload_2         
		//* 120  299:ldc1            #118 <String "android.net.conn.CONNECTIVITY_CHANGE">
		//* 121  301:invokevirtual   #40  <Method boolean String.equals(Object)>
		//* 122  304:ifeq            317
		//* 123  307:aload_0         
		//* 124  308:getfield        #13  <Field jf a>
		//* 125  311:iconst_1        
		//* 126  312:iconst_2        
		//* 127  313:invokevirtual   #121 <Method int jf.b(boolean, int)>
		//* 128  316:pop             
		//* 129  317:return          
			// Misplaced declaration of an exception variable
			catch(Context context)
		//* 130  318:astore_1        
			{
				((Throwable) (context)).printStackTrace();
		//  131  319:aload_1         
		//  132  320:invokevirtual   #124 <Method void Throwable.printStackTrace()>
				return;
		//  133  323:return          
			}
			break MISSING_BLOCK_LABEL_317;
			if(!((String) (intent)).equals("android.net.wifi.WIFI_STATE_CHANGED")) goto _L2; else goto _L1
_L1:
			context = ((Context) (o.jf.c(a)));
			if(context == null)
				return;
			i1 = 4;
			j1 = o.jf.c(a).getWifiState();
			i1 = j1;
			break MISSING_BLOCK_LABEL_132;
			context;
			i1;
			JVM INSTR tableswitch 0 4: default 168
		//		               0 181
		//		               1 171
		//		               2 324
		//		               3 324
		//		               4 191;
			   goto _L3 _L4 _L5 _L3 _L3 _L6
_L3:
			break MISSING_BLOCK_LABEL_324;
_L5:
			jf.g(a);
			break MISSING_BLOCK_LABEL_324;
_L4:
			jf.g(a);
			break MISSING_BLOCK_LABEL_324;
_L6:
			jf.g(a);
			break MISSING_BLOCK_LABEL_324;
_L2:
			if(((String) (intent)).equals("android.intent.action.SCREEN_ON"))
			{
				jf.i(a);
				jf.h(a);
				jq.i = 10000L;
				jq.f = 30000L;
				break MISSING_BLOCK_LABEL_317;
			}
			if(((String) (intent)).equals("android.intent.action.SCREEN_OFF"))
			{
				if(jf.k(a) >= 5)
				{
					jq.i = 20000L;
					jq.f = 60000L;
				}
				break MISSING_BLOCK_LABEL_317;
			}
			if(((String) (intent)).equals("android.intent.action.AIRPLANE_MODE"))
			{
				o.jf.c(a, o.ke.a(context));
				break MISSING_BLOCK_LABEL_317;
			}
			if(((String) (intent)).equals("android.net.conn.CONNECTIVITY_CHANGE"))
				a.b(true, 2);
			return;
		//  134  324:return          
		}

		final jf a;

		private e()
		{
			a = jf.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #13  <Field jf a>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #16  <Method void BroadcastReceiver()>
		//    5    9:return          
		}

	}


	public jf()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #81  <Method void Object()>
		g = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #83  <Field Context g>
		f = 9;
	//    5    9:aload_0         
	//    6   10:bipush          9
	//    7   12:putfield        #85  <Field int f>
		n = null;
	//    8   15:aload_0         
	//    9   16:aconst_null     
	//   10   17:putfield        #87  <Field ConnectivityManager n>
		o = null;
	//   11   20:aload_0         
	//   12   21:aconst_null     
	//   13   22:putfield        #89  <Field WifiManager o>
		m = null;
	//   14   25:aload_0         
	//   15   26:aconst_null     
	//   16   27:putfield        #91  <Field TelephonyManager m>
		p = ((List) (new ArrayList()));
	//   17   30:aload_0         
	//   18   31:new             #93  <Class ArrayList>
	//   19   34:dup             
	//   20   35:invokespecial   #94  <Method void ArrayList()>
	//   21   38:putfield        #96  <Field List p>
		l = ((List) (new ArrayList()));
	//   22   41:aload_0         
	//   23   42:new             #93  <Class ArrayList>
	//   24   45:dup             
	//   25   46:invokespecial   #94  <Method void ArrayList()>
	//   26   49:putfield        #98  <Field List l>
		q = ((Map) (new HashMap()));
	//   27   52:aload_0         
	//   28   53:new             #100 <Class HashMap>
	//   29   56:dup             
	//   30   57:invokespecial   #101 <Method void HashMap()>
	//   31   60:putfield        #103 <Field Map q>
		u = ((Map) (new HashMap()));
	//   32   63:aload_0         
	//   33   64:new             #100 <Class HashMap>
	//   34   67:dup             
	//   35   68:invokespecial   #101 <Method void HashMap()>
	//   36   71:putfield        #105 <Field Map u>
		t = null;
	//   37   74:aload_0         
	//   38   75:aconst_null     
	//   39   76:putfield        #107 <Field PhoneStateListener t>
		r = -113;
	//   40   79:aload_0         
	//   41   80:bipush          -113
	//   42   82:putfield        #109 <Field int r>
		s = new e();
	//   43   85:aload_0         
	//   44   86:new             #15  <Class jf$e>
	//   45   89:dup             
	//   46   90:aload_0         
	//   47   91:aconst_null     
	//   48   92:invokespecial   #112 <Method void jf$e(jf, jf$3)>
	//   49   95:putfield        #114 <Field jf$e s>
		w = null;
	//   50   98:aload_0         
	//   51   99:aconst_null     
	//   52  100:putfield        #116 <Field WifiInfo w>
		y = null;
	//   53  103:aload_0         
	//   54  104:aconst_null     
	//   55  105:putfield        #118 <Field JSONObject y>
		v = null;
	//   56  108:aload_0         
	//   57  109:aconst_null     
	//   58  110:putfield        #120 <Field jt v>
		x = 0L;
	//   59  113:aload_0         
	//   60  114:lconst_0        
	//   61  115:putfield        #122 <Field long x>
		z = false;
	//   62  118:aload_0         
	//   63  119:iconst_0        
	//   64  120:putfield        #124 <Field boolean z>
		D = 0L;
	//   65  123:aload_0         
	//   66  124:lconst_0        
	//   67  125:putfield        #126 <Field long D>
		j = 0L;
	//   68  128:aload_0         
	//   69  129:lconst_0        
	//   70  130:putfield        #128 <Field long j>
		C = 0L;
	//   71  133:aload_0         
	//   72  134:lconst_0        
	//   73  135:putfield        #130 <Field long C>
		A = jy.b();
	//   74  138:aload_0         
	//   75  139:invokestatic    #135 <Method jy jy.b()>
	//   76  142:putfield        #137 <Field jy A>
		B = 0;
	//   77  145:aload_0         
	//   78  146:iconst_0        
	//   79  147:putfield        #139 <Field int B>
		H = "00:00:00:00:00:00";
	//   80  150:aload_0         
	//   81  151:ldc1            #141 <String "00:00:00:00:00:00">
	//   82  153:putfield        #143 <Field String H>
		I = null;
	//   83  156:aload_0         
	//   84  157:aconst_null     
	//   85  158:putfield        #145 <Field kk I>
		F = new StringBuilder();
	//   86  161:aload_0         
	//   87  162:new             #147 <Class StringBuilder>
	//   88  165:dup             
	//   89  166:invokespecial   #148 <Method void StringBuilder()>
	//   90  169:putfield        #150 <Field StringBuilder F>
		E = 0L;
	//   91  172:aload_0         
	//   92  173:lconst_0        
	//   93  174:putfield        #152 <Field long E>
		c = -1;
	//   94  177:aload_0         
	//   95  178:iconst_m1       
	//   96  179:putfield        #154 <Field int c>
		d = false;
	//   97  182:aload_0         
	//   98  183:iconst_0        
	//   99  184:putfield        #156 <Field boolean d>
		G = null;
	//  100  187:aload_0         
	//  101  188:aconst_null     
	//  102  189:putfield        #158 <Field js G>
		b = new a();
	//  103  192:aload_0         
	//  104  193:new             #12  <Class jf$a>
	//  105  196:dup             
	//  106  197:aload_0         
	//  107  198:invokespecial   #161 <Method void jf$a(jf)>
	//  108  201:putfield        #163 <Field jf$a b>
		N = null;
	//  109  204:aload_0         
	//  110  205:aconst_null     
	//  111  206:putfield        #165 <Field CellLocation N>
		J = false;
	//  112  209:aload_0         
	//  113  210:iconst_0        
	//  114  211:putfield        #167 <Field boolean J>
		k = 0;
	//  115  214:aload_0         
	//  116  215:iconst_0        
	//  117  216:putfield        #169 <Field int k>
	//  118  219:return          
	}

	private CellLocation D()
	{
		CellLocation celllocation;
		if(m == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #91  <Field TelephonyManager m>
	//*   2    4:ifnonnull       9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		celllocation = null;
	//    5    9:aconst_null     
	//    6   10:astore_1        
		CellLocation celllocation1 = m.getCellLocation();
	//    7   11:aload_0         
	//    8   12:getfield        #91  <Field TelephonyManager m>
	//    9   15:invokevirtual   #180 <Method CellLocation TelephonyManager.getCellLocation()>
	//   10   18:astore_2        
		celllocation = celllocation1;
	//   11   19:aload_2         
	//   12   20:astore_1        
		break MISSING_BLOCK_LABEL_25;
	//   13   21:goto            25
		Object obj;
		obj;
	//   14   24:astore_2        
		if(b(celllocation))
	//*  15   25:aload_0         
	//*  16   26:aload_1         
	//*  17   27:invokespecial   #183 <Method boolean b(CellLocation)>
	//*  18   30:ifeq            35
			return celllocation;
	//   19   33:aload_1         
	//   20   34:areturn         
		obj = ((Object) (d((List)ka.e(((Object) (m)), "getAllCellInfo", new Object[0]))));
	//   21   35:aload_0         
	//   22   36:aload_0         
	//   23   37:getfield        #91  <Field TelephonyManager m>
	//   24   40:ldc1            #185 <String "getAllCellInfo">
	//   25   42:iconst_0        
	//   26   43:anewarray       Object[]
	//   27   46:invokestatic    #190 <Method Object ka.e(Object, String, Object[])>
	//   28   49:checkcast       #192 <Class List>
	//   29   52:invokespecial   #195 <Method CellLocation d(List)>
	//   30   55:astore_2        
		celllocation = ((CellLocation) (obj));
	//   31   56:aload_2         
	//   32   57:astore_1        
		break MISSING_BLOCK_LABEL_66;
	//   33   58:goto            66
		obj;
	//   34   61:astore_2        
		break MISSING_BLOCK_LABEL_66;
	//   35   62:goto            66
		obj;
	//   36   65:astore_2        
		if(b(celllocation))
	//*  37   66:aload_0         
	//*  38   67:aload_1         
	//*  39   68:invokespecial   #183 <Method boolean b(CellLocation)>
	//*  40   71:ifeq            76
			return celllocation;
	//   41   74:aload_1         
	//   42   75:areturn         
		else
			return celllocation;
	//   43   76:aload_1         
	//   44   77:areturn         
	}

	static long a(jf jf1, long l1)
	{
		jf1.j = l1;
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:putfield        #128 <Field long j>
		return l1;
	//    3    5:lload_1         
	//    4    6:lreturn         
	}

	static CellLocation a(jf jf1, CellLocation celllocation)
	{
		jf1.N = celllocation;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #165 <Field CellLocation N>
		return celllocation;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

	private String a(int i1, int j1, int k1)
		throws Exception
	{
		JSONObject jsonobject = new JSONObject();
	//    0    0:new             #200 <Class JSONObject>
	//    1    3:dup             
	//    2    4:invokespecial   #201 <Method void JSONObject()>
	//    3    7:astore          4
		jsonobject.put("e", i1);
	//    4    9:aload           4
	//    5   11:ldc1            #202 <String "e">
	//    6   13:iload_1         
	//    7   14:invokevirtual   #206 <Method JSONObject JSONObject.put(String, int)>
	//    8   17:pop             
		jsonobject.put("d", j1);
	//    9   18:aload           4
	//   10   20:ldc1            #207 <String "d">
	//   11   22:iload_2         
	//   12   23:invokevirtual   #206 <Method JSONObject JSONObject.put(String, int)>
	//   13   26:pop             
		jsonobject.put("u", k1);
	//   14   27:aload           4
	//   15   29:ldc1            #208 <String "u">
	//   16   31:iload_3         
	//   17   32:invokevirtual   #206 <Method JSONObject JSONObject.put(String, int)>
	//   18   35:pop             
		return jsonobject.toString();
	//   19   36:aload           4
	//   20   38:invokevirtual   #212 <Method String JSONObject.toString()>
	//   21   41:areturn         
	}

	private void a(int i1)
	{
		if(i1 == -113)
	//*   0    0:iload_1         
	//*   1    1:bipush          -113
	//*   2    3:icmpne          13
		{
			r = -113;
	//    3    6:aload_0         
	//    4    7:bipush          -113
	//    5    9:putfield        #109 <Field int r>
			return;
	//    6   12:return          
		}
		r = i1;
	//    7   13:aload_0         
	//    8   14:iload_1         
	//    9   15:putfield        #109 <Field int r>
		switch(f)
	//*  10   18:aload_0         
	//*  11   19:getfield        #85  <Field int f>
		{
	//*  12   22:lookupswitch    2: default 48
	//	               1: 49
	//	               2: 49
		default:
			return;
	//   13   48:return          

		case 1: // '\001'
		case 2: // '\002'
			break;
		}
		if(p.size() > 0)
	//*  14   49:aload_0         
	//*  15   50:getfield        #96  <Field List p>
	//*  16   53:invokeinterface #218 <Method int List.size()>
	//*  17   58:ifle            81
			((jr)p.get(0)).g = r;
	//   18   61:aload_0         
	//   19   62:getfield        #96  <Field List p>
	//   20   65:iconst_0        
	//   21   66:invokeinterface #222 <Method Object List.get(int)>
	//   22   71:checkcast       #224 <Class jr>
	//   23   74:aload_0         
	//   24   75:getfield        #109 <Field int r>
	//   25   78:putfield        #226 <Field int jr.g>
	//   26   81:return          
	}

	private void a(CellLocation celllocation)
	{
		CellLocation celllocation2 = null;
	//    0    0:aconst_null     
	//    1    1:astore_3        
		CellLocation celllocation1 = celllocation2;
	//    2    2:aload_3         
	//    3    3:astore_2        
		if(!z)
	//*   4    4:aload_0         
	//*   5    5:getfield        #124 <Field boolean z>
	//*   6    8:ifne            34
		{
			celllocation1 = celllocation2;
	//    7   11:aload_3         
	//    8   12:astore_2        
			if(m != null)
	//*   9   13:aload_0         
	//*  10   14:getfield        #91  <Field TelephonyManager m>
	//*  11   17:ifnull          34
			{
				celllocation1 = celllocation2;
	//   12   20:aload_3         
	//   13   21:astore_2        
				if(m != null)
	//*  14   22:aload_0         
	//*  15   23:getfield        #91  <Field TelephonyManager m>
	//*  16   26:ifnull          34
					celllocation1 = D();
	//   17   29:aload_0         
	//   18   30:invokespecial   #229 <Method CellLocation D()>
	//   19   33:astore_2        
			}
		}
		celllocation2 = celllocation1;
	//   20   34:aload_2         
	//   21   35:astore_3        
		if(celllocation1 == null)
	//*  22   36:aload_2         
	//*  23   37:ifnonnull       42
			celllocation2 = celllocation;
	//   24   40:aload_1         
	//   25   41:astore_3        
		if(celllocation2 == null)
	//*  26   42:aload_3         
	//*  27   43:ifnonnull       47
			return;
	//   28   46:return          
		switch(ke.b(celllocation2, g))
	//*  29   47:aload_3         
	//*  30   48:aload_0         
	//*  31   49:getfield        #83  <Field Context g>
	//*  32   52:invokestatic    #234 <Method int ke.b(CellLocation, Context)>
		{
	//*  33   55:lookupswitch    2: default 80
	//	               1: 81
	//	               2: 94
		default:
			return;
	//   34   80:return          

		case 1: // '\001'
			if(m != null)
	//*  35   81:aload_0         
	//*  36   82:getfield        #91  <Field TelephonyManager m>
	//*  37   85:ifnull          99
			{
				e(celllocation2);
	//   38   88:aload_0         
	//   39   89:aload_3         
	//   40   90:invokespecial   #236 <Method void e(CellLocation)>
				return;
	//   41   93:return          
			}
			break;

		case 2: // '\002'
			d(celllocation2);
	//   42   94:aload_0         
	//   43   95:aload_3         
	//   44   96:invokespecial   #238 <Method void d(CellLocation)>
			break;
		}
	//   45   99:return          
	}

	private boolean a(long l1)
	{
		boolean flag = false;
	//    0    0:iconst_0        
	//    1    1:istore          5
		long l2 = ke.e();
	//    2    3:invokestatic    #242 <Method long ke.e()>
	//    3    6:lstore_3        
		if(l2 - l1 < 300L)
	//*   4    7:lload_3         
	//*   5    8:lload_1         
	//*   6    9:lsub            
	//*   7   10:ldc2w           #243 <Long 300L>
	//*   8   13:lcmp            
	//*   9   14:ifge            49
		{
			l1 = 0L;
	//   10   17:lconst_0        
	//   11   18:lstore_1        
			if(v != null)
	//*  12   19:aload_0         
	//*  13   20:getfield        #120 <Field jt v>
	//*  14   23:ifnull          36
				l1 = l2 - v.k();
	//   15   26:lload_3         
	//   16   27:aload_0         
	//   17   28:getfield        #120 <Field jt v>
	//   18   31:invokevirtual   #248 <Method long jt.k()>
	//   19   34:lsub            
	//   20   35:lstore_1        
			if(l1 > 10000L)
	//*  21   36:lload_1         
	//*  22   37:ldc2w           #249 <Long 10000L>
	//*  23   40:lcmp            
	//*  24   41:ifle            46
				return false;
	//   25   44:iconst_0        
	//   26   45:ireturn         
			flag = true;
	//   27   46:iconst_1        
	//   28   47:istore          5
		}
		return flag;
	//   29   49:iload           5
	//   30   51:ireturn         
	}

	static boolean a(jf jf1)
	{
		return jf1.q();
	//    0    0:aload_0         
	//    1    1:invokespecial   #254 <Method boolean q()>
	//    2    4:ireturn         
	}

	static List b(jf jf1)
	{
		return jf1.p;
	//    0    0:aload_0         
	//    1    1:getfield        #96  <Field List p>
	//    2    4:areturn         
	}

	private void b(List list)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(list == null)
			break MISSING_BLOCK_LABEL_16;
	//    2    2:aload_1         
	//    3    3:ifnull          16
		if(list.size() >= 1)
			break MISSING_BLOCK_LABEL_19;
	//    4    6:aload_1         
	//    5    7:invokeinterface #218 <Method int List.size()>
	//    6   12:iconst_1        
	//    7   13:icmpge          19
		this;
	//    8   16:aload_0         
		JVM INSTR monitorexit ;
	//    9   17:monitorexit     
		return;
	//   10   18:return          
		HashMap hashmap = new HashMap();
	//   11   19:new             #100 <Class HashMap>
	//   12   22:dup             
	//   13   23:invokespecial   #101 <Method void HashMap()>
	//   14   26:astore_3        
		int i1 = 0;
	//   15   27:iconst_0        
	//   16   28:istore_2        
_L2:
		Object obj;
		if(i1 >= list.size())
			break MISSING_BLOCK_LABEL_138;
	//   17   29:iload_2         
	//   18   30:aload_1         
	//   19   31:invokeinterface #218 <Method int List.size()>
	//   20   36:icmpge          138
		obj = ((Object) ((ScanResult)list.get(i1)));
	//   21   39:aload_1         
	//   22   40:iload_2         
	//   23   41:invokeinterface #222 <Method Object List.get(int)>
	//   24   46:checkcast       #258 <Class ScanResult>
	//   25   49:astore          4
		if(list.size() > 20 && !b(((ScanResult) (obj)).level))
	//*  26   51:aload_1         
	//*  27   52:invokeinterface #218 <Method int List.size()>
	//*  28   57:bipush          20
	//*  29   59:icmple          77
	//*  30   62:aload_0         
	//*  31   63:aload           4
	//*  32   65:getfield        #261 <Field int ScanResult.level>
	//*  33   68:invokespecial   #264 <Method boolean b(int)>
	//*  34   71:ifne            77
			break MISSING_BLOCK_LABEL_237;
	//   35   74:goto            237
		if(((ScanResult) (obj)).SSID != null)
	//*  36   77:aload           4
	//*  37   79:getfield        #267 <Field String ScanResult.SSID>
	//*  38   82:ifnull          107
		{
			obj.SSID = ((ScanResult) (obj)).SSID.replace("*", ".");
	//   39   85:aload           4
	//   40   87:aload           4
	//   41   89:getfield        #267 <Field String ScanResult.SSID>
	//   42   92:ldc2            #269 <String "*">
	//   43   95:ldc2            #271 <String ".">
	//   44   98:invokevirtual   #277 <Method String String.replace(CharSequence, CharSequence)>
	//   45  101:putfield        #267 <Field String ScanResult.SSID>
			break MISSING_BLOCK_LABEL_115;
	//   46  104:goto            115
		}
		obj.SSID = "null";
	//   47  107:aload           4
	//   48  109:ldc2            #279 <String "null">
	//   49  112:putfield        #267 <Field String ScanResult.SSID>
		hashmap.put(((Object) (Integer.valueOf(((ScanResult) (obj)).level * 30 + i1))), obj);
	//   50  115:aload_3         
	//   51  116:aload           4
	//   52  118:getfield        #261 <Field int ScanResult.level>
	//   53  121:bipush          30
	//   54  123:imul            
	//   55  124:iload_2         
	//   56  125:iadd            
	//   57  126:invokestatic    #285 <Method Integer Integer.valueOf(int)>
	//   58  129:aload           4
	//   59  131:invokevirtual   #288 <Method Object HashMap.put(Object, Object)>
	//   60  134:pop             
		break MISSING_BLOCK_LABEL_237;
	//   61  135:goto            237
		obj = ((Object) (new TreeMap(Collections.reverseOrder())));
	//   62  138:new             #290 <Class TreeMap>
	//   63  141:dup             
	//   64  142:invokestatic    #296 <Method java.util.Comparator Collections.reverseOrder()>
	//   65  145:invokespecial   #299 <Method void TreeMap(java.util.Comparator)>
	//   66  148:astore          4
		((TreeMap) (obj)).putAll(((Map) (hashmap)));
	//   67  150:aload           4
	//   68  152:aload_3         
	//   69  153:invokevirtual   #303 <Method void TreeMap.putAll(Map)>
		list.clear();
	//   70  156:aload_1         
	//   71  157:invokeinterface #306 <Method void List.clear()>
		Iterator iterator = ((TreeMap) (obj)).entrySet().iterator();
	//   72  162:aload           4
	//   73  164:invokevirtual   #310 <Method Set TreeMap.entrySet()>
	//   74  167:invokeinterface #316 <Method Iterator Set.iterator()>
	//   75  172:astore          5
		do
		{
			if(!iterator.hasNext())
				break;
	//   76  174:aload           5
	//   77  176:invokeinterface #321 <Method boolean Iterator.hasNext()>
	//   78  181:ifeq            220
			list.add(((java.util.Map.Entry)iterator.next()).getValue());
	//   79  184:aload_1         
	//   80  185:aload           5
	//   81  187:invokeinterface #325 <Method Object Iterator.next()>
	//   82  192:checkcast       #327 <Class java.util.Map$Entry>
	//   83  195:invokeinterface #330 <Method Object java.util.Map$Entry.getValue()>
	//   84  200:invokeinterface #334 <Method boolean List.add(Object)>
	//   85  205:pop             
		} while(list.size() <= 29);
	//   86  206:aload_1         
	//   87  207:invokeinterface #218 <Method int List.size()>
	//   88  212:bipush          29
	//   89  214:icmple          244
	//*  90  217:goto            220
		hashmap.clear();
	//   91  220:aload_3         
	//   92  221:invokevirtual   #335 <Method void HashMap.clear()>
		((TreeMap) (obj)).clear();
	//   93  224:aload           4
	//   94  226:invokevirtual   #336 <Method void TreeMap.clear()>
		this;
	//   95  229:aload_0         
		JVM INSTR monitorexit ;
	//   96  230:monitorexit     
		return;
	//   97  231:return          
		list;
	//   98  232:astore_1        
	//*  99  233:aload_0         
		throw list;
	//  100  234:monitorexit     
	//  101  235:aload_1         
	//  102  236:athrow          
		i1++;
	//  103  237:iload_2         
	//  104  238:iconst_1        
	//  105  239:iadd            
	//  106  240:istore_2        
		if(true) goto _L2; else goto _L1
	//  107  241:goto            29
_L1:
	//* 108  244:goto            174
	}

	static void b(jf jf1, int i1)
	{
		jf1.a(i1);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #341 <Method void a(int)>
	//    3    5:return          
	}

	private boolean b(int i1)
	{
		try
		{
			i1 = WifiManager.calculateSignalLevel(i1, 20);
	//    0    0:iload_1         
	//    1    1:bipush          20
	//    2    3:invokestatic    #349 <Method int WifiManager.calculateSignalLevel(int, int)>
	//    3    6:istore_1        
		}
	//*   4    7:goto            18
		catch(ArithmeticException arithmeticexception)
	//*   5   10:astore_2        
		{
			i1 = 20;
	//    6   11:bipush          20
	//    7   13:istore_1        
			o.ke.c(((Throwable) (arithmeticexception)));
	//    8   14:aload_2         
	//    9   15:invokestatic    #352 <Method void o.ke.c(Throwable)>
		}
		return i1 >= 1;
	//   10   18:iload_1         
	//   11   19:iconst_1        
	//   12   20:icmplt          25
	//   13   23:iconst_1        
	//   14   24:ireturn         
	//   15   25:iconst_0        
	//   16   26:ireturn         
	}

	private boolean b(WifiInfo wifiinfo)
	{
		boolean flag = true;
	//    0    0:iconst_1        
	//    1    1:istore_2        
		if(wifiinfo == null || wifiinfo.getBSSID() == null)
	//*   2    2:aload_1         
	//*   3    3:ifnull          13
	//*   4    6:aload_1         
	//*   5    7:invokevirtual   #358 <Method String WifiInfo.getBSSID()>
	//*   6   10:ifnonnull       15
			return false;
	//    7   13:iconst_0        
	//    8   14:ireturn         
		if(wifiinfo.getSSID() == null)
	//*   9   15:aload_1         
	//*  10   16:invokevirtual   #361 <Method String WifiInfo.getSSID()>
	//*  11   19:ifnonnull       24
			return false;
	//   12   22:iconst_0        
	//   13   23:ireturn         
		if(wifiinfo.getBSSID().equals("00:00:00:00:00:00"))
	//*  14   24:aload_1         
	//*  15   25:invokevirtual   #358 <Method String WifiInfo.getBSSID()>
	//*  16   28:ldc1            #141 <String "00:00:00:00:00:00">
	//*  17   30:invokevirtual   #364 <Method boolean String.equals(Object)>
	//*  18   33:ifeq            38
			return false;
	//   19   36:iconst_0        
	//   20   37:ireturn         
		if(TextUtils.isEmpty(((CharSequence) (wifiinfo.getSSID()))))
	//*  21   38:aload_1         
	//*  22   39:invokevirtual   #361 <Method String WifiInfo.getSSID()>
	//*  23   42:invokestatic    #370 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  24   45:ifeq            50
			flag = false;
	//   25   48:iconst_0        
	//   26   49:istore_2        
		return flag;
	//   27   50:iload_2         
	//   28   51:ireturn         
	}

	private boolean b(CellLocation celllocation)
	{
		boolean flag;
		if(celllocation == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return false;
	//    2    4:iconst_0        
	//    3    5:ireturn         
		flag = true;
	//    4    6:iconst_1        
	//    5    7:istore_3        
		ke.b(celllocation, g);
	//    6    8:aload_1         
	//    7    9:aload_0         
	//    8   10:getfield        #83  <Field Context g>
	//    9   13:invokestatic    #234 <Method int ke.b(CellLocation, Context)>
		JVM INSTR lookupswitch 2: default 44
	//	               1: 46
	//	               2: 125;
	//   10   16:lookupswitch    2: default 44
	//	               1: 46
	//	               2: 125
		   goto _L1 _L2 _L3
_L1:
		return true;
	//   11   44:iconst_1        
	//   12   45:ireturn         
_L2:
		celllocation = ((CellLocation) ((GsmCellLocation)celllocation));
	//   13   46:aload_1         
	//   14   47:checkcast       #372 <Class GsmCellLocation>
	//   15   50:astore_1        
		if(((GsmCellLocation) (celllocation)).getLac() == -1)
	//*  16   51:aload_1         
	//*  17   52:invokevirtual   #375 <Method int GsmCellLocation.getLac()>
	//*  18   55:iconst_m1       
	//*  19   56:icmpne          61
			return false;
	//   20   59:iconst_0        
	//   21   60:ireturn         
		if(((GsmCellLocation) (celllocation)).getLac() == 0)
	//*  22   61:aload_1         
	//*  23   62:invokevirtual   #375 <Method int GsmCellLocation.getLac()>
	//*  24   65:ifne            70
			return false;
	//   25   68:iconst_0        
	//   26   69:ireturn         
		if(((GsmCellLocation) (celllocation)).getLac() > 65535)
	//*  27   70:aload_1         
	//*  28   71:invokevirtual   #375 <Method int GsmCellLocation.getLac()>
	//*  29   74:ldc2            #376 <Int 65535>
	//*  30   77:icmple          82
			return false;
	//   31   80:iconst_0        
	//   32   81:ireturn         
		if(((GsmCellLocation) (celllocation)).getCid() == -1)
	//*  33   82:aload_1         
	//*  34   83:invokevirtual   #379 <Method int GsmCellLocation.getCid()>
	//*  35   86:iconst_m1       
	//*  36   87:icmpne          92
			return false;
	//   37   90:iconst_0        
	//   38   91:ireturn         
		if(((GsmCellLocation) (celllocation)).getCid() == 0)
	//*  39   92:aload_1         
	//*  40   93:invokevirtual   #379 <Method int GsmCellLocation.getCid()>
	//*  41   96:ifne            101
			return false;
	//   42   99:iconst_0        
	//   43  100:ireturn         
		if(((GsmCellLocation) (celllocation)).getCid() == 65535)
	//*  44  101:aload_1         
	//*  45  102:invokevirtual   #379 <Method int GsmCellLocation.getCid()>
	//*  46  105:ldc2            #376 <Int 65535>
	//*  47  108:icmpne          113
			return false;
	//   48  111:iconst_0        
	//   49  112:ireturn         
		if(((GsmCellLocation) (celllocation)).getCid() >= 0xfffffff)
	//*  50  113:aload_1         
	//*  51  114:invokevirtual   #379 <Method int GsmCellLocation.getCid()>
	//*  52  117:ldc2            #380 <Int 0xfffffff>
	//*  53  120:icmplt          184
			return false;
	//   54  123:iconst_0        
	//   55  124:ireturn         
		break; /* Loop/switch isn't completed */
_L3:
		if(o.ka.a(((Object) (celllocation)), "getSystemId", new Object[0]) <= 0)
	//*  56  125:aload_1         
	//*  57  126:ldc2            #382 <String "getSystemId">
	//*  58  129:iconst_0        
	//*  59  130:anewarray       Object[]
	//*  60  133:invokestatic    #385 <Method int o.ka.a(Object, String, Object[])>
	//*  61  136:ifgt            144
		{
			flag = false;
	//   62  139:iconst_0        
	//   63  140:istore_3        
			break MISSING_BLOCK_LABEL_181;
	//   64  141:goto            181
		}
		if(o.ka.a(((Object) (celllocation)), "getNetworkId", new Object[0]) < 0)
	//*  65  144:aload_1         
	//*  66  145:ldc2            #387 <String "getNetworkId">
	//*  67  148:iconst_0        
	//*  68  149:anewarray       Object[]
	//*  69  152:invokestatic    #385 <Method int o.ka.a(Object, String, Object[])>
	//*  70  155:ifge            163
		{
			flag = false;
	//   71  158:iconst_0        
	//   72  159:istore_3        
			break MISSING_BLOCK_LABEL_181;
	//   73  160:goto            181
		}
		int i1 = o.ka.a(((Object) (celllocation)), "getBaseStationId", new Object[0]);
	//   74  163:aload_1         
	//   75  164:ldc2            #389 <String "getBaseStationId">
	//   76  167:iconst_0        
	//   77  168:anewarray       Object[]
	//   78  171:invokestatic    #385 <Method int o.ka.a(Object, String, Object[])>
	//   79  174:istore_2        
		if(i1 < 0)
	//*  80  175:iload_2         
	//*  81  176:ifge            181
			flag = false;
	//   82  179:iconst_0        
	//   83  180:istore_3        
		return flag;
	//   84  181:iload_3         
	//   85  182:ireturn         
		celllocation;
	//   86  183:astore_1        
		return true;
	//   87  184:iconst_1        
	//   88  185:ireturn         
	}

	static int c(jf jf1, int i1)
	{
		jf1.r = i1;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #109 <Field int r>
		return i1;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

	static long c(jf jf1, long l1)
	{
		jf1.C = l1;
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:putfield        #130 <Field long C>
		return l1;
	//    3    5:lload_1         
	//    4    6:lreturn         
	}

	static WifiManager c(jf jf1)
	{
		return jf1.o;
	//    0    0:aload_0         
	//    1    1:getfield        #89  <Field WifiManager o>
	//    2    4:areturn         
	}

	private jr c(CellLocation celllocation)
	{
		celllocation = ((CellLocation) ((GsmCellLocation)celllocation));
	//    0    0:aload_1         
	//    1    1:checkcast       #372 <Class GsmCellLocation>
	//    2    4:astore_1        
		jr jr1 = new jr();
	//    3    5:new             #224 <Class jr>
	//    4    8:dup             
	//    5    9:invokespecial   #393 <Method void jr()>
	//    6   12:astore_2        
		String as[] = o.ke.a(m);
	//    7   13:aload_0         
	//    8   14:getfield        #91  <Field TelephonyManager m>
	//    9   17:invokestatic    #396 <Method String[] o.ke.a(TelephonyManager)>
	//   10   20:astore_3        
		jr1.d = as[0];
	//   11   21:aload_2         
	//   12   22:aload_3         
	//   13   23:iconst_0        
	//   14   24:aaload          
	//   15   25:putfield        #398 <Field String o.jr.d>
		jr1.e = as[1];
	//   16   28:aload_2         
	//   17   29:aload_3         
	//   18   30:iconst_1        
	//   19   31:aaload          
	//   20   32:putfield        #400 <Field String jr.e>
		jr1.c = ((GsmCellLocation) (celllocation)).getLac();
	//   21   35:aload_2         
	//   22   36:aload_1         
	//   23   37:invokevirtual   #375 <Method int GsmCellLocation.getLac()>
	//   24   40:putfield        #401 <Field int o.jr.c>
		jr1.a = ((GsmCellLocation) (celllocation)).getCid();
	//   25   43:aload_2         
	//   26   44:aload_1         
	//   27   45:invokevirtual   #379 <Method int GsmCellLocation.getCid()>
	//   28   48:putfield        #403 <Field int o.jr.a>
		jr1.g = r;
	//   29   51:aload_2         
	//   30   52:aload_0         
	//   31   53:getfield        #109 <Field int r>
	//   32   56:putfield        #226 <Field int jr.g>
		return jr1;
	//   33   59:aload_2         
	//   34   60:areturn         
	}

	private void c(int i1)
	{
		long l1;
		long l2;
		l1 = ke.b();
	//    0    0:invokestatic    #407 <Method long ke.b()>
	//    1    3:lstore_3        
		l2 = E;
	//    2    4:aload_0         
	//    3    5:getfield        #152 <Field long E>
	//    4    8:lstore          5
		if(l1 - l2 < 45000L)
	//*   5   10:lload_3         
	//*   6   11:lload           5
	//*   7   13:lsub            
	//*   8   14:ldc2w           #408 <Long 45000L>
	//*   9   17:lcmp            
	//*  10   18:ifge            22
			return;
	//   11   21:return          
		boolean flag = b();
	//   12   22:aload_0         
	//   13   23:invokevirtual   #411 <Method boolean b()>
	//   14   26:istore          7
		if(!flag)
	//*  15   28:iload           7
	//*  16   30:ifne            34
			return;
	//   17   33:return          
		int j1;
		if(!b())
			break MISSING_BLOCK_LABEL_56;
	//   18   34:aload_0         
	//   19   35:invokevirtual   #411 <Method boolean b()>
	//   20   38:ifeq            56
		j1 = I.g();
	//   21   41:aload_0         
	//   22   42:getfield        #145 <Field kk I>
	//   23   45:invokevirtual   #415 <Method int kk.g()>
	//   24   48:istore_2        
		if(j1 < 20)
	//*  25   49:iload_2         
	//*  26   50:bipush          20
	//*  27   52:icmpge          56
			return;
	//   28   55:return          
		try
		{
			y();
	//   29   56:aload_0         
	//   30   57:invokespecial   #417 <Method void y()>
			if(a == null)
	//*  31   60:aload_0         
	//*  32   61:getfield        #419 <Field TimerTask a>
	//*  33   64:ifnonnull       80
				a = ((TimerTask) (new TimerTask(i1) {

					public void run()
					{
						try
						{
							if(jf.f(c))
					//*   0    0:aload_0         
					//*   1    1:getfield        #16  <Field jf c>
					//*   2    4:invokestatic    #29  <Method boolean jf.f(jf)>
					//*   3    7:ifeq            41
							{
								jf.e(c, b);
					//    4   10:aload_0         
					//    5   11:getfield        #16  <Field jf c>
					//    6   14:aload_0         
					//    7   15:getfield        #18  <Field int b>
					//    8   18:invokestatic    #32  <Method void jf.e(jf, int)>
								if(!c.b())
					//*   9   21:aload_0         
					//*  10   22:getfield        #16  <Field jf c>
					//*  11   25:invokevirtual   #35  <Method boolean jf.b()>
					//*  12   28:ifne            48
									jf.p(c);
					//   13   31:aload_0         
					//   14   32:getfield        #16  <Field jf c>
					//   15   35:invokestatic    #39  <Method void jf.p(jf)>
								break MISSING_BLOCK_LABEL_48;
					//   16   38:goto            48
							}
						}
					//*  17   41:aload_0         
					//*  18   42:getfield        #16  <Field jf c>
					//*  19   45:invokestatic    #39  <Method void jf.p(jf)>
					//*  20   48:return          
						catch(Throwable throwable1)
					//*  21   49:astore_1        
						{
							throwable1.printStackTrace();
					//   22   50:aload_1         
					//   23   51:invokevirtual   #42  <Method void Throwable.printStackTrace()>
							return;
					//   24   54:return          
						}
						jf.p(c);
					}

					final int b;
					final jf c;

			
			{
				c = jf.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field jf c>
				b = i1;
			//    3    5:aload_0         
			//    4    6:iload_2         
			//    5    7:putfield        #18  <Field int b>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #21  <Method void TimerTask()>
			//    8   14:return          
			}
				}
));
	//   34   67:aload_0         
	//   35   68:new             #10  <Class jf$4>
	//   36   71:dup             
	//   37   72:aload_0         
	//   38   73:iload_1         
	//   39   74:invokespecial   #421 <Method void jf$4(jf, int)>
	//   40   77:putfield        #419 <Field TimerTask a>
			if(i == null)
	//*  41   80:aload_0         
	//*  42   81:getfield        #423 <Field Timer i>
	//*  43   84:ifnonnull       116
			{
				i = new Timer(false);
	//   44   87:aload_0         
	//   45   88:new             #425 <Class Timer>
	//   46   91:dup             
	//   47   92:iconst_0        
	//   48   93:invokespecial   #428 <Method void Timer(boolean)>
	//   49   96:putfield        #423 <Field Timer i>
				i.schedule(a, 3000L, 3000L);
	//   50   99:aload_0         
	//   51  100:getfield        #423 <Field Timer i>
	//   52  103:aload_0         
	//   53  104:getfield        #419 <Field TimerTask a>
	//   54  107:ldc2w           #429 <Long 3000L>
	//   55  110:ldc2w           #429 <Long 3000L>
	//   56  113:invokevirtual   #434 <Method void Timer.schedule(TimerTask, long, long)>
			}
			return;
	//   57  116:return          
		}
		catch(Throwable throwable)
	//*  58  117:astore          8
		{
			throwable.printStackTrace();
	//   59  119:aload           8
	//   60  121:invokevirtual   #437 <Method void Throwable.printStackTrace()>
		}
		return;
	//   61  124:return          
	}

	static boolean c(jf jf1, boolean flag)
	{
		jf1.z = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #124 <Field boolean z>
		return flag;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

	private byte[] c(Object obj)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		kb kb1 = new kb();
	//    2    2:new             #443 <Class kb>
	//    3    5:dup             
	//    4    6:invokespecial   #444 <Method void kb()>
	//    5    9:astore          11
		Object obj2 = "0";
	//    6   11:ldc2            #446 <String "0">
	//    7   14:astore          5
		o.jq.d = "";
	//    8   16:ldc2            #448 <String "">
	//    9   19:putstatic       #451 <Field String o.jq.d>
		Object obj1;
		String s1;
		String s2;
		s1 = "";
	//   10   22:ldc2            #448 <String "">
	//   11   25:astore          6
		s2 = "";
	//   12   27:ldc2            #448 <String "">
	//   13   30:astore          9
		obj1 = "";
	//   14   32:ldc2            #448 <String "">
	//   15   35:astore          4
		StringBuilder stringbuilder;
		StringBuilder stringbuilder1;
		StringBuilder stringbuilder2;
		String s4;
		s4 = o.kk.a("version");
	//   16   37:ldc2            #453 <String "version">
	//   17   40:invokestatic    #456 <Method String o.kk.a(String)>
	//   18   43:astore          13
		stringbuilder2 = new StringBuilder();
	//   19   45:new             #147 <Class StringBuilder>
	//   20   48:dup             
	//   21   49:invokespecial   #148 <Method void StringBuilder()>
	//   22   52:astore          12
		stringbuilder1 = new StringBuilder();
	//   23   54:new             #147 <Class StringBuilder>
	//   24   57:dup             
	//   25   58:invokespecial   #148 <Method void StringBuilder()>
	//   26   61:astore          8
		stringbuilder = new StringBuilder();
	//   27   63:new             #147 <Class StringBuilder>
	//   28   66:dup             
	//   29   67:invokespecial   #148 <Method void StringBuilder()>
	//   30   70:astore          7
		if(f == 2)
	//*  31   72:aload_0         
	//*  32   73:getfield        #85  <Field int f>
	//*  33   76:iconst_2        
	//*  34   77:icmpne          85
			obj2 = "1";
	//   35   80:ldc2            #458 <String "1">
	//   36   83:astore          5
		boolean flag;
		if(m == null)
			break MISSING_BLOCK_LABEL_184;
	//   37   85:aload_0         
	//   38   86:getfield        #91  <Field TelephonyManager m>
	//   39   89:ifnull          184
		if(jq.e == null)
			break MISSING_BLOCK_LABEL_112;
	//   40   92:getstatic       #459 <Field String jq.e>
	//   41   95:ifnull          112
		flag = "888888888888888".equals(((Object) (jq.e)));
	//   42   98:ldc2            #461 <String "888888888888888">
	//   43  101:getstatic       #459 <Field String jq.e>
	//   44  104:invokevirtual   #364 <Method boolean String.equals(Object)>
	//   45  107:istore_3        
		if(!flag)
			break MISSING_BLOCK_LABEL_138;
	//   46  108:iload_3         
	//   47  109:ifeq            138
		try
		{
			jq.e = m.getDeviceId();
	//   48  112:aload_0         
	//   49  113:getfield        #91  <Field TelephonyManager m>
	//   50  116:invokevirtual   #464 <Method String TelephonyManager.getDeviceId()>
	//   51  119:putstatic       #459 <Field String jq.e>
			if(jq.e == null)
	//*  52  122:getstatic       #459 <Field String jq.e>
	//*  53  125:ifnonnull       134
				jq.e = "888888888888888";
	//   54  128:ldc2            #461 <String "888888888888888">
	//   55  131:putstatic       #459 <Field String jq.e>
		}
	//*  56  134:goto            138
		// Misplaced declaration of an exception variable
		catch(Object obj) { }
	//   57  137:astore_1        
		if(o.jq.c == null)
			break MISSING_BLOCK_LABEL_158;
	//   58  138:getstatic       #466 <Field String o.jq.c>
	//   59  141:ifnull          158
		flag = "888888888888888".equals(((Object) (o.jq.c)));
	//   60  144:ldc2            #461 <String "888888888888888">
	//   61  147:getstatic       #466 <Field String o.jq.c>
	//   62  150:invokevirtual   #364 <Method boolean String.equals(Object)>
	//   63  153:istore_3        
		if(!flag)
			break MISSING_BLOCK_LABEL_184;
	//   64  154:iload_3         
	//   65  155:ifeq            184
		try
		{
			o.jq.c = m.getSubscriberId();
	//   66  158:aload_0         
	//   67  159:getfield        #91  <Field TelephonyManager m>
	//   68  162:invokevirtual   #469 <Method String TelephonyManager.getSubscriberId()>
	//   69  165:putstatic       #466 <Field String o.jq.c>
			if(o.jq.c == null)
	//*  70  168:getstatic       #466 <Field String o.jq.c>
	//*  71  171:ifnonnull       180
				o.jq.c = "888888888888888";
	//   72  174:ldc2            #461 <String "888888888888888">
	//   73  177:putstatic       #466 <Field String o.jq.c>
		}
	//*  74  180:goto            184
		// Misplaced declaration of an exception variable
		catch(Object obj) { }
	//   75  183:astore_1        
		obj = null;
	//   76  184:aconst_null     
	//   77  185:astore_1        
		Object obj3 = ((Object) (n.getActiveNetworkInfo()));
	//   78  186:aload_0         
	//   79  187:getfield        #87  <Field ConnectivityManager n>
	//   80  190:invokevirtual   #475 <Method android.net.NetworkInfo ConnectivityManager.getActiveNetworkInfo()>
	//   81  193:astore          10
		obj = obj3;
	//   82  195:aload           10
	//   83  197:astore_1        
		break MISSING_BLOCK_LABEL_203;
	//   84  198:goto            203
		SecurityException securityexception;
		securityexception;
	//   85  201:astore          10
		if(jy.e(((android.net.NetworkInfo) (obj))) == -1)
			break MISSING_BLOCK_LABEL_282;
	//   86  203:aload_1         
	//   87  204:invokestatic    #478 <Method int jy.e(android.net.NetworkInfo)>
	//   88  207:iconst_m1       
	//   89  208:icmpeq          282
		s2 = jy.e(m);
	//   90  211:aload_0         
	//   91  212:getfield        #91  <Field TelephonyManager m>
	//   92  215:invokestatic    #481 <Method String jy.e(TelephonyManager)>
	//   93  218:astore          9
		if(s() && b(w))
	//*  94  220:aload_0         
	//*  95  221:invokespecial   #483 <Method boolean s()>
	//*  96  224:ifeq            249
	//*  97  227:aload_0         
	//*  98  228:aload_0         
	//*  99  229:getfield        #116 <Field WifiInfo w>
	//* 100  232:invokespecial   #485 <Method boolean b(WifiInfo)>
	//* 101  235:ifeq            249
		{
			obj = "2";
	//  102  238:ldc2            #487 <String "2">
	//  103  241:astore_1        
			s1 = s2;
	//  104  242:aload           9
	//  105  244:astore          6
			break MISSING_BLOCK_LABEL_290;
	//  106  246:goto            290
		}
		securityexception = "1";
	//  107  249:ldc2            #458 <String "1">
	//  108  252:astore          10
		s1 = s2;
	//  109  254:aload           9
	//  110  256:astore          6
		obj = ((Object) (securityexception));
	//  111  258:aload           10
	//  112  260:astore_1        
		if(s())
			break MISSING_BLOCK_LABEL_290;
	//  113  261:aload_0         
	//  114  262:invokespecial   #483 <Method boolean s()>
	//  115  265:ifne            290
		o();
	//  116  268:aload_0         
	//  117  269:invokespecial   #489 <Method void o()>
		s1 = s2;
	//  118  272:aload           9
	//  119  274:astore          6
		obj = ((Object) (securityexception));
	//  120  276:aload           10
	//  121  278:astore_1        
		break MISSING_BLOCK_LABEL_290;
	//  122  279:goto            290
		w = null;
	//  123  282:aload_0         
	//  124  283:aconst_null     
	//  125  284:putfield        #116 <Field WifiInfo w>
		obj = ((Object) (s2));
	//  126  287:aload           9
	//  127  289:astore_1        
		String s3 = o.jy.a(y)[1];
	//  128  290:aload_0         
	//  129  291:getfield        #118 <Field JSONObject y>
	//  130  294:invokestatic    #492 <Method String[] o.jy.a(JSONObject)>
	//  131  297:iconst_1        
	//  132  298:aaload          
	//  133  299:astore          9
		kb1.k = ((String) (obj2));
	//  134  301:aload           11
	//  135  303:aload           5
	//  136  305:putfield        #494 <Field String kb.k>
		kb1.f = "0";
	//  137  308:aload           11
	//  138  310:ldc2            #446 <String "0">
	//  139  313:putfield        #496 <Field String kb.f>
		kb1.p = "0";
	//  140  316:aload           11
	//  141  318:ldc2            #446 <String "0">
	//  142  321:putfield        #498 <Field String kb.p>
		kb1.n = "0";
	//  143  324:aload           11
	//  144  326:ldc2            #446 <String "0">
	//  145  329:putfield        #500 <Field String kb.n>
		kb1.o = "0";
	//  146  332:aload           11
	//  147  334:ldc2            #446 <String "0">
	//  148  337:putfield        #502 <Field String kb.o>
		kb1.a = o.jq.a;
	//  149  340:aload           11
	//  150  342:getstatic       #504 <Field String o.jq.a>
	//  151  345:putfield        #505 <Field String o.kb.a>
		kb1.c = jq.b;
	//  152  348:aload           11
	//  153  350:getstatic       #507 <Field String jq.b>
	//  154  353:putfield        #508 <Field String o.kb.c>
		kb1.m = s3;
	//  155  356:aload           11
	//  156  358:aload           9
	//  157  360:putfield        #510 <Field String kb.m>
		kb1.l = jq.e;
	//  158  363:aload           11
	//  159  365:getstatic       #459 <Field String jq.e>
	//  160  368:putfield        #512 <Field String kb.l>
		kb1.t = o.jq.d;
	//  161  371:aload           11
	//  162  373:getstatic       #451 <Field String o.jq.d>
	//  163  376:putfield        #514 <Field String kb.t>
		kb1.q = o.jq.c;
	//  164  379:aload           11
	//  165  381:getstatic       #466 <Field String o.jq.c>
	//  166  384:putfield        #516 <Field String kb.q>
		kb1.s = H;
	//  167  387:aload           11
	//  168  389:aload_0         
	//  169  390:getfield        #143 <Field String H>
	//  170  393:putfield        #518 <Field String kb.s>
		kb1.r = s1;
	//  171  396:aload           11
	//  172  398:aload           6
	//  173  400:putfield        #520 <Field String kb.r>
		kb1.u = ((String) (obj));
	//  174  403:aload           11
	//  175  405:aload_1         
	//  176  406:putfield        #522 <Field String kb.u>
		kb1.h = com.amap.api.location.core.c.e();
	//  177  409:aload           11
	//  178  411:invokestatic    #526 <Method String c.e()>
	//  179  414:putfield        #528 <Field String kb.h>
		kb1.g = (new StringBuilder()).append("android").append(com.amap.api.location.core.c.d()).toString();
	//  180  417:aload           11
	//  181  419:new             #147 <Class StringBuilder>
	//  182  422:dup             
	//  183  423:invokespecial   #148 <Method void StringBuilder()>
	//  184  426:ldc2            #530 <String "android">
	//  185  429:invokevirtual   #534 <Method StringBuilder StringBuilder.append(String)>
	//  186  432:invokestatic    #536 <Method String c.d()>
	//  187  435:invokevirtual   #534 <Method StringBuilder StringBuilder.append(String)>
	//  188  438:invokevirtual   #537 <Method String StringBuilder.toString()>
	//  189  441:putfield        #539 <Field String kb.g>
		kb1.i = (new StringBuilder()).append(com.amap.api.location.core.c.g()).append(",").append(com.amap.api.location.core.c.h()).toString();
	//  190  444:aload           11
	//  191  446:new             #147 <Class StringBuilder>
	//  192  449:dup             
	//  193  450:invokespecial   #148 <Method void StringBuilder()>
	//  194  453:invokestatic    #541 <Method String c.g()>
	//  195  456:invokevirtual   #534 <Method StringBuilder StringBuilder.append(String)>
	//  196  459:ldc2            #543 <String ",">
	//  197  462:invokevirtual   #534 <Method StringBuilder StringBuilder.append(String)>
	//  198  465:invokestatic    #545 <Method String c.h()>
	//  199  468:invokevirtual   #534 <Method StringBuilder StringBuilder.append(String)>
	//  200  471:invokevirtual   #537 <Method String StringBuilder.toString()>
	//  201  474:putfield        #547 <Field String kb.i>
		kb1.D = "V1.3.3";
	//  202  477:aload           11
	//  203  479:ldc2            #549 <String "V1.3.3">
	//  204  482:putfield        #551 <Field String kb.D>
		kb1.A = s4;
	//  205  485:aload           11
	//  206  487:aload           13
	//  207  489:putfield        #553 <Field String kb.A>
		try
		{
			if(l != null && l.size() > 0)
	//* 208  492:aload_0         
	//* 209  493:getfield        #98  <Field List l>
	//* 210  496:ifnull          543
	//* 211  499:aload_0         
	//* 212  500:getfield        #98  <Field List l>
	//* 213  503:invokeinterface #218 <Method int List.size()>
	//* 214  508:ifle            543
				kb1.F = (new StringBuilder()).append(ke.b() - C).append("").toString();
	//  215  511:aload           11
	//  216  513:new             #147 <Class StringBuilder>
	//  217  516:dup             
	//  218  517:invokespecial   #148 <Method void StringBuilder()>
	//  219  520:invokestatic    #407 <Method long ke.b()>
	//  220  523:aload_0         
	//  221  524:getfield        #130 <Field long C>
	//  222  527:lsub            
	//  223  528:invokevirtual   #556 <Method StringBuilder StringBuilder.append(long)>
	//  224  531:ldc2            #448 <String "">
	//  225  534:invokevirtual   #534 <Method StringBuilder StringBuilder.append(String)>
	//  226  537:invokevirtual   #537 <Method String StringBuilder.toString()>
	//  227  540:putfield        #558 <Field String kb.F>
			break MISSING_BLOCK_LABEL_551;
	//  228  543:goto            551
		}
		// Misplaced declaration of an exception variable
		catch(Object obj) { }
	//  229  546:astore_1        
		((Throwable) (obj)).printStackTrace();
	//  230  547:aload_1         
	//  231  548:invokevirtual   #437 <Method void Throwable.printStackTrace()>
		obj = obj1;
	//  232  551:aload           4
	//  233  553:astore_1        
		if(p.size() <= 0) goto _L2; else goto _L1
	//  234  554:aload_0         
	//  235  555:getfield        #96  <Field List p>
	//  236  558:invokeinterface #218 <Method int List.size()>
	//  237  563:ifle            1073
_L1:
		obj2 = ((Object) (new StringBuilder()));
	//  238  566:new             #147 <Class StringBuilder>
	//  239  569:dup             
	//  240  570:invokespecial   #148 <Method void StringBuilder()>
	//  241  573:astore          5
		f;
	//  242  575:aload_0         
	//  243  576:getfield        #85  <Field int f>
		JVM INSTR lookupswitch 2: default 1381
	//	               1: 604
	//	               2: 861;
	//  244  579:lookupswitch    2: default 1381
	//	               1: 604
	//	               2: 861
		   goto _L3 _L4 _L5
_L4:
		obj = ((Object) ((jr)p.get(0)));
	//  245  604:aload_0         
	//  246  605:getfield        #96  <Field List p>
	//  247  608:iconst_0        
	//  248  609:invokeinterface #222 <Method Object List.get(int)>
	//  249  614:checkcast       #224 <Class jr>
	//  250  617:astore_1        
		((StringBuilder) (obj2)).delete(0, ((StringBuilder) (obj2)).length());
	//  251  618:aload           5
	//  252  620:iconst_0        
	//  253  621:aload           5
	//  254  623:invokevirtual   #561 <Method int StringBuilder.length()>
	//  255  626:invokevirtual   #565 <Method StringBuilder StringBuilder.delete(int, int)>
	//  256  629:pop             
		((StringBuilder) (obj2)).append("<mcc>").append(((jr) (obj)).d).append("</mcc>");
	//  257  630:aload           5
	//  258  632:ldc2            #567 <String "<mcc>">
	//  259  635:invokevirtual   #534 <Method StringBuilder StringBuilder.append(String)>
	//  260  638:aload_1         
	//  261  639:getfield        #398 <Field String o.jr.d>
	//  262  642:invokevirtual   #534 <Method StringBuilder StringBuilder.append(String)>
	//  263  645:ldc2            #569 <String "</mcc>">
	//  264  648:invokevirtual   #534 <Method StringBuilder StringBuilder.append(String)>
	//  265  651:pop             
		((StringBuilder) (obj2)).append("<mnc>").append(((jr) (obj)).e).append("</mnc>");
	//  266  652:aload           5
	//  267  654:ldc2            #571 <String "<mnc>">
	//  268  657:invokevirtual   #534 <Method StringBuilder StringBuilder.append(String)>
	//  269  660:aload_1         
	//  270  661:getfield        #400 <Field String jr.e>
	//  271  664:invokevirtual   #534 <Method StringBuilder StringBuilder.append(String)>
	//  272  667:ldc2            #573 <String "</mnc>">
	//  273  670:invokevirtual   #534 <Method StringBuilder StringBuilder.append(String)>
	//  274  673:pop             
		((StringBuilder) (obj2)).append("<lac>").append(((jr) (obj)).c).append("</lac>");
	//  275  674:aload           5
	//  276  676:ldc2            #575 <String "<lac>">
	//  277  679:invokevirtual   #534 <Method StringBuilder StringBuilder.append(String)>
	//  278  682:aload_1         
	//  279  683:getfield        #401 <Field int o.jr.c>
	//  280  686:invokevirtual   #578 <Method StringBuilder StringBuilder.append(int)>
	//  281  689:ldc2            #580 <String "</lac>">
	//  282  692:invokevirtual   #534 <Method StringBuilder StringBuilder.append(String)>
	//  283  695:pop             
		((StringBuilder) (obj2)).append("<cellid>").append(((jr) (obj)).a);
	//  284  696:aload           5
	//  285  698:ldc2            #582 <String "<cellid>">
	//  286  701:invokevirtual   #534 <Method StringBuilder StringBuilder.append(String)>
	//  287  704:aload_1         
	//  288  705:getfield        #403 <Field int o.jr.a>
	//  289  708:invokevirtual   #578 <Method StringBuilder StringBuilder.append(int)>
	//  290  711:pop             
		((StringBuilder) (obj2)).append("</cellid>");
	//  291  712:aload           5
	//  292  714:ldc2            #584 <String "</cellid>">
	//  293  717:invokevirtual   #534 <Method StringBuilder StringBuilder.append(String)>
	//  294  720:pop             
		((StringBuilder) (obj2)).append("<signal>").append(((jr) (obj)).g);
	//  295  721:aload           5
	//  296  723:ldc2            #586 <String "<signal>">
	//  297  726:invokevirtual   #534 <Method StringBuilder StringBuilder.append(String)>
	//  298  729:aload_1         
	//  299  730:getfield        #226 <Field int jr.g>
	//  300  733:invokevirtual   #578 <Method StringBuilder StringBuilder.append(int)>
	//  301  736:pop             
		((StringBuilder) (obj2)).append("</signal>");
	//  302  737:aload           5
	//  303  739:ldc2            #588 <String "</signal>">
	//  304  742:invokevirtual   #534 <Method StringBuilder StringBuilder.append(String)>
	//  305  745:pop             
		obj = ((Object) (((StringBuilder) (obj2)).toString()));
	//  306  746:aload           5
	//  307  748:invokevirtual   #537 <Method String StringBuilder.toString()>
	//  308  751:astore_1        
		int i1 = 0;
	//  309  752:iconst_0        
	//  310  753:istore_2        
_L11:
		if(i1 >= p.size())
			break; /* Loop/switch isn't completed */
	//  311  754:iload_2         
	//  312  755:aload_0         
	//  313  756:getfield        #96  <Field List p>
	//  314  759:invokeinterface #218 <Method int List.size()>
	//  315  764:icmpge          1394
		if(i1 != 0) goto _L7; else goto _L6
	//  316  767:iload_2         
	//  317  768:ifne            774
	//* 318  771:goto            1387
_L7:
		obj1 = ((Object) ((jr)p.get(i1)));
	//  319  774:aload_0         
	//  320  775:getfield        #96  <Field List p>
	//  321  778:iload_2         
	//  322  779:invokeinterface #222 <Method Object List.get(int)>
	//  323  784:checkcast       #224 <Class jr>
	//  324  787:astore          4
		stringbuilder2.append(((jr) (obj1)).c).append(",");
	//  325  789:aload           12
	//  326  791:aload           4
	//  327  793:getfield        #401 <Field int o.jr.c>
	//  328  796:invokevirtual   #578 <Method StringBuilder StringBuilder.append(int)>
	//  329  799:ldc2            #543 <String ",">
	//  330  802:invokevirtual   #534 <Method StringBuilder StringBuilder.append(String)>
	//  331  805:pop             
		stringbuilder2.append(((jr) (obj1)).a).append(",");
	//  332  806:aload           12
	//  333  808:aload           4
	//  334  810:getfield        #403 <Field int o.jr.a>
	//  335  813:invokevirtual   #578 <Method StringBuilder StringBuilder.append(int)>
	//  336  816:ldc2            #543 <String ",">
	//  337  819:invokevirtual   #534 <Method StringBuilder StringBuilder.append(String)>
	//  338  822:pop             
		stringbuilder2.append(((jr) (obj1)).g);
	//  339  823:aload           12
	//  340  825:aload           4
	//  341  827:getfield        #226 <Field int jr.g>
	//  342  830:invokevirtual   #578 <Method StringBuilder StringBuilder.append(int)>
	//  343  833:pop             
		if(i1 != p.size() - 1)
	//* 344  834:iload_2         
	//* 345  835:aload_0         
	//* 346  836:getfield        #96  <Field List p>
	//* 347  839:invokeinterface #218 <Method int List.size()>
	//* 348  844:iconst_1        
	//* 349  845:isub            
	//* 350  846:icmpeq          1387
			stringbuilder2.append("*");
	//  351  849:aload           12
	//  352  851:ldc2            #269 <String "*">
	//  353  854:invokevirtual   #534 <Method StringBuilder StringBuilder.append(String)>
	//  354  857:pop             
		  goto _L6
	//* 355  858:goto            1387
_L5:
		obj = ((Object) ((jr)p.get(0)));
	//  356  861:aload_0         
	//  357  862:getfield        #96  <Field List p>
	//  358  865:iconst_0        
	//  359  866:invokeinterface #222 <Method Object List.get(int)>
	//  360  871:checkcast       #224 <Class jr>
	//  361  874:astore_1        
		((StringBuilder) (obj2)).delete(0, ((StringBuilder) (obj2)).length());
	//  362  875:aload           5
	//  363  877:iconst_0        
	//  364  878:aload           5
	//  365  880:invokevirtual   #561 <Method int StringBuilder.length()>
	//  366  883:invokevirtual   #565 <Method StringBuilder StringBuilder.delete(int, int)>
	//  367  886:pop             
		((StringBuilder) (obj2)).append("<mcc>").append(((jr) (obj)).d).append("</mcc>");
	//  368  887:aload           5
	//  369  889:ldc2            #567 <String "<mcc>">
	//  370  892:invokevirtual   #534 <Method StringBuilder StringBuilder.append(String)>
	//  371  895:aload_1         
	//  372  896:getfield        #398 <Field String o.jr.d>
	//  373  899:invokevirtual   #534 <Method StringBuilder StringBuilder.append(String)>
	//  374  902:ldc2            #569 <String "</mcc>">
	//  375  905:invokevirtual   #534 <Method StringBuilder StringBuilder.append(String)>
	//  376  908:pop             
		((StringBuilder) (obj2)).append("<sid>").append(((jr) (obj)).i).append("</sid>");
	//  377  909:aload           5
	//  378  911:ldc2            #590 <String "<sid>">
	//  379  914:invokevirtual   #534 <Method StringBuilder StringBuilder.append(String)>
	//  380  917:aload_1         
	//  381  918:getfield        #592 <Field int jr.i>
	//  382  921:invokevirtual   #578 <Method StringBuilder StringBuilder.append(int)>
	//  383  924:ldc2            #594 <String "</sid>">
	//  384  927:invokevirtual   #534 <Method StringBuilder StringBuilder.append(String)>
	//  385  930:pop             
		((StringBuilder) (obj2)).append("<nid>").append(((jr) (obj)).h).append("</nid>");
	//  386  931:aload           5
	//  387  933:ldc2            #596 <String "<nid>">
	//  388  936:invokevirtual   #534 <Method StringBuilder StringBuilder.append(String)>
	//  389  939:aload_1         
	//  390  940:getfield        #598 <Field int jr.h>
	//  391  943:invokevirtual   #578 <Method StringBuilder StringBuilder.append(int)>
	//  392  946:ldc2            #600 <String "</nid>">
	//  393  949:invokevirtual   #534 <Method StringBuilder StringBuilder.append(String)>
	//  394  952:pop             
		((StringBuilder) (obj2)).append("<bid>").append(((jr) (obj)).k).append("</bid>");
	//  395  953:aload           5
	//  396  955:ldc2            #602 <String "<bid>">
	//  397  958:invokevirtual   #534 <Method StringBuilder StringBuilder.append(String)>
	//  398  961:aload_1         
	//  399  962:getfield        #603 <Field int jr.k>
	//  400  965:invokevirtual   #578 <Method StringBuilder StringBuilder.append(int)>
	//  401  968:ldc2            #605 <String "</bid>">
	//  402  971:invokevirtual   #534 <Method StringBuilder StringBuilder.append(String)>
	//  403  974:pop             
		if(((jr) (obj)).f > 0 && ((jr) (obj)).b > 0)
	//* 404  975:aload_1         
	//* 405  976:getfield        #606 <Field int jr.f>
	//* 406  979:ifle            1033
	//* 407  982:aload_1         
	//* 408  983:getfield        #608 <Field int jr.b>
	//* 409  986:ifle            1033
		{
			((StringBuilder) (obj2)).append("<lon>").append(((jr) (obj)).f).append("</lon>");
	//  410  989:aload           5
	//  411  991:ldc2            #610 <String "<lon>">
	//  412  994:invokevirtual   #534 <Method StringBuilder StringBuilder.append(String)>
	//  413  997:aload_1         
	//  414  998:getfield        #606 <Field int jr.f>
	//  415 1001:invokevirtual   #578 <Method StringBuilder StringBuilder.append(int)>
	//  416 1004:ldc2            #612 <String "</lon>">
	//  417 1007:invokevirtual   #534 <Method StringBuilder StringBuilder.append(String)>
	//  418 1010:pop             
			((StringBuilder) (obj2)).append("<lat>").append(((jr) (obj)).b).append("</lat>");
	//  419 1011:aload           5
	//  420 1013:ldc2            #614 <String "<lat>">
	//  421 1016:invokevirtual   #534 <Method StringBuilder StringBuilder.append(String)>
	//  422 1019:aload_1         
	//  423 1020:getfield        #608 <Field int jr.b>
	//  424 1023:invokevirtual   #578 <Method StringBuilder StringBuilder.append(int)>
	//  425 1026:ldc2            #616 <String "</lat>">
	//  426 1029:invokevirtual   #534 <Method StringBuilder StringBuilder.append(String)>
	//  427 1032:pop             
		}
		((StringBuilder) (obj2)).append("<signal>").append(((jr) (obj)).g).append("</signal>");
	//  428 1033:aload           5
	//  429 1035:ldc2            #586 <String "<signal>">
	//  430 1038:invokevirtual   #534 <Method StringBuilder StringBuilder.append(String)>
	//  431 1041:aload_1         
	//  432 1042:getfield        #226 <Field int jr.g>
	//  433 1045:invokevirtual   #578 <Method StringBuilder StringBuilder.append(int)>
	//  434 1048:ldc2            #588 <String "</signal>">
	//  435 1051:invokevirtual   #534 <Method StringBuilder StringBuilder.append(String)>
	//  436 1054:pop             
		obj = ((Object) (((StringBuilder) (obj2)).toString()));
	//  437 1055:aload           5
	//  438 1057:invokevirtual   #537 <Method String StringBuilder.toString()>
	//  439 1060:astore_1        
_L10:
		((StringBuilder) (obj2)).delete(0, ((StringBuilder) (obj2)).length());
	//  440 1061:aload           5
	//  441 1063:iconst_0        
	//  442 1064:aload           5
	//  443 1066:invokevirtual   #561 <Method int StringBuilder.length()>
	//  444 1069:invokevirtual   #565 <Method StringBuilder StringBuilder.delete(int, int)>
	//  445 1072:pop             
_L2:
		if(s())
	//* 446 1073:aload_0         
	//* 447 1074:invokespecial   #483 <Method boolean s()>
	//* 448 1077:ifeq            1241
		{
			if(b(w))
	//* 449 1080:aload_0         
	//* 450 1081:aload_0         
	//* 451 1082:getfield        #116 <Field WifiInfo w>
	//* 452 1085:invokespecial   #485 <Method boolean b(WifiInfo)>
	//* 453 1088:ifeq            1397
			{
				stringbuilder.append(w.getBSSID()).append(",");
	//  454 1091:aload           7
	//  455 1093:aload_0         
	//  456 1094:getfield        #116 <Field WifiInfo w>
	//  457 1097:invokevirtual   #358 <Method String WifiInfo.getBSSID()>
	//  458 1100:invokevirtual   #534 <Method StringBuilder StringBuilder.append(String)>
	//  459 1103:ldc2            #543 <String ",">
	//  460 1106:invokevirtual   #534 <Method StringBuilder StringBuilder.append(String)>
	//  461 1109:pop             
				stringbuilder.append(w.getRssi()).append(",");
	//  462 1110:aload           7
	//  463 1112:aload_0         
	//  464 1113:getfield        #116 <Field WifiInfo w>
	//  465 1116:invokevirtual   #619 <Method int WifiInfo.getRssi()>
	//  466 1119:invokevirtual   #578 <Method StringBuilder StringBuilder.append(int)>
	//  467 1122:ldc2            #543 <String ",">
	//  468 1125:invokevirtual   #534 <Method StringBuilder StringBuilder.append(String)>
	//  469 1128:pop             
				stringbuilder.append(w.getSSID().replace("*", "."));
	//  470 1129:aload           7
	//  471 1131:aload_0         
	//  472 1132:getfield        #116 <Field WifiInfo w>
	//  473 1135:invokevirtual   #361 <Method String WifiInfo.getSSID()>
	//  474 1138:ldc2            #269 <String "*">
	//  475 1141:ldc2            #271 <String ".">
	//  476 1144:invokevirtual   #277 <Method String String.replace(CharSequence, CharSequence)>
	//  477 1147:invokevirtual   #534 <Method StringBuilder StringBuilder.append(String)>
	//  478 1150:pop             
			}
			break MISSING_BLOCK_LABEL_1397;
	//  479 1151:goto            1397
		}
		  goto _L8
_L12:
		for(; i1 < l.size(); i1++)
	//* 480 1154:iload_2         
	//* 481 1155:aload_0         
	//* 482 1156:getfield        #98  <Field List l>
	//* 483 1159:invokeinterface #218 <Method int List.size()>
	//* 484 1164:icmpge          1409
		{
			obj1 = ((Object) ((ScanResult)l.get(i1)));
	//  485 1167:aload_0         
	//  486 1168:getfield        #98  <Field List l>
	//  487 1171:iload_2         
	//  488 1172:invokeinterface #222 <Method Object List.get(int)>
	//  489 1177:checkcast       #258 <Class ScanResult>
	//  490 1180:astore          4
			if(e(((ScanResult) (obj1))))
	//* 491 1182:aload_0         
	//* 492 1183:aload           4
	//* 493 1185:invokespecial   #622 <Method boolean e(ScanResult)>
	//* 494 1188:ifeq            1402
			{
				stringbuilder1.append(((ScanResult) (obj1)).BSSID).append(",");
	//  495 1191:aload           8
	//  496 1193:aload           4
	//  497 1195:getfield        #625 <Field String ScanResult.BSSID>
	//  498 1198:invokevirtual   #534 <Method StringBuilder StringBuilder.append(String)>
	//  499 1201:ldc2            #543 <String ",">
	//  500 1204:invokevirtual   #534 <Method StringBuilder StringBuilder.append(String)>
	//  501 1207:pop             
				stringbuilder1.append(((ScanResult) (obj1)).level).append(",");
	//  502 1208:aload           8
	//  503 1210:aload           4
	//  504 1212:getfield        #261 <Field int ScanResult.level>
	//  505 1215:invokevirtual   #578 <Method StringBuilder StringBuilder.append(int)>
	//  506 1218:ldc2            #543 <String ",">
	//  507 1221:invokevirtual   #534 <Method StringBuilder StringBuilder.append(String)>
	//  508 1224:pop             
				stringbuilder1.append(i1).append("*");
	//  509 1225:aload           8
	//  510 1227:iload_2         
	//  511 1228:invokevirtual   #578 <Method StringBuilder StringBuilder.append(int)>
	//  512 1231:ldc2            #269 <String "*">
	//  513 1234:invokevirtual   #534 <Method StringBuilder StringBuilder.append(String)>
	//  514 1237:pop             
			}
			break MISSING_BLOCK_LABEL_1402;
	//  515 1238:goto            1402
		}

	//  516 1241:aload_0         
	//  517 1242:invokespecial   #489 <Method void o()>
	//  518 1245:aload           8
	//  519 1247:invokevirtual   #561 <Method int StringBuilder.length()>
	//  520 1250:ifle            1266
	//  521 1253:aload           8
	//  522 1255:aload           8
	//  523 1257:invokevirtual   #561 <Method int StringBuilder.length()>
	//  524 1260:iconst_1        
	//  525 1261:isub            
	//  526 1262:invokevirtual   #628 <Method StringBuilder StringBuilder.deleteCharAt(int)>
	//  527 1265:pop             
	//  528 1266:aload           8
	//  529 1268:astore          4
	//  530 1270:aload           8
	//  531 1272:invokevirtual   #561 <Method int StringBuilder.length()>
	//  532 1275:ifne            1282
	//  533 1278:aload           7
	//  534 1280:astore          4
	//  535 1282:aload           11
	//  536 1284:aload_1         
	//  537 1285:putfield        #630 <Field String kb.v>
	//  538 1288:aload           11
	//  539 1290:aload           12
	//  540 1292:invokevirtual   #537 <Method String StringBuilder.toString()>
	//  541 1295:putfield        #632 <Field String kb.y>
	//  542 1298:aload           11
	//  543 1300:aload           7
	//  544 1302:invokevirtual   #537 <Method String StringBuilder.toString()>
	//  545 1305:putfield        #634 <Field String kb.z>
	//  546 1308:aload           11
	//  547 1310:aload           4
	//  548 1312:invokevirtual   #537 <Method String StringBuilder.toString()>
	//  549 1315:putfield        #636 <Field String kb.w>
	//  550 1318:aload           11
	//  551 1320:aload_0         
	//  552 1321:getfield        #85  <Field int f>
	//  553 1324:invokestatic    #639 <Method String String.valueOf(int)>
	//  554 1327:putfield        #641 <Field String kb.x>
	//  555 1330:aload           12
	//  556 1332:iconst_0        
	//  557 1333:aload           12
	//  558 1335:invokevirtual   #561 <Method int StringBuilder.length()>
	//  559 1338:invokevirtual   #565 <Method StringBuilder StringBuilder.delete(int, int)>
	//  560 1341:pop             
	//  561 1342:aload           4
	//  562 1344:iconst_0        
	//  563 1345:aload           4
	//  564 1347:invokevirtual   #561 <Method int StringBuilder.length()>
	//  565 1350:invokevirtual   #565 <Method StringBuilder StringBuilder.delete(int, int)>
	//  566 1353:pop             
	//  567 1354:aload           7
	//  568 1356:iconst_0        
	//  569 1357:aload           7
	//  570 1359:invokevirtual   #561 <Method int StringBuilder.length()>
	//  571 1362:invokevirtual   #565 <Method StringBuilder StringBuilder.delete(int, int)>
	//  572 1365:pop             
	//  573 1366:aload           11
	//  574 1368:invokevirtual   #644 <Method byte[] kb.e()>
	//  575 1371:astore_1        
	//  576 1372:aload_0         
	//  577 1373:monitorexit     
	//  578 1374:aload_1         
	//  579 1375:areturn         
	//  580 1376:astore_1        
	//  581 1377:aload_0         
	//  582 1378:monitorexit     
	//  583 1379:aload_1         
	//  584 1380:athrow          
	//  585 1381:aload           4
	//  586 1383:astore_1        
	//  587 1384:goto            1061
	//  588 1387:iload_2         
	//  589 1388:iconst_1        
	//  590 1389:iadd            
	//  591 1390:istore_2        
	//  592 1391:goto            754
	//  593 1394:goto            1061
	//  594 1397:iconst_0        
	//  595 1398:istore_2        
	//  596 1399:goto            1154
	//  597 1402:iload_2         
	//  598 1403:iconst_1        
	//  599 1404:iadd            
	//  600 1405:istore_2        
		  goto _L9
_L8:
		o();
_L9:
		if(stringbuilder1.length() > 0)
			stringbuilder1.deleteCharAt(stringbuilder1.length() - 1);
		obj1 = ((Object) (stringbuilder1));
		if(stringbuilder1.length() == 0)
			obj1 = ((Object) (stringbuilder));
		kb1.v = ((String) (obj));
		kb1.y = stringbuilder2.toString();
		kb1.z = stringbuilder.toString();
		kb1.w = ((StringBuilder) (obj1)).toString();
		kb1.x = String.valueOf(f);
		stringbuilder2.delete(0, stringbuilder2.length());
		((StringBuilder) (obj1)).delete(0, ((StringBuilder) (obj1)).length());
		stringbuilder.delete(0, stringbuilder.length());
		obj = ((Object) (kb1.e()));
		this;
		JVM INSTR monitorexit ;
		return ((byte []) (obj));
		obj;
		throw obj;
_L3:
		obj = obj1;
		  goto _L10
_L6:
		i1++;
		  goto _L11
		i1 = 0;
		  goto _L12
	//* 601 1406:goto            1154
	//* 602 1409:goto            1245
	}

	private CellLocation d(List list)
	{
		byte byte0;
		int i1;
		Object obj;
		Object obj1;
		ClassLoader classloader;
		if(list == null || list.isEmpty())
	//*   0    0:aload_1         
	//*   1    1:ifnull          13
	//*   2    4:aload_1         
	//*   3    5:invokeinterface #646 <Method boolean List.isEmpty()>
	//*   4   10:ifeq            15
			return null;
	//    5   13:aconst_null     
	//    6   14:areturn         
		classloader = ClassLoader.getSystemClassLoader();
	//    7   15:invokestatic    #652 <Method ClassLoader ClassLoader.getSystemClassLoader()>
	//    8   18:astore          14
		obj1 = null;
	//    9   20:aconst_null     
	//   10   21:astore          10
		obj = null;
	//   11   23:aconst_null     
	//   12   24:astore          9
		byte0 = 0;
	//   13   26:iconst_0        
	//   14   27:istore_2        
		i1 = 0;
	//   15   28:iconst_0        
	//   16   29:istore          4
_L2:
		byte byte1;
		Object obj2;
		Object obj3;
		CdmaCellLocation cdmacelllocation;
		Object obj4;
		obj2 = obj1;
	//   17   31:aload           10
	//   18   33:astore          11
		obj3 = obj;
	//   19   35:aload           9
	//   20   37:astore          12
		byte1 = byte0;
	//   21   39:iload_2         
	//   22   40:istore_3        
		if(i1 >= list.size())
			break; /* Loop/switch isn't completed */
	//   23   41:iload           4
	//   24   43:aload_1         
	//   25   44:invokeinterface #218 <Method int List.size()>
	//   26   49:icmpge          769
		obj4 = list.get(i1);
	//   27   52:aload_1         
	//   28   53:iload           4
	//   29   55:invokeinterface #222 <Method Object List.get(int)>
	//   30   60:astore          15
		if(obj4 == null)
	//*  31   62:aload           15
	//*  32   64:ifnonnull       70
			break MISSING_BLOCK_LABEL_760;
	//   33   67:goto            760
		obj3 = obj1;
	//   34   70:aload           10
	//   35   72:astore          12
		cdmacelllocation = ((CdmaCellLocation) (obj));
	//   36   74:aload           9
	//   37   76:astore          13
		byte1 = byte0;
	//   38   78:iload_2         
	//   39   79:istore_3        
		Class class2 = classloader.loadClass("android.telephony.CellInfoGsm");
	//   40   80:aload           14
	//   41   82:ldc2            #654 <String "android.telephony.CellInfoGsm">
	//   42   85:invokevirtual   #658 <Method Class ClassLoader.loadClass(String)>
	//   43   88:astore          17
		obj3 = obj1;
	//   44   90:aload           10
	//   45   92:astore          12
		cdmacelllocation = ((CdmaCellLocation) (obj));
	//   46   94:aload           9
	//   47   96:astore          13
		byte1 = byte0;
	//   48   98:iload_2         
	//   49   99:istore_3        
		Class class3 = classloader.loadClass("android.telephony.CellInfoWcdma");
	//   50  100:aload           14
	//   51  102:ldc2            #660 <String "android.telephony.CellInfoWcdma">
	//   52  105:invokevirtual   #658 <Method Class ClassLoader.loadClass(String)>
	//   53  108:astore          18
		obj3 = obj1;
	//   54  110:aload           10
	//   55  112:astore          12
		cdmacelllocation = ((CdmaCellLocation) (obj));
	//   56  114:aload           9
	//   57  116:astore          13
		byte1 = byte0;
	//   58  118:iload_2         
	//   59  119:istore_3        
		Class class4 = classloader.loadClass("android.telephony.CellInfoLte");
	//   60  120:aload           14
	//   61  122:ldc2            #662 <String "android.telephony.CellInfoLte">
	//   62  125:invokevirtual   #658 <Method Class ClassLoader.loadClass(String)>
	//   63  128:astore          19
		obj3 = obj1;
	//   64  130:aload           10
	//   65  132:astore          12
		cdmacelllocation = ((CdmaCellLocation) (obj));
	//   66  134:aload           9
	//   67  136:astore          13
		byte1 = byte0;
	//   68  138:iload_2         
	//   69  139:istore_3        
		Class class1 = classloader.loadClass("android.telephony.CellInfoCdma");
	//   70  140:aload           14
	//   71  142:ldc2            #664 <String "android.telephony.CellInfoCdma">
	//   72  145:invokevirtual   #658 <Method Class ClassLoader.loadClass(String)>
	//   73  148:astore          16
		obj3 = obj1;
	//   74  150:aload           10
	//   75  152:astore          12
		cdmacelllocation = ((CdmaCellLocation) (obj));
	//   76  154:aload           9
	//   77  156:astore          13
		byte1 = byte0;
	//   78  158:iload_2         
	//   79  159:istore_3        
		if(class2.isInstance(obj4))
	//*  80  160:aload           17
	//*  81  162:aload           15
	//*  82  164:invokevirtual   #669 <Method boolean Class.isInstance(Object)>
	//*  83  167:ifeq            175
		{
			byte0 = 1;
	//   84  170:iconst_1        
	//   85  171:istore_2        
			break MISSING_BLOCK_LABEL_250;
	//   86  172:goto            250
		}
		obj3 = obj1;
	//   87  175:aload           10
	//   88  177:astore          12
		cdmacelllocation = ((CdmaCellLocation) (obj));
	//   89  179:aload           9
	//   90  181:astore          13
		byte1 = byte0;
	//   91  183:iload_2         
	//   92  184:istore_3        
		if(class3.isInstance(obj4))
	//*  93  185:aload           18
	//*  94  187:aload           15
	//*  95  189:invokevirtual   #669 <Method boolean Class.isInstance(Object)>
	//*  96  192:ifeq            200
		{
			byte0 = 2;
	//   97  195:iconst_2        
	//   98  196:istore_2        
			break MISSING_BLOCK_LABEL_250;
	//   99  197:goto            250
		}
		obj3 = obj1;
	//  100  200:aload           10
	//  101  202:astore          12
		cdmacelllocation = ((CdmaCellLocation) (obj));
	//  102  204:aload           9
	//  103  206:astore          13
		byte1 = byte0;
	//  104  208:iload_2         
	//  105  209:istore_3        
		if(class4.isInstance(obj4))
	//* 106  210:aload           19
	//* 107  212:aload           15
	//* 108  214:invokevirtual   #669 <Method boolean Class.isInstance(Object)>
	//* 109  217:ifeq            225
		{
			byte0 = 3;
	//  110  220:iconst_3        
	//  111  221:istore_2        
			break MISSING_BLOCK_LABEL_250;
	//  112  222:goto            250
		}
		obj3 = obj1;
	//  113  225:aload           10
	//  114  227:astore          12
		cdmacelllocation = ((CdmaCellLocation) (obj));
	//  115  229:aload           9
	//  116  231:astore          13
		byte1 = byte0;
	//  117  233:iload_2         
	//  118  234:istore_3        
		int j1;
		int k1;
		int l1;
		int i2;
		if(class1.isInstance(obj4))
	//* 119  235:aload           16
	//* 120  237:aload           15
	//* 121  239:invokevirtual   #669 <Method boolean Class.isInstance(Object)>
	//* 122  242:ifeq            780
			byte0 = 4;
	//  123  245:iconst_4        
	//  124  246:istore_2        
		else
	//* 125  247:goto            250
	//* 126  250:iload_2         
	//* 127  251:ifle            745
	//* 128  254:aconst_null     
	//* 129  255:astore          11
	//* 130  257:iload_2         
	//* 131  258:iconst_1        
	//* 132  259:icmpne          284
	//* 133  262:aload           10
	//* 134  264:astore          12
	//* 135  266:aload           9
	//* 136  268:astore          13
	//* 137  270:iload_2         
	//* 138  271:istore_3        
	//* 139  272:aload           17
	//* 140  274:aload           15
	//* 141  276:invokevirtual   #673 <Method Object Class.cast(Object)>
	//* 142  279:astore          11
	//* 143  281:goto            362
	//* 144  284:iload_2         
	//* 145  285:iconst_2        
	//* 146  286:icmpne          311
	//* 147  289:aload           10
	//* 148  291:astore          12
	//* 149  293:aload           9
	//* 150  295:astore          13
	//* 151  297:iload_2         
	//* 152  298:istore_3        
	//* 153  299:aload           18
	//* 154  301:aload           15
	//* 155  303:invokevirtual   #673 <Method Object Class.cast(Object)>
	//* 156  306:astore          11
	//* 157  308:goto            362
	//* 158  311:iload_2         
	//* 159  312:iconst_3        
	//* 160  313:icmpne          338
	//* 161  316:aload           10
	//* 162  318:astore          12
	//* 163  320:aload           9
	//* 164  322:astore          13
	//* 165  324:iload_2         
	//* 166  325:istore_3        
	//* 167  326:aload           19
	//* 168  328:aload           15
	//* 169  330:invokevirtual   #673 <Method Object Class.cast(Object)>
	//* 170  333:astore          11
	//* 171  335:goto            362
	//* 172  338:iload_2         
	//* 173  339:iconst_4        
	//* 174  340:icmpne          362
	//* 175  343:aload           10
	//* 176  345:astore          12
	//* 177  347:aload           9
	//* 178  349:astore          13
	//* 179  351:iload_2         
	//* 180  352:istore_3        
	//* 181  353:aload           16
	//* 182  355:aload           15
	//* 183  357:invokevirtual   #673 <Method Object Class.cast(Object)>
	//* 184  360:astore          11
	//* 185  362:aload           10
	//* 186  364:astore          12
	//* 187  366:aload           9
	//* 188  368:astore          13
	//* 189  370:iload_2         
	//* 190  371:istore_3        
	//* 191  372:aload           11
	//* 192  374:ldc2            #675 <String "getCellIdentity">
	//* 193  377:iconst_0        
	//* 194  378:anewarray       Object[]
	//* 195  381:invokestatic    #190 <Method Object ka.e(Object, String, Object[])>
	//* 196  384:astore          11
	//* 197  386:aload           11
	//* 198  388:ifnonnull       394
	//* 199  391:goto            760
	//* 200  394:iload_2         
	//* 201  395:iconst_4        
	//* 202  396:icmpne          552
	//* 203  399:aload           10
	//* 204  401:astore          12
	//* 205  403:aload           9
	//* 206  405:astore          13
	//* 207  407:iload_2         
	//* 208  408:istore_3        
	//* 209  409:new             #677 <Class CdmaCellLocation>
	//* 210  412:dup             
	//* 211  413:invokespecial   #678 <Method void CdmaCellLocation()>
	//* 212  416:astore          9
	//* 213  418:aload           10
	//* 214  420:astore          12
	//* 215  422:aload           9
	//* 216  424:astore          13
	//* 217  426:iload_2         
	//* 218  427:istore_3        
	//* 219  428:aload           11
	//* 220  430:ldc2            #382 <String "getSystemId">
	//* 221  433:iconst_0        
	//* 222  434:anewarray       Object[]
	//* 223  437:invokestatic    #385 <Method int o.ka.a(Object, String, Object[])>
	//* 224  440:istore          5
	//* 225  442:aload           10
	//* 226  444:astore          12
	//* 227  446:aload           9
	//* 228  448:astore          13
	//* 229  450:iload_2         
	//* 230  451:istore_3        
	//* 231  452:aload           11
	//* 232  454:ldc2            #387 <String "getNetworkId">
	//* 233  457:iconst_0        
	//* 234  458:anewarray       Object[]
	//* 235  461:invokestatic    #385 <Method int o.ka.a(Object, String, Object[])>
	//* 236  464:istore          6
	//* 237  466:aload           10
	//* 238  468:astore          12
	//* 239  470:aload           9
	//* 240  472:astore          13
	//* 241  474:iload_2         
	//* 242  475:istore_3        
	//* 243  476:aload           11
	//* 244  478:ldc2            #680 <String "getBasestationId">
	//* 245  481:iconst_0        
	//* 246  482:anewarray       Object[]
	//* 247  485:invokestatic    #385 <Method int o.ka.a(Object, String, Object[])>
	//* 248  488:istore          7
	//* 249  490:aload           10
	//* 250  492:astore          12
	//* 251  494:aload           9
	//* 252  496:astore          13
	//* 253  498:iload_2         
	//* 254  499:istore_3        
	//* 255  500:aload           11
	//* 256  502:ldc2            #682 <String "getLongitude">
	//* 257  505:iconst_0        
	//* 258  506:anewarray       Object[]
	//* 259  509:invokestatic    #385 <Method int o.ka.a(Object, String, Object[])>
	//* 260  512:istore          8
	//* 261  514:aload           10
	//* 262  516:astore          12
	//* 263  518:aload           9
	//* 264  520:astore          13
	//* 265  522:iload_2         
	//* 266  523:istore_3        
	//* 267  524:aload           9
	//* 268  526:iload           7
	//* 269  528:aload           11
	//* 270  530:ldc2            #684 <String "getLatitude">
	//* 271  533:iconst_0        
	//* 272  534:anewarray       Object[]
	//* 273  537:invokestatic    #385 <Method int o.ka.a(Object, String, Object[])>
	//* 274  540:iload           8
	//* 275  542:iload           5
	//* 276  544:iload           6
	//* 277  546:invokevirtual   #688 <Method void CdmaCellLocation.setCellLocationData(int, int, int, int, int)>
	//* 278  549:goto            732
	//* 279  552:iload_2         
	//* 280  553:iconst_3        
	//* 281  554:icmpne          646
	//* 282  557:aload           10
	//* 283  559:astore          12
	//* 284  561:aload           9
	//* 285  563:astore          13
	//* 286  565:iload_2         
	//* 287  566:istore_3        
	//* 288  567:aload           11
	//* 289  569:ldc2            #690 <String "getTac">
	//* 290  572:iconst_0        
	//* 291  573:anewarray       Object[]
	//* 292  576:invokestatic    #385 <Method int o.ka.a(Object, String, Object[])>
	//* 293  579:istore          5
	//* 294  581:aload           10
	//* 295  583:astore          12
	//* 296  585:aload           9
	//* 297  587:astore          13
	//* 298  589:iload_2         
	//* 299  590:istore_3        
	//* 300  591:aload           11
	//* 301  593:ldc2            #692 <String "getCi">
	//* 302  596:iconst_0        
	//* 303  597:anewarray       Object[]
	//* 304  600:invokestatic    #385 <Method int o.ka.a(Object, String, Object[])>
	//* 305  603:istore          6
	//* 306  605:aload           10
	//* 307  607:astore          12
	//* 308  609:aload           9
	//* 309  611:astore          13
	//* 310  613:iload_2         
	//* 311  614:istore_3        
	//* 312  615:new             #372 <Class GsmCellLocation>
	//* 313  618:dup             
	//* 314  619:invokespecial   #693 <Method void GsmCellLocation()>
	//* 315  622:astore          10
	//* 316  624:aload           10
	//* 317  626:astore          12
	//* 318  628:aload           9
	//* 319  630:astore          13
	//* 320  632:iload_2         
	//* 321  633:istore_3        
	//* 322  634:aload           10
	//* 323  636:iload           5
	//* 324  638:iload           6
	//* 325  640:invokevirtual   #697 <Method void GsmCellLocation.setLacAndCid(int, int)>
	//* 326  643:goto            732
	//* 327  646:aload           10
	//* 328  648:astore          12
	//* 329  650:aload           9
	//* 330  652:astore          13
	//* 331  654:iload_2         
	//* 332  655:istore_3        
	//* 333  656:aload           11
	//* 334  658:ldc2            #698 <String "getLac">
	//* 335  661:iconst_0        
	//* 336  662:anewarray       Object[]
	//* 337  665:invokestatic    #385 <Method int o.ka.a(Object, String, Object[])>
	//* 338  668:istore          5
	//* 339  670:aload           10
	//* 340  672:astore          12
	//* 341  674:aload           9
	//* 342  676:astore          13
	//* 343  678:iload_2         
	//* 344  679:istore_3        
	//* 345  680:aload           11
	//* 346  682:ldc2            #699 <String "getCid">
	//* 347  685:iconst_0        
	//* 348  686:anewarray       Object[]
	//* 349  689:invokestatic    #385 <Method int o.ka.a(Object, String, Object[])>
	//* 350  692:istore          6
	//* 351  694:aload           10
	//* 352  696:astore          12
	//* 353  698:aload           9
	//* 354  700:astore          13
	//* 355  702:iload_2         
	//* 356  703:istore_3        
	//* 357  704:new             #372 <Class GsmCellLocation>
	//* 358  707:dup             
	//* 359  708:invokespecial   #693 <Method void GsmCellLocation()>
	//* 360  711:astore          10
	//* 361  713:aload           10
	//* 362  715:astore          12
	//* 363  717:aload           9
	//* 364  719:astore          13
	//* 365  721:iload_2         
	//* 366  722:istore_3        
	//* 367  723:aload           10
	//* 368  725:iload           5
	//* 369  727:iload           6
	//* 370  729:invokevirtual   #697 <Method void GsmCellLocation.setLacAndCid(int, int)>
	//* 371  732:aload           10
	//* 372  734:astore          11
	//* 373  736:aload           9
	//* 374  738:astore          12
	//* 375  740:iload_2         
	//* 376  741:istore_3        
	//* 377  742:goto            769
	//* 378  745:goto            760
	//* 379  748:astore          9
	//* 380  750:iload_3         
	//* 381  751:istore_2        
	//* 382  752:aload           13
	//* 383  754:astore          9
	//* 384  756:aload           12
	//* 385  758:astore          10
	//* 386  760:iload           4
	//* 387  762:iconst_1        
	//* 388  763:iadd            
	//* 389  764:istore          4
	//* 390  766:goto            31
	//* 391  769:iload_3         
	//* 392  770:iconst_4        
	//* 393  771:icmpne          777
	//* 394  774:aload           12
	//* 395  776:areturn         
	//* 396  777:aload           11
	//* 397  779:areturn         
			byte0 = 0;
	//  398  780:iconst_0        
	//  399  781:istore_2        
		if(byte0 <= 0)
			break MISSING_BLOCK_LABEL_760;
		obj2 = null;
		if(byte0 != 1)
			break MISSING_BLOCK_LABEL_284;
		obj3 = obj1;
		cdmacelllocation = ((CdmaCellLocation) (obj));
		byte1 = byte0;
		obj2 = class2.cast(obj4);
		break MISSING_BLOCK_LABEL_362;
		if(byte0 != 2)
			break MISSING_BLOCK_LABEL_311;
		obj3 = obj1;
		cdmacelllocation = ((CdmaCellLocation) (obj));
		byte1 = byte0;
		obj2 = class3.cast(obj4);
		break MISSING_BLOCK_LABEL_362;
		if(byte0 != 3)
			break MISSING_BLOCK_LABEL_338;
		obj3 = obj1;
		cdmacelllocation = ((CdmaCellLocation) (obj));
		byte1 = byte0;
		obj2 = class4.cast(obj4);
		break MISSING_BLOCK_LABEL_362;
		if(byte0 != 4)
			break MISSING_BLOCK_LABEL_362;
		obj3 = obj1;
		cdmacelllocation = ((CdmaCellLocation) (obj));
		byte1 = byte0;
		obj2 = class1.cast(obj4);
		obj3 = obj1;
		cdmacelllocation = ((CdmaCellLocation) (obj));
		byte1 = byte0;
		obj2 = ka.e(obj2, "getCellIdentity", new Object[0]);
		if(obj2 == null)
			break MISSING_BLOCK_LABEL_760;
		if(byte0 != 4)
			break MISSING_BLOCK_LABEL_552;
		obj3 = obj1;
		cdmacelllocation = ((CdmaCellLocation) (obj));
		byte1 = byte0;
		obj = ((Object) (new CdmaCellLocation()));
		obj3 = obj1;
		cdmacelllocation = ((CdmaCellLocation) (obj));
		byte1 = byte0;
		j1 = o.ka.a(obj2, "getSystemId", new Object[0]);
		obj3 = obj1;
		cdmacelllocation = ((CdmaCellLocation) (obj));
		byte1 = byte0;
		k1 = o.ka.a(obj2, "getNetworkId", new Object[0]);
		obj3 = obj1;
		cdmacelllocation = ((CdmaCellLocation) (obj));
		byte1 = byte0;
		l1 = o.ka.a(obj2, "getBasestationId", new Object[0]);
		obj3 = obj1;
		cdmacelllocation = ((CdmaCellLocation) (obj));
		byte1 = byte0;
		i2 = o.ka.a(obj2, "getLongitude", new Object[0]);
		obj3 = obj1;
		cdmacelllocation = ((CdmaCellLocation) (obj));
		byte1 = byte0;
		try
		{
			((CdmaCellLocation) (obj)).setCellLocationData(l1, o.ka.a(obj2, "getLatitude", new Object[0]), i2, j1, k1);
			break MISSING_BLOCK_LABEL_732;
		}
		catch(Exception exception)
		{
			byte0 = byte1;
			exception = ((Exception) (cdmacelllocation));
			obj1 = obj3;
		}
		break MISSING_BLOCK_LABEL_760;
		if(byte0 != 3)
			break MISSING_BLOCK_LABEL_646;
		obj3 = obj1;
		cdmacelllocation = ((CdmaCellLocation) (obj));
		byte1 = byte0;
		j1 = o.ka.a(obj2, "getTac", new Object[0]);
		obj3 = obj1;
		cdmacelllocation = ((CdmaCellLocation) (obj));
		byte1 = byte0;
		k1 = o.ka.a(obj2, "getCi", new Object[0]);
		obj3 = obj1;
		cdmacelllocation = ((CdmaCellLocation) (obj));
		byte1 = byte0;
		obj1 = ((Object) (new GsmCellLocation()));
		obj3 = obj1;
		cdmacelllocation = ((CdmaCellLocation) (obj));
		byte1 = byte0;
		((GsmCellLocation) (obj1)).setLacAndCid(j1, k1);
		break MISSING_BLOCK_LABEL_732;
		obj3 = obj1;
		cdmacelllocation = ((CdmaCellLocation) (obj));
		byte1 = byte0;
		j1 = o.ka.a(obj2, "getLac", new Object[0]);
		obj3 = obj1;
		cdmacelllocation = ((CdmaCellLocation) (obj));
		byte1 = byte0;
		k1 = o.ka.a(obj2, "getCid", new Object[0]);
		obj3 = obj1;
		cdmacelllocation = ((CdmaCellLocation) (obj));
		byte1 = byte0;
		obj1 = ((Object) (new GsmCellLocation()));
		obj3 = obj1;
		cdmacelllocation = ((CdmaCellLocation) (obj));
		byte1 = byte0;
		((GsmCellLocation) (obj1)).setLacAndCid(j1, k1);
		obj2 = obj1;
		obj3 = obj;
		byte1 = byte0;
		break; /* Loop/switch isn't completed */
		i1++;
		if(true) goto _L2; else goto _L1
_L1:
		if(byte1 == 4)
			return ((CellLocation) (obj3));
		else
			return ((CellLocation) (obj2));
	//* 400  782:goto            250
	}

	static List d(jf jf1)
	{
		return jf1.l;
	//    0    0:aload_0         
	//    1    1:getfield        #98  <Field List l>
	//    2    4:areturn         
	}

	static List d(jf jf1, List list)
	{
		jf1.l = list;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #98  <Field List l>
		return list;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

	private void d(int i1)
	{
		int j1;
		if(!b())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #411 <Method boolean b()>
	//*   2    4:ifne            8
			return;
	//    3    7:return          
		byte abyte0[];
		String s1;
		try
		{
			x();
	//    4    8:aload_0         
	//    5    9:invokespecial   #703 <Method void x()>
		}
	//*   6   12:ldc2            #704 <Int 0x42fffff>
	//*   7   15:istore_2        
	//*   8   16:iload_1         
	//*   9   17:tableswitch     0 2: default 232
	//	               0 237
	//	               1 244
	//	               2 44
	//*  10   44:aload_0         
	//*  11   45:invokespecial   #706 <Method boolean l()>
	//*  12   48:ifne            251
	//*  13   51:ldc2            #707 <Int 0x282fffff>
	//*  14   54:istore_1        
	//*  15   55:goto            58
	//*  16   58:aload_0         
	//*  17   59:getfield        #145 <Field kk I>
	//*  18   62:aconst_null     
	//*  19   63:aload_0         
	//*  20   64:iconst_1        
	//*  21   65:iload_1         
	//*  22   66:iconst_1        
	//*  23   67:invokespecial   #709 <Method String a(int, int, int)>
	//*  24   70:invokevirtual   #712 <Method void kk.b(in, String)>
	//*  25   73:aload_0         
	//*  26   74:aload_0         
	//*  27   75:getfield        #145 <Field kk I>
	//*  28   78:invokevirtual   #715 <Method in o.kk.d()>
	//*  29   81:putfield        #717 <Field in h>
	//*  30   84:aload_0         
	//*  31   85:getfield        #717 <Field in h>
	//*  32   88:ifnull          185
	//*  33   91:aload_0         
	//*  34   92:getfield        #717 <Field in h>
	//*  35   95:invokevirtual   #721 <Method byte[] o.in.c()>
	//*  36   98:astore_3        
	//*  37   99:aload_0         
	//*  38  100:getfield        #137 <Field jy A>
	//*  39  103:aload_3         
	//*  40  104:aload_0         
	//*  41  105:getfield        #83  <Field Context g>
	//*  42  108:invokevirtual   #724 <Method String jy.e(byte[], Context)>
	//*  43  111:astore_3        
	//*  44  112:aload_0         
	//*  45  113:invokevirtual   #411 <Method boolean b()>
	//*  46  116:ifeq            185
	//*  47  119:aload_3         
	//*  48  120:invokestatic    #370 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  49  123:ifne            157
	//*  50  126:aload_3         
	//*  51  127:ldc2            #726 <String "true">
	//*  52  130:invokevirtual   #364 <Method boolean String.equals(Object)>
	//*  53  133:ifeq            157
	//*  54  136:aload_0         
	//*  55  137:getfield        #145 <Field kk I>
	//*  56  140:aload_0         
	//*  57  141:getfield        #717 <Field in h>
	//*  58  144:aload_0         
	//*  59  145:iconst_1        
	//*  60  146:iload_1         
	//*  61  147:iconst_1        
	//*  62  148:invokespecial   #709 <Method String a(int, int, int)>
	//*  63  151:invokevirtual   #712 <Method void kk.b(in, String)>
	//*  64  154:goto            185
	//*  65  157:aload_0         
	//*  66  158:aload_0         
	//*  67  159:getfield        #169 <Field int k>
	//*  68  162:iconst_1        
	//*  69  163:iadd            
	//*  70  164:putfield        #169 <Field int k>
	//*  71  167:aload_0         
	//*  72  168:getfield        #145 <Field kk I>
	//*  73  171:aload_0         
	//*  74  172:getfield        #717 <Field in h>
	//*  75  175:aload_0         
	//*  76  176:iconst_1        
	//*  77  177:iload_1         
	//*  78  178:iconst_0        
	//*  79  179:invokespecial   #709 <Method String a(int, int, int)>
	//*  80  182:invokevirtual   #712 <Method void kk.b(in, String)>
	//*  81  185:aload_0         
	//*  82  186:invokespecial   #417 <Method void y()>
	//*  83  189:aload_0         
	//*  84  190:invokevirtual   #411 <Method boolean b()>
	//*  85  193:ifeq            213
	//*  86  196:aload_0         
	//*  87  197:getfield        #145 <Field kk I>
	//*  88  200:invokevirtual   #415 <Method int kk.g()>
	//*  89  203:ifne            213
	//*  90  206:aload_0         
	//*  91  207:invokespecial   #728 <Method void w()>
	//*  92  210:goto            225
	//*  93  213:aload_0         
	//*  94  214:getfield        #169 <Field int k>
	//*  95  217:iconst_3        
	//*  96  218:icmplt          225
	//*  97  221:aload_0         
	//*  98  222:invokespecial   #728 <Method void w()>
	//*  99  225:return          
		catch(Throwable throwable)
	//* 100  226:astore_3        
		{
			throwable.printStackTrace();
	//  101  227:aload_3         
	//  102  228:invokevirtual   #437 <Method void Throwable.printStackTrace()>
			return;
	//  103  231:return          
		}
		j1 = 0x42fffff;
		switch(i1)
		{
		default:
			break MISSING_BLOCK_LABEL_232;

		case 0: // '\0'
			break MISSING_BLOCK_LABEL_237;

		case 1: // '\001'
			break MISSING_BLOCK_LABEL_244;

		case 2: // '\002'
			break;
		}
		if(!l())
			i1 = 0x282fffff;
		else
	//* 104  232:iload_2         
	//* 105  233:istore_1        
	//* 106  234:goto            58
	//* 107  237:ldc2            #704 <Int 0x42fffff>
	//* 108  240:istore_1        
	//* 109  241:goto            58
	//* 110  244:ldc2            #707 <Int 0x282fffff>
	//* 111  247:istore_1        
	//* 112  248:goto            58
			i1 = 0x7c2fffff;
	//  113  251:ldc2            #729 <Int 0x7c2fffff>
	//  114  254:istore_1        
		I.b(((in) (null)), a(1, i1, 1));
		h = I.d();
		if(h == null)
			break MISSING_BLOCK_LABEL_185;
		abyte0 = h.c();
		s1 = A.e(abyte0, g);
		if(!b())
			break MISSING_BLOCK_LABEL_185;
		if(!TextUtils.isEmpty(((CharSequence) (s1))) && s1.equals("true"))
		{
			I.b(h, a(1, i1, 1));
			break MISSING_BLOCK_LABEL_185;
		}
		k = k + 1;
		I.b(h, a(1, i1, 0));
		y();
		if(b() && I.g() == 0)
		{
			w();
			break MISSING_BLOCK_LABEL_225;
		}
		if(k >= 3)
			w();
		return;
		i1 = j1;
		continue;
		i1 = 0x42fffff;
		continue;
label0:
		{
			for(i1 = 0x282fffff; true;)
				break MISSING_BLOCK_LABEL_58;

			break label0;
		}
	//* 115  255:goto            58
	}

	private void d(CellLocation celllocation)
	{
		p.clear();
	//    0    0:aload_0         
	//    1    1:getfield        #96  <Field List p>
	//    2    4:invokeinterface #306 <Method void List.clear()>
		if(o.ke.d() < 5)
	//*   3    9:invokestatic    #731 <Method int o.ke.d()>
	//*   4   12:iconst_5        
	//*   5   13:icmpge          17
			return;
	//    6   16:return          
		celllocation = ((CellLocation) ((CdmaCellLocation)celllocation));
	//    7   17:aload_1         
	//    8   18:checkcast       #677 <Class CdmaCellLocation>
	//    9   21:astore_1        
		if(((CdmaCellLocation) (celllocation)).getSystemId() <= 0)
	//*  10   22:aload_1         
	//*  11   23:invokevirtual   #733 <Method int CdmaCellLocation.getSystemId()>
	//*  12   26:ifgt            49
		{
			f = 9;
	//   13   29:aload_0         
	//   14   30:bipush          9
	//   15   32:putfield        #85  <Field int f>
			ke.b(new Object[] {
				"cdma illegal"
			});
	//   16   35:iconst_1        
	//   17   36:anewarray       Object[]
	//   18   39:dup             
	//   19   40:iconst_0        
	//   20   41:ldc2            #735 <String "cdma illegal">
	//   21   44:aastore         
	//   22   45:invokestatic    #738 <Method void ke.b(Object[])>
			return;
	//   23   48:return          
		}
		if(((CdmaCellLocation) (celllocation)).getNetworkId() < 0)
	//*  24   49:aload_1         
	//*  25   50:invokevirtual   #740 <Method int CdmaCellLocation.getNetworkId()>
	//*  26   53:ifge            76
		{
			f = 9;
	//   27   56:aload_0         
	//   28   57:bipush          9
	//   29   59:putfield        #85  <Field int f>
			ke.b(new Object[] {
				"cdma illegal"
			});
	//   30   62:iconst_1        
	//   31   63:anewarray       Object[]
	//   32   66:dup             
	//   33   67:iconst_0        
	//   34   68:ldc2            #735 <String "cdma illegal">
	//   35   71:aastore         
	//   36   72:invokestatic    #738 <Method void ke.b(Object[])>
			return;
	//   37   75:return          
		}
		if(((CdmaCellLocation) (celllocation)).getBaseStationId() < 0)
	//*  38   76:aload_1         
	//*  39   77:invokevirtual   #742 <Method int CdmaCellLocation.getBaseStationId()>
	//*  40   80:ifge            103
		{
			f = 9;
	//   41   83:aload_0         
	//   42   84:bipush          9
	//   43   86:putfield        #85  <Field int f>
			ke.b(new Object[] {
				"cdma illegal"
			});
	//   44   89:iconst_1        
	//   45   90:anewarray       Object[]
	//   46   93:dup             
	//   47   94:iconst_0        
	//   48   95:ldc2            #735 <String "cdma illegal">
	//   49   98:aastore         
	//   50   99:invokestatic    #738 <Method void ke.b(Object[])>
			return;
	//   51  102:return          
		}
		try
		{
			f = 2;
	//   52  103:aload_0         
	//   53  104:iconst_2        
	//   54  105:putfield        #85  <Field int f>
			String as[] = o.ke.a(m);
	//   55  108:aload_0         
	//   56  109:getfield        #91  <Field TelephonyManager m>
	//   57  112:invokestatic    #396 <Method String[] o.ke.a(TelephonyManager)>
	//   58  115:astore_2        
			jr jr1 = new jr();
	//   59  116:new             #224 <Class jr>
	//   60  119:dup             
	//   61  120:invokespecial   #393 <Method void jr()>
	//   62  123:astore_3        
			jr1.d = as[0];
	//   63  124:aload_3         
	//   64  125:aload_2         
	//   65  126:iconst_0        
	//   66  127:aaload          
	//   67  128:putfield        #398 <Field String o.jr.d>
			jr1.e = as[1];
	//   68  131:aload_3         
	//   69  132:aload_2         
	//   70  133:iconst_1        
	//   71  134:aaload          
	//   72  135:putfield        #400 <Field String jr.e>
			jr1.i = ((CdmaCellLocation) (celllocation)).getSystemId();
	//   73  138:aload_3         
	//   74  139:aload_1         
	//   75  140:invokevirtual   #733 <Method int CdmaCellLocation.getSystemId()>
	//   76  143:putfield        #592 <Field int jr.i>
			jr1.h = ((CdmaCellLocation) (celllocation)).getNetworkId();
	//   77  146:aload_3         
	//   78  147:aload_1         
	//   79  148:invokevirtual   #740 <Method int CdmaCellLocation.getNetworkId()>
	//   80  151:putfield        #598 <Field int jr.h>
			jr1.k = ((CdmaCellLocation) (celllocation)).getBaseStationId();
	//   81  154:aload_3         
	//   82  155:aload_1         
	//   83  156:invokevirtual   #742 <Method int CdmaCellLocation.getBaseStationId()>
	//   84  159:putfield        #603 <Field int jr.k>
			jr1.g = r;
	//   85  162:aload_3         
	//   86  163:aload_0         
	//   87  164:getfield        #109 <Field int r>
	//   88  167:putfield        #226 <Field int jr.g>
			jr1.b = ((CdmaCellLocation) (celllocation)).getBaseStationLatitude();
	//   89  170:aload_3         
	//   90  171:aload_1         
	//   91  172:invokevirtual   #745 <Method int CdmaCellLocation.getBaseStationLatitude()>
	//   92  175:putfield        #608 <Field int jr.b>
			jr1.f = ((CdmaCellLocation) (celllocation)).getBaseStationLongitude();
	//   93  178:aload_3         
	//   94  179:aload_1         
	//   95  180:invokevirtual   #748 <Method int CdmaCellLocation.getBaseStationLongitude()>
	//   96  183:putfield        #606 <Field int jr.f>
			p.add(((Object) (jr1)));
	//   97  186:aload_0         
	//   98  187:getfield        #96  <Field List p>
	//   99  190:aload_3         
	//  100  191:invokeinterface #334 <Method boolean List.add(Object)>
	//  101  196:pop             
			return;
	//  102  197:return          
		}
		// Misplaced declaration of an exception variable
		catch(CellLocation celllocation)
	//* 103  198:astore_1        
		{
			((Throwable) (celllocation)).printStackTrace();
	//  104  199:aload_1         
	//  105  200:invokevirtual   #437 <Method void Throwable.printStackTrace()>
		}
		return;
	//  106  203:return          
	}

	static int e(jf jf1)
	{
		return jf1.f;
	//    0    0:aload_0         
	//    1    1:getfield        #85  <Field int f>
	//    2    4:ireturn         
	}

	static long e(jf jf1, long l1)
	{
		jf1.D = l1;
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:putfield        #126 <Field long D>
		return l1;
	//    3    5:lload_1         
	//    4    6:lreturn         
	}

	private jr e(NeighboringCellInfo neighboringcellinfo)
	{
		if(o.ke.d() < 5)
	//*   0    0:invokestatic    #731 <Method int o.ke.d()>
	//*   1    3:iconst_5        
	//*   2    4:icmpge          9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		jr jr1;
		try
		{
			jr1 = new jr();
	//    5    9:new             #224 <Class jr>
	//    6   12:dup             
	//    7   13:invokespecial   #393 <Method void jr()>
	//    8   16:astore_2        
			String as[] = o.ke.a(m);
	//    9   17:aload_0         
	//   10   18:getfield        #91  <Field TelephonyManager m>
	//   11   21:invokestatic    #396 <Method String[] o.ke.a(TelephonyManager)>
	//   12   24:astore_3        
			jr1.d = as[0];
	//   13   25:aload_2         
	//   14   26:aload_3         
	//   15   27:iconst_0        
	//   16   28:aaload          
	//   17   29:putfield        #398 <Field String o.jr.d>
			jr1.e = as[1];
	//   18   32:aload_2         
	//   19   33:aload_3         
	//   20   34:iconst_1        
	//   21   35:aaload          
	//   22   36:putfield        #400 <Field String jr.e>
			jr1.c = neighboringcellinfo.getLac();
	//   23   39:aload_2         
	//   24   40:aload_1         
	//   25   41:invokevirtual   #753 <Method int NeighboringCellInfo.getLac()>
	//   26   44:putfield        #401 <Field int o.jr.c>
			jr1.a = neighboringcellinfo.getCid();
	//   27   47:aload_2         
	//   28   48:aload_1         
	//   29   49:invokevirtual   #754 <Method int NeighboringCellInfo.getCid()>
	//   30   52:putfield        #403 <Field int o.jr.a>
			jr1.g = ke.b(neighboringcellinfo.getRssi());
	//   31   55:aload_2         
	//   32   56:aload_1         
	//   33   57:invokevirtual   #755 <Method int NeighboringCellInfo.getRssi()>
	//   34   60:invokestatic    #758 <Method int ke.b(int)>
	//   35   63:putfield        #226 <Field int jr.g>
		}
	//*  36   66:aload_2         
	//*  37   67:areturn         
		// Misplaced declaration of an exception variable
		catch(NeighboringCellInfo neighboringcellinfo)
	//*  38   68:astore_1        
		{
			((Throwable) (neighboringcellinfo)).printStackTrace();
	//   39   69:aload_1         
	//   40   70:invokevirtual   #437 <Method void Throwable.printStackTrace()>
			return null;
	//   41   73:aconst_null     
	//   42   74:areturn         
		}
		return jr1;
	}

	private jt e(byte abyte0[], boolean flag)
		throws Exception
	{
		if(g == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #83  <Field Context g>
	//*   2    4:ifnonnull       9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		ju ju1 = new ju();
	//    5    9:new             #763 <Class ju>
	//    6   12:dup             
	//    7   13:invokespecial   #764 <Method void ju()>
	//    8   16:astore_3        
		ke.b();
	//    9   17:invokestatic    #407 <Method long ke.b()>
	//   10   20:pop2            
		abyte0 = ((byte []) (A.a(abyte0, g, y)));
	//   11   21:aload_0         
	//   12   22:getfield        #137 <Field jy A>
	//   13   25:aload_1         
	//   14   26:aload_0         
	//   15   27:getfield        #83  <Field Context g>
	//   16   30:aload_0         
	//   17   31:getfield        #118 <Field JSONObject y>
	//   18   34:invokevirtual   #767 <Method String o.jy.a(byte[], Context, JSONObject)>
	//   19   37:astore_1        
		ke.b();
	//   20   38:invokestatic    #407 <Method long ke.b()>
	//   21   41:pop2            
		try
		{
			com.amap.api.location.core.d.a(((String) (abyte0)));
	//   22   42:aload_1         
	//   23   43:invokestatic    #772 <Method void d.a(String)>
		}
	//*  24   46:goto            54
		// Misplaced declaration of an exception variable
		catch(byte abyte0[])
	//*  25   49:astore_1        
		{
			throw abyte0;
	//   26   50:aload_1         
	//   27   51:athrow          
		}
		catch(Exception exception) { }
	//   28   52:astore          4
		abyte0 = ((byte []) (ju1.c(((String) (abyte0)))));
	//   29   54:aload_3         
	//   30   55:aload_1         
	//   31   56:invokevirtual   #775 <Method jt o.ju.c(String)>
	//   32   59:astore_1        
		if(!ke.e(((jt) (abyte0))))
	//*  33   60:aload_1         
	//*  34   61:invokestatic    #778 <Method boolean ke.e(jt)>
	//*  35   64:ifne            78
		{
			throw new AMapLocException("\u672A\u77E5\u7684\u9519\u8BEF");
	//   36   67:new             #761 <Class AMapLocException>
	//   37   70:dup             
	//   38   71:ldc2            #780 <String "\u672A\u77E5\u7684\u9519\u8BEF">
	//   39   74:invokespecial   #782 <Method void AMapLocException(String)>
	//   40   77:athrow          
		} else
		{
			((jt) (abyte0)).u();
	//   41   78:aload_1         
	//   42   79:invokevirtual   #785 <Method JSONObject jt.u()>
	//   43   82:pop             
			return ((jt) (abyte0));
	//   44   83:aload_1         
	//   45   84:areturn         
		}
	}

	private void e(CellLocation celllocation)
	{
		if(p == null || celllocation == null || m == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #96  <Field List p>
	//*   2    4:ifnull          18
	//*   3    7:aload_1         
	//*   4    8:ifnull          18
	//*   5   11:aload_0         
	//*   6   12:getfield        #91  <Field TelephonyManager m>
	//*   7   15:ifnonnull       19
			return;
	//    8   18:return          
		p.clear();
	//    9   19:aload_0         
	//   10   20:getfield        #96  <Field List p>
	//   11   23:invokeinterface #306 <Method void List.clear()>
		boolean flag = true;
	//   12   28:iconst_1        
	//   13   29:istore_2        
		GsmCellLocation gsmcelllocation = (GsmCellLocation)celllocation;
	//   14   30:aload_1         
	//   15   31:checkcast       #372 <Class GsmCellLocation>
	//   16   34:astore_3        
		if(gsmcelllocation.getLac() == -1)
	//*  17   35:aload_3         
	//*  18   36:invokevirtual   #375 <Method int GsmCellLocation.getLac()>
	//*  19   39:iconst_m1       
	//*  20   40:icmpne          48
			flag = false;
	//   21   43:iconst_0        
	//   22   44:istore_2        
		else
	//*  23   45:goto            117
		if(gsmcelllocation.getCid() == -1 || gsmcelllocation.getCid() == 65535 || gsmcelllocation.getCid() >= 0xfffffff)
	//*  24   48:aload_3         
	//*  25   49:invokevirtual   #379 <Method int GsmCellLocation.getCid()>
	//*  26   52:iconst_m1       
	//*  27   53:icmpeq          76
	//*  28   56:aload_3         
	//*  29   57:invokevirtual   #379 <Method int GsmCellLocation.getCid()>
	//*  30   60:ldc2            #376 <Int 65535>
	//*  31   63:icmpeq          76
	//*  32   66:aload_3         
	//*  33   67:invokevirtual   #379 <Method int GsmCellLocation.getCid()>
	//*  34   70:ldc2            #380 <Int 0xfffffff>
	//*  35   73:icmplt          81
			flag = false;
	//   36   76:iconst_0        
	//   37   77:istore_2        
		else
	//*  38   78:goto            117
		if(gsmcelllocation.getLac() == 0)
	//*  39   81:aload_3         
	//*  40   82:invokevirtual   #375 <Method int GsmCellLocation.getLac()>
	//*  41   85:ifne            93
			flag = false;
	//   42   88:iconst_0        
	//   43   89:istore_2        
		else
	//*  44   90:goto            117
		if(gsmcelllocation.getLac() > 65535)
	//*  45   93:aload_3         
	//*  46   94:invokevirtual   #375 <Method int GsmCellLocation.getLac()>
	//*  47   97:ldc2            #376 <Int 65535>
	//*  48  100:icmple          108
			flag = false;
	//   49  103:iconst_0        
	//   50  104:istore_2        
		else
	//*  51  105:goto            117
		if(gsmcelllocation.getCid() == 0)
	//*  52  108:aload_3         
	//*  53  109:invokevirtual   #379 <Method int GsmCellLocation.getCid()>
	//*  54  112:ifne            117
			flag = false;
	//   55  115:iconst_0        
	//   56  116:istore_2        
		if(!flag)
	//*  57  117:iload_2         
	//*  58  118:ifne            141
		{
			f = 9;
	//   59  121:aload_0         
	//   60  122:bipush          9
	//   61  124:putfield        #85  <Field int f>
			ke.b(new Object[] {
				"case 2,gsm illegal"
			});
	//   62  127:iconst_1        
	//   63  128:anewarray       Object[]
	//   64  131:dup             
	//   65  132:iconst_0        
	//   66  133:ldc2            #787 <String "case 2,gsm illegal">
	//   67  136:aastore         
	//   68  137:invokestatic    #738 <Method void ke.b(Object[])>
			return;
	//   69  140:return          
		}
		f = 1;
	//   70  141:aload_0         
	//   71  142:iconst_1        
	//   72  143:putfield        #85  <Field int f>
		gsmcelllocation = null;
	//   73  146:aconst_null     
	//   74  147:astore_3        
		p.add(((Object) (c(celllocation))));
	//   75  148:aload_0         
	//   76  149:getfield        #96  <Field List p>
	//   77  152:aload_0         
	//   78  153:aload_1         
	//   79  154:invokespecial   #789 <Method jr c(CellLocation)>
	//   80  157:invokeinterface #334 <Method boolean List.add(Object)>
	//   81  162:pop             
		celllocation = ((CellLocation) (gsmcelllocation));
	//   82  163:aload_3         
	//   83  164:astore_1        
		if(m != null)
	//*  84  165:aload_0         
	//*  85  166:getfield        #91  <Field TelephonyManager m>
	//*  86  169:ifnull          180
			celllocation = ((CellLocation) (m.getNeighboringCellInfo()));
	//   87  172:aload_0         
	//   88  173:getfield        #91  <Field TelephonyManager m>
	//   89  176:invokevirtual   #793 <Method List TelephonyManager.getNeighboringCellInfo()>
	//   90  179:astore_1        
		if(celllocation == null)
	//*  91  180:aload_1         
	//*  92  181:ifnonnull       185
			return;
	//   93  184:return          
		celllocation = ((CellLocation) (((List) (celllocation)).iterator()));
	//   94  185:aload_1         
	//   95  186:invokeinterface #794 <Method Iterator List.iterator()>
	//   96  191:astore_1        
		do
		{
			if(!((Iterator) (celllocation)).hasNext())
				break;
	//   97  192:aload_1         
	//   98  193:invokeinterface #321 <Method boolean Iterator.hasNext()>
	//   99  198:ifeq            347
			Object obj = ((Object) ((NeighboringCellInfo)((Iterator) (celllocation)).next()));
	//  100  201:aload_1         
	//  101  202:invokeinterface #325 <Method Object Iterator.next()>
	//  102  207:checkcast       #752 <Class NeighboringCellInfo>
	//  103  210:astore_3        
			if(((NeighboringCellInfo) (obj)).getCid() != -1)
	//* 104  211:aload_3         
	//* 105  212:invokevirtual   #754 <Method int NeighboringCellInfo.getCid()>
	//* 106  215:iconst_m1       
	//* 107  216:icmpne          222
	//* 108  219:goto            192
			{
				boolean flag1 = true;
	//  109  222:iconst_1        
	//  110  223:istore_2        
				if(((NeighboringCellInfo) (obj)).getLac() == -1)
	//* 111  224:aload_3         
	//* 112  225:invokevirtual   #753 <Method int NeighboringCellInfo.getLac()>
	//* 113  228:iconst_m1       
	//* 114  229:icmpne          237
					flag1 = false;
	//  115  232:iconst_0        
	//  116  233:istore_2        
				else
	//* 117  234:goto            316
				if(((NeighboringCellInfo) (obj)).getLac() == 0)
	//* 118  237:aload_3         
	//* 119  238:invokevirtual   #753 <Method int NeighboringCellInfo.getLac()>
	//* 120  241:ifne            249
					flag1 = false;
	//  121  244:iconst_0        
	//  122  245:istore_2        
				else
	//* 123  246:goto            316
				if(((NeighboringCellInfo) (obj)).getLac() > 65535)
	//* 124  249:aload_3         
	//* 125  250:invokevirtual   #753 <Method int NeighboringCellInfo.getLac()>
	//* 126  253:ldc2            #376 <Int 65535>
	//* 127  256:icmple          264
					flag1 = false;
	//  128  259:iconst_0        
	//  129  260:istore_2        
				else
	//* 130  261:goto            316
				if(((NeighboringCellInfo) (obj)).getCid() == -1)
	//* 131  264:aload_3         
	//* 132  265:invokevirtual   #754 <Method int NeighboringCellInfo.getCid()>
	//* 133  268:iconst_m1       
	//* 134  269:icmpne          277
					flag1 = false;
	//  135  272:iconst_0        
	//  136  273:istore_2        
				else
	//* 137  274:goto            316
				if(((NeighboringCellInfo) (obj)).getCid() == 0)
	//* 138  277:aload_3         
	//* 139  278:invokevirtual   #754 <Method int NeighboringCellInfo.getCid()>
	//* 140  281:ifne            289
					flag1 = false;
	//  141  284:iconst_0        
	//  142  285:istore_2        
				else
	//* 143  286:goto            316
				if(((NeighboringCellInfo) (obj)).getCid() == 65535)
	//* 144  289:aload_3         
	//* 145  290:invokevirtual   #754 <Method int NeighboringCellInfo.getCid()>
	//* 146  293:ldc2            #376 <Int 65535>
	//* 147  296:icmpne          304
					flag1 = false;
	//  148  299:iconst_0        
	//  149  300:istore_2        
				else
	//* 150  301:goto            316
				if(((NeighboringCellInfo) (obj)).getCid() >= 0xfffffff)
	//* 151  304:aload_3         
	//* 152  305:invokevirtual   #754 <Method int NeighboringCellInfo.getCid()>
	//* 153  308:ldc2            #380 <Int 0xfffffff>
	//* 154  311:icmplt          316
					flag1 = false;
	//  155  314:iconst_0        
	//  156  315:istore_2        
				if(flag1)
	//* 157  316:iload_2         
	//* 158  317:ifne            323
	//* 159  320:goto            192
				{
					obj = ((Object) (e(((NeighboringCellInfo) (obj)))));
	//  160  323:aload_0         
	//  161  324:aload_3         
	//  162  325:invokespecial   #796 <Method jr e(NeighboringCellInfo)>
	//  163  328:astore_3        
					if(obj != null)
	//* 164  329:aload_3         
	//* 165  330:ifnull          344
						p.add(obj);
	//  166  333:aload_0         
	//  167  334:getfield        #96  <Field List p>
	//  168  337:aload_3         
	//  169  338:invokeinterface #334 <Method boolean List.add(Object)>
	//  170  343:pop             
				}
			}
		} while(true);
	//  171  344:goto            192
	//  172  347:return          
	}

	static void e(jf jf1, int i1)
	{
		jf1.d(i1);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #798 <Method void d(int)>
	//    3    5:return          
	}

	private boolean e(ScanResult scanresult)
	{
		boolean flag;
		flag = true;
	//    0    0:iconst_1        
	//    1    1:istore_2        
		if(scanresult == null)
			break MISSING_BLOCK_LABEL_40;
	//    2    2:aload_1         
	//    3    3:ifnull          40
		if(!TextUtils.isEmpty(((CharSequence) (scanresult.BSSID))))
	//*   4    6:aload_1         
	//*   5    7:getfield        #625 <Field String ScanResult.BSSID>
	//*   6   10:invokestatic    #370 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   7   13:ifeq            19
	//*   8   16:goto            40
		{
			boolean flag1;
			try
			{
				flag1 = scanresult.BSSID.equals("00:00:00:00:00:00");
	//    9   19:aload_1         
	//   10   20:getfield        #625 <Field String ScanResult.BSSID>
	//   11   23:ldc1            #141 <String "00:00:00:00:00:00">
	//   12   25:invokevirtual   #364 <Method boolean String.equals(Object)>
	//   13   28:istore_3        
			}
	//*  14   29:iload_3         
	//*  15   30:ifeq            35
	//*  16   33:iconst_0        
	//*  17   34:istore_2        
	//*  18   35:iload_2         
	//*  19   36:ireturn         
			// Misplaced declaration of an exception variable
			catch(ScanResult scanresult)
	//*  20   37:astore_1        
			{
				return true;
	//   21   38:iconst_1        
	//   22   39:ireturn         
			}
			if(flag1)
				flag = false;
			return flag;
		}
		return false;
	//   23   40:iconst_0        
	//   24   41:ireturn         
	}

	private void f()
	{
		try
		{
			CellLocation.requestLocationUpdate();
	//    0    0:invokestatic    #803 <Method void CellLocation.requestLocationUpdate()>
			return;
	//    1    3:return          
		}
		catch(Throwable throwable)
	//*   2    4:astore_1        
		{
			return;
	//    3    5:return          
		}
	}

	static boolean f(jf jf1)
	{
		return jf1.l();
	//    0    0:aload_0         
	//    1    1:invokespecial   #706 <Method boolean l()>
	//    2    4:ireturn         
	}

	private void g()
	{
		n = (ConnectivityManager)o.ke.a(g, "connectivity");
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #83  <Field Context g>
	//    3    5:ldc2            #805 <String "connectivity">
	//    4    8:invokestatic    #808 <Method Object o.ke.a(Context, String)>
	//    5   11:checkcast       #471 <Class ConnectivityManager>
	//    6   14:putfield        #87  <Field ConnectivityManager n>
		f();
	//    7   17:aload_0         
	//    8   18:invokespecial   #810 <Method void f()>
		j = ke.b();
	//    9   21:aload_0         
	//   10   22:invokestatic    #407 <Method long ke.b()>
	//   11   25:putfield        #128 <Field long j>
		m = (TelephonyManager)o.ke.a(g, "phone");
	//   12   28:aload_0         
	//   13   29:aload_0         
	//   14   30:getfield        #83  <Field Context g>
	//   15   33:ldc2            #812 <String "phone">
	//   16   36:invokestatic    #808 <Method Object o.ke.a(Context, String)>
	//   17   39:checkcast       #177 <Class TelephonyManager>
	//   18   42:putfield        #91  <Field TelephonyManager m>
		int i1 = 9;
	//   19   45:bipush          9
	//   20   47:istore_1        
		if(m != null)
	//*  21   48:aload_0         
	//*  22   49:getfield        #91  <Field TelephonyManager m>
	//*  23   52:ifnull          63
			i1 = m.getPhoneType();
	//   24   55:aload_0         
	//   25   56:getfield        #91  <Field TelephonyManager m>
	//   26   59:invokevirtual   #815 <Method int TelephonyManager.getPhoneType()>
	//   27   62:istore_1        
		switch(i1)
	//*  28   63:iload_1         
		{
	//*  29   64:lookupswitch    2: default 92
	//	               1: 95
	//	               2: 103
	//*  30   92:goto            111
		case 1: // '\001'
			f = 1;
	//   31   95:aload_0         
	//   32   96:iconst_1        
	//   33   97:putfield        #85  <Field int f>
			break;

	//*  34  100:goto            117
		case 2: // '\002'
			f = 2;
	//   35  103:aload_0         
	//   36  104:iconst_2        
	//   37  105:putfield        #85  <Field int f>
			break;

	//*  38  108:goto            117
		default:
			f = 9;
	//   39  111:aload_0         
	//   40  112:bipush          9
	//   41  114:putfield        #85  <Field int f>
			break;
		}
		t = ((PhoneStateListener) (new PhoneStateListener() {

			public void onCellLocationChanged(CellLocation celllocation)
			{
				if(celllocation == null)
			//*   0    0:aload_1         
			//*   1    1:ifnonnull       5
					return;
			//    2    4:return          
				boolean flag = o.jf.a(b);
			//    3    5:aload_0         
			//    4    6:getfield        #15  <Field jf b>
			//    5    9:invokestatic    #26  <Method boolean o.jf.a(jf)>
			//    6   12:istore_2        
				if(flag)
			//*   7   13:iload_2         
			//*   8   14:ifeq            18
					return;
			//    9   17:return          
				try
				{
					o.jf.a(b, celllocation);
			//   10   18:aload_0         
			//   11   19:getfield        #15  <Field jf b>
			//   12   22:aload_1         
			//   13   23:invokestatic    #29  <Method CellLocation o.jf.a(jf, CellLocation)>
			//   14   26:pop             
					o.jf.a(b, ke.b());
			//   15   27:aload_0         
			//   16   28:getfield        #15  <Field jf b>
			//   17   31:invokestatic    #34  <Method long ke.b()>
			//   18   34:invokestatic    #37  <Method long o.jf.a(jf, long)>
			//   19   37:pop2            
					jf.e(b, ke.b());
			//   20   38:aload_0         
			//   21   39:getfield        #15  <Field jf b>
			//   22   42:invokestatic    #34  <Method long ke.b()>
			//   23   45:invokestatic    #40  <Method long jf.e(jf, long)>
			//   24   48:pop2            
					return;
			//   25   49:return          
				}
				// Misplaced declaration of an exception variable
				catch(CellLocation celllocation)
			//*  26   50:astore_1        
				{
					((Throwable) (celllocation)).printStackTrace();
			//   27   51:aload_1         
			//   28   52:invokevirtual   #43  <Method void Throwable.printStackTrace()>
				}
				return;
			//   29   55:return          
			}

			public void onServiceStateChanged(ServiceState servicestate)
			{
				try
				{
					switch(servicestate.getState())
			//*   0    0:aload_1         
			//*   1    1:invokevirtual   #51  <Method int ServiceState.getState()>
					{
			//*   2    4:lookupswitch    1: default 53
			//			               1: 24
					case 1: // '\001'
						jf.b(b).clear();
			//    3   24:aload_0         
			//    4   25:getfield        #15  <Field jf b>
			//    5   28:invokestatic    #54  <Method List jf.b(jf)>
			//    6   31:invokeinterface #59  <Method void List.clear()>
						o.jf.c(b, -113);
			//    7   36:aload_0         
			//    8   37:getfield        #15  <Field jf b>
			//    9   40:bipush          -113
			//   10   42:invokestatic    #63  <Method int o.jf.c(jf, int)>
			//   11   45:pop             
						return;
			//   12   46:return          
					}
				}
				// Misplaced declaration of an exception variable
				catch(ServiceState servicestate)
			//*  13   47:astore_1        
				{
					((Throwable) (servicestate)).printStackTrace();
			//   14   48:aload_1         
			//   15   49:invokevirtual   #43  <Method void Throwable.printStackTrace()>
					return;
			//   16   52:return          
				}
			//   17   53:return          
			}

			public void onSignalStrengthChanged(int j1)
			{
				byte byte0 = -113;
			//    0    0:bipush          -113
			//    1    2:istore_2        
				jf.e(b);
			//    2    3:aload_0         
			//    3    4:getfield        #15  <Field jf b>
			//    4    7:invokestatic    #68  <Method int jf.e(jf)>
				JVM INSTR lookupswitch 2: default 64
			//			               1: 36
			//			               2: 44;
			//    5   10:lookupswitch    2: default 64
			//			               1: 36
			//			               2: 44
				   goto _L1 _L2 _L3
_L1:
				break MISSING_BLOCK_LABEL_64;
_L2:
				j1 = ke.b(j1);
			//    6   36:iload_1         
			//    7   37:invokestatic    #71  <Method int ke.b(int)>
			//    8   40:istore_1        
				break; /* Loop/switch isn't completed */
			//    9   41:goto            49
_L3:
				j1 = ke.b(j1);
			//   10   44:iload_1         
			//   11   45:invokestatic    #71  <Method int ke.b(int)>
			//   12   48:istore_1        
_L4:
				jf.b(b, j1);
			//   13   49:aload_0         
			//   14   50:getfield        #15  <Field jf b>
			//   15   53:iload_1         
			//   16   54:invokestatic    #74  <Method void jf.b(jf, int)>
				return;
			//   17   57:return          
				Throwable throwable;
				throwable;
			//   18   58:astore_3        
				throwable.printStackTrace();
			//   19   59:aload_3         
			//   20   60:invokevirtual   #43  <Method void Throwable.printStackTrace()>
				return;
			//   21   63:return          
				j1 = ((int) (byte0));
			//   22   64:iload_2         
			//   23   65:istore_1        
				  goto _L4
			//*  24   66:goto            49
			}

			public void onSignalStrengthsChanged(SignalStrength signalstrength)
			{
				int j1 = -113;
			//    0    0:bipush          -113
			//    1    2:istore_2        
				jf.e(b);
			//    2    3:aload_0         
			//    3    4:getfield        #15  <Field jf b>
			//    4    7:invokestatic    #68  <Method int jf.e(jf)>
				JVM INSTR lookupswitch 2: default 67
			//			               1: 36
			//			               2: 47;
			//    5   10:lookupswitch    2: default 67
			//			               1: 36
			//			               2: 47
				   goto _L1 _L2 _L3
_L1:
				break; /* Loop/switch isn't completed */
_L2:
				j1 = ke.b(signalstrength.getGsmSignalStrength());
			//    6   36:aload_1         
			//    7   37:invokevirtual   #81  <Method int SignalStrength.getGsmSignalStrength()>
			//    8   40:invokestatic    #71  <Method int ke.b(int)>
			//    9   43:istore_2        
				break; /* Loop/switch isn't completed */
			//   10   44:goto            52
_L3:
				j1 = signalstrength.getCdmaDbm();
			//   11   47:aload_1         
			//   12   48:invokevirtual   #84  <Method int SignalStrength.getCdmaDbm()>
			//   13   51:istore_2        
				jf.b(b, j1);
			//   14   52:aload_0         
			//   15   53:getfield        #15  <Field jf b>
			//   16   56:iload_2         
			//   17   57:invokestatic    #74  <Method void jf.b(jf, int)>
				return;
			//   18   60:return          
				signalstrength;
			//   19   61:astore_1        
				((Throwable) (signalstrength)).printStackTrace();
			//   20   62:aload_1         
			//   21   63:invokevirtual   #43  <Method void Throwable.printStackTrace()>
				return;
			//   22   66:return          
			//*  23   67:goto            52
			}

			final jf b;

			
			{
				b = jf.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #15  <Field jf b>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #17  <Method void PhoneStateListener()>
			//    5    9:return          
			}
		}
));
	//   42  117:aload_0         
	//   43  118:new             #8   <Class jf$3>
	//   44  121:dup             
	//   45  122:aload_0         
	//   46  123:invokespecial   #816 <Method void jf$3(jf)>
	//   47  126:putfield        #107 <Field PhoneStateListener t>
		if(o.ke.d() < 7)
	//*  48  129:invokestatic    #731 <Method int o.ke.d()>
	//*  49  132:bipush          7
	//*  50  134:icmpge          142
			i1 = 2;
	//   51  137:iconst_2        
	//   52  138:istore_1        
		else
	//*  53  139:goto            146
			i1 = 256;
	//   54  142:sipush          256
	//   55  145:istore_1        
		if(i1 == 0)
	//*  56  146:iload_1         
	//*  57  147:ifne            171
		{
			if(m != null)
	//*  58  150:aload_0         
	//*  59  151:getfield        #91  <Field TelephonyManager m>
	//*  60  154:ifnull          199
			{
				m.listen(t, 16);
	//   61  157:aload_0         
	//   62  158:getfield        #91  <Field TelephonyManager m>
	//   63  161:aload_0         
	//   64  162:getfield        #107 <Field PhoneStateListener t>
	//   65  165:bipush          16
	//   66  167:invokevirtual   #820 <Method void TelephonyManager.listen(PhoneStateListener, int)>
				return;
	//   67  170:return          
			}
		} else
		{
			try
			{
				if(m != null)
	//*  68  171:aload_0         
	//*  69  172:getfield        #91  <Field TelephonyManager m>
	//*  70  175:ifnull          193
					m.listen(t, i1 | 0x10);
	//   71  178:aload_0         
	//   72  179:getfield        #91  <Field TelephonyManager m>
	//   73  182:aload_0         
	//   74  183:getfield        #107 <Field PhoneStateListener t>
	//   75  186:iload_1         
	//   76  187:bipush          16
	//   77  189:ior             
	//   78  190:invokevirtual   #820 <Method void TelephonyManager.listen(PhoneStateListener, int)>
				return;
	//   79  193:return          
			}
			catch(SecurityException securityexception)
	//*  80  194:astore_2        
			{
				o.ke.c(((Throwable) (securityexception)));
	//   81  195:aload_2         
	//   82  196:invokestatic    #352 <Method void o.ke.c(Throwable)>
			}
		}
	//   83  199:return          
	}

	static void g(jf jf1)
	{
		jf1.o();
	//    0    0:aload_0         
	//    1    1:invokespecial   #489 <Method void o()>
	//    2    4:return          
	}

	private void h()
	{
		o = (WifiManager)o.ke.a(g, "wifi");
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #83  <Field Context g>
	//    3    5:ldc2            #822 <String "wifi">
	//    4    8:invokestatic    #808 <Method Object o.ke.a(Context, String)>
	//    5   11:checkcast       #345 <Class WifiManager>
	//    6   14:putfield        #89  <Field WifiManager o>
		IntentFilter intentfilter = new IntentFilter();
	//    7   17:new             #824 <Class IntentFilter>
	//    8   20:dup             
	//    9   21:invokespecial   #825 <Method void IntentFilter()>
	//   10   24:astore_1        
		intentfilter.addAction("android.net.wifi.WIFI_STATE_CHANGED");
	//   11   25:aload_1         
	//   12   26:ldc2            #827 <String "android.net.wifi.WIFI_STATE_CHANGED">
	//   13   29:invokevirtual   #830 <Method void IntentFilter.addAction(String)>
		intentfilter.addAction("android.net.wifi.SCAN_RESULTS");
	//   14   32:aload_1         
	//   15   33:ldc2            #832 <String "android.net.wifi.SCAN_RESULTS">
	//   16   36:invokevirtual   #830 <Method void IntentFilter.addAction(String)>
		intentfilter.addAction("android.intent.action.SCREEN_ON");
	//   17   39:aload_1         
	//   18   40:ldc2            #834 <String "android.intent.action.SCREEN_ON">
	//   19   43:invokevirtual   #830 <Method void IntentFilter.addAction(String)>
		intentfilter.addAction("android.intent.action.SCREEN_OFF");
	//   20   46:aload_1         
	//   21   47:ldc2            #836 <String "android.intent.action.SCREEN_OFF">
	//   22   50:invokevirtual   #830 <Method void IntentFilter.addAction(String)>
		intentfilter.addAction("android.intent.action.AIRPLANE_MODE");
	//   23   53:aload_1         
	//   24   54:ldc2            #838 <String "android.intent.action.AIRPLANE_MODE">
	//   25   57:invokevirtual   #830 <Method void IntentFilter.addAction(String)>
		intentfilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
	//   26   60:aload_1         
	//   27   61:ldc2            #840 <String "android.net.conn.CONNECTIVITY_CHANGE">
	//   28   64:invokevirtual   #830 <Method void IntentFilter.addAction(String)>
		g.registerReceiver(((BroadcastReceiver) (s)), intentfilter);
	//   29   67:aload_0         
	//   30   68:getfield        #83  <Field Context g>
	//   31   71:aload_0         
	//   32   72:getfield        #114 <Field jf$e s>
	//   33   75:aload_1         
	//   34   76:invokevirtual   #846 <Method Intent Context.registerReceiver(BroadcastReceiver, IntentFilter)>
	//   35   79:pop             
		t();
	//   36   80:aload_0         
	//   37   81:invokespecial   #848 <Method void t()>
	//   38   84:return          
	}

	static void h(jf jf1)
	{
		jf1.t();
	//    0    0:aload_0         
	//    1    1:invokespecial   #848 <Method void t()>
	//    2    4:return          
	}

	private String i()
	{
		v();
	//    0    0:aload_0         
	//    1    1:invokespecial   #850 <Method void v()>
		Object obj = "";
	//    2    4:ldc2            #448 <String "">
	//    3    7:astore_1        
		if(s())
	//*   4    8:aload_0         
	//*   5    9:invokespecial   #483 <Method boolean s()>
	//*   6   12:ifeq            29
			w = o.getConnectionInfo();
	//    7   15:aload_0         
	//    8   16:aload_0         
	//    9   17:getfield        #89  <Field WifiManager o>
	//   10   20:invokevirtual   #854 <Method WifiInfo WifiManager.getConnectionInfo()>
	//   11   23:putfield        #116 <Field WifiInfo w>
		else
	//*  12   26:goto            33
			o();
	//   13   29:aload_0         
	//   14   30:invokespecial   #489 <Method void o()>
		switch(f)
	//*  15   33:aload_0         
	//*  16   34:getfield        #85  <Field int f>
		{
	//*  17   37:lookupswitch    3: default 72
	//	               1: 76
	//	               2: 218
	//	               9: 375
		default:
			return "";
	//   18   72:ldc2            #448 <String "">
	//   19   75:areturn         

		case 1: // '\001'
			if(p.size() > 0)
	//*  20   76:aload_0         
	//*  21   77:getfield        #96  <Field List p>
	//*  22   80:invokeinterface #218 <Method int List.size()>
	//*  23   85:ifle            520
			{
				obj = ((Object) ((jr)p.get(0)));
	//   24   88:aload_0         
	//   25   89:getfield        #96  <Field List p>
	//   26   92:iconst_0        
	//   27   93:invokeinterface #222 <Method Object List.get(int)>
	//   28   98:checkcast       #224 <Class jr>
	//   29  101:astore_1        
				StringBuilder stringbuilder = new StringBuilder();
	//   30  102:new             #147 <Class StringBuilder>
	//   31  105:dup             
	//   32  106:invokespecial   #148 <Method void StringBuilder()>
	//   33  109:astore_2        
				stringbuilder.append(((jr) (obj)).d).append("#");
	//   34  110:aload_2         
	//   35  111:aload_1         
	//   36  112:getfield        #398 <Field String o.jr.d>
	//   37  115:invokevirtual   #534 <Method StringBuilder StringBuilder.append(String)>
	//   38  118:ldc2            #856 <String "#">
	//   39  121:invokevirtual   #534 <Method StringBuilder StringBuilder.append(String)>
	//   40  124:pop             
				stringbuilder.append(((jr) (obj)).e).append("#");
	//   41  125:aload_2         
	//   42  126:aload_1         
	//   43  127:getfield        #400 <Field String jr.e>
	//   44  130:invokevirtual   #534 <Method StringBuilder StringBuilder.append(String)>
	//   45  133:ldc2            #856 <String "#">
	//   46  136:invokevirtual   #534 <Method StringBuilder StringBuilder.append(String)>
	//   47  139:pop             
				stringbuilder.append(((jr) (obj)).c).append("#");
	//   48  140:aload_2         
	//   49  141:aload_1         
	//   50  142:getfield        #401 <Field int o.jr.c>
	//   51  145:invokevirtual   #578 <Method StringBuilder StringBuilder.append(int)>
	//   52  148:ldc2            #856 <String "#">
	//   53  151:invokevirtual   #534 <Method StringBuilder StringBuilder.append(String)>
	//   54  154:pop             
				stringbuilder.append(((jr) (obj)).a).append("#");
	//   55  155:aload_2         
	//   56  156:aload_1         
	//   57  157:getfield        #403 <Field int o.jr.a>
	//   58  160:invokevirtual   #578 <Method StringBuilder StringBuilder.append(int)>
	//   59  163:ldc2            #856 <String "#">
	//   60  166:invokevirtual   #534 <Method StringBuilder StringBuilder.append(String)>
	//   61  169:pop             
				stringbuilder.append("network").append("#");
	//   62  170:aload_2         
	//   63  171:ldc2            #858 <String "network">
	//   64  174:invokevirtual   #534 <Method StringBuilder StringBuilder.append(String)>
	//   65  177:ldc2            #856 <String "#">
	//   66  180:invokevirtual   #534 <Method StringBuilder StringBuilder.append(String)>
	//   67  183:pop             
				if(l.size() > 0)
	//*  68  184:aload_0         
	//*  69  185:getfield        #98  <Field List l>
	//*  70  188:invokeinterface #218 <Method int List.size()>
	//*  71  193:ifle            203
					obj = "cellwifi";
	//   72  196:ldc2            #860 <String "cellwifi">
	//   73  199:astore_1        
				else
	//*  74  200:goto            207
					obj = "cell";
	//   75  203:ldc2            #862 <String "cell">
	//   76  206:astore_1        
				stringbuilder.append(((String) (obj)));
	//   77  207:aload_2         
	//   78  208:aload_1         
	//   79  209:invokevirtual   #534 <Method StringBuilder StringBuilder.append(String)>
	//   80  212:pop             
				return stringbuilder.toString();
	//   81  213:aload_2         
	//   82  214:invokevirtual   #537 <Method String StringBuilder.toString()>
	//   83  217:areturn         
			}
			break;

		case 2: // '\002'
			if(p.size() <= 0)
				break;
	//   84  218:aload_0         
	//   85  219:getfield        #96  <Field List p>
	//   86  222:invokeinterface #218 <Method int List.size()>
	//   87  227:ifle            520
			obj = ((Object) ((jr)p.get(0)));
	//   88  230:aload_0         
	//   89  231:getfield        #96  <Field List p>
	//   90  234:iconst_0        
	//   91  235:invokeinterface #222 <Method Object List.get(int)>
	//   92  240:checkcast       #224 <Class jr>
	//   93  243:astore_1        
			StringBuilder stringbuilder1 = new StringBuilder();
	//   94  244:new             #147 <Class StringBuilder>
	//   95  247:dup             
	//   96  248:invokespecial   #148 <Method void StringBuilder()>
	//   97  251:astore_2        
			stringbuilder1.append(((jr) (obj)).d).append("#");
	//   98  252:aload_2         
	//   99  253:aload_1         
	//  100  254:getfield        #398 <Field String o.jr.d>
	//  101  257:invokevirtual   #534 <Method StringBuilder StringBuilder.append(String)>
	//  102  260:ldc2            #856 <String "#">
	//  103  263:invokevirtual   #534 <Method StringBuilder StringBuilder.append(String)>
	//  104  266:pop             
			stringbuilder1.append(((jr) (obj)).e).append("#");
	//  105  267:aload_2         
	//  106  268:aload_1         
	//  107  269:getfield        #400 <Field String jr.e>
	//  108  272:invokevirtual   #534 <Method StringBuilder StringBuilder.append(String)>
	//  109  275:ldc2            #856 <String "#">
	//  110  278:invokevirtual   #534 <Method StringBuilder StringBuilder.append(String)>
	//  111  281:pop             
			stringbuilder1.append(((jr) (obj)).i).append("#");
	//  112  282:aload_2         
	//  113  283:aload_1         
	//  114  284:getfield        #592 <Field int jr.i>
	//  115  287:invokevirtual   #578 <Method StringBuilder StringBuilder.append(int)>
	//  116  290:ldc2            #856 <String "#">
	//  117  293:invokevirtual   #534 <Method StringBuilder StringBuilder.append(String)>
	//  118  296:pop             
			stringbuilder1.append(((jr) (obj)).h).append("#");
	//  119  297:aload_2         
	//  120  298:aload_1         
	//  121  299:getfield        #598 <Field int jr.h>
	//  122  302:invokevirtual   #578 <Method StringBuilder StringBuilder.append(int)>
	//  123  305:ldc2            #856 <String "#">
	//  124  308:invokevirtual   #534 <Method StringBuilder StringBuilder.append(String)>
	//  125  311:pop             
			stringbuilder1.append(((jr) (obj)).k).append("#");
	//  126  312:aload_2         
	//  127  313:aload_1         
	//  128  314:getfield        #603 <Field int jr.k>
	//  129  317:invokevirtual   #578 <Method StringBuilder StringBuilder.append(int)>
	//  130  320:ldc2            #856 <String "#">
	//  131  323:invokevirtual   #534 <Method StringBuilder StringBuilder.append(String)>
	//  132  326:pop             
			stringbuilder1.append("network").append("#");
	//  133  327:aload_2         
	//  134  328:ldc2            #858 <String "network">
	//  135  331:invokevirtual   #534 <Method StringBuilder StringBuilder.append(String)>
	//  136  334:ldc2            #856 <String "#">
	//  137  337:invokevirtual   #534 <Method StringBuilder StringBuilder.append(String)>
	//  138  340:pop             
			if(l.size() > 0)
	//* 139  341:aload_0         
	//* 140  342:getfield        #98  <Field List l>
	//* 141  345:invokeinterface #218 <Method int List.size()>
	//* 142  350:ifle            360
				obj = "cellwifi";
	//  143  353:ldc2            #860 <String "cellwifi">
	//  144  356:astore_1        
			else
	//* 145  357:goto            364
				obj = "cell";
	//  146  360:ldc2            #862 <String "cell">
	//  147  363:astore_1        
			stringbuilder1.append(((String) (obj)));
	//  148  364:aload_2         
	//  149  365:aload_1         
	//  150  366:invokevirtual   #534 <Method StringBuilder StringBuilder.append(String)>
	//  151  369:pop             
			return stringbuilder1.toString();
	//  152  370:aload_2         
	//  153  371:invokevirtual   #537 <Method String StringBuilder.toString()>
	//  154  374:areturn         

		case 9: // '\t'
			String s1 = String.format("#%s#", new Object[] {
				"network"
			});
	//  155  375:ldc2            #864 <String "#%s#">
	//  156  378:iconst_1        
	//  157  379:anewarray       Object[]
	//  158  382:dup             
	//  159  383:iconst_0        
	//  160  384:ldc2            #858 <String "network">
	//  161  387:aastore         
	//  162  388:invokestatic    #868 <Method String String.format(String, Object[])>
	//  163  391:astore_2        
			if(l.size() == 1 && !b(w))
	//* 164  392:aload_0         
	//* 165  393:getfield        #98  <Field List l>
	//* 166  396:invokeinterface #218 <Method int List.size()>
	//* 167  401:iconst_1        
	//* 168  402:icmpne          418
	//* 169  405:aload_0         
	//* 170  406:aload_0         
	//* 171  407:getfield        #116 <Field WifiInfo w>
	//* 172  410:invokespecial   #485 <Method boolean b(WifiInfo)>
	//* 173  413:ifne            418
				return null;
	//  174  416:aconst_null     
	//  175  417:areturn         
			if(l.size() == 0)
	//* 176  418:aload_0         
	//* 177  419:getfield        #98  <Field List l>
	//* 178  422:invokeinterface #218 <Method int List.size()>
	//* 179  427:ifne            432
				return null;
	//  180  430:aconst_null     
	//  181  431:areturn         
			if(l.size() == 1 && b(w))
	//* 182  432:aload_0         
	//* 183  433:getfield        #98  <Field List l>
	//* 184  436:invokeinterface #218 <Method int List.size()>
	//* 185  441:iconst_1        
	//* 186  442:icmpne          499
	//* 187  445:aload_0         
	//* 188  446:aload_0         
	//* 189  447:getfield        #116 <Field WifiInfo w>
	//* 190  450:invokespecial   #485 <Method boolean b(WifiInfo)>
	//* 191  453:ifeq            499
			{
				ScanResult scanresult = (ScanResult)l.get(0);
	//  192  456:aload_0         
	//  193  457:getfield        #98  <Field List l>
	//  194  460:iconst_0        
	//  195  461:invokeinterface #222 <Method Object List.get(int)>
	//  196  466:checkcast       #258 <Class ScanResult>
	//  197  469:astore_3        
				obj = ((Object) (s1));
	//  198  470:aload_2         
	//  199  471:astore_1        
				if(scanresult != null)
	//* 200  472:aload_3         
	//* 201  473:ifnull          497
				{
					obj = ((Object) (s1));
	//  202  476:aload_2         
	//  203  477:astore_1        
					if(w.getBSSID().equals(((Object) (scanresult.BSSID))))
	//* 204  478:aload_0         
	//* 205  479:getfield        #116 <Field WifiInfo w>
	//* 206  482:invokevirtual   #358 <Method String WifiInfo.getBSSID()>
	//* 207  485:aload_3         
	//* 208  486:getfield        #625 <Field String ScanResult.BSSID>
	//* 209  489:invokevirtual   #364 <Method boolean String.equals(Object)>
	//* 210  492:ifeq            497
						obj = null;
	//  211  495:aconst_null     
	//  212  496:astore_1        
				}
				return ((String) (obj));
	//  213  497:aload_1         
	//  214  498:areturn         
			}
			obj = ((Object) ((new StringBuilder()).append(s1).append("wifi").toString()));
	//  215  499:new             #147 <Class StringBuilder>
	//  216  502:dup             
	//  217  503:invokespecial   #148 <Method void StringBuilder()>
	//  218  506:aload_2         
	//  219  507:invokevirtual   #534 <Method StringBuilder StringBuilder.append(String)>
	//  220  510:ldc2            #822 <String "wifi">
	//  221  513:invokevirtual   #534 <Method StringBuilder StringBuilder.append(String)>
	//  222  516:invokevirtual   #537 <Method String StringBuilder.toString()>
	//  223  519:astore_1        
			break;
		}
		return ((String) (obj));
	//  224  520:aload_1         
	//  225  521:areturn         
	}

	static void i(jf jf1)
	{
		jf1.f();
	//    0    0:aload_0         
	//    1    1:invokespecial   #810 <Method void f()>
	//    2    4:return          
	}

	private void j()
	{
		try
		{
			if(!d && com.amap.api.location.core.a.b() && e != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #156 <Field boolean d>
	//*   2    4:ifne            33
	//*   3    7:invokestatic    #871 <Method boolean a.b()>
	//*   4   10:ifeq            33
	//*   5   13:aload_0         
	//*   6   14:getfield        #873 <Field jp e>
	//*   7   17:ifnull          33
			{
				e.e();
	//    8   20:aload_0         
	//    9   21:getfield        #873 <Field jp e>
	//   10   24:invokevirtual   #877 <Method boolean jp.e()>
	//   11   27:pop             
				d = true;
	//   12   28:aload_0         
	//   13   29:iconst_1        
	//   14   30:putfield        #156 <Field boolean d>
			}
			return;
	//   15   33:return          
		}
		catch(Throwable throwable)
	//*  16   34:astore_1        
		{
			d = true;
	//   17   35:aload_0         
	//   18   36:iconst_1        
	//   19   37:putfield        #156 <Field boolean d>
		}
	//   20   40:return          
	}

	static int k(jf jf1)
	{
		return jf1.B;
	//    0    0:aload_0         
	//    1    1:getfield        #139 <Field int B>
	//    2    4:ireturn         
	}

	private StringBuilder k()
	{
		v();
	//    0    0:aload_0         
	//    1    1:invokespecial   #850 <Method void v()>
		StringBuilder stringbuilder = new StringBuilder(700);
	//    2    4:new             #147 <Class StringBuilder>
	//    3    7:dup             
	//    4    8:sipush          700
	//    5   11:invokespecial   #880 <Method void StringBuilder(int)>
	//    6   14:astore          6
		switch(f)
	//*   7   16:aload_0         
	//*   8   17:getfield        #85  <Field int f>
		{
	//*   9   20:lookupswitch    1: default 40
	//	               1: 43
	//*  10   40:goto            138
		case 1: // '\001'
			for(int i1 = 0; i1 < p.size(); i1++)
	//*  11   43:iconst_0        
	//*  12   44:istore_1        
	//*  13   45:iload_1         
	//*  14   46:aload_0         
	//*  15   47:getfield        #96  <Field List p>
	//*  16   50:invokeinterface #218 <Method int List.size()>
	//*  17   55:icmpge          138
				if(i1 != 0)
	//*  18   58:iload_1         
	//*  19   59:ifne            65
	//*  20   62:goto            131
				{
					jr jr1 = (jr)p.get(i1);
	//   21   65:aload_0         
	//   22   66:getfield        #96  <Field List p>
	//   23   69:iload_1         
	//   24   70:invokeinterface #222 <Method Object List.get(int)>
	//   25   75:checkcast       #224 <Class jr>
	//   26   78:astore          4
					stringbuilder.append("#").append(jr1.e);
	//   27   80:aload           6
	//   28   82:ldc2            #856 <String "#">
	//   29   85:invokevirtual   #534 <Method StringBuilder StringBuilder.append(String)>
	//   30   88:aload           4
	//   31   90:getfield        #400 <Field String jr.e>
	//   32   93:invokevirtual   #534 <Method StringBuilder StringBuilder.append(String)>
	//   33   96:pop             
					stringbuilder.append("|").append(jr1.c);
	//   34   97:aload           6
	//   35   99:ldc2            #882 <String "|">
	//   36  102:invokevirtual   #534 <Method StringBuilder StringBuilder.append(String)>
	//   37  105:aload           4
	//   38  107:getfield        #401 <Field int o.jr.c>
	//   39  110:invokevirtual   #578 <Method StringBuilder StringBuilder.append(int)>
	//   40  113:pop             
					stringbuilder.append("|").append(jr1.a);
	//   41  114:aload           6
	//   42  116:ldc2            #882 <String "|">
	//   43  119:invokevirtual   #534 <Method StringBuilder StringBuilder.append(String)>
	//   44  122:aload           4
	//   45  124:getfield        #403 <Field int o.jr.a>
	//   46  127:invokevirtual   #578 <Method StringBuilder StringBuilder.append(int)>
	//   47  130:pop             
				}

	//   48  131:iload_1         
	//   49  132:iconst_1        
	//   50  133:iadd            
	//   51  134:istore_1        
			break;
		}
	//*  52  135:goto            45
		if(H == null || H.equals("00:00:00:00:00:00"))
	//*  53  138:aload_0         
	//*  54  139:getfield        #143 <Field String H>
	//*  55  142:ifnull          157
	//*  56  145:aload_0         
	//*  57  146:getfield        #143 <Field String H>
	//*  58  149:ldc1            #141 <String "00:00:00:00:00:00">
	//*  59  151:invokevirtual   #364 <Method boolean String.equals(Object)>
	//*  60  154:ifeq            245
			if(w == null)
	//*  61  157:aload_0         
	//*  62  158:getfield        #116 <Field WifiInfo w>
	//*  63  161:ifnonnull       221
			{
				if(o != null)
	//*  64  164:aload_0         
	//*  65  165:getfield        #89  <Field WifiManager o>
	//*  66  168:ifnull          245
				{
					w = o.getConnectionInfo();
	//   67  171:aload_0         
	//   68  172:aload_0         
	//   69  173:getfield        #89  <Field WifiManager o>
	//   70  176:invokevirtual   #854 <Method WifiInfo WifiManager.getConnectionInfo()>
	//   71  179:putfield        #116 <Field WifiInfo w>
					if(w != null)
	//*  72  182:aload_0         
	//*  73  183:getfield        #116 <Field WifiInfo w>
	//*  74  186:ifnull          245
					{
						H = w.getMacAddress();
	//   75  189:aload_0         
	//   76  190:aload_0         
	//   77  191:getfield        #116 <Field WifiInfo w>
	//   78  194:invokevirtual   #885 <Method String WifiInfo.getMacAddress()>
	//   79  197:putfield        #143 <Field String H>
						if(H == null)
	//*  80  200:aload_0         
	//*  81  201:getfield        #143 <Field String H>
	//*  82  204:ifnonnull       213
							H = "00:00:00:00:00:00";
	//   83  207:aload_0         
	//   84  208:ldc1            #141 <String "00:00:00:00:00:00">
	//   85  210:putfield        #143 <Field String H>
						w = null;
	//   86  213:aload_0         
	//   87  214:aconst_null     
	//   88  215:putfield        #116 <Field WifiInfo w>
					}
				}
			} else
	//*  89  218:goto            245
			{
				H = w.getMacAddress();
	//   90  221:aload_0         
	//   91  222:aload_0         
	//   92  223:getfield        #116 <Field WifiInfo w>
	//   93  226:invokevirtual   #885 <Method String WifiInfo.getMacAddress()>
	//   94  229:putfield        #143 <Field String H>
				if(H == null)
	//*  95  232:aload_0         
	//*  96  233:getfield        #143 <Field String H>
	//*  97  236:ifnonnull       245
					H = "00:00:00:00:00:00";
	//   98  239:aload_0         
	//   99  240:ldc1            #141 <String "00:00:00:00:00:00">
	//  100  242:putfield        #143 <Field String H>
			}
		if(s())
	//* 101  245:aload_0         
	//* 102  246:invokespecial   #483 <Method boolean s()>
	//* 103  249:ifeq            424
		{
			String s1 = "";
	//  104  252:ldc2            #448 <String "">
	//  105  255:astore          4
			if(b(w))
	//* 106  257:aload_0         
	//* 107  258:aload_0         
	//* 108  259:getfield        #116 <Field WifiInfo w>
	//* 109  262:invokespecial   #485 <Method boolean b(WifiInfo)>
	//* 110  265:ifeq            277
				s1 = w.getBSSID();
	//  111  268:aload_0         
	//  112  269:getfield        #116 <Field WifiInfo w>
	//  113  272:invokevirtual   #358 <Method String WifiInfo.getBSSID()>
	//  114  275:astore          4
			boolean flag = false;
	//  115  277:iconst_0        
	//  116  278:istore_1        
			for(int j1 = 0; j1 < l.size();)
	//* 117  279:iconst_0        
	//* 118  280:istore_2        
	//* 119  281:iload_2         
	//* 120  282:aload_0         
	//* 121  283:getfield        #98  <Field List l>
	//* 122  286:invokeinterface #218 <Method int List.size()>
	//* 123  291:icmpge          386
			{
				Object obj = ((Object) ((ScanResult)l.get(j1)));
	//  124  294:aload_0         
	//  125  295:getfield        #98  <Field List l>
	//  126  298:iload_2         
	//  127  299:invokeinterface #222 <Method Object List.get(int)>
	//  128  304:checkcast       #258 <Class ScanResult>
	//  129  307:astore          5
				boolean flag1 = flag;
	//  130  309:iload_1         
	//  131  310:istore_3        
				if(e(((ScanResult) (obj))))
	//* 132  311:aload_0         
	//* 133  312:aload           5
	//* 134  314:invokespecial   #622 <Method boolean e(ScanResult)>
	//* 135  317:ifeq            377
				{
					String s2 = ((ScanResult) (obj)).BSSID;
	//  136  320:aload           5
	//  137  322:getfield        #625 <Field String ScanResult.BSSID>
	//  138  325:astore          7
					obj = "nb";
	//  139  327:ldc2            #887 <String "nb">
	//  140  330:astore          5
					if(s1.equals(((Object) (s2))))
	//* 141  332:aload           4
	//* 142  334:aload           7
	//* 143  336:invokevirtual   #364 <Method boolean String.equals(Object)>
	//* 144  339:ifeq            349
					{
						obj = "access";
	//  145  342:ldc2            #889 <String "access">
	//  146  345:astore          5
						flag = true;
	//  147  347:iconst_1        
	//  148  348:istore_1        
					}
					stringbuilder.append(String.format("#%s,%s", new Object[] {
						s2, obj
					}));
	//  149  349:aload           6
	//  150  351:ldc2            #891 <String "#%s,%s">
	//  151  354:iconst_2        
	//  152  355:anewarray       Object[]
	//  153  358:dup             
	//  154  359:iconst_0        
	//  155  360:aload           7
	//  156  362:aastore         
	//  157  363:dup             
	//  158  364:iconst_1        
	//  159  365:aload           5
	//  160  367:aastore         
	//  161  368:invokestatic    #868 <Method String String.format(String, Object[])>
	//  162  371:invokevirtual   #534 <Method StringBuilder StringBuilder.append(String)>
	//  163  374:pop             
					flag1 = flag;
	//  164  375:iload_1         
	//  165  376:istore_3        
				}
				j1++;
	//  166  377:iload_2         
	//  167  378:iconst_1        
	//  168  379:iadd            
	//  169  380:istore_2        
				flag = flag1;
	//  170  381:iload_3         
	//  171  382:istore_1        
			}

	//* 172  383:goto            281
			if(!flag && s1.length() > 0)
	//* 173  386:iload_1         
	//* 174  387:ifne            421
	//* 175  390:aload           4
	//* 176  392:invokevirtual   #892 <Method int String.length()>
	//* 177  395:ifle            421
			{
				stringbuilder.append("#").append(s1);
	//  178  398:aload           6
	//  179  400:ldc2            #856 <String "#">
	//  180  403:invokevirtual   #534 <Method StringBuilder StringBuilder.append(String)>
	//  181  406:aload           4
	//  182  408:invokevirtual   #534 <Method StringBuilder StringBuilder.append(String)>
	//  183  411:pop             
				stringbuilder.append(",access");
	//  184  412:aload           6
	//  185  414:ldc2            #894 <String ",access">
	//  186  417:invokevirtual   #534 <Method StringBuilder StringBuilder.append(String)>
	//  187  420:pop             
			}
		} else
	//* 188  421:goto            428
		{
			o();
	//  189  424:aload_0         
	//  190  425:invokespecial   #489 <Method void o()>
		}
		if(stringbuilder.length() > 0)
	//* 191  428:aload           6
	//* 192  430:invokevirtual   #561 <Method int StringBuilder.length()>
	//* 193  433:ifle            443
			stringbuilder.deleteCharAt(0);
	//  194  436:aload           6
	//  195  438:iconst_0        
	//  196  439:invokevirtual   #628 <Method StringBuilder StringBuilder.deleteCharAt(int)>
	//  197  442:pop             
		return stringbuilder;
	//  198  443:aload           6
	//  199  445:areturn         
	}

	private boolean l()
	{
		boolean flag1;
		android.net.NetworkInfo networkinfo;
		if(o == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #89  <Field WifiManager o>
	//*   2    4:ifnonnull       9
			return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		flag1 = false;
	//    5    9:iconst_0        
	//    6   10:istore_2        
		if(!s())
			break MISSING_BLOCK_LABEL_81;
	//    7   11:aload_0         
	//    8   12:invokespecial   #483 <Method boolean s()>
	//    9   15:ifeq            81
		networkinfo = null;
	//   10   18:aconst_null     
	//   11   19:astore          4
		if(n != null)
	//*  12   21:aload_0         
	//*  13   22:getfield        #87  <Field ConnectivityManager n>
	//*  14   25:ifnull          37
			networkinfo = n.getActiveNetworkInfo();
	//   15   28:aload_0         
	//   16   29:getfield        #87  <Field ConnectivityManager n>
	//   17   32:invokevirtual   #475 <Method android.net.NetworkInfo ConnectivityManager.getActiveNetworkInfo()>
	//   18   35:astore          4
		boolean flag = flag1;
	//   19   37:iload_2         
	//   20   38:istore_1        
		boolean flag2;
		if(jy.e(networkinfo) == -1)
			break MISSING_BLOCK_LABEL_68;
	//   21   39:aload           4
	//   22   41:invokestatic    #478 <Method int jy.e(android.net.NetworkInfo)>
	//   23   44:iconst_m1       
	//   24   45:icmpeq          68
		flag2 = b(o.getConnectionInfo());
	//   25   48:aload_0         
	//   26   49:aload_0         
	//   27   50:getfield        #89  <Field WifiManager o>
	//   28   53:invokevirtual   #854 <Method WifiInfo WifiManager.getConnectionInfo()>
	//   29   56:invokespecial   #485 <Method boolean b(WifiInfo)>
	//   30   59:istore_3        
		flag = flag1;
	//   31   60:iload_2         
	//   32   61:istore_1        
		if(flag2)
	//*  33   62:iload_3         
	//*  34   63:ifeq            68
			flag = true;
	//   35   66:iconst_1        
	//   36   67:istore_1        
		return flag;
	//   37   68:iload_1         
	//   38   69:ireturn         
		Object obj;
		obj;
	//   39   70:astore          4
		return false;
	//   40   72:iconst_0        
	//   41   73:ireturn         
		obj;
	//   42   74:astore          4
		((Throwable) (obj)).printStackTrace();
	//   43   76:aload           4
	//   44   78:invokevirtual   #437 <Method void Throwable.printStackTrace()>
		return false;
	//   45   81:iconst_0        
	//   46   82:ireturn         
	}

	private boolean m()
	{
		boolean flag = true;
	//    0    0:iconst_1        
	//    1    1:istore_1        
		if(z)
	//*   2    2:aload_0         
	//*   3    3:getfield        #124 <Field boolean z>
	//*   4    6:ifeq            11
			return false;
	//    5    9:iconst_0        
	//    6   10:ireturn         
		if(j == 0L)
	//*   7   11:aload_0         
	//*   8   12:getfield        #128 <Field long j>
	//*   9   15:lconst_0        
	//*  10   16:lcmp            
	//*  11   17:ifne            22
			return false;
	//   12   20:iconst_0        
	//   13   21:ireturn         
		if(ke.b() - j < jq.f)
	//*  14   22:invokestatic    #407 <Method long ke.b()>
	//*  15   25:aload_0         
	//*  16   26:getfield        #128 <Field long j>
	//*  17   29:lsub            
	//*  18   30:getstatic       #896 <Field long jq.f>
	//*  19   33:lcmp            
	//*  20   34:ifge            39
			flag = false;
	//   21   37:iconst_0        
	//   22   38:istore_1        
		return flag;
	//   23   39:iload_1         
	//   24   40:ireturn         
	}

	private boolean n()
	{
		boolean flag = true;
	//    0    0:iconst_1        
	//    1    1:istore_1        
		if(!s())
	//*   2    2:aload_0         
	//*   3    3:invokespecial   #483 <Method boolean s()>
	//*   4    6:ifne            11
			return false;
	//    5    9:iconst_0        
	//    6   10:ireturn         
		if(C == 0L)
	//*   7   11:aload_0         
	//*   8   12:getfield        #130 <Field long C>
	//*   9   15:lconst_0        
	//*  10   16:lcmp            
	//*  11   17:ifne            22
			return false;
	//   12   20:iconst_0        
	//   13   21:ireturn         
		if(ke.b() - C < jq.i)
	//*  14   22:invokestatic    #407 <Method long ke.b()>
	//*  15   25:aload_0         
	//*  16   26:getfield        #130 <Field long C>
	//*  17   29:lsub            
	//*  18   30:getstatic       #898 <Field long jq.i>
	//*  19   33:lcmp            
	//*  20   34:ifge            39
			flag = false;
	//   21   37:iconst_0        
	//   22   38:istore_1        
		return flag;
	//   23   39:iload_1         
	//   24   40:ireturn         
	}

	private void o()
	{
		l.clear();
	//    0    0:aload_0         
	//    1    1:getfield        #98  <Field List l>
	//    2    4:invokeinterface #306 <Method void List.clear()>
		w = null;
	//    3    9:aload_0         
	//    4   10:aconst_null     
	//    5   11:putfield        #116 <Field WifiInfo w>
	//    6   14:return          
	}

	static void p(jf jf1)
	{
		jf1.w();
	//    0    0:aload_0         
	//    1    1:invokespecial   #728 <Method void w()>
	//    2    4:return          
	}

	private byte[] p()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		byte abyte0[];
		if(m())
	//*   2    2:aload_0         
	//*   3    3:invokespecial   #900 <Method boolean m()>
	//*   4    6:ifeq            20
		{
			f();
	//    5    9:aload_0         
	//    6   10:invokespecial   #810 <Method void f()>
			j = ke.b();
	//    7   13:aload_0         
	//    8   14:invokestatic    #407 <Method long ke.b()>
	//    9   17:putfield        #128 <Field long j>
		}
		if(n())
	//*  10   20:aload_0         
	//*  11   21:invokespecial   #902 <Method boolean n()>
	//*  12   24:ifeq            31
			t();
	//   13   27:aload_0         
	//   14   28:invokespecial   #848 <Method void t()>
		abyte0 = c(((Object) (null)));
	//   15   31:aload_0         
	//   16   32:aconst_null     
	//   17   33:invokespecial   #904 <Method byte[] c(Object)>
	//   18   36:astore_1        
		this;
	//   19   37:aload_0         
		JVM INSTR monitorexit ;
	//   20   38:monitorexit     
		return abyte0;
	//   21   39:aload_1         
	//   22   40:areturn         
		Exception exception;
		exception;
	//   23   41:astore_1        
	//*  24   42:aload_0         
		throw exception;
	//   25   43:monitorexit     
	//   26   44:aload_1         
	//   27   45:athrow          
	}

	private boolean q()
	{
		if(D == 0L)
	//*   0    0:aload_0         
	//*   1    1:getfield        #126 <Field long D>
	//*   2    4:lconst_0        
	//*   3    5:lcmp            
	//*   4    6:ifne            11
			return false;
	//    5    9:iconst_0        
	//    6   10:ireturn         
		return ke.b() - D < 2000L;
	//    7   11:invokestatic    #407 <Method long ke.b()>
	//    8   14:aload_0         
	//    9   15:getfield        #126 <Field long D>
	//   10   18:lsub            
	//   11   19:ldc2w           #905 <Long 2000L>
	//   12   22:lcmp            
	//   13   23:ifge            28
	//   14   26:iconst_1        
	//   15   27:ireturn         
	//   16   28:iconst_0        
	//   17   29:ireturn         
	}

	private void r()
	{
		if(v == null || q.size() < 1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #120 <Field jt v>
	//*   2    4:ifnull          20
	//*   3    7:aload_0         
	//*   4    8:getfield        #103 <Field Map q>
	//*   5   11:invokeinterface #909 <Method int Map.size()>
	//*   6   16:iconst_1        
	//*   7   17:icmpge          21
			return;
	//    8   20:return          
		for(Iterator iterator = q.entrySet().iterator(); iterator != null && iterator.hasNext();)
	//*   9   21:aload_0         
	//*  10   22:getfield        #103 <Field Map q>
	//*  11   25:invokeinterface #910 <Method Set Map.entrySet()>
	//*  12   30:invokeinterface #316 <Method Iterator Set.iterator()>
	//*  13   35:astore          4
	//*  14   37:aload           4
	//*  15   39:ifnull          276
	//*  16   42:aload           4
	//*  17   44:invokeinterface #321 <Method boolean Iterator.hasNext()>
	//*  18   49:ifeq            276
		{
			Object obj = ((Object) ((java.util.Map.Entry)iterator.next()));
	//   19   52:aload           4
	//   20   54:invokeinterface #325 <Method Object Iterator.next()>
	//   21   59:checkcast       #327 <Class java.util.Map$Entry>
	//   22   62:astore          6
			PendingIntent pendingintent = (PendingIntent)((java.util.Map.Entry) (obj)).getKey();
	//   23   64:aload           6
	//   24   66:invokeinterface #913 <Method Object java.util.Map$Entry.getKey()>
	//   25   71:checkcast       #915 <Class PendingIntent>
	//   26   74:astore          5
			Object obj1 = ((Object) ((List)((java.util.Map.Entry) (obj)).getValue()));
	//   27   76:aload           6
	//   28   78:invokeinterface #330 <Method Object java.util.Map$Entry.getValue()>
	//   29   83:checkcast       #192 <Class List>
	//   30   86:astore          8
			obj = ((Object) (new Intent()));
	//   31   88:new             #917 <Class Intent>
	//   32   91:dup             
	//   33   92:invokespecial   #918 <Method void Intent()>
	//   34   95:astore          6
			Bundle bundle = new Bundle();
	//   35   97:new             #920 <Class Bundle>
	//   36  100:dup             
	//   37  101:invokespecial   #921 <Method void Bundle()>
	//   38  104:astore          7
			obj1 = ((Object) (((List) (obj1)).iterator()));
	//   39  106:aload           8
	//   40  108:invokeinterface #794 <Method Iterator List.iterator()>
	//   41  113:astore          8
			while(((Iterator) (obj1)).hasNext()) 
	//*  42  115:aload           8
	//*  43  117:invokeinterface #321 <Method boolean Iterator.hasNext()>
	//*  44  122:ifeq            273
			{
				jx jx1 = (jx)((Iterator) (obj1)).next();
	//   45  125:aload           8
	//   46  127:invokeinterface #325 <Method Object Iterator.next()>
	//   47  132:checkcast       #923 <Class jx>
	//   48  135:astore          9
				long l1 = jx1.c();
	//   49  137:aload           9
	//   50  139:invokevirtual   #925 <Method long o.jx.c()>
	//   51  142:lstore_2        
				if(l1 == -1L || l1 >= ke.b())
	//*  52  143:lload_2         
	//*  53  144:ldc2w           #926 <Long -1L>
	//*  54  147:lcmp            
	//*  55  148:ifeq            162
	//*  56  151:lload_2         
	//*  57  152:invokestatic    #407 <Method long ke.b()>
	//*  58  155:lcmp            
	//*  59  156:ifge            162
	//*  60  159:goto            115
				{
					float f1 = o.ke.d(new double[] {
						jx1.c, jx1.d, v.i(), v.a()
					});
	//   61  162:iconst_4        
	//   62  163:newarray        double[]
	//   63  165:dup             
	//   64  166:iconst_0        
	//   65  167:aload           9
	//   66  169:getfield        #929 <Field double o.jx.c>
	//   67  172:dastore         
	//   68  173:dup             
	//   69  174:iconst_1        
	//   70  175:aload           9
	//   71  177:getfield        #931 <Field double o.jx.d>
	//   72  180:dastore         
	//   73  181:dup             
	//   74  182:iconst_2        
	//   75  183:aload_0         
	//   76  184:getfield        #120 <Field jt v>
	//   77  187:invokevirtual   #934 <Method double jt.i()>
	//   78  190:dastore         
	//   79  191:dup             
	//   80  192:iconst_3        
	//   81  193:aload_0         
	//   82  194:getfield        #120 <Field jt v>
	//   83  197:invokevirtual   #936 <Method double o.jt.a()>
	//   84  200:dastore         
	//   85  201:invokestatic    #939 <Method float o.ke.d(double[])>
	//   86  204:fstore_1        
					if(f1 < jx1.b)
	//*  87  205:fload_1         
	//*  88  206:aload           9
	//*  89  208:getfield        #941 <Field float jx.b>
	//*  90  211:fcmpl           
	//*  91  212:iflt            218
	//*  92  215:goto            115
					{
						bundle.putFloat("distance", f1);
	//   93  218:aload           7
	//   94  220:ldc2            #943 <String "distance">
	//   95  223:fload_1         
	//   96  224:invokevirtual   #947 <Method void Bundle.putFloat(String, float)>
						bundle.putString("fence", jx1.e());
	//   97  227:aload           7
	//   98  229:ldc2            #949 <String "fence">
	//   99  232:aload           9
	//  100  234:invokevirtual   #950 <Method String jx.e()>
	//  101  237:invokevirtual   #954 <Method void Bundle.putString(String, String)>
						((Intent) (obj)).putExtras(bundle);
	//  102  240:aload           6
	//  103  242:aload           7
	//  104  244:invokevirtual   #958 <Method Intent Intent.putExtras(Bundle)>
	//  105  247:pop             
						try
						{
							pendingintent.send(g, 0, ((Intent) (obj)));
	//  106  248:aload           5
	//  107  250:aload_0         
	//  108  251:getfield        #83  <Field Context g>
	//  109  254:iconst_0        
	//  110  255:aload           6
	//  111  257:invokevirtual   #962 <Method void PendingIntent.send(Context, int, Intent)>
						}
	//* 112  260:goto            270
						catch(Throwable throwable)
	//* 113  263:astore          9
						{
							throwable.printStackTrace();
	//  114  265:aload           9
	//  115  267:invokevirtual   #437 <Method void Throwable.printStackTrace()>
						}
					}
				}
			}
		}

	//* 116  270:goto            115
	//* 117  273:goto            37
	//  118  276:return          
	}

	private boolean s()
	{
		boolean flag;
		if(o == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #89  <Field WifiManager o>
	//*   2    4:ifnonnull       9
			return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		flag = false;
	//    5    9:iconst_0        
	//    6   10:istore_1        
		boolean flag1 = o.isWifiEnabled();
	//    7   11:aload_0         
	//    8   12:getfield        #89  <Field WifiManager o>
	//    9   15:invokevirtual   #965 <Method boolean WifiManager.isWifiEnabled()>
	//   10   18:istore_2        
		flag = flag1;
	//   11   19:iload_2         
	//   12   20:istore_1        
		break MISSING_BLOCK_LABEL_25;
	//   13   21:goto            25
		Exception exception;
		exception;
	//   14   24:astore_3        
		if(flag || o.ke.d() <= 17)
			break MISSING_BLOCK_LABEL_64;
	//   15   25:iload_1         
	//   16   26:ifne            64
	//   17   29:invokestatic    #731 <Method int o.ke.d()>
	//   18   32:bipush          17
	//   19   34:icmple          64
		flag1 = String.valueOf(ka.e(((Object) (o)), "isScanAlwaysAvailable", new Object[0])).equals("true");
	//   20   37:aload_0         
	//   21   38:getfield        #89  <Field WifiManager o>
	//   22   41:ldc2            #967 <String "isScanAlwaysAvailable">
	//   23   44:iconst_0        
	//   24   45:anewarray       Object[]
	//   25   48:invokestatic    #190 <Method Object ka.e(Object, String, Object[])>
	//   26   51:invokestatic    #970 <Method String String.valueOf(Object)>
	//   27   54:ldc2            #726 <String "true">
	//   28   57:invokevirtual   #364 <Method boolean String.equals(Object)>
	//   29   60:istore_2        
		return flag1;
	//   30   61:iload_2         
	//   31   62:ireturn         
		exception;
	//   32   63:astore_3        
		return flag;
	//   33   64:iload_1         
	//   34   65:ireturn         
	}

	private void t()
	{
		if(s())
	//*   0    0:aload_0         
	//*   1    1:invokespecial   #483 <Method boolean s()>
	//*   2    4:ifeq            24
			try
			{
				o.startScan();
	//    3    7:aload_0         
	//    4    8:getfield        #89  <Field WifiManager o>
	//    5   11:invokevirtual   #973 <Method boolean WifiManager.startScan()>
	//    6   14:pop             
				C = ke.b();
	//    7   15:aload_0         
	//    8   16:invokestatic    #407 <Method long ke.b()>
	//    9   19:putfield        #130 <Field long C>
				return;
	//   10   22:return          
			}
			catch(SecurityException securityexception) { }
	//   11   23:astore_1        
	//   12   24:return          
	}

	private void u()
	{
		switch(f)
	//*   0    0:aload_0         
	//*   1    1:getfield        #85  <Field int f>
		{
	//*   2    4:lookupswitch    2: default 32
	//	               1: 33
	//	               2: 52
		default:
			return;
	//    3   32:return          

		case 1: // '\001'
			if(p.size() == 0)
	//*   4   33:aload_0         
	//*   5   34:getfield        #96  <Field List p>
	//*   6   37:invokeinterface #218 <Method int List.size()>
	//*   7   42:ifne            70
			{
				f = 9;
	//    8   45:aload_0         
	//    9   46:bipush          9
	//   10   48:putfield        #85  <Field int f>
				return;
	//   11   51:return          
			}
			break;

		case 2: // '\002'
			if(p.size() == 0)
	//*  12   52:aload_0         
	//*  13   53:getfield        #96  <Field List p>
	//*  14   56:invokeinterface #218 <Method int List.size()>
	//*  15   61:ifne            70
				f = 9;
	//   16   64:aload_0         
	//   17   65:bipush          9
	//   18   67:putfield        #85  <Field int f>
			break;
		}
	//   19   70:return          
	}

	private void v()
	{
		if(z)
	//*   0    0:aload_0         
	//*   1    1:getfield        #124 <Field boolean z>
	//*   2    4:ifeq            23
		{
			f = 9;
	//    3    7:aload_0         
	//    4    8:bipush          9
	//    5   10:putfield        #85  <Field int f>
			p.clear();
	//    6   13:aload_0         
	//    7   14:getfield        #96  <Field List p>
	//    8   17:invokeinterface #306 <Method void List.clear()>
			return;
	//    9   22:return          
		} else
		{
			u();
	//   10   23:aload_0         
	//   11   24:invokespecial   #975 <Method void u()>
			return;
	//   12   27:return          
		}
	}

	private void w()
	{
		if(i != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #423 <Field Timer i>
	//*   2    4:ifnull          19
		{
			i.cancel();
	//    3    7:aload_0         
	//    4    8:getfield        #423 <Field Timer i>
	//    5   11:invokevirtual   #978 <Method void Timer.cancel()>
			i = null;
	//    6   14:aload_0         
	//    7   15:aconst_null     
	//    8   16:putfield        #423 <Field Timer i>
		}
		if(a != null)
	//*   9   19:aload_0         
	//*  10   20:getfield        #419 <Field TimerTask a>
	//*  11   23:ifnull          39
		{
			a.cancel();
	//   12   26:aload_0         
	//   13   27:getfield        #419 <Field TimerTask a>
	//   14   30:invokevirtual   #982 <Method boolean TimerTask.cancel()>
	//   15   33:pop             
			a = null;
	//   16   34:aload_0         
	//   17   35:aconst_null     
	//   18   36:putfield        #419 <Field TimerTask a>
		}
	//   19   39:return          
	}

	private void x()
	{
		if(!b())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #411 <Method boolean b()>
	//*   2    4:ifne            8
			return;
	//    3    7:return          
		try
		{
			I.c(768);
	//    4    8:aload_0         
	//    5    9:getfield        #145 <Field kk I>
	//    6   12:sipush          768
	//    7   15:invokevirtual   #984 <Method void o.kk.c(int)>
			return;
	//    8   18:return          
		}
		catch(Throwable throwable)
	//*   9   19:astore_1        
		{
			throwable.printStackTrace();
	//   10   20:aload_1         
	//   11   21:invokevirtual   #437 <Method void Throwable.printStackTrace()>
			o.ke.c(throwable);
	//   12   24:aload_1         
	//   13   25:invokestatic    #352 <Method void o.ke.c(Throwable)>
			return;
	//   14   28:return          
		}
	}

	private void y()
	{
		if(!b())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #411 <Method boolean b()>
	//*   2    4:ifne            8
			return;
	//    3    7:return          
		if(I.g() > 0)
	//*   4    8:aload_0         
	//*   5    9:getfield        #145 <Field kk I>
	//*   6   12:invokevirtual   #415 <Method int kk.g()>
	//*   7   15:ifle            19
			return;
	//    8   18:return          
		try
		{
			I.a();
	//    9   19:aload_0         
	//   10   20:getfield        #145 <Field kk I>
	//   11   23:invokevirtual   #986 <Method boolean o.kk.a()>
	//   12   26:pop             
			return;
	//   13   27:return          
		}
		catch(Throwable throwable)
	//*  14   28:astore_1        
		{
			throwable.printStackTrace();
	//   15   29:aload_1         
	//   16   30:invokevirtual   #437 <Method void Throwable.printStackTrace()>
		}
	//   17   33:return          
	}

	private jt z()
		throws Exception
	{
		return e(p(), false);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokespecial   #989 <Method byte[] p()>
	//    3    5:iconst_0        
	//    4    6:invokespecial   #991 <Method jt e(byte[], boolean)>
	//    5    9:areturn         
	}

	public void a()
	{
		try
		{
			if(I == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #145 <Field kk I>
	//*   2    4:ifnonnull       28
			{
				I = kk.e(g);
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #83  <Field Context g>
	//    6   12:invokestatic    #994 <Method kk kk.e(Context)>
	//    7   15:putfield        #145 <Field kk I>
				I.c(256);
	//    8   18:aload_0         
	//    9   19:getfield        #145 <Field kk I>
	//   10   22:sipush          256
	//   11   25:invokevirtual   #984 <Method void o.kk.c(int)>
			}
			if(!J)
	//*  12   28:aload_0         
	//*  13   29:getfield        #167 <Field boolean J>
	//*  14   32:ifne            47
			{
				J = true;
	//   15   35:aload_0         
	//   16   36:iconst_1        
	//   17   37:putfield        #167 <Field boolean J>
				I.c();
	//   18   40:aload_0         
	//   19   41:getfield        #145 <Field kk I>
	//   20   44:invokevirtual   #996 <Method void o.kk.c()>
			}
			return;
	//   21   47:return          
		}
		catch(Throwable throwable)
	//*  22   48:astore_1        
		{
			throwable.printStackTrace();
	//   23   49:aload_1         
	//   24   50:invokevirtual   #437 <Method void Throwable.printStackTrace()>
		}
	//   25   53:return          
	}

	public int b(boolean flag, int i1)
	{
		if(!flag)
	//*   0    0:iload_1         
	//*   1    1:ifne            11
			w();
	//    2    4:aload_0         
	//    3    5:invokespecial   #728 <Method void w()>
		else
	//*   4    8:goto            16
			c(i1);
	//    5   11:aload_0         
	//    6   12:iload_2         
	//    7   13:invokespecial   #998 <Method void c(int)>
		if(b())
	//*   8   16:aload_0         
	//*   9   17:invokevirtual   #411 <Method boolean b()>
	//*  10   20:ifeq            31
			return I.g();
	//   11   23:aload_0         
	//   12   24:getfield        #145 <Field kk I>
	//   13   27:invokevirtual   #415 <Method int kk.g()>
	//   14   30:ireturn         
		else
			return -1;
	//   15   31:iconst_m1       
	//   16   32:ireturn         
	}

	public void b(PendingIntent pendingintent)
	{
		if(pendingintent == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       5
		{
			return;
	//    2    4:return          
		} else
		{
			q.remove(((Object) (pendingintent)));
	//    3    5:aload_0         
	//    4    6:getfield        #103 <Field Map q>
	//    5    9:aload_1         
	//    6   10:invokeinterface #1002 <Method Object Map.remove(Object)>
	//    7   15:pop             
			return;
	//    8   16:return          
		}
	}

	public void b(jx jx1, PendingIntent pendingintent)
	{
		if(pendingintent == null || jx1 == null)
	//*   0    0:aload_2         
	//*   1    1:ifnull          8
	//*   2    4:aload_1         
	//*   3    5:ifnonnull       9
			return;
	//    4    8:return          
		long l1 = jx1.c();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #925 <Method long o.jx.c()>
	//    7   13:lstore_3        
		if(l1 != -1L && l1 < ke.b())
	//*   8   14:lload_3         
	//*   9   15:ldc2w           #926 <Long -1L>
	//*  10   18:lcmp            
	//*  11   19:ifeq            31
	//*  12   22:lload_3         
	//*  13   23:invokestatic    #407 <Method long ke.b()>
	//*  14   26:lcmp            
	//*  15   27:ifge            31
			return;
	//   16   30:return          
		if(u.get(((Object) (pendingintent))) != null)
	//*  17   31:aload_0         
	//*  18   32:getfield        #105 <Field Map u>
	//*  19   35:aload_2         
	//*  20   36:invokeinterface #1005 <Method Object Map.get(Object)>
	//*  21   41:ifnull          82
		{
			List list = (List)u.get(((Object) (pendingintent)));
	//   22   44:aload_0         
	//   23   45:getfield        #105 <Field Map u>
	//   24   48:aload_2         
	//   25   49:invokeinterface #1005 <Method Object Map.get(Object)>
	//   26   54:checkcast       #192 <Class List>
	//   27   57:astore          5
			list.add(((Object) (jx1)));
	//   28   59:aload           5
	//   29   61:aload_1         
	//   30   62:invokeinterface #334 <Method boolean List.add(Object)>
	//   31   67:pop             
			u.put(((Object) (pendingintent)), ((Object) (list)));
	//   32   68:aload_0         
	//   33   69:getfield        #105 <Field Map u>
	//   34   72:aload_2         
	//   35   73:aload           5
	//   36   75:invokeinterface #1006 <Method Object Map.put(Object, Object)>
	//   37   80:pop             
			return;
	//   38   81:return          
		} else
		{
			ArrayList arraylist = new ArrayList();
	//   39   82:new             #93  <Class ArrayList>
	//   40   85:dup             
	//   41   86:invokespecial   #94  <Method void ArrayList()>
	//   42   89:astore          5
			((List) (arraylist)).add(((Object) (jx1)));
	//   43   91:aload           5
	//   44   93:aload_1         
	//   45   94:invokeinterface #334 <Method boolean List.add(Object)>
	//   46   99:pop             
			u.put(((Object) (pendingintent)), ((Object) (arraylist)));
	//   47  100:aload_0         
	//   48  101:getfield        #105 <Field Map u>
	//   49  104:aload_2         
	//   50  105:aload           5
	//   51  107:invokeinterface #1006 <Method Object Map.put(Object, Object)>
	//   52  112:pop             
			return;
	//   53  113:return          
		}
	}

	boolean b()
	{
		return I != null;
	//    0    0:aload_0         
	//    1    1:getfield        #145 <Field kk I>
	//    2    4:ifnonnull       9
	//    3    7:iconst_0        
	//    4    8:ireturn         
	//    5    9:iconst_1        
	//    6   10:ireturn         
	}

	public void c()
	{
		try
		{
			if(I != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #145 <Field kk I>
	//*   2    4:ifnull          19
			{
				I.e();
	//    3    7:aload_0         
	//    4    8:getfield        #145 <Field kk I>
	//    5   11:invokevirtual   #1008 <Method void kk.e()>
				J = false;
	//    6   14:aload_0         
	//    7   15:iconst_0        
	//    8   16:putfield        #167 <Field boolean J>
			}
		}
	//*   9   19:goto            27
		catch(Throwable throwable)
	//*  10   22:astore_1        
		{
			throwable.printStackTrace();
	//   11   23:aload_1         
	//   12   24:invokevirtual   #437 <Method void Throwable.printStackTrace()>
		}
		try
		{
			if(g != null)
	//*  13   27:aload_0         
	//*  14   28:getfield        #83  <Field Context g>
	//*  15   31:ifnull          45
				g.unregisterReceiver(((BroadcastReceiver) (s)));
	//   16   34:aload_0         
	//   17   35:getfield        #83  <Field Context g>
	//   18   38:aload_0         
	//   19   39:getfield        #114 <Field jf$e s>
	//   20   42:invokevirtual   #1012 <Method void Context.unregisterReceiver(BroadcastReceiver)>
		}
	//*  21   45:aload_0         
	//*  22   46:aconst_null     
	//*  23   47:putfield        #114 <Field jf$e s>
	//*  24   50:goto            70
		catch(Throwable throwable1)
	//*  25   53:astore_1        
		{
			s = null;
	//   26   54:aload_0         
	//   27   55:aconst_null     
	//   28   56:putfield        #114 <Field jf$e s>
			break MISSING_BLOCK_LABEL_70;
	//   29   59:goto            70
		}
		s = null;
		break MISSING_BLOCK_LABEL_70;
		Exception exception;
		exception;
	//   30   62:astore_1        
		s = null;
	//   31   63:aload_0         
	//   32   64:aconst_null     
	//   33   65:putfield        #114 <Field jf$e s>
		throw exception;
	//   34   68:aload_1         
	//   35   69:athrow          
		w();
	//   36   70:aload_0         
	//   37   71:invokespecial   #728 <Method void w()>
		try
		{
			if(m != null && t != null)
	//*  38   74:aload_0         
	//*  39   75:getfield        #91  <Field TelephonyManager m>
	//*  40   78:ifnull          100
	//*  41   81:aload_0         
	//*  42   82:getfield        #107 <Field PhoneStateListener t>
	//*  43   85:ifnull          100
				m.listen(t, 0);
	//   44   88:aload_0         
	//   45   89:getfield        #91  <Field TelephonyManager m>
	//   46   92:aload_0         
	//   47   93:getfield        #107 <Field PhoneStateListener t>
	//   48   96:iconst_0        
	//   49   97:invokevirtual   #820 <Method void TelephonyManager.listen(PhoneStateListener, int)>
		}
	//*  50  100:goto            108
		catch(Throwable throwable2)
	//*  51  103:astore_1        
		{
			throwable2.printStackTrace();
	//   52  104:aload_1         
	//   53  105:invokevirtual   #437 <Method void Throwable.printStackTrace()>
		}
		if(g != null && G != null)
	//*  54  108:aload_0         
	//*  55  109:getfield        #83  <Field Context g>
	//*  56  112:ifnull          136
	//*  57  115:aload_0         
	//*  58  116:getfield        #158 <Field js G>
	//*  59  119:ifnull          136
		{
			G.b();
	//   60  122:aload_0         
	//   61  123:getfield        #158 <Field js G>
	//   62  126:invokevirtual   #1016 <Method void js.b()>
			G.c();
	//   63  129:aload_0         
	//   64  130:getfield        #158 <Field js G>
	//   65  133:invokevirtual   #1017 <Method void o.js.c()>
		}
		jq.e(false);
	//   66  136:iconst_0        
	//   67  137:invokestatic    #1019 <Method void jq.e(boolean)>
		x = 0L;
	//   68  140:aload_0         
	//   69  141:lconst_0        
	//   70  142:putfield        #122 <Field long x>
		p.clear();
	//   71  145:aload_0         
	//   72  146:getfield        #96  <Field List p>
	//   73  149:invokeinterface #306 <Method void List.clear()>
		q.clear();
	//   74  154:aload_0         
	//   75  155:getfield        #103 <Field Map q>
	//   76  158:invokeinterface #1020 <Method void Map.clear()>
		u.clear();
	//   77  163:aload_0         
	//   78  164:getfield        #105 <Field Map u>
	//   79  167:invokeinterface #1020 <Method void Map.clear()>
		r = -113;
	//   80  172:aload_0         
	//   81  173:bipush          -113
	//   82  175:putfield        #109 <Field int r>
		o();
	//   83  178:aload_0         
	//   84  179:invokespecial   #489 <Method void o()>
		v = null;
	//   85  182:aload_0         
	//   86  183:aconst_null     
	//   87  184:putfield        #120 <Field jt v>
		g = null;
	//   88  187:aload_0         
	//   89  188:aconst_null     
	//   90  189:putfield        #83  <Field Context g>
		m = null;
	//   91  192:aload_0         
	//   92  193:aconst_null     
	//   93  194:putfield        #91  <Field TelephonyManager m>
		try
		{
			if(e != null)
	//*  94  197:aload_0         
	//*  95  198:getfield        #873 <Field jp e>
	//*  96  201:ifnull          240
			{
				if(c == 0 && d)
	//*  97  204:aload_0         
	//*  98  205:getfield        #154 <Field int c>
	//*  99  208:ifne            225
	//* 100  211:aload_0         
	//* 101  212:getfield        #156 <Field boolean d>
	//* 102  215:ifeq            225
					e.b();
	//  103  218:aload_0         
	//  104  219:getfield        #873 <Field jp e>
	//  105  222:invokevirtual   #1021 <Method void jp.b()>
				c = -1;
	//  106  225:aload_0         
	//  107  226:iconst_m1       
	//  108  227:putfield        #154 <Field int c>
				d = false;
	//  109  230:aload_0         
	//  110  231:iconst_0        
	//  111  232:putfield        #156 <Field boolean d>
				e = null;
	//  112  235:aload_0         
	//  113  236:aconst_null     
	//  114  237:putfield        #873 <Field jp e>
			}
			return;
	//  115  240:return          
		}
		catch(Throwable throwable3)
	//* 116  241:astore_1        
		{
			return;
	//  117  242:return          
		}
	}

	public void c(Context context, AMapLocation amaplocation)
	{
label0:
		{
			if(amaplocation == null || u.size() < 1)
	//*   0    0:aload_2         
	//*   1    1:ifnull          17
	//*   2    4:aload_0         
	//*   3    5:getfield        #105 <Field Map u>
	//*   4    8:invokeinterface #909 <Method int Map.size()>
	//*   5   13:iconst_1        
	//*   6   14:icmpge          18
				return;
	//    7   17:return          
			Iterator iterator = u.entrySet().iterator();
	//    8   18:aload_0         
	//    9   19:getfield        #105 <Field Map u>
	//   10   22:invokeinterface #910 <Method Set Map.entrySet()>
	//   11   27:invokeinterface #316 <Method Iterator Set.iterator()>
	//   12   32:astore          6
			do
			{
				if(iterator == null || !iterator.hasNext())
					break label0;
	//   13   34:aload           6
	//   14   36:ifnull          322
	//   15   39:aload           6
	//   16   41:invokeinterface #321 <Method boolean Iterator.hasNext()>
	//   17   46:ifeq            322
				Object obj = ((Object) ((java.util.Map.Entry)iterator.next()));
	//   18   49:aload           6
	//   19   51:invokeinterface #325 <Method Object Iterator.next()>
	//   20   56:checkcast       #327 <Class java.util.Map$Entry>
	//   21   59:astore          8
				PendingIntent pendingintent = (PendingIntent)((java.util.Map.Entry) (obj)).getKey();
	//   22   61:aload           8
	//   23   63:invokeinterface #913 <Method Object java.util.Map$Entry.getKey()>
	//   24   68:checkcast       #915 <Class PendingIntent>
	//   25   71:astore          7
				Object obj1 = ((Object) ((List)((java.util.Map.Entry) (obj)).getValue()));
	//   26   73:aload           8
	//   27   75:invokeinterface #330 <Method Object java.util.Map$Entry.getValue()>
	//   28   80:checkcast       #192 <Class List>
	//   29   83:astore          10
				obj = ((Object) (new Intent()));
	//   30   85:new             #917 <Class Intent>
	//   31   88:dup             
	//   32   89:invokespecial   #918 <Method void Intent()>
	//   33   92:astore          8
				Bundle bundle = new Bundle();
	//   34   94:new             #920 <Class Bundle>
	//   35   97:dup             
	//   36   98:invokespecial   #921 <Method void Bundle()>
	//   37  101:astore          9
				obj1 = ((Object) (((List) (obj1)).iterator()));
	//   38  103:aload           10
	//   39  105:invokeinterface #794 <Method Iterator List.iterator()>
	//   40  110:astore          10
				do
				{
					if(!((Iterator) (obj1)).hasNext())
						break;
	//   41  112:aload           10
	//   42  114:invokeinterface #321 <Method boolean Iterator.hasNext()>
	//   43  119:ifeq            319
					jx jx1 = (jx)((Iterator) (obj1)).next();
	//   44  122:aload           10
	//   45  124:invokeinterface #325 <Method Object Iterator.next()>
	//   46  129:checkcast       #923 <Class jx>
	//   47  132:astore          11
					long l1 = jx1.c();
	//   48  134:aload           11
	//   49  136:invokevirtual   #925 <Method long o.jx.c()>
	//   50  139:lstore          4
					if(l1 != -1L && l1 < ke.b())
	//*  51  141:lload           4
	//*  52  143:ldc2w           #926 <Long -1L>
	//*  53  146:lcmp            
	//*  54  147:ifeq            162
	//*  55  150:lload           4
	//*  56  152:invokestatic    #407 <Method long ke.b()>
	//*  57  155:lcmp            
	//*  58  156:ifge            162
						continue;
	//   59  159:goto            112
					float f1 = o.ke.d(new double[] {
						jx1.c, jx1.d, amaplocation.getLatitude(), amaplocation.getLongitude()
					});
	//   60  162:iconst_4        
	//   61  163:newarray        double[]
	//   62  165:dup             
	//   63  166:iconst_0        
	//   64  167:aload           11
	//   65  169:getfield        #929 <Field double o.jx.c>
	//   66  172:dastore         
	//   67  173:dup             
	//   68  174:iconst_1        
	//   69  175:aload           11
	//   70  177:getfield        #931 <Field double o.jx.d>
	//   71  180:dastore         
	//   72  181:dup             
	//   73  182:iconst_2        
	//   74  183:aload_2         
	//   75  184:invokevirtual   #1026 <Method double AMapLocation.getLatitude()>
	//   76  187:dastore         
	//   77  188:dup             
	//   78  189:iconst_3        
	//   79  190:aload_2         
	//   80  191:invokevirtual   #1028 <Method double AMapLocation.getLongitude()>
	//   81  194:dastore         
	//   82  195:invokestatic    #939 <Method float o.ke.d(double[])>
	//   83  198:fstore_3        
					if(f1 >= jx1.b)
	//*  84  199:fload_3         
	//*  85  200:aload           11
	//*  86  202:getfield        #941 <Field float jx.b>
	//*  87  205:fcmpl           
	//*  88  206:iflt            226
					{
						if(jx1.a == 0)
	//*  89  209:aload           11
	//*  90  211:getfield        #1029 <Field int o.jx.a>
	//*  91  214:ifne            220
							continue;
	//   92  217:goto            112
						jx1.a = 0;
	//   93  220:aload           11
	//   94  222:iconst_0        
	//   95  223:putfield        #1029 <Field int o.jx.a>
					}
					if(f1 < jx1.b)
	//*  96  226:fload_3         
	//*  97  227:aload           11
	//*  98  229:getfield        #941 <Field float jx.b>
	//*  99  232:fcmpg           
	//* 100  233:ifge            254
					{
						if(jx1.a == 1)
	//* 101  236:aload           11
	//* 102  238:getfield        #1029 <Field int o.jx.a>
	//* 103  241:iconst_1        
	//* 104  242:icmpne          248
							continue;
	//  105  245:goto            112
						jx1.a = 1;
	//  106  248:aload           11
	//  107  250:iconst_1        
	//  108  251:putfield        #1029 <Field int o.jx.a>
					}
					bundle.putFloat("distance", f1);
	//  109  254:aload           9
	//  110  256:ldc2            #943 <String "distance">
	//  111  259:fload_3         
	//  112  260:invokevirtual   #947 <Method void Bundle.putFloat(String, float)>
					bundle.putString("fence", jx1.e());
	//  113  263:aload           9
	//  114  265:ldc2            #949 <String "fence">
	//  115  268:aload           11
	//  116  270:invokevirtual   #950 <Method String jx.e()>
	//  117  273:invokevirtual   #954 <Method void Bundle.putString(String, String)>
					bundle.putInt("status", jx1.a);
	//  118  276:aload           9
	//  119  278:ldc2            #1031 <String "status">
	//  120  281:aload           11
	//  121  283:getfield        #1029 <Field int o.jx.a>
	//  122  286:invokevirtual   #1035 <Method void Bundle.putInt(String, int)>
					((Intent) (obj)).putExtras(bundle);
	//  123  289:aload           8
	//  124  291:aload           9
	//  125  293:invokevirtual   #958 <Method Intent Intent.putExtras(Bundle)>
	//  126  296:pop             
					try
					{
						pendingintent.send(context, 0, ((Intent) (obj)));
	//  127  297:aload           7
	//  128  299:aload_1         
	//  129  300:iconst_0        
	//  130  301:aload           8
	//  131  303:invokevirtual   #962 <Method void PendingIntent.send(Context, int, Intent)>
					}
	//* 132  306:goto            316
					catch(Throwable throwable)
	//* 133  309:astore          11
					{
						throwable.printStackTrace();
	//  134  311:aload           11
	//  135  313:invokevirtual   #437 <Method void Throwable.printStackTrace()>
					}
				} while(true);
	//  136  316:goto            112
			} while(true);
		}
	//  137  319:goto            34
	//  138  322:return          
	}

	public void c(String s1)
	{
		if(s1 == null || s1.indexOf("##") == -1)
	//*   0    0:aload_1         
	//*   1    1:ifnull          15
	//*   2    4:aload_1         
	//*   3    5:ldc2            #1037 <String "##">
	//*   4    8:invokevirtual   #1041 <Method int String.indexOf(String)>
	//*   5   11:iconst_m1       
	//*   6   12:icmpne          16
			return;
	//    7   15:return          
		s1 = ((String) (s1.split("##")));
	//    8   16:aload_1         
	//    9   17:ldc2            #1037 <String "##">
	//   10   20:invokevirtual   #1045 <Method String[] String.split(String)>
	//   11   23:astore_1        
		if(s1.length != 3)
	//*  12   24:aload_1         
	//*  13   25:arraylength     
	//*  14   26:iconst_3        
	//*  15   27:icmpeq          31
			return;
	//   16   30:return          
		jq.e(((String) (s1[0])));
	//   17   31:aload_1         
	//   18   32:iconst_0        
	//   19   33:aaload          
	//   20   34:invokestatic    #1047 <Method void jq.e(String)>
		if(!jq.b.equals(((Object) (s1[1]))))
	//*  21   37:getstatic       #507 <Field String jq.b>
	//*  22   40:aload_1         
	//*  23   41:iconst_1        
	//*  24   42:aaload          
	//*  25   43:invokevirtual   #364 <Method boolean String.equals(Object)>
	//*  26   46:ifne            56
			G.b();
	//   27   49:aload_0         
	//   28   50:getfield        #158 <Field js G>
	//   29   53:invokevirtual   #1016 <Method void js.b()>
		o.jq.c(((String) (s1[1])));
	//   30   56:aload_1         
	//   31   57:iconst_1        
	//   32   58:aaload          
	//   33   59:invokestatic    #1049 <Method void o.jq.c(String)>
		o.jq.d(((String) (s1[2])));
	//   34   62:aload_1         
	//   35   63:iconst_2        
	//   36   64:aaload          
	//   37   65:invokestatic    #1051 <Method void o.jq.d(String)>
	//   38   68:return          
	}

	public void c(jx jx1, PendingIntent pendingintent)
	{
		if(pendingintent == null || jx1 == null)
	//*   0    0:aload_2         
	//*   1    1:ifnull          8
	//*   2    4:aload_1         
	//*   3    5:ifnonnull       9
			return;
	//    4    8:return          
		long l1 = jx1.c();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #925 <Method long o.jx.c()>
	//    7   13:lstore_3        
		if(l1 != -1L && l1 < ke.b())
	//*   8   14:lload_3         
	//*   9   15:ldc2w           #926 <Long -1L>
	//*  10   18:lcmp            
	//*  11   19:ifeq            31
	//*  12   22:lload_3         
	//*  13   23:invokestatic    #407 <Method long ke.b()>
	//*  14   26:lcmp            
	//*  15   27:ifge            31
			return;
	//   16   30:return          
		if(q.get(((Object) (pendingintent))) != null)
	//*  17   31:aload_0         
	//*  18   32:getfield        #103 <Field Map q>
	//*  19   35:aload_2         
	//*  20   36:invokeinterface #1005 <Method Object Map.get(Object)>
	//*  21   41:ifnull          82
		{
			List list = (List)q.get(((Object) (pendingintent)));
	//   22   44:aload_0         
	//   23   45:getfield        #103 <Field Map q>
	//   24   48:aload_2         
	//   25   49:invokeinterface #1005 <Method Object Map.get(Object)>
	//   26   54:checkcast       #192 <Class List>
	//   27   57:astore          5
			list.add(((Object) (jx1)));
	//   28   59:aload           5
	//   29   61:aload_1         
	//   30   62:invokeinterface #334 <Method boolean List.add(Object)>
	//   31   67:pop             
			q.put(((Object) (pendingintent)), ((Object) (list)));
	//   32   68:aload_0         
	//   33   69:getfield        #103 <Field Map q>
	//   34   72:aload_2         
	//   35   73:aload           5
	//   36   75:invokeinterface #1006 <Method Object Map.put(Object, Object)>
	//   37   80:pop             
			return;
	//   38   81:return          
		} else
		{
			ArrayList arraylist = new ArrayList();
	//   39   82:new             #93  <Class ArrayList>
	//   40   85:dup             
	//   41   86:invokespecial   #94  <Method void ArrayList()>
	//   42   89:astore          5
			((List) (arraylist)).add(((Object) (jx1)));
	//   43   91:aload           5
	//   44   93:aload_1         
	//   45   94:invokeinterface #334 <Method boolean List.add(Object)>
	//   46   99:pop             
			q.put(((Object) (pendingintent)), ((Object) (arraylist)));
	//   47  100:aload_0         
	//   48  101:getfield        #103 <Field Map q>
	//   49  104:aload_2         
	//   50  105:aload           5
	//   51  107:invokeinterface #1006 <Method Object Map.put(Object, Object)>
	//   52  112:pop             
			return;
	//   53  113:return          
		}
	}

	public void d()
	{
label0:
		{
			if(v == null || u.size() < 1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #120 <Field jt v>
	//*   2    4:ifnull          20
	//*   3    7:aload_0         
	//*   4    8:getfield        #105 <Field Map u>
	//*   5   11:invokeinterface #909 <Method int Map.size()>
	//*   6   16:iconst_1        
	//*   7   17:icmpge          21
				return;
	//    8   20:return          
			Iterator iterator = u.entrySet().iterator();
	//    9   21:aload_0         
	//   10   22:getfield        #105 <Field Map u>
	//   11   25:invokeinterface #910 <Method Set Map.entrySet()>
	//   12   30:invokeinterface #316 <Method Iterator Set.iterator()>
	//   13   35:astore          4
			do
			{
				if(iterator == null || !iterator.hasNext())
					break label0;
	//   14   37:aload           4
	//   15   39:ifnull          331
	//   16   42:aload           4
	//   17   44:invokeinterface #321 <Method boolean Iterator.hasNext()>
	//   18   49:ifeq            331
				Object obj = ((Object) ((java.util.Map.Entry)iterator.next()));
	//   19   52:aload           4
	//   20   54:invokeinterface #325 <Method Object Iterator.next()>
	//   21   59:checkcast       #327 <Class java.util.Map$Entry>
	//   22   62:astore          6
				PendingIntent pendingintent = (PendingIntent)((java.util.Map.Entry) (obj)).getKey();
	//   23   64:aload           6
	//   24   66:invokeinterface #913 <Method Object java.util.Map$Entry.getKey()>
	//   25   71:checkcast       #915 <Class PendingIntent>
	//   26   74:astore          5
				Object obj1 = ((Object) ((List)((java.util.Map.Entry) (obj)).getValue()));
	//   27   76:aload           6
	//   28   78:invokeinterface #330 <Method Object java.util.Map$Entry.getValue()>
	//   29   83:checkcast       #192 <Class List>
	//   30   86:astore          8
				obj = ((Object) (new Intent()));
	//   31   88:new             #917 <Class Intent>
	//   32   91:dup             
	//   33   92:invokespecial   #918 <Method void Intent()>
	//   34   95:astore          6
				Bundle bundle = new Bundle();
	//   35   97:new             #920 <Class Bundle>
	//   36  100:dup             
	//   37  101:invokespecial   #921 <Method void Bundle()>
	//   38  104:astore          7
				obj1 = ((Object) (((List) (obj1)).iterator()));
	//   39  106:aload           8
	//   40  108:invokeinterface #794 <Method Iterator List.iterator()>
	//   41  113:astore          8
				do
				{
					if(!((Iterator) (obj1)).hasNext())
						break;
	//   42  115:aload           8
	//   43  117:invokeinterface #321 <Method boolean Iterator.hasNext()>
	//   44  122:ifeq            328
					jx jx1 = (jx)((Iterator) (obj1)).next();
	//   45  125:aload           8
	//   46  127:invokeinterface #325 <Method Object Iterator.next()>
	//   47  132:checkcast       #923 <Class jx>
	//   48  135:astore          9
					long l1 = jx1.c();
	//   49  137:aload           9
	//   50  139:invokevirtual   #925 <Method long o.jx.c()>
	//   51  142:lstore_2        
					if(l1 != -1L && l1 < ke.b())
	//*  52  143:lload_2         
	//*  53  144:ldc2w           #926 <Long -1L>
	//*  54  147:lcmp            
	//*  55  148:ifeq            162
	//*  56  151:lload_2         
	//*  57  152:invokestatic    #407 <Method long ke.b()>
	//*  58  155:lcmp            
	//*  59  156:ifge            162
						continue;
	//   60  159:goto            115
					float f1 = o.ke.d(new double[] {
						jx1.c, jx1.d, v.i(), v.a()
					});
	//   61  162:iconst_4        
	//   62  163:newarray        double[]
	//   63  165:dup             
	//   64  166:iconst_0        
	//   65  167:aload           9
	//   66  169:getfield        #929 <Field double o.jx.c>
	//   67  172:dastore         
	//   68  173:dup             
	//   69  174:iconst_1        
	//   70  175:aload           9
	//   71  177:getfield        #931 <Field double o.jx.d>
	//   72  180:dastore         
	//   73  181:dup             
	//   74  182:iconst_2        
	//   75  183:aload_0         
	//   76  184:getfield        #120 <Field jt v>
	//   77  187:invokevirtual   #934 <Method double jt.i()>
	//   78  190:dastore         
	//   79  191:dup             
	//   80  192:iconst_3        
	//   81  193:aload_0         
	//   82  194:getfield        #120 <Field jt v>
	//   83  197:invokevirtual   #936 <Method double o.jt.a()>
	//   84  200:dastore         
	//   85  201:invokestatic    #939 <Method float o.ke.d(double[])>
	//   86  204:fstore_1        
					if(f1 >= jx1.b)
	//*  87  205:fload_1         
	//*  88  206:aload           9
	//*  89  208:getfield        #941 <Field float jx.b>
	//*  90  211:fcmpl           
	//*  91  212:iflt            232
					{
						if(jx1.a == 0)
	//*  92  215:aload           9
	//*  93  217:getfield        #1029 <Field int o.jx.a>
	//*  94  220:ifne            226
							continue;
	//   95  223:goto            115
						jx1.a = 0;
	//   96  226:aload           9
	//   97  228:iconst_0        
	//   98  229:putfield        #1029 <Field int o.jx.a>
					}
					if(f1 < jx1.b)
	//*  99  232:fload_1         
	//* 100  233:aload           9
	//* 101  235:getfield        #941 <Field float jx.b>
	//* 102  238:fcmpg           
	//* 103  239:ifge            260
					{
						if(jx1.a == 1)
	//* 104  242:aload           9
	//* 105  244:getfield        #1029 <Field int o.jx.a>
	//* 106  247:iconst_1        
	//* 107  248:icmpne          254
							continue;
	//  108  251:goto            115
						jx1.a = 1;
	//  109  254:aload           9
	//  110  256:iconst_1        
	//  111  257:putfield        #1029 <Field int o.jx.a>
					}
					bundle.putFloat("distance", f1);
	//  112  260:aload           7
	//  113  262:ldc2            #943 <String "distance">
	//  114  265:fload_1         
	//  115  266:invokevirtual   #947 <Method void Bundle.putFloat(String, float)>
					bundle.putString("fence", jx1.e());
	//  116  269:aload           7
	//  117  271:ldc2            #949 <String "fence">
	//  118  274:aload           9
	//  119  276:invokevirtual   #950 <Method String jx.e()>
	//  120  279:invokevirtual   #954 <Method void Bundle.putString(String, String)>
					bundle.putInt("status", jx1.a);
	//  121  282:aload           7
	//  122  284:ldc2            #1031 <String "status">
	//  123  287:aload           9
	//  124  289:getfield        #1029 <Field int o.jx.a>
	//  125  292:invokevirtual   #1035 <Method void Bundle.putInt(String, int)>
					((Intent) (obj)).putExtras(bundle);
	//  126  295:aload           6
	//  127  297:aload           7
	//  128  299:invokevirtual   #958 <Method Intent Intent.putExtras(Bundle)>
	//  129  302:pop             
					try
					{
						pendingintent.send(g, 0, ((Intent) (obj)));
	//  130  303:aload           5
	//  131  305:aload_0         
	//  132  306:getfield        #83  <Field Context g>
	//  133  309:iconst_0        
	//  134  310:aload           6
	//  135  312:invokevirtual   #962 <Method void PendingIntent.send(Context, int, Intent)>
					}
	//* 136  315:goto            325
					catch(Throwable throwable)
	//* 137  318:astore          9
					{
						throwable.printStackTrace();
	//  138  320:aload           9
	//  139  322:invokevirtual   #437 <Method void Throwable.printStackTrace()>
					}
				} while(true);
	//  140  325:goto            115
			} while(true);
		}
	//  141  328:goto            37
	//  142  331:return          
	}

	public void d(PendingIntent pendingintent)
	{
		if(pendingintent == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       5
		{
			return;
	//    2    4:return          
		} else
		{
			u.remove(((Object) (pendingintent)));
	//    3    5:aload_0         
	//    4    6:getfield        #105 <Field Map u>
	//    5    9:aload_1         
	//    6   10:invokeinterface #1002 <Method Object Map.remove(Object)>
	//    7   15:pop             
			return;
	//    8   16:return          
		}
	}

	public void d(Context context)
	{
		if(context == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       5
			return;
	//    2    4:return          
		if(g != null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #83  <Field Context g>
	//*   5    9:ifnull          13
			return;
	//    6   12:return          
		g = context.getApplicationContext();
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:invokevirtual   #1056 <Method Context Context.getApplicationContext()>
	//   10   18:putfield        #83  <Field Context g>
		try
		{
			if(e == null)
	//*  11   21:aload_0         
	//*  12   22:getfield        #873 <Field jp e>
	//*  13   25:ifnonnull       51
			{
				e = new jp(context);
	//   14   28:aload_0         
	//   15   29:new             #875 <Class jp>
	//   16   32:dup             
	//   17   33:aload_1         
	//   18   34:invokespecial   #1058 <Method void jp(Context)>
	//   19   37:putfield        #873 <Field jp e>
				e.a(((jp.b) (b)));
	//   20   40:aload_0         
	//   21   41:getfield        #873 <Field jp e>
	//   22   44:aload_0         
	//   23   45:getfield        #163 <Field jf$a b>
	//   24   48:invokevirtual   #1061 <Method void o.jp.a(jp$b)>
			}
		}
	//*  25   51:goto            55
		catch(Throwable throwable) { }
	//   26   54:astore_2        
		try
		{
			if(G == null)
	//*  27   55:aload_0         
	//*  28   56:getfield        #158 <Field js G>
	//*  29   59:ifnonnull       74
				G = new js(context);
	//   30   62:aload_0         
	//   31   63:new             #1014 <Class js>
	//   32   66:dup             
	//   33   67:aload_1         
	//   34   68:invokespecial   #1062 <Method void js(Context)>
	//   35   71:putfield        #158 <Field js G>
		}
	//*  36   74:goto            78
		// Misplaced declaration of an exception variable
		catch(Context context) { }
	//   37   77:astore_1        
		ke.b(g, "in debug mode, only for test");
	//   38   78:aload_0         
	//   39   79:getfield        #83  <Field Context g>
	//   40   82:ldc2            #1064 <String "in debug mode, only for test">
	//   41   85:invokestatic    #1067 <Method void ke.b(Context, String)>
		h();
	//   42   88:aload_0         
	//   43   89:invokespecial   #1069 <Method void h()>
		g();
	//   44   92:aload_0         
	//   45   93:invokespecial   #1071 <Method void g()>
		E = ke.b();
	//   46   96:aload_0         
	//   47   97:invokestatic    #407 <Method long ke.b()>
	//   48  100:putfield        #152 <Field long E>
	//   49  103:return          
	}

	public void d(JSONObject jsonobject)
	{
		y = jsonobject;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #118 <Field JSONObject y>
	//    3    5:return          
	}

	public jt e()
		throws Exception
	{
		jt jt1;
		String s1;
		StringBuilder stringbuilder;
		if(g == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #83  <Field Context g>
	//*   2    4:ifnonnull       18
			throw new AMapLocException("\u672A\u77E5\u7684\u9519\u8BEF");
	//    3    7:new             #761 <Class AMapLocException>
	//    4   10:dup             
	//    5   11:ldc2            #780 <String "\u672A\u77E5\u7684\u9519\u8BEF">
	//    6   14:invokespecial   #782 <Method void AMapLocException(String)>
	//    7   17:athrow          
		if(TextUtils.isEmpty(((CharSequence) (o.jq.a))))
	//*   8   18:getstatic       #504 <Field String o.jq.a>
	//*   9   21:invokestatic    #370 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  10   24:ifeq            38
			throw new AMapLocException("key\u9274\u6743\u5931\u8D25");
	//   11   27:new             #761 <Class AMapLocException>
	//   12   30:dup             
	//   13   31:ldc2            #1074 <String "key\u9274\u6743\u5931\u8D25">
	//   14   34:invokespecial   #782 <Method void AMapLocException(String)>
	//   15   37:athrow          
		if(TextUtils.isEmpty(((CharSequence) (jq.b))))
	//*  16   38:getstatic       #507 <Field String jq.b>
	//*  17   41:invokestatic    #370 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  18   44:ifeq            58
			throw new AMapLocException("key\u9274\u6743\u5931\u8D25");
	//   19   47:new             #761 <Class AMapLocException>
	//   20   50:dup             
	//   21   51:ldc2            #1074 <String "key\u9274\u6743\u5931\u8D25">
	//   22   54:invokespecial   #782 <Method void AMapLocException(String)>
	//   23   57:athrow          
		if("false".equals(((Object) (o.jy.a(y)[0]))))
	//*  24   58:ldc2            #1076 <String "false">
	//*  25   61:aload_0         
	//*  26   62:getfield        #118 <Field JSONObject y>
	//*  27   65:invokestatic    #492 <Method String[] o.jy.a(JSONObject)>
	//*  28   68:iconst_0        
	//*  29   69:aaload          
	//*  30   70:invokevirtual   #364 <Method boolean String.equals(Object)>
	//*  31   73:ifeq            97
		{
			Log.e("AuthLocation", "key\u9274\u6743\u5931\u8D25");
	//   32   76:ldc2            #1078 <String "AuthLocation">
	//   33   79:ldc2            #1074 <String "key\u9274\u6743\u5931\u8D25">
	//   34   82:invokestatic    #1083 <Method int Log.e(String, String)>
	//   35   85:pop             
			throw new AMapLocException("key\u9274\u6743\u5931\u8D25");
	//   36   86:new             #761 <Class AMapLocException>
	//   37   89:dup             
	//   38   90:ldc2            #1074 <String "key\u9274\u6743\u5931\u8D25">
	//   39   93:invokespecial   #782 <Method void AMapLocException(String)>
	//   40   96:athrow          
		}
		if(m())
	//*  41   97:aload_0         
	//*  42   98:invokespecial   #900 <Method boolean m()>
	//*  43  101:ifeq            115
		{
			f();
	//   44  104:aload_0         
	//   45  105:invokespecial   #810 <Method void f()>
			j = ke.b();
	//   46  108:aload_0         
	//   47  109:invokestatic    #407 <Method long ke.b()>
	//   48  112:putfield        #128 <Field long j>
		}
		if(n())
	//*  49  115:aload_0         
	//*  50  116:invokespecial   #902 <Method boolean n()>
	//*  51  119:ifeq            126
			t();
	//   52  122:aload_0         
	//   53  123:invokespecial   #848 <Method void t()>
		B = B + 1;
	//   54  126:aload_0         
	//   55  127:aload_0         
	//   56  128:getfield        #139 <Field int B>
	//   57  131:iconst_1        
	//   58  132:iadd            
	//   59  133:putfield        #139 <Field int B>
		if(B > 1)
	//*  60  136:aload_0         
	//*  61  137:getfield        #139 <Field int B>
	//*  62  140:iconst_1        
	//*  63  141:icmple          165
		{
			a();
	//   64  144:aload_0         
	//   65  145:invokevirtual   #1085 <Method void a()>
			if(!d && com.amap.api.location.core.a.b())
	//*  66  148:aload_0         
	//*  67  149:getfield        #156 <Field boolean d>
	//*  68  152:ifne            165
	//*  69  155:invokestatic    #871 <Method boolean a.b()>
	//*  70  158:ifeq            165
				j();
	//   71  161:aload_0         
	//   72  162:invokespecial   #1087 <Method void j()>
		}
		if(l == null)
	//*  73  165:aload_0         
	//*  74  166:getfield        #98  <Field List l>
	//*  75  169:ifnonnull       183
			l = ((List) (new ArrayList()));
	//   76  172:aload_0         
	//   77  173:new             #93  <Class ArrayList>
	//   78  176:dup             
	//   79  177:invokespecial   #94  <Method void ArrayList()>
	//   80  180:putfield        #98  <Field List l>
		if(B == 1)
	//*  81  183:aload_0         
	//*  82  184:getfield        #139 <Field int B>
	//*  83  187:iconst_1        
	//*  84  188:icmpne          239
		{
			z = o.ke.a(g);
	//   85  191:aload_0         
	//   86  192:aload_0         
	//   87  193:getfield        #83  <Field Context g>
	//   88  196:invokestatic    #1090 <Method boolean o.ke.a(Context)>
	//   89  199:putfield        #124 <Field boolean z>
			if(s() && l.isEmpty() && o != null)
	//*  90  202:aload_0         
	//*  91  203:invokespecial   #483 <Method boolean s()>
	//*  92  206:ifeq            239
	//*  93  209:aload_0         
	//*  94  210:getfield        #98  <Field List l>
	//*  95  213:invokeinterface #646 <Method boolean List.isEmpty()>
	//*  96  218:ifeq            239
	//*  97  221:aload_0         
	//*  98  222:getfield        #89  <Field WifiManager o>
	//*  99  225:ifnull          239
				l = o.getScanResults();
	//  100  228:aload_0         
	//  101  229:aload_0         
	//  102  230:getfield        #89  <Field WifiManager o>
	//  103  233:invokevirtual   #1093 <Method List WifiManager.getScanResults()>
	//  104  236:putfield        #98  <Field List l>
		}
		if(B == 1 && s() && l.isEmpty())
	//* 105  239:aload_0         
	//* 106  240:getfield        #139 <Field int B>
	//* 107  243:iconst_1        
	//* 108  244:icmpne          297
	//* 109  247:aload_0         
	//* 110  248:invokespecial   #483 <Method boolean s()>
	//* 111  251:ifeq            297
	//* 112  254:aload_0         
	//* 113  255:getfield        #98  <Field List l>
	//* 114  258:invokeinterface #646 <Method boolean List.isEmpty()>
	//* 115  263:ifeq            297
		{
			for(int i1 = 4; i1 > 0 && l.size() == 0; i1--)
	//* 116  266:iconst_4        
	//* 117  267:istore_1        
	//* 118  268:iload_1         
	//* 119  269:ifle            297
	//* 120  272:aload_0         
	//* 121  273:getfield        #98  <Field List l>
	//* 122  276:invokeinterface #218 <Method int List.size()>
	//* 123  281:ifne            297
				SystemClock.sleep(500L);
	//  124  284:ldc2w           #1094 <Long 500L>
	//  125  287:invokestatic    #1101 <Method void SystemClock.sleep(long)>

	//  126  290:iload_1         
	//  127  291:iconst_1        
	//  128  292:isub            
	//  129  293:istore_1        
		}
	//* 130  294:goto            268
		if(a(x) && v != null)
	//* 131  297:aload_0         
	//* 132  298:aload_0         
	//* 133  299:getfield        #122 <Field long x>
	//* 134  302:invokespecial   #1103 <Method boolean a(long)>
	//* 135  305:ifeq            327
	//* 136  308:aload_0         
	//* 137  309:getfield        #120 <Field jt v>
	//* 138  312:ifnull          327
		{
			x = ke.e();
	//  139  315:aload_0         
	//  140  316:invokestatic    #242 <Method long ke.e()>
	//  141  319:putfield        #122 <Field long x>
			return v;
	//  142  322:aload_0         
	//  143  323:getfield        #120 <Field jt v>
	//  144  326:areturn         
		}
		try
		{
			a(N);
	//  145  327:aload_0         
	//  146  328:aload_0         
	//  147  329:getfield        #165 <Field CellLocation N>
	//  148  332:invokespecial   #1105 <Method void a(CellLocation)>
		}
	//* 149  335:goto            345
		catch(Throwable throwable)
	//* 150  338:astore          5
		{
			throwable.printStackTrace();
	//  151  340:aload           5
	//  152  342:invokevirtual   #437 <Method void Throwable.printStackTrace()>
		}
		b(l);
	//  153  345:aload_0         
	//  154  346:aload_0         
	//  155  347:getfield        #98  <Field List l>
	//  156  350:invokespecial   #1107 <Method void b(List)>
		s1 = i();
	//  157  353:aload_0         
	//  158  354:invokespecial   #1109 <Method String i()>
	//  159  357:astore          7
		if(TextUtils.isEmpty(((CharSequence) (s1))))
	//* 160  359:aload           7
	//* 161  361:invokestatic    #370 <Method boolean TextUtils.isEmpty(CharSequence)>
	//* 162  364:ifeq            435
		{
			if(com.amap.api.location.core.a.b())
	//* 163  367:invokestatic    #871 <Method boolean a.b()>
	//* 164  370:ifeq            424
			{
				if(c != 0)
	//* 165  373:aload_0         
	//* 166  374:getfield        #154 <Field int c>
	//* 167  377:ifeq            386
					SystemClock.sleep(500L);
	//  168  380:ldc2w           #1094 <Long 500L>
	//  169  383:invokestatic    #1101 <Method void SystemClock.sleep(long)>
				if(c == 0)
	//* 170  386:aload_0         
	//* 171  387:getfield        #154 <Field int c>
	//* 172  390:ifne            424
				{
					v = e.d();
	//  173  393:aload_0         
	//  174  394:aload_0         
	//  175  395:getfield        #873 <Field jp e>
	//  176  398:invokevirtual   #1111 <Method jt o.jp.d()>
	//  177  401:putfield        #120 <Field jt v>
					r();
	//  178  404:aload_0         
	//  179  405:invokespecial   #1113 <Method void r()>
					d();
	//  180  408:aload_0         
	//  181  409:invokevirtual   #1115 <Method void d()>
					if(v != null)
	//* 182  412:aload_0         
	//* 183  413:getfield        #120 <Field jt v>
	//* 184  416:ifnull          424
						return v;
	//  185  419:aload_0         
	//  186  420:getfield        #120 <Field jt v>
	//  187  423:areturn         
				}
			}
			throw new AMapLocException("\u83B7\u53D6\u57FA\u7AD9/WiFi\u4FE1\u606F\u4E3A\u7A7A\u6216\u5931\u8D25");
	//  188  424:new             #761 <Class AMapLocException>
	//  189  427:dup             
	//  190  428:ldc2            #1117 <String "\u83B7\u53D6\u57FA\u7AD9/WiFi\u4FE1\u606F\u4E3A\u7A7A\u6216\u5931\u8D25">
	//  191  431:invokespecial   #782 <Method void AMapLocException(String)>
	//  192  434:athrow          
		}
		stringbuilder = k();
	//  193  435:aload_0         
	//  194  436:invokespecial   #1119 <Method StringBuilder k()>
	//  195  439:astore          8
		jt1 = null;
	//  196  441:aconst_null     
	//  197  442:astore          5
		jt jt2 = G.c(s1, stringbuilder, "mem");
	//  198  444:aload_0         
	//  199  445:getfield        #158 <Field js G>
	//  200  448:aload           7
	//  201  450:aload           8
	//  202  452:ldc2            #1121 <String "mem">
	//  203  455:invokevirtual   #1124 <Method jt o.js.c(String, StringBuilder, String)>
	//  204  458:astore          6
		jt1 = jt2;
	//  205  460:aload           6
	//  206  462:astore          5
		break MISSING_BLOCK_LABEL_469;
	//  207  464:goto            469
		Object obj;
		obj;
	//  208  467:astore          6
		boolean flag1 = false;
	//  209  469:iconst_0        
	//  210  470:istore_2        
		boolean flag = flag1;
	//  211  471:iload_2         
	//  212  472:istore_1        
		if(jt1 != null)
	//* 213  473:aload           5
	//* 214  475:ifnull          500
		{
			long l1 = jt1.k();
	//  215  478:aload           5
	//  216  480:invokevirtual   #248 <Method long jt.k()>
	//  217  483:lstore_3        
			flag = flag1;
	//  218  484:iload_2         
	//  219  485:istore_1        
			if(ke.e() - l1 > 0x36ee80L)
	//* 220  486:invokestatic    #242 <Method long ke.e()>
	//* 221  489:lload_3         
	//* 222  490:lsub            
	//* 223  491:ldc2w           #1125 <Long 0x36ee80L>
	//* 224  494:lcmp            
	//* 225  495:ifle            500
				flag = true;
	//  226  498:iconst_1        
	//  227  499:istore_1        
		}
		if(jt1 != null && !flag)
			break MISSING_BLOCK_LABEL_544;
	//  228  500:aload           5
	//  229  502:ifnull          509
	//  230  505:iload_1         
	//  231  506:ifeq            544
		obj = ((Object) (z()));
	//  232  509:aload_0         
	//  233  510:invokespecial   #1128 <Method jt z()>
	//  234  513:astore          6
		jt1 = ((jt) (obj));
	//  235  515:aload           6
	//  236  517:astore          5
		break MISSING_BLOCK_LABEL_535;
	//  237  519:goto            535
		obj;
	//  238  522:astore          6
		if(jt1 == null)
	//* 239  524:aload           5
	//* 240  526:ifnull          532
	//* 241  529:goto            535
			throw obj;
	//  242  532:aload           6
	//  243  534:athrow          
		v = jt1;
	//  244  535:aload_0         
	//  245  536:aload           5
	//  246  538:putfield        #120 <Field jt v>
		break MISSING_BLOCK_LABEL_550;
	//  247  541:goto            550
		v = jt1;
	//  248  544:aload_0         
	//  249  545:aload           5
	//  250  547:putfield        #120 <Field jt v>
		G.a(s1, v, stringbuilder);
	//  251  550:aload_0         
	//  252  551:getfield        #158 <Field js G>
	//  253  554:aload           7
	//  254  556:aload_0         
	//  255  557:getfield        #120 <Field jt v>
	//  256  560:aload           8
	//  257  562:invokevirtual   #1131 <Method void o.js.a(String, jt, StringBuilder)>
		stringbuilder.delete(0, stringbuilder.length());
	//  258  565:aload           8
	//  259  567:iconst_0        
	//  260  568:aload           8
	//  261  570:invokevirtual   #561 <Method int StringBuilder.length()>
	//  262  573:invokevirtual   #565 <Method StringBuilder StringBuilder.delete(int, int)>
	//  263  576:pop             
		x = ke.e();
	//  264  577:aload_0         
	//  265  578:invokestatic    #242 <Method long ke.e()>
	//  266  581:putfield        #122 <Field long x>
		r();
	//  267  584:aload_0         
	//  268  585:invokespecial   #1113 <Method void r()>
		d();
	//  269  588:aload_0         
	//  270  589:invokevirtual   #1115 <Method void d()>
		return v;
	//  271  592:aload_0         
	//  272  593:getfield        #120 <Field jt v>
	//  273  596:areturn         
	}

	private jy A;
	private int B;
	private long C;
	private long D;
	private long E;
	private StringBuilder F;
	private js G;
	private String H;
	private kk I;
	private boolean J;
	private CellLocation N;
	TimerTask a;
	a b;
	int c;
	boolean d;
	jp e;
	private int f;
	private Context g;
	in h;
	Timer i;
	private long j;
	int k;
	private List l;
	private TelephonyManager m;
	private ConnectivityManager n;
	private WifiManager o;
	private List p;
	private Map q;
	private int r;
	private e s;
	private PhoneStateListener t;
	private Map u;
	private jt v;
	private WifiInfo w;
	private long x;
	private JSONObject y;
	private boolean z;
}
