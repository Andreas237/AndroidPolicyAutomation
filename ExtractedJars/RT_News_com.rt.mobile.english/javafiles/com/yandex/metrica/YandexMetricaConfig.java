// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.yandex.metrica;

import android.location.Location;
import com.yandex.metrica.impl.ad;
import com.yandex.metrica.impl.ob.ng;
import com.yandex.metrica.impl.ob.nk;
import com.yandex.metrica.impl.ob.nl;

// Referenced classes of package com.yandex.metrica:
//			PreloadInfo

public class YandexMetricaConfig
{
	public static class Builder
	{

		static String a(Builder builder)
		{
			return builder.b;
		//    0    0:aload_0         
		//    1    1:getfield        #52  <Field String b>
		//    2    4:areturn         
		}

		static String b(Builder builder)
		{
			return builder.c;
		//    0    0:aload_0         
		//    1    1:getfield        #56  <Field String c>
		//    2    4:areturn         
		}

		static Integer c(Builder builder)
		{
			return builder.d;
		//    0    0:aload_0         
		//    1    1:getfield        #59  <Field Integer d>
		//    2    4:areturn         
		}

		static Boolean d(Builder builder)
		{
			return builder.e;
		//    0    0:aload_0         
		//    1    1:getfield        #62  <Field Boolean e>
		//    2    4:areturn         
		}

		static Boolean e(Builder builder)
		{
			return builder.f;
		//    0    0:aload_0         
		//    1    1:getfield        #64  <Field Boolean f>
		//    2    4:areturn         
		}

		static Location f(Builder builder)
		{
			return builder.g;
		//    0    0:aload_0         
		//    1    1:getfield        #67  <Field Location g>
		//    2    4:areturn         
		}

		static Boolean g(Builder builder)
		{
			return builder.h;
		//    0    0:aload_0         
		//    1    1:getfield        #69  <Field Boolean h>
		//    2    4:areturn         
		}

		static Boolean h(Builder builder)
		{
			return builder.i;
		//    0    0:aload_0         
		//    1    1:getfield        #71  <Field Boolean i>
		//    2    4:areturn         
		}

		static Boolean i(Builder builder)
		{
			return builder.j;
		//    0    0:aload_0         
		//    1    1:getfield        #73  <Field Boolean j>
		//    2    4:areturn         
		}

		static PreloadInfo j(Builder builder)
		{
			return builder.k;
		//    0    0:aload_0         
		//    1    1:getfield        #76  <Field PreloadInfo k>
		//    2    4:areturn         
		}

		static Boolean k(Builder builder)
		{
			return builder.l;
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

		public Builder handleFirstActivationAsUpdate(boolean flag)
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

		public Builder withAppVersion(String s)
		{
			c = s;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #56  <Field String c>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder withCrashReporting(boolean flag)
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

		public Builder withInstalledAppCollecting(boolean flag)
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

		public Builder withLocation(Location location1)
		{
			g = location1;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #67  <Field Location g>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder withLocationTracking(boolean flag)
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

		public Builder withLogs()
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

		public Builder withNativeCrashReporting(boolean flag)
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

		public Builder withPreloadInfo(PreloadInfo preloadinfo)
		{
			k = preloadinfo;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #76  <Field PreloadInfo k>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder withSessionTimeout(int i1)
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

		protected Builder(String s)
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


	protected YandexMetricaConfig(Builder builder)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #30  <Method void Object()>
		apiKey = Builder.a(builder);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokestatic    #34  <Method String YandexMetricaConfig$Builder.a(YandexMetricaConfig$Builder)>
	//    5    9:putfield        #36  <Field String apiKey>
		appVersion = Builder.b(builder);
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:invokestatic    #39  <Method String YandexMetricaConfig$Builder.b(YandexMetricaConfig$Builder)>
	//    9   17:putfield        #41  <Field String appVersion>
		sessionTimeout = Builder.c(builder);
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:invokestatic    #45  <Method Integer YandexMetricaConfig$Builder.c(YandexMetricaConfig$Builder)>
	//   13   25:putfield        #47  <Field Integer sessionTimeout>
		crashReporting = Builder.d(builder);
	//   14   28:aload_0         
	//   15   29:aload_1         
	//   16   30:invokestatic    #51  <Method Boolean YandexMetricaConfig$Builder.d(YandexMetricaConfig$Builder)>
	//   17   33:putfield        #53  <Field Boolean crashReporting>
		nativeCrashReporting = Builder.e(builder);
	//   18   36:aload_0         
	//   19   37:aload_1         
	//   20   38:invokestatic    #56  <Method Boolean YandexMetricaConfig$Builder.e(YandexMetricaConfig$Builder)>
	//   21   41:putfield        #58  <Field Boolean nativeCrashReporting>
		location = Builder.f(builder);
	//   22   44:aload_0         
	//   23   45:aload_1         
	//   24   46:invokestatic    #62  <Method Location YandexMetricaConfig$Builder.f(YandexMetricaConfig$Builder)>
	//   25   49:putfield        #64  <Field Location location>
		locationTracking = Builder.g(builder);
	//   26   52:aload_0         
	//   27   53:aload_1         
	//   28   54:invokestatic    #67  <Method Boolean YandexMetricaConfig$Builder.g(YandexMetricaConfig$Builder)>
	//   29   57:putfield        #69  <Field Boolean locationTracking>
		installedAppCollecting = Builder.h(builder);
	//   30   60:aload_0         
	//   31   61:aload_1         
	//   32   62:invokestatic    #72  <Method Boolean YandexMetricaConfig$Builder.h(YandexMetricaConfig$Builder)>
	//   33   65:putfield        #74  <Field Boolean installedAppCollecting>
		logs = Builder.i(builder);
	//   34   68:aload_0         
	//   35   69:aload_1         
	//   36   70:invokestatic    #77  <Method Boolean YandexMetricaConfig$Builder.i(YandexMetricaConfig$Builder)>
	//   37   73:putfield        #79  <Field Boolean logs>
		preloadInfo = Builder.j(builder);
	//   38   76:aload_0         
	//   39   77:aload_1         
	//   40   78:invokestatic    #83  <Method PreloadInfo YandexMetricaConfig$Builder.j(YandexMetricaConfig$Builder)>
	//   41   81:putfield        #85  <Field PreloadInfo preloadInfo>
		firstActivationAsUpdate = Builder.k(builder);
	//   42   84:aload_0         
	//   43   85:aload_1         
	//   44   86:invokestatic    #88  <Method Boolean YandexMetricaConfig$Builder.k(YandexMetricaConfig$Builder)>
	//   45   89:putfield        #90  <Field Boolean firstActivationAsUpdate>
	//   46   92:return          
	}

	protected YandexMetricaConfig(YandexMetricaConfig yandexmetricaconfig)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #30  <Method void Object()>
		apiKey = yandexmetricaconfig.apiKey;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:getfield        #36  <Field String apiKey>
	//    5    9:putfield        #36  <Field String apiKey>
		appVersion = yandexmetricaconfig.appVersion;
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:getfield        #41  <Field String appVersion>
	//    9   17:putfield        #41  <Field String appVersion>
		sessionTimeout = yandexmetricaconfig.sessionTimeout;
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:getfield        #47  <Field Integer sessionTimeout>
	//   13   25:putfield        #47  <Field Integer sessionTimeout>
		crashReporting = yandexmetricaconfig.crashReporting;
	//   14   28:aload_0         
	//   15   29:aload_1         
	//   16   30:getfield        #53  <Field Boolean crashReporting>
	//   17   33:putfield        #53  <Field Boolean crashReporting>
		nativeCrashReporting = yandexmetricaconfig.nativeCrashReporting;
	//   18   36:aload_0         
	//   19   37:aload_1         
	//   20   38:getfield        #58  <Field Boolean nativeCrashReporting>
	//   21   41:putfield        #58  <Field Boolean nativeCrashReporting>
		location = yandexmetricaconfig.location;
	//   22   44:aload_0         
	//   23   45:aload_1         
	//   24   46:getfield        #64  <Field Location location>
	//   25   49:putfield        #64  <Field Location location>
		locationTracking = yandexmetricaconfig.locationTracking;
	//   26   52:aload_0         
	//   27   53:aload_1         
	//   28   54:getfield        #69  <Field Boolean locationTracking>
	//   29   57:putfield        #69  <Field Boolean locationTracking>
		installedAppCollecting = yandexmetricaconfig.installedAppCollecting;
	//   30   60:aload_0         
	//   31   61:aload_1         
	//   32   62:getfield        #74  <Field Boolean installedAppCollecting>
	//   33   65:putfield        #74  <Field Boolean installedAppCollecting>
		logs = yandexmetricaconfig.logs;
	//   34   68:aload_0         
	//   35   69:aload_1         
	//   36   70:getfield        #79  <Field Boolean logs>
	//   37   73:putfield        #79  <Field Boolean logs>
		preloadInfo = yandexmetricaconfig.preloadInfo;
	//   38   76:aload_0         
	//   39   77:aload_1         
	//   40   78:getfield        #85  <Field PreloadInfo preloadInfo>
	//   41   81:putfield        #85  <Field PreloadInfo preloadInfo>
		firstActivationAsUpdate = yandexmetricaconfig.firstActivationAsUpdate;
	//   42   84:aload_0         
	//   43   85:aload_1         
	//   44   86:getfield        #90  <Field Boolean firstActivationAsUpdate>
	//   45   89:putfield        #90  <Field Boolean firstActivationAsUpdate>
	//   46   92:return          
	}

	public static YandexMetricaConfig fromJson(String s)
	{
		return (new ad()).a(s);
	//    0    0:new             #97  <Class ad>
	//    1    3:dup             
	//    2    4:invokespecial   #98  <Method void ad()>
	//    3    7:aload_0         
	//    4    8:invokevirtual   #100 <Method YandexMetricaConfig ad.a(String)>
	//    5   11:areturn         
	}

	public static Builder newConfigBuilder(String s)
	{
		return new Builder(s);
	//    0    0:new             #6   <Class YandexMetricaConfig$Builder>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #105 <Method void YandexMetricaConfig$Builder(String)>
	//    4    8:areturn         
	}

	public String toJson()
	{
		return (new ad()).a(this);
	//    0    0:new             #97  <Class ad>
	//    1    3:dup             
	//    2    4:invokespecial   #98  <Method void ad()>
	//    3    7:aload_0         
	//    4    8:invokevirtual   #111 <Method String ad.a(YandexMetricaConfig)>
	//    5   11:areturn         
	}

	public final String apiKey;
	public final String appVersion;
	public final Boolean crashReporting;
	public final Boolean firstActivationAsUpdate;
	public final Boolean installedAppCollecting;
	public final Location location;
	public final Boolean locationTracking;
	public final Boolean logs;
	public final Boolean nativeCrashReporting;
	public final PreloadInfo preloadInfo;
	public final Integer sessionTimeout;
}
