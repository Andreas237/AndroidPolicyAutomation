// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;

import java.io.File;

// Referenced classes of package com.amap.api.mapcore.util:
//			kh, hm

public class kd extends kh
{

	public kd(int i, String s, kh kh1)
	{
		super(kh1);
	//    0    0:aload_0         
	//    1    1:aload_3         
	//    2    2:invokespecial   #13  <Method void kh(kh)>
		b = i;
	//    3    5:aload_0         
	//    4    6:iload_1         
	//    5    7:putfield        #15  <Field int b>
		c = s;
	//    6   10:aload_0         
	//    7   11:aload_2         
	//    8   12:putfield        #17  <Field String c>
	//    9   15:return          
	}

	public int a(String s)
	{
		int i;
		boolean flag;
		try
		{
			s = ((String) (new File(s)));
	//    0    0:new             #24  <Class File>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #27  <Method void File(String)>
	//    4    8:astore_1        
			flag = ((File) (s)).exists();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #31  <Method boolean File.exists()>
	//    7   13:istore_3        
		}
	//*   8   14:iload_3         
	//*   9   15:ifne            20
	//*  10   18:iconst_0        
	//*  11   19:ireturn         
	//*  12   20:aload_1         
	//*  13   21:invokevirtual   #35  <Method String[] File.list()>
	//*  14   24:arraylength     
	//*  15   25:istore_2        
	//*  16   26:iload_2         
	//*  17   27:ireturn         
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  18   28:astore_1        
		{
			hm.c(((Throwable) (s)), "fus", "gfn");
	//   19   29:aload_1         
	//   20   30:ldc1            #37  <String "fus">
	//   21   32:ldc1            #39  <String "gfn">
	//   22   34:invokestatic    #44  <Method void hm.c(Throwable, String, String)>
			return 0;
	//   23   37:iconst_0        
	//   24   38:ireturn         
		}
		if(!flag)
			return 0;
		i = ((File) (s)).list().length;
		return i;
	}

	protected boolean a()
	{
		return a(c) >= b;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #17  <Field String c>
	//    3    5:invokevirtual   #46  <Method int a(String)>
	//    4    8:aload_0         
	//    5    9:getfield        #15  <Field int b>
	//    6   12:icmpge          17
	//    7   15:iconst_0        
	//    8   16:ireturn         
	//    9   17:iconst_1        
	//   10   18:ireturn         
	}

	private int b;
	private String c;
}
