// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.startapp.android.publish.adsCommon;

import android.content.pm.PackageInfo;
import java.util.Comparator;

// Referenced classes of package com.startapp.android.publish.adsCommon:
//			l

static final class l$4
	implements Comparator
{

	public int a(PackageInfo packageinfo, PackageInfo packageinfo1)
	{
		long l1 = packageinfo.firstInstallTime;
	//    0    0:aload_1         
	//    1    1:getfield        #28  <Field long PackageInfo.firstInstallTime>
	//    2    4:lstore_3        
		long l2 = packageinfo1.firstInstallTime;
	//    3    5:aload_2         
	//    4    6:getfield        #28  <Field long PackageInfo.firstInstallTime>
	//    5    9:lstore          5
		if(l1 > l2)
	//*   6   11:lload_3         
	//*   7   12:lload           5
	//*   8   14:lcmp            
	//*   9   15:ifle            20
			return -1;
	//   10   18:iconst_m1       
	//   11   19:ireturn         
		return l1 != l2 ? 1 : 0;
	//   12   20:lload_3         
	//   13   21:lload           5
	//   14   23:lcmp            
	//   15   24:ifne            29
	//   16   27:iconst_0        
	//   17   28:ireturn         
	//   18   29:iconst_1        
	//   19   30:ireturn         
	}

	public int compare(Object obj, Object obj1)
	{
		return a((PackageInfo)obj, (PackageInfo)obj1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #24  <Class PackageInfo>
	//    3    5:aload_2         
	//    4    6:checkcast       #24  <Class PackageInfo>
	//    5    9:invokevirtual   #33  <Method int a(PackageInfo, PackageInfo)>
	//    6   12:ireturn         
	}

	l$4()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
	//    2    4:return          
	}
}
