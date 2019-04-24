// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.alipay.sdk.app.H5AuthActivity;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

// Referenced classes of package o:
//			ho, hj, gp, ft, 
//			hw, hd, fx, hr, 
//			hf, hb, he, fv, 
//			hs, hl, fj, gm

public class fm
{

	public fm(Activity activity)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
		e = activity;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #23  <Field Activity e>
		hj hj1 = hj.d();
	//    5    9:invokestatic    #29  <Method hj hj.d()>
	//    6   12:astore_2        
		Activity activity1 = e;
	//    7   13:aload_0         
	//    8   14:getfield        #23  <Field Activity e>
	//    9   17:astore_3        
		gp.e();
	//   10   18:invokestatic    #34  <Method gp gp.e()>
	//   11   21:pop             
		hj1.b(((Context) (activity1)));
	//   12   22:aload_2         
	//   13   23:aload_3         
	//   14   24:invokevirtual   #38  <Method void hj.b(Context)>
		ft.e(((Context) (activity)));
	//   15   27:aload_1         
	//   16   28:invokestatic    #42  <Method void ft.e(Context)>
		c = new hw(activity, "\u53BB\u652F\u4ED8\u5B9D\u6388\u6743");
	//   17   31:aload_0         
	//   18   32:new             #44  <Class hw>
	//   19   35:dup             
	//   20   36:aload_1         
	//   21   37:ldc1            #46  <String "\u53BB\u652F\u4ED8\u5B9D\u6388\u6743">
	//   22   39:invokespecial   #49  <Method void hw(Activity, String)>
	//   23   42:putfield        #51  <Field hw c>
	//   24   45:return          
	}

	private String a(hd hd1)
	{
		String as[] = hd1.a;
	//    0    0:aload_1         
	//    1    1:getfield        #59  <Field String[] hd.a>
	//    2    4:astore_2        
		hd1 = ((hd) (new Bundle()));
	//    3    5:new             #61  <Class Bundle>
	//    4    8:dup             
	//    5    9:invokespecial   #62  <Method void Bundle()>
	//    6   12:astore_1        
		((Bundle) (hd1)).putString("url", as[0]);
	//    7   13:aload_1         
	//    8   14:ldc1            #64  <String "url">
	//    9   16:aload_2         
	//   10   17:iconst_0        
	//   11   18:aaload          
	//   12   19:invokevirtual   #68  <Method void Bundle.putString(String, String)>
		Intent intent = new Intent(((Context) (e)), com/alipay/sdk/app/H5AuthActivity);
	//   13   22:new             #70  <Class Intent>
	//   14   25:dup             
	//   15   26:aload_0         
	//   16   27:getfield        #23  <Field Activity e>
	//   17   30:ldc1            #72  <Class H5AuthActivity>
	//   18   32:invokespecial   #75  <Method void Intent(Context, Class)>
	//   19   35:astore_2        
		intent.putExtras(((Bundle) (hd1)));
	//   20   36:aload_2         
	//   21   37:aload_1         
	//   22   38:invokevirtual   #79  <Method Intent Intent.putExtras(Bundle)>
	//   23   41:pop             
		e.startActivity(intent);
	//   24   42:aload_0         
	//   25   43:getfield        #23  <Field Activity e>
	//   26   46:aload_2         
	//   27   47:invokevirtual   #85  <Method void Activity.startActivity(Intent)>
		hd1 = ((hd) (a));
	//   28   50:getstatic       #16  <Field Object a>
	//   29   53:astore_1        
		hd1;
	//   30   54:aload_1         
		JVM INSTR monitorenter ;
	//   31   55:monitorenter    
		a.wait();
	//   32   56:getstatic       #16  <Field Object a>
	//   33   59:invokevirtual   #88  <Method void Object.wait()>
		  goto _L1
	//*  34   62:goto            73
_L4:
		String s = fx.e();
	//   35   65:invokestatic    #93  <Method String fx.e()>
	//   36   68:astore_2        
		hd1;
	//   37   69:aload_1         
		JVM INSTR monitorexit ;
	//   38   70:monitorexit     
		return s;
	//   39   71:aload_2         
	//   40   72:areturn         
_L1:
		hd1;
	//   41   73:aload_1         
		JVM INSTR monitorexit ;
	//   42   74:monitorexit     
		  goto _L2
	//*  43   75:goto            83
		Object obj;
		obj;
	//   44   78:astore_2        
	//*  45   79:aload_1         
		throw obj;
	//   46   80:monitorexit     
	//   47   81:aload_2         
	//   48   82:athrow          
_L2:
		String s1 = fx.d;
	//   49   83:getstatic       #96  <Field String fx.d>
	//   50   86:astore_2        
		hd1 = ((hd) (s1));
	//   51   87:aload_2         
	//   52   88:astore_1        
		if(TextUtils.isEmpty(((CharSequence) (s1))))
	//*  53   89:aload_2         
	//*  54   90:invokestatic    #102 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  55   93:ifeq            100
			hd1 = ((hd) (fx.e()));
	//   56   96:invokestatic    #93  <Method String fx.e()>
	//   57   99:astore_1        
		return ((String) (hd1));
	//   58  100:aload_1         
	//   59  101:areturn         
		s1;
	//   60  102:astore_2        
		if(true) goto _L4; else goto _L3
_L3:
	//*  61  103:goto            65
	}

	private static boolean a(Context context)
	{
		int i;
		try
		{
			context = ((Context) (context.getPackageManager().getPackageInfo(hr.c(), 128)));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #111 <Method PackageManager Context.getPackageManager()>
	//    2    4:invokestatic    #115 <Method String hr.c()>
	//    3    7:sipush          128
	//    4   10:invokevirtual   #121 <Method PackageInfo PackageManager.getPackageInfo(String, int)>
	//    5   13:astore_0        
		}
	//*   6   14:aload_0         
	//*   7   15:ifnonnull       20
	//*   8   18:iconst_0        
	//*   9   19:ireturn         
	//*  10   20:aload_0         
	//*  11   21:getfield        #127 <Field int PackageInfo.versionCode>
	//*  12   24:istore_1        
	//*  13   25:iload_1         
	//*  14   26:bipush          73
	//*  15   28:icmpge          33
	//*  16   31:iconst_0        
	//*  17   32:ireturn         
	//*  18   33:goto            38
	//*  19   36:iconst_0        
	//*  20   37:ireturn         
	//*  21   38:iconst_1        
	//*  22   39:ireturn         
		// Misplaced declaration of an exception variable
		catch(Context context)
		{
			return false;
		}
		if(context == null)
			return false;
		i = ((PackageInfo) (context)).versionCode;
		return i >= 73;
	//*  23   40:astore_0        
	//*  24   41:goto            36
	}

	private void b()
	{
		if(c != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #51  <Field hw c>
	//*   2    4:ifnull          14
			c.b();
	//    3    7:aload_0         
	//    4    8:getfield        #51  <Field hw c>
	//    5   11:invokevirtual   #129 <Method void hw.b()>
	//    6   14:return          
	}

	static void d(fm fm1)
	{
		fm1.b();
	//    0    0:aload_0         
	//    1    1:invokespecial   #131 <Method void b()>
	//    2    4:return          
	}

	private String e(Activity activity, String s)
	{
		Object obj;
		e();
	//    0    0:aload_0         
	//    1    1:invokespecial   #138 <Method void e()>
		obj = null;
	//    2    4:aconst_null     
	//    3    5:astore          4
		activity = ((Activity) (hd.e((new hf()).c(((Context) (activity)), s).e().optJSONObject("form").optJSONObject("onload"))));
	//    4    7:new             #140 <Class hf>
	//    5   10:dup             
	//    6   11:invokespecial   #141 <Method void hf()>
	//    7   14:aload_1         
	//    8   15:aload_2         
	//    9   16:invokevirtual   #144 <Method hb hf.c(Context, String)>
	//   10   19:invokevirtual   #149 <Method JSONObject hb.e()>
	//   11   22:ldc1            #151 <String "form">
	//   12   24:invokevirtual   #157 <Method JSONObject JSONObject.optJSONObject(String)>
	//   13   27:ldc1            #159 <String "onload">
	//   14   29:invokevirtual   #157 <Method JSONObject JSONObject.optJSONObject(String)>
	//   15   32:invokestatic    #162 <Method List hd.e(JSONObject)>
	//   16   35:astore_1        
		b();
	//   17   36:aload_0         
	//   18   37:invokespecial   #131 <Method void b()>
		int i = 0;
	//   19   40:iconst_0        
	//   20   41:istore_3        
_L2:
		if(i >= ((List) (activity)).size())
			break; /* Loop/switch isn't completed */
	//   21   42:iload_3         
	//   22   43:aload_1         
	//   23   44:invokeinterface #168 <Method int List.size()>
	//   24   49:icmpge          99
		if(((hd)((List) (activity)).get(i)).b != he.d)
			break MISSING_BLOCK_LABEL_92;
	//   25   52:aload_1         
	//   26   53:iload_3         
	//   27   54:invokeinterface #172 <Method Object List.get(int)>
	//   28   59:checkcast       #56  <Class hd>
	//   29   62:getfield        #175 <Field he hd.b>
	//   30   65:getstatic       #179 <Field he he.d>
	//   31   68:if_acmpne       92
		activity = ((Activity) (a((hd)((List) (activity)).get(i))));
	//   32   71:aload_0         
	//   33   72:aload_1         
	//   34   73:iload_3         
	//   35   74:invokeinterface #172 <Method Object List.get(int)>
	//   36   79:checkcast       #56  <Class hd>
	//   37   82:invokespecial   #181 <Method String a(hd)>
	//   38   85:astore_1        
		b();
	//   39   86:aload_0         
	//   40   87:invokespecial   #131 <Method void b()>
		return ((String) (activity));
	//   41   90:aload_1         
	//   42   91:areturn         
		i++;
	//   43   92:iload_3         
	//   44   93:iconst_1        
	//   45   94:iadd            
	//   46   95:istore_3        
		if(true) goto _L2; else goto _L1
	//   47   96:goto            42
_L1:
		b();
	//   48   99:aload_0         
	//   49  100:invokespecial   #131 <Method void b()>
		activity = ((Activity) (obj));
	//   50  103:aload           4
	//   51  105:astore_1        
		break MISSING_BLOCK_LABEL_159;
	//   52  106:goto            159
		s;
	//   53  109:astore_2        
		activity = ((Activity) (fv.b(fv.b.i)));
	//   54  110:getstatic       #186 <Field fv fv.b>
	//   55  113:getfield        #189 <Field int fv.i>
	//   56  116:invokestatic    #192 <Method fv fv.b(int)>
	//   57  119:astore_1        
		ft.c("net", ((Throwable) (s)));
	//   58  120:ldc1            #194 <String "net">
	//   59  122:aload_2         
	//   60  123:invokestatic    #197 <Method void ft.c(String, Throwable)>
		b();
	//   61  126:aload_0         
	//   62  127:invokespecial   #131 <Method void b()>
		break MISSING_BLOCK_LABEL_159;
	//   63  130:goto            159
		activity;
	//   64  133:astore_1        
		ft.e("biz", "H5AuthDataAnalysisError", ((Throwable) (activity)));
	//   65  134:ldc1            #199 <String "biz">
	//   66  136:ldc1            #201 <String "H5AuthDataAnalysisError">
	//   67  138:aload_1         
	//   68  139:invokestatic    #204 <Method void ft.e(String, String, Throwable)>
		b();
	//   69  142:aload_0         
	//   70  143:invokespecial   #131 <Method void b()>
		activity = ((Activity) (obj));
	//   71  146:aload           4
	//   72  148:astore_1        
		break MISSING_BLOCK_LABEL_159;
	//   73  149:goto            159
		activity;
	//   74  152:astore_1        
		b();
	//   75  153:aload_0         
	//   76  154:invokespecial   #131 <Method void b()>
		throw activity;
	//   77  157:aload_1         
	//   78  158:athrow          
		s = ((String) (activity));
	//   79  159:aload_1         
	//   80  160:astore_2        
		if(activity == null)
	//*  81  161:aload_1         
	//*  82  162:ifnonnull       175
			s = ((String) (fv.b(fv.c.i)));
	//   83  165:getstatic       #206 <Field fv fv.c>
	//   84  168:getfield        #189 <Field int fv.i>
	//   85  171:invokestatic    #192 <Method fv fv.b(int)>
	//   86  174:astore_2        
		return fx.d(((fv) (s)).i, ((fv) (s)).k, "");
	//   87  175:aload_2         
	//   88  176:getfield        #189 <Field int fv.i>
	//   89  179:aload_2         
	//   90  180:getfield        #209 <Field String fv.k>
	//   91  183:ldc1            #211 <String "">
	//   92  185:invokestatic    #214 <Method String fx.d(int, String, String)>
	//   93  188:areturn         
	}

	private void e()
	{
		if(c != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #51  <Field hw c>
	//*   2    4:ifnull          14
			c.c();
	//    3    7:aload_0         
	//    4    8:getfield        #51  <Field hw c>
	//    5   11:invokevirtual   #216 <Method void hw.c()>
	//    6   14:return          
	}

	public Map a(String s, boolean flag)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		s = ((String) (hs.c(d(s, flag))));
	//    2    2:aload_0         
	//    3    3:aload_1         
	//    4    4:iload_2         
	//    5    5:invokevirtual   #220 <Method String d(String, boolean)>
	//    6    8:invokestatic    #225 <Method Map hs.c(String)>
	//    7   11:astore_1        
		this;
	//    8   12:aload_0         
		JVM INSTR monitorexit ;
	//    9   13:monitorexit     
		return ((Map) (s));
	//   10   14:aload_1         
	//   11   15:areturn         
		s;
	//   12   16:astore_1        
	//*  13   17:aload_0         
		throw s;
	//   14   18:monitorexit     
	//   15   19:aload_1         
	//   16   20:athrow          
	}

	public String d(String s, boolean flag)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(!flag)
			break MISSING_BLOCK_LABEL_10;
	//    2    2:iload_2         
	//    3    3:ifeq            10
		e();
	//    4    6:aload_0         
	//    5    7:invokespecial   #138 <Method void e()>
		Object obj;
		obj = ((Object) (hj.d()));
	//    6   10:invokestatic    #29  <Method hj hj.d()>
	//    7   13:astore_3        
		Activity activity = e;
	//    8   14:aload_0         
	//    9   15:getfield        #23  <Field Activity e>
	//   10   18:astore          4
		gp.e();
	//   11   20:invokestatic    #34  <Method gp gp.e()>
	//   12   23:pop             
		((hj) (obj)).b(((Context) (activity)));
	//   13   24:aload_3         
	//   14   25:aload           4
	//   15   27:invokevirtual   #38  <Method void hj.b(Context)>
		obj = ((Object) (fx.e()));
	//   16   30:invokestatic    #93  <Method String fx.e()>
	//   17   33:astore_3        
		Activity activity1;
		String s1;
		activity1 = e;
	//   18   34:aload_0         
	//   19   35:getfield        #23  <Field Activity e>
	//   20   38:astore          5
		s1 = (new hl(((Context) (e)))).b(s);
	//   21   40:new             #231 <Class hl>
	//   22   43:dup             
	//   23   44:aload_0         
	//   24   45:getfield        #23  <Field Activity e>
	//   25   48:invokespecial   #233 <Method void hl(Context)>
	//   26   51:aload_1         
	//   27   52:invokevirtual   #236 <Method String hl.b(String)>
	//   28   55:astore          6
		if(!a(((Context) (activity1)))) goto _L2; else goto _L1
	//   29   57:aload           5
	//   30   59:invokestatic    #238 <Method boolean a(Context)>
	//   31   62:ifeq            118
_L1:
		Object obj1 = ((Object) ((new ho(activity1, ((ho.d) (new fj(this))))).a(s1)));
	//   32   65:new             #14  <Class ho>
	//   33   68:dup             
	//   34   69:aload           5
	//   35   71:new             #240 <Class fj>
	//   36   74:dup             
	//   37   75:aload_0         
	//   38   76:invokespecial   #242 <Method void fj(fm)>
	//   39   79:invokespecial   #245 <Method void ho(Activity, ho$d)>
	//   40   82:aload           6
	//   41   84:invokevirtual   #247 <Method String ho.a(String)>
	//   42   87:astore          4
		if(TextUtils.equals(((CharSequence) (obj1)), "failed")) goto _L2; else goto _L3
	//   43   89:aload           4
	//   44   91:ldc1            #249 <String "failed">
	//   45   93:invokestatic    #253 <Method boolean TextUtils.equals(CharSequence, CharSequence)>
	//   46   96:ifne            118
_L3:
		if(!TextUtils.isEmpty(((CharSequence) (obj1)))) goto _L5; else goto _L4
	//   47   99:aload           4
	//   48  101:invokestatic    #102 <Method boolean TextUtils.isEmpty(CharSequence)>
	//   49  104:ifeq            220
_L4:
		obj1 = ((Object) (fx.e()));
	//   50  107:invokestatic    #93  <Method String fx.e()>
	//   51  110:astore          4
		obj = obj1;
	//   52  112:aload           4
	//   53  114:astore_3        
		  goto _L6
	//*  54  115:goto            131
_L2:
		obj1 = ((Object) (e(activity1, s1)));
	//   55  118:aload_0         
	//   56  119:aload           5
	//   57  121:aload           6
	//   58  123:invokespecial   #255 <Method String e(Activity, String)>
	//   59  126:astore          4
		obj = obj1;
	//   60  128:aload           4
	//   61  130:astore_3        
_L6:
		gm.e().e(((Context) (e)));
	//   62  131:invokestatic    #260 <Method gm gm.e()>
	//   63  134:aload_0         
	//   64  135:getfield        #23  <Field Activity e>
	//   65  138:invokevirtual   #261 <Method void gm.e(Context)>
		b();
	//   66  141:aload_0         
	//   67  142:invokespecial   #131 <Method void b()>
		ft.d(((Context) (e)), s);
	//   68  145:aload_0         
	//   69  146:getfield        #23  <Field Activity e>
	//   70  149:aload_1         
	//   71  150:invokestatic    #264 <Method void ft.d(Context, String)>
		  goto _L7
	//*  72  153:goto            206
_L8:
		gm.e().e(((Context) (e)));
	//   73  156:invokestatic    #260 <Method gm gm.e()>
	//   74  159:aload_0         
	//   75  160:getfield        #23  <Field Activity e>
	//   76  163:invokevirtual   #261 <Method void gm.e(Context)>
		b();
	//   77  166:aload_0         
	//   78  167:invokespecial   #131 <Method void b()>
		ft.d(((Context) (e)), s);
	//   79  170:aload_0         
	//   80  171:getfield        #23  <Field Activity e>
	//   81  174:aload_1         
	//   82  175:invokestatic    #264 <Method void ft.d(Context, String)>
		  goto _L7
	//*  83  178:goto            206
		obj;
	//   84  181:astore_3        
		gm.e().e(((Context) (e)));
	//   85  182:invokestatic    #260 <Method gm gm.e()>
	//   86  185:aload_0         
	//   87  186:getfield        #23  <Field Activity e>
	//   88  189:invokevirtual   #261 <Method void gm.e(Context)>
		b();
	//   89  192:aload_0         
	//   90  193:invokespecial   #131 <Method void b()>
		ft.d(((Context) (e)), s);
	//   91  196:aload_0         
	//   92  197:getfield        #23  <Field Activity e>
	//   93  200:aload_1         
	//   94  201:invokestatic    #264 <Method void ft.d(Context, String)>
		throw obj;
	//   95  204:aload_3         
	//   96  205:athrow          
_L7:
		this;
	//   97  206:aload_0         
		JVM INSTR monitorexit ;
	//   98  207:monitorexit     
		return ((String) (obj));
	//   99  208:aload_3         
	//  100  209:areturn         
		s;
	//  101  210:astore_1        
	//* 102  211:aload_0         
		throw s;
	//  103  212:monitorexit     
	//  104  213:aload_1         
	//  105  214:athrow          
		obj1;
	//  106  215:astore          4
		if(true) goto _L8; else goto _L5
	//  107  217:goto            156
_L5:
		obj = obj1;
	//  108  220:aload           4
	//  109  222:astore_3        
		if(true) goto _L6; else goto _L9
	//  110  223:goto            131
_L9:
	}

	public static final Object a = o/ho;
	private hw c;
	private Activity e;

	static 
	{
	//    0    0:ldc1            #14  <Class ho>
	//    1    2:putstatic       #16  <Field Object a>
	//*   2    5:return          
	}
}
