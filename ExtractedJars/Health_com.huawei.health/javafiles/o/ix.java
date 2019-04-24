// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import java.text.SimpleDateFormat;

// Referenced classes of package o:
//			kk, jg, ja

final class ix
	implements LocationListener
{

	ix(kk kk1)
	{
		e = kk1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field kk e>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void Object()>
	//    5    9:return          
	}

	private static boolean e(Location location)
	{
		return location != null && "gps".equalsIgnoreCase(location.getProvider()) && location.getLatitude() > -90D && location.getLatitude() < 90D && location.getLongitude() > -180D && location.getLongitude() < 180D;
	//    0    0:aload_0         
	//    1    1:ifnull          62
	//    2    4:ldc1            #19  <String "gps">
	//    3    6:aload_0         
	//    4    7:invokevirtual   #25  <Method String Location.getProvider()>
	//    5   10:invokevirtual   #31  <Method boolean String.equalsIgnoreCase(String)>
	//    6   13:ifeq            62
	//    7   16:aload_0         
	//    8   17:invokevirtual   #35  <Method double Location.getLatitude()>
	//    9   20:ldc2w           #36  <Double -90D>
	//   10   23:dcmpl           
	//   11   24:ifle            62
	//   12   27:aload_0         
	//   13   28:invokevirtual   #35  <Method double Location.getLatitude()>
	//   14   31:ldc2w           #38  <Double 90D>
	//   15   34:dcmpg           
	//   16   35:ifge            62
	//   17   38:aload_0         
	//   18   39:invokevirtual   #42  <Method double Location.getLongitude()>
	//   19   42:ldc2w           #43  <Double -180D>
	//   20   45:dcmpl           
	//   21   46:ifle            62
	//   22   49:aload_0         
	//   23   50:invokevirtual   #42  <Method double Location.getLongitude()>
	//   24   53:ldc2w           #45  <Double 180D>
	//   25   56:dcmpg           
	//   26   57:ifge            62
	//   27   60:iconst_1        
	//   28   61:ireturn         
	//   29   62:iconst_0        
	//   30   63:ireturn         
	}

	public final void onLocationChanged(Location location)
	{
		long l;
		long l1;
		long l2;
		boolean flag;
		try
		{
			l1 = location.getTime();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #54  <Method long Location.getTime()>
	//    2    4:lstore          4
			l2 = System.currentTimeMillis();
	//    3    6:invokestatic    #59  <Method long System.currentTimeMillis()>
	//    4    9:lstore          6
			SimpleDateFormat simpledateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	//    5   11:new             #61  <Class SimpleDateFormat>
	//    6   14:dup             
	//    7   15:ldc1            #63  <String "yyyy-MM-dd HH:mm:ss">
	//    8   17:invokespecial   #66  <Method void SimpleDateFormat(String)>
	//    9   20:astore          9
			simpledateformat.format(((Object) (Long.valueOf(l1))));
	//   10   22:aload           9
	//   11   24:lload           4
	//   12   26:invokestatic    #72  <Method Long Long.valueOf(long)>
	//   13   29:invokevirtual   #76  <Method String SimpleDateFormat.format(Object)>
	//   14   32:pop             
			simpledateformat.format(((Object) (Long.valueOf(l2))));
	//   15   33:aload           9
	//   16   35:lload           6
	//   17   37:invokestatic    #72  <Method Long Long.valueOf(long)>
	//   18   40:invokevirtual   #76  <Method String SimpleDateFormat.format(Object)>
	//   19   43:pop             
		}
	//*  20   44:lload           4
	//*  21   46:lstore_2        
	//*  22   47:lload           4
	//*  23   49:lconst_0        
	//*  24   50:lcmp            
	//*  25   51:ifgt            57
	//*  26   54:lload           6
	//*  27   56:lstore_2        
	//*  28   57:aload_1         
	//*  29   58:ifnull          72
	//*  30   61:aload_1         
	//*  31   62:invokestatic    #78  <Method boolean e(Location)>
	//*  32   65:istore          8
	//*  33   67:iload           8
	//*  34   69:ifne            73
	//*  35   72:return          
	//*  36   73:aload_1         
	//*  37   74:invokevirtual   #82  <Method float Location.getSpeed()>
	//*  38   77:invokestatic    #88  <Method int kk.h()>
	//*  39   80:i2f             
	//*  40   81:fcmpl           
	//*  41   82:ifle            103
	//*  42   85:invokestatic    #91  <Method int kk.f()>
	//*  43   88:invokestatic    #97  <Method void jg.c(int)>
	//*  44   91:invokestatic    #91  <Method int kk.f()>
	//*  45   94:bipush          10
	//*  46   96:imul            
	//*  47   97:invokestatic    #100 <Method void jg.b(int)>
	//*  48  100:goto            148
	//*  49  103:aload_1         
	//*  50  104:invokevirtual   #82  <Method float Location.getSpeed()>
	//*  51  107:invokestatic    #103 <Method int kk.i()>
	//*  52  110:i2f             
	//*  53  111:fcmpl           
	//*  54  112:ifle            133
	//*  55  115:invokestatic    #106 <Method int kk.k()>
	//*  56  118:invokestatic    #97  <Method void jg.c(int)>
	//*  57  121:invokestatic    #106 <Method int kk.k()>
	//*  58  124:bipush          10
	//*  59  126:imul            
	//*  60  127:invokestatic    #100 <Method void jg.b(int)>
	//*  61  130:goto            148
	//*  62  133:invokestatic    #109 <Method int kk.n()>
	//*  63  136:invokestatic    #97  <Method void jg.c(int)>
	//*  64  139:invokestatic    #109 <Method int kk.n()>
	//*  65  142:bipush          10
	//*  66  144:imul            
	//*  67  145:invokestatic    #100 <Method void jg.b(int)>
	//*  68  148:aload_0         
	//*  69  149:getfield        #12  <Field kk e>
	//*  70  152:invokestatic    #112 <Method ja kk.c(kk)>
	//*  71  155:invokevirtual   #117 <Method boolean ja.c()>
	//*  72  158:pop             
	//*  73  159:aload_1         
	//*  74  160:invokestatic    #78  <Method boolean e(Location)>
	//*  75  163:pop             
	//*  76  164:aload_0         
	//*  77  165:getfield        #12  <Field kk e>
	//*  78  168:invokestatic    #112 <Method ja kk.c(kk)>
	//*  79  171:invokevirtual   #117 <Method boolean ja.c()>
	//*  80  174:ifeq            242
	//*  81  177:aload_1         
	//*  82  178:invokestatic    #78  <Method boolean e(Location)>
	//*  83  181:ifeq            242
	//*  84  184:aload_1         
	//*  85  185:invokestatic    #59  <Method long System.currentTimeMillis()>
	//*  86  188:invokevirtual   #121 <Method void Location.setTime(long)>
	//*  87  191:aload_0         
	//*  88  192:getfield        #12  <Field kk e>
	//*  89  195:invokestatic    #59  <Method long System.currentTimeMillis()>
	//*  90  198:invokestatic    #124 <Method long kk.b(kk, long)>
	//*  91  201:pop2            
	//*  92  202:aload_0         
	//*  93  203:getfield        #12  <Field kk e>
	//*  94  206:aload_1         
	//*  95  207:invokestatic    #128 <Method Location kk.d(kk, Location)>
	//*  96  210:pop             
	//*  97  211:aload_0         
	//*  98  212:getfield        #12  <Field kk e>
	//*  99  215:invokestatic    #131 <Method boolean kk.d(kk)>
	//* 100  218:iconst_1        
	//* 101  219:icmpeq          233
	//* 102  222:aload_0         
	//* 103  223:getfield        #12  <Field kk e>
	//* 104  226:aload_1         
	//* 105  227:iconst_0        
	//* 106  228:lload_2         
	//* 107  229:invokestatic    #134 <Method void kk.e(kk, Location, int, long)>
	//* 108  232:return          
	//* 109  233:aload_0         
	//* 110  234:getfield        #12  <Field kk e>
	//* 111  237:ldc1            #136 <String "new location in indoor collect">
	//* 112  239:invokestatic    #139 <Method void kk.d(kk, String)>
	//* 113  242:return          
		// Misplaced declaration of an exception variable
		catch(Location location)
	//* 114  243:astore_1        
		{
			return;
	//  115  244:return          
		}
		l = l1;
		if(l1 <= 0L)
			l = l2;
		if(location == null)
			break MISSING_BLOCK_LABEL_72;
		flag = e(location);
		if(flag)
			break MISSING_BLOCK_LABEL_73;
		return;
		if(location.getSpeed() > (float)kk.h())
		{
			jg.c(kk.f());
			jg.b(kk.f() * 10);
			break MISSING_BLOCK_LABEL_148;
		}
		if(location.getSpeed() > (float)kk.i())
		{
			jg.c(kk.k());
			jg.b(kk.k() * 10);
			break MISSING_BLOCK_LABEL_148;
		}
		jg.c(kk.n());
		jg.b(kk.n() * 10);
		kk.c(e).c();
		e(location);
		if(!kk.c(e).c() || !e(location))
			break MISSING_BLOCK_LABEL_242;
		location.setTime(System.currentTimeMillis());
		kk.b(e, System.currentTimeMillis());
		kk.d(e, location);
		if(!kk.d(e))
		{
			kk.e(e, location, 0, l);
			return;
		}
		kk.d(e, "new location in indoor collect");
	}

	public final void onProviderDisabled(String s)
	{
	//    0    0:return          
	}

	public final void onProviderEnabled(String s)
	{
	//    0    0:return          
	}

	public final void onStatusChanged(String s, int i, Bundle bundle)
	{
	//    0    0:return          
	}

	private kk e;
}
