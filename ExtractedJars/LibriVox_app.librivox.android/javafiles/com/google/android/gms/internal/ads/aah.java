// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

// Referenced classes of package com.google.android.gms.internal.ads:
//			aai, aaj

public final class aah
{

	public static Context a(Context context)
	{
		return b(context).a();
	//    0    0:aload_0         
	//    1    1:invokestatic    #11  <Method DynamiteModule b(Context)>
	//    2    4:invokevirtual   #16  <Method Context DynamiteModule.a()>
	//    3    7:areturn         
	}

	public static Object a(Context context, String s, aai aai1)
	{
		try
		{
			context = ((Context) (aai1.a(((Object) (b(context).a(s))))));
	//    0    0:aload_2         
	//    1    1:aload_0         
	//    2    2:invokestatic    #11  <Method DynamiteModule b(Context)>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #23  <Method android.os.IBinder DynamiteModule.a(String)>
	//    5    9:invokeinterface #28  <Method Object aai.a(Object)>
	//    6   14:astore_0        
		}
	//*   7   15:aload_0         
	//*   8   16:areturn         
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*   9   17:astore_0        
		{
			throw new aaj(((Throwable) (context)));
	//   10   18:new             #30  <Class aaj>
	//   11   21:dup             
	//   12   22:aload_0         
	//   13   23:invokespecial   #34  <Method void aaj(Throwable)>
	//   14   26:athrow          
		}
		return ((Object) (context));
	}

	private static DynamiteModule b(Context context)
	{
		try
		{
			context = ((Context) (DynamiteModule.a(context, DynamiteModule.a, "com.google.android.gms.ads.dynamite")));
	//    0    0:aload_0         
	//    1    1:getstatic       #37  <Field com.google.android.gms.dynamite.b DynamiteModule.a>
	//    2    4:ldc1            #39  <String "com.google.android.gms.ads.dynamite">
	//    3    6:invokestatic    #42  <Method DynamiteModule DynamiteModule.a(Context, com.google.android.gms.dynamite.b, String)>
	//    4    9:astore_0        
		}
	//*   5   10:aload_0         
	//*   6   11:areturn         
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*   7   12:astore_0        
		{
			throw new aaj(((Throwable) (context)));
	//    8   13:new             #30  <Class aaj>
	//    9   16:dup             
	//   10   17:aload_0         
	//   11   18:invokespecial   #34  <Method void aaj(Throwable)>
	//   12   21:athrow          
		}
		return ((DynamiteModule) (context));
	}
}
