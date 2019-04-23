// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.g.a;
import com.google.android.gms.common.internal.am;
import com.google.android.gms.common.util.e;
import java.util.Map;

// Referenced classes of package com.google.android.gms.measurement.internal:
//			dq, cq, bt, cs, 
//			as, ct, a, du, 
//			eo, cc, s, u, 
//			cu, ax, cd, m, 
//			cv, o, b, q, 
//			ae, ew, eu

public final class cr extends dq
{

	public cr(ax ax)
	{
		super(ax);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #17  <Method void dq(ax)>
	//    3    5:aload_0         
	//    4    6:new             #19  <Class a>
	//    5    9:dup             
	//    6   10:invokespecial   #22  <Method void a()>
	//    7   13:putfield        #24  <Field Map d>
	//    8   16:return          
	}

	private static String a(String s1)
	{
		s1 = ((String) (s1.split("\\.")));
	//    0    0:aload_0         
	//    1    1:ldc1            #28  <String "\\.">
	//    2    3:invokevirtual   #34  <Method String[] String.split(String)>
	//    3    6:astore_0        
		if(s1.length > 0)
	//*   4    7:aload_0         
	//*   5    8:arraylength     
	//*   6    9:ifle            22
			s1 = ((String) (s1[s1.length - 1]));
	//    7   12:aload_0         
	//    8   13:aload_0         
	//    9   14:arraylength     
	//   10   15:iconst_1        
	//   11   16:isub            
	//   12   17:aaload          
	//   13   18:astore_0        
		else
	//*  14   19:goto            25
			s1 = "";
	//   15   22:ldc1            #36  <String "">
	//   16   24:astore_0        
		if(s1.length() > 100)
	//*  17   25:aload_0         
	//*  18   26:invokevirtual   #40  <Method int String.length()>
	//*  19   29:bipush          100
	//*  20   31:icmple          42
			return s1.substring(0, 100);
	//   21   34:aload_0         
	//   22   35:iconst_0        
	//   23   36:bipush          100
	//   24   38:invokevirtual   #44  <Method String String.substring(int, int)>
	//   25   41:areturn         
		else
			return s1;
	//   26   42:aload_0         
	//   27   43:areturn         
	}

	private final void a(Activity activity, cq cq1, boolean flag)
	{
		cq cq2;
		if(b == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #47  <Field cq b>
	//*   2    4:ifnonnull       16
			cq2 = c;
	//    3    7:aload_0         
	//    4    8:getfield        #49  <Field cq c>
	//    5   11:astore          4
		else
	//*   6   13:goto            22
			cq2 = b;
	//    7   16:aload_0         
	//    8   17:getfield        #47  <Field cq b>
	//    9   20:astore          4
		cq cq3 = cq1;
	//   10   22:aload_2         
	//   11   23:astore          5
		if(cq1.b == null)
	//*  12   25:aload_2         
	//*  13   26:getfield        #53  <Field String cq.b>
	//*  14   29:ifnonnull       59
			cq3 = new cq(cq1.a, a(((Object) (activity)).getClass().getCanonicalName()), cq1.c);
	//   15   32:new             #51  <Class cq>
	//   16   35:dup             
	//   17   36:aload_2         
	//   18   37:getfield        #55  <Field String com.google.android.gms.measurement.internal.cq.a>
	//   19   40:aload_1         
	//   20   41:invokevirtual   #61  <Method Class Object.getClass()>
	//   21   44:invokevirtual   #67  <Method String Class.getCanonicalName()>
	//   22   47:invokestatic    #69  <Method String a(String)>
	//   23   50:aload_2         
	//   24   51:getfield        #72  <Field long cq.c>
	//   25   54:invokespecial   #75  <Method void cq(String, String, long)>
	//   26   57:astore          5
		c = b;
	//   27   59:aload_0         
	//   28   60:aload_0         
	//   29   61:getfield        #47  <Field cq b>
	//   30   64:putfield        #49  <Field cq c>
		b = cq3;
	//   31   67:aload_0         
	//   32   68:aload           5
	//   33   70:putfield        #47  <Field cq b>
		((bt)this).q().a(((Runnable) (new cs(this, flag, cq2, cq3))));
	//   34   73:aload_0         
	//   35   74:invokevirtual   #81  <Method as bt.q()>
	//   36   77:new             #83  <Class cs>
	//   37   80:dup             
	//   38   81:aload_0         
	//   39   82:iload_3         
	//   40   83:aload           4
	//   41   85:aload           5
	//   42   87:invokespecial   #86  <Method void cs(cr, boolean, cq, cq)>
	//   43   90:invokevirtual   #91  <Method void com.google.android.gms.measurement.internal.as.a(Runnable)>
	//   44   93:return          
	}

	public static void a(cq cq1, Bundle bundle, boolean flag)
	{
		if(bundle != null && cq1 != null && (!bundle.containsKey("_sc") || flag))
	//*   0    0:aload_1         
	//*   1    1:ifnull          68
	//*   2    4:aload_0         
	//*   3    5:ifnull          68
	//*   4    8:aload_1         
	//*   5    9:ldc1            #94  <String "_sc">
	//*   6   11:invokevirtual   #100 <Method boolean Bundle.containsKey(String)>
	//*   7   14:ifeq            21
	//*   8   17:iload_2         
	//*   9   18:ifeq            68
		{
			if(cq1.a != null)
	//*  10   21:aload_0         
	//*  11   22:getfield        #55  <Field String com.google.android.gms.measurement.internal.cq.a>
	//*  12   25:ifnull          41
				bundle.putString("_sn", cq1.a);
	//   13   28:aload_1         
	//   14   29:ldc1            #102 <String "_sn">
	//   15   31:aload_0         
	//   16   32:getfield        #55  <Field String com.google.android.gms.measurement.internal.cq.a>
	//   17   35:invokevirtual   #106 <Method void Bundle.putString(String, String)>
			else
	//*  18   38:goto            47
				bundle.remove("_sn");
	//   19   41:aload_1         
	//   20   42:ldc1            #102 <String "_sn">
	//   21   44:invokevirtual   #110 <Method void Bundle.remove(String)>
			bundle.putString("_sc", cq1.b);
	//   22   47:aload_1         
	//   23   48:ldc1            #94  <String "_sc">
	//   24   50:aload_0         
	//   25   51:getfield        #53  <Field String cq.b>
	//   26   54:invokevirtual   #106 <Method void Bundle.putString(String, String)>
			bundle.putLong("_si", cq1.c);
	//   27   57:aload_1         
	//   28   58:ldc1            #112 <String "_si">
	//   29   60:aload_0         
	//   30   61:getfield        #72  <Field long cq.c>
	//   31   64:invokevirtual   #116 <Method void Bundle.putLong(String, long)>
			return;
	//   32   67:return          
		}
		if(bundle != null && cq1 == null && flag)
	//*  33   68:aload_1         
	//*  34   69:ifnull          98
	//*  35   72:aload_0         
	//*  36   73:ifnonnull       98
	//*  37   76:iload_2         
	//*  38   77:ifeq            98
		{
			bundle.remove("_sn");
	//   39   80:aload_1         
	//   40   81:ldc1            #102 <String "_sn">
	//   41   83:invokevirtual   #110 <Method void Bundle.remove(String)>
			bundle.remove("_sc");
	//   42   86:aload_1         
	//   43   87:ldc1            #94  <String "_sc">
	//   44   89:invokevirtual   #110 <Method void Bundle.remove(String)>
			bundle.remove("_si");
	//   45   92:aload_1         
	//   46   93:ldc1            #112 <String "_si">
	//   47   95:invokevirtual   #110 <Method void Bundle.remove(String)>
		}
	//   48   98:return          
	}

	private final void a(cq cq1, boolean flag)
	{
		((ct)this).e().a(((bt)this).m().b());
	//    0    0:aload_0         
	//    1    1:invokevirtual   #122 <Method com.google.android.gms.measurement.internal.a com.google.android.gms.measurement.internal.ct.e()>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #126 <Method e bt.m()>
	//    4    8:invokeinterface #131 <Method long e.b()>
	//    5   13:invokevirtual   #136 <Method void com.google.android.gms.measurement.internal.a.a(long)>
		if(((ct)this).k().a(cq1.d, flag))
	//*   6   16:aload_0         
	//*   7   17:invokevirtual   #140 <Method du ct.k()>
	//*   8   20:aload_1         
	//*   9   21:getfield        #143 <Field boolean cq.d>
	//*  10   24:iload_2         
	//*  11   25:invokevirtual   #148 <Method boolean com.google.android.gms.measurement.internal.du.a(boolean, boolean)>
	//*  12   28:ifeq            36
			cq1.d = false;
	//   13   31:aload_1         
	//   14   32:iconst_0        
	//   15   33:putfield        #143 <Field boolean cq.d>
	//   16   36:return          
	}

	static void a(cr cr1, cq cq1, boolean flag)
	{
		cr1.a(cq1, flag);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #151 <Method void a(cq, boolean)>
	//    4    6:return          
	}

	private final cq d(Activity activity)
	{
		am.a(((Object) (activity)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #157 <Method Object am.a(Object)>
	//    2    4:pop             
		cq cq2 = (cq)d.get(((Object) (activity)));
	//    3    5:aload_0         
	//    4    6:getfield        #24  <Field Map d>
	//    5    9:aload_1         
	//    6   10:invokeinterface #162 <Method Object Map.get(Object)>
	//    7   15:checkcast       #51  <Class cq>
	//    8   18:astore_3        
		cq cq1 = cq2;
	//    9   19:aload_3         
	//   10   20:astore_2        
		if(cq2 == null)
	//*  11   21:aload_3         
	//*  12   22:ifnonnull       63
		{
			cq1 = new cq(((String) (null)), a(((Object) (activity)).getClass().getCanonicalName()), ((bt)this).p().g());
	//   13   25:new             #51  <Class cq>
	//   14   28:dup             
	//   15   29:aconst_null     
	//   16   30:aload_1         
	//   17   31:invokevirtual   #61  <Method Class Object.getClass()>
	//   18   34:invokevirtual   #67  <Method String Class.getCanonicalName()>
	//   19   37:invokestatic    #69  <Method String a(String)>
	//   20   40:aload_0         
	//   21   41:invokevirtual   #166 <Method eo bt.p()>
	//   22   44:invokevirtual   #171 <Method long eo.g()>
	//   23   47:invokespecial   #75  <Method void cq(String, String, long)>
	//   24   50:astore_2        
			d.put(((Object) (activity)), ((Object) (cq1)));
	//   25   51:aload_0         
	//   26   52:getfield        #24  <Field Map d>
	//   27   55:aload_1         
	//   28   56:aload_2         
	//   29   57:invokeinterface #175 <Method Object Map.put(Object, Object)>
	//   30   62:pop             
		}
		return cq1;
	//   31   63:aload_2         
	//   32   64:areturn         
	}

	public final volatile void a()
	{
		super.a();
	//    0    0:aload_0         
	//    1    1:invokespecial   #177 <Method void com.google.android.gms.measurement.internal.dq.a()>
	//    2    4:return          
	}

	public final void a(Activity activity)
	{
		a(activity, d(activity), false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_0         
	//    3    3:aload_1         
	//    4    4:invokespecial   #180 <Method cq d(Activity)>
	//    5    7:iconst_0        
	//    6    8:invokespecial   #182 <Method void a(Activity, cq, boolean)>
		activity = ((Activity) (((ct)this).e()));
	//    7   11:aload_0         
	//    8   12:invokevirtual   #122 <Method com.google.android.gms.measurement.internal.a com.google.android.gms.measurement.internal.ct.e()>
	//    9   15:astore_1        
		long l1 = ((bt) (activity)).m().b();
	//   10   16:aload_1         
	//   11   17:invokevirtual   #126 <Method e bt.m()>
	//   12   20:invokeinterface #131 <Method long e.b()>
	//   13   25:lstore_2        
		((bt) (activity)).q().a(((Runnable) (new cc(((com.google.android.gms.measurement.internal.a) (activity)), l1))));
	//   14   26:aload_1         
	//   15   27:invokevirtual   #81  <Method as bt.q()>
	//   16   30:new             #184 <Class cc>
	//   17   33:dup             
	//   18   34:aload_1         
	//   19   35:lload_2         
	//   20   36:invokespecial   #187 <Method void cc(com.google.android.gms.measurement.internal.a, long)>
	//   21   39:invokevirtual   #91  <Method void com.google.android.gms.measurement.internal.as.a(Runnable)>
	//   22   42:return          
	}

	public final void a(Activity activity, Bundle bundle)
	{
		if(bundle == null)
	//*   0    0:aload_2         
	//*   1    1:ifnonnull       5
			return;
	//    2    4:return          
		bundle = bundle.getBundle("com.google.app_measurement.screen_service");
	//    3    5:aload_2         
	//    4    6:ldc1            #190 <String "com.google.app_measurement.screen_service">
	//    5    8:invokevirtual   #194 <Method Bundle Bundle.getBundle(String)>
	//    6   11:astore_2        
		if(bundle == null)
	//*   7   12:aload_2         
	//*   8   13:ifnonnull       17
		{
			return;
	//    9   16:return          
		} else
		{
			bundle = ((Bundle) (new cq(bundle.getString("name"), bundle.getString("referrer_name"), bundle.getLong("id"))));
	//   10   17:new             #51  <Class cq>
	//   11   20:dup             
	//   12   21:aload_2         
	//   13   22:ldc1            #196 <String "name">
	//   14   24:invokevirtual   #199 <Method String Bundle.getString(String)>
	//   15   27:aload_2         
	//   16   28:ldc1            #201 <String "referrer_name">
	//   17   30:invokevirtual   #199 <Method String Bundle.getString(String)>
	//   18   33:aload_2         
	//   19   34:ldc1            #203 <String "id">
	//   20   36:invokevirtual   #207 <Method long Bundle.getLong(String)>
	//   21   39:invokespecial   #75  <Method void cq(String, String, long)>
	//   22   42:astore_2        
			d.put(((Object) (activity)), ((Object) (bundle)));
	//   23   43:aload_0         
	//   24   44:getfield        #24  <Field Map d>
	//   25   47:aload_1         
	//   26   48:aload_2         
	//   27   49:invokeinterface #175 <Method Object Map.put(Object, Object)>
	//   28   54:pop             
			return;
	//   29   55:return          
		}
	}

	public final void a(Activity activity, String s1, String s2)
	{
		if(b == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #47  <Field cq b>
	//*   2    4:ifnonnull       20
		{
			((bt)this).r().i().a("setCurrentScreen cannot be called while no activity active");
	//    3    7:aload_0         
	//    4    8:invokevirtual   #212 <Method s bt.r()>
	//    5   11:invokevirtual   #218 <Method u s.i()>
	//    6   14:ldc1            #220 <String "setCurrentScreen cannot be called while no activity active">
	//    7   16:invokevirtual   #224 <Method void com.google.android.gms.measurement.internal.u.a(String)>
			return;
	//    8   19:return          
		}
		if(d.get(((Object) (activity))) == null)
	//*   9   20:aload_0         
	//*  10   21:getfield        #24  <Field Map d>
	//*  11   24:aload_1         
	//*  12   25:invokeinterface #162 <Method Object Map.get(Object)>
	//*  13   30:ifnonnull       46
		{
			((bt)this).r().i().a("setCurrentScreen must be called with an activity in the activity lifecycle");
	//   14   33:aload_0         
	//   15   34:invokevirtual   #212 <Method s bt.r()>
	//   16   37:invokevirtual   #218 <Method u s.i()>
	//   17   40:ldc1            #226 <String "setCurrentScreen must be called with an activity in the activity lifecycle">
	//   18   42:invokevirtual   #224 <Method void com.google.android.gms.measurement.internal.u.a(String)>
			return;
	//   19   45:return          
		}
		String s3 = s2;
	//   20   46:aload_3         
	//   21   47:astore          6
		if(s2 == null)
	//*  22   49:aload_3         
	//*  23   50:ifnonnull       65
			s3 = a(((Object) (activity)).getClass().getCanonicalName());
	//   24   53:aload_1         
	//   25   54:invokevirtual   #61  <Method Class Object.getClass()>
	//   26   57:invokevirtual   #67  <Method String Class.getCanonicalName()>
	//   27   60:invokestatic    #69  <Method String a(String)>
	//   28   63:astore          6
		boolean flag = b.b.equals(((Object) (s3)));
	//   29   65:aload_0         
	//   30   66:getfield        #47  <Field cq b>
	//   31   69:getfield        #53  <Field String cq.b>
	//   32   72:aload           6
	//   33   74:invokevirtual   #230 <Method boolean String.equals(Object)>
	//   34   77:istore          4
		boolean flag1 = eo.c(b.a, s1);
	//   35   79:aload_0         
	//   36   80:getfield        #47  <Field cq b>
	//   37   83:getfield        #55  <Field String com.google.android.gms.measurement.internal.cq.a>
	//   38   86:aload_2         
	//   39   87:invokestatic    #233 <Method boolean eo.c(String, String)>
	//   40   90:istore          5
		if(flag && flag1)
	//*  41   92:iload           4
	//*  42   94:ifeq            115
	//*  43   97:iload           5
	//*  44   99:ifeq            115
		{
			((bt)this).r().k().a("setCurrentScreen cannot be called with the same class and name");
	//   45  102:aload_0         
	//   46  103:invokevirtual   #212 <Method s bt.r()>
	//   47  106:invokevirtual   #235 <Method u s.k()>
	//   48  109:ldc1            #237 <String "setCurrentScreen cannot be called with the same class and name">
	//   49  111:invokevirtual   #224 <Method void com.google.android.gms.measurement.internal.u.a(String)>
			return;
	//   50  114:return          
		}
		if(s1 != null && (s1.length() <= 0 || s1.length() > 100))
	//*  51  115:aload_2         
	//*  52  116:ifnull          155
	//*  53  119:aload_2         
	//*  54  120:invokevirtual   #40  <Method int String.length()>
	//*  55  123:ifle            135
	//*  56  126:aload_2         
	//*  57  127:invokevirtual   #40  <Method int String.length()>
	//*  58  130:bipush          100
	//*  59  132:icmple          155
		{
			((bt)this).r().i().a("Invalid screen name length in setCurrentScreen. Length", ((Object) (Integer.valueOf(s1.length()))));
	//   60  135:aload_0         
	//   61  136:invokevirtual   #212 <Method s bt.r()>
	//   62  139:invokevirtual   #218 <Method u s.i()>
	//   63  142:ldc1            #239 <String "Invalid screen name length in setCurrentScreen. Length">
	//   64  144:aload_2         
	//   65  145:invokevirtual   #40  <Method int String.length()>
	//   66  148:invokestatic    #245 <Method Integer Integer.valueOf(int)>
	//   67  151:invokevirtual   #248 <Method void com.google.android.gms.measurement.internal.u.a(String, Object)>
			return;
	//   68  154:return          
		}
		if(s3 != null && (s3.length() <= 0 || s3.length() > 100))
	//*  69  155:aload           6
	//*  70  157:ifnull          199
	//*  71  160:aload           6
	//*  72  162:invokevirtual   #40  <Method int String.length()>
	//*  73  165:ifle            178
	//*  74  168:aload           6
	//*  75  170:invokevirtual   #40  <Method int String.length()>
	//*  76  173:bipush          100
	//*  77  175:icmple          199
		{
			((bt)this).r().i().a("Invalid class name length in setCurrentScreen. Length", ((Object) (Integer.valueOf(s3.length()))));
	//   78  178:aload_0         
	//   79  179:invokevirtual   #212 <Method s bt.r()>
	//   80  182:invokevirtual   #218 <Method u s.i()>
	//   81  185:ldc1            #250 <String "Invalid class name length in setCurrentScreen. Length">
	//   82  187:aload           6
	//   83  189:invokevirtual   #40  <Method int String.length()>
	//   84  192:invokestatic    #245 <Method Integer Integer.valueOf(int)>
	//   85  195:invokevirtual   #248 <Method void com.google.android.gms.measurement.internal.u.a(String, Object)>
			return;
	//   86  198:return          
		}
		u u1 = ((bt)this).r().x();
	//   87  199:aload_0         
	//   88  200:invokevirtual   #212 <Method s bt.r()>
	//   89  203:invokevirtual   #253 <Method u s.x()>
	//   90  206:astore          7
		if(s1 == null)
	//*  91  208:aload_2         
	//*  92  209:ifnonnull       218
			s2 = "null";
	//   93  212:ldc1            #255 <String "null">
	//   94  214:astore_3        
		else
	//*  95  215:goto            220
			s2 = s1;
	//   96  218:aload_2         
	//   97  219:astore_3        
		u1.a("Setting current screen to name, class", ((Object) (s2)), ((Object) (s3)));
	//   98  220:aload           7
	//   99  222:ldc2            #257 <String "Setting current screen to name, class">
	//  100  225:aload_3         
	//  101  226:aload           6
	//  102  228:invokevirtual   #260 <Method void com.google.android.gms.measurement.internal.u.a(String, Object, Object)>
		s1 = ((String) (new cq(s1, s3, ((bt)this).p().g())));
	//  103  231:new             #51  <Class cq>
	//  104  234:dup             
	//  105  235:aload_2         
	//  106  236:aload           6
	//  107  238:aload_0         
	//  108  239:invokevirtual   #166 <Method eo bt.p()>
	//  109  242:invokevirtual   #171 <Method long eo.g()>
	//  110  245:invokespecial   #75  <Method void cq(String, String, long)>
	//  111  248:astore_2        
		d.put(((Object) (activity)), ((Object) (s1)));
	//  112  249:aload_0         
	//  113  250:getfield        #24  <Field Map d>
	//  114  253:aload_1         
	//  115  254:aload_2         
	//  116  255:invokeinterface #175 <Method Object Map.put(Object, Object)>
	//  117  260:pop             
		a(activity, ((cq) (s1)), true);
	//  118  261:aload_0         
	//  119  262:aload_1         
	//  120  263:aload_2         
	//  121  264:iconst_1        
	//  122  265:invokespecial   #182 <Method void a(Activity, cq, boolean)>
	//  123  268:return          
	}

	public final void a(String s1, cq cq1)
	{
		((bt)this).d();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #263 <Method void bt.d()>
		this;
	//    2    4:aload_0         
		JVM INSTR monitorenter ;
	//    3    5:monitorenter    
		if(f != null && !f.equals(((Object) (s1))) && cq1 == null)
			break MISSING_BLOCK_LABEL_38;
	//    4    6:aload_0         
	//    5    7:getfield        #265 <Field String f>
	//    6   10:ifnull          28
	//    7   13:aload_0         
	//    8   14:getfield        #265 <Field String f>
	//    9   17:aload_1         
	//   10   18:invokevirtual   #230 <Method boolean String.equals(Object)>
	//   11   21:ifne            28
	//   12   24:aload_2         
	//   13   25:ifnull          38
		f = s1;
	//   14   28:aload_0         
	//   15   29:aload_1         
	//   16   30:putfield        #265 <Field String f>
		e = cq1;
	//   17   33:aload_0         
	//   18   34:aload_2         
	//   19   35:putfield        #267 <Field cq e>
		this;
	//   20   38:aload_0         
		JVM INSTR monitorexit ;
	//   21   39:monitorexit     
		return;
	//   22   40:return          
		s1;
	//   23   41:astore_1        
		this;
	//   24   42:aload_0         
		JVM INSTR monitorexit ;
	//   25   43:monitorexit     
		throw s1;
	//   26   44:aload_1         
	//   27   45:athrow          
	}

	public final volatile void b()
	{
		super.b();
	//    0    0:aload_0         
	//    1    1:invokespecial   #269 <Method void dq.b()>
	//    2    4:return          
	}

	public final void b(Activity activity)
	{
		activity = ((Activity) (d(activity)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #180 <Method cq d(Activity)>
	//    3    5:astore_1        
		c = b;
	//    4    6:aload_0         
	//    5    7:aload_0         
	//    6    8:getfield        #47  <Field cq b>
	//    7   11:putfield        #49  <Field cq c>
		b = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #47  <Field cq b>
		((bt)this).q().a(((Runnable) (new cu(this, ((cq) (activity))))));
	//   11   19:aload_0         
	//   12   20:invokevirtual   #81  <Method as bt.q()>
	//   13   23:new             #271 <Class cu>
	//   14   26:dup             
	//   15   27:aload_0         
	//   16   28:aload_1         
	//   17   29:invokespecial   #274 <Method void cu(cr, cq)>
	//   18   32:invokevirtual   #91  <Method void com.google.android.gms.measurement.internal.as.a(Runnable)>
	//   19   35:return          
	}

	public final void b(Activity activity, Bundle bundle)
	{
		if(bundle == null)
	//*   0    0:aload_2         
	//*   1    1:ifnonnull       5
			return;
	//    2    4:return          
		activity = ((Activity) ((cq)d.get(((Object) (activity)))));
	//    3    5:aload_0         
	//    4    6:getfield        #24  <Field Map d>
	//    5    9:aload_1         
	//    6   10:invokeinterface #162 <Method Object Map.get(Object)>
	//    7   15:checkcast       #51  <Class cq>
	//    8   18:astore_1        
		if(activity == null)
	//*   9   19:aload_1         
	//*  10   20:ifnonnull       24
		{
			return;
	//   11   23:return          
		} else
		{
			Bundle bundle1 = new Bundle();
	//   12   24:new             #96  <Class Bundle>
	//   13   27:dup             
	//   14   28:invokespecial   #275 <Method void Bundle()>
	//   15   31:astore_3        
			bundle1.putLong("id", ((cq) (activity)).c);
	//   16   32:aload_3         
	//   17   33:ldc1            #203 <String "id">
	//   18   35:aload_1         
	//   19   36:getfield        #72  <Field long cq.c>
	//   20   39:invokevirtual   #116 <Method void Bundle.putLong(String, long)>
			bundle1.putString("name", ((cq) (activity)).a);
	//   21   42:aload_3         
	//   22   43:ldc1            #196 <String "name">
	//   23   45:aload_1         
	//   24   46:getfield        #55  <Field String com.google.android.gms.measurement.internal.cq.a>
	//   25   49:invokevirtual   #106 <Method void Bundle.putString(String, String)>
			bundle1.putString("referrer_name", ((cq) (activity)).b);
	//   26   52:aload_3         
	//   27   53:ldc1            #201 <String "referrer_name">
	//   28   55:aload_1         
	//   29   56:getfield        #53  <Field String cq.b>
	//   30   59:invokevirtual   #106 <Method void Bundle.putString(String, String)>
			bundle.putBundle("com.google.app_measurement.screen_service", bundle1);
	//   31   62:aload_2         
	//   32   63:ldc1            #190 <String "com.google.app_measurement.screen_service">
	//   33   65:aload_3         
	//   34   66:invokevirtual   #279 <Method void Bundle.putBundle(String, Bundle)>
			return;
	//   35   69:return          
		}
	}

	public final volatile void c()
	{
		super.c();
	//    0    0:aload_0         
	//    1    1:invokespecial   #281 <Method void dq.c()>
	//    2    4:return          
	}

	public final void c(Activity activity)
	{
		d.remove(((Object) (activity)));
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field Map d>
	//    2    4:aload_1         
	//    3    5:invokeinterface #283 <Method Object Map.remove(Object)>
	//    4   10:pop             
	//    5   11:return          
	}

	public final volatile void d()
	{
		super.d();
	//    0    0:aload_0         
	//    1    1:invokespecial   #284 <Method void dq.d()>
	//    2    4:return          
	}

	public final volatile com.google.android.gms.measurement.internal.a e()
	{
		return super.e();
	//    0    0:aload_0         
	//    1    1:invokespecial   #285 <Method com.google.android.gms.measurement.internal.a com.google.android.gms.measurement.internal.dq.e()>
	//    2    4:areturn         
	}

	public final volatile cd f()
	{
		return super.f();
	//    0    0:aload_0         
	//    1    1:invokespecial   #288 <Method cd dq.f()>
	//    2    4:areturn         
	}

	public final volatile m g()
	{
		return super.g();
	//    0    0:aload_0         
	//    1    1:invokespecial   #291 <Method m dq.g()>
	//    2    4:areturn         
	}

	public final volatile cv h()
	{
		return super.h();
	//    0    0:aload_0         
	//    1    1:invokespecial   #295 <Method cv dq.h()>
	//    2    4:areturn         
	}

	public final volatile cr i()
	{
		return super.i();
	//    0    0:aload_0         
	//    1    1:invokespecial   #298 <Method cr dq.i()>
	//    2    4:areturn         
	}

	public final volatile o j()
	{
		return super.j();
	//    0    0:aload_0         
	//    1    1:invokespecial   #302 <Method o dq.j()>
	//    2    4:areturn         
	}

	public final volatile du k()
	{
		return super.k();
	//    0    0:aload_0         
	//    1    1:invokespecial   #303 <Method du dq.k()>
	//    2    4:areturn         
	}

	public final volatile b l()
	{
		return super.l();
	//    0    0:aload_0         
	//    1    1:invokespecial   #307 <Method b dq.l()>
	//    2    4:areturn         
	}

	public final volatile e m()
	{
		return super.m();
	//    0    0:aload_0         
	//    1    1:invokespecial   #308 <Method e dq.m()>
	//    2    4:areturn         
	}

	public final volatile Context n()
	{
		return super.n();
	//    0    0:aload_0         
	//    1    1:invokespecial   #312 <Method Context dq.n()>
	//    2    4:areturn         
	}

	public final volatile q o()
	{
		return super.o();
	//    0    0:aload_0         
	//    1    1:invokespecial   #316 <Method q dq.o()>
	//    2    4:areturn         
	}

	public final volatile eo p()
	{
		return super.p();
	//    0    0:aload_0         
	//    1    1:invokespecial   #317 <Method eo dq.p()>
	//    2    4:areturn         
	}

	public final volatile as q()
	{
		return super.q();
	//    0    0:aload_0         
	//    1    1:invokespecial   #318 <Method as dq.q()>
	//    2    4:areturn         
	}

	public final volatile s r()
	{
		return super.r();
	//    0    0:aload_0         
	//    1    1:invokespecial   #319 <Method s dq.r()>
	//    2    4:areturn         
	}

	public final volatile ae s()
	{
		return super.s();
	//    0    0:aload_0         
	//    1    1:invokespecial   #323 <Method ae dq.s()>
	//    2    4:areturn         
	}

	public final volatile ew t()
	{
		return super.t();
	//    0    0:aload_0         
	//    1    1:invokespecial   #327 <Method ew dq.t()>
	//    2    4:areturn         
	}

	public final volatile eu u()
	{
		return super.u();
	//    0    0:aload_0         
	//    1    1:invokespecial   #331 <Method eu dq.u()>
	//    2    4:areturn         
	}

	protected final boolean v()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public final cq x()
	{
		((dq)this).E();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #337 <Method void dq.E()>
		((bt)this).d();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #263 <Method void bt.d()>
		return a;
	//    4    8:aload_0         
	//    5    9:getfield        #339 <Field cq a>
	//    6   12:areturn         
	}

	public final cq y()
	{
		((bt)this).b();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #341 <Method void bt.b()>
		return b;
	//    2    4:aload_0         
	//    3    5:getfield        #47  <Field cq b>
	//    4    8:areturn         
	}

	protected cq a;
	private volatile cq b;
	private cq c;
	private final Map d = new a();
	private cq e;
	private String f;
}
