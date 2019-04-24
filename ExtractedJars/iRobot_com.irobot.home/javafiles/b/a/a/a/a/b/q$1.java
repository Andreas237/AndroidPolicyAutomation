// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package b.a.a.a.a.b;

import android.content.Context;
import android.content.pm.PackageManager;
import b.a.a.a.a.a.d;

// Referenced classes of package b.a.a.a.a.b:
//			q

class q$1
	implements d
{

	public String a(Context context)
	{
		String s = context.getPackageManager().getInstallerPackageName(context.getPackageName());
	//    0    0:aload_1         
	//    1    1:invokevirtual   #26  <Method PackageManager Context.getPackageManager()>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #30  <Method String Context.getPackageName()>
	//    4    8:invokevirtual   #36  <Method String PackageManager.getInstallerPackageName(String)>
	//    5   11:astore_2        
		context = ((Context) (s));
	//    6   12:aload_2         
	//    7   13:astore_1        
		if(s == null)
	//*   8   14:aload_2         
	//*   9   15:ifnonnull       21
			context = "";
	//   10   18:ldc1            #38  <String "">
	//   11   20:astore_1        
		return ((String) (context));
	//   12   21:aload_1         
	//   13   22:areturn         
	}

	public Object load(Context context)
	{
		return ((Object) (a(context)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #42  <Method String a(Context)>
	//    3    5:areturn         
	}

	final q a;

	q$1(q q1)
	{
		a = q1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field q a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #18  <Method void Object()>
	//    5    9:return          
	}
}
