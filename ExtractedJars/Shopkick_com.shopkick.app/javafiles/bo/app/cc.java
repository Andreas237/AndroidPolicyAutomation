// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;

import com.appboy.enums.inappmessage.InAppMessageFailureType;
import com.appboy.models.MessageButton;
import com.appboy.models.outgoing.AppboyProperties;
import com.appboy.support.AppboyLogger;
import com.appboy.support.StringUtils;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.math.BigDecimal;
import java.util.UUID;
import org.json.*;

// Referenced classes of package bo.app:
//			bu, dl, t, ca, 
//			bv, dv, ap

public final class cc
	implements bu
{

	private cc(t t1, JSONObject jsonobject)
	{
		this(t1, jsonobject, dl.b());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokestatic    #37  <Method double dl.b()>
	//    4    6:invokespecial   #40  <Method void cc(t, JSONObject, double)>
	//    5    9:return          
	}

	private cc(t t1, JSONObject jsonobject, double d1)
	{
		this(t1, jsonobject, d1, UUID.randomUUID().toString());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:dload_3         
	//    4    4:invokestatic    #47  <Method UUID UUID.randomUUID()>
	//    5    7:invokevirtual   #51  <Method String UUID.toString()>
	//    6   10:invokespecial   #54  <Method void cc(t, JSONObject, double, String)>
	//    7   13:return          
	}

	private cc(t t1, JSONObject jsonobject, double d1, String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #56  <Method void Object()>
		f = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #58  <Field String f>
		g = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #60  <Field ca g>
		if(jsonobject != null)
	//*   8   14:aload_2         
	//*   9   15:ifnull          57
		{
			if(t1.a() != null)
	//*  10   18:aload_1         
	//*  11   19:invokevirtual   #64  <Method String t.a()>
	//*  12   22:ifnull          47
			{
				b = t1;
	//   13   25:aload_0         
	//   14   26:aload_1         
	//   15   27:putfield        #66  <Field t b>
				c = jsonobject;
	//   16   30:aload_0         
	//   17   31:aload_2         
	//   18   32:putfield        #68  <Field JSONObject c>
				d = d1;
	//   19   35:aload_0         
	//   20   36:dload_3         
	//   21   37:putfield        #70  <Field double d>
				e = s;
	//   22   40:aload_0         
	//   23   41:aload           5
	//   24   43:putfield        #72  <Field String e>
				return;
	//   25   46:return          
			} else
			{
				throw new NullPointerException("Event type cannot be null");
	//   26   47:new             #74  <Class NullPointerException>
	//   27   50:dup             
	//   28   51:ldc1            #76  <String "Event type cannot be null">
	//   29   53:invokespecial   #79  <Method void NullPointerException(String)>
	//   30   56:athrow          
			}
		} else
		{
			throw new NullPointerException("Event data cannot be null");
	//   31   57:new             #74  <Class NullPointerException>
	//   32   60:dup             
	//   33   61:ldc1            #81  <String "Event data cannot be null">
	//   34   63:invokespecial   #79  <Method void NullPointerException(String)>
	//   35   66:athrow          
		}
	}

	private cc(t t1, JSONObject jsonobject, double d1, String s, String s1, String s2)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #56  <Method void Object()>
		f = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #58  <Field String f>
		g = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #60  <Field ca g>
		if(jsonobject != null)
	//*   8   14:aload_2         
	//*   9   15:ifnull          77
		{
			if(t1.a() != null)
	//*  10   18:aload_1         
	//*  11   19:invokevirtual   #64  <Method String t.a()>
	//*  12   22:ifnull          67
			{
				b = t1;
	//   13   25:aload_0         
	//   14   26:aload_1         
	//   15   27:putfield        #66  <Field t b>
				c = jsonobject;
	//   16   30:aload_0         
	//   17   31:aload_2         
	//   18   32:putfield        #68  <Field JSONObject c>
				d = d1;
	//   19   35:aload_0         
	//   20   36:dload_3         
	//   21   37:putfield        #70  <Field double d>
				e = s;
	//   22   40:aload_0         
	//   23   41:aload           5
	//   24   43:putfield        #72  <Field String e>
				f = s1;
	//   25   46:aload_0         
	//   26   47:aload           6
	//   27   49:putfield        #58  <Field String f>
				if(s2 != null)
	//*  28   52:aload           7
	//*  29   54:ifnull          66
					g = ca.a(s2);
	//   30   57:aload_0         
	//   31   58:aload           7
	//   32   60:invokestatic    #87  <Method ca ca.a(String)>
	//   33   63:putfield        #60  <Field ca g>
				return;
	//   34   66:return          
			} else
			{
				throw new NullPointerException("Event type cannot be null");
	//   35   67:new             #74  <Class NullPointerException>
	//   36   70:dup             
	//   37   71:ldc1            #76  <String "Event type cannot be null">
	//   38   73:invokespecial   #79  <Method void NullPointerException(String)>
	//   39   76:athrow          
			}
		} else
		{
			throw new NullPointerException("Event data cannot be null");
	//   40   77:new             #74  <Class NullPointerException>
	//   41   80:dup             
	//   42   81:ldc1            #81  <String "Event data cannot be null">
	//   43   83:invokespecial   #79  <Method void NullPointerException(String)>
	//   44   86:athrow          
		}
	}

	public static cc a(long l)
	{
		JSONObject jsonobject = new JSONObject();
	//    0    0:new             #90  <Class JSONObject>
	//    1    3:dup             
	//    2    4:invokespecial   #91  <Method void JSONObject()>
	//    3    7:astore_2        
		jsonobject.put("d", l);
	//    4    8:aload_2         
	//    5    9:ldc1            #92  <String "d">
	//    6   11:lload_0         
	//    7   12:invokevirtual   #96  <Method JSONObject JSONObject.put(String, long)>
	//    8   15:pop             
		return new cc(t.w, jsonobject);
	//    9   16:new             #2   <Class cc>
	//   10   19:dup             
	//   11   20:getstatic       #99  <Field t t.w>
	//   12   23:aload_2         
	//   13   24:invokespecial   #101 <Method void cc(t, JSONObject)>
	//   14   27:areturn         
	}

	public static cc a(ap ap, ca ca1)
	{
		JSONObject jsonobject = new JSONObject();
	//    0    0:new             #90  <Class JSONObject>
	//    1    3:dup             
	//    2    4:invokespecial   #91  <Method void JSONObject()>
	//    3    7:astore_2        
		jsonobject.put("nop", true);
	//    4    8:aload_2         
	//    5    9:ldc1            #104 <String "nop">
	//    6   11:iconst_1        
	//    7   12:invokevirtual   #107 <Method JSONObject JSONObject.put(String, boolean)>
	//    8   15:pop             
		ca1 = ((ca) (b(((Throwable) (ap)), ca1)));
	//    9   16:aload_0         
	//   10   17:aload_1         
	//   11   18:invokestatic    #110 <Method String b(Throwable, ca)>
	//   12   21:astore_1        
		ap = ((ap) (a(((Throwable) (ap)))));
	//   13   22:aload_0         
	//   14   23:invokestatic    #113 <Method String a(Throwable)>
	//   15   26:astore_0        
		ca1 = ((ca) (new StringBuilder(((String) (ca1)))));
	//   16   27:new             #115 <Class StringBuilder>
	//   17   30:dup             
	//   18   31:aload_1         
	//   19   32:invokespecial   #116 <Method void StringBuilder(String)>
	//   20   35:astore_1        
		((StringBuilder) (ca1)).append("\n");
	//   21   36:aload_1         
	//   22   37:ldc1            #118 <String "\n">
	//   23   39:invokevirtual   #122 <Method StringBuilder StringBuilder.append(String)>
	//   24   42:pop             
		((StringBuilder) (ca1)).append(((String) (ap)));
	//   25   43:aload_1         
	//   26   44:aload_0         
	//   27   45:invokevirtual   #122 <Method StringBuilder StringBuilder.append(String)>
	//   28   48:pop             
		jsonobject.put("e", ((Object) (((StringBuilder) (ca1)).toString())));
	//   29   49:aload_2         
	//   30   50:ldc1            #123 <String "e">
	//   31   52:aload_1         
	//   32   53:invokevirtual   #124 <Method String StringBuilder.toString()>
	//   33   56:invokevirtual   #127 <Method JSONObject JSONObject.put(String, Object)>
	//   34   59:pop             
		return new cc(t.h, jsonobject);
	//   35   60:new             #2   <Class cc>
	//   36   63:dup             
	//   37   64:getstatic       #130 <Field t t.h>
	//   38   67:aload_2         
	//   39   68:invokespecial   #101 <Method void cc(t, JSONObject)>
	//   40   71:areturn         
	}

	public static cc a(bv bv1)
	{
		return new cc(t.a, (JSONObject)bv1.forJsonPut());
	//    0    0:new             #2   <Class cc>
	//    1    3:dup             
	//    2    4:getstatic       #133 <Field t t.a>
	//    3    7:aload_0         
	//    4    8:invokeinterface #139 <Method Object bv.forJsonPut()>
	//    5   13:checkcast       #90  <Class JSONObject>
	//    6   16:invokespecial   #101 <Method void cc(t, JSONObject)>
	//    7   19:areturn         
	}

	public static cc a(String s, int k)
	{
		JSONObject jsonobject = new JSONObject();
	//    0    0:new             #90  <Class JSONObject>
	//    1    3:dup             
	//    2    4:invokespecial   #91  <Method void JSONObject()>
	//    3    7:astore_2        
		jsonobject.put("key", ((Object) (s)));
	//    4    8:aload_2         
	//    5    9:ldc1            #142 <String "key">
	//    6   11:aload_0         
	//    7   12:invokevirtual   #127 <Method JSONObject JSONObject.put(String, Object)>
	//    8   15:pop             
		jsonobject.put("value", k);
	//    9   16:aload_2         
	//   10   17:ldc1            #144 <String "value">
	//   11   19:iload_1         
	//   12   20:invokevirtual   #147 <Method JSONObject JSONObject.put(String, int)>
	//   13   23:pop             
		return new cc(t.l, jsonobject);
	//   14   24:new             #2   <Class cc>
	//   15   27:dup             
	//   16   28:getstatic       #150 <Field t t.l>
	//   17   31:aload_2         
	//   18   32:invokespecial   #101 <Method void cc(t, JSONObject)>
	//   19   35:areturn         
	}

	public static cc a(String s, AppboyProperties appboyproperties)
	{
		JSONObject jsonobject = new JSONObject();
	//    0    0:new             #90  <Class JSONObject>
	//    1    3:dup             
	//    2    4:invokespecial   #91  <Method void JSONObject()>
	//    3    7:astore_2        
		jsonobject.put("n", ((Object) (StringUtils.checkNotNullOrEmpty(s))));
	//    4    8:aload_2         
	//    5    9:ldc1            #153 <String "n">
	//    6   11:aload_0         
	//    7   12:invokestatic    #159 <Method String StringUtils.checkNotNullOrEmpty(String)>
	//    8   15:invokevirtual   #127 <Method JSONObject JSONObject.put(String, Object)>
	//    9   18:pop             
		if(appboyproperties != null && appboyproperties.size() > 0)
	//*  10   19:aload_1         
	//*  11   20:ifnull          41
	//*  12   23:aload_1         
	//*  13   24:invokevirtual   #165 <Method int AppboyProperties.size()>
	//*  14   27:ifle            41
			jsonobject.put("p", ((Object) (appboyproperties.forJsonPut())));
	//   15   30:aload_2         
	//   16   31:ldc1            #167 <String "p">
	//   17   33:aload_1         
	//   18   34:invokevirtual   #170 <Method JSONObject AppboyProperties.forJsonPut()>
	//   19   37:invokevirtual   #127 <Method JSONObject JSONObject.put(String, Object)>
	//   20   40:pop             
		return new cc(t.b, jsonobject);
	//   21   41:new             #2   <Class cc>
	//   22   44:dup             
	//   23   45:getstatic       #171 <Field t t.b>
	//   24   48:aload_2         
	//   25   49:invokespecial   #101 <Method void cc(t, JSONObject)>
	//   26   52:areturn         
	}

	public static cc a(String s, String s1)
	{
		JSONObject jsonobject = new JSONObject();
	//    0    0:new             #90  <Class JSONObject>
	//    1    3:dup             
	//    2    4:invokespecial   #91  <Method void JSONObject()>
	//    3    7:astore_2        
		jsonobject.put("a", ((Object) (s)));
	//    4    8:aload_2         
	//    5    9:ldc1            #173 <String "a">
	//    6   11:aload_0         
	//    7   12:invokevirtual   #127 <Method JSONObject JSONObject.put(String, Object)>
	//    8   15:pop             
		jsonobject.put("l", ((Object) (s1)));
	//    9   16:aload_2         
	//   10   17:ldc1            #174 <String "l">
	//   11   19:aload_1         
	//   12   20:invokevirtual   #127 <Method JSONObject JSONObject.put(String, Object)>
	//   13   23:pop             
		return new cc(t.u, jsonobject);
	//   14   24:new             #2   <Class cc>
	//   15   27:dup             
	//   16   28:getstatic       #177 <Field t t.u>
	//   17   31:aload_2         
	//   18   32:invokespecial   #101 <Method void cc(t, JSONObject)>
	//   19   35:areturn         
	}

	public static cc a(String s, String s1, double d1, String s2, String s3, String s4)
	{
		t t1 = t.a(s);
	//    0    0:aload_0         
	//    1    1:invokestatic    #181 <Method t t.a(String)>
	//    2    4:astore          7
		if(t1 != null)
	//*   3    6:aload           7
	//*   4    8:ifnull          36
		{
			return new cc(t1, new JSONObject(s1), d1, s2, s3, s4);
	//    5   11:new             #2   <Class cc>
	//    6   14:dup             
	//    7   15:aload           7
	//    8   17:new             #90  <Class JSONObject>
	//    9   20:dup             
	//   10   21:aload_1         
	//   11   22:invokespecial   #182 <Method void JSONObject(String)>
	//   12   25:dload_2         
	//   13   26:aload           4
	//   14   28:aload           5
	//   15   30:aload           6
	//   16   32:invokespecial   #184 <Method void cc(t, JSONObject, double, String, String, String)>
	//   17   35:areturn         
		} else
		{
			s1 = ((String) (new StringBuilder()));
	//   18   36:new             #115 <Class StringBuilder>
	//   19   39:dup             
	//   20   40:invokespecial   #185 <Method void StringBuilder()>
	//   21   43:astore_1        
			((StringBuilder) (s1)).append("Cannot parse eventType ");
	//   22   44:aload_1         
	//   23   45:ldc1            #187 <String "Cannot parse eventType ">
	//   24   47:invokevirtual   #122 <Method StringBuilder StringBuilder.append(String)>
	//   25   50:pop             
			((StringBuilder) (s1)).append(s);
	//   26   51:aload_1         
	//   27   52:aload_0         
	//   28   53:invokevirtual   #122 <Method StringBuilder StringBuilder.append(String)>
	//   29   56:pop             
			throw new IllegalArgumentException(((StringBuilder) (s1)).toString());
	//   30   57:new             #189 <Class IllegalArgumentException>
	//   31   60:dup             
	//   32   61:aload_1         
	//   33   62:invokevirtual   #124 <Method String StringBuilder.toString()>
	//   34   65:invokespecial   #190 <Method void IllegalArgumentException(String)>
	//   35   68:athrow          
		}
	}

	public static cc a(String s, String s1, String s2)
	{
		return new cc(t.q, d(s, s1, s2));
	//    0    0:new             #2   <Class cc>
	//    1    3:dup             
	//    2    4:getstatic       #194 <Field t t.q>
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:invokestatic    #197 <Method JSONObject d(String, String, String)>
	//    7   13:invokespecial   #101 <Method void cc(t, JSONObject)>
	//    8   16:areturn         
	}

	public static cc a(String s, String s1, String s2, InAppMessageFailureType inappmessagefailuretype)
	{
		s = ((String) (b(s, s1, s2, inappmessagefailuretype)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokestatic    #201 <Method JSONObject b(String, String, String, InAppMessageFailureType)>
	//    5    7:astore_0        
		return new cc(t.t, ((JSONObject) (s)));
	//    6    8:new             #2   <Class cc>
	//    7   11:dup             
	//    8   12:getstatic       #204 <Field t t.t>
	//    9   15:aload_0         
	//   10   16:invokespecial   #101 <Method void cc(t, JSONObject)>
	//   11   19:areturn         
	}

	public static cc a(String s, String s1, String s2, MessageButton messagebutton)
	{
		return new cc(t.s, a(s, s1, s2, a(messagebutton), ((InAppMessageFailureType) (null))));
	//    0    0:new             #2   <Class cc>
	//    1    3:dup             
	//    2    4:getstatic       #208 <Field t t.s>
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:aload_3         
	//    7   11:invokestatic    #211 <Method String a(MessageButton)>
	//    8   14:aconst_null     
	//    9   15:invokestatic    #214 <Method JSONObject a(String, String, String, String, InAppMessageFailureType)>
	//   10   18:invokespecial   #101 <Method void cc(t, JSONObject)>
	//   11   21:areturn         
	}

	public static cc a(String s, String s1, String s2, String s3)
	{
		return new cc(t.s, a(s, s1, s2, s3, ((InAppMessageFailureType) (null))));
	//    0    0:new             #2   <Class cc>
	//    1    3:dup             
	//    2    4:getstatic       #208 <Field t t.s>
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:aload_3         
	//    7   11:aconst_null     
	//    8   12:invokestatic    #214 <Method JSONObject a(String, String, String, String, InAppMessageFailureType)>
	//    9   15:invokespecial   #101 <Method void cc(t, JSONObject)>
	//   10   18:areturn         
	}

	public static cc a(String s, String s1, BigDecimal bigdecimal, int k, AppboyProperties appboyproperties)
	{
		bigdecimal = dv.a(bigdecimal);
	//    0    0:aload_2         
	//    1    1:invokestatic    #221 <Method BigDecimal dv.a(BigDecimal)>
	//    2    4:astore_2        
		JSONObject jsonobject = new JSONObject();
	//    3    5:new             #90  <Class JSONObject>
	//    4    8:dup             
	//    5    9:invokespecial   #91  <Method void JSONObject()>
	//    6   12:astore          5
		jsonobject.put("pid", ((Object) (s)));
	//    7   14:aload           5
	//    8   16:ldc1            #223 <String "pid">
	//    9   18:aload_0         
	//   10   19:invokevirtual   #127 <Method JSONObject JSONObject.put(String, Object)>
	//   11   22:pop             
		jsonobject.put("c", ((Object) (s1)));
	//   12   23:aload           5
	//   13   25:ldc1            #224 <String "c">
	//   14   27:aload_1         
	//   15   28:invokevirtual   #127 <Method JSONObject JSONObject.put(String, Object)>
	//   16   31:pop             
		jsonobject.put("p", bigdecimal.doubleValue());
	//   17   32:aload           5
	//   18   34:ldc1            #167 <String "p">
	//   19   36:aload_2         
	//   20   37:invokevirtual   #229 <Method double BigDecimal.doubleValue()>
	//   21   40:invokevirtual   #232 <Method JSONObject JSONObject.put(String, double)>
	//   22   43:pop             
		jsonobject.put("q", k);
	//   23   44:aload           5
	//   24   46:ldc1            #233 <String "q">
	//   25   48:iload_3         
	//   26   49:invokevirtual   #147 <Method JSONObject JSONObject.put(String, int)>
	//   27   52:pop             
		if(appboyproperties != null && appboyproperties.size() > 0)
	//*  28   53:aload           4
	//*  29   55:ifnull          79
	//*  30   58:aload           4
	//*  31   60:invokevirtual   #165 <Method int AppboyProperties.size()>
	//*  32   63:ifle            79
			jsonobject.put("pr", ((Object) (appboyproperties.forJsonPut())));
	//   33   66:aload           5
	//   34   68:ldc1            #235 <String "pr">
	//   35   70:aload           4
	//   36   72:invokevirtual   #170 <Method JSONObject AppboyProperties.forJsonPut()>
	//   37   75:invokevirtual   #127 <Method JSONObject JSONObject.put(String, Object)>
	//   38   78:pop             
		return new cc(t.c, jsonobject);
	//   39   79:new             #2   <Class cc>
	//   40   82:dup             
	//   41   83:getstatic       #237 <Field t t.c>
	//   42   86:aload           5
	//   43   88:invokespecial   #101 <Method void cc(t, JSONObject)>
	//   44   91:areturn         
	}

	public static cc a(String s, String as[])
	{
		JSONArray jsonarray;
		if(as == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       10
			jsonarray = null;
	//    2    4:aconst_null     
	//    3    5:astore          4
		else
	//*   4    7:goto            19
			jsonarray = new JSONArray();
	//    5   10:new             #240 <Class JSONArray>
	//    6   13:dup             
	//    7   14:invokespecial   #241 <Method void JSONArray()>
	//    8   17:astore          4
		if(as != null)
	//*   9   19:aload_1         
	//*  10   20:ifnull          49
		{
			int l = as.length;
	//   11   23:aload_1         
	//   12   24:arraylength     
	//   13   25:istore_3        
			for(int k = 0; k < l; k++)
	//*  14   26:iconst_0        
	//*  15   27:istore_2        
	//*  16   28:iload_2         
	//*  17   29:iload_3         
	//*  18   30:icmpge          49
				jsonarray.put(((Object) (as[k])));
	//   19   33:aload           4
	//   20   35:aload_1         
	//   21   36:iload_2         
	//   22   37:aaload          
	//   23   38:invokevirtual   #244 <Method JSONArray JSONArray.put(Object)>
	//   24   41:pop             

	//   25   42:iload_2         
	//   26   43:iconst_1        
	//   27   44:iadd            
	//   28   45:istore_2        
		}
	//*  29   46:goto            28
		JSONObject jsonobject = new JSONObject();
	//   30   49:new             #90  <Class JSONObject>
	//   31   52:dup             
	//   32   53:invokespecial   #91  <Method void JSONObject()>
	//   33   56:astore          5
		jsonobject.put("key", ((Object) (s)));
	//   34   58:aload           5
	//   35   60:ldc1            #142 <String "key">
	//   36   62:aload_0         
	//   37   63:invokevirtual   #127 <Method JSONObject JSONObject.put(String, Object)>
	//   38   66:pop             
		if(as == null)
	//*  39   67:aload_1         
	//*  40   68:ifnonnull       85
			jsonobject.put("value", JSONObject.NULL);
	//   41   71:aload           5
	//   42   73:ldc1            #144 <String "value">
	//   43   75:getstatic       #248 <Field Object JSONObject.NULL>
	//   44   78:invokevirtual   #127 <Method JSONObject JSONObject.put(String, Object)>
	//   45   81:pop             
		else
	//*  46   82:goto            95
			jsonobject.put("value", ((Object) (jsonarray)));
	//   47   85:aload           5
	//   48   87:ldc1            #144 <String "value">
	//   49   89:aload           4
	//   50   91:invokevirtual   #127 <Method JSONObject JSONObject.put(String, Object)>
	//   51   94:pop             
		return new cc(t.o, jsonobject);
	//   52   95:new             #2   <Class cc>
	//   53   98:dup             
	//   54   99:getstatic       #251 <Field t t.o>
	//   55  102:aload           5
	//   56  104:invokespecial   #101 <Method void cc(t, JSONObject)>
	//   57  107:areturn         
	}

	public static cc a(Throwable throwable, ca ca1)
	{
		ca1 = ((ca) (b(throwable, ca1)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #110 <Method String b(Throwable, ca)>
	//    3    5:astore_1        
		throwable = ((Throwable) (a(throwable)));
	//    4    6:aload_0         
	//    5    7:invokestatic    #113 <Method String a(Throwable)>
	//    6   10:astore_0        
		ca1 = ((ca) (new StringBuilder(((String) (ca1)))));
	//    7   11:new             #115 <Class StringBuilder>
	//    8   14:dup             
	//    9   15:aload_1         
	//   10   16:invokespecial   #116 <Method void StringBuilder(String)>
	//   11   19:astore_1        
		((StringBuilder) (ca1)).append("\n");
	//   12   20:aload_1         
	//   13   21:ldc1            #118 <String "\n">
	//   14   23:invokevirtual   #122 <Method StringBuilder StringBuilder.append(String)>
	//   15   26:pop             
		((StringBuilder) (ca1)).append(((String) (throwable)));
	//   16   27:aload_1         
	//   17   28:aload_0         
	//   18   29:invokevirtual   #122 <Method StringBuilder StringBuilder.append(String)>
	//   19   32:pop             
		throwable = ((Throwable) (new JSONObject()));
	//   20   33:new             #90  <Class JSONObject>
	//   21   36:dup             
	//   22   37:invokespecial   #91  <Method void JSONObject()>
	//   23   40:astore_0        
		((JSONObject) (throwable)).put("e", ((Object) (((StringBuilder) (ca1)).toString())));
	//   24   41:aload_0         
	//   25   42:ldc1            #123 <String "e">
	//   26   44:aload_1         
	//   27   45:invokevirtual   #124 <Method String StringBuilder.toString()>
	//   28   48:invokevirtual   #127 <Method JSONObject JSONObject.put(String, Object)>
	//   29   51:pop             
		return new cc(t.h, ((JSONObject) (throwable)));
	//   30   52:new             #2   <Class cc>
	//   31   55:dup             
	//   32   56:getstatic       #130 <Field t t.h>
	//   33   59:aload_0         
	//   34   60:invokespecial   #101 <Method void cc(t, JSONObject)>
	//   35   63:areturn         
	}

	public static String a(MessageButton messagebutton)
	{
		if(messagebutton != null)
	//*   0    0:aload_0         
	//*   1    1:ifnull          12
			return String.valueOf(messagebutton.getId());
	//    2    4:aload_0         
	//    3    5:invokevirtual   #257 <Method int MessageButton.getId()>
	//    4    8:invokestatic    #263 <Method String String.valueOf(int)>
	//    5   11:areturn         
		else
			return null;
	//    6   12:aconst_null     
	//    7   13:areturn         
	}

	static String a(Throwable throwable)
	{
		Object obj = ((Object) (new StringWriter()));
	//    0    0:new             #265 <Class StringWriter>
	//    1    3:dup             
	//    2    4:invokespecial   #266 <Method void StringWriter()>
	//    3    7:astore_1        
		throwable.printStackTrace(new PrintWriter(((java.io.Writer) (obj))));
	//    4    8:aload_0         
	//    5    9:new             #268 <Class PrintWriter>
	//    6   12:dup             
	//    7   13:aload_1         
	//    8   14:invokespecial   #271 <Method void PrintWriter(java.io.Writer)>
	//    9   17:invokevirtual   #277 <Method void Throwable.printStackTrace(PrintWriter)>
		obj = ((Object) (obj.toString()));
	//   10   20:aload_1         
	//   11   21:invokevirtual   #278 <Method String Object.toString()>
	//   12   24:astore_1        
		throwable = ((Throwable) (obj));
	//   13   25:aload_1         
	//   14   26:astore_0        
		if(((String) (obj)).length() > 5000)
	//*  15   27:aload_1         
	//*  16   28:invokevirtual   #281 <Method int String.length()>
	//*  17   31:sipush          5000
	//*  18   34:icmple          46
			throwable = ((Throwable) (((String) (obj)).substring(0, 5000)));
	//   19   37:aload_1         
	//   20   38:iconst_0        
	//   21   39:sipush          5000
	//   22   42:invokevirtual   #285 <Method String String.substring(int, int)>
	//   23   45:astore_0        
		return ((String) (throwable));
	//   24   46:aload_0         
	//   25   47:areturn         
	}

	static JSONObject a(String s, String s1, String s2, String s3, InAppMessageFailureType inappmessagefailuretype)
	{
		JSONObject jsonobject = new JSONObject();
	//    0    0:new             #90  <Class JSONObject>
	//    1    3:dup             
	//    2    4:invokespecial   #91  <Method void JSONObject()>
	//    3    7:astore          5
		if(!StringUtils.isNullOrEmpty(s))
	//*   4    9:aload_0         
	//*   5   10:invokestatic    #289 <Method boolean StringUtils.isNullOrEmpty(String)>
	//*   6   13:ifne            43
		{
			JSONArray jsonarray = new JSONArray();
	//    7   16:new             #240 <Class JSONArray>
	//    8   19:dup             
	//    9   20:invokespecial   #241 <Method void JSONArray()>
	//   10   23:astore          6
			jsonarray.put(((Object) (s)));
	//   11   25:aload           6
	//   12   27:aload_0         
	//   13   28:invokevirtual   #244 <Method JSONArray JSONArray.put(Object)>
	//   14   31:pop             
			jsonobject.put("campaign_ids", ((Object) (jsonarray)));
	//   15   32:aload           5
	//   16   34:ldc2            #291 <String "campaign_ids">
	//   17   37:aload           6
	//   18   39:invokevirtual   #127 <Method JSONObject JSONObject.put(String, Object)>
	//   19   42:pop             
		}
		if(!StringUtils.isNullOrEmpty(s1))
	//*  20   43:aload_1         
	//*  21   44:invokestatic    #289 <Method boolean StringUtils.isNullOrEmpty(String)>
	//*  22   47:ifne            74
		{
			s = ((String) (new JSONArray()));
	//   23   50:new             #240 <Class JSONArray>
	//   24   53:dup             
	//   25   54:invokespecial   #241 <Method void JSONArray()>
	//   26   57:astore_0        
			((JSONArray) (s)).put(((Object) (s1)));
	//   27   58:aload_0         
	//   28   59:aload_1         
	//   29   60:invokevirtual   #244 <Method JSONArray JSONArray.put(Object)>
	//   30   63:pop             
			jsonobject.put("card_ids", ((Object) (s)));
	//   31   64:aload           5
	//   32   66:ldc2            #293 <String "card_ids">
	//   33   69:aload_0         
	//   34   70:invokevirtual   #127 <Method JSONObject JSONObject.put(String, Object)>
	//   35   73:pop             
		}
		if(!StringUtils.isNullOrEmpty(s2))
	//*  36   74:aload_2         
	//*  37   75:invokestatic    #289 <Method boolean StringUtils.isNullOrEmpty(String)>
	//*  38   78:ifne            105
		{
			s = ((String) (new JSONArray()));
	//   39   81:new             #240 <Class JSONArray>
	//   40   84:dup             
	//   41   85:invokespecial   #241 <Method void JSONArray()>
	//   42   88:astore_0        
			((JSONArray) (s)).put(((Object) (s2)));
	//   43   89:aload_0         
	//   44   90:aload_2         
	//   45   91:invokevirtual   #244 <Method JSONArray JSONArray.put(Object)>
	//   46   94:pop             
			jsonobject.put("trigger_ids", ((Object) (s)));
	//   47   95:aload           5
	//   48   97:ldc2            #295 <String "trigger_ids">
	//   49  100:aload_0         
	//   50  101:invokevirtual   #127 <Method JSONObject JSONObject.put(String, Object)>
	//   51  104:pop             
		}
		if(!StringUtils.isNullOrEmpty(s3))
	//*  52  105:aload_3         
	//*  53  106:invokestatic    #289 <Method boolean StringUtils.isNullOrEmpty(String)>
	//*  54  109:ifne            122
			jsonobject.put("bid", ((Object) (s3)));
	//   55  112:aload           5
	//   56  114:ldc2            #297 <String "bid">
	//   57  117:aload_3         
	//   58  118:invokevirtual   #127 <Method JSONObject JSONObject.put(String, Object)>
	//   59  121:pop             
		if(inappmessagefailuretype != null)
	//*  60  122:aload           4
	//*  61  124:ifnull          150
		{
			s = inappmessagefailuretype.forJsonPut();
	//   62  127:aload           4
	//   63  129:invokevirtual   #301 <Method String InAppMessageFailureType.forJsonPut()>
	//   64  132:astore_0        
			if(!StringUtils.isNullOrEmpty(s))
	//*  65  133:aload_0         
	//*  66  134:invokestatic    #289 <Method boolean StringUtils.isNullOrEmpty(String)>
	//*  67  137:ifne            150
				jsonobject.put("error_code", ((Object) (s)));
	//   68  140:aload           5
	//   69  142:ldc2            #303 <String "error_code">
	//   70  145:aload_0         
	//   71  146:invokevirtual   #127 <Method JSONObject JSONObject.put(String, Object)>
	//   72  149:pop             
		}
		return jsonobject;
	//   73  150:aload           5
	//   74  152:areturn         
	}

	public static cc b(String s)
	{
		JSONObject jsonobject = new JSONObject();
	//    0    0:new             #90  <Class JSONObject>
	//    1    3:dup             
	//    2    4:invokespecial   #91  <Method void JSONObject()>
	//    3    7:astore_1        
		jsonobject.put("cid", ((Object) (s)));
	//    4    8:aload_1         
	//    5    9:ldc2            #306 <String "cid">
	//    6   12:aload_0         
	//    7   13:invokevirtual   #127 <Method JSONObject JSONObject.put(String, Object)>
	//    8   16:pop             
		return new cc(t.e, jsonobject);
	//    9   17:new             #2   <Class cc>
	//   10   20:dup             
	//   11   21:getstatic       #308 <Field t t.e>
	//   12   24:aload_1         
	//   13   25:invokespecial   #101 <Method void cc(t, JSONObject)>
	//   14   28:areturn         
	}

	public static cc b(String s, String s1)
	{
		JSONObject jsonobject = new JSONObject();
	//    0    0:new             #90  <Class JSONObject>
	//    1    3:dup             
	//    2    4:invokespecial   #91  <Method void JSONObject()>
	//    3    7:astore_2        
		jsonobject.put("cid", ((Object) (s)));
	//    4    8:aload_2         
	//    5    9:ldc2            #306 <String "cid">
	//    6   12:aload_0         
	//    7   13:invokevirtual   #127 <Method JSONObject JSONObject.put(String, Object)>
	//    8   16:pop             
		jsonobject.put("a", ((Object) (s1)));
	//    9   17:aload_2         
	//   10   18:ldc1            #173 <String "a">
	//   11   20:aload_1         
	//   12   21:invokevirtual   #127 <Method JSONObject JSONObject.put(String, Object)>
	//   13   24:pop             
		return new cc(t.d, jsonobject);
	//   14   25:new             #2   <Class cc>
	//   15   28:dup             
	//   16   29:getstatic       #310 <Field t t.d>
	//   17   32:aload_2         
	//   18   33:invokespecial   #101 <Method void cc(t, JSONObject)>
	//   19   36:areturn         
	}

	public static cc b(String s, String s1, String s2)
	{
		return new cc(t.p, d(s, s1, s2));
	//    0    0:new             #2   <Class cc>
	//    1    3:dup             
	//    2    4:getstatic       #312 <Field t t.p>
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:invokestatic    #197 <Method JSONObject d(String, String, String)>
	//    7   13:invokespecial   #101 <Method void cc(t, JSONObject)>
	//    8   16:areturn         
	}

	static String b(Throwable throwable, ca ca1)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #115 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #185 <Method void StringBuilder()>
	//    3    7:astore_3        
		String s = throwable.toString();
	//    4    8:aload_0         
	//    5    9:invokevirtual   #313 <Method String Throwable.toString()>
	//    6   12:astore_2        
		throwable = ((Throwable) (s));
	//    7   13:aload_2         
	//    8   14:astore_0        
		if(s.length() > 5000)
	//*   9   15:aload_2         
	//*  10   16:invokevirtual   #281 <Method int String.length()>
	//*  11   19:sipush          5000
	//*  12   22:icmple          34
			throwable = ((Throwable) (s.substring(0, 5000)));
	//   13   25:aload_2         
	//   14   26:iconst_0        
	//   15   27:sipush          5000
	//   16   30:invokevirtual   #285 <Method String String.substring(int, int)>
	//   17   33:astore_0        
		stringbuilder.append("exception_class: ");
	//   18   34:aload_3         
	//   19   35:ldc2            #315 <String "exception_class: ">
	//   20   38:invokevirtual   #122 <Method StringBuilder StringBuilder.append(String)>
	//   21   41:pop             
		stringbuilder.append(((String) (throwable)));
	//   22   42:aload_3         
	//   23   43:aload_0         
	//   24   44:invokevirtual   #122 <Method StringBuilder StringBuilder.append(String)>
	//   25   47:pop             
		stringbuilder.append(",");
	//   26   48:aload_3         
	//   27   49:ldc2            #317 <String ",">
	//   28   52:invokevirtual   #122 <Method StringBuilder StringBuilder.append(String)>
	//   29   55:pop             
		stringbuilder.append("session_id: ");
	//   30   56:aload_3         
	//   31   57:ldc2            #319 <String "session_id: ">
	//   32   60:invokevirtual   #122 <Method StringBuilder StringBuilder.append(String)>
	//   33   63:pop             
		if(ca1 != null)
	//*  34   64:aload_1         
	//*  35   65:ifnull          76
			throwable = ((Throwable) (ca1.toString()));
	//   36   68:aload_1         
	//   37   69:invokevirtual   #320 <Method String ca.toString()>
	//   38   72:astore_0        
		else
	//*  39   73:goto            78
			throwable = null;
	//   40   76:aconst_null     
	//   41   77:astore_0        
		stringbuilder.append(((String) (throwable)));
	//   42   78:aload_3         
	//   43   79:aload_0         
	//   44   80:invokevirtual   #122 <Method StringBuilder StringBuilder.append(String)>
	//   45   83:pop             
		return stringbuilder.toString();
	//   46   84:aload_3         
	//   47   85:invokevirtual   #124 <Method String StringBuilder.toString()>
	//   48   88:areturn         
	}

	static JSONObject b(String s, String s1, String s2, InAppMessageFailureType inappmessagefailuretype)
	{
		return a(s, s1, s2, ((String) (null)), inappmessagefailuretype);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aconst_null     
	//    4    4:aload_3         
	//    5    5:invokestatic    #214 <Method JSONObject a(String, String, String, String, InAppMessageFailureType)>
	//    6    8:areturn         
	}

	public static cc c(String s)
	{
		JSONObject jsonobject = new JSONObject();
	//    0    0:new             #90  <Class JSONObject>
	//    1    3:dup             
	//    2    4:invokespecial   #91  <Method void JSONObject()>
	//    3    7:astore_1        
		JSONArray jsonarray = new JSONArray();
	//    4    8:new             #240 <Class JSONArray>
	//    5   11:dup             
	//    6   12:invokespecial   #241 <Method void JSONArray()>
	//    7   15:astore_2        
		jsonarray.put(((Object) (s)));
	//    8   16:aload_2         
	//    9   17:aload_0         
	//   10   18:invokevirtual   #244 <Method JSONArray JSONArray.put(Object)>
	//   11   21:pop             
		jsonobject.put("ids", ((Object) (jsonarray)));
	//   12   22:aload_1         
	//   13   23:ldc2            #322 <String "ids">
	//   14   26:aload_2         
	//   15   27:invokevirtual   #127 <Method JSONObject JSONObject.put(String, Object)>
	//   16   30:pop             
		return new cc(t.i, jsonobject);
	//   17   31:new             #2   <Class cc>
	//   18   34:dup             
	//   19   35:getstatic       #325 <Field t t.i>
	//   20   38:aload_1         
	//   21   39:invokespecial   #101 <Method void cc(t, JSONObject)>
	//   22   42:areturn         
	}

	public static cc c(String s, String s1)
	{
		JSONObject jsonobject = new JSONObject();
	//    0    0:new             #90  <Class JSONObject>
	//    1    3:dup             
	//    2    4:invokespecial   #91  <Method void JSONObject()>
	//    3    7:astore_2        
		jsonobject.put("cid", ((Object) (s)));
	//    4    8:aload_2         
	//    5    9:ldc2            #306 <String "cid">
	//    6   12:aload_0         
	//    7   13:invokevirtual   #127 <Method JSONObject JSONObject.put(String, Object)>
	//    8   16:pop             
		jsonobject.put("a", ((Object) (s1)));
	//    9   17:aload_2         
	//   10   18:ldc1            #173 <String "a">
	//   11   20:aload_1         
	//   12   21:invokevirtual   #127 <Method JSONObject JSONObject.put(String, Object)>
	//   13   24:pop             
		return new cc(t.f, jsonobject);
	//   14   25:new             #2   <Class cc>
	//   15   28:dup             
	//   16   29:getstatic       #327 <Field t t.f>
	//   17   32:aload_2         
	//   18   33:invokespecial   #101 <Method void cc(t, JSONObject)>
	//   19   36:areturn         
	}

	public static cc c(String s, String s1, String s2)
	{
		return new cc(t.r, d(s, s1, s2));
	//    0    0:new             #2   <Class cc>
	//    1    3:dup             
	//    2    4:getstatic       #330 <Field t t.r>
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:invokestatic    #197 <Method JSONObject d(String, String, String)>
	//    7   13:invokespecial   #101 <Method void cc(t, JSONObject)>
	//    8   16:areturn         
	}

	public static cc d(String s)
	{
		JSONObject jsonobject = new JSONObject();
	//    0    0:new             #90  <Class JSONObject>
	//    1    3:dup             
	//    2    4:invokespecial   #91  <Method void JSONObject()>
	//    3    7:astore_1        
		JSONArray jsonarray = new JSONArray();
	//    4    8:new             #240 <Class JSONArray>
	//    5   11:dup             
	//    6   12:invokespecial   #241 <Method void JSONArray()>
	//    7   15:astore_2        
		jsonarray.put(((Object) (s)));
	//    8   16:aload_2         
	//    9   17:aload_0         
	//   10   18:invokevirtual   #244 <Method JSONArray JSONArray.put(Object)>
	//   11   21:pop             
		jsonobject.put("ids", ((Object) (jsonarray)));
	//   12   22:aload_1         
	//   13   23:ldc2            #322 <String "ids">
	//   14   26:aload_2         
	//   15   27:invokevirtual   #127 <Method JSONObject JSONObject.put(String, Object)>
	//   16   30:pop             
		return new cc(t.j, jsonobject);
	//   17   31:new             #2   <Class cc>
	//   18   34:dup             
	//   19   35:getstatic       #333 <Field t t.j>
	//   20   38:aload_1         
	//   21   39:invokespecial   #101 <Method void cc(t, JSONObject)>
	//   22   42:areturn         
	}

	public static cc d(String s, String s1)
	{
		JSONObject jsonobject = new JSONObject();
	//    0    0:new             #90  <Class JSONObject>
	//    1    3:dup             
	//    2    4:invokespecial   #91  <Method void JSONObject()>
	//    3    7:astore_2        
		jsonobject.put("geo_id", ((Object) (s)));
	//    4    8:aload_2         
	//    5    9:ldc2            #335 <String "geo_id">
	//    6   12:aload_0         
	//    7   13:invokevirtual   #127 <Method JSONObject JSONObject.put(String, Object)>
	//    8   16:pop             
		jsonobject.put("event_type", ((Object) (s1)));
	//    9   17:aload_2         
	//   10   18:ldc2            #337 <String "event_type">
	//   11   21:aload_1         
	//   12   22:invokevirtual   #127 <Method JSONObject JSONObject.put(String, Object)>
	//   13   25:pop             
		return new cc(t.k, jsonobject);
	//   14   26:new             #2   <Class cc>
	//   15   29:dup             
	//   16   30:getstatic       #340 <Field t t.k>
	//   17   33:aload_2         
	//   18   34:invokespecial   #101 <Method void cc(t, JSONObject)>
	//   19   37:areturn         
	}

	static JSONObject d(String s, String s1, String s2)
	{
		return a(s, s1, s2, ((String) (null)), ((InAppMessageFailureType) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aconst_null     
	//    4    4:aconst_null     
	//    5    5:invokestatic    #214 <Method JSONObject a(String, String, String, String, InAppMessageFailureType)>
	//    6    8:areturn         
	}

	public static cc e(String s)
	{
		JSONObject jsonobject = new JSONObject();
	//    0    0:new             #90  <Class JSONObject>
	//    1    3:dup             
	//    2    4:invokespecial   #91  <Method void JSONObject()>
	//    3    7:astore_1        
		jsonobject.put("n", ((Object) (s)));
	//    4    8:aload_1         
	//    5    9:ldc1            #153 <String "n">
	//    6   11:aload_0         
	//    7   12:invokevirtual   #127 <Method JSONObject JSONObject.put(String, Object)>
	//    8   15:pop             
		return new cc(t.g, jsonobject);
	//    9   16:new             #2   <Class cc>
	//   10   19:dup             
	//   11   20:getstatic       #342 <Field t t.g>
	//   12   23:aload_1         
	//   13   24:invokespecial   #101 <Method void cc(t, JSONObject)>
	//   14   27:areturn         
	}

	public static cc e(String s, String s1)
	{
		JSONObject jsonobject = new JSONObject();
	//    0    0:new             #90  <Class JSONObject>
	//    1    3:dup             
	//    2    4:invokespecial   #91  <Method void JSONObject()>
	//    3    7:astore_2        
		jsonobject.put("key", ((Object) (s)));
	//    4    8:aload_2         
	//    5    9:ldc1            #142 <String "key">
	//    6   11:aload_0         
	//    7   12:invokevirtual   #127 <Method JSONObject JSONObject.put(String, Object)>
	//    8   15:pop             
		jsonobject.put("value", ((Object) (s1)));
	//    9   16:aload_2         
	//   10   17:ldc1            #144 <String "value">
	//   11   19:aload_1         
	//   12   20:invokevirtual   #127 <Method JSONObject JSONObject.put(String, Object)>
	//   13   23:pop             
		return new cc(t.m, jsonobject);
	//   14   24:new             #2   <Class cc>
	//   15   27:dup             
	//   16   28:getstatic       #345 <Field t t.m>
	//   17   31:aload_2         
	//   18   32:invokespecial   #101 <Method void cc(t, JSONObject)>
	//   19   35:areturn         
	}

	public static cc f(String s)
	{
		JSONObject jsonobject = new JSONObject();
	//    0    0:new             #90  <Class JSONObject>
	//    1    3:dup             
	//    2    4:invokespecial   #91  <Method void JSONObject()>
	//    3    7:astore_1        
		jsonobject.put("cid", ((Object) (s)));
	//    4    8:aload_1         
	//    5    9:ldc2            #306 <String "cid">
	//    6   12:aload_0         
	//    7   13:invokevirtual   #127 <Method JSONObject JSONObject.put(String, Object)>
	//    8   16:pop             
		return new cc(t.x, jsonobject);
	//    9   17:new             #2   <Class cc>
	//   10   20:dup             
	//   11   21:getstatic       #348 <Field t t.x>
	//   12   24:aload_1         
	//   13   25:invokespecial   #101 <Method void cc(t, JSONObject)>
	//   14   28:areturn         
	}

	public static cc f(String s, String s1)
	{
		JSONObject jsonobject = new JSONObject();
	//    0    0:new             #90  <Class JSONObject>
	//    1    3:dup             
	//    2    4:invokespecial   #91  <Method void JSONObject()>
	//    3    7:astore_2        
		jsonobject.put("key", ((Object) (s)));
	//    4    8:aload_2         
	//    5    9:ldc1            #142 <String "key">
	//    6   11:aload_0         
	//    7   12:invokevirtual   #127 <Method JSONObject JSONObject.put(String, Object)>
	//    8   15:pop             
		jsonobject.put("value", ((Object) (s1)));
	//    9   16:aload_2         
	//   10   17:ldc1            #144 <String "value">
	//   11   19:aload_1         
	//   12   20:invokevirtual   #127 <Method JSONObject JSONObject.put(String, Object)>
	//   13   23:pop             
		return new cc(t.n, jsonobject);
	//   14   24:new             #2   <Class cc>
	//   15   27:dup             
	//   16   28:getstatic       #350 <Field t t.n>
	//   17   31:aload_2         
	//   18   32:invokespecial   #101 <Method void cc(t, JSONObject)>
	//   19   35:areturn         
	}

	public static cc g()
	{
		return e("feed_displayed");
	//    0    0:ldc2            #353 <String "feed_displayed">
	//    1    3:invokestatic    #355 <Method cc e(String)>
	//    2    6:areturn         
	}

	public static cc h()
	{
		return e("feedback_displayed");
	//    0    0:ldc2            #357 <String "feedback_displayed">
	//    1    3:invokestatic    #355 <Method cc e(String)>
	//    2    6:areturn         
	}

	public static cc i()
	{
		JSONObject jsonobject = new JSONObject();
	//    0    0:new             #90  <Class JSONObject>
	//    1    3:dup             
	//    2    4:invokespecial   #91  <Method void JSONObject()>
	//    3    7:astore_0        
		return new cc(t.v, jsonobject);
	//    4    8:new             #2   <Class cc>
	//    5   11:dup             
	//    6   12:getstatic       #360 <Field t t.v>
	//    7   15:aload_0         
	//    8   16:invokespecial   #101 <Method void cc(t, JSONObject)>
	//    9   19:areturn         
	}

	public double a()
	{
		return d;
	//    0    0:aload_0         
	//    1    1:getfield        #70  <Field double d>
	//    2    4:dreturn         
	}

	public void a(ca ca1)
	{
		if(g == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #60  <Field ca g>
	//*   2    4:ifnonnull       13
		{
			g = ca1;
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:putfield        #60  <Field ca g>
			return;
	//    6   12:return          
		} else
		{
			String s = a;
	//    7   13:getstatic       #28  <Field String a>
	//    8   16:astore_2        
			StringBuilder stringbuilder = new StringBuilder();
	//    9   17:new             #115 <Class StringBuilder>
	//   10   20:dup             
	//   11   21:invokespecial   #185 <Method void StringBuilder()>
	//   12   24:astore_3        
			stringbuilder.append("Session id can only be set once. Doing nothing. Given session id: ");
	//   13   25:aload_3         
	//   14   26:ldc2            #363 <String "Session id can only be set once. Doing nothing. Given session id: ">
	//   15   29:invokevirtual   #122 <Method StringBuilder StringBuilder.append(String)>
	//   16   32:pop             
			stringbuilder.append(((Object) (ca1)));
	//   17   33:aload_3         
	//   18   34:aload_1         
	//   19   35:invokevirtual   #366 <Method StringBuilder StringBuilder.append(Object)>
	//   20   38:pop             
			AppboyLogger.d(s, stringbuilder.toString());
	//   21   39:aload_2         
	//   22   40:aload_3         
	//   23   41:invokevirtual   #124 <Method String StringBuilder.toString()>
	//   24   44:invokestatic    #369 <Method int AppboyLogger.d(String, String)>
	//   25   47:pop             
			return;
	//   26   48:return          
		}
	}

	public void a(String s)
	{
		if(f == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #58  <Field String f>
	//*   2    4:ifnonnull       13
		{
			f = s;
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:putfield        #58  <Field String f>
			return;
	//    6   12:return          
		} else
		{
			String s1 = a;
	//    7   13:getstatic       #28  <Field String a>
	//    8   16:astore_2        
			StringBuilder stringbuilder = new StringBuilder();
	//    9   17:new             #115 <Class StringBuilder>
	//   10   20:dup             
	//   11   21:invokespecial   #185 <Method void StringBuilder()>
	//   12   24:astore_3        
			stringbuilder.append("User id can only be set once. Doing nothing. Given user id: ");
	//   13   25:aload_3         
	//   14   26:ldc2            #371 <String "User id can only be set once. Doing nothing. Given user id: ">
	//   15   29:invokevirtual   #122 <Method StringBuilder StringBuilder.append(String)>
	//   16   32:pop             
			stringbuilder.append(s);
	//   17   33:aload_3         
	//   18   34:aload_1         
	//   19   35:invokevirtual   #122 <Method StringBuilder StringBuilder.append(String)>
	//   20   38:pop             
			AppboyLogger.d(s1, stringbuilder.toString());
	//   21   39:aload_2         
	//   22   40:aload_3         
	//   23   41:invokevirtual   #124 <Method String StringBuilder.toString()>
	//   24   44:invokestatic    #369 <Method int AppboyLogger.d(String, String)>
	//   25   47:pop             
			return;
	//   26   48:return          
		}
	}

	public t b()
	{
		return b;
	//    0    0:aload_0         
	//    1    1:getfield        #66  <Field t b>
	//    2    4:areturn         
	}

	public JSONObject c()
	{
		return c;
	//    0    0:aload_0         
	//    1    1:getfield        #68  <Field JSONObject c>
	//    2    4:areturn         
	}

	public String d()
	{
		return e;
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field String e>
	//    2    4:areturn         
	}

	public String e()
	{
		return f;
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field String f>
	//    2    4:areturn         
	}

	public ca f()
	{
		return g;
	//    0    0:aload_0         
	//    1    1:getfield        #60  <Field ca g>
	//    2    4:areturn         
	}

	public Object forJsonPut()
	{
		return ((Object) (j()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #375 <Method JSONObject j()>
	//    2    4:areturn         
	}

	public JSONObject j()
	{
		JSONObject jsonobject = new JSONObject();
	//    0    0:new             #90  <Class JSONObject>
	//    1    3:dup             
	//    2    4:invokespecial   #91  <Method void JSONObject()>
	//    3    7:astore_1        
		jsonobject.put("name", ((Object) (b.a())));
	//    4    8:aload_1         
	//    5    9:ldc2            #379 <String "name">
	//    6   12:aload_0         
	//    7   13:getfield        #66  <Field t b>
	//    8   16:invokevirtual   #64  <Method String t.a()>
	//    9   19:invokevirtual   #127 <Method JSONObject JSONObject.put(String, Object)>
	//   10   22:pop             
		jsonobject.put("data", ((Object) (c)));
	//   11   23:aload_1         
	//   12   24:ldc2            #381 <String "data">
	//   13   27:aload_0         
	//   14   28:getfield        #68  <Field JSONObject c>
	//   15   31:invokevirtual   #127 <Method JSONObject JSONObject.put(String, Object)>
	//   16   34:pop             
		jsonobject.put("time", d);
	//   17   35:aload_1         
	//   18   36:ldc2            #383 <String "time">
	//   19   39:aload_0         
	//   20   40:getfield        #70  <Field double d>
	//   21   43:invokevirtual   #232 <Method JSONObject JSONObject.put(String, double)>
	//   22   46:pop             
		if(!StringUtils.isNullOrEmpty(f))
	//*  23   47:aload_0         
	//*  24   48:getfield        #58  <Field String f>
	//*  25   51:invokestatic    #289 <Method boolean StringUtils.isNullOrEmpty(String)>
	//*  26   54:ifne            69
			jsonobject.put("user_id", ((Object) (f)));
	//   27   57:aload_1         
	//   28   58:ldc2            #385 <String "user_id">
	//   29   61:aload_0         
	//   30   62:getfield        #58  <Field String f>
	//   31   65:invokevirtual   #127 <Method JSONObject JSONObject.put(String, Object)>
	//   32   68:pop             
		if(g == null)
			break MISSING_BLOCK_LABEL_105;
	//   33   69:aload_0         
	//   34   70:getfield        #60  <Field ca g>
	//   35   73:ifnull          105
		jsonobject.put("session_id", ((Object) (g.b())));
	//   36   76:aload_1         
	//   37   77:ldc2            #387 <String "session_id">
	//   38   80:aload_0         
	//   39   81:getfield        #60  <Field ca g>
	//   40   84:invokevirtual   #389 <Method String ca.b()>
	//   41   87:invokevirtual   #127 <Method JSONObject JSONObject.put(String, Object)>
	//   42   90:pop             
		return jsonobject;
	//   43   91:aload_1         
	//   44   92:areturn         
		JSONException jsonexception;
		jsonexception;
	//   45   93:astore_2        
		AppboyLogger.e(a, "Caught exception creating Braze event Json.", ((Throwable) (jsonexception)));
	//   46   94:getstatic       #28  <Field String a>
	//   47   97:ldc2            #391 <String "Caught exception creating Braze event Json.">
	//   48  100:aload_2         
	//   49  101:invokestatic    #394 <Method int AppboyLogger.e(String, String, Throwable)>
	//   50  104:pop             
		return jsonobject;
	//   51  105:aload_1         
	//   52  106:areturn         
	}

	public String toString()
	{
		JSONObject jsonobject = j();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #375 <Method JSONObject j()>
	//    2    4:astore_1        
		if(jsonobject != null && jsonobject.length() > 0)
	//*   3    5:aload_1         
	//*   4    6:ifnull          21
	//*   5    9:aload_1         
	//*   6   10:invokevirtual   #395 <Method int JSONObject.length()>
	//*   7   13:ifle            21
			return jsonobject.toString();
	//    8   16:aload_1         
	//    9   17:invokevirtual   #396 <Method String JSONObject.toString()>
	//   10   20:areturn         
		else
			return "";
	//   11   21:ldc2            #398 <String "">
	//   12   24:areturn         
	}

	private static final String a = AppboyLogger.getAppboyLogTag(bo/app/cc);
	private final t b;
	private final JSONObject c;
	private final double d;
	private final String e;
	private String f;
	private ca g;

	static 
	{
	//    0    0:ldc1            #2   <Class cc>
	//    1    2:invokestatic    #26  <Method String AppboyLogger.getAppboyLogTag(Class)>
	//    2    5:putstatic       #28  <Field String a>
	//*   3    8:return          
	}
}
