// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.yandex.metrica;

import android.location.Location;
import com.yandex.metrica.impl.ob.ng;
import com.yandex.metrica.impl.ob.nk;
import com.yandex.metrica.impl.ob.nl;

// Referenced classes of package com.yandex.metrica:
//			YandexMetricaConfig, PreloadInfo

public static class YandexMetricaConfig$Builder
{

	static String a(YandexMetricaConfig$Builder yandexmetricaconfig$builder)
	{
		return yandexmetricaconfig$builder.b;
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field String b>
	//    2    4:areturn         
	}

	static String b(YandexMetricaConfig$Builder yandexmetricaconfig$builder)
	{
		return yandexmetricaconfig$builder.c;
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field String c>
	//    2    4:areturn         
	}

	static Integer c(YandexMetricaConfig$Builder yandexmetricaconfig$builder)
	{
		return yandexmetricaconfig$builder.d;
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field Integer d>
	//    2    4:areturn         
	}

	static Boolean d(YandexMetricaConfig$Builder yandexmetricaconfig$builder)
	{
		return yandexmetricaconfig$builder.e;
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field Boolean e>
	//    2    4:areturn         
	}

	static Boolean e(YandexMetricaConfig$Builder yandexmetricaconfig$builder)
	{
		return yandexmetricaconfig$builder.f;
	//    0    0:aload_0         
	//    1    1:getfield        #64  <Field Boolean f>
	//    2    4:areturn         
	}

	static Location f(YandexMetricaConfig$Builder yandexmetricaconfig$builder)
	{
		return yandexmetricaconfig$builder.g;
	//    0    0:aload_0         
	//    1    1:getfield        #67  <Field Location g>
	//    2    4:areturn         
	}

	static Boolean g(YandexMetricaConfig$Builder yandexmetricaconfig$builder)
	{
		return yandexmetricaconfig$builder.h;
	//    0    0:aload_0         
	//    1    1:getfield        #69  <Field Boolean h>
	//    2    4:areturn         
	}

	static Boolean h(YandexMetricaConfig$Builder yandexmetricaconfig$builder)
	{
		return yandexmetricaconfig$builder.i;
	//    0    0:aload_0         
	//    1    1:getfield        #71  <Field Boolean i>
	//    2    4:areturn         
	}

	static Boolean i(YandexMetricaConfig$Builder yandexmetricaconfig$builder)
	{
		return yandexmetricaconfig$builder.j;
	//    0    0:aload_0         
	//    1    1:getfield        #73  <Field Boolean j>
	//    2    4:areturn         
	}

	static PreloadInfo j(YandexMetricaConfig$Builder yandexmetricaconfig$builder)
	{
		return yandexmetricaconfig$builder.k;
	//    0    0:aload_0         
	//    1    1:getfield        #76  <Field PreloadInfo k>
	//    2    4:areturn         
	}

	static Boolean k(YandexMetricaConfig$Builder yandexmetricaconfig$builder)
	{
		return yandexmetricaconfig$builder.l;
	//    0    0:aload_0         
	//    1    1:getfield        #78  <Field Boolean l>
	//    2    4:areturn         
	}

	public YandexMetricaConfig build()
	{
		return new YandexMetricaConfig(this);
	//    0    0:new             #6   <Class YandexMetricaConfig>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #83  <Method void YandexMetricaConfig(YandexMetricaConfig$Builder)>
	//    4    8:areturn         
	}

	public YandexMetricaConfig$Builder handleFirstActivationAsUpdate(boolean flag)
	{
		l = Boolean.valueOf(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #92  <Method Boolean Boolean.valueOf(boolean)>
	//    3    5:putfield        #78  <Field Boolean l>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public YandexMetricaConfig$Builder withAppVersion(String s)
	{
		c = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #56  <Field String c>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public YandexMetricaConfig$Builder withCrashReporting(boolean flag)
	{
		e = Boolean.valueOf(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #92  <Method Boolean Boolean.valueOf(boolean)>
	//    3    5:putfield        #62  <Field Boolean e>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public YandexMetricaConfig$Builder withInstalledAppCollecting(boolean flag)
	{
		i = Boolean.valueOf(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #92  <Method Boolean Boolean.valueOf(boolean)>
	//    3    5:putfield        #71  <Field Boolean i>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public YandexMetricaConfig$Builder withLocation(Location location)
	{
		g = location;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #67  <Field Location g>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public YandexMetricaConfig$Builder withLocationTracking(boolean flag)
	{
		h = Boolean.valueOf(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #92  <Method Boolean Boolean.valueOf(boolean)>
	//    3    5:putfield        #69  <Field Boolean h>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public YandexMetricaConfig$Builder withLogs()
	{
		j = Boolean.valueOf(true);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:invokestatic    #92  <Method Boolean Boolean.valueOf(boolean)>
	//    3    5:putfield        #73  <Field Boolean j>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public YandexMetricaConfig$Builder withNativeCrashReporting(boolean flag)
	{
		f = Boolean.valueOf(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #92  <Method Boolean Boolean.valueOf(boolean)>
	//    3    5:putfield        #64  <Field Boolean f>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public YandexMetricaConfig$Builder withPreloadInfo(PreloadInfo preloadinfo)
	{
		k = preloadinfo;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #76  <Field PreloadInfo k>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public YandexMetricaConfig$Builder withSessionTimeout(int i1)
	{
		d = Integer.valueOf(i1);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #111 <Method Integer Integer.valueOf(int)>
	//    3    5:putfield        #59  <Field Integer d>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	private static final nk a = new ng(((nk) (new nl())));
	private final String b;
	private String c;
	private Integer d;
	private Boolean e;
	private Boolean f;
	private Location g;
	private Boolean h;
	private Boolean i;
	private Boolean j;
	private PreloadInfo k;
	private Boolean l;

	static 
	{
	//    0    0:new             #32  <Class ng>
	//    1    3:dup             
	//    2    4:new             #34  <Class nl>
	//    3    7:dup             
	//    4    8:invokespecial   #37  <Method void nl()>
	//    5   11:invokespecial   #40  <Method void ng(nk)>
	//    6   14:putstatic       #42  <Field nk a>
	//*   7   17:return          
	}

	protected YandexMetricaConfig$Builder(String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #45  <Method void Object()>
		a.a(((Object) (s)));
	//    2    4:getstatic       #42  <Field nk a>
	//    3    7:aload_1         
	//    4    8:invokeinterface #50  <Method com.yandex.metrica.impl.ob.ni nk.a(Object)>
	//    5   13:pop             
		b = s;
	//    6   14:aload_0         
	//    7   15:aload_1         
	//    8   16:putfield        #52  <Field String b>
	//    9   19:return          
	}
}
