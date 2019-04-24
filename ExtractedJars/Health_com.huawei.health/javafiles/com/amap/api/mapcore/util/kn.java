// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;

import android.text.TextUtils;
import com.autonavi.amap.mapcore.Inner_3dMap_location;
import org.json.JSONObject;

// Referenced classes of package com.amap.api.mapcore.util:
//			lh, lk

public final class kn extends Inner_3dMap_location
{

	public kn(String s)
	{
		super(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #24  <Method void Inner_3dMap_location(String)>
		b = null;
	//    3    5:aload_0         
	//    4    6:aconst_null     
	//    5    7:putfield        #26  <Field String b>
		c = "";
	//    6   10:aload_0         
	//    7   11:ldc1            #28  <String "">
	//    8   13:putfield        #30  <Field String c>
		e = "";
	//    9   16:aload_0         
	//   10   17:ldc1            #28  <String "">
	//   11   19:putfield        #32  <Field String e>
		f = "new";
	//   12   22:aload_0         
	//   13   23:ldc1            #34  <String "new">
	//   14   25:putfield        #36  <Field String f>
		g = null;
	//   15   28:aload_0         
	//   16   29:aconst_null     
	//   17   30:putfield        #38  <Field JSONObject g>
		h = "";
	//   18   33:aload_0         
	//   19   34:ldc1            #28  <String "">
	//   20   36:putfield        #40  <Field String h>
		a = true;
	//   21   39:aload_0         
	//   22   40:iconst_1        
	//   23   41:putfield        #42  <Field boolean a>
		i = "";
	//   24   44:aload_0         
	//   25   45:ldc1            #28  <String "">
	//   26   47:putfield        #44  <Field String i>
		j = 0L;
	//   27   50:aload_0         
	//   28   51:lconst_0        
	//   29   52:putfield        #46  <Field long j>
		k = null;
	//   30   55:aload_0         
	//   31   56:aconst_null     
	//   32   57:putfield        #48  <Field String k>
	//   33   60:return          
	}

	public final String a()
	{
		return b;
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field String b>
	//    2    4:areturn         
	}

	public final void a(String s)
	{
		b = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #26  <Field String b>
	//    3    5:return          
	}

	public final String b()
	{
		return c;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field String c>
	//    2    4:areturn         
	}

	public final void b(String s)
	{
		c = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #30  <Field String c>
	//    3    5:return          
	}

	public final int c()
	{
		return d;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field int d>
	//    2    4:ireturn         
	}

	public final void c(String s)
	{
		if(!TextUtils.isEmpty(((CharSequence) (s))))
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #59  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   2    4:ifne            55
		{
			if(getProvider().equals("gps"))
	//*   3    7:aload_0         
	//*   4    8:invokevirtual   #62  <Method String getProvider()>
	//*   5   11:ldc1            #64  <String "gps">
	//*   6   13:invokevirtual   #70  <Method boolean String.equals(Object)>
	//*   7   16:ifeq            25
			{
				d = 0;
	//    8   19:aload_0         
	//    9   20:iconst_0        
	//   10   21:putfield        #53  <Field int d>
				return;
	//   11   24:return          
			}
			if(s.equals("0"))
	//*  12   25:aload_1         
	//*  13   26:ldc1            #72  <String "0">
	//*  14   28:invokevirtual   #70  <Method boolean String.equals(Object)>
	//*  15   31:ifeq            40
			{
				d = 0;
	//   16   34:aload_0         
	//   17   35:iconst_0        
	//   18   36:putfield        #53  <Field int d>
				return;
	//   19   39:return          
			}
			if(s.equals("1"))
	//*  20   40:aload_1         
	//*  21   41:ldc1            #74  <String "1">
	//*  22   43:invokevirtual   #70  <Method boolean String.equals(Object)>
	//*  23   46:ifeq            55
			{
				d = 1;
	//   24   49:aload_0         
	//   25   50:iconst_1        
	//   26   51:putfield        #53  <Field int d>
				return;
	//   27   54:return          
			}
		}
		d = -1;
	//   28   55:aload_0         
	//   29   56:iconst_m1       
	//   30   57:putfield        #53  <Field int d>
	//   31   60:return          
	}

	public final String d()
	{
		return e;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field String e>
	//    2    4:areturn         
	}

	public final void d(String s)
	{
		e = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #32  <Field String e>
	//    3    5:return          
	}

	public final JSONObject e()
	{
		return g;
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field JSONObject g>
	//    2    4:areturn         
	}

	public final void e(String s)
	{
		desc = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #78  <Field String desc>
	//    3    5:return          
	}

	public final void setFloor(String s)
	{
		String s1 = s;
	//    0    0:aload_1         
	//    1    1:astore_2        
		if(!TextUtils.isEmpty(((CharSequence) (s))))
	//*   2    2:aload_1         
	//*   3    3:invokestatic    #59  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   4    6:ifne            37
		{
			s1 = s.replace("F", "");
	//    5    9:aload_1         
	//    6   10:ldc1            #83  <String "F">
	//    7   12:ldc1            #28  <String "">
	//    8   14:invokevirtual   #87  <Method String String.replace(CharSequence, CharSequence)>
	//    9   17:astore_2        
			try
			{
				Integer.parseInt(s1);
	//   10   18:aload_2         
	//   11   19:invokestatic    #93  <Method int Integer.parseInt(String)>
	//   12   22:pop             
			}
	//*  13   23:goto            37
			// Misplaced declaration of an exception variable
			catch(String s)
	//*  14   26:astore_1        
			{
				s1 = null;
	//   15   27:aconst_null     
	//   16   28:astore_2        
				lh.a(((Throwable) (s)), "AMapLocationModel", "setFloor");
	//   17   29:aload_1         
	//   18   30:ldc1            #95  <String "AMapLocationModel">
	//   19   32:ldc1            #96  <String "setFloor">
	//   20   34:invokestatic    #101 <Method void lh.a(Throwable, String, String)>
			}
		}
		floor = s1;
	//   21   37:aload_0         
	//   22   38:aload_2         
	//   23   39:putfield        #104 <Field String floor>
	//   24   42:return          
	}

	public final JSONObject toJson(int l)
	{
		Object obj;
		try
		{
			obj = ((Object) (super.toJson(l)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #108 <Method JSONObject Inner_3dMap_location.toJson(int)>
	//    3    5:astore_2        
		}
	//*   4    6:iload_1         
	//*   5    7:tableswitch     1 3: default 187
	//	               1 32
	//	               2 152
	//	               3 152
	//*   6   32:aload_2         
	//*   7   33:ldc1            #110 <String "retype">
	//*   8   35:aload_0         
	//*   9   36:getfield        #32  <Field String e>
	//*  10   39:invokevirtual   #116 <Method JSONObject JSONObject.put(String, Object)>
	//*  11   42:pop             
	//*  12   43:aload_2         
	//*  13   44:ldc1            #118 <String "cens">
	//*  14   46:aload_0         
	//*  15   47:getfield        #44  <Field String i>
	//*  16   50:invokevirtual   #116 <Method JSONObject JSONObject.put(String, Object)>
	//*  17   53:pop             
	//*  18   54:aload_2         
	//*  19   55:ldc1            #120 <String "poiid">
	//*  20   57:aload_0         
	//*  21   58:getfield        #123 <Field String buildingId>
	//*  22   61:invokevirtual   #116 <Method JSONObject JSONObject.put(String, Object)>
	//*  23   64:pop             
	//*  24   65:aload_2         
	//*  25   66:ldc1            #124 <String "floor">
	//*  26   68:aload_0         
	//*  27   69:getfield        #104 <Field String floor>
	//*  28   72:invokevirtual   #116 <Method JSONObject JSONObject.put(String, Object)>
	//*  29   75:pop             
	//*  30   76:aload_2         
	//*  31   77:ldc1            #126 <String "coord">
	//*  32   79:aload_0         
	//*  33   80:getfield        #53  <Field int d>
	//*  34   83:invokevirtual   #129 <Method JSONObject JSONObject.put(String, int)>
	//*  35   86:pop             
	//*  36   87:aload_2         
	//*  37   88:ldc1            #131 <String "mcell">
	//*  38   90:aload_0         
	//*  39   91:getfield        #40  <Field String h>
	//*  40   94:invokevirtual   #116 <Method JSONObject JSONObject.put(String, Object)>
	//*  41   97:pop             
	//*  42   98:aload_2         
	//*  43   99:ldc1            #132 <String "desc">
	//*  44  101:aload_0         
	//*  45  102:getfield        #78  <Field String desc>
	//*  46  105:invokevirtual   #116 <Method JSONObject JSONObject.put(String, Object)>
	//*  47  108:pop             
	//*  48  109:aload_2         
	//*  49  110:ldc1            #134 <String "address">
	//*  50  112:aload_0         
	//*  51  113:invokevirtual   #137 <Method String getAddress()>
	//*  52  116:invokevirtual   #116 <Method JSONObject JSONObject.put(String, Object)>
	//*  53  119:pop             
	//*  54  120:aload_0         
	//*  55  121:getfield        #38  <Field JSONObject g>
	//*  56  124:ifnull          152
	//*  57  127:aload_2         
	//*  58  128:ldc1            #139 <String "offpct">
	//*  59  130:invokestatic    #144 <Method boolean lk.a(JSONObject, String)>
	//*  60  133:ifeq            152
	//*  61  136:aload_2         
	//*  62  137:ldc1            #139 <String "offpct">
	//*  63  139:aload_0         
	//*  64  140:getfield        #38  <Field JSONObject g>
	//*  65  143:ldc1            #139 <String "offpct">
	//*  66  145:invokevirtual   #148 <Method String JSONObject.getString(String)>
	//*  67  148:invokevirtual   #116 <Method JSONObject JSONObject.put(String, Object)>
	//*  68  151:pop             
	//*  69  152:aload_2         
	//*  70  153:ldc1            #150 <String "type">
	//*  71  155:aload_0         
	//*  72  156:getfield        #36  <Field String f>
	//*  73  159:invokevirtual   #116 <Method JSONObject JSONObject.put(String, Object)>
	//*  74  162:pop             
	//*  75  163:aload_2         
	//*  76  164:ldc1            #152 <String "isReversegeo">
	//*  77  166:aload_0         
	//*  78  167:getfield        #42  <Field boolean a>
	//*  79  170:invokevirtual   #155 <Method JSONObject JSONObject.put(String, boolean)>
	//*  80  173:pop             
	//*  81  174:aload_2         
	//*  82  175:areturn         
		// Misplaced declaration of an exception variable
		catch(Object obj)
	//*  83  176:astore_2        
		{
			lh.a(((Throwable) (obj)), "AMapLocationModel", "toStr");
	//   84  177:aload_2         
	//   85  178:ldc1            #95  <String "AMapLocationModel">
	//   86  180:ldc1            #157 <String "toStr">
	//   87  182:invokestatic    #101 <Method void lh.a(Throwable, String, String)>
			return null;
	//   88  185:aconst_null     
	//   89  186:areturn         
		}
		l;
		JVM INSTR tableswitch 1 3: default 187
	//	               1 32
	//	               2 152
	//	               3 152;
		   goto _L1 _L2 _L3 _L3
_L2:
		((JSONObject) (obj)).put("retype", ((Object) (e)));
		((JSONObject) (obj)).put("cens", ((Object) (i)));
		((JSONObject) (obj)).put("poiid", ((Object) (buildingId)));
		((JSONObject) (obj)).put("floor", ((Object) (floor)));
		((JSONObject) (obj)).put("coord", d);
		((JSONObject) (obj)).put("mcell", ((Object) (h)));
		((JSONObject) (obj)).put("desc", ((Object) (desc)));
		((JSONObject) (obj)).put("address", ((Object) (getAddress())));
		if(g != null && lk.a(((JSONObject) (obj)), "offpct"))
			((JSONObject) (obj)).put("offpct", ((Object) (g.getString("offpct"))));
_L3:
		((JSONObject) (obj)).put("type", ((Object) (f)));
		((JSONObject) (obj)).put("isReversegeo", a);
		return ((JSONObject) (obj));
_L1:
		return ((JSONObject) (obj));
	//   90  187:aload_2         
	//   91  188:areturn         
	}

	public final String toStr(int l)
	{
		JSONObject jsonobject;
		try
		{
			jsonobject = super.toJson(l);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #108 <Method JSONObject Inner_3dMap_location.toJson(int)>
	//    3    5:astore_2        
			jsonobject.put("nb", ((Object) (k)));
	//    4    6:aload_2         
	//    5    7:ldc1            #160 <String "nb">
	//    6    9:aload_0         
	//    7   10:getfield        #48  <Field String k>
	//    8   13:invokevirtual   #116 <Method JSONObject JSONObject.put(String, Object)>
	//    9   16:pop             
		}
	//*  10   17:goto            31
		catch(Throwable throwable)
	//*  11   20:astore_3        
		{
			jsonobject = null;
	//   12   21:aconst_null     
	//   13   22:astore_2        
			lh.a(throwable, "AMapLocationModel", "toStr part2");
	//   14   23:aload_3         
	//   15   24:ldc1            #95  <String "AMapLocationModel">
	//   16   26:ldc1            #162 <String "toStr part2">
	//   17   28:invokestatic    #101 <Method void lh.a(Throwable, String, String)>
		}
		if(jsonobject == null)
	//*  18   31:aload_2         
	//*  19   32:ifnonnull       37
			return null;
	//   20   35:aconst_null     
	//   21   36:areturn         
		else
			return jsonobject.toString();
	//   22   37:aload_2         
	//   23   38:invokevirtual   #165 <Method String JSONObject.toString()>
	//   24   41:areturn         
	}

	boolean a;
	private String b;
	private String c;
	private int d;
	private String e;
	private String f;
	private JSONObject g;
	private String h;
	private String i;
	private long j;
	private String k;
}
