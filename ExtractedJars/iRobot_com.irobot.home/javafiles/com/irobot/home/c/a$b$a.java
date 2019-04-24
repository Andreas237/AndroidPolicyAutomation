// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.c;

import android.os.Handler;
import com.irobot.a.d;
import com.irobot.a.g;
import com.irobot.core.*;
import com.irobot.home.IRobotApplication;
import com.irobot.home.core.c;
import com.irobot.home.r.a;
import com.irobot.home.util.o;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.*;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.Semaphore;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.irobot.home.c:
//			a, b, c, s

private class a$b$a
	implements com.irobot.a.g.c, com.irobot.a.g.d, com.irobot.a.g.e
{

	private JSONObject a(UpdateProgressState updateprogressstate, int i1, int j1)
	{
		JSONObject jsonobject = new JSONObject();
	//    0    0:new             #33  <Class JSONObject>
	//    1    3:dup             
	//    2    4:invokespecial   #34  <Method void JSONObject()>
	//    3    7:astore          4
		try
		{
			JSONObject jsonobject1 = new JSONObject();
	//    4    9:new             #33  <Class JSONObject>
	//    5   12:dup             
	//    6   13:invokespecial   #34  <Method void JSONObject()>
	//    7   16:astore          5
			jsonobject1.put("upload_state", updateprogressstate.ordinal());
	//    8   18:aload           5
	//    9   20:ldc1            #36  <String "upload_state">
	//   10   22:aload_1         
	//   11   23:invokevirtual   #42  <Method int UpdateProgressState.ordinal()>
	//   12   26:invokevirtual   #46  <Method JSONObject JSONObject.put(String, int)>
	//   13   29:pop             
			jsonobject1.put("upload_progress", i1);
	//   14   30:aload           5
	//   15   32:ldc1            #48  <String "upload_progress">
	//   16   34:iload_2         
	//   17   35:invokevirtual   #46  <Method JSONObject JSONObject.put(String, int)>
	//   18   38:pop             
			jsonobject1.put("upload_total", j1);
	//   19   39:aload           5
	//   20   41:ldc1            #50  <String "upload_total">
	//   21   43:iload_3         
	//   22   44:invokevirtual   #46  <Method JSONObject JSONObject.put(String, int)>
	//   23   47:pop             
			jsonobject.put("software_package_upload", ((Object) (jsonobject1)));
	//   24   48:aload           4
	//   25   50:ldc1            #52  <String "software_package_upload">
	//   26   52:aload           5
	//   27   54:invokevirtual   #55  <Method JSONObject JSONObject.put(String, Object)>
	//   28   57:pop             
		}
	//*  29   58:aload           4
	//*  30   60:areturn         
		// Misplaced declaration of an exception variable
		catch(UpdateProgressState updateprogressstate)
	//*  31   61:astore_1        
		{
			a("Error while creating progress info JSON objects.", ((JSONException) (updateprogressstate)));
	//   32   62:aload_0         
	//   33   63:ldc1            #57  <String "Error while creating progress info JSON objects.">
	//   34   65:aload_1         
	//   35   66:invokespecial   #60  <Method void a(String, JSONException)>
			return jsonobject;
	//   36   69:aload           4
	//   37   71:areturn         
		}
		return jsonobject;
	}

	private void a(d d1)
	{
		int i1 = com.irobot.home.c.a._cls1.a[d1.a().ordinal()];
	//    0    0:getstatic       #66  <Field int[] com.irobot.home.c.a$1.a>
	//    1    3:aload_1         
	//    2    4:invokevirtual   #71  <Method com.irobot.a.d$a d.a()>
	//    3    7:invokevirtual   #74  <Method int com.irobot.a.d$a.ordinal()>
	//    4   10:iaload          
	//    5   11:istore_2        
		Object obj = ((Object) (Error.create(5, "Unknown Robot Error.", com.irobot.home.core.c.a(((Throwable) (new IOException("Unknown Robot Error.")))))));
	//    6   12:iconst_5        
	//    7   13:ldc1            #76  <String "Unknown Robot Error.">
	//    8   15:new             #78  <Class IOException>
	//    9   18:dup             
	//   10   19:ldc1            #76  <String "Unknown Robot Error.">
	//   11   21:invokespecial   #81  <Method void IOException(String)>
	//   12   24:invokestatic    #86  <Method java.util.HashMap c.a(Throwable)>
	//   13   27:invokestatic    #92  <Method Error Error.create(int, String, java.util.HashMap)>
	//   14   30:astore_3        
		com.irobot.home.c.a.b.d(a).a(((Error) (obj)));
	//   15   31:aload_0         
	//   16   32:getfield        #21  <Field a$b a>
	//   17   35:invokestatic    #96  <Method b com.irobot.home.c.a$b.d(a$b)>
	//   18   38:aload_3         
	//   19   39:invokevirtual   #101 <Method void com.irobot.home.c.b.a(Error)>
		obj = ((Object) (new StringBuilder()));
	//   20   42:new             #103 <Class StringBuilder>
	//   21   45:dup             
	//   22   46:invokespecial   #104 <Method void StringBuilder()>
	//   23   49:astore_3        
		((StringBuilder) (obj)).append("Error response from robot ");
	//   24   50:aload_3         
	//   25   51:ldc1            #106 <String "Error response from robot ">
	//   26   53:invokevirtual   #110 <Method StringBuilder StringBuilder.append(String)>
	//   27   56:pop             
		((StringBuilder) (obj)).append(((Object) (d1.a())));
	//   28   57:aload_3         
	//   29   58:aload_1         
	//   30   59:invokevirtual   #71  <Method com.irobot.a.d$a d.a()>
	//   31   62:invokevirtual   #113 <Method StringBuilder StringBuilder.append(Object)>
	//   32   65:pop             
		com.irobot.home.util.o.e("AltNetSession", ((StringBuilder) (obj)).toString());
	//   33   66:ldc1            #115 <String "AltNetSession">
	//   34   68:aload_3         
	//   35   69:invokevirtual   #119 <Method String StringBuilder.toString()>
	//   36   72:invokestatic    #125 <Method void o.e(String, String)>
	//   37   75:return          
	}

	private void a(String s1, d d1)
	{
		if(b(s1, d1))
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:aload_2         
	//*   3    3:invokespecial   #129 <Method boolean b(String, d)>
	//*   4    6:ifeq            30
		{
			com.irobot.home.c.a.b.d(a).a((new JSONObject()).toString());
	//    5    9:aload_0         
	//    6   10:getfield        #21  <Field a$b a>
	//    7   13:invokestatic    #96  <Method b com.irobot.home.c.a$b.d(a$b)>
	//    8   16:new             #33  <Class JSONObject>
	//    9   19:dup             
	//   10   20:invokespecial   #34  <Method void JSONObject()>
	//   11   23:invokevirtual   #130 <Method String JSONObject.toString()>
	//   12   26:invokevirtual   #132 <Method void com.irobot.home.c.b.a(String)>
			return;
	//   13   29:return          
		} else
		{
			d1 = ((d) (new StringBuilder()));
	//   14   30:new             #103 <Class StringBuilder>
	//   15   33:dup             
	//   16   34:invokespecial   #104 <Method void StringBuilder()>
	//   17   37:astore_2        
			((StringBuilder) (d1)).append("Operation request and response request did not match ");
	//   18   38:aload_2         
	//   19   39:ldc1            #134 <String "Operation request and response request did not match ">
	//   20   41:invokevirtual   #110 <Method StringBuilder StringBuilder.append(String)>
	//   21   44:pop             
			((StringBuilder) (d1)).append(s1);
	//   22   45:aload_2         
	//   23   46:aload_1         
	//   24   47:invokevirtual   #110 <Method StringBuilder StringBuilder.append(String)>
	//   25   50:pop             
			((StringBuilder) (d1)).append(" ");
	//   26   51:aload_2         
	//   27   52:ldc1            #136 <String " ">
	//   28   54:invokevirtual   #110 <Method StringBuilder StringBuilder.append(String)>
	//   29   57:pop             
			((StringBuilder) (d1)).append(com.irobot.home.c.a.b.d(a).b());
	//   30   58:aload_2         
	//   31   59:aload_0         
	//   32   60:getfield        #21  <Field a$b a>
	//   33   63:invokestatic    #96  <Method b com.irobot.home.c.a$b.d(a$b)>
	//   34   66:invokevirtual   #138 <Method String b.b()>
	//   35   69:invokevirtual   #110 <Method StringBuilder StringBuilder.append(String)>
	//   36   72:pop             
			com.irobot.home.util.o.e("AltNetSession", ((StringBuilder) (d1)).toString());
	//   37   73:ldc1            #115 <String "AltNetSession">
	//   38   75:aload_2         
	//   39   76:invokevirtual   #119 <Method String StringBuilder.toString()>
	//   40   79:invokestatic    #125 <Method void o.e(String, String)>
			return;
	//   41   82:return          
		}
	}

	private void a(String s1, String s2, String s3)
	{
		try
		{
			s1 = ((String) (NetworkResponse.create(com.irobot.home.c.a.b.b(a), ((com.irobot.core.NetworkAddress) (null)), s1, 200)));
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field a$b a>
	//    2    4:invokestatic    #142 <Method AssetId a$b.b(a$b)>
	//    3    7:aconst_null     
	//    4    8:aload_1         
	//    5    9:sipush          200
	//    6   12:invokestatic    #147 <Method NetworkResponse NetworkResponse.create(AssetId, com.irobot.core.NetworkAddress, String, int)>
	//    7   15:astore_1        
			JSONObject jsonobject = new JSONObject();
	//    8   16:new             #33  <Class JSONObject>
	//    9   19:dup             
	//   10   20:invokespecial   #34  <Method void JSONObject()>
	//   11   23:astore          4
			jsonobject.put(s2, ((Object) (s3)));
	//   12   25:aload           4
	//   13   27:aload_2         
	//   14   28:aload_3         
	//   15   29:invokevirtual   #55  <Method JSONObject JSONObject.put(String, Object)>
	//   16   32:pop             
			((NetworkJsonCallback)com.irobot.home.c.a.b.j(a).getNetworkCallback()).onSuccess(((NetworkResponse) (s1)), jsonobject.toString());
	//   17   33:aload_0         
	//   18   34:getfield        #21  <Field a$b a>
	//   19   37:invokestatic    #151 <Method NetworkSessionCallback a$b.j(a$b)>
	//   20   40:invokevirtual   #157 <Method com.irobot.core.NetworkCallback NetworkSessionCallback.getNetworkCallback()>
	//   21   43:checkcast       #159 <Class NetworkJsonCallback>
	//   22   46:aload_1         
	//   23   47:aload           4
	//   24   49:invokevirtual   #130 <Method String JSONObject.toString()>
	//   25   52:invokevirtual   #163 <Method void NetworkJsonCallback.onSuccess(NetworkResponse, String)>
			return;
	//   26   55:return          
		}
		// Misplaced declaration of an exception variable
		catch(String s1)
	//*  27   56:astore_1        
		{
			a("Error while creating robot info JSON objects.", ((JSONException) (s1)));
	//   28   57:aload_0         
	//   29   58:ldc1            #165 <String "Error while creating robot info JSON objects.">
	//   30   60:aload_1         
	//   31   61:invokespecial   #60  <Method void a(String, JSONException)>
		}
	//   32   64:return          
	}

	private void a(String s1, JSONException jsonexception)
	{
		s1 = ((String) (Error.create(101, s1, com.irobot.home.core.c.a(((Throwable) (jsonexception))))));
	//    0    0:bipush          101
	//    1    2:aload_1         
	//    2    3:aload_2         
	//    3    4:invokestatic    #86  <Method java.util.HashMap c.a(Throwable)>
	//    4    7:invokestatic    #92  <Method Error Error.create(int, String, java.util.HashMap)>
	//    5   10:astore_1        
		com.irobot.home.c.a.b.d(a).a(((Error) (s1)));
	//    6   11:aload_0         
	//    7   12:getfield        #21  <Field a$b a>
	//    8   15:invokestatic    #96  <Method b com.irobot.home.c.a$b.d(a$b)>
	//    9   18:aload_1         
	//   10   19:invokevirtual   #101 <Method void com.irobot.home.c.b.a(Error)>
	//   11   22:return          
	}

	private boolean a(g g1, d d1, String s1)
	{
		boolean flag = false;
	//    0    0:iconst_0        
	//    1    1:istore          4
		if(d1 != null)
	//*   2    3:aload_2         
	//*   3    4:ifnull          57
		{
			Locale locale = Locale.US;
	//    4    7:getstatic       #172 <Field Locale Locale.US>
	//    5   10:astore          5
			com.irobot.a.d.a a1 = d1.a();
	//    6   12:aload_2         
	//    7   13:invokevirtual   #71  <Method com.irobot.a.d$a d.a()>
	//    8   16:astore          6
			flag = true;
	//    9   18:iconst_1        
	//   10   19:istore          4
			com.irobot.home.util.o.e("AltDataHandler", String.format(locale, "%s: %s: %s", new Object[] {
				s1, a1, d1.b()
			}));
	//   11   21:ldc1            #174 <String "AltDataHandler">
	//   12   23:aload           5
	//   13   25:ldc1            #176 <String "%s: %s: %s">
	//   14   27:iconst_3        
	//   15   28:anewarray       Object[]
	//   16   31:dup             
	//   17   32:iconst_0        
	//   18   33:aload_3         
	//   19   34:aastore         
	//   20   35:dup             
	//   21   36:iconst_1        
	//   22   37:aload           6
	//   23   39:aastore         
	//   24   40:dup             
	//   25   41:iconst_2        
	//   26   42:aload_2         
	//   27   43:invokevirtual   #177 <Method String d.b()>
	//   28   46:aastore         
	//   29   47:invokestatic    #183 <Method String String.format(Locale, String, Object[])>
	//   30   50:invokestatic    #125 <Method void o.e(String, String)>
			g1.k();
	//   31   53:aload_1         
	//   32   54:invokevirtual   #188 <Method void g.k()>
		}
		return flag;
	//   33   57:iload           4
	//   34   59:ireturn         
	}

	private boolean a(String s1)
	{
		if(com.irobot.home.c.a.b.d(a).c().equals(((Object) (s1))))
	//*   0    0:aload_0         
	//*   1    1:getfield        #21  <Field a$b a>
	//*   2    4:invokestatic    #96  <Method b com.irobot.home.c.a$b.d(a$b)>
	//*   3    7:invokevirtual   #192 <Method String com.irobot.home.c.b.c()>
	//*   4   10:aload_1         
	//*   5   11:invokevirtual   #196 <Method boolean String.equals(Object)>
	//*   6   14:ifeq            39
		{
			com.irobot.home.c.a.b.d(a).a((new JSONObject()).toString());
	//    7   17:aload_0         
	//    8   18:getfield        #21  <Field a$b a>
	//    9   21:invokestatic    #96  <Method b com.irobot.home.c.a$b.d(a$b)>
	//   10   24:new             #33  <Class JSONObject>
	//   11   27:dup             
	//   12   28:invokespecial   #34  <Method void JSONObject()>
	//   13   31:invokevirtual   #130 <Method String JSONObject.toString()>
	//   14   34:invokevirtual   #132 <Method void com.irobot.home.c.b.a(String)>
			return true;
	//   15   37:iconst_1        
	//   16   38:ireturn         
		} else
		{
			return false;
	//   17   39:iconst_0        
	//   18   40:ireturn         
		}
	}

	private boolean a(List list)
	{
		for(list = ((List) (list.iterator())); ((Iterator) (list)).hasNext();)
	//*   0    0:aload_1         
	//*   1    1:invokeinterface #203 <Method Iterator List.iterator()>
	//*   2    6:astore_1        
	//*   3    7:aload_1         
	//*   4    8:invokeinterface #209 <Method boolean Iterator.hasNext()>
	//*   5   13:ifeq            34
			if(a((String)((Iterator) (list)).next()))
	//*   6   16:aload_0         
	//*   7   17:aload_1         
	//*   8   18:invokeinterface #213 <Method Object Iterator.next()>
	//*   9   23:checkcast       #179 <Class String>
	//*  10   26:invokespecial   #215 <Method boolean a(String)>
	//*  11   29:ifeq            7
				return true;
	//   12   32:iconst_1        
	//   13   33:ireturn         

		return false;
	//   14   34:iconst_0        
	//   15   35:ireturn         
	}

	private boolean b(d d1)
	{
		if(d1 != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          11
		{
			a(d1);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #220 <Method void a(d)>
			return false;
	//    5    9:iconst_0        
	//    6   10:ireturn         
		} else
		{
			return true;
	//    7   11:iconst_1        
	//    8   12:ireturn         
		}
	}

	private boolean b(String s1, d d1)
	{
		return com.irobot.home.c.a.b.d(a).b().equals(((Object) (s1))) && b(d1);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field a$b a>
	//    2    4:invokestatic    #96  <Method b com.irobot.home.c.a$b.d(a$b)>
	//    3    7:invokevirtual   #138 <Method String b.b()>
	//    4   10:aload_1         
	//    5   11:invokevirtual   #196 <Method boolean String.equals(Object)>
	//    6   14:ifeq            27
	//    7   17:aload_0         
	//    8   18:aload_2         
	//    9   19:invokespecial   #222 <Method boolean b(d)>
	//   10   22:ifeq            27
	//   11   25:iconst_1        
	//   12   26:ireturn         
	//   13   27:iconst_0        
	//   14   28:ireturn         
	}

	public void a(g g1)
	{
	//    0    0:return          
	}

	public void a(g g1, byte byte0)
	{
	//    0    0:return          
	}

	public void a(g g1, byte byte0, byte byte1, byte byte2, byte byte3, d d1)
	{
		g1 = ((g) (com.irobot.home.c.a.b.a(a).b()));
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field a$b a>
	//    2    4:invokestatic    #228 <Method com.irobot.home.c.c com.irobot.home.c.a$b.a(a$b)>
	//    3    7:invokevirtual   #232 <Method Object c.b()>
	//    4   10:astore_1        
		g1;
	//    5   11:aload_1         
		JVM INSTR monitorenter ;
	//    6   12:monitorenter    
		boolean flag = b("get_preferences", d1);
	//    7   13:aload_0         
	//    8   14:ldc1            #234 <String "get_preferences">
	//    9   16:aload           6
	//   10   18:invokespecial   #129 <Method boolean b(String, d)>
	//   11   21:istore          7
		if(!flag)
			break MISSING_BLOCK_LABEL_103;
	//   12   23:iload           7
	//   13   25:ifeq            103
		try
		{
			d1 = ((d) (new JSONObject()));
	//   14   28:new             #33  <Class JSONObject>
	//   15   31:dup             
	//   16   32:invokespecial   #34  <Method void JSONObject()>
	//   17   35:astore          6
			((JSONObject) (d1)).put("wet_pad_level", ((int) (byte0)));
	//   18   37:aload           6
	//   19   39:ldc1            #236 <String "wet_pad_level">
	//   20   41:iload_2         
	//   21   42:invokevirtual   #46  <Method JSONObject JSONObject.put(String, int)>
	//   22   45:pop             
			((JSONObject) (d1)).put("damp_pad_level", ((int) (byte1)));
	//   23   46:aload           6
	//   24   48:ldc1            #238 <String "damp_pad_level">
	//   25   50:iload_3         
	//   26   51:invokevirtual   #46  <Method JSONObject JSONObject.put(String, int)>
	//   27   54:pop             
			((JSONObject) (d1)).put("reusable_wet_pad_level", ((int) (byte2)));
	//   28   55:aload           6
	//   29   57:ldc1            #240 <String "reusable_wet_pad_level">
	//   30   59:iload           4
	//   31   61:invokevirtual   #46  <Method JSONObject JSONObject.put(String, int)>
	//   32   64:pop             
			((JSONObject) (d1)).put("reusable_damp_pad_level", ((int) (byte3)));
	//   33   65:aload           6
	//   34   67:ldc1            #242 <String "reusable_damp_pad_level">
	//   35   69:iload           5
	//   36   71:invokevirtual   #46  <Method JSONObject JSONObject.put(String, int)>
	//   37   74:pop             
			com.irobot.home.c.a.b.d(a).a(((JSONObject) (d1)).toString());
	//   38   75:aload_0         
	//   39   76:getfield        #21  <Field a$b a>
	//   40   79:invokestatic    #96  <Method b com.irobot.home.c.a$b.d(a$b)>
	//   41   82:aload           6
	//   42   84:invokevirtual   #130 <Method String JSONObject.toString()>
	//   43   87:invokevirtual   #132 <Method void com.irobot.home.c.b.a(String)>
			break MISSING_BLOCK_LABEL_103;
	//   44   90:goto            103
		}
		// Misplaced declaration of an exception variable
		catch(d d1) { }
	//   45   93:astore          6
		a("Error while creating get wetness levels json.", ((JSONException) (d1)));
	//   46   95:aload_0         
	//   47   96:ldc1            #244 <String "Error while creating get wetness levels json.">
	//   48   98:aload           6
	//   49  100:invokespecial   #60  <Method void a(String, JSONException)>
		g1;
	//   50  103:aload_1         
		JVM INSTR monitorexit ;
	//   51  104:monitorexit     
		return;
	//   52  105:return          
		d1;
	//   53  106:astore          6
		g1;
	//   54  108:aload_1         
		JVM INSTR monitorexit ;
	//   55  109:monitorexit     
		throw d1;
	//   56  110:aload           6
	//   57  112:athrow          
	}

	public void a(g g1, byte byte0, d d1)
	{
		g1 = ((g) (com.irobot.home.c.a.b.a(a).b()));
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field a$b a>
	//    2    4:invokestatic    #228 <Method com.irobot.home.c.c com.irobot.home.c.a$b.a(a$b)>
	//    3    7:invokevirtual   #232 <Method Object c.b()>
	//    4   10:astore_1        
		g1;
	//    5   11:aload_1         
		JVM INSTR monitorenter ;
	//    6   12:monitorenter    
		boolean flag = b("get_volume", d1);
	//    7   13:aload_0         
	//    8   14:ldc1            #247 <String "get_volume">
	//    9   16:aload_3         
	//   10   17:invokespecial   #129 <Method boolean b(String, d)>
	//   11   20:istore          4
		if(!flag)
			break MISSING_BLOCK_LABEL_68;
	//   12   22:iload           4
	//   13   24:ifeq            68
		try
		{
			d1 = ((d) (new JSONObject()));
	//   14   27:new             #33  <Class JSONObject>
	//   15   30:dup             
	//   16   31:invokespecial   #34  <Method void JSONObject()>
	//   17   34:astore_3        
			((JSONObject) (d1)).put("volume_level", ((int) (byte0)));
	//   18   35:aload_3         
	//   19   36:ldc1            #249 <String "volume_level">
	//   20   38:iload_2         
	//   21   39:invokevirtual   #46  <Method JSONObject JSONObject.put(String, int)>
	//   22   42:pop             
			com.irobot.home.c.a.b.d(a).a(((JSONObject) (d1)).toString());
	//   23   43:aload_0         
	//   24   44:getfield        #21  <Field a$b a>
	//   25   47:invokestatic    #96  <Method b com.irobot.home.c.a$b.d(a$b)>
	//   26   50:aload_3         
	//   27   51:invokevirtual   #130 <Method String JSONObject.toString()>
	//   28   54:invokevirtual   #132 <Method void com.irobot.home.c.b.a(String)>
			break MISSING_BLOCK_LABEL_68;
	//   29   57:goto            68
		}
		// Misplaced declaration of an exception variable
		catch(d d1) { }
	//   30   60:astore_3        
		a("Error while creating get volume json.", ((JSONException) (d1)));
	//   31   61:aload_0         
	//   32   62:ldc1            #251 <String "Error while creating get volume json.">
	//   33   64:aload_3         
	//   34   65:invokespecial   #60  <Method void a(String, JSONException)>
		g1;
	//   35   68:aload_1         
		JVM INSTR monitorexit ;
	//   36   69:monitorexit     
		return;
	//   37   70:return          
		d1;
	//   38   71:astore_3        
		g1;
	//   39   72:aload_1         
		JVM INSTR monitorexit ;
	//   40   73:monitorexit     
		throw d1;
	//   41   74:aload_3         
	//   42   75:athrow          
	}

	public void a(g g1, int i1, int j1)
	{
		if(com.irobot.home.c.a.b.d(a) instanceof s)
	//*   0    0:aload_0         
	//*   1    1:getfield        #21  <Field a$b a>
	//*   2    4:invokestatic    #96  <Method b com.irobot.home.c.a$b.d(a$b)>
	//*   3    7:instanceof      #254 <Class s>
	//*   4   10:ifeq            34
		{
			g1 = ((g) ((s)com.irobot.home.c.a.b.d(a)));
	//    5   13:aload_0         
	//    6   14:getfield        #21  <Field a$b a>
	//    7   17:invokestatic    #96  <Method b com.irobot.home.c.a$b.d(a$b)>
	//    8   20:checkcast       #254 <Class s>
	//    9   23:astore_1        
			((s) (g1)).b(i1);
	//   10   24:aload_1         
	//   11   25:iload_2         
	//   12   26:invokevirtual   #257 <Method void s.b(int)>
			((s) (g1)).a(j1);
	//   13   29:aload_1         
	//   14   30:iload_3         
	//   15   31:invokevirtual   #259 <Method void com.irobot.home.c.s.a(int)>
		}
		g1 = ((g) (a(UpdateProgressState.UploadingPackage, i1, j1)));
	//   16   34:aload_0         
	//   17   35:getstatic       #263 <Field UpdateProgressState UpdateProgressState.UploadingPackage>
	//   18   38:iload_2         
	//   19   39:iload_3         
	//   20   40:invokespecial   #265 <Method JSONObject a(UpdateProgressState, int, int)>
	//   21   43:astore_1        
		NetworkResponse networkresponse = NetworkResponse.create(com.irobot.home.c.a.b.b(a), ((com.irobot.core.NetworkAddress) (null)), "software_package_upload", 200);
	//   22   44:aload_0         
	//   23   45:getfield        #21  <Field a$b a>
	//   24   48:invokestatic    #142 <Method AssetId a$b.b(a$b)>
	//   25   51:aconst_null     
	//   26   52:ldc1            #52  <String "software_package_upload">
	//   27   54:sipush          200
	//   28   57:invokestatic    #147 <Method NetworkResponse NetworkResponse.create(AssetId, com.irobot.core.NetworkAddress, String, int)>
	//   29   60:astore          4
		((NetworkJsonCallback)com.irobot.home.c.a.b.j(a).getNetworkCallback()).onSuccess(networkresponse, ((JSONObject) (g1)).toString());
	//   30   62:aload_0         
	//   31   63:getfield        #21  <Field a$b a>
	//   32   66:invokestatic    #151 <Method NetworkSessionCallback a$b.j(a$b)>
	//   33   69:invokevirtual   #157 <Method com.irobot.core.NetworkCallback NetworkSessionCallback.getNetworkCallback()>
	//   34   72:checkcast       #159 <Class NetworkJsonCallback>
	//   35   75:aload           4
	//   36   77:aload_1         
	//   37   78:invokevirtual   #130 <Method String JSONObject.toString()>
	//   38   81:invokevirtual   #163 <Method void NetworkJsonCallback.onSuccess(NetworkResponse, String)>
	//   39   84:return          
	}

	public void a(g g1, d d1)
	{
		synchronized(com.irobot.home.c.a.b.a(a).b())
	//*   0    0:aload_0         
	//*   1    1:getfield        #21  <Field a$b a>
	//*   2    4:invokestatic    #228 <Method com.irobot.home.c.c com.irobot.home.c.a$b.a(a$b)>
	//*   3    7:invokevirtual   #232 <Method Object c.b()>
	//*   4   10:astore_1        
	//*   5   11:aload_1         
	//*   6   12:monitorenter    
		{
			if(b("send_command", d1))
	//*   7   13:aload_0         
	//*   8   14:ldc2            #268 <String "send_command">
	//*   9   17:aload_2         
	//*  10   18:invokespecial   #129 <Method boolean b(String, d)>
	//*  11   21:ifeq            32
				a("spray");
	//   12   24:aload_0         
	//   13   25:ldc2            #270 <String "spray">
	//   14   28:invokespecial   #215 <Method boolean a(String)>
	//   15   31:pop             
		}
	//   16   32:aload_1         
	//   17   33:monitorexit     
		return;
	//   18   34:return          
		d1;
	//   19   35:astore_2        
		g1;
	//   20   36:aload_1         
		JVM INSTR monitorexit ;
	//   21   37:monitorexit     
		throw d1;
	//   22   38:aload_2         
	//   23   39:athrow          
	}

	public void a(g g1, com.irobot.a.h.c c1, d d1)
	{
		g1 = ((g) (com.irobot.home.c.a.b.a(a).b()));
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field a$b a>
	//    2    4:invokestatic    #228 <Method com.irobot.home.c.c com.irobot.home.c.a$b.a(a$b)>
	//    3    7:invokevirtual   #232 <Method Object c.b()>
	//    4   10:astore_1        
		g1;
	//    5   11:aload_1         
		JVM INSTR monitorenter ;
	//    6   12:monitorenter    
		boolean flag = b("get_battery_level", d1);
	//    7   13:aload_0         
	//    8   14:ldc2            #273 <String "get_battery_level">
	//    9   17:aload_3         
	//   10   18:invokespecial   #129 <Method boolean b(String, d)>
	//   11   21:istore          4
		if(!flag)
			break MISSING_BLOCK_LABEL_134;
	//   12   23:iload           4
	//   13   25:ifeq            134
		try
		{
			d1 = ((d) (new JSONObject()));
	//   14   28:new             #33  <Class JSONObject>
	//   15   31:dup             
	//   16   32:invokespecial   #34  <Method void JSONObject()>
	//   17   35:astore_3        
			((JSONObject) (d1)).put("battery_level", ((int) (c1.a)));
	//   18   36:aload_3         
	//   19   37:ldc2            #275 <String "battery_level">
	//   20   40:aload_2         
	//   21   41:getfield        #280 <Field byte com.irobot.a.h$c.a>
	//   22   44:invokevirtual   #46  <Method JSONObject JSONObject.put(String, int)>
	//   23   47:pop             
			((JSONObject) (d1)).put("battery_maximum_charge", ((int) (c1.e)));
	//   24   48:aload_3         
	//   25   49:ldc2            #282 <String "battery_maximum_charge">
	//   26   52:aload_2         
	//   27   53:getfield        #285 <Field short com.irobot.a.h$c.e>
	//   28   56:invokevirtual   #46  <Method JSONObject JSONObject.put(String, int)>
	//   29   59:pop             
			((JSONObject) (d1)).put("battery_charge", ((int) (c1.f)));
	//   30   60:aload_3         
	//   31   61:ldc2            #287 <String "battery_charge">
	//   32   64:aload_2         
	//   33   65:getfield        #290 <Field short com.irobot.a.h$c.f>
	//   34   68:invokevirtual   #46  <Method JSONObject JSONObject.put(String, int)>
	//   35   71:pop             
			((JSONObject) (d1)).put("battery_maximum_voltage", ((int) (c1.c)));
	//   36   72:aload_3         
	//   37   73:ldc2            #292 <String "battery_maximum_voltage">
	//   38   76:aload_2         
	//   39   77:getfield        #294 <Field short com.irobot.a.h$c.c>
	//   40   80:invokevirtual   #46  <Method JSONObject JSONObject.put(String, int)>
	//   41   83:pop             
			((JSONObject) (d1)).put("battery_minimum_voltage", ((int) (c1.b)));
	//   42   84:aload_3         
	//   43   85:ldc2            #296 <String "battery_minimum_voltage">
	//   44   88:aload_2         
	//   45   89:getfield        #298 <Field short com.irobot.a.h$c.b>
	//   46   92:invokevirtual   #46  <Method JSONObject JSONObject.put(String, int)>
	//   47   95:pop             
			((JSONObject) (d1)).put("battery_voltage", ((int) (c1.d)));
	//   48   96:aload_3         
	//   49   97:ldc2            #300 <String "battery_voltage">
	//   50  100:aload_2         
	//   51  101:getfield        #302 <Field short com.irobot.a.h$c.d>
	//   52  104:invokevirtual   #46  <Method JSONObject JSONObject.put(String, int)>
	//   53  107:pop             
			com.irobot.home.c.a.b.d(a).a(((JSONObject) (d1)).toString());
	//   54  108:aload_0         
	//   55  109:getfield        #21  <Field a$b a>
	//   56  112:invokestatic    #96  <Method b com.irobot.home.c.a$b.d(a$b)>
	//   57  115:aload_3         
	//   58  116:invokevirtual   #130 <Method String JSONObject.toString()>
	//   59  119:invokevirtual   #132 <Method void com.irobot.home.c.b.a(String)>
			break MISSING_BLOCK_LABEL_134;
	//   60  122:goto            134
		}
		// Misplaced declaration of an exception variable
		catch(com.irobot.a.h.c c1) { }
	//   61  125:astore_2        
		a("Error while creating get battery levels json.", ((JSONException) (c1)));
	//   62  126:aload_0         
	//   63  127:ldc2            #304 <String "Error while creating get battery levels json.">
	//   64  130:aload_2         
	//   65  131:invokespecial   #60  <Method void a(String, JSONException)>
		g1;
	//   66  134:aload_1         
		JVM INSTR monitorexit ;
	//   67  135:monitorexit     
		return;
	//   68  136:return          
		c1;
	//   69  137:astore_2        
		g1;
	//   70  138:aload_1         
		JVM INSTR monitorexit ;
	//   71  139:monitorexit     
		throw c1;
	//   72  140:aload_2         
	//   73  141:athrow          
	}

	public void a(g g1, com.irobot.a.h.m m1, d d1)
	{
		g1 = ((g) (com.irobot.home.c.a.b.a(a).b()));
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field a$b a>
	//    2    4:invokestatic    #228 <Method com.irobot.home.c.c com.irobot.home.c.a$b.a(a$b)>
	//    3    7:invokevirtual   #232 <Method Object c.b()>
	//    4   10:astore_1        
		g1;
	//    5   11:aload_1         
		JVM INSTR monitorenter ;
	//    6   12:monitorenter    
		boolean flag = b("get_mission_status", d1);
	//    7   13:aload_0         
	//    8   14:ldc2            #307 <String "get_mission_status">
	//    9   17:aload_3         
	//   10   18:invokespecial   #129 <Method boolean b(String, d)>
	//   11   21:istore          4
		if(!flag)
			break MISSING_BLOCK_LABEL_98;
	//   12   23:iload           4
	//   13   25:ifeq            98
		try
		{
			d1 = ((d) (new JSONObject()));
	//   14   28:new             #33  <Class JSONObject>
	//   15   31:dup             
	//   16   32:invokespecial   #34  <Method void JSONObject()>
	//   17   35:astore_3        
			((JSONObject) (d1)).put("runtime", ((int) (m1.a)));
	//   18   36:aload_3         
	//   19   37:ldc2            #309 <String "runtime">
	//   20   40:aload_2         
	//   21   41:getfield        #312 <Field byte com.irobot.a.h$m.a>
	//   22   44:invokevirtual   #46  <Method JSONObject JSONObject.put(String, int)>
	//   23   47:pop             
			((JSONObject) (d1)).put("robot_state", ((int) (m1.b)));
	//   24   48:aload_3         
	//   25   49:ldc2            #314 <String "robot_state">
	//   26   52:aload_2         
	//   27   53:getfield        #316 <Field byte com.irobot.a.h$m.b>
	//   28   56:invokevirtual   #46  <Method JSONObject JSONObject.put(String, int)>
	//   29   59:pop             
			((JSONObject) (d1)).put("mission_status", ((int) (m1.c)));
	//   30   60:aload_3         
	//   31   61:ldc2            #318 <String "mission_status">
	//   32   64:aload_2         
	//   33   65:getfield        #320 <Field byte com.irobot.a.h$m.c>
	//   34   68:invokevirtual   #46  <Method JSONObject JSONObject.put(String, int)>
	//   35   71:pop             
			com.irobot.home.c.a.b.d(a).a(((JSONObject) (d1)).toString());
	//   36   72:aload_0         
	//   37   73:getfield        #21  <Field a$b a>
	//   38   76:invokestatic    #96  <Method b com.irobot.home.c.a$b.d(a$b)>
	//   39   79:aload_3         
	//   40   80:invokevirtual   #130 <Method String JSONObject.toString()>
	//   41   83:invokevirtual   #132 <Method void com.irobot.home.c.b.a(String)>
			break MISSING_BLOCK_LABEL_98;
	//   42   86:goto            98
		}
		// Misplaced declaration of an exception variable
		catch(com.irobot.a.h.m m1) { }
	//   43   89:astore_2        
		a("Error while creating get status json.", ((JSONException) (m1)));
	//   44   90:aload_0         
	//   45   91:ldc2            #322 <String "Error while creating get status json.">
	//   46   94:aload_2         
	//   47   95:invokespecial   #60  <Method void a(String, JSONException)>
		g1;
	//   48   98:aload_1         
		JVM INSTR monitorexit ;
	//   49   99:monitorexit     
		return;
	//   50  100:return          
		m1;
	//   51  101:astore_2        
		g1;
	//   52  102:aload_1         
		JVM INSTR monitorexit ;
	//   53  103:monitorexit     
		throw m1;
	//   54  104:aload_2         
	//   55  105:athrow          
	}

	public void a(g g1, String s1, d d1)
	{
		g1 = ((g) (com.irobot.home.c.a.b.a(a).b()));
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field a$b a>
	//    2    4:invokestatic    #228 <Method com.irobot.home.c.c com.irobot.home.c.a$b.a(a$b)>
	//    3    7:invokevirtual   #232 <Method Object c.b()>
	//    4   10:astore_1        
		g1;
	//    5   11:aload_1         
		JVM INSTR monitorenter ;
	//    6   12:monitorenter    
		boolean flag = b("get_name", d1);
	//    7   13:aload_0         
	//    8   14:ldc2            #325 <String "get_name">
	//    9   17:aload_3         
	//   10   18:invokespecial   #129 <Method boolean b(String, d)>
	//   11   21:istore          4
		if(!flag)
			break MISSING_BLOCK_LABEL_71;
	//   12   23:iload           4
	//   13   25:ifeq            71
		try
		{
			d1 = ((d) (new JSONObject()));
	//   14   28:new             #33  <Class JSONObject>
	//   15   31:dup             
	//   16   32:invokespecial   #34  <Method void JSONObject()>
	//   17   35:astore_3        
			((JSONObject) (d1)).put("robot_name", ((Object) (s1)));
	//   18   36:aload_3         
	//   19   37:ldc2            #327 <String "robot_name">
	//   20   40:aload_2         
	//   21   41:invokevirtual   #55  <Method JSONObject JSONObject.put(String, Object)>
	//   22   44:pop             
			com.irobot.home.c.a.b.d(a).a(((JSONObject) (d1)).toString());
	//   23   45:aload_0         
	//   24   46:getfield        #21  <Field a$b a>
	//   25   49:invokestatic    #96  <Method b com.irobot.home.c.a$b.d(a$b)>
	//   26   52:aload_3         
	//   27   53:invokevirtual   #130 <Method String JSONObject.toString()>
	//   28   56:invokevirtual   #132 <Method void com.irobot.home.c.b.a(String)>
			break MISSING_BLOCK_LABEL_71;
	//   29   59:goto            71
		}
		// Misplaced declaration of an exception variable
		catch(String s1) { }
	//   30   62:astore_2        
		a("Error while creating get name json.", ((JSONException) (s1)));
	//   31   63:aload_0         
	//   32   64:ldc2            #329 <String "Error while creating get name json.">
	//   33   67:aload_2         
	//   34   68:invokespecial   #60  <Method void a(String, JSONException)>
		g1;
	//   35   71:aload_1         
		JVM INSTR monitorexit ;
	//   36   72:monitorexit     
		return;
	//   37   73:return          
		s1;
	//   38   74:astore_2        
		g1;
	//   39   75:aload_1         
		JVM INSTR monitorexit ;
	//   40   76:monitorexit     
		throw s1;
	//   41   77:aload_2         
	//   42   78:athrow          
	}

	public void b(g g1)
	{
	//    0    0:return          
	}

	public void b(g g1, byte byte0)
	{
	//    0    0:return          
	}

	public void b(g g1, byte byte0, d d1)
	{
		g1 = ((g) (com.irobot.home.c.a.b.a(a).b()));
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field a$b a>
	//    2    4:invokestatic    #228 <Method com.irobot.home.c.c com.irobot.home.c.a$b.a(a$b)>
	//    3    7:invokevirtual   #232 <Method Object c.b()>
	//    4   10:astore_1        
		g1;
	//    5   11:aload_1         
		JVM INSTR monitorenter ;
	//    6   12:monitorenter    
		boolean flag = b("get_room_confine", d1);
	//    7   13:aload_0         
	//    8   14:ldc2            #331 <String "get_room_confine">
	//    9   17:aload_3         
	//   10   18:invokespecial   #129 <Method boolean b(String, d)>
	//   11   21:istore          4
		if(!flag)
			break MISSING_BLOCK_LABEL_82;
	//   12   23:iload           4
	//   13   25:ifeq            82
		d1 = ((d) (new JSONObject()));
	//   14   28:new             #33  <Class JSONObject>
	//   15   31:dup             
	//   16   32:invokespecial   #34  <Method void JSONObject()>
	//   17   35:astore_3        
		if(byte0 != 0)
	//*  18   36:iload_2         
	//*  19   37:ifeq            90
			flag = true;
	//   20   40:iconst_1        
	//   21   41:istore          4
		else
	//*  22   43:goto            46
	//*  23   46:aload_3         
	//*  24   47:ldc2            #333 <String "room_confine">
	//*  25   50:iload           4
	//*  26   52:invokevirtual   #336 <Method JSONObject JSONObject.put(String, boolean)>
	//*  27   55:pop             
	//*  28   56:aload_0         
	//*  29   57:getfield        #21  <Field a$b a>
	//*  30   60:invokestatic    #96  <Method b com.irobot.home.c.a$b.d(a$b)>
	//*  31   63:aload_3         
	//*  32   64:invokevirtual   #130 <Method String JSONObject.toString()>
	//*  33   67:invokevirtual   #132 <Method void com.irobot.home.c.b.a(String)>
	//*  34   70:goto            82
	//*  35   73:astore_3        
	//*  36   74:aload_0         
	//*  37   75:ldc2            #338 <String "Error while creating get room confine levels json.">
	//*  38   78:aload_3         
	//*  39   79:invokespecial   #60  <Method void a(String, JSONException)>
	//*  40   82:aload_1         
	//*  41   83:monitorexit     
	//*  42   84:return          
	//*  43   85:astore_3        
	//*  44   86:aload_1         
	//*  45   87:monitorexit     
	//*  46   88:aload_3         
	//*  47   89:athrow          
			flag = false;
	//   48   90:iconst_0        
	//   49   91:istore          4
		try
		{
			((JSONObject) (d1)).put("room_confine", flag);
			com.irobot.home.c.a.b.d(a).a(((JSONObject) (d1)).toString());
			break MISSING_BLOCK_LABEL_82;
		}
		// Misplaced declaration of an exception variable
		catch(d d1) { }
		a("Error while creating get room confine levels json.", ((JSONException) (d1)));
		g1;
		JVM INSTR monitorexit ;
		return;
		d1;
		g1;
		JVM INSTR monitorexit ;
		throw d1;
	//*  50   93:goto            46
	}

	public void b(g g1, d d1)
	{
		synchronized(com.irobot.home.c.a.b.a(a).b())
	//*   0    0:aload_0         
	//*   1    1:getfield        #21  <Field a$b a>
	//*   2    4:invokestatic    #228 <Method com.irobot.home.c.c com.irobot.home.c.a$b.a(a$b)>
	//*   3    7:invokevirtual   #232 <Method Object c.b()>
	//*   4   10:astore_1        
	//*   5   11:aload_1         
	//*   6   12:monitorenter    
		{
			if(b("send_command", d1))
	//*   7   13:aload_0         
	//*   8   14:ldc2            #268 <String "send_command">
	//*   9   17:aload_2         
	//*  10   18:invokespecial   #129 <Method boolean b(String, d)>
	//*  11   21:ifeq            48
				a(Arrays.asList(((Object []) (new String[] {
					"start_vibrate", "stop_vibrate"
				}))));
	//   12   24:aload_0         
	//   13   25:iconst_2        
	//   14   26:anewarray       String[]
	//   15   29:dup             
	//   16   30:iconst_0        
	//   17   31:ldc2            #340 <String "start_vibrate">
	//   18   34:aastore         
	//   19   35:dup             
	//   20   36:iconst_1        
	//   21   37:ldc2            #342 <String "stop_vibrate">
	//   22   40:aastore         
	//   23   41:invokestatic    #348 <Method List Arrays.asList(Object[])>
	//   24   44:invokespecial   #350 <Method boolean a(List)>
	//   25   47:pop             
		}
	//   26   48:aload_1         
	//   27   49:monitorexit     
		return;
	//   28   50:return          
		d1;
	//   29   51:astore_2        
		g1;
	//   30   52:aload_1         
		JVM INSTR monitorexit ;
	//   31   53:monitorexit     
		throw d1;
	//   32   54:aload_2         
	//   33   55:athrow          
	}

	public void c(g g1, byte byte0, d d1)
	{
		g1 = ((g) (com.irobot.home.c.a.b.a(a).b()));
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field a$b a>
	//    2    4:invokestatic    #228 <Method com.irobot.home.c.c com.irobot.home.c.a$b.a(a$b)>
	//    3    7:invokevirtual   #232 <Method Object c.b()>
	//    4   10:astore_1        
		g1;
	//    5   11:aload_1         
		JVM INSTR monitorenter ;
	//    6   12:monitorenter    
		boolean flag = b("get_pad_type", d1);
	//    7   13:aload_0         
	//    8   14:ldc2            #352 <String "get_pad_type">
	//    9   17:aload_3         
	//   10   18:invokespecial   #129 <Method boolean b(String, d)>
	//   11   21:istore          4
		if(!flag)
			break MISSING_BLOCK_LABEL_71;
	//   12   23:iload           4
	//   13   25:ifeq            71
		try
		{
			d1 = ((d) (new JSONObject()));
	//   14   28:new             #33  <Class JSONObject>
	//   15   31:dup             
	//   16   32:invokespecial   #34  <Method void JSONObject()>
	//   17   35:astore_3        
			((JSONObject) (d1)).put("pad_type", ((int) (byte0)));
	//   18   36:aload_3         
	//   19   37:ldc2            #354 <String "pad_type">
	//   20   40:iload_2         
	//   21   41:invokevirtual   #46  <Method JSONObject JSONObject.put(String, int)>
	//   22   44:pop             
			com.irobot.home.c.a.b.d(a).a(((JSONObject) (d1)).toString());
	//   23   45:aload_0         
	//   24   46:getfield        #21  <Field a$b a>
	//   25   49:invokestatic    #96  <Method b com.irobot.home.c.a$b.d(a$b)>
	//   26   52:aload_3         
	//   27   53:invokevirtual   #130 <Method String JSONObject.toString()>
	//   28   56:invokevirtual   #132 <Method void com.irobot.home.c.b.a(String)>
			break MISSING_BLOCK_LABEL_71;
	//   29   59:goto            71
		}
		// Misplaced declaration of an exception variable
		catch(d d1) { }
	//   30   62:astore_3        
		a("Error while creating get pad type json.", ((JSONException) (d1)));
	//   31   63:aload_0         
	//   32   64:ldc2            #356 <String "Error while creating get pad type json.">
	//   33   67:aload_3         
	//   34   68:invokespecial   #60  <Method void a(String, JSONException)>
		g1;
	//   35   71:aload_1         
		JVM INSTR monitorexit ;
	//   36   72:monitorexit     
		return;
	//   37   73:return          
		d1;
	//   38   74:astore_3        
		g1;
	//   39   75:aload_1         
		JVM INSTR monitorexit ;
	//   40   76:monitorexit     
		throw d1;
	//   41   77:aload_3         
	//   42   78:athrow          
	}

	public void c(g g1, d d1)
	{
		synchronized(com.irobot.home.c.a.b.a(a).b())
	//*   0    0:aload_0         
	//*   1    1:getfield        #21  <Field a$b a>
	//*   2    4:invokestatic    #228 <Method com.irobot.home.c.c com.irobot.home.c.a$b.a(a$b)>
	//*   3    7:invokevirtual   #232 <Method Object c.b()>
	//*   4   10:astore_1        
	//*   5   11:aload_1         
	//*   6   12:monitorenter    
		{
			if(b("send_command", d1))
	//*   7   13:aload_0         
	//*   8   14:ldc2            #268 <String "send_command">
	//*   9   17:aload_2         
	//*  10   18:invokespecial   #129 <Method boolean b(String, d)>
	//*  11   21:ifeq            32
				a("locate");
	//   12   24:aload_0         
	//   13   25:ldc2            #358 <String "locate">
	//   14   28:invokespecial   #215 <Method boolean a(String)>
	//   15   31:pop             
		}
	//   16   32:aload_1         
	//   17   33:monitorexit     
		return;
	//   18   34:return          
		d1;
	//   19   35:astore_2        
		g1;
	//   20   36:aload_1         
		JVM INSTR monitorexit ;
	//   21   37:monitorexit     
		throw d1;
	//   22   38:aload_2         
	//   23   39:athrow          
	}

	public void d(g g1, byte byte0, d d1)
	{
		g1 = ((g) (com.irobot.home.c.a.b.a(a).b()));
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field a$b a>
	//    2    4:invokestatic    #228 <Method com.irobot.home.c.c com.irobot.home.c.a$b.a(a$b)>
	//    3    7:invokevirtual   #232 <Method Object c.b()>
	//    4   10:astore_1        
		g1;
	//    5   11:aload_1         
		JVM INSTR monitorenter ;
	//    6   12:monitorenter    
		boolean flag = b("get_robot_registered", d1);
	//    7   13:aload_0         
	//    8   14:ldc2            #360 <String "get_robot_registered">
	//    9   17:aload_3         
	//   10   18:invokespecial   #129 <Method boolean b(String, d)>
	//   11   21:istore          4
		if(!flag)
			break MISSING_BLOCK_LABEL_71;
	//   12   23:iload           4
	//   13   25:ifeq            71
		try
		{
			d1 = ((d) (new JSONObject()));
	//   14   28:new             #33  <Class JSONObject>
	//   15   31:dup             
	//   16   32:invokespecial   #34  <Method void JSONObject()>
	//   17   35:astore_3        
			((JSONObject) (d1)).put("robot_registered", ((int) (byte0)));
	//   18   36:aload_3         
	//   19   37:ldc2            #362 <String "robot_registered">
	//   20   40:iload_2         
	//   21   41:invokevirtual   #46  <Method JSONObject JSONObject.put(String, int)>
	//   22   44:pop             
			com.irobot.home.c.a.b.d(a).a(((JSONObject) (d1)).toString());
	//   23   45:aload_0         
	//   24   46:getfield        #21  <Field a$b a>
	//   25   49:invokestatic    #96  <Method b com.irobot.home.c.a$b.d(a$b)>
	//   26   52:aload_3         
	//   27   53:invokevirtual   #130 <Method String JSONObject.toString()>
	//   28   56:invokevirtual   #132 <Method void com.irobot.home.c.b.a(String)>
			break MISSING_BLOCK_LABEL_71;
	//   29   59:goto            71
		}
		// Misplaced declaration of an exception variable
		catch(d d1) { }
	//   30   62:astore_3        
		a("Error while creating get registered json.", ((JSONException) (d1)));
	//   31   63:aload_0         
	//   32   64:ldc2            #364 <String "Error while creating get registered json.">
	//   33   67:aload_3         
	//   34   68:invokespecial   #60  <Method void a(String, JSONException)>
		g1;
	//   35   71:aload_1         
		JVM INSTR monitorexit ;
	//   36   72:monitorexit     
		return;
	//   37   73:return          
		d1;
	//   38   74:astore_3        
		g1;
	//   39   75:aload_1         
		JVM INSTR monitorexit ;
	//   40   76:monitorexit     
		throw d1;
	//   41   77:aload_3         
	//   42   78:athrow          
	}

	public void d(g g1, d d1)
	{
		g1 = ((g) (com.irobot.home.c.a.b.a(a).b()));
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field a$b a>
	//    2    4:invokestatic    #228 <Method com.irobot.home.c.c com.irobot.home.c.a$b.a(a$b)>
	//    3    7:invokevirtual   #232 <Method Object c.b()>
	//    4   10:astore_1        
		g1;
	//    5   11:aload_1         
		JVM INSTR monitorenter ;
	//    6   12:monitorenter    
		boolean flag = com.irobot.home.c.a.b.d(a) instanceof s;
	//    7   13:aload_0         
	//    8   14:getfield        #21  <Field a$b a>
	//    9   17:invokestatic    #96  <Method b com.irobot.home.c.a$b.d(a$b)>
	//   10   20:instanceof      #254 <Class s>
	//   11   23:istore          5
		int j1 = 0;
	//   12   25:iconst_0        
	//   13   26:istore          4
		if(!flag) goto _L2; else goto _L1
	//   14   28:iload           5
	//   15   30:ifeq            188
_L1:
		int i1;
		s s1 = (s)com.irobot.home.c.a.b.d(a);
	//   16   33:aload_0         
	//   17   34:getfield        #21  <Field a$b a>
	//   18   37:invokestatic    #96  <Method b com.irobot.home.c.a$b.d(a$b)>
	//   19   40:checkcast       #254 <Class s>
	//   20   43:astore          6
		j1 = s1.d();
	//   21   45:aload           6
	//   22   47:invokevirtual   #366 <Method int com.irobot.home.c.s.d()>
	//   23   50:istore          4
		i1 = s1.e();
	//   24   52:aload           6
	//   25   54:invokevirtual   #368 <Method int s.e()>
	//   26   57:istore_3        
	//*  27   58:goto            61
_L4:
		if(b("software_package_upload", d1))
	//*  28   61:aload_0         
	//*  29   62:ldc1            #52  <String "software_package_upload">
	//*  30   64:aload_2         
	//*  31   65:invokespecial   #129 <Method boolean b(String, d)>
	//*  32   68:ifeq            110
		{
			com.irobot.home.c.a.b.k(a).l();
	//   33   71:aload_0         
	//   34   72:getfield        #21  <Field a$b a>
	//   35   75:invokestatic    #371 <Method g a$b.k(a$b)>
	//   36   78:invokevirtual   #374 <Method void g.l()>
			d1 = ((d) (a(UpdateProgressState.Complete, j1, j1)));
	//   37   81:aload_0         
	//   38   82:getstatic       #377 <Field UpdateProgressState UpdateProgressState.Complete>
	//   39   85:iload           4
	//   40   87:iload           4
	//   41   89:invokespecial   #265 <Method JSONObject a(UpdateProgressState, int, int)>
	//   42   92:astore_2        
			com.irobot.home.c.a.b.d(a).a(((JSONObject) (d1)).toString());
	//   43   93:aload_0         
	//   44   94:getfield        #21  <Field a$b a>
	//   45   97:invokestatic    #96  <Method b com.irobot.home.c.a$b.d(a$b)>
	//   46  100:aload_2         
	//   47  101:invokevirtual   #130 <Method String JSONObject.toString()>
	//   48  104:invokevirtual   #132 <Method void com.irobot.home.c.b.a(String)>
			break MISSING_BLOCK_LABEL_161;
	//   49  107:goto            161
		}
		d1 = ((d) (a(UpdateProgressState.Error, i1, j1)));
	//   50  110:aload_0         
	//   51  111:getstatic       #380 <Field UpdateProgressState UpdateProgressState.Error>
	//   52  114:iload_3         
	//   53  115:iload           4
	//   54  117:invokespecial   #265 <Method JSONObject a(UpdateProgressState, int, int)>
	//   55  120:astore_2        
		NetworkResponse networkresponse = NetworkResponse.create(com.irobot.home.c.a.b.b(a), ((com.irobot.core.NetworkAddress) (null)), "software_package_upload", 200);
	//   56  121:aload_0         
	//   57  122:getfield        #21  <Field a$b a>
	//   58  125:invokestatic    #142 <Method AssetId a$b.b(a$b)>
	//   59  128:aconst_null     
	//   60  129:ldc1            #52  <String "software_package_upload">
	//   61  131:sipush          200
	//   62  134:invokestatic    #147 <Method NetworkResponse NetworkResponse.create(AssetId, com.irobot.core.NetworkAddress, String, int)>
	//   63  137:astore          6
		((NetworkJsonCallback)com.irobot.home.c.a.b.j(a).getNetworkCallback()).onSuccess(networkresponse, ((JSONObject) (d1)).toString());
	//   64  139:aload_0         
	//   65  140:getfield        #21  <Field a$b a>
	//   66  143:invokestatic    #151 <Method NetworkSessionCallback a$b.j(a$b)>
	//   67  146:invokevirtual   #157 <Method com.irobot.core.NetworkCallback NetworkSessionCallback.getNetworkCallback()>
	//   68  149:checkcast       #159 <Class NetworkJsonCallback>
	//   69  152:aload           6
	//   70  154:aload_2         
	//   71  155:invokevirtual   #130 <Method String JSONObject.toString()>
	//   72  158:invokevirtual   #163 <Method void NetworkJsonCallback.onSuccess(NetworkResponse, String)>
		((IRobotApplication)com.irobot.home.c.a.a(a.a).get()).m();
	//   73  161:aload_0         
	//   74  162:getfield        #21  <Field a$b a>
	//   75  165:getfield        #383 <Field com.irobot.home.c.a com.irobot.home.c.a$b.a>
	//   76  168:invokestatic    #386 <Method WeakReference com.irobot.home.c.a.a(com.irobot.home.c.a)>
	//   77  171:invokevirtual   #391 <Method Object WeakReference.get()>
	//   78  174:checkcast       #393 <Class IRobotApplication>
	//   79  177:invokevirtual   #396 <Method void IRobotApplication.m()>
		g1;
	//   80  180:aload_1         
		JVM INSTR monitorexit ;
	//   81  181:monitorexit     
		return;
	//   82  182:return          
		d1;
	//   83  183:astore_2        
		g1;
	//   84  184:aload_1         
		JVM INSTR monitorexit ;
	//   85  185:monitorexit     
		throw d1;
	//   86  186:aload_2         
	//   87  187:athrow          
_L2:
		i1 = 0;
	//   88  188:iconst_0        
	//   89  189:istore_3        
		if(true) goto _L4; else goto _L3
	//   90  190:goto            61
_L3:
	}

	public void e(g g1, d d1)
	{
		synchronized(com.irobot.home.c.a.b.a(a).b())
	//*   0    0:aload_0         
	//*   1    1:getfield        #21  <Field a$b a>
	//*   2    4:invokestatic    #228 <Method com.irobot.home.c.c com.irobot.home.c.a$b.a(a$b)>
	//*   3    7:invokevirtual   #232 <Method Object c.b()>
	//*   4   10:astore_1        
	//*   5   11:aload_1         
	//*   6   12:monitorenter    
		{
			a("set_preference", d1);
	//    7   13:aload_0         
	//    8   14:ldc2            #398 <String "set_preference">
	//    9   17:aload_2         
	//   10   18:invokespecial   #400 <Method void a(String, d)>
		}
	//   11   21:aload_1         
	//   12   22:monitorexit     
		return;
	//   13   23:return          
		d1;
	//   14   24:astore_2        
		g1;
	//   15   25:aload_1         
		JVM INSTR monitorexit ;
	//   16   26:monitorexit     
		throw d1;
	//   17   27:aload_2         
	//   18   28:athrow          
	}

	public void f(g g1, d d1)
	{
		synchronized(com.irobot.home.c.a.b.a(a).b())
	//*   0    0:aload_0         
	//*   1    1:getfield        #21  <Field a$b a>
	//*   2    4:invokestatic    #228 <Method com.irobot.home.c.c com.irobot.home.c.a$b.a(a$b)>
	//*   3    7:invokevirtual   #232 <Method Object c.b()>
	//*   4   10:astore_1        
	//*   5   11:aload_1         
	//*   6   12:monitorenter    
		{
			a("set_volume", d1);
	//    7   13:aload_0         
	//    8   14:ldc2            #402 <String "set_volume">
	//    9   17:aload_2         
	//   10   18:invokespecial   #400 <Method void a(String, d)>
		}
	//   11   21:aload_1         
	//   12   22:monitorexit     
		return;
	//   13   23:return          
		d1;
	//   14   24:astore_2        
		g1;
	//   15   25:aload_1         
		JVM INSTR monitorexit ;
	//   16   26:monitorexit     
		throw d1;
	//   17   27:aload_2         
	//   18   28:athrow          
	}

	public void g(g g1, d d1)
	{
		synchronized(com.irobot.home.c.a.b.a(a).b())
	//*   0    0:aload_0         
	//*   1    1:getfield        #21  <Field a$b a>
	//*   2    4:invokestatic    #228 <Method com.irobot.home.c.c com.irobot.home.c.a$b.a(a$b)>
	//*   3    7:invokevirtual   #232 <Method Object c.b()>
	//*   4   10:astore_1        
	//*   5   11:aload_1         
	//*   6   12:monitorenter    
		{
			a("set_name", d1);
	//    7   13:aload_0         
	//    8   14:ldc2            #405 <String "set_name">
	//    9   17:aload_2         
	//   10   18:invokespecial   #400 <Method void a(String, d)>
		}
	//   11   21:aload_1         
	//   12   22:monitorexit     
		return;
	//   13   23:return          
		d1;
	//   14   24:astore_2        
		g1;
	//   15   25:aload_1         
		JVM INSTR monitorexit ;
	//   16   26:monitorexit     
		throw d1;
	//   17   27:aload_2         
	//   18   28:athrow          
	}

	public void h(g g1, d d1)
	{
		synchronized(com.irobot.home.c.a.b.a(a).b())
	//*   0    0:aload_0         
	//*   1    1:getfield        #21  <Field a$b a>
	//*   2    4:invokestatic    #228 <Method com.irobot.home.c.c com.irobot.home.c.a$b.a(a$b)>
	//*   3    7:invokevirtual   #232 <Method Object c.b()>
	//*   4   10:astore_1        
	//*   5   11:aload_1         
	//*   6   12:monitorenter    
		{
			a("set_room_confine", d1);
	//    7   13:aload_0         
	//    8   14:ldc2            #408 <String "set_room_confine">
	//    9   17:aload_2         
	//   10   18:invokespecial   #400 <Method void a(String, d)>
		}
	//   11   21:aload_1         
	//   12   22:monitorexit     
		return;
	//   13   23:return          
		d1;
	//   14   24:astore_2        
		g1;
	//   15   25:aload_1         
		JVM INSTR monitorexit ;
	//   16   26:monitorexit     
		throw d1;
	//   17   27:aload_2         
	//   18   28:athrow          
	}

	public void i(g g1, d d1)
	{
		synchronized(com.irobot.home.c.a.b.a(a).b())
	//*   0    0:aload_0         
	//*   1    1:getfield        #21  <Field a$b a>
	//*   2    4:invokestatic    #228 <Method com.irobot.home.c.c com.irobot.home.c.a$b.a(a$b)>
	//*   3    7:invokevirtual   #232 <Method Object c.b()>
	//*   4   10:astore_1        
	//*   5   11:aload_1         
	//*   6   12:monitorenter    
		{
			if(b("send_command", d1))
	//*   7   13:aload_0         
	//*   8   14:ldc2            #268 <String "send_command">
	//*   9   17:aload_2         
	//*  10   18:invokespecial   #129 <Method boolean b(String, d)>
	//*  11   21:ifeq            32
				a("spot_clean");
	//   12   24:aload_0         
	//   13   25:ldc2            #411 <String "spot_clean">
	//   14   28:invokespecial   #215 <Method boolean a(String)>
	//   15   31:pop             
		}
	//   16   32:aload_1         
	//   17   33:monitorexit     
		return;
	//   18   34:return          
		d1;
	//   19   35:astore_2        
		g1;
	//   20   36:aload_1         
		JVM INSTR monitorexit ;
	//   21   37:monitorexit     
		throw d1;
	//   22   38:aload_2         
	//   23   39:athrow          
	}

	public void j(g g1, d d1)
	{
		synchronized(com.irobot.home.c.a.b.a(a).b())
	//*   0    0:aload_0         
	//*   1    1:getfield        #21  <Field a$b a>
	//*   2    4:invokestatic    #228 <Method com.irobot.home.c.c com.irobot.home.c.a$b.a(a$b)>
	//*   3    7:invokevirtual   #232 <Method Object c.b()>
	//*   4   10:astore_1        
	//*   5   11:aload_1         
	//*   6   12:monitorenter    
		{
			if(b("send_command", d1))
	//*   7   13:aload_0         
	//*   8   14:ldc2            #268 <String "send_command">
	//*   9   17:aload_2         
	//*  10   18:invokespecial   #129 <Method boolean b(String, d)>
	//*  11   21:ifeq            32
				a("start_clean");
	//   12   24:aload_0         
	//   13   25:ldc2            #413 <String "start_clean">
	//   14   28:invokespecial   #215 <Method boolean a(String)>
	//   15   31:pop             
		}
	//   16   32:aload_1         
	//   17   33:monitorexit     
		return;
	//   18   34:return          
		d1;
	//   19   35:astore_2        
		g1;
	//   20   36:aload_1         
		JVM INSTR monitorexit ;
	//   21   37:monitorexit     
		throw d1;
	//   22   38:aload_2         
	//   23   39:athrow          
	}

	public void k(g g1, d d1)
	{
		synchronized(com.irobot.home.c.a.b.a(a).b())
	//*   0    0:aload_0         
	//*   1    1:getfield        #21  <Field a$b a>
	//*   2    4:invokestatic    #228 <Method com.irobot.home.c.c com.irobot.home.c.a$b.a(a$b)>
	//*   3    7:invokevirtual   #232 <Method Object c.b()>
	//*   4   10:astore_1        
	//*   5   11:aload_1         
	//*   6   12:monitorenter    
		{
			if(b("send_command", d1))
	//*   7   13:aload_0         
	//*   8   14:ldc2            #268 <String "send_command">
	//*   9   17:aload_2         
	//*  10   18:invokespecial   #129 <Method boolean b(String, d)>
	//*  11   21:ifeq            32
				a("stop_clean");
	//   12   24:aload_0         
	//   13   25:ldc2            #415 <String "stop_clean">
	//   14   28:invokespecial   #215 <Method boolean a(String)>
	//   15   31:pop             
		}
	//   16   32:aload_1         
	//   17   33:monitorexit     
		return;
	//   18   34:return          
		d1;
	//   19   35:astore_2        
		g1;
	//   20   36:aload_1         
		JVM INSTR monitorexit ;
	//   21   37:monitorexit     
		throw d1;
	//   22   38:aload_2         
	//   23   39:athrow          
	}

	public void l(g g1, d d1)
	{
		g1 = ((g) (com.irobot.home.c.a.b.a(a).b()));
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field a$b a>
	//    2    4:invokestatic    #228 <Method com.irobot.home.c.c com.irobot.home.c.a$b.a(a$b)>
	//    3    7:invokevirtual   #232 <Method Object c.b()>
	//    4   10:astore_1        
		g1;
	//    5   11:aload_1         
		JVM INSTR monitorenter ;
	//    6   12:monitorenter    
		if(!b("send_command", d1))
			break MISSING_BLOCK_LABEL_69;
	//    7   13:aload_0         
	//    8   14:ldc2            #268 <String "send_command">
	//    9   17:aload_2         
	//   10   18:invokespecial   #129 <Method boolean b(String, d)>
	//   11   21:ifeq            69
		d1 = ((d) (new JSONObject()));
	//   12   24:new             #33  <Class JSONObject>
	//   13   27:dup             
	//   14   28:invokespecial   #34  <Method void JSONObject()>
	//   15   31:astore_2        
		try
		{
			((JSONObject) (d1)).put("command", "reset");
	//   16   32:aload_2         
	//   17   33:ldc2            #417 <String "command">
	//   18   36:ldc2            #419 <String "reset">
	//   19   39:invokevirtual   #55  <Method JSONObject JSONObject.put(String, Object)>
	//   20   42:pop             
			com.irobot.home.c.a.b.d(a).a(((JSONObject) (d1)).toString());
	//   21   43:aload_0         
	//   22   44:getfield        #21  <Field a$b a>
	//   23   47:invokestatic    #96  <Method b com.irobot.home.c.a$b.d(a$b)>
	//   24   50:aload_2         
	//   25   51:invokevirtual   #130 <Method String JSONObject.toString()>
	//   26   54:invokevirtual   #132 <Method void com.irobot.home.c.b.a(String)>
			break MISSING_BLOCK_LABEL_69;
	//   27   57:goto            69
		}
		// Misplaced declaration of an exception variable
		catch(d d1) { }
	//   28   60:astore_2        
		a("Error while creating reset json.", ((JSONException) (d1)));
	//   29   61:aload_0         
	//   30   62:ldc2            #421 <String "Error while creating reset json.">
	//   31   65:aload_2         
	//   32   66:invokespecial   #60  <Method void a(String, JSONException)>
		g1;
	//   33   69:aload_1         
		JVM INSTR monitorexit ;
	//   34   70:monitorexit     
		return;
	//   35   71:return          
		d1;
	//   36   72:astore_2        
		g1;
	//   37   73:aload_1         
		JVM INSTR monitorexit ;
	//   38   74:monitorexit     
		throw d1;
	//   39   75:aload_2         
	//   40   76:athrow          
	}

	public void m(g g1, d d1)
	{
		synchronized(com.irobot.home.c.a.b.a(a).b())
	//*   0    0:aload_0         
	//*   1    1:getfield        #21  <Field a$b a>
	//*   2    4:invokestatic    #228 <Method com.irobot.home.c.c com.irobot.home.c.a$b.a(a$b)>
	//*   3    7:invokevirtual   #232 <Method Object c.b()>
	//*   4   10:astore_1        
	//*   5   11:aload_1         
	//*   6   12:monitorenter    
		{
			if(b("send_command", d1))
	//*   7   13:aload_0         
	//*   8   14:ldc2            #268 <String "send_command">
	//*   9   17:aload_2         
	//*  10   18:invokespecial   #129 <Method boolean b(String, d)>
	//*  11   21:ifeq            32
				a("power_off");
	//   12   24:aload_0         
	//   13   25:ldc2            #423 <String "power_off">
	//   14   28:invokespecial   #215 <Method boolean a(String)>
	//   15   31:pop             
		}
	//   16   32:aload_1         
	//   17   33:monitorexit     
		return;
	//   18   34:return          
		d1;
	//   19   35:astore_2        
		g1;
	//   20   36:aload_1         
		JVM INSTR monitorexit ;
	//   21   37:monitorexit     
		throw d1;
	//   22   38:aload_2         
	//   23   39:athrow          
	}

	public void n(g g1, d d1)
	{
		synchronized(com.irobot.home.c.a.b.a(a).b())
	//*   0    0:aload_0         
	//*   1    1:getfield        #21  <Field a$b a>
	//*   2    4:invokestatic    #228 <Method com.irobot.home.c.c com.irobot.home.c.a$b.a(a$b)>
	//*   3    7:invokevirtual   #232 <Method Object c.b()>
	//*   4   10:astore_1        
	//*   5   11:aload_1         
	//*   6   12:monitorenter    
		{
			a("set_robot_registered", d1);
	//    7   13:aload_0         
	//    8   14:ldc2            #426 <String "set_robot_registered">
	//    9   17:aload_2         
	//   10   18:invokespecial   #400 <Method void a(String, d)>
		}
	//   11   21:aload_1         
	//   12   22:monitorexit     
		return;
	//   13   23:return          
		d1;
	//   14   24:astore_2        
		g1;
	//   15   25:aload_1         
		JVM INSTR monitorexit ;
	//   16   26:monitorexit     
		throw d1;
	//   17   27:aload_2         
	//   18   28:athrow          
	}

	public void o(g g1, d d1)
	{
		if(a(g1, d1, "didConnectRobot"))
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:aload_2         
	//*   3    3:ldc2            #429 <String "didConnectRobot">
	//*   4    6:invokespecial   #431 <Method boolean a(g, d, String)>
	//*   5    9:ifeq            13
		{
			return;
	//    6   12:return          
		} else
		{
			com.irobot.home.c.a.b.a(a).a(com.irobot.home.c.a.b.k(a));
	//    7   13:aload_0         
	//    8   14:getfield        #21  <Field a$b a>
	//    9   17:invokestatic    #228 <Method com.irobot.home.c.c com.irobot.home.c.a$b.a(a$b)>
	//   10   20:aload_0         
	//   11   21:getfield        #21  <Field a$b a>
	//   12   24:invokestatic    #371 <Method g a$b.k(a$b)>
	//   13   27:invokevirtual   #433 <Method void com.irobot.home.c.c.a(g)>
			com.irobot.home.c.a.b.k(a).l();
	//   14   30:aload_0         
	//   15   31:getfield        #21  <Field a$b a>
	//   16   34:invokestatic    #371 <Method g a$b.k(a$b)>
	//   17   37:invokevirtual   #374 <Method void g.l()>
			return;
	//   18   40:return          
		}
	}

	public void p(g g1, d d1)
	{
		com.irobot.home.c.a.b.b(a, false);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field a$b a>
	//    2    4:iconst_0        
	//    3    5:invokestatic    #437 <Method boolean a$b.b(a$b, boolean)>
	//    4    8:pop             
		com.irobot.home.c.a.b.h(a).a();
	//    5    9:aload_0         
	//    6   10:getfield        #21  <Field a$b a>
	//    7   13:invokestatic    #440 <Method a$b$b a$b.h(a$b)>
	//    8   16:invokevirtual   #444 <Method void com.irobot.home.c.a$b$b.a()>
		if(com.irobot.home.c.a.b.i(a) != null)
	//*   9   19:aload_0         
	//*  10   20:getfield        #21  <Field a$b a>
	//*  11   23:invokestatic    #447 <Method Thread a$b.i(a$b)>
	//*  12   26:ifnull          39
			com.irobot.home.c.a.b.i(a).interrupt();
	//   13   29:aload_0         
	//   14   30:getfield        #21  <Field a$b a>
	//   15   33:invokestatic    #447 <Method Thread a$b.i(a$b)>
	//   16   36:invokevirtual   #452 <Method void Thread.interrupt()>
		com.irobot.home.c.a.b.c(a).clear();
	//   17   39:aload_0         
	//   18   40:getfield        #21  <Field a$b a>
	//   19   43:invokestatic    #455 <Method LinkedBlockingDeque com.irobot.home.c.a$b.c(a$b)>
	//   20   46:invokevirtual   #460 <Method void LinkedBlockingDeque.clear()>
		com.irobot.home.c.a.b.l(a);
	//   21   49:aload_0         
	//   22   50:getfield        #21  <Field a$b a>
	//   23   53:invokestatic    #462 <Method void a$b.l(a$b)>
		com.irobot.home.c.a.b.j(a).disconnected();
	//   24   56:aload_0         
	//   25   57:getfield        #21  <Field a$b a>
	//   26   60:invokestatic    #151 <Method NetworkSessionCallback a$b.j(a$b)>
	//   27   63:invokevirtual   #465 <Method void NetworkSessionCallback.disconnected()>
		com.irobot.home.c.a.b.a(a).c().release();
	//   28   66:aload_0         
	//   29   67:getfield        #21  <Field a$b a>
	//   30   70:invokestatic    #228 <Method com.irobot.home.c.c com.irobot.home.c.a$b.a(a$b)>
	//   31   73:invokevirtual   #468 <Method Semaphore com.irobot.home.c.c.c()>
	//   32   76:invokevirtual   #473 <Method void Semaphore.release()>
	//   33   79:return          
	}

	public void q(g g1, d d1)
	{
		Object obj = com.irobot.home.c.a.b.a(a).b();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field a$b a>
	//    2    4:invokestatic    #228 <Method com.irobot.home.c.c com.irobot.home.c.a$b.a(a$b)>
	//    3    7:invokevirtual   #232 <Method Object c.b()>
	//    4   10:astore          4
		obj;
	//    5   12:aload           4
		JVM INSTR monitorenter ;
	//    6   14:monitorenter    
		com.irobot.a.d.a a1;
		if(com.irobot.home.c.a.b.d(a) != null)
	//*   7   15:aload_0         
	//*   8   16:getfield        #21  <Field a$b a>
	//*   9   19:invokestatic    #96  <Method b com.irobot.home.c.a$b.d(a$b)>
	//*  10   22:ifnull          30
			a(d1);
	//   11   25:aload_0         
	//   12   26:aload_2         
	//   13   27:invokespecial   #220 <Method void a(d)>
		a1 = d1.a();
	//   14   30:aload_2         
	//   15   31:invokevirtual   #71  <Method com.irobot.a.d$a d.a()>
	//   16   34:astore          5
		boolean flag;
		if(a1 != com.irobot.a.d.a.ALBluetoothGattAuthorizationError && a1 != com.irobot.a.d.a.ALBluetoothGattError && a1 != com.irobot.a.d.a.ALOperationFailedError)
	//*  17   36:aload           5
	//*  18   38:getstatic       #478 <Field com.irobot.a.d$a com.irobot.a.d$a.ALBluetoothGattAuthorizationError>
	//*  19   41:if_acmpeq       100
	//*  20   44:aload           5
	//*  21   46:getstatic       #481 <Field com.irobot.a.d$a com.irobot.a.d$a.ALBluetoothGattError>
	//*  22   49:if_acmpeq       100
	//*  23   52:aload           5
	//*  24   54:getstatic       #484 <Field com.irobot.a.d$a com.irobot.a.d$a.ALOperationFailedError>
	//*  25   57:if_acmpne       95
	//*  26   60:goto            100
	//*  27   63:iload_3         
	//*  28   64:ifeq            85
	//*  29   67:aload_0         
	//*  30   68:getfield        #21  <Field a$b a>
	//*  31   71:invokestatic    #487 <Method boolean a$b.m(a$b)>
	//*  32   74:ifeq            79
	//*  33   77:aconst_null     
	//*  34   78:astore_2        
	//*  35   79:aload_0         
	//*  36   80:aload_1         
	//*  37   81:aload_2         
	//*  38   82:invokevirtual   #489 <Method void p(g, d)>
	//*  39   85:aload           4
	//*  40   87:monitorexit     
	//*  41   88:return          
	//*  42   89:astore_1        
	//*  43   90:aload           4
	//*  44   92:monitorexit     
	//*  45   93:aload_1         
	//*  46   94:athrow          
			flag = false;
	//   47   95:iconst_0        
	//   48   96:istore_3        
		else
	//*  49   97:goto            63
			flag = true;
	//   50  100:iconst_1        
	//   51  101:istore_3        
		if(!flag)
			break MISSING_BLOCK_LABEL_85;
		if(com.irobot.home.c.a.b.m(a))
			d1 = null;
		p(g1, d1);
		obj;
		JVM INSTR monitorexit ;
		return;
		g1;
		obj;
		JVM INSTR monitorexit ;
		throw g1;
	//*  52  102:goto            63
	}

	public void r(g g1, d d1)
	{
		if(a(g1, d1, "didIdentifyRobot"))
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:aload_2         
	//*   3    3:ldc2            #492 <String "didIdentifyRobot">
	//*   4    6:invokespecial   #431 <Method boolean a(g, d, String)>
	//*   5    9:ifeq            13
			return;
	//    6   12:return          
		if(com.irobot.home.c.a.b.e(a))
	//*   7   13:aload_0         
	//*   8   14:getfield        #21  <Field a$b a>
	//*   9   17:invokestatic    #494 <Method boolean a$b.e(a$b)>
	//*  10   20:ifeq            152
		{
			com.irobot.home.c.a.b.g(a).removeCallbacks(com.irobot.home.c.a.b.f(a));
	//   11   23:aload_0         
	//   12   24:getfield        #21  <Field a$b a>
	//   13   27:invokestatic    #497 <Method Handler com.irobot.home.c.a$b.g(a$b)>
	//   14   30:aload_0         
	//   15   31:getfield        #21  <Field a$b a>
	//   16   34:invokestatic    #500 <Method Runnable a$b.f(a$b)>
	//   17   37:invokevirtual   #506 <Method void Handler.removeCallbacks(Runnable)>
			com.irobot.home.c.a.b.a(a, false);
	//   18   40:aload_0         
	//   19   41:getfield        #21  <Field a$b a>
	//   20   44:iconst_0        
	//   21   45:invokestatic    #508 <Method boolean com.irobot.home.c.a$b.a(a$b, boolean)>
	//   22   48:pop             
			com.irobot.home.c.a.b.h(a).b();
	//   23   49:aload_0         
	//   24   50:getfield        #21  <Field a$b a>
	//   25   53:invokestatic    #440 <Method a$b$b a$b.h(a$b)>
	//   26   56:invokevirtual   #510 <Method void a$b$b.b()>
			g1 = ((g) (a));
	//   27   59:aload_0         
	//   28   60:getfield        #21  <Field a$b a>
	//   29   63:astore_1        
			d1 = ((d) (com.irobot.home.c.a.b.h(a)));
	//   30   64:aload_0         
	//   31   65:getfield        #21  <Field a$b a>
	//   32   68:invokestatic    #440 <Method a$b$b a$b.h(a$b)>
	//   33   71:astore_2        
			StringBuilder stringbuilder = new StringBuilder();
	//   34   72:new             #103 <Class StringBuilder>
	//   35   75:dup             
	//   36   76:invokespecial   #104 <Method void StringBuilder()>
	//   37   79:astore_3        
			stringbuilder.append("OperationQueue:");
	//   38   80:aload_3         
	//   39   81:ldc2            #512 <String "OperationQueue:">
	//   40   84:invokevirtual   #110 <Method StringBuilder StringBuilder.append(String)>
	//   41   87:pop             
			stringbuilder.append(com.irobot.home.c.a.b.b(a).getId());
	//   42   88:aload_3         
	//   43   89:aload_0         
	//   44   90:getfield        #21  <Field a$b a>
	//   45   93:invokestatic    #142 <Method AssetId a$b.b(a$b)>
	//   46   96:invokevirtual   #517 <Method String AssetId.getId()>
	//   47   99:invokevirtual   #110 <Method StringBuilder StringBuilder.append(String)>
	//   48  102:pop             
			com.irobot.home.c.a.b.a(((a.b) (g1)), new Thread(((Runnable) (d1)), com.irobot.home.r.a.a(stringbuilder.toString())));
	//   49  103:aload_1         
	//   50  104:new             #449 <Class Thread>
	//   51  107:dup             
	//   52  108:aload_2         
	//   53  109:aload_3         
	//   54  110:invokevirtual   #119 <Method String StringBuilder.toString()>
	//   55  113:invokestatic    #522 <Method String a.a(String)>
	//   56  116:invokespecial   #525 <Method void Thread(Runnable, String)>
	//   57  119:invokestatic    #528 <Method Thread com.irobot.home.c.a$b.a(a$b, Thread)>
	//   58  122:pop             
			com.irobot.home.c.a.b.i(a).start();
	//   59  123:aload_0         
	//   60  124:getfield        #21  <Field a$b a>
	//   61  127:invokestatic    #447 <Method Thread a$b.i(a$b)>
	//   62  130:invokevirtual   #531 <Method void Thread.start()>
			com.irobot.home.c.a.b.j(a).connected();
	//   63  133:aload_0         
	//   64  134:getfield        #21  <Field a$b a>
	//   65  137:invokestatic    #151 <Method NetworkSessionCallback a$b.j(a$b)>
	//   66  140:invokevirtual   #534 <Method void NetworkSessionCallback.connected()>
			com.irobot.home.c.a.b.b(a, true);
	//   67  143:aload_0         
	//   68  144:getfield        #21  <Field a$b a>
	//   69  147:iconst_1        
	//   70  148:invokestatic    #437 <Method boolean a$b.b(a$b, boolean)>
	//   71  151:pop             
		}
		a("get_name", "robot_name", com.irobot.home.c.a.b.k(a).a());
	//   72  152:aload_0         
	//   73  153:ldc2            #325 <String "get_name">
	//   74  156:ldc2            #327 <String "robot_name">
	//   75  159:aload_0         
	//   76  160:getfield        #21  <Field a$b a>
	//   77  163:invokestatic    #371 <Method g a$b.k(a$b)>
	//   78  166:invokevirtual   #536 <Method String g.a()>
	//   79  169:invokespecial   #538 <Method void a(String, String, String)>
		a("get_software_version", "software_version", com.irobot.home.c.a.a(a.a, com.irobot.home.c.a.b.k(a)));
	//   80  172:aload_0         
	//   81  173:ldc2            #540 <String "get_software_version">
	//   82  176:ldc2            #542 <String "software_version">
	//   83  179:aload_0         
	//   84  180:getfield        #21  <Field a$b a>
	//   85  183:getfield        #383 <Field com.irobot.home.c.a com.irobot.home.c.a$b.a>
	//   86  186:aload_0         
	//   87  187:getfield        #21  <Field a$b a>
	//   88  190:invokestatic    #371 <Method g a$b.k(a$b)>
	//   89  193:invokestatic    #545 <Method String com.irobot.home.c.a.a(com.irobot.home.c.a, g)>
	//   90  196:invokespecial   #538 <Method void a(String, String, String)>
		a("get_serial_number", "serial_number", com.irobot.home.c.a.b.k(a).c());
	//   91  199:aload_0         
	//   92  200:ldc2            #547 <String "get_serial_number">
	//   93  203:ldc2            #549 <String "serial_number">
	//   94  206:aload_0         
	//   95  207:getfield        #21  <Field a$b a>
	//   96  210:invokestatic    #371 <Method g a$b.k(a$b)>
	//   97  213:invokevirtual   #550 <Method String g.c()>
	//   98  216:invokespecial   #538 <Method void a(String, String, String)>
		com.irobot.home.c.a.b.k(a).d();
	//   99  219:aload_0         
	//  100  220:getfield        #21  <Field a$b a>
	//  101  223:invokestatic    #371 <Method g a$b.k(a$b)>
	//  102  226:invokevirtual   #552 <Method String g.d()>
	//  103  229:pop             
		a("get_sku", "sku", com.irobot.home.c.a.a(a.a, com.irobot.home.c.a.b.k(a).d()));
	//  104  230:aload_0         
	//  105  231:ldc2            #554 <String "get_sku">
	//  106  234:ldc2            #556 <String "sku">
	//  107  237:aload_0         
	//  108  238:getfield        #21  <Field a$b a>
	//  109  241:getfield        #383 <Field com.irobot.home.c.a com.irobot.home.c.a$b.a>
	//  110  244:aload_0         
	//  111  245:getfield        #21  <Field a$b a>
	//  112  248:invokestatic    #371 <Method g a$b.k(a$b)>
	//  113  251:invokevirtual   #552 <Method String g.d()>
	//  114  254:invokestatic    #559 <Method String com.irobot.home.c.a.a(com.irobot.home.c.a, String)>
	//  115  257:invokespecial   #538 <Method void a(String, String, String)>
	//  116  260:return          
	}

	final a.b a;

	private a$b$a(a.b b1)
	{
		a = b1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #21  <Field a$b a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #24  <Method void Object()>
	//    5    9:return          
	}

	a$b$a(a.b b1, a._cls1 _pcls1)
	{
		this(b1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #28  <Method void a$b$a(a$b)>
	//    3    5:return          
	}
}
