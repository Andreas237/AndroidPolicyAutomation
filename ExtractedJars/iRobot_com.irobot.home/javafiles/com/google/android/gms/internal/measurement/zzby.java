// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.measurement;

import android.util.Log;
import com.google.android.gms.analytics.Logger;

// Referenced classes of package com.google.android.gms.internal.measurement:
//			zzcf, zzcg

final class zzby
	implements Logger
{

	zzby()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
		zzyn = 2;
	//    2    4:aload_0         
	//    3    5:iconst_2        
	//    4    6:putfield        #16  <Field int zzyn>
	//    5    9:return          
	}

	public final void error(Exception exception)
	{
	//    0    0:return          
	}

	public final void error(String s)
	{
	//    0    0:return          
	}

	public final int getLogLevel()
	{
		return zzyn;
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field int zzyn>
	//    2    4:ireturn         
	}

	public final void info(String s)
	{
	//    0    0:return          
	}

	public final void setLogLevel(int i)
	{
		zzyn = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #16  <Field int zzyn>
		if(!zzrr)
	//*   3    5:aload_0         
	//*   4    6:getfield        #27  <Field boolean zzrr>
	//*   5    9:ifne            89
		{
			String s = (String)zzcf.zzyx.get();
	//    6   12:getstatic       #33  <Field zzcg zzcf.zzyx>
	//    7   15:invokevirtual   #39  <Method Object zzcg.get()>
	//    8   18:checkcast       #41  <Class String>
	//    9   21:astore_2        
			String s1 = (String)zzcf.zzyx.get();
	//   10   22:getstatic       #33  <Field zzcg zzcf.zzyx>
	//   11   25:invokevirtual   #39  <Method Object zzcg.get()>
	//   12   28:checkcast       #41  <Class String>
	//   13   31:astore_3        
			StringBuilder stringbuilder = new StringBuilder(String.valueOf(((Object) (s1))).length() + 91);
	//   14   32:new             #43  <Class StringBuilder>
	//   15   35:dup             
	//   16   36:aload_3         
	//   17   37:invokestatic    #47  <Method String String.valueOf(Object)>
	//   18   40:invokevirtual   #50  <Method int String.length()>
	//   19   43:bipush          91
	//   20   45:iadd            
	//   21   46:invokespecial   #52  <Method void StringBuilder(int)>
	//   22   49:astore          4
			stringbuilder.append("Logger is deprecated. To enable debug logging, please run:\nadb shell setprop log.tag.");
	//   23   51:aload           4
	//   24   53:ldc1            #54  <String "Logger is deprecated. To enable debug logging, please run:\nadb shell setprop log.tag.">
	//   25   55:invokevirtual   #58  <Method StringBuilder StringBuilder.append(String)>
	//   26   58:pop             
			stringbuilder.append(s1);
	//   27   59:aload           4
	//   28   61:aload_3         
	//   29   62:invokevirtual   #58  <Method StringBuilder StringBuilder.append(String)>
	//   30   65:pop             
			stringbuilder.append(" DEBUG");
	//   31   66:aload           4
	//   32   68:ldc1            #60  <String " DEBUG">
	//   33   70:invokevirtual   #58  <Method StringBuilder StringBuilder.append(String)>
	//   34   73:pop             
			Log.i(s, stringbuilder.toString());
	//   35   74:aload_2         
	//   36   75:aload           4
	//   37   77:invokevirtual   #64  <Method String StringBuilder.toString()>
	//   38   80:invokestatic    #70  <Method int Log.i(String, String)>
	//   39   83:pop             
			zzrr = true;
	//   40   84:aload_0         
	//   41   85:iconst_1        
	//   42   86:putfield        #27  <Field boolean zzrr>
		}
	//   43   89:return          
	}

	public final void verbose(String s)
	{
	//    0    0:return          
	}

	public final void warn(String s)
	{
	//    0    0:return          
	}

	private boolean zzrr;
	private int zzyn;
}
