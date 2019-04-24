// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import android.content.*;
import android.content.res.Configuration;
import android.os.LocaleList;
import com.huawei.hwcommonmodel.application.BaseApplication;
import java.util.*;

// Referenced classes of package o:
//			ebl, ebf, dho, ebd, 
//			ebi, dac, ebh, eap, 
//			ebe

public final class ebm
	implements ComponentCallbacks
{

	private ebm()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #29  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #31  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #32  <Method void ArrayList()>
	//    6   12:putfield        #34  <Field ArrayList f>
		c = Locale.getDefault();
	//    7   15:aload_0         
	//    8   16:invokestatic    #40  <Method Locale Locale.getDefault()>
	//    9   19:putfield        #42  <Field Locale c>
		e = 1;
	//   10   22:aload_0         
	//   11   23:iconst_1        
	//   12   24:putfield        #44  <Field int e>
		b = ebl.c(c);
	//   13   27:aload_0         
	//   14   28:aload_0         
	//   15   29:getfield        #42  <Field Locale c>
	//   16   32:invokestatic    #49  <Method boolean ebl.c(Locale)>
	//   17   35:putfield        #51  <Field boolean b>
		g = false;
	//   18   38:aload_0         
	//   19   39:iconst_0        
	//   20   40:putfield        #53  <Field boolean g>
		h = ((ebe) (new ebf(eap.e.a)));
	//   21   43:aload_0         
	//   22   44:new             #55  <Class ebf>
	//   23   47:dup             
	//   24   48:getstatic       #60  <Field eap$e eap$e.a>
	//   25   51:invokespecial   #63  <Method void ebf(eap$e)>
	//   26   54:putfield        #65  <Field ebe h>
		dho.b("Login_LanguageMgr", new Object[] {
			"locale reinit, isPreset=", Boolean.valueOf(c()), ", locale=", c.toString(), ", language=", ebl.a(c), ", display=", c.getDisplayLanguage(), ", sdkVersion=", Integer.valueOf(android.os.Build.VERSION.SDK_INT)
		});
	//   27   57:ldc1            #67  <String "Login_LanguageMgr">
	//   28   59:bipush          10
	//   29   61:anewarray       Object[]
	//   30   64:dup             
	//   31   65:iconst_0        
	//   32   66:ldc1            #69  <String "locale reinit, isPreset=">
	//   33   68:aastore         
	//   34   69:dup             
	//   35   70:iconst_1        
	//   36   71:aload_0         
	//   37   72:invokevirtual   #72  <Method boolean c()>
	//   38   75:invokestatic    #78  <Method Boolean Boolean.valueOf(boolean)>
	//   39   78:aastore         
	//   40   79:dup             
	//   41   80:iconst_2        
	//   42   81:ldc1            #80  <String ", locale=">
	//   43   83:aastore         
	//   44   84:dup             
	//   45   85:iconst_3        
	//   46   86:aload_0         
	//   47   87:getfield        #42  <Field Locale c>
	//   48   90:invokevirtual   #84  <Method String Locale.toString()>
	//   49   93:aastore         
	//   50   94:dup             
	//   51   95:iconst_4        
	//   52   96:ldc1            #86  <String ", language=">
	//   53   98:aastore         
	//   54   99:dup             
	//   55  100:iconst_5        
	//   56  101:aload_0         
	//   57  102:getfield        #42  <Field Locale c>
	//   58  105:invokestatic    #89  <Method String ebl.a(Locale)>
	//   59  108:aastore         
	//   60  109:dup             
	//   61  110:bipush          6
	//   62  112:ldc1            #91  <String ", display=">
	//   63  114:aastore         
	//   64  115:dup             
	//   65  116:bipush          7
	//   66  118:aload_0         
	//   67  119:getfield        #42  <Field Locale c>
	//   68  122:invokevirtual   #94  <Method String Locale.getDisplayLanguage()>
	//   69  125:aastore         
	//   70  126:dup             
	//   71  127:bipush          8
	//   72  129:ldc1            #96  <String ", sdkVersion=">
	//   73  131:aastore         
	//   74  132:dup             
	//   75  133:bipush          9
	//   76  135:getstatic       #101 <Field int android.os.Build$VERSION.SDK_INT>
	//   77  138:invokestatic    #106 <Method Integer Integer.valueOf(int)>
	//   78  141:aastore         
	//   79  142:invokestatic    #111 <Method void dho.b(String, Object[])>
		f();
	//   80  145:aload_0         
	//   81  146:invokespecial   #113 <Method void f()>
	//   82  149:return          
	}

	public static ebm a()
	{
		if(a != null)
			break MISSING_BLOCK_LABEL_37;
	//    0    0:getstatic       #117 <Field ebm a>
	//    1    3:ifnonnull       37
		o/ebm;
	//    2    6:ldc1            #2   <Class ebm>
		JVM INSTR monitorenter ;
	//    3    8:monitorenter    
		if(a == null)
	//*   4    9:getstatic       #117 <Field ebm a>
	//*   5   12:ifnonnull       25
			a = new ebm();
	//    6   15:new             #2   <Class ebm>
	//    7   18:dup             
	//    8   19:invokespecial   #118 <Method void ebm()>
	//    9   22:putstatic       #117 <Field ebm a>
		o/ebm;
	//   10   25:ldc1            #2   <Class ebm>
		JVM INSTR monitorexit ;
	//   11   27:monitorexit     
		break MISSING_BLOCK_LABEL_37;
	//   12   28:goto            37
		Exception exception;
		exception;
	//   13   31:astore_0        
	//*  14   32:ldc1            #2   <Class ebm>
		throw exception;
	//   15   34:monitorexit     
	//   16   35:aload_0         
	//   17   36:athrow          
		return a;
	//   18   37:getstatic       #117 <Field ebm a>
	//   19   40:areturn         
	}

	private void d(LocaleList localelist)
	{
		if(android.os.Build.VERSION.SDK_INT >= 24)
	//*   0    0:getstatic       #101 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          24
	//*   2    5:icmplt          134
		{
			if(localelist.isEmpty())
	//*   3    8:aload_1         
	//*   4    9:invokevirtual   #124 <Method boolean LocaleList.isEmpty()>
	//*   5   12:ifeq            16
				return;
	//    6   15:return          
			ArrayList arraylist = new ArrayList();
	//    7   16:new             #31  <Class ArrayList>
	//    8   19:dup             
	//    9   20:invokespecial   #32  <Method void ArrayList()>
	//   10   23:astore_3        
			if(!e())
	//*  11   24:aload_0         
	//*  12   25:invokevirtual   #126 <Method boolean e()>
	//*  13   28:ifne            41
				d(localelist.get(0), ((List) (arraylist)));
	//   14   31:aload_0         
	//   15   32:aload_1         
	//   16   33:iconst_0        
	//   17   34:invokevirtual   #130 <Method Locale LocaleList.get(int)>
	//   18   37:aload_3         
	//   19   38:invokespecial   #133 <Method void d(Locale, List)>
			for(int j = 1; j < localelist.size(); j++)
	//*  20   41:iconst_1        
	//*  21   42:istore_2        
	//*  22   43:iload_2         
	//*  23   44:aload_1         
	//*  24   45:invokevirtual   #137 <Method int LocaleList.size()>
	//*  25   48:icmpge          68
				d(localelist.get(j), ((List) (arraylist)));
	//   26   51:aload_0         
	//   27   52:aload_1         
	//   28   53:iload_2         
	//   29   54:invokevirtual   #130 <Method Locale LocaleList.get(int)>
	//   30   57:aload_3         
	//   31   58:invokespecial   #133 <Method void d(Locale, List)>

	//   32   61:iload_2         
	//   33   62:iconst_1        
	//   34   63:iadd            
	//   35   64:istore_2        
	//*  36   65:goto            43
			if(((List) (arraylist)).isEmpty())
	//*  37   68:aload_3         
	//*  38   69:invokeinterface #140 <Method boolean List.isEmpty()>
	//*  39   74:ifeq            78
				return;
	//   40   77:return          
			int l = g().c(((List) (arraylist)), -1, h, k);
	//   41   78:aload_0         
	//   42   79:invokespecial   #143 <Method ebd g()>
	//   43   82:aload_3         
	//   44   83:iconst_m1       
	//   45   84:aload_0         
	//   46   85:getfield        #65  <Field ebe h>
	//   47   88:aload_0         
	//   48   89:getfield        #145 <Field ebh k>
	//   49   92:invokevirtual   #150 <Method int ebd.c(List, int, ebe, ebh)>
	//   50   95:istore_2        
			dho.b("Login_LanguageMgr", new Object[] {
				"begin download language package, uuids=", Integer.valueOf(((List) (arraylist)).size()), ", taskNo=", Integer.valueOf(l)
			});
	//   51   96:ldc1            #67  <String "Login_LanguageMgr">
	//   52   98:iconst_4        
	//   53   99:anewarray       Object[]
	//   54  102:dup             
	//   55  103:iconst_0        
	//   56  104:ldc1            #152 <String "begin download language package, uuids=">
	//   57  106:aastore         
	//   58  107:dup             
	//   59  108:iconst_1        
	//   60  109:aload_3         
	//   61  110:invokeinterface #153 <Method int List.size()>
	//   62  115:invokestatic    #106 <Method Integer Integer.valueOf(int)>
	//   63  118:aastore         
	//   64  119:dup             
	//   65  120:iconst_2        
	//   66  121:ldc1            #155 <String ", taskNo=">
	//   67  123:aastore         
	//   68  124:dup             
	//   69  125:iconst_3        
	//   70  126:iload_2         
	//   71  127:invokestatic    #106 <Method Integer Integer.valueOf(int)>
	//   72  130:aastore         
	//   73  131:invokestatic    #111 <Method void dho.b(String, Object[])>
		}
	//   74  134:return          
	}

	private void d(Locale locale, List list)
	{
		if(ebl.c(locale))
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #49  <Method boolean ebl.c(Locale)>
	//*   2    4:ifeq            8
			return;
	//    3    7:return          
		String s = ebl.b(locale);
	//    4    8:aload_1         
	//    5    9:invokestatic    #157 <Method String ebl.b(Locale)>
	//    6   12:astore_3        
		if(s == null)
	//*   7   13:aload_3         
	//*   8   14:ifnonnull       39
		{
			dho.e("Login_LanguageMgr", new Object[] {
				"locale is not language package plugin, locale=", locale.toString()
			});
	//    9   17:ldc1            #67  <String "Login_LanguageMgr">
	//   10   19:iconst_2        
	//   11   20:anewarray       Object[]
	//   12   23:dup             
	//   13   24:iconst_0        
	//   14   25:ldc1            #159 <String "locale is not language package plugin, locale=">
	//   15   27:aastore         
	//   16   28:dup             
	//   17   29:iconst_1        
	//   18   30:aload_1         
	//   19   31:invokevirtual   #84  <Method String Locale.toString()>
	//   20   34:aastore         
	//   21   35:invokestatic    #161 <Method void dho.e(String, Object[])>
			return;
	//   22   38:return          
		}
		if(g().e(s) != null)
	//*  23   39:aload_0         
	//*  24   40:invokespecial   #143 <Method ebd g()>
	//*  25   43:aload_3         
	//*  26   44:invokevirtual   #164 <Method java.io.File ebd.e(String)>
	//*  27   47:ifnull          51
		{
			return;
	//   28   50:return          
		} else
		{
			dho.b("Login_LanguageMgr", new Object[] {
				"need download language package local=", locale.toString(), ", uuid=", s
			});
	//   29   51:ldc1            #67  <String "Login_LanguageMgr">
	//   30   53:iconst_4        
	//   31   54:anewarray       Object[]
	//   32   57:dup             
	//   33   58:iconst_0        
	//   34   59:ldc1            #166 <String "need download language package local=">
	//   35   61:aastore         
	//   36   62:dup             
	//   37   63:iconst_1        
	//   38   64:aload_1         
	//   39   65:invokevirtual   #84  <Method String Locale.toString()>
	//   40   68:aastore         
	//   41   69:dup             
	//   42   70:iconst_2        
	//   43   71:ldc1            #168 <String ", uuid=">
	//   44   73:aastore         
	//   45   74:dup             
	//   46   75:iconst_3        
	//   47   76:aload_3         
	//   48   77:aastore         
	//   49   78:invokestatic    #111 <Method void dho.b(String, Object[])>
			list.add(((Object) (s)));
	//   50   81:aload_2         
	//   51   82:aload_3         
	//   52   83:invokeinterface #172 <Method boolean List.add(Object)>
	//   53   88:pop             
			return;
	//   54   89:return          
		}
	}

	private boolean e(Context context)
	{
		if(c())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #72  <Method boolean c()>
	//*   2    4:ifeq            9
			return true;
	//    3    7:iconst_1        
	//    4    8:ireturn         
		String s = ebl.b(b());
	//    5    9:aload_0         
	//    6   10:invokevirtual   #177 <Method Locale b()>
	//    7   13:invokestatic    #157 <Method String ebl.b(Locale)>
	//    8   16:astore_2        
		if(s == null)
	//*   9   17:aload_2         
	//*  10   18:ifnonnull       37
		{
			dho.e("Login_LanguageMgr", new Object[] {
				"current locale is not support language package plugin."
			});
	//   11   21:ldc1            #67  <String "Login_LanguageMgr">
	//   12   23:iconst_1        
	//   13   24:anewarray       Object[]
	//   14   27:dup             
	//   15   28:iconst_0        
	//   16   29:ldc1            #179 <String "current locale is not support language package plugin.">
	//   17   31:aastore         
	//   18   32:invokestatic    #161 <Method void dho.e(String, Object[])>
			return true;
	//   19   35:iconst_1        
	//   20   36:ireturn         
		}
		Object obj = ((Object) (g().e(s)));
	//   21   37:aload_0         
	//   22   38:invokespecial   #143 <Method ebd g()>
	//   23   41:aload_2         
	//   24   42:invokevirtual   #164 <Method java.io.File ebd.e(String)>
	//   25   45:astore_3        
		if(obj != null && ebi.e(context, ((java.io.File) (obj))))
	//*  26   46:aload_3         
	//*  27   47:ifnull          60
	//*  28   50:aload_1         
	//*  29   51:aload_3         
	//*  30   52:invokestatic    #184 <Method boolean ebi.e(Context, java.io.File)>
	//*  31   55:ifeq            60
			return true;
	//   32   58:iconst_1        
	//   33   59:ireturn         
		obj = ((Object) (g().a()));
	//   34   60:aload_0         
	//   35   61:invokespecial   #143 <Method ebd g()>
	//   36   64:invokevirtual   #186 <Method String ebd.a()>
	//   37   67:astore_3        
		return ebi.b(context, ebl.b(b(), s, ((String) (obj))));
	//   38   68:aload_1         
	//   39   69:aload_0         
	//   40   70:invokevirtual   #177 <Method Locale b()>
	//   41   73:aload_2         
	//   42   74:aload_3         
	//   43   75:invokestatic    #189 <Method String ebl.b(Locale, String, String)>
	//   44   78:invokestatic    #192 <Method boolean ebi.b(Context, String)>
	//   45   81:ifeq            86
	//   46   84:iconst_1        
	//   47   85:ireturn         
	//   48   86:iconst_0        
	//   49   87:ireturn         
	}

	private boolean e(String s)
	{
		Object obj = ((Object) (g().e(s)));
	//    0    0:aload_0         
	//    1    1:invokespecial   #143 <Method ebd g()>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #164 <Method java.io.File ebd.e(String)>
	//    4    8:astore_2        
		if(obj != null && ebi.e(BaseApplication.a(), ((java.io.File) (obj))))
	//*   5    9:aload_2         
	//*   6   10:ifnull          38
	//*   7   13:invokestatic    #198 <Method Context BaseApplication.a()>
	//*   8   16:aload_2         
	//*   9   17:invokestatic    #184 <Method boolean ebi.e(Context, java.io.File)>
	//*  10   20:ifeq            38
		{
			ebi.c(((List) (f)), ((java.io.File) (obj)));
	//   11   23:aload_0         
	//   12   24:getfield        #34  <Field ArrayList f>
	//   13   27:aload_2         
	//   14   28:invokestatic    #201 <Method boolean ebi.c(List, java.io.File)>
	//   15   31:pop             
			h();
	//   16   32:aload_0         
	//   17   33:invokespecial   #203 <Method void h()>
			return true;
	//   18   36:iconst_1        
	//   19   37:ireturn         
		}
		obj = ((Object) (g().a()));
	//   20   38:aload_0         
	//   21   39:invokespecial   #143 <Method ebd g()>
	//   22   42:invokevirtual   #186 <Method String ebd.a()>
	//   23   45:astore_2        
		s = ebl.b(b(), s, ((String) (obj)));
	//   24   46:aload_0         
	//   25   47:invokevirtual   #177 <Method Locale b()>
	//   26   50:aload_1         
	//   27   51:aload_2         
	//   28   52:invokestatic    #189 <Method String ebl.b(Locale, String, String)>
	//   29   55:astore_1        
		if(ebi.b(BaseApplication.a(), s))
	//*  30   56:invokestatic    #198 <Method Context BaseApplication.a()>
	//*  31   59:aload_1         
	//*  32   60:invokestatic    #192 <Method boolean ebi.b(Context, String)>
	//*  33   63:ifeq            81
		{
			ebi.b(((List) (f)), s);
	//   34   66:aload_0         
	//   35   67:getfield        #34  <Field ArrayList f>
	//   36   70:aload_1         
	//   37   71:invokestatic    #206 <Method boolean ebi.b(List, String)>
	//   38   74:pop             
			h();
	//   39   75:aload_0         
	//   40   76:invokespecial   #203 <Method void h()>
			return true;
	//   41   79:iconst_1        
	//   42   80:ireturn         
		} else
		{
			return false;
	//   43   81:iconst_0        
	//   44   82:ireturn         
		}
	}

	private void f()
	{
		if(c())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #72  <Method boolean c()>
	//*   2    4:ifeq            8
			return;
	//    3    7:return          
		String s = ebl.b(b());
	//    4    8:aload_0         
	//    5    9:invokevirtual   #177 <Method Locale b()>
	//    6   12:invokestatic    #157 <Method String ebl.b(Locale)>
	//    7   15:astore_1        
		if(s == null)
	//*   8   16:aload_1         
	//*   9   17:ifnonnull       40
		{
			dho.e("Login_LanguageMgr", new Object[] {
				"current locale is not support language package plugin."
			});
	//   10   20:ldc1            #67  <String "Login_LanguageMgr">
	//   11   22:iconst_1        
	//   12   23:anewarray       Object[]
	//   13   26:dup             
	//   14   27:iconst_0        
	//   15   28:ldc1            #179 <String "current locale is not support language package plugin.">
	//   16   30:aastore         
	//   17   31:invokestatic    #161 <Method void dho.e(String, Object[])>
			d = true;
	//   18   34:aload_0         
	//   19   35:iconst_1        
	//   20   36:putfield        #208 <Field boolean d>
			return;
	//   21   39:return          
		}
		d = e(s);
	//   22   40:aload_0         
	//   23   41:aload_0         
	//   24   42:aload_1         
	//   25   43:invokespecial   #210 <Method boolean e(String)>
	//   26   46:putfield        #208 <Field boolean d>
		if(!e() && k())
	//*  27   49:aload_0         
	//*  28   50:invokevirtual   #126 <Method boolean e()>
	//*  29   53:ifne            109
	//*  30   56:aload_0         
	//*  31   57:invokespecial   #212 <Method boolean k()>
	//*  32   60:ifeq            109
			dho.b("Login_LanguageMgr", new Object[] {
				"begin download current language package, uuid=", s, ", taskNo=", Integer.valueOf(g().a(s, -1, h, k))
			});
	//   33   63:ldc1            #67  <String "Login_LanguageMgr">
	//   34   65:iconst_4        
	//   35   66:anewarray       Object[]
	//   36   69:dup             
	//   37   70:iconst_0        
	//   38   71:ldc1            #214 <String "begin download current language package, uuid=">
	//   39   73:aastore         
	//   40   74:dup             
	//   41   75:iconst_1        
	//   42   76:aload_1         
	//   43   77:aastore         
	//   44   78:dup             
	//   45   79:iconst_2        
	//   46   80:ldc1            #155 <String ", taskNo=">
	//   47   82:aastore         
	//   48   83:dup             
	//   49   84:iconst_3        
	//   50   85:aload_0         
	//   51   86:invokespecial   #143 <Method ebd g()>
	//   52   89:aload_1         
	//   53   90:iconst_m1       
	//   54   91:aload_0         
	//   55   92:getfield        #65  <Field ebe h>
	//   56   95:aload_0         
	//   57   96:getfield        #145 <Field ebh k>
	//   58   99:invokevirtual   #217 <Method int ebd.a(String, int, ebe, ebh)>
	//   59  102:invokestatic    #106 <Method Integer Integer.valueOf(int)>
	//   60  105:aastore         
	//   61  106:invokestatic    #111 <Method void dho.b(String, Object[])>
	//   62  109:return          
	}

	private ebd g()
	{
		if(i == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #219 <Field ebd i>
	//*   2    4:ifnonnull       21
			i = new ebd(eap.e.a);
	//    3    7:aload_0         
	//    4    8:new             #147 <Class ebd>
	//    5   11:dup             
	//    6   12:getstatic       #60  <Field eap$e eap$e.a>
	//    7   15:invokespecial   #220 <Method void ebd(eap$e)>
	//    8   18:putfield        #219 <Field ebd i>
		return i;
	//    9   21:aload_0         
	//   10   22:getfield        #219 <Field ebd i>
	//   11   25:areturn         
	}

	private void h()
	{
		Intent intent = new Intent("com.huawei.health.action.UPDATE_LANGUAGE_READY");
	//    0    0:new             #222 <Class Intent>
	//    1    3:dup             
	//    2    4:ldc1            #224 <String "com.huawei.health.action.UPDATE_LANGUAGE_READY">
	//    3    6:invokespecial   #227 <Method void Intent(String)>
	//    4    9:astore_1        
		BaseApplication.a().sendBroadcast(intent, dac.a);
	//    5   10:invokestatic    #198 <Method Context BaseApplication.a()>
	//    6   13:aload_1         
	//    7   14:getstatic       #232 <Field String dac.a>
	//    8   17:invokevirtual   #238 <Method void Context.sendBroadcast(Intent, String)>
		dho.b("Login_LanguageMgr", new Object[] {
			"sendUpdateLanguageReadyBroadcast"
		});
	//    9   20:ldc1            #67  <String "Login_LanguageMgr">
	//   10   22:iconst_1        
	//   11   23:anewarray       Object[]
	//   12   26:dup             
	//   13   27:iconst_0        
	//   14   28:ldc1            #240 <String "sendUpdateLanguageReadyBroadcast">
	//   15   30:aastore         
	//   16   31:invokestatic    #111 <Method void dho.b(String, Object[])>
	//   17   34:return          
	}

	private boolean k()
	{
		if(!g)
	//*   0    0:aload_0         
	//*   1    1:getfield        #53  <Field boolean g>
	//*   2    4:ifne            9
			return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		if(k != null && !k.d())
	//*   5    9:aload_0         
	//*   6   10:getfield        #145 <Field ebh k>
	//*   7   13:ifnull          44
	//*   8   16:aload_0         
	//*   9   17:getfield        #145 <Field ebh k>
	//*  10   20:invokeinterface #244 <Method boolean ebh.d()>
	//*  11   25:ifne            44
		{
			dho.e("Login_LanguageMgr", new Object[] {
				"isNetworkConnected=false"
			});
	//   12   28:ldc1            #67  <String "Login_LanguageMgr">
	//   13   30:iconst_1        
	//   14   31:anewarray       Object[]
	//   15   34:dup             
	//   16   35:iconst_0        
	//   17   36:ldc1            #246 <String "isNetworkConnected=false">
	//   18   38:aastore         
	//   19   39:invokestatic    #161 <Method void dho.e(String, Object[])>
			return false;
	//   20   42:iconst_0        
	//   21   43:ireturn         
		} else
		{
			return true;
	//   22   44:iconst_1        
	//   23   45:ireturn         
		}
	}

	public Locale b()
	{
		return c;
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field Locale c>
	//    2    4:areturn         
	}

	public void b(Context context)
	{
		if(context != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          13
			f.remove(((Object) (context)));
	//    2    4:aload_0         
	//    3    5:getfield        #34  <Field ArrayList f>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #250 <Method boolean ArrayList.remove(Object)>
	//    6   12:pop             
	//    7   13:return          
	}

	public void b(ebh ebh1)
	{
		k = ebh1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #145 <Field ebh k>
	//    3    5:return          
	}

	public int c(int j, ebe ebe)
	{
		if(e())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #126 <Method boolean e()>
	//*   2    4:ifeq            9
			return 0;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		ArrayList arraylist = new ArrayList();
	//    5    9:new             #31  <Class ArrayList>
	//    6   12:dup             
	//    7   13:invokespecial   #32  <Method void ArrayList()>
	//    8   16:astore          4
		d(b(), ((List) (arraylist)));
	//    9   18:aload_0         
	//   10   19:aload_0         
	//   11   20:invokevirtual   #177 <Method Locale b()>
	//   12   23:aload           4
	//   13   25:invokespecial   #133 <Method void d(Locale, List)>
		if(((List) (arraylist)).isEmpty())
	//*  14   28:aload           4
	//*  15   30:invokeinterface #140 <Method boolean List.isEmpty()>
	//*  16   35:ifeq            54
		{
			dho.b("Login_LanguageMgr", new Object[] {
				"updateLanguagePackage uuids is empty."
			});
	//   17   38:ldc1            #67  <String "Login_LanguageMgr">
	//   18   40:iconst_1        
	//   19   41:anewarray       Object[]
	//   20   44:dup             
	//   21   45:iconst_0        
	//   22   46:ldc1            #254 <String "updateLanguagePackage uuids is empty.">
	//   23   48:aastore         
	//   24   49:invokestatic    #111 <Method void dho.b(String, Object[])>
			return 0;
	//   25   52:iconst_0        
	//   26   53:ireturn         
		}
		ebe ebe1 = ebe;
	//   27   54:aload_2         
	//   28   55:astore_3        
		if(ebe == null)
	//*  29   56:aload_2         
	//*  30   57:ifnonnull       65
			ebe1 = h;
	//   31   60:aload_0         
	//   32   61:getfield        #65  <Field ebe h>
	//   33   64:astore_3        
		return g().c(((List) (arraylist)), j, ebe1, k);
	//   34   65:aload_0         
	//   35   66:invokespecial   #143 <Method ebd g()>
	//   36   69:aload           4
	//   37   71:iload_1         
	//   38   72:aload_3         
	//   39   73:aload_0         
	//   40   74:getfield        #145 <Field ebh k>
	//   41   77:invokevirtual   #150 <Method int ebd.c(List, int, ebe, ebh)>
	//   42   80:ireturn         
	}

	public void c(boolean flag)
	{
		g = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #53  <Field boolean g>
	//    3    5:return          
	}

	public boolean c()
	{
		return b;
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field boolean b>
	//    2    4:ireturn         
	}

	public void d()
	{
		eap.e(ebl.e(g().a()));
	//    0    0:aload_0         
	//    1    1:invokespecial   #143 <Method ebd g()>
	//    2    4:invokevirtual   #186 <Method String ebd.a()>
	//    3    7:invokestatic    #258 <Method java.io.FilenameFilter ebl.e(String)>
	//    4   10:invokestatic    #263 <Method void eap.e(java.io.FilenameFilter)>
	//    5   13:return          
	}

	public void d(Context context)
	{
		if(context != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          19
		{
			e(context);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #265 <Method boolean e(Context)>
	//    5    9:pop             
			f.add(((Object) (context)));
	//    6   10:aload_0         
	//    7   11:getfield        #34  <Field ArrayList f>
	//    8   14:aload_1         
	//    9   15:invokevirtual   #266 <Method boolean ArrayList.add(Object)>
	//   10   18:pop             
		}
	//   11   19:return          
	}

	public void d(String s)
	{
		if(e())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #126 <Method boolean e()>
	//*   2    4:ifeq            8
			return;
	//    3    7:return          
		if(s == null)
	//*   4    8:aload_1         
	//*   5    9:ifnonnull       13
			return;
	//    6   12:return          
		if(!s.equals(((Object) (ebl.b(b())))))
	//*   7   13:aload_1         
	//*   8   14:aload_0         
	//*   9   15:invokevirtual   #177 <Method Locale b()>
	//*  10   18:invokestatic    #157 <Method String ebl.b(Locale)>
	//*  11   21:invokevirtual   #271 <Method boolean String.equals(Object)>
	//*  12   24:ifne            28
		{
			return;
	//   13   27:return          
		} else
		{
			d = e(s);
	//   14   28:aload_0         
	//   15   29:aload_0         
	//   16   30:aload_1         
	//   17   31:invokespecial   #210 <Method boolean e(String)>
	//   18   34:putfield        #208 <Field boolean d>
			return;
	//   19   37:return          
		}
	}

	public boolean e()
	{
		if(c())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #72  <Method boolean c()>
	//*   2    4:ifeq            9
			return true;
	//    3    7:iconst_1        
	//    4    8:ireturn         
		else
			return d;
	//    5    9:aload_0         
	//    6   10:getfield        #208 <Field boolean d>
	//    7   13:ireturn         
	}

	public void onConfigurationChanged(Configuration configuration)
	{
		if(configuration == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       20
		{
			dho.f("Login_LanguageMgr", new Object[] {
				"null == newConfig"
			});
	//    2    4:ldc1            #67  <String "Login_LanguageMgr">
	//    3    6:iconst_1        
	//    4    7:anewarray       Object[]
	//    5   10:dup             
	//    6   11:iconst_0        
	//    7   12:ldc2            #275 <String "null == newConfig">
	//    8   15:aastore         
	//    9   16:invokestatic    #277 <Method void dho.f(String, Object[])>
			return;
	//   10   19:return          
		}
		if(configuration.locale == null)
	//*  11   20:aload_1         
	//*  12   21:getfield        #282 <Field Locale Configuration.locale>
	//*  13   24:ifnonnull       43
		{
			dho.f("Login_LanguageMgr", new Object[] {
				"null == newConfig.locale"
			});
	//   14   27:ldc1            #67  <String "Login_LanguageMgr">
	//   15   29:iconst_1        
	//   16   30:anewarray       Object[]
	//   17   33:dup             
	//   18   34:iconst_0        
	//   19   35:ldc2            #284 <String "null == newConfig.locale">
	//   20   38:aastore         
	//   21   39:invokestatic    #277 <Method void dho.f(String, Object[])>
			return;
	//   22   42:return          
		}
		if(configuration.locale.equals(((Object) (c))))
	//*  23   43:aload_1         
	//*  24   44:getfield        #282 <Field Locale Configuration.locale>
	//*  25   47:aload_0         
	//*  26   48:getfield        #42  <Field Locale c>
	//*  27   51:invokevirtual   #285 <Method boolean Locale.equals(Object)>
	//*  28   54:ifeq            175
		{
			dho.b("Login_LanguageMgr", new Object[] {
				"locale not changed, isPreset=", Boolean.valueOf(c()), ", locale=", c.toString(), ", language=", ebl.a(c), ", display=", c.getDisplayLanguage()
			});
	//   29   57:ldc1            #67  <String "Login_LanguageMgr">
	//   30   59:bipush          8
	//   31   61:anewarray       Object[]
	//   32   64:dup             
	//   33   65:iconst_0        
	//   34   66:ldc2            #287 <String "locale not changed, isPreset=">
	//   35   69:aastore         
	//   36   70:dup             
	//   37   71:iconst_1        
	//   38   72:aload_0         
	//   39   73:invokevirtual   #72  <Method boolean c()>
	//   40   76:invokestatic    #78  <Method Boolean Boolean.valueOf(boolean)>
	//   41   79:aastore         
	//   42   80:dup             
	//   43   81:iconst_2        
	//   44   82:ldc1            #80  <String ", locale=">
	//   45   84:aastore         
	//   46   85:dup             
	//   47   86:iconst_3        
	//   48   87:aload_0         
	//   49   88:getfield        #42  <Field Locale c>
	//   50   91:invokevirtual   #84  <Method String Locale.toString()>
	//   51   94:aastore         
	//   52   95:dup             
	//   53   96:iconst_4        
	//   54   97:ldc1            #86  <String ", language=">
	//   55   99:aastore         
	//   56  100:dup             
	//   57  101:iconst_5        
	//   58  102:aload_0         
	//   59  103:getfield        #42  <Field Locale c>
	//   60  106:invokestatic    #89  <Method String ebl.a(Locale)>
	//   61  109:aastore         
	//   62  110:dup             
	//   63  111:bipush          6
	//   64  113:ldc1            #91  <String ", display=">
	//   65  115:aastore         
	//   66  116:dup             
	//   67  117:bipush          7
	//   68  119:aload_0         
	//   69  120:getfield        #42  <Field Locale c>
	//   70  123:invokevirtual   #94  <Method String Locale.getDisplayLanguage()>
	//   71  126:aastore         
	//   72  127:invokestatic    #111 <Method void dho.b(String, Object[])>
			if(android.os.Build.VERSION.SDK_INT >= 24)
	//*  73  130:getstatic       #101 <Field int android.os.Build$VERSION.SDK_INT>
	//*  74  133:bipush          24
	//*  75  135:icmplt          174
			{
				int j = configuration.getLocales().size();
	//   76  138:aload_1         
	//   77  139:invokevirtual   #291 <Method LocaleList Configuration.getLocales()>
	//   78  142:invokevirtual   #137 <Method int LocaleList.size()>
	//   79  145:istore_2        
				if(e != j && k())
	//*  80  146:aload_0         
	//*  81  147:getfield        #44  <Field int e>
	//*  82  150:iload_2         
	//*  83  151:icmpeq          174
	//*  84  154:aload_0         
	//*  85  155:invokespecial   #212 <Method boolean k()>
	//*  86  158:ifeq            174
				{
					d(configuration.getLocales());
	//   87  161:aload_0         
	//   88  162:aload_1         
	//   89  163:invokevirtual   #291 <Method LocaleList Configuration.getLocales()>
	//   90  166:invokespecial   #293 <Method void d(LocaleList)>
					e = j;
	//   91  169:aload_0         
	//   92  170:iload_2         
	//   93  171:putfield        #44  <Field int e>
				}
			}
			return;
	//   94  174:return          
		} else
		{
			c = configuration.locale;
	//   95  175:aload_0         
	//   96  176:aload_1         
	//   97  177:getfield        #282 <Field Locale Configuration.locale>
	//   98  180:putfield        #42  <Field Locale c>
			b = ebl.c(c);
	//   99  183:aload_0         
	//  100  184:aload_0         
	//  101  185:getfield        #42  <Field Locale c>
	//  102  188:invokestatic    #49  <Method boolean ebl.c(Locale)>
	//  103  191:putfield        #51  <Field boolean b>
			dho.b("Login_LanguageMgr", new Object[] {
				"locale changed, isPreset=", Boolean.valueOf(c()), ", locale=", c.toString(), ", language=", ebl.a(c), ", display=", c.getDisplayLanguage()
			});
	//  104  194:ldc1            #67  <String "Login_LanguageMgr">
	//  105  196:bipush          8
	//  106  198:anewarray       Object[]
	//  107  201:dup             
	//  108  202:iconst_0        
	//  109  203:ldc2            #295 <String "locale changed, isPreset=">
	//  110  206:aastore         
	//  111  207:dup             
	//  112  208:iconst_1        
	//  113  209:aload_0         
	//  114  210:invokevirtual   #72  <Method boolean c()>
	//  115  213:invokestatic    #78  <Method Boolean Boolean.valueOf(boolean)>
	//  116  216:aastore         
	//  117  217:dup             
	//  118  218:iconst_2        
	//  119  219:ldc1            #80  <String ", locale=">
	//  120  221:aastore         
	//  121  222:dup             
	//  122  223:iconst_3        
	//  123  224:aload_0         
	//  124  225:getfield        #42  <Field Locale c>
	//  125  228:invokevirtual   #84  <Method String Locale.toString()>
	//  126  231:aastore         
	//  127  232:dup             
	//  128  233:iconst_4        
	//  129  234:ldc1            #86  <String ", language=">
	//  130  236:aastore         
	//  131  237:dup             
	//  132  238:iconst_5        
	//  133  239:aload_0         
	//  134  240:getfield        #42  <Field Locale c>
	//  135  243:invokestatic    #89  <Method String ebl.a(Locale)>
	//  136  246:aastore         
	//  137  247:dup             
	//  138  248:bipush          6
	//  139  250:ldc1            #91  <String ", display=">
	//  140  252:aastore         
	//  141  253:dup             
	//  142  254:bipush          7
	//  143  256:aload_0         
	//  144  257:getfield        #42  <Field Locale c>
	//  145  260:invokevirtual   #94  <Method String Locale.getDisplayLanguage()>
	//  146  263:aastore         
	//  147  264:invokestatic    #111 <Method void dho.b(String, Object[])>
			f();
	//  148  267:aload_0         
	//  149  268:invokespecial   #113 <Method void f()>
			return;
	//  150  271:return          
		}
	}

	public void onLowMemory()
	{
	//    0    0:return          
	}

	private static volatile ebm a;
	private boolean b;
	private Locale c;
	private boolean d;
	private int e;
	private final ArrayList f = new ArrayList();
	private boolean g;
	private ebe h;
	private ebd i;
	private ebh k;
}
