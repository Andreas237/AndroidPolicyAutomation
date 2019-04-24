// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.login.ui.login.LoginInit;
import java.util.Locale;

// Referenced classes of package o:
//			dbf, zs, yx, czu, 
//			czh, dho, yv, cza

public class cze
{

	private cze()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #44  <Method void Object()>
	//    2    4:return          
	}

	cze(_cls5 _pcls5)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #46  <Method void cze()>
	//    2    4:return          
	}

	public static cze c(Context context)
	{
		if(context != null)
	//*   0    0:aload_0         
	//*   1    1:ifnull          11
			b = context.getApplicationContext();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #53  <Method Context Context.getApplicationContext()>
	//    4    8:putstatic       #55  <Field Context b>
	/* block-local class not found */
	class e {}

		return e.d;
	//    5   11:getstatic       #58  <Field cze cze$e.d>
	//    6   14:areturn         
	}

	private void e(String s)
	{
		zs zs1 = new zs();
	//    0    0:new             #62  <Class zs>
	//    1    3:dup             
	//    2    4:invokespecial   #63  <Method void zs()>
	//    3    7:astore_2        
		zs1.c(LoginInit.getInstance(b).getCountryCode(((dcx) (null))));
	//    4    8:aload_2         
	//    5    9:getstatic       #55  <Field Context b>
	//    6   12:invokestatic    #69  <Method LoginInit LoginInit.getInstance(Context)>
	//    7   15:aconst_null     
	//    8   16:invokevirtual   #73  <Method String LoginInit.getCountryCode(dcx)>
	//    9   19:invokevirtual   #75  <Method void zs.c(String)>
		zs1.b(s);
	//   10   22:aload_2         
	//   11   23:aload_1         
	//   12   24:invokevirtual   #77  <Method void zs.b(String)>
		zs1.d(android.os.Build.VERSION.RELEASE);
	//   13   27:aload_2         
	//   14   28:getstatic       #82  <Field String android.os.Build$VERSION.RELEASE>
	//   15   31:invokevirtual   #84  <Method void zs.d(String)>
		yx.b(b, zs1);
	//   16   34:getstatic       #55  <Field Context b>
	//   17   37:aload_2         
	//   18   38:invokestatic    #89  <Method void yx.b(Context, zs)>
	//   19   41:return          
	}

	public String a(String s)
	{
		if(!czu.i() || !LoginInit.getInstance(b).getIsLogined())
	//*   0    0:invokestatic    #94  <Method boolean czu.i()>
	//*   1    3:ifeq            18
	//*   2    6:getstatic       #55  <Field Context b>
	//*   3    9:invokestatic    #69  <Method LoginInit LoginInit.getInstance(Context)>
	//*   4   12:invokevirtual   #97  <Method boolean LoginInit.getIsLogined()>
	//*   5   15:ifne            21
			return "not allow login";
	//    6   18:ldc1            #99  <String "not allow login">
	//    7   20:areturn         
		e(d);
	//    8   21:aload_0         
	//    9   22:getstatic       #42  <Field String d>
	//   10   25:invokespecial   #101 <Method void e(String)>
		String s1 = yx.a((new StringBuilder()).append(czh.c(s)).append(c).toString(), s);
	//   11   28:new             #27  <Class StringBuilder>
	//   12   31:dup             
	//   13   32:invokespecial   #30  <Method void StringBuilder()>
	//   14   35:aload_1         
	//   15   36:invokestatic    #105 <Method String czh.c(String)>
	//   16   39:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
	//   17   42:getstatic       #25  <Field String c>
	//   18   45:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
	//   19   48:invokevirtual   #40  <Method String StringBuilder.toString()>
	//   20   51:aload_1         
	//   21   52:invokestatic    #108 <Method String yx.a(String, String)>
	//   22   55:astore_2        
		if(TextUtils.isEmpty(((CharSequence) (s1))))
	//*  23   56:aload_2         
	//*  24   57:invokestatic    #114 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  25   60:ifeq            81
			dho.f("GRSManager", new Object[] {
				"getUrl error, key is ", s
			});
	//   26   63:ldc1            #116 <String "GRSManager">
	//   27   65:iconst_2        
	//   28   66:anewarray       Object[]
	//   29   69:dup             
	//   30   70:iconst_0        
	//   31   71:ldc1            #118 <String "getUrl error, key is ">
	//   32   73:aastore         
	//   33   74:dup             
	//   34   75:iconst_1        
	//   35   76:aload_1         
	//   36   77:aastore         
	//   37   78:invokestatic    #124 <Method void dho.f(String, Object[])>
		return s1;
	//   38   81:aload_2         
	//   39   82:areturn         
	}

	public String b(String s, String s1)
	{
		String s2 = s1;
	//    0    0:aload_2         
	//    1    1:astore_3        
		if(TextUtils.isEmpty(((CharSequence) (s1))))
	//*   2    2:aload_2         
	//*   3    3:invokestatic    #114 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   4    6:ifeq            14
			s2 = e();
	//    5    9:aload_0         
	//    6   10:invokevirtual   #126 <Method String e()>
	//    7   13:astore_3        
		dho.b("GRSManager", new Object[] {
			"getNoCheckUrl, key=", s, ", countryCode=", s2
		});
	//    8   14:ldc1            #116 <String "GRSManager">
	//    9   16:iconst_4        
	//   10   17:anewarray       Object[]
	//   11   20:dup             
	//   12   21:iconst_0        
	//   13   22:ldc1            #128 <String "getNoCheckUrl, key=">
	//   14   24:aastore         
	//   15   25:dup             
	//   16   26:iconst_1        
	//   17   27:aload_1         
	//   18   28:aastore         
	//   19   29:dup             
	//   20   30:iconst_2        
	//   21   31:ldc1            #130 <String ", countryCode=">
	//   22   33:aastore         
	//   23   34:dup             
	//   24   35:iconst_3        
	//   25   36:aload_3         
	//   26   37:aastore         
	//   27   38:invokestatic    #132 <Method void dho.b(String, Object[])>
		s1 = ((String) (new zs()));
	//   28   41:new             #62  <Class zs>
	//   29   44:dup             
	//   30   45:invokespecial   #63  <Method void zs()>
	//   31   48:astore_2        
		((zs) (s1)).c(s2);
	//   32   49:aload_2         
	//   33   50:aload_3         
	//   34   51:invokevirtual   #75  <Method void zs.c(String)>
		((zs) (s1)).b(d);
	//   35   54:aload_2         
	//   36   55:getstatic       #42  <Field String d>
	//   37   58:invokevirtual   #77  <Method void zs.b(String)>
		((zs) (s1)).d(android.os.Build.VERSION.RELEASE);
	//   38   61:aload_2         
	//   39   62:getstatic       #82  <Field String android.os.Build$VERSION.RELEASE>
	//   40   65:invokevirtual   #84  <Method void zs.d(String)>
		return (new yv(b, ((zs) (s1)))).a((new StringBuilder()).append(czh.c(s)).append(c).toString(), s);
	//   41   68:new             #134 <Class yv>
	//   42   71:dup             
	//   43   72:getstatic       #55  <Field Context b>
	//   44   75:aload_2         
	//   45   76:invokespecial   #136 <Method void yv(Context, zs)>
	//   46   79:new             #27  <Class StringBuilder>
	//   47   82:dup             
	//   48   83:invokespecial   #30  <Method void StringBuilder()>
	//   49   86:aload_1         
	//   50   87:invokestatic    #105 <Method String czh.c(String)>
	//   51   90:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
	//   52   93:getstatic       #25  <Field String c>
	//   53   96:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
	//   54   99:invokevirtual   #40  <Method String StringBuilder.toString()>
	//   55  102:aload_1         
	//   56  103:invokevirtual   #137 <Method String yv.a(String, String)>
	//   57  106:areturn         
	}

	public void d(String s, cza cza1)
	{
		if(!czu.i() || !LoginInit.getInstance(b).getIsLogined())
	//*   0    0:invokestatic    #94  <Method boolean czu.i()>
	//*   1    3:ifeq            18
	//*   2    6:getstatic       #55  <Field Context b>
	//*   3    9:invokestatic    #69  <Method LoginInit LoginInit.getInstance(Context)>
	//*   4   12:invokevirtual   #97  <Method boolean LoginInit.getIsLogined()>
	//*   5   15:ifne            31
		{
			if(cza1 != null)
	//*   6   18:aload_2         
	//*   7   19:ifnull          30
				cza1.onCallBackSuccess("not allow login");
	//    8   22:aload_2         
	//    9   23:ldc1            #99  <String "not allow login">
	//   10   25:invokeinterface #143 <Method void cza.onCallBackSuccess(String)>
			return;
	//   11   30:return          
		} else
		{
			e(d);
	//   12   31:aload_0         
	//   13   32:getstatic       #42  <Field String d>
	//   14   35:invokespecial   #101 <Method void e(String)>
			yx.c((new StringBuilder()).append(czh.c(s)).append(c).toString(), s, ((zk) (new _cls5(s, cza1))));
	//   15   38:new             #27  <Class StringBuilder>
	//   16   41:dup             
	//   17   42:invokespecial   #30  <Method void StringBuilder()>
	//   18   45:aload_1         
	//   19   46:invokestatic    #105 <Method String czh.c(String)>
	//   20   49:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
	//   21   52:getstatic       #25  <Field String c>
	//   22   55:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
	//   23   58:invokevirtual   #40  <Method String StringBuilder.toString()>
	//   24   61:aload_1         
	//   25   62:new             #145 <Class cze$5>
	//   26   65:dup             
	//   27   66:aload_0         
	//   28   67:aload_1         
	//   29   68:aload_2         
	//   30   69:invokespecial   #148 <Method void cze$5(cze, String, cza)>
	//   31   72:invokestatic    #151 <Method void yx.c(String, String, zk)>
			return;
	//   32   75:return          
		}
	}

	public String e()
	{
		String s1 = null;
	//    0    0:aconst_null     
	//    1    1:astore_2        
		if(czu.i())
	//*   2    2:invokestatic    #94  <Method boolean czu.i()>
	//*   3    5:ifeq            19
			s1 = LoginInit.getInstance(b).getCountryCode(((dcx) (null)));
	//    4    8:getstatic       #55  <Field Context b>
	//    5   11:invokestatic    #69  <Method LoginInit LoginInit.getInstance(Context)>
	//    6   14:aconst_null     
	//    7   15:invokevirtual   #73  <Method String LoginInit.getCountryCode(dcx)>
	//    8   18:astore_2        
		String s = s1;
	//    9   19:aload_2         
	//   10   20:astore_1        
		if(TextUtils.isEmpty(((CharSequence) (s1))))
	//*  11   21:aload_2         
	//*  12   22:invokestatic    #114 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  13   25:ifeq            51
		{
			String s2 = dbf.E(b);
	//   14   28:getstatic       #55  <Field Context b>
	//   15   31:invokestatic    #155 <Method String dbf.E(Context)>
	//   16   34:astore_2        
			s = s2;
	//   17   35:aload_2         
	//   18   36:astore_1        
			if(TextUtils.isEmpty(((CharSequence) (s2))))
	//*  19   37:aload_2         
	//*  20   38:invokestatic    #114 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  21   41:ifeq            51
				s = Locale.getDefault().getCountry();
	//   22   44:invokestatic    #161 <Method Locale Locale.getDefault()>
	//   23   47:invokevirtual   #164 <Method String Locale.getCountry()>
	//   24   50:astore_1        
		}
		return s;
	//   25   51:aload_1         
	//   26   52:areturn         
	}

	private static Context b;
	private static final String c;
	public static final String d;

	static 
	{
		String s;
		if(dbf.i())
	//*   0    0:invokestatic    #19  <Method boolean dbf.i()>
	//*   1    3:ifeq            12
			s = "test";
	//    2    6:ldc1            #21  <String "test">
	//    3    8:astore_0        
		else
	//*   4    9:goto            15
			s = "";
	//    5   12:ldc1            #23  <String "">
	//    6   14:astore_0        
		c = s;
	//    7   15:aload_0         
	//    8   16:putstatic       #25  <Field String c>
		d = (new StringBuilder()).append("healthcloud").append(c).toString();
	//    9   19:new             #27  <Class StringBuilder>
	//   10   22:dup             
	//   11   23:invokespecial   #30  <Method void StringBuilder()>
	//   12   26:ldc1            #32  <String "healthcloud">
	//   13   28:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
	//   14   31:getstatic       #25  <Field String c>
	//   15   34:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
	//   16   37:invokevirtual   #40  <Method String StringBuilder.toString()>
	//   17   40:putstatic       #42  <Field String d>
	//*  18   43:return          
	}

	/* member class not found */
	class _cls5 {}

}
