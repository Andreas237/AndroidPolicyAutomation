// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.os;

import android.content.res.Configuration;
import java.util.Locale;

// Referenced classes of package android.support.v4.os:
//			LocaleListCompat

public final class ConfigurationCompat
{

	private ConfigurationCompat()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public static LocaleListCompat getLocales(Configuration configuration)
	{
		if(android.os.Build.VERSION.SDK_INT >= 24)
	//*   0    0:getstatic       #17  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          24
	//*   2    5:icmplt          16
			return LocaleListCompat.wrap(((Object) (configuration.getLocales())));
	//    3    8:aload_0         
	//    4    9:invokevirtual   #22  <Method android.os.LocaleList Configuration.getLocales()>
	//    5   12:invokestatic    #28  <Method LocaleListCompat LocaleListCompat.wrap(Object)>
	//    6   15:areturn         
		else
			return LocaleListCompat.create(new Locale[] {
				configuration.locale
			});
	//    7   16:iconst_1        
	//    8   17:anewarray       Locale[]
	//    9   20:dup             
	//   10   21:iconst_0        
	//   11   22:aload_0         
	//   12   23:getfield        #34  <Field Locale Configuration.locale>
	//   13   26:aastore         
	//   14   27:invokestatic    #38  <Method LocaleListCompat LocaleListCompat.create(Locale[])>
	//   15   30:areturn         
	}
}
