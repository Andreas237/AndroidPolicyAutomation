// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import android.content.*;
import android.content.pm.*;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.location.LocationManager;
import android.net.wifi.*;
import android.os.Build;
import android.os.Looper;
import android.telephony.*;
import android.telephony.cdma.CdmaCellLocation;
import android.telephony.gsm.GsmCellLocation;
import android.text.TextUtils;
import java.lang.reflect.Method;
import java.util.*;

// Referenced classes of package o:
//			jo, im, it, iz, 
//			iy, ir

public final class iq
{

	private iq(Context context)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #65  <Method void Object()>
		e = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #67  <Field Context e>
		c = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #69  <Field TelephonyManager c>
		a = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #71  <Field LocationManager a>
		d = null;
	//   11   19:aload_0         
	//   12   20:aconst_null     
	//   13   21:putfield        #73  <Field WifiManager d>
		b = null;
	//   14   24:aload_0         
	//   15   25:aconst_null     
	//   16   26:putfield        #75  <Field SensorManager b>
		g = "";
	//   17   29:aload_0         
	//   18   30:ldc1            #77  <String "">
	//   19   32:putfield        #79  <Field String g>
		i = "";
	//   20   35:aload_0         
	//   21   36:ldc1            #77  <String "">
	//   22   38:putfield        #81  <Field String i>
		f = "";
	//   23   41:aload_0         
	//   24   42:ldc1            #77  <String "">
	//   25   44:putfield        #83  <Field String f>
		k = false;
	//   26   47:aload_0         
	//   27   48:iconst_0        
	//   28   49:putfield        #85  <Field boolean k>
		h = 0;
	//   29   52:aload_0         
	//   30   53:iconst_0        
	//   31   54:putfield        #87  <Field int h>
		m = false;
	//   32   57:aload_0         
	//   33   58:iconst_0        
	//   34   59:putfield        #89  <Field boolean m>
		p = -1L;
	//   35   62:aload_0         
	//   36   63:ldc2w           #90  <Long -1L>
	//   37   66:putfield        #93  <Field long p>
		n = "";
	//   38   69:aload_0         
	//   39   70:ldc1            #77  <String "">
	//   40   72:putfield        #95  <Field String n>
		l = "";
	//   41   75:aload_0         
	//   42   76:ldc1            #77  <String "">
	//   43   78:putfield        #97  <Field String l>
		o = 0;
	//   44   81:aload_0         
	//   45   82:iconst_0        
	//   46   83:putfield        #99  <Field int o>
		u = 0;
	//   47   86:aload_0         
	//   48   87:iconst_0        
	//   49   88:putfield        #101 <Field int u>
		s = 0;
	//   50   91:aload_0         
	//   51   92:iconst_0        
	//   52   93:putfield        #103 <Field int s>
		q = "";
	//   53   96:aload_0         
	//   54   97:ldc1            #77  <String "">
	//   55   99:putfield        #105 <Field String q>
		t = 0L;
	//   56  102:aload_0         
	//   57  103:lconst_0        
	//   58  104:putfield        #107 <Field long t>
		r = 0L;
	//   59  107:aload_0         
	//   60  108:lconst_0        
	//   61  109:putfield        #109 <Field long r>
		z = null;
	//   62  112:aload_0         
	//   63  113:aconst_null     
	//   64  114:putfield        #111 <Field ir z>
		x = null;
	//   65  117:aload_0         
	//   66  118:aconst_null     
	//   67  119:putfield        #113 <Field iy x>
		w = null;
	//   68  122:aload_0         
	//   69  123:aconst_null     
	//   70  124:putfield        #115 <Field CellLocation w>
		v = null;
	//   71  127:aload_0         
	//   72  128:aconst_null     
	//   73  129:putfield        #117 <Field iz v>
		j = ((List) (new ArrayList()));
	//   74  132:aload_0         
	//   75  133:new             #119 <Class ArrayList>
	//   76  136:dup             
	//   77  137:invokespecial   #120 <Method void ArrayList()>
	//   78  140:putfield        #122 <Field List j>
		B = null;
	//   79  143:aload_0         
	//   80  144:aconst_null     
	//   81  145:putfield        #124 <Field Timer B>
		A = null;
	//   82  148:aload_0         
	//   83  149:aconst_null     
	//   84  150:putfield        #126 <Field Thread A>
		C = null;
	//   85  153:aload_0         
	//   86  154:aconst_null     
	//   87  155:putfield        #128 <Field Looper C>
		if(context == null)
	//*  88  158:aload_1         
	//*  89  159:ifnonnull       163
			return;
	//   90  162:return          
		e = context;
	//   91  163:aload_0         
	//   92  164:aload_1         
	//   93  165:putfield        #67  <Field Context e>
		g = Build.MODEL;
	//   94  168:aload_0         
	//   95  169:getstatic       #133 <Field String Build.MODEL>
	//   96  172:putfield        #79  <Field String g>
		c = (TelephonyManager)context.getSystemService("phone");
	//   97  175:aload_0         
	//   98  176:aload_1         
	//   99  177:ldc1            #135 <String "phone">
	//  100  179:invokevirtual   #141 <Method Object Context.getSystemService(String)>
	//  101  182:checkcast       #143 <Class TelephonyManager>
	//  102  185:putfield        #69  <Field TelephonyManager c>
		a = (LocationManager)context.getSystemService("location");
	//  103  188:aload_0         
	//  104  189:aload_1         
	//  105  190:ldc1            #145 <String "location">
	//  106  192:invokevirtual   #141 <Method Object Context.getSystemService(String)>
	//  107  195:checkcast       #147 <Class LocationManager>
	//  108  198:putfield        #71  <Field LocationManager a>
		d = (WifiManager)context.getSystemService("wifi");
	//  109  201:aload_0         
	//  110  202:aload_1         
	//  111  203:ldc1            #149 <String "wifi">
	//  112  205:invokevirtual   #141 <Method Object Context.getSystemService(String)>
	//  113  208:checkcast       #151 <Class WifiManager>
	//  114  211:putfield        #73  <Field WifiManager d>
		b = (SensorManager)context.getSystemService("sensor");
	//  115  214:aload_0         
	//  116  215:aload_1         
	//  117  216:ldc1            #153 <String "sensor">
	//  118  218:invokevirtual   #141 <Method Object Context.getSystemService(String)>
	//  119  221:checkcast       #155 <Class SensorManager>
	//  120  224:putfield        #75  <Field SensorManager b>
		if(c == null || d == null)
	//* 121  227:aload_0         
	//* 122  228:getfield        #69  <Field TelephonyManager c>
	//* 123  231:ifnull          241
	//* 124  234:aload_0         
	//* 125  235:getfield        #73  <Field WifiManager d>
	//* 126  238:ifnonnull       242
			return;
	//  127  241:return          
		boolean flag;
		String as[];
		try
		{
			i = c.getDeviceId();
	//  128  242:aload_0         
	//  129  243:aload_0         
	//  130  244:getfield        #69  <Field TelephonyManager c>
	//  131  247:invokevirtual   #159 <Method String TelephonyManager.getDeviceId()>
	//  132  250:putfield        #81  <Field String i>
		}
	//* 133  253:aload_0         
	//* 134  254:aload_0         
	//* 135  255:getfield        #69  <Field TelephonyManager c>
	//* 136  258:invokevirtual   #162 <Method String TelephonyManager.getSubscriberId()>
	//* 137  261:putfield        #83  <Field String f>
	//* 138  264:aload_0         
	//* 139  265:getfield        #73  <Field WifiManager d>
	//* 140  268:invokevirtual   #166 <Method WifiInfo WifiManager.getConnectionInfo()>
	//* 141  271:ifnull          320
	//* 142  274:aload_0         
	//* 143  275:aload_0         
	//* 144  276:getfield        #73  <Field WifiManager d>
	//* 145  279:invokevirtual   #166 <Method WifiInfo WifiManager.getConnectionInfo()>
	//* 146  282:invokevirtual   #171 <Method String WifiInfo.getMacAddress()>
	//* 147  285:putfield        #97  <Field String l>
	//* 148  288:aload_0         
	//* 149  289:getfield        #97  <Field String l>
	//* 150  292:ifnull          320
	//* 151  295:aload_0         
	//* 152  296:getfield        #97  <Field String l>
	//* 153  299:invokevirtual   #177 <Method int String.length()>
	//* 154  302:ifle            320
	//* 155  305:aload_0         
	//* 156  306:aload_0         
	//* 157  307:getfield        #97  <Field String l>
	//* 158  310:ldc1            #179 <String ":">
	//* 159  312:ldc1            #77  <String "">
	//* 160  314:invokevirtual   #183 <Method String String.replace(CharSequence, CharSequence)>
	//* 161  317:putfield        #97  <Field String l>
	//* 162  320:aload_0         
	//* 163  321:getfield        #69  <Field TelephonyManager c>
	//* 164  324:invokestatic    #186 <Method String[] b(TelephonyManager)>
	//* 165  327:astore_3        
	//* 166  328:aload_0         
	//* 167  329:aload_3         
	//* 168  330:iconst_0        
	//* 169  331:aaload          
	//* 170  332:invokestatic    #192 <Method int Integer.parseInt(String)>
	//* 171  335:putfield        #99  <Field int o>
	//* 172  338:aload_0         
	//* 173  339:aload_3         
	//* 174  340:iconst_1        
	//* 175  341:aaload          
	//* 176  342:invokestatic    #192 <Method int Integer.parseInt(String)>
	//* 177  345:putfield        #101 <Field int u>
	//* 178  348:aload_0         
	//* 179  349:aload_0         
	//* 180  350:getfield        #69  <Field TelephonyManager c>
	//* 181  353:invokevirtual   #195 <Method int TelephonyManager.getNetworkType()>
	//* 182  356:putfield        #103 <Field int s>
	//* 183  359:aload_0         
	//* 184  360:aload_1         
	//* 185  361:invokevirtual   #198 <Method String Context.getPackageName()>
	//* 186  364:putfield        #105 <Field String q>
	//* 187  367:aload_0         
	//* 188  368:getfield        #69  <Field TelephonyManager c>
	//* 189  371:invokevirtual   #201 <Method int TelephonyManager.getPhoneType()>
	//* 190  374:iconst_2        
	//* 191  375:icmpne          383
	//* 192  378:iconst_1        
	//* 193  379:istore_2        
	//* 194  380:goto            385
	//* 195  383:iconst_0        
	//* 196  384:istore_2        
	//* 197  385:aload_0         
	//* 198  386:iload_2         
	//* 199  387:putfield        #85  <Field boolean k>
	//* 200  390:return          
		catch(Exception exception) { }
	//  201  391:astore_3        
		f = c.getSubscriberId();
		if(d.getConnectionInfo() != null)
		{
			l = d.getConnectionInfo().getMacAddress();
			if(l != null && l.length() > 0)
				l = l.replace(":", "");
		}
		as = b(c);
		o = Integer.parseInt(as[0]);
		u = Integer.parseInt(as[1]);
		s = c.getNetworkType();
		q = context.getPackageName();
		if(c.getPhoneType() == 2)
			flag = true;
		else
			flag = false;
		k = flag;
	//* 202  392:goto            253
	}

	static int A()
	{
		return D;
	//    0    0:getstatic       #58  <Field int D>
	//    1    3:ireturn         
	}

	private void B()
	{
		if(d == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #73  <Field WifiManager d>
	//*   2    4:ifnonnull       8
			return;
	//    3    7:return          
		try
		{
			if(jo.a)
	//*   4    8:getstatic       #205 <Field boolean jo.a>
	//*   5   11:ifeq            22
				d.startScan();
	//    6   14:aload_0         
	//    7   15:getfield        #73  <Field WifiManager d>
	//    8   18:invokevirtual   #209 <Method boolean WifiManager.startScan()>
	//    9   21:pop             
			return;
	//   10   22:return          
		}
		catch(Exception exception)
	//*  11   23:astore_1        
		{
			return;
	//   12   24:return          
		}
	}

	private CellLocation D()
	{
		if(c == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #69  <Field TelephonyManager c>
	//*   2    4:ifnonnull       9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		CellLocation celllocation;
		try
		{
			celllocation = b((List)im.c(((Object) (c)), "getAllCellInfo", new Object[0]));
	//    5    9:aload_0         
	//    6   10:getfield        #69  <Field TelephonyManager c>
	//    7   13:ldc1            #214 <String "getAllCellInfo">
	//    8   15:iconst_0        
	//    9   16:anewarray       Object[]
	//   10   19:invokestatic    #219 <Method Object im.c(Object, String, Object[])>
	//   11   22:checkcast       #221 <Class List>
	//   12   25:invokestatic    #224 <Method CellLocation b(List)>
	//   13   28:astore_1        
		}
	//*  14   29:aload_1         
	//*  15   30:areturn         
		catch(Object obj)
	//*  16   31:astore_1        
		{
			return null;
	//   17   32:aconst_null     
	//   18   33:areturn         
		}
		return celllocation;
	}

	static long a(iq iq1, long l1)
	{
		iq1.p = l1;
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:putfield        #93  <Field long p>
		return l1;
	//    3    5:lload_1         
	//    4    6:lreturn         
	}

	static String a(iq iq1, String s1)
	{
		iq1.n = s1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #95  <Field String n>
		return s1;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

	static Timer a(iq iq1)
	{
		return iq1.B;
	//    0    0:aload_0         
	//    1    1:getfield        #124 <Field Timer B>
	//    2    4:areturn         
	}

	static Timer a(iq iq1, Timer timer)
	{
		iq1.B = timer;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #124 <Field Timer B>
		return timer;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

	static ir a(iq iq1, ir ir)
	{
		iq1.z = ir;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #111 <Field ir z>
		return ir;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

	private static void a(List list)
	{
		if(list == null || list.size() <= 0)
	//*   0    0:aload_0         
	//*   1    1:ifnull          13
	//*   2    4:aload_0         
	//*   3    5:invokeinterface #233 <Method int List.size()>
	//*   4   10:ifgt            14
			return;
	//    5   13:return          
		HashMap hashmap = new HashMap();
	//    6   14:new             #235 <Class HashMap>
	//    7   17:dup             
	//    8   18:invokespecial   #236 <Method void HashMap()>
	//    9   21:astore_2        
		for(int i1 = 0; i1 < list.size(); i1++)
	//*  10   22:iconst_0        
	//*  11   23:istore_1        
	//*  12   24:iload_1         
	//*  13   25:aload_0         
	//*  14   26:invokeinterface #233 <Method int List.size()>
	//*  15   31:icmpge          78
		{
			ScanResult scanresult = (ScanResult)list.get(i1);
	//   16   34:aload_0         
	//   17   35:iload_1         
	//   18   36:invokeinterface #240 <Method Object List.get(int)>
	//   19   41:checkcast       #242 <Class ScanResult>
	//   20   44:astore_3        
			if(scanresult.SSID == null)
	//*  21   45:aload_3         
	//*  22   46:getfield        #245 <Field String ScanResult.SSID>
	//*  23   49:ifnonnull       58
				scanresult.SSID = "null";
	//   24   52:aload_3         
	//   25   53:ldc1            #247 <String "null">
	//   26   55:putfield        #245 <Field String ScanResult.SSID>
			hashmap.put(((Object) (Integer.valueOf(scanresult.level))), ((Object) (scanresult)));
	//   27   58:aload_2         
	//   28   59:aload_3         
	//   29   60:getfield        #250 <Field int ScanResult.level>
	//   30   63:invokestatic    #254 <Method Integer Integer.valueOf(int)>
	//   31   66:aload_3         
	//   32   67:invokevirtual   #258 <Method Object HashMap.put(Object, Object)>
	//   33   70:pop             
		}

	//   34   71:iload_1         
	//   35   72:iconst_1        
	//   36   73:iadd            
	//   37   74:istore_1        
	//*  38   75:goto            24
		TreeMap treemap = new TreeMap(Collections.reverseOrder());
	//   39   78:new             #260 <Class TreeMap>
	//   40   81:dup             
	//   41   82:invokestatic    #266 <Method java.util.Comparator Collections.reverseOrder()>
	//   42   85:invokespecial   #269 <Method void TreeMap(java.util.Comparator)>
	//   43   88:astore_3        
		treemap.putAll(((java.util.Map) (hashmap)));
	//   44   89:aload_3         
	//   45   90:aload_2         
	//   46   91:invokevirtual   #273 <Method void TreeMap.putAll(java.util.Map)>
		list.clear();
	//   47   94:aload_0         
	//   48   95:invokeinterface #276 <Method void List.clear()>
		for(Iterator iterator = treemap.keySet().iterator(); iterator.hasNext(); list.add(treemap.get(((Object) ((Integer)iterator.next())))));
	//   49  100:aload_3         
	//   50  101:invokevirtual   #280 <Method Set TreeMap.keySet()>
	//   51  104:invokeinterface #286 <Method Iterator Set.iterator()>
	//   52  109:astore          4
	//   53  111:aload           4
	//   54  113:invokeinterface #291 <Method boolean Iterator.hasNext()>
	//   55  118:ifeq            145
	//   56  121:aload_0         
	//   57  122:aload_3         
	//   58  123:aload           4
	//   59  125:invokeinterface #295 <Method Object Iterator.next()>
	//   60  130:checkcast       #188 <Class Integer>
	//   61  133:invokevirtual   #298 <Method Object TreeMap.get(Object)>
	//   62  136:invokeinterface #302 <Method boolean List.add(Object)>
	//   63  141:pop             
	//*  64  142:goto            111
		hashmap.clear();
	//   65  145:aload_2         
	//   66  146:invokevirtual   #303 <Method void HashMap.clear()>
		treemap.clear();
	//   67  149:aload_3         
	//   68  150:invokevirtual   #304 <Method void TreeMap.clear()>
	//   69  153:return          
	}

	static void a(iq iq1, PhoneStateListener phonestatelistener)
	{
		if(iq1.c != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #69  <Field TelephonyManager c>
	//*   2    4:ifnull          18
			iq1.c.listen(phonestatelistener, 273);
	//    3    7:aload_0         
	//    4    8:getfield        #69  <Field TelephonyManager c>
	//    5   11:aload_1         
	//    6   12:sipush          273
	//    7   15:invokevirtual   #309 <Method void TelephonyManager.listen(PhoneStateListener, int)>
	//    8   18:return          
	}

	private static int b(Object obj)
	{
		Method method = ((Class) (android/hardware/Sensor)).getDeclaredMethod("getMinDelay", ((Class []) (null)));
	//    0    0:ldc2            #312 <Class Sensor>
	//    1    3:ldc2            #314 <String "getMinDelay">
	//    2    6:aconst_null     
	//    3    7:invokevirtual   #320 <Method Method Class.getDeclaredMethod(String, Class[])>
	//    4   10:astore_2        
		if(method == null)
			break MISSING_BLOCK_LABEL_34;
	//    5   11:aload_2         
	//    6   12:ifnull          30
		int i1 = ((Integer)method.invoke(obj, ((Object []) (null)))).intValue();
	//    7   15:aload_2         
	//    8   16:aload_0         
	//    9   17:aconst_null     
	//   10   18:invokevirtual   #326 <Method Object Method.invoke(Object, Object[])>
	//   11   21:checkcast       #188 <Class Integer>
	//   12   24:invokevirtual   #329 <Method int Integer.intValue()>
	//   13   27:istore_1        
		return i1;
	//   14   28:iload_1         
	//   15   29:ireturn         
	//*  16   30:goto            34
		obj;
	//   17   33:astore_0        
		return 0;
	//   18   34:iconst_0        
	//   19   35:ireturn         
	}

	static int b(iq iq1, int i1)
	{
		iq1.h = i1;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #87  <Field int h>
		return i1;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

	private static CellLocation b(List list)
	{
		byte byte0;
		int i1;
		CdmaCellLocation cdmacelllocation;
		Object obj1;
		ClassLoader classloader;
		if(list == null || list.isEmpty())
	//*   0    0:aload_0         
	//*   1    1:ifnull          13
	//*   2    4:aload_0         
	//*   3    5:invokeinterface #333 <Method boolean List.isEmpty()>
	//*   4   10:ifeq            15
			return null;
	//    5   13:aconst_null     
	//    6   14:areturn         
		classloader = ClassLoader.getSystemClassLoader();
	//    7   15:invokestatic    #339 <Method ClassLoader ClassLoader.getSystemClassLoader()>
	//    8   18:astore          13
		obj1 = null;
	//    9   20:aconst_null     
	//   10   21:astore          10
		cdmacelllocation = null;
	//   11   23:aconst_null     
	//   12   24:astore          9
		byte0 = 0;
	//   13   26:iconst_0        
	//   14   27:istore_1        
		i1 = 0;
	//   15   28:iconst_0        
	//   16   29:istore_3        
_L2:
		byte byte1;
		Object obj;
		Object obj2;
		CdmaCellLocation cdmacelllocation1;
		Object obj3;
		obj = obj1;
	//   17   30:aload           10
	//   18   32:astore          8
		obj2 = ((Object) (cdmacelllocation));
	//   19   34:aload           9
	//   20   36:astore          11
		byte1 = byte0;
	//   21   38:iload_1         
	//   22   39:istore_2        
		if(i1 >= list.size())
			break; /* Loop/switch isn't completed */
	//   23   40:iload_3         
	//   24   41:aload_0         
	//   25   42:invokeinterface #233 <Method int List.size()>
	//   26   47:icmpge          806
		obj3 = list.get(i1);
	//   27   50:aload_0         
	//   28   51:iload_3         
	//   29   52:invokeinterface #240 <Method Object List.get(int)>
	//   30   57:astore          14
		obj2 = obj1;
	//   31   59:aload           10
	//   32   61:astore          11
		cdmacelllocation1 = cdmacelllocation;
	//   33   63:aload           9
	//   34   65:astore          12
		byte1 = byte0;
	//   35   67:iload_1         
	//   36   68:istore_2        
		if(obj3 == null)
			break MISSING_BLOCK_LABEL_789;
	//   37   69:aload           14
	//   38   71:ifnull          789
		obj2 = obj1;
	//   39   74:aload           10
	//   40   76:astore          11
		cdmacelllocation1 = cdmacelllocation;
	//   41   78:aload           9
	//   42   80:astore          12
		byte1 = byte0;
	//   43   82:iload_1         
	//   44   83:istore_2        
		Class class2 = classloader.loadClass("android.telephony.CellInfoGsm");
	//   45   84:aload           13
	//   46   86:ldc2            #341 <String "android.telephony.CellInfoGsm">
	//   47   89:invokevirtual   #345 <Method Class ClassLoader.loadClass(String)>
	//   48   92:astore          16
		obj2 = obj1;
	//   49   94:aload           10
	//   50   96:astore          11
		cdmacelllocation1 = cdmacelllocation;
	//   51   98:aload           9
	//   52  100:astore          12
		byte1 = byte0;
	//   53  102:iload_1         
	//   54  103:istore_2        
		Class class3 = classloader.loadClass("android.telephony.CellInfoWcdma");
	//   55  104:aload           13
	//   56  106:ldc2            #347 <String "android.telephony.CellInfoWcdma">
	//   57  109:invokevirtual   #345 <Method Class ClassLoader.loadClass(String)>
	//   58  112:astore          17
		obj2 = obj1;
	//   59  114:aload           10
	//   60  116:astore          11
		cdmacelllocation1 = cdmacelllocation;
	//   61  118:aload           9
	//   62  120:astore          12
		byte1 = byte0;
	//   63  122:iload_1         
	//   64  123:istore_2        
		Class class4 = classloader.loadClass("android.telephony.CellInfoLte");
	//   65  124:aload           13
	//   66  126:ldc2            #349 <String "android.telephony.CellInfoLte">
	//   67  129:invokevirtual   #345 <Method Class ClassLoader.loadClass(String)>
	//   68  132:astore          18
		obj2 = obj1;
	//   69  134:aload           10
	//   70  136:astore          11
		cdmacelllocation1 = cdmacelllocation;
	//   71  138:aload           9
	//   72  140:astore          12
		byte1 = byte0;
	//   73  142:iload_1         
	//   74  143:istore_2        
		Class class1 = classloader.loadClass("android.telephony.CellInfoCdma");
	//   75  144:aload           13
	//   76  146:ldc2            #351 <String "android.telephony.CellInfoCdma">
	//   77  149:invokevirtual   #345 <Method Class ClassLoader.loadClass(String)>
	//   78  152:astore          15
		obj2 = obj1;
	//   79  154:aload           10
	//   80  156:astore          11
		cdmacelllocation1 = cdmacelllocation;
	//   81  158:aload           9
	//   82  160:astore          12
		byte1 = byte0;
	//   83  162:iload_1         
	//   84  163:istore_2        
		if(class2.isInstance(obj3))
	//*  85  164:aload           16
	//*  86  166:aload           14
	//*  87  168:invokevirtual   #354 <Method boolean Class.isInstance(Object)>
	//*  88  171:ifeq            179
		{
			byte0 = 1;
	//   89  174:iconst_1        
	//   90  175:istore_1        
			break MISSING_BLOCK_LABEL_254;
	//   91  176:goto            254
		}
		obj2 = obj1;
	//   92  179:aload           10
	//   93  181:astore          11
		cdmacelllocation1 = cdmacelllocation;
	//   94  183:aload           9
	//   95  185:astore          12
		byte1 = byte0;
	//   96  187:iload_1         
	//   97  188:istore_2        
		if(class3.isInstance(obj3))
	//*  98  189:aload           17
	//*  99  191:aload           14
	//* 100  193:invokevirtual   #354 <Method boolean Class.isInstance(Object)>
	//* 101  196:ifeq            204
		{
			byte0 = 2;
	//  102  199:iconst_2        
	//  103  200:istore_1        
			break MISSING_BLOCK_LABEL_254;
	//  104  201:goto            254
		}
		obj2 = obj1;
	//  105  204:aload           10
	//  106  206:astore          11
		cdmacelllocation1 = cdmacelllocation;
	//  107  208:aload           9
	//  108  210:astore          12
		byte1 = byte0;
	//  109  212:iload_1         
	//  110  213:istore_2        
		if(class4.isInstance(obj3))
	//* 111  214:aload           18
	//* 112  216:aload           14
	//* 113  218:invokevirtual   #354 <Method boolean Class.isInstance(Object)>
	//* 114  221:ifeq            229
		{
			byte0 = 3;
	//  115  224:iconst_3        
	//  116  225:istore_1        
			break MISSING_BLOCK_LABEL_254;
	//  117  226:goto            254
		}
		obj2 = obj1;
	//  118  229:aload           10
	//  119  231:astore          11
		cdmacelllocation1 = cdmacelllocation;
	//  120  233:aload           9
	//  121  235:astore          12
		byte1 = byte0;
	//  122  237:iload_1         
	//  123  238:istore_2        
		if(class1.isInstance(obj3))
	//* 124  239:aload           15
	//* 125  241:aload           14
	//* 126  243:invokevirtual   #354 <Method boolean Class.isInstance(Object)>
	//* 127  246:ifeq            822
			byte0 = 4;
	//  128  249:iconst_4        
	//  129  250:istore_1        
		else
	//* 130  251:goto            254
	//* 131  254:iload_1         
	//* 132  255:ifle            779
	//* 133  258:aconst_null     
	//* 134  259:astore          8
	//* 135  261:iload_1         
	//* 136  262:iconst_1        
	//* 137  263:icmpne          288
	//* 138  266:aload           10
	//* 139  268:astore          11
	//* 140  270:aload           9
	//* 141  272:astore          12
	//* 142  274:iload_1         
	//* 143  275:istore_2        
	//* 144  276:aload           16
	//* 145  278:aload           14
	//* 146  280:invokevirtual   #357 <Method Object Class.cast(Object)>
	//* 147  283:astore          8
	//* 148  285:goto            366
	//* 149  288:iload_1         
	//* 150  289:iconst_2        
	//* 151  290:icmpne          315
	//* 152  293:aload           10
	//* 153  295:astore          11
	//* 154  297:aload           9
	//* 155  299:astore          12
	//* 156  301:iload_1         
	//* 157  302:istore_2        
	//* 158  303:aload           17
	//* 159  305:aload           14
	//* 160  307:invokevirtual   #357 <Method Object Class.cast(Object)>
	//* 161  310:astore          8
	//* 162  312:goto            366
	//* 163  315:iload_1         
	//* 164  316:iconst_3        
	//* 165  317:icmpne          342
	//* 166  320:aload           10
	//* 167  322:astore          11
	//* 168  324:aload           9
	//* 169  326:astore          12
	//* 170  328:iload_1         
	//* 171  329:istore_2        
	//* 172  330:aload           18
	//* 173  332:aload           14
	//* 174  334:invokevirtual   #357 <Method Object Class.cast(Object)>
	//* 175  337:astore          8
	//* 176  339:goto            366
	//* 177  342:iload_1         
	//* 178  343:iconst_4        
	//* 179  344:icmpne          366
	//* 180  347:aload           10
	//* 181  349:astore          11
	//* 182  351:aload           9
	//* 183  353:astore          12
	//* 184  355:iload_1         
	//* 185  356:istore_2        
	//* 186  357:aload           15
	//* 187  359:aload           14
	//* 188  361:invokevirtual   #357 <Method Object Class.cast(Object)>
	//* 189  364:astore          8
	//* 190  366:aload           10
	//* 191  368:astore          11
	//* 192  370:aload           9
	//* 193  372:astore          12
	//* 194  374:iload_1         
	//* 195  375:istore_2        
	//* 196  376:aload           8
	//* 197  378:ldc2            #359 <String "getCellIdentity">
	//* 198  381:iconst_0        
	//* 199  382:anewarray       Object[]
	//* 200  385:invokestatic    #219 <Method Object im.c(Object, String, Object[])>
	//* 201  388:astore          8
	//* 202  390:aload           8
	//* 203  392:ifnonnull       408
	//* 204  395:aload           10
	//* 205  397:astore          11
	//* 206  399:aload           9
	//* 207  401:astore          12
	//* 208  403:iload_1         
	//* 209  404:istore_2        
	//* 210  405:goto            789
	//* 211  408:iload_1         
	//* 212  409:iconst_4        
	//* 213  410:icmpne          576
	//* 214  413:aload           10
	//* 215  415:astore          11
	//* 216  417:aload           9
	//* 217  419:astore          12
	//* 218  421:iload_1         
	//* 219  422:istore_2        
	//* 220  423:new             #361 <Class CdmaCellLocation>
	//* 221  426:dup             
	//* 222  427:invokespecial   #362 <Method void CdmaCellLocation()>
	//* 223  430:astore          9
	//* 224  432:aload           10
	//* 225  434:astore          11
	//* 226  436:aload           9
	//* 227  438:astore          12
	//* 228  440:iload_1         
	//* 229  441:istore_2        
	//* 230  442:aload           8
	//* 231  444:ldc2            #364 <String "getSystemId">
	//* 232  447:iconst_0        
	//* 233  448:anewarray       Object[]
	//* 234  451:invokestatic    #367 <Method int im.a(Object, String, Object[])>
	//* 235  454:istore          4
	//* 236  456:aload           10
	//* 237  458:astore          11
	//* 238  460:aload           9
	//* 239  462:astore          12
	//* 240  464:iload_1         
	//* 241  465:istore_2        
	//* 242  466:aload           8
	//* 243  468:ldc2            #369 <String "getNetworkId">
	//* 244  471:iconst_0        
	//* 245  472:anewarray       Object[]
	//* 246  475:invokestatic    #367 <Method int im.a(Object, String, Object[])>
	//* 247  478:istore          5
	//* 248  480:aload           10
	//* 249  482:astore          11
	//* 250  484:aload           9
	//* 251  486:astore          12
	//* 252  488:iload_1         
	//* 253  489:istore_2        
	//* 254  490:aload           8
	//* 255  492:ldc2            #371 <String "getBasestationId">
	//* 256  495:iconst_0        
	//* 257  496:anewarray       Object[]
	//* 258  499:invokestatic    #367 <Method int im.a(Object, String, Object[])>
	//* 259  502:istore          6
	//* 260  504:aload           10
	//* 261  506:astore          11
	//* 262  508:aload           9
	//* 263  510:astore          12
	//* 264  512:iload_1         
	//* 265  513:istore_2        
	//* 266  514:aload           8
	//* 267  516:ldc2            #373 <String "getLongitude">
	//* 268  519:iconst_0        
	//* 269  520:anewarray       Object[]
	//* 270  523:invokestatic    #367 <Method int im.a(Object, String, Object[])>
	//* 271  526:istore          7
	//* 272  528:aload           10
	//* 273  530:astore          11
	//* 274  532:aload           9
	//* 275  534:astore          12
	//* 276  536:iload_1         
	//* 277  537:istore_2        
	//* 278  538:aload           9
	//* 279  540:iload           6
	//* 280  542:aload           8
	//* 281  544:ldc2            #375 <String "getLatitude">
	//* 282  547:iconst_0        
	//* 283  548:anewarray       Object[]
	//* 284  551:invokestatic    #367 <Method int im.a(Object, String, Object[])>
	//* 285  554:iload           7
	//* 286  556:iload           4
	//* 287  558:iload           5
	//* 288  560:invokevirtual   #379 <Method void CdmaCellLocation.setCellLocationData(int, int, int, int, int)>
	//* 289  563:aload           10
	//* 290  565:astore          8
	//* 291  567:aload           9
	//* 292  569:astore          11
	//* 293  571:iload_1         
	//* 294  572:istore_2        
	//* 295  573:goto            806
	//* 296  576:iload_1         
	//* 297  577:iconst_3        
	//* 298  578:icmpne          680
	//* 299  581:aload           10
	//* 300  583:astore          11
	//* 301  585:aload           9
	//* 302  587:astore          12
	//* 303  589:iload_1         
	//* 304  590:istore_2        
	//* 305  591:aload           8
	//* 306  593:ldc2            #381 <String "getTac">
	//* 307  596:iconst_0        
	//* 308  597:anewarray       Object[]
	//* 309  600:invokestatic    #367 <Method int im.a(Object, String, Object[])>
	//* 310  603:istore          4
	//* 311  605:aload           10
	//* 312  607:astore          11
	//* 313  609:aload           9
	//* 314  611:astore          12
	//* 315  613:iload_1         
	//* 316  614:istore_2        
	//* 317  615:aload           8
	//* 318  617:ldc2            #383 <String "getCi">
	//* 319  620:iconst_0        
	//* 320  621:anewarray       Object[]
	//* 321  624:invokestatic    #367 <Method int im.a(Object, String, Object[])>
	//* 322  627:istore          5
	//* 323  629:aload           10
	//* 324  631:astore          11
	//* 325  633:aload           9
	//* 326  635:astore          12
	//* 327  637:iload_1         
	//* 328  638:istore_2        
	//* 329  639:new             #385 <Class GsmCellLocation>
	//* 330  642:dup             
	//* 331  643:invokespecial   #386 <Method void GsmCellLocation()>
	//* 332  646:astore          10
	//* 333  648:aload           10
	//* 334  650:astore          8
	//* 335  652:aload           8
	//* 336  654:astore          11
	//* 337  656:aload           9
	//* 338  658:astore          12
	//* 339  660:iload_1         
	//* 340  661:istore_2        
	//* 341  662:aload           10
	//* 342  664:iload           4
	//* 343  666:iload           5
	//* 344  668:invokevirtual   #390 <Method void GsmCellLocation.setLacAndCid(int, int)>
	//* 345  671:aload           9
	//* 346  673:astore          11
	//* 347  675:iload_1         
	//* 348  676:istore_2        
	//* 349  677:goto            806
	//* 350  680:aload           10
	//* 351  682:astore          11
	//* 352  684:aload           9
	//* 353  686:astore          12
	//* 354  688:iload_1         
	//* 355  689:istore_2        
	//* 356  690:aload           8
	//* 357  692:ldc2            #392 <String "getLac">
	//* 358  695:iconst_0        
	//* 359  696:anewarray       Object[]
	//* 360  699:invokestatic    #367 <Method int im.a(Object, String, Object[])>
	//* 361  702:istore          4
	//* 362  704:aload           10
	//* 363  706:astore          11
	//* 364  708:aload           9
	//* 365  710:astore          12
	//* 366  712:iload_1         
	//* 367  713:istore_2        
	//* 368  714:aload           8
	//* 369  716:ldc2            #394 <String "getCid">
	//* 370  719:iconst_0        
	//* 371  720:anewarray       Object[]
	//* 372  723:invokestatic    #367 <Method int im.a(Object, String, Object[])>
	//* 373  726:istore          5
	//* 374  728:aload           10
	//* 375  730:astore          11
	//* 376  732:aload           9
	//* 377  734:astore          12
	//* 378  736:iload_1         
	//* 379  737:istore_2        
	//* 380  738:new             #385 <Class GsmCellLocation>
	//* 381  741:dup             
	//* 382  742:invokespecial   #386 <Method void GsmCellLocation()>
	//* 383  745:astore          10
	//* 384  747:aload           10
	//* 385  749:astore          8
	//* 386  751:aload           8
	//* 387  753:astore          11
	//* 388  755:aload           9
	//* 389  757:astore          12
	//* 390  759:iload_1         
	//* 391  760:istore_2        
	//* 392  761:aload           10
	//* 393  763:iload           4
	//* 394  765:iload           5
	//* 395  767:invokevirtual   #390 <Method void GsmCellLocation.setLacAndCid(int, int)>
	//* 396  770:aload           9
	//* 397  772:astore          11
	//* 398  774:iload_1         
	//* 399  775:istore_2        
	//* 400  776:goto            806
	//* 401  779:iload_1         
	//* 402  780:istore_2        
	//* 403  781:aload           9
	//* 404  783:astore          12
	//* 405  785:aload           10
	//* 406  787:astore          11
	//* 407  789:iload_3         
	//* 408  790:iconst_1        
	//* 409  791:iadd            
	//* 410  792:istore_3        
	//* 411  793:aload           11
	//* 412  795:astore          10
	//* 413  797:aload           12
	//* 414  799:astore          9
	//* 415  801:iload_2         
	//* 416  802:istore_1        
	//* 417  803:goto            30
	//* 418  806:iload_2         
	//* 419  807:iconst_4        
	//* 420  808:icmpne          814
	//* 421  811:aload           11
	//* 422  813:areturn         
	//* 423  814:aload           8
	//* 424  816:areturn         
	//* 425  817:astore          8
	//* 426  819:goto            789
			byte0 = 0;
	//  427  822:iconst_0        
	//  428  823:istore_1        
		if(byte0 <= 0)
			break MISSING_BLOCK_LABEL_779;
		obj = null;
		if(byte0 == 1)
		{
			obj2 = obj1;
			cdmacelllocation1 = cdmacelllocation;
			byte1 = byte0;
			int j1;
			int k1;
			int l1;
			int i2;
			try
			{
				obj = class2.cast(obj3);
				break MISSING_BLOCK_LABEL_366;
			}
			catch(Exception exception) { }
			break MISSING_BLOCK_LABEL_789;
		}
		if(byte0 != 2)
			break MISSING_BLOCK_LABEL_315;
		obj2 = obj1;
		cdmacelllocation1 = cdmacelllocation;
		byte1 = byte0;
		obj = class3.cast(obj3);
		break MISSING_BLOCK_LABEL_366;
		if(byte0 != 3)
			break MISSING_BLOCK_LABEL_342;
		obj2 = obj1;
		cdmacelllocation1 = cdmacelllocation;
		byte1 = byte0;
		obj = class4.cast(obj3);
		break MISSING_BLOCK_LABEL_366;
		if(byte0 != 4)
			break MISSING_BLOCK_LABEL_366;
		obj2 = obj1;
		cdmacelllocation1 = cdmacelllocation;
		byte1 = byte0;
		obj = class1.cast(obj3);
		obj2 = obj1;
		cdmacelllocation1 = cdmacelllocation;
		byte1 = byte0;
		obj = im.c(obj, "getCellIdentity", new Object[0]);
		if(obj == null)
		{
			obj2 = obj1;
			cdmacelllocation1 = cdmacelllocation;
			byte1 = byte0;
			break MISSING_BLOCK_LABEL_789;
		}
		if(byte0 != 4)
			break MISSING_BLOCK_LABEL_576;
		obj2 = obj1;
		cdmacelllocation1 = cdmacelllocation;
		byte1 = byte0;
		cdmacelllocation = new CdmaCellLocation();
		obj2 = obj1;
		cdmacelllocation1 = cdmacelllocation;
		byte1 = byte0;
		j1 = im.a(obj, "getSystemId", new Object[0]);
		obj2 = obj1;
		cdmacelllocation1 = cdmacelllocation;
		byte1 = byte0;
		k1 = im.a(obj, "getNetworkId", new Object[0]);
		obj2 = obj1;
		cdmacelllocation1 = cdmacelllocation;
		byte1 = byte0;
		l1 = im.a(obj, "getBasestationId", new Object[0]);
		obj2 = obj1;
		cdmacelllocation1 = cdmacelllocation;
		byte1 = byte0;
		i2 = im.a(obj, "getLongitude", new Object[0]);
		obj2 = obj1;
		cdmacelllocation1 = cdmacelllocation;
		byte1 = byte0;
		cdmacelllocation.setCellLocationData(l1, im.a(obj, "getLatitude", new Object[0]), i2, j1, k1);
		obj = obj1;
		obj2 = ((Object) (cdmacelllocation));
		byte1 = byte0;
		break; /* Loop/switch isn't completed */
		if(byte0 != 3)
			break MISSING_BLOCK_LABEL_680;
		obj2 = obj1;
		cdmacelllocation1 = cdmacelllocation;
		byte1 = byte0;
		j1 = im.a(obj, "getTac", new Object[0]);
		obj2 = obj1;
		cdmacelllocation1 = cdmacelllocation;
		byte1 = byte0;
		k1 = im.a(obj, "getCi", new Object[0]);
		obj2 = obj1;
		cdmacelllocation1 = cdmacelllocation;
		byte1 = byte0;
		obj1 = ((Object) (new GsmCellLocation()));
		obj = obj1;
		obj2 = obj;
		cdmacelllocation1 = cdmacelllocation;
		byte1 = byte0;
		((GsmCellLocation) (obj1)).setLacAndCid(j1, k1);
		obj2 = ((Object) (cdmacelllocation));
		byte1 = byte0;
		break; /* Loop/switch isn't completed */
		obj2 = obj1;
		cdmacelllocation1 = cdmacelllocation;
		byte1 = byte0;
		j1 = im.a(obj, "getLac", new Object[0]);
		obj2 = obj1;
		cdmacelllocation1 = cdmacelllocation;
		byte1 = byte0;
		k1 = im.a(obj, "getCid", new Object[0]);
		obj2 = obj1;
		cdmacelllocation1 = cdmacelllocation;
		byte1 = byte0;
		obj1 = ((Object) (new GsmCellLocation()));
		obj = obj1;
		obj2 = obj;
		cdmacelllocation1 = cdmacelllocation;
		byte1 = byte0;
		((GsmCellLocation) (obj1)).setLacAndCid(j1, k1);
		obj2 = ((Object) (cdmacelllocation));
		byte1 = byte0;
		break; /* Loop/switch isn't completed */
		byte1 = byte0;
		cdmacelllocation1 = cdmacelllocation;
		obj2 = obj1;
		i1++;
		obj1 = obj2;
		cdmacelllocation = cdmacelllocation1;
		byte0 = byte1;
		if(true) goto _L2; else goto _L1
_L1:
		if(byte1 == 4)
			return ((CellLocation) (obj2));
		else
			return ((CellLocation) (obj));
	//* 429  824:goto            254
	}

	static iy b(iq iq1)
	{
		return iq1.x;
	//    0    0:aload_0         
	//    1    1:getfield        #113 <Field iy x>
	//    2    4:areturn         
	}

	private void b(BroadcastReceiver broadcastreceiver)
	{
		if(broadcastreceiver == null || e == null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          11
	//*   2    4:aload_0         
	//*   3    5:getfield        #67  <Field Context e>
	//*   4    8:ifnonnull       12
		{
			return;
	//    5   11:return          
		} else
		{
			IntentFilter intentfilter = new IntentFilter();
	//    6   12:new             #398 <Class IntentFilter>
	//    7   15:dup             
	//    8   16:invokespecial   #399 <Method void IntentFilter()>
	//    9   19:astore_2        
			intentfilter.addAction("android.net.wifi.SCAN_RESULTS");
	//   10   20:aload_2         
	//   11   21:ldc2            #401 <String "android.net.wifi.SCAN_RESULTS">
	//   12   24:invokevirtual   #405 <Method void IntentFilter.addAction(String)>
			e.registerReceiver(broadcastreceiver, intentfilter);
	//   13   27:aload_0         
	//   14   28:getfield        #67  <Field Context e>
	//   15   31:aload_1         
	//   16   32:aload_2         
	//   17   33:invokevirtual   #409 <Method android.content.Intent Context.registerReceiver(BroadcastReceiver, IntentFilter)>
	//   18   36:pop             
			return;
	//   19   37:return          
		}
	}

	private boolean b(CellLocation celllocation)
	{
		boolean flag;
		boolean flag1;
		if(celllocation == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return false;
	//    2    4:iconst_0        
	//    3    5:ireturn         
		flag1 = true;
	//    4    6:iconst_1        
	//    5    7:istore          4
		flag = true;
	//    6    9:iconst_1        
	//    7   10:istore_3        
		c(celllocation, e);
	//    8   11:aload_1         
	//    9   12:aload_0         
	//   10   13:getfield        #67  <Field Context e>
	//   11   16:invokestatic    #413 <Method int c(CellLocation, Context)>
		JVM INSTR lookupswitch 2: default 44
	//	               1: 46
	//	               2: 128;
	//   12   19:lookupswitch    2: default 44
	//	               1: 46
	//	               2: 128
		   goto _L1 _L2 _L3
_L1:
		return true;
	//   13   44:iconst_1        
	//   14   45:ireturn         
_L2:
		celllocation = ((CellLocation) ((GsmCellLocation)celllocation));
	//   15   46:aload_1         
	//   16   47:checkcast       #385 <Class GsmCellLocation>
	//   17   50:astore_1        
		if(((GsmCellLocation) (celllocation)).getLac() == -1)
	//*  18   51:aload_1         
	//*  19   52:invokevirtual   #415 <Method int GsmCellLocation.getLac()>
	//*  20   55:iconst_m1       
	//*  21   56:icmpne          61
			return false;
	//   22   59:iconst_0        
	//   23   60:ireturn         
		if(((GsmCellLocation) (celllocation)).getLac() == 0)
	//*  24   61:aload_1         
	//*  25   62:invokevirtual   #415 <Method int GsmCellLocation.getLac()>
	//*  26   65:ifne            70
			return false;
	//   27   68:iconst_0        
	//   28   69:ireturn         
		if(((GsmCellLocation) (celllocation)).getLac() > 65535)
	//*  29   70:aload_1         
	//*  30   71:invokevirtual   #415 <Method int GsmCellLocation.getLac()>
	//*  31   74:ldc2            #416 <Int 65535>
	//*  32   77:icmple          82
			return false;
	//   33   80:iconst_0        
	//   34   81:ireturn         
		if(((GsmCellLocation) (celllocation)).getCid() == -1)
	//*  35   82:aload_1         
	//*  36   83:invokevirtual   #418 <Method int GsmCellLocation.getCid()>
	//*  37   86:iconst_m1       
	//*  38   87:icmpne          92
			return false;
	//   39   90:iconst_0        
	//   40   91:ireturn         
		if(((GsmCellLocation) (celllocation)).getCid() == 0)
	//*  41   92:aload_1         
	//*  42   93:invokevirtual   #418 <Method int GsmCellLocation.getCid()>
	//*  43   96:ifne            101
			return false;
	//   44   99:iconst_0        
	//   45  100:ireturn         
		if(((GsmCellLocation) (celllocation)).getCid() == 65535)
	//*  46  101:aload_1         
	//*  47  102:invokevirtual   #418 <Method int GsmCellLocation.getCid()>
	//*  48  105:ldc2            #416 <Int 65535>
	//*  49  108:icmpne          113
			return false;
	//   50  111:iconst_0        
	//   51  112:ireturn         
		flag = flag1;
	//   52  113:iload           4
	//   53  115:istore_3        
		if(((GsmCellLocation) (celllocation)).getCid() >= 0xfffffff)
	//*  54  116:aload_1         
	//*  55  117:invokevirtual   #418 <Method int GsmCellLocation.getCid()>
	//*  56  120:ldc2            #419 <Int 0xfffffff>
	//*  57  123:icmplt          178
			return false;
	//   58  126:iconst_0        
	//   59  127:ireturn         
		break; /* Loop/switch isn't completed */
_L3:
		if(im.a(((Object) (celllocation)), "getSystemId", new Object[0]) <= 0)
	//*  60  128:aload_1         
	//*  61  129:ldc2            #364 <String "getSystemId">
	//*  62  132:iconst_0        
	//*  63  133:anewarray       Object[]
	//*  64  136:invokestatic    #367 <Method int im.a(Object, String, Object[])>
	//*  65  139:ifgt            144
			return false;
	//   66  142:iconst_0        
	//   67  143:ireturn         
		if(im.a(((Object) (celllocation)), "getNetworkId", new Object[0]) < 0)
	//*  68  144:aload_1         
	//*  69  145:ldc2            #369 <String "getNetworkId">
	//*  70  148:iconst_0        
	//*  71  149:anewarray       Object[]
	//*  72  152:invokestatic    #367 <Method int im.a(Object, String, Object[])>
	//*  73  155:ifge            160
			return false;
	//   74  158:iconst_0        
	//   75  159:ireturn         
		int i1;
		try
		{
			i1 = im.a(((Object) (celllocation)), "getBaseStationId", new Object[0]);
	//   76  160:aload_1         
	//   77  161:ldc2            #421 <String "getBaseStationId">
	//   78  164:iconst_0        
	//   79  165:anewarray       Object[]
	//   80  168:invokestatic    #367 <Method int im.a(Object, String, Object[])>
	//   81  171:istore_2        
		}
	//*  82  172:iload_2         
	//*  83  173:ifge            178
	//*  84  176:iconst_0        
	//*  85  177:istore_3        
	//*  86  178:iload_3         
	//*  87  179:ireturn         
		// Misplaced declaration of an exception variable
		catch(CellLocation celllocation)
	//*  88  180:astore_1        
		{
			return true;
	//   89  181:iconst_1        
	//   90  182:ireturn         
		}
		if(i1 < 0)
			flag = false;
		return flag;
	}

	private static String[] b(TelephonyManager telephonymanager)
	{
		String s1 = null;
	//    0    0:aconst_null     
	//    1    1:astore_2        
		if(telephonymanager != null)
	//*   2    2:aload_0         
	//*   3    3:ifnull          11
			s1 = telephonymanager.getNetworkOperator();
	//    4    6:aload_0         
	//    5    7:invokevirtual   #424 <Method String TelephonyManager.getNetworkOperator()>
	//    6   10:astore_2        
		telephonymanager = ((TelephonyManager) (new String[2]));
	//    7   11:iconst_2        
	//    8   12:anewarray       String[]
	//    9   15:astore_0        
		telephonymanager[0] = "0";
	//   10   16:aload_0         
	//   11   17:iconst_0        
	//   12   18:ldc2            #426 <String "0">
	//   13   21:aastore         
		telephonymanager[1] = "0";
	//   14   22:aload_0         
	//   15   23:iconst_1        
	//   16   24:ldc2            #426 <String "0">
	//   17   27:aastore         
		if(TextUtils.isDigitsOnly(((CharSequence) (s1))) && s1.length() > 4)
	//*  18   28:aload_2         
	//*  19   29:invokestatic    #432 <Method boolean TextUtils.isDigitsOnly(CharSequence)>
	//*  20   32:ifeq            96
	//*  21   35:aload_2         
	//*  22   36:invokevirtual   #177 <Method int String.length()>
	//*  23   39:iconst_4        
	//*  24   40:icmple          96
		{
			telephonymanager[0] = ((/*<invalid signature>*/java.lang.Object) (s1.substring(0, 3)));
	//   25   43:aload_0         
	//   26   44:iconst_0        
	//   27   45:aload_2         
	//   28   46:iconst_0        
	//   29   47:iconst_3        
	//   30   48:invokevirtual   #436 <Method String String.substring(int, int)>
	//   31   51:aastore         
			char ac[] = s1.substring(3).toCharArray();
	//   32   52:aload_2         
	//   33   53:iconst_3        
	//   34   54:invokevirtual   #439 <Method String String.substring(int)>
	//   35   57:invokevirtual   #443 <Method char[] String.toCharArray()>
	//   36   60:astore_3        
			int i1;
			for(i1 = 0; i1 < ac.length && Character.isDigit(ac[i1]); i1++);
	//   37   61:iconst_0        
	//   38   62:istore_1        
	//   39   63:iload_1         
	//   40   64:aload_3         
	//   41   65:arraylength     
	//   42   66:icmpge          85
	//   43   69:aload_3         
	//   44   70:iload_1         
	//   45   71:caload          
	//   46   72:invokestatic    #449 <Method boolean Character.isDigit(char)>
	//   47   75:ifeq            85
	//   48   78:iload_1         
	//   49   79:iconst_1        
	//   50   80:iadd            
	//   51   81:istore_1        
	//*  52   82:goto            63
			telephonymanager[1] = ((/*<invalid signature>*/java.lang.Object) (s1.substring(3, i1 + 3)));
	//   53   85:aload_0         
	//   54   86:iconst_1        
	//   55   87:aload_2         
	//   56   88:iconst_3        
	//   57   89:iload_1         
	//   58   90:iconst_3        
	//   59   91:iadd            
	//   60   92:invokevirtual   #436 <Method String String.substring(int, int)>
	//   61   95:aastore         
		}
		return ((String []) (telephonymanager));
	//   62   96:aload_0         
	//   63   97:areturn         
	}

	private static int c(CellLocation celllocation, Context context)
	{
		if(android.provider.Settings.System.getInt(context.getContentResolver(), "airplane_mode_on", 0) == 1)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #453 <Method android.content.ContentResolver Context.getContentResolver()>
	//*   2    4:ldc2            #455 <String "airplane_mode_on">
	//*   3    7:iconst_0        
	//*   4    8:invokestatic    #461 <Method int android.provider.Settings$System.getInt(android.content.ContentResolver, String, int)>
	//*   5   11:iconst_1        
	//*   6   12:icmpne          18
			return 9;
	//    7   15:bipush          9
	//    8   17:ireturn         
		if(celllocation == null)
	//*   9   18:aload_0         
	//*  10   19:ifnonnull       25
			return 9;
	//   11   22:bipush          9
	//   12   24:ireturn         
		if(celllocation instanceof GsmCellLocation)
	//*  13   25:aload_0         
	//*  14   26:instanceof      #385 <Class GsmCellLocation>
	//*  15   29:ifeq            34
			return 1;
	//   16   32:iconst_1        
	//   17   33:ireturn         
		try
		{
			Class.forName("android.telephony.cdma.CdmaCellLocation");
	//   18   34:ldc2            #463 <String "android.telephony.cdma.CdmaCellLocation">
	//   19   37:invokestatic    #466 <Method Class Class.forName(String)>
	//   20   40:pop             
		}
	//*  21   41:iconst_2        
	//*  22   42:ireturn         
		// Misplaced declaration of an exception variable
		catch(CellLocation celllocation)
	//*  23   43:astore_0        
		{
			return 9;
	//   24   44:bipush          9
	//   25   46:ireturn         
		}
		return 2;
	}

	static int c(iq iq1, int i1)
	{
		iq1.o = i1;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #99  <Field int o>
		return i1;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

	static WifiManager c(iq iq1)
	{
		return iq1.d;
	//    0    0:aload_0         
	//    1    1:getfield        #73  <Field WifiManager d>
	//    2    4:areturn         
	}

	static iy c(iq iq1, iy iy)
	{
		iq1.x = iy;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #113 <Field iy x>
		return iy;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

	protected static boolean c(Context context)
	{
		boolean flag;
		boolean flag1;
		if(context == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return true;
	//    2    4:iconst_1        
	//    3    5:ireturn         
		flag1 = false;
	//    4    6:iconst_0        
	//    5    7:istore          4
		flag = false;
	//    6    9:iconst_0        
	//    7   10:istore_3        
		if(android.provider.Settings.Secure.getString(context.getContentResolver(), "mock_location").equals("0")) goto _L2; else goto _L1
	//    8   11:aload_0         
	//    9   12:invokevirtual   #453 <Method android.content.ContentResolver Context.getContentResolver()>
	//   10   15:ldc2            #471 <String "mock_location">
	//   11   18:invokestatic    #477 <Method String android.provider.Settings$Secure.getString(android.content.ContentResolver, String)>
	//   12   21:ldc2            #426 <String "0">
	//   13   24:invokevirtual   #480 <Method boolean String.equals(Object)>
	//   14   27:ifne            173
_L1:
		PackageManager packagemanager;
		Object obj;
		packagemanager = context.getPackageManager();
	//   15   30:aload_0         
	//   16   31:invokevirtual   #484 <Method PackageManager Context.getPackageManager()>
	//   17   34:astore          5
		obj = ((Object) (packagemanager.getInstalledApplications(128)));
	//   18   36:aload           5
	//   19   38:sipush          128
	//   20   41:invokevirtual   #490 <Method List PackageManager.getInstalledApplications(int)>
	//   21   44:astore          6
		context = ((Context) (context.getPackageName()));
	//   22   46:aload_0         
	//   23   47:invokevirtual   #198 <Method String Context.getPackageName()>
	//   24   50:astore_0        
		obj = ((Object) (((List) (obj)).iterator()));
	//   25   51:aload           6
	//   26   53:invokeinterface #491 <Method Iterator List.iterator()>
	//   27   58:astore          6
_L7:
		flag1 = flag;
	//   28   60:iload_3         
	//   29   61:istore          4
		if(!((Iterator) (obj)).hasNext()) goto _L2; else goto _L3
	//   30   63:aload           6
	//   31   65:invokeinterface #291 <Method boolean Iterator.hasNext()>
	//   32   70:ifeq            173
_L3:
		ApplicationInfo applicationinfo;
		applicationinfo = (ApplicationInfo)((Iterator) (obj)).next();
	//   33   73:aload           6
	//   34   75:invokeinterface #295 <Method Object Iterator.next()>
	//   35   80:checkcast       #493 <Class ApplicationInfo>
	//   36   83:astore          7
		flag1 = flag;
	//   37   85:iload_3         
	//   38   86:istore          4
		if(flag) goto _L2; else goto _L4
	//   39   88:iload_3         
	//   40   89:ifne            173
_L4:
		String as[] = packagemanager.getPackageInfo(applicationinfo.packageName, 4096).requestedPermissions;
	//   41   92:aload           5
	//   42   94:aload           7
	//   43   96:getfield        #496 <Field String ApplicationInfo.packageName>
	//   44   99:sipush          4096
	//   45  102:invokevirtual   #500 <Method PackageInfo PackageManager.getPackageInfo(String, int)>
	//   46  105:getfield        #506 <Field String[] PackageInfo.requestedPermissions>
	//   47  108:astore          8
		if(as == null)
			continue; /* Loop/switch isn't completed */
	//   48  110:aload           8
	//   49  112:ifnull          167
		int j1 = as.length;
	//   50  115:aload           8
	//   51  117:arraylength     
	//   52  118:istore_2        
		int i1 = 0;
	//   53  119:iconst_0        
	//   54  120:istore_1        
_L5:
		if(i1 >= j1)
			continue; /* Loop/switch isn't completed */
	//   55  121:iload_1         
	//   56  122:iload_2         
	//   57  123:icmpge          167
		if(!as[i1].equals("android.permission.ACCESS_MOCK_LOCATION"))
			break MISSING_BLOCK_LABEL_160;
	//   58  126:aload           8
	//   59  128:iload_1         
	//   60  129:aaload          
	//   61  130:ldc2            #508 <String "android.permission.ACCESS_MOCK_LOCATION">
	//   62  133:invokevirtual   #480 <Method boolean String.equals(Object)>
	//   63  136:ifeq            160
		flag1 = applicationinfo.packageName.equals(((Object) (context)));
	//   64  139:aload           7
	//   65  141:getfield        #496 <Field String ApplicationInfo.packageName>
	//   66  144:aload_0         
	//   67  145:invokevirtual   #480 <Method boolean String.equals(Object)>
	//   68  148:istore          4
		if(!flag1)
	//*  69  150:iload           4
	//*  70  152:ifne            167
			flag = true;
	//   71  155:iconst_1        
	//   72  156:istore_3        
		continue; /* Loop/switch isn't completed */
	//   73  157:goto            170
		i1++;
	//   74  160:iload_1         
	//   75  161:iconst_1        
	//   76  162:iadd            
	//   77  163:istore_1        
		if(true) goto _L5; else goto _L2
	//   78  164:goto            121
	//*  79  167:goto            60
	//*  80  170:goto            60
_L2:
		return flag1;
	//   81  173:iload           4
	//   82  175:ireturn         
		Exception exception;
		exception;
	//   83  176:astore          7
		if(true) goto _L7; else goto _L6
	//   84  178:goto            170
_L6:
	}

	static boolean c(iq iq1, boolean flag)
	{
		iq1.m = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #89  <Field boolean m>
		return flag;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

	static String[] c(TelephonyManager telephonymanager)
	{
		return b(telephonymanager);
	//    0    0:aload_0         
	//    1    1:invokestatic    #186 <Method String[] b(TelephonyManager)>
	//    2    4:areturn         
	}

	static long d(iq iq1, long l1)
	{
		iq1.r = l1;
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:putfield        #109 <Field long r>
		return l1;
	//    3    5:lload_1         
	//    4    6:lreturn         
	}

	static Looper d(iq iq1, Looper looper)
	{
		iq1.C = looper;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #128 <Field Looper C>
		return looper;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

	static CellLocation d(iq iq1, CellLocation celllocation)
	{
		iq1.w = celllocation;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #115 <Field CellLocation w>
		return celllocation;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

	static List d(iq iq1)
	{
		return iq1.j;
	//    0    0:aload_0         
	//    1    1:getfield        #122 <Field List j>
	//    2    4:areturn         
	}

	private void d(BroadcastReceiver broadcastreceiver)
	{
		if(broadcastreceiver == null || e == null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          11
	//*   2    4:aload_0         
	//*   3    5:getfield        #67  <Field Context e>
	//*   4    8:ifnonnull       12
			return;
	//    5   11:return          
		try
		{
			e.unregisterReceiver(broadcastreceiver);
	//    6   12:aload_0         
	//    7   13:getfield        #67  <Field Context e>
	//    8   16:aload_1         
	//    9   17:invokevirtual   #515 <Method void Context.unregisterReceiver(BroadcastReceiver)>
			return;
	//   10   20:return          
		}
		// Misplaced declaration of an exception variable
		catch(BroadcastReceiver broadcastreceiver)
	//*  11   21:astore_1        
		{
			return;
	//   12   22:return          
		}
	}

	static void d(iq iq1, android.location.GpsStatus.NmeaListener nmealistener)
	{
		if(iq1.a == null || nmealistener == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #71  <Field LocationManager a>
	//*   2    4:ifnull          11
	//*   3    7:aload_1         
	//*   4    8:ifnonnull       12
		{
			return;
	//    5   11:return          
		} else
		{
			iq1.a.addNmeaListener(nmealistener);
	//    6   12:aload_0         
	//    7   13:getfield        #71  <Field LocationManager a>
	//    8   16:aload_1         
	//    9   17:invokevirtual   #520 <Method boolean LocationManager.addNmeaListener(android.location.GpsStatus$NmeaListener)>
	//   10   20:pop             
			return;
	//   11   21:return          
		}
	}

	private static boolean d(Context context)
	{
		int i1 = 0;
	//    0    0:iconst_0        
	//    1    1:istore_1        
		PackageManager packagemanager = context.getPackageManager();
	//    2    2:aload_0         
	//    3    3:invokevirtual   #484 <Method PackageManager Context.getPackageManager()>
	//    4    6:astore_2        
		try
		{
			context = ((Context) (packagemanager.getPackageInfo(context.getPackageName(), 4096)));
	//    5    7:aload_2         
	//    6    8:aload_0         
	//    7    9:invokevirtual   #198 <Method String Context.getPackageName()>
	//    8   12:sipush          4096
	//    9   15:invokevirtual   #500 <Method PackageInfo PackageManager.getPackageInfo(String, int)>
	//   10   18:astore_0        
		}
	//*  11   19:goto            24
	//*  12   22:iconst_0        
	//*  13   23:ireturn         
	//*  14   24:aload_0         
	//*  15   25:getfield        #506 <Field String[] PackageInfo.requestedPermissions>
	//*  16   28:astore_0        
	//*  17   29:iload_1         
	//*  18   30:getstatic       #524 <Field String[] jo.d>
	//*  19   33:arraylength     
	//*  20   34:icmpge          58
	//*  21   37:aload_0         
	//*  22   38:getstatic       #524 <Field String[] jo.d>
	//*  23   41:iload_1         
	//*  24   42:aaload          
	//*  25   43:invokestatic    #527 <Method boolean jo.c(String[], String)>
	//*  26   46:ifne            51
	//*  27   49:iconst_0        
	//*  28   50:ireturn         
	//*  29   51:iload_1         
	//*  30   52:iconst_1        
	//*  31   53:iadd            
	//*  32   54:istore_1        
	//*  33   55:goto            29
	//*  34   58:iconst_1        
	//*  35   59:ireturn         
		// Misplaced declaration of an exception variable
		catch(Context context)
		{
			return false;
		}
		context = ((Context) (((PackageInfo) (context)).requestedPermissions));
		for(; i1 < jo.d.length; i1++)
			if(!jo.c(((String []) (context)), jo.d[i1]))
				return false;

		return true;
	//*  36   60:astore_0        
	//*  37   61:goto            22
	}

	private static boolean d(Object obj)
	{
		Method method = ((Class) (android/net/wifi/WifiManager)).getDeclaredMethod("isScanAlwaysAvailable", ((Class []) (null)));
	//    0    0:ldc1            #151 <Class WifiManager>
	//    1    2:ldc2            #529 <String "isScanAlwaysAvailable">
	//    2    5:aconst_null     
	//    3    6:invokevirtual   #320 <Method Method Class.getDeclaredMethod(String, Class[])>
	//    4    9:astore_2        
		if(method == null)
			break MISSING_BLOCK_LABEL_33;
	//    5   10:aload_2         
	//    6   11:ifnull          29
		boolean flag = ((Boolean)method.invoke(obj, ((Object []) (null)))).booleanValue();
	//    7   14:aload_2         
	//    8   15:aload_0         
	//    9   16:aconst_null     
	//   10   17:invokevirtual   #326 <Method Object Method.invoke(Object, Object[])>
	//   11   20:checkcast       #531 <Class Boolean>
	//   12   23:invokevirtual   #534 <Method boolean Boolean.booleanValue()>
	//   13   26:istore_1        
		return flag;
	//   14   27:iload_1         
	//   15   28:ireturn         
	//*  16   29:goto            33
		obj;
	//   17   32:astore_0        
		return false;
	//   18   33:iconst_0        
	//   19   34:ireturn         
	}

	static int e(iq iq1, int i1)
	{
		iq1.u = i1;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #101 <Field int u>
		return i1;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

	static long e(iq iq1, long l1)
	{
		iq1.t = l1;
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:putfield        #107 <Field long t>
		return l1;
	//    3    5:lload_1         
	//    4    6:lreturn         
	}

	protected static iq e(Context context)
	{
label0:
		{
			boolean flag;
label1:
			{
label2:
				{
					if(y != null || !d(context))
						break label0;
	//    0    0:getstatic       #56  <Field iq y>
	//    1    3:ifnonnull       101
	//    2    6:aload_0         
	//    3    7:invokestatic    #537 <Method boolean d(Context)>
	//    4   10:ifeq            101
					Object obj = ((Object) ((LocationManager)context.getSystemService("location")));
	//    5   13:aload_0         
	//    6   14:ldc1            #145 <String "location">
	//    7   16:invokevirtual   #141 <Method Object Context.getSystemService(String)>
	//    8   19:checkcast       #147 <Class LocationManager>
	//    9   22:astore_2        
					if(obj == null)
						break label2;
	//   10   23:aload_2         
	//   11   24:ifnull          84
					obj = ((Object) (((LocationManager) (obj)).getAllProviders().iterator()));
	//   12   27:aload_2         
	//   13   28:invokevirtual   #541 <Method List LocationManager.getAllProviders()>
	//   14   31:invokeinterface #491 <Method Iterator List.iterator()>
	//   15   36:astore_2        
					String s1;
					do
					{
						if(!((Iterator) (obj)).hasNext())
							break label2;
	//   16   37:aload_2         
	//   17   38:invokeinterface #291 <Method boolean Iterator.hasNext()>
	//   18   43:ifeq            84
						s1 = (String)((Iterator) (obj)).next();
	//   19   46:aload_2         
	//   20   47:invokeinterface #295 <Method Object Iterator.next()>
	//   21   52:checkcast       #173 <Class String>
	//   22   55:astore_3        
					} while(!s1.equals("passive") && !s1.equals("gps"));
	//   23   56:aload_3         
	//   24   57:ldc2            #543 <String "passive">
	//   25   60:invokevirtual   #480 <Method boolean String.equals(Object)>
	//   26   63:ifne            76
	//   27   66:aload_3         
	//   28   67:ldc2            #545 <String "gps">
	//   29   70:invokevirtual   #480 <Method boolean String.equals(Object)>
	//   30   73:ifeq            81
					flag = true;
	//   31   76:iconst_1        
	//   32   77:istore_1        
					break label1;
	//   33   78:goto            86
				}
	//*  34   81:goto            37
				flag = false;
	//   35   84:iconst_0        
	//   36   85:istore_1        
			}
			if(flag)
	//*  37   86:iload_1         
	//*  38   87:ifeq            101
				y = new iq(context);
	//   39   90:new             #2   <Class iq>
	//   40   93:dup             
	//   41   94:aload_0         
	//   42   95:invokespecial   #547 <Method void iq(Context)>
	//   43   98:putstatic       #56  <Field iq y>
		}
		return y;
	//   44  101:getstatic       #56  <Field iq y>
	//   45  104:areturn         
	}

	static ir e(iq iq1)
	{
		return iq1.z;
	//    0    0:aload_0         
	//    1    1:getfield        #111 <Field ir z>
	//    2    4:areturn         
	}

	static int f(iq iq1)
	{
		return iq1.h;
	//    0    0:aload_0         
	//    1    1:getfield        #87  <Field int h>
	//    2    4:ireturn         
	}

	static TelephonyManager h(iq iq1)
	{
		return iq1.c;
	//    0    0:aload_0         
	//    1    1:getfield        #69  <Field TelephonyManager c>
	//    2    4:areturn         
	}

	static boolean k(iq iq1)
	{
		return iq1.k;
	//    0    0:aload_0         
	//    1    1:getfield        #85  <Field boolean k>
	//    2    4:ireturn         
	}

	protected final int a(int i1)
	{
		new ArrayList();
	//    0    0:new             #119 <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #120 <Method void ArrayList()>
	//    3    7:pop             
		if(b == null)
	//*   4    8:aload_0         
	//*   5    9:getfield        #75  <Field SensorManager b>
	//*   6   12:ifnonnull       17
			return 0;
	//    7   15:iconst_0        
	//    8   16:ireturn         
		List list = b.getSensorList(-1);
	//    9   17:aload_0         
	//   10   18:getfield        #75  <Field SensorManager b>
	//   11   21:iconst_m1       
	//   12   22:invokevirtual   #555 <Method List SensorManager.getSensorList(int)>
	//   13   25:astore_2        
		if(list == null || list.get(i1) == null)
	//*  14   26:aload_2         
	//*  15   27:ifnull          40
	//*  16   30:aload_2         
	//*  17   31:iload_1         
	//*  18   32:invokeinterface #240 <Method Object List.get(int)>
	//*  19   37:ifnonnull       42
			return 0;
	//   20   40:iconst_0        
	//   21   41:ireturn         
		else
			return b(list.get(i1));
	//   22   42:aload_2         
	//   23   43:iload_1         
	//   24   44:invokeinterface #240 <Method Object List.get(int)>
	//   25   49:invokestatic    #557 <Method int b(Object)>
	//   26   52:ireturn         
	}

	protected final boolean a()
	{
		return d != null && (d.isWifiEnabled() || d(((Object) (d))));
	//    0    0:aload_0         
	//    1    1:getfield        #73  <Field WifiManager d>
	//    2    4:ifnull          29
	//    3    7:aload_0         
	//    4    8:getfield        #73  <Field WifiManager d>
	//    5   11:invokevirtual   #560 <Method boolean WifiManager.isWifiEnabled()>
	//    6   14:ifne            27
	//    7   17:aload_0         
	//    8   18:getfield        #73  <Field WifiManager d>
	//    9   21:invokestatic    #562 <Method boolean d(Object)>
	//   10   24:ifeq            29
	//   11   27:iconst_1        
	//   12   28:ireturn         
	//   13   29:iconst_0        
	//   14   30:ireturn         
	}

	protected final double b(int i1)
	{
		new ArrayList();
	//    0    0:new             #119 <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #120 <Method void ArrayList()>
	//    3    7:pop             
		if(b == null)
	//*   4    8:aload_0         
	//*   5    9:getfield        #75  <Field SensorManager b>
	//*   6   12:ifnonnull       17
			return 0.0D;
	//    7   15:dconst_0        
	//    8   16:dreturn         
		List list = b.getSensorList(-1);
	//    9   17:aload_0         
	//   10   18:getfield        #75  <Field SensorManager b>
	//   11   21:iconst_m1       
	//   12   22:invokevirtual   #555 <Method List SensorManager.getSensorList(int)>
	//   13   25:astore_2        
		if(list == null || list.get(i1) == null)
	//*  14   26:aload_2         
	//*  15   27:ifnull          40
	//*  16   30:aload_2         
	//*  17   31:iload_1         
	//*  18   32:invokeinterface #240 <Method Object List.get(int)>
	//*  19   37:ifnonnull       42
			return 0.0D;
	//   20   40:dconst_0        
	//   21   41:dreturn         
		else
			return (double)((Sensor)list.get(i1)).getMaximumRange();
	//   22   42:aload_2         
	//   23   43:iload_1         
	//   24   44:invokeinterface #240 <Method Object List.get(int)>
	//   25   49:checkcast       #312 <Class Sensor>
	//   26   52:invokevirtual   #567 <Method float Sensor.getMaximumRange()>
	//   27   55:f2d             
	//   28   56:dreturn         
	}

	protected final List b(float f1)
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #119 <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #120 <Method void ArrayList()>
	//    3    7:astore          5
		long l1 = System.currentTimeMillis();
	//    4    9:invokestatic    #574 <Method long System.currentTimeMillis()>
	//    5   12:lstore_3        
		float f2 = f1;
	//    6   13:fload_1         
	//    7   14:fstore_2        
		if(Math.abs(f1) <= 1.0F)
	//*   8   15:fload_1         
	//*   9   16:invokestatic    #580 <Method float Math.abs(float)>
	//*  10   19:fconst_1        
	//*  11   20:fcmpg           
	//*  12   21:ifgt            26
			f2 = 1.0F;
	//   13   24:fconst_1        
	//   14   25:fstore_2        
		if(c())
	//*  15   26:aload_0         
	//*  16   27:invokevirtual   #582 <Method boolean c()>
	//*  17   30:ifeq            155
		{
			CellLocation celllocation = (CellLocation)g().get(1);
	//   18   33:aload_0         
	//   19   34:invokevirtual   #584 <Method List g()>
	//   20   37:iconst_1        
	//   21   38:invokeinterface #240 <Method Object List.get(int)>
	//   22   43:checkcast       #586 <Class CellLocation>
	//   23   46:astore          6
			if(celllocation != null && (celllocation instanceof GsmCellLocation))
	//*  24   48:aload           6
	//*  25   50:ifnull          155
	//*  26   53:aload           6
	//*  27   55:instanceof      #385 <Class GsmCellLocation>
	//*  28   58:ifeq            155
			{
				((List) (arraylist)).add(((Object) (Integer.valueOf(((GsmCellLocation)celllocation).getLac()))));
	//   29   61:aload           5
	//   30   63:aload           6
	//   31   65:checkcast       #385 <Class GsmCellLocation>
	//   32   68:invokevirtual   #415 <Method int GsmCellLocation.getLac()>
	//   33   71:invokestatic    #254 <Method Integer Integer.valueOf(int)>
	//   34   74:invokeinterface #302 <Method boolean List.add(Object)>
	//   35   79:pop             
				((List) (arraylist)).add(((Object) (Integer.valueOf(((GsmCellLocation)celllocation).getCid()))));
	//   36   80:aload           5
	//   37   82:aload           6
	//   38   84:checkcast       #385 <Class GsmCellLocation>
	//   39   87:invokevirtual   #418 <Method int GsmCellLocation.getCid()>
	//   40   90:invokestatic    #254 <Method Integer Integer.valueOf(int)>
	//   41   93:invokeinterface #302 <Method boolean List.add(Object)>
	//   42   98:pop             
				if((double)(l1 - ((Long)g().get(0)).longValue()) <= 50000D / (double)f2)
	//*  43   99:lload_3         
	//*  44  100:aload_0         
	//*  45  101:invokevirtual   #584 <Method List g()>
	//*  46  104:iconst_0        
	//*  47  105:invokeinterface #240 <Method Object List.get(int)>
	//*  48  110:checkcast       #588 <Class Long>
	//*  49  113:invokevirtual   #591 <Method long Long.longValue()>
	//*  50  116:lsub            
	//*  51  117:l2d             
	//*  52  118:ldc2w           #592 <Double 50000D>
	//*  53  121:fload_2         
	//*  54  122:f2d             
	//*  55  123:ddiv            
	//*  56  124:dcmpg           
	//*  57  125:ifgt            143
				{
					((List) (arraylist)).add(((Object) (Integer.valueOf(1))));
	//   58  128:aload           5
	//   59  130:iconst_1        
	//   60  131:invokestatic    #254 <Method Integer Integer.valueOf(int)>
	//   61  134:invokeinterface #302 <Method boolean List.add(Object)>
	//   62  139:pop             
					return ((List) (arraylist));
	//   63  140:aload           5
	//   64  142:areturn         
				}
				((List) (arraylist)).add(((Object) (Integer.valueOf(0))));
	//   65  143:aload           5
	//   66  145:iconst_0        
	//   67  146:invokestatic    #254 <Method Integer Integer.valueOf(int)>
	//   68  149:invokeinterface #302 <Method boolean List.add(Object)>
	//   69  154:pop             
			}
		}
		return ((List) (arraylist));
	//   70  155:aload           5
	//   71  157:areturn         
	}

	protected final void b()
	{
		e();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #595 <Method void e()>
		if(C != null)
	//*   2    4:aload_0         
	//*   3    5:getfield        #128 <Field Looper C>
	//*   4    8:ifnull          23
		{
			C.quit();
	//    5   11:aload_0         
	//    6   12:getfield        #128 <Field Looper C>
	//    7   15:invokevirtual   #600 <Method void Looper.quit()>
			C = null;
	//    8   18:aload_0         
	//    9   19:aconst_null     
	//   10   20:putfield        #128 <Field Looper C>
		}
		if(A != null)
	//*  11   23:aload_0         
	//*  12   24:getfield        #126 <Field Thread A>
	//*  13   27:ifnull          42
		{
			A.interrupt();
	//   14   30:aload_0         
	//   15   31:getfield        #126 <Field Thread A>
	//   16   34:invokevirtual   #605 <Method void Thread.interrupt()>
			A = null;
	//   17   37:aload_0         
	//   18   38:aconst_null     
	//   19   39:putfield        #126 <Field Thread A>
		}
		A = ((Thread) (new it(this, "")));
	//   20   42:aload_0         
	//   21   43:new             #607 <Class it>
	//   22   46:dup             
	//   23   47:aload_0         
	//   24   48:ldc1            #77  <String "">
	//   25   50:invokespecial   #610 <Method void it(iq, String)>
	//   26   53:putfield        #126 <Field Thread A>
		A.start();
	//   27   56:aload_0         
	//   28   57:getfield        #126 <Field Thread A>
	//   29   60:invokevirtual   #613 <Method void Thread.start()>
	//   30   63:return          
	}

	protected final int c(int i1)
	{
		new ArrayList();
	//    0    0:new             #119 <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #120 <Method void ArrayList()>
	//    3    7:pop             
		if(b == null)
	//*   4    8:aload_0         
	//*   5    9:getfield        #75  <Field SensorManager b>
	//*   6   12:ifnonnull       17
			return 0;
	//    7   15:iconst_0        
	//    8   16:ireturn         
		List list = b.getSensorList(-1);
	//    9   17:aload_0         
	//   10   18:getfield        #75  <Field SensorManager b>
	//   11   21:iconst_m1       
	//   12   22:invokevirtual   #555 <Method List SensorManager.getSensorList(int)>
	//   13   25:astore_2        
		if(list == null || list.get(i1) == null)
	//*  14   26:aload_2         
	//*  15   27:ifnull          40
	//*  16   30:aload_2         
	//*  17   31:iload_1         
	//*  18   32:invokeinterface #240 <Method Object List.get(int)>
	//*  19   37:ifnonnull       42
			return 0;
	//   20   40:iconst_0        
	//   21   41:ireturn         
		else
			return (int)((double)((Sensor)list.get(i1)).getPower() * 100D);
	//   22   42:aload_2         
	//   23   43:iload_1         
	//   24   44:invokeinterface #240 <Method Object List.get(int)>
	//   25   49:checkcast       #312 <Class Sensor>
	//   26   52:invokevirtual   #616 <Method float Sensor.getPower()>
	//   27   55:f2d             
	//   28   56:ldc2w           #617 <Double 100D>
	//   29   59:dmul            
	//   30   60:d2i             
	//   31   61:ireturn         
	}

	protected final boolean c()
	{
		CellLocation celllocation;
		celllocation = null;
	//    0    0:aconst_null     
	//    1    1:astore_1        
		if(c != null && c.getSimState() == 5 && m)
	//*   2    2:aload_0         
	//*   3    3:getfield        #69  <Field TelephonyManager c>
	//*   4    6:ifnull          29
	//*   5    9:aload_0         
	//*   6   10:getfield        #69  <Field TelephonyManager c>
	//*   7   13:invokevirtual   #621 <Method int TelephonyManager.getSimState()>
	//*   8   16:iconst_5        
	//*   9   17:icmpne          29
	//*  10   20:aload_0         
	//*  11   21:getfield        #89  <Field boolean m>
	//*  12   24:ifeq            29
			return true;
	//   13   27:iconst_1        
	//   14   28:ireturn         
		if(c == null) goto _L2; else goto _L1
	//   15   29:aload_0         
	//   16   30:getfield        #69  <Field TelephonyManager c>
	//   17   33:ifnull          64
_L1:
		CellLocation celllocation1 = c.getCellLocation();
	//   18   36:aload_0         
	//   19   37:getfield        #69  <Field TelephonyManager c>
	//   20   40:invokevirtual   #624 <Method CellLocation TelephonyManager.getCellLocation()>
	//   21   43:astore_2        
		celllocation = celllocation1;
	//   22   44:aload_2         
	//   23   45:astore_1        
_L4:
		if(celllocation != null)
	//*  24   46:aload_1         
	//*  25   47:ifnull          64
		{
			r = System.currentTimeMillis();
	//   26   50:aload_0         
	//   27   51:invokestatic    #574 <Method long System.currentTimeMillis()>
	//   28   54:putfield        #109 <Field long r>
			w = celllocation;
	//   29   57:aload_0         
	//   30   58:aload_1         
	//   31   59:putfield        #115 <Field CellLocation w>
			return true;
	//   32   62:iconst_1        
	//   33   63:ireturn         
		}
_L2:
		return false;
	//   34   64:iconst_0        
	//   35   65:ireturn         
		Exception exception;
		exception;
	//   36   66:astore_2        
		if(true) goto _L4; else goto _L3
_L3:
	//*  37   67:goto            46
	}

	protected final double d(int i1)
	{
		new ArrayList();
	//    0    0:new             #119 <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #120 <Method void ArrayList()>
	//    3    7:pop             
		if(b == null)
	//*   4    8:aload_0         
	//*   5    9:getfield        #75  <Field SensorManager b>
	//*   6   12:ifnonnull       17
			return 0.0D;
	//    7   15:dconst_0        
	//    8   16:dreturn         
		List list = b.getSensorList(-1);
	//    9   17:aload_0         
	//   10   18:getfield        #75  <Field SensorManager b>
	//   11   21:iconst_m1       
	//   12   22:invokevirtual   #555 <Method List SensorManager.getSensorList(int)>
	//   13   25:astore_2        
		if(list == null || list.get(i1) == null)
	//*  14   26:aload_2         
	//*  15   27:ifnull          40
	//*  16   30:aload_2         
	//*  17   31:iload_1         
	//*  18   32:invokeinterface #240 <Method Object List.get(int)>
	//*  19   37:ifnonnull       42
			return 0.0D;
	//   20   40:dconst_0        
	//   21   41:dreturn         
		else
			return (double)((Sensor)list.get(i1)).getResolution();
	//   22   42:aload_2         
	//   23   43:iload_1         
	//   24   44:invokeinterface #240 <Method Object List.get(int)>
	//   25   49:checkcast       #312 <Class Sensor>
	//   26   52:invokevirtual   #627 <Method float Sensor.getResolution()>
	//   27   55:f2d             
	//   28   56:dreturn         
	}

	protected final boolean d()
	{
		boolean flag;
		if(a == null)
			break MISSING_BLOCK_LABEL_24;
	//    0    0:aload_0         
	//    1    1:getfield        #71  <Field LocationManager a>
	//    2    4:ifnull          24
		flag = a.isProviderEnabled("gps");
	//    3    7:aload_0         
	//    4    8:getfield        #71  <Field LocationManager a>
	//    5   11:ldc2            #545 <String "gps">
	//    6   14:invokevirtual   #631 <Method boolean LocationManager.isProviderEnabled(String)>
	//    7   17:istore_1        
		if(flag)
	//*   8   18:iload_1         
	//*   9   19:ifeq            24
			return true;
	//   10   22:iconst_1        
	//   11   23:ireturn         
_L2:
		return false;
	//   12   24:iconst_0        
	//   13   25:ireturn         
		Exception exception;
		exception;
	//   14   26:astore_2        
		if(true) goto _L2; else goto _L1
_L1:
	//*  15   27:goto            24
	}

	protected final String e(int i1)
	{
		new ArrayList();
	//    0    0:new             #119 <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #120 <Method void ArrayList()>
	//    3    7:pop             
		if(b == null)
	//*   4    8:aload_0         
	//*   5    9:getfield        #75  <Field SensorManager b>
	//*   6   12:ifnonnull       18
			return "null";
	//    7   15:ldc1            #247 <String "null">
	//    8   17:areturn         
		List list = b.getSensorList(-1);
	//    9   18:aload_0         
	//   10   19:getfield        #75  <Field SensorManager b>
	//   11   22:iconst_m1       
	//   12   23:invokevirtual   #555 <Method List SensorManager.getSensorList(int)>
	//   13   26:astore_2        
		if(list == null || list.get(i1) == null || ((Sensor)list.get(i1)).getName() == null || ((Sensor)list.get(i1)).getName().length() <= 0)
	//*  14   27:aload_2         
	//*  15   28:ifnull          76
	//*  16   31:aload_2         
	//*  17   32:iload_1         
	//*  18   33:invokeinterface #240 <Method Object List.get(int)>
	//*  19   38:ifnull          76
	//*  20   41:aload_2         
	//*  21   42:iload_1         
	//*  22   43:invokeinterface #240 <Method Object List.get(int)>
	//*  23   48:checkcast       #312 <Class Sensor>
	//*  24   51:invokevirtual   #634 <Method String Sensor.getName()>
	//*  25   54:ifnull          76
	//*  26   57:aload_2         
	//*  27   58:iload_1         
	//*  28   59:invokeinterface #240 <Method Object List.get(int)>
	//*  29   64:checkcast       #312 <Class Sensor>
	//*  30   67:invokevirtual   #634 <Method String Sensor.getName()>
	//*  31   70:invokevirtual   #177 <Method int String.length()>
	//*  32   73:ifgt            79
			return "null";
	//   33   76:ldc1            #247 <String "null">
	//   34   78:areturn         
		else
			return ((Sensor)list.get(i1)).getName();
	//   35   79:aload_2         
	//   36   80:iload_1         
	//   37   81:invokeinterface #240 <Method Object List.get(int)>
	//   38   86:checkcast       #312 <Class Sensor>
	//   39   89:invokevirtual   #634 <Method String Sensor.getName()>
	//   40   92:areturn         
	}

	protected final List e(float f1)
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #119 <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #120 <Method void ArrayList()>
	//    3    7:astore          5
		long l1 = System.currentTimeMillis();
	//    4    9:invokestatic    #574 <Method long System.currentTimeMillis()>
	//    5   12:lstore_3        
		float f2 = f1;
	//    6   13:fload_1         
	//    7   14:fstore_2        
		if(Math.abs(f1) <= 1.0F)
	//*   8   15:fload_1         
	//*   9   16:invokestatic    #580 <Method float Math.abs(float)>
	//*  10   19:fconst_1        
	//*  11   20:fcmpg           
	//*  12   21:ifgt            26
			f2 = 1.0F;
	//   13   24:fconst_1        
	//   14   25:fstore_2        
		if(c())
	//*  15   26:aload_0         
	//*  16   27:invokevirtual   #582 <Method boolean c()>
	//*  17   30:ifeq            204
		{
			Object obj = ((Object) ((CellLocation)g().get(1)));
	//   18   33:aload_0         
	//   19   34:invokevirtual   #584 <Method List g()>
	//   20   37:iconst_1        
	//   21   38:invokeinterface #240 <Method Object List.get(int)>
	//   22   43:checkcast       #586 <Class CellLocation>
	//   23   46:astore          6
			if(obj != null && (obj instanceof CdmaCellLocation))
	//*  24   48:aload           6
	//*  25   50:ifnull          204
	//*  26   53:aload           6
	//*  27   55:instanceof      #361 <Class CdmaCellLocation>
	//*  28   58:ifeq            204
			{
				obj = ((Object) ((CdmaCellLocation)obj));
	//   29   61:aload           6
	//   30   63:checkcast       #361 <Class CdmaCellLocation>
	//   31   66:astore          6
				((List) (arraylist)).add(((Object) (Integer.valueOf(((CdmaCellLocation) (obj)).getSystemId()))));
	//   32   68:aload           5
	//   33   70:aload           6
	//   34   72:invokevirtual   #636 <Method int CdmaCellLocation.getSystemId()>
	//   35   75:invokestatic    #254 <Method Integer Integer.valueOf(int)>
	//   36   78:invokeinterface #302 <Method boolean List.add(Object)>
	//   37   83:pop             
				((List) (arraylist)).add(((Object) (Integer.valueOf(((CdmaCellLocation) (obj)).getNetworkId()))));
	//   38   84:aload           5
	//   39   86:aload           6
	//   40   88:invokevirtual   #638 <Method int CdmaCellLocation.getNetworkId()>
	//   41   91:invokestatic    #254 <Method Integer Integer.valueOf(int)>
	//   42   94:invokeinterface #302 <Method boolean List.add(Object)>
	//   43   99:pop             
				((List) (arraylist)).add(((Object) (Integer.valueOf(((CdmaCellLocation) (obj)).getBaseStationId()))));
	//   44  100:aload           5
	//   45  102:aload           6
	//   46  104:invokevirtual   #640 <Method int CdmaCellLocation.getBaseStationId()>
	//   47  107:invokestatic    #254 <Method Integer Integer.valueOf(int)>
	//   48  110:invokeinterface #302 <Method boolean List.add(Object)>
	//   49  115:pop             
				((List) (arraylist)).add(((Object) (Integer.valueOf(((CdmaCellLocation) (obj)).getBaseStationLongitude()))));
	//   50  116:aload           5
	//   51  118:aload           6
	//   52  120:invokevirtual   #643 <Method int CdmaCellLocation.getBaseStationLongitude()>
	//   53  123:invokestatic    #254 <Method Integer Integer.valueOf(int)>
	//   54  126:invokeinterface #302 <Method boolean List.add(Object)>
	//   55  131:pop             
				((List) (arraylist)).add(((Object) (Integer.valueOf(((CdmaCellLocation) (obj)).getBaseStationLatitude()))));
	//   56  132:aload           5
	//   57  134:aload           6
	//   58  136:invokevirtual   #646 <Method int CdmaCellLocation.getBaseStationLatitude()>
	//   59  139:invokestatic    #254 <Method Integer Integer.valueOf(int)>
	//   60  142:invokeinterface #302 <Method boolean List.add(Object)>
	//   61  147:pop             
				if((double)(l1 - ((Long)g().get(0)).longValue()) <= 50000D / (double)f2)
	//*  62  148:lload_3         
	//*  63  149:aload_0         
	//*  64  150:invokevirtual   #584 <Method List g()>
	//*  65  153:iconst_0        
	//*  66  154:invokeinterface #240 <Method Object List.get(int)>
	//*  67  159:checkcast       #588 <Class Long>
	//*  68  162:invokevirtual   #591 <Method long Long.longValue()>
	//*  69  165:lsub            
	//*  70  166:l2d             
	//*  71  167:ldc2w           #592 <Double 50000D>
	//*  72  170:fload_2         
	//*  73  171:f2d             
	//*  74  172:ddiv            
	//*  75  173:dcmpg           
	//*  76  174:ifgt            192
				{
					((List) (arraylist)).add(((Object) (Integer.valueOf(1))));
	//   77  177:aload           5
	//   78  179:iconst_1        
	//   79  180:invokestatic    #254 <Method Integer Integer.valueOf(int)>
	//   80  183:invokeinterface #302 <Method boolean List.add(Object)>
	//   81  188:pop             
					return ((List) (arraylist));
	//   82  189:aload           5
	//   83  191:areturn         
				}
				((List) (arraylist)).add(((Object) (Integer.valueOf(0))));
	//   84  192:aload           5
	//   85  194:iconst_0        
	//   86  195:invokestatic    #254 <Method Integer Integer.valueOf(int)>
	//   87  198:invokeinterface #302 <Method boolean List.add(Object)>
	//   88  203:pop             
			}
		}
		return ((List) (arraylist));
	//   89  204:aload           5
	//   90  206:areturn         
	}

	protected final void e()
	{
		if(z != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #111 <Field ir z>
	//*   2    4:ifnull          33
		{
			ir ir = z;
	//    3    7:aload_0         
	//    4    8:getfield        #111 <Field ir z>
	//    5   11:astore_1        
			if(c != null)
	//*   6   12:aload_0         
	//*   7   13:getfield        #69  <Field TelephonyManager c>
	//*   8   16:ifnull          28
				c.listen(((PhoneStateListener) (ir)), 0);
	//    9   19:aload_0         
	//   10   20:getfield        #69  <Field TelephonyManager c>
	//   11   23:aload_1         
	//   12   24:iconst_0        
	//   13   25:invokevirtual   #309 <Method void TelephonyManager.listen(PhoneStateListener, int)>
			z = null;
	//   14   28:aload_0         
	//   15   29:aconst_null     
	//   16   30:putfield        #111 <Field ir z>
		}
		if(x != null)
	//*  17   33:aload_0         
	//*  18   34:getfield        #113 <Field iy x>
	//*  19   37:ifnull          72
		{
			iy iy = x;
	//   20   40:aload_0         
	//   21   41:getfield        #113 <Field iy x>
	//   22   44:astore_1        
			if(a != null && iy != null)
	//*  23   45:aload_0         
	//*  24   46:getfield        #71  <Field LocationManager a>
	//*  25   49:ifnull          56
	//*  26   52:aload_1         
	//*  27   53:ifnonnull       59
	//*  28   56:goto            67
				a.removeNmeaListener(((android.location.GpsStatus.NmeaListener) (iy)));
	//   29   59:aload_0         
	//   30   60:getfield        #71  <Field LocationManager a>
	//   31   63:aload_1         
	//   32   64:invokevirtual   #650 <Method void LocationManager.removeNmeaListener(android.location.GpsStatus$NmeaListener)>
			x = null;
	//   33   67:aload_0         
	//   34   68:aconst_null     
	//   35   69:putfield        #113 <Field iy x>
		}
		if(B != null)
	//*  36   72:aload_0         
	//*  37   73:getfield        #124 <Field Timer B>
	//*  38   76:ifnull          91
		{
			B.cancel();
	//   39   79:aload_0         
	//   40   80:getfield        #124 <Field Timer B>
	//   41   83:invokevirtual   #655 <Method void Timer.cancel()>
			B = null;
	//   42   86:aload_0         
	//   43   87:aconst_null     
	//   44   88:putfield        #124 <Field Timer B>
		}
		if(C != null)
	//*  45   91:aload_0         
	//*  46   92:getfield        #128 <Field Looper C>
	//*  47   95:ifnull          110
		{
			C.quit();
	//   48   98:aload_0         
	//   49   99:getfield        #128 <Field Looper C>
	//   50  102:invokevirtual   #600 <Method void Looper.quit()>
			C = null;
	//   51  105:aload_0         
	//   52  106:aconst_null     
	//   53  107:putfield        #128 <Field Looper C>
		}
		if(A != null)
	//*  54  110:aload_0         
	//*  55  111:getfield        #126 <Field Thread A>
	//*  56  114:ifnull          129
		{
			A.interrupt();
	//   57  117:aload_0         
	//   58  118:getfield        #126 <Field Thread A>
	//   59  121:invokevirtual   #605 <Method void Thread.interrupt()>
			A = null;
	//   60  124:aload_0         
	//   61  125:aconst_null     
	//   62  126:putfield        #126 <Field Thread A>
		}
	//   63  129:return          
	}

	protected final byte f(int i1)
	{
		new ArrayList();
	//    0    0:new             #119 <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #120 <Method void ArrayList()>
	//    3    7:pop             
		if(b == null)
	//*   4    8:aload_0         
	//*   5    9:getfield        #75  <Field SensorManager b>
	//*   6   12:ifnonnull       18
			return 127;
	//    7   15:bipush          127
	//    8   17:ireturn         
		List list = b.getSensorList(-1);
	//    9   18:aload_0         
	//   10   19:getfield        #75  <Field SensorManager b>
	//   11   22:iconst_m1       
	//   12   23:invokevirtual   #555 <Method List SensorManager.getSensorList(int)>
	//   13   26:astore_2        
		if(list == null || list.get(i1) == null || ((Sensor)list.get(i1)).getType() > 127)
	//*  14   27:aload_2         
	//*  15   28:ifnull          59
	//*  16   31:aload_2         
	//*  17   32:iload_1         
	//*  18   33:invokeinterface #240 <Method Object List.get(int)>
	//*  19   38:ifnull          59
	//*  20   41:aload_2         
	//*  21   42:iload_1         
	//*  22   43:invokeinterface #240 <Method Object List.get(int)>
	//*  23   48:checkcast       #312 <Class Sensor>
	//*  24   51:invokevirtual   #659 <Method int Sensor.getType()>
	//*  25   54:bipush          127
	//*  26   56:icmple          62
			return 127;
	//   27   59:bipush          127
	//   28   61:ireturn         
		else
			return (byte)((Sensor)list.get(i1)).getType();
	//   29   62:aload_2         
	//   30   63:iload_1         
	//   31   64:invokeinterface #240 <Method Object List.get(int)>
	//   32   69:checkcast       #312 <Class Sensor>
	//   33   72:invokevirtual   #659 <Method int Sensor.getType()>
	//   34   75:int2byte        
	//   35   76:ireturn         
	}

	protected final String f()
	{
		if(g == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #79  <Field String g>
	//*   2    4:ifnonnull       14
			g = Build.MODEL;
	//    3    7:aload_0         
	//    4    8:getstatic       #133 <Field String Build.MODEL>
	//    5   11:putfield        #79  <Field String g>
		if(g != null)
	//*   6   14:aload_0         
	//*   7   15:getfield        #79  <Field String g>
	//*   8   18:ifnull          26
			return g;
	//    9   21:aload_0         
	//   10   22:getfield        #79  <Field String g>
	//   11   25:areturn         
		else
			return "";
	//   12   26:ldc1            #77  <String "">
	//   13   28:areturn         
	}

	protected final List g()
	{
label0:
		{
			CellLocation celllocation;
			ArrayList arraylist;
label1:
			{
				if(android.provider.Settings.System.getInt(e.getContentResolver(), "airplane_mode_on", 0) == 1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #67  <Field Context e>
	//*   2    4:invokevirtual   #453 <Method android.content.ContentResolver Context.getContentResolver()>
	//*   3    7:ldc2            #455 <String "airplane_mode_on">
	//*   4   10:iconst_0        
	//*   5   11:invokestatic    #461 <Method int android.provider.Settings$System.getInt(android.content.ContentResolver, String, int)>
	//*   6   14:iconst_1        
	//*   7   15:icmpne          26
					return ((List) (new ArrayList()));
	//    8   18:new             #119 <Class ArrayList>
	//    9   21:dup             
	//   10   22:invokespecial   #120 <Method void ArrayList()>
	//   11   25:areturn         
				if(!c())
					break label0;
	//   12   26:aload_0         
	//   13   27:invokevirtual   #582 <Method boolean c()>
	//   14   30:ifeq            104
				arraylist = new ArrayList();
	//   15   33:new             #119 <Class ArrayList>
	//   16   36:dup             
	//   17   37:invokespecial   #120 <Method void ArrayList()>
	//   18   40:astore_2        
				if(!b(w))
	//*  19   41:aload_0         
	//*  20   42:aload_0         
	//*  21   43:getfield        #115 <Field CellLocation w>
	//*  22   46:invokespecial   #661 <Method boolean b(CellLocation)>
	//*  23   49:ifne            75
				{
					celllocation = D();
	//   24   52:aload_0         
	//   25   53:invokespecial   #663 <Method CellLocation D()>
	//   26   56:astore_1        
					if(b(celllocation))
	//*  27   57:aload_0         
	//*  28   58:aload_1         
	//*  29   59:invokespecial   #661 <Method boolean b(CellLocation)>
	//*  30   62:ifeq            75
					{
						r = System.currentTimeMillis();
	//   31   65:aload_0         
	//   32   66:invokestatic    #574 <Method long System.currentTimeMillis()>
	//   33   69:putfield        #109 <Field long r>
						break label1;
	//   34   72:goto            80
					}
				}
				celllocation = w;
	//   35   75:aload_0         
	//   36   76:getfield        #115 <Field CellLocation w>
	//   37   79:astore_1        
			}
			((List) (arraylist)).add(((Object) (Long.valueOf(r))));
	//   38   80:aload_2         
	//   39   81:aload_0         
	//   40   82:getfield        #109 <Field long r>
	//   41   85:invokestatic    #666 <Method Long Long.valueOf(long)>
	//   42   88:invokeinterface #302 <Method boolean List.add(Object)>
	//   43   93:pop             
			((List) (arraylist)).add(((Object) (celllocation)));
	//   44   94:aload_2         
	//   45   95:aload_1         
	//   46   96:invokeinterface #302 <Method boolean List.add(Object)>
	//   47  101:pop             
			return ((List) (arraylist));
	//   48  102:aload_2         
	//   49  103:areturn         
		}
		return ((List) (new ArrayList()));
	//   50  104:new             #119 <Class ArrayList>
	//   51  107:dup             
	//   52  108:invokespecial   #120 <Method void ArrayList()>
	//   53  111:areturn         
	}

	protected final boolean h()
	{
		return k;
	//    0    0:aload_0         
	//    1    1:getfield        #85  <Field boolean k>
	//    2    4:ireturn         
	}

	protected final byte i(int i1)
	{
		new ArrayList();
	//    0    0:new             #119 <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #120 <Method void ArrayList()>
	//    3    7:pop             
		if(b == null)
	//*   4    8:aload_0         
	//*   5    9:getfield        #75  <Field SensorManager b>
	//*   6   12:ifnonnull       18
			return 127;
	//    7   15:bipush          127
	//    8   17:ireturn         
		List list = b.getSensorList(-1);
	//    9   18:aload_0         
	//   10   19:getfield        #75  <Field SensorManager b>
	//   11   22:iconst_m1       
	//   12   23:invokevirtual   #555 <Method List SensorManager.getSensorList(int)>
	//   13   26:astore_2        
		if(list == null || list.get(i1) == null || ((Sensor)list.get(i1)).getType() > 127)
	//*  14   27:aload_2         
	//*  15   28:ifnull          59
	//*  16   31:aload_2         
	//*  17   32:iload_1         
	//*  18   33:invokeinterface #240 <Method Object List.get(int)>
	//*  19   38:ifnull          59
	//*  20   41:aload_2         
	//*  21   42:iload_1         
	//*  22   43:invokeinterface #240 <Method Object List.get(int)>
	//*  23   48:checkcast       #312 <Class Sensor>
	//*  24   51:invokevirtual   #659 <Method int Sensor.getType()>
	//*  25   54:bipush          127
	//*  26   56:icmple          62
			return 127;
	//   27   59:bipush          127
	//   28   61:ireturn         
		else
			return (byte)((Sensor)list.get(i1)).getVersion();
	//   29   62:aload_2         
	//   30   63:iload_1         
	//   31   64:invokeinterface #240 <Method Object List.get(int)>
	//   32   69:checkcast       #312 <Class Sensor>
	//   33   72:invokevirtual   #669 <Method int Sensor.getVersion()>
	//   34   75:int2byte        
	//   35   76:ireturn         
	}

	protected final String i()
	{
		if(f == null && e != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #83  <Field String f>
	//*   2    4:ifnonnull       48
	//*   3    7:aload_0         
	//*   4    8:getfield        #67  <Field Context e>
	//*   5   11:ifnull          48
		{
			c = (TelephonyManager)e.getSystemService("phone");
	//    6   14:aload_0         
	//    7   15:aload_0         
	//    8   16:getfield        #67  <Field Context e>
	//    9   19:ldc1            #135 <String "phone">
	//   10   21:invokevirtual   #141 <Method Object Context.getSystemService(String)>
	//   11   24:checkcast       #143 <Class TelephonyManager>
	//   12   27:putfield        #69  <Field TelephonyManager c>
			if(c != null)
	//*  13   30:aload_0         
	//*  14   31:getfield        #69  <Field TelephonyManager c>
	//*  15   34:ifnull          48
				f = c.getSubscriberId();
	//   16   37:aload_0         
	//   17   38:aload_0         
	//   18   39:getfield        #69  <Field TelephonyManager c>
	//   19   42:invokevirtual   #162 <Method String TelephonyManager.getSubscriberId()>
	//   20   45:putfield        #83  <Field String f>
		}
		if(f != null)
	//*  21   48:aload_0         
	//*  22   49:getfield        #83  <Field String f>
	//*  23   52:ifnull          60
			return f;
	//   24   55:aload_0         
	//   25   56:getfield        #83  <Field String f>
	//   26   59:areturn         
		else
			return "";
	//   27   60:ldc1            #77  <String "">
	//   28   62:areturn         
	}

	protected final String k()
	{
		if(i == null && e != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #81  <Field String i>
	//*   2    4:ifnonnull       48
	//*   3    7:aload_0         
	//*   4    8:getfield        #67  <Field Context e>
	//*   5   11:ifnull          48
		{
			c = (TelephonyManager)e.getSystemService("phone");
	//    6   14:aload_0         
	//    7   15:aload_0         
	//    8   16:getfield        #67  <Field Context e>
	//    9   19:ldc1            #135 <String "phone">
	//   10   21:invokevirtual   #141 <Method Object Context.getSystemService(String)>
	//   11   24:checkcast       #143 <Class TelephonyManager>
	//   12   27:putfield        #69  <Field TelephonyManager c>
			if(c != null)
	//*  13   30:aload_0         
	//*  14   31:getfield        #69  <Field TelephonyManager c>
	//*  15   34:ifnull          48
				try
				{
					i = c.getDeviceId();
	//   16   37:aload_0         
	//   17   38:aload_0         
	//   18   39:getfield        #69  <Field TelephonyManager c>
	//   19   42:invokevirtual   #159 <Method String TelephonyManager.getDeviceId()>
	//   20   45:putfield        #81  <Field String i>
				}
	//*  21   48:aload_0         
	//*  22   49:getfield        #81  <Field String i>
	//*  23   52:ifnull          60
	//*  24   55:aload_0         
	//*  25   56:getfield        #81  <Field String i>
	//*  26   59:areturn         
	//*  27   60:ldc1            #77  <String "">
	//*  28   62:areturn         
				catch(Exception exception) { }
	//   29   63:astore_1        
		}
		if(i != null)
			return i;
		else
			return "";
	//*  30   64:goto            48
	}

	protected final String k(int i1)
	{
		new ArrayList();
	//    0    0:new             #119 <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #120 <Method void ArrayList()>
	//    3    7:pop             
		if(b == null)
	//*   4    8:aload_0         
	//*   5    9:getfield        #75  <Field SensorManager b>
	//*   6   12:ifnonnull       18
			return "null";
	//    7   15:ldc1            #247 <String "null">
	//    8   17:areturn         
		List list = b.getSensorList(-1);
	//    9   18:aload_0         
	//   10   19:getfield        #75  <Field SensorManager b>
	//   11   22:iconst_m1       
	//   12   23:invokevirtual   #555 <Method List SensorManager.getSensorList(int)>
	//   13   26:astore_2        
		if(list == null || list.get(i1) == null || ((Sensor)list.get(i1)).getVendor() == null || ((Sensor)list.get(i1)).getVendor().length() <= 0)
	//*  14   27:aload_2         
	//*  15   28:ifnull          76
	//*  16   31:aload_2         
	//*  17   32:iload_1         
	//*  18   33:invokeinterface #240 <Method Object List.get(int)>
	//*  19   38:ifnull          76
	//*  20   41:aload_2         
	//*  21   42:iload_1         
	//*  22   43:invokeinterface #240 <Method Object List.get(int)>
	//*  23   48:checkcast       #312 <Class Sensor>
	//*  24   51:invokevirtual   #672 <Method String Sensor.getVendor()>
	//*  25   54:ifnull          76
	//*  26   57:aload_2         
	//*  27   58:iload_1         
	//*  28   59:invokeinterface #240 <Method Object List.get(int)>
	//*  29   64:checkcast       #312 <Class Sensor>
	//*  30   67:invokevirtual   #672 <Method String Sensor.getVendor()>
	//*  31   70:invokevirtual   #177 <Method int String.length()>
	//*  32   73:ifgt            79
			return "null";
	//   33   76:ldc1            #247 <String "null">
	//   34   78:areturn         
		else
			return ((Sensor)list.get(i1)).getVendor();
	//   35   79:aload_2         
	//   36   80:iload_1         
	//   37   81:invokeinterface #240 <Method Object List.get(int)>
	//   38   86:checkcast       #312 <Class Sensor>
	//   39   89:invokevirtual   #672 <Method String Sensor.getVendor()>
	//   40   92:areturn         
	}

	protected final byte l()
	{
		if(c())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #582 <Method boolean c()>
	//*   2    4:ifeq            13
			return (byte)h;
	//    3    7:aload_0         
	//    4    8:getfield        #87  <Field int h>
	//    5   11:int2byte        
	//    6   12:ireturn         
		else
			return -128;
	//    7   13:bipush          -128
	//    8   15:ireturn         
	}

	protected final List m()
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #119 <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #120 <Method void ArrayList()>
	//    3    7:astore          6
		long l2 = -1L;
	//    4    9:ldc2w           #90  <Long -1L>
	//    5   12:lstore_3        
		String s1 = "";
	//    6   13:ldc1            #77  <String "">
	//    7   15:astore          5
		if(d())
	//*   8   17:aload_0         
	//*   9   18:invokevirtual   #675 <Method boolean d()>
	//*  10   21:ifeq            35
		{
			l2 = p;
	//   11   24:aload_0         
	//   12   25:getfield        #93  <Field long p>
	//   13   28:lstore_3        
			s1 = n;
	//   14   29:aload_0         
	//   15   30:getfield        #95  <Field String n>
	//   16   33:astore          5
		}
		long l1 = l2;
	//   17   35:lload_3         
	//   18   36:lstore_1        
		if(l2 <= 0L)
	//*  19   37:lload_3         
	//*  20   38:lconst_0        
	//*  21   39:lcmp            
	//*  22   40:ifgt            51
			l1 = System.currentTimeMillis() / 1000L;
	//   23   43:invokestatic    #574 <Method long System.currentTimeMillis()>
	//   24   46:ldc2w           #676 <Long 1000L>
	//   25   49:ldiv            
	//   26   50:lstore_1        
		l2 = l1;
	//   27   51:lload_1         
	//   28   52:lstore_3        
		if(l1 > 0x7fffffffL)
	//*  29   53:lload_1         
	//*  30   54:ldc2w           #678 <Long 0x7fffffffL>
	//*  31   57:lcmp            
	//*  32   58:ifle            67
			l2 = l1 / 1000L;
	//   33   61:lload_1         
	//   34   62:ldc2w           #676 <Long 1000L>
	//   35   65:ldiv            
	//   36   66:lstore_3        
		((List) (arraylist)).add(((Object) (Long.valueOf(l2))));
	//   37   67:aload           6
	//   38   69:lload_3         
	//   39   70:invokestatic    #666 <Method Long Long.valueOf(long)>
	//   40   73:invokeinterface #302 <Method boolean List.add(Object)>
	//   41   78:pop             
		((List) (arraylist)).add(((Object) (s1)));
	//   42   79:aload           6
	//   43   81:aload           5
	//   44   83:invokeinterface #302 <Method boolean List.add(Object)>
	//   45   88:pop             
		return ((List) (arraylist));
	//   46   89:aload           6
	//   47   91:areturn         
	}

	protected final List n()
	{
		ArrayList arraylist;
		arraylist = new ArrayList();
	//    0    0:new             #119 <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #120 <Method void ArrayList()>
	//    3    7:astore_2        
		if(!a())
			break MISSING_BLOCK_LABEL_119;
	//    4    8:aload_0         
	//    5    9:invokevirtual   #681 <Method boolean a()>
	//    6   12:ifeq            119
		ArrayList arraylist1 = new ArrayList();
	//    7   15:new             #119 <Class ArrayList>
	//    8   18:dup             
	//    9   19:invokespecial   #120 <Method void ArrayList()>
	//   10   22:astore_3        
		this;
	//   11   23:aload_0         
		JVM INSTR monitorenter ;
	//   12   24:monitorenter    
		int i1;
		Exception exception;
		if(System.currentTimeMillis() - t < 3500L)
	//*  13   25:invokestatic    #574 <Method long System.currentTimeMillis()>
	//*  14   28:aload_0         
	//*  15   29:getfield        #107 <Field long t>
	//*  16   32:lsub            
	//*  17   33:ldc2w           #682 <Long 3500L>
	//*  18   36:lcmp            
	//*  19   37:ifge            127
			i1 = 1;
	//   20   40:iconst_1        
	//   21   41:istore_1        
		else
	//*  22   42:goto            45
	//*  23   45:iload_1         
	//*  24   46:ifeq            110
	//*  25   49:aload_3         
	//*  26   50:aload_0         
	//*  27   51:getfield        #107 <Field long t>
	//*  28   54:invokestatic    #666 <Method Long Long.valueOf(long)>
	//*  29   57:invokeinterface #302 <Method boolean List.add(Object)>
	//*  30   62:pop             
	//*  31   63:iconst_0        
	//*  32   64:istore_1        
	//*  33   65:iload_1         
	//*  34   66:aload_0         
	//*  35   67:getfield        #122 <Field List j>
	//*  36   70:invokeinterface #233 <Method int List.size()>
	//*  37   75:icmpge          102
	//*  38   78:aload_2         
	//*  39   79:aload_0         
	//*  40   80:getfield        #122 <Field List j>
	//*  41   83:iload_1         
	//*  42   84:invokeinterface #240 <Method Object List.get(int)>
	//*  43   89:invokeinterface #302 <Method boolean List.add(Object)>
	//*  44   94:pop             
	//*  45   95:iload_1         
	//*  46   96:iconst_1        
	//*  47   97:iadd            
	//*  48   98:istore_1        
	//*  49   99:goto            65
	//*  50  102:aload_3         
	//*  51  103:aload_2         
	//*  52  104:invokeinterface #302 <Method boolean List.add(Object)>
	//*  53  109:pop             
	//*  54  110:aload_0         
	//*  55  111:monitorexit     
	//*  56  112:aload_3         
	//*  57  113:areturn         
	//*  58  114:astore_2        
	//*  59  115:aload_0         
	//*  60  116:monitorexit     
	//*  61  117:aload_2         
	//*  62  118:athrow          
	//*  63  119:new             #119 <Class ArrayList>
	//*  64  122:dup             
	//*  65  123:invokespecial   #120 <Method void ArrayList()>
	//*  66  126:areturn         
			i1 = 0;
	//   67  127:iconst_0        
	//   68  128:istore_1        
		if(i1 == 0)
			break MISSING_BLOCK_LABEL_110;
		((List) (arraylist1)).add(((Object) (Long.valueOf(t))));
		i1 = 0;
_L2:
		if(i1 >= j.size())
			break; /* Loop/switch isn't completed */
		((List) (arraylist)).add(j.get(i1));
		i1++;
		if(true) goto _L2; else goto _L1
_L1:
		((List) (arraylist1)).add(((Object) (arraylist)));
		this;
		JVM INSTR monitorexit ;
		return ((List) (arraylist1));
		exception;
		throw exception;
		return ((List) (new ArrayList()));
	//*  69  129:goto            45
	}

	protected final long o()
	{
		long l2 = p;
	//    0    0:aload_0         
	//    1    1:getfield        #93  <Field long p>
	//    2    4:lstore          4
		long l1 = l2;
	//    3    6:lload           4
	//    4    8:lstore_2        
		if(l2 <= 0L)
	//*   5    9:lload           4
	//*   6   11:lconst_0        
	//*   7   12:lcmp            
	//*   8   13:ifgt            18
			return 0L;
	//    9   16:lconst_0        
	//   10   17:lreturn         
		for(int i1 = String.valueOf(l1).length(); i1 != 13; i1 = String.valueOf(l1).length())
	//*  11   18:lload_2         
	//*  12   19:invokestatic    #686 <Method String String.valueOf(long)>
	//*  13   22:invokevirtual   #177 <Method int String.length()>
	//*  14   25:istore_1        
	//*  15   26:iload_1         
	//*  16   27:bipush          13
	//*  17   29:icmpeq          64
			if(i1 > 13)
	//*  18   32:iload_1         
	//*  19   33:bipush          13
	//*  20   35:icmple          47
				l1 /= 10L;
	//   21   38:lload_2         
	//   22   39:ldc2w           #687 <Long 10L>
	//   23   42:ldiv            
	//   24   43:lstore_2        
			else
	//*  25   44:goto            53
				l1 *= 10L;
	//   26   47:lload_2         
	//   27   48:ldc2w           #687 <Long 10L>
	//   28   51:lmul            
	//   29   52:lstore_2        

	//   30   53:lload_2         
	//   31   54:invokestatic    #686 <Method String String.valueOf(long)>
	//   32   57:invokevirtual   #177 <Method int String.length()>
	//   33   60:istore_1        
	//*  34   61:goto            26
		return l1;
	//   35   64:lload_2         
	//   36   65:lreturn         
	}

	protected final List p()
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #119 <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #120 <Method void ArrayList()>
	//    3    7:astore_2        
		int i1 = 0;
	//    4    8:iconst_0        
	//    5    9:istore_1        
		if(c == null)
	//*   6   10:aload_0         
	//*   7   11:getfield        #69  <Field TelephonyManager c>
	//*   8   14:ifnonnull       19
			return ((List) (arraylist));
	//    9   17:aload_2         
	//   10   18:areturn         
		if(!c())
	//*  11   19:aload_0         
	//*  12   20:invokevirtual   #582 <Method boolean c()>
	//*  13   23:ifne            28
			return ((List) (arraylist));
	//   14   26:aload_2         
	//   15   27:areturn         
		if(c.getSimState() == 1)
	//*  16   28:aload_0         
	//*  17   29:getfield        #69  <Field TelephonyManager c>
	//*  18   32:invokevirtual   #621 <Method int TelephonyManager.getSimState()>
	//*  19   35:iconst_1        
	//*  20   36:icmpne          41
			return ((List) (arraylist));
	//   21   39:aload_2         
	//   22   40:areturn         
		Iterator iterator = c.getNeighboringCellInfo().iterator();
	//   23   41:aload_0         
	//   24   42:getfield        #69  <Field TelephonyManager c>
	//   25   45:invokevirtual   #691 <Method List TelephonyManager.getNeighboringCellInfo()>
	//   26   48:invokeinterface #491 <Method Iterator List.iterator()>
	//   27   53:astore_3        
		do
		{
			if(!iterator.hasNext())
				break;
	//   28   54:aload_3         
	//   29   55:invokeinterface #291 <Method boolean Iterator.hasNext()>
	//   30   60:ifeq            137
			NeighboringCellInfo neighboringcellinfo = (NeighboringCellInfo)iterator.next();
	//   31   63:aload_3         
	//   32   64:invokeinterface #295 <Method Object Iterator.next()>
	//   33   69:checkcast       #693 <Class NeighboringCellInfo>
	//   34   72:astore          4
			if(i1 > 15)
				break;
	//   35   74:iload_1         
	//   36   75:bipush          15
	//   37   77:icmpgt          137
			if(neighboringcellinfo.getLac() != 0 && neighboringcellinfo.getLac() != 65535 && neighboringcellinfo.getCid() != 65535 && neighboringcellinfo.getCid() != 0xfffffff)
	//*  38   80:aload           4
	//*  39   82:invokevirtual   #694 <Method int NeighboringCellInfo.getLac()>
	//*  40   85:ifeq            54
	//*  41   88:aload           4
	//*  42   90:invokevirtual   #694 <Method int NeighboringCellInfo.getLac()>
	//*  43   93:ldc2            #416 <Int 65535>
	//*  44   96:icmpeq          54
	//*  45   99:aload           4
	//*  46  101:invokevirtual   #695 <Method int NeighboringCellInfo.getCid()>
	//*  47  104:ldc2            #416 <Int 65535>
	//*  48  107:icmpeq          54
	//*  49  110:aload           4
	//*  50  112:invokevirtual   #695 <Method int NeighboringCellInfo.getCid()>
	//*  51  115:ldc2            #419 <Int 0xfffffff>
	//*  52  118:icmpeq          54
			{
				((List) (arraylist)).add(((Object) (neighboringcellinfo)));
	//   53  121:aload_2         
	//   54  122:aload           4
	//   55  124:invokeinterface #302 <Method boolean List.add(Object)>
	//   56  129:pop             
				i1++;
	//   57  130:iload_1         
	//   58  131:iconst_1        
	//   59  132:iadd            
	//   60  133:istore_1        
			}
		} while(true);
	//   61  134:goto            54
		return ((List) (arraylist));
	//   62  137:aload_2         
	//   63  138:areturn         
	}

	protected final int q()
	{
		return u;
	//    0    0:aload_0         
	//    1    1:getfield        #101 <Field int u>
	//    2    4:ireturn         
	}

	protected final int r()
	{
		return s;
	//    0    0:aload_0         
	//    1    1:getfield        #103 <Field int s>
	//    2    4:ireturn         
	}

	protected final int s()
	{
		return o;
	//    0    0:aload_0         
	//    1    1:getfield        #99  <Field int o>
	//    2    4:ireturn         
	}

	protected final String t()
	{
		if(q == null && e != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #105 <Field String q>
	//*   2    4:ifnonnull       25
	//*   3    7:aload_0         
	//*   4    8:getfield        #67  <Field Context e>
	//*   5   11:ifnull          25
			q = e.getPackageName();
	//    6   14:aload_0         
	//    7   15:aload_0         
	//    8   16:getfield        #67  <Field Context e>
	//    9   19:invokevirtual   #198 <Method String Context.getPackageName()>
	//   10   22:putfield        #105 <Field String q>
		if(q != null)
	//*  11   25:aload_0         
	//*  12   26:getfield        #105 <Field String q>
	//*  13   29:ifnull          37
			return q;
	//   14   32:aload_0         
	//   15   33:getfield        #105 <Field String q>
	//   16   36:areturn         
		else
			return "";
	//   17   37:ldc1            #77  <String "">
	//   18   39:areturn         
	}

	protected final String u()
	{
		if(l == null && e != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #97  <Field String l>
	//*   2    4:ifnonnull       93
	//*   3    7:aload_0         
	//*   4    8:getfield        #67  <Field Context e>
	//*   5   11:ifnull          93
		{
			d = (WifiManager)e.getSystemService("wifi");
	//    6   14:aload_0         
	//    7   15:aload_0         
	//    8   16:getfield        #67  <Field Context e>
	//    9   19:ldc1            #149 <String "wifi">
	//   10   21:invokevirtual   #141 <Method Object Context.getSystemService(String)>
	//   11   24:checkcast       #151 <Class WifiManager>
	//   12   27:putfield        #73  <Field WifiManager d>
			if(d != null && d.getConnectionInfo() != null)
	//*  13   30:aload_0         
	//*  14   31:getfield        #73  <Field WifiManager d>
	//*  15   34:ifnull          93
	//*  16   37:aload_0         
	//*  17   38:getfield        #73  <Field WifiManager d>
	//*  18   41:invokevirtual   #166 <Method WifiInfo WifiManager.getConnectionInfo()>
	//*  19   44:ifnull          93
			{
				l = d.getConnectionInfo().getMacAddress();
	//   20   47:aload_0         
	//   21   48:aload_0         
	//   22   49:getfield        #73  <Field WifiManager d>
	//   23   52:invokevirtual   #166 <Method WifiInfo WifiManager.getConnectionInfo()>
	//   24   55:invokevirtual   #171 <Method String WifiInfo.getMacAddress()>
	//   25   58:putfield        #97  <Field String l>
				if(l != null && l.length() > 0)
	//*  26   61:aload_0         
	//*  27   62:getfield        #97  <Field String l>
	//*  28   65:ifnull          93
	//*  29   68:aload_0         
	//*  30   69:getfield        #97  <Field String l>
	//*  31   72:invokevirtual   #177 <Method int String.length()>
	//*  32   75:ifle            93
					l = l.replace(":", "");
	//   33   78:aload_0         
	//   34   79:aload_0         
	//   35   80:getfield        #97  <Field String l>
	//   36   83:ldc1            #179 <String ":">
	//   37   85:ldc1            #77  <String "">
	//   38   87:invokevirtual   #183 <Method String String.replace(CharSequence, CharSequence)>
	//   39   90:putfield        #97  <Field String l>
			}
		}
		if(l != null)
	//*  40   93:aload_0         
	//*  41   94:getfield        #97  <Field String l>
	//*  42   97:ifnull          105
			return l;
	//   43  100:aload_0         
	//   44  101:getfield        #97  <Field String l>
	//   45  104:areturn         
		else
			return "";
	//   46  105:ldc1            #77  <String "">
	//   47  107:areturn         
	}

	protected final void v()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		j.clear();
	//    2    2:aload_0         
	//    3    3:getfield        #122 <Field List j>
	//    4    6:invokeinterface #276 <Method void List.clear()>
		this;
	//    5   11:aload_0         
		JVM INSTR monitorexit ;
	//    6   12:monitorexit     
		  goto _L1
	//*   7   13:goto            21
		Exception exception;
		exception;
	//    8   16:astore_1        
	//*   9   17:aload_0         
		throw exception;
	//   10   18:monitorexit     
	//   11   19:aload_1         
	//   12   20:athrow          
_L1:
		if(v != null)
	//*  13   21:aload_0         
	//*  14   22:getfield        #117 <Field iz v>
	//*  15   25:ifnull          41
		{
			d(((BroadcastReceiver) (v)));
	//   16   28:aload_0         
	//   17   29:aload_0         
	//   18   30:getfield        #117 <Field iz v>
	//   19   33:invokespecial   #697 <Method void d(BroadcastReceiver)>
			v = null;
	//   20   36:aload_0         
	//   21   37:aconst_null     
	//   22   38:putfield        #117 <Field iz v>
		}
		if(B != null)
	//*  23   41:aload_0         
	//*  24   42:getfield        #124 <Field Timer B>
	//*  25   45:ifnull          60
		{
			B.cancel();
	//   26   48:aload_0         
	//   27   49:getfield        #124 <Field Timer B>
	//   28   52:invokevirtual   #655 <Method void Timer.cancel()>
			B = null;
	//   29   55:aload_0         
	//   30   56:aconst_null     
	//   31   57:putfield        #124 <Field Timer B>
		}
		B = new Timer();
	//   32   60:aload_0         
	//   33   61:new             #652 <Class Timer>
	//   34   64:dup             
	//   35   65:invokespecial   #698 <Method void Timer()>
	//   36   68:putfield        #124 <Field Timer B>
		v = new iz(this, (byte)0);
	//   37   71:aload_0         
	//   38   72:new             #700 <Class iz>
	//   39   75:dup             
	//   40   76:aload_0         
	//   41   77:iconst_0        
	//   42   78:invokespecial   #703 <Method void iz(iq, byte)>
	//   43   81:putfield        #117 <Field iz v>
		b(((BroadcastReceiver) (v)));
	//   44   84:aload_0         
	//   45   85:aload_0         
	//   46   86:getfield        #117 <Field iz v>
	//   47   89:invokespecial   #705 <Method void b(BroadcastReceiver)>
		B();
	//   48   92:aload_0         
	//   49   93:invokespecial   #707 <Method void B()>
		return;
	//   50   96:return          
	}

	protected final List w()
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #119 <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #120 <Method void ArrayList()>
	//    3    7:astore          4
		if(a())
	//*   4    9:aload_0         
	//*   5   10:invokevirtual   #681 <Method boolean a()>
	//*   6   13:ifeq            202
		{
			List list1 = n();
	//    7   16:aload_0         
	//    8   17:invokevirtual   #709 <Method List n()>
	//    9   20:astore          6
			List list = (List)list1.get(1);
	//   10   22:aload           6
	//   11   24:iconst_1        
	//   12   25:invokeinterface #240 <Method Object List.get(int)>
	//   13   30:checkcast       #221 <Class List>
	//   14   33:astore          5
			long l1 = ((Long)list1.get(0)).longValue();
	//   15   35:aload           6
	//   16   37:iconst_0        
	//   17   38:invokeinterface #240 <Method Object List.get(int)>
	//   18   43:checkcast       #588 <Class Long>
	//   19   46:invokevirtual   #591 <Method long Long.longValue()>
	//   20   49:lstore_2        
			a(list);
	//   21   50:aload           5
	//   22   52:invokestatic    #711 <Method void a(List)>
			((List) (arraylist)).add(((Object) (Long.valueOf(l1))));
	//   23   55:aload           4
	//   24   57:lload_2         
	//   25   58:invokestatic    #666 <Method Long Long.valueOf(long)>
	//   26   61:invokeinterface #302 <Method boolean List.add(Object)>
	//   27   66:pop             
			if(list != null && list.size() > 0)
	//*  28   67:aload           5
	//*  29   69:ifnull          202
	//*  30   72:aload           5
	//*  31   74:invokeinterface #233 <Method int List.size()>
	//*  32   79:ifle            202
			{
				for(int i1 = 0; i1 < list.size(); i1++)
	//*  33   82:iconst_0        
	//*  34   83:istore_1        
	//*  35   84:iload_1         
	//*  36   85:aload           5
	//*  37   87:invokeinterface #233 <Method int List.size()>
	//*  38   92:icmpge          202
				{
					ScanResult scanresult = (ScanResult)list.get(i1);
	//   39   95:aload           5
	//   40   97:iload_1         
	//   41   98:invokeinterface #240 <Method Object List.get(int)>
	//   42  103:checkcast       #242 <Class ScanResult>
	//   43  106:astore          6
					if(((List) (arraylist)).size() - 1 >= 40)
						break;
	//   44  108:aload           4
	//   45  110:invokeinterface #233 <Method int List.size()>
	//   46  115:iconst_1        
	//   47  116:isub            
	//   48  117:bipush          40
	//   49  119:icmpge          202
					if(scanresult != null)
	//*  50  122:aload           6
	//*  51  124:ifnull          195
					{
						ArrayList arraylist1 = new ArrayList();
	//   52  127:new             #119 <Class ArrayList>
	//   53  130:dup             
	//   54  131:invokespecial   #120 <Method void ArrayList()>
	//   55  134:astore          7
						((List) (arraylist1)).add(((Object) (scanresult.BSSID.replace(":", ""))));
	//   56  136:aload           7
	//   57  138:aload           6
	//   58  140:getfield        #714 <Field String ScanResult.BSSID>
	//   59  143:ldc1            #179 <String ":">
	//   60  145:ldc1            #77  <String "">
	//   61  147:invokevirtual   #183 <Method String String.replace(CharSequence, CharSequence)>
	//   62  150:invokeinterface #302 <Method boolean List.add(Object)>
	//   63  155:pop             
						((List) (arraylist1)).add(((Object) (Integer.valueOf(scanresult.level))));
	//   64  156:aload           7
	//   65  158:aload           6
	//   66  160:getfield        #250 <Field int ScanResult.level>
	//   67  163:invokestatic    #254 <Method Integer Integer.valueOf(int)>
	//   68  166:invokeinterface #302 <Method boolean List.add(Object)>
	//   69  171:pop             
						((List) (arraylist1)).add(((Object) (scanresult.SSID)));
	//   70  172:aload           7
	//   71  174:aload           6
	//   72  176:getfield        #245 <Field String ScanResult.SSID>
	//   73  179:invokeinterface #302 <Method boolean List.add(Object)>
	//   74  184:pop             
						((List) (arraylist)).add(((Object) (arraylist1)));
	//   75  185:aload           4
	//   76  187:aload           7
	//   77  189:invokeinterface #302 <Method boolean List.add(Object)>
	//   78  194:pop             
					}
				}

	//   79  195:iload_1         
	//   80  196:iconst_1        
	//   81  197:iadd            
	//   82  198:istore_1        
			}
		}
	//*  83  199:goto            84
		return ((List) (arraylist));
	//   84  202:aload           4
	//   85  204:areturn         
	}

	protected final Context x()
	{
		return e;
	//    0    0:aload_0         
	//    1    1:getfield        #67  <Field Context e>
	//    2    4:areturn         
	}

	protected final byte y()
	{
		new ArrayList();
	//    0    0:new             #119 <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #120 <Method void ArrayList()>
	//    3    7:pop             
		if(b == null)
	//*   4    8:aload_0         
	//*   5    9:getfield        #75  <Field SensorManager b>
	//*   6   12:ifnonnull       17
			return 0;
	//    7   15:iconst_0        
	//    8   16:ireturn         
		List list = b.getSensorList(-1);
	//    9   17:aload_0         
	//   10   18:getfield        #75  <Field SensorManager b>
	//   11   21:iconst_m1       
	//   12   22:invokevirtual   #555 <Method List SensorManager.getSensorList(int)>
	//   13   25:astore_1        
		if(list == null)
	//*  14   26:aload_1         
	//*  15   27:ifnonnull       32
			return 0;
	//   16   30:iconst_0        
	//   17   31:ireturn         
		else
			return (byte)list.size();
	//   18   32:aload_1         
	//   19   33:invokeinterface #233 <Method int List.size()>
	//   20   38:int2byte        
	//   21   39:ireturn         
	}

	protected final void z()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		j.clear();
	//    2    2:aload_0         
	//    3    3:getfield        #122 <Field List j>
	//    4    6:invokeinterface #276 <Method void List.clear()>
		this;
	//    5   11:aload_0         
		JVM INSTR monitorexit ;
	//    6   12:monitorexit     
		  goto _L1
	//*   7   13:goto            21
		Exception exception;
		exception;
	//    8   16:astore_1        
	//*   9   17:aload_0         
		throw exception;
	//   10   18:monitorexit     
	//   11   19:aload_1         
	//   12   20:athrow          
_L1:
		if(v != null)
	//*  13   21:aload_0         
	//*  14   22:getfield        #117 <Field iz v>
	//*  15   25:ifnull          41
		{
			d(((BroadcastReceiver) (v)));
	//   16   28:aload_0         
	//   17   29:aload_0         
	//   18   30:getfield        #117 <Field iz v>
	//   19   33:invokespecial   #697 <Method void d(BroadcastReceiver)>
			v = null;
	//   20   36:aload_0         
	//   21   37:aconst_null     
	//   22   38:putfield        #117 <Field iz v>
		}
		if(B != null)
	//*  23   41:aload_0         
	//*  24   42:getfield        #124 <Field Timer B>
	//*  25   45:ifnull          60
		{
			B.cancel();
	//   26   48:aload_0         
	//   27   49:getfield        #124 <Field Timer B>
	//   28   52:invokevirtual   #655 <Method void Timer.cancel()>
			B = null;
	//   29   55:aload_0         
	//   30   56:aconst_null     
	//   31   57:putfield        #124 <Field Timer B>
		}
		return;
	//   32   60:return          
	}

	private static int D = 10000;
	private static iq y = null;
	private Thread A;
	private Timer B;
	private Looper C;
	private LocationManager a;
	private SensorManager b;
	private TelephonyManager c;
	private WifiManager d;
	private Context e;
	private String f;
	private String g;
	private int h;
	private String i;
	private List j;
	private boolean k;
	private String l;
	private boolean m;
	private String n;
	private int o;
	private long p;
	private String q;
	private long r;
	private int s;
	private long t;
	private int u;
	private iz v;
	private CellLocation w;
	private iy x;
	private ir z;

	static 
	{
	//    0    0:aconst_null     
	//    1    1:putstatic       #56  <Field iq y>
	//    2    4:sipush          10000
	//    3    7:putstatic       #58  <Field int D>
	//*   4   10:return          
	}
}
