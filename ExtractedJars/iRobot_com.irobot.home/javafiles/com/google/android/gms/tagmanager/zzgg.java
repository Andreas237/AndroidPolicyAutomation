// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.tagmanager;

import com.google.android.gms.analytics.Logger;

// Referenced classes of package com.google.android.gms.tagmanager:
//			zzdi

final class zzgg
	implements Logger
{

	zzgg()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void Object()>
	//    2    4:return          
	}

	public final void error(Exception exception)
	{
		zzdi.zza("", ((Throwable) (exception)));
	//    0    0:ldc1            #15  <String "">
	//    1    2:aload_1         
	//    2    3:invokestatic    #21  <Method void zzdi.zza(String, Throwable)>
	//    3    6:return          
	}

	public final void error(String s)
	{
		zzdi.e(s);
	//    0    0:aload_1         
	//    1    1:invokestatic    #25  <Method void zzdi.e(String)>
	//    2    4:return          
	}

	public final int getLogLevel()
	{
		switch(zzdi.zzyn)
	//*   0    0:getstatic       #31  <Field int zzdi.zzyn>
		{
	//*   1    3:tableswitch     2 6: default 36
	//	               2 42
	//	               3 40
	//	               4 40
	//	               5 38
	//	               6 36
		case 6: // '\006'
		default:
			return 3;
	//    2   36:iconst_3        
	//    3   37:ireturn         

		case 5: // '\005'
			return 2;
	//    4   38:iconst_2        
	//    5   39:ireturn         

		case 3: // '\003'
		case 4: // '\004'
			return 1;
	//    6   40:iconst_1        
	//    7   41:ireturn         

		case 2: // '\002'
			return 0;
	//    8   42:iconst_0        
	//    9   43:ireturn         
		}
	}

	public final void info(String s)
	{
		zzdi.zzdm(s);
	//    0    0:aload_1         
	//    1    1:invokestatic    #35  <Method void zzdi.zzdm(String)>
	//    2    4:return          
	}

	public final void setLogLevel(int i)
	{
		zzdi.zzab("GA uses GTM logger. Please use TagManager.setLogLevel(int) instead.");
	//    0    0:ldc1            #39  <String "GA uses GTM logger. Please use TagManager.setLogLevel(int) instead.">
	//    1    2:invokestatic    #42  <Method void zzdi.zzab(String)>
	//    2    5:return          
	}

	public final void verbose(String s)
	{
		zzdi.v(s);
	//    0    0:aload_1         
	//    1    1:invokestatic    #46  <Method void zzdi.v(String)>
	//    2    4:return          
	}

	public final void warn(String s)
	{
		zzdi.zzab(s);
	//    0    0:aload_1         
	//    1    1:invokestatic    #42  <Method void zzdi.zzab(String)>
	//    2    4:return          
	}
}
