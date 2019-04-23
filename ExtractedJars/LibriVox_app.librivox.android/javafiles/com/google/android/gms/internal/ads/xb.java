// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Looper;
import android.security.NetworkSecurityPolicy;
import com.google.android.gms.ads.internal.aw;
import com.google.android.gms.common.util.e;
import com.google.android.gms.common.util.o;
import java.util.*;
import java.util.concurrent.*;
import org.json.*;

// Referenced classes of package com.google.android.gms.internal.ads:
//			xa, xe, xd, abi, 
//			abe, wx, xc, wh, 
//			p, bwk, m, bqp

public final class xb
	implements xa
{

	public xb()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #49  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #4   <Class Object>
	//    4    8:dup             
	//    5    9:invokespecial   #49  <Method void Object()>
	//    6   12:putfield        #51  <Field Object a>
	//    7   15:aload_0         
	//    8   16:new             #53  <Class ArrayList>
	//    9   19:dup             
	//   10   20:invokespecial   #54  <Method void ArrayList()>
	//   11   23:putfield        #56  <Field List c>
		e = null;
	//   12   26:aload_0         
	//   13   27:aconst_null     
	//   14   28:putfield        #58  <Field bqp e>
		h = false;
	//   15   31:aload_0         
	//   16   32:iconst_0        
	//   17   33:putfield        #60  <Field boolean h>
		i = true;
	//   18   36:aload_0         
	//   19   37:iconst_1        
	//   20   38:putfield        #62  <Field boolean i>
		l = false;
	//   21   41:aload_0         
	//   22   42:iconst_0        
	//   23   43:putfield        #64  <Field boolean l>
		m = "";
	//   24   46:aload_0         
	//   25   47:ldc1            #66  <String "">
	//   26   49:putfield        #68  <Field String m>
		n = 0L;
	//   27   52:aload_0         
	//   28   53:lconst_0        
	//   29   54:putfield        #70  <Field long n>
		o = 0L;
	//   30   57:aload_0         
	//   31   58:lconst_0        
	//   32   59:putfield        #72  <Field long o>
		p = 0L;
	//   33   62:aload_0         
	//   34   63:lconst_0        
	//   35   64:putfield        #74  <Field long p>
		q = -1;
	//   36   67:aload_0         
	//   37   68:iconst_m1       
	//   38   69:putfield        #76  <Field int q>
		r = 0;
	//   39   72:aload_0         
	//   40   73:iconst_0        
	//   41   74:putfield        #78  <Field int r>
		s = Collections.emptySet();
	//   42   77:aload_0         
	//   43   78:invokestatic    #84  <Method Set Collections.emptySet()>
	//   44   81:putfield        #86  <Field Set s>
		t = new JSONObject();
	//   45   84:aload_0         
	//   46   85:new             #88  <Class JSONObject>
	//   47   88:dup             
	//   48   89:invokespecial   #89  <Method void JSONObject()>
	//   49   92:putfield        #91  <Field JSONObject t>
		u = true;
	//   50   95:aload_0         
	//   51   96:iconst_1        
	//   52   97:putfield        #93  <Field boolean u>
		v = true;
	//   53  100:aload_0         
	//   54  101:iconst_1        
	//   55  102:putfield        #95  <Field boolean v>
	//   56  105:return          
	}

	private final void a(Bundle bundle)
	{
		xe.a.execute(((Runnable) (new xd(this))));
	//    0    0:getstatic       #102 <Field abi xe.a>
	//    1    3:new             #104 <Class xd>
	//    2    6:dup             
	//    3    7:aload_0         
	//    4    8:invokespecial   #107 <Method void xd(xb)>
	//    5   11:invokeinterface #113 <Method void abi.execute(Runnable)>
	//    6   16:return          
	}

	private final void o()
	{
		abe abe1 = d;
	//    0    0:aload_0         
	//    1    1:getfield        #123 <Field abe d>
	//    2    4:astore_1        
		if(abe1 == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       10
			return;
	//    5    9:return          
		if(abe1.isDone())
	//*   6   10:aload_1         
	//*   7   11:invokeinterface #129 <Method boolean abe.isDone()>
	//*   8   16:ifeq            20
			return;
	//    9   19:return          
		d.get(1L, TimeUnit.SECONDS);
	//   10   20:aload_0         
	//   11   21:getfield        #123 <Field abe d>
	//   12   24:lconst_1        
	//   13   25:getstatic       #135 <Field TimeUnit TimeUnit.SECONDS>
	//   14   28:invokeinterface #139 <Method Object abe.get(long, TimeUnit)>
	//   15   33:pop             
		return;
	//   16   34:return          
		Object obj;
		obj;
	//   17   35:astore_1        
		break MISSING_BLOCK_LABEL_44;
	//   18   36:goto            44
		obj;
	//   19   39:astore_1        
		break MISSING_BLOCK_LABEL_44;
	//   20   40:goto            44
		obj;
	//   21   43:astore_1        
		wx.b("Fail to initialize AdSharedPreferenceManager.", ((Throwable) (obj)));
	//   22   44:ldc1            #141 <String "Fail to initialize AdSharedPreferenceManager.">
	//   23   46:aload_1         
	//   24   47:invokestatic    #146 <Method void wx.b(String, Throwable)>
		return;
	//   25   50:return          
		obj;
	//   26   51:astore_1        
		Thread.currentThread().interrupt();
	//   27   52:invokestatic    #152 <Method Thread Thread.currentThread()>
	//   28   55:invokevirtual   #155 <Method void Thread.interrupt()>
		wx.c("Interrupted while waiting for preferences loaded.", ((Throwable) (obj)));
	//   29   58:ldc1            #157 <String "Interrupted while waiting for preferences loaded.">
	//   30   60:aload_1         
	//   31   61:invokestatic    #159 <Method void wx.c(String, Throwable)>
		return;
	//   32   64:return          
	}

	private final Bundle p()
	{
		Bundle bundle = new Bundle();
	//    0    0:new             #162 <Class Bundle>
	//    1    3:dup             
	//    2    4:invokespecial   #163 <Method void Bundle()>
	//    3    7:astore_2        
		bundle.putBoolean("listener_registration_bundle", true);
	//    4    8:aload_2         
	//    5    9:ldc1            #165 <String "listener_registration_bundle">
	//    6   11:iconst_1        
	//    7   12:invokevirtual   #169 <Method void Bundle.putBoolean(String, boolean)>
		synchronized(a)
	//*   8   15:aload_0         
	//*   9   16:getfield        #51  <Field Object a>
	//*  10   19:astore_1        
	//*  11   20:aload_1         
	//*  12   21:monitorenter    
		{
			bundle.putBoolean("use_https", i);
	//   13   22:aload_2         
	//   14   23:ldc1            #171 <String "use_https">
	//   15   25:aload_0         
	//   16   26:getfield        #62  <Field boolean i>
	//   17   29:invokevirtual   #169 <Method void Bundle.putBoolean(String, boolean)>
			bundle.putBoolean("content_url_opted_out", u);
	//   18   32:aload_2         
	//   19   33:ldc1            #173 <String "content_url_opted_out">
	//   20   35:aload_0         
	//   21   36:getfield        #93  <Field boolean u>
	//   22   39:invokevirtual   #169 <Method void Bundle.putBoolean(String, boolean)>
			bundle.putBoolean("content_vertical_opted_out", v);
	//   23   42:aload_2         
	//   24   43:ldc1            #175 <String "content_vertical_opted_out">
	//   25   45:aload_0         
	//   26   46:getfield        #95  <Field boolean v>
	//   27   49:invokevirtual   #169 <Method void Bundle.putBoolean(String, boolean)>
			bundle.putBoolean("auto_collect_location", l);
	//   28   52:aload_2         
	//   29   53:ldc1            #177 <String "auto_collect_location">
	//   30   55:aload_0         
	//   31   56:getfield        #64  <Field boolean l>
	//   32   59:invokevirtual   #169 <Method void Bundle.putBoolean(String, boolean)>
			bundle.putInt("version_code", r);
	//   33   62:aload_2         
	//   34   63:ldc1            #179 <String "version_code">
	//   35   65:aload_0         
	//   36   66:getfield        #78  <Field int r>
	//   37   69:invokevirtual   #183 <Method void Bundle.putInt(String, int)>
			bundle.putStringArray("never_pool_slots", (String[])s.toArray(((Object []) (new String[s.size()]))));
	//   38   72:aload_2         
	//   39   73:ldc1            #185 <String "never_pool_slots">
	//   40   75:aload_0         
	//   41   76:getfield        #86  <Field Set s>
	//   42   79:aload_0         
	//   43   80:getfield        #86  <Field Set s>
	//   44   83:invokeinterface #191 <Method int Set.size()>
	//   45   88:anewarray       String[]
	//   46   91:invokeinterface #197 <Method Object[] Set.toArray(Object[])>
	//   47   96:checkcast       #199 <Class String[]>
	//   48   99:invokevirtual   #203 <Method void Bundle.putStringArray(String, String[])>
			bundle.putString("app_settings_json", m);
	//   49  102:aload_2         
	//   50  103:ldc1            #205 <String "app_settings_json">
	//   51  105:aload_0         
	//   52  106:getfield        #68  <Field String m>
	//   53  109:invokevirtual   #209 <Method void Bundle.putString(String, String)>
			bundle.putLong("app_settings_last_update_ms", n);
	//   54  112:aload_2         
	//   55  113:ldc1            #211 <String "app_settings_last_update_ms">
	//   56  115:aload_0         
	//   57  116:getfield        #70  <Field long n>
	//   58  119:invokevirtual   #215 <Method void Bundle.putLong(String, long)>
			bundle.putLong("app_last_background_time_ms", o);
	//   59  122:aload_2         
	//   60  123:ldc1            #217 <String "app_last_background_time_ms">
	//   61  125:aload_0         
	//   62  126:getfield        #72  <Field long o>
	//   63  129:invokevirtual   #215 <Method void Bundle.putLong(String, long)>
			bundle.putInt("request_in_session_count", q);
	//   64  132:aload_2         
	//   65  133:ldc1            #219 <String "request_in_session_count">
	//   66  135:aload_0         
	//   67  136:getfield        #76  <Field int q>
	//   68  139:invokevirtual   #183 <Method void Bundle.putInt(String, int)>
			bundle.putLong("first_ad_req_time_ms", p);
	//   69  142:aload_2         
	//   70  143:ldc1            #221 <String "first_ad_req_time_ms">
	//   71  145:aload_0         
	//   72  146:getfield        #74  <Field long p>
	//   73  149:invokevirtual   #215 <Method void Bundle.putLong(String, long)>
			bundle.putString("native_advanced_settings", t.toString());
	//   74  152:aload_2         
	//   75  153:ldc1            #223 <String "native_advanced_settings">
	//   76  155:aload_0         
	//   77  156:getfield        #91  <Field JSONObject t>
	//   78  159:invokevirtual   #227 <Method String JSONObject.toString()>
	//   79  162:invokevirtual   #209 <Method void Bundle.putString(String, String)>
			if(j != null)
	//*  80  165:aload_0         
	//*  81  166:getfield        #229 <Field String j>
	//*  82  169:ifnull          182
				bundle.putString("content_url_hashes", j);
	//   83  172:aload_2         
	//   84  173:ldc1            #231 <String "content_url_hashes">
	//   85  175:aload_0         
	//   86  176:getfield        #229 <Field String j>
	//   87  179:invokevirtual   #209 <Method void Bundle.putString(String, String)>
			if(k != null)
	//*  88  182:aload_0         
	//*  89  183:getfield        #233 <Field String k>
	//*  90  186:ifnull          199
				bundle.putString("content_vertical_hashes", k);
	//   91  189:aload_2         
	//   92  190:ldc1            #235 <String "content_vertical_hashes">
	//   93  192:aload_0         
	//   94  193:getfield        #233 <Field String k>
	//   95  196:invokevirtual   #209 <Method void Bundle.putString(String, String)>
		}
	//   96  199:aload_1         
	//   97  200:monitorexit     
		return bundle;
	//   98  201:aload_2         
	//   99  202:areturn         
		exception;
	//  100  203:astore_2        
		obj;
	//  101  204:aload_1         
		JVM INSTR monitorexit ;
	//  102  205:monitorexit     
		throw exception;
	//  103  206:aload_2         
	//  104  207:athrow          
	}

	public final void a(int i1)
	{
label0:
		{
			o();
	//    0    0:aload_0         
	//    1    1:invokespecial   #238 <Method void o()>
			synchronized(a)
	//*   2    4:aload_0         
	//*   3    5:getfield        #51  <Field Object a>
	//*   4    8:astore_2        
	//*   5    9:aload_2         
	//*   6   10:monitorenter    
			{
				if(r != i1)
					break label0;
	//    7   11:aload_0         
	//    8   12:getfield        #78  <Field int r>
	//    9   15:iload_1         
	//   10   16:icmpne          22
			}
	//   11   19:aload_2         
	//   12   20:monitorexit     
			return;
	//   13   21:return          
		}
		r = i1;
	//   14   22:aload_0         
	//   15   23:iload_1         
	//   16   24:putfield        #78  <Field int r>
		if(g != null)
	//*  17   27:aload_0         
	//*  18   28:getfield        #240 <Field android.content.SharedPreferences$Editor g>
	//*  19   31:ifnull          56
		{
			g.putInt("version_code", i1);
	//   20   34:aload_0         
	//   21   35:getfield        #240 <Field android.content.SharedPreferences$Editor g>
	//   22   38:ldc1            #179 <String "version_code">
	//   23   40:iload_1         
	//   24   41:invokeinterface #245 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putInt(String, int)>
	//   25   46:pop             
			g.apply();
	//   26   47:aload_0         
	//   27   48:getfield        #240 <Field android.content.SharedPreferences$Editor g>
	//   28   51:invokeinterface #248 <Method void android.content.SharedPreferences$Editor.apply()>
		}
		Bundle bundle = new Bundle();
	//   29   56:new             #162 <Class Bundle>
	//   30   59:dup             
	//   31   60:invokespecial   #163 <Method void Bundle()>
	//   32   63:astore_3        
		bundle.putInt("version_code", i1);
	//   33   64:aload_3         
	//   34   65:ldc1            #179 <String "version_code">
	//   35   67:iload_1         
	//   36   68:invokevirtual   #183 <Method void Bundle.putInt(String, int)>
		a(bundle);
	//   37   71:aload_0         
	//   38   72:aload_3         
	//   39   73:invokespecial   #250 <Method void a(Bundle)>
		obj;
	//   40   76:aload_2         
		JVM INSTR monitorexit ;
	//   41   77:monitorexit     
		return;
	//   42   78:return          
		exception;
	//   43   79:astore_3        
		obj;
	//   44   80:aload_2         
		JVM INSTR monitorexit ;
	//   45   81:monitorexit     
		throw exception;
	//   46   82:aload_3         
	//   47   83:athrow          
	}

	public final void a(long l1)
	{
label0:
		{
			o();
	//    0    0:aload_0         
	//    1    1:invokespecial   #238 <Method void o()>
			synchronized(a)
	//*   2    4:aload_0         
	//*   3    5:getfield        #51  <Field Object a>
	//*   4    8:astore_3        
	//*   5    9:aload_3         
	//*   6   10:monitorenter    
			{
				if(o != l1)
					break label0;
	//    7   11:aload_0         
	//    8   12:getfield        #72  <Field long o>
	//    9   15:lload_1         
	//   10   16:lcmp            
	//   11   17:ifne            23
			}
	//   12   20:aload_3         
	//   13   21:monitorexit     
			return;
	//   14   22:return          
		}
		o = l1;
	//   15   23:aload_0         
	//   16   24:lload_1         
	//   17   25:putfield        #72  <Field long o>
		if(g != null)
	//*  18   28:aload_0         
	//*  19   29:getfield        #240 <Field android.content.SharedPreferences$Editor g>
	//*  20   32:ifnull          57
		{
			g.putLong("app_last_background_time_ms", l1);
	//   21   35:aload_0         
	//   22   36:getfield        #240 <Field android.content.SharedPreferences$Editor g>
	//   23   39:ldc1            #217 <String "app_last_background_time_ms">
	//   24   41:lload_1         
	//   25   42:invokeinterface #254 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putLong(String, long)>
	//   26   47:pop             
			g.apply();
	//   27   48:aload_0         
	//   28   49:getfield        #240 <Field android.content.SharedPreferences$Editor g>
	//   29   52:invokeinterface #248 <Method void android.content.SharedPreferences$Editor.apply()>
		}
		Bundle bundle = new Bundle();
	//   30   57:new             #162 <Class Bundle>
	//   31   60:dup             
	//   32   61:invokespecial   #163 <Method void Bundle()>
	//   33   64:astore          4
		bundle.putLong("app_last_background_time_ms", l1);
	//   34   66:aload           4
	//   35   68:ldc1            #217 <String "app_last_background_time_ms">
	//   36   70:lload_1         
	//   37   71:invokevirtual   #215 <Method void Bundle.putLong(String, long)>
		a(bundle);
	//   38   74:aload_0         
	//   39   75:aload           4
	//   40   77:invokespecial   #250 <Method void a(Bundle)>
		obj;
	//   41   80:aload_3         
		JVM INSTR monitorexit ;
	//   42   81:monitorexit     
		return;
	//   43   82:return          
		exception;
	//   44   83:astore          4
		obj;
	//   45   85:aload_3         
		JVM INSTR monitorexit ;
	//   46   86:monitorexit     
		throw exception;
	//   47   87:aload           4
	//   48   89:athrow          
	}

	final void a(Context context, String s1)
	{
		boolean flag1;
		android.content.SharedPreferences.Editor editor;
		flag1 = false;
	//    0    0:iconst_0        
	//    1    1:istore          4
		s1 = ((String) (context.getSharedPreferences(s1, 0)));
	//    2    3:aload_1         
	//    3    4:aload_2         
	//    4    5:iconst_0        
	//    5    6:invokevirtual   #263 <Method SharedPreferences Context.getSharedPreferences(String, int)>
	//    6    9:astore_2        
		editor = ((SharedPreferences) (s1)).edit();
	//    7   10:aload_2         
	//    8   11:invokeinterface #269 <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//    9   16:astore          5
		context = ((Context) (a));
	//   10   18:aload_0         
	//   11   19:getfield        #51  <Field Object a>
	//   12   22:astore_1        
		context;
	//   13   23:aload_1         
		JVM INSTR monitorenter ;
	//   14   24:monitorenter    
		f = ((SharedPreferences) (s1));
	//   15   25:aload_0         
	//   16   26:aload_2         
	//   17   27:putfield        #271 <Field SharedPreferences f>
		g = editor;
	//   18   30:aload_0         
	//   19   31:aload           5
	//   20   33:putfield        #240 <Field android.content.SharedPreferences$Editor g>
		boolean flag = flag1;
	//   21   36:iload           4
	//   22   38:istore_3        
		if(!com.google.android.gms.common.util.o.i())
			break MISSING_BLOCK_LABEL_59;
	//   23   39:invokestatic    #275 <Method boolean o.i()>
	//   24   42:ifeq            59
		flag = flag1;
	//   25   45:iload           4
	//   26   47:istore_3        
		if(!NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted())
	//*  27   48:invokestatic    #281 <Method NetworkSecurityPolicy NetworkSecurityPolicy.getInstance()>
	//*  28   51:invokevirtual   #284 <Method boolean NetworkSecurityPolicy.isCleartextTrafficPermitted()>
	//*  29   54:ifne            59
			flag = true;
	//   30   57:iconst_1        
	//   31   58:istore_3        
		h = flag;
	//   32   59:aload_0         
	//   33   60:iload_3         
	//   34   61:putfield        #60  <Field boolean h>
		i = f.getBoolean("use_https", i);
	//   35   64:aload_0         
	//   36   65:aload_0         
	//   37   66:getfield        #271 <Field SharedPreferences f>
	//   38   69:ldc1            #171 <String "use_https">
	//   39   71:aload_0         
	//   40   72:getfield        #62  <Field boolean i>
	//   41   75:invokeinterface #288 <Method boolean SharedPreferences.getBoolean(String, boolean)>
	//   42   80:putfield        #62  <Field boolean i>
		u = f.getBoolean("content_url_opted_out", u);
	//   43   83:aload_0         
	//   44   84:aload_0         
	//   45   85:getfield        #271 <Field SharedPreferences f>
	//   46   88:ldc1            #173 <String "content_url_opted_out">
	//   47   90:aload_0         
	//   48   91:getfield        #93  <Field boolean u>
	//   49   94:invokeinterface #288 <Method boolean SharedPreferences.getBoolean(String, boolean)>
	//   50   99:putfield        #93  <Field boolean u>
		j = f.getString("content_url_hashes", j);
	//   51  102:aload_0         
	//   52  103:aload_0         
	//   53  104:getfield        #271 <Field SharedPreferences f>
	//   54  107:ldc1            #231 <String "content_url_hashes">
	//   55  109:aload_0         
	//   56  110:getfield        #229 <Field String j>
	//   57  113:invokeinterface #292 <Method String SharedPreferences.getString(String, String)>
	//   58  118:putfield        #229 <Field String j>
		l = f.getBoolean("auto_collect_location", l);
	//   59  121:aload_0         
	//   60  122:aload_0         
	//   61  123:getfield        #271 <Field SharedPreferences f>
	//   62  126:ldc1            #177 <String "auto_collect_location">
	//   63  128:aload_0         
	//   64  129:getfield        #64  <Field boolean l>
	//   65  132:invokeinterface #288 <Method boolean SharedPreferences.getBoolean(String, boolean)>
	//   66  137:putfield        #64  <Field boolean l>
		v = f.getBoolean("content_vertical_opted_out", v);
	//   67  140:aload_0         
	//   68  141:aload_0         
	//   69  142:getfield        #271 <Field SharedPreferences f>
	//   70  145:ldc1            #175 <String "content_vertical_opted_out">
	//   71  147:aload_0         
	//   72  148:getfield        #95  <Field boolean v>
	//   73  151:invokeinterface #288 <Method boolean SharedPreferences.getBoolean(String, boolean)>
	//   74  156:putfield        #95  <Field boolean v>
		k = f.getString("content_vertical_hashes", k);
	//   75  159:aload_0         
	//   76  160:aload_0         
	//   77  161:getfield        #271 <Field SharedPreferences f>
	//   78  164:ldc1            #235 <String "content_vertical_hashes">
	//   79  166:aload_0         
	//   80  167:getfield        #233 <Field String k>
	//   81  170:invokeinterface #292 <Method String SharedPreferences.getString(String, String)>
	//   82  175:putfield        #233 <Field String k>
		r = f.getInt("version_code", r);
	//   83  178:aload_0         
	//   84  179:aload_0         
	//   85  180:getfield        #271 <Field SharedPreferences f>
	//   86  183:ldc1            #179 <String "version_code">
	//   87  185:aload_0         
	//   88  186:getfield        #78  <Field int r>
	//   89  189:invokeinterface #296 <Method int SharedPreferences.getInt(String, int)>
	//   90  194:putfield        #78  <Field int r>
		m = f.getString("app_settings_json", m);
	//   91  197:aload_0         
	//   92  198:aload_0         
	//   93  199:getfield        #271 <Field SharedPreferences f>
	//   94  202:ldc1            #205 <String "app_settings_json">
	//   95  204:aload_0         
	//   96  205:getfield        #68  <Field String m>
	//   97  208:invokeinterface #292 <Method String SharedPreferences.getString(String, String)>
	//   98  213:putfield        #68  <Field String m>
		n = f.getLong("app_settings_last_update_ms", n);
	//   99  216:aload_0         
	//  100  217:aload_0         
	//  101  218:getfield        #271 <Field SharedPreferences f>
	//  102  221:ldc1            #211 <String "app_settings_last_update_ms">
	//  103  223:aload_0         
	//  104  224:getfield        #70  <Field long n>
	//  105  227:invokeinterface #300 <Method long SharedPreferences.getLong(String, long)>
	//  106  232:putfield        #70  <Field long n>
		o = f.getLong("app_last_background_time_ms", o);
	//  107  235:aload_0         
	//  108  236:aload_0         
	//  109  237:getfield        #271 <Field SharedPreferences f>
	//  110  240:ldc1            #217 <String "app_last_background_time_ms">
	//  111  242:aload_0         
	//  112  243:getfield        #72  <Field long o>
	//  113  246:invokeinterface #300 <Method long SharedPreferences.getLong(String, long)>
	//  114  251:putfield        #72  <Field long o>
		q = f.getInt("request_in_session_count", q);
	//  115  254:aload_0         
	//  116  255:aload_0         
	//  117  256:getfield        #271 <Field SharedPreferences f>
	//  118  259:ldc1            #219 <String "request_in_session_count">
	//  119  261:aload_0         
	//  120  262:getfield        #76  <Field int q>
	//  121  265:invokeinterface #296 <Method int SharedPreferences.getInt(String, int)>
	//  122  270:putfield        #76  <Field int q>
		p = f.getLong("first_ad_req_time_ms", p);
	//  123  273:aload_0         
	//  124  274:aload_0         
	//  125  275:getfield        #271 <Field SharedPreferences f>
	//  126  278:ldc1            #221 <String "first_ad_req_time_ms">
	//  127  280:aload_0         
	//  128  281:getfield        #74  <Field long p>
	//  129  284:invokeinterface #300 <Method long SharedPreferences.getLong(String, long)>
	//  130  289:putfield        #74  <Field long p>
		s = f.getStringSet("never_pool_slots", s);
	//  131  292:aload_0         
	//  132  293:aload_0         
	//  133  294:getfield        #271 <Field SharedPreferences f>
	//  134  297:ldc1            #185 <String "never_pool_slots">
	//  135  299:aload_0         
	//  136  300:getfield        #86  <Field Set s>
	//  137  303:invokeinterface #304 <Method Set SharedPreferences.getStringSet(String, Set)>
	//  138  308:putfield        #86  <Field Set s>
		try
		{
			t = new JSONObject(f.getString("native_advanced_settings", "{}"));
	//  139  311:aload_0         
	//  140  312:new             #88  <Class JSONObject>
	//  141  315:dup             
	//  142  316:aload_0         
	//  143  317:getfield        #271 <Field SharedPreferences f>
	//  144  320:ldc1            #223 <String "native_advanced_settings">
	//  145  322:ldc2            #306 <String "{}">
	//  146  325:invokeinterface #292 <Method String SharedPreferences.getString(String, String)>
	//  147  330:invokespecial   #309 <Method void JSONObject(String)>
	//  148  333:putfield        #91  <Field JSONObject t>
			break MISSING_BLOCK_LABEL_347;
	//  149  336:goto            347
		}
		// Misplaced declaration of an exception variable
		catch(String s1) { }
	//  150  339:astore_2        
		wx.c("Could not convert native advanced settings to json object", ((Throwable) (s1)));
	//  151  340:ldc2            #311 <String "Could not convert native advanced settings to json object">
	//  152  343:aload_2         
	//  153  344:invokestatic    #159 <Method void wx.c(String, Throwable)>
		a(p());
	//  154  347:aload_0         
	//  155  348:aload_0         
	//  156  349:invokespecial   #313 <Method Bundle p()>
	//  157  352:invokespecial   #250 <Method void a(Bundle)>
		context;
	//  158  355:aload_1         
		JVM INSTR monitorexit ;
	//  159  356:monitorexit     
		return;
	//  160  357:return          
		s1;
	//  161  358:astore_2        
		context;
	//  162  359:aload_1         
		JVM INSTR monitorexit ;
	//  163  360:monitorexit     
		throw s1;
	//  164  361:aload_2         
	//  165  362:athrow          
	}

	public final void a(Context context, String s1, boolean flag)
	{
		d = xe.a(((Runnable) (new xc(this, context, "admob"))));
	//    0    0:aload_0         
	//    1    1:new             #316 <Class xc>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:ldc2            #318 <String "admob">
	//    6   10:invokespecial   #321 <Method void xc(xb, Context, String)>
	//    7   13:invokestatic    #324 <Method abe xe.a(Runnable)>
	//    8   16:putfield        #123 <Field abe d>
		b = true;
	//    9   19:aload_0         
	//   10   20:iconst_1        
	//   11   21:putfield        #326 <Field boolean b>
	//   12   24:return          
	}

	public final void a(String s1)
	{
		o();
	//    0    0:aload_0         
	//    1    1:invokespecial   #238 <Method void o()>
		Object obj = a;
	//    2    4:aload_0         
	//    3    5:getfield        #51  <Field Object a>
	//    4    8:astore_2        
		obj;
	//    5    9:aload_2         
		JVM INSTR monitorenter ;
	//    6   10:monitorenter    
		if(s1 == null)
			break MISSING_BLOCK_LABEL_86;
	//    7   11:aload_1         
	//    8   12:ifnull          86
		if(s1.equals(((Object) (j))))
	//*   9   15:aload_1         
	//*  10   16:aload_0         
	//*  11   17:getfield        #229 <Field String j>
	//*  12   20:invokevirtual   #330 <Method boolean String.equals(Object)>
	//*  13   23:ifeq            29
			break MISSING_BLOCK_LABEL_86;
	//   14   26:goto            86
		j = s1;
	//   15   29:aload_0         
	//   16   30:aload_1         
	//   17   31:putfield        #229 <Field String j>
		if(g != null)
	//*  18   34:aload_0         
	//*  19   35:getfield        #240 <Field android.content.SharedPreferences$Editor g>
	//*  20   38:ifnull          63
		{
			g.putString("content_url_hashes", s1);
	//   21   41:aload_0         
	//   22   42:getfield        #240 <Field android.content.SharedPreferences$Editor g>
	//   23   45:ldc1            #231 <String "content_url_hashes">
	//   24   47:aload_1         
	//   25   48:invokeinterface #333 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putString(String, String)>
	//   26   53:pop             
			g.apply();
	//   27   54:aload_0         
	//   28   55:getfield        #240 <Field android.content.SharedPreferences$Editor g>
	//   29   58:invokeinterface #248 <Method void android.content.SharedPreferences$Editor.apply()>
		}
		Bundle bundle = new Bundle();
	//   30   63:new             #162 <Class Bundle>
	//   31   66:dup             
	//   32   67:invokespecial   #163 <Method void Bundle()>
	//   33   70:astore_3        
		bundle.putString("content_url_hashes", s1);
	//   34   71:aload_3         
	//   35   72:ldc1            #231 <String "content_url_hashes">
	//   36   74:aload_1         
	//   37   75:invokevirtual   #209 <Method void Bundle.putString(String, String)>
		a(bundle);
	//   38   78:aload_0         
	//   39   79:aload_3         
	//   40   80:invokespecial   #250 <Method void a(Bundle)>
		obj;
	//   41   83:aload_2         
		JVM INSTR monitorexit ;
	//   42   84:monitorexit     
		return;
	//   43   85:return          
		obj;
	//   44   86:aload_2         
		JVM INSTR monitorexit ;
	//   45   87:monitorexit     
		return;
	//   46   88:return          
		s1;
	//   47   89:astore_1        
		obj;
	//   48   90:aload_2         
		JVM INSTR monitorexit ;
	//   49   91:monitorexit     
		throw s1;
	//   50   92:aload_1         
	//   51   93:athrow          
	}

	public final void a(String s1, String s2, boolean flag)
	{
		o();
	//    0    0:aload_0         
	//    1    1:invokespecial   #238 <Method void o()>
		Object obj1 = a;
	//    2    4:aload_0         
	//    3    5:getfield        #51  <Field Object a>
	//    4    8:astore          9
		obj1;
	//    5   10:aload           9
		JVM INSTR monitorenter ;
	//    6   12:monitorenter    
		Object obj = ((Object) (t.optJSONArray(s1)));
	//    7   13:aload_0         
	//    8   14:getfield        #91  <Field JSONObject t>
	//    9   17:aload_1         
	//   10   18:invokevirtual   #339 <Method JSONArray JSONObject.optJSONArray(String)>
	//   11   21:astore          8
		JSONArray jsonarray;
		jsonarray = ((JSONArray) (obj));
	//   12   23:aload           8
	//   13   25:astore          7
		if(obj != null)
			break MISSING_BLOCK_LABEL_41;
	//   14   27:aload           8
	//   15   29:ifnonnull       41
		jsonarray = new JSONArray();
	//   16   32:new             #341 <Class JSONArray>
	//   17   35:dup             
	//   18   36:invokespecial   #342 <Method void JSONArray()>
	//   19   39:astore          7
		int k1 = jsonarray.length();
	//   20   41:aload           7
	//   21   43:invokevirtual   #345 <Method int JSONArray.length()>
	//   22   46:istore          6
		int i1 = 0;
	//   23   48:iconst_0        
	//   24   49:istore          4
_L2:
		int j1 = k1;
	//   25   51:iload           6
	//   26   53:istore          5
		if(i1 >= jsonarray.length())
			break; /* Loop/switch isn't completed */
	//   27   55:iload           4
	//   28   57:aload           7
	//   29   59:invokevirtual   #345 <Method int JSONArray.length()>
	//   30   62:icmpge          136
		obj = ((Object) (jsonarray.optJSONObject(i1)));
	//   31   65:aload           7
	//   32   67:iload           4
	//   33   69:invokevirtual   #349 <Method JSONObject JSONArray.optJSONObject(int)>
	//   34   72:astore          8
		if(obj != null)
			break MISSING_BLOCK_LABEL_83;
	//   35   74:aload           8
	//   36   76:ifnonnull       83
		obj1;
	//   37   79:aload           9
		JVM INSTR monitorexit ;
	//   38   81:monitorexit     
		return;
	//   39   82:return          
		if(!s2.equals(((Object) (((JSONObject) (obj)).optString("template_id")))))
			break MISSING_BLOCK_LABEL_127;
	//   40   83:aload_2         
	//   41   84:aload           8
	//   42   86:ldc2            #351 <String "template_id">
	//   43   89:invokevirtual   #355 <Method String JSONObject.optString(String)>
	//   44   92:invokevirtual   #330 <Method boolean String.equals(Object)>
	//   45   95:ifeq            127
		if(!flag)
			break MISSING_BLOCK_LABEL_120;
	//   46   98:iload_3         
	//   47   99:iconst_1        
	//   48  100:icmpne          120
		if(((JSONObject) (obj)).optBoolean("uses_media_view", false) != flag)
			break MISSING_BLOCK_LABEL_120;
	//   49  103:aload           8
	//   50  105:ldc2            #357 <String "uses_media_view">
	//   51  108:iconst_0        
	//   52  109:invokevirtual   #360 <Method boolean JSONObject.optBoolean(String, boolean)>
	//   53  112:iload_3         
	//   54  113:icmpne          120
		obj1;
	//   55  116:aload           9
		JVM INSTR monitorexit ;
	//   56  118:monitorexit     
		return;
	//   57  119:return          
		j1 = i1;
	//   58  120:iload           4
	//   59  122:istore          5
		break; /* Loop/switch isn't completed */
	//   60  124:goto            136
		i1++;
	//   61  127:iload           4
	//   62  129:iconst_1        
	//   63  130:iadd            
	//   64  131:istore          4
		if(true) goto _L2; else goto _L1
	//   65  133:goto            51
_L1:
		try
		{
			JSONObject jsonobject = new JSONObject();
	//   66  136:new             #88  <Class JSONObject>
	//   67  139:dup             
	//   68  140:invokespecial   #89  <Method void JSONObject()>
	//   69  143:astore          8
			jsonobject.put("template_id", ((Object) (s2)));
	//   70  145:aload           8
	//   71  147:ldc2            #351 <String "template_id">
	//   72  150:aload_2         
	//   73  151:invokevirtual   #364 <Method JSONObject JSONObject.put(String, Object)>
	//   74  154:pop             
			jsonobject.put("uses_media_view", flag);
	//   75  155:aload           8
	//   76  157:ldc2            #357 <String "uses_media_view">
	//   77  160:iload_3         
	//   78  161:invokevirtual   #367 <Method JSONObject JSONObject.put(String, boolean)>
	//   79  164:pop             
			jsonobject.put("timestamp_ms", aw.l().a());
	//   80  165:aload           8
	//   81  167:ldc2            #369 <String "timestamp_ms">
	//   82  170:invokestatic    #374 <Method e aw.l()>
	//   83  173:invokeinterface #379 <Method long e.a()>
	//   84  178:invokevirtual   #382 <Method JSONObject JSONObject.put(String, long)>
	//   85  181:pop             
			jsonarray.put(j1, ((Object) (jsonobject)));
	//   86  182:aload           7
	//   87  184:iload           5
	//   88  186:aload           8
	//   89  188:invokevirtual   #385 <Method JSONArray JSONArray.put(int, Object)>
	//   90  191:pop             
			t.put(s1, ((Object) (jsonarray)));
	//   91  192:aload_0         
	//   92  193:getfield        #91  <Field JSONObject t>
	//   93  196:aload_1         
	//   94  197:aload           7
	//   95  199:invokevirtual   #364 <Method JSONObject JSONObject.put(String, Object)>
	//   96  202:pop             
			break MISSING_BLOCK_LABEL_214;
	//   97  203:goto            214
		}
		// Misplaced declaration of an exception variable
		catch(String s1) { }
	//   98  206:astore_1        
		wx.c("Could not update native advanced settings", ((Throwable) (s1)));
	//   99  207:ldc2            #387 <String "Could not update native advanced settings">
	//  100  210:aload_1         
	//  101  211:invokestatic    #159 <Method void wx.c(String, Throwable)>
		if(g != null)
	//* 102  214:aload_0         
	//* 103  215:getfield        #240 <Field android.content.SharedPreferences$Editor g>
	//* 104  218:ifnull          249
		{
			g.putString("native_advanced_settings", t.toString());
	//  105  221:aload_0         
	//  106  222:getfield        #240 <Field android.content.SharedPreferences$Editor g>
	//  107  225:ldc1            #223 <String "native_advanced_settings">
	//  108  227:aload_0         
	//  109  228:getfield        #91  <Field JSONObject t>
	//  110  231:invokevirtual   #227 <Method String JSONObject.toString()>
	//  111  234:invokeinterface #333 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putString(String, String)>
	//  112  239:pop             
			g.apply();
	//  113  240:aload_0         
	//  114  241:getfield        #240 <Field android.content.SharedPreferences$Editor g>
	//  115  244:invokeinterface #248 <Method void android.content.SharedPreferences$Editor.apply()>
		}
		s1 = ((String) (new Bundle()));
	//  116  249:new             #162 <Class Bundle>
	//  117  252:dup             
	//  118  253:invokespecial   #163 <Method void Bundle()>
	//  119  256:astore_1        
		((Bundle) (s1)).putString("native_advanced_settings", t.toString());
	//  120  257:aload_1         
	//  121  258:ldc1            #223 <String "native_advanced_settings">
	//  122  260:aload_0         
	//  123  261:getfield        #91  <Field JSONObject t>
	//  124  264:invokevirtual   #227 <Method String JSONObject.toString()>
	//  125  267:invokevirtual   #209 <Method void Bundle.putString(String, String)>
		a(((Bundle) (s1)));
	//  126  270:aload_0         
	//  127  271:aload_1         
	//  128  272:invokespecial   #250 <Method void a(Bundle)>
		obj1;
	//  129  275:aload           9
		JVM INSTR monitorexit ;
	//  130  277:monitorexit     
		return;
	//  131  278:return          
		s1;
	//  132  279:astore_1        
		obj1;
	//  133  280:aload           9
		JVM INSTR monitorexit ;
	//  134  282:monitorexit     
		throw s1;
	//  135  283:aload_1         
	//  136  284:athrow          
	}

	public final void a(boolean flag)
	{
label0:
		{
			o();
	//    0    0:aload_0         
	//    1    1:invokespecial   #238 <Method void o()>
			synchronized(a)
	//*   2    4:aload_0         
	//*   3    5:getfield        #51  <Field Object a>
	//*   4    8:astore_2        
	//*   5    9:aload_2         
	//*   6   10:monitorenter    
			{
				if(i != flag)
					break label0;
	//    7   11:aload_0         
	//    8   12:getfield        #62  <Field boolean i>
	//    9   15:iload_1         
	//   10   16:icmpne          22
			}
	//   11   19:aload_2         
	//   12   20:monitorexit     
			return;
	//   13   21:return          
		}
		i = flag;
	//   14   22:aload_0         
	//   15   23:iload_1         
	//   16   24:putfield        #62  <Field boolean i>
		if(g != null)
	//*  17   27:aload_0         
	//*  18   28:getfield        #240 <Field android.content.SharedPreferences$Editor g>
	//*  19   31:ifnull          56
		{
			g.putBoolean("use_https", flag);
	//   20   34:aload_0         
	//   21   35:getfield        #240 <Field android.content.SharedPreferences$Editor g>
	//   22   38:ldc1            #171 <String "use_https">
	//   23   40:iload_1         
	//   24   41:invokeinterface #391 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putBoolean(String, boolean)>
	//   25   46:pop             
			g.apply();
	//   26   47:aload_0         
	//   27   48:getfield        #240 <Field android.content.SharedPreferences$Editor g>
	//   28   51:invokeinterface #248 <Method void android.content.SharedPreferences$Editor.apply()>
		}
		if(!h)
	//*  29   56:aload_0         
	//*  30   57:getfield        #60  <Field boolean h>
	//*  31   60:ifne            83
		{
			Bundle bundle = new Bundle();
	//   32   63:new             #162 <Class Bundle>
	//   33   66:dup             
	//   34   67:invokespecial   #163 <Method void Bundle()>
	//   35   70:astore_3        
			bundle.putBoolean("use_https", flag);
	//   36   71:aload_3         
	//   37   72:ldc1            #171 <String "use_https">
	//   38   74:iload_1         
	//   39   75:invokevirtual   #169 <Method void Bundle.putBoolean(String, boolean)>
			a(bundle);
	//   40   78:aload_0         
	//   41   79:aload_3         
	//   42   80:invokespecial   #250 <Method void a(Bundle)>
		}
		obj;
	//   43   83:aload_2         
		JVM INSTR monitorexit ;
	//   44   84:monitorexit     
		return;
	//   45   85:return          
		exception;
	//   46   86:astore_3        
		obj;
	//   47   87:aload_2         
		JVM INSTR monitorexit ;
	//   48   88:monitorexit     
		throw exception;
	//   49   89:aload_3         
	//   50   90:athrow          
	}

	public final boolean a()
	{
		o();
	//    0    0:aload_0         
	//    1    1:invokespecial   #238 <Method void o()>
		Object obj = a;
	//    2    4:aload_0         
	//    3    5:getfield        #51  <Field Object a>
	//    4    8:astore_2        
		obj;
	//    5    9:aload_2         
		JVM INSTR monitorenter ;
	//    6   10:monitorenter    
		boolean flag;
		Exception exception;
		if(!i && !h)
	//*   7   11:aload_0         
	//*   8   12:getfield        #62  <Field boolean i>
	//*   9   15:ifne            42
	//*  10   18:aload_0         
	//*  11   19:getfield        #60  <Field boolean h>
	//*  12   22:ifeq            37
	//*  13   25:goto            42
	//*  14   28:aload_2         
	//*  15   29:monitorexit     
	//*  16   30:iload_1         
	//*  17   31:ireturn         
	//*  18   32:astore_3        
	//*  19   33:aload_2         
	//*  20   34:monitorexit     
	//*  21   35:aload_3         
	//*  22   36:athrow          
			flag = false;
	//   23   37:iconst_0        
	//   24   38:istore_1        
		else
	//*  25   39:goto            28
			flag = true;
	//   26   42:iconst_1        
	//   27   43:istore_1        
		obj;
		JVM INSTR monitorexit ;
		return flag;
		exception;
		obj;
		JVM INSTR monitorexit ;
		throw exception;
	//*  28   44:goto            28
	}

	public final void b(int i1)
	{
label0:
		{
			o();
	//    0    0:aload_0         
	//    1    1:invokespecial   #238 <Method void o()>
			synchronized(a)
	//*   2    4:aload_0         
	//*   3    5:getfield        #51  <Field Object a>
	//*   4    8:astore_2        
	//*   5    9:aload_2         
	//*   6   10:monitorenter    
			{
				if(q != i1)
					break label0;
	//    7   11:aload_0         
	//    8   12:getfield        #76  <Field int q>
	//    9   15:iload_1         
	//   10   16:icmpne          22
			}
	//   11   19:aload_2         
	//   12   20:monitorexit     
			return;
	//   13   21:return          
		}
		q = i1;
	//   14   22:aload_0         
	//   15   23:iload_1         
	//   16   24:putfield        #76  <Field int q>
		if(g != null)
	//*  17   27:aload_0         
	//*  18   28:getfield        #240 <Field android.content.SharedPreferences$Editor g>
	//*  19   31:ifnull          56
		{
			g.putInt("request_in_session_count", i1);
	//   20   34:aload_0         
	//   21   35:getfield        #240 <Field android.content.SharedPreferences$Editor g>
	//   22   38:ldc1            #219 <String "request_in_session_count">
	//   23   40:iload_1         
	//   24   41:invokeinterface #245 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putInt(String, int)>
	//   25   46:pop             
			g.apply();
	//   26   47:aload_0         
	//   27   48:getfield        #240 <Field android.content.SharedPreferences$Editor g>
	//   28   51:invokeinterface #248 <Method void android.content.SharedPreferences$Editor.apply()>
		}
		Bundle bundle = new Bundle();
	//   29   56:new             #162 <Class Bundle>
	//   30   59:dup             
	//   31   60:invokespecial   #163 <Method void Bundle()>
	//   32   63:astore_3        
		bundle.putInt("request_in_session_count", i1);
	//   33   64:aload_3         
	//   34   65:ldc1            #219 <String "request_in_session_count">
	//   35   67:iload_1         
	//   36   68:invokevirtual   #183 <Method void Bundle.putInt(String, int)>
		a(bundle);
	//   37   71:aload_0         
	//   38   72:aload_3         
	//   39   73:invokespecial   #250 <Method void a(Bundle)>
		obj;
	//   40   76:aload_2         
		JVM INSTR monitorexit ;
	//   41   77:monitorexit     
		return;
	//   42   78:return          
		exception;
	//   43   79:astore_3        
		obj;
	//   44   80:aload_2         
		JVM INSTR monitorexit ;
	//   45   81:monitorexit     
		throw exception;
	//   46   82:aload_3         
	//   47   83:athrow          
	}

	public final void b(long l1)
	{
label0:
		{
			o();
	//    0    0:aload_0         
	//    1    1:invokespecial   #238 <Method void o()>
			synchronized(a)
	//*   2    4:aload_0         
	//*   3    5:getfield        #51  <Field Object a>
	//*   4    8:astore_3        
	//*   5    9:aload_3         
	//*   6   10:monitorenter    
			{
				if(p != l1)
					break label0;
	//    7   11:aload_0         
	//    8   12:getfield        #74  <Field long p>
	//    9   15:lload_1         
	//   10   16:lcmp            
	//   11   17:ifne            23
			}
	//   12   20:aload_3         
	//   13   21:monitorexit     
			return;
	//   14   22:return          
		}
		p = l1;
	//   15   23:aload_0         
	//   16   24:lload_1         
	//   17   25:putfield        #74  <Field long p>
		if(g != null)
	//*  18   28:aload_0         
	//*  19   29:getfield        #240 <Field android.content.SharedPreferences$Editor g>
	//*  20   32:ifnull          57
		{
			g.putLong("first_ad_req_time_ms", l1);
	//   21   35:aload_0         
	//   22   36:getfield        #240 <Field android.content.SharedPreferences$Editor g>
	//   23   39:ldc1            #221 <String "first_ad_req_time_ms">
	//   24   41:lload_1         
	//   25   42:invokeinterface #254 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putLong(String, long)>
	//   26   47:pop             
			g.apply();
	//   27   48:aload_0         
	//   28   49:getfield        #240 <Field android.content.SharedPreferences$Editor g>
	//   29   52:invokeinterface #248 <Method void android.content.SharedPreferences$Editor.apply()>
		}
		Bundle bundle = new Bundle();
	//   30   57:new             #162 <Class Bundle>
	//   31   60:dup             
	//   32   61:invokespecial   #163 <Method void Bundle()>
	//   33   64:astore          4
		bundle.putLong("first_ad_req_time_ms", l1);
	//   34   66:aload           4
	//   35   68:ldc1            #221 <String "first_ad_req_time_ms">
	//   36   70:lload_1         
	//   37   71:invokevirtual   #215 <Method void Bundle.putLong(String, long)>
		a(bundle);
	//   38   74:aload_0         
	//   39   75:aload           4
	//   40   77:invokespecial   #250 <Method void a(Bundle)>
		obj;
	//   41   80:aload_3         
		JVM INSTR monitorexit ;
	//   42   81:monitorexit     
		return;
	//   43   82:return          
		exception;
	//   44   83:astore          4
		obj;
	//   45   85:aload_3         
		JVM INSTR monitorexit ;
	//   46   86:monitorexit     
		throw exception;
	//   47   87:aload           4
	//   48   89:athrow          
	}

	public final void b(String s1)
	{
		o();
	//    0    0:aload_0         
	//    1    1:invokespecial   #238 <Method void o()>
		Object obj = a;
	//    2    4:aload_0         
	//    3    5:getfield        #51  <Field Object a>
	//    4    8:astore_2        
		obj;
	//    5    9:aload_2         
		JVM INSTR monitorenter ;
	//    6   10:monitorenter    
		if(s1 == null)
			break MISSING_BLOCK_LABEL_86;
	//    7   11:aload_1         
	//    8   12:ifnull          86
		if(s1.equals(((Object) (k))))
	//*   9   15:aload_1         
	//*  10   16:aload_0         
	//*  11   17:getfield        #233 <Field String k>
	//*  12   20:invokevirtual   #330 <Method boolean String.equals(Object)>
	//*  13   23:ifeq            29
			break MISSING_BLOCK_LABEL_86;
	//   14   26:goto            86
		k = s1;
	//   15   29:aload_0         
	//   16   30:aload_1         
	//   17   31:putfield        #233 <Field String k>
		if(g != null)
	//*  18   34:aload_0         
	//*  19   35:getfield        #240 <Field android.content.SharedPreferences$Editor g>
	//*  20   38:ifnull          63
		{
			g.putString("content_vertical_hashes", s1);
	//   21   41:aload_0         
	//   22   42:getfield        #240 <Field android.content.SharedPreferences$Editor g>
	//   23   45:ldc1            #235 <String "content_vertical_hashes">
	//   24   47:aload_1         
	//   25   48:invokeinterface #333 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putString(String, String)>
	//   26   53:pop             
			g.apply();
	//   27   54:aload_0         
	//   28   55:getfield        #240 <Field android.content.SharedPreferences$Editor g>
	//   29   58:invokeinterface #248 <Method void android.content.SharedPreferences$Editor.apply()>
		}
		Bundle bundle = new Bundle();
	//   30   63:new             #162 <Class Bundle>
	//   31   66:dup             
	//   32   67:invokespecial   #163 <Method void Bundle()>
	//   33   70:astore_3        
		bundle.putString("content_vertical_hashes", s1);
	//   34   71:aload_3         
	//   35   72:ldc1            #235 <String "content_vertical_hashes">
	//   36   74:aload_1         
	//   37   75:invokevirtual   #209 <Method void Bundle.putString(String, String)>
		a(bundle);
	//   38   78:aload_0         
	//   39   79:aload_3         
	//   40   80:invokespecial   #250 <Method void a(Bundle)>
		obj;
	//   41   83:aload_2         
		JVM INSTR monitorexit ;
	//   42   84:monitorexit     
		return;
	//   43   85:return          
		obj;
	//   44   86:aload_2         
		JVM INSTR monitorexit ;
	//   45   87:monitorexit     
		return;
	//   46   88:return          
		s1;
	//   47   89:astore_1        
		obj;
	//   48   90:aload_2         
		JVM INSTR monitorexit ;
	//   49   91:monitorexit     
		throw s1;
	//   50   92:aload_1         
	//   51   93:athrow          
	}

	public final void b(boolean flag)
	{
label0:
		{
			o();
	//    0    0:aload_0         
	//    1    1:invokespecial   #238 <Method void o()>
			synchronized(a)
	//*   2    4:aload_0         
	//*   3    5:getfield        #51  <Field Object a>
	//*   4    8:astore_2        
	//*   5    9:aload_2         
	//*   6   10:monitorenter    
			{
				if(u != flag)
					break label0;
	//    7   11:aload_0         
	//    8   12:getfield        #93  <Field boolean u>
	//    9   15:iload_1         
	//   10   16:icmpne          22
			}
	//   11   19:aload_2         
	//   12   20:monitorexit     
			return;
	//   13   21:return          
		}
		u = flag;
	//   14   22:aload_0         
	//   15   23:iload_1         
	//   16   24:putfield        #93  <Field boolean u>
		if(g != null)
	//*  17   27:aload_0         
	//*  18   28:getfield        #240 <Field android.content.SharedPreferences$Editor g>
	//*  19   31:ifnull          56
		{
			g.putBoolean("content_url_opted_out", flag);
	//   20   34:aload_0         
	//   21   35:getfield        #240 <Field android.content.SharedPreferences$Editor g>
	//   22   38:ldc1            #173 <String "content_url_opted_out">
	//   23   40:iload_1         
	//   24   41:invokeinterface #391 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putBoolean(String, boolean)>
	//   25   46:pop             
			g.apply();
	//   26   47:aload_0         
	//   27   48:getfield        #240 <Field android.content.SharedPreferences$Editor g>
	//   28   51:invokeinterface #248 <Method void android.content.SharedPreferences$Editor.apply()>
		}
		Bundle bundle = new Bundle();
	//   29   56:new             #162 <Class Bundle>
	//   30   59:dup             
	//   31   60:invokespecial   #163 <Method void Bundle()>
	//   32   63:astore_3        
		bundle.putBoolean("content_url_opted_out", u);
	//   33   64:aload_3         
	//   34   65:ldc1            #173 <String "content_url_opted_out">
	//   35   67:aload_0         
	//   36   68:getfield        #93  <Field boolean u>
	//   37   71:invokevirtual   #169 <Method void Bundle.putBoolean(String, boolean)>
		bundle.putBoolean("content_vertical_opted_out", v);
	//   38   74:aload_3         
	//   39   75:ldc1            #175 <String "content_vertical_opted_out">
	//   40   77:aload_0         
	//   41   78:getfield        #95  <Field boolean v>
	//   42   81:invokevirtual   #169 <Method void Bundle.putBoolean(String, boolean)>
		a(bundle);
	//   43   84:aload_0         
	//   44   85:aload_3         
	//   45   86:invokespecial   #250 <Method void a(Bundle)>
		obj;
	//   46   89:aload_2         
		JVM INSTR monitorexit ;
	//   47   90:monitorexit     
		return;
	//   48   91:return          
		exception;
	//   49   92:astore_3        
		obj;
	//   50   93:aload_2         
		JVM INSTR monitorexit ;
	//   51   94:monitorexit     
		throw exception;
	//   52   95:aload_3         
	//   53   96:athrow          
	}

	public final boolean b()
	{
		o();
	//    0    0:aload_0         
	//    1    1:invokespecial   #238 <Method void o()>
		boolean flag;
		synchronized(a)
	//*   2    4:aload_0         
	//*   3    5:getfield        #51  <Field Object a>
	//*   4    8:astore_2        
	//*   5    9:aload_2         
	//*   6   10:monitorenter    
		{
			flag = u;
	//    7   11:aload_0         
	//    8   12:getfield        #93  <Field boolean u>
	//    9   15:istore_1        
		}
	//   10   16:aload_2         
	//   11   17:monitorexit     
		return flag;
	//   12   18:iload_1         
	//   13   19:ireturn         
		exception;
	//   14   20:astore_3        
		obj;
	//   15   21:aload_2         
		JVM INSTR monitorexit ;
	//   16   22:monitorexit     
		throw exception;
	//   17   23:aload_3         
	//   18   24:athrow          
	}

	public final String c()
	{
		o();
	//    0    0:aload_0         
	//    1    1:invokespecial   #238 <Method void o()>
		String s1;
		synchronized(a)
	//*   2    4:aload_0         
	//*   3    5:getfield        #51  <Field Object a>
	//*   4    8:astore_1        
	//*   5    9:aload_1         
	//*   6   10:monitorenter    
		{
			s1 = j;
	//    7   11:aload_0         
	//    8   12:getfield        #229 <Field String j>
	//    9   15:astore_2        
		}
	//   10   16:aload_1         
	//   11   17:monitorexit     
		return s1;
	//   12   18:aload_2         
	//   13   19:areturn         
		exception;
	//   14   20:astore_2        
		obj;
	//   15   21:aload_1         
		JVM INSTR monitorexit ;
	//   16   22:monitorexit     
		throw exception;
	//   17   23:aload_2         
	//   18   24:athrow          
	}

	public final void c(String s1)
	{
label0:
		{
			o();
	//    0    0:aload_0         
	//    1    1:invokespecial   #238 <Method void o()>
			synchronized(a)
	//*   2    4:aload_0         
	//*   3    5:getfield        #51  <Field Object a>
	//*   4    8:astore_2        
	//*   5    9:aload_2         
	//*   6   10:monitorenter    
			{
				if(!s.contains(((Object) (s1))))
					break label0;
	//    7   11:aload_0         
	//    8   12:getfield        #86  <Field Set s>
	//    9   15:aload_1         
	//   10   16:invokeinterface #395 <Method boolean Set.contains(Object)>
	//   11   21:ifeq            27
			}
	//   12   24:aload_2         
	//   13   25:monitorexit     
			return;
	//   14   26:return          
		}
		s.add(((Object) (s1)));
	//   15   27:aload_0         
	//   16   28:getfield        #86  <Field Set s>
	//   17   31:aload_1         
	//   18   32:invokeinterface #398 <Method boolean Set.add(Object)>
	//   19   37:pop             
		if(g != null)
	//*  20   38:aload_0         
	//*  21   39:getfield        #240 <Field android.content.SharedPreferences$Editor g>
	//*  22   42:ifnull          70
		{
			g.putStringSet("never_pool_slots", s);
	//   23   45:aload_0         
	//   24   46:getfield        #240 <Field android.content.SharedPreferences$Editor g>
	//   25   49:ldc1            #185 <String "never_pool_slots">
	//   26   51:aload_0         
	//   27   52:getfield        #86  <Field Set s>
	//   28   55:invokeinterface #402 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putStringSet(String, Set)>
	//   29   60:pop             
			g.apply();
	//   30   61:aload_0         
	//   31   62:getfield        #240 <Field android.content.SharedPreferences$Editor g>
	//   32   65:invokeinterface #248 <Method void android.content.SharedPreferences$Editor.apply()>
		}
		s1 = ((String) (new Bundle()));
	//   33   70:new             #162 <Class Bundle>
	//   34   73:dup             
	//   35   74:invokespecial   #163 <Method void Bundle()>
	//   36   77:astore_1        
		((Bundle) (s1)).putStringArray("never_pool_slots", (String[])s.toArray(((Object []) (new String[s.size()]))));
	//   37   78:aload_1         
	//   38   79:ldc1            #185 <String "never_pool_slots">
	//   39   81:aload_0         
	//   40   82:getfield        #86  <Field Set s>
	//   41   85:aload_0         
	//   42   86:getfield        #86  <Field Set s>
	//   43   89:invokeinterface #191 <Method int Set.size()>
	//   44   94:anewarray       String[]
	//   45   97:invokeinterface #197 <Method Object[] Set.toArray(Object[])>
	//   46  102:checkcast       #199 <Class String[]>
	//   47  105:invokevirtual   #203 <Method void Bundle.putStringArray(String, String[])>
		a(((Bundle) (s1)));
	//   48  108:aload_0         
	//   49  109:aload_1         
	//   50  110:invokespecial   #250 <Method void a(Bundle)>
		obj;
	//   51  113:aload_2         
		JVM INSTR monitorexit ;
	//   52  114:monitorexit     
		return;
	//   53  115:return          
		s1;
	//   54  116:astore_1        
		obj;
	//   55  117:aload_2         
		JVM INSTR monitorexit ;
	//   56  118:monitorexit     
		throw s1;
	//   57  119:aload_1         
	//   58  120:athrow          
	}

	public final void c(boolean flag)
	{
label0:
		{
			o();
	//    0    0:aload_0         
	//    1    1:invokespecial   #238 <Method void o()>
			synchronized(a)
	//*   2    4:aload_0         
	//*   3    5:getfield        #51  <Field Object a>
	//*   4    8:astore_2        
	//*   5    9:aload_2         
	//*   6   10:monitorenter    
			{
				if(v != flag)
					break label0;
	//    7   11:aload_0         
	//    8   12:getfield        #95  <Field boolean v>
	//    9   15:iload_1         
	//   10   16:icmpne          22
			}
	//   11   19:aload_2         
	//   12   20:monitorexit     
			return;
	//   13   21:return          
		}
		v = flag;
	//   14   22:aload_0         
	//   15   23:iload_1         
	//   16   24:putfield        #95  <Field boolean v>
		if(g != null)
	//*  17   27:aload_0         
	//*  18   28:getfield        #240 <Field android.content.SharedPreferences$Editor g>
	//*  19   31:ifnull          56
		{
			g.putBoolean("content_vertical_opted_out", flag);
	//   20   34:aload_0         
	//   21   35:getfield        #240 <Field android.content.SharedPreferences$Editor g>
	//   22   38:ldc1            #175 <String "content_vertical_opted_out">
	//   23   40:iload_1         
	//   24   41:invokeinterface #391 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putBoolean(String, boolean)>
	//   25   46:pop             
			g.apply();
	//   26   47:aload_0         
	//   27   48:getfield        #240 <Field android.content.SharedPreferences$Editor g>
	//   28   51:invokeinterface #248 <Method void android.content.SharedPreferences$Editor.apply()>
		}
		Bundle bundle = new Bundle();
	//   29   56:new             #162 <Class Bundle>
	//   30   59:dup             
	//   31   60:invokespecial   #163 <Method void Bundle()>
	//   32   63:astore_3        
		bundle.putBoolean("content_url_opted_out", u);
	//   33   64:aload_3         
	//   34   65:ldc1            #173 <String "content_url_opted_out">
	//   35   67:aload_0         
	//   36   68:getfield        #93  <Field boolean u>
	//   37   71:invokevirtual   #169 <Method void Bundle.putBoolean(String, boolean)>
		bundle.putBoolean("content_vertical_opted_out", v);
	//   38   74:aload_3         
	//   39   75:ldc1            #175 <String "content_vertical_opted_out">
	//   40   77:aload_0         
	//   41   78:getfield        #95  <Field boolean v>
	//   42   81:invokevirtual   #169 <Method void Bundle.putBoolean(String, boolean)>
		a(bundle);
	//   43   84:aload_0         
	//   44   85:aload_3         
	//   45   86:invokespecial   #250 <Method void a(Bundle)>
		obj;
	//   46   89:aload_2         
		JVM INSTR monitorexit ;
	//   47   90:monitorexit     
		return;
	//   48   91:return          
		exception;
	//   49   92:astore_3        
		obj;
	//   50   93:aload_2         
		JVM INSTR monitorexit ;
	//   51   94:monitorexit     
		throw exception;
	//   52   95:aload_3         
	//   53   96:athrow          
	}

	public final void d(String s1)
	{
label0:
		{
			o();
	//    0    0:aload_0         
	//    1    1:invokespecial   #238 <Method void o()>
			synchronized(a)
	//*   2    4:aload_0         
	//*   3    5:getfield        #51  <Field Object a>
	//*   4    8:astore_2        
	//*   5    9:aload_2         
	//*   6   10:monitorenter    
			{
				if(s.contains(((Object) (s1))))
					break label0;
	//    7   11:aload_0         
	//    8   12:getfield        #86  <Field Set s>
	//    9   15:aload_1         
	//   10   16:invokeinterface #395 <Method boolean Set.contains(Object)>
	//   11   21:ifne            27
			}
	//   12   24:aload_2         
	//   13   25:monitorexit     
			return;
	//   14   26:return          
		}
		s.remove(((Object) (s1)));
	//   15   27:aload_0         
	//   16   28:getfield        #86  <Field Set s>
	//   17   31:aload_1         
	//   18   32:invokeinterface #405 <Method boolean Set.remove(Object)>
	//   19   37:pop             
		if(g != null)
	//*  20   38:aload_0         
	//*  21   39:getfield        #240 <Field android.content.SharedPreferences$Editor g>
	//*  22   42:ifnull          70
		{
			g.putStringSet("never_pool_slots", s);
	//   23   45:aload_0         
	//   24   46:getfield        #240 <Field android.content.SharedPreferences$Editor g>
	//   25   49:ldc1            #185 <String "never_pool_slots">
	//   26   51:aload_0         
	//   27   52:getfield        #86  <Field Set s>
	//   28   55:invokeinterface #402 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putStringSet(String, Set)>
	//   29   60:pop             
			g.apply();
	//   30   61:aload_0         
	//   31   62:getfield        #240 <Field android.content.SharedPreferences$Editor g>
	//   32   65:invokeinterface #248 <Method void android.content.SharedPreferences$Editor.apply()>
		}
		s1 = ((String) (new Bundle()));
	//   33   70:new             #162 <Class Bundle>
	//   34   73:dup             
	//   35   74:invokespecial   #163 <Method void Bundle()>
	//   36   77:astore_1        
		((Bundle) (s1)).putStringArray("never_pool_slots", (String[])s.toArray(((Object []) (new String[s.size()]))));
	//   37   78:aload_1         
	//   38   79:ldc1            #185 <String "never_pool_slots">
	//   39   81:aload_0         
	//   40   82:getfield        #86  <Field Set s>
	//   41   85:aload_0         
	//   42   86:getfield        #86  <Field Set s>
	//   43   89:invokeinterface #191 <Method int Set.size()>
	//   44   94:anewarray       String[]
	//   45   97:invokeinterface #197 <Method Object[] Set.toArray(Object[])>
	//   46  102:checkcast       #199 <Class String[]>
	//   47  105:invokevirtual   #203 <Method void Bundle.putStringArray(String, String[])>
		a(((Bundle) (s1)));
	//   48  108:aload_0         
	//   49  109:aload_1         
	//   50  110:invokespecial   #250 <Method void a(Bundle)>
		obj;
	//   51  113:aload_2         
		JVM INSTR monitorexit ;
	//   52  114:monitorexit     
		return;
	//   53  115:return          
		s1;
	//   54  116:astore_1        
		obj;
	//   55  117:aload_2         
		JVM INSTR monitorexit ;
	//   56  118:monitorexit     
		throw s1;
	//   57  119:aload_1         
	//   58  120:athrow          
	}

	public final void d(boolean flag)
	{
label0:
		{
			o();
	//    0    0:aload_0         
	//    1    1:invokespecial   #238 <Method void o()>
			synchronized(a)
	//*   2    4:aload_0         
	//*   3    5:getfield        #51  <Field Object a>
	//*   4    8:astore_2        
	//*   5    9:aload_2         
	//*   6   10:monitorenter    
			{
				if(l != flag)
					break label0;
	//    7   11:aload_0         
	//    8   12:getfield        #64  <Field boolean l>
	//    9   15:iload_1         
	//   10   16:icmpne          22
			}
	//   11   19:aload_2         
	//   12   20:monitorexit     
			return;
	//   13   21:return          
		}
		l = flag;
	//   14   22:aload_0         
	//   15   23:iload_1         
	//   16   24:putfield        #64  <Field boolean l>
		if(g != null)
	//*  17   27:aload_0         
	//*  18   28:getfield        #240 <Field android.content.SharedPreferences$Editor g>
	//*  19   31:ifnull          56
		{
			g.putBoolean("auto_collect_location", flag);
	//   20   34:aload_0         
	//   21   35:getfield        #240 <Field android.content.SharedPreferences$Editor g>
	//   22   38:ldc1            #177 <String "auto_collect_location">
	//   23   40:iload_1         
	//   24   41:invokeinterface #391 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putBoolean(String, boolean)>
	//   25   46:pop             
			g.apply();
	//   26   47:aload_0         
	//   27   48:getfield        #240 <Field android.content.SharedPreferences$Editor g>
	//   28   51:invokeinterface #248 <Method void android.content.SharedPreferences$Editor.apply()>
		}
		Bundle bundle = new Bundle();
	//   29   56:new             #162 <Class Bundle>
	//   30   59:dup             
	//   31   60:invokespecial   #163 <Method void Bundle()>
	//   32   63:astore_3        
		bundle.putBoolean("auto_collect_location", flag);
	//   33   64:aload_3         
	//   34   65:ldc1            #177 <String "auto_collect_location">
	//   35   67:iload_1         
	//   36   68:invokevirtual   #169 <Method void Bundle.putBoolean(String, boolean)>
		a(bundle);
	//   37   71:aload_0         
	//   38   72:aload_3         
	//   39   73:invokespecial   #250 <Method void a(Bundle)>
		obj;
	//   40   76:aload_2         
		JVM INSTR monitorexit ;
	//   41   77:monitorexit     
		return;
	//   42   78:return          
		exception;
	//   43   79:astore_3        
		obj;
	//   44   80:aload_2         
		JVM INSTR monitorexit ;
	//   45   81:monitorexit     
		throw exception;
	//   46   82:aload_3         
	//   47   83:athrow          
	}

	public final boolean d()
	{
		o();
	//    0    0:aload_0         
	//    1    1:invokespecial   #238 <Method void o()>
		boolean flag;
		synchronized(a)
	//*   2    4:aload_0         
	//*   3    5:getfield        #51  <Field Object a>
	//*   4    8:astore_2        
	//*   5    9:aload_2         
	//*   6   10:monitorenter    
		{
			flag = v;
	//    7   11:aload_0         
	//    8   12:getfield        #95  <Field boolean v>
	//    9   15:istore_1        
		}
	//   10   16:aload_2         
	//   11   17:monitorexit     
		return flag;
	//   12   18:iload_1         
	//   13   19:ireturn         
		exception;
	//   14   20:astore_3        
		obj;
	//   15   21:aload_2         
		JVM INSTR monitorexit ;
	//   16   22:monitorexit     
		throw exception;
	//   17   23:aload_3         
	//   18   24:athrow          
	}

	public final String e()
	{
		o();
	//    0    0:aload_0         
	//    1    1:invokespecial   #238 <Method void o()>
		String s1;
		synchronized(a)
	//*   2    4:aload_0         
	//*   3    5:getfield        #51  <Field Object a>
	//*   4    8:astore_1        
	//*   5    9:aload_1         
	//*   6   10:monitorenter    
		{
			s1 = k;
	//    7   11:aload_0         
	//    8   12:getfield        #233 <Field String k>
	//    9   15:astore_2        
		}
	//   10   16:aload_1         
	//   11   17:monitorexit     
		return s1;
	//   12   18:aload_2         
	//   13   19:areturn         
		exception;
	//   14   20:astore_2        
		obj;
	//   15   21:aload_1         
		JVM INSTR monitorexit ;
	//   16   22:monitorexit     
		throw exception;
	//   17   23:aload_2         
	//   18   24:athrow          
	}

	public final boolean e(String s1)
	{
		o();
	//    0    0:aload_0         
	//    1    1:invokespecial   #238 <Method void o()>
		boolean flag;
		synchronized(a)
	//*   2    4:aload_0         
	//*   3    5:getfield        #51  <Field Object a>
	//*   4    8:astore_3        
	//*   5    9:aload_3         
	//*   6   10:monitorenter    
		{
			flag = s.contains(((Object) (s1)));
	//    7   11:aload_0         
	//    8   12:getfield        #86  <Field Set s>
	//    9   15:aload_1         
	//   10   16:invokeinterface #395 <Method boolean Set.contains(Object)>
	//   11   21:istore_2        
		}
	//   12   22:aload_3         
	//   13   23:monitorexit     
		return flag;
	//   14   24:iload_2         
	//   15   25:ireturn         
		s1;
	//   16   26:astore_1        
		obj;
	//   17   27:aload_3         
		JVM INSTR monitorexit ;
	//   18   28:monitorexit     
		throw s1;
	//   19   29:aload_1         
	//   20   30:athrow          
	}

	public final void f(String s1)
	{
		o();
	//    0    0:aload_0         
	//    1    1:invokespecial   #238 <Method void o()>
		Object obj = a;
	//    2    4:aload_0         
	//    3    5:getfield        #51  <Field Object a>
	//    4    8:astore          4
		obj;
	//    5   10:aload           4
		JVM INSTR monitorenter ;
	//    6   12:monitorenter    
		long l1;
		l1 = aw.l().a();
	//    7   13:invokestatic    #374 <Method e aw.l()>
	//    8   16:invokeinterface #379 <Method long e.a()>
	//    9   21:lstore_2        
		n = l1;
	//   10   22:aload_0         
	//   11   23:lload_2         
	//   12   24:putfield        #70  <Field long n>
		if(s1 == null)
			break MISSING_BLOCK_LABEL_163;
	//   13   27:aload_1         
	//   14   28:ifnull          163
		if(s1.equals(((Object) (m))))
	//*  15   31:aload_1         
	//*  16   32:aload_0         
	//*  17   33:getfield        #68  <Field String m>
	//*  18   36:invokevirtual   #330 <Method boolean String.equals(Object)>
	//*  19   39:ifeq            45
			break MISSING_BLOCK_LABEL_163;
	//   20   42:goto            163
		m = s1;
	//   21   45:aload_0         
	//   22   46:aload_1         
	//   23   47:putfield        #68  <Field String m>
		if(g != null)
	//*  24   50:aload_0         
	//*  25   51:getfield        #240 <Field android.content.SharedPreferences$Editor g>
	//*  26   54:ifnull          92
		{
			g.putString("app_settings_json", s1);
	//   27   57:aload_0         
	//   28   58:getfield        #240 <Field android.content.SharedPreferences$Editor g>
	//   29   61:ldc1            #205 <String "app_settings_json">
	//   30   63:aload_1         
	//   31   64:invokeinterface #333 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putString(String, String)>
	//   32   69:pop             
			g.putLong("app_settings_last_update_ms", l1);
	//   33   70:aload_0         
	//   34   71:getfield        #240 <Field android.content.SharedPreferences$Editor g>
	//   35   74:ldc1            #211 <String "app_settings_last_update_ms">
	//   36   76:lload_2         
	//   37   77:invokeinterface #254 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putLong(String, long)>
	//   38   82:pop             
			g.apply();
	//   39   83:aload_0         
	//   40   84:getfield        #240 <Field android.content.SharedPreferences$Editor g>
	//   41   87:invokeinterface #248 <Method void android.content.SharedPreferences$Editor.apply()>
		}
		Bundle bundle = new Bundle();
	//   42   92:new             #162 <Class Bundle>
	//   43   95:dup             
	//   44   96:invokespecial   #163 <Method void Bundle()>
	//   45   99:astore          5
		bundle.putString("app_settings_json", s1);
	//   46  101:aload           5
	//   47  103:ldc1            #205 <String "app_settings_json">
	//   48  105:aload_1         
	//   49  106:invokevirtual   #209 <Method void Bundle.putString(String, String)>
		bundle.putLong("app_settings_last_update_ms", l1);
	//   50  109:aload           5
	//   51  111:ldc1            #211 <String "app_settings_last_update_ms">
	//   52  113:lload_2         
	//   53  114:invokevirtual   #215 <Method void Bundle.putLong(String, long)>
		a(bundle);
	//   54  117:aload_0         
	//   55  118:aload           5
	//   56  120:invokespecial   #250 <Method void a(Bundle)>
		for(s1 = ((String) (c.iterator())); ((Iterator) (s1)).hasNext(); ((Runnable)((Iterator) (s1)).next()).run());
	//   57  123:aload_0         
	//   58  124:getfield        #56  <Field List c>
	//   59  127:invokeinterface #412 <Method Iterator List.iterator()>
	//   60  132:astore_1        
	//   61  133:aload_1         
	//   62  134:invokeinterface #417 <Method boolean Iterator.hasNext()>
	//   63  139:ifeq            159
	//   64  142:aload_1         
	//   65  143:invokeinterface #421 <Method Object Iterator.next()>
	//   66  148:checkcast       #423 <Class Runnable>
	//   67  151:invokeinterface #426 <Method void Runnable.run()>
	//*  68  156:goto            133
		obj;
	//   69  159:aload           4
		JVM INSTR monitorexit ;
	//   70  161:monitorexit     
		return;
	//   71  162:return          
		obj;
	//   72  163:aload           4
		JVM INSTR monitorexit ;
	//   73  165:monitorexit     
		return;
	//   74  166:return          
		s1;
	//   75  167:astore_1        
		obj;
	//   76  168:aload           4
		JVM INSTR monitorexit ;
	//   77  170:monitorexit     
		throw s1;
	//   78  171:aload_1         
	//   79  172:athrow          
	}

	public final boolean f()
	{
		o();
	//    0    0:aload_0         
	//    1    1:invokespecial   #238 <Method void o()>
		boolean flag;
		synchronized(a)
	//*   2    4:aload_0         
	//*   3    5:getfield        #51  <Field Object a>
	//*   4    8:astore_2        
	//*   5    9:aload_2         
	//*   6   10:monitorenter    
		{
			flag = l;
	//    7   11:aload_0         
	//    8   12:getfield        #64  <Field boolean l>
	//    9   15:istore_1        
		}
	//   10   16:aload_2         
	//   11   17:monitorexit     
		return flag;
	//   12   18:iload_1         
	//   13   19:ireturn         
		exception;
	//   14   20:astore_3        
		obj;
	//   15   21:aload_2         
		JVM INSTR monitorexit ;
	//   16   22:monitorexit     
		throw exception;
	//   17   23:aload_3         
	//   18   24:athrow          
	}

	public final int g()
	{
		o();
	//    0    0:aload_0         
	//    1    1:invokespecial   #238 <Method void o()>
		int i1;
		synchronized(a)
	//*   2    4:aload_0         
	//*   3    5:getfield        #51  <Field Object a>
	//*   4    8:astore_2        
	//*   5    9:aload_2         
	//*   6   10:monitorenter    
		{
			i1 = r;
	//    7   11:aload_0         
	//    8   12:getfield        #78  <Field int r>
	//    9   15:istore_1        
		}
	//   10   16:aload_2         
	//   11   17:monitorexit     
		return i1;
	//   12   18:iload_1         
	//   13   19:ireturn         
		exception;
	//   14   20:astore_3        
		obj;
	//   15   21:aload_2         
		JVM INSTR monitorexit ;
	//   16   22:monitorexit     
		throw exception;
	//   17   23:aload_3         
	//   18   24:athrow          
	}

	public final wh h()
	{
		o();
	//    0    0:aload_0         
	//    1    1:invokespecial   #238 <Method void o()>
		wh wh1;
		synchronized(a)
	//*   2    4:aload_0         
	//*   3    5:getfield        #51  <Field Object a>
	//*   4    8:astore_1        
	//*   5    9:aload_1         
	//*   6   10:monitorenter    
		{
			wh1 = new wh(m, n);
	//    7   11:new             #429 <Class wh>
	//    8   14:dup             
	//    9   15:aload_0         
	//   10   16:getfield        #68  <Field String m>
	//   11   19:aload_0         
	//   12   20:getfield        #70  <Field long n>
	//   13   23:invokespecial   #431 <Method void wh(String, long)>
	//   14   26:astore_2        
		}
	//   15   27:aload_1         
	//   16   28:monitorexit     
		return wh1;
	//   17   29:aload_2         
	//   18   30:areturn         
		exception;
	//   19   31:astore_2        
		obj;
	//   20   32:aload_1         
		JVM INSTR monitorexit ;
	//   21   33:monitorexit     
		throw exception;
	//   22   34:aload_2         
	//   23   35:athrow          
	}

	public final long i()
	{
		o();
	//    0    0:aload_0         
	//    1    1:invokespecial   #238 <Method void o()>
		long l1;
		synchronized(a)
	//*   2    4:aload_0         
	//*   3    5:getfield        #51  <Field Object a>
	//*   4    8:astore_3        
	//*   5    9:aload_3         
	//*   6   10:monitorenter    
		{
			l1 = o;
	//    7   11:aload_0         
	//    8   12:getfield        #72  <Field long o>
	//    9   15:lstore_1        
		}
	//   10   16:aload_3         
	//   11   17:monitorexit     
		return l1;
	//   12   18:lload_1         
	//   13   19:lreturn         
		exception;
	//   14   20:astore          4
		obj;
	//   15   22:aload_3         
		JVM INSTR monitorexit ;
	//   16   23:monitorexit     
		throw exception;
	//   17   24:aload           4
	//   18   26:athrow          
	}

	public final int j()
	{
		o();
	//    0    0:aload_0         
	//    1    1:invokespecial   #238 <Method void o()>
		int i1;
		synchronized(a)
	//*   2    4:aload_0         
	//*   3    5:getfield        #51  <Field Object a>
	//*   4    8:astore_2        
	//*   5    9:aload_2         
	//*   6   10:monitorenter    
		{
			i1 = q;
	//    7   11:aload_0         
	//    8   12:getfield        #76  <Field int q>
	//    9   15:istore_1        
		}
	//   10   16:aload_2         
	//   11   17:monitorexit     
		return i1;
	//   12   18:iload_1         
	//   13   19:ireturn         
		exception;
	//   14   20:astore_3        
		obj;
	//   15   21:aload_2         
		JVM INSTR monitorexit ;
	//   16   22:monitorexit     
		throw exception;
	//   17   23:aload_3         
	//   18   24:athrow          
	}

	public final long k()
	{
		o();
	//    0    0:aload_0         
	//    1    1:invokespecial   #238 <Method void o()>
		long l1;
		synchronized(a)
	//*   2    4:aload_0         
	//*   3    5:getfield        #51  <Field Object a>
	//*   4    8:astore_3        
	//*   5    9:aload_3         
	//*   6   10:monitorenter    
		{
			l1 = p;
	//    7   11:aload_0         
	//    8   12:getfield        #74  <Field long p>
	//    9   15:lstore_1        
		}
	//   10   16:aload_3         
	//   11   17:monitorexit     
		return l1;
	//   12   18:lload_1         
	//   13   19:lreturn         
		exception;
	//   14   20:astore          4
		obj;
	//   15   22:aload_3         
		JVM INSTR monitorexit ;
	//   16   23:monitorexit     
		throw exception;
	//   17   24:aload           4
	//   18   26:athrow          
	}

	public final JSONObject l()
	{
		o();
	//    0    0:aload_0         
	//    1    1:invokespecial   #238 <Method void o()>
		JSONObject jsonobject;
		synchronized(a)
	//*   2    4:aload_0         
	//*   3    5:getfield        #51  <Field Object a>
	//*   4    8:astore_1        
	//*   5    9:aload_1         
	//*   6   10:monitorenter    
		{
			jsonobject = t;
	//    7   11:aload_0         
	//    8   12:getfield        #91  <Field JSONObject t>
	//    9   15:astore_2        
		}
	//   10   16:aload_1         
	//   11   17:monitorexit     
		return jsonobject;
	//   12   18:aload_2         
	//   13   19:areturn         
		exception;
	//   14   20:astore_2        
		obj;
	//   15   21:aload_1         
		JVM INSTR monitorexit ;
	//   16   22:monitorexit     
		throw exception;
	//   17   23:aload_2         
	//   18   24:athrow          
	}

	public final void m()
	{
		o();
	//    0    0:aload_0         
	//    1    1:invokespecial   #238 <Method void o()>
		synchronized(a)
	//*   2    4:aload_0         
	//*   3    5:getfield        #51  <Field Object a>
	//*   4    8:astore_1        
	//*   5    9:aload_1         
	//*   6   10:monitorenter    
		{
			t = new JSONObject();
	//    7   11:aload_0         
	//    8   12:new             #88  <Class JSONObject>
	//    9   15:dup             
	//   10   16:invokespecial   #89  <Method void JSONObject()>
	//   11   19:putfield        #91  <Field JSONObject t>
			if(g != null)
	//*  12   22:aload_0         
	//*  13   23:getfield        #240 <Field android.content.SharedPreferences$Editor g>
	//*  14   26:ifnull          50
			{
				g.remove("native_advanced_settings");
	//   15   29:aload_0         
	//   16   30:getfield        #240 <Field android.content.SharedPreferences$Editor g>
	//   17   33:ldc1            #223 <String "native_advanced_settings">
	//   18   35:invokeinterface #435 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.remove(String)>
	//   19   40:pop             
				g.apply();
	//   20   41:aload_0         
	//   21   42:getfield        #240 <Field android.content.SharedPreferences$Editor g>
	//   22   45:invokeinterface #248 <Method void android.content.SharedPreferences$Editor.apply()>
			}
			Bundle bundle = new Bundle();
	//   23   50:new             #162 <Class Bundle>
	//   24   53:dup             
	//   25   54:invokespecial   #163 <Method void Bundle()>
	//   26   57:astore_2        
			bundle.putString("native_advanced_settings", "{}");
	//   27   58:aload_2         
	//   28   59:ldc1            #223 <String "native_advanced_settings">
	//   29   61:ldc2            #306 <String "{}">
	//   30   64:invokevirtual   #209 <Method void Bundle.putString(String, String)>
			a(bundle);
	//   31   67:aload_0         
	//   32   68:aload_2         
	//   33   69:invokespecial   #250 <Method void a(Bundle)>
		}
	//   34   72:aload_1         
	//   35   73:monitorexit     
		return;
	//   36   74:return          
		exception;
	//   37   75:astore_2        
		obj;
	//   38   76:aload_1         
		JVM INSTR monitorexit ;
	//   39   77:monitorexit     
		throw exception;
	//   40   78:aload_2         
	//   41   79:athrow          
	}

	public final bqp n()
	{
label0:
		{
			if(!b)
	//*   0    0:aload_0         
	//*   1    1:getfield        #326 <Field boolean b>
	//*   2    4:ifne            9
				return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
			if(!com.google.android.gms.common.util.o.a())
	//*   5    9:invokestatic    #438 <Method boolean o.a()>
	//*   6   12:ifne            17
				return null;
	//    7   15:aconst_null     
	//    8   16:areturn         
			if(b() && d())
	//*   9   17:aload_0         
	//*  10   18:invokevirtual   #440 <Method boolean b()>
	//*  11   21:ifeq            33
	//*  12   24:aload_0         
	//*  13   25:invokevirtual   #442 <Method boolean d()>
	//*  14   28:ifeq            33
				return null;
	//   15   31:aconst_null     
	//   16   32:areturn         
			com.google.android.gms.internal.ads.e e1 = p.N;
	//   17   33:getstatic       #448 <Field com.google.android.gms.internal.ads.e p.N>
	//   18   36:astore_1        
			if(!((Boolean)com.google.android.gms.internal.ads.bwk.e().a(e1)).booleanValue())
	//*  19   37:invokestatic    #453 <Method m com.google.android.gms.internal.ads.bwk.e()>
	//*  20   40:aload_1         
	//*  21   41:invokevirtual   #458 <Method Object m.a(com.google.android.gms.internal.ads.e)>
	//*  22   44:checkcast       #460 <Class Boolean>
	//*  23   47:invokevirtual   #463 <Method boolean Boolean.booleanValue()>
	//*  24   50:ifne            55
				return null;
	//   25   53:aconst_null     
	//   26   54:areturn         
			synchronized(a)
	//*  27   55:aload_0         
	//*  28   56:getfield        #51  <Field Object a>
	//*  29   59:astore_1        
	//*  30   60:aload_1         
	//*  31   61:monitorenter    
			{
				if(Looper.getMainLooper() != null)
					break label0;
	//   32   62:invokestatic    #469 <Method Looper Looper.getMainLooper()>
	//   33   65:ifnonnull       72
			}
	//   34   68:aload_1         
	//   35   69:monitorexit     
			return null;
	//   36   70:aconst_null     
	//   37   71:areturn         
		}
		bqp bqp1;
		if(e == null)
	//*  38   72:aload_0         
	//*  39   73:getfield        #58  <Field bqp e>
	//*  40   76:ifnonnull       90
			e = new bqp();
	//   41   79:aload_0         
	//   42   80:new             #471 <Class bqp>
	//   43   83:dup             
	//   44   84:invokespecial   #472 <Method void bqp()>
	//   45   87:putfield        #58  <Field bqp e>
		e.a();
	//   46   90:aload_0         
	//   47   91:getfield        #58  <Field bqp e>
	//   48   94:invokevirtual   #474 <Method void bqp.a()>
		wx.d("start fetching content...");
	//   49   97:ldc2            #476 <String "start fetching content...">
	//   50  100:invokestatic    #478 <Method void wx.d(String)>
		bqp1 = e;
	//   51  103:aload_0         
	//   52  104:getfield        #58  <Field bqp e>
	//   53  107:astore_2        
		obj;
	//   54  108:aload_1         
		JVM INSTR monitorexit ;
	//   55  109:monitorexit     
		return bqp1;
	//   56  110:aload_2         
	//   57  111:areturn         
		exception;
	//   58  112:astore_2        
		obj;
	//   59  113:aload_1         
		JVM INSTR monitorexit ;
	//   60  114:monitorexit     
		throw exception;
	//   61  115:aload_2         
	//   62  116:athrow          
	}

	private final Object a = new Object();
	private boolean b;
	private final List c = new ArrayList();
	private abe d;
	private bqp e;
	private SharedPreferences f;
	private android.content.SharedPreferences.Editor g;
	private boolean h;
	private boolean i;
	private String j;
	private String k;
	private boolean l;
	private String m;
	private long n;
	private long o;
	private long p;
	private int q;
	private int r;
	private Set s;
	private JSONObject t;
	private boolean u;
	private boolean v;
}
