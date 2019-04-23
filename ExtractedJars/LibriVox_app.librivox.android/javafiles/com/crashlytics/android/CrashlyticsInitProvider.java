// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android;

import android.content.*;
import android.database.Cursor;
import android.net.Uri;
import io.a.a.a.a.b.ac;
import io.a.a.a.*;

// Referenced classes of package com.crashlytics.android:
//			c, d, a

public class CrashlyticsInitProvider extends ContentProvider
{

	public CrashlyticsInitProvider()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void ContentProvider()>
	//    2    4:return          
	}

	boolean a(Context context, ac ac1, c c1)
	{
		if(ac1.b(context))
	//*   0    0:aload_2         
	//*   1    1:aload_1         
	//*   2    2:invokevirtual   #17  <Method boolean ac.b(Context)>
	//*   3    5:ifeq            16
			return c1.a(context);
	//    4    8:aload_3         
	//    5    9:aload_1         
	//    6   10:invokeinterface #21  <Method boolean c.a(Context)>
	//    7   15:ireturn         
		else
			return ac1.d(context);
	//    8   16:aload_2         
	//    9   17:aload_1         
	//   10   18:invokevirtual   #24  <Method boolean ac.d(Context)>
	//   11   21:ireturn         
	}

	public int delete(Uri uri, String s, String as[])
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public String getType(Uri uri)
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public Uri insert(Uri uri, ContentValues contentvalues)
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public boolean onCreate()
	{
		IllegalStateException illegalstateexception;
		Context context = getContext();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #38  <Method Context getContext()>
	//    2    4:astore_1        
		if(a(context, new ac(), ((c) (new d()))))
	//*   3    5:aload_0         
	//*   4    6:aload_1         
	//*   5    7:new             #13  <Class ac>
	//*   6   10:dup             
	//*   7   11:invokespecial   #39  <Method void ac()>
	//*   8   14:new             #41  <Class d>
	//*   9   17:dup             
	//*  10   18:invokespecial   #42  <Method void d()>
	//*  11   21:invokevirtual   #44  <Method boolean a(Context, ac, c)>
	//*  12   24:ifeq            74
		{
			try
			{
				f.a(context, new q[] {
					new a()
				});
	//   13   27:aload_1         
	//   14   28:iconst_1        
	//   15   29:anewarray       q[]
	//   16   32:dup             
	//   17   33:iconst_0        
	//   18   34:new             #48  <Class a>
	//   19   37:dup             
	//   20   38:invokespecial   #49  <Method void a()>
	//   21   41:aastore         
	//   22   42:invokestatic    #54  <Method f f.a(Context, q[])>
	//   23   45:pop             
				f.g().c("CrashlyticsInitProvider", "CrashlyticsInitProvider initialization successful");
	//   24   46:invokestatic    #58  <Method t f.g()>
	//   25   49:ldc1            #60  <String "CrashlyticsInitProvider">
	//   26   51:ldc1            #62  <String "CrashlyticsInitProvider initialization successful">
	//   27   53:invokeinterface #68  <Method void t.c(String, String)>
			}
	//*  28   58:iconst_1        
	//*  29   59:ireturn         
	//*  30   60:invokestatic    #58  <Method t f.g()>
	//*  31   63:ldc1            #60  <String "CrashlyticsInitProvider">
	//*  32   65:ldc1            #70  <String "CrashlyticsInitProvider initialization unsuccessful">
	//*  33   67:invokeinterface #68  <Method void t.c(String, String)>
	//*  34   72:iconst_0        
	//*  35   73:ireturn         
	//*  36   74:invokestatic    #58  <Method t f.g()>
	//*  37   77:ldc1            #60  <String "CrashlyticsInitProvider">
	//*  38   79:ldc1            #72  <String "CrashlyticsInitProvider skipping initialization">
	//*  39   81:invokeinterface #68  <Method void t.c(String, String)>
	//*  40   86:iconst_1        
	//*  41   87:ireturn         
			// Misplaced declaration of an exception variable
			catch(IllegalStateException illegalstateexception)
			{
				f.g().c("CrashlyticsInitProvider", "CrashlyticsInitProvider initialization unsuccessful");
				return false;
			}
			return true;
		} else
		{
			f.g().c("CrashlyticsInitProvider", "CrashlyticsInitProvider skipping initialization");
			return true;
		}
	//*  42   88:astore_1        
	//*  43   89:goto            60
	}

	public Cursor query(Uri uri, String as[], String s, String as1[], String s1)
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public int update(Uri uri, ContentValues contentvalues, String s, String as[])
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}
}
