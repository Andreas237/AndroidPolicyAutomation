// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;

public class cwx
{

	public cwx(Context context)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
		a = context.getPackageManager();
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #17  <Method PackageManager Context.getPackageManager()>
	//    5    9:putfield        #19  <Field PackageManager a>
	//    6   12:return          
	}

	public int c(String s)
	{
		int i;
		try
		{
			s = ((String) (a.getPackageInfo(s, 16)));
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field PackageManager a>
	//    2    4:aload_1         
	//    3    5:bipush          16
	//    4    7:invokevirtual   #30  <Method PackageInfo PackageManager.getPackageInfo(String, int)>
	//    5   10:astore_1        
		}
	//*   6   11:aload_1         
	//*   7   12:ifnull          22
	//*   8   15:aload_1         
	//*   9   16:getfield        #36  <Field int PackageInfo.versionCode>
	//*  10   19:istore_2        
	//*  11   20:iload_2         
	//*  12   21:ireturn         
	//*  13   22:iconst_0        
	//*  14   23:ireturn         
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  15   24:astore_1        
		{
			return 0;
	//   16   25:iconst_0        
	//   17   26:ireturn         
		}
		if(s == null)
			break MISSING_BLOCK_LABEL_22;
		i = ((PackageInfo) (s)).versionCode;
		return i;
		return 0;
	}

	private final PackageManager a;
}
