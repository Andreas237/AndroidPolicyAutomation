// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.flags.impl;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import com.google.android.gms.c.a;
import com.google.android.gms.c.d;
import com.google.android.gms.flags.b;

// Referenced classes of package com.google.android.gms.flags.impl:
//			b, d, f, h, 
//			j

public class FlagProviderImpl extends b
{

	public FlagProviderImpl()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void b()>
		a = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #15  <Field boolean a>
	//    5    9:return          
	}

	public boolean getBooleanFlagValue(String s, boolean flag, int i)
	{
		if(!a)
	//*   0    0:aload_0         
	//*   1    1:getfield        #15  <Field boolean a>
	//*   2    4:ifne            9
			return flag;
	//    3    7:iload_2         
	//    4    8:ireturn         
		else
			return com.google.android.gms.flags.impl.b.a(b, s, Boolean.valueOf(flag)).booleanValue();
	//    5    9:aload_0         
	//    6   10:getfield        #20  <Field SharedPreferences b>
	//    7   13:aload_1         
	//    8   14:iload_2         
	//    9   15:invokestatic    #26  <Method Boolean Boolean.valueOf(boolean)>
	//   10   18:invokestatic    #31  <Method Boolean com.google.android.gms.flags.impl.b.a(SharedPreferences, String, Boolean)>
	//   11   21:invokevirtual   #35  <Method boolean Boolean.booleanValue()>
	//   12   24:ireturn         
	}

	public int getIntFlagValue(String s, int i, int k)
	{
		if(!a)
	//*   0    0:aload_0         
	//*   1    1:getfield        #15  <Field boolean a>
	//*   2    4:ifne            9
			return i;
	//    3    7:iload_2         
	//    4    8:ireturn         
		else
			return com.google.android.gms.flags.impl.d.a(b, s, Integer.valueOf(i)).intValue();
	//    5    9:aload_0         
	//    6   10:getfield        #20  <Field SharedPreferences b>
	//    7   13:aload_1         
	//    8   14:iload_2         
	//    9   15:invokestatic    #42  <Method Integer Integer.valueOf(int)>
	//   10   18:invokestatic    #47  <Method Integer com.google.android.gms.flags.impl.d.a(SharedPreferences, String, Integer)>
	//   11   21:invokevirtual   #51  <Method int Integer.intValue()>
	//   12   24:ireturn         
	}

	public long getLongFlagValue(String s, long l, int i)
	{
		if(!a)
	//*   0    0:aload_0         
	//*   1    1:getfield        #15  <Field boolean a>
	//*   2    4:ifne            9
			return l;
	//    3    7:lload_2         
	//    4    8:lreturn         
		else
			return com.google.android.gms.flags.impl.f.a(b, s, Long.valueOf(l)).longValue();
	//    5    9:aload_0         
	//    6   10:getfield        #20  <Field SharedPreferences b>
	//    7   13:aload_1         
	//    8   14:lload_2         
	//    9   15:invokestatic    #58  <Method Long Long.valueOf(long)>
	//   10   18:invokestatic    #63  <Method Long com.google.android.gms.flags.impl.f.a(SharedPreferences, String, Long)>
	//   11   21:invokevirtual   #67  <Method long Long.longValue()>
	//   12   24:lreturn         
	}

	public String getStringFlagValue(String s, String s1, int i)
	{
		if(!a)
	//*   0    0:aload_0         
	//*   1    1:getfield        #15  <Field boolean a>
	//*   2    4:ifne            9
			return s1;
	//    3    7:aload_2         
	//    4    8:areturn         
		else
			return com.google.android.gms.flags.impl.h.a(b, s, s1);
	//    5    9:aload_0         
	//    6   10:getfield        #20  <Field SharedPreferences b>
	//    7   13:aload_1         
	//    8   14:aload_2         
	//    9   15:invokestatic    #74  <Method String com.google.android.gms.flags.impl.h.a(SharedPreferences, String, String)>
	//   10   18:areturn         
	}

	public void init(a a1)
	{
		a1 = ((a) ((Context)d.a(a1)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #85  <Method Object d.a(a)>
	//    2    4:checkcast       #87  <Class Context>
	//    3    7:astore_1        
		if(a)
	//*   4    8:aload_0         
	//*   5    9:getfield        #15  <Field boolean a>
	//*   6   12:ifeq            16
			return;
	//    7   15:return          
		try
		{
			b = com.google.android.gms.flags.impl.j.a(((Context) (a1)).createPackageContext("com.google.android.gms", 0));
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:ldc1            #89  <String "com.google.android.gms">
	//   11   20:iconst_0        
	//   12   21:invokevirtual   #93  <Method Context Context.createPackageContext(String, int)>
	//   13   24:invokestatic    #98  <Method SharedPreferences com.google.android.gms.flags.impl.j.a(Context)>
	//   14   27:putfield        #20  <Field SharedPreferences b>
			a = true;
	//   15   30:aload_0         
	//   16   31:iconst_1        
	//   17   32:putfield        #15  <Field boolean a>
			return;
	//   18   35:return          
		}
	//*  19   36:astore_1        
	//*  20   37:aload_1         
	//*  21   38:invokevirtual   #102 <Method String Exception.getMessage()>
	//*  22   41:invokestatic    #107 <Method String String.valueOf(Object)>
	//*  23   44:astore_1        
	//*  24   45:aload_1         
	//*  25   46:invokevirtual   #110 <Method int String.length()>
	//*  26   49:ifeq            62
	//*  27   52:ldc1            #112 <String "Could not retrieve sdk flags, continuing with defaults: ">
	//*  28   54:aload_1         
	//*  29   55:invokevirtual   #116 <Method String String.concat(String)>
	//*  30   58:astore_1        
	//*  31   59:goto            72
	//*  32   62:new             #104 <Class String>
	//*  33   65:dup             
	//*  34   66:ldc1            #112 <String "Could not retrieve sdk flags, continuing with defaults: ">
	//*  35   68:invokespecial   #119 <Method void String(String)>
	//*  36   71:astore_1        
	//*  37   72:ldc1            #121 <String "FlagProviderImpl">
	//*  38   74:aload_1         
	//*  39   75:invokestatic    #127 <Method int Log.w(String, String)>
	//*  40   78:pop             
	//*  41   79:return          
		// Misplaced declaration of an exception variable
		catch(a a1)
	//*  42   80:astore_1        
		{
			return;
	//   43   81:return          
		}
		// Misplaced declaration of an exception variable
		catch(a a1)
		{
			a1 = ((a) (String.valueOf(((Object) (((Exception) (a1)).getMessage())))));
		}
		if(((String) (a1)).length() != 0)
			a1 = ((a) ("Could not retrieve sdk flags, continuing with defaults: ".concat(((String) (a1)))));
		else
			a1 = ((a) (new String("Could not retrieve sdk flags, continuing with defaults: ")));
		Log.w("FlagProviderImpl", ((String) (a1)));
	}

	private boolean a;
	private SharedPreferences b;
}
