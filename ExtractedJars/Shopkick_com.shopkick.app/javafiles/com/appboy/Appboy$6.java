// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy;

import bo.app.bf;
import bo.app.cc;
import com.appboy.support.AppboyLogger;
import com.appboy.support.ValidationUtils;

// Referenced classes of package com.appboy:
//			Appboy

class Appboy$6
	implements Runnable
{

	public void run()
	{
		try
		{
			if(!ValidationUtils.isValidPushStoryClickInput(a, b))
	//*   0    0:aload_0         
	//*   1    1:getfield        #22  <Field String a>
	//*   2    4:aload_0         
	//*   3    5:getfield        #24  <Field String b>
	//*   4    8:invokestatic    #37  <Method boolean ValidationUtils.isValidPushStoryClickInput(String, String)>
	//*   5   11:ifne            24
			{
				AppboyLogger.w(Appboy.b(), "Push story page click input was invalid. Not logging in-app purchase to Appboy.");
	//    6   14:invokestatic    #40  <Method String Appboy.b()>
	//    7   17:ldc1            #42  <String "Push story page click input was invalid. Not logging in-app purchase to Appboy.">
	//    8   19:invokestatic    #48  <Method int AppboyLogger.w(String, String)>
	//    9   22:pop             
				return;
	//   10   23:return          
			}
		}
	//*  11   24:aload_0         
	//*  12   25:getfield        #20  <Field Appboy c>
	//*  13   28:getfield        #52  <Field bf Appboy.g>
	//*  14   31:aload_0         
	//*  15   32:getfield        #22  <Field String a>
	//*  16   35:aload_0         
	//*  17   36:getfield        #24  <Field String b>
	//*  18   39:invokestatic    #57  <Method cc cc.b(String, String)>
	//*  19   42:invokevirtual   #62  <Method boolean bf.a(bo.app.bu)>
	//*  20   45:pop             
	//*  21   46:return          
		catch(Exception exception)
	//*  22   47:astore_1        
		{
			String s = Appboy.b();
	//   23   48:invokestatic    #40  <Method String Appboy.b()>
	//   24   51:astore_2        
			StringBuilder stringbuilder = new StringBuilder();
	//   25   52:new             #64  <Class StringBuilder>
	//   26   55:dup             
	//   27   56:invokespecial   #65  <Method void StringBuilder()>
	//   28   59:astore_3        
			stringbuilder.append("Failed to log push story page clicked for page id: ");
	//   29   60:aload_3         
	//   30   61:ldc1            #67  <String "Failed to log push story page clicked for page id: ">
	//   31   63:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
	//   32   66:pop             
			stringbuilder.append(b);
	//   33   67:aload_3         
	//   34   68:aload_0         
	//   35   69:getfield        #24  <Field String b>
	//   36   72:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
	//   37   75:pop             
			stringbuilder.append(" cid: ");
	//   38   76:aload_3         
	//   39   77:ldc1            #73  <String " cid: ">
	//   40   79:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
	//   41   82:pop             
			stringbuilder.append(a);
	//   42   83:aload_3         
	//   43   84:aload_0         
	//   44   85:getfield        #22  <Field String a>
	//   45   88:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
	//   46   91:pop             
			AppboyLogger.w(s, stringbuilder.toString(), ((Throwable) (exception)));
	//   47   92:aload_2         
	//   48   93:aload_3         
	//   49   94:invokevirtual   #76  <Method String StringBuilder.toString()>
	//   50   97:aload_1         
	//   51   98:invokestatic    #79  <Method int AppboyLogger.w(String, String, Throwable)>
	//   52  101:pop             
			Appboy.a(c, ((Throwable) (exception)));
	//   53  102:aload_0         
	//   54  103:getfield        #20  <Field Appboy c>
	//   55  106:aload_1         
	//   56  107:invokestatic    #82  <Method void Appboy.a(Appboy, Throwable)>
			return;
	//   57  110:return          
		}
		c.g.a(((bo.app.bu) (cc.b(a, b))));
		return;
	}

	final String a;
	final String b;
	final Appboy c;

	Appboy$6(Appboy appboy, String s, String s1)
	{
		c = appboy;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #20  <Field Appboy c>
		a = s;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #22  <Field String a>
		b = s1;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #24  <Field String b>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #27  <Method void Object()>
	//   11   19:return          
	}
}
