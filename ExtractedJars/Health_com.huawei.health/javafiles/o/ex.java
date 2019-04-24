// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import android.content.Context;

// Referenced classes of package o:
//			ev, ew

public final class ex
{

	public static ew c(Context context, String s)
	{
		if(context == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		else
			return ev.e(context, s);
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:invokestatic    #11  <Method ew ev.e(Context, String)>
	//    7   11:areturn         
	}
}
