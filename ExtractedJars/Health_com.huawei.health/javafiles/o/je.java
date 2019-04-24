// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import android.location.LocationManager;
import android.os.Looper;
import com.aps.au;
import java.util.List;

// Referenced classes of package o:
//			kk, jd

public final class je extends Thread
{

	je(kk kk1, String s)
	{
		a = kk1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #10  <Field kk a>
		super(s);
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:invokespecial   #13  <Method void Thread(String)>
	//    6   10:return          
	}

	public final void run()
	{
		List list;
		try
		{
			Looper.prepare();
	//    0    0:invokestatic    #23  <Method void Looper.prepare()>
			kk.a(a, Looper.myLooper());
	//    1    3:aload_0         
	//    2    4:getfield        #10  <Field kk a>
	//    3    7:invokestatic    #27  <Method Looper Looper.myLooper()>
	//    4   10:invokestatic    #32  <Method Looper kk.a(kk, Looper)>
	//    5   13:pop             
			kk.d(a, new jd(a));
	//    6   14:aload_0         
	//    7   15:getfield        #10  <Field kk a>
	//    8   18:new             #34  <Class jd>
	//    9   21:dup             
	//   10   22:aload_0         
	//   11   23:getfield        #10  <Field kk a>
	//   12   26:invokespecial   #37  <Method void jd(kk)>
	//   13   29:invokestatic    #41  <Method jd kk.d(kk, jd)>
	//   14   32:pop             
		}
	//*  15   33:aload_0         
	//*  16   34:getfield        #10  <Field kk a>
	//*  17   37:invokestatic    #45  <Method LocationManager kk.b(kk)>
	//*  18   40:aload_0         
	//*  19   41:getfield        #10  <Field kk a>
	//*  20   44:invokestatic    #48  <Method jd kk.a(kk)>
	//*  21   47:invokevirtual   #54  <Method boolean LocationManager.addGpsStatusListener(android.location.GpsStatus$Listener)>
	//*  22   50:pop             
	//*  23   51:aload_0         
	//*  24   52:getfield        #10  <Field kk a>
	//*  25   55:invokestatic    #45  <Method LocationManager kk.b(kk)>
	//*  26   58:aload_0         
	//*  27   59:getfield        #10  <Field kk a>
	//*  28   62:invokestatic    #48  <Method jd kk.a(kk)>
	//*  29   65:invokevirtual   #58  <Method boolean LocationManager.addNmeaListener(android.location.GpsStatus$NmeaListener)>
	//*  30   68:pop             
	//*  31   69:goto            73
	//*  32   72:astore_1        
	//*  33   73:aload_0         
	//*  34   74:getfield        #10  <Field kk a>
	//*  35   77:new             #60  <Class au>
	//*  36   80:dup             
	//*  37   81:aload_0         
	//*  38   82:invokespecial   #63  <Method void au(je)>
	//*  39   85:invokestatic    #66  <Method android.os.Handler kk.a(kk, android.os.Handler)>
	//*  40   88:pop             
	//*  41   89:aload_0         
	//*  42   90:getfield        #10  <Field kk a>
	//*  43   93:invokestatic    #45  <Method LocationManager kk.b(kk)>
	//*  44   96:invokevirtual   #70  <Method List LocationManager.getAllProviders()>
	//*  45   99:astore_1        
	//*  46  100:aload_1         
	//*  47  101:ifnull          124
	//*  48  104:aload_1         
	//*  49  105:ldc1            #72  <String "gps">
	//*  50  107:invokeinterface #78  <Method boolean List.contains(Object)>
	//*  51  112:ifeq            124
	//*  52  115:aload_1         
	//*  53  116:ldc1            #80  <String "passive">
	//*  54  118:invokeinterface #78  <Method boolean List.contains(Object)>
	//*  55  123:pop             
	//*  56  124:aload_0         
	//*  57  125:getfield        #10  <Field kk a>
	//*  58  128:invokestatic    #45  <Method LocationManager kk.b(kk)>
	//*  59  131:ldc1            #80  <String "passive">
	//*  60  133:ldc2w           #81  <Long 1000L>
	//*  61  136:invokestatic    #86  <Method int kk.l()>
	//*  62  139:i2f             
	//*  63  140:aload_0         
	//*  64  141:getfield        #10  <Field kk a>
	//*  65  144:invokestatic    #90  <Method android.location.LocationListener kk.h(kk)>
	//*  66  147:invokevirtual   #94  <Method void LocationManager.requestLocationUpdates(String, long, float, android.location.LocationListener)>
	//*  67  150:invokestatic    #97  <Method void Looper.loop()>
	//*  68  153:return          
		catch(Exception exception1)
	//*  69  154:astore_1        
		{
			return;
	//   70  155:return          
		}
		try
		{
			kk.b(a).addGpsStatusListener(((android.location.GpsStatus.Listener) (kk.a(a))));
			kk.b(a).addNmeaListener(((android.location.GpsStatus.NmeaListener) (kk.a(a))));
		}
		catch(Exception exception) { }
		kk.a(a, ((android.os.Handler) (new au(this))));
		list = kk.b(a).getAllProviders();
		if(list == null)
			break MISSING_BLOCK_LABEL_124;
		if(list.contains("gps"))
			list.contains("passive");
		try
		{
			kk.b(a).requestLocationUpdates("passive", 1000L, kk.l(), kk.h(a));
		}
		catch(Exception exception2) { }
	//   71  156:astore_1        
		Looper.loop();
		return;
	//*  72  157:goto            150
	}

	public final kk a;
}
