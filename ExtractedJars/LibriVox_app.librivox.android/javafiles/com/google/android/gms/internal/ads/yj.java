// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.aw;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal.ads:
//			xg, wx, yk, p, 
//			bwk, m, ys, abe

public final class yj
{

	public yj()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #4   <Class Object>
	//    4    8:dup             
	//    5    9:invokespecial   #20  <Method void Object()>
	//    6   12:putfield        #22  <Field Object a>
		b = "";
	//    7   15:aload_0         
	//    8   16:ldc1            #24  <String "">
	//    9   18:putfield        #26  <Field String b>
		c = "";
	//   10   21:aload_0         
	//   11   22:ldc1            #24  <String "">
	//   12   24:putfield        #28  <Field String c>
		d = false;
	//   13   27:aload_0         
	//   14   28:iconst_0        
	//   15   29:putfield        #30  <Field boolean d>
		e = "";
	//   16   32:aload_0         
	//   17   33:ldc1            #24  <String "">
	//   18   35:putfield        #32  <Field String e>
	//   19   38:return          
	}

	private final String a(Context context)
	{
		synchronized(a)
	//*   0    0:aload_0         
	//*   1    1:getfield        #22  <Field Object a>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
		{
			if(TextUtils.isEmpty(((CharSequence) (b))))
	//*   5    7:aload_0         
	//*   6    8:getfield        #26  <Field String b>
	//*   7   11:invokestatic    #40  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   8   14:ifeq            66
			{
				aw.e();
	//    9   17:invokestatic    #45  <Method xg aw.e()>
	//   10   20:pop             
				b = xg.c(context, "debug_signals_id.txt");
	//   11   21:aload_0         
	//   12   22:aload_1         
	//   13   23:ldc1            #47  <String "debug_signals_id.txt">
	//   14   25:invokestatic    #52  <Method String xg.c(Context, String)>
	//   15   28:putfield        #26  <Field String b>
				if(TextUtils.isEmpty(((CharSequence) (b))))
	//*  16   31:aload_0         
	//*  17   32:getfield        #26  <Field String b>
	//*  18   35:invokestatic    #40  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  19   38:ifeq            66
				{
					aw.e();
	//   20   41:invokestatic    #45  <Method xg aw.e()>
	//   21   44:pop             
					b = xg.a();
	//   22   45:aload_0         
	//   23   46:invokestatic    #55  <Method String xg.a()>
	//   24   49:putfield        #26  <Field String b>
					aw.e();
	//   25   52:invokestatic    #45  <Method xg aw.e()>
	//   26   55:pop             
					xg.b(context, "debug_signals_id.txt", b);
	//   27   56:aload_1         
	//   28   57:ldc1            #47  <String "debug_signals_id.txt">
	//   29   59:aload_0         
	//   30   60:getfield        #26  <Field String b>
	//   31   63:invokestatic    #58  <Method void xg.b(Context, String, String)>
				}
			}
			context = ((Context) (b));
	//   32   66:aload_0         
	//   33   67:getfield        #26  <Field String b>
	//   34   70:astore_1        
		}
	//   35   71:aload_2         
	//   36   72:monitorexit     
		return ((String) (context));
	//   37   73:aload_1         
	//   38   74:areturn         
		context;
	//   39   75:astore_1        
		obj;
	//   40   76:aload_2         
		JVM INSTR monitorexit ;
	//   41   77:monitorexit     
		throw context;
	//   42   78:aload_1         
	//   43   79:athrow          
	}

	private final void a(Context context, String s, boolean flag, boolean flag1)
	{
		if(!(context instanceof Activity))
	//*   0    0:aload_1         
	//*   1    1:instanceof      #61  <Class Activity>
	//*   2    4:ifne            13
		{
			wx.d("Can not create dialog without Activity Context");
	//    3    7:ldc1            #63  <String "Can not create dialog without Activity Context">
	//    4    9:invokestatic    #68  <Method void wx.d(String)>
			return;
	//    5   12:return          
		} else
		{
			xg.a.post(((Runnable) (new yk(this, context, s, flag, flag1))));
	//    6   13:getstatic       #71  <Field Handler xg.a>
	//    7   16:new             #73  <Class yk>
	//    8   19:dup             
	//    9   20:aload_0         
	//   10   21:aload_1         
	//   11   22:aload_2         
	//   12   23:iload_3         
	//   13   24:iload           4
	//   14   26:invokespecial   #76  <Method void yk(yj, Context, String, boolean, boolean)>
	//   15   29:invokevirtual   #82  <Method boolean Handler.post(Runnable)>
	//   16   32:pop             
			return;
	//   17   33:return          
		}
	}

	private final boolean b(Context context, String s, String s1)
	{
		e e1 = p.cl;
	//    0    0:getstatic       #91  <Field e p.cl>
	//    1    3:astore          4
		context = ((Context) (d(context, c(context, (String)bwk.e().a(e1), s, s1).toString(), s1)));
	//    2    5:aload_1         
	//    3    6:aload_0         
	//    4    7:aload_1         
	//    5    8:invokestatic    #96  <Method m bwk.e()>
	//    6   11:aload           4
	//    7   13:invokevirtual   #101 <Method Object m.a(e)>
	//    8   16:checkcast       #103 <Class String>
	//    9   19:aload_2         
	//   10   20:aload_3         
	//   11   21:invokespecial   #106 <Method Uri c(Context, String, String, String)>
	//   12   24:invokevirtual   #111 <Method String Uri.toString()>
	//   13   27:aload_3         
	//   14   28:invokestatic    #114 <Method String d(Context, String, String)>
	//   15   31:astore_1        
		if(TextUtils.isEmpty(((CharSequence) (context))))
	//*  16   32:aload_1         
	//*  17   33:invokestatic    #40  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  18   36:ifeq            46
		{
			wx.b("Not linked for in app preview.");
	//   19   39:ldc1            #116 <String "Not linked for in app preview.">
	//   20   41:invokestatic    #118 <Method void wx.b(String)>
			return false;
	//   21   44:iconst_0        
	//   22   45:ireturn         
		}
		context = ((Context) (((String) (context)).trim()));
	//   23   46:aload_1         
	//   24   47:invokevirtual   #121 <Method String String.trim()>
	//   25   50:astore_1        
		try
		{
			s = ((String) (new JSONObject(((String) (context)))));
	//   26   51:new             #123 <Class JSONObject>
	//   27   54:dup             
	//   28   55:aload_1         
	//   29   56:invokespecial   #125 <Method void JSONObject(String)>
	//   30   59:astore_2        
			context = ((Context) (((JSONObject) (s)).optString("gct")));
	//   31   60:aload_2         
	//   32   61:ldc1            #127 <String "gct">
	//   33   63:invokevirtual   #131 <Method String JSONObject.optString(String)>
	//   34   66:astore_1        
			e = ((JSONObject) (s)).optString("status");
	//   35   67:aload_0         
	//   36   68:aload_2         
	//   37   69:ldc1            #133 <String "status">
	//   38   71:invokevirtual   #131 <Method String JSONObject.optString(String)>
	//   39   74:putfield        #32  <Field String e>
		}
	//*  40   77:aload_0         
	//*  41   78:getfield        #22  <Field Object a>
	//*  42   81:astore_2        
	//*  43   82:aload_2         
	//*  44   83:monitorenter    
	//*  45   84:aload_0         
	//*  46   85:aload_1         
	//*  47   86:putfield        #28  <Field String c>
	//*  48   89:aload_2         
	//*  49   90:monitorexit     
	//*  50   91:iconst_1        
	//*  51   92:ireturn         
	//*  52   93:astore_1        
	//*  53   94:aload_2         
	//*  54   95:monitorexit     
	//*  55   96:aload_1         
	//*  56   97:athrow          
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*  57   98:astore_1        
		{
			wx.c("Fail to get in app preview response json.", ((Throwable) (context)));
	//   58   99:ldc1            #135 <String "Fail to get in app preview response json.">
	//   59  101:aload_1         
	//   60  102:invokestatic    #138 <Method void wx.c(String, Throwable)>
			return false;
	//   61  105:iconst_0        
	//   62  106:ireturn         
		}
		synchronized(a)
		{
			c = ((String) (context));
		}
		return true;
		context;
		s;
		JVM INSTR monitorexit ;
		throw context;
	}

	private final Uri c(Context context, String s, String s1, String s2)
	{
		s = ((String) (Uri.parse(s).buildUpon()));
	//    0    0:aload_2         
	//    1    1:invokestatic    #142 <Method Uri Uri.parse(String)>
	//    2    4:invokevirtual   #146 <Method android.net.Uri$Builder Uri.buildUpon()>
	//    3    7:astore_2        
		((android.net.Uri.Builder) (s)).appendQueryParameter("linkedDeviceId", a(context));
	//    4    8:aload_2         
	//    5    9:ldc1            #148 <String "linkedDeviceId">
	//    6   11:aload_0         
	//    7   12:aload_1         
	//    8   13:invokespecial   #150 <Method String a(Context)>
	//    9   16:invokevirtual   #156 <Method android.net.Uri$Builder android.net.Uri$Builder.appendQueryParameter(String, String)>
	//   10   19:pop             
		((android.net.Uri.Builder) (s)).appendQueryParameter("adSlotPath", s1);
	//   11   20:aload_2         
	//   12   21:ldc1            #158 <String "adSlotPath">
	//   13   23:aload_3         
	//   14   24:invokevirtual   #156 <Method android.net.Uri$Builder android.net.Uri$Builder.appendQueryParameter(String, String)>
	//   15   27:pop             
		((android.net.Uri.Builder) (s)).appendQueryParameter("afmaVersion", s2);
	//   16   28:aload_2         
	//   17   29:ldc1            #160 <String "afmaVersion">
	//   18   31:aload           4
	//   19   33:invokevirtual   #156 <Method android.net.Uri$Builder android.net.Uri$Builder.appendQueryParameter(String, String)>
	//   20   36:pop             
		return ((android.net.Uri.Builder) (s)).build();
	//   21   37:aload_2         
	//   22   38:invokevirtual   #164 <Method Uri android.net.Uri$Builder.build()>
	//   23   41:areturn         
	}

	private final boolean c(Context context, String s, String s1)
	{
		e e1 = p.cm;
	//    0    0:getstatic       #167 <Field e p.cm>
	//    1    3:astore          5
		context = ((Context) (d(context, c(context, (String)bwk.e().a(e1), s, s1).toString(), s1)));
	//    2    5:aload_1         
	//    3    6:aload_0         
	//    4    7:aload_1         
	//    5    8:invokestatic    #96  <Method m bwk.e()>
	//    6   11:aload           5
	//    7   13:invokevirtual   #101 <Method Object m.a(e)>
	//    8   16:checkcast       #103 <Class String>
	//    9   19:aload_2         
	//   10   20:aload_3         
	//   11   21:invokespecial   #106 <Method Uri c(Context, String, String, String)>
	//   12   24:invokevirtual   #111 <Method String Uri.toString()>
	//   13   27:aload_3         
	//   14   28:invokestatic    #114 <Method String d(Context, String, String)>
	//   15   31:astore_1        
		if(TextUtils.isEmpty(((CharSequence) (context))))
	//*  16   32:aload_1         
	//*  17   33:invokestatic    #40  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  18   36:ifeq            46
		{
			wx.b("Not linked for debug signals.");
	//   19   39:ldc1            #169 <String "Not linked for debug signals.">
	//   20   41:invokestatic    #118 <Method void wx.b(String)>
			return false;
	//   21   44:iconst_0        
	//   22   45:ireturn         
		}
		context = ((Context) (((String) (context)).trim()));
	//   23   46:aload_1         
	//   24   47:invokevirtual   #121 <Method String String.trim()>
	//   25   50:astore_1        
		boolean flag;
		try
		{
			context = ((Context) ((new JSONObject(((String) (context)))).optString("debug_mode")));
	//   26   51:new             #123 <Class JSONObject>
	//   27   54:dup             
	//   28   55:aload_1         
	//   29   56:invokespecial   #125 <Method void JSONObject(String)>
	//   30   59:ldc1            #171 <String "debug_mode">
	//   31   61:invokevirtual   #131 <Method String JSONObject.optString(String)>
	//   32   64:astore_1        
		}
	//*  33   65:ldc1            #173 <String "1">
	//*  34   67:aload_1         
	//*  35   68:invokevirtual   #177 <Method boolean String.equals(Object)>
	//*  36   71:istore          4
	//*  37   73:aload_0         
	//*  38   74:getfield        #22  <Field Object a>
	//*  39   77:astore_1        
	//*  40   78:aload_1         
	//*  41   79:monitorenter    
	//*  42   80:aload_0         
	//*  43   81:iload           4
	//*  44   83:putfield        #30  <Field boolean d>
	//*  45   86:aload_1         
	//*  46   87:monitorexit     
	//*  47   88:iload           4
	//*  48   90:ireturn         
	//*  49   91:astore_2        
	//*  50   92:aload_1         
	//*  51   93:monitorexit     
	//*  52   94:aload_2         
	//*  53   95:athrow          
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*  54   96:astore_1        
		{
			wx.c("Fail to get debug mode response json.", ((Throwable) (context)));
	//   55   97:ldc1            #179 <String "Fail to get debug mode response json.">
	//   56   99:aload_1         
	//   57  100:invokestatic    #138 <Method void wx.c(String, Throwable)>
			return false;
	//   58  103:iconst_0        
	//   59  104:ireturn         
		}
		flag = "1".equals(((Object) (context)));
		synchronized(a)
		{
			d = flag;
		}
		return flag;
		s;
		context;
		JVM INSTR monitorexit ;
		throw s;
	}

	private static String d(Context context, String s, String s1)
	{
		HashMap hashmap = new HashMap();
	//    0    0:new             #187 <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #188 <Method void HashMap()>
	//    3    7:astore_3        
		((Map) (hashmap)).put("User-Agent", ((Object) (aw.e().b(context, s1))));
	//    4    8:aload_3         
	//    5    9:ldc1            #190 <String "User-Agent">
	//    6   11:invokestatic    #45  <Method xg aw.e()>
	//    7   14:aload_0         
	//    8   15:aload_2         
	//    9   16:invokevirtual   #192 <Method String xg.b(Context, String)>
	//   10   19:invokeinterface #198 <Method Object Map.put(Object, Object)>
	//   11   24:pop             
		s1 = ((String) ((new ys(context)).a(s, ((Map) (hashmap)))));
	//   12   25:new             #200 <Class ys>
	//   13   28:dup             
	//   14   29:aload_0         
	//   15   30:invokespecial   #203 <Method void ys(Context)>
	//   16   33:aload_1         
	//   17   34:aload_3         
	//   18   35:invokevirtual   #206 <Method abe ys.a(String, Map)>
	//   19   38:astore_2        
		context = ((Context) (p.co));
	//   20   39:getstatic       #209 <Field e p.co>
	//   21   42:astore_0        
		context = ((Context) ((String)((abe) (s1)).get(((Integer)bwk.e().a(((e) (context)))).intValue(), TimeUnit.MILLISECONDS)));
	//   22   43:aload_2         
	//   23   44:invokestatic    #96  <Method m bwk.e()>
	//   24   47:aload_0         
	//   25   48:invokevirtual   #101 <Method Object m.a(e)>
	//   26   51:checkcast       #211 <Class Integer>
	//   27   54:invokevirtual   #215 <Method int Integer.intValue()>
	//   28   57:i2l             
	//   29   58:getstatic       #221 <Field TimeUnit TimeUnit.MILLISECONDS>
	//   30   61:invokeinterface #227 <Method Object abe.get(long, TimeUnit)>
	//   31   66:checkcast       #103 <Class String>
	//   32   69:astore_0        
		return ((String) (context));
	//   33   70:aload_0         
	//   34   71:areturn         
		s1;
	//   35   72:astore_2        
		context = ((Context) (String.valueOf(((Object) (s)))));
	//   36   73:aload_1         
	//   37   74:invokestatic    #231 <Method String String.valueOf(Object)>
	//   38   77:astore_0        
		if(((String) (context)).length() != 0)
	//*  39   78:aload_0         
	//*  40   79:invokevirtual   #234 <Method int String.length()>
	//*  41   82:ifeq            95
			context = ((Context) ("Error retriving a response from: ".concat(((String) (context)))));
	//   42   85:ldc1            #236 <String "Error retriving a response from: ">
	//   43   87:aload_0         
	//   44   88:invokevirtual   #239 <Method String String.concat(String)>
	//   45   91:astore_0        
		else
	//*  46   92:goto            105
			context = ((Context) (new String("Error retriving a response from: ")));
	//   47   95:new             #103 <Class String>
	//   48   98:dup             
	//   49   99:ldc1            #236 <String "Error retriving a response from: ">
	//   50  101:invokespecial   #240 <Method void String(String)>
	//   51  104:astore_0        
		wx.b(((String) (context)), ((Throwable) (s1)));
	//   52  105:aload_0         
	//   53  106:aload_2         
	//   54  107:invokestatic    #242 <Method void wx.b(String, Throwable)>
		break MISSING_BLOCK_LABEL_208;
	//   55  110:goto            208
		Object obj;
		obj;
	//   56  113:astore_3        
		context = ((Context) (String.valueOf(((Object) (s)))));
	//   57  114:aload_1         
	//   58  115:invokestatic    #231 <Method String String.valueOf(Object)>
	//   59  118:astore_0        
		if(((String) (context)).length() != 0)
	//*  60  119:aload_0         
	//*  61  120:invokevirtual   #234 <Method int String.length()>
	//*  62  123:ifeq            136
			context = ((Context) ("Interrupted while retriving a response from: ".concat(((String) (context)))));
	//   63  126:ldc1            #244 <String "Interrupted while retriving a response from: ">
	//   64  128:aload_0         
	//   65  129:invokevirtual   #239 <Method String String.concat(String)>
	//   66  132:astore_0        
		else
	//*  67  133:goto            146
			context = ((Context) (new String("Interrupted while retriving a response from: ")));
	//   68  136:new             #103 <Class String>
	//   69  139:dup             
	//   70  140:ldc1            #244 <String "Interrupted while retriving a response from: ">
	//   71  142:invokespecial   #240 <Method void String(String)>
	//   72  145:astore_0        
		wx.b(((String) (context)), ((Throwable) (obj)));
	//   73  146:aload_0         
	//   74  147:aload_3         
	//   75  148:invokestatic    #242 <Method void wx.b(String, Throwable)>
		((abe) (s1)).cancel(true);
	//   76  151:aload_2         
	//   77  152:iconst_1        
	//   78  153:invokeinterface #248 <Method boolean abe.cancel(boolean)>
	//   79  158:pop             
		break MISSING_BLOCK_LABEL_208;
	//   80  159:goto            208
		obj;
	//   81  162:astore_3        
		context = ((Context) (String.valueOf(((Object) (s)))));
	//   82  163:aload_1         
	//   83  164:invokestatic    #231 <Method String String.valueOf(Object)>
	//   84  167:astore_0        
		if(((String) (context)).length() != 0)
	//*  85  168:aload_0         
	//*  86  169:invokevirtual   #234 <Method int String.length()>
	//*  87  172:ifeq            185
			context = ((Context) ("Timeout while retriving a response from: ".concat(((String) (context)))));
	//   88  175:ldc1            #250 <String "Timeout while retriving a response from: ">
	//   89  177:aload_0         
	//   90  178:invokevirtual   #239 <Method String String.concat(String)>
	//   91  181:astore_0        
		else
	//*  92  182:goto            195
			context = ((Context) (new String("Timeout while retriving a response from: ")));
	//   93  185:new             #103 <Class String>
	//   94  188:dup             
	//   95  189:ldc1            #250 <String "Timeout while retriving a response from: ">
	//   96  191:invokespecial   #240 <Method void String(String)>
	//   97  194:astore_0        
		wx.b(((String) (context)), ((Throwable) (obj)));
	//   98  195:aload_0         
	//   99  196:aload_3         
	//  100  197:invokestatic    #242 <Method void wx.b(String, Throwable)>
		((abe) (s1)).cancel(true);
	//  101  200:aload_2         
	//  102  201:iconst_1        
	//  103  202:invokeinterface #248 <Method boolean abe.cancel(boolean)>
	//  104  207:pop             
		return null;
	//  105  208:aconst_null     
	//  106  209:areturn         
	}

	private final void e(Context context, String s, String s1)
	{
		aw.e();
	//    0    0:invokestatic    #45  <Method xg aw.e()>
	//    1    3:pop             
		e e1 = p.ck;
	//    2    4:getstatic       #253 <Field e p.ck>
	//    3    7:astore          4
		xg.a(context, c(context, (String)bwk.e().a(e1), s, s1));
	//    4    9:aload_1         
	//    5   10:aload_0         
	//    6   11:aload_1         
	//    7   12:invokestatic    #96  <Method m bwk.e()>
	//    8   15:aload           4
	//    9   17:invokevirtual   #101 <Method Object m.a(e)>
	//   10   20:checkcast       #103 <Class String>
	//   11   23:aload_2         
	//   12   24:aload_3         
	//   13   25:invokespecial   #106 <Method Uri c(Context, String, String, String)>
	//   14   28:invokestatic    #256 <Method void xg.a(Context, Uri)>
	//   15   31:return          
	}

	public final String a()
	{
		String s;
		synchronized(a)
	//*   0    0:aload_0         
	//*   1    1:getfield        #22  <Field Object a>
	//*   2    4:astore_1        
	//*   3    5:aload_1         
	//*   4    6:monitorenter    
		{
			s = c;
	//    5    7:aload_0         
	//    6    8:getfield        #28  <Field String c>
	//    7   11:astore_2        
		}
	//    8   12:aload_1         
	//    9   13:monitorexit     
		return s;
	//   10   14:aload_2         
	//   11   15:areturn         
		exception;
	//   12   16:astore_2        
		obj;
	//   13   17:aload_1         
		JVM INSTR monitorexit ;
	//   14   18:monitorexit     
		throw exception;
	//   15   19:aload_2         
	//   16   20:athrow          
	}

	public final void a(Context context, String s, String s1)
	{
		if(!b(context, s, s1))
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:aload_2         
	//*   3    3:aload_3         
	//*   4    4:invokespecial   #258 <Method boolean b(Context, String, String)>
	//*   5    7:ifne            21
		{
			a(context, "In-app preview failed to load because of a system error. Please try again later.", true, true);
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:ldc2            #260 <String "In-app preview failed to load because of a system error. Please try again later.">
	//    9   15:iconst_1        
	//   10   16:iconst_1        
	//   11   17:invokespecial   #262 <Method void a(Context, String, boolean, boolean)>
			return;
	//   12   20:return          
		}
		if("2".equals(((Object) (e))))
	//*  13   21:ldc2            #264 <String "2">
	//*  14   24:aload_0         
	//*  15   25:getfield        #32  <Field String e>
	//*  16   28:invokevirtual   #177 <Method boolean String.equals(Object)>
	//*  17   31:ifeq            51
		{
			wx.b("Creative is not pushed for this device.");
	//   18   34:ldc2            #266 <String "Creative is not pushed for this device.">
	//   19   37:invokestatic    #118 <Method void wx.b(String)>
			a(context, "There was no creative pushed from DFP to the device.", false, false);
	//   20   40:aload_0         
	//   21   41:aload_1         
	//   22   42:ldc2            #268 <String "There was no creative pushed from DFP to the device.">
	//   23   45:iconst_0        
	//   24   46:iconst_0        
	//   25   47:invokespecial   #262 <Method void a(Context, String, boolean, boolean)>
			return;
	//   26   50:return          
		}
		if("1".equals(((Object) (e))))
	//*  27   51:ldc1            #173 <String "1">
	//*  28   53:aload_0         
	//*  29   54:getfield        #32  <Field String e>
	//*  30   57:invokevirtual   #177 <Method boolean String.equals(Object)>
	//*  31   60:ifeq            77
		{
			wx.b("The app is not linked for creative preview.");
	//   32   63:ldc2            #270 <String "The app is not linked for creative preview.">
	//   33   66:invokestatic    #118 <Method void wx.b(String)>
			e(context, s, s1);
	//   34   69:aload_0         
	//   35   70:aload_1         
	//   36   71:aload_2         
	//   37   72:aload_3         
	//   38   73:invokespecial   #272 <Method void e(Context, String, String)>
			return;
	//   39   76:return          
		}
		if("0".equals(((Object) (e))))
	//*  40   77:ldc2            #274 <String "0">
	//*  41   80:aload_0         
	//*  42   81:getfield        #32  <Field String e>
	//*  43   84:invokevirtual   #177 <Method boolean String.equals(Object)>
	//*  44   87:ifeq            106
		{
			wx.b("Device is linked for in app preview.");
	//   45   90:ldc2            #276 <String "Device is linked for in app preview.">
	//   46   93:invokestatic    #118 <Method void wx.b(String)>
			a(context, "The device is successfully linked for creative preview.", false, true);
	//   47   96:aload_0         
	//   48   97:aload_1         
	//   49   98:ldc2            #278 <String "The device is successfully linked for creative preview.">
	//   50  101:iconst_0        
	//   51  102:iconst_1        
	//   52  103:invokespecial   #262 <Method void a(Context, String, boolean, boolean)>
		}
	//   53  106:return          
	}

	public final void a(Context context, String s, String s1, String s2)
	{
		boolean flag = b();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #283 <Method boolean b()>
	//    2    4:istore          5
		if(c(context, s, s1))
	//*   3    6:aload_0         
	//*   4    7:aload_1         
	//*   5    8:aload_2         
	//*   6    9:aload_3         
	//*   7   10:invokespecial   #285 <Method boolean c(Context, String, String)>
	//*   8   13:ifeq            55
		{
			if(!flag && !TextUtils.isEmpty(((CharSequence) (s2))))
	//*   9   16:iload           5
	//*  10   18:ifne            38
	//*  11   21:aload           4
	//*  12   23:invokestatic    #40  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  13   26:ifne            38
				b(context, s1, s2, s);
	//   14   29:aload_0         
	//   15   30:aload_1         
	//   16   31:aload_3         
	//   17   32:aload           4
	//   18   34:aload_2         
	//   19   35:invokevirtual   #287 <Method void b(Context, String, String, String)>
			wx.b("Device is linked for debug signals.");
	//   20   38:ldc2            #289 <String "Device is linked for debug signals.">
	//   21   41:invokestatic    #118 <Method void wx.b(String)>
			a(context, "The device is successfully linked for troubleshooting.", false, true);
	//   22   44:aload_0         
	//   23   45:aload_1         
	//   24   46:ldc2            #291 <String "The device is successfully linked for troubleshooting.">
	//   25   49:iconst_0        
	//   26   50:iconst_1        
	//   27   51:invokespecial   #262 <Method void a(Context, String, boolean, boolean)>
			return;
	//   28   54:return          
		} else
		{
			e(context, s, s1);
	//   29   55:aload_0         
	//   30   56:aload_1         
	//   31   57:aload_2         
	//   32   58:aload_3         
	//   33   59:invokespecial   #272 <Method void e(Context, String, String)>
			return;
	//   34   62:return          
		}
	}

	public final void b(Context context, String s, String s1, String s2)
	{
		e e1 = p.cn;
	//    0    0:getstatic       #295 <Field e p.cn>
	//    1    3:astore          5
		s2 = ((String) (c(context, (String)bwk.e().a(e1), s2, s).buildUpon()));
	//    2    5:aload_0         
	//    3    6:aload_1         
	//    4    7:invokestatic    #96  <Method m bwk.e()>
	//    5   10:aload           5
	//    6   12:invokevirtual   #101 <Method Object m.a(e)>
	//    7   15:checkcast       #103 <Class String>
	//    8   18:aload           4
	//    9   20:aload_2         
	//   10   21:invokespecial   #106 <Method Uri c(Context, String, String, String)>
	//   11   24:invokevirtual   #146 <Method android.net.Uri$Builder Uri.buildUpon()>
	//   12   27:astore          4
		((android.net.Uri.Builder) (s2)).appendQueryParameter("debugData", s1);
	//   13   29:aload           4
	//   14   31:ldc2            #297 <String "debugData">
	//   15   34:aload_3         
	//   16   35:invokevirtual   #156 <Method android.net.Uri$Builder android.net.Uri$Builder.appendQueryParameter(String, String)>
	//   17   38:pop             
		aw.e();
	//   18   39:invokestatic    #45  <Method xg aw.e()>
	//   19   42:pop             
		xg.a(context, s, ((android.net.Uri.Builder) (s2)).build().toString());
	//   20   43:aload_1         
	//   21   44:aload_2         
	//   22   45:aload           4
	//   23   47:invokevirtual   #164 <Method Uri android.net.Uri$Builder.build()>
	//   24   50:invokevirtual   #111 <Method String Uri.toString()>
	//   25   53:invokestatic    #299 <Method void xg.a(Context, String, String)>
	//   26   56:return          
	}

	public final boolean b()
	{
		boolean flag;
		synchronized(a)
	//*   0    0:aload_0         
	//*   1    1:getfield        #22  <Field Object a>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
		{
			flag = d;
	//    5    7:aload_0         
	//    6    8:getfield        #30  <Field boolean d>
	//    7   11:istore_1        
		}
	//    8   12:aload_2         
	//    9   13:monitorexit     
		return flag;
	//   10   14:iload_1         
	//   11   15:ireturn         
		exception;
	//   12   16:astore_3        
		obj;
	//   13   17:aload_2         
		JVM INSTR monitorexit ;
	//   14   18:monitorexit     
		throw exception;
	//   15   19:aload_3         
	//   16   20:athrow          
	}

	private final Object a = new Object();
	private String b;
	private String c;
	private boolean d;
	private String e;
}
