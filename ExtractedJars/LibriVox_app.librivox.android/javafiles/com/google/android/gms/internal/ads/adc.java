// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal.ads:
//			p, bwk, m, e

public final class adc
{

	public adc(String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Object()>
		Object obj = null;
	//    2    4:aconst_null     
	//    3    5:astore_3        
		JSONObject jsonobject = ((JSONObject) (obj));
	//    4    6:aload_3         
	//    5    7:astore_2        
		if(s != null)
	//*   6    8:aload_1         
	//*   7    9:ifnull          21
			try
			{
				jsonobject = new JSONObject(s);
	//    8   12:new             #27  <Class JSONObject>
	//    9   15:dup             
	//   10   16:aload_1         
	//   11   17:invokespecial   #29  <Method void JSONObject(String)>
	//   12   20:astore_2        
			}
	//*  13   21:aload_0         
	//*  14   22:aload_2         
	//*  15   23:ldc1            #31  <String "aggressive_media_codec_release">
	//*  16   25:getstatic       #37  <Field e p.B>
	//*  17   28:invokestatic    #40  <Method boolean a(JSONObject, String, e)>
	//*  18   31:putfield        #42  <Field boolean a>
	//*  19   34:aload_0         
	//*  20   35:aload_2         
	//*  21   36:ldc1            #44  <String "byte_buffer_precache_limit">
	//*  22   38:getstatic       #47  <Field e p.m>
	//*  23   41:invokestatic    #50  <Method int b(JSONObject, String, e)>
	//*  24   44:putfield        #52  <Field int b>
	//*  25   47:aload_0         
	//*  26   48:aload_2         
	//*  27   49:ldc1            #54  <String "exo_cache_buffer_size">
	//*  28   51:getstatic       #57  <Field e p.p>
	//*  29   54:invokestatic    #50  <Method int b(JSONObject, String, e)>
	//*  30   57:putfield        #59  <Field int c>
	//*  31   60:aload_0         
	//*  32   61:aload_2         
	//*  33   62:ldc1            #61  <String "exo_connect_timeout_millis">
	//*  34   64:getstatic       #63  <Field e p.i>
	//*  35   67:invokestatic    #50  <Method int b(JSONObject, String, e)>
	//*  36   70:putfield        #65  <Field int d>
	//*  37   73:aload_0         
	//*  38   74:aload_2         
	//*  39   75:ldc1            #67  <String "exo_player_version">
	//*  40   77:getstatic       #69  <Field e p.h>
	//*  41   80:invokestatic    #72  <Method String c(JSONObject, String, e)>
	//*  42   83:putfield        #74  <Field String e>
	//*  43   86:aload_0         
	//*  44   87:aload_2         
	//*  45   88:ldc1            #76  <String "exo_read_timeout_millis">
	//*  46   90:getstatic       #78  <Field e p.j>
	//*  47   93:invokestatic    #50  <Method int b(JSONObject, String, e)>
	//*  48   96:putfield        #80  <Field int f>
	//*  49   99:aload_0         
	//*  50  100:aload_2         
	//*  51  101:ldc1            #82  <String "load_check_interval_bytes">
	//*  52  103:getstatic       #85  <Field e p.k>
	//*  53  106:invokestatic    #50  <Method int b(JSONObject, String, e)>
	//*  54  109:putfield        #87  <Field int g>
	//*  55  112:aload_0         
	//*  56  113:aload_2         
	//*  57  114:ldc1            #89  <String "player_precache_limit">
	//*  58  116:getstatic       #92  <Field e p.l>
	//*  59  119:invokestatic    #50  <Method int b(JSONObject, String, e)>
	//*  60  122:putfield        #94  <Field int h>
	//*  61  125:aload_0         
	//*  62  126:aload_2         
	//*  63  127:ldc1            #96  <String "use_cache_data_source">
	//*  64  129:getstatic       #99  <Field e p.bZ>
	//*  65  132:invokestatic    #40  <Method boolean a(JSONObject, String, e)>
	//*  66  135:putfield        #101 <Field boolean i>
	//*  67  138:aload_0         
	//*  68  139:aload_2         
	//*  69  140:ldc1            #103 <String "use_dash">
	//*  70  142:iconst_0        
	//*  71  143:invokestatic    #106 <Method boolean a(JSONObject, String, boolean)>
	//*  72  146:putfield        #108 <Field boolean j>
	//*  73  149:return          
			// Misplaced declaration of an exception variable
			catch(String s)
	//*  74  150:astore_1        
			{
				jsonobject = ((JSONObject) (obj));
	//   75  151:aload_3         
	//   76  152:astore_2        
			}
		a = a(jsonobject, "aggressive_media_codec_release", p.B);
		b = b(jsonobject, "byte_buffer_precache_limit", p.m);
		c = b(jsonobject, "exo_cache_buffer_size", p.p);
		d = b(jsonobject, "exo_connect_timeout_millis", p.i);
		e = c(jsonobject, "exo_player_version", p.h);
		f = b(jsonobject, "exo_read_timeout_millis", p.j);
		g = b(jsonobject, "load_check_interval_bytes", p.k);
		h = b(jsonobject, "player_precache_limit", p.l);
		i = a(jsonobject, "use_cache_data_source", p.bZ);
		j = a(jsonobject, "use_dash", false);
	//*  77  153:goto            21
	}

	private static boolean a(JSONObject jsonobject, String s, e e1)
	{
		return a(jsonobject, s, ((Boolean)bwk.e().a(e1)).booleanValue());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #114 <Method m bwk.e()>
	//    3    5:aload_2         
	//    4    6:invokevirtual   #119 <Method Object m.a(e)>
	//    5    9:checkcast       #121 <Class Boolean>
	//    6   12:invokevirtual   #125 <Method boolean Boolean.booleanValue()>
	//    7   15:invokestatic    #106 <Method boolean a(JSONObject, String, boolean)>
	//    8   18:ireturn         
	}

	private static boolean a(JSONObject jsonobject, String s, boolean flag)
	{
		if(jsonobject != null)
	//*   0    0:aload_0         
	//*   1    1:ifnull          12
		{
			boolean flag1;
			try
			{
				flag1 = jsonobject.getBoolean(s);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #129 <Method boolean JSONObject.getBoolean(String)>
	//    5    9:istore_3        
			}
	//*   6   10:iload_3         
	//*   7   11:ireturn         
	//*   8   12:iload_2         
	//*   9   13:ireturn         
			// Misplaced declaration of an exception variable
			catch(JSONObject jsonobject)
	//*  10   14:astore_0        
			{
				return flag;
	//   11   15:iload_2         
	//   12   16:ireturn         
			}
			return flag1;
		} else
		{
			return flag;
		}
	}

	private static int b(JSONObject jsonobject, String s, e e1)
	{
		if(jsonobject == null)
			break MISSING_BLOCK_LABEL_12;
	//    0    0:aload_0         
	//    1    1:ifnull          12
		int k = jsonobject.getInt(s);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #133 <Method int JSONObject.getInt(String)>
	//    5    9:istore_3        
		return k;
	//    6   10:iload_3         
	//    7   11:ireturn         
_L2:
		return ((Integer)bwk.e().a(e1)).intValue();
	//    8   12:invokestatic    #114 <Method m bwk.e()>
	//    9   15:aload_2         
	//   10   16:invokevirtual   #119 <Method Object m.a(e)>
	//   11   19:checkcast       #135 <Class Integer>
	//   12   22:invokevirtual   #139 <Method int Integer.intValue()>
	//   13   25:ireturn         
		jsonobject;
	//   14   26:astore_0        
		if(true) goto _L2; else goto _L1
_L1:
	//*  15   27:goto            12
	}

	private static String c(JSONObject jsonobject, String s, e e1)
	{
		if(jsonobject == null)
			break MISSING_BLOCK_LABEL_12;
	//    0    0:aload_0         
	//    1    1:ifnull          12
		jsonobject = ((JSONObject) (jsonobject.getString(s)));
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #143 <Method String JSONObject.getString(String)>
	//    5    9:astore_0        
		return ((String) (jsonobject));
	//    6   10:aload_0         
	//    7   11:areturn         
_L2:
		return (String)bwk.e().a(e1);
	//    8   12:invokestatic    #114 <Method m bwk.e()>
	//    9   15:aload_2         
	//   10   16:invokevirtual   #119 <Method Object m.a(e)>
	//   11   19:checkcast       #145 <Class String>
	//   12   22:areturn         
		jsonobject;
	//   13   23:astore_0        
		if(true) goto _L2; else goto _L1
_L1:
	//*  14   24:goto            12
	}

	public final boolean a;
	public final int b;
	public final int c;
	public final int d;
	public final String e;
	public final int f;
	public final int g;
	public final int h;
	public final boolean i;
	public final boolean j;
}
