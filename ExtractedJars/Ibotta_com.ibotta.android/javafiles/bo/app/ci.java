// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;

import com.appboy.enums.inappmessage.InAppMessageFailureType;
import com.appboy.models.MessageButton;
import com.appboy.models.outgoing.AppboyProperties;
import com.appboy.support.AppboyLogger;
import com.appboy.support.StringUtils;
import com.newrelic.agent.android.instrumentation.JSONObjectInstrumentation;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.math.BigDecimal;
import java.util.UUID;
import org.json.*;

// Referenced classes of package bo.app:
//			cc, eb, w, cg, 
//			cd, em

public final class ci
	implements cc
{

	private ci(w w1, JSONObject jsonobject)
	{
		this(w1, jsonobject, eb.b());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokestatic    #38  <Method double eb.b()>
	//    4    6:invokespecial   #41  <Method void ci(w, JSONObject, double)>
	//    5    9:return          
	}

	private ci(w w1, JSONObject jsonobject, double d1)
	{
		this(w1, jsonobject, d1, UUID.randomUUID().toString());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:dload_3         
	//    4    4:invokestatic    #48  <Method UUID UUID.randomUUID()>
	//    5    7:invokevirtual   #52  <Method String UUID.toString()>
	//    6   10:invokespecial   #55  <Method void ci(w, JSONObject, double, String)>
	//    7   13:return          
	}

	private ci(w w1, JSONObject jsonobject, double d1, String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #57  <Method void Object()>
		f = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #59  <Field String f>
		g = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #61  <Field cg g>
		if(jsonobject != null)
	//*   8   14:aload_2         
	//*   9   15:ifnull          57
		{
			if(w1.a() != null)
	//*  10   18:aload_1         
	//*  11   19:invokevirtual   #65  <Method String w.a()>
	//*  12   22:ifnull          47
			{
				b = w1;
	//   13   25:aload_0         
	//   14   26:aload_1         
	//   15   27:putfield        #67  <Field w b>
				c = jsonobject;
	//   16   30:aload_0         
	//   17   31:aload_2         
	//   18   32:putfield        #69  <Field JSONObject c>
				d = d1;
	//   19   35:aload_0         
	//   20   36:dload_3         
	//   21   37:putfield        #71  <Field double d>
				e = s;
	//   22   40:aload_0         
	//   23   41:aload           5
	//   24   43:putfield        #73  <Field String e>
				return;
	//   25   46:return          
			} else
			{
				throw new NullPointerException("Event type cannot be null");
	//   26   47:new             #75  <Class NullPointerException>
	//   27   50:dup             
	//   28   51:ldc1            #77  <String "Event type cannot be null">
	//   29   53:invokespecial   #80  <Method void NullPointerException(String)>
	//   30   56:athrow          
			}
		} else
		{
			throw new NullPointerException("Event data cannot be null");
	//   31   57:new             #75  <Class NullPointerException>
	//   32   60:dup             
	//   33   61:ldc1            #82  <String "Event data cannot be null">
	//   34   63:invokespecial   #80  <Method void NullPointerException(String)>
	//   35   66:athrow          
		}
	}

	private ci(w w1, JSONObject jsonobject, double d1, String s, String s1, String s2)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #57  <Method void Object()>
		f = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #59  <Field String f>
		g = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #61  <Field cg g>
		if(jsonobject != null)
	//*   8   14:aload_2         
	//*   9   15:ifnull          77
		{
			if(w1.a() != null)
	//*  10   18:aload_1         
	//*  11   19:invokevirtual   #65  <Method String w.a()>
	//*  12   22:ifnull          67
			{
				b = w1;
	//   13   25:aload_0         
	//   14   26:aload_1         
	//   15   27:putfield        #67  <Field w b>
				c = jsonobject;
	//   16   30:aload_0         
	//   17   31:aload_2         
	//   18   32:putfield        #69  <Field JSONObject c>
				d = d1;
	//   19   35:aload_0         
	//   20   36:dload_3         
	//   21   37:putfield        #71  <Field double d>
				e = s;
	//   22   40:aload_0         
	//   23   41:aload           5
	//   24   43:putfield        #73  <Field String e>
				f = s1;
	//   25   46:aload_0         
	//   26   47:aload           6
	//   27   49:putfield        #59  <Field String f>
				if(s2 != null)
	//*  28   52:aload           7
	//*  29   54:ifnull          66
					g = cg.a(s2);
	//   30   57:aload_0         
	//   31   58:aload           7
	//   32   60:invokestatic    #88  <Method cg cg.a(String)>
	//   33   63:putfield        #61  <Field cg g>
				return;
	//   34   66:return          
			} else
			{
				throw new NullPointerException("Event type cannot be null");
	//   35   67:new             #75  <Class NullPointerException>
	//   36   70:dup             
	//   37   71:ldc1            #77  <String "Event type cannot be null">
	//   38   73:invokespecial   #80  <Method void NullPointerException(String)>
	//   39   76:athrow          
			}
		} else
		{
			throw new NullPointerException("Event data cannot be null");
	//   40   77:new             #75  <Class NullPointerException>
	//   41   80:dup             
	//   42   81:ldc1            #82  <String "Event data cannot be null">
	//   43   83:invokespecial   #80  <Method void NullPointerException(String)>
	//   44   86:athrow          
		}
	}

	public static ci a(long l1)
	{
		JSONObject jsonobject = new JSONObject();
	//    0    0:new             #91  <Class JSONObject>
	//    1    3:dup             
	//    2    4:invokespecial   #92  <Method void JSONObject()>
	//    3    7:astore_2        
		jsonobject.put("d", l1);
	//    4    8:aload_2         
	//    5    9:ldc1            #93  <String "d">
	//    6   11:lload_0         
	//    7   12:invokevirtual   #97  <Method JSONObject JSONObject.put(String, long)>
	//    8   15:pop             
		return new ci(w.A, jsonobject);
	//    9   16:new             #2   <Class ci>
	//   10   19:dup             
	//   11   20:getstatic       #100 <Field w w.A>
	//   12   23:aload_2         
	//   13   24:invokespecial   #102 <Method void ci(w, JSONObject)>
	//   14   27:areturn         
	}

	public static ci a(cd cd1)
	{
		return new ci(w.a, (JSONObject)cd1.forJsonPut());
	//    0    0:new             #2   <Class ci>
	//    1    3:dup             
	//    2    4:getstatic       #105 <Field w w.a>
	//    3    7:aload_0         
	//    4    8:invokeinterface #111 <Method Object cd.forJsonPut()>
	//    5   13:checkcast       #91  <Class JSONObject>
	//    6   16:invokespecial   #102 <Method void ci(w, JSONObject)>
	//    7   19:areturn         
	}

	public static ci a(String s, double d1, double d2)
	{
		JSONObject jsonobject = new JSONObject();
	//    0    0:new             #91  <Class JSONObject>
	//    1    3:dup             
	//    2    4:invokespecial   #92  <Method void JSONObject()>
	//    3    7:astore          5
		jsonobject.put("key", ((Object) (s)));
	//    4    9:aload           5
	//    5   11:ldc1            #114 <String "key">
	//    6   13:aload_0         
	//    7   14:invokevirtual   #117 <Method JSONObject JSONObject.put(String, Object)>
	//    8   17:pop             
		jsonobject.put("latitude", d1);
	//    9   18:aload           5
	//   10   20:ldc1            #119 <String "latitude">
	//   11   22:dload_1         
	//   12   23:invokevirtual   #122 <Method JSONObject JSONObject.put(String, double)>
	//   13   26:pop             
		jsonobject.put("longitude", d2);
	//   14   27:aload           5
	//   15   29:ldc1            #124 <String "longitude">
	//   16   31:dload_3         
	//   17   32:invokevirtual   #122 <Method JSONObject JSONObject.put(String, double)>
	//   18   35:pop             
		return new ci(w.D, jsonobject);
	//   19   36:new             #2   <Class ci>
	//   20   39:dup             
	//   21   40:getstatic       #126 <Field w w.D>
	//   22   43:aload           5
	//   23   45:invokespecial   #102 <Method void ci(w, JSONObject)>
	//   24   48:areturn         
	}

	public static ci a(String s, int i1)
	{
		JSONObject jsonobject = new JSONObject();
	//    0    0:new             #91  <Class JSONObject>
	//    1    3:dup             
	//    2    4:invokespecial   #92  <Method void JSONObject()>
	//    3    7:astore_2        
		jsonobject.put("key", ((Object) (s)));
	//    4    8:aload_2         
	//    5    9:ldc1            #114 <String "key">
	//    6   11:aload_0         
	//    7   12:invokevirtual   #117 <Method JSONObject JSONObject.put(String, Object)>
	//    8   15:pop             
		jsonobject.put("value", i1);
	//    9   16:aload_2         
	//   10   17:ldc1            #129 <String "value">
	//   11   19:iload_1         
	//   12   20:invokevirtual   #132 <Method JSONObject JSONObject.put(String, int)>
	//   13   23:pop             
		return new ci(w.p, jsonobject);
	//   14   24:new             #2   <Class ci>
	//   15   27:dup             
	//   16   28:getstatic       #135 <Field w w.p>
	//   17   31:aload_2         
	//   18   32:invokespecial   #102 <Method void ci(w, JSONObject)>
	//   19   35:areturn         
	}

	public static ci a(String s, AppboyProperties appboyproperties)
	{
		JSONObject jsonobject = new JSONObject();
	//    0    0:new             #91  <Class JSONObject>
	//    1    3:dup             
	//    2    4:invokespecial   #92  <Method void JSONObject()>
	//    3    7:astore_2        
		jsonobject.put("n", ((Object) (StringUtils.checkNotNullOrEmpty(s))));
	//    4    8:aload_2         
	//    5    9:ldc1            #138 <String "n">
	//    6   11:aload_0         
	//    7   12:invokestatic    #144 <Method String StringUtils.checkNotNullOrEmpty(String)>
	//    8   15:invokevirtual   #117 <Method JSONObject JSONObject.put(String, Object)>
	//    9   18:pop             
		if(appboyproperties != null && appboyproperties.size() > 0)
	//*  10   19:aload_1         
	//*  11   20:ifnull          41
	//*  12   23:aload_1         
	//*  13   24:invokevirtual   #150 <Method int AppboyProperties.size()>
	//*  14   27:ifle            41
			jsonobject.put("p", ((Object) (appboyproperties.forJsonPut())));
	//   15   30:aload_2         
	//   16   31:ldc1            #151 <String "p">
	//   17   33:aload_1         
	//   18   34:invokevirtual   #154 <Method JSONObject AppboyProperties.forJsonPut()>
	//   19   37:invokevirtual   #117 <Method JSONObject JSONObject.put(String, Object)>
	//   20   40:pop             
		return new ci(w.b, jsonobject);
	//   21   41:new             #2   <Class ci>
	//   22   44:dup             
	//   23   45:getstatic       #155 <Field w w.b>
	//   24   48:aload_2         
	//   25   49:invokespecial   #102 <Method void ci(w, JSONObject)>
	//   26   52:areturn         
	}

	public static ci a(String s, String s1)
	{
		JSONObject jsonobject = new JSONObject();
	//    0    0:new             #91  <Class JSONObject>
	//    1    3:dup             
	//    2    4:invokespecial   #92  <Method void JSONObject()>
	//    3    7:astore_2        
		jsonobject.put("a", ((Object) (s)));
	//    4    8:aload_2         
	//    5    9:ldc1            #157 <String "a">
	//    6   11:aload_0         
	//    7   12:invokevirtual   #117 <Method JSONObject JSONObject.put(String, Object)>
	//    8   15:pop             
		jsonobject.put("l", ((Object) (s1)));
	//    9   16:aload_2         
	//   10   17:ldc1            #159 <String "l">
	//   11   19:aload_1         
	//   12   20:invokevirtual   #117 <Method JSONObject JSONObject.put(String, Object)>
	//   13   23:pop             
		return new ci(w.y, jsonobject);
	//   14   24:new             #2   <Class ci>
	//   15   27:dup             
	//   16   28:getstatic       #162 <Field w w.y>
	//   17   31:aload_2         
	//   18   32:invokespecial   #102 <Method void ci(w, JSONObject)>
	//   19   35:areturn         
	}

	public static ci a(String s, String s1, double d1, String s2, String s3, String s4)
	{
		w w1 = w.a(s);
	//    0    0:aload_0         
	//    1    1:invokestatic    #166 <Method w w.a(String)>
	//    2    4:astore          7
		if(w1 != null)
	//*   3    6:aload           7
	//*   4    8:ifnull          32
		{
			return new ci(w1, JSONObjectInstrumentation.init(s1), d1, s2, s3, s4);
	//    5   11:new             #2   <Class ci>
	//    6   14:dup             
	//    7   15:aload           7
	//    8   17:aload_1         
	//    9   18:invokestatic    #172 <Method JSONObject JSONObjectInstrumentation.init(String)>
	//   10   21:dload_2         
	//   11   22:aload           4
	//   12   24:aload           5
	//   13   26:aload           6
	//   14   28:invokespecial   #174 <Method void ci(w, JSONObject, double, String, String, String)>
	//   15   31:areturn         
		} else
		{
			s1 = ((String) (new StringBuilder()));
	//   16   32:new             #176 <Class StringBuilder>
	//   17   35:dup             
	//   18   36:invokespecial   #177 <Method void StringBuilder()>
	//   19   39:astore_1        
			((StringBuilder) (s1)).append("Cannot parse eventType ");
	//   20   40:aload_1         
	//   21   41:ldc1            #179 <String "Cannot parse eventType ">
	//   22   43:invokevirtual   #183 <Method StringBuilder StringBuilder.append(String)>
	//   23   46:pop             
			((StringBuilder) (s1)).append(s);
	//   24   47:aload_1         
	//   25   48:aload_0         
	//   26   49:invokevirtual   #183 <Method StringBuilder StringBuilder.append(String)>
	//   27   52:pop             
			throw new IllegalArgumentException(((StringBuilder) (s1)).toString());
	//   28   53:new             #185 <Class IllegalArgumentException>
	//   29   56:dup             
	//   30   57:aload_1         
	//   31   58:invokevirtual   #186 <Method String StringBuilder.toString()>
	//   32   61:invokespecial   #187 <Method void IllegalArgumentException(String)>
	//   33   64:athrow          
		}
	}

	public static ci a(String s, String s1, String s2)
	{
		return new ci(w.u, d(s, s1, s2));
	//    0    0:new             #2   <Class ci>
	//    1    3:dup             
	//    2    4:getstatic       #191 <Field w w.u>
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:invokestatic    #194 <Method JSONObject d(String, String, String)>
	//    7   13:invokespecial   #102 <Method void ci(w, JSONObject)>
	//    8   16:areturn         
	}

	public static ci a(String s, String s1, String s2, InAppMessageFailureType inappmessagefailuretype)
	{
		s = ((String) (b(s, s1, s2, inappmessagefailuretype)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokestatic    #198 <Method JSONObject b(String, String, String, InAppMessageFailureType)>
	//    5    7:astore_0        
		return new ci(w.x, ((JSONObject) (s)));
	//    6    8:new             #2   <Class ci>
	//    7   11:dup             
	//    8   12:getstatic       #201 <Field w w.x>
	//    9   15:aload_0         
	//   10   16:invokespecial   #102 <Method void ci(w, JSONObject)>
	//   11   19:areturn         
	}

	public static ci a(String s, String s1, String s2, MessageButton messagebutton)
	{
		return new ci(w.w, a(s, s1, s2, a(messagebutton), ((InAppMessageFailureType) (null))));
	//    0    0:new             #2   <Class ci>
	//    1    3:dup             
	//    2    4:getstatic       #205 <Field w w.w>
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:aload_3         
	//    7   11:invokestatic    #208 <Method String a(MessageButton)>
	//    8   14:aconst_null     
	//    9   15:invokestatic    #211 <Method JSONObject a(String, String, String, String, InAppMessageFailureType)>
	//   10   18:invokespecial   #102 <Method void ci(w, JSONObject)>
	//   11   21:areturn         
	}

	public static ci a(String s, String s1, String s2, String s3)
	{
		return new ci(w.w, a(s, s1, s2, s3, ((InAppMessageFailureType) (null))));
	//    0    0:new             #2   <Class ci>
	//    1    3:dup             
	//    2    4:getstatic       #205 <Field w w.w>
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:aload_3         
	//    7   11:aconst_null     
	//    8   12:invokestatic    #211 <Method JSONObject a(String, String, String, String, InAppMessageFailureType)>
	//    9   15:invokespecial   #102 <Method void ci(w, JSONObject)>
	//   10   18:areturn         
	}

	public static ci a(String s, String s1, BigDecimal bigdecimal, int i1, AppboyProperties appboyproperties)
	{
		bigdecimal = em.a(bigdecimal);
	//    0    0:aload_2         
	//    1    1:invokestatic    #218 <Method BigDecimal em.a(BigDecimal)>
	//    2    4:astore_2        
		JSONObject jsonobject = new JSONObject();
	//    3    5:new             #91  <Class JSONObject>
	//    4    8:dup             
	//    5    9:invokespecial   #92  <Method void JSONObject()>
	//    6   12:astore          5
		jsonobject.put("pid", ((Object) (s)));
	//    7   14:aload           5
	//    8   16:ldc1            #220 <String "pid">
	//    9   18:aload_0         
	//   10   19:invokevirtual   #117 <Method JSONObject JSONObject.put(String, Object)>
	//   11   22:pop             
		jsonobject.put("c", ((Object) (s1)));
	//   12   23:aload           5
	//   13   25:ldc1            #221 <String "c">
	//   14   27:aload_1         
	//   15   28:invokevirtual   #117 <Method JSONObject JSONObject.put(String, Object)>
	//   16   31:pop             
		jsonobject.put("p", bigdecimal.doubleValue());
	//   17   32:aload           5
	//   18   34:ldc1            #151 <String "p">
	//   19   36:aload_2         
	//   20   37:invokevirtual   #226 <Method double BigDecimal.doubleValue()>
	//   21   40:invokevirtual   #122 <Method JSONObject JSONObject.put(String, double)>
	//   22   43:pop             
		jsonobject.put("q", i1);
	//   23   44:aload           5
	//   24   46:ldc1            #228 <String "q">
	//   25   48:iload_3         
	//   26   49:invokevirtual   #132 <Method JSONObject JSONObject.put(String, int)>
	//   27   52:pop             
		if(appboyproperties != null && appboyproperties.size() > 0)
	//*  28   53:aload           4
	//*  29   55:ifnull          79
	//*  30   58:aload           4
	//*  31   60:invokevirtual   #150 <Method int AppboyProperties.size()>
	//*  32   63:ifle            79
			jsonobject.put("pr", ((Object) (appboyproperties.forJsonPut())));
	//   33   66:aload           5
	//   34   68:ldc1            #230 <String "pr">
	//   35   70:aload           4
	//   36   72:invokevirtual   #154 <Method JSONObject AppboyProperties.forJsonPut()>
	//   37   75:invokevirtual   #117 <Method JSONObject JSONObject.put(String, Object)>
	//   38   78:pop             
		return new ci(w.c, jsonobject);
	//   39   79:new             #2   <Class ci>
	//   40   82:dup             
	//   41   83:getstatic       #232 <Field w w.c>
	//   42   86:aload           5
	//   43   88:invokespecial   #102 <Method void ci(w, JSONObject)>
	//   44   91:areturn         
	}

	public static ci a(String s, String as[])
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
	//    5   10:new             #235 <Class JSONArray>
	//    6   13:dup             
	//    7   14:invokespecial   #236 <Method void JSONArray()>
	//    8   17:astore          4
		if(as != null)
	//*   9   19:aload_1         
	//*  10   20:ifnull          49
		{
			int j1 = as.length;
	//   11   23:aload_1         
	//   12   24:arraylength     
	//   13   25:istore_3        
			for(int i1 = 0; i1 < j1; i1++)
	//*  14   26:iconst_0        
	//*  15   27:istore_2        
	//*  16   28:iload_2         
	//*  17   29:iload_3         
	//*  18   30:icmpge          49
				jsonarray.put(((Object) (as[i1])));
	//   19   33:aload           4
	//   20   35:aload_1         
	//   21   36:iload_2         
	//   22   37:aaload          
	//   23   38:invokevirtual   #239 <Method JSONArray JSONArray.put(Object)>
	//   24   41:pop             

	//   25   42:iload_2         
	//   26   43:iconst_1        
	//   27   44:iadd            
	//   28   45:istore_2        
		}
	//*  29   46:goto            28
		JSONObject jsonobject = new JSONObject();
	//   30   49:new             #91  <Class JSONObject>
	//   31   52:dup             
	//   32   53:invokespecial   #92  <Method void JSONObject()>
	//   33   56:astore          5
		jsonobject.put("key", ((Object) (s)));
	//   34   58:aload           5
	//   35   60:ldc1            #114 <String "key">
	//   36   62:aload_0         
	//   37   63:invokevirtual   #117 <Method JSONObject JSONObject.put(String, Object)>
	//   38   66:pop             
		if(as == null)
	//*  39   67:aload_1         
	//*  40   68:ifnonnull       85
			jsonobject.put("value", JSONObject.NULL);
	//   41   71:aload           5
	//   42   73:ldc1            #129 <String "value">
	//   43   75:getstatic       #243 <Field Object JSONObject.NULL>
	//   44   78:invokevirtual   #117 <Method JSONObject JSONObject.put(String, Object)>
	//   45   81:pop             
		else
	//*  46   82:goto            95
			jsonobject.put("value", ((Object) (jsonarray)));
	//   47   85:aload           5
	//   48   87:ldc1            #129 <String "value">
	//   49   89:aload           4
	//   50   91:invokevirtual   #117 <Method JSONObject JSONObject.put(String, Object)>
	//   51   94:pop             
		return new ci(w.s, jsonobject);
	//   52   95:new             #2   <Class ci>
	//   53   98:dup             
	//   54   99:getstatic       #246 <Field w w.s>
	//   55  102:aload           5
	//   56  104:invokespecial   #102 <Method void ci(w, JSONObject)>
	//   57  107:areturn         
	}

	public static ci a(Throwable throwable, cg cg1, boolean flag)
	{
		cg1 = ((cg) (a(throwable, cg1)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #250 <Method String a(Throwable, cg)>
	//    3    5:astore_1        
		throwable = ((Throwable) (a(throwable)));
	//    4    6:aload_0         
	//    5    7:invokestatic    #253 <Method String a(Throwable)>
	//    6   10:astore_0        
		cg1 = ((cg) (new StringBuilder(((String) (cg1)))));
	//    7   11:new             #176 <Class StringBuilder>
	//    8   14:dup             
	//    9   15:aload_1         
	//   10   16:invokespecial   #254 <Method void StringBuilder(String)>
	//   11   19:astore_1        
		((StringBuilder) (cg1)).append("\n");
	//   12   20:aload_1         
	//   13   21:ldc2            #256 <String "\n">
	//   14   24:invokevirtual   #183 <Method StringBuilder StringBuilder.append(String)>
	//   15   27:pop             
		((StringBuilder) (cg1)).append(((String) (throwable)));
	//   16   28:aload_1         
	//   17   29:aload_0         
	//   18   30:invokevirtual   #183 <Method StringBuilder StringBuilder.append(String)>
	//   19   33:pop             
		throwable = ((Throwable) (new JSONObject()));
	//   20   34:new             #91  <Class JSONObject>
	//   21   37:dup             
	//   22   38:invokespecial   #92  <Method void JSONObject()>
	//   23   41:astore_0        
		((JSONObject) (throwable)).put("e", ((Object) (((StringBuilder) (cg1)).toString())));
	//   24   42:aload_0         
	//   25   43:ldc2            #257 <String "e">
	//   26   46:aload_1         
	//   27   47:invokevirtual   #186 <Method String StringBuilder.toString()>
	//   28   50:invokevirtual   #117 <Method JSONObject JSONObject.put(String, Object)>
	//   29   53:pop             
		if(!flag)
	//*  30   54:iload_2         
	//*  31   55:ifne            67
			((JSONObject) (throwable)).put("nop", true);
	//   32   58:aload_0         
	//   33   59:ldc2            #259 <String "nop">
	//   34   62:iconst_1        
	//   35   63:invokevirtual   #262 <Method JSONObject JSONObject.put(String, boolean)>
	//   36   66:pop             
		return new ci(w.h, ((JSONObject) (throwable)));
	//   37   67:new             #2   <Class ci>
	//   38   70:dup             
	//   39   71:getstatic       #265 <Field w w.h>
	//   40   74:aload_0         
	//   41   75:invokespecial   #102 <Method void ci(w, JSONObject)>
	//   42   78:areturn         
	}

	public static String a(MessageButton messagebutton)
	{
		if(messagebutton != null)
	//*   0    0:aload_0         
	//*   1    1:ifnull          12
			return String.valueOf(messagebutton.getId());
	//    2    4:aload_0         
	//    3    5:invokevirtual   #270 <Method int MessageButton.getId()>
	//    4    8:invokestatic    #276 <Method String String.valueOf(int)>
	//    5   11:areturn         
		else
			return null;
	//    6   12:aconst_null     
	//    7   13:areturn         
	}

	static String a(Throwable throwable)
	{
		Object obj = ((Object) (new StringWriter()));
	//    0    0:new             #279 <Class StringWriter>
	//    1    3:dup             
	//    2    4:invokespecial   #280 <Method void StringWriter()>
	//    3    7:astore_1        
		throwable.printStackTrace(new PrintWriter(((java.io.Writer) (obj))));
	//    4    8:aload_0         
	//    5    9:new             #282 <Class PrintWriter>
	//    6   12:dup             
	//    7   13:aload_1         
	//    8   14:invokespecial   #285 <Method void PrintWriter(java.io.Writer)>
	//    9   17:invokevirtual   #291 <Method void Throwable.printStackTrace(PrintWriter)>
		obj = ((Object) (obj.toString()));
	//   10   20:aload_1         
	//   11   21:invokevirtual   #292 <Method String Object.toString()>
	//   12   24:astore_1        
		throwable = ((Throwable) (obj));
	//   13   25:aload_1         
	//   14   26:astore_0        
		if(((String) (obj)).length() > 5000)
	//*  15   27:aload_1         
	//*  16   28:invokevirtual   #295 <Method int String.length()>
	//*  17   31:sipush          5000
	//*  18   34:icmple          46
			throwable = ((Throwable) (((String) (obj)).substring(0, 5000)));
	//   19   37:aload_1         
	//   20   38:iconst_0        
	//   21   39:sipush          5000
	//   22   42:invokevirtual   #299 <Method String String.substring(int, int)>
	//   23   45:astore_0        
		return ((String) (throwable));
	//   24   46:aload_0         
	//   25   47:areturn         
	}

	static String a(Throwable throwable, cg cg1)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #176 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #177 <Method void StringBuilder()>
	//    3    7:astore_3        
		String s = throwable.toString();
	//    4    8:aload_0         
	//    5    9:invokevirtual   #301 <Method String Throwable.toString()>
	//    6   12:astore_2        
		throwable = ((Throwable) (s));
	//    7   13:aload_2         
	//    8   14:astore_0        
		if(s.length() > 5000)
	//*   9   15:aload_2         
	//*  10   16:invokevirtual   #295 <Method int String.length()>
	//*  11   19:sipush          5000
	//*  12   22:icmple          34
			throwable = ((Throwable) (s.substring(0, 5000)));
	//   13   25:aload_2         
	//   14   26:iconst_0        
	//   15   27:sipush          5000
	//   16   30:invokevirtual   #299 <Method String String.substring(int, int)>
	//   17   33:astore_0        
		stringbuilder.append("exception_class: ");
	//   18   34:aload_3         
	//   19   35:ldc2            #303 <String "exception_class: ">
	//   20   38:invokevirtual   #183 <Method StringBuilder StringBuilder.append(String)>
	//   21   41:pop             
		stringbuilder.append(((String) (throwable)));
	//   22   42:aload_3         
	//   23   43:aload_0         
	//   24   44:invokevirtual   #183 <Method StringBuilder StringBuilder.append(String)>
	//   25   47:pop             
		stringbuilder.append(",");
	//   26   48:aload_3         
	//   27   49:ldc2            #305 <String ",">
	//   28   52:invokevirtual   #183 <Method StringBuilder StringBuilder.append(String)>
	//   29   55:pop             
		stringbuilder.append("session_id: ");
	//   30   56:aload_3         
	//   31   57:ldc2            #307 <String "session_id: ">
	//   32   60:invokevirtual   #183 <Method StringBuilder StringBuilder.append(String)>
	//   33   63:pop             
		if(cg1 != null)
	//*  34   64:aload_1         
	//*  35   65:ifnull          76
			throwable = ((Throwable) (cg1.toString()));
	//   36   68:aload_1         
	//   37   69:invokevirtual   #308 <Method String cg.toString()>
	//   38   72:astore_0        
		else
	//*  39   73:goto            78
			throwable = null;
	//   40   76:aconst_null     
	//   41   77:astore_0        
		stringbuilder.append(((String) (throwable)));
	//   42   78:aload_3         
	//   43   79:aload_0         
	//   44   80:invokevirtual   #183 <Method StringBuilder StringBuilder.append(String)>
	//   45   83:pop             
		return stringbuilder.toString();
	//   46   84:aload_3         
	//   47   85:invokevirtual   #186 <Method String StringBuilder.toString()>
	//   48   88:areturn         
	}

	static JSONObject a(String s, String s1, String s2, String s3, InAppMessageFailureType inappmessagefailuretype)
	{
		JSONObject jsonobject = new JSONObject();
	//    0    0:new             #91  <Class JSONObject>
	//    1    3:dup             
	//    2    4:invokespecial   #92  <Method void JSONObject()>
	//    3    7:astore          5
		if(!StringUtils.isNullOrEmpty(s))
	//*   4    9:aload_0         
	//*   5   10:invokestatic    #312 <Method boolean StringUtils.isNullOrEmpty(String)>
	//*   6   13:ifne            43
		{
			JSONArray jsonarray = new JSONArray();
	//    7   16:new             #235 <Class JSONArray>
	//    8   19:dup             
	//    9   20:invokespecial   #236 <Method void JSONArray()>
	//   10   23:astore          6
			jsonarray.put(((Object) (s)));
	//   11   25:aload           6
	//   12   27:aload_0         
	//   13   28:invokevirtual   #239 <Method JSONArray JSONArray.put(Object)>
	//   14   31:pop             
			jsonobject.put("campaign_ids", ((Object) (jsonarray)));
	//   15   32:aload           5
	//   16   34:ldc2            #314 <String "campaign_ids">
	//   17   37:aload           6
	//   18   39:invokevirtual   #117 <Method JSONObject JSONObject.put(String, Object)>
	//   19   42:pop             
		}
		if(!StringUtils.isNullOrEmpty(s1))
	//*  20   43:aload_1         
	//*  21   44:invokestatic    #312 <Method boolean StringUtils.isNullOrEmpty(String)>
	//*  22   47:ifne            74
		{
			s = ((String) (new JSONArray()));
	//   23   50:new             #235 <Class JSONArray>
	//   24   53:dup             
	//   25   54:invokespecial   #236 <Method void JSONArray()>
	//   26   57:astore_0        
			((JSONArray) (s)).put(((Object) (s1)));
	//   27   58:aload_0         
	//   28   59:aload_1         
	//   29   60:invokevirtual   #239 <Method JSONArray JSONArray.put(Object)>
	//   30   63:pop             
			jsonobject.put("card_ids", ((Object) (s)));
	//   31   64:aload           5
	//   32   66:ldc2            #316 <String "card_ids">
	//   33   69:aload_0         
	//   34   70:invokevirtual   #117 <Method JSONObject JSONObject.put(String, Object)>
	//   35   73:pop             
		}
		if(!StringUtils.isNullOrEmpty(s2))
	//*  36   74:aload_2         
	//*  37   75:invokestatic    #312 <Method boolean StringUtils.isNullOrEmpty(String)>
	//*  38   78:ifne            105
		{
			s = ((String) (new JSONArray()));
	//   39   81:new             #235 <Class JSONArray>
	//   40   84:dup             
	//   41   85:invokespecial   #236 <Method void JSONArray()>
	//   42   88:astore_0        
			((JSONArray) (s)).put(((Object) (s2)));
	//   43   89:aload_0         
	//   44   90:aload_2         
	//   45   91:invokevirtual   #239 <Method JSONArray JSONArray.put(Object)>
	//   46   94:pop             
			jsonobject.put("trigger_ids", ((Object) (s)));
	//   47   95:aload           5
	//   48   97:ldc2            #318 <String "trigger_ids">
	//   49  100:aload_0         
	//   50  101:invokevirtual   #117 <Method JSONObject JSONObject.put(String, Object)>
	//   51  104:pop             
		}
		if(!StringUtils.isNullOrEmpty(s3))
	//*  52  105:aload_3         
	//*  53  106:invokestatic    #312 <Method boolean StringUtils.isNullOrEmpty(String)>
	//*  54  109:ifne            122
			jsonobject.put("bid", ((Object) (s3)));
	//   55  112:aload           5
	//   56  114:ldc2            #320 <String "bid">
	//   57  117:aload_3         
	//   58  118:invokevirtual   #117 <Method JSONObject JSONObject.put(String, Object)>
	//   59  121:pop             
		if(inappmessagefailuretype != null)
	//*  60  122:aload           4
	//*  61  124:ifnull          150
		{
			s = inappmessagefailuretype.forJsonPut();
	//   62  127:aload           4
	//   63  129:invokevirtual   #324 <Method String InAppMessageFailureType.forJsonPut()>
	//   64  132:astore_0        
			if(!StringUtils.isNullOrEmpty(s))
	//*  65  133:aload_0         
	//*  66  134:invokestatic    #312 <Method boolean StringUtils.isNullOrEmpty(String)>
	//*  67  137:ifne            150
				jsonobject.put("error_code", ((Object) (s)));
	//   68  140:aload           5
	//   69  142:ldc2            #326 <String "error_code">
	//   70  145:aload_0         
	//   71  146:invokevirtual   #117 <Method JSONObject JSONObject.put(String, Object)>
	//   72  149:pop             
		}
		return jsonobject;
	//   73  150:aload           5
	//   74  152:areturn         
	}

	public static ci b(String s)
	{
		JSONObject jsonobject = new JSONObject();
	//    0    0:new             #91  <Class JSONObject>
	//    1    3:dup             
	//    2    4:invokespecial   #92  <Method void JSONObject()>
	//    3    7:astore_1        
		jsonobject.put("cid", ((Object) (s)));
	//    4    8:aload_1         
	//    5    9:ldc2            #329 <String "cid">
	//    6   12:aload_0         
	//    7   13:invokevirtual   #117 <Method JSONObject JSONObject.put(String, Object)>
	//    8   16:pop             
		return new ci(w.e, jsonobject);
	//    9   17:new             #2   <Class ci>
	//   10   20:dup             
	//   11   21:getstatic       #331 <Field w w.e>
	//   12   24:aload_1         
	//   13   25:invokespecial   #102 <Method void ci(w, JSONObject)>
	//   14   28:areturn         
	}

	public static ci b(String s, String s1)
	{
		JSONObject jsonobject = new JSONObject();
	//    0    0:new             #91  <Class JSONObject>
	//    1    3:dup             
	//    2    4:invokespecial   #92  <Method void JSONObject()>
	//    3    7:astore_2        
		jsonobject.put("cid", ((Object) (s)));
	//    4    8:aload_2         
	//    5    9:ldc2            #329 <String "cid">
	//    6   12:aload_0         
	//    7   13:invokevirtual   #117 <Method JSONObject JSONObject.put(String, Object)>
	//    8   16:pop             
		jsonobject.put("a", ((Object) (s1)));
	//    9   17:aload_2         
	//   10   18:ldc1            #157 <String "a">
	//   11   20:aload_1         
	//   12   21:invokevirtual   #117 <Method JSONObject JSONObject.put(String, Object)>
	//   13   24:pop             
		return new ci(w.d, jsonobject);
	//   14   25:new             #2   <Class ci>
	//   15   28:dup             
	//   16   29:getstatic       #333 <Field w w.d>
	//   17   32:aload_2         
	//   18   33:invokespecial   #102 <Method void ci(w, JSONObject)>
	//   19   36:areturn         
	}

	public static ci b(String s, String s1, String s2)
	{
		return new ci(w.t, d(s, s1, s2));
	//    0    0:new             #2   <Class ci>
	//    1    3:dup             
	//    2    4:getstatic       #336 <Field w w.t>
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:invokestatic    #194 <Method JSONObject d(String, String, String)>
	//    7   13:invokespecial   #102 <Method void ci(w, JSONObject)>
	//    8   16:areturn         
	}

	static JSONObject b(String s, String s1, String s2, InAppMessageFailureType inappmessagefailuretype)
	{
		return a(s, s1, s2, ((String) (null)), inappmessagefailuretype);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aconst_null     
	//    4    4:aload_3         
	//    5    5:invokestatic    #211 <Method JSONObject a(String, String, String, String, InAppMessageFailureType)>
	//    6    8:areturn         
	}

	public static ci c(String s)
	{
		JSONObject jsonobject = new JSONObject();
	//    0    0:new             #91  <Class JSONObject>
	//    1    3:dup             
	//    2    4:invokespecial   #92  <Method void JSONObject()>
	//    3    7:astore_1        
		JSONArray jsonarray = new JSONArray();
	//    4    8:new             #235 <Class JSONArray>
	//    5   11:dup             
	//    6   12:invokespecial   #236 <Method void JSONArray()>
	//    7   15:astore_2        
		jsonarray.put(((Object) (s)));
	//    8   16:aload_2         
	//    9   17:aload_0         
	//   10   18:invokevirtual   #239 <Method JSONArray JSONArray.put(Object)>
	//   11   21:pop             
		jsonobject.put("ids", ((Object) (jsonarray)));
	//   12   22:aload_1         
	//   13   23:ldc2            #338 <String "ids">
	//   14   26:aload_2         
	//   15   27:invokevirtual   #117 <Method JSONObject JSONObject.put(String, Object)>
	//   16   30:pop             
		return new ci(w.i, jsonobject);
	//   17   31:new             #2   <Class ci>
	//   18   34:dup             
	//   19   35:getstatic       #341 <Field w w.i>
	//   20   38:aload_1         
	//   21   39:invokespecial   #102 <Method void ci(w, JSONObject)>
	//   22   42:areturn         
	}

	public static ci c(String s, String s1)
	{
		JSONObject jsonobject = new JSONObject();
	//    0    0:new             #91  <Class JSONObject>
	//    1    3:dup             
	//    2    4:invokespecial   #92  <Method void JSONObject()>
	//    3    7:astore_2        
		jsonobject.put("cid", ((Object) (s)));
	//    4    8:aload_2         
	//    5    9:ldc2            #329 <String "cid">
	//    6   12:aload_0         
	//    7   13:invokevirtual   #117 <Method JSONObject JSONObject.put(String, Object)>
	//    8   16:pop             
		jsonobject.put("a", ((Object) (s1)));
	//    9   17:aload_2         
	//   10   18:ldc1            #157 <String "a">
	//   11   20:aload_1         
	//   12   21:invokevirtual   #117 <Method JSONObject JSONObject.put(String, Object)>
	//   13   24:pop             
		return new ci(w.f, jsonobject);
	//   14   25:new             #2   <Class ci>
	//   15   28:dup             
	//   16   29:getstatic       #343 <Field w w.f>
	//   17   32:aload_2         
	//   18   33:invokespecial   #102 <Method void ci(w, JSONObject)>
	//   19   36:areturn         
	}

	public static ci c(String s, String s1, String s2)
	{
		return new ci(w.v, d(s, s1, s2));
	//    0    0:new             #2   <Class ci>
	//    1    3:dup             
	//    2    4:getstatic       #346 <Field w w.v>
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:invokestatic    #194 <Method JSONObject d(String, String, String)>
	//    7   13:invokespecial   #102 <Method void ci(w, JSONObject)>
	//    8   16:areturn         
	}

	public static ci d(String s)
	{
		JSONObject jsonobject = new JSONObject();
	//    0    0:new             #91  <Class JSONObject>
	//    1    3:dup             
	//    2    4:invokespecial   #92  <Method void JSONObject()>
	//    3    7:astore_1        
		JSONArray jsonarray = new JSONArray();
	//    4    8:new             #235 <Class JSONArray>
	//    5   11:dup             
	//    6   12:invokespecial   #236 <Method void JSONArray()>
	//    7   15:astore_2        
		jsonarray.put(((Object) (s)));
	//    8   16:aload_2         
	//    9   17:aload_0         
	//   10   18:invokevirtual   #239 <Method JSONArray JSONArray.put(Object)>
	//   11   21:pop             
		jsonobject.put("ids", ((Object) (jsonarray)));
	//   12   22:aload_1         
	//   13   23:ldc2            #338 <String "ids">
	//   14   26:aload_2         
	//   15   27:invokevirtual   #117 <Method JSONObject JSONObject.put(String, Object)>
	//   16   30:pop             
		return new ci(w.j, jsonobject);
	//   17   31:new             #2   <Class ci>
	//   18   34:dup             
	//   19   35:getstatic       #349 <Field w w.j>
	//   20   38:aload_1         
	//   21   39:invokespecial   #102 <Method void ci(w, JSONObject)>
	//   22   42:areturn         
	}

	public static ci d(String s, String s1)
	{
		JSONObject jsonobject = new JSONObject();
	//    0    0:new             #91  <Class JSONObject>
	//    1    3:dup             
	//    2    4:invokespecial   #92  <Method void JSONObject()>
	//    3    7:astore_2        
		jsonobject.put("geo_id", ((Object) (s)));
	//    4    8:aload_2         
	//    5    9:ldc2            #351 <String "geo_id">
	//    6   12:aload_0         
	//    7   13:invokevirtual   #117 <Method JSONObject JSONObject.put(String, Object)>
	//    8   16:pop             
		jsonobject.put("event_type", ((Object) (s1)));
	//    9   17:aload_2         
	//   10   18:ldc2            #353 <String "event_type">
	//   11   21:aload_1         
	//   12   22:invokevirtual   #117 <Method JSONObject JSONObject.put(String, Object)>
	//   13   25:pop             
		return new ci(w.k, jsonobject);
	//   14   26:new             #2   <Class ci>
	//   15   29:dup             
	//   16   30:getstatic       #356 <Field w w.k>
	//   17   33:aload_2         
	//   18   34:invokespecial   #102 <Method void ci(w, JSONObject)>
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
	//    5    5:invokestatic    #211 <Method JSONObject a(String, String, String, String, InAppMessageFailureType)>
	//    6    8:areturn         
	}

	public static ci e(String s)
	{
		JSONObject jsonobject = new JSONObject();
	//    0    0:new             #91  <Class JSONObject>
	//    1    3:dup             
	//    2    4:invokespecial   #92  <Method void JSONObject()>
	//    3    7:astore_1        
		JSONArray jsonarray = new JSONArray();
	//    4    8:new             #235 <Class JSONArray>
	//    5   11:dup             
	//    6   12:invokespecial   #236 <Method void JSONArray()>
	//    7   15:astore_2        
		jsonarray.put(((Object) (s)));
	//    8   16:aload_2         
	//    9   17:aload_0         
	//   10   18:invokevirtual   #239 <Method JSONArray JSONArray.put(Object)>
	//   11   21:pop             
		jsonobject.put("ids", ((Object) (jsonarray)));
	//   12   22:aload_1         
	//   13   23:ldc2            #338 <String "ids">
	//   14   26:aload_2         
	//   15   27:invokevirtual   #117 <Method JSONObject JSONObject.put(String, Object)>
	//   16   30:pop             
		return new ci(w.m, jsonobject);
	//   17   31:new             #2   <Class ci>
	//   18   34:dup             
	//   19   35:getstatic       #359 <Field w w.m>
	//   20   38:aload_1         
	//   21   39:invokespecial   #102 <Method void ci(w, JSONObject)>
	//   22   42:areturn         
	}

	public static ci e(String s, String s1)
	{
		JSONObject jsonobject = new JSONObject();
	//    0    0:new             #91  <Class JSONObject>
	//    1    3:dup             
	//    2    4:invokespecial   #92  <Method void JSONObject()>
	//    3    7:astore_2        
		jsonobject.put("key", ((Object) (s)));
	//    4    8:aload_2         
	//    5    9:ldc1            #114 <String "key">
	//    6   11:aload_0         
	//    7   12:invokevirtual   #117 <Method JSONObject JSONObject.put(String, Object)>
	//    8   15:pop             
		jsonobject.put("value", ((Object) (s1)));
	//    9   16:aload_2         
	//   10   17:ldc1            #129 <String "value">
	//   11   19:aload_1         
	//   12   20:invokevirtual   #117 <Method JSONObject JSONObject.put(String, Object)>
	//   13   23:pop             
		return new ci(w.q, jsonobject);
	//   14   24:new             #2   <Class ci>
	//   15   27:dup             
	//   16   28:getstatic       #361 <Field w w.q>
	//   17   31:aload_2         
	//   18   32:invokespecial   #102 <Method void ci(w, JSONObject)>
	//   19   35:areturn         
	}

	public static ci f(String s)
	{
		JSONObject jsonobject = new JSONObject();
	//    0    0:new             #91  <Class JSONObject>
	//    1    3:dup             
	//    2    4:invokespecial   #92  <Method void JSONObject()>
	//    3    7:astore_1        
		JSONArray jsonarray = new JSONArray();
	//    4    8:new             #235 <Class JSONArray>
	//    5   11:dup             
	//    6   12:invokespecial   #236 <Method void JSONArray()>
	//    7   15:astore_2        
		jsonarray.put(((Object) (s)));
	//    8   16:aload_2         
	//    9   17:aload_0         
	//   10   18:invokevirtual   #239 <Method JSONArray JSONArray.put(Object)>
	//   11   21:pop             
		jsonobject.put("ids", ((Object) (jsonarray)));
	//   12   22:aload_1         
	//   13   23:ldc2            #338 <String "ids">
	//   14   26:aload_2         
	//   15   27:invokevirtual   #117 <Method JSONObject JSONObject.put(String, Object)>
	//   16   30:pop             
		return new ci(w.n, jsonobject);
	//   17   31:new             #2   <Class ci>
	//   18   34:dup             
	//   19   35:getstatic       #363 <Field w w.n>
	//   20   38:aload_1         
	//   21   39:invokespecial   #102 <Method void ci(w, JSONObject)>
	//   22   42:areturn         
	}

	public static ci f(String s, String s1)
	{
		JSONObject jsonobject = new JSONObject();
	//    0    0:new             #91  <Class JSONObject>
	//    1    3:dup             
	//    2    4:invokespecial   #92  <Method void JSONObject()>
	//    3    7:astore_2        
		jsonobject.put("key", ((Object) (s)));
	//    4    8:aload_2         
	//    5    9:ldc1            #114 <String "key">
	//    6   11:aload_0         
	//    7   12:invokevirtual   #117 <Method JSONObject JSONObject.put(String, Object)>
	//    8   15:pop             
		jsonobject.put("value", ((Object) (s1)));
	//    9   16:aload_2         
	//   10   17:ldc1            #129 <String "value">
	//   11   19:aload_1         
	//   12   20:invokevirtual   #117 <Method JSONObject JSONObject.put(String, Object)>
	//   13   23:pop             
		return new ci(w.r, jsonobject);
	//   14   24:new             #2   <Class ci>
	//   15   27:dup             
	//   16   28:getstatic       #366 <Field w w.r>
	//   17   31:aload_2         
	//   18   32:invokespecial   #102 <Method void ci(w, JSONObject)>
	//   19   35:areturn         
	}

	public static cc g(String s, String s1)
	{
		s = ((String) (JSONObjectInstrumentation.init(s)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #172 <Method JSONObject JSONObjectInstrumentation.init(String)>
	//    2    4:astore_0        
		String s2 = ((JSONObject) (s)).getString("name");
	//    3    5:aload_0         
	//    4    6:ldc2            #369 <String "name">
	//    5    9:invokevirtual   #372 <Method String JSONObject.getString(String)>
	//    6   12:astore_2        
		w w1 = w.a(s2);
	//    7   13:aload_2         
	//    8   14:invokestatic    #166 <Method w w.a(String)>
	//    9   17:astore_3        
		if(w1 != null)
	//*  10   18:aload_3         
	//*  11   19:ifnull          62
		{
			return ((cc) (new ci(w1, ((JSONObject) (s)).getJSONObject("data"), ((JSONObject) (s)).getDouble("time"), s1, ((JSONObject) (s)).optString("user_id", ((String) (null))), ((JSONObject) (s)).optString("session_id", ((String) (null))))));
	//   12   22:new             #2   <Class ci>
	//   13   25:dup             
	//   14   26:aload_3         
	//   15   27:aload_0         
	//   16   28:ldc2            #374 <String "data">
	//   17   31:invokevirtual   #377 <Method JSONObject JSONObject.getJSONObject(String)>
	//   18   34:aload_0         
	//   19   35:ldc2            #379 <String "time">
	//   20   38:invokevirtual   #383 <Method double JSONObject.getDouble(String)>
	//   21   41:aload_1         
	//   22   42:aload_0         
	//   23   43:ldc2            #385 <String "user_id">
	//   24   46:aconst_null     
	//   25   47:invokevirtual   #389 <Method String JSONObject.optString(String, String)>
	//   26   50:aload_0         
	//   27   51:ldc2            #391 <String "session_id">
	//   28   54:aconst_null     
	//   29   55:invokevirtual   #389 <Method String JSONObject.optString(String, String)>
	//   30   58:invokespecial   #174 <Method void ci(w, JSONObject, double, String, String, String)>
	//   31   61:areturn         
		} else
		{
			s1 = ((String) (new StringBuilder()));
	//   32   62:new             #176 <Class StringBuilder>
	//   33   65:dup             
	//   34   66:invokespecial   #177 <Method void StringBuilder()>
	//   35   69:astore_1        
			((StringBuilder) (s1)).append("Cannot parse eventType ");
	//   36   70:aload_1         
	//   37   71:ldc1            #179 <String "Cannot parse eventType ">
	//   38   73:invokevirtual   #183 <Method StringBuilder StringBuilder.append(String)>
	//   39   76:pop             
			((StringBuilder) (s1)).append(s2);
	//   40   77:aload_1         
	//   41   78:aload_2         
	//   42   79:invokevirtual   #183 <Method StringBuilder StringBuilder.append(String)>
	//   43   82:pop             
			((StringBuilder) (s1)).append(". Event json: ");
	//   44   83:aload_1         
	//   45   84:ldc2            #393 <String ". Event json: ">
	//   46   87:invokevirtual   #183 <Method StringBuilder StringBuilder.append(String)>
	//   47   90:pop             
			((StringBuilder) (s1)).append(((Object) (s)));
	//   48   91:aload_1         
	//   49   92:aload_0         
	//   50   93:invokevirtual   #396 <Method StringBuilder StringBuilder.append(Object)>
	//   51   96:pop             
			throw new IllegalArgumentException(((StringBuilder) (s1)).toString());
	//   52   97:new             #185 <Class IllegalArgumentException>
	//   53  100:dup             
	//   54  101:aload_1         
	//   55  102:invokevirtual   #186 <Method String StringBuilder.toString()>
	//   56  105:invokespecial   #187 <Method void IllegalArgumentException(String)>
	//   57  108:athrow          
		}
	}

	public static ci g(String s)
	{
		JSONObject jsonobject = new JSONObject();
	//    0    0:new             #91  <Class JSONObject>
	//    1    3:dup             
	//    2    4:invokespecial   #92  <Method void JSONObject()>
	//    3    7:astore_1        
		JSONArray jsonarray = new JSONArray();
	//    4    8:new             #235 <Class JSONArray>
	//    5   11:dup             
	//    6   12:invokespecial   #236 <Method void JSONArray()>
	//    7   15:astore_2        
		jsonarray.put(((Object) (s)));
	//    8   16:aload_2         
	//    9   17:aload_0         
	//   10   18:invokevirtual   #239 <Method JSONArray JSONArray.put(Object)>
	//   11   21:pop             
		jsonobject.put("ids", ((Object) (jsonarray)));
	//   12   22:aload_1         
	//   13   23:ldc2            #338 <String "ids">
	//   14   26:aload_2         
	//   15   27:invokevirtual   #117 <Method JSONObject JSONObject.put(String, Object)>
	//   16   30:pop             
		return new ci(w.l, jsonobject);
	//   17   31:new             #2   <Class ci>
	//   18   34:dup             
	//   19   35:getstatic       #398 <Field w w.l>
	//   20   38:aload_1         
	//   21   39:invokespecial   #102 <Method void ci(w, JSONObject)>
	//   22   42:areturn         
	}

	public static ci h(String s)
	{
		JSONObject jsonobject = new JSONObject();
	//    0    0:new             #91  <Class JSONObject>
	//    1    3:dup             
	//    2    4:invokespecial   #92  <Method void JSONObject()>
	//    3    7:astore_1        
		JSONArray jsonarray = new JSONArray();
	//    4    8:new             #235 <Class JSONArray>
	//    5   11:dup             
	//    6   12:invokespecial   #236 <Method void JSONArray()>
	//    7   15:astore_2        
		jsonarray.put(((Object) (s)));
	//    8   16:aload_2         
	//    9   17:aload_0         
	//   10   18:invokevirtual   #239 <Method JSONArray JSONArray.put(Object)>
	//   11   21:pop             
		jsonobject.put("ids", ((Object) (jsonarray)));
	//   12   22:aload_1         
	//   13   23:ldc2            #338 <String "ids">
	//   14   26:aload_2         
	//   15   27:invokevirtual   #117 <Method JSONObject JSONObject.put(String, Object)>
	//   16   30:pop             
		return new ci(w.o, jsonobject);
	//   17   31:new             #2   <Class ci>
	//   18   34:dup             
	//   19   35:getstatic       #401 <Field w w.o>
	//   20   38:aload_1         
	//   21   39:invokespecial   #102 <Method void ci(w, JSONObject)>
	//   22   42:areturn         
	}

	public static ci i()
	{
		return i("content_cards_displayed");
	//    0    0:ldc2            #404 <String "content_cards_displayed">
	//    1    3:invokestatic    #406 <Method ci i(String)>
	//    2    6:areturn         
	}

	public static ci i(String s)
	{
		JSONObject jsonobject = new JSONObject();
	//    0    0:new             #91  <Class JSONObject>
	//    1    3:dup             
	//    2    4:invokespecial   #92  <Method void JSONObject()>
	//    3    7:astore_1        
		jsonobject.put("n", ((Object) (s)));
	//    4    8:aload_1         
	//    5    9:ldc1            #138 <String "n">
	//    6   11:aload_0         
	//    7   12:invokevirtual   #117 <Method JSONObject JSONObject.put(String, Object)>
	//    8   15:pop             
		return new ci(w.g, jsonobject);
	//    9   16:new             #2   <Class ci>
	//   10   19:dup             
	//   11   20:getstatic       #408 <Field w w.g>
	//   12   23:aload_1         
	//   13   24:invokespecial   #102 <Method void ci(w, JSONObject)>
	//   14   27:areturn         
	}

	public static ci j()
	{
		return i("feed_displayed");
	//    0    0:ldc2            #410 <String "feed_displayed">
	//    1    3:invokestatic    #406 <Method ci i(String)>
	//    2    6:areturn         
	}

	public static ci j(String s)
	{
		JSONObject jsonobject = new JSONObject();
	//    0    0:new             #91  <Class JSONObject>
	//    1    3:dup             
	//    2    4:invokespecial   #92  <Method void JSONObject()>
	//    3    7:astore_1        
		jsonobject.put("cid", ((Object) (s)));
	//    4    8:aload_1         
	//    5    9:ldc2            #329 <String "cid">
	//    6   12:aload_0         
	//    7   13:invokevirtual   #117 <Method JSONObject JSONObject.put(String, Object)>
	//    8   16:pop             
		return new ci(w.C, jsonobject);
	//    9   17:new             #2   <Class ci>
	//   10   20:dup             
	//   11   21:getstatic       #413 <Field w w.C>
	//   12   24:aload_1         
	//   13   25:invokespecial   #102 <Method void ci(w, JSONObject)>
	//   14   28:areturn         
	}

	public static ci k()
	{
		return i("feedback_displayed");
	//    0    0:ldc2            #416 <String "feedback_displayed">
	//    1    3:invokestatic    #406 <Method ci i(String)>
	//    2    6:areturn         
	}

	public static ci k(String s)
	{
		JSONObject jsonobject = new JSONObject();
	//    0    0:new             #91  <Class JSONObject>
	//    1    3:dup             
	//    2    4:invokespecial   #92  <Method void JSONObject()>
	//    3    7:astore_1        
		jsonobject.put("key", ((Object) (s)));
	//    4    8:aload_1         
	//    5    9:ldc1            #114 <String "key">
	//    6   11:aload_0         
	//    7   12:invokevirtual   #117 <Method JSONObject JSONObject.put(String, Object)>
	//    8   15:pop             
		return new ci(w.E, jsonobject);
	//    9   16:new             #2   <Class ci>
	//   10   19:dup             
	//   11   20:getstatic       #420 <Field w w.E>
	//   12   23:aload_1         
	//   13   24:invokespecial   #102 <Method void ci(w, JSONObject)>
	//   14   27:areturn         
	}

	public static ci l()
	{
		JSONObject jsonobject = new JSONObject();
	//    0    0:new             #91  <Class JSONObject>
	//    1    3:dup             
	//    2    4:invokespecial   #92  <Method void JSONObject()>
	//    3    7:astore_0        
		return new ci(w.z, jsonobject);
	//    4    8:new             #2   <Class ci>
	//    5   11:dup             
	//    6   12:getstatic       #423 <Field w w.z>
	//    7   15:aload_0         
	//    8   16:invokespecial   #102 <Method void ci(w, JSONObject)>
	//    9   19:areturn         
	}

	public double a()
	{
		return d;
	//    0    0:aload_0         
	//    1    1:getfield        #71  <Field double d>
	//    2    4:dreturn         
	}

	public void a(cg cg1)
	{
		if(g == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #61  <Field cg g>
	//*   2    4:ifnonnull       13
		{
			g = cg1;
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:putfield        #61  <Field cg g>
			return;
	//    6   12:return          
		} else
		{
			String s = a;
	//    7   13:getstatic       #29  <Field String a>
	//    8   16:astore_2        
			StringBuilder stringbuilder = new StringBuilder();
	//    9   17:new             #176 <Class StringBuilder>
	//   10   20:dup             
	//   11   21:invokespecial   #177 <Method void StringBuilder()>
	//   12   24:astore_3        
			stringbuilder.append("Session id can only be set once. Doing nothing. Given session id: ");
	//   13   25:aload_3         
	//   14   26:ldc2            #426 <String "Session id can only be set once. Doing nothing. Given session id: ">
	//   15   29:invokevirtual   #183 <Method StringBuilder StringBuilder.append(String)>
	//   16   32:pop             
			stringbuilder.append(((Object) (cg1)));
	//   17   33:aload_3         
	//   18   34:aload_1         
	//   19   35:invokevirtual   #396 <Method StringBuilder StringBuilder.append(Object)>
	//   20   38:pop             
			AppboyLogger.d(s, stringbuilder.toString());
	//   21   39:aload_2         
	//   22   40:aload_3         
	//   23   41:invokevirtual   #186 <Method String StringBuilder.toString()>
	//   24   44:invokestatic    #429 <Method int AppboyLogger.d(String, String)>
	//   25   47:pop             
			return;
	//   26   48:return          
		}
	}

	public void a(String s)
	{
		if(f == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #59  <Field String f>
	//*   2    4:ifnonnull       13
		{
			f = s;
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:putfield        #59  <Field String f>
			return;
	//    6   12:return          
		} else
		{
			String s1 = a;
	//    7   13:getstatic       #29  <Field String a>
	//    8   16:astore_2        
			StringBuilder stringbuilder = new StringBuilder();
	//    9   17:new             #176 <Class StringBuilder>
	//   10   20:dup             
	//   11   21:invokespecial   #177 <Method void StringBuilder()>
	//   12   24:astore_3        
			stringbuilder.append("User id can only be set once. Doing nothing. Given user id: ");
	//   13   25:aload_3         
	//   14   26:ldc2            #431 <String "User id can only be set once. Doing nothing. Given user id: ">
	//   15   29:invokevirtual   #183 <Method StringBuilder StringBuilder.append(String)>
	//   16   32:pop             
			stringbuilder.append(s);
	//   17   33:aload_3         
	//   18   34:aload_1         
	//   19   35:invokevirtual   #183 <Method StringBuilder StringBuilder.append(String)>
	//   20   38:pop             
			AppboyLogger.d(s1, stringbuilder.toString());
	//   21   39:aload_2         
	//   22   40:aload_3         
	//   23   41:invokevirtual   #186 <Method String StringBuilder.toString()>
	//   24   44:invokestatic    #429 <Method int AppboyLogger.d(String, String)>
	//   25   47:pop             
			return;
	//   26   48:return          
		}
	}

	public w b()
	{
		return b;
	//    0    0:aload_0         
	//    1    1:getfield        #67  <Field w b>
	//    2    4:areturn         
	}

	public JSONObject c()
	{
		return c;
	//    0    0:aload_0         
	//    1    1:getfield        #69  <Field JSONObject c>
	//    2    4:areturn         
	}

	public String d()
	{
		return e;
	//    0    0:aload_0         
	//    1    1:getfield        #73  <Field String e>
	//    2    4:areturn         
	}

	public String e()
	{
		JSONObject jsonobject = m();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #434 <Method JSONObject m()>
	//    2    4:astore_1        
		if(!(jsonobject instanceof JSONObject))
	//*   3    5:aload_1         
	//*   4    6:instanceof      #91  <Class JSONObject>
	//*   5    9:ifne            17
			return jsonobject.toString();
	//    6   12:aload_1         
	//    7   13:invokevirtual   #435 <Method String JSONObject.toString()>
	//    8   16:areturn         
		else
			return JSONObjectInstrumentation.toString((JSONObject)jsonobject);
	//    9   17:aload_1         
	//   10   18:checkcast       #91  <Class JSONObject>
	//   11   21:invokestatic    #438 <Method String JSONObjectInstrumentation.toString(JSONObject)>
	//   12   24:areturn         
	}

	public boolean equals(Object obj)
	{
		if(this == obj)
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:if_acmpne       7
			return true;
	//    3    5:iconst_1        
	//    4    6:ireturn         
		if(obj != null && ((Object)this).getClass() == obj.getClass())
	//*   5    7:aload_1         
	//*   6    8:ifnull          42
	//*   7   11:aload_0         
	//*   8   12:invokevirtual   #444 <Method Class Object.getClass()>
	//*   9   15:aload_1         
	//*  10   16:invokevirtual   #444 <Method Class Object.getClass()>
	//*  11   19:if_acmpeq       25
	//*  12   22:goto            42
		{
			obj = ((Object) ((ci)obj));
	//   13   25:aload_1         
	//   14   26:checkcast       #2   <Class ci>
	//   15   29:astore_1        
			return e.equals(((Object) (((ci) (obj)).e)));
	//   16   30:aload_0         
	//   17   31:getfield        #73  <Field String e>
	//   18   34:aload_1         
	//   19   35:getfield        #73  <Field String e>
	//   20   38:invokevirtual   #446 <Method boolean String.equals(Object)>
	//   21   41:ireturn         
		} else
		{
			return false;
	//   22   42:iconst_0        
	//   23   43:ireturn         
		}
	}

	public String f()
	{
		return f;
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field String f>
	//    2    4:areturn         
	}

	public Object forJsonPut()
	{
		return ((Object) (m()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #434 <Method JSONObject m()>
	//    2    4:areturn         
	}

	public cg g()
	{
		return g;
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field cg g>
	//    2    4:areturn         
	}

	public boolean h()
	{
		w w1 = b;
	//    0    0:aload_0         
	//    1    1:getfield        #67  <Field w b>
	//    2    4:astore_3        
		w w2 = w.h;
	//    3    5:getstatic       #265 <Field w w.h>
	//    4    8:astore          4
		boolean flag1 = false;
	//    5   10:iconst_0        
	//    6   11:istore_2        
		boolean flag = flag1;
	//    7   12:iload_2         
	//    8   13:istore_1        
		if(w1 == w2)
	//*   9   14:aload_3         
	//*  10   15:aload           4
	//*  11   17:if_acmpne       38
		{
			flag = flag1;
	//   12   20:iload_2         
	//   13   21:istore_1        
			if(c.optBoolean("nop", false))
	//*  14   22:aload_0         
	//*  15   23:getfield        #69  <Field JSONObject c>
	//*  16   26:ldc2            #259 <String "nop">
	//*  17   29:iconst_0        
	//*  18   30:invokevirtual   #452 <Method boolean JSONObject.optBoolean(String, boolean)>
	//*  19   33:ifeq            38
				flag = true;
	//   20   36:iconst_1        
	//   21   37:istore_1        
		}
		return flag;
	//   22   38:iload_1         
	//   23   39:ireturn         
	}

	public int hashCode()
	{
		return e.hashCode();
	//    0    0:aload_0         
	//    1    1:getfield        #73  <Field String e>
	//    2    4:invokevirtual   #455 <Method int String.hashCode()>
	//    3    7:ireturn         
	}

	public JSONObject m()
	{
		JSONObject jsonobject = new JSONObject();
	//    0    0:new             #91  <Class JSONObject>
	//    1    3:dup             
	//    2    4:invokespecial   #92  <Method void JSONObject()>
	//    3    7:astore_1        
		jsonobject.put("name", ((Object) (b.a())));
	//    4    8:aload_1         
	//    5    9:ldc2            #369 <String "name">
	//    6   12:aload_0         
	//    7   13:getfield        #67  <Field w b>
	//    8   16:invokevirtual   #65  <Method String w.a()>
	//    9   19:invokevirtual   #117 <Method JSONObject JSONObject.put(String, Object)>
	//   10   22:pop             
		jsonobject.put("data", ((Object) (c)));
	//   11   23:aload_1         
	//   12   24:ldc2            #374 <String "data">
	//   13   27:aload_0         
	//   14   28:getfield        #69  <Field JSONObject c>
	//   15   31:invokevirtual   #117 <Method JSONObject JSONObject.put(String, Object)>
	//   16   34:pop             
		jsonobject.put("time", d);
	//   17   35:aload_1         
	//   18   36:ldc2            #379 <String "time">
	//   19   39:aload_0         
	//   20   40:getfield        #71  <Field double d>
	//   21   43:invokevirtual   #122 <Method JSONObject JSONObject.put(String, double)>
	//   22   46:pop             
		if(!StringUtils.isNullOrEmpty(f))
	//*  23   47:aload_0         
	//*  24   48:getfield        #59  <Field String f>
	//*  25   51:invokestatic    #312 <Method boolean StringUtils.isNullOrEmpty(String)>
	//*  26   54:ifne            69
			jsonobject.put("user_id", ((Object) (f)));
	//   27   57:aload_1         
	//   28   58:ldc2            #385 <String "user_id">
	//   29   61:aload_0         
	//   30   62:getfield        #59  <Field String f>
	//   31   65:invokevirtual   #117 <Method JSONObject JSONObject.put(String, Object)>
	//   32   68:pop             
		if(g == null)
			break MISSING_BLOCK_LABEL_105;
	//   33   69:aload_0         
	//   34   70:getfield        #61  <Field cg g>
	//   35   73:ifnull          105
		jsonobject.put("session_id", ((Object) (g.b())));
	//   36   76:aload_1         
	//   37   77:ldc2            #391 <String "session_id">
	//   38   80:aload_0         
	//   39   81:getfield        #61  <Field cg g>
	//   40   84:invokevirtual   #459 <Method String cg.b()>
	//   41   87:invokevirtual   #117 <Method JSONObject JSONObject.put(String, Object)>
	//   42   90:pop             
		return jsonobject;
	//   43   91:aload_1         
	//   44   92:areturn         
		JSONException jsonexception;
		jsonexception;
	//   45   93:astore_2        
		AppboyLogger.e(a, "Caught exception creating Braze event Json.", ((Throwable) (jsonexception)));
	//   46   94:getstatic       #29  <Field String a>
	//   47   97:ldc2            #461 <String "Caught exception creating Braze event Json.">
	//   48  100:aload_2         
	//   49  101:invokestatic    #464 <Method int AppboyLogger.e(String, String, Throwable)>
	//   50  104:pop             
		return jsonobject;
	//   51  105:aload_1         
	//   52  106:areturn         
	}

	public String toString()
	{
		JSONObject jsonobject = m();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #434 <Method JSONObject m()>
	//    2    4:astore_1        
		if(jsonobject != null && jsonobject.length() > 0)
	//*   3    5:aload_1         
	//*   4    6:ifnull          36
	//*   5    9:aload_1         
	//*   6   10:invokevirtual   #465 <Method int JSONObject.length()>
	//*   7   13:ifle            36
		{
			if(!(jsonobject instanceof JSONObject))
	//*   8   16:aload_1         
	//*   9   17:instanceof      #91  <Class JSONObject>
	//*  10   20:ifne            28
				return jsonobject.toString();
	//   11   23:aload_1         
	//   12   24:invokevirtual   #435 <Method String JSONObject.toString()>
	//   13   27:areturn         
			else
				return JSONObjectInstrumentation.toString((JSONObject)jsonobject);
	//   14   28:aload_1         
	//   15   29:checkcast       #91  <Class JSONObject>
	//   16   32:invokestatic    #438 <Method String JSONObjectInstrumentation.toString(JSONObject)>
	//   17   35:areturn         
		} else
		{
			return "";
	//   18   36:ldc2            #467 <String "">
	//   19   39:areturn         
		}
	}

	private static final String a = AppboyLogger.getAppboyLogTag(bo/app/ci);
	private final w b;
	private final JSONObject c;
	private final double d;
	private final String e;
	private String f;
	private cg g;

	static 
	{
	//    0    0:ldc1            #2   <Class ci>
	//    1    2:invokestatic    #27  <Method String AppboyLogger.getAppboyLogTag(Class)>
	//    2    5:putstatic       #29  <Field String a>
	//*   3    8:return          
	}
}
