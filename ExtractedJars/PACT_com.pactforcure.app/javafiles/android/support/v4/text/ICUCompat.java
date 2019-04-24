// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.text;

import java.util.Locale;

// Referenced classes of package android.support.v4.text:
//			ICUCompatApi21, ICUCompatIcs

public final class ICUCompat
{
	static class ICUCompatApi21Impl extends ICUCompatBaseImpl
	{

		public String maximizeAndGetScript(Locale locale)
		{
			return ICUCompatApi21.maximizeAndGetScript(locale);
		//    0    0:aload_1         
		//    1    1:invokestatic    #21  <Method String ICUCompatApi21.maximizeAndGetScript(Locale)>
		//    2    4:areturn         
		}

		ICUCompatApi21Impl()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #14  <Method void ICUCompat$ICUCompatBaseImpl()>
		//    2    4:return          
		}
	}

	static class ICUCompatBaseImpl
	{

		public String maximizeAndGetScript(Locale locale)
		{
			return ICUCompatIcs.maximizeAndGetScript(locale);
		//    0    0:aload_1         
		//    1    1:invokestatic    #18  <Method String ICUCompatIcs.maximizeAndGetScript(Locale)>
		//    2    4:areturn         
		}

		ICUCompatBaseImpl()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #11  <Method void Object()>
		//    2    4:return          
		}
	}


	private ICUCompat()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #28  <Method void Object()>
	//    2    4:return          
	}

	public static String maximizeAndGetScript(Locale locale)
	{
		return IMPL.maximizeAndGetScript(locale);
	//    0    0:getstatic       #25  <Field ICUCompat$ICUCompatBaseImpl IMPL>
	//    1    3:aload_0         
	//    2    4:invokevirtual   #33  <Method String ICUCompat$ICUCompatBaseImpl.maximizeAndGetScript(Locale)>
	//    3    7:areturn         
	}

	private static final ICUCompatBaseImpl IMPL;

	static 
	{
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:getstatic       #20  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          19
			IMPL = ((ICUCompatBaseImpl) (new ICUCompatApi21Impl()));
	//    3    8:new             #6   <Class ICUCompat$ICUCompatApi21Impl>
	//    4   11:dup             
	//    5   12:invokespecial   #23  <Method void ICUCompat$ICUCompatApi21Impl()>
	//    6   15:putstatic       #25  <Field ICUCompat$ICUCompatBaseImpl IMPL>
	//    7   18:return          
		else
			IMPL = new ICUCompatBaseImpl();
	//    8   19:new             #9   <Class ICUCompat$ICUCompatBaseImpl>
	//    9   22:dup             
	//   10   23:invokespecial   #26  <Method void ICUCompat$ICUCompatBaseImpl()>
	//   11   26:putstatic       #25  <Field ICUCompat$ICUCompatBaseImpl IMPL>
	//*  12   29:return          
	}
}
