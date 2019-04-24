// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package o:
//			ew, eu, ic, et, 
//			ei, eq, er, es

public final class ev
	implements ew
{

	public ev()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
	//    2    4:return          
	}

	public static ew e(Context context, String s)
	{
		if(context == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		if(d == null)
	//*   4    6:getstatic       #14  <Field ew d>
	//*   5    9:ifnonnull       41
		{
			if(context == null)
	//*   6   12:aload_0         
	//*   7   13:ifnonnull       21
				context = null;
	//    8   16:aconst_null     
	//    9   17:astore_0        
			else
	//*  10   18:goto            27
				context = ((Context) (eu.a(context, s)));
	//   11   21:aload_0         
	//   12   22:aload_1         
	//   13   23:invokestatic    #28  <Method eu eu.a(Context, String)>
	//   14   26:astore_0        
			b = ((eq) (context));
	//   15   27:aload_0         
	//   16   28:putstatic       #16  <Field eq b>
			d = ((ew) (new ev()));
	//   17   31:new             #2   <Class ev>
	//   18   34:dup             
	//   19   35:invokespecial   #29  <Method void ev()>
	//   20   38:putstatic       #14  <Field ew d>
		}
		return d;
	//   21   41:getstatic       #14  <Field ew d>
	//   22   44:areturn         
	}

	public final es a(et et1)
	{
		ic ic1 = new ic();
	//    0    0:new             #32  <Class ic>
	//    1    3:dup             
	//    2    4:invokespecial   #33  <Method void ic()>
	//    3    7:astore_2        
		ic1.c = ei.e(et1.c);
	//    4    8:aload_2         
	//    5    9:aload_1         
	//    6   10:getfield        #39  <Field String et.c>
	//    7   13:invokestatic    #44  <Method String ei.e(String)>
	//    8   16:putfield        #45  <Field String ic.c>
		ic1.e = et1.h;
	//    9   19:aload_2         
	//   10   20:aload_1         
	//   11   21:getfield        #48  <Field String et.h>
	//   12   24:putfield        #50  <Field String ic.e>
		ic1.a = "1";
	//   13   27:aload_2         
	//   14   28:ldc1            #52  <String "1">
	//   15   30:putfield        #54  <Field String ic.a>
		ic1.d = ((Map) (new HashMap()));
	//   16   33:aload_2         
	//   17   34:new             #56  <Class HashMap>
	//   18   37:dup             
	//   19   38:invokespecial   #57  <Method void HashMap()>
	//   20   41:putfield        #60  <Field Map ic.d>
		ic1.d.put("apdid", ((Object) (ei.e(et1.d))));
	//   21   44:aload_2         
	//   22   45:getfield        #60  <Field Map ic.d>
	//   23   48:ldc1            #62  <String "apdid">
	//   24   50:aload_1         
	//   25   51:getfield        #64  <Field String et.d>
	//   26   54:invokestatic    #44  <Method String ei.e(String)>
	//   27   57:invokeinterface #70  <Method Object Map.put(Object, Object)>
	//   28   62:pop             
		ic1.d.put("apdidToken", ((Object) (ei.e(et1.e))));
	//   29   63:aload_2         
	//   30   64:getfield        #60  <Field Map ic.d>
	//   31   67:ldc1            #72  <String "apdidToken">
	//   32   69:aload_1         
	//   33   70:getfield        #73  <Field String et.e>
	//   34   73:invokestatic    #44  <Method String ei.e(String)>
	//   35   76:invokeinterface #70  <Method Object Map.put(Object, Object)>
	//   36   81:pop             
		ic1.d.put("umidToken", ((Object) (ei.e(et1.a))));
	//   37   82:aload_2         
	//   38   83:getfield        #60  <Field Map ic.d>
	//   39   86:ldc1            #75  <String "umidToken">
	//   40   88:aload_1         
	//   41   89:getfield        #76  <Field String et.a>
	//   42   92:invokestatic    #44  <Method String ei.e(String)>
	//   43   95:invokeinterface #70  <Method Object Map.put(Object, Object)>
	//   44  100:pop             
		ic1.d.put("dynamicKey", ((Object) (et1.b)));
	//   45  101:aload_2         
	//   46  102:getfield        #60  <Field Map ic.d>
	//   47  105:ldc1            #78  <String "dynamicKey">
	//   48  107:aload_1         
	//   49  108:getfield        #80  <Field String et.b>
	//   50  111:invokeinterface #70  <Method Object Map.put(Object, Object)>
	//   51  116:pop             
		if(et1.f == null)
	//*  52  117:aload_1         
	//*  53  118:getfield        #83  <Field Map et.f>
	//*  54  121:ifnonnull       135
			et1 = ((et) (new HashMap()));
	//   55  124:new             #56  <Class HashMap>
	//   56  127:dup             
	//   57  128:invokespecial   #57  <Method void HashMap()>
	//   58  131:astore_1        
		else
	//*  59  132:goto            140
			et1 = ((et) (et1.f));
	//   60  135:aload_1         
	//   61  136:getfield        #83  <Field Map et.f>
	//   62  139:astore_1        
		ic1.b = ((Map) (et1));
	//   63  140:aload_2         
	//   64  141:aload_1         
	//   65  142:putfield        #85  <Field Map ic.b>
		return er.e(b.a(ic1));
	//   66  145:getstatic       #16  <Field eq b>
	//   67  148:aload_2         
	//   68  149:invokeinterface #90  <Method id eq.a(ic)>
	//   69  154:invokestatic    #95  <Method es er.e(id)>
	//   70  157:areturn         
	}

	public final boolean e(String s)
	{
		return b.d(s);
	//    0    0:getstatic       #16  <Field eq b>
	//    1    3:aload_1         
	//    2    4:invokeinterface #98  <Method boolean eq.d(String)>
	//    3    9:ireturn         
	}

	private static eq b = null;
	private static ew d = null;

	static 
	{
	//    0    0:aconst_null     
	//    1    1:putstatic       #14  <Field ew d>
	//    2    4:aconst_null     
	//    3    5:putstatic       #16  <Field eq b>
	//*   4    8:return          
	}
}
