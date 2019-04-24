// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import android.content.*;
import android.net.wifi.WifiManager;
import java.util.ArrayList;

// Referenced classes of package o:
//			jf, ke, jq

class jf$e extends BroadcastReceiver
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
		context = ((Context) (jf.c(a)));
	//   10   19:aload_0         
	//   11   20:getfield        #13  <Field jf a>
	//   12   23:invokestatic    #44  <Method WifiManager jf.c(jf)>
	//   13   26:astore_1        
		if(context == null)
	//*  14   27:aload_1         
	//*  15   28:ifnonnull       32
			return;
	//   16   31:return          
		int i;
		int j;
		try
		{
			jf.d(a, jf.c(a).getScanResults());
	//   17   32:aload_0         
	//   18   33:getfield        #13  <Field jf a>
	//   19   36:aload_0         
	//   20   37:getfield        #13  <Field jf a>
	//   21   40:invokestatic    #44  <Method WifiManager jf.c(jf)>
	//   22   43:invokevirtual   #50  <Method java.util.List WifiManager.getScanResults()>
	//   23   46:invokestatic    #54  <Method java.util.List jf.d(jf, java.util.List)>
	//   24   49:pop             
			jf.c(a, ke.b());
	//   25   50:aload_0         
	//   26   51:getfield        #13  <Field jf a>
	//   27   54:invokestatic    #60  <Method long ke.b()>
	//   28   57:invokestatic    #63  <Method long jf.c(jf, long)>
	//   29   60:pop2            
			if(jf.d(a) == null)
	//*  30   61:aload_0         
	//*  31   62:getfield        #13  <Field jf a>
	//*  32   65:invokestatic    #66  <Method java.util.List jf.d(jf)>
	//*  33   68:ifnonnull       317
				jf.d(a, ((java.util.List) (new ArrayList())));
	//   34   71:aload_0         
	//   35   72:getfield        #13  <Field jf a>
	//   36   75:new             #68  <Class ArrayList>
	//   37   78:dup             
	//   38   79:invokespecial   #69  <Method void ArrayList()>
	//   39   82:invokestatic    #54  <Method java.util.List jf.d(jf, java.util.List)>
	//   40   85:pop             
		}
	//*  41   86:goto            317
	//*  42   89:aload_2         
	//*  43   90:ldc1            #71  <String "android.net.wifi.WIFI_STATE_CHANGED">
	//*  44   92:invokevirtual   #40  <Method boolean String.equals(Object)>
	//*  45   95:ifeq            201
	//*  46   98:aload_0         
	//*  47   99:getfield        #13  <Field jf a>
	//*  48  102:invokestatic    #44  <Method WifiManager jf.c(jf)>
	//*  49  105:astore_1        
	//*  50  106:aload_1         
	//*  51  107:ifnonnull       111
	//*  52  110:return          
	//*  53  111:iconst_4        
	//*  54  112:istore_3        
	//*  55  113:aload_0         
	//*  56  114:getfield        #13  <Field jf a>
	//*  57  117:invokestatic    #44  <Method WifiManager jf.c(jf)>
	//*  58  120:invokevirtual   #75  <Method int WifiManager.getWifiState()>
	//*  59  123:istore          4
	//*  60  125:iload           4
	//*  61  127:istore_3        
	//*  62  128:goto            132
	//*  63  131:astore_1        
	//*  64  132:iload_3         
	//*  65  133:tableswitch     0 4: default 168
	//	               0 181
	//	               1 171
	//	               2 324
	//	               3 324
	//	               4 191
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
	//* 115  288:invokestatic    #113 <Method boolean ke.a(Context)>
	//* 116  291:invokestatic    #116 <Method boolean jf.c(jf, boolean)>
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
		context = ((Context) (jf.c(a)));
		if(context == null)
			return;
		i = 4;
		j = jf.c(a).getWifiState();
		i = j;
		break MISSING_BLOCK_LABEL_132;
		context;
		i;
		JVM INSTR tableswitch 0 4: default 168
	//	               0 181
	//	               1 171
	//	               2 324
	//	               3 324
	//	               4 191;
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
			jf.c(a, ke.a(context));
			break MISSING_BLOCK_LABEL_317;
		}
		if(((String) (intent)).equals("android.net.conn.CONNECTIVITY_CHANGE"))
			a.b(true, 2);
		return;
	//  134  324:return          
	}

	final jf a;

	private jf$e(jf jf1)
	{
		a = jf1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #13  <Field jf a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #16  <Method void BroadcastReceiver()>
	//    5    9:return          
	}

	jf$e(jf jf1, jf$3 jf$3)
	{
		this(jf1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #20  <Method void jf$e(jf)>
	//    3    5:return          
	}
}
