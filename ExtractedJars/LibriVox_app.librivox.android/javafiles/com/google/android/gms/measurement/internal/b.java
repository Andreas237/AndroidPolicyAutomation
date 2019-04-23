// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import com.google.android.gms.common.util.e;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.gms.measurement.internal:
//			bu, bt, ax, q, 
//			eo, as, s, ae, 
//			ew, eu

public final class b extends bu
{

	b(ax ax)
	{
		super(ax);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #14  <Method void bu(ax)>
	//    3    5:return          
	}

	public final volatile void a()
	{
		super.a();
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void bu.a()>
	//    2    4:return          
	}

	public final boolean a(Context context)
	{
		if(c != null)
			break MISSING_BLOCK_LABEL_47;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field Boolean c>
	//    2    4:ifnonnull       47
		((bt)this).u();
	//    3    7:aload_0         
	//    4    8:invokevirtual   #29  <Method eu bt.u()>
	//    5   11:pop             
		c = Boolean.valueOf(false);
	//    6   12:aload_0         
	//    7   13:iconst_0        
	//    8   14:invokestatic    #35  <Method Boolean Boolean.valueOf(boolean)>
	//    9   17:putfield        #23  <Field Boolean c>
		context = ((Context) (context.getPackageManager()));
	//   10   20:aload_1         
	//   11   21:invokevirtual   #41  <Method PackageManager Context.getPackageManager()>
	//   12   24:astore_1        
		if(context != null)
	//*  13   25:aload_1         
	//*  14   26:ifnull          47
			try
			{
				((PackageManager) (context)).getPackageInfo("com.google.android.gms", 128);
	//   15   29:aload_1         
	//   16   30:ldc1            #43  <String "com.google.android.gms">
	//   17   32:sipush          128
	//   18   35:invokevirtual   #49  <Method android.content.pm.PackageInfo PackageManager.getPackageInfo(String, int)>
	//   19   38:pop             
				c = Boolean.valueOf(true);
	//   20   39:aload_0         
	//   21   40:iconst_1        
	//   22   41:invokestatic    #35  <Method Boolean Boolean.valueOf(boolean)>
	//   23   44:putfield        #23  <Field Boolean c>
			}
	//*  24   47:aload_0         
	//*  25   48:getfield        #23  <Field Boolean c>
	//*  26   51:invokevirtual   #53  <Method boolean Boolean.booleanValue()>
	//*  27   54:ireturn         
			// Misplaced declaration of an exception variable
			catch(Context context) { }
	//   28   55:astore_1        
		return c.booleanValue();
	//*  29   56:goto            47
	}

	public final volatile void b()
	{
		super.b();
	//    0    0:aload_0         
	//    1    1:invokespecial   #55  <Method void bu.b()>
	//    2    4:return          
	}

	public final volatile void c()
	{
		super.c();
	//    0    0:aload_0         
	//    1    1:invokespecial   #57  <Method void bu.c()>
	//    2    4:return          
	}

	public final volatile void d()
	{
		super.d();
	//    0    0:aload_0         
	//    1    1:invokespecial   #60  <Method void bu.d()>
	//    2    4:return          
	}

	protected final boolean e()
	{
		Object obj = ((Object) (Calendar.getInstance()));
	//    0    0:invokestatic    #67  <Method Calendar Calendar.getInstance()>
	//    1    3:astore_1        
		a = TimeUnit.MINUTES.convert(((Calendar) (obj)).get(15) + ((Calendar) (obj)).get(16), TimeUnit.MILLISECONDS);
	//    2    4:aload_0         
	//    3    5:getstatic       #73  <Field TimeUnit TimeUnit.MINUTES>
	//    4    8:aload_1         
	//    5    9:bipush          15
	//    6   11:invokevirtual   #77  <Method int Calendar.get(int)>
	//    7   14:aload_1         
	//    8   15:bipush          16
	//    9   17:invokevirtual   #77  <Method int Calendar.get(int)>
	//   10   20:iadd            
	//   11   21:i2l             
	//   12   22:getstatic       #80  <Field TimeUnit TimeUnit.MILLISECONDS>
	//   13   25:invokevirtual   #84  <Method long TimeUnit.convert(long, TimeUnit)>
	//   14   28:putfield        #86  <Field long a>
		Object obj1 = ((Object) (Locale.getDefault()));
	//   15   31:invokestatic    #92  <Method Locale Locale.getDefault()>
	//   16   34:astore_2        
		obj = ((Object) (((Locale) (obj1)).getLanguage().toLowerCase(Locale.ENGLISH)));
	//   17   35:aload_2         
	//   18   36:invokevirtual   #96  <Method String Locale.getLanguage()>
	//   19   39:getstatic       #100 <Field Locale Locale.ENGLISH>
	//   20   42:invokevirtual   #106 <Method String String.toLowerCase(Locale)>
	//   21   45:astore_1        
		obj1 = ((Object) (((Locale) (obj1)).getCountry().toLowerCase(Locale.ENGLISH)));
	//   22   46:aload_2         
	//   23   47:invokevirtual   #109 <Method String Locale.getCountry()>
	//   24   50:getstatic       #100 <Field Locale Locale.ENGLISH>
	//   25   53:invokevirtual   #106 <Method String String.toLowerCase(Locale)>
	//   26   56:astore_2        
		StringBuilder stringbuilder = new StringBuilder(String.valueOf(obj).length() + 1 + String.valueOf(obj1).length());
	//   27   57:new             #111 <Class StringBuilder>
	//   28   60:dup             
	//   29   61:aload_1         
	//   30   62:invokestatic    #114 <Method String String.valueOf(Object)>
	//   31   65:invokevirtual   #118 <Method int String.length()>
	//   32   68:iconst_1        
	//   33   69:iadd            
	//   34   70:aload_2         
	//   35   71:invokestatic    #114 <Method String String.valueOf(Object)>
	//   36   74:invokevirtual   #118 <Method int String.length()>
	//   37   77:iadd            
	//   38   78:invokespecial   #121 <Method void StringBuilder(int)>
	//   39   81:astore_3        
		stringbuilder.append(((String) (obj)));
	//   40   82:aload_3         
	//   41   83:aload_1         
	//   42   84:invokevirtual   #125 <Method StringBuilder StringBuilder.append(String)>
	//   43   87:pop             
		stringbuilder.append("-");
	//   44   88:aload_3         
	//   45   89:ldc1            #127 <String "-">
	//   46   91:invokevirtual   #125 <Method StringBuilder StringBuilder.append(String)>
	//   47   94:pop             
		stringbuilder.append(((String) (obj1)));
	//   48   95:aload_3         
	//   49   96:aload_2         
	//   50   97:invokevirtual   #125 <Method StringBuilder StringBuilder.append(String)>
	//   51  100:pop             
		b = stringbuilder.toString();
	//   52  101:aload_0         
	//   53  102:aload_3         
	//   54  103:invokevirtual   #130 <Method String StringBuilder.toString()>
	//   55  106:putfield        #132 <Field String b>
		return false;
	//   56  109:iconst_0        
	//   57  110:ireturn         
	}

	public final String g()
	{
		((bu)this).A();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #136 <Method void bu.A()>
		return b;
	//    2    4:aload_0         
	//    3    5:getfield        #132 <Field String b>
	//    4    8:areturn         
	}

	public final volatile b l()
	{
		return super.l();
	//    0    0:aload_0         
	//    1    1:invokespecial   #140 <Method b bu.l()>
	//    2    4:areturn         
	}

	public final volatile e m()
	{
		return super.m();
	//    0    0:aload_0         
	//    1    1:invokespecial   #144 <Method e bu.m()>
	//    2    4:areturn         
	}

	public final volatile Context n()
	{
		return super.n();
	//    0    0:aload_0         
	//    1    1:invokespecial   #148 <Method Context bu.n()>
	//    2    4:areturn         
	}

	public final volatile q o()
	{
		return super.o();
	//    0    0:aload_0         
	//    1    1:invokespecial   #152 <Method q bu.o()>
	//    2    4:areturn         
	}

	public final volatile eo p()
	{
		return super.p();
	//    0    0:aload_0         
	//    1    1:invokespecial   #156 <Method eo bu.p()>
	//    2    4:areturn         
	}

	public final volatile as q()
	{
		return super.q();
	//    0    0:aload_0         
	//    1    1:invokespecial   #160 <Method as bu.q()>
	//    2    4:areturn         
	}

	public final volatile s r()
	{
		return super.r();
	//    0    0:aload_0         
	//    1    1:invokespecial   #164 <Method s bu.r()>
	//    2    4:areturn         
	}

	public final volatile ae s()
	{
		return super.s();
	//    0    0:aload_0         
	//    1    1:invokespecial   #168 <Method ae bu.s()>
	//    2    4:areturn         
	}

	public final volatile ew t()
	{
		return super.t();
	//    0    0:aload_0         
	//    1    1:invokespecial   #172 <Method ew bu.t()>
	//    2    4:areturn         
	}

	public final long t_()
	{
		((bu)this).A();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #136 <Method void bu.A()>
		return a;
	//    2    4:aload_0         
	//    3    5:getfield        #86  <Field long a>
	//    4    8:lreturn         
	}

	public final volatile eu u()
	{
		return super.u();
	//    0    0:aload_0         
	//    1    1:invokespecial   #175 <Method eu bu.u()>
	//    2    4:areturn         
	}

	private long a;
	private String b;
	private Boolean c;
}
