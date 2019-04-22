// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appsflyer;

import android.os.Handler;

// Referenced classes of package com.appsflyer:
//			g, AppsFlyerProperties, AFLogger

final class g$5
	implements Runnable
{

	static void _mth02CB(String s)
	{
		_fld0971 = s;
	//    0    0:aload_0         
	//    1    1:putstatic       #24  <Field String _fld0971>
		StringBuilder stringbuilder = new StringBuilder();
	//    2    4:new             #26  <Class StringBuilder>
	//    3    7:dup             
	//    4    8:invokespecial   #27  <Method void StringBuilder()>
	//    5   11:astore_2        
		for(int i = 0; i < s.length(); i++)
	//*   6   12:iconst_0        
	//*   7   13:istore_1        
	//*   8   14:iload_1         
	//*   9   15:aload_0         
	//*  10   16:invokevirtual   #33  <Method int String.length()>
	//*  11   19:icmpge          66
			if(i != 0 && i != s.length() - 1)
	//*  12   22:iload_1         
	//*  13   23:ifeq            49
	//*  14   26:iload_1         
	//*  15   27:aload_0         
	//*  16   28:invokevirtual   #33  <Method int String.length()>
	//*  17   31:iconst_1        
	//*  18   32:isub            
	//*  19   33:icmpne          39
	//*  20   36:goto            49
				stringbuilder.append("*");
	//   21   39:aload_2         
	//   22   40:ldc1            #35  <String "*">
	//   23   42:invokevirtual   #39  <Method StringBuilder StringBuilder.append(String)>
	//   24   45:pop             
			else
	//*  25   46:goto            59
				stringbuilder.append(s.charAt(i));
	//   26   49:aload_2         
	//   27   50:aload_0         
	//   28   51:iload_1         
	//   29   52:invokevirtual   #43  <Method char String.charAt(int)>
	//   30   55:invokevirtual   #46  <Method StringBuilder StringBuilder.append(char)>
	//   31   58:pop             

	//   32   59:iload_1         
	//   33   60:iconst_1        
	//   34   61:iadd            
	//   35   62:istore_1        
	//*  36   63:goto            14
		_fld02CF = ((Object) (stringbuilder)).toString();
	//   37   66:aload_2         
	//   38   67:invokevirtual   #50  <Method String Object.toString()>
	//   39   70:putstatic       #52  <Field String _fld02CF>
	//   40   73:return          
	}

	static void _mth02CE(String s)
	{
		if(_fld0971 == null)
	//*   0    0:getstatic       #24  <Field String _fld0971>
	//*   1    3:ifnonnull       17
			_mth02CB(AppsFlyerProperties.getInstance().getString("AppsFlyerKey"));
	//    2    6:invokestatic    #59  <Method AppsFlyerProperties AppsFlyerProperties.getInstance()>
	//    3    9:ldc1            #61  <String "AppsFlyerKey">
	//    4   11:invokevirtual   #65  <Method String AppsFlyerProperties.getString(String)>
	//    5   14:invokestatic    #67  <Method void _mth02CB(String)>
		String s1 = _fld0971;
	//    6   17:getstatic       #24  <Field String _fld0971>
	//    7   20:astore_1        
		if(s1 != null && s.contains(((CharSequence) (s1))))
	//*   8   21:aload_1         
	//*   9   22:ifnull          46
	//*  10   25:aload_0         
	//*  11   26:aload_1         
	//*  12   27:invokevirtual   #71  <Method boolean String.contains(CharSequence)>
	//*  13   30:ifeq            46
			AFLogger.afInfoLog(s.replace(((CharSequence) (_fld0971)), ((CharSequence) (_fld02CF))));
	//   14   33:aload_0         
	//   15   34:getstatic       #24  <Field String _fld0971>
	//   16   37:getstatic       #52  <Field String _fld02CF>
	//   17   40:invokevirtual   #75  <Method String String.replace(CharSequence, CharSequence)>
	//   18   43:invokestatic    #80  <Method void AFLogger.afInfoLog(String)>
	//   19   46:return          
	}

	public final void run()
	{
		synchronized(_fld02CB._fld02CB)
	//*   0    0:aload_0         
	//*   1    1:getfield        #21  <Field g _fld02CB>
	//*   2    4:getfield        #84  <Field Object g._fld02CB>
	//*   3    7:astore_1        
	//*   4    8:aload_1         
	//*   5    9:monitorenter    
		{
			_fld02CB._mth02CF();
	//    6   10:aload_0         
	//    7   11:getfield        #21  <Field g _fld02CB>
	//    8   14:invokevirtual   #86  <Method void g._mth02CF()>
			_fld02CB._fld02CF.postDelayed(_fld02CB._fld0971, 0x1b7740L);
	//    9   17:aload_0         
	//   10   18:getfield        #21  <Field g _fld02CB>
	//   11   21:getfield        #89  <Field Handler g._fld02CF>
	//   12   24:aload_0         
	//   13   25:getfield        #21  <Field g _fld02CB>
	//   14   28:getfield        #92  <Field Runnable g._fld0971>
	//   15   31:ldc2w           #93  <Long 0x1b7740L>
	//   16   34:invokevirtual   #100 <Method boolean Handler.postDelayed(Runnable, long)>
	//   17   37:pop             
		}
	//   18   38:aload_1         
	//   19   39:monitorexit     
	//   20   40:return          
	//   21   41:astore_2        
	//   22   42:aload_1         
	//   23   43:monitorexit     
	//   24   44:aload_2         
	//   25   45:athrow          
	}

	private static String _fld02CF;
	private static String _fld0971;
	private g _fld02CB;

	g$5()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
	//    2    4:return          
	}

	g$5(g g1)
	{
		_fld02CB = g1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #21  <Field g _fld02CB>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #17  <Method void Object()>
	//    5    9:return          
	}
}
