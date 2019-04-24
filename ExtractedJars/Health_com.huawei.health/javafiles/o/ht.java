// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import android.content.Context;
import android.text.TextUtils;

// Referenced classes of package o:
//			fn, gj

public final class ht
{

	public ht()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public static String b(Context context)
	{
		if(fn.b())
	//*   0    0:invokestatic    #16  <Method boolean fn.b()>
	//*   1    3:ifeq            9
			return "https://mobilegw.alipaydev.com/mgw.htm";
	//    2    6:ldc1            #18  <String "https://mobilegw.alipaydev.com/mgw.htm">
	//    3    8:areturn         
		if(context == null)
	//*   4    9:aload_0         
	//*   5   10:ifnonnull       17
			return gj.e;
	//    6   13:getstatic       #24  <Field String gj.e>
	//    7   16:areturn         
		String s = gj.e;
	//    8   17:getstatic       #24  <Field String gj.e>
	//    9   20:astore_1        
		context = ((Context) (s));
	//   10   21:aload_1         
	//   11   22:astore_0        
		if(TextUtils.isEmpty(((CharSequence) (s))))
	//*  12   23:aload_1         
	//*  13   24:invokestatic    #30  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  14   27:ifeq            34
			context = ((Context) (gj.e));
	//   15   30:getstatic       #24  <Field String gj.e>
	//   16   33:astore_0        
		return ((String) (context));
	//   17   34:aload_0         
	//   18   35:areturn         
	}
}
